prontera.gat,106,78,6	script	眼光鋭い衛士#DeepAbyss0	419,{/* 51168 */
	if(checkquest(121135)) {
		mes "[眼光鋭い衛士]";
		mes "事態はプロンテラの地下";
		mes "「プロンテラ深淵」にて進行している。";
		mes "まずは、プロンテラの北東にある";
		mes "「プロンテラ大聖堂」に";
		mes "向かってもらいたい。";
		next;
		mes "[眼光鋭い衛士]";
		mes "聖堂内に入ったら真っ直ぐ進み";
		mes "^0000FF一番左奥の部屋^000000に入るのだ。";
		next;
		mes "[眼光鋭い衛士]";
		mes "普段は入れない部屋だが";
		mes "その部屋にある";
		mes "^0000FF甲冑の「盾」に手をかざす^000000ことで";
		mes "「プロンテラ深淵」に進める。";
		next;
		mes "[眼光鋭い衛士]";
		mes "「プロンテラ深淵」に到着したら";
		mes "我らのリーダーである";
		mes "「^0000FFシキナ^000000」様に会い";
		mes "詳しい話を聞いて欲しい。";
		next;
		if(select("「大聖堂」に行く","ここに留まる") == 2) {
			mes "[眼光鋭い衛士]";
			mes "承知した。";
			mes "「プロンテラ大聖堂」に向かわれる際は";
			mes "私に声を掛けてくれ。";
			mes "よろしく頼む。";
			close;
		}
		mes "[眼光鋭い衛士]";
		mes "では、プロンテラ大聖堂前に";
		mes "案内しよう。";
		mes "よろしく頼む。";
		close2;
		warp "prontera.gat",232,312;
		end;
	}
	setquest 121040; //state=1
	delquest 121040;
	setquest 121035; //state=1
	delquest 121035;
	mes "[眼光鋭い衛士]";
	mes "……貴殿を凄腕の冒険者と";
	mes "見込んで話がある。";
	mes "今、この世界は滅亡の危機にある。";
	next;
	mes "[眼光鋭い衛士]";
	mes "「呪詛の王」と呼ばれる者が";
	mes "プロンテラ大聖堂の地下から";
	mes "蘇ろうとしているのだ。";
	mes "彼の者が蘇ればこの世は";
	mes "地獄と化すだろう。";
	next;
	mes "[眼光鋭い衛士]";
	mes "我々は、呪詛の王の復活を";
	mes "阻止すべく動いてるが";
	mes "いかんせん人手が足りない。";
	mes "そこで貴殿のような屈強な冒険者に";
	mes "協力を求めることにしたのだ。";
	next;
	mes "[眼光鋭い衛士]";
	mes "世界を救うためには";
	mes "貴殿の力が必要なのだ。";
	mes "どうか、我々に力を貸して欲しい。";
	next;
	if(select("協力を申し出る","考えさせて欲しい") == 2) {
		mes "[眼光鋭い衛士]";
		mes "……そうか。";
		mes "前向きに検討してもらえると助かる。";
		mes "その気になったら";
		mes "また私に声をかけてくれ。";
		mes "よろしく頼む。";
		close;
	}
	setquest 121135; //state=1
	mes "[眼光鋭い衛士]";
	mes "おお……！";
	mes "なんと心強い眼差しか！";
	mes "貴殿の力があれば";
	mes "必ずや呪詛の王の復活を";
	mes "阻止できるに違いない！";
	next;
	mes "[眼光鋭い衛士]";
	mes "……事態はプロンテラの地下";
	mes "「プロンテラ深淵」にて進行している。";
	mes "まずは、プロンテラの北東にある";
	mes "「プロンテラ大聖堂」に";
	mes "向かってもらいたい。";
	next;
	mes "[眼光鋭い衛士]";
	mes "聖堂内に入ったら真っ直ぐ進み";
	mes "^0000FF一番左奥の部屋^000000に入るのだ。";
	next;
	mes "[眼光鋭い衛士]";
	mes "普段は入れない部屋だが";
	mes "その部屋にある";
	mes "^0000FF甲冑の「盾」に手をかざす^000000ことで";
	mes "「プロンテラ深淵」に進める。";
	next;
	mes "[眼光鋭い衛士]";
	mes "「プロンテラ深淵」に到着したら";
	mes "我らのリーダーである";
	mes "「^0000FFシキナ^000000」様に会い";
	mes "詳しい話を聞いて欲しい。";
	next;
	mes "[眼光鋭い衛士]";
	mes "では、プロンテラ大聖堂前に";
	mes "案内しよう。";
	mes "よろしく頼む。";
	close2;
	warp "prontera.gat",232,312;
	end;
}

prt_church.gat,102,61,2	script	物腰柔らかな衛士#DeepAb	418,{/* 51221 */
	mes "[物腰柔らかな衛士]";
	mes "なんと強そうな人間だ……";
	mes "ぜひ貴方のような方に";
	mes "手を貸してもらいたい。";
	mes "今、この聖堂の奥で大変なことが";
	mes "起きようとしているのです。";
	next;
	switch(select("話を聞く","「プロンテラ深淵」について聞く","立ち去る")) {
	case 1:
		mes "[物腰柔らかな衛士]";
		mes "呪詛の王と呼ばれる";
		mes "恐ろしい存在が";
		mes "この大聖堂の地下で";
		mes "蘇ろうとしているのです。";
		next;
		mes "[物腰柔らかな衛士]";
		mes "呪詛の王が蘇れば";
		mes "世界は闇に覆われるでしょう。";
		mes "それを阻止すべく";
		mes "聖堂の地下、「プロンテラ深淵」と";
		mes "呼ばれる場所で";
		mes "同士が活動しております。";
		next;
		mes "[物腰柔らかな衛士]";
		mes "もし手伝っていただけるのであれば";
		mes "聖堂を真っ直ぐ進み";
		mes "一番奥の左手の扉にお入りください。";
		mes "そこが「プロンテラ深淵」への";
		mes "入口となっています。";
		close;
	case 2:
		mes "[物腰柔らかな衛士]";
		mes "「プロンテラ深淵」に";
		mes "向かわれるのであれば";
		mes "聖堂を真っ直ぐ進み";
		mes "一番奥の左手の扉にお入りください。";
		next;
		mes "[物腰柔らかな衛士]";
		mes "そこが「プロンテラ深淵」への";
		mes "入口となっています。";
		close;
	case 3:
		mes "^0000FF‐衛士の前から立ち去った‐^000000";
		close;
	}
}

prt_church.gat,83,122,0	warp	#warpDeepAbyss01	2,2,pab_church.gat,73,79	//51222
pab_church.gat,73,75,0	warp	#warpDeepAbyss02	2,2,prt_church.gat,90,122	//60674
prt_church.gat,73,90,2	script	聖なる甲冑#DeepAbyss01	844,{/* 60640 */
	mes "^0000FF‐古びていて無骨だが";
	mes "　不思議と見入ってしまう鎧だ……";
	mes "　ほんの僅かだが";
	mes "　聖なる力が感じられる‐^000000";
	next;
	if(select("^0000FF盾に手をかざす^000000","やめる") == 2) {
		mes "^0000FF‐地下深くに";
		mes "　吸い込まれてしまいそうな";
		mes "　気がする……";
		mes "　やめておこう‐^000000";
		close;
	}
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "[地下管理人]";
		mes "「プロンテラ深淵」に";
		mes "向かわれるのですか？";
		mes "でしたら、甲冑に近づいて";
		mes "手をかざしてください。";
		mes "そうすれば、聖なる力の恩恵を";
		mes "得られるでしょう。";
		next;
		mes "^0000FF‐甲冑に宿る";
		mes "　聖なる力の恩恵を得るには";
		mes "　甲冑に近づく必要があるようだ‐";
		mes "　";
		mes "　甲冑に近づき";
		mes "　手をかざしてみよう‐^000000";
		close;
	}
	misceffect 6,""; //self
	mes "^0000FF‐盾に手をかざすと";
	mes "　まばゆい光に体が包まれ";
	mes "　やがて身体が浮き上がるような";
	mes "　異質な感覚にとらわれた‐^000000";
	close2;
	warp "pab_camp.gat",41,186;
	end;
OnInit:
	initnpctimer;
	end;
OnTimer5000:
	misceffect 310, "聖なる甲冑#DeepAbyss01"; //60640
	misceffect 367, "聖なる甲冑#DeepAbyss01"; //60640
	misceffect 546, "聖なる甲冑#DeepAbyss01"; //60640
	initnpctimer;
	end;
}
prt_church.gat,75,86,4	script	地下管理人#DeepAbyss01	60,{/* 60641 */
	mes "[地下管理人]";
	mes "この甲冑は";
	mes "この地が開かれるより前、";
	mes "大昔に作られたものだと";
	mes "言われています。";
	next;
	mes "[地下管理人]";
	mes "もし「プロンテラ深淵」に";
	mes "向かわれるのであれば";
	mes "^FF0000甲冑に近づいて^000000";
	mes "手を盾にかざしてください。";
	mes "聖なる力が貴方を導くでしょう。";
	close;
}
prt_church.gat,77,79,4	script	修道士#DeepAbyss01	79,{/* 60642 */
	mes "[修道士]";
	mes "この部屋の一般開放は";
	mes "滅多に行われませんので、";
	mes "この機会にゆっくり見て";
	mes "行ってくださいね。";
	close;
}
pab_church.gat,81,77,2	script	石碑#DeepAbyss01	844,{/* 60643 */}

pab_camp.gat,36,193,6	script	シキナ#DeepAbyss01	859,{/* 60645 */}
pab_camp.gat,41,190,3	script	怨嗟の門#DeepAbyss01	10045,{/* 60646 */
	mes "^0000FF‐全ての装飾が剥ぎ取られた";
	mes "　みすぼらしい門があり";
	mes "　門の隙間からは、この世の全てを";
	mes "　憎悪するかのような";
	mes "　おぞましい怨念がにじみ出ている‐^000000";
	next;
	mes "^0000FF‐門を調べようと近づくと";
	mes "　女性が声を掛けてきた‐^000000";
	next;
	mes "[？？？]";
	mes "興味本位でそこに近づくのは";
	mes "やめておけ。";
	next;
	mes "^0000FF‐何か事情を知っているようだ。";
	mes "　彼女に話を聞いてみよう‐^000000";
	close;
OnInit:
	initnpctimer;
	end;
OnTimer5000:
	misceffect 487, "怨嗟の門#DeepAbyss01"; //60646
	misceffect 589, "怨嗟の門#DeepAbyss01"; //60646
	misceffect 826, "怨嗟の門#DeepAbyss01"; //60646
	initnpctimer;
	end;
}
pab_camp.gat,36,197,0	script	#エフェクトターゲットDe	139,{/* 60647 */}
pab_camp.gat,46,197,0	script	#エフェクトターゲットDe	139,{/* 60648 */}
pab_camp.gat,36,184,0	script	#エフェクトターゲットDe	139,{/* 60649 */}
pab_camp.gat,46,184,0	script	#エフェクトターゲットDe	139,{/* 60650 */}
pab_camp.gat,48,193,4	script	物忠実やかな衛士#DeepAb	413,{/* 60651 */
	mes "[物忠実やかな衛士]";
	mes "お待ちしておりました、冒険者殿！";
	mes "まずはそちらにおられる";
	mes "「^0000FFシキナ^000000」様から";
	mes "お話をお聞きください。";
	close;
}
pab_camp.gat,19,190,6	script	ひたむきな衛士#DeepAbys	417,{/* 60652 */}
pab_camp.gat,40,211,6	script	ひたむきな衛士#DeepAbys	417,{/* 60653 */}
pab_camp.gat,64,189,4	script	ひたむきな衛士#DeepAbys	417,{/* 60654 */
	mes "[ひたむきな衛士]";
	mes "お待ちください、冒険者様！";
	mes "その先は、悪しきモンスターが";
	mes "徘徊する危険な場所です。";
	next;
	mes "[ひたむきな衛士]";
	mes "先に進まれる前にまずは";
	mes "「^0000FFシキナ^000000」様より話を聞き";
	mes "モンスター討伐の依頼を";
	mes "受注できるようになってから";
	mes "お進みください！";
	close;
}
pab_camp.gat,40,168,7	script	ひたむきな衛士#DeepAbys	417,{/* 60655 */}
pab_camp.gat,16,200,6	script	折り目正しい衛士#DeepAb	417,{/* 60656 */
	mes "[折り目正しい衛士]";
	mes "貴方が力を貸してくださる";
	mes "冒険者様ですか？";
	mes "もしそうなのであれば";
	mes "「^0000FFシキナ^000000」様より";
	mes "お話を聞くことができるでしょう。";
	close;
}
pab_camp.gat,62,181,4	script	淡然たる衛士#DeepAbyss0	414,{/* 60657 */
	mes "[淡然たる衛士]";
	mes "貴公が外からきた";
	mes "冒険者とやらか？";
	mes "ふむ……確かに信頼できそうだ。";
	next;
	mes "[淡然たる衛士]";
	mes "詳しい話は「^0000FFシキナ^000000」様から";
	mes "お話いただけるであろう。";
	mes "まずはシキナ様にお会いして欲しい。";
	close;
}

pab_camp.gat,30,205,4	script	補給兵長#DeepAbyss01	415,{/* 60659 */}
pab_camp.gat,56,208,4	script	倉庫管理兵#DeepAbyss01	405,{/* 60660 */}
pab_camp.gat,54,206,4	script	メイン倉庫#DeepAbyss01	464,{/* 60661 */}
pab_camp.gat,56,206,4	script	サブ倉庫1#DeepAbyss01	464,{/* 60662 */}
pab_camp.gat,58,206,4	script	サブ倉庫2#DeepAbyss01	464,{/* 60663 */}
pab_camp.gat,25,181,5	script	書記官#DeepAbyss01	805,{/* 60664 */}
pab_camp.gat,49,198,5	script	アイテム販売員#DeepAbys	68,{/* 60665 */}
pab_camp.gat,50,206,5	script	ルーン原石販売員#DeepAb	853,{/* 60666 */}
pab_camp.gat,46,205,5	script	毒製造キット販売#DeepAb	877,{/* 60667 */}
pab_camp.gat,61,198,4	script	ポイント商人#DeepAbyss0	700,{/* 60668 */}
pab_camp.gat,62,206,4	script	カシン#DeepAbyss01	83,{/* 60669 */}
pab_camp.gat,65,203,4	script	発明家ゼックス#DeepAbys	89,{/* 60670 */}
pab_camp.gat,67,199,4	script	矢筒職人#DeepAbyss01	516,{/* 60671 */}
pab_camp.gat,24,205,5	script	救護班#DeepAbyss01	95,{/* 60672 */}
pab_camp.gat,20,202,5	script	騎乗物管理人#DeepAbyss0	833,{/* 60673 */}
