1@tcamp.gat,0,0,0	script	ThorMilitaryBaseControl1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;

	for(set '@i,1; '@i <= 17; set '@i,'@i+1)
		donpcevent getmdnpcname("監視塔#監視" +'@i+ "_002")+"::OnStart";
	hideonnpc getmdnpcname("マラム#ロック装置1_021");
	hideonnpc getmdnpcname("マラム#ロック装置2_026");
	hideonnpc getmdnpcname("マラム#ロック装置3_029");
	hideonnpc getmdnpcname("マラム#ロック装置4_033");
	end;
}

1@tcamp.gat,106,237,3	script	マラム#基地1_034	10376,{/* 79402 */
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "首尾よく侵入できましたね。";
	mes "ダンデロンによれば、基地内で武器の";
	mes "横流しが行われていたようです。";
	next;
	mes "[マラム]";
	mes "横流しの現場を確認するか";
	mes "可能であれば、証拠となるものを";
	mes "手に入れたいところです。";
	mes "違法な取引を中止させないと。";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "基地内には、監視塔が設置されています。";
	mes "近づくと警報が鳴って";
	mes "警備兵が集まってきますから";
	mes "注意して進みましょう。";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
}
1@tcamp.gat,120,228,3	script	監視塔#監視1_002	10248,7,7,{/* 77176 */
OnTouch:
	stopnpctimer;
	unittalk "監視塔 : 不審者を感知!!";
	sleep 2000;
	announce "施設放送 : 不審者を探知！　担当の警備兵は現場に急行せよ！", 0x9, 0xff0000;
	sleep 4000;
	monster getmdmapname("1@tcamp.gat"),121,229,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),120,228,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),119,228,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),119,228,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),121,228,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),122,228,"基地の兵士",21309,1;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 8;
	end;
}
1@tcamp.gat,135,228,3	script	監視塔#監視2_003	10248,7,7,{/* 77177 */
OnTouch:
	stopnpctimer;
	unittalk "監視塔 : 不審者を感知!!";
	sleep 2000;
	announce "施設放送 : 不審者を探知！　担当の警備兵は現場に急行せよ！", 0x9, 0xff0000;
	sleep 4000;
	monster getmdmapname("1@tcamp.gat"),135,227,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),133,226,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),137,228,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),135,228,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),135,228,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),136,228,"基地の兵士",21309,1;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 8;
	end;
}
1@tcamp.gat,152,133,3	script	監視塔#監視3_004	10248,{/* 77178 */}
1@tcamp.gat,167,133,3	script	監視塔#監視4_005	10248,{/* 77224 */}
1@tcamp.gat,182,133,3	script	監視塔#監視5_006	10248,{/* 77225 */}
1@tcamp.gat,161,96,3	script	監視塔#監視6_007	10248,{/* 77226 */}
1@tcamp.gat,146,96,3	script	監視塔#監視7_008	10248,{/* 77227 */}
1@tcamp.gat,116,102,3	script	監視塔#監視8_009	10248,{/* 77228 */}
1@tcamp.gat,88,92,3		script	監視塔#監視9_010	10248,{/* 77229 */}
1@tcamp.gat,240,148,3	script	監視塔#監視10_011	10248,{/* 77230 */}
1@tcamp.gat,156,71,3	script	監視塔#監視11_012	10248,{/* 77231 */}
1@tcamp.gat,176,194,3	script	監視塔#監視12_013	10248,7,7,{/* 77232 */
OnTouch:
	stopnpctimer;
	unittalk "監視塔 : 不審者を感知!!";
	sleep 2000;
	announce "施設放送 : 不審者を探知！　担当の警備兵は現場に急行せよ！", 0x9, 0xff0000;
	sleep 4000;
	monster getmdmapname("1@tcamp.gat"),176,196,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),177,195,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),177,193,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),176,195,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),176,194,"基地の兵士",21309,1;
	monster getmdmapname("1@tcamp.gat"),176,193,"基地の兵士",21309,1;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 8;
	end;
}
1@tcamp.gat,192,194,3	script	監視塔#監視13_014	10248,{/* 77233 */}
1@tcamp.gat,142,153,3	script	監視塔#監視14_015	10248,{/* 77234 */}
1@tcamp.gat,142,168,3	script	監視塔#監視15_016	10248,{/* 79279 */}
1@tcamp.gat,192,179,3	script	監視塔#監視16_017	10248,{/* 78756 */}
1@tcamp.gat,237,90,3	script	監視塔#監視17_018	10248,{/* 79537 */}

1@tcamp.gat,138,216,3	script	ロック装置#1-1_019	10024,{/* 79281 */
	hideoffnpc getmdnpcname("マラム#ロック装置1_021");	// 79404
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置1_021")),"マラム : ロックが掛かっていますね。私にお任せを……。";	// 79404
	progressbar 10,getmdnpcname("マラム#ロック装置1_021");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置1_021")),"マラム : これで通れますよ。器用なもんでしょう？";	// 79404
	hideonnpc getmdnpcname("ロック装置#1-1_019");	// 79281
	hideonnpc getmdnpcname("ロック装置#1-2_020");	// 79400
	setcell getmdmapname("1@tcamp.gat"), 137, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 138, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 139, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 140, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 141, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 142, 216, 0;
	hideonnpc getmdnpcname("マラム#ロック装置1_021");	// 79404
	end;
}
1@tcamp.gat,141,216,3	script	ロック装置#1-2_020	10024,{/* 79400 */}
1@tcamp.gat,140,218,3	script	マラム#ロック装置1_021	10376,{/* 79404 (hide)*/}

1@tcamp.gat,136,145,3	script	ロック装置#2-1_022	10024,{/* 79415 */
	hideoffnpc getmdnpcname("マラム#ロック装置2_026");	// 79461
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置2_026")),"マラム : この先は警備が厳しそうですね。";	// 79461
	progressbar 10,getmdnpcname("マラム#ロック装置2_026");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置2_026")),"マラム : これで進めますが、慎重に行きましょう。";	// 79461
	hideonnpc getmdnpcname("ロック装置#2-1_022");	// 79415
	hideonnpc getmdnpcname("ロック装置#2-2_023");	// 79418
	hideonnpc getmdnpcname("ロック装置#2-3_024");	// 79459
	hideonnpc getmdnpcname("ロック装置#2-4_025");	// 79460
	setcell getmdmapname("1@tcamp.gat"), 135, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 136, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 137, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 138, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 139, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 140, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 141, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 142, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 143, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 144, 145, 0;
	hideonnpc getmdnpcname("マラム#ロック装置2_026");	// 79461
	end;
}
1@tcamp.gat,138,145,3	script	ロック装置#2-2_023	10024,{/* 79418 */}
1@tcamp.gat,141,145,3	script	ロック装置#2-3_024	10024,{/* 79459 */}
1@tcamp.gat,143,145,3	script	ロック装置#2-4_025	10024,{/* 79460 */}
1@tcamp.gat,142,147,3	script	マラム#ロック装置2_026	10376,{/* 79461 (hide)*/
	cutin "ep18_maram_01.png", 1;
	mes "[マラム]";
	mes "ここもロックが掛かっています。";
	mes "再び万能鍵の出番というわけですね。";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
}

1@tcamp.gat,223,109,3	script	ロック装置#3-1_027	10024,{/* 79462 */
	hideoffnpc getmdnpcname("マラム#ロック装置3_029");	// 79439
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置3_029")),"マラム : 建物の中も厳しい警備が敷かれていますね。";	// 79439
	progressbar 10,getmdnpcname("マラム#ロック装置3_029");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置3_029")),"マラム : 引き続き、慎重に進みましょう。";	// 79439
	hideonnpc getmdnpcname("ロック装置#3-1_027");	// 79462
	hideonnpc getmdnpcname("ロック装置#3-2_028");	// 79438
	setcell getmdmapname("1@tcamp.gat"), 223, 110, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 109, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 108, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 107, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 106, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 105, 0;
	hideonnpc getmdnpcname("マラム#ロック装置3_029");	// 79439
	end;
}
1@tcamp.gat,223,106,3	script	ロック装置#3-2_028	10024,{/* 79438 */}
1@tcamp.gat,226,114,3	script	マラム#ロック装置3_029	10376,{/* 79439 (hide)*/}

1@tcamp.gat,80,99,3	script	ロック装置#4-1_030	10024,{/* 79441 */
	hideoffnpc getmdnpcname("マラム#ロック装置4_033");	// 79401
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置4_033")),"マラム : この先が指令所みたいです。重要なものが集まる場所ですね。";	// 79401
	progressbar 10,getmdnpcname("マラム#ロック装置4_033");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("マラム#ロック装置4_033")),"マラム : 探しているものが見つかれば良いのですが……。";	// 79401
	hideonnpc getmdnpcname("ロック装置#4-1_030");	// 79441
	hideonnpc getmdnpcname("ロック装置#4-2_031");	// 79442
	hideonnpc getmdnpcname("ロック装置#4-3_032");	// 79581
	setcell getmdmapname("1@tcamp.gat"), 80, 100, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 99, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 98, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 97, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 96, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 95, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 94, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 93, 0;
	hideonnpc getmdnpcname("マラム#ロック装置4_033");	// 79401
	end;
}
1@tcamp.gat,80,97,3	script	ロック装置#4-2_031	10024,{/* 79442 */}
1@tcamp.gat,80,95,3	script	ロック装置#4-3_032	10024,{/* 79581 */}
1@tcamp.gat,82,100,3	script	マラム#ロック装置4_033	10376,{/* 79401 (hide)*/
	cutin "ep18_maram_01.png", 1;
	mes "[マラム]";
	mes "やれやれ……闇ルートで仕入れた鍵が";
	mes "こんなに役に立つなんて……";
	mes "こんな姿を母上に見られたら";
	mes "なんと言われるか……。";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
}

1@tcamp.gat,194,232,0	script	#tc_hwarp3_035	139,14,14,{/* 79403 */
	cloakoffnpc getmdnpcname("マラム#基地4_036");	// 79407
	end;
}
1@tcamp.gat,194,232,3	script	マラム#基地4_036	10376,{/* 79407 */
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "ふむ……この辺りを調べてみましたが";
	mes "これといったものは無いようです。";
	next;
	mes "[マラム]";
	mes "西側の施設内を調べて見た方が";
	mes "良いかもしれません。";
	mes "警備が厳重ですから";
	mes "何かあるとしたら、そちらでしょう。";
	close2;
	cutin "ep18_maram_01.png", 255;
	cloakonnpc getmdnpcname("マラム#基地4_036");	// 79407
	end;
}

1@tcamp.gat,34,100,3	script	ミリアム#基地1_037	10377,7,7,{/* 79408 */
	if(countitem(1000409) < 5) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "まさか冒険者さんとマラムに";
		mes "ここで会うとは思ってなかったな。";
		mes "どうやって、ここにたどり着いたのか";
		mes "話を聞きたいところだけど……。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "今は必要なものを集めないと。";
		mes "ここにある書類を集めてもらえませんか？";
		mes "ボクひとりだと手が回らなくて";
		mes "困っていたんです。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	cutin "ep18_miriam_02.png", 0;
	mes "[ミリアム]";
	mes "書類を集めていただき";
	mes "ありがとうございます。";
	mes "ボクひとりだと手が回らなくて";
	mes "困ってたんです。";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "私はここにミリアムがいることに";
	mes "驚いているんだけど。";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "説明は後にしよう。";
	mes "それよりほら、この書類を見て。";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "武器の横流しのリストじゃないか！";
	mes "使用期限を過ぎて";
	mes "廃棄予定の武器が対象になってる。";
	next;
	mes "[マラム]";
	mes "ああ……なるほど。";
	mes "正規の書類上は、破棄扱いにしておいて";
	mes "実際は横流ししていたというわけか。";
	mes "管理がずさん過ぎる……";
	mes "チェック機能が働いてないな。";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "ここは、ボクの父上が管理する";
	mes "基地の一つなんだ。";
	mes "村で見た武器に見覚えがあったから";
	mes "もしかしたらと思って調べてたんだよ。";
	next;
	cutin "ep18_miriam_03.png", 0;
	mes "[ミリアム]";
	mes "この横流しの件、";
	mes "父上は知らないかもしれない。";
	mes "確かめないと……。";
	next;
	mes "[ミリアム]";
	mes "書類はボクが証拠品として";
	mes "父上に提出します。";
	mes "武器が不正に出回るのを";
	mes "止めないと。";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "ミリアムの御父上か……";
	mes "なるほど……。";
	delitem 1000409,5;
	set EP18_1QUE,47;
	delquest 16578;
	setquest 16579;	// state=1
	close2;
	cutin "ep18_miriam_02.png", 255;
	end;
OnQuestInfo:
	if(countitem(1000409) >= 5)
		showevent 1, 1, "ミリアム#基地1_037";
	else
		showevent 9999,0,"ミリアム#基地1_037";
	end;
OnTouch:
	unittalk "ミリアム : あっ、冒険者さん……!?";	// 79408
	end;
}
1@tcamp.gat,32,102,3	script	マラム#基地5_038	10376,{/* 79412 */
	if(EP18_1QUE < 47) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ここにミリアムがいるとは";
		mes "思ってもみませんでした。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 47) {
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ミリアム。";
		mes "ラヘルに戻るんだろう？";
		mes "私も一緒に行こう。";
		next;
		mes "[マラム]";
		mes "冒険者様は、この基地から不正な武器が";
		mes "流出していたことを";
		mes "スアドに伝えてもらえますか。";
		next;
		mes "[マラム]";
		mes "不正の証拠は手に入れましたから";
		mes "これ以上、怪しい武器が";
		mes "流出することはないと思います。";
		mes "では、外に出ましょう。";
		set EP18_1QUE,48;
		delquest 16579;
		setquest 16580;	// state=1
		close2;
		cutin "ep18_maram_01.png", 255;
		warp "wolfvill.gat", 145, 109;
		end;
	}
	//未調査
	mes "[マラム]";
	mes "不正の証拠は手に入れましたから";
	mes "これ以上、怪しい武器が";
	mes "流出することはないと思います。";
	mes "では、外に出ましょう。";
	close2;
	cutin "ep18_maram_01.png", 255;
	warp "wolfvill.gat", 145, 109;
	end;
OnQuestInfo:
	if(EP18_1QUE == 47)
		showevent 1, 1, "マラム#基地5_038";
	else
		showevent 9999,0,"マラム#基地5_038";
	end;
}
1@tcamp.gat,32,100,3	script	書類の山#基地1_039	10391,{/* 79426 */
	mes "‐書類が乱雑に置かれている‐";
	next;
	mes "‐幾つかの書類に目を通す。";
	mes "　これらは、基地内に保管されている";
	mes "　武器の管理表のようだ‐";
	next;
	mes "‐使用期限を過ぎた武器には";
	mes "　破棄のマークが付けられている。";
	mes "　";
	mes "　念のため、書類を持って行こう‐";
	getitem 1000409,1;
	cloakonnpc;	// 79426
	close;
}
1@tcamp.gat,49,123,3	script	書類の山#基地2_040	10391,{/* 79433 */
	mes "‐書類が乱雑に置かれている‐";
	next;
	mes "‐一番上の書類には";
	mes "　「お昼ご飯のメニュー決定戦」と";
	mes "　表題が付けられている‐";
	next;
	mes "‐武器の横流しとは関係なさそうだが";
	mes "　念のため、書類を持って行こう‐";
	getitem 1000409,1;
	cloakonnpc;	// 79433
	close;
}
1@tcamp.gat,29,86,3		script	書類の山#基地3_041	10391,{/* 79437 */
	mes "‐書類が乱雑に置かれている‐";
	next;
	mes "‐書類を一枚取り出して確認する。";
	mes "　どうやら警備兵の配置図のようだ‐";
	next;
	mes "‐武器の横流しとは関係なさそうだが";
	mes "　念のため、書類を持って行こう‐";
	getitem 1000409,1;
	cloakonnpc;	// 79437
	close;
}
1@tcamp.gat,60,122,3	script	書類の山#基地4_042	10391,{/* 79515 */
	mes "‐書類が乱雑に置かれている。";
	mes "　";
	mes "　一番上の書類を確認してみる‐";
	next;
	mes "[書類]";
	mes "マグマリンに";
	mes "ジャガイモを食べさせて";
	mes "しばらくしてから倒すと、";
	mes "ホクホクの焼きジャガイモを";
	mes "ドロップするのだろうか？";
	next;
	mes "‐武器の横流しとは関係なさそうだが";
	mes "　念のため、書類を持って行こう‐";
	getitem 1000409,1;
	cloakonnpc;	// 79515
	close;
}
1@tcamp.gat,31,84,3		script	書類の山#基地5_043	10391,{/* 79614 */
	mes "‐書類が乱雑に置かれている‐";
	next;
	mes "‐書類を確認していると";
	mes "　「教皇」のイラストが出てきた。";
	mes "　";
	mes "　とんでもなく上手なイラストだ……";
	mes "　野生のプロの犯行に違いない！-";
	next;
	mes "‐武器の横流しとは関係なさそうだが";
	mes "　せっかくなのでもらっておこう‐";
	getitem 1000409,1;
	cloakonnpc;	// 79614
	close;
}
