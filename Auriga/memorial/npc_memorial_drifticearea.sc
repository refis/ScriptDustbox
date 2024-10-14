//==============================================================================
// Drift Ice Area Memorial Dungeon Script
//==============================================================================
1@twsd.gat,0,0,0	script	Twsd_Control	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@map$,getmdmapname("1@twsd.gat");
	monster '@map$,317,78,"進入不可#317_78",3982,1;
	monster '@map$,316,65,"進入不可#317_78",3982,1;
	monster '@map$,313,65,"進入不可#317_78",3982,1;
	monster '@map$,321,78,"進入不可#317_78",3982,1;
	areasetcell '@map$,312,64,317,66,1;
	areasetcell '@map$,316,77,322,79,1;
	end;
}

1@twsd.gat,319,77,3	script	入場管理#jorchs	10046,{
	set '@accept,2;
	mes "^FF0000[インフォメーション]^000000";
	mes "^FF0000この先へは^000000";
	mes "^FF0000メモリアルダンジョンの^000000";
	mes "^FF0000入場条件を満たした^000000";
	mes "^FF0000異なるゲームアカウントの^000000";
	mes "^FF0000キャラクターが"+'@accept+"人まで、^000000";
	mes "^FF0000一緒に進むことができます。^000000";
	next;
	set '@user,getarraysize(.user_id);
	mes "[インフォメーション]";
	mes "進入しますか？";
	mes "　";
	mes "^4A0084‐進入キャラクター数： "+'@user+" / "+'@accept+"‐^000000";
	next;
	if(select("^0000ffはい^000000","いいえ") == 2) {
		mes "‐やめた‐";
		close;
	}
	mes "[インフォメーション]";
	mes "進入します。";
	close2;
	for('@i=0; '@i<'@user; '@i++) {
		if(.user_id['@i] == 0)
			break;
		if(.user_id['@i] == getcharid(3)) {	// 入場済みアカウント
			if(.char_id['@i] != getcharid(0)) {	// 別キャラはNG
				// 未調査
				mes "[インフォメーション]";
				mes "同じアカウントに入場済みキャラクターが存在します。";
				close;
			}
			break;
		}
	}
	if('@i == '@accept) {	// 入場上限
		// 未調査
		mes "[インフォメーション]";
		mes "これ以上入場することはできません。";
		close;
	}
	else if('@i == '@user) {	// 未登録
		set .user_id['@i],getcharid(3);
		set .char_id['@i],getcharid(0);
	}
	warp getmdmapname("1@twsd.gat"), 321, 83;
	end;
}

1@twsd.gat,321,84,0	script	#20msn00	139,5,5,{
	unittalk getnpcid(0,"ルガン主教#20msd00"),"ルガン主教 : む……！　人間の気配がしないか？",1;
	unittalk getcharid(3),strcharinfo(0)+" : まずい、ルガンに変身しないと……！",1;
	misceffect 595,"";
	sc_end EFST_MONSTER_TRANSFORM;
	sc_start3 EFST_MONSTER_TRANSFORM,21530,0,0,0,180000,1;
	end;
}

1@twsd.gat,314,94,5	script	ルガン主教#20msd00	10474,{
	misceffect 595,"";
	sc_end SC_MONSTER_TRANSFORM;
	sc_start3 SC_MONSTER_TRANSFORM,21530,0,0,0,180000,1;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : パーティーリーダーに任せよう",1;
		end;
	}
	set '@r00,getnpcid(0,getmdnpcname("ルガン主教#20msd00"));
	set '@r01,getnpcid(0,getmdnpcname("ルガン主教#20msd01"));
	set '@r02,getnpcid(0,getmdnpcname("ルガン主教#20msd02"));
	set '@hh00,getnpcid(0,getmdnpcname("ハートハンター#20msd00"));
	set '@hh01,getnpcid(0,getmdnpcname("ハートハンター#20msd01"));
	misceffect 453,getmdnpcname("Jガーディアン#ms00");
	misceffect 453,getmdnpcname("Jガーディアン#ms01");
	misceffect 453,getmdnpcname("Jガーディアン#ms02");
	mes "[ルガン主教]";
	mes "ハァ……";
	mes "次から次へと湧いてくる。";
	mes "キリがないな。";
	unittalk '@r00,"ルガン主教 : 次から次へと湧いてくる。";
	unittalk '@r01,"ルガン主教 : 早く片付けろ！";
	next;
	menu "お手伝いします",-;
	mes "[ルガン主教]";
	mes "なぜ司祭がここにいる？";
	mes "初めて見る顔だな。";
	unittalk getcharid(3),strcharinfo(0)+" : お手伝いします";
	unittalk '@r02,"ルガン主教 : なぜ司祭がここにいる？";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "遠征から戻ってきた者です。";
	mes "サレクガンド様から";
	mes "掃除を手伝うように言われて来ました。";
	unittalk getcharid(3),strcharinfo(0)+" : サレクガンド様に言われて来ました";
	next;
	mes "[ルガン主教]";
	mes "そんな話は聞いていないぞ。";
	unittalk '@r01,"ルガン主教 : そんな話は聞いていないぞ。";
	next;
	mes "[ルガン主教]";
	mes "いったん帰れ。";
	mes "話は後で聞く。";
	unittalk '@r00,"ルガン主教 : いったん帰れ。";
	next;
	mes "[ルガン主教]";
	mes "ここは許可のある者しか";
	mes "入ってはいけない場所だ。";
	unittalk '@r01,"ルガン主教 : ここは許可のある者しか入れない。";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "実は道に迷って……";
	mes "ひとりで帰れる自信がありません。";
	mes "お手伝いしますから";
	mes "しばらくここに……。";
	unittalk getcharid(3),strcharinfo(0)+" : お手伝いするので、しばらくここに……。";
	next;
	hideoffnpc getmdnpcname("ハートハンター#20msd00");
	hideoffnpc getmdnpcname("ハートハンター#20msd01");
	mes "[ハートハンター]";
	mes "何の騒ぎだ？";
	unittalk '@hh00,"ハートハンター : 何の騒ぎだ？";
	next;
	mes "[ルガン主教]";
	mes "いいところに来た。";
	mes "この司祭が道に迷ったらしい。";
	mes "一緒に戻ってやってくれ。";
	unittalk '@r00,"ルガン主教 : 司祭が道に迷ったらしい。一緒に戻ってやってくれ。";
	next;
	mes "[ハートハンター]";
	mes "……今やらないとダメか？";
	unittalk '@hh00,"ハートハンター : ……今やらないとダメか？";
	unittalk '@hh01,"ハートハンター : 面倒くさ……。";
	next;
	mes "[ルガン主教]";
	mes "そうだ。";
	mes "今やってくれ。";
	unittalk '@r00,"ルガン主教 : そうだ。今やってくれ。";
	unittalk '@r01,"ルガン主教 : 相変わらずに反抗的だな……。";
	unittalk '@r02,"ルガン主教 : 逆らうつもりか？";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "人間!?";
	mes "汚らわしい人間が";
	mes "どうしてここにいるんですか？";
	mes "まさか主教様たちは";
	mes "この人間に脅されてるのですか!?";
	unittalk getcharid(3),strcharinfo(0)+" : 人間がどうしてここにいるんですか？";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "脅されてるのなら";
	mes "尻尾を振ってください！";
	mes "私が助けてさしあげます！";
	unittalk getcharid(3),strcharinfo(0)+" : 尻尾を振ってください。私が助けてさしあげます。";
	next;
	mes "[ルガン主教]";
	mes "なにを言っているんだ、お前は！";
	mes "事情も知らないくせに";
	mes "余計なことを言うんじゃない！";
	unittalk '@r02,"ルガン主教 : 余計なことを言うんじゃない！";
	next;
	mes "[ルガン主教]";
	mes "あの方が間もなくいらっしゃるのに……";
	mes "早く帰れ。";
	mes "まったく最近の司祭ときたら……。";
	unittalk '@r01,"ルガン主教 : まったく最近の司祭ときたら……。";
	next;
	mes "[ハートハンター]";
	mes "こいつ、怪しいな……";
	mes "司祭のくせに知らなさすぎるし";
	mes "道に迷っただって？";
	unittalk '@hh00,"ハートハンター : こいつ、怪しいな……。";
	next;
	mes "[ハートハンター]";
	mes "この前、騒ぎを起こした人間が";
	mes "またルガンに化けているのかもな。";
	mes "……やっちまうか？";
	unittalk '@hh01,"ハートハンター : ……やっちまうか？";
	next;
	mes "[ルガン主教]";
	mes "おい、憶測だけで物騒なことを言うな！";
	mes "サレクガンドが保証した司祭だ。";
	mes "それが本当だったらどうする！";
	unittalk '@r01,"ルガン主教 : おい、憶測だけで物騒なことを言うな！";
	next;
	mes "[ハートハンター]";
	mes "サレクガンドは";
	mes "今この場にいないのに？";
	mes "何を根拠に信じるんだ？";
	unittalk '@hh01,"ハートハンター : 何を根拠に信じるんだ？";
	next;
	mes "[ハートハンター]";
	mes "司祭の一人ぐらい片付けても";
	mes "誰も気にしませんよ。";
	mes "ラスガンド様がいらっしゃる前に";
	mes "ちゃちゃっとやっちゃいましょう！";
	unittalk '@hh00,"ハートハンター : 司祭一人ぐらい片付けても、誰も気にしませんよ。";
	next;
	mes "[ハートハンター]";
	mes "ためらいがあるのなら";
	mes "俺たちでやりますよ。";
	mes "念のために呪術師を呼んで";
	mes "制圧したガーディアンも使うか。";
	unittalk '@hh01,"ハートハンター : ためらいがあるなら、俺たちでやります。";
	next;
	mes "[ルガン主教]";
	mes "……なら、ここは任せる。";
	unittalk '@r00,"ルガン主教 : ……なら、ここは任せる。";
	unittalk '@r01,"ルガン主教 : こいつら帰るのが面倒なだけだろう……。";
	unittalk '@r02,"ルガン主教 : 私たちには関係ない。先に行こう。";
	hideonnpc getmdnpcname("#20msn00");
	hideonnpc getmdnpcname("ルガン主教#20msd00");
	hideonnpc getmdnpcname("ルガン主教#20msd01");
	hideonnpc getmdnpcname("ルガン主教#20msd02");
	hideonnpc getmdnpcname("ハートハンター#20msd00");
	hideonnpc getmdnpcname("ハートハンター#20msd01");
	donpcevent getmdnpcname("Twsd_MobSpawn1")+ "::OnStart";
	stopnpctimer;
	startnpctimer getmdnpcname("ルガン呪術師#20msd00");
	close;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,311,93,3	script	ルガン主教#20msd01	10475,{}
1@twsd.gat,309,96,5	script	ルガン主教#20msd02	10473,{}
1@twsd.gat,307,95,5	script	Jガーディアン#ms00	21972,{}
1@twsd.gat,308,94,5	script	Jガーディアン#ms01	21973,{}
1@twsd.gat,306,93,5	script	Jガーディアン#ms02	21972,{}
1@twsd.gat,317,98,3	script(HIDDEN)	ハートハンター#20msd00	21994,{}
1@twsd.gat,319,95,3	script(HIDDEN)	ハートハンター#20msd01	21994,{}

1@twsd.gat,319,100,3	script(HIDDEN)	ルガン呪術師#20msd00	21987,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : パーティーリーダーに任せよう",1;
		end;
	}
	set '@c00,getnpcid(0,getmdnpcname("ルガン呪術師#20msd00"));
	set '@c01,getnpcid(0,getmdnpcname("ルガン呪術師#20msd01"));
	unittalk '@c00,"ルガン呪術師 : 何の騒ぎだ？";
	if(!sleep2(1500)) end;
	unittalk '@c01,"ルガン呪術師 : 主教に呼ばれて来たが、何が起きているんだ？";
	if(!sleep2(1500)) end;
	unittalk '@c00,"ルガン呪術師 : 疑わしいルガンが現れたようだが……お前か？";
	if(!sleep2(1500)) end;
	unittalk '@c01,"ルガン呪術師 : 人間かもしれない……確認する！";
	if(!sleep2(1500)) end;
	misceffect 425,"";
	if(!sleep2(500)) end;
	misceffect 432,"";
	if(!sleep2(500)) end;
	misceffect 441,"";
	sc_end EFST_MONSTER_TRANSFORM;
	if(!sleep2(1500)) end;
	unittalk '@c00,"ルガン呪術師 : やはり人間か！　どうやってここまで来た!!";
	if(!sleep2(1500)) end;
	unittalk '@c01,"ルガン呪術師 : 捕まえるのが先だ！";
	hideonnpc getmdnpcname("ルガン呪術師#20msd00");
	hideonnpc getmdnpcname("ルガン呪術師#20msd01");
	donpcevent getmdnpcname("Twsd_MobSpawn1")+ "::OnStart2";
	stopnpctimer;
	startnpctimer getmdnpcname("ルガン主教#20msd10");
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}
1@twsd.gat,312,100,5	script(HIDDEN)	ルガン呪術師#20msd01	21987,{}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn1	-1,{
OnStart:
	monster getmdmapname("1@twsd.gat"),317,98,"ハートハンター#1",21994,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),319,95,"ハートハンター#2",21994,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn1")+"::OnKilled"))
		end;
	delmisceffect 453, getmdnpcname("Jガーディアン#ms00");
	delmisceffect 453, getmdnpcname("Jガーディアン#ms01");
	delmisceffect 453, getmdnpcname("Jガーディアン#ms02");
	hideonnpc getmdnpcname("Jガーディアン#ms00");
	hideonnpc getmdnpcname("Jガーディアン#ms01");
	hideonnpc getmdnpcname("Jガーディアン#ms02");
	monster getmdmapname("1@twsd.gat"),307,95,"Jガーディアン-P#1",21991,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),308,94,"Jガーディアン-Y#2",21992,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),306,93,"Jガーディアン-P#3",21991,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2"))
		end;
	sleep 500;
	hideoffnpc getmdnpcname("ルガン呪術師#20msd00");
	hideoffnpc getmdnpcname("ルガン呪術師#20msd01");
	unittalk getnpcid(0,getmdnpcname("ルガン呪術師#20msd00")),"ルガン呪術師 : 騒がしいな……。";
	end;
OnStart2:
	monster getmdmapname("1@twsd.gat"),319,100,"ルガン呪術師#1",21993,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled3";
	monster getmdmapname("1@twsd.gat"),312,100,"ルガン呪術師#2",21993,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled3";
	end;
OnKilled3:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn1")+"::OnKilled3"))
		end;
	hideoffnpc getmdnpcname("#20msn01");
	hideoffnpc getmdnpcname("#20w00");
	misceffect 247,getmdnpcname("#20w00");
	donpcevent getmdnpcname("Twsd_MobSpawn2")+ "::OnStart";
	announce "？？？ : 少々……魔力が高……", 0x9, 0x00ffcc;
	sleep 4000;
	announce "‐北西から聞き覚えのある声が聞こえた‐", 0x9, 0x00ffcc;
	end;
}

1@twsd.gat,320,94,0	script(HIDDEN)	#20msn01	139,14,14,{
	unittalk getcharid(3),strcharinfo(0)+" : 北西から聞き覚えのある声が聞こえた。",1;
	viewpoint 1, 294, 115, 1, 0xFF0000;
	end;
}

1@twsd.gat,294,115,0	script(HIDDEN)	#20w00	45,2,2,{
	warp getmdmapname("1@twsd.gat"),261,119;
	end;
}

1@twsd.gat,260,119,0	script	#20msd00	139,5,5,{
	unittalk getcharid(3),strcharinfo(0)+" : こっちかな？",1;
	viewpoint 1, 257, 149, 1, 0xFF0000;
	viewpoint 1, 268, 145, 2, 0xFF0000;
	viewpoint 1, 258, 131, 3, 0xFF0000;
	viewpoint 1, 262, 146, 5, 0xFF0000;
	viewpoint 1, 220, 154, 6, 0xFF0000;
	end;
}

1@twsd.gat,1,1,0	script	Twsd_MobSpawn2	139,{
OnStart:
	monster getmdmapname("1@twsd.gat"),257,149,"ルガン呪術師#1",21993,1,getmdnpcname("Twsd_MobSpawn2")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),268,145,"ルガン呪術師#2",21993,1,getmdnpcname("Twsd_MobSpawn2")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),258,131,"ルガン呪術師#3",21993,1,getmdnpcname("Twsd_MobSpawn2")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn2")+"::OnKilled"))
		end;
	sleep 500;
	hideoffnpc getmdnpcname("#20msn02");
	hideoffnpc getmdnpcname("#20w10");
	misceffect 247,getmdnpcname("#20w10");
	announce "？？？ : 反動が……くっ……", 0x9, 0x00ffcc;
	sleep 4000;
	announce "‐西から聞き覚えのある声が聞こえた‐", 0x9, 0x00ffcc;
	end;
}

1@twsd.gat,258,131,0	script(HIDDEN)	#20msn02	139,14,14,{
	unittalk getcharid(3),strcharinfo(0)+" : 西から聞き覚えのある声が聞こえた。",1;
	end;
}

1@twsd.gat,220,154,0	script(HIDDEN)	#20w10	45,2,2,{
	warp getmdmapname("1@twsd.gat"),196,208;
	end;
}

1@twsd.gat,196,209,0	script	#20msn03	139,5,5,{
	viewpoint 1, 163, 190, 1, 0xFF0000;
	end;
}

1@twsd.gat,163,190,10	script	ルガン主教#20msd10	10474,10,5,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : パーティーリーダーに任せよう",1;
		end;
	}
	set '@r10,getnpcid(0,getmdnpcname("ルガン主教#20msd10"));
	set '@r11,getnpcid(0,getmdnpcname("ルガン主教#20msd11"));
	set '@r12,getnpcid(0,getmdnpcname("ルガン主教#20msd12"));
	mes "[ルガン主教]";
	mes "……様子がおかしい。";
	mes "調べるように言った呪術師も";
	mes "戻ってこないようだが。";
	unittalk '@r10,"ルガン主教 : ……様子がおかしい。";
	next;
	mes "[ルガン呪術師]";
	mes "聖域に連れて帰ったのでは？";
	mes "……なっ！　に、人間だっ！";
	unittalk getnpcid(0,getmdnpcname("ルガン呪術師#20msd10")),"ルガン主教 : ……なっ！　に、人間だっ！";
	next;
	mes "[ルガン主教]";
	mes "に、人間だとっ!?";
	mes "向こうから来たということは";
	mes "やはり先ほどの司祭は";
	mes "人間が化けていたんだな！";
	unittalk '@r00,"ルガン主教 : やはり人間が化けていたんだな！";
	unittalk '@r12,"ルガン主教 : 呪術師もやられたのか！";
	next;
	mes "[ルガン主教]";
	mes "この先には";
	mes "^0000cdラスガンド様がいらっしゃる！^000000";
	mes "速やかに排除しろ！";
	unittalk '@r11,"ルガン主教 : この先にはラスガンド様がいらっしゃる！　速やかに排除しろ！";
	next;
	menu "この先にラスガンドが居るのか",-;
	mes "[ルガン主教]";
	mes "……？";
	mes "知らずに、ここまで来た……!?";
	unittalk getcharid(3),strcharinfo(0)+" : この先にラスガンドが居るのか。";
	unittalk '@r12,"ルガン主教 : 知らずに、ここまで来た……!?";
	next;
	mes "[ルガン主教]";
	mes "落ち着け。";
	mes "奴はここで我々が何をしているのか";
	mes "知らないようだ。";
	mes "ここで、奴を止めれば良い。";
	unittalk '@r00,"ルガン主教 : 落ち着け。ここで、奴を止めれば良い。";
	next;
	mes "[ルガン主教]";
	mes "^0000cdあの外から来た人間^000000が";
	mes "誰も通すなと言ってきたのに……";
	mes "このままでは我々の面目が……。";
	unittalk '@r11,"ルガン主教 : あの外から来た人間が誰も通すなと言ってきたのに……";
	unittalk '@r12,"ルガン主教 : 我々の面子が……";
	next;
	menu "バゴットも一緒か……",-;
	emotion 6,getmdnpcname("ルガン主教#20msd10");
	mes "[ルガン主教]";
	mes "……全員、もう何も喋るな。";
	mes "^0000cdラスガンド様の神聖なる儀式^000000の";
	mes "邪魔はさせん！";
	unittalk getcharid(3),strcharinfo(0)+" : バゴットも一緒か……";
	unittalk '@r00,"ルガン主教 : 全員、もう何も喋るな。ラスガンド様の神聖なる儀式の邪魔はさせん！";
	next;
	menu "神聖な儀式が行われているのか……",-;
	emotion 6,getmdnpcname("ルガン主教#20msd11");
	mes "[ルガン主教]";
	mes "…………うぐ。";
	unittalk getcharid(3),strcharinfo(0)+" : 神聖な儀式が行われているのか……";
	unittalk '@r11,"ルガン主教 : …………うぐ。";
	next;
	mes "[ルガン主教]";
	mes "そいつを生きて返すな！";
	unittalk '@r12,"ルガン主教 : そいつを生きて返すな！";
	unittalk '@r10,"ルガン主教 : 永遠にその口を塞いでやる！";
	next;
	mes "[ルガン呪術師]";
	mes "ここは、私たちがやる！";
	mes "お前たちは、ガーディアンを手配しつつ";
	mes "状況を報告せよ！";
	unittalk getnpcid(0,getmdnpcname("ルガン呪術師#20msd11")),"ルガン呪術師 : ここは、私たちがやる！";
	next;
	mes "[ルガン主教]";
	mes "そ、そうしよう！";
	unittalk '@r00,"ルガン主教 : そ、そうしよう！";
	close2;
	stopnpctimer;
	donpcevent getmdnpcname("Twsd_MobSpawn3")+ "::OnStart";
	end;
OnTouch:
	misceffect 453,getmdnpcname("Jガーディアン#ms10");
	misceffect 453,getmdnpcname("Jガーディアン#ms11");
	unittalk "ルガン主教 : 様子が変だな……。";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,166,193,3	script	ルガン主教#20msd11	10473,{}
1@twsd.gat,168,197,3	script	ルガン主教#20msd12	10475,{}
1@twsd.gat,161,198,5	script	ルガン呪術師#20msd10	21987,{}
1@twsd.gat,166,200,5	script	ルガン呪術師#20msd11	21987,{}
1@twsd.gat,164,197,3	script	Jガーディアン#ms10	21972,{}
1@twsd.gat,160,196,3	script	Jガーディアン#ms11	21973,{}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn3	-1,{
OnStart:
	hideonnpc getmdnpcname("ルガン主教#20msd12");
	unittalk getnpcid(0,getmdnpcname("ルガン主教#20msd10")),"ルガン主教 : 私たちも合流するべきか？";
	unittalk getnpcid(0,getmdnpcname("ルガン主教#20msd11")),"ルガン主教 : どうにもならなかったら、ガーディアンを放つ！";
	sleep 1000;
	hideonnpc getmdnpcname("ルガン呪術師#20msd10");
	hideonnpc getmdnpcname("ルガン呪術師#20msd11");
	monster getmdmapname("1@twsd.gat"),161,198,"ルガン呪術師#1",21993,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),166,200,"ルガン呪術師#2",21993,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn3")+"::OnKilled"))
		end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("ルガン主教#20msd10")),"ルガン主教 : くそ！　退却する！";
	unittalk getnpcid(0,getmdnpcname("ルガン主教#20msd11")),"ルガン主教 : 行け！　ガーディアンども！！";
	sleep 1000;
	hideonnpc getmdnpcname("Jガーディアン#ms10");
	hideonnpc getmdnpcname("Jガーディアン#ms11");
	hideonnpc getmdnpcname("ルガン主教#20msd10");
	hideonnpc getmdnpcname("ルガン主教#20msd11");
	delmisceffect 453, getmdnpcname("Jガーディアン#ms10");
	delmisceffect 453, getmdnpcname("Jガーディアン#ms11");
	monster getmdmapname("1@twsd.gat"),164,197,"Jガーディアン-P#1",21991,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),160,196,"Jガーディアン-Y#2",21992,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn3")+"::OnKilled2"))
		end;
	sleep 500;
	hideoffnpc getmdmapname("#20msn04");
	announce "？？？ : 一気に終わらせ……", 0x9, 0x00ffcc;
	hideoffnpc getmdmapname("レハール#20msd10");
	announce "レハール : 冒険者様！　冒険者様～。どこにいらっしゃいますか～！", 0x9, 0x00ffcc;
	initnpctimer getmdmapname("レハール#20msd10");
	end;
}

1@twsd.gat,163,190,0	script(HIDDEN)	#20msn04	139,28,28,{
	viewpoint 1, 162, 245, 1, 0xFF0000;
	end;
}

1@twsd.gat,162,245,3	script(HIDDEN)	レハール#20msd10	10469,9,9,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : パーティーリーダーに任せよう",1;
		end;
	}
	cutin "ep19_lehar01.png", 0;
	mes "[レハール]";
	mes "冒険者様！";
	mes "よかった、やっと追い付きました！";
	unittalk "レハール : よかった、やっと追い付きました！";
	next;
	menu "レハール？",-;
	cutin "ep19_lehar02.png", 0;
	mes "[レハール]";
	mes "レイジーさんから伝令です。";
	mes "氷の城に戻って、集めた情報を";
	mes "整理しよう、とのことです。";
	unittalk getcharid(3),strcharinfo(0)+" : レハール様？どうやって？",;
	unittalk "レハール : 氷の城に戻って、集めた情報を整理しましょう。";
	next;
	cutin "ep19_lehar03.png", 0;
	mes "[レハール]";
	mes "レイジーさんとミリアムさんは";
	mes "先に戻りました。";
	mes "私が冒険者様に伝えるために";
	mes "ここまで追いかけて来たんです。";
	unittalk "レハール : レイジーさんとミリアムさんは先に戻りました。";
	next;
	cutin "ep19_lehar03.png", 255;
	mes "["+strcharinfo(0)+"]";
	mes "「あの場所」については";
	mes "まだわかっていないのですが……";
	mes "どうやらラスガンドとバゴットが";
	mes "この先にいるようです。";
	unittalk getcharid(3),strcharinfo(0)+" : どうやらラスガンドとバゴットが、この先にいるようです。";
	next;
	cutin "ep19_lehar01.png", 0;
	mes "[レハール]";
	mes "ほ、本当ですか!?";
	unittalk "レハール : ほ、本当ですか!?";
	next;
	cutin "ep19_lehar03.png", 255;
	mes "["+strcharinfo(0)+"]";
	mes "ラスガンドたちがこの先で";
	mes "何をしているのか確認しましょう。";
	mes "今、ここで引き返しては";
	mes "せっかくの機会を逃してしまいます。";
	unittalk getcharid(3),strcharinfo(0)+" : ラスガンドたちがこの先で何をしているのか確認しましょう。";
	next;
	cutin "ep19_lehar01.png", 0;
	mes "[レハール]";
	mes "わかりました！";
	mes "目立つとマズイので";
	mes "分かれて行動しましょう。";
	unittalk "レハール : わかりました！　目立つとマズイので分かれて行動しましょう。";
	close2;
	stopnpctimer;
	hideoffnpc getmdmapname("#20w11");
	hideonnpc getmdmapname("レハール#20msd10");
	donpcevent getmdnpcname("Twsd_MobSpawn4")+ "::OnStart";
	viewpoint 1, 164, 260, 1, 0xFF0000;
	cutin "ep19_lehar03.png", 255;
	end;
OnTouch:
	unittalk "レハール : 冒険者様！！";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,164,260,0	script(HIDDEN)	#20w11	45,2,2,{
	warp getmdmapname("1@twsd.gat"),154,299;
	end;
}

1@twsd.gat,154,300,0	script	#20msd10	139,5,5,{
	viewpoint 1, 148, 310, 1, 0xFF0000;
	viewpoint 1, 113, 326, 2, 0xFF0000;
	viewpoint 1, 85, 336, 3, 0xFF0000;
	viewpoint 1, 48, 326, 4, 0xFF0000;
	end;
}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn4	-1,{
OnStart:
	monster getmdmapname("1@twsd.gat"),148,310,"ルガン呪術師#1",21993,1,getmdnpcname("Twsd_MobSpawn4")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),113,326,"ルガン呪術師#2",21993,1,getmdnpcname("Twsd_MobSpawn4")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),85,336,"ルガン呪術師#3",21993,1,getmdnpcname("Twsd_MobSpawn4")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn4")+"::OnKilled"))
		end;
	sleep 500;
	hideoffnpc getmdnpcname("サレクガンド#20msd20");
	hideoffnpc getmdnpcname("バゴット#20msd20");
	hideoffnpc getmdnpcname("ラスガンド#20msd20");
	hideoffnpc getmdnpcname("ルガン主教#20msd20");
	hideoffnpc getmdnpcname("ルガン主教#20msd21");
	hideoffnpc getmdnpcname("ルガン主教#20msd22");
	hideoffnpc getmdnpcname("ハートハンター#20msd20");
	hideoffnpc getmdnpcname("ハートハンター#20msd21");
	hideoffnpc getmdnpcname("ハートハンター#20msd22");
	hideoffnpc getmdnpcname("ハートハンター#20msd23");
	hideoffnpc getmdnpcname("ハートハンター#20msd24");
	initnpctimer getmdnpcname("サレクガンド#20msd20");
	announce "‐西の方から声が聞こえる‐", 0x9, 0x00ffcc;
	sleep 4000;
	announce "？？？ : もう一度、やってみましょう……", 0x9, 0x00ffcc;
	end;
}

1@twsd.gat,48,326,5	script(HIDDEN)	サレクガンド#20msd20	10473,5,5,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : パーティーリーダーに任せよう",1;
		end;
	}
	set '@s20,getnpcid(0,getmdnpcname("サレクガンド#20msd20"));
	set '@b20,getnpcid(0,getmdnpcname("バゴット#20msd20"));
	set '@l20,getnpcid(0,getmdnpcname("レハール#20msd20"));
	set '@r20,getnpcid(0,getmdnpcname("ラスガンド#20msd20"));
	if(.scean == 0) {
		set '@s20,getnpcid(0,getmdnpcname("サレクガンド#20msd20"));
		set '@b20,getnpcid(0,getmdnpcname("バゴット#20msd20"));
		mes "[サレクガンド]";
		mes "おい、外から来た人間。";
		mes "効果が無いではないか！";
		mes "手を抜いているのではないだろうな？";
		unittalk '@s20,"サレクガンド : おい、外から来た人間。手を抜いているのではないだろうな？";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "……それはラスガンド様に対する";
		mes "暴言と見なしますが？";
		unittalk '@b20,"バゴット : それはラスガンド様に対する暴言と見なしますが？";
		next;
		cutin "ep18_bagot_01.png", 255;
		mes "[サレクガンド]";
		mes "お前が大口を叩いたのだろう。";
		mes "あの障壁さえ破れば良いと！";
		unittalk '@s20,"サレクガンド : お前が大口を叩いたのだろう。";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[バゴット]";
		mes "御覧の通り、ラスガンド様と";
		mes "頑張ってやっているでしょうが？";
		mes "見ているだけのくせに";
		mes "口だけは出す……。";
		unittalk '@b20,"バゴット : 見ているだけのくせに口だけは出す……。";
		next;
		cutin "ep18_bagot_01.png", 255;
		menu "ここが……あの場所？",-;
		unittalk getcharid(3),strcharinfo(0)+" : ここが……あの場所？";
		mes "[サレクガンド]";
		mes "人間!?　どうして人間がここに!!";
		mes "見張りや護衛の奴はどうした！";
		mes "全員何をしているっ！";
		unittalk '@s20,"サレクガンド : 人間!?　どうして人間がここに!!";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[バゴット]";
		mes "バゴットが教えてあげますよ。";
		mes "護衛たちを全員倒して、ここまで来た。";
		mes "でしょう？";
		mes "その冒険者、相当強いから。";
		unittalk '@b20,"バゴット : バゴットが教えてあげますよ。護衛たちを全員倒して、ここまで来た。でしょう？";
		unittalk '@s20,"サレクガンド : くっ……！";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "想定はしてましたよ～。";
		mes "ラスガンド様が、あの門を開けておけと";
		mes "言われてましたからねぇ。";
		mes "コイツらを釣る為に……！";
		unittalk '@b20,"バゴット : 想定はしてましたよ～。";
		next;
		menu "（やはり、わざと開けていたのか……）",-;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "ここまで来るとは";
		mes "思ってませんでしたけど～。";
		mes "はぁ～～。";
		mes "護衛がここまで不甲斐ないとは～。";
		unittalk getcharid(3),strcharinfo(0)+" : （やはり、わざと開けていたのか……）";
		unittalk '@b20,"バゴット : ここまで来るとは思ってませんでしたけど～。";
		next;
		menu "ここが「あの場所」だな？",-;
		cutin "ep18_bagot_01.png", 255;
		mes "[サレクガンド]";
		mes "お前……どこでそれを知って?!";
		unittalk getcharid(3),strcharinfo(0)+" : ここが「あの場所」だな？";
		unittalk '@s20,"サレクガンド : お前……どこでそれを知って?!";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[バゴット]";
		mes "バゴットたちの話を";
		mes "盗み聞きしたんでしょう？";
		mes "バゴットはそういう姑息な手は";
		mes "好きじゃありませんよ。";
		unittalk '@b20,"バゴット : バゴットたちの話を盗み聞きしたんでしょう？";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[ラスガンド]";
		mes "その者が……";
		mes "例の冒険者か。";
		unittalk '@r20,"ラスガンド : その者が……例の冒険者か。";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[ラスガンド]";
		mes "……だが、^0000cd「あの力」^000000は";
		mes "感じられないな。";
		unittalk '@r20,"ラスガンド : だが、「あの力」は感じられないな。";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "この冒険者ではありません。";
		mes "バゴットが検査しましたから。";
		mes "「あの力」の持ち主は";
		mes "検査していない、紫髪の人間の";
		mes "可能性があります。";
		unittalk '@b20,"バゴット : この冒険者ではありません。バゴットが検査しましたから。";
		next;
		menu "あの力？",-;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "牢屋から脱出した時に使ったでしょ？";
		mes "それで、あの紫髪の人間はどこ？";
		unittalk getcharid(3),strcharinfo(0)+" : あの力？";
		unittalk '@b20,"バゴット : あの紫髪の人間はどこ？";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "……まあ、いい。";
		mes "この冒険者も強力な力を持ってます。";
		mes "捕らえればきっと役に立つでしょ。";
		mes "ほら、ハートハンターの出番ですよ。";
		unittalk '@b20,"バゴット : 捕らえればきっと役に立つでしょ。ほら、ハートハンターの出番ですよ。";
		close2;
		cutin "ep18_bagot_01.png", 255;
		donpcevent getmdnpcname("Twsd_MobSpawn5")+ "::OnStart";
		end;
	}
	if(.scean == 1) {
		mes "[サレクガンド]";
		mes "くっ……強い！";
		mes "こうなれば、私が……！";
		unittalk '@s20,"サレクガンド : くっ……強い！";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[ラスガンド]";
		mes "手を出すな。";
		mes "その強さ、大したものだ。";
		mes "しかし……私が求めている力ではない。";
		unittalk '@r20,"ラスガンド : しかし……私が求めている力ではない。";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "ええ、そうでしょうとも……";
		mes "何としても、一緒にいた";
		mes "紫髪の人間を見つけて……。";
		unittalk '@b20,"バゴット : 何としても、一緒にいた紫髪の人間を見つけて……。";
		next;
		hideoffnpc getmdnpcname("レハール#20msd20");
		cutin "ep19_lehar05.png", 2;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "冒険者様！";
		mes "うわっ！　あ、あの科学者は！";
		mes "それに、サレクガンドも！";
		mes "あ、あの後ろにいるのは……？";
		unittalk '@l20,"レハール : あ、あの後ろにいるのは……？";
		next;
		menu "ラスガンドです",-;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "こうやって顔を合わせるのは";
		mes "初めてですね……ははっ！";
		mes "昔話に出てくる存在に会えるとは。";
		unittalk getcharid(3),strcharinfo(0)+" : ラスガンドです。";
		unittalk '@l20,"レハール : ははっ！　昔話に出てくる存在に会えるとは。";
		unittalk '@s20,"サレクガンド : その無礼な口を閉ざせ！";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[バゴット]";
		mes "向こうからやってくるなんて！";
		mes "いかがですか、ラスガンド様？";
		mes "あの力は……。";
		unittalk '@b20,"バゴット : いかがですか、ラスガンド様？　あの力は……。";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[ラスガンド]";
		mes "……違うな。";
		mes "^0000cdあの力^000000を感じない。";
		unittalk '@r20,"ラスガンド : ……違うな。あの力を感じない。";
		next;
		cutin "ep20_lasgand04.png", 0;
		mes "[ラスガンド]";
		mes "だが、^0000cd慣れ親しんだ力^000000を感じる。";
		mes "古い……そうかお前は……。";
		unittalk '@r20,"ラスガンド : だが、慣れ親しんだ力を感じる。古い……そうかお前は……。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "……何のことを言ってるんです？";
		mes "あの力？";
		unittalk '@l20,"レハール : ……何のことを言ってるんです？";
		next;
		cutin "ep18_bagot_03.png", 1;
		mes "[バゴット]";
		mes "本当に知らない？";
		mes "おかしい？";
		mes "あの力は間違いなく";
		mes "この二人の痕跡から検出されたのに？";
		unittalk '@b20,"バゴット : あの力は間違いなく、この二人の痕跡から検出されたのに？";
		next;
		cutin "ep18_bagot_02.png", 1;
		mes "[バゴット]";
		mes "別の何か？";
		mes "もしかしてユンケアが？";
		mes "何かの装置で……？";
		unittalk '@b20,"バゴット : もしかしてユンケアが？　何かの装置で……？";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "ユンケアさんは";
		mes "もうイスガルドにはいませんよ。";
		mes "彼女はしかるべき場所に";
		mes "移送されましたからね。";
		unittalk '@l20,"レハール : ユンケアさんは、もうイスガルドにはいませんよ。";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[バゴット]";
		mes "他に協力者がいるってこと？";
		mes "素直に言いなさい。";
		mes "このバゴットがその協力者を";
		mes "上手く利用してあげますから。";
		unittalk '@b20,"バゴット : 他に協力者がいるってこと？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "さっきからずっと";
		mes "訳のわからないことを……。";
		unittalk '@l20,"レハール : さっきからずっと訳のわからないことを……。";
		next;
		menu "さあ……",-;
		cutin "ep18_bagot_03.png", 1;
		mes "[バゴット]";
		mes "……そうですか。";
		mes "もういいです。";
		mes "捕まえた後でゆっくりと";
		mes "しゃべってもらいますから。";
		unittalk getcharid(3),strcharinfo(0)+" : さあ…";
		unittalk '@b20,"バゴット : 捕まえた後でゆっくりと、しゃべってもらいますから。";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "[サレクガンド]";
		mes "呪術師たちよ！";
		mes "あの人間たちを捕縛せよ！";
		unittalk '@s20,"サレクガンド : 呪術師たちよ！";
		hideoffnpc getmdnpcname("ルガン呪術師#20msd20");
		hideoffnpc getmdnpcname("ルガン呪術師#20msd21");
		hideoffnpc getmdnpcname("ルガン呪術師#20msd22");
		unittalk '@s20,"サレクガンド : あの人間たちを捕縛せよ！";
		stopnpctimer;
		close2;
		cutin "ep18_bagot_01.png", 255;
		initnpctimer getmdnpcname("バゴット#20msd20");
		donpcevent getmdnpcname("Twsd_MobSpawn5")+ "::OnStart2";
		end;
	}
	if(.scean == 2) {
		mes "[サレクガンド]";
		mes "人間などと協力したのは間違いだった！";
		mes "私がもっと強く反対していれば";
		mes "こんなことには！";
		close;
	}
	end;
OnTouch:
	if(.scean == 0)
		unittalk "サレクガンド : 何か嫌な予感が……。";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,43,326,5	script(HIDDEN)	ラスガンド#20msd20	10536,{
	unittalk "ラスガンド : ………。";
	end;
}

1@twsd.gat,46,328,5	script(HIDDEN)	バゴット#20msd20	10386,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : パーティーリーダーに任せよう",1;
		end;
	}
	if(.scean == 2) {
		set '@s20,getnpcid(0,getmdnpcname("サレクガンド#20msd20"));
		set '@b20,getnpcid(0,getmdnpcname("バゴット#20msd20"));
		set '@l20,getnpcid(0,getmdnpcname("レハール#20msd20"));
		cutin "ep18_bagot_03.png", 1;
		mes "[バゴット]";
		mes "はぁ～～～。";
		mes "ますます強くなってる。";
		mes "バゴットは興味が湧いてきましたよ。";
		unittalk '@b20,"バゴット : ますます強くなってる。バゴットは興味が湧いてきましたよ。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "感心してくれるのは良いけど";
		mes "何だか気持ち悪いですね……。";
		unittalk '@l20,"レハール : 何だか気持ち悪いですね……。";
		next;
		menu "……さて、どうします？",-;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "このまま、私達だけで戦うか……";
		mes "それともいったん退きますか？";
		mes "「あの場所」を調べると言う目的は";
		mes "達成したはずですから。";
		unittalk getcharid(3),strcharinfo(0)+" : ……さて、どうします？";
		unittalk '@l20,"レハール : このまま、私達だけで戦うか……それともいったん退きますか？";
		next;
		cutin "ep18_bagot_02.png", 1;
		mes "[バゴット]";
		mes "……この場所を知られたのは";
		mes "ちょっと面倒ですねぇ。";
		mes "もし逃げられたりしたら";
		mes "計画に支障がでますよ。";
		unittalk '@b20,"バゴット : ……この場所を知られたのは、ちょっと面倒ですねぇ。";
		next;
		cutin "ep18_bagot_03.png", 1;
		mes "[バゴット]";
		mes "……ラスガンド様？";
		mes "お力を使っていただけませんか？";
		unittalk '@b20,"バゴット : ……ラスガンド様？　お力を使っていただけませんか？";
		next;
		cutin "ep20_lasgand01.png", 255;
		mes "[サレクガンド]";
		mes "ラスガンド様、わ、私が！";
		mes "そのお力を使われるまでもな……！";
		unittalk '@s20,"サレクガンド : そのお力を使われるまでもな……！";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[ラスガンド]";
		mes "……よかろう。";
		mes "この身の程知らず共に";
		mes "私の力を見せてやろう。";
		unittalk getnpcid(0,getmdnpcname("ラスガンド#20msd20")),"ラスガンド : ……よかろう。";
		next;
		misceffect 805,getmdnpcname("ラスガンド#20msd20");
		misceffect 827,"";
		misceffect 827,getmdnpcname("レハール#20msd20");
		cutin "ep19_lehar03.png", 2;
		cutin "ep18_bagot_01.png", 1;
		mes "[バゴット]";
		mes "せめて息だけはしている状態で";
		mes "お願いしますよ～。";
		mes "消し炭にしてしまっては";
		mes "実験材料にできなくなるので～。";
		unittalk '@b20,"バゴット : せめて息だけはしている状態でお願いしますよ～。";
		next;
		misceffect 389,getmdnpcname("ラスガンド#20msd20");
		misceffect 424,getmdnpcname("ラスガンド#20msd20");
		misceffect 926,"";
		misceffect 926,getmdnpcname("レハール#20msd20");
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "あれ……";
		mes "あの力……やばそ……？";
		mes "わ、私たち……このままだと";
		mes "ヤバいんじゃ……!?!?";
		unittalk '@l20,"レハール : あの力……やばそ……？";
		next;
		cutin "ep19_lehar03.png", 255;
		mes "[サレクガンド]";
		mes "おぉ……おおっ！";
		mes "さすがはラスガンド様……！";
		mes "あんな汚らわしい人間たちに使うには";
		mes "そのお力は余りにも尊い……。";
		unittalk '@s20,"サレクガンド : おぉ……おおっ！　さすがはラスガンド様……！";
		next;
		hideoffnpc getmdnpcname("白い猫#20ms20");
		cutin "ep20_nyar02.png", 1;
		mes "[白い猫]";
		mes "ヴェヴェー";
		unittalk getnpcid(0,getmdnpcname("白い猫#20ms20")),"白い猫 : ヴェヴェー";
		next;
		mes "[サレクガンド]";
		mes "な、何だ？　あれは!?";
		unittalk '@s20,"サレクガンド : な、何だ？　あれは!?";
		next;
		cutin "ep18_bagot_02.png", 0;
		mes "[バゴット]";
		mes "……猫ぉ～？";
		unittalk '@b20,"バゴット : ……猫ぉ～？";
		unittalk '@l20,"レハール : あの猫は！";
		emotion 0,getmdnpcname("ラスガンド#20msd20");
		next;
		cutin "ep20_lasgand02.png", 0;
		mes "[ラスガンド]";
		mes "……あれだ。";
		mes "あれを捕らえよ。";
		unittalk getnpcid(0,getmdnpcname("ラスガンド#20msd20")),"ラスガンド : ……あれだ。あれを捕らえよ。";
		unittalk '@s20,"サレクガンド : はいっ！！";
		unittalk getnpcid(0,getmdnpcname("ルガン主教#20msd20")),"ルガン主教 : はっ！！";
		unittalk getnpcid(0,getmdnpcname("ルガン主教#20msd21")),"ルガン主教 : はいっ！！";
		unittalk getnpcid(0,getmdnpcname("ルガン主教#20msd22")),"ルガン主教 : はいっ！！";
		next;
		misceffect 485,getmdnpcname("ラスガンド#20msd20");
		misceffect 454,getmdnpcname("ラスガンド#20msd20");
		misceffect 514,getmdnpcname("ラスガンド#20msd20");
		misceffect 729,"";
		misceffect 729,getmdnpcname("レハール#20msd20");
		cutin "ep20_lasgand02.png", 255;
		mes "[サレクガンド]";
		mes "全員、あれを取り囲め！";
		mes "あれを捕らえるのだ!!";
		unittalk '@s20,"サレクガンド : 全員、あれを取り囲め！　あれを捕らえるのだ!!";
		next;
		misceffect 581,getmdnpcname("白い猫#20ms20");
		misceffect 342,getmdnpcname("白い猫#20ms20");
		misceffect 348,getmdnpcname("白い猫#20ms20");
		cutin "ep20_nyar03.png", 1;
		mes "[白い猫]";
		mes "ニャアアァァッ！！";
		unittalk getnpcid(0,getmdnpcname("白い猫#20ms20")),"白い猫 : ニャアアァァッ！！";
		next;
		delmisceffect 926, getmdnpcname("レハール#20msd20");
		delmisceffect 827, getmdnpcname("レハール#20msd20");
		delmisceffect 729, getmdnpcname("レハール#20msd20");
		cutin "ep18_bagot_01.png", 0;
		mes "[バゴット]";
		mes "あ……？　これはいったい……???";
		unittalk '@b20,"バゴット : あ……？　これはいったい……???";
		misceffect 562,getmdnpcname("サレクガンド#20msd20");
		misceffect 562,getmdnpcname("バゴット#20msd20");
		misceffect 562,getmdnpcname("ラスガンド#20msd20");
		misceffect 562,getmdnpcname("ルガン主教#20msd20");
		misceffect 562,getmdnpcname("ルガン主教#20msd21");
		misceffect 562,getmdnpcname("ルガン主教#20msd22");
		next;
		mes "[バゴット]";
		mes "ちょっと～～っ！　この……!?";
		unittalk '@b20,"バゴット : ちょっと～～っ！　この……!?";
		close2;
		cutin "ep19_lehar03.png", 255;
		delmisceffect 562, getmdnpcname("サレクガンド#20msd20");
		delmisceffect 562, getmdnpcname("バゴット#20msd20");
		delmisceffect 562, getmdnpcname("ラスガンド#20msd20");
		delmisceffect 562, getmdnpcname("ルガン主教#20msd20");
		delmisceffect 562, getmdnpcname("ルガン主教#20msd21");
		delmisceffect 562, getmdnpcname("ルガン主教#20msd22");
		hideonnpc getmdnpcname("サレクガンド#20msd20");
		hideonnpc getmdnpcname("バゴット#20msd20");
		hideonnpc getmdnpcname("ラスガンド#20msd20");
		hideonnpc getmdnpcname("ルガン主教#20msd20");
		hideonnpc getmdnpcname("ルガン主教#20msd21");
		hideonnpc getmdnpcname("ルガン主教#20msd22");
		stopnpctimer;
		initnpctimer getmdnpcname("レハール#20msd20");
		set .scean,3;
		end;
	}
	cutin "ep18_bagot_01.png", 2;
	mes "[バゴット]";
	mes "どうやって、ここまで来ましたか？";
	close2;
	cutin "ep19_lehar03.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,58,327,3	script(HIDDEN)	レハール#20msd20	10469,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : パーティーリーダーに任せよう",1;
		end;
	}
	if(.scean == 2) {
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "私たちは負けません！";
		mes "そうでしょう。";
		close2;
		cutin "ep19_lehar05.png", 255;
		end;
	}
	if(.scean == 3) {
		set '@n20,getnpcid(0,getmdnpcname("白い猫#20ms20"));
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "ラスガンドたちが消えて……？";
		mes "私達、助かったのでしょうか？";
		mes "あ……ニャンコ？";
		unittalk "レハール : ラスガンドたちが消えて……？　私達、助かったのでしょうか？";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[白い猫]";
		mes "……";
		unittalk '@n20,"白い猫 : ……";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "……猫様？";
		unittalk "レハール : ……猫様？";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[白い猫]";
		mes "ニャアアー";
		unittalk '@n20,"白い猫 : ニャアアー";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "猫様!!";
		mes "また助けてくれたんですね！";
		unittalk "レハール : 猫様!!　また助けてくれたんですね！";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[白い猫]";
		mes "ニャ゛ア゛ア゛ッー";
		unittalk '@n20,"白い猫 : ニャ゛ア゛ア゛ッー";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "やっぱり！";
		mes "ありがとうございます！";
		unittalk "レハール : やっぱり！　ありがとうございます！";
		next;
		emotion 1,"";
		menu "言ってることがわかるの？",-;
		cutin "ep19_lehar06.png", 2;
		mes "[レハール]";
		mes "いいえ！";
		mes "単にそんな気がしただけです！";
		unittalk getcharid(3),strcharinfo(0)+" : 言ってることがわかるの？",1;
		unittalk "レハール : 単にそんな気がしただけです！";
		next;
		emotion 4,"";
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ところで……";
		mes "あの者たちはどこへ飛ばしましたか？";
		unittalk "レハール : あの者たちはどこへ飛ばしましたか？";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[白い猫]";
		mes "ヴェエ゛エ゛ッ～";
		unittalk '@n20,"白い猫 : ヴェエ゛エ゛ッ～";
		next;
		menu "なんと言ってます？",-;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "すいません。";
		mes "やっぱり何を言ってるか";
		mes "わかりません……。";
		unittalk getcharid(3),strcharinfo(0)+" : なんと言ってます？";
		unittalk "レハール : やっぱり何を言ってるかわかりません……。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "猫様、私たちと一緒に";
		mes "来てもらえませんか？";
		mes "ぜひとも、お礼をしたいのですが。";
		unittalk "レハール : 猫様、私たちと一緒に来てもらえませんか？";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[白い猫]";
		mes "ニャ゛ア゛ア゛ッ！！";
		unittalk '@n20,"白い猫 : ニャ゛ア゛ア゛ッ！！";
		next;
		misceffect 562;
		emotion 0;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "う～～ん……ダメっぽいですね。";
		mes "あ、あれ？";
		unittalk "レハール : う～～ん……ダメっぽいですね。";
		next;
		delmisceffect 562;
		cutin "ep20_nyar05.png", 1;
		mes "[白い猫]";
		mes "ニャアアアーーー";
		unittalk '@n20,"白い猫 : ニャアアアーーー";
		next;
		menu "レハール！",-;
		cutin "ep20_nyar04.png", 1;
		mes "[白い猫]";
		mes "オ゛オ゛ッー";
		unittalk '@n20,"白い猫 : オ゛オ゛ッー";
		next;
		cutin "ep20_nyar01.png", 255;
		mes "‐白い猫は、こちらの様子を";
		mes "　しばらく見つめた後";
		mes "　ゆっくりと歩きだした。";
		mes "　付いて来いと言っているようだ‐";
		unittalk getcharid(3),strcharinfo(0)+" : ‐白い猫は、付いて来いと言っているようだ‐";
		setnpcspeed 200,getmdnpcname("白い猫#20ms20");
		npcwalkto 57,317,getmdnpcname("白い猫#20ms20");
		close2;
		misceffect 247,getmdnpcname("#20w21");
		hideoffnpc getmdnpcname("#20w21");
		set .scean,4;
		end;
	}
	if(.scean == 4) {
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "わぁ、これって何なんでしょう？";
		close2;
		cutin "ep19_lehar05.png", 255;
		end;
	}
	cutin "ep19_lehar01.png", 1;
	mes "[レハール]";
	mes "合流できましたね。";
	mes "さて、無事に帰れるでしょうか……。";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,49,330,5	script(HIDDEN)	ハートハンター#20msd20	21994,{}
1@twsd.gat,55,333,5	script(HIDDEN)	ハートハンター#20msd21	21994,{}
1@twsd.gat,62,334,5	script(HIDDEN)	ハートハンター#20msd22	21994,{}
1@twsd.gat,45,322,3	script(HIDDEN)	ハートハンター#20msd23	21994,{}
1@twsd.gat,54,321,5	script(HIDDEN)	ハートハンター#20msd24	21994,{}
1@twsd.gat,51,327,5	script(HIDDEN)	ルガン呪術師#20msd20	21993,{}
1@twsd.gat,56,332,3	script(HIDDEN)	ルガン呪術師#20msd21	21987,{}
1@twsd.gat,61,324,1	script(HIDDEN)	ルガン呪術師#20msd22	21987,{}
1@twsd.gat,50,323,1	script(HIDDEN)	ルガン主教#20msd20	10473,{}
1@twsd.gat,53,330,3	script(HIDDEN)	ルガン主教#20msd21	10474,{}
1@twsd.gat,57,323,1	script(HIDDEN)	ルガン主教#20msd22	10475,{}

1@twsd.gat,53,327,3	script2(HIDDEN)	白い猫#20ms20	10537,{
	unittalk "白い猫 : ウ゛ェエ゛エ゛ッ～";
	end;
}

1@twsd.gat,56,315,0	script(HIDDEN)	#20w21	45,2,2,{
	if(EP20_1QUE == 46) {
		chgquest 17707,17708;
		set EP20_1QUE,47;
	}
	warp "jor_back1.gat",363,222;
	end;
}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn5	-1,{
OnStart:
	hideonnpc getmdnpcname("ハートハンター#20msd20");
	hideonnpc getmdnpcname("ハートハンター#20msd21");
	hideonnpc getmdnpcname("ハートハンター#20msd22");
	hideonnpc getmdnpcname("ハートハンター#20msd23");
	hideonnpc getmdnpcname("ハートハンター#20msd24");
	monster getmdmapname("1@twsd.gat"),49,330,"ハートハンター#1",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),55,333,"ハートハンター#2",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),62,334,"ハートハンター#3",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),45,322,"ハートハンター#4",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),54,321,"ハートハンター#5",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn5")+"::OnKilled"))
		end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("サレクガンド#20msd20")),"サレクガンド : こいつらの手を借りることになるとは！";
	set .scean,1;
	end;
OnStart2:
	hideonnpc getmdnpcname("ルガン呪術師#20msd20");
	hideonnpc getmdnpcname("ルガン呪術師#20msd21");
	hideonnpc getmdnpcname("ルガン呪術師#20msd22");
	monster getmdmapname("1@twsd.gat"),51,327,"ルガン呪術師#1",21993,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),56,332,"ルガン呪術師#2",21993,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),61,324,"ルガン呪術師#3",21993,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2"))
		end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("バゴット#20msd20")),"バゴット : ほぉ……。";
	set .scean,2;
	end;
}





/*
21972,Jガーディアン-P＠ホーリーアタック,chase,189,1,2000,0,0,no,target,always,0,,,,,,
21994,ハートハンター#1＠バッシュ,attack,5,1,2000,0,2334021,no,target,always,0,,,,,,
21994,ハートハンター#1＠コンボアタック,attack,171,4,2000,0,132,no,target,always,0,,,,,,
21994,ハートハンター#1＠メンタルブレイカー,attack,159,0,2000,0,1882,no,target,always,0,,,,,,
21994,ハートハンター#3＠ソウルブレイカー,chase,379,0,2000,500,0,no,target,always,0,,,,,,
21994,ハートハンター#1＠クリティカルスラッシュ,attack,170,1,2000,0,0,no,target,always,0,,,,,,
21991,Jガーディアン-P#3＠ホーリーアタック,chase,189,1,2000,0,0,no,target,always,0,,,,,,
21992,Jガーディアン-Y#2＠ポイズンアタック,chase,188,1,2000,0,10365,no,target,always,0,,,,,,
21992,Jガーディアン-Y#2＠プロボック,chase,6,5,2000,0,0,no,target,always,0,,,,,,
21993,ルガン呪術師#2＠ポイズンアタック,attack,188,1,2000,0,2497482,no,target,always,0,,,,,,
21993,ルガン呪術師#2＠ブラッドドレイン,attack,199,1,2000,0,87,no,target,always,0,,,,,,
21993,ルガン呪術師#1＠コールドボルト,chase,14,0,2000,500,1180,no,target,always,0,,,,,,
21993,ルガン呪術師#2＠ダークサンダー,attack,341,6,2000,700,34,no,target,always,0,,,,,,
21993,ルガン呪術師#1＠サイトラッシャー,chase,81,10,2000,0,5,no,target,always,0,,,,,,
21993,ルガン呪術師#1＠ファイアーボルト,chase,19,0,2000,500,2529,no,target,always,0,,,,,,
21993,ルガン呪術師#2＠サンダーストーム,attack,21,0,2000,700,29,no,target,always,0,,,,,,
21993,ルガン呪術師#3＠ライトニングボルト,chase,20,0,2000,500,569,no,target,always,0,,,,,,
21993,ルガン呪術師#1＠スプラッシュアタック,attack,174,1,2000,0,7,no,target,always,0,,,,,,
21993,ルガン呪術師#2＠カースアタック,attack,181,0,2000,500,0,no,target,always,0,,,,,,
*/