@spawn(type: BL_MOB, ID: 36433, speed: 150, option: 0, view: 3010, pos: "dali.gat"(138, 132), dir: 0, name: "生者のオークベイビー")
@spawn(type: BL_MOB, ID: 11528, speed: 150, option: 0, view: 3011, pos: "dali.gat"(145, 107), dir: 0, name: "生者の子デザートウルフ")
@spawn(type: BL_MOB, ID: 32898, speed: 120, option: 0, view: 3012, pos: "dali.gat"(138, 132), dir: 0, name: "生者のマリンスフィアー")
@spawn(type: BL_MOB, ID: 26291, speed: 150, option: 0, view: 3013, pos: "dali.gat"(103, 124), dir: 0, name: "生者のオークウォリアー")
@spawn(type: BL_MOB, ID: 39730, speed: 150, option: 0, view: 3014, pos: "dali.gat"(144, 130), dir: 0, name: "生者のデザートウルフ")
@spawn(type: BL_MOB, ID: 26817, speed: 150, option: 0, view: 3015, pos: "dali.gat"(143, 130), dir: 0, name: "生者のフェン")

moro_cav.gat,45,60,5	script	調査隊員 #sara	419,{
	if(!(checkquest(15006) & 0x8)) {	// 初回会話
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
	mes "[調査隊員]";
	mes "黄色い種の内部は非常に危険です。";
	mes "必ずパーティーを組んでから";
	mes "調査を行ってください。";
	mes "よろしくお願いします！";
	close;
}
moro_cav.gat,50,63,5	script	黄色い種#bios	844,{
	if(!(checkquest(15006) & 0x8)) {	// 初回会話
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
	if(checkquest(15005)&0x2 == 0 || checkquest(118927)&0x2 == 0) {
		mes "‐この先は入場してから1回目の";
		mes "　^ff0000午前5時以降^000000に進行可能です。";
		mes "　但し、最後の入場をしてから";
		mes "　^ff00001時間^000000経過するまでは";
		mes "　進行できませんのでご注意ください‐";
		close;
	}
	if(checkquest(15005) & 0x2) {
		delquest 15005;
		delquest 15007;
		setquest 15008;	// state=1
		delquest 15008;
	}
	if(checkquest(118927) & 0x2)
		delquest 118927;
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
			announce "メモリアルダンジョン[bios_island] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x1, 0x00ff99;
			setquest 96430; //state=1
			setquest 15005; //state=1
			setquest 15007; //state=1
			//if(!(checkquest(116535) & 0x8)) { // 2週目??
			//	setquest 116535; //state=1
			//	compquest 116535;
			//}
			setquest 118927; //state=1
			donpcevent getmdnpcname("#bios1_mobdead")+ "::OnStart";
			close2;
			//warp "1@dth1.gat",17,93;
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
	waitingroom "ビオスの島",0; //65380
	end;
}


1@dth1.gat,84,90,0	script	#BARRICADE1_1	1905,{}
1@dth1.gat,84,91,0	script	#BARRICADE1_2	1905,{}
1@dth1.gat,84,92,0	script	#BARRICADE1_3	1905,{}
1@dth1.gat,84,93,0	script	#BARRICADE1_4	1905,{}
1@dth1.gat,84,94,0	script	#BARRICADE1_5	1905,{}
1@dth1.gat,84,95,0	script	#BARRICADE1_6	1905,{}
1@dth1.gat,84,96,0	script	#BARRICADE1_7	1905,{}
1@dth1.gat,84,97,0	script	#BARRICADE1_8	1905,{}

1@dth1.gat,1,1,0	script	#bios1_mobdead	139,{
OnStart:
	hideonnpc getmdnpcname("死神アンク#bios1");
	hideonnpc getmdnpcname("#会話用ダミー1");
	hideonnpc getmdnpcname("司令官アジフ#bios1");
	hideonnpc getmdnpcname("教官長イグリド#bios1");
	hideonnpc getmdnpcname("キド#bios1");
	hideonnpc getmdnpcname("リーン#bios1");
	hideonnpc getmdnpcname("リョースン#bios1");
	hideonnpc getmdnpcname("ヒュー#bios1");
	hideonnpc getmdnpcname("ヘンジヌ#bios1");
	hideonnpc getmdnpcname("ヒシエ#bios1");
	hideonnpc getmdnpcname("エイヴァント#bios1");
	hideonnpc getmdnpcname("大臣ヘスランタ#bios1");
	hideonnpc getmdnpcname("先発隊長アバランチェ#b1");

	hideonnpc getmdnpcname("#会話用ダミー2");

	hideonnpc getmdnpcname("warp1#bios2");
	hideonnpc getmdnpcname("死神アンク#bios3");

	hideonnpc getmdnpcname("司令官アジフ#bios3");
	hideonnpc getmdnpcname("教官長イグリド#bios3");
	hideonnpc getmdnpcname("キド#bios3");
	hideonnpc getmdnpcname("リーン#bios3");
	hideonnpc getmdnpcname("リョースン#bios3");
	hideonnpc getmdnpcname("ヒュー#bios3");
	hideonnpc getmdnpcname("ヘンジヌ#bios3");
	hideonnpc getmdnpcname("ヒシエ#bios3");
	hideonnpc getmdnpcname("エイヴァント#bios3");
	hideonnpc getmdnpcname("大臣ヘスランタ#bios3");
	hideonnpc getmdnpcname("先発隊長アバランチェ#b3");

	for(set '@i,1; '@i<=3; set '@i,'@i+1) {
		for(set '@j,1; '@j<=8; set '@j,'@j+1)
			hideonnpc getmdnpcname("死者のオークゾンビ#"+ '@i + '@j +"bi");
	}

	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,1;
	areasetcell getmdmapname("1@dth2.gat"),150,126,151,133,1;

	set '@map$,getmdmapname("1@dth1.gat");
	set '@label$,getmdnpcname("#bios1_mobdead")+ "::OnKilled";
	monster '@map$,90,94,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,90,94,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,101,125,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,101,125,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,108,156,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,108,156,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,119,59,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,119,144,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,121,69,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,124,164,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,131,101,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,131,101,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,135,50,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,135,152,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,138,132,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,138,132,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,141,143,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,143,49,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,144,164,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,145,107,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,145,107,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,153,76,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,153,76,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,156,46,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,165,84,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,165,130,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,170,67,"生者のマリンスフィアー",3012,2,'@label$;
	monster '@map$,184,130,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,192,145,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,194,116,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,203,131,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,203,151,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,203,162,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,203,162,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,204,112,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,205,98,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,206,169,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,210,62,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,211,88,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,212,75,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,213,151,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,214,53,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,215,109,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,217,129,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,221,166,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,223,72,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,224,62,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,225,103,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,225,54,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,225,89,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,225,152,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,227,150,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,227,150,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,227,150,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,228,124,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,232,87,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,232,69,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,233,57,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,237,80,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,240,140,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,243,106,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,244,119,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,246,71,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,246,126,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,248,81,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,249,144,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,249,155,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,252,105,"生者のオークベイビー",3010,1,'@label$;
	monster '@map$,274,104,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,297,103,"生者のマリンスフィアー",3012,1,'@label$;
	monster '@map$,306,103,"生者の子デザートウルフ",3011,1,'@label$;
	monster '@map$,316,103,"生者のオークベイビー",3010,1,'@label$;
	end;
OnKilled:
	end;
}
1@dth1.gat,71,97,3	script	ジェイス#bios1	467,{
	mes "[ジェイス]";
	mes "……ジェイスだ。";
	next;
	mes "[ジェイス]";
	mes "……。";
	close;
OnTalk3:
	unittalk "ジェイス : ……どうしてこんなところに？";
	end;
OnTalk4:
	unittalk "ジェイス : ……!!!　誰だ!?";
	end;
OnTalk5:
	unittalk "ジェイス : ……先行する。あとからついて来てくれ。";
	end;
}
1@dth1.gat,74,94,3	script	死神アンク#bios1	3029,{/* 69840 (hide)*/
	end;
OnTalk1:
	unittalk "？？？？ : クックック。";
	end;
OnTalk2:
	unittalk "？？？？ : ようこそビオスの島へ。";
	end;
OnTalk3:
	unittalk "死神アンク : 私は死神アンク。ここは私が作り出した死と生の空間です。";
	end;
OnTalk4:
	unittalk "死神アンク : これはこれは、みなさん威勢がいいようですね。";
	end;
OnTalk5:
	unittalk "死神アンク : これからモロク様に捧げる生贄を調達しようとしていたのですが……。";
	end;
OnTalk6:
	unittalk "死神アンク : まさか生贄が自らやって来るとは……ククク。";
	end;
OnTalk7:
	unittalk "死神アンク : モロク様の力になれる事を光栄に思いなさい。";
	end;
OnTalk8:
	unittalk "死神アンク : クク、威勢が良くて結構です。ただ、急ぐ必要はありません。";
	end;
OnTalk9:
	unittalk "死神アンク : まずは私の世界でゆっくり……くつろぐことです。ククククク。";
	end;
}
1@dth1.gat,67,97,5	script	ブリド#bios1	468,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0) || BIOS_1QUE) {
		mes "[ブリド]";
		mes "私はブリド。";
		mes "魔王モロクの復活を";
		mes "阻止しに来たんだ。";
		close;
	}
	if(select("先を急ぐ","会話をする") == 1) {
		mes "‐誰が来ている？‐";
		next;
		set '@menu,select(
			(? "アジフとイグリドだ": "？？？"),
			(? "キドとリーンだ": "？？？"),
			(? "セルザン達だ": "？？？"),
			(? "ヒシエとエイヴァントだ": "？？？"),
			(? "ヘスランタとアバランチェだ": "？？？"),
			"誰もいない");
		switch('@menu) {
		case 1:
			mes "‐アジフ、イグリドと合流した‐";
			set '@menu,3;
			break;
		default:
			mes "‐誰とも合流しなかった‐";
			set '@menu,2;
			break;
		}
		close2;
		setpartyinmap BIOS_1QUE,'@menu;
		hideonnpc getmdnpcname("ブリド#bios1"); //71400
		hideonnpc getmdnpcname("ジェイス#bios1"); //71398
		donpcevent getmdnpcname("ブリド#bios1")+ "::OnStart";
		end;
	}
	mes "‐見慣れない男性二人組が居る‐";
	close2;
	setpartyinmap BIOS_1QUE,1;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "ブリド : おや？　こんなところで冒険者に会うとは……";
	end;
OnTimer4000:
	unittalk "ブリド : 君も魔王モロクの復活を阻止しに来たのか？";
	end;
OnTimer7000:
	unittalk "ブリド : 私はプロンテラから来たブリド。こいつは……";
	end;
OnTimer10000:
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios1"),"ジェイス : ……ジェイスだ。";
	end;
OnTimer13000:
	unittalk "ブリド : すまんな。ジェイスは人見知りなんだ。";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios1"),"ジェイス : ……";
	end;
OnTimer19000:
	unittalk "ブリド : それより、後ろから誰か追いかけて来ているが、君の知り合いか？";
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc getmdnpcname("#会話用ダミー1");
	end;
OnTalk1:
	unittalk "ブリド : あんたら……連合軍の司令官アジフと教官長イグリドか！";
	end;
OnTalk2:
	unittalk "ブリド : あんたらが居るなら心強い！　よろしく頼むぜ！";
	end;
OnTalk3:
	unittalk "ブリド : なにっ!!";
	end;
OnTalk4:
	unittalk "ブリド : はっ！　三下に用はない！";
	end;
OnTalk5:
	unittalk "ブリド : 誰だか知らんが、まずはお前を倒してやるっ!!";
	end;
OnTalk6:
	unittalk "ブリド : くそっ！　消えやがった!!";
	end;
OnTalk7:
	unittalk "ブリド : あいつが魔王モロクを復活させようとしているのか？";
	end;
OnTalk8:
	unittalk "ブリド : 奴を追うぞ！　ジェイス急げ！";
	end;
OnStart:
	hideonnpc getmdnpcname("#BARRICADE1_1"); //79284
	hideonnpc getmdnpcname("#BARRICADE1_2"); //79285
	hideonnpc getmdnpcname("#BARRICADE1_3"); //79286
	hideonnpc getmdnpcname("#BARRICADE1_4"); //79287
	hideonnpc getmdnpcname("#BARRICADE1_5"); //79288
	hideonnpc getmdnpcname("#BARRICADE1_6"); //79289
	hideonnpc getmdnpcname("#BARRICADE1_7"); //79290
	hideonnpc getmdnpcname("#BARRICADE1_8"); //79291
	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,0;
	sleep 3000;
	announce "死神アンク : 死、それは生ある者のみに訪れる恐怖。すべてはここから始まるのです……", 0x9, 0xffff00;
	sleep 3000;
	announce "ブリド : 待てアンク！　くそっ、東に逃げたようだな。奴を追うぞ！", 0x9, 0xffff00;
	end;
}
1@dth1.gat,67,97,0	script	#会話用ダミー1	139,10,10,{/* 69842 (hide)*/
	mes "‐誰が来ている？‐";
	next;
	set '@menu,select(
		(? "アジフとイグリドだ": "？？？"),
		(? "キドとリーンだ": "？？？"),
		(? "セルザン達だ": "？？？"),
		(? "ヒシエとエイヴァントだ": "？？？"),
		(? "ヘスランタとアバランチェだ": "？？？"),
		"誰もいない");
	switch('@menu) {
	case 1:
		mes "‐振り向くと、アジフとイグリドが居た‐";
		close2;
		setpartyinmap BIOS_1QUE,3;
		donpcevent getmdnpcname("司令官アジフ#bios1")+ "::OnStart";
		end;
	case 3:
		mes "‐振り向くと、セルザン、リョースン、";
		mes "　ヒュー、ヘンジヌが居た‐";
		close2;
		setpartyinmap BIOS_1QUE,5;
		donpcevent getmdnpcname("連合軍事務官#bios1")+ "::OnStart";
		end;
	default:
		mes "‐誰とも合流しなかった‐";
		close2;
		setpartyinmap BIOS_1QUE,2;
		hideonnpc getmdnpcname("ブリド#bios1"); //71400
		hideonnpc getmdnpcname("ジェイス#bios1"); //71398
		donpcevent getmdnpcname("ジェイス#bios1")+ "::OnStart2";
		end;
	}
}
1@dth1.gat,60,96,5	script	司令官アジフ#bios1	459,{/* 69843 (hide)*/
	//
	end;
OnStart:
	hideonnpc getmdnpcname("#会話用ダミー1");
	hideoffnpc getmdnpcname("司令官アジフ#bios1");
	hideoffnpc getmdnpcname("教官長イグリド#bios1");
	initnpctimer;
	end;
OnTimer1000:
	unittalk "アジフ : みんな、無事か！　俺が来たからにはもう大丈夫だ！";
	end;
OnTimer4000:
	donpcevent getmdnpcname("教官長イグリド#bios1")+ "::OnTalk1";
	end;
OnTimer7000:
	unittalk "アジフ : うるさい！　あと、俺の事は司令官と呼べ！";
	end;
OnTimer10000:
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk1";
	end;
OnTimer13000:
	donpcevent getmdnpcname("ジェイス#bios1")+ "::OnTalk3";
	end;
OnTimer16000:
	unittalk "アジフ : こいつには借りがあってな。そいつを返しに来たんだ。";
	end;
OnTimer19000:
	donpcevent getmdnpcname("教官長イグリド#bios1")+ "::OnTalk2";
	end;
OnTimer22000:
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk2";
	end;
OnTimer25000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk1";
	end;
OnTimer28000:
	donpcevent getmdnpcname("ジェイス#bios1")+ "::OnTalk4";
	end;
OnTimer31000:
	hideoffnpc getmdnpcname("死神アンク#bios1");
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk2";
	end;
OnTimer34000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk3";
	end;
OnTimer37000:
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk3";
	end;
OnTimer40000:
	unittalk "アジフ : へぇ、こいつが親玉か。";
	end;
OnTimer43000:
	donpcevent getmdnpcname("教官長イグリド#bios1")+ "::OnTalk3";
	end;
OnTimer46000:
	unittalk "アジフ : 全員、気を抜くんじゃないぞ！";
	end;
OnTimer49000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk4";
	end;
OnTimer52000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk5";
	end;
OnTimer55000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk6";
	end;
OnTimer58000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk7";
	end;
OnTimer61000:
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk4";
	end;
OnTimer64000:
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk5";
	end;
OnTimer67000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk8";
	end;
OnTimer70000:
	donpcevent getmdnpcname("死神アンク#bios1")+ "::OnTalk9";
	end;
OnTimer73000:
	hideonnpc getmdnpcname("死神アンク#bios1");
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk6";
	end;
OnTimer76000:
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk7";
	end;
OnTimer79000:
	donpcevent getmdnpcname("ブリド#bios1")+ "::OnTalk8";
	hideonnpc getmdnpcname("ブリド#bios1");
	end;
OnTimer82000:
	donpcevent getmdnpcname("ジェイス#bios1")+ "::OnTalk5";
	end;
OnTimer83000:
	hideonnpc getmdnpcname("ジェイス#bios1");
	end;
OnTimer86000:
	unittalk "アジフ : イグリド！　俺たちも続くぞ！";
	end;
OnTimer89000:
	hideonnpc getmdnpcname("司令官アジフ#bios1"); //79297
	hideonnpc getmdnpcname("教官長イグリド#bios1"); //79298
	end;
OnTimer89500:
	hideonnpc getmdnpcname("#BARRICADE1_1"); //79284
	hideonnpc getmdnpcname("#BARRICADE1_2"); //79285
	hideonnpc getmdnpcname("#BARRICADE1_3"); //79286
	hideonnpc getmdnpcname("#BARRICADE1_4"); //79287
	hideonnpc getmdnpcname("#BARRICADE1_5"); //79288
	hideonnpc getmdnpcname("#BARRICADE1_6"); //79289
	hideonnpc getmdnpcname("#BARRICADE1_7"); //79290
	hideonnpc getmdnpcname("#BARRICADE1_8"); //79291
	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,0;
	end;
OnTimer92000:
	announce "死神アンク : 死、それは生ある者のみに訪れる恐怖。すべてはここから始まるのです……", 0x9, 0xffff00;
	end;
OnTimer95000:
	stopnpctimer;
	announce "ブリド : 待てアンク！　くそっ、東に逃げたようだな。奴を追うぞ！", 0x9, 0xffff00;
	end;
}
1@dth1.gat,60,93,5	script	教官長イグリド#bios1	751,{/* 69844 (hide)*/
	//
	end;
OnTalk1:
	unittalk "イグリド : 兄貴！　司令官が前線に出るなんてどういうつもりだ！";
	end;
OnTalk2:
	unittalk "イグリド : そういうわけだから、悪いが俺たちも同行させて貰うぜ。";
	end;
OnTalk3:
	unittalk "イグリド : さすが……他とは桁違いの強さみたいだな。";
	end;
}
1@dth1.gat,60,96,5	script	キド#bios1	884,{/* 69845 (hide)*/}
1@dth1.gat,60,93,5	script	リーン#bios1	885,{/* 69846 (hide)*/}
1@dth1.gat,60,96,5	script	連合軍事務官#bios1	754,{/* 69847 (hide)*/
	mes "[セルザン]";
	mes "ほ、本当は怖いですけど";
	mes "私も何かお役にたちたいんです！";
	close;
OnStart:
	hideonnpc getmdnpcname("#会話用ダミー1");
	hideoffnpc getmdnpcname("リョースン#bios1");
	hideoffnpc getmdnpcname("ヒュー#bios1");
	hideoffnpc getmdnpcname("ヘンジヌ#bios1");
	hideoffnpc getmdnpcname("連合軍事務官#bios1");
	initnpctimer;
	end;
OnTimer1000:
	unittalk getnpcid(0,getmdnpcname("連合軍事務官#bios1")),"セルザン: みなさん、お久しぶりです！　僕たちにもお手伝いさせてください！";	// 98784
	end;
OnTimer4000:
	unittalk getnpcid(0,getmdnpcname("ヘンジヌ#bios1")),"ヘンジヌ : 私がみんなに提案したんです。世話になった恩を返そうって。";	// 79693
	end;
OnTimer7000:
	unittalk getnpcid(0,getmdnpcname("ヒュー#bios1")),"ヒュー : まったく、何が提案だ……。これだからアルナベルツの人間は……。";	// 19791
	end;
OnTimer10000:
	unittalk getnpcid(0,getmdnpcname("リョースン#bios1")),"リョースン : 僕たちの意見も聞かずに勝手に決めてましたもんね……。";	// 32742
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("ヒュー#bios1")),"ヒュー : リョースンだって私に無断で会議の日程を決めるけどな。";	// 19791
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("ヘンジヌ#bios1")),"ヘンジヌ : ヒューだって、ユーモアもセンスもなくて、堅苦しいですよ。";	// 79693
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("連合軍事務官#bios1")),"セルザン: 3人とも、こんな場所でケンカはやめてください！";	// 98784
	end;
OnTimer22000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : ……君たちはただの事務官だろう？";	// 52772
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : 悪い事は言わない。帰った方が良い。";	// 52772
	end;
OnTimer28000:
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios1")),"ジェイス : ……ブリド、こいつら聞いてないぞ。";	// 24060
	end;
OnTimer31000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : ……。";	// 52772
	end;
OnTimer34000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"？？？？ : クックック。";	// 88019
	end;
OnTimer37000:
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios1")),"ジェイス : ……!!!　誰だ!?";	// 24060
	end;
OnTimer40000:
	hideoffnpc getmdnpcname("死神アンク#bios1");	// 88019
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"？？？？ : ようこそビオスの島へ。";	// 88019
	end;
OnTimer43000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"死神アンク : 私は死神アンク。ここは私が作り出した死と生の空間です。";	// 88019
	end;
OnTimer46000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : なにっ!!";	// 52772
	end;
OnTimer49000:
	unittalk getnpcid(0,getmdnpcname("リョースン#bios1")),"リョースン: し、死神!?";	// 32742
	end;
OnTimer52000:
	unittalk getnpcid(0,getmdnpcname("ヒュー#bios1")),"ヒュー : す、凄く強そうじゃないですか！";	// 19791
	end;
OnTimer55000:
	unittalk getnpcid(0,getmdnpcname("ヘンジヌ#bios1")),"ヘンジヌ : 死神って浮いてるんですね！　アハハハハ！";	// 79693
	end;
OnTimer58000:
	unittalk getnpcid(0,getmdnpcname("連合軍事務官#bios1")),"セルザン : みなさん、気を付けてください！";	// 98784
	end;
OnTimer61000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"死神アンク : これはこれは、みなさん威勢がいいようですね。";	// 88019
	end;
OnTimer64000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"死神アンク : これからモロク様に捧げる生贄を調達しようとしていたのですが……。";	// 88019
	end;
OnTimer67000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"死神アンク : まさか生贄が自らやって来るとは……ククク。";	// 88019
	end;
OnTimer70000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"死神アンク : モロク様の力になれる事を光栄に思いなさい。";	// 88019
	end;
OnTimer73000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : はっ！　三下に用はない！";	// 52772
	end;
OnTimer76000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : 誰だか知らんが、まずはお前を倒してやるっ!!";	// 52772
	end;
OnTimer79000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"死神アンク : クク、威勢が良くて結構です。ただ、急ぐ必要はありません。";	// 88019
	end;
OnTimer82000:
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios1")),"死神アンク : まずは私の世界でゆっくり……くつろぐことです。ククククク。";	// 88019
	end;
OnTimer85000:
	hideonnpc getmdnpcname("死神アンク#bios1");	// 88019
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : くそっ！　消えやがった!!";	// 52772
	end;
OnTimer88000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : あいつが魔王モロクを復活させようとしているのか？";	// 52772
	end;
OnTimer91000:
	unittalk getnpcid(0,getmdnpcname("ブリド#bios1")),"ブリド : 奴を追うぞ！　ジェイス急げ！";	// 52772
	hideonnpc getmdnpcname("ブリド#bios1");	// 52772
	end;
OnTimer94000:
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios1")),"ジェイス : ……先行する。あとからついて来てくれ。";	// 24060
	end;
OnTimer95000:
	hideonnpc getmdnpcname("ジェイス#bios1");	// 24060
	end;
OnTimer98000:
	unittalk getnpcid(0,getmdnpcname("リョースン#bios1")),"リョースン : こ、怖いけど……みんな！　行きましょう！";	// 32742
	end;
OnTimer101000:
	hideonnpc getmdnpcname("リョースン#bios1");	// 32742
	hideonnpc getmdnpcname("ヒュー#bios1");	// 19791
	hideonnpc getmdnpcname("ヘンジヌ#bios1");	// 79693
	hideonnpc getmdnpcname("連合軍事務官#bios1");	// 98784
	hideonnpc getmdnpcname("#BARRICADE1_1"); //79284
	hideonnpc getmdnpcname("#BARRICADE1_2"); //79285
	hideonnpc getmdnpcname("#BARRICADE1_3"); //79286
	hideonnpc getmdnpcname("#BARRICADE1_4"); //79287
	hideonnpc getmdnpcname("#BARRICADE1_5"); //79288
	hideonnpc getmdnpcname("#BARRICADE1_6"); //79289
	hideonnpc getmdnpcname("#BARRICADE1_7"); //79290
	hideonnpc getmdnpcname("#BARRICADE1_8"); //79291
	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,0;
	end;
OnTimer104000:
	announce "死神アンク : 死、それは生ある者のみに訪れる恐怖。すべてはここから始まるのです……", 0x9, 0xffff00;
	end;
OnTimer106500:
	stopnpctimer;
	announce "ブリド : 待てアンク！　くそっ、東に逃げたようだな。奴を追うぞ！", 0x9, 0xffff00;
	end;
}
1@dth1.gat,60,93,5	script	リョースン#bios1	748,{/* 69848 (hide)*/
	mes "[リョースン]";
	mes "どどど、どうしてこんなことに……。";
	mes "ああ、逃げ出したい……。";
	close;
}
1@dth1.gat,58,95,5	script	ヒュー#bios1	868,{/* 69849 (hide)*/
	mes "[ヒュー]";
	mes "は、はは、まさか最前線に来るとは";
	mes "予想外でしたよ。";
	close;
}
1@dth1.gat,58,92,5	script	ヘンジヌ#bios1	931,{/* 69850 (hide)*/
	mes "[ヘンジヌ]";
	mes "種に入ったら島に出るなんて";
	mes "こりゃあ、まいっ種";
	mes "なんてね";
	mes "アハハハハハ！";
	close;
}
1@dth1.gat,60,96,5	script	ヒシエ#bios1	623,{/* 69851 (hide)*/}
1@dth1.gat,60,93,5	script	エイヴァント#bios1	618,{/* 69852 (hide)*/}
1@dth1.gat,60,96,5	script	大臣ヘスランタ#bios1	451,{/* 69853 (hide)*/}
1@dth1.gat,60,93,5	script	先発隊長アバランチェ#b1	450,{/* 69854 (hide)*/}
1@dth1.gat,67,97,0	script	#会話用ダミー2	139,{/* 69855 (hide)*/}

1@dth1.gat,326,103,0	script	warp1#bios1	45,1,1,{
	setquest 116535; //state=1
	compquest 116535;
	warp getmdmapname("1@dth2.gat"),17,93;
	end;
}

1@dth2.gat,150,126,0	script	#BARRICADE2_1	1905,{}
1@dth2.gat,150,127,0	script	#BARRICADE2_2	1905,{}
1@dth2.gat,150,128,0	script	#BARRICADE2_3	1905,{}
1@dth2.gat,150,129,0	script	#BARRICADE2_4	1905,{}
1@dth2.gat,150,130,0	script	#BARRICADE2_5	1905,{}
1@dth2.gat,150,131,0	script	#BARRICADE2_6	1905,{}
1@dth2.gat,150,132,0	script	#BARRICADE2_7	1905,{}
1@dth2.gat,150,133,0	script	#BARRICADE2_8	1905,{}

1@dth2.gat,1,1,0	script	#bios2_mobdead1	139,{
OnStart:
	monster getmdmapname("1@dth2.gat"),145,130,"生者のオークウォリアー",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),144,130,"生者のデザートウルフ",3014,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),143,130,"生者のフェン",3015,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),103,124,"生者のオークウォリアー",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),102,124,"生者のデザートウルフ",3014,3,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),101,124,"生者のフェン",3015,3,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),119,160,"生者のオークウォリアー",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),118,160,"生者のデザートウルフ",3014,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),117,160,"生者のフェン",3015,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer500:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@dth2.gat"),getmdnpcname("#bios2_mobdead1")+ "::OnKilled");
	if('@count == 10)
		announce "ブリド : まだ10匹のモンスターが残っているぞ！", 0x9, 0xffff00;
	else if('@count == 5)
		announce "ブリド : 残りのモンスターはあと5匹、もう少しだ！", 0x9, 0xffff00;
	else if('@count == 1)
		announce "ブリド : モンスターはあと1匹だ。最後まで気を抜くな！", 0x9, 0xffff00;
	else if('@count <= 0) {
		hideonnpc getmdnpcname("#BARRICADE2_1"); //79284
		hideonnpc getmdnpcname("#BARRICADE2_2"); //79285
		hideonnpc getmdnpcname("#BARRICADE2_3"); //79286
		hideonnpc getmdnpcname("#BARRICADE2_4"); //79287
		hideonnpc getmdnpcname("#BARRICADE2_5"); //79288
		hideonnpc getmdnpcname("#BARRICADE2_6"); //79289
		hideonnpc getmdnpcname("#BARRICADE2_7"); //79290
		hideonnpc getmdnpcname("#BARRICADE2_8"); //79291
		areasetcell getmdmapname("1@dth2.gat"),150,126,151,133,0;
		announce "ブリド : よし！　橋の封鎖がとけた！　奥に移動するぞ！", 0x9, 0xffff00;
		sleep 2500;
		donpcevent getmdnpcname("#bios2_mobdead2")+ "::OnStart";
	}
	end;
}
1@dth2.gat,1,1,0	script	#bios2_mobdead2	139,{
OnStart:
	announce "ブリド : くそっ！　奥もモンスターだらけだ。全て倒すしかないのか！", 0x9, 0xffff00;
	monster getmdmapname("1@dth2.gat"),203,132,"生者のオークウォリアー",3013,5,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),202,132,"生者のデザートウルフ",3014,3,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),201,132,"生者のフェン",3015,3,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),229,126,"生者のオークウォリアー",3013,5,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),228,126,"生者のデザートウルフ",3014,4,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),227,126,"生者のフェン",3015,4,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),267,104,"生者のオークウォリアー",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),268,104,"生者のフェン",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),269,104,"生者のオークウォリアー",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),270,103,"生者のデザートウルフ",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),270,104,"生者のフェン",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),272,102,"生者のフェン",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),273,102,"生者のデザートウルフ",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),273,103,"生者のデザートウルフ",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),274,102,"生者のオークウォリアー",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),275,103,"生者のフェン",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),276,103,"生者のデザートウルフ",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),278,105,"生者のオークウォリアー",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),281,104,"生者のオークウォリアー",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer500:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@dth2.gat"),getmdnpcname("#bios2_mobdead2")+ "::OnKilled");
	if('@count == 10)
		announce "ブリド : まだ10匹のモンスターが残っているぞ！", 0x9, 0xffff00;
	else if('@count == 5)
		announce "ブリド : 残りのモンスターはあと5匹、もう少しだ！", 0x9, 0xffff00;
	else if('@count == 1)
		announce "ブリド : モンスターはあと1匹だ！", 0x9, 0xffff00;
	else if('@count <= 0) {
		announce "ブリド : よし、片付いたぞ！　島の東から先に進むぞ！", 0x9, 0xffff00;
		hideoffnpc getmdnpcname("warp1#bios2"); //79291
	}
	end;
}
1@dth2.gat,67,97,0	script	start1#bios2	139,5,5,{
	hideonnpc getmdnpcname("start1#bios2"); //90417
	donpcevent getmdnpcname("#bios2_mobdead")+ "::OnStart";
	switch(BIOS_1QUE) {
	case 3:
		donpcevent getmdnpcname("BC用#bios2")+ "::OnStart1";
		end;
	case 5:
		donpcevent getmdnpcname("BC用#bios2")+ "::OnStart3";
		end;
	}
}
1@dth2.gat,67,97,0	script	BC用#bios2	139,{
OnStart1:
	announce "アジフ : ふん、この程度の敵、俺の相手じゃねえな。", 0x9, 0xffff00;
	sleep 3000;
	announce "イグリド : こうして兄貴と背中合わせで戦ってると傭兵時代を思い出すよ。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : ククク。怯えなさい人間。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 成長の終着点とは、すなわち深淵。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 死を迎え、冥府へと落ちてしまえば", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 物語と違い、貴方の手を引く吟遊詩人は現れない。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : さあ、死に怯えなさい。心を恐怖に染め上げるのです。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 恐怖は贄となり、モロク様は再び生まれ変わるでしょう。", 0x9, 0xffff00;
	sleep 3000;
	announce "ブリド : 待つんだアンク!!　くそっ。まずは邪魔なモンスター達を全て倒すぞ！", 0x9, 0xffff00;
	end;
OnStart3:
	announce "ブリド : あの4人組の姿が見えないな……。", 0x9, 0xffff00;
	sleep 3000;
	announce "ブリド : やはり、この戦いには力不足だったか……。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : ククク。怯えなさい人間。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 成長の終着点とは、すなわち深淵。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 死を迎え、冥府へと落ちてしまえば", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 物語と違い、貴方の手を引く吟遊詩人は現れない。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : さあ、死に怯えなさい。心を恐怖に染め上げるのです。", 0x9, 0xffff00;
	sleep 3000;
	announce "死神アンク : 恐怖は贄となり、モロク様は再び生まれ変わるでしょう。", 0x9, 0xffff00;
	sleep 3000;
	announce "ブリド : 待つんだアンク!!　くそっ。まずは邪魔なモンスター達を全て倒すぞ！", 0x9, 0xffff00;
	end;
}
1@dth2.gat,326,103,0	script	warp1#bios2	45,{
	//setquest 116535; //state=1
	//compquest 116535;
	warp getmdmapname("1@dth3.gat"),45,68;
	end;
}

1@dth3.gat,62,80,3	script	死者のオークゾンビ#11bi	3016,{/* 69874 (hide)*/}
1@dth3.gat,64,80,3	script	死者のオークゾンビ#12bi	3016,{/* 69875 (hide)*/}
1@dth3.gat,66,80,3	script	死者のオークゾンビ#13bi	3016,{/* 69876 (hide)*/}
1@dth3.gat,68,80,3	script	死者のオークゾンビ#14bi	3016,{/* 69877 (hide)*/}
1@dth3.gat,72,80,3	script	死者のオークゾンビ#15bi	3016,{/* 69878 (hide)*/}
1@dth3.gat,74,80,3	script	死者のオークゾンビ#16bi	3016,{/* 69879 (hide)*/}
1@dth3.gat,76,80,3	script	死者のオークゾンビ#17bi	3016,{/* 69880 (hide)*/}
1@dth3.gat,78,80,3	script	死者のオークゾンビ#18bi	3016,{/* 69881 (hide)*/}
1@dth3.gat,62,86,3	script	死者のオークゾンビ#21bi	3016,{/* 69882 (hide)*/}
1@dth3.gat,64,86,3	script	死者のオークゾンビ#22bi	3016,{/* 69883 (hide)*/}
1@dth3.gat,66,86,3	script	死者のオークゾンビ#23bi	3016,{/* 69884 (hide)*/}
1@dth3.gat,68,86,3	script	死者のオークゾンビ#24bi	3016,{/* 69885 (hide)*/}
1@dth3.gat,72,86,3	script	死者のオークゾンビ#25bi	3016,{/* 69886 (hide)*/}
1@dth3.gat,74,86,3	script	死者のオークゾンビ#26bi	3016,{/* 69887 (hide)*/}
1@dth3.gat,76,86,3	script	死者のオークゾンビ#27bi	3016,{/* 69888 (hide)*/}
1@dth3.gat,78,86,3	script	死者のオークゾンビ#28bi	3016,{/* 69889 (hide)*/}
1@dth3.gat,62,92,3	script	死者のオークゾンビ#31bi	3016,{/* 69890 (hide)*/}
1@dth3.gat,64,92,3	script	死者のオークゾンビ#32bi	3016,{/* 69891 (hide)*/}
1@dth3.gat,66,92,3	script	死者のオークゾンビ#33bi	3016,{/* 69892 (hide)*/}
1@dth3.gat,68,92,3	script	死者のオークゾンビ#34bi	3016,{/* 69893 (hide)*/}
1@dth3.gat,72,92,3	script	死者のオークゾンビ#35bi	3016,{/* 69894 (hide)*/}
1@dth3.gat,74,92,3	script	死者のオークゾンビ#36bi	3016,{/* 69895 (hide)*/}
1@dth3.gat,76,92,3	script	死者のオークゾンビ#37bi	3016,{/* 69896 (hide)*/}
1@dth3.gat,78,92,3	script	死者のオークゾンビ#38bi	3016,{/* 69897 (hide)*/}

1@dth3.gat,72,74,3	script	ジェイス#bios3	467,{
	if(BIOS_1QUE < 10) {
		mes "[ジェイス]";
		mes "……無事だったか。";
		mes "ここが最深部のようだ。";
		close;
	}
	if(BIOS_1QUE < 20) {
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
1@dth3.gat,64,74,5	script	ブリド#bios3	468,{
	if(BIOS_1QUE < 10) {
		if(select("先を急ぐ","会話をする") ==1) {
			donpcevent getmdnpcname("#talkshow管理")+ "::OnStart";
			end;
		}
	}
	if(BIOS_1QUE < 20) {
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
	getexp 10000000,0;
	getexp 10000000,0;
	getexp 2000000,0;
	setquest 116513; //state=1
	compquest 116513;
	getitem 6684, 1;
	if(checkquest(201720)==0)
		setquest 201720; //state=1
	warp "moro_cav.gat",45,63;
	end;
}
1@dth3.gat,66,72,0	script	#増援判定用1	139,{/* 69905 (hide)*/
OnStart:
	set '@mdmap$,getmdmapname("1@dth3.gat");
	set '@mdnpc$,getmdnpcname("#増援判定用1")+ "::OnKilled1";
	for(set '@y,80;'@y<=92;set '@y,'@y+6) {
		for(set '@x,62;'@x<=78;set '@x,'@x+2) {
			monster '@mdmap$,'@x,'@y,"死者のオークゾンビ",3016,1,'@mdnpc$;
		}
	}
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@dth3.gat"),getmdnpcname("#増援判定用1")+ "::OnKilled1");
	if('@count > 0) end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("ブリド#bios3")),"ブリド : 凄いな！　全部倒したのか？";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios3")),"ジェイス : まだだ……気を付けろ！";
	sleep 1000;
	set '@mdmap$,getmdmapname("1@dth3.gat");
	set '@mdnpc$,getmdnpcname("#増援判定用1")+ "::OnKilled2";
	for(set '@y,80;'@y<=92;set '@y,'@y+6) {
		for(set '@x,62;'@x<=78;set '@x,'@x+2) {
			monster '@mdmap$,'@x,'@y,"死者のベリット",3017,1,'@mdnpc$;
		}
	}
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@dth3.gat"),getmdnpcname("#増援判定用1")+ "::OnKilled2");
	if('@count > 0) end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("ブリド#bios3")),"ブリド : 今度こそ全部倒したんだよな？";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios3")),"ジェイス : 残念ながらまだのようだ……！";
	sleep 1000;
	set '@mdmap$,getmdmapname("1@dth3.gat");
	set '@mdnpc$,getmdnpcname("#増援判定用1")+ "::OnKilled3";
	for(set '@y,80;'@y<=92;set '@y,'@y+6) {
		for(set '@x,62;'@x<=78;set '@x,'@x+2) {
			monster '@mdmap$,'@x,'@y,"死者のメガロドン",3018,1,'@mdnpc$;
		}
	}
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@dth3.gat"),getmdnpcname("#増援判定用1")+ "::OnKilled3");
	if('@count > 0) end;
	//hideonnpc "#増援判定用1"; //97031
	hideoffnpc getmdnpcname("死神アンク#bios3"); //97026
	if(BIOS_1QUE == 13) {
		announce "セルザン : 食らええええええええ！", 0x9, 0xffff00;
		sleep 3000;
		misceffect 106,getmdnpcname("死神アンク#bios3");	// 34005:0x1f3
		misceffect 107,getmdnpcname("死神アンク#bios3");	// 34005:0x1f3
		sleep 3000;
		announce "‐死神アンクの体力が大きく減少した‐", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : くっ……一体何事ですか！";	// 34005
		sleep 3000;
		announce "ヘンジヌ : き、効いた！", 0x9, 0xffff00;
		sleep 3000;
		announce "リョースン : さすがドランスさんに作ってもらった、新型爆薬！", 0x9, 0xffff00;
		sleep 3000;
		announce "ヒュー : ドランス式対大型モンスター擲弾だっけ？", 0x9, 0xffff00;
		sleep 3000;
		announce "セルザン : 早く！　今のうちに逃げますよ！", 0x9, 0xffff00;
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : やってくれましたね……まぁいいでしょう。";	// 34005
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : あの方たちは後でじっくり処分するとします。";	// 34005
		sleep 3000;
		unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : さて、そこの冒険者のあなた。";	// 34005
	}
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : あなたは久しぶりに楽しめそうな方ですね。";	// 34005
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : 特別に、私が直接お相手しましょう!!";	// 34005
	sleep 1500;
	monster getmdmapname("1@dth3.gat"),70,67,"死神アンク",3029,1,getmdnpcname("#増援判定用1")+ "::OnBossKilled";
	end;
OnBossKilled:
	sleep 1500;
	hideoffnpc getmdnpcname("死神アンク#bios3"); //97026
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : くっ……なるほど。人間には……強い者もいるのですね。";
	sleep 2000;
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : しかし……これで終わりだと思わない方がいいですよ。";
	sleep 1000;
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : モロク様の復活は目の前まで来ているのです!!　ククク……!!";
	sleep 2000;
	hideonnpc getmdnpcname("死神アンク#bios3"); //97026
	misceffect 135, getmdnpcname("ブリド#bios3"); //97027
	misceffect 135, getmdnpcname("ジェイス#bios3"); //97025
	setnpcdisplay getmdnpcname("ブリド#bios3"),468; //97027
	setnpcdisplay getmdnpcname("ジェイス#bios3"),467; //97025
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("ブリド#bios3")),"ブリド : ……あっ!!　やっと体が！";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("ジェイス#bios3")),"ジェイス : くっ……。";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("ブリド#bios3")),"ブリド : ふぅ……あの死神の魔力は私とジェイスでは太刀打ちできないほど強力だった。";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("ブリド#bios3")),"ブリド : 君がいなければ何もできないままやられていただろう。";
	sleep 2500;
	unittalk getnpcid(0,getmdnpcname("ブリド#bios3")),"ブリド : 感謝の気持ちとして渡したい物がある。受け取る準備が出来たら話しかけてくれ。";
	end;
}
1@dth3.gat,66,72,0	script	#talkshow管理	139,{
OnStart:
	setnpcdisplay getmdnpcname("ジェイス#bios3"),10035;
	setnpcdisplay getmdnpcname("ブリド#bios3"),10036;
	hideoffnpc getmdnpcname("死神アンク#bios3"); //97026
	sleep 1500;
	unittalk getnpcid(0,getmdnpcname("死神アンク#bios3")),"死神アンク : それでは、愚かな冒険者様。冥府への旅路に憂い無きよう……。ククク。";
	sleep 3000;
	hideonnpc getmdnpcname("死神アンク#bios3"); //97026
	donpcevent getmdnpcname("#増援判定用1")+ "::OnStart";
	end;
}
1@dth3.gat,66,72,5	script	司令官アジフ#bios3	459,{/* 69907 (hide)*/
	if(BIOS_1QUE < 10) {
		cutin "ep13_captin_edq.bmp", 2;
		mes "[アジフ]";
		mes "イグリド！";
		mes "一気に勝負を決めるぞ！";
		close2;
		cutin "ep13_captin_edq.bmp", 255;
		end;
	}
	if(BIOS_1QUE < 20) {
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
	if(BIOS_1QUE < 10) {
		mes "[イグリド]";
		mes "伊達に傭兵はやってないぜ！";
		mes "俺の一撃、食らいな！";
		close;
	}
	if(BIOS_1QUE < 20) {
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
1@dth3.gat,70,72,3	script	先発隊長アバランチェ#b3	450,{/* 69914 (hide)*/}

1@dth3.gat,69,67,0	script	freeze#bios3	139,{/* 69916 (hide)*/}
