1@jorlab.gat,0,0,0	script	BagotLabControl1	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@temp_mob[0],callmonster(getmdmapname("1@jorlab.gat"),55,53,"進入不可#55_53",3982,getmdnpcname("BagotLabControl1")+"::OnKilled");
	set '@temp_mob[1],callmonster(getmdmapname("1@jorlab.gat"),60,53,"進入不可#60_53",3982,getmdnpcname("BagotLabControl1")+"::OnKilled");
	for(set '@i,0; '@i < getarraysize('@temp_mob); set '@i,'@i+1)
		setunitgroup 1002,'@temp_mob['@i];
	areasetcell getmdmapname("1@jorlab.gat"),54,52,61,55,1;
	end;
}

1@jorlab.gat,58,49,3	script	入場管理#ep19re3	10046,{/* 72971 */
	mes "^FF0000[インフォメーション]";
	mes "この先へは";
	mes "メモリアルダンジョンの";
	mes "入場条件を満たした";
	mes "異なるゲームアカウントの";
	mes "キャラクターが2人まで、";
	mes "一緒に進むことができます。^000000";
	next;
	mes "[インフォメーション]";
	mes "進入しますか？";
	mes "　";
	mes "^4A0084‐進入キャラクター数： " +.char_cnt+ " / 2‐^000000";
	next;
	if(select("^0000ffはい^000000","いいえ") == 2) {
		mes "‐やめた‐";
		close;
	}
	mes "[インフォメーション]";
	mes "進入します。";
	close2;
	if(.char_cnt >= 2) {
		// 未調査
		mes "[インフォメーション]";
		mes "これ以上進入できません。";
		close;
	}
	set .char_cnt,.char_cnt+1;
	donpcevent getmdnpcname("BagotLabControl2")+ "::OnStart";
	warp getmdmapname("2@jorlab.gat"), 58, 62;
	end;
}

2@jorlab.gat,0,0,0	script	BagotLabControl2	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@temp_mob[0],callmonster(getmdmapname("2@jorlab.gat"),55,53,"進入不可#55_53",3982,getmdnpcname("BagotLabControl2")+"::OnKilled");
	set '@temp_mob[1],callmonster(getmdmapname("2@jorlab.gat"),60,53,"進入不可#60_53",3982,getmdnpcname("BagotLabControl2")+"::OnKilled");
	for(set '@i,0; '@i < getarraysize('@temp_mob); set '@i,'@i+1)
		setunitgroup 1002,'@temp_mob['@i];
	areasetcell getmdmapname("2@jorlab.gat"),54,52,61,55,1;
	donpcevent getmdnpcname("ユンケア#ep19re3")+ "::OnStart";
	end;
}

2@jorlab.gat,58,67,3	script	ユンケア#ep19re3	10455,{/* 66345 */
	switch(.scean) {
	case 0:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			// 未調査
			end;
		}
		if(EP19_1QUE != 57) {
			// 未調査
			end;
		}
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			misceffect 595,"";	// self
			sc_start EFST_MONSTER_TRANSFORM,180000,21530;
		}
		set '@juncea$,getmdnpcname("ユンケア#ep19re3");
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "……来たね。";
		mes "セネキオガンド。";
		mes "待ってたよ。";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "呼ばれて来たけど";
		mes "何のお話ですか？";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "子供のふりをするって";
		mes "難しいよね？";
		mes "苦労したんじゃない？";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "何の話です？";
		mes "どうしたの？";
		mes "なんだか怖い！";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "何か怖いの？";
		mes "今まで仲良くしてたじゃない。";
		mes "なのに急に怖気づくなんて。";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "私と仲良くなりたかったんでしょ？";
		mes "バゴットの悪口を言っていたのも";
		mes "私に近づく為の方法だった。";
		next;
		mes "[ユンケア]";
		mes "でも……相手を間違えたよ。";
		mes "愚かなことにね。";
		next;
		mes "[ユンケア]";
		mes "偉大なぁ……バゴット様がぁ";
		mes "そんな薄っぺらなやり方にぃ";
		mes "騙されると思ったのぉ？";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "偉大な……バゴット様？";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "そう……";
		mes "すでにお前の企みはぁ……";
		mes "全て把握しておら……れ……。";
		next;
		mes "[ユンケア]";
		mes "お前が……ユンケアを…";
		mes "利用しようとしたこともぉ……";
		mes "また…ご存じで……。";
		next;
		mes "[ユンケア]";
		mes "それで私は……あ……？";
		next;
		mes "[ユンケア]";
		mes "私……";
		mes "私は……誰だ？";
		mes "こ、ここは……。";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（ユンケアの様子がおかしい!!";
		mes "　バゴットに何かされたのか!?）";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "何を企んでいようと……";
		mes "お前たちはすでに";
		mes "バゴット様の掌の上……！";
		next;
		cutin "ep19_juncea00.png", 1;
		setnpcdisplay '@juncea$,10456;	// 66345
		mes "[ユンケア]";
		mes "ここで……処理するっ……！";
		next;
		cutin "ep19_juncea04.png", 2;
		setnpcdisplay '@juncea$,10455;	// 66345
		mes "[ユンケア]";
		mes "ああ……あああぁぁぁあっ！";
		next;
		cutin "ep19_juncea00.png", 1;
		setnpcdisplay '@juncea$,10456;	// 66345
		mes "[ユンケア]";
		mes "全ては…バゴット様の………！";
		next;
		cutin "ep19_juncea04.png", 2;
		setnpcdisplay '@juncea$,10455;	// 66345
		mes "[ユンケア]";
		mes "ああぁあぁーーーっ！";
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10456;	// 66345
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10455;	// 66345
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10456;	// 66345
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10455;	// 66345
		next;
		cutin "ep19_juncea00.png", 1;
		setnpcdisplay '@juncea$,10456;	// 66345
		mes "[ユンケア]";
		mes "バゴット様の……御意志っ!!";
		close2;
		cutin "ep19_juncea04.png", 255;
		hideonnpc;	// 66345
		stopnpctimer;
		donpcevent getmdnpcname("BagotLabControl3")+ "::OnStart";
		end;
	case 2:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			misceffect 595,"";	// self
			sc_start EFST_MONSTER_TRANSFORM,180000,21530;
		}
		if(EP19_1QUE == 57) {
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				// 未調査
				end;
			}
			mes "["+strcharinfo(0)+"]";
			mes "（どうにか制圧できたようだ。";
			mes "　ユンケアは気を失っている……)";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "（完全にモンスター化していた。";
			mes "　バゴットが……";
			mes "　ユンケアに何かしたのか？)";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "（ユンケアを説得して";
			mes "　連れ出すつもりだったけど";
			mes "　こうなった以上は……）";
			announce "バゴット : ユンケアが器では、やはり力不足だったんでしょうかぁ？", 0x9, 0x00ffff;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "（ルガンの変身スクロールを使い";
			mes "　姿を変えて連れ出そう）";
			announce "バゴット : バゴットの計算が間違っていましたねぇ。", 0x9, 0x00ffff;
			next;
			setnpcdisplay getmdnpcname("ユンケア#ep19re3"),10470;	// 66345
			mes "["+strcharinfo(0)+"]";
			mes "（急いで、氷の城に戻ろう）";
			announce "バゴット : あのスクロール……バゴットを騙そうとしているのは分かってたけどぉ、あれは興味深いぃ。", 0x9, 0x00ffff;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "（……何か声が聞こえたような？";
			mes "　気のせいか……）";
			announce "バゴット : ……ふふっ。", 0x9, 0x00ffff;
			close2;
			delquest 16659;
			setquest 16661;	// state=1	showevent 0, 1, バゴットの研究室#warp_e;	// 2666: 66, 260 showevent 0, 1, ホルル#if19ms;	// 2544: 27, 126
			set EP19_1QUE,58;
		}
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icecastle.gat", 27, 123;
		end;
	}
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 66345
	end;
}

2@jorlab.gat,0,0,0	script	BagotLabControl3	-1,{
OnStart:
	set .scean,1;
	set '@map$,getmdmapname("2@jorlab.gat");
	set '@label$,getmdnpcname("BagotLabControl3")+"::OnKilled";
	monster '@map$,58,67,"改造されたユンケア#boss",21532,1,'@label$;
	end;
OnKilled:
	set .scean,2;
	setnpcdisplay getmdnpcname("ユンケア#ep19re3"),10457;	// 66345
	hideoffnpc getmdnpcname("ユンケア#ep19re3");	// 66345
	donpcevent getmdnpcname("ユンケア#ep19re3")+ "::OnStart";
	end;
}

//@spawn(type: BL_MOB, ID: 35516, speed: 300, option: 0x0, class: 3982, pos: ("2@jorlab.gat",60,53), dir: 0, name"進入不可#60_53")
//@spawn(type: BL_MOB, ID: 53802, speed: 150, option: 0x0, class: 21532, pos: ("2@jorlab.gat",58,67), dir: 0, name"改造されたユンケア#boss")

/*
150,2016,2016,576
//21532,改造されたユンケア＠カウンターヒール,idle,687,1,3000,0,10000,no,self,rudeattacked,,,,,,,
//21532,改造されたユンケア＠カウンターヒール,walk,687,1,3000,0,10000,no,self,rudeattacked,,,,,,,
21532,改造されたユンケア＠ダークストライク,chase,340,2,2000,200,5000,no,target,always,0,,,,,,
21532,改造されたユンケア＠ダークストライク,attack,340,2,2000,0,5000,no,target,always,0,,,,,,
//21532,改造されたユンケア＠グランドダークネス,attack,339,2,2000,0,30000,yes,self,always,0,,,,,,
//21532,改造されたユンケア＠グランドダークネス,chase,339,2,2000,0,30000,yes,self,always,0,,,,,,
21532,改造されたユンケア＠ダークネスアタック,attack,190,3,2000,0,5000,no,target,always,0,,,,,,
21532,改造されたユンケア＠ブラッドドレイン,attack,199,1,2000,0,5000,no,target,always,0,,,,,,
*/
