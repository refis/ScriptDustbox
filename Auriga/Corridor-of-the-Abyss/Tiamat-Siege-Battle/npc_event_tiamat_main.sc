1_tiamat_00.gat,0,0,0	script	#tiamat_start	139,{
OnInit:
	initnpctimer;
	set $@tiamat_main,-1;
	end;
OnStart:
OnTimer2000:
//OnClock1500:
//OnClock2230:
//	initnpctimer;
	set $@tiamat_main,0;
	set $@tiamat_milka,0;
	set $@tiamat_hound,0;
	set $@tiamat_lowen,0;
	donpcevent "#tiamat_inital::OnStart";
	donpcevent "#tiamat_setwall::OnStart";
	donpcevent "tiamat_mob#all::OnStart";
	stopnpctimer "王女メア#pab_base01";
	hideonnpc "王女メア#pab_base01";
	hideonnpc "四騎士ミルカ#pab_base01";
	hideonnpc "四騎士ハウンド#pab_base";
	hideonnpc "四騎士ローウェン#pab_ba";
	hideonnpc "威風堂々たる近衛兵#pab_";
	hideonnpc "物静かな近衛兵#pab_base";
	hideonnpc "重厚なる近衛兵#pab_base";
	hideonnpc "従順なる近衛兵#pab_base";
	hideonnpc "勇ましい近衛兵#pab_base";
	hideonnpc "壮麗なる近衛兵#pab_base";
	hideonnpc "不安そうな近衛兵#pab_ba";
	hideonnpc "気迫に溢れる近衛兵#pab_";
	hideonnpc "血気盛んな近衛兵#pab_ba";
	hideonnpc "生真面目な近衛兵#pab_ba";
	hideonnpc "愛想の良い近衛兵#pab_ba";
	hideonnpc "麗しい近衛兵#pab_base01";
	donpcevent "部隊管理兵#pab_base01::OnStart";
	announce "ティアマト攻城戦が開始されました。参加される方は「プロンテラ深淵(基地[1]～[5])」にお集まりください。", 0;
	end;
OnTimer10000:
	announce "50秒後に王城の中心部への道が開かれます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer20000:
	announce "40秒後に王城の中心部への道が開かれます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer30000:
	announce "30秒後に王城の中心部への道が開かれます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer35000:
	announce "王女メア : 準備はよろしいですか。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer40000:
	announce "王女メア : 私の力を使って王城に張られている結界の一部を解除し道を繋げます。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer45000:
	announce "王女メア : そこから王城へ向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer50000:
	announce "10秒後に王女メアが王城の中心部への道を開きます", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer55000:
	announce "5……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer56000:
	announce "4……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	hideonnpc "area00#r01"; //54
	misceffect 58, "王女メア#1_tiamat_00"; //55
	end;
OnTimer57000:
	announce "3……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 222, "area00#r01"; //54
	end;
OnTimer58000:
	announce "2……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer59000:
	announce "1……", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 488, "area00#r01"; //54
	end;
OnTimer60000:
	stopnpctimer;
	announce "王城への道が開かれた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	set $@tiamat_main,1;
	donpcevent "tiamat_mob#r14::OnStart";
	hideonnpc "王城入口#0B"; //64
	hideonnpc "王城入口#0C"; //65
	hideonnpc "王城入口#0D"; //66
	hideoffnpc "王城入口#0A"; //63
	misceffect 321, "area00#r01"; //54
	hideoffnpc "area00#r01"; //54
	end;
OnMilka:
	announce "四騎士ミルカが次の部屋に進みました", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnHound:
	announce "四騎士ハウンドが次の部屋に進みました", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnLowen:
	announce "四騎士ローウェンが次の部屋に進みました", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
}

3_tiamat_00.gat,0,0,0	script	#tiamat_finish	139,{
OnStart:
//	if($@tiamat_user <= 0)
//		end;
	sleep 15000;
	announce "王女メア : ご協力ありがとうございました。それでは成果を確認しましょう。", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
	sleep 3000;
	announce "=========== 王城ティアマト 探索結果 ===========", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "------------------ 王城地区 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "その他 100% （13 / 13）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "城1F 100% （12 / 12）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "城2F 100% （19 / 19）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "城3F 100% （17 / 17）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "城B1F 100% （7 / 7）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "監獄 100% （10 / 10）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "兵舎1F 83% （5 / 6）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "兵舎2F 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "使用人居住区 100% （6 / 6）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "王女メア : 王城地区 完全踏破。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ 外壁地区 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "塔・南① 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・南② 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・南東 100% （5 / 5）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・南西 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・西 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・東 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・北西 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・北東 100% （5 / 5）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・北① 100% （5 / 5）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "塔・北② 100% （5 / 5）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "城壁 100% （20 / 20）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "王女メア : 外壁地区 完全踏破。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ 教会地区 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "教会1F 100% （6 / 6）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "教会2F 100% （6 / 6）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "鐘楼 100% （6 / 6）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "カタコンベ 100% （11 / 11）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "王女メア : 教会地区 完全踏破。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ 神殿地区 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "神殿1F 100% （8 / 8）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "神殿B1F 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "神殿B2F 100% （2 / 2）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "王女メア : 神殿地区 完全踏破。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ 王城の宝箱 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "第四級 王城の宝箱 100% （108 / 108）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "第三級 王城の宝箱 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "第二級 王城の宝箱 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "第一級 王城の宝箱 100% （4 / 4）", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "王女メア : 王城の宝箱を全て回収しました。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ 王城の守護天使 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<0))
		announce "第22の守護天使 愚者の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r15") > 0)
		announce "第22の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第22の守護天使 愚者の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<1))
		announce "第21の守護天使 世界の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r179") > 0)
		announce "第21の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第21の守護天使 世界の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<2))
		announce "第20の守護天使 審判の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0)
		announce "第20の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第20の守護天使 審判の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<3))
		announce "第19の守護天使 太陽の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r174") > 0)
		announce "第19の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第19の守護天使 太陽の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<4))
		announce "第18の守護天使 月の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r111") > 0)
		announce "第18の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第18の守護天使 月の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<5))
		announce "第17の守護天使 星の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r10") > 0)
		announce "第17の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第17の守護天使 星の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<6))
		announce "第16の守護天使 塔の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r43") > 0)
		announce "第16の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第16の守護天使 塔の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<7))
		announce "第15の守護天使 悪魔の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r128") > 0)
		announce "第15の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第15の守護天使 悪魔の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<8))
		announce "第14の守護天使 節制の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r156") > 0)
		announce "第14の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第14の守護天使 節制の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<9))
		announce "第13の守護天使 死神の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r149") > 0)
		announce "第13の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第13の守護天使 死神の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<10))
		announce "第12の守護天使 吊るされた男の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r140") > 0)
		announce "第12の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第12の守護天使 吊るされた男の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<11))
		announce "第11の守護天使 正義の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r178") > 0)
		announce "第11の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第11の守護天使 正義の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<12))
		announce "第10の守護天使 運命の輪の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r95") > 0)
		announce "第10の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第10の守護天使 運命の輪の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<13))
		announce "第9の守護天使 隠者の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r110") > 0)
		announce "第9の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第9の守護天使 隠者の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<14))
		announce "第8の守護天使 力の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r8") > 0)
		announce "第8の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第8の守護天使 力の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<15))
		announce "第7の守護天使 戦車の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r176") > 0)
		announce "第7の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第7の守護天使 戦車の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<16))
		announce "第6の守護天使 恋人の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r166") > 0)
		announce "第6の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第6の守護天使 恋人の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<17))
		announce "第5の守護天使 法王の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r108") > 0)
		announce "第5の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第5の守護天使 法王の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<18))
		announce "第4の守護天使 皇帝の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r193") > 0)
		announce "第4の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第4の守護天使 皇帝の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<19))
		announce "第3の守護天使 女帝の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r113") > 0)
		announce "第3の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第3の守護天使 女帝の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<20))
		announce "第2の守護天使 女教皇の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r84") > 0)
		announce "第2の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第2の守護天使 女教皇の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<21))
		announce "第1の守護天使 魔術師の化身 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r185") > 0)
		announce "第1の守護天使 ？？？？ 未遭遇", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "第1の守護天使 魔術師の化身 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel) {
		announce "王女メア : 全ての守護天使を討滅しました。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
		areasoundeffect "3_tiamat_00.gat",0,0,100,100,"levelup.wav", 0, 0;	// 0
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	}
	sleep 1000;
	announce "------------------ 王城に棲まう龍 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	if($@tiamat_main >= 3)
		announce "深淵の女王 魔女ジラント 討滅成功 !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else
		announce "深淵の女王 魔女ジラント 討滅失敗…", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_main == 4)
		announce "深淵の女王 古龍ジラント 討滅成功 !!", 0x9, 0x7fffd4, 0x190, 26, 0, 0;
	else
		announce "深淵の女王 古龍ジラント 討滅失敗…", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_main == 4) {
		announce "王女メア : 貴方たちこそ、真の英雄です。", 0x9, 0x00ff00, 0x190, 30, 0, 0;
		emotion 14, "王女メア#3_tiamat_00"; //1537
		areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0; //0
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	}
	sleep 1000;
	announce "------------------ 総合評価 ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	if('@point == 1000) {
		set '@rank$,"SSS";
		set '@effect,410;
	}
	else if('@point >= 950) {
		set '@rank$,"SS";
		set '@effect,83;
	}
	else if('@point >= 900) {
		set '@rank$,"S";
		set '@effect,83;
	}
	else if('@point >= 800) {
		set '@rank$,"A";
		set '@effect,75;
	}
	else if('@point >= 600) {
		set '@rank$,"B";
		set '@effect,440;
	}
	announce "…… "+'@point+"点 !!     ランク : "+'@rank$, 0x9, 0xffffff, 0x190, 26, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"complete.wav", 0, 0;	// 0
	emotion 46,"王女メア#3_tiamat00";	// 1662
	misceffect '@effect,"EF_09#3_tiamat00";	// 1661
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 894,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 899,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 338,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "===============================================", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "王女メア : 以上です。　ご協力感謝いたします。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	sleep 3000;
	announce "王女メア : 報酬は基地にいる「部隊管理兵」よりお受け取りください。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	sleep 7000;
	announce "王女メア : それでは、王城の外までお送りいたします。準備の出来た方から私にお声掛けください。", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	emotion 12,"王女メア#3_tiamat00";	// 1662
	end;
}

3_tiamat_00.gat,154,123,0	script	EF_01#3_tiamat00	139,{/* 1653 (hide)*/}
3_tiamat_00.gat,148,117,0	script	EF_02#3_tiamat00	139,{/* 1654 (hide)*/}
3_tiamat_00.gat,160,117,0	script	EF_03#3_tiamat00	139,{/* 1655 (hide)*/}
3_tiamat_00.gat,142,111,0	script	EF_04#3_tiamat00	139,{/* 1656 (hide)*/}
3_tiamat_00.gat,166,111,0	script	EF_05#3_tiamat00	139,{/* 1657 (hide)*/}
3_tiamat_00.gat,148,105,0	script	EF_06#3_tiamat00	139,{/* 1658 (hide)*/}
3_tiamat_00.gat,160,105,0	script	EF_07#3_tiamat00	139,{/* 1659 (hide)*/}
3_tiamat_00.gat,154,99,0	script	EF_08#3_tiamat00	139,{/* 1660 (hide)*/}
3_tiamat_00.gat,154,111,0	script	EF_09#3_tiamat00	139,{/* 1661 (hide)*/}

3_tiamat_00.gat,157,109,4	script	王女メア#3_tiamat00	10361,{/* 1662 */
	cutin "pab_meer01.bmp", 2;
	mes "[王女メア]";
	mes "ご協力ありがとうございました。";
	mes "王城の外に出られますか？";
	next;
	if(select("話をやめる","外に出たい") == 1) {
		mes "[王女メア]";
		mes "わかりました。";
		mes "外に出る際は改めて";
		mes "私にお声掛けください。";
		close2;
		cutin "pab_meer01.bmp", 255;
		end;
	}
	mes "[王女メア]";
	mes "わかりました。";
	mes "それではお送りいたします。";
	close2;
	misceffect 316,"";	// self
	misceffect 317,"";	// self
	cutin "pab_meer01.bmp", 255;
	warp "pab_base04.gat",338,75;
	end;
}

1_tiamat_00.gat,195,172,3	script	王女メア#1_tiamat_00	10361,{/* 55 */
	if($@tiamat_main == 0) {
		mes "[王女メア]";
		mes "お待ちしておりました。";
		mes "ここが王城へ続く道です。";
	}
	else if($@tiamat_main == 1) {
		mes "[王女メア]";
		mes "王城への道は開かれています。";
		mes "気を引き締めて参りましょう。";
	}
	else if($@tiamat_main == 2) {
		mes "[王女メア]";
		mes "いよいよ魔女との決戦です。";
		mes "どうか、御武運を……。";
	}
	else if($@tiamat_main == 3) {
		mes "[王女メア]";
		mes "……これが最後の戦いとなるでしょう。";
		mes "全てを……貴方に託します。";
	}
	else if($@tiamat_main == 4) {
		unittalk "王女メア : ご協力ありがとうございました。探索の成果を秘密の部屋にて確認しましょう。",1;
		end;
	}
	while(1) {
		next;
		if(select("探索の基本について聞く","やめる") == 2) {
			mes "[王女メア]";
			mes "かしこまりました。";
			mes "何か御用がありましたら";
			mes "いつでもお声掛けください。";
			close;
		}
		mes "[王女メア]";
		mes "探索の基本についてですね。";
		next;
		mes "[王女メア]";
		mes "探索の最終目標は";
		mes "王城の何処かにいる";
		mes "^009eff魔女ジラント^000000を見つけ出し、";
		mes "^009eff完全に滅ぼす^000000ことです。";
		next;
		mes "[王女メア]";
		mes "王城内の各部屋は";
		mes "魔女によって生み出された";
		mes "モンスターによって";
		mes "結界が張られています。";
		next;
		mes "[王女メア]";
		mes "そのため、奥へと進むには";
		mes "^009eff各部屋にいる全てのモンスターを^000000";
		mes "^009eff倒す必要があるでしょう。^000000";
		next;
		mes "[王女メア]";
		mes "また、結界以外にも他の力によって";
		mes "道が閉ざされている場合があります。";
		next;
		mes "[王女メア]";
		mes "そんな時は、別の道を行って";
		mes "道を開くための仕掛けを";
		mes "探してみるのも良いかもしれません。";
		next;
		mes "[王女メア]";
		mes "他に何かお聞きに";
		mes "なりたいことはございますか？";
		continue;
	}
}
1_tiamat_00.gat,197,170,3	script	王宮治療術士#1_tiamat_0	641,{/* 56 */
	mes "[王宮治療術士]";
	mes "体力、気力の回復、";
	mes "状態異常の解除、";
	mes "壊れたアイテムの修理を";
	mes "させて頂きました。";
	mes "倉庫はご利用になられますか？";
	npcskillsupport 28,9999,"王宮治療術士#1_tiamat_0";//ヒール
	misceffect 7,"";
	misceffect 14,"";
	misceffect 492,"";
	percentheal 100,100;
	next;
	switch(select("立ち去る","倉庫")) {
	case 1:
		mes "[王宮治療術士]";
		mes "メア様のことを頼みます。";
		mes "生きて帰ってきてくださいね……。";
		close;
	case 2:
		mes "[王宮治療術士]";
		mes "倉庫ですね";
		mes "　";
		mes "メア様のことを頼みます。";
		mes "生きて帰ってきてくださいね……。";
		close2;
		openstorage;
		end;
	}
}
1_tiamat_00.gat,194,151,3	script	スヴィエ#1_tiamat_00	10274,{/* 57 */
	unittalk "スヴィエ : ガルル……。",1;
	end;
}
1_tiamat_00.gat,190,153,3	script	精鋭近衛兵#1_tiamat_00	418,{/* 58 */
	mes "[精鋭近衛兵]";
	mes "メア様は北にある";
	mes "王城の門の前でお待ちです。";
	next;
	if(select("話をやめる","基地へ帰る") == 1) {
		mes "[精鋭近衛兵]";
		mes "わかりました。";
		mes "またお声かけください。";
		close;
	}
	mes "[精鋭近衛兵]";
	mes "かしこまりました。";
	mes "では、基地に戻りましょう。";
	close2;
	misceffect 316,"";
	misceffect 317,"";
	warp "pab_base01.gat",338,75;
	end;
}
1_tiamat_00.gat,198,173,3	script	異形の魔人#1_tiamat_00	661,{/* 59 */
	if(TIAMAT_WARP <= 0) {
		mes "[異形の魔人]";
		mes "貴方の転送回数は^0000ff三度^000000に";
		mes "なりました。";
		mes "これ以上願いを叶えることはできません。";
		close;
	}
	mes "[異形の魔人]";
	mes "貴方が望まれるのなら";
	mes "^0000ff三度まで^000000城内で作戦中の隊に";
	mes "転送してさし上げましょう。";
	mes "^0000ff残り転送回数 : " +TIAMAT_WARP+ "^000000";
	next;
	switch(select("やめる","ミルカ隊","ハウンド隊","ローウェン隊")) {
	default:
		mes "[異形の魔人]";
		mes "左様ですか。";
		mes "気が変わったらまたお越しください。";
		mes "私の力の範囲内であれば";
		mes "願いを叶えましょう。";
		close;
	case 2:
		set '@num,1000 + $@tiamat_milka;
		set '@name$,"四騎士ミルカ#" + '@num + "_1";
		break;
	case 3:
		set '@num,2000 + $@tiamat_milka;
		set '@name$,"四騎士ハウンド#" + '@num + "_1";
		break;
	case 4:
		set '@num,3000 + $@tiamat_milka;
		set '@name$,"四騎士ローウェン#" + '@num + "_1";
		break;
	}
	set '@dummy,getmapxy('@map$,'@x,'@y,1,'@name$);
	if('@dummy == -1 || '@map$ == "-") {
		mes "[異形の魔人]";
		mes "様子がおかしいですね……。";
		mes "安全のため、もう少し経ってから";
		mes "試してみましょう。";
		close;
	}
	set TIAMAT_WARP,TIAMAT_WARP-1;
	misceffect 316,""; //self
	misceffect 317,""; //self
	misceffect 34,""; //self
	warp '@map$,'@x,'@y;
	end;
}
1_tiamat_00.gat,188,171,4	script	四騎士ミルカ#ex001	728,{/* 60 (hide)*/
	mes "[四騎士ミルカ]";
	mes "突入の準備は良い？";
	mes "私の進行ルートは";
	mes "^0000ff強力なモンスター^000000との";
	mes "激しい戦いになると思うわ。";
	mes "腕に自信があるのなら、私について来て。";
	close;
}
1_tiamat_00.gat,189,173,4	script	四騎士ハウンド#ex001	420,{/* 61 (hide)*/
	mes "[四騎士ハウンド]";
	mes "ここに来るのも久しぶりだな。";
	mes "俺様の進行ルートは";
	mes "^0000ff物理攻撃が効きにくいモンスター^000000との";
	mes "バトルが待ってるぜ。";
	mes "魔法攻撃に自信がある奴ぁ、";
	mes "俺様の部隊に入ってくれ。";
	close;
}
1_tiamat_00.gat,186,172,4	script	四騎士ローウェン#ex001	416,{/* 62 (hide)*/
	mes "[四騎士ローウェン]";
	mes "ご協力感謝いたします、冒険者殿。";
	mes "私の進行ルートは";
	mes "^0000ff魔法攻撃が効きにくいモンスター^000000との";
	mes "連戦になるものと想定されます。";
	mes "物理攻撃に自信がおありでしたら";
	mes "私の隊にお力をお貸しください。";
	close;
}
1_tiamat_01.gat,101,209,1	script	水門①開閉装置#k73CG08	10046,{/* 70 (hide)*/
	unittalk "鍵がかかっている……",1;
	end;
OnStart:
	initnpctimer;
	set 'flag,1;
	unittalk "地下水路の水が急速に引き始めた……";
	hideoffnpc "水門①開閉装置#r73CG08"; //71
	hideonnpc "水門①開閉装置#k73CG08"; //70
	announce "[塔・北①天文台] の水門が閉じられた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_26.gat","[塔・北①天文台] の水門が閉じられた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	areasoundeffect "this",81,169,121,219,"se_water_fall02.wav", 0, 0; //0
	end;
OnTimer3000:
	mapannounce "1_tiamat_26.gat","[城B1F 水路02] の水が引き始めました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	// 先行してるかチェック
	if(getvariableofnpc('flag,"tiamat_mob#r126") == 0) {	// 噴水基部、もう倒してたら水路 02解放
		killmonster "1_tiamat_63.gat","tiamat_mob#r126::OnKilled3";
		misceffect 234, "area#r1264";
		misceffect 406, "area#r1264";
		hideonnpc "area#k1264"; //噴水基部->水路02
		hideoffnpc "area#r1264"; //噴水基部->水路02
	}
	end;
OnTimer6000:
	stopnpctimer;
	if(getvariableofnpc('flag,"水門②開閉装置#k74AG08") == 0)
		mapannounce "1_tiamat_26.gat","[城B1F 水路01] は半分程の水位に減りました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	else {
		mapannounce "1_tiamat_26.gat","[城B1F 水路01] の水も枯れ始めました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {	// 南井戸の底、倒してたら解放
			killmonster "1_tiamat_05.gat","tiamat_mob#r13::OnKilled3";
			misceffect 234, "area#r132";
			misceffect 406, "area#r132";
			hideonnpc "area#k132"; //南井戸の底->水路01
			hideoffnpc "area#r132"; //南井戸の底->水路01
		}
		if(getvariableofnpc('flag,"tiamat_mob#r126") == 0) {	// 噴水基部、倒してたら解放
			killmonster "1_tiamat_63.gat","tiamat_mob#r126::OnKilled2";
			misceffect 234, "area#r1263";
			misceffect 406, "area#r1263";
			hideonnpc "area#k1263"; //噴水基部->水路01
			hideoffnpc "area#r1263"; //噴水基部->水路01
		}
	}
	end;
}
1_tiamat_01.gat,101,209,1	script	水門①開閉装置#r73CG08	10046,{/* 71 */
	unittalk "水門①は閉まっている……。",1;
	end;
}
1_tiamat_02.gat,207,201,4	script	レバー#007_1	10042,{/* 97 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城門②2F] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#204_1")+getvariableofnpc('flag,"レバー#007_1") < 2)	// 待機室2F、城門②2F レバー
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r202") == 0)	{	// バルコニー③
		misceffect 234, "area#r2023";
		misceffect 406, "area#k2023";
		killmonster "1_tiamat_58.gat","tiamat_mob#r202::OnKilled3";
		hideonnpc "area#k2023";
		hideoffnpc "area#r2023";
	}
	mapannounce "1_tiamat_02.gat","「バルコニー③」⇔「謁見の間」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_58.gat","「バルコニー③」⇔「謁見の間」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,281,217,4	script	レバー#106_1	10042,{/* 98 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[兵舎1F 武器庫] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#k32";
	misceffect 234, "area#k34";
	misceffect 234, "area#k35";
	misceffect 234, "area#r1421";
	if(getvariableofnpc('flag,"tiamat_mob#r152") == 0)
		misceffect 234, "area#r1521";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	misceffect 406, "area#k32";
	misceffect 406, "area#k34";
	misceffect 406, "area#k35";
	misceffect 406, "area#k1421";
	killmonster "1_tiamat_29.gat","tiamat_mob#r3::OnKilled3";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled2";
	hideonnpc "area#k32";
	hideonnpc "area#k34";
	hideonnpc "area#k35";
	hideonnpc "area#k1421";
	hideoffnpc "area#r32";
	hideoffnpc "area#r34";
	hideoffnpc "area#r35";
	hideoffnpc "area#r1421";
	if(getvariableofnpc('flag,"tiamat_mob#r152") == 0) {
		misceffect 406, "area#k1521";
		killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled2";
		hideonnpc "area#k1521";
		hideoffnpc "area#r1521";
	}
	announce "「中庭(東)」⇔「ペコ舎」「兵舎1F通路」「使用人居住区・廊下」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,113,215,4	script	レバー#204_1	10042,{/* 99 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[待機室2F] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#204_1")+getvariableofnpc('flag,"レバー#007_1") < 2)	// 待機室2F、城門②2F レバー
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r202") == 0)	{	// バルコニー③
		misceffect 234, "area#r2023";
		misceffect 406, "area#k2023";
		killmonster "1_tiamat_58.gat","tiamat_mob#r202::OnKilled3";
		hideonnpc "area#k2023";
		hideoffnpc "area#r2023";
	}
	mapannounce "1_tiamat_02.gat","「バルコニー③」⇔「謁見の間」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_58.gat","「バルコニー③」⇔「謁見の間」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,271,129,4	script	レバー#206_1	10042,{/* 100 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[塔・北西 2F] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set getvariableofnpc('flag,"#転送19_01"),1;
	set getvariableofnpc('flag,"#転送21_01"),1;
	set getvariableofnpc('flag,"#罠20_04"),1;
	set getvariableofnpc('flag,"#罠21_08"),1;
	announce "「城壁2F01～03」の全てのトラップが解除されました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamattrap#r84	139,{
OnStart:
	initnpctimer;
	announce "城1Fの各ホールに女教皇の使徒が出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamonster "1_tiamat_02.gat",108,10,191,105,"女教皇の使徒",20502,40,strnpcinfo(0)+ "::OnKilled";
	areamonster "1_tiamat_02.gat",236,6,293,61,"女教皇の使徒",20502,20,strnpcinfo(0)+ "::OnKilled";
	areamonster "1_tiamat_02.gat",78,256,103,282,"女教皇の使徒",20502,20,strnpcinfo(0)+ "::OnKilled";
	areamonster "1_tiamat_20.gat",160,264,185,285,"女教皇の使徒",20502,20,strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer10000:
	initnpctimer;
	donpcevent "守護天使の亡骸#r84::OnHeal";
	end;
OnKilled:
	set '@count,getmapmobs("1_tiamat_02.gat","tiamattrap#r84::OnKilled") + getmapmobs("1_tiamat_20.gat","tiamattrap#r84::OnKilled");
	if('@count <= 0) {
		stopnpctimer;
	}
	end;
}
1_tiamat_02.gat,149,104,4	script	フルーレティ#r84	844,{/* 103 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<1);
	announce "第2の守護天使 女教皇の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	killmonster "1_tiamat_02.gat","tiamattrap#r84::OnKilled";
	killmonster "1_tiamat_20.gat","tiamattrap#r84::OnKilled";
	misceffect 234, "area#r841"; //80
	if(getmapmobs("1_tiamat_50.gat","tiamat_mob#r2::OnKilled") == 0) {	//中庭(中央)討伐済み
		misceffect 234, "area#r22"; //80
		misceffect 234, "area#r24"; //80
	}
	end;
OnTimer3000:
	misceffect 406, "area#r841"; //80
	hideonnpc "area#k841";
	hideoffnpc "area#r841";
	killmonster "1_tiamat_02.gat","tiamat_mob#r84::OnKilled2";
	if(getmapmobs("1_tiamat_50.gat","tiamat_mob#r2::OnKilled") == 0) {	//中庭(中央)討伐済み
		misceffect 406, "area#r22"; //80
		misceffect 406, "area#r24"; //80
		hideonnpc "area#k22";
		hideonnpc "area#k24";
		hideoffnpc "area#r22";
		hideoffnpc "area#r24";
		killmonster "1_tiamat_50.gat","tiamat_mob#r2::OnKilled2";
	}
	announce "「大ホール」⇔「待合室③」、「中庭(中央)」⇔「中庭(北)」「中庭(東)」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_02.gat,149,104,4	script	守護天使の亡骸#r84	802,{/* 104 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r84"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r84"; //496
	misceffect 668, "守護天使の亡骸#r84"; //496
	announce "？？？？ : 無礼者め。ここはジラント様の居城ぞ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "フルーレティ#r84",20471;
	hideoffnpc "フルーレティ#r84"; //495
	misceffect 1065, "フルーレティ#r84"; //495
	misceffect 1019, "フルーレティ#r84"; //495
	announce "何者かの声が部屋中に響き、[城1F 大ホール] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_02.gat",134,89,164,119,"123";
	end;
OnTimer9000:
	misceffect 903, "フルーレティ#r84"; //495
	announce "フルーレティ : 道理のわからぬ者は闇に沈めてくれよう。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "フルーレティ#r84"; //495
	setnpcdisplay "フルーレティ#r84",844;
	donpcevent "tiamattrap#r84::OnStart";
	set 'mob,callmonster("this",149,104,"女教皇の化身",20471,"tiamat_mob#r84::OnKilled3");
	set 'mobmaxhp,getmobhp('mob);
	end;
OnHeal:
	set '@count,getmapmobs("1_tiamat_02.gat","tiamattrap#r84::OnKilled") + getmapmobs("1_tiamat_20.gat","tiamattrap#r84::OnKilled");
	if('@count > 0 && 'mob) {
		announce "「女教皇の使徒」の祈りにより「女教皇の化身」のHPが回復した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		set '@heal,'mobmaxhp / 100 * '@count;
		set '@mobhp,getmobhp('mob) + '@heal;
		if('@mobhp > 'mobmaxhp)
			set '@mobhp,'mobmaxhp;
		setmobhp 'mob,'@mobhp;
	}
	end;
OnKilled:
	set 'mob,0;
	end;
}
1_tiamat_02.gat,128,136,4	script	第1の騎士像#96	10046,{/* 105 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第1の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
//123656#ティアマト攻城戦　筋肉疲労#HT_CLAYMORETRAP#JP_Q_TIME#
//「円卓の間」にある彫像の頭部を力いっぱい動かした#
//彫像の操作から5分経つと再度操作が可能になる。#

//announce "[城2F 円卓の間] の第1の騎士像を冒険者「」が北東に向けました", 0x1, 0x00ebff, 0x190, 30, 0, 0;
//announce "[城2F 円卓の間] の第1の騎士像から光が発せられ、頭部が動かなくなった", 0x1, 0xffff00, 0x190, 30, 0, 0;
//announce "[城2F 円卓の間] の全ての騎士像が光を放ち、[城2F 謁見の間]の守護天使の亡骸の封印が解かれました", 0x1, 0xffff00, 0x190, 30, 0, 0;
}
1_tiamat_02.gat,134,136,4	script	第2の騎士像#96	10046,{/* 106 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第2の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,140,136,4	script	第3の騎士像#96	10046,{/* 107 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第3の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,146,136,4	script	第4の騎士像#96	10046,{/* 108 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第4の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,152,136,4	script	第5の騎士像#96	10046,{/* 109 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第5の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,158,136,4	script	第6の騎士像#96	10046,{/* 110 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第6の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,164,136,4	script	第7の騎士像#96	10046,{/* 111 (hide)*/
	//TODO
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第7の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
	//announce "[城2F 円卓の間] の第7の騎士像から光が発せられ、頭部が動かなくなった", 0x9, 0xffff00, 0x0190, 30, 0, 0;
}
1_tiamat_02.gat,170,136,4	script	第8の騎士像#96	10046,{/* 112 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 立派な騎士の彫像だ。　しかし、ここからでは手が届かない……。",1;
	else {
		mes "‐今にも動き出しそうな";
		mes "　騎士の彫像だ‐";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "‐彫像の頭部を力一杯回して";
				mes "　受けたダメージが回復していない‐";
				mes "　^ff0000利用可能になる時間は";
				mes "　クエストウィンドウで確認できます^000000";
				close;
			}
			mes "‐どうやら彫像は";
			mes "　頭部が動きそうだ‐";
			mes "　";
			mes "　^ff0000※一度頭部の向きを動かすと、";
			mes "　　動かしたキャラクターでは";
			mes "　　5分経つまでは彫像を";
			mes "　　動かすことができません^000000";
			next;
			switch(select("少し考える","北西に向ける","北に向ける","北東に向ける","南西に向ける","南に向ける","南東に向ける")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[城2F 円卓の間] の第8の騎士像を冒険者「"+strcharinfo(0)+"」が北東に向けました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "何も起こらなかった……",1;	// 1297
		close;
	}
}
1_tiamat_03.gat,113,248,5	script	転移の石碑#k421	406,{/* 132 */
	mes "^0000ff‐認証エラー";
	mes "　登録のない者は転移機能を";
	mes "　利用できません‐^000000";
	close;
OnStart:
	initnpctimer;
	unittalk "認証エラー　登録のない者は転移機能を利用できません";
	end;
OnTimer1000:
	emotion 9, "四騎士ハウンド#207_1"; //1802
	end;
OnTimer2000:
	emotion 9, "四騎士ハウンド#207_1"; //1802
	end;
OnTimer3000:
	emotion 9, "四騎士ハウンド#207_1"; //1802
	end;
OnTimer4000:
	emotion 6, "四騎士ハウンド#207_1"; //1802
	end;
OnTimer5000:
	emotion 6, "四騎士ハウンド#207_1"; //1802
	end;
OnTimer6000:
	emotion 6, "四騎士ハウンド#207_1"; //1802
	end;
OnTimer8000:
	announce "四騎士ハウンド : ここは俺様に任せろ！　おらぁぁぁっ！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 328, "四騎士ハウンド#207_1"; //1794
	end;
OnTimer12000:
	misceffect 722, "転移の石碑#k421"; //474
	end;
OnTimer14000:
	misceffect 234, "転移の石碑#r421"; //474
	misceffect 94, "転移の石碑#r421"; //474
	hideonnpc "転移の石碑#k421"; //132
	hideoffnpc "転移の石碑#r421"; //133
	announce "塔・南エリアの全ての転移の石碑の全ての機能が使用可能になりました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	killmonster "this","tiamat_mob#r42::OnKilled2";
	end;
OnTimer18000:
	announce "四騎士ハウンド : へっ！　機械は物理で殴るに限る。よし、進むぞ！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer21000:
	stopnpctimer;
	hideonnpc "四騎士ハウンド#207_1"; //1802
	hideoffnpc "四騎士ハウンド#2010_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,10;
	end;
}
1_tiamat_03.gat,113,248,5	script	転移の石碑#r421	406,{/* 133 (hide)*/
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	next;
	mes "‐転移先を選んでください‐";
	mes "　";
	mes "現在地 : 塔・南②屋上";
	next;
	switch(select("やめる","塔・南東B1F","塔・南東1F","塔・南東2F","塔・南東3F","塔・南東屋上")) {
	case 1:
		close;
	case 2:
		warp "1_tiamat_19.gat",27,24;	//塔・南東B1F
		end;
	case 3:
		warp "1_tiamat_16.gat",60,47;	//塔・南東1F
		end;
	case 4:
		warp "1_tiamat_17.gat",60,38;	//塔・南東2F
		end;
	case 5:
		warp "1_tiamat_18.gat",49,41;	//塔・南東3F
		end;
	case 6:
		warp "1_tiamat_03.gat",200,346;	//塔・南東屋上
		end;
	}
}
1_tiamat_03.gat,199,350,5	script	転移の石碑#k471	406,{/* 134 (hide)*/
	mes "^0000ff‐認証エラー";
	mes "　登録のない者は転移機能を";
	mes "　利用できません‐^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "認証エラー　登録のない者は転移機能を利用できません";
	end;
OnTimer4000:
	announce "四騎士ハウンド : これも同じだな…。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : 考えても仕方ねえし、無理やり起動だ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "四騎士ハウンド#206_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "転移の石碑#k471"; //474
	end;
OnTimer12000:
	misceffect 794, "転移の石碑#k471"; //474
	announce "[塔・南東 屋上]の警報装置が作動しました　侵入者を排除します", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "転移の石碑#e471"; //475
	hideonnpc "転移の石碑#k471"; //474
	donpcevent "転移の石碑#e471::OnStart";
	announce "四騎士ハウンド : さ、手早く済ませようぜ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r47::OnKilled2";
	end;
}
1_tiamat_03.gat,199,350,5	script	転移の石碑#e471	406,{/* 135 (hide)*/
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	mes "　";
	mes "　^0000ffエネルギー充填率 : " +'energy+ "%^000000";
	next;
	if(select("^0000ff全身全霊で^000000エネルギーを注ぐ","立ち去る") == 2) {
		mes "‐あなたは石碑から";
		mes "　手を放した‐";
		close;
	}
	mes "‐転移の石碑にエネルギーを";
	mes "　注入しています‐";
	mes "　";
	mes "　^0000ff※攻撃を受けたり、移動を試みると";
	mes "　　動作が停止します。^000000";
	set '@time,80 - (readparam(bStr)/5) - (readparam(bInt)/5) - (readparam(bDex)/5);
	if('@time < 1) set '@time,1;
	misceffect 178,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "転移の石碑#e471"; //475
		percentheal -10,-10;
		announce "[塔・南東 屋上] の転移の石碑に冒険者「" +strcharinfo(0)+ "」がエネルギーを注ぎました　＜充填率" +'energy+ "%＞", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "転移の石碑#r471"; //476
	hideonnpc "転移の石碑#e471"; //475
	misceffect 234, "転移の石碑#r471"; //476
	misceffect 94, "転移の石碑#r471"; //476
	announce "[塔・南東 屋上]の転移の石碑がオーバーロードし、一部機能が使用可能になりました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : よし、先に進むぞ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "四騎士ハウンド#206_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "四騎士ハウンド#2009_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,9;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",185,326,214,343,"魔女のしもべ",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",185,326,214,343,"魔女のしもべ",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_03.gat,199,350,5	script	転移の石碑#r471	406,{/* 136 */
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	next;
	mes "‐転移先を選んでください‐";
	mes "　";
	mes "現在地 : 塔・南東屋上";
	next;
	if($@tiamat_hound < 10) {
		switch(select("やめる","^888888塔・南東B1F^000000","^888888塔・南東1F^000000","^888888塔・南東3F^000000","^888888塔・南東3F^000000","塔・南②屋上")) {
		default:
		case 1:
			close;
		case 6:
			warp "1_tiamat_03.gat",108,248;
			end;
		}
	}
	else {
		switch(select("やめる","塔・南東B1F","塔・南東1F","塔・南東2F","塔・南東3F","塔・南②屋上")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//塔・南東B1F
			end;
		case 3:
			warp "1_tiamat_16.gat",60,47;	//塔・南東1F
			end;
		case 4:
			warp "1_tiamat_17.gat",60,38;	//塔・南東2F
			end;
		case 5:
			warp "1_tiamat_18.gat",49,41;	//塔・南東3F
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//塔・南②屋上
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "転移の石碑#r471"; //476
	end;
}
1_tiamat_03.gat,104,263,4	script	レバー#108_1	10042,{/* 137 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[塔・南東 屋上] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled3";
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled4";
	misceffect 234, "area#r461";
	misceffect 234, "area#r462";
	misceffect 406, "area#r461";
	misceffect 406, "area#r462";
	hideonnpc "area#k461"; //1258
	hideonnpc "area#k462"; //1258
	hideoffnpc "area#r461"; //1258
	hideoffnpc "area#r462"; //1258
	announce "「塔・南東3F」⇔「城壁通路02」「城壁通路04」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}

1_tiamat_04.gat,21,51,4	script	レバー#205_1	10042,{/* 155 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[神殿通路1F02] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getmapmobs("1_tiamat_04.gat","tiamat_mob#r183::OnKilled") == 0) {	//神殿通路1F02討伐済み
		killmonster "1_tiamat_04.gat","tiamat_mob#r183::OnKilled2";
		misceffect 234, "area#r1831";
		misceffect 406, "area#r1831";
		hideonnpc "area#k1831"; //1258
		hideoffnpc "area#r1831"; //1258
	}
	if(getmapmobs("1_tiamat_54.gat","tiamat_mob#r162::OnKilled") == 0) {	//教会1F通路01討伐済み
		killmonster "1_tiamat_54.gat","tiamat_mob#r162::OnKilled3";
		misceffect 234, "area#r1624";
		misceffect 406, "area#r1624";
		hideonnpc "area#k1624"; //1258
		hideoffnpc "area#r1624"; //1258
	}
	announce "「神殿通路1F02」⇔「教会1F通路01」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}

1_tiamat_04.gat,142,194,4	script	サルガタナス#r181	844,{/* 157 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<19);
	announce "第20の守護天使 審判の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_04.gat,142,194,4	script	守護天使の亡骸#r181	802,{/* 158 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r181"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r181"; //496
	misceffect 668, "守護天使の亡骸#r181"; //496
	announce "？？？？ : 汝の罪は死によって贖われるであろう。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "サルガタナス#r181",20477;
	hideoffnpc "サルガタナス#r181"; //495
	misceffect 1065, "サルガタナス#r181"; //495
	misceffect 1019, "サルガタナス#r181"; //495
	announce "何者かの声が部屋中に響き、[神殿1F 王の墓] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_04.gat",132,184,152,204,"123";
	end;
OnTimer9000:
	misceffect 903, "サルガタナス#r181"; //495
	announce "サルガタナス : 判決はすでに下された。これより刑を執行する。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "サルガタナス#r181"; //495
	setnpcdisplay "サルガタナス#r181",844;
	monster "this",142,194,"審判の化身",20477,1,"tiamat_mob#r181::OnKilled3";
	end;
}
1_tiamat_04.gat,139,200,4	script	王女メア#1_tiamat_04	10361,{/* 159 (hide)*/
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer3000:
	if($@tiamat_milka >= 34 && $@tiamat_hound >= 51 && $@tiamat_lowen >= 33) {
		stopnpctimer;
		announce "四騎士ローウェン : 姫様、結界を解く鍵が揃いました。我らにお任せください。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		sleep 3000;
		announce "四騎士ハウンド : 奇妙な仕掛けばっかで、ほんと苦労したぜ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		sleep 3000;
		announce "四騎士ミルカ : ジラントを討ち倒すチャンスです。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		sleep 3000;
		announce "王家の種を植えた鉢に水を注ぐとみるみるうちに成長し、花が咲いた", 0x9, 0xffffff, 0x190, 20, 0, 0;
		sleep 3000;
		announce "[神殿1F 王の墓] に「四騎士」が「王家の花」を捧げました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		misceffect 58, "四騎士ミルカ#1036_1"; //1862
		misceffect 58, "四騎士ハウンド#2051_1"; //1926
		misceffect 58, "四騎士ローウェン#3033_1"; //1981
		sleep 1000;
		misceffect 40, "四騎士ミルカ#1036_1"; //1862
		misceffect 40, "四騎士ハウンド#2051_1"; //1926
		misceffect 40, "四騎士ローウェン#3033_1"; //1981
		sleep 1000;
		misceffect 83, "area#r1812"; //145
		sleep 2000;
		misceffect 90, "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled4";
		hideonnpc "area#k1812"; //154
		hideonnpc "王女メア#1_tiamat_04"; //159
		hideoffnpc "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled2";
		announce "「神殿1F 王の墓」⇔「教会1F通路01」の結界が解けました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		sleep 3000;
		announce "残り時間は後僅かです。魔女のもとに向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		end;
	}
	switch('flag) {
	case 0:
		announce "王女メア : 地下に続く階段に強力な封印が施されているようです。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		initnpctimer;
		break;
	case 1:
		announce "王女メア : 封印の解除を行いますが、これだけの結界…かなりの時間がかかるかもしれません……。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		initnpctimer;
		break;
	case 2:
		misceffect 58, "王女メア#1_tiamat_04"; //159
		announce "[神殿1F 王の墓] の結界解除まで後30分……", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 62:
		misceffect 58, "王女メア#1_tiamat_04"; //159
		announce "[神殿1F 王の墓] の結界解除まで後20分……", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 122:
		misceffect 58, "王女メア#1_tiamat_04"; //159
		announce "[神殿1F 王の墓] の結界解除まで後10分……", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 176:
		misceffect 58, "王女メア#1_tiamat_04"; //159
		announce "[神殿1F 王の墓] の結界解除まで後1分……", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 182:
		stopnpctimer;
		misceffect 83, "area#r1812"; //145
		sleep 2000;
		misceffect 90, "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled4";
		hideonnpc "area#k1812"; //154
		hideonnpc "王女メア#1_tiamat_04"; //159
		hideoffnpc "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled2";
		announce "「神殿1F 王の墓」⇔「教会1F通路01」の結界が解けました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		sleep 3000;
		announce "残り時間は後僅かです。魔女のもとに向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		end;
	default:
		misceffect 58, "王女メア#1_tiamat_04"; //159
		break;
	}
	set 'flag,'flag+1;
	end;
OnTimer5000:
	misceffect 234, "area#r1812"; //145
	end;
OnTimer7000:
	misceffect 782, "area#r1812"; //145
	end;
OnTimer10000:
	initnpctimer;
	end;
}
1_tiamat_06.gat,187,48,4	script	ネビロス#r140	844,{/* 191 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<11);
	announce "第12の守護天使 吊るされた男の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	stopnpctimer;
	announce "[監獄 看守部屋] のレバーの鍵が開いた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	killmonster "1_tiamat_25.gat","tiamat_mob#r132::OnKilled2";
	end;
}
1_tiamat_06.gat,187,48,4	script	守護天使の亡骸#r140	802,{/* 192 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r140"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r140"; //496
	misceffect 668, "守護天使の亡骸#r140"; //496
	announce "？？？？ : ああ……面倒だ……面倒だ……", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ネビロス#r140",20474;
	hideoffnpc "ネビロス#r140"; //495
	misceffect 1065, "ネビロス#r140"; //495
	misceffect 1019, "ネビロス#r140"; //495
	announce "何者かの声が部屋中に響き、[監獄 拷問部屋] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_06.gat",172,33,202,63,"123";
	end;
OnTimer9000:
	misceffect 903, "ネビロス#r140"; //495
	announce "ネビロス : 侵入者を血祭りにあげるのは面倒なんだ……知ってるか？", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ネビロス#r140"; //495
	setnpcdisplay "ネビロス#r140",844;
	monster "this",187,48,"吊るされた男の化身",20474,1,"tiamat_mob#r140::OnKilled2";
	end;
}
1_tiamat_07.gat,15,128,4	script	ルシフェル#r185	844,{/* 200 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<0);
	announce "第1の守護天使 魔術師の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_07.gat,15,128,4	script	守護天使の亡骸#r185	802,{/* 201 (hide)*/
	if(getmapmobs("this","tiamat_mob#r185::OnKilled2")) {
		unittalk getcharid(3),"亡骸に封印が施されている…… どこかに解除する仕掛けがあるようだ",1;
		end;
	}
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r185"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r185"; //496
	misceffect 668, "守護天使の亡骸#r185"; //496
	announce "？？？？ : ジラント様の聖なる居城に踏み入るとは愚かな……", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ルシフェル#r185",20470;
	hideoffnpc "ルシフェル#r185"; //495
	misceffect 1065, "ルシフェル#r185"; //495
	misceffect 1019, "ルシフェル#r185"; //495
	announce "何者かの声が部屋中に響き、[神殿B1F 地下宝物庫] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_07.gat",5,118,25,138,"123";
	end;
OnTimer9000:
	misceffect 903, "ルシフェル#r185"; //495
	announce "ルシフェル : 死者の国で自らの軽率な行いを悔いるが良い！", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ルシフェル#r185"; //495
	setnpcdisplay "ルシフェル#r185",844;
	monster "this",15,128,"魔術師の化身",20470,1,"tiamat_mob#r185::OnKilled3";
	end;
}
1_tiamat_08.gat,208,301,1	script	デヒョン像#k37CG03	10278,{/* 272 (hide)*/
	unittalk "反応がない…ただの彫像のようだ……";
	end;
}
1_tiamat_08.gat,208,301,1	script	デヒョン像#r37CG03	10278,{/* 273 (hide)*/
	setarray '@str$[1],"魔術師","女教皇","女帝","皇帝","法王","恋人","戦車","力","隠者";
	unittalk "われが司るは「ソード」、示すは「" +'@str$['flag]+ "」";
	end;
OnStart:
	unittalk "「デヒョン像」が利用可能になりました";
	set 'flag,getvariableofnpc('CG03,"グローザ像#r16CG02");
	end;
}
1_tiamat_08.gat,180,179,5	script	ヒュリエル像#k50CG04	10279,{/* 274 (hide)*/
	unittalk "反応がない…ただの彫像のようだ……";
	end;
}
1_tiamat_08.gat,180,179,5	script	ヒュリエル像#r50CG04	10279,{/* 275 */
	setarray '@str$[1],"魔術師","女教皇","女帝","皇帝","法王","恋人","戦車","力","隠者";
	unittalk "われが司るは「ワンド」、示すは「" +'@str$['flag]+ "」";
	end;
OnStart:
	unittalk "「ヒュリエル像」が利用可能になりました";
	set 'flag,getvariableofnpc('CG04,"グローザ像#r16CG02");
	end;
}
1_tiamat_08.gat,207,385,2	script	カデス像#k71CG06	10277,{/* 276 (hide)*/
	unittalk "反応がない…ただの彫像のようだ……";
	end;
}
1_tiamat_08.gat,207,385,2	script	カデス像#r71CG06	10277,{/* 277 */
	setarray '@str$[1],"魔術師","女教皇","女帝","皇帝","法王","恋人","戦車","力","隠者";
	unittalk "われが司るは「カップ」、示すは「" +'@str$['flag]+ "」";
	end;
OnStart:
	unittalk "「カデス像」が利用可能になりました";
	set 'flag,getvariableofnpc('CG06,"グローザ像#r16CG02");
	end;
}
1_tiamat_09.gat,79,40,4	script	レバー#006_1	10042,{/* 337 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		if(getvariableofnpc('flag,"レバー#006_2")+getvariableofnpc('flag,"レバー#006_3") == 2)
			initnpctimer;
		announce "[待合室①] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r80::OnKilled2";
	misceffect 234, "area#r803";
	misceffect 406, "area#r803";
	hideonnpc "area#k803"; //1258
	hideoffnpc "area#r803"; //1258
	mapannounce "1_tiamat_42.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_09.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_43.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_09.gat,219,55,4	script	レバー#006_2	10042,{/* 338 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		if(getvariableofnpc('flag,"レバー#006_1")+getvariableofnpc('flag,"レバー#006_3") == 2)
			initnpctimer;
		announce "[待合室②] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r80::OnKilled2";
	misceffect 234, "area#r803";
	misceffect 406, "area#r803";
	hideonnpc "area#k803"; //1258
	hideoffnpc "area#r803"; //1258
	mapannounce "1_tiamat_42.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_09.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_43.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_10.gat,106,109,1	script	鐘#r174CG09	10044,{/* 348 */
	if('flag == 0) {
		unittalk getcharid(3),strcharinfo(0)+" : 釣鐘は完成している。",1;
		end;
	}
	if(countitem(25362) <= 0) {
		unittalk getcharid(3),"釣鐘が設置できそうな鐘楼がある……",1;
		end;
	}
	mes "‐「釣鐘の部品」を";
	mes "　鐘楼に設置しますか？‐";
	mes "　";
	mes "　^ff0000釣鐘の完成まで後" +'flag+ "個^000000";
	next;
	if(select("少し考える","設置する") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	delitem 25362,1;
	if('flag > 0) {
		unittalk getcharid(3),strcharinfo(0)+" : 鐘楼に「釣鐘の部品」を設置した",1;
		set 'flag,'flag - 1;
		misceffect 154,"鐘#r174CG09";
		if('flag <= 0) {
			initnpctimer;
		}
	}
	close;
OnTimer10000:
	announce "城内に3体の魔獣の気配がした", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
OnTimer13000:
	announce "王城の魔獣（マジックビースト）が[城壁通路03] に出現しました", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
OnTimer14000:
	announce "王城の魔獣（シューターデーモン）が[城1F 小ホール②] に出現しました", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
OnTimer15000:
	stopnpctimer;
	announce "王城の魔獣（ブロールホース）が[教会1F 礼拝堂] に出現しました", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
announce "王城の魔獣が全て倒され、[神殿B1F 神殿B1通路] ⇔ [神殿B1F 地下宝物庫] の扉の封印が解かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
OnStart:
	set 'flag,20;
	end;
}
1_tiamat_10.gat,106,109,1	script	鐘#k174CG09	10044,{/* 349 (hide)*/
	unittalk getcharid(3),strcharinfo(0)+" : 鐘に封印が施されている……　どこかに解除する仕掛けがあるようだ";
	end;
}
1_tiamat_10.gat,83,98,4	script	アイニ#r174	844,{/* 350 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<18);
	announce "第19の守護天使 太陽の化身身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	misceffect 234, "鐘#r174CG09"; //348
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 406, "鐘#r174CG09"; //348
	hideoffnpc "鐘#r174CG09"; //348
	hideonnpc "鐘#k174CG09"; //349
	donpcevent "鐘#r174CG09::OnStart";
	announce "「鐘」の封印が解け、「釣鐘の部品」の設置ができるようになりました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_10.gat,83,98,4	script	守護天使の亡骸#r174	802,{/* 351 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r174"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r174"; //496
	misceffect 668, "守護天使の亡骸#r174"; //496
	announce "？？？？ : ここまで来るとは、人間のくせにやるではないか。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "アイニ#r174",20476;
	hideoffnpc "アイニ#r174"; //495
	misceffect 1065, "アイニ#r174"; //495
	misceffect 1019, "アイニ#r174"; //495
	announce "何者かの声が部屋中に響き、[鐘楼 屋上] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_10.gat",63,78,103,118,"123";
	end;
OnTimer9000:
	misceffect 903, "アイニ#r174"; //495
	announce "アイニ : 少しは楽しめそうだ。簡単にくたばってくれるなよ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "アイニ#r174"; //495
	setnpcdisplay "アイニ#r174",844;
	monster "this",83,98,"太陽の化身",20476,1,"tiamat_mob#r174::OnKilled2";
	end;
}
1_tiamat_11.gat,225,64,1	script	深淵の女神像#200	10046,{/* 357 */
	mes "‐薄汚れた女神像がある……‐";
	if(checkquest(123655))
		close;
	next;
	if(select("祈りを捧げる","立ち去る") == 2) {
		mes "‐あなたは立ち去った‐";
		close;
	}
//	if(!checksit())
//		setsit 1;
	progressbar 5; //color=0x00ff00
	misceffect 91,""; //self
	setquest 123655; //state=1
	mes "‐貴方は祈りを捧げた……";
	mes "　祈りを終え、見上げると";
	mes "　女神像が少し";
	mes "　微笑んでいるように見えた……‐";
	close;
}
1_tiamat_12.gat,11,235,1	script	裂け目#r133CG09	550,{/* 384 */
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : 裂け目が見えるが、ここからでは手が届かない……。",1;
	else {
		mes "誰かが掘ったのであろう";
		mes "何とか人が通れそうな";
		mes "血の跡が付いた裂け目がある。";
		mes "裂け目は城の外へと";
		mes "続いていそうだ………";
		next;
		if(select("少し考える","城の外へと出る") == 1) {
			mes "‐あなたは立ち去った‐";
			close;
		}
		mes "裂け目に体をねじ込み";
		mes "進んで行った………";
		close2;
		misceffect 334,""; //self
		misceffect 34,""; //self
		warp "1_tiamat_00.gat",225,159;
	}
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "裂け目#r133CG09"; //384
	end;
}
1_tiamat_12.gat,125,66,4	script	レバー#202_1	10042,{/* 385 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城壁2F04] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	killmonster "1_tiamat_08.gat","tiamat_mob#r53::OnKilled3";
	misceffect 234, "area#r533";
	misceffect 406, "area#r533";
	hideonnpc "area#k533"; //1258
	hideoffnpc "area#r533"; //1258
	announce "「塔・西2F」⇔「城壁2F03」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_12.gat,172,38,0	script	#転送19_01	139,1,1,{/* 387 (hide)*/
	showmessage "ウアアアアアアアアアアッ!!!!","";
	misceffect 729,""; //self
	misceffect 34,""; //self
	if(!sleep2(2000)) end;
	warp "1_tiamat_12.gat",8,228;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 36; //393
	misceffect 34; //393
	end;
}
1_tiamat_12.gat,168,42,0	duplicate(#転送19_01)	#転送19_02	139,1,1	/* 388 (hide)*/
1_tiamat_12.gat,160,29,0	duplicate(#転送19_01)	#転送19_03	139,1,1	/* 389 (hide)*/
1_tiamat_12.gat,142,34,0	duplicate(#転送19_01)	#転送19_04	139,1,1	/* 390 (hide)*/
1_tiamat_12.gat,124,29,0	duplicate(#転送19_01)	#転送19_05	139,1,1	/* 391 (hide)*/
1_tiamat_12.gat,103,31,0	duplicate(#転送19_01)	#転送19_06	139,1,1	/* 392 (hide)*/
1_tiamat_12.gat,234,58,0	duplicate(#転送19_01)	#転送20_01	139,1,1	/* 393 (hide)*/
1_tiamat_12.gat,223,69,0	duplicate(#転送19_01)	#転送20_02	139,1,1	/* 394 (hide)*/
1_tiamat_12.gat,222,84,0	duplicate(#転送19_01)	#転送20_03	139,1,1	/* 395 (hide)*/
1_tiamat_12.gat,234,50,0	script	#罠20_04	139,1,1,{/* 396 (hide)*/
	if(strnpcinfo(0) != "#罠20_05")
		pushpc 4,7;
	else
		pushpc 6,10;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 17; //393
	misceffect 69; //393
	end;
}
1_tiamat_12.gat,234,70,0	duplicate(#罠20_04)	#罠20_05	139,1,1	/* 397 (hide)*/
1_tiamat_12.gat,222,78,0	duplicate(#罠20_04)	#罠20_06	139,1,1	/* 398 (hide)*/
1_tiamat_12.gat,19,229,1	script	血の祭壇#r133	10045,{/* 399 (hide)*/
	if(distance(getcharid(3)) > 5) {
		unittalk getcharid(3),strcharinfo(0)+" : 祭壇が見えるが、ここからでは手が届かない……。",1;
	}
	misceffect 9,""; //self
	mes "‐祭壇に手をかざすと";
	mes "　頭の中に声が響いた‐";
	next;
	mes "[？？？？]";
	mes "汝らの血を捧げよ……";
	next;
	if(select("少し考える","血を捧げる") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	set '@num,substr(strnpcinfo(2),3,1);
	set '@num,'@num-3;
	setarray '@str$,"①","②","③","④","⑤","⑥","⑦";
	initnpctimer;
	hideonnpc; //404
	set 'flag,'flag | (1 << '@num);
	misceffect 179; //404
	misceffect 407; //404
	misceffect 372,""; //self
	misceffect 378,""; //self
	//sc_start EFST_ABYSS_001,300000,1;	//死の呪い : 3秒毎に10kダメージ、ダメージパケ無、HP0で死亡しない
	soundeffect "banshee_die.wav", 0, 0; //0
	announce "[監獄 地下牢" +'@str$['@num]+ "] の血の祭壇に冒険者「" +strcharinfo(0)+ "」を生き血で満たしました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	close;
OnTimer5000:
	if('flag == 0x7F) {
		set 'flag,0xFF;
		announce "全ての祭壇に血が捧げられ、[監獄 拷問部屋] の守護天使の亡骸の封印が解かれました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		hideoffnpc "守護天使の亡骸#r140";
	}
	end;
OnTimer40000:
	stopnpctimer;
	if('flag == 0xFF)
		end;
	set '@num,substr(strnpcinfo(2),3,1);
	set '@num,'@num-3;
	setarray '@str$,"①","②","③","④","⑤","⑥","⑦";
	set 'flag,'flag&~(1 << '@num);
	announce "[監獄 地下牢" +'@str$['@num]+ "] の血の祭壇の血が失われました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	hideoffnpc; //404
	end;
OnStart:
	set 'flag,0;
	hideoffnpc;
	end;
}
1_tiamat_12.gat,42,235,4	duplicate(血の祭壇#r133)	血の祭壇#r134	10045	/* 400 (hide)*/
1_tiamat_12.gat,87,235,4	duplicate(血の祭壇#r133)	血の祭壇#r135	10045	/* 401 (hide)*/
1_tiamat_12.gat,113,235,4	duplicate(血の祭壇#r133)	血の祭壇#r136	10045	/* 402 (hide)*/
1_tiamat_12.gat,163,231,4	duplicate(血の祭壇#r133)	血の祭壇#r137	10045	/* 403 (hide)*/
1_tiamat_12.gat,184,230,4	duplicate(血の祭壇#r133)	血の祭壇#r138	10045	/* 404 (hide)*/
1_tiamat_12.gat,228,235,4	duplicate(血の祭壇#r133)	血の祭壇#r139	10045	/* 405 (hide)*/

1_tiamat_15.gat,137,47,4	script	レバー#009_1	10042,{/* 460 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城2F 医務室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	misceffect 234, "area#r1059";
	misceffect 406, "area#k1059";
	killmonster "1_tiamat_42.gat","tiamat_mob#r105::OnKilled5";
	hideonnpc "area#k1059";
	hideoffnpc "area#r1059";
	mapannounce "1_tiamat_15.gat","「城内通路2F01」⇔「城内通路2F02」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_42.gat","「城内通路2F01」⇔「城内通路2F02」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_16.gat,60,53,5	script	転移の石碑#k441	406,{/* 465 (hide)*/
	mes "^0000ff‐認証エラー";
	mes "　登録のない者は転移機能を";
	mes "　利用できません‐^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "認証エラー　登録のない者は転移機能を利用できません";
	end;
OnTimer4000:
	announce "四騎士ハウンド : ………またか。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : 考えても仕方ねえ！　無理やり起動だ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "四騎士ハウンド#205_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "転移の石碑#k441"; //474
	end;
OnTimer12000:
	misceffect 794, "転移の石碑#k441"; //474
	announce "[塔・南東 1F]の警報装置が作動しました　侵入者を排除します", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "転移の石碑#e441"; //475
	hideonnpc "転移の石碑#k441"; //474
	donpcevent "転移の石碑#e441::OnStart";
	announce "四騎士ハウンド : 手早く済ませるとしようぜ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r44::OnKilled2";
	end;
}
1_tiamat_16.gat,60,53,5	script	転移の石碑#e441	406,{/* 466 (hide)*/
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	mes "　";
	mes "　^0000ffエネルギー充填率 : " +'energy+ "%^000000";
	next;
	if(select("^0000ff賢そうに^000000エネルギーを注ぐ","立ち去る") == 2) {
		mes "‐あなたは石碑から";
		mes "　手を放した‐";
		close;
	}
	mes "‐転移の石碑にエネルギーを";
	mes "　注入しています‐";
	mes "　";
	mes "　^0000ff※攻撃を受けたり、移動を試みると";
	mes "　　動作が停止します。^000000";
	set '@time,80 - readparam(bInt)/3;
	if('@time < 1) set '@time,1;
	misceffect 174,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "転移の石碑#e441"; //475
		percentheal -10,-10;
		announce "[塔・南東 1F] の転移の石碑に冒険者「" +strcharinfo(0)+ "」がエネルギーを注ぎました　＜充填率" +'energy+ "%＞", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "転移の石碑#r441"; //476
	hideonnpc "転移の石碑#e441"; //475
	misceffect 234, "転移の石碑#r441"; //476
	misceffect 94, "転移の石碑#r441"; //476
	announce "[塔・南東 1F]の転移の石碑がオーバーロードし、一部機能が使用可能になりました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : よし、先に進むぞ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "四騎士ハウンド#205_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "四騎士ハウンド#2008_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,8;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",45,35,75,60,"魔女のしもべ",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",45,35,75,60,"魔女のしもべ",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_16.gat,60,53,5	script	転移の石碑#r441	406,{/* 467 */
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	next;
	mes "‐転移先を選んでください‐";
	mes "　";
	mes "現在地 : 塔・南東1F";
	next;
	if($@tiamat_hound < 10) {
		switch(select("やめる","^888888塔・南東B1F^000000","^888888塔・南東1F^000000","^888888塔・南東3F^000000","塔・南東屋上","^888888塔・南②屋上^000000")) {
		default:
		case 1:
			close;
		case 5:
			warp "1_tiamat_03.gat",200,346;
			end;
		}
	}
	else {
		switch(select("やめる","塔・南東B1F","塔・南東2F","塔・南東3F","塔・南東屋上","塔・南②屋上")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//塔・南東B1F
			end;
		case 3:
			warp "1_tiamat_17.gat",60,38;	//塔・南東2F
			end;
		case 4:
			warp "1_tiamat_18.gat",49,41;	//塔・南東3F
			end;
		case 5:
			warp "1_tiamat_03.gat",200,346;	//塔・南東屋上
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//塔・南②屋上
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "転移の石碑#r441"; //476
	end;
}
1_tiamat_17.gat,61,44,5	script	転移の石碑#k451	406,{/* 474 (hide)*/
	mes "^0000ff‐認証エラー";
	mes "　登録のない者は転移機能を";
	mes "　利用できません‐^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "認証エラー　登録のない者は転移機能を利用できません";
	end;
OnTimer4000:
	announce "四騎士ハウンド : 転送装置のようだが、動いてねえな……。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : 考えても仕方ねえ！　無理やり動かすぞ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "四騎士ハウンド#203_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "転移の石碑#k451"; //474
	end;
OnTimer12000:
	misceffect 794, "転移の石碑#k451"; //474
	announce "[塔・南東 2F]の警報装置が作動しました　侵入者を排除します", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "転移の石碑#e451"; //475
	hideonnpc "転移の石碑#k451"; //474
	donpcevent "転移の石碑#e451::OnStart";
	announce "四騎士ハウンド : ちっ、こうなったら石像にエネルギーを注入して破壊するぞ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r45::OnKilled2";
	end;
}
1_tiamat_17.gat,61,44,5	script	転移の石碑#e451	406,{/* 475 (hide)*/
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	mes "　";
	mes "　^0000ffエネルギー充填率 : " +'energy+ "%^000000";
	next;
	if(select("^0000ff器用に^000000エネルギーを注ぐ","立ち去る") == 2) {
		mes "‐あなたは石碑から";
		mes "　手を放した‐";
		close;
	}
	mes "‐転移の石碑にエネルギーを";
	mes "　注入しています‐";
	mes "　";
	mes "　^0000ff※攻撃を受けたり、移動を試みると";
	mes "　　動作が停止します。^000000";
	set '@time,80 - readparam(bDex)/3;
	if('@time < 1) set '@time,1;
	misceffect 175,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "転移の石碑#e451"; //475
		percentheal -10,-10;
		announce "[塔・南東 2F] の転移の石碑に冒険者「" +strcharinfo(0)+ "」がエネルギーを注ぎました　＜充填率" +'energy+ "%＞", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "転移の石碑#r451"; //476
	hideonnpc "転移の石碑#e451"; //475
	misceffect 234, "転移の石碑#r451"; //476
	misceffect 94, "転移の石碑#r451"; //476
	announce "[塔・南東 2F]の転移の石碑がオーバーロードし、一部機能が使用可能になりました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : 一部の機能が使えるようになったようだな。先に進むぞ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "四騎士ハウンド#203_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "四騎士ハウンド#2006_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,6;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",46,30,76,50,"魔女のしもべ",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",46,30,76,50,"魔女のしもべ",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_17.gat,61,44,5	script	転移の石碑#r451	406,{/* 476 */
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	next;
	mes "‐転移先を選んでください‐";
	mes "　";
	mes "現在地 : 塔・南東2F";
	next;
	if($@tiamat_hound < 10) {
		switch(select("やめる","^888888塔・南東B1F^000000","^888888塔・南東1F^000000","塔・南東3F","^888888塔・南東屋上^000000","^888888塔・南②屋上^000000")) {
		default:
		case 1:
			close;
		case 4:
			warp "1_tiamat_18.gat",49,41;
			end;
		}
	}
	else {
		switch(select("やめる","塔・南東B1F","塔・南東1F","塔・南東3F","塔・南東屋上","塔・南②屋上")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//塔・南東B1F
			end;
		case 3:
			warp "1_tiamat_16.gat",60,47;	//塔・南東1F
			end;
		case 4:
			warp "1_tiamat_18.gat",49,41;	//塔・南東3F
			end;
		case 5:
			warp "1_tiamat_03.gat",200,346;	//塔・南東屋上
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//塔・南②屋上
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "転移の石碑#r451"; //476
	end;
}
1_tiamat_18.gat,49,47,5	script	転移の石碑#k461	406,{/* 486 (hide)*/
	mes "^0000ff‐認証エラー";
	mes "　登録のない者は転移機能を";
	mes "　利用できません‐^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "認証エラー　登録のない者は転移機能を利用できません";
	end;
OnTimer4000:
	announce "四騎士ハウンド : ……また同じ装置かよ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : 考えても仕方ねえ！　無理やり動かすぞ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "四騎士ハウンド#204_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "転移の石碑#k461"; //474
	end;
OnTimer12000:
	misceffect 794, "転移の石碑#k461"; //474
	announce "[塔・南東 3F]の警報装置が作動しました　侵入者を排除します", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "転移の石碑#e461"; //475
	hideonnpc "転移の石碑#k461"; //474
	donpcevent "転移の石碑#e461::OnStart";
	announce "四騎士ハウンド : 面倒だが、こいつもエネルギーを注入して破壊だ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r46::OnKilled2";
	end;
}
1_tiamat_18.gat,49,47,5	script	転移の石碑#e461	406,{/* 487 (hide)*/
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	mes "　";
	mes "　^0000ffエネルギー充填率 : " +'energy+ "%^000000";
	next;
	if(select("^0000ff力技で^000000エネルギーを注ぐ","立ち去る") == 2) {
		mes "‐あなたは石碑から";
		mes "　手を放した‐";
		close;
	}
	mes "‐転移の石碑にエネルギーを";
	mes "　注入しています‐";
	mes "　";
	mes "　^0000ff※攻撃を受けたり、移動を試みると";
	mes "　　動作が停止します。^000000";
	set '@time,80 - readparam(bStr)/3;
	if('@time < 1) set '@time,1;
	misceffect 173,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "転移の石碑#e461"; //475
		percentheal -10,-10;
		announce "[塔・南東 3F] の転移の石碑に冒険者「" +strcharinfo(0)+ "」がエネルギーを注ぎました　＜充填率" +'energy+ "%＞", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "転移の石碑#r461"; //476
	hideonnpc "転移の石碑#e461"; //475
	misceffect 234, "転移の石碑#r461"; //476
	misceffect 94, "転移の石碑#r461"; //476
	announce "[塔・南東 3F]の転移の石碑がオーバーロードし、一部機能が使用可能になりました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ハウンド : やっと終わったか……よし、進むぞ！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "四騎士ハウンド#204_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "四騎士ハウンド#2007_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,7;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",32,30,66,53,"魔女のしもべ",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",32,30,66,53,"魔女のしもべ",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_18.gat,49,47,5	script	転移の石碑#r461	406,{/* 488 */
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	next;
	mes "‐転移先を選んでください‐";
	mes "　";
	mes "現在地 : 塔・南東3F";
	next;
	if($@tiamat_hound < 10) {
		switch(select("やめる","^888888塔・南東B1F^000000","塔・南東1F","^888888塔・南東2F^000000","^888888塔・南東屋上^000000","^888888塔・南②屋上^000000")) {
		default:
		case 1:
			close;
		case 3:
			warp "1_tiamat_16.gat",60,47;
			end;
		}
	}
	else {
		switch(select("やめる","塔・南東B1F","塔・南東1F","塔・南東2F","塔・南東屋上","塔・南②屋上")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//塔・南東B1F
			end;
		case 3:
			warp "1_tiamat_16.gat",60,47;	//塔・南東1F
			end;
		case 4:
			warp "1_tiamat_17.gat",60,38;	//塔・南東2F
			end;
		case 5:
			warp "1_tiamat_03.gat",200,346;	//塔・南東屋上
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//塔・南②屋上
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "転移の石碑#r461"; //476
	end;
}
1_tiamat_19.gat,23,29,5	script	転移の石碑#r431	406,{/* 493 */
	misceffect 9,""; //self
	mes "‐石碑に手をかざすと";
	mes "　不思議な力が感じられる‐";
	next;
	mes "‐転移先を選んでください‐";
	mes "　";
	mes "現在地 : 塔・南東B1F";
	next;
	switch(select("やめる","塔・南東1F","塔・南東2F","塔・南東3F","塔・南東屋上","塔・南②屋上")) {
	case 1:
		close;
	case 2:
		warp "1_tiamat_16.gat",60,47;	//塔・南東1F
		end;
	case 3:
		warp "1_tiamat_17.gat",60,38;	//塔・南東2F
		end;
	case 4:
		warp "1_tiamat_18.gat",49,41;	//塔・南東3F
		end;
	case 5:
		warp "1_tiamat_03.gat",200,346;	//塔・南東屋上
		end;
	case 6:
		warp "1_tiamat_03.gat",108,248;	//塔・南②屋上
		end;
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "転移の石碑#r431"; //476
	end;
}
1_tiamat_19.gat,18,36,4	script	サタナキア#r43	844,{/* 495 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<15);
	announce "第16の守護天使 塔の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_19.gat,18,36,4	script	守護天使の亡骸#r43	802,{/* 496 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r43"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r43"; //496
	misceffect 668, "守護天使の亡骸#r43"; //496
	announce "？？？？ : 慈悲を与える時間は、もはや過ぎ去った。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "サタナキア#r43",20475;
	hideoffnpc "サタナキア#r43"; //495
	misceffect 1065, "サタナキア#r43"; //495
	misceffect 1019, "サタナキア#r43"; //495
	announce "何者かの声が部屋中に響き、[塔・南東B1F] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_19.gat",16,16,43,39,"123";
	end;
OnTimer9000:
	misceffect 903, "サタナキア#r43"; //495
	announce "サタナキア : 我が怒り一撃で、その身を粉々に打ち砕いてやろう。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "サタナキア#r43"; //495
	setnpcdisplay "サタナキア#r43",844;
	monster "this",18,36,"塔の化身",20475,1,"tiamat_mob#r43::OnKilled3";
	end;
}

1_tiamat_23.gat,151,160,1	script	封印の祠#r194	10045,{/* 553 (hide)*/
	set '@dist,distance(getcharid(3));
	if('@dist > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else if('@dist > 2)
		unittalk getcharid(3),strcharinfo(0)+" : 祠の中に小さな石が見えるが、ここからでは手が届かない……。",1;
	else {
		misceffect 9,"";	// self
		mes "‐祠の中にある石に手を触れると";
		mes "　頭の中に声が響いた‐";
		next;
		unittalk "汝の力を全て捧げよ……";	// 88627
		mes "[？？？？]";
		mes "汝の力を全て捧げよ……";
		next;
		if(select("少し考える","力を捧げる") == 1) {
			mes "‐あなたは立ち去った‐";
			close;
		}
		if('flag) close;
		set 'flag,1;
		misceffect 59,"封印の祠#r194";	// 88627
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		soundeffect "wraith_die.wav", 0, 0;	// 0
		hideonnpc "area#r1941";	// 92925
		hideoffnpc "area#k1941";	// 92925
		monster "this",165,159,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
		announce "[カタコンベ 墓①] の扉が閉じ、モンスターがあらわれた", 0x9, 0xee82ee, 0x0190, 30, 0, 0;
		donpcevent "封印の祠#r194::OnSpawn";
		close;
	}
	end;
OnSpawn:
	areamonster "this",150,151,164,165,"魔女のしもべ",3977,10,strnpcinfo(0)+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count < 5 && 'flag < 5) {
		set 'flag,'flag+1;
		areamonster "this",150,151,164,165,"魔女のしもべ",3977,10,strnpcinfo(0)+ "::OnKilled";
	}
	else if('@count == 0 && 'flag >= 5) {
		misceffect 459,"封印の祠#r194";	// 88627
		hideonnpc "封印の祠#r194";	// 88627
		misceffect 406,"area#r1941";	// 92925
		hideonnpc "area#k1941";	// 92925
		hideoffnpc "area#r1941";	// 92925
		announce "[カタコンベ 墓①] の封印の祠は崩れ去り、[カタコンベ 通路] への扉が再び開かれた", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "this",strnpcinfo(0)+ "::OnKilled2";
		if(getvariableofnpc('flag,"封印の祠#r195") >= 5 && getvariableofnpc('flag,"封印の祠#r196") >= 5) {
			sleep 3000;
			announce "[カタコンベ 祭壇] に安置されている守護天使の封印が解かれた", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			killmonster "1_tiamat_36.gat","tiamat_mob#r193::OnKilled2";
		}
	}
	end;
OnKilled2:
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 589,"封印の祠#r194";
	end;
}
1_tiamat_23.gat,162,138,1	script	封印の祠#r195	10045,{/* 554 (hide)*/
	set '@dist,distance(getcharid(3));
	if('@dist > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else if('@dist > 2)
		unittalk getcharid(3),strcharinfo(0)+" : 祠の中に小さな石が見えるが、ここからでは手が届かない……。",1;
	else {
		misceffect 9,"";	// self
		mes "‐祠の中にある石に手を触れると";
		mes "　頭の中に声が響いた‐";
		next;
		unittalk "汝の力を全て捧げよ……";	// 88627
		mes "[？？？？]";
		mes "汝の力を全て捧げよ……";
		next;
		if(select("少し考える","力を捧げる") == 1) {
			mes "‐あなたは立ち去った‐";
			close;
		}
		if('flag) close;
		set 'flag,1;
		misceffect 59,"封印の祠#r195";	// 88627
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		soundeffect "wraith_die.wav", 0, 0;	// 0
		hideonnpc "area#r1951";	// 92925
		hideoffnpc "area#k1951";	// 92925
		monster "this",155,130,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
		announce "[カタコンベ 墓②] の扉が閉じ、モンスターがあらわれた", 0x9, 0xee82ee, 0x0190, 30, 0, 0;
		donpcevent "封印の祠#r195::OnSpawn";
		close;
	}
	end;
OnSpawn:
	areamonster "this",150,131,166,146,"魔女のしもべ",3977,10,strnpcinfo(0)+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count < 5 && 'flag < 5) {
		set 'flag,'flag+1;
		areamonster "this",150,131,166,146,"魔女のしもべ",3977,10,strnpcinfo(0)+ "::OnKilled";
	}
	else if('@count == 0 && 'flag >= 5) {
		misceffect 459,"封印の祠#r195";	// 88627
		hideonnpc "封印の祠#r195";	// 88627
		misceffect 406,"area#r1951";	// 92925
		hideonnpc "area#k1951";	// 92925
		hideoffnpc "area#r1951";	// 92925
		announce "[カタコンベ 墓②] の封印の祠は崩れ去り、[カタコンベ 通路] への扉が再び開かれた", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "this",strnpcinfo(0)+ "::OnKilled2";
		if(getvariableofnpc('flag,"封印の祠#r194") >= 5 && getvariableofnpc('flag,"封印の祠#r196") >= 5) {
			sleep 3000;
			announce "[カタコンベ 祭壇] に安置されている守護天使の封印が解かれた", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			killmonster "1_tiamat_36.gat","tiamat_mob#r193::OnKilled2";
		}
	}
	end;
OnKilled2:
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 589,"封印の祠#r195";
	end;
}
1_tiamat_23.gat,134,145,1	script	封印の祠#r196	10045,{/* 555 (hide)*/
	set '@dist,distance(getcharid(3));
	if('@dist > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else if('@dist > 2)
		unittalk getcharid(3),strcharinfo(0)+" : 祠の中に小さな石が見えるが、ここからでは手が届かない……。",1;
	else {
		misceffect 9,"";	// self
		mes "‐祠の中にある石に手を触れると";
		mes "　頭の中に声が響いた‐";
		next;
		unittalk "汝の力を全て捧げよ……";	// 88627
		mes "[？？？？]";
		mes "汝の力を全て捧げよ……";
		next;
		if(select("少し考える","力を捧げる") == 1) {
			mes "‐あなたは立ち去った‐";
			close;
		}
		if('flag) close;
		set 'flag,1;
		misceffect 59,"封印の祠#r196";	// 88627
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		soundeffect "wraith_die.wav", 0, 0;	// 0
		hideonnpc "area#r1961";	// 92925
		hideoffnpc "area#k1961";	// 92925
		monster "this",131,133,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
		announce "[カタコンベ 墓③] の扉が閉じ、モンスターがあらわれた", 0x9, 0xee82ee, 0x0190, 30, 0, 0;
		donpcevent "封印の祠#r196::OnSpawn";
		close;
	}
	end;
OnSpawn:
	areamonster "this",131,129,143,144,"魔女のしもべ",3977,10,strnpcinfo(0)+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count < 5 && 'flag < 5) {
		set 'flag,'flag+1;
		areamonster "this",131,129,143,144,"魔女のしもべ",3977,10,strnpcinfo(0)+ "::OnKilled";
	}
	else if('@count == 0 && 'flag >= 5) {
		misceffect 459,"封印の祠#r196";	// 88627
		hideonnpc "封印の祠#r196";	// 88627
		misceffect 406,"area#r1961";	// 92925
		hideonnpc "area#k1961";	// 92925
		hideoffnpc "area#r1961";	// 92925
		announce "[カタコンベ 墓③] の封印の祠は崩れ去り、[カタコンベ 通路] への扉が再び開かれた", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "this",strnpcinfo(0)+ "::OnKilled2";
		if(getvariableofnpc('flag,"封印の祠#r194") >= 5 && getvariableofnpc('flag,"封印の祠#r195") >= 5) {
			sleep 3000;
			announce "[カタコンベ 祭壇] に安置されている守護天使の封印が解かれた", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			killmonster "1_tiamat_36.gat","tiamat_mob#r193::OnKilled2";
		}
	}
	end;
OnKilled2:
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 589,"封印の祠#r196";
	end;
}
1_tiamat_23.gat,151,160,1	script	封印の祠#k194	10045,{/* 556 (hide)*/}
1_tiamat_23.gat,162,138,1	script	封印の祠#k195	10045,{/* 557 (hide)*/}
1_tiamat_23.gat,134,145,1	script	封印の祠#k196	10045,{/* 558 (hide)*/}
1_tiamat_23.gat,158,158,0	script	gate08_001#1_tiamat_23	139,15,15,{/* 559 (hide)*/
	sc_start EFST_ABYSS_006,1000,100;	//皇帝への献身 : DEX-100
	end;
}
1_tiamat_23.gat,159,137,0	script	gate09_001#1_tiamat_23	139,15,15,{/* 560 (hide)*/
	sc_start EFST_ABYSS_006,1000,100;	//皇帝への献身 : DEX-100
	end;
}
1_tiamat_23.gat,137,137,0	script	gate10_001#1_tiamat_23	139,15,15,{/* 561 (hide)*/
	sc_start EFST_ABYSS_006,1000,100;	//皇帝への献身 : DEX-100
	end;
}
1_tiamat_25.gat,186,14,4	script	レバー#315_1	10042,{/* 580 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		set '@count,getmapmobs("this","tiamat_mob#r132::OnKilled2");
		if('@count) {
			unittalk getcharid(3),strcharinfo(0)+" : 鍵がかかっている……",1;
			end;
		}
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[監獄 看守部屋] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r61") == 0) {	// 塔・北西 2F、倒してたら解放
		misceffect 234, "area#r612";
		misceffect 406, "area#k612";
		killmonster "1_tiamat_02.gat","tiamat_mob#r61::OnKilled2";
		hideonnpc "area#k612"; //1258
		hideoffnpc "area#r612"; //1258
	}
	announce "「塔・北西1F」⇔「塔・北西2F」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_26.gat,232,175,1	script	試練の石碑#r199	406,{/* 607 (hide)*/
	misceffect 9,"";	// self
	mes "‐石碑に手を触れると";
	mes "　頭の中に声が響いた‐";
	next;
	mes "[試練の石碑]";
	mes "これより汝に一つ問う。";
	mes "正解すれば";
	mes "「祈りの間」への道を開こう。";
	mes "但し、間違えた場合は";
	mes "「王城入口」へと転送する。";
	next;
	mes "[試練の石碑]";
	mes "汝、準備はよろしいか？";
	next;
	if(select("少し考える","試練に挑戦する") == 1) {
		mes "[試練の石碑]";
		mes "悩むのも良いだろう。";
		mes "また来るが良い。";
		close;
	}
	unittalk "「"+strcharinfo(0)+"」が試練を開始します";	// 28771
	initnpctimer;
	if('quiz == 0)
		set 'quiz,rand(1,4);
	switch('@r) {
	case 1:
		mes "城内3Fグレートホールに存在する";
		mes "皿の枚数は何枚か。";
		next;
		input '@num;
		//TODO
		if('@num <= 0) {
			mes "[試練の石碑]";
			mes "悩むのも良いだろう。";
			mes "また来るが良い。";
			close;
		}
		unittalk getcharid(3),strcharinfo(0)+" : " +'@num+ "枚 !!";
		set '@true,1;
		break;
	case 2:
		mes "現時点で解放された守護天使は";
		mes "何体か。";
		next;
		input '@num;
		//TODO
		if('@num <= 0) {
			mes "[試練の石碑]";
			mes "悩むのも良いだろう。";
			mes "また来るが良い。";
			close;
		}
		unittalk getcharid(3),strcharinfo(0)+" : " +'@num+ "体 !!";
		set '@true,1;
		break;
	case 3:
		unittalk "試練の石碑 : 現時刻(" +gettime(3)+ "時" +gettime(2)+ "分" +gettime(1)+ "秒)で「水門①」は開いているか、閉まっているか？";	// 28771
		mes "[試練の石碑]";
		mes "現時刻(" +gettime(3)+ "時" +gettime(2)+ "分" +gettime(1)+ "秒)で";
		mes "「水門①」は";
		mes "開いているか、閉まっているか？";
		set '@gate1,getvariableofnpc('flag,"水門①開閉装置#k73CG08");
		next;
		switch(select("開いている","閉まっている")) {
		case 1:
			unittalk getcharid(3),strcharinfo(0)+" : 開いている !!";
			if('@gate1 == 0)
				set '@true,1;
			end;
		case 2:
			unittalk getcharid(3),strcharinfo(0)+" : 閉まっている !!";
			if('@gate1 == 1)
				set '@true,1;
			end;
		}
		break;
	case 4:
		unittalk "試練の石碑 : 現時刻(" +gettime(3)+ "時" +gettime(2)+ "分" +gettime(1)+ "秒)で「水門②」は開いているか、閉まっているか？";	// 28771
		mes "[試練の石碑]";
		mes "現時刻(" +gettime(3)+ "時" +gettime(2)+ "分" +gettime(1)+ "秒)で";
		mes "「水門②」は";
		mes "開いているか、閉まっているか？";
		set '@gate2,getvariableofnpc('flag,"水門②開閉装置#k74AG08");
		next;
		switch(select("開いている","閉まっている")) {
		case 1:
			unittalk getcharid(3),strcharinfo(0)+" : 開いている !!";
			if('@gate2 == 0)
				set '@true,1;
			end;
		case 2:
			unittalk getcharid(3),strcharinfo(0)+" : 閉まっている !!";
			if('@gate2 == 1)
				set '@true,1;
			end;
		}
		break;
	case 5:
		//mes "[試練の石碑]";
		//mes "四騎士ローウェンは今どこに居る？";
		//mes "　";
		//mes "^ff0000回答を選択後に";
		//mes "正解チェックを行います^000000";
		//next;
		//switch(select("その他エリア","城壁エリア","塔・南①エリア","塔・南②エリア","塔・南東エリア","塔・南西エリア","塔・西エリア","塔・東エリア","塔・北西エリア","塔・北東エリア","塔・北①エリア","塔・北②エリア","城1Fエリア","城2Fエリア","城3Fエリア","城B1Fエリア","監獄エリア","兵舎1Fエリア","兵舎2Fエリア","使用人居住区エリア","教会1Fエリア","教会2Fエリア","鐘楼エリア","神殿1Fエリア","神殿B1Fエリア","神殿B2Fエリア","カタコンベエリア")) {

	}
	unittalk "……";	// 28771
	mes "[試練の石碑]";
	mes "……";
	close2;
	if('@true) {
		//areasoundeffect "complete.wav", 0, 0;	// 0
		unittalk "見事だ!!　通るが良い。";	// 28771
		sleep 2000;
		misceffect 234,"area#r1992";	// 27360
		announce "「"+strcharinfo(0)+"」が試練「王城のリドル」をクリアしました", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		misceffect 459,"試練の石碑#r199";	// 28771
		hideonnpc "試練の石碑#r199";	// 28771
		sleep 2000;
		misceffect 406,"area#r1992";	// 27360
		hideoffnpc "area#r1992";	// 27360
		hideonnpc "area#k1992";	// 27360
		announce "[カタコンベ 浮き橋] ⇔ [カタコンベ 祈りの間]の扉が開かれました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "1_tiamat_26.gat","tiamat_mob#r199::OnKilled2";
//		soundeffect "complete.wav", 0, 0;	// 0
//		unittalk getnpcid(0,"試練の石碑#r199_0qf"),"見事だ!!　通るが良い。";	// 28771
//		announce "「"+strcharinfo(0)+"」が試練「王城のリドル」をクリアしました", 0x9, 0xffff00, 0x0190, 30, 0, 0;
//		misceffect 222,"area#r1992";	// 27360
//		sleep 2000;
//		misceffect 488,"area#r1992";	// 27360
//		announce "[カタコンベ 浮き橋] ⇔ [カタコンベ 祈りの間]の扉が開かれました", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
//		sleep 2000;
//		misceffect 321,"area#r1992";	// 27360
//		hideoffnpc "area#r1992";	// 27360
//		killmonster "1_tiamat_26.gat","tiamat_mob#r199::OnKilled2";
//		misceffect 459,"試練の石碑#r199";	// 28771
//		hideonnpc "試練の石碑#r199";	// 28771
	}
	else {
		//TODO
		unittalk "不正解!!　去るが良い。";	// 28771
		sleep 2000;
		warp "1_tiamat_00.gat",182,150;
	}
	end;
OnTimer60000:
	stopnpctimer;
	set 'quiz,rand(1,4);
	end;
}
1_tiamat_26.gat,57,49,0	script	area#r128_01	139,{/* 608 (hide)*/}
1_tiamat_26.gat,85,49,0	script	area#r128_02	139,{/* 609 (hide)*/}
1_tiamat_26.gat,113,49,0	script	area#r128_03	139,{/* 610 (hide)*/}
1_tiamat_26.gat,141,49,0	script	area#r128_04	139,{/* 611 (hide)*/}
1_tiamat_26.gat,96,32,0	script	area#r128_05	139,{/* 612 (hide)*/}
1_tiamat_26.gat,71,26,0	script	area#r128_06	139,{/* 613 (hide)*/}
1_tiamat_26.gat,66,213,0	script	area#r129_01	139,{/* 614 (hide)*/}
1_tiamat_26.gat,66,183,0	script	area#r129_02	139,{/* 615 (hide)*/}
1_tiamat_26.gat,66,155,0	script	area#r129_03	139,{/* 616 (hide)*/}
1_tiamat_26.gat,134,103,0	script	area#r130_01	139,{/* 617 (hide)*/}
1_tiamat_26.gat,120,83,0	script	area#r130_02	139,{/* 618 (hide)*/}
1_tiamat_26.gat,92,83,0	script	area#r130_03	139,{/* 619 (hide)*/}
1_tiamat_26.gat,64,83,0	script	area#r130_04	139,{/* 620 (hide)*/}
1_tiamat_26.gat,45,97,0	script	area#r130_05	139,{/* 621 (hide)*/}
1_tiamat_26.gat,88,91,0	script	area#r130_06	139,{/* 622 (hide)*/}
1_tiamat_26.gat,184,176,3	script	異形の案内人#r199A	451,{/* 623 */
	mes "^0000FF‐水路には浮橋が掛けられている。";
	mes "　向こう側に渡るには";
	mes "　浮橋を利用するしかないようだ‐^000000";
	next;
	mes "[異形の案内人]";
	mes "こんな所で人と会うとは……";
	mes "まさか魔女を倒しに来たのか？";
	mes "それなら手を貸してやろう。";
	mes "魔女には、こんな姿に変えられた";
	mes "恨みがあるんでなぁ……くくく。";
	next;
	mes "[異形の案内人]";
	mes "この浮橋は、水の量によって";
	mes "利用できる時もあれば";
	mes "できない時もある。";
	set '@gate1,getvariableofnpc('flag,"水門①開閉装置#k73CG08");
	set '@gate2,getvariableofnpc('flag,"水門②開閉装置#k74AG08");
	switch('@gate1 + '@gate2) {
	case 0:
		mes "今は、水門が両方開いているな。";
		mes "^FF0000水の流れが速すぎる^000000から";
		mes "浮橋は利用できないぜ。";
		close;
	case 1:
		mes "今は、^FF0000ちょうどいい水量^000000だ。";
		mes "浮橋が利用できるから";
		mes "俺が先導してやろう。";
		next;
		if(select("少し考える","先導してもらう") == 1) {
			mes "[異形の案内人]";
			mes "なんだぁ、怖気づいたか？";
			mes "そんなんで本当に";
			mes "魔女を倒せるのか？";
			close;
		}
		mes "[異形の案内人]";
		mes "よしよし。";
		mes "それじゃあ俺の後について来い。";
		mes "ほら、こっちだ。";
		close2;
		soundeffect "complete.wav", 0, 0; //0
		warp "1_tiamat_26.gat",230,175;
		end;
	case 2:
		mes "今は、水門が両方閉じているな。";
		mes "^FF0000水量が足りない^000000から";
		mes "浮橋は利用できないぜ。";
		next;
		mes "[異形の案内人]";
		mes "ふん……水は引いてるから";
		mes "流されることはないと思うが";
		mes "^ff0000ホバーリング状態^000000か";
		mes "^ff0000ニャンジャンプ^000000でも覚えていれば";
		mes "渡れるかもな。";
		if(getskilllv(2263) > 0)	//ホバーリング
			set '@skill$,"ホバーリング";
		else if(getskilllv(5023) > 0)	//ニャンジャンプ
			set '@skill$,"ニャンジャンプ";
		else
			close;
		next;
		mes "[異形の案内人]";
		mes "どうだ……";
		mes "^ff0000" +'@skill$+ "^000000を";
		mes "試してみるか？";
		next;
		if(select("少し考える","試してみる") ==1) {
			mes "[異形の案内人]";
			mes "なんだぁ、怖気づいたか？";
			mes "そんなんで本当に";
			mes "魔女を倒せるのか？";
			close;
		}
		mes "[異形の案内人]";
		mes "よしよし。";
		mes "それじゃあ気合入れていけよ。";
		mes "そら、いけ！";
		close2;
		showmessage '@skill$+ "!!";
		progressbar 1; //color=0x00ff00
		misceffect 411,""; //self
		warp "1_tiamat_26.gat",230,175;
		end;
	}
}
1_tiamat_26.gat,228,176,3	script	異形の案内人#r199B	451,{/* 624 */
	mes "[異形の案内人]";
	mes "望みの物は見つかったのか？";
	mes "　";
	set '@gate1,getvariableofnpc('flag,"水門①開閉装置#k73CG08");
	set '@gate2,getvariableofnpc('flag,"水門②開閉装置#k74AG08");
	switch('@gate1 + '@gate2) {
	case 0:
		mes "今は、水門が両方開いているな。";
		mes "^FF0000水の流れが速すぎる^000000から";
		mes "浮橋は利用できないぜ。";
		close;
	case 1:
		mes "今は、^FF0000ちょうどいい水量^000000だ。";
		mes "浮橋が利用できるから";
		mes "俺が先導してやろう。";
		next;
		if(select("少し考える","先導してもらう") == 1) {
			mes "[異形の案内人]";
			mes "なんだぁ、怖気づいたか？";
			mes "そんなんで本当に";
			mes "魔女を倒せるのか？";
			close;
		}
		mes "[異形の案内人]";
		mes "よしよし。";
		mes "それじゃあ俺の後について来い。";
		mes "ほら、こっちだ。";
		close2;
		soundeffect "complete.wav", 0, 0; //0
		warp "1_tiamat_26.gat",181,175;
		end;
	case 2:
		mes "今は、水門が両方閉じているな。";
		mes "^FF0000水量が足りない^000000から";
		mes "浮橋は利用できないぜ。";
		next;
		mes "[異形の案内人]";
		mes "ふん……水は引いてるから";
		mes "流されることはないと思うが";
		mes "^ff0000ホバーリング状態^000000か";
		mes "^ff0000ニャンジャンプ^000000でも覚えていれば";
		mes "渡れるかもな。";
		if(getskilllv(2263) > 0)	//ホバーリング
			set '@skill$,"ホバーリング";
		else if(getskilllv(5023) > 0)	//ニャンジャンプ
			set '@skill$,"ニャンジャンプ";
		else
			close;
		next;
		mes "[異形の案内人]";
		mes "どうだ……";
		mes "^ff0000" +'@skill$+ "^000000を";
		mes "試してみるか？";
		next;
		if(select("少し考える","試してみる") ==1) {
			mes "[異形の案内人]";
			mes "なんだぁ、怖気づいたか？";
			mes "そんなんで本当に";
			mes "魔女を倒せるのか？";
			close;
		}
		mes "[異形の案内人]";
		mes "よしよし。";
		mes "それじゃあ気合入れていけよ。";
		mes "そら、いけ！";
		close2;
		showmessage '@skill$+ "!!";
		progressbar 1; //color=0x00ff00
		misceffect 411,""; //self
		warp "1_tiamat_26.gat",181,175;
		end;
	}
}
1_tiamat_26.gat,100,23,4	script	ハナエル#r128	844,{/* 625 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<14);
	announce "第15の守護天使 悪魔の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_26.gat,100,23,4	script	守護天使の亡骸#r128	802,{/* 626 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r168"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r168"; //496
	misceffect 668, "守護天使の亡骸#r168"; //496
	announce "？？？？ : 我が前に現れるとは、お前はとても運が良い。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ハナエル#r128",20466;
	hideoffnpc "ハナエル#r128"; //495
	misceffect 1065, "ハナエル#r128"; //495
	misceffect 1019, "ハナエル#r128"; //495
	announce "何者かの声が部屋中に響き、[城B1F 水路01] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",85,45,110,10,"123";
	end;
OnTimer9000:
	misceffect 903, "ハナエル#r128"; //495
	announce "ハナエル : 我が手にかかれば安息の死を得られるのだからな。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ハナエル#r128"; //495
	setnpcdisplay "ハナエル#r128",844;
	monster "this",100,23,"悪魔の化身",20466,1,"tiamat_mob#r168::OnKilled2";
	end;
}
1_tiamat_29.gat,262,246,4	script	ガムビエル#r10	844,{/* 651 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<16);
	announce "第17の守護天使 星の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_29.gat,262,246,4	script	守護天使の亡骸#r10	802,{/* 652 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r10"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r10"; //496
	misceffect 668, "守護天使の亡骸#r10"; //496
	announce "？？？？ : 希望が無ければ……人は生きていけないらしいな？", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ガムビエル#r10",20467;
	hideoffnpc "ガムビエル#r10"; //495
	misceffect 1065, "ガムビエル#r10"; //495
	misceffect 1019, "ガムビエル#r10"; //495
	announce "何者かの声が部屋中に響き、[その他 墓地] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",85,45,110,10,"123";
	end;
OnTimer9000:
	misceffect 903, "ガムビエル#r10"; //495
	announce "ガムビエル : では、希望を砕いて絶望をくれてやろう……朽ち果てよ！", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ガムビエル#r10"; //495
	setnpcdisplay "ガムビエル#r10",844;
	monster "this",262,246,"星の化身",20467,1,"tiamat_mob#r10::OnKilled2";
	end;
}
1_tiamat_31.gat,79,287,4	script	レバー#104_1	10042,{/* 691 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[兵舎2F 隊長室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	misceffect 234, "area#r1481";
	misceffect 234, "area#r1482";
	misceffect 406, "area#k1481";
	misceffect 406, "area#k1482";
	killmonster "1_tiamat_31.gat","tiamat_mob#r148::OnKilled2";
	killmonster "1_tiamat_31.gat","tiamat_mob#r148::OnKilled3";
	hideonnpc "area#k1481";
	hideonnpc "area#k1482";
	hideoffnpc "area#r1481";
	hideoffnpc "area#r1482";
	announce "「兵舎2F通路」⇔「兵舎2F大部屋」「兵舎1F通路」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,204,287,4	script	レバー#311_1	10042,{/* 692 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[兵舎1F 部屋①] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#311_1")+getvariableofnpc('flag,"レバー#311_2")+getvariableofnpc('flag,"レバー#311_3")+getvariableofnpc('flag,"レバー#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "「兵舎1F通路」⇔「兵舎1F武器庫」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,142,188,4	script	レバー#311_2	10042,{/* 693 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[兵舎1F 部屋②] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#311_1")+getvariableofnpc('flag,"レバー#311_2")+getvariableofnpc('flag,"レバー#311_3")+getvariableofnpc('flag,"レバー#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "「兵舎1F通路」⇔「兵舎1F武器庫」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,211,185,4	script	レバー#311_3	10042,{/* 694 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[兵舎1F 部屋③] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#311_1")+getvariableofnpc('flag,"レバー#311_2")+getvariableofnpc('flag,"レバー#311_3")+getvariableofnpc('flag,"レバー#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "「兵舎1F通路」⇔「兵舎1F武器庫」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,266,188,4	script	レバー#311_4	10042,{/* 695 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[兵舎1F 部屋④] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#311_1")+getvariableofnpc('flag,"レバー#311_2")+getvariableofnpc('flag,"レバー#311_3")+getvariableofnpc('flag,"レバー#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "「兵舎1F通路」⇔「兵舎1F武器庫」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,17,18,4	script	バルビエル#r149	844,{/* 698 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<12);
	announce "第13の守護天使 死神の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_31.gat,17,18,4	script	守護天使の亡骸#r149	802,{/* 699 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r149"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r149"; //496
	misceffect 668, "守護天使の亡骸#r149"; //496
	announce "？？？？ : ちょうど相手が欲しかったんだ。死のダンスを踊ってくれる相手をさ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "バルビエル#r149",20464;
	hideoffnpc "バルビエル#r149"; //495
	misceffect 1065, "バルビエル#r149"; //495
	misceffect 1019, "バルビエル#r149"; //495
	announce "何者かの声が部屋中に響き、[兵舎2F 大部屋] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",14,14,27,28,"123";
	end;
OnTimer9000:
	misceffect 903, "バルビエル#r149"; //495
	announce "バルビエル : さあ、死ぬまで踊ろう。当然、相手してくれるだろ？", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "バルビエル#r149"; //495
	setnpcdisplay "バルビエル#r149",844;
	monster "this",17,18,"死神の化身",20464,1,"tiamat_mob#r149::OnKilled2";
	end;
}
1_tiamat_32.gat,15,183,4	script	レバー#109_1	10042,{/* 725 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[使用人居住区 炊事場] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	if(getvariableofnpc('flag,"tiamat_mob#r157") == 0) {
		misceffect 234, "area#r1571";
		misceffect 234, "area#r1573";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r6") == 0) {
		misceffect 234, "area#r62";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r89") == 0) {
		misceffect 234, "area#r892";
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r157") == 0) {	//炊事場
		misceffect 406, "area#k1571";
		misceffect 406, "area#k1573";
		killmonster "1_tiamat_32.gat","tiamat_mob#r157::OnKilled2";
		hideonnpc "area#k1571";
		hideonnpc "area#k1573";
		hideoffnpc "area#r1571";
		hideoffnpc "area#r1573";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r89") == 0) {	//城内通路1F02
		misceffect 406, "area#k892";
		killmonster "1_tiamat_42.gat","tiamat_mob#r89::OnKilled2";
		hideonnpc "area#k892";
		hideoffnpc "area#r892";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r6") == 0) {	//裏庭
		misceffect 406, "area#k62";
		killmonster "1_tiamat_38.gat","tiamat_mob#r6::OnKilled2";
		hideonnpc "area#k62";
		hideoffnpc "area#r62";
	}
	announce "「炊事場」⇔「城内通路1F02」「裏庭」、「塔・北②2F」⇔「城内通路2F03」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_32.gat,29,119,4	script	石像#r98_001	10070,{/* 726 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,32,119,4	script	石像#r98_002	10070,{/* 727 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,35,119,4	script	石像#r98_003	10070,{/* 728 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,38,119,4	script	石像#r98_004	10070,{/* 729 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,29,112,8	script	石像#r98_005	10070,{/* 730 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,32,112,8	script	石像#r98_006	10070,{/* 731 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,35,112,8	script	石像#r98_007	10070,{/* 732 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,38,112,8	script	石像#r98_008	10070,{/* 733 */
	mes "‐石像には「" +'flag+ "」の数字が";
	mes "　刻まれている‐";
	close;
}
1_tiamat_32.gat,26,115,4	script	悍ましい焼き物#r98_001	10131,{/* 734 (hide)*/}
1_tiamat_32.gat,29,115,4	script	悍ましい焼き物#r98_002	10131,{/* 735 (hide)*/}
1_tiamat_32.gat,32,115,4	script	悍ましい焼き物#r98_003	10131,{/* 736 (hide)*/}
1_tiamat_32.gat,35,115,4	script	悍ましい焼き物#r98_004	10131,{/* 737 (hide)*/}
1_tiamat_32.gat,38,115,4	script	悍ましい焼き物#r98_005	10131,{/* 738 (hide)*/}
1_tiamat_32.gat,41,115,4	script	悍ましい焼き物#r98_006	10131,{/* 739 (hide)*/}
1_tiamat_33.gat,281,278,1	script	水門②開閉装置#k74AG08	10046,{/* 748 (hide)*/
	unittalk "鍵がかかっている……",1;
	end;
OnStart:
	initnpctimer;
	set 'flag,1;
	unittalk "地下水路の水が急速に引き始めた……";
	hideoffnpc "水門②開閉装置#r74AG08"; //749
	hideonnpc "水門②開閉装置#k74AG08"; //748
	announce "[塔・北② B1F] の水門が閉じられた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_26.gat","[塔・北② B1F] の水門が閉じられた", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	areasoundeffect "this",254,264,277,293,"se_water_fall02.wav", 0, 0; //0
	end;
OnTimer3000:
	mapannounce "1_tiamat_26.gat","[城B1F 水路03] の水が引き始めました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	// 先行してるかチェック
	if(getvariableofnpc('flag,"tiamat_mob#r125") == 0) {	// 城内通路 B1F、もう倒してたら水路 03解放
		killmonster "1_tiamat_26.gat","tiamat_mob#r125::OnKilled2";
		misceffect 234, "area#r1251";
		misceffect 406, "area#r1251";
		hideonnpc "area#k1251"; //1258
		hideoffnpc "area#r1251"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r12") == 0) {	// 北井戸の底、もう倒してたら水路 03解放
		killmonster "1_tiamat_05.gat","tiamat_mob#r12::OnKilled2";
		misceffect 234, "area#r122";
		misceffect 406, "area#r122";
		hideonnpc "area#k122"; //1258
		hideoffnpc "area#r122"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r130") == 0) {	// 水路 03、倒してたら解放
		killmonster "1_tiamat_26.gat","tiamat_mob#r130::OnKilled2";
		misceffect 234, "area#r1301";
		misceffect 234, "area#r1302";
		misceffect 234, "area#r1303";
		misceffect 406, "area#r1301";
		misceffect 406, "area#r1302";
		misceffect 406, "area#r1303";
		hideonnpc "area#k1301"; //1258
		hideoffnpc "area#r1301"; //1258
		hideonnpc "area#k1302"; //1258
		hideoffnpc "area#r1302"; //1258
		hideonnpc "area#k1303"; //1258
		hideoffnpc "area#r1303"; //1258
	}
	end;
OnTimer6000:
	stopnpctimer;
	if(getvariableofnpc('flag,"水門①開閉装置#k73CG08") == 0)
		mapannounce "1_tiamat_26.gat","[城B1F 水路01] は半分程の水位に減りました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	else {
		mapannounce "1_tiamat_26.gat","[城B1F 水路01] の水も枯れ始めました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {	// 南井戸の底、倒してたら解放
			killmonster "1_tiamat_05.gat","tiamat_mob#r13::OnKilled3";
			misceffect 234, "area#r132";
			misceffect 406, "area#r132";
			hideonnpc "area#k132"; //南井戸の底->水路01
			hideoffnpc "area#r132"; //南井戸の底->水路01
		}
		if(getvariableofnpc('flag,"tiamat_mob#r126") == 0) {	// 噴水基部、倒してたら解放
			killmonster "1_tiamat_26.gat","tiamat_mob#r126::OnKilled2";
			misceffect 234, "area#r1263";
			misceffect 406, "area#r1263";
			hideonnpc "area#k1263"; //噴水基部->水路01
			hideoffnpc "area#r1263"; //噴水基部->水路01
		}
	}
	end;
}
1_tiamat_33.gat,281,278,1	script	水門②開閉装置#r74AG08	10046,{/* 749 */
	unittalk "水門②は閉まっている……。",1;
	end;
}
1_tiamat_34.gat,200,217,4	script	レバー#107_1	10042,{/* 767 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[使用人居住区 使用人部屋①] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#107_1")+getvariableofnpc('flag,"レバー#107_2")+getvariableofnpc('flag,"レバー#107_3") < 3)
		end;
	misceffect 234, "area#r1525";
	misceffect 406, "area#k1525";
	killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled3";
	hideonnpc "area#k1525";
	hideoffnpc "area#r1525";
	if(getvariableofnpc('flag,"tiamat_mob#r156") == 0) {	// 召使い部屋、倒してたら解放
		misceffect 234, "area#r1561";
		misceffect 406, "area#k1561";
		killmonster "1_tiamat_51.gat","tiamat_mob#r156::OnKilled3";
		hideonnpc "area#k1561";
		hideoffnpc "area#r1561";
	}
	announce "「使用人居住区・廊下」⇔「召使い部屋」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,212,172,4	script	レバー#107_2	10042,{/* 768 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[使用人居住区 使用人部屋②] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#107_1")+getvariableofnpc('flag,"レバー#107_2")+getvariableofnpc('flag,"レバー#107_3") < 3)
		end;
	misceffect 234, "area#r1525";
	misceffect 406, "area#k1525";
	killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled3";
	hideonnpc "area#k1525";
	hideoffnpc "area#r1525";
	if(getvariableofnpc('flag,"tiamat_mob#r156") == 0) {	// 召使い部屋、倒してたら解放
		misceffect 234, "area#r1561";
		misceffect 406, "area#k1561";
		killmonster "1_tiamat_51.gat","tiamat_mob#r156::OnKilled3";
		hideonnpc "area#k1561";
		hideoffnpc "area#r1561";
	}
	announce "「使用人居住区・廊下」⇔「召使い部屋」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,223,153,4	script	レバー#107_3	10042,{/* 769 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[使用人居住区 使用人部屋③] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"レバー#107_1")+getvariableofnpc('flag,"レバー#107_2")+getvariableofnpc('flag,"レバー#107_3") < 3)
		end;
	misceffect 234, "area#r1525";
	misceffect 406, "area#k1525";
	killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled3";
	hideonnpc "area#k1525";
	hideoffnpc "area#r1525";
	if(getvariableofnpc('flag,"tiamat_mob#r156") == 0) {	// 召使い部屋、倒してたら解放
		misceffect 234, "area#r1561";
		misceffect 406, "area#k1561";
		killmonster "1_tiamat_51.gat","tiamat_mob#r156::OnKilled3";
		hideonnpc "area#k1561";
		hideoffnpc "area#r1561";
	}
	announce "「使用人居住区・廊下」⇔「召使い部屋」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,89,41,4	script	レバー#203_1	10042,{/* 770 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城2F ヴンダーカンマー] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r201") == 0) {	// バルコニー②、倒してたら解放
		misceffect 234, "area#r2012";
		misceffect 234, "area#r2013";
		misceffect 406, "area#k2012";
		misceffect 406, "area#k2013";
		killmonster "1_tiamat_58.gat","tiamat_mob#r201::OnKilled2";
		hideonnpc "area#k2012";
		hideonnpc "area#k2013";
		hideoffnpc "area#r2012";
		hideoffnpc "area#r2013";
	}
	mapannounce "1_tiamat_34.gat","「バルコニー②」⇔「待機室2F」「城門②2F」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_58.gat","「バルコニー②」⇔「待機室2F」「城門②2F」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,278,220,4	script	アスタロト#r113	844,{/* 772 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<2);
	announce "第3の守護天使 女帝の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_34.gat,278,220,4	script	守護天使の亡骸#r113	802,{/* 773 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r113"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r113"; //496
	misceffect 668, "守護天使の亡骸#r113"; //496
	announce "？？？？ : 貴方が、我が主に仇なす不届き者ですか……。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "アスタロト#r113",20472;
	hideoffnpc "アスタロト#r113"; //495
	misceffect 1065, "アスタロト#r113"; //495
	misceffect 1019, "アスタロト#r113"; //495
	announce "何者かの声が部屋中に響き、[城3F 王妃の寝室] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_34.gat",268,210,288,230,"123";
	end;
OnTimer9000:
	misceffect 903, "アスタロト#r113"; //495
	announce "アスタロト : では主との盟約に従い、私心を滅して貴方を始末いたしましょう。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "アスタロト#r113"; //495
	setnpcdisplay "アスタロト#r113",844;
	monster "this",278,220,"女帝の化身",20472,1,"tiamat_mob#r113::OnKilled2";
	end;
}
1_tiamat_35.gat,90,178,4	script	王女メア#1_tiamat_35	10361,{/* 800 (hide)*/
}
1_tiamat_36.gat,99,70,4	script	マルキダエル#r193	844,{/* 818 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<3);
	announce "第4の守護天使 皇帝の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_36.gat,99,70,4	script	守護天使の亡骸#r193	802,{/* 819 (hide)*/
	if(getmapmobs("1_tiamat_36.gat","tiamat_mob#r193::OnKilled2") > 0) {
		unittalk getcharid(3),"亡骸に封印が施されている…… どこかに解除する仕掛けがあるようだ",1;
		end;
	}
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r193"; //836
	initnpctimer;
	close;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r193"; //836
	misceffect 668, "守護天使の亡骸#r193"; //836
	announce "？？？？ : 自らの立場を心得ぬ、下賤なる者よ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "マルキダエル#r193",20457;
	hideoffnpc "マルキダエル#r193"; //835
	misceffect 1065, "マルキダエル#r193"; //835
	misceffect 1019, "マルキダエル#r193"; //835
	announce "何者かの声が部屋中に響き、[カタコンベ カタコンベ祭壇] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",89,60,109,80,"123";
	end;
OnTimer9000:
	misceffect 903, "マルキダエル#r193"; //835
	announce "マルキダエル : その死を以て赦しを与える。我が慈悲に感謝せよ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "マルキダエル#r193"; //835
	setnpcdisplay "マルキダエル#r193",844;
	monster "this",99,70,"皇帝の化身",20457,1,"tiamat_mob#r193::OnKilled3";
	end;
}
1_tiamat_37.gat,131,92,4	script	アガリアレプト#r95	844,{/* 835 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<9);
	announce "第10の守護天使 運命の輪の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	misceffect 234, "area#r953";
	misceffect 406, "area#r953";
	misceffect 234, "area#r2022";
	misceffect 406, "area#r2022";
	hideonnpc "area#k953";
	hideonnpc "area#k2022";
	hideoffnpc "area#r953";
	hideoffnpc "area#r2022";
	killmonster "1_tiamat_37.gat","tiamat_mob#r95::OnKilled3";
	killmonster "1_tiamat_58.gat","tiamat_mob#r202::OnKilled2";
	if(getvariableofnpc('flag,"tiamat_mob#r105") == 0) {
		misceffect 234, "area#r1051";
		misceffect 406, "area#r1051";
		hideonnpc "area#k1051";
		hideoffnpc "area#r1051";
		killmonster "1_tiamat_42.gat","tiamat_mob#r105::OnKilled3";
	}
	announce "「謁見の間」⇔「執務室」、「バルコニー③」⇔「城内通路2F01」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer5000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_37.gat,131,92,4	script	守護天使の亡骸#r95	802,{/* 836 (hide)*/
	if(getvariableofnpc('flag,"古びた書物#97") == 0) {
		unittalk getcharid(3),"亡骸に封印が施されている…… どこかに解除する仕掛けがあるようだ",1;
		end;
	}
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r95"; //836
	initnpctimer;
	close;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	if(getvariableofnpc('flag,"古びた書物#97") == 0) {
		misceffect 675, "守護天使の亡骸#r95"; //836
		initnpctimer;
		end;
	}
	misceffect 934, "守護天使の亡骸#r95"; //836
	misceffect 668, "守護天使の亡骸#r95"; //836
	announce "？？？？ : 汝がここに至るは運命。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "アガリアレプト#r95",20473;
	hideoffnpc "アガリアレプト#r95"; //835
	misceffect 1065, "アガリアレプト#r95"; //835
	misceffect 1019, "アガリアレプト#r95"; //835
	announce "何者かの声が部屋中に響き、[城2F 謁見の間] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",121,82,141,102,"123";
	end;
OnTimer9000:
	misceffect 903, "アガリアレプト#r95"; //835
	announce "アガリアレプト : そして、ここで果てるも運命。……運命を受け入れよ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "アガリアレプト#r95"; //835
	setnpcdisplay "アガリアレプト#r95",844;
	monster "this",131,92,"運命の輪の化身",20473,1,"tiamat_mob#r95::OnKilled5";
	end;
}
1_tiamat_39.gat,31,173,1	script	釣鐘の部品#r1701_1	10025,{/* 862 */
	if(!checkweight(25362,1))
		unittalk getcharid(3),strcharinfo(0)+" : 釣鐘の部品を持ち上げられなかった……。",1;
	else if(countitem(25362))
		unittalk getcharid(3),strcharinfo(0)+" : 壊さないようにひとつずつ運ぼう。",1;
	else {
		getitem 25362, 1;
		unittalk getcharid(3),strcharinfo(0)+" : 「釣鐘の部品」を手に入れた",1;
		misceffect 18; //863
		cloakonnpc;
		end;
	}
}
1_tiamat_39.gat,31,175,1	duplicate(釣鐘の部品#r1701_1)	釣鐘の部品#r1701_2	10025	/* 863 */
1_tiamat_39.gat,18,189,1	duplicate(釣鐘の部品#r1701_1)	釣鐘の部品#r1701_3	10025	/* 864 */
1_tiamat_39.gat,14,188,1	duplicate(釣鐘の部品#r1701_1)	釣鐘の部品#r1701_4	10025	/* 865 */

1_tiamat_39.gat,72,155,4	script	レバー#105_1	10042,{/* 866 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[カタコンベ カタコンベ倉庫] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r198") == 0) {	// カタコンベ通路、倒してたら解放
		misceffect 234, "area#r1983";
		misceffect 234, "area#r1984";
		misceffect 234, "area#r1985";
		misceffect 234, "area#r1986";
		misceffect 406, "area#k1983";
		misceffect 406, "area#k1984";
		misceffect 406, "area#k1985";
		misceffect 406, "area#k1986";
		killmonster "1_tiamat_23.gat","tiamat_mob#r198::OnKilled2";
		hideonnpc "area#k1983";
		hideonnpc "area#k1984";
		hideonnpc "area#k1985";
		hideonnpc "area#k1986";
		hideoffnpc "area#r1983";
		hideoffnpc "area#r1984";
		hideoffnpc "area#r1985";
		hideoffnpc "area#r1986";
	}
	announce "「カタコンベ通路」⇔「墓①～④」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_40.gat,22,28,4	script	ウェルキエル#r8	844,{/* 881 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<7);
	announce "第8の守護天使 力の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_40.gat,22,28,4	script	守護天使の亡骸#r8	802,{/* 882 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r8"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r8"; //496
	misceffect 668, "守護天使の亡骸#r8"; //496
	announce "？？？？ : 力無き者に、生きる価値無し。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ウェルキエル#r8",20461;
	hideoffnpc "ウェルキエル#r8"; //495
	misceffect 1065, "ウェルキエル#r8"; //495
	misceffect 1019, "ウェルキエル#r8"; //495
	announce "何者かの声が部屋中に響き、[その他 ペコ舎] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",12,18,32,38,"123";
	end;
OnTimer9000:
	misceffect 903, "ウェルキエル#r8"; //495
	announce "ウェルキエル : 力無き者よ。己の非力を嘆くのだな。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ウェルキエル#r8"; //495
	setnpcdisplay "ウェルキエル#r8",844;
	monster "this",22,28,"力の化身",20461,1,"tiamat_mob#r8::OnKilled2";
	end;
}
1_tiamat_41.gat,108,31,4	script	レバー#201_1	10042,{/* 895 */
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		set '@count,getmapmobs("this","tiamat_mob#r16::OnKilled2");
		if('@count) {
			unittalk getcharid(3),strcharinfo(0)+" : 鍵がかかっている……",1;
			end;
		}
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城壁 城門①3F] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r37") == 0) {	// 塔・南① 3F、倒してたら解放
		misceffect 234, "area#r373";
		misceffect 406, "area#k373";
		killmonster "1_tiamat_08.gat","tiamat_mob#r37::OnKilled2";
		hideonnpc "area#k373"; //1258
		hideoffnpc "area#r373"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r50") == 0) {	// 塔・南西 3F、倒してたら解放
		misceffect 234, "area#r503";
		misceffect 234, "area#r504";
		misceffect 406, "area#k503";
		misceffect 406, "area#k504";
		killmonster "1_tiamat_08.gat","tiamat_mob#r50::OnKilled2";
		hideonnpc "area#k503"; //1258
		hideonnpc "area#k504"; //1258
		hideoffnpc "area#r503"; //1258
		hideoffnpc "area#r504"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r54") == 0) {	// 塔・西 3F、倒してたら解放
		misceffect 234, "area#r544";
		misceffect 406, "area#k544";
		killmonster "1_tiamat_08.gat","tiamat_mob#r54::OnKilled2";
		hideonnpc "area#k544"; //1258
		hideoffnpc "area#r544"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r70") == 0) {	// 塔・北①2F、倒してたら解放
		misceffect 234, "area#r703";
		misceffect 406, "area#k703";
		killmonster "1_tiamat_08.gat","tiamat_mob#r70::OnKilled2";
		hideonnpc "area#k703"; //1258
		hideoffnpc "area#r703"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r52") == 0) {	// 塔・西1F、倒してたら解放
		misceffect 234, "area#r522";
		misceffect 406, "area#k522";
		killmonster "1_tiamat_08.gat","tiamat_mob#r52::OnKilled2";
		hideonnpc "area#k522"; //1258
		hideoffnpc "area#r522"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r4") == 0) {	// 中庭(西)、倒してたら解放
		misceffect 234, "area#r45";
		misceffect 406, "area#k45";
		killmonster "1_tiamat_13.gat","tiamat_mob#r4::OnKilled3";
		hideonnpc "area#k45"; //1258
		hideoffnpc "area#r45"; //1258
	}
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled3";
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled4";
	hideonnpc "area#k461"; //1258
	hideonnpc "area#k462"; //1258
	hideoffnpc "area#r461"; //1258
	hideoffnpc "area#r462"; //1258
	announce "「塔・南①3F」⇔「城壁通路01」、「塔・南西3F」⇔「城壁通路01」「城壁通路03」、「塔・西3F」⇔「城壁通路03」、「塔・北①2F」⇔「城壁2F04」、「塔・西1F」⇔「中庭(西)」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_41.gat,97,28,4	script	グローザ像#r16CG02	10275,{/* 897 */
	unittalk "反応がない…ただの彫像のようだ……";
	end;
OnStart:
	hideonnpc "デヒョン像#k37CG03";
	hideonnpc "ヒュリエル像#k50CG04";
	hideonnpc "ジオイア像#k62CG05";
	hideonnpc "カデス像#k71CG06";
	monster "1_tiamat_08.gat",208,301,"デヒョン像",20446,1,"tiamat_mob#r37::OnDaehyon";
	monster "1_tiamat_08.gat",180,179,"ヒュリエル像",20450,1,"tiamat_mob#r50::OnPyuriel";
	monster "1_tiamat_41.gat",22,87,"ジオイア像",20444,1,"tiamat_mob#r62::OnGioia";
	monster "1_tiamat_08.gat",207,385,"カデス像",20448,1,"tiamat_mob#r71::OnKades";
	set 'flag,0;
	set 'CG03,rand(1,9);
	set 'CG04,rand(1,9);
	set 'CG05,rand(1,9);
	set 'CG06,rand(1,9);
	end;
OnDaehyon:
	hideoffnpc "デヒョン像#r37CG03";
	donpcevent "デヒョン像#r37CG03::OnStart";
	set 'flag,'flag|1;
	if('flag == 15)
		initnpctimer;
	end;
OnPyuriel:
	hideoffnpc "ヒュリエル像#r50CG04";
	donpcevent "ヒュリエル像#r50CG04::OnStart";
	set 'flag,'flag|2;
	if('flag == 15)
		initnpctimer;
	end;
OnGioia:
	hideoffnpc "ジオイア像#r62CG05";
	donpcevent "ジオイア像#r62CG05::OnStart";
	set 'flag,'flag|4;
	if('flag == 15)
		initnpctimer;
	end;
OnKades:
	hideoffnpc "カデス像#r71CG06";
	donpcevent "カデス像#r71CG06::OnStart";
	set 'flag,'flag|8;
	if('flag == 15)
		initnpctimer;
	end;
OnTimer1000:
	mapannounce "1_tiamat_08.gat","全ての四怨将の像が倒されました　120秒後に[城壁 城門①3F] にて像へ入力する数字の投票を行います", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_41.gat","全ての四怨将の像が倒されました　120秒後に[城壁 城門①3F] にて像へ入力する数字の投票を行います", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer119000:
	hideoffnpc "四騎士ローウェン#302_1"; //1809
	end;
OnTimer121000:
	announce "四騎士ローウェン : さて、全ての四怨将の像に力は示しましたが、どの数字を入力すれば……？", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer124000:
	announce "四騎士ローウェン : 皆様の力をお貸しください。問いに対して正解だと思う方の旗に集まってください。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer127000:
	announce "問1 : 「ソード」の示す数字を答えよ", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer130000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG03],1;
	if(rand(2)) {
		set 'id[1],'CG03;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG03;
	}
	unittalk getnpcid(0,"旗（左）#r161"),"左 : ソードの示す数字は「" +'id[1]+ "」";
	unittalk getnpcid(0,"旗（右）#r161"),"右 : ソードの示す数字は「" +'id[2]+ "」";
	end;
OnTimer133000:
	announce "10秒後に旗の周りにいる人数を確認します", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer138000:
	announce "5……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer139000:
	announce "4……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer140000:
	announce "3……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer141000:
	announce "2……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer142000:
	announce "1……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer143000:
	emotion 21, "四騎士ローウェン#302_1"; //1809
	misceffect 191, "旗（左）#r161"; //900
	misceffect 191, "旗（右）#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[1],'id[1];
	else
		set 'select[1],'id[2];
	end;
OnTimer146000:
	announce "問2 : 「ワンド」の示す数字を答えよ", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer149000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG04],1;
	if(rand(2)) {
		set 'id[1],'CG04;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG04;
	}
	unittalk getnpcid(0,"旗（左）#r161"),"左 : ワンドの示す数字は「" +'id[1]+ "」";
	unittalk getnpcid(0,"旗（右）#r161"),"右 : ワンドの示す数字は「" +'id[2]+ "」";
	end;
OnTimer152000:
	announce "10秒後に旗の周りにいる人数を確認します", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer157000:
	announce "5……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer158000:
	announce "4……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer159000:
	announce "3……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer160000:
	announce "2……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer161000:
	announce "1……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer162000:
	emotion 21, "四騎士ローウェン#302_1"; //1809
	misceffect 191, "旗（左）#r161"; //900
	misceffect 191, "旗（右）#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[2],'id[1];
	else
		set 'select[2],'id[2];
	end;
	end;
OnTimer165000:
	announce "問3 : 「コイン」の示す数字を答えよ", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer168000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG05],1;
	if(rand(2)) {
		set 'id[1],'CG05;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG05;
	}
	unittalk getnpcid(0,"旗（左）#r161"),"左 : コインの示す数字は「" +'id[1]+ "」";
	unittalk getnpcid(0,"旗（右）#r161"),"右 : コインの示す数字は「" +'id[2]+ "」";
	end;
OnTimer171000:
	announce "10秒後に旗の周りにいる人数を確認します", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer176000:
	announce "5……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer177000:
	announce "4……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer178000:
	announce "3……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer179000:
	announce "2……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer180000:
	announce "1……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer181000:
	emotion 21, "四騎士ローウェン#evt302"; //1809
	misceffect 191, "旗（左）#r161"; //900
	misceffect 191, "旗（右）#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[3],'id[1];
	else
		set 'select[3],'id[2];
	end;
	end;
OnTimer184000:
	announce "問4 : 「カップ」の示す数字を答えよ", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer187000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG06],1;
	if(rand(2)) {
		set 'id[1],'CG06;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG06;
	}
	unittalk getnpcid(0,"旗（左）#r161"),"左 : カップの示す数字は「" +'id[1]+ "」";
	unittalk getnpcid(0,"旗（右）#r161"),"右 : カップの示す数字は「" +'id[2]+ "」";
	end;
OnTimer190000:
	announce "10秒後に旗の周りにいる人数を確認します", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer195000:
	announce "5……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer196000:
	announce "4……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer197000:
	announce "3……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer198000:
	announce "2……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer199000:
	announce "1……", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer200000:
	emotion 21, "四騎士ローウェン#evt302"; //1809
	misceffect 191, "旗（左）#r161"; //900
	misceffect 191, "旗（右）#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[4],'id[1];
	else
		set 'select[4],'id[2];
	end;
	end;
OnTimer203000:
	announce "四騎士ローウェン : ご協力感謝します。それでは、回答を入力します。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer211000:
	announce "四騎士ローウェン : 答えは……「" +'select[1]+'select[2]+'select[3]+'select[4]+ "」です。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer216000:
	if('select[1] == 'CG03 && 'select[2] == 'CG04 && 'select[3] == 'CG05 && 'select[4] == 'CG06)
		announce "汝らを資格有りと認めてやろう　進むが良い……", 0x9, 0xff0000, 0x190, 30, 0, 0;
	else
		announce "汝らに資格無し　立ち去るが良い……", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer219000:
	if('select[1] != 'CG03 || 'select[2] != 'CG04 || 'select[3] != 'CG05 || 'select[4] != 'CG06) {
		stopnpctimer;
		hideonnpc "四騎士ローウェン#302_1"; //1809
		areamonster "this",86,6,110,29,"魔女のしもべ",20482,5,strnpcinfo(0)+ "::OnKilled";
		areamonster "this",86,6,110,29,"魔女のしもべ",20483,5,strnpcinfo(0)+ "::OnKilled";
		areamonster "this",86,6,110,29,"魔女のしもべ",20484,5,strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnTimer222000:
	announce "「四騎士ローウェン」が「水門①開閉装置作動キー」を入手しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer225000:
	misceffect 406, "レバー#201_1"; //895
	announce "[城壁 城門①3F] のレバーの鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	killmonster "1_tiamat_41.gat","tiamat_mob#r16::OnKilled2";
	end;
OnTimer229000:
	announce "四騎士ローウェン : 鍵が手に入りました。それでは、水門①へ向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer232000:
	hideonnpc "四騎士ローウェン#3007_1"; //1932
	hideonnpc "四騎士ローウェン#302_1"; //1809
	end;
OnTimer235000:
	stopnpctimer;
	hideoffnpc "四騎士ローウェン#3008_1"; //1939
	hideoffnpc "四騎士ローウェン#3008_2"; //1939
	hideoffnpc "四騎士ローウェン#3008_3"; //1939
	hideoffnpc "四騎士ローウェン#3008_4"; //1939
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,8;
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count <= 0) {
		setnpctimer 119000;
		startnpctimer;
		hideoffnpc "四騎士ローウェン#302_1"; //1809
	}
	end;
}
1_tiamat_41.gat,22,87,4	script	ジオイア像#k62CG05	10276,{/* 898 (hide)*/
	unittalk "反応がない…ただの彫像のようだ……";
	end;
}
1_tiamat_41.gat,22,87,4	script	ジオイア像#r62CG05	10276,{/* 899 */
	setarray '@str$[1],"魔術師","女教皇","女帝","皇帝","法王","恋人","戦車","力","隠者";
	unittalk "われが司るは「コイン」、示すは「" +'@str$['flag]+ "」";
	end;
OnStart:
	unittalk "「ジオイア像」が利用可能になりました";
	set 'flag,getvariableofnpc('CG05,"グローザ像#r16CG02");
	end;
}
1_tiamat_41.gat,90,20,4	script	旗（左）#r161	974,{/* 900 */}
1_tiamat_41.gat,104,20,4	script	旗（右）#r161	973,{/* 901 */}
1_tiamat_42.gat,96,83,5	script	？？？？#r7	844,{/* 948 */
	warp "1_tiamat_42.gat",146,332;
	end;
OnStart:
	initnpctimer;
	hideoffnpc;
	end;
OnTimer3000:
	initnpctimer;
	misceffect 6, "？？？？#r7"; //948
	end;
}
1_tiamat_42.gat,371,152,1	script	白磁のお皿#116_01	3455,{/* 949 */}
1_tiamat_42.gat,368,152,1	script	白磁のお皿#116_02	3455,{/* 950 */}
1_tiamat_42.gat,367,152,1	script	白磁のお皿#116_03	3455,{/* 951 */}
1_tiamat_42.gat,363,152,1	script	白磁のお皿#116_04	3455,{/* 952 (hide)*/}
1_tiamat_42.gat,357,143,1	script	白磁のお皿#116_05	3455,{/* 953 */}
1_tiamat_42.gat,357,140,1	script	白磁のお皿#116_06	3455,{/* 954 (hide)*/}
1_tiamat_42.gat,359,144,1	script	白磁のお皿#116_07	3455,{/* 955 */}
1_tiamat_42.gat,359,140,1	script	白磁のお皿#116_08	3455,{/* 956 (hide)*/}
1_tiamat_42.gat,357,135,1	script	白磁のお皿#116_09	3455,{/* 957 */}
1_tiamat_42.gat,357,133,1	script	白磁のお皿#116_10	3455,{/* 958 (hide)*/}
1_tiamat_42.gat,359,135,1	script	白磁のお皿#116_11	3455,{/* 959 */}
1_tiamat_42.gat,359,132,1	script	白磁のお皿#116_12	3455,{/* 960 */}
1_tiamat_42.gat,357,124,1	script	白磁のお皿#116_13	3455,{/* 961 (hide)*/}
1_tiamat_42.gat,357,122,1	script	白磁のお皿#116_14	3455,{/* 962 */}
1_tiamat_42.gat,359,124,1	script	白磁のお皿#116_15	3455,{/* 963 (hide)*/}
1_tiamat_42.gat,376,144,1	script	白磁のお皿#116_16	3455,{/* 964 */}
1_tiamat_42.gat,377,141,1	script	白磁のお皿#116_17	3455,{/* 965 */}
1_tiamat_42.gat,376,133,1	script	白磁のお皿#116_18	3455,{/* 966 */}
1_tiamat_42.gat,376,125,1	script	白磁のお皿#116_19	3455,{/* 967 */}
1_tiamat_42.gat,376,123,1	script	白磁のお皿#116_20	3455,{/* 968 (hide)*/}
1_tiamat_42.gat,378,126,1	script	白磁のお皿#116_21	3455,{/* 969 */}
1_tiamat_42.gat,266,88,4	script	レバー#008_1	10042,{/* 979 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城2F 執務室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	if(getvariableofnpc('flag,"tiamat_mob#r105") == 0) {
		killmonster "1_tiamat_42.gat","tiamat_mob#r105::OnKilled2";
		misceffect 234, "area#r1057";
		misceffect 406, "area#r1057";
		hideonnpc "area#k1057"; //1258
		hideoffnpc "area#r1057"; //1258
	}
	announce "「城内通路2F01」⇔「医務室」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_42.gat,314,272,4	script	レバー#010_1	10042,{/* 980 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城3F 食堂] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r122::OnKilled2";
	misceffect 234, "area#r1222";
	misceffect 406, "area#r1222";
	hideonnpc "area#k1222"; //1258
	hideoffnpc "area#r1222"; //1258
	announce "「城内通路3F02」⇔「城内通路3F03」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_42.gat,181,16,4	script	アスモデル#r108	844,{/* 984 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<4);
	announce "第5の守護天使 法王の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_42.gat,181,16,4	script	守護天使の亡骸#r108	802,{/* 985 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r108"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r108"; //496
	misceffect 668, "守護天使の亡骸#r108"; //496
	announce "？？？？ : 迷える子羊よ。救いが欲しければ我に祈りを捧げるのです。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "アスモデル#r108",20458;
	hideoffnpc "アスモデル#r108"; //495
	misceffect 1065, "アスモデル#r108"; //495
	misceffect 1019, "アスモデル#r108"; //495
	announce "何者かの声が部屋中に響き、[城3F 王の部屋] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_42.gat",171,6,191,26,"123";
	end;
OnTimer9000:
	misceffect 903, "アスモデル#r108"; //495
	announce "アスモデル : さすれば天国への扉が開かれます……拒否する者は地獄に堕ちなさい。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "アスモデル#r108"; //495
	setnpcdisplay "アスモデル#r108",844;
	monster "this",181,16,"法王の化身",20458,1,"tiamat_mob#r108::OnKilled2";
	end;
}
1_tiamat_42.gat,21,101,4	script	ハマリエル#r110	844,{/* 986 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<8);
	announce "第9の守護天使 隠者の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_42.gat,21,101,4	script	守護天使の亡骸#r110	802,{/* 987 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r110"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r110"; //496
	misceffect 668, "守護天使の亡骸#r110"; //496
	announce "？？？？ : ここは汝のいるべき場所ではない。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ハマリエル#r110",20462;
	hideoffnpc "ハマリエル#r110"; //495
	misceffect 1065, "ハマリエル#r110"; //495
	misceffect 1019, "ハマリエル#r110"; //495
	announce "何者かの声が部屋中に響き、[城3F 王子の部屋] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_42.gat",11,91,31,111,"123";
	end;
OnTimer9000:
	misceffect 903, "ハマリエル#r110"; //495
	announce "ハマリエル : 間違いは正さねばならぬ。我が導こう。汝が帰るべき永劫の闇に。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ハマリエル#r110"; //495
	setnpcdisplay "ハマリエル#r110",844;
	monster "this",21,101,"隠者の化身",20462,1,"tiamat_mob#r110::OnKilled2";
	end;
}
1_tiamat_42.gat,190,88,4	script	バキエル#r111	844,{/* 988 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<17);
	announce "第18の守護天使 月の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_42.gat,190,88,4	script	守護天使の亡骸#r111	802,{/* 989 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r111"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r111"; //496
	misceffect 668, "守護天使の亡骸#r111"; //496
	announce "？？？？ : ふんふふ～～ん♪　ようこそ～いらっしゃいました～。歓迎歓迎～。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "バキエル#r111",20468;
	hideoffnpc "バキエル#r111"; //495
	misceffect 1065, "バキエル#r111"; //495
	misceffect 1019, "バキエル#r111"; //495
	announce "何者かの声が部屋中に響き、[城3F 王女の部屋] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_42.gat",180,78,200,98,"123";
	end;
OnTimer9000:
	misceffect 903, "バキエル#r111"; //495
	announce "バキエル : あ、生きて帰れると思わないでね？　永遠にバイバイだよ～！", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "バキエル#r111"; //495
	setnpcdisplay "バキエル#r111",844;
	monster "this",190,88,"月の化身",20468,1,"tiamat_mob#r111::OnKilled2";
	end;
}
1_tiamat_43.gat,18,41,4	script	レバー#006_3	10042,{/* 1046 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		if(getvariableofnpc('flag,"レバー#006_1")+getvariableofnpc('flag,"レバー#006_2") == 2)
			initnpctimer;
		announce "[貴賓室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r80::OnKilled2";
	misceffect 234, "area#r803";
	misceffect 406, "area#r803";
	hideonnpc "area#k803"; //1258
	hideoffnpc "area#r803"; //1258
	mapannounce "1_tiamat_42.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_09.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_43.gat","「エントランス」⇔「バルコニー①」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_51.gat,356,130,4	script	アドナキエル#r156	844,{/* 1154 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<13);
	announce "第14の守護天使 節制の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_51.gat,356,130,4	script	守護天使の亡骸#r156	802,{/* 1155 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r156"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r156"; //496
	misceffect 668, "守護天使の亡骸#r156"; //496
	announce "？？？？ : 驕り、慢心、自惚れは、自らの身を滅ぼすだろう。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "アドナキエル#r156",20465;
	hideoffnpc "アドナキエル#r156"; //495
	misceffect 1065, "アドナキエル#r156"; //495
	misceffect 1019, "アドナキエル#r156"; //495
	announce "何者かの声が部屋中に響き、[使用人居住区 召使い部屋] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_19.gat",16,16,43,39,"123";
	end;
OnTimer9000:
	misceffect 903, "アドナキエル#r156"; //495
	announce "アドナキエル : ……お前のことを言っている。身を以て知るが良い。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "アドナキエル#r156"; //495
	setnpcdisplay "アドナキエル#r156",844;
	monster "this",356,130,"節制の化身",20465,1,"tiamat_mob#r156::OnKilled2";
	end;
}
1_tiamat_52.gat,119,139,1	script	神官の彫像#r177	10045,{/* 1166 */
	misceffect 9,"";	// self
	mes "‐彫像の前に立つと";
	mes "　頭の中に声が響いた‐";
	next;
	unittalk "汝の信仰心を示せ……",1;	// 1417
	mes "[？？？？]";
	mes "汝の信仰心(LUK)を示せ……";
	next;
	if(select("少し考える","彫像に触れる") == 2) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	set '@req_luk,(checkquest(123655))? 100: 300;
	if(readparam(bLuk) < '@req_luk) {
		unittalk "信心が足りぬ…　異教徒には死を……",1;	// 1417
		mes "[？？？？]";
		mes "信心が足りぬ…　異教徒には死を……";
		misceffect 59;	// 1417
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		misceffect 124,"";	// self
		soundeffect "lady_tanee_die.wav", 0, 0;	// 0
		percentheal -100,0;
		close;
	}
	set 'flag,1;
	// TODO
	unittalk "信じる者に祝福を……",1;	// 1417
	mes "[？？？？]";
	mes "信じる者に祝福を……";
	if(getvariableofnpc('flag,"tiamat_mob#r176") == 0) {
		hideoffnpc "area#r1762";
		hideoffnpc "area#r1764";
	}
	else {
		hideoffnpc "area#k1762";
		monster "1_tiamat_53.gat",231,291,"#EF_002",3869,1,"tiamat_mob#r176::OnKilled2";
		hideoffnpc "area#k1764";
		monster "1_tiamat_53.gat",288,291,"#EF_002",3869,1,"tiamat_mob#r176::OnKilled2";
	}
	mapannounce "1_tiamat_52.gat","「神殿大広間」⇔「騎士の間」、「王妃の間」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_53.gat","「神殿大広間」⇔「騎士の間」、「王妃の間」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	close;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_53.gat,183,190,4	script	ズリエル#r178	844,{/* 1187 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<10);
	announce "第11の守護天使 正義の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_53.gat,183,190,4	script	守護天使の亡骸#r178	802,{/* 1188 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r178"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r178"; //496
	misceffect 668, "守護天使の亡骸#r178"; //496
	announce "？？？？ : 我が剣は断罪の剣。罪人は我が刃から逃げる術無し。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ズリエル#r178",20463;
	hideoffnpc "ズリエル#r178"; //495
	misceffect 1065, "ズリエル#r178"; //495
	misceffect 1019, "ズリエル#r178"; //495
	announce "何者かの声が部屋中に響き、[神殿1F 騎士の間] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_53.gat",173,180,193,200,"123";
	end;
OnTimer9000:
	misceffect 903, "ズリエル#r178"; //495
	announce "ズリエル : 覚悟せよ大罪人。汝に酌量の余地無し。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ズリエル#r178"; //495
	setnpcdisplay "ズリエル#r178",844;
	monster "this",183,190,"正義の化身",20463,1,"tiamat_mob#r178::OnKilled2";
	end;
}
1_tiamat_53.gat,41,240,4	script	サタン#r179	844,{/* 1189 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<20);
	announce "第21の守護天使 世界の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_53.gat,41,240,4	script	守護天使の亡骸#r179	802,{/* 1190 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r179"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r179"; //496
	misceffect 668, "守護天使の亡骸#r179"; //496
	announce "？？？？ : 完成された世界の崩壊を望む者よ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "サタン#r179",20478;
	hideoffnpc "サタン#r179"; //495
	misceffect 1065, "サタン#r179"; //495
	misceffect 1019, "サタン#r179"; //495
	announce "何者かの声が部屋中に響き、[神殿1F 王妃の間] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_53.gat",31,230,51,250,"123";
	end;
OnTimer9000:
	misceffect 903, "サタン#r179"; //495
	announce "サタン : この世界は完璧でなければならない。不完全な汝を完全に排除する。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "サタン#r179"; //495
	setnpcdisplay "サタン#r179",844;
	monster "this",41,240,"世界の化身",20478,1,"tiamat_mob#r179::OnKilled2";
	end;
}
1_tiamat_53.gat,260,279,4	script	ムリエル#r176	844,{/* 1191 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<6);
	announce "第7の守護天使 戦車の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_53.gat,260,279,4	script	守護天使の亡骸#r176	802,{/* 1192 */
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r176"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r176"; //496
	misceffect 668, "守護天使の亡骸#r176"; //496
	announce "？？？？ : 我が前に立つとは愚か也。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "ムリエル#r176",20460;
	hideoffnpc "ムリエル#r176"; //495
	misceffect 1065, "ムリエル#r176"; //495
	misceffect 1019, "ムリエル#r176"; //495
	announce "何者かの声が部屋中に響き、[神殿1F 神殿大広間] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_53.gat",31,230,51,250,"123";
	end;
OnTimer9000:
	misceffect 903, "ムリエル#r176"; //495
	announce "ムリエル : 我が前に立ち、無事に立っていた者は皆無也。無惨な屍を我が前に晒せ。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "ムリエル#r176"; //495
	setnpcdisplay "ムリエル#r176",844;
	monster "this",260,279,"戦車の化身",20460,1,"tiamat_mob#r176::OnKilled3";
	end;
}
1_tiamat_54.gat,38,110,4	script	レバー#001_1	10042,{/* 1229 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[教会1F 会議室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r158") == 0) {	// 礼拝堂、倒してたら解放
		misceffect 234, "area#r1584";
		misceffect 406, "area#k1584";
		killmonster "1_tiamat_44.gat","tiamat_mob#r158::OnKilled2";
		hideonnpc "area#k1584"; //1258
		hideoffnpc "area#r1584"; //1258
	}
	announce "「礼拝堂」⇔「教会1F通路02」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,256,109,4	script	レバー#002_1	10042,{/* 1230 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[教会2F 会議室①] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r169") == 0) {	// 教会2F通路02、倒してたら解放
		misceffect 234, "area#r1693";
		misceffect 406, "area#k1693";
		killmonster "1_tiamat_54.gat","tiamat_mob#r169::OnKilled2";
		hideonnpc "area#k1693"; //1258
		hideoffnpc "area#r1693"; //1258
	}
	announce "「教会2F通路02」⇔「教会2F会議室②」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,309,89,4	script	レバー#003_1	10042,{/* 1231 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[教会2F 会議室②] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r169") == 0) {	// 教会2F通路02、倒してたら解放
		misceffect 234, "area#r1692";
		misceffect 406, "area#k1692";
		killmonster "1_tiamat_54.gat","tiamat_mob#r169::OnKilled3";
		hideonnpc "area#k1692"; //1258
		hideoffnpc "area#r1692"; //1258
		donpcevent "area#r1692::OnStart";
	}
	announce "「教会2F通路02」⇔「教会2F執務室」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,309,104,4	script	レバー#004_1	10042,{/* 1232 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[教会2F 執務室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r168") == 0) {	// 教会2F通路01、倒してたら解放
		misceffect 234, "area#r1684";
		misceffect 406, "area#k1684";
		killmonster "1_tiamat_54.gat","tiamat_mob#r168::OnKilled2";
		hideonnpc "area#k1684"; //1258
		hideoffnpc "area#r1684"; //1258
		donpcevent "area#r1684::OnStart";
	}
	announce "「教会2F通路01」⇔「教会2F大会議室」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,236,164,4	script	レバー#005_1	10042,{/* 1233 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
		if('@count) {
			unittalk getcharid(3),strcharinfo(0)+" : 鍵がかかっている……",1;
			end;
		}
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[教会2F 大会議室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r162") == 0) {	// 教会1F通路01、倒してたら解放
		misceffect 234, "area#r1622";
		misceffect 406, "area#k1622";
		killmonster "1_tiamat_54.gat","tiamat_mob#r162::OnKilled2";
		hideonnpc "area#k1622"; //1258
		hideoffnpc "area#r1622"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r4") == 0) {	// 中庭(西)、倒してたら解放
		misceffect 234, "area#r44";
		misceffect 406, "area#k44";
		killmonster "1_tiamat_13.gat","tiamat_mob#r4::OnKilled2";
		hideonnpc "area#k44"; //1258
		hideoffnpc "area#r44"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {	// 南井戸の底、倒してたら解放
		misceffect 234, "area#r131";
		misceffect 406, "area#k131";
		killmonster "1_tiamat_05.gat","tiamat_mob#r13::OnKilled2";
		hideonnpc "area#k131"; //1258
		hideoffnpc "area#r131"; //1258
	}
	announce "「教会1F通路01」⇔「鐘楼1F」、「中庭(西)」⇔「南井戸の底」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	setcell "this",236,163,0;
	monster "this",236,163,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled";
	set 'flag,0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,242,164,4	script	アムブリエル#r166	844,{/* 1154 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<5);
	announce "第6の守護天使 恋人の化身 討滅完了 !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	misceffect 406, "レバー#005_1";
	killmonster "1_tiamat_54.gat","レバー#005_1::OnKilled";
	end;
OnTimer3000:
	stopnpctimer;
	announce "[神殿B2F 地下祭壇] に守護天使の魂が捧げられました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_54.gat,242,164,4	script	守護天使の亡骸#r166	802,{/* 1155 (hide)*/
	mes "‐霊魂が禍々しい力の波動を放っている…";
	mes "　守護天使の亡霊を呼び出しますか？‐";
	mes "　";
	mes "　^ff0000亡霊を呼び出すと";
	mes "　戦闘が開始されます。^000000";
	next;
	if(select("少し考える","呼び出す") == 1) {
		mes "‐あなたは立ち去った‐";
		close;
	}
	hideonnpc "守護天使の亡骸#r166"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "守護天使の亡骸#r166"; //496
	misceffect 668, "守護天使の亡骸#r166"; //496
	announce "？？？？ : 愛……それは何よりも価値のあるもの。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "アムブリエル#r166",20459;
	hideoffnpc "アムブリエル#r166"; //495
	misceffect 1065, "アムブリエル#r166"; //495
	misceffect 1019, "アムブリエル#r166"; //495
	announce "何者かの声が部屋中に響き、[教会2F大会議室] にモンスターが出現した", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_19.gat",16,16,43,39,"123";
	end;
OnTimer9000:
	misceffect 903, "アムブリエル#r166"; //495
	announce "アムブリエル : 永遠に醒めない夢の世界で愛を語り合いましょう……逃がしはしない。", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "アムブリエル#r166"; //495
	setnpcdisplay "アムブリエル#r166",844;
	monster "this",242,164,"恋人の化身",20459,1,"tiamat_mob#r166::OnKilled2";
	end;
}
1_tiamat_56.gat,152,126,4	script	レバー#102_1	10042,{/* 1276 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城壁  城壁2F08] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r64") == 0) {	// 塔・北東B1F、倒してたら解放
		misceffect 234, "area#r641";
		misceffect 406, "area#k641";
		killmonster "1_tiamat_25.gat","tiamat_mob#r64::OnKilled2";
		hideonnpc "area#k641"; //1258
		hideoffnpc "area#r641"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r65") == 0) {	// 塔・北東1F、倒してたら解放
		misceffect 234, "area#r652";
		misceffect 406, "area#k652";
		killmonster "1_tiamat_08.gat","tiamat_mob#r65::OnKilled2";
		hideonnpc "area#k652"; //1258
		hideoffnpc "area#r652"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r66") == 0) {	// 塔・北東2F、倒してたら解放
		misceffect 234, "area#r661";
		misceffect 406, "area#k661";
		killmonster "1_tiamat_08.gat","tiamat_mob#r66::OnKilled2";
		hideonnpc "area#k661"; //1258
		hideoffnpc "area#r661"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r67") == 0) {	// 塔・北東3F、倒してたら解放
		misceffect 234, "area#r672";
		misceffect 406, "area#k672";
		killmonster "1_tiamat_08.gat","tiamat_mob#r67::OnKilled2";
		hideonnpc "area#k672"; //1258
		hideoffnpc "area#r672"; //1258
	}
	announce "「塔・北東1F」⇔「塔・北東B1F」、「塔・北東2F」⇔「塔・北東3F」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_56.gat,133,25,4	script	レバー#103_1	10042,{/* 1277 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城壁 城壁2F07] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r24") == 0) {	// 城壁2F06、倒してたら解放
		misceffect 234, "area#r241";
		misceffect 234, "area#r243";
		misceffect 406, "area#k241";
		misceffect 406, "area#k243";
		killmonster "1_tiamat_56.gat","tiamat_mob#r24::OnKilled2";
		hideonnpc "area#k241"; //1258
		hideonnpc "area#k243"; //1258
		hideoffnpc "area#r241"; //1258
		hideoffnpc "area#r243"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r25") == 0) {	// 城壁2F07、倒してたら解放
		misceffect 234, "area#r251";
		misceffect 406, "area#k251";
		killmonster "1_tiamat_56.gat","tiamat_mob#r25::OnKilled2";
		hideonnpc "area#k251"; //1258
		hideoffnpc "area#r251"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r45") == 0) {	// 塔・南東2F、倒してたら解放
		misceffect 234, "area#r451";
		misceffect 406, "area#k451";
		killmonster "1_tiamat_17.gat","tiamat_mob#r45::OnKilled3";
		hideonnpc "area#k451"; //1258
		hideoffnpc "area#r451"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r66") == 0) {	// 塔・北東 2F、倒してたら解放
		misceffect 234, "area#r664";
		misceffect 406, "area#k664";
		killmonster "1_tiamat_08.gat","tiamat_mob#r66::OnKilled3";
		hideonnpc "area#k664"; //1258
		hideoffnpc "area#r664"; //1258
	}
	announce "「城壁2F06」⇔「塔・南東2F」「兵舎2F武器庫」、「城壁2F07」⇔「塔・北東2F」の扉の鍵が開いた", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_58.gat,161,281,0	script	#転送21_01	139,1,1,{/* 1325 (hide)*/
	showmessage "ウアアアアアアアアアアッ!!!!","";
	misceffect 729,""; //self
	misceffect 34,""; //self
	if(!sleep2(2000)) end;
	warp "1_tiamat_12.gat",8,228;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 36; //393
	misceffect 34; //393
	end;
}
1_tiamat_58.gat,153,294,0	duplicate(#転送21_01)	#転送21_02	139,1,1	// 1326 (hide)
1_tiamat_58.gat,129,288,0	duplicate(#転送21_01)	#転送21_03	139,1,1	// 1327 (hide)
1_tiamat_58.gat,108,281,0	duplicate(#転送21_01)	#転送21_04	139,1,1	// 1328 (hide)
1_tiamat_58.gat,108,294,0	duplicate(#転送21_01)	#転送21_05	139,1,1	// 1329 (hide)
1_tiamat_58.gat,88,281,0	duplicate(#転送21_01)	#転送21_06	139,1,1	// 1330 (hide)
1_tiamat_58.gat,79,292,0	duplicate(#転送21_01)	#転送21_07	139,1,1	// 1331 (hide)
1_tiamat_58.gat,152,283,0	script	#罠21_08	139,1,1,{/* 1332 (hide)*/
	if(strnpcinfo(0) != "#罠21_05")
		pushpc 4,7;
	else
		pushpc 6,10;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 17; //393
	misceffect 69; //393
	end;
}
1_tiamat_58.gat,120,294,0	duplicate(#罠21_08)	#罠21_09	139,1,1	// 1333 (hide)
1_tiamat_58.gat,98,283,0	duplicate(#罠21_08)	#罠21_10	139,1,1	// 1334 (hide)





1_tiamat_60.gat,94,66,4	script	魔女ジラント#tia60	10272,{/* 1360 (hide)*/
	unittalk "魔女ジラント : ふふふ……我が城へようこそ。歓迎するぞ。";
	end;
OnStart:
	initnpctimer;
	end;
OnTimer30000:
	announce "魔女ジラント : ふふふ……我が城へようこそ。歓迎するぞ。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer35000:
	announce "王女メア : 我が城などと……貴女が王を……。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer40000:
	announce "王女メア : 王を操り、この城を乗っ取ったのは知っています。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer45000:
	announce "王女メア : 我々は貴女を討つために、ここに来たのです。覚悟なさい。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer50000:
	announce "魔女ジラント : そう熱くなるな。我は、お前たちの来訪を喜んでいるのだ。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer55000:
	announce "魔女ジラント : 豪華な晩餐を用意してある。お前たちをその席に招待しよう。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer60000:
	announce "魔女ジラント : 開始時間は日が沈み月が出る頃……。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer65000:
	announce "魔女ジラント : ふふっ、遅れるでないぞ。", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer70000:
	hideonnpc "四騎士ミルカ#1001_1"; //1813
	hideonnpc "四騎士ハウンド#2001_1"; //1868
	hideonnpc "四騎士ローウェン#3001_1"; //1932
	misceffect 34, "魔女ジラント#tia60"; //1360
	hideonnpc "魔女ジラント#tia60"; //1360
	end;
OnTimer75000:
	stopnpctimer;
	donpcevent "ルキフグス#tia60::OnStart";
	end;
}
1_tiamat_60.gat,98,58,1	script	王女メア#tia60	10361,{/* 1361 (hide)*/
	unittalk "王女メア : ……私は貴方には負けません。覚悟なさい。";
	end;
}
1_tiamat_60.gat,100,55,9	script	四騎士ミルカ#tia60	728,{/* 1362 (hide)*/
	unittalk "四騎士ミルカ : 貴方の悪行もここまでです！";
	end;
}
1_tiamat_60.gat,101,57,9	script	四騎士ハウンド#tia60	420,{/* 1363 (hide)*/
	unittalk "四騎士ハウンド : 姫様には指一本触れさせねえぜ。";
	end;
}
1_tiamat_60.gat,97,55,9	script	四騎士ローウェン#tia60	416,{/* 1364 (hide)*/
	unittalk "四騎士ローウェン : お出迎えとは…余裕ですね。";
	end;
}
1_tiamat_60.gat,94,66,4	script	ルキフグス#tia60	844,{/* 1365 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	setnpcdisplay "ルキフグス#tia60",20469;
	hideoffnpc "ルキフグス#tia60"; //1365
	misceffect 1065, "ルキフグス#tia60"; //1365
	misceffect 1019, "ルキフグス#tia60"; //1365
	areamusiceffect "1_tiamat_60.gat",94-14,66-14,94+14,66+14,"123";
	end;
OnTimer6000:
	misceffect 903, "ルキフグス#1_tiamat_60"; //1365
	announce "ルキフグス : ジラント様のお手を煩わせるまでもない。　ここで死ぬが良い！", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	setnpcdisplay "ルキフグス#tia60",844;
	hideonnpc "ルキフグス#tia60"; //1365
	hideonnpc "王女メア#tia60"; //1361
	hideonnpc "四騎士ミルカ#tia60"; //1362
	hideonnpc "四騎士ハウンド#tia60"; //1363
	hideonnpc "四騎士ローウェン#tia60"; //1364
	donpcevent "tiamat_mob#r15::OnStart";
	end;
}
1_tiamat_61.gat,106,108,4	script	古びた書物#97	10046,{/* 1379 */
	mes "^0000ff‐騎士は常に血肉を追い求める";
	mes "　そして、騎士と弓兵の心が";
	mes "　一つになる時、";
	mes "　運命の輪の化身が降臨する‐^000000";
	close2;
	//TODO
	if(getvariableofnpc('flag,"tiamat_mob#r96") > 0)
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r97") > 0)
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r98") > 0)
		end;
	set 'flag,1;
	killmonster "1_tiamat_37.gat","tiamat_mob#r95::OnKilled4";
	stopnpctimer "守護天使の亡骸#r95";
	hideonnpc;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_62.gat,24,105,4	script	レバー#011_1	10042,{/* 1389 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : レバーが見えるが、ここからでは手が届かない……。",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[城3F 王の寝室] のレバーを冒険者「"+strcharinfo(0)+"」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r122::OnKilled3";
	misceffect 234, "area#r1224";
	misceffect 406, "area#r1224";
	hideonnpc "area#k1224"; //1258
	hideoffnpc "area#r1224"; //1258
	mapannounce "1_tiamat_42.gat","「城内通路3F02」⇔「小礼拝堂」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_62.gat","「城内通路3F02」⇔「小礼拝堂」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
2_tiamat_00.gat,40,62,4	script	魔術師の魂#2_tiamat_00	2999,{/* 1410 */}
2_tiamat_00.gat,57,62,4	script	女教皇の魂#2_tiamat_00	1147,{/* 1411 */}
2_tiamat_00.gat,40,59,4	script	女帝の魂#2_tiamat_00	1630,{/* 1412 */}
2_tiamat_00.gat,57,59,4	script	皇帝の魂#2_tiamat_00	1038,{/* 1413 */}
2_tiamat_00.gat,40,56,4	script	法王の魂#2_tiamat_00	1157,{/* 1414 */}
2_tiamat_00.gat,57,56,4	script	恋人の魂#2_tiamat_00	1681,{/* 1415 */}
2_tiamat_00.gat,40,53,4	script	戦車の魂#2_tiamat_00	2362,{/* 1416 */}
2_tiamat_00.gat,57,53,4	script	力の魂#2_tiamat_00	1785,{/* 1417 */}
2_tiamat_00.gat,40,50,4	script	隠者の魂#2_tiamat_00	1418,{/* 1418 */}
2_tiamat_00.gat,57,50,4	script	運命の輪の魂#2_tiamat_00	1871,{/* 1419 */}
2_tiamat_00.gat,40,47,4	script	正義の魂#2_tiamat_00	1751,{/* 1420 */}
2_tiamat_00.gat,57,47,4	script	吊るされた男の魂#2_tiamat_00	1779,{/* 1421 */}
2_tiamat_00.gat,40,44,4	script	死神の魂#2_tiamat_00	1046,{/* 1422 */}
2_tiamat_00.gat,57,44,4	script	節制の魂#2_tiamat_00	2202,{/* 1423 */}
2_tiamat_00.gat,40,41,4	script	悪魔の魂#2_tiamat_00	1272,{/* 1424 */}
2_tiamat_00.gat,57,41,4	script	塔の魂#2_tiamat_00	1039,{/* 1425 */}
2_tiamat_00.gat,40,38,4	script	星の魂#2_tiamat_00	1734,{/* 1426 */}
2_tiamat_00.gat,57,38,4	script	月の魂#2_tiamat_00	1150,{/* 1427 */}
2_tiamat_00.gat,40,35,4	script	太陽の魂#2_tiamat_00	1832,{/* 1428 */}
2_tiamat_00.gat,57,35,4	script	審判の魂#2_tiamat_00	1373,{/* 1429 */}
2_tiamat_00.gat,40,32,4	script	世界の魂#2_tiamat_00	2022,{/* 1430 */}
2_tiamat_00.gat,57,32,4	script	愚者の魂#2_tiamat_00	1870,{/* 1431 */}
2_tiamat_00.gat,49,63,4	script	王女メア#2_tiamat_00	10361,{/* 1432 (hide)*/}
2_tiamat_02.gat,35,67,3	script	四騎士ミルカ#2_tiamat_0	728,{/* 1473 */
	if($@tiamat_main == 3)
		unittalk "四騎士ミルカ : 最後の戦いです。全力でまいりましょう。",1;	// 2665
	else
		unittalk "四騎士ミルカ : ここまで…長い戦いでしたね…。",1;	// 1598
	end;
}
2_tiamat_02.gat,34,69,3	script	四騎士ハウンド#2_tiamat	420,{/* 1474 */
	if($@tiamat_main == 3)
		unittalk "四騎士ハウンド : ここまで来たらもう言葉はいらねえな。歯を食いしばっていこうぜ。",1;	// 2666
	else
		unittalk "四騎士ハウンド : ……長い任務だったな。",1;	// 1599
	end;
}
2_tiamat_02.gat,37,68,3	script	四騎士ローウェン#2_tiam	416,{/* 1475 */
	if($@tiamat_main == 3)
		unittalk "四騎士ローウェン : 姫様の悲願、必ず成し遂げて見せます。",1;	// 2667
	else
		unittalk "四騎士ローウェン : ついに…終わったのですね…。",1;	// 1475
	end;
}
2_tiamat_02.gat,26,61,6	script	魔女ジラント#2_tiamat_0	10272,{/* 1516 */
	if($@tiamat_main == 3)
		unittalk "魔女ジラント : 貴様！　どうやって……ここに入って来たのだ!?",1;	// 2708
	end;
}
2_tiamat_02.gat,32,65,3	script	王女メア#2_tiamat_02	10361,{/* 1517 */
	if($@tiamat_main == 3)
		unittalk "王女メア : ついに魔女を追い詰めたのです。最終決戦とまいりましょう。",1;	// 2709
	end;
}
2_tiamat_02.gat,29,49,0	script	clear_01#2_tiamat_02	139,{/* 1523 (hide)*/}
2_tiamat_02.gat,29,73,0	script	clear_02#2_tiamat_02	139,{/* 1524 (hide)*/}
2_tiamat_02.gat,52,49,0	script	clear_03#2_tiamat_02	139,{/* 1525 (hide)*/}
2_tiamat_02.gat,52,73,0	script	clear_04#2_tiamat_02	139,{/* 1526 (hide)*/}

1_tiamat_37.gat,23,123,4	script	四騎士ミルカ#101_1	728,{/* 1784 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer4000:
	announce "四騎士ミルカ : ようやく礼拝堂まで辿り着いた。何か隠されていないか探しましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	hideonnpc "四騎士ミルカ#101_1"; //1811
	hideoffnpc "四騎士ミルカ#101_2"; //1812
	end;
OnTimer9000:
	emotion 0, "四騎士ミルカ#101_2"; //2977
	end;
OnTimer10000:
	announce "「四騎士ミルカ」が「王家の種」を入手しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer13000:
	announce "四騎士ミルカ : メア様から頼まれていた物を見つけたわ。　神殿1Fの「王の墓」に向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer15000:
	stopnpctimer;
	hideonnpc "四騎士ミルカ#101_1"; //1811
	hideonnpc "四騎士ミルカ#101_2"; //1812
	donpcevent "#tiamat_start::OnMilka";
	if(getvariableofnpc('flag,"tiamat_mob#r180") > 0) {	//控えの間
		hideoffnpc "四騎士ミルカ#1032_1"; //1811
		hideoffnpc "四騎士ミルカ#1032_2"; //1811
		hideoffnpc "四騎士ミルカ#1032_3"; //1811
		hideoffnpc "四騎士ミルカ#1032_4"; //1811
		hideoffnpc "四騎士ミルカ#1032_5"; //1811
		set $@tiamat_milka,32;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0) {	//王の墓
		hideoffnpc "四騎士ミルカ#1033_1";
		set $@tiamat_milka,33;
	}
	else {
		hideoffnpc "四騎士ミルカ#1034_1";
		set $@tiamat_milka,34;
	}
	end;
}
1_tiamat_37.gat,22,127,9	script	四騎士ミルカ#101_2	728,{/* 1785 (hide)*/}
1_tiamat_61.gat,35,57,4	script	四騎士ハウンド#201_1	420,{/* 1787 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	emotion 32, "四騎士ハウンド#201_1"; //1787
	announce "四騎士ハウンド : ふんっ、行き止まりか。ついてねえぜ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer4000:
	announce "四騎士ハウンド : お前ら、先に進む手掛かりがないか探すぞ！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	hideonnpc "四騎士ハウンド#201_1"; //1787
	hideoffnpc "四騎士ハウンド#201_2"; //1788
	emotion 19, "四騎士ハウンド#201_2"; //1788
	end;
OnTimer10000:
	hideonnpc "四騎士ハウンド#201_2"; //1788
	hideoffnpc "四騎士ハウンド#201_3"; //1789
	emotion 19, "四騎士ハウンド#201_3"; //1789
	end;
OnTimer13000:
	hideonnpc "四騎士ハウンド#201_3"; //1789
	hideoffnpc "四騎士ハウンド#201_4"; //1790
	emotion 0, "四騎士ハウンド#201_4"; //1789
	end;
OnTimer16000:
	misceffect 18, "四騎士ハウンド#201_4"; //1790
	announce "「四騎士ハウンド」が「水門②開閉装置作動キー」を入手しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer19000:
	stopnpctimer;
	announce "四騎士ハウンド : 鍵が手に入ったな。よし、水門に向かうぞ！", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	hideonnpc "四騎士ハウンド#201_1"; //1787
	hideonnpc "四騎士ハウンド#201_2"; //1788
	hideonnpc "四騎士ハウンド#201_3"; //1789
	hideonnpc "四騎士ハウンド#201_4"; //1790
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,13;
	// 先行してるかチェック
	if(getvariableofnpc('flag,"tiamat_mob#r30") > 0) {	// 城壁通路04、まだ倒してなければ誘導NPC
		hideoffnpc "四騎士ハウンド#2013_1";
		hideoffnpc "四騎士ハウンド#2013_2";
		hideoffnpc "四騎士ハウンド#2013_3";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r74") == 0) {	// 塔・北② B1F、もう倒してたら水門②イベント
		hideoffnpc "四騎士ハウンド#202_1";
		set $@tiamat_hound,21;
		donpcevent "四騎士ハウンド#202_1::OnStart";
	}
	end;
}
1_tiamat_61.gat,46,67,8	script	四騎士ハウンド#201_2	420,{/* 1788 (hide)*/}
1_tiamat_61.gat,49,52,5	script	四騎士ハウンド#201_3	420,{/* 1789 (hide)*/}
1_tiamat_61.gat,39,58,6	script	四騎士ハウンド#201_4	420,{/* 1790 (hide)*/}
1_tiamat_33.gat,277,274,7	script	四騎士ハウンド#202_1	420,{/* 1792 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "四騎士ハウンド : やっと水門か、さすがにちょっと疲れたぜ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	announce "四騎士ハウンド : よしっ、さっき手に入れた鍵を使ってみるか。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer12000:
	misceffect 598, "水門②開閉装置#k74AG08"; //748
	misceffect 18, "水門②開閉装置#k74AG08"; //748
	end;
OnTimer13000:
	misceffect 406, "水門②開閉装置#k74AG08"; //748
	announce "[塔・北② B1F]の水門を「四騎士ハウンド」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	announce "[塔・北② B1F] の水門が操作可能になりました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer22000:
	donpcevent "水門②開閉装置#k74AG08::OnStart"; //748
	end;
OnTimer23000:
	stopnpctimer;
	killmonster "this","tiamat_mob#r74::OnKilled2";
	announce "四騎士ハウンド : 随分時間を食っちまった。さっさと先に進もうぜ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	hideonnpc "四騎士ハウンド#202_1"; //1792
	donpcevent "#tiamat_start::OnHound";
	// 先行してるかチェック
	if(getvariableofnpc('flag,"tiamat_mob#r125") > 0) {	// 城内通路 B1F、まだ倒してなければ誘導NPC
		hideoffnpc "四騎士ハウンド#2022_1";
		set $@tiamat_hound,22;
	}
	else {	// 城内通路 B1F、もう倒してたら水路解放
		hideoffnpc "四騎士ハウンド#2023_1";
		set $@tiamat_hound,23;
	}
	end;
}

1_tiamat_17.gat,63,42,9	script	四騎士ハウンド#203_1	420,{/* 1794 (hide)*/}
1_tiamat_18.gat,51,45,9	script	四騎士ハウンド#204_1	420,{/* 1796 (hide)*/}
1_tiamat_16.gat,62,51,9	script	四騎士ハウンド#205_1	420,{/* 1798 (hide)*/}
1_tiamat_03.gat,201,348,9	script	四騎士ハウンド#206_1	420,{/* 1800 (hide)*/}
1_tiamat_03.gat,110,245,7	script	四騎士ハウンド#207_1	420,{/* 1802 (hide)*/}
1_tiamat_32.gat,33,177,4	script	四騎士ハウンド#208_1	420,{/* 1804 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "四騎士ハウンド : ここに目当ての物があるはずなんだが……怪しそうなところを探してみてくれ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer6000:
	hideonnpc "四騎士ハウンド#208_1"; //1804
	hideoffnpc "四騎士ハウンド#208_2"; //1805
	end;
OnTimer9000:
	emotion 0, "四騎士ハウンド#208_2"; //1805
	end;
OnTimer12000:
	misceffect 18, "四騎士ハウンド#208_2"; //1805
	announce "「四騎士ハウンド」が「大きな鉢」を入手しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer15000:
	announce "四騎士ハウンド : これで姫様の依頼は達成だ。　神殿1Fの「王の墓」に向かうぞ。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer18000:
	stopnpctimer;
	hideonnpc "四騎士ハウンド#208_1"; //1804
	hideonnpc "四騎士ハウンド#208_2"; //1805
	set $@tiamat_hound,42;
	if(getvariableofnpc('flag,"tiamat_mob#r180") > 0) {	//控えの間
		hideoffnpc "四騎士ハウンド#2042_1"; //1868
		set $@tiamat_hound,42;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0) {	//王の墓
		hideoffnpc "四騎士ハウンド#2050_1";
		set $@tiamat_hound,50;
	}
	else {
		hideoffnpc "四騎士ハウンド#2051_1";
		set $@tiamat_hound,51;
	}
	end;
}
1_tiamat_32.gat,17,176,4	script	四騎士ハウンド#208_2	420,{/* 1805 (hide)*/}
1_tiamat_01.gat,104,207,9	script	四騎士ローウェン#301_1	416,{/* 1807 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "四騎士ローウェン : ここが水門……ようやく着きました。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	announce "四騎士ローウェン : それでは先程入手した鍵で門を開きます。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer12000:
	misceffect 598, "水門①開閉装置#k73CG08"; //70
	misceffect 18, "水門①開閉装置#k73CG08"; //70
	end;
OnTimer13000:
	misceffect 406, "水門①開閉装置#k73CG08"; //70
	announce "[塔・北①天文台]の水門を「四騎士ローウェン」が操作しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	announce "[塔・北①天文台] の水門が操作可能になりました", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer20000:
	donpcevent "水門①開閉装置#k73CG08::OnStart"; //70
	end;
OnTimer23000:
	killmonster "this","tiamat_mob#r73::OnKilled2";
	announce "四騎士ローウェン : これで良いはずです。さあ、先に進みましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	hideonnpc "四騎士ローウェン#301_1"; //1807
	set $@tiamat_lowen,14;
	donpcevent "#tiamat_start::OnLowen";
	if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {//南井戸の底
		hideoffnpc "四騎士ローウェン#3015_1"; //1807
		set $@tiamat_lowen,15;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r4") == 0 && getvariableofnpc('flag,"tiamat_mob#r52") == 0) {//中庭(西)
		hideoffnpc "四騎士ローウェン#3014_0"; //1807
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r52") == 0) {//塔・西1F
		hideoffnpc "四騎士ローウェン#3014_9"; //1807
	}
	else {
		hideoffnpc "四騎士ローウェン#3014_1"; //1807
	}
	end;
}
1_tiamat_41.gat,99,25,4	script	四騎士ローウェン#302_1	416,{/* 1809 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	announce "四騎士ローウェン : ふむ……、この部屋にあるのは、この像だけのようです。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "四騎士ローウェン : 操作パネルには「ソード、ワンド、コイン、カップの証を示せ」と書かれていますが、ふむ……。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer11000:
	misceffect 348, "グローザ像#r16CG02"; //897
	announce "グローザ像が光を放ち、頭の中に声が響いた", 0x9, 0xffffff, 0x190, 20, 0, 0;
	end;
OnTimer13000:
	misceffect 668, "グローザ像#r16CG02"; //897
	announce "四怨将よ……目覚めよ……", 0x9, 0xff0000, 0x190, 30, 0, 0;
	donpcevent "グローザ像#r16CG02::OnStart";
	end;
OnTimer15000:
	misceffect 6, "グローザ像#r16CG02"; //897
	announce "「塔・南①2F」⇔「城壁2F01」の扉の鍵が開いた", 0x9, 0xffff00, 0x190, 30, 0, 0;
	if(getvariableofnpc('flag,"tiamat_mob#r19") == 0) {
		misceffect 234, "area#r193";
		misceffect 406, "area#r193";
		hideonnpc "area#k193"; //1258
		hideoffnpc "area#r193"; //1258
	}
	misceffect 234, "area#r363";
	misceffect 406, "area#r363";
	hideonnpc "area#k363"; //1258
	hideoffnpc "area#r363"; //1258
	killmonster "1_tiamat_08.gat","tiamat_mob#r36::OnKilled2";
	end;
OnTimer18000:
	announce "四騎士ローウェン : 数字が入力できるようです。ふむ……道中にあった四怨将の像を調べてみましょうか。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer20000:
	stopnpctimer;
	hideonnpc "四騎士ローウェン#302_1"; //1809
	end;
}
1_tiamat_52.gat,115,138,2	script	四騎士ローウェン#303_1	416,{/* 1811 */
	end;
OnStart:
	initnpctimer;
	announce "四騎士ローウェン : 祭殿です。　ようやく辿りつきました。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer4000:
	announce "四騎士ローウェン : 姫様がご所望された、聖水を汲んで戻りましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	hideonnpc "四騎士ローウェン#303_1"; //1811
	hideoffnpc "四騎士ローウェン#303_2"; //1812
	end;
OnTimer9000:
	misceffect 39, "四騎士ローウェン#303_1"; //1811
	end;
OnTimer10000:
	announce "「四騎士ローウェン」が「清らかな水」を入手しました", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer13000:
	announce "四騎士ローウェン : これで良し。では、神殿1Fの「王の墓」に向かいましょう。", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer15000:
	stopnpctimer;
	hideonnpc "四騎士ローウェン#303_1"; //1811
	hideonnpc "四騎士ローウェン#303_2"; //1812
	donpcevent "#tiamat_start::OnLowen";
	if(getvariableofnpc('flag,"tiamat_mob#r180") > 0) {	//控えの間
		hideoffnpc "四騎士ローウェン#3031_1"; //1811
		hideoffnpc "四騎士ローウェン#3031_2"; //1812
		set $@tiamat_lowen,31;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0) {	//王の墓
		hideoffnpc "四騎士ローウェン#3032_1";
		set $@tiamat_lowen,32;
	}
	else {
		hideoffnpc "四騎士ローウェン#3033_1";
		set $@tiamat_lowen,33;
	}
	end;
}
1_tiamat_52.gat,116,138,6	script	四騎士ローウェン#303_2	416,{/* 1812 (hide)*/}
1_tiamat_55.gat,290,243,4	script	四騎士ミルカ#1001_1	728,{/* 1813 (hide)*/
	mes "[四騎士ミルカ]";
	mes "次は…城門ね。";
	mes "^0000ff城門①1F^000000に向かいましょう。";
	close;
}
1_tiamat_60.gat,90,100,4	script	四騎士ミルカ#1002_1	728,{/* 1814 (hide)*/
	mes "[四騎士ミルカ]";
	mes "ジラントは恐らく王城の最深部にいるはず。";
	mes "メア様はこの事態を想定して";
	mes "最深部に入るための";
	mes "キーとなるアイテムを探すように";
	mes "私達に指示を出していたの。";
	mes "まずは^0000ff中庭(中央)^000000に向かいましょう。";
	close;
}
1_tiamat_50.gat,111,128,4	script	四騎士ミルカ#1003_1	728,{/* 1815 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路03を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff中庭(西)^000000よ。";
	close;
}
1_tiamat_13.gat,81,42,4	script	四騎士ミルカ#1004_1	728,{/* 1816 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路03を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff礼拝堂^000000よ。";
	close;
}
1_tiamat_44.gat,110,123,4	script	四騎士ミルカ#1005_1	728,{/* 1817 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路03を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff教会1F通路01^000000よ。";
	close;
}
1_tiamat_54.gat,56,122,4	script	四騎士ミルカ#1006_1	728,{/* 1818 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路03を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff教会1F会議室^000000よ。";
	close;
}
1_tiamat_54.gat,45,117,4	script	四騎士ミルカ#1007_1	728,{/* 1819 (hide)*/
	mes "[四騎士ミルカ]";
	mes "次は^0000ff教会1F通路02^000000に向かいましょう。";
	mes "^0000ff礼拝堂^000000まで戻って";
	mes "西に向かえば良いわ。";
	close;
}
1_tiamat_54.gat,43,48,4	script	四騎士ミルカ#1007_2	728,{/* 1820 (hide)*/
	mes "[四騎士ミルカ]";
	mes "次は^0000ff教会1F通路02^000000に向かいましょう。";
	mes "^0000ff礼拝堂^000000まで戻って";
	mes "西に向かえば良いわ。";
	close;
}
1_tiamat_44.gat,87,120,4	script	四騎士ミルカ#1007_3	728,{/* 1821 (hide)*/
	mes "[四騎士ミルカ]";
	mes "次は^0000ff教会1F通路02^000000に向かいましょう。";
	mes "私の西の部屋に進めば良いわ。";
	close;
}
1_tiamat_54.gat,205,89,4	script	四騎士ミルカ#1008_1	728,{/* 1822 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路03を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff教会2F通路01^000000よ。";
	close;
}
1_tiamat_54.gat,250,135,4	script	四騎士ミルカ#1009_1	728,{/* 1823 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路03を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff教会2F会議室①^000000よ。";
	close;
}
1_tiamat_54.gat,253,123,4	script	四騎士ミルカ#1010_1	728,{/* 1824 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路01を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff教会2F通路02^000000よ。";
	close;
}
1_tiamat_54.gat,284,137,4	script	四騎士ミルカ#1010_2	728,{/* 1825 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff教会2F通路02^000000よ。";
	mes "私の南にある部屋に進めば良いわ。";
	close;
}
1_tiamat_54.gat,287,72,4	script	四騎士ミルカ#1011_1	728,{/* 1826 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff教会2F会議室②^000000よ。";
	mes "私の東にある部屋に進めば良いわ。";
	close;
}
1_tiamat_54.gat,297,71,4	script	四騎士ミルカ#1012_1	728,{/* 1827 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることよ。";
	mes "水門は他の隊に任せてあるから";
	mes "私達は水路01を通っていきましょう。";
	mes "水路に向かうには、次は^0000ff教会2F執務室^000000よ。";
	close;
}
1_tiamat_54.gat,283,122,4	script	四騎士ミルカ#1012_2	728,{/* 1828 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff教会2F執務室^000000よ。";
	mes "私の東にある部屋に進めば良いわ。";
	close;
}
1_tiamat_54.gat,293,118,4	script	四騎士ミルカ#1013_1	728,{/* 1829 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff教会2F大会議室^000000よ。";
	mes "^0000ff教会2F通路02^000000まで戻って";
	mes "北に進めば良いわ。";
	close;
}
1_tiamat_54.gat,278,128,4	script	四騎士ミルカ#1013_2	728,{/* 1830 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff教会2F大会議室^000000よ。";
	mes "^0000ff教会2F通路01^000000まで戻って";
	mes "西に進めば良いわ。";
	close;
}
1_tiamat_54.gat,228,138,4	script	四騎士ミルカ#1013_3	728,{/* 1831 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff教会2F大会議室^000000よ。";
	mes "私の北の部屋に進めば良いわ。";
	close;
}
1_tiamat_54.gat,227,148,4	script	四騎士ミルカ#1014_1	728,{/* 1832 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff南井戸の底^000000よ。";
	mes "^0000ff中庭(西)^000000まで戻って";
	mes "中央にある井戸の付近から";
	mes "先に進めば良いわ。";
	close;
}
1_tiamat_54.gat,306,136,4	script	四騎士ミルカ#1014_2	728,{/* 1833 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff南井戸の底^000000よ。";
	mes "^0000ff中庭(西)^000000まで戻って";
	mes "中央にある井戸の付近から";
	mes "先に進めば良いわ。";
	close;
}
1_tiamat_54.gat,205,72,4	script	四騎士ミルカ#1014_3	728,{/* 1834 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff南井戸の底^000000よ。";
	mes "^0000ff中庭(西)^000000まで戻って";
	mes "中央にある井戸の付近から";
	mes "先に進めば良いわ。";
	close;
}
1_tiamat_44.gat,98,59,4	script	四騎士ミルカ#1014_4	728,{/* 1835 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff南井戸の底^000000よ。";
	mes "^0000ff中庭(西)^000000まで戻って";
	mes "中央にある井戸の付近から";
	mes "先に進めば良いわ。";
	close;
}
1_tiamat_13.gat,90,39,4	script	四騎士ミルカ#1014_5	728,{/* 1836 (hide)*/
	mes "[四騎士ミルカ]";
	mes "水路に向かうには、次は^0000ff南井戸の底^000000よ。";
	mes "私の南にある井戸から";
	mes "先に進めば良いわ。";
	close;
}
1_tiamat_05.gat,39,127,4	script	四騎士ミルカ#1015_1	728,{/* 1837 (hide)*/
	mes "[四騎士ミルカ]";
	mes "いよいよ、この先は^0000ff水路01^000000よ。";
	mes "水路に入ったら秘密の庭は近いわよ。";
		mes "…でも水圧で扉を開けないわね";
		mes "他の四騎士達が水門を";
		mes "閉じるまで待ちましょう。";
	close;
}
1_tiamat_26.gat,49,57,4	script	四騎士ミルカ#1016_1	728,{/* 1838 (hide)*/
	mes "[四騎士ミルカ]";
	mes "邪悪な気配がする……";
	mes "この部屋に何かありそうね。";
	mes "メア様のお話によると";
	mes "城内にいる全ての守護天使を";
	mes "倒さなければ";
	mes "最深部へは辿り着けないそうよ。";
	close;
}
1_tiamat_63.gat,237,261,4	script	四騎士ミルカ#1017_1	728,{/* 1839 (hide)*/
	mes "[四騎士ミルカ]";
	mes "いよいよ、この先は^0000ff秘密の庭^000000よ。";
	mes "秘密の庭を押さえたら";
	mes "次は城内の探索に移るわ。";
	close;
}
1_tiamat_42.gat,94,79,4	script	四騎士ミルカ#1018_1	728,{/* 1840 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は秘密の庭から";
	mes "城内に侵入し、小礼拝堂を押さえることよ。";
	mes "近くに^0000ff城内通路への抜け穴^000000が";
	mes "あるはずなんだけど……。";
	close;
}
1_tiamat_42.gat,108,319,4	script	四騎士ミルカ#1019_1	728,{/* 1841 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂を押さえることよ。";
	mes "次は^0000ff大ホール^000000に進むわよ。";
	close;
}
1_tiamat_02.gat,146,8,4	script	四騎士ミルカ#1020_1	728,{/* 1842 (hide)*/
	if(!($@tiamat_angel & (1<<1))) {
		mes "[四騎士ミルカ]";
		mes "邪悪な気配がする……";
		mes "この部屋に何かありそうね。";
		mes "メア様のお話によると";
		mes "城内にいる全ての守護天使を";
		mes "倒さなければ";
		mes "最深部へは辿り着けないそうよ。";
		close;
	}
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂を押さえることよ。";
	mes "次は^0000ff待合室③^000000に進むわよ。";
	close;
}
1_tiamat_02.gat,27,243,4	script	四騎士ミルカ#1021_1	728,{/* 1843 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂をを押さえることよ";
	mes "次は^0000ffエントランス^000000に進むわよ。";
	close;
}
1_tiamat_42.gat,86,247,4	script	四騎士ミルカ#1022_1	728,{/* 1844 (hide)*/
	mes "[四騎士ミルカ]";
	mes "小礼拝堂に向かうには、";
	mes "次は^0000ffバルコニー①^000000よ。";
	mes "私の北に進めば良いわ。";
	if(getvariableofnpc('flag,"レバー#006_1")+getvariableofnpc('flag,"レバー#006_2")+getvariableofnpc('flag,"レバー#006_3") < 3) {
		mes "…でも扉は封印されているようね。";
		mes "周囲の部屋に何か封印が解けそうな";
		mes "仕掛けのようなものはないかしら？";
	}
	close;
}
1_tiamat_58.gat,48,72,4	script	四騎士ミルカ#1023_1	728,{/* 1845 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂をを押さえることよ";
	mes "次は^0000ffバルコニー②^000000に進むわよ。";
	close;
}
1_tiamat_58.gat,52,19,4	script	四騎士ミルカ#1024_1	728,{/* 1846 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂をを押さえることよ";
	mes "次は^0000ffバルコニー③^000000に進むわよ。";
	close;
}
1_tiamat_58.gat,19,13,4	script	四騎士ミルカ#1025_1	728,{/* 1847 (hide)*/
	mes "[四騎士ミルカ]";
	mes "小礼拝堂に向かうには、";
	mes "次は^0000ff謁見の間^000000よ。";
	mes "私の西に進めば良いわ。";
	if(getvariableofnpc('flag,"レバー#204_1")+getvariableofnpc('flag,"レバー#007_1") < 2) {	// 待機室2F、城門②2F レバー
		mes "…でも扉は封印されているようね。";
		mes "周囲の部屋に何か封印が解けそうな";
		mes "仕掛けのようなものはないかしら？";
	}
	close;
}
1_tiamat_37.gat,138,113,4	script	四騎士ミルカ#1026_1	728,{/* 1848 (hide)*/
	if(!($@tiamat_angel & (1<<9))) {
		mes "[四騎士ミルカ]";
		mes "邪悪な気配がする……";
		mes "この部屋に何かありそうね。";
		mes "メア様のお話によると";
		mes "城内にいる全ての守護天使を";
		mes "倒さなければ";
		mes "最深部へは辿り着けないそうよ。";
		close;
	}
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂を押さえることよ。";
	mes "次は^0000ff執務室^000000に進むわよ。";
	close;
}
1_tiamat_42.gat,239,81,4	script	四騎士ミルカ#1027_1	728,{/* 1849 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂を押さえることよ。";
	mes "次は^0000ff城内通路2F01^000000に進むわよ。";
	close;
}
1_tiamat_42.gat,274,161,4	script	四騎士ミルカ#1028_1	728,{/* 1850 (hide)*/
	mes "[四騎士ミルカ]";
	mes "小礼拝堂に向かうには、";
	mes "次は^0000ff城内通路2F02^000000よ。";
	mes "私の東にある部屋に進めば良いわ。";
	if(getvariableofnpc('flag,"レバー#009_1") == 0) {	// 医務室 レバー
		mes "…でも扉は封印されているようね。";
		mes "周囲の部屋に何か封印が解けそうな";
		mes "仕掛けのようなものはないかしら？";
	}
	close;
}
1_tiamat_35.gat,171,166,4	script	四騎士ミルカ#1029_1	728,{/* 1851 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂を押さえることよ。";
	mes "次は^0000ff城内通路3F01^000000に進むわよ。";
	close;
}
1_tiamat_35.gat,65,161,4	script	四騎士ミルカ#1030_1	728,{/* 1852 (hide)*/
	mes "[四騎士ミルカ]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "小礼拝堂を押さえることよ。";
	mes "次は^0000ff城内通路3F02^000000に進むわよ。";
	close;
}
1_tiamat_42.gat,79,172,4	script	四騎士ミルカ#1031_1	728,{/* 1853 (hide)*/
	mes "[四騎士ミルカ]";
	mes "いよいよ、この先は^0000ff小礼拝堂^000000よ。";
	mes "やっと辿りついたわね。長かったわ。";
	if(getvariableofnpc('flag,"レバー#011_1") == 0) {	// 王の寝室 レバー
		mes "…でも扉は封印されているようね。";
		mes "周囲の部屋に何か封印が解けそうな";
		mes "仕掛けのようなものはないかしら？";
	}
	close;
}
1_tiamat_37.gat,24,113,4	script	四騎士ミルカ#1032_1	728,{/* 1854 (hide)*/}
1_tiamat_42.gat,50,164,4	script	四騎士ミルカ#1032_2	728,{/* 1855 (hide)*/}
1_tiamat_35.gat,52,163,4	script	四騎士ミルカ#1032_3	728,{/* 1856 (hide)*/}
1_tiamat_35.gat,162,161,4	script	四騎士ミルカ#1032_4	728,{/* 1857 (hide)*/}
1_tiamat_42.gat,265,174,4	script	四騎士ミルカ#1032_5	728,{/* 1858 (hide)*/}
1_tiamat_35.gat,135,163,4	script	四騎士ミルカ#1033_1	728,{/* 1859 (hide)*/}
1_tiamat_04.gat,67,52,4	script	四騎士ミルカ#1034_1	728,{/* 1860 (hide)*/}
1_tiamat_52.gat,142,269,4	script	四騎士ミルカ#1035_1	728,{/* 1861 (hide)*/}
1_tiamat_04.gat,144,199,4	script	四騎士ミルカ#1036_1	728,{/* 1862 (hide)*/
		mes "[四騎士ミルカ]";
		mes "強力な封印ね……";
		mes "メア様であっても";
		mes "解除には時間がかかりそう。";
		mes "^0000ff王家の種^000000と^0000ff大きな鉢^000000、";
		mes "^0000ff清らかな水^000000が揃えば";
		mes "すぐにでも解除できるのに……。";
		close;
	mes "[四騎士ミルカ]";
	mes "ジラントの潜む部屋は目と鼻の先よ。";
	mes "ここまで来れた私達なら辿り着けるはず。";
	mes "頑張りましょう！";
	close;
}
1_tiamat_04.gat,186,133,4	script	四騎士ミルカ#1037_1	728,{/* 1863 (hide)*/
	mes "[四騎士ミルカ]";
	mes "ジラントの潜む部屋は目と鼻の先よ。";
	mes "ここまで来れた私達なら辿り着けるはず。";
	mes "頑張りましょう！";
	close;
}
1_tiamat_35.gat,88,179,4	script	四騎士ミルカ#1038_1	728,{/* 1864 */
	mes "[四騎士ミルカ]";
	mes "ジラントの禍々しい気が";
	mes "ここまで伝わってきてる……";
	mes "でも、逃げるわけにはいかない。";
	mes "自分たちの力を信じて、ぶつかるのみよ。";
	close;
}
2_tiamat_01.gat,201,39,9	script	四騎士ミルカ#1039_1	728,{/* 1865 (hide)*/
	mes "[四騎士ミルカ]";
	mes "信じたくはないけど";
	mes "あれほどの力を持ちながら";
	mes "実体ではないなんて……";
	mes "でも、奥へと進めば今度こそ";
	mes "ジラントの本体がいるはずです。";
	close;
}
2_tiamat_00.gat,51,59,4	script	四騎士ミルカ#1040_1	728,{/* 1866 (hide)*/
	mes "[四騎士ミルカ]";
	mes "最深部への扉がついに開かれた……";
	mes "最終決戦の準備は良い？";
	mes "気を引き締めて行きましょう。";
	close;
}
1_tiamat_55.gat,292,245,4	script	四騎士ハウンド#2001_1	420,{/* 1868 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は…城門だな。";
	mes "^0000ff城門①1F^000000に向かうぞ。";
	close;
}
1_tiamat_60.gat,113,59,4	script	四騎士ハウンド#2002_1	420,{/* 1869 (hide)*/
	mes "[四騎士ハウンド]";
	mes "ジラントの奴は、恐らく王城の最深部にいる。";
	mes "姫さんは、この事態を想定して";
	mes "最深部に入るためのキーとなるアイテムを";
	mes "探せと俺様に命令してるんだ。";
	mes "ようし、お前ら！";
	mes "まずは^0000ff塔・南②1F^000000に向かうぞ。";
	close;
}
1_tiamat_61.gat,176,98,4	script	四騎士ハウンド#2003_1	420,{/* 1870 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南②2F^000000に行くぜ。";
	close;
}
1_tiamat_61.gat,119,53,4	script	四騎士ハウンド#2004_1	420,{/* 1871 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff城壁2F05^000000に行くぜ。";
	close;
}
1_tiamat_56.gat,90,117,4	script	四騎士ハウンド#2005_1	420,{/* 1872 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南東2F^000000に行くぜ。";
	close;
}
1_tiamat_17.gat,63,42,4	script	四騎士ハウンド#2006_1	420,{/* 1873 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南東3F^000000に行くぜ。";
	close;
}
1_tiamat_18.gat,51,45,4	script	四騎士ハウンド#2007_1	420,{/* 1874 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南東1F^000000に行くぜ。";
	close;
}
1_tiamat_16.gat,62,51,4	script	四騎士ハウンド#2008_1	420,{/* 1875 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南東屋上^000000に行くぜ。";
	close;
}
1_tiamat_03.gat,201,348,4	script	四騎士ハウンド#2009_1	420,{/* 1876 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南②屋上^000000に行くぜ。";
	close;
}
1_tiamat_03.gat,110,245,4	script	四騎士ハウンド#2010_1	420,{/* 1877 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南東B1F^000000に行くぜ。";
	close;
}
1_tiamat_19.gat,21,27,4	script	四騎士ハウンド#2011_1	420,{/* 1878 (hide)*/
	if(!($@tiamat_angel & (1<<15))) {
		mes "[四騎士ハウンド]";
		mes "嫌な気配がしやがるぜ……";
		mes "この部屋には何かあるはずだ。";
		mes "姫さんによると城内にいる全ての";
		mes "守護天使を倒さねえと";
		mes "最深部へは辿り着けないんだとよ。";
		close;
	}
	mes "[四騎士ハウンド]";
	mes "次は^0000ff城壁通路02^000000に向かうぞ。";
	mes "転移の石碑で^0000ff塔・南東3F^000000まで戻って";
	mes "着いた場所から南に向かえば良い。";
	close;
}
1_tiamat_18.gat,46,16,4	script	四騎士ハウンド#2011_2	420,{/* 1879 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff城壁通路02^000000に向かうぞ。";
	mes "俺様の南の部屋に進めば良い。";
	close;
}
1_tiamat_46.gat,60,159,4	script	四騎士ハウンド#2012_1	420,{/* 1880 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることだ。";
	mes "俺様達は水門②を閉めてから、他の隊と";
	mes "合流する。まずは鍵を見つけないとな。";
	mes "次は^0000ff塔・南②3F^000000に行くぜ。";
	close;
}
1_tiamat_61.gat,50,55,4	script	四騎士ハウンド#2013_1	420,{/* 1881 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff城壁通路04^000000に向かうぞ。";
	mes "^0000ff塔・南東3F^000000まで戻って";
	mes "着いた場所から北に向かえば良い。";
	close;
}
1_tiamat_46.gat,83,156,4	script	四騎士ハウンド#2013_2	420,{/* 1882 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff城壁通路04^000000に向かうぞ。";
	mes "^0000ff塔・南東3F^000000まで戻って";
	mes "着いた場所から北に向かえば良い。";
	close;
}
1_tiamat_18.gat,52,86,4	script	四騎士ハウンド#2013_3	420,{/* 1883 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff城壁通路04^000000に向かうぞ。";
	mes "俺様の北の部屋に進めば良い。";
	close;
}
1_tiamat_46.gat,90,230,4	script	四騎士ハウンド#2014_1	420,{/* 1884 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff塔・東3F^000000に行くぜ。";
	close;
}
1_tiamat_41.gat,80,82,4	script	四騎士ハウンド#2015_1	420,{/* 1885 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff城壁通路06^000000に行くぜ。";
	close;
}
1_tiamat_49.gat,90,264,4	script	四騎士ハウンド#2016_1	420,{/* 1886 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff塔・北東3F^000000に行くぜ。";
	close;
}
1_tiamat_08.gat,179,10,4	script	四騎士ハウンド#2017_1	420,{/* 1887 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff城壁通路08^000000に行くぜ。";
	close;
}
1_tiamat_49.gat,39,287,4	script	四騎士ハウンド#2018_1	420,{/* 1888 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff塔・北②3F^000000に行くぜ。";
	close;
}
1_tiamat_22.gat,115,110,4	script	四騎士ハウンド#2019_1	420,{/* 1889 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff塔・北②2F^000000に行くぜ。";
	close;
}
1_tiamat_22.gat,44,90,4	script	四騎士ハウンド#2020_1	420,{/* 1890 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff塔・北②1F^000000に行くぜ。";
	close;
}
1_tiamat_22.gat,161,156,4	script	四騎士ハウンド#2021_1	420,{/* 1891 (hide)*/
	mes "[四騎士ハウンド]";
	mes "鍵も手に入ったし、";
	mes "さっさと水門②を閉めて";
	mes "秘密の庭に向かうとするか。";
	mes "次は^0000ff塔・北②B1F^000000に行くぜ。";
	close;
}
1_tiamat_33.gat,258,280,4	script	四騎士ハウンド#2022_1	420,{/* 1892 (hide)*/
	mes "[四騎士ハウンド]";
	mes "水門②も閉めたし、";
	mes "さっさと秘密の庭に行こうぜ。";
	mes "水路を通って行けばすぐだ。";
	mes "次は^0000ff城内通路B1F^000000に行くぜ。";
	close;
}
1_tiamat_26.gat,120,150,4	script	四騎士ハウンド#2023_1	420,{/* 1893 (hide)*/
	mes "[四騎士ハウンド]";
	mes "水門②も閉めたし、";
	mes "さっさと秘密の庭に行こうぜ。";
	mes "水路を通って行けばすぐだ。";
	mes "次は^0000ff水路03^000000に行くぜ。";
	close;
}
1_tiamat_26.gat,50,91,4	script	四騎士ハウンド#2024_1	420,{/* 1894 (hide)*/
	mes "[四騎士ハウンド]";
	mes "水門②も閉めたし、";
	mes "さっさと秘密の庭に行こうぜ。";
	mes "水路を通って行けばすぐだ。";
	mes "次は^0000ff噴水基部^000000に行くぜ。";
	close;
}
1_tiamat_63.gat,239,263,4	script	四騎士ハウンド#2025_1	420,{/* 1895 (hide)*/
	mes "[四騎士ハウンド]";
	mes "いよいよ、次は^0000ff秘密の庭^000000だな。";
	mes "警備が手薄な場所だから";
	mes "そう強いモンスターはいないと思うが、";
	mes "何があるかわからん。油断するなよ。";
	close;
}
1_tiamat_42.gat,101,79,4	script	四騎士ハウンド#2026_1	420,{/* 1896 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は、秘密の庭から城内に侵入し";
	mes "炊事場への道を開くことだ。";
	mes "近くに^0000ff城内通路への抜け穴^000000が";
	mes "あるって聞いてたんだが……どこだ？";
	close;
}
1_tiamat_42.gat,106,320,4	script	四騎士ハウンド#2027_1	420,{/* 1897 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は城内を探索し、";
	mes "炊事場への道を開くことだ。";
	mes "次は^0000ff大ホール^000000に行くぜ。";
	close;
}
1_tiamat_02.gat,147,10,4	script	四騎士ハウンド#2028_1	420,{/* 1898 (hide)*/
	if(!($@tiamat_angel & (1<<1))) {
		mes "[四騎士ハウンド]";
		mes "嫌な気配がしやがるぜ……";
		mes "この部屋には何かあるはずだ。";
		mes "姫さんによると城内にいる全ての";
		mes "守護天使を倒さねえと";
		mes "最深部へは辿り着けないんだとよ。";
		close;
	}
	mes "[四騎士ハウンド]";
	mes "炊事場は^0000ff中庭(中央)^000000の";
	mes "東の扉から行けるエリアにある。";
	mes "初めは扉は閉まっていたが、";
	mes "そろそろ扉が開いているはずだ。";
	mes "次は^0000ff待合室③^000000に行くぜ。";
	close;
}
1_tiamat_02.gat,29,245,4	script	四騎士ハウンド#2029_1	420,{/* 1899 (hide)*/
	mes "[四騎士ハウンド]";
	mes "炊事場は^0000ff中庭(中央)^000000の";
	mes "東の扉から行けるエリアにある。";
	mes "初めは扉は閉まっていたが、";
	mes "そろそろ扉が開いているはずだ。";
	mes "次は^0000ffエントランス^000000に行くぜ。";
	close;
}
1_tiamat_42.gat,97,215,4	script	四騎士ハウンド#2030_1	420,{/* 1900 (hide)*/
	mes "[四騎士ハウンド]";
	mes "炊事場は^0000ff中庭(中央)^000000の";
	mes "東の扉から行けるエリアにある。";
	mes "初めは扉は閉まっていたが、";
	mes "そろそろ扉が開いているはずだ。";
	mes "次は^0000ff城門②1F^000000に行くぜ。";
	close;
}
1_tiamat_49.gat,241,8,4	script	四騎士ハウンド#2031_1	420,{/* 1901 (hide)*/
	mes "[四騎士ハウンド]";
	mes "炊事場は^0000ff中庭(中央)^000000の";
	mes "東の扉から行けるエリアにある。";
	mes "初めは扉は閉まっていたが、";
	mes "そろそろ扉が開いているはずだ。";
	mes "次は^0000ff中庭(北)^000000に行くぜ。";
	close;
}
1_tiamat_47.gat,173,11,4	script	四騎士ハウンド#2032_1	420,{/* 1902 (hide)*/
	mes "[四騎士ハウンド]";
	mes "炊事場は^0000ff中庭(中央)^000000の";
	mes "東の扉から行けるエリアにある。";
	mes "初めは扉は閉まっていたが、";
	mes "そろそろ扉が開いているはずだ。";
	close;
}
1_tiamat_50.gat,158,143,4	script	四騎士ハウンド#2033_1	420,{/* 1903 (hide)*/
	mes "[四騎士ハウンド]";
	mes "ようやく炊事場のある";
	mes "エリアへの道が開けたな。";
	mes "まだ先は長いが、弱音を吐くんじゃねえぞ？";
	mes "次は^0000ff中庭(東)^000000に行くぜ。";
	close;
}
1_tiamat_29.gat,261,198,4	script	四騎士ハウンド#2034_1	420,{/* 1904 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は周囲を探索し、";
	mes "炊事場を押さえることだ。";
	mes "次は^0000ff塔・東1F^000000に行くぜ。";
	close;
}
1_tiamat_14.gat,33,24,4	script	四騎士ハウンド#2035_1	420,{/* 1905 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は周囲を探索し、";
	mes "炊事場を押さえることだ。";
	mes "次は^0000ff塔・東2F^000000に行くぜ。";
	close;
}
1_tiamat_14.gat,11,69,4	script	四騎士ハウンド#2036_1	420,{/* 1906 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は周囲を探索し、";
	mes "炊事場を押さえることだ。";
	mes "次は^0000ff城壁2F06^000000に行くぜ。";
	close;
}
1_tiamat_56.gat,114,179,4	script	四騎士ハウンド#2037_1	420,{/* 1907 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff兵舎2F武器庫^000000に向かうぞ。";
	mes "俺様の西の部屋に進めば良い。";
	close;
}
1_tiamat_30.gat,76,35,4	script	四騎士ハウンド#2038_1	420,{/* 1908 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は周囲を探索し、";
	mes "炊事場を押さえることだ。";
	mes "次は^0000ff兵舎2F通路^000000に行くぜ。";
	close;
}
1_tiamat_31.gat,278,61,4	script	四騎士ハウンド#2039_1	420,{/* 1909 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff兵舎1F通路^000000に向かうぞ。";
	mes "俺様の南の部屋に進めば良い。";
	mes "……ちっ、扉が封印されてやがる。";
	mes "周囲の部屋に何か封印が解けそうな";
	mes "レバーのようなものはなかったか？";
	close;
}
1_tiamat_31.gat,18,95,4	script	四騎士ハウンド#2040_1	420,{/* 1910 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff使用人居住区・廊下^000000に向かうぞ。";
	mes "俺様の西にある出口から^0000ff中庭(東)^000000に出て";
	mes "北西に向かえば良い。";
	if(getvariableofnpc('flag,"レバー#106_1") == 0) {
		mes "……ちっ、扉が封印されてやがる。";
		mes "周囲の部屋に何か封印が解けそうな";
		mes "レバーのようなものはなかったか？";
	}
	close;
}
1_tiamat_29.gat,185,244,4	script	四騎士ハウンド#2040_2	420,{/* 1911 (hide)*/
	mes "[四騎士ハウンド]";
	mes "全エリアを探索するために";
	mes "当面の目標は周囲を探索し、";
	mes "炊事場を押さえることだ。";
	mes "次は^0000ff使用人居住区・廊下^000000に行くぜ。";
	close;
}
1_tiamat_34.gat,240,216,4	script	四騎士ハウンド#2041_1	420,{/* 1912 (hide)*/
	mes "[四騎士ハウンド]";
	mes "次は^0000ff召使い部屋^000000に向かうぞ。";
	mes "俺様の西の部屋に進めば良い。";
	if(getvariableofnpc('flag,"レバー#107_1")+getvariableofnpc('flag,"レバー#107_2")+getvariableofnpc('flag,"レバー#107_3") < 3) {
		mes "……ちっ、扉が封印されてやがる。";
		mes "周囲の部屋に何か封印が解けそうな";
		mes "レバーのようなものはなかったか？";
	}
	close;
}
1_tiamat_51.gat,338,111,4	script	四騎士ハウンド#2042_1	420,{/* 1913 (hide)*/
	if(!($@tiamat_angel & (1<<13))) {
		mes "[四騎士ハウンド]";
		mes "嫌な気配がしやがるぜ……";
		mes "この部屋には何かあるはずだ。";
		mes "姫さんによると城内にいる全ての";
		mes "守護天使を倒さねえと";
		mes "最深部へは辿り着けないんだとよ。";
		close;
	}
	mes "[四騎士ハウンド]";
	mes "次はついに^0000ff炊事場^000000だ。";
	mes "俺様の北の部屋に進めば良い。";
	close;
}
1_tiamat_32.gat,45,173,4	script	四騎士ハウンド#2043_1	420,{/* 1914 (hide)*/}
1_tiamat_38.gat,83,93,4	script	四騎士ハウンド#2044_1	420,{/* 1915 (hide)*/}
1_tiamat_22.gat,151,32,4	script	四騎士ハウンド#2045_1	420,{/* 1916 (hide)*/}
1_tiamat_08.gat,14,48,4	script	四騎士ハウンド#2046_1	420,{/* 1917 (hide)*/}
1_tiamat_08.gat,98,48,4	script	四騎士ハウンド#2047_1	420,{/* 1918 (hide)*/}
1_tiamat_08.gat,179,9,4	script	四騎士ハウンド#2047_2	420,{/* 1919 (hide)*/}
1_tiamat_49.gat,39,287,4	script	四騎士ハウンド#2047_3	420,{/* 1920 (hide)*/}
1_tiamat_22.gat,115,110,4	script	四騎士ハウンド#2047_4	420,{/* 1921 (hide)*/}
1_tiamat_22.gat,54,102,4	script	四騎士ハウンド#2047_5	420,{/* 1922 (hide)*/}
1_tiamat_35.gat,137,164,4	script	四騎士ハウンド#2048_1	420,{/* 1923 (hide)*/}
1_tiamat_04.gat,69,51,4	script	四騎士ハウンド#2049_1	420,{/* 1924 (hide)*/}
1_tiamat_52.gat,144,270,4	script	四騎士ハウンド#2050_1	420,{/* 1925 (hide)*/}
1_tiamat_04.gat,146,200,4	script	四騎士ハウンド#2051_1	420,{/* 1926 (hide)*/
		mes "[四騎士ハウンド]";
		mes "こいつぁは流石に俺様でも……";
		mes "姫さんでも一筋縄ではいかんだろうぜ。";
		mes "^0000ff王家の種^000000と^0000ff大きな鉢^000000、";
		mes "^0000ff清らかな水^000000が揃えば";
		mes "いっぱつなんだがなぁ……。";
		close;
	mes "[四騎士ハウンド]";
	mes "ジラントの奴が潜む部屋まで";
	mes "もう少しのはずだ。";
	mes "俺様たちならなんとかなるだろ。";
	mes "よし、お前ら行くぞっ！";
	close;
}
1_tiamat_04.gat,188,134,4	script	四騎士ハウンド#2052_1	420,{/* 1927 (hide)*/
	mes "[四騎士ハウンド]";
	mes "ジラントの奴が潜む部屋まで";
	mes "もう少しのはずだ。";
	mes "俺様たちならなんとかなるだろ。";
	mes "よし、お前ら行くぞっ！";
	close;
}
1_tiamat_35.gat,85,179,4	script	四騎士ハウンド#2053_1	420,{/* 1928 */
	mes "[四騎士ハウンド]";
	mes "ジラントの奴は、この先か……";
	mes "ちっ……ヤバイ気配が伝わってくるぜ。";
	mes "まあ、ここまで来たらやるしかねえ。";
	mes "気合を入れていこうぜ！";
	close;
}
2_tiamat_01.gat,203,40,9	script	四騎士ハウンド#2054_1	420,{/* 1929 (hide)*/
	mes "[四騎士ハウンド]";
	mes "さっき戦ったのは、幻影だと？";
	mes "ちっ……用心深いジラントの奴が";
	mes "やりそうなことだぜ。";
	mes "気を取り直して進もうぜ。";
	mes "今度こそ、決着をつけてやる。";
	close;
}
2_tiamat_00.gat,53,60,4	script	四騎士ハウンド#2055_1	420,{/* 1930 (hide)*/
	mes "[四騎士ハウンド]";
	mes "泣いても笑っても、これが最後だ。";
	mes "覚悟はできてるだろうな？";
	mes "持てる力の限りを尽くして";
	mes "勝利を勝ち取るぞ！";
	close;
}
1_tiamat_55.gat,288,244,4	script	四騎士ローウェン#3001_1	416,{/* 1932 (hide)*/
	mes "[四騎士ローウェン]";
	mes "次は…城門ですね。";
	mes "^0000ff城門①1F^000000に向かいましょう。";
	close;
}
1_tiamat_60.gat,74,58,4	script	四騎士ローウェン#3002_1	416,{/* 1933 (hide)*/
	mes "[四騎士ローウェン]";
	mes "魔女は恐らく王城の";
	mes "最深部にいるのでしょう。";
	mes "この事態を想定して姫様は";
	mes "我らに最深部に入るための";
	mes "キーアイテムを探すように仰いました。";
	mes "まずは^0000ff塔・南①1F^000000に向かいましょう。";
	close;
}
1_tiamat_08.gat,15,306,4	script	四騎士ローウェン#3003_1	416,{/* 1934 (hide)*/
	mes "[四騎士ローウェン]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることです。";
	mes "我々は水門①を閉めてから合流します。";
	mes "まずは鍵を探しましょう。";
	mes "次は^0000ff塔・南①2F^000000です。";
	close;
}
1_tiamat_08.gat,98,306,4	script	四騎士ローウェン#3004_1	416,{/* 1935 (hide)*/
	mes "[四騎士ローウェン]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることです。";
	mes "我々は水門①を閉めてから合流します。";
	mes "まずは鍵を探しましょう。";
	mes "次は^0000ff塔・南①3F^000000です。";
	close;
}
1_tiamat_08.gat,186,306,4	script	四騎士ローウェン#3005_1	416,{/* 1936 (hide)*/
	mes "[四騎士ローウェン]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることです。";
	mes "我々は水門①を閉めてから合流します。";
	mes "まずは鍵を探しましょう。";
	mes "次は^0000ff塔・南①屋上^000000です。";
	close;
}
1_tiamat_57.gat,107,106,4	script	四騎士ローウェン#3006_1	416,{/* 1937 */
	mes "[四騎士ローウェン]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることです。";
	mes "我々は水門①を閉めてから合流します。";
	mes "まずは鍵を探しましょう。";
	mes "次は^0000ff城門①屋上^000000です。";
	close;
}
1_tiamat_57.gat,138,126,4	script	四騎士ローウェン#3007_1	416,{/* 1938 (hide)*/
	mes "[四騎士ローウェン]";
	mes "全エリアを探索するために";
	mes "当面の目標は全ての水門を閉め、";
	mes "秘密の庭を押さえることです。";
	mes "我々は水門①を閉めてから合流します。";
	mes "まずは鍵を探しましょう。";
	mes "次は^0000ff城門①3F^000000です。";
	close;
}
1_tiamat_41.gat,99,9,4	script	四騎士ローウェン#3008_1	416,{/* 1939 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、^0000ff塔・南①3F^000000まで戻ってから";
	mes "^0000ff城壁通路01^000000に進みましょう。";
	close;
}
1_tiamat_57.gat,113,120,4	script	四騎士ローウェン#3008_2	416,{/* 1940 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、^0000ff塔・南①3F^000000まで戻ってから";
	mes "^0000ff城壁通路01^000000に進みましょう。";
	close;
}
1_tiamat_57.gat,83,75,4	script	四騎士ローウェン#3008_3	416,{/* 1941 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、^0000ff塔・南①3F^000000まで戻ってから";
	mes "^0000ff城壁通路01^000000に進みましょう。";
	close;
}
1_tiamat_08.gat,179,269,4	script	四騎士ローウェン#3008_4	416,{/* 1942 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①に向かうには、";
	mes "次は^0000ff城壁通路^000000に進む必要があります。";
	mes "私の西に進めば良いでしょう。";
	close;
}
1_tiamat_45.gat,24,8,4	script	四騎士ローウェン#3009_1	416,{/* 1943 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、^0000ff塔・南西3F^000000に戻って";
	mes "^0000ff城壁通路03^000000です。";
	close;
}
1_tiamat_08.gat,206,211,4	script	四騎士ローウェン#3009_2	416,{/* 1944 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、私の東に進んで";
	mes "^0000ff城壁通路03^000000です。";
	close;
}
1_tiamat_45.gat,15,82,4	script	四騎士ローウェン#3010_1	416,{/* 1945 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、私の北に進んで";
	mes "^0000ff塔・西3F^000000です。";
	close;
}
1_tiamat_08.gat,179,132,4	script	四騎士ローウェン#3011_1	416,{/* 1946 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "次は^0000ff城壁通路05^000000に進む必要があります。";
	mes "私の西に進めば良いでしょう。";
	close;
}
1_tiamat_48.gat,16,46,4	script	四騎士ローウェン#3011_2	416,{/* 1947 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、私の北に進んで";
	mes "^0000ff塔・北西3F^000000です。";
	close;
}
1_tiamat_41.gat,29,82,4	script	四騎士ローウェン#3011_3	416,{/* 1948 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、私の東に進んで";
	mes "^0000ff城壁通路07^000000です。";
	close;
}
1_tiamat_48.gat,69,64,4	script	四騎士ローウェン#3011_4	416,{/* 1949 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、私の東に進んで";
	mes "^0000ff塔・北①3F^000000です。";
	close;
}
1_tiamat_08.gat,186,390,4	script	四騎士ローウェン#3012_1	416,{/* 1950 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、私の北に進んで";
	mes "^0000ff塔・北①4F^000000です。";
	close;
}
1_tiamat_08.gat,272,390,4	script	四騎士ローウェン#3013_1	416,{/* 1951 (hide)*/
	mes "[四騎士ローウェン]";
	mes "鍵も手に入りましたし、";
	mes "水門①を閉めてから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、私の北に進んで";
	mes "^0000ff塔・北①天文台^000000です。";
	close;
}
1_tiamat_01.gat,105,195,4	script	四騎士ローウェン#3014_1	416,{/* 1952 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、^0000ff塔・北①4F^000000に戻りましょう。";
	close;
}
1_tiamat_08.gat,307,351,4	script	四騎士ローウェン#3014_2	416,{/* 1953 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "まずは、^0000ff塔・北①3F^000000に戻りましょう。";
	close;
}
1_tiamat_08.gat,179,352,4	script	四騎士ローウェン#3014_3	416,{/* 1954 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、^0000ff城壁通路07^000000に戻りましょう。";
	close;
}
1_tiamat_48.gat,36,62,4	script	四騎士ローウェン#3014_4	416,{/* 1955 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、^0000ff塔・北西3F^000000に戻りましょう。";
	close;
}
1_tiamat_41.gat,14,82,4	script	四騎士ローウェン#3014_5	416,{/* 1956 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、^0000ff城壁通路05^000000に戻りましょう。";
	close;
}
1_tiamat_48.gat,12,13,4	script	四騎士ローウェン#3014_6	416,{/* 1957 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、^0000ff塔・西3F^000000に戻りましょう。";
	close;
}
1_tiamat_08.gat,221,95,4	script	四騎士ローウェン#3014_7	416,{/* 1958 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、^0000ff塔・西2F^000000に戻りましょう。";
	close;
}
1_tiamat_08.gat,133,95,4	script	四騎士ローウェン#3014_8	416,{/* 1959 (hide)*/
	mes "[四騎士ローウェン]";
	mes "水門①も閉めましたから";
	mes "秘密の庭に向かいましょう。";
	mes "次は、^0000ff塔・西1F^000000に進みましょう。";
	close;
}
1_tiamat_08.gat,49,95,4	script	四騎士ローウェン#3014_9	416,{/* 1960 (hide)*/
	mes "[四騎士ローウェン]";
	mes "秘密の庭に向かうには、次は^0000ff中庭(西)^000000です。";
	mes "私の東から先に進みましょう。";
	close;
}
1_tiamat_13.gat,88,41,4	script	四騎士ローウェン#3014_0	416,{/* 1961 (hide)*/
	mes "[四騎士ミルカ]";
	mes "秘密の庭に向かうには、次は^0000ff南井戸の底^000000です。";
	mes "私の南にある井戸から";
	mes "先に進みましょう。";
	close;
}
1_tiamat_05.gat,37,129,4	script	四騎士ローウェン#3015_1	416,{/* 1962 (hide)*/
	mes "[四騎士ローウェン]";
	mes "この先は^0000ff水路01^000000です。";
	mes "水路に入ったら秘密の庭はすぐですね。";
		mes "…でも水圧で扉を開けないですね";
		mes "他の四騎士達が水門を";
		mes "閉じるまで待ちましょう。";
	close;
}
1_tiamat_26.gat,47,55,4	script	四騎士ローウェン#3016_1	416,{/* 1963 (hide)*/
	if(!($@tiamat_angel & (1<<14))) {
		mes "[四騎士ローウェン]";
		mes "邪悪な気配がする……";
		mes "この部屋に何かありそうだ。";
		mes "メア様のお話によると";
		mes "城内にいる全ての守護天使を";
		mes "倒さなければ";
		mes "最深部へは辿り着けないらしい。";
		close;
	}
	mes "[四騎士ローウェン]";
	mes "この先は^0000ff噴水基部^000000です。";
	mes "秘密の庭はすぐですね。";
	close;
}
1_tiamat_63.gat,239,259,4	script	四騎士ローウェン#3017_1	416,{/* 1964 (hide)*/
	mes "[四騎士ローウェン]";
	mes "この先が^0000ff秘密の庭^000000です。";
	mes "ここを押さえれば";
	mes "城内の探索が大きく進むでしょう。";
	close;
}
1_tiamat_42.gat,98,77,4	script	四騎士ローウェン#3018_1	416,{/* 1965 (hide)*/
	mes "[四騎士ローウェン]";
	mes "この部屋には^0000ff城内通路への^000000";
	mes "^0000ff抜け穴^000000があるそうです。";
	mes "近くに怪しい場所はありませんか？";
	close;
}
1_tiamat_42.gat,106,317,4	script	四騎士ローウェン#3019_1	416,{/* 1966 (hide)*/
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、南に進んで";
	mes "^0000ff大ホール^000000です。";
	close;
}
1_tiamat_02.gat,144,9,4	script	四騎士ローウェン#3020_1	416,{/* 1967 (hide)*/
	if(!($@tiamat_angel & (1<<1))) {
		mes "[四騎士ローウェン]";
		mes "悪しき気配を感じます……";
		mes "この部屋には何かが隠されているはず。";
		mes "姫様が仰るには";
		mes "城内にいる全ての守護天使を倒すことで";
		mes "最深部への道が開ける、と。";
		close;
	}
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、南に進んで";
	mes "^0000ff待合室③^000000です。";
	close;
}
1_tiamat_02.gat,25,245,4	script	四騎士ローウェン#3021_1	416,{/* 1968 (hide)*/
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、南に進んで";
	mes "^0000ffエントランス^000000です。";
	close;
}
1_tiamat_42.gat,84,245,4	script	四騎士ローウェン#3022_1	416,{/* 1969 (hide)*/
	mes "[四騎士ローウェン]";
	mes "祭殿に入るには、次は";
	mes "^0000ffバルコニー①^000000に進む必要があります。";
	mes "私の北に進めば良いでしょう。";
	if(getvariableofnpc('flag,"レバー#006_1")+getvariableofnpc('flag,"レバー#006_2")+getvariableofnpc('flag,"レバー#006_3") < 3) {
		mes "……ですが、扉が封印されていますね。";
		mes "周囲の部屋に何か封印を解くための";
		mes "起点となるようなものがあるはずです。";
	}
	close;
}
1_tiamat_58.gat,46,73,4	script	四騎士ローウェン#3023_1	416,{/* 1970 (hide)*/
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、東に進んで";
	mes "^0000ffバルコニー②^000000です。";
	close;
}
1_tiamat_58.gat,50,17,4	script	四騎士ローウェン#3024_1	416,{/* 1971 (hide)*/
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、西に進んで";
	mes "^0000ffバルコニー③^000000です。";
	close;
}
1_tiamat_58.gat,17,12,4	script	四騎士ローウェン#3025_1	416,{/* 1972 (hide)*/
	mes "[四騎士ローウェン]";
	mes "祭殿に向かうために、";
	mes "次は^0000ff謁見の間^000000に進む必要があります。";
	mes "私の西に進めば良いでしょう。";
	if(getvariableofnpc('flag,"レバー#204_1")+getvariableofnpc('flag,"レバー#007_1") < 2) {	// 待機室2F、城門②2F レバー
		mes "……ですが、扉が封印されていますね。";
		mes "周囲の部屋に何か封印を解くための";
		mes "起点となるようなものがあるはずです。";
	}
	close;
}
1_tiamat_37.gat,136,112,4	script	四騎士ローウェン#3026_1	416,{/* 1973 (hide)*/
	if(!($@tiamat_angel & (1<<9))) {
		mes "[四騎士ローウェン]";
		mes "悪しき気配を感じます……";
		mes "この部屋には何かが隠されているはず。";
		mes "姫様が仰るには";
		mes "城内にいる全ての守護天使を倒すことで";
		mes "最深部への道が開ける、と。";
		close;
	}
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、東に進んで";
	mes "^0000ff執務室^000000です。";
	close;
}
1_tiamat_42.gat,238,84,4	script	四騎士ローウェン#3027_1	416,{/* 1974 (hide)*/
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、西に進んで";
	mes "^0000ff城内通路2F01^000000です。";
	close;
}
1_tiamat_42.gat,264,172,4	script	四騎士ローウェン#3028_1	416,{/* 1975 (hide)*/
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、北に進んで";
	mes "^0000ff城内通路2F03^000000です。";
	close;
}
1_tiamat_35.gat,133,164,4	script	四騎士ローウェン#3029_1	416,{/* 1976 (hide)*/
	mes "[四騎士ローウェン]";
	mes "城内を進んで、祭殿を目指しましょう。";
	mes "そこに私の目的の物があるはずです。";
	mes "まずは、南に進んで";
	mes "^0000ff城内通路2F01^000000です。";
	close;
}
1_tiamat_04.gat,72,28,4	script	四騎士ローウェン#3030_1	416,{/* 1977 (hide)*/
	mes "[四騎士ローウェン]";
	mes "遠く険しい道のりでした……";
	mes "次が目的地の^0000ff祭殿^000000です。";
	mes "もう少しです。頑張りましょう。";
	close;
}
1_tiamat_52.gat,46,230,4	script	四騎士ローウェン#3031_1	416,{/* 1978 (hide)*/}
1_tiamat_04.gat,66,50,4	script	四騎士ローウェン#3031_2	416,{/* 1979 (hide)*/}
1_tiamat_52.gat,143,267,4	script	四騎士ローウェン#3032_1	416,{/* 1980 (hide)*/}
1_tiamat_04.gat,145,197,4	script	四騎士ローウェン#3033_1	416,{/* 1981 (hide)*/
		mes "[四騎士ローウェン]";
		mes "ふむ……なるほど。";
		mes "姫様のお力を以てしても";
		mes "解除には時間がかかりそうです。";
		mes "^0000ff王家の種^000000と^0000ff大きな鉢^000000、";
		mes "^0000ff清らかな水^000000が揃えるのが";
		mes "得策でしょう。";
		close;
	mes "[四騎士ローウェン]";
	mes "魔女の潜む部屋まで、後少しです。";
	mes "冒険者様のお力添えが無ければ";
	mes "ここまで来ることは";
	mes "出来なかったでしょう。";
	mes "感謝しております。";
	close;
}
1_tiamat_04.gat,187,131,4	script	四騎士ローウェン#3034_1	416,{/* 1982 (hide)*/
	mes "[四騎士ローウェン]";
	mes "魔女の潜む部屋まで、後少しです。";
	mes "冒険者様のお力添えが無ければ";
	mes "ここまで来ることは";
	mes "出来なかったでしょう。";
	mes "感謝しております。";
	close;
}
1_tiamat_35.gat,86,177,4	script	四騎士ローウェン#3035_1	416,{/* 1983 (hide)*/
	mes "[四騎士ローウェン]";
	mes "この先から、おぞましい気配を感じます。";
	mes "恐らくは魔女でしょう……";
	mes "不退転の決意をもって進みましょう。";
	close;
}
2_tiamat_01.gat,202,37,9	script	四騎士ローウェン#3036_1	416,{/* 1984 (hide)*/
	mes "[四騎士ローウェン]";
	mes "ふむ……";
	mes "流石は彼の王を操る策略家。";
	mes "そう簡単に本性を見せてはくれませんね。";
	mes "しかし、我々が王手をかけたことに";
	mes "間違いはありません。";
	close;
}
2_tiamat_00.gat,52,57,4	script	四騎士ローウェン#3037_1	416,{/* 1985 (hide)*/
	mes "[四騎士ローウェン]";
	mes "姫様のためにも";
	mes "負けるわけにはいきません。";
	mes "ここが正念場です。";
	close;
}
1_tiamat_60.gat,94,66,0	script	guest#part1_1	139,{/* 1988 (hide)*/}
1_tiamat_02.gat,149,18,0	script	guest#part2_1	139,{/* 1991 (hide)*/}
1_tiamat_02.gat,149,18,0	script	guest#part2_2	139,{/* 1992 (hide)*/}
1_tiamat_02.gat,149,18,0	script	guest#part2_3	139,{/* 1993 */}
1_tiamat_04.gat,142,194,0	script	guest#part3_1	139,{/* 1994 (hide)*/}
1_tiamat_04.gat,142,194,0	script	guest#part3_2	139,{/* 1995 (hide)*/}
1_tiamat_04.gat,142,194,0	script	guest#part3_3	139,{/* 1996 */}
1_tiamat_25.gat,174,22,0	script	guest#part4_1	139,{/* 1997 (hide)*/}
1_tiamat_25.gat,174,22,0	script	guest#part4_2	139,{/* 1998 (hide)*/}
1_tiamat_25.gat,174,22,0	script	guest#part4_3	139,{/* 1999 */}
1_tiamat_08.gat,101,127,0	script	guest#part5_1	139,{/* 2000 (hide)*/}
1_tiamat_08.gat,101,127,0	script	guest#part5_2	139,{/* 2001 */}
1_tiamat_08.gat,101,127,0	script	guest#part5_3	139,{/* 2002 (hide)*/}
1_tiamat_10.gat,85,89,0	script	guest#part6_1	139,{/* 2003 (hide)*/}
1_tiamat_10.gat,85,89,0	script	guest#part6_2	139,{/* 2004 */}
1_tiamat_10.gat,85,89,0	script	guest#part6_3	139,{/* 2005 (hide)*/}
1_tiamat_46.gat,66,158,0	script	guest#part7_1	139,{/* 2006 (hide)*/}
1_tiamat_46.gat,66,158,0	script	guest#part7_2	139,{/* 2007 (hide)*/}
1_tiamat_46.gat,66,158,0	script	guest#part7_3	139,{/* 2008 */}
1_tiamat_18.gat,49,47,0	script	guest#part8_1	139,{/* 2009 (hide)*/}
1_tiamat_18.gat,49,47,0	script	guest#part8_2	139,{/* 2010 (hide)*/}
1_tiamat_18.gat,49,47,0	script	guest#part8_3	139,{/* 2011 */}
1_tiamat_29.gat,249,244,0	script	guest#part9_1	139,{/* 2012 (hide)*/}
1_tiamat_29.gat,249,244,0	script	guest#part9_2	139,{/* 2013 (hide)*/}
1_tiamat_29.gat,249,244,0	script	guest#part9_3	139,{/* 2014 */}
1_tiamat_31.gat,50,95,0	script	guest#part10_1	139,{/* 2015 (hide)*/}
1_tiamat_31.gat,50,95,0	script	guest#part10_2	139,{/* 2016 (hide)*/}
1_tiamat_31.gat,50,95,0	script	guest#part10_2	139,{/* 2016 */}
1_tiamat_31.gat,50,95,0	script	guest#part10_3	139,{/* 2017 */}
1_tiamat_31.gat,50,95,0	script	guest#part10_3	139,{/* 2017 (hide)*/}
1_tiamat_42.gat,69,161,0	script	guest#part11_1	139,{/* 2018 (hide)*/}
1_tiamat_42.gat,69,161,0	script	guest#part11_2	139,{/* 2019 */}
1_tiamat_42.gat,69,161,0	script	guest#part11_3	139,{/* 2020 (hide)*/}
1_tiamat_39.gat,16,55,0	script	guest#part12_1	139,{/* 2021 (hide)*/}
1_tiamat_39.gat,16,55,0	script	guest#part12_2	139,{/* 2022 */}
1_tiamat_39.gat,16,55,0	script	guest#part12_3	139,{/* 2023 (hide)*/}
1_tiamat_37.gat,115,93,0	script	guest#part13_1	139,{/* 2024 (hide)*/}
1_tiamat_37.gat,115,93,0	script	guest#part13_2	139,{/* 2025 (hide)*/}
1_tiamat_37.gat,115,93,0	script	guest#part13_3	139,{/* 2026 */}
1_tiamat_23.gat,147,148,0	script	guest#part14_1	139,{/* 2027 (hide)*/}
1_tiamat_23.gat,147,148,0	script	guest#part14_2	139,{/* 2028 */}
1_tiamat_23.gat,147,148,0	script	guest#part14_3	139,{/* 2029 (hide)*/}
1_tiamat_49.gat,53,284,0	script	guest#part15_1	139,{/* 2030 (hide)*/}
1_tiamat_49.gat,53,284,0	script	guest#part15_2	139,{/* 2031 */}
1_tiamat_49.gat,53,284,0	script	guest#part15_3	139,{/* 2032 (hide)*/}
1_tiamat_43.gat,142,17,0	script	guest#part16_1	139,{/* 2033 (hide)*/}
1_tiamat_43.gat,142,17,0	script	guest#part16_2	139,{/* 2034 */}
1_tiamat_43.gat,142,17,0	script	guest#part16_3	139,{/* 2035 (hide)*/}
1_tiamat_62.gat,22,100,0	script	guest#part17_1	139,{/* 2036 (hide)*/}
1_tiamat_62.gat,22,100,0	script	guest#part17_2	139,{/* 2037 */}
1_tiamat_62.gat,22,100,0	script	guest#part17_3	139,{/* 2038 (hide)*/}
1_tiamat_51.gat,356,130,0	script	guest#part18_1	139,{/* 2039 (hide)*/}
1_tiamat_51.gat,356,130,0	script	guest#part18_2	139,{/* 2040 (hide)*/}
1_tiamat_51.gat,356,130,0	script	guest#part18_3	139,{/* 2041 */}
1_tiamat_08.gat,200,356,0	script	guest#part19_1	139,{/* 2042 (hide)*/}
1_tiamat_08.gat,200,356,0	script	guest#part19_2	139,{/* 2043 (hide)*/}
1_tiamat_08.gat,200,356,0	script	guest#part19_3	139,{/* 2044 */}
1_tiamat_54.gat,272,130,0	script	guest#part22_1	139,{/* 2051 (hide)*/}
1_tiamat_54.gat,272,130,0	script	guest#part22_2	139,{/* 2052 */}
1_tiamat_54.gat,272,130,0	script	guest#part22_3	139,{/* 2053 (hide)*/}
1_tiamat_41.gat,22,87,0	script	guest#part24_1	139,{/* 2057 (hide)*/}
1_tiamat_41.gat,22,87,0	script	guest#part24_2	139,{/* 2058 */}
1_tiamat_41.gat,22,87,0	script	guest#part24_3	139,{/* 2059 (hide)*/}
1_tiamat_35.gat,94,169,0	script	guest#part25_1	139,{/* 2060 (hide)*/}
1_tiamat_35.gat,94,169,0	script	guest#part25_2	139,{/* 2061 (hide)*/}
1_tiamat_35.gat,94,169,0	script	guest#part25_3	139,{/* 2062 */}
2_tiamat_00.gat,49,63,0	script	guest#part27_1	139,{/* 2066 (hide)*/}
2_tiamat_00.gat,49,63,0	script	guest#part27_2	139,{/* 2067 (hide)*/}
2_tiamat_00.gat,49,63,0	script	guest#part27_3	139,{/* 2068 */}
2_tiamat_02.gat,32,65,0	script	guest#part28_1	139,{/* 2069 (hide)*/}
2_tiamat_02.gat,32,65,0	script	guest#part28_2	139,{/* 2070 (hide)*/}
2_tiamat_02.gat,32,65,0	script	guest#part28_3	139,{/* 2071 */}

1_tiamat_00.gat,0,0,0	script	#tiamat_inital	139,{
OnStart:
	hideonnpc "area#r731";	//69
	hideonnpc "area#r611";	//76
	hideonnpc "area#r612";	//77
	hideonnpc "area#r831";	//78
	hideonnpc "area#r832";	//79
	hideonnpc "area#r841";	//80
	hideonnpc "area#r842";	//81
	hideonnpc "area#r843";	//82
	hideonnpc "area#r844";	//83
	hideonnpc "area#r845";	//84
	hideonnpc "area#r851";	//85
	hideonnpc "area#r861";	//86
	hideonnpc "area#r921";	//87
	hideonnpc "area#r941";	//88
	hideonnpc "area#r961";	//89
	hideonnpc "area#r1471";	//90
	hideonnpc "area#r631";	//130
	hideonnpc "area#r781";	//131
	hideonnpc "area#r1811";	//144
	hideonnpc "area#r1812";	//145
	hideonnpc "area#r1821";	//146
	hideonnpc "area#r1822";	//147
	hideonnpc "area#r1823";	//148
	hideonnpc "area#r1831";	//149
	hideonnpc "area#r1832";	//150
	hideonnpc "area#r1841";	//151
	hideonnpc "area#r1842";	//152
	hideonnpc "area#k1831";	//153
	hideonnpc "area#r121";	//171
	hideonnpc "area#r122";	//172
	hideonnpc "area#r131";	//173
	hideonnpc "area#r132";	//174
	hideonnpc "area#r1271";	//175
	hideonnpc "area#r1272";	//176
	hideonnpc "area#r1401";	//189
	hideonnpc "area#r1851";	//196
	hideonnpc "area#r351";	//205
	hideonnpc "area#r352";	//206
	hideonnpc "area#r361";	//207
	hideonnpc "area#r362";	//208
	hideonnpc "area#r363";	//209
	hideonnpc "area#r371";	//210
	hideonnpc "area#r372";	//211
	hideonnpc "area#r373";	//212
	hideonnpc "area#r481";	//213
	hideonnpc "area#r491";	//214
	hideonnpc "area#r492";	//215
	hideonnpc "area#r493";	//216
	hideonnpc "area#r494";	//217
	hideonnpc "area#r501";	//218
	hideonnpc "area#r502";	//219
	hideonnpc "area#r503";	//220
	hideonnpc "area#r504";	//221
	hideonnpc "area#r521";	//222
	hideonnpc "area#r522";	//223
	hideonnpc "area#r531";	//224
	hideonnpc "area#r532";	//225
	hideonnpc "area#r533";	//226
	hideonnpc "area#r534";	//227
	hideonnpc "area#r541";	//228
	hideonnpc "area#r542";	//229
	hideonnpc "area#r543";	//230
	hideonnpc "area#r544";	//231
	hideonnpc "area#r651";	//232
	hideonnpc "area#r652";	//233
	hideonnpc "area#r653";	//234
	hideonnpc "area#r661";	//235
	hideonnpc "area#r662";	//236
	hideonnpc "area#r663";	//237
	hideonnpc "area#r664";	//238
	hideonnpc "area#r671";	//239
	hideonnpc "area#r672";	//240
	hideonnpc "area#r673";	//241
	hideonnpc "area#r674";	//242
	hideonnpc "area#r691";	//243
	hideonnpc "area#r701";	//244
	hideonnpc "area#r702";	//245
	hideonnpc "area#r703";	//246
	hideonnpc "area#r711";	//247
	hideonnpc "area#r712";	//248
	hideonnpc "area#r713";	//249
	hideonnpc "area#r721";	//250
	hideonnpc "area#r722";	//251
	hideonnpc "area#r1711";	//252
	hideonnpc "area#r1712";	//253
	hideonnpc "area#r1713";	//254
	hideonnpc "area#r1721";	//255
	hideonnpc "area#r1722";	//256
	hideonnpc "area#r1731";	//257
	hideonnpc "area#r1732";	//258
	hideonnpc "area#r811";	//334
	hideonnpc "area#r821";	//335
	hideonnpc "area#r1181";	//336
	hideonnpc "area#r1741";	//344
	hideonnpc "area#r2001";	//355
	hideonnpc "area#r1331";	//361
	hideonnpc "area#r1341";	//362
	hideonnpc "area#r1351";	//363
	hideonnpc "area#r1361";	//364
	hideonnpc "area#r1371";	//365
	hideonnpc "area#r1381";	//366
	hideonnpc "area#r1391";	//367
	hideonnpc "area#r1411";	//368
	hideonnpc "area#r1412";	//369
	hideonnpc "area#r1413";	//370
	hideonnpc "area#r1414";	//371
	hideonnpc "area#r1415";	//372
	hideonnpc "area#r1416";	//373
	hideonnpc "area#r1417";	//374
	hideonnpc "area#r1418";	//375
	hideonnpc "area#r1419";	//376
	hideonnpc "area#r191";	//377
	hideonnpc "area#r192";	//378
	hideonnpc "area#r201";	//379
	hideonnpc "area#r202";	//380
	hideonnpc "area#r221";	//381
	hideonnpc "area#r41";	//429
	hideonnpc "area#r42";	//430
	hideonnpc "area#r43";	//431
	hideonnpc "area#r44";	//432
	hideonnpc "area#r45";	//433
	hideonnpc "area#r561";	//443
	hideonnpc "area#r562";	//444
	hideonnpc "area#r571";	//445
	hideonnpc "area#r572";	//446
	hideonnpc "area#r573";	//447
	hideonnpc "area#r601";	//448
	hideonnpc "area#r1041";	//458
	hideonnpc "area#r451";	//470
	hideonnpc "area#r452";	//471
	hideonnpc "area#r461";	//481
	hideonnpc "area#r462";	//482
	hideonnpc "area#r871";	//499
	hideonnpc "area#r1141";	//500
	hideonnpc "area#r1151";	//501
	hideonnpc "area#r181";	//507
	hideonnpc "area#r182";	//508
	hideonnpc "area#r751";	//509
	hideonnpc "area#r752";	//510
	hideonnpc "area#r761";	//511
	hideonnpc "area#r762";	//512
	hideonnpc "area#r763";	//513
	hideonnpc "area#r771";	//514
	hideonnpc "area#r772";	//515
	hideonnpc "area#r773";	//516
	hideonnpc "area#r1941";	//530
	hideonnpc "area#r1951";	//531
	hideonnpc "area#r1961";	//532
	hideonnpc "area#r1971";	//533
	hideonnpc "area#r1981";	//534
	hideonnpc "area#r1982";	//535
	hideonnpc "area#r1983";	//536
	hideonnpc "area#r1984";	//537
	hideonnpc "area#r1985";	//538
	hideonnpc "area#r1986";	//539
	hideonnpc "area#r1987";	//540
	hideonnpc "area#r641";	//575
	hideonnpc "area#r642";	//576
	hideonnpc "area#r1321";	//577
	hideonnpc "area#r1322";	//578
	hideonnpc "area#r1251";	//587
	hideonnpc "area#r1252";	//588
	hideonnpc "area#r1281";	//589
	hideonnpc "area#r1282";	//590
	hideonnpc "area#r1291";	//591
	hideonnpc "area#r1292";	//592
	hideonnpc "area#r1301";	//593
	hideonnpc "area#r1302";	//594
	hideonnpc "area#r1303";	//595
	hideonnpc "area#r1991";	//596
	hideonnpc "area#r1992";	//597
	hideonnpc "area#r31";	//640
	hideonnpc "area#r32";	//641
	hideonnpc "area#r33";	//642
	hideonnpc "area#r34";	//643
	hideonnpc "area#r35";	//644
	hideonnpc "area#r101";	//645
	hideonnpc "area#r1511";	//661
	hideonnpc "area#r1512";	//662
	hideonnpc "area#r1421";	//668
	hideonnpc "area#r1422";	//669
	hideonnpc "area#r1423";	//670
	hideonnpc "area#r1424";	//671
	hideonnpc "area#r1425";	//672
	hideonnpc "area#r1426";	//673
	hideonnpc "area#r1427";	//674
	hideonnpc "area#r1431";	//675
	hideonnpc "area#r1441";	//676
	hideonnpc "area#r1451";	//677
	hideonnpc "area#r1461";	//678
	hideonnpc "area#r1481";	//679
	hideonnpc "area#r1482";	//680
	hideonnpc "area#r1483";	//681
	hideonnpc "area#r1484";	//682
	hideonnpc "area#r1491";	//683
	hideonnpc "area#r1501";	//684
	hideonnpc "area#r981";	//719
	hideonnpc "area#r1571";	//720
	hideonnpc "area#r1572";	//721
	hideonnpc "area#r1573";	//722
	hideonnpc "area#r741";	//746
	hideonnpc "area#r742";	//
	hideonnpc "area#r931";	//755
	hideonnpc "area#r1131";	//756
	hideonnpc "area#r1521";	//757
	hideonnpc "area#r1522";	//758
	hideonnpc "area#r1523";	//759
	hideonnpc "area#r1524";	//760
	hideonnpc "area#r1525";	//761
	hideonnpc "area#r1531";	//762
	hideonnpc "area#r1541";	//763
	hideonnpc "area#r1551";	//764
	hideonnpc "area#r1061";	//786
	hideonnpc "area#r1062";	//787
	hideonnpc "area#r1071";	//788
	hideonnpc "area#r1072";	//789
	hideonnpc "area#r1073";	//790
	hideonnpc "area#r1211";	//791
	hideonnpc "area#r1212";	//792
	hideonnpc "area#r1871";	//793
	hideonnpc "area#r1872";	//794
	hideonnpc "area#r1873";	//795
	hideonnpc "area#r111";	//813
	hideonnpc "area#r112";	//814
	hideonnpc "area#r1931";	//815
	hideonnpc "area#r951";	//825
	hideonnpc "area#r952";	//826
	hideonnpc "area#r953";	//827
	hideonnpc "area#r954";	//828
	hideonnpc "area#r955";	//829
	hideonnpc "area#r1201";	//830
	hideonnpc "area#r61";	//845
	hideonnpc "area#r62";	//846
	hideonnpc "area#r63";	//847
	hideonnpc "area#r1701";	//854
	hideonnpc "area#r1702";	//855
	hideonnpc "area#r1901";	//856
	hideonnpc "area#r1902";	//857
	hideonnpc "area#r1903";	//858
	hideonnpc "area#r1911";	//859
	hideonnpc "area#r1912";	//860
	hideonnpc "area#r1921";	//861
	hideonnpc "area#r81";	//877
	hideonnpc "area#r91";	//878
	hideonnpc "area#r161";	//887
	hideonnpc "area#r581";	//888
	hideonnpc "area#r582";	//889
	hideonnpc "area#r583";	//890
	hideonnpc "area#r621";	//891
	hideonnpc "area#r622";	//892
	hideonnpc "area#r623";	//893
	hideonnpc "area#r71";	//911
	hideonnpc "area#r801";	//912
	hideonnpc "area#r802";	//913
	hideonnpc "area#r803";	//914
	hideonnpc "area#r804";	//915
	hideonnpc "area#r805";	//916
	hideonnpc "area#r806";	//917
	hideonnpc "area#r881";	//918
	hideonnpc "area#r882";	//919
	hideonnpc "area#r891";	//920
	hideonnpc "area#r892";	//921
	hideonnpc "area#r991";	//922
	hideonnpc "area#r992";	//923
	hideonnpc "area#r1031";	//924
	hideonnpc "area#r1051";	//925
	hideonnpc "area#r1052";	//926
	hideonnpc "area#r1053";	//927
	hideonnpc "area#r1054";	//928
	hideonnpc "area#r1055";	//929
	hideonnpc "area#r1056";	//930
	hideonnpc "area#r1057";	//931
	hideonnpc "area#r1058";	//932
	hideonnpc "area#r1059";	//933
	hideonnpc "area#r10510";	//934
	hideonnpc "area#r1081";	//935
	hideonnpc "area#r1082";	//936
	hideonnpc "area#r1091";	//937
	hideonnpc "area#r1101";	//938
	hideonnpc "area#r1111";	//939
	hideonnpc "area#r1161";	//940
	hideonnpc "area#r1162";	//941
	hideonnpc "area#r1171";	//942
	hideonnpc "area#r1191";	//943
	hideonnpc "area#r1221";	//944
	hideonnpc "area#r1222";	//945
	hideonnpc "area#r1223";	//946
	hideonnpc "area#r1224";	//947
	hideonnpc "area#r901";	//1029
	hideonnpc "area#r1001";	//1030
	hideonnpc "area#r1011";	//1031
	hideonnpc "area#r1021";	//1032
	hideonnpc "area#r1231";	//1033
	hideonnpc "area#r1232";	//1034
	hideonnpc "area#r1233";	//1035
	hideonnpc "area#r1234";	//1036
	hideonnpc "area#r1235";	//1037
	hideonnpc "area#r1236";	//1038
	hideonnpc "area#r1241";	//1039
	hideonnpc "area#r1242";	//1040
	hideonnpc "area#r1243";	//1041
	hideonnpc "area#r1244";	//1042
	hideonnpc "area#r1245";	//1043
	hideonnpc "area#r1246";	//1044
	hideonnpc "area#r1581";	//1065
	hideonnpc "area#r1582";	//1066
	hideonnpc "area#r1583";	//1067
	hideonnpc "area#r1584";	//1068
	hideonnpc "area#r1585";	//1069
	hideonnpc "area#r1591";	//1070
	hideonnpc "area#r271";	//1080
	hideonnpc "area#r272";	//1081
	hideonnpc "area#r291";	//1082
	hideonnpc "area#r292";	//1083
	hideonnpc "area#r281";	//1094
	hideonnpc "area#r282";	//1095
	hideonnpc "area#r301";	//1096
	hideonnpc "area#r302";	//1097
	hideonnpc "area#r51";	//1106
	hideonnpc "area#r52";	//1107
	hideonnpc "area#r311";	//1113
	hideonnpc "area#r312";	//1114
	hideonnpc "area#r331";	//1115
	hideonnpc "area#r332";	//1116
	hideonnpc "area#r321";	//1123
	hideonnpc "area#r322";	//?
	hideonnpc "area#r341";	//?
	hideonnpc "area#r342";	//1126
	hideonnpc "area#r791";	//1127
	hideonnpc "area#r792";	//1128
	hideonnpc "area#r21";	//1137
	hideonnpc "area#r22";	//1138
	hideonnpc "area#r23";	//1139
	hideonnpc "area#r24";	//1140
	hideonnpc "area#r1561";	//1149
	hideonnpc "area#r1562";	//1150
	hideonnpc "area#r1601";	//1151
	hideonnpc "area#r1771";	//1161
	hideonnpc "area#r1772";	//1162
	hideonnpc "area#r1801";	//1163
	hideonnpc "area#r1802";	//1164
	hideonnpc "area#r1311";	//1173
	hideonnpc "area#r1761";	//1174
	hideonnpc "area#r1762";	//1175
	hideonnpc "area#r1763";	//1176
	hideonnpc "area#r1764";	//1177
	hideonnpc "area#r1781";	//1178
	hideonnpc "area#r1791";	//1179
	hideonnpc "area#r1611";	//1202
	hideonnpc "area#r1621";	//1203
	hideonnpc "area#r1622";	//1204
	hideonnpc "area#r1623";	//1205
	hideonnpc "area#r1624";	//1206
	hideonnpc "area#r1631";	//1207
	hideonnpc "area#r1632";	//1208
	hideonnpc "area#r1641";	//1209
	hideonnpc "area#r1651";	//1210
	hideonnpc "area#r1661";	//1211
	hideonnpc "area#r1671";	//1212
	hideonnpc "area#r1681";	//1213
	hideonnpc "area#r1682";	//1214
	hideonnpc "area#r1683";	//1215
	hideonnpc "area#r1684";	//1216
	hideonnpc "area#r1691";	//1217
	hideonnpc "area#r1692";	//1218
	hideonnpc "area#r1693";	//1219
	hideonnpc "area#r141";	//1257
	hideonnpc "area#r142";	//1258
	hideonnpc "area#r231";	//1263
	hideonnpc "area#r232";	//1264
	hideonnpc "area#r241";	//1265
	hideonnpc "area#r242";	//1266
	hideonnpc "area#r243";	//1267
	hideonnpc "area#r251";	//1268
	hideonnpc "area#r252";	//1269
	hideonnpc "area#r253";	//1270
	hideonnpc "area#r261";	//1271
	hideonnpc "area#r171";	//1289
	hideonnpc "area#r172";	//1290
	hideonnpc "area#r381";	//1291
	hideonnpc "area#r382";	//1292
	hideonnpc "area#r511";	//1293
	hideonnpc "area#r551";	//1294
	hideonnpc "area#r591";	//1295
	hideonnpc "area#r681";	//1296
	hideonnpc "area#r911";	//1307
	hideonnpc "area#r912";	//1308
	hideonnpc "area#r913";	//1309
	hideonnpc "area#r2011";	//1310
	hideonnpc "area#r2012";	//1311
	hideonnpc "area#r2013";	//1312
	hideonnpc "area#r2014";	//1313
	hideonnpc "area#r2021";	//1314
	hideonnpc "area#r2022";	//1315
	hideonnpc "area#r2023";	//1316
	hideonnpc "area#r211";	//1317
	hideonnpc "area#r212";	//1318
	hideonnpc "area#r1751";	//1349
	hideonnpc "area#r1752";	//1350
	hideonnpc "area#r151";	//1355
	hideonnpc "area#r152";	//1356
	hideonnpc "area#r153";	//1357
	hideonnpc "area#r154";	//1358
	hideonnpc "area#r391";	//1373
	hideonnpc "area#r392";	//1374
	hideonnpc "area#r401";	//1375
	hideonnpc "area#r402";	//1376
	hideonnpc "area#r411";	//1377
	hideonnpc "area#r971";	//1378
	hideonnpc "area#r1121";	//1388
	hideonnpc "area#r1261";	//1393
	hideonnpc "area#r1262";	//1394
	hideonnpc "area#r1263";	//1395
	hideonnpc "area#r1264";	//1396
	hideonnpc "area#r1265";	//1397
	hideonnpc "area#r1881";	//1408
	//hideonnpc "area#r1882";	//1409
	hideonnpc "area#r1861";	//1436

	hideonnpc "area#k921";	//91
	hideonnpc "area#k941";	//92
	hideonnpc "area#k841";	//93
	hideonnpc "area#k832";	//94
	hideonnpc "area#k612";	//95
	hideonnpc "area#k1471";	//96
	hideonnpc "area#k1812";	//154
	hideonnpc "area#k131";	//177
	hideonnpc "area#k122";	//178
	hideonnpc "area#k1271";	//179
	hideonnpc "area#k132";	//180
	hideonnpc "area#k1851";	//197
	hideonnpc "area#k652";	//259
	hideonnpc "area#k661";	//260
	hideonnpc "area#k672";	//261
	hideonnpc "area#k664";	//262
	hideonnpc "area#k373";	//263
	hideonnpc "area#k504";	//264
	hideonnpc "area#k503";	//265
	hideonnpc "area#k544";	//266
	hideonnpc "area#k703";	//267
	hideonnpc "area#k522";	//268
	hideonnpc "area#k533";	//269
	hideonnpc "area#k363";	//270
	hideonnpc "area#k2001";	//356
	hideonnpc "area#k221";	//382
	hideonnpc "area#k191";	//383
	hideonnpc "area#k44";	//434
	hideonnpc "area#k45";	//435
	hideonnpc "area#k601";	//449
	hideonnpc "area#k1041";	//459
	hideonnpc "area#k451";	//472
	hideonnpc "area#k461";	//483
	hideonnpc "area#k462";	//484
	hideonnpc "area#k763";	//517
	hideonnpc "area#k1941";	//541
	hideonnpc "area#k1951";	//542
	hideonnpc "area#k1961";	//543
	hideonnpc "area#k1971";	//544
	hideonnpc "area#k1983";	//545
	hideonnpc "area#k1984";	//546
	hideonnpc "area#k1985";	//547
	hideonnpc "area#k1986";	//548
	hideonnpc "area#k641";	//579
	hideonnpc "area#k1301";	//598
	hideonnpc "area#k1302";	//599
	hideonnpc "area#k1303";	//600
	hideonnpc "area#k1251";	//601
	hideonnpc "area#k1291";	//602
	hideonnpc "area#k1292";	//603
	hideonnpc "area#k1992";	//604
	hideonnpc "area#k32";	//646
	hideonnpc "area#k35";	//647
	hideonnpc "area#k34";	//648
	hideonnpc "area#k31";	//649
	hideonnpc "area#k1512";	//663
	hideonnpc "area#k1481";	//685
	hideonnpc "area#k1482";	//686
	hideonnpc "area#k1491";	//687
	hideonnpc "area#k1426";	//688
	hideonnpc "area#k1421";	//689
	hideonnpc "area#k1427";	//690
	hideonnpc "area#k1571";	//723
	hideonnpc "area#k1573";	//724
	hideonnpc "area#k1521";	//765
	hideonnpc "area#k1525";	//766
	hideonnpc "area#k1061";	//796
	hideonnpc "area#k1071";	//797
	hideonnpc "area#k1872";	//798
	hideonnpc "area#k1873";	//799
	hideonnpc "area#k112";	//816
	hideonnpc "area#k951";	//831
	hideonnpc "area#k953";	//832
	hideonnpc "area#k1201";	//833
	hideonnpc "area#k62";	//848
	hideonnpc "area#k81";	//879
	hideonnpc "area#k803";	//970
	hideonnpc "area#k1057";	//971
	hideonnpc "area#k1058";	//972
	hideonnpc "area#k1059";	//973
	hideonnpc "area#k1222";	//974
	hideonnpc "area#k1224";	//975
	hideonnpc "area#k892";	//976
	hideonnpc "area#k991";	//977
	hideonnpc "area#k1051";	//978
	hideonnpc "area#k1231";	//1045
	hideonnpc "area#k1584";	//1071
	hideonnpc "area#k272";	//1084
	hideonnpc "area#k271";	//1085
	hideonnpc "area#k291";	//1086
	hideonnpc "area#k292";	//1087
	hideonnpc "area#k281";	//1098
	hideonnpc "area#k301";	//1099
	hideonnpc "area#k51";	//1108
	hideonnpc "area#k22";	//1141
	hideonnpc "area#k24";	//1142
	hideonnpc "area#k1561";	//1152
	hideonnpc "area#k1762";	//1181
	hideonnpc "area#k1764";	//1183
	hideonnpc "area#k1631";	//1220
	hideonnpc "area#k1693";	//1221
	hideonnpc "area#k1651";	//1222
	hideonnpc "area#k1692";	//1223
	hideonnpc "area#k1671";	//1224
	hideonnpc "area#k1622";	//1225
	hideonnpc "area#k1624";	//1226
	hideonnpc "area#k1684";	//1227
	hideonnpc "area#k1661";	//1228
	hideonnpc "area#k243";	//1272
	hideonnpc "area#k241";	//1273
	hideonnpc "area#k251";	//1274
	hideonnpc "area#k253";	//1275
	hideonnpc "area#k911";	//1319
	hideonnpc "area#k2023";	//1320
	hideonnpc "area#k211";	//1321
	hideonnpc "area#k2012";	//1322
	hideonnpc "area#k2013";	//1323
	hideonnpc "area#k2022";	//1324
	hideonnpc "area#k1262";	//1398
	hideonnpc "area#k1263";	//1399
	hideonnpc "area#k1264";	//1400

	donpcevent "レバー#102_1::OnStart";
	donpcevent "レバー#103_1::OnStart";
	donpcevent "レバー#104_1::OnStart";
	donpcevent "レバー#105_1::OnStart";
	donpcevent "レバー#106_1::OnStart";
	donpcevent "レバー#107_1::OnStart";
	donpcevent "レバー#107_2::OnStart";
	donpcevent "レバー#107_3::OnStart";
	donpcevent "レバー#108_1::OnStart";
	donpcevent "レバー#109_1::OnStart";
	donpcevent "レバー#201_1::OnStart";
	donpcevent "レバー#202_1::OnStart";
	donpcevent "レバー#203_1::OnStart";
	donpcevent "レバー#204_1::OnStart";
	donpcevent "レバー#205_1::OnStart";
	donpcevent "レバー#206_1::OnStart";
	donpcevent "レバー#315_1::OnStart";
	donpcevent "レバー#001_1::OnStart";
	donpcevent "レバー#002_1::OnStart";
	donpcevent "レバー#003_1::OnStart";
	donpcevent "レバー#004_1::OnStart";
	donpcevent "レバー#005_1::OnStart";
	donpcevent "レバー#006_1::OnStart";
	donpcevent "レバー#006_2::OnStart";
	donpcevent "レバー#006_3::OnStart";
	donpcevent "レバー#007_1::OnStart";
	donpcevent "レバー#008_1::OnStart";
	donpcevent "レバー#009_1::OnStart";
	donpcevent "レバー#010_1::OnStart";
	donpcevent "レバー#011_1::OnStart";
	donpcevent "レバー#311_1::OnStart";
	donpcevent "レバー#311_2::OnStart";
	donpcevent "レバー#311_3::OnStart";
	donpcevent "レバー#311_4::OnStart";

	donpcevent "古びた書物#97::OnStart";

	donpcevent "神官の彫像#r177::OnStart";
	
	donpcevent "#転送19_01::OnStart";
	donpcevent "#転送21_01::OnStart";
	donpcevent "#罠20_04::OnStart";
	donpcevent "#罠21_08::OnStart";

	hideonnpc "王城入口#0A";
	hideonnpc "王城入口#0B";
	hideonnpc "王城入口#0C";
	hideonnpc "王城入口#0D";

	hideoffnpc "四騎士ミルカ#ex001";
	hideoffnpc "四騎士ハウンド#ex001";
	hideoffnpc "四騎士ローウェン#ex001";
	hideoffnpc "魔女ジラント#tia60";
	hideoffnpc "王女メア#tia60";
	hideoffnpc "四騎士ミルカ#tia60";
	hideoffnpc "四騎士ハウンド#tia60";
	hideoffnpc "四騎士ローウェン#tia60";
	hideoffnpc "試練の石碑#r199";
	hideonnpc "ルキフグス#tia60";
	setnpcdisplay "ルキフグス#tia60",844;
	hideonnpc "フルーレティ#r84";
	setnpcdisplay "フルーレティ#r84",844;
	hideonnpc "守護天使の亡骸#r84";
	hideonnpc "サタナキア#r43";
	setnpcdisplay "サタナキア#r43",844;
	hideonnpc "守護天使の亡骸#r43";
	hideonnpc "アムブリエル#r166";
	setnpcdisplay "アムブリエル#r166",844;
	hideonnpc "守護天使の亡骸#r166";
	hideonnpc "ハナエル#r128";
	setnpcdisplay "ハナエル#r128",844;
	hideonnpc "守護天使の亡骸#r128";
	hideonnpc "ガムビエル#r10";
	setnpcdisplay "ガムビエル#r10",844;
	hideonnpc "守護天使の亡骸#r10";
	hideonnpc "ネビロス#r140";
	setnpcdisplay "ネビロス#r140",844;
	hideonnpc "守護天使の亡骸#r140";
	hideonnpc "アイニ#r174";
	setnpcdisplay "アイニ#r174",844;
	hideonnpc "守護天使の亡骸#r174";
	hideonnpc "バルビエル#r149";
	setnpcdisplay "バルビエル#r149",844;
	hideonnpc "守護天使の亡骸#r149";
	hideonnpc "ウェルキエル#r8";
	setnpcdisplay "ウェルキエル#r8",844;
	hideonnpc "守護天使の亡骸#r8";
	hideonnpc "アドナキエル#r156";
	setnpcdisplay "アドナキエル#r156",844;
	hideonnpc "守護天使の亡骸#r156";
	hideonnpc "アガリアレプト#r95";
	setnpcdisplay "アガリアレプト#r95",844;
	hideonnpc "守護天使の亡骸#r95";
	hideonnpc "ズリエル#r178";
	setnpcdisplay "ズリエル#r178",844;
	hideonnpc "守護天使の亡骸#r178";
	hideonnpc "サタン#r179";
	setnpcdisplay "サタン#r179",844;
	hideonnpc "守護天使の亡骸#r179";
	hideonnpc "ムリエル#r176";
	setnpcdisplay "ムリエル#r176",844;
	hideonnpc "守護天使の亡骸#r176";
	hideonnpc "アスモデル#r108";
	setnpcdisplay "アスモデル#r108",844;
	hideonnpc "守護天使の亡骸#r108";
	hideonnpc "ハマリエル#r110";
	setnpcdisplay "ハマリエル#r110",844;
	hideonnpc "守護天使の亡骸#r110";
	hideonnpc "バキエル#r111";
	setnpcdisplay "バキエル#r111",844;
	hideonnpc "守護天使の亡骸#r111";
	hideonnpc "アスタロト#r113";
	setnpcdisplay "アスタロト#r113",844;
	hideonnpc "守護天使の亡骸#r113";
	hideonnpc "マルキダエル#r193";
	setnpcdisplay "マルキダエル#r193",844;
	hideonnpc "守護天使の亡骸#r193";
	hideonnpc "サルガタナス#r181";
	setnpcdisplay "サルガタナス#r181",844;
	hideonnpc "守護天使の亡骸#r181";
	hideonnpc "ルシフェル#r185";
	setnpcdisplay "ルシフェル#r185",844;
	hideonnpc "守護天使の亡骸#r185";

	hideonnpc "魔術師の魂#2_tiamat_00";
	hideonnpc "女教皇の魂#2_tiamat_00";
	hideonnpc "女帝の魂#2_tiamat_00";
	hideonnpc "皇帝の魂#2_tiamat_00";
	hideonnpc "法王の魂#2_tiamat_00";
	hideonnpc "恋人の魂#2_tiamat_00";
	hideonnpc "戦車の魂#2_tiamat_00";
	hideonnpc "力の魂#2_tiamat_00";
	hideonnpc "隠者の魂#2_tiamat_00";
	hideonnpc "運命の輪の魂#2_tiamat_00";
	hideonnpc "正義の魂#2_tiamat_00";
	hideonnpc "吊るされた男の魂#2_tiamat_00";
	hideonnpc "死神の魂#2_tiamat_00";
	hideonnpc "節制の魂#2_tiamat_00";
	hideonnpc "悪魔の魂#2_tiamat_00";
	hideonnpc "塔の魂#2_tiamat_00";
	hideonnpc "星の魂#2_tiamat_00";
	hideonnpc "月の魂#2_tiamat_00";
	hideonnpc "太陽の魂#2_tiamat_00";
	hideonnpc "審判の魂#2_tiamat_00";
	hideonnpc "世界の魂#2_tiamat_00";
	hideonnpc "愚者の魂#2_tiamat_00";
	setnpcdisplay "魔術師の魂#2_tiamat_00",2999; //1410
	setnpcdisplay "女教皇の魂#2_tiamat_00",1147; //1411
	setnpcdisplay "女帝の魂#2_tiamat_00",1630; //1412
	setnpcdisplay "皇帝の魂#2_tiamat_00",1038; //1413
	setnpcdisplay "法王の魂#2_tiamat_00",1157; //1414
	setnpcdisplay "恋人の魂#2_tiamat_00",1681; //1415
	setnpcdisplay "戦車の魂#2_tiamat_00",2362; //1416
	setnpcdisplay "力の魂#2_tiamat_00",1785; //1417
	setnpcdisplay "隠者の魂#2_tiamat_00",1418; //1418
	setnpcdisplay "運命の輪の魂#2_tiamat_00",1871; //1419
	setnpcdisplay "正義の魂#2_tiamat_00",1751; //1420
	setnpcdisplay "吊るされた男の魂#2_tiamat_00",1779; //1421
	setnpcdisplay "死神の魂#2_tiamat_00",1046;
	setnpcdisplay "節制の魂#2_tiamat_00",2202;
	setnpcdisplay "悪魔の魂#2_tiamat_00",1272;
	setnpcdisplay "塔の魂#2_tiamat_00",1039;
	setnpcdisplay "星の魂#2_tiamat_00",1734;
	setnpcdisplay "月の魂#2_tiamat_00",1150;
	setnpcdisplay "太陽の魂#2_tiamat_00",1832;
	setnpcdisplay "審判の魂#2_tiamat_00",1373;
	setnpcdisplay "世界の魂#2_tiamat_00",2022;
	setnpcdisplay "愚者の魂#2_tiamat_00",1870;
	hideonnpc "地下祭壇#188B";

	hideonnpc "？？？？#r7";
	hideoffnpc "水門①開閉装置#k73CG08";
	hideonnpc "水門①開閉装置#r73CG08";
	hideoffnpc "水門②開閉装置#k74AG08";
	hideonnpc "水門②開閉装置#r74AG08";
	hideonnpc "デヒョン像#r37CG03";
	hideonnpc "ヒュリエル像#r50CG04";
	hideonnpc "ジオイア像#r62CG05";
	hideonnpc "カデス像#r71CG06";
	hideoffnpc "デヒョン像#k37CG03";
	hideoffnpc "ヒュリエル像#k50CG04";
	hideoffnpc "ジオイア像#k62CG05";
	hideoffnpc "カデス像#k71CG06";
	donpcevent "裂け目#r133CG09::OnStart";
	hideonnpc "鐘#r174CG09";
	hideoffnpc "鐘#k174CG09";

	for(set '@i,1; '@i<=6; set '@i,'@i+1)
		hideonnpc "悍ましい焼き物#r98_00"+ '@i;
	set '@i,rand(1,6);
	hideoffnpc "悍ましい焼き物#r98_00"+ '@i;
	set getvariableofnpc('flag,"第1の騎士像#96"),'@i;
	set getvariableofnpc('flag,"第2の騎士像#96"),'@i;
	set getvariableofnpc('flag,"第3の騎士像#96"),'@i;
	set getvariableofnpc('flag,"第4の騎士像#96"),'@i;
	set getvariableofnpc('flag,"第5の騎士像#96"),'@i;
	set getvariableofnpc('flag,"第6の騎士像#96"),'@i;
	set getvariableofnpc('flag,"第7の騎士像#96"),'@i;
	set getvariableofnpc('flag,"第8の騎士像#96"),'@i;
	setarray '@list,1,2,3,4,5,6,7,8;
	for(set '@i,1; '@i<=8; set '@i,'@i+1) {
		set '@r,rand(getarraysize('@list));
		set getvariableofnpc('flag,"石像#r98_00"+'@i),'@list['@r];
		deletearray '@list['@r],1;
	}

	hideoffnpc "転移の石碑#k441";
	hideonnpc "転移の石碑#e441";
	hideonnpc "転移の石碑#r441";
	hideoffnpc "転移の石碑#k451";
	hideonnpc "転移の石碑#e451";
	hideonnpc "転移の石碑#r451";
	hideoffnpc "転移の石碑#k461";
	hideonnpc "転移の石碑#e461";
	hideonnpc "転移の石碑#r461";
	hideoffnpc "転移の石碑#k421";
	hideonnpc "転移の石碑#r421";
	hideoffnpc "転移の石碑#k471";
	hideonnpc "転移の石碑#e471";
	hideonnpc "転移の石碑#r471";

	donpcevent "血の祭壇#r133::OnStart";
	donpcevent "血の祭壇#r134::OnStart";
	donpcevent "血の祭壇#r135::OnStart";
	donpcevent "血の祭壇#r136::OnStart";
	donpcevent "血の祭壇#r137::OnStart";
	donpcevent "血の祭壇#r138::OnStart";
	donpcevent "血の祭壇#r139::OnStart";

	donpcevent "封印の祠#r194::OnStart";
	donpcevent "封印の祠#r195::OnStart";
	donpcevent "封印の祠#r196::OnStart";
	hideonnpc "封印の祠#k194";
	hideonnpc "封印の祠#k195";
	hideonnpc "封印の祠#k196";
	hideonnpc "gate08_001#1_tiamat_23";
	hideonnpc "gate09_001#1_tiamat_23";
	hideonnpc "gate10_001#1_tiamat_23";

	for(set '@i,1; '@i<=8; set '@i,'@i+1) {
		hideonnpc "spe2_0" +'@i+ "#2_tiamat_01"; //1448
		hideonnpc "spe5_0" +'@i+ "#2_tiamat_01"; //1448
	}
	for(set '@i,1; '@i<=4; set '@i,'@i+1) {
		hideonnpc "pat3_0" +'@i+ "#2_tiamat_02"; //1448
		hideonnpc "spe2_0" +'@i+ "#2_tiamat_02"; //1448
		hideonnpc "spe3_0" +'@i+ "#2_tiamat_02"; //1448
	}

	hideonnpc "四騎士ミルカ#101_1";
	hideonnpc "四騎士ミルカ#101_2";
	hideonnpc "四騎士ハウンド#201_1";
	hideonnpc "四騎士ハウンド#201_2";
	hideonnpc "四騎士ハウンド#201_3";
	hideonnpc "四騎士ハウンド#201_4";
	hideonnpc "四騎士ハウンド#202_1";
	hideonnpc "四騎士ハウンド#203_1";
	hideonnpc "四騎士ハウンド#204_1";
	hideonnpc "四騎士ハウンド#205_1";
	hideonnpc "四騎士ハウンド#206_1";
	hideonnpc "四騎士ハウンド#207_1";
	hideonnpc "四騎士ハウンド#208_1";
	hideonnpc "四騎士ハウンド#208_2";
	hideonnpc "四騎士ローウェン#301_1";
	hideonnpc "四騎士ローウェン#302_1";
	hideonnpc "四騎士ローウェン#303_1";
	hideonnpc "四騎士ローウェン#303_2";
	hideonnpc "四騎士ミルカ#1001_1";
	hideonnpc "四騎士ミルカ#1002_1";
	hideonnpc "四騎士ミルカ#1003_1";
	hideonnpc "四騎士ミルカ#1004_1";
	hideonnpc "四騎士ミルカ#1005_1";
	hideonnpc "四騎士ミルカ#1006_1";
	hideonnpc "四騎士ミルカ#1007_1";
	hideonnpc "四騎士ミルカ#1007_2";
	hideonnpc "四騎士ミルカ#1007_3";
	hideonnpc "四騎士ミルカ#1008_1";
	hideonnpc "四騎士ミルカ#1009_1";
	hideonnpc "四騎士ミルカ#1010_1";
	hideonnpc "四騎士ミルカ#1010_2";
	hideonnpc "四騎士ミルカ#1011_1";
	hideonnpc "四騎士ミルカ#1012_1";
	hideonnpc "四騎士ミルカ#1012_2";
	hideonnpc "四騎士ミルカ#1013_1";
	hideonnpc "四騎士ミルカ#1013_2";
	hideonnpc "四騎士ミルカ#1013_3";
	hideonnpc "四騎士ミルカ#1014_1";
	hideonnpc "四騎士ミルカ#1014_2";
	hideonnpc "四騎士ミルカ#1014_3";
	hideonnpc "四騎士ミルカ#1014_4";
	hideonnpc "四騎士ミルカ#1014_5";
	hideonnpc "四騎士ミルカ#1015_1";
	hideonnpc "四騎士ミルカ#1016_1";
	hideonnpc "四騎士ミルカ#1017_1";
	hideonnpc "四騎士ミルカ#1018_1";
	hideonnpc "四騎士ミルカ#1019_1";
	hideonnpc "四騎士ミルカ#1020_1";
	hideonnpc "四騎士ミルカ#1021_1";
	hideonnpc "四騎士ミルカ#1022_1";
	hideonnpc "四騎士ミルカ#1023_1";
	hideonnpc "四騎士ミルカ#1024_1";
	hideonnpc "四騎士ミルカ#1025_1";
	hideonnpc "四騎士ミルカ#1026_1";
	hideonnpc "四騎士ミルカ#1027_1";
	hideonnpc "四騎士ミルカ#1028_1";
	hideonnpc "四騎士ミルカ#1029_1";
	hideonnpc "四騎士ミルカ#1030_1";
	hideonnpc "四騎士ミルカ#1031_1";
	hideonnpc "四騎士ミルカ#1032_1";
	hideonnpc "四騎士ミルカ#1032_2";
	hideonnpc "四騎士ミルカ#1032_3";
	hideonnpc "四騎士ミルカ#1032_4";
	hideonnpc "四騎士ミルカ#1032_5";
	hideonnpc "四騎士ミルカ#1033_1";
	hideonnpc "四騎士ミルカ#1034_1";
	hideonnpc "四騎士ミルカ#1035_1";
	hideonnpc "四騎士ミルカ#1036_1";
	hideonnpc "四騎士ミルカ#1037_1";
	hideonnpc "四騎士ミルカ#1038_1";
	hideonnpc "四騎士ミルカ#1039_1";
	hideonnpc "四騎士ミルカ#1040_1";
	hideonnpc "四騎士ハウンド#2001_1";
	hideonnpc "四騎士ハウンド#2002_1";
	hideonnpc "四騎士ハウンド#2003_1";
	hideonnpc "四騎士ハウンド#2004_1";
	hideonnpc "四騎士ハウンド#2005_1";
	hideonnpc "四騎士ハウンド#2006_1";
	hideonnpc "四騎士ハウンド#2007_1";
	hideonnpc "四騎士ハウンド#2008_1";
	hideonnpc "四騎士ハウンド#2009_1";
	hideonnpc "四騎士ハウンド#2010_1";
	hideonnpc "四騎士ハウンド#2011_1";
	hideonnpc "四騎士ハウンド#2011_2";
	hideonnpc "四騎士ハウンド#2012_1";
	hideonnpc "四騎士ハウンド#2013_1";
	hideonnpc "四騎士ハウンド#2013_2";
	hideonnpc "四騎士ハウンド#2013_3";
	hideonnpc "四騎士ハウンド#2014_1";
	hideonnpc "四騎士ハウンド#2015_1";
	hideonnpc "四騎士ハウンド#2016_1";
	hideonnpc "四騎士ハウンド#2017_1";
	hideonnpc "四騎士ハウンド#2018_1";
	hideonnpc "四騎士ハウンド#2019_1";
	hideonnpc "四騎士ハウンド#2020_1";
	hideonnpc "四騎士ハウンド#2021_1";
	hideonnpc "四騎士ハウンド#2022_1";
	hideonnpc "四騎士ハウンド#2023_1";
	hideonnpc "四騎士ハウンド#2024_1";
	hideonnpc "四騎士ハウンド#2025_1";
	hideonnpc "四騎士ハウンド#2026_1";
	hideonnpc "四騎士ハウンド#2027_1";
	hideonnpc "四騎士ハウンド#2028_1";
	hideonnpc "四騎士ハウンド#2029_1";
	hideonnpc "四騎士ハウンド#2030_1";
	hideonnpc "四騎士ハウンド#2031_1";
	hideonnpc "四騎士ハウンド#2032_1";
	hideonnpc "四騎士ハウンド#2033_1";
	hideonnpc "四騎士ハウンド#2034_1";
	hideonnpc "四騎士ハウンド#2035_1";
	hideonnpc "四騎士ハウンド#2036_1";
	hideonnpc "四騎士ハウンド#2037_1";
	hideonnpc "四騎士ハウンド#2038_1";
	hideonnpc "四騎士ハウンド#2039_1";
	hideonnpc "四騎士ハウンド#2040_1";
	hideonnpc "四騎士ハウンド#2040_2";
	hideonnpc "四騎士ハウンド#2041_1";
	hideonnpc "四騎士ハウンド#2042_1";
	hideonnpc "四騎士ハウンド#2043_1";
	hideonnpc "四騎士ハウンド#2044_1";
	hideonnpc "四騎士ハウンド#2045_1";
	hideonnpc "四騎士ハウンド#2046_1";
	hideonnpc "四騎士ハウンド#2047_1";
	hideonnpc "四騎士ハウンド#2047_2";
	hideonnpc "四騎士ハウンド#2047_3";
	hideonnpc "四騎士ハウンド#2047_4";
	hideonnpc "四騎士ハウンド#2047_5";
	hideonnpc "四騎士ハウンド#2048_1";
	hideonnpc "四騎士ハウンド#2049_1";
	hideonnpc "四騎士ハウンド#2050_1";
	hideonnpc "四騎士ハウンド#2051_1";
	hideonnpc "四騎士ハウンド#2052_1";
	hideonnpc "四騎士ハウンド#2053_1";
	hideonnpc "四騎士ハウンド#2054_1";
	hideonnpc "四騎士ハウンド#2055_1";
	hideonnpc "四騎士ローウェン#3001_1";
	hideonnpc "四騎士ローウェン#3002_1";
	hideonnpc "四騎士ローウェン#3003_1";
	hideonnpc "四騎士ローウェン#3004_1";
	hideonnpc "四騎士ローウェン#3005_1";
	hideonnpc "四騎士ローウェン#3006_1";
	hideonnpc "四騎士ローウェン#3007_1";
	hideonnpc "四騎士ローウェン#3008_1";
	hideonnpc "四騎士ローウェン#3008_2";
	hideonnpc "四騎士ローウェン#3008_3";
	hideonnpc "四騎士ローウェン#3008_4";
	hideonnpc "四騎士ローウェン#3009_1";
	hideonnpc "四騎士ローウェン#3009_2";
	hideonnpc "四騎士ローウェン#3010_1";
	hideonnpc "四騎士ローウェン#3011_1";
	hideonnpc "四騎士ローウェン#3011_2";
	hideonnpc "四騎士ローウェン#3011_3";
	hideonnpc "四騎士ローウェン#3011_4";
	hideonnpc "四騎士ローウェン#3012_1";
	hideonnpc "四騎士ローウェン#3013_1";
	hideonnpc "四騎士ローウェン#3014_1";
	hideonnpc "四騎士ローウェン#3014_2";
	hideonnpc "四騎士ローウェン#3014_3";
	hideonnpc "四騎士ローウェン#3014_4";
	hideonnpc "四騎士ローウェン#3014_5";
	hideonnpc "四騎士ローウェン#3014_6";
	hideonnpc "四騎士ローウェン#3014_7";
	hideonnpc "四騎士ローウェン#3014_8";
	hideonnpc "四騎士ローウェン#3014_9";
	hideonnpc "四騎士ローウェン#3014_0";
	hideonnpc "四騎士ローウェン#3015_1";
	hideonnpc "四騎士ローウェン#3016_1";
	hideonnpc "四騎士ローウェン#3017_1";
	hideonnpc "四騎士ローウェン#3018_1";
	hideonnpc "四騎士ローウェン#3019_1";
	hideonnpc "四騎士ローウェン#3020_1";
	hideonnpc "四騎士ローウェン#3021_1";
	hideonnpc "四騎士ローウェン#3022_1";
	hideonnpc "四騎士ローウェン#3023_1";
	hideonnpc "四騎士ローウェン#3024_1";
	hideonnpc "四騎士ローウェン#3025_1";
	hideonnpc "四騎士ローウェン#3026_1";
	hideonnpc "四騎士ローウェン#3027_1";
	hideonnpc "四騎士ローウェン#3028_1";
	hideonnpc "四騎士ローウェン#3029_1";
	hideonnpc "四騎士ローウェン#3030_1";
	hideonnpc "四騎士ローウェン#3031_1";
	hideonnpc "四騎士ローウェン#3031_2";
	hideonnpc "四騎士ローウェン#3032_1";
	hideonnpc "四騎士ローウェン#3033_1";
	hideonnpc "四騎士ローウェン#3034_1";
	hideonnpc "四騎士ローウェン#3035_1";
	hideonnpc "四騎士ローウェン#3036_1";
	hideonnpc "四騎士ローウェン#3037_1";
	
	hideonnpc "王女メア#1_tiamat_04";
	hideonnpc "王女メア#1_tiamat_35";
	hideonnpc "王女メア#2_tiamat_00";
}