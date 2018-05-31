1@uns.gat,143,36,3	script	ベリティ#room1	10078,{/* 60061 (hide)*/
	mes "[ベリティ]";
	mes "うっ……";
	mes "急に気持ちが悪く……。";
	cutin "EP15_2_brt_6.bmp", 2;
	npctalk "ベリティ : うっ……急に気持ちが悪く……。";
	next;
	mes "[ベリティ]";
	mes "頭が……";
	mes "割れる……くっ！";
	npctalk "ベリティ : 頭が……割れる……くっ！";
	next;
	mes "[ベリティ]";
	mes "ううっ……。";
	npctalk "ベリティ : ううっ……。";
	next;
	mes "[テューリアン]";
	mes "ちょっとお姉さん！";
	mes "大丈夫か!?";
	cutin "bu_du5.bmp", 2;
	npctalk "テューリアン : ちょっとお姉さん！　大丈夫か!?";
	next;
	mes "[ベリティ]";
	mes "……カエ……らなきゃ。";
	cutin "EP15_2_brt_7.bmp", 2;
	npctalk "ベリティ : ……カエ……らなきゃ。";
	next;
	mes "[タマリン]";
	mes "ベリティさん！";
	mes "大丈夫ですか!?";
	cutin "ep143_tahuk.bmp", 2;
	npctalk "タマリン : ベリティさん！　大丈夫ですか!?";
	next;
	mes "[ベリティ]";
	mes "少し……休ませてくれる？";
	cutin "EP15_2_brt_6.bmp", 2;
	npctalk "ベリティ : 少し……休ませてくれる？";
	next;
	mes "[テューリアン]";
	mes "どうやらお姉さんは";
	mes "戻ったほうが良さそうだな。";
	cutin "bu_du1.bmp", 2;
	npctalk "テューリアン : どうやらお姉さんは戻ったほうが良さそうだな。";
	next;
	mes "[ベリティ]";
	mes "いえ……";
	mes "私もすぐに追いかけるわ。";
	mes "気にせず先に進んで頂戴。";
	cutin "EP15_2_brt_4.bmp", 2;
	npctalk "ベリティ : いえ……私もすぐに追いかけるわ。気にせず先に進んで頂戴。";
	next;
	mes "[タマリン]";
	mes "それでは私が付き添います。";
	mes "テューリアン達は気にせず";
	mes "先に進んでください。";
	cutin "ep143_taang.bmp", 2;
	npctalk "タマリン : それでは私が付き添います。テューリアン達は気にせず先に進んでください。";
	initnpctimer;
	close2;
	cutin "ep143_taang.bmp", 255;
	end;
OnTimer:
	announce "システムメッセージ : 警告、警告。", 0x1, 0xff0000, 0x190, 12, 0, 0;
	hideonnpc "ベリティ#room1"; //60061
	hideonnpc "テューリアン#room1"; //60062
	hideonnpc "タマリン#room1"; //60063
	hideonnpc "マークイシャ#room1"; //60064
	hideonnpc "マギスティン#room1"; //60065
	hideonnpc "アルプオカート#room1"; //60066
	hideonnpc "#lrdoor2"; //60068
	announce "システムメッセージ : 第1区域に侵入者を確認。直ちに退去してください。", 0x1, 0xff0000, 0x190, 12, 0, 0;
	announce "システムメッセージ : 警告の無視を確認。侵入者は敵性存在と判断。", 0x1, 0xff0000, 0x190, 12, 0, 0;
	announce "システムメッセージ : 自動防衛システム起動。", 0x1, 0xff0000, 0x190, 12, 0, 0;
	announce "システムメッセージ : システム起動完了、オールグリーン。", 0x1, 0xff0000, 0x190, 12, 0, 0;
	announce "システムメッセージ : 入口を閉鎖後、侵入者の排除を開始。", 0x1, 0xff0000, 0x190, 12, 0, 0;
	hideonnpc "#lrdoor1"; //60067
	end;

	announce "システムメッセージ : 侵入者を排除します。", 0x1, 0xff0000, 0x190, 12, 0, 0;
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
1@uns.gat,141,49,0	script	#lrdoor1	139,4,2,{/* 60067 */
	misceffect 52,""; //self
	pushpc 0, 2;
}
1@uns.gat,140,45,0	script	#lrdoor2	139,{/* 60068 (hide)*/}
