1_tiamat_00.gat,0,0,0	script	#tiamat_start	139,{
OnStart:
//OnClock:
	initnpctimer;
	announce "ティアマト攻城戦が開始されました。参加される方は「プロンテラ深淵(基地[1]～[5])」にお集まりください。", 0;
	end;
OnTimer10000:
	announce "30秒後に王城の中心部への道が開かれます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer15000:
	announce "王女メア : 準備はよろしいですか。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer20000:
	announce "王女メア : 私の力を使って王城に張られている結界の一部を解除し道を繋げます。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer25000:
	announce "王女メア : そこから王城へ向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer30000:
	announce "10秒後に王女メアが王城の中心部への道を開きます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer35000:
	announce "5……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer36000:
	announce "4……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	hideonnpc "area00#r01"; //54
	misceffect 58, "王女メア#1_tiamat_00"; //55
	end;
OnTimer37000:
	announce "3……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 222, "area00#r01"; //54
	end;
OnTimer38000:
	announce "2……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer39000:
	announce "1……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 488, "area00#r01"; //54
	end;
OnTimer40000:
	announce "王城への道が開かれた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	set $@tiamat_main,1;
	hideonnpc "王城入口#0B"; //64
	hideonnpc "王城入口#0C"; //65
	hideonnpc "王城入口#0D"; //66
	hideoffnpc "王城入口#0A"; //63
	misceffect 321, "area00#r01"; //54
	hideoffnpc "area00#r01"; //54
	stopnpctimer;
	end;
}

1_tiamat_00.gat,195,172,3	script	王女メア#1_tiamat_00	10361,{/* 55 */
	donpcevent "#tiamat_start::OnStart";
	end;
}
1_tiamat_00.gat,197,170,3	script	王宮治療術士#1_tiamat_0	641,{/* 56 */}

1_tiamat_00.gat,198,173,3	script	異形の魔人#1_tiamat_00	661,{/* 59 */}
1_tiamat_00.gat,188,171,4	script	四騎士ミルカ#1_tiamat_0	728,{/* 60 */}
1_tiamat_00.gat,189,173,4	script	四騎士ハウンド#1_tiamat	420,{/* 61 */}
1_tiamat_00.gat,186,172,4	script	四騎士ローウェン#1_tiam	416,{/* 62 */}
1_tiamat_00.gat,196,176,1	script	王城入口#0A	835,{/* 63 (hide)*/}
1_tiamat_00.gat,196,176,1	script	王城入口#0B	835,{/* 64 (hide)*/}
1_tiamat_00.gat,196,176,1	script	王城入口#0C	835,{/* 65 (hide)*/}
1_tiamat_00.gat,196,176,1	script	王城入口#0D	835,{/* 66 (hide)*/}
