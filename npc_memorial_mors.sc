@spawn(type: BL_MOB, ID: 40236, speed: 200, option: 0, view: 2998, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モロク??")
@nomalattack(src: "2998:モロク??:0qj1@rev.gat"(40236), dst: , damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(), dst: 40236, damage: 64, sDelay: 260, dDelay: 440, tick: 432013023)

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
}
1@rev.gat,34,120,0	script	#RZメモリアルエフェクト	139,{/* 75056 (hide)*/}
1@rev.gat,34,48,0	script	#RZメモリアルエフェクト	139,{/* 75057 (hide)*/}
1@rev.gat,31,181,0	script	#RZイベント_1	139,{/* 75058 (hide)*/
OnStart:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#RZイベント_1")+ "::OnKilled";
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
		hideoffnpc getmdnpcname("教官長イグリド#入口奥_0"); //81075
		donpcevent getmdnpcname("#RZイベント_1-2")+ "::OnStart"
	}
	end;
}
1@rev.gat,31,181,0	script	#RZイベント_1-2	139,{/* 75059 */
OnStart:
	initnpctimer;
	announce "死神アンク : また会いましたね。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer3000:
	announce "イグリド : モロクはどこだ！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
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
	announce "イグリド : なんだと！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
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
	hideoffnpc "#RZ移動_30_0qj"; //69829
	hideoffnpc "#RZ移動_31_0qj"; //69830
	end;
}
1@rev.gat,20,181,0	script	#モルス入口スタート	139,{/* 75060 */
select("イグリド:キド:ヒシエ:誰もいない")
mes "‐仲間がかけつけた-";
close;
}
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
1@rev.gat,104,176,0	script	#RZイベント_3	139,1,1,{/* 75075 (hide)*/
	initnpctimer;
	hideonnpc "#RZイベント_3_0qj"; //69840
	hideoffnpc "教官長イグリド#モロク_0"; //69841
	hideoffnpc "モロク??#RZ1_0qj"; //69725
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
	misceffect 169, "モロク??#RZ1_0qj"; //69725
	end;
OnTimer18500:
	donpcevent getmdnpcname("モロク??#RZ1")+ "::OnTalk5";
	misceffect 225, "モロク??#RZ1_0qj"; //69725
	end;
OnTimer21500:
	stopnpctimer;
	hideonnpc "モロク??#RZ1_0qj"; //69725
	monster getmdmapname("1@rev.gat"),111,178,"モロク??",2998,1,getmdnpcname("#RZイベント_3")+ "::OnKilled";
	end;
OnKilled:
	startnpctimer;
	hideoffnpc "モロク??#RZ1_0qj"; //69725
	hideoffnpc "教官長イグリド#モロク_0"; //69841
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
	hideoffnpc "モロク??#RZ1_0qj"; //69725
	end;
OnTimer33500:
	donpcevent getmdnpcname("教官長イグリド#モロク")+ "::OnTalk3";
	end;
OnTimer36500:
	donpcevent getmdnpcname("教官長イグリド#モロク")+ "::OnTalk4";
	end;
OnTimer39500:
	hideonnpc "教官長イグリド#モロク_0"; //69841
	end;
OnTimer45500:
	announce "イグリド : ぐ、ぐわぁぁ！　なんだこれは……。", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer47500:
	stopnpctimer;
	hideoffnpc "#RZ移動_1_0qj"; //69551
	hideoffnpc "#RZ移動_2_0qj"; //69552
	hideoffnpc "#RZ移動_3_0qj"; //69553
	hideoffnpc "#RZ移動_4_0qj"; //69554
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
1@rev.gat,102,180,5	script	キド#モロク前	884,{/* 75077 (hide)*/}
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
1@rev.gat,35,119,0	script	#戦闘_1RZ1	139,2,2,{/* 75092 (hide)*/
	hideonnpc getmdnpcname("#戦闘_1RZ1_0qj"); //69796
	donpcevent getmdnpcname("#戦闘_1RZ1_timer")+ "::OnStart";
	end;
}
1@rev.gat,35,119,0	script	#戦闘_1RZ1_timer	139,{/* 75093 */
misceffect 89, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : ククク。まんまと引っかかるとは愚かな人たちですね。どうですか魂が肉体と分離される気分は。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : 先ほどのモロク様は私が作り出した幻影です。本当のモロク様は現在休息をとっています。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : しかし……そうまでしてモロク様に会いたいとは。人間であるあなた方がモロク様までたどり着けるとは思いませんが……。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : いいでしょう。あなた方がモロク様に会う資格があるかどうか、私が試して差し上げます。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : あまり私を失望させないでくださいよ？　力不足と判断したらここから立ち去っていただきますので……。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : ここの最深部にたどりつけないような者など、モロク様に会う資格はありません。", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : さあ、あなた方の力、見せていただきましょう！　ククク!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 37884, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 37983, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 37973, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 37917, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 39730, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 39496, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 39190, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 39467, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
announce "死神アンク : 私の部下達よ！　もっと恐怖と苦痛を与えるのです！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 39580, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 39086, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 39630, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 39899, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(25, 116), dir: 4, name: "モルス・グール")
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 40387, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 42252, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
@spawn(type: BL_MOB, ID: 1215, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 37232, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : まだ足りない……！　もっと恐怖を！　苦痛を！　味わわせるのです!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 46126, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 47198, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 9687, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 31206, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 36970, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 38404, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 36796, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : ククク……。いいですよ。もっと抵抗しなさい！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 16696, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 17524, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 17388, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 18560, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 38621, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 38560, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 38687, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
@spawn(type: BL_MOB, ID: 38764, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(25, 119), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
@spawn(type: BL_MOB, ID: 38695, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : 私の見込んだ通り、力ある者のようですね。ククク……面白い！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 42600, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 42651, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 42898, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 43094, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 43182, speed: 200, option: 0, view: 3003, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・アーチャー")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 124, "教官長イグリド#2戦目_0q"; //69726
misceffect 220, "教官長イグリド#2戦目_0q"; //69726
misceffect 368, "教官長イグリド#2戦目_0q"; //69726
misceffect 9, "#魂エフェクト用_0qj"; //69768
@spawn(type: BL_MOB, ID: 44259, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 44346, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 44189, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
@spawn(type: BL_MOB, ID: 9666, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "モルス・グール")
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : ククク……なかなかしぶといですね！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
announce "死神アンク : だが……いつまで続きますかね。ククク！", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 196, "#RZメモリアルエフェクト"; //77455
misceffect 74, "#停止エフェクトRZ1_0qj"; //69729
misceffect 196, "#RZメモリアルエフェクト"; //77455
hideonnpc "#2部屋目デバフ_1_0qj"; //69730
hideonnpc "#2部屋目デバフ_2_0qj"; //69731
hideonnpc "#2部屋目デバフ_3_0qj"; //69468
hideonnpc "#2部屋目デバフ_4_0qj"; //69732
hideonnpc "#2部屋目デバフ_5_0qj"; //69765
hideonnpc "#2部屋目デバフ_6_0qj"; //69766
hideonnpc "#2部屋目デバフ_7_0qj"; //69767
hideoffnpc "#RZ移動_5_0qj"; //69555
hideoffnpc "#RZ移動_6_0qj"; //69556
hideoffnpc "#RZ移動_7_0qj"; //69557
hideoffnpc "#RZ移動_8_0qj"; //69561
}
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
