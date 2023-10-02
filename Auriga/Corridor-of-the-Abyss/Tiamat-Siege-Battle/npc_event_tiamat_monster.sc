1_tiamat_00.gat,0,0,0	script	tiamat_mob#all	139,{
OnInit:
	setarray 'mob[0][0],
		3585,3,	// 
		20443,10,	// 
		20445,10,	// 
		20447,10,	// 
		20449,10,	// 
	;
	setarray 'mob[1][0],
		20437,5,	// 祭儀場
		20438,5,	// 
		20439,5,	// 
	;
	setarray 'mob[2][0],
		20437,10,	// 
		20438,10,	// 
		20439,10,	// 
	;
	setarray 'mob[3][0],
		20437,15,	// 
		20438,15,	// 
		20439,15,	// 
	;
	setarray 'mob[4][0],
		20451,5,	// 森林
		20452,5,	// 
		20453,5,	// 
	;
	setarray 'mob[5][0],
		20451,10,	// 
		20452,10,	// 
		20453,10,	// 
	;
	setarray 'mob[6][0],
		20451,15,	// 
		20452,15,	// 
		20453,15,	// 
	;
	setarray 'mob[7][0],
		20431,5,	// 庭園
		20432,5,	// 
		20433,5,	// 
	;
	setarray 'mob[8][0],
		20431,10,	// 
		20432,10,	// 
		20433,10,	// 
	;
	setarray 'mob[9][0],
		20440,5,	// 市街
		20441,5,	// 
		20442,5,	// 
	;
	setarray 'mob[10][0],
		20440,10,	// 
		20441,10,	// 
		20442,10,	// 
	;
	setarray 'mob[11][0],
		20440,15,	// 
		20441,15,	// 
		20442,15,	// 
	;
	setarray 'mob[12][0],
		20454,5,	// 渓谷
		20455,5,	// 
		20456,5,	// 
	;
	setarray 'mob[13][0],
		20454,10,	// 
		20455,10,	// 
		20456,10,	// 
	;
	setarray 'mob[14][0],
		20454,15,	// 
		20455,15,	// 
		20456,15,	// 
	;
	setarray 'mob[15][0],
		3977,5,	// 草原
		3994,5,	// 
		3997,5,	// 
	;
	setarray 'mob[16][0],
		3977,10,	// 
		3994,10,	// 
		3997,10,	// 
	;
	setarray 'mob[17][0],
		3977,15,	// 
		3994,15,	// 
		3997,15,	// 
	;
	setarray 'mob[18][0],
		20434,5,	// 回廊
		20435,5,	// 
		20436,5,	// 
	;
	setarray 'mob[19][0],
		20434,10,	// 
		20435,10,	// 
		20436,10,	// 
	;
	setarray 'mob[20][0],
		20434,15,	// 
		20435,15,	// 
		20436,15,	// 
	;
	setarray 'mob[21][0],
		20440,20,	// 
		20441,20,	// 
		20442,20,	// 
	;
	setarray 'mob[22][0],
		20485,10,	// 龍
		20486,10,	// 
		20487,10,	// 
		20488,10,	// 
	;
	setarray 'mob[23][0],
		3585,3,	// 
		20443,5,	// 
		20445,5,	// 
		20447,5,	// 
		20449,5,	// 
	;
	setarray 'mob[24][0],
		3585,6,	// 
		20443,15,	// 
		20445,15,	// 
		20447,15,	// 
		20449,15,	// 
	;
	setarray 'mob[25][0],
		20485,5,	// 龍
		20486,5,	// 
		20487,5,	// 
		20488,5,	// 
	;
	end;
OnStart:
	donpcevent "tiamat_mob#r2::OnStart";
	donpcevent "tiamat_mob#r3::OnStart";
	donpcevent "tiamat_mob#r4::OnStart";
	donpcevent "tiamat_mob#r5::OnStart";
	donpcevent "tiamat_mob#r6::OnStart";
	donpcevent "tiamat_mob#r7::OnStart";
	donpcevent "tiamat_mob#r8::OnStart";
	donpcevent "tiamat_mob#r9::OnStart";
	donpcevent "tiamat_mob#r10::OnStart";
	donpcevent "tiamat_mob#r11::OnStart";
	donpcevent "tiamat_mob#r12::OnStart";
	donpcevent "tiamat_mob#r13::OnStart";
	donpcevent "tiamat_mob#r16::OnStart";
	donpcevent "tiamat_mob#r17::OnStart";
	donpcevent "tiamat_mob#r18::OnStart";
	donpcevent "tiamat_mob#r19::OnStart";
	donpcevent "tiamat_mob#r20::OnStart";
	donpcevent "tiamat_mob#r21::OnStart";
	donpcevent "tiamat_mob#r22::OnStart";
	donpcevent "tiamat_mob#r23::OnStart";
	donpcevent "tiamat_mob#r24::OnStart";
	donpcevent "tiamat_mob#r25::OnStart";
	donpcevent "tiamat_mob#r26::OnStart";
	donpcevent "tiamat_mob#r27::OnStart";
	donpcevent "tiamat_mob#r28::OnStart";
	donpcevent "tiamat_mob#r29::OnStart";
	donpcevent "tiamat_mob#r30::OnStart";
	donpcevent "tiamat_mob#r31::OnStart";
	donpcevent "tiamat_mob#r32::OnStart";
	donpcevent "tiamat_mob#r33::OnStart";
	donpcevent "tiamat_mob#r34::OnStart";
	donpcevent "tiamat_mob#r35::OnStart";
	donpcevent "tiamat_mob#r36::OnStart";
	donpcevent "tiamat_mob#r37::OnStart";
	donpcevent "tiamat_mob#r38::OnStart";
	donpcevent "tiamat_mob#r39::OnStart";
	donpcevent "tiamat_mob#r40::OnStart";
	donpcevent "tiamat_mob#r41::OnStart";
	donpcevent "tiamat_mob#r42::OnStart";
	donpcevent "tiamat_mob#r43::OnStart";
	donpcevent "tiamat_mob#r44::OnStart";
	donpcevent "tiamat_mob#r45::OnStart";
	donpcevent "tiamat_mob#r46::OnStart";
	donpcevent "tiamat_mob#r47::OnStart";
	donpcevent "tiamat_mob#r48::OnStart";
	donpcevent "tiamat_mob#r49::OnStart";
	donpcevent "tiamat_mob#r50::OnStart";
	donpcevent "tiamat_mob#r51::OnStart";
	donpcevent "tiamat_mob#r52::OnStart";
	donpcevent "tiamat_mob#r53::OnStart";
	donpcevent "tiamat_mob#r54::OnStart";
	donpcevent "tiamat_mob#r55::OnStart";
	donpcevent "tiamat_mob#r56::OnStart";
	donpcevent "tiamat_mob#r57::OnStart";
	donpcevent "tiamat_mob#r58::OnStart";
	donpcevent "tiamat_mob#r59::OnStart";
	donpcevent "tiamat_mob#r60::OnStart";
	donpcevent "tiamat_mob#r61::OnStart";
	donpcevent "tiamat_mob#r62::OnStart";
	donpcevent "tiamat_mob#r63::OnStart";
	donpcevent "tiamat_mob#r64::OnStart";
	donpcevent "tiamat_mob#r65::OnStart";
	donpcevent "tiamat_mob#r66::OnStart";
	donpcevent "tiamat_mob#r67::OnStart";
	donpcevent "tiamat_mob#r68::OnStart";
	donpcevent "tiamat_mob#r69::OnStart";
	donpcevent "tiamat_mob#r70::OnStart";
	donpcevent "tiamat_mob#r71::OnStart";
	donpcevent "tiamat_mob#r72::OnStart";
	donpcevent "tiamat_mob#r73::OnStart";
	donpcevent "tiamat_mob#r74::OnStart";
	donpcevent "tiamat_mob#r75::OnStart";
	donpcevent "tiamat_mob#r76::OnStart";
	donpcevent "tiamat_mob#r77::OnStart";
	donpcevent "tiamat_mob#r78::OnStart";
	donpcevent "tiamat_mob#r79::OnStart";
	donpcevent "tiamat_mob#r80::OnStart";
	donpcevent "tiamat_mob#r81::OnStart";
	donpcevent "tiamat_mob#r82::OnStart";
	donpcevent "tiamat_mob#r83::OnStart";
	donpcevent "tiamat_mob#r84::OnStart";
	donpcevent "tiamat_mob#r85::OnStart";
	donpcevent "tiamat_mob#r86::OnStart";
	donpcevent "tiamat_mob#r87::OnStart";
	donpcevent "tiamat_mob#r88::OnStart";
	donpcevent "tiamat_mob#r89::OnStart";
	donpcevent "tiamat_mob#r90::OnStart";
	donpcevent "tiamat_mob#r91::OnStart";
	donpcevent "tiamat_mob#r92::OnStart";
	donpcevent "tiamat_mob#r93::OnStart";
	donpcevent "tiamat_mob#r94::OnStart";
	donpcevent "tiamat_mob#r95::OnStart";
	donpcevent "tiamat_mob#r96::OnStart";
	donpcevent "tiamat_mob#r97::OnStart";
	donpcevent "tiamat_mob#r98::OnStart";
	donpcevent "tiamat_mob#r99::OnStart";
	donpcevent "tiamat_mob#r100::OnStart";
	donpcevent "tiamat_mob#r101::OnStart";
	donpcevent "tiamat_mob#r102::OnStart";
	donpcevent "tiamat_mob#r103::OnStart";
	donpcevent "tiamat_mob#r104::OnStart";
	donpcevent "tiamat_mob#r105::OnStart";
	donpcevent "tiamat_mob#r106::OnStart";
	donpcevent "tiamat_mob#r107::OnStart";
	donpcevent "tiamat_mob#r108::OnStart";
	donpcevent "tiamat_mob#r109::OnStart";
	donpcevent "tiamat_mob#r110::OnStart";
	donpcevent "tiamat_mob#r111::OnStart";
	donpcevent "tiamat_mob#r112::OnStart";
	donpcevent "tiamat_mob#r113::OnStart";
	donpcevent "tiamat_mob#r114::OnStart";
	donpcevent "tiamat_mob#r115::OnStart";
	donpcevent "tiamat_mob#r116::OnStart";
	donpcevent "tiamat_mob#r117::OnStart";
	donpcevent "tiamat_mob#r118::OnStart";
	donpcevent "tiamat_mob#r119::OnStart";
	donpcevent "tiamat_mob#r120::OnStart";
	donpcevent "tiamat_mob#r121::OnStart";
	donpcevent "tiamat_mob#r122::OnStart";
	donpcevent "tiamat_mob#r123::OnStart";
	donpcevent "tiamat_mob#r124::OnStart";
	donpcevent "tiamat_mob#r125::OnStart";
	donpcevent "tiamat_mob#r126::OnStart";
	donpcevent "tiamat_mob#r127::OnStart";
	donpcevent "tiamat_mob#r128::OnStart";
	donpcevent "tiamat_mob#r129::OnStart";
	donpcevent "tiamat_mob#r130::OnStart";
	donpcevent "tiamat_mob#r131::OnStart";
	donpcevent "tiamat_mob#r132::OnStart";
	donpcevent "tiamat_mob#r133::OnStart";
	donpcevent "tiamat_mob#r134::OnStart";
	donpcevent "tiamat_mob#r135::OnStart";
	donpcevent "tiamat_mob#r136::OnStart";
	donpcevent "tiamat_mob#r137::OnStart";
	donpcevent "tiamat_mob#r138::OnStart";
	donpcevent "tiamat_mob#r139::OnStart";
	donpcevent "tiamat_mob#r140::OnStart";
	donpcevent "tiamat_mob#r141::OnStart";
	donpcevent "tiamat_mob#r142::OnStart";
	donpcevent "tiamat_mob#r143::OnStart";
	donpcevent "tiamat_mob#r144::OnStart";
	donpcevent "tiamat_mob#r145::OnStart";
	donpcevent "tiamat_mob#r146::OnStart";
	donpcevent "tiamat_mob#r147::OnStart";
	donpcevent "tiamat_mob#r148::OnStart";
	donpcevent "tiamat_mob#r149::OnStart";
	donpcevent "tiamat_mob#r150::OnStart";
	donpcevent "tiamat_mob#r151::OnStart";
	donpcevent "tiamat_mob#r152::OnStart";
	donpcevent "tiamat_mob#r153::OnStart";
	donpcevent "tiamat_mob#r154::OnStart";
	donpcevent "tiamat_mob#r155::OnStart";
	donpcevent "tiamat_mob#r156::OnStart";
	donpcevent "tiamat_mob#r157::OnStart";
	donpcevent "tiamat_mob#r158::OnStart";
	donpcevent "tiamat_mob#r159::OnStart";
	donpcevent "tiamat_mob#r160::OnStart";
	donpcevent "tiamat_mob#r161::OnStart";
	donpcevent "tiamat_mob#r162::OnStart";
	donpcevent "tiamat_mob#r163::OnStart";
	donpcevent "tiamat_mob#r164::OnStart";
	donpcevent "tiamat_mob#r165::OnStart";
	donpcevent "tiamat_mob#r166::OnStart";
	donpcevent "tiamat_mob#r167::OnStart";
	donpcevent "tiamat_mob#r168::OnStart";
	donpcevent "tiamat_mob#r169::OnStart";
	donpcevent "tiamat_mob#r170::OnStart";
	donpcevent "tiamat_mob#r171::OnStart";
	donpcevent "tiamat_mob#r172::OnStart";
	donpcevent "tiamat_mob#r173::OnStart";
	donpcevent "tiamat_mob#r174::OnStart";
	donpcevent "tiamat_mob#r175::OnStart";
	donpcevent "tiamat_mob#r176::OnStart";
	donpcevent "tiamat_mob#r177::OnStart";
	donpcevent "tiamat_mob#r178::OnStart";
	donpcevent "tiamat_mob#r179::OnStart";
	donpcevent "tiamat_mob#r180::OnStart";
	donpcevent "tiamat_mob#r181::OnStart";
	donpcevent "tiamat_mob#r182::OnStart";
	donpcevent "tiamat_mob#r183::OnStart";
	donpcevent "tiamat_mob#r184::OnStart";
	donpcevent "tiamat_mob#r185::OnStart";
	donpcevent "tiamat_mob#r187::OnStart";
	donpcevent "tiamat_mob#r190::OnStart";
	donpcevent "tiamat_mob#r191::OnStart";
	donpcevent "tiamat_mob#r192::OnStart";
	donpcevent "tiamat_mob#r193::OnStart";
	donpcevent "tiamat_mob#r194::OnStart";
	donpcevent "tiamat_mob#r195::OnStart";
	donpcevent "tiamat_mob#r196::OnStart";
	donpcevent "tiamat_mob#r197::OnStart";
	donpcevent "tiamat_mob#r198::OnStart";
	donpcevent "tiamat_mob#r199::OnStart";
	donpcevent "tiamat_mob#r200::OnStart";
	donpcevent "tiamat_mob#r201::OnStart";
	donpcevent "tiamat_mob#r202::OnStart";
}
1_tiamat_50.gat,0,0,0	script	tiamat_mob#r2	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",113,117,150,154,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 中庭(中央)] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 中庭(中央)] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 中庭(中央)] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 中庭(中央)] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	hideonnpc "四騎士ミルカ#1002_1"; //1813
	hideoffnpc "四騎士ミルカ#1003_1"; //1813
	donpcevent "#tiamat_start::OnMilka";
	set $@tiamat_milka,3;
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") == 0) {
			hideonnpc "四騎士ハウンド#2032_1"; //1868
			hideoffnpc "四騎士ハウンド#2033_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,33;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	}
	else {
		hideoffnpc "area#k22";
		hideoffnpc "area#k24";
		monster "this",160,139,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",114,163,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[その他 中庭(中央)] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_29.gat,0,0,0	script	tiamat_mob#r3	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[20][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[20][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",175,140,258,215,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 中庭(東)] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 中庭(東)] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 中庭(東)] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 中庭(東)] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2033_1"; //1868
			hideoffnpc "四騎士ハウンド#2034_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,34;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	}
	else {
		hideoffnpc "area#k31";
		monster "this",131,207,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#k32";
	monster "this",182,246,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#k34";
	monster "this",246,138,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	hideoffnpc "area#k35";
	monster "this",191,172,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	announce "[その他 中庭(東)] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_13.gat,0,0,0	script	tiamat_mob#r4	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",79,38,121,76,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 中庭(西)] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 中庭(西)] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 中庭(西)] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 中庭(西)] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_milka == 3) {
		hideonnpc "四騎士ミルカ#1003_1"; //1813
		hideoffnpc "四騎士ミルカ#1004_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,4;
		end;
	}
	if($@tiamat_lowen == 14 && getvariableofnpc('flag,"レバー#201_1") == 1) {
		hideoffnpc "四騎士ローウェン#3014_0"; //1807
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#005_1") == 1)	//教会2F大会議室レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	else {
		hideoffnpc "area#k44";
		setcell "this",91,34,0;
		monster "this",91,34,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	if(getvariableofnpc('flag,"レバー#201_1") == 1)	//城壁 城門①3Fレバー
		hideoffnpc "area#" +strnpcinfo(2)+ "5";
	else {
		hideoffnpc "area#k45";
		monster "this",69,33,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	announce "[その他 中庭(西)] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_47.gat,0,0,0	script	tiamat_mob#r5	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",159,15,205,80,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 中庭(北)] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 中庭(北)] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 中庭(北)] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 中庭(北)] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	// 中庭中央チェック
	if(getmapmobs("1_tiamat_50.gat","tiamat_mob#r2::OnKilled") > 0) {
		hideonnpc "四騎士ハウンド#2031_1"; //1868
		hideoffnpc "四騎士ハウンド#2032_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,32;
	}
	else {
		hideonnpc "四騎士ハウンド#2032_1"; //1868
		hideoffnpc "四騎士ハウンド#2033_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,33;
	}
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_32.gat","tiamat_mob#r157::OnKilled") == 0) {	//炊事場
			donpcevent "四騎士ハウンド#208_1::OnStart";
			set $@tiamat_hound,42;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[その他 中庭(北)] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_38.gat,0,0,0	script	tiamat_mob#r6	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[8][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[8][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",74,75,110,115,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 裏庭] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 裏庭] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 裏庭] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 裏庭] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#109_1") == 1)	//炊事場レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	else {
		hideoffnpc "area#k62";
		monster "this",84,115,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[その他 裏庭] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r7	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[22][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[22][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",75,35,115,73,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 秘密の庭] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 秘密の庭] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 秘密の庭] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 秘密の庭] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	if($@tiamat_milka == 17) {
		misceffect 488, "area#" +strnpcinfo(2)+ "1";
		hideonnpc "四騎士ミルカ#1017_1"; //1813
		hideoffnpc "四騎士ミルカ#1018_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,18;
	}
	if($@tiamat_hound == 25) {
		hideonnpc "四騎士ハウンド#2025_1"; //1868
		hideoffnpc "四騎士ハウンド#2026_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,26;
	}
	if($@tiamat_lowen == 17) {
		hideonnpc "四騎士ローウェン#3017_1"; //1807
		hideoffnpc "四騎士ローウェン#3018_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,18;
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	donpcevent "？？？？#r7::OnStart";
	announce "[その他 秘密の庭] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_40.gat,0,0,0	script	tiamat_mob#r8	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,14,29,36,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 ペコ舎] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 ペコ舎] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 ペコ舎] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 ペコ舎] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r8"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r8"; //496
	hideoffnpc "守護天使の亡骸#r8"; //496
	announce "[その他 ペコ舎] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[その他 ペコ舎] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "ウェルキエル#r8::OnStart";
	end;
}
1_tiamat_40.gat,0,0,0	script	tiamat_mob#r9	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[15][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[15][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",48,31,61,38,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 畜舎] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 畜舎] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 畜舎] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 畜舎] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[その他 畜舎] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_29.gat,0,0,0	script	tiamat_mob#r10	139,{
OnStart:
	initnpctimer;
	set 'flag,4;
	areamonster "this",214,235,266,254,"魔女のしもべ",3876,5,strnpcinfo(0)+ "::OnKilled";
	set 'maxmob,5;
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 墓地] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 墓地] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 墓地] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 墓地] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r10"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r10"; //496
	hideoffnpc "守護天使の亡骸#r10"; //496
	announce "[その他 墓地] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[その他 墓地] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "ガムビエル#r10::OnStart";
	end;
}
1_tiamat_36.gat,0,0,0	script	tiamat_mob#r11	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[23][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[23][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,30,35,47,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 墓地地下室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 墓地地下室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 墓地地下室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 墓地地下室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[その他 墓地地下室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_05.gat,0,0,0	script	tiamat_mob#r12	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[15][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[15][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",24,38,42,57,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 北井戸の底] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 北井戸の底] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 北井戸の底] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 北井戸の底] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"水門②開閉装置#k74AG08") == 1)	//水門②開いてる
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	else {
		hideoffnpc "area#k122";
		monster "this",25,37,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[その他 北井戸の底] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_05.gat,0,0,0	script	tiamat_mob#r13	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[15][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[15][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",20,108,45,131,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 南井戸の底] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 南井戸の底] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 南井戸の底] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 南井戸の底] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	if($@tiamat_milka == 14) {
		hideonnpc "四騎士ミルカ#1014_1"; //1813
		hideonnpc "四騎士ミルカ#1014_2"; //1813
		hideonnpc "四騎士ミルカ#1014_3"; //1813
		hideonnpc "四騎士ミルカ#1014_4"; //1813
		hideonnpc "四騎士ミルカ#1014_5"; //1813
		hideoffnpc "四騎士ミルカ#1015_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,15;
		end;
	}
	if($@tiamat_lowen == 14 && getvariableofnpc('flag,"レバー#201_1") == 1) {
		hideonnpc "四騎士ローウェン#3014_1"; //1807
		hideonnpc "四騎士ローウェン#3014_9"; //1807
		hideonnpc "四騎士ローウェン#3014_0"; //1807
		hideoffnpc "四騎士ローウェン#3015_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,15;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#005_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	}
	else {
		hideoffnpc "area#k131";
		monster "this",33,120,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	if(getvariableofnpc('flag,"水門①開閉装置#k73CG08") == 1 &&
	   getvariableofnpc('flag,"水門②開閉装置#k74AG08") == 1) {	//水門閉じてる
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	}
	else {
		hideoffnpc "area#k132";
		monster "this",42,129,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	announce "[その他 南井戸の底] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}

1_tiamat_55.gat,0,0,0	script	tiamat_mob#r14	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",273,222,302,247,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[その他 橋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[その他 橋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[その他 橋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[その他 橋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ミルカ#ex001"; //1813
	hideonnpc "四騎士ハウンド#ex001"; //1868
	hideonnpc "四騎士ローウェン#ex001"; //1932
	hideoffnpc "四騎士ミルカ#1001_1"; //1813
	hideoffnpc "四騎士ハウンド#2001_1"; //1868
	hideoffnpc "四騎士ローウェン#3001_1"; //1932
	set $@tiamat_milka,1;
	set $@tiamat_hound,1;
	set $@tiamat_lowen,1;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	donpcevent "魔女ジラント#tia60::OnStart";
	announce "[その他 橋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_60.gat,0,0,0	script	tiamat_mob#r15	139,{
OnStart:
	monster "1_tiamat_60.gat",94,66,"愚者の化身",20469,1,strnpcinfo(0)+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer2000:
	set $@tiamat_angel,$@tiamat_angel | (1<<21);
	announce "第22の守護天使 愚者の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer8000:
	misceffect 222, "area#r151"; //1356
	misceffect 222, "area#r152"; //1356
	misceffect 222, "area#r153"; //1356
	misceffect 222, "area#r154"; //1356
	end;
OnTimer10000:
	hideoffnpc "四騎士ミルカ#1002_1"; //1933
	hideoffnpc "四騎士ハウンド#2002_1"; //1933
	hideoffnpc "四騎士ローウェン#3002_1"; //1933
	set $@tiamat_milka,2;
	set $@tiamat_hound,2;
	set $@tiamat_lowen,2;
	misceffect 488, "area#r151"; //1356
	misceffect 488, "area#r152"; //1356
	misceffect 488, "area#r153"; //1356
	misceffect 488, "area#r154"; //1356
	end;
OnTimer12000:
	misceffect 321, "area#r151"; //1356
	misceffect 321, "area#r152"; //1356
	misceffect 321, "area#r153"; //1356
	misceffect 321, "area#r154"; //1356
	hideoffnpc "area#r151"; //1356
	hideoffnpc "area#r152"; //1356
	hideoffnpc "area#r153"; //1356
	hideoffnpc "area#r154"; //1356
	announce "[城壁 城門①1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	announce "王女メア : 魔女は王城の最深部にいるはずです。　四騎士達よ、頼みましたよ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
}
1_tiamat_41.gat,0,0,0	script	tiamat_mob#r16	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",86,6,110,29,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",108,31,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城門①3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城門①3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城門①3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城門①3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "四騎士ローウェン#302_1"; //1809
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	donpcevent "四騎士ローウェン#302_1::OnStart";
	announce "[城壁 城門①3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_57.gat,0,0,0	script	tiamat_mob#r17	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",110,140,160,168,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城門①屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城門①屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城門①屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城門①屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ローウェン#3006_1"; //1932
	hideoffnpc "四騎士ローウェン#3007_1"; //1932
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,7;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城門①屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_22.gat,0,0,0	script	tiamat_mob#r18	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",146,34,1165,83,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁1F08] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁1F08] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁1F08] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁1F08] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁1F08] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r19	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",85,28,180,36,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 城壁2F01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 城壁2F01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 城壁2F01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 城壁2F01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"tiamat_mob#r16") == 0)	//
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	else {
		hideoffnpc "area#k191";
		monster "this",183,41,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[監獄 城壁2F01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r20	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",214,48,235,90,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 城壁2F02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 城壁2F02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 城壁2F02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 城壁2F02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[監獄 城壁2F02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_58.gat,0,0,0	script	tiamat_mob#r21	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",68,280,150,295,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 城壁2F03] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 城壁2F03] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 城壁2F03] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 城壁2F03] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[監獄 城壁2F03] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r22	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",114,52,125,85,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 城壁2F04] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 城壁2F04] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 城壁2F04] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 城壁2F04] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 城壁2F04] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_56.gat,0,0,0	script	tiamat_mob#r26	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",144,113,215,126,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁2F08] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁2F08] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁2F08] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁2F08] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城壁 城壁2F08] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_45.gat,0,0,0	script	tiamat_mob#r27	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[7][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[7][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",21,8,37,13,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ローウェン#3008_1"; //1939
	hideonnpc "四騎士ローウェン#3008_2"; //1939
	hideonnpc "四騎士ローウェン#3008_3"; //1939
	hideonnpc "四騎士ローウェン#3008_4"; //1939
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "四騎士ローウェン#3009_1"; //1939
	if(getvariableofnpc('flag,"tiamat_mob#r50") == 0) {	// 塔・南西3F、倒してたら解放
		hideoffnpc "四騎士ローウェン#3009_2"; //1939
	}
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,9;
	announce "[城壁 城壁通路01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_45.gat,0,0,0	script	tiamat_mob#r29	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[8][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[8][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",10,30,16,70,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路03] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路03] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路03] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路03] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ローウェン#3009_1"; //1939
	hideonnpc "四騎士ローウェン#3009_2"; //1939
	hideonnpc "四騎士ローウェン#3008_3"; //1939
	hideonnpc "四騎士ローウェン#3008_4"; //1939
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"tiamat_mob#r73") == 0) {	// 天文台、倒してたら水門①イベ
		hideoffnpc "四騎士ローウェン#301_1"; //1939
		set $@tiamat_lowen,16;
		donpcevent "四騎士ローウェン#301_1::OnStart";
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r72") == 0) {	// 塔・北①4F、倒してたら解放
		hideoffnpc "四騎士ローウェン#3016_1"; //1939
		set $@tiamat_lowen,16;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r71") == 0) {	// 塔・北①3F、倒してたら解放
		hideoffnpc "四騎士ローウェン#3015_1"; //1939
		set $@tiamat_lowen,15;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r33") == 0) {	// 城壁通路07、倒してたら解放
		hideoffnpc "四騎士ローウェン#3014_1"; //1939
		set $@tiamat_lowen,14;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r62") == 0) {	// 塔・北西3F、倒してたら解放
		hideoffnpc "四騎士ローウェン#3013_1"; //1939
		set $@tiamat_lowen,13;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r31") == 0) {	// 城壁通路05、倒してたら解放
		hideoffnpc "四騎士ローウェン#3012_1"; //1939
		set $@tiamat_lowen,12;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r54") == 0) {	// 塔・西3F、倒してたら解放
		hideoffnpc "四騎士ローウェン#3011_1"; //1939
		set $@tiamat_lowen,11;
	}
	else {
		hideoffnpc "四騎士ローウェン#3010_1"; //1939
		set $@tiamat_lowen,10;
	}
	donpcevent "#tiamat_start::OnLowen";
	announce "[城壁 城壁通路03] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r35	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[1][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[1][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,265,37,307,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南① 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南① 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南① 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南① 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ローウェン#3002_1"; //1932
	hideoffnpc "四騎士ローウェン#3003_1"; //1932
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,3;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・南① 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r36	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[1][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[1][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",91,267,121,307,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南① 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南① 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南① 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南① 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	hideonnpc "四騎士ローウェン#3003_1"; //1932
	hideoffnpc "四騎士ローウェン#3004_1"; //1932
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,4;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k363";
	monster "this",88,271,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	announce "[塔・南① 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r37	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[1][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[1][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",178,264,209,307,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南① 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南① 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南① 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南① 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	hideonnpc "四騎士ローウェン#3004_1"; //1932
	hideoffnpc "四騎士ローウェン#3005_1"; //1932
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,5;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k373";
	monster "this",176,271,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	announce "[塔・南① 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
OnDaehyon:
	donpcevent "グローザ像#r16CG02::OnDaehyon";
	end;
}
1_tiamat_57.gat,0,0,0	script	tiamat_mob#r38	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",66,65,90,87,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南① 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南① 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南① 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南① 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ローウェン#3005_1"; //1932
	hideoffnpc "四騎士ローウェン#3006_1"; //1932
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,6;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・南① 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_61.gat,0,0,0	script	tiamat_mob#r39	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[9][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[9][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",164,100,181,123,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南② 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南② 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南② 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南② 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ハウンド#2002_1"; //1868
	hideoffnpc "四騎士ハウンド#2003_1"; //1868
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,3;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・南② 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_61.gat,0,0,0	script	tiamat_mob#r40	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",98,52,119,63,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南② 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南② 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南② 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南② 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ハウンド#2003_1"; //1868
	hideoffnpc "四騎士ハウンド#2004_1"; //1868
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,4;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・南② 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_56.gat,0,0,0	script	tiamat_mob#r23	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,114,77,125,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁2F05] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁2F05] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁2F05] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁2F05] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ハウンド#2004_1"; //1868
	hideoffnpc "四騎士ハウンド#2005_1"; //1868
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,5;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁2F05] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_56.gat,0,0,0	script	tiamat_mob#r24	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",113,153,126,225,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁2F06] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁2F06] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁2F06] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁2F06] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2036_1"; //1868
			hideoffnpc "四騎士ハウンド#2037_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,37;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#103_1") == 0) {
		hideoffnpc "area#k241";
		monster "this",119,146,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		hideoffnpc "area#k243";
		monster "this",112,176,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	else {
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
	}
	announce "[城壁 城壁2F06] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_56.gat,0,0,0	script	tiamat_mob#r25	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",112,12,127,91,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁2F07] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁2F07] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁2F07] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁2F07] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#103_1") == 0) {
		hideoffnpc "area#k251";
		monster "this",120,98,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	else
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k253";
	monster "this",113,70,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	announce "[城壁 城壁2F07] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_46.gat,0,0,0	script	tiamat_mob#r28	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",58,153,81,161,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ハウンド#2011_1"; //1868
	hideonnpc "四騎士ハウンド#2011_2"; //1868
	hideoffnpc "四騎士ハウンド#2012_1"; //1868
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,12;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁通路02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_46.gat,0,0,0	script	tiamat_mob#r30	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",93,175,96,230,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路04] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路04] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路04] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路04] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2013_1"; //1868
		hideoffnpc "四騎士ハウンド#2014_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,14;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁通路04] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_48.gat,0,0,0	script	tiamat_mob#r31	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[8][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[8][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",10,15,18,45,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路05] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路05] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路05] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路05] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_lowen == 11) {
		hideonnpc "四騎士ローウェン#3011_1"; //1939
		hideoffnpc "四騎士ローウェン#3012_1"; //1939
		set $@tiamat_lowen,12;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁通路05] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_49.gat,0,0,0	script	tiamat_mob#r32	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",89,223,96,265,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路06] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路06] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路06] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路06] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2015_1"; //1868
		hideoffnpc "四騎士ハウンド#2016_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,16;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁通路06] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_48.gat,0,0,0	script	tiamat_mob#r33	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[8][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[8][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",36,64,62,69,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路07] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路07] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路07] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路07] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_lowen == 13) {
		hideonnpc "四騎士ローウェン#3013_1"; //1939
		hideoffnpc "四騎士ローウェン#3014_1"; //1939
		set $@tiamat_lowen,14;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁通路07] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_49.gat,0,0,0	script	tiamat_mob#r34	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",35,282,72,286,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城壁 城壁通路08] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城壁 城壁通路08] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城壁 城壁通路08] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城壁 城壁通路08] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2017_1"; //1868
		hideoffnpc "四騎士ハウンド#2018_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,18;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城壁 城壁通路08] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r48	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,176,36,220,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南西 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南西 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南西 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南西 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・南西 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r49	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",90,176,120,220,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南西 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南西 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南西 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南西 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	announce "[塔・南西 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r50	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",180,176,200,220,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南西 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南西 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南西 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南西 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#201_1") == 1) {	//
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	}
	else {
		hideoffnpc "area#k503";
		hideoffnpc "area#k504";
		monster "this",217,191,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",209,213,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	if($@tiamat_lowen == 9) {	// 城壁通路01、倒してたら解放
		hideoffnpc "四騎士ローウェン#3009_2"; //1939
	}
	announce "[塔・南西 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
OnPyuriel:
	donpcevent "グローザ像#r16CG02::OnPyuriel";
	end;
}
1_tiamat_57.gat,0,0,0	script	tiamat_mob#r51	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",52,169,62,179,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南西 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南西 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南西 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南西 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・南西 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r52	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,92,36,136,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・西 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・西 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・西 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・西 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ローウェン#3014_1"; //1807
	hideonnpc "四騎士ローウェン#3014_9 "; //1807
	if($@tiamat_lowen == 14) {
		if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {//南井戸の底
			hideoffnpc "四騎士ローウェン#3015_1"; //1807
			set $@tiamat_lowen,15;
		}
		else if(getvariableofnpc('flag,"tiamat_mob#r4") == 0) {
			hideoffnpc "四騎士ローウェン#3014_0"; //1807
		}
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#201_1") == 1 &&	//クイズ終わり
	   getvariableofnpc('flag,"tiamat_mob#r4") == 0) {	//中庭(西)討伐済み
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	}
	else {
		hideoffnpc "area#k552";
		monster "this",53,99,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[塔・西 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r53	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",90,92,120,135,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・西 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・西 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・西 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・西 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#202_1") == 1) {	//城壁2F04
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
	}
	else {
		hideoffnpc "area#k533";
		monster "this",88,130,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	announce "[塔・西 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r54	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",178,92,208,135,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・西 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・西 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・西 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・西 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	if($@tiamat_lowen == 10) {
		hideonnpc "四騎士ローウェン#3010_1"; //1939
		hideoffnpc "四騎士ローウェン#3011_1"; //1939
		set $@tiamat_lowen,11;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#201_1") == 1) {	//クイズ終わり
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	}
	else {
		hideoffnpc "area#k544";
		monster "this",176,98,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[塔・西 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_57.gat,0,0,0	script	tiamat_mob#r55	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",130,206,152,230,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・西 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・西 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・西 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・西 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・西 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_14.gat,0,0,0	script	tiamat_mob#r56	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",12,10,49,29,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・東 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・東 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・東 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・東 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2034_1"; //1868
			hideoffnpc "四騎士ハウンド#2035_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,35;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・東 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_14.gat,0,0,0	script	tiamat_mob#r57	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,62,49,75,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・東 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・東 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・東 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・東 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2035_1"; //1868
			hideoffnpc "四騎士ハウンド#2036_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,36;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[塔・東 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_41.gat,0,0,0	script	tiamat_mob#r58	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",66,76,81,90,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・東 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・東 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・東 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・東 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2014_1"; //1868
		hideoffnpc "四騎士ハウンド#2015_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,15;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[塔・東 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_57.gat,0,0,0	script	tiamat_mob#r59	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",194,65,213,85,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・東 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・東 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・東 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・東 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・東 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_14.gat,0,0,0	script	tiamat_mob#r60	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[15][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[15][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",88,60,105,73,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北西 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北西 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北西 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北西 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・北西 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r61	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",264,121,278,147,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北西 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北西 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北西 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北西 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#315_1") == 1) {	//監獄終わり
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	}
	else {
		hideoffnpc "area#k612";
		monster "this",265,141,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[塔・北西 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_41.gat,0,0,0	script	tiamat_mob#r62	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[15][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[15][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,76,29,89,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北西 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北西 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北西 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北西 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_lowen == 12) {
		hideonnpc "四騎士ローウェン#3012_1"; //1939
		hideoffnpc "四騎士ローウェン#3013_1"; //1939
		set $@tiamat_lowen,13;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[塔・北西 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnGioia:
	donpcevent "グローザ像#r16CG02::OnGioia";
	end;
}
1_tiamat_03.gat,0,0,0	script	tiamat_mob#r63	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",101,333,123,356,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北西 塔・北西屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北西 塔・北西屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北西 塔・北西屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北西 塔・北西屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・北西 塔・北西屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r69	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,348,36,390,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北① 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北① 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北① 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北① 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・北① 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r70	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",90,348,124,390,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北① 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北① 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北① 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北① 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#201_1") == 1) {	//クイズ終わり
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
	}
	else {
		hideoffnpc "area#k703";
		monster "this",88,354,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[塔・北① 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r71	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",178,348,208,391,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北① 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北① 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北① 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北① 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_lowen == 14) {
		hideonnpc "四騎士ローウェン#3014_1"; //1939
		hideoffnpc "四騎士ローウェン#3015_1"; //1939
		set $@tiamat_lowen,15;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[塔・北① 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKades:
	donpcevent "グローザ像#r16CG02::OnKades";
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r72	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",264,348,295,393,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北① 4F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北① 4F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北① 4F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北① 4F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_lowen == 15) {
		hideonnpc "四騎士ローウェン#3015_1"; //1939
		hideoffnpc "四騎士ローウェン#3016_1"; //1939
		set $@tiamat_lowen,16;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・北① 4F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_01.gat,0,0,0	script	tiamat_mob#r73	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",85,180,115,205,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",101,209,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北① 天文台] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北① 天文台] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北① 天文台] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北① 天文台] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	if($@tiamat_lowen == 16) {
		hideoffnpc "四騎士ローウェン#301_1"; //1939
		donpcevent "四騎士ローウェン#301_1::OnStart"; //1939
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・北① 天文台] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_61.gat,0,0,0	script	tiamat_mob#r41	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",30,47,49,67,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南② 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南② 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南② 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南② 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	hideonnpc "四騎士ハウンド#2012_1"; //1868
	hideoffnpc "四騎士ハウンド#201_1"; //1868
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	donpcevent "四騎士ハウンド#201_1::OnStart";
	announce "[塔・南② 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_16.gat,0,0,0	script	tiamat_mob#r44	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[21][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[21][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",0,0,0,0,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",60,53,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "転移の石碑#k441";
	donpcevent "転移の石碑#r441::OnStart";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南東 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南東 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南東 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南東 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	end;
OnTimer4000:
	hideonnpc "四騎士ハウンド#2007_1"; //1868
	hideoffnpc "四騎士ハウンド#205_1"; //1868
	end;
OnTimer6000:
	stopnpctimer;
	donpcevent "転移の石碑#k441::OnStart";
	announce "[塔・南東 1F] の結界が解けました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_17.gat,0,0,0	script	tiamat_mob#r45	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[21][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[21][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",0,0,0,0,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",61,44,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "転移の石碑#k451";
	donpcevent "転移の石碑#r451::OnStart";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南東 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南東 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南東 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南東 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ハウンド#2005_1"; //1868
	hideoffnpc "四騎士ハウンド#203_1"; //1868
	end;
OnTimer6000:
	stopnpctimer;
	donpcevent "転移の石碑#k451::OnStart";
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#103_1") == 0) {
		hideoffnpc "area#k451";
		setcell "this",61,91,0;
		monster "this",61,91,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	else
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・南東 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_18.gat,0,0,0	script	tiamat_mob#r46	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[21][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[21][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",0,0,0,0,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",49,47,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "転移の石碑#k461";
	donpcevent "転移の石碑#r461::OnStart";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南東 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南東 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南東 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南東 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ハウンド#2006_1"; //1868
	hideoffnpc "四騎士ハウンド#204_1"; //1868
	end;
OnTimer6000:
	stopnpctimer;
	donpcevent "転移の石碑#k461::OnStart";
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k461";
	hideoffnpc "area#k462";
	announce "[塔・南東 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	monster "this",49,11,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	monster "this",49,89,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled4";
	end;
OnKilled:
OnKilled2:
OnKilled3:
OnKilled4:
	end;
}
1_tiamat_03.gat,0,0,0	script	tiamat_mob#r47	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",185,326,214,343,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",199,350,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "転移の石碑#k471";
	donpcevent "転移の石碑#r471::OnStart";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南東 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南東 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南東 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南東 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	end;
OnTimer4000:
	hideonnpc "四騎士ハウンド#2008_1"; //1868
	hideoffnpc "四騎士ハウンド#206_1"; //1868
	end;
OnTimer6000:
	stopnpctimer;
	donpcevent "転移の石碑#k471::OnStart";
	announce "[塔・南東 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_03.gat,0,0,0	script	tiamat_mob#r42	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",94,237,109,260,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",113,248,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "転移の石碑#k421";
	donpcevent "転移の石碑#r421::OnStart";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南② 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南② 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南② 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南② 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	end;
OnTimer4000:
	hideonnpc "四騎士ハウンド#2009_1"; //1868
	hideoffnpc "四騎士ハウンド#207_1"; //1868
	end;
OnTimer6000:
	stopnpctimer;
	donpcevent "転移の石碑#k421::OnStart";
//	announce "[塔・南② 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_19.gat,0,0,0	script	tiamat_mob#r43	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",0,0,0,0,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	donpcevent "転移の石碑#r431::OnStart";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・南東 B1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・南東 B1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・南東 B1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・南東 B1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r43"; //496
		}
		initnpctimer;
		end;
	}
	stopnpctimer;
	hideoffnpc "四騎士ハウンド#2011_1"; //1878
	hideoffnpc "四騎士ハウンド#2011_2"; //1878
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,11;
	misceffect 831, "守護天使の亡骸#r43"; //496
	hideoffnpc "守護天使の亡骸#r43"; //496
	announce "[塔・南東B1F] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
OnKilled3:
	donpcevent "サタナキア#r43::OnStart";
	end;
}
1_tiamat_25.gat,0,0,0	script	tiamat_mob#r64	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",38,130,69,172,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北東 B1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北東 B1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北東 B1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北東 B1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#102_1") == 1)	//城壁  城壁2F08レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	else {
		hideoffnpc "area#k641";
		monster "this",23,144,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・北東 B1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r65	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,6,36,50,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北東 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北東 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北東 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北東 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#102_1") == 1)	//城壁  城壁2F08レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	else {
		hideoffnpc "area#k652";
		monster "this",53,13,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[塔・北東 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r66	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",90,6,119,48,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北東 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北東 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北東 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北東 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	if(getvariableofnpc('flag,"レバー#102_1") == 1)	//城壁  城壁2F08レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	else {
		hideoffnpc "area#k661";
		monster "this",96,51,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#103_1") == 1)	//城壁 城壁2F07レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	else {
		hideoffnpc "area#k664";
		monster "this",96,4,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	announce "[塔・北東 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r67	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",178,6,209,51,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北東 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北東 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北東 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北東 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2016_1"; //1868
		hideoffnpc "四騎士ハウンド#2017_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,17;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#102_1") == 1)	//城壁  城壁2F08レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	else {
		hideoffnpc "area#k672";
		monster "this",225,13,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	announce "[塔・北東 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_57.gat,0,0,0	script	tiamat_mob#r68	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",209,157,223,177,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北東 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北東 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北東 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北東 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・北東 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
/*1_tiamat_08.gat,0,0,0	script	tiamat_mob#r72	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",265,360,306,390,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北① 4F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北① 4F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北① 4F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北① 4F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・北① 4F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
*/
1_tiamat_33.gat,0,0,0	script	tiamat_mob#r74	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",254,264,277,293,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	setcell "this",281,278,0;
	monster "this",281,278,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北② B1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北② B1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北② B1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北② B1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2021_1"; //1868
		hideoffnpc "四騎士ハウンド#202_1"; //1868
		donpcevent "四騎士ハウンド#202_1::OnStart";
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・北② B1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_22.gat,0,0,0	script	tiamat_mob#r75	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[9][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[9][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",150,148,165,169,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北② 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北② 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北② 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北② 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2020_1"; //1868
		hideoffnpc "四騎士ハウンド#2021_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,21;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[塔・北② 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_22.gat,0,0,0	script	tiamat_mob#r76	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",38,76,65,103,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北② 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北② 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北② 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北② 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2019_1"; //1868
		hideoffnpc "四騎士ハウンド#2020_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,20;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k763";
	announce "[塔・北② 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	monster "this",52,105,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_22.gat,0,0,0	script	tiamat_mob#r77	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[10][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[10][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",98,100,125,127,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北② 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北② 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北② 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北② 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_hound >= 13) {
		hideonnpc "四騎士ハウンド#2018_1"; //1868
		hideoffnpc "四騎士ハウンド#2019_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,19;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[塔・北② 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_03.gat,0,0,0	script	tiamat_mob#r78	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",279,332,295,356,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[塔・北② 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[塔・北② 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[塔・北② 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[塔・北② 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[塔・北② 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_49.gat,0,0,0	script	tiamat_mob#r79	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",235,10,252,46,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 城門②1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 城門②1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 城門②1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 城門②1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound == 30) {
		hideonnpc "四騎士ハウンド#2030_1"; //1868
		hideoffnpc "四騎士ハウンド#2031_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,31;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城1F 城門②1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r80	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[25][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[25][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",74,215,111,250,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F エントランス] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F エントランス] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F エントランス] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F エントランス] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 222, "area#" +strnpcinfo(2)+ "6";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	misceffect 488, "area#" +strnpcinfo(2)+ "6";
	if($@tiamat_milka == 21) {
		hideonnpc "四騎士ミルカ#1021_1"; //1813
		hideoffnpc "四騎士ミルカ#1022_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,22;
	}
	if($@tiamat_hound == 29) {
		hideonnpc "四騎士ハウンド#2029_1"; //1868
		hideoffnpc "四騎士ハウンド#2030_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,30;
	}
	if($@tiamat_lowen == 21) {
		hideonnpc "四騎士ローウェン#3021_1"; //1807
		hideoffnpc "四騎士ローウェン#3022_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,22;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	misceffect 321, "area#" +strnpcinfo(2)+ "6";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k803";
	monster "this",83,251,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "6";
	announce "[城1F エントランス] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_09.gat,0,0,0	script	tiamat_mob#r81	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[23][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[23][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",81,35,107,53,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 待合室①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 待合室①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 待合室①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 待合室①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城1F 待合室①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_09.gat,0,0,0	script	tiamat_mob#r82	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[23][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[23][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",196,34,220,53,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 待合室②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 待合室②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 待合室②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 待合室②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城1F 待合室②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r83	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[23][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[23][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",35,240,51,259,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 待合室③] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 待合室③] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 待合室③] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 待合室③] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka == 20) {
		hideonnpc "四騎士ミルカ#1020_1"; //1813
		hideoffnpc "四騎士ミルカ#1021_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,21;
	}
	if($@tiamat_hound == 28) {
		hideonnpc "四騎士ハウンド#2028_1"; //1868
		hideoffnpc "四騎士ハウンド#2029_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,29;
	}
	if($@tiamat_lowen == 20) {
		hideonnpc "四騎士ローウェン#3020_1"; //1807
		hideoffnpc "四騎士ローウェン#3021_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,21;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城1F 待合室③] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r84	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[24][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[24][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",108,10,191,105,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 大ホール] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 大ホール] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 大ホール] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 大ホール] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r84"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 831, "守護天使の亡骸#r84"; //496
	hideoffnpc "守護天使の亡骸#r84"; //496
	announce "[城1F 大ホール] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_milka == 19) {
		hideonnpc "四騎士ミルカ#1019_1"; //1813
		hideoffnpc "四騎士ミルカ#1020_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,20;
	}
	if($@tiamat_hound == 27) {
		hideonnpc "四騎士ハウンド#2027_1"; //1868
		hideoffnpc "四騎士ハウンド#2028_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,28;
	}
	if($@tiamat_lowen == 19) {
		hideonnpc "四騎士ローウェン#3019_1"; //1807
		hideoffnpc "四騎士ローウェン#3020_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,20;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#k841";
	monster "this",149,5,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	announce "[城1F 大ホール] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
OnKilled3:
	donpcevent "フルーレティ#r84::OnStart";
	donpcevent "守護天使の亡骸#r84::OnKilled";
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r85	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",236,6,293,61,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 中ホール] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 中ホール] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 中ホール] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 中ホール] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城1F 中ホール] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r86	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",78,256,103,282,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 小ホール①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 小ホール①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 小ホール①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 小ホール①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城1F 小ホール①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_20.gat,0,0,0	script	tiamat_mob#r87	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",160,264,185,285,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 小ホール②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 小ホール②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 小ホール②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 小ホール②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城1F 小ホール②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r88	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",132,240,182,277,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 城内通路1F01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 城内通路1F01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 城内通路1F01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 城内通路1F01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城1F 城内通路1F01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r89	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",106,320,170,345,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 城内通路1F02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 城内通路1F02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 城内通路1F02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 城内通路1F02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka == 18) {
		hideonnpc "四騎士ミルカ#1018_1"; //1813
		hideoffnpc "四騎士ミルカ#1019_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,19;
	}
	if($@tiamat_hound == 26) {
		hideonnpc "四騎士ハウンド#2026_1"; //1868
		hideoffnpc "四騎士ハウンド#2027_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,27;
	}
	if($@tiamat_lowen == 18) {
		hideonnpc "四騎士ローウェン#3018_1"; //1807
		hideoffnpc "四騎士ローウェン#3019_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,19;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#109_1") == 1)	//炊事場レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	else {
		hideoffnpc "area#k892";
		monster "this",173,342,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[城1F 城内通路1F02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_43.gat,0,0,0	script	tiamat_mob#r90	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,28,23,40,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城1F 貴賓室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城1F 貴賓室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城1F 貴賓室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城1F 貴賓室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城1F 貴賓室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_58.gat,0,0,0	script	tiamat_mob#r91	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",20,70,47,77,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F バルコニー①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F バルコニー①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F バルコニー①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F バルコニー①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_milka == 22) {
		hideonnpc "四騎士ミルカ#1022_1"; //1813
		hideoffnpc "四騎士ミルカ#1023_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,23;
	}
	if($@tiamat_lowen == 22) {
		hideonnpc "四騎士ローウェン#3022_1"; //1807
		hideoffnpc "四騎士ローウェン#3023_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,23;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[城2F バルコニー①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r92	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",114,204,140,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 待機室2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 待機室2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 待機室2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 待機室2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 待機室2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_34.gat,0,0,0	script	tiamat_mob#r93	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",88,12,99,39,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F ヴンダーカンマー] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F ヴンダーカンマー] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F ヴンダーカンマー] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F ヴンダーカンマー] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F ヴンダーカンマー] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r94	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",196,192,222,228,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 城門②2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 城門②2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 城門②2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 城門②2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 城門②2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_37.gat,0,0,0	script	tiamat_mob#r95	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[6][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[6][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",100,57,135,125,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 謁見の間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 謁見の間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 謁見の間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 謁見の間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r95"; //836
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 831, "守護天使の亡骸#r95"; //836
	hideoffnpc "守護天使の亡骸#r95"; //836
	announce "[城2F 謁見の間] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	monster "this",131,92,"#EF_004",3869,1,strnpcinfo(0)+ "::OnKilled4";
	donpcevent "守護天使の亡骸#r95::OnStart";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_milka == 25) {
		hideonnpc "四騎士ミルカ#1025_1"; //1813
		hideoffnpc "四騎士ミルカ#1026_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,26;
	}
	if($@tiamat_lowen == 25) {
		hideonnpc "四騎士ローウェン#3025_1"; //1807
		hideoffnpc "四騎士ローウェン#3026_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,26;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	if(getvariableofnpc('flag,"レバー#204_1")+getvariableofnpc('flag,"レバー#007_1") < 2) {	// 待機室2F、城門②2F レバー
		hideoffnpc "area#k951";
		monster "this",92,91,"#EF_007",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	else
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k953";
	monster "this",141,110,"#EF_007",3869,1,strnpcinfo(0)+ "::OnKilled3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	misceffect 675, "守護天使の亡骸#r95"; //836
	announce "[城2F 謁見の間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
OnKilled4:
	end;
OnKilled5:
	donpcevent "アガリアレプト#r95::OnStart";
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r96	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",124,137,175,170,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 円卓の間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 円卓の間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 円卓の間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 円卓の間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 円卓の間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_61.gat,0,0,0	script	tiamat_mob#r97	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",96,94,121,106,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 図書室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 図書室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 図書室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 図書室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 図書室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_32.gat,0,0,0	script	tiamat_mob#r98	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",12,104,50,123,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 会議室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 会議室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 会議室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 会議室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 会議室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r99	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",236,72,267,103,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 執務室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 執務室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 執務室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 執務室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka == 26) {
		hideonnpc "四騎士ミルカ#1026_1"; //1813
		hideoffnpc "四騎士ミルカ#1027_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,27;
	}
	if($@tiamat_lowen == 26) {
		hideonnpc "四騎士ローウェン#3026_1"; //1807
		hideoffnpc "四騎士ローウェン#3027_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,27;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城2F 執務室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_43.gat,0,0,0	script	tiamat_mob#r100	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,25,43,192,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 来客室①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 来客室①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 来客室①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 来客室①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 来客室①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_43.gat,0,0,0	script	tiamat_mob#r101	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,126,24,142,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 来客室②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 来客室②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 来客室②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 来客室②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 来客室②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_43.gat,0,0,0	script	tiamat_mob#r102	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,76,25,90,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 来客室③] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 来客室③] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 来客室③] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 来客室③] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 来客室③] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r103	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",234,294,261,347,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 大貴賓室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 大貴賓室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 大貴賓室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 大貴賓室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 大貴賓室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_15.gat,0,0,0	script	tiamat_mob#r104	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",135,35,165,57,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 医務室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 医務室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 医務室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 医務室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 医務室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r105	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	areamonster "this",160,160,271,167,"魔女のしもべ",20503,10,strnpcinfo(0)+ "::OnKilled";
	set 'maxmob,10;
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 城内通路2F01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 城内通路2F01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 城内通路2F01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 城内通路2F01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 222, "area#" +strnpcinfo(2)+ "6";
	misceffect 222, "area#" +strnpcinfo(2)+ "7";
	misceffect 222, "area#" +strnpcinfo(2)+ "8";
	misceffect 222, "area#" +strnpcinfo(2)+ "9";
	misceffect 222, "area#" +strnpcinfo(2)+ "10";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	misceffect 488, "area#" +strnpcinfo(2)+ "6";
	misceffect 488, "area#" +strnpcinfo(2)+ "7";
	misceffect 488, "area#" +strnpcinfo(2)+ "8";
	misceffect 488, "area#" +strnpcinfo(2)+ "9";
	misceffect 488, "area#" +strnpcinfo(2)+ "10";
	if($@tiamat_milka == 27) {
		hideonnpc "四騎士ミルカ#1027_1"; //1813
		hideoffnpc "四騎士ミルカ#1028_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,28;
	}
	if($@tiamat_lowen == 27) {
		hideonnpc "四騎士ローウェン#3027_1"; //1807
		hideoffnpc "四騎士ローウェン#3028_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,28;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	misceffect 321, "area#" +strnpcinfo(2)+ "6";
	misceffect 321, "area#" +strnpcinfo(2)+ "7";
	misceffect 321, "area#" +strnpcinfo(2)+ "8";
	misceffect 321, "area#" +strnpcinfo(2)+ "9";
	misceffect 321, "area#" +strnpcinfo(2)+ "10";
	if($@tiamat_angel & (1<<9)) {
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	}
	else {
		hideoffnpc "area#k1051"; //1258
		monster "this",216,142,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "6";
	if(getvariableofnpc('flag,"レバー#008_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "7";
	}
	else {
		hideoffnpc "area#k1057"; //1258
		monster "this",164,176,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	if(getvariableofnpc('flag,"レバー#008_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "8";
	}
	else {
		hideoffnpc "area#k1058"; //1258
		monster "this",253,148,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled4";
	}
	if(getvariableofnpc('flag,"レバー#009_1") == 1) {	// 医務室レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "9";
	}
	else {
		hideoffnpc "area#k1059"; //1258
		setcell "this",278,163,0;
		monster "this",278,163,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled5";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "10";
	announce "[城2F 城内通路2F01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
OnKilled4:
OnKilled5:
	end;
}
1_tiamat_35.gat,0,0,0	script	tiamat_mob#r106	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",160,160,179,175,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 城内通路2F02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 城内通路2F02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 城内通路2F02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 城内通路2F02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka == 28) {
		hideonnpc "四騎士ミルカ#1028_1"; //1813
		hideoffnpc "四騎士ミルカ#1029_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,29;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城2F 城内通路2F02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_35.gat,0,0,0	script	tiamat_mob#r107	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",122,158,145,169,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 城内通路2F03] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 城内通路2F03] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 城内通路2F03] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 城内通路2F03] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_lowen == 28) {
		hideonnpc "四騎士ローウェン#3028_1"; //1807
		hideoffnpc "四騎士ローウェン#3029_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,29;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[城2F 城内通路2F03] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r108	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",172,8,193,29,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王の部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王の部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王の部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王の部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r108"; //773
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 831, "守護天使の亡骸#r108"; //773
	hideoffnpc "守護天使の亡骸#r108"; //773
	announce "[城3F 王の部屋] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城3F 王の部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "アスモデル#r108::OnStart";
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r109	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",8,14,29,37,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王妃の部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王妃の部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王妃の部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王妃の部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 王妃の部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r110	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",12,88,33,109,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王子の部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王子の部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王子の部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王子の部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r110"; //773
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r110"; //773
	hideoffnpc "守護天使の亡骸#r110"; //773
	announce "[城3F 王子の部屋] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 王子の部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "ハマリエル#r110::OnStart";
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r111	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",172,76,193,97,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王女の部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王女の部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王女の部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王女の部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r111"; //773
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r111"; //773
	hideoffnpc "守護天使の亡骸#r111"; //773
	announce "[城3F 王女の部屋] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 王女の部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "バキエル#r111::OnStart";
	end;
}
1_tiamat_62.gat,0,0,0	script	tiamat_mob#r112	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,94,33,105,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王の寝室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王の寝室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王の寝室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王の寝室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 王の寝室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_34.gat,0,0,0	script	tiamat_mob#r113	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",270,202,287,222,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王妃の寝室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王妃の寝室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王妃の寝室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王妃の寝室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r113"; //773
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r113"; //773
	hideoffnpc "守護天使の亡骸#r113"; //773
	announce "[城3F 王妃の寝室] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 王妃の寝室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "アスタロト#r113::OnStart";
	end;
}
1_tiamat_20.gat,0,0,0	script	tiamat_mob#r114	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",216,160,233,172,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王子の寝室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王子の寝室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王子の寝室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王子の寝室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 王子の寝室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_20.gat,0,0,0	script	tiamat_mob#r115	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",266,160,278,171,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 王女の寝室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 王女の寝室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 王女の寝室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 王女の寝室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 王女の寝室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r116	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[17][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[17][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",352,118,383,154,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F グレートホール] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F グレートホール] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F グレートホール] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F グレートホール] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城3F グレートホール] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r117	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",298,258,329,281,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 食堂] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 食堂] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 食堂] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 食堂] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 食堂] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_09.gat,0,0,0	script	tiamat_mob#r118	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",226,114,240,149,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 客間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 客間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 客間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 客間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 客間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r119	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",326,324,349,347,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 応接間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 応接間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 応接間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 応接間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城3F 応接間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_37.gat,0,0,0	script	tiamat_mob#r120	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,112,29,127,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F 小礼拝堂] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F 小礼拝堂] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F 小礼拝堂] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F 小礼拝堂] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	hideonnpc "四騎士ミルカ#1031_1"; //1811
	hideoffnpc "四騎士ミルカ#101_1"; //1811
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城2F 小礼拝堂] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	donpcevent "四騎士ミルカ#101_1::OnStart";
	end;
OnKilled:
	end;
}
1_tiamat_35.gat,0,0,0	script	tiamat_mob#r121	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",42,158,65,169,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 城内通路3F01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 城内通路3F01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 城内通路3F01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 城内通路3F01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka == 29) {
		hideonnpc "四騎士ミルカ#1029_1"; //1813
		hideoffnpc "四騎士ミルカ#1030_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,30;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城3F 城内通路3F01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_42.gat,0,0,0	script	tiamat_mob#r122	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",58,162,113,169,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 城内通路3F02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 城内通路3F02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 城内通路3F02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 城内通路3F02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	if($@tiamat_milka == 30) {
		hideonnpc "四騎士ミルカ#1030_1"; //1813
		hideoffnpc "四騎士ミルカ#1031_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,31;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#k1222";
	monster "this",53,152,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#k1224";
	monster "this",82,175,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	announce "[城3F 城内通路3F02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_43.gat,0,0,0	script	tiamat_mob#r123	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",138,116,153,188,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 城内通路3F03] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 城内通路3F03] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 城内通路3F03] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 城内通路3F03] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 222, "area#" +strnpcinfo(2)+ "6";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	misceffect 488, "area#" +strnpcinfo(2)+ "6";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	misceffect 321, "area#" +strnpcinfo(2)+ "6";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "6";
	announce "[城3F 城内通路3F03] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_43.gat,0,0,0	script	tiamat_mob#r124	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",130,6,145,78,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城3F 城内通路3F04] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城3F 城内通路3F04] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城3F 城内通路3F04] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城3F 城内通路3F04] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 222, "area#" +strnpcinfo(2)+ "6";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	misceffect 488, "area#" +strnpcinfo(2)+ "6";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	misceffect 321, "area#" +strnpcinfo(2)+ "6";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "6";
	announce "[城3F 城内通路3F04] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_26.gat,0,0,0	script	tiamat_mob#r125	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",95,101,118,149,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城内通路 B1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城内通路 B1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城内通路 B1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城内通路 B1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound >= 22) {	//水門②開けてあるなら進む
		hideonnpc "四騎士ハウンド#2022_1"; //1868
		hideoffnpc "四騎士ハウンド#2023_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,23;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_hound >= 23)	//水門②開けてあるなら進む
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	else {
		hideoffnpc "area#k1251";
		monster "this",122,146,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城内通路 B1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_63.gat,0,0,0	script	tiamat_mob#r126	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",217,239,256,268,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城B1F 噴水基部] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城B1F 噴水基部] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城B1F 噴水基部] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城B1F 噴水基部] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_milka == 16) {
		hideonnpc "四騎士ミルカ#1016_1"; //1813
		hideoffnpc "四騎士ミルカ#1017_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,17;
		end;
	}
	if($@tiamat_hound == 24) {	//水門②開けてあるなら進む
		hideonnpc "四騎士ハウンド#2024_1"; //1868
		hideoffnpc "四騎士ハウンド#2025_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,25;
	}
	if($@tiamat_lowen == 16) {
		hideonnpc "四騎士ローウェン#3016_1"; //1807
		hideoffnpc "四騎士ローウェン#3017_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,17;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "1"; //秘密の庭
	if(getvariableofnpc('flag,"水門①開閉装置#k73CG08") == 1) {	//水門①閉じてる
		hideoffnpc "area#" +strnpcinfo(2)+ "4"; //水路02
		if(getvariableofnpc('flag,"水門②開閉装置#k74AG08") == 1) {	//水門②閉じてる
			hideoffnpc "area#" +strnpcinfo(2)+ "2"; //噴水最深部
			hideoffnpc "area#" +strnpcinfo(2)+ "3"; //水路01
		}
		else {
			hideoffnpc "area#k1262";
			monster "this",264,246,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
			hideoffnpc "area#k1263";
			monster "this",218,246,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		}
	} else {
		hideoffnpc "area#k1262";
		monster "this",264,246,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		hideoffnpc "area#k1263";
		monster "this",218,246,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		hideoffnpc "area#k1264";
		monster "this",255,271,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "5"; //水路03
	announce "[城B1F 噴水基部] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_05.gat,0,0,0	script	tiamat_mob#r127	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[23][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[23][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",102,38,120,57,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城B1F 噴水最深部] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城B1F 噴水最深部] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城B1F 噴水最深部] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城B1F 噴水最深部] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城B1F 噴水最深部] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_26.gat,0,0,0	script	tiamat_mob#r128	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",44,18,115,56,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城B1F 水路01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城B1F 水路01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城B1F 水路01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城B1F 水路01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r168"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 831, "守護天使の亡骸#r168"; //496
	hideoffnpc "守護天使の亡骸#r168"; //496
	announce "[城B1F 水路01] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka == 15) {
		hideonnpc "四騎士ミルカ#1015_1"; //1813
		hideoffnpc "四騎士ミルカ#1016_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,16;
		end;
	}
	if($@tiamat_lowen == 15) {
		hideonnpc "四騎士ローウェン#3015_1"; //1807
		hideoffnpc "四騎士ローウェン#3016_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,16;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城B1F 水路01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "ハナエル#r128::OnStart";
	end;
}
1_tiamat_26.gat,0,0,0	script	tiamat_mob#r129	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",63,160,69,220,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城B1F 水路02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城B1F 水路02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城B1F 水路02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城B1F 水路02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[城B1F 水路02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_26.gat,0,0,0	script	tiamat_mob#r130	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",46,84,133,91,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城B1F 水路03] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城B1F 水路03] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城B1F 水路03] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城B1F 水路03] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_hound >= 23) {
		hideonnpc "四騎士ハウンド#2023_1"; //1868
		hideoffnpc "四騎士ハウンド#2024_1"; //1868
		donpcevent "#tiamat_start::OnHound";
		set $@tiamat_hound,24;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_hound >= 23) {
		hideoffnpc "area#r1301";
		hideoffnpc "area#r1302";
		hideoffnpc "area#r1303";
	}
	else {
		hideoffnpc "area#k1301";
		hideoffnpc "area#k1302";
		hideoffnpc "area#k1303";
		monster "this",47,93,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",130,112,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",90,92,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[城B1F 水路03] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_53.gat,0,0,0	script	tiamat_mob#r131	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[6][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[6][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",91,234,150,267,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城B1F 財の間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城B1F 財の間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城B1F 財の間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城B1F 財の間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[城B1F 財の間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_25.gat,0,0,0	script	tiamat_mob#r132	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",160,12,187,35,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	setcell "this",186,14,0;
	monster "this",186,14,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 看守部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 看守部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 看守部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 看守部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[監獄 看守部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r133	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",4,222,19,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"tiamat_mob#r141") == 0)
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 地下牢①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r134	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",40,222,54,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 地下牢②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r135	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",76,222,91,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢③] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢③] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢③] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢③] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 地下牢③] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r136	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",112,222,126,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢④] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢④] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢④] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢④] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 地下牢④] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r137	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",148,222,162,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢⑤] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢⑤] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢⑤] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢⑤] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 地下牢⑤] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r138	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",184,222,199,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢⑥] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢⑥] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢⑥] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢⑥] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 地下牢⑥] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r139	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",220,222,229,235,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢⑦] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢⑦] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢⑦] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢⑦] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 地下牢⑦] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_06.gat,0,0,0	script	tiamat_mob#r140	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[11][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[11][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",172,18,207,67,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 拷問部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 拷問部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 拷問部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 拷問部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[監獄 拷問部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "ネビロス#r140::OnStart";
	end;
}
1_tiamat_12.gat,0,0,0	script	tiamat_mob#r141	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",4,212,235,219,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[監獄 地下牢通路] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[監獄 地下牢通路] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[監獄 地下牢通路] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[監獄 地下牢通路] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 222, "area#" +strnpcinfo(2)+ "6";
	misceffect 222, "area#" +strnpcinfo(2)+ "7";
	misceffect 222, "area#" +strnpcinfo(2)+ "8";
	misceffect 222, "area#" +strnpcinfo(2)+ "9";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	misceffect 488, "area#" +strnpcinfo(2)+ "6";
	misceffect 488, "area#" +strnpcinfo(2)+ "7";
	misceffect 488, "area#" +strnpcinfo(2)+ "8";
	misceffect 488, "area#" +strnpcinfo(2)+ "9";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	misceffect 321, "area#" +strnpcinfo(2)+ "6";
	misceffect 321, "area#" +strnpcinfo(2)+ "7";
	misceffect 321, "area#" +strnpcinfo(2)+ "8";
	misceffect 321, "area#" +strnpcinfo(2)+ "9";
	if(getvariableofnpc('flag,"tiamat_mob#r133") == 0)
		hideoffnpc "area#r1331";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "6";
	hideoffnpc "area#" +strnpcinfo(2)+ "7";
	hideoffnpc "area#" +strnpcinfo(2)+ "8";
	hideoffnpc "area#" +strnpcinfo(2)+ "9";
	announce "[監獄 地下牢通路] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r142	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",12,82,95,99,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎1F 兵舎1F通路] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎1F 兵舎1F通路] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎1F 兵舎1F通路] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎1F 兵舎1F通路] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 222, "area#" +strnpcinfo(2)+ "6";
	misceffect 222, "area#" +strnpcinfo(2)+ "7";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	misceffect 488, "area#" +strnpcinfo(2)+ "6";
	misceffect 488, "area#" +strnpcinfo(2)+ "7";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2039_1"; //1868
			hideoffnpc "四騎士ハウンド#2040_1"; //1868
			hideoffnpc "四騎士ハウンド#2040_2"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,40;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	misceffect 321, "area#" +strnpcinfo(2)+ "6";
	misceffect 321, "area#" +strnpcinfo(2)+ "7";
	hideoffnpc "area#k1421";
	monster "this",15,92,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	donpcevent "area#" +strnpcinfo(2)+ "2::OnStart";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	donpcevent "area#" +strnpcinfo(2)+ "3::OnStart";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	donpcevent "area#" +strnpcinfo(2)+ "4::OnStart";
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	donpcevent "area#" +strnpcinfo(2)+ "5::OnStart";
	hideoffnpc "area#" +strnpcinfo(2)+ "6";
	hideoffnpc "area#k1427";
	monster "this",63,97,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	announce "[兵舎1F 兵舎1F通路] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r143	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",198,280,211,286,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎1F 部屋①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎1F 部屋①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎1F 部屋①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎1F 部屋①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[兵舎1F 部屋①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r144	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",142,182,154,189,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎1F 部屋②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎1F 部屋②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎1F 部屋②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎1F 部屋②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[兵舎1F 部屋②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r145	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",198,182,210,188,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎1F 部屋③] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎1F 部屋③] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎1F 部屋③] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎1F 部屋③] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[兵舎1F 部屋③] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r146	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[18][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[18][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",254,182,267,189,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎1F 部屋④] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎1F 部屋④] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎1F 部屋④] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎1F 部屋④] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[兵舎1F 部屋④] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamat_mob#r147	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",262,198,285,220,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎1F 武器庫] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎1F 武器庫] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎1F 武器庫] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎1F 武器庫] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[兵舎1F 武器庫] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r148	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",220,62,287,71,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎2F 兵舎2F通路] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎2F 兵舎2F通路] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎2F 兵舎2F通路] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎2F 兵舎2F通路] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2038_1"; //1868
			hideoffnpc "四騎士ハウンド#2039_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,39;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#k1481";
	monster "this",282,60,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "area#k1482";
	monster "this",248,68,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	announce "[兵舎2F 兵舎2F通路] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r149	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",12,12,41,37,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎2F 大部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎2F 大部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎2F 大部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎2F 大部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r149"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r149"; //496
	hideoffnpc "守護天使の亡骸#r149"; //496
	announce "[兵舎2F 大部屋] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[兵舎2F 大部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "バルビエル#r149::OnStart";
	end;
}
1_tiamat_31.gat,0,0,0	script	tiamat_mob#r150	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",78,274,99,287,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎2F 隊長室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎2F 隊長室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎2F 隊長室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎2F 隊長室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[兵舎2F 隊長室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_30.gat,0,0,0	script	tiamat_mob#r151	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[14][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[14][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",36,33,122,65,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[兵舎2F 武器庫] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[兵舎2F 武器庫] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[兵舎2F 武器庫] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[兵舎2F 武器庫] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2037_1"; //1868
			hideoffnpc "四騎士ハウンド#2038_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,38;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[兵舎2F 武器庫] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_34.gat,0,0,0	script	tiamat_mob#r152	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[14][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[14][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",232,175,250,221,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[使用人居住区 廊下] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[使用人居住区 廊下] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[使用人居住区 廊下] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[使用人居住区 廊下] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2040_1"; //1868
			hideonnpc "四騎士ハウンド#2040_2"; //1868
			hideoffnpc "四騎士ハウンド#2041_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,41;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	if(getvariableofnpc('flag,"レバー#106_1") == 0) {
		hideoffnpc "area#k1521";
		monster "this",238,169,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	else
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#k1525";
	monster "this",236,219,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	announce "[使用人居住区 廊下] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_34.gat,0,0,0	script	tiamat_mob#r153	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",200,194,210,217,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[使用人居住区 使用人部屋①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[使用人居住区 使用人部屋①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[使用人居住区 使用人部屋①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[使用人居住区 使用人部屋①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[使用人居住区 使用人部屋①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_34.gat,0,0,0	script	tiamat_mob#r154	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",200,172,212,190,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[使用人居住区 使用人部屋②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[使用人居住区 使用人部屋②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[使用人居住区 使用人部屋②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[使用人居住区 使用人部屋②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[使用人居住区 使用人部屋②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_34.gat,0,0,0	script	tiamat_mob#r155	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",214,138,245,150,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[使用人居住区 使用人部屋③] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[使用人居住区 使用人部屋③] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[使用人居住区 使用人部屋③] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[使用人居住区 使用人部屋③] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[使用人居住区 使用人部屋③] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_51.gat,0,0,0	script	tiamat_mob#r156	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[14][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[14][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",338,115,384,127,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[使用人居住区 召使い部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[使用人居住区 召使い部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[使用人居住区 召使い部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[使用人居住区 召使い部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r156"; //1155
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 831, "守護天使の亡骸#r156"; //1155
	hideoffnpc "守護天使の亡骸#r156"; //1155
	announce "[使用人居住区 召使い部屋] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideonnpc "四騎士ハウンド#2041_1"; //1868
			hideoffnpc "四騎士ハウンド#2042_1"; //1868
			donpcevent "#tiamat_start::OnHound";
			set $@tiamat_hound,42;
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[使用人居住区 召使い部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "アドナキエル#r156::OnStart";
	end;
}
1_tiamat_32.gat,0,0,0	script	tiamat_mob#r157	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[14][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[14][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",18,168,45,183,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer3000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[使用人居住区 炊事場] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[使用人居住区 炊事場] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[使用人居住区 炊事場] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[使用人居住区 炊事場] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer5000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			hideoffnpc "四騎士ハウンド#208_1"; //1804
		}
	}
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#109_1") == 0) {
		hideoffnpc "area#k1571";
		monster "this",27,189,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		hideoffnpc "area#k1573";
		monster "this",45,168,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	else {
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
	}
	if($@tiamat_angel & (1<<1)) {	//マヤー倒されてる
		if(getmapmobs("1_tiamat_47.gat","tiamat_mob#r5::OnKilled") > 0) {	//中庭北
			donpcevent "四騎士ハウンド#208_1::OnStart";
		}
	}
	announce "[使用人居住区 炊事場] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_44.gat,0,0,0	script	tiamat_mob#r158	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",82,80,115,123,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会1F 礼拝堂] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会1F 礼拝堂] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会1F 礼拝堂] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会1F 礼拝堂] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_milka == 4) {
		hideonnpc "四騎士ミルカ#1004_1"; //1813
		hideoffnpc "四騎士ミルカ#1005_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,5;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#001_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	}
	else {
		hideoffnpc "area#k1584";
		monster "this",82,121,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "5";
	announce "[教会1F 礼拝堂] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_44.gat,0,0,0	script	tiamat_mob#r159	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[15][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[15][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",20,164,35,179,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会1F 懺悔室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会1F 懺悔室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会1F 懺悔室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会1F 懺悔室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[教会1F 懺悔室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_51.gat,0,0,0	script	tiamat_mob#r160	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[15][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[15][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",186,244,203,258,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会1F 教会倉庫] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会1F 教会倉庫] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会1F 教会倉庫] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会1F 教会倉庫] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[教会1F 教会倉庫] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r161	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",30,102,47,127,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会1F 会議室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会1F 会議室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会1F 会議室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会1F 会議室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	if($@tiamat_milka == 6) {
		hideonnpc "四騎士ミルカ#1006_1"; //1813
		hideoffnpc "四騎士ミルカ#1007_1"; //1813
		hideoffnpc "四騎士ミルカ#1007_2"; //1813
		hideoffnpc "四騎士ミルカ#1007_3"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,7;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[教会1F 会議室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r162	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",51,65,63,125,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会1F 教会1F通路01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会1F 教会1F通路01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会1F 教会1F通路01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会1F 教会1F通路01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	if($@tiamat_milka == 5) {
		hideonnpc "四騎士ミルカ#1005_1"; //1813
		hideoffnpc "四騎士ミルカ#1006_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,6;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#005_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	}
	else {
		hideoffnpc "area#k1622";
		monster "this",30,50,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	if(getvariableofnpc('flag,"レバー#205_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	}
	else {
		hideoffnpc "area#k1624";
		monster "this",59,131,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	announce "[教会1F 教会1F通路01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r163	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[4][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[4][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",202,72,213,87,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会1F 教会1F通路02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会1F 教会1F通路02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会1F 教会1F通路02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会1F 教会1F通路02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka == 7) {
		hideonnpc "四騎士ミルカ#1007_1"; //1813
		hideonnpc "四騎士ミルカ#1007_2"; //1813
		hideonnpc "四騎士ミルカ#1007_3"; //1813
		hideoffnpc "四騎士ミルカ#1008_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,8;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[教会1F 教会1F通路02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r164	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[13][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[13][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",250,108,267,127,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会2F 会議室①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会2F 会議室①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会2F 会議室①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会2F 会議室①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	if($@tiamat_milka == 9) {
		hideonnpc "四騎士ミルカ#1009_1"; //1813
		hideoffnpc "四騎士ミルカ#1010_1"; //1813
		hideoffnpc "四騎士ミルカ#1010_2"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,10;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[教会2F 会議室①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r165	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",296,62,309,89,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会2F 会議室②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会2F 会議室②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会2F 会議室②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会2F 会議室②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	if($@tiamat_milka == 11) {
		hideonnpc "四騎士ミルカ#1011_1"; //1813
		hideoffnpc "四騎士ミルカ#1012_1"; //1813
		hideoffnpc "四騎士ミルカ#1012_2"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,12;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[教会2F 会議室②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r166	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[8][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[8][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",224,146,247,165,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会2F 大会議室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会2F 大会議室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会2F 大会議室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会2F 大会議室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r166"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r166"; //496
	hideoffnpc "守護天使の亡骸#r166"; //496
	announce "[教会2F大会議室] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	if($@tiamat_milka == 13) {
		hideonnpc "四騎士ミルカ#1013_1"; //1813
		hideonnpc "四騎士ミルカ#1013_2"; //1813
		hideonnpc "四騎士ミルカ#1013_3"; //1813
		hideoffnpc "四騎士ミルカ#1014_1"; //1813
		hideoffnpc "四騎士ミルカ#1014_2"; //1813
		hideoffnpc "四騎士ミルカ#1014_3"; //1813
		hideoffnpc "四騎士ミルカ#1014_4"; //1813
		hideoffnpc "四騎士ミルカ#1014_5"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,14;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[教会2F 大会議室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "アムブリエル#r166::OnStart";
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r167	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[19][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[19][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",292,102,309,123,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会2F 執務室] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会2F 執務室] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会2F 執務室] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会2F 執務室] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	if($@tiamat_milka == 12) {
		hideonnpc "四騎士ミルカ#1012_1"; //1813
		hideonnpc "四騎士ミルカ#1012_2"; //1813
		hideoffnpc "四騎士ミルカ#1013_1"; //1813
		hideoffnpc "四騎士ミルカ#1013_2"; //1813
		hideoffnpc "四騎士ミルカ#1013_3"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,13;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[教会2F 執務室] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r168	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",224,133,295,142,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会2F 教会2F通路01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会2F 教会2F通路01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会2F 教会2F通路01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会2F 教会2F通路01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	if($@tiamat_milka == 8) {
		hideonnpc "四騎士ミルカ#1008_1"; //1813
		hideoffnpc "四騎士ミルカ#1009_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,9;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"レバー#004_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	}
	else {
		hideoffnpc "area#k1684";
		monster "this",230,141,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[教会2F 教会2F通路01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_54.gat,0,0,0	script	tiamat_mob#r169	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[16][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[16][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",274,46,287,120,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[教会2F 教会2F通路02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[教会2F 教会2F通路02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[教会2F 教会2F通路02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[教会2F 教会2F通路02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_milka == 10) {
		hideonnpc "四騎士ミルカ#1010_1"; //1813
		hideonnpc "四騎士ミルカ#1010_2"; //1813
		hideoffnpc "四騎士ミルカ#1011_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,11;
		end;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#003_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	}
	else {
		hideoffnpc "area#k1692";
		monster "this",286,120,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	if(getvariableofnpc('flag,"レバー#002_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
	}
	else {
		hideoffnpc "area#k1693";
		monster "this",290,69,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[教会2F 教会2F通路02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}
1_tiamat_39.gat,0,0,0	script	tiamat_mob#r170	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[1][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[1][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",8,172,31,189,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[鐘楼 B1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[鐘楼 B1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[鐘楼 B1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[鐘楼 B1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[鐘楼 B1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r171	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",348,348,378,392,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[鐘楼 1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[鐘楼 1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[鐘楼 1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[鐘楼 1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[鐘楼 1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r172	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",348,264,378,308,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[鐘楼 2F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[鐘楼 2F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[鐘楼 2F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[鐘楼 2F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[鐘楼 2F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_08.gat,0,0,0	script	tiamat_mob#r173	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",348,176,378,220,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[鐘楼 3F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[鐘楼 3F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[鐘楼 3F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[鐘楼 3F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[鐘楼 3F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_10.gat,0,0,0	script	tiamat_mob#r174	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[2][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[2][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",66,68,101,103,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[鐘楼 屋上] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[鐘楼 屋上] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[鐘楼 屋上] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[鐘楼 屋上] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r166"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r174"; //496
	hideoffnpc "守護天使の亡骸#r174"; //496
	announce "[鐘楼 屋上] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[鐘楼 屋上] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "アイニ#r174::OnStart";
	end;
}
1_tiamat_59.gat,0,0,0	script	tiamat_mob#r175	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	areamonster "this",14,88,50,95,"魔女のしもべ",20024,10,strnpcinfo(0)+ "::OnKilled";
	set 'maxmob,10;
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[鐘楼 教会B1F通路] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[鐘楼 教会B1F通路] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[鐘楼 教会B1F通路] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[鐘楼 教会B1F通路] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[鐘楼 教会B1F通路] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_53.gat,0,0,0	script	tiamat_mob#r176	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",228,164,291,275,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 神殿大広間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 神殿大広間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 神殿大広間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 神殿大広間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r176"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 831, "守護天使の亡骸#r176"; //496
	hideoffnpc "守護天使の亡骸#r176"; //496
	announce "[神殿1F 神殿大広間] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"神官の彫像#r177") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	}
	else {
		hideoffnpc "area#k1762";
		monster "this",231,291,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	if(getvariableofnpc('flag,"神官の彫像#r177") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
	}
	else {
		hideoffnpc "area#k1764";
		monster "this",288,291,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	announce "[神殿1F 神殿大広間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
OnKilled3:
	donpcevent "ムリエル#r176::OnStart";
	end;
}
1_tiamat_52.gat,0,0,0	script	tiamat_mob#r177	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",38,112,105,174,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 祭殿] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 祭殿] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 祭殿] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 祭殿] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ローウェン#3030_1"; //1807
	hideoffnpc "四騎士ローウェン#303_1"; //1811
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[神殿1F 祭殿] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	donpcevent "四騎士ローウェン#303_1::OnStart";
	end;
OnKilled:
	end;
}
1_tiamat_53.gat,0,0,0	script	tiamat_mob#r178	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",166,162,201,197,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 騎士の間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 騎士の間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 騎士の間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 騎士の間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r178"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r178"; //496
	hideoffnpc "守護天使の亡骸#r178"; //496
	announce "[神殿1F 騎士の間] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[神殿1F 騎士の間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "ズリエル#r178::OnStart";
	end;
}
1_tiamat_53.gat,0,0,0	script	tiamat_mob#r179	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",12,217,69,251,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 王妃の間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 王妃の間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 王妃の間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 王妃の間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r179"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r179"; //496
	hideoffnpc "守護天使の亡骸#r179"; //496
	announce "[神殿1F 王妃の間] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[神殿1F 王妃の間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
OnKilled2:
	donpcevent "サタン#r179::OnStart";
	end;
}
1_tiamat_52.gat,0,0,0	script	tiamat_mob#r180	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",104,206,178,270,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 控えの間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 控えの間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 控えの間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 控えの間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	if($@tiamat_milka >= 32) {
		hideonnpc "四騎士ミルカ#1032_1"; //1811
		hideonnpc "四騎士ミルカ#1032_2"; //1811
		hideonnpc "四騎士ミルカ#1032_3"; //1811
		hideonnpc "四騎士ミルカ#1032_4"; //1811
		hideonnpc "四騎士ミルカ#1032_5"; //1811
		hideoffnpc "四騎士ミルカ#1033_1";
		set $@tiamat_milka,33;
	}
	if($@tiamat_hound >= 42) {
		hideoffnpc "四騎士ハウンド#2050_1"; //1868
		set $@tiamat_hound,50;
	}
	if($@tiamat_lowen >= 31) {
		hideonnpc "四騎士ローウェン#3031_1"; //1811
		hideonnpc "四騎士ローウェン#3031_2"; //1812
		hideoffnpc "四騎士ローウェン#3032_1";
		set $@tiamat_lowen,32;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[神殿1F 控えの間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_04.gat,0,0,0	script	tiamat_mob#r181	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",128,178,155,202,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 王の墓] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 王の墓] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 王の墓] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 王の墓] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r181"; //496
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 831, "守護天使の亡骸#r181"; //496
	hideoffnpc "守護天使の亡骸#r181"; //496
	announce "[神殿1F 王の墓] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "王女メア#1_tiamat_04";
	if($@tiamat_milka >= 32) {
		hideonnpc "四騎士ミルカ#1035_1";
		hideoffnpc "四騎士ミルカ#1036_1";
		set $@tiamat_milka,36;
	}
	if($@tiamat_hound >= 42) {
		hideonnpc "四騎士ハウンド#2050_1"; //1868
		hideoffnpc "四騎士ハウンド#2051_1"; //1868
		set $@tiamat_hound,51;
	}
	if($@tiamat_lowen >= 31) {	//控えの間
		hideonnpc "四騎士ローウェン#3032_1";
		hideoffnpc "四騎士ローウェン#3033_1";
		set $@tiamat_lowen,33;
	}
	end;
OnTimer6000:
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#k1812";
	monster "this",142,205,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	announce "[神殿1F 王の墓] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer8000:
	stopnpctimer;
	monster "this",142,205,"王家の封印",20501,1,strnpcinfo(0)+ "::OnKilled4";
	announce "[神殿1F 王の墓] の王家の封印が姿を現しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	donpcevent "王女メア#1_tiamat_04::OnStart";
	end;
OnKilled:
OnKilled2:
	end;
OnKilled3:
	donpcevent "サルガタナス#r181::OnStart";
	end;
OnKilled4:
	stopnpctimer "王女メア#1_tiamat_04";
	misceffect 83, "area#r1812"; //145
	sleep 2000;
	misceffect 90, "area#r1812"; //145
	hideonnpc "area#k1812"; //154
	hideonnpc "王女メア#1_tiamat_04"; //159
	hideoffnpc "area#r1812"; //145
	killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled2";
	announce "「神殿1F 王の墓」⇔「教会1F通路01」の結界が解けました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	sleep 3000;
	announce "残り時間は後僅かです。魔女のもとに向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
}
1_tiamat_04.gat,0,0,0	script	tiamat_mob#r182	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",66,29,73,52,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 神殿通路1F01] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 神殿通路1F01] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 神殿通路1F01] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 神殿通路1F01] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_lowen == 29) {
		hideonnpc "四騎士ローウェン#3029_1"; //1807
		hideoffnpc "四騎士ローウェン#3030_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,30;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[神殿1F 神殿通路1F01] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_04.gat,0,0,0	script	tiamat_mob#r183	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",10,40,17,59,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿1F 神殿通路1F02] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿1F 神殿通路1F02] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿1F 神殿通路1F02] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿1F 神殿通路1F02] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#205_1") == 1) {
		hideoffnpc "area#" +strnpcinfo(2)+ "1";
	}
	else {
		hideoffnpc "area#k1831";
		monster "this",14,36,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[神殿1F 神殿通路1F02] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_04.gat,0,0,0	script	tiamat_mob#r184	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[0][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[0][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",170,105,197,135,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿B1F 王の墓B1F] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿B1F 王の墓B1F] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿B1F 王の墓B1F] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿B1F 王の墓B1F] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	hideonnpc "四騎士ミルカ#1036_1";
	hideoffnpc "四騎士ミルカ#1037_1";
	set $@tiamat_milka,37;
	hideonnpc "四騎士ハウンド#2051_1"; //1868
	hideoffnpc "四騎士ハウンド#2052_1"; //1868
	set $@tiamat_hound,52;
	hideonnpc "四騎士ローウェン#3033_1";
	hideoffnpc "四騎士ローウェン#3034_1";
	set $@tiamat_lowen,34;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[神殿B1F 王の墓B1F] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_07.gat,0,0,0	script	tiamat_mob#r185	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	areamonster "this",6,105,24,134,"魔女のしもべ",3585,20,strnpcinfo(0)+ "::OnKilled";
	set 'maxmob,20;
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿B1F 地下宝物庫] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿B1F 地下宝物庫] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿B1F 地下宝物庫] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿B1F 地下宝物庫] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r185"; //2011
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r185"; //2011
	hideoffnpc "守護天使の亡骸#r185"; //2011
	announce "[神殿B1F 地下宝物庫] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	monster "this",15,128,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[神殿B1F 地下宝物庫] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
OnKilled3:
	donpcevent "ルシフェル#r185::OnStart";
	end;
}
1_tiamat_35.gat,0,0,0	script	tiamat_mob#r187	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[23][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[23][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",84,158,103,179,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[神殿B1F 神殿B1通路] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[神殿B1F 神殿B1通路] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[神殿B1F 神殿B1通路] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[神殿B1F 神殿B1通路] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	hideonnpc "四騎士ミルカ#1037_1";
	hideoffnpc "四騎士ミルカ#1038_1";
	set $@tiamat_milka,38;
	hideonnpc "四騎士ハウンド#2052_1"; //1868
	hideoffnpc "四騎士ハウンド#2053_1"; //1868
	set $@tiamat_hound,53;
	hideonnpc "四騎士ローウェン#3034_1";
	hideoffnpc "四騎士ローウェン#3035_1";
	set $@tiamat_lowen,35;
	end;
OnTimer6000:
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	//hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#k1872";
	monster "this",107,164,"#EF_003",3869,1,strnpcinfo(0)+ "::OnKilled2";
	hideoffnpc "area#k1873";
	monster "this",94,183,"#EF_004",3869,1,strnpcinfo(0)+ "::OnKilled3";
	announce "[神殿B1F 神殿B1通路] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	hideoffnpc "王女メア#1_tiamat_35";
	end;
OnTimer8000:
	announce "王女メア : この先から魔女の気配を感じます。魔女の本体が潜んでいるのでしょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "area#k1873"; //799
	end;
OnTimer12000:
	misceffect 234, "area#k1873"; //799
	end;
OnTimer14000:
	donpcevent "tiamat_mob#b2_01::OnStart";
	misceffect 406, "area#k1873"; //799
	hideonnpc "area#k1873"; //799
	hideoffnpc "area#r1873"; //795
	announce "「王女メア」が封印を解き、[神殿B1F 神殿B1通路] ⇔ [地下祭儀場] の扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer17000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled3";
	set $@tiamat_main,2;
	hideonnpc "王城入口#0A";
	hideoffnpc "王城入口#0B";
	announce "王女メア : ついに決戦です。さあ、参りましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer18000:
	stopnpctimer;
	hideonnpc "王女メア#1_tiamat_35"; //800
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_39.gat,0,0,0	script	tiamat_mob#r190	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",6,40,23,59,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ カタコンベ部屋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ カタコンベ部屋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ カタコンベ部屋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ カタコンベ部屋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "3";
	announce "[カタコンベ カタコンベ部屋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_39.gat,0,0,0	script	tiamat_mob#r191	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",22,100,39,132,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ カタコンベ宿泊施設] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ カタコンベ宿泊施設] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ カタコンベ宿泊施設] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ カタコンベ宿泊施設] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	announce "[カタコンベ カタコンベ宿泊施設] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_39.gat,0,0,0	script	tiamat_mob#r192	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",72,154,89,183,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ カタコンベ倉庫] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ カタコンベ倉庫] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ カタコンベ倉庫] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ カタコンベ倉庫] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[カタコンベ カタコンベ倉庫] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_36.gat,0,0,0	script	tiamat_mob#r193	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",76,34,121,82,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ カタコンベ祭壇] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ カタコンベ祭壇] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ カタコンベ祭壇] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ カタコンベ祭壇] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
			misceffect 222, "守護天使の亡骸#r193"; //2011
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 831, "守護天使の亡骸#r193"; //2011
	hideoffnpc "守護天使の亡骸#r193"; //2011
	announce "[カタコンベ祭壇] に封印された守護天使の亡骸が出現しました", 0x9, 0xee82ee, 0x190, 30, 0, 0;
	if(getvariableofnpc('flag,"封印の祠#r194") < 5 || getvariableofnpc('flag,"封印の祠#r195") < 5 || getvariableofnpc('flag,"封印の祠#r196") < 5)
		monster "this",99,70,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[カタコンベ カタコンベ祭壇] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
OnKilled3:
	donpcevent "マルキダエル#r193::OnStart";
	end;
}
1_tiamat_23.gat,0,0,0	script	tiamat_mob#r194	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",150,151,167,165,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ 墓①] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ 墓①] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ 墓①] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ 墓①] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[カタコンベ 墓①] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_23.gat,0,0,0	script	tiamat_mob#r195	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",150,128,167,146,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ 墓②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ 墓②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ 墓②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ 墓②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[カタコンベ 墓②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_23.gat,0,0,0	script	tiamat_mob#r196	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",129,129,145,145,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ 墓③] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ 墓③] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ 墓③] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ 墓③] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[カタコンベ 墓③] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_23.gat,0,0,0	script	tiamat_mob#r197	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",129,151,145,166,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ 墓④] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ 墓④] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ 墓④] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ 墓④] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[カタコンベ 墓④] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_23.gat,0,0,0	script	tiamat_mob#r198	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[4][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[4][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",104,109,192,125,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		areamonster "this",104,173,192,187,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		areamonster "this",94,109,124,187,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1]*3;
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ カタコンベ通路] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ カタコンベ通路] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ カタコンベ通路] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ カタコンベ通路] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	misceffect 222, "area#" +strnpcinfo(2)+ "5";
	misceffect 222, "area#" +strnpcinfo(2)+ "6";
	misceffect 222, "area#" +strnpcinfo(2)+ "7";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	misceffect 488, "area#" +strnpcinfo(2)+ "5";
	misceffect 488, "area#" +strnpcinfo(2)+ "6";
	misceffect 488, "area#" +strnpcinfo(2)+ "7";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	misceffect 321, "area#" +strnpcinfo(2)+ "5";
	misceffect 321, "area#" +strnpcinfo(2)+ "6";
	misceffect 321, "area#" +strnpcinfo(2)+ "7";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "2";
	if(getvariableofnpc('flag,"レバー#005_1") == 1) {	// カタコンベ倉庫レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
		hideoffnpc "area#" +strnpcinfo(2)+ "4";
		hideoffnpc "area#" +strnpcinfo(2)+ "5";
		hideoffnpc "area#" +strnpcinfo(2)+ "6";
	}
	else {
		hideoffnpc "area#k1983";
		hideoffnpc "area#k1984";
		hideoffnpc "area#k1985";
		hideoffnpc "area#k1986";
		monster "this",170,159,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",155,123,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",124,133,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",136,172,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "7";
	announce "[カタコンベ カタコンベ通路] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_26.gat,0,0,0	script	tiamat_mob#r199	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[4][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[4][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",168,174,183,177,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	monster "this",235,175,"#EF_007",3869,1,strnpcinfo(0)+ "::OnKilled2";
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ 浮き橋] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ 浮き橋] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ 浮き橋] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ 浮き橋] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#k1992";
	announce "[カタコンベ 浮き橋] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_11.gat,0,0,0	script	tiamat_mob#r200	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[1][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[1][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",217,60,221,74,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[カタコンベ 祈りの間] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[カタコンベ 祈りの間] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[カタコンベ 祈りの間] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[カタコンベ 祈りの間] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	announce "[カタコンベ 祈りの間] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
	end;
}
1_tiamat_58.gat,0,0,0	script	tiamat_mob#r201	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",50,16,61,60,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F バルコニー②] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F バルコニー②] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F バルコニー②] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F バルコニー②] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	misceffect 222, "area#" +strnpcinfo(2)+ "4";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	misceffect 488, "area#" +strnpcinfo(2)+ "4";
	if($@tiamat_milka == 23) {
		hideonnpc "四騎士ミルカ#1023_1"; //1813
		hideoffnpc "四騎士ミルカ#1024_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,24;
	}
	if($@tiamat_lowen == 23) {
		hideonnpc "四騎士ローウェン#3023_1"; //1807
		hideoffnpc "四騎士ローウェン#3024_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,24;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	misceffect 321, "area#" +strnpcinfo(2)+ "4";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if(getvariableofnpc('flag,"レバー#203_1") == 1) {	// ヴンダーカンマー レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
	}
	else {
		hideoffnpc "area#k2012";
		hideoffnpc "area#k2013";
		monster "this",61,60,"#EF_007",3869,1,strnpcinfo(0)+ "::OnKilled2";
		monster "this",61,27,"#EF_007",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	hideoffnpc "area#" +strnpcinfo(2)+ "4";
	announce "[城2F バルコニー②] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
	end;
}
1_tiamat_58.gat,0,0,0	script	tiamat_mob#r202	139,{
OnStart:
	initnpctimer;
	set 'maxmob,0;
	set 'flag,4;
	set '@max,getarraysize(getvariableofnpc('mob[5][0],"tiamat_mob#all"));
	copyarray '@mob,getvariableofnpc('mob[5][0],"tiamat_mob#all"),'@max;
	for(set '@i,0; '@i < '@max/2; set '@i,'@i+1) {
		areamonster "this",14,12,41,19,"魔女のしもべ",'@mob['@i*2],'@mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
		set 'maxmob,'maxmob + '@mob['@i*2+1];
	}
	end;
OnTimer2000:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('flag) {
		if('flag == 4 && '@count < 'maxmob/2) {
			set 'flag,3;
			announce "[城2F バルコニー③] 残りモンスター約50%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 3 && '@count < 'maxmob/3) {
			set 'flag,2;
			announce "[城2F バルコニー③] 残りモンスター約30%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('flag == 2 && '@count < 'maxmob/5) {
			set 'flag,1;
			announce "[城2F バルコニー③] 残りモンスター約10%", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		}
		else if('@count <= 0) {
			set 'flag,0;
			announce "[城2F バルコニー③] の全てのモンスターが倒されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
		}
		initnpctimer;
		end;
	}
	misceffect 222, "area#" +strnpcinfo(2)+ "1";
	misceffect 222, "area#" +strnpcinfo(2)+ "2";
	misceffect 222, "area#" +strnpcinfo(2)+ "3";
	end;
OnTimer4000:
	misceffect 488, "area#" +strnpcinfo(2)+ "1";
	misceffect 488, "area#" +strnpcinfo(2)+ "2";
	misceffect 488, "area#" +strnpcinfo(2)+ "3";
	if($@tiamat_milka == 24) {
		hideonnpc "四騎士ミルカ#1024_1"; //1813
		hideoffnpc "四騎士ミルカ#1025_1"; //1813
		donpcevent "#tiamat_start::OnMilka";
		set $@tiamat_milka,25;
	}
	if($@tiamat_lowen == 24) {
		hideonnpc "四騎士ローウェン#3024_1"; //1807
		hideoffnpc "四騎士ローウェン#3025_1"; //1807
		donpcevent "#tiamat_start::OnLowen";
		set $@tiamat_lowen,25;
	}
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 321, "area#" +strnpcinfo(2)+ "1";
	misceffect 321, "area#" +strnpcinfo(2)+ "2";
	misceffect 321, "area#" +strnpcinfo(2)+ "3";
	hideoffnpc "area#" +strnpcinfo(2)+ "1";
	if($@tiamat_angel & (1<<9)) {	// 運命の輪の化身 討滅?
		hideoffnpc "area#" +strnpcinfo(2)+ "2";
	}
	else {
		hideoffnpc "area#k2022";
		monster "this",46,12,"#EF_007",3869,1,strnpcinfo(0)+ "::OnKilled2";
	}
	if(getvariableofnpc('flag,"レバー#204_1")+getvariableofnpc('flag,"レバー#007_1") == 2) {	// 待機室2F、城門②2F レバー
		hideoffnpc "area#" +strnpcinfo(2)+ "3";
	}
	else {
		hideoffnpc "area#k2023";
		monster "this",15,15,"#EF_007",3869,1,strnpcinfo(0)+ "::OnKilled3";
	}
	announce "[城2F バルコニー③] の結界が解け、鍵のない全ての扉が開かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnKilled:
OnKilled2:
OnKilled3:
	end;
}

2_tiamat_01.gat,0,0,0	script	tiamat_mob#b2_01	139,{
OnStart:
	initnpctimer;
	hideonnpc "地下祭儀場#186A";

	monster "2_tiamat_01.gat",181,34,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",181,38,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",181,42,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",181,46,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",181,50,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",181,54,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",181,58,"",3982,1,"tiamat_mob#b2_01::OnKilled";

	monster "2_tiamat_01.gat",211,34,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",211,38,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",211,42,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",211,46,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",211,50,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",211,54,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",211,58,"",3982,1,"tiamat_mob#b2_01::OnKilled";

	monster "2_tiamat_01.gat",181,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",186,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",190,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",194,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",198,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",202,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",206,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",211,30,"",3982,1,"tiamat_mob#b2_01::OnKilled";

	monster "2_tiamat_01.gat",186,60,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",190,60,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",194,60,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",198,60,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",202,60,"",3982,1,"tiamat_mob#b2_01::OnKilled";
	monster "2_tiamat_01.gat",206,60,"",3982,1,"tiamat_mob#b2_01::OnKilled";

	areasetcell "2_tiamat_01.gat",180,29,212,61,1;
	areasetcell "2_tiamat_01.gat",183,32,209,58,0;
	end;
OnTimer60000:
	announce "魔女ジラント : ふふふ……約束の時間には、遅刻せずに済んだようだな。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer66000:
	announce "魔女ジラント : ようやく晩餐の用意は整った。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer72000:
	announce "魔女ジラント : メインディッシュは……お前たちだ。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer78000:
	announce "魔女ジラント : グローザを倒した強者の魂……さぞかし甘美な味がするであろうな。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer84000:
	announce "魔女ジラント : 蠱毒の術は知っているか？　その魂を喰らい、我が力の源とするため……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer90000:
	announce "魔女ジラント : わざわざグローザとお前たちを戦わせたのだから。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer96000:
	announce "魔女ジラント : 王女よ……お前にも感謝しているぞ。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer102000:
	announce "魔女ジラント : 我が元に極上の贄を運んで来てくれたのだからな。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer108000:
	announce "王女メア : そんな……私たちがここに来ることも魔女の計画のうちだと……！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer114000:
	announce "魔女ジラント : そういうことだ。　では……いただくとしよう。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer120000:
	stopnpctimer;
	misceffect 911, "魔女ジラント#b2_01"; //1462
	areasetcell "2_tiamat_01.gat",180,29,212,61,0;
	killmonster "2_tiamat_01.gat","tiamat_mob#b2_01::OnKilled";
	hideonnpc "魔女ジラント#b2_01"; //1462
	hideonnpc "王女メア#b2_01"; //1463
	hideonnpc "四騎士ミルカ#b2_01"; //1439
	hideonnpc "四騎士ハウンド#b2_01"; //1440
	hideonnpc "四騎士ローウェン#b2_01"; //1441
	donpcevent "tiamat_mob#b2_02::OnSpawn";
	end;
OnKilled:
	end;
}
2_tiamat_01.gat,0,0,0	script	tiamat_mob#b2_02	139,{
OnSpawn:
	initnpctimer;
	set 'flag,0;
	set 'mob,callmonster("2_tiamat_01.gat",196,45,"魔女ジラント",20491,"tiamat_mob#b2_02::OnKilled");
	set 'mobmaxhp,getmobhp('mob);
	setarray '@xy,169,32,169,55,188,26,188,55,186,74,217,26,217,55,209,74;
	for(set '@i,0; '@i<8; set '@i,'@i+1)
		set 'hell['@i],callmonster("2_tiamat_01.gat",'@xy['@i*2],'@xy['@i*2+1],"#hell_00"+'@i,3855,"tiamat_mob#b2_01::OnKilled");
	end;
OnTimer3000:
	if('mob == 0) {
		stopnpctimer;
		end;
	}
	set '@hp,getmobhp('mob);
	if('flag < 9 && getmobhp('mob) < 90000000) {
		set 'flag,9;
	}
	else if('flag < 4 && '@hp < 130000000) {
		set 'flag,4;
	}
	switch('flag) {
	case 0:
		if(getmobhp('mob) < 'mobmaxhp) {
			set 'flag,1;
			announce "魔女ジラント : 王城を守護する天使達よ！　愚かな侵入者を排除せよ！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			donpcevent "tiamat_mob#b2_02::OnGimmick";
			sleep 3000;
			setarray '@angel,20457,20458,20459,20460,20461,20462,20463,20464,20465,20466,20467,20468,20469,20470,20471,20472,20473,20474,20475,20476,20477,20478;
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
			setarray '@dx, 0,-5, 5,-8, 0, 8,-3, 3,-10,10,-5, 5,-10,10,-3, 3,-8, 0, 8,-5, 5,  0;
			setarray '@dy,10, 8, 8, 5, 5, 5, 3, 3,  2, 2, 0, 0, -2,-2,-3,-3,-5,-5,-5, 8, 8,-10;
			for(set '@i,0; '@i<6; set '@i,'@i+1) {
				set '@r,rand(getarraysize('@angel));
				set '@angel_id['@i],callmonster("2_tiamat_01.gat",'@x+'@dx['@r],'@y+'@dy['@r],"--ja--",'@angel['@r],"tiamat_mob#b2_02::OnAngelKilled");
				if('@angel_id['@i] <= 0)
					set '@angel_id['@i],callmonster("2_tiamat_01.gat",'@x,'@y,"--ja--",'@angel['@r],"tiamat_mob#b2_02::OnAngelKilled");
				mobuseskill '@angel_id['@i],21,10,0,0,0,0;
				mobuseskill '@angel_id['@i],730,5,0,0,0,0;
				deletearray '@angel['@r],1;
				deletearray '@dx['@r],1;
				deletearray '@dy['@r],1;
			}
			sleep 1000;
			announce "ジラントが空に浮かべた6枚のカードからモンスター達があらわれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			sleep 4000;
			announce "天使達にジラントの魔力が注がれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			sleep 22000;
			for(set '@i,0; '@i<6; set '@i,'@i+1)
				set '@dummy,removemonster('@angel_id['@i]);
			announce "召喚された天使達が空に還った", 0x9, 0xffffff, 0x190, 20, 0, 0;
			initnpctimer;
			end;
		}
		break;
	case 1:
		if(getmobhp('mob) < 190000000) {
			set 'flag,2;
			announce "魔女ジラント : 出でよ！　我が同胞達よ！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			donpcevent "tiamat_mob#b2_02::OnGimmick";
			sleep 4000;
			announce "ジラントの呼び声に応じて空間の裂け目からモンスターが出現した", 0x9, 0xffffff, 0x190, 20, 0, 0;
			donpcevent "tiamat_mob#b2_03::OnStart";
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			initnpctimer;
			end;
		}
		break;
	case 2:
		if(getmobhp('mob) < 170000000) {
			set 'flag,3;
			donpcevent "tiamat_mob#b2_02::OnGimmick";
			sleep 1000;
			announce "魔女ジラント : 深淵の刃よ、敵を切り裂け！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			sleep 4000;
			for(set '@i,1; '@i<=8; set '@i,'@i+1)
				hideoffnpc "spe2_0" +'@i+ "#2_tiamat_01"; //1448
			for(set '@i,1; '@i<=8; set '@i,'@i+1)
				hideonnpc "spe2_0" +'@i+ "#2_tiamat_01"; //1448
			sleep 4000;
			announce "王女メア : ああ……猛毒にかかってしまったようです。　早く治療の魔法をかけなければ危険です！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
			sleep 1000;
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			initnpctimer;
			end;
		}
		break;
	case 3:
		if(getmobhp('mob) < 150000000) {
			set 'flag,4;
			announce "魔女ジラント : 少々部屋が冷えるな。　ふふ……我が魔力で暖めてやろう。", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			sleep 4000;
			sleep 4000;
			announce "ジラントの周囲に燃え盛る炎が吹き荒れ始めた", 0x9, 0xffffff, 0x0190, 20, 0, 0;
		}
		break;
	case 4:
		if(getmobhp('mob) < 130000000) {
			set 'flag,5;
			announce "魔女ジラント : 王城を守護する天使達よ！　不届きものに裁きの鉄槌を与えよ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			donpcevent "tiamat_mob#b2_02::OnGimmick";
			sleep 3000;
			setarray '@angel,20457,20458,20459,20460,20461,20462,20463,20464,20465,20466,20467,20468,20469,20470,20471,20472,20473,20474,20475,20476,20477,20478;
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
			setarray '@dx, 0,-5, 5,-8, 0, 8,-3, 3,-10,10,-5, 5,-10,10,-3, 3,-8, 0, 8,-5, 5,  0;
			setarray '@dy,10, 8, 8, 5, 5, 5, 3, 3,  2, 2, 0, 0, -2,-2,-3,-3,-5,-5,-5, 8, 8,-10;
			for(set '@i,0; '@i<12; set '@i,'@i+1) {
				set '@r,rand(getarraysize('@angel));
				set '@angel_id['@i],callmonster("2_tiamat_01.gat",'@x+'@dx['@r],'@y+'@dy['@r],"--ja--",'@angel['@r],"tiamat_mob#b2_02::OnAngelKilled");
				if('@angel_id['@i] <= 0)
					set '@angel_id['@i],callmonster("2_tiamat_01.gat",'@x,'@y,"--ja--",'@angel['@r],"tiamat_mob#b2_02::OnAngelKilled");
				mobuseskill '@angel_id['@i],21,10,0,0,0,0;
				mobuseskill '@angel_id['@i],730,5,0,0,0,0;
				deletearray '@angel['@r],1;
				deletearray '@dx['@r],1;
				deletearray '@dy['@r],1;
			}
			sleep 1000;
			announce "ジラントが空に浮かべた12枚のカードからモンスター達があらわれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			sleep 4000;
			announce "天使達にジラントの魔力が注がれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			sleep 22000;
			for(set '@i,0; '@i<12; set '@i,'@i+1)
				set '@dummy,removemonster('@angel_id['@i]);
			announce "召喚された天使達が空に還った", 0x9, 0xffffff, 0x190, 20, 0, 0;
			initnpctimer;
			end;
		}
		break;
	case 5:
	case 6:
	case 7:
	case 8:
		if('flag < 6 && '@hp < 120000000) {
			set 'flag,6;
			donpcevent "tiamat_mob#b2_03::OnStop";
		}
		if('flag < 7 && getmobhp('mob) < 110000000) {
			set 'flag,7;
			donpcevent "tiamat_mob#b2_03::OnStop";
			announce "魔女ジラント : ふぅん……　少し本気を出してやろう。", 0x9, 0xff0000, 0x190, 26, 0, 0;
 			sleep 4000;
			announce "ジラントの解放された魔力により、部屋中にマグマが吹き出した", 0x9, 0xffffff, 0x190, 20, 0, 0;
			donpcevent "tiamat_mob#b2_03::OnStart";
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			initnpctimer;
			end;
		}
		if('flag < 8 && getmobhp('mob) < 105000000) {
			set 'flag,8;
			donpcevent "tiamat_mob#b2_03::OnStop";
			announce "魔女ジラント : 闇に潜む者たちよ、全てを蝕め！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			for(set '@i,0; '@i<8; set '@i,'@i+1) {
				mobuseskill 'hell['@i],749,5,0,0,0,0;	//広範囲致命傷攻撃
			}
			sleep 3000;
			for(set '@i,0; '@i<8; set '@i,'@i+1) {
				mobuseskill 'hell['@i],679,8,0,0,0,0;	//ヴァンパイアリックタッチ
			}
			sleep 4000;
			announce "魔女ジラント : 奴らの生命力を吸い上げよ！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			initnpctimer;
			end;
		}
		if('flag < 9 && getmobhp('mob) < 100000000) {
			set 'flag,9;
			donpcevent "tiamat_mob#b2_03::OnStop";
			announce "魔女ジラント : もっと…もっとだ……！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			for(set '@i,0; '@i<8; set '@i,'@i+1) {
				mobuseskill 'hell['@i],749,5,0,0,0,0;	//広範囲致命傷攻撃
			}
			sleep 3000;
			for(set '@i,0; '@i<8; set '@i,'@i+1) {
				mobuseskill 'hell['@i],679,8,0,0,0,0;	//ヴァンパイアリックタッチ
			}
			sleep 4000;
			announce "魔女ジラント : 奴らの血肉を祭壇に捧げるのだ……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
			initnpctimer;
			end;
		}
		break;
	case 9:
		if(getmobhp('mob) < 90000000) {
			set 'flag,10;
			donpcevent "tiamat_mob#b2_03::OnStop";
			donpcevent "tiamat_mob#b2_02::OnGimmick";
			sleep 1000;
			announce "魔女ジラント : ほう……まだ立っているか。　なかなか楽しませてくれる。", 0x9, 0xff0000, 0x190, 26, 0, 0;
			sleep 3000;
			announce "魔女ジラント : これは褒美だ……我が不死の秘術、とくと見るが良い。", 0x9, 0xff0000, 0x190, 26, 0, 0;
			sleep 3000;
			announce "魔女ジラント : 王城に棲む忠実なる僕よ……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
			sleep 3000;
			announce "ジラントの呼び声に応じて、空間の裂け目から魔獣が出現した", 0x9, 0xffffff, 0x190, 20, 0, 0;
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
			set 'trust,rand(3);
			set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x+0,'@y+2,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
			if('blink_id[0]==0)
				set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x,'@y,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
			set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x-3,'@y-3,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
			if('blink_id[1]==0)
				set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x,'@y,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
			set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x+3,'@y-3,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
			if('blink_id[2]==0)
				set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x,'@y,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
			sleep 3000;
			announce "魔女ジラント : 贄となり、我が魂を守護せよ！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			sleep 3000;
			announce "ジラントの妖しい気配が魔獣達に移動した", 0x9, 0xffffff, 0x190, 20, 0, 0;
			mobuseskill 'mob,75,1,0,0,0,0;		//グロリア
			mobuseskill 'mob,685,1,0,0,0,0;					//無敵化
			sleep 3000;
			announce "王女メア : 魔女の体から生気を感じられません。　本体を探さねばならないようです。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
			sleep 1000;
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			sleep 6000;
			donpcevent "tiamat_mob#b2_05::OnStart";
			mobuseskill 'blink_id['trust],373,1,0,0,0,0;	//生命力変換
			mobuseskill 'blink_id['trust],75,1,0,0,0,0;		//グロリア
			mobuseskill 'mob,685,1,0,0,0,0;					//無敵化
			initnpctimer;
			end;
		}
		break;
	case 10:
		if(getmobhp('mob) < 60000000) {
			set 'flag,11;
			donpcevent "tiamat_mob#b2_02::OnGimmick";
			sleep 1000;
			announce "魔女ジラント : 全てを腐敗させる深淵の刃よ、敵を切り裂け！", 0x9, 0xff0000, 0x190, 26, 0, 0;
			sleep 4000;
			for(set '@i,1; '@i<=8; set '@i,'@i+1)
				hideoffnpc "spe5_0" +'@i+ "#2_tiamat_01"; //1448
			for(set '@i,1; '@i<=8; set '@i,'@i+1)
				hideonnpc "spe5_0" +'@i+ "#2_tiamat_01"; //1448
			sleep 4000;
			announce "王女メア : 先程よりも強力な猛毒です！　治療魔法に加えて状態異常の回復を！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
			sleep 1000;
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			initnpctimer;
			end;
		}
		break;
	case 11:
		if(getmobhp('mob) < 30000000) {
			set 'flag,12;
			announce "魔女ジラント : 王城を守護する全ての天使達よ！　一斉攻撃で敵を打ち滅ぼせ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			donpcevent "tiamat_mob#b2_02::OnGimmick";
			sleep 3000;
			setarray '@angel,20457,20458,20459,20460,20461,20462,20463,20464,20465,20466,20467,20468,20469,20470,20471,20472,20473,20474,20475,20476,20477,20478;
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
			setarray '@dx, 0,-5, 5,-8, 0, 8,-3, 3,-10,10,-5, 5,-10,10,-3, 3,-8, 0, 8,-5, 5,  0;
			setarray '@dy,10, 8, 8, 5, 5, 5, 3, 3,  2, 2, 0, 0, -2,-2,-3,-3,-5,-5,-5, 8, 8,-10;
			for(set '@i,0; '@i<22; set '@i,'@i+1) {
				set '@r,rand(getarraysize('@angel));
				set '@angel_id['@i],callmonster("2_tiamat_01.gat",'@x+'@dx['@r],'@y+'@dy['@r],"--ja--",'@angel['@r],"tiamat_mob#b2_02::OnAngelKilled");
				if('@angel_id['@i] <= 0)
					set '@angel_id['@i],callmonster("2_tiamat_01.gat",'@x,'@y,"--ja--",'@angel['@r],"tiamat_mob#b2_02::OnAngelKilled");
				mobuseskill '@angel_id['@i],21,10,0,0,0,0;
				mobuseskill '@angel_id['@i],730,5,0,0,0,0;
				deletearray '@angel['@r],1;
				deletearray '@dx['@r],1;
				deletearray '@dy['@r],1;
			}
			sleep 1000;
			announce "ジラントが空に浮かべた22枚のカードからモンスター達があらわれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			sleep 4000;
			announce "天使達にジラントの魔力が注がれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
			sleep 22000;
			for(set '@i,0; '@i<22; set '@i,'@i+1)
				set '@dummy,removemonster('@angel_id['@i]);
			announce "召喚された天使達が空に還った", 0x9, 0xffffff, 0x190, 20, 0, 0;
			initnpctimer;
			end;
		}
		break;
	case 12:
		break;
	}
	initnpctimer;
	end;
OnHell:
	for(set '@i,0; '@i<8; set '@i,'@i+1) {
		mobuseskill 'hell['@i],684,1,0,0,0,0;	//ワイドヘルパワー
	}
	end;
OnGimmick:
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
	monster "2_tiamat_01.gat",'@x-1,'@y-1,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	monster "2_tiamat_01.gat",'@x,'@y-1,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	monster "2_tiamat_01.gat",'@x+1,'@y-1,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	monster "2_tiamat_01.gat",'@x-1,'@y,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	monster "2_tiamat_01.gat",'@x+1,'@y,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	monster "2_tiamat_01.gat",'@x-1,'@y+1,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	monster "2_tiamat_01.gat",'@x,'@y+1,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	monster "2_tiamat_01.gat",'@x+1,'@y+1,"",3982,1,"tiamat_mob#b2_02::OnGimmickEnd";
	areasetcell "2_tiamat_01.gat",'@x-1,'@y-1,'@x+1,'@y+1,1;
	setcell "2_tiamat_01.gat",'@x,'@y,0;
	end;
OnGimmickEnd:
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
	areasetcell "2_tiamat_01.gat",'@x-1,'@y-1,'@x+1,'@y+1,0;
	killmonster "2_tiamat_01.gat","tiamat_mob#b2_02::OnGimmickEnd";
	end;
OnAngelKilled:
	end;
OnInvinsible:
	mobuseskill 'blink_id['trust],373,1,0,0,0,0;	//生命力変換
	mobuseskill 'blink_id['trust],75,1,0,0,0,0;		//グロリア
	mobuseskill 'mob,685,1,0,0,0,0;					//無敵化
	end;
OnBlinkKilled1:
	set 'blink_id[0],0;
	donpcevent "tiamat_mob#b2_05::OnKilled";
	if('trust==0) {
		announce "王女メア : 魔獣が倒れたことで、魔女の魂が本体に戻りました。　早く攻撃を！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		mobuseskill 'mob,686,1,0,0,0,0;					//無敵化解除
	}
	else {
		announce "魔女ジラント : 我が秘術を見破ろうとは愚かな……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
		sleep 1000;
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		sleep 3000;
		announce "周囲から吸い取った生命力によって魔獣が再召喚された", 0x9, 0xffffff, 0x190, 20, 0, 0;
		set 'trust,rand(3);
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled1") == 0) {
			set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x+0,'@y+2,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
			if('blink_id[0]==0)
				set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x,'@y,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
		}
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled2") == 0) {
			set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x-3,'@y-3,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
			if('blink_id[1]==0)
				set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x,'@y,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
		}
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled3") == 0) {
			set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x+3,'@y-3,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
			if('blink_id[2]==0)
				set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x,'@y,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
		}
		sleep 3000;
		announce "ジラントの妖しい気配が魔獣達に移動した", 0x9, 0xffffff, 0x190, 20, 0, 0;
	}
	end;
OnBlinkKilled2:
	set 'blink_id[1],0;
	donpcevent "tiamat_mob#b2_05::OnKilled";
	if('trust==1) {
		announce "王女メア : 魔獣が倒れたことで、魔女の魂が本体に戻りました。　早く攻撃を！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		mobuseskill 'mob,686,1,0,0,0,0;					//無敵化解除
	}
	else {
		announce "魔女ジラント : 我が秘術を見破ろうとは愚かな……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
		sleep 1000;
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		sleep 3000;
		announce "周囲から吸い取った生命力によって魔獣が再召喚された", 0x9, 0xffffff, 0x190, 20, 0, 0;
		set 'trust,rand(3);
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled1") == 0) {
			set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x+0,'@y+2,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
			if('blink_id[0]==0)
				set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x,'@y,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
		}
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled2") == 0) {
			set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x-3,'@y-3,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
			if('blink_id[1]==0)
				set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x,'@y,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
		}
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled3") == 0) {
			set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x+3,'@y-3,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
			if('blink_id[2]==0)
				set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x,'@y,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
		}
		sleep 3000;
		announce "ジラントの妖しい気配が魔獣達に移動した", 0x9, 0xffffff, 0x190, 20, 0, 0;
	}
	end;
OnBlinkKilled3:
	set 'blink_id[2],0;
	donpcevent "tiamat_mob#b2_05::OnKilled";
	if('trust==2) {
		announce "王女メア : 魔獣が倒れたことで、魔女の魂が本体に戻りました。　早く攻撃を！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		mobuseskill 'mob,686,1,0,0,0,0;					//無敵化解除
	}
	else {
		announce "魔女ジラント : 我が秘術を見破ろうとは愚かな……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
		sleep 1000;
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		mobuseskill 'mob,722,1,0,0,0,0;					//NPC_WIDESUCK
		sleep 3000;
		announce "周囲から吸い取った生命力によって魔獣が再召喚された", 0x9, 0xffffff, 0x190, 20, 0, 0;
		set 'trust,rand(3);
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled1") == 0) {
			set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x+0,'@y+2,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
			if('blink_id[0]==0)
				set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x,'@y,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
		}
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled2") == 0) {
			set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x-3,'@y-3,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
			if('blink_id[1]==0)
				set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x,'@y,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
		}
		if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled3") == 0) {
			set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x+3,'@y-3,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
			if('blink_id[2]==0)
				set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x,'@y,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
		}
		sleep 3000;
		announce "ジラントの妖しい気配が魔獣達に移動した", 0x9, 0xffffff, 0x190, 20, 0, 0;
	}
	end;
OnReSpawn:
	stopnpctimer;
	donpcevent "tiamat_mob#b2_02::OnGimmick";
	sleep 1000;
	announce "魔女ジラント : 魔獣達よ、我が魂を守護せよ！", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 3000;
	announce "空間の裂け目から魔獣が再召喚された", 0x9, 0xffffff, 0x190, 20, 0, 0;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
	if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled1") == 0) {
		set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x+0,'@y+2,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
		if('blink_id[0]==0)
			set 'blink_id[0],callmonster("2_tiamat_01.gat",'@x,'@y,"ブロールホース",20481,"tiamat_mob#b2_02::OnBlinkKilled1");
	}
	if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled2") == 0) {
		set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x-3,'@y-3,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
		if('blink_id[1]==0)
			set 'blink_id[1],callmonster("2_tiamat_01.gat",'@x,'@y,"シューターデーモン",20480,"tiamat_mob#b2_02::OnBlinkKilled2");
	}
	if(getmapmobs("this","tiamat_mob#b2_02::OnBlinkKilled3") == 0) {
		set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x+3,'@y-3,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
		if('blink_id[2]==0)
			set 'blink_id[2],callmonster("2_tiamat_01.gat",'@x,'@y,"マジックビースト",20479,"tiamat_mob#b2_02::OnBlinkKilled3");
	}
	set 'trust,rand(3);
	sleep 3000;
	announce "ジラントの妖しい気配が魔獣達に移動した", 0x9, 0xffffff, 0x190, 20, 0, 0;
	mobuseskill 'mob,75,1,0,0,0,0;		//グロリア
	mobuseskill 'mob,685,1,0,0,0,0;		//無敵化
	sleep 1000;
	donpcevent "tiamat_mob#b2_02::OnGimmickEnd";
	sleep 6000;
	donpcevent "tiamat_mob#b2_05::OnStart";
	mobuseskill 'blink_id['trust],373,1,0,0,0,0;	//生命力変換
	mobuseskill 'blink_id['trust],75,1,0,0,0,0;		//グロリア
	mobuseskill 'mob,685,1,0,0,0,0;					//無敵化
	initnpctimer;
	end;
OnKilled:
	set 'mob,0;
	stopnpctimer;
	stopnpctimer "tiamat_mob#b2_05";
	stopnpctimer "tiamat_mob#b2_06";
	sleep 1000;
	announce "魔女ジラント : ふぅん……さすがはグローザを倒した者。なかなか楽しませてくれる。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 6000;
	set $@tiamat_main,3;
	hideonnpc "王城入口#0B";
	hideoffnpc "王城入口#0C";
	misceffect 6, "魔女ジラント#b2_01"; //1462
	hideoffnpc "魔女ジラント#b2_01"; //1462
	hideoffnpc "王女メア#b2_01"; //1463
	hideoffnpc "四騎士ミルカ#b2_01"; //1439
	hideoffnpc "四騎士ハウンド#b2_01"; //1440
	hideoffnpc "四騎士ローウェン#b2_01"; //1441
	sleep 3000;
	announce "魔女ジラント : 此度の晩餐はここまでとしよう。その甘美な魂、一度に喰らうには惜しい。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 2000;
	unittalk getnpcid(0,"魔女ジラント#b2_01"),"魔女ジラント : ふぅん……今回はここまでだ。楽しみは取っておくとしよう。";
	sleep 4000;
	announce "魔女ジラント : 楽しみは取っておくとしよう。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 6000;
	misceffect 402, "魔女ジラント#b2_01"; //1462
	misceffect 419, "魔女ジラント#b2_01"; //1462
	announce "王女メア : 魔女の気配が消える……!?　これは……幻影……？", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	sleep 6000;
	announce "魔女ジラント : 我が直々に、お前たちの相手をするとでも思ったか？", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 6000;
	announce "魔女ジラント : お前たちは、我の手の上で踊っているに過ぎぬ。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 6000;
	announce "魔女ジラント : また来るが良い。その魂、じっくり喰らってやろう。ふふふふ……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 6000;
	hideonnpc "魔女ジラント#b2_01"; //1462
	hideonnpc "四騎士ミルカ#b2_01"; //1439
	hideonnpc "四騎士ハウンド#b2_01"; //1440
	hideonnpc "四騎士ローウェン#b2_01"; //1441
	sleep 1000;
	misceffect 222, "area#r1861"; //1436
	sleep 2000;
	misceffect 488, "area#r1861"; //1436
	sleep 1000;
	donpcevent "Angel#2_tiamat_00::OnStart";
	hideoffnpc "四騎士ミルカ#1039_1"; //1865
	hideoffnpc "四騎士ハウンド#2054_1"; //1929
	hideoffnpc "四騎士ローウェン#3036_1"; //1984
	misceffect 321, "area#r1861"; //1436
	hideoffnpc "area#r1861"; //1436
	announce "[神殿B1F 地下祭儀場] の結界が解け、[地下祭壇]へ続く道が現れました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	hideoffnpc "地下祭儀場#186A"; //1468
	end;
}
2_tiamat_01.gat,0,0,0	script	tiamat_mob#b2_03	139,{
OnStart:
	initnpctimer;
	set 'flag,0;
	end;
OnTimer1000:
	if('flag == 0) {
		initnpctimer;
		set '@count,getmapmobs("this","tiamat_mob#b2_03::OnFlameKilled");
		if('@count < 80)
			areamonster "2_tiamat_01.gat",180,30,210,60,"炎の化身",rand(20482,20484),1,"tiamat_mob#b2_03::OnFlameKilled";
	}
	end;
OnTimer4000:
	announce "魔女ジラント : ふん……小賢しい奴等め……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer8000:
	announce "ジラントの周囲に吹き荒れていた炎が鎮まった", 0x9, 0xffffff, 0x190, 20, 0, 0;
	end;
OnTimer20000:
	stopnpctimer;
	announce "周囲に漂うジラントの魔力が弱まり、炎を纏った魔物の出現が止まった", 0x9, 0xffffff, 0x190, 20, 0, 0;
	end;
OnStop:
	set 'flag,1;
	end;
OnFlameKilled:
	end;
}
2_tiamat_01.gat,0,0,0	script	tiamat_mob#b2_04	139,{
}
2_tiamat_01.gat,0,0,0	script	tiamat_mob#b2_05	139,{
OnStart:
	initnpctimer;
	end;
OnTimer10000:
	donpcevent "tiamat_mob#b2_02::OnInvinsible";
	end;
OnTimer15000:
	initnpctimer;
	donpcevent "tiamat_mob#b2_02::OnInvinsible";
	end;
OnKilled:
	setnpctimer 30000;
	end;
OnTimer60000:
	donpcevent "tiamat_mob#b2_02::OnReSpawn";
	end;
}
2_tiamat_01.gat,0,0,0	script	tiamat_mob#b2_06	139,{
OnStart:
OnTimer30000:
	initnpctimer;
	donpcevent "tiamat_mob#b2_02::OnHell";
	end;
}
2_tiamat_01.gat,169,32,0	script	spe2_01#2_tiamat_01	139,15,15,{/* 1446 (hide)*/
	misceffect 589,""; //self
	misceffect 677,""; //self
	percentheal -90,0;
	sc_start 630,180000,5;
	end;
}
2_tiamat_01.gat,169,55,0	duplicate(spe2_01#2_tiamat_01)	spe2_02#2_tiamat_01	139,15,15	///* 1447 (hide)*/
2_tiamat_01.gat,188,26,0	duplicate(spe2_01#2_tiamat_01)	spe2_03#2_tiamat_01	139,15,15	///* 1448 (hide)*/
2_tiamat_01.gat,188,55,0	duplicate(spe2_01#2_tiamat_01)	spe2_04#2_tiamat_01	139,15,15	///* 1449 (hide)*/
2_tiamat_01.gat,186,74,0	duplicate(spe2_01#2_tiamat_01)	spe2_05#2_tiamat_01	139,15,15	///* 1450 (hide)*/
2_tiamat_01.gat,217,26,0	duplicate(spe2_01#2_tiamat_01)	spe2_06#2_tiamat_01	139,15,15	///* 1451 (hide)*/
2_tiamat_01.gat,217,55,0	duplicate(spe2_01#2_tiamat_01)	spe2_07#2_tiamat_01	139,15,15	///* 1452 (hide)*/
2_tiamat_01.gat,209,74,0	duplicate(spe2_01#2_tiamat_01)	spe2_08#2_tiamat_01	139,15,15	///* 1453 (hide)*/
2_tiamat_01.gat,169,32,0	script	spe5_01#2_tiamat_01	139,15,15,{/* 1454 (hide)*/
	misceffect 589,""; //self
	misceffect 677,""; //self
	percentheal -90,0;
	sc_start 630,180000,5;
	sc_start SC_UndeadArmor,180000,1;
}
2_tiamat_01.gat,169,55,0	duplicate(spe5_01#2_tiamat_01)	spe5_02#2_tiamat_01	139,15,15	///* 1455 (hide)*/
2_tiamat_01.gat,188,26,0	duplicate(spe5_01#2_tiamat_01)	spe5_03#2_tiamat_01	139,15,15	///* 1456 (hide)*/
2_tiamat_01.gat,188,55,0	duplicate(spe5_01#2_tiamat_01)	spe5_04#2_tiamat_01	139,15,15	///* 1457 (hide)*/
2_tiamat_01.gat,186,74,0	duplicate(spe5_01#2_tiamat_01)	spe5_05#2_tiamat_01	139,15,15	///* 1458 (hide)*/
2_tiamat_01.gat,217,26,0	duplicate(spe5_01#2_tiamat_01)	spe5_06#2_tiamat_01	139,15,15	///* 1459 (hide)*/
2_tiamat_01.gat,217,55,0	duplicate(spe5_01#2_tiamat_01)	spe5_07#2_tiamat_01	139,15,15	///* 1460 (hide)*/
2_tiamat_01.gat,209,74,0	duplicate(spe5_01#2_tiamat_01)	spe5_08#2_tiamat_01	139,15,15	///* 1461 (hide)*/

2_tiamat_01.gat,201,39,9	script	四騎士ミルカ#b2_01	728,{/* 1439 */
	if($@tiamat_main == 2)
		unittalk "四騎士ミルカ : 追い詰めましたよ。覚悟なさい！",1;
	end;
}
2_tiamat_01.gat,203,40,9	script	四騎士ハウンド#b2_01	420,{/* 1440 */
	if($@tiamat_main == 2)
		unittalk "四騎士ハウンド : そろそろ潮時だ。随分長生きしただろう？",1;
	end;
}
2_tiamat_01.gat,202,37,9	script	四騎士ローウェン#b2_01	416,{/* 1441 */
	if($@tiamat_main == 2)
		unittalk "四騎士ローウェン : 魔女よ、貴方の悪事もここまでです。",1;
	end;
}
2_tiamat_01.gat,196,45,4	script	魔女ジラント#b2_01	10272,{/* 1462 */
	if($@tiamat_main == 2)
		unittalk "魔女ジラント : ふふふ……約束の時間には、遅刻せずに済んだようだな。",1;
	end;
}
2_tiamat_01.gat,199,41,1	script	王女メア#b2_01	10361,{/* 1463 */
	if($@tiamat_main == 2)
		unittalk "王女メア : なんとか辿りつきましたね。今こそ、魔女を討つ時です。",1;
	else
		unittalk "王女メア : 地下祭壇への道が開かれています。　魔女の本性を暴くためにも、先に進みましょう。",1;
	end;
}

2_tiamat_01.gat,196,45,0	script	guest#part26_1	139,{/* 2063 (hide)*/}
2_tiamat_01.gat,196,45,0	script	guest#part26_2	139,{/* 2064 (hide)*/}
2_tiamat_01.gat,196,45,0	script	guest#part26_3	139,{/* 2065 */}

2_tiamat_00.gat,0,0,0	script	Angel#2_tiamat_00	139,{
OnStart:
OnTimer3000:
	set '@flag,0;
	if($@tiamat_angel & (1<<0)) {
		hideoffnpc "魔術師の魂#2_tiamat_00";
		misceffect 179, "魔術師の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<1)) {
		hideoffnpc "女教皇の魂#2_tiamat_00";
		misceffect 179, "女教皇の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<2)) {
		hideoffnpc "女帝の魂#2_tiamat_00";
		misceffect 179, "女帝の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<3)) {
		hideoffnpc "皇帝の魂#2_tiamat_00";
		misceffect 179, "皇帝の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<4)) {
		hideoffnpc "法王の魂#2_tiamat_00";
		misceffect 179, "法王の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<5)) {
		hideoffnpc "恋人の魂#2_tiamat_00";
		misceffect 179, "恋人の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<6)) {
		hideoffnpc "戦車の魂#2_tiamat_00";
		misceffect 179, "戦車の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<7)) {
		hideoffnpc "力の魂#2_tiamat_00";
		misceffect 179, "力の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<8)) {
		hideoffnpc "隠者の魂#2_tiamat_00";
		misceffect 179, "隠者の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<9)) {
		hideoffnpc "運命の輪の魂#2_tiamat_00";
		misceffect 179, "運命の輪の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<10)) {
		hideoffnpc "正義の魂#2_tiamat_00";
		misceffect 179, "正義の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<11)) {
		hideoffnpc "吊るされた男の魂#2_tiamat_00";
		misceffect 179, "吊るされた男の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<12)) {
		hideoffnpc "死神の魂#2_tiamat_00";
		misceffect 179, "死神の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<13)) {
		hideoffnpc "節制の魂#2_tiamat_00";
		misceffect 179, "節制の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<14)) {
		hideoffnpc "悪魔の魂#2_tiamat_00";
		misceffect 179, "悪魔の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<15)) {
		hideoffnpc "塔の魂#2_tiamat_00";
		misceffect 179, "塔の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<16)) {
		hideoffnpc "星の魂#2_tiamat_00";
		misceffect 179, "星の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<17)) {
		hideoffnpc "月の魂#2_tiamat_00";
		misceffect 179, "月の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<18)) {
		hideoffnpc "太陽の魂#2_tiamat_00";
		misceffect 179, "太陽の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<19)) {
		hideoffnpc "審判の魂#2_tiamat_00";
		misceffect 179, "審判の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<20)) {
		hideoffnpc "世界の魂#2_tiamat_00";
		misceffect 179, "世界の魂#2_tiamat_00";
		'@flag++;
	}
	if($@tiamat_angel & (1<<21)) {
		hideoffnpc "愚者の魂#2_tiamat_00";
		misceffect 179, "愚者の魂#2_tiamat_00";
		'@flag++;
	}
	if('@flag < 22) {
		initnpctimer;
	}
	end;
OnTimer6000:
	stopnpctimer;
	announce "王城を護る全ての守護天使の魂が台座に揃いました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	misceffect 253, "魔術師の魂#2_tiamat_00"; //1410
	misceffect 253, "女教皇の魂#2_tiamat_00"; //1411
	misceffect 253, "女帝の魂#2_tiamat_00"; //1412
	misceffect 253, "皇帝の魂#2_tiamat_00"; //1413
	misceffect 253, "法王の魂#2_tiamat_00"; //1414
	misceffect 253, "恋人の魂#2_tiamat_00"; //1415
	misceffect 253, "戦車の魂#2_tiamat_00"; //1416
	misceffect 253, "力の魂#2_tiamat_00"; //1417
	misceffect 253, "隠者の魂#2_tiamat_00"; //1418
	misceffect 253, "運命の輪の魂#2_tiamat_00"; //1419
	misceffect 253, "正義の魂#2_tiamat_00"; //1420
	misceffect 253, "吊るされた男の魂#2_tiamat_00"; //1421
	misceffect 253, "死神の魂#2_tiamat_00";
	misceffect 253, "節制の魂#2_tiamat_00";
	misceffect 253, "悪魔の魂#2_tiamat_00";
	misceffect 253, "塔の魂#2_tiamat_00";
	misceffect 253, "星の魂#2_tiamat_00";
	misceffect 253, "月の魂#2_tiamat_00";
	misceffect 253, "太陽の魂#2_tiamat_00";
	misceffect 253, "審判の魂#2_tiamat_00";
	misceffect 253, "世界の魂#2_tiamat_00";
	misceffect 253, "愚者の魂#2_tiamat_00";
	sleep 1000;
	misceffect 260, "魔術師の魂#2_tiamat_00"; //1410
	misceffect 260, "女教皇の魂#2_tiamat_00"; //1411
	misceffect 260, "女帝の魂#2_tiamat_00"; //1412
	misceffect 260, "皇帝の魂#2_tiamat_00"; //1413
	misceffect 260, "法王の魂#2_tiamat_00"; //1414
	misceffect 260, "恋人の魂#2_tiamat_00"; //1415
	misceffect 260, "戦車の魂#2_tiamat_00"; //1416
	misceffect 260, "力の魂#2_tiamat_00"; //1417
	misceffect 260, "隠者の魂#2_tiamat_00"; //1418
	misceffect 260, "運命の輪の魂#2_tiamat_00"; //1419
	misceffect 260, "正義の魂#2_tiamat_00"; //1420
	misceffect 260, "吊るされた男の魂#2_tiamat_00"; //1421
	misceffect 260, "死神の魂#2_tiamat_00";
	misceffect 260, "節制の魂#2_tiamat_00";
	misceffect 260, "悪魔の魂#2_tiamat_00";
	misceffect 260, "塔の魂#2_tiamat_00";
	misceffect 260, "星の魂#2_tiamat_00";
	misceffect 260, "月の魂#2_tiamat_00";
	misceffect 260, "太陽の魂#2_tiamat_00";
	misceffect 260, "審判の魂#2_tiamat_00";
	misceffect 260, "世界の魂#2_tiamat_00";
	misceffect 260, "愚者の魂#2_tiamat_00";
	misceffect 222, "area#r1881"; //1408
	misceffect 222, "area#r1882"; //1409
	sleep 2000;
	misceffect 488, "area#r1881"; //1408
	misceffect 488, "area#r1882"; //1409
	donpcevent "tiamat_mob#b3_01::OnStart";
	sleep 1000;
	hideoffnpc "四騎士ミルカ#1040_1"; //1866
	hideoffnpc "四騎士ハウンド#2055_1"; //1930
	hideoffnpc "四騎士ローウェン#3037_1"; //1985
	misceffect 321, "area#r1881"; //1408
	hideoffnpc "area#r1881"; //1408
	misceffect 321, "area#r1882"; //1409
	hideoffnpc "area#r1882"; //1409
	announce "[神殿B2F 地下祭壇] の結界が解け、[深淵の玉座]へ続く道が現れました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	setnpcdisplay "魔術師の魂#2_tiamat_00",802; //1410
	setnpcdisplay "女教皇の魂#2_tiamat_00",802; //1411
	setnpcdisplay "女帝の魂#2_tiamat_00",802; //1412
	setnpcdisplay "皇帝の魂#2_tiamat_00",802; //1413
	setnpcdisplay "法王の魂#2_tiamat_00",802; //1414
	setnpcdisplay "恋人の魂#2_tiamat_00",802; //1415
	setnpcdisplay "戦車の魂#2_tiamat_00",802; //1416
	setnpcdisplay "力の魂#2_tiamat_00",802; //1417
	setnpcdisplay "隠者の魂#2_tiamat_00",802; //1418
	setnpcdisplay "運命の輪の魂#2_tiamat_00",802; //1419
	setnpcdisplay "正義の魂#2_tiamat_00",802; //1420
	setnpcdisplay "吊るされた男の魂#2_tiamat_00",802; //1421
	setnpcdisplay "死神の魂#2_tiamat_00",802;
	setnpcdisplay "節制の魂#2_tiamat_00",802;
	setnpcdisplay "悪魔の魂#2_tiamat_00",802;
	setnpcdisplay "塔の魂#2_tiamat_00",802;
	setnpcdisplay "星の魂#2_tiamat_00",802;
	setnpcdisplay "月の魂#2_tiamat_00",802;
	setnpcdisplay "太陽の魂#2_tiamat_00",802;
	setnpcdisplay "審判の魂#2_tiamat_00",802;
	setnpcdisplay "世界の魂#2_tiamat_00",802;
	setnpcdisplay "愚者の魂#2_tiamat_00",802;
	end;
}
2_tiamat_02.gat,0,0,0	script	tiamat_mob#b3_01	139,{
OnStart:
	initnpctimer;
	setarray '@xy,31,46,35,46,39,46,30,49,41,49,30,53,41,53,30,57,41,57,30,61,41,61,30,65,41,65,30,69,41,69,30,73,41,73,31,76,35,76,39,76;
	for('@i=0; '@i<getarraysize('@xy)/2; '@i++)
		monster "2_tiamat_02.gat",'@xy['@i*2],'@xy['@i*2+1]," ",3982,1,strnpcinfo(0)+ "::OnKilled";
	areasetcell "2_tiamat_02.gat",29,45,42,77,1;
	areasetcell "2_tiamat_02.gat",32,48,39,74,0;
	end;
OnTimer60000:
	stopnpctimer;
	hideonnpc "四騎士ミルカ#1040_1"; //1866
	hideonnpc "四騎士ハウンド#2055_1"; //1930
	hideonnpc "四騎士ローウェン#3037_1"; //1985
	announce "魔女ジラント : おのれ……我が寝所に無断で入ってくるとは！", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 5000;
	announce "魔女ジラント : このような屈辱は初めてだ……貴様ら、許さぬぞ！", 0x9, 0xff0000, 0x190, 26, 0, 0;
	misceffect 419, "魔女ジラント#2_tiamat_0"; //1516
	sleep 5000;
	announce "魔女ジラント : ゆっくり喰らってやろうと思っていたが……もはや楽に死ねると思うな！", 0x9, 0xff0000, 0x190, 26, 0, 0;
	misceffect 756, "魔女ジラント#2_tiamat_0"; //1516
	misceffect 780, "魔女ジラント#2_tiamat_0"; //1516
	misceffect 882, "魔女ジラント#2_tiamat_0"; //1516
	sleep 5000;
	announce "魔女ジラント : その身を八つに裂いた上で、魂を喰い尽くしてくれるわ！", 0x9, 0xff0000, 0x190, 26, 0, 0;
	misceffect 90, "魔女ジラント#2_tiamat_0"; //1516
	misceffect 262, "魔女ジラント#2_tiamat_0"; //1516
	misceffect 936, "魔女ジラント#2_tiamat_0"; //1516
	setnpcdisplay "魔女ジラント#2_tiamat_0",10273;	// 1641
	hideoffnpc "open_01#2_tiamat_02"; //1513
	hideoffnpc "open_02#2_tiamat_02"; //1513
	hideonnpc "open_01#2_tiamat_02"; //1513
	hideonnpc "open_02#2_tiamat_02"; //1513
	sleep 5000;
	announce "王女メア : ……魔女が本性を現しました。今なら完全に討ち滅ぼすことができましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	sleep 5000;
	announce "王女メア : ですが……本性を現した魔女の力は計り知れません……。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	sleep 5000;
	announce "王女メア : どうか、御武運を……！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	sleep 5000;
	misceffect 911, "魔女ジラント#2_tiamat_0"; //1516
	areasetcell "2_tiamat_02.gat",29,45,42,77,0;
	killmonster "2_tiamat_02.gat","tiamat_mob#b3_01::OnKilled";
	setnpcdisplay "魔女ジラント#2_tiamat_0",844;	// 1641
	hideonnpc "魔女ジラント#2_tiamat_0"; //1516
	hideonnpc "王女メア#2_tiamat_02"; //1517
	hideonnpc "四騎士ミルカ#2_tiamat_0"; //1473
	hideonnpc "四騎士ハウンド#2_tiamat"; //1474
	hideonnpc "四騎士ローウェン#2_tiam"; //1475
	donpcevent "tiamat_mob#b3_02::OnSpawn";
	end;
OnKilled:
	end;
}
2_tiamat_02.gat,0,0,0	script	tiamat_mob#b3_02	139,{
OnSpawn:
	initnpctimer;
	set 'flag,0;
	set 'mob,callmonster("2_tiamat_02.gat",26,61,"古龍ジラント",20492,"tiamat_mob#b3_02::OnKilled");
	setarray '@xy,29,49,29,73,52,49,52,73;
	for(set '@i,0; '@i<4; set '@i,'@i+1)
		set 'hell['@i],callmonster("2_tiamat_02.gat",'@xy['@i*2],'@xy['@i*2+1],"#hell_00"+'@i,3855,"tiamat_mob#b3_01::OnKilled");
	end;
OnTimer3000:
	if('mob == 0) {
		stopnpctimer;
		end;
	}
	set '@hp,getmobhp('mob);
	if('flag < 9 && getmobhp('mob) < 90000000) {
		set 'flag,9;
	}
	else if('flag < 4 && '@hp < 130000000) {
		set 'flag,4;
	}
	switch('flag) {
	case 0:
		if(getmobhp('mob) < 950000000) {
			set 'flag,1;
			announce "古龍ジラント : 王城を守護する全ての天使達よ！　侵入者を排除せよ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			donpcevent "tiamat_mob#b3_02::OnGimmick";
			sleep 3000;
			setarray '@angel,20457,20458,20459,20460,20461,20462,20463,20464,20465,20466,20467,20468,20469,20470,20471,20472,20473,20474,20475,20476,20477,20478;
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
			setarray '@dx, 0,-5, 5,-8, 0, 8,-3, 3,-10,10,-5, 5,-10,10,-3, 3,-8, 0, 8,-5, 5,  0;
			setarray '@dy,10, 8, 8, 5, 5, 5, 3, 3,  2, 2, 0, 0, -2,-2,-3,-3,-5,-5,-5, 8, 8,-10;
			for(set '@i,0; '@i<1; set '@i,'@i+1) {
				set '@r,rand(getarraysize('@angel));
				set '@angel_id['@i],callmonster("2_tiamat_02.gat",'@x+'@dx['@r],'@y+'@dy['@r],"--ja--",'@angel['@r],"tiamat_mob#b3_02::OnAngelKilled");
				if('@angel_id['@i] <= 0)
					set '@angel_id['@i],callmonster("2_tiamat_02.gat",'@x,'@y,"--ja--",'@angel['@r],"tiamat_mob#b3_02::OnAngelKilled");
				mobuseskill '@angel_id['@i],21,10,0,0,0,0;
				mobuseskill '@angel_id['@i],730,5,0,0,0,0;
				deletearray '@angel['@r],1;
				deletearray '@dx['@r],1;
				deletearray '@dy['@r],1;
			}
			sleep 1000;
			announce "ジラントが空に浮かべた22枚のカードからモンスター達があらわれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			sleep 4000;
			announce "天使達にジラントの魔力が注がれた", 0x9, 0xffffff, 0x190, 20, 0, 0;
			donpcevent "tiamat_mob#b3_02::OnGimmickEnd";
			sleep 3000;
			announce "王女メア : 天使達が強力な魔力を帯びています……。大変ですが、倒す必要がありそうですね。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
		}
		break;
	case 1:
		if(getmobhp('mob) < 900000000) {
			set 'flag,2;
			announce "古龍ジラント : 今一度目覚めよ……我が同胞達よ……！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			donpcevent "tiamat_mob#b3_02::OnGimmick";
			sleep 3000;
			//donpcevent "tiamat_mob#b3_03::OnStart";
			sleep 3000;
			announce "ジラントの呪いによって周辺にモンスターが出現した", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			sleep 3000;
			donpcevent "tiamat_mob#b3_02::OnGimmickEnd";
		}
		break;
	case 2:
		if(getmobhp('mob) < 800000000) {
			set 'flag,3;
			announce "ジラントは大きく息を吸い込んだ", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			sleep 3000;
			announce "王女メア : ジラントから凄まじい熱を感じます……防御の用意を！", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
			sleep 3000;
			set 'dir,-1;
			set 'tmp,200;
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
			set 'bossx,'@x;
			set 'bossy,'@y;
			donpcevent "spe2_01#2_tiamat_02::OnStart";
			donpcevent "spe2_02#2_tiamat_02::OnStart";
			donpcevent "spe2_03#2_tiamat_02::OnStart";
			donpcevent "spe2_04#2_tiamat_02::OnStart";
			unittalk 'mob,"古龍ジラント : 煉獄の炎に焼かれて朽ち果てるが良い!!";	// 6255:古龍ジラント
			//ジラント視線+1セルから先へ4(5)*10(~)セル先へ向けてランダム位置にブレス
			setarray '@dirx,0,-1,-1,-1, 0, 1, 1, 1;
			setarray '@diry,1, 1, 0,-1,-1,-1, 0, 1;
			donpcevent "spe2_01#2_tiamat_02::OnFinish";
			donpcevent "spe2_02#2_tiamat_02::OnFinish";
			donpcevent "spe2_03#2_tiamat_02::OnFinish";
			donpcevent "spe2_04#2_tiamat_02::OnFinish";
			if('dir < 0) {set 'dir,rand(8);}
			for('@i=1;'@i<=14;'@i++) {
				for('@k=1;'@k<=3;'@k++) {
					mobuseskillpos 'mob,731,5,'bossx+('@dirx['dir]*'@i)+rand(6)-2,'bossy+('@diry['dir]*'@i)+rand(6)-2,0,0;	// Mドラゴンブレス
					mobuseskillpos 'mob,229,5,'bossx+('@dirx['dir]*'@i)+rand(6)-2,'bossy+('@diry['dir]*'@i)+rand(6)-2,0,0;	// デモンストレーション
					sleep 50;
				}
			}
			//mobuseskill 'mob,731,5,0,0,0,1;	// Mドラゴンブレス
			//mobuseskill 'mob,229,5,0,0,0,1;	// デモンストレーション
			//mobuseskillpos 'mob,731,5,'@x,'@y,0,0;	// Mドラゴンブレス
			//mobuseskillpos 'mob,229,5,'@x,'@y,0,0;	// デモンストレーション
		}
		break;
	case 3:
		if(getmobhp('mob) < 700000000) {
			set 'flag,4;
			donpcevent "tiamat_mob#b3_02::OnGimmick";
			announce "古龍ジラント : 忌々しい奴らめ……容赦はせんぞ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			setarray '@skillid,716,720,737;
			for('@i=0;'@i<=11;'@i++) {
				sleep 3000;
				set '@r,rand(3);
				if('@i == 8)
					announce "王女メア : ジラントの詠唱速度が加速しています。　早く対処を！", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
				set '@time,5000-250*'@i;
				mobuseskill 'mob,403,1,0,0,0,0;	// メモライズ
				mobuseskill 'mob,'@skillid['@r],5,'@time,1,0,0;
				if('@i == 0) {
					switch('@r) {
					case 0: announce "王女メア : あの詠唱は…全てを跳ね返すと言われた恐ろしい防御魔法です！　気を付けてください！", 0x9, 0x00ff00, 0x0190, 26, 0, 0; break;
					case 1: announce "王女メア : あの詠唱は…周囲を全て凍結させてしまう強力な攻撃魔法です！　すぐに攻撃属性への対処を！", 0x9, 0x00ff00, 0x0190, 26, 0, 0; break;
					case 2: announce "王女メア : あの詠唱は…天から聖なる光が降り注ぐ攻撃魔法です！　すぐに攻撃属性への対処を！", 0x9, 0x00ff00, 0x190, 26, 0, 0; break;
					}
					donpcevent "tiamat_mob#b3_02::OnGimmickEnd";
				}
				sleep '@time;
				if(getmobhp('mob) < 600000000)
					break;
			}
		}
		break;
	case 4:
		if(getmobhp('mob) < 600000000) {
			set 'flag,5;
			//狂乱、死の呪い
			announce "古龍ジラント : 深淵なる闇よ……生者の精神を蝕め！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			hideoffnpc "spe3_01#2_tiamat_02";	// 1492
			hideoffnpc "spe3_02#2_tiamat_02";	// 1493
			hideoffnpc "spe3_03#2_tiamat_02";	// 1494
			hideoffnpc "spe3_04#2_tiamat_02";	// 1495
			hideonnpc "spe3_01#2_tiamat_02";	// 1492
			hideonnpc "spe3_02#2_tiamat_02";	// 1493
			hideonnpc "spe3_03#2_tiamat_02";	// 1494
			hideonnpc "spe3_04#2_tiamat_02";	// 1495
		}
		break;
	case 5:
		if(getmobhp('mob) < 500000000) {
			set 'flag,6;
			announce "ジラントから放たれる魔力が弱まっていく", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			sleep 3000;
			mobuseskill 'mob,361,5,3000,0,0,0;	// アスムプティオ
			sleep 3000;
			//深い睡眠
			hideoffnpc "pat3_01#2_tiamat_02";	// 1480
			hideoffnpc "pat3_02#2_tiamat_02";	// 1481
			hideoffnpc "pat3_03#2_tiamat_02";	// 1482
			hideoffnpc "pat3_04#2_tiamat_02";	// 1483
			announce "周囲に眠気を誘う甘く不思議な匂いが漂い始めた", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			hideonnpc "pat3_01#2_tiamat_02";	// 1480
			hideonnpc "pat3_02#2_tiamat_02";	// 1481
			hideonnpc "pat3_03#2_tiamat_02";	// 1482
			hideonnpc "pat3_04#2_tiamat_02";	// 1483
			//@skillnodamage(src: "古龍ジラント"(26968), dst: (26968), skill: "ヒール"(28), val: 9999)
			//@skillnodamage(src: "古龍ジラント"(26968), dst: (26968), skill: "M呪縛陣"(730), val: 1)
			announce "ジラントの傷が癒え、HPが 3,196,018 回復した", 0x9, 0x00ebff, 0x0190, 20, 0, 0;
		}
		break;
	case 6:
		if(getmobhp('mob) < 400000000) {
			set 'flag,7;
			//竜の眷属
			announce "古龍ジラント : ただ喰らうには惜しい……　その血肉、我のものとしよう！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			hideoffnpc "spe4_02#2_tiamat_02";	// 1497
			hideoffnpc "spe4_04#2_tiamat_02";	// 1499
			hideonnpc "spe4_02#2_tiamat_02";	// 1497
			hideonnpc "spe4_04#2_tiamat_02";	// 1499
		}
		break;
	case 7:
		if(getmobhp('mob) < 300000000) {
			set 'flag,8;
			//Mサイキック
			announce "周囲に満ちていた甘い匂いが失われた", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			donpcevent "tiamat_mob#b3_02::OnGimmick";
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
			sleep 3000;
			announce "古龍ジラント : 我がものになることを拒むか？　……ならば、もはや用は無い！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			mobuseskill 'mob,403,1,7000,0,0,0;	// メモライズ
			sleep 3000;
			announce "王女メア : あの詠唱は……！　ジラントは「王」を呼び出すつもりです！", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
			sleep 3000;
			announce "古龍ジラント : かつて世界を支配した偉大な王と戦えることを光栄に思うが良い！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			sleep 3000;
			announce "古龍ジラント : 全てを切り裂く稲妻と称えられた最恐の王よ……我が呼び声に応じよ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			sleep 3000;
			set '@dx,'@x+rand(11)-5;
			set '@dy,'@y+rand(11)-5;
			set '@effmob,callmonster("2_tiamat_02.gat",'@dx,'@dy,"#pat4_1",3868,"tiamat_mob#b3_02::OnEffMobKilled");
			mobuseskill '@effmob,85,1,0,0,0,0;	// ロードオブヴァーミリオン
			sleep 1000;
			set '@dummy,removemonster('@effmob);
			sleep 3000;
			announce "ジラントの呼び声に応じて空間の裂け目からモンスターが出現した", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			set 'mob2,callmonster("2_tiamat_02.gat",'@dx,'@dy,"朽ちた古王グローザ",20489,"tiamat_mob#b3_02::OnKilled2");
			mobuseskill 'mob2,730,5,0,0,0,0;	// M呪縛陣
			sleep 3000;
			announce "古龍ジラント : さあ、我が最愛の王よ……その力で敵を蹂躙せよ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			sleep 3000;
			announce "王女メア : お父様……今度こそ呪縛から解き放ちます……。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
			sleep 3000;
			donpcevent "tiamat_mob#b3_02::OnGimmickEnd";
		}
		break;
	case 8:
		if(getmobhp('mob) < 200000000) {
			set 'flag,9;
			donpcevent "tiamat_mob#b3_02::OnGimmick";
			sleep 3000;
			announce "ジラントの瞳が怪しく光り、周囲にモンスターが出現した。", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			//@spawn(type: BL_MOB, ID: 54189, speed: 190, option: 0x0, class: 20490, pos: ("2_tiamat_02.gat",29,73), dir: 0, name"イビルアイ#2")
			sleep 3000;
			announce "古龍ジラント : 我の魔力の結晶体……美しいであろう……ふふ……。", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			sleep 30000;
			//制限時間内にイビルアイを倒せなかった場合、↓アナウンス後にイビルアイが自爆
			//@skillnodamage(src: "イビルアイ#2"(54189), dst: (54189), skill: "爆裂波動"(270), val: 1)
			announce "不快な騒音とともにイビルアイが小刻みに震え始めた", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			sleep 1500;
			//邪眼の呪い
			hideoffnpc "spe5_01#2_tiamat_02";	// 1505
			hideoffnpc "spe5_02#2_tiamat_02";	// 1506
			sleep 1500;
			announce "古龍ジラント : 我が魔力に魅入られ身動きできぬだろう。さあ、喰らってやろう！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			//@skillnodamage(src: "イビルアイ#2"(54189), dst: (54189), skill: "Mセルフディストラクション"(173), val: 1)
			hideonnpc "spe5_01#2_tiamat_02";	// 1505
			hideonnpc "spe5_02#2_tiamat_02";	// 1506
			sleep 3000;
			donpcevent "tiamat_mob#b3_02::OnGimmickEnd";
		}
		break;
	case 9:
		if(getmobhp('mob) < 100000000) {
			set 'flag,10;
			//呪縛陣　移動不可
			announce "古龍ジラント : まだ倒れぬか……ここまで喰らいつくとは、彼の王を思い出す。", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			sleep 3000;
			announce "古龍ジラント : 良かろう！　彼の王を葬った必殺の技にて葬ってくれる！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
			sleep 3000;
			announce "ジラントは大きく息を吸い込み魔力を溜め始めた", 0x9, 0xffffff, 0x0190, 20, 0, 0;
			mobuseskill 'mob,378,1,0,0,0,0;	// エンチャントデッドリーポイズン
			sleep 3000;
			mobuseskill 'mob,378,1,0,0,0,0;	// エンチャントデッドリーポイズン
			sleep 3000;
			mobuseskill 'mob,378,1,0,0,0,0;	// エンチャントデッドリーポイズン
			sleep 3000;
			unittalk 'mob,"古龍ジラント : 天の光よ！　全ての敵を滅せよ！";	// 23654:古龍ジラント
			/*@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653106)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653107)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653108)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653109)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653109)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653110)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653111)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653112)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653112)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653113)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653114)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653114)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653115)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653116)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653301)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653302)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653302)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653303)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653304)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653304)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653305)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653337)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653345)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653352)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653353)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653371)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653380)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653389)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653390)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653408)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653409)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653412)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653412)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653417)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653417)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653418)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653797)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653801)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653801)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653802)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653803)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653825)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653831)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653838)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653838)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653867)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653872)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653880)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653880)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653912)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653914)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653916)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653917)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366653943)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653946)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366653950)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654299)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654313)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654314)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654314)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654315)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654337)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654340)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654345)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654345)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654381)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654387)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654394)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654395)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654431)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654447)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654472)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654473)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mレイオブジェネシス"(737), val: 65535, tick: 366654505)
			@skillposeffect(src: "古龍ジラント"(23654), skill: "Mドラゴンブレス"(731), val: 65535, tick: 366654514)*/
			hideoffnpc "spe6_01#2_tiamat_02";	// 1504
			hideoffnpc "spe6_03#2_tiamat_02";	// 1506
			hideonnpc "spe6_01#2_tiamat_02";	// 1504
			hideonnpc "spe6_03#2_tiamat_02";	// 1506

			hideoffnpc "spe6_05#2_tiamat_02";	// 1508
			hideoffnpc "spe6_07#2_tiamat_02";	// 1510
			hideonnpc "spe6_05#2_tiamat_02";	// 1508
			hideonnpc "spe6_07#2_tiamat_02";	// 1510
		}
		break;
	}
	initnpctimer;
	end;
OnGimmick:
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
	monster "2_tiamat_02.gat",'@x-1,'@y-1,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	monster "2_tiamat_02.gat",'@x,'@y-1,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	monster "2_tiamat_02.gat",'@x+1,'@y-1,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	monster "2_tiamat_02.gat",'@x-1,'@y,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	monster "2_tiamat_02.gat",'@x+1,'@y,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	monster "2_tiamat_02.gat",'@x-1,'@y+1,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	monster "2_tiamat_02.gat",'@x,'@y+1,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	monster "2_tiamat_02.gat",'@x+1,'@y+1,"",3982,1,"tiamat_mob#b3_02::OnGimmickEnd";
	areasetcell "2_tiamat_02.gat",'@x-1,'@y-1,'@x+1,'@y+1,1;
	setcell "2_tiamat_02.gat",'@x,'@y,0;
	end;
OnGimmickEnd:
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
	areasetcell "2_tiamat_02.gat",'@x-1,'@y-1,'@x+1,'@y+1,0;
	killmonster "2_tiamat_02.gat","tiamat_mob#b3_02::OnGimmickEnd";
	end;
OnAngelKilled:
OnEffMobKilled:
OnKilled2:
	// dummy
	end;
OnKilled:
	set $@tiamat_main,4;
	hideonnpc "王城入口#0C";
	hideoffnpc "王城入口#0D";
	donpcevent "tiamat_mob#b3_02::OnGimmickEnd";
	hideoffnpc "clear_01#2_tiamat_02";	// 1649
	hideoffnpc "clear_02#2_tiamat_02";	// 1649
	sleep 500;
	hideonnpc "clear_01#2_tiamat_02";	// 1649
	hideonnpc "clear_02#2_tiamat_02";	// 1649
	announce "古龍ジラント : うおぉぉぉぉぉぉ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 7000;
	misceffect 722,"魔女ジラント#2_tiamat_0";	// 1641
	hideoffnpc "魔女ジラント#2_tiamat_0";	// 1641
	setnpcdisplay "魔女ジラント#2_tiamat_0",10273;	// 1641
	hideoffnpc "王女メア#2_tiamat_02";	// 1642
	hideoffnpc "四騎士ミルカ#2_tiamat_0";	// 1598
	hideoffnpc "四騎士ハウンド#2_tiamat";	// 1599
	hideoffnpc "四騎士ローウェン#2_tiam";	// 1600
	sleep 3000;
	announce "古龍ジラント : 神代の時代より生きながらえる我が……負ける……だと……。", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 6000;
	announce "古龍ジラント : こ、こんな下賤な者どもに……み、認めぬ……！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 6000;
	announce "古龍ジラント : こうなれば我が魂を贄にして……貴様らを呪い殺してくれる！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	misceffect 812,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 826,"魔女ジラント#2_tiamat_0";	// 1641
	unittalk getnpcid(0,"魔女ジラント#2_tiamat_0"),"古龍ジラント : お……のれぇ……貴様……許さぬ……ぞ……。";	// 1516
	sleep 6000;
	announce "古龍ジラント : 一人では死なぬ！　呪われし深淵の底に共に沈もうぞ！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	misceffect 366,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 409,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 781,"魔女ジラント#2_tiamat_0";	// 1641
	sleep 6000;
	announce "王女メア : そうはさせません。貴女の魂は、私が浄化します。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
	misceffect 58,"王女メア#2_tiamat_02";	// 1642
	sleep 6000;
	misceffect 9,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 36,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 113,"魔女ジラント#2_tiamat_0";	// 1641
	announce "古龍ジラント : や、やめろっ！　我が求めるのは絶叫と騒乱！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 6000;
	misceffect 9,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 36,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 76,"魔女ジラント#2_tiamat_0";	// 1641
	announce "古龍ジラント : こ、こんな穏やかな死など……望んではおらぬ……うぉぉぉぉ……！", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 6000;
	misceffect 9,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 36,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 91,"魔女ジラント#2_tiamat_0";	// 1641
	announce "王女メア : どうか安らかにお眠りください……。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
	sleep 6000;
	misceffect 9,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 36,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 440,"魔女ジラント#2_tiamat_0";	// 1641
	announce "王女メア : ……母様。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
	sleep 3000;
	misceffect 425,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 514,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 778,"魔女ジラント#2_tiamat_0";	// 1641
	misceffect 460,"魔女ジラント#2_tiamat_0";	// 1641
	setnpcdisplay "魔女ジラント#2_tiamat_0",844;	// 1641
	hideonnpc "魔女ジラント#2_tiamat_0";	// 1641
	sleep 6000;
	announce "王女メア : 全て……終わりましたね……。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
	sleep 6000;
	announce "王女メア : 冒険者様に作戦の成果をお伝えしたいので、秘密の部屋に向かいましょう。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
	sleep 6000;
	donpcevent "#tiamat_finish::OnStart";
	mapwarp "2_tiamat_02.gat","3_tiamat_00.gat", 155, 96;
	end;
}
2_tiamat_02.gat,0,0,0	script	tiamat_mob#b3_03	139,{
OnStart:
	areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20488,15,"tiamat_mob#b3_03::OnKilled1";
	areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20487,15,"tiamat_mob#b3_03::OnKilled2";
	areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20486,15,"tiamat_mob#b3_03::OnKilled3";
	areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20485,15,"tiamat_mob#b3_03::OnKilled4";
	end;
OnKilled1:
	if(countitem(28014) < 1)	// 古王の双刃
		areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20488,1,"tiamat_mob#b3_03::OnKilled1";
	end;
OnKilled2:
	if(countitem(28014) < 1)	// 古王の双刃
		areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20487,1,"tiamat_mob#b3_03::OnKilled2";
	end;
OnKilled3:
	if(countitem(28014) < 1)	// 古王の双刃
		areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20486,1,"tiamat_mob#b3_03::OnKilled3";
	end;
OnKilled4:
	if(countitem(28014) < 1)	// 古王の双刃
		areamonster "2_tiamat_02.gat",25,42,60,81,"呪いの古龍",20485,1,"tiamat_mob#b3_03::OnKilled4";
	end;
}

2_tiamat_02.gat,29,49,0	script	pat3_01#2_tiamat_02	139,12,12,{/* 1480 (hide)*/
OnTouch:
	//深い睡眠
	misceffect 848,""; //self
	misceffect 845,""; //self
	misceffect 861,""; //self
	misceffect 197,""; //self
	misceffect 528,""; //self
	end;
}
2_tiamat_02.gat,29,73,0	duplicate(pat3_01#2_tiamat_02)	pat3_02#2_tiamat_02	139,12,12	/* 1481 (hide)*/
2_tiamat_02.gat,52,49,0	duplicate(pat3_01#2_tiamat_02)	pat3_03#2_tiamat_02	139,12,12	/* 1482 (hide)*/
2_tiamat_02.gat,52,73,0	duplicate(pat3_01#2_tiamat_02)	pat3_04#2_tiamat_02	139,12,12	/* 1483 (hide)*/
2_tiamat_02.gat,29,49,0	script	pat3_05#2_tiamat_02	139,{/* 1484 (hide)*/}
2_tiamat_02.gat,29,73,0	script	pat3_06#2_tiamat_02	139,{/* 1485 (hide)*/}
2_tiamat_02.gat,52,49,0	script	pat3_07#2_tiamat_02	139,{/* 1486 (hide)*/}
2_tiamat_02.gat,52,73,0	script	pat3_08#2_tiamat_02	139,{/* 1487 (hide)*/}
2_tiamat_02.gat,29,49,0	script	spe2_01#2_tiamat_02	139,12,12,{/* 1488 (hide)*/
OnTouch:
	set '@dummy,getmapxy('@map$,'@tx,'@ty,0);
	set '@dx,'@tx - getvariableofnpc('bossx,"tiamat_mob#b3_02");
	set '@dy,'@ty - getvariableofnpc('bossy,"tiamat_mob#b3_02");
	set '@tdx,('@dx < 0)? -('@dx): '@dx;
	set '@tdy,('@dy < 0)? -('@dy): '@dy;
	set '@dir,-1;
	if(getvariableofnpc('tmp,"tiamat_mob#b3_02") > '@tdx+'@tdy) {
		set getvariableofnpc('tmp,"tiamat_mob#b3_02"),'@tdx+'@tdy;
		if('@dx == 0 && '@dy == 0) {
			'@dir = 0;	// 上
		}
		else if('@dx >= 0 && '@dy >= 0) {
			if('@dx * 3 - 1 < '@dy)   '@dir = 0;	// 上
			else if('@dx > '@dy * 3)  '@dir = 6;	// 右
			else                      '@dir = 7;	// 右上
		}
		else if('@dx >= 0 && '@dy <= 0) {
			if('@dx * 3 - 1 < -'@dy)  '@dir = 4;	// 下
			else if('@dx > -'@dy * 3) '@dir = 6;	// 右
			else                      '@dir = 5;	// 右下
		}
		else if('@dx <= 0 && '@dy <= 0) {
			if('@dx * 3 + 1 > '@dy)   '@dir = 4;	// 下
			else if('@dx < '@dy * 3)  '@dir = 2;	// 左
			else                      '@dir = 3;	// 左下
		}
		else {
			if(-'@dx * 3 - 1 < '@dy)  '@dir = 0;	// 上
			else if(-'@dx > '@dy * 3) '@dir = 2;	// 左
			else                      '@dir = 1;	// 左上
		}
		set getvariableofnpc('dir,"tiamat_mob#b3_02"), '@dir;
	}
	end;
OnStart:
	hideoffnpc;
	set '@dummy,getmapxy('@map$,'@x,'@y,1,strnpcinfo(0));
	areamonster "2_tiamat_02.gat",'@x-12,'@y-12,'@x+12,'@y+12,"#"+strnpcinfo(1),3855,2,strnpcinfo(0)+"::OnKilled";
	end;
OnFinish:
	hideonnpc;
	killmonster "2_tiamat_02.gat",strnpcinfo(0)+"::OnKilled";
	end;
OnKilled:
	// dummy
	end;
}
2_tiamat_02.gat,29,73,0	duplicate(spe2_01#2_tiamat_02)	spe2_02#2_tiamat_02	139,12,12	/* 1489 (hide)*/
2_tiamat_02.gat,52,49,0	duplicate(spe2_01#2_tiamat_02)	spe2_03#2_tiamat_02	139,12,12	/* 1490 (hide)*/
2_tiamat_02.gat,52,73,0	duplicate(spe2_01#2_tiamat_02)	spe2_04#2_tiamat_02	139,12,12	/* 1491 (hide)*/
2_tiamat_02.gat,29,49,0	script	spe3_01#2_tiamat_02	139,12,12,{/* 1492 (hide)*/
OnTouch:
	//狂乱、死の呪い
	misceffect 532,""; //self
	misceffect 847,""; //self
	misceffect 843,""; //self
	misceffect 729,""; //self
	soundeffect "banshee_die.wav", 0, 0; //1492
	end;
}
2_tiamat_02.gat,29,73,0	duplicate(spe3_01#2_tiamat_02)	spe3_02#2_tiamat_02	139,12,12	/* 1493 (hide)*/
2_tiamat_02.gat,52,49,0	duplicate(spe3_01#2_tiamat_02)	spe3_03#2_tiamat_02	139,12,12	/* 1494 (hide)*/
2_tiamat_02.gat,52,73,0	duplicate(spe3_01#2_tiamat_02)	spe3_04#2_tiamat_02	139,12,12	/* 1495 (hide)*/
2_tiamat_02.gat,29,49,0	script	spe4_01#2_tiamat_02	139,{/* 1496 (hide)*/}
2_tiamat_02.gat,29,73,0	script	spe4_02#2_tiamat_02	139,{/* 1497 (hide)*/}
2_tiamat_02.gat,52,49,0	script	spe4_03#2_tiamat_02	139,{/* 1498 (hide)*/}
2_tiamat_02.gat,52,73,0	script	spe4_04#2_tiamat_02	139,{/* 1499 (hide)*/}
2_tiamat_02.gat,29,49,0	script	spe5_01#2_tiamat_02	139,{/* 1500 (hide)*/}
2_tiamat_02.gat,29,73,0	script	spe5_02#2_tiamat_02	139,{/* 1501 (hide)*/}
2_tiamat_02.gat,52,49,0	script	spe5_03#2_tiamat_02	139,{/* 1502 (hide)*/}
2_tiamat_02.gat,52,73,0	script	spe5_04#2_tiamat_02	139,{/* 1503 (hide)*/}
2_tiamat_02.gat,29,49,0	script	spe6_01#2_tiamat_02	139,{/* 1504 (hide)*/}
2_tiamat_02.gat,29,73,0	script	spe6_02#2_tiamat_02	139,{/* 1505 (hide)*/}
2_tiamat_02.gat,52,49,0	script	spe6_03#2_tiamat_02	139,{/* 1506 (hide)*/}
2_tiamat_02.gat,52,73,0	script	spe6_04#2_tiamat_02	139,{/* 1507 (hide)*/}
2_tiamat_02.gat,29,49,0	script	spe6_05#2_tiamat_02	139,{/* 1508 (hide)*/}
2_tiamat_02.gat,29,73,0	script	spe6_06#2_tiamat_02	139,{/* 1509 (hide)*/}
2_tiamat_02.gat,52,49,0	script	spe6_07#2_tiamat_02	139,{/* 1510 (hide)*/}
2_tiamat_02.gat,52,73,0	script	spe6_08#2_tiamat_02	139,{/* 1511 (hide)*/}
2_tiamat_02.gat,29,49,0	script	open_01#2_tiamat_02	139,{/* 1512 (hide)*/}
2_tiamat_02.gat,29,73,0	script	open_02#2_tiamat_02	139,{/* 1513 (hide)*/}
2_tiamat_02.gat,52,49,0	script	open_03#2_tiamat_02	139,{/* 1514 (hide)*/}
2_tiamat_02.gat,52,73,0	script	open_04#2_tiamat_02	139,{/* 1515 (hide)*/}
//announce "全ての王城の宝箱が開かれ、[神殿B1F 地下宝物庫] の守護天使の亡骸の封印が解かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
