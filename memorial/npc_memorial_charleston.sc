1@mcd.gat,127,277,0	script	keepout#1	45,{/* 64596 (hide)*/}
1@mcd.gat,127,277,4	script	チャールストン1号#0	10053,2,2,{/* 64770 */
	viewpoint 1, 23, 275, 1, 0x00FF00; //64770
	cutin "dalle03.bmp", 2;
	mes "[チャールストン1号]";
	mes "ここが……過去の記憶……。";
	next;
	mes "[チャールストン1号]";
	mes "この体は……。";
	mes "少し、思い出してきました。";
	next;
	mes "[チャールストン1号]";
	mes "この時、チャールストン工場は";
	mes "非常警戒宣言が発令されていて、";
	mes "保安装置が作動しています。";
	next;
	mes "[チャールストン1号]";
	mes "左側の通路に";
	mes "作動した保安装置がありますので、";
	mes "破壊しながら次の区画に";
	mes "進んでください。";
	emotion 19, "チャールストン1号#0"; //64770
	next;
	mes "[チャールストン1号]";
	mes "工場区画の北側にある研究室に";
	mes "ヴェ博士が居るはずです！";
	mes "博士に会って";
	mes "詳しい話を聞くことにしましょう！";
	next;
	mes "[チャールストン1号]";
	mes "私が無くした記憶……。";
	mes "必ずすべてを思い出してみせます！";
	mes "それでは、行きましょう！";
	emotion 19, "チャールストン1号#0"; //64770
	hideonnpc "チャールストン1号#0"; //64770
	close2;
	cutin "dalle01.bmp", 255;
	end;
}
1@mcd.gat,86,231,5	script	発電機#1	844,{/* 64789 (hide)*/}

1@mcd.gat,127,262,0	script	mob#1	139,{/* 64800 */
	hideonnpc "mob#1"; //64800
}
1@mcd.gat,67,234,0	script	mob#2	139,{/* 64801 */}
1@mcd.gat,33,192,0	script	mob#3	139,{/* 64802 */}

1@mcd.gat,75,59,0	script	mob#4	139,{/* 64626 */}
1@mcd.gat,109,33,0	script	mob#5	139,{/* 64627 */}
1@mcd.gat,133,49,0	script	mob#6	139,{/* 64628 */}
1@mcd.gat,204,74,0	script	mob#7	139,{/* 64629 */}

1@mcd.gat,157,61,0	script	mob#9	139,{/* 64631 */}

1@mcd.gat,44,211,0	script	1gate#1	45,1,1,{/* 64616 */
	warp "1@mcd.gat",41,200;
	end;
}
1@mcd.gat,23,275,0	script	guide#1	139,{/* 64617 (hide)*/}
1@mcd.gat,41,200,0	script	guide#2	139,{/* 64618 */}
1@mcd.gat,33,59,0	script	guide#3	139,{/* 64619 (hide)*/}
1@mcd.gat,58,72,0	script	2gate#1	45,1,1,{/* 64620 (hide)*/
	warp "1@mcd.gat",65,66;
	end;
}
1@mcd.gat,65,66,0	script	guide#4	139,{/* 64621 */}
1@mcd.gat,239,30,0	script	guide#5	139,{/* 64622 (hide)*/}
1@mcd.gat,104,50,0	script	3gate#1	45,{/* 64623 (hide)*/
	warp "1@mcd.gat",115,50;
	end;
}
1@mcd.gat,117,50,0	script	guide#6	139,{/* 64624 */}
1@mcd.gat,281,183,0	script	guide#7	139,{/* 64625 (hide)*/}

1@mcd.gat,218,211,0	script	4gate#1	45,{/* 64793 (hide)*/}
1@mcd.gat,208,217,0	script	guide#8	139,{/* 64794 */}
1@mcd.gat,211,195,0	script	5gate#1	45,{/* 64795 */}
