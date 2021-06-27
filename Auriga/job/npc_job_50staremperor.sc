//====================================================================
//Ragnarok Online - StarEmperor Jobchange Script	by refis
//
//　■ CHANGE_SE -> 0～14
//====================================================================

payon.gat,171,171,4	script	星帝の服装をした男#JQ_S	4239,{/* 10730 */
	if(Job == Job_StarEmperor) {
		mes "[ナルソン]";
		mes "ぐう……";
		mes "俺様も間もなく星帝になるつもりだけど？";
		mes "絶対ちっとも全然全く羨ましくないからな？！";
		emotion 57,"星帝の服装をした男#JQ_S";	// 10730
		close;
	}
	if(Job != Job_StarGladiator || BaseLevel < 99 || JobLevel < 50) {
		mes "[星帝の服装をした男]";
		mes "嚢中の錐、";
		mes "才能溢れる者は隠し切れないというが……";
		mes "外で形だけの修業をするだけで、";
		mes "みんな、おだて過ぎるよな。";
		close;
	}
	if(CHANGE_SE == 0) {
		cloakonnpc "執事セイ#JQ_SEch1";	// 10731
		cloakonnpc "執事セイ#JQ_SEch2";	// 10732
		cloakonnpc "執事セイ#JQ_SEch3";	// 10733
		cloakonnpc "執事セイ#JQ_SEch4";	// 10734
		mes "[星帝の服装をした男]";
		mes "はぁぁぁあっ！";
		mes "…";
		mes "……";
		next;
		mes "[星帝の服装をした男]";
		mes "く……";
		mes "俺様って奴は……";
		mes "なんで正拳一つとっても、";
		mes "ここまで完璧なのか……。";
		emotion 38,"星帝の服装をした男#JQ_S";	// 10730
		next;
		mes "[執事セイ]";
		mes "最高です、ナルソンお坊ちゃま！！";
		mes "今日もすご～く恰好いいですな！";
		cloakoffnpc "執事セイ#JQ_SEch1";	// 10731
		unittalk getnpcid(0,"執事セイ#JQ_SEch1"),"パシャ！パシャ！";	// 10731
		misceffect 250,"執事セイ#JQ_SEch1";	// 10731
		if(!sleep2(100)) end;
		misceffect 250,"執事セイ#JQ_SEch1";	// 10731
		if(!sleep2(1000)) end;
		cloakonnpc "執事セイ#JQ_SEch1";	// 10731
		cloakoffnpc "執事セイ#JQ_SEch2";	// 10732
		unittalk getnpcid(0,"執事セイ#JQ_SEch2"),"パシャ！パシャ！";	// 10732
		misceffect 250,"執事セイ#JQ_SEch2";	// 10732
		if(!sleep2(100)) end;
		misceffect 250,"執事セイ#JQ_SEch2";	// 10732
		if(!sleep2(1000)) end;
		cloakonnpc "執事セイ#JQ_SEch2";	// 10732
		cloakoffnpc "執事セイ#JQ_SEch3";	// 10733
		unittalk getnpcid(0,"執事セイ#JQ_SEch3"),"パシャ！パシャ！";	// 10733
		misceffect 250,"執事セイ#JQ_SEch3";	// 10733
		if(!sleep2(100)) end;
		misceffect 250,"執事セイ#JQ_SEch3";	// 10733
		if(!sleep2(1000)) end;
		cloakonnpc "執事セイ#JQ_SEch3";	// 10733
		cloakoffnpc "執事セイ#JQ_SEch4";	// 10734
		unittalk getnpcid(0,"執事セイ#JQ_SEch4"),"パシャ！パシャ！";	// 10734
		misceffect 250,"執事セイ#JQ_SEch4";	// 10734
		if(!sleep2(100)) end;
		misceffect 250,"執事セイ#JQ_SEch4";	// 10734
		next;
		mes "[ナルソン]";
		mes "ふっ……";
		mes "そう。";
		mes "知ってる。";
		emotion 40,"星帝の服装をした男#JQ_S";	// 10730
		next;
		mes "[ナルソン]";
		mes "ところでドゥルソンお爺ちゃんは";
		mes "いつ帰って来るんだ？";
		mes "^ff0000流星林^000000へ行くと言って";
		mes "数日は経ったんだが……。";
		next;
		mes "[執事セイ]";
		mes "そう遠い場所ではないので、";
		mes "じきにお戻りになるでしょう。";
		next;
		mes "[ナルソン]";
		mes "遠くはないが";
		mes "険しい山奥のド田舎じゃないか。";
		mes "チョウジ師範は、なんでそんなところで";
		mes "道場を開いているんだ？";
		emotion 54,"星帝の服装をした男#JQ_S";	// 10730
		next;
		mes "[ナルソン]";
		mes "話してくだされば、町のすぐ側に";
		mes "道場を建ててさしあげるのに！";
		mes "そうすれば、今の何倍もの規模で";
		mes "金も稼げて人気もあがるだろうに！";
		next;
		mes "[執事セイ]";
		mes "しっ！";
		mes "さっきからずーっとお坊ちゃまを";
		mes "見ている者がおります。";
		emotion 22,"執事セイ#JQ_SEch4";	// 10734
		next;
		mes "[ナルソン]";
		mes "別にやましいことを";
		mes "話しているわけじゃないんだから、";
		mes "他人に聞かれても構わないだろ？";
		next;
		mes "[ナルソン]";
		mes "そこのお前！";
		mes "俺様に何か用があるのか？";
		next;
		unittalk getnpcid(0,"執事セイ#JQ_SEch4"),"それでは失礼いたします。";	// 10734
		cloakonnpc "執事セイ#JQ_SEch4";	// 10734
		while(1) {
			switch(select("流星林について聞く","服装について聞く","やめる")) {
			case 1:
				break;
			case 2:
				mes "[ナルソン]";
				mes "この俺様は、間もなく";
				mes "^ff0000宇宙を知り尽くし者……つまり星帝^000000になる";
				mes "ナルソン様である！";
				emotion 52,"星帝の服装をした男#JQ_S";	// 10730
				next;
				mes "[ナルソン]";
				mes "この服も、その日のために";
				mes "事前に用意しておいたものだ！";
				next;
				mes "[ナルソン]";
				mes "ジャイアントスパイダーのくもの糸から";
				mes "出来た最高級の絹に、";
				mes "バフォメットの毛で作った高級糸で";
				mes "刺繍した特上品！";
				mes "流星林の配給品とはレベルが違うんだよ！";
				next;
				mes "[ナルソン]";
				mes "特別に写真撮るのを許可しよう。";
				mes "ふふ……。";
				next;
				continue;
			case 3:
				mes "[ナルソン]";
				mes "何か言おうとしてなかったか？";
				mes "恥ずかしがるなよ～。";
				emotion 40,"星帝の服装をした男#JQ_S";	// 10730
				close;
			}
			break;
		}	// end while
		mes "[ナルソン]";
		mes "流星林？";
		mes "チョウジ師範が開かれた";
		mes "星帝になる為の道場のことだが、";
		mes "お前も星帝になりたいのか？";
		emotion 1,"星帝の服装をした男#JQ_S";	// 10730
		next;
		mes "[ナルソン]";
		mes "流星林は^ff0000ミョルニール山脈の北^000000にある";
		mes "狭い山道を登って行けばあるぞ。";
		mes "あまりにも険しい山道だから、";
		mes "ひ弱な奴は辿りつくことさえ難しいけどな。";
		next;
		mes "[ナルソン]";
		mes "だが俺様は優しいから、";
		mes "うちの執事に流星林の近くまで";
		mes "案内させてやってもいいぞ。";
		mes "どうするよ？";
		setquest 11573;	// state=1
		set CHANGE_SE,1;
		next;
		if(select("流星林に案内してもらう","自分で行く") == 2) {
			mes "[ナルソン]";
			mes "お前なら、辿りつけたとしても";
			mes "登るだけで5日はかかるだろうが";
			mes "頑張れよ。";
			mes "案内してほしくなったら";
			mes "遠慮なくいえよ？　俺様は優しいからな。";
			close;
		}
		// 未調査
		mes "[ナルソン]";
		mes "俺様より先に星帝にはなれないと思うが";
		mes "頑張れよ。";
		close2;
		warp "mjolnir_03.gat", 227, 176;
		end;
	}
	else if(CHANGE_SE >= 1) {
		mes "[ナルソン]";
		mes "なんだ？";
		mes "まだ流星林に辿りつけてないのか？";
		mes "俺様は優しいから、";
		mes "うちの執事に流星林の近くまで";
		mes "案内させてやってもいいぞ。";
		mes "どうするよ？";
		next;
		if(select("流星林に案内してもらう","自分で行く") == 2) {
			mes "[ナルソン]";
			mes "お前なら、辿りつけたとしても";
			mes "登るだけで5日はかかるだろうが";
			mes "頑張れよ。";
			mes "案内してほしくなったら";
			mes "遠慮なくいえよ？　俺様は優しいからな。";
			close;
		}
		mes "[ナルソン]";
		mes "俺様より先に星帝にはなれないと思うが";
		mes "頑張れよ。";
		close2;
		warp "mjolnir_03.gat", 227, 176;
		end;
	}
}
payon.gat,170,169,7	script	執事セイ#JQ_SEch1	88,{/* 10731 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
payon.gat,168,173,5	script	執事セイ#JQ_SEch2	88,{/* 10732 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
payon.gat,173,173,3	script	執事セイ#JQ_SEch3	88,{/* 10733 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
payon.gat,173,169,1	script	執事セイ#JQ_SEch4	88,{/* 10734 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

mjolnir_03.gat,236,185,4	script	山守り#JQ_SE	59,{/* 12867 */
	mes "[山守り]";
	mes "こんにちは～";
	mes "いい天気ですよね？";
	emotion 18;	// 12867
	if(CHANGE_SE == 12) set '@str$,"問い詰める";
	next;
	switch(select('@str$,"流星林へ行く道を聞く","天気について話す","やめる")) {
	case 1:
		mes "[チョウジ師範]";
		mes "あちゃ～ばれちゃいましたか。";
		mes "今までニッコウしか気づかなかったのに、";
		mes "勘がいいですね！";
		emotion 18,"山守り#JQ_SE";	// 12867
		next;
		menu "隠れていた理由について",-;
		mes "[チョウジ・クウ]";
		mes "あ！";
		mes "師範という呼称はもういいです。";
		mes "適当に「さん」ぐらいで結構です。";
		mes "私は、あの子たちに";
		mes "師範の座を譲るつもりなので！";
		next;
		mes "[チョウジ・クウ]";
		mes "もう資格は十分あるのに";
		mes "ずっと弟子として残ると言い張ってたので、";
		mes "一旦隠れて様子を見ていました。";
		next;
		mes "[チョウジ・クウ]";
		mes "無論、今はまだ至らぬ点も多いけれど、";
		mes "絶えず学んで成長して行きますから。";
		next;
		mes "[チョウジ・クウ]";
		mes "ミカは実力も優れていて真面目だけど、";
		mes "真面目過ぎるのがたまに傷ですし……";
		next;
		mes "[チョウジ・クウ]";
		mes "ギンガは才能がずば抜けているせいで、";
		mes "他人の苦労に鈍感で……";
		next;
		mes "[チョウジ・クウ]";
		mes "ニッコウは自分の修業にしか";
		mes "興味がなく……";
		next;
		mes "[チョウジ・クウ]";
		mes "ただ三人全員で切磋琢磨すれば、";
		mes "私を超える日もそう遠くないでしょう。";
		emotion 18,"山守り#JQ_SE";	// 12867
		next;
		mes "[チョウジ・クウ]";
		mes "あの子たちは、よい師範になれるでしょうね。";
		mes strcharinfo(0)+ "さんの";
		mes "考えはいかがですか？";
		mes "誰と共に成長したいですか？";
		mes "師範への第一歩として";
		mes "あなたを星帝へ導いてくれるでしょう。";
		delquest 11584;
		setquest 11585;	// state=1
		set CHANGE_SE,13;
		close2;
		warp "star_frst.gat", 89, 32;	// from: mjolnir_03.gat(229, 180)
		end;
	case 2:
		mes "[山守り]";
		mes "流星林には、こちらの山道を";
		mes "進んでください。";
		mes "山道が少々険しいですが……";
		mes "すぐ辿りつけるでしょう。";
		close2;
		warp "star_frst.gat", 89, 32;	// from: mjolnir_03.gat(234, 181)
		end;
	case 3:
		mes "[山守り]";
		mes "山の天気はいつ急変するか分かりません。";
		mes "常にお気をつけください。";
		mes "少し暗くなるだけで、";
		mes "道が全く見えなくなりますから。";
		close;
	case 4:
		mes "[山守り]";
		mes "では、お気をつけて～。";
		close;
	}
}
star_frst.gat,88,36,5	script	チョウジの弟子#JQ_SE	914,{/* 12868 */
	if(Job == Job_StarEmperor) {
		mes "[レンシス]";
		mes "うわぁ……その服、よく似合ってますね！";
		mes "でも、星帝になったからって";
		mes "終わったわけじゃないですよ？";
		mes "これから地獄の修業の始まりです……";
		mes "ハ……ハハ……。";
		emotion 28,"チョウジの弟子#JQ_SE";	// 12868
		close;
	}
	if(CHANGE_SE == 2) {
		mes "[チョウジの弟子]";
		mes "では、入門届を用意しますから";
		mes "茶屋に行きましょう。";
		mes "こちらへ着いてきてください。";
		emotion 44,"チョウジの弟子#JQ_SE";	// 12868
		cloakoffnpc "チョウジの弟子#JQ_SEin";	// 12870
		viewpoint 1, 57, 123, 0, 0xFFFF00;	// 0x144
		close;
	}
	else if(CHANGE_SE >= 3) {
		mes "[レンシス]";
		mes "修業は上手く行ってる？";
		mes "もし途中で分からないことがあったら";
		mes "クエストウィンドウ(Alt+U)を開き、";
		mes "何をしていたか確認してみて。";
		next;
		mes "[レンシス]";
		mes "一度フェイヨンに帰りたければ";
		mes "言ってください。";
		next;
		if(select("帰らない","帰る") == 1) {
			mes "[レンシス]";
			mes "引き続き頑張ってください！";
			close;
		}
		mes "[レンシス]";
		mes "それでは、";
		mes "フェイヨンに送ります。";
		close2;
		warp "payon.gat", 166, 166;	// from: star_frst.gat(89, 48) port : 5121
		end;
	}
	mes "[チョウジの弟子]";
	mes "こんにちは。";
	mes "見慣れない顔ですね？";
	mes "ここの人ではなさそうですし……";
	mes "どういった御用でしょう？";
	if(CHANGE_SE >= 1) set '@str$,"星帝になりたいから";
	next;
	switch(select('@str$,"旅行","何となく")) {
	case 1:
		mes "[チョウジの弟子]";
		mes "あは！";
		mes "星帝になりたいんですか？";
		mes "うーん……。";
		next;
		mes "[チョウジの弟子]";
		mes "最近、星帝になりたい方が";
		mes "非常に多くなりました。";
		mes "どこかで話題にでも";
		mes "なっているのでしょうか？";
		emotion 4,"チョウジの弟子#JQ_SE";	// 12868
		next;
		mes "[チョウジの弟子]";
		mes "星帝になるには、この^ff0000流星林に入門^000000し、";
		mes "修業されることをお勧めします。";
		mes "人にとって差はありますが、";
		mes "実力を積みチョウジ師範に認められれば";
		mes "星帝になることができます。";
		next;
		if(select("入門する","やめておく") == 2) {
			mes "[チョウジの弟子]";
			mes "はい。";
			mes "ゆっくり考えてください。";
			close;
		}
		mes "[チョウジの弟子]";
		mes "では、入門届を用意しますから";
		mes "茶屋に行きましょう。";
		mes "こちらへ着いてきてください。";
		emotion 44,"チョウジの弟子#JQ_SE";	// 12868
		delquest 11573;
		setquest 11574;	// state=1
		set CHANGE_SE,2;
		cloakoffnpc "チョウジの弟子#JQ_SEin";	// 12870
		viewpoint 1, 57, 123, 0, 0xFFFF00;	// 0x144
		close;
	case 2:
		mes "[チョウジの弟子]";
		mes "ハハハ！";
		mes "旅行でしたか？";
		mes "こんな深い山奥までいらっしゃるとは、";
		mes "変わった方ですね。";
		emotion 18;	// 12868
		next;
		mes "[チョウジの弟子]";
		mes "ここは修業のための場であり、";
		mes "旅行に来た方が楽しめるようなものは";
		mes "なにもありません。";
		mes "しかし、たまには大騒ぎして遊ぶより、";
		mes "静かな時間を過ごすのも";
		mes "良いかもしれませんね。";
		close;
	case 3:
		mes "[チョウジの弟子]";
		mes "何事にも理由が必要とは限りませんよね。";
		mes "アハハハハ！";
		emotion 18;	// 12868
		close;
	}
}

star_in.gat,182,77,0	script	#JQ_SE_hide_in	139,14,14,{/* 12869 */
	if(CHANGE_SE == 2) {
		cloakoffnpc "チョウジの弟子#JQ_SEin";	// 12870
		end;
	}
	end;
}
star_in.gat,177,84,3	script	チョウジの弟子#JQ_SEin	914,{/* 12870 (cloaking)*/
	cloakonnpc "ミカ#JQ_SE_mcff";	// 12873
	mes "[チョウジの弟子]";
	mes "さぁ、こちらで入門届を書いてください。";
	mes "ゲン、この方にお茶を。";
	next;
	mes "[ゲン]";
	mes "はい！";
	emotion 21,"ゲン#JQ_SE";	// 12871
	next;
	mes "[いきなり入り込んだお爺さん]";
	mes "おい！　ちょっと!!";
	mes "わしの方が先に来たのに、";
	mes "何でこいつからなんだよ！";
	cloakoffnpc "ドゥルソン#JQ_SE";	// 12872
	emotion 6,"ドゥルソン#JQ_SE";	// 12872
	next;
	mes "[チョウジの弟子]";
	mes "ドゥルソンのご老体、";
	mes "その件はダメだと伝えたではありませんか？";
	emotion 19,"チョウジの弟子#JQ_SEin";	// 12870
	next;
	mes "[ドゥルソン]";
	mes "いや、それはミカ殿のお考えであり、";
	mes "チョウジ殿の返事ではないじゃありませんか！";
	next;
	mes "[チョウジの弟子]";
	mes "チョウジ師範は現在外出中です。";
	mes "だから師範代の言葉が、師範の言葉です。";
	mes "どうしてもチョウジ師範に";
	mes "伝えたいことがありましたら、";
	mes "書簡を残してください。";
	next;
	mes "[ドゥルソン]";
	mes "わしがその言葉を何回聞いたと思ってるんだ！";
	mes "何度訪ねても外出中……";
	mes "書簡を残してくれとしか言わないし。";
	mes "今までわしが残した書簡をまとめると";
	mes "何冊もの本になるだろ！";
	next;
	mes "[チョウジの弟子]";
	mes "そう仰いましても……。";
	emotion 19,"チョウジの弟子#JQ_SEin";	// 12870
	next;
	mes "[青い服の星帝]";
	mes "何事ですか？　レンシス。";
	cloakoffnpc "ミカ#JQ_SE_mcff";	// 12873
	cutin "se_moon01.bmp", 2;
	next;
	mes "[チョウジの弟子　レンシス]";
	mes "あ！　ミカ師範代！";
	mes "ちょうどいいところにいらっしゃいました。";
	mes "ドゥルソンのご老体がまた……。";
	cutin "se_moon01.bmp", 255;
	emotion 26,"チョウジの弟子#JQ_SEin";	// 12870
	next;
	mes "[ミカ]";
	mes "ご老体。";
	mes "ここは修業者のための場所です。";
	mes "師範が帰ってきたら";
	mes "人を送ってお知らせしますから、";
	mes "今はお引き取りください。";
	cutin "se_moon01.bmp", 2;
	next;
	mes "[ドゥルソン]";
	mes "しかしミカ殿！";
	mes "そう仰るばかりで、もう何年目ですか！";
	mes "チョウジ殿はいつになったら";
	mes "帰ってくるのですか？";
	cutin "se_moon01.bmp", 255;
	next;
	mes "[ミカ]";
	mes "師範がいつ帰って来るかは、";
	mes "師範のみぞ知ることです。";
	cutin "se_moon01.bmp", 2;
	next;
	mes "[ドゥルソン]";
	mes "だとしても、ただ待ち続ける訳にも";
	mes "いかんのですよ。";
	mes "わしの孫が、星帝になれる日を";
	mes "首を長くして待っているんですよ～。";
	cutin "se_moon01.bmp", 255;
	emotion 19,"ドゥルソン#JQ_SE";	// 12872
	next;
	mes "[ドゥルソン]";
	mes "チョウジ殿の息子であり、";
	mes "師範代でもあるミカ殿が";
	mes "「お前をこれから星帝として認めよう」と";
	mes "一言くだされば済むのに";
	mes "ダメ出しばかりで……。";
	next;
	mes "[ミカ]";
	mes "実力も確認したことがない者を、";
	mes "星帝であると認める訳にはいきません。";
	mes "どうかお引き取りください。";
	mes "次にご訪問の際は、ナルソン殿と";
	mes "共にいらっしゃることを願います。";
	mes "では、失礼。";
	cutin "se_moon01.bmp", 2;
	next;
	cloakonnpc "ミカ#JQ_SE_mcff";	// 12873
	mes "[ドゥルソン]";
	mes "ちょっと、ミカ殿!!";
	mes "待ってくだされ!!";
	cutin "se_moon01.bmp", 255;
	next;
	cloakonnpc "ドゥルソン#JQ_SE";	// 12872
	mes "[レンシス]";
	mes "あっ！　ミカ師範代!!";
	mes "待ってくださいよ!!";
	delquest 11574;
	setquest 11575;	// state=1
	set CHANGE_SE,3;
	close2;
	cloakonnpc "チョウジの弟子#JQ_SEin";	// 12870
	warp "star_frst.gat", 62, 116;	// from: star_in.gat(181, 80)
	end;
OnInit:
	cloakonnpc;
	end;
}
star_in.gat,180,86,3	script	ゲン#JQ_SE	778,{/* 12871 */
	mes "[ゲン]";
	mes "いらっしゃい。";
	mes "お好きな席に座ってください。";
	close;
}
star_in.gat,173,82,7	script	ドゥルソン#JQ_SE	866,{/* 12872 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
star_in.gat,176,80,3	script	ミカ#JQ_SE_mcff	10297,{/* 12873 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
star_in.gat,180,91,3	script	お客#JQ_SE_1	68,{/* 12874 */
	mes "[お客]";
	mes "修業の合間に飲む、一杯のお茶！";
	mes "これがまた別格の味なんだ！";
	close;
}
star_in.gat,182,91,3	script	お客#JQ_SE_2	787,{/* 12875 */
	mes "[お客]";
	mes "……。";
	close;
}
star_in.gat,184,91,3	script	お客#JQ_SE_3	814,{/* 12876 */
	mes "[お客]";
	mes "医者も修業しなきゃいけないのかな？";
	close;
}
star_in.gat,172,91,5	script	お客#JQ_SE_4	881,{/* 12877 */
	mes "[お客]";
	mes "ふう、疲れた……";
	mes "死ぬううぅ!!";
	close;
}
star_in.gat,172,75,5	script	お客#JQ_SE_5	931,{/* 12878 */
	mes "[お客]";
	mes "今日は何を食べようか～。";
	close;
}

star_frst.gat,72,158,0	script	修業者#JQ_SE1	4239,{/* 12879 */
	mes "[修業者]";
	mes "はあっ！！！！！！！";
	close;
}
star_frst.gat,70,158,0	script	修業者#JQ_SE2	4239,{/* 12880 */
	mes "[修業者]";
	mes "いよぉぉっ！！";
	close;
}
star_frst.gat,68,158,0	script	修業者#JQ_SE3	4239,{/* 12881 */
	mes "[修業者]";
	mes "ほあっ！！";
	close;
}
star_frst.gat,66,158,0	script	修業者#JQ_SE4	4239,{/* 12882 */
	mes "[修業者]";
	mes "ふぅ！！！";
	close;
}
star_frst.gat,64,158,0	script	修業者#JQ_SE5	4239,{/* 12883 */
	mes "[修業者]";
	mes "とおーっ！！！";
	close;
}
star_frst.gat,72,156,0	script	修業者#JQ_SE6	4239,{/* 12884 */
	mes "[修業者]";
	mes "はあああああああっ！！";
	close;
}
star_frst.gat,70,156,0	script	修業者#JQ_SE7	4239,{/* 12885 */
	mes "[修業者]";
	mes "やあっ！！";
	close;
}
star_frst.gat,68,156,0	script	修業者#JQ_SE8	4239,{/* 12886 */
	mes "[修業者]";
	mes "うおおおお！";
	close;
}
star_frst.gat,66,156,0	script	修業者#JQ_SE9	4239,{/* 12887 */
	mes "[修業者]";
	mes "くあっ！";
	close;
}
star_frst.gat,64,156,0	script	修業者#JQ_SE10	4239,{/* 12888 */
	mes "[修業者]";
	mes "とぅわ！！！";
	close;
}
star_frst.gat,72,154,0	script	修業者#JQ_SE11	4239,{/* 12889 */
	mes "[修業者]";
	mes "ひよおっ！！";
	close;
}
star_frst.gat,70,154,0	script	修業者#JQ_SE12	4239,{/* 12890 */
	mes "[修業者]";
	mes "はあっ！！";
	close;
}
star_frst.gat,68,154,0	script	修業者#JQ_SE13	4239,{/* 12891 */
	mes "[修業者]";
	mes "トワッ！！";
	close;
}
star_frst.gat,66,154,0	script	修業者#JQ_SE14	4239,{/* 12892 */
	mes "[修業者]";
	mes "あちょぉ～～";
	close;
}
star_frst.gat,64,154,0	script	修業者#JQ_SE15	4239,{/* 12893 */
	mes "[修業者]";
	mes "くぅぅーーーーーあっ！";
	close;
}
star_frst.gat,72,152,0	script	修業者#JQ_SE16	4239,{/* 12894 */
	mes "[修業者]";
	mes "かっ！！！！";
	close;
}
star_frst.gat,70,152,0	script	修業者#JQ_SE17	4239,{/* 12895 */
	mes "[修業者]";
	mes "タアッ！！！";
	close;
}
star_frst.gat,68,152,0	script	修業者#JQ_SE18	4239,{/* 12896 */
	mes "[修業者]";
	mes "キヨオォォォ！！";
	close;
}
star_frst.gat,66,152,0	script	修業者#JQ_SE19	4239,{/* 12897 */
	mes "[修業者]";
	mes "ほあっ！";
	close;
}
star_frst.gat,64,152,0	script	修業者#JQ_SE20	4239,{/* 12898 */
	mes "[修業者]";
	mes "やっ！";
	close;
}
star_frst.gat,117,156,5	script	修業者#JQ_SE21	4239,{/* 12899 */
	mes "[修業者]";
	mes "塔を綺麗に磨くのも修業の一部です。";
	close;
}
star_frst.gat,104,150,6	script	修業者#JQ_SE22	4047,{/* 12900 */
	mes "[修業者]";
	mes "精神修業中だから、邪魔しないでください。";
	close;
}
star_frst.gat,106,150,6	script	修業者#JQ_SE23	4047,{/* 12901 */}
star_frst.gat,108,150,6	script	修業者#JQ_SE24	4047,{/* 12902 */}
star_frst.gat,110,150,6	script	修業者#JQ_SE25	4047,{/* 12903 */}
star_frst.gat,112,150,6	script	修業者#JQ_SE26	4047,{/* 12904 */}
star_frst.gat,114,150,6	script	修業者#JQ_SE27	4047,{/* 12905 */}
star_frst.gat,86,126,5	script	修業者#JQ_SE28	4047,{/* 12906 */
	mes "[修業者]";
	mes "床が綺麗だと、心も綺麗になる気がします。";
	close;
}
star_frst.gat,113,99,5	script	修業者#JQ_SE29	4239,{/* 12907 */
	mes "[修業者]";
	mes "この石は、私が入門した時から";
	mes "磨いてきたものです。";
	mes "ドロレスと名付けました。";
	close;
}
star_frst.gat,152,158,7	script	修業者#JQ_SE30	819,{/* 12908 */
	mes "[修業者]";
	mes "いち！！";
	close;
}
star_frst.gat,152,156,5	script	修業者#JQ_SE31	929,{/* 12909 */
	mes "[修業者]";
	mes "いち！！";
	close;
}
star_frst.gat,152,154,5	script	修業者#JQ_SE32	841,{/* 12910 */
	mes "[修業者]";
	mes "いち！！";
	close;
}
star_frst.gat,152,152,5	script	修業者#JQ_SE33	843,{/* 12911 */
	mes "[修業者]";
	mes "いち！！";
	close;
}
star_frst.gat,154,158,3	script	修業者#JQ_SE34	934,{/* 12912 */
	mes "[修業者]";
	mes "に！！";
	close;
}
star_frst.gat,154,156,3	script	修業者#JQ_SE35	964,{/* 12913 */
	mes "[修業者]";
	mes "に！！";
	close;
}
star_frst.gat,154,154,3	script	修業者#JQ_SE36	979,{/* 12914 */
	mes "[修業者]";
	mes "に！！";
	close;
}
star_frst.gat,154,152,3	script	修業者#JQ_SE37	644,{/* 12915 */
	mes "[修業者]";
	mes "に！！";
	close;
}

star_frst.gat,69,118,0	script	#JQ_SE_hide	139,14,14,{/* 12916 */
	if(CHANGE_SE == 3) {
		cloakoffnpc "レンシス#JQ_SEcff";	// 12918
		cloakoffnpc "ミカ#JQ_SE";	// 12917
	}
	else if(CHANGE_SE == 4) {
		cloakoffnpc "レンシス#JQ_SEcff";	// 12918
	}
	end;
}
star_frst.gat,69,118,5	script	ミカ#JQ_SE	10297,{/* 12917 (cloaking)*/
	if(CHANGE_SE == 3) {
		mes "[レンシス]";
		mes "ミカ師範代！";
		mes "ちょっと待ってください。";
		next;
		mes "[ミカ]";
		mes "何かありましたか？　レンシス。";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[レンシス]";
		mes "あの……こちらが入門したばかりの";
		mes ""+strcharinfo(0)+"殿です。";
		mes "是非ともミカ師範代に";
		mes "面倒を見ていただきたくて……。";
		cutin "se_moon01.bmp", 255;
		next;
		mes "[ミカ]";
		mes "ああ、先ほど隣にいらした方ですよね。";
		mes "初対面の方に恥ずかしい姿を";
		mes "お見せしてしまいましたね。";
		mes "ははは……。";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "ふむ……";
		mes "ほう……";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[ミカ]";
		mes "なるほど……素晴らしい気迫。";
		mes "ふむ……。";
		next;
		mes "[レンシス]";
		mes "あの……ミカ師範代……？";
		cutin "se_moon02.bmp", 255;
		next;
		mes "[ミカ]";
		mes "ああ……";
		mes "申し訳ありません。";
		mes "自己紹介を忘れていましたね。";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "ミカと申します。";
		mes "チョウジ師範に代わって";
		mes "流星林の管理を任されております。";
		mes "何かありましたら、私に聞いてください。";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ミカ]";
		mes "修業についても";
		mes "詳しく教えたいところですが、";
		mes "今は急ぎの用事があるのでこれで失礼します。";
		mes "代わりにニッコ……";
		mes "いや……ううむ……。";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[ミカ]";
		mes "……レンシス、";
		mes ""+strcharinfo(0)+"殿に";
		mes "流星林の案内をお願いします。";
		mes "私は用事が終わったら、すぐ戻ります。";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[レンシス]";
		mes "は……はい！";
		mes "解りました。";
		mes "ミカ師範代！";
		cutin "se_moon01.bmp", 255;
		delquest 11575;
		setquest 11576;	// state=1
		set CHANGE_SE,4;
		close2;
		cloakonnpc "ミカ#JQ_SE";	// 12917
		end;
	}
	else if(CHANGE_SE == 4) {
		// 未調査
	}
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,66,118,5	script	レンシス#JQ_SEcff	914,{/* 12918 (cloaking)*/
	if(CHANGE_SE == 3) {
		mes "[レンシス]";
		mes "やっと追いつきました。";
		mes "ミカ師範代に話しかけてください。";
		close;
	}
	else if(CHANGE_SE == 4) {
		mes "[レンシス]";
		mes "ふふ……";
		mes "これで同じ師範代の下で、";
		mes "同じ釜の飯を食べる仲になったね！";
		next;
		mes "[レンシス]";
		mes "私はレンシス。";
		mes "新人の受付担当よ！";
		mes "ミカ師範代ほどではないけれど、";
		mes "人を見る目はある方でさ。";
		mes "相当な実力の持ち主でなければ、";
		mes "入門さえ許可しないんだよ！";
		next;
		mes "[レンシス]";
		mes "それじゃ本格的な訓練に入る前に、";
		mes "流星林の案内をしよう。";
		next;
		mes "[レンシス]";
		mes "今、私たちのいる場所が茶屋で、";
		mes "そこの道を辿って北へ行くと、";
		mes "チョウジ師範と師範代の宿がある。";
		next;
		mes "[レンシス]";
		mes "ひとまず修業の間にあんたが泊まる宿を";
		mes "紹介するわ。";
		mes "こっちへ来て。";
		delquest 11576;
		setquest 11577;	// state=1
		set CHANGE_SE,5;
		viewpoint 1, 129, 86, 0, 0xFFFF00;	// 0x144
		cloakoffnpc "レンシス#JQ_SEen";	// 12920
		close;
	}
	else if(CHANGE_SE == 5) {
		mes "[レンシス]";
		mes "今、私たちのいる場所が茶屋で、";
		mes "そこの道を辿って北へ行くと、";
		mes "チョウジ師範と師範代の宿がある。";
		next;
		mes "[レンシス]";
		mes "ひとまず修業の間にあんたが泊まる宿を";
		mes "紹介するわ。";
		mes "こっちへ来て。";
		viewpoint 1, 129, 86, 0, 0xFFFF00;	// 0x144
		cloakoffnpc "レンシス#JQ_SEen";	// 12920
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,129,86,0	script	#JQ_SE_hide2	139,14,14,{/* 12919 */
	if(CHANGE_SE == 5) {
		cloakoffnpc "レンシス#JQ_SEen";	// 12920
	}
	end;
}
star_frst.gat,129,86,5	script	レンシス#JQ_SEen	914,{/* 12920 (cloaking)*/
	if(CHANGE_SE == 5) {
		cloakonnpc "レンシス#JQ_SEcff";	// 12918
		mes "[レンシス]";
		mes "ここが宿よ。";
		mes "広くはないけど、";
		mes "普通に過ごす分には悪くはないわ。";
		mes "そしてこの丘を下れば……";
		if(!sleep2(1000)) end;
		mes "ああっ!!";
		next;
		mes "[レンシス]";
		mes "ギンガ師範代！";
		mes "あんなところでまたサボって……";
		mes "注意するついでに紹介するから、";
		mes "一緒について来て。";
		mes "そこの崖の下を歩いていたので、";
		mes "北からぐるっと回り込んでいこう。";
		emotion 7,"レンシス#JQ_SEen";	// 12920
		cloakoffnpc "レンシス#JQ_SEha";	// 12922
		delquest 11577;
		setquest 11578;	// state=1
		set CHANGE_SE,6;
		viewpoint 1, 153, 46, 0, 0xFFFF00;	// 0x144
		close;
	}
	else if(CHANGE_SE == 6) {
		mes "[レンシス]";
		mes "ギンガ師範代！";
		mes "あんなところでまたサボって……";
		mes "注意するついでに紹介するから、";
		mes "一緒について来て。";
		mes "そこの崖の下を歩いていたので、";
		mes "北からぐるっと回り込んでいこう。";
		emotion 7,"レンシス#JQ_SEen";	// 12920
		cloakoffnpc "レンシス#JQ_SEha";	// 12922
		viewpoint 1, 153, 46, 0, 0xFFFF00;	// 0x144
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,148,47,0	script	#JQ_SE_hide2	139,14,14,{/* 12921 */
	if(CHANGE_SE == 6) {
		cloakoffnpc "レンシス#JQ_SEha";	// 12922
	}
	else if(CHANGE_SE == 7) {
		if(checkquest(11579) & 0x4 == 0) {
			cloakoffnpc "レンシス#JQ_SEha";	// 12922
		}
	}
	end;
}
star_frst.gat,148,47,5	script	レンシス#JQ_SEha	914,{/* 12922 (cloaking)*/
	cloakonnpc "レンシス#JQ_SEen";	// 12920
	mes "[レンシス]";
	mes "ギンガ師範代！！";
	mes "こんな場所でサボってちゃダメでしょう！";
	close;
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,153,46,3	script	ギンガ#JQ_SE	10298,{/* 12923 */
	if(CHANGE_SE == 6) {
		cloakonnpc "レンシス#JQ_SEen";	// 12920
		mes "[レンシス]";
		mes "ギンガ師範代！！";
		mes "こんな場所でサボってちゃダメでしょう！";
		mes "ミカ師範代が独りで";
		mes "どれほど苦労なさっているか！";
		mes "ミカ師範代に、全部言いつけてやりますからね！";
		emotion 7,"レンシス#JQ_SEha";	// 12922
		next;
		mes "[ギンガ]";
		mes "ええぇ～";
		mes "そんなに怒らなくてもいいじゃな～い。";
		emotion 20,"ギンガ#JQ_SE";	// 12923
		cutin "se_star02_2.bmp", 2;
		next;
		mes "[レンシス]";
		mes "チョウジ師範の跡を継ぐことに";
		mes "なるかもしれないのに、";
		mes "修業も全くせず毎日遊びまわって";
		mes "どうするんですか！";
		cutin "se_star02_2.bmp", 255;
		next;
		mes "[ギンガ]";
		mes "俺が師範に？";
		mes "ははは、こいつめ～。";
		mes "そんな面倒ごとはごめんだぜ～。";
		emotion 18,"ギンガ#JQ_SE";	// 12923
		cutin "se_star02_2.bmp", 2;
		next;
		mes "[レンシス]";
		mes "面倒ですか？";
		mes "そこまで凄まじい才能を持ってるのに。";
		mes "使わないのなら、私にくださいよ！";
		emotion 32,"レンシス#JQ_SEha";	// 12922
		cutin "se_star02_2.bmp", 255;
		next;
		mes "[ギンガ]";
		mes "はいはい～わかったよ～。";
		mes "最近お前も小言が増えて、";
		mes "ミカ師範代に似てきたんじゃない？";
		emotion 54,"ギンガ#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "じゃ久しぶりに師範代らしいことでもしようか？";
		mes "そこのかわい子ちゃん～。";
		emotion 52,"ギンガ#JQ_SE";	// 12923
		cutin "se_star02_1.bmp", 2;
		next;
		mes "[レンシス]";
		mes "か……かわい子ちゃん！";
		mes "褒めても何も出ませんからね！";
		emotion 23,"レンシス#JQ_SEha";	// 12922
		cutin "se_star02_1.bmp", 255;
		next;
		mes "[ギンガ]";
		mes "いや……お前じゃなくて";
		mes "そこにいる新人のことだよ。";
		mes "試しにあんたの実力を見せてもらおう。";
		emotion 32,"ギンガ#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "シュバルツバルドにアインベフという町がある。";
		mes "その周辺にいる^ff0000ミネラル^000000";
		mes "というモンスターを^ff00001体^000000倒してきてくれ。";
		cutin "se_star01.bmp", 2;
		next;
		mes "[レンシス]";
		mes "師範代！";
		mes "アインベフは遠すぎますよ！";
		emotion 23,"レンシス#JQ_SEha";	// 12922
		cutin "se_star01.bmp", 255;
		next;
		mes "[ギンガ]";
		mes "しょうがねぇ～な。";
		mes "近くまで送ってやるから、";
		mes "見つからなくても自分で探すんだぞ。";
		mes "それを含めての修業だからな。";
		emotion 2,"ギンガ#JQ_SE";	// 12923
		cutin "se_star01.bmp", 2;
		delquest 11578;
		setquest 11579;	// state=1
		set CHANGE_SE,7;
		next;
		if(select("送ってもらう","自分で行く") == 2) {
			mes "[ギンガ]";
			mes "そうか～。";
			mes "面倒なのに頑張るなぁ～。";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		// 未調査
		mes "[ギンガ]";
		mes "送ってはやるが、";
		mes "帰りは自分でなんとかするんだぞ～。";
		mes "送った時に";
		mes "ここでセーブはしといてやるよ。";
		mes "準備はいいか～？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[ギンガ]";
			mes "準備が終わったら";
			mes "言ってくれ。";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		mes "[ギンガ]";
		mes "それではいくぞ～。";
		close2;
		cutin "se_star01.bmp", 255;
		savepoint "star_frst.gat",144,49;
		warp "ein_fild05.gat", 80, 294;	// from: star_frst.gat(146, 51) port : 5129
		end;
	}
	else if(CHANGE_SE == 7) {
		if(checkquest(11579) & 0x4) {
			cloakonnpc "レンシス#JQ_SEha";	// 12922
			mes "[ギンガ]";
			mes "へぇ……";
			mes "ちゃんと倒してきたようだな。";
			emotion 23,"ギンガ#JQ_SE";	// 12923
			cutin "se_star03.bmp", 2;
			next;
			mes "[ギンガ]";
			mes "……それだけ根性があるなら、";
			mes "俺より修業バカのニッコウ師範代の方が";
			mes "いいかもな。";
			mes "ここから北の方にある建物にいるぜ。";
			emotion 19,"ギンガ#JQ_SE";	// 12923
			cutin "se_star01.bmp", 2;
			next;
			mes "[ギンガ]";
			mes "修業と言えば、あいつ専門だからさ。";
			mes "俺はそんなの性に合わないからね～。";
			cutin "se_star02_2.bmp", 2;
			delquest 11579;
			setquest 11580;	// state=1
			set CHANGE_SE,8;
			viewpoint 1, 150, 176, 0, 0xFFFF00;	// 0x144
			close2;
			cutin "se_star02_2.bmp", 255;
			end;
		}
		mes "[ギンガ]";
		mes "シュバルツバルドにアインベフという町がある。";
		mes "その周辺にいる^ff0000ミネラル^000000";
		mes "というモンスターを^ff00001体^000000倒してきてくれ。";
		cutin "se_star01.bmp", 2;
		next;
		mes "[レンシス]";
		mes "師範代！";
		mes "アインベフは遠すぎますよ！";
		emotion 23,"レンシス#JQ_SEha";	// 12922
		cutin "se_star01.bmp", 255;
		next;
		mes "[ギンガ]";
		mes "しょうがねぇ～な。";
		mes "近くまで送ってやるから、";
		mes "見つからなくても自分で探すんだぞ。";
		mes "それを含めての修業だからな。";
		emotion 2,"ギンガ#JQ_SE";	// 12923
		cutin "se_star01.bmp", 2;
		next;
		if(select("送ってもらう","自分で行く") == 2) {
			mes "[ギンガ]";
			mes "そうか～。";
			mes "面倒なのに頑張るなぁ～。";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		mes "[ギンガ]";
		mes "送ってはやるが、";
		mes "帰りは自分でなんとかするんだぞ～。";
		mes "送った時に";
		mes "ここでセーブはしといてやるよ。";
		mes "準備はいいか～？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[ギンガ]";
			mes "準備が終わったら";
			mes "言ってくれ。";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		mes "[ギンガ]";
		mes "それではいくぞ～。";
		close2;
		cutin "se_star01.bmp", 255;
		savepoint "star_frst.gat",144,49;
		warp "ein_fild05.gat", 80, 294;	// from: star_frst.gat(146, 51) port : 5129
		end;
	}
	else if(CHANGE_SE == 8) {
		mes "[ギンガ]";
		mes "……それだけ根性があるなら、";
		mes "俺より修業バカのニッコウ師範代の方が";
		mes "いいかもな。";
		mes "ここから北の方にある建物にいるぜ。";
		emotion 19,"ギンガ#JQ_SE";	// 12923
		cutin "se_star01.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "修業と言えば、あいつ専門だからさ。";
		mes "俺はそんなの性に合わないからね～。";
		cutin "se_star02_2.bmp", 2;
		viewpoint 1, 150, 176, 0, 0xFFFF00;	// 0x144
		close2;
		cutin "se_star02_2.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 9) {
		// 未調査
	}
	else if(CHANGE_SE == 10 || CHANGE_SE == 11) {
		mes "[ギンガ]";
		mes "え？";
		mes "レンシスの奴、";
		mes "マジで言いつけやがったのか？";
		mes "ちぇっ！";
		emotion 19,"ギンガ#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "なにぼーっとしてるんだ？";
		mes "ニッコウの部屋に行くぞ。";
		mes "はよ～ついて来い。";
		emotion 27,"ギンガ#JQ_SE";	// 12923
		if(CHANGE_SE == 10) {
			delquest 11582;
			setquest 11583;	// state=1
			set CHANGE_SE,11;
		}
		close2;
		cutin "se_star03.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 13) {
		// 未調査
		mes "[ギンガ]";
		mes "ちぇっ……";
		mes "師範にそこまで言われたなら仕方ない。";
		emotion 32,"ギンガ#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "新しいスキルを学ぶ前に、";
		mes "今のスキルポイントを";
		mes "全部割り振ってくれ。";
		close2;
		cutin "se_star03.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 14) {
		mes "[ギンガ]";
		mes "最近修業はどう？";
		mes "よくわからない時は、一番基礎的な部分から";
		mes "じっくり振り返ってみるのも、";
		mes "修業の役に立つ気がする。";
		cutin "se_star02_2.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "フェイヨンに送ろうか？";
		next;
		if(select("帰らない","帰る") == 1) {
			mes "[ギンガ]";
			mes "そうか。";
			close2;
			cutin "se_star02_2.bmp", 255;
			end;
		}
		mes "[ギンガ]";
		mes "さあ、送るぞ。";
		close2;
		cutin "se_star02_2.bmp", 255;
		warp "payon.gat", 166, 166;	// from: star_frst.gat(146, 51) port : 5121
		end;
	}
	mes "[ギンガ]";
	mes "ひゃ～いい天気だ～。";
	mes "退屈だから、";
	mes "フェイヨンへ遊びに行こうかな～。";
	cutin "se_star02_2.bmp", 2;
	close2;
	cutin "se_star02_2.bmp", 255;
	end;
}
star_in.gat,98,67,3	script	ニッコウ#JQ_SE	10296,{/* 12924 */
	if(CHANGE_SE == 8) {
		mes "[ニッコウ]";
		mes "三万九千九百八十二、三万九千九百八十三、";
		mes "三万九千九百八十四、三万九千九百八十五、";
		mes "三万九千九百八十六、";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "三万九千九百八十七、三万九千九百八十八、";
		mes "三万九千九百八十九……";
		next;
		menu "話しかけてみる",-;
		mes "[ニッコウ]";
		mes "三万九千九百九十……どうした？";
		mes "三万九千九百九十二、三万九千九百九十三、";
		next;
		menu "修業について聞く",-;
		mes "[ニッコウ]";
		mes "三万九千九百九十四、三万九千九百九十五、";
		mes "三万九千九百九十六、三万九千九百九十七、";
		mes "三万九千九百九十八、三万九千九百九十九、";
		mes "四万。";
		next;
		mes "[ニッコウ]";
		mes "ふう……";
		mes "修業か。";
		mes "正解はわらわにもよくわからないのじゃ。";
		next;
		mes "[ニッコウ]";
		mes "この紅焔脚は、";
		mes "わらわがここに来た日に";
		mes "チョウジおじさまが教えてくれたものじゃ。";
		mes "そして、その日見た紅焔脚に至るまで、";
		mes "絶えず紅焔脚の練習をしている。";
		next;
		mes "[ニッコウ]";
		mes "それ以外のことなら……";
		mes "ふむ……そうじゃ！";
		mes "九尾狐が落とす^ff0000狐の尻尾を1個^000000";
		mes "持って行くと^ff0000ミカ^000000が喜ぶぞ。";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "わらわも行きたいが、";
		mes "紅焔脚の修業が忙しいからな。";
		mes "代わりにわらわの蹴りパワーで";
		mes "近くまで飛ばしてあげるのじゃ。";
		mes "近くに九尾狐がいなくても";
		mes "自分で探すのじゃぞ。";
		delquest 11580;
		setquest 11581;	// state=1
		set CHANGE_SE,9;
		next;
		if(select("飛ばしてもらう","自分で行く") == 2) {
			mes "[ニッコウ]";
			mes "そうじゃな。";
			mes "それも修業じゃな。";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		// 未調査
		mes "[ニッコウ]";
		mes "それでは飛ばすぞ～。";
		mes "帰りは自分でなんとかするのじゃ。";
		mes "飛ばす時に";
		mes "ここでセーブはしといてあげるのじゃ。";
		mes "準備はいいかの？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[ニッコウ]";
			mes "準備が終わったら";
			mes "教えてくれなのじゃ。";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[ニッコウ]";
		mes "それではいくのじゃ。";
		close2;
		cutin "se_sun01.bmp", 255;
		savepoint "star_frst.gat", 152, 170;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	else if(CHANGE_SE == 9) {
		if(countitem(1022) > 0) {
			mes "[ニッコウ]";
			mes "わらわに狐の尻尾は必要ないのじゃ。";
			mes "^ff0000ミカ^000000のところに持って行くのじゃ。";
			mes "中央の道を北にいった";
			mes "西の建物にいるのじゃ。";
			mes "建物前には修業者がいっぱいいるから";
			mes "すぐわかると思うぞ。";
			cutin "se_sun01.bmp", 2;
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[ニッコウ]";
		mes "それ以外のことなら……";
		mes "ふむ……そうじゃ！";
		mes "九尾狐が落とす^ff0000狐の尻尾を1個^000000";
		mes "持って行くと^ff0000ミカ^000000が喜ぶぞ。";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "わらわも行きたいが、";
		mes "紅焔脚の修業が忙しいからな。";
		mes "代わりにわらわの蹴りパワーで";
		mes "近くまで飛ばしてあげるのじゃ。";
		mes "近くに九尾狐がいなくても";
		mes "自分で探すのじゃぞ。";
		next;
		if(select("飛ばしてもらう","自分で行く") == 2) {
			mes "[ニッコウ]";
			mes "そうじゃな。";
			mes "それも修業じゃな。";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[ニッコウ]";
		mes "それでは飛ばすぞ～。";
		mes "帰りは自分でなんとかするのじゃ。";
		mes "飛ばす時に";
		mes "ここでセーブはしといてあげるのじゃ。";
		mes "準備はいいかの？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[ニッコウ]";
			mes "準備が終わったら";
			mes "教えてくれなのじゃ。";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[ニッコウ]";
		mes "それではいくのじゃ。";
		close2;
		cutin "se_sun01.bmp", 255;
		savepoint "star_frst.gat", 152, 170;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	else if(CHANGE_SE == 13) {
		// 未調査
		mes "[ニッコウ]";
		mes "ほぉ……";
		mes "そういうことだったのか。";
		mes "どこかおかしいとは思ってたけど、";
		mes "深く考えてなかったのじゃ。";
		cutin "se_sun02.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "おじさま……いや、";
		mes "チョウジ師範の考えがそうであるのなら、";
		mes "わらわは恥ずかしくないよう";
		mes "成長してみせるのじゃ。";
		cutin "se_sun01.bmp", 2;
		next;
		if(SkillPoint) {
			mes "[ニッコウ]";
			mes "新しいスキルを学ぶ準備が";
			mes "出来ておらんの。";
			mes "スキルポイントを全部割り振ってから";
			mes "出直すのじゃ。";
			cutin "se_sun03.bmp", 2;
			close2;
			cutin "se_sun03.bmp", 255;
			end;
		}
		if(Weight) {
			mes "[ニッコウ]";
			mes "何やらいろいろ持っておるのぉ。";
			mes "邪魔だから、そこの倉庫に預けるのじゃ。";
			cutin "se_sun03.bmp", 2;
			close2;
			cutin "se_sun03.bmp", 255;
			end;
		}
		mes "[ニッコウ]";
		mes "さぁ、受け取れ。";
		mes "新しい服じゃ。";
		mes "今からお主は星帝の道を歩むことになる。";
		cutin "se_sun01.bmp", 2;
		@changeoptionend opt1: 0, opt2: 0	// self
		@changeoptionend opt1: 0, opt2: 0	// self
		delquest 11585;
		setquest 202185;	// state=1
		set CHANGE_SE,14;
		next;
		mes "[ニッコウ]";
		mes "そうせっかちにならずとも、";
		mes "毎日地道に修業を重ねていけば、";
		mes "宇宙の方からお主に近付いてくるじゃろ。";
		mes "粘り強く、精進するのじゃぞ。";
		cutin "se_sun02.bmp", 2;
		close2;
		cutin "se_sun02.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 14) {
		mes "[ニッコウ]";
		mes "修業はどうしたのじゃ？";
		mes "特に思い浮かぶものが無ければ、";
		mes "共に紅焔脚をやってみるのもいいのじゃ。";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "フェイヨンに送ろうかの？";
		next;
		if(select("帰らない","帰る") == 1) {
			mes "[ニッコウ]";
			mes "そうか。";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[ニッコウ]";
		mes "それじゃあ、送るのじゃ。";
		close2;
		cutin "se_sun01.bmp", 255;
		warp "payon.gat", 166, 166;	// from: star_in.gat(102, 72) port : 5121
		end;
	}
	mes "[ニッコウ]";
	mes "紅焔脚の修業に励むのじゃ。";
	cutin "se_sun01.bmp", 2;
	close2;
	cutin "se_sun01.bmp", 255;
	end;
}
star_frst.gat,152,170,0	script	#JQ_SE_hide3	139,3,3,{/* 12925 */
	if(CHANGE_SE == 9 && countitem(1022) > 0) {
		viewpoint 1, 68, 173, 0, 0xFFFF00;	// 0x144
	}
	end;
}
star_in.gat,146,48,3	script	ミカ#JQ_SEin	10297,{/* 12926 */
	if(CHANGE_SE == 9 && countitem(1022) > 0) {
		mes "[ミカ]";
		mes "どうされましたか？";
		emotion 1,"ミカ#JQ_SEin";	// 12926
		cutin "se_moon02.bmp", 2;
		next;
		menu "ニッコウ師範代から頼まれた",-;
		mes "[ミカ]";
		mes "ああ……";
		mes "お疲れ様でした。";
		mes "九尾狐は使い道が多いのです。";
		emotion 15,"ミカ#JQ_SEin";	// 12926
		cutin "se_moon03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "ニッコウ殿はたまに部屋から";
		mes "出て来たと思ったら、";
		mes "九尾狐を絶滅させる気で狩り尽くすから、";
		mes "時々心配になります……。";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ミカ]";
		mes "ところで、レンシスに聞いた話だと";
		mes "^ff0000ギンガ^000000にも会ったようですね？";
		next;
		mes "[ミカ]";
		mes "弟子たちの面倒を見てやれと";
		mes "言っておいたのに、";
		mes "ニッコウ殿のところへ押しつけといて";
		mes "油を売っているとは……やれやれ……。";
		emotion 54,"ミカ#JQ_SEin";	// 12926
		cutin "se_moon02.bmp", 2;
		next;
		mes "[ミカ]";
		mes "もし、またギンガに会いましたら、";
		mes "ニッコウ殿の部屋へ行くように";
		mes "伝えてくださいますか？";
		mes "お願いします。";
		cutin "se_moon01.bmp", 2;
		delitem 1022,1;
		delquest 11581;
		setquest 11582;	// state=1
		set CHANGE_SE,10;
		close2;
		cutin "se_moon01.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 10) {
		mes "[ミカ]";
		mes "ところで、レンシスに聞いた話だと";
		mes "^ff0000ギンガ^000000にも会ったようですね？";
		next;
		mes "[ミカ]";
		mes "弟子たちの面倒を見てやれと";
		mes "言っておいたのに、";
		mes "ニッコウ殿のところへ押しつけといて";
		mes "油を売っているとは……やれやれ……。";
		emotion 54,"ミカ#JQ_SEin";	// 12926
		cutin "se_moon02.bmp", 2;
		next;
		mes "[ミカ]";
		mes "もし、またギンガに会いましたら、";
		mes "ニッコウ殿の部屋へ行くように";
		mes "伝えてくださいますか？";
		mes "お願いします。";
		cutin "se_moon01.bmp", 2;
		close2;
		cutin "se_moon01.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 13) {
		// 未調査
		mes "[ミカ]";
		mes "あんなに近くにいらっしゃるのに、";
		mes "気付かなかったとは。";
		mes "まだまだ修業が足りないようです。";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "しかも" +strcharinfo(0)+ "殿には";
		mes "最初から姿をお見せしていたんですよね。";
		mes "師範はもう" +strcharinfo(0)+ "殿のことを";
		mes "認めていらっしゃると見ていいでしょう。";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[ミカ]";
		mes "スキルポイントが残っていてはいけません。";
		mes "新しいスキルには、新しいスキルポイント！";
		mes "宇宙の法則みたいなものです。";
		cutin "se_moon01.bmp", 2;
		close2;
		cutin "se_moon01.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 14) {
		mes "[ミカ]";
		mes "修業は順調ですか？";
		mes "どこか詰まったら、";
		mes "何も考えず休んでみるのもいいです。";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "フェイヨンにお送りしましょうか？";
		next;
		if(select("帰らない","帰る") == 1) {
			mes "[ミカ]";
			mes "そうですか。";
			close2;
			cutin "se_moon03.bmp", 255;
			end;
		}
		mes "[ミカ]";
		mes "それではお送りします。";
		close2;
		cutin "se_moon03.bmp", 255;
		warp "payon.gat", 166, 166;	// from: star_in.gat(143, 61) port : 5121
		end;
	}
	mes "[ミカ]";
	mes "やることが終わりそうにもない。";
	mes "特に、この九尾狐の皮が……。";
	emotion 16;	// 12926
	cutin "se_moon02.bmp", 2;
	close2;
	cutin "se_moon02.bmp", 255;
	end;
}

star_frst.gat,89,25,0	warp	#JQ_SEin	3,3,mjolnir_03.gat,233,181 //star_frst.gat from_pos=(89, 25)
star_frst.gat,57,123,0	warp	#JQ_SE_cffin	2,2,star_in.gat,182,77 //star_frst.gat from_pos=(57, 121)
star_in.gat,180,72,0	warp	#JQ_SE_cffout	2,2,star_frst.gat,57,118 //star_in.gat from_pos=(180, 74)
star_frst.gat,150,176,0	script	#JQ_SE_sunin	45,2,2,{/* 12930 */
	if(CHANGE_SE == 11) {
		mes "‐中から大きな声が聞こえてくる‐";
		next;
		mes "[ミカ]";
		mes "真面目に修業もしないで！";
		mes "弟子たちには目もくれず！";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ミカ]";
		mes "チョウジ師範が長く席を空けている今こそ、";
		mes "私たち三人が正しく行動しないと、";
		mes "師範が帰った時に面目が";
		mes "立たないじゃありませんか！";
		next;
		mes "[ギンガ]";
		mes "師範はもう帰って来ないんじゃない？";
		mes "何年も過ぎたのに便りもないじゃないか。";
		cutin "se_star03.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "四万六千三百七十五、四万六千三百七十六……";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "だからこそ、より責任感を持って";
		mes "行動して欲しいのですよ！";
		mes "誰よりも優れた才能を持っていながら、";
		mes "なぜそれを腐らせるのですか！";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "えぇ～、特に努力しなくても";
		mes "十分強いじゃない。";
		mes "どうぜ努力しても、あんまり差はないでしょう。";
		cutin "se_star01.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "四万六千三百九十三、四万六千三百九十四……";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "師範代の中のトップである者が、";
		mes "そんなに遊んでばかりじゃ、";
		mes "他の弟子たちがどう思いますか？";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "ミカ師範代は気にしすぎなんだよ。";
		cutin "se_star02_1.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "四万六千四百！";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "ニッコウ殿も、何か言ってください……。";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "……";
		mes "見たか？";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "なにを？";
		cutin "se_star01.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "やっと……";
		mes "やっと完璧な紅焔脚が完成したのじゃ！";
		mes "急いでおじさまに知らせなくては！";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[ミカ]";
		mes "……おじさまとは？";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "チョウジのおじさまに決まってるのじゃ！";
		cutin "se_sun02.bmp", 2;
		next;
		mes "[ミカ]";
		mes "ニッコウ殿は、チョウジ師範が";
		mes "今どこにおられるかご存じでしたか？";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "うん？";
		mes "おじさまなら、";
		mes "この山の下の方にいるじゃないか。";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[ミカ]";
		mes "はい？";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[ギンガ]";
		mes "なに？！";
		cutin "se_star03.bmp", 2;
		next;
		mes "[ニッコウ]";
		mes "この何年も流星林にはいらっしゃらないで、";
		mes "山の下にいらっしゃるのじゃ。";
		mes "わらわがフェイヨンに寄る度、";
		mes "お土産でおもちを差し上げたのじゃ。";
		cutin "se_sun02.bmp", 2;
		next;
		mes "[ミカ]";
		mes "なんで……どうして……";
		mes "ニッコウ殿、";
		mes "いったいどういうことなのか";
		mes "話してください。";
		cutin "se_moon02.bmp", 2;
		next;
		cutin "se_moon02.bmp", 255;
		mes "‐これ以上聞く必要はなさそうだ。";
		mes "^ff0000チョウジ師範が、山の下^000000にいるらしいので";
		mes "山を下りてみよう‐";
		delquest 11583;
		setquest 11584;	// state=1
		set CHANGE_SE,12;
		close;
	}
	else if(CHANGE_SE == 12) {
		mes "‐これ以上聞く必要はなさそうだ。";
		mes "^ff0000チョウジ師範が、山の下^000000にいるらしいので";
		mes "山を下りてみよう‐";
		close;
	}
	warp "star_in.gat",102,72;
	end;
}
star_in.gat,106,72,0	warp	#JQ_SE_sunout	2,2,star_frst.gat,152,170 //star_in.gat from_pos=(104, 72)
star_frst.gat,68,173,0	warp	#JQ_SE_mnin	2,2,star_in.gat,143,61 //star_frst.gat from_pos=(70, 173)
star_in.gat,147,61,0	warp	#JQ_SE_mnout	2,2,star_frst.gat,71,173 //star_in.gat from_pos=(145, 61)
star_frst.gat,111,173,0	warp	#JQ_SE_enin	2,2,star_in.gat,133,12 //star_frst.gat from_pos=(110, 172)
star_in.gat,130,12,0	warp	#JQ_SE_enout	2,2,star_frst.gat,107,173 //star_in.gat from_pos=(132, 12)
star_frst.gat,29,176,0	warp	#JQ_SE_w1_i	2,2,star_in.gat,7,83 //star_frst.gat from_pos=(29, 174)
star_in.gat,10,80,0	warp	#JQ_SE_w1_o	2,2,star_frst.gat,29,169 //star_in.gat from_pos=(10, 82)
star_frst.gat,30,131,0	warp	#JQ_SE_w2_i	2,2,star_in.gat,12,51 //star_frst.gat from_pos=(32, 131)
star_in.gat,17,51,0	warp	#JQ_SE_w2_o	2,2,star_frst.gat,35,133 //star_in.gat from_pos=(15, 52)
star_frst.gat,33,106,0	warp	#JQ_SE_w3_i	2,2,star_in.gat,13,133 //star_frst.gat from_pos=(35, 106)
star_in.gat,13,139,0	warp	#JQ_SE_w3_o	2,2,star_frst.gat,34,112 //star_in.gat from_pos=(13, 137)
star_frst.gat,60,107,0	warp	#JQ_SE_w4_i	2,2,star_in.gat,11,12 //star_frst.gat from_pos=(60, 109)
star_in.gat,10,17,0	warp	#JQ_SE_w4_o	2,2,star_frst.gat,60,111 //star_in.gat from_pos=(10, 15)
star_frst.gat,111,119,0	warp	#JQ_SE_w5_i	2,2,star_in.gat,176,11 //star_frst.gat from_pos=(110, 119)
star_in.gat,172,10,0	warp	#JQ_SE_w5_o	2,2,star_frst.gat,111,115 //star_in.gat from_pos=(174, 10)
star_frst.gat,131,80,0	warp	#JQ_SE_w6_i	2,2,star_in.gat,46,10 //star_frst.gat from_pos=(129, 80)
star_in.gat,42,10,0	warp	#JQ_SE_w6_o	2,2,star_frst.gat,127,80 //star_in.gat from_pos=(44, 10)
star_frst.gat,90,166,0	warp	#JQ_SE_w7_i	2,2,star_in.gat,56,54 //star_frst.gat from_pos=(89, 166)
star_in.gat,56,50,0	warp	#JQ_SE_w7_o	2,2,star_frst.gat,90,163 //star_in.gat from_pos=(56, 52)
star_frst.gat,172,133,0	warp	#JQ_SE_w8_i	2,2,star_in.gat,92,9 //star_frst.gat from_pos=(170, 133)
star_in.gat,86,8,0	warp	#JQ_SE_w8_o	2,2,star_frst.gat,167,133 //star_in.gat from_pos=(88, 8)

star_in.gat,144,46,5	script	倉庫#JQ_SE1	464,{/* 12952 */
	mes "‐どの倉庫を開きますか？";
	mes "　利用料金は0Zenyです‐";
	next;
	switch(select("^0000FFメイン倉庫^000000を開く","^FF0000サブ倉庫1^000000を開く","^FF0000サブ倉庫2^000000を開く","^FF0000サブ倉庫3^000000を開く","倉庫を開かない")) {
	case 1:
		mes "‐メイン倉庫を開きます‐";
		close2;
		openstorage;
		end;
	default:
		mes "‐倉庫を開くのをやめた‐";
		close;
	}
}
star_frst.gat,151,44,5	script	倉庫#JQ_SE2	464,{/* 12953 */
	mes "‐どの倉庫を開きますか？";
	mes "　利用料金は0Zenyです‐";
	next;
	switch(select("^0000FFメイン倉庫^000000を開く","^FF0000サブ倉庫1^000000を開く","^FF0000サブ倉庫2^000000を開く","^FF0000サブ倉庫3^000000を開く","倉庫を開かない")) {
	case 1:
		mes "‐メイン倉庫を開きます‐";
		close2;
		openstorage;
		end;
	default:
		mes "‐倉庫を開くのをやめた‐";
		close;
	}
}
star_in.gat,96,65,5	script	倉庫#JQ_SE3	464,{/* 12954 */
	mes "‐どの倉庫を開きますか？";
	mes "　利用料金は0Zenyです‐";
	next;
	switch(select("^0000FFメイン倉庫^000000を開く","^FF0000サブ倉庫1^000000を開く","^FF0000サブ倉庫2^000000を開く","^FF0000サブ倉庫3^000000を開く","倉庫を開かない")) {
	case 1:
		mes "‐メイン倉庫を開きます‐";
		close2;
		openstorage;
		end;
	default:
		mes "‐倉庫を開くのをやめた‐";
		close;
	}
}
