@spawn(type: BL_MOB, ID: 40236, speed: 200, option: 0, view: 2998, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モロク??")
@nomalattack(src: "2998:モロク??:0qj1@rev.gat"(40236), dst: , damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(), dst: 40236, damage: 64, sDelay: 260, dDelay: 440, tick: 432013023)

@spawn(type: BL_MOB, ID: 23072, speed: 195, option: 0, view: 3007, pos: "0qj1@rev.gat"(34, 121), dir: 0, name: "イグリドの魂")

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
	if(checkquest(201720) == 0) {	// ビオスの島未攻略
		mes "[先任追跡隊員]";
		mes "現在、この赤い花を調査中です。";
		mes "どうもその隣にある、";
		mes "黄色い種と深い関係が";
		mes "ありそうなのですが……。";
		next;
		mes "‐^ff0000黄色い種^000000を先に調査しよう‐";
		close;
	}
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
	if(checkquest(201720) == 0) {	// ビオスの島未攻略
		mes "[先任追跡隊員]";
		mes "ここはモロク復活を防ぐ連合軍の";
		mes "最前線です。";
		mes "私はモロクの足跡を追っています。";
		mes "　";
		mes "‐^ff0000ビオスの島未攻略のため";
		mes "　入場が出来ません^000000‐";
		close;
	}
	mes "‐赤い花がある‐";
	next;
	if(select("赤い花に入る","赤い花に入らない") == 2) {
		mes "‐その場を後にした‐";
		close;
	}
	switch(mdenter("mors")) {
	case 0:	// エラーなし
		announce "メモリアルダンジョン[mors] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		setquest 9319; //state=1
		setquest 9318; //state=1
		setquest 118930; //state=1
		close2;
		//warp "1@rev.gat",26,181;
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

1@rev.gat,27,181,0	script	#RZメモリアルスタート	139,1,1,{/* 75055 (hide)*/
OnTouch:
	hideonnpc "#RZメモリアルスタート"; //70777
	hideoffnpc "#RZイベント_1"; //70780
	misceffect 1, "#RZメモリアルスタート"; //70777
	end;
}
1@rev.gat,34,120,0	script	#RZ_EFFECT01	139,{/* 75056 (hide)*/
OnStart:
OnTimer2000:
	initnpctimer;
	misceffect 196; //77455
	end;
OnStop:
	stopnpctimer;
	end;
}
1@rev.gat,34,48,0	script	#RZ_EFFECT02	139,{/* 75057 (hide)*/
OnStart:
OnTimer2000:
	initnpctimer;
	misceffect 196; //77455
	end;
OnStop:
	stopnpctimer;
	end;
}
1@rev.gat,31,181,0	script	#RZイベント_1	139,5,5,{/* 75058 (hide)*/
OnTouch:
	initnpctimer;
	end;
OnTimer2000:
	announce "モロク : 誰だ？　私の休息の邪魔をするのは。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer4000:
	announce "‐どこからともなく声がする。どうやらここがモロクの潜伏先で間違いないようだ‐", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer8000:
	announce "？？？ : 待ってくれ！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer10000:
	stopnpctimer;
	misceffect 60,""; //self
	hideonnpc "#RZイベント_1"; //70780
	hideoffnpc "#RZイベント_1-2"; //70781
	end;
}
1@rev.gat,31,181,0	script	#RZイベント_1-2	139,5,5,{/* 75059 */
OnTouch:
	mes "‐後方から声が聞こえる？";
	mes "　誰か来たのだろうか‐";
	next;
	set 'menu,select("イグリド","キド","ヒシエ","誰もいない");
	hideonnpc "#RZイベント_1"; //70780
	switch('menu) {
	case 1:
		hideoffnpc "教官長イグリド#入口"; //70783
		break;
	case 2:
		hideoffnpc "キド#入口"; //70783
		break;
	}
	mes "‐仲間がかけつけた-";
	close;
OnStart:
	initnpctimer;
	announce "死神アンク : また会いましたね。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer3000:
	if('menu == 1)
		announce "イグリド : モロクはどこだ！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	else if('menu == 2)
		announce "キド : モロクはどこにいる？", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer6000:
	announce "死神アンク : そんなにモロク様に会いたいですか？　ククク。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer9000:
	announce "死神アンク : ここはモロク様がご自身の精神で支配されている空間。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer12000:
	announce "死神アンク : そう、すべてがモロク様の世界です。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer15000:
	if('menu == 1)
		announce "イグリド : なんだと！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	else if('menu == 2)
		announce "キド : ほう。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer18000:
	announce "死神アンク : あなた方の思い通りにはいかないでしょう。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer21000:
	announce "死神アンク : さぁモロク様がお待ちです。モロク様がいる場所まで案内しましょう。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer24000:
	hideonnpc "死神アンク#RZイベント_2"; //69673
	end;
OnTimer27000:
	stopnpctimer;
	hideoffnpc "#RZ移動_30"; //69829
	hideoffnpc "#RZ移動_31"; //69830
	end;
}
1@rev.gat,20,181,0	script	#モルス入口スタート	139,{/* 75060 */
OnStart:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#RZイベント_1")+ "::OnKilled";
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZイベント_1-2"))
	monster '@map$,38,180,"モルス・グール",3001,1,'@label$;
	monster '@map$,38,181,"モルス・グール",3001,1,'@label$;
	monster '@map$,38,182,"モルス・グール",3001,1,'@label$;
	monster '@map$,54,180,"モルス・グール",3001,1,'@label$;
	monster '@map$,54,181,"モルス・グール",3001,1,'@label$;
	monster '@map$,54,182,"モルス・グール",3001,1,'@label$;
	monster '@map$,70,180,"モルス・グール",3001,1,'@label$;
	monster '@map$,70,181,"モルス・グール",3001,1,'@label$;
	monster '@map$,70,182,"モルス・グール",3001,1,'@label$;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#RZイベント_1")+ "::OnKilled");
	if('@count <= 0) {
		hideoffnpc getmdnpcname("死神アンク#RZイベント_2"); //69673
		if('menu == 1) {
			hideonnpc getmdnpcname("教官長イグリド#入口"); //81075
			hideoffnpc getmdnpcname("教官長イグリド#入口奥"); //81075
		} else if('menu == 2) {
			hideonnpc getmdnpcname("キド#入口"); //81075
			hideoffnpc getmdnpcname("キド#入口奥"); //81075
		}
		donpcevent getmdnpcname("#RZイベント_1-2")+ "::OnStart"
	}
	end;
}
1@rev.gat,25,183,5	script	教官長イグリド#入口	751,{/* 75061 */
	mes "[イグリド]";
	mes "気を付けろ！";
	mes "敵が来ているぞ！";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer100:
	unittalk "イグリド : ふぅ。間に合ったようだな。";
	end;
OnTimer3100:
	donpcevent "#モルス入口スタート::OnStart";
	unittalk "イグリド : 兄……いや、司令官に許可はもらってきた。一緒に俺も行かせてくれ。";
	end;
OnTimer6100:
	stopnpctimer;
	unittalk "イグリド : ";	//?
	end;
}
1@rev.gat,25,183,5	script	キド#入口	884,{/* 75062 (hide)*/
	mes "[キド]";
	// 未調査
	close;
OnStart:
	initnpctimer;
	end;
OnTimer100:
	unittalk "キド : 間に合ったか。";
	end;
OnTimer3100:
	donpcevent "#モルス入口スタート::OnStart";
	unittalk "キド : リーンには伝えてきた。決戦の時が近づいている。俺も一緒に行かせてくれ。";
	end;
OnTimer6100:
	stopnpctimer;
	unittalk "キド : さっそく敵さんのお出ましか。気を付けろ！";
	end;
}
1@rev.gat,25,183,5	script	ヒシエ#入口	623,{/* 75063 (hide)*/}
1@rev.gat,60,184,5	script	教官長イグリド#入口奥	751,{/* 75064 (hide)*/
	mes "[イグリド]";
	mes "死神みてえな顔しやがって！";
	close;
}
1@rev.gat,60,184,5	script	キド#入口奥	884,{/* 75065 (hide)*/
	mes "[キド]";
	mes "目の前の敵に集中しろ。";
	close;
}
1@rev.gat,60,184,5	script	ヒシエ#入口奥	623,{/* 75066 (hide)*/}
1@rev.gat,64,181,4	script	死神アンク#RZイベント_2	3029,{/* 75067 (hide)*/}
1@rev.gat,34,126,4	script	死神アンク#RZイベント_3	3029,{/* 75068 (hide)*/
	end;
OnTalk1:
	unittalk "死神アンク : ……こんなものですかあなた方の力は？";
	end;
OnTalk2:
	unittalk "死神アンク : 失望しましたよ。モロク様の回復に必要なエネルギー源としては到底力不足ですね。";
	end;
OnTalk3:
	unittalk "死神アンク : ここから立ち去りなさい!!　もうあなた方に興味は無い。";
	end;
}

1@rev.gat,34,55,4	script	死神アンク#RZイベント_5	3029,{/* 75070 (hide)*/
	end;
OnTalk1:
	unittalk "死神アンク : ……こんなものですかあなた方の力は？";
	end;
OnTalk2:
	unittalk "死神アンク : 失望しましたよ。モロク様の回復に必要なエネルギー源としては到底力不足ですね。";
	end;
OnTalk3:
	unittalk "死神アンク : ここから立ち去りなさい!!　もうあなた方に興味は無い。";
	end;
}
1@rev.gat,112,48,4	script	死神アンク#RZイベント_6	3029,{/* 75071 (hide)*/}
1@rev.gat,63,181,0	warp	#RZ移動_30	8,8,1@rev.gat,103,177	//75072
1@rev.gat,47,181,0	warp	#RZ移動_31	8,8,1@rev.gat,103,177	//75073
1@rev.gat,31,181,0	warp	#RZ移動_32	8,8,1@rev.gat,103,177	//75074
1@rev.gat,104,176,0	script	#RZイベント_3	139,1,1,{/* 75075 (hide)*/
	initnpctimer;
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZイベント_1-2"))
	hideonnpc "#RZイベント_3"; //69840
	hideoffnpc "教官長イグリド#モロク"; //69841
	hideoffnpc "モロク??#RZ1"; //69725
	unittalk getcharid(3),strcharinfo(0)+ " : モロク!?";
	end;
OnTimer2500:
	donpcevent getmdnpcname("教官長イグリド#モロク")+ "::OnTalk1";
	end;
OnTimer5500:
	donpcevent getmdnpcname("教官長イグリド#モロク")+ "::OnTalk2";
	misceffect 60,""; //self
	end;
OnTimer6500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk1";
	end;
OnTimer9500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk2";
	end;
OnTimer12500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk3";
	end;
OnTimer15500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk4";
	misceffect 169, "モロク??#RZ1"; //69725
	end;
OnTimer18500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk5";
	misceffect 225, "モロク??#RZ1"; //69725
	end;
OnTimer21500:
	stopnpctimer;
	hideonnpc "モロク??#RZ1"; //69725
	monster getmdmapname("1@rev.gat"),111,178,"モロク??",2998,1,getmdnpcname("#RZイベント_3")+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	setnpctimer 22000;
	hideoffnpc "モロク??#RZ1"; //69725
	//hideoffnpc "教官長イグリド#モロク"; //69841
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk6";
	end;
OnTimer24500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk7";
	end;
OnTimer27500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk8";
	end;
OnTimer30500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk9";
	hideoffnpc "モロク??#RZ1"; //69725
	end;
OnTimer33500:
	donpcevent getmdnpcname("教官長イグリド#モロク")+ "::OnTalk3";
	end;
OnTimer36500:
	donpcevent getmdnpcname("教官長イグリド#モロク")+ "::OnTalk4";
	end;
OnTimer39500:
	hideonnpc "教官長イグリド#モロク"; //69841
	end;
OnTimer45500:
	announce "イグリド : ぐ、ぐわぁぁ！　なんだこれは……。", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	announce "キド : なんだこれは!!　くっ……！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer47500:
	stopnpctimer;
	hideoffnpc "#RZ移動_1"; //69551
	hideoffnpc "#RZ移動_2"; //69552
	hideoffnpc "#RZ移動_3"; //69553
	hideoffnpc "#RZ移動_4"; //69554
	end;
}
1@rev.gat,102,180,5	script	教官長イグリド#モロク	751,{/* 75076 */
	mes "[イグリド]";
	mes "気を付けろ！";
	mes "あのモロクがこんなにあっさり";
	mes "見つかるとは思えない。";
	close;
OnTalk1:
	unittalk "イグリド : おかしい……あれだけ慎重なモロクがこんなにあっさり見つかるとは。";
	end;
OnTalk2:
	unittalk "イグリド : ……本当にモロクか!?";
	end;
OnTalk3:
	unittalk "イグリド : あっ！　待て！　逃げやがったな！";
	end;
OnTalk4:
	unittalk "イグリド : 急いで追いかけるぞ。俺が先に行こう。";
	end;
}
1@rev.gat,102,180,5	script	キド#モロク前	884,{/* 75077 (hide)*/
	mes "[キド]";
	mes "気を付けろ！";
	mes "あのモロクがこんなにあっさり";
	mes "見つかるとは思えない。";
	close;
OnTalk1:
	unittalk "キド : おかしい……あれだけ慎重なモロクがこんなにあっさり見つかるとは。";
	end;
OnTalk2:
	unittalk "キド : ……本当にモロクか!?";
	end;
OnTalk3:
	unittalk "キド : ちっ、逃げやがったか。しかし……腑に落ちんな。";
	end;
OnTalk4:
	unittalk "キド : 仕方ない、追いかけよう。先に行く。";
	end;
}
1@rev.gat,102,180,5	script	ヒシエ#モロク前	623,{/* 75078 (hide)*/}
1@rev.gat,111,178,4	script	モロク??#RZ1	1916,{/* 75079 */
	end;
OnTalk1:
	unittalk "モロク?? : 良くここまで来たな、人間よ。";
	end;
OnTalk2:
	unittalk "モロク?? : だが、本当に私を阻止できると思っているのか？";
	end;
OnTalk3:
	unittalk "モロク?? : いいだろう。褒美にここまで来た事を後悔させてやろう。";
	end;
OnTalk4:
	unittalk "モロク?? : たとえ完全に力を回復していない私だとしても何の問題もない。";
	end;
OnTalk5:
	unittalk "モロク?? : 死の恐怖を与えてやる!!";
	end;
OnTalk6:
	unittalk "モロク?? : ふむ。回復していない状態ではこの程度の力しか出せぬか。";
	end;
OnTalk7:
	unittalk "モロク?? : まぁいいだろう。もう少し傷を癒すとしよう。";
	end;
OnTalk8:
	unittalk "モロク?? : おい人間共、喜べ。お前らはモロク様を倒したんだ。";
	end;
OnTalk9:
	unittalk "モロク?? : 戻って他の人間共と勝利の喜びでも分かち合ってきたらどうだ？　ククク。";
	end;
}

1@rev.gat,33,120,4	script	教官長イグリド#2戦目	751,{/* 75080 */}
1@rev.gat,33,120,4	script	キド#2戦目	884,{/* 75081 (hide)*/
	mes "[キド]";
	mes "くっ。なんだこれは。";
	mes "全く動けん。";
	close;
}
1@rev.gat,33,120,4	script	ヒシエ#2戦目	623,{/* 75082 (hide)*/}
1@rev.gat,33,120,0	script	#停止エフェクトRZ1	139,{/* 75083 (hide)*/
OnStart:
OnTimer9950:
	initnpctimer;
	misceffect 74;
	end;
OnStop:
	stopnpctimer;
	end;
}
1@rev.gat,33,108,0	script	#2部屋目デバフ_1	139,{/* 75084 (hide)*/}
1@rev.gat,33,112,0	script	#2部屋目デバフ_2	139,{/* 75085 (hide)*/}
1@rev.gat,33,116,0	script	#2部屋目デバフ_3	139,{/* 75086 (hide)*/}
1@rev.gat,33,120,0	script	#2部屋目デバフ_4	139,{/* 75087 (hide)*/}
1@rev.gat,33,124,0	script	#2部屋目デバフ_5	139,{/* 75088 (hide)*/}
1@rev.gat,33,128,0	script	#2部屋目デバフ_6	139,{/* 75089 (hide)*/}
1@rev.gat,33,131,0	script	#2部屋目デバフ_7	139,{/* 75090 (hide)*/}
1@rev.gat,34,120,0	script	#魂エフェクト用	139,{/* 75091 */}
1@rev.gat,35,119,0	script	#戦闘_1RZ1	139,2,2,{/* 75092 (hide)*/
	hideonnpc getmdnpcname("#戦闘_1RZ1"); //69796
	monster getmdmapname("1@rev.gat"),34,121,"イグリドの魂",3007,1,getmdnpcname("#戦闘_1RZ1")+ "::OnKilled1";
	donpcevent getmdnpcname("#戦闘_1RZ1_timer")+ "::OnStart";
	end;
OnSpawn:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#戦闘_1RZ1")+ "::OnKilled2";
	monster '@map$,38,180,"モルス・グール",3001,1,'@label$;
	monster '@map$,38,181,"モルス・グール",3001,1,'@label$;
	monster '@map$,38,182,"モルス・グール",3001,1,'@label$;
	monster '@map$,54,180,"モルス・グール",3001,1,'@label$;
	misceffect 124, "教官長イグリド#2戦目"; //69726
	misceffect 220, "教官長イグリド#2戦目"; //69726
	misceffect 368, "教官長イグリド#2戦目"; //69726
	misceffect 9, "#魂エフェクト用"; //69768
	end;
OnKilled:
	//25体以上でOK
}
1@rev.gat,35,119,0	script	#戦闘_1RZ1_timer	139,{/* 75093 */
OnStart:
	initnpctimer;
	//hideonnpc getmdnpcname("#戦闘_1RZ1"); //69796		//何故か2回hide
	misceffect 89, getmdnpcname("#RZ_EFFECT01"); //77455
	announce "死神アンク : ククク。まんまと引っかかるとは愚かな人たちですね。どうですか魂が肉体と分離される気分は。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer200:
	misceffect 196, getmdnpcname("#RZ_EFFECT01"); //77455
	end;
OnTimer1600:
	donpcevent getmdnpcname("#停止エフェクトRZ1")+ "::OnStart";
	end;
OnTimer1850:
	donpcevent getmdnpcname("#RZ_EFFECT01")+ "::OnStart";
	end;
OnTimer3700:
	announce "死神アンク : 先ほどのモロク様は私が作り出した幻影です。本当のモロク様は現在休息をとっています。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer8700:
	announce "死神アンク : しかし……そうまでしてモロク様に会いたいとは。人間であるあなた方がモロク様までたどり着けるとは思いませんが……。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer13700:
	announce "死神アンク : いいでしょう。あなた方がモロク様に会う資格があるかどうか、私が試して差し上げます。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer18700:
	announce "死神アンク : あまり私を失望させないでくださいよ？　力不足と判断したらここから立ち去っていただきますので……。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer23700:
	announce "死神アンク : ここの最深部にたどりつけないような者など、モロク様に会う資格はありません。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer28700:
	announce "死神アンク : さあ、あなた方の力、見せていただきましょう！　ククク!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer32700:
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer48700:
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer63700:
	announce "死神アンク : 私の部下達よ！　もっと恐怖と苦痛を与えるのです！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer80700:
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer93700:
	announce "死神アンク : まだ足りない……！　もっと恐怖を！　苦痛を！　味わわせるのです!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer108700:
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer125700:
	announce "死神アンク : ククク……。いいですよ。もっと抵抗しなさい！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer140700:
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer163700:
	announce "私の見込んだ通り、力ある者のようですね。ククク……面白い！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer188700:
	donpcevent getmdnpcname("#戦闘_1RZ1")+ "::OnSpawn";
	end;
OnTimer215700:
	if('@count) {
		//fail
	}
	else
		announce "死神アンク : ククク……なかなかしぶといですね！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer217700:
	announce "死神アンク : だが……いつまで続きますかね。ククク！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer223700:
	donpcevent getmdnpcname("#RZ_EFFECT01"); //77455
	donpcevent getmdnpcname("#停止エフェクトRZ1"); //69729
	hideonnpc "#2部屋目デバフ_1"; //69730
	hideonnpc "#2部屋目デバフ_2"; //69731
	hideonnpc "#2部屋目デバフ_3"; //69468
	hideonnpc "#2部屋目デバフ_4"; //69732
	hideonnpc "#2部屋目デバフ_5"; //69765
	hideonnpc "#2部屋目デバフ_6"; //69766
	hideonnpc "#2部屋目デバフ_7"; //69767
	hideoffnpc "#RZ移動_5"; //69555
	hideoffnpc "#RZ移動_6"; //69556
	hideoffnpc "#RZ移動_7"; //69557
	hideoffnpc "#RZ移動_8"; //69561
	end;
}
1@rev.gat,34,47,0	script	#戦闘_2RZ1	139,1,1,{/* 75094 (hide)*/
	hideonnpc getmdnpcname("#戦闘_2RZ1"); //69796
	donpcevent getmdnpcname("#戦闘_2RZ1_timer")+ "::OnStart";
	end;
OnSpawn:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#戦闘_1RZ1")+ "::OnKilled2";
	monster '@map$,38,180,"モルス・グール",3001,1,'@label$;
	monster '@map$,38,181,"モルス・グール",3001,1,'@label$;
	monster '@map$,38,182,"モルス・グール",3001,1,'@label$;
	monster '@map$,54,180,"モルス・グール",3001,1,'@label$;
	misceffect 124, "教官長イグリド#2戦目"; //69726
	misceffect 220, "教官長イグリド#2戦目"; //69726
	misceffect 368, "教官長イグリド#2戦目"; //69726
	misceffect 9, "#魂エフェクト用"; //69768
	end;
OnKilled:
	//6体以下でNG
}
1@rev.gat,34,47,0	script	#戦闘_2RZ1_timer	139,{/* 75095 */
OnStart:
	initnpctimer;
	misceffect 89, getmdnpcname("#RZ_EFFECT02"); //77455
	announce "死神アンク : 私の部下を倒して解放されたと思っているようですが、この空間はモロク様の意思により進化しています。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer500:
	donpcevent getmdnpcname("#RZ_EFFECT02")+ "::OnStart";
	end;
OnTimer4000:
	announce "死神アンク : 並大抵の実力では抜け出せませんよ？　ククク。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer4000:
	announce "死神アンク : しかし……お強い。やはりあなた方の魂はモロク様の回復に役立ちそうですね。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer9000:
	announce "死神アンク : その魂と苦痛を生贄にして差し上げましょう。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer14000:
	announce "死神アンク : あなた方の魂はモロク様の血となり肉となるのです。これは光栄な事ですよ！　ククク!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer19000:
	announce "死神アンク : さあ、行きなさい私の部下達よ!!　あの者たちの肉体と魂を引き裂き、モロク様に捧げるのです！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer24000:
	announce "死神アンク : もちろん、先ほどと同様、力不足と判断したらここから立ち去っていただきますがね……。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer29000:
	announce "死神アンク : ククク……さぁ存分にその力を発揮してください！　モロク様のために!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer33000:
	donpcevent getmdnpcname("#戦闘_2RZ1")+ "::OnSpawn";
	end;
OnTimer49000:
	announce "死神アンク : この心地よい感覚。……素晴らしい!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer74500:
	announce "死神アンク : モロク様に貢献出来る事、光栄に思いなさい！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer99500:
	announce "死神アンク : もっとです！もっと力を!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer139500:
	announce "死神アンク : いいですよ。クック。もっと足掻きなさい……！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer184000:
	announce "死神アンク : 死への恐怖や苦悩がモロク様の力になるのです！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer209000:
	hideoffnpc "死神アンク#RZイベント_5"; //69824
	donpcevent "死神アンク#RZイベント_5::OnTalk1";
	end;
OnTimer212000:
	donpcevent "死神アンク#RZイベント_5::OnTalk2";
	end;
OnTimer215000:
	donpcevent "死神アンク#RZイベント_5::OnTalk3";
	end;
OnTimer218000:
	hideonnpc "死神アンク#RZイベント_5"; //69824
	end;
OnTimer223000:
	hideoffnpc "#RZ移動_13a"; //70387
	hideoffnpc "#RZ移動_14a"; //70388
	hideoffnpc "#RZ移動_15a"; //70389
	hideoffnpc "#RZ移動_16a"; //70437
	end;
}
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
1@rev.gat,28,125,0	warp	#RZ移動_5a	5,5,moro_cav.gat,59,63
1@rev.gat,28,114,0	warp	#RZ移動_6a	5,5,moro_cav.gat,59,63
1@rev.gat,39,114,0	warp	#RZ移動_7a	5,5,moro_cav.gat,59,63
1@rev.gat,39,125,0	warp	#RZ移動_8a	5,5,moro_cav.gat,59,63

1@rev.gat,28,53,0	warp	#RZ移動_13a	5,5,moro_cav.gat,59,63
1@rev.gat,28,42,0	warp	#RZ移動_14a	5,5,moro_cav.gat,59,63
1@rev.gat,39,42,0	warp	#RZ移動_15a	5,5,moro_cav.gat,59,63
1@rev.gat,39,53,0	warp	#RZ移動_16a	5,5,moro_cav.gat,59,63
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





hideonnpc "#RZイベント_3_0e8"; //74591
hideoffnpc "キド#モロク前_0e8"; //74593
hideoffnpc "モロク??#RZ1_0e8"; //74595
misceffect 169, "モロク??#RZ1_0e8"; //74595
misceffect 225, "モロク??#RZ1_0e8"; //74595
hideonnpc "モロク??#RZ1_0e8"; //74595
@spawn(type: BL_MOB, ID: 13788, speed: 200, option: 0, view: 2998, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モロク??")
@nomalattack(src: "2998:モロク??:0e81@rev.gat"(13788), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123187852)
@nomalattack(src: "2998:モロク??:0e81@rev.gat"(13788), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 128607)
@nomalattack(src: "2998:モロク??:0e81@rev.gat"(13788), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2624)
@mob_defeated("2998:モロク??:0e81@rev.gat"(13788))
@update_status(BaseExp: 276690)
@update_status(JobExp: 0)
hideoffnpc "モロク??#RZ1_0e8"; //74595
hideoffnpc "キド#モロク前_0e8"; //74593
hideonnpc "モロク??#RZ1_0e8"; //74595
hideonnpc "キド#モロク前_0e8"; //74593
announce "キド : なんだこれは!!　くっ……！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
hideoffnpc "#RZ移動_1_0e8"; //71953
hideoffnpc "#RZ移動_2_0e8"; //76956
hideoffnpc "#RZ移動_3_0e8"; //76957
hideoffnpc "#RZ移動_4_0e8"; //76958
@mapmoved(from: 0e81@rev.gat(104, 176), map: 0e81@rev.gat(33, 117))
@changeoption(id: 4631724, opt1: 0, opt2: 0, option: 0, karma: 0)
0e81@rev.gat,33,108,0	script	#2部屋目デバフ_1_0e8	139,{/* 74600 (hide)*/}
0e81@rev.gat,33,112,0	script	#2部屋目デバフ_2_0e8	139,{/* 74601 (hide)*/}
0e81@rev.gat,33,116,0	script	#2部屋目デバフ_3_0e8	139,{/* 74602 (hide)*/}
0e81@rev.gat,35,119,0	script	#戦闘_1RZ1_0e8	139,{/* 74608 */}
0e81@rev.gat,35,119,0	script	#戦闘_1RZ1_timer_0e8	139,{/* 74609 */}
0e81@rev.gat,28,114,0	script	#RZ移動_6_0e8	45,{/* 76960 (hide)*/}
0e81@rev.gat,39,114,0	script	#RZ移動_7_0e8	45,{/* 76961 (hide)*/}
0e81@rev.gat,28,114,0	script	#RZ移動_6a_0e8	45,{/* 76964 (hide)*/}
0e81@rev.gat,39,114,0	script	#RZ移動_7a_0e8	45,{/* 72584 (hide)*/}
0e81@rev.gat,34,120,0	script	#RZメモリアルエフェクト	139,{/* 74572 (hide)*/}
0e81@rev.gat,34,126,4	script	死神アンク#RZイベント_3	3029,{/* 74584 (hide)*/}
0e81@rev.gat,33,120,4	script	教官長イグリド#2戦目_0e	751,{/* 74596 (hide)*/}
0e81@rev.gat,33,120,4	script	キド#2戦目_0e8	884,{/* 74597 */}
0e81@rev.gat,33,120,4	script	ヒシエ#2戦目_0e8	623,{/* 74598 (hide)*/}
0e81@rev.gat,33,120,0	script	#停止エフェクトRZ1_0e8	139,{/* 74599 (hide)*/}
0e81@rev.gat,33,120,0	script	#2部屋目デバフ_4_0e8	139,{/* 74603 (hide)*/}
0e81@rev.gat,33,124,0	script	#2部屋目デバフ_5_0e8	139,{/* 74604 (hide)*/}
0e81@rev.gat,33,128,0	script	#2部屋目デバフ_6_0e8	139,{/* 74605 (hide)*/}
0e81@rev.gat,33,131,0	script	#2部屋目デバフ_7_0e8	139,{/* 74606 (hide)*/}
0e81@rev.gat,34,120,0	script	#魂エフェクト用_0e8	139,{/* 74607 */}
0e81@rev.gat,28,125,0	script	#RZ移動_5_0e8	45,{/* 76959 (hide)*/}
0e81@rev.gat,39,125,0	script	#RZ移動_8_0e8	45,{/* 76962 (hide)*/}
0e81@rev.gat,28,125,0	script	#RZ移動_5a_0e8	45,{/* 76963 (hide)*/}
0e81@rev.gat,39,125,0	script	#RZ移動_8a_0e8	45,{/* 72585 (hide)*/}
@spawn(type: BL_MOB, ID: 13928, speed: 800, option: 0, view: 1395, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "イエロークリスタル")
@spawn(type: BL_MOB, ID: 14323, speed: 800, option: 0, view: 1396, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "グリーンクリスタル")
@spawn(type: BL_MOB, ID: 21357, speed: 800, option: 0, view: 1397, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "レッドクリスタル")
@spawn(type: BL_MOB, ID: 24499, speed: 800, option: 0, view: 1398, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "ブルークリスタル")
@spawn(type: BL_MOB, ID: 44621, speed: 195, option: 0, view: 3007, pos: "0e81@rev.gat"(34, 121), dir: 0, name: "キドの魂")
misceffect 196, "#RZメモリアルエフェクト"; //74572
hideonnpc "#戦闘_1RZ1_0e8"; //74608
hideonnpc "#戦闘_1RZ1_0e8"; //74608
misceffect 89, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : ククク。まんまと引っかかるとは愚かな人たちですね。どうですか魂が肉体と分離される気分は。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 330800)
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 526)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 526)
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 526)
announce "死神アンク : 先ほどのモロク様は私が作り出した幻影です。本当のモロク様は現在休息をとっています。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@mob_defeated("1395:イエロークリスタル:0e81@rev.gat"(13928))
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 1008)
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 527)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 531)
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 530)
@mob_defeated("1397:レッドクリスタル:0e81@rev.gat"(21357))
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : しかし……そうまでしてモロク様に会いたいとは。人間であるあなた方がモロク様までたどり着けるとは思いませんが……。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
getitem 728, 1;
@nomalattack(src: ""(4631724), dst: 44621, damage: 1, sDelay: 260, dDelay: 440, aDelay: 3024)
misceffect 196, "#RZメモリアルエフェクト"; //74572
getitem 757, 1;
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : いいでしょう。あなた方がモロク様に会う資格があるかどうか、私が試して差し上げます。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 4039)
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 523)
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@mob_defeated("1398:ブルークリスタル:0e81@rev.gat"(24499))
misceffect 196, "#RZメモリアルエフェクト"; //74572
getitem 22681, 1;
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 2394)
announce "死神アンク : あまり私を失望させないでくださいよ？　力不足と判断したらここから立ち去っていただきますので……。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 524)
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("1396:グリーンクリスタル:0e81@rev.gat"(14323))
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : ここの最深部にたどりつけないような者など、モロク様に会う資格はありません。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : さあ、あなた方の力、見せていただきましょう！　ククク!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@spawn(type: BL_MOB, ID: 22880, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 24268, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
mes "[キド]";
mes "くっ。なんだこれは。";
mes "全く動けん。";
close;
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 24159, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 13702, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123383851)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 648, sDelay: 824, dDelay: 400, tick: 123384775)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2627)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 7919)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2622)
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@spawn(type: BL_MOB, ID: 8419, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123394643)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 780, sDelay: 824, dDelay: 400, aDelay: 2623)
@spawn(type: BL_MOB, ID: 20721, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 28698, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 17893, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 6203)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 6455)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 661, sDelay: 824, dDelay: 400, tick: 123400954)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 4590)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2632)
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : 私の部下達よ！　もっと恐怖と苦痛を与えるのです！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@spawn(type: BL_MOB, ID: 18829, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(17893), dst: 4631724, damage: 755, sDelay: 824, dDelay: 400, tick: 123409562)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18829), dst: 4631724, damage: 784, sDelay: 824, dDelay: 400, tick: 123410445)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2626)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(17893), dst: 4631724, damage: 831, sDelay: 824, dDelay: 400, aDelay: 2625)
@spawn(type: BL_MOB, ID: 24858, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(25, 119), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20721), dst: 4631724, damage: 865, sDelay: 824, dDelay: 400, tick: 123412292)
@spawn(type: BL_MOB, ID: 18449, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 19412, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: ""(4631724), dst: 44621, damage: 1, sDelay: 260, dDelay: 440, aDelay: 54248)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123421277)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(19412), dst: 4631724, damage: 806, sDelay: 824, dDelay: 400, tick: 123421716)
@nomalattack(src: ""(4631724), dst: 19412, damage: 77, sDelay: 260, dDelay: 440, aDelay: 1280)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@spawn(type: BL_MOB, ID: 21292, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 21378, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 21418, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 21453, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(19412), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 3652)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 4806)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 3277)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 20762)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(13702), dst: 4631724, damage: 767, sDelay: 824, dDelay: 400, aDelay: 30719)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(17893), dst: 4631724, damage: 698, sDelay: 824, dDelay: 400, aDelay: 19378)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18829), dst: 4631724, damage: 719, sDelay: 824, dDelay: 400, aDelay: 21120)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20721), dst: 4631724, damage: 666, sDelay: 824, dDelay: 400, aDelay: 19273)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 983, sDelay: 824, dDelay: 400, aDelay: 36291)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24159), dst: 4631724, damage: 961, sDelay: 824, dDelay: 400, tick: 123431565)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 801, sDelay: 824, dDelay: 400, aDelay: 30718)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28698), dst: 4631724, damage: 780, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 706, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(17893), dst: 4631724, damage: 754, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18829), dst: 4631724, damage: 744, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20721), dst: 4631724, damage: 802, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 753, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24159), dst: 4631724, damage: 1060, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 890, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18449), dst: 4631724, damage: 1067, sDelay: 824, dDelay: 400, tick: 123434591)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24858), dst: 4631724, damage: 883, sDelay: 824, dDelay: 400, tick: 123434802)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(19412), dst: 4631724, damage: 889, sDelay: 824, dDelay: 400, aDelay: 9875)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(17893), dst: 4631724, damage: 939, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18829), dst: 4631724, damage: 867, sDelay: 824, dDelay: 400, aDelay: 2626)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20721), dst: 4631724, damage: 689, sDelay: 824, dDelay: 400, aDelay: 2626)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 1004, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24159), dst: 4631724, damage: 811, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 750, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18449), dst: 4631724, damage: 941, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28698), dst: 4631724, damage: 880, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24858), dst: 4631724, damage: 1155, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(21418), dst: 4631724, damage: 1156, sDelay: 824, dDelay: 400, tick: 123437615)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(19412), dst: 4631724, damage: 1174, sDelay: 824, dDelay: 400, aDelay: 2624)
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : まだ足りない……！　もっと恐怖を！　苦痛を！　味わわせるのです!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@spawn(type: BL_MOB, ID: 13524, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(13702), dst: 4631724, damage: 851, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(17893), dst: 4631724, damage: 801, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18829), dst: 4631724, damage: 801, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20721), dst: 4631724, damage: 816, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(22880), dst: 4631724, damage: 1053, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24159), dst: 4631724, damage: 820, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(24268), dst: 4631724, damage: 1001, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(21378), dst: 4631724, damage: 1038, sDelay: 824, dDelay: 400, tick: 123439527)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(18449), dst: 4631724, damage: 1048, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28698), dst: 4631724, damage: 952, sDelay: 824, dDelay: 400, aDelay: 2624)
@spawn(type: BL_MOB, ID: 12568, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(12568), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123443007)
@spawn(type: BL_MOB, ID: 12662, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(24159))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(24268))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(13702))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(20721))
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(12568), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 3883)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(28698))
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(12568), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 5500)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(22880))
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(12662), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123453693)
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@spawn(type: BL_MOB, ID: 31374, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 31405, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 31590, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(25, 119), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 13295, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 31426, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(34, 111), dir: 0, name: "モルス・グール")
@nomalattack(src: ""(4631724), dst: 44621, damage: 1, sDelay: 260, dDelay: 440, aDelay: 36569)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(8419))
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : ククク……。いいですよ。もっと抵抗しなさい！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@spawn(type: BL_MOB, ID: 23582, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 19592, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 20418, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(17893))
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(31405), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123483259)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(31590), dst: 4631724, damage: 890, sDelay: 824, dDelay: 400, tick: 123483259)
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@nomalattack(src: ""(35795), dst: 4631724, damage: 847, sDelay: 824, dDelay: 400, tick: 123484422)
@spawn(type: BL_MOB, ID: 26054, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 26798, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20418), dst: 4631724, damage: 841, sDelay: 824, dDelay: 400, tick: 123484735)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 35795, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20418), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2855)
@spawn(type: BL_MOB, ID: 23503, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(18829))
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20418), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2629)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(19412))
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(18449))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(24858))
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(13524))
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123504296)
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(12568))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(31590))
announce "死神アンク : 私の見込んだ通り、力ある者のようですね。ククク……面白い！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@spawn(type: BL_MOB, ID: 19924, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 20383, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 5249)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(31374))
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(23503), dst: 4631724, damage: 715, sDelay: 824, dDelay: 400, tick: 123511098)
@nomalattack(src: ""(28897), dst: 4631724, damage: 951, sDelay: 824, dDelay: 400, tick: 123511204)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 840, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20383), dst: 4631724, damage: 985, sDelay: 824, dDelay: 400, tick: 123512441)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(31426))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(23582))
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 19975, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(23503), dst: 4631724, damage: 674, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(28897), dst: 4631724, damage: 845, sDelay: 824, dDelay: 400, aDelay: 2625)
@spawn(type: BL_MOB, ID: 22076, speed: 200, option: 0, view: 3003, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・アーチャー")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 654, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20383), dst: 4631724, damage: 936, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(23503), dst: 4631724, damage: 664, sDelay: 824, dDelay: 400, aDelay: 2625)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(31405))
@nomalattack(src: ""(28897), dst: 4631724, damage: 988, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 928, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20383), dst: 4631724, damage: 879, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(23503), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(28897), dst: 4631724, damage: 919, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 731, sDelay: 824, dDelay: 400, tick: 123519245)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(19592))
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 759, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 684, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20383), dst: 4631724, damage: 959, sDelay: 824, dDelay: 400, aDelay: 2625)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(20418))
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 629, sDelay: 824, dDelay: 400, aDelay: 837)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(35795))
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(23503), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2622)
@nomalattack(src: ""(28897), dst: 4631724, damage: 676, sDelay: 824, dDelay: 400, aDelay: 2623)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 851, sDelay: 824, dDelay: 400, aDelay: 840)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(13295))
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 796, sDelay: 824, dDelay: 400, aDelay: 2623)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20383), dst: 4631724, damage: 649, sDelay: 824, dDelay: 400, aDelay: 2623)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 858, sDelay: 824, dDelay: 400, aDelay: 865)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 28897, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(23503), dst: 4631724, damage: 721, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 870, sDelay: 824, dDelay: 400, aDelay: 944)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28897), dst: 4631724, damage: 828, sDelay: 824, dDelay: 400, aDelay: 3048)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 880, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 957, sDelay: 824, dDelay: 400, aDelay: 2627)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 945)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26054), dst: 4631724, damage: 935, sDelay: 824, dDelay: 400, tick: 123526345)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20383), dst: 4631724, damage: 795, sDelay: 824, dDelay: 400, aDelay: 3511)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(23503), dst: 4631724, damage: 735, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 666, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(28897), dst: 4631724, damage: 980, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(19924), dst: 4631724, damage: 872, sDelay: 824, dDelay: 400, tick: 123527478)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 691, sDelay: 824, dDelay: 400, aDelay: 945)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26798), dst: 4631724, damage: 684, sDelay: 824, dDelay: 400, aDelay: 3529)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(26054), dst: 4631724, damage: 672, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(20383), dst: 4631724, damage: 683, sDelay: 824, dDelay: 400, aDelay: 2624)
@spawn(type: BL_MOB, ID: 19939, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(44, 125), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2124)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
misceffect 124, "キド#2戦目_0e8"; //74597
misceffect 220, "キド#2戦目_0e8"; //74597
misceffect 368, "キド#2戦目_0e8"; //74597
misceffect 9, "#魂エフェクト用_0e8"; //74607
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123534412)
@spawn(type: BL_MOB, ID: 26184, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 33209, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: ""(34745), dst: 4631724, damage: 775, sDelay: 824, dDelay: 400, aDelay: 841)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(26054))
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(33209), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123536849)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 944, sDelay: 824, dDelay: 400, aDelay: 929)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 845)
@spawn(type: BL_MOB, ID: 3775, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 788, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: ""(34745), dst: 4631724, damage: 681, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@spawn(type: BL_MOB, ID: 34745, speed: 200, option: 0, view: 3003, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・アーチャー")
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 946)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(3775), dst: 4631724, damage: 833, sDelay: 824, dDelay: 400, tick: 123544746)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 842)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 828)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 845)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(3775), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2613)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(3775), dst: 4631724, damage: 948, sDelay: 824, dDelay: 400, aDelay: 2626)
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(19924))
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 836, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 647, sDelay: 824, dDelay: 400, aDelay: 838)
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 927, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(3775), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2622)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 845)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 827)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 935, sDelay: 824, dDelay: 400, aDelay: 829)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 828)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 833)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 831)
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(3775), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2633)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@nomalattack(src: "3001:モルス・グール:0e81@rev.gat"(3775), dst: 4631724, damage: 703, sDelay: 824, dDelay: 400, aDelay: 2622)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 844)
@nomalattack(src: "3003:モルス・アーチャー:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 843)
misceffect 196, "#RZメモリアルエフェクト"; //74572
@spawn(type: BL_MOB, ID: 26657, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(23503))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(28897))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(26798))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(19939))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(19975))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(20383))
@mob_defeated("3003:モルス・アーチャー:0e81@rev.gat"(22076))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(33209))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(26184))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(26657))
@mob_defeated("3001:モルス・グール:0e81@rev.gat"(3775))
@mob_defeated("3003:モルス・アーチャー:0e81@rev.gat"(34745))
misceffect 74, "#停止エフェクトRZ1_0e8"; //74599
announce "死神アンク : ククク……なかなかしぶといですね！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //74572
announce "死神アンク : だが……いつまで続きますかね。ククク！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
misceffect 196, "#RZメモリアルエフェクト"; //74572
hideonnpc "#2部屋目デバフ_1_0e8"; //74600
hideonnpc "#2部屋目デバフ_2_0e8"; //74601
hideonnpc "#2部屋目デバフ_3_0e8"; //74602
hideonnpc "#2部屋目デバフ_4_0e8"; //74603
hideonnpc "#2部屋目デバフ_5_0e8"; //74604
hideonnpc "#2部屋目デバフ_6_0e8"; //74605
hideonnpc "#2部屋目デバフ_7_0e8"; //74606
hideoffnpc "#RZ移動_5_0e8"; //76959
hideoffnpc "#RZ移動_6_0e8"; //76960
hideoffnpc "#RZ移動_7_0e8"; //76961
hideoffnpc "#RZ移動_8_0e8"; //76962
0e81@rev.gat,28,125,0	warp	#RZ移動_5_0e8	2,2,0e81@rev.gat,31,50 //76959 from_pos=(29, 124)
@changeoption(id: 4631724, opt1: 0, opt2: 0, option: 0, karma: 0)
0e81@rev.gat,34,48,0	script	#RZメモリアルエフェクト	139,{/* 74573 (hide)*/}
0e81@rev.gat,34,55,4	script	死神アンク#RZイベント_5	3029,{/* 74586 (hide)*/}
0e81@rev.gat,34,47,0	script	#戦闘_2RZ1_0e8	139,{/* 74610 */}
0e81@rev.gat,34,47,0	script	#戦闘_2RZ1_timer_0e8	139,{/* 74611 */}
0e81@rev.gat,28,53,0	script	#RZ移動_13a_0e8	45,{/* 72590 (hide)*/}
0e81@rev.gat,28,42,0	script	#RZ移動_14a_0e8	45,{/* 72591 (hide)*/}
0e81@rev.gat,39,42,0	script	#RZ移動_15a_0e8	45,{/* 76965 (hide)*/}
0e81@rev.gat,39,53,0	script	#RZ移動_16a_0e8	45,{/* 76966 (hide)*/}
0e81@rev.gat,28,53,0	script	#RZ移動_13_0e8	45,{/* 76967 (hide)*/}
0e81@rev.gat,28,42,0	script	#RZ移動_14_0e8	45,{/* 76968 (hide)*/}
0e81@rev.gat,39,42,0	script	#RZ移動_15_0e8	45,{/* 76969 (hide)*/}
0e81@rev.gat,39,53,0	script	#RZ移動_16_0e8	45,{/* 76970 (hide)*/}
