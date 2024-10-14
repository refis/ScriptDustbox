1@jorchs.gat,0,0,0	script	ConfusedNestControl1	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set .mdmap$,getmdmapname("1@jorchs.gat");
	set '@temp_mob[0],callmonster(.mdmap$,273,17,"進入不可#273_17",3982,getmdnpcname("ConfusedNestControl1")+"::OnKilled");
	set '@temp_mob[1],callmonster(.mdmap$,273,21,"進入不可#273_21",3982,getmdnpcname("ConfusedNestControl1")+"::OnKilled");
	for(set '@i,0; '@i < getarraysize('@temp_mob); set '@i,'@i+1)
		setunitgroup 1002,'@temp_mob['@i];

	// Gate
	setarray '@xy0,273,17,274,17,275,17,273,18,274,18,275,18,273,19,274,19,275,19,273,20,274,20,275,20,273,21,274,21,275,21,273,22,274,22,273,23,274,23;
	for(set '@i,0; '@i < getarraysize('@xy0); set '@i,'@i+2)
		setcell .mdmap$,'@xy0['@i],'@xy0['@i+1],1;

	// Area 1
	setarray '@xy1,142,58,142,57,142,56,142,55,142,54,142,62,141,62,141,61,141,60,141,59,141,58,141,57,141,56,141,55,141,54;
	for(set '@i,0; '@i < getarraysize('@xy1); set '@i,'@i+2)
		setcell .mdmap$,'@xy1['@i],'@xy1['@i+1],1;

	// Area 2
	setarray '@xy2, 124,130,124,129,124,128,124,127,124,126,123,130,123,129,123,128,123,127,123,126,122,130,122,129,122,128,122,127,122,126,121,130,121,129,121,128,
					121,127,121,126,120,130,120,129,120,128,120,127,120,126,119,130,119,129,119,128,119,127,119,126,129,126,129,125,129,124,128,126,128,125,128,124,
					127,126,127,125,127,124,126,126,126,125,126,124,125,126,125,125,125,124,124,126,124,125,124,124,123,126,123,125,123,124,122,126,122,125,122,124;
	for(set '@i,0; '@i < getarraysize('@xy2); set '@i,'@i+2)
		setcell .mdmap$,'@xy2['@i],'@xy2['@i+1],1;

	// Area 3
	setarray '@xy3, 250,177,250,176,249,177,249,176,248,177,248,176,247,177,247,176,246,177,246,176,245,177,245,176,244,177,244,176,243,177,243,176,243,175,243,174,242,177,
					242,176,242,175,242,174,241,177,241,176,241,175,241,174,240,177,240,176,240,175,240,174,239,177,239,176,239,175,239,174,238,177,238,176,238,175,238,174;
	for(set '@i,0; '@i < getarraysize('@xy3); set '@i,'@i+2)
		setcell .mdmap$,'@xy3['@i],'@xy3['@i+1],1;

	// Area 4
	setarray '@xy4, 140,183,140,182,140,181,140,180,140,179,140,178,139,183,139,182,139,181,139,180,139,179,139,178,138,183,138,182,138,181,138,180,138,179,138,178;
	for(set '@i,0; '@i < getarraysize('@xy4); set '@i,'@i+2)
		setcell .mdmap$,'@xy4['@i],'@xy4['@i+1],1;

	// Area 5
	setarray '@xy5, 43,256,43,255,42,256,42,255,41,256,41,255,40,256,40,255,39,256,39,255,38,256,38,255,37,256,37,255,36,256,36,255,35,256,35,255,34,256,34,255;
	for(set '@i,0; '@i < getarraysize('@xy5); set '@i,'@i+2)
		setcell .mdmap$,'@xy5['@i],'@xy5['@i+1],1;

	hideonnpc getmdnpcname("sw_1_0");
	hideonnpc getmdnpcname("レオン#19m00");	// 96607
	hideonnpc getmdnpcname("ミリアム#19m00");	// 14495
	hideonnpc getmdnpcname("ヴォークリンデ#19m00");	// 28233
	hideonnpc getmdnpcname("ホルル#19m00");	// 75931
	hideonnpc getmdnpcname("アーウィン#19m00");	// 76011
	hideonnpc getmdnpcname("アーウィン#19m01");	// 99342
	hideonnpc getmdnpcname("怖気づいたルガン#19m00");
	hideonnpc getmdnpcname("怖気づいたルガン#19m01");

	hideonnpc getmdnpcname("sw_1_1");
	hideonnpc getmdnpcname("ホルル#19m10");	// 59811
	hideonnpc getmdnpcname("オーレリー#19m10");	// 33180
	hideonnpc getmdnpcname("レオン#19m10");	// 35416
	hideonnpc getmdnpcname("ミリアム#19m10");	// 69866
	hideonnpc getmdnpcname("ヴォークリンデ#19m10");	// 86073
	hideonnpc getmdnpcname("アーウィン#19m10");	// 58881
	hideonnpc getmdnpcname("アーウィン#19m11");	// 18533

	hideonnpc getmdnpcname("sw_2_0");	// 60886
	hideonnpc getmdnpcname("足止めされたルガン#19m10");	// 57878
	hideonnpc getmdnpcname("足止めされたルガン#19m11");	// 97573

	hideonnpc getmdnpcname("sw_2_1");	// 5473
	hideonnpc getmdnpcname("ホルル#19m20");	// 52504
	hideonnpc getmdnpcname("ホルル#19m21");	// 18653
	hideonnpc getmdnpcname("アーウィン#19m22");	// 33307
	hideonnpc getmdnpcname("アーウィン#19m23");	// 37536
	hideonnpc getmdnpcname("ハートハンター#19m20");	// 49580
	hideonnpc getmdnpcname("ハートハンター#19m21");	// 56070
	hideonnpc getmdnpcname("ハートハンター#19m22");	// 69632

	hideonnpc getmdnpcname("sw_3_0");	// 30256
	hideonnpc getmdnpcname("ヴォークリンデ#19m30");	// 30262
	hideonnpc getmdnpcname("ミリアム#19m30");	// 30263
	hideonnpc getmdnpcname("ハートハンター#19m30");	// 30264
	hideonnpc getmdnpcname("ハートハンター#19m31");	// 30265
	hideonnpc getmdnpcname("ハートハンター#19m32");	// 30266
	hideonnpc getmdnpcname("注入装置1#19m30");
	hideonnpc getmdnpcname("注入装置2#19m31");
	hideonnpc getmdnpcname("注入装置3#19m32");

	hideonnpc getmdnpcname("sw_4_0");	// 30280
	hideonnpc getmdnpcname("sw_4_1");	// 30281
	hideonnpc getmdnpcname("オーレリー#19m40");	// 30282
	hideonnpc getmdnpcname("レオン#19m40");	// 30284
	hideonnpc getmdnpcname("ハートハンター#19m40");	// 30285
	hideonnpc getmdnpcname("ハートハンター#19m41");	// 30286
	hideonnpc getmdnpcname("ハートハンター#19m42");	// 30287
	hideonnpc getmdnpcname("注入装置3#19m40");
	hideonnpc getmdnpcname("#e19c05");
	hideonnpc getmdnpcname("#e19c06");

	hideonnpc getmdnpcname("バゴット#19m50");	// 30181
	hideonnpc getmdnpcname("凶暴なルガン#19m50");	// 30889
	hideonnpc getmdnpcname("凶暴なルガン#19m51");	// 30889
	hideonnpc getmdnpcname("凶暴なルガン#19m52");	// 30133
	hideonnpc getmdnpcname("凶暴なルガン#19m53");	// 30889
	hideonnpc getmdnpcname("凶暴なルガン#19m54");	// 30956
	hideonnpc getmdnpcname("凶暴なルガン#19m55");	// 30889
	hideonnpc getmdnpcname("凶暴なルガン#19m56");	// 30889

	hideonnpc getmdnpcname("オーレリー#19m60");	// 30948
	hideonnpc getmdnpcname("レオン#19m60");	// 30157
	hideonnpc getmdnpcname("ホルル#19m60");	// 30896
	hideonnpc getmdnpcname("ヴォークリンデ#19m60");	// 28145
	hideonnpc getmdnpcname("ミリアム#19m60");	// 30290

	donpcevent getmdnpcname("オーレリー#19m00")+ "::OnStart";
	//hideoffnpc getmdnpcname("入場管理#jorchs");
	set 'flag,2;
	end;
}

1@jorchs.gat,275,19,3	script	入場管理#jorchs	10046,{/* 41925 */
	if(getvariableofnpc('flag,getmdnpcname("ConfusedNestControl2")) < 2) {
		unittalk "‐メモリアルダンジョンの準備中です‐";
		//hideonnpc;
		end;
	}
	mes "^FF0000[インフォメーション]";
	mes "この先へは";
	mes "メモリアルダンジョンの";
	mes "入場条件を満たした";
	mes "異なるゲームアカウントの";
	mes "キャラクターが2人まで、";
	mes "一緒に進むことができます。^000000";
	next;
	mes "[インフォメーション]";
	mes "進入しますか？";
	mes "　";
	mes "^4A0084‐進入キャラクター数： " +.char_cnt+ " / 2‐^000000";
	next;
	if(select("^0000ffはい^000000","いいえ") == 2) {
		mes "‐やめた‐";
		close;
	}
	mes "[インフォメーション]";
	mes "進入します。";
	close2;
	if(.char_cnt >= 2) {
		// 未調査
		mes "[インフォメーション]";
		mes "これ以上進入できません。";
		close;
	}
	set .char_cnt,.char_cnt+1;
	warp .mdmap$, 269, 21;
	end;
}

1@jorchs.gat,261,34,0	script	sw_1_0	139,14,14,{/* 97394 (hide)*/
	viewpoint 1, 242, 66, 1, 0xFFFF00;	// 97394
	viewpoint 1, 237, 61, 2, 0xFFFF00;	// 97394
	viewpoint 1, 221, 37, 3, 0xFFFF00;	// 97394
	viewpoint 1, 249, 79, 4, 0xFFFF00;	// 97394
	viewpoint 1, 114, 20, 5, 0xFFFF00;	// 97394
	viewpoint 1, 142, 58, 99, 0xFF0000;	// 97394
	end;
}
1@jorchs.gat,261,34,3	script	オーレリー#19m00	10465,{/* 94548 */
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : もっと近づこう",1;
		end;
	}
	switch(.scean) {
	case 0:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		stopnpctimer;
		misceffect 16;	// 94548
		if(!sleep2(500)) end;
		announce "オーレリー : もはや変身する必要もなさそうね。", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("ホルル#19m00")),"ホルル : 先行したアーウィン部隊が、入口付近のルガンたちを片付けた。";	// 75931
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("ヴォークリンデ#19m00")),"ヴォークリンデ : 巣の奥の方には、まだまだルガンがいるみたいね。";	// 28233
		if(!sleep2(3000)) end;
		unittalk "オーレリー : 目標はラスガンドとバゴットの確保、及びユミルの心臓の奪還よ。";	// 94548
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("ホルル#19m00")),"ホルル : 逃がすわけにはいかない。スピードが命だ。";	// 75931
		if(!sleep2(3000)) end;
		unittalk "オーレリー : 出入口は一つだけのようだけど、私たちの知らない出入口がある可能性もあるわ。";	// 94548
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("ホルル#19m00")),"ホルル : 巣の奥にたどり着くには、ルガンたちとの戦闘は避けられない。";	// 75931
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("ホルル#19m00")),"ホルル : 先行した部隊の話によれば、普通のルガンとは違うらしい。";	// 75931
		if(!sleep2(3000)) end;
		unittalk "オーレリー : 相手は呪術に長けているルガンたちよ。十分に気を付けて。";	// 94548
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("ホルル#19m00")),"ホルル : これより侵攻を開始する！　武運を祈る！";	// 75931
		if(!sleep2(100)) end;
		announce "オーレリー : 周囲を捜索しつつ、ルガンたちを排除してちょうだい。", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		hideonnpc getmdnpcname("レオン#19m00");	// 96607
		hideonnpc getmdnpcname("ミリアム#19m00");	// 14495
		hideonnpc getmdnpcname("ヴォークリンデ#19m00");	// 28233
		hideonnpc getmdnpcname("ホルル#19m00");	// 75931
		hideonnpc getmdnpcname("アーウィン#19m00");	// 76011
		hideonnpc getmdnpcname("アーウィン#19m01");	// 99342
		if(!sleep2(200)) end;
		hideoffnpc getmdnpcname("sw_1_0");	// 97394
		donpcevent getmdnpcname("ConfusedNestControl2")+ "::OnStart";
		end;
	case 1:
		unittalk "オーレリー : 周囲を捜索しつつ、ルガンたちを排除してちょうだい。";	// 94548
		viewpoint 1, 242, 66, 1, 0xFFFF00;	// 94548
		viewpoint 1, 237, 61, 2, 0xFFFF00;	// 94548
		viewpoint 1, 221, 37, 3, 0xFFFF00;	// 94548
		viewpoint 1, 249, 79, 4, 0xFFFF00;	// 94548
		viewpoint 1, 114, 20, 5, 0xFFFF00;	// 94548
		viewpoint 1, 142, 58, 99, 0xFF0000;	// 94548
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 94548
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:オーレリー#19m00(94548)
	end;
}
1@jorchs.gat,260,35,3	script	レオン#19m00	10464,{/* 96607 */}
1@jorchs.gat,256,34,5	script	ミリアム#19m00	10377,{/* 14495 */}
1@jorchs.gat,257,35,5	script	ヴォークリンデ#19m00	10467,{/* 28233 */}
1@jorchs.gat,258,32,7	script	ホルル#19m00	21518,{/* 75931 */}
1@jorchs.gat,256,31,7	script	アーウィン#19m00	21517,{/* 76011 */}
1@jorchs.gat,259,31,7	script	アーウィン#19m01	21517,{/* 99342 */}

1@jorchs.gat,0,0,0	script	ConfusedNestControl2	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set 'mob_num,5;
	set .scean,1;
	hideoffnpc getmdnpcname("怖気づいたルガン#19m00");
	hideoffnpc getmdnpcname("怖気づいたルガン#19m01");
	set '@label$,getmdnpcname("ConfusedNestControl2")+ "::OnKilled";
	monster .mdmap$,242,66,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,237,61,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,221,37,"巻き込まれた中級ルガン",21535,1,'@label$;
	end;
OnKilled:
	set 'mob_num,'mob_num-1;
	initnpctimer;
	end;
OnTimer500:
	if('mob_num > 0) {
		stopnpctimer;
		announce "‐周囲にルガンがまだ残っているようだ‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	end;
OnTimer1000:
	hideonnpc getmdnpcname("sw_1_0");
	hideonnpc getmdnpcname("オーレリー#19m00");
	hideoffnpc getmdnpcname("ホルル#19m10");	// 59811
	hideoffnpc getmdnpcname("オーレリー#19m10");	// 33180
	hideoffnpc getmdnpcname("レオン#19m10");	// 35416
	hideoffnpc getmdnpcname("ミリアム#19m10");	// 69866
	hideoffnpc getmdnpcname("ヴォークリンデ#19m10");	// 86073
	hideoffnpc getmdnpcname("アーウィン#19m10");	// 58881
	hideoffnpc getmdnpcname("アーウィン#19m11");	// 18533
	end;
OnTimer1500:
	set .scean,2;
	stopnpctimer;
	announce "ホルル : みんな西の方へ集合してくれ！　現状を確認したい。", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	donpcevent getmdnpcname("ホルル#19m10")+ "::OnStart";
	end;
}

1@jorchs.gat,249,79,7	script	怖気づいたルガン#19m00	21600,5,5,{/* 67000 (hide)*/
	// 未調査
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "怖気づいたルガン : 怖い……体が……何か変だ……？";	// 67000
	end;
OnTimer3000:
	unittalk "怖気づいたルガン : ……人間？　貴様の所為か？　私にいったい何をしたんだ!!";	// 67000
	end;
OnTimer5000:
	unittalk "怖気づいたルガン : 汚らわしい人間のくせに！　早く私を元に……！　あ……";	// 67000
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 594;	// 67000
	hideonnpc;	// 67000
	set '@label$,getmdnpcname("ConfusedNestControl2")+ "::OnKilled";
	monster .mdmap$,249,79,"巻き込まれた中級ルガン",21535,1,'@label$;
	end;
}

1@jorchs.gat,114,20,3	script	怖気づいたルガン#19m01	21600,5,5,{/* 94770 (hide)*/
	// 未調査
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "怖気づいたルガン : わ、私も…ああなるのか……？";	// 94770
	end;
OnTimer3000:
	unittalk "怖気づいたルガン : 忠実にしてきたのに、あの人間たちは……私に一体何をした……!?";	// 94770
	end;
OnTimer5000:
	unittalk "怖気づいたルガン : …人間？　人間!？　私をこうした人間!!??!?";	// 94770
	end;
OnTimer7000:
	unittalk "怖気づいたルガン : あ…寒い……";	// 94770
	end;
OnTimer9000:
	stopnpctimer;
	misceffect 594;	// 67000
	hideonnpc;	// 67000
	set '@label$,getmdnpcname("ConfusedNestControl2")+ "::OnKilled";
	monster .mdmap$,114,20,"巻き込まれた中級ルガン",21535,1,'@label$;
	end;
}

1@jorchs.gat,142,58,0	script	sw_1_1	139,14,14,{/* 51002 (hide)*/
	viewpoint 2, 242, 66, 1, 0xFFFF00;	// 51002
	viewpoint 2, 237, 61, 2, 0xFFFF00;	// 51002
	viewpoint 2, 221, 37, 3, 0xFFFF00;	// 51002
	viewpoint 2, 249, 79, 4, 0xFFFF00;	// 51002
	viewpoint 2, 114, 20, 5, 0xFFFF00;	// 51002
	viewpoint 1, 114, 119, 99, 0xFF0000;	// 51002
	end;
}
1@jorchs.gat,142,58,5	script	ホルル#19m10	21518,{/* 59811 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : もっと近づこう",1;
		end;
	}
	switch(.scean) {
	case 2:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		stopnpctimer;
		misceffect 16;	// 59811
		if(!sleep2(500)) end;
		unittalk "ホルル : あれはいったい何だ!?　今まで見たことがない姿のルガンだ！";	// 59811
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("レオン#19m10")),"レオン : 中級ルガンみたいですが、元の姿がどのようなものだったのかわかりませんね。";	// 35416
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("オーレリー#19m10")),"オーレリー : あのおぞましい姿は、一体何だったんだろう……。";	// 33180
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("ミリアム#19m10")),"ミリアム : イルシオンたちによって改造されたのでしょうか？";	// 69866
		if(!sleep2(2500)) end;
		unittalk "ホルル : あれが改造だって!?　改造と言うよりは合体させられたような……。";	// 59811
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("レオン#19m10")),"レオン : まるでキメラのようでしたね。";	// 35416
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("ヴォークリンデ#19m10")),"ヴォークリンデ : 普通で無いのは確かね。更に調べる必要はあるけど。";	// 86073
		if(!sleep2(3000)) end;
		unittalk "ホルル : 引き続き、分散して捜索した方が良さそうだ。";	// 59811
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("ミリアム#19m10")),"ミリアム : ラスガンドが招集したという上級以上のルガンは、奥にいるのでしょうか？";	// 69866
		if(!sleep2(3000)) end;
		unittalk "ホルル : バゴットの研究室も確認しなくては。";	// 59811
		if(!sleep2(500)) end;
		hideonnpc getmdnpcname("オーレリー#19m10");	// 33180
		hideonnpc getmdnpcname("レオン#19m10");	// 35416
		hideonnpc getmdnpcname("ミリアム#19m10");	// 69866
		hideonnpc getmdnpcname("ヴォークリンデ#19m10");	// 86073
		hideonnpc getmdnpcname("アーウィン#19m10");	// 58881
		hideonnpc getmdnpcname("アーウィン#19m11");	// 18533
		hideonnpc getmdnpcname("アーウィン#19m12");	// 34750
		hideonnpc getmdnpcname("アーウィン#19m13");	// 44763
		if(!sleep2(200)) end;
		hideoffnpc getmdnpcname("sw_1_1");	// 51002
		set .scean,3;
		donpcevent getmdnpcname("アーウィン#19m20")+ "::OnStart";
		setarray '@xy1,142,58,142,57,142,56,142,55,142,54,142,62,141,62,141,61,141,60,141,59,141,58,141,57,141,56,141,55,141,54;
		for(set '@i,0; '@i < getarraysize('@xy1); set '@i,'@i+2)
			setcell .mdmap$,'@xy1['@i],'@xy1['@i+1],0;
		end;
	case 3:
		unittalk "ホルル : 先に進もう。";	// 59811
		viewpoint 2, 242, 66, 1, 0xFFFF00;	// 59811
		viewpoint 2, 237, 61, 2, 0xFFFF00;	// 59811
		viewpoint 2, 221, 37, 3, 0xFFFF00;	// 59811
		viewpoint 2, 249, 79, 4, 0xFFFF00;	// 59811
		viewpoint 2, 114, 20, 5, 0xFFFF00;	// 59811
		viewpoint 1, 114, 119, 99, 0xFF0000;	// 59811
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 59811
	end;
}

1@jorchs.gat,145,59,3	script	オーレリー#19m10	10465,{/* 33180 (hide)*/
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:オーレリー#19m10(33180)
	end;
}
1@jorchs.gat,146,58,3	script	レオン#19m10	10464,{/* 35416 (hide)*/
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:レオン#19m10(35416)
	end;
}
1@jorchs.gat,145,56,1	script	ミリアム#19m10	10377,{/* 69866 (hide)*/}
1@jorchs.gat,143,56,1	script	ヴォークリンデ#19m10	10467,{/* 86073 (hide)*/}
1@jorchs.gat,140,57,5	script	アーウィン#19m10	21517,{/* 58881 (hide)*/}
1@jorchs.gat,143,60,5	script	アーウィン#19m11	21517,{/* 18533 (hide)*/}
1@jorchs.gat,140,56,5	script	アーウィン#19m12	21516,{/* 34750 */}
1@jorchs.gat,140,58,5	script	アーウィン#19m13	21516,{/* 44763 */
	unittalk getnpcid(0, getmdnpcname("アーウィン#19m12")),"アーウィン : この先は、まだ捜索が済んでいません！";	// 34750
	if(!sleep2(500)) end;
	unittalk getnpcid(0, getmdnpcname("アーウィン#19m13")),"アーウィン : 周囲の安全が確保されたら進入する予定です！　まずは周囲の捜索に専念してください。";	// 44763
	if(!sleep2(500)) end;
	end;
}

1@jorchs.gat,112,116,0	script	sw_2_0	139,14,14,{/* 60886 (hide)*/
	viewpoint 1, 75, 23, 1, 0xFFFF00;	// 60886
	viewpoint 1, 51, 45, 2, 0xFFFF00;	// 60886
	viewpoint 1, 31, 59, 3, 0xFFFF00;	// 60886
	viewpoint 1, 23, 57, 4, 0xFFFF00;	// 60886
	viewpoint 1, 21, 97, 5, 0xFFFF00;	// 60886
	viewpoint 1, 114, 119, 99, 0xFF0000;	// 60886
	end;
}
1@jorchs.gat,112,116,7	script	アーウィン#19m20	21517,{/* 81046 */
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : もっと近づこう",1;
		end;
	}
	switch(.scean) {
	case 3:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		stopnpctimer;
		misceffect 16;	// 81046
		if(!sleep2(500)) end;
		announce "アーウィン : ルガンを排除する方法を検討しますから、周囲の捜索をお願いします。", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		if(!sleep2(200)) end;
		hideonnpc getmdnpcname("sw_1_1");	// 51002
		hideonnpc getmdnpcname("ホルル#19m10");	// 59811
		hideoffnpc getmdnpcname("sw_2_0");	// 60886
		donpcevent getmdnpcname("ConfusedNestControl3")+ "::OnStart";
		end;
	case 4:
		unittalk "アーウィン : ルガンたちが壁を作ってます！　奴らを排除する方法を検討中ですから、その間に周囲の捜索をお願いします！";	// 81046
		viewpoint 1, 75, 23, 1, 0xFFFF00;	// 81046
		viewpoint 1, 51, 45, 2, 0xFFFF00;	// 81046
		viewpoint 1, 31, 59, 3, 0xFFFF00;	// 81046
		viewpoint 1, 23, 57, 4, 0xFFFF00;	// 81046
		viewpoint 1, 21, 97, 5, 0xFFFF00;	// 81046
		viewpoint 1, 114, 119, 99, 0xFF0000;	// 81046
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 81046
	end;
}
1@jorchs.gat,114,119,3	script	アーウィン#19m21	21517,{/* 51577 */}

1@jorchs.gat,0,0,0	script	ConfusedNestControl3	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set 'mob_num,5;
	set .scean,4;
	hideoffnpc getmdnpcname("足止めされたルガン#19m10");
	hideoffnpc getmdnpcname("足止めされたルガン#19m11");
	set '@label$,getmdnpcname("ConfusedNestControl3")+ "::OnKilled";
	monster .mdmap$,31,59,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,53,44,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,75,23,"巻き込まれた中級ルガン",21535,1,'@label$;
	end;
OnKilled:
	set 'mob_num,'mob_num-1;
	initnpctimer;
	end;
OnTimer500:
	if('mob_num > 0) {
		stopnpctimer;
		announce "‐他にも何かありそうだ。捜索を継続しよう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	else {
		hideoffnpc getmdnpcname("ホルル#19m20");	// 52504
		hideonnpc getmdnpcname("sw_2_0");	// 60886
		announce "‐周囲のルガンは片付いたようだ‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	end;
OnTimer3500:
	announce "ホルル : ルガンの壁を崩すぞ！", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	end;
OnTimer4500:
	misceffect 16,getmdnpcname("ホルル#19m20");
	end;
OnTimer6500:
	announce "‐ルガンの壁の位置へ向かってみよう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	end;
OnTimer8500:
	stopnpctimer;
	set .scean,5;
	donpcevent getmdnpcname("ホルル#19m20")+ "::OnStart";
	end;
}

1@jorchs.gat,23,57,5	script	足止めされたルガン#19m10	21600,5,5,{/* 57878 (hide)*/
	// 未調査
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "足止めされたルガン : みんなどこへ行ったんだ……？　卵を守らないと………";	// 57878
	end;
OnTimer3000:
	unittalk "足止めされたルガン : 人間……？　人間はここに立ちいるな！　早く向こうへ行けっ！";	// 57878
	end;
OnTimer5000:
	unittalk "足止めされたルガン : うっ！　か、身体が…！　栄養剤を打ってもらったのに…？";	// 57878
	end;
OnTimer7000:
	unittalk "足止めされたルガン : あ…寒い……";	// 57878
	end;
OnTimer9000:
	stopnpctimer;
	misceffect 594;	// 57878
	hideonnpc;	// 57878
	set '@label$,getmdnpcname("ConfusedNestControl3")+ "::OnKilled";
	monster .mdmap$,23,57,"改造された上級ルガン",21534,1,'@label$;
	end;
}

1@jorchs.gat,21,97,5	script	足止めされたルガン#19m11	21600,5,5,{/* 97573 (hide)*/
	// 未調査
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "足止めされたルガン : 早く中心部へ行くんだ……早く、早く!!";	// 97573
	end;
OnTimer3000:
	unittalk "足止めされたルガン : いつ変身するんだ!?　変身さえできれば中心部に行くことができる!!。";	// 97573
	end;
OnTimer5000:
	unittalk "足止めされたルガン : おお…さ、寒い……!!";	// 97573
	end;
OnTimer7000:
	unittalk "足止めされたルガン : ……いよいよだ！　私も主教級になれ……!?";	// 97573
	end;
OnTimer9000:
	stopnpctimer;
	misceffect 594;	// 97573
	hideonnpc;	// 97573
	set '@label$,getmdnpcname("ConfusedNestControl3")+ "::OnKilled";
	monster .mdmap$,21,97,"改造された上級ルガン",21534,1,'@label$;
	end;
}

1@jorchs.gat,112,119,0	script	sw_2_1	139,14,14,{/* 5473 (hide)*/
	viewpoint 2, 23, 57, 1, 0xFFFF00;	// 84096
	viewpoint 2, 21, 97, 2, 0xFFFF00;	// 84096
	viewpoint 2, 75, 23, 3, 0xFFFF00;	// 84096
	viewpoint 2, 51, 45, 4, 0xFFFF00;	// 84096
	viewpoint 2, 31, 59, 5, 0xFFFF00;	// 84096
	viewpoint 1, 142, 144, 1, 0xFFFF00;	// 84096
	viewpoint 1, 159, 151, 2, 0xFFFF00;	// 84096
	viewpoint 1, 180, 139, 3, 0xFFFF00;	// 84096
	viewpoint 1, 200, 131, 4, 0xFFFF00;	// 84096
	viewpoint 1, 216, 135, 5, 0xFFFF00;	// 84096
	viewpoint 1, 226, 141, 6, 0xFFFF00;	// 84096
	viewpoint 1, 236, 151, 7, 0xFFFF00;	// 84096
	viewpoint 1, 251, 171, 99, 0xFF0000;	// 84096
	end;
}
1@jorchs.gat,112,119,5	script	ホルル#19m20	21518,{/* 52504 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : もっと近づこう",1;
		end;
	}
	switch(.scean) {
	case 4:
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 52504
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 52504
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 52504
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 52504
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 52504
		end;
	case 5:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		stopnpctimer;
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 52504
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 52504
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 52504
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 52504
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 52504
		misceffect 16;	// 52504
		if(!sleep2(500)) end;
		unittalk getnpcid(0, getmdnpcname("アーウィン#19m20")),"アーウィン : ルガンたちの群れが道を塞いでいます！";	// 81046
		if(!sleep2(2000)) end;
		unittalk "ホルル : 奴らを排除する！　突撃!!";	// 52504
		if(!sleep2(1500)) end;
		hideonnpc;	// 52504
		hideonnpc getmdnpcname("アーウィン#19m20");	// 81046
		hideonnpc getmdnpcname("アーウィン#19m21");	// 51577
		if(!sleep2(1500)) end;
		hideoffnpc getmdnpcname("ホルル#19m21");	// 18653
		hideoffnpc getmdnpcname("アーウィン#19m22");	// 33307
		hideoffnpc getmdnpcname("アーウィン#19m23");	// 37536
		if(!sleep2(1000)) end;
		misceffect 636,getmdnpcname("ホルル#19m21");	// 18653
		misceffect 636,getmdnpcname("アーウィン#19m22");	// 33307
		misceffect 636,getmdnpcname("アーウィン#19m23");	// 37536
		misceffect 567,getmdnpcname("ホルル#19m21");	// 18653
		misceffect 567,getmdnpcname("アーウィン#19m22");	// 33307
		misceffect 567,getmdnpcname("アーウィン#19m23");	// 37536
		misceffect 585,getmdnpcname("ホルル#19m21");	// 18653
		misceffect 585,getmdnpcname("アーウィン#19m22");	// 33307
		misceffect 585,getmdnpcname("アーウィン#19m23");	// 37536
		unittalk getnpcid(0, getmdnpcname("ホルル#19m21")),"ホルル : くっ！";	// 18653
		if(!sleep2(1500)) end;
		hideonnpc getmdnpcname("ホルル#19m21");	// 18653
		hideonnpc getmdnpcname("アーウィン#19m22");	// 33307
		hideonnpc getmdnpcname("アーウィン#19m23");	// 37536
		if(!sleep2(1500)) end;
		hideoffnpc;	// 52504
		hideoffnpc getmdnpcname("アーウィン#19m20");	// 81046
		hideoffnpc getmdnpcname("アーウィン#19m21");	// 51577
		unittalk "ホルル : 数が多過ぎる！";	// 52504
		if(!sleep2(2000)) end;
		hideoffnpc getmdnpcname("ハートハンター#19m20");	// 49580
		unittalk getnpcid(0, getmdnpcname("ハートハンター#19m20")),"ハートハンター : もうここまで来たのか？";	// 49580
		if(!sleep2(2000)) end;
		unittalk "ホルル : あれは……ハートハンターか？";	// 52504
		if(!sleep2(2000)) end;
		unittalk getnpcid(0, getmdnpcname("ハートハンター#19m20")),"ハートハンター : こちら5次防御線、支援を要請する。繰り返す支援を……。";	// 49580
		if(!sleep2(2500)) end;
		hideoffnpc getmdnpcname("ハートハンター#19m21");	// 56070
		hideoffnpc getmdnpcname("ハートハンター#19m22");	// 69632
		unittalk getnpcid(0, getmdnpcname("ハートハンター#19m22")),"ハートハンター : 何が起きた？";	// 69632
		if(!sleep2(2000)) end;
		unittalk getnpcid(0, getmdnpcname("ハートハンター#19m20")),"ハートハンター : 侵入者たちが、ここまで来た。";	// 49580
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("ハートハンター#19m21")),"ハートハンター : バゴット様の言う通りだな。ルガンを操り、防壁を作り出しておいて良かった。";	// 56070
		if(!sleep2(2000)) end;
		unittalk getnpcid(0, getmdnpcname("ハートハンター#19m20")),"ハートハンター : ああ、例のルガンを操る装置のことか。";	// 49580
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m20")),"ハートハンター : お前は他の装置を起動しに行け。ここは俺がやる。";	// 89500
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m22")),"ハートハンター : よし、任せたぞ！";	// 89558
		if(!sleep2(2000)) end;
		hideonnpc getmdnpcname("ハートハンター#19m22");	// 89558
		unittalk "ホルル : 別れて何をする気だ!?　私は別れた奴を追うから、ここは冒険者に任せる！";	// 84414
		if(!sleep2(500)) end;
		donpcevent getmdnpcname("ConfusedNestControl4")+ "::OnStart";
		end;
	case 6:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		stopnpctimer;
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 84414
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 84414
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 84414
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 84414
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 84414
		misceffect 16;	// 84414
		unittalk "ホルル : ふぅ、こっちは片づいたが、この装置はいったい何だ？";	// 84414
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("アーウィン#19m21")),"アーウィン : ハートハンターが持っていた装置ですね？";	// 78716
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("アーウィン#19m20")),"アーウィン : ハートハンターは、ルガンを操るとか言ってました！";	// 79001
		if(!sleep2(2500)) end;
		unittalk "ホルル : ふむ。これがルガンを操る為の装置というわけか。";	// 84414
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("アーウィン#19m21")),"アーウィン : ハートハンターを片付ければ、ルガンたちの防壁を解体できそうです。";	// 78716
		if(!sleep2(2500)) end;
		unittalk "ホルル : そうみたいだな。冒険者は先に進んでくれ。私はこの情報を他の部隊にも共有しにいく。";	// 84414
		if(!sleep2(500)) end;
		announce "ホルル : ルガンを排除しつつ、先に進んでくれ！", 0x9, 0x00ffcc;
		if(!sleep2(500)) end;
		hideoffnpc getmdnpcname("sw_2_1");	// 84096
		hideonnpc getmdnpcname("アーウィン#19m20");	// 79001
		hideonnpc getmdnpcname("アーウィン#19m21");	// 78716
		set .scean,7;
		misceffect 224,getmdnpcname("ねじられたルガン#19m20");	// 89738
		misceffect 224,getmdnpcname("潰れたルガン#19m21");	// 90218
		misceffect 224,getmdnpcname("叫ぶルガン#19m22");	// 90663
		misceffect 224,getmdnpcname("改造された上級ルガン#19m23");	// 90904
		misceffect 224,getmdnpcname("苦しんでるルガン#19m24");	// 91771
		misceffect 224,getmdnpcname("合わせられたルガン#19m25");	// 93998
		announce "‐まだ、この区画にルガンが残っているようだ‐", 0x9, 0x00ffcc;
		setarray '@xy2, 124,130,124,129,124,128,124,127,124,126,123,130,123,129,123,128,123,127,123,126,122,130,122,129,122,128,122,127,122,126,121,130,121,129,121,128,
						121,127,121,126,120,130,120,129,120,128,120,127,120,126,119,130,119,129,119,128,119,127,119,126,129,126,129,125,129,124,128,126,128,125,128,124,
						127,126,127,125,127,124,126,126,126,125,126,124,125,126,125,125,125,124,124,126,124,125,124,124,123,126,123,125,123,124,122,126,122,125,122,124;
		for(set '@i,0; '@i < getarraysize('@xy2); set '@i,'@i+2)
			setcell .mdmap$,'@xy2['@i],'@xy2['@i+1],0;
		donpcevent getmdnpcname("ConfusedNestControl4")+ "::OnStart2";
		end;
	case 7:
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 84414
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 84414
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 84414
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 84414
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 84414
		unittalk "ホルル : ルガンを排除しつつ、先に進んでくれ！";	// 84414
		viewpoint 1, 142, 144, 1, 0xFFFF00;	// 84414
		viewpoint 1, 159, 151, 2, 0xFFFF00;	// 84414
		viewpoint 1, 180, 139, 3, 0xFFFF00;	// 84414
		viewpoint 1, 200, 131, 4, 0xFFFF00;	// 84414
		viewpoint 1, 216, 135, 5, 0xFFFF00;	// 84414
		viewpoint 1, 226, 141, 6, 0xFFFF00;	// 84414
		viewpoint 1, 236, 151, 7, 0xFFFF00;	// 84414
		viewpoint 1, 251, 171, 99, 0xFF0000;	// 84414
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 52504
	end;
}

1@jorchs.gat,118,127,7	script	ホルル#19m21	21518,{/* 18653 (hide)*/}
1@jorchs.gat,122,126,7	script	アーウィン#19m22	21517,{/* 33307 (hide)*/}
1@jorchs.gat,124,124,7	script	アーウィン#19m23	21517,{/* 37536 (hide)*/}

1@jorchs.gat,120,129,1	script	ねじられたルガン#19m20	21535,{/* 59918 */}
1@jorchs.gat,120,127,3	script	潰れたルガン#19m21	21535,{/* 85717 */}
1@jorchs.gat,122,127,3	script	叫ぶルガン#19m22	21535,{/* 18674 */}
1@jorchs.gat,123,127,1	script	改造された上級ルガン#19m23	21534,{/* 41048 */}
1@jorchs.gat,124,126,3	script	苦しんでるルガン#19m24	21535,{/* 53325 */}
1@jorchs.gat,125,125,3	script	合わせられたルガン#19m25	21535,{/* 73571 */}
1@jorchs.gat,126,125,3	script	ねじられたルガン#19m26	21535,{/* 38462 */}

1@jorchs.gat,119,123,3	script	ハートハンター#19m20	21536,{/* 49580 (hide)*/}
1@jorchs.gat,116,124,3	script	ハートハンター#19m21	21536,{/* 56070 (hide)*/}
1@jorchs.gat,123,124,3	script	ハートハンター#19m22	21536,{/* 69632 (hide)*/}

1@jorchs.gat,0,0,0	script	ConfusedNestControl4	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideoffnpc getmdnpcname("足止めされたルガン#19m10");
	hideonnpc getmdnpcname("ホルル#19m20");	// 84414
	hideonnpc getmdnpcname("アーウィン#19m20");	// 79001
	hideonnpc getmdnpcname("アーウィン#19m21");	// 78716
	hideonnpc getmdnpcname("ハートハンター#19m20");	// 89500
	hideonnpc getmdnpcname("ハートハンター#19m21");	// 89545
	set '@label$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled";
	monster .mdmap$,119,123,"ハートハンターAT",21536,1,'@label$;
	monster .mdmap$,122,123,"ハートハンターAT",21536,1,'@label$;
	monster .mdmap$,118,125,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,122,123,"巻き込まれた中級ルガン",21535,1,'@label$;
	end;
OnKilled:
	set '@mob,getmapmobs(.mdmap$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled");
	if('@mob <= 0) {
		initnpctimer;
		hideoffnpc getmdnpcname("ハートハンター#19m20");	// 89500
		announce "ハートハンター : くっ、このまま終わると思うなよ……！", 0x9, 0x00ffcc;
	}
	end;
OnTimer1500:
	set 'mob_num,5;
	hideonnpc getmdnpcname("ハートハンター#19m20");	// 89500
	hideonnpc getmdnpcname("ねじられたルガン#19m20");	// 89738
	monster .mdmap$,118,127,"巻き込まれた中級ルガン",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	hideonnpc getmdnpcname("叫ぶルガン#19m22");	// 90663
	hideonnpc getmdnpcname("苦しんでるルガン#19m24");	// 91771
	hideonnpc getmdnpcname("合わせられたルガン#19m25");	// 93998
	monster .mdmap$,124,123,"巻き込まれた中級ルガン",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	end;
OnTimer4500:
	stopnpctimer;
	hideonnpc getmdnpcname("潰れたルガン#19m21");	// 90218
	monster .mdmap$,120,125,"巻き込まれた中級ルガン",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	hideonnpc getmdnpcname("改造された上級ルガン#19m23");	// 90904
	monster .mdmap$,121,124,"巻き込まれた中級ルガン",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	hideonnpc getmdnpcname("ねじられたルガン#19m26");	// 94367
	monster .mdmap$,123,123,"巻き込まれた中級ルガン",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	end;
OnKilled2:
	set 'mob_num,'mob_num - 1;;
	if('mob_num <= 0) {
		hideoffnpc getmdnpcname("ホルル#19m20");	// 84414
		hideoffnpc getmdnpcname("アーウィン#19m20");	// 79001
		hideoffnpc getmdnpcname("アーウィン#19m21");	// 78716
		unittalk getnpcid(0,getmdnpcname("ホルル#19m20")),"ホルル : こっちも片付いた！　話がしたいから、こっちにきてくれ！";	// 84414
		announce "ホルル : こっちも片付いた！　話がしたいから、こっちにきてくれ！", 0x9, 0x00ffcc;
		donpcevent getmdnpcname("ホルル#19m20")+ "::OnStart";
		set .scean,6;
	}
	end;
OnStart2:
	if('flag == 2)
		end;
	set 'flag,2;
	set '@label$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled3";
	monster .mdmap$,142,144,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,159,151,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,180,139,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,200,131,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,216,135,"巻き込まれた中級ルガン",21535,1,'@label$;
	monster .mdmap$,226,141,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,236,151,"改造された上級ルガン",21534,1,'@label$;
	end;
OnKilled3:
	set '@mob,getmapmobs(.mdmap$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled3");
	if('@mob <= 0) {
		announce "‐この区画からルガンの気配が消えた。東へ進もう‐", 0x9, 0x00ffcc;
		hideoffnpc getmdnpcname("ヴォークリンデ#19m30");	// 30262
		hideoffnpc getmdnpcname("ミリアム#19m30");	// 30263
		donpcevent getmdnpcname("ヴォークリンデ#19m30")+ "::OnStart";	// 30262
	}
	else
		announce "‐まだ、この区画にルガンが残っているようだ‐", 0x9, 0x00ffcc;
	end;
}

1@jorchs.gat,251,171,0	script	sw_3_0	139,14,14,{/* 30256 (hide)*/
	viewpoint 2, 142, 144, 1, 0xFFFF00;	// 30256
	viewpoint 2, 159, 151, 2, 0xFFFF00;	// 30256
	viewpoint 2, 180, 139, 3, 0xFFFF00;	// 30256
	viewpoint 2, 200, 131, 4, 0xFFFF00;	// 30256
	viewpoint 2, 216, 135, 5, 0xFFFF00;	// 30256
	viewpoint 2, 226, 141, 6, 0xFFFF00;	// 30256
	viewpoint 2, 236, 151, 7, 0xFFFF00;	// 30256
	viewpoint 2, 251, 171, 99, 0xFF0000;	// 30256
	if(.scean == 8)
		viewpoint 1, 219, 148, 1, 0xFF3355;	// 30256
	if(.scean == 9)
		viewpoint 1, 226, 244, 1, 0xFF3355;	// 30256
	if(.scean == 10)
		viewpoint 1, 191, 203, 1, 0xFF3355;	// 30256
	end;
}

1@jorchs.gat,251,171,1	script	ヴォークリンデ#19m30	10467,{/* 30262 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : もっと近づこう",1;
		end;
	}
	switch(.scean) {
	case 7:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		stopnpctimer;
		viewpoint 2, 142, 144, 1, 0xFFFF00;	// 30262
		viewpoint 2, 159, 151, 2, 0xFFFF00;	// 30262
		viewpoint 2, 180, 139, 3, 0xFFFF00;	// 30262
		viewpoint 2, 200, 131, 4, 0xFFFF00;	// 30262
		viewpoint 2, 216, 135, 5, 0xFFFF00;	// 30262
		viewpoint 2, 226, 141, 6, 0xFFFF00;	// 30262
		viewpoint 2, 236, 151, 7, 0xFFFF00;	// 30262
		misceffect 16;	// 30262
		if(!sleep2(500)) end;
		announce "ヴォークリンデ : ルガンたちが集まっているわね。", 0x9, 0x00ffcc;
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ミリアム#19m30")),"ミリアム : 冒険者様、大丈夫ですか？";	// 30263
		if(!sleep2(2000)) end;
		unittalk "ヴォークリンデ : ルガンたちが、ハートハンターに操られているんだって？";	// 30262
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("ミリアム#19m30")),"ミリアム : 仲間を防御壁に使うなんて……。";	// 30263
		if(!sleep2(2000)) end;
		unittalk "ヴォークリンデ : そんな良心があるなら、そもそも体を改造するなんてしないわよ。";	// 30262
		if(!sleep2(2000)) end;
		hideoffnpc getmdnpcname("ハートハンター#19m30");	// 30264
		hideoffnpc getmdnpcname("ハートハンター#19m31");	// 30265
		hideoffnpc getmdnpcname("ハートハンター#19m32");	// 30266
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m30")),"ハートハンター : 私たちは望んで、この身体を手に入れたんだ。";	// 30264
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m31")),"ハートハンター : この上級ルガンたちも同じだ。";	// 30265
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m32")),"ハートハンター : 最上級に成れるチャンスと伝えたら、みんなで喜んで列に並んだよ。";	// 30266
		if(!sleep2(2500)) end;
		unittalk "ヴォークリンデ : その中級ルガンたちも望んでその姿になったのかい？";	// 30262
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m30")),"ハートハンター : ……中級たちは仕方がなかった。";	// 30264
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m32")),"ハートハンター : たまたま、偶然、そういう場にいただけだな。";	// 30266
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ミリアム#19m30")),"ミリアム : 上級以上のルガンを集めて、何をするつもり？";	// 30263
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m32")),"ハートハンター : 教えて欲しい？　どうしようかな～。";	// 30266
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ヴォークリンデ#19m30")),"ヴォークリンデ : こいつらはただの時間稼ぎね。相手にする必要はないわ。";	// 30262
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m30")),"ハートハンター : バレた？　もう少し俺たちと遊んで欲しいなぁ！　えい！";	// 30264
		if(!sleep2(2000)) end;
		misceffect 563,getmdnpcname("ハートハンター#19m32");	// 30266
		announce "注入装置1が稼働されました。", 0x9, 0x00ffcc;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m32")),"ハートハンター : 上級卵を瞬時に孵化させる装置だ！";	// 30266
		misceffect 515,getmdnpcname("ハートハンター#19m32");	// 30266
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m32")),"ハートハンター : 装置が起動している限り、　改造された上級ルガンが次々続いて出てくるぜ。";	// 30266
		if(!sleep2(2500)) end;
		unittalk "ヴォークリンデ : つまり装置を止めれば良いわけね。教えてくれてありがとう。";	// 30262
		emotion 23,getmdnpcname("ハートハンター#19m30");	// 30264
		emotion 23,getmdnpcname("ハートハンター#19m31");	// 30265
		emotion 23,getmdnpcname("ハートハンター#19m32");	// 30266
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m31")),"ハートハンター : そうはいくかよ！　支援を呼べ！";	// 30265
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m30")),"ハートハンター : 俺は次の装置に向かう！";	// 30264
		if(!sleep2(2000)) end;
		hideonnpc getmdnpcname("ハートハンター#19m30");	// 30264
		hideonnpc getmdnpcname("ハートハンター#19m31");	// 30265
		hideonnpc getmdnpcname("ハートハンター#19m32");	// 30266
		unittalk "ヴォークリンデ : まずは目の前にいるルガンを倒しましょう!!";	// 30262
		hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30267
		set '@label$,getmdnpcname("ヴォークリンデ#19m30")+ "::OnKilled";
		monster .mdmap$,249,175,"改造された上級ルガン",21534,1,'@label$;
		hideonnpc getmdnpcname("ねじられたルガン#19m37");	// 30274
		monster .mdmap$,242,173,"巻き込まれた中級ルガン",21535,1,'@label$;
		if(!sleep2(3000)) end;
		hideonnpc getmdnpcname("ねじられたルガン#19m31");	// 30268
		monster .mdmap$,248,175,"巻き込まれた中級ルガン",21535,1,'@label$;
		hideonnpc getmdnpcname("潰れたルガン#19m35");	// 30272
		monster .mdmap$,244,175,"巻き込まれた中級ルガン",21535,1,'@label$;
		if(!sleep2(3000)) end;
		hideonnpc getmdnpcname("合わせられたルガン#19m3");	// 30269
		monster .mdmap$,247,175,"巻き込まれた中級ルガン",21535,1,'@label$;
		hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30271
		monster .mdmap$,245,175,"改造された上級ルガン",21534,1,'@label$;
		if(!sleep2(3000)) end;
		hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30273
		monster .mdmap$,243,173,"改造された上級ルガン",21534,1,'@label$;
		hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30270
		monster .mdmap$,246,175,"改造された上級ルガン",21534,1,'@label$;
		//10秒ごとに!~!!!!!ランダム
		unittalk "!!!!!";	// 30262
		unittalk getnpcid(0,getmdnpcname("ミリアム#19m30")),"!!!!!";	// 30263
		end;
	case 8:
		viewpoint 2, 142, 144, 1, 0xFFFF00;	// 30262
		viewpoint 2, 159, 151, 2, 0xFFFF00;	// 30262
		viewpoint 2, 180, 139, 3, 0xFFFF00;	// 30262
		viewpoint 2, 200, 131, 4, 0xFFFF00;	// 30262
		viewpoint 2, 216, 135, 5, 0xFFFF00;	// 30262
		viewpoint 2, 226, 141, 6, 0xFFFF00;	// 30262
		viewpoint 2, 236, 151, 7, 0xFFFF00;	// 30262
		misceffect 16;	// 30262
		unittalk "ヴォークリンデ : この先に逃げたハートハンターは、私たちが追うわ。";	// 30262
		viewpoint 1, 219, 148, 1, 0xFF3355;	// 30262
		if(!sleep2(500)) end;
		unittalk "ヴォークリンデ : 悪いけど、いったん戻って、注入装置を止めてちょうだい。";	// 30262
		setarray '@xy3, 250,177,250,176,249,177,249,176,248,177,248,176,247,177,247,176,246,177,246,176,245,177,245,176,244,177,244,176,243,177,243,176,243,175,243,174,242,177,
						242,176,242,175,242,174,241,177,241,176,241,175,241,174,240,177,240,176,240,175,240,174,239,177,239,176,239,175,239,174,238,177,238,176,238,175,238,174;
		for(set '@i,0; '@i < getarraysize('@xy3); set '@i,'@i+2)
			setcell .mdmap$,'@xy3['@i],'@xy3['@i+1],0;
		if(!sleep2(2000)) end;
		hideonnpc;	// 30262
		hideonnpc getmdnpcname("ミリアム#19m30");	// 30263
		hideoffnpc getmdnpcname("sw_3_0");	// 30256
		hideoffnpc getmdnpcname("注入装置1#19m30");
		announce "‐注入装置1が稼動しました‐", 0x9, 0x00ffcc;
		donpcevent getmdnpcname("注入装置1#19m30")+ "::OnStart";
		end;
	}
	end;
OnKilled:
	set '@mob,getmapmobs(.mdmap$,getmdnpcname("ヴォークリンデ#19m30")+ "::OnKilled");
	if('@mob <= 0) {
		announce "ヴォークリンデ : 片付いたみたいね。", 0x9, 0x00ffcc;
		unittalk "ヴォークリンデ : 片付いたみたいね。";	// 30262
		set .scean,8;
		initnpctimer;
		//消えるタイミング未調査
		hideonnpc getmdnpcname("sw_2_1");	// 30906
		hideonnpc getmdnpcname("ホルル#19m20");	// 30940
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 52504
	end;
}
1@jorchs.gat,249,170,1	script	ミリアム#19m30	10377,{/* 30263 (hide)*/}
1@jorchs.gat,248,173,5	script	ハートハンター#19m30	21536,{/* 30264 (hide)*/}
1@jorchs.gat,246,173,5	script	ハートハンター#19m31	21536,{/* 30265 (hide)*/}
1@jorchs.gat,243,173,5	script	ハートハンター#19m32	21536,{/* 30266 (hide)*/}
1@jorchs.gat,249,177,1	script	改造された上級ルガン#19	21534,{/* 30267 */}
1@jorchs.gat,248,176,3	script	ねじられたルガン#19m31	21535,{/* 30268 */}
1@jorchs.gat,247,176,3	script	合わせられたルガン#19m3	21535,{/* 30269 */}
1@jorchs.gat,246,176,1	script	改造された上級ルガン#19	21534,{/* 30270 */}
1@jorchs.gat,245,176,3	script	改造された上級ルガン#19	21534,{/* 30271 */}
1@jorchs.gat,244,176,3	script	潰れたルガン#19m35	21535,{/* 30272 */}
1@jorchs.gat,243,175,3	script	改造された上級ルガン#19	21534,{/* 30273 */}
1@jorchs.gat,242,174,3	script	ねじられたルガン#19m37	21535,{/* 30274 */}

1@jorchs.gat,219,148,5	script	注入装置1#19m30	10043,{/* 30275 (hide)*/
	if('flag) {
		unittalk getcharid(3),strcharinfo(0)+" : 次の装置へ向かおう",1;	// self:hidden
		viewpoint 1, 226, 244, 1, 0xFF3355;	// 30275
		end;
	}
	set '@label$,getmdnpcname("注入装置1#19m30")+ "::OnKilled";
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
		end;
	}
	if(getmapmobs(.mdmap$,'@label$) > 0) {
		unittalk "‐今は操作できない‐";	// 30275
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : 近くの卵からルガンが生まれたようだ";
	viewpoint 1, 227, 153, 2, 0xFFFF00;	// 30275
	misceffect 456;	// 30275
	misceffect 496;	// 30275
	set '@mob[0],callmonster(.mdmap$,227,153,"改造された上級ルガン",21534,'@label$);
	set '@mob[1],callmonster(.mdmap$,224,151,"ハートハンターAT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,225,141,"ハートハンターAT#2",21536,'@label$);
	set '@mob[3],callmonster(.mdmap$,217,141,"ハートハンターAT#3",21536,'@label$);
	unittalk '@mob[1],"ハートハンター : 装置は稼動したのに、孵化したのは一匹だけだと!?";	// 78866:ハートハンターAT#1
	unittalk '@mob[2],"ハートハンター : 注入装置を止めたのか!!　孵化できなかったヤツは全滅だ！";	// 78867:ハートハンターAT#2
	unittalk '@mob[3],"ハートハンター : ハッ！　呼ばれて来てみれば、このザマかよ!!";	// 78868:ハートハンターAT#3
	end;
OnKilled:
	if(getmapmobs(.mdmap$,getmdnpcname("注入装置1#19m30")+ "::OnKilled") <= 0) {
		set 'flag,1;
		set .scean,9;
		announce "‐注入装置1が停止しました‐", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		announce "‐注入装置2が追加稼動されます‐", 0x9, 0x00ffcc;
		hideoffnpc getmdnpcname("注入装置2#19m31");
		donpcevent getmdnpcname("注入装置2#19m31")+ "::OnStart";
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30275
	end;
}
1@jorchs.gat,226,244,7	script	注入装置2#19m31	10043,{/* 30276 (hide)*/
	if('flag) {
		unittalk getcharid(3),strcharinfo(0)+" : 次の装置へ向かおう",1;	// self:hidden
		viewpoint 1, 191, 203, 1, 0xFF3355;	// 30276
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
		end;
	}
	if(getmapmobs(.mdmap$,getmdnpcname("注入装置2#19m31")+ "::OnKilled") > 0) {
		unittalk "‐今は操作できない‐";	// 30276
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : 北の方の卵からルガンが生まれたようだ";
	viewpoint 1, 223, 278, 2, 0xFFFF00;	// 30276
	misceffect 456;	// 30276
	misceffect 496;	// 30276
	monster .mdmap$,223,278,"改造された上級ルガン",21534,1,getmdnpcname("注入装置2#19m31")+ "::OnKilled";
	end;
OnKilled:
	if(getmapmobs(.mdmap$,getmdnpcname("注入装置2#19m31")+ "::OnKilled") <= 0) {
		set 'flag,1;
		set .scean,10;
		announce "‐注入装置2が停止しました‐", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		announce "‐注入装置3が追加稼動されます‐", 0x9, 0x00ffcc;
		hideoffnpc getmdnpcname("注入装置3#19m32");
		donpcevent getmdnpcname("注入装置3#19m32")+ "::OnStart";
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30276
	end;
}
1@jorchs.gat,191,203,7	script	注入装置3#19m32	10043,{/* 30277 (hide)*/
	if('flag) {
		unittalk getcharid(3),strcharinfo(0)+" : ここから南西で誰かが呼んでいるようだ",1;	// self:hidden
		viewpoint 1, 151, 179, 1, 0xFF3355;	// 30277
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
		end;
	}
	if(getmapmobs(.mdmap$,getmdnpcname("注入装置3#19m32")+ "::OnKilled") > 0) {
		unittalk "‐今は操作できない‐";	// 30277
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : 近くの卵からルガンが生まれたようだ";	// self:hidden
	viewpoint 1, 197, 205, 2, 0xFFFF00;	// 30277
	misceffect 456;	// 30277
	misceffect 496;	// 30277
	monster .mdmap$,197,205,"改造された上級ルガン",21534,1,getmdnpcname("注入装置3#19m32")+ "::OnKilled";
	end;
OnKilled:
	if(getmapmobs(.mdmap$,getmdnpcname("注入装置3#19m32")+ "::OnKilled") <= 0) {
		set 'flag,1;
		set .scean,11;
		announce "‐注入装置3が停止しました‐", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		hideoffnpc getmdnpcname("オーレリー#19m40");	// 30282
		hideoffnpc getmdnpcname("レオン#19m40");	// 30284
		hideoffnpc getmdnpcname("ハートハンター#19m40");	// 30285
		hideoffnpc getmdnpcname("ハートハンター#19m41");	// 30286
		hideoffnpc getmdnpcname("ハートハンター#19m42");	// 30287
		hideoffnpc getmdnpcname("sw_4_0");	// 30280
		announce "オーレリー : 西の方に来てくれるかしら？", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		donpcevent getmdnpcname("オーレリー#19m40")+ "::OnStart";
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30277
	end;
}
1@jorchs.gat,145,179,0	script	sw_4_0	139,14,14,{/* 30280 */
	//?、未調査
	end;
}
1@jorchs.gat,145,179,0	script	sw_4_1	139,14,14,{/* 30281 (hide)*/
	viewpoint 1, 16, 135, 1, 0x99FFFF;	// 30281
	viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30281
	viewpoint 1, 24, 142, 3, 0x99FFFF;	// 30281
	viewpoint 1, 97, 220, 4, 0xFF0000;	// 30281
	viewpoint 1, 121, 190, 5, 0xFFFF00;	// 30281
	viewpoint 1, 86, 165, 6, 0xFFFF00;	// 30281
	viewpoint 1, 79, 154, 7, 0xFFFF00;	// 30281
	viewpoint 1, 45, 153, 8, 0xFFFF00;	// 30281
	viewpoint 1, 25, 172, 9, 0xFFFF00;	// 30281
	viewpoint 2, 97, 220, 99, 0xFF0000;	// 30281
	end;
}
1@jorchs.gat,145,179,1	script	オーレリー#19m40	10465,{/* 30282 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : もっと近づこう",1;
		end;
	}
	switch(.scean) {
	case 11:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			//未調査
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		stopnpctimer;
		viewpoint 2, 145, 179, 99, 0xFF0000;	// 30282
		misceffect 16;	// 30282
		hideonnpc getmdnpcname("sw_4_0");	// 30280
		misceffect 453,getmdnpcname("ハートハンター#19m40");	// 30285
		misceffect 453,getmdnpcname("ハートハンター#19m41");	// 30286
		misceffect 453,getmdnpcname("ハートハンター#19m42");	// 30287
		unittalk "オーレリー : お前たちは、いろんな場所で問題を起こしているそうね？";	// 30282
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("レオン#19m40")),"レオン : 良いタイミングで来てくれましたね。";	// 30284
		if(!sleep2(3000)) end;
		announce "注入装置3が再稼働されます。", 0x9, 0x00ffcc;
		unittalk "オーレリー : この者は私たちが動きを止めておくから、注入装置とやらを止めてくれないかしら？";	// 30282
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("レオン#19m40")),"レオン : 年寄りには装置の操作方法がわからなくて……こういうのは若い人にお任せします。";	// 30284
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m40")),"ハートハンター : くそっ!?　身体が動かない！";	// 30285
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m41")),"ハートハンター : 何だ!?　何故動けない？";	// 30286
		if(!sleep2(2000)) end;
		unittalk "オーレリー : これが私たちの力よ。";	// 30282
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("レオン#19m40")),"レオン : さて、君たちには聞きたいことがある。";	// 30284
		if(!sleep2(3000)) end;
		announce "オーレリー : 注入装置を止めて来てちょうだい。", 0x9, 0x00ffcc;
		//20秒毎に追加で沸く
		set '@label$,getmdnpcname("注入装置3#19m40")+ "::OnKilled";
		monster .mdmap$,199,197,"改造された上級ルガン",21534,1,'@label$;
		hideonnpc getmdnpcname("注入装置3#19m32");	// 30277
		hideoffnpc getmdnpcname("注入装置3#19m40");	// 30283
		set .scean,12;
		end;
	case 12:
		viewpoint 2, 145, 179, 99, 0xFF0000;	// 30282
		unittalk "オーレリー : まずは注入装置を止めないと。ここは私が食い止めておくわ。";	// 30282
		viewpoint 1, 192, 206, 99, 0xFF0000;	// 30282
		end;
	case 13:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		viewpoint 2, 145, 179, 99, 0xFF0000;	// 30282
		viewpoint 2, 192, 206, 99, 0xFF0000;	// 30282
		misceffect 16;	// 30282
		if(!sleep2(500)) end;
		unittalk "オーレリー : 注入装置を止めてくれて助かったわ。";	// 30282
		if(!sleep2(2000)) end;
		unittalk "オーレリー : 上級以上のルガンたちは、ラスガンドの部屋に集められたそうよ。";	// 30282
		if(!sleep2(3000)) end;
		unittalk "オーレリー : ラスガンドとバゴットが何を企んでいるのか……。";	// 30282
		if(!sleep2(2000)) end;
		unittalk "オーレリー : 急いで、ラスガンドの部屋に向かいましょう。";	// 30282
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m42")),"ハートハンター : 俺たちを解放してくれ！　知っていることは話しただろ!?";	// 30287
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("レオン#19m40")),"レオン : ふむ……どうしようか。";	// 30284
		emotion 0,getmdnpcname("レオン#19m40");	// 30284
		misceffect 563,getmdnpcname("レオン#19m40");	// 30284
		announce "魔力増幅装置、全力稼動!!!", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("レオン#19m40")),"レオン : おや？　魔力の流れがおかしいな？";	// 30284
		if(!sleep2(2000)) end;
		unittalk "オーレリー : ここはベテランである私たちが対処した方が良さそうね。";	// 30282
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("レオン#19m40")),"レオン : ここはお任せします。";	// 30284
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("レオン#19m40")),"レオン : 急で申し訳ありませんが、よろしくお願いします。";	// 30284
		if(!sleep2(2000)) end;
		hideonnpc getmdnpcname("レオン#19m40");	// 30284
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m40")),"ハートハンター : やっと解放されたぜ！";	// 30285
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m41")),"ハートハンター : 冒険者が相手ならビビる必要はねぇ！　掛かってきな！";	// 30286
		if(!sleep2(2000)) end;
		unittalk "オーレリー : 大口叩いちゃって……それじゃあ、後はお願いね。。";	// 30282
		donpcevent getmdnpcname("ConfusedNestControl5")+ "::OnStart";
		end;
	}
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:オーレリー#19m40(30282)
	end;
}
1@jorchs.gat,192,206,5	script	注入装置3#19m40	10043,5,5,{/* 30283 (hide)*/
	if(.scean == 13) {
		viewpoint 1, 151, 179, 99, 0xFF0000;	// 30283
		unittalk getcharid(3),strcharinfo(0)+" : オーレリーの所へ向かおう",1;	// self:hidden
		end;
	}
	switch('flag) {
	case 0:
		set '@label$,getmdnpcname("注入装置3#19m40")+ "::OnKilled";
		if('flag == 0 && getmapmobs(.mdmap$,'@label$) == 0) {
			set 'flag,1;
			set '@mob[1],callmonster(.mdmap$,191,199,"ハートハンターAT#1",21536,'@label$);
			set '@mob[2],callmonster(.mdmap$,199,197,"ハートハンターAT#2",21536,'@label$);
			set '@mob[3],callmonster(.mdmap$,202,207,"ハートハンターAT#3",21536,'@label$);
			unittalk '@mob[1],"ハートハンター : ちくしょう！　装置を停止させたのか!!";	// 93280:ハートハンターAT#1
			unittalk '@mob[2],"ハートハンター : そいつから離れた方が、お前のためだぞ！";	// 93281:ハートハンターAT#2
			unittalk '@mob[3],"ハートハンター : 何が起きても知らないからな!!";	// 93282:ハートハンターAT#3
		}
		end;
	case 1:
		end;
	case 2:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "‐パーティーリーダーが進行を開始するまでお待ちください‐",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// 未調査
			end;
		}
		unittalk "‐注入装置が停止されました‐";	// 30283
		if(!sleep2(500)) end;
		announce "オーレリー : 装置が停止したわね。こちらへ来てちょうだい。", 0x9, 0x00ffcc;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : オーレリーの所へ向かおう",1;	// self:hidden
		donpcevent getmdnpcname("オーレリー#19m40")+ "::OnStart";
		viewpoint 1, 151, 179, 99, 0xFF0000;	// 30283
		set .scean,13;
		end;
	}
	end;
OnTouch:
	set '@label$,getmdnpcname("注入装置3#19m40")+ "::OnKilled";
	if('flag == 0 && getmapmobs(.mdmap$,'@label$) == 0) {
		set 'flag,1;
		set '@mob[1],callmonster(.mdmap$,191,199,"ハートハンターAT#1",21536,'@label$);
		set '@mob[2],callmonster(.mdmap$,199,197,"ハートハンターAT#2",21536,'@label$);
		set '@mob[3],callmonster(.mdmap$,202,207,"ハートハンターAT#3",21536,'@label$);
		unittalk '@mob[1],"ハートハンター : ちくしょう！　装置を停止させたのか!!";	// 93280:ハートハンターAT#1
		unittalk '@mob[2],"ハートハンター : そいつから離れた方が、お前のためだぞ！";	// 93281:ハートハンターAT#2
		unittalk '@mob[3],"ハートハンター : 何が起きても知らないからな!!";	// 93282:ハートハンターAT#3
	}
	end;
OnKilled:
	set '@label$,getmdnpcname("注入装置3#19m40")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) <= 0) {
		sleep 500;
		set 'flag,2;
		announce "‐周囲の敵はいなくなった。注入装置3を停止させよう‐", 0x9, 0x00ffcc;
		donpcevent getmdnpcname("注入装置3#19m40")+ "::OnStart";
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30283
	end;
}
1@jorchs.gat,144,177,1	script	レオン#19m40	10464,{/* 30284 (hide)*/
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:レオン#19m40(30284)
	end;
}
1@jorchs.gat,143,179,5	script	ハートハンター#19m40	21536,{/* 30285 (hide)*/}
1@jorchs.gat,143,178,5	script	ハートハンター#19m41	21536,{/* 30286 (hide)*/}
1@jorchs.gat,144,180,5	script	ハートハンター#19m42	21536,{/* 30287 (hide)*/}

1@jorchs.gat,0,0,0	script	ConfusedNestControl5	-1,{
OnStart:
	initnpctimer;
	end;
OnTimer500:
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("オーレリー#19m40");	// 30282
	hideonnpc getmdnpcname("潰れたルガン#19m41");	// 30931
	monster .mdmap$,141,182,"巻き込まれた中級ルガン",21535,1,'@label$;
	hideonnpc getmdnpcname("ハートハンター#19m41");	// 30286
	monster .mdmap$,149,178,"ハートハンターAT",21536,1,'@label$;
	end;
OnTimer3500:
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30288
	monster .mdmap$,141,183,"改造された上級ルガン",21534,1,'@label$;
	hideonnpc getmdnpcname("ねじられたルガン#19m44");	// 30882
	monster .mdmap$,141,179,"巻き込まれた中級ルガン",21535,1,'@label$;
	end;
OnTimer6500:
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30134
	monster .mdmap$,141,181,"改造された上級ルガン",21534,1,'@label$;
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30139
	monster .mdmap$,141,180,"改造された上級ルガン",21534,1,'@label$;
	end;
OnTimer9500:
	stopnpctimer;
	set 'flag,1;
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("ハートハンター#19m42");	// 30287
	monster .mdmap$,150,180,"ハートハンターAT",21536,1,'@label$;
	hideonnpc getmdnpcname("ハートハンター#19m40");	// 30285
	monster .mdmap$,149,179,"ハートハンターAT",21536,1,'@label$;
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30909
	monster .mdmap$,141,178,"改造された上級ルガン",21534,1,'@label$;
	end;
OnKilled:
	if('flag && getmapmobs(.mdmap$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled") <= 0) {
		hideoffnpc getmdnpcname("sw_4_1");	// 30281
		announce "ホルル : イルシオンの区域に動きあり！　誰か確認してくれ！", 0x9, 0x00ffcc;
		set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled2";
		monster .mdmap$,121,190,"巻き込まれた中級ルガン",21535,1,'@label$;
		monster .mdmap$,86,165,"改造された上級ルガン",21534,1,'@label$;
		monster .mdmap$,79,154,"改造された上級ルガン",21534,1,'@label$;
		monster .mdmap$,45,153,"巻き込まれた中級ルガン",21535,1,'@label$;
		monster .mdmap$,25,172,"改造された上級ルガン",21534,1,'@label$;
		setarray '@xy4, 140,183,140,182,140,181,140,180,140,179,140,178,139,183,139,182,139,181,139,180,139,179,139,178,138,183,138,182,138,181,138,180,138,179,138,178;
		for(set '@i,0; '@i < getarraysize('@xy4); set '@i,'@i+2)
			setcell .mdmap$,'@xy4['@i],'@xy4['@i+1],0;
	}
	end;
OnKilled2:
	// 未調査
	end;
}

1@jorchs.gat,140,182,3	script	潰れたルガン#19m41	21535,{/* 30931 */}
1@jorchs.gat,139,181,3	script	改造された上級ルガン#19m42	21534,{/* 30134 */}
1@jorchs.gat,139,180,1	script	改造された上級ルガン#19m43	21534,{/* 30139 */}
1@jorchs.gat,140,183,1	script	改造された上級ルガン#19	21534,{/* 30288 */}
1@jorchs.gat,138,179,3	script	ねじられたルガン#19m44	21535,{/* 30882 */}
1@jorchs.gat,138,178,3	script	改造された上級ルガン#19	21534,{/* 30909 */}
1@jorchs.gat,97,220,0	script	w_5_1	45,2,2,{/* 30129 */
	if(.lab < 7) {
		viewpoint 1, 16, 135, 1, 0x99FFFF;	// 30129
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30129
		viewpoint 1, 24, 142, 3, 0x99FFFF;	// 30129
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30129
		unittalk getcharid(3),strcharinfo(0)+" : 先に南西にあるイルシオン区画へいこう",1;	// self:hidden
		viewpoint 2, 97, 220, 99, 0xFF0000;	// 30129
		end;
	}
	viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30129
	viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30129
	viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30129
	viewpoint 2, 97, 220, 4, 0xFF0000;	// 30129
	unittalk getcharid(3),strcharinfo(0)+" : このまま奥へ進もう",1;	// self:hidden
	viewpoint 2, 121, 190, 5, 0xFFFF00;	// 30129
	viewpoint 2, 86, 165, 6, 0xFFFF00;	// 30129
	viewpoint 2, 79, 154, 7, 0xFFFF00;	// 30129
	viewpoint 2, 45, 153, 8, 0xFFFF00;	// 30129
	viewpoint 2, 25, 172, 9, 0xFFFF00;	// 30129
	viewpoint 2, 24, 188, 10, 0xFFFF00;	// 30129
	viewpoint 2, 32, 135, 11, 0xFFFF00;	// 30129
	viewpoint 2, 18, 133, 12, 0xFFFF00;	// 30129
	viewpoint 2, 77, 146, 13, 0xFFFF00;	// 30129
	viewpoint 2, 103, 215, 14, 0xFFFF00;	// 30129
	viewpoint 1, 39, 251, 99, 0xFF0000;	// 30129
	if(!sleep2(1000)) end;
	warp .mdmap$,86,220;
	end;
}
1@jorchs.gat,94,221,5	script	#stop5_1	10248,{/* 30148 */}
1@jorchs.gat,94,218,5	script	#stop5_2	10248,{/* 30965 */}
1@jorchs.gat,91,220,0	warp	w_6_1	2,2,1@jorchs.gat,102,220	// 30043 from: 1@jorchs.gat(89, 220)
1@jorchs.gat,86,220,0	script	#e19c06_	139,5,5,{/* 30870 */
	unittalk getcharid(3),strcharinfo(0)+" : このまま奥へ進もう",1;	// self:hidden
	viewpoint 2, 121, 190, 5, 0xFFFF00;	// 30870
	viewpoint 2, 86, 165, 6, 0xFFFF00;	// 30870
	viewpoint 2, 79, 154, 7, 0xFFFF00;	// 30870
	viewpoint 2, 45, 153, 8, 0xFFFF00;	// 30870
	viewpoint 2, 25, 172, 9, 0xFFFF00;	// 30870
	viewpoint 2, 24, 188, 10, 0xFFFF00;	// 30870
	viewpoint 2, 32, 135, 11, 0xFFFF00;	// 30870
	viewpoint 2, 18, 133, 12, 0xFFFF00;	// 30870
	viewpoint 2, 77, 146, 13, 0xFFFF00;	// 30870
	viewpoint 2, 103, 215, 14, 0xFFFF00;	// 30870
	viewpoint 1, 39, 251, 99, 0xFF0000;	// 30870
	end;
}
1@jorchs.gat,17,188,0	script	#e19c05	139,{/* 30926 (hide)*/
OnStart:
	misceffect 456;	// 30926
	misceffect 496;	// 30926
	monster .mdmap$,17,188,"改造された上級ルガン",21534,1;
	end;
}
1@jorchs.gat,20,195,7	script	研究装置1#19m40	10043,{/* 30943 */
	set '@label$,getmdnpcname("研究装置1#19m40")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) > 0) {
		unittalk getcharid(3),strcharinfo(0)+" : まずは敵を倒そう",1;	// self:hidden
		end;
	}
	if(.lab & 7) {
		unittalk getcharid(3),strcharinfo(0)+" : 北側から奥に向かおう",1;	// self:hidden
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30943
		viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30943
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30943
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30943
		end;
	}
	if(.lab & 1) {
		unittalk getcharid(3),strcharinfo(0)+" : 次の場所を探そう",1;	// self:hidden
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30086
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30086
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30086
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30086
		end;
	}
	misceffect 456,"研究装置1#19m40";	// 30943
	misceffect 496,"研究装置1#19m40";	// 30943
	donpcevent getmdnpcname("#e19c05")+ "::OnStart";
	set '@mob[1],callmonster(.mdmap$,26,194,"ハートハンターAT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,26,188,"ハートハンターAT#2",21536,'@label$);
	set '@mob[3],callmonster(.mdmap$,19,185,"ハートハンターAT#3",21536,'@label$);
	unittalk '@mob[1],"ハートハンター : 研究資料でも探しに来たのか？";	// 6081:ハートハンターAT#1
	unittalk '@mob[2],"ハートハンター : 抵抗するな！　大人しく武器を捨てろ！";	// 6093:ハートハンターAT#2
	unittalk '@mob[3],"ハートハンター : どうせお前が読んでも、わからねえよ!!";	// 6105:ハートハンターAT#3
	end;
OnKilled:
	set .lab, .lab|1;
	if(.lab & 7) {
/* 21:29:52.127375 */	//@mob_defeated("ハートハンターAT#3"(6105), type: 1)
/* 21:29:53.016993 */	announce "‐北西から奥に進もう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
/* 21:29:54.801625 */	unittalk getcharid(3),strcharinfo(0)+" : ユミルの心臓の欠片は、やはり無いか……。",1;	// self:hidden
/* 21:29:54.831545 */	unittalk getcharid(3),strcharinfo(0)+" : 北側から奥に向かおう",1;	// self:hidden
/* 21:29:54.836531 */	viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30943
/* 21:29:54.840522 */	viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30943
/* 21:29:54.848500 */	viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30943
/* 21:29:54.851493 */	viewpoint 1, 97, 220, 4, 0xFF0000;	// 30943
/* 21:29:56.080592 */	announce "ハートハンター : くくく！　誰が一番先に到着するかな？", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	else {
		announce "‐他にも何かありそうだ。捜索を継続しよう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		unittalk getcharid(3),strcharinfo(0)+" : ユミルの心臓の欠片は、やはり無いか……。",1;	// self:hidden
	}
	end;
}
1@jorchs.gat,17,133,0	script	#e19c06	139,{/* 30117 (hide)*/
OnStart:
	misceffect 456;	// 30117
	misceffect 496;	// 30117
	monster .mdmap$,17,133,"改造された上級ルガン",21534,1;
	end;
}
1@jorchs.gat,24,142,7	script	研究装置2#19m41	10043,{/* 30086 */
	set '@label$,getmdnpcname("研究装置2#19m41")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) > 0) {
		unittalk getcharid(3),strcharinfo(0)+" : まずは敵を倒そう",1;	// self:hidden
		end;
	}
	if(.lab & 7) {
		unittalk getcharid(3),strcharinfo(0)+" : 北側から奥に向かおう",1;
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30943
		viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30943
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30943
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30943
		end;
	}
	if(.lab & 2) {
		unittalk getcharid(3),strcharinfo(0)+" : 次の場所を探そう",1;	// self:hidden
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30086
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30086
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30086
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30086
		end;
	}
	misceffect 456;	// 30086
	misceffect 496;	// 30086
	set '@mob[1],callmonster(.mdmap$,20,136,"ハートハンターAT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,30,139,"ハートハンターAT#2",21536,'@label$);
	unittalk '@mob[1],"ハートハンター : もう一回、健康診断でもするつもりか？";	// 94345:ハートハンターAT#1
	unittalk '@mob[2],"ハートハンター : そいつに触るんじゃねぇよ！";	// 94346:ハートハンターAT#2
	end;
OnKilled:
	set .lab, .lab|2;
	if(.lab & 7) {
		sleep 1000;
		announce "‐北西から奥に進もう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		sleep 3000;
		announce "ハートハンター : くくく！　誰が一番先に到着するかな？", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	else {
		announce "‐他にも何かありそうだ。捜索を継続しよう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	end;
}
1@jorchs.gat,16,135,3	script	研究室の痕跡#19m40	10043,{/* 30958 */
	if(.lab & 7) {
		unittalk getcharid(3),strcharinfo(0)+" : 北側から奥に向かおう",1;
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30086
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30086
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30086
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30086
		end;
	}
	if(.lab & 4) {
		unittalk getcharid(3),strcharinfo(0)+" : 重要そうな資料は、すべて運び出されている",1;	// self:hidden
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : ほとんど何も残っていない……別の場所を探そう",1;	// self:hidden
	viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30958
	viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30958
	viewpoint 1, 24, 142, 3, 0x99FFFF;	// 30958
	viewpoint 1, 97, 220, 4, 0xFF0000;	// 30958
	if(!(.lab & 4)) {
		set .lab,.lab|4;
		if(.lab & 7) {
			sleep 1000;
			announce "‐北西から奥に進もう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			sleep 3000;
			announce "ハートハンター : くくく！　誰が一番先に到着するかな？", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		}
		else {
			announce "‐他にも何かありそうだ。捜索を継続しよう‐", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		}
	}
	end;
}
1@jorchs.gat,0,0,0	script	ConfusedNestControl6	-1,{
OnStart:
	sleep 500;
	hideonnpc getmdnpcname("バゴット#19m50");	// 30181
	announce "魔力注入準備。1段階の魔力注入が開始されます。", 0x9, 0x00ffcc;
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30949
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30932
	monster .mdmap$,35,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,42,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30917
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30297
	monster .mdmap$,37,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,40,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("凶暴なルガン#19m50");	// 30889
	hideonnpc getmdnpcname("凶暴なルガン#19m51");	// 30878
	monster .mdmap$,31,249,"魔力暴走した上級ルガン",21590,1,'@label$;
	monster .mdmap$,47,237,"魔力暴走した上級ルガン",21590,1,'@label$;
	delmisceffect 453, getmdnpcname("凶暴なルガン#19m50");	// 30889
	delmisceffect 453, getmdnpcname("凶暴なルガン#19m51");	// 30878
	delmisceffect 754, getmdnpcname("凶暴なルガン#19m50");	// 30889
	delmisceffect 754, getmdnpcname("凶暴なルガン#19m51");	// 30878
	set .scean,15;
	end;
OnStart2:
	sleep 500;
	announce "魔力注入準備。2段階の魔力注入が開始されます。", 0x9, 0x00ffcc;
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30879
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30140
	monster .mdmap$,34,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,43,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30892
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30874
	monster .mdmap$,38,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,39,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30289
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30933
	monster .mdmap$,36,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,41,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("凶暴なルガン#19m52");	// 30133
	hideonnpc getmdnpcname("凶暴なルガン#19m53");	// 30880
	monster .mdmap$,47,249,"魔力暴走した上級ルガン",21590,1,'@label$;
	monster .mdmap$,31,237,"魔力暴走した上級ルガン",21590,1,'@label$;
	delmisceffect 453, getmdnpcname("凶暴なルガン#19m52");	// 30133
	delmisceffect 453, getmdnpcname("凶暴なルガン#19m53");	// 30880
	delmisceffect 754, getmdnpcname("凶暴なルガン#19m52");	// 30133
	delmisceffect 754, getmdnpcname("凶暴なルガン#19m53");	// 30880
	set .scean,16;
	end;
OnStart3:
	sleep 500;
	announce "魔力注入準備。3段階の魔力注入が開始されます。", 0x9, 0x00ffcc;
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30304
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30130
	monster .mdmap$,35,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,39,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30944
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30149
	monster .mdmap$,37,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,41,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30927
	hideonnpc getmdnpcname("改造された上級ルガン#19");	// 30887
	monster .mdmap$,38,254,"改造された上級ルガン",21534,1,'@label$;
	monster .mdmap$,42,254,"改造された上級ルガン",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("ハートハンター#19m50");	// 30895
	hideonnpc getmdnpcname("ハートハンター#19m51");	// 30156
	hideonnpc getmdnpcname("ハートハンター#19m52");	// 30132
	set '@mob[1],callmonster(.mdmap$,39,250,"ハートハンターAT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,36,250,"ハートハンターAT#2",21536,'@label$);
	set '@mob[3],callmonster(.mdmap$,41,252,"ハートハンターAT#3",21536,'@label$);
	unittalk '@mob[1],"ハートハンター : 全力で掛かれっ!!";	// 7639:ハートハンターAT#1
	unittalk '@mob[2],"ハートハンター : おい、押されてるぞ！";	// 7676:ハートハンターAT#2
	unittalk '@mob[3],"ハートハンター : くっ！　思ったより強い!!";	// 7902:ハートハンターAT#3
	sleep 4500;
	hideonnpc getmdnpcname("凶暴なルガン#19m54");	// 30956
	hideonnpc getmdnpcname("凶暴なルガン#19m55");	// 30899
	hideonnpc getmdnpcname("凶暴なルガン#19m56");	// 30131
	monster .mdmap$,27,243,"魔力暴走した上級ルガン",21590,1,'@label$;
	monster .mdmap$,50,243,"魔力暴走した上級ルガン",21590,1,'@label$;
	monster .mdmap$,39,235,"魔力暴走した上級ルガン",21590,1,'@label$;
	delmisceffect 453, getmdnpcname("凶暴なルガン#19m54");	// 30956
	delmisceffect 453, getmdnpcname("凶暴なルガン#19m55");	// 30899
	delmisceffect 453, getmdnpcname("凶暴なルガン#19m56");	// 30131
	delmisceffect 754, getmdnpcname("凶暴なルガン#19m54");	// 30956
	delmisceffect 754, getmdnpcname("凶暴なルガン#19m55");	// 30899
	delmisceffect 754, getmdnpcname("凶暴なルガン#19m56");	// 30131
	set .scean,17;
	end;
OnKilled:
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) == 0) {
		switch(.scean) {
		case 15:
			donpcevent getmdnpcname("ConfusedNestControl6")+ "::OnStart2"; 
			end;
		case 16:
			donpcevent getmdnpcname("ConfusedNestControl6")+ "::OnStart3"; 
			end;
		case 17:
			announce "‐奥へ進む道が開いた‐", 0x9, 0x00ffcc;
			misceffect 224,"改造された上級ルガン#19m50";	// 30879
			misceffect 224,"改造された上級ルガン#19m51";	// 30949
			misceffect 224,"改造された上級ルガン#19m52";	// 30289
			misceffect 224,"改造された上級ルガン#19m53";	// 30917
			misceffect 224,"改造された上級ルガン#19m54";	// 30892
			misceffect 224,"改造された上級ルガン#19m55";	// 30874
			misceffect 224,"改造された上級ルガン#19m56";	// 30297
			misceffect 224,"改造された上級ルガン#19m57";	// 30933
			misceffect 224,"改造された上級ルガン#19m58";	// 30932
			misceffect 224,"改造された上級ルガン#19m59";	// 30140
			setnpcdisplay "改造された上級ルガン#19m50",844;	// 30879
			setnpcdisplay "改造された上級ルガン#19m51",844;	// 30949
			setnpcdisplay "改造された上級ルガン#19m52",844;	// 30289
			setnpcdisplay "改造された上級ルガン#19m53",844;	// 30917
			setnpcdisplay "改造された上級ルガン#19m54",844;	// 30892
			setnpcdisplay "改造された上級ルガン#19m55",844;	// 30874
			setnpcdisplay "改造された上級ルガン#19m56",844;	// 30297
			setnpcdisplay "改造された上級ルガン#19m57",844;	// 30933
			setnpcdisplay "改造された上級ルガン#19m58",844;	// 30932
			setnpcdisplay "改造された上級ルガン#19m59",844;	// 30140
			setarray '@xy5, 43,256,43,255,42,256,42,255,41,256,41,255,40,256,40,255,39,256,39,255,38,256,38,255,37,256,37,255,36,256,36,255,35,256,35,255,34,256,34,255;
			for(set '@i,0; '@i < getarraysize('@xy5); set '@i,'@i+2)
				setcell .mdmap$,'@xy5['@i],'@xy5['@i+1],0;
			donpcevent getmdnpcname("中心部の門#19m61")+ "::OnStart"; 
			end;
		}
	}
	end;
}
1@jorchs.gat,39,251,5	script	ハートハンター#19m50	21536,5,5,{/* 30895 */
	if(.scean == 13) {
		set .scean,14;
		misceffect 16;	// 30895
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m51")),"ハートハンター : 冒険者が一番先に着いたな。";	// 30156
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("ハートハンター#19m52")),"ハートハンター : 賭けをしてたけど。";	// 30132
		unittalk "ハートハンター : ははっ！　私が勝ったぜ。";	// 30895
		if(!sleep2(2500)) end;
		hideoffnpc getmdnpcname("バゴット#19m50");	// 30181
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : 来たのは～冒険者だけぇ？";	// 30181
		if(!sleep2(2000)) end;
		unittalk "ハートハンター : 他の奴ら、魔力暴走ルガンに苦戦してるようです。";	// 30895
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : あ、そう？　バゴットは冒険者にちょ～っと会いたいと思っていたところぉ～。";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : よくも、バゴットを騙そうとしたね？";	// 30181
		if(!sleep2(3000)) end;
		hideoffnpc getmdnpcname("凶暴なルガン#19m50");	// 30889
		hideoffnpc getmdnpcname("凶暴なルガン#19m51");	// 30889
		hideoffnpc getmdnpcname("凶暴なルガン#19m52");	// 30133
		hideoffnpc getmdnpcname("凶暴なルガン#19m53");	// 30889
		hideoffnpc getmdnpcname("凶暴なルガン#19m54");	// 30956
		hideoffnpc getmdnpcname("凶暴なルガン#19m55");	// 30889
		hideoffnpc getmdnpcname("凶暴なルガン#19m56");	// 30889
		unittalk getnpcid(0,getmdnpcname("凶暴なルガン#19m50")),"凶暴なルガン : ぐああーー";	// 30889
		unittalk getnpcid(0,getmdnpcname("凶暴なルガン#19m51")),"凶暴なルガン : ぐるっーーぐるるっーー";	// 30878
		unittalk getnpcid(0,getmdnpcname("凶暴なルガン#19m52")),"凶暴なルガン : ま…りょ…く…";	// 30133
		unittalk getnpcid(0,getmdnpcname("凶暴なルガン#19m53")),"凶暴なルガン : …………";	// 30880
		unittalk getnpcid(0,getmdnpcname("凶暴なルガン#19m54")),"凶暴なルガン : やめ…ろ…お…";	// 30956
		unittalk getnpcid(0,getmdnpcname("凶暴なルガン#19m55")),"凶暴なルガン : ああああーーーあーー";	// 30899
		unittalk getnpcid(0,getmdnpcname("凶暴なルガン#19m56")),"凶暴なルガン : 私…も…";	// 30131
		misceffect 453,getmdnpcname("凶暴なルガン#19m50");	// 30889
		misceffect 453,getmdnpcname("凶暴なルガン#19m51");	// 30889
		misceffect 453,getmdnpcname("凶暴なルガン#19m52");	// 30133
		misceffect 453,getmdnpcname("凶暴なルガン#19m53");	// 30889
		misceffect 453,getmdnpcname("凶暴なルガン#19m54");	// 30956
		misceffect 453,getmdnpcname("凶暴なルガン#19m55");	// 30889
		misceffect 453,getmdnpcname("凶暴なルガン#19m56");	// 30889
		misceffect 754,getmdnpcname("凶暴なルガン#19m50");	// 30889
		misceffect 754,getmdnpcname("凶暴なルガン#19m51");	// 30889
		misceffect 754,getmdnpcname("凶暴なルガン#19m52");	// 30133
		misceffect 754,getmdnpcname("凶暴なルガン#19m53");	// 30889
		misceffect 754,getmdnpcname("凶暴なルガン#19m54");	// 30956
		misceffect 754,getmdnpcname("凶暴なルガン#19m55");	// 30889
		misceffect 754,getmdnpcname("凶暴なルガン#19m56");	// 30889
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : バゴットが何をするか気になったんでしょ～？　それで、ユンケアちゃんまでそそのかしてぇ～。";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : でもバゴットは～そんな浅はかな手には引っかからないのよねぇ～。";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : 騙された振りして、お前らの行動を観察してたわけぇ～。まんまと引っかかったよなぁ～。";	// 30181
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : でも、バゴットが創り出す新しい世界に、もうお前らは不要ぉー！";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : ラスガンドも自分を騙そうとした人間に、怒り心頭だったしぃ～。";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("バゴット#19m50")),"バゴット : さぁ、バゴットからのプレゼントぉ～。これもらって永久に退場してくださいねぇ～！";	// 30181
		donpcevent getmdnpcname("ConfusedNestControl6")+ "::OnStart"; 
	}
	end;
}
1@jorchs.gat,36,251,5	script	ハートハンター#19m51	21536,{/* 30156 */}
1@jorchs.gat,41,253,5	script	ハートハンター#19m52	21536,{/* 30132 */}
1@jorchs.gat,31,249,5	script	凶暴なルガン#19m50	21590,{/* 30889 (hide)*/}
1@jorchs.gat,47,237,1	script	凶暴なルガン#19m51	21590,{/* 30878 (hide)*/}
1@jorchs.gat,47,249,3	script	凶暴なルガン#19m52	21590,{/* 30133 (hide)*/}
1@jorchs.gat,31,237,7	script	凶暴なルガン#19m53	21590,{/* 30880 (hide)*/}
1@jorchs.gat,27,243,5	script	凶暴なルガン#19m54	21590,{/* 30956 (hide)*/}
1@jorchs.gat,50,243,3	script	凶暴なルガン#19m55	21590,{/* 30899 (hide)*/}
1@jorchs.gat,39,235,1	script	凶暴なルガン#19m56	21590,{/* 30131 (hide)*/}
1@jorchs.gat,37,252,5	script	バゴット#19m50	10386,{/* 30181 (hide)*/}
1@jorchs.gat,34,255,1	script	改造された上級ルガン#19m50	21534,{/* 30879 */}
1@jorchs.gat,35,255,3	script	改造された上級ルガン#19m51	21534,{/* 30949 */}
1@jorchs.gat,36,255,3	script	改造された上級ルガン#19m52	21534,{/* 30289 */}
1@jorchs.gat,37,255,1	script	改造された上級ルガン#19m53	21534,{/* 30917 */}
1@jorchs.gat,38,255,3	script	改造された上級ルガン#19m54	21534,{/* 30892 */}
1@jorchs.gat,39,255,3	script	改造された上級ルガン#19m55	21534,{/* 30874 */}
1@jorchs.gat,40,255,1	script	改造された上級ルガン#19m56	21534,{/* 30297 */}
1@jorchs.gat,41,255,3	script	改造された上級ルガン#19m57	21534,{/* 30933 */}
1@jorchs.gat,42,255,3	script	改造された上級ルガン#19m58	21534,{/* 30932 */}
1@jorchs.gat,43,255,3	script	改造された上級ルガン#19m59	21534,{/* 30140 */}
1@jorchs.gat,35,256,5	script	改造された上級ルガン#19m60	21534,{/* 30304 */}
1@jorchs.gat,37,256,1	script	改造された上級ルガン#19m61	21534,{/* 30944 */}
1@jorchs.gat,38,256,5	script	改造された上級ルガン#19m62	21534,{/* 30927 */}
1@jorchs.gat,39,256,3	script	改造された上級ルガン#19m63	21534,{/* 30130 */}
1@jorchs.gat,41,256,1	script	改造された上級ルガン#19m64	21534,{/* 30149 */}
1@jorchs.gat,42,256,5	script	改造された上級ルガン#19m65	21534,{/* 30887 */}

1@jorchs.gat,38,272,1	script	オーレリー#19m60	10465,{/* 30948 (hide)*/
	if(.scean != 19)
		end;
	cutin "ep19_aurelie03.png", 2;
	mes "[オーレリー]";
	mes "さあ、氷の城に戻りましょう。";
	next;
	if(EP19_1QUE == 67) {
		delquest 17648;
		setquest 17649;	// state=1
		set EP19_1QUE,68;
	}
	cutin "ep19_juncea04.png", 255;
	mes "‐氷の城へ向かいますか？‐";
	next;
	if(select("向かう","やめる") == 2) {
		mes "‐その場にとどまった‐";
		close;
	}
	mes "‐氷の城へ向かった‐";
	close2;
	warp "icas_in.gat", 35, 186;
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30877
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:オーレリー#19m60(30948)
	end;
}
1@jorchs.gat,39,271,1	script	レオン#19m60	10464,{/* 30157 (hide)*/
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:レオン#19m60(30157)
	end;
}
1@jorchs.gat,35,271,7	script	ミリアム#19m60	10377,{/* 30290 (hide)*/}
1@jorchs.gat,36,272,7	script	ヴォークリンデ#19m60	10467,{/* 28145 (hide)*/}
1@jorchs.gat,40,274,1	script	ホルル#19m60	21518,{/* 30896 (hide)*/}
1@jorchs.gat,21,254,5	script	アーウィン#19m60	21517,{/* 30298 (hide)*/}

1@jorchs.gat,37,274,5	script	中心部の門#19m61	10043,{/* 30877 */
	if(.scean != 17)
		end;
	set .scean,18;
	stopnpctimer;
	misceffect 16;	// 30877
	hideoffnpc getmdnpcname("オーレリー#19m60");	// 30948
	hideoffnpc getmdnpcname("レオン#19m60");	// 30157
	unittalk getnpcid(0,getmdnpcname("オーレリー#19m60")),"オーレリー : 無事みたいで良かったわ。";	// 30948
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("レオン#19m60")),"レオン : 暴走した上級ルガンの群れに襲われ、到着が遅れてしまいました。";	// 30157
	if(!sleep2(1500)) end;
	hideoffnpc getmdnpcname("ホルル#19m60");	// 30896
	hideoffnpc getmdnpcname("アーウィン#19m60");	// 30298
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : こちらもだ。暴走した奴らに手こずってしまった!!";	// 30896
	if(!sleep2(1500)) end;
	hideoffnpc getmdnpcname("ヴォークリンデ#19m60");	// 28145
	hideoffnpc getmdnpcname("ミリアム#19m60");	// 30290
	unittalk getnpcid(0,getmdnpcname("ヴォークリンデ#19m60")),"ヴォークリンデ : アレに襲われたのは、私達だけじゃなかったみたいね。";	// 28145
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("ミリアム#19m60")),"ミリアム : 合流できて良かったです。何かわかりましたか？";	// 30290
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : しらみつぶしに調べてみたが、なにも発見できなかった……。";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("オーレリー#19m60")),"オーレリー : イルシオンの研究室もカラッポだったわ。";	// 30948
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("ヴォークリンデ#19m60")),"ヴォークリンデ : ハートハンターに聞いてみたけど、全員中心部へ移動したとしか答えなかったわ。";	// 28145
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("ミリアム#19m60")),"ミリアム : 飛行船で脱出した者もいません。";	// 30290
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("レオン#19m60")),"レオン : なるほど……調べられていないのは、この奥だけみたいですね。";	// 30157
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : この門の先に、ラスガンドがいるんだな？";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : よし！　この門を開けてみよう。";	// 30896
	if(!sleep2(1500)) end;
	misceffect 563;	// 30877
	unittalk getnpcid(0,getmdnpcname("レオン#19m60")),"レオン : ……堅く閉ざされていますね。";	// 30157
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : 力尽くでも開けてやる！";	// 30896
	if(!sleep2(2500)) end;
	misceffect 585;	// 30877
	if(!sleep2(500)) end;
	misceffect 666;	// 30877
	if(!sleep2(500)) end;
	misceffect 636;	// 30877
	misceffect 637;	// 30877
	misceffect 645;	// 30877
	misceffect 668;	// 30877
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : びくともしない!?　いったい門にどんな細工をしたんだ!!!";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("ヴォークリンデ#19m60")),"ヴォークリンデ : ハートハンターから入手した鍵でも開けられないわ。";	// 28145
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("オーレリー#19m60")),"オーレリー : ……魔力を注入しても反応がないわね。";	// 30948
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("ヴォークリンデ#19m60")),"ヴォークリンデ : 手が無い以上、いったん出直すのが良いかもしれないね。";	// 28145
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : ルガンの巣窟はどうする？　燃やしてしまうか？";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("オーレリー#19m60")),"オーレリー : ……ここはそのままにしておきましょう。";	// 30948
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("レオン#19m60")),"レオン : 私たちが諦めて帰ったと思わせるように？";	// 30157
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("オーレリー#19m60")),"オーレリー : そう。油断して、門を開けるかもしれない。";	// 30948
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("ホルル#19m60")),"ホルル : あまり気に入らないが、他に方法もなさそうだ……ここに監視係を残していこう。";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("オーレリー#19m60")),"オーレリー : では、いったん氷の城に戻りましょう。ワープポータルを開くわ。";	// 30948
	set .scean,19;
	donpcevent getmdnpcname("オーレリー#19m60")+ "::OnStart"; 
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30877
	end;
}

/*
21534,改造された上級ルガン＠アーススパイク,chase,90,3,5000,0,3000,no,target,always,0,,,,,,
21534,改造された上級ルガン＠アーススパイク,attack,90,4,2000,0,5000,no,target,always,0,,,,,,
21534,改造された上級ルガン＠ポイズンアタック,attack,188,2,2500,0,5000,no,target,always,0,,,,,,
21534,改造された上級ルガン＠グラウンドアタック,attack,185,2,2500,0,5000,no,target,always,0,,,,,,

21535,巻き込まれた中級ルガン＠コールドボルト,chase,14,9,5000,0,3000,no,target,always,0,,,,,,
21535,巻き込まれた中級ルガン＠Mディフェンダー,chase,205,1,2000,0,30000,no,self,longrangeattacked,0,,,,,,
21535,巻き込まれた中級ルガン＠ポイズンアタック,attack,188,5,2500,0,5000,no,target,always,0,,,,,,
21535,巻き込まれた中級ルガン＠ウォーターアタック,attack,184,5,2500,0,5000,no,target,always,0,,,,,,
21535,巻き込まれた中級ルガン＠マグナムブレイク,attack,7,10,2500,0,5000,no,target,always,0,,,,,,
21535,巻き込まれた中級ルガン＠ブラッドドレイン,attack,199,1,2000,0,5000,no,target,always,0,,,,,,
//21535,巻き込まれた中級ルガン＠Mイグニッションブレイク,attack,740,1,1000,0,5000,no,self,attackpcge,2,,,,,,
21536,ハートハンターAT＠ソウルブレイカー,chase,379,1,5000,0,3000,no,target,always,0,,,,,,
21536,ハートハンターAT＠バッシュ,attack,5,10,2000,0,2000,no,target,always,0,,,,,,
21536,ハートハンターAT＠クリティカルスラッシュ,attack,170,1,2000,0,5000,no,target,always,0,,,,,,
21536,ハートハンターAT＠コンボアタック,attack,171,3,2000,0,2000,no,target,always,0,,,,,,
average 850
@skillattack(src: 21536:"ハートハンターAT"(83099), dst: (), skill: "ソウルブレイカー"(379), skill_lv: 65535, damage: 9734, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559304844)
@skillattack(src: 21536:"ハートハンターAT"(83099), dst: (), skill: "ソウルブレイカー"(379), skill_lv: 65535, damage: 10784, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559308965)
@skillattack(src: 21536:"ハートハンターAT"(83099), dst: (), skill: "ソウルブレイカー"(379), skill_lv: 65535, damage: 11179, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559312072)
@skillattack(src: 21536:"ハートハンターAT"(83099), dst: (), skill: "ソウルブレイカー"(379), skill_lv: 65535, damage: 9869, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559317196)
21590,魔力暴走した上級ルガン＠アーススパイク,chase,90,4,5000,0,3000,no,target,always,0,,,,,,
21590,魔力暴走した上級ルガン＠アーススパイク,attack,90,5,2000,0,5000,no,target,always,0,,,,,,
21590,魔力暴走した上級ルガン＠ポイズンアタック,attack,188,8,2500,0,5000,no,target,always,0,,,,,,
21590,魔力暴走した上級ルガン＠グラウンドアタック,attack,185,8,2500,0,5000,no,target,always,0,,,,,,
*/

/*
巻き込まれた中級ルガン（クエスト）
150,792,792,576

改造された上級ルガン（クエスト）
150,1008,1008,576

ハートハンターAT（クエスト）
150,1080,1080,576

魔力暴走した上級ルガン（クエスト）
150,1008,1008,576
*/