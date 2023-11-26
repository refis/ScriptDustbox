1@iwp.gat,0,0,0	script	FirstPatrolControl1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;

	hideonnpc getmdnpcname("上等兵モルラン#set01");
	hideonnpc getmdnpcname("新兵ボリラ#set01");
	hideonnpc getmdnpcname("二等兵ロルル#set01");
	hideonnpc getmdnpcname("一等兵ホリリュ#set01");
	hideonnpc getmdnpcname("上等兵モルリュ#set02");
	hideonnpc getmdnpcname("新兵ポロロン#set02");
	hideonnpc getmdnpcname("二等兵トラリ#set02");
	hideonnpc getmdnpcname("一等兵ポララン#set02");
	hideonnpc getmdnpcname("謎の青年#dlunch");
	hideonnpc getmdnpcname("cp_4");
	hideonnpc getmdnpcname("cp_5");
	hideonnpc getmdnpcname("パトロール隊長#ediwp");
	donpcevent getmdnpcname("パトロール隊長#stiwp")+ "::OnStart";
	end;
}

1@iwp.gat,375,229,4	script	パトロール隊長#stiwp	21518,{/* 54584 */
	mes "[パトロール隊長]";
	mes "君は初めてのパトロールだったな？";
	mes "軽く説明することにしよう。";
	next;
	mes "[パトロール隊長]";
	mes "我が頼もしい";
	mes "イーグルパトロール隊員たちと散歩……";
	mes "うぉっほん！";
	mes "パトロールをしてくればいい。";
	next;
	mes "[パトロール隊長]";
	mes "プロフェッショナルなパトロールは";
	mes "我が隊員たちが行うが";
	mes "目がたくさんある方が安全だからな。";
	next;
	mes "[パトロール隊長]";
	mes "では出発！";
	donpcevent getmdnpcname("FirstPatrolControl2")+ "::OnStart";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 54584
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}

1@iwp.gat,1,1,0	script	FirstPatrolControl2	-1,{
OnStart:
	if(.walk_st == 0) {
		set .walk_st,1;
		initnpctimer;
		unittalk getnpcid(0,"上等兵ポルリョ#set03"),"ポルリョ: … … … … …";	// 55622
		unittalk getnpcid(0,"一等兵ソルル#set03"),"ソルル: ハハ…パトロールに行って参ります、隊長殿";	// 55713
		unittalk getnpcid(0,"パトロール隊長#stiwp"),"パトロール隊長 : パトロールが終わるぐらいに迎えに来るとにしよう。";	// 54584
	}
	end;
OnStop:
	stopnpctimer;
	if(.walk_st == 1) {
		set .walk_st,2;
		hideoffnpc getmdnpcname("謎の青年#dlunch");	// 54746
		hideoffnpc getmdnpcname("cp_4");	// 54681
	}
	end;
}

1@iwp.gat,370,224,0	script	上等兵モルラン#set01	21517,{/* 54920 (hide)*/}
1@iwp.gat,370,227,0	script	新兵ボリラ#set01	21514,{/* 54931 (hide)*/}
1@iwp.gat,370,230,0	script	二等兵ロルル#set01	21515,{/* 55260 (hide)*/}
1@iwp.gat,370,233,0	script	一等兵ホリリュ#set01	21516,{/* 55280 (hide)*/}

1@iwp.gat,370,224,0	script	上等兵モルリュ#set02	21517,{/* 55378 (hide)*/}
1@iwp.gat,370,227,0	script	新兵ポロロン#set02	21514,{/* 55453 (hide)*/}
1@iwp.gat,370,230,0	script	二等兵トラリ#set02	21515,{/* 55531 (hide)*/}
1@iwp.gat,370,233,0	script	一等兵ポララン#set02	21516,{/* 55577 (hide)*/}

1@iwp.gat,370,224,0	script2	上等兵ポルリョ#set03	21517,{/* 55622 */
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}

1@iwp.gat,370,227,0	script2	新兵ホルルン#set03	21514,{/* 55650 */
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}

1@iwp.gat,370,230,0	script2	二等兵トラロン#set03	21515,{/* 55696 */
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}

1@iwp.gat,370,233,0	script2	一等兵ソルル#set03	21516,{/* 55713 */
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}

1@iwp.gat,244,359,0	script	cp_4	139,10,10,{/* 54681 (hide)*/
	announce "‐北東の隅になにかいるようだ……！‐", 0x9, 0x99cc00;
	unittalk getcharid(3),strcharinfo(0)+" : ポルリョ、北東の隅っこに何かいるようだけど？",1;
	if(!sleep2(400)) end;
	unittalk getnpcid(0,getmdnpcname("上等兵ポルリョ#set03")),"ポルリョ: …？………？";	// 55622
	unittalk getnpcid(0,getmdnpcname("一等兵ソルル#set03")),"ソルル: ポルリョ上等兵殿は見なかったようですが、どうしても気になるなら直接確認したらいかがですか？";	// 55713
	viewpoint 0, 260, 390, 1, 0x00FF00;	// 54681
	end;
}

1@iwp.gat,244,359,0	script	cp_5	139,10,10,{/* 54691 (hide)*/
	if(.walk_st == 2) {
		donpcevent getmdnpcname("FirstPatrolControl3")+ "::OnStart";
	}
	end;
}

1@iwp.gat,1,1,0	script	FirstPatrolControl3	-1,{
OnStart:
	if(.walk_st == 2) {
		set .walk_st,3;
		initnpctimer;
	}
	end;
OnStop:
	stopnpctimer;
	if(.walk_st == 3) {
		set .walk_st,4;
	}
	end;
}

1@iwp.gat,260,390,4	script	謎の青年#dlunch	10453,{/* 54746 */
	cutin "ep19_lunch01.png", 2;
	mes "[謎の青年]";
	mes "うええぇ！";
	mes "私を捕まえに来たのですか!?";
	next;
	menu "そんなつもりはないですよ？",-;
	mes "[謎の青年]";
	mes "よかったぁ！";
	mes "ここまで逃げてくるのに";
	mes "苦労したんですよ！";
	next;
	menu "そんな寒そうな恰好で逃げてきたの？",-;
	mes "[謎の青年]";
	mes "寒そう？";
	mes "寒い……寒い……。";
	next;
	mes "[謎の青年]";
	mes "あ！　冷却状態のことですね。";
	mes "それなら大丈夫です。";
	mes "この程度の気温であっても";
	mes "活動できるように制作されたんです。";
	next;
	menu "制作された？",-;
	cutin "ep19_lunch02.png", 2;
	mes "[謎の青年]";
	mes "私はイルシオンの実験体なんです。";
	mes "科学者が偶然に作りだした実験体を";
	mes "改良に改良を重ねたのが私です。";
	next;
	mes "[謎の青年]";
	mes "その実験体に比べて";
	mes "210426倍ぐらい優れた存在です！";
	next;
	menu "どうしてここにいるの？",-;
	cutin "ep19_lunch01.png", 2;
	mes "[謎の青年]";
	mes "お！　鋭い質問ですね。";
	mes "ここにいる理由ですが";
	mes "それは私にもよく分かりません。";
	next;
	mes "[謎の青年]";
	mes "科学者たちが他の実験に";
	mes "夢中になっている隙に";
	mes "逃げ出したもので。";
	next;
	mes "[謎の青年]";
	mes "しかし、あそこの鳥類が";
	mes "パトロールしているので";
	mes "ここも安全ではなさそうです。";
	next;
	mes "[謎の青年]";
	mes "「平原」の方が安全そうなので";
	mes "私は平原へ向かいます。";
	mes "あなたとお話しできてよかったです。";
	mes "機会があれば、また会いましょう！";
	next;
	mes "‐青年はそう言うと去っていった。";
	mes "　凍て付いた鱗の平原に行くようだ。";
	mes "　イルシオンについて";
	mes "　何か知っているかもしれない。";
	mes "　時間ができたら訪ねてみよう‐";
	close2;
	cutin "ep19_lunch01.png", 255;
	stopnpctimer;
	hideonnpc;	// 54746
	hideonnpc getmdnpcname("cp_4");	// 54681
	hideoffnpc getmdnpcname("cp_5");	// 54691
	hideoffnpc getmdnpcname("パトロール隊長#ediwp");	// 54768
	announce "上等兵ポルリョ#set03 : そろそろ出発するぞ。", 0x9, 0x99cc00;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 54746
	end;
OnInit:
	setnpctitle "<HU-210426>";	// NPC:謎の青年#dlunch(54746)
	end;
}

1@iwp.gat,301,315,6	script	パトロール隊長#ediwp	21518,{/* 54768 */
	if(.walk_st < 4) {
		mes "[パトロール隊長]";
		mes "ご苦労様。";
		mes "隊員たちがパトロールを終えるまで";
		mes "少し待っていただけるかな？";
		close;
	}
	if(EP19_1QUE == 13) {
		delquest 130470;
		setquest 5983;	// state=1	showevent 0, 1, #to_jor_back1;	// 2457: 17, 123 showevent 0, 1, #to_jor_back2;	// 2458: 226, 387 showevent 0, 1, 謎の青年#flunch;	// 2541: 250, 30
		set EP19_1QUE,14;
	}
	mes "[パトロール隊長]";
	mes "パトロール、ご苦労様。";
	mes "アーウィンと冒険者の絆が";
	mes "これで深まったことだろう！";
	next;
	mes "[パトロール隊長]";
	mes "さて、氷の城へ戻るつもりなら";
	mes "私が連れて行ってあげようか？";
	next;
	if(select("氷の城へ戻りたいです","まだ用事が残っている") == 2) {
		mes "[パトロール隊長]";
		mes "では、ここで解散だ！";
		mes "また会おう！";
		close;
	}
	mes "[パトロール隊長]";
	mes "では氷の城へ行こう！";
	close2;
	warp "icecastle.gat", 20, 123;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 54768
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
