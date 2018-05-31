moro_cav.gat,45,60,5	script	調査隊員 #sara	419,{/* 65379 */
	if(!(checkquest(15006) & 0x8)) {
	}
	mes "[調査隊員]";
	mes "黄色い種の内部は非常に危険です。";
	mes "必ずパーティーを組んでから";
	mes "調査を行ってください。";
	mes "よろしくお願いします！";
	close;
}
moro_cav.gat,50,63,5	script	黄色い種#bios	844,{/* 65380 */
	if(!(checkquest(15006) & 0x8)) {
		mes "[調査隊員]";
		mes "ここはモロク復活を防ぐ連合軍の";
		mes "最前線です。";
		mes "私は調査隊により発見された";
		mes "^ff0000黄色い種^000000の調査を行っています。";
		next;
		mes "[調査隊員]";
		mes "しかし、黄色い種の内部には";
		mes "強力なモンスターが生息しており";
		mes "調査隊も甚大な被害を";
		mes "受けてしまいました……。";
		next;
		mes "[調査隊員]";
		mes "調査は続行しなければなりませんが";
		mes "私一人の力では調査を行なえません。";
		next;
		mes "[調査隊員]";
		mes "そこで、腕の立つであろう";
		mes "冒険者の方々にお手伝いを";
		mes "お願いしているのです。";
		next;
		mes "[調査隊員]";
		mes "お願いします！";
		mes "黄色い種の内部の調査に";
		mes "協力してください！";
		next;
		menu "協力する",-;
		mes "[調査隊員]";
		mes "ありがとうございます！";
		mes "黄色い種の内部は非常に危険です。";
		mes "必ずパーティーを組んでから";
		mes "調査を行ってください。";
		mes "よろしくお願いします！";
		setquest 15006; //state=1
		compquest 15006;
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "^ff0000‐この先に進むにはパーティーに";
		mes "　加入している必要がある‐^000000";
		close;
	}
	if(checkquest(15005) & 0x2) {
		delquest 15005;
		delquest 15007;
	}
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	mes "‐黄色い種がある‐";
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		set '@str1$,"黄色い種への道を開く";
		set '@str2$,"黄色い種に入る";
	}
	else {
		set '@str2$,"黄色い種に入る";
	}
	next;
	switch(select('@str1$,'@str2$,"キャンセル")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "パーティー名：" +'@party$;
			mes "パーティーリーダー：" +'@leader$;
			mes "^0000ffbios_island ^000000－予約失敗";
			close;
		}
		mdcreate "bios_island";
		mes "^ff0000‐メモリアルダンジョンが^000000";
		mes "^ff0000　生成されました。^000000";
		mes "^ff0000　再度クリックして^000000";
		mes "^ff0000　入場を押して下さい‐^000000";
		close;
	case 2:
		switch(mdenter("bios_island")) {
		case 0:	// エラーなし
			announce "メモリアルダンジョン[bios_island] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x1, 0x00ff99, 0x190, 12, 0, 0;
			setquest 96430; //state=1
			setquest 15005; //state=1
			setquest 15007; //state=1
			//if(!(checkquest(116535) & 0x8)) { // 2週目??
				setquest 116535; //state=1
				compquest 116535;
			//}
			close2;
			warp "1@dth1.gat",17,93;
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
	case 3:
		mes "‐黄色い種から離れた‐";
		close;
	}
OnInit:
	waitingroom "ビオスの島", 20; //65380
	end;
}


1@dth1.gat,84,90,0	script	#BARRICADE1_1	1905,{/* 69830 */}
1@dth1.gat,84,91,0	script	#BARRICADE1_2	1905,{/* 69831 */}
1@dth1.gat,84,92,0	script	#BARRICADE1_3	1905,{/* 69832 */}
1@dth1.gat,84,93,0	script	#BARRICADE1_4	1905,{/* 69833 */}
1@dth1.gat,84,94,0	script	#BARRICADE1_5	1905,{/* 69834 */}
1@dth1.gat,84,95,0	script	#BARRICADE1_6	1905,{/* 69835 */}
1@dth1.gat,84,96,0	script	#BARRICADE1_7	1905,{/* 69836 */}
1@dth1.gat,84,97,0	script	#BARRICADE1_8	1905,{/* 69837 */}

1@dth1.gat,71,97,3	script	ジェイス#bios1	467,{/* 69839 */
	mes "[ジェイス]";
	mes "……ジェイスだ。";
	next;
	mes "[ジェイス]";
	mes "……。";
	close;
}
1@dth1.gat,74,94,3	script	死神アンク#bios1	3029,{/* 69840 (hide)*/}
1@dth1.gat,67,97,5	script	ブリド#bios1	468,{/* 69841 */
	mes "[ブリド]";
	mes "私はブリド。";
	mes "魔王モロクの復活を";
	mes "阻止しに来たんだ。";
	close;
}
1@dth1.gat,67,97,0	script	#会話用ダミー1	139,{/* 69842 (hide)*/}
1@dth1.gat,60,96,5	script	司令官アジフ#bios1	459,{/* 69843 (hide)*/}
1@dth1.gat,60,93,5	script	教官長イグリド#bios1	751,{/* 69844 (hide)*/}
1@dth1.gat,60,96,5	script	キド#bios1	884,{/* 69845 (hide)*/}
1@dth1.gat,60,93,5	script	リーン#bios1	885,{/* 69846 (hide)*/}
1@dth1.gat,60,96,5	script	連合軍事務官#bios1	754,{/* 69847 (hide)*/}
1@dth1.gat,60,93,5	script	リョースン#bios1	748,{/* 69848 (hide)*/}
1@dth1.gat,58,95,5	script	ヒュー#bios1	868,{/* 69849 (hide)*/}
1@dth1.gat,58,92,5	script	ヘンジヌ#bios1	931,{/* 69850 (hide)*/}
1@dth1.gat,60,96,5	script	ヒシエ#bios1	623,{/* 69851 (hide)*/}
1@dth1.gat,60,93,5	script	エイヴァント#bios1	618,{/* 69852 (hide)*/}
1@dth1.gat,60,96,5	script	大臣ヘスランタ#bios1	451,{/* 69853 (hide)*/}
1@dth1.gat,60,93,5	script	先発隊長アバランチェ#bi	450,{/* 69854 (hide)*/}
1@dth1.gat,67,97,0	script	#会話用ダミー2	139,{/* 69855 (hide)*/}

1@dth1.gat,326,103,0	script	warp1#bios1	45,{/* 69858 */
setquest 116535; //state=1
compquest 116535;
}

1@dth2.gat,150,126,0	script	#BARRICADE2_1	1905,{/* 69859 */}
1@dth2.gat,150,127,0	script	#BARRICADE2_2	1905,{/* 69860 */}
1@dth2.gat,150,128,0	script	#BARRICADE2_3	1905,{/* 69861 */}
1@dth2.gat,150,129,0	script	#BARRICADE2_4	1905,{/* 69862 */}
1@dth2.gat,150,130,0	script	#BARRICADE2_5	1905,{/* 69863 */}
1@dth2.gat,150,131,0	script	#BARRICADE2_6	1905,{/* 69864 */}
1@dth2.gat,150,132,0	script	#BARRICADE2_7	1905,{/* 69865 */}
1@dth2.gat,150,133,0	script	#BARRICADE2_8	1905,{/* 69866 */}
1@dth2.gat,67,97,0	script	start1#bios2	139,{/* 69869 (hide)*/}
1@dth2.gat,67,97,0	script	BC用#bios2	139,{/* 69870 */}
1@dth2.gat,326,103,0	script	warp1#bios2	45,{/* 69873 */}

1@dth3.gat,62,80,3	script	死者のオークゾンビ#1bio	3016,{/* 69874 (hide)*/}
1@dth3.gat,64,80,3	script	死者のオークゾンビ#2bio	3016,{/* 69875 (hide)*/}
1@dth3.gat,66,80,3	script	死者のオークゾンビ#3bio	3016,{/* 69876 (hide)*/}
1@dth3.gat,68,80,3	script	死者のオークゾンビ#4bio	3016,{/* 69877 (hide)*/}
1@dth3.gat,72,80,3	script	死者のオークゾンビ#5bio	3016,{/* 69878 (hide)*/}
1@dth3.gat,74,80,3	script	死者のオークゾンビ#6bio	3016,{/* 69879 (hide)*/}
1@dth3.gat,76,80,3	script	死者のオークゾンビ#7bio	3016,{/* 69880 (hide)*/}
1@dth3.gat,78,80,3	script	死者のオークゾンビ#8bio	3016,{/* 69881 (hide)*/}
1@dth3.gat,62,86,3	script	死者のオークゾンビ#1bio	3016,{/* 69882 (hide)*/}
1@dth3.gat,64,86,3	script	死者のオークゾンビ#2bio	3016,{/* 69883 (hide)*/}
1@dth3.gat,66,86,3	script	死者のオークゾンビ#3bio	3016,{/* 69884 (hide)*/}
1@dth3.gat,68,86,3	script	死者のオークゾンビ#4bio	3016,{/* 69885 (hide)*/}
1@dth3.gat,72,86,3	script	死者のオークゾンビ#5bio	3016,{/* 69886 (hide)*/}
1@dth3.gat,74,86,3	script	死者のオークゾンビ#6bio	3016,{/* 69887 (hide)*/}
1@dth3.gat,76,86,3	script	死者のオークゾンビ#7bio	3016,{/* 69888 (hide)*/}
1@dth3.gat,78,86,3	script	死者のオークゾンビ#8bio	3016,{/* 69889 (hide)*/}
1@dth3.gat,62,92,3	script	死者のオークゾンビ#1bio	3016,{/* 69890 (hide)*/}
1@dth3.gat,64,92,3	script	死者のオークゾンビ#2bio	3016,{/* 69891 (hide)*/}
1@dth3.gat,66,92,3	script	死者のオークゾンビ#3bio	3016,{/* 69892 (hide)*/}
1@dth3.gat,68,92,3	script	死者のオークゾンビ#4bio	3016,{/* 69893 (hide)*/}
1@dth3.gat,72,92,3	script	死者のオークゾンビ#5bio	3016,{/* 69894 (hide)*/}
1@dth3.gat,74,92,3	script	死者のオークゾンビ#6bio	3016,{/* 69895 (hide)*/}
1@dth3.gat,76,92,3	script	死者のオークゾンビ#7bio	3016,{/* 69896 (hide)*/}
1@dth3.gat,78,92,3	script	死者のオークゾンビ#8bio	3016,{/* 69897 (hide)*/}

1@dth3.gat,72,74,3	script	ジェイス#bios3	467,{/* 69899 */
	{
		mes "[ジェイス]";
		mes "……無事だったか。";
		mes "ここが最深部のようだ。";
		close;
	}
	{
		mes "[ジェイス]";
		mes "くっ、体が……。";
		close;
	}
	mes "[ジェイス]";
	mes "……どうやら俺たちは、";
	mes "自分の力を過信していたようだ。";
	next;
	mes "[ジェイス]";
	mes "……おかげで命拾いをしたよ。";
	mes "ありがとう。";
	close;
}
1@dth3.gat,70,67,3	script	死神アンク#bios3	3029,{/* 69900 (hide)*/}
1@dth3.gat,64,74,5	script	ブリド#bios3	468,{/* 69901 */
	{
	}
	{
		mes "[ブリド]";
		mes "くっ、体が……！";
		mes "ここまで……なのか……！";
		close;
	}
	mes "[ブリド]";
	mes "すまないな、助かったよ。";
	mes "私が道中で拾ったこの";
	mes "^ff0000勇者の証^000000は";
	mes "君にこそ相応しいアイテムだ。";
	mes "是非受け取ってくれ。";
	next;
	mes "[ブリド]";
	mes "さぁ、早くこの気分の悪い場所から";
	mes "出ようぜ!!";
	close2;
	delquest 96430;
	getexp 998144,0; //99999999
	getexp 0,3600000; //21593386
	setquest 116513; //state=1
	delquest 116513;
	getitem 6684, 1;
	setquest 201720; //state=1
	warp "moro_cav.gat",45,63;
	end;
}
1@dth3.gat,66,72,0	script	#増援判定用1	139,{/* 69905 (hide)*/}
1@dth3.gat,66,72,0	script	#talkshow管理	139,{/* 69906 */}
1@dth3.gat,66,72,5	script	司令官アジフ#bios3	459,{/* 69907 (hide)*/
	{
		cutin "ep13_captin_edq.bmp", 2;
		mes "[アジフ]";
		mes "イグリド！";
		mes "一気に勝負を決めるぞ！";
		close2;
		cutin "ep13_captin_edq.bmp", 255;
		end;
	}
	{
		mes "‐アジフは石化している‐";
		close;
	}
	cutin "ep13_captin_edq.bmp", 2;
	mes "[アジフ]";
	mes "司令官の仕事をしすぎて";
	mes "腕が鈍っちまったか……。";
	next;
	mes "[アジフ]";
	mes "悪いが俺はここまでみたいだ。";
	mes "司令官が長い間、拠点を留守に";
	mes "するわけにもいかないしな。";
	next;
	mes "[アジフ]";
	mes strcharinfo(0)+ "。";
	mes "あとは任せたぜ。";
	mes "しっかりケリつけてこい。";
	close2;
	cutin "ep13_captin_edq.bmp", 255;
	end;
}
1@dth3.gat,66,72,5	script	キド#bios3	884,{/* 69908 (hide)*/}
1@dth3.gat,66,72,5	script	ヒシエ#bios3	623,{/* 69909 (hide)*/}
1@dth3.gat,66,72,5	script	大臣ヘスランタ#bios3	451,{/* 69910 (hide)*/}
1@dth3.gat,70,72,3	script	教官長イグリド#bios3	751,{/* 69911 (hide)*/
	{
		mes "[イグリド]";
		mes "伊達に傭兵はやってないぜ！";
		mes "俺の一撃、食らいな！";
		close;
	}
	{
		mes "‐イグリドは石化している‐";
		close;
	}
	mes "[イグリド]";
	mes "どうやら兄貴は。";
	mes "拠点に戻るらしいな。";
	next;
	mes "[イグリド]";
	mes "俺か？";
	mes "俺はここから先も一緒に行くぜ。";
	mes "あの死神も放っておけないしな。";
	next;
	mes "[イグリド]";
	mes "兄貴の分もしっかり戦うから";
	mes "頼りにしてくれよな！";
	close;
}
1@dth3.gat,70,72,3	script	リーン#bios3	885,{/* 69912 (hide)*/}
1@dth3.gat,70,72,3	script	エイヴァント#bios3	618,{/* 69913 (hide)*/}
1@dth3.gat,70,72,3	script	先発隊長アバランチェ#bi	450,{/* 69914 (hide)*/}

1@dth3.gat,69,67,0	script	freeze#bios3	139,{/* 69916 (hide)*/}
