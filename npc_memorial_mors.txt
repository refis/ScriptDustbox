moro_cav.gat,61,69,3	script	先任追跡隊員#a1	730,{/* 65381 */
	if(checkquest(201725)) {
		mes "[先任追跡隊員]";
		mes "もう一度戻って来ると思いました。";
		next;
		mes "[先任追跡隊員]";
		mes "モロクを相手する為には";
		mes "1人ではとても危険なので";
		mes "パーティー員と力を合わせて下さい。";
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "もし、赤い花に通じる道を利用するなら";
			mes "パーティーリーダーの方に";
			mes "私に話しかけるよう、伝えてください。";
			close;
		}
		mes "それでは";
		mes "赤い花に入ってみますか？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[先任追跡隊員]";
			mes "気が変わったら";
			mes "また訪ねて来て下さい！";
			close;
		}
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[先任追跡隊員]";
			mes "まだ赤い花へ続く扉が";
			mes "開いていません。";
			mes "少し待って下さい。";
			close;
		}
		mdcreate "mors";
		mes "[先任追跡隊員]";
		mes "さあ、赤い花に";
		mes "通じる道を開けました。";
		mes "この道を開ける時間は";
		mes "制限されているので";
		mes "早く入って下さい。";
		close;
	}
	mes "[先任追跡隊員]";
	mes "ここはモロク復活を防ぐ連合軍の";
	mes "最前線です。";
	mes "私はモロクの足跡を追っています。";
	next;
	mes "[先任追跡隊員]";
	mes "これまでの努力が実り、";
	mes "ついにモロクの潜伏先として";
	mes "有力な場所を発見しました。";
	next;
	mes "[先任追跡隊員]";
	mes "それがこの^ff0000赤い花^000000です。";
	next;
	mes "[先任追跡隊員]";
	mes "ただ、追跡を専門とする私の力では";
	mes "ここより先への侵入は";
	mes "危険であると判断しました。";
	next;
	mes "[先任追跡隊員]";
	mes "あなたもここを訪れたという事は";
	mes "同じ目的をもった実力者でしょう？";
	next;
	mes "[先任追跡隊員]";
	mes "どうでしょう。";
	mes "一つ中へ侵入してモロク追跡の";
	mes "先陣を切ってくれませんか？";
	next;
	mes "[先任追跡隊員]";
	mes "但し、弱っているとはいえ";
	mes "相手はモロクです。";
	mes "1人では危険なので";
	mes "必ず^ff0000パーティーを組んで^000000";
	mes "挑んでください。";
	next;
	mes "[先任追跡隊員]";
	mes "赤い花へ通じる道は私が開いています。";
	mes "もし、先に進むようでしたら";
	mes "パーティーリーダーの方に";
	mes "私に話しかけるよう、伝えてください。";
	close;
OnInit:
	waitingroom "モルスの洞窟生成",0; //65381
	end;
}
moro_cav.gat,57,69,3	script	赤い花#a1	844,{/* 65382 */
	mes "‐赤い花がある‐";
	next;
	if(select("赤い花に入る","赤い花に入らない") == 2) {
		mes "‐その場を後にした‐";
		close;
	}
	switch(mdenter("mors")) {
	case 0:	// エラーなし
		announce "メモリアルダンジョン[mors] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x1,0x00ff99,0x190,12,0,0;
		setquest 9319; //state=1
		setquest 9318; //state=1
		close2;
		warp "1@rev.gat",26,181;
		end;
	case 1:	// パーティー未加入
		mes "‐パーティー員のみ、";
		mes "　メモリアルダンジョンに";
		mes "　入場することができます‐";
		close;
	case 2:	// ダンジョン未作成
		mes "‐パーティーリーダーが";
		mes "　メモリアルダンジョンを";
		mes "　生成していない状態です‐";
		close;
	default:	// その他エラー
		close;
	}
OnTimer15000:
	initnpctimer;
	misceffect 239; //65382
	end;
OnInit:
	initnpctimer;
	waitingroom "モルスの洞窟入場",0; //65382
	end;
}

1@rev.gat,27,181,0	script	#RZメモリアルスタート	139,{/* 75055 (hide)*/}
1@rev.gat,34,120,0	script	#RZメモリアルエフェクト	139,{/* 75056 (hide)*/}
1@rev.gat,34,48,0	script	#RZメモリアルエフェクト	139,{/* 75057 (hide)*/}
1@rev.gat,31,181,0	script	#RZイベント_1	139,{/* 75058 (hide)*/}
1@rev.gat,31,181,0	script	#RZイベント_1-2	139,{/* 75059 */}
1@rev.gat,20,181,0	script	#モルス入口スタート	139,{/* 75060 */}
1@rev.gat,25,183,5	script	教官長イグリド#入口	751,{/* 75061 */}
1@rev.gat,25,183,5	script	キド#入口	884,{/* 75062 (hide)*/}
1@rev.gat,25,183,5	script	ヒシエ#入口	623,{/* 75063 (hide)*/}
1@rev.gat,60,184,5	script	教官長イグリド#入口奥	751,{/* 75064 (hide)*/}
1@rev.gat,60,184,5	script	キド#入口奥	884,{/* 75065 (hide)*/}
1@rev.gat,60,184,5	script	ヒシエ#入口奥	623,{/* 75066 (hide)*/}
1@rev.gat,64,181,4	script	死神アンク#RZイベント_2	3029,{/* 75067 (hide)*/}
1@rev.gat,34,126,4	script	死神アンク#RZイベント_3	3029,{/* 75068 (hide)*/}

1@rev.gat,34,55,4	script	死神アンク#RZイベント_5	3029,{/* 75070 (hide)*/}
1@rev.gat,112,48,4	script	死神アンク#RZイベント_6	3029,{/* 75071 (hide)*/}
1@rev.gat,63,181,0	warp	#RZ移動_30	8,8,1@rev.gat,103,177	//75072
1@rev.gat,47,181,0	warp	#RZ移動_31	8,8,1@rev.gat,103,177	//75073
1@rev.gat,31,181,0	warp	#RZ移動_32	8,8,1@rev.gat,103,177	//75074
1@rev.gat,104,176,0	script	#RZイベント_3	139,{/* 75075 (hide)*/}
1@rev.gat,102,180,5	script	教官長イグリド#モロク	751,{/* 75076 */}
1@rev.gat,102,180,5	script	キド#モロク前	884,{/* 75077 (hide)*/}
1@rev.gat,102,180,5	script	ヒシエ#モロク前	623,{/* 75078 (hide)*/}
1@rev.gat,111,178,4	script	モロク??#RZ1	1916,{/* 75079 */}
1@rev.gat,33,120,4	script	教官長イグリド#2戦目	751,{/* 75080 */}
1@rev.gat,33,120,4	script	キド#2戦目	884,{/* 75081 (hide)*/}
1@rev.gat,33,120,4	script	ヒシエ#2戦目	623,{/* 75082 (hide)*/}
1@rev.gat,33,120,0	script	#停止エフェクトRZ1	139,{/* 75083 (hide)*/}
1@rev.gat,33,108,0	script	#2部屋目デバフ_1	139,{/* 75084 (hide)*/}
1@rev.gat,33,112,0	script	#2部屋目デバフ_2	139,{/* 75085 (hide)*/}
1@rev.gat,33,116,0	script	#2部屋目デバフ_3	139,{/* 75086 (hide)*/}
1@rev.gat,33,120,0	script	#2部屋目デバフ_4	139,{/* 75087 (hide)*/}
1@rev.gat,33,124,0	script	#2部屋目デバフ_5	139,{/* 75088 (hide)*/}
1@rev.gat,33,128,0	script	#2部屋目デバフ_6	139,{/* 75089 (hide)*/}
1@rev.gat,33,131,0	script	#2部屋目デバフ_7	139,{/* 75090 (hide)*/}
1@rev.gat,34,120,0	script	#魂エフェクト用	139,{/* 75091 */}
1@rev.gat,35,119,0	script	#戦闘_1RZ1	139,{/* 75092 (hide)*/}
1@rev.gat,35,119,0	script	#戦闘_1RZ1_timer	139,{/* 75093 */}
1@rev.gat,34,47,0	script	#戦闘_2RZ1	139,{/* 75094 (hide)*/}
1@rev.gat,34,47,0	script	#戦闘_2RZ1_timer	139,{/* 75095 */}
1@rev.gat,112,48,4	script	モルス・魔導士#RZ1	10029,{/* 75096 (hide)*/}
1@rev.gat,104,47,0	script	#戦闘_3RZ1	139,{/* 75097 (hide)*/}
1@rev.gat,108,51,5	script	教官長イグリド#ボス戦	751,{/* 75098 (hide)*/}
1@rev.gat,108,51,5	script	キド#ボス戦	884,{/* 75099 (hide)*/}
1@rev.gat,108,51,5	script	ヒシエ#ボス戦	623,{/* 75100 (hide)*/}
1@rev.gat,106,60,0	script	#戦闘_3RZ2	139,{/* 75101 (hide)*/}
1@rev.gat,120,60,0	script	#戦闘_3RZ3	139,{/* 75102 (hide)*/}
1@rev.gat,120,61,0	script	#戦闘_3RZ4	139,{/* 75103 (hide)*/}
1@rev.gat,120,62,0	script	#戦闘_3RZ5	139,{/* 75104 (hide)*/}
1@rev.gat,120,63,0	script	#戦闘_3RZ6	139,{/* 75105 (hide)*/}
1@rev.gat,120,58,0	script	#戦闘_3RZ7	139,{/* 75106 (hide)*/}
1@rev.gat,106,183,0	warp	#RZ移動_1	5,5,1@rev.gat,33,117	//75972
1@rev.gat,106,172,0	warp	#RZ移動_2	5,5,1@rev.gat,33,117	//75973
1@rev.gat,117,172,0	warp	#RZ移動_3	5,5,1@rev.gat,33,117	//75974
1@rev.gat,117,183,0	warp	#RZ移動_4	5,5,1@rev.gat,33,117	//75975
1@rev.gat,28,125,0	warp	#RZ移動_5	5,5,1@rev.gat,31,50	//75976
1@rev.gat,28,114,0	warp	#RZ移動_6	5,5,1@rev.gat,31,50	//75977
1@rev.gat,39,114,0	warp	#RZ移動_7	5,5,1@rev.gat,31,50	//75978
1@rev.gat,39,125,0	warp	#RZ移動_8	5,5,1@rev.gat,31,50	//75979
1@rev.gat,28,125,0	script	#RZ移動_5a	45,{/* 75980 (hide)*/}
1@rev.gat,28,114,0	script	#RZ移動_6a	45,{/* 75981 (hide)*/}
1@rev.gat,39,114,0	script	#RZ移動_7a	45,{/* 75982 (hide)*/}
1@rev.gat,39,125,0	script	#RZ移動_8a	45,{/* 75983 (hide)*/}

1@rev.gat,28,53,0	script	#RZ移動_13a	45,{/* 75988 (hide)*/}
1@rev.gat,28,42,0	script	#RZ移動_14a	45,{/* 75989 (hide)*/}
1@rev.gat,39,42,0	script	#RZ移動_15a	45,{/* 75990 (hide)*/}
1@rev.gat,39,53,0	script	#RZ移動_16a	45,{/* 75991 (hide)*/}
1@rev.gat,28,53,0	warp	#RZ移動_13	5,5,1@rev.gat,104,48
1@rev.gat,28,42,0	warp	#RZ移動_14	5,5,1@rev.gat,104,48
1@rev.gat,39,42,0	warp	#RZ移動_15	5,5,1@rev.gat,104,48
1@rev.gat,39,53,0	warp	#RZ移動_16	5,5,1@rev.gat,104,48
1@rev.gat,112,56,3	script	#RZ移動_17a	723,{/* 75996 (hide)*/
	mes "‐^ff0000ここから退出する事で";
	mes "　報酬を受け取る事が出来ます。^000000";
	mes "　外に出ますか？‐";
	next;
	if(select("いいえ","はい") == 1) {
		mes "‐あなたはその場を離れた‐";
		close;
	}
	mes "‐あなたは外に出た‐";
	close2;
	delquest 9318;
	getexp 1537172,0; //99999999
	getexp 0,0; //99999999
	getexp 0,4400000; //18450835
		//delquest 116514; //2周目??
	setquest 116514; //state=1
	compquest 116514;
	getitem 6684,1;
	setquest 201725; //state=1 //1周目??
	warp "moro_cav.gat",59,63;
	end;
}
