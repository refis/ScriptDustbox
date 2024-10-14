1@iwp.gat,0,0,0	script	MazeOfOzControl1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;

	end;
}

1@oz.gat,284,164,3	script	ロープ#outoz_201	10024,{/* 70486 */
	mes "‐ロープを使えば外に出られそうだ‐";
	next;
	if(select("外に出る","ここに留まる") == 2) {
		mes "‐この場に留まることにした‐";
		close;
	}
	warp "ra_fild10.gat", 173, 176;
	end;
}
1@oz.gat,28,190,3	script	ロープ#outoz_2012	10024,{/* 89864 */
	if(EP18_1QUE < 31) {
		mes "‐ロープが地上に伸びている‐";
		close;
	}
	mes "‐ロープを使えば外に出られそうだ‐";
	next;
	if(select("外に出る","ここに留まる") == 2) {
		mes "‐この場に留まることにした‐";
		close;
	}
	warp "gw_fild01.gat", 275, 337;
	end;
OnQuestInfo:
	if(EP18_1QUE == 31)
		showevent 6, 1, "ロープ#outoz_2012";
	else
		showevent 9999,0,"ロープ#outoz_2012";
	end;
}

1@oz.gat,282,175,3	script	ミリアム#ozmd1_202	10377,{/* 70718 */
	cutin "ep18_miriam_01.png", 1;
	mes "[ミリアム]";
	mes "ふぅ！";
	mes "ここは「オズの迷路」。";
	mes "人目につかない谷底にあるから";
	mes "もう変装の必要はないよ。";
	next;
	cloakoffnpc "マギスティン#ozmd1_203";	// 48734
	cloakoffnpc "マークイシャ#ozmd1_204";	// 50921
	cloakoffnpc "タマリン#ozmd1_205";	// 51729
	cutin "4job_maggi_03.PNG", 2;
	mes "[マギスティン]";
	mes "けほっ！";
	mes "ほこりっぽいです……。";
	next;
	cutin "ep18_mark_01.png", 0;
	mes "[マークイシャ]";
	mes "それに砂漠よりも暑い……。";
	next;
	cutin "ep18_miriam_03.png", 1;
	mes "[ミリアム]";
	mes "谷底には溶岩が流れていて";
	mes "常に火山灰が舞ってるんだ。";
	mes "あまり灰を吸い込まないように注意して。";
	next;
	mes "[ミリアム]";
	mes "まずは北に進もう。";
	mes "この辺りはモンスターはいないけど";
	mes "慎重にね。";
	close2;
	cutin "ep18_miriam_03.png", 255;
	hideonnpc "ミリアム#ozmd1_202";	// 48109
	cloakonnpc "マギスティン#ozmd1_203";	// 48734
	cloakonnpc "マークイシャ#ozmd1_204";	// 50921
	cloakonnpc "タマリン#ozmd1_205";	// 51729
	hideoffnpc "ミリアム#ozmd2_206";	// 55457
	end;
}
1@oz.gat,279,175,5	script	マギスティン#ozmd1_203	10365,{/* 72499 (cloaking)*/}
1@oz.gat,280,175,3	script	マークイシャ#ozmd1_204	10383,{/* 97184 (cloaking)*/}
1@oz.gat,279,177,3	script	タマリン#ozmd1_205	10381,{/* 99264 (cloaking)*/}

1@oz.gat,271,272,3	script	ミリアム#ozmd2_206	10377,{/* 13687 (hide)*/
	cutin "ep18_miriam_03.png", 1;
	mes "[ミリアム]";
	mes "目的地はこの先だよ。";
	mes "向こうに見える橋を渡らなきゃいけない。";
	mes "まず橋の前まで行こう。";
	close2;
	cutin "ep18_miriam_03.png", 255;
	hideonnpc "ミリアム#ozmd2_206";	// 55457
	hideoffnpc "ミリアム#ozmd3_210";	// 57361
	end;
}
1@oz.gat,245,272,3	script	マギスティン#ozmd3_207	10365,{/* 30605 (cloaking)*/}
1@oz.gat,244,273,3	script	マークイシャ#ozmd3_208	10383,{/* 31183 (cloaking)*/}
1@oz.gat,244,270,3	script	タマリン#ozmd3_209	10381,{/* 32230 (cloaking)*/}
1@oz.gat,241,272,3	script2	ミリアム#ozmd3_210	21321,{/* 32541 (hide)*/
	cutin "ep18_miriam_03.png", 1;
	mes "[ミリアム]";
	mes "この橋を全員で渡ると";
	mes "重さに耐えられないかもしれない。";
	mes "順番に渡ろう。";
	next;
	mes "[ミリアム]";
	mes "じゃあ、ボクが最初に渡るね。";
	mes "ゆっくり後をついてきて……";
	mes "ああ、下は見ない方が良いよ。";
	next;
	cloakoffnpc "マギスティン#ozmd3_207";	// 56751
	cloakoffnpc "マークイシャ#ozmd3_208";	// 56847
	cloakoffnpc "タマリン#ozmd3_209";	// 56894
	mes "[タマリン]";
	mes "うわー……";
	mes "谷底が全く見えませんね。";
	cutin "ep18_tamarin_01.png", 1;
	next;
	mes "[マギスティン]";
	mes "この橋……今にも崩れそう……。";
	cutin "4job_maggi_02.png", 2;
	next;
	mes "[マークイシャ]";
	mes "みんな気をつけて。";
	cutin "ep18_mark_01.png", 0;
	close2;
	cutin "ep18_mark_01.png", 255;
	cloakonnpc "マギスティン#ozmd3_207";	// 56751
	cloakonnpc "マークイシャ#ozmd3_208";	// 56847
	cloakonnpc "タマリン#ozmd3_209";	// 56894
	donpcevent "ミリアム#ozmd3_210" + "::OnStart";
	end;
OnStart:
	setnpcspeed 200;
	npcwalkto 231,272,"ミリアム#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 150;
	npcwalkto 221,272,"ミリアム#ozmd3_210";	// 57361: speed:150
	npcwalkwait;
	setnpcspeed 200;
	npcwalkto 211,272,"ミリアム#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 150;
	npcwalkto 201,272,"ミリアム#ozmd3_210";	// 57361: speed:150
	npcwalkwait;
	setnpcspeed 300;
	npcwalkto 191,272,"ミリアム#ozmd3_210";	// 57361: speed:300
	npcwalkwait;
	setnpcspeed 200;
	npcwalkto 181,272,"ミリアム#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 300;
	npcwalkto 171,272,"ミリアム#ozmd3_210";	// 57361: speed:300
	npcwalkwait;
	setnpcspeed 200;
	npcwalkto 161,272,"ミリアム#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 70;
	npcwalkto 157,272,"ミリアム#ozmd3_210";	// 57361: speed:70
	npcwalkwait;
	hideoffnpc "アッシュトード#ozmd1_215";	// 59335
	hideoffnpc "ミリアム#ozmd4_214";	// 59123
	hideonnpc "ミリアム#ozmd3_210";	// 57361
	sleep 1000;
	announce "ミリアム : モンスター!?", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "ミリアム : カエル君……キミと待ち合わせなんてしていないよ！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 3000;
	hideoffnpc "タマリン#ozmd4_213";	// 58918
	sleep 1000;
	hideoffnpc "アッシュトード#ozmd2_216";	// 59382
	sleep 1000;
	announce "タマリン : 後ろにも現れましたよ！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 3000;
	hideoffnpc "アッシュトード#ozmd3_217";	// 59657
	donpcevent "OzMobEvent01::OnStart";
	sleep 1000;
	hideoffnpc "マギスティン#ozmd4_211";	// 58399
	hideoffnpc "マークイシャ#ozmd4_212";	// 58498
	unittalk getnpcid(0,"アッシュトード#ozmd1_215"),"アッシュトード : ゲロゲロ。";	// 59335
	sleep 1000;
	announce "マギスティン : きゃぁー！！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	unittalk getnpcid(0,"アッシュトード#ozmd3_217"),"アッシュトード : グァッグァッグァ。";	// 59657
	sleep 2500;
	unittalk getnpcid(0,"アッシュトード#ozmd2_216"),"アッシュトード : ゲロゲロ。";	// 59382
	sleep 1500;
	announce "マークイシャ : 冒険者様は、進行方向の敵を排除してください！　後方は、私たちで対処します！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	end;
OnInit:
	setnpcspeed 150,"ミリアム#ozmd3_210";	// 32541
	end;
}

1@oz.gat,155,275,3	script	マギスティン#ozmd4_211	10365,{/* 32977 (hide)*/}
1@oz.gat,156,274,3	script	マークイシャ#ozmd4_212	10383,{/* 33288 (hide)*/}
1@oz.gat,161,272,5	script	タマリン#ozmd4_213	10381,{/* 34547 (hide)*/}
1@oz.gat,157,272,3	script	ミリアム#ozmd4_214	10377,{/* 34582 (hide)*/}
1@oz.gat,156,272,5	script	アッシュトード#ozmd1_215	21295,{/* 34777 (hide)*/}
1@oz.gat,164,272,3	script	アッシュトード#ozmd2_216	21295,{/* 34944 (hide)*/}
1@oz.gat,153,275,5	script	アッシュトード#ozmd3_217	21295,{/* 37923 (hide)*/}
1@oz.gat,162,275,3	script	マラム#ozmd4_218	10376,{/* 38005 (hide)*/}
1@oz.gat,1,1,0	script	OzMobEvent01	139,{
OnStart:
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("OzMobEvent01")+ "::OnKilled";
	monster '@mdmap$,145,274,"アッシュトード#1",21295,1,'@label$;
	monster '@mdmap$,143,278,"アッシュトード#2",21295,1,'@label$;
	end;
OnKilled:
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("OzMobEvent01")+ "::OnKilled";
	if(getmapmobs('@mdmap$,'@label$) > 0)
		end;
	announce "タマリン : ふう！　終わりました！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	hideonnpc "アッシュトード#ozmd2_216";	// 59382
	sleep 2000;
	announce "マギスティン : こっちも、倒しました……！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	hideonnpc "アッシュトード#ozmd3_217";	// 59657
	sleep 2000;
	hideonnpc "アッシュトード#ozmd1_215";	// 59335
	announce "マラム : 皆さん！　ご無事ですか！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	hideoffnpc "マラム#ozmd4_218";	// 59766
	sleep 2000;
	announce "ミリアム : 遅いよ！　油でも売ってたの？", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : さっきのカエルから油が取れれば儲かるかもね。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "ミリアム : やだよ！　そんなもの、誰が買うのさ……。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : 冗談はこれぐらいにして……ご覧の通り、モンスターのせいで物資の輸送も難しくなっています。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : さっきのも普通の商人だったら危なかったでしょう。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "タマリン : この道以外に経路は無いのですか？", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : かつては峡谷にさっき通った橋とは別の橋が架かっていましたが、架け直すわけにはいかないんです。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : 橋を架け直せば、先に原住民が住んでいることがバレてしまいますから。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : 危険であっても、この迷宮を通るしかありません。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : 橋をかけたらここに人が隠れ住んでいることを知らせてしまうようなものです。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : さあ、先に進みましょう。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "マラム : 今回は、冒険者様たちが一緒だからモンスターも怖くないですね。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	hideonnpc "マラム#ozmd4_218";	// 59766
	hideonnpc "マギスティン#ozmd4_211";	// 58399
	hideonnpc "マークイシャ#ozmd4_212";	// 58498
	hideonnpc "タマリン#ozmd4_213";	// 58918
	hideonnpc "ミリアム#ozmd4_214";	// 59123
	hideonnpc "マラム#ozmd4_218";	// 59766
	hideoffnpc "マラム#ozmd5_219";	// 59835
	end;
}
1@oz.gat,98,172,3	script2	マラム#ozmd5_219	21320,{/* 40966 (hide)*/
	hideoffnpc "マギスティン#ozmd5_221";	// 93078
	hideoffnpc "マークイシャ#ozmd5_222";	// 93325
	hideoffnpc "タマリン#ozmd5_223";	// 93646
	hideoffnpc "ミリアム#ozmd5_220";	// 93044
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "前は、そこまで危険ではなかったんです。";
	mes "トール火山の影響なのか……";
	mes "溶岩の流れが活発化してから";
	mes "モンスターが増えたんです。";
	next;
	mes "[マラム]";
	mes "モンスターは厄介ですが";
	mes "溶岩にも注意してください。";
	mes "溶岩に触れて大けがを負ったり";
	mes "命を落とした人もいます。";
	next;
	cutin "ep18_maram_01.png", 255;
	announce "？？？ : うわぁぁー！！！！！！！", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	cutin "ep18_miriam_03.png", 0;
	mes "[ミリアム]";
	mes "この声は、イムリルだ！";
	mes "マラム！";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "私が先に行きます！";
	mes "後からついて来てください！";
	close2;
	cutin "ep18_maram_03.png", 255;
	hideonnpc "マギスティン#ozmd5_221";	// 93078
	hideonnpc "マークイシャ#ozmd5_222";	// 93325
	hideonnpc "タマリン#ozmd5_223";	// 93646
	setnpcspeed 120,"マラム#ozmd5_219";	// 40966
	npcwalkto 88,168,"マラム#ozmd5_219";	// 92662: speed:120
	setnpcspeed 100,"ミリアム#ozmd5_220";	// 41125
	npcwalkto 83,167,"ミリアム#ozmd5_220";	// 93044: speed:100
	sleep 1200;
	hideonnpc "マラム#ozmd5_219";	// 92662
	hideoffnpc "マラム#ozmd7_224";	// 46991
	hideoffnpc "イムリル#ozmd6_226";	// 48021
	end;
OnInit:
	setnpcspeed 150,"マラム#ozmd5_219";	// 40966
	end;
}
1@oz.gat,97,167,3	script2	ミリアム#ozmd5_220	21321,{/* 41125 (hide)*/
	end;
OnInit:
	setnpcspeed 150,"ミリアム#ozmd5_220";	// 41125
	end;
}
1@oz.gat,92,170,3	script	マギスティン#ozmd5_221	10365,{/* 44964 (hide)*/}
1@oz.gat,91,169,3	script	マークイシャ#ozmd5_222	10383,{/* 45653 (hide)*/}
1@oz.gat,89,170,5	script	タマリン#ozmd5_223	10381,{/* 45677 (hide)*/}
1@oz.gat,68,165,3	script	マラム#ozmd7_224	10376,{/* 46991 (hide)*/
	mes "[マラム]";
	mes "イムリル！";
	mes "大丈夫か!!";
	close2;
	hideonnpc "マラム#ozmd7_224";	// 93672
	donpcevent "イムリル#ozmd6_226::OnStart";
	end;
}
1@oz.gat,68,165,3	script	マラム#ozmd8_225	10376,{/* 47956 (hide)*/}
1@oz.gat,61,163,5	script	イムリル#ozmd6_226	10379,{/* 48021 (hide)*/
	unittalk "イムリル : 見ていないで助けてくれー!!";	// 94059
	end;
OnStart:
	unittalk "イムリル : 見ていないで助けてくれー!!";	// 94059
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("イムリル#ozmd6_226")+ "::OnKilled";
	monster '@mdmap$,64,164,"アッシュトード#3",21295,1,'@label$;
	monster '@mdmap$,62,161,"ラケソン#3",21296,1,'@label$;
	end;
OnKilled:
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("イムリル#ozmd6_226")+ "::OnKilled";
	if(getmapmobs('@mdmap$,'@label$) > 0)
		end;
	hideoffnpc "マラム#ozmd8_225";	// 5496
	announce "イムリル : 助かった……様子を見に来ただけなのに酷い目にあった。", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 4000;
	unittalk getnpcid(0,"イムリル#ozmd6_226"),"イムリル : ところでマラム、その人は誰？";	// 5607
	hideoffnpc "マギスティン#ozmd6_227";	// 25959
	hideoffnpc "マークイシャ#ozmd6_228";	// 36720
	hideoffnpc "タマリン#ozmd6_229";	// 81810
	sleep 2000;
	unittalk getnpcid(0,"マラム#ozmd8_225"),"マラム : 私たちに協力してくださる冒険者様さ。とても信用できる方だぞ。";	// 5496
	sleep 2000;
	unittalk getnpcid(0,"イムリル#ozmd6_226"),"イムリル : 助けてもらったんだから警戒も何もないけどさ……";	// 5607
	sleep 2000;
	unittalk getnpcid(0,"イムリル#ozmd6_226"),"イムリル : お前って本当にお人好しというか……人懐っこいというか……";	// 5607
	sleep 2000;
	unittalk getnpcid(0,"ミリアム#ozmd5_220"),"ミリアム : ほんと。昔飼ってた犬みたいだ。";	// 98988
	sleep 2000;
	unittalk getnpcid(0,"マラム#ozmd8_225"),"マラム : ……褒めてもらえてるのかな？　まあ、いいや。";	// 5496
	sleep 2000;
	unittalk getnpcid(0,"イムリル#ozmd6_226"),"イムリル : ここからだと北の方向に進んでくれ。その先が、迷路の出口だよ。";	// 5607
	sleep 2000;
	unittalk getnpcid(0,"タマリン#ozmd6_229"),"タマリン : こっちの道ですね。では、進みましょう。";	// 81810
	emotion 5,"タマリン#ozmd6_229";	// 81810
	sleep 2000;
	hideonnpc "マギスティン#ozmd6_227";	// 25959
	hideonnpc "マークイシャ#ozmd6_228";	// 36720
	hideonnpc "タマリン#ozmd6_229";	// 81810
	hideonnpc "イムリル#ozmd6_226";	// 5607
	hideonnpc "マラム#ozmd8_225";	// 5496
	hideonnpc "ミリアム#ozmd5_220";	// 98988
	hideonnpc "マラム#ozmd6_230";	// 66914
	hideonnpc "マラム#ozmd9_232";	// 69633
	end;
}
1@oz.gat,61,168,3	script	マギスティン#ozmd6_227	10365,{/* 49295 (hide)*/}
1@oz.gat,65,167,3	script	マークイシャ#ozmd6_228	10383,{/* 49596 (hide)*/}
1@oz.gat,59,171,3	script	タマリン#ozmd6_229	10381,{/* 50011 (hide)*/}
1@oz.gat,44,255,5	script	マラム#ozmd6_230	10376,7,7,{/* 66914 (hide)*/
	unittalk "マラム : この道を辿ってください！";	// 99245
	end;
OnTouch:
	unittalk "マラム : こっちです！！";	// 99245
	end;
}
1@oz.gat,58,256,0	script	#oz_way_231	139,{/* 69034 */}
1@oz.gat,21,189,5	script	マラム#ozmd9_232	10376,{/* 69633 (cloaking)*/
	cloakoffnpc "ミリアム#ozmd7_233";	// 22888
	cloakoffnpc "イムリル#ozmd7_234";	// 71750
	cutin "ep18_maram_02.png", 1;
	mes "[マラム]";
	mes "お疲れ様です、ここが出口です。";
	mes "このロープが登れば";
	mes "外に出られますよ。";
	next;
	cutin "ep18_imril_03.png", 2;
	mes "[イムリル]";
	mes "ふぅ……おいらは、迷路内に隠した物資を";
	mes "回収してから戻るよ。";
	mes "先に行っててくれ。";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "みんな疲れてるよね？";
	mes "早く外に出よう。";
	if(EP18_1QUE == 30) {
		set EP18_1QUE,31;
		delquest 11719;
		setquest 11720;	// state=1
	}
	close2;
	cutin "ep18_miriam_01.png", 255;
	cloakonnpc "ミリアム#ozmd7_233";	// 22888
	cloakonnpc "イムリル#ozmd7_234";	// 71750
	end;
}
1@oz.gat,22,187,5	script	ミリアム#ozmd7_233	10377,{/* 69819 (cloaking)*/}
1@oz.gat,16,185,3	script	イムリル#ozmd7_234	10379,{/* 77288 (cloaking)*/}

1@oz.gat,22,207,5	script	#oz01_236	723,4,4,{/* 90767 */
	monster getmdmapname("1@oz.gat"),21,207,"アッシュトード#4",21295,1;
	monster getmdmapname("1@oz.gat"),23,207,"ラケソン#4",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,30,237,5	script	#oz02_237	723,4,4,{/* 6591 */
	monster getmdmapname("1@oz.gat"),29,237,"アッシュトード#5",21295,1;
	monster getmdmapname("1@oz.gat"),31,237,"ラケソン#5",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,44,264,5	script	#oz03_238	723,4,4,{/* 6755 */
	monster getmdmapname("1@oz.gat"),43,264,"アッシュトード#6",21295,1;
	monster getmdmapname("1@oz.gat"),45,264,"ラケソン#6",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,62,247,5	script	#oz04_239	723,4,4,{/* 11357 */
	monster getmdmapname("1@oz.gat"),61,247,"アッシュトード#7",21295,1;
	monster getmdmapname("1@oz.gat"),63,247,"ラケソン#7",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,72,222,5	script	#oz05_240	723,4,4,{/* 71010 */
	monster getmdmapname("1@oz.gat"),71,222,"アッシュトード#8",21295,1;
	monster getmdmapname("1@oz.gat"),73,222,"ラケソン#8",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,79,203,5	script	#oz06_241	723,4,4,{/* 72303 */
	monster getmdmapname("1@oz.gat"),78,203,"アッシュトード#9",21295,1;
	monster getmdmapname("1@oz.gat"),80,203,"ラケソン#9",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,124,261,5	script	#oz07_242	723,4,4,{/* 72342 */
	monster getmdmapname("1@oz.gat"),123,261,"アッシュトード#10",21295,1;
	monster getmdmapname("1@oz.gat"),125,261,"ラケソン#10",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,139,279,5	script	#oz08_243	723,4,4,{/* 72620 */
	monster getmdmapname("1@oz.gat"),138,279,"アッシュトード#11",21295,1;
	monster getmdmapname("1@oz.gat"),140,279,"ラケソン#11",21296,1;
	hideonnpc;
	end;
}
