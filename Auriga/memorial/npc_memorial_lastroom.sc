1@uns.gat,143,36,3	script	ベリティ#room1	10078,{/* 60061 (hide)*/
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		close;
	}
	mes "[ベリティ]";
	mes "うっ……";
	mes "急に気持ちが悪く……。";
	cutin "EP15_2_brt_6.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room1")),"ベリティ : うっ……急に気持ちが悪く……。";	// 33403
	next;
	mes "[ベリティ]";
	mes "頭が……";
	mes "割れる……くっ！";
	unittalk getnpcid(0,getmdnpcname("ベリティ#room1")),"ベリティ : 頭が……割れる……くっ！";	// 33403
	next;
	mes "[ベリティ]";
	mes "ううっ……。";
	unittalk getnpcid(0,getmdnpcname("ベリティ#room1")),"ベリティ : ううっ……。";	// 33403
	next;
	mes "[テューリアン]";
	mes "ちょっとお姉さん！";
	mes "大丈夫か!?";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("テューリアン#room1")),"テューリアン : ちょっとお姉さん！　大丈夫か!?";	// 40672
	next;
	mes "[ベリティ]";
	mes "……カエ……らなきゃ。";
	cutin "EP15_2_brt_7.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room1")),"ベリティ : ……カエ……らなきゃ。";	// 33403
	next;
	mes "[タマリン]";
	mes "ベリティさん！";
	mes "大丈夫ですか!?";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("タマリン#room1")),"タマリン : ベリティさん！　大丈夫ですか!?";	// 21872
	next;
	mes "[ベリティ]";
	mes "少し……休ませてくれる？";
	cutin "EP15_2_brt_6.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room1")),"ベリティ : 少し……休ませてくれる？";	// 33403
	next;
	mes "[テューリアン]";
	mes "どうやらお姉さんは";
	mes "戻ったほうが良さそうだな。";
	cutin "bu_du1.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("テューリアン#room1")),"テューリアン : どうやらお姉さんは戻ったほうが良さそうだな。";	// 40672
	next;
	mes "[ベリティ]";
	mes "いえ……";
	mes "私もすぐに追いかけるわ。";
	mes "気にせず先に進んで頂戴。";
	cutin "EP15_2_brt_4.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room1")),"ベリティ : いえ……私もすぐに追いかけるわ。気にせず先に進んで頂戴。";	// 33403
	next;
	mes "[タマリン]";
	mes "それでは私が付き添います。";
	mes "テューリアン達は気にせず";
	mes "先に進んでください。";
	cutin "ep143_taang.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("タマリン#room1")),"タマリン : それでは私が付き添います。テューリアン達は気にせず先に進んでください。";	// 21872
	donpcevent getmdnpcname("#lrdoor2")+"::OnStart";
	close2;
	cutin "ep143_taang.bmp", 255;
	end;
}
1@uns.gat,142,38,5	script	テューリアン#room1	628,{/* 60062 (hide)*/
	mes "[テューリアン]";
	mes "しかし……";
	mes "なんだここは!?";
	mes "悪の秘密結社が使っていた";
	mes "地下のアジトなのか!?";
	cutin "bu_du5.bmp", 2;
	close2;
	cutin "bu_du5.bmp", 255;
	end;
}
1@uns.gat,145,37,3	script	タマリン#room1	10027,{/* 60063 (hide)*/
	mes "[タマリン]";
	mes "ベリティさん、大丈夫ですか？";
	mes "彼女は私が見ていますから、";
	mes "皆さんは、先に進んでください。";
	cutin "ep143_taang.bmp", 2;
	close2;
	cutin "ep143_taang.bmp", 255;
	end;
}
1@uns.gat,139,41,3	script	マークイシャ#room1	616,{/* 60064 */
	mes "[マークイシャ]";
	mes "ここは……嫌な感じがする。";
	mes "みんな！　気を付けて進もう！";
	cutin "bu_mark4.bmp", 0;
	close2;
	cutin "bu_mark4.bmp", 255;
	end;
}
1@uns.gat,142,39,5	script	マギスティン#room1	612,{/* 60065 */
	mes "[マギスティン]";
	mes "なぜでしょう……。";
	mes "何だかここにいると、";
	mes "自分がこの世界に独りのような";
	mes "気分になります……。";
	cutin "bu_maggi4.bmp", 2;
	close2;
	cutin "bu_maggi4.bmp", 255;
	end;
}
1@uns.gat,145,32,5	script	アルプオカート#room1	615,{/* 60066 (hide)*/
	mes "[アルプオカート]";
	mes "あちらこちらに怪しい痕跡がある。";
	mes "何か重い機械が通ったような……。";
	cutin "bu_alp1.bmp", 2;
	close2;
	cutin "bu_alp1.bmp", 255;
	end;
}
1@uns.gat,141,49,0	script	#lrdoor1	139,5,5,{/* 60067 */
	misceffect 52,""; //self
	pushpc 0, 2;
	end;
}
1@uns.gat,140,45,0	script	#lrdoor2	139,{/* 60068 (hide)*/
OnStart:
	initnpctimer;
	announce "システムメッセージ : 警告、警告。", 0x9, 0xff0000;
	hideonnpc getmdnpcname("ベリティ#room1");	// 33403
	hideonnpc getmdnpcname("テューリアン#room1");	// 40672
	hideonnpc getmdnpcname("タマリン#room1");	// 21872
	hideonnpc getmdnpcname("マークイシャ#room1");	// 60021
	hideonnpc getmdnpcname("マギスティン#room1");	// 83656
	hideonnpc getmdnpcname("アルプオカート#room1");	// 59533
	end;
OnTimer2000:
	announce "システムメッセージ : 第1区域に侵入者を確認。直ちに退去してください。", 0x9, 0xff0000;
	end;
OnTimer4000:
	announce "システムメッセージ : 警告の無視を確認。侵入者は敵性存在と判断。", 0x9, 0xff0000;
	end;
OnTimer6000:
	announce "システムメッセージ : 自動防衛システム起動。", 0x9, 0xff0000;
	end;
OnTimer8000:
	announce "システムメッセージ : システム起動完了、オールグリーン。", 0x9, 0xff0000;
	end;
OnTimer10000:
	announce "システムメッセージ : 入口を閉鎖後、侵入者の排除を開始。", 0x9, 0xff0000;
	areamonster getmdmapname("1@uns.gat"),30,33,70,73,"システムメッセージ1",3253,1,getmdnpcname("#lrdoor2")+"::OnKilled";
	callsub L_MobCall;
	hideonnpc getmdnpcname("#lrdoor1");	// 48900
	end;
OnTimer310000:
	announce "システムメッセージ : 侵入者を排除します。", 0x9, 0xff0000;
	callsub L_MobCall;
	end;
OnTimer610000:
	stopnpctimer;
	announce "システムメッセージ : 侵入者を排除します。", 0x9, 0xff0000;
	callsub L_MobCall;
	end;
L_MobCall:
	set '@map$,getmdmapname("1@uns.gat");
	set '@label$,getmdnpcname("#lrdoor2")+"::OnKilled";
	areamonster '@map$,125,44,145, 64,"機械部品",3251,3,'@label$;
	areamonster '@map$,117,50,137, 70,"機械部品",3251,3,'@label$;
	areamonster '@map$, 77,59, 97, 79,"機械部品",3251,3,'@label$;
	areamonster '@map$, 53,86, 73,106,"機械部品",3251,3,'@label$;
	areamonster '@map$,125,44,145, 64,"機械部品",3252,3,'@label$;
	areamonster '@map$,117,50,137, 70,"機械部品",3252,3,'@label$;
	areamonster '@map$, 77,59, 97, 79,"機械部品",3252,3,'@label$;
	areamonster '@map$, 53,86, 73,106,"機械部品",3252,3,'@label$;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@uns.gat"),getmdnpcname("#lrdoor2")+ "::OnKilled");
	if('@count <= 0) {
		stopnpctimer;
		announce "システムメッセージ : 自動防衛システムに障害発生。ホットスタンバイによる待機システムに処理を移行します。", 0x9, 0xff0000;
		hideoffnpc getmdnpcname("タマリン#room2");	// 21872
	}
	end;
}
1@uns.gat,87,129,3	script	タマリン#room2	10027,{/* 90150 (hide)*/
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		close;
	}
	mes "[タマリン]";
	mes "はあ……はあ……。";
	mes "ベリティさんが……";
	mes "いきなり……";
	mes "立つことも出来なかった";
	mes "はずなのに……。";
	cutin "ep143_tahuk.bmp", 2;
	unittalk "タマリン : はあ……はあ……。ベリティさんが……いきなり……立つことも出来なかったはずなのに……。";	// 21390
	next;
	mes "[タマリン]";
	mes "追いかけられないくらい……";
	mes "早くて……はあはあ……。";
	unittalk "タマリン : 追いかけられないくらい早くて……はあはあ……。";	// 21390
	next;
	announce "システムメッセージ : 正体不明の物体が第1区域より第2区域に移動中。", 0x9, 0xff0000;
	mes "[タマリン]";
	mes "まさかベリティさんが";
	mes "もうあそこまで……。";
	unittalk "タマリン : まさかベリティさんがもうあそこまで……。";	// 21390
	next;
	announce "システムメッセージ : 緊急プロトコルを実行します。", 0x9, 0xff0000;
	mes "[タマリン]";
	mes "早くベリティさんを";
	mes "探しに行かないと……！";
	unittalk "タマリン : 早くベリティさんを探しに行かないと……！";	// 21390
	next;
	mes "[タマリン]";
	mes "道は一本道ですから";
	mes "早く行ってみましょう！";
	unittalk "タマリン : 道は一本道ですから早く行ってみましょう！";	// 21390
	close2;
	if('flag == 0) {
		set 'flag,1;
		misceffect 35,getmdnpcname("#lrdoor4");	// 22338
		hideoffnpc getmdnpcname("#lrdoor4");	// 22338
	}
	cutin "ep143_tahuk.bmp", 255;
	end;
}
1@uns.gat,100,121,0	warp	#lrdoor4	2,2,1@uns.gat,145,107

1@uns.gat,157,94,0	script	#lrboom1	550,2,2,{/* 45212 */
	end;
OnTouch:
	set '@num,substr(strnpcname(2),6);
	areamonster getmdmapname("1@uns.gat"),178,34,198,54,"機械部品",(3251 + (('@num-1) % 2)), 3;
	announce "システムメッセージ : 第2区域で侵入者を確認。排除します。", 0x9, 0xff0000;
	hideonnpc;
	end;
}
1@uns.gat,164,97,0	duplicate(#lrboom1)	#lrboom2	550,2,2
1@uns.gat,166,92,0	duplicate(#lrboom1)	#lrboom3	550,2,2
1@uns.gat,170,96,0	duplicate(#lrboom1)	#lrboom4	550,2,2
1@uns.gat,175,93,0	duplicate(#lrboom1)	#lrboom5	550,2,2
1@uns.gat,190,97,0	duplicate(#lrboom1)	#lrboom6	550,2,2
1@uns.gat,194,94,0	duplicate(#lrboom1)	#lrboom7	550,2,2
1@uns.gat,199,96,0	duplicate(#lrboom1)	#lrboom8	550,2,2
1@uns.gat,206,93,0	duplicate(#lrboom1)	#lrboom9	550,2,2
1@uns.gat,217,91,0	duplicate(#lrboom1)	#lrboom10	550,2,2
1@uns.gat,224,79,0	duplicate(#lrboom1)	#lrboom11	550,2,2
1@uns.gat,227,73,0	duplicate(#lrboom1)	#lrboom12	550,2,2
1@uns.gat,227,69,0	duplicate(#lrboom1)	#lrboom13	550,2,2
1@uns.gat,220,63,0	duplicate(#lrboom1)	#lrboom14	550,2,2
1@uns.gat,201,60,0	duplicate(#lrboom1)	#lrboom15	550,2,2

1@uns.gat,224,29,3	script	ベリティ#room2	10078,{/* 62636 */
	mes "[ベリティ]";
	mes "う……ここは……";
	mes "なぜ……私がここに？";
	cutin "EP15_2_brt_6.bmp", 2;
	next;
	mes "[ベリティ]";
	mes "頭が……うっ……";
	mes "割れそうに……";
	mes "この扉の奥から……";
	mes "何か……音が……。";
	next;
	if(select("立ち去る","奥に進む") == 1) {
		mes "[ベリティ]";
		mes "カエ……カエらないと……。";
		cutin "EP15_2_brt_7.bmp", 2;
		close2;
		cutin "EP15_2_brt_7.bmp", 255;
		end;
	}
	mes "[ベリティ]";
	mes "早く……カエらないと……。";
	cutin "EP15_2_brt_7.bmp", 2;
	close2;
	cutin "EP15_2_brt_7.bmp", 255;
	warp getmdmapname("1@uns.gat"),240,255;
	end;
}

1@uns.gat,242,253,3	script	ベリティ#room3	10078,{/* 77388 */
	mes "[ベリティ]";
	mes "やっと……帰ってきた……。";
	mes "本当にやっと……。";
	cutin "EP15_2_brt_7.bmp", 2;
	close2;
	hideonnpc getmdnpcname("ベリティ#room3");	// 77388
	donpcevent getmdnpcname("#bosslr")+"::OnStart";	// 77388
	cutin "EP15_2_brt_7.bmp", 255;
	end;
}

1@uns.gat,1,1,0	script	#bosslr	139,{
	end;
OnStart:
	sleep 2000;
	announce "システムメッセージ : マザールームで侵入者を確認。", 0x9, 0xff0000;
	sleep 2000;
	announce "システムメッセージ : 全システムのプライオリティを強制変更。", 0x9, 0xff0000;
	sleep 2000;
	announce "システムメッセージ : 侵入者の排除を最優先事項に設定。全システム戦闘モードに移行します。", 0x9, 0xff0000;
	hideoffnpc getmdnpcname(getmdnpcname("ベリティ#battle1"));	// 47199
	areamonster getmdmapname("1@uns.gat"),225,250,265,280,"システムメッセージ2",3493,5,getmdnpcname("#bosslr")+"::OnKilled";
	sleep 2000;
	announce "システムメッセージ : ……を守るためのプロセスを実行。非関係者は速やかに退避してください。", 0x9, 0xff0000;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@uns.gat"),getmdnpcname("#bosslr")+ "::OnKilled") + 1;
	if(rand('@count) == 0) {
		initnpctimer;
		killmonster getmdmapname("1@uns.gat"),getmdnpcname("#bosslr")+"::OnKilled";
		hideoffnpc getmdnpcname("システムメッセージ#batt");	// 98902
		announce "システムメッセージ : 防衛システムにエラー発生。", 0x9, 0xff0000;
		unittalk getnpcid(0,getmdnpcname("システムメッセージ#batt")),"システムメッセージ : 防衛システムにエラー発生。";	// 98902
	}
	end;
OnKilled2:
	end;
OnTimer2000:
	unittalk getnpcid(0,getmdnpcname("ベリティ#battle1")),"ベリティ : ……。";	// 47199
	end;
OnTimer4000:
	unittalk getnpcid(0,getmdnpcname("ベリティ#battle1")),"ベリティ : 排除……。制御……変更。";	// 47199
	misceffect 432,getmdnpcname("ベリティ#battle1");	// 47199
	end;
OnTimer5000:
	misceffect 452,getmdnpcname("ベリティ#battle1");	// 47199
	end;
OnTimer6000:
	misceffect 257,getmdnpcname("ベリティ#battle1");	// 47199
	end;
OnTimer7000:
	misceffect 30,getmdnpcname("ベリティ#battle1");	// 47199
	end;
OnTimer8000:
	unittalk getnpcid(0,getmdnpcname("ベリティ#battle1")),"ベリティ : ……制御……確認。";	// 47199
	end;
OnTimer10000:
	unittalk getnpcid(0,getmdnpcname("ベリティ#battle1")),"ベリティ : システムメッセージ1による補助システム構成……構築完了。";	// 47199
	end;
OnTimer12000:
	unittalk getnpcid(0,getmdnpcname("ベリティ#battle1")),"ベリティ : 主目的を出力補助に設定……起動確認。";	// 47199
	end;
OnTimer14000:
	announce "システムメッセージ : T_W_O_002bによる制御を確認。侵入者の排除を再開。", 0x9, 0xff0000;
	misceffect 514,getmdnpcname("ベリティ#battle1");	// 47199
	misceffect 94,getmdnpcname("ベリティ#battle1");	// 47199
	end;
OnTimer16000:
	misceffect 8,getmdnpcname("ベリティ#battle1");	// 47199
	misceffect 263,getmdnpcname("ベリティ#battle1");	// 47199
	misceffect 220,getmdnpcname("ベリティ#battle1");	// 47199
	end;
OnTimer18000:
	hideonnpc getmdnpcname("ベリティ#battle1");	// 47199
	hideonnpc getmdnpcname("システムメッセージ#batt");	// 98902
	monster getmdmapname("1@uns.gat"),245,265,"T_W_O#002b",3254,1,getmdnpcname("#bosslr")+"::OnBossKilled";
	areamonster getmdmapname("1@uns.gat"),225,250,265,280,"システムメッセージ1#2",3253,4,getmdnpcname("#bosslr")+"::OnKilled2";
	end;
	end;
OnTimer20000:
	announce "テューリアン : 急にどうしちまったんだよお姉さん！　くそっ……凄い力だ！", 0x9, 0x00ff00;
	end;
OnTimer24000:
	announce "タマリン : あのシステムメッセージ1と呼んでいた物体……あれがエネルギーを供給しているようですね。", 0x9, 0x00ff00;
	end;
OnTimer28000:
	stopnpctimer;
	announce "タマリン : システムメッセージ1を倒せば、力を落とせるかも知れません！", 0x9, 0x00ff00;
	end;
OnBossKilled:
	stopnpctimer;
	killmonster getmdmapname("1@uns.gat"),getmdnpcname("#bosslr")+"::OnKilled2";
	announce "システムメッセージ : 侵入者の排除に失敗。地域閉鎖を行います。", 0x9, 0xff0000;
	hideoffnpc getmdnpcname("ベリティ#room4");	// 62749
	hideoffnpc getmdnpcname("タマリン#room4");	// 54343
	hideoffnpc getmdnpcname("テューリアン#room4");	// 80038
	hideoffnpc getmdnpcname("マークイシャ#room4");	// 50139
	hideoffnpc getmdnpcname("マギスティン#room4");	// 68880
	hideoffnpc getmdnpcname("アルプオカート#room4");	// 82489
	end;
}

1@uns.gat,246,266,3	script	システムメッセージ#batt	3253,{/* 98902 (hide)*/}
1@uns.gat,245,265,3	script	ベリティ#battle1	10078,{/* 47199 (hide)*/
	emotion 9;
	end;
}

1@uns.gat,242,253,3	script	ベリティ#room4	10078,{/* 62749 (hide)*/
	mes "[テューリアン]";
	mes "姉さん！";
	mes "急にどうしたんだ！";
	mes "大丈夫か!?";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("テューリアン#room4")),"テューリアン :  姉さん！　急にどうしたんだ！　大丈夫か!?";	// 80038
	next;
	mes "[タマリン]";
	mes "ベリティさん！";
	mes "しっかりして下さい！";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("タマリン#room4")),"タマリン : ベリティさん！　しっかりして下さい！";	// 54343
	next;
	mes "[マークイシャ]";
	mes "みんなどいて！";
	mes "私がひとまずヒールを！";
	cutin "bu_mark4.bmp", 0;
	unittalk getnpcid(0,getmdnpcname("マークイシャ#room4")),"マークイシャ : みんなどいて！　私がひとまずヒールを！";	// 50139
	next;
	mes "[ベリティ]";
	mes "わ、悪いわね……。";
	cutin "EP15_2_brt_4.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room4")),"ベリティ : わ、悪いわね……。";	// 62749
	next;
	mes "[ベリティ]";
	mes "って……あら……";
	mes "あなた達、どうかしたの？";
	mes "深刻な顔をして。";
	cutin "EP15_2_brt_5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room4")),"ベリティ : って……あら……あなた達、どうかしたの？　深刻な顔をして。";	// 62749
	next;
	mes "[テューリアン]";
	mes "なにいってるんだ、姉さん！";
	mes "どうしたんだ!?は、";
	mes "こっちの台詞だぞ!?";
	cutin "bu_du3.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("テューリアン#room4")),"テューリアン : なにいってるんだ、姉さん！　どうしたんだ!?は、こっちの台詞だぞ!?";	// 80038
	next;
	mes "[ベリティ]";
	mes "……どういうこと？";
	cutin "EP15_2_brt_5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room4")),"ベリティ : ……どういうこと？";	// 62749
	next;
	mes "[ベリティ]";
	mes "そういえば……";
	mes "ここはどこなの？ ";
	cutin "EP15_2_brt_3.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("ベリティ#room4")),"ベリティ : そういえば……ここはどこなの？";	// 62749
	next;
	mes "[タマリン]";
	mes "ベリティさん、本当に何も";
	mes "覚えていませんか？";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("タマリン#room4")),"タマリン : ベリティさん、本当に何も覚えていませんか？";	// 54343
	next;
	mes "[ベリティ]";
	mes "そうね……。";
	mes "地下に降りてから";
	mes "頭が破裂しそうなくらい";
	mes "痛かったけど……。";
	unittalk getnpcid(0,getmdnpcname("ベリティ#room4")),"ベリティ : そうね……。地下に降りてから頭が破裂しそうなくらい痛かったけど……。";	// 62749
	cutin "EP15_2_brt_3.bmp", 2;
	next;
	mes "[ベリティ]";
	mes "それ以降は覚えてないわね……。";
	unittalk getnpcid(0,getmdnpcname("ベリティ#room4")),"ベリティ : それ以降は覚えてないわね……。";	// 62749
	cutin "EP15_2_brt_5.bmp", 2;
	next;
	mes "[テューリアン]";
	mes "それじゃあさっき";
	mes "俺たちを襲ってきたのは……？";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("テューリアン#room4")),"テューリアン : それじゃあさっき俺たちを襲ってきたのは……？";	// 80038
	next;
	mes "[アルプオカート]";
	mes "おい、今は悠長に話をしている";
	mes "時間はなさそうだぞ。";
	cutin "bu_alp3.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("アルプオカート#room4")),"アルプオカート : おい、今は悠長に話をしている時間はなさそうだぞ。";	// 82489
	next;
	mes "[テューリアン]";
	mes "しかしだな！";
	mes "さっきのは絶対……。";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("テューリアン#room4")),"テューリアン : しかしだな！　さっきのは絶対……。";	// 80038
	next;
	mes "[アルプオカート]";
	mes "……この音が聞こえないか？";
	mes "何かがここに向かっている。";
	cutin "bu_alp1.bmp", 2;
	soundeffect "lava_golem_attack.wav", 0, 0;	// 62749
	unittalk getnpcid(0,getmdnpcname("アルプオカート#room4")),"アルプオカート : ……この音が聞こえないか？　何かがここに向かっている。";	// 82489
	next;
	mes "[タマリン]";
	mes "そういえば地面も少し";
	mes "揺れている感じがしませんか？";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("タマリン#room4")),"タマリン : そういえば地面も少し揺れている感じがしませんか？";	// 54343
	next;
	mes "[マギスティン]";
	mes "どんどん揺れが酷く";
	mes "なっています……！";
	misceffect 522,"";	// self
	cutin "bu_maggi4.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("マギスティン#room4")),"マギスティン : どんどん揺れが酷くなっています……！";	// 68880
	next;
	mes "[アルプオカート]";
	mes "ここは危険だ。";
	mes "すぐに脱出した方が良い。";
	mes "抜け道らしきものは見つけておいた。";
	cutin "bu_alp2.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("アルプオカート#room4")),"アルプオカート : ここは危険だ。すぐに脱出した方が良い。抜け道らしきものは見つけておいた。";	// 82489
	next;
	mes "[マークイシャ]";
	mes "わ、わかった！";
	mes "私達は後から行きますから、ベリティさんと";
	mes "先に一緒に脱出してください！";
	cutin "bu_mark4.bmp", 0;
	unittalk getnpcid(0,getmdnpcname("マークイシャ#room4")),"マークイシャ : わ、わかった！　私達は後から行きますから、ベリティさんと先に一緒に脱出してください！";	// 50139
	next;
	menu "ここから出る",-;
	cutin "bu_mark4.bmp", 255;
	warp "verus01.gat",122,187;
	close;
}
1@uns.gat,236,258,1	script	アルプオカート#room4	615,{/* 82489 (hide)*/
	mes "[アルプオカート]";
	mes "安心するにはまだ早い……。";
	mes "俺は念のため、脱出口を調べておく。";
	cutin "bu_alp1.bmp", 2;
	close2;
	cutin "bu_alp1.bmp", 255;
	end;
}
1@uns.gat,244,257,3	script	タマリン#room4	10027,{/* 54343 (hide)*/
	mes "[タマリン]";
	mes "ベリティさん！";
	mes "しっかりして下さい！";
	cutin "ep143_tahuk.bmp", 2;
	close2;
	cutin "ep143_tahuk.bmp", 255;
	end;
}
1@uns.gat,245,254,3	script	マギスティン#room4	612,{/* 68880 (hide)*/
	mes "[マギスティン]";
	mes "ベリティさん……";
	mes "大丈夫ですか？";
	cutin "bu_maggi4.bmp", 2;
	close2;
	cutin "bu_maggi4.bmp", 255;
	end;
}
1@uns.gat,244,254,3	script	テューリアン#room4	628,{/* 80038 (hide)*/
	mes "[テューリアン]";
	mes "姉さん！";
	mes "急にどうしたんだ！";
	mes "大丈夫か!?";
	cutin "bu_du5.bmp", 2;
	close2;
	cutin "bu_du5.bmp", 255;
	end;
}
1@uns.gat,242,255,5	script	マークイシャ#room4	616,{/* 50139 (hide)*/
	mes "[マークイシャ]";
	mes "みんなどいて！";
	mes "私がひとまずヒールを！";
	cutin "bu_mark4.bmp", 0;
	close2;
	cutin "bu_mark4.bmp", 255;
	end;
}
