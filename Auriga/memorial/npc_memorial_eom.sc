moro_cav.gat,41,73,4	script	守護者ニーズヘッグ#epeo	510,{/* 65386 */
	if(!checkquest(201720) || !checkquest(201725)) {	// ビオスの島、モルスの洞窟未クリア
		cutin "ep14_nyd01.bmp", 2;
		mes "[ニーズヘッグ]";
		mes "あの黄色い種と赤い花、";
		mes "それにこの樹……。";
		mes "モロクは何を考えているのでしょう。";
		next;
		mes "‐^ff0000魔神殿に入るには";
		mes "　ビオスの島、モルスの洞窟を";
		mes "　クリアする必要があります^000000‐";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(checkquest(7598)) {	// クールタイム中
	}
	if(checkquest(7597)) {	// 討伐後未報告
	}
	if(checkquest(7593) == 0) {
		cutin "ep14_nyd01.bmp", 2;
		mes "[ニーズヘッグ]";
		mes "申し訳ありませんが、";
		mes "司令官の許可なしには";
		mes "出入を許可することができません。";
		mes "魔神討伐を依頼された方のみ";
		mes "入場を許可しています。";
		next;
		mes "[ニーズヘッグ]";
		mes "司令官ヒバ・アジフ様に会って、";
		mes "依頼を受けてきて下さい。";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(getonlinepartymember() < 1) {
		mes "[ニーズヘッグ]";
		mes "この先は一人では危険です。";
		mes "パーティーを結成してから来て下さい。";
		cutin "ep14_nyd01.bmp", 2;
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		cutin "ep14_nyd01.bmp", 2;
		mes "[ニーズヘッグ]";
		mes "皆さんの安全を守るため、";
		mes "魔神殿に入る申請は";
		mes "パーティーリーダーだけができます。";
		mes "あなたのパーティーのリーダーから";
		mes "私に話しかけるよう伝えてください。";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	mes "[ニーズヘッグ]";
	mes "お待ちしていました。";
	mes "モロクがいる深層部まで案内します。";
	cutin "ep14_nyd04.bmp", 2;
	next;
	mes "[ニーズヘッグ]";
	mes "この樹は世界樹と似ていますね。";
	mes "モロクの目的が私の予想とは";
	mes "異なると良いのですが……。";
	cutin "ep14_nyd03.bmp", 2;
	next;
	mes "[ニーズヘッグ]";
	mes "ここから流れ出る魔力は";
	mes "一定間隔で息をしているかのような";
	mes "動きがあります。";
	mes "私はこの空間から";
	mes "深層部への道を開きます。";
	mes "深層部へ行く準備はできましたか？";
	cutin "ep14_nyd04.bmp", 2;
	next;
	if(select("準備ができた","行かない") == 2) {
		mes "[ニーズヘッグ]";
		mes "わかりました。";
		mes "出発するまで十分に準備する";
		mes "時間が必要でしょう。";
		mes "ゆっくり準備して来て下さい。";
		mes "私はここで待っています。";
		cutin "ep14_nyd04.bmp", 2;
		close2;
		cutin "ep14_nyd04.bmp", 255;
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[ニーズヘッグ]";
		mes "待ってください、これは……!?";
		mes "魔力の流れが変わりました。";
		mes "私たちの動きに気が付いたようです。";
		mes "もう少し様子を見てみましょう。";
		mes "私たちは招かれざる客ですから。";
		cutin "ep14_nyd01.bmp", 2;
		next;
		mes "[ニーズヘッグ]";
		mes "勿論、私も今すぐ深層部へ行って";
		mes "モロクを戒めたいのですが、";
		mes "彼らに気付かれていると危険です。";
		mes "しばらく待ちましょう。";
		cutin "ep14_nyd02.bmp", 2;
		close2;
		cutin "ep14_nyd02.bmp", 255;
		end;
	}
	mdcreate "end_of_morocc";
	mes "[ニーズヘッグ]";
	mes "……もう少しで入口が開きます。";
	mes "樹を通じて侵入してください。";
	mes "怖がらないで下さい。";
	mes "私も共に行きます。";
	cutin "ep14_nyd04.bmp", 2;
	close2;
	cutin "ep14_nyd04.bmp", 255;
	end;
OnInit:
	waitingroom "魔神殿生成", 0; //65386
	end;
}
moro_cav.gat,45,75,0	script	世界樹に似た樹#eom_gate	844,{/* 65387 */
	if(!checkquest(201720) || !checkquest(201725)) {	// ビオスの島、モルスの洞窟未クリア
		mes "[ニーズヘッグ]";
		mes "あの黄色い種と赤い花、";
		mes "それにこの樹……。";
		mes "モロクは何を考えているのでしょう。";
		cutin "ep14_nyd01.bmp", 2;
		next;
		mes "‐^ff0000魔神殿に入るには";
		mes "　ビオスの島、モルスの洞窟を";
		mes "　クリアする必要があります^000000‐";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(checkquest(7598)) {	// クールタイム中
	}
	if(checkquest(7597)) {	// 討伐後未報告
	}
	if(checkquest(7593) == 0) {
		cutin "ep14_nyd01.bmp", 2;
		mes "[ニーズヘッグ]";
		mes "申し訳ありませんが、";
		mes "司令官の許可なしには";
		mes "出入を許可することができません。";
		mes "魔神討伐を依頼された方のみ";
		mes "入場を許可しています。";
		next;
		mes "[ニーズヘッグ]";
		mes "司令官ヒバ・アジフ様に会って、";
		mes "依頼を受けてきて下さい。";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	mes "‐樹に手を当てると、";
	mes "　魔力の流れが感じられる。";
	mes "　この流れに身を任せれば";
	mes "　深層部に侵入できるのだろうか‐";
	next;
	if(select("入る","入らない") == 2) {
		cutin "ep14_nyd04.bmp", 2;
		mes "[ニーズヘッグ]";
		mes "わかりました。";
		mes "出発するまで十分に準備する";
		mes "時間が必要でしょう。";
		mes "ゆっくり準備して来て下さい。";
		mes "私はここで待っています。";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(getonlinepartymember() < 1) {
		mes "[ニーズヘッグ]";
		mes "この先は一人では危険です。";
		mes "パーティーを結成してから来て下さい。";
		cutin "ep14_nyd01.bmp", 2;
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	switch(mdenter("end_of_morocc")) {
	case 0:	// エラーなし
		announce "メモリアルダンジョン[end_of_morocc] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x9, 0x00ff99, 0x190, 12, 0, 0;
		setquest 96435; //state=1
		//warp "1@eom.gat",101,16;
		//warp "1@eom_jp.gat",45,66;
		end;
	case 1:	// パーティー未加入
	case 2:	// ダンジョン未作成
		mes "[ニーズヘッグ]";
		mes "あなたのパーティーで入場許可が";
		mes "申請されていません。";
		mes "パーティーリーダーから正式に";
		mes "要請していただければ、私が";
		mes "魔神殿に通じる入口を開けましょう。";
		cutin "ep14_nyd01.bmp", 2;
		next;
		mes "[ニーズヘッグ]";
		mes "皆さんの安全のため、";
		mes "ご協力をお願いします。";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	default:	// その他エラー
		close;
	}
OnInit:
	waitingroom "魔神殿入場", 0; //65387
	end;
}
1@eom_jp.gat,45,75,0	script	世界樹に似た樹#eom_jp	844,{/* 78251 */
	delquest 7598;
	delquest 73730;
	setquest 7598; //state=1
	setquest 73730; //state=1
	warp getmdmapname("1@eom.gat"),101,16;
	end;
OnInit:
	waitingroom "魔神殿入場",0; //78251
	end;
}

1@eom.gat,1,1,0	script	callmon#eom1	139,{
OnStart:
	initnpctimer;
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@event$,getmdnpcname("callmon#eom1")+"::OnKilled";
	set '@mob1,callmonster('@mdmap$,102,30,"魔神の使徒・アハト",3105,'@event$);
	set '@mob2,callmonster('@mdmap$,98, 30,"魔神の破片",1918,'@event$);
	set '@mob3,callmonster('@mdmap$,100, 30,"魔神の破片",1918,'@event$);
	set '@mob4,callmonster('@mdmap$,104, 30,"魔神の破片",1918,'@event$);
	set '@mob5,callmonster('@mdmap$,106, 30,"魔神の破片",1918,'@event$);
	set '@mob6,callmonster('@mdmap$,102,40,"魔神の使徒・シナイム",3106,'@event$);
	set '@mob7,callmonster('@mdmap$,98, 40,"魔神の破片",1921,'@event$);
	set '@mob8,callmonster('@mdmap$,100, 40,"魔神の破片",1921,'@event$);
	set '@mob9,callmonster('@mdmap$,104, 40,"魔神の破片",1921,'@event$);
	set '@mob0,callmonster('@mdmap$,106, 40,"魔神の破片",1921,'@event$);
	if(getmapusers('@mdmap$) == 1) {
		setmobhp '@mob1,getmobhp('@mob1)/2;
		setmobhp '@mob6,getmobhp('@mob6)/2;
	}
	end;
OnTimer3000:
	announce "アハト : この門の先に進むには、私とシナイムを倒しその魂を捧げる必要があります。", 0x9, 0x00ff00;
	end;
OnTimer6000:
	stopnpctimer;
	announce "アハト : さあ、我が主と会うに相応しい力を持っているか、私に見せてください！", 0x9, 0x00ff00;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom1")+ "::OnKilled");
	if('@count <= 0) {
		hideoffnpc getmdnpcname("空になっている魂の器#sh"); //99823
		hideoffnpc getmdnpcname("空になっている魂の器#ah"); //99825
		hideoffnpc getmdnpcname("魔神の使徒・アハト#ah02"); //99822
	}
	end;
}

1@eom.gat,101,43,3	script	魔神の使徒・アハト#ahat	493,{/* 61682 */
	if(Sex)
		cutin "ep13_ahat_f.bmp", 2;
	else
		cutin "ep13_ahat_m.bmp", 2;
	if(DIC_2QUE < 16) {		// 猫耳と尻尾の男クエスト
		mes "[アハト]";
		mes "初めてお目にかかりますね。";
		mes "魔神の最初のしもべ、";
		mes "アハトと申します。";
		unittalk "アハト : 初めてお目にかかりますね。魔神の最初のしもべ、アハトと申します。";
	}
	else {
		mes "[アハト]";
		mes "結局ここまで来てしまいましたか。";
		mes "あなたという人は";
		mes "本当にしつこいですね。";
		unittalk "アハト : 結局ここまで来てしまいましたか。あなたという人は本当にしつこいですね。";
		next;
		mes "[アハト]";
		mes "フフフ……";
		mes "私がここにいることに";
		mes "驚いているようですね。";
		mes "しかし少しは予想していたのでは";
		mes "ないですか？";
		unittalk "アハト : フフフ……私がここにいることに驚いているようですね。しかし少しは予想していたのではないですか？";
		next;
		mes "[アハト]";
		mes "改めてご挨拶いたしましょう。";
		mes "魔神の最初のしもべ、";
		mes "アハトと申します。";
		unittalk "アハト : 改めてご挨拶いたしましょう。魔神の最初のしもべ、アハトと申します。";
	}
	next;
	mes "[アハト]";
	mes "我が主から";
	mes "あなたに客人としての資格があるか、";
	mes "私とシナイムで試すようにと";
	mes "命じられました。";
	unittalk "アハト : 我が主からあなたに客人としての資格があるか、私とシナイムで試すようにと命じられました。";
	next;
	mes "[アハト]";
	mes "あなたは自らの力で";
	mes "ここに来たと思っているようですが、";
	mes "それは大きな間違いです。";
	unittalk "アハト : あなたは自らの力でここに来たと思っているようですが、それは大きな間違いです。";
	next;
	mes "[アハト]";
	mes "すべては我が主の意思。";
	mes "まずはこの門を開くことができるか";
	mes "試してみましょう。";
	unittalk "アハト : すべては我が主の意思。まずはこの門を開くことができるか試してみましょう。";
	close2;
	setquest 7596; //state=1
	cutin "ep13_ahat_f.bmp", 255;
	mapwarp getmdmapname("1@eom.gat"),getmdmapname("1@eom.gat"),103,16;
	donpcevent getmdnpcname("callmon#eom1")+"::OnStart";
	end;
}

1@eom.gat,101,55,3	script	魔神の使徒・アハト#ah02	493,{/* 61684 */
	if(Sex)
		cutin "ep13_ahat_f.bmp", 2;
	else
		cutin "ep13_ahat_m.bmp", 2;
	mes "[アハト]";
	mes "クッ……ハハ……アハハハッ！";
	mes "さ、流石……我が主が一目おく";
	mes "相手ですね……これほどまでとは……。";
	unittalk "アハト : クッ……ハハ……アハハハッ！　さ、流石……我が主が一目おく相手ですね……これほどまでとは……。";
	next;
	mes "[アハト]";
	mes "どうやら……";
	mes "我々の役目はここまでのようです……。";
	unittalk "アハト : どうやら……我々の役目はここまでのようです……。";
	next;
	mes "[アハト]";
	mes "さあ、そこにある器に我々の魂を捧げ、";
	mes "先に進んでください。";
	mes "我が主に会う資格が充分、";
	mes "貴方達にあることは";
	mes "証明されたのですから……。";
	unittalk "アハト : さあ、そこにある器に我々の魂を捧げ先に進んでください。我が主に会う資格が充分、貴方達にあることは証明されたのですから……。";
	misceffect 231, getmdnpcname("空になっている魂の器#sh"); //82792
	misceffect 231, getmdnpcname("空になっている魂の器#ah"); //82794
	getitem 6713,1;
	getitem 6714,1;
	hideonnpc getmdnpcname("魔神の使徒・アハト#ah02"); //82791
	close2;
	cutin "ep13_ahat_f.bmp", 255;
	end;
}
1@eom.gat,98,56,0	script	空になっている魂の器#sh	844,{/* 61685 */
	if(countitem(6714) < 1) {
		mes "‐扉を開くにはシナイムの魂で";
		mes "　この器を満たす必要がある‐";
		close;
	}
	mes "‐空になっている魂の器に";
	mes "　シナイムの魂を注入します‐";
	next;
	misceffect 72, getmdnpcname("空になっている魂の器#sh"); //82792
	progressbar 5;
	delitem 6714, 1;
	misceffect 6, getmdnpcname("空になっている魂の器#sh"); //82792
	hideonnpc getmdnpcname("空になっている魂の器#sh"); //82792
	hideoffnpc getmdnpcname("魂が満ちている器#shnaim"); //82793
	misceffect 6, getmdnpcname("魂が満ちている器#shnaim"); //82793
	misceffect 202, getmdnpcname("魂が満ちている器#shnaim"); //82793
	donpcevent getmdnpcname("#gate_to_center")+ "::OnStartSH";
	mes "‐器がシナイムの魂で満たされました‐";
	close;
}
1@eom.gat,98,56,0	script	魂が満ちている器#shnaim	844,{/* 61686 (hide)*/}
1@eom.gat,104,56,0	script	空になっている魂の器#ah	844,{/* 61687 */
	if(countitem(6713) < 1) {
		mes "‐扉を開くにはアハトの魂で";
		mes "　この器を満たす必要がある‐";
		close;
	}
	mes "‐空になっている魂の器に";
	mes "　アハトの魂を注入します‐";
	next;
	misceffect 72, getmdnpcname("空になっている魂の器#ah"); //82794
	progressbar 5;
	delitem 6713, 1;
	misceffect 6, getmdnpcname("空になっている魂の器#ah"); //82794
	hideonnpc getmdnpcname("空になっている魂の器#ah"); //82794
	hideoffnpc getmdnpcname("魂が満ちている器#ahat02"); //82795
	misceffect 6, getmdnpcname("魂が満ちている器#ahat02"); //82795
	misceffect 202, getmdnpcname("魂が満ちている器#ahat02"); //82795
	donpcevent getmdnpcname("#gate_to_center")+ "::OnStartAH";
	mes "‐器がアハトの魂で満たされました‐";
	close;
}
1@eom.gat,104,56,0	script	魂が満ちている器#ahat02	844,{/* 61688 (hide)*/}
1@eom.gat,101,58,0	script	#gate_to_center	45,2,2,{
OnTouch:
	delquest 7596;
	warp getmdmapname("1@eom.gat"),98,115; //61689
	end;
OnStartSH:
	if('flag&2 == 0) {
		set 'flag,1;
		end;
	}
	misceffect 231, getmdnpcname("#gate_to_center"); //82796
	misceffect 202, getmdnpcname("#gate_to_center"); //82796
	hideoffnpc getmdnpcname("#gate_to_center"); //82796
	end;
OnStartAH:
	if('flag&1 == 0) {
		set 'flag,2;
		end;
	}
	misceffect 231, getmdnpcname("#gate_to_center"); //82796
	misceffect 202, getmdnpcname("#gate_to_center"); //82796
	hideoffnpc getmdnpcname("#gate_to_center"); //82796
	end;
}
1@eom.gat,100,122,3	script	見慣れない少年#mockid01	10038,{/* 61690 */
	if(select("急ぐ","会話をする") == 1) {
		// 未調査
	}
	cutin "morocc_kid.bmp", 2;
	mes "[少年]";
	mes "ようこそ。";
	mes "どうかな？　この部屋は。";
	mes "僕はわりと気に入っているんだけど。";
	announce "少年 : ようこそ。どうかな？　この部屋は。僕はわりと気に入っているんだけど。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "["+strcharinfo(0)+"]";
	mes "君は？";
	unittalk getcharid(3),"君は？";
	next;
	mes "[少年]";
	mes "あれ？　分からないの？";
	announce "少年 : あれ？　分からないの？", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[少年]";
	mes "あはは、そっか！";
	mes "君たちは昔の僕しか";
	mes "知らないんだよね。";
	announce "少年 : あはは、そっか！　君たちは昔の僕しか知らないんだよね。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[少年]";
	mes "ごめんごめん。";
	mes "困らせるつもりはないんだ。";
	mes "僕は君たちが";
	mes "ここまで追いかけてきた目的だよ。";
	announce "少年 : ごめんごめん。困らせるつもりはないんだ。僕は君たちがここまで追いかけてきた目的だよ。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[モロク]";
	mes "……そう、僕がモロク。";
	mes "以後、お見知りおきを。";
	announce "モロク : ……そう、僕がモロク。以後、お見知りおきを。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[モロク]";
	mes "まさか、あの2人を倒すなんてね、";
	mes "あの2人は信頼していたのにな……。";
	announce "モロク : まさか、あの2人を倒すなんてね、あの2人は信頼していたのにな……。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[モロク]";
	mes "ねえ、どうしてそこまで";
	mes "実力がありながら冒険者なんて";
	mes "続けているの？";
	mes "もっと他に、相応しい生き方が";
	mes "あると、僕は思うよ。";
	announce "モロク : ねえ、どうしてそこまで実力がありながら冒険者なんて続けているの？　もっと他に、相応しい生き方があると、僕は思うよ。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	close2;
	cutin "morocc_kid.bmp", 255;
	donpcevent getmdnpcname("見慣れない少年#mockid01")+ "::OnStart";
	end;
OnStart:
	initnpctimer;
	hideoffnpc getmdnpcname("ロキ#eomloki01"); //82799
	hideoffnpc getmdnpcname("ニーズヘッグ#eomnyd01"); //82800
	end;
OnTimer1000:
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk1";
	end;
OnTimer6000:
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk2";
	end;
OnTimer11000:
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk3";
	end;
OnTimer16000:
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk4";
	end;
OnTimer21000:
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk5";
	end;
OnTimer26000:
	donpcevent getmdnpcname("ニーズヘッグ#eomnyd01")+ "::OnTalk1";
	end;
OnTimer31000:
	donpcevent getmdnpcname("ニーズヘッグ#eomnyd01")+ "::OnTalk2";
	end;
OnTimer36000:
	donpcevent getmdnpcname("ニーズヘッグ#eomnyd01")+ "::OnTalk3";
	end;
OnTimer41000:
	announce "モロク : そんなに邪険にしないでほしいなあ。僕と君の仲じゃないか、ニーズヘッグ。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer46000:
	announce "モロク : もしかしてもう忘れちゃったの？　僕の言葉にあんなに熱心に耳を傾けてくれたのに。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer51000:
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk6";
	end;
OnTimer51500:
	misceffect 17, getmdnpcname("見慣れない少年#mockid01"); //82797
	end;
OnTimer56000:
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk7";
	end;
OnTimer62000:
	announce "モロク : あれ、言ってなかったかな？　これは僕の幻。だから傷つけられないよ。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer68000:
	announce "モロク : せっかくお客様が来てくれたんだ。それなりのおもてなしをしないとね。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer74000:
	announce "モロク : そうだ！　アハトとシナイムには、もう一度チャンスをあげよう。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer80000:
	announce "モロク : 神となった僕の力で作り出した2匹の獣がいるんだけど……。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer86000:
	announce "モロク : そこにアハトとシナイムの魂を移植するのさ！　どうだい、面白そうだろう？", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer91000:
	announce "モロク : ちょっとした余興さ。僕の力で生まれ変わった2人の力を見せてあげるよ。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer94000:
	misceffect 6, getmdnpcname("見慣れない少年#mockid01"); //82797
	end;
OnTimer94500:
	hideonnpc getmdnpcname("見慣れない少年#mockid01"); //82797
	donpcevent getmdnpcname("ロキ#eomloki01")+ "::OnTalk8";
	end;
OnTimer96000:
	hideonnpc getmdnpcname("ロキ#eomloki01"); //82799
	end;
OnTimer96500:
	hideoffnpc getmdnpcname("#eom_gate_to_ice"); //82801
	misceffect 135, getmdnpcname("#eom_gate_to_ice"); //82801
	end;
OnTimer97000:
	stopnpctimer;
	misceffect 231, getmdnpcname("#eom_gate_to_ice"); //82801
	end;
}

1@eom.gat,95,122,5	script	ロキ#eomloki01	512,{/* 61692 (hide)*/
	cutin "ep14_roki01.bmp", 2;
	mes "[ロキ]";
	mes "……フン。";
	mes "こんな茶番、早く終わらせて";
	mes "とっとと帰るぞ。";
	close2;
	cutin "ep14_roki01.bmp", 255;
	end;
OnTalk1:
	unittalk "ロキ : フン。その相応しい場所をお前が用意するとでも言うのか？";
	end;
OnTalk2:
	unittalk "ロキ : 笑わせるな。こいつらは自分達でその場所を、見つけることが出来る。";
	end;
OnTalk3:
	unittalk "ロキ : もっと分かりやすく言ってやろう。";
	end;
OnTalk4:
	unittalk "ロキ : お前が用意した場所など、こいつらには必要ない。";
	end;
OnTalk5:
	unittalk "ロキ : そして、お前がこの世界に存在できる場所もな。";
	end;
OnTalk6:
	unittalk "ロキ : ふざけるな！";
	end;
OnTalk7:
	unittalk "ロキ : ……チッ。流石に実体ではなかったか。";
	end;
OnTalk8:
	unittalk "ロキ : 逃げるのか！";
	end;
}
1@eom.gat,94,120,5	script	ニーズヘッグ#eomnyd01	510,{/* 61693 (hide)*/
	{
		cutin "ep14_nyd01.bmp", 2;
		mes "[ニーズヘッグ]";
		mes "ご無事でしたか……。";
		mes "ここからは微力ながら、";
		mes "私たちもお手伝いします。";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	cutin "ep14_nyd01.bmp", 2;
	mes "[ニーズヘッグ]";
	mes "今回の決戦には私も協力します。";
	mes "あなたが望むならば";
	mes "私の分身を同行させましょう。";
	unittalk "ニーズヘッグ : 今回の決戦には私も協力します。あなたが望むならば私の分身を同行させましょう。";
	next;
	switch(select("一緒に行く","今はまだいい","^ff0000操作方法を確認する^000000")) {
	case 1:
		mes "[ニーズヘッグ]";
		mes "今こそ守護者の務めを";
		mes "果たしましょう。";
		next;
		misceffect 72, getmdnpcname("ニーズヘッグ#eomnyd01"); //82800
		cutin "ep14_nyd01.bmp", 255;
		mes "‐^4d4dff守護者ニーズヘッグの分身が";
		mes "　仲間として参戦しました^000000‐";
		setquest 7605; //state=1
		close2;
		hideonnpc getmdnpcname("ニーズヘッグ#eomnyd01"); //82800
		makemerc 3087,1800;
		end;
	case 2:
		mes "[ニーズヘッグ]";
		mes "そうですか……。";
		mes "私の力が必要になったら";
		mes "いつでも言ってください。";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	case 3:
		mes "‐守護者の分身は";
		mes "　プレイヤーと共に戦ってくれる";
		mes "　NPCです。";
		mes "　30分経過するか、HPが0になると";
		mes "　いなくなってしまいます‐";
		next;
		mes "[操作方法]";
		mes "‐^ff0000[Alt]^000000キー+モンスターを左クリックで";
		mes "　クリックしたモンスターを";
		mes "　攻撃します。";
		mes "　^ff0000[Alt]^000000キー+地面を左クリックで";
		mes "　クリックした場所に移動します‐";
		next;
		mes "[ステータス]";
		mes "‐守護者の分身を右クリックすると";
		mes "　^0000ff[状態表示]^000000と^0000ff[待機]^000000が表示されます。";
		mes "　^0000ff[状態表示]^000000を選ぶと";
		mes "　ステータスウィンドウが";
		mes "　表示されます‐";
		next;
		mes "‐ステータスウィンドウ内の";
		mes "　^0000ff[解雇]^000000を選ぶと守護者の分身が";
		mes "　消滅します。";
		mes "　^0000ff[スキル]^000000は所持していないため、";
		mes "　なにも選ぶことができません‐";
		next;
		mes "‐^0000ff[待機]^000000を選ぶと攻撃をやめて";
		mes "　プレイヤーを追尾する";
		mes "　待機状態になります。";
		mes "　もう一度^0000ff[待機]^000000を選択すると";
		mes "　待機状態が解除されます‐";
		next;
		mes "‐一度守護者の分身を仲間にすると、";
		mes "　^ff00003時間経過するまで";
		mes "　再度仲間にすることができません^000000‐";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
OnTalk1:
	unittalk "ニーズヘッグ : そうです、あなたは必要のない存在……。いいえ、存在してはいけないのです。";
	end;
OnTalk2:
	unittalk "ニーズヘッグ : その証拠に、世界樹もあなたの存在を否定しています。";
	end;
OnTalk3:
	unittalk "ニーズヘッグ : 世界樹イグドラシルの守護者たる、ニーズヘッグが命じます。……この世界から消えなさい!!";
	end;
}
1@eom.gat,91,120,0	warp	#eom_gate_to_ice	2,2,1@eom.gat,56,88	//61694
1@eom.gat,100,122,3	script	モロク#mockid03	10038,{/* 61695 (hide)*/
	cutin "morocc_kid.bmp", 2;
	mes "[モロク]";
	mes "あはは！　まだ生きてたんだね。";
	mes "驚いたよ。";
	announce "モロク : あはは！　まだ生きてたんだね。驚いたよ。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[モロク]";
	mes "正直、あの2匹に勝てるとは";
	mes "思ってなかったんだけど……。";
	announce "モロク : 正直、あの2匹に勝てるとは思ってなかったんだけど……。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[モロク]";
	mes "まあ、僕が直々に君たちを排除して、";
	mes "この世界を全て飲み込めばいいや。";
	announce "モロク : まあ、僕が直々に君たちを排除して、この世界を全て飲み込めばいいや。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[モロク]";
	mes "……さて、そろそろ始めようか。";
	mes "奥の部屋で待ってるよ。";
	announce "モロク : ……さて、そろそろ始めようか。奥の部屋で待ってるよ。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	close2;
	cutin "morocc_kid.bmp", 255;
	misceffect 57, "モロク#mockid03"; //82802
	misceffect 6, "モロク#mockid03"; //82802
	hideonnpc "モロク#mockid03"; //82802
	hideoffnpc "#eom_gate_to_last"; //82803
	misceffect 316, "#eom_gate_to_last"; //82803
	end;
}
1@eom.gat,98,127,0	script	#eom_gate_to_last	45,2,2,{
	setquest 96438; //state=1
	warp "1@eom.gat",102,178; //61696
	end;
}
1@eom.gat,56,88,0	script	#icemob01	139,{/* 61697 (hide)*/}
1@eom.gat,22,116,3	script	#icemob02	844,{/* 61698 (hide)*/}
1@eom.gat,53,134,5	script	#icemob03	844,{/* 61699 (hide)*/}
1@eom.gat,38,129,3	script	ブリナラネア#brinpc01	3091,{/* 61700 (hide)*/}
1@eom.gat,1,1,0	script	callmon#eom2	139,{
}
1@eom.gat,59,147,3	script	ニーズヘッグ#eomnyd02	510,{/* 61704 */
	mes "[ニーズヘッグ]";
	mes "この先は灼熱の溶岩地帯が";
	mes "広がっているようです。";
	mes "この場所に自生する^ff0000永久霜^000000を";
	mes "いくつか採取してお持ちください。";
	mes "きっと役に立つでしょう。";
	next;
	mes "[ニーズヘッグ]";
	mes "なにはともあれ、";
	mes "大変な戦いでしたね……。";
	mes "私から出来ることは多くありませんが、";
	mes "守護者として貴方に、";
	mes "イグドラシルの加護を……。";
	misceffect 313,""; //self
	close;
}
1@eom.gat,67,149,0	script	#eom_ice_to_center	45,2,2,{
	setquest 96437; //state=1
	warp "1@eom.gat",136,93; //61705
	end;
}
1@eom.gat,148,100,3	script	ロキ#flamewolf	512,{/* 61706 */}
1@eom.gat,168,133,3	script	ムスペルスコール#npc	3092,5,5,{/* 61707 (hide)*/
	end;
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	initnpctimer;
	announce "ムスペルスコール : ……先ほどぶりですね。アハトです。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer3000:
	announce "ムスペルスコール : 一度滅びた身にも関わらず、このような姿になり、またあなたと相対するとは……。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer6000:
	announce "ムスペルスコール : しかし、我が主の望みとあらば、再びこの身が果てるまで尽くしましょう。", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer9000:
	announce "ムスペルスコール : さあ、参りましょう。私たちの運命に終止符を打つのです！", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer10000:
	misceffect 225; //78187
	hideonnpc; //78187
	donpcevent getmdnpcname("callmon#eom3")+ "::OnStart";
	announce "ムスペルスコール : 灼熱の炎よ、全てを燃やし尽くしなさい！", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer18000:
	stopnpctimer;
	announce "ロキ : ムスペルスコールが溶岩を利用して回復をしようとしているぞ！", 0x9, 0x00ff00, 0x190, 12, 0, 0;
	end;
}
1@eom.gat,1,1,0	script	callmon#eom3	139,{
OnStart:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@event1$,getmdnpcname("callmon#eom3")+"::OnFlameWolf";
	set '@event2$,getmdnpcname("callmon#eom3")+"::OnKilled";
	set 'mob1,callmonster('@mdmap$,180,129,"ムスペルスコール#01",3092,'@event1$);
	set '@mob2,callmonster('@mdmap$,162,130,"狂気のカーサ",3089,'@event2$);
	set '@mob3,callmonster('@mdmap$,165,130,"狂気のカーサ",3089,'@event2$);
	set '@mob4,callmonster('@mdmap$,168,130,"狂気のカーサ",3089,'@event2$);
	set '@mob5,callmonster('@mdmap$,171,130,"狂気のカーサ",3089,'@event2$);
	set '@mob6,callmonster('@mdmap$,174,130,"狂気のカーサ",3089,'@event2$);
	set '@mob7,callmonster('@mdmap$,162,133,"狂気のカーサ",3089,'@event2$);
	set '@mob8,callmonster('@mdmap$,165,133,"狂気のカーサ",3089,'@event2$);
	set '@mob9,callmonster('@mdmap$,168,133,"狂気のカーサ",3089,'@event2$);
	set '@mob10,callmonster('@mdmap$,171,133,"狂気のカーサ",3089,'@event2$);
	set '@mob11,callmonster('@mdmap$,174,133,"狂気のカーサ",3089,'@event2$);
	set 'maxhp,getmobhp('mob1);
	end;
OnLeftLavaHeal:
	if('mob1 == 0) end;
	unittalk 'mob1,"ムスペルスコール : 我が主の作りだした灼熱の炎を甘く見ないことです！";
	set 'hp,getmobhp('mob1);
	set '@dummy,removemonster('mob1);
	set 'mob1,callmonster(getmdmapname("1@eom.gat"),'@x['@r],'@y['@r],"ムスペルスコール#01",3092,getmdnpcname("callmon#eom3")+"::OnFlameWolf");
	setmobhp 'mob1,'hp;
	end;
OnRightLavaHeal:
	if('mob1 == 0) end;
	set 'hp,getmobhp('mob1);
	set '@dummy,removemonster('mob1);
	set 'mob1,callmonster(getmdmapname("1@eom.gat"),180,129,"ムスペルスコール#01",3092,getmdnpcname("callmon#eom3")+"::OnFlameWolf");
	setmobhp 'mob1,'hp;
	end;
OnWarpReturn:
	if('mob1 == 0) end;
	set 'hp,getmobhp('mob1);
	set '@dummy,removemonster('mob1);
	set 'mob1,callmonster(getmdmapname("1@eom.gat"),'@x['@r],'@y['@r],"ムスペルスコール#01",3092,getmdnpcname("callmon#eom3")+"::OnFlameWolf");
	setmobhp 'mob1,'hp;
	end;
OnHellBurning1:
	mobuseskill 'mob1,724,1,0,0,0,0;	// ファイアストーム
	end;
OnHellBurning2:
	mobuseskill 'mob1,724,3,0,0,0,0;	// ファイアストーム
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
	sleep 2000;
	mobuseskillpos 'mob1,80,10,'@x-2,'@y+2,0,0,0,0;	// ファイアーピラー
	sleep 2000;
	mobuseskillpos 'mob1,80,10,'@x+2,'@y+2,0,0,0,0;	// ファイアーピラー
	sleep 2000;
	mobuseskillpos 'mob1,80,10,'@x-2,'@y-2,0,0,0,0;	// ファイアーピラー
	sleep 2000;
	mobuseskillpos 'mob1,80,10,'@x+2,'@y-2,0,0,0,0;	// ファイアーピラー
	end;
OnHellBurning2:
33	spawn10000
39	回復出現	announce "ロキ : ムスペルスコールが溶岩を利用して回復をしようとしているぞ！", 0x9, 0x00ff00, 0x190, 12, 0, 0;
42	退避
46 出現			unittalk 'mob1,"ムスペルスコール : さすが、一度は私を倒しただけのことはありますね。ですが、まだです!!";
58 獄炎 1		unittalk 'mob1,"ムスペルスコール : 灼熱の海に飲まれなさい！";
100 回復退避	unittalk 'mob1,"ムスペルスコール : 我が主の作りだした灼熱の炎を甘く見ないことです！";
101	回復出現	announce "ロキ : ムスペルスコールが溶岩を利用して回復をしようとしているぞ！", 0x9, 0x00ff00, 0x190, 12, 0, 0;
103	退避
107 出現		unittalk 'mob1,"ムスペルスコール : さすが、一度は私を倒しただけのことはありますね。ですが、まだです!!";
121 回復退避	unittalk 'mob1,"ムスペルスコール : 我が主の作りだした灼熱の炎を甘く見ないことです！";
142 獄炎 1		unittalk 'mob1,"ムスペルスコール : 灼熱の海に飲まれなさい！";
210 獄炎 1		unittalk 'mob1,"ムスペルスコール : 灼熱の海に飲まれなさい！";
243 		unittalk 'mob1,"ムスペルスコール : 灼熱の海に抱かれなさい！";	//60%以下
244 獄炎 1
246 左上FP
248 右上FP
250 左下FP
252 右下FP
322 		unittalk 'mob1,"ムスペルスコール : 灼熱の海に飲まれなさい！";
323 獄炎 1
335 		unittalk 'mob1,"ムスペルスコール : 灼熱の海に抱かれなさい！";	//60%以下
336 獄炎 1
338 左上FP
340 右上FP
342 左下FP
344 右下FP
414 		unittalk 'mob1,"ムスペルスコール : 灼熱の海に抱かれなさい！";	//60%以下
415 獄炎 1
504 		unittalk 'mob1,"ムスペルスコール : 灼熱の海に抱かれなさい！";	//60%以下

@spawn(type: BL_MOB, ID: 12328, speed: 100, option: 0, view: 3092, pos: "0ev1@eom.gat"(168, 121), dir: 0, name: "ムスペルスコール#01")
@spawn(type: BL_MOB, ID: 12570, speed: 100, option: 0, view: 3092, pos: "0ev1@eom.gat"(180, 129), dir: 0, name: "ムスペルスコール#01")

}
1@eom.gat,154,119,0	script	流れる溶岩#lavapond01	844,{/* 61714 */
	if(countitem(22566) == 0) {
		// 未調査
		end;
	}
	mes "‐永久霜で流れ出す溶岩を";
	mes "　止めることができます‐";
	next;
	if(select("霜を使用する","使用しない") == 2) {
		// 未調査
		close;
	}
	delitem 22566,1;
	stopnpctimer;
	donpcevent getmdnpcname("固まった溶岩#01")+ "::OnStart";
	close;
OnTimer3000:
	initnpctimer;
	misceffect 97;
	end;
}
1@eom.gat,154,119,0	script	固まった溶岩#01	844,{/* 61715 (hide)*/
	end;
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("流れる溶岩#lavapond01"); //78194
	hideoffnpc getmdnpcname("固まった溶岩#01"); //78195
	hideonnpc getmdnpcname("#lavazone11"); //78196
	hideonnpc getmdnpcname("#lavazone12"); //78197
	hideonnpc getmdnpcname("ロキ#flamewolf"); //78186
	end;
OnTimer180000:
	stopnpctimer;
	announce "ロキ : 霜の効果が切れたか……。また溶岩が流れ始めたぞ！", 0x9, 0x00ff00, 0x190, 12, 0, 0;
	hideonnpc getmdnpcname("固まった溶岩#01"); //78195
	hideoffnpc getmdnpcname("流れる溶岩#lavapond01"); //78194
	hideoffnpc getmdnpcname("#lavazone11"); //78196
	hideoffnpc getmdnpcname("#lavazone12"); //78197
	end;
}
1@eom.gat,161,122,0	script	#lavazone11	139,10,10,{/* 61716 */}
1@eom.gat,161,102,0	script	#lavazone12	139,10,10,{/* 61717 */}
1@eom.gat,182,129,0	script	流れる溶岩#lavapond02	844,{/* 61718 */
	if(countitem(22566) == 0) {
		// 未調査
		end;
	}
	mes "‐永久霜で流れ出す溶岩を";
	mes "　止めることができます‐";
	next;
	if(select("霜を使用する","使用しない") == 2) {
		// 未調査
		close;
	}
	delitem 22566,1;
	stopnpctimer;
	donpcevent getmdnpcname("固まった溶岩#02")+ "::OnStart";
	close;
OnTimer3000:
	initnpctimer;
	misceffect 97;
	end;
}
1@eom.gat,182,129,0	script	固まった溶岩#02	844,{/* 61719 (hide)*/
	end;
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("流れる溶岩#lavapond02"); //78194
	hideoffnpc getmdnpcname("固まった溶岩#02"); //78195
	hideonnpc getmdnpcname("#lavazone21"); //78196
	hideonnpc getmdnpcname("#lavazone22"); //78197
	hideonnpc getmdnpcname("ロキ#flamewolf"); //78186
	end;
OnTimer180000:
	stopnpctimer;
	announce "ロキ : 霜の効果が切れたか……。また溶岩が流れ始めたぞ！", 0x9, 0x00ff00, 0x190, 12, 0, 0;
	hideonnpc getmdnpcname("固まった溶岩#02"); //78195
	hideoffnpc getmdnpcname("流れる溶岩#lavapond02"); //78194
	hideoffnpc getmdnpcname("#lavazone21"); //78196
	hideoffnpc getmdnpcname("#lavazone22"); //78197
	end;
}
1@eom.gat,163,150,0	script	#lavazone21	139,10,10,{/* 61720 (hide)*/}
1@eom.gat,163,150,0	script	#lavazone22	139,10,10,{/* 61721 (hide)*/}
1@eom.gat,151,155,3	script	ロキ#flameend	512,{/* 61722 */
	mes "[ロキ]";
	mes "……侮っていたな。";
	mes "あいつがこれ程まで";
	mes "強力なモンスターを";
	mes "生み出すことが出来るとはな。";
	next;
	mes "[ロキ]";
	mes "今回も大変な戦いだったな。";
	mes "だがこれからが本当の闘いだ。";
	mes "その前に傷を癒してやる。";
	misceffect 313,""; //self
	close;
}
1@eom.gat,147,156,0	warp	#eom_fire_to_center	2,2,1@eom.gat,98,115	//61723
1@eom.gat,101,194,0	script	#bgm_change1	139,{/* 61724 */}
1@eom.gat,101,194,0	script	#bgm_change2	139,{/* 61725 (hide)*/}
1@eom.gat,101,194,0	script	#bgm_change3	139,{/* 61726 (hide)*/}
1@eom.gat,101,194,0	script	#bgm_change4	139,{/* 61727 (hide)*/}
1@eom.gat,98,182,0	script	#fire_left1	139,{/* 61728 */}
1@eom.gat,105,182,0	script	#fire_right1	139,{/* 61729 */}
1@eom.gat,98,188,0	script	#fire_left2	139,{/* 61730 */}
1@eom.gat,105,188,0	script	#fire_right2	139,{/* 61731 */}
1@eom.gat,98,194,0	script	#fire_left3	139,{/* 61732 */}
1@eom.gat,105,194,0	script	#fire_right3	139,{/* 61733 */}
1@eom.gat,98,200,0	script	#fire_left4	139,{/* 61734 */}
1@eom.gat,105,200,0	script	#fire_right4	139,{/* 61735 */}
1@eom.gat,98,206,0	script	#fire_left5	139,{/* 61736 */}
1@eom.gat,105,206,0	script	#fire_right5	139,{/* 61737 */}
1@eom.gat,104,204,1	script	ロキ#op	512,{/* 61738 (hide)*/}
1@eom.gat,99,204,7	script	ニーズヘッグ#op	510,{/* 60510 (hide)*/}
1@eom.gat,102,209,0	script	#event_moc_talk	139,{/* 60511 */
	menu "会話をする",-;
	close;
	announce "モロク : よく来たね。人間如きがここまで来れるなんて驚いたよ。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideonnpc "#bgm_change1_0ez"; //82831
	hideoffnpc "#bgm_change2_0ez"; //82832
	musiceffect "158";
	announce "モロク : ふふっ、僕の目的が気になるのかい？　それはね、世界の創造さ。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : かつてユミルがしたように僕も世界を作りかえるんだよ！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : その為の力はすべて揃った。僕は今からこの世界を滅ぼし、新たな世界を創造して神として君臨するのさ！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	misceffect 90, "モロク#moc_master_0ez"; //82848
	announce "モロク : あははは！　無駄だよ無駄。君は僕に触れる事すら出来ない。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : この障壁が見えるだろう？　これがある限り、君たちは僕に触れられない。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : 残念だったね。そこで世界の終焉と再誕を見届けるがいい！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : まずは手始めにフレイムヴァレーに居るゴミ共を掃除をしようか。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : 君はそこで仲間の死にゆく様を指をくわえて見ていると良い！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : 僕が！　僕こそが新世界の神！　魔神モロクだ！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	misceffect 59, "モロク#moc_master_0ez"; //82848
	misceffect 90, "モロク#moc_master_0ez"; //82848
	misceffect 135, "モロク#moc_master_0ez"; //82848
	announce "モロク : これは……障壁が壊れた？", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : ああ、僕としたことが、君たちの事を失念していたよ。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideoffnpc "ロキ#op_0ez"; //82845
	hideoffnpc "ニーズヘッグ#op_0ez"; //82846
	announce "モロク : 僕を倒す？　神であるこの僕を？", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : 調子に乗るな！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	misceffect 30, "ロキ#op_0ez"; //82845
	misceffect 30, "ニーズヘッグ#op_0ez"; //82846
	announce "モロク : おやおや、たった一撃で満身創痍じゃないか。それで僕を倒せるのかい？", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : ……何がおかしいんだい？", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : ……面白い冗談だね、この死に損ない！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : 君が戦えない今、誰が僕に敵うと言うんだい？", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideonnpc "ロキ#op_0ez"; //82845
	hideonnpc "ニーズヘッグ#op_0ez"; //82846
	announce "モロク : さて、君がどれほどの力を持っているのか見せて貰うよ。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : 君たち人間との戦いも、これで閉幕だ。", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "モロク : さあ、神に仇なす脆弱なる者よ！　世界再誕の最初の贄となるがいい！", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideonnpc "モロク#moc_master_0ez"; //82848
	set '@mob,callmonster("1@eom.gat",102,209,"再生の半魔神#mk01",3096,'@event$);
}
1@eom.gat,102,209,3	script	モロク#moc_master	10038,{/* 60512 */}
1@eom.gat,101,194,3	script	#morocc_god	3097,{/* 60803 (hide)*/}
1@eom.gat,101,194,0	script	#moc_quest	139,{/* 60807 (hide)*/}
1@eom.gat,102,197,3	script	絶望の神モロク#04	3097,{/* 60808 (hide)*/}
1@eom.gat,104,194,1	script	ロキ#eomnyd04	512,{/* 60809 (hide)*/
	mes "[ロキ]";
	mes "魔王モロクの最期か。";
	mes "長かった因縁もこれまでだ。";
	cutin "ep14_roki01.bmp", 2;
	close2;
	cutin "ep14_roki01.bmp", 255;
	end;
}
1@eom.gat,99,194,7	script	ニーズヘッグ#eomnyd04	510,{/* 60810 (hide)*/
	mes "[ニーズヘッグ]";
	mes "……これでやっと";
	mes "魔王モロクの企みを";
	mes "本当の意味で止めることが";
	mes "出来ました。";
	mes "ありがとうございます。";
	cutin "ep14_nyd03.bmp", 2;
	next;
	mes "[ニーズヘッグ]";
	mes "ここは彼の作りだした精神世界。";
	mes "彼は身体を失ってもなお";
	mes "この空間を永遠に彷徨い、";
	mes "あがき続けるでしょう。";
	cutin "ep14_nyd02.bmp", 2;
	next;
	mes "[ニーズヘッグ]";
	mes "そしてまた、ここに来る全ての人が";
	mes "今日のような出来事を繰り返します。";
	next;
	mes "[ニーズヘッグ]";
	mes "今日の絶望を明日も。";
	mes "そしてその明日もまた明日も……。";
	mes "幾度となく続けるでしょう。";
	next;
	mes "[ニーズヘッグ]";
	mes "私たちはそれを知っていても、";
	mes "その同じ道をまた歩くでしょう。";
	mes "その度に私は、";
	mes "守護者としてあなたの側に……。";
	cutin "ep14_nyd03.bmp", 2;
	next;
	cutin "ep14_nyd04.bmp", 2;
	mes "[ニーズヘッグ]";
	mes "話が長くなりました。";
	mes "司令官が待っていますよね？";
	mes "今回の件の報告をお願いします。";
	mes "本当にありがとうございました。";
	next;
	mes "‐^ff0000これ以降、魔神殿に入ることは";
	mes "　できなくなります。";
	mes "　司令官アジフに報告してから、";
	mes "　1回目の午前5時以降に、";
	mes "　再度魔神殿に入ることが";
	mes "　できるようになります^000000‐";
	setquest 7597; //state=1
	delquest 7593;
	setquest 116545; //state=1
	compquest 116545;
	next;
	menu "外に出る",-;
	mes "[ニーズヘッグ]";
	mes "遠征隊員がいる場所までお送りします。";
	cutin "ep14_nyd04.bmp", 2;
	close2;
	cutin "ep14_nyd04.bmp", 255;
	warp "morovol.gat",91,87;
	end;
}

1@eom.gat,48,88,0	script	冷たい魔力の結晶#eom01	10043,{/* 60811 */
	misceffect 362;
	hideonnpc;
	getitem 22566,1;
	end;
}
1@eom.gat,51,103,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom02	10043
1@eom.gat,24,109,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom03	10043
1@eom.gat,26,128,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom04	10043
1@eom.gat,40,140,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom05	10043
1@eom.gat,38,139,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom06	10043
1@eom.gat,51,149,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom07	10043
1@eom.gat,49,148,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom08	10043
1@eom.gat,27,100,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom09	10043
1@eom.gat,32,94,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom10	10043
1@eom.gat,60,140,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom11	10043
1@eom.gat,54,97,0	duplicate(冷たい魔力の結晶#eom01)	冷たい魔力の結晶#eom12	10043
