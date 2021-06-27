//====================================================================
//Ragnarok Online - SoulReaper Jobchange Script	by refis
//
//　■ CHANGE_SR -> 0～10
//====================================================================

pay_fild08.gat,51,82,0	script	#s_wp001	139,6,6,{/* 10723 */
	if(Job == Job_Linker && BaseLevel >= 99 && JobLevel >= 50) {
		if(CHANGE_SR == 0) {
			cloakoffnpc "ハンニャ#s0001";	// 10728
			cloakoffnpc "若旦那#s0001";	// 10724
			cloakoffnpc "下足番#s0001";	// 10725
			cloakoffnpc "支配人#s0001";	// 10726
			cloakoffnpc "番頭#s0001";	// 10727
			unittalk getnpcid(0,"ハンニャ#s0001"),"ハンニャ : 逃げようとしてたんじゃありません！　泥棒を捕まえないと！　私の包みが……。";	// 10728
			setquest 12442;	// state=1
			set CHANGE_SR,1;
		}
		else if(CHANGE_SR == 1) {
			cloakoffnpc "ハンニャ#s0001";	// 10728
			cloakoffnpc "若旦那#s0001";	// 10724
			cloakoffnpc "下足番#s0001";	// 10725
			cloakoffnpc "支配人#s0001";	// 10726
			cloakoffnpc "番頭#s0001";	// 10727
			unittalk getnpcid(0,"ハンニャ#s0001"),"ハンニャ : 逃げようとしてたんじゃありません！　泥棒を捕まえないと！　私の包みが……。";	// 10728
		}
		else if(CHANGE_SR == 2) {
			mes "‐ハンニャが連れていかれた。";
			mes "ついて行こう‐";
			close2;
			warp "payon.gat", 190, 94;
		}
		else {
			cloakonnpc "ハンニャ#s0001";	// 10728
			cloakonnpc "若旦那#s0001";	// 10724
			cloakonnpc "下足番#s0001";	// 10725
			cloakonnpc "支配人#s0001";	// 10726
			cloakonnpc "番頭#s0001";	// 10727
		}
	}
	end;
}

pay_fild08.gat,49,84,5	script	若旦那#s0001	88,{/* 10724 (cloaking)*/
	mes "[若旦那]";
	mes "俺たちは山賊じゃない。";
	mes "このハンニャってやつが";
	mes "うちの旅館に溜まったツケを支払わず";
	mes "逃げ出そうとしたから捕まえただけだよ。";
	mes "関係ないなら構わないでくれ。";
	close2;
	unittalk "若旦那 : おい、早く溜まったツケを払いな。";	// 10724
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,49,80,7	script	下足番#s0001	88,{/* 10725 (cloaking)*/
	mes "[下足番]";
	mes "なんだ？　ハンニャの一味か？";
	mes "あんたが代わりに";
	mes "Zenyを払ってくれるのかい？";
	mes "そうじゃないならさっさと失せな！";
	close2;
	unittalk "下足番 : 平和的に解決しましょうよ、あんちゃん。";	// 10725
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,53,80,1	script	支配人#s0001	88,{/* 10726 (cloaking)*/
	mes "[支配人]";
	mes "こいつがうちの店で飲み食いしただけで";
	mes "10万Zenyを超えてるんだ。";
	mes "ツケとくのもほどほどにしなきゃ！";
	close2;
	unittalk "支配人 : Zenyはちゃんと持ってる？　無ければ働いてもらわないとな。";	// 10726
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,53,84,3	script	番頭#s0001	88,{/* 10727 (cloaking)*/
	mes "[番頭]";
	mes "あんたが代わりにツケを払うつもり？";
	mes "全部支払えたら見逃してあげるよ。";
	close2;
	unittalk "番頭 : ツケは払わなくちゃな～";	// 10727
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,51,82,7	script	ハンニャ#s0001	10295,{/* 10728 (cloaking)*/
	if(CHANGE_SR == 1) {
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "なんですか？　あなたも借金取りですか？";
		mes "旅館であなたのような人は";
		mes "見かけませんでしたが。";
		next;
		menu "借金？",-;
		mes "[ハンニャ]";
		mes "関係ないなら後にしてくれませんか？";
		mes "ご覧の通り、今はちょっと";
		mes "立て込んでいまして……。";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[番頭]";
		mes "見たところ冒険者みたいだな。";
		mes "別にやましいことをしているわけじゃない。";
		mes "こいつの溜まったツケを";
		mes "取り立ててるだけなんで、";
		mes "お互い角を立てずに済ませましょうや。";
		next;
		if(select("詳しい事情を聴く","立ち去る") == 2) {
			mes "[下足番]";
			mes "そうそう、それでいい！";
			mes "こんなごろつきに関わって";
			mes "いいことなんて無いからね。";
			close;
		}
		mes "[支配人]";
		mes "事情というほどのことでもない。";
		mes "こいつは^0000ffハンニャ^000000というんだが、";
		mes "十日以上うちの旅館に泊まって";
		mes "飲み食いしたくせに、";
		mes "今朝こっそり窓から逃げ出そうとした。";
		mes "そこを俺たちが捕まえたんだ。";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "逃げ出すだなんて……。";
		mes "私の包みを盗んだ泥棒を";
		mes "追いかけようとしただけです!!";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[下足番]";
		mes "はいはい、わかったわかった。";
		mes "定番の言い訳ですね～。";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "本当なんです！";
		mes "ツケを踏み倒そうとなんてしてません！";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[支配人]";
		mes "とりあえず旅館に戻って、";
		mes "これからのことをゆっくり話しましょうや。";
		mes "うちで働くのは思ったより悪くないよ。";
		next;
		mes "[番頭]";
		mes "ここにいる下足番も、";
		mes "昔旅館で食い逃げして捕まったんだが、";
		mes "今はこんなにも真人間になってるよ。";
		next;
		mes "[下足番]";
		mes "ちょっと、昔話はやめましょうよ、兄貴。";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "泥棒を捕まえたらすぐ払います！";
		mes "まだそう遠くには行っていないはずです！";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[支配人]";
		mes "うるさいなぁ～。";
		mes "逃げようって魂胆が見え見えなんだよ。";
		mes "うちの旅館まで大人しくついて来な。";
		next;
		delquest 12442;
		setquest 12443;	// state=1
		set CHANGE_SR,2;
		cloakonnpc "ハンニャ#s0001";	// 10728
		cloakonnpc "若旦那#s0001";	// 10724
		cloakonnpc "下足番#s0001";	// 10725
		cloakonnpc "支配人#s0001";	// 10726
		cloakonnpc "番頭#s0001";	// 10727
		mes "‐どうも様子が気になる。";
		mes "　彼らが立ち去った後、";
		mes "　あなたはフェイヨンの旅館に向かった‐";
		close2;
		warp "payon.gat", 190, 94;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,192,90,0	script	#s_wp002	139,14,14,{/* 10729 */
	if(CHANGE_SR == 2) {
		cloakoffnpc "ハンニャ#s0002";	// 10732
		cloakonnpc "ミャオコ#s0002";	// 10735
		cloakonnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "若旦那#s0002";	// 10730
		cloakonnpc "おちびちゃん#s00022";	// 10733
		cloakonnpc "若旦那#s00022";	// 10731
	}
	else if(CHANGE_SR == 3) {
		cloakonnpc "ハンニャ#s0002";	// 10732
		cloakoffnpc "ミャオコ#s0002";	// 10735
		cloakonnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "若旦那#s0002";	// 10730
		cloakonnpc "おちびちゃん#s00022";	// 10733
		cloakonnpc "若旦那#s00022";	// 10731
	}
	else if(CHANGE_SR == 4) {
		cloakoffnpc "ハンニャ#s0002";	// 10732
		cloakonnpc "ミャオコ#s0002";	// 10735
		cloakonnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "若旦那#s0002";	// 10730
		cloakonnpc "おちびちゃん#s00022";	// 10733
		cloakonnpc "若旦那#s00022";	// 10731
	}
	else if(CHANGE_SR == 5) {
		cloakoffnpc "ハンニャ#s0002";	// 10732
		cloakonnpc "ミャオコ#s0002";	// 10735
		cloakoffnpc "おちびちゃん#s0002";	// 10734
		cloakoffnpc "若旦那#s0002";	// 10730
		cloakonnpc "おちびちゃん#s00022";	// 10733
		cloakonnpc "若旦那#s00022";	// 10731
	}
	else if(CHANGE_SR == 6) {
		cloakoffnpc "ハンニャ#s0002";	// 10732
		cloakonnpc "ミャオコ#s0002";	// 10735
		cloakonnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "若旦那#s0002";	// 10730
		cloakonnpc "おちびちゃん#s00022";	// 10733
		cloakonnpc "若旦那#s00022";	// 10731
	}
	end;
}

payon.gat,190,95,5	script	若旦那#s0002	88,{/* 10730 (cloaking)*/
	mes "[若旦那]";
	mes "なんだ？　あんたとは話すことねぇよ。";
	close;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,190,95,4	script	若旦那#s00022	88,{/* 10731 (cloaking)*/
	mes "[若旦那]";
	mes "なんだ？　あんたとは話すことねぇよ。";
	close;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,192,90,1	script	ハンニャ#s0002	10295,{/* 10732 (cloaking)*/
	if(CHANGE_SR == 2) {
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "いらっしゃいま……";
		next;
		menu "挨拶する",-;
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "はは……。";
		mes "あの時の方でしたか。";
		mes "……私の包みが盗まれたせいで、";
		mes "ここで働くことになってしまいました。";
		next;
		menu "泥棒は？",-;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "きっと私の泊まった部屋の状況を";
		mes "よく把握した者の仕業です。";
		mes "あやしい気配を感じ、目が覚めた時は";
		mes "既に誰かが私の包みを取り";
		mes "窓から逃げ出していました。";
		next;
		menu "包みの中身は？",-;
		mes "[ハンニャ]";
		mes "旅行のためのお金と、";
		mes "私の職業に関する貴重な宝物が入ってます。";
		mes "お金も大事ですが、その宝物が";
		mes "他人の手に渡ると本当に困ります……。";
		next;
		cutin "soul_van03.bmp", 255;
		cloakoffnpc "若旦那#s0002";	// 10730
		mes "[若旦那]";
		mes "よぉ、ハンニャ。なに油を売っている！";
		mes "かわやに溜まってるのを";
		mes "綺麗にしとけと言っただろ。";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "とにかく今は仕事をしなくてはいけません。";
		mes "失礼します。";
		close2;
		cutin "soul_van02.bmp", 255;
		cloakonnpc "若旦那#s0002";	// 10730
		cloakonnpc "ハンニャ#s0002";	// 10732
		cloakoffnpc "おちびちゃん#s0002";	// 10734
		unittalk getnpcid(0,"おちびちゃん#s0002"),"おちびちゃん : ウチ、盗んだ奴ら知ってるの……。";	// 10734
		end;
	}
	else if(CHANGE_SR == 4) {
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "いらっしゃいま……";
		next;
		menu "包みを見せる",-;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "あっ！　これは……";
		mes "大法用薬剤と招魂扇！";
		mes "私の包みに間違いありません……。";
		mes "これをどこで？";
		next;
		menu "それより盗んだ犯人の方が気になりませんか？",-;
		mes "[ハンニャ]";
		mes "もちろん気になります。";
		mes "いったい誰がこんなことを！";
		next;
		cutin "soul_van03.bmp", 255;
		hideoffnpc "若旦那#s0002";	// 10730
		mes "[若旦那]";
		mes "ハンニャ、また油を売っているな？";
		mes "仕事はちゃんとやれよ。";
		next;
		menu "ちょうど犯人が現れましたね",-;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "若旦那が泥棒ですって？";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[若旦那]";
		mes "おいおい、自分の言った言葉には";
		mes "ちゃんと責任を取れよ？";
		mes "何の証拠もなく泥棒扱いしたら、";
		mes "どうなるかわかってるだろうな？";
		close2;
		cloakoffnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "ミャオコ#s0002";	// 10735
		unittalk getnpcid(0,"おちびちゃん#s0002"),"ミャオコ : ウチ、見たの！　この人と下足番が包みを埋めてたの！";	// 10734
		delquest 12445;
		setquest 12446;	// state=1
		set CHANGE_SR,5;
		end;
	}
	else if(CHANGE_SR == 5) {
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "そこのお嬢さんの話を聞いてみましょう。";
		mes "唯一の証人ですから。";
		close2;
		hideoffnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "おちびちゃん#s00022";	// 10733
		cutin "soul_van01.bmp", 255;
		end;
	}
	else if(CHANGE_SR == 6) {
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "旅のお方、";
		mes "あなたとはまだ話したいことがございます。";
		mes "この町の北側へ通じる出入口まで";
		mes "ついて来ていただけないでしょうか？";
		next;
		cutin "soul_van01.bmp", 255;
		cloakonnpc "ハンニャ#s0002";	// 10732
		mes "‐あなたはハンニャの後を";
		mes "　ついて行くことにした‐";
		close2;
		warp "payon.gat", 238, 291;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,187,94,7	script	おちびちゃん#s00022	96,{/* 10733 (cloaking)*/
	cloakoffnpc "おちびちゃん#s0002";	// 10734
	cloakonnpc "おちびちゃん#s00022";	// 10733
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,187,94,5	script	おちびちゃん#s0002	96,{/* 10734 (cloaking)*/
	if(CHANGE_SR == 2) {
		mes "[おちびちゃん]";
		mes "ウチ、盗んだ奴ら知ってるの……";
		mes "凄い悪者なの……。";
		next;
		menu "おちびちゃん、今なんと言ったの？",-;
		mes "[ミャオコ]";
		mes "ウチ、おちびちゃんじゃないの。";
		mes "ミャオコっていうの。";
		mes "あのお姉さんの包み、";
		mes "盗んだ奴ら知ってるの……。";
		next;
		if(select("誰が盗んだか見た？","お姉さん？") == 2) {
			mes "[ミャオコ]";
			mes "お姉さんは、";
			mes "さっきのソウルリーパーのお姉さんなの。";
			next;
		}
		mes "[ミャオコ]";
		mes "あのお姉さんが寝てる間に、";
		mes "若旦那と下足番が包みを盗んで埋めたの。";
		mes "板前が睡眠薬を食事に混ぜて、";
		mes "番頭は見張ってたの……。";
		next;
		menu "包みはどうなった？",-;
		mes "[ミャオコ]";
		mes "ウチ、包みの場所わかるの……。";
		mes "案内してあげるの……。";
		close2;
		cloakonnpc "おちびちゃん#s0002";	// 10734
		cloakoffnpc "ミャオコ#s0002";	// 10735
		end;
	}
	else if(CHANGE_SR == 5) {
		cloakonnpc "おちびちゃん#s0002";	// 10734
		cloakoffnpc "おちびちゃん#s00022";	// 10733
		mes "[ミャオコ]";
		mes "ウチはっきり見たの！　この人が盗んだの！";
		next;
		cloakonnpc "若旦那#s0002";	// 10730
		cloakoffnpc "若旦那#s00022";	// 10731
		mes "[若旦那]";
		mes "おい、ちびっ子。";
		mes "自分の言葉に責任取れるのかい？";
		next;
		cloakoffnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "おちびちゃん#s00022";	// 10733
		mes "[ミャオコ]";
		mes "ウチ、ちびっ子じゃないもん！";
		mes "嘘もつかないの！　はっきり見たの！";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "ありがとう、お嬢さん。";
		mes "大丈夫だよ。";
		mes "この招魂扇で";
		mes "直接聞いてみようじゃないか。";
		next;
		cutin "soul_van03.bmp", 255;
		cloakoffnpc "若旦那#s0002";	// 10730
		cloakonnpc "若旦那#s00022";	// 10731
		mes "[若旦那]";
		mes "な……なんだ。何をしている!?";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[ハンニャ]";
		mes "^ff00ff招魂扇の主が汝の魂に聞く。";
		mes "正直に答えるのであれば、";
		mes "魂を取ったりはしない。^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[若旦那]";
		mes "あ……ううう……お、俺に何をした！";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[ハンニャ]";
		mes "^ff00ffこの包みを盗もうとしたことはあるのか？^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[若旦那]";
		mes "う……うううう！　やめろ！";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "この招魂扇は、抵抗する者の魂を";
		mes "少しずつ食いつぶす。";
		mes "貴様の命は";
		mes "今も徐々に削られているのだ。";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[ハンニャ]";
		mes "^ff00ff助かりたいなら答えなさい人間！^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[若旦那]";
		mes "う……うううう！　お……俺は……";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "言いたくないのであれば";
		mes "無理強いはしない。";
		mes "だが、そのままだと";
		mes "魂が崩壊するだろう。";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[若旦那]";
		mes "うわああ！　俺たちが包みを盗みました！";
		mes "大事な宝が入ってると思って、つい……。";
		mes "全部白状しますから、";
		mes "どうかお助けください！";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[ハンニャ]";
		mes "^ff00ffどうして私をここで働かせようとしたのだ？^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[若旦那]";
		mes "盗んだ包みを開けてみたら、";
		mes "中から霊力の宿った物が出てきて";
		mes "怖くなりました。";
		mes "急いで埋めたところ、";
		mes "ソウルリーパー様の姿が見えたので、";
		mes "どうにか足止めしようとしただけです。";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[ハンニャ]";
		mes "^ff00ffここの従業員たちも、";
		mes "罠に嵌めて働かせたのか？^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[若旦那]";
		mes "違います！";
		mes "他の奴らは、本当に行くあてがなくて";
		mes "ここで働き始めたんです。";
		mes "命だけは助けてください。";
		mes "金でも何でも差し上げます。";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "よろしい。";
		mes "金銭的な部分は後で話そうじゃないか……。";
		next;
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "お嬢さんと旅のお方のお陰で、";
		mes "本当に助かりました。";
		mes "ありがとうございます。";
		next;
		mes "[ハンニャ]";
		mes "旅のお方、";
		mes "あなたとはまだ話したいことがございます。";
		mes "この町の北側へ通じる出入口まで";
		mes "ついて来ていただけないでしょうか？";
		next;
		delquest 12446;
		setquest 12447;	// state=1
		set CHANGE_SR,6;
		cutin "soul_van04.bmp", 255;
		cloakonnpc "ハンニャ#s0002";	// 10732
		cloakonnpc "ミャオコ#s0002";	// 10735
		cloakonnpc "おちびちゃん#s0002";	// 10734
		cloakonnpc "若旦那#s0002";	// 10730
		cloakonnpc "おちびちゃん#s00022";	// 10733
		cloakonnpc "若旦那#s00022";	// 10731
		mes "‐あなたはハンニャの後を";
		mes "　ついて行くことにした‐";
		close2;
		warp "payon.gat", 238, 291;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,187,94,5	script	ミャオコ#s0002	876,{/* 10735 (cloaking)*/
	if(CHANGE_SR == 2) {
		mes "[ミャオコ]";
		mes "ウチの後について来ればいいの……。";
		next;
		menu "猫に変わった!!",-;
		mes "[ミャオコ]";
		mes "驚くことないの……";
		mes "ただついて来ればいいの……。";
		next;
		delquest 12443;
		setquest 12444;	// state=1
		set CHANGE_SR,3;
		cloakonnpc "ミャオコ#s0002";	// 10735
		mes "‐ミャオコの後について行こう‐";
		close2;
		warp "pay_fild08.gat", 55, 121;
		end;
	}
	else if(CHANGE_SR == 3) {
		mes "[ミャオコ]";
		mes "ウチの後について来ればいいの……。";
		next;
		menu "猫に変わった!!",-;
		mes "[ミャオコ]";
		mes "驚くことないの……";
		mes "ただついて来ればいいの……。";
		next;
		cloakonnpc "ミャオコ#s0002";	// 10735
		mes "‐ミャオコの後について行こう‐";
		close2;
		warp "pay_fild08.gat", 55, 121;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,56,126,0	script	#s_wp003	139,14,14,{/* 10736 */
	if(CHANGE_SR == 3 || CHANGE_SR == 4) {
		cloakoffnpc "ミャオコ#s0003";	// 10737
	}
	end;
}
pay_fild08.gat,56,126,1	script	ミャオコ#s0003	876,{/* 10737 (cloaking)*/
	if(CHANGE_SR == 3) {
		mes "[ミャオコ]";
		mes "ここなの、ここ……";
		mes "ここを掘ればいいの……。";
		next;
		misceffect 14,"埋土#s0003";	// 10738
		mes "‐掘りながら話を聞くことにした‐";
		next;
		menu "ハンニャという男とは知り合い？",-;
		mes "[ミャオコ]";
		mes "あれ？　男なの……？";
		mes "やっぱり女だと思うの。";
		mes "ウチが死にそうだった時、";
		mes "助けてくれた良いお姉さんなの……";
		mes "だから恩を返そうとしただけなの。";
		next;
		menu "旅館の従業員たちが本当に泥棒？",-;
		mes "[ミャオコ]";
		mes "あの人間たちが、";
		mes "ハンニャのお姉さんを罠に嵌めたの。";
		mes "ウチにはそれ以上分からないし……";
		mes "どうしてやったかは、直接聞くしかないの。";
		next;
		mes "‐包みを見つけた。";
		mes "　中には霊力の宿った価値がありそうな";
		mes "　扇が入っているようだ。";
		mes "　ハンニャに確認しに行こう‐";
		delquest 12444;
		setquest 12445;	// state=1
		set CHANGE_SR,4;
		close2;
		warp "payon.gat", 190, 94;
		end;
	}
	else if(CHANGE_SR == 4) {
		mes "[ミャオコ]";
		mes "包みをお姉さんに";
		mes "届けようなの……。";
		close2;
		warp "payon.gat", 190, 94;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,53,128,0	script	埋土#s0003	844,{/* 10738 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,241,294,0	script	#s_wp004	139,14,14,{/* 10739 */
	if(CHANGE_SR == 6) {
		cloakonnpc "ハンニャ#s0004";	// 10741
		cloakonnpc "ハンニャ#s0005";	// 10742
		cloakonnpc "ミャオコ#s0004";	// 10740
		cloakoffnpc "ハンニャ#s0004";	// 10741
	}
	else if(CHANGE_SR == 7) {
		cloakonnpc "ハンニャ#s0004";	// 10741
		cloakonnpc "ハンニャ#s0005";	// 10742
		cloakonnpc "ミャオコ#s0004";	// 10740
		cloakoffnpc "ハンニャ#s0004";	// 10741
		cloakoffnpc "ミャオコ#s0004";	// 10740
	}
	else if(CHANGE_SR == 8 || CHANGE_SR == 9 || CHANGE_SR == 10) {
		cloakonnpc "ハンニャ#s0004";	// 10741
		cloakonnpc "ハンニャ#s0005";	// 10742
		cloakonnpc "ミャオコ#s0004";	// 10740
		cloakoffnpc "ハンニャ#s0005";	// 10742
	}
	end;
}

payon.gat,242,292,4	script	ミャオコ#s0004	876,{/* 10740 (cloaking)*/
	mes "[ミャオコ]";
	mes "ウチが案内するの……。";
	mes "知ってる場所しか案内できないから、";
	mes "見つからなかったら";
	mes "頑張って探してほしいの……。";
	mes "こわ～いモンスターがいるけど";
	mes "準備はいい？";
	next;
	if(select("いいよ","自分で行く") == 2) {
		mes "[ミャオコ]";
		mes "みゃ～お……。";
		mes "ウチも手伝いたいの……。";
		close;
	}
	mes "[ミャオコ]";
	mes "ウチの尻尾をしっかり掴むの……。";
	mes "出発なの……。";
	close2;
	warp "pay_dun03.gat", 123, 62;
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,241,294,3	script	ハンニャ#s0004	10295,{/* 10741 (cloaking)*/
	if(CHANGE_SR == 6) {
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "ここまでいらしてくださるとは、";
		mes "流石は見込んだ通りのお方です。";
		next;
		menu "どういう意味ですか？",-;
		mes "[ハンニャ]";
		mes "少女の姿に変身する";
		mes "しゃべる猫をご覧になりましたよね？";
		mes "あれは私に付きまといながら";
		mes "楽しんでいる霊獣です。";
		mes "猫の姿の時は普通の人間には";
		mes "見えないはずですが、あなたには見えた。";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "私が失くした包みの中の";
		mes "宝物を見ても動じない。";
		mes "私が長年探し求めたお方です。";
		mes "強き精神力の持ち主で、";
		mes "欲に溺れないお方……。";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "突然こんなことをお願いするなんて";
		mes "図々しいかもしれませんが、";
		mes "私の長き宿願だった招魂大法の手伝いを";
		mes "していただけないでしょうか？";
		next;
		menu "私は招魂大法を知りませんが？",-;
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "澄んだ魂をお持ちのソウルリンカーである";
		mes "あなたであれば問題ありません。";
		mes "魂の強さが一段階上に昇る";
		mes "よい経験にもなると思います。";
		mes "助けていただけますか？";
		next;
		menu "最後までお付き合いしましょう",-;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "ありがとうございます。";
		mes "招魂大法の儀式をするには";
		mes "九尾狐から^ff0000狐の尻尾^000000を";
		mes "集めなければなりません。";
		mes "数は^ff00004個^000000必要になります。";
		next;
		cutin "soul_van01.bmp", 255;
		cloakoffnpc "ミャオコ#s0004";	// 10740
		mes "[ミャオコ]";
		mes "人間……";
		mes "さっきは信じてついて来てくれて";
		mes "ありがとうなの……。";
		mes "ウチも手伝いたいの。";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "これはお嬢さん、よろしくお願いします。";
		mes "私はここで招魂大法の準備にかかります。";
		mes "案内はお嬢さんに任せます。";
		delquest 12447;
		setquest 12448;	// state=1
		set CHANGE_SR,7;
		next;
		cutin "soul_van02.bmp", 255;
		mes "[ミャオコ]";
		mes "ウチが案内するの……。";
		mes "知ってる場所しか案内できないから、";
		mes "見つからなかったら";
		mes "頑張って探してほしいの……。";
		mes "こわ～いモンスターがいるけど";
		mes "準備はいい？";
		next;
		if(select("いいよ","自分で行く") == 2) {
			mes "[ミャオコ]";
			mes "みゃ～お……。";
			mes "ウチも手伝いたいの……。";
			close;
		}
		mes "[ミャオコ]";
		mes "ウチの尻尾をしっかり掴むの……。";
		mes "出発なの……。";
		close2;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	else if(CHANGE_SR == 7) {
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "私はここで招魂大法の準備にかかりますので";
		mes "^0000ff狐の尻尾を4個^000000お願いします。";
		mes "案内はお嬢さんに任せます。";
		next;
		cutin "soul_van02.bmp", 255;
		mes "[ミャオコ]";
		mes "ウチが案内するの……。";
		mes "知ってる場所しか案内できないから、";
		mes "見つからなかったら";
		mes "頑張って探してほしいの……。";
		mes "こわ～いモンスターがいるけど";
		mes "準備はいい？";
		next;
		if(select("いいよ","自分で行く") == 2) {
			mes "[ミャオコ]";
			mes "みゃ～お……。";
			mes "ウチも手伝いたいの……。";
			close;
		}
		mes "[ミャオコ]";
		mes "ウチの尻尾をしっかり掴むの……。";
		mes "出発なの……。";
		close2;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,241,294,3	script	ハンニャ#s0005	10295,{/* 10742 (cloaking)*/
	if(CHANGE_SR == 8) {
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "狐の尻尾はミャオコから受け取りました。";
		mes "招魂大法を始めたいと思います。";
		next;
		menu "どのような儀式ですか？",-;
		mes "[ハンニャ]";
		mes "次の段階も旅のお方に";
		mes "助けを求めるつもりでした。";
		mes "正直に話します。";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "幼い頃、^ff0088ソウルリーパー^000000への境地に至る";
		mes "古文を見つけた私と弟は、";
		mes "今まで試したことがない招魂大法に挑みました。";
		next;
		mes "[ハンニャ]";
		mes "自分の実力を過信していた";
		mes "私たちは大失敗してしまい、";
		mes "弟の精神と私の体に";
		mes "大きな問題が発生しました。";
		next;
		mes "[ハンニャ]";
		mes "巨大で歪んだ気の嵐が";
		mes "私の肉体を粉々にし、飛ばされた魂は";
		mes "弟の身体に宿りました。";
		mes "今ここにいる肉体は、私の弟のものです。";
		mes "そして弟の魂は精神世界のどこかへ";
		mes "封印されてしまいました。";
		cutin "soul_van02.bmp", 2;
		next;
		menu "そんなことが……",-;
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "旅のお方、私はこの肉体の精神世界には";
		mes "入ることができません。";
		mes "だけど高潔な魂の持ち主のあなたなら、";
		mes "招魂大法を使って入れるはずです。";
		mes "精神世界の中を彷徨っている弟の魂を、";
		mes "どうか……取り戻してください。";
		next;
		menu "やります",-;
		mes "[ハンニャ]";
		mes "ありがとうございます。";
		mes "心の準備が整いましたら、";
		mes "招魂大法を始めますので";
		mes "私に話しかけてください。";
		delquest 12449;
		setquest 12450;	// state=1
		set CHANGE_SR,9;
		close2;
		cutin "soul_van03.bmp", 255;
		end;
	}
	else if(CHANGE_SR == 9) {
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "魂の入口を先に作成した後、";
		mes "招魂大法を開始してください。";
		next;
		switch(select("魂の入口　作成","招魂大法の開始","やめる")) {
		case 1:
			if(getonlinepartymember() != 1 || getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[ハンニャ]";
				mes "1人パーティーを結成し、";
				mes "パーティーリーダーになって";
				mes "招魂大法を進行してください。";
				close2;
				cutin "soul_van03.bmp", 255;
				end;
			}
			mdcreate "Spiritualism";
			mes "[ハンニャ]";
			mes "魂の入口が開通したら";
			mes "招魂大法を開始してください。";
			close2;
			cutin "soul_van03.bmp", 255;
			end;
		case 2:
			switch(mdenter("Spiritualism")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[Spiritualism] に入場しました　 : 　" +strcharinfo(1)+ "(" +strcharinfo(0)+ ")",0x9,0x00FF99;
				//warp "1@soul.gat", 80, 72;
				end;
			case 1:	// パーティー未加入
				mes "[ハンニャ]";
				mes "1人パーティーを結成し、";
				mes "パーティーリーダーになって";
				mes "招魂大法を進行してください。";
				close2;
				cutin "soul_van03.bmp", 255;
				end;
			case 2:	// ダンジョン未作成
				cutin "soul_van03.bmp", 255;
				mes "^ff0000まだ魂の入口が生成されてません。^000000";
				close;
			default:	// その他エラー
				mes "[ハンニャ]";
				mes "少し待ってください。";
				close;
			}
		case 3:
			mes "[ハンニャ]";
			mes "心の準備が終わりましたら、";
			mes "招魂大法を始めますので";
			mes "私に話しかけてください。";
			close2;
			cutin "soul_van03.bmp", 255;
			end;
		}
	}
	else if(CHANGE_SR == 10) {
		cutin "soul_van04.bmp", 2;
		mes "[ハンニャ]";
		mes "弟の魂は……。";
		next;
		menu "中での出来事を説明する",-;
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "そうでしたか。";
		mes "ソハらしい結論ですね。";
		next;
		menu "これからどうするんですか？",-;
		mes "[ハンニャ]";
		mes "弟の分まで、頑張って生きていきます。";
		mes "やるべき修行の道はまだ長いですし……。";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[ハンニャ]";
		mes "そういえば旅のお方の身体に";
		mes "大きな霊力が宿ったのが見えますね。";
		mes "あなたの魂に課せられた";
		mes "禁制を解くことが、";
		mes "私の恩返しだと思います。";
		next;
		menu "禁制とは？",-;
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "もう修行は限界に達してるのでは";
		mes "ありませんか？";
		mes "招魂大法を経験したあなたは、";
		mes "次の段階へ行けるほどの";
		mes "霊的な成長を遂げました。";
		next;
		mes "[ハンニャ]";
		mes "魂を繋げるソウルリンカーさえ";
		mes "超越する者……";
		mes "^ff0000ソウルリーパー^000000へ通じる道を";
		mes "私が開いて差し上げます。";
		next;
		mes "[ハンニャ]";
		mes "目を閉じて、しばらく私に身を委ねてください。";
		next;
		if(SkillPoint) {
			cutin "soul_van03.bmp", 2;
			mes "[ハンニャ]";
			mes "スキルポイントに未練があるようです。";
			mes "残さず、使い切ってくださいね。";
			close2;
			cutin "soul_van03.bmp", 255;
			end;
		}
		if(Weight) {
			mes "[ハンニャ]";
			mes "いろいろ持っていますね。";
			mes "所持重量を0にしてきてください。";
			mes "悪影響を及ぼしてしまいます。";
			close2;
			cutin "soul_van01.bmp", 255;
			end;
		}
		cutin "soul_van04.bmp", 2;
		mes "[ハンニャ]";
		mes "^0000ff(よく分からない呪文を唱えるハンニャ)^000000";
		mes "…";
		mes "……";
		mes "………";
		mes "禁制の壁よ。ここで崩れなさい。";
		misceffect 90,"";	// self
		jobchange Job_SoulReaper;
		resetstatus;
		resetskill;
		delquest 12451;
		setquest 202190;	// state=1
		set CHANGE_SR,0;
		next;
		cutin "soul_van01.bmp", 2;
		mes "[ハンニャ]";
		mes "今まで助けていただいたことに対する";
		mes "恩返しとしては些細なものですが、";
		mes "私にできるせめてものお礼です。";
		mes "では、あなたの行く先に、";
		mes "万物の加護が宿らんことを祈ります。";
		close2;
		cutin "soul_van01.bmp", 255;
		end;
	}
	if(Job == Job_SoulReaper) {
		cutin "soul_van03.bmp", 2;
		mes "[ハンニャ]";
		mes "それでは修行の旅に出かけます。";
		mes "魂の繋がりはありますので、";
		mes "またどこかで会うことでしょう。";
		close2;
		cloakonnpc "ハンニャ#s0005";	// 10742
		cutin "soul_van03.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_dun03.gat,119,65,0	script	#s_wp005	139,14,14,{/* 14120 */
	if(CHANGE_SR == 7 || CHANGE_SR == 8) {
		cloakoffnpc "ミャオコ#s0005";	// 14121
	}
	end;
}

pay_dun03.gat,119,65,4	script	ミャオコ#s0005	876,{/* 14121 (cloaking)*/
	if(CHANGE_SR == 7) {
		if(countitem(19719) < 4) {
			mes "[ミャオコ]";
			mes "狐の尻尾4個必要なの……。";
			close;
		}
		mes "[ミャオコ]";
		mes "これで十分なの……。";
		mes "もう外へ出ればいいの……。";
		mes "ウチの尻尾をしっかり掴むの。";
		delitem 19719,4;
		delquest 12448;
		setquest 12449;	// state=1
		set CHANGE_SR,8;
		close2;
		warp "payon.gat", 238, 291;
		end;
	}
	mes "[ミャオコ]";
	mes "これで十分なの……。";
	mes "もう外へ出ればいいの……。";
	mes "ウチの尻尾をしっかり掴むの。";
	close2;
	warp "payon.gat", 238, 291;
	end;
OnInit:
	cloakonnpc;
	end;
}

//============================================================
// メモリアルダンジョンNPC
//------------------------------------------------------------
1@soul.gat,80,72,0	script	#start_sw	139,1,1,{/* 47757 */
OnTouch:
	initnpctimer;
	hideonnpc getmdnpcname("#start_sw");	// 47757
	end;
OnTimer2000:
	announce "ハンニャ : うまく弟の精神世界へ入れたようですね。", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer5000:
	announce "ハンニャ : 視野を共有し、私もそこを感じれるようにいたしました。", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer8000:
	announce "？？ : 誰ですか？　誰か入ってきたんですか？", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer11000:
	announce "ハンニャ : この声は！　ソハ!?　ソハなのね？", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer14000:
	announce "？？ : 懐かしい声……もしかして姉上ですか？", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer17000:
	announce "ハンニャ : ソハ！　私の話をよく聞いて。今、魂の通路に入った旅のお方があなたを救い出してくれますよ。", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer22000:
	announce "ソハ : 招魂大法が失敗した時に数え切れない徘徊霊と餓鬼たちが、この精神世界に入り込みました。", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer27000:
	announce "ソハ : 彼らが魂の通路を喰い尽くすのを防ぐために、僕はわざとここに囚われる道を選びました。", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer32000:
	announce "ソハ : 僕を解放しないでください。魂の通路が餓鬼や徘徊霊に喰われてしまえば、姉上の命も危ういのです。", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer37000:
	announce "ハンニャ : そんな……すでに招魂大法は始まってしまったのよ。", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer40000:
	announce "ソハ : くっ……僕の結界の外へ餓鬼と徘徊霊たちが抜け出しはじめました。招魂大法を止めてください、姉上！", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer45000:
	announce "ハンニャ : 一度始まった招魂大法を強制的に止めると、あらゆる魂の通路が閉ざされてしまうわ。", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer51000:
	stopnpctimer;
	announce "ソハ : 通路に入っている旅のお方！　気をつけてください。徘徊霊たちがそっちへ向かっています！", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	donpcevent getmdnpcname("#MobCtrl_sw")+"::OnStart";
	end;
}

1@soul.gat,1,1,0	script	#MobCtrl_sw	139,{
OnStart:
	monster getmdmapname("1@soul.gat"),79,90,"徘徊霊#1",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled1";
	monster getmdmapname("1@soul.gat"),82,90,"徘徊霊#2",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled1";
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@soul.gat"),getmdnpcname("#MobCtrl_sw")+ "::OnKilled1");
	if('@count > 0)
		end;
	announce "ハンニャ : 旅のお方！　ご無事ですか？", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	sleep 3000;
	announce "ソハ : 物凄く強いお方なんですね。徘徊霊たちの一部が消滅したお陰で、僕の魂が少し自由になりました。", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	sleep 3000;
	announce "ソハ : しかし、まだ多くの徘徊霊と餓鬼たちが激しく揺れています。", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	sleep 3000;
	announce "ソハ : 今度はより強い奴らが魂の通路に向かってます。気をつけてください。", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	monster getmdmapname("1@soul.gat"),82,90,"徘徊霊#1",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	monster getmdmapname("1@soul.gat"),85,90,"徘徊霊#2",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	monster getmdmapname("1@soul.gat"),81,90,"徘徊霊#3",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	monster getmdmapname("1@soul.gat"),76,90,"徘徊霊#4",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@soul.gat"),getmdnpcname("#MobCtrl_sw")+ "::OnKilled2");
	if('@count > 0)
		end;
	hideoffnpc getmdnpcname("#soul04");	// 74332
	sleep 100;
	unittalk getnpcid(0,getmdnpcname("#soul04"),"ソハ : 僕の魂の一部が、魂の通路に現れはじめました。";	// 74332
	sleep 3000;
	announce "ハンニャ : もう少しで解放されるのね、ソハ！", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("#soul04"),"ソハ : 危なくなったら僕の傍に来てください。少しは役に立つでしょう。";	// 74332
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("#soul04"),"ソハ : これから残った全ての餓鬼と徘徊霊が集まるでしょう。覚悟を決めてください。";	// 74332
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"徘徊霊#1",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"餓鬼#2",1564,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"徘徊霊#3",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"餓鬼#4",1564,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"餓鬼#5",1564,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"徘徊霊#6",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@soul.gat"),getmdnpcname("#MobCtrl_sw")+ "::OnKilled3");
	if('@count > 0)
		end;
	donpcevent getmdnpcname("ソハ#soul05")+"::OnStart";
	end
}

1@soul.gat,81,80,5	script	#soul04	10043,3,3,{/* 74332 (hide)*/
	end;
OnTouch:
	npcskillsupport 28,9999;
	heal 9999,0;
	end;
}

1@soul.gat,81,80,5	script	ソハ#soul05	10295,{/* 9668 (hide)*/
	if('flag == 0) {
		cutin "soul_van02.bmp", 2;
		mes "[ソハ]";
		mes "……。";
		close2;
		cutin "soul_van02.bmp", 255;
		end;
	}
	if(CHANGE_SR == 9) {
		cutin "soul_van02.bmp", 2;
		mes "[ソハ]";
		mes "僕の姉上を助けてくださり、";
		mes "ありがとうございます。";
		mes "他人の魂の通路に入れるぐらいだから、";
		mes "本当に綺麗な魂をお持ちなんですね。";
		next;
		menu "これからどうなりますか？",-;
		cutin "soul_van01.bmp", 2;
		mes "[ソハ]";
		mes "姉上は、僕を身体に戻して";
		mes "命を絶つつもりだったんでしょうが……";
		mes "僕はそうして欲しくありません。";
		next;
		mes "[ソハ]";
		mes "外の世界に興味が無くなってから、";
		mes "何年も経ちました。";
		mes "それよりも天界へ昇り、";
		mes "新しい霊の世界を探求したいです。";
		next;
		announce "ハンニャ : ソハ……変な気は起こさず、私の魂と入れ替わりましょう。", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
		set '@dummy,sleep2(3000);
		cutin "soul_van02.bmp", 2;
		mes "[ソハ]";
		mes "はぁ……その意地っ張りな性格は、";
		mes "子供の頃から変わってないや。";
		mes "今さら魂を入れ替えても、";
		mes "あと数年も持たないことは";
		mes "ご存じのはずなのに。";
		next;
		menu "弟を想う優しい心の持ち主なのでしょう",-;
		cutin "soul_van01.bmp", 2;
		mes "[ソハ]";
		mes "僕は姉上には今まで通りに、";
		mes "修行を続けて欲しいです。";
		mes "僕は僕なりにやるべきことがありますので。";
		next;
		mes "[ソハ]";
		mes "そういえば旅のお方は、";
		mes "大きな壁を一つ乗り越えましたね。";
		mes "戻りましたら、姉上を通じて悟りを";
		mes "開いてくだされば幸いです。";
		next;
		menu "これから、どこへ向かいますか？",-;
		cutin "soul_van02.bmp", 2;
		mes "[ソハ]";
		mes "地上の業を終えた魂たちの";
		mes "集まるところへ行きます。";
		mes "きっと姉上とは";
		mes "また逢う日が来るでしょうね。";
		mes "そう伝えてください。";
		delquest 12450;
		setquest 12451;	// state=1
		set CHANGE_SR,10;
		next;
		mes "[ソハ]";
		mes "そろそろ招魂大法の効力も";
		mes "切れそうですね。";
		mes "では失礼します……。";
		close2;
		cutin "soul_van02.bmp", 255;
		warp "payon.gat", 238, 291;
		end;
	}
	cutin "soul_van02.bmp", 2;
	mes "[ソハ]";
	mes "地上の業を終えた魂たちの";
	mes "集まるところへ行きます。";
	mes "きっと姉上とは";
	mes "また逢う日が来るでしょうね。";
	mes "そう伝えてください。";
	next;
	mes "[ソハ]";
	mes "そろそろ招魂大法の効力も";
	mes "切れそうですね。";
	mes "では失礼します……。";
	close2;
	cutin "soul_van02.bmp", 255;
	warp "payon.gat", 238, 291;
	end;
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("#soul04");	// 74332
	hideoffnpc getmdnpcname("ソハ#soul05");	// 9668
	unittalk getnpcid(0,getmdnpcname("ソハ#soul05")),"ソハ : ああ……魂の通路に完全な姿でいられるのは、今回が初めてです。";	// 9668
	end;
OnTimer3000:
	announce "ハンニャ : ソハ、本当にソハだよね？", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer6000:
	unittalk getnpcid(0,"ソハ#soul05"),"ソハ : はい、姉上。もう邪悪な気配は残ってないようです。これで安心して成仏できます。";	// 9668
	end;
OnTimer9000:
	announce "ハンニャ : 何を言ってるの？　ソハ!!", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer12000:
	unittalk getnpcid(0,"ソハ#soul05"),"ソハ : 姉上はご存じのはずです。すでに10年以上も姉上の魂と同化した身体なんですよ。今さら戻ったところで長くは生きられません。";	// 9668
	end;
OnTimer15000:
	announce "ハンニャ : ソハ！　そんなこと言わないで！　……ねぇ？　聞いてる？", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer18000:
	set 'flag,1;
	stopnpctimer;
	unittalk getnpcid(0,"ソハ#soul05"),"ソハ : 姉上にはこちらの声が聞こえなくなってきたようですね。旅のお方、僕と少し話しましょう。";	// 9668
	end;
OnInit:
	hideonnpc;
	end;
}
