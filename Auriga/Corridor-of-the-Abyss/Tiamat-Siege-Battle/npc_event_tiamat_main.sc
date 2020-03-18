1_tiamat_00.gat,0,0,0	script	#tiamat_start	139,{
OnInit:
	initnpctimer;
	end;
OnStart:
OnTimer5000:
//OnClock:
//	initnpctimer;
	set $@tiamat_main,0;
	set $@tiamat_milka,0;
	set $@tiamat_hound,0;
	set $@tiamat_lowen,0;
	donpcevent "#tiamat_inital::OnStart";
	donpcevent "#tiamat_setwall::OnStart";
	donpcevent "tiamat_mob#all::OnStart";
	announce "ティアマト攻城戦が開始されました。参加される方は「プロンテラ深淵(基地[1]～[5])」にお集まりください。", 0;
	end;
OnTimer10000:
	announce "40秒後に王城の中心部への道が開かれます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer20000:
	announce "30秒後に王城の中心部への道が開かれます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer25000:
	announce "王女メア : 準備はよろしいですか。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer30000:
	announce "王女メア : 私の力を使って王城に張られている結界の一部を解除し道を繋げます。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer35000:
	announce "王女メア : そこから王城へ向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer40000:
	announce "10秒後に王女メアが王城の中心部への道を開きます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer45000:
	announce "5……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer46000:
	announce "4……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	hideonnpc "area00#r01"; //54
	misceffect 58, "王女メア#1_tiamat_00"; //55
	end;
OnTimer47000:
	announce "3……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 222, "area00#r01"; //54
	end;
OnTimer48000:
	announce "2……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer49000:
	announce "1……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 488, "area00#r01"; //54
	end;
OnTimer50000:
	stopnpctimer;
	announce "王城への道が開かれた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	set $@tiamat_main,1;
	donpcevent "tiamat_mob#r14::OnStart";
	hideonnpc "王城入口#0B"; //64
	hideonnpc "王城入口#0C"; //65
	hideonnpc "王城入口#0D"; //66
	hideoffnpc "王城入口#0A"; //63
	misceffect 321, "area00#r01"; //54
	hideoffnpc "area00#r01"; //54
	end;
OnMilka:
	announce "四騎士ミルカが次の部屋に進みました", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnHound:
	announce "四騎士ハウンドが次の部屋に進みました", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnLowen:
	announce "四騎士ローウェンが次の部屋に進みました", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
}

1_tiamat_00.gat,195,172,3	script	王女メア#1_tiamat_00	10361,{/* 55 */
	if($@tiamat_main == 0) {
		mes "[王女メア]";
		mes "お待ちしておりました。";
		mes "ここが王城へ続く道です。";
	}
	else if($@tiamat_main) {
		mes "[王女メア]";
		mes "王城への道は開かれています。";
		mes "気を引き締めて参りましょう。";
	}
	else if($@tiamat_main) {
		mes "[王女メア]";
		mes "いよいよ魔女との決戦です。";
		mes "どうか、御武運を……。";
	}
	else if($@tiamat_main) {
		mes "[王女メア]";
		mes "……これが最後の戦いとなるでしょう。";
		mes "全てを……貴方に託します。";
	}
	else if($@tiamat_main) {
		unittalk "王女メア : ご協力ありがとうございました。探索の成果を秘密の部屋にて確認しましょう。",1;
		end;
	}
	while(1) {
		next;
		if(select("探索の基本について聞く","やめる") == 2) {
			mes "[王女メア]";
			mes "かしこまりました。";
			mes "何か御用がありましたら";
			mes "いつでもお声掛けください。";
			close;
		}
		mes "[王女メア]";
		mes "探索の基本についてですね。";
		next;
		mes "[王女メア]";
		mes "探索の最終目標は";
		mes "王城の何処かにいる";
		mes "^009eff魔女ジラント^000000を見つけ出し、";
		mes "^009eff完全に滅ぼす^000000ことです。";
		next;
		mes "[王女メア]";
		mes "王城内の各部屋は";
		mes "魔女によって生み出された";
		mes "モンスターによって";
		mes "結界が張られています。";
		next;
		mes "[王女メア]";
		mes "そのため、奥へと進むには";
		mes "^009eff各部屋にいる全てのモンスターを^000000";
		mes "^009eff倒す必要があるでしょう。^000000";
		next;
		mes "[王女メア]";
		mes "また、結界以外にも他の力によって";
		mes "道が閉ざされている場合があります。";
		next;
		mes "[王女メア]";
		mes "そんな時は、別の道を行って";
		mes "道を開くための仕掛けを";
		mes "探してみるのも良いかもしれません。";
		next;
		mes "[王女メア]";
		mes "他に何かお聞きに";
		mes "なりたいことはございますか？";
		continue;
	}
}
1_tiamat_00.gat,197,170,3	script	王宮治療術士#1_tiamat_0	641,{/* 56 */
	mes "[王宮治療術士]";
	mes "体力、気力の回復、";
	mes "状態異常の解除、";
	mes "壊れたアイテムの修理を";
	mes "させて頂きました。";
	mes "倉庫はご利用になられますか？";
	npcskillsupport 28,9999,"王宮治療術士#1_tiamat_0";//ヒール
	misceffect 7,"";
	misceffect 14,"";
	misceffect 492,"";
	percentheal 100,100;
	next;
	switch(select("立ち去る","倉庫")) {
	case 1:
		mes "[王宮治療術士]";
		mes "メア様のことを頼みます。";
		mes "生きて帰ってきてくださいね……。";
		close;
	case 2:
		//
		mes "[王宮治療術士]";
		mes "メア様のことを頼みます。";
		close2;
		openstorage;
		end;
	}
}
1_tiamat_00.gat,194,151,3	script	スヴィエ#1_tiamat_00	10274,{/* 57 */
	unittalk "スヴィエ : ガルル……。",1;
	end;
}
1_tiamat_00.gat,190,153,3	script	精鋭近衛兵#1_tiamat_00	418,{/* 58 */
	mes "[精鋭近衛兵]";
	mes "メア様は北にある";
	mes "王城の門の前でお待ちです。";
	next;
	if(select("話をやめる","基地へ帰る") == 1) {
		mes "[精鋭近衛兵]";
		mes "わかりました。";
		mes "またお声かけください。";
		close;
	}
	mes "[精鋭近衛兵]";
	mes "かしこまりました。";
	mes "では、基地に戻りましょう。";
	close2;
	misceffect 316,"";
	misceffect 317,"";
	warp "pab_base01.gat",338,75;
	end;
}
1_tiamat_00.gat,198,173,3	script	異形の魔人#1_tiamat_00	661,{/* 59 */
	mes "[異形の魔人]";
	mes "貴方が望まれるのなら";
	mes "^0000ff三度まで^000000城内で作戦中の隊に";
	mes "転送してさし上げましょう。";
	mes "^0000ff残り転送回数 : 3^000000";
	next;
	switch(select("やめる","ミルカ隊","ハウンド隊","ローウェン隊")) {
	default:
		mes "[異形の魔人]";
		mes "左様ですか。";
		mes "気が変わったらまたお越しください。";
		mes "私の力の範囲内であれば";
		mes "願いを叶えましょう。";
		close;
	}
}
1_tiamat_00.gat,188,171,4	script	四騎士ミルカ#ex001	728,{/* 60 (hide)*/
	mes "[四騎士ミルカ]";
	mes "突入の準備は良い？";
	mes "私の進行ルートは";
	mes "^0000ff強力なモンスター^000000との";
	mes "激しい戦いになると思うわ。";
	mes "腕に自信があるのなら、私について来て。";
	close;
}
1_tiamat_00.gat,189,173,4	script	四騎士ハウンド#ex001	420,{/* 61 (hide)*/
	mes "[四騎士ハウンド]";
	mes "ここに来るのも久しぶりだな。";
	mes "俺様の進行ルートは";
	mes "^0000ff物理攻撃が効きにくいモンスター^000000との";
	mes "バトルが待ってるぜ。";
	mes "魔法攻撃に自信がある奴ぁ、";
	mes "俺様の部隊に入ってくれ。";
	close;
}
1_tiamat_00.gat,186,172,4	script	四騎士ローウェン#ex001	416,{/* 62 (hide)*/
	mes "[四騎士ローウェン]";
	mes "ご協力感謝いたします、冒険者殿。";
	mes "私の進行ルートは";
	mes "^0000ff魔法攻撃が効きにくいモンスター^000000との";
	mes "連戦になるものと想定されます。";
	mes "物理攻撃に自信がおありでしたら";
	mes "私の隊にお力をお貸しください。";
	close;
}
