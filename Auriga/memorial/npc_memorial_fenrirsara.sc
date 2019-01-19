dali02.gat,97,142,3	script	バーンハード博士#a1	865,{/* 51020 */
	if(checkquest(120165)&8 == 0) {
		mes "[バーンハード博士]";
		mes "私はシュバルツバルド最高の";
		mes "兵器研究をしている、";
		mes "バーンハードという者だ。";
		next;
		mes "[バーンハード博士]";
		mes "終わらなき研究の末に";
		mes "多くの兵器を作り上げてきたが、";
		mes "まだ何かが足りない気がしていた。";
		next;
		mes "[バーンハード博士]";
		mes "そんな中、私は";
		mes "古書に記された兵器の研究を";
		mes "進めていた時、";
		mes "この場所にある次元の狭間の";
		mes "存在を知った。";
		next;
		mes "[バーンハード博士]";
		mes "そして、さらに強力で、";
		mes "優れた兵器を造るためには、";
		mes "過去に輝いた時代の遺物が";
		mes "必要だと言う事実を知ったのだ。";
		next;
		mes "[バーンハード博士]";
		mes "強力な兵器を作り上げるためには、";
		mes "遠い過去、強大な力を持った";
		mes "2人の魔導士の激しい戦闘で";
		mes "現れたという^ff0000ギガンテスの破片^000000";
		mes "という物質が必要だ。";
		next;
		mes "[バーンハード博士]";
		mes "しかし私は、";
		mes "この場所を離れる訳にはいかない。";
		mes "それに、私のような非力な科学者が";
		mes "魔導士たちの激しい戦闘の場へ行っても";
		mes "何もできないだろう。";
		next;
		mes "[バーンハード博士]";
		mes "そしてこのギガンテスの破片……";
		mes "この破片から想像するに、";
		mes "ギガンテスも大きく、";
		mes "強いものであったに違いない。";
		mes "私のような者の力では";
		mes "到底敵わないだろう。";
		next;
		mes "[バーンハード博士]";
		mes "そこで私は、私の代わりに";
		mes "破片を集めてくれる";
		mes "勇者を探しているのだ。";
		mes "君が私に協力してくれると";
		mes "嬉しいのだが……。";
		next;
		mes "[バーンハード博士]";
		mes "どうだ？";
		mes "過去に行き、ギガンテスの破片を";
		mes "探し出してきてはくれないか？";
		mes "もちろん、報酬は弾むぞ。";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[バーンハード博士]";
			mes "気が変わったら";
			mes "また訪ねて来てくれ。";
			close;
		}
		mes "[バーンハード博士]";
		mes "そうか、引き受けてくれるか！";
		mes "ありがとう、本当に助かるよ。";
		next;
		mes "[バーンハード博士]";
		mes "それでは、フェンリルとサラがいた";
		mes "過去のグラストヘイムに行く時は";
		mes "私に話しかけてくれ。";
		mes "よろしく頼む。";
		setquest 120165; //state=1
		compquest 120165;
		close;
	}
	if(checkquest(9337)) {
		{
			mes "[バーンハード博士]";
			mes "おお、君か。";
			mes "過去のグラストヘイムは";
			mes "危険な状況だっただろう？";
			next;
			mes "[バーンハード博士]";
			mes "手伝ってくれたお礼に";
			mes "この美しいピアスの";
			mes "どちらかを受け取ってくれ。";
			next;
			mes "‐^ff0000ヒールピアス";
			mes "　ヒールLv1使用可能^000000‐";
			mes "　";
			mes "‐^5500ffテレポートピアス";
			mes "　テレポートLv1使用可能^000000‐";
			next;
			mes "[バーンハード博士]";
			mes "このピアスは私の助手が";
			mes "^ff0000ギガンテスの破片^000000と";
			mes "交換もしている。";
			mes "助手に頼めば";
			mes "無料でエンチャントも可能だ。";
			mes "きっと役に立つだろう。";
			next;
			select("^ff0000ヒールピアス^000000を貰う:^5500ffテレポートピアス^000000を貰う:会話をやめる")
			mes "[バーンハード博士]";
			mes "ギガンテスの破片は";
			mes "多ければ多いほど助かる。";
			mes "たくさん集めてきて欲しい。";
			next;
			mes "[バーンハード博士]";
			mes "ただし次元移動機の";
			mes "エネルギー充填には時間がかかる。";
			mes "しばらくしてからまた来てくれ。";
		}
		else {
			mes "[バーンハード博士]";
			mes "おお、君か。";
			mes "過去のグラストヘイムはどうだったか？";
			mes "危険な状況だっただろう？";
			mes "ご苦労だった。";
			next;
			mes "[バーンハード博士]";
			mes "それで、";
			mes "ギガンテスの破片は見つかったか？";
			mes "持ち帰ってきてはくれたのか？";
			mes "破片を手に入れる事が出来たのであれば";
			mes "それを私に譲ってほしい。";
			next;
			mes "[バーンハード博士]";
			mes "君がまた私を手伝ってくれて、";
			mes "ギガンテスの破片を";
			mes "集めてくれるのであれば、";
			mes "それに相応する";
			mes "エンチャントを付けるよう";
			mes "私の助手に言っておこう。";
			next;
			mes "[バーンハード博士]";
			mes "ギガンテスの破片は";
			mes "多ければ多いほど助かる。";
			mes "たくさん集めて";
			mes "彼の元を訪れるといい。";
			next;
			mes "[バーンハード博士]";
			mes "君さえ良かったら";
			mes "また調査に協力して欲しい。";
			mes "ただし次元移動機の";
			mes "エネルギー充填には時間がかかる。";
			mes "しばらくしてからまた来てくれ。";
		}
		next;
		mes "[インフォメーション]";
		mes "‐^ff0000入場してから1回目の午前5時以降^000000";
		mes "　且つ";
		mes "　^ff0000最後の入場から1時間経過後^000000";
		mes "　に再度入場可能になります‐";
		delquest 9337;
		setquest 9337; //state=1
		delquest 9337;
		getitem 28385, 1;
		close;
	}
	{
		{
			mes "[バーンハード博士]";
			mes "次元移動機のエネルギー充填が";
			mes "完了したようだ。";
			mes "これで過去のグラストヘイムへ";
			mes "移動することが可能になった。";
			next;
			mes "[バーンハード博士]";
			mes "強力な兵器を作り上げるためには、";
			mes "ギガンテスの破片という物質が必要だ。";
			mes "もう一度過去に行って";
			mes "ギガンテスの破片を";
			mes "探し出してきてくれるか？";
			mes "もちろん、報酬は弾むぞ。";
			delquest 9336;
			delquest 120195;
			setquest 120155; //state=1
			delquest 120155;
			close;
		}
		mes "[バーンハード博士]";
		mes "次元の狭間を開くには";
		mes "多くのエネルギーが必要になるから、";
		mes "しばらくは休んでいてくれ。";
		next;
		mes "[インフォメーション]";
		mes "‐^ff0000入場してから1回目の午前5時以降^000000";
		mes "　且つ";
		mes "　^ff0000最後の入場から1時間経過後^000000";
		mes "　に再度入場可能になります‐";
		close;
	}
	mes "[バーンハード博士]";
	mes "過去のグラストヘイムに行く";
	mes "準備は出来たのか？";
	mes "そちらがよければ";
	mes "次元の狭間を開こう。";
	next;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[バーンハード博士]";
		mes "おっと、すまない。";
		mes "次元移動機を作動させたいなら";
		mes "^ff0000パーティーのリーダー^000000が";
		mes "私に話かけてくれ。";
		close;
	}
	if(select("はい","いいえ") == 2) {
		mes "[バーンハード博士]";
		mes "気が変わったら";
		mes "また訪ねて来てくれ。";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[バーンハード博士]";
		mes "まだ次元移動機が";
		mes "作動できていない。";
		mes "少し待ってくれ。";
		close;
	}
	mdcreate "glast_sara";
	mes "[バーンハード博士]";
	mes "さあ、フェンリルとサラがいた時代の";
	mes "過去のグラストヘイムに行けるよう、";
	mes "次元移動機を作動させておいた。";
	mes "あちらへ行ける時間は長くない。";
	mes "扉が開いたら、急いで向かってくれ。";
	close;
OnInit:
	waitingroom "フェンリルとサラ", 20; //51020
	end;
}

dali02.gat,93,146,6	script	助手#a1	851,{/* 51021 */
OnInit:
	waitingroom "交換・エンチャント", 20; //51021
	end;
}

dali02.gat,99,148,3	script	次元移動機#XX1	10007,{/* 51022 */
	mes "‐フェンリルとサラが";
	mes "　激しい戦闘を行った";
	mes "　過去のグラストヘイムへと続く";
	mes "　次元移動機だ‐";
	next;
	if(select("次元の狭間に入る","次元の狭間に入らない") == 2) {
		mes "‐あなたは次元移動機から離れた‐";
		close;
	}
	switch(mdenter("glast_sara")) {
	case 0:	// エラーなし
		announce "メモリアルダンジョン[glast_sara] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		setquest 9336; //state=1
		setquest 120195; //state=1
		close2;
		//warp "1@glast.gat",367,304;
		end;
	case 1:	// パーティー未加入
		mes "‐パーティーリーダーが";
		mes "　メモリアルダンジョンを";
		mes "　生成したパーティーのメンバーのみ、";
		mes "　メモリアルダンジョンに入れます‐";
		close;
	case 2:	// ダンジョン未作成
		mes "‐メモリアルダンジョン";
		mes "　glast_saraが存在しません。";
		mes "　パーティーリーダーが";
		mes "　メモリアルダンジョンを";
		mes "　生成していない状態です‐";
		close;
	default:	// その他エラー
		close;
	}
}

1@glast.gat,359,294,4	script	フェンリル#glast_01_	664,{/* 71827 */}
1@glast.gat,359,296,4	script	#effect_glast_event01_0	844,{/* 71885 (hide)*/}
1@glast.gat,353,294,4	script	#effect_glast_event01_0	844,{/* 71886 (hide)*/}
1@glast.gat,359,294,0	script	#glast_event_3_	139,{/* 69519 (hide)*/}
1@glast.gat,353,290,8	script	サラの幻影#glast_50_	10066,{/* 71330 (hide)*/}
1@glast.gat,359,294,4	script	フェンリル#glast_11_	664,{/* 71331 (hide)*/}
1@glast.gat,360,304,4	script	#effect_glast_event01_0	844,{/* 71850 (hide)*/}
1@glast.gat,367,304,4	script	#effect_glast_event01_0	844,{/* 71871 (hide)*/}
1@glast.gat,366,295,4	script	#effect_glast_event01_0	844,{/* 71884 (hide)*/}
1@glast.gat,376,303,0	script	#glast_move_05_	45,{/* 71332 (hide)*/}
1@glast.gat,352,304,4	script	#effect_glast_event01_0	844,{/* 71828 (hide)*/}
1@glast.gat,356,284,4	script	#effect_glast_event01_0	844,{/* 71887 (hide)*/}
misceffect 60, "フェンリル#glast_01_"; //71827
@spawn(type: BL_MOB, ID: 36249, speed: 150, option: 0, view: 3198, pos: "1@glast.gat"(355, 294), dir: 0, name: "凶悪なガリオン")
@nomalattack(src: "3198:凶悪なガリオン:1@glast.gat"(36249), dst: , damage: 0, sDelay: 624, dDelay: 412, tick: 785185920)
@nomalattack(src: "3198:凶悪なガリオン:1@glast.gat"(36249), dst: , damage: 0, sDelay: 624, dDelay: 412, aDelay: 903)
@nomalattack(src: "3198:凶悪なガリオン:1@glast.gat"(36249), dst: , damage: 0, sDelay: 624, dDelay: 412, aDelay: 903)
@mob_defeated("3198:凶悪なガリオン:1@glast.gat"(36249))
hideoffnpc "#glast_event_3_"; //69519
hideonnpc "#glast_event_3_"; //69519
hideonnpc "#glast_event_3_"; //69519
hideonnpc "フェンリル#glast_01_"; //71827
misceffect 60, "フェンリル#glast_01_"; //71827
announce "‐フェンリルは南へ向かったようです。フェンリルについていこう！‐", 0x1, 0xffff00, 0x190, 20, 0, 0;
1@glast.gat,345,283,4	script	#effect_glast_event01_0	844,{/* 69518 (hide)*/}
1@glast.gat,352,279,0	script	#glast_move_01_	45,{/* 69520 */}
1@glast.gat,352,279,0	script	#glast_move_01_jp_	45,{/* 71352 (hide)*/}
1@glast.gat,345,274,0	script	#バリケード12_1_	1905,{/* 71873 */}
1@glast.gat,347,274,0	script	#バリケード12_3_	1905,{/* 71874 */}
1@glast.gat,349,274,0	script	#バリケード12_5_	1905,{/* 71875 */}
1@glast.gat,351,274,0	script	#バリケード12_7_	1905,{/* 71876 */}
1@glast.gat,353,274,0	script	#バリケード12_9_	1905,{/* 71877 */}
1@glast.gat,355,274,0	script	#バリケード12_11_	1905,{/* 71878 */}
1@glast.gat,357,274,0	script	#バリケード12_13_	1905,{/* 71879 */}
1@glast.gat,346,273,0	script	#バリケード12_16_	1905,{/* 71880 */}
1@glast.gat,348,273,0	script	#バリケード12_18_	1905,{/* 71881 */}
1@glast.gat,350,273,0	script	#バリケード12_20_	1905,{/* 71882 */}
1@glast.gat,352,273,0	script	#バリケード12_22_	1905,{/* 71883 */}
1@glast.gat,354,273,0	script	#バリケード12_24_	1905,{/* 71901 */}
1@glast.gat,356,273,0	script	#バリケード12_26_	1905,{/* 71919 */}
1@glast.gat,358,273,0	script	#バリケード12_28_	1905,{/* 71921 */}
1@glast.gat,351,269,0	script	#glast_move_04_	45,{/* 71052 (hide)*/}
mes "‐フェンリルを追いかけますか？‐";
next;
select("^0000FF急いで移動する(ショートカット)^000000:^FF0000歩いて移動する^000000")
mes "‐あなたはフェンリルの";
mes "　後を急いで追いかけた‐";
close;
1@glast.gat,352,279,0	warp	#glast_move_01_	2,2,1@glast.gat,47,264 //69520 from_pos=(354, 280)
1@glast.gat,47,270,4	script	フェンリル#glast_03_	664,{/* 69522 */}
1@glast.gat,47,270,0	script	#glast_event_7_	139,{/* 69523 */}
1@glast.gat,42,273,0	script	#バリケード1_1_	1905,{/* 69384 */}
1@glast.gat,43,273,0	script	#バリケード1_2_	1905,{/* 69385 */}
1@glast.gat,44,273,0	script	#バリケード1_3_	1905,{/* 69386 */}
1@glast.gat,45,273,0	script	#バリケード1_4_	1905,{/* 69387 */}
cutin "fenrir_a.bmp", 2;
mes "[フェンリル]";
mes "来てくれたのね、";
mes "ありがとう！";
close;
cutin "fenrir_a.bmp", 255;
viewpoint 2, 1, 1, 0, 0xFFFFFF00; //69523
hideonnpc "#glast_event_7_"; //69523
cutin "fenrir_a.bmp", 2;
cutin "fenrir_a.bmp", 255;
hideonnpc "フェンリル#glast_03_"; //69522
@mapmoved(from: 1@glast.gat(47, 270), map: 1@glast.gat(40, 350))
1@glast.gat,44,366,0	script	#effect1_	139,{/* 73456 */}
misceffect 222, "#effect1_"; //73456
cutin "fenrir_a.bmp", 2;
mes "[フェンリル]";
mes "この剣……";
mes "とうとう見つけたわ！";
close;
misceffect 222, "#effect1_"; //73456
cutin "fenrir_a.bmp", 255;
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
@mapmoved(from: 1@glast.gat(44, 366), map: 1@glast.gat(199, 333))
1@glast.gat,189,342,0	script	#glast_move_06_	45,{/* 71055 (hide)*/}
1@glast.gat,186,325,0	script	#バリケード6_4_	1905,{/* 69428 */}
1@glast.gat,188,325,0	script	#バリケード6_6_	1905,{/* 69475 */}
1@glast.gat,190,325,0	script	#バリケード6_8_	1905,{/* 71539 */}
1@glast.gat,192,325,0	script	#バリケード6_10_	1905,{/* 71540 */}
1@glast.gat,194,325,0	script	#バリケード6_12_	1905,{/* 71541 */}
1@glast.gat,198,325,0	script	#バリケードcenter_2_	1905,{/* 71542 */}
1@glast.gat,187,345,0	script	#バリケード9_1_	1905,{/* 71687 */}
1@glast.gat,189,346,0	script	#バリケード9_2_	1905,{/* 71688 */}
1@glast.gat,200,346,4	script	サラ・アイリン#glast_jp	10066,{/* 71327 */}
1@glast.gat,200,340,0	script	フェンリル#b_	664,{/* 71328 */}
1@glast.gat,200,340,0	script	#bgm_change01_	139,{/* 71888 (hide)*/}
1@glast.gat,200,346,4	script	サラ・アイリン#chase_0q	3190,{/* 71915 (hide)*/}
1@glast.gat,200,346,4	script	サラの幻影#ex_battle_0q	10066,{/* 71353 (hide)*/}
1@glast.gat,200,346,0	script	#ex_battle_sara_	139,{/* 71354 */}
1@glast.gat,201,325,0	script	#バリケードcenter_5_	1905,{/* 71545 */}
1@glast.gat,205,325,0	script	#バリケード7_2_	1905,{/* 71546 */}
1@glast.gat,207,325,0	script	#バリケード7_4_	1905,{/* 71547 */}
1@glast.gat,209,325,0	script	#バリケード7_6_	1905,{/* 71548 */}
1@glast.gat,211,325,0	script	#バリケード7_8_	1905,{/* 71549 */}
1@glast.gat,213,325,0	script	#バリケード7_10_	1905,{/* 71550 */}
1@glast.gat,210,346,0	script	#バリケード10_1_	1905,{/* 71689 */}
1@glast.gat,212,345,0	script	#バリケード10_2_	1905,{/* 71690 */}
mes "‐フェンリルとサラが対峙している!‐";
next;
select("^FF0000戦闘を見届ける^000000::少し考える")
mes "‐対峙した二人を前に、";
mes "　あなたはどうすべきか";
mes "　もう少し考えてみることにした‐";
close;
1@glast.gat,184,325,0	script	#バリケード6_2_	1905,{/* 69427 */}
1@glast.gat,198,350,4	script	フェンリル#chase_	664,{/* 71893 (hide)*/}
1@glast.gat,200,350,0	script	#effect2_	139,{/* 73457 */}
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
mes "‐フェンリルとサラが対峙している!‐";
next;
select("^FF0000戦闘を見届ける^000000::少し考える")
mes "‐二人の対決を見届ける事にした‐";
close;
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 8, "フェンリル#b_"; //71328
misceffect 521, "フェンリル#b_"; //71328
misceffect 583, "フェンリル#b_"; //71328
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
hideoffnpc "#bgm_change01_"; //71888
musiceffect "44";
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
1@glast.gat,180,328,0	script	#バリケード8_1_	1905,{/* 71552 */}
1@glast.gat,180,330,0	script	#バリケード8_3_	1905,{/* 71685 */}
1@glast.gat,180,332,0	script	#バリケード8_5_	1905,{/* 71686 */}
misceffect 222, "#effect2_"; //73457
misceffect 903, "フェンリル#b_"; //71328
misceffect 222, "#effect2_"; //73457
misceffect 831, "サラ・アイリン#glast_jp"; //71327
misceffect 222, "#effect2_"; //73457
misceffect 886, "フェンリル#b_"; //71328
misceffect 930, "フェンリル#b_"; //71328
misceffect 916, "サラ・アイリン#glast_jp"; //71327
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
hideonnpc "フェンリル#b_"; //71328
hideonnpc "サラ・アイリン#glast_jp"; //71327
hideoffnpc "フェンリル#chase_"; //71893
hideoffnpc "サラ・アイリン#chase_0q"; //71915
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 651, "サラ・アイリン#chase_0q"; //71915
1@glast.gat,189,342,0	warp	#glast_move_06_	2,2,1@glast.gat,201,204 //71055 from_pos=(193, 343)
1@glast.gat,199,202,0	script	#bgm_change02_	139,{/* 71890 */}
1@glast.gat,199,205,0	script	#glast_time_q1_	139,{/* 71891 */}
1@glast.gat,194,214,5	script	サラの幻影#chase_1_	3190,{/* 69528 (hide)*/}
musiceffect "147";
setquest 120160; //state=1
delquest 120160;
viewpoint 1, 351, 270, 0, 0xFFFF0000; //71891
announce "フェンリル : ごめんなさい、力が足りずうまく移動ができなかったわ。　入口で合流しましょう……！", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "サラ : 逃がさないぞ!!私の魔力の恐ろしさを見せつけてやるわ!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "‐サラの魔力の影響で、「サラの幻影」、「レッドギガンテス」、「秘宝」が出現しました！", 0x1, 0xffff00, 0x190, 20, 0, 0;
1@glast.gat,176,178,4	script	宝箱#glast_sara3_	10005,{/* 69377 */}
announce "‐5分以内にフェンリルの元にたどり着くと、報酬経験値が大幅アップ！さらに「サラの幻影」と戦うことができます‐", 0x1, 0xffff00, 0x190, 20, 0, 0;
hideonnpc "宝箱#glast_sara3_"; //69377
misceffect 10, "宝箱#glast_sara3_"; //69377
getitem 0, 0;
getitem 0, 0;
getitem 0, 0;
getitem 0, 0;
getitem 0, 0;
getitem 0, 0;
announce "サラ : 私に楯突いた事を後悔しなさい！", 0x1, 0x00ebff, 0x190, 20, 0, 0;
delitem 938, 1;
getitem 730, 1;
delitem 7063, 1;
getitem 7229, 1;
getitem 7229, 1;
announce "サラ : ネズミみたいに逃げやがって!!　消滅させてやるっ!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "フェンリル : サラ、チューチュー。これで満足？捕まえてみなさいっ！", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "サラ : !!　フェンリル！この足でつぶしてやるわ!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
delitem 1013, 1;
getitem 719, 1;
delitem 930, 1;
getitem 723, 1;
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "‐1分経過‐", 0x1, 0xffff00, 0x190, 20, 0, 0;
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,245,187,4	script	レッドギガンテス#glast_	10067,{/* 71088 */}
hideonnpc "レッドギガンテス#glast_"; //71088
@spawn(type: BL_MOB, ID: 12374, speed: 300, option: 0, view: 3193, pos: "1@glast.gat"(245, 187), dir: 0, name: "双斧レッドギガンテス#X2")
announce "サラ : どこにいる!!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,268,130,0	script	#monster_gimmick_2_	139,{/* 71092 */}
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
hideonnpc "#monster_gimmick_2_"; //71092
@spawn(type: BL_MOB, ID: 3759, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(267, 140), dir: 0, name: "ギガンテス#gb1")
@spawn(type: BL_MOB, ID: 4945, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(268, 140), dir: 0, name: "ギガンテス#gb2")
@spawn(type: BL_MOB, ID: 5357, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(269, 140), dir: 0, name: "ギガンテス#gb3")
@spawn(type: BL_MOB, ID: 16957, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(215, 72), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 14828, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "機動のギガンテス#aa1")
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,200,135,4	script	宝箱#glast_sara4_	10005,{/* 69378 */}
hideonnpc "宝箱#glast_sara4_"; //69378
misceffect 10, "宝箱#glast_sara4_"; //69378
getitem 719, 1;
getitem 723, 1;
getitem 0, 0;
getitem 730, 1;
announce "‐2分経過‐", 0x1, 0xffff00, 0x190, 20, 0, 0;
getitem 7229, 1;
1@glast.gat,207,79,5	script	サラの幻影#chase_2_	3190,{/* 69529 (hide)*/}
@spawn(type: BL_MOB, ID: 13160, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 15199, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "機動のギガンテス#bb1")
misceffect 34, "サラの幻影#chase_2_"; //69529
hideoffnpc "サラの幻影#chase_2_"; //69529
misceffect 135, "サラの幻影#chase_2_"; //69529
@spawn(type: BL_MOB, ID: 42452, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(207, 79), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 32930, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(207, 79), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 351, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(207, 79), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 783, speed: 2000, option: 0, view: 3200, pos: "1@glast.gat"(207, 79), dir: 0, name: "#earth")
@nomalattack(src: "3199:#meteo:1@glast.gat"(351), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785518623)
@nomalattack(src: "3200:#earth:1@glast.gat"(783), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785518623)
@nomalattack(src: "3199:#meteo:1@glast.gat"(32930), dst: , damage: 85, sDelay: 1000, dDelay: 412, tick: 785518623)
@nomalattack(src: "3199:#meteo:1@glast.gat"(42452), dst: , damage: 94, sDelay: 1000, dDelay: 412, tick: 785518623)
@changeoption(id: 351, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(351), dst: 351, skill: "インビジブル"(353), val: 1)
@changeoption(id: 783, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3200:#earth:1@glast.gat"(783), dst: 783, skill: "インビジブル"(353), val: 1)
@changeoption(id: 32930, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(32930), dst: 32930, skill: "インビジブル"(353), val: 1)
@changeoption(id: 42452, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(42452), dst: 42452, skill: "インビジブル"(353), val: 1)
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
pushpc 7, 4;
@spawn(type: BL_MOB, ID: 48145, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(190, 46), dir: 0, name: "ギガンテス#aa5")
@spawn(type: BL_MOB, ID: 48206, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(158, 52), dir: 0, name: "ギガンテス#aa6")
@spawn(type: BL_MOB, ID: 35448, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(157, 53), dir: 0, name: "双斧ギガンテス#bb6")
@spawn(type: BL_MOB, ID: 31153, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(156, 40), dir: 0, name: "双斧ギガンテス#bb6")
@spawn(type: BL_MOB, ID: 48538, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(151, 39), dir: 0, name: "ギガンテス#aa6")
@spawn(type: BL_MOB, ID: 33718, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(151, 44), dir: 0, name: "双斧ギガンテス#bb6")
@spawn(type: BL_MOB, ID: 32709, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(145, 47), dir: 0, name: "ギガンテス#aa6")
@spawn(type: BL_MOB, ID: 5932, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(144, 38), dir: 0, name: "ギガンテス#aa6")
@spawn(type: BL_MOB, ID: 47828, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(144, 43), dir: 0, name: "双斧ギガンテス#bb6")
pushpc 7, 5;
announce "サラ : 私の魔法で粉々にしてやるわっ!!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,97,38,4	script	宝箱#glast_sara5_	10005,{/* 69379 */}
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
hideonnpc "宝箱#glast_sara5_"; //69379
misceffect 10, "宝箱#glast_sara5_"; //69379
getitem 0, 0;
getitem 7229, 1;
getitem 730, 1;
getitem 719, 1;
getitem 0, 0;
delitem 929, 1;
getitem 7228, 1;
delitem 1034, 1;
getitem 6803, 1;
getitem 7229, 1;
getitem 723, 1;
announce "サラ : あははは！　私から逃げられると思っているの？", 0x1, 0x00ebff, 0x190, 20, 0, 0;
pushpc 4, 7;
pushpc 4, 7;
1@glast.gat,82,109,6	script	レッドギガンテス#glast_	10067,{/* 69372 */}
pushpc 4, 7;
hideonnpc "レッドギガンテス#glast_"; //69372
@spawn(type: BL_MOB, ID: 7142, speed: 350, option: 0, view: 3196, pos: "1@glast.gat"(82, 109), dir: 0, name: "レッドギガンテス#X7")
pushpc 4, 9;
pushpc 4, 10;
pushpc 3, 8;
pushpc 4, 9;
pushpc 5, 10;
@spawn(type: BL_MOB, ID: 29943, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(75, 157), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 40119, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(68, 159), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 41211, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(70, 155), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 18430, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(66, 161), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 36021, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(71, 163), dir: 0, name: "機動のギガンテス#bb1")
announce "‐3分経過‐", 0x1, 0xffff00, 0x190, 20, 0, 0;
pushpc 4, 9;
pushpc 5, 9;
@spawn(type: BL_MOB, ID: 20769, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(61, 158), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 30463, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(62, 163), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 42188, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(62, 164), dir: 0, name: "機動のギガンテス#bb1")
pushpc 5, 6;
@spawn(type: BL_MOB, ID: 37769, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(72, 188), dir: 0, name: "ギガンテス#aa1")
@spawn(type: BL_MOB, ID: 24037, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(72, 188), dir: 0, name: "双斧ギガンテス#bb1")
pushpc 3, 5;
@spawn(type: BL_MOB, ID: 23050, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(75, 197), dir: 0, name: "ギガンテス#aa1")
@spawn(type: BL_MOB, ID: 37929, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(73, 195), dir: 0, name: "ギガンテス#aa1")
@spawn(type: BL_MOB, ID: 37994, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(69, 194), dir: 0, name: "ギガンテス#aa1")
pushpc 4, 10;
@spawn(type: BL_MOB, ID: 38362, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(72, 206), dir: 0, name: "双斧ギガンテス#bb1")
@spawn(type: BL_MOB, ID: 1955, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(70, 203), dir: 0, name: "双斧ギガンテス#bb1")
@spawn(type: BL_MOB, ID: 26074, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(74, 203), dir: 0, name: "双斧ギガンテス#bb1")
pushpc 3, 10;
pushpc 3, 10;
pushpc 4, 10;
pushpc 3, 9;
pushpc 3, 9;
pushpc 5, 9;
1@glast.gat,67,264,4	script	レッドギガンテス#glast_	10067,{/* 71087 */}
1@glast.gat,67,264,4	script	宝箱#glast_sara8_	10005,{/* 69382 (hide)*/}
pushpc 5, 9;
hideonnpc "レッドギガンテス#glast_"; //71087
@spawn(type: BL_MOB, ID: 15978, speed: 350, option: 0, view: 3196, pos: "1@glast.gat"(67, 264), dir: 0, name: "レッドギガンテス#X1")
@nomalattack(src: "3196:レッドギガンテス#X1:1@glast.gat"(15978), dst: , damage: 0, sDelay: 800, dDelay: 412, tick: 785574826)
pushpc 3, 9;
1@glast.gat,62,279,4	script	宝箱#glast_sara7_	10005,{/* 69381 */}
pushpc 0, 0;
pushpc 5, 7;
hideonnpc "宝箱#glast_sara7_"; //69381
misceffect 10, "宝箱#glast_sara7_"; //69381
getitem 7229, 1;
announce "サラ : 逃げても無駄よ！　塵も残さず消し去ってあげる！", 0x1, 0x00ebff, 0x190, 20, 0, 0;
getitem 719, 1;
getitem 730, 1;
@nomalattack(src: "3196:レッドギガンテス#X1:1@glast.gat"(15978), dst: , damage: 0, sDelay: 800, dDelay: 412, aDelay: 8442)
pushpc 5, 7;
getitem 723, 1;
pushpc 1, 7;
pushpc 1, 8;
pushpc 7, 5;
pushpc 1, 9;
pushpc 1, 9;
pushpc 1, 10;
pushpc 1, 10;
pushpc 7, 10;
pushpc 7, 11;
@nomalattack(src: "3191:双斧ギガンテス#bb1:1@glast.gat"(1955), dst: , damage: 2255, sDelay: 750, dDelay: 412, tick: 785594983)
@nomalattack(src: "3191:双斧ギガンテス#bb1:1@glast.gat"(1955), dst: , damage: 2260, sDelay: 750, dDelay: 412, aDelay: 1113)
announce "サラ : 全て、全てを破壊してあげるわっ!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
pushpc 7, 7;
pushpc 7, 5;
pushpc 0, 9;
pushpc 1, 8;
pushpc 1, 9;
announce "サラ : 逃げても無駄よ！　塵も残さず消し去ってあげる！", 0x1, 0x00ebff, 0x190, 20, 0, 0;
pushpc 1, 8;
pushpc 1, 10;
pushpc 1, 4;
pushpc 7, 9;
pushpc 7, 8;
pushpc 0, 8;
pushpc 0, 9;
pushpc 0, 9;
pushpc 0, 9;
pushpc 0, 9;
pushpc 1, 9;
pushpc 2, 11;
pushpc 3, 9;
pushpc 3, 7;
pushpc 1, 7;
@spawn(type: BL_MOB, ID: 30957, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(177, 59), dir: 4, name: "ギガンテス#aa5")
@spawn(type: BL_MOB, ID: 13313, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(177, 65), dir: 1, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 47813, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(190, 55), dir: 6, name: "双斧ギガンテス#bb5")
@spawn(type: BL_MOB, ID: 47816, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(0, 0), dir: 0, name: "双斧ギガンテス#bb5")
@spawn(type: BL_MOB, ID: 49986, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(199, 55), dir: 0, name: "双斧ギガンテス#bb5")
@spawn(type: BL_MOB, ID: 48948, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(205, 47), dir: 0, name: "ギガンテス#aa5")
@spawn(type: BL_MOB, ID: 47704, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(208, 44), dir: 0, name: "双斧ギガンテス#bb5")
@spawn(type: BL_MOB, ID: 18333, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(208, 59), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 15462, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(210, 44), dir: 1, name: "機動のギガンテス#bb1")
@nomalattack(src: "3194:ギガンテス#aa5:1@glast.gat"(48948), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785619702)
announce "サラ : 私に楯突いた事を後悔しなさい！", 0x1, 0x00ebff, 0x190, 20, 0, 0;
@nomalattack(src: "3191:双斧ギガンテス#bb5:1@glast.gat"(47704), dst: , damage: 2608, sDelay: 750, dDelay: 412, tick: 785620017)
@nomalattack(src: "3195:機動のギガンテス#bb1:1@glast.gat"(15462), dst: , damage: 1724, sDelay: 500, dDelay: 412, tick: 785620143)
1@glast.gat,221,49,6	script	サラの幻影#ch1_	10066,{/* 71916 (hide)*/}
@spawn(type: BL_MOB, ID: 49627, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(222, 54), dir: 4, name: "ギガンテス#aa5")
@nomalattack(src: "3195:機動のギガンテス#bb1:1@glast.gat"(15462), dst: , damage: 1573, sDelay: 500, dDelay: 412, aDelay: 924)
1@glast.gat,230,51,3	script	ガーゴイルの石像#glast_	10070,{/* 71094 */}
1@glast.gat,230,44,1	script	ガーゴイルの石像#glast_	10070,{/* 71098 */}
1@glast.gat,235,51,3	script	ガーゴイルの石像#glast_	10070,{/* 71095 */}
1@glast.gat,235,44,1	script	ガーゴイルの石像#glast_	10070,{/* 71183 */}
1@glast.gat,238,43,0	script	#monster_gimmick_3_	139,{/* 71093 */}
1@glast.gat,240,51,3	script	ガーゴイルの石像#glast_	10070,{/* 71096 */}
1@glast.gat,240,44,1	script	ガーゴイルの石像#glast_	10070,{/* 71318 */}
1@glast.gat,245,51,3	script	ガーゴイルの石像#glast_	10070,{/* 71097 */}
1@glast.gat,245,44,1	script	ガーゴイルの石像#glast_	10070,{/* 71319 */}
pushpc 1, 5;
hideonnpc "#monster_gimmick_3_"; //71093
hideonnpc "ガーゴイルの石像#glast_"; //71094
hideonnpc "ガーゴイルの石像#glast_"; //71095
hideonnpc "ガーゴイルの石像#glast_"; //71096
hideonnpc "ガーゴイルの石像#glast_"; //71097
hideonnpc "ガーゴイルの石像#glast_"; //71098
hideonnpc "ガーゴイルの石像#glast_"; //71183
hideonnpc "ガーゴイルの石像#glast_"; //71318
hideonnpc "ガーゴイルの石像#glast_"; //71319
@spawn(type: BL_MOB, ID: 11235, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(227, 48), dir: 0, name: "機動のギガンテス#gc1")
@spawn(type: BL_MOB, ID: 46762, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(250, 48), dir: 0, name: "機動のギガンテス#gc2")
@spawn(type: BL_MOB, ID: 8503, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(230, 51), dir: 0, name: "サラの使い魔#gc3")
@spawn(type: BL_MOB, ID: 3021, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(235, 51), dir: 0, name: "サラの使い魔#gc4")
@spawn(type: BL_MOB, ID: 4279, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(240, 51), dir: 0, name: "サラの使い魔#gc5")
@spawn(type: BL_MOB, ID: 4516, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(245, 51), dir: 0, name: "サラの使い魔#gc6")
@spawn(type: BL_MOB, ID: 5310, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(230, 44), dir: 0, name: "サラの使い魔#gc7")
@spawn(type: BL_MOB, ID: 7227, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(235, 44), dir: 0, name: "サラの使い魔#gc8")
@spawn(type: BL_MOB, ID: 7647, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(240, 44), dir: 0, name: "サラの使い魔#gc9")
@spawn(type: BL_MOB, ID: 19285, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(245, 44), dir: 0, name: "サラの使い魔#gc10")
@nomalattack(src: "3197:サラの使い魔#gc7:1@glast.gat"(5310), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625874)
@nomalattack(src: "3197:サラの使い魔#gc8:1@glast.gat"(7227), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625875)
@nomalattack(src: "3197:サラの使い魔#gc9:1@glast.gat"(7647), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625875)
@nomalattack(src: "3197:サラの使い魔#gc10:1@glast.gat"(19285), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625875)
@nomalattack(src: "3197:サラの使い魔#gc7:1@glast.gat"(5310), dst: , damage: 93, sDelay: 720, dDelay: 412, aDelay: 797)
@nomalattack(src: "3197:サラの使い魔#gc8:1@glast.gat"(7227), dst: , damage: 0, sDelay: 720, dDelay: 412, aDelay: 796)
@nomalattack(src: "3197:サラの使い魔#gc9:1@glast.gat"(7647), dst: , damage: 0, sDelay: 720, dDelay: 412, aDelay: 796)
@nomalattack(src: "3197:サラの使い魔#gc10:1@glast.gat"(19285), dst: , damage: 0, sDelay: 720, dDelay: 412, aDelay: 796)
pushpc 3, 10;
announce "‐4分経過‐", 0x1, 0xffff00, 0x190, 20, 0, 0;
pushpc 3, 8;
1@glast.gat,259,54,5	script	サラの幻影#chase_3_	3190,{/* 69530 (hide)*/}
pushpc 3, 6;
pushpc 3, 9;
misceffect 34, "サラの幻影#chase_3_"; //69530
pushpc 3, 8;
pushpc 1, 7;
pushpc 2, 8;
pushpc 3, 7;
pushpc 3, 13;
pushpc 5, 9;
@spawn(type: BL_MOB, ID: 44104, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(299, 79), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 42949, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(305, 81), dir: 0, name: "機動のギガンテス#aa1")
pushpc 3, 8;
1@glast.gat,299,85,6	script	レッドギガンテス#glast_	10067,{/* 71090 (hide)*/}
@spawn(type: BL_MOB, ID: 44310, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(305, 91), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 44515, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(300, 86), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 44651, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(292, 85), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 45186, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(304, 85), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 45242, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(306, 89), dir: 0, name: "機動のギガンテス#bb1")
pushpc 3, 10;
@spawn(type: BL_MOB, ID: 42565, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(303, 93), dir: 0, name: "機動のギガンテス#aa1")
@nomalattack(src: "3195:機動のギガンテス#bb1:1@glast.gat"(45242), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785633313)
pushpc 5, 9;
pushpc 5, 9;
pushpc 3, 9;
pushpc 3, 7;
pushpc 3, 8;
pushpc 3, 10;
pushpc 5, 4;
pushpc 5, 9;
@changeoption(id: 9404, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 9418, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 9564, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 9572, opt1: 0, opt2: 0, option: 4, karma: 0)
announce "サラ : 逃げても無駄よ！　塵も残さず消し去ってあげる！", 0x1, 0x00ebff, 0x190, 20, 0, 0;
pushpc 5, 10;
1@glast.gat,306,179,5	script	サラの幻影#chase_4_	3190,{/* 69531 */}
@spawn(type: BL_MOB, ID: 9404, speed: 2000, option: 4, view: 3199, pos: "1@glast.gat"(306, 179), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 9418, speed: 2000, option: 4, view: 3199, pos: "1@glast.gat"(306, 179), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 9564, speed: 2000, option: 4, view: 3199, pos: "1@glast.gat"(306, 179), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 9572, speed: 2000, option: 4, view: 3200, pos: "1@glast.gat"(306, 179), dir: 0, name: "#earth")
pushpc 5, 10;
1@glast.gat,302,197,4	script	レッドギガンテス#glast_	10067,{/* 71089 */}
1@glast.gat,302,194,4	script	宝箱#glast_sara9_	10005,{/* 69383 (hide)*/}
@nomalattack(src: "3199:#meteo:1@glast.gat"(9404), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785640874)
@nomalattack(src: "3199:#meteo:1@glast.gat"(9418), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785640874)
@nomalattack(src: "3199:#meteo:1@glast.gat"(9564), dst: , damage: 85, sDelay: 1000, dDelay: 412, tick: 785640874)
@nomalattack(src: "3200:#earth:1@glast.gat"(9572), dst: , damage: 94, sDelay: 1000, dDelay: 412, tick: 785640874)
pushpc 4, 11;
1@glast.gat,298,204,0	script	#monster_gimmick_4_	139,{/* 71355 */}
hideonnpc "レッドギガンテス#glast_"; //71089
@spawn(type: BL_MOB, ID: 12117, speed: 350, option: 0, view: 3196, pos: "1@glast.gat"(302, 197), dir: 0, name: "レッドギガンテス#X3")
pushpc 5, 10;
1@glast.gat,298,210,5	script	サラの幻影#chase_6_	3190,{/* 69533 (hide)*/}
pushpc 5, 9;
pushpc 3, 10;
pushpc 3, 10;
@changeoption(id: 6346, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 6538, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 6957, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 7072, opt1: 0, opt2: 0, option: 4, karma: 0)
pushpc 3, 9;
1@glast.gat,321,250,5	script	サラの幻影#chase_7_	3190,{/* 69534 (hide)*/}
pushpc 3, 9;
1@glast.gat,335,262,5	script	サラの幻影#chase_8_	3190,{/* 70903 */}
@spawn(type: BL_MOB, ID: 49886, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(332, 255), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 3950, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(334, 261), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 1430, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(331, 255), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 12125, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(335, 262), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 12274, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(335, 262), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 12399, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(335, 262), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 12714, speed: 2000, option: 0, view: 3200, pos: "1@glast.gat"(335, 262), dir: 0, name: "#earth")
@changeoption(id: 12125, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(12125), dst: 12125, skill: "インビジブル"(353), val: 1)
@changeoption(id: 12274, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(12274), dst: 12274, skill: "インビジブル"(353), val: 1)
@changeoption(id: 12399, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(12399), dst: 12399, skill: "インビジブル"(353), val: 1)
@changeoption(id: 12714, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3200:#earth:1@glast.gat"(12714), dst: 12714, skill: "インビジブル"(353), val: 1)
pushpc 3, 9;
@spawn(type: BL_MOB, ID: 3701, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(340, 267), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 15352, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(342, 266), dir: 0, name: "機動のギガンテス#bb1")
@spawn(type: BL_MOB, ID: 24420, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(337, 262), dir: 0, name: "機動のギガンテス#bb1")
@nomalattack(src: "3195:機動のギガンテス#aa1:1@glast.gat"(49886), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785645032)
@nomalattack(src: "3199:#meteo:1@glast.gat"(12125), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785645179)
@nomalattack(src: "3199:#meteo:1@glast.gat"(12274), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785645179)
@nomalattack(src: "3199:#meteo:1@glast.gat"(12399), dst: , damage: 0, sDelay: 1000, dDelay: 412, tick: 785645179)
@nomalattack(src: "3200:#earth:1@glast.gat"(12714), dst: , damage: 85, sDelay: 1000, dDelay: 412, tick: 785645179)
pushpc 3, 8;
1@glast.gat,347,265,0	script	#compass_1_	139,{/* 69521 (hide)*/}
1@glast.gat,351,258,5	script	サラの幻影#chase_9_	3190,{/* 70999 (hide)*/}
@spawn(type: BL_MOB, ID: 49240, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(334, 271), dir: 0, name: "機動のギガンテス#aa1")
@spawn(type: BL_MOB, ID: 10929, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(340, 270), dir: 0, name: "機動のギガンテス#aa1")
hideonnpc "サラの幻影#chase_8_"; //70903
misceffect 34, "サラの幻影#chase_9_"; //70999
pushpc 3, 8;
hideoffnpc "サラの幻影#chase_9_"; //70999
misceffect 135, "サラの幻影#chase_9_"; //70999
@spawn(type: BL_MOB, ID: 40226, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(351, 258), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 40472, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(351, 258), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 40515, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(351, 258), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 41840, speed: 2000, option: 0, view: 3200, pos: "1@glast.gat"(351, 258), dir: 0, name: "#earth")
@nomalattack(src: "3199:#meteo:1@glast.gat"(40226), dst: , damage: 94, sDelay: 1000, dDelay: 412, tick: 785646271)
@nomalattack(src: "3199:#meteo:1@glast.gat"(40472), dst: , damage: 103, sDelay: 1000, dDelay: 412, tick: 785646271)
@nomalattack(src: "3199:#meteo:1@glast.gat"(40515), dst: , damage: 112, sDelay: 1000, dDelay: 412, tick: 785646271)
@nomalattack(src: "3200:#earth:1@glast.gat"(41840), dst: , damage: 0, sDelay: 1000, dDelay: 412, tick: 785646271)
pushpc 3, 8;
@changeoption(id: 40226, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(40226), dst: 40226, skill: "インビジブル"(353), val: 1)
@changeoption(id: 40472, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(40472), dst: 40472, skill: "インビジブル"(353), val: 1)
@changeoption(id: 40515, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(40515), dst: 40515, skill: "インビジブル"(353), val: 1)
@changeoption(id: 41840, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3200:#earth:1@glast.gat"(41840), dst: 41840, skill: "インビジブル"(353), val: 1)
pushpc 2, 7;
pushpc 5, 9;
mes "‐この先に移動すると";
mes "　^ff0000パーティーメンバー全員^000000が";
mes "　^ff0000転送^000000されます。";
mes "　移動してもよろしいですか？";
select("いいえ:はい")
hideonnpc "サラの幻影#chase_9_"; //70999
@nomalattack(src: "3195:機動のギガンテス#aa1:1@glast.gat"(3701), dst: , damage: 1374, sDelay: 500, dDelay: 412, tick: 785651290)
@nomalattack(src: "3195:機動のギガンテス#bb1:1@glast.gat"(15352), dst: , damage: 1287, sDelay: 500, dDelay: 412, tick: 785651290)
@nomalattack(src: "3195:機動のギガンテス#aa1:1@glast.gat"(10929), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785651353)
@nomalattack(src: "3195:機動のギガンテス#aa1:1@glast.gat"(3701), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:機動のギガンテス#bb1:1@glast.gat"(15352), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:機動のギガンテス#aa1:1@glast.gat"(10929), dst: , damage: 1563, sDelay: 500, dDelay: 412, aDelay: 903)
announce "‐サラの魔力の影響が無くなった為、「レッドギガンテス」と「秘宝」が消滅しました‐", 0x1, 0xffff00, 0x190, 20, 0, 0;
hideonnpc "#glast_move_04_"; //71052
1@glast.gat,351,269,0	warp	#glast_move_04_	2,2,1@glast.gat,350,282 //71052 from_pos=(351, 269)
misceffect 718, "サラの幻影#glast_50_"; //71330
hideoffnpc "サラの幻影#glast_50_"; //71330
misceffect 1065, "サラの幻影#glast_50_"; //71330
misceffect 718, "サラの幻影#glast_50_"; //71330
hideonnpc "サラの幻影#glast_50_"; //71330
cutin "fenrir_a.bmp", 2;
mes "[フェンリル]";
mes "ご無事で何よりです。";
mes "私の力が足りなかったばかりに";
mes "ご迷惑をおかけしました。";
next;
hideoffnpc "#glast_move_01_jp_"; //71352
misceffect 6, "#glast_move_01_jp_"; //71352
misceffect 317, "#glast_move_01_jp_"; //71352
mes "[フェンリル]";
mes "それにしても";
mes "随分早かったですね。";
next;
mes "[フェンリル]";
mes "……さて。私はそろそろ行きます。";
mes "手伝っていただいて";
mes "ありがとうございました。";
next;
mes "[フェンリル]";
mes "どうやら、先ほどサラの召喚した";
mes "幻影や使い魔が";
mes "まだ残っているようですが、";
mes "このまま放っておいても";
mes "他の冒険者に大きな被害が";
mes "出る事はないと思います。";
next;
mes "[フェンリル]";
mes "幸いサラ本人は居ませんから、";
mes "幻影程度ならどうにかなるでしょう。";
mes "もし、あなた方が奴らを";
mes "倒してくださると言うのであれば";
mes "ぜひお願いします。";
next;
mes "[フェンリル]";
mes "私は先を急ぎますので、";
mes "手伝うことはできませんが、";
mes "大きな力が残る場所へ移動できるよう";
mes "道を開いておきました。";
mes "もしその力と戦うのであれば、";
mes "南のワープより移動してください。";
next;
mes "[フェンリル]";
mes "もちろん、無理強いは出来ませんので";
mes "このままお帰りになっても";
mes "構いませんよ。";
mes "その場合はどうかお気をつけて";
mes "お帰り下さい。";
next;
mes "[フェンリル]";
mes "これはお手伝いをして頂いた";
mes "お礼です。";
mes "どうか、お受け取りください。";
next;
mes "^ff0000‐各種ピアスのエンチャントを";
mes "　無料で初期化できる権利を";
mes "　獲得しました‐^000000";
next;
mes "[フェンリル]";
mes "また、どこかでお会いできると";
mes "良いですね。";
next;
mes "[フェンリル]";
mes "おや？";
mes "どうやら荷物の種類が多いようです。";
mes "荷物の種類を減らしてから";
mes "また声をかけてください。";
close;
cutin "fenrir_a.bmp", 255;
delitem 932, 1;
cutin "fenrir_a.bmp", 2;
mes "[フェンリル]";
mes "ご無事で何よりです。";
mes "私の力が足りなかったばかりに";
mes "ご迷惑をおかけしました。";
next;
mes "[フェンリル]";
mes "それにしても";
mes "随分早かったですね。";
next;
mes "[フェンリル]";
mes "……さて。私はそろそろ行きます。";
mes "手伝っていただいて";
mes "ありがとうございました。";
next;
mes "[フェンリル]";
mes "どうやら、先ほどサラの召喚した";
mes "幻影や使い魔が";
mes "まだ残っているようですが、";
mes "このまま放っておいても";
mes "他の冒険者に大きな被害が";
mes "出る事はないと思います。";
next;
mes "[フェンリル]";
mes "幸いサラ本人は居ませんから、";
mes "幻影程度ならどうにかなるでしょう。";
mes "もし、あなた方が奴らを";
mes "倒してくださると言うのであれば";
mes "ぜひお願いします。";
next;
mes "[フェンリル]";
mes "私は先を急ぎますので、";
mes "手伝うことはできませんが、";
mes "大きな力が残る場所へ移動できるよう";
mes "道を開いておきました。";
mes "もしその力と戦うのであれば、";
mes "南のワープより移動してください。";
next;
mes "[フェンリル]";
mes "もちろん、無理強いは出来ませんので";
mes "このままお帰りになっても";
mes "構いませんよ。";
mes "その場合はどうかお気をつけて";
mes "お帰り下さい。";
next;
mes "[フェンリル]";
mes "これはお手伝いをして頂いた";
mes "お礼です。";
mes "どうか、お受け取りください。";
next;
mes "^ff0000‐各種ピアスのエンチャントを";
mes "　無料で初期化できる権利を";
mes "　獲得しました‐^000000";
next;
mes "[フェンリル]";
mes "また、どこかでお会いできると";
mes "良いですね。";
setquest 9337; //state=1
delquest 9337;
setquest 120150; //state=1
delquest 120150;
setquest 120155; //state=1
delquest 120155;
getexp 2998015,0; //3000000
getexp 0,1498210; //1500000
getitem 6803, 1;
setquest 120170; //state=1
delquest 120170;
close;
cutin "fenrir_a.bmp", 255;
mes "[フェンリル]";
mes "また、どこかでお会いできると";
mes "良いですね。";
close;
cutin "fenrir_a.bmp", 255;
getitem 932, 1;
mes "‐ここからサラの幻影がいる場所へ";
mes "　行くことが出来るようだ‐";
next;
select("この場に留まる:先へ進む")
mes "‐先へ進むことにした‐";
close;
@mapmoved(from: 1@glast.gat(352, 279), map: 1@glast.gat(199, 333))
@spawn(type: BL_MOB, ID: 12309, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(185, 333), dir: 0, name: "双斧ギガンテス")
@spawn(type: BL_MOB, ID: 20133, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(185, 331), dir: 0, name: "機動のギガンテス")
@spawn(type: BL_MOB, ID: 25266, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(185, 329), dir: 0, name: "ギガンテス")
@spawn(type: BL_MOB, ID: 35027, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(185, 327), dir: 0, name: "ギガンテス")
@spawn(type: BL_MOB, ID: 16986, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(213, 333), dir: 0, name: "双斧ギガンテス")
@spawn(type: BL_MOB, ID: 746, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(213, 331), dir: 0, name: "機動のギガンテス")
@spawn(type: BL_MOB, ID: 5468, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(213, 329), dir: 0, name: "双斧ギガンテス")
@spawn(type: BL_MOB, ID: 11832, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(213, 327), dir: 0, name: "双斧ギガンテス")
@spawn(type: BL_MOB, ID: 3923, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(183, 333), dir: 0, name: "ギガンテス")
@spawn(type: BL_MOB, ID: 10794, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(183, 331), dir: 0, name: "ギガンテス")
@spawn(type: BL_MOB, ID: 49714, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(183, 329), dir: 0, name: "機動のギガンテス")
@spawn(type: BL_MOB, ID: 12498, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(183, 327), dir: 0, name: "双斧ギガンテス")
@mob_defeated("3195:機動のギガンテス:1@glast.gat"(20133))
getexp -2899826,0; //100174
getexp 0,-1449826; //50174
@spawn(type: BL_MOB, ID: 35204, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "機動のギガンテス")
@spawn(type: BL_MOB, ID: 48364, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(0, 0), dir: 0, name: "双斧ギガンテス")
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(49714), dst: , damage: 1608, sDelay: 500, dDelay: 412, tick: 785745837)
@mob_defeated("3194:ギガンテス:1@glast.gat"(25266))
getexp 1826,0; //102000
getexp 0,826; //51000
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(49714), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(49714), dst: , damage: 1297, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(49714), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@mob_defeated("3195:機動のギガンテス:1@glast.gat"(49714))
getexp -1826,0; //100174
getexp 0,-826; //50174
@mob_defeated("3194:ギガンテス:1@glast.gat"(35027))
getexp 1826,0; //102000
getexp 0,826; //51000
@nomalattack(src: "3191:双斧ギガンテス:1@glast.gat"(48364), dst: , damage: 2549, sDelay: 750, dDelay: 412, tick: 785754972)
@nomalattack(src: "3194:ギガンテス:1@glast.gat"(3923), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785755518)
@nomalattack(src: "3191:双斧ギガンテス:1@glast.gat"(48364), dst: , damage: 0, sDelay: 750, dDelay: 412, aDelay: 1113)
@nomalattack(src: "3194:ギガンテス:1@glast.gat"(3923), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3194:ギガンテス:1@glast.gat"(10794), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785756610)
@mob_defeated("3194:ギガンテス:1@glast.gat"(3923))
getexp 0,0; //102000
getexp 0,0; //51000
@nomalattack(src: "3191:双斧ギガンテス:1@glast.gat"(48364), dst: , damage: 0, sDelay: 750, dDelay: 412, aDelay: 1974)
@spawn(type: BL_MOB, ID: 47360, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "機動のギガンテス")
@spawn(type: BL_MOB, ID: 38796, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "機動のギガンテス")
@mob_defeated("3194:ギガンテス:1@glast.gat"(10794))
getexp 0,0; //102000
getexp 0,0; //51000
@mob_defeated("3191:双斧ギガンテス:1@glast.gat"(48364))
getexp 11200,0; //113200
getexp 0,11000; //62000
@mob_defeated("3191:双斧ギガンテス:1@glast.gat"(12309))
getexp 0,0; //113200
getexp 0,0; //62000
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(35204), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785767003)
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(47360), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785767003)
getitem 7229, 1;
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(35204), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1617)
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(47360), dst: , damage: 1762, sDelay: 500, dDelay: 412, aDelay: 1617)
@mob_defeated("3195:機動のギガンテス:1@glast.gat"(35204))
getexp -13026,0; //100174
getexp 0,-11826; //50174
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(47360), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1722)
@mob_defeated("3191:双斧ギガンテス:1@glast.gat"(12498))
getexp 13026,0; //113200
getexp 0,11826; //62000
@mob_defeated("3195:機動のギガンテス:1@glast.gat"(47360))
getexp -13026,0; //100174
getexp 0,-11826; //50174
@mob_defeated("3191:双斧ギガンテス:1@glast.gat"(16986))
getexp 13026,0; //113200
getexp 0,11826; //62000
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(38796), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785776243)
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(38796), dst: , damage: 1775, sDelay: 500, dDelay: 412, aDelay: 903)
@mob_defeated("3195:機動のギガンテス:1@glast.gat"(38796))
getexp -13026,0; //100174
getexp 0,-11826; //50174
@mob_defeated("3191:双斧ギガンテス:1@glast.gat"(11832))
getexp 13026,0; //113200
getexp 0,11826; //62000
@mob_defeated("3191:双斧ギガンテス:1@glast.gat"(5468))
getexp 0,0; //113200
getexp 0,0; //62000
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(746), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785794036)
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(746), dst: , damage: 1771, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:機動のギガンテス:1@glast.gat"(746), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@mob_defeated("3195:機動のギガンテス:1@glast.gat"(746))
getexp -13026,0; //100174
getexp 0,-11826; //50174
1@glast.gat,215,325,0	script	#バリケード7_12	1905,{/* 71551 */}
1@glast.gat,219,328,0	script	#バリケード11_1	1905,{/* 71691 */}
1@glast.gat,219,330,0	script	#バリケード11_3	1905,{/* 71692 */}
1@glast.gat,219,332,0	script	#バリケード11_5	1905,{/* 71872 */}
getitem 7229, 1;
@nomalattack(src: ""(), dst: , damage: 0, sDelay: 0, dDelay: 0, tick: 785864470)
@nomalattack(src: ""(), dst: , damage: 0, sDelay: 0, dDelay: 0, aDelay: 483)
mes "‐サラの幻影がいる。";
mes "　戦おうか？‐";
next;
select("戦う:やめておく")
mes "‐サラの幻影と戦おうと身構えると";
mes "　幻影もこちらに気付いたようだ‐";
close;
mes "‐サラの幻影がいる。";
mes "　戦おうか？‐";
next;
hideonnpc "サラの幻影#ex_battle_0q"; //71353
@spawn(type: BL_MOB, ID: 19622, speed: 125, option: 0, view: 3190, pos: "1@glast.gat"(200, 346), dir: 0, name: "サラの幻影#1")
select("戦う:やめておく")
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 1875, sDelay: 500, dDelay: 412, tick: 785872375)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
close;
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2430, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , skill: "突き刺し攻撃"(158), skill_lv: -1, damage: 3470, sDelay: 500, dDelay: 412, tick: 785873888)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "範囲石化攻撃"(666), skill_lv: 5, damage: -30000, sDelay: 500, dDelay: 0, tick: 785874392)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2289, sDelay: 500, dDelay: 412, aDelay: 1513)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 1930, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , skill: "聖属性攻撃"(189), skill_lv: -1, damage: 5352, sDelay: 500, dDelay: 412, tick: 785876912)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "グランドクロス"(254), val: 65535, tick: 785877416)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "グランドクロス"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785877437)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "グランドクロス"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785877752)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "グランドクロス"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785878067)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 2016)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 515, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 498, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "ファイアーウォール"(18), val: 65535, tick: 785880440)
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
misceffect 207,""; //self
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
pushpc 0, 0;
misceffect 207,""; //self
pushpc 0, 0;
pushpc 0, 0;
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1008)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 454, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 361, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 468, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "範囲睡眠攻撃"(668), skill_lv: 5, damage: -30000, sDelay: 500, dDelay: 0, tick: 785883464)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 397, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2539, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 1808, sDelay: 500, dDelay: 412, aDelay: 504)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "メテオストーム"(83), val: 65535, tick: 785885459)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 434, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 444, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 441, sDelay: 500, dDelay: 412, aDelay: 505)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 455, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 525, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 384, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 378, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 446, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 357, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 512, sDelay: 500, dDelay: 412, aDelay: 504)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "メテオストーム"(83), val: 65535, tick: 785890458)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 477, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 525, sDelay: 500, dDelay: 412, aDelay: 503)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 424, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 502, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 486, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 508, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 492, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 366, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 518, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 499, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 425, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 394, sDelay: 500, dDelay: 412, aDelay: 506)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 381, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 371, sDelay: 500, dDelay: 412, aDelay: 505)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 510)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 439, sDelay: 500, dDelay: 412, aDelay: 511)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 425, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 469, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 395, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 505, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 435, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 383, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 471, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 370, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2445, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2090, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2122, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2515, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2620, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , skill: "突き刺し攻撃"(158), skill_lv: -1, damage: 3301, sDelay: 500, dDelay: 412, tick: 785905657)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "範囲石化攻撃"(666), skill_lv: 5, damage: -30000, sDelay: 500, dDelay: 0, tick: 785906160)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1512)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2744, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2271, sDelay: 500, dDelay: 412, aDelay: 1008)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2023, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 1829, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2439, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 2363, sDelay: 500, dDelay: 412, aDelay: 504)
@skillcasting(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "ラッシュアタック"(349), pl: 0, tick: 500)
@skillnodamage(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "ラッシュアタック"(349), val: 5)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 6975, sDelay: 500, dDelay: 412, aDelay: 1512)
misceffect 207,""; //self
@nomalattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: , damage: 7984, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "ロードオブヴァーミリオン"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "ロードオブヴァーミリオン"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "ロードオブヴァーミリオン"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "ロードオブヴァーミリオン"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785915023)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "グランドクロス"(254), val: 65535, tick: 785917752)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "グランドクロス"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785917773)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "グランドクロス"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785918088)
@skillattack(src: "3190:サラの幻影#1:1@glast.gat"(19622), dst: 19622, skill: "グランドクロス"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785918403)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785919054)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785919054)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785919054)
@skillposeffect(src: "3190:サラの幻影#1:1@glast.gat"(19622), skill: "サンダーストーム"(21), val: 65535, tick: 785919054)
