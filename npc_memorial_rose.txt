1@lab.gat,102,28,0	warp	lab_warp#1	1,1,1@lab.gat,97,28	//61639
1@lab.gat,80,28,0	warp	lab_warp#2	1,1,1@lab.gat,75,28	//61640
1@lab.gat,58,28,0	warp	lab_warp#3	1,1,1@lab.gat,53,28	//61641
1@lab.gat,104,34,4	script	研修研究員#pa0829	865,{/* 61642 */
	if('flag) {
		mes "[研修研究員]";
		mes "既に入り口は開いていますよ。";
		close;
	}
	mes "[研修研究員]";
	mes "研究ナンバー32001の";
	mes "実験補助者として";
	mes "参加する方ですか？";
	next;
	if(select("はい","いいえ") == 2) {
		mes "[研修研究員]";
		mes "実験室を間違えたようですね。";
		mes "インフォメーションに";
		mes "再度問い合わせください。";
		close;
	}
	mes "[研修研究員]";
	mes "立ち入り許可コードの確認をします。";
	mes "少々お待ちください。";
	initnpctimer;
	set 'flag,1;
	close;
OnTimer4000:
	npctalk "研修研究員 : 許可コードの一致を確認。入口を開きます。";
	end;
OnTimer8000:
	npctalk "研修研究員 : どうぞ、お入りください。中からこちらへの移動はできませんので注意してください。";
	hideoffnpc "lab_warp#1"; //61639
	end;
}
1@lab.gat,104,34,4	script	研修研究員#pa0829_2	865,{/* 61643 (hide)*/}

1@lab.gat,37,37,3	script	スイッチ128#	844,{/* 61652 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,39,37,3	script	スイッチ64#	844,{/* 61653 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,41,37,3	script	スイッチ32#	844,{/* 61654 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,43,37,3	script	スイッチ16#	844,{/* 61655 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,46,37,3	script	スイッチ8#	844,{/* 61656 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,48,37,3	script	スイッチ4#	844,{/* 61657 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,50,37,3	script	スイッチ2#	844,{/* 61658 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,52,37,3	script	スイッチ1#	844,{/* 61659 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "現在このスイッチの状態は" +('flag? "ON": "OFF")+ "です。";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをONにしました。";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "スイッチをOFFにしました。";
		set 'flag,0;
		close;
	}
}
1@lab.gat,45,32,3	script	主任研究員#pa0829	865,{/* 61660 */
	mes "[主任研究員]";
	mes "ここまでおいでになったということは";
	mes "^ff0000粒子加速実験^000000の参加者ですね。";
	next;
	mes "[主任研究員]";
	mes "本日の立ち入り許可コードは";
	mes "^0000ff155^000000です。";
	mes "許可コードを2進数に変換して、";
	mes "私の後ろにあるスイッチに";
	mes "入力してください。";
	next;
	mes "[主任研究員]";
	mes "このコードは日替わりです。";
	mes "入力中に日付が変わると、";
	mes "コードも変更されますので";
	mes "ご注意ください。";
	next;
	mes "[主任研究員]";
	mes "スイッチを合わせた後は";
	mes "入り口隣のメインスイッチを";
	mes "押してください。";
	donpcevent "";
	close;
OnStart:
	initnpctimer;
	misceffect 18, "スイッチ128#"; //61652
	misceffect 18, "スイッチ64#"; //61653
	misceffect 18, "スイッチ32#"; //61654
	misceffect 18, "スイッチ16#"; //61655
	misceffect 18, "スイッチ8#"; //61656
	misceffect 18, "スイッチ4#"; //61657
	misceffect 18, "スイッチ2#"; //61658
	misceffect 18, "スイッチ1#"; //61659
	end;
OnTimer5000:
	initnpctimer;
	misceffect 203, "メインスイッチ#"; //61661
	misceffect 204, "スイッチ128#"; //61652
	misceffect 205, "スイッチ64#"; //61653
	misceffect 206, "スイッチ32#"; //61654
	misceffect 207, "スイッチ16#"; //61655
	misceffect 208, "スイッチ8#"; //61656
	misceffect 209, "スイッチ4#"; //61657
	misceffect 210, "スイッチ2#"; //61658
	misceffect 211, "スイッチ1#"; //61659
	end;
}
1@lab.gat,34,37,3	script	メインスイッチ#	844,{/* 61661 */
	initnpctimer;
	end;
	npctalk "本日の立ち入り許可コード[" ++ "]";
	npctalk "入力された2進数変換コード[" ++ "]";
	npctalk "コードの一致を確認できません。正しいコードを入力してください。";
	npctalk "コードの一致を確認しました。入口を開きます。";
}

1@lab.gat,29,38,0	warp	lab_warp#4	1,1,1@lab.gat,29,43	//61664
1@lab.gat,48,82,0	warp	lab_warp#5	1,1,1@lab.gat,58,82	//61665
1@lab.gat,91,80,5	script	#gen_01	844,{/* 61666 (hide)*/}
1@lab.gat,96,81,5	script	#gen_02	844,{/* 61667 (hide)*/}
1@lab.gat,99,85,5	script	#gen_03	844,{/* 61668 (hide)*/}
1@lab.gat,99,91,5	script	#gen_04	844,{/* 61669 (hide)*/}
1@lab.gat,96,95,5	script	#gen_05	844,{/* 61670 (hide)*/}
1@lab.gat,91,97,5	script	#gen_06	844,{/* 61671 (hide)*/}
1@lab.gat,85,96,5	script	#gen_07	844,{/* 61672 (hide)*/}
1@lab.gat,82,91,5	script	#gen_08	844,{/* 61673 (hide)*/}
1@lab.gat,82,86,5	script	#gen_09	844,{/* 61674 (hide)*/}
1@lab.gat,85,81,5	script	#gen_10	844,{/* 61675 (hide)*/}
1@lab.gat,90,97,5	script	#gen_11	844,{/* 61676 (hide)*/}
1@lab.gat,82,89,5	script	#gen_12	844,{/* 61677 (hide)*/}
1@lab.gat,91,80,5	script	#gen_13	844,{/* 61678 (hide)*/}
1@lab.gat,99,88,5	script	#gen_14	844,{/* 61679 (hide)*/}
1@lab.gat,80,87,7	script	Dr.フェデリコ#pa0829	865,{/* 61680 */}
1@lab.gat,81,84,7	script	Dr.シルビア#pa0829	982,{/* 61681 */}
1@lab.gat,80,90,6	script	Dr.アルテミア#pa0829	982,{/* 61682 */}
1@lab.gat,81,93,6	script	Dr.ヴィンセント#pa0829	865,{/* 61683 */}

1@lab.gat,80,89,0	script	#wp01	139,{/* 61688 */}

1@lab.gat,123,88,0	script	lab_warp#end	45,1,1,{/* 61693 (hide)*/
	setquest 118320; //state=1
	warp "verus01.gat",152,150;
	end;
}
