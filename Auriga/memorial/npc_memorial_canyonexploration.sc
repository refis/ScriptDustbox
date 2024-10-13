//==============================================================================
// Canyon Exploration Memorial Dungeon Script
//==============================================================================
1@20cn1.gat,91,80,5	script	レハール#ep20MD_re01_09	10469,5,5,{
	if(.scene == 0) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "峡谷に到着しましたね。";
		mes "では、お互い別々の監視場所に";
		mes "移動しましょう。";
		mes "ここから3時の方向にある装置が";
		mes strcharinfo(0)+"様の担当です。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "古代アイスウィンドや";
		mes "ルガンに見つからないよう";
		mes "お互い慎重に行動しましょう！";
		emotion 21;
		next;
		cutin "ep19_lehar02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "……よし。";
		mes "担当している監視場所に向かおう。";
		mes "慎重に、用心深く……。";
		viewpoint 1, 171, 105, 1, 0xFF0000;
		initnpctimer getmdnpcname("見知らぬアーウィン#ep20_01");
		set .scene,1;
		close;
	}
	if(.scene == 1) {
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "ここから3時の方向にある装置が";
		mes strcharinfo(0)+"様の担当です。";
		mes "お互い慎重に行動しましょう！";
		viewpoint 1, 171, 105, 1, 0xFF0000;
		close2;
		cutin "ep19_lehar02.png", 255;
		end;
	}
	end;
OnTouch:
	if(.scene == 0)
		unittalk "レハール : こっちです、冒険者様！";
	end;
}

1@20cn1.gat,171,105,5	script(HIDDEN)	見知らぬアーウィン#ep20_01	21976,9,9,{
	mes "[見知らぬアーウィン]";
	mes "そこにいるのは誰だ！";
	mes "隠れようとしても無駄だぞ！";
	mes "全部、見えているからな！";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "……あれ？";
	mes "アーウィン？";
	mes "ここの装置を見張る担当だろうか？";
	next;
	mes "[見知らぬアーウィン]";
	mes "担当？　そりゃ担当ではあるけれど……";
	mes "ああっ！　お前は!?";
	next;
	mes "[他の見知らぬアーウィン]";
	mes "氷の城で見かけた……！";
	mes "い、いや……ふむ！";
	mes "ここには、どのような御用で？";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "連絡の行き違いだろうか？";
	mes "ここを監視するのは";
	mes "私の役目だと思ってたけど";
	mes "おふたりが担当しておられるのですね？";
	mes "でも……見たことのない顔のような??";
	next;
	emotion 23,getmdnpcname("見知らぬアーウィン#ep20_01");
	emotion 23,getmdnpcname("見知らぬアーウィン#ep20_02");
	mes "[見知らぬアーウィン]";
	mes "ビクッ！";
	next;
	mes "[他の見知らぬアーウィン]";
	mes "そ、それはですねぇぇぇ！";
	mes "私たちは兵士になって";
	mes "まだ間も無いんですよぉぉ！";
	next;
	emotion 4,getmdnpcname("見知らぬアーウィン#ep20_01");
	mes "[見知らぬアーウィン]";
	mes "そうです！　そうです！";
	mes "兵士になるのは～私たちの夢でした～。";
	mes "兵士になって～みんなを守る～！";
	next;
	emotion 4,getmdnpcname("見知らぬアーウィン#ep20_02");
	mes "[他の見知らぬアーウィン]";
	mes "そうです、そうなんです！";
	mes "私たちの顔を人間の方たちは";
	mes "上手く区別できないみたいですし～～！";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "（……ちょっと怪しいけど";
	mes "　アーウィンだし……気のせいだろう）";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "お勤めご苦労様です。";
	mes "では、一緒にこの付近を";
	mes "見回りましょうか？";
	next;
	mes "[見知らぬアーウィンたち]";
	mes "それは良いですねぇ！";
	mes "どうぞ先頭に立ってください！";
	mes "私達は後ろからついていきますから！";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "……うん？";
	next;
	misceffect 962,"";
	mes "[見知らぬアーウィンたち]";
	mes "背中を見せたぞ！";
	mes "いまだ！　かかれっ!!";
	close2;
	stopnpctimer;
	initnpctimer getmdnpcname("レハール#ep20MD_re02_09");
	warp getmdmapname("1@20cn2.gat"), 271, 138;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "見知らぬアーウィン : 誰だ！";
	unittalk getnpcid(0,getmdnpcname("見知らぬアーウィン#ep20_02")),"見知らぬアーウィン : そこ、止まれ!!";
	end;
}

1@20cn1.gat,173,103,3	script(HIDDEN)	見知らぬアーウィン#ep20_02	21978,{
	emotion 19;
	mes "[見知らぬアーウィン]";
	mes "こ、ここは私たちの担当だけど？";
	mes "あ……お前は……!?";
	close;
}

1@20cn2.gat,271,134,3	script	レハール#ep20MD_re02_09	10469,2,2,{
	if(.scene == 1) {
		mes "["+strcharinfo(0)+"]";
		mes "……。";
		next;
		emotion 9,"";
		mes "["+strcharinfo(0)+"]";
		mes "…………。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "………………。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "………てください……！";
		next;
		mes "[レハール]";
		mes "起きてください！";
		mes strcharinfo(0)+"様!!";
		next;
		cutin "ep19_lehar01.png", 255;
		emotion 16,"";
		mes "["+strcharinfo(0)+"]";
		mes "う……後頭部がズキズキする……。";
		mes "まさかと思うけど……";
		mes "あのアーウィンたちに攻撃されて!?";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "あ、もしかして……";
		mes "レハールさんも同じ目に!?";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "そのまさか、です。";
		mes "油断しているところをやられました。";
		mes "目が覚めたら、この檻の中です。";
		mes "アーウィンの中に裏切者がいるなんて！";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "私も油断していました……";
		mes "しかし、まずはここから";
		mes "脱出する方法を探さないと……。";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "その通りです。";
		mes "とにかく方法を探さないと！";
		next;
		cutin "ep19_lehar05.png", 2;
		announce "バゴット : ……以前提案した件、お考えいただけましたか？", 0x9, 0xffff99;
		mes "[レハール]";
		mes "……外から何か聞こえますよ。";
		mes "何を話しているんだ？";
		next;
		cutin "ep19_lehar01.png", 255;
		announce "バゴット : 残っているヨルムンガンドの身体で「復活」を試した場合……", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : 残存する魔力まで消えてしまう、と説明しましたでしょう？", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "？？？ : その話か……耳にタコができるほど聞いた。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "？？？ : すでに空っぽの身体だから、と言っていたな？", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : そう、その通り！　投資効率が非常に悪い！", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "？？？ : だが、貴様の言う方法は無謀ではないか？", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "？？？ : 私自らが、件の魔力を直接使用するとは。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : そのとおり！　そして自ら神になられるのです！", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : そうなれば、結界を破ってイスガルドから出られましょう！", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : ミッドガルド大陸に新たな神として降臨し……", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : 大陸を……世界を支配する！", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "？？？ : …………。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "？？？ : ……人の気を引く術を心得ているとはな。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : 貴方にとって価値のある提案をしたまでですよ。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "？？？ : ……貴様の案に乗ってやろう。滞りなく研究を進めろ。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : この上ない慈悲と恩恵に、深く感謝いたします。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "バゴット : ラスガンド様に栄光があらんことを！", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "ラスガンド : ……私を落胆させるなよ。", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		emotion 9;
		announce "バゴット : ……行きましたか？", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "あっ！　";
		mes "ここに入って来るみたいです！";
		next;
		hideoffnpc getmdnpcname("バゴット#ep20MD_re01_09");
		cutin "ep18_bagot_02.png", 2;
		emotion 20,getmdnpcname("バゴット#ep20MD_re01_09");
		mes "[バゴット]";
		mes "本当は神の力が喉から手が出るほど";
		mes "欲しいくせにっ！";
		mes "見え見えなんですよぉ～！";
		mes "はぁ～～～！　気位の高いだけの蛇がぁ！";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "ふ……ふふふ！";
		mes "でも、その対価として";
		mes "バゴットの欲しいものを得られたから";
		mes "今回は我慢してあげますよぉ～～！";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "バゴットは「神」を創造する";
		mes "超越者になるっ……！";
		mes "真に奇跡を起こしてみせるのです！";
		next;
		emotion 9;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "うわぁ！";
		mes "さっきと言動が違い過ぎるっ!!";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "あ～～～？";
		mes "起きていましたかぁ？";
		mes "喜びなさい、皆さんはこれから～";
		mes "私の実験の材料になってもらいまーす！";
		mes "簡単に言うと～生贄ぇ？";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "い、生贄だって!?";
		mes "勝手なこと言って!!";
		mes "ここから出せ！";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "はぁ？";
		mes "そんなことするわけないでしょ～？";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "いままでさんざん";
		mes "バゴットの邪魔をしたんだからなぁ～。";
		mes "その罪滅ぼしとしてぇ～";
		mes "バゴットの役に立ってもらわないとぉ！";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "こっちが大人しくしていると思うのか？";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "むしろ素直に喜ぶべきでは～？";
		mes "神を創造するための";
		mes "捨て石になれるんですからぁ！";
		mes "ほ～～ら、光栄でしょ～～？";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "うっ……ダメだ……";
		mes "全然話が通じない……。";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "大人しく待ってなさ～～い。";
		mes "暴れても無駄ぁ無駄ぁ～。";
		mes "まな板の上のコイなんだからぁ～！";
		close2;
		unittalk "レハール : ううっ……行っちゃいましたね。";
		cutin "ep18_bagot_03.png", 255;
		hideonnpc getmdnpcname("バゴット#ep20MD_re01_09");
		set .scene,2;
		end;
	}
	if(.scene == 2) {
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "はぁ……どうしましょう。";
		mes "急いでここから出る方法を探さないと。";
		next;
		misceffect 901;
		mes "[レハール]";
		mes "えいやぁっ！";
		mes "はぁぁーーっ!!";
		mes "はぁっ！　はぁっ!!";
		mes "ぐぅ……錠を壊すのは無理か……";
		mes "本当に……硬いっ!!";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "落ち着いてください。";
		mes "錠を壊せなくても手はあるはずです。";
		mes "誰かが食事を持ってくる際の";
		mes "隙を狙うとか……。";
		next;
		hideoffnpc getmdnpcname("猫#ep20MD_re01_09");
		cutin "ep20_nyar02.png", 1;
		mes "[白い猫]";
		mes "……。";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[レハール]";
		mes "そんな隙があれば良いですけど……";
		mes "食事が来る前に";
		mes "実験台にされるかもしれません。";
		mes "その前になんとか……。";
		next;
		cutin "ep20_nyar03.png", 1;
		emotion 33,getmdnpcname("猫#ep20MD_re01_09");
		mes "[白い猫]";
		mes "……。";
		next;
		cutin "ep19_lehar05.png", 2;
		emotion 23;
		mes "[レハール]";
		mes "うわぁぁぁ～～～っ！";
		mes "い、今、何かがっ！";
		mes "私の足にまとわりついて!!";
		mes "なんだか凄く……もっふもふ!?!?";
		next;
		cutin "ep19_lehar04.png", 255;
		menu "これってなんだ？",-,"ね、猫？",-;
		cutin "ep20_nyar02.png", 1;
		mes "[白い猫]";
		mes "ニャーオ。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "猫っぽいですし";
		mes "にゃお、と鳴いてますけど！";
		mes "猫ってこんなに胴が長かったですか!?";
		mes "それにどこから入って来たんだろう??";
		next;
		cutin "ep20_nyar01.png", 1;
		mes "[白い猫]";
		mes "ミャウン。";
		close2;
		cutin "ep20_nyar01.png", 255;
		stopnpctimer;
		emotion 0,getmdnpcname("猫#ep20MD_re01_1_09");
		npcwalkto 269,136,getmdnpcname("猫#ep20MD_re01_09");
		npcwalkwait;
		hideonnpc getmdnpcname("猫#ep20MD_re01_09");
		hideoffnpc getmdnpcname("猫#ep20MD_re01_1_09");
		initnpctimer getmdnpcname("猫#ep20MD_re01_1_09");
		unittalk getnpcid(0,getmdnpcname("猫#ep20MD_re01_1_09")),"猫 : ヤンニャン。";
		set .scene,3;
		end;
	}
	if(.scene == 3) {
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "どうしましょう。";
		mes "なんとか出られる方法を探さないと。";
		close2;
		cutin "ep19_lehar04.png", 255;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "レハール : 冒険者様！ 冒険者様!!";
	end;
}

1@20cn2.gat,264,135,5	script(HIDDEN)	バゴット#ep20MD_re01_09	10386,{
	unittalk "バゴット : ふふっ。";
	end;
}

1@20cn2.gat,273,136,3	script2(HIDDEN)	猫#ep20MD_re01_09	22006,{
	unittalk "猫 : ウエオッ。";
	end;
OnInit:
	setnpcspeed 150;
	end;
}

1@20cn2.gat,269,136,3	script(HIDDEN)	猫#ep20MD_re01_1_09	22006,{
	if(.scene == 3) {
		cutin "ep20_nyar01.png", 1;
		mes "[白い猫]";
		mes "ムミャ。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "うわっ！";
		mes "歩くと更に長くなったみたいな!?";
		mes "うん？　扉の方に行くみたいです。";
		next;
		cutin "ep19_lehar03.png", 255;
		menu "変な鳴き声……",-;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "え？　猫は本来そうじゃないですか？";
		mes "……あれ？";
		mes "ああ、あああ！";
		mes strcharinfo(0)+"様、見てください！";
		next;
		cutin "ep19_lehar01.png", 255;
		misceffect 1044,getmdnpcname("猫#ep20MD_re01_1_09");
		mes "‐猫がひっかくたびに";
		mes "　頑強な錠前がボロボロ崩れていく‐";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "こんなことがあり得るの!?";
		mes "猫、どうやってこんなことが出来るの？";
		mes "ちょっと説明してくれない??";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "うわっ、錠前が完全に壊れちゃってる！";
		mes "すごいすごいっ!!";
		next;
		cutin "ep20_nyar05.png", 1;
		mes "‐付いて来いとでも言うように";
		mes "　その猫は尻尾を振りながら";
		mes "　檻の外に出ていった‐";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "檻から出られますよ！";
		mes "何が起きたのかわかりませんが";
		mes "あの猫について行きましょう！";
		close2;
		cutin "ep19_lehar03.png", 255;
		stopnpctimer;
		initnpctimer getmdnpcname("レハール#ep20MD_re03_09");
		warp getmdmapname("1@20cn2.gat"), 59, 257;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,62,258,3	script	レハール#ep20MD_re03_09	10469,9,9,{
	cutin "ep20_nyar02.png", 1;
	mes "[白い猫]";
	mes "ウェッオオン。";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "ここで止まれ、と";
	mes "言っているのでしょうか？";
	mes "何か警戒しているような……";
	mes "あ、向こうにバゴットが見えます！";
	mes "隠れましょう！";
	next;
	cutin "ep18_bagot_01.png", 2;
	mes "[バゴット]";
	mes "……計画は順調ですよ";
	mes "ラスガンド様。";
	mes "残る問題は「あの場所」だけで……。";
	next;
	cutin "ep18_bagot_01.png", 255;
	emotion 1,"";
	menu "あの場所？",-;
	cutin "ep19_lehar03.png", 2;
	mes "[レハール]";
	mes "向こうにいるのが……";
	mes "ラスガンド……！";
	next;
	cutin "ep20_lasgand01.png", 1;
	mes "[ラスガンド]";
	mes "急いで計画を進めろ。";
	mes "……ようやく見つけた手がかりだ。";
	mes "いつまでもこんなところで";
	mes "ぐずぐずしているつもりはない。";
	next;
	cutin "ep18_bagot_03.png", 2;
	mes "[バゴット]";
	mes "……「あの場所」の存在に";
	mes "気付いただけでも";
	mes "大きな進展だと思いますが？";
	next;
	cutin "ep20_nyar05.png", 1;
	mes "‐白い猫がおろおろした様子で";
	mes "　その場でクルクル回っている‐";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "どうしたの、猫？";
	mes "何かに反応している？";
	next;
	cutin "ep20_nyar04.png", 1;
	mes "[白い猫]";
	mes "エオン……。";
	next;
	cutin "ep20_lasgand01.png", 1;
	mes "[ラスガンド]";
	mes "……あの場所に入るための";
	mes "方法を見つけろ。";
	next;
	cutin "ep18_bagot_03.png", 2;
	mes "[バゴット]";
	mes "もちろん承知しております。";
	mes "では、ラスガンド様";
	mes "次の日程ですが……。";
	next;
	cutin "ep19_lehar05.png", 2;
	hideonnpc getmdnpcname("ラスガンド#ep20MD_re02_09");
	hideonnpc getmdnpcname("バゴット#ep20MD_re02_09");
	mes "[レハール]";
	mes "……行ったようです。";
	next;
	cutin "ep20_nyar02.png", 1;
	mes "[白い猫]";
	mes "ニャアアン。";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "あ、猫がまた歩き始めました！";
	mes "この猫について行けば";
	mes "良いんでしょうか？";
	next;
	cutin "ep20_nyar01.png", 1;
	mes "[白い猫]";
	mes "ウンニャン！";
	next;
	cutin "ep19_lehar02.png", 2;
	mes "[レハール]";
	mes "おやおや！";
	mes "こちらの言っていることが";
	mes "わかっているみたいな反応です！";
	mes "じゃあ、道案内をお願いね。";
	close2;
	cutin "ep19_lehar01.png", 255;
	stopnpctimer;
	initnpctimer getmdnpcname("レハール#ep20MD_re04_09");
	hideonnpc getmdnpcname("レハール#ep20MD_re03_09");
	hideonnpc getmdnpcname("猫#ep20MD_re02_09");
	hideoffnpc getmdnpcname("レハール#ep20MD_re04_09");
	hideoffnpc getmdnpcname("猫#ep20MD_re03_09");
	hideoffnpc getmdnpcname("アーウィン#ep20MD_re01_09");
	hideoffnpc getmdnpcname("ルガン#ep20MD_re01_09");
	hideoffnpc getmdnpcname("ルガン#ep20MD_re02_09");
	hideoffnpc getmdnpcname("ルガン#ep20MD_re03_09");
	hideoffnpc getmdnpcname("ルガン#ep20MD_re04_09");
	viewpoint 1, 64, 224, 1, 0xFF0000;
	end;
OnTouch:
	unittalk "レハール : こっちです！";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,69,266,3	script	ラスガンド#ep20MD_re02_09	22007,{
	unittalk "ラスガンド : ……状況を報告しろ。";
	end;
}

1@20cn2.gat,71,264,1	script	バゴット#ep20MD_re02_09	10386,{
	unittalk "バゴット : ……あの場所に関してですが……。";
	end;
}

1@20cn2.gat,63,257,3	script	猫#ep20MD_re02_09	22006,{
	cutin "ep20_nyar03.png", 1;
	mes "[白い猫]";
	mes "ヴェオォン。";
	close2;
	cutin "ep20_nyar01.png", 255;
	end;
}

1@20cn2.gat,64,224,3	script(HIDDEN)	レハール#ep20MD_re04_09	10469,2,2,{
	cutin "ep20_nyar03.png", 1;
	mes "[白い猫]";
	mes "ウンミャンミャ！";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "うん？　猫がまた止まりましたね。";
	mes "うわ、ルガンたちが集まっています。";
	mes "これ以上進むのは危険です。";
	next;
	cutin "ep19_lehar04.png", 2;
	mes "[レハール]";
	mes "あっ!!　あのルガンたちが";
	mes "取り囲んでいるのって……!!";
	next;
	cutin "ep19_lehar02.png", 255;
	menu "アーウィンです",-;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "まさか、ルガンに捕まって!?";
	mes "はやく助けないと！";
	next;
	cutin "ep20_nyar02.png", 1;
	mes "[白い猫]";
	mes "ウッニャン、ミャン。";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "ちょ……裾を引っ張らないで！";
	mes "……もしかして、落ち着けってこと？";
	mes "確かに、無策で突っ込むのは";
	mes "得策ではないのでしょうが……。";
	next;
	cutin "ep19_lehar04.png", 2;
	mes "[レハール]";
	mes "仕方ない……様子を伺いましょう。";
	mes "どこかに隙があるはず。";
	next;
	cutin "ep19_lehar04.png", 255;
	mes "[ルガン]";
	mes "あの忌々しい人間風情めが！";
	mes "俺たちに面倒ごとを";
	mes "押し付けやがって！";
	next;
	mes "[ルガン]";
	mes "仕方ない。";
	mes "偉大なるラスガンド様に従うように";
	mes "あの人間にも従えと";
	mes "ラスガンド様が仰られたのだ。";
	next;
	mes "[アーウィン]";
	mes "しかし、なんだこの姿は？";
	mes "不細工なだけでなく";
	mes "歩きにくくてたまらん。";
	mes "このデカイ体、どうやって動かすんだ？";
	next;
	cutin "ep19_lehar03.png", 2;
	mes "[レハール]";
	mes "あの捕まっているアーウィンさん";
	mes "なんだか様子が変ですよ？";
	next;
	cutin "ep19_lehar04.png", 255;
	mes "[ルガン]";
	mes "俺も気に入らないが……";
	mes "アイツらも私たちに姿を変えて";
	mes "好き勝手やってくれたじゃないか。";
	mes "今度は、こちらがやり返す番だ！";
	next;
	hideonnpc getmdnpcname("ルガン#ep20MD_re04_09");
	hideoffnpc getmdnpcname("ルガン#ep20MD_re04_1_09");
	mes "[ルガン]";
	mes "本当に小賢しい奴らだ！";
	mes "だが、奴らの正体を見破る術はある！";
	mes "もう同じ手は通じないってわけだ。";
	mes "キッキキ!!";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "……!?!?";
	next;
	mes "[レハール]";
	mes "ルガンがアーウィンになりました！";
	mes "まさか、私達がルガンに化けたみたいに";
	mes "ルガンもアーウィンに化ける方法を";
	mes "見つけたんでしょうか!?";
	next;
	mes "[レハール]";
	mes "しかも、私達の正体を見破る術も";
	mes "あるって言ってますよ!!";
	mes "うわぁ、大変だ！";
	mes "このことを早くみんなに伝えないと！";
	next;
	cutin "ep19_lehar03.png", 2;
	mes "[レハール]";
	mes "すぐにここから脱出したいのに……";
	mes "うう、思うようにいかないので";
	mes "イライラします。";
	close2;
	cutin "ep19_lehar04.png", 255;
	stopnpctimer;
	initnpctimer getmdnpcname("猫#ep20MD_re04_09");
	hideonnpc getmdnpcname("レハール#ep20MD_re04_09");
	hideonnpc getmdnpcname("猫#ep20MD_re03_09");
	hideonnpc getmdnpcname("アーウィン#ep20MD_re01_09");
	hideonnpc getmdnpcname("ルガン#ep20MD_re01_09");
	hideonnpc getmdnpcname("ルガン#ep20MD_re02_09");
	hideonnpc getmdnpcname("ルガン#ep20MD_re03_09");
	hideonnpc getmdnpcname("ルガン#ep20MD_re04_1_09");
	warp getmdmapname("1@20cn2.gat"), 110, 66;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "レハール : 猫がまた止まりましたね。";
	end;
}

1@20cn2.gat,63,227,3	script(HIDDEN)	猫#ep20MD_re03_09	22006,{
	unittalk "猫 : ミニャア。";
	end;
}

1@20cn2.gat,57,223,3	script(HIDDEN)	ルガン#ep20MD_re01_09	10475,{
	unittalk "ルガン : あぁ……働きたくない。帰って横になりたい。";
	end;
}

1@20cn2.gat,54,222,5	script(HIDDEN)	アーウィン#ep20MD_re01_09	21978,{
	unittalk "アーウィン : ケホケホ！　羽根が口に入ったみたい。";
	end;
}

1@20cn2.gat,52,221,7	script(HIDDEN)	ルガン#ep20MD_re04_09	10475,{
	unittalk "ルガン : ……よくそんな体で動けるな？";
	end;
}

1@20cn2.gat,57,220,1	script(HIDDEN)	ルガン#ep20MD_re02_09	10473,{
	unittalk "ルガン : ケホケホ！　無暗に羽根を飛ばすんじゃない！";
	end;
}

1@20cn2.gat,53,219,7	script(HIDDEN)	ルガン#ep20MD_re03_09	10474,{
	unittalk "ルガン : 忌々しいが、あの外から来た人間の命令は絶対だ。";
	end;
}

1@20cn2.gat,52,221,7	script(HIDDEN)	ルガン#ep20MD_re04_1_09	21978,{
	unittalk "ルガン : グエッ、やっぱり動きづらい！";
	end;
}

1@20cn2.gat,107,65,3	script2	猫#ep20MD_re04_09	22006,2,2,{
	cutin "ep20_nyar02.png", 1;
	mes "[白い猫]";
	mes "ニャアアァァオォ。";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "見つからないように";
	mes "こそこそ動きましょう……。";
	next;
	cutin "ep19_lehar05.png", 255;
	announce "警報 : ……非常事態発生！　非常事態発生！", 0x9, 0xffff99;
	if(!sleep2(3000)) end;
	announce "警報 : 氷の城の奴らが脱走した！", 0x9, 0xffff99;
	if(!sleep2(3000)) end;
	announce "警報 : 各自、持ち場へ戻れ！　警戒を強化せよ！", 0x9, 0xffff99;
	if(!sleep2(3000)) end;
	mes "[ルガン]";
	mes "何が起きた？";
	mes "誰が逃げ出したんだって？";
	next;
	mes "[ルガン]";
	mes "捕獲した人間どもが逃げ出した！";
	mes "自分の持ち場に戻れ！";
	mes "知らない顔の奴がいたら通報しろ！";
	mes "奴らは私達と同じ姿に変身できる！";
	next;
	cutin "ep19_lehar03.png", 2;
	mes "[レハール]";
	mes "私達がルガンに変身していたことは";
	mes "バレちゃってるようですね……。";
	next;
	cutin "ep20_nyar03.png", 1;
	mes "[白い猫]";
	mes "ニャンニャンニャアッ！";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "うわ、猫が歩き始めました！";
	mes "ど、どこに行くんだろう……";
	mes "ついて行くしかなさそうですが!?!?";
	close2;
	cutin "ep19_lehar03.png", 255;
	stopnpctimer;
	hideonnpc getmdnpcname("レハール#ep20MD_re05_09");
	viewpoint 1, 96, 65, 1, 0xFF0000;
	npcwalkto 96,65,getmdnpcname("猫#ep20MD_re04_09");
	npcwalkwait;
	initnpctimer getmdnpcname("猫#ep20MD_re04_1_09");
	hideonnpc getmdnpcname("猫#ep20MD_re04_09");
	hideoffnpc getmdnpcname("猫#ep20MD_re04_1_09");
	hideoffnpc getmdnpcname("レハール#ep20MD_re05_1_09");
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "猫 : ミヤアァァァァン。";
	end;
OnInit:
	setnpcspeed 150;
	end;
}
1@20cn2.gat,96,65,3	script(HIDDEN)	猫#ep20MD_re04_1_09	22006,{
	hideoffnpc getmdnpcname("ルガン#ep20MD_re05_09");
	hideoffnpc getmdnpcname("ルガン#ep20MD_re06_09");
	hideoffnpc getmdnpcname("ルガン#ep20MD_re07_09");
	menu "ルガンが近づいて来ます！",-;
	unittalk getnpcid(0,getmdnpcname("ルガン#ep20MD_re05_09")),"ルガン : 逃げ出した奴らは、どこにいるんだ！";
	unittalk getnpcid(0,getmdnpcname("ルガン#ep20MD_re06_09")),"ルガン : まさか近くに隠れているんじゃ……ぞっとするな。";
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "このままじゃ鉢合わせです！";
	mes "お～い、猫！　猫様！";
	mes "行っちゃダメ！　ダメだってぇぇ！";
	next;
	unittalk getnpcid(0,getmdnpcname("ルガン#ep20MD_re05_09")),"ルガン : 見つけたら、酷い目に遭わせてやる！";
	misceffect 562,getmdnpcname("ルガン#ep20MD_re05_09");
	misceffect 562,getmdnpcname("ルガン#ep20MD_re06_09");
	unittalk getnpcid(0,getmdnpcname("ルガン#ep20MD_re07_09")),"ルガン : 奴らを発見すれば、ラスガンド様に褒めてもらえるかもしれない！";
	misceffect 562,getmdnpcname("ルガン#ep20MD_re07_09");
	cutin "ep19_lehar04.png", 2;
	mes "[レハール]";
	mes "（ダメだっ！　見つかる!!）";
	next;
	unittalk getnpcid(0,getmdnpcname("ルガン#ep20MD_re07_09")),"ルガン : とにかく油断するな！　奴らを絶対に逃がすな！";
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "あれ？";
	mes "……あれ？";
	mes "わ、私たちに気付いていない？";
	mes "ど、どうなってるんだ??";
	mes "あ……もしかして！";
	next;
	hideonnpc getmdnpcname("ルガン#ep20MD_re05_09");
	delmisceffect 562, getmdnpcname("ルガン#ep20MD_re05_09");
	hideonnpc getmdnpcname("ルガン#ep20MD_re06_09");
	delmisceffect 562, getmdnpcname("ルガン#ep20MD_re06_09");
	hideonnpc getmdnpcname("ルガン#ep20MD_re07_09");
	delmisceffect 562, getmdnpcname("ルガン#ep20MD_re07_09");
	cutin "ep19_lehar06.png", 2;
	mes "[レハール]";
	mes "こ、これも猫の能力でしょうか？";
	mes "さっき錠前を壊した時も";
	mes "なにか不思議な力を感じましたが……。";
	next;
	cutin "ep19_lehar03.png", 255;
	menu "早く来いと言ってるみたいです",-;
	cutin "ep19_lehar06.png", 2;
	mes "[レハール]";
	mes "猫ぉ～！　これ以上引っ張らないで！";
	mes "ふ、服が破ける!!";
	mes "はぁはぁ……どうやら姿を隠せるのは";
	mes "短時間だけみたいですね。";
	next;
	cutin "ep19_lehar02.png", 2;
	mes "[レハール]";
	mes "でも、おかげで助かりました。";
	mes "君って本当に凄いね！";
	mes "それにとっても賢い！";
	next;
	cutin "ep20_nyar01.png", 1;
	mes "‐白い猫は得意げに顎を上げ";
	mes "　尻尾をピンと立てると";
	mes "　再び歩き始めた‐";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "ついて行きましょう！";
	close2;
	cutin "ep19_lehar05.png", 255;
	stopnpctimer;
	initnpctimer getmdnpcname("レハール#ep20MD_re06_09");
	hideonnpc getmdnpcname("猫#ep20MD_re04_1_09");
	hideonnpc getmdnpcname("レハール#ep20MD_re05_1_09");
	hideoffnpc getmdnpcname("レハール#ep20MD_re06_09");
	hideoffnpc getmdnpcname("猫#ep20MD_re05_09");
	viewpoint 1, 33, 14, 1, 0xFF0000;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,109,63,3	script2	レハール#ep20MD_re05_09	10469,{
	unittalk "レハール : 急ぎましょう！";
	end;
OnInit:
	setnpcspeed 200;
	end;
}

1@20cn2.gat,98,63,3	script(HIDDEN)	レハール#ep20MD_re05_1_09	10469,{
	unittalk "レハール : お～い、猫！　猫様ぁ！";
	end;
}

1@20cn2.gat,92,62,7	script(HIDDEN)	ルガン#ep20MD_re05_09	10474,{
	unittalk "ルガン : 脱走した奴ら、この辺に隠れているんじゃないか？";
	end;
}
1@20cn2.gat,95,60,5	script(HIDDEN)	ルガン#ep20MD_re06_09	10475,{
	unittalk "ルガン : この近くにいるっていうのか？";
	end;
}

1@20cn2.gat,94,64,1	script(HIDDEN)	ルガン#ep20MD_re07_09	10473,{
	unittalk "ルガン : そんな気配はしないが……。";
	end;
}

1@20cn2.gat,32,22,5	script(HIDDEN)	レハール#ep20MD_re06_09	10469,{
	if(.scene == 3) {
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "見てください！";
		mes "この扉、見覚えがありませんか？";
		next;
		cutin "ep19_lehar05.png", 255;
		menu "蛇の巣の一番奥で見た……",-;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "ですよね！";
		mes "ここはあの扉の内側ってことです！";
		mes "扉を開ければ、外に出れますよ。";
		mes "どれどれ……よし！";
		mes "内側からなら開けられそうです！";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[白い猫]";
		mes "ニャアオ～";
		next;
		cutin "ep20_nyar04.png", 255;
		menu "本当にありがとう",-;
		emotion 3,getmdnpcname("レハール#ep20MD_re06_09");
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "ありがとう、猫ちゃん。";
		mes "ここまで来れたのはキミのおかげだよ。";
		next;
		emotion 14,getmdnpcname("レハール#ep20MD_re06_09");
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ねえ、一緒に来る？";
		mes "氷のお城にお家を用意してあげるよ。";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[白い猫]";
		mes "ミヤアン。";
		next;
		cutin "ep19_lehar07.png", 2;
		mes "[レハール]";
		mes "この子、首を横に振りましたね。";
		mes "やっぱり、私達の言葉を";
		mes "理解しているように見えます。";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "うん、偶然では無さそう……。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "扉が開きました！";
		mes "さあ、外に出ましょう！";
		mes "蛇の巣にはまだ活動中の仲間がいます。";
		mes "手を貸してくれるはずですよ！";
		close2;
		cutin "ep19_lehar05.png", 255;
		viewpoint 1, 33, 14, 1, 0xFF0000;
		stopnpctimer;
		initnpctimer getmdnpcname("#ep20MD_re02_09");
		set .scene,4;
		end;
	}
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "扉が開きました！";
	mes "さあ、外に出ましょう！";
	mes "蛇の巣にはまだ活動中の仲間がいます。";
	mes "手を貸してくれるはずですよ！";
	close2;
	viewpoint 1, 33, 14, 1, 0xFF0000;
	cutin "ep19_lehar05.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,34,20,5	script(HIDDEN)	猫#ep20MD_re05_09	22006,{
	unittalk "猫 : ミヤアン。";
	end;
}

1@20cn2.gat,31,19,5	script(HIDDEN)	ラスガンド#ep20MD_re03_09	22007,{}
1@20cn2.gat,30,21,5	script(HIDDEN)	バゴット#ep20MD_re03_09	10386,{}

1@20cn2.gat,33,15,0	script	#ep20MD_re02_09	45,2,2,{
OnTouch:
	if(.scene < 4) {
		unittalk getcharid(3),strcharinfo(0)+" : 扉には鍵がかかっているようだ。",1;
		end;
	}
	unittalk getnpcid(0,getmdnpcname("レハール#ep20MD_re06_09")),"レハール : ああっ、あれを見てください！";
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "外に出ましょう！";
	mes "急いで！";
	next;
	cutin "ep19_lehar01.png", 255;
	menu "扉から外に出る",-;
	hideonnpc getmdnpcname("猫#ep20MD_re05_09");
	hideonnpc getmdnpcname("レハール#ep20MD_re06_09");
	misceffect 809,"";
	mes "……。";
	next;
	mes "…………。";
	next;
	mes "………………。";
	next;
	hideoffnpc getmdnpcname("ラスガンド#ep20MD_re03_09");
	hideoffnpc getmdnpcname("バゴット#ep20MD_re03_09");
	unittalk getnpcid(0,getmdnpcname("バゴット#ep20MD_re03_09")),"バゴット : ……見つけましたよ、ラスガンド様。";
	emotion 9,getmdnpcname("バゴット#ep20MD_re03_09");
	cutin "ep18_bagot_02.png", 2;
	mes "[バゴット]";
	mes "……ここまで「魔力痕」が";
	mes "続いています。";
	mes "ふぅん……";
	mes "これは蛇の巣へ繋がる扉でしたっけ？";
	next;
	mes "[バゴット]";
	mes "開いていますね。";
	mes "冒険者たちは";
	mes "ここから外に出たようです。";
	next;
	cutin "ep20_lasgand02.png", 1;
	mes "[ラスガンド]";
	mes "……あれだけの警備網を掻いくぐり";
	mes "ここに辿り着いたというのか？";
	mes "これが奴らの力だと？";
	next;
	cutin "ep18_bagot_02.png", 2;
	mes "[バゴット]";
	mes "この僅かに残る魔力痕……";
	mes "冒険者のものではありません。";
	mes "あの紫髪の聖職者のもの……";
	mes "それとも……。";
	next;
	cutin "ep20_lasgand02.png", 1;
	mes "[ラスガンド]";
	mes "別の協力者がいたか……";
	mes "人間が扱える術の範疇を凌駕している。";
	mes "まさか……。";
	next;
	cutin "ep18_bagot_02.png", 2;
	mes "[バゴット]";
	mes "…………";
	mes "この扉はどういたします？";
	mes "再び閉鎖しますか？";
	next;
	cutin "ep20_lasgand04.png", 1;
	mes "[ラスガンド]";
	mes "そのままにしておいた上で";
	mes "警備を強化しろ。";
	mes "……奴等は必ずここに戻って来る。";
	next;
	cutin "ep20_lasgand03.png", 1;
	mes "[ラスガンド]";
	mes "蛇の巣に足を踏み入れることが";
	mes "どういうことか……";
	mes "わからせてやろう。";
	next;
	cutin "ep20_lasgand02.png", 255;
	stopnpctimer;
	chgquest 16701,16702;
	set EP20_1QUE,13;
	mes "‐イスガルド 氷の城へ";
	mes "　向かいますか？‐";
	next;
	if(select("向かう","やめる") == 2) {
		mes "‐その場にとどまった‐";
		close;
	}
	//miss
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}
