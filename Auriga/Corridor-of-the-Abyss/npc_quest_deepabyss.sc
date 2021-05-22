prontera.gat,111,83,6	script	眼光鋭い衛士#prontera	419,{/* 51218 */
	if(checkquest(123701)) {
		mes "[眼光鋭い衛士]";
		mes "屈強なる冒険者殿。";
		mes "「プロンテラ深淵」に向かわれるのなら";
		mes "案内しよう。";
		mes "遠慮せずに言ってくれ。";
		next;
		if(select("「プロンテラ深淵」に行く","ここに留まる") == 2) {
			mes "[眼光鋭い衛士]";
			mes "承知した。";
			mes "「プロンテラ深淵」に向かわれる際は";
			mes "私に声を掛けてくれ。";
			mes "よろしく頼む。";
			close;
		}
		mes "[眼光鋭い衛士]";
		mes "承知した。";
		mes "では「プロンテラ深淵」へと";
		mes "案内しよう。";
		close2;
		warp "pab_camp.gat",33,190;
		end;
	}
	if(checkquest(123700)) {
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
	setquest 123600;
	compquest 123600;
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
	mes "^0000ff一番左奥の部屋^000000に入るのだ。";
	next;
	mes "[眼光鋭い衛士]";
	mes "普段は入れない部屋だが";
	mes "その部屋にある";
	mes "^0000ff甲冑の「盾」に手をかざす^000000ことで";
	mes "「プロンテラ深淵」に進める。";
	next;
	mes "[眼光鋭い衛士]";
	mes "「プロンテラ深淵」に到着したら";
	mes "我らのリーダーである";
	mes "「^0000ffシキナ^000000」様に会い";
	mes "詳しい話を聞いて欲しい。";
	next;
	mes "[眼光鋭い衛士]";
	mes "では、プロンテラ大聖堂前に";
	mes "案内しよう。";
	mes "よろしく頼む。";
	close2;
	setquest 123700;
	warp "prontera.gat",232,312;
	end;
OnInit:
	waitingroom "深淵の回廊へ",0; //51218
	//setnpcgroup 1015;
	//setnpctitle "[イベント案内]";
	end;
}

prt_church.gat,102,61,2	script	物腰柔らかな衛士#pab_ch	418,{/* 51220 */
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
OnInit:
	waitingroom "深淵の回廊へ",0; //51220
	end;
}

prt_church.gat,83,122,0	warp	#warp_prt_church	3,3,pab_church.gat,73,79	//51219
pab_church.gat,73,75,0	warp	#warp_pab_church	3,3,prt_church.gat,90,122	//60674

prt_church.gat,83,122,4	script	waitingroom#pab_church	844,{/* 51221 */
	end;
OnInit:
	waitingroom "深淵の回廊へ",0; //51221
	end;
}

pab_church.gat,73,90,2	script	聖なる甲冑#prt_church	844,{/* 51149 */
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
	//setnpcgroup 1015;
	//setnpctitle "[プロンテラ深淵の入口]";
	end;
OnTimer5000:
	misceffect 310, "聖なる甲冑#DeepAbyss01"; //60640
	misceffect 367, "聖なる甲冑#DeepAbyss01"; //60640
	misceffect 546, "聖なる甲冑#DeepAbyss01"; //60640
	initnpctimer;
	end;
}

pab_church.gat,75,86,4	script	地下管理人#prt_church	60,{/* 51150 */
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

pab_church.gat,77,79,4	script	修道士#prt_church	79,{/* 51151 */
	mes "[修道士]";
	mes "この部屋の一般開放は";
	mes "滅多に行われませんので、";
	mes "この機会にゆっくり見て";
	mes "行ってくださいね。";
	close;
}

pab_church.gat,81,77,2	script	石碑#prt_church	844,{/* 51152 */
	mes "^0000FF‐石碑に刻まれた文字は";
	mes "　かすれており、";
	mes "　読むことができない‐^000000";
	close;
//OnInit:
//	setnpcgroup 1015;
//	end;
}

pab_camp.gat,36,193,6	script	シキナ#pab_camp	859,{/* 51177 */
	if(checkquest(123700)) {
		mes "[？？？？]";
		mes "そなたは……冒険者か？";
		mes "我々の仲間の話を聞いて";
		mes "来てくれたのだな。";
		mes "まずはここに来てくれたこと";
		mes "感謝する。";
		next;
		mes "[シキナ]";
		mes "私の名は「^0000ffシキナ^000000」と言う。";
		mes "そなたの名は……";
		mes "^0000ff" +strcharinfo(0)+ "^000000……か。";
		mes "良い……名だな。";
		mes "そなたに相応しい名だ。";
		next;
		mes "[シキナ]";
		mes "……妙だな。";
		mes "そなたとは初対面のはずなのに";
		mes "その名前に聞き覚えがある。";
		mes "もしかして、そなたと私は";
		mes "すでに知った間柄なのではないか？";
		next;
		if(select("以前、会ったことがある","初対面です") == 1) {
			mes "[シキナ]";
			mes "……やはり、か。";
			mes "「因果の輪」と呼ばれる";
			mes "時間が循環する呪いにより";
			mes "この地は外の世界とは";
			mes "時間の進み方が異なっているのだ。";
			next;
			mes "[シキナ]";
			mes "それゆえ、そなたの経験した時間と";
			mes "私の経験した時間との間に";
			mes "齟齬が発生しているのだろう。";
			mes "なんとも難儀なことだ。";
			next;
			mes "[シキナ]";
			mes "「因果の輪」による影響を";
			mes "考慮した上で話を進めたいのだが……";
			mes "そなたが私を知っているということは";
			mes "今、ここで何が起きているのか。";
			next;
			mes "[シキナ]";
			mes "そして、世界の破滅を回避するために";
			mes "何をすべきなのか……。";
			mes "心得ていると考えて良いのだな？";
			mes "^0000ff‐「心得ている」を選択すると";
			mes "　初回説明とメモリアルダンジョンでの";
			mes "　ボスの登場演出をスキップできます‐^000000";
			next;
			if(select("^0000ff心得ている^000000","改めて話を聞きたい") == 1) {
				setquest 123625; //state=1
				delquest 123625;
				setquest 123626; //state=1
				delquest 123626;
				setquest 123627; //state=1
				delquest 123627;
				setquest 123628; //state=1
				delquest 123628;
				setquest 123629; //state=1
				delquest 123629;
				setquest 123630; //state=1
				delquest 123630;
				setquest 122958; //state=1
				delquest 122958;
				setquest 122959; //state=1
				delquest 122959;
				mes "[シキナ]";
				mes "それは好都合。";
				mes "では本題に入ろう。";
				next;
				mes "[シキナ]";
				mes "そなたには「モンスター討伐」を";
				mes "お願いしたい。";
				mes "この地に巣食うモンスターは";
				mes "いずれも呪いの力を宿している。";
				mes "それらを討伐することが";
				mes "呪詛の王の復活阻止に繋がるのだ。";
				next;
				mes "[シキナ]";
				mes "東西南北の四つの地域で";
				mes "依頼の対象モンスターを";
				mes "既定数倒して来てもらいたい。";
				next;
				delquest 123700;
				setquest 123701; //state=1
				setquest 97720; //state=1
				setquest 97721; //state=1
				setquest 97722; //state=1
				setquest 97723; //state=1
				mes "[シキナ]";
				mes "説明は以上だ。";
				mes "準備が済み次第、";
				mes "モンスター討伐に向かってくれ。";
				mes "この地に巣食うモンスターは";
				mes "いずれも手強いが……";
				mes "よろしく頼む。";
				close;
			}
		}
		mes "[シキナ]";
		mes "……そうか。";
		mes "私の勘違いだったようだな。";
		mes "すまない、気にしないでくれ。";
		next;
		mes "[シキナ]";
		mes "「因果の輪」と呼ばれる";
		mes "時間が循環する呪いにより";
		mes "この地は外の世界とは";
		mes "時間の進み方が異なっているのでな。";
		mes "念のため、確認させてもらった。";
		next;
		mes "[シキナ]";
		mes "早速で申し訳ないが";
		mes "現在起きている事態について";
		mes "説明させてもらおう。";
		mes "なにせ急を要する事態なのだ。";
		next;
		mes "[シキナ]";
		mes "まず、この地に関して説明しよう。";
		mes "便宜上この地は";
		mes "「^0000ffプロンテラ深淵^000000」と呼ばれている。";
		mes "便宜上と言うのは、ここは正確には";
		mes "プロンテラの地下では無いからだ。";
		next;
		mes "[シキナ]";
		mes "ここはそなたの住む世界とは";
		mes "別の次元に存在している。";
		mes "それが偶然、プロンテラの地下と";
		mes "繋がっていると思ってくれ。";
		next;
		mes "[シキナ]";
		mes "この地が異次元にある理由は";
		mes "この地が「封印」されているからに";
		mes "他ならない。";
		next;
		mes "[シキナ]";
		mes "「封印」と言えば聞こえは良いが";
		mes "「呪われて」いると言った方が";
		mes "真実に近い。";
		mes "この地は、世界から拒絶された";
		mes "「呪われたモノ」だけが";
		mes "存在を許された場所だからな。";
		next;
		mes "[シキナ]";
		mes "……本題に入ろう。";
		mes "この地には「^ff0000呪詛（とこい）の王^000000」が";
		mes "封印されている。";
		mes "古の時代に、神の如き力を振るい";
		mes "世界を支配しようとした存在だ。";
		next;
		mes "[シキナ]";
		mes "だが呪詛の王の暴政に";
		mes "反旗を翻した者たちの";
		mes "長きに渡る戦の末";
		mes "呪詛の王は打ち倒され";
		mes "彼の時代は終わりを迎えた。";
		next;
		mes "[シキナ]";
		mes "だが、話はそこで終わりではない。";
		mes "呪詛の王の巨大すぎた力は";
		mes "戦が終わった後も人々の間に";
		mes "恐怖の記憶となって残り続けた。";
		next;
		mes "[シキナ]";
		mes "新たな時代を迎えてなお";
		mes "人々の心に影を落とし続ける";
		mes "王の存在に対し人々は";
		mes "王の存在した痕跡を";
		mes "徹底的に破壊することにしたのだ。";
		next;
		mes "[シキナ]";
		mes "呪詛の王に関する";
		mes "ありとあらゆるもの……";
		mes "遺物、書物、宮殿、そして";
		mes "その名すらも破壊の対象となった。";
		next;
		mes "[シキナ]";
		mes "物理的な破壊は言うに及ばず";
		mes "呪術……";
		mes "すなわち「呪い」による破壊も含めた";
		mes "「封印」により";
		mes "ようやく人々の中から";
		mes "呪詛の王という存在は消えたのだ。";
		next;
		mes "[シキナ]";
		mes "そなたたちの世界に";
		mes "呪詛の王に関する記録が";
		mes "いっさい残っていないのは";
		mes "そのような理由のためだ。";
		next;
		mes "[シキナ]";
		mes "……だが今、その名すら呪われ";
		mes "「呪詛の王」としか呼べないモノが";
		mes "封印を破り、蘇ろうとしている！";
		next;
		mes "[シキナ]";
		mes "呪詛の王は、自らを封印している";
		mes "「呪いの力」をあえて受け入れることで";
		mes "復活の力に変えている。";
		mes "……呪いの力を受け入れるなど";
		mes "おぞましいことだ……。";
		next;
		mes "[シキナ]";
		mes "もし、呪詛の王が蘇り";
		mes "現世への帰還を果たせば";
		mes "その暴威によって";
		mes "世界は地獄と化すだろう。";
		mes "そんな事態はなんとしても";
		mes "避けなければならない。";
		next;
		mes "[シキナ]";
		mes "我々が成すべきことは";
		mes "この地に満ちる「呪いの力」を";
		mes "少しでも弱めることだ。";
		mes "復活に必要となる力の源を断てば";
		mes "王の復活を阻止できるはず。";
		next;
		mes "[シキナ]";
		mes "そなたには「モンスター討伐」を";
		mes "お願いしたい。";
		mes "この地に巣食うモンスターは";
		mes "いずれも呪いの力を宿している。";
		mes "それらを討伐することが";
		mes "呪詛の王の復活阻止に繋がるのだ。";
		next;
		mes "[シキナ]";
		mes "東西南北の四つの地域で";
		mes "依頼の対象モンスターを";
		mes "既定数倒して来てもらいたい。";
		next;
		delquest 123700;
		setquest 123701;
		setquest 97720;
		setquest 97721;
		setquest 97722;
		setquest 97723;
		mes "[シキナ]";
		mes "説明は以上だ。";
		mes "準備が済み次第、";
		mes "モンスター討伐に向かってくれ。";
		mes "この地に巣食うモンスターは";
		mes "いずれも手強いが……";
		mes "よろしく頼む。";
		close;
	}
	if(checkquest(123701)) {
		if(checkquest(97720)&4 == 0 || checkquest(97721)&4 == 0 || checkquest(97722)&4 == 0 || checkquest(97723)&4 == 0) {
			mes "[シキナ]";
			mes "……まだ完了していないようだ。";
			mes "引き続き、依頼達成のために";
			mes "頑張ってくれ。";
			close;
		}
		mes "[シキナ]";
		mes "無事討伐できたのだな。見事だ。";
		mes "そなたのおかげで";
		mes "呪いの力を弱めることができた。";
		mes "しかし、王の復活を阻止するには";
		mes "モンスターを討伐するだけでは";
		mes "十分ではない。";
		next;
		mes "[シキナ]";
		mes "実は呪詛の王の臣下である";
		mes "「^ff0000四怨将^000000」が";
		mes "王の復活のために行動している。";
		next;
		mes "[シキナ]";
		mes "すでに目撃しているかもしれないが";
		mes "四怨将は呪詛の王を復活させるため";
		mes "積極的に呪いの力を集めている。";
		mes "モンスターをいくら討伐しても";
		mes "彼らを放っておいては";
		mes "元も子もないというわけだ。";
		next;
		mes "[シキナ]";
		mes "そこで、そなたには";
		mes "四怨将の様子を探ってもらいたい。";
		mes "そなたの実力ならば";
		mes "それができるはずだ。";
		next;
		delquest 123701;
		setquest 123702; //state=1
		delquest 97720;
		delquest 97721;
		delquest 97722;
		delquest 97723;
	}
	if(checkquest(123702)) {
		if(checkquest(123703) && checkquest(123704) && checkquest(123705) && checkquest(123706)) {
			mes "[シキナ]";
			mes "危険な調査、大儀であった。";
			mes "四怨将の本体は";
			mes "別の場所にいるのだな。";
			next;
			mes "[シキナ]";
			mes "その場所には当てがある。";
			mes "恐らく「^0000ff呪詛の王^000000」が眠る";
			mes "「^0000ff深淵の王墓^000000」だろう。";
			next;
			mes "[シキナ]";
			mes "ここまで力を貸してくれた";
			mes "そなたには、本当に感謝している。";
			mes "だが……願わくば……。";
			next;
			mes "[シキナ]";
			mes "……いや。";
			mes "回りくどい言い方は、やめよう。";
			mes "全てに決着をつけるため";
			mes "そなたに呪詛の王とその配下を";
			mes "討ってもらいたい！";
			next;
			mes "[シキナ]";
			mes "そこに見える「怨嗟の門」の先に";
			mes "呪詛の王が封印されている。";
			mes "門をくぐり、呪詛の王を倒すのだ。";
			mes "呪いの力の薄まった今こそ";
			mes "あの強大な王を葬る千載一遇の時！";
			next;
			mes "[シキナ]";
			mes "……だが、生きている時ですら";
			mes "神の如きと恐れられた力が";
			mes "呪いをその身に宿すことで";
			mes "どれほどのものになっているか";
			mes "想像もつかない……。";
			next;
			mes "[シキナ]";
			mes "我らでは成し遂げられないことを";
			mes "他人に頼るなど";
			mes "甚だ身勝手なのは百も承知。";
			mes "だが願わくば……";
			mes "王を……。";
			next;
			mes "[シキナ]";
			mes "「^0000ffグローザ^000000」様に……";
			mes "安寧をもたらして欲しい……。";
			next;
			mes "[シキナ]";
			mes "……そなたに";
			mes "怨嗟の門を開けるための鍵を託す。";
			mes "これがあれば、^0000ff1日に1度だけ";
			mes "門を開けることができる。^000000";
			next;
			mes "[シキナ]";
			mes "準備を十分に整えてから";
			mes "「怨嗟の門」を調べて";
			mes "門を開けるのが良いだろう。";
			next;
			delquest 123702;
			setquest 123707; //state=1
			delquest 123703;
			delquest 123704;
			delquest 123705;
			delquest 123706;
			mes "^0000ff‐「怨嗟の門」の鍵を託された。";
			mes "　呪詛の王との決着をつけるため";
			mes "　「深淵の王墓」に向かおう‐^000000";
			close;
		}
		mes "[シキナ]";
		mes "四怨将は東西南北にある";
		mes "恨みの淵にいるとの報告があった。";
		mes "その側までは私が送ろう。";
		mes "　";
		mes "準備は良いか？";
		if(!checkquest(123703))
			set '@str1$,"庭園へ向かう";
		if(!checkquest(123704))
			set '@str2$,"祭祀場へ向かう";
		if(!checkquest(123705))
			set '@str3$,"回廊へ向かう";
		if(!checkquest(123706))
			set '@str4$,"旧市街地へ向かう";
		next;
		switch(select("やめる",'@str1$,'@str2$,'@str3$,'@str4$)) {
		case 1:
			mes "[シキナ]";
			mes "必要になったら";
			mes "私に声を掛けてくれ。";
			mes "よろしく頼む。";
			close;
		case 2:
			mes "[シキナ]";
			mes "承知した。";
			mes "では、よろしく頼む。";
			close2;
			warp "pab_dun01.gat",78,52;
			end;
		case 3:
			mes "[シキナ]";
			mes "承知した。";
			mes "では、よろしく頼む。";
			close2;
			warp "pab_dun02.gat",124,96;
			end;
		case 4:
			mes "[シキナ]";
			mes "承知した。";
			mes "では、よろしく頼む。";
			close2;
			warp "pab_dun03.gat",118,107;
			end;
		case 5:
			mes "[シキナ]";
			mes "承知した。";
			mes "では、よろしく頼む。";
			close2;
			warp "pab_dun04.gat",93,122;
			end;
		}
	}
	if(checkquest(123707)) {
		mes "[シキナ]";
		mes "そこに見える「怨嗟の門」の先に";
		mes "呪詛の王が封印されている。";
		mes "門をくぐり、呪詛の王を倒すのだ。";
		mes "そなただけが頼りだ。";
		mes "よろしく頼む。";
		close;
	}
//OnInit:
//	setnpcgroup 1011;
//	setnpctitle "[クエスト受付]";
//	end;
}
pab_dun01.gat,77,58,0	script	spiral#pab_dun01	139,15,15,{/* 1955 */
	cloakoffnpc "衛士#pab_dun01"; //1956
	cloakoffnpc "恨みの淵#pab_dun01"; //1957
	end;
}
pab_dun01.gat,75,60,4	script	衛士#pab_dun01	419,9,9,{/* 1956 (cloaking)*/
	mes "[衛士]";
	mes "「恨みの淵」は";
	mes "呪いの力によって次元が歪んでいます。";
	mes "次元の先に進めば";
	mes "過去の世界へ行くことも可能でしょう。";
	close;
OnTouch:
	unittalk "衛士 : 冒険者様、恨みの淵の入り口はこちらです。";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun01.gat,77,58,4	script	恨みの淵#pab_dun01	723,2,2,{/* 1957 (cloaking)*/
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	if(select("恨みの淵に飛び込む","立ち去る") == 2) {
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnTouch:
	warp "pab_dun01q.gat",77,50;
	end;
OnInit:
	cloakonnpc;
	//[クエスト専用転送]
	end;
}

pab_dun01q.gat,77,58,4	script	恨みの淵#pab_dun01q	723,2,2,{/* 1197 (cloaking)*/
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	switch(select("シキナの元に帰る","恨みの淵に飛び込む","立ち去る")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun01.gat",77,50;
		end;
	case 3:
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun01q.gat,77,58,4	script	？？？？#pab_dun01q	10045,3,3,{/* 1198 */
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "^0000ff‐不思議な力が感じられる。";
		mes "　もっと近くで覗き込んでみよう‐^000000";
		close;
	}
	misceffect 546, "四怨将ジオイア#pab_dun0"; //1199
	misceffect 135, "四怨将ジオイア#pab_dun0"; //1199
	cloakoffnpc "四怨将ジオイア#pab_dun0"; //1199
	misceffect 546, "呪詛の王#pab_dun01q"; //1200
	misceffect 135, "呪詛の王#pab_dun01q"; //1200
	cloakoffnpc "呪詛の王#pab_dun01q"; //1200
	unittalk getnpcid(0,"四怨将ジオイア#pab_dun0"),"四怨将ジオイア : ゴメイレイヲ……マスター……";
	unittalk getnpcid(0,"呪詛の王#pab_dun01q"),"呪詛の王 : 余の忠実なる僕……ジオイア……汝に命令を与える……";
	unittalk getnpcid(0,"呪詛の王#pab_dun01q"),"呪詛の王 : 余はこの世界の全てが憎い……よって、この世のありとあらゆるモノを破壊することに決めた……";
	unittalk getnpcid(0,"呪詛の王#pab_dun01q"),"呪詛の王 : 汝の目に映る全てのモノを破壊せよ。実行期間は……未来永劫だ。";
	unittalk getnpcid(0,"呪詛の王#pab_dun01q"),"呪詛の王 : そして、この命令は他のいかなる命令よりも優先する。この命令が余の与える最後の命令となろう。";
	unittalk getnpcid(0,"呪詛の王#pab_dun01q"),"呪詛の王 : 行け……この世界を地獄に変えてこい………！";
	unittalk getnpcid(0,"四怨将ジオイア#pab_dun0"),"四怨将ジオイア : リョウカイ　シマシタ……コレヨリ……メイレイヲ　ジッコウシマス……";
	unittalk getnpcid(0,"四怨将ジオイア#pab_dun0"),"四怨将ジオイア : モクヒョウ……ホソク……コレヨリ……ハカイヲ　カイシスル………";
	misceffect 546, "四怨将ジオイア#pab_dun0"; //1199
	misceffect 135, "四怨将ジオイア#pab_dun0"; //1199
	cloakonnpc "四怨将ジオイア#pab_dun0"; //1199
	misceffect 546, "呪詛の王#pab_dun01q"; //1200
	misceffect 135, "呪詛の王#pab_dun01q"; //1200
	cloakonnpc "呪詛の王#pab_dun01q"; //1200
	setquest 123703; //state=1
	mes "^0000ff‐四怨将と王の残留思念が消えてしまった";
	mes "　本体は別の場所にいるようだ";
	mes "　他の恨みの淵を調査しよう‐^000000";
	cloakoffnpc "恨みの淵#pab_dun01q"; //1197
	cloakonnpc "？？？？#pab_dun01q"; //1198
	close;
//1009
//[クエスト進行]
}
pab_dun01q.gat,74,61,4	script	四怨将ジオイア#pab_dun0	10276,{/* 1199 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun01q.gat,79,61,4	script	呪詛の王#pab_dun01q	10172,{/* 1200 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun02.gat,119,101,0	script	spiral#pab_dun02	139,15,15,{/* 1952 */
	cloakoffnpc "衛士#pab_dun02"; //1953
	cloakoffnpc "恨みの淵#pab_dun02"; //1954
	end;
}
pab_dun02.gat,117,103,4	script	衛士#pab_dun02	419,9,9,{/* 1953 (cloaking)*/
	mes "[衛士]";
	mes "「恨みの淵」は";
	mes "呪いの力によって次元が歪んでいます。";
	mes "次元の先に進めば";
	mes "過去の世界へ行くことも可能でしょう。";
	close;
OnTouch:
	unittalk "衛士 : 冒険者様、恨みの淵の入り口はこちらです。";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun02.gat,119,101,4	script	恨みの淵#pab_dun02	723,2,2,{/* 1954 (cloaking)*/
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	if(select("恨みの淵に飛び込む","立ち去る") == 2) {
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnTouch:
	warp "pab_dun02q.gat",119,93;
	end;
OnInit:
	cloakonnpc;
	//[クエスト専用転送]
	end;
}
pab_dun02q.gat,119,101,4	script	恨みの淵#pab_dun02q	723,2,2,{/* 1193 (cloaking)*/
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	switch(select("シキナの元に帰る","恨みの淵に飛び込む","立ち去る")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun02.gat",119,93;
		end;
	case 3:
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun02q.gat,119,101,4	script	？？？？#pab_dun02q	10045,3,3,{/* 1194 */
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "^0000ff‐不思議な力が感じられる。";
		mes "　もっと近くで覗き込んでみよう‐^000000";
		close;
	}
	misceffect 546, "四怨将カデス#pab_dun02q"; //1195
	misceffect 135, "四怨将カデス#pab_dun02q"; //1195
	cloakoffnpc "四怨将カデス#pab_dun02q"; //1195
	misceffect 546, "呪詛の王#pab_dun02q"; //1196
	misceffect 135, "呪詛の王#pab_dun02q"; //1196
	cloakoffnpc "呪詛の王#pab_dun02q"; //1196
	unittalk getnpcid(0,"四怨将カデス#pab_dun02q"),"四怨将カデス : 王よ……どうかもうしばらくお待ちください……呪いの力が……まだ十分ではありません。";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : 余の聡明なる師よ……いつまで待てば……余のこの怒りを……";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : この憤怒を……世界に示せるのだ……！";
	unittalk getnpcid(0,"四怨将カデス#pab_dun02q"),"四怨将カデス : 今しばしの辛抱です。我ら四怨将がすぐにでも呪いの力を集め、封印を解除いたしましょう。";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : 早く……早くするのだ……さもなければ……おぉぉ……この力を抑えきれぬ……！";
	unittalk getnpcid(0,"四怨将カデス#pab_dun02q"),"四怨将カデス : 承知しました、我が王よ。邪魔者を排除し……すぐに解き放って差し上げましょう。";
	misceffect 546, "四怨将カデス#pab_dun02q"; //1195
	misceffect 135, "四怨将カデス#pab_dun02q"; //1195
	cloakonnpc "四怨将カデス#pab_dun02q"; //1195
	misceffect 546, "呪詛の王#pab_dun02q"; //1196
	misceffect 135, "呪詛の王#pab_dun02q"; //1196
	cloakonnpc "呪詛の王#pab_dun02q"; //1196
	setquest 123704; //state=1
	mes "^0000ff‐四怨将と王の残留思念が消えてしまった";
	mes "　本体は別の場所にいるようだ";
	mes "　他の恨みの淵を調査しよう‐^000000";
	cloakoffnpc "恨みの淵#pab_dun02q"; //1193
	cloakonnpc "？？？？#pab_dun02q"; //1194
	close;
}
pab_dun02q.gat,116,103,4	script	四怨将カデス#pab_dun02q	10277,{/* 1195 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun02q.gat,122,103,4	script	呪詛の王#pab_dun02q	10172,{/* 1196 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun03.gat,118,111,0	script	spiral#pab_dun03	139,15,15,{/* 886 */
	cloakoffnpc "衛士#pab_dun03"; //887
	cloakoffnpc "恨みの淵#pab_dun03"; //888
	end;
}
pab_dun03.gat,115,113,4	script	衛士#pab_dun03	419,9,9,{/* 887 */
	mes "[衛士]";
	mes "「恨みの淵」は";
	mes "呪いの力によって次元が歪んでいます。";
	mes "次元の先に進めば";
	mes "過去の世界へ行くことも可能でしょう。";
	close;
OnTouch:
	unittalk "衛士 : 冒険者様、恨みの淵の入り口はこちらです。";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun03.gat,118,111,4	script	恨みの淵#pab_dun03	723,2,2,{/* 888 */
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	if(select("恨みの淵に飛び込む","立ち去る") == 2) {
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnTouch:
	warp "pab_dun03q.gat",118,103;
	end;
OnInit:
	cloakonnpc;
	//[クエスト専用転送]
	end;
}
pab_dun03q.gat,118,111,4	script	恨みの淵#pab_dun03q	723,2,2,{/* 1189 (cloaking)*/
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	switch(select("シキナの元に帰る","恨みの淵に飛び込む","立ち去る")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun03.gat",118,103;
		end;
	case 3:
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun03q.gat,118,111,4	script	？？？？#pab_dun03q	10045,3,3,{/* 1190 */
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "^0000ff‐不思議な力が感じられる。";
		mes "　もっと近くで覗き込んでみよう‐^000000";
		close;
	}
	misceffect 546, "四怨将デヒョン#pab_dun0"; //1191
	misceffect 135, "四怨将デヒョン#pab_dun0"; //1191
	cloakoffnpc "四怨将デヒョン#pab_dun0"; //1191
	misceffect 546, "呪詛の王#pab_dun03q"; //1192
	misceffect 135, "呪詛の王#pab_dun03q"; //1192
	cloakoffnpc "呪詛の王#pab_dun03q"; //1192
	unittalk getnpcid(0,"四怨将カデス#pab_dun02q"),"四怨将デヒョン : 我が王よ……我が剣に誓い、王に仇なす者を屠って参りましょう……";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : 余の鋭利なる刀剣……デヒョンよ……余の敵は……この世界全てだ……";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : 忘れたわけではあるまい……この世のありとあらゆるモノが余に楯突いたのだ……";
	unittalk getnpcid(0,"四怨将カデス#pab_dun02q"),"四怨将デヒョン : ならばこのデヒョン……王の剣と成り、この世界の全てを斬り刻んで参りましょう。";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : 行け……汝の剣でこの世界に……恐怖を刻んでこい……！";
	unittalk getnpcid(0,"四怨将カデス#pab_dun02q"),"四怨将デヒョン : 御意……！";
	misceffect 546, "四怨将デヒョン#pab_dun0"; //1191
	misceffect 135, "四怨将デヒョン#pab_dun0"; //1191
	cloakonnpc "四怨将デヒョン#pab_dun0"; //1191
	misceffect 546, "呪詛の王#pab_dun03q"; //1192
	misceffect 135, "呪詛の王#pab_dun03q"; //1192
	cloakonnpc "呪詛の王#pab_dun03q"; //1192
	setquest 123705; //state=1
	mes "^0000ff‐四怨将と王の残留思念が消えてしまった";
	mes "　本体は別の場所にいるようだ";
	mes "　他の恨みの淵を調査しよう‐^000000";
	cloakoffnpc "恨みの淵#pab_dun03q"; //1189
	cloakonnpc "？？？？#pab_dun03q"; //1190
	close;
}
pab_dun03q.gat,115,113,4	script	四怨将デヒョン#pab_dun0	10278,{/* 1191 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun03q.gat,121,113,4	script	呪詛の王#pab_dun03q	10172,{/* 1192 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun04.gat,93,127,0	script	spiral#pab_dun04	139,15,15,{/* 883 */
	cloakoffnpc "衛士#pab_dun04"; //884
	cloakoffnpc "恨みの淵#pab_dun04"; //885
	end;
}
pab_dun04.gat,90,129,4	script	衛士#pab_dun04	419,9,9,{/* 884 (cloaking)*/
	mes "[衛士]";
	mes "「恨みの淵」は";
	mes "呪いの力によって次元が歪んでいます。";
	mes "次元の先に進めば";
	mes "過去の世界へ行くことも可能でしょう。";
	close;
OnTouch:
	unittalk "衛士 : 冒険者様、恨みの淵の入り口はこちらです。";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun04.gat,93,127,4	script	恨みの淵#pab_dun04	723,2,2,{/* 885 (cloaking)*/
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	if(select("恨みの淵に飛び込む","立ち去る") == 2) {
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnTouch:
	warp "pab_dun04q.gat",93,119;
	end;
OnInit:
	cloakonnpc;
	//[クエスト専用転送]
	end;
}
pab_dun04q.gat,93,127,4	script	恨みの淵#pab_dun04q	723,2,2,{/* 1185 (cloaking)*/
	mes "^0000ff‐次元が揺らいでいる。";
	mes "　飛び込めば、別次元に";
	mes "　行くことができるようだ‐^000000";
	next;
	switch(select("シキナの元に帰る","恨みの淵に飛び込む","立ち去る")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun04.gat",93,119;
		end;
	case 3:
		mes "^0000ff‐その場から立ち去った‐^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun04q.gat,93,127,4	script	？？？？#pab_dun04q	10045,3,3,{/* 1186 */
	misceffect 546, "四怨将ヒュリエル#pab_du"; //1187
	misceffect 135, "四怨将ヒュリエル#pab_du"; //1187
	cloakoffnpc "四怨将ヒュリエル#pab_du"; //1187
	misceffect 546, "呪詛の王#pab_dun04q"; //1188
	misceffect 135, "呪詛の王#pab_dun04q"; //1188
	cloakoffnpc "呪詛の王#pab_dun04q"; //1188
	unittalk getnpcid(0,"四怨将ヒュリエル#pab_du"),"四怨将ヒュリエル : まぁ……みっともないお姿になったものねぇ……王様……。";
	unittalk getnpcid(0,"四怨将ヒュリエル#pab_du"),"四怨将ヒュリエル : 今のあんたは……もうただの化け物よ……あははは！";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : 化け物だと……おおぉぉ……それこそ余の本望……全てを失った余に相応しい賛辞ぞ……";
	unittalk getnpcid(0,"四怨将ヒュリエル#pab_du"),"四怨将ヒュリエル : ふんっ……皮肉も通じなくなるなんて……だけどまあ、悪くないわぁ……";
	unittalk getnpcid(0,"四怨将ヒュリエル#pab_du"),"四怨将ヒュリエル : あんたと一緒なら……このくだらない世界も、少しは楽しめそうだしねぇ……！";
	unittalk getnpcid(0,"呪詛の王#pab_dun02q"),"呪詛の王 : 余の愚かなる道化師よ……行け……余を楽しませてみせろ……";
	unittalk getnpcid(0,"四怨将ヒュリエル#pab_du"),"四怨将ヒュリエル : 私は好きなようにやるだけよ……あんたの出番なんか作ってあげないわ！　あ～はははは！";
	misceffect 546, "四怨将ヒュリエル#pab_du"; //1187
	misceffect 135, "四怨将ヒュリエル#pab_du"; //1187
	cloakonnpc "四怨将ヒュリエル#pab_du"; //1187
	misceffect 546, "呪詛の王#pab_dun04q"; //1188
	misceffect 135, "呪詛の王#pab_dun04q"; //1188
	cloakonnpc "呪詛の王#pab_dun04q"; //1188
	setquest 123706; //state=1
	mes "^0000ff‐全ての恨みの淵の";
	mes "　調査が完了した。";
	mes "　戻ってシキナに報告しよう‐^000000";
	cloakoffnpc "恨みの淵#pab_dun04q"; //1185
	cloakonnpc "？？？？#pab_dun04q"; //1186
	close;
}
pab_dun04q.gat,90,129,4	script	四怨将ヒュリエル#pab_du	10279,{/* 1187 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun04q.gat,96,129,4	script	呪詛の王#pab_dun04q	10172,{/* 1188 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
