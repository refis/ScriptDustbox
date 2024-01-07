// EP19_1QUE
// 灰色狼の村(wolfvill.gat): 143 126

//============================================================
// 説話の地クエストNPC
//- Registry -------------------------------------------------
// EP19_1QUE -> 0～
//------------------------------------------------------------
wolfvill.gat,223,83,0	script	#ep19ev_wv	139,14,14,{/* 2496 */
OnTouch:
	if(BaseLevel >= 220 && EP18_1QUE >= 100)
		cloakoffnpc "人当たりがいい住民#ep19";
	end;
}

wolfvill.gat,223,83,3	script	人当たりがいい住民#ep19	10398,{/* 2497 */
	switch(EP19_1QUE) {
	case 0:
		if(BaseLevel < 220 || EP18_1QUE < 100) {
			// anti
			end;
		}
		mes "[人当たりがいい住民]";
		mes "あなた、ちょっと待ってくれる？";
		mes "マラムが探していたよ。";
		mes "すぐ連れてくるから待ってて。";
		next;
		mes "[人当たりがいい住民]";
		mes "そう言えば、マラムが人形と";
		mes "会話してるを見たんだけど";
		mes "あなたも同じことしてなかった？";
		mes "みんなそうやって";
		mes "ストレス解消してるの？";
		next;
		cloakoffnpc "マラム#ep19maram01";
		unittalk getnpcid(0,"マラム#ep19maram01"),"マラム : お待たせしました！";
		mes "[人当たりがいい住民]";
		mes "あ、マラムが来たみたい。";
		next;
		mes "[マラム]";
		mes "会えてよかったです。";
		mes "もしかして、待たせてしまいましたか？";
		cutin "ep18_maram_01.png", 2;
		next;
		menu "人形と会話していたの？",-;
		mes "[マラム]";
		mes "あははは、そうですね。";
		mes "人形とお話していました。";
		mes "でも、その人形は";
		mes "「スマートエリー」ですよ。";
		cutin "ep18_maram_02.png", 2;
		next;
		cloakoffnpc "ミリアム#ep19miriam01";
		cloakoffnpc "スアド#ep19suad01";
		mes "[ミリアム]";
		mes "ボクたちを集めた理由を";
		mes "教えて欲しいんだけど？";
		cutin "ep18_miriam_01.png", 0;
		next;
		mes "[スアド]";
		mes "手短に頼む。";
		mes "ニルエン様にも呼ばれているんだ。";
		cutin "ep18_suad_01.png", 0;
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "全員揃ったみたいだから説明するよ。";
		mes "小さい人形のスマートエリーが";
		mes "街の子供たちに案内させて";
		mes "ラヘルの神殿に来たんです。";
		next;
		mes "[マラム]";
		mes "スマートエリーは、あの事件の後";
		mes "バゴットが向かったと思われる";
		mes "「イスガルド」に行くための方法を";
		mes "探していたそうですが";
		mes "それについて進展があったそうです。";
		next;
		mes "[マラム]";
		mes "そのことを冒険者様にも伝えて欲しいと";
		mes "言われたので";
		mes "みんなに集まってもらいました。";
		next;
		mes "[ミリアム]";
		mes "イスガルドに行くことができれば";
		mes "奪われたユミルの心臓の欠片を";
		mes "取り戻せる……！";
		cutin "ep18_miriam_01.png", 0;
		next;
		mes "[スアド]";
		cutin "ep18_suad_01.png", 0;
		mes "イスガルドに行くためには";
		mes "どうすれば良いんだ？";
		mes "……イルシオンの奴らには借りがある。";
		next;
		mes "[ミリアム]";
		mes "まさか、スアド。";
		mes "イスガルドに乗り込むつもり？";
		mes "それは、ダメだよ。";
		mes "神殿との話し合いは誰がやるの？";
		cutin "ep18_miriam_01.png", 0;
		next;
		mes "[スアド]";
		mes "…………。";
		cutin "ep18_suad_01.png", 0;
		next;
		mes "[マラム]";
		mes "スアドの気持ちもわかるけど";
		mes "母上は今、スアドを信じて";
		mes "会議の調整を行っている。";
		mes "ここは私とミリアム、";
		mes "それに冒険者様に任せて欲しい。";
		cutin "ep18_maram_01.png", 2;
		next;
		mes "[スアド]";
		mes "……気に入らないが、仕方がない。";
		mes "お前たちに任せる。";
		cutin "ep18_suad_01.png", 0;
		next;
		mes "[ミリアム]";
		mes "それで、ボクたちはどうすれば良いの？";
		cutin "ep18_miriam_01.png", 0;
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "スマートエリーからは";
		mes "バルムント邸の本館に来て欲しいと";
		mes "言われています。";
		mes "冒険者様、申し訳ありませんが";
		mes "案内していただけませんか？";
		next;
		cutin "ep18_miriam_01.png", 255;
		setquest 18119;, showevent 0, 1, スマートエリー#ep19_000;	// 5565: 26, 266
		set EP19_1QUE,1;
		mes "‐バルムント邸へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐バルムント邸へ向かった‐";
		close2;
		warp "ba_in01.gat", 26, 266;
		end;
	case 1:
		mes "[人当たりがいい住民]";
		mes "マラムたちとどこかに";
		mes "出かけるんじゃなかったの？";
		mes "　";
		mes "‐バルムント邸へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐バルムント邸へ向かった‐";
		close2;
		warp "ba_in01.gat", 26, 266;
		end;
	default:
		mes "[人当たりがいい住民]";
		mes "あなたのことは良く知ってるよ。";
		mes "この村のために";
		mes "いろいろやってくれてありがとう！";
		close;
	}
OnInit:
	cloakonnpc;
//	if(BaseLevel >= 220 && EP18_1QUE >= 100)
//		//showevent 0, 1, 人当たりがいい住民#ep19;	// 2497: 223, 83
	end;
}

wolfvill.gat,220,85,3	script	マラム#ep19maram01	10376,{/* 2498 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,216,85,5	script	ミリアム#ep19miriam01	10377,{/* 2499 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	if(EP19_1QUE == 0) {
		mes "マラムの話を聞きましょう。";
		mes "何か大事な用があるみたいです。";
	}
	else if(EP19_1QUE == 1) {
		mes "ボクも一緒に行きます。";
		mes "ユミルの心臓の欠片を取り戻さないと。";
	}
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,213,84,5	script	スアド#ep19suad01	10378,{/* 2500 (cloaking)*/
	cutin "ep18_suad_01.png", 0;
	mes "[スアド]";
	if(EP19_1QUE == 0) {
		mes "まずはマラムの話を聞こう。";
	}
	else if(EP19_1QUE == 1) {
		mes "イルシオンの奴らには借りがあるが";
		mes "俺にはやらねばならんことがある。";
		mes "残念だが、仕方がないな……。";
	}
	close2;
	cutin "ep18_suad_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

//ba_in01.gat,26,266,3	script	スマートエリー#ep172_el	10354,{/* 5249 */}
//ba_in01.gat,26,266,3	script	スマートエリー#ep18ely0	10354,{/* 5553 (cloaking)*/}
ba_in01.gat,26,266,0	script	#ep18w11_147	139,14,14,{/* 5564 */
	switch(EP19_1QUE) {
	case 0:	// 未調査
		end;
	default:
		cloakonnpc "スマートエリー#ep172_el";
		cloakonnpc "スマートエリー#ep18ely0";
		cloakoffnpc "スマートエリー#ep19_000";
		cloakoffnpc "ジンジャー#ep19gg02";
		end;
	}
}

ba_in01.gat,26,266,3	script	スマートエリー#ep19_000	10354,{/* 5565 (cloaking)*/
	switch(EP19_1QUE) {
	case 1:
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "良いニュースをお伝えできます。";
		mes "ゲストの皆様もおいでですので";
		mes "本館の応接室にご案内いたします。";
		mes "すぐに案内いたしましょうか？";
		next;
		cutin "ep172_beta.bmp", 255;
		delquest 18119;
		setquest 130460;	//showevent 0, 1, #ep172_in01_in;	// 5331: 197, 279 showevent 0, 1, スマートエリー#ep19_000;	// 5565: 26, 266
		set EP19_1QUE,2;
		mes "‐次の目的地へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の目的地へ向かった‐";
		close2;
		warp "ba_in01.gat", 375, 102;
		end;
	case 2:
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "良いニュースをお伝えできます。";
		mes "ゲストの皆様もおいでですので";
		mes "本館の応接室にご案内いたします。";
		mes "すぐに案内いたしましょうか？";
		mes "　";
		mes "‐次の目的地へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の目的地へ向かった‐";
		close2;
		warp "ba_in01.gat", 375, 102;
		end;
	default:
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "これからはジンジャーが";
		mes "皆さんをご案内いたします。";
		mes "ジンジャーは優秀なナビゲーターなので";
		mes "皆さんの助けになるはずです。";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,375,102,0	script	#ep19evt01	139,14,14,{/* 5566 */
	switch(EP19_1QUE) {
	case 2:
	case 3:
		cloakoffnpc "スマートエリー#ep19elly";
		cloakoffnpc "レイジー#ep19lazy01";
		cloakoffnpc "クルックス#ep19crux01";
		cloakoffnpc "ミリアム#ep19miriam02";
		cloakoffnpc "マラム#ep19maram02";
		end;
	case 4:
		cloakoffnpc "クルックス#ep19crux01";
		end;
	case 5:
		end;
	}
	end;
}

ba_in01.gat,384,114,4	script	スマートエリー#ep19elly	10354,{/* 5567 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "よくおいでくださいました。";
		mes "ゲストの方々には";
		mes "私の方から説明させていただきました。";
		next;
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[クルックス]";
		mes "ご無沙汰しております。";
		mes "ルーンミッドガッツ王国の者として";
		mes "定期連絡に来た折に";
		mes "お話を聞かせていただきました。";
		next;
		cutin "16lei_01.bmp", 0;
		mes "[レイジー]";
		mes "ラヘルで大変な事があったんだって？";
		mes strcharinfo(0)+"の活躍は";
		mes "聞かせてもらったよ。";
		mes "強引に連絡係になって良かった！";
		mes "ラヘルからのお客様とも";
		mes "お知り合いになれたし！";
		next;
		mes "[レイジー]";
		mes "ラヘルのお二方は";
		mes "ジュノーには行きましたか？";
		mes "飛行船に乗り換える際に";
		mes "寄っただけ？";
		mes "なら、もう一度行かないと！";
		mes "ぜひ行ってくださ～い！";
		next;
		mes "[マラム]";
		mes "はははっ、レイジーさんは";
		mes "愉快な方ですね。";
		mes "次にジュノーを訪れる際は";
		mes "ぜひ美味しいお店を教えてください。";
		cutin "ep18_maram_02.png", 2;
		next;
		mes "[ミリアム]";
		cutin "ep18_miriam_01.png", 0;
		mes "……父から聞いた話によると";
		mes "バゴットたちには";
		mes "仲間がいるとのことでした。";
		mes "ラヘルから逃亡した後";
		mes "その仲間と合流するはずです。";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[レイジー]";
		mes "イルシオンとハートハンター御一行様は";
		mes "大賢者の御屋敷から奪った飛行船で";
		mes "北に……つまり「イスガルド」に";
		mes "向かったって話だっけ？";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "そうです。";
		mes "彼らは「ヨルムンガンド」にも";
		mes "言及していたとのことです。";
		mes "ヨルムンガンドに関わる地は";
		mes "北の大陸イスガルドだけです。";
		next;
		mes "[スマートエリー]";
		mes "しかも、イルシオンが持ち去った";
		mes "ご主人様のコレクション3号……";
		mes "正式名「飛行船ワイル1号」は";
		mes "イスガルドへの航行記録のある";
		mes "飛行船でした。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "バゴットたちはラヘルに来る前から";
		mes "イスガルドに行くことを";
		mes "計画していたのかな？";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "その可能性が高いです、新しいお客様。";
		mes "イルシオンは飛行船に保存されていた";
		mes "航路を発見し";
		mes "計画に組み込んだものと推定されます。";
		next;
		mes "[スマートエリー]";
		mes "これまでの航行経路を調べたところ";
		mes "ミッドガルド大陸のあちこちを経由し";
		mes "最終的に北に向かったことが";
		mes "確認されています。";
		close2;
		cloakoffnpc "ジンジャー#ep19gg02";
		unittalk getnpcid(0,"ジンジャー#ep19gg02"),"ジンジャー : 報告いたします。正常だや！";
		if(!sleep2(1000)) end;
		mes "[スマートエリー]";
		mes "ちょうどよいタイミングで";
		mes "登場しましたね。";
		mes "ジンジャーがテスト飛行の結果を";
		mes "お伝えします。";
		cutin "ep172_beta.bmp", 2;
		next;
		mes "[ジンジャー]";
		cutin "ep172_beta.bmp", 0;
		mes "え、通信で報告したじゃない？";
		mes "テスト飛行は正常！";
		mes "イスガルドを覆う障壁も併せて確認！";
		mes "もちろん、侵入は不可！";
		next;
		mes "[ジンジャー]";
		mes "あ、それと、障壁付近でワイル1号の";
		mes "痕跡も確認！";
		mes "それにしても、ご主人様は";
		mes "どうやってイスガルドの障壁を抜けて";
		mes "ミッドガルド大陸と往復してたんだろ？";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[レイジー]";
		mes "バルムント様は大賢者なんだから";
		mes "何か特別な方法を使ってたんじゃない？";
		mes "例えば、ユミルの心臓の欠片の力を";
		mes "使っていたとか。";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[クルックス]";
		mes "その件については";
		mes "ルーンミッドガッツ王家の方々に";
		mes "助言を求めるのはいかがでしょうか？";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[レイジー]";
		mes "ルーンミッドガッツの王家？";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[クルックス]";
		mes "ルーンミッドガッツの建国に関して";
		mes "ヨルムンガンドとは因縁があるのです。";
		next;
		mes "[マラム]";
		mes "（母上が言っておられた";
		mes "　「ヨルムンガンドの呪い」のことか）";
		cutin "ep18_maram_01.png", 2;
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[クルックス]";
		mes "実は、ゲオルグ家の方々が";
		mes "ヨルムンガンドの呪いを研究するため";
		mes "北方の地を訪れていると聞いています。";
		mes "その北方の地とは、";
		mes "イスガルドのことではないかと。";
		next;
		cutin "ep172_beta.bmp", 0;
		mes "[スマートエリー]";
		mes "その話が確かなら";
		mes "ゲオルグ家の方々は";
		mes "イスガルドの障壁を越える方法を";
		mes "知っているということですね？";
		next;
		mes "[スマートエリー]";
		mes "私達は、イスガルドに向かうための";
		mes "飛行船の準備はできています。";
		mes "残る問題は障壁を越える方法のみ。";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[レイジー]";
		mes "クルックス！";
		mes "そういう話は";
		mes "もっと早くしてくれないと～！";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[クルックス]";
		mes "……王家にとっても";
		mes "触れにくい話なんです。";
		mes "察していただけませんか？";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[レイジー]";
		mes "では、こうしよう。";
		mes strcharinfo(0)+" は";
		mes "クルックスと共にプロンテラへ行って";
		mes "障壁を越える方法を聞いてくる。";
		mes "王様と仲が良いんだから。";
		next;
		mes "[レイジー]";
		mes "スマートエリーとジンジャーには";
		mes "飛行船を整備してもらって";
		mes "私はラヘルからのお客様たちと一緒に";
		mes "旅行の準備をしておこう。";
		next;
		mes "[マラム]";
		mes "それが良さそうです。";
		mes "アルナベルツの人間が";
		mes "ルーンミッドガッツ王国に入るには";
		mes "手続きが煩雑ですから。";
		cutin "ep18_maram_01.png", 2;
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "うん。";
		mes "準備はボクたちに任せて。";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[クルックス]";
		mes "王家への取次ぎは";
		mes "私がさせていただきます。";
		mes "プロンテラに行く準備ができたら";
		mes "私に声を掛けてください。";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		set EP19_1QUE,3;
		delquest 130460;
		setquest 18120;	//showevent 9999, 0, スマートエリー#ep19elly;	// 5567: 384, 114 showevent 0, 1, クルックス#ep19crux01;	// 5569: 386, 110
		end;
	case 3:
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "それでは各自の仕事に";
		mes "取り掛かりましょう。";
		mes "私とジンジャーは、飛行船の点検と";
		mes "経路の確認を行います。";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,386,113,3	script	レイジー#ep19lazy01	10179,{/* 5568 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "16lei_01.bmp", 2;
		mes "[レイジー]";
		mes "ラヘルはどうだった？";
		mes "悪くは無いと思うけど";
		mes "やっぱり、ジュノーが最高だよな？";
		close2;
		cutin "16lei_01.bmp", 255;
		end;
	case 3:
		cutin "16lei_01.bmp", 2;
		mes "[レイジー]";
		mes "聞いたところによるとルティエよりも";
		mes "さらに北に行くらしい。";
		mes "すっげえ寒そうだよな？";
		next;
		mes "[レイジー]";
		mes "プロンテラに行ってもらってる間に";
		mes "買物でもしておこう。";
		mes "ラヘルのお客様たちを案内するついでに";
		mes "リヒタルゼンの百貨店に行かなきゃ。";
		close2;
		cutin "16lei_01.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,386,110,3	script	クルックス#ep19crux01	10118,{/* 5569 (cloaking)*/
	if(EP19_1QUE == 2) {
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[クルックス]";
		mes "お久しぶりです。";
		mes "スピーカ様、スキア様からも";
		mes "よろしく伝えて欲しいと";
		mes "伝言を預かっております。";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
	cutin "ep16_crux_findel02.bmp", 1;
	mes "[クルックス]";
	mes "ではプロンテラ王宮に";
	mes "参りましょうか。";
	next;
	if(select("今すぐ行きましょう！","ちょっと待ってください") == 2) {
		mes "[クルックス]";
		mes "準備ができましたら";
		mes "仰ってください。";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
	mes "[クルックス]";
	mes "かしこまりました。";
	mes "では、参りましょう。";
	close2;
	cutin "ep16_crux_findel02.bmp", 255;
	warp "prt_cas.gat", 146, 337;
	end;
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,386,107,3	script	ミリアム#ep19miriam02	10377,{/* 5570 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "この邸宅、凄いですね。";
		mes "バルムントという人は";
		mes "どんな人だったんだろう？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 3:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "レイジーさんにアドバイスをもらって";
		mes "必要なものを用意しておきます。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_maison.gat,197,279,0	warp	#ep172_in01_in	2,2,ba_in01.gat,271,269	// 5331 from: ba_maison.gat(197, 279)

ba_in01.gat,383,104,1	script	マラム#ep19maram02	10376,{/* 5571 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "こんな凄い場所に来るのは";
		mes "生まれて初めてです。";
		mes "バルムント様については";
		mes "スマートエリーが自慢してましたが";
		mes "誇張してはなかったのですね。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 3:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "旅の準備は私たちに任せてください。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,380,111,7	script	ジンジャー#ep19gg02	10354,{/* 5572 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "飛行船イフ号を担当している";
		mes "ジンジャーだや！";
		mes "よろしくお願いします。";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	case 3:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "テスト飛行は順調でしたが";
		mes "安定的な経路を割り出すために";
		mes "イスガルドの障壁に近づいた時の状況を";
		mes "もう一度、分析しておきます。";
		next;
		mes "[ジンジャー]";
		mes "ジンジャーは忙しいだや～！";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,147,337,0	script	#ep19_evt02	139,3,3,{/* 5609 */
OnTouch:
	cloakonnpc "クルックス#ep19_2";
	if(EP19_1QUE == 3) {
		cloakoffnpc "クルックス#ep19_2";
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[クルックス]";
		mes "謁見の申請は済ませてあります。";
		mes "中へお入りください。";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
	else if(EP19_1QUE == 4) {
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		//showevent 9999, 0, ニーヒル・ハイネン#ep17;	// 5573: 325, 263
		//showevent 9999, 0, クルックス#ep19crux02;	// 5612: 320, 270
		//showevent 0, 1, ニーヒル#ep19nh01;	// 5616: 331, 343
		//showevent 9999, 0, レハール#ep19lehar02;	// 5617: 334, 342
	}
}
prt_cas.gat,149,331,4	script	クルックス#ep19_2	10118,{/* 5610 (cloaking)*/
	if(EP19_1QUE == 3) {
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[クルックス]";
		mes "謁見の申請は済ませてあります。";
		mes "中へお入りください。";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,309,287,0	script	#ep19_evt03	139,3,3,{/* 5611 */
	if(EP19_1QUE == 3) {
		cloakoffnpc "クルックス#ep19crux02";
		cloakoffnpc "キャサリン#ep19c01";
		//showevent 9999, 0, ニーヒル#ep19nh01;	// 5616: 331, 343
		//showevent 9999, 0, レハール#ep19lehar02;	// 5617: 334, 342
	}
	else if(EP19_1QUE == 4) {
		cloakoffnpc "レハール#ep19lehar01";
	}
}

prt_cas.gat,320,270,4	script	クルックス#ep19crux02	10118,{/* 5612 (cloaking)*/
	switch(EP19_1QUE) {
	case 3:
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[クルックス]";
		mes strcharinfo(0)+"様を";
		mes "お連れいたしました。";
		next;
		cutin "ep171_nihil01.bmp", 2;
		mes "[ニーヒル]";
		mes "話は聞いています。";
		mes "貴方の役に立てる時が";
		mes "ようやく来たようですね。";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[キャサリン]";
		mes "ヨルムンガンドが封印された地について";
		mes "調べておられると聞いています。";
		mes "本当にその地に赴くことを";
		mes "お望みですか？";
		next;
		menu "はい！",-;
		mes "[キャサリン]";
		mes "ゲオルグ家とヨルムンガンドの因縁……";
		mes "ヨルムンガンドの呪いについては";
		mes "ここにおられる方なら";
		mes "知っておられることでしょう。";
		mes "ヨルムンガンドに一番近い者こそが";
		mes "ゲオルグ家の者なのです。";
		next;
		mes "[キャサリン]";
		mes "ヨルムンガンドを奉祀する";
		mes "ヨルムンガンド教団は";
		mes "消え去ったわけではありません。";
		mes "むろん、公にはされていませんが。";
		next;
		mes "[キャサリン]";
		mes "彼らは海の向こうの";
		mes "氷の地に閉じ込められ";
		mes "未知の力によって";
		mes "その地に封印されました。";
		next;
		mes "[キャサリン]";
		mes "そしてそこには";
		mes "封印を守る「守護者」の方々が";
		mes "おられるのです。";
		next;
		menu "守護者？",-;
		cutin "ep171_nihil01.bmp", 2;
		mes "[ニーヒル]";
		mes "……私も驚きました。";
		mes "王に即位した後に初めて";
		mes "その事実を伝えられたのです。";
		next;
		mes "[ニーヒル]";
		mes "さらに驚くべきことに";
		mes "ゲオルグ家の一部の方々は";
		mes "ヨルムンガンドが封印された地……";
		mes "つまり「イスガルド」と";
		mes "行き来しておられるそうなのです。";
		next;
		mes "[ニーヒル]";
		mes "この場に、キャサリン先王妃殿下に";
		mes "来ていただいたのは";
		mes "そういった事情のためなのです。";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[キャサリン]";
		mes "トリスタン三世には";
		mes "三人の姉妹がいらっしゃいます。";
		mes "そのうちのお二人が";
		mes "イスガルドにおられるのです。";
		mes "ヨルムンガンドの呪いを解く方法を";
		mes "探し出すために。";
		next;
		mes "[キャサリン]";
		mes "血族の理不尽な死を経験するのは";
		mes "悲しいことです。";
		mes "彼女たちがイスガルドに赴いた理由を";
		mes "理解していただけるでしょう。";
		next;
		mes "[キャサリン]";
		mes "ちょうど今、甥が来ています。";
		mes "実際にイスガルドと";
		mes "行き来している者です。";
		next;
		cutin "ep171_nihil01.bmp", 2;
		mes "[ニーヒル]";
		mes "すぐにこちらに来るように";
		mes "伝えています。";
		mes "そろそろ来るでしょう。";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[キャサリン]";
		mes "……あの箱のことを";
		mes "もう少し早く知ることができれば";
		mes "もしかしたら……。";
		next;
		cloakoffnpc "レハール#ep19lehar01";
		mes "[？？？]";
		mes "私をお探しですって？";
		mes "あっ、叔母様もいらっしゃいますね。";
		mes "クルックスもいるのか！";
		mes "伯母たちの手伝いで少し遅れました。";
		cutin "ep19_lehar02.png", 1;
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[クルックス]";
		mes "お久しぶりです、「^0000FFレハール^000000」様。";
		mes "相変わらず、お元気そうで";
		mes "安心いたしました。";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "ああ、ええっと……";
		mes "ニーヒル兄……殿下……";
		mes "いや国王？";
		mes "うう～ん、まだ慣れないなぁ。";
		mes "えっと、私をお呼びになった理由は？";
		next;
		cutin "ep171_nihil02.bmp", 2;
		mes "[ニーヒル]";
		mes "これからイスガルドに向かうと思うが";
		mes strcharinfo(0)+"様と";
		mes "お仲間の方々をイスガルドに";
		mes "案内して欲しい。";
		next;
		cutin "ep19_lehar05.png", 1;
		mes "[レハール]";
		mes "うえぇぇぇ～～っ!?";
		mes "秘密じゃなかったんですか??";
		mes "言っちゃっていいんですか!?!?";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[キャサリン]";
		mes "落ち着きなさい、レハール。";
		mes "この方は、わけあって";
		mes "イスガルドに赴く必要があるのです。";
		mes "御覧の通り国王陛下も";
		mes "許可しておられます。";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "そ、そうなのですね。";
		mes "……では、「守護者の箱」を使います。";
		mes "許可をいただけますか？";
		next;
		cutin "ep171_nihil01.bmp", 2;
		mes "[ニーヒル]";
		mes "もちろんだ。";
		mes strcharinfo(0)+"様、";
		mes "隣の部屋に来てください。";
		mes "「守護者の箱」は、そこにあります。";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[キャサリン]";
		mes "私は、もうお暇いたしますね。";
		mes strcharinfo(0)+"様の";
		mes "希望が叶うことをお祈りします。";
		mes "レハール、お母上に";
		mes "よろしくと伝えておいてください。";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[クルックス]";
		mes "先王妃殿下は、私がご案内いたします。";
		mes "それでは失礼いたします。";
		next;
		cloakonnpc "クルックス#ep19crux02";
		cloakonnpc "キャサリン#ep19c01";
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "私たちも移動するとしましょう！";
		close2;
		cutin "ep19_lehar01.png", 255;
		delquest 18120;
		setquest 18121;
		set EP19_1QUE,4;
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		//showevent 9999, 0, ニーヒル・ハイネン#ep17;	// 5573: 325, 263
		//showevent 9999, 0, クルックス#ep19crux02;	// 5612: 320, 270
		//showevent 0, 1, ニーヒル#ep19nh01;	// 5616: 331, 343
		//showevent 9999, 0, レハール#ep19lehar02;	// 5617: 334, 342
		end;
	}
OnInit:
	cloakonnpc;
	end;
}
prt_cas.gat,323,266,4	script	キャサリン#ep19c01	10121,{/* 5613 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
prt_cas.gat,317,266,6	script	レハール#ep19lehar01	10469,{/* 5614 (cloaking)*/
	switch(EP19_1QUE) {
	case 4:
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "ニーヒル兄……";
		mes "あ、いや、国王陛下のお部屋に";
		mes "行きましょう！";
		mes "^ff0000廊下に出て右手の奥^000000です。";
		next;
		cutin "ep171_nihil02.bmp", 2;
		mes "[ニーヒル]";
		mes "私たちだけの時は";
		mes "ニーヒル兄で良いよ。";
		mes "お前は、王宮内の身分に";
		mes "縛られてはいないだから。";
		next;
		cutin "ep19_lehar07.png", 0;
		mes "[レハール]";
		mes "そうだとしても母さんにだけは";
		mes "黙っててください。";
		mes "礼儀作法がどうのこうのって";
		mes "本当にうるさいんです!!";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,331,343,0	script	#ep19_evt04	139,11,11,{/* 5615 */
	switch(EP19_1QUE) {
	case 4:
	case 5:
		cloakoffnpc "ニーヒル#ep19nh01";
		cloakoffnpc "レハール#ep19lehar02";
		end;
	default:
		cloakonnpc "ニーヒル#ep19nh01";
		cloakonnpc "レハール#ep19lehar02";
		end;
	}
}
prt_cas.gat,331,343,4	script	ニーヒル#ep19nh01	10304,{/* 5616 (cloaking)*/
	switch(EP19_1QUE) {
	case 4:
		cutin "ep171_nihil01.bmp", 0;
		mes "[ニーヒル]";
		mes "この何の変哲もない本に見えるものが";
		mes "「守護者の箱」と呼ばれるものです。";
		mes "表紙状の蓋を開けると";
		mes "内部が箱状になっています。";
		next;
		mes "[ニーヒル]";
		mes "七王家の直系のみが使用できますが";
		mes "私とレハールがいるので";
		mes "使用できるはずです。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "イスガルドに入る為には";
		mes "「^4d4dff招待状^000000」が必要なんです。";
		mes "ええっと……冒険者様の他に";
		mes "何名の方が来られる予定ですか？";
		next;
		menu "人数を伝える",-;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "結構、多いですね……";
		mes "それだと「ヘルロック」に運んで";
		mes "もらうのは難しそうです。";
		mes "海を越える必要がありますが";
		mes "船で渡られますか？";
		next;
		menu "飛行船を使う予定です",-;
		mes "[レハール]";
		mes "飛行船！　イイですね！";
		mes "では出入許可を求める手紙を";
		mes "用意します。";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "‐王室の印が押された高級紙に";
		mes "　レハールが何かを書き始めた。";
		mes "　ニーヒルが隣で書く内容について";
		mes "　アドバイスしている‐";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "出来ました！";
		mes "では印章を押して、箱に入れますね。";
		mes "あとは少し待てば良いです。";
		next;
		cutin "ep171_nihil01.bmp", 0;
		mes "[ニーヒル]";
		mes "「守護者」の方たちが";
		mes "すぐ気付いてくださると良いのですが。";
		next;
		menu "この箱は、どういうものなのですか？",-;
		mes "[ニーヒル]";
		mes "この箱は初代トリスタン・ゲオルグが";
		mes "残されたものです。";
		mes "初代国王の愛蔵品として";
		mes "王国に伝わっています。";
		next;
		mes "[ニーヒル]";
		mes "初代国王はこれを使って";
		mes "手紙のやり取りをしておられたと";
		mes "伝承には記されていたのですが";
		mes "ながらく使い方は不明でした。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "書庫を整理していた伯母様が";
		mes "記録を調べている時に";
		mes "この箱の存在を知り";
		mes "試しに手紙を入れてみたそうです。";
		next;
		mes "[レハール]";
		mes "するとビックリ！";
		mes "イスガルドにて封印を守る";
		mes "「守護者」と言われる方々からの";
		mes "返答が送られて来たんですよ。";
		next;
		mes "[レハール]";
		mes "彼ら守護者の加護を宿した";
		mes "「招待状」をもらうことで";
		mes "叔母様達は障壁を越え";
		mes "イスガルドに滞在できるように";
		mes "なったというわけです。";
		next;
		misceffect 55,"本の形の箱#ep19box01";
		misceffect 72,"本の形の箱#ep19box01";
		cutin "ep171_nihil01.bmp", 0;
		mes "[ニーヒル]";
		mes "……返答が来ましたね。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "「守護者の招待状」ですよ！";
		mes "それと手紙には、冒険者様を歓迎すると";
		mes "書かれています。";
		mes "バルムントの飛行船は久しぶりとも";
		mes "書かれていますね。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "飛行船の運航を管理する者に";
		mes "この招待状を渡しておけば";
		mes "冒険者様だけでなくお仲間の方も";
		mes "イスガルドに入れます。";
		next;
		cutin "ep171_nihil01.bmp", 0;
		mes "[ニーヒル]";
		mes "上手くいったようですね。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "私も飛行船に乗って良いですか？";
		mes "あ、修道院や大聖堂に寄ってから";
		mes "合流いたします。";
		next;
		cutin "ep171_nihil01.bmp", 0;
		mes "[ニーヒル]";
		mes "レハール。";
		mes "バルムント邸に向かうなら";
		mes "クルックスに案内してもらうと良い。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 18121;
		setquest 18122;
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		set EP19_1QUE,5;
		getitem 1000607,1;
		mes "[ニーヒル]";
		mes strcharinfo(0)+"様も";
		mes "レハールと一緒に行ってください。";
		mes "イスガルドを案内してくれるでしょう。";
		mes "他にも支援が必要な時は";
		mes "遠慮せずに言ってください。";
		close2;
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		//showevent 9999, 0, ニーヒル・ハイネン#ep17;	// 5573: 325, 263
		//showevent 9999, 0, クルックス#ep19crux02;	// 5612: 320, 270
		//showevent 9999, 0, ニーヒル#ep19nh01;	// 5616: 331, 343
		//showevent 0, 1, レハール#ep19lehar02;	// 5617: 334, 342
		cutin "ep171_nihil01.bmp", 255;
		end;
	case 5:
		cutin "ep171_nihil01.bmp", 0;
		mes "[ニーヒル]";
		mes "どうかお気をつけて。";
		mes "レハールのこと……";
		mes "よろしく頼みます。";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,334,342,3	script	レハール#ep19lehar02	10469,{/* 5617 (cloaking)*/
	switch(EP19_1QUE) {
	case 5:
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "「守護者の招待状」があれば";
		mes "イスガルドに入れるはずです。";
		mes "すぐにバルムント邸に戻られますか？";
		next;
		if(select("バルムント邸へ戻る","まだいい") == 2) {
			mes "[レハール]";
			mes "バルムント邸に戻られる時は";
			mes "声を掛けてくださいね。";
			close2;
			cutin "ep19_lehar01.png", 255;
			end;
		}
		mes "[レハール]";
		mes "私は用事を済ませてから";
		mes "バルムントの邸宅に向かいます。";
		mes "飛行船に乗れるなんて楽しみだなぁ！";
		close2;
		cutin "ep19_lehar01.png", 255;
		warp "ba_maison.gat", 187, 248;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,332,342,3	script	本の形の箱#ep19box01	844,{/* 5618 */
	unittalk getcharid(3),strcharinfo(0)+" : 本のように見えるが、手紙を保管するための箱らしい",1;
	end;
}

prt_cas.gat,146,330,0	warp	king_office_in_king_office_out	1,1,prt_cas.gat,309,288
prt_cas.gat,309,291,0	warp	king_office_in_king_office_in	1,1,prt_cas.gat,146,334
prt_cas.gat,174,342,0	warp	king_room_in_king_room_	1,1,prt_cas.gat,322,336	// 5456 from: prt_cas.gat(173, 342)
prt_cas.gat,318,336,0	warp	king_room_out_king_room	1,1,prt_cas.gat,170,342	// 5457 from: prt_cas.gat(319, 336)

prt_cas.gat,325,263,3	script	ニーヒル・ハイネン#ep17	10304,{/* 5573 */
	switch(EP19_1QUE) {
	case 3:
		cutin "ep171_nihil01.bmp", 1;
		mes "[ニーヒル]";
		mes "ようやく、";
		mes "あなたに力を貸すことができますね。";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	case 4:
		cutin "ep171_nihil01.bmp", 1;
		mes "[ニーヒル]";
		mes "廊下に出て右手の奥にある";
		mes "私の個室へ移動しましょう。";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	case 5:
		cutin "ep171_nihil01.bmp", 1;
		mes "[ニーヒル]";
		mes "レハールをよろしくお願いします。";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	}
}

ba_maison.gat,187,248,0	script	#ep19_evt05	139,14,14,{/* 5573 */
	switch(EP19_1QUE) {
	//case 0~4: //未調査
	case 5:
		cloakoffnpc "ジンジャー#ep19gg01_";
		end;
	}
}
ba_maison.gat,191,248,4	script	ジンジャー#ep19gg01_	10354,{/* 5574 (cloaking)*/
	switch(EP19_1QUE) {
	case 5:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "あっ、ちょうど良かった！";
		mes "飛行船の出航準備が";
		mes "さきほど終わっただや！";
		mes "今は、他のお客様たちが戻ってくるのを";
		mes "待ってるところ。";
		next;
		cloakoffnpc "レイジー#ep19_evt05";
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "お、戻って来た。";
		mes "こちらは旅行に必要なものを";
		mes "ばっちり買い揃えて来たぞ。";
		next;
		cutin "ep18_maram_01.png", 2;
		cloakoffnpc "マラム#ep19_evt05";
		mes "[マラム]";
		mes "買物だけでなく";
		mes "母上やスアドへの連絡も";
		mes "済ませて来ました。";
		next;
		cutin "ep18_miriam_01.png", 0;
		cloakoffnpc "ミリアム#ep19_evt05";
		mes "[ミリアム]";
		mes "いつでも出発できます。";
		mes strcharinfo(0)+"様の";
		mes "準備はいかがです？";
		next;
		menu "「守護者の招待状」を見せる",-;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "その紙切れが通行券ってわけ？";
		mes "ふ～ん、「招待状」ねぇ。";
		mes "なら、これで出発できるな。";
		next;
		menu "もう一人、合流予定です",-;
		cutin "ep19_lehar01.png", 1;
		cloakoffnpc "レハール#ep19_evt05";
		mes "[レハール]";
		mes strcharinfo(0)+"様！";
		mes "遅れてすいません。";
		mes "……ええっと、この方たちが";
		mes "一緒にイスガルドに向かう方々ですね？";
		next;
		mes "[レハール]";
		mes "はじめまして";
		mes "「レハール」と申します。";
		mes "イスガルドまで皆様を案内するよう";
		mes "言われています。";
		mes "よろしくお願いしますね。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "私は「レイジー」だ。";
		mes "ところで、ジュノーには行った？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "はい？";
		mes "ジュノーですか？";
		mes "ええっと、ジュノーで飛行船を";
		mes "乗り換えました！";
		next;
		mes "[レハール]";
		mes "……ところで、ええっと";
		mes "一緒に来られる方々の中に……";
		mes "あっ！　やっぱり！";
		mes "ベールをまとった髪の長い女の人！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "……ボクのこと？";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "はい！";
		mes "叔母様から話は聞いています。";
		mes "これでイスガルドに向かうメンバーは";
		mes "揃いましたね。";
		next;
		cutin "ep172_beta.bmp", 1;
		mes "[ジンジャー]";
		mes "では、お客様方。";
		mes "「飛行船発着場」に移動しますよ。";
		mes "ジンジャーに付いてくるだや～！";
		next;
		cutin "ep172_beta.bmp", 255;
		delquest 18122;
		setquest 18123;	//showevent 0, 1, ジンジャー#ep19gg01_;	// 5574: 191, 248 showevent 0, 1, ジンジャー#ep19gg01;	// 5579: 30, 264
		set EP19_1QUE,6;
		mes "‐次の目的地へ向かいますか？‐";
		next;
		//showevent 9999, 0, 邸宅管理者アルファ#172n;	// 5168: 74, 150
		//showevent 9999, 0, クルックス#ep172_clx02;	// 5260: 38, 219
		//showevent 0, 3, タマリン#1研究所前;	// 5263: 70, 145
		//showevent 9999, 0, #ep172_lab2_in;	// 5306: 78, 146
		//showevent 0, 1, #ep172_proom2_in;	// 5315: 33, 225
		//showevent 9999, 0, #ep172_sroom1_in;	// 5317: 103, 323
		//showevent 0, 1, #ep172_in01_in;	// 5331: 197, 279
		//showevent 0, 1, #ep172_pw03_in;	// 5350: 88, 272
		//showevent 9999, 0, ニド#jh_ba;	// 5369: 169, 270
		//showevent 9999, 0, 隠れている自動人形#he_a;	// 5384: 120, 321
		//showevent 0, 1, 隠れている自動人形#he_a;	// 5385: 120, 321
		//showevent 9999, 0, #スタート;	// 5393: 200, 264
		//showevent 9999, 0, 奇妙な草#移動用ワープ;	// 5396: 206, 267
		//showevent 0, 1, エウロパ#eorpa;	// 5552: 79, 278
		//showevent 0, 1, ジンジャー#ep19gg01_;	// 5574: 191, 248
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の目的地へ向かった‐";
		close2;
		warp "ba_in01.gat", 28, 262;
		end;
	case 6:
		cutin "ep172_beta.bmp", 1;
		mes "[ジンジャー]";
		mes "では、お客様方。";
		mes "「飛行船発着場」に移動しますよ。";
		mes "ジンジャーに付いてくるだや～！";
		mes "　";
		mes "‐次の目的地へ向かいますか？‐";
		next;
		cutin "ep172_beta.bmp", 255;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の目的地へ向かった‐";
		close2;
		warp "ba_in01.gat", 28, 262;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,193,252,3	script	レイジー#ep19_evt05	10454,{/* 5575 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,193,248,3	script	マラム#ep19_evt05	10376,{/* 5576 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,195,250,3	script	ミリアム#ep19_evt05	10377,{/* 5577 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,185,248,6	script	レハール#ep19_evt05	10469,{/* 5578 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,30,264,4	script	ジンジャー#ep19gg01	10354,{/* 5579 */
	if(EP19_1QUE < 3) {
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "飛行船イフ号を担当している";
		mes "「ジンジャー」だや！";
		mes "よろしくお願いします!!";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	if(EP19_1QUE >= 6 || EP19_1QUE <= 8) {
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "イフ号でイスガルドに行くだや！";
		mes "今すぐ乗るよね？";
		next;
		if(select("飛行船の中へ","ちょっと待って欲しい") == 2) {
			mes "[ジンジャー]";
			mes "飛行船はいつでも出航可能だや！";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		mes "[ジンジャー]";
		mes "じゃあ、飛行船に乗るだや！";
		if(EP19_1QUE == 6) {
			delquest 18123;
			setquest 130465;
			set EP19_1QUE,7;
		}
		close2;
		//showevent 9999, 0, スマートエリー#ep172_el;	// 5249: 26, 266
		//showevent 0, 1, アーモンド#ep172_amd01;	// 5381: 28, 255
		//showevent 9999, 0, スウィーティ#ep172_swty;	// 5382: 32, 250
		//showevent 9999, 0, スマートエリー#ep18ely0;	// 5553: 26, 266
		//showevent 9999, 0, スマートエリー#ep19_000;	// 5565: 26, 266
		//showevent 9999, 0, スマートエリー#ep19elly;	// 5567: 384, 114
		//showevent 9999, 0, クルックス#ep19crux01;	// 5569: 386, 110
		//showevent 0, 1, ジンジャー#ep19gg01;	// 5579: 30, 264
		cutin "ep172_beta.bmp", 255;
		warp "air_if.gat", 53, 71;	// from: ba_in01.gat(28, 262) port : 5121
		end;
	}
	cutin "ep172_beta.bmp", 2;
	mes "[ジンジャー]";
	if(EP19_1QUE >= 9) {
		mes "イフ号でイスガルドに行くだや！";
		mes "今すぐ乗るよね？";
		setarray '@menu$,"飛行船の中へ","イスガルドに行く","プロンテラに行く","ジュノーに行く","ラヘルに行く","ちょっと待って欲しい";
	}
	else {
		mes "イスガルドへの航路計算は完璧！";
		mes "今は、テスト飛行中だけど";
		mes "もしかして、どこか行きたい場所が";
		mes "あったりする？";
		setarray '@menu$,"","","プロンテラに行く","ジュノーに行く","ラヘルに行く","今は必要ないです";
	}
	next;
	switch(select(printarray('@menu$))) {
	case 1:
		mes "[ジンジャー]";
		mes "じゃあ、飛行船に乗るだや！";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "air_if.gat", 53, 71;
		end;
	case 2:
		mes "[ジンジャー]";
		mes "では、特急で行くだや！";
		mes "シューーン！";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "jor_tail.gat", 219, 53;
		end;
	case 3:
		mes "[ジンジャー]";
		mes "では、プロンテラに出航！";
		mes "シューーン！";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "prontera.gat", 116, 72;
		end;
	case 4:
		mes "[ジンジャー]";
		mes "では、ジュノーに出航！";
		mes "シューーン！";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "yuno.gat", 158, 125;
		end;
	case 5:
		mes "[ジンジャー]";
		mes "では、ラヘルに出航！";
		mes "シューーン！";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "rachel.gat", 115, 125;
		end;
	case 6:
		mes "[ジンジャー]";
		if(EP19_1QUE >= 9) {
			mes "飛行船はいつでも出航可能だや！";
		}
		else {
			mes "行きたい場所があったら";
			mes "テスト飛行で送ってあげるだや！";
		}
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
}

ba_in01.gat,341,371,0	warp	#ep172_room02_in	1,1,ba_in01.gat,375,101	// 5341 from: ba_in01.gat(341, 370)
ba_in01.gat,375,98,0	warp	#ep172_room02_out	1,1,ba_in01.gat,341,368	// 5342 from: ba_in01.gat(375, 99)

air_if.gat,54,68,0	script	#ep19_evt06	139,7,7,{/* 2501 */
	switch(EP19_1QUE) {
	case 7:
	case 8:
		//showevent 9999, 0, ジンジャー#ep19gg03;	// 2505: 46, 71
		//showevent 0, 1, レハール#ep19lehar03;	// 2509: 32, 63
		cloakoffnpc "レイジー#ep19lazy02";
		cloakoffnpc "マラム#ep19maram03";
		cloakoffnpc "ミリアム#ep19miriam03";
		cloakoffnpc "レハール#ep19lehar03";
		end;
	case 9:
	case 11:
		end;
	case 10:
		cloakoffnpc "レイジー#ep19lazyair";
		cloakoffnpc "マラム#ep19maramair";
		end;
	}
}
air_if.gat,35,60,0	script	#ep19_evt06_1	139,5,5,{/* 2502 */
	switch(EP19_1QUE) {
	case 7:
	case 8:
		cloakoffnpc "レイジー#ep19lazy02";
		cloakoffnpc "マラム#ep19maram03";
		cloakoffnpc "ミリアム#ep19miriam03";
		cloakoffnpc "レハール#ep19lehar03";
		end;
	case 9:
	case 11:
		end;
	case 10:
		cloakoffnpc "レイジー#ep19lazyair";
		cloakoffnpc "マラム#ep19maramair";
		end;
	}
}

air_if.gat,35,72,3	script	レイジー#ep19lazyair	10454,{/* 2503 (cloaking)*/
	cutin "ep19_leizi01.png", 2;
	mes "[レイジー]";
	mes "定期報告のためだけに";
	mes "大陸間を往復させるなんて";
	mes "人使いが荒いったらありゃしない！";
	next;
	if(select("私もジュノーへ行く","いってらっしゃい") == 2) {
		mes "[レイジー]";
		mes "てっきり、一緒にジュノーに";
		mes "来てくれると思ってたのにな。";
		mes "次はぜひ一緒にジュノーに行こう。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	mes "[レイジー]";
	mes "やっぱり、ジュノーが一番だよな？";
	mes "なら、一緒に行こう。";
	next;
	cutin "ep172_beta.bmp", 2;
	mes "[ジンジャー]";
	mes "ジュノーに到着しただや！";
	mes "お客さん、降りて降りて!!";
	close2;
	cutin "ep19_leizi01.png", 255;
	warp "yuno.gat", 157, 123;
	end;
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,30,70,5	script	マラム#ep19maramair	10376,{/* 2504 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "「氷の城」への物資の調達を";
	mes "私が担当することになったんです。";
	mes "得意分野ですからね。";
	mes "今はラヘルに向かっています。";
	next;
	if(select("私もラヘルへ行く","いってらっしゃい") == 2) {
		mes "[マラム]";
		mes "物資の調達は任せてください。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	mes "[マラム]";
	mes "良いですね！";
	mes "折角ですから一緒に行きましょうか。";
	next;
	cutin "ep172_beta.bmp", 2;
	mes "[ジンジャー]";
	mes "ラヘルに到着しただや！";
	mes "お客さん、降りて降りて!!";
	close2;
	cutin "ep18_maram_01.png", 255;
	warp "rachel.gat", 267, 126;
	end;
OnInit:
	cloakonnpc;
	end;
}
air_if.gat,46,71,4	script	ジンジャー#ep19gg03	10354,{/* 2505 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "テスト飛行を繰り返したので";
		mes "航路設定は完璧だや！";
		mes "最短経路で飛んでいく予定だけど";
		mes "イスガルドの障壁を越える方法は";
		mes "どうすれば良い？";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "イスガルドの守護者の方から";
		mes "「招待状」をもらいましたよね？";
		mes "それを飛行船の管理者に渡せば";
		mes "障壁を越えられるはずです。";
		next;
		menu "ジンジャーに「招待状」を渡す",-;
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "これが「招待状」？";
		mes "特定の波長コードを感知！";
		mes "どれどれ……。";
		next;
		mes "[ジンジャー]";
		mes "うん、理解しただや！";
		mes "お客様たちは到着するまで";
		mes "休んでいて。";
		close2;
		cutin "ep172_beta.bmp", 255;
		delquest 130465;
		setquest 18129;
		delitem 1000607,1;
		set EP19_1QUE,8;
		//showevent 9999, 0, ジンジャー#ep19gg03;	// 2505: 46, 71
		//showevent 0, 1, レハール#ep19lehar03;	// 2509: 32, 63
		end;
	case 8:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "最短経路で運航中！";
		mes "お客様たちは到着するまで";
		mes "休んでいて。";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	case 9:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "ジンジャーはイフ号の担当者だから";
		mes "ここで待機中だや。";
		next;
		if(select("飛行船から降りる","もうちょっとしてから降りる") == 2) {
			mes "[ジンジャー]";
			mes "わかった。";
			mes "降りたい時は、教えて。";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		mes "[ジンジャー]";
		mes "では、いってらっしゃーい！";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "jor_tail.gat", 219, 53;
		end;
	default:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "ジンジャーはイフ号の担当者だから";
		mes "ここで待機中だや。";
		mes "バルムント邸に戻りたい時は";
		mes "いつでも要請して。";
		next;
		switch(select("バルムント邸に行く","イスガルドに行く","プロンテラに行く","ジュノーに行く","ラヘルに行く","ちょっと待って欲しい")) {
		case 1:
			mes "[ジンジャー]";
			mes "では、バルムント邸に出航！";
			mes "シューーン！";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "ba_in01.gat", 30, 262;
			end;
		case 2:
			mes "[ジンジャー]";
			mes "では、いってらっしゃーい！";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "jor_tail.gat", 219, 53;
			end;
		case 3:
			mes "[ジンジャー]";
			mes "では、プロンテラに出航！";
			mes "シューーン！";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "prontera.gat", 116, 72;
			end;
		case 4:
			mes "[ジンジャー]";
			mes "では、ジュノーに出航！";
			mes "シューーン！";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "yuno.gat", 158, 125;
			end;
		case 5:
			mes "[ジンジャー]";
			mes "では、ラヘルに出航！";
			mes "シューーン！";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "rachel.gat", 115, 125;
			end;
		case 6:
			mes "[ジンジャー]";
			mes "行きたい場所があったら";
			mes "送ってあげるだや！";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
	}
}
air_if.gat,31,58,1	script	レイジー#ep19lazy02	10454,{/* 2506 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "わっふ～～！";
		mes "流石は大賢者の飛行船！";
		mes "内装が違うな。";
		mes "一般的な飛行船には何度も乗ってるが";
		mes "これほどじゃないから。";
		close2;
		cutin "16lei_01.bmp", 255;
		end;
	case 8:
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "空港ファッションって知ってる？";
		mes "これ、私服なんだけど、どう？";
		mes "格好いい？";
		next;
		mes "[レイジー]";
		mes "向こうは寒いらしいからな。";
		mes "防寒をしっかりしなきゃ。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	case 9:
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "もうイスガルドに着いたって？";
		mes "秘蔵の防寒着の性能がいかほどのものか";
		mes "試してみようじゃないか！";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,29,62,5	script	マラム#ep19maram03	10376,{/* 2507 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "商用の飛行船とは";
		mes "比べものにもなりませんね。";
		mes "これが個人所有の飛行船だなんて";
		mes "驚きです。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 8:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "この飛行船を使って";
		mes "物資の調達ができないか";
		mes "ジンジャーさんに相談するつもりです。";
		mes "遠隔地で活動するなら";
		mes "物資の補給が必要になるでしょう。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 9:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "いよいよイスガルドに到着ですね。";
		mes "どんな所なのでしょう？";
		mes "ちょっと緊張してきました。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,29,59,6	script	ミリアム#ep19miriam03	10377,{/* 2508 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "こんなに長くラヘルを離れるのは";
		mes "初めて……";
		mes "ちょっとドキドキしてきた。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 8:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "イスガルドに行けることに";
		mes "気持ちが高揚してます。";
		mes "……精神修養が足りないのかな？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 9:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "着きましたか？";
		mes "外はやっぱり寒いのでしょうか……。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,32,63,3	script	レハール#ep19lehar03	10469,{/* 2509 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "守護者様からいただいた「招待状」を";
		mes "ジンジャーさんに渡してください。";
		mes "この飛行船全体が進入を許されたものと";
		mes "認識されます。";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 8:
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ちゃんとした自己紹介がまだでした。";
		mes "聖カピトーリナ修道院の";
		mes "「レハール」と申します。";
		next;
		mes "[レハール]";
		mes "ヨルムンガンドに関する研究を";
		mes "手伝っていたのですが";
		mes "いつの間にかイスガルドと";
		mes "行き来することになってしまいました。";
		mes "イスガルドの案内はお任せください。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "礼儀正しい青年は大好きだよ！";
		mes "私のことは気楽に";
		mes "レイジーと呼んでくれ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "マラムです。";
		mes "物資の調達などで";
		mes "お役に立てるかと思います。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "……ミリアムです。";
		mes "マラムと一緒に参りました。";
		mes "よろしくお願いいたします。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "ミリアム？";
		mes "ふむ……仮名というわけですか。";
		mes "流石は神秘主義！";
		mes "隠し事が得意ということですね。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "……仮名？";
		mes "神秘主義？";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "その服装からすると";
		mes "レハールは悪魔祓いがお仕事なのかい？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "あ、はい、そうです。";
		mes "幼時から、カピトーリナ修道院で";
		mes "過ごしましたので。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "神のしもべというわけだ！";
		mes "ところで、プロンテラの王家とは";
		mes "どういう関係？";
		mes "もしかして、王子様だったりする？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "え～っとですね。";
		mes "王子とか、そういうのではないんです。";
		mes "私の母、フロスヒルデは先王の妹";
		mes "つまり、ゲオルグ家の末娘です。";
		next;
		mes "[レハール]";
		mes "もう隠す必要はないと思いますが……";
		mes "母はゲオルグ家にかけられた";
		mes "「ヨルムンガンドの呪い」を気にして";
		mes "私を修道院に預けることにしたんです。";
		next;
		mes "[レハール]";
		mes "修道院には、先王の兄妹であり";
		mes "母の姉に当たる";
		mes "ヴォークリンデ様と";
		mes "ヴェルグンデ様もおられて";
		mes "呪いについて研究しておられました。";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[レハール]";
		mes "ただ……";
		mes "結局は先王の直系の御子息に";
		mes "呪いが発現して……";
		mes "叔母様たちはショックだったようです。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ゲオルグ家にかけられた";
		mes "ヨルムンガンドの呪いを断ち切ることを";
		mes "決意された叔母様達は";
		mes "機会を得て、ヨルムンガンドと縁のある";
		mes "イスガルドに向かわれたのです。";
		next;
		mes "[レハール]";
		mes "私も解呪のスキルを使って";
		mes "イスガルドで叔母様たちの";
		mes "手伝いをしています。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "イスガルドは";
		mes "どのような場所なのですか？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "凍てついた場所ですね。";
		mes "どこを見ても雪と氷ばかりです。";
		mes "ああ、でもご心配なく。";
		mes "私達が拠点としている";
		mes "「^0000FF氷の城^000000」は暖かい場所ですよ。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "え～～っと、何だったかな？";
		mes "「レオン」様が何かの力を";
		mes "どうにかしていると聞いてますが……";
		mes "はははは！";
		mes "忘れてしまいました！";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "注意すべきことはある？";
		mes "イルシオンの奴らがいるなら";
		mes "用心に越したことは無い。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "最近「ルガン」というモノたちの";
		mes "動きが活発になってきたそうです。";
		mes "そのイルシオンと言う者たちと";
		mes "関係があるのかもしれません。";
		next;
		cutin "ep172_beta.bmp", 1;
		mes "[ジンジャー]";
		mes "アテンションプリーズ！";
		mes "飛行船イフ号は間もなく";
		mes "イスガルドに到着するだや！";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "到着のようですね。";
		mes "まずは「氷の城」に案内します。";
		mes "私達が拠点としている場所ですよ。";
		close2;
		cutin "ep19_lehar01.png", 255;
		delquest 18129;
		setquest 18124;
		set EP19_1QUE,9;
		//showevent 0, 1, ジンジャー#ep19gg03;	// 2505: 46, 71
		//showevent 9999, 0, レハール#ep19lehar03;	// 2509: 32, 63
		//showevent 6, 3, ジンジャー#ep19gg01;	// 5579: 30, 264
		end;
	case 9:
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ヘルロックの魔法のソリもいいけど";
		mes "飛行船も良いですね。";
		mes "さて、まずは降りましょうか。";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,216,51,5	script	ジンジャー#ep19gg04	10354,14,14,{/* 2510 */
	switch(EP19_1QUE) {
	case 9:
		cutin "ep172_beta.bmp", 2;
		mes "[ジンジャー]";
		mes "ジンジャーはイフ号の担当者だから";
		mes "ここで待機中だや。";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	default:
		mes "[ジンジャー]";
		mes "もしかして、飛行船に乗って";
		mes "行きたいところがあるの？";
		next;
		if(select("行きたい場所がある","今は必要ないです") == 2) {
			mes "[ジンジャー]";
			mes "わかった！";
			mes "行きたい場所があれば";
			mes "いつでも要請して。";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		mes "[ジンジャー]";
		mes "外は寒いもんね。";
		mes "行先は中で聞くから。";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "air_if.gat", 53, 71;
		end;
	}
OnTouch:
	switch(EP19_1QUE) {
	case 9:
		//showevent 0, 1, レハール#ep19lehar04;	// 2514: 221, 53
		//showevent 9999, 0, ヘルロック#ep19;	// 2910: 211, 63
		cloakoffnpc "レイジー#ep19lazyjt";
		cloakoffnpc "マラム#ep19maramjt";
		cloakoffnpc "ミリアム#ep19miriamjt";
		cloakoffnpc "レハール#ep19lehar04";
		end;
	case 10:
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		end;
	}
}

jor_tail.gat,216,54,5	script	レイジー#ep19lazyjt	10454,{/* 2511 (cloaking)*/
	unittalk "レイジー : わふぅ～～！　見てこれ！　極寒の海だ！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,220,51,7	script	マラム#ep19maramjt	10376,{/* 2512 (cloaking)*/
	unittalk "マラム : こんなに氷がたくさんある場所は、初めてです！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,223,50,7	script	ミリアム#ep19miriamjt	10377,{/* 2513 (cloaking)*/
	unittalk "ミリアム : もっと着込んでおけば、良かったかも……",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,221,53,3	script	レハール#ep19lehar04	10469,{/* 2514 (cloaking)*/
	switch(EP19_1QUE) {
	case 9:
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "お！　「氷の城」から近い位置に";
		mes "着地しましたね。";
		mes "私も普段はここから氷の城に";
		mes "向かっています。";
		next;
		mes "[レハール]";
		mes "ああ、ちょうど氷の城から";
		mes "誰か来たみたいです。";
		next;
		cutin "ep19_iwin11.png", 2;
		mes "[アーウィン兵]";
		mes "なぁんだ。";
		mes "レハールだっけ？";
		mes "見たことの無いものが飛んで来るから";
		mes "様子を見に来たんだけど。";
		next;
		mes "[アーウィン兵]";
		mes "そいつらは誰？";
		mes "レハールの友達？";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "そうそう！　友達だよ！";
		mes "「レオン」様の許可ももらっている。";
		mes "これから氷の城に案内するところ。";
		next;
		mes "[レハール]";
		mes "さあ、拠点となる";
		mes "「氷の城」へ向かいましょう。";
		mes "まずは北に向かってください。";
		mes "マップに印もつけておきますね。";
		close2;
		cutin "ep19_lehar01.png", 255;
		delquest 18124;
		setquest 18125;	
		set EP19_1QUE,10;
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		//showevent 0, 1, #to_jor_back1_3;	// 2454: 219, 294
		//showevent 9999, 0, レハール#ep19lehar04;	// 2514: 221, 53
		//showevent 0, 1, #to_icecastle;	// 2456: 385, 229
		//showevent 0, 1, #to_icas_in;	// 2470: 213, 175
		//showevent 0, 1, レハール#ep19lehar06;	// 2525: 141, 216
		end;
	case 10:
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "さあ、拠点となる";
		mes "「氷の城」へ向かいましょう。";
		mes "まずは北に向かってください。";
		mes "マップに印もつけておきますね。";
		close2;
		cutin "ep19_lehar01.png", 255;
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,215,291,0	script	#ep19_evt07	139,14,4,{/* 2515 */
	cloakonnpc "レハール#jor_tail_1";
	if(EP19_1QUE == 10) {
		cloakoffnpc "レハール#jor_tail_1";
		unittalk getnpcid(0,"レハール#jor_tail_1"),"レハール : こちらです！";
	}
	end;
}

jor_tail.gat,215,291,5	script	レハール#jor_tail_1	10469,{/* 2516 (cloaking)*/
	unittalk "レハール : こちらです！";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,221,57,3	script	アーウィン兵#ep19iwin01	21515,{/* 2517 */
	cutin "ep19_iwin11.png", 2;
	mes "[アーウィン兵]";
	if(EP19_1QUE == 10) {
		mes "「氷の城」に続く道は";
		mes "少々曲がりくねってる。";
		mes "ほら、地図に標識を付けてあげよう。";
		close2;
		cutin "ep19_iwin11.png", 255;
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		end;
	}
	mes "この飛行船とやらは";
	mes "私達が見守っているから";
	mes "心配しなくていいぞ。";
	close2;
	cutin "ep19_iwin11.png", 255;
	end;
}

jor_tail.gat,223,54,3	script	アーウィン兵#ep19iwin02	21515,{/* 2518 */
	cutin "ep19_iwin04.png", 2;
	mes "[アーウィン兵]";
	mes "羽根の一枚も無いなんて～！";
	mes "そんな恰好で寒くないの？";
	close2;
	cutin "ep19_iwin04.png", 255;
	end;
}

jor_back1.gat,222,22,0	script	#ep19_evt_1	139,14,14,{/* 2519 */
	if(EP19_1QUE == 10)
		viewpoint 1, 385, 229, 1, 0xFFFF00;
	end;
}

jor_back1.gat,377,229,0	script	#ep19_evt_2	139,5,5,{/* 2520 */
	cloakonnpc "レハール#ep19lehar05";
	if(EP19_1QUE == 10)
		cloakoffnpc "レハール#ep19lehar05";
	end;
}

jor_back1.gat,381,232,3	script	レハール#ep19lehar05	10469,{/* 2521 (cloaking)*/
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "この先が守護者の街「氷の城」です。";
	mes "街の奥に拠点があります。";
	mes "さあ、行きましょう。";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,204,165,0	script	#ep19_evt_3	139,7,7,{/* 2522 */
	cloakonnpc "レハール#ep19lehar_1";
	if(EP19_1QUE == 10)
		cloakoffnpc "レハール#ep19lehar_1";
	end;
}

icecastle.gat,204,165,3	script	レハール#ep19lehar_1	10469,{/* 2523 (cloaking)*/
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "ここが私たちの拠点です。";
	mes "どうぞお入りください。";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,141,216,0	script	#ep19_cas_1	139,14,14,{/* 2524 */
	switch(EP19_1QUE) {
	case 10:
		cloakoffnpc "レハール#ep19lehar06";
		end;
	case 11:
		cloakoffnpc "レイジー#ep19lazy03";
		cloakoffnpc "マラム#ep19maram04";
		cloakoffnpc "ミリアム#ep19miriam04";
		cloakoffnpc "レオン#ep19leon01";
		cloakoffnpc "オーレリー#ep19arl01";
		end;
	case 12:
		cloakoffnpc "レオン#ep19leon01";
		end;
	case 13:	// 未調査
	case 14:
		end;
	}
	end;
}

icas_in.gat,141,216,3	script	レハール#ep19lehar06	10469,{/* 2525 (cloaking)*/
	switch(EP19_1QUE) {
	case 10:
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "どうです？";
		mes "思ったより城の中は";
		mes "寒くないでしょう？";
		cloakoffnpc "レイジー#ep19lazy03";
		cloakoffnpc "マラム#ep19maram04";
		cloakoffnpc "ミリアム#ep19miriam04";
		next;
		cloakoffnpc "レオン#ep19leon01";
		cloakoffnpc "オーレリー#ep19arl01";
		unittalk getnpcid(0,"レオン#ep19leon01"),"レオン: お客様がいらっしゃったようだ。";
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "はじめまして。";
		mes "プティ家の「レオン」と申します。";
		mes "故あってここ「氷の城」で";
		mes "守護者の任に就いています。";
		mes "レオン、と呼び捨てにしていただいて";
		mes "構いません。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "同じく、プティ家の「オーレリー」よ。";
		mes "私のことも呼び捨てにして結構。";
		mes "その方が気楽だしね。";
		mes "ふぅん、冒険者か……";
		mes "冒険者を見るのも久しぶり。";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "貴方達の探している物と";
		mes "最近観測されている";
		mes "イスガルドの異変との間には";
		mes "関係があるかもしれないと";
		mes "レハールの手紙には書いてありました。";
		next;
		menu "ラヘルでの出来事を説明する",-;
		cutin "ep19_aurelie03.png", 0;
		mes "[オーレリー]";
		mes "ユミルの心臓の欠片を";
		mes "奪った者たちが来ているのか……。";
		next;
		cutin "ep19_leon04.png", 2;
		mes "[レオン]";
		mes "その者たちが結界の一部に";
		mes "穴を開けたと考えられるな。";
		next;
		cutin "ep19_aurelie03.png", 0;
		mes "[オーレリー]";
		mes "ヨルムンガンドに関心を持っているなら";
		mes "「ルガン」と結託している";
		mes "可能性も高いわ。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "結界を維持する為にも";
		mes "ルガンたちの監視を強化して";
		mes "対策を検討しないとね。";
		next;
		cloakoffnpc "ヴェルグンデ#ep19vell01";
		cloakoffnpc "ヴォークリンデ#ep19vog0";
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "なにやら騒がしいと思って来てみれば";
		mes "お客さんがこんなたくさん！";
		mes "遠路はるばる、よく来たね。";
		mes "歓迎するよ。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "レオン様、オーレリー様。";
		mes "自己紹介は";
		mes "もう済まされたのですか？";
		mes "……その様子だと、まだのようですね。";
		next;
		cutin "ep19_leon02.png", 2;
		mes "[レオン]";
		mes "ああ、これは失礼した。";
		mes "結界に関することになると";
		mes "他のことが考えられなくなってしまう。";
		next;
		cutin "ep19_aurelie04.png", 0;
		mes "[オーレリー]";
		mes "私達の悪い癖ね……";
		mes "勝手に話を進めてしまって";
		mes "ごめんなさい。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "いやいや、気になさらず。";
		mes "お二人がお知りになりたい情報は";
		mes "あとで詳しく説明しましょう。";
		mes "シュバルツバルドの";
		mes "レイジーと申します。";
		next;
		cutin "ep18_miriam_02.png", 0;
		mes "[ミリアム]";
		mes "アルナベルツのミリアムです。";
		mes "お招きいただきありがとうございます。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "同じくアルナベルツのマラムです。";
		mes "お世話になります。";
		next;
		cutin "ep19_voglinde04.png", 0;
		mes "[ヴォークリンデ]";
		mes "（ふむ……";
		mes "　シュバルツバルドや";
		mes "　アルナベルツの人間も。";
		mes "　なにかしら厄介なことが";
		mes "　起きているようね……）";
		next;
		cutin "ep19_voglinde03.png", 0;
		mes "[ヴォークリンデ]";
		mes "私はゲオルグ家の「ヴォークリンデ」。";
		mes "ここで、ヨルムンガンド教団の奴ら……";
		mes "「ルガン」と闘りあっている。";
		mes "腕っぷしの強そうな若人が来てくれて";
		mes "嬉しい限りよ。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "いやぁ～私以外は全員";
		mes "若くて丈夫ですよ～。";
		mes "レハールのお母様もお若いですね！";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "あら、口が達者なこと！";
		mes "それに私は、レハールの叔母よ。";
		mes "ここは過酷な環境だから";
		mes "レハールみたいな青二才には";
		mes "荷が重いかもだけど";
		mes "その様子なら心配なさそうだわ。";
		next;
		mes "[ヴォークリンデ]";
		mes "みんな、ご飯は食べて来たの？";
		mes "まだなら後で一緒に食べましょう。";
		mes "ご馳走を用意させてもらうわ。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "（姉さん、若い子相手に";
		mes "　はりきっちゃって……）";
		next;
		mes "[ヴェルグンデ]";
		mes "ゲオルグ家の「ヴェルグンデ」よ。";
		mes "私は主に、ヨルムンガンドや";
		mes "ルガンたちが使う呪術についての";
		mes "研究を行っているわ。";
		next;
		mes "[ヴェルグンデ]";
		mes "ルガンたちのことについても";
		mes "教えてあげられると思う。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "いつまでもここで";
		mes "立ち話をするわけにもいかないわね。";
		mes "場所を移しましょうか。";
		mes "えっと、そのイルシオンとかいう";
		mes "組織について詳しいのは？";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "はいは～～い！";
		mes "こんなこともあろうかと";
		mes "分厚い資料も用意してきました。";
		mes "何でも聞いてください。";
		next;
		cutin "ep19_vellgunde01.png", 1;
		mes "[ヴェルグンデ]";
		mes "では、いったん各自の仕事に戻ろう。";
		mes "私も研究室に戻るから";
		mes "話が聞きたい時は";
		mes "城の裏にある兵舎の中の";
		mes "研究室まで来てちょうだい。";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "落ち着いたら、お茶でも飲みましょう。";
		mes "レハールは、頼んでいた件があるから";
		mes "後で私のところに来るように。";
		mes "報告を聞かせてちょうだい。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "頼まれていたことは";
		mes "全て済ませてきましたよ？";
		mes "後で報告させてもらいます。";
		close2;
		cloakonnpc "ヴェルグンデ#ep19vell01";
		cloakonnpc "ヴォークリンデ#ep19vog0";
		delquest 18125;
		setquest 18126;
		set EP19_1QUE,11;
		cutin "ep19_voglinde03.png", 255;
		//showevent 9999, 0, レハール#ep19lehar06;	// 2525: 141, 216
		//showevent 0, 1, レオン#ep19leon01;	// 2526: 138, 220
		//showevent 9999, 0, オーレリー#e19ms00;	// 2546: 34, 189
		//showevent 9999, 0, ホルル#e19ms00;	// 2547: 32, 184
		//showevent 9999, 0, チェロロン#ep19re2;	// 2678: 245, 197
		//showevent 9999, 0, レイジー#ep19re2;	// 2680: 245, 197
		//showevent 9999, 0, ミリアム#ep19re1;	// 2681: 249, 199
		//showevent 9999, 0, ホルル#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ヴェルグンデ#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, レイジー#i19ms00;	// 2688: 246, 119
		//showevent 9999, 0, オーレリー#i19ms00;	// 2693: 249, 113
		//showevent 9999, 0, ゾリャラ#ep19_dq_kitche;	// 2780: 241, 66
		//showevent 9999, 0, レオン#ep19leon02;	// 2781: 42, 252
		//showevent 9999, 0, ミリアム#ep19_dq_victim;	// 2783: 48, 252
		//showevent 9999, 0, ミリアム#ep19miriam06;	// 2787: 260, 180
		//showevent 9999, 0, マラム#ep19maram05;	// 2788: 262, 179
		//showevent 9999, 0, ヴォークリンデ#ep19;	// 2904: 163, 226
		//showevent 9999, 0, マラム#ep19;	// 2908: 130, 201
		//showevent 9999, 0, レハール#ep19;	// 2909: 136, 197
		end;
	case 11:
		cloakoffnpc "レイジー#ep19lazy03";
		cloakoffnpc "マラム#ep19maram04";
		cloakoffnpc "ミリアム#ep19miriam04";
		cloakoffnpc "レオン#ep19leon01";
		cloakoffnpc "オーレリー#ep19arl01";
		unittalk "レハール : レオン様のお話を聞きましょう。",1;
		end;
	case 12:
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "私はここで伯母様たちの";
		mes "手伝いをしています。";
		mes "母も来たがっていましたが";
		mes "体が弱いもので……。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "雑用を押し付けられてばかりでしたが";
		mes "冒険者様が来てくださったおかげで";
		mes "少しは楽になるかもしれません！";
		mes "一緒に頑張りましょうね！";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,138,220,4	script	レオン#ep19leon01	10464,{/* 2526 (cloaking)*/
	switch(EP19_1QUE) {
	case 11:
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "情報量が多くて大変でしょう。";
		mes "ひとつずつ説明しますね。";
		mes "まずはここ「イスガルド」について。";
		next;
		mes "[レオン]";
		mes "すでに御覧になられたでしょうが";
		mes "イスガルドは氷の大陸です。";
		mes "しかし、地質学的な意味においては";
		mes "大陸ではありません。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "イスガルドは、巨大なヨルムンガンドの";
		mes "凍り付いた体でできているの。";
		mes "そこに、ヨルムンガンドを奉祀する";
		mes "ルガンたち「教団」の構成員が";
		mes "留まっている状況よ。";
		next;
		menu "では結界の役割は？",-;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "イスガルドを取り巻く結界は";
		mes "ヨルムンガンドを封印するのではなく";
		mes "ルガンたちが外に出ないようにするための";
		mes "巨大な牢獄なのです。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "ここが巨大な牢獄であるなら";
		mes "おふたりは、看守？";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "間違ってはいませんが";
		mes "「守護者」と呼んでいただけますか。";
		mes "「アーウィン」たちは";
		mes "「守護者」と呼ばれることに";
		mes "誇りを持っていますからね。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "「アーウィン」というのは";
		mes "ここに到着した時に出迎えてくれた";
		mes "巨大な……鳥……？";
		mes "みたいな方たちのことですか？";
		next;
		cutin "ep19_aurelie04.png", 0;
		mes "[オーレリー]";
		mes "あはは！";
		mes "驚くのも無理はないかな。";
		mes "彼らは元々、巨大な山脈間を往来する";
		mes "渡り鳥だったけど、偶然";
		mes "封印の場に居合わせてしまったの。";
		next;
		cutin "ep19_aurelie02.png", 0;
		mes "[オーレリー]";
		mes "以来、私達と一緒に結界を監視しながら";
		mes "この地を守っているのよ。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "この地で何かを探すのであれば";
		mes "アーウィンたちから話を聞いたり";
		mes "行動を共にするのが良いでしょう。";
		mes "今もイスガルドのあちこちを";
		mes "パトロールしているはずです。";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "もちろん、ここで休まれるのも";
		mes "良いでしょう。";
		mes "バルムント様が往来していた時に";
		mes "利用していた客室がありますので。";
		next;
		menu "バルムントが来ていたのですか？",-;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "あの人も、ここに来なくなって";
		mes "しばらく経つけど……";
		mes "元気にしてるのかしら？";
		mes "あら、今は関係ない話だったわね。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "それじゃあ、行動派の";
		mes strcharinfo(0)+"は";
		mes "アーウィンたちに会ってきてくれる？";
		mes "私はここで守護者のお二人に";
		mes "いろいろ説明しておくから。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ボクは、このお城の中で";
		mes "ユミルの心臓の欠片について";
		mes "聞いて回ってみる。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "では、私は必要となりそうな";
		mes "補給物資の洗い出しと";
		mes "輸送方法を検討しておきます。";
		mes "ジンジャーさんに飛行船を使えないか";
		mes "相談しなければ。";
		next;
		cutin "ep19_aurelie02.png", 0;
		mes "[オーレリー]";
		mes "城の中は私が案内しよう。";
		mes "ああ、そうだ。";
		mes "レハール君、「雪花の花びら」を";
		mes "見せてあげて。";
		next;
		menu "雪花の花びら？",-;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "これが「雪花の花びら」です。";
		mes "魔力が雪のように結晶化したもので";
		mes "通貨の代わりに使われているんです。";
		next;
		mes "[レハール]";
		mes "アーウィン達の手伝いをすれば";
		mes "もらえるはずですから";
		mes "集めてみてくださいね。";
		next;
	case 12:
		if(EP19_1QUE == 11) {
			delquest 18126;
			setquest 18127;
			setquest 18128;
			set EP19_1QUE,12;
			mes "[レハール]";
			mes "さて、私も仕事に出かけますか。";
			mes "よろしければ、一緒に行きませんか？";
			next;
			//showevent 0, 1, レオン#ep19leon01;	// 2526: 138, 220
			//showevent 0, 3, ヴォークリンデ#ep19;	// 2904: 163, 226
			//showevent 0, 1, パトロール隊長#iws;	// 2533: 23, 115
			cutin "ep19_lehar01.png", 255;
		}
		else if(EP19_1QUE == 12) {
			cloakoffnpc "レオン#ep19leon01";
			cloakoffnpc "レイジー#ep19lazy03";
			cloakonnpc "マラム#ep19maram04";
			cloakonnpc "ミリアム#ep19miriam04";
			cloakonnpc "オーレリー#ep19arl01";
			cloakonnpc "レハール#ep19lehar06";
			cutin "ep19_leon03.png", 2;
			mes "[レオン]";
			mes "案内が必要ですか？";
			next;
			cutin "ep19_leizi01.png", 2;
			mes "[レイジー]";
			mes strcharinfo(0)+"は";
			mes "アーウィンたちに会ってきてくれる？";
			mes "私はここで守護者のお二人に";
			mes "いろいろ説明しておくから。";
			next;
			cutin "ep19_leizi01.png", 255;
		}
		mes "‐どちらへ向かおうか？‐";
		next;
		switch(select("パトロール隊長のところ(メインストーリー)","ヴォークリンデのところ(サブストーリー)")) {
		case 1:
			mes "‐パトロール隊長のところ(メインストーリー)へ向かいますか？‐";
			next;
			if(select("向かう","やめる") == 2) {
				mes "‐その場にとどまった‐";
				close;
			}
			mes "‐パトロール隊長のところ(メインストーリー)へ向かった‐";
			close2;
			warp "icecastle.gat", 23, 123;
			end;
		case 2:
			mes "‐ヴォークリンデのところ(サブストーリー)へ向かいますか？‐";
			next;
			if(select("向かう","やめる") == 2) {
				mes "‐その場にとどまった‐";
				close;
			}
			mes "‐ヴォークリンデのところ(サブストーリー)へ向かった‐";
			close2;
			cloakonnpc "レイジー#ep19lazy03";
			cloakonnpc "マラム#ep19maram04";
			cloakonnpc "ミリアム#ep19miriam04";
			cloakonnpc "レオン#ep19leon01";
			cloakonnpc "オーレリー#ep19arl01";
			cloakonnpc "レハール#ep19lehar06";
			warp "icas_in.gat", 160, 223;
			end;
		}
	}
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:レオン#ep19leon01(2526)
	cloakonnpc;
	end;
}

icas_in.gat,141,220,3	script	オーレリー#ep19arl01	10465,{/* 2527 (cloaking)*/
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:オーレリー#ep19arl01(2527)
	cloakonnpc;
	end;
}

icas_in.gat,136,219,4	script	ヴェルグンデ#ep19vell01	10468,{/* 2528 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,144,218,3	script	ヴォークリンデ#ep19vog0	10467,{/* 2529 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,137,211,7	script	レイジー#ep19lazy03	10454,{/* 2530 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,139,210,1	script	マラム#ep19maram04	10376,{/* 2531 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,141,210,1	script	ミリアム#ep19miriam04	10377,{/* 2532 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,23,115,8	script	パトロール隊長#iws	21518,{/* 2533 */
	if(EP19_1QUE < 12) {
		mes "[パトロール隊長]";
		mes "イスガルドへようこそ！";
		mes "我々は「イーグルパトロール隊」！";
		mes "「凍て付いた鱗」地域を";
		mes "パトロールする誇り高い部隊なのです！";
		next;
		mes "[パトロール隊長]";
		mes "今後、貴方たちのような冒険者が";
		mes "この地を訪れるようになれば";
		mes "親交を深めるためにぜひ一緒に";
		mes "パトロールに出掛けたいですね。";
		mes "その時が来るのをお待ちしてます！";
		close;
	}
	if(EP19_1QUE == 12) {
		mes "[パトロール隊長]";
		mes "イスガルドへようこそ！";
		mes "我々は「イーグルパトロール隊」！";
		mes "「凍て付いた鱗」地域を";
		mes "パトロールする誇り高い部隊なのです！";
		next;
		mes "[パトロール隊長]";
		mes "今後、貴方たちのような冒険者が";
		mes "この地を訪れるようになれば";
		mes "親交を深めるためにぜひ一緒に";
		mes "パトロールに出掛けたいですね。";
		next;
		mes "[パトロール隊長]";
		mes "おっと、挨拶がまだでした！";
		mes "私は隊長の、マーシャ・ジジ・ハッピー・レーヴ・イヴ・アリス・ロイド・ブロード＝マインディド・テス・ボアテックスと申す。";
		next;
		cloakoffnpc "一等兵ホリリュ#exiwp";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"一等兵ホリリュ#exiwp"),"ホリリュ: ホロリョ隊長！　ホリリュ一等兵、報告いたします！";
		if(!sleep2(700)) end;
		unittalk "パトロール隊長 : うん！　問題はないか？";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"一等兵ホリリュ#exiwp"),"ホリリュ : 問題ありません！　報告終わり！";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"一等兵ホリリュ#exiwp"),"ホリリュ : あれ？　その人は、新しく充員されたという冒険者でありますか？";
		if(!sleep2(700)) end;
		unittalk "パトロール隊長 : そうだ！　とにかくご苦労。休んでよし！";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"一等兵ホリリュ#exiwp"),"ホリリュ: はい！　ホリリュ一等兵、休みます！";
		if(!sleep2(700)) end;
		cloakonnpc "一等兵ホリリュ#exiwp";
		mes "[パトロール隊長]";
		mes "話の途中で失礼した。";
		mes "部下の報告を受けるのも";
		mes "隊長の立派な役目なので。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ホロリョというんですね？";
		next;
		unittalk "パトロール隊長 : (ちっ！　これだから外から来た奴は……)";
		mes "[パトロール隊長]";
		mes "……おほん！";
		mes "まあ、楽な呼び方でも良いです。";
		mes "折角ですから、パトロール隊に";
		mes "加入してみませんか？";
		next;
		mes "[パトロール隊長]";
		mes "この加入資料に必要事項を";
		mes "記載すれば手続きは完了です。";
		mes "パトロールの任務遂行上";
		mes "最低限の身元の確認が必要なので。";
		next;
		mes "[イーグルパトロール隊の加入書類]";
		mes "・ルガンではありませんよね？";
		mes "・身体は健康ですか？";
		mes "・心にゆとりはありますか？";
		mes "・パトロールには毎日参加可能？";
		mes "----";
		mes "問題無いなら署名お願いします。";
		next;
		menu "署名する",-;
		mes "[パトロール隊長]";
		mes "ほう！　かっこいい署名だね。";
		mes "そうとう練習したに違いない。";
		mes "では、イーグルパトロール隊の";
		mes "名誉隊員として登録させてもらおう。";
		next;
		delquest 18127;
		setquest 130470;	//showevent 0, 1, パトロール隊長#iws;	// 2533: 23, 115
		set EP19_1QUE,13;
		mes "[パトロール隊長]";
		mes "さっそくパトロールに出掛けよう。";
		mes "まずは一人のパーティーを作るんだ。";
		mes "準備が出来たら、私に声を掛けてくれ。";
		close;
	}
	if(EP19_1QUE == 14) {
		mes "[パトロール隊長]";
		mes "はじめてのパトロール";
		mes "お疲れ様！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（パトロールの途中で出会った";
		mes "　青年のことが気になるな……";
		mes "　^ff0000「凍て付いた鱗の平原」^000000で";
		mes "　青年を探してみようか）";
		close;
	}
	if(EP19_1QUE >= 15) {
		mes "[パトロール隊長]";
		mes "イスガルドへようこそ！";
		mes "我々は「イーグルパトロール隊」！";
		mes "「凍て付いた鱗」地域を";
		mes "パトロールする誇り高い部隊なのです！";
		close;
	}
	mes "[パトロール隊長]";
	mes "初めてのパトロールだね？";
	mes "ベテランのパトロール隊員たちと";
	mes "一緒だから何も心配はいらない！";
	next;
	mes "^e6328cメモリアルダンジョン";
	mes "「はじめてのパトロール」の";
	mes "生成と入場が行えます。";
	next;
	if(mdopenstate("はじめてのパトロール"))
		set '@menu$,"^0b0b33メモリアルダンジョンへ入場";
	else if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@menu$,"^0b0b33メモリアルダンジョンの作成";
	else
		set '@menu$,"";
	switch(select("^191970立ち去る",'@menu$,"^0b0b33注意事項の確認")) {
	case 1:
		mes "‐その場を離れた‐";
		close;
	case 2:
		if(mdopenstate("はじめてのパトロール")) {
			mes "[パトロール隊長]";
			mes "それでは、パトロールに出発だ!!";
			next;
			if(select("^191970少し考える","^e6328cはじめてのパトロールへ向かう") == 1) {
				mes "‐その場を離れた‐";
				close;
			}
			mes "‐転送装置で先へ進んだ‐";
			close2;
			if(getonlinepartymember() > 1) {
				mes "^8c32e6このメモリアルダンジョンは、";
				mes "1人用です。";
				mes "パーティーメンバーが";
				mes "2人以上の場合は入場できません。";
				mes "もう一度確認してから";
				mes "やり直してください。";
				close;
			}
			switch(mdenter("はじめてのパトロール")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[はじめてのパトロール] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("FirstPatrolControl1")+ "::OnStart";
				//warp "1@iwp.gat", 380, 229;
				end;
			case 1:	// パーティー未加入
				mes "^8c32e6パーティーが解体されているため";
				mes "入場できません。";
				mes "もう一度確認してから";
				mes "やり直してください。";
				close;
			case 2:	// ダンジョン未作成
				mes "^8c32e6パーティーリーダーが";
				mes "メモリアルダンジョンを";
				mes "生成していない状態です。";
				close;
			default:	// その他エラー
				close;
			}
		}
		else {
			if(getonlinepartymember() < 1) {
				mes "^8c32e6空白のパーティー名では、";
				mes "メモリアルダンジョンを";
				mes "作成することは出来ません。";
				close;
			}
			mes "メモリアルダンジョンを作成しますか？";
			next;
			if(select("^191970少し考える","^e6328c作成する") == 1) {
				mes "[パトロール隊長]";
				mes "急いでいるわけではないが";
				mes "時間の都合がついたら、また来てくれ。";
				mes "隊員たちも新しい隊員を";
				mes "待っているからね！";
				close;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0))
				close;
			mdcreate "はじめてのパトロール";
			mes "■パーティー名";
			mes "^009eff"+strcharinfo(1)+"^000000";
			mes "■パーティーリーダー";
			mes "^009eff"+strcharinfo(0)+"^000000";
			mes "　";
			mes "^006400はじめてのパトロールの";
			mes "作成申請を受け付けました。^000000";
			close;
		}
	case 3:
		mes "詳しくはこちらをご確認ください。";
		mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:パトロール隊長#iws(2533)
	end;
}

icecastle.gat,21,118,6	script	一等兵ホリリュ#exiwp	21516,{/* 2534 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,25,113,4	script	公告#iwp_1	857,{/* 2535 */
	mes "[公募]";
	mes "「イーグルパトロール隊」では";
	mes "共にパトロールの任に当たる";
	mes "責任感のある冒険者を募集します。";
	next;
	mes "[資格要件]";
	mes "・身体健康で意思疎通のできる";
	mes "　ルガン以外の全ての種族";
	next;
	mes "[問い合わせ先]";
	mes "<イーグルパトロール隊>";
	mes "[パトロール隊長] マーシャ・ジジ・ハッピー・レーヴ・イヴ・アリス・ロイド・ブロード＝マインディド・テス・ボアテックス";
	close;
}

icecastle.gat,178,229,4	script	公告#iwp_2	857,{/* 2536 */
	mes "[公募]";
	mes "「イーグルパトロール隊」では";
	mes "共にパトロールの任に当たる";
	mes "責任感のある冒険者を募集します。";
	next;
	mes "[資格要件]";
	mes "・身体健康で意思疎通のできる";
	mes "　ルガン以外の全ての種族";
	next;
	mes "[問い合わせ先]";
	mes "<イーグルパトロール隊>";
	mes "[パトロール隊長] マーシャ・ジジ・ハッピー・レーヴ・イヴ・アリス・ロイド・ブロード＝マインディド・テス・ボアテックス";
	close;
}

jor_back2.gat,250,30,0	script	マヒル登場用#flunch	139,14,14,{/* 2537 */
	if(EP19_1QUE == 14) {
		cloakoffnpc "謎の青年#flunch";
		unittalk getcharid(3),strcharinfo(0)+" : あれ？！あの青年は？",1;
	}
	else if(EP19_1QUE == 15) {
		cloakoffnpc "謎の青年#flunch";
	}
	else if(EP19_1QUE == 16) {
		cloakonnpc "謎の青年#flunch";
		cloakoffnpc "マヒル#flunch";
	}
	end;
}

jor_back2.gat,231,34,0	script	jor_back2_lunch_sw1	139,{/* 2538 */}
jor_back2.gat,250,49,0	script	jor_back2_lunch_sw2	139,{/* 2539 */}
jor_back2.gat,269,46,0	script	jor_back2_lunch_sw3	139,{/* 2540 */}
jor_back2.gat,250,30,2	script	謎の青年#flunch	10453,{/* 2541 (cloaking)*/
	switch(EP19_1QUE) {
	case 14:
		cutin "ep19_lunch01.png", 2;
		mes "[謎の青年]";
		mes "また会いましたね！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "イルシオンの実験体の……！";
		next;
		mes "[謎の青年]";
		mes "覚えていてくれたのですか？";
		mes "そんな人はこれまでいなかったので";
		mes "嬉しいです！";
		cutin "ep19_lunch02.png", 2;
		next;
		cutin "ep19_lunch01.png", 2;
		mes "[謎の青年]";
		mes "え？　名前？？";
		mes "それならHU-210426と申します。";
		mes "頭のバーコードを読み取れば";
		mes "分かるはずですが？";
		next;
		cutin "ep19_lunch02.png", 2;
		mes "[謎の青年]";
		mes "イルシオンの科学者たちじゃないので";
		mes "そんな道具は持っていませんか。";
		mes "いえ、むしろ逆に安心しました。";
		mes "そうだ、よかったら私に名前を";
		mes "付けてくれませんか？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "マヒル……というのは？";
		mes "ちょうど真昼の時間だし";
		mes "HU-210426と呼ぶより";
		mes "呼びやすいから。";
		next;
		mes "[謎の青年]";
		mes "マヒル…マヒル……";
		mes "うん、呼び易い名前ですね。";
		mes "ではこれからは";
		mes "マヒルと呼んでください。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（気に入ってくれたようだ。";
		mes "　さて……）";
		next;
		menu "どうやって逃げて来たの？",-;
		cutin "ep19_lunch01.png", 2;
		mes "[マヒル]";
		mes "どこから話したらよいものか？";
		mes "ある大きな邸宅で";
		mes "いつものように科学者たちに";
		mes "色んな実験をされていた日のことです。";
		mes "いきなり科学者たちが";
		mes "荷造りを始めました。";
		next;
		mes "[マヒル]";
		mes "その際、放置される実験体もいましたが";
		mes "マヒルは科学者と一緒に飛行船に";
		mes "乗せられました。";
		mes "まあ、よくあることです。";
		next;
		mes "[マヒル]";
		mes "ここに到着した科学者たちは";
		mes "胴の長い種族……ルガンに出会い";
		mes "ルガンと何かをし始めましたが";
		mes "代わりに、私達は放置されました。";
		next;
		mes "[マヒル]";
		mes "放置された実験体は衰弱して";
		mes "やがて動かなくなりました。";
		mes "私は、他の実験体と違って";
		mes "口に何かを入れれば";
		mes "エネルギーが取り出せるので";
		mes "停止はしませんでした。";
		next;
		mes "[マヒル]";
		mes "結局、私ひとりになりましたが";
		mes "退屈で退屈で……";
		mes "そこで「ルガン」に変身して";
		mes "檻の中から脱出してきたんです。";
		next;
		menu "ルガンに変身!?",-;
		cutin "ep19_lunch02.png", 2;
		mes "[マヒル]";
		mes "凄いと思いませんか？";
		mes "初期個体にはできなかった";
		mes "固有の能力です。";
		mes "しかも「変身スクロール」を使えば";
		mes "私以外の人も変身させられます。";
		next;
		mes "[マヒル]";
		mes "なんにでも変身できるわけでは";
		mes "ありませんけど";
		mes "ルガンみたいな種族なら";
		mes "変身可能ですよ。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 5983;
		setquest 5984;
		set EP19_1QUE,15;
		//showevent 0, 1, 謎の青年#flunch;	// 2541: 250, 30
		//showevent 0, 1, ホルル#if19ms;	// 2544: 27, 126
		getitem 101162,1;
		mes "[マヒル]";
		mes "せっかくですから";
		mes "変身用のスクロールをあげます。";
		mes "今回は無料で良いですよ。";
		mes "名前をくれたお礼です。";
		next;
		cutin "ep19_lunch02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（凄いものを手に入れてしまった。";
		mes "　一度、氷の城に戻って";
		mes "　みんなに見てもらおうか）";
		close2;
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icecastle.gat", 27, 121;
		end;
	case 15:
		cutin "ep19_lunch01.png", 2;
		mes "[マヒル]";
		mes "せっかくですから";
		mes "変身用のスクロールをあげます。";
		mes "今回は無料で良いですよ。";
		mes "名前をくれたお礼です。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（凄いものを手に入れてしまった。";
		mes "　一度、氷の城に戻って";
		mes "　みんなに見てもらおうか）";
		next;
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icecastle.gat", 27, 121;
		end;
	}
OnInit:
	setnpctitle "<HU-210426>";	// NPC:謎の青年#flunch(2541)
	cloakonnpc;
	end;
}
jor_back2.gat,250,30,2	script	マヒル#flunch	10453,{/* 2542 (cloaking)*/
	cutin "ep19_lunch01.png", 2;
	mes "[マヒル]";
	mes "「変身スクロール」は";
	mes "役に立っていますか？";
	close2;
	cutin "ep19_lunch01.png", 255;
	end;
OnInit:
	setnpctitle "<HU-210426>";	// NPC:マヒル#flunch(2542)
	cloakonnpc;
	end;
}

icecastle.gat,27,126,0	script	#e19ms00	139,9,9,{/* 2543 */
	if(EP19_1QUE == 10) {
		//showevent 0, 1, #to_icas_in;	// 2470: 213, 175
		viewpoint 1, 213, 175, 1, 0xFFFF00;
	}
	if(EP19_1QUE == 15 || EP19_1QUE == 58)
		cloakoffnpc "ホルル#if19ms";
	else
		cloakonnpc "ホルル#if19ms";
	if(EP19_2QUE == 18 || EP19_2QUE == 19) {
		cloakoffnpc "レハール#ep19_3";
	}
	else {
		cloakonnpc "レハール#ep19_3";
		cloakonnpc "フリーデリケ#ep19入口";
		cloakonnpc "テューリアン#ep19入口";
		cloakonnpc "マークイシャ#ep19入口";
		cloakonnpc "マギスティン#ep19入口";
		cloakonnpc "アルプオカート#ep19入口";
	}
	if(EP19_1QUE >= 100)
		cloakoffnpc "ホルル#ep19_dq_dowsing";
	else
		cloakonnpc "ホルル#ep19_dq_dowsing";
	end;
}

icecastle.gat,27,126,3	script	ホルル#if19ms	10461,{/* 2544 (cloaking)*/
	switch(EP19_1QUE) {
	case 15:
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "何者だ？";
		mes "見覚えの無い奴……。";
		emotion 1;
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ああ！";
		mes "障壁を越えて来たという冒険者か！";
		mes "会えて嬉しい。";
		emotion 0;
		next;
		cutin "ep19_iwin06.png", 255;
		menu "どちら様…？",-;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "おっとこりゃ失礼！";
		mes "パトロールから戻ってきたら";
		mes "見慣れない生き物がいたから";
		mes "気が回らなかったみたいだ。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "私は、^0000cdホルル^000000と言う。";
		mes "アーウィン以外には正式名は";
		mes "発音しづらいらしいから";
		mes "単にホルルと呼んでくれ。";
		mes "ところで君は何をしていたの？";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "偵察に行ってました",-;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ほぉ、君の実力は確かってことか。";
		mes "これから「氷の城」に報告しに行くの？";
		mes "なら、一緒に行こう。";
		mes "ちょうど今後のことで打ち合わせが";
		mes "行なわれると聞いて来たんだよ。";
		next;
		cutin "ep19_iwin06.png", 255;
		cloakonnpc "ホルル#if19ms";
		delquest 5984;
		setquest 17639; showevent 0, 1, オーレリー#e19ms00;	// 2546: 34, 189
		set EP19_1QUE,16;
		mes "‐氷の城 室内へ向かいますか？‐";
		next;
		//showevent 9999, 0, #to_jor_back1;	// 2457: 17, 123
		//showevent 9999, 0, #to_icas_in;	// 2470: 213, 175
		//showevent 9999, 0, #in_house5;	// 2494: 62, 137
		//showevent 9999, 0, パトロール隊長#iws;	// 2533: 23, 115
		//showevent 0, 1, ホルル#if19ms;	// 2544: 27, 126
		//showevent 9999, 0, ホルル#ep19_dq_dowsing;	// 2791: 27, 126
		//showevent 9999, 0, シャリャラ#ep19iwin06;	// 2822: 52, 124
		//showevent 9999, 0, レハール#ep19_3;	// 2916: 27, 123
		//showevent 9999, 0, #in_house1;	// 2917: 59, 213
		if(select("向かう","やめる") == 2) {
			// 未調査
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城 室内へ向かった‐";
		close2;
		warp "icas_in.gat", 35, 186;
		end;
	case 16:
		mes "[ホルル]";
		mes "これから「氷の城」に報告しに行くの？";
		mes "なら、一緒に行こう。";
		mes "ちょうど今後のことで打ち合わせが";
		mes "行なわれると聞いて来たんだよ。";
		mes "　";
		mes "‐氷の城 室内へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城 室内へ向かった‐";
		close2;
		warp "icas_in.gat", 35, 186;
		end;
	case 58:
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "ぎゃぁああ～～っ！";
		mes "なんのつもりだ！";
		mes "どうして、ルガンを連れて来たんだ!?";
		next;
		cutin "ep19_iwin07.png", 255;
		menu "治療する必要があるんです！",-;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "……事情がありそうだな。";
		mes "私の家が近いから";
		mes "いったんそこに運ぼう。";
		mes "話はそこで聞くよ。";
		delquest 16661;
		setquest 17640;
		set EP19_1QUE,59;
		close2;
		//showevent 0, 1, #in_house5;	// 2494: 62, 137
		//showevent 9999, 0, ホルル#if19ms;	// 2544: 27, 126
		//showevent 0, 1, ホルル#i19ms00;	// 2686: 247, 116
		cutin "ep19_iwin06.png", 255;
		cloakonnpc "ホルル#if19ms";
		end;
	case 59:
		// 未調査
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,32,185,0	script	#ep19_cas_2	139,14,14,{/* 2545 */
	switch(EP19_1QUE) {
	case 16:
	case 17:
	case 34:
	case 68:
	case 100:
		cloakoffnpc "オーレリー#e19ms00";
		cloakoffnpc "ホルル#e19ms00";
		cloakoffnpc "レイジー#e19ms00";
		cloakoffnpc "ヴォークリンデ#e19ms00";
		cloakoffnpc "レハール#e19ms00";
		cloakoffnpc "ヴェルグンデ#e19ms00";
		cloakoffnpc "ミリアム#e19ms00";
		cloakoffnpc "レオン#e19ms00";
		cloakoffnpc "マラム#e19ms00";
		end;
	}
}

icas_in.gat,34,189,5	script	オーレリー#e19ms00	10465,{/* 2546 (cloaking)*/
	switch(EP19_1QUE) {
	case 16:
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "待っていたよ。";
		mes "ちょうど今後のことを協議するために";
		mes "集まることにしたの。";
		mes "アーウィンの代表者も";
		mes "参加してくれるわ。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ホルルです。";
		mes "遅れてしまったようで申し訳ない。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "いや、ちょうど全員が揃ったところよ。";
		mes "では、始めましょう。";
		mes "集まってもらった理由は他でもないわ。";
		mes "ルガンたちの最近の活動についてよ。";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[レオン]";
		mes "最近、ルガンたちの動きが";
		mes "活発化しています。";
		mes "^0000cdヨルムンガンド^000000が";
		mes "復活する兆しではないかと";
		mes "懸念しているのです。";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[ヴェルグンデ]";
		mes "これまで奴らは、表立った行動はせず";
		mes "息をひそめていた。";
		mes "恐らく、障壁を越えて侵入した";
		mes "^0000cdイルシオン^000000と関係があると";
		mes "思われます。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "もし、ヨルムンガンドが";
		mes "復活するようなことがあれば";
		mes "ミッドガルド大陸の脅威となる。";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[ミリアム]";
		mes "^0000cdユミルの心臓の欠片^000000を";
		mes "なんとしても取り戻さないと……。";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[ヴォークリンデ]";
		mes "焦っては駄目よ。";
		mes "腕に覚えがあるようだけど";
		mes "無策のまま奴らの巣に乗り込むのは";
		mes "危険過ぎるからね。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "ならば、まずは情報収集だ。";
		mes "ルガンの奴らの本拠地に関する情報は？";
		mes "何かないの？";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[ヴォークリンデ]";
		mes "ふむ……アーウィンの方々は";
		mes "何か把握していませんか？";
		mes "奴らとの付き合いも長いでしょうから";
		mes "知っている事があれば情報を";
		mes "提供していただきたい。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "長い間、調査してきましたが";
		mes "奴らの拠点に関しては";
		mes "その全貌を把握できていません。";
		next;
		mes "[ホルル]";
		mes "拠点である巣穴の入口は";
		mes "一か所のみですが";
		mes "その奥は想像もできないほど深くて";
		mes "網の目状のように広がっています。";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "巣穴に向かって穴を掘り";
		mes "そこから攻撃を仕掛けるとか？";
		mes "そんな簡単な話ではないか……。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "戦力については？";
		mes "組織の構造とか";
		mes "戦闘員の数とか。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "奴らの^0000cd魔力^000000は";
		mes "侮れないものだ。";
		mes "かつて多くの勇士を葬った";
		mes "あの呪術を調べてはいるけど";
		mes "未だ完全に解明できていないわ。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "わぉ……わからないことだらけだ。";
		mes "奴らのことを直接調べるために";
		mes "巣穴に潜入できないかと思ったんだけど";
		mes "ほら、見た目からして違うだろ？";
		mes "遠くから眺めることしかできなかった。";
		next;
		mes "[レイジー]";
		mes "うまいことルガンに変装できれば";
		mes "奴らの巣に潜入して探りを入れることも";
		mes "出来そうなんだがなぁ。";
		next;
		menu "そういえば……",-;
		cutin "ep19_leizi03.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "パトロール中に手に入れたのですが";
		mes "面白い物を持っていますよ。";
		mes "ちょっと試してみましょう。";
		next;
		if(!sleep2(500)) end;
		misceffect 595,"";
		sc_start SC_MONSTER_TRANSFORM,180000,21529;
		if(!sleep2(1500)) end;
		cutin "ep19_iwin07.png", 1;
		mes "[ホルル]";
		mes "ルガンッ!!";
		mes "この邪悪な者どもめっ!!";
		next;
		cutin "ep19_iwin07.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ま、待ってください!!";
		mes "実は……。";
		mes "　";
		mes "^0000FF‐イルシオンの拠点から逃げて来た^000000";
		mes "^0000FF　マヒルから変身スクロールを^000000";
		mes "^0000FF　手に入れたことを説明した‐^000000";
		next;
		misceffect 348,"";	// self
		sc_end SC_MONSTER_TRANSFORM;	// self
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "うわぁ～まじ不思議だね～。";
		mes "よし、そのスクロールを使おう!!";
		mes "ルガンに変身すれば";
		mes "本拠地に忍び込めるぞ。";
		next;
		mes "[レイジー]";
		mes "というわけで";
		mes "そのスクロールを私にくれ。";
		mes "あれ？";
		mes "なんでみんな黙ってるの？";
		unittalk getnpcid(0,"ヴォークリンデ#e19ms00"),"……";
		unittalk getnpcid(0,"レハール#e19ms00"),"……";
		unittalk getnpcid(0,"ヴェルグンデ#e19ms00"),"……";
		unittalk getnpcid(0,"ミリアム#e19ms00"),"……";
		unittalk getnpcid(0,"ホルル#e19ms00"),"……";
		unittalk getnpcid(0,"レオン#e19ms00"),"……";
		unittalk getnpcid(0,"オーレリー#e19ms00"),"……";
		next;
		mes "[レイジー]";
		mes "この場に、ルガンの情報を知ってる者は";
		mes "いないよな？";
		mes "あちらさんの本拠地や戦力について";
		mes "知りたいんじゃないの？";
		mes "情報って大事だから。";
		next;
		mes "[レイジー]";
		mes "あ、もしかして忘れてる？";
		mes "潜入調査は私の十八番。";
		mes "それを職業にしてるんだよ。";
		mes "私より得意な人はいないよね？";
		next;
		mes "[レイジー]";
		mes "だから、私が行くんだよ。";
		mes "変身スクロールを試したいから";
		mes "志願してるわけじゃないぞ。";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[ミリアム]";
		mes "一人で行くのは危険です。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "安全とは程遠い仕事を";
		mes "毎日してるんだけどね？";
		mes "もちろん";
		mes strcharinfo(0)+"にも";
		mes "来てもらう。";
		mes "しっかり守ってもらわなくちゃ。";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[ヴォークリンデ]";
		mes strcharinfo(0)+"の実力を";
		mes "疑うわけじゃないけど";
		mes "敵の懐に入るのだから";
		mes "どうしたって心もとないわね。";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[ヴェルグンデ]";
		mes "とはいえ、大勢で行くわけにも";
		mes "いかないでしょう。";
		mes "少数精鋭が理想なのだけど";
		mes "志願する者がいるかどうか。";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[ミリアム]";
		mes "私が行きます。";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "私もお手伝いします。";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "私も行く。";
		mes "守護者であるアーウィンこそ";
		mes "先頭に立たなければ。";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[ヴェルグンデ]";
		mes "決まりね。";
		mes "ルガンたちはお互いの魔力を";
		mes "感知できるはずだから";
		mes "私が用意した「魔石」を";
		mes "持って行くと良いわ。";
		next;
		mes "[ヴェルグンデ]";
		mes "研究のために";
		mes "ルガンの核から取り出したものよ。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "そうそう！　用意は周到に！";
		mes "私にはたくさんの魔石をください。";
		mes "ほら、私っていかにも";
		mes "魔力がなさそうだから。";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[レオン]";
		mes "皆さん、無理はしないでください。";
		mes "それと、くれぐれも慎重に。";
		mes "敵の拠点に侵入するのですからね。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "この城下から北西の方角にある";
		mes "^ff0000凍て付いた鱗の氷河^000000に";
		mes "奴らの巣の入口があるわ。";
		mes "そこから侵入できるはずよ。";
		next;
		cutin "ep19_aurelie01.png", 255;
		delquest 17639;
		setquest 17619;	//showevent 0, 1, #to_jor_back1;	// 2457: 17, 123　showevent 0, 1, #to_jor_back2;	// 2458: 226, 387　showevent 0, 1, #to_jor_back3;	// 2460: 13, 248　showevent 0, 1, ホルル#e19ms12;	// 2565: 99, 318
		set EP19_1QUE,17;
		mes "‐城の外へ向かいますか？‐";
		next;
		//showevent 9999, 0, レハール#ep19lehar06;	// 2525: 141, 216
		//showevent 9999, 0, レオン#ep19leon01;	// 2526: 138, 220
		//showevent 0, 1, オーレリー#e19ms00;	// 2546: 34, 189
		//showevent 9999, 0, ホルル#e19ms00;	// 2547: 32, 184
		//showevent 9999, 0, チェロロン#ep19re2;	// 2678: 245, 197
		//showevent 9999, 0, レイジー#ep19re2;	// 2680: 245, 197
		//showevent 9999, 0, ミリアム#ep19re1;	// 2681: 249, 199
		//showevent 9999, 0, ホルル#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ヴェルグンデ#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, レイジー#i19ms00;	// 2688: 246, 119
		//showevent 9999, 0, オーレリー#i19ms00;	// 2693: 249, 113
		//showevent 9999, 0, ゾリャラ#ep19_dq_kitche;	// 2780: 241, 66
		//showevent 9999, 0, レオン#ep19leon02;	// 2781: 42, 252
		//showevent 9999, 0, ミリアム#ep19_dq_victim;	// 2783: 48, 252
		//showevent 9999, 0, ミリアム#ep19miriam06;	// 2787: 260, 180
		//showevent 9999, 0, マラム#ep19maram05;	// 2788: 262, 179
		//showevent 0, 3, ヴォークリンデ#ep19;	// 2904: 163, 226
		//showevent 9999, 0, マラム#ep19;	// 2908: 130, 201
		//showevent 9999, 0, レハール#ep19;	// 2909: 136, 197
		//showevent 9999, 0, ヴェルグンデ#ep19vell02;	// 2955: 185, 63
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐城の外へ向かった‐";
		close2;
		warp "icecastle.gat", 22, 123;
		end;
	case 17:
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "この城下から北西の方角にある";
		mes "^ff0000凍て付いた鱗の氷河^000000に";
		mes "奴らの巣の入口があるわ。";
		mes "そこから侵入できるはずよ。";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "‐城の外へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐城の外へ向かった‐";
		close2;
		warp "icecastle.gat", 22, 123;
		end;
	case 34:
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "みんな、無事で良かったわ。";
		mes "さっそくだけど、奴らの巣で知ったことを";
		mes "報告してちょうだい。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "内部構造を調べたが";
		mes "やはり出入り口は一か所だけ。";
		mes "内部は極めて複雑だった。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "岩盤も硬いので";
		mes "秘密裏に新しい入口を掘り";
		mes "そこから攻め入るということも";
		mes "不可能だと思います。";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "戦力についてですが";
		mes "彼らは数が多く";
		mes "最上級から下級まで種類も様々ですが";
		mes "いずれも魔力を備えています。";
		next;
		mes "[レハール]";
		mes "その魔力の為、下級であっても";
		mes "普通の人間では歯が立たないでしょう。";
		next;
		mes "[レハール]";
		mes "組織構成についてですが";
		mes "ルガンたちのトップは";
		mes "^0000cdラスガンド^000000……";
		mes "ヨルムンガンドとの最終決戦においても";
		mes "生き延びた、あの者です。";
		next;
		mes "[レハール]";
		mes "現在は、ラスガンドを中心とした";
		mes "教団を形成しています。";
		mes "上の者の命令は絶対という";
		mes "完全な階級社会です。";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[レオン]";
		mes "統率が取れていると言えますが";
		mes "ラスガンドさえ倒してしまえば";
		mes "なんとかなるかもしれない……。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ラスガンドを狙うには";
		mes "巣の中に攻め込むか";
		mes "外におびき出すしかないが……";
		mes "警備が厳重で近づくどころか";
		mes "見る事さえできなかった。";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "レイジーさん。";
		mes "最上級ルガンの立場を利用して";
		mes "ラスガンドから何か情報を";
		mes "聞き出すことはできないですか？";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "考えなかったわけじゃないよ？";
		mes "ただ、最上級ルガンは";
		mes "数百年生きている奴らもいてさ。";
		mes "生まれたての赤ちゃんでは";
		mes "立ち回りが難しいんだよね。";
		next;
		mes "[レイジー]";
		mes "まあ、期待されてるなら";
		mes "なんとかやってみる。";
		mes "ただ、時間は必要だろうね。";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ラスガンドの周りにいるのは";
		mes "わずかな側近たちと";
		mes "イルシオンの「バゴット」だけです。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "バゴットは、ラスガンドに協力して";
		mes "その見返りに研究の支援を受けている。";
		mes "一種の共生関係ってやつだな。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "バゴット以外にもイルシオンの人間が";
		mes "いると思うのだけど？";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "イルシオンの科学者はバゴットの他に";
		mes "「ユンケア」という者がいます。";
		mes "それとハートハンターたちが多数。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ただ……ユンケアについては";
		mes "以前ほど優遇されていないようです。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ルガンたちと協力関係を築いたのは";
		mes "ユンケアのようですが";
		mes "バゴットが来てからは";
		mes "状況が変わっているようです。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ユミルの心臓の欠片は";
		mes "やはりルガンの巣に";
		mes "持ち込まれたのでしょうか？";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "見ることはできなかったけど";
		mes "間違いなくバゴットが持っているな。";
		mes "バゴットがラスガンドに";
		mes "気に入られたのは";
		mes "ユミルの心臓の欠片を使った";
		mes "研究をしているからだ。";
		next;
		mes "[レイジー]";
		mes "ラスガンドが、自分たちの未来は";
		mes "バゴットに掛かっている、とか";
		mes "かつての栄光を取り戻す日も";
		mes "遠くないとか";
		mes "言っているのは聞いたな。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "かつての栄光を取り戻す、か……";
		mes "やはり、ヨルムンガンドの復活を";
		mes "目論んでいるのかしら？";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "死ぬほど知りたかったんだけど";
		mes "ラスガンドは教えてくれなかったよ。";
		mes "赤ちゃんはただ、おぎゃあと泣くしか。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "はぁ……";
		mes "他には何かある？";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "囚われている人たちがいます。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "飛行船で運ばれて来た人間たちは";
		mes "実験に使われたり";
		mes "下級区域で労働に従事させられていた。";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "罪なき人達がこれ以上";
		mes "連れて来られないように";
		mes "飛行船も処理した方がよさそうです。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "おっと、そうだ！";
		mes ""+strcharinfo(0)+"と";
		mes "ホルルに、このメモを渡しておこう。";
		next;
		menu "何のメモですか？",-;
		mes "[レイジー]";
		mes "飛行船をどうにかしたいと思ってさ。";
		mes "ジンジャーに相談して";
		mes "いろいろ聞いておいたんだ。";
		mes "大賢者様の飛行船に関する";
		mes "秘伝の書みたいなものだ。";
		next;
		mes "[レイジー]";
		mes "きっと使う時が来るだろう。";
		mes "飛行船に何かする時は";
		mes "それを見てくれ。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "やるべきことは";
		mes "多岐にわたるというわけね……";
		mes "さて、どうやって切り崩そうか？";
		mes "なんでもいいわ。";
		mes "何か案はないかしら。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "ユンケアはどう？";
		mes "私達には友好的だったから";
		mes "彼女から情報を引き出せないか？";
		mes "やってみる価値はあると思う。";
		next;
		mes "[レイジー]";
		mes "特に"+strcharinfo(0)+"は";
		mes "面倒見てもらっているみたいだから";
		mes "上手く情報を聞き出せるんじゃない？";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[レハール]";
		mes "そちらの方はお任せします。";
		mes "私は、囚われている人たちを";
		mes "救出する方法を調べてみます。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "そうしてくれると助かるわ。";
		mes "申し訳ないのだけど";
		mes "頼みの綱は、キミたちだけなの。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "期待されるのって悪い気分じゃない。";
		mes "それじゃあ、潜入調査再開だな。";
		mes "さっそく行くとしようか。";
		next;
		delquest 17636;
		setquest 17638;
		set EP19_1QUE,35;
		mes "‐蛇の巣へ向かいますか？‐";
		cutin "ep19_leizi01.png", 255;
		next;
		//showevent 0, 1, オーレリー#e19ms00;	// 2546: 34, 189
		//showevent 9999, 0, ホルル#e19ms00;	// 2547: 32, 184
		//showevent 9999, 0, ゾリャラ#ep19_dq_kitche;	// 2780: 241, 66
		//showevent 9999, 0, マラム#ep19;	// 2908: 130, 201
		//showevent 9999, 0, レハール#ep19;	// 2909: 136, 197
		//showevent 9999, 0, ヴェルグンデ#ep19vell02;	// 2955: 185, 63
		//showevent 0, 1, レイジー#ep19re1;	// 2661: 127, 207
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐蛇の巣へ向かった‐";
		close2;
		warp "jor_nest.gat", 123, 203;
		end;
	case 35:
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "ルガンの巣に潜入して";
		mes "イルシオンのユンケアから";
		mes "情報を引き出せないか試して欲しい。";
		next;
		mes "[オーレリー]";
		mes "申し訳ないのだけど";
		mes "頼みの綱は、キミたちだけなの。";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "‐蛇の巣へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐蛇の巣へ向かった‐";
		close2;
		warp "jor_nest.gat", 123, 203;
		end;
	case 68:
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "奴らの本拠地に乗り込んだのに";
		mes "まさか収穫が無いとはね。";
		mes "頭が痛いわ……。";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[レオン]";
		mes "扉の奥に閉じ籠ったままとは";
		mes "考えにくい。";
		mes "まさか霞を食べて生きているわけでは";
		mes "ないだろうからね。";
		next;
		cutin "ep19_voglinde01.png", 2;
		mes "[ヴォークリンデ]";
		mes "扉の奥に秘密の出入り口が";
		mes "あるのかもしれませんね。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "もしそうなら";
		mes "アーウィン達のパトロールを";
		mes "強化しないと！";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[レオン]";
		mes "いずれにせよ、飛行船を使わない限り";
		mes "イスガルドからは出られない。";
		next;
		mes "[ホルル]";
		mes "飛行船を使わせないために";
		mes "工作員が張り付かせている。";
		mes "絶対に外には出さない！";
		cutin "ep19_iwin08.png", 2;
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[ヴェルグンデ]";
		mes "……ふむ。";
		mes "そろそろ戻ってくる頃か。";
		next;
		menu "誰がです？",-;
		cutin "ep19_juncea03.png", 2;
		cloakoffnpc "ユンケア#e19ms00";
		mes "[ユンケア]";
		mes "ここは、どこに行っても";
		mes "寒いわね……。";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[ヴェルグンデ]";
		mes "遅かったわね。";
		mes "何かわかったことがあれば";
		mes "みんなに共有してくれる？";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……整理をしてたから";
		mes "遅くなったのよ。";
		mes "でも、このことをどうして";
		mes "他人に共有しないといけないの？";
		unittalk getnpcid(0,"レイジー#e19ms00"),"レイジー : ユンケアサマァ！";
		unittalk getnpcid(0,"ユンケア#e19ms00"),"ユンケア : ひいっ！　近づくな！";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[ヴェルグンデ]";
		mes "私たちに協力すると約束したわよね？";
		mes "だから、ルガンの巣に戻って";
		mes "資料を持ち出すことに許可を出したわ。";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "……わかったよ、約束は約束だから。";
		mes "まず私の研究室や";
		mes "バゴットの研究室にあった資料は";
		mes "ほとんど残ってなかった。";
		mes "バゴットが運び出したんでしょうね。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "……そういえば残っていたのは";
		mes "改造されたルガンぐらいだったな。";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[レオン]";
		mes "あれらも、私達を足止めし";
		mes "門を閉じるまでの時間を稼ぐためのもの";
		mes "だったように思います。";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "それよりも私は、上級ルガンたちに";
		mes "魔力を注入したことが気になる。";
		mes "上級のルガンに対しては";
		mes "実験材料に使うことは禁じられていた。";
		mes "なのに、どうして……。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "現段階でやれることは限られているわ。";
		mes "引き続き、あの扉を開ける方法を";
		mes "探るしかないわね。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "外に出ている可能性も考慮して";
		mes "パトロールも強化します！";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "私とレオンは、万が一に備えて";
		mes "結界が揺るがないよう準備を";
		mes "進めておくとしよう。";
		next;
		mes "[オーレリー]";
		mes "キミは、何か動きがあるまで";
		mes "休んでいると良いわ。";
		mes "何か動きがあれば";
		mes "すぐに連絡するから。";
		close2;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		setquest 202365;
		delquest 17649;
		set EP19_1QUE,100;
		getitem 1000608,50;
		for(set '@i,0; '@i < 80; set '@i,'@i+1) {
			getexp 2000000000,0,0;
			getexp 0,1400000000,0;
		}
		delitem 1000605,1;
		setquest 17637;
		setquest 16663;
		cutin "ep19_aurelie01.png", 255;
		//showevent 9999, 0, "オーレリー#e19ms00";	// 2532: 34, 189
		//showevent 0, 3, "ホルル#e19ms00";	// 2533: 32, 184
		//@showevent 0, 3;	// 2766: 241, 66
		//@showevent 0, 1;	// 2767: 42, 252
		//@showevent 0, 3;	// 2890: 163, 226
		end;
	case 100:
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "ルガンたちを打ち倒せると";
		mes "思っていたのに、残念だわ。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:オーレリー#e19ms00(2546)
	cloakonnpc;
	end;
}

icas_in.gat,32,184,1	script	ホルル#e19ms00	10461,{/* 2547 (cloaking)*/
	cutin "ep19_iwin06.png", 2;
	mes "[ホルル]";
	if(EP19_1QUE == 16) {
		mes "偵察の報告を忘れずに！";
	}
	else if(EP19_1QUE == 17) {
		mes "ルガンの巣に潜入するなんて";
		mes "考えもしなかったな！";
	}
	else if(EP19_1QUE == 34) {
		mes "ルガンの巣での出来事を";
		mes "報告しよう！";
	}
	else if(EP19_1QUE == 35) {
		mes "ルガンの巣へ行こう。";
		mes "やらないといけないことは多いぞ。";
	}
	else if(EP19_1QUE >= 68) {
		if(checkquest(17650)&8)
			mes "承諾してくれてありがとう！";
		else
			mes "今後の対策を検討しなくては。";
	}
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,34,183,3	script	レイジー#e19ms00	10454,{/* 2548 (cloaking)*/
	cutin "ep19_leizi01.png", 0;
	mes "[レイジー]";
	if(EP19_1QUE == 16) {
		mes "何か面白いものでも見つけた？";
	}
	else if(EP19_1QUE == 17) {
		mes "ルガンに変身できるなんて！";
		mes "さあ、早く出発しよう！";
	}
	else if(EP19_1QUE == 34) {
		mes "私たちの成果を";
		mes "みんなに知らせよう！";
	}
	else if(EP19_1QUE == 35) {
		mes "今度は、もっと詳しく調べないとな。";
	}
	else if(EP19_1QUE == 68) {
		mes "ひゅ～疲れた。";
		mes "今回はハードな任務だったな。";
	}
	else if(EP19_1QUE == 100) {
		mes "私とあっちこっち見回りしない？";
		mes "雪だるま作ってもいいし！";
	}
	close2;
	cutin "ep19_leizi01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,32,182,1	script	ヴォークリンデ#e19ms00	10467,{/* 2549 (cloaking)*/
	cutin "ep19_voglinde01.png", 0;
	mes "[ヴォークリンデ]";
	if(EP19_1QUE == 16) {
		mes "外を見回ってきたのかい？";
		mes "オーレリー様が気にしておられたよ。";
	}
	else if(EP19_1QUE == 17) {
		mes "本当に大丈夫かい？";
		mes "ほら、魔石をたくさん";
		mes "持って行くといい。";
	}
	else if(EP19_1QUE == 34) {
		mes "みんな、アナタの話を";
		mes "聞きたがっているみたいね。";
	}
	else if(EP19_1QUE == 35) {
		mes "私もルガンの巣に";
		mes "潜入してみたいわ。";
	}
	else if(EP19_1QUE == 68) {
		mes "今後の対策を協議しないとね。";
	}
	else if(EP19_1QUE == 100) {
		mes "奴らの動きがわからない以上";
		mes "パトロールの強化が必要だわね。";
	}
	close2;
	cutin "ep19_voglinde01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,30,188,5	script	レハール#e19ms00	10469,{/* 2550 (cloaking)*/
	cutin "ep19_lehar01.png", 0;
	mes "[レハール]";
	if(EP19_1QUE == 16) {
		mes "外の様子はどうでした？";
		mes "ここは変な生き物が多いでしょう。";
	}
	else if(EP19_1QUE == 17) {
		mes "スクロールを使って変身するなんて";
		mes "初めてですから";
		mes "なんだか緊張しますね！";
	}
	else if(EP19_1QUE == 34) {
		mes "私よりも冒険者様の方が";
		mes "報告できることは多そうですね。";
	}
	else if(EP19_1QUE == 35) {
		mes "前回は見せ場がありませんでしたから";
		mes "次はもっと頑張らないと！";
	}
	else if(EP19_1QUE == 68) {
		mes "こういう時は";
		mes "どうすれば良いのでしょう？";
	}
	else if(EP19_1QUE == 100) {
		mes "まだまだやることは多いですね。";
	}
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,30,183,1	script	ヴェルグンデ#e19ms00	10468,{/* 2551 (cloaking)*/
	cutin "ep19_vellgunde01.png", 1;
	mes "[ヴェルグンデ]";
	if(EP19_1QUE == 16) {
		mes "外を回って来たの？";
		mes "何か面白いものは見つかったかしら？";
	}
	else if(EP19_1QUE == 17) {
		mes "そのスクロールのことだけど";
		mes "興味深い研究対象だわ。";
	}
	else if(EP19_1QUE == 34) {
		mes "いろいろ聞かせて";
		mes "もらわないといけないわね。";
	}
	else if(EP19_1QUE == 35) {
		mes "ルガンの巣を直接調べられるなんて。";
		mes "そんな機会に恵まれて";
		mes "うらやましいわ。";
	}
	else if(EP19_1QUE == 68) {
		mes "閉じられた扉を開ける方法か……";
		mes "何か良い案はあるかしら？";
	}
	else if(EP19_1QUE == 100) {
		mes "ユンケアと一緒に、巣に残されたものを";
		mes "調べているのよ。";
	}
	close2;
	cutin "ep19_vellgunde01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,30,185,7	script	ミリアム#e19ms00	10377,{/* 2552 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	if(EP19_1QUE == 16) {
		mes "何かわかったことがありますか？";
	}
	else if(EP19_1QUE == 17) {
		mes "ルガンの巣へ向かおう。";
		mes "イルシオンもそこにいるはずです。";
	}
	else if(EP19_1QUE == 34) {
		mes "下級区域はボクが調べてきました。";
		mes "冒険者さんは上級区域に関する説明を。";
	}
	else if(EP19_1QUE == 35) {
		mes "ユミルの心臓の欠片は";
		mes "いったいどこに……。";
	}
	else if(EP19_1QUE == 68) {
		mes "閉ざされた扉を開ける方法……";
		mes "ボクには思いつかないな。";
	}
	else if(EP19_1QUE == 100) {
		mes "ユミルの心臓の欠片も";
		mes "持ち去られてしまったみたいです。";
	}
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,32,189,5	script	レオン#e19ms00	10464,{/* 2553 (cloaking)*/
	switch(EP19_1QUE) {
	case 16:
		cutin "ep19_leon01.png", 0;
		mes "[レオン]";
		mes "外の様子はいかがでしたか？";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 17:
		mes "変身スクロールですか……";
		mes "う～～ん……";
		mes "私は遠慮させていただきます。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 34:
		mes "ルガンの巣での出来事を";
		mes "報告していただけますか？";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 35:
		mes "ルガンを切り崩す方法を";
		mes "探さないといけません。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 68:
		mes "困った時は、皆で相談しましょう。";
		mes "良い考えが出るかもしれません。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 100:
		cloakoffnpc "ミリアム#e19ms00";
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "いいところにいらっしゃいましたね。";
		mes "レオン様が人手が必要だそうです。";
		mes "手が空いていそうなのは……";
		mes "冒険者様とミリアム様かな？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "そうだね。";
		mes "マラムは、物資調達と";
		mes "輸送を担当していて、";
		mes "普段は飛行船で何かを";
		mes "一生懸命運んだり、";
		mes "ヴェルグンデ様の側で手伝っているよ。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "そうですか？";
		mes "まぁ二人いれば足りるかな。";
		mes "人手が必要らしいです。";
		mes "私は違う仕事がありまして…";
		next;
		mes "[レハール]";
		mes "レオン様、このお二方で大丈夫ですか？";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[レオン]";
		mes "ああ、問題ないよ。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "分かりました。";
		mes "それでは冒険者さん、";
		mes "一緒に行こうか？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		// DQ受諾前は未調査
		end;
	}
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:レオン#e19ms00(2553)
	cloakonnpc;
	end;
}

icas_in.gat,29,187,7	script	マラム#e19ms00	10376,{/* 2554 (cloaking)*/
	cutin "ep18_maram_01.png", 1;
	mes "[マラム]";
	if(EP19_1QUE == 16) {
		mes "何か面白いものはありましたか？";
	}
	else if(EP19_1QUE == 17) {
		mes "私は補給物資の調達に";
		mes "専念したいと思います。";
	}
	else if(EP19_1QUE == 34) {
		mes "ご無事なようで安心しました。";
		mes "ミリアムが無茶していないか";
		mes "心配していたんです。";
	}
	else if(EP19_1QUE == 35) {
		mes "お疲れ様です。";
		mes "あまり無茶しないでくださいね。";
	}
	else if(EP19_1QUE >= 68) {
		mes "そう簡単に問題は解決しませんね。";
	}
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,35,180,1	script	ユンケア#e19ms00	10455,{/* 2555 (cloaking)*/
	cutin "ep19_juncea03.png", 2;
	mes "[ユンケア]";
	mes "ふぅ……";
	mes "ちょっと疲れた。";
	close2;
	cutin "ep19_juncea03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,318,0	script	#e19ms11	139,14,14,{/* 2556 */
	if(EP19_1QUE == 17) {
		cloakoffnpc "ホルル#e19ms11";
		cloakonnpc "レイジー#e19ms11";
		cloakonnpc "レハール#e19ms11";
		cloakonnpc "ミリアム#e19ms11";
		cloakonnpc "ホルル#e19ms12";
		cloakonnpc "レイジー#e19ms12";
		cloakonnpc "レハール#e19ms12";
		cloakonnpc "ミリアム#e19ms12";
	}
	if(EP19_1QUE == 18) {
		cloakonnpc "ホルル#e19ms11";
		cloakonnpc "レイジー#e19ms11";
		cloakonnpc "レハール#e19ms11";
		cloakonnpc "ミリアム#e19ms11";
		cloakoffnpc "ホルル#e19ms12";
		cloakonnpc "レイジー#e19ms12";
		cloakonnpc "レハール#e19ms12";
		cloakonnpc "ミリアム#e19ms12";
	}
	end;
}

jor_back3.gat,77,311,0	script	jor_back3_sw_1	139,{/* 2557 */}
jor_back3.gat,85,296,0	script	jor_back3_sw_2	139,{/* 2558 */}
jor_back3.gat,114,296,0	script	jor_back3_sw_3	139,{/* 2559 */}
jor_back3.gat,121,311,0	script	jor_back3_sw_4	139,{/* 2560 */}

jor_back3.gat,99,318,3	script	ホルル#e19ms11	10461,{/* 2561 (cloaking)*/
	if(EP19_1QUE == 17) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			cutin "ep19_iwin06.png", 2;
			cloakoffnpc "レハール#e19ms11";
			cloakoffnpc "ミリアム#e19ms11";
			cloakoffnpc "レイジー#e19ms11";
			cloakonnpc "ホルル#e19ms12";
			cloakonnpc "レイジー#e19ms12";
			cloakonnpc "レハール#e19ms12";
			cloakonnpc "ミリアム#e19ms12";
			mes "[ホルル]";
			mes "さあ、「変身スクロール」を使って";
			mes "ルガンに変身しましょう！";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		}
		cutin "ep19_iwin06.png", 2;
		cloakoffnpc "レハール#e19ms11";
		cloakoffnpc "ミリアム#e19ms11";
		cloakoffnpc "レイジー#e19ms11";
		cloakonnpc "ホルル#e19ms12";
		cloakonnpc "レイジー#e19ms12";
		cloakonnpc "レハール#e19ms12";
		cloakonnpc "ミリアム#e19ms12";
		mes "[ホルル]";
		mes "ルガンに変身しましたね。";
		mes "そろそろ奴らの巣穴も近いので";
		mes "この辺りで、我々も変身しましょう。";
		next;
		cutin "ep19_iwin06.png", 255;
		misceffect 594,"ホルル#e19ms11";
		cloakonnpc "ホルル#e19ms11";
		cloakoffnpc "ホルル#e19ms12";
		if(!sleep2(1000)) end;
		misceffect 594,"レハール#e19ms11";
		cloakonnpc "レハール#e19ms11";
		cloakoffnpc "レハール#e19ms12";
		if(!sleep2(500)) end;
		misceffect 594,"ミリアム#e19ms11";
		cloakonnpc "ミリアム#e19ms11";
		cloakoffnpc "ミリアム#e19ms12";
		mes "[ミリアム]";
		mes "これがルガンの姿……";
		mes "ルガンらしく歩くには練習が必要そう。";
		next;
		mes "[レイジー]";
		mes "ふむ。みんな無事に変身したな。";
		mes "副作用も無さそうだし";
		mes "安心して変身できるよ。";
		unittalk getnpcid(0,"レハール#e19ms11"),"レハール : 私たちで試したの!?";
		misceffect 598,"レイジー#e19ms11";
		cloakonnpc "レイジー#e19ms11";
		cloakoffnpc "レイジー#e19ms12";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,97,318,5	script	レイジー#e19ms11	10454,{/* 2562 (cloaking)*/
	if(EP19_1QUE == 17) {
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "この先に、ルガンの巣の";
		mes "入口があるらしい。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,315,1	script	レハール#e19ms11	10469,{/* 2563 (cloaking)*/
	if(EP19_1QUE == 17) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ルガンの巣が近いので";
		mes "この辺りで変身しましょう。";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,96,316,7	script	ミリアム#e19ms11	10377,{/* 2564 (cloaking)*/
	if(EP19_1QUE == 17) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ホルルさんが言うには";
		mes "この先にルガンの巣があるそうです。";
		mes "ここで準備をしましょうか。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,318,3	script	ホルル#e19ms12	21529,{/* 2565 (cloaking)*/
	if(EP19_1QUE == 17) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			cloakonnpc "レハール#e19ms11";
			cloakonnpc "ミリアム#e19ms11";
			cloakonnpc "レイジー#e19ms11";
			cloakoffnpc "ホルル#e19ms12";
			cloakoffnpc "レイジー#e19ms12";
			cloakoffnpc "レハール#e19ms12";
			cloakoffnpc "ミリアム#e19ms12";
			mes "[ホルル]";
			mes "さあ、「変身スクロール」を使って";
			mes "ルガンに変身しましょう！";
			close;
		}
		cloakonnpc "レハール#e19ms11";
		cloakonnpc "ミリアム#e19ms11";
		cloakonnpc "レイジー#e19ms11";
		cloakoffnpc "ホルル#e19ms12";
		cloakoffnpc "レイジー#e19ms12";
		cloakoffnpc "レハール#e19ms12";
		cloakoffnpc "ミリアム#e19ms12";
		mes "[ホルル]";
		mes "全員、ルガンに変身できたか？";
		mes "んん！";
		next;
		mes "[ミリアム]";
		mes "何か問題でも？";
		next;
		mes "[ホルル]";
		mes "冒険者と最後に変身した人間！";
		next;
		mes "[レイジー]";
		mes "私？";
		mes "上手く変身できてると思うけど？";
		next;
		mes "[ホルル]";
		mes "……「等級」の問題だ。";
		mes "ルガンは魔力によって外見が異なる。";
		mes "魔力を多く持って生まれるほど";
		mes "人間の姿に近くなる。";
		next;
		menu "レイジーさんは人間っぽいですね",-;
		mes "[レハール]";
		mes "ホルルさんの言う通りです。";
		mes "私達の等級は「中級」ですが";
		mes "冒険者様は「上級」。";
		mes "レイジーさんは「最上級」ですよ！";
		next;
		mes "[レハール]";
		mes "……あ、もしかして……";
		mes "ヴェルグンデ叔母様からもらった";
		mes "魔石の数が影響してるのかも？";
		mes "いったいどれだけの魔石を";
		mes "もらって来たんですか!!??";
		next;
		mes "[ホルル]";
		mes "仕方ない。二人は、ここに残ってくれ。";
		mes "上級と最上級は数が少ないから";
		mes "お互いに顔をよく知っている。";
		mes "知らない顔の上級と最上級がいたら";
		mes "怪しまれてしまうぞ。";
		next;
		mes "[レイジー]";
		mes "それはできない相談だな。";
		mes "私がどうしてここに来たと思ってる？";
		mes "どんな手を使ってでも";
		mes "ルガンの巣に侵入しなくちゃならん。";
		next;
		mes "[レイジー]";
		mes "じゃあ、こうしよう！";
		mes "私と冒険者は";
		mes "生まれたてのルガンのふりをする！";
		mes "奴らは「卵から孵る」と聞いたが";
		mes "卵を温めてるわけじゃないんだろ？";
		next;
		mes "[ホルル]";
		mes "……悪くない作戦だ。";
		mes "では、侵入時に二人は";
		mes "生まれたてのルガンのふりをしてくれ。";
		mes "それが通用しないなら";
		mes "私達だけで潜入する。";
		next;
		mes "[レイジー]";
		mes "ははっ！";
		mes "この歳になって赤子の真似するとは。";
		mes "今から冒険者も私も、ゼロ歳児だ！";
		next;
		mes "[ホルル]";
		mes "それじゃあ、様子を見ながら";
		mes "一人ずつこの先の入口から";
		mes "奴らの巣に潜入してくれ。";
		mes "入口は、洞窟状になっているから。";
		cloakonnpc "レハール#e19ms12";
		if(!sleep2(1000)) end;
		cloakonnpc "ミリアム#e19ms12";
		if(!sleep2(1000)) end;
		cloakonnpc "レイジー#e19ms12";
		delquest 17619;
		setquest 17620; //showevent 0, 1, #to_jor_dun02;	// 2464: 10, 238 showevent 0, 1,ミリアム#e19ms20;	// 2572: 263, 170
		set EP19_1QUE,18;
		close;
		//showevent 0, 1, #to_jor_dun01;	// 2462: 63, 326
		//showevent 9999, 0, ホルル#e19ms12;	// 2565: 99, 318
	}
	if(EP19_1QUE == 18) {
		mes "[ホルル]";
		mes "それじゃあ、様子を見ながら";
		mes "一人ずつこの先の入口から";
		mes "奴らの巣に潜入してくれ。";
		mes "入口は、洞窟状になっているから。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,97,318,5	script	レイジー#e19ms12	10475,{/* 2566 (cloaking)*/
	if(EP19_1QUE == 17) {
		mes "[レイジー]";
		mes "この先に、ルガンの巣の";
		mes "入口があるらしい。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,315,1	script	レハール#e19ms12	21529,{/* 2567 (cloaking)*/
	if(EP19_1QUE == 17) {
		mes "[レハール]";
		mes "ルガンの巣が近いので";
		mes "この辺りで変身しましょう。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,96,316,7	script	ミリアム#e19ms12	21529,{/* 2568 (cloaking)*/
	if(EP19_1QUE == 17) {
		mes "[ミリアム]";
		mes "ホルルさんが言うには";
		mes "この先にルガンの巣があるそうです。";
		mes "ここで準備をしましょうか。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,263,170,0	script	#e19ms20	139,10,10,{/* 2569 */
	if(EP19_1QUE == 18) {
		cloakoffnpc "ミリアム#e19ms20";
		cloakoffnpc "ホルル#e19ms21";
		cloakoffnpc "レハール#e19ms21";
		cloakoffnpc "レイジー#e19ms21";
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[ミリアム]";
			mes strcharinfo(0)+"さん。";
			mes "ここではルガンに変身した方が";
			mes "良さそうです。";
			close;
		}
	}
	if(EP19_1QUE == 19) {
		cloakoffnpc "ミリアム#e19ms20";
	}
	//20,21未調査
	if(EP19_1QUE == 22) {
		cloakonnpc "ミリアム#e19ms20";
		cloakonnpc "レイジー#e19ms21";
		cloakonnpc "ホルル#e19ms21";
		cloakonnpc "レハール#e19ms21";
	}
	//23,24未調査
	if(EP19_1QUE == 25 || EP19_1QUE == 26) {
		cloakoffnpc "ミリアム#e19ms20";
	}
	end;
}

jor_dun02.gat,245,173,0	script	jor_dun02_sw_1	139,{/* 2570 */}
jor_dun02.gat,260,152,0	script	jor_dun02_sw_2	139,5,5,{/* 2571 */}

jor_dun02.gat,263,170,3	script	ミリアム#e19ms20	21529,{/* 2572 (cloaking)*/
	switch(EP19_1QUE) {
	case 18:
		cloakoffnpc "ホルル#e19ms21";
		cloakoffnpc "レハール#e19ms21";
		cloakoffnpc "レイジー#e19ms21";
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[ミリアム]";
			mes strcharinfo(0)+"さん。";
			mes "ここではルガンに変身した方が";
			mes "良さそうです。";
			close;
		}
		mes "[ミリアム]";
		mes "どうにか入れたけれど……";
		mes "今のところは";
		mes "誰にも気づかれてないみたい。";
		next;
		mes "[レハール]";
		mes "今さらですけど";
		mes "ルガンって、どのように会話しますか？";
		mes "人間の言葉を喋っても";
		mes "大丈夫なんでしょうか？";
		next;
		mes "[ホルル]";
		mes "それは問題無い。";
		mes "我々と同じレベルで会話ができる。";
		mes "ただ、生まれたてのふりをするなら";
		mes "注意してくれ。";
		next;
		mes "[ホルル]";
		mes "何も知らない赤子のように";
		mes "振舞うことだ。";
		mes "幸い上級と最上級に対しては";
		mes "特別待遇のはずだから";
		mes "変なことさえ言わなければ良い。";
		next;
		mes "[レイジー]";
		mes "おぎゃ～おぎゃ～！";
		unittalk getcharid(3),strcharinfo(0)+" : ……変な物でも食べました？",1;
		next;
		mes "[ホルル]";
		mes "ここからは別れて行動しよう。";
		mes "私はいったん西側へ行ってみる。";
		next;
		mes "[レイジー]";
		mes "じゃ、私と冒険者は";
		mes "東側へ行ってみようか。";
		next;
		mes "[ミリアム]";
		mes "ボクは、この付近を調べてみる。";
		next;
		mes "[ホルル]";
		mes "よし、それじゃ……。";
		next;
		cloakoffnpc "ルガン#e19ms21";
		emotion 23,"ミリアム#e19ms20";
		emotion 23,"ホルル#e19ms21";
		emotion 23,"レイジー#e19ms21";
		emotion 23,"レハール#e19ms21";
		mes "[ルガン司祭]";
		mes "お前たち、集まって何を……ん？";
		next;
		mes "[ルガン司祭]";
		mes "しゅ、主教様！？";
		mes "このような場所でいったい何を??";
		next;
		emotion 23,"ホルル#e19ms21";
		cloakoffnpc "ルガン#e19ms22";
		mes "[ルガン司祭]";
		mes "……騒がしいな。";
		mes "これは何の騒ぎだ？";
		next;
		emotion 23,"ルガン#e19ms22";
		mes "[ホルル]";
		mes "ああ！";
		mes "つい先ほど、この方たちが";
		mes "卵から孵化されるのを見ました！";
		next;
		mes "[ルガン司祭]";
		mes "なんだって？";
		mes "ここは上級孵化場ではないのに！";
		next;
		mes "[ルガン司祭]";
		mes "こんなところで、司祭級や";
		mes "主教様級の者が生まれるとは！";
		mes "いったい、いつぶりのことだろう!!";
		next;
		mes "[ルガン司祭]";
		mes "こうしている場合ではない。";
		mes "この二人を、上級区域に連れて行こう。";
		next;
		mes "[ルガン司祭]";
		mes "さあ、奥の方へ行きましょう。";
		next;
		mes "[ルガン司祭]";
		mes "最下級の者たちは";
		mes "敵味方の判断ができずに";
		mes "襲い掛かってくるかもしれませんが";
		mes "どうかご了承ください。";
		delquest 17620;
		setquest 17621;
		set EP19_1QUE,19;
		viewpoint 1, 18, 31, 2, 0xFFFF00;
		close2;
		//showevent 9999, 0, ミリアム#e19ms20;	// 2572: 263, 170
		cloakonnpc "レイジー#e19ms21";
		cloakonnpc "ルガン#e19ms21";
		cloakonnpc "ルガン#e19ms22";
		end;
	case 19:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			// 未調査？
			mes "[ミリアム]";
			mes strcharinfo(0)+"さん。";
			mes "ここではルガンに変身した方が";
			mes "良さそうです。";
			close;
		}
		mes "[ミリアム]";
		mes "これはチャンスです。";
		mes "あのルガンたちと一緒に";
		mes "奥に向かってください。";
		viewpoint 1, 18, 31, 2, 0xFFFF00;
		close;
	case 25:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[ミリアム]";
			mes strcharinfo(0)+"さん。";
			mes "ここではルガンに変身した方が";
			mes "良さそうです。";
			close;
		}
		mes "[ミリアム]";
		mes "……"+strcharinfo(0)+"さん。";
		mes "ボクです、ミリアムです。";
		next;
		menu "よく気づきましたね",-;
		mes "[ミリアム]";
		mes "どうやら入口付近には";
		mes "上級以上のルガンは来ないようです。";
		mes "なのに、上級のルガンが";
		mes "慣れない足運びで動いているから";
		mes "冒険者さんだとわかりました。";
		next;
		mes "[ミリアム]";
		mes "それにしても、どうしたんです？";
		mes "レイジーさんと一緒に";
		mes "奥に行ったはずでは……。";
		next;
		mes "^0000FF‐ミリアムに上級ルガンの卵の殻を^000000";
		mes "^0000FF　探していることを説明した‐^000000";
		next;
		mes "[ミリアム]";
		mes "ボクはこの付近を調べていたけど";
		mes "ここは、下級の卵の孵化場みたい。";
		mes "^0000cd上級の卵^000000は別の場所に";
		mes "置かれているみたい。";
		next;
		mes "[ミリアム]";
		mes "ホルルさんとレハールさんが";
		mes "上級区画に向かわれたので";
		mes "お二人のところに行ってみてください。";
		mes "手を貸してくれるはずです。";
		delquest 17627;
		setquest 17628;
		set EP19_1QUE,26;
		next;
		//showevent 9999, 0, ミリアム#e19ms20;	// 2572: 263, 170
		//showevent 9999, 0, 警備ルガン#e19ms95;	// 2618: 153, 239
		//showevent 9999, 0, ミリアム#e19ms91;	// 2621: 150, 269
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 0, 1, ルガン司祭#e19ms81;	// 2600: 23, 58
		cutin "ep19_juncea01.png", 255;
		mes "‐上級孵化場へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐上級孵化場へ向かった‐";
		close2;
		warp "jor_nest.gat", 28, 61;
		end;
	case 26:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[ミリアム]";
			mes strcharinfo(0)+"さん。";
			mes "ここではルガンに変身した方が";
			mes "良さそうです。";
			close;
		}
		mes "[ミリアム]";
		mes "ホルルさんとレハールさんが";
		mes "上級区画に向かわれたので";
		mes "お二人のところに行ってみてください。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "‐上級孵化場へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐上級孵化場へ向かった‐";
		close2;
		warp "jor_nest.gat", 28, 61;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,261,166,7	script	ホルル#e19ms21	21529,{/* 2573 (cloaking)*/
	mes "[ホルル]";
	mes "ルガンの巣窟に入ったのは";
	mes "はじめてだよ。";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,263,167,1	script	レイジー#e19ms21	10475,{/* 2574 (cloaking)*/
	if(EP19_1QUE == 18) {
		mes "[レイジー]";
		mes "ここが私が生まれた場所？";
		mes "あまりぱっとしないなぁ。";
		close;
	}
	if(EP19_1QUE == 19) {
		// 未調査
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,263,165,1	script	レハール#e19ms21	21529,{/* 2575 (cloaking)*/
	mes "[レハール]";
	mes "バレずに潜入できたのでしょうか。";
	mes "ゾクゾクしてしまいますね。";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,256,169,5	script	ルガン#e19ms21	10470,{/* 2576 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,254,168,5	script	ルガン#e19ms22	10472,{/* 2577 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,185,49,3	script	ルガン司祭#e19ms31	10470,5,5,{/* 2578 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン司祭]";
		mes "誰が人間をここに入れた！";
		mes "早く追い出せ!!";
		close;
	}
	switch(EP19_1QUE) {
	case 19:
		mes "[ルガン司祭]";
		mes "みんな！";
		mes "私が連れて来た方々を見てくれ！";
		mes "新しい主教様がお生まれになったのだ！";
		next;
		mes "[ルガン司祭]";
		mes "……久しぶりじゃないか。";
		mes "^0000cd最近は滅多になかった^000000のに。";
		next;
		mes "[ルガン司祭]";
		mes "感想はそれだけか？";
		mes "このお二人はなんと";
		mes "下級区域から生まれたのだよ！";
		next;
		mes "[ルガン司祭]";
		mes "なんだって？";
		mes "下級区域から??";
		next;
		mes "[ルガン司祭]";
		mes "^0000cd奇跡^000000だ！";
		mes "ヨルムンガンド様の";
		mes "復活の兆しに違いない!!";
		next;
		cloakoffnpc "ルガン主教#e19ms31";
		mes "[ルガン主教]";
		mes "騒がしいな。";
		mes "いったい、何が生まれたと？";
		next;
		mes "[ルガン司祭]";
		mes "主教様！";
		unittalk "ルガン司祭 : 主教様！";
		unittalk getnpcid(0,"ルガン司祭#e19ms32"),"ルガン司祭 : 祝福を！";
		unittalk getnpcid(0,"ルガン司祭#e19ms33"),"ルガン司祭 : 祝福を！";
		next;
		mes "[ルガン司祭]";
		mes "下級区域から新しい主教様が";
		mes "誕生されたのです。";
		next;
		mes "[ルガン主教]";
		mes "ほぉ……下級区域から。";
		mes "ふむ、隣の見慣れない司祭は？";
		next;
		mes "[ルガン司祭]";
		mes "こちらも、下級区域で";
		mes "一緒に生まれたようです。";
		next;
		mes "[ルガン主教]";
		mes "そうか。";
		mes "では、^0000cdサレクガンド^000000に言って";
		mes "ラスガンド様のところへ連れて行こう。";
		mes "命名の祝福をお願いしなくては。";
		mes "サレクガンドは、どこにいる？";
		next;
		mes "[ルガン司祭]";
		mes "ラスガンド様の命を受けて";
		mes "^0000cdイルシオン区画^000000に";
		mes "出入りしておられるようです。";
		next;
		mes "[ルガン主教]";
		mes "では私がサレクガンドに";
		mes "この二人のことをお願いするとしよう。";
		mes "君たち二人は祝福の洗礼を受ける前に";
		mes "この場所について知ってもらおうか。";
		next;
		mes "[ルガン主教]";
		mes "ここは広場だ。";
		mes "普段は、司祭級以上のルガンがいる。";
		mes "他の場所は、歩きながら説明しよう。";
		next;
		mes "[レイジー]";
		mes "するすると？";
		mes "こんな感じで歩けばいい？";
		next;
		mes "[ルガン主教]";
		mes "もう少し、つかつかと。";
		mes "ほう……上達が早いな。";
		mes "まるで二足歩行の経験があるみたいだ。";
		mes "さあ、案内するからついて来なさい。";
		next;
		mes "[ルガン司祭]";
		mes "ヨルムンガンド様と共に！";
		next;
		mes "[ルガン司祭]";
		mes "ヨルムンガンド様の祝福を！";
		unittalk "ルガン司祭 : ヨルムンガンド様と共に！";
		unittalk getnpcid(0,"ルガン司祭#e19ms32"),"ルガン司祭 : ヨルムンガンド様の祝福を！";
		delquest 17621;
		setquest 17622;
		set EP19_1QUE,20;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 0, 1, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		cloakonnpc "ルガン主教#e19ms31";
		cloakonnpc "レイジー#e19ms31";
		end;
	case 20:
		mes "[ルガン司祭]";
		mes "主教様について行くんだ。";
		mes "この場所について";
		mes "教えていただけるだろう。";
		close;
	case 21:	// 未調査
	case 22:
		mes "[ルガン司祭]";
		mes "生活には慣れてきたか？";
		close;
	case 68:	// 未調査
	case 100:
		mes "[ルガン司祭]";
		mes "はぁ……この前、大騒ぎになってさ。";
		mes "君は大丈夫だったのか？";
		close;
	}
OnTouch:
	if(EP19_1QUE == 19)
		cloakoffnpc "レイジー#e19ms31";
	else if(EP19_1QUE >= 68) {
		cloakonnpc "ルガン司祭#e19ms32";
		cloakonnpc "ルガン司祭#e19ms33";
	}
	end;
}

jor_nest.gat,182,45,7	script	ルガン司祭#e19ms32	10471,{/* 2579 */
	mes "[ルガン司祭]";
	mes "しばらくすれば、すぐに慣れる。";
	mes "わからないことがあれば";
	mes "誰かに聞けばいい。";
	close;
}

jor_nest.gat,186,46,1	script	ルガン司祭#e19ms33	10472,{/* 2580 */
	mes "[ルガン司祭]";
	mes "何か気になることがあるのか？";
	close;
}

jor_nest.gat,182,50,5	script	レイジー#e19ms31	10475,{/* 2581 (cloaking)*/
	mes "[レイジー]";
	mes "みんな、思った以上に親切じゃない？";
	mes "めっちゃ歓迎してくれるね。";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,180,48,5	script	ルガン主教#e19ms31	10474,{/* 2582 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,196,202,0	script	#e19ms41	139,5,5,{/* 2583 */
	cloakonnpc "ルガン主教#e19ms41";
	if(EP19_1QUE == 20 || EP19_1QUE == 21)
		cloakoffnpc "ルガン主教#e19ms41";
	end;
}
jor_nest.gat,196,202,5	script	ルガン主教#e19ms41	10474,{/* 2584 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン主教]";
		mes "誰が人間をここに入れた！";
		mes "早く追い出せ!!";
		close;
	}
	if(EP19_1QUE == 20) {
		cloakoffnpc "レイジー#e19ms41";
		mes "[ルガン主教]";
		mes "ここを見なさい。";
		mes "ここは司祭級や主教級用の孵化場だ。";
		mes "大きい卵を選別し";
		mes "孵化するまで管理している。";
		next;
		mes "[ルガン主教]";
		mes "しかし、君たちが生まれた場所は";
		mes "上級以外の卵を置いていない場所だ。";
		mes "君たちは特別なのだよ。";
		mes "ヨルムンガンド様の奇跡に違いない。";
		next;
		mes "[ルガン主教]";
		mes "孵化場は、巣のあちこちにあるが";
		mes "また時間があれば見て回るといい。";
		next;
		mes "[レイジー]";
		mes "あれは、なに？";
		next;
		mes "[ルガン主教]";
		mes "あれは、人間が設置したものだ。";
		mes "卵により多くの魔力を";
		mes "注入するためのものだ。";
		next;
		mes "[レイジー]";
		mes "ニンゲン？";
		next;
		mes "[ルガン主教]";
		mes "こことは違う、結界の向こうから来た";
		mes "者たちのことだ。";
		mes "ラスガンド様の配慮によって";
		mes "ここに滞在している。";
		mes "私たちとは見た目が異なるから";
		mes "見ればわかるだろう。";
		next;
		mes "[ルガン主教]";
		mes "ただし、イルシオン区画にいる";
		mes "人間だけを相手をするように。";
		mes "他は汚らわしい者たちだ。";
		mes "では、次の場所に行こう。";
		delquest 17622;
		setquest 17623;
		set EP19_1QUE,21;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 0, 1, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		// 未調査
		cloakonnpc "ルガン主教#e19ms41";
		cloakonnpc "レイジー#e19ms41";
		end;
	}
	if(EP19_1QUE == 21) {
		mes "[ルガン主教]";
		mes "では、次の場所に行こう。";
		mes "ラスガンド様のところへ";
		mes "連れて行かねば。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,193,200,5	script	レイジー#e19ms41	10475,{/* 2585 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,115,187,0	script	#e19ms51	139,5,5,{/* 2586 */
	cloakonnpc "ルガン主教#e19ms51";
	if(EP19_1QUE == 21 || EP19_1QUE == 22)
		cloakoffnpc "ルガン主教#e19ms51";
	end;
}

jor_nest.gat,115,187,3	script	ルガン主教#e19ms51	10474,{/* 2587 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン主教]";
		mes "誰が人間をここに入れた！";
		mes "早く追い出せ!!";
		close;
	}
	if(EP19_1QUE == 21) {
		cloakoffnpc "レイジー#e19ms51";
		mes "[ルガン主教]";
		mes "この奥が先ほど話した";
		mes "人間たちが滞在している区画だ。";
		next;
		mes "[レイジー]";
		mes "入る。";
		next;
		mes "[ルガン主教]";
		mes "入らない方がいい。";
		mes "危険なものがたくさんあるからな。";
		next;
		mes "[ルガン主教]";
		mes "ラスガンド様のご配慮により";
		mes "滞在の許可が出ているが";
		mes "正直、良い気分ではない。";
		next;
		mes "[ルガン主教]";
		mes "だが、ラスガンド様には";
		mes "お考えがあるのだろう。";
		mes "あの方は、私達のような者とは違う";
		mes "偉大な方なのだからな。";
		next;
		mes "[ルガン主教]";
		mes "とにかく、無暗に立ち入らないように。";
		mes "人間たちとは極力関わってはいけない。";
		mes "……さあ、もう次の場所に行こう。";
		delquest 17623;
		setquest 17624;
		set EP19_1QUE,22;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 0, 1, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 0, 3, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		cloakonnpc "レイジー#e19ms51";
		cloakonnpc "ルガン主教#e19ms51";
		end;
	}
	if(EP19_1QUE == 22) {
		mes "[ルガン主教]";
		mes "見学はこれぐらいで良いだろう。";
		mes "……さあ、もう次の場所に行こう。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,118,187,3	script	レイジー#e19ms51	10475,{/* 2588 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,53,244,0	script	#e19ms61	139,5,5,{/* 2589 */
	if(EP19_1QUE == 22 || EP19_1QUE == 23)
		cloakoffnpc "ルガン主教#e19ms61";
	end;
}

jor_nest.gat,53,244,1	script	ルガン主教#e19ms61	10474,{/* 2590 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン主教]";
		mes "誰が人間をここに入れた！";
		mes "早く追い出せ!!";
		close;
	}
	if(EP19_1QUE == 22) {
		cloakoffnpc "レイジー#e19ms61";
		mes "[ルガン主教]";
		mes "ここまでの道は覚えたか？";
		mes "ここは^0000cd私たちの生きる基盤であり";
		mes "^0000cdヨルムンガンド様から祝福された";
		mes "^0000cd聖地^000000だ。";
		next;
		menu "聖地ですか？",-;
		mes "[ルガン主教]";
		mes "そうだ。";
		mes "ヨルムンガンド様の魔力が湧く場所。";
		mes "君たちは、その魔力の祝福を受けて";
		mes "生まれたんだ。";
		next;
		mes "[ルガン主教]";
		mes "私たちの「生」は";
		mes "ヨルムンガンド様からのいただきもの。";
		mes "私たちの命が尽きた際には";
		mes "魔力をお返しし";
		mes "その生に忠実であったと証明するのだ。";
		next;
		mes "[ルガン主教]";
		mes "私たちが司祭たちと平信徒たちを導き";
		mes "大陸に再び、ヨルムンガンド様の";
		mes "威光を知らしめるため";
		mes "ヨルムンガンド様の復活に";
		mes "邁進せねばならない。";
		next;
		mes "[ルガン主教]";
		mes "ヨルムンガンド様は";
		mes "私たちと共におられる。";
		mes "与えてくださった生に感謝するのだ。";
		next;
		mes "[ルガン主教]";
		mes "案内はここまでだ。";
		mes "では、主教級の君は私と共に来るのだ。";
		mes "ラスガンド様に会わねばならない。";
		next;
		menu "ラスガンド？",-;
		mes "[ルガン主教]";
		mes "ラスガンド「様」と言え。";
		mes "私たちの教主であり";
		mes "はるか古よりヨルムンガンド様に仕え";
		mes "この地を守り抜いた、私たちの守護者。";
		next;
		mes "[ルガン主教]";
		mes "闇を克服し";
		mes "孤独を生き延び";
		mes "私たちをここまで繁栄させた御方だ。";
		next;
		mes "[レイジー]";
		mes "ははっ！";
		mes "その方とは、どこで会える？";
		mes "どこにいるの？";
		next;
		mes "[ルガン主教]";
		cloakoffnpc "サレクガンド#e19ms61";
		mes "ラスガンド様がおられる場所に。";
		mes "尊い方ゆえに";
		mes "誰でもお会いできるわけではない。";
		mes "しかし、主教級が生まれたのなら";
		mes "祝福してくださるだろう。";
		next;
		unittalk getnpcid(0,"サレクガンド#e19ms61"),"サレクガンド : この私が人間を案内するなんて！",1;
		mes "[ルガン主教]";
		mes "ああ、サレクガンド。";
		mes "君を探していたのだ。";
		mes "こちらに来てくれ。";
		next;
		mes "[サレクガンド]";
		mes "もう少し静かにできないのか？";
		mes "下級のルガンでもあるまいに。";
		next;
		mes "[ルガン主教]";
		mes "普段なら、君のその言いぐさに";
		mes "気分を害するところだが";
		mes "今日は、特別な日なのだから";
		mes "我慢できるというものだ。";
		next;
		mes "[ルガン主教]";
		mes "彼らを見ろ。";
		mes "主教級と司祭級が生まれたのだ！";
		mes "ラスガンド様に祝福を賜りたい。";
		mes "それで君を探していたのだ。";
		next;
		mes "[サレクガンド]";
		mes "おお！";
		mes "ラスガンド様もお喜びになるだろう。";
		mes "最近、悪い話ばかりで";
		mes "滅入っておられたからな。";
		cloakoffnpc "バゴット#e19ms61";
		unittalk getnpcid(0,"バゴット#e19ms61"),"バゴット : ちょっとぉ、うるさいんですけどぉ？",1;
		next;
		mes "[サレクガンド]";
		mes "^0000cd人間^000000か！";
		mes "お前を呼びに行くところだった。";
		mes "ラスガンド様がお呼びだ。";
		emotion 0,"";	// self
		emotion 0,"レイジー#e19ms61";
		unittalk getcharid(3),strcharinfo(0)+" : あいつは…！",1;
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "あ、そう。";
		mes "すかかぁがんど？";
		mes "らすがんどぉ様はいつもの場所？";
		next;
		emotion 36,"サレクガンド#e19ms61";
		cutin "ep18_bagot_01.png", 255;
		mes "[サレクガンド]";
		mes "貴様……！";
		mes "ラスガンド様の側近である";
		mes "私を侮辱するか！";
		next;
		mes "[サレクガンド]";
		mes "主教級ルガンが生まれた今日と言う日に";
		mes "感謝することだ！";
		mes "次は無いと思え！";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "はいは～～い。";
		mes "ん～～～それが主教級ぅ？";
		mes "この時期に生まれたって～？";
		mes "興味深いねぇ～。";
		mes "ちょっ～と、よく見せてくれない？";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "[サレクガンド]";
		mes "それ以上、近づくな！";
		mes "最上級ルガンは実験対象にはできない！";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "あ、そう。";
		mes "司祭級の方はぁ……";
		mes "そっちは^0000cdユンケアに診て^000000もらえば";
		mes "い～んじゃない？";
		mes "イルシオン区画にいるでしょ？";
		mes "後で、バゴットも行くからぁ～。";
		next;
		menu "ユンケア？",-;
		cutin "ep18_bagot_01.png", 255;
		mes "[サレクガンド]";
		mes "ふん……";
		mes "さぁ、主教の子よ。";
		mes "行くとしよう。";
		next;
		mes "[ルガン主教]";
		mes "ヨルムンガンド様と共に！";
		next;
		mes "[サレクガンド]";
		mes "ヨルムンガンド様の祝福を！";
		next;
		cloakonnpc "バゴット#e19ms61";
		cloakonnpc "サレクガンド#e19ms61";
		cloakonnpc "レイジー#e19ms61";
		mes "["+strcharinfo(0)+"]";
		mes "（……イルシオン区画で";
		mes "　診てもらえ……か。";
		mes "　探りに行くのが良さそうだ）";
		delquest 17624;
		setquest 17625;
		set EP19_1QUE,23;
		close;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
	}
	if(EP19_1QUE == 23) {
		mes "[ルガン主教]";
		mes "君は「ユンケア」とかいう";
		mes "人間に診てもらうのだろう？";
		mes "イルシオン区画にいるはずだ。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,56,246,3	script	バゴット#e19ms61	10386,{/* 2591 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		cutin "ep18_bagot_02.png", 2;
		mes "[バゴット]";
		mes "見知らぬ人間？";
		mes "バゴットの研究室の近くを";
		mes "うろつかないでくれる～？";
		close2;
		cutin "ep18_bagot_02.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,51,246,5	script	サレクガンド#e19ms61	10473,{/* 2592 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[サレクガンド]";
		mes "なぜ人間がここにいる!?";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,55,244,1	script	レイジー#e19ms61	10475,{/* 2593 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,22,141,0	script	#e19ms71	139,14,14,{/* 2594 */
	if(EP19_1QUE >= 23 && EP19_1QUE <= 27)
		cloakoffnpc "ユンケア#e19ms71";
	else if(EP19_1QUE == 28) {
		cloakoffnpc "ユンケア#e19ms71";
		cloakoffnpc "レイジー#e19ms72";
		cloakoffnpc "バゴット#e19ms71";
		cloakoffnpc "サレクガンド#e19ms71";
	}
	else if(EP19_1QUE == 29 || EP19_1QUE == 30)
		cloakoffnpc "ユンケア#e19ms71";
	else if(EP19_1QUE >= 36 && EP19_1QUE <= 40) {
		cloakonnpc "ユンケア#e19ms71";
		cloakoffnpc "書類の山#ep19re1";
	}
	else if(EP19_1QUE >= 43 && EP19_1QUE <= 50) {
		cloakonnpc "ユンケア#e19ms71";
		cloakoffnpc "ユンケア#ep19re1";
	}
	else if(EP19_1QUE == 51) {
		// 未調査
	}
	else if(EP19_1QUE == 52 || EP19_1QUE == 53) {
		cloakonnpc "ユンケア#e19ms71";
		cloakonnpc "ユンケア#ep19re1";
		mes "^0000FF‐ユンケアが見当たらない。";
		mes "^0000FF　別の場所を探してみよう‐";
		if(EP19_1QUE == 52) {
			delquest 16655;
			setquest 130475;
			set EP19_1QUE,53;
			//showevent 0, 1, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		}
		close;
	}
	else
		cloakonnpc "ユンケア#e19ms71";
	end;
}

jor_nest.gat,22,141,5	script	ユンケア#e19ms71	10455,{/* 2595 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ユンケア]";
		mes "誰の許可を得て、ここに入ったの？";
		mes "ここは関係者以外立入禁止よ。";
		mes "早く出て行って。";
		close;
	}
	switch(EP19_1QUE) {
	case 23:
		cutin "ep19_juncea04.png", 2;
		mes "[？？？]";
		mes "誰の許可を得て、ここに入ったの？";
		mes "ああ、面倒くさい。";
		mes "いい加減、トラップでも";
		mes "設置してやろうか……。";
		next;
		menu "ユンケア？",-;
		mes "[ユンケア]";
		mes "いきなり呼び捨てなんて";
		mes "無作法にもほどがあるね？";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "……今日生まれた。";
		mes "ここでユンケアに診てもらえって";
		mes "言われたから来た。";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "今日生まれたって？";
		mes "上級ルガンの孵化場には";
		mes "そんな兆候はなかったはずだけど……。";
		next;
		cutin "ep19_juncea02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "私は下級の孵化場で生まれた。";
		mes "最上級のも生まれたけど";
		mes "ラスガンド様の祝福を受けるために";
		mes "どこかに行っちゃった。";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "下級区域から上級と最上級が";
		mes "生まれるだなんて。";
		mes "あそこには、そこまでの魔力は";
		mes "無かったはずなのに……。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……検査が必要ね。";
		mes "検査するから、こっちに来て。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "これ何？";
		mes "他の場所とは違う。";
		mes "ちょっと怖い。";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "面倒くさいから";
		mes "そういうのは他の人に聞いて。";
		next;
		menu "……",-;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "……説明してあげるから";
		mes "検査させてよ。";
		mes "ここは、いろんな実験をする場所。";
		mes "今は、ルガンたちの検査をしてる。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "あなたは、私と姿が違う。";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "私は人間で";
		mes "お前はルガンだからよ。";
		mes "私は、この洞窟の外。";
		mes "すごく遠い場所から来たの。";
		mes "……眼を開けて？";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "どうやって来たの？";
		mes "すごく遠くからなんて。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "「飛行船」に乗って来たの。";
		mes "ユミルの心臓の欠片を動力とする……";
		mes "空を飛ぶ乗り物。";
		mes "ここに停泊してるから";
		mes "機会があれば見ることもあるでしょ。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "遠いところから来た人間……";
		mes "さっき、あなたに似た人間を見た。";
		mes "ば…ばご・……。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "バゴット、ね。";
		mes "あいつはイルシオンの仲間。";
		mes "とは言え、合流したのは";
		mes "つい最近だけど。";
		mes "えーと、口を開けて……。";
		next;
		announce "メモリアルダンジョン[シミュレーション戦闘] に入場しました　：　dryukuyjfujh (Fornese-γ)", 0x9, 0x00ff99;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "うげ～～～っ！";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "ちょっと深く挿し込んじゃったか。";
		mes "少し休憩してから再開しよう。";
		delquest 17625;
		setquest 17626;
		set EP19_1QUE,24;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		cutin "ep19_juncea03.png", 255;
		end;
	case 24:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "休憩はもう良いの？";
		mes "それじゃあ、再開するわ。";
		next;
		menu "ここで何をしている？",-;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……研究。";
		mes "気になることを調べて";
		mes "理解する事。";
		mes "いい加減、少し黙っててくれない？";
		mes "さぁ、手を出して。";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "……手だって。手を出すの。";
		unittalk getcharid(3),strcharinfo(0)+" : …………",1;
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "はぁ……";
		mes "わかったわよ、喋って良いから。";
		mes "何が聞きたいの？";
		next;
		menu "何を研究してるの？",-;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "お前たちルガンと";
		mes "ここから得られる魔力について。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "……私も研究の対象？";
		mes "私の体も調べたり";
		mes "実験に使ったりする？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "それはできない。約束してるから。";
		mes "上級以上のルガンは";
		mes "実験の対象にはできないの。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "ここは生まれた時の魔力の量によって";
		mes "身分が決まる。";
		mes "お前たちの言い方だと祝福だっけ？";
		mes "上から、最上級の主教。";
		mes "上級の司祭、中級の平信徒。";
		next;
		mes "[ユンケア]";
		mes "上級を実験体として使うと";
		mes "不安がられる。";
		mes "中級以上のルガンには";
		mes "思考能力があるから。";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "私は祝福された上級なんだ！";
		mes "研究して疑問は解けたの？";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "まだ研究の途中……";
		mes "お前たちと、ここの魔力には";
		mes "相関関係があるけど";
		mes "それをもっと発展させるには……。";
		next;
		mes "[ユンケア]";
		mes "あ、待てよ……";
		mes "最近は上級以上のルガンは";
		mes "殆ど生まれていないはずなのに";
		mes "魔力が残っていない場所から……";
		mes "もしかすると……。";
		next;
		mes "[ユンケア]";
		mes "お前を実験対象にはできないけど";
		mes "お前が「生まれた卵」なら使える。";
		mes "その卵と、そこに残ってる魔力を";
		mes "調べてみないと。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "私はここで待ってるから";
		mes "卵の殻を持ってきて。";
		mes "お前が生まれた場所";
		mes "「蛇神の温もり」にあるはずだから。";
		delquest 17626;
		setquest 17627;
		set EP19_1QUE,25;
		next;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		//showevent 0, 1, ミリアム#e19ms20;	// 2572: 263, 170
		cutin "ep19_juncea01.png", 255;
		mes "‐一度ミリアムたちの元へ戻ろう‐";
		mes "　";
		mes "‐ミリアムたちの元へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ミリアムたちの元へ向かった‐";
		close2;
		warp "jor_dun02.gat", 259, 167;
		end;
	case 25:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "私はここで待ってるから";
		mes "卵の殻を持ってきて。";
		mes "「蛇神の温もり」にあるはずだから。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "‐一度ミリアムたちの元へ戻ろう‐";
		mes "　";
		mes "‐ミリアムたちの元へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ミリアムたちの元へ向かった‐";
		close2;
		warp "jor_dun02.gat", 259, 167;
		end;
	case 26:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "私はここで待ってるから";
		mes "卵の殻を持ってきて。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "‐上級孵化場へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐上級孵化場へ向かった‐";
		close2;
		warp "jor_nest.gat", 28, 61;
		end;
	case 27:
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "この……魔力を繋げる媒体は……";
		mes "誰!!";
		mes "勝手に入って来たのは！";
		next;
		menu "卵の殻持ってきた",-;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "なんだ、お前か……";
		mes "これがお前の卵の殻？";
		next;
		cutin "ep19_juncea02.png", 2;
		misceffect 779,"ユンケア#e19ms71";
		mes "[ユンケア]";
		mes "……魔力の残留量が高い。";
		mes "ついさっき孵化したばかりみたい？";
		mes "形は……他の卵の殻とは";
		mes "ちょっと異なってる。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "下級区域に置かれていたから？";
		mes "残った体の魔力は残っていないのに";
		mes "どうやってそこから上級が生まれた？";
		next;
		menu "残った体？　魔力？",-;
		mes "[ユンケア]";
		mes "……説明するのは面倒だから";
		mes "他のルガンにでも聞いてみれば？";
		next;
		menu "……",-;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "また、そんな顔をする……";
		mes "わかったわよ。";
		mes "はぁ……。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "この巣は、すごく巨大な魔力の塊なの。";
		mes "生存のために魔力が必要なルガンは";
		mes "本能に導かれて魔力を吸収し";
		mes "ここで生まれてくる。";
		next;
		mes "[ユンケア]";
		mes "それを長い間……";
		mes "すごい昔からやってるんだけど";
		mes "魔力がどんどん無くなってきて";
		mes "今では、ほとんど残っていない。";
		next;
		menu "大変だ！",-;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "そう、大変。";
		mes "なのに、お前のような上級や";
		mes "最上級が生まれてくるなんて。";
		next;
		mes "[ユンケア]";
		mes "本来は、血を撒くルガンの等級によって";
		mes "卵の等級も決まる。";
		mes "稀に、卵の時に魔力を多く吸収して";
		mes "上級以上が生まれることもあるけど";
		mes "あくまで例外だから。";
		next;
		mes "[ユンケア]";
		mes "私の専門分野は";
		mes "魔力と魔道具の活用だからね。";
		mes "体の中に魔力を永久に";
		mes "留める方法を探ってる。";
		mes "人間にはできないけど";
		mes "ルガンにはそれができる。";
		next;
		mes "[ユンケア]";
		mes "私とルガンの利害が一致したの。";
		mes "私はルガンを研究する。";
		mes "ルガンは、私の研究の成果を使って";
		mes "残り僅かな魔力を増幅したり";
		mes "卵に魔力を注入したり.……。";
		next;
		menu "上級ルガンは強い？",-;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "強い……かな。";
		mes "魔力を使った呪術や";
		mes "人間と異なる感覚器官。";
		mes "遠い昔に人間たちが苦戦したと";
		mes "聞いてるけど、嘘じゃないと思う。";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "さぁ、おしゃべりは終わり。";
		mes "次は、魔力の波長を見ないと。";
		mes "ん……誰か来たみたい。";
		next;
		cutin "ep19_juncea01.png", 255;
		cloakoffnpc "レイジー#e19ms72";
		mes "[レイジー]";
		mes "じゃじゃ～～ん！";
		cloakoffnpc "バゴット#e19ms71";
		cloakoffnpc "サレクガンド#e19ms71";
		unittalk getnpcid(0,"バゴット#e19ms71"),"バゴット : バゴットが来ましたよ～。";
		cutin "ep19_juncea04.png", 2;
		delquest 17629;
		setquest 17630;
		delitem 1000608,1;
		set EP19_1QUE,28;
		cutin "ep19_juncea04.png", 255;
		close;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 0, 1, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
	case 28:
		cutin "ep19_juncea01.png", 2;
		cloakoffnpc "レイジー#e19ms72";
		cloakoffnpc "バゴット#e19ms71";
		cloakoffnpc "サレクガンド#e19ms71";
		mes "[ユンケア]";
		mes "バゴットがどうして";
		mes "ルガンを連れている？";
		close2;
		cutin "ep19_juncea01.png", 255;
		end;
	case 29:
		cutin "ep19_juncea03.png", 2;
		cloakoffnpc "レイジー#e19ms72";
		mes "[ユンケア]";
		mes "……私が先に来たのに！";
		mes "……私のがたくさん仕事したのに!!";
		mes "……魔力について全部教えたのに!!!";
		mes "……私のが緊急性が高いのにっ!!!!";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "[レイジー]";
		mes "コイツは、何を言ってるの？";
		mes "様子がおかしいよ？";
		mes "バゴットと違う！";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "コイツ、だと？";
		mes "ユンケア！";
		mes "いや……ユンケア様と呼べ！";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[レイジー]";
		mes "ユンケアサマァ？";
		mes "バゴットよりも文字数が多い！";
		mes "ここでは文字数が少ない方が";
		mes "偉いって教えてもらった！";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "この……!!";
		mes "バゴットよりも私の方が";
		mes "先にここに来て";
		mes "ルガンに協力してたのに！";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[レイジー]";
		mes "蔑ろにされたからって";
		mes "私に八つ当たりするの？";
		mes "そんなんだから";
		mes "優先順位を下げられたんじゃない？";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "こいつ……";
		mes "今日生まれたばっかりのくせに！";
		mes "こっちに来い！";
		mes "その頭の中から調べてやる！";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[レイジー]";
		mes "寛容さも無いみたい。";
		mes "我らと人間は古くは反目した仲だけど";
		mes "私は種を超越して人間である";
		mes "あなたを受け入れるのに。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "口ばっかり……！";
		mes "頭を調べる前に";
		mes "その口を塞いでやるっ！";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ユンケアの研究は";
		mes "さっきの人間の研究とは違うの？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "違う！";
		mes "こことは違う研究室で実験してる。";
		mes "何をしてるかは知らないけど。";
		mes "……はぁ、もうっ！";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "最上級のあんたは……";
		mes "いいから、こっちに来い!!";
		mes "データを出せって言われてるんだから";
		mes "こっちに座って、これを着けて！";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[レイジー]";
		mes "あれ～？";
		mes "なんだかんだ言って";
		mes "バゴットの命令に従うの？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "うるさい!!";
		mes "あんた、バゴットと一緒に";
		mes "ラスガンドに会って来たの？";
		mes "なら、バゴットが何をしてるか";
		mes "聞いてない？";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "[レイジー]";
		mes "聞いてない。";
		mes "ただ書類みたいなのを見せながら";
		mes "自分の持つ「大いなる力」を使えば";
		mes "ラスガンド様の願いが叶うし";
		mes "自分の研究も完成するとか言ってた。";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "大いなる力……？";
		mes "ユミルの心臓の欠片のことか。";
		mes "それを使って何かするつもり？";
		mes "ラスガンドの興味を引く何か……。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……さぁ、これで終わり。";
		mes "お前たち二人は、後でまた呼ぶかも。";
		mes "名前を教えて。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "[レイジー]";
		mes "私はスベグガンド。";
		mes "ラスガンド様が付けてくださった。";
		next;
		menu "私は、名前ない",-;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "名前が無いって？";
		mes "普通は、生まれてすぐに上位のルガンが";
		mes "付けるはずなのに……";
		mes "忘れてたのかもね？";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……お前は、セネキオガンドにしよう。";
		mes "命名のルールがあったはずだけど";
		mes "多分、文字数も合ってるし";
		mes "問題無いんじゃない？";
		next;
		menu "どういう意味？",-;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "私の研究室に置いていた観葉……";
		mes "いや、気に入ったのなら";
		mes "意味なんて気にしなくていい。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……さあ、今日はこれで終わり。";
		mes "私は、調査した結果をバゴットに";
		mes "渡さないといけない。";
		mes "また、後でね……。";
		delquest 17631;
		setquest 17632;
		set EP19_1QUE,30;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 0, 1, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		cloakonnpc "レイジー#e19ms72";
		cutin "ep19_juncea04.png", 255;
		end;
	case 30:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "なぜまだここにいる？";
		mes "今は研究に邪魔だから。";
		mes "また、後でね……。";
		close2;
		cutin "ep19_juncea01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,26,142,3	script	バゴット#e19ms71	10386,{/* 2596 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		cutin "ep18_bagot_02.png", 1;
		mes "[バゴット]";
		mes "なに？　実験体？";
		mes "邪魔だから出て行って～。";
		close2;
		cutin "ep18_bagot_02.png", 255;
		end;
	}
	if(EP19_1QUE == 28) {
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "久し振り～。";
		mes "ところでユンケアちゃんは";
		mes "笑い方を忘れちゃったぁ？";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[ユンケア]";
		mes "……もうここには来ないと";
		mes "思っていたのだけど。";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "バゴットが来ちゃダメぇ？";
		mes "ここは共用研究室でしょ～？";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[ユンケア]";
		mes "今は、別の実験室をもらって";
		mes "一人で研究してるじゃない……。";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "今日、上級と最上級のルガンが";
		mes "生まれたのは知ってる～？";
		mes "上級の検査が終わってるなら";
		mes "次は、この最上級を検査して";
		mes "結果をバゴットに共有して～。";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "……今、別の作業をしてるから";
		mes "それが終わったらね。";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "だぁ～～めぇ！";
		mes "バゴットのが最優先でぇ～す！";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[ユンケア]";
		mes "はあ？";
		mes "なんで私の作業よりあなたのを";
		mes "優先しないといけないの？";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "さきほど優先順位が変わりました～～。";
		mes "今からバゴットの研究が最優先でぇ～す。";
		mes "一番大事ぃ!!";
		next;
		mes "[バゴット]";
		mes "ここの指導者が";
		mes "バゴットの研究を気に入って";
		mes "優先順位が変わったですよぉ～。";
		mes "全研究員？　ユンケアのみだけど～";
		mes "バゴットの研究を全面的に";
		mes "サポートしなくちゃならないの～。";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[ユンケア]";
		mes "そんなことって……!?";
		mes "私の方が先に、ここで研究してたのに！";
		mes "ルガンと交渉して、支援を得られたのも";
		mes "私が……！";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "[サレクガンド]";
		mes "優先順位が変わった。";
		mes "ラスガンド様の判断だ。";
		mes "今より、研究に関するリソースも含めて";
		mes "この人間の研究が最優先となる。";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "はい、聞きましたぁ？";
		mes "ユンケアちゃんが個人的にやることには";
		mes "興味ないけどぉ～";
		mes "バゴットが欲しいって言ったら";
		mes "それを先にしないとダメ～。";
		mes "じゃあ、お話はおしまい！";
		delquest 17630;
		setquest 17631;
		set EP19_1QUE,29;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		cloakonnpc "バゴット#e19ms71";
		cloakonnpc "サレクガンド#e19ms71";
		cutin "ep18_bagot_03.png", 255;
		end;
	}
	if(EP19_1QUE == 29) {
		// 未調査
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,24,142,3	script	レイジー#e19ms72	10475,{/* 2597 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,25,140,1	script	サレクガンド#e19ms71	10473,{/* 2598 (cloaking)*/
	unittalk "サレクガンド : 私が話しかける前に、話しかけるな。";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,23,58,0	script	#e19ms81	139,5,5,{/* 2599 */
	if(EP19_1QUE == 26) {
		cloakoffnpc "ルガン司祭#e19ms81";
		cloakoffnpc "ルガン司祭#e19ms82";
		cloakoffnpc "ホルル#e19ms81";
		cloakoffnpc "レハール#e19ms81";
		cloakoffnpc "ルガン主教#e19ms81";
	}
	end;
}
jor_nest.gat,23,58,5	script	ルガン司祭#e19ms81	10470,{/* 2600 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン司祭]";
		mes "汚らわしい人間め！";
		mes "出ていけ！";
		close;
	}
	if(EP19_1QUE == 26) {
		mes "[ルガン司祭]";
		mes "うん？";
		mes "今日生まれた子ではないか？";
		mes "道に迷ったのか？";
		mes "あまりここには来ては駄目だぞ。";
		next;
		mes "[ホルル]";
		mes "放せ！　放すんだ！";
		next;
		mes "[ホルル]";
		mes "わざと卵を割ったんじゃない！";
		mes "不可抗力だ！";
		next;
		mes "[ルガン主教]";
		mes "不可抗力だと？";
		mes "それで許されると思っているのか？";
		mes "ここに置かれているのは";
		mes "上級以上のルガンとして生まれるはずの";
		mes "卵なのだぞ！";
		next;
		mes "[レハール]";
		mes "御許しください！";
		mes "どうかお慈悲を！";
		mes "この者は、私が注意しておきますから！";
		next;
		mes "[ルガン司祭]";
		mes "……いかがいたしますか？";
		next;
		mes "[ルガン主教]";
		mes "今日は、主教級と司祭級が生まれた";
		mes "めでたい日だからな……お前たち！";
		mes "名前は何というか？";
		next;
		mes "[ホルル]";
		mes "ホ、ホルルルルガンド！";
		next;
		mes "[レハール]";
		mes "わ、わたしは";
		mes "レハルスゴイガンドです！";
		next;
		mes "[ルガン主教]";
		mes "二人を下級区域に行かせろ！";
		mes "再び呼ぶまで、そこで働かせるのだ。";
		mes "レハルスゴイガンド！";
		mes "お前が責任を持って";
		mes "ホルルルルガンドを教化しろ。";
		next;
		mes "[ルガン主教]";
		mes "それができなかった時は";
		mes "罪人として二人とも処分する。";
		mes "司教、連れて行け！";
		emotion 1,"ホルル#e19ms81";
		emotion 1,"レハール#e19ms81";
		emotion 1,"";	// self
		next;
		cloakonnpc "ルガン司祭#e19ms82";
		cloakonnpc "ホルル#e19ms81";
		cloakonnpc "レハール#e19ms81";
		cloakonnpc "ルガン主教#e19ms81";
		menu "私の卵の殻を……",-;
		mes "[ルガン司祭]";
		mes "なにっ!?";
		mes "君の卵の殻はここにはないぞ。";
		mes "別のところで生まれたんだろう？";
		next;
		mes "[ルガン司祭]";
		mes "それにしても……";
		mes "割られた卵はどうしよう。";
		mes "他に割られた卵はないだろうな？";
		mes "調べておくか。";
		unittalk getcharid(3),strcharinfo(0)+" : この隙に、こっそり殻を盗もう。",1;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		set EP19_1QUE,27;
		delquest 17628;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		setquest 17629;
		getitem 1000606,1;	//unexpected error
		close;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
	}
	if(EP19_1QUE == 27) {
		mes "[ルガン司祭]";
		mes "なんでも人間の居住地に";
		mes "出入りしているらしいな？";
		mes "ヒドイことをされていないか？";
		close;
	}
	if(EP19_1QUE >= 28) {
		mes "[ルガン司祭]";
		mes "うん？";
		mes "道に迷ったのか？";
		mes "あまりここには来ては駄目だぞ。";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,21,55,7	script	ホルル#e19ms81	21529,{/* 2601 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,22,54,7	script	レハール#e19ms81	21529,{/* 2602 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,25,57,3	script	ルガン主教#e19ms81	10473,{/* 2603 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン主教]";
		mes "汚らわしい人間が";
		mes "なぜここにいる!?";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,26,55,3	script	ルガン司祭#e19ms82	10471,{/* 2604 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン司祭]";
		mes "下から逃げ出してきたのか？";
		mes "仕事に戻れ！";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,82,163,14	script	チャイム#e19ms71	10080,14,5,{/* 2605 */
	unittalk "ディンドン♪";
	end;
OnTouch:
	if(EP19_1QUE == 30) {
		cloakonnpc "ユンケア#e19ms71";
		cloakoffnpc "レイジー#e19ms71";
	}
	end;
}
jor_nest.gat,87,164,3	script	レイジー#e19ms71	10475,{/* 2606 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[レイジー]";
		mes "おいおい、ここはルガンに変身しないと。";
		mes "モロバレだぜ？";
		close;
	}
	if(EP19_1QUE == 30) {
		cloakonnpc "ユンケア#e19ms71";
		cloakoffnpc "レイジー#e19ms71";
		mes "[レイジー]";
		mes "おーい！";
		mes strcharinfo(0)+"!!";
		mes "こっちだ、こっち!!";
		next;
		menu "レイジーさん？",-;
		mes "[レイジー]";
		mes "ひゅ～～！";
		mes "潜入捜査は緊張するな！";
		mes "いつバレるかとヒヤヒヤしっぱなしだ！";
		mes strcharinfo(0)+"は";
		mes "順調そうで良かったよ。";
		next;
		mes "[レイジー]";
		mes "何か情報は得た？";
		mes "イルシオンの動向は？";
		mes "こっちはラスガンドの部屋で";
		mes "待たされてたから";
		mes "全然調査できてなくてね。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "まだわからないことが多いです。";
		mes "飛行船がここに停泊しているという";
		mes "情報は得ました。";
		next;
		mes "[レイジー]";
		mes "イルシオンが乗って来たやつだな。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "あと、ホルルさんとレハールさんが";
		mes "ルガンの卵を割った罪で";
		mes "下級区域に連れて行かれました。";
		mes "労働させられています。";
		next;
		mes "[レイジー]";
		mes "おいおい！";
		mes "そんな話は、すぐに言わなきゃ！";
		mes "急いで助けに行くべきだけど";
		mes "まあ、レハールも一緒ならば";
		mes "当面は大丈夫だろう。";
		next;
		mes "[レイジー]";
		mes "まずは、飛行船の位置を確認しよう。";
		mes "飛行船を抑えないと";
		mes "いざイルシオンを捕まえようとしても";
		mes "また逃げられてしまうかもしれない。";
		mes "逃げ道は塞いでおかないとね。";
		delquest 17632;
		setquest 17633;
		set EP19_1QUE,31;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 0, 1, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		cloakonnpc "レイジー#e19ms71";
		end;
	}
	if(EP19_1QUE == 31) {
		cloakonnpc "ユンケア#e19ms71";
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,24,252,0	script	#e19ms91	139,6,6,{/* 2607 */
	if(EP19_1QUE >= 68) {
		cloakonnpc "警備ルガン#e19ms91";
		cloakonnpc "警備ルガン#e19ms92";
		cloakonnpc "警備ルガン#e19ms93";
		cloakonnpc "警備ルガン#e19ms94";
	}
	else if(EP19_1QUE == 31) {
		cloakoffnpc "レイジー#e19ms91";
	}
	end;
}
jor_nest.gat,24,252,1	script	レイジー#e19ms91	10475,{/* 2608 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[レイジー]";
		mes "おいおい、ここはルガンに変身しないと。";
		mes "モロバレだぜ？";
		close;
	}
	if(EP19_1QUE == 31) {
		mes "[レイジー]";
		mes "ふぅん。";
		mes "ここが飛行船の停泊地か。";
		mes "流石に警備が厳重そうだな。";
		mes "すぐに出航するみたいな様子は";
		mes "見られないな。";
		next;
		mes "[レイジー]";
		mes "とはいえ、こいつは何とかしないと。";
		mes "放っておいたら、またこれを使って";
		mes "イルシオンの奴らが";
		mes "逃げ出すかもしれないじゃない？";
		mes "何とか破壊できないか？";
		next;
		menu "二人だけでは無理ですね",-;
		mes "[レイジー]";
		mes "仕方ない。";
		mes "位置は把握したから";
		mes "下級区域に行こうか。";
		mes "ホルルとレハールを見に行こう。";
		next;
		delquest 17633;
		setquest 17634;
		set EP19_1QUE,32;
		mes "‐下級区域へ向かいますか？‐";
		next;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		//showevent 0, 1, 警備ルガン#e19ms95;	// 2618: 153, 239
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐下級区域へ向かった‐";
		close2;
		warp "jor_dun02.gat", 153, 234;
		end;
	}
	if(EP19_1QUE == 32) {
		mes "[レイジー]";
		mes "仕方ない。";
		mes "位置は把握したから";
		mes "下級区域に行こうか。";
		mes "ホルルとレハールを見に行こう。";
		next;
		mes "‐下級区域へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐下級区域へ向かった‐";
		close2;
		warp "jor_dun02.gat", 153, 234;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,29,251,5	script	警備ルガン#e19ms91	10470,{/* 2609 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[警備ルガン]";
		mes "近寄るな！　人間め！";
		close;
	}
	unittalk "……";
	end;
}

jor_nest.gat,23,247,5	script	警備ルガン#e19ms92	10471,{/* 2610 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[警備ルガン]";
		mes "人間がなぜここにいる！";
		close;
	}
	unittalk "……";
	end;
}

jor_nest.gat,41,270,3	script	警備ルガン#e19ms93	10473,{/* 2611 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[警備ルガン]";
		mes "汚らわしい人間が、何をしている！";
		close;
	}
	unittalk "……";
	end;
}

jor_nest.gat,35,270,5	script	警備ルガン#e19ms94	10474,{/* 2612 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[警備ルガン]";
		mes "ここは立入禁止だ！";
		close;
	}
	unittalk "……";
	end;
}

jor_dun02.gat,151,236,0	script	#e19ms93	139,{/* 2613 */}
jor_dun02.gat,140,225,0	script	jor_dun02_sw_3	139,{/* 2614 */}
jor_dun02.gat,151,225,0	script	jor_dun02_sw_4	139,{/* 2615 */}
jor_dun02.gat,161,229,0	script	jor_dun02_sw_5	139,{/* 2616 */}
jor_dun02.gat,152,253,0	script	jor_dun02_sw_6	139,{/* 2617 */}

jor_dun02.gat,153,239,3	script	警備ルガン#e19ms95	10470,{/* 2618 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[警備ルガン]";
		mes "近寄るな！　人間め！";
		close;
	}
	if(EP19_1QUE == 32) {
		mes "[警備ルガン]";
		mes "はぁ……早く交代の時間に";
		mes "なってくれないだろうか。";
		emotion 45;
		next;
		cloakoffnpc "レイジー#e19ms92";
		mes "[レイジー]";
		mes "ご苦労！";
		mes "異常はないか？";
		next;
		mes "[警備ルガン]";
		mes "あっ！";
		mes "そのお姿は、主教様！";
		mes "そ、それに司教様も！";
		mes "何か御用でしょうか！";
		next;
		mes "[警備ルガン]";
		mes "ここは贖罪の為に";
		mes "労働者が労働に従事する場所です。";
		mes "お二人がここに来られる理由は";
		mes "無いかと思いますが……。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "今日、処分を受けた者がいるだろう？";
		mes "ホルルルルガンドと";
		mes "レハルスゴイガンド。";
		mes "その者を連れて行くために来た。";
		next;
		mes "[警備ルガン]";
		mes "ご無礼をお許しください！";
		mes "ど、どうぞお入りください！";
		delquest 17634;
		setquest 17635;
		set EP19_1QUE,33;
		close2;
		//showevent 9999, 0, ミリアム#e19ms20;	// 2572: 263, 170
		//showevent 9999, 0, 警備ルガン#e19ms95;	// 2618: 153, 239
		//showevent 0, 1, ミリアム#e19ms91;	// 2621: 150, 269
		cloakonnpc "レイジー#e19ms92";
		cloakoffnpc "ミリアム#e19ms91";
		cloakoffnpc "レハール#e19ms91";
		cloakoffnpc "ホルル#e19ms91";
		cloakoffnpc "レイジー#e19ms93";
		end;
	}
	if(EP19_1QUE == 33 || EP19_1QUE == 34) {
		mes "[警備ルガン]";
		mes "用事はお済になりましたか？";
		close;
	}
	if(EP19_1QUE >= 35) {
		mes "[警備ルガン]";
		mes "ここには来ない方が良いですよ。";
		close;
	}
	mes "[警備ルガン]";
	mes "交代の時間か……？";
	mes "違うのか……。";
	close;
}
jor_dun02.gat,150,237,7	script	レイジー#e19ms92	10475,{/* 2619 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,150,269,0	script	#e19ms94	139,5,5,{/* 2620 */
	if(EP19_1QUE == 33 || EP19_1QUE == 34) {
		cloakoffnpc "ミリアム#e19ms91";
		cloakoffnpc "レハール#e19ms91";
		cloakoffnpc "ホルル#e19ms91";
		cloakoffnpc "レイジー#e19ms93";
	}
	end;
}

jor_dun02.gat,150,269,3	script	ミリアム#e19ms91	21529,{/* 2621 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "["+strcharinfo(0)+"]";
		mes "（おっと……ルガンに変身しなくちゃ）";
		close;
	}
	if(EP19_1QUE == 33) {
		cloakoffnpc "レイジー#e19ms93";
		mes "[ルガン]";
		mes "<FONT SIZE = 9>主教様と司祭様。</FONT>";
		mes "<FONT SIZE = 9>こちらです！</FONT>";
		next;
		mes "[レイジー]";
		mes "さて……私たちを呼ぶのは";
		mes "いったい誰だ？";
		mes "同じ姿だから見分けがつかないぞ。";
		next;
		mes "[ミリアム]";
		mes "ミリアムです。";
		mes "こちらはレハールさん。";
		mes "ホルルさんも一緒です。";
		next;
		menu "みんな無事でしたか！",-;
		mes "[レイジー]";
		mes "連れていかれたと聞いて";
		mes "心配してたんだけど";
		mes "大丈夫そうで良かったよ。";
		mes "なにやら恐ろしい目に";
		mes "遭ってるんじゃないかってね。";
		next;
		mes "[ミリアム]";
		mes "恐ろしいことには違いありません。";
		mes "見てください。";
		mes "ここには下級ルガン以外にも";
		mes "人間がいるんです。";
		next;
		menu "どうやってここに？",-;
		mes "[ミリアム]";
		mes "飛行船で拉致してきた";
		mes "人たちみたいです。";
		next;
		mes "[レハール]";
		mes "この状況は、労働法違反を";
		mes "幾らでも指摘できそうです……";
		mes "イルシオンの実験に使われたり";
		mes "ここで労働に従事させられていたり。";
		next;
		mes "[レイジー]";
		mes "彼らも助け出さないとだけど";
		mes "まずは君たちをここから出さないと。";
		next;
		mes "[レハール]";
		mes "出て行っても問題無いのですか？";
		next;
		mes "[レイジー]";
		mes "警備のルガンにも言っておいた。";
		mes "主教が連れて行くのだから";
		mes "文句を言うやつはいないだろう？";
		next;
		mes "[レイジー]";
		mes "いったん、氷の城に戻ろうぜ。";
		mes "集めた情報を元に";
		mes "作戦を立てないとな。";
		mes "やることは多いぞ。";
		delquest 17635;
		setquest 17636;
		set EP19_1QUE,34;
		next;
		//showevent 9999, 0, ミリアム#e19ms20;	// 2572: 263, 170
		//showevent 9999, 0, 警備ルガン#e19ms95;	// 2618: 153, 239
		//showevent 0, 1, ミリアム#e19ms91;	// 2621: 150, 269
		//showevent 0, 1, オーレリー#e19ms00;	// 2546: 34, 189
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icas_in.gat", 35, 186;
		end;
	}
	if(EP19_1QUE == 34) {
		mes "[レイジー]";
		mes "いったん、氷の城に戻ろうぜ。";
		mes "集めた情報を元に";
		mes "作戦を立てないとな。";
		mes "やることは多いぞ。";
		next;
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icas_in.gat", 35, 186;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,145,271,5	script	レハール#e19ms91	21529,{/* 2622 (cloaking)*/
	unittalk "レハール : 助けに来てくれたのですね！";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,141,267,5	script	ホルル#e19ms91	21529,{/* 2623 (cloaking)*/
	unittalk "ホルル : やれやれ、ひどい目に遭ったよ。";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,145,267,7	script	レイジー#e19ms93	10475,{/* 2624 (cloaking)*/
	unittalk "レイジー : ほ～ら、二人とも無事だったろ？";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,141,258,5	script	ルガン#e19ms91	21528,{/* 2625 */
	unittalk "ルガン : めし…",1;
	end;
}

jor_dun02.gat,146,255,1	script	ルガン#e19ms92	21528,{/* 2626 */
	unittalk "ルガン : ね…る…",1;
	end;
}

jor_dun02.gat,147,258,3	script	ルガン#e19ms93	21528,{/* 2627 */
	unittalk "ルガン : あ…う…",1;
	end;
}

jor_dun02.gat,134,257,3	script	人間#e19ms91	93,{/* 2628 */
	unittalk "労働者 : 必ずここから脱出してやる……",1;
	end;
}

jor_dun02.gat,136,254,3	script	人間#e19ms92	870,{/* 2629 */
	unittalk "労働者 : 来たくて来た訳じゃないのに……",1;
	end;
}

jor_dun02.gat,140,253,3	script	人間#e19ms93	84,{/* 2630 */
	unittalk "労働者 : 今日の仕事は必ず終わらせます！",1;
	end;
}

jor_dun02.gat,148,264,7	script	人間#e19ms94	89,{/* 2631 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,108,79,0	script	#e19ms100	139,5,5,{/* 2632 */
	if(EP19_1QUE >= 68)
		cloakonnpc "ルガン司祭#e19ms100";
	end;
}
jor_nest.gat,108,79,5	script	ルガン司祭#e19ms100	10471,{/* 2633 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン司祭]";
		mes "人間がなぜここに？";
		mes "すぐに出ていけ！";
		close;
	}
	unittalk "ルガン司祭 : 私だけ上手く行きますように…私だけ…";
	end;
}

jor_nest.gat,115,212,0	script	#e19ms101	139,5,5,{/* 2634 */
	if(EP19_1QUE >= 68)
		cloakonnpc "ルガン司祭#e19ms101";
	end;
}
jor_nest.gat,115,212,3	script	ルガン司祭#e19ms101	10470,{/* 2635 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン司祭]";
		mes "人間のくせ！";
		mes "どうやってここに入った!?";
		close;
	}
	if(EP19_1QUE >= 41)	//切り替わりタイミング未調査
		unittalk "ルガン司祭 : もうここには慣れた？";
	else
		unittalk "ルガン司祭 : 今日生まれた子だよね？";
	end;
}

jor_nest.gat,76,22,0	script	#e19ms102	139,5,5,{/* 2636 */
	if(EP19_1QUE >= 68)	{
		cloakonnpc "ルガン主教#e19ms100";
		cloakonnpc "ルガン主教#e19ms101";
	}
	end;
}
jor_nest.gat,76,22,3	script	ルガン主教#e19ms100	10473,{/* 2637 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン主教]";
		mes "人間のくせ！";
		mes "どうやってここに入った!?";
		close;
	}
	if(EP19_1QUE >= 41)	{	// いつから切り替わりか未調査
		unittalk "ルガン主教 : 食べ物が欲しいのか？";
		end;
	}
	unittalk getnpcid(0,"ルガン主教#e19ms100"),"ルガン主教 : 新しく生まれた子か？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"ルガン主教#e19ms101"),"ルガン主教 : 進路は決めた？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"ルガン主教#e19ms100"),"ルガン主教 : 生まれたばかりの子にいうことじゃないだろ！";
	end;
}
jor_nest.gat,73,17,7	script	ルガン主教#e19ms101	10474,{/* 2638 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン主教]";
		mes "人間のくせ！";
		mes "どうやってここに入った!?";
		close;
	}
	if(EP19_1QUE >= 41)	{	// いつから切り替わりか未調査
		unittalk "ルガン主教 : 腹は減ってないか？";
		end;
	}
	unittalk getnpcid(0,"ルガン主教#e19ms101"),"ルガン主教 : 私たちは、いつも子供たちを歓迎する。";
	unittalk getnpcid(0,"ルガン主教#e19ms100"),"ルガン主教 : 気になることがあれば、何でも聞くんだよ？";
	end;
}

jor_nest.gat,186,173,0	script	#e19ms103	139,5,5,{/* 2639 */
	if(EP19_1QUE >= 68)
		cloakonnpc "ルガン司祭#e19ms102";
	end;
}
jor_nest.gat,186,173,3	script	ルガン司祭#e19ms102	10472,{/* 2640 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン司祭]";
		mes "下級区域にいるはずの人間が";
		mes "どうやってここに来た？";
		close;
	}
	if(EP19_1QUE >= 41)	// いつから切り替わりか未調査
		unittalk "ルガン司祭 : ヨルムンガンド様は私たちを見守っていらっしゃる。";
	else
		unittalk "ルガン司祭 : 後で訪ねてきてくれ。教理に関して教えよう。";
	end;
}

jor_nest.gat,179,144,0	script	#e19ms104	139,5,5,{/* 2641 */
	if(EP19_1QUE >= 68)	// 未確認
		cloakonnpc "ルガン主教#e19ms102";
	end;
}
jor_nest.gat,179,144,3	script	ルガン主教#e19ms102	10474,{/* 2642 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン主教]";
		mes "人間がなぜここに？";
		mes "すぐに出ていけ！";
		close;
	}
	if(EP19_1QUE >= 41)	// いつから切り替わりか未調査
		unittalk "ルガン主教 : 新しく生まれた子か！";
	else
		unittalk "ルガン主教 : 知らない顔だな？　新しい子か？";
	end;
}

jor_nest.gat,123,132,0	script	#e19ms105	139,5,5,{/* 2643 */
	if(EP19_1QUE >= 68)
		cloakonnpc "ルガン司祭#e19ms103";
	end;
}
jor_nest.gat,123,132,5	script	ルガン司祭#e19ms103	10470,{/* 2644 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン司祭]";
		mes "下級区域にいるはずの人間が";
		mes "どうやってここに来た？";
		close;
	}
	if(EP19_1QUE >= 41)	// いつから切り替わりか未調査
		unittalk "ルガン司祭 : ここには慣れたかな？";
	else
		unittalk "ルガン司祭 : 新しく生まれた子？　早く私と一緒に働いて欲しい。";
	end;
}

jor_nest.gat,219,38,0	script	#e19ms106	139,5,5,{/* 2645 */
	if(EP19_1QUE >= 68)
		cloakonnpc "ルガン司祭#e19ms104";
	end;
}
jor_nest.gat,219,38,5	script	ルガン司祭#e19ms104	10472,{/* 2646 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン司祭]";
		mes "下級区域にいるはずの人間が";
		mes "どうやってここに来た？";
		close;
	}
	if(EP19_1QUE >= 41)	{	// いつから切り替わりか未調査
		unittalk "ルガン司祭 : いじめる者がいたら、私に教えてくれよ。";
		end;
	}
	unittalk "ルガン司祭 : あれ？　あぁ、新しく生まれた？";
	end;
}

jor_nest.gat,224,207,3	script	ハートハンター#e19ms100	21536,{/* 2647 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "労役中の人間が、ここに来るな！";
		mes "仕事に戻れ！";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "ハートハンター : ここで施設を守っている。";
	else
		unittalk "ハートハンター : おい、あまり近付くな。";
	end;
}

jor_nest.gat,231,253,5	script	ハートハンター#e19ms101	21536,{/* 2648 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "労役中の人間が、ここに来るな！";
		mes "仕事に戻れ！";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "ハートハンター : ここはちょっと不気味だぜ。";
	else
		unittalk "ハートハンター : 近づきすぎだ。一歩離れろ。";
	end;
}

jor_nest.gat,231,186,5	script	ハートハンター#e19ms102	21536,{/* 2649 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "労役中の人間が、ここに来るな！";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "ハートハンター : 警備の仕事は暇だぜ。";
	else
		unittalk "ハートハンター : ちっ、ルガンかよ。";
	end;
}

jor_nest.gat,232,161,3	script	ハートハンター#e19ms103	21536,{/* 2650 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "何をしている？";
		mes "仕事に戻れ！";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "ハートハンター : 誰も来ないのに、何を守れっていうんだ？";
	else
		unittalk "ハートハンター : 何だ？　何か用か？";
	end;
}

jor_nest.gat,217,144,5	script	ハートハンター#e19ms104	21536,{/* 2651 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "労役中の人間が、ここに来るな！";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "ハートハンター : 誰か交代してくれねえかなぁ。";
	else
		unittalk "ハートハンター : ここに近づくな。聞いてないのか？";
	end;
}

jor_nest.gat,239,143,3	script	ハートハンター#e19ms105	21536,{/* 2652 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "ここに近づくな！";
		mes "仕事に戻れ！";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "ハートハンター : 中心部よりここが良い……んだよな？";
	else
		unittalk "ハートハンター : 近付くと痛い目をみるぞ？";
	end;
}

jor_nest.gat,190,203,5	script	ハートハンター#e19ms106	21536,{/* 2653 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "お前、どうやってここに入った!?";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "ハートハンター : これがそこまで大事なのか？";
	else
		unittalk "ハートハンター : 近付くなよ。　壊したら大変なことになる。";
	end;
}

jor_nest.gat,109,184,0	script	#e19ms107	139,5,5,{/* 2654 */
	if(EP19_1QUE >= 68)	// 未確認
		cloakonnpc "ハートハンター#e19ms107";
	end;
}
jor_nest.gat,109,184,5	script	ハートハンター#e19ms107	21536,{/* 2655 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "道に迷ったのか？";
		mes "すぐに戻れ！";
		close;
	}
	unittalk "ハートハンター : うろうろするな。お前が来る場所じゃない。";
	end;
}

jor_nest.gat,80,150,0	script	#e19ms108	139,5,5,{/* 2656 */
	if(EP19_1QUE >= 68)	// 未確認
		cloakonnpc "ハートハンター#e19ms108";
	end;
}
jor_nest.gat,80,150,1	script	ハートハンター#e19ms108	21536,{/* 2657 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "労役中の人間が、ここに来るな！";
		mes "仕事に戻れ！";
		close;
	}
	unittalk "ハートハンター : これが読めるか？　180度曲がって戻りなさい、と書かれてる。";
	end;
}

jor_nest.gat,24,169,0	script	#e19ms109	139,5,5,{/* 2658 */
	if(EP19_1QUE >= 68)	// 未確認
		cloakonnpc "ハートハンター#e19ms109";
	end;
}
jor_nest.gat,24,169,5	script	ハートハンター#e19ms109	21536,{/* 2659 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハートハンター]";
		mes "労役中の人間が、ここに来るな！";
		mes "仕事に戻れ！";
		close;
	}
	unittalk "ハートハンター : あれ、関係者か？";
	end;
}

jor_nest.gat,124,204,0	script	#hw_ep19re1	139,5,5,{/* 2660 */
	//36~40間, 43未調査
	if(EP19_1QUE >= 35 && EP19_1QUE <= 43)
		cloakoffnpc "レイジー#ep19re1";
	end;
}

jor_nest.gat,127,207,3	script	レイジー#ep19re1	10475,{/* 2661 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[レイジー]";
		mes "おいおい、ここはルガンに変身しないと。";
		mes "モロバレだぜ？";
		close;
	}
	switch(EP19_1QUE) {
	case 35:
		mes "[レイジー]";
		mes "先にこの付近の様子を見てきたが";
		mes "イルシオンの人間たちや";
		mes "高位のルガンの姿が見えない。";
		mes "どうやら一時的に席を外してるようだ。";
		next;
		mes "[レイジー]";
		mes "ちょうどいい機会だ。";
		mes "今のうちに情報を集めよう。";
		mes "最上級ルガンでしか入れない場所は";
		mes "私が調べるから";
		mes strcharinfo(0)+"は";
		mes "この付近を調べてみてくれ。";
		next;
		mes "[レイジー]";
		mes "う～ん、そうだな。";
		mes "イルシオンの実験室を探ってみては？";
		mes "もしくは、警備係のルガンとか？";
		next;
		menu "そうしましょう",-;
		mes "[レイジー]";
		mes "調査が終わったら、ここに集合しよう。";
		mes "あくまで生まれたてのルガンとして";
		mes "振舞うことを忘れるなよ。";
		mes "おぎゃ～ばぶぅ～!!";
		delquest 17638;
		setquest 16639;
		set EP19_1QUE,36;
		close2;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 0, 1, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 0, 3, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		cloakonnpc "レイジー#ep19re1";
		end;
	case 36:
	case 37:
	case 38:
	case 39:
	case 40:
	case 41:
		mes "[レイジー]";
		mes "話をしていた場所は全部回った？";
		mes "イルシオンの実験室とか";
		mes "警備係のルガンとか？";
		next;
		menu "まだ回っていない",-;
		mes "[レイジー]";
		mes "みんな席を外しているようだから";
		mes "今のうちに調べてみてくれよ。";
		close2;
		cloakonnpc "レイジー#ep19re1";
		end;
	case 42:
		mes "[レイジー]";
		mes "話をしていた場所は全部回った？";
		mes "イルシオンの実験室とか";
		mes "警備係のルガンとか？";
		next;
		menu "回って来ました",-;
		mes "[レイジー]";
		mes "よし。";
		mes "お互いに集めた情報を元に";
		mes "どうするか検討しよう。";
		mes "まずは、イルシオンの実験室で";
		mes "わかったことを教えてくれ。";
		next;
		switch(select("二人のイルシオンの関係について","イルシオンたちのやっている実験について")) {
		case 1:
			mes "[レイジー]";
			mes "おっと！";
			mes "ユンケアがバゴットに比べて";
			mes "軽視されてるって？";
			mes "たしかラスガンドの命令で";
			mes "バゴットの研究を優先するように";
			mes "通達されていたよな。";
			next;
			mes "[レイジー]";
			mes "物資の配給について書かれた";
			mes "会計帳簿も手に入れた？";
			mes "有能～！";
			mes "どれどれ……";
			mes "ちょっと！　ここまで差があるの!?";
			next;
			mes "[レイジー]";
			mes "こうなると、二人の研究内容が";
			mes "気になるな。";
			mes "バゴットの研究を優先する理由。";
			mes "おほ！　それも調査済か！";
			mes "早く聞かせてくれ。";
			next;
			mes "[レイジー]";
			mes "……なるほど。";
			mes "似たような内容だが";
			mes "バゴットの方が危険な感じがするな。";
			mes "ラヘルで見た「偽りの神」と";
			mes "似ているなんて";
			mes "イヤな予感がする。";
			break;
		case 2:
			mes "[レイジー]";
			mes "二人の研究内容が気になるな。";
			mes "バゴットの研究を優先する理由に";
			mes "関係があるんじゃない？";
			mes "調査が済んでいるというなら";
			mes "早く聞かせてくれ。";
			next;
			mes "[レイジー]";
			mes "……なるほど。";
			mes "似たような内容だが";
			mes "バゴットの方が危険な感じがするな。";
			mes "ラヘルで見た「偽りの神」と";
			mes "似ているなんて";
			mes "イヤな予感がする。";
			next;
			mes "[レイジー]";
			mes "物資の配給について書かれた";
			mes "会計帳簿も手に入れた？";
			mes "有能～！";
			mes "どれどれ……";
			mes "ちょっと！　ここまで差があるの!?";
			next;
			mes "[レイジー]";
			mes "ラスガンドがバゴットの研究を";
			mes "最優先するように";
			mes "ユンケアに通告していたが";
			mes "ユンケアの立場は悪くなるばかりだな。";
			break;
		}
		next;
		mes "[レイジー]";
		mes "しかし、思った以上に";
		mes "ユンケアとバゴットの関係は";
		mes "悪くなっているんじゃないか？";
		mes "これは利用できるぞ。";
		next;
		mes "[レイジー]";
		mes "イルシオンのメンバーの関係を";
		mes "さらに悪化させれば";
		mes "いろいろ動きやすくなる。";
		mes "そう思わない？";
		next;
		if(select("いい考えです","まあまあですね") == 2) {
			mes "[レイジー]";
			mes "乗り気じゃなさそうだな？";
			mes "とは言え、代案も無いだろう？";
			mes "手段は選んでられないんだから";
			mes "とにかくやってみようぜ。";
			next;
		}
		mes "[レイジー]";
		mes strcharinfo(0)+"は";
		mes "ユンケアを担当してくれ。";
		mes "親密度を上げつつ";
		mes "バゴットへの不信感を煽るんだ。";
		mes "私は、同じことをバゴットにする。";
		next;
		mes "[レイジー]";
		mes "お互いに進展があったら";
		mes "氷の城に戻って報告しよう。";
		mes "それじゃあ、作戦開始だ！";
		delquest 16645;
		setquest 16646;
		set EP19_1QUE,43;
		close;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
	case 43:
		mes "[レイジー]";
		mes strcharinfo(0)+"は";
		mes "ユンケアを担当してくれ。";
		mes "親密度を上げつつ";
		mes "バゴットへの不信感を煽るんだ。";
		mes "私は、同じことをバゴットにする。";
		next;
		mes "[レイジー]";
		mes "お互いに進展があったら";
		mes "氷の城に戻って報告しよう。";
		mes "それじゃあ、作戦開始だ！";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,19,142,3	script	書類の山#ep19re1	10391,{/* 2662 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : 変身しないと……",1;
	}
	if(EP19_1QUE == 36) {
		mes "‐整理されていない書類の山が";
		mes "　うず高く積み上げられている。";
		mes "　一通り目を通すのは";
		mes "　骨が折れそうだ……‐";
		next;
		mes "…";
		next;
		mes "…";
		mes "……";
		next;
		mes "…";
		mes "……";
		mes "………";
		next;
		mes "…";
		mes "……";
		mes "………";
		mes "…………";
		next;
		mes "[報告書]";
		mes "…人工魔力を人為的に流し込み…";
		mes "……該当の方法を使うことで……";
		mes "…孵化する前の卵の等級を………";
		mes "…高められることが明らかになった…。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "把握できた情報は、これぐらいか。";
		mes "他の場所も調べてみよう。";
		delquest 16639;
		setquest 16640;
		set EP19_1QUE,37;
		close;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 0, 1, 書類の山#ep19re2;	// 2664: 21, 195
	}
	if(EP19_1QUE >= 37) {
		mes "["+strcharinfo(0)+"]";
		mes "この書類の山は、調査済だ。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,21,195,0	script	#hw_ep19re2-1	139,14,14,{/* 2663 */
	if(EP19_1QUE == 37) {
		cloakoffnpc "書類の山#ep19re2";
		cloakonnpc "ユグルガンド#ep19re2";
	}
	else if(EP19_1QUE == 38/* || EP19_1QUE == 39*/)	// 39、未調査
		cloakoffnpc "書類の山#ep19re2";
	else
		cloakoffnpc "見知らぬ箱#ep19re1";
	end;
}

jor_nest.gat,21,195,3	script	書類の山#ep19re2	10391,{/* 2664 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : 変身しないと……",1;
	}
	if(EP19_1QUE == 37) {
		mes "‐整理されていない書類の山が";
		mes "　うず高く積み上げられている。";
		mes "　一通り目を通すのは骨が折れそうだ‐";
		next;
		mes "…";
		next;
		mes "…";
		mes "……";
		next;
		mes "…";
		mes "……";
		mes "………";
		next;
		mes "…";
		mes "……";
		mes "………";
		mes "…………";
		next;
		mes "[報告書]";
		mes "…だけでなく、すでに生まれた個体に";
		mes "……同じ方法を用いることで…";
		mes "…優秀な個体に変化できる事実も……。";
		next;
		cloakoffnpc "ユグルガンド#ep19re2";
		unittalk getnpcid(0,"ユグルガンド#ep19re2"),"ユグルガンド : そこのお前！",1;
		mes "[ユグルガンド]";
		mes "ここの人間たちは";
		mes "席を外しているはずだが？";
		mes "そこにいるのは誰だ？";
		next;
		mes "[ユグルガンド]";
		mes "司祭級なのに知らない顔だな。";
		mes "ああ、新しく生まれたという子か。";
		mes "名前は何と言う？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "セネキオガンドです。";
		next;
		mes "[ユグルガンド]";
		mes "セネキオガンドか。";
		mes "私はユグルガンドという。";
		mes "イルシオン区画の警備責任者だ。";
		mes "人間たちを警護しているが";
		mes "同時に監視もしている。";
		next;
		mes "[ユグルガンド]";
		mes "人間たちのことを";
		mes "完全に信用することはできない。";
		mes "ふっ……まあ、人間同士でも";
		mes "お互いに信用していないようだが。";
		next;
		mes "[ユグルガンド]";
		mes "つい最近、ユンケアという人間が";
		mes "バゴットという人間の";
		mes "悪口を言っているのを聞いた。";
		mes "バゴットに仕事の成果を奪われて";
		mes "かなり怒っているようだったな。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "仕事の成果を奪われた？";
		next;
		mes "[ユグルガンド]";
		mes "最初にここに来て研究を始めたのは";
		mes "ユンケアだったが";
		mes "後から合流したバゴットの研究内容が";
		mes "ラスガンド様のお気に召したのだ。";
		next;
		mes "[ユグルガンド]";
		mes "ユンケアは、研究の成果を出して";
		mes "状況を改善しようとしているようだが";
		mes "上手くいってはいない。";
		mes "おっと、子供には難しい話だったな。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（理解できていないふりをしよう）";
		mes "大丈夫です、面白かったです。";
		next;
		mes "[ユグルガンド]";
		mes "はは、こいつ！";
		mes "わからないことはわからないと";
		mes "言って良いんだぞ。";
		next;
		mes "[ユグルガンド]";
		mes "では、私は仕事に戻るから";
		mes "お前もここから離れるんだ。";
		mes "この辺りには、危ないものが";
		mes "置かれているようだからな。";
		next;
		cloakonnpc "ユグルガンド#ep19re2";
		mes "["+strcharinfo(0)+"]";
		mes "（ユンケアの研究室は";
		mes "　こんなところかな……";
		mes "　次は、バゴットの研究室にでも";
		mes "　行ってみようか）";
		delquest 16640;
		setquest 16641;
		set EP19_1QUE,38;
		close;
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 0, 1, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		//
	}
	if(EP19_1QUE == 38) {
		mes "["+strcharinfo(0)+"]";
		mes "（ユンケアの研究室は";
		mes "　こんなところかな……";
		mes "　次は、バゴットの研究室にでも";
		mes "　行ってみようか）";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,22,192,3	script	ユグルガンド#ep19re2	10473,{/* 2665 (cloaking)*/
	//未調査
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,66,260,3	script	バゴットの研究室#warp_e	10046,{/* 2666 */
	if(EP19_1QUE >= 38 && EP19_1QUE <= 49) {	// 鍵がかかるタイミング未調査
		mes "‐扉の先がバゴットの研究室のようだ‐";
		next;
		if(select("中へ入る","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐中に入った‐";
		close2;
		warp "jor_dun03.gat", 58, 52;
		end;
	}
	if(EP19_1QUE == 57) {
		if(mdopenstate("バゴットの研究室") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "‐様子を確認した上で";
			mes "　問題が無いようであれば";
			mes "　研究室に入ることにしよう‐";
			set '@menu$,"「バゴットの研究室」入場";
		}
		else {
			mes "‐バゴットの研究室からは";
			mes "　何かの音が響いている。";
			mes "　様子を確認した上で";
			mes "　研究室に入ることにしよう‐";
			set '@menu$,"「バゴットの研究室」(バゴットの研究室)の作成";
		}
		next;
		if(select("やめる",'@menu$) == 1) {
			mes "‐その場から立ち去った‐";
			close;
		}
		if(mdopenstate("バゴットの研究室")) {
			mes "‐外からでは研究室内の様子を";
			mes "　確認することができない。";
			mes "　中に入って確認するしかないようだ‐";
			close2;
			if(getonlinepartymember() > 2) { // 未調査
				mes "[インフォメーション]";
				mes "このメモリアルダンジョンは";
				mes "2人以下のパーティーで";
				mes "入場することができます。";
				close;
			}
			switch(mdenter("バゴットの研究室")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[バゴットの研究室] に入場しました　 : 　" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("BagotLabControl1")+ "::OnStart";
				//warp "1@jorlab.gat", 57, 45;
				end;
			case 1:	// パーティー未加入
				mes "[インフォメーション]";
				mes "このメモリアルダンジョンは";
				mes "2人以下のパーティーで";
				mes "入場することができます。";
				close;
			case 2:	// ダンジョン未作成
				mes "[インフォメーション]";
				mes "対象のメモリアルダンジョンが";
				mes "作成されていないため";
				mes "入場できません。";
				close;
			default:	// その他エラー
				close;
			}
		}
		else {
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[インフォメーション]";
				mes "パーティーリーダーのみ";
				mes "メモリアルダンジョンを";
				mes "作成することができます。";
				close;
			}
			mdcreate "バゴットの研究室";
			mes "■パーティー名";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "■パーティーリーダー";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "　";
			mes "^006400バゴットの研究室^000000の作成申請を受け付けます。";
			close;
		}
	}
	if(EP19_1QUE >= 58) {
		if(mdopenstate("バゴットの研究室")) {
			mes "[インフォメーション]";
			mes "既に「バゴットの研究室」を";
			mes "クリアしているキャラクターは、";
			mes "パーティメンバーとして";
			mes "「バゴットの研究室」に";
			mes "入場できます。";
			next;
			mes "[インフォメーション]";
			mes "パーティメンバーとして";
			mes "「バゴットの研究室」に";
			mes "入場しますか？";
			next;
			if(select("やめる","「バゴットの研究室」入場") == 1) {
				mes "‐やめた‐";
				close;
			}
			mes "[インフォメーション]";
			mes "「バゴットの研究室」へ入場します。";
			close2;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				mes "[インフォメーション]";
				mes "既に「バゴットの研究室」を";
				mes "クリアしているキャラクターは、";
				mes "パーティリーダーとして";
				mes "入場できません。";
				close;
			}
			if(getonlinepartymember() > 2) { // 未調査
				mes "[インフォメーション]";
				mes "このメモリアルダンジョンは";
				mes "2人以下のパーティーで";
				mes "入場することができます。";
				close;
			}
			switch(mdenter("バゴットの研究室")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[バゴットの研究室] に入場しました　 : 　" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("BagotLabControl1")+ "::OnStart";
				//warp "1@jorlab.gat", 57, 45;
				end;
			case 1:	// パーティー未加入
				mes "[インフォメーション]";
				mes "このメモリアルダンジョンは";
				mes "2人以下のパーティーで";
				mes "入場することができます。";
				close;
			case 2:	// ダンジョン未作成
				mes "[インフォメーション]";
				mes "対象のメモリアルダンジョンが";
				mes "作成されていないため";
				mes "入場できません。";
				close;
			default:	// その他エラー
				close;
			}
		}
	}
	unittalk getcharid(3),strcharinfo(0)+" : 門に鍵がかかっている",1;
	end;
}

jor_dun03.gat,58,48,0	warp	#hw_ep19re3	2,2,jor_nest.gat,62,255	// 2667 from: jor_dun03.gat(58, 50)

jor_dun03.gat,58,54,0	script	#hw_ep19re3	139,5,5,{/* 2668 */
	if(EP19_1QUE == 38)
		cloakoffnpc "書類の山#ep19re3";
	else if(EP19_1QUE == 39)
		cloakoffnpc "書類の山#ep19re4";
	end;
}

jor_dun03.gat,74,71,3	script	書類の山#ep19re3	10391,{/* 2669 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : 変身しないと……",1;
	}
	if(EP19_1QUE == 38) {
		mes "‐シャープな筆跡で書かれた書類が";
		mes "　綺麗に積み上げられている。";
		mes "　一通り目を通すのは骨が折れそうだ‐";
		next;
		mes "…";
		next;
		mes "…";
		mes "……";
		next;
		mes "…";
		mes "……";
		mes "………";
		next;
		mes "…";
		mes "……";
		mes "………";
		mes "…………";
		next;
		mes "[報告書]";
		mes "…抜け殻の魔力を使用して……";
		mes "……すでに生まれた個体にも…";
		mes "…より優れた強い個体を……";
		mes "……作れることができ……。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（ユンケアの実験室で読んだ";
		mes "　報告書の内容と似ている。";
		mes "　二人は似たような";
		mes "　研究をしているのだろうか？）";
		next;
		mes "‐研究室内を見渡してみると";
		mes "　室内の実験体に既視感を覚えた‐";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "そうだ……";
		mes "ラヘルで見た「偽りの神」……！";
		mes "それに似ている気がする……";
		mes "室内をもっと調べてみよう。";
		delquest 16641;
		setquest 16642;
		set EP19_1QUE,39;
		cloakoffnpc "書類の山#ep19re4";
		close;
		//showevent 9999, 0, 書類の山#ep19re3;	// 2669: 74, 71
		//showevent 0, 1, 書類の山#ep19re4;	// 2670: 49, 80
	}
	if(EP19_1QUE == 39) {
		mes "["+strcharinfo(0)+"]";
		mes "この書類の山は、調査済だ。";
		cloakoffnpc "書類の山#ep19re4";
		close;
	}
	if(EP19_1QUE == 40) {
		mes "["+strcharinfo(0)+"]";
		mes "この書類の山は、調査済だ。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun03.gat,49,80,3	script	書類の山#ep19re4	10391,{/* 2670 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : 変身しないと……",1;
	}
	if(EP19_1QUE == 39) {
		mes "‐シャープな筆跡で書かれた書類が";
		mes "　整然と積み上げられている。";
		mes "　トップシークレットと書かれた書類を";
		mes "　見つける事が出来た‐";
		next;
		mes "[トップシークレット]";
		mes "…ラヘルでの実験体と同じく";
		mes "……変異し始めた実験体は……";
		mes "…細胞単位での……が行われる…";
		mes "……これを変異前の状態に戻すのは……";
		mes "…基本的に不可能である……。";
		next;
		mes "[トップシークレット]";
		mes "…ただし、魔力の波長が合う場合は……";
		mes "……あくまで仮説の域を出ないが……";
		mes "……僅かながら可能性がある……";
		mes "…波長の合う材料と……";
		mes "……適切な術士が必要となる……。";
		next;
		mes "[トップシークレット]";
		mes "……現在利用しているルガンを…";
		mes "…変異前の姿に戻す必要はないため…";
		mes "……この研究の重要度は低い…。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（ユンケアは上級ルガンたちを";
		mes "　実験の対象にはしないと";
		mes "　言ったはずだけど……）";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（変異した姿を戻す方法か……";
		mes "　他の情報が欲しい。";
		mes "　ルガンたちが集まっている場所に";
		mes "　行ってみよう）";
		delquest 16642;
		setquest 16643;
		set EP19_1QUE,40;
		close;
		//showevent 9999, 0, 書類の山#ep19re3;	// 2669: 74, 71
		//showevent 9999, 0, 書類の山#ep19re4;	// 2670: 49, 80
	}
	if(EP19_1QUE == 40) {
		mes "["+strcharinfo(0)+"]";
		mes "（他の情報が欲しい。";
		mes "　ルガンたちが集まっている場所に";
		mes "　行ってみよう）";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,177,176,0	script	#hw_ep19re4	139,14,14,{/* 2671 */
	if(EP19_1QUE == 40) {
		cloakoffnpc "ルガン警備兵#ep19re1";
		cloakoffnpc "ルガン警備兵#ep19re2";
	}
	else if(EP19_1QUE == 41) {
		cloakonnpc "ルガン警備兵#ep19re1";
		cloakonnpc "ルガン警備兵#ep19re2";
		cloakoffnpc "書類の山#ep19re5";
	}
	else if(EP19_1QUE == 42) {
		cloakoffnpc "書類の山#ep19re5";
	}
	else {
		cloakonnpc "ルガン警備兵#ep19re1";
		cloakonnpc "ルガン警備兵#ep19re2";
		cloakonnpc "書類の山#ep19re5";
	}
}

jor_nest.gat,173,177,3	script	ルガン警備兵#ep19re1	10471,{/* 2672 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : 変身しないと……。",1;
	}
	if(EP19_1QUE == 40) {
		mes "["+strcharinfo(0)+"]";
		mes "（警備兵らしきルガンたちの";
		mes "　会話が聞こえて来た。";
		mes "　こちらには気づいていないようだ）";
		next;
		mes "[ルガン警備隊長]";
		mes "また、ユグルガンド様に叱られた。";
		mes "ラスガンド様のお部屋の警備が";
		mes "手薄なのではないかと。";
		next;
		mes "[ルガン警備隊員]";
		mes "警備の人員を減らしたわけではないのに";
		mes "それはおかしいであります。";
		next;
		mes "[ルガン警備隊長]";
		mes "最近は、あの黒い髪の人間が";
		mes "ラスガンド様のお部屋に";
		mes "頻繁に出入りしているだろ？";
		mes "あの人間のことを信用するなと。";
		next;
		mes "[ルガン警備隊長]";
		mes "ラスガンド様は、あの人間を";
		mes "気に入っておられるようだが";
		mes "どうやらユグルガンド様は";
		mes "そうではないらしい。";
		next;
		mes "[ルガン警備隊員]";
		mes "……いかがするでありますか？";
		next;
		mes "[ルガン警備隊長]";
		mes "人員の配置を再考するつもりだ。";
		mes "それと、これまで以上に注意して";
		mes "ラスガンド様のお部屋を警備する。";
		mes "おっと、見回りの時間だ。";
		mes "行くぞ。";
		next;
		mes "[ルガン警備隊員]";
		mes "了解であります！";
		next;
		cloakonnpc "ルガン警備兵#ep19re1";
		cloakonnpc "ルガン警備兵#ep19re2";
		cloakoffnpc "書類の山#ep19re5";
		mes "["+strcharinfo(0)+"]";
		mes "（これ以上は特に";
		mes "　情報を得られそうにないな……";
		mes "　ん？　何か書類が置かれている）";
		delquest 16643;
		setquest 16644;
		set EP19_1QUE,41;
		close;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 0, 1, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,168,177,5	script	ルガン警備兵#ep19re2	10472,{/* 2673 (cloaking)*/
	unittalk getcharid(3),strcharinfo(0)+" : こちらに気付いていないみたいだ",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,181,173,3	script	書類の山#ep19re5	10391,{/* 2674 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : 変身しないと……",1;
	}
	if(EP19_1QUE == 41) {
		mes "‐何かの書類が置かれている。";
		mes "　……どうやら";
		mes "　物資などの配給先に関して";
		mes "　書かれているようだ‐";
		next;
		mes "…";
		next;
		mes "…";
		mes "……";
		next;
		mes "…";
		mes "……";
		mes "………";
		next;
		mes "…";
		mes "……";
		mes "………";
		mes "…………";
		next;
		mes "‐会計帳簿には";
		mes "　バゴットに支給される物資と";
		mes "　ユンケアに支給される物資の量が";
		mes "　詳細に記載されている‐";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（ユンケアに支給される物資が";
		mes "　減っている一方で";
		mes "　バゴットに支給される物資が";
		mes "　明らかに増えている）";
		next;
		if(checkitemblank() == 0) {
			mes "["+strcharinfo(0)+"]";
			mes "（……書類が持てない）";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "（……使えるかもしれない。";
		mes "　この書類はもらっておこう）";
		delquest 16644;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		setquest 16645;
		getitem 1000845,1;
		set EP19_1QUE,42;
		next;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 0, 1, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		mes "["+strcharinfo(0)+"]";
		mes "（会計帳簿を手に入れた。";
		mes "　レイジーと合流しよう）";
		close;
	}
	if(EP19_1QUE == 42) {
		mes "["+strcharinfo(0)+"]";
		mes "（会計帳簿を手に入れた。";
		mes "　レイジーと合流しよう）";
		close;
	}
	if(EP19_1QUE == 43) {
		// 未調査
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,31,140,5	script	ユンケア#ep19re1	10455,{/* 2675 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ユンケア]";
		mes "誰？";
		mes "ここは関係者以外立入禁止よ。";
		mes "早く出て行って。";
		close;
	}
	switch(EP19_1QUE) {
	case 43:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "ここは関係者以外";
		mes "立入禁止よ。";
		mes "……ああ、セネキオガンド。";
		mes "お前か。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "なにしてますか？";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "見てわからない？";
		mes "実験しているの。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "自分の体に注射を刺すのが";
		mes "実験ですか？";
		mes "自分の体が実験材料？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "仕方ないでしょ……";
		mes "お前たちを実験の対象にはしないと";
		mes "約束してるから。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "内緒にしてくれるなら";
		mes "私の体を使ってもいい。";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "それは……魅力的な提案だけど";
		mes "報告書には実験の過程を";
		mes "隠さず書かないといけないから却下。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "私は不正や捏造をしたくない。";
		mes "さあ、実験で忙しいから";
		mes "もう出て行って。";
		mes "はぁ……子供の相手は疲れる。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ユンケアは疲れてるみたい？";
		mes "自分の体で実験したから？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "……しつこいな。";
		mes "疲れているのは、糖分が切れたから。";
		mes "はぁ……甘い物を食べたいな……";
		mes "身体が糖分を求めてる……。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（これ以上、話を続けるのは無理か。";
		mes "　しかし、甘い物を持って来れば";
		mes "　仲良くなれるかもしれない）";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（とはいえ、ここで甘い物が";
		mes "　手に入るとは思えない。";
		mes "　一度、氷の城に戻って甘い物がないか";
		mes "　探してみよう）";
		delquest 16646;
		setquest 16647;
		set EP19_1QUE,44;
		next;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 6, 3, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		//showevent 0, 1, チェロロン#ep19re2;	// 2678: 245, 197
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	case 44:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "疲れているのは、糖分が切れたから。";
		mes "はぁ……甘い物を食べたいな……";
		mes "身体が糖分を求めてる……。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（これ以上、話を続けるのは無理か。";
		mes "　しかし、甘い物を持って来れば";
		mes "　仲良くなれるかもしれない）";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（とはいえ、ここで甘い物が";
		mes "　手に入るとは思えない。";
		mes "　一度、氷の城に戻って甘い物がないか";
		mes "　探してみよう）";
		next;
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	case 45:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……セネキオガンド。";
		mes "私は疲れているの。";
		mes "お前の相手をする気力も無いよ。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ユンケアのために";
		mes "甘い物を持ってきました。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "え、本当？";
		mes "……これ、どうやって手に入れた？";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "外にいる丸くてモフモフな奴らを";
		mes "とっちめたら置いていきました。";
		mes "甘いお菓子だと言ってました。";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "丸くてモフモフ……？";
		mes "ああ、アーウィンのことか。";
		mes "お前は機転が利くね。";
		mes "流石は上級のルガン。";
		next;
		mes "[ユンケア]";
		mes "……うん。";
		mes "甘くて美味しい……";
		mes "糖分が身体に沁みるこの感じ……。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ユンケアは、甘い物が好き？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "す、好きと言うか";
		mes "必要だから摂取してるだけ!!";
		mes "ここでは、甘い物は貴重だから";
		mes "なかなか摂取できなかったの。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "偉大なラスガンド様に";
		mes "もらうことはできませんか？";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "研究資材ならともかく";
		mes "お菓子をいちいち";
		mes "お膳立てはしてくれないよ。";
		mes "とは言え、今は研究資材も";
		mes "十分とは言えないけど……。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……以前はもっと潤沢に";
		mes "資材を回してくれてたのに……";
		mes "はぁ、子供相手に愚痴っても";
		mes "仕方ないのに。";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "お菓子を持ってきてくれて";
		mes "ありがとう。";
		mes "でも、お前にいつまでも";
		mes "付き合っているほど暇じゃない。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "もっとお話がしたいです。";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "あのねぇ……";
		mes "……お前、暇してるなら";
		mes "さっきのお菓子を持ってくるか";
		mes "研究に使う<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
		mes "1個持ってきてくれない？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（ユンケアの手伝いをすれば";
		mes "　もっと話を聞けるかもしれない）";
		delquest 16648;
		setquest 16649;
		set EP19_1QUE,46;
		delitem 1000846,1;
		close2;
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 46:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……お前、暇してるなら";
		mes "さっきのお菓子を持ってくるか";
		mes "研究に使う<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
		mes "1個持ってきてくれない？";
		next;
		set '@delid,1000846;
		if(countitem(1000846) < 1) {	// 氷菓子
			if(countitem(1000707) > 0) {	// ルガンの低級魔力核
				mes "[ユンケア]";
				mes "うん？";
				mes "ルガンの低級魔力核を";
				mes "持ってきてくれたの？";
				next;
				if(select("渡す","渡さない") == 2) {
					mes "[ユンケア]";
					mes "……バカにしてるの？";
					mes "お前と遊んでいる暇は無いって";
					mes "言ってるでしょ。";
					close2;
					cutin "ep19_juncea01.png", 255;
					end;
				}
				//以下、未調査
				set '@delid,1000707;
			}
			else {	// どちらも持ってない
				mes "[ユンケア]";
				mes "今は、お前と遊んでいる暇は無いの。";
				mes "用が無いなら、出て行って。";
				next;
				cutin "ep19_juncea01.png", 255;
				mes "["+strcharinfo(0)+"]";
				mes "（甘いお菓子なら、氷の城にいる";
				mes "　チェロロンから貰えるはずだ）";
				next;
				mes "‐氷の城へ向かいますか？‐";
				next;
				if(select("向かう","やめる") == 2) {
					mes "‐その場にとどまった‐";
					close;
				}
				mes "‐氷の城へ向かった‐";
				close2;
				warp "icas_in.gat", 251, 197;
				end;
			}
		}
		else {
			mes "[ユンケア]";
			mes "ああ、氷菓子を持ってきてくれたのね。";
			mes "わかってるじゃない？";
		}
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "お願いした物を持ってきてくれるなんて";
		mes "なかなかやるね。";
		mes "本当に生まれたばかりのルガンなの？";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "(…ギクッ！)";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "いきなり大人並みの知能を持った";
		mes "ルガンが生まれて来たとなれば";
		mes "研究する価値があるんだけど。";
		next;
		mes "[ユンケア]";
		mes "ああ！";
		mes "何もかも足りない！";
		mes "時間も研究用の資材も！";
		mes "バゴットはもっと先に";
		mes "進んでいるって言うのに！";
		next;
		mes "[ユンケア]";
		mes "卵の殻だけじゃダメか……";
		mes "直接ルガンの体を使った実験ができたら";
		mes "仮説を証明できるかもしれないのに。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "どんな仮説？";
		mes "何が証明できるの？";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "孵化した後のルガンに";
		mes "人工の魔力を注入することで";
		mes "より強いルガンになるという仮説。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "わぁ！　私はもっと強くなりたい。";
		mes "私に実験してもいいよ？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "危険だし、約束もしている。";
		mes "お前を実験には使えない。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "もしかして、それで";
		mes "自分の体を使って実験してるの？";
		mes "危険じゃないの？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "……変なことを気にするね。";
		mes "大丈夫よ。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "さぁ、休憩時間は終わり！";
		mes "私は仕事に戻るから。";
		next;
		mes "[ユンケア]";
		mes "……もしまた私のことを";
		mes "手伝ってくれるのなら";
		mes "氷菓子1個か";
		mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM> 1個を";
		mes "持ってきてくれると、ありがたいかも。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（少しずつ信頼を得られているかも？";
		mes "　もう少し手伝ってあげようか）";
		delquest 16649;
		setquest 16650;
		set EP19_1QUE,47;
		delitem '@delid,1;
		close2;
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 47:
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "……もしまた私のことを";
		mes "手伝ってくれるのなら";
		mes "氷菓子1個か";
		mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM> 1個を";
		mes "持ってきてくれると、ありがたいかも。";
		next;
		set '@delid,1000846;
		if(countitem(1000846) < 1) {	// 氷菓子
			// 未調査
			if(countitem(1000707) > 0) {	// ルガンの低級魔力核
				mes "[ユンケア]";
				mes "うん？";
				mes "ルガンの低級魔力核を";
				mes "持ってきてくれたの？";
				next;
				if(select("渡す","渡さない") == 2) {
					mes "[ユンケア]";
					mes "……バカにしてるの？";
					mes "お前と遊んでいる暇は無いって";
					mes "言ってるでしょ。";
					close2;
					cutin "ep19_juncea01.png", 255;
					end;
				}
				set '@delid,1000707;
			}
			else {	// どちらも持ってない
				mes "[ユンケア]";
				mes "今は、お前と遊んでいる暇は無いの。";
				mes "用が無いなら、出て行って。";
				next;
				cutin "ep19_juncea01.png", 255;
				mes "["+strcharinfo(0)+"]";
				mes "（甘いお菓子なら、氷の城にいる";
				mes "　チェロロンから貰えるはずだ）";
				next;
				mes "‐氷の城へ向かいますか？‐";
				next;
				if(select("向かう","やめる") == 2) {
					mes "‐その場にとどまった‐";
					close;
				}
				mes "‐氷の城へ向かった‐";
				close2;
				warp "icas_in.gat", 251, 197;
				end;
			}
		}
		else {
			mes "[ユンケア]";
			mes "ああ、氷菓子を持ってきてくれたのね。";
			mes "うん、これこれ。";
			mes "癖になる甘みなのよね……。";
		}
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "ありがと。";
		mes "遠慮なくいただくわ。";
		mes "それにしても、よく私のところに";
		mes "来てくれるけど……";
		mes "私の研究室が気に入った？";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ユンケアのやってる実験や";
		mes "バゴットの実験が気になります。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "前にも言ったけど、私もバゴットも";
		mes "似たような実験をしてる。";
		mes "孵化後のルガンに魔力を注入して";
		mes "強化する実験。";
		next;
		mes "[ユンケア]";
		mes "でも、思うように進んでない。";
		mes "資源が少ないのよ。";
		mes "ここに残されている魔力が";
		mes "もう底を尽きそうだから。";
		mes "バゴットだって苦労してるはず。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "バゴットは資源をたくさんたくさん";
		mes "もらってると聞いたよ。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "私の研究よりもバゴットの方が";
		mes "優先順位が高いって話でしょ？";
		mes "割り振られている資源については";
		mes "そんなに変わらないはず……。";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "(……そういえば";
		mes "　会計帳簿を持ってるな。";
		mes "　ユンケアに見せてみようか）";
		delquest 16650;
		setquest 16651;
		set EP19_1QUE,48;
		delitem '@delid,1;
		close2;
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 48:
		mes "["+strcharinfo(0)+"]";
		mes "ユンケアの名前が書かれていたので";
		mes "嬉しくなって持ってきた書類が";
		mes "あるんだけど……。";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[ユンケア]";
		mes "なに、これ？";
		mes "……会計帳簿??";
		mes "ああ、たしかに私の名前もあるね。";
		mes "バゴットもある……え？";
		mes "嘘でしょ……!?";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "あり得ない!!";
		mes "どうして、バゴットにだけ";
		mes "これだけの資材を渡してるの？";
		mes "研究の為の資材が不足しているって";
		mes "今まで聞いてたのに!!";
		next;
		mes "[ユンケア]";
		mes "騙されていた……？";
		mes "そんなこと……どうして？";
		mes "私が先にここに来て";
		mes "ルガンとの関係を築いたのに??";
		mes "ヨルムンガンドの魔力についても";
		mes "調査結果を全部教えていたのに!?";
		next;
		mes "[ユンケア]";
		mes "こんなのって……";
		mes "あり得ない……";
		mes "あり得ないっ!!";
		delquest 16651;
		setquest 16652;
		set EP19_1QUE,49;
		delitem 1000845,1;
		close2;
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 49:
		cloakoffnpc "バゴット#ep19re1";
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "何ごとぉ～？";
		mes "ユンケアちゃんは何を騒いでる～？";
		mes "ま～た糖分が切れましたかぁ？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "バゴット、お前……！";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "ん～～？";
		mes "そこのお前は、最上級のルガンと";
		mes "一緒に生まれたルガンだっけぇ？";
		next;
		mes "[バゴット]";
		mes "あの最上級は面白いよねぇ～。";
		mes "人生2回目ぐらいじゃない？";
		mes "あは～ははは～！";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "そんなことより！";
		mes "確認したいことがあるんだけど！";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "バゴットもユンケアに用があって";
		mes "来ましたぁ～。";
		mes "バゴットの研究室に来てくれる？";
		mes "あ、拒否権はねぇから～。";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（二人はバゴットの研究室に";
		mes "　移動するようだ。";
		mes "　それにしても……バゴットが";
		mes "　こちらを見る目は普通じゃなかった。";
		mes "　氷の城に戻ってレイジーに";
		mes "　報告した方が良さそうだ）";
		cloakonnpc "バゴット#ep19re1";
		delquest 16652;
		setquest 16653;
		set EP19_1QUE,50;
		next;
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 0, 1, レイジー#ep19re2;	// 2680: 245, 197
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	case 50:
		cloakoffnpc "バゴット#ep19re1";
		cutin "ep18_bagot_03.png", 2;
		mes "[バゴット]";
		mes "バゴットもユンケアに用があって";
		mes "来ましたぁ～。";
		mes "バゴットの研究室に来てくれる？";
		mes "あ、拒否権はねぇから～。";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（二人はバゴットの研究室に";
		mes "　移動するようだ。";
		mes "　それにしても……バゴットが";
		mes "　こちらを見る目は普通じゃなかった。";
		mes "　氷の城に戻ってレイジーに";
		mes "　報告した方が良さそうだ）";
		cloakonnpc "バゴット#ep19re1";
		next;
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,34,139,3	script	バゴット#ep19re1	10386,{/* 2676 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "知らない人間～？";
		mes "そんな人間がいるはずないのにぃ～？";
		close2;
		cutin "ep18_bagot_01.png", 255;
		end;
	}
	cutin "ep18_bagot_01.png", 2;
	mes "[バゴット]";
	mes "バゴットは～子供には～";
	mes "興味ありませぇ～ん。";
	close2;
	cutin "ep18_bagot_01.png", 255;
	cloakonnpc;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,245,197,0	script	#hw_ep19re5	139,14,7,{/* 2677 */
	if(EP19_1QUE >= 44 && EP19_1QUE <= 47) {
		cloakonnpc "レイジー#ep19re2";
		cloakonnpc "ミリアム#ep19re1";
		cloakoffnpc "チェロロン#ep19re2";
		cloakoffnpc "ウィロロン#ep19re1";
	}
	if(EP19_1QUE >= 50 && EP19_1QUE <= 52) {
		cloakonnpc "チェロロン#ep19re2";
		cloakonnpc "ウィロロン#ep19re1";
		cloakoffnpc "レイジー#ep19re2";
		cloakoffnpc "ミリアム#ep19re1";
	}
	end;
}

icas_in.gat,245,197,7	script	チェロロン#ep19re2	10461,{/* 2678 (cloaking)*/
	if(EP19_1QUE == 44) {
		cutin "ep19_iwin01.png", 2;
		mes "[チェロロン]";
		mes "ぽりぽり、シャクシャク！";
		mes "あ～美味しい。";
		mes "頭がキ～ンってなるけど美味しい！";
		next;
		mes "[チェロロン]";
		mes "何を食べてるのかって？";
		mes "氷菓子!!";
		mes "ひとつあげようか？";
		next;
		cutin "ep19_iwin01.png", 255;
		if(select("ひとつください！","遠慮する") == 2) {
			cutin "ep19_iwin01.png", 2;
			mes "[チェロロン]";
			mes "歯にしみるって？";
			mes "虫歯ってやつぅ？";
			mes "もったいないなぁ。";
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		cutin "ep19_iwin01.png", 2;
		mes "[チェロロン]";
		mes "これを作ったアーウィンパティシエの";
		mes "腕は素晴らしい！";
		mes "遠慮せずに食べてみてね～。";
		next;
		cutin "ep19_iwin01.png", 255;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 16647;
		setquest 16648;
		set EP19_1QUE,45;
		getitem 1000846,1;
		mes "["+strcharinfo(0)+"]";
		mes "（甘そうなお菓子を手に入れた。";
		mes "　ユンケアに持って行ってあげようか）";
		next;
		//showevent 0, 1, チェロロン#ep19re2;	// 2678: 245, 197
		//showevent 0, 1, ユンケア#ep19re1;	// 2675: 31, 140
		mes "‐ユンケアのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ユンケアのもとへ向かった‐";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	if(EP19_1QUE >= 45 && EP19_1QUE <= 47) {
		cutin "ep19_iwin01.png", 2;
		if(countitem(1000846) > 0) {
			mes "[チェロロン]";
			mes "氷菓子が欲しいの？";
			mes "まだ食べてないじゃない！";
			mes "それがなくなってから来てよね。";
			next;
			cutin "ep19_iwin01.png", 255;
		}
		else {
			mes "[チェロロン]";
			mes "ぽりぽり、シャクシャク！";
			mes "あ～美味しい。";
			mes "頭がキ～ンってなるけど美味しい！";
			next;
			mes "[チェロロン]";
			mes "氷菓子をまた食べたい？";
			mes "遠慮しなくて良いよ？";
			next;
			cutin "ep19_iwin01.png", 255;
			if(select("もっと欲しいという","遠慮する") == 2) {
				cutin "ep19_iwin01.png", 2;
				mes "[チェロロン]";
				mes "歯にしみるって？";
				mes "虫歯ってやつぅ？";
				mes "もったいないなぁ。";
				close2;
				cutin "ep19_iwin01.png", 255;
				end;
			}
			cutin "ep19_iwin01.png", 2;
			mes "[チェロロン]";
			mes "もう一つだけあげる。";
			mes "大切に食べてよね！";
			next;
			cutin "ep19_iwin01.png", 255;
			if(checkitemblank() == 0) {
				mes "^009eff【インフォメーション】";
				mes "これ以上多くの種類の";
				mes "荷物を持つことが出来ません。";
				mes "1個以上の空きを作ってください。^000000";
				close2;
				cutin "ep172_beta.bmp", 255;
				end;
			}
			getitem 1000846,1;
		}
		mes "["+strcharinfo(0)+"]";
		mes "（糖分たっぷりのお菓子だ。";
		mes "　ユンケアに食べさせてあげよう）";
		next;
		mes "‐ユンケアのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ユンケアのもとへ向かった‐";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,248,197,3	script	ウィロロン#ep19re1	10461,{/* 2679 (cloaking)*/
	cutin "ep19_iwin01.png", 2;
	mes "[ウィロロン]";
	mes "この氷菓子がほしいのか？";
	mes "それならチェロロンに言ってくれ。";
	mes "俺はこいつを食うのに忙しいんだ。";
	close2;
	cutin "ep19_iwin01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,245,197,7	script	レイジー#ep19re2	10454,{/* 2680 (cloaking)*/
	if(EP19_1QUE == 50) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "仕事の方はどう、上手く行ってる？";
		mes "こっちはバゴットを口説いておいたよ。";
		mes "ユンケアとの関係性を";
		mes "悪くしないといけないからね。";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "私もユンケアと親しくなりました。";
		mes "バゴットの方が良い待遇を";
		mes "受けていることも伝えています。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "会計帳簿も見せましたが";
		mes "バゴットとの格差に";
		mes "ショックを受けているようでした。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "良いねぇ！";
		mes "ユンケアをこちら側に引き込めると";
		mes "もっと良いんだが……。";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "上手くいけば、ユミルの心臓の欠片が";
		mes "どこにあるのか";
		mes "情報を聞き出せるかもしれませんね。";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "そう言えば、バゴットが来て";
		mes "話があるからと";
		mes "ユンケアを自分の実験室に";
		mes "連れて行ってしまいました。";
		next;
		mes "‐その時のバゴットの";
		mes "　こちらを見る目が普通でなかった件も";
		mes "　レイジーに伝えた‐";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "なんだって……";
		mes "それはなんだかイヤな予感がするな。";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "すぐに戻って";
		mes "確認した方が良くないですか？";
		delquest 16653;
		setquest 16654;
		set EP19_1QUE,51;
		close2;
		//showevent 9999, 0, レイジー#ep19re2;	// 2680: 245, 197
		//showevent 0, 1, ミリアム#ep19re1;	// 2681: 249, 199
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP19_1QUE >= 51) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "やれやれ、疲れた。";
		mes "少しのんびりしたいね。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,249,199,3	script	ミリアム#ep19re1	10377,{/* 2681 (cloaking)*/
	if(EP19_1QUE == 50) {
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "調査の方は順調ですか？";
		mes "こちらも今のところは";
		mes "大きな問題は起きていないよ。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	if(EP19_1QUE == 51) {
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "二人だけにして";
		mes "良かったのでしょうか？";
		mes "なんだか心配です。";
		mes "気にしすぎでしょうか……。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "ふたりで何の話をしたのかが問題だ。";
		mes "バゴットがユンケアのところに";
		mes "わざわざ足を運んだのも怪しい。";
		next;
		mes "[レイジー]";
		mes "もしかしたら、私と冒険者が";
		mes "裏で動いていることが";
		mes "バレた可能性もある。";
		mes "ぐずぐずしてる暇は無さそうだ。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "ユンケアをルガンの巣から連れ出そう。";
		mes "彼女を説得して";
		mes "ルガンたちの情報を聞き出す。";
		next;
		mes "[レイジー]";
		mes "連れ出す手段は何でも良い。";
		mes "事情を説明しても良いし";
		mes "力づくでも良い。";
		mes "冒険者に任せるよ。";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "変身スクロールを上手く";
		mes "使えると良いのですが……。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "それじゃあ、ルガンの巣に行こう。";
		mes "あんまりのんびりしてられないぞ。";
		delquest 16654;
		setquest 16655;
		next;
		//showevent 9999, 0, レイジー#ep19re2;	// 2680: 245, 197
		//showevent 0, 1, ミリアム#ep19re1;	// 2681: 249, 199
		cutin "ep19_leizi02.png", 255;
		mes "‐ユンケアのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ユンケアのもとへ向かった‐";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	if(EP19_1QUE == 52) {
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "変身スクロールを上手く使えば";
		mes "ユンケアさんを連れ出すことが";
		mes "できるんじゃないでしょうか？";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "‐ユンケアのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ユンケアのもとへ向かった‐";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,19,190,3	script	見知らぬ箱#ep19re1	10250,{/* 2682 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "["+strcharinfo(0)+"]";
		mes "（あれ？";
		mes "　変身スクロールを使わないと！）";
		close;
	}
	if(EP19_1QUE == 53) {
		mes "["+strcharinfo(0)+"]";
		mes "（……誰もいない？";
		mes "　ユンケアはまだバゴットの部屋から";
		mes "　戻ってきていないのか？）";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（あれ……？";
		mes "　箱の中から液体が漏れている。";
		mes "　飲み物だろうか？）";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（気になるからに持って行こう。";
		mes "　何か容器はないだろうか？";
		mes "　まわりを調べてみよう）";
		delquest 130475;
		setquest 16656;
		set EP19_1QUE,54;
		close2;
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 0, 1, 空の試験管#ep19re1;	// 2683: 20, 194
		cloakoffnpc "空の試験管#ep19re1";
		end;
	}
	if(EP19_1QUE == 54) {
		mes "["+strcharinfo(0)+"]";
		mes "（あれ……？";
		mes "　箱の中から液体が漏れている。";
		mes "　飲み物だろうか？）";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（気になるからに持って行こう）";
		mes "　何か容器はないだろうか？";
		mes "　まわりを調べてみよう）";
		close2;
		cloakoffnpc "空の試験管#ep19re1";
		end;
	}
	if(EP19_1QUE == 55) {
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 16657;
		setquest 16658;
		set EP19_1QUE,56;
		getitem 1000605,1;
		delitem 1000604,1;
		mes "‐怪しい液体を試験管に移した‐";
		next;
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 0, 1, ルガン#ep19re1;	// 2684: 24, 185
		mes "["+strcharinfo(0)+"]";
		mes "（……誰かの気配を感じる。";
		mes "　知らないふりをして誤魔化そう)";
		close2;
		cloakoffnpc "ルガン#ep19re1";
		unittalk getnpcid(0,"ルガン#ep19re1"),"ルガン : お前に伝えたいことがある！";
		end;
	}
	if(EP19_1QUE == 56) {
		cloakoffnpc "ルガン#ep19re1";
		unittalk getnpcid(0,"ルガン#ep19re1"),"ルガン : お前に伝えたいことがある！";
		end;
	}
	if(EP19_1QUE == 57) {
		end;
	}
	mes "["+strcharinfo(0)+"]";
	mes "（何かの箱が置かれている）";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,20,194,3	script	空の試験管#ep19re1	10429,{/* 2683 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "["+strcharinfo(0)+"]";
		mes "（あれ？";
		mes "　変身スクロールを使わないと！）";
		close;
	}
	if(EP19_1QUE == 54) {
		mes "["+strcharinfo(0)+"]";
		mes "（空の試験管が並んでいる。";
		mes "　これを使わせてもらおう）";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 16656;
		setquest 16657;
		set EP19_1QUE,55;
		getitem 1000604,1;
		mes "‐綺麗な試験管を一つ手に入れた。";
		mes "　これで箱の中の液体を";
		mes "　持って行くことができるだろう‐";
		close;
		//showevent 0, 1, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
	}
	if(EP19_1QUE == 55) {
		mes "‐綺麗な試験管を一つ手に入れた。";
		mes "　これで箱の中の液体を";
		mes "　持って行くことができるだろう‐";
		close;
	}
	mes "["+strcharinfo(0)+"]";
	mes "（空の試験管が並んでいる）";
	close;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,24,185,1	script	ルガン#ep19re1	10474,{/* 2684 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ルガン]";
		mes "何者だ！";
		mes "ここで何をしている！";
		close;
	}
	if(EP19_1QUE == 56) {
		mes "["+strcharinfo(0)+"]";
		mes "私に何か用ですか？";
		next;
		mes "[ルガン]";
		mes "君がセネキオガンドだろ？";
		mes "ユンケアという人間からの伝言だ。";
		mes "バゴットの研究室で待っているから";
		mes "すぐに来て欲しいとのことだ。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（……ユンケアが？";
		mes "　どうして私に伝言を？）";
		next;
		mes "[ルガン]";
		mes "人間の小間使いにされるのは";
		mes "腹が立つが……";
		mes "ラスガンド様からあの人間たちの";
		mes "要望を叶えてやるようにと";
		mes "お達しが来ているからな。";
		mes "ほら、早くバゴットの研究室に行け。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（……言われた通り";
		mes "　バゴットの研究室に行ってみよう）";
		delquest 16658;
		setquest 16659;
		set EP19_1QUE,57;
		close2;
		//showevent 0, 1, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		cloakonnpc "ルガン#ep19re1";
		end;
	}
	if(EP19_1QUE == 57) {
		// 未調査
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,248,112,0	script	#i19ms00	139,5,5,{/* 2685 */
	switch(EP19_1QUE) {
	case 59:
		cloakoffnpc "ホルル#i19ms00";
		cloakoffnpc "ユンケア#i19ms00";
		cloakoffnpc "レイジー#i19ms00";
		cloakoffnpc "レハール#i19ms00";
		cloakoffnpc "ミリアム#i19ms00";
		end;
	case 60:
		cloakoffnpc "ホルル#i19ms00";
		cloakoffnpc "ユンケア#i19ms01";
		cloakoffnpc "レイジー#i19ms00";
		cloakoffnpc "レハール#i19ms00";
		cloakoffnpc "ミリアム#i19ms00";
		cloakoffnpc "ヴェルグンデ#i19ms00";
		end;
	case 61:
		cloakoffnpc "ホルル#i19ms00";
		cloakoffnpc "ユンケア#i19ms02";
		cloakoffnpc "レイジー#i19ms00";
		cloakoffnpc "レハール#i19ms00";
		cloakoffnpc "ミリアム#i19ms00";
		cloakoffnpc "ヴェルグンデ#i19ms00";
		end;
	case 62: // 未調査
	case 63:
	case 64:
		cloakoffnpc "ホルル#i19ms00";
		cloakoffnpc "ユンケア#i19ms02";
		cloakoffnpc "レイジー#i19ms00";
		cloakoffnpc "レハール#i19ms00";
		cloakoffnpc "ミリアム#i19ms00";
		cloakoffnpc "ヴェルグンデ#i19ms00";
		cloakoffnpc "オーレリー#i19ms00";
		cloakoffnpc "アーウィン#i19ms00";
		end;
	default:
		cloakonnpc "ホルル#i19ms00";
		cloakonnpc "ヴェルグンデ#i19ms00";
		cloakonnpc "ユンケア#i19ms00";
		cloakonnpc "ユンケア#i19ms01";
		cloakonnpc "ユンケア#i19ms02";
		cloakonnpc "オーレリー#i19ms00";
		cloakonnpc "レイジー#i19ms00";
		cloakonnpc "レハール#i19ms00";
		cloakonnpc "ミリアム#i19ms00";
		cloakonnpc "アーウィン#i19ms00";
		end;
	}
}

icas_in.gat,247,116,1	script	ホルル#i19ms00	10461,{/* 2686 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cloakoffnpc "ユンケア#i19ms00";
		cloakoffnpc "レイジー#i19ms00";
		cloakoffnpc "レハール#i19ms00";
		cloakoffnpc "ミリアム#i19ms00";
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "訳もなくルガンを連れて来たとは";
		mes "思わないが……";
		mes "一体どういうことか説明してくれ。";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "まさか、連れてきたそれって";
		mes "ユンケアなのか？";
		mes "どうしてそんなボロボロなんだ？";
		mes "なんでルガンの姿になってる？";
		mes "なにがどうなってる??";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "治療をしますから";
		mes "まずは変身を解除してください。";
		next;
		misceffect 594,"ユンケア#i19ms00";
		misceffect 273,"ユンケア#i19ms00";
		cutin "ep19_leizi03.png", 255;
		if(!sleep2(1000)) end;
		cloakonnpc "ユンケア#i19ms00";
		cloakoffnpc "ユンケア#i19ms01";
		if(!sleep2(1000)) end;
		cutin "ep18_miriam_01.png", 1;
		mes "[ミリアム]";
		mes "身体に……翼……!?";
		next;
		unittalk getnpcid(0,"レハール#i19ms00"),"レハール : 治療を開始します。";
		if(!sleep2(1000)) end;
		misceffect 325,"ユンケア#i19ms01";
		if(!sleep2(500)) end;
		misceffect 66,"ユンケア#i19ms01";
		if(!sleep2(500)) end;
		misceffect 78,"ユンケア#i19ms01";
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "一体、何があったのか";
		mes "事情を説明してくれ。";
		next;
		menu "私たちの潜入がバレたようです",-;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "時間の問題だとは思っていたけど";
		mes "思ったより早かったな。";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[ミリアム]";
		mes "それにしても、どうして彼女を？";
		mes "彼女も邪魔者と";
		mes "見なされたということ？";
		next;
		cutin "ep19_lehar05.png", 1;
		mes "[レハール]";
		mes "この身体……どうなっているんです？";
		mes "何をどうしたら";
		mes "こんな体になるのか……。";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ラヘルで見た";
		mes "「偽りの神」に似ています。";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[ミリアム]";
		mes "……!!";
		mes "バゴットが、彼女の身体を";
		mes "このようにしたのですか！";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "とにかく、ユンケアサマから";
		mes "何があったか話を聞かないと。";
		mes "ユンケア～！　ユンケアサマ～！";
		next;
		cutin "ep19_leizi03.png", 255;
		mes "[ユンケア]";
		mes "…………。";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "……反応なし。";
		mes "息はしているようだが。";
		mes "このままじゃマズくないか？";
		mes "何か手は無いの？";
		next;
		cutin "ep19_iwin06.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ユンケアの実験室から持ち出したものが";
		mes "役に立つかもしれません。";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "うへぇ……これ読める人いる？";
		mes "専門的過ぎて";
		mes "私にはさっぱりだ！";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "この薬剤は……";
		mes "ホルルさん、飲んでみます？";
		next;
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "そんな訳のわからないものを";
		mes "飲めるか！";
		mes "料理に使うソースじゃないんだぞ！";
		next;
		cutin "ep19_lehar02.png", 1;
		mes "[レハール]";
		mes "ヴェルグンデ叔母様を";
		mes "呼んできます。";
		mes "こういうことを専門に";
		mes "研究しておられますからね！";
		next;
		cloakonnpc "レハール#i19ms00";
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "これ以上、奴らの巣に潜入して";
		mes "情報を得るのは難しそうだ。";
		next;
		mes "[レイジー]";
		mes "中級以下のルガンなら";
		mes "変身して情報を聞き出せるかもだが";
		mes "情報の精度が落ちるだろう。";
		mes "どうにかユンケアを起こして";
		mes "話を聞き出したいところだ。";
		next;
		cloakoffnpc "ヴェルグンデ#i19ms00";
		cloakoffnpc "レハール#i19ms00";
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "私が必要だって？";
		mes "いったい何を診れば……ほぅ……";
		mes "イルシオンによって";
		mes "こんな体にされてしまったと？";
		next;
		cutin "ep19_vellgunde01.png", 255;
		mes "‐ヴェルグンデに事情を説明し";
		mes "　研究室から持ち出したものを";
		mes "　手渡した‐";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "ほぉ…うむ……ふむ……";
		mes "どうやら特別な魔力を注入されて";
		mes "身体に変化が起きたようね。";
		mes "仮説とは言え、元に戻せる可能性も";
		mes "書かれているわ。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "この薬剤も使えると思う。";
		mes "これに気付いて持って来るなんて";
		mes "お手柄ね。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "ただ、まだ足りないものがある。";
		mes "^0000cdルガンの低級魔力核^0000003個を";
		mes "調達してきて欲しい。";
		mes "お願いできる？";
		delquest 17640;
		setquest 17641;
		set EP19_1QUE,60;
		close2;
		//showevent 9999, 0, ホルル#i19ms00;	// 2686: 247, 116
		//showevent 0, 1, ヴェルグンデ#i19ms00;	// 2687: 244, 117
		cutin "ep19_vellgunde02.png", 255;
		end;
	case 60:
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "^0000cdルガンの低級魔力核^000000が";
		mes "3個必要らしい。";
		mes "私が行きたいところだけど";
		mes "今、ここを空ける訳にもいかない。";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	case 61:
	case 62:
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "あいつの話を聞こうじゃないか。";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	case 63:
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ルガンの巣で動きがあったらしい。";
		mes "早く行ってみなければ！";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	case 64:
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "あまり家の中を";
		mes "ジロジロ見ないでくれよ？";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,244,117,1	script	ヴェルグンデ#i19ms00	10468,{/* 2687 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		mes "[ヴェルグンデ]";
		mes "何があったか、教えてくれる？";
		close;
	case 60:
		cutin "ep19_vellgunde02.png", 2;
		cloakonnpc "ユンケア#i19ms00";
		cloakoffnpc "ユンケア#i19ms01";
		cloakoffnpc "レイジー#i19ms00";
		cloakoffnpc "レハール#i19ms00";
		cloakoffnpc "ミリアム#i19ms00";
		cloakoffnpc "ヴェルグンデ#i19ms00";
		if(countitem(1000707) < 3) {
			//showevent 0, 2, ヴェルグンデ#i19ms00;	// 2687: 244, 117
			mes "[ヴェルグンデ]";
			mes "^0000cdルガンの低級魔力核^0000003個を";
			mes "調達してきて欲しい。";
			mes "集めたら、ここに持ってきて。";
			close2;
			cutin "ep19_vellgunde02.png", 255;
			end;
		}
		//showevent 0, 1, ヴェルグンデ#i19ms00;	// 2687: 244, 117
		mes "[ヴェルグンデ]";
		mes "集めて来てくれたのね。";
		mes "さあ、後は私に任せて。";
		mes "すぐに調合するから。";
		next;
		misceffect 882,"ユンケア#i19ms01";
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "……さぁ、できたわ。";
		mes "これを使えば";
		mes "彼女を元に戻せるはず。";
		mes "試してみましょう。";
		next;
		cutin "ep19_vellgunde02.png", 255;
		mes "[ユンケア]";
		mes "……あ……うぅ……。";
		next;
		misceffect 887,"ユンケア#i19ms01";
		cutin "ep19_vellgunde01.png", 255;
		unittalk getnpcid(0,"ユンケア#i19ms01"),"ユンケア : うぅ…………";
		unittalk getnpcid(0,"ホルル#i19ms00"),"ホルル : 元の姿に戻って行く！";
		unittalk getnpcid(0,"レイジー#i19ms00"),"レイジー : さすが！　名医だな。";
		unittalk getnpcid(0,"レハール#i19ms00"),"レハール : 科学者ですってば。";
		if(!sleep2(1500)) end;
		misceffect 887,"ユンケア#i19ms01";
		misceffect 273,"ユンケア#i19ms01";
		if(!sleep2(1000)) end;
		cloakonnpc "ユンケア#i19ms01";
		cloakoffnpc "ユンケア#i19ms02";
		cutin "ep19_juncea04.png", 0;
		mes "[ユンケア]";
		mes "う……私は……";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "……気が付いたみたいね。";
		mes "大丈夫？";
		mes "自分のこと、わかる？";
		next;
		cutin "ep19_vellgunde01.png", 255;
		misceffect 563,"ユンケア#i19ms02";
		mes "[ユンケア]";
		mes "<FONT SIZE = 18><B><I>バゴットォォ!!</I></B></FONT>";
		next;
		misceffect 563,"ユンケア#i19ms02";
		mes "[ユンケア]";
		mes "あいつが、私の身体をっ!!";
		mes "実験の対象に使って!!!";
		mes "あいつは、どこっ!!!";
		mes "はぁ…はぁ……っ!!";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "落ち着いて。";
		mes "ここはルガンたちの巣じゃないわ。";
		next;
		cutin "ep19_juncea02.png", 0;
		mes "[ユンケア]";
		mes "……？";
		mes "ルガンの巣じゃ…ない？";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ここは氷の城だ！";
		mes strcharinfo(0)+"が";
		mes "お前をルガンの巣から運んで来た。";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "ああ、そういえば";
		mes "この姿で会うのは初めてだったな！";
		mes "私は、スベグガンドだよ！";
		next;
		menu "私は…セネキオガンド。",-;
		cutin "ep19_juncea02.png", 0;
		mes "[ユンケア]";
		mes "そんな……";
		mes "あのルガンは、人間だったの？";
		mes "どうやって、そんな……？";
		mes "魔力波長も体の構造も";
		mes "確かにルガンだったはずなのに！";
		next;
		cutin "ep19_juncea02.png", 0;
		mes "[ユンケア]";
		mes "……私をどうするつもり!?";
		mes "何のために私を連れ出したの!!";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "私達は、ルガンの巣に攻め入るために";
		mes "潜入して情報を探ってたんだ。";
		next;
		mes "[レイジー]";
		mes "そこで、情報を提供してくれそうな";
		mes "人間がいたから";
		mes "いろいろアプローチを掛けたわけ。";
		mes "ほら、あんたとバゴットは";
		mes "仲が悪かっただろ？";
		next;
		mes "[レイジー]";
		mes "苦労して連れ出したんだから";
		mes "いろいろ教えてもらいたいなぁ？";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[ユンケア]";
		mes "……私から情報を聞き出そうってこと？";
		mes "私はイルシオンよ。";
		mes "そんなことするわけ……うっ……。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "変異した体を治療したばかりなんだから";
		mes "無理をしちゃダメよ。";
		mes "それに、元の身体に戻れたのは";
		mes "運が良かっただけ。";
		next;
		mes "[ヴェルグンデ]";
		mes strcharinfo(0)+"が";
		mes "必要なものを集めてなければ";
		mes "貴女の身体は元に戻っていない。";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "あんたの命の恩人というわけ。";
		mes "バゴットなんかよりも";
		mes "よっぽどまともな待遇だろ？";
		mes "甘いお菓子だって用意できる。";
		unittalk getnpcid(0,"ユンケア#i19ms02"),"ユンケア : ……";
		next;
		mes "[レイジー]";
		mes "ここまでは、お願いだ。";
		mes "素直に協力してくれるなら";
		mes "情状酌量の余地がある。";
		mes "だが、もし協力してくれない場合は";
		mes "どうなると思う？";
		unittalk getnpcid(0,"ユンケア#i19ms02"),"ユンケア : ………";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "言っておくが、イルシオンは";
		mes "ルーンミッドガッツ王国。";
		mes "シュバルツバルド共和国。";
		mes "アルナベルツ教国の三国から";
		mes "指名手配中だ。逃げ場はないぞ。";
		unittalk getnpcid(0,"ユンケア#i19ms02"),"ユンケア : …………";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "ルガンの巣に戻るか？";
		mes "バゴットが幅を利かせる";
		mes "ルガンの巣に？";
		mes "あまりオススメはしないな。";
		next;
		cutin "ep19_juncea02.png", 0;
		mes "[ユンケア]";
		mes "…………。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "自分の身体に何が起きたのか";
		mes "気にならない？";
		mes "私なら説明してあげられる。";
		mes "もちろん、私達に協力してくれることが";
		mes "前提だけど。";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "……少し考えさせて。";
		delquest 17641;
		setquest 17642;
		set EP19_1QUE,61;
		delitem 1000707,3;
		close2;
		//showevent 9999, 0, ホルル#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ヴェルグンデ#i19ms00;	// 2687: 244, 117
		//showevent 0, 1, レイジー#i19ms00;	// 2688: 246, 119
		//showevent 0, 1, #in_house5;	// 2494: 62, 137
		cutin "ep19_juncea03.png", 255;
		end;
	case 61:
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "彼女を説得できれば良いのだけど。";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	case 62:
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "私はもう少しユンケアの様子を";
		mes "見ることにするわ。";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "もっと必要なものを";
		mes "持ってくれば良かったな。";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,246,119,3	script	レイジー#i19ms00	10454,{/* 2688 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "いったい何があったんだ？";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	case 60:
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes strcharinfo(0)+"なら";
		mes "低級魔力核3個ぐらい";
		mes "すぐに集められるよな？";
		mes "実は鞄の中に入っているんじゃない？";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	case 61:
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "提案を受け入れる気になった？";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "……わかった。";
		mes "提案を受け入れる。";
		mes "その代わり、私の身の安全を";
		mes "保証してくれるのが前提。";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "もちろん。";
		mes "私はシュバルツバルド政府から";
		mes "全権を任されてるからね。";
		mes "他の国の大使も揃ってるから";
		mes "信用してくれ。";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "……ルガンに化けて";
		mes "私を騙していたくせに。";
		mes "でも、他に方法も無いか……";
		mes "はぁ……それで何を知りたい？";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "まずはヨルムンガンド教団の";
		mes "勢力を知りたい。";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "ルガンという種族は";
		mes "ルガンの血と時間がある限り";
		mes "ルガンを生み出すことができる。";
		mes "ただし、孵化するには";
		mes "ヨルムンガンドの魔力が必要。";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "ルガンたちはヨルムンガンドの体を";
		mes "拠点として、体に残った魔力を";
		mes "利用していた。";
		mes "死骸とはいえ、その残留魔力は";
		mes "相当なものだったみたい。";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "でも、今ではその魔力も枯渇し";
		mes "新しいルガンが生まれない状況よ。";
		next;
		menu "戦力はどうですか？",-;
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "上級以上のルガンは";
		mes "魔力が豊富だった頃に生まれたから";
		mes "それぞれがかなり強い。";
		mes "ただ、数はそれほど多くない。";
		mes "問題なのは、ラスガンド。";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "神話の時代から生きていて";
		mes "その血で最上級のルガンたちを";
		mes "生み出したらしい。";
		mes "詳しくは調べられてないけど";
		mes "凄まじい魔力を宿している。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "ラスガンド……";
		mes "最古の生存者……";
		mes "^0000cd王家に呪いをかけた張本人^000000……";
		mes "奴の目的は何？";
		mes "イルシオンと手を結んだ目的は？";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "最初にルガンと接触した時は";
		mes "私が研究していた魔力を留める方法や";
		mes "魔力を増幅させる方法に";
		mes "興味を持っていた。";
		mes "恐らく、ルガンの数を増やすのが";
		mes "目的だったと思う。";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "だが、途中でバゴットの研究を";
		mes "最優先にするように方向転換した。";
		mes "バゴットは、何を提案したんだ？";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "……ヨルムンガンドの復活。";
		unittalk getnpcid(0,"レイジー#i19ms00"),"レイジー : ………";
		unittalk getnpcid(0,"レハール#i19ms00"),"レハール : それって本当ですか!?";
		unittalk getnpcid(0,"ヴェルグンデ#i19ms00"),"ヴェルグンデ : やはりか……";
		unittalk getnpcid(0,"ホルル#i19ms00"),"ホルル : ……!?!?";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "奪って来たユミルの心臓の欠片と使って";
		mes "ヨルムンガンドを復活させる。";
		mes "あるいは……";
		mes "^0000cdヨルムンガンドの神格の再現^000000。";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "ラヘルで神の神性を再現できたと";
		mes "言っていたから";
		mes "アイツの研究は完成に近づいている。";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "ヨルムンガンドの復活……";
		mes "想像もしたくないな。";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[ミリアム]";
		mes "ラスガンドはともかく";
		mes "バゴットの目的は？";
		mes "あの人はヨルムンガンドを復活させて";
		mes "何をするつもり？";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "アイツは、自分の興味のあることを";
		mes "研究することだけが目的。";
		mes "ただ、自分のやりたいようにやる。";
		mes "それができる環境が手に入れば";
		mes "なんでも良いと思ってる。";
		next;
		cutin "ep19_leizi02.png", 1;
		mes "[レイジー]";
		mes "バゴットを説得しようとしたけど";
		mes "できなかったのは";
		mes "そういう理由か……";
		mes "さて、急いで対策を検討して……。";
		next;
		cloakoffnpc "オーレリー#i19ms00";
		cloakoffnpc "アーウィン#i19ms00";
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "みんな、ここにいたのね。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "オーレリー様？";
		mes "何かあったのですか？";
		delquest 17642;
		setquest 17643;
		set EP19_1QUE,62;
		close2;
		//showevent 9999, 0, ホルル#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ヴェルグンデ#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, レイジー#i19ms00;	// 2688: 246, 119
		//showevent 0, 1, オーレリー#i19ms00;	// 2693: 249, 113
		cutin "ep19_vellgunde01.png", 255;
		end;
	case 62:
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "イルシオンの科学者たちは";
		mes "みんな似てる気がする。";
		mes "エリュミナとかさ。";
		mes "説得に応じてくれて助かる。";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "ルガン変身スクロールを使えば";
		mes "下っ端のルガンは騙せそうじゃない？";
		mes "上手いこと使って行こうぜ！";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,246,119,3	script	レイジー#i19ms01	10475,{/* 2689 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,243,120,5	script	ユンケア#i19ms00	10470,{/* 2690 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,243,120,3	script	ユンケア#i19ms01	10457,{/* 2691 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,243,120,5	script	ユンケア#i19ms02	10455,{/* 2692 (cloaking)*/
	switch(EP19_1QUE) {
	case 60:
	case 64:
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "今は何かできる状態じゃない。";
		mes "しばらく休ませて。";
		close2;
		cutin "ep19_juncea03.png", 255;
		end;
	case 61:
		cutin "ep19_juncea03.png", 0;
		mes "[ユンケア]";
		mes "……考え中だから。";
		close2;
		cutin "ep19_juncea04.png", 255;
		end;
	case 62:
		cutin "ep19_juncea04.png", 0;
		mes "[ユンケア]";
		mes "……ちょっと人が多すぎない？";
		mes "なんでこんなに人が集まってくるの。";
		close2;
		cutin "ep19_juncea04.png", 255;
		end;
	case 63:
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "ルガンの巣に行くなら";
		mes "変身した方が良い。";
		mes "中級以下のルガンにはバレないはず。";
		close2;
		cutin "ep19_juncea01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,249,113,3	script	オーレリー#i19ms00	10465,{/* 2693 (cloaking)*/
	switch(EP19_1QUE) {
	case 62:
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "ルガンたちの動きがおかしいと";
		mes "パトロール隊から連絡があったわ。";
		mes "外に出ていた上級ルガンたちが";
		mes "巣に呼び戻されているみたい。";
		next;
		cutin "ep19_iwin02.png", 2;
		mes "[アーウィン]";
		mes "あまりに急なことだから";
		mes "ルガンたちも混乱しており";
		mes "巣の中も慌ただしい様子です。";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[レイジー]";
		mes "何かが起きようとしてるみたいだな。";
		mes "混乱しているのなら";
		mes "攻め込むチャンスかもしれない。";
		next;
		cutin "ep19_iwin08.png", 2;
		mes "[ホルル]";
		mes "よし！";
		mes "急いで戦力となる者を招集しよう！";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[ユンケア]";
		mes "ルガンの巣に行くなら";
		mes "変身した方が良い。";
		mes "中級以下のルガンにはバレないはず。";
		next;
		delquest 17643;
		setquest 17644;
		set EP19_1QUE,63;
		cutin "ep19_juncea04.png", 255;
		mes "‐ルガンたちの住処へ向かいますか？‐";
		next;
		//showevent 9999, 0, ホルル#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ヴェルグンデ#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, レイジー#i19ms00;	// 2688: 246, 119
		//showevent 0, 1, オーレリー#i19ms00;	// 2693: 249, 113
		//showevent 0, 1, #in_house5;	// 2494: 62, 137
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ルガンたちの住処へ向かった‐";
		close2;
		warp "jor_que.gat", 281, 87;
		end;
	case 63:
	case 64:
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "ルガンたちの動きがおかしいと";
		mes "パトロール隊から連絡があったわ。";
		mes "外に出ていた上級ルガンたちが";
		mes "巣に呼び戻されているみたい。";
		next;
		cutin "ep19_aurelie03.png", 255;
		mes "‐ルガンたちの住処へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ルガンたちの住処へ向かった‐";
		close2;
		warp "jor_que.gat", 281, 87;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,248,118,3	script	レハール#i19ms00	10469,{/* 2694 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "ここがホルルさんの家かぁ。";
		mes "あ、そんな悠長なことを言ってる場合じゃ";
		mes "ないですよね！";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 60:
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "渡してもらった書類ですが";
		mes "字が流暢過ぎて";
		mes "読めませんでしたよ……。";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 61:
	case 62:
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "流石はヴェルグンデ叔母様！";
		mes "年季が違いますね！";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep19_lehar01.png", 1;
		mes "[レハール]";
		mes "ここがホルルさんの家かぁ。";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,245,115,1	script	ミリアム#i19ms00	10377,{/* 2695 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "あれは、イルシオンのメンバー？";
		mes "どういうことか説明して欲しいです。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 60:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "低級魔力核……";
		mes "「蛇神の温もり」で見たことあります。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 61:
	case 62:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "バゴットを捕まえれば";
		mes "ユミルの心臓の欠片を";
		mes "取り戻せるでしょうか？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "人の住む場所というのは";
		mes "みんなどこか似ていますね。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,247,113,1	script	アーウィン#i19ms00	10461,{/* 2696 (cloaking)*/
	if(EP19_1QUE == 62) {
		cutin "ep19_iwin02.png", 2;
		mes "[アーウィン]";
		mes "ルガンの巣の方で";
		mes "何か異変が起きたようです！";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	}
	cutin "ep19_iwin02.png", 2;
	mes "[アーウィン]";
	mes "戦力となる者を招集したら";
	mes "ルガンの巣に突入します！";
	close2;
	cutin "ep19_iwin02.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,281,87,0	script	#i19ms11	139,5,5,{/* 2697 */
	if(EP19_1QUE == 63) {
		//showevent 0, 1, アーウィン偵察#i19ms11;	// 2698: 271, 88
		cloakoffnpc "ホルル#i19ms11";
		cloakoffnpc "ミリアム#i19ms11";
		cloakoffnpc "レハール#i19ms11";
		cloakoffnpc "レイジー#i19ms11";
		cloakoffnpc "アーウィン偵察#i19ms12";
		cloakoffnpc "アーウィン偵察#i19ms13";
		cloakoffnpc "アーウィン偵察#i19ms14";
		end;
	}
	end;
}

jor_que.gat,271,88,5	script	アーウィン偵察#i19ms11	21529,{/* 2698 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[アーウィン偵察]";
		mes "ルガンに変身してから";
		mes "動くであります！";
		close;
	}
	if(EP19_1QUE == 63) {
		cloakoffnpc "ホルル#i19ms11";
		cloakoffnpc "ミリアム#i19ms11";
		cloakoffnpc "レハール#i19ms11";
		cloakoffnpc "レイジー#i19ms11";
		cloakoffnpc "アーウィン偵察#i19ms12";
		cloakoffnpc "アーウィン偵察#i19ms13";
		cloakoffnpc "アーウィン偵察#i19ms14";
		mes "[アーウィン偵察]";
		mes "お待ちしておりました！";
		next;
		mes "[ホルル]";
		mes "状況は？";
		next;
		mes "[アーウィン偵察]";
		mes "上級以上のルガンは";
		mes "全員どこかに移動しました！";
		mes "この辺りには中級以下のルガンのみが";
		mes "残っております！";
		next;
		mes "[アーウィン偵察]";
		mes "こんなことはこれまで";
		mes "一度も無かったようで";
		mes "中級以下のルガンは混乱しており";
		mes "巣の中は慌ただしい状況です。";
		next;
		cloakoffnpc "アーウィン偵察#i19ms15";
		cloakoffnpc "人間#i19ms91";
		cloakoffnpc "人間#i19ms92";
		cloakoffnpc "人間#i19ms93";
		mes "[脱出しようとする人間]";
		mes "放せ！　放せってば！";
		mes "逃げ出そうとしてたんじゃなくて";
		mes "トイレ！";
		mes "トイレに行こうとしてたの！";
		next;
		mes "[ホルル]";
		mes "その人たちは何だ？";
		next;
		mes "[アーウィン偵察]";
		mes "捕らえられていた人間たちです！";
		mes "ルガンたちが混乱しており";
		mes "このままでは危険だと判断して";
		mes "連れ出して来ました！";
		next;
		mes "[脱出しようとする人間]";
		mes "た、助けてくれるのか？";
		mes "他にも捕まっている仲間がいるんだ！";
		mes "そいつらも助けてやってくれ！";
		next;
		mes "[ホルル]";
		mes "この人間たちは外に誘導しろ。";
		unittalk getnpcid(0,"アーウィン偵察#i19ms15"),"アーウィン偵察 : はっ！　了解であります！";
		unittalk getnpcid(0,"人間#i19ms91"),"人間 : た、助かるのか？";
		next;
		mes "[ホルル]";
		mes "まだ残っている人間もいるようだから";
		mes "巣の奥に進む前に救出しよう！";
		cloakonnpc "アーウィン偵察#i19ms15";
		cloakonnpc "人間#i19ms91";
		cloakonnpc "人間#i19ms92";
		cloakonnpc "人間#i19ms93";
		next;
		mes "[レハール]";
		mes "私たちが以前に連れていかれて";
		mes "仕事をさせられた場所に行きましょう。";
		mes "そこに他の人たちが";
		mes "残ってるかもしれません。";
		next;
		mes "[ホルル]";
		mes "よし！";
		mes "一人はここに残ってくれ。";
		mes "他の者は奥に進むぞ。";
		mes "周囲の警戒を怠るなよ。";
		unittalk getnpcid(0,"アーウィン偵察#i19ms11"),"アーウィン : はっ！";
		unittalk getnpcid(0,"アーウィン偵察#i19ms12"),"アーウィン : はっ！";
		unittalk getnpcid(0,"アーウィン偵察#i19ms13"),"アーウィン : はい！";
		unittalk getnpcid(0,"アーウィン偵察#i19ms14"),"アーウィン : 了解！";
		next;
		cloakonnpc "ホルル#i19ms11";
		cloakonnpc "アーウィン偵察#i19ms12";
		cloakonnpc "アーウィン偵察#i19ms13";
		cloakonnpc "アーウィン偵察#i19ms14";
		delquest 17644;
		setquest 17645;
		set EP19_1QUE,64;
		close2;
		//showevent 9999, 0, アーウィン偵察#i19ms11;	// 2698: 271, 88
		//showevent 0, 1, ミリアム#i19ms12;	// 2711: 144, 253
		//showevent 9999, 0, 中級ルガン#i19ms21;	// 2718: 131, 148
		//showevent 9999, 0, レハール#i19ms21;	// 2724: 32, 37
		//showevent 9999, 0, 混乱の蛇の巣#i19ms21;	// 2725: 28, 33
		cloakonnpc "ミリアム#i19ms11";
		cloakonnpc "レハール#i19ms11";
		cloakonnpc "レイジー#i19ms11";
		end;
	}
	if(EP19_1QUE == 64) {
		mes "[アーウィン偵察]";
		mes "状況を調べる必要があるようです！";
		close;
	}
	//67以前、未調査
	mes "[アーウィン偵察]";
	mes "今まで、こんな事はありませんでした。";
	mes "いったい何が起きているのでしょう？";
	close;
}

jor_que.gat,273,85,1	script	ホルル#i19ms11	21529,{/* 2699 (cloaking)*/
	unittalk "ホルル : まずは状況の確認だ。";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,273,89,3	script	ミリアム#i19ms11	21529,{/* 2700 (cloaking)*/
	unittalk "ミリアム : 中級のルガンだけが残されているようです。";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,274,86,1	script	レハール#i19ms11	21529,{/* 2701 (cloaking)*/
	unittalk "レハール : この場所は、いまだに慣れません。";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,270,86,7	script	レイジー#i19ms11	10475,{/* 2702 (cloaking)*/
	unittalk "レイジー : 私をしっかり守ってくれよ？　赤ちゃんなんだから。";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,270,83,7	script	人間#i19ms91	478,{/* 2703 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,269,83,7	script	人間#i19ms92	908,{/* 2704 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,268,84,7	script	人間#i19ms93	879,{/* 2705 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,268,87,5	script	アーウィン偵察#i19ms12	21529,{/* 2706 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,276,90,3	script	アーウィン偵察#i19ms13	21529,{/* 2707 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,277,86,1	script	アーウィン偵察#i19ms14	21529,{/* 2708 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,271,84,7	script	アーウィン偵察#i19ms15	21529,{/* 2709 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,144,253,0	script	#i19ms21	139,5,5,{/* 2710 */
	if(EP19_1QUE == 64) {
		cloakoffnpc "レイジー#i19ms12";
		cloakoffnpc "ミリアム#i19ms12";
		cloakoffnpc "人間#i19ms94";
		cloakoffnpc "人間#i19ms95";
		cloakoffnpc "人間#i19ms96";
		end;
	}
}

jor_que.gat,144,253,3	script	ミリアム#i19ms12	21529,{/* 2711 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ミリアム]";
		mes "ここではルガンに変身して";
		mes "動いた方が良いよ。";
		close;
	}
	if(EP19_1QUE == 64) {
		mes "[ミリアム]";
		mes "入口を見張っていた";
		mes "上級ルガンが見あたらない。";
		mes "中には拉致されてきた人たちだけが";
		mes "残っている状態です。";
		next;
		cloakoffnpc "レハール#i19ms12";
		mes "[レハール]";
		mes "他の部屋も同じでした。";
		mes "この人たちを残していくなんて";
		mes "よほど余裕がなかったのでしょうか？";
		next;
		mes "[レイジー]";
		mes "こちらとしては好都合だ。";
		mes "さ～あ、みなさん！";
		mes "外に出てくださ～い！";
		mes "もうお仕事をしなくても";
		mes "良いですよ～。";
		next;
		emotion 53,"人間#i19ms94";
		mes "[労役中の人間]";
		mes "うわっ！　主教様っ！";
		mes "わ、私達は大人しくここで";
		mes "仕事をしていただけです！";
		next;
		mes "[レハール]";
		mes "私達は皆さんを助けに来たんです。";
		mes "皆さんに危害を加えたりしないので";
		mes "安心してください。";
		misceffect 594,"レハール#i19ms12";
		cloakonnpc "レハール#i19ms12";
		cloakoffnpc "レハール#i19ms13";
		next;
		mes "[労役中の人間]";
		mes "あれ？　人間だ!?";
		mes "本当に助けてくれるの!?";
		next;
		mes "[ミリアム]";
		mes "ボクがこの人たちを";
		mes "出口まで連れて行くよ。";
		next;
		mes "[レイジー]";
		mes "今、聞きましたよね？";
		mes "この人に付いて行けば大丈夫。";
		mes "ところで、入口にいたルガンたちは";
		mes "どこに行ったか知ってる？";
		next;
		mes "[労役中の人間]";
		mes "わかりません。";
		mes "急に騒がしくなったと思ったら";
		mes "どこかに行ってしまったんです。";
		next;
		mes "[労役中の人間]";
		mes "いつ戻るかわからなかったので";
		mes "ずっとここに留まってるしか";
		mes "なかったんです。";
		next;
		mes "[レイジー]";
		mes "ふぅ～ん。";
		mes "上級以上のルガンたちの";
		mes "動きが気になるな。";
		mes "もう少しこの辺りを";
		mes "調べてみる必要がありそうだぞ。";
		next;
		mes "[ミリアム]";
		mes strcharinfo(0)+"様は";
		mes "他の場所を調べてみて。";
		mes "ボクはこの人たちを避難させてから";
		mes "合流するから。";
		mes "さあ、行きましょう。";
		delquest 17645;
		setquest 17646;
		set EP19_1QUE,65;
		close;
		//showevent 9999, 0, "アーウィン偵察#i19ms11";	// 2698: 271, 88
		//showevent 9999, 0, "ミリアム#i19ms12";	// 2711: 144, 253
		//showevent 0, 1, "中級ルガン#i19ms21";	// 2718: 131, 148
		//showevent 9999, 0, "レハール#i19ms21";	// 2724: 32, 37
		//showevent 9999, 0, "混乱の蛇の巣#i19ms21";	// 2725: 28, 33
	}
	if(EP19_1QUE == 65) {
		mes "[ミリアム]";
		mes strcharinfo(0)+"様は";
		mes "他の場所を調べてみて。";
		mes "ボクはこの人たちを避難させてから";
		mes "合流するから。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,134,257,5	script	人間#i19ms94	93,{/* 2712 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,136,254,5	script	人間#i19ms95	870,{/* 2713 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,140,253,5	script	人間#i19ms96	84,{/* 2714 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,139,257,5	script	レイジー#i19ms12	10475,{/* 2715 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,146,252,3	script	レハール#i19ms12	21529,{/* 2716 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,146,252,3	script	レハール#i19ms13	10469,{/* 2717 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,131,148,3	script	中級ルガン#i19ms21	21529,5,5,{/* 2718 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[中級ルガン]";
		mes "汚らわしい人間……。";
		close;
	}
	if(EP19_1QUE == 65) {
		cloakoffnpc "ホルル#i19ms31";
		cloakoffnpc "アーウィン#i19ms31";
		cloakoffnpc "アーウィン#i19ms32";
		cloakoffnpc "アーウィン#i19ms33";
		mes "[中級ルガン]";
		mes "……働かなきゃ。";
		next;
		mes "[ホルル]";
		mes "みんなどこへ行ったんだ？";
		mes "上級ルガンたちのことだよ！";
		next;
		mes "[中級ルガン]";
		mes "私たちは働かなきゃ。";
		mes "……お前たちも働かなきゃ。";
		next;
		mes "[ホルル]";
		mes "上級ルガンたちが";
		mes "どこに行ったか教えてくれってば！";
		next;
		mes "[中級ルガン]";
		mes "……遊んでる暇はない。";
		mes "働かなくちゃ。";
		next;
		mes "[ホルル]";
		mes "ダメだ！";
		mes "全然話が通じない！";
		next;
		menu "どうしましたか？",-;
		mes "[中級ルガン]";
		mes "ああ！　司祭様！";
		mes "尊い、尊い方…。";
		next;
		mes "[ホルル]";
		mes "あっ！　反応が変わったぞ！";
		mes strcharinfo(0)+"が";
		mes "話しかけた方が良いな！";
		next;
		menu "上級ルガンたちはどこへ行った？",-;
		mes "[中級ルガン]";
		mes "尊い方たちは……";
		mes "全員、集まるようにと……。";
		next;
		menu "誰の命令で？",-;
		mes "[中級ルガン]";
		mes "教主様の……";
		mes "ラスガンド様の命令で……";
		mes "上級区域に集まるようにと……。";
		next;
		mes "[ホルル]";
		mes "上級区域か！";
		mes "よし、2人は私と共に来い！";
		mes "1人は残って、引き続き";
		mes "捕まっている人間たちの救助に当たれ。";
		unittalk getnpcid(0,"アーウィン#i19ms31"),"アーウィン : はっ！";
		unittalk getnpcid(0,"アーウィン#i19ms32"),"アーウィン : はい！";
		unittalk getnpcid(0,"アーウィン#i19ms33"),"アーウィン : 了解！";
		delquest 17646;
		setquest 17647;
		set EP19_1QUE,66;
		close2;
		//showevent 9999, 0, "アーウィン偵察#i19ms11";	// 2698: 271, 88
		//showevent 9999, 0, "ミリアム#i19ms12";	// 2711: 144, 253
		//showevent 9999, 0, "中級ルガン#i19ms21";	// 2718: 131, 148
		//showevent 0, 1, "レハール#i19ms21";	// 2724: 32, 37
		//showevent 9999, 0, "混乱の蛇の巣#i19ms21";	// 2725: 28, 33
		cloakonnpc "ホルル#i19ms31";
		cloakonnpc "アーウィン#i19ms31";
		cloakonnpc "アーウィン#i19ms32";
		cloakonnpc "アーウィン#i19ms33";
		end;
	}
	if(EP19_1QUE == 66) {
		mes "[中級ルガン]";
		mes "尊い方たちは……";
		mes "教主様の……";
		mes "ラスガンド様の命令で……";
		mes "上級区域に集まるようにと……。";
		close;
	}
	mes "[中級ルガン]";
	mes "……働かなきゃ。";
	close;
OnTouch:
	if(EP19_1QUE == 65) {
		cloakoffnpc "ホルル#i19ms31";
		cloakoffnpc "アーウィン#i19ms31";
		cloakoffnpc "アーウィン#i19ms32";
		cloakoffnpc "アーウィン#i19ms33";
	}
	end;
}

jor_que.gat,128,146,7	script	ホルル#i19ms31	21529,{/* 2719 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,134,146,1	script	アーウィン#i19ms31	21529,{/* 2720 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,127,151,5	script	アーウィン#i19ms32	21529,{/* 2721 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,134,151,3	script	アーウィン#i19ms33	21529,{/* 2722 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,36,38,3	script	ルガン#i19ms20	21529,14,14,{/* 2723 */
	unittalk "ルガン : こ、殺さないで……。";
	end;
OnTouch:
	if(EP19_1QUE == 66 || EP19_1QUE == 67) {
		cloakoffnpc "レハール#i19ms21";
		cloakoffnpc "レイジー#i19ms21";
		cloakoffnpc "混乱の蛇の巣#i19ms21";
	}
	end;
}

jor_que.gat,32,37,5	script	レハール#i19ms21	21529,{/* 2724 (cloaking)*/
	if(EP19_1QUE == 66) {
		mes "[レハール]";
		mes "ちょうど良いところに。";
		mes "お待ちしてましたよ！";
		cloakoffnpc "オーレリー#i19ms21";
		unittalk getnpcid(0,"オーレリー#i19ms21"),"オーレリー : ふむ、追い付いたな。";
		next;
		mes "[ルガン]";
		mes "殺さないで…ください…お願いです…。";
		next;
		mes "[レイジー]";
		mes "何がどうなっているんだ？";
		mes "なんで、このルガンはこんなに";
		mes "怯えている？";
		next;
		mes "[オーレリー]";
		mes "この先に進む為の道も";
		mes "塞がってるみたいだけど？";
		next;
		mes "[レハール]";
		mes "それが……";
		mes "この先が上級区域なんですが";
		mes "上級以上のルガンたちは全員";
		mes "そこに集められたみたいなんです。";
		next;
		mes "[レハール]";
		mes "ところが、その後に";
		mes "上級区域から得体の知れない";
		mes "化物たちが現れて";
		mes "ここにいたルガンたちに";
		mes "襲い掛かったようなんです。";
		next;
		mes "[オーレリー]";
		mes "得体の知れない化物？";
		next;
		mes "[レハール]";
		mes "その化物は、上級ルガンに";
		mes "似ていたそうなのですが";
		mes "身体が変異していたようで……。";
		next;
		mes "[レハール]";
		mes "入口が塞がれているのは";
		mes "変異したルガンたちが、こちら側に";
		mes "出てこれないようにする為です。";
		next;
		mes "[オーレリー]";
		mes "……ラスガンドと";
		mes "上級ルガンだけが";
		mes "この先に集まっているのよね？";
		next;
		mes "[オーレリー]";
		mes "結果的にだけど";
		mes "奴らをここに追い込めたわけだ。";
		mes "一気に攻め込めば";
		mes "奴らを殲滅できるかもしれないわ。";
		next;
		cloakoffnpc "ホルル#i19ms21";
		mes "[ホルル]";
		mes "支援部隊も到着したようだ！";
		next;
		cloakoffnpc "ヴォークリンデ#i19ms21";
		cloakoffnpc "レオン#i19ms21";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"ヴォークリンデ#i19ms21"),"ヴォークリンデ : 状況は？";
		unittalk getnpcid(0,"レオン#i19ms21"),"レオン : 何が起きていますか？";
		if(!sleep2(500)) end;
		cloakoffnpc "ミリアム#i19ms21";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"ミリアム#i19ms21"),"ミリアム : 遅くなりました。";
		if(!sleep2(1500)) end;
		cloakoffnpc "アーウィン#i19ms21";
		cloakoffnpc "アーウィン#i19ms22";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"アーウィン#i19ms21"),"アーウィン : 合流いたします！";
		unittalk getnpcid(0,"アーウィン#i19ms22"),"アーウィン : 支援いたします！";
		if(!sleep2(2000)) end;
		mes "[レイジー]";
		mes "皆様御揃いで！";
		mes "さあさあ、状況を整理しましょう！";
		next;
		mes "[レイジー]";
		mes "ラスガンドと上級以上のルガン、";
		mes "そして恐らくバゴットが";
		mes "この先の上級区域に集まっています。";
		next;
		mes "[レイジー]";
		mes "しかし、この先には";
		mes "得体の知れない化物が……";
		mes "まあ十中八九、バゴットがルガンたちに";
		mes "何かをした結果だと思うけど。";
		mes "が、徘徊しているようです。";
		next;
		mes "[ヴォークリンデ]";
		mes "ルガンの奴らも";
		mes "背水の陣ってところかしら。";
		mes "危険だけど、ラスガンドに会うには";
		mes "ここを進むしかないってわけね。";
		next;
		mes "[ホルル]";
		mes "塞がれている瓦礫をどけて";
		mes "入口を作るから";
		mes "順番に突入しよう。";
		mes "我々アーウィンが先陣を切る！";
		next;
		cloakonnpc "ホルル#i19ms21";
		cloakonnpc "アーウィン#i19ms21";
		cloakonnpc "アーウィン#i19ms22";
		mes "[オーレリー]";
		mes "私達も行くわ。";
		mes "レオン、行こう。";
		next;
		cloakonnpc "レオン#i19ms21";
		cloakonnpc "オーレリー#i19ms21";
		mes "[ヴォークリンデ]";
		mes "レハールはここに残って";
		mes "後方支援を。";
		mes "ミリアムは、私と一緒に行きましょう。";
		next;
		unittalk getnpcid(0,"レイジー#i19ms21"),"レイジー : 私も後方で待機だな！";
		cloakonnpc "ヴォークリンデ#i19ms21";
		cloakonnpc "ミリアム#i19ms21";
		mes "[レイジー]";
		mes strcharinfo(0)+"も";
		mes "準備ができたら突入してくれ！";
		delquest 17647;
		setquest 17648;
		set EP19_1QUE,67;
		close;
		//showevent 9999, 0, "アーウィン偵察#i19ms11";	// 2698: 271, 88
		//showevent 9999, 0, "ミリアム#i19ms12";	// 2711: 144, 253
		//showevent 9999, 0, "中級ルガン#i19ms21";	// 2718: 131, 148
		//showevent 9999, 0, "レハール#i19ms21";	// 2724: 32, 37
		//showevent 0, 1, "混乱の蛇の巣#i19ms21";	// 2725: 28, 33
	}
	if(EP19_1QUE == 67) {
		mes "[レハール]";
		mes "突入の準備はできましたか？";
		mes "何が待ち構えているか";
		mes "わかりませんから";
		mes "準備は怠らないでくださいね。";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,28,33,5	script	混乱の蛇の巣#i19ms21	10046,{/* 2725 (cloaking)*/
	if(EP19_1QUE == 67) {
		if(mdopenstate("混乱の蛇の巣") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[レハール]";
			mes "準備ができたら";
			mes "突入してください。";
			set '@menu$,"「混乱の蛇の巣」入場";
		}
		else {
			mes "[レハール]";
			mes "突入する準備はできましたか？";
			mes "問題ないようでしたら";
			mes "先行した人たちに合図の信号を";
			mes "送ります。";
			set '@menu$,"「混乱の蛇の巣」(混乱の蛇の巣)の作成";
		}
		next;
		if(select("やめる",'@menu$) == 1) {
			mes "[レハール]";
			mes "準備ができるまで";
			mes "待機していますね。";
			close;
		}
		if(mdopenstate("混乱の蛇の巣")) {
			mes "[レハール]";
			mes "では、突入してください。";
			close2;
			if(getonlinepartymember() > 2) { // 未調査
				mes "[インフォメーション]";
				mes "このメモリアルダンジョンは";
				mes "2人以下のパーティーで";
				mes "入場することができます。";
				close;
			}
			switch(mdenter("混乱の蛇の巣")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[混乱の蛇の巣] に入場しました　 : 　" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("ConfusedNestControl1")+ "::OnStart";
				//warp "1@jorchs.gat", 278, 18;
				end;
			case 1:	// パーティー未加入
				mes "[インフォメーション]";
				mes "このメモリアルダンジョンは";
				mes "2人以下のパーティーで";
				mes "入場することができます。";
				close;
			case 2:	// ダンジョン未作成
				mes "[レハール]";
				mes "パーティーリーダーの方に";
				mes "準備ができたのか";
				mes "確認してください。";
				next;
				mes "[インフォメーション]";
				mes "対象のメモリアルダンジョンが";
				mes "作成されていないため";
				mes "入場できません。";
				close;
			default:	// その他エラー
				close;
			}
		}
		else {
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[インフォメーション]";
				mes "パーティーリーダーのみ";
				mes "メモリアルダンジョンを";
				mes "作成することができます。";
				close;
			}
			mdcreate "混乱の蛇の巣";
			mes "■パーティー名";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "■パーティーリーダー";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "　";
			mes "^006400混乱の蛇の巣^000000の作成申請を受け付けます。";
			close;
		}
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,34,38,5	script	レイジー#i19ms21	10475,{/* 2726 (cloaking)*/
	mes "[レイジー]";
	mes "私はここで";
	mes "状況の把握に努めるよ。";
	mes "荒事は得意じゃないからさ。";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,37,36,1	script	ホルル#i19ms21	21529,{/* 2727 (cloaking)*/
	mes "[ホルル]";
	mes "この日を待っていた！";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,34,32,7	script	ミリアム#i19ms21	21529,{/* 2728 (cloaking)*/
	mes "[ミリアム]";
	mes "ユミルの心臓の欠片を";
	mes "見つけ出さないと……！";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,36,35,1	script	オーレリー#i19ms21	10465,{/* 2729 (cloaking)*/
	cutin "ep19_aurelie01.png", 0;
	mes "[オーレリー]";
	mes "巣の中は混乱しているようだったから";
	mes "変身しなくても入ってこれたわ。";
	close2;
	cutin "ep19_aurelie01.png", 255;
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:オーレリー#i19ms21(2729)
	cloakonnpc;
	end;
}

jor_que.gat,35,34,1	script	レオン#i19ms21	10464,{/* 2730 (cloaking)*/
	cutin "ep19_leon01.png", 0;
	mes "[レオン]";
	mes "なぜ上級以上のルガンを";
	mes "集めたのでしょうか？";
	mes "……イヤな予感がします。";
	close2;
	cutin "ep19_leon01.png", 255;
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:レオン#i19ms21(2730)
	cloakonnpc;
	end;
}

jor_que.gat,40,34,1	script	ヴォークリンデ#i19ms21	21529,{/* 2731 (cloaking)*/
	mes "[ヴォークリンデ]";
	mes "準備はできたかい？";
	mes "前後の状況は、中に入ってから";
	mes "聞かせておくれ。";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,38,33,1	script	アーウィン#i19ms21	21529,{/* 2732 (cloaking)*/
	mes "[アーウィン]";
	mes "混沌！　破壊！　ひたすら破壊！！";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,37,31,1	script	アーウィン#i19ms22	21529,{/* 2733 (cloaking)*/
	mes "[アーウィン]";
	mes "準備できたでありみあす！！";
	mes "……舌噛んじゃった。";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,277,34,3	script	人間#i19ms100	851,{/* 2734 */}
jor_que.gat,276,33,7	script	人間#i19ms101	851,{/* 2735 */}
jor_que.gat,271,34,5	script	アーウィン#i19ms100	21529,{/* 2736 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,271,34,0	script	#i19ms100	139,5,5,{/* 2737 */
	cloakoffnpc "人間#i19ms100";
	cloakoffnpc "人間#i19ms101";
	unittalk getnpcid(0,"人間#i19ms100"),"労働者 ： 監視が消えた？　交代の時間か？";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"人間#i19ms101"),"労働者 ： すぐに戻ってくるよ……。";
	if(!sleep2(500)) end;
	unittalk getnpcid(0,"人間#i19ms100"),"労働者 ： 逃げ出すチャンスじゃないか？";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"人間#i19ms101"),"労働者 ： それは、危険過ぎる……。";
	cloakoffnpc "アーウィン#i19ms100";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"アーウィン#i19ms100"),"アーウィン : みなさん、助けにきました！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms100"),"労働者 ： な、なんだ？";
	unittalk getnpcid(0,"人間#i19ms101"),"労働者 ： へ、変なルガンが!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms100"),"アーウィン : みなさんは、もう自由です。早く出て！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms100"),"労働者 ： 私は逃げるぞ！";
	if(!sleep2(500)) end;
	cloakonnpc "人間#i19ms100";
	if(!sleep2(500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms100"),"アーウィン : あなたも早く！";
	unittalk getnpcid(0,"人間#i19ms101"),"労働者 ： ええい、わかったよ！";
	if(!sleep2(500)) end;
	cloakonnpc "人間#i19ms101";
	if(!sleep2(500)) end;
	cloakonnpc "アーウィン#i19ms100";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,252,244,7	script	人間#i19ms102	748,{/* 2738 */}
jor_que.gat,255,240,1	script	アーウィン#i19ms101	21529,{/* 2739 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,255,240,0	script	#i19ms101	139,5,5,{/* 2740 */
	cloakoffnpc "人間#i19ms102";
	unittalk getnpcid(0,"人間#i19ms102"),"労働者 ： 監視がいなくなった？";
	if(!sleep2(1500)) end;
	cloakoffnpc "アーウィン#i19ms101";
	unittalk getnpcid(0,"アーウィン#i19ms101"),"アーウィン : ここは、あなた独り？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms102"),"労働者 ： わぁ、すいません！　脱出しようなんて思ってないです！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms101"),"アーウィン : 監視がいない今なら逃げられます！　一緒に行きましょう！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms102"),"労働者 ： え……？　そうなの!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms101"),"アーウィン : 捕まっている人たちを救出してるんです。さあ、早く！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms102"),"労働者 ： やった！　ここから出られる!!";
	if(!sleep2(500)) end;
	cloakonnpc "アーウィン#i19ms101";
	cloakonnpc "人間#i19ms102";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,227,277,3	script	人間#i19ms103	125,{/* 2741 */}
jor_que.gat,223,277,3	script	人間#i19ms104	89,{/* 2742 */}
jor_que.gat,222,275,7	script	アーウィン#i19ms102	21529,{/* 2743 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,222,275,0	script	#i19ms102	139,5,5,{/* 2744 */
	cloakoffnpc "人間#i19ms103";
	cloakoffnpc "人間#i19ms104";
	unittalk getnpcid(0,"人間#i19ms104"),"労働者 ： 本当に監視はいない？";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"人間#i19ms103"),"労働者 ： 様子を見てくる。";
	unittalk getnpcid(0,"人間#i19ms104"),"労働者 ： 気を付けろよ……。";
	if(!sleep2(1000)) end;
	cloakoffnpc "アーウィン#i19ms102";
	unittalk getnpcid(0,"アーウィン#i19ms102"),"アーウィン : いたいた！　今なら逃げられますよ！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms104"),"労働者 ： うあああああぁぁぁっ!!!";
	unittalk getnpcid(0,"人間#i19ms103"),"労働者 ： 静かにしろ!!　ビックリするだろ!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms103"),"労働者 ： えっと……外に出られるのか？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms102"),"アーウィン : はい、付いてきてください。安全な場所に案内します。";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms103"),"労働者 ： 行こう！　今がチャンスだ!!";
	if(!sleep2(500)) end;
	cloakonnpc "人間#i19ms103";
	unittalk getnpcid(0,"人間#i19ms104"),"労働者 ： ほ、本当に大丈夫なの……？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms102"),"アーウィン : 大丈夫です！　信じてください！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms104"),"労働者 ： そこまで言うなら……行くよ！";
	if(!sleep2(500)) end;
	cloakonnpc "人間#i19ms104";
	cloakonnpc "アーウィン#i19ms102";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,183,272,5	script	人間#i19ms105	881,{/* 2745 */}
jor_que.gat,187,269,1	script	アーウィン#i19ms103	21529,{/* 2746 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,187,269,0	script	#i19ms103	139,{/* 2747 */
	cloakoffnpc "人間#i19ms105";
	unittalk getnpcid(0,"人間#i19ms105"),"労働者 ： 静かになったら、こっそり逃げ出して……。";
	cloakoffnpc "アーウィン#i19ms103";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"アーウィン#i19ms103"),"アーウィン : 人間を発見！　今すぐ逃げてください。";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms105"),"労働者 ： な、なんだ？　中級ルガン!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms103"),"アーウィン : 私はルガンではありません。事情は後で説明します！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms103"),"アーウィン : 安全な場所までお連れいたします。さあ！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms105"),"労働者 ： ほ、本当か？　私を騙すつもりなら許さないからな！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms103"),"アーウィン : はい、はい。荷物は全部持ちましたよね。行きますよ。";
	if(!sleep2(500)) end;
	cloakonnpc "アーウィン#i19ms103";
	cloakonnpc "人間#i19ms105";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,125,41,5	script	人間#i19ms106	880,{/* 2748 */}
jor_que.gat,121,39,7	script	アーウィン#i19ms104	21529,{/* 2749 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,121,39,0	script	#i19ms104	139,5,5,{/* 2750 */
	cloakoffnpc "人間#i19ms106";
	unittalk getnpcid(0,"人間#i19ms106"),"労働者 ： せ、せっかくここまで逃げてきたのに！";
	if(!sleep2(1000)) end;
	cloakoffnpc "アーウィン#i19ms104";
	unittalk getnpcid(0,"アーウィン#i19ms104"),"アーウィン : ここに隠れていたのですか？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms106"),"労働者 ： お、お許しください。どうかお許しを！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms104"),"アーウィン : 私はルガンではありません。ルガンに変装してるだけです。";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms104"),"アーウィン : 一緒に外へ行きましょう。安全な場所があります。";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms106"),"労働者 ： そ、その話を信じろと？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms104"),"アーウィン : 今がチャンスなんです。外に出たくないのですか？";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"人間#i19ms106"),"労働者 ： 外に出たい！　ここから出してくれ！";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"アーウィン#i19ms104"),"アーウィン : よし、一緒に行きましょう。";
	if(!sleep2(500)) end;
	cloakonnpc "アーウィン#i19ms104";
	cloakonnpc "人間#i19ms106";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,67,168,5	script	ルガン#i19ms100	21529,{/* 2751 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "人間は…出ていけ！";
		close;
	}
	unittalk "ルガン : 仕事の報告したいのに……みんなどこへ行ったんだ？";
	end;
}

jor_que.gat,156,191,3	script	ルガン#i19ms101	21529,{/* 2752 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "汚らわしい人間めっ！";
		close;
	}
	unittalk "ルガン : なぜこんなに慌ただしいんだ？";
	end;
}

jor_que.gat,204,237,3	script	ルガン#i19ms102	21529,{/* 2753 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "人間は立入禁止だ！";
		close;
	}
	unittalk "ルガン : 尊いお方は……いったいどこに？";
	end;
}

jor_que.gat,81,77,5	script	ルガン#i19ms103	21529,{/* 2754 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "人間は出ていけ！";
		close;
	}
	unittalk "ルガン : この先は危険です。ここに居てください。";
	end;
}

jor_que.gat,208,140,1	script	ルガン#i19ms104	21529,{/* 2755 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "人間？　何故ここいる!?";
		close;
	}
	unittalk "ルガン : 今日は飯くれない？";
	end;
}

jor_que.gat,184,184,7	script	ルガン#i19ms105	21529,{/* 2756 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "汚らわしい人間め……。";
		close;
	}
	unittalk "ルガン : なんで静か？　なんで？　 なんで？";
	end;
}

jor_que.gat,128,81,7	script	ルガン#i19ms106	21529,{/* 2757 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "人間……働け。";
		close;
	}
	unittalk "ルガン : 卵、育てる。";
	end;
}

jor_que.gat,173,195,3	script	ルガン#i19ms107	21529,{/* 2758 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "汚らわしい人間め……。";
		close;
	}
	unittalk "ルガン : 痛い…痛いよ…外へ出たい。";
	end;
}

jor_que.gat,162,58,1	script	ルガン#i19ms108	21529,{/* 2759 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "人間…近寄るな……。";
		close;
	}
	unittalk "ルガン : 遊んでません……本当です。本当です。";
	end;
}

jor_que.gat,159,105,3	script	ルガン#i19ms109	21529,{/* 2760 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "汚らわしい人間……。";
		close;
	}
	unittalk "ルガン : ああああ～助けて！";
	end;
}

icecastle.gat,195,170,3	script	警備#e19c00	21517,{/* 2761 */
	unittalk "警備 : 警戒中。";
	end;
}

icecastle.gat,209,156,3	script	警備#e19c01	21517,{/* 2762 */
	unittalk "警備 : 異常なし！";
	end;
}

icecastle.gat,71,255,5	script	アヤル#e19c00	10461,{/* 2763 */
	unittalk "アヤル : 止まって！　消さないように気を付けろ。神聖な足跡だから。";
	end;
}

icecastle.gat,118,270,3	script	ホメル#e19c00	10461,{/* 2764 */
	unittalk "ホメル : この滝には伝説がある。しかし誰もその伝説を知らない。";
	end;
}

icecastle.gat,118,245,5	script	ギャルル#e19c00	21514,{/* 2765 */
	unittalk "ギャルル : 待ってて。ここのお魚、全部捕まえるから。";
	end;
}

icecastle.gat,133,165,5	script	ハルル#e19c00	10461,{/* 2766 */
	unittalk "ハルル : 綺麗だろ？　一生懸命集めたんだよ。";
	end;
}

icecastle.gat,116,147,5	script	スニャリ#e19c00	21514,{/* 2767 */
	unittalk "スニャリ : 上にある滝で釣りをするなんて馬鹿だな。お魚は全部ここにいるのに！";
	end;
}

icecastle.gat,99,119,3	script	ゴヒャル#e19c00	10461,{/* 2768 */
	unittalk "ゴヒャル : ばあっ！",1;
	end;
}

icecastle.gat,84,129,3	script	バンジル#e19c00	10461,{/* 2769 */
	unittalk "バンジル : 綺麗でしょう？　みんなに見せるために持ってきたんだよ。";
	end;
}

icecastle.gat,82,111,3	script	シャシャシャ#e19c00	10461,{/* 2770 */
	unittalk "シャシャシャ : この槍を抜く者は、天下を手に入れる!!　伯父さんが言ってました。",1;
	end;
}

jor_tail.gat,209,72,5	script	警備#e19c02	21517,{/* 2771 */
	unittalk "警備 : イスガルドへようこそ！",1;
	end;
}

jor_tail.gat,216,79,3	script	ラフホ#e19c00	10461,{/* 2772 */
	unittalk "ラフホ : 雪を退かすとどうなる？　また雪が降る！　わはははははっ!!!",1;
	end;
}

jor_tail.gat,291,91,5	script	ハムル#e19c00	10461,{/* 2773 */
	unittalk "ハムル : ここが海の果てだよね？",1;
	end;
}

jor_tail.gat,153,76,3	script	ノドル#e19c00	10461,{/* 2774 */
	unittalk "ノドル : このバスケットを満タンにできるのかな。";
	end;
}

jor_tail.gat,150,81,5	script	バザロン#e19c00	10461,{/* 2775 */
	unittalk "バザロン : 十分休んだら、仕事をしようぜ？";
	end;
}

jor_tail.gat,250,273,7	script	ゾロロン#e19c00	10461,{/* 2776 */
	unittalk "ゾロロン : 氷の彫刻がこの形の物を頭に付けているんだ。不思議だな。";
	end;
}

jor_tail.gat,216,269,5	script	ハリャリャ#e19c00	10461,{/* 2777 */
	unittalk "ハリャリャ : 道が狭いから気を付けて！　崩れると救助にも時間が掛かるんだ。";
	end;
}

jor_tail.gat,181,158,5	script	ホフホ#e19c00	10461,{/* 2778 */
	unittalk "ホフホ : あの足跡が見える？　聖なる足跡だよ。あっちこっちあるから、捜してみて。";
	end;
}

jor_tail.gat,168,86,3	script	ゴルル#e19c00	10461,{/* 2779 */
	unittalk "ゴルル : 私が開発した羽毛管理剤の防水・防寒テスト中なのだ。";
	end;
}

icas_in.gat,241,66,3	script	ゾリャラ#ep19_dq_kitche	10451,{/* 2780 */
	if(EP19_1QUE < 100) {
		mes "[ゾリャラ]";
		mes "人間が訪ねてきたという話は";
		mes "聞いていたけど……";
		mes "外出許可は取ったのか？";
		mes "今はいわゆる戦時状態だから、";
		mes "許可の無い単独行動は危険だ。";
		mes "俺たちの巣へ戻ってくれ。";
		next;
		mes "^e6328c‐このクエストを進行するには";
		mes "^e6328c　以下の条件を満たす必要があります‐";
		mes "^e6328c　・BaseLv220以上";
		mes "^e6328c　・クエスト「説話の地」のクリア";
		mes "　^000000";
		mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
	if(checkquest(8787)) {
		mes "[ゾリャラ]";
		mes "食料の調達を手伝ってくれるのか？";
		mes "あんたには関係ないのに、恩に着る。";
		next;
		if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の丘)") == 2) {
			mes "[ゾリャラ]";
			mes "もう現地に向かうか？";
			close2;
			cutin "kafra_01.bmp", 255;
			warp "jor_back1.gat", 131, 16;	// from: icas_in.gat(242, 58)
			end;
		}
		mes "クエストの受注や報告、";
		mes "取り消しが可能です。";
		next;
		switch(select("全て受注する","全て報告する","[受注可] ゾリャラの楽しいランチタイム","全て破棄する")) {
		case 3:
			if(checkquest(8788)) {
				if(countitem(1000830) < 10) {
					mes "[ゾリャラ]";
					mes "俺は子供たちの世話をしているから、";
					mes "<ITEM>[薄くて丈夫な皮]<INFO>1000830</INFO></ITEM>を";
					mes "10個採ってきてくれるか？";
					mes "<URL>アイスストロー<INFO>https://rotool.gungho.jp/monster/EP19_ICE_STRAW</INFO></URL>を狩ると手に入るはずだ。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ゾリャラの楽しいランチタイム^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 8788;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ゾリャラの楽しいランチタイム^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ゾリャラの楽しいランチタイム^000000」";
				mes "<内容>";
				mes "アイテム：<ITEM>[薄くて丈夫な皮]<INFO>1000830</INFO></ITEM>　10個";
				mes "を納品";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 6G ( 6000000000 )";
				mes "※300000000を20回受け取ります。";
				mes "JobExp 4.5G ( 4500000000 )";
				mes "※225000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ゾリャラの楽しいランチタイム^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 1000830,10;
				delquest 8788;
				setquest 8789;
				getitem 1000608,2;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 300000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,225000000,0;
				mes "[ゾリャラ]";
				mes "ありがとう、人間！";
				next;
				mes "[ゾリャラ]";
				mes "さぁさぁ…細かく切ってあげるから、";
				mes "遠く離れていてね。";
				mes "氷の欠片が飛ぶと危ないよ。";
				mes "人間、見るならちょっと後ろに下がって。";
				mes "さぁ、では包丁を入れてみようかな……。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 6G";
				mes "( 6000000000 )";
				mes "※300000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 4.5G";
				mes "( 4500000000 )";
				mes "※225000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
				mes "を獲得しました。";
				close2;
				unittalk getnpcid(0,"ゾリャラ#ep19_dq_kitche"),"ゾリャラ : 必殺！アーウィン守護者我流、即絶剣！";
				unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : ゾリャラ、格好いい！";
				unittalk getnpcid(0,"トラルン#ep19in"),"トラルン : ゾリャラ、格好いい！";
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(8789)) {
				if(!(checkquest(8789)&2)) {
					mes "[ゾリャラ]";
					mes "子供たちも喜んでいる。";
					mes "これで一安心だな。";
					mes "まさか、";
					mes "他種族をうちの育児に巻き込むとは……";
					mes "まったく。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ゾリャラの楽しいランチタイム^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			mes "[ゾリャラ]";
			mes "俺は子供たちの世話をしているから、";
			mes "<ITEM>[薄くて丈夫な皮]<INFO>1000830</INFO></ITEM>を";
			mes "10個採ってきてくれるか？";
			mes "<URL>アイスストロー<INFO>https://rotool.gungho.jp/monster/EP19_ICE_STRAW</INFO></URL>を狩ると手に入るはずだ。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ゾリャラの楽しいランチタイム^000000」";
			mes "<内容>";
			mes "アイテム：<ITEM>[薄くて丈夫な皮]<INFO>1000830</INFO></ITEM>　10個";
			mes "の納品を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[ゾリャラ]";
				mes "今は忙しいのか？";
				mes "わかった。";
				mes "また時間ができたら頼むよ。";
				next;
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 8788;
			delquest 8789;
			mes "[ゾリャラ]";
			mes "人間、あんたはうちの子たちと";
			mes "何の関係もないはずなのに……";
			mes "優しい奴なんだな。";
			mes "ありがとう！";
			next;
			//showevent 0, 2, "ゾリャラ#ep19_dq_kitche";	// 2766: 241, 66
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ゾリャラの楽しいランチタイム^000000」";
			mes "を受注しました。";
			close2;
			unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : ゾリャラは狩りできない！";
			unittalk getnpcid(0,"トラルン#ep19in"),"トラルン : 刃物使いは上手い！";
			unittalk getnpcid(0,"ゾリャラ#ep19_dq_kitche"),"ゾリャラ : こいつら……";
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	mes "[ゾリャラ]";
	mes "あんたが";
	mes "ちょっと前にイスガルドに来たという";
	mes "人間か？会えて嬉しい。";
	next;
	mes "[ゾリャラ]";
	mes "俺はゾ……いや、";
	mes "エルヴィン・アレクサンドリア・";
	mes "アーデル・ダヴィッド・カシア・";
	mes "ヘリー・アポロだ。";
	mes "気楽に呼んでくれ。";
	next;
	mes "[ホリャラ]";
	mes "今のは、うちの一番上の兄、";
	mes "名前はゾリャラだよ！";
	mes "私はホリャラです。";
	next;
	mes "[ゾリャラ]";
	mes "……ホリャラ！";
	mes "うちの助手が失言をしたな。";
	next;
	mes "[ゾリャラ]";
	mes "見ての通り、ここは厨房兼食堂だ。";
	mes "厨房はみんなに開放されているが、";
	mes "食材管理は俺が担当している。";
	mes "料理というにはアレだが……";
	mes "切ったり、切り刻んだりするのは、";
	mes "必要なら俺がやる。";
	next;
	mes "[ゾリャラ]";
	mes "料理の時に火を使うと結果、";
	mes "ボリュームが減ってしまったりするから、";
	mes "あまり火は使わないな。";
	next;
	mes "[ゾリャラ]";
	mes "食材管理を任されてるから";
	mes "たまに大量に食材が必要な時があって";
	mes "そういう時は、頭を抱えているよ。";
	mes "どうせ全部凍っていて……";
	mes "痛む心配が無いのだけが幸いだ。";
	next;
	mes "[ゾリャラ]";
	mes "すまん……";
	mes "俺一人でぼそぼそ愚痴ってしまったな。";
	mes "モリャラが釣りに出ると、";
	mes "ホリャラの面倒は";
	mes "俺が見なきゃならないから……";
	unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : 私がお兄ちゃんの面倒を見てるんだよ！";
	next;
	mes "[ゾリャラ]";
	mes "うちの両親はパトロール隊出身だからね。";
	mes "ホリャラは、";
	mes "ほとんど俺と二番目のモリャラが";
	mes "面倒みて育てたよ。";
	unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : 私がお兄ちゃんの面倒を見てたんだよ！";
	next;
	mes "[ゾリャラ]";
	mes "助手、お客さんと話し中じゃないか。";
	unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : はいっ！";
	next;
	mes "[ゾリャラ]";
	mes "理解してくれ。";
	unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : アイスストロー食べたい！";
	next;
	mes "[ゾリャラ]";
	mes "……。";
	next;
	mes "[ゾリャラ]";
	mes "アイスストローか……、";
	mes "あいつからとれる<ITEM>[薄くて丈夫な皮]<INFO>1000830</INFO></ITEM>が、";
	mes "ホリャラの好物なんだが、";
	mes "その在庫が切れてるんだ。";
	mes "10個ほどあればどうにかなるんだが……。";
	unittalk getnpcid(0,"トラルン#ep19in"),"トラルン : 私も！";
	next;
	mes "[ゾリャラ]";
	mes "こいつらを置いて外に出る訳にも……。";
	next;
	mes "‐まるで託児所の様だ‐";
	next;
	if(select("代わりに狩りに出る","宥める") == 2) {
		mes "[ゾリャラ]";
		mes "いつものことではある……";
		mes "そう、いつものことだよ……。";
		unittalk getnpcid(0,"トラルン#ep19in"),"トラルン : ゾリャラ、遊んで！";
		close;
	}
	mes "[ゾリャラ]";
	mes "こんなにありがたいことが！";
	mes "内容を伝えるから、";
	mes "もう一度話しかけてくれ！";
	mes "子供たちは俺が世話してるから……";
	mes "もちろん、あんたはうちの子たちと";
	mes "何の関係もないんだが……すまん。";
	close2;
	setquest 8787;
	compquest 8787;
	unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : ありがとう、人間！";
	unittalk getnpcid(0,"トラルン#ep19in"),"トラルン : ありがとう、人間！";
	//showevent 0, 3, "ゾリャラ#ep19_dq_kitche";	// 2766: 241, 66
	end;
}

icas_in.gat,42,252,5	script	レオン#ep19leon02	10464,{/* 2781 */
	if(EP19_1QUE < 100) {
		mes "[レオン]";
		mes "何か必要な用件でも？";
		mes "他の方たちは宿舎や食堂に";
		mes "いらっしゃるはずです。";
		close;
	}
	if(checkquest(18133)) {
		if(checkquest(18133)&8) {
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "草木一本生えない雪原に暖炉とは";
			mes "可笑しいでしょうか？";
			mes "たまに発見される魔力の結晶体である";
			mes "雪花の花びらや、";
			mes "ルガンたちが体内に蓄積した";
			mes "魔力核を燃料として使用しています。";
			next;
			mes "[レオン]";
			mes "さあ、こちらへどうぞ。";
			mes "身体を温めてください。";
			close2;
			cutin "ep19_leon01.png", 255;
			end;
		}
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "城に人手が増えて嬉しいです。";
		mes "これまではレハールが1人で";
		mes "頑張っていましたからね。";
		mes "それでは、詳細な話は";
		mes "ミリアム様とお願いします。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	cutin "ep19_leon04.png", 2;
	mes "[レオン]";
	mes "お呼びだてして申し訳ありません。";
	mes "頼みたいことがあったのです。";
	mes "この前ルガンの住処を捜索した時、";
	mes "労働者たちを救出したでしょう？";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "はい。";
	mes "あの時救助した人たちは";
	mes "マラムとレイジーさんが";
	mes "引率して帰還しましたが……？";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "実はあの時救助された者たちとは別に、";
	mes "ルガンの住処から外へ脱出した者たちが";
	mes "いるようです。";
	next;
	mes "[レオン]";
	mes "パトロールをしていたアーウィンが";
	mes "凍てついた鱗の氷河と";
	mes "凍てついた鱗の平原の地域から";
	mes "遭難者として発見したことで";
	mes "発覚しました。";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "なるほど……";
	mes "遭難者が複数の可能性もありますね。";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "アーウィンたちが周辺を";
	mes "パトロールしていますが、";
	mes "全地域を隈なく捜索することは";
	mes "難しいようです。";
	next;
	cutin "ep19_leon05.png", 2;
	mes "[レオン]";
	mes "そこで、";
	mes "みなさんに助けを求めたいのですが……。";
	next;
	menu "何か気になるものでも？",-;
	mes "[レオン]";
	mes "イスガルドを覆う結界は";
	mes "ミッドガルドとイスガルドを完全に";
	mes "分離するために作られたものですが";
	mes "正確には、ルガンをミッドガルドから";
	mes "隔離するためのものなんです……。";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "招待状なしで行き来している者たちが";
	mes "いるということは、";
	mes "明らかに結界が弱まっている証拠。";
	next;
	mes "[レオン]";
	mes "数百年の年月を";
	mes "死ぬことがない身体で堪えてきた";
	mes "私たちの存在は、";
	mes "この日のためにあったのだと、";
	mes "そう思いました。";
	next;
	menu "数百年……",-;
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "私とオーレリーは、";
	mes "ヨルムンガンドの意志を引き継いで、";
	mes "ここを守っております。";
	mes "みなさんもご存知かもしれませんが、";
	mes "ヨルムンガンドは";
	mes "本当は邪神ではありません。";
	next;
	cutin "ep19_leon04.png", 2;
	mes "[レオン]";
	mes "ヨルムンガンドを邪神と思わせたのは、";
	mes "ヨルムンガンド教団を自称し";
	mes "大陸を苦難に陥れた";
	mes "ルガンたちの所為です。";
	next;
	menu "ヨルムンガンドの呪いは？",-;
	cutin "ep19_leon05.png", 2;
	mes "[レオン]";
	mes "ヨルムンガンド教団の首長が、";
	mes "最後のあがきで";
	mes "血の呪いを掛けたものです。";
	mes "彼らは常に旗印として";
	mes "ヨルムンガンドを掲げていたため、";
	mes "後世にはそう伝わったようです。";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "ともかく、ヨルムンガンドは";
	mes "自らの身体を捨ててまで大陸を救うことに";
	mes "貢献した半神です。";
	mes "ヨルムンガンドの意志を継ぐためにも、";
	mes "ルガンはこの地から";
	mes "解き放つわけにはいきません。";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "重い話ですね……";
	mes "『記録された歴史が";
	mes "真実ではないこともあり得る』";
	mes "ということは理解できますが……。";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "あの時も、今も、";
	mes "私たちは私たちにできる最善を";
	mes "尽くせばいいのでしょう。";
	mes "結界は私とオーレリーが維持します。";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "みなさんには、";
	mes "遭難者の救助の件を";
	mes "一任してもよろしいですか？";
	next;
	cutin "ep19_leon03.png", 2;
	mes "[レオン]";
	mes "もちろん支援は惜しまないつもりです。";
	mes "やっとの思いで救った";
	mes "ミッドガルド大陸です。";
	mes "その子孫たちを守ってみせないと。";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "レオン様の意思、よく解りました。";
	mes "それでは冒険者さん、";
	mes "一緒に具体的な計画を練ろう？";
	setquest 18133;
	close2;
	//showevent 0, 3, "ミリアム#ep19_dq_victim";	// 2769: 48, 252
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	setnpctitle "[守護者]";	// NPC:レオン#ep19leon02(2781)
	end;
}
icas_in.gat,37,253,0	script	ep19_sw_cas_kr	139,14,14,{/* 2782 */
	if(EP19_1QUE >= 100)
		cloakoffnpc "ミリアム#ep19_dq_victim";
	end;
}
icas_in.gat,48,252,3	script	ミリアム#ep19_dq_victim	10377,{/* 2783 (cloaking)*/
	if(checkquest(18133)) {
		if(checkquest(18133)&8) {
			cutin "ep18_miriam_01.png", 0;
			mes "[ミリアム]";
			mes "冒険者さん、";
			mes "今日も遭難者の救助にいく？";
			next;
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の氷河)") == 2) {
				mes "[ミリアム]";
				cutin "ep18_miriam_01.png", 2;
				mes "それじゃ、現地まで送るね。";
				mes "ボクも別の場所を見て回るから、";
				mes "冒険者さんも頑張ってね。";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_back3_.gat", 363, 245;	// from: icas_in.gat(49, 254) port : 5122
				end;
			}
			mes "クエストの受注や報告、";
			mes "取り消しが可能です。";
			next;
//switch(select("全て報告する","[^ff0000挑戦中^000000] 遭難者捜索","全て受注する","全て破棄する")) {
			switch(select("全て受注する","全て報告する","[受注可] 遭難者捜索","全て破棄する")) {
//switch(select("全て受注する","全て報告する","[^ff0000報告可^000000] 遭難者捜索","全て破棄する")) {
//switch(select("全て受注する","全て報告する","[^888888時間制限中^000000] 遭難者捜索","全て破棄する")) {
			case 3:
				if(checkquest(18134) || checkquest(18135)) {
					mes "[ミリアム]";
					cutin "ep18_miriam_01.png", 2;
					mes "<URL>凍て付いた鱗の氷河<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>に向かい、";
					mes "遭難者の捜索をお願い。";
					next;
					mes "[ミリアム]";
					cutin "ep18_miriam_01.png", 2;
					mes "遭難者を発見したら、";
					mes "この城の1階の右手の部屋にある";
					mes "暖炉の前にすぐに連れて行って。";
					mes "マラムにも話を通しておいたから、";
					mes "面倒を見てくれるはずだよ。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000遭難者捜索^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
					}
					delquest 18134;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000遭難者捜索^000000」";
					mes "を破棄しました。";
					close;
				}
				if(checkquest(18136)) {
					mes "<<B>クエスト</B>>";
					mes "「^ff0000遭難者捜索^000000」";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 4.5G ( 4500000000 )";
					mes "※225000000を20回受け取ります。";
					mes "JobExp 3.5G ( 3500000000 )";
					mes "※175000000を20回受け取ります。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000遭難者捜索^000000」";
					mes "を報告しますか？";
					next;
					if(select("報告する","やめる") == 2) {
					}
					delquest 18134;
					delquest 18136;
					setquest 18137;
					getitem 1000608,2;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 225000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,175000000,0;
					cutin "ep18_miriam_01.png", 2;
					mes "[ミリアム]";
					mes "ありがとう。冒険者さん。";
					mes "今日はもう休んで、";
					mes "明日になったら、また捜索しよう。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 4.5G";
					mes "( 4500000000 )";
					mes "※225000000 BaseExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "JobExp 3.5G";
					mes "( 3500000000 )";
					mes "※175000000 JobExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
					mes "を獲得しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(18137)) {
					cutin "ep18_miriam_01.png", 2;
					mes "[ミリアム]";
					mes "雪原で長時間活動するのは";
					mes "危険だよ。";
					mes "十分に休息をとってから、";
					mes "再び捜索に向かおう？";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000遭難者捜索^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				cutin "ep18_miriam_01.png", 2;
				mes "[ミリアム]";
				mes "<URL>凍て付いた鱗の氷河<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>に向かい、";
				mes "遭難者の捜索をお願い。";
				next;
				cutin "ep18_miriam_01.png", 2;
				mes "[ミリアム]";
				mes "遭難者を発見したら、";
				mes "この城の1階の右手の部屋にある";
				mes "暖炉の前にすぐに連れて行って。";
				mes "マラムにも話を通しておいたから、";
				mes "面倒を見てくれるはずだよ。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000遭難者捜索^000000」";
				mes "を受注しますか？";
				next;
				if(select("受注する","やめる") == 2) {
					mes "[ミリアム]";
					cutin "ep18_miriam_01.png", 2;
					mes "分かったよ。";
					mes "時間ができたら、またよろしくね。";
					next;
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 18134;
				mes "[ミリアム]";
				cutin "ep18_miriam_01.png", 2;
				mes "よろしくね。";
				mes "ボクは平原の方を見てくるよ。";
				next;
				//showevent 0, 2, "ミリアム#ep19_dq_victim";	// 2769: 48, 252
				mes "<<B>クエスト</B>>";
				mes "「^ff0000遭難者捜索^000000」";
				mes "を受注しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "それじゃあ、";
		mes "遭難者の救助について話を詰めよう。";
		next;
		mes "[ミリアム]";
		mes "まず、捜索すべき地域は";
		mes "凍て付いた鱗の氷河と、";
		mes "凍て付いた鱗の平原の2つの地域です。";
		mes "地域ごとに担当者を分けて、";
		mes "捜索しよう。";
		next;
		mes "[ミリアム]";
		mes "冒険者さんは、";
		mes "凍て付いた鱗の氷河の方を頼むよ。";
		next;
		menu "救出した遭難者は？",-;
		mes "[ミリアム]";
		mes "先ずは氷の城の宿舎に連れてこよう。";
		mes "暖を取ってもらって、体力が回復したら、";
		mes "マラムとレイジーさんを";
		mes "通して大陸へ送り届けよう。";
		next;
		mes "[ミリアム]";
		mes "冒険者さんが";
		mes "片方の地域を担当してくれれば、";
		mes "もう一方はボクが探してみるよ。";
		mes "ルガンの住処は、";
		mes "アーウィンとレハール様に";
		mes "捜索を要請しよう。";
		next;
		mes "[ミリアム]";
		mes "住処の中なら、";
		mes "それなりに範囲が制限されてるから、";
		mes "捜索する時間は短いだろうし。";
		next;
		mes "[ミリアム]";
		mes "遭難者の捜索そのものが難しい方を、";
		mes "ボクと冒険者さんでやろう。";
		mes "それじゃあ、";
		mes "準備ができたら話しかけて。";
		compquest 18133;
		close2;
		//showevent 0, 3, "ミリアム#ep19_dq_victim";	// 2769: 48, 252
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "レオン様が";
	mes "お手伝いしてほしいそうだよ。";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3_.gat,344,296,3	script	くぼみ#ep19_3_1	550,{/* 6040 */
	if(checkquest(18134)) {
		mes "‐雪の間にくぼみがある‐";
		next;
		if(select("掘り返す","立ち去る") == 2) {
			mes "‐何もせずに立ち去った‐";
			close;
		}
		progressbar 1;	//color=0x4d4dff
		next;
		mes "‐なんと！";
		mes "　遭難者が雪に穴を掘り、";
		mes "　うずくまっている。";
		mes "　氷の城へ連れて行って、";
		mes "　暖めてあげよう！‐";
		setquest 18135;	showevent 0, 3, "マラム#ep19maram05";	// 2774: 262, 179
		close;
	}
	mes "‐積もった雪を掘り返した痕跡がある。";
	mes "　周囲に異常は見つからない‐";
	close;
}
jor_back3_.gat,320,208,3	duplicate(くぼみ#ep19_3_1)	くぼみ#ep19_3_2	550	/* 6041 */
jor_back3_.gat,182,305,3	duplicate(くぼみ#ep19_3_1)	くぼみ#ep19_3_3	550	/* 6042 */

icas_in.gat,262,179,0	script	#ep19_evt07	139,14,10,{/* 2784 */
	if(checkquest(18135) || checkquest(18136)) {
		cloakoffnpc "マラム#ep19maram05";
		cloakoffnpc "救助した遭難者#ep19_01";
		cloakoffnpc "救助した遭難者#ep19_02";
		cloakoffnpc "ミリアム#ep19miriam06";
	}
	end;
}
icas_in.gat,261,186,7	script	救助した遭難者#ep19_01	881,{/* 2785 (cloaking)*/
	unittalk "……こ……これが恋しかったんだ。暖かい温もり……！";
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,262,184,7	script	救助した遭難者#ep19_02	882,{/* 2786 (cloaking)*/
	unittalk "た……助けてくださいありがとうございました。ふう……凍え死ぬかと思った。";
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,260,180,5	script	ミリアム#ep19miriam06	10377,{/* 2787 (cloaking)*/
	if(checkquest(18136)) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "捜索お疲れ様。";
		mes "身体は温まった？";
		mes "報酬の準備はできてるよ。";
		mes "ボクと一緒に上の部屋にきて。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		warp "icas_in.gat", 50, 248;	// from: icas_in.gat(258, 182)
		end;
	}
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "捜索お疲れ様。";
	mes "身体は温まった？";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,262,179,3	script	マラム#ep19maram05	10376,{/* 2788 (cloaking)*/
	if(checkquest(18135)) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "救助された方たちは、";
		mes "体を温めてください。";
		mes "皆さんは、";
		mes "私が飛行船で元居た場所に";
		mes "連れて帰る予定です。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "大事になる前に見つかってよかったよ。";
		mes "生活に窮して、";
		mes "ヨルムンガンド教団を";
		mes "新しい宗教だと思って";
		mes "ついて来た人たちもいるみたい。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "なるほど。";
		mes "どちらにしても、この方たちについては、";
		mes "私とレイジーさんが落ち着かせてから、";
		mes "家に送り届けるよ。";
		mes "冒険者様もご苦労様でした。";
		mes "少し休んでください。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "そうだね。";
		mes "今日はもう休んで、明日また捜索しよう。";
		mes "冒険者さんには報酬を渡さないとだから、";
		mes "ボクと一緒に上の部屋に行こう？";
		setquest 18136;
		delquest 18135;
		close2;
		//showevent 0, 3, "ミリアム#ep19_dq_victim";	// 2769: 48, 252
		//showevent 0, 3, "ミリアム#ep19miriam06";	// 2773: 260, 180
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "遭難された方々は、";
	mes "ある程度、安静にしてから";
	mes "飛行船で送り届ける予定です。";
	mes "必要な品があれば、買って参りますよ。";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,25,126,5	script	レイジー#if19msdq	10454,{/* 2789 (cloaking)*/
	unittalk "ここは回ってみた？";
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,29,125,3	script	ユンケア#if19msdq	10455,{/* 2790 (cloaking)*/
	unittalk "寒いけど、空気が新鮮で綺麗ね。";
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,27,126,3	script	ホルル#ep19_dq_dowsing	10461,{/* 2791 (cloaking)*/
	function EXP_SEPFIX;

	if(EP19_1QUE < 100)
		end;
	if(checkquest(17650)) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "冒険者、ちょっと時間を作ってくれるか？";
		next;
		menu "どうかしましたか？",-;
		mes "[ホルル]";
		mes "蛇の巣の奥に立てこもったルガンたちが、";
		mes "別の出入り口を掘って";
		mes "脱出するかもしれない。";
		mes "それに備えて、";
		mes "蛇の巣と周囲に新しい穴を";
		mes "作られていないか、監視する必要がある。";
		next;
		menu "そうですね",-;
		mes "[ホルル]";
		mes "それを手伝って欲しい。";
		next;
		if(select("手伝う","今は忙しい") == 2) {
			mes "[ホルル]";
			mes "確かに、今すぐ処理すべきことは";
			mes "他にもたくさんある。";
			mes "当分の間は皆忙しいだろうし、";
			mes "解っているよ。";
			next;
			mes "[ホルル]";
			mes "監視については、";
			mes "いったん私たちの方でやるから、";
			mes "手が空いてからでもいいから";
			mes "手伝ってくれたら助かる。";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		}
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "喜んで承諾してくれてありがとう。";
		mes "では、時間が惜しいから";
		mes "すぐに監視方法を議論しよう。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ひとまず、蛇の巣の内部の監視は";
		mes "我々アーウィンが現地で行うとして、";
		mes "既に現地に担当を配置している。";
		mes "次に、蛇の巣の周囲の地域に";
		mes "新しい穴が作られていないかを";
		mes "監視する問題だが……。";
		next;
		mes "[ホルル]";
		mes "既に我々が";
		mes "蛇の巣から地上までの地盤が弱い場所を";
		mes "何カ所か洗い上げて整理してある。";
		mes "脱出口を掘るなら恐らく";
		mes "ここに掘るだろうという場所だ。";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "そうですか。すごいですね。",-;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "それほどでもない。";
		next;
		mes "[ホルル]";
		mes "それでだ。";
		mes "そこを監視しなくちゃならないんだが、";
		mes "他の作業もあって人が足りなくて、";
		mes "困っていたんだ。";
		mes "それで、冒険者に";
		mes "手伝ってほしいってわけだ。";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "そこを一度回ってくればいいですか？",-;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "否、そこで^0000cd常駐^000000する必要がある。";
		next;
		cutin "ep19_iwin06.png", 255;
		emotion 23,"";	// self
		menu "常駐ですか……",-;
		cutin "ep19_iwin08.png", 2;
		mes "[ホルル]";
		mes "ルガンたちがいつ脱出口を掘って";
		mes "抜け出してくるか分からない。";
		mes "監視を常駐させない訳には";
		mes "いかないだろう？";
		cloakoffnpc "レイジー#if19msdq";
		cloakoffnpc "ユンケア#if19msdq";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes strcharinfo(0)+"！！";
		mes "ここにいたか。";
		mes "監視任務に出ると聞いて";
		mes "役に立つため来たよ！";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "ねえ、今、";
		mes "脱出口が掘られる可能性がある場所に";
		mes "常駐しながら監視するって言った？";
		mes "この寒さの中で？";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "私たちは寒さに強いから大丈夫だ。";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "ここに住んでる人たちは";
		mes "みんなおかしい。";
		mes "これが寒くないっていうの？";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "ユンケアサマこそ、";
		mes "そんな薄着で何を言ってるの？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "私は当然、";
		mes "発熱装置を作って装備したんだよ。";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "ひゅ～！";
		mes "うちのユンケアサマは";
		mes "とっても有能だぜ。";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "そういうお前は？";
		mes "折角厚着しておいて";
		mes "どうして前は開けてるの？";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "あぁ、これ？";
		mes "私って体温がちょっと高い上に、";
		mes "息苦しいのは苦手だからね。";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "実はこれぐらいの天気だと";
		mes "こんなの着なくても大丈夫だけど、";
		mes "見る人の方が寒く感じるから";
		mes "着込んだんだよ。";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "私がこんな天気にこの場所で";
		mes "普段の観光客の姿でいたら";
		mes "見る人たちの気分が寒くならない？";
		next;
		menu "ちょっと困りますよね。",-;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "だろ？";
		mes "私は他人の眼球の温度まで配慮して";
		mes "息苦しいのを我慢してまでも";
		mes "着込んでたんだよ。";
		mes "私はそれくらい気遣いに溢れる人さ。";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "わ、わかったから、それ以上喋るな。";
		mes "話を聞くだけで疲れるから……。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "ところで、お前は必要もないのに";
		mes "どうして私に付いて来たんだ？";
		mes "逃げはしないって。";
		mes "どうせあの結界を通れやしないんだから。";
		mes "逃げ出すとしても今じゃない。";
		mes "監視はしなくていいよ。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "なに言ってるの、";
		mes "当然見物しに来たんだぜ。";
		mes "そういうユンケアサマこそ何で来たの？";
		mes "私が渡すって言ったじゃん？";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "……日光を浴びに。";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "セネキオガンド……";
		mes "『健やかな成長』なんて";
		mes "花言葉の名前までつけてたんだ。";
		mes strcharinfo(0)+"のことが、";
		mes "気になって見に来たんじゃないの？";
		next;
		mes "[レイジー]";
		mes "それとも、花言葉は";
		mes "もう一つの方の意味だった？";
		next;
		cutin "ep19_juncea02.png", 2;
		emotion 6,"ユンケア#if19msdq";
		mes "[ユンケア]";
		mes "日・光・を・浴・び・に！";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "あぁ、そうだ。";
		mes "ユンケアサマは陽光が必要そうだね。";
		mes "あの穴の中でどれほど長くいたの？";
		mes "誰かこの方に陽光くれませんか？";
		next;
		cutin "ep19_juncea03.png", 2;
		emotion 7,"ユンケア#if19msdq";
		mes "[ユンケア]";
		mes "……。";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "ところで、どうして";
		mes "みんなここに集まって来たんだ？";
		mes "監視を手伝いに来たのか？";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "あぁ、そうだ。";
		mes "ここのユンケアサマが";
		mes "監視の役に立ちそうな物を";
		mes "作ったんだ。";
		mes "それを渡しにきたってわけ。";
		mes "さぁ、ここからは専門家が説明して。";
		next;
		mes "[レイジー]";
		mes "あそこにいる人たちは";
		mes "全員科学など知らない人たちだからな、";
		mes "今日生まれた新生児にも分かるように";
		mes "やさしく説明を頼むよ。";
		mes "おぎゃー。";
		next;
		cutin "ep19_juncea03.png", 2;
		emotion 7,"ユンケア#if19msdq";
		mes "[ユンケア]";
		mes "もう……ほんとうにやだ……";
		mes "こいつ……。";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "ルガンたちの巣に";
		mes "魔力があまり残っていなかったって、";
		mes "あなたに教えたことは覚えてる？";
		mes "それを逆に利用する装置を作ったわ。";
		next;
		mes "[ユンケア]";
		mes "ルガンの持つ固有の魔力波長だけを";
		mes "感知するものなんだけど、";
		mes "それをそこら辺に埋めておくの。";
		mes "ルガンが装置の近くに現れたら";
		mes "その魔力波長を補足して";
		mes "こちらへ信号を送ってくれる。";
		next;
		mes "[ユンケア]";
		mes "埋めた場所の座標が分かるから、";
		mes "近くで待機していた人たちが";
		mes "即座に対応できるはずよ。";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "これをルガンが現れそうな場所に";
		mes "埋めたらいいということ？";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "そう。しかし欠点がある。";
		mes "凄く些細なことだが？";
		mes "バッテリーの有効期間が約一日しかない。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "この寒さでそこまでもつのは、";
		mes "物凄い技術らしいよ。";
		mes "ユンケアサマがそう言った。";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[ユンケア]";
		mes "……。";
		next;
		switch(select("すごい！","毎日交換が必要ということですね？")) {
		case 1:
			cutin "ep19_juncea02.png", 2;
			mes "[ユンケア]";
			mes "……！";
			mes "ありがとう……。";
			break;
		case 2:
			cutin "ep19_juncea01.png", 2;
			mes "[ユンケア]";
			mes "そういうこと。";
			break;
		}
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "24時間同じ場所に待機して";
		mes "監視することに比べれば、";
		mes "毎日交換することなんて些細な事さ。";
		mes "ありがとう。ものすごく助かるよ。";
		mes "お陰で監視に使う予定だった人員は、";
		mes "他のところへ投入できそう。";
		next;
		menu "まるで貝殻みたいな形ですね",-;
		cutin "ep19_juncea01.png", 2;
		mes "[ユンケア]";
		mes "そうしないと近くの生物たちの";
		mes "興味を引いてしまうからな。";
		mes "そこも考慮した。";
		mes "因みに名前は私が付けたんじゃないぞ。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "名前は私が付けました！";
		mes "^0000cd超強力触角^000000！";
		mes "本当にすごく直感的じゃない？";
		mes "誰でも聞けばすぐわかるように";
		mes "すごく考えてこれにしたんだ。";
		next;
		switch(select("センスが酷い……","素晴らしい")) {
		case 1:
			cutin "ep19_juncea01.png", 2;
			mes "[ユンケア]";
			mes "気が合うわね、"+strcharinfo(0)+"。";
			mes "同感よ。";
			next;
			cutin "ep19_iwin06.png", 1;
			mes "[ホルル]";
			mes "あんたは名付け親にはならないほうが";
			mes "よさそうだな。";
			next;
			cutin "ep19_leizi01.png", 0;
			mes "[レイジー]";
			mes "ふん！";
			mes "ユンケアサマならHSF-001みたいな";
			mes "名前を付けただろ！！";
			break;
		case 2:
			cutin "ep19_juncea01.png", 2;
			mes "[ユンケア]";
			mes strcharinfo(0)+"……！？";
			break;
		}
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "とにかく、";
		mes "助けてくれて本当にありがとう。";
		mes "隊員たちで手分けして早く埋めよう。";
		mes "冒険者は^0000cd6カ所^000000を頼む。";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "分かりました",-;
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "では、<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>と";
		mes "<URL>凍て付いた鱗の氷河<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>の";
		mes "地図にメモをしておいたから、";
		mes "その場所にこれを埋めてきてくれ。";
		mes "両方ルガンたちが頻繁に現れる場所だ。";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "いってらっしゃい！！";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[ユンケア]";
		mes "き、気を付けていきなさい。";
		setquest 17650;
		compquest 17650;
		close2;
		showevent 0, 3, "ホルル#ep19_dq_dowsing";	// 2777: 27, 126
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(checkitemblank() < 2) {
		cutin "ep19_leizi01.png", 255;
		mes "‐荷物をこれ以上持てません";
		mes "　荷物に2個以上の空きを";
		mes "　作ってください‐";
		close2;
		cutin "kafra_01.bmp", 255;
		end;
	}
	if(checkquest(17650)&8) {
		cutin "ep19_iwin06.png", 1;
		mes "[ホルル]";
		mes "それじゃあ、";
		mes "超強力触角を交換してきてくれるか？";
		next;
		if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の平原)") == 2) {
			mes "[ミミルガンド]";
			mes "現地まで送ってやろう。";
			mes "若き司祭よ、";
			mes "しっかりと仕事をこなすんだぞ。";
			close2;
			//cutin "kafra_01.bmp", 255;
			warp '@map$, 113, 12;
			end;
		}
		mes "クエストの受注や報告、";
		mes "取り消しが可能です。";
		next;
		set '@str$," 地上からの隠れ処探し";
		set '@flag,( (countitem(1000707) >= 5)? 1: 0) + ( (checkquest(18139)&4)? 2: 0);
		if('@flag < 3) {
			if('@flag) {
				set '@str$,
					"[^ff0000納品"+( ('@flag&1)? "○": "×")+
					"・討伐"+( ('@flag&2)? "○": "×")+
					"^000000]" +'@str$;
			}
			else
				set '@str$,"[^ff0000挑戦中^000000]" +'@str$;
			set '@menu,select("全て報告する",'@str$,"全て受注する","全て破棄する");
			// menuの入れ替え
			setarray '@selecter[1],2,3,1,4;
			set '@menu,'@selecter['@menu];
		}
		else {
			if('@flag == 3)
				set '@str$,"[^ff0000報告可^000000]" +'@str$;
			else if(!checkquest(18140) || checkquest(18140)&2)
				set '@str$,"[受注可]" +'@str$;
			else if(checkquest(18140))
				set '@str$,"[^888888時間制限中^000000]" +'@str$;
			set '@menu,select("全て受注する","全て報告する",'@str$,"全て破棄する");
		}
		switch('@menu) {
		case 1:
			mes "^ff0000[インフォメーション]";
			mes "現在、受注可能な表示のクエストを";
			mes "全て一括で受注することが出来ます。";
			mes "クエストの一括受注を行いますか？^000000";
			next;
			if(select("一括受注を行う","やめる") == 2) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			setarray '@q_name$,"地上からの隠れ処探し";
			setarray '@questlist,17651;
			setarray '@coollist,17662;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: クエストを受けていない、かつクールタイムがついてないかクールタイム明けなら受注
				if( checkquest('@questlist['@i]) == 0 && (checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@setquest[getarraysize('@setquest)],'@i;
			}
			if(getarraysize('@setquest) == 0) {
				mes "[インフォメーション]";
				mes "受注可能なクエストが存在しません。";
				close;
			}
			mes "<<B>クエスト</B>>";
			for(set '@i,0; '@i < getarraysize('@setquest); set '@i,'@i+1) {
				setquest '@questlist['@setquest['@i]];
				mes "「^ff0000" +'@q_name$['@setquest['@i]]+ "^000000」";
			}
			mes "を受注しました。";
			close;
		case 2:
			mes "^ff0000[インフォメーション]";
			mes "クエスト達成の条件が";
			mes "モンスター討伐・アイテム納品の";
			mes "いずれか1つの場合、";
			mes "どちらの条件も満たしている場合は";
			mes "モンスター討伐を優先して報告します。";
			mes "この場合、アイテムは納品されません。";
			next;
			mes "[インフォメーション]";
			mes "報告可能なクエストを全て一括で";
			mes "報告することが出来ます。";
			mes "クエストの一括報告を行いますか？";
			next;
			if(select("一括報告を行う","やめる") == 2) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			setarray '@q_name$,"特別な生存方式";
			setarray '@questlist,17651;
			setarray '@coollist,17662;
			setarray '@gainlist,1000608,2;
			setarray '@explist,375000000,275000000;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: クエストを受けていて討伐済み、かつアイテムリスト設定があるなら持っていれば報告
				if( checkquest('@questlist['@i]) && (checkquest('@questlist['@i])&4) && ('@itemlist['@i*2] == 0 || countitem('@itemlist['@i*2]) >= '@itemlist['@i*2+1]) ) {
					set '@repoquest[getarraysize('@repoquest)],'@i;
					set '@count,'@count + '@itemlist['@i*2+1];
				}
			}
			if(getarraysize('@repoquest) == 0) {
				mes "[インフォメーション]";
				mes "報告可能なクエストが存在しません。";
				close;
			}
			mes "^ff0000[インフォメーション]";
			mes "クエスト達成の条件が";
			mes "モンスター討伐・アイテム納品の";
			mes "いずれか1つの場合、";
			mes "どちらの条件も満たしている場合は";
			mes "モンスター討伐を優先して報告します。";
			mes "この場合、アイテムは納品されません。";
			next;
			if('@count) {
				mes "<<B>納品アイテム</B>>";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
					mes "アイテム：<ITEM>" +getitemname('@itemlist['@repoquest['@i]*2])+ "<INFO>" +'@itemlist['@repoquest['@i]*2]+ "</INFO></ITEM>　" +'@itemlist['@repoquest['@i]*2+1]+ "個";
				}
				mes "こちらのアイテムを納品しても";
				mes "よろしいですか？";
				next;
				if(select("やめる","一括報告に進む") == 1) {
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close;
				}
			}
			mes "[インフォメーション]";
			mes "報告可能なクエストを全て一括で";
			mes "報告することが出来ます。";
			mes "クエストの一括報告を行いますか？";
			next;
			if(select("一括報告を行う","やめる") == 2) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			mes "<<B>クエスト</B>>";
			for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
				delitem '@itemlist['@repoquest['@i]*2],'@itemlist['@repoquest['@i]*2+1];
				delquest '@questlist['@repoquest['@i]];
				setquest '@coollist['@repoquest['@i]];
				getitem '@gainlist['@repoquest['@i]*2],'@gainlist['@repoquest['@i]*2+1];
				set '@count2,'@count2 + '@gainlist['@repoquest['@i]*2+1];
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp '@explist['@repoquest['@i]*2],0,0;
					set '@baseexp,'@baseexp + '@explist['@repoquest['@i]*2];
				}
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp 0,'@explist['@repoquest['@i]*2+1],0;
					set '@jobexp,'@jobexp + '@explist['@repoquest['@i]*2+1];
				}
				mes "「^ff0000" +'@q_name$['@repoquest['@i]]+ "^000000」";
			}
			mes "の報告が完了しました。";
			// TODO:EXP略表記
			if('@baseexp) {
				next;
				set '@exp$,EXP_SEPFIX('@baseexp);
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp " +'@exp$;
				mes "( " +'@baseexp+" )";
				mes "※BaseExpを受け取りました。";
			}
			if('@jobexp) {
				next;
				set '@exp$,EXP_SEPFIX('@jobexp);
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp " +'@exp$;
				mes "( " +'@jobexp+" )";
				mes "※JobExpを受け取りました。";
			}
			if('@count2) {
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1)
					mes "アイテム：<ITEM>" +getitemname('@gainlist['@repoquest['@i]*2])+ "<INFO>" +'@gainlist['@repoquest['@i]*2]+ "</INFO></ITEM>　" +'@gainlist['@repoquest['@i]*2+1]+ "個";
				mes "を獲得しました。";
			}
			close;
		case 3:
			if(checkquest(18139)) {
				if('@flag < 3) {
					mes "[ミミルガンド]";
					mes "汚らわしい<URL>原始ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>と";
					mes "<URL>最下級ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>から";
					mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
					mes "5個回収してきなさい。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000特別な生存方式^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 2) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close;
					}
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000地上からの隠れ処探し^000000」";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 7.5G ( 7500000000 )";
				mes "※375000000を20回受け取ります。";
				mes "JobExp 5.5G ( 5500000000 )";
				mes "※275000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000地上からの隠れ処探し^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close;
				}
				delquest 17651;
				delquest 17661;
				setquest 17662;
				getitem 1000608,2;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 375000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,275000000,0;
				cutin "ep19_iwin06.png", 2;
				mes "[ホルル]";
				mes "冒険者、来たか。";
				mes "ご苦労様。作業は順調だったか？";
				mes "今日はもう休んでくれ。";
				mes "明日また作業を頼む。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 7.5G";
				mes "( 7500000000 )";
				mes "※375000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 5.5G";
				mes "( 5500000000 )";
				mes "※275000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(17662)) {
				if(!(checkquest(17662)&2)) {
					cutin "ep19_iwin06.png", 2;
					mes "[ホルル]";
					mes "冒険者、休めたか？";
					mes "超強力触角を埋める作業は、";
					mes "心配しなくてもいい。";
					mes "まだバッテリーが放電されるまで";
					mes "時間があるからもっと休んでくれ。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000地上からの隠れ処探し^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			cutin "ep19_iwin06.png", 2;
			mes "[ホルル]";
			mes "超強力触角のバッテリーが";
			mes "放電される前に交替したい。";
			next;
			mes "[ホルル]";
			mes "<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2_</INFO></URL>と";
			mes "<URL>凍て付いた鱗の氷河<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>の";
			mes "それぞれ3カ所ずつに、";
			mes "<ITEM>[超強力触角]<INFO>1000842</INFO></ITEM>を埋めてきてほしい。";
			mes "手伝ってくれるか？";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000地上からの隠れ処探し^000000」";
			mes "を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				cutin "ep19_iwin06.png", 2;
				mes "[ホルル]";
				mes "手伝いの中断か？";
				mes "わかった。";
				mes "時間ができたら、よろしく頼む。";
				next;
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 17651;
			getitem 1000842,6;
			if(checkquest(17662)&2)
				delquest 17662;
			cutin "ep19_iwin06.png", 2;
			mes "[ホルル]";
			mes "よろしく、頼む。";
			next;
			//showevent 0, 2, "ホルル#ep19_dq_dowsing";	// 2777: 27, 126
			mes "<<B>クエスト</B>>";
			mes "「^ff0000地上からの隠れ処探し^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 4:
			mes "^ff0000[インフォメーション]";
			mes "現在、挑戦中表示のクエストを";
			mes "全て一括で破棄することが出来ます。";
			mes "報告可、時間制限中のクエストは";
			mes "破棄の処理が行われません。";
			mes "クエストの一括破棄を行いますか？^000000";
			next;
			if(select("やめる","全て破棄する") == 1) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			setarray '@q_name$,"地上からの隠れ処探し";
			setarray '@questlist,17651;
			setarray '@coollist,17662;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: クエストを受けていて討伐完了していない、かつクールタイムがついてないかクールタイム明けなら破棄
				if( checkquest('@questlist['@i]) && !(checkquest('@questlist['@i]&4)) &&
					(checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@delquest[getarraysize('@delquest)],'@i;
			}
			if(getarraysize('@delquest) == 0) {
				mes "[インフォメーション]";
				mes "破棄出来るクエストが存在しません。";
				close;
			}
			mes "<<B>クエスト</B>>";
			for(set '@i,0; '@i < getarraysize('@delquest); set '@i,'@i+1) {
				delquest '@questlist['@delquest['@i]];
				mes "「^ff0000" +'@q_name$['@delquest['@i]]+ "^000000」";
			}
			mes "を破棄しました。";
			close;
		}
	}
	function EXP_SEPFIX {
		set '@num$,getarg(0);
		set '@len,getstrlen('@num$);
		set '@type,('@len >= 10)? 0: (('@len >= 7)? 1: (('@len >= 4)? 2: 3) );
		setarray '@sep,9,6,3,0;
		setarray '@c$,"G","M","K","";
		for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
			if(substr('@num$,-1) == "0") {
				set '@num$,substr('@num$,0,-1);
			}
			else
				break;
		}
		return substr('@num$,0,('@len - '@sep['@type])) +"."+ substr('@num$,('@len - '@sep['@type])) +'@c$['@type];
	}

OnInit:
	cloakonnpc;
	end;
}

jor_back2_.gat,222,123,7	script	指示された場所#e19ms00	10432,{/* 6043 */
	for(set '@i,0; '@i < 6; set '@i,'@i+1) {
		if(checkquest(17652+'@i))
			'@j++;
	}
	if(checkquest(17661)) {
		mes "‐6カ所すべてに超強力触覚を埋めた。";
		mes "　ホルルの元へもどろう‐";
		close;
	}
	set '@num,substr(strnpcinfo(0),-1);
	set '@quest,17652+'@num;
	if(checkquest('@quest)) {
		mes "‐超強力触覚を埋め終えた。";
		mes "　他の場所に行こう‐";
		close;
	}
	mes "‐指示された場所はここのようだ。";
	mes "　超強力触覚を埋めよう‐";
	next;
	misceffect 101;
	progressbar 1;	//color=0xffff00
	misceffect 18;
	next;
	setquest '@quest;
	compquest '@quest;
	delitem 1000842,1;
	//showevent 9999, 0, "指示された場所#e19ms01";	// 6043: 222, 123
	if('@j == 5) {
		//showevent 9999, 0, "指示された場所#e19ms02";	// 6044: 49, 175
		//@showevent 0, 3;	// 6045: 308, 99
		setquest 17661;
		setquest 17652;
		delquest 17652;
		setquest 17653;
		delquest 17653;
		setquest 17654;
		delquest 17654;
		setquest 17655;
		delquest 17655;
		setquest 17656;
		delquest 17656;
		setquest 17657;
		delquest 17657;
		mes "‐6カ所すべてに超強力触覚を埋めた。";
		mes "　ホルルの元へもどろう‐";
		close;
	}
	mes "‐超強力触覚を埋め終えた。";
	mes "　他の場所に行こう‐";
	close;
}

jor_back2_.gat,49,175,7		duplicate(指示された場所#e19ms00)	指示された場所#e19ms01	10432	/* 6044 */
jor_back2_.gat,308,99,7		duplicate(指示された場所#e19ms00)	指示された場所#e19ms02	10432	/* 6045 */
jor_back3_.gat,152,359,7	duplicate(指示された場所#e19ms00)	指示された場所#e19ms03	10432	/* 6046 */
jor_back3_.gat,328,277,7	duplicate(指示された場所#e19ms00)	指示された場所#e19ms04	10432	/* 6047 */
jor_back3_.gat,128,138,7	duplicate(指示された場所#e19ms00)	指示された場所#e19ms05	10432	/* 6048 */

jor_nest.gat,34,79,5	script	ミミルガンド#ep19r	10473,{/* 2792 */
	function EXP_SEPFIX;

	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ミミルガンド]";
		mes "この生意気な人間は何だ？";
		mes "戻って働け！";
		close2;
		misceffect 1,"";	// self
		end;
	}
	if(EP19_1QUE < 22) {
		mes "[ミミルガンド]";
		mes "ふむ。";
		mes "不信者たちは知らないだろう？";
		mes "ヨルムンガンド様の恩恵を……。";
		next;
		mes "^e6328c‐このクエストを進行するには";
		mes "^e6328c　以下の条件を満たす必要があります‐";
		mes "^e6328c　・BaseLv220以上";
		mes "^e6328c　・クエスト「説話の地」を途中までクリア";
		mes "　^000000";
		mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
	if(checkquest(18138)&8) {
		mes "[ミミルガンド]";
		mes "若き司祭よ。";
		mes "今日も教団のために尽くしてみないか？";
		mes "神聖なる労働の義務を";
		mes "果たせという意味だ。";
		set '@str$,"ダンジョンに移動する(蛇神の温もり 01" +((EP19_1QUE < 68)? "(クエスト)": "")+ ")";
		set '@map$,"jor_dun01" +((EP19_1QUE < 68)? "": "_")+ ".gat";
		next;
		if(select("クエストの受注や報告を行う",'@str$) == 2) {
			mes "[ミミルガンド]";
			mes "現地まで送ってやろう。";
			mes "若き司祭よ、";
			mes "しっかりと仕事をこなすんだぞ。";
			close2;
			//cutin "kafra_01.bmp", 255;
			warp '@map$, 113, 12;
			end;
		}
		mes "クエストの受注や報告、";
		mes "取り消しが可能です。";
		next;
		set '@str$," 特別な生存方式";
		set '@flag,( (countitem(1000707) >= 5)? 1: 0) + ( (checkquest(18139)&4)? 2: 0);
		if('@flag < 3) {
			if('@flag) {
				set '@str$,
					"[^ff0000納品"+( ('@flag&1)? "○": "×")+
					"・討伐"+( ('@flag&2)? "○": "×")+
					"^000000]" +'@str$;
			}
			else
				set '@str$,"[^ff0000挑戦中^000000]" +'@str$;
			set '@menu,select("全て報告する",'@str$,"全て受注する","全て破棄する");
			// menuの入れ替え
			setarray '@selecter[1],2,3,1,4;
			set '@menu,'@selecter['@menu];
		}
		else {
			if('@flag == 3)
				set '@str$,"[^ff0000報告可^000000]" +'@str$;
			else if(!checkquest(18140) || checkquest(18140)&2)
				set '@str$,"[受注可]" +'@str$;
			else if(checkquest(18140))
				set '@str$,"[^888888時間制限中^000000]" +'@str$;
			set '@menu,select("全て受注する","全て報告する",'@str$,"全て破棄する");
		}
		switch('@menu) {
		case 1:
			mes "^ff0000[インフォメーション]";
			mes "現在、受注可能な表示のクエストを";
			mes "全て一括で受注することが出来ます。";
			mes "クエストの一括受注を行いますか？^000000";
			next;
			if(select("一括受注を行う","やめる") == 2) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			setarray '@q_name$,"特別な生存方式";
			setarray '@questlist,18139;
			setarray '@coollist,18140;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: クエストを受けていない、かつクールタイムがついてないかクールタイム明けなら受注
				if( checkquest('@questlist['@i]) == 0 && (checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@setquest[getarraysize('@setquest)],'@i;
			}
			if(getarraysize('@setquest) == 0) {
				mes "[インフォメーション]";
				mes "受注可能なクエストが存在しません。";
				close;
			}
			mes "<<B>クエスト</B>>";
			for(set '@i,0; '@i < getarraysize('@setquest); set '@i,'@i+1) {
				setquest '@questlist['@setquest['@i]];
				mes "「^ff0000" +'@q_name$['@setquest['@i]]+ "^000000」";
			}
			mes "を受注しました。";
			close;
		case 2:
			mes "^ff0000[インフォメーション]";
			mes "クエスト達成の条件が";
			mes "モンスター討伐・アイテム納品の";
			mes "いずれか1つの場合、";
			mes "どちらの条件も満たしている場合は";
			mes "モンスター討伐を優先して報告します。";
			mes "この場合、アイテムは納品されません。";
			next;
			mes "[インフォメーション]";
			mes "報告可能なクエストを全て一括で";
			mes "報告することが出来ます。";
			mes "クエストの一括報告を行いますか？";
			next;
			if(select("一括報告を行う","やめる") == 2) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			setarray '@q_name$,"特別な生存方式";
			setarray '@questlist,18139;
			setarray '@coollist,18140;
			setarray '@itemlist,1000707,5;
			setarray '@gainlist,1000608,3;
			setarray '@explist,410000000,310000000;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: クエストを受けていて討伐済み、かつアイテムリスト設定があるなら持っていれば報告
				if( checkquest('@questlist['@i]) && (checkquest('@questlist['@i])&4) && ('@itemlist['@i*2] == 0 || countitem('@itemlist['@i*2]) >= '@itemlist['@i*2+1]) ) {
					set '@repoquest[getarraysize('@repoquest)],'@i;
					set '@count,'@count + '@itemlist['@i*2+1];
				}
			}
			if(getarraysize('@repoquest) == 0) {
				mes "[インフォメーション]";
				mes "報告可能なクエストが存在しません。";
				close;
			}
			mes "^ff0000[インフォメーション]";
			mes "クエスト達成の条件が";
			mes "モンスター討伐・アイテム納品の";
			mes "いずれか1つの場合、";
			mes "どちらの条件も満たしている場合は";
			mes "モンスター討伐を優先して報告します。";
			mes "この場合、アイテムは納品されません。";
			next;
			if('@count) {
				mes "<<B>納品アイテム</B>>";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
					mes "アイテム：<ITEM>" +getitemname('@itemlist['@repoquest['@i]*2])+ "<INFO>" +'@itemlist['@repoquest['@i]*2]+ "</INFO></ITEM>　" +'@itemlist['@repoquest['@i]*2+1]+ "個";
				}
				mes "こちらのアイテムを納品しても";
				mes "よろしいですか？";
				next;
				if(select("やめる","一括報告に進む") == 1) {
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close;
				}
			}
			mes "[インフォメーション]";
			mes "報告可能なクエストを全て一括で";
			mes "報告することが出来ます。";
			mes "クエストの一括報告を行いますか？";
			next;
			if(select("一括報告を行う","やめる") == 2) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			mes "<<B>クエスト</B>>";
			for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
				delitem '@itemlist['@repoquest['@i]*2],'@itemlist['@repoquest['@i]*2+1];
				delquest '@questlist['@repoquest['@i]];
				setquest '@coollist['@repoquest['@i]];
				getitem '@gainlist['@repoquest['@i]*2],'@gainlist['@repoquest['@i]*2+1];
				set '@count2,'@count2 + '@gainlist['@repoquest['@i]*2+1];
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp '@explist['@repoquest['@i]*2],0,0;
					set '@baseexp,'@baseexp + '@explist['@repoquest['@i]*2];
				}
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp 0,'@explist['@repoquest['@i]*2+1],0;
					set '@jobexp,'@jobexp + '@explist['@repoquest['@i]*2+1];
				}
				mes "「^ff0000" +'@q_name$['@repoquest['@i]]+ "^000000」";
			}
			mes "の報告が完了しました。";
			// TODO:EXP略表記
			if('@baseexp) {
				next;
				set '@exp$,EXP_SEPFIX('@baseexp);
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp " +'@exp$;
				mes "( " +'@baseexp+" )";
				mes "※BaseExpを受け取りました。";
			}
			if('@jobexp) {
				next;
				set '@exp$,EXP_SEPFIX('@jobexp);
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp " +'@exp$;
				mes "( " +'@jobexp+" )";
				mes "※JobExpを受け取りました。";
			}
			if('@count2) {
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1)
					mes "アイテム：<ITEM>" +getitemname('@gainlist['@repoquest['@i]*2])+ "<INFO>" +'@gainlist['@repoquest['@i]*2]+ "</INFO></ITEM>　" +'@gainlist['@repoquest['@i]*2+1]+ "個";
				mes "を獲得しました。";
			}
			close;
		case 3:
			if(checkquest(18139)) {
				if('@flag < 3) {
					mes "[ミミルガンド]";
					mes "汚らわしい<URL>原始ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>と";
					mes "<URL>最下級ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>から";
					mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
					mes "5個回収してきなさい。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000特別な生存方式^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 2) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close;
					}
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000特別な生存方式^000000」";
				mes "<内容1>";
				mes "対象：<URL>原始ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>　10体";
				mes "対象：<URL>最下級ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>　10体";
				mes "の討伐と";
				next;
				mes "<内容2>";
				mes "アイテム：<ITEM>ルガンの低級魔力核<INFO>1000707</INFO></ITEM>　5個";
				mes "の納品";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8.2G ( 8200000000 )";
				mes "※410000000を20回受け取ります。";
				mes "JobExp 6.2G ( 6200000000 )";
				mes "※310000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000特別な生存方式^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					// 未調査
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close;
				}
				delitem 1000707,5;
				delquest 18139;
				setquest 18140;
				getitem 1000608,3;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 410000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,310000000,0;
				mes "[ミミルガンド]";
				mes "見事に仕事をやり遂げたみたいだな。";
				mes "こっちに渡しなさい。";
				mes "魔力核は循環させなきゃいけない。";
				next;
				//showevent 9999, 0, "ミミルガンド#ep19r";	// 2778: 34, 79
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8.2G";
				mes "( 8200000000 )";
				mes "※410000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 6.2G";
				mes "( 6200000000 )";
				mes "※310000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
				mes "を獲得しました。";
				close;
			}
			if(checkquest(18140)) {
				if(!(checkquest(18140)&2)) {
					mes "[ミミルガンド]";
					mes "若き司祭よ。お前には";
					mes "他の信徒たちを率いる義務がある。";
					mes "巣の中をゆっくり回りながら、";
					mes "やるべきことを自ら見付けなさい。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000特別な生存方式^000000」";
					mes "は時間制限中です。^000000";
					close;
				}
			}
			mes "[ミミルガンド]";
			mes "汚らわしい<URL>原始ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>と";
			mes "<URL>最下級ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>から";
			mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
			mes "5個回収してきなさい。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000特別な生存方式^000000」";
			mes "<内容1>";
			// ミススペル
			mes "対象：<URL>原始ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>　10体";
			mes "対象：<URL>最下級ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>　10体";
			mes "の討伐と";
			next;
			mes "<内容2>";
			mes "アイテム：<ITEM>ルガンの低級魔力核<INFO>1000707</INFO></ITEM>　5個";
			mes "の納品の";
			mes "両方の達成で報告が可能です。";
			mes "クエストを受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[ミミルガンド]";
				mes "お前の仕事だが仕方がないな。";
				next;
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			setquest 18139;
			delquest 18140;
			//showevent 0, 2, ミミルガンド#ep19r;	// 2792: 34, 79
			mes "[ミミルガンド]";
			mes "さあ、お前の仕事を果たしてくるのだ。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000特別な生存方式^000000」";
			mes "を受注しました。";
			close;
		case 4:
			mes "^ff0000[インフォメーション]";
			mes "現在、挑戦中表示のクエストを";
			mes "全て一括で破棄することが出来ます。";
			mes "報告可、時間制限中のクエストは";
			mes "破棄の処理が行われません。";
			mes "クエストの一括破棄を行いますか？^000000";
			next;
			if(select("やめる","全て破棄する") == 1) {
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close;
			}
			setarray '@q_name$,"特別な生存方式";
			setarray '@questlist,18139;
			setarray '@coollist,18140;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: クエストを受けていて討伐完了していない、かつクールタイムがついてないかクールタイム明けなら破棄
				if( checkquest('@questlist['@i]) && !(checkquest('@questlist['@i]&4)) &&
					(checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@delquest[getarraysize('@delquest)],'@i;
			}
			if(getarraysize('@delquest) == 0) {
				mes "[インフォメーション]";
				mes "破棄出来るクエストが存在しません。";
				close;
			}
			mes "<<B>クエスト</B>>";
			for(set '@i,0; '@i < getarraysize('@delquest); set '@i,'@i+1) {
				delquest '@questlist['@delquest['@i]];
				mes "「^ff0000" +'@q_name$['@delquest['@i]]+ "^000000」";
			}
			mes "を破棄しました。";
			close;
		}
	}
	if(checkquest(18139)) {
		if(!(checkquest(18139) & 4)) {
			mes "[ミミルガンド]";
			mes "罪悪がどこにいるのかって？";
			mes "若き司祭よ、";
			mes "下級孵化場で生まれたと言ったよな？";
			next;
			mes "[ミミルガンド]";
			mes "そこを埋め尽くしている";
			mes "汚らわしい者たちのことを";
			mes "言ってるんだよ。";
			mes "<URL>原始ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>、<URL>最下級ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>たちが";
			mes "罪人であり、ゴミ虫である。";
			next;
			mes "[ミミルガンド]";
			mes "奴らを処分して、";
			mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
			mes "5個回収することが、お前の仕事だ。";
			close;
		}
		if(countitem(1000707) < 5) {
			//showevent 0, 2, ミミルガンド#ep19r;	// 2792: 34, 79
			mes "[ミミルガンド]";
			mes "罪悪とゴミ虫が持つ魔力を";
			mes "回収することも、私たちの仕事なんだ。";
			mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
			mes "5個回収してきなさい。";
			close;
		}
		//showevent 0, 3, ミミルガンド#ep19r;	// 2792: 34, 79
		mes "[ミミルガンド]";
		mes "見事に仕事をやり遂げたみたいだな。";
		mes "こっちに渡しなさい。";
		mes "魔力核は循環させなきゃいけない。";
		next;
		mes "[ミミルガンド]";
		mes "魔力核を吸収すれば、";
		mes "もっと強くなれるんじゃないかって？";
		mes "そういうこともあり得る。";
		mes "実際にあそこに存在しているだろう？";
		next;
		menu "下級ルガンのことですか？",-;
		mes "[ミミルガンド]";
		mes "そう、たまに知能を持つ下級たちがいる。";
		mes "奴らは労働をしながら、";
		mes "罪を洗っているんだよ。";
		next;
		mes "[ミミルガンド]";
		mes "だとしても下級が下級を食べて、";
		mes "中級になる訳ではない。";
		mes "各自、生まれつきの恩恵により";
		mes "器の大きさが異なるのだ。";
		next;
		mes "[ミミルガンド]";
		mes "海に石一つを投げるとして、";
		mes "何か変わると思うかい？";
		mes "しかし、小さい湖に山を削って入れたら、";
		mes "違う結果になるだろう。";
		next;
		mes "[ミミルガンド]";
		mes "魔力を貪る本能だけ残り、";
		mes "お互いを食い荒らした末に";
		mes "器を満たした者がたまに現れる。";
		next;
		mes "[ミミルガンド]";
		mes "しかし、";
		mes "器の大きさが変わることはないんだ。";
		mes "それもまた、";
		mes "生まれつきの恩恵の差であろう。";
		next;
		mes "[ミミルガンド]";
		mes "しかし、ラスガンド様は、";
		mes "そんな汚らわしい者たちまで";
		mes "救済する方法を";
		mes "講じていらっしゃるのかもしれない。";
		mes "後天的に恩恵の大きさを育てることが";
		mes "できたら、それ以上に望むことはない。";
		next;
		menu "魔力核は何に使われますか？",-;
		mes "[ミミルガンド]";
		mes "生命を持つ者が活動するには、";
		mes "何が必要なんだ？";
		mes "そう、食料が必要になる。";
		next;
		mes "[ミミルガンド]";
		mes "私たちは、これを食料にしているんだ。";
		mes "一部はラスガンド様の研究に使われ、";
		mes "一部は消費した魔力を回復するのに";
		mes "使われる。";
		next;
		mes "[ミミルガンド]";
		mes "お前も魔力を消費したと感じたら、";
		mes "魔力核を吸収しなさい。";
		mes "楽になる。";
		next;
		if(checkitemblank() == 0) {
			// 未調査
			close;
		}
		if(countitem(1000707) < 5) {
			// 再チェック？未調査
			close;
		}
		delitem 1000707,5;
		setquest 18140;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		delquest 18139;
		setquest 18138;
		compquest 18138;
		getitem 1000608,3;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		for(set '@i,0; '@i < 20; set '@i,'@i+1) {
			getexp 410000000,0,0;
			getexp 0,310000000,0;
		}
		mes "[ミミルガンド]";
		mes "とにかく、";
		mes "私の仕事を手伝ってくれてありがとう。";
		mes "これもまた";
		mes "司祭であるお前のやることである。";
		mes "ご苦労さま。";
		close;
		//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
		//showevent 0, 1, ルガン主教#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, ミミルガンド#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, シャリャラ#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
		//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
		end;
	}
	mes "[ミミルガンド]";
	mes "ほう、";
	mes "お前が今回新しく生まれた司祭級か？";
	mes "こちらに来て座りなさい。";
	mes "話を聞かせてあげよう。";
	next;
	mes "[ミミルガンド]";
	mes "過酷な環境では、";
	mes "特別な生存方式があるものなんだ。";
	mes "私たちは";
	mes "偉大なヨルムンガンド様の魔力を継ぐ者。";
	next;
	mes "[ミミルガンド]";
	mes "ヨルムンガンド様の魔力、";
	mes "それが何を意味するのか知っているか？";
	next;
	menu "私たちの生命の源！",-;
	mes "[ミミルガンド]";
	mes "よく聞きなさい。";
	mes "かつて祖先たちは";
	mes "ヨルムンガンド様の魔力をもってして、";
	mes "あのミッドガルド大陸を支配した。";
	next;
	mes "[ミミルガンド]";
	mes "しかし、邪な人間たちのもがきにより、";
	mes "ヨルムンガンド様は封印されてしまった。";
	mes "だが、その瞬間でさえヨルムンガンド様は";
	mes "私たちの為に、";
	mes "自らの体を残してくださったのだ。";
	next;
	mes "[ミミルガンド]";
	mes "そう。それこそがイスガルドである。";
	mes "私たちはヨルムンガンド様が保護した";
	mes "最後のルガンである";
	mes "ラスガンド様の血で根を下ろし、";
	mes "ヨルムンガンド様の残した体の魔力で";
	mes "成長する。";
	next;
	mes "[ミミルガンド]";
	mes "しかし、ヨルムンガンド様が";
	mes "体を差し出してまでくださった恩恵を";
	mes "正しく受け止めない";
	mes "ゴミ虫みたいな者たちも、";
	mes "生まれてしまった。";
	mes "それが何か解るか？";
	next;
	menu "下級ルガンたち？",-;
	mes "[ミミルガンド]";
	mes "お、流石は司祭級である。";
	mes "正しく理解しているじゃないか。";
	mes "そう、";
	mes "魔力の恩恵を";
	mes "正しく受け止めない者たちは、";
	mes "ゴミ虫であり、罪人である。";
	next;
	mes "[ミミルガンド]";
	mes "奴らは醜悪にも、";
	mes "お互いの魔力を貪り、";
	mes "より上級な魔力を得ようとする。";
	mes "本来、魔力への渇望は";
	mes "全てのルガンが持っているものだが、";
	mes "奴らには見境が無いのだよ。";
	next;
	mes "[ミミルガンド]";
	mes "あんな低級な奴らが、";
	mes "大切な魔力を貪ることを";
	mes "これ以上見てはいられない。";
	mes "そこでお前に大事な任務を一つ任せよう。";
	next;
	mes "[ミミルガンド]";
	mes "罪人とゴミ虫が持つ";
	mes "ヨルムンガンド様の魔力を";
	mes "回収する仕事だ。";
	next;
	mes "[ミミルガンド]";
	mes "ヨルムンガンド様の残した魔力は";
	mes "限られている。";
	mes "あんな奴らが持っていていい魔力では";
	mes "ないんだよ。";
	next;
	mes "[ミミルガンド]";
	mes "魔力は限られており、";
	mes "私たちが精進し、";
	mes "ヨルムンガンド様の意思、";
	mes "ラスガンド様の意志を広めるには、";
	mes "一滴の魔力も浪費できない。";
	next;
	mes "[ミミルガンド]";
	mes "罪人が持って行った魔力を回収して、";
	mes "ルガンの未来の為に使うこと。";
	mes "それが今の私たちの";
	mes "やるべきことなんだよ。";
	next;
	mes "[ミミルガンド]";
	mes "そして、";
	mes "お前のように恩恵を受けて生まれた";
	mes "子供たちのためにも、";
	mes "魔力を回収しなければならない。";
	next;
	menu "同族殺しではない？",-;
	mes "[ミミルガンド]";
	mes "あんなゴミ虫みたいな者たちを、";
	mes "同族と見做すことはない。";
	mes "奴らは罪悪だ。";
	mes "奴らはまた生贄だ。";
	mes "恩恵を受けていない罪悪人から、";
	mes "魔力を回収することは当たり前なこと。";
	next;
	mes "[ミミルガンド]";
	mes "それが氷の地に囚われた";
	mes "私たちの生存方式である。";
	mes "だから若き司祭よ。";
	mes "行って罪人たちを処断し、";
	mes "奴らの魔力を持って来い。";
	setquest 18139;
	close2;
	//showevent 9999, 0, ルガン司祭#e19ms31;	// 2578: 185, 49
	//showevent 9999, 0, ルガン主教#e19ms41;	// 2584: 196, 202
	//showevent 9999, 0, ルガン主教#e19ms51;	// 2587: 115, 187
	//showevent 0, 1, ルガン主教#e19ms61;	// 2590: 53, 244
	//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
	//showevent 9999, 0, ユンケア#e19ms71;	// 2595: 22, 141
	//showevent 9999, 0, バゴット#e19ms71;	// 2596: 26, 142
	//showevent 9999, 0, ルガン司祭#e19ms81;	// 2600: 23, 58
	//showevent 9999, 0, レイジー#e19ms71;	// 2606: 87, 164
	//showevent 9999, 0, レイジー#e19ms91;	// 2608: 24, 252
	//showevent 9999, 0, レイジー#ep19re1;	// 2661: 127, 207
	//showevent 9999, 0, 書類の山#ep19re1;	// 2662: 19, 142
	//showevent 9999, 0, 書類の山#ep19re2;	// 2664: 21, 195
	//showevent 9999, 0, バゴットの研究室#warp_e;	// 2666: 66, 260
	//showevent 9999, 0, ルガン警備兵#ep19re1;	// 2672: 173, 177
	//showevent 9999, 0, 書類の山#ep19re5;	// 2674: 181, 173
	//showevent 9999, 0, ユンケア#ep19re1;	// 2675: 31, 140
	//showevent 9999, 0, 見知らぬ箱#ep19re1;	// 2682: 19, 190
	//showevent 9999, 0, 空の試験管#ep19re1;	// 2683: 20, 194
	//showevent 9999, 0, ルガン#ep19re1;	// 2684: 24, 185
	//showevent 0, 2, ミミルガンド#ep19r;	// 2792: 34, 79
	//showevent 9999, 0, シャリャラ#ep19iwin07;	// 2824: 273, 23
	//showevent 9999, 0, ロープ#whl;	// 2958: 22, 255
	//showevent 9999, 0, アロロン#ep19re2;	// 2960: 63, 257
	cutin "ep18_miriam_01.png", 255;
	end;

	function EXP_SEPFIX {
		set '@num$,getarg(0);
		set '@len,getstrlen('@num$);
		set '@type,('@len >= 10)? 0: (('@len >= 7)? 1: (('@len >= 4)? 2: 3) );
		setarray '@sep,9,6,3,0;
		setarray '@c$,"G","M","K","";
		for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
			if(substr('@num$,-1) == "0") {
				set '@num$,substr('@num$,0,-1);
			}
			else
				break;
		}
		return substr('@num$,0,('@len - '@sep['@type])) +"."+ substr('@num$,('@len - '@sep['@type])) +'@c$['@type];
	}
}

jor_nest.gat,37,75,1	script	ベルベルガンド#ep19r	10470,{/* 2793 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ベルベルガンド]";
		mes "この人間ってなに？";
		mes "あの不信者たちが捕まえてきた者か？";
		mes "ここは君の仕事場ではない。";
		mes "出てけ！";
		close;
	}
	if(EP19_1QUE >= 68)	{
		mes "[ベルベルガンド]";
		mes "うん？何か慌ただしいって？";
		mes "いや、まぁ。たまにあることだよ。";
		mes "ここよりも多くの魔力の残ってる場所へ";
		mes "移動するんだよ。";
		mes "それはどうでもいい。";
		next;
	}
	mes "[ベルベルガンド]";
	mes "私は、手芸が趣味なんだ。";
	mes "不信者たちが持ってきたのもいいけど、";
	mes "私はやはり伝統的なやり方で";
	mes "作ったのがいいな。";
	next;
	mes "[ベルベルガンド]";
	mes "ミミルガンド様の装飾品も";
	mes "私が作ったんだ。";
	mes "ヨルムンガンド様の鱗の服も美しいが、";
	mes "珊瑚の装飾を付けると";
	mes "もっと華麗になるんだよね。";
	next;
	mes "[ベルベルガンド]";
	mes "ふむ。何を作ろうか？";
	mes "ベルト？靴？装飾品？";
	mes "ああ、かんざしもいいな。";
	mes "格好良く作られたら、";
	mes "ラスガンド様に進上しなきゃ。";
	mes "ああ、忙しい忙しい。";
	close;
}

jor_nest.gat,257,26,5	script	マタカイナガンド#ep19r	21529,{/* 2794 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[マタカイナガンド]";
		mes "ぎやぁぁぁぁ！！！";
		mes "人間！！仕事場！！ここ違う！！";
		close;
	}
	if(EP19_1QUE >= 68) {	//69? 未調査
		mes "[マタカイナガンド]";
		mes "みんな巣を移動……した！";
		mes "しかし、";
		mes "私はここでずっと氷を掘らなきゃ。";
		next;
	}
	mes "[マタカイナガンド]";
	mes "洞窟の入口前のリマキナが怖い。";
	mes "カラマリンも怖い。";
	mes "氷を掘ろうとして、";
	mes "1人死んだ……2人死んだ。";
	mes "マタカイナは氷を掘りたいです……。";
	close;
}

jor_nest.gat,235,57,3	script	パブヤサビガンド#1	21529,{/* 2795 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		// 未調査、クエスト進行前
		mes "[パブヤサビガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(checkquest(8790)) {
		mes "[パブヤサビガンド]";
		mes "最近……私たちの任務が厳しいんだよ。";
		mes "ルガンじゃない人間が、";
		mes "私たちの働く区域に出入りする所為で、";
		mes "皮集めが厳しくなったんだよ。";
		next;
		mes "[ガヌリザミガンド]";
		mes "はぁ……。";
		close;
	}
	mes "[パブヤサビガンド]";
	mes "…………………？";
	mes "初めて見る司祭様。";
	mes "私はパブヤサビガンド。";
	mes "ラスガンド様の直属の部下。";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "直属？";
	next;
	mes "[パブヤサビガンド]";
	mes "一度も顔を崇めたことはないんだけど、";
	mes "私と……こちらのガヌリザミガンド。";
	mes "そして、";
	mes "働きに行ったスモプワヌガンドと……";
	mes "数名が直属部下だ、よ。";
	next;
	mes "[パブヤサビガンド]";
	mes "ラスガンド様に皮を集めて、";
	mes "捧げる仕事をしているんだ、よ。";
	next;
	mes "[ガヌリザミガンド]";
	mes "そうだ。";
	mes "私たちは大いに役に立つ仕事を";
	mes "やっているんだ、よ。";
	mes "たとえ中級だとしても……。";
	next;
	mes "‐二人のルガンは急に";
	mes "　沈んだ雰囲気になった‐";
	next;
	mes "[パブヤサビガンド]";
	mes "最近……私たちの任務が厳しいんだよ。";
	mes "ルガンじゃない人間が、";
	mes "私たちの働く区域に出入りする所為で、";
	mes "皮集めが厳しくなったんだよ。";
	next;
	mes "[ガヌリザミガンド]";
	mes "私たちの仕事は、";
	mes "ラスガンド様に捧げる罪人たちの皮を、";
	mes "蛇神の温もりから持ってくることなんだ。";
	next;
	mes "[ガヌリザミガンド]";
	mes "でも、最近になって、";
	mes "人間たちが出入りするようになった。";
	mes "私たちが作った道を勝手に使って……";
	mes "だけど、見ての通り私たちは平信徒だよ。";
	mes "防ぐ方法は無いんだ……かと言って、";
	mes "新しく道を作る力もないんだよ。";
	next;
	mes "[ガヌリザミガンド]";
	mes "はぁ……。";
	close2;
	setquest 8790;
	compquest 8790;
	//showevent 9999, 0, シャリャラ#ep19iwin07;	// 2824: 273, 23
	end;
}

jor_nest.gat,232,55,7	script	ガヌリザミガンド#1	21529,{/* 2796 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ガヌリザミガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ガヌリザミガンド]";
	mes "未だに何が何だか";
	mes "よく分からない……だよ。";
	close;
}

jor_nest.gat,239,239,3	script	デパナガンド#1	10473,{/* 2797 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[デパナガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 68) {	// ? クエスト分岐未調査
		mes "[デパナガンド]";
		mes "なんだか騒がしかったけれど、";
		mes "それでも私たちは私たちの仕事を";
		mes "一生懸命にやらないと……。";
		next;
		mes "[デパナガンド]";
		mes "より多くの同族たちを率いるために、";
		mes "ラスガンド様は戻ってくるだろう？";
		mes "その時まで卵の世話をしなくちゃ……。";
		close;
	}
	if(EP19_1QUE >= 41) {	//切り替わりタイミング未調査
		if(checkquest(8793)&8) {
			mes "[デパナガンド]";
			mes "どうだった？";
			mes "お前のように……";
			mes "何かに疑問を持つ子がいたかい？";
			mes "もう気付いたんだろ。";
			mes "各自やれることをやっているんだよ。";
			next;
			mes "[デパナガンド]";
			mes "お前は引き継ぎ疑問を持ち続け、";
			mes "教団のために力を使いなさい。";
			close;
		}
		mes "[デパナガンド]";
		mes "いや、まさか。";
		mes "こんなところで";
		mes "初めてみる司祭に会うとは……。";
		mes "どこから出て来たの？";
		mes "どうしてここに？";
		next;
		mes "[デパナガンド]";
		mes "担当は誰？";
		mes "この子を放置して上級孵化場から";
		mes "外に出してしまうなんて……。";
		next;
		mes "[デパナガンド]";
		mes "……うん？";
		mes "ああ、上級孵化場の出身じゃ";
		mes "なかったんだね？";
		mes "やれやれ、";
		mes "どうしてだれも";
		mes "私に教えてくれなかったんだ……。";
		next;
		mes "‐最上級ルガンは一人で喋りはじめた‐";
		next;
		mes "[デパナガンド]";
		mes "私は、デパナガンド様である。";
		mes "会話できるルガンは、";
		mes "全員私の顔を知っている。";
		next;
		mes "[デパナガンド]";
		mes "気になることは？";
		while(1) {
			next;
			// ありません -> あります
			// 逆回答未調査
			if(select("あります","ありません") == 2) {
				mes "[デパナガンド]";
				mes "素直な子だな。";
				mes "しかし、ここに生まれたからには、";
				mes "私の話を聞いてみてほしい。";
				next;
				mes "[デパナガンド]";
				mes "ふむ……。";
				mes "普段は何人か集めて一度に教えてるから";
				mes "独りだけに説明するのは";
				mes "ちょっと不思議な感じがするね。";
				next;
				mes "[デパナガンド]";
				mes "私たちは巨大な蛇、";
				mes "ヨルムンガンドの加護の下に";
				mes "この地を守る種族。";
				mes "卵から生まれるが親は無く、";
				mes "卵を育てるのはこの地の魔力。";
				next;
				mes "[デパナガンド]";
				mes "世の中の全ての生物が親をもつように、";
				mes "私たちは生き延びたラスガンド様の意思で";
				mes "生まれて、";
				mes "巨大な蛇ヨルムンガンドの力で形を得た。";
				next;
				mes "[デパナガンド]";
				mes "褒め称えたまえ、";
				mes "巨大な蛇、ヨルムンガンド。";
				mes "従えたまえ、";
				mes "生き延びた者、ラスガンド。";
				next;
				mes "[デパナガンド]";
				mes "こうやって";
				mes "知性を持って卵から目覚めることもまた、";
				mes "ラスガンド様の恩恵であり。";
				mes "強き者の血が、強い卵を作る。";
				next;
				mes "[デパナガンド]";
				mes "今の私たちルガンは、";
				mes "全てラスガンド様の力で";
				mes "繋がった個体たちである。";
				mes "親子の概念はないが、";
				mes "先代の意志を全て引き継いだのが";
				mes "ラスガンド様だ。";
				next;
				mes "[デパナガンド]";
				mes "そのラスガンド様が撒いた血が、";
				mes "私たちみんなをこうやって";
				mes "魔力の結晶体で作り上げているのは、";
				mes "お前と私が知っている通りだ。";
				next;
				mes "[デパナガンド]";
				mes "唯一、最高のルガンはラスガンド様、";
				mes "独りだけである。";
				mes "その一つ下の位にある、";
				mes "私のように優れた最上級ルガンは";
				mes "主教と呼ぶように。";
				next;
				mes "[デパナガンド]";
				mes "お前は神の選択の下に";
				mes "司祭として生まれた。";
				mes "向こうで卵の世話をする者たちは、";
				mes "平信徒である。";
				next;
				mes "[デパナガンド]";
				mes "平信徒にさえ成れず、";
				mes "与えられた神の魔力さえ";
				mes "吸収できぬままに生まれた者たちは、";
				mes "仕事ができたなら使えなくもないが……";
				mes "そうでなければ資源に過ぎない。";
				next;
				mes "[デパナガンド]";
				mes "お前のその知恵でラスガンド様を手伝い";
				mes "ヨルムンガンド教団が";
				mes "大陸に勢力を広げられるように";
				mes "頑張りなさい。";
				next;
				mes "[デパナガンド]";
				mes "何か気になることは？";
				continue;
			}
			mes "["+strcharinfo(0)+"]";
			mes "……。";
			next;
			mes "‐デパナガンドの話を総合すれば、";
			mes "　一定以上の知能を持つルガンたちは、";
			mes "　会話する能力などの知識を、";
			mes "　持った状態で卵から産まれるようだ。";
			mes "　ある程度の言い間違いは、";
			mes "　うやむやにできそうだ‐";
			next;
			mes "[デパナガンド]";
			mes "賢いな。言ってみなさい。";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "私たちは";
			mes "『言葉は学んだまま生まれて来る』のに、";
			mes "どうして先ほどの様なことは、";
			mes "一々学ばなくてはならないのですか？";
			next;
			mes "[デパナガンド]";
			mes "ああ、なんということだ、";
			mes "こんなに難しい質問をするとは！";
			mes "しかし若干の誤解があるようだな。";
			mes "私たちは言葉を学んだまま";
			mes "生まれる訳ではないのだよ。";
			next;
			mes "[デパナガンド]";
			mes "私たちは各々ラスガンド様とは";
			mes "異なる個体だが、";
			mes "ラスガンド様の力が";
			mes "由来するルガンという共通点がある。";
			next;
			mes "[デパナガンド]";
			mes "そのため、知っていることは、";
			mes "ルガンとして当然のことだ。";
			mes "知っていることを言ってみろ。";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "……。";
			next;
			menu "ルガンはルガンを食べる",-;
			mes "[デパナガンド]";
			mes "そう、学ばなくても知っていることだね。";
			mes "私たちはラスガンド様にとって";
			mes "当たり前のことは、";
			mes "全て知ったまま生まれる。";
			next;
			mes "[デパナガンド]";
			mes "しかし、教団の教理は、";
			mes "私たちの勢力が大きくなり、";
			mes "個体数が増えれば変わるものなんだよ。";
			next;
			mes "[デパナガンド]";
			mes "ここの孵化場を一回回りながら、";
			mes "孵化場を守る平信徒たちと";
			mes "話をしてみなさい。";
			mes "自分が司祭であるということの意味が";
			mes "理解できるだろう。";
			next;
			mes "[デパナガンド]";
			mes "説法をもっと聞きたいなら";
			mes "^ff0000ベルナガンド^000000を訪ねなさい。";
			mes "彼ならラスガンド様の教えを";
			mes "もっと上手く説明してくれるはずさ。";
			close2;
			setquest 8793;
			compquest 8793;
			end;
		}	// end while
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,277,257,1	script	ヤムリスニガンド#1	21529,{/* 2798 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ヤムリスニガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 41) {	//切り替わりタイミング未調査
		if(checkquest(8793)&8) {
			mes "[ヤムリスニガンド]";
			mes "デパナガンド様が？";
			mes "何を知っているのか聞いてみろって？";
			next;
			mes "[ヤムリスニガンド]";
			mes "…分からない、です。";
			next;
			menu "好きな物",-;
			mes "[ヤムリスニガンド]";
			mes "好きな物？";
			mes "暖かい場所…";
			mes "外はいやだ、です。";
			next;
			menu "嫌いな物",-;
			mes "[ヤムリスニガンド]";
			mes "嫌いな物？";
			mes "寒い場所…";
			mes "外はいやだ、です。";
			next;
			mes "‐難しい話はできなさそうだ‐";
			close;
		}
		mes "[ヤムリスニガンド]";
		mes "やる、しごと。";
		close;
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,220,279,1	script	タギミロデガンド#1	21529,{/* 2799 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[タギミロデガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 41) {	//切り替わりタイミング未調査
		if(checkquest(8793)&8) {
			mes "[タギミロデガンド]";
			mes "デパナガンド様が？";
			mes "何を知っているのか聞いてみろって？";
			next;
			mes "[タギミロデガンド]";
			mes "働きたくない……です。";
			next;
			menu "やりたいこと",-;
			mes "[タギミロデガンド]";
			mes "やりたいこと？";
			mes "横になって……";
			mes "魔力がホカホカする場所で……";
			mes "寝ていたい、です。";
			next;
			mes "[タギミロデガンド]";
			mes "でも、";
			mes "ヨルムンガンド教団の復興のためなら、";
			mes "働くです。";
			next;
			mes "‐深い考えはないようだ‐";
			close;
		}
		//未調査
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,274,199,5	script	ギベデウサガンド#1	21529,{/* 2800 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ギベデウサガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 41) {
		if(checkquest(8793)&8) {
			mes "[ギベデウサガンド]";
			mes "驚いた！";
			mes "驚い……た、です。";
			mes "知らない司祭さまだ。";
			mes "です。";
			mes "遊んでなかった、です。";
			next;
			mes "[ギベデウサガンド]";
			mes "……卵、世話していた、です。";
			next;
			menu "不満事項はない？",-;
			mes "[ギベデウサガンド]";
			mes "不満事項？";
			mes "……今までどの司祭様も";
			mes "そんなの話したことなかったです。";
			next;
			mes "[ギベデウサガンド]";
			mes "私たちは……神に従う信徒たちだ、です。";
			mes "……";
			mes "仕事は当然のことだです？";
			mes "遊びたいけど……";
			mes "仕事はやらなきゃならないです。";
			next;
			mes "‐難しい話はできなさそうだ‐";
			close;
		}
		mes "[ギベデウサガンド]";
		mes "やる。しごと。";
		close;
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,74,100,5	script	アレイガンド#1	10475,{/* 2801 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[アレイガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 41) {	// いつから切り替わりか未調査
		if(checkquest(8794)&8) {
			mes "[アレイガンド]";
			mes "ハハ！ヘタレ！";
			close;
		}
		mes "[アレイガンド]";
		mes "……？";
		mes "君、君……初めて見る。";
		mes "ちょっとこっちに来てみて。";
		next;
		mes "‐話が終わる前に、";
		mes "　最上級ルガンは腕をつかんで";
		mes "　歯を近づけてきた！‐";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "痛っ！";
		next;
		mes "[アレイガンド]";
		mes "ちっ、痛がって。";
		mes "噛んでない、噛んでない。";
		mes "食べてない。";
		next;
		mes "[アレイガンド]";
		mes "こいつちょっと大げさすぎるな？";
		mes "ヘタレなのか？";
		mes "君、このアレイガンドが怖いか？";
		next;
		menu "怖い",-,"怖くない",-;
		mes "[アレイガンド]";
		mes "口答えとは……";
		mes "折角食べなかったのに。";
		next;
		if(select("何でこんな行動をするのかを聞く","逃げる") == 2) {
			mes "[アレイガンド]";
			mes "ハハ！ヘタレ！";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "何でこんな行動をする…です？";
		next;
		mes "[アレイガンド]";
		mes "生まれて間もないのかな？";
		mes "見た目はそうじゃないのに、";
		mes "平信徒みたいに喋りやがる。";
		mes "でも、平信徒だと";
		mes "こんな考えも持たないだろうから、";
		mes "賢いことは賢いな。";
		next;
		mes "[アレイガンド]";
		mes "みんな同じ条件で生まれてくるのに";
		mes "何故、性格も考えも違うのだろう？";
		mes "本当に面白いと思わないか！";
		next;
		menu "？？？",-;
		mes "[アレイガンド]";
		mes "何だ、ちょっとからかっただけだよ。";
		mes "ここまで無邪気だとは。";
		mes "マジで誰かが腕を食べちゃっても";
		mes "知らないぜ？";
		mes "私とかなぁ！";
		next;
		mes "[アレイガンド]";
		mes "グムミガンドがやるなと言ったから";
		mes "やらないんだけど。";
		mes "グムミガンド知ってる？会ったことある？";
		mes "知らない？仕方がないな。";
		next;
		mes "[アレイガンド]";
		mes "とにかく、私が原始ルガンを";
		mes "どう食べるか悩んでいたら、";
		mes "奴がこう言ったよ。";
		mes "何をしても変わることはないのに、";
		mes "何であれをイジメるのかって。";
		mes "まったく、呆れたよ。";
		next;
		menu "……",-;
		mes "[アレイガンド]";
		mes "いくら私たちが神の魔力の宿った地で……";
		mes "祖先たちの血で作られて、";
		mes "このように魔力生命体として命を得て、";
		mes "他の生物たちと";
		mes "ちょっと異なるとしてもさ。";
		next;
		mes "[アレイガンド]";
		mes "魔力核にしなくても、";
		mes "そのまま吸収してみても";
		mes "いいのではないか？";
		next;
		mes "[アレイガンド]";
		mes "人間たちは何か食べる時に、";
		mes "料理というのをやるんだって？";
		mes "私はそれをやりたかったのさ～！！";
		mes "私が今まで生きてきて";
		mes "やってなかったことは……。";
		next;
		mes "[アレイガンド]";
		mes "それでグムミガンドが……";
		mes "……して……それが……。";
		next;
		mes "‐凄く恐ろしい話を聞いた。";
		mes "　しかし、話に出てくるグムミガンドが、";
		mes "　ルガンとしての常識的な思考の";
		mes "　持ち主なら、";
		mes "　ルガンたちは、原則的には原始ルガンを";
		mes "　直接食べることは無さそうだ‐";
		next;
		mes "[アレイガンド]";
		mes "おい！聞いているのか？";
		setquest 8794;
		compquest 8794;
		close;
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,17,97,5	script	ベルナガンド#1	10474,{/* 2802 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ベルナガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 41) {	//切り替わりタイミング未調査
		if(checkquest(8795)&8) {
			mes "[ベルナガンド]";
			mes "今日の説法は終わりました。";
			mes "後でまた会いましょう、新しい司祭よ。";
			close;
		}
		mes "‐最上級ルガンが";
		mes "　落ち着いた雰囲気で";
		mes "　何かを語っていることを、";
		mes "　数人が囲んで聞いている‐";
		next;
		if(select("一緒に聞いてみる","通り過ぎる") == 2) {
			mes "‐先ずは他の場所を回ってみよう‐";
			close;
		}
		mes "[ベルナガンド]";
		mes "こちらにいらっしゃる信徒たちは";
		mes "みんなご存じの通り、";
		mes "私たちの神はたった一柱、";
		mes "ヨルムンガンド様であります。";
		next;
		mes "[ベルナガンド]";
		mes "みんなが神の祝福により、";
		mes "この場にいるのです。";
		mes "私たちは他の種族と";
		mes "異なっています。";
		next;
		mes "[ベルナガンド]";
		mes "親もなく、子供もないが、";
		mes "こうやって神の意により";
		mes "共同体を成しています。";
		unittalk getnpcid(0,"ハデマリガンド#1"),"ハデマリガンド : 新しく生まれた同族かな？今は説法の途中だから静かに聞いて。";
		next;
		mes "‐最上級ルガンは、";
		mes "　こちらを見ると頷いた‐";
		next;
		mes "[ベルナガンド]";
		mes "新しい信徒の方が1人増えましたね。";
		mes "歓迎いたしましょう。";
		unittalk getnpcid(0,"ハデマリガンド#1"),"ハデマリガンド : ようこそ！";
		unittalk getnpcid(0,"ユラミガンド#1"),"ユラミガンド : 適当に座って。";
		unittalk getnpcid(0,"ウナグスダガンド#1"),"ウナグスダガンド : ……。";
		next;
		mes "[ベルナガンド]";
		mes "さぁ、さぁ、もう一度静かに。";
		mes "今日の説法はそろそろ終わりにしようかと";
		mes "思いましたが、";
		mes "司祭様を迎えたから";
		mes "もう少し話してみましょう。";
		next;
		mes "[ベルナガンド]";
		mes "久しぶりに……";
		mes "ラスガンド様の話をしてみますか？";
		next;
		mes "[ベルナガンド]";
		mes "今は忙しいせいで姿を";
		mes "お見せしてくださいませんが、";
		mes "我がヨルムンガンド教団の";
		mes "再復興のために、ラスガンド様は";
		mes "この寒い大地の様々な所を回りました。";
		next;
		mes "[ベルナガンド]";
		mes "少しでも神の恩恵の残ってる場所には、";
		mes "惜しまず血を撒いて";
		mes "新しい同族を作りました。";
		next;
		mes "[ベルナガンド]";
		mes "私たちの先祖の最後の子、";
		mes "ラスガンド様の血に宿った魔力と、";
		mes "神の恩恵が溢れるこの地の魔力が混ざり";
		mes "新しい生命が宿り始めました。";
		mes "しかし、全てが意のままというわけには";
		mes "いきませんでした。";
		next;
		mes "[ベルナガンド]";
		mes "初めて卵から";
		mes "生まれたものたちこそが……";
		mes "神の選択を受けられなかった";
		mes "原始ルガンたちでしたからね。";
		unittalk getnpcid(0,"ウナグスダガンド#1"),"ウナグスダガンド : 贖罪します……。";
		next;
		mes "[ベルナガンド]";
		mes "ラスガンド様は切ない気持ちで";
		mes "彼らをひとつひとつ、";
		mes "魔力核に変えました。";
		mes "その後も血を撒いて、";
		mes "新しい同族を増やすことを";
		mes "繰り返しました。";
		next;
		mes "[ベルナガンド]";
		mes "そして長い年月が流れ……";
		mes "その間、私もラスガンド様と";
		mes "共になるようになりましたが……。";
		next;
		mes "[ベルナガンド]";
		mes "今の私たちルガンは、";
		mes "階級に関係なく、";
		mes "みんなラスガンド様の一部であり";
		mes "子孫です。";
		mes "親も子もいませんけど。";
		next;
		mes "[ベルナガンド]";
		mes "しかし、どうしてこんなにも";
		mes "各自が違う結果物として";
		mes "生まれるのでしょうか？";
		next;
		mes "[ベルナガンド]";
		mes "それは……各自が";
		mes "『欲しいものにどれほど触れようと";
		mes "しているのか？』に";
		mes "よるのではないかと、私は思います。";
		next;
		mes "[ベルナガンド]";
		mes "ラスガンド様の味わった苦痛を、";
		mes "私たちは知ることができません。";
		mes "そして私が経験した過去の出来事も";
		mes "例えば今入ったばかりの司祭様も";
		mes "知らないでしょう。";
		next;
		mes "[ベルナガンド]";
		mes "ラスガンド様は、";
		mes "人間たちに関わる呪いによって";
		mes "不死身になりましたが……。";
		next;
		mes "[ベルナガンド]";
		mes "人間たちに対する復讐を終える前に、";
		mes "ラスガンド様の気力が尽きたりしたら";
		mes "このまま我が種族は";
		mes "破滅へ向かってしまうでしょう。";
		next;
		mes "[ベルナガンド]";
		mes "だから、ラスガンド様の心を";
		mes "盛り上げていくためにも、";
		mes "私たちも人間たちに対する復讐心を";
		mes "忘れてはいけません。";
		next;
		mes "[ベルナガンド]";
		mes "……人間たちに対する復讐！";
		unittalk getnpcid(0,"ハデマリガンド#1"),"ハデマリガンド : ヨルムンガンド万歳！";
		unittalk getnpcid(0,"ウナグスダガンド#1"),"ウナグスダガンド : ヨルムンガンド万歳！";
		next;
		mes "[ベルナガンド]";
		mes "祖先たちの恨み！";
		unittalk getnpcid(0,"ハデマリガンド#1"),"ハデマリガンド : ラスガンド万歳！";
		unittalk getnpcid(0,"ウナグスダガンド#1"),"ウナグスダガンド : ラスガンド万歳！";
		next;
		mes "[ベルナガンド]";
		mes "今からでも、力を蓄える必要が";
		mes "あるのではないでしょうか？";
		mes "これ以上手遅れになる前に……";
		mes "みんなで準備いたしましょう。";
		next;
		mes "[ベルナガンド]";
		mes "今日の説法はこのくらいで終わります。";
		mes "みんながよい時間をすごせますように。";
		unittalk getnpcid(0,"ウナグスダガンド#1"),"ウナグスダガンド : 働きに行かなきゃ……。";
		unittalk getnpcid(0,"ユラミガンド#1"),"ユラミガンド : ……。";
		next;
		mes "[ユラミガンド]";
		mes "君、ちょっと話そうか。";
		unittalk getnpcid(0,"ユラミガンド#1"),"しーっ、こっちは見ないで。";
		setquest 8795;
		compquest 8795;
		close;
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,24,97,3	script	ハデマリガンド#1	10470,{/* 2803 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハデマリガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ハデマリガンド]";
	mes "耳にすっと入ってくる";
	mes "親切な説法なんだ。";
	close;
}

jor_nest.gat,21,99,3	script	ラカノルガンド#1	10471,{/* 2804 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ラカノルガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ラカノルガンド]";
	mes "神の教えに従いなさい…";
	close;
}

jor_nest.gat,23,91,1	script	ウナグスダガンド#1	21529,{/* 2805 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ウナグスダガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ウナグスダガンド]";
	mes "…";
	mes "やる。しごと。";
	mes "せっせと。贖罪。";
	close;
}

jor_nest.gat,18,92,7	script	ユラミガンド#1	10473,{/* 2806 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ユラミガンド]";
		mes "人間か！　どうしてここに！";
		close;
	}
	if(EP19_1QUE >= 41) {	//切り替わりタイミング未調査
		if(checkquest(8795)&8) {
			if(checkquest(130515)&8) {
				mes "[ユラミガンド]";
				mes "悪い奴に目を付けられないように、";
				mes "気を付けて。";
				close;
			}
			mes "[ユラミガンド]";
			mes "君、ちょっと話そうか。";
			next;
			menu "はい？",-,"どういうご用ですか？",-;
			mes "[ユラミガンド]";
			mes "しーっ、こっちは見ないで。";
			mes "……";
			mes "生まれて間もないのに、";
			mes "こんなことを聞いたから";
			mes "刺激が強いのは分かるが、";
			mes "全ての話を呑み込む必要はない。";
			next;
			mes "[ユラミガンド]";
			mes "ベルナガンドの腹ん中は分からないから。";
			mes "口ではああいうけれど、";
			mes "本当にラスガンド様の為に";
			mes "行動しているのかも定かじゃない。";
			next;
			mes "[ユラミガンド]";
			mes "分かったか？";
			next;
			menu "はい",-,"分かりません",-;
			mes "[ユラミガンド]";
			mes "……時間が明らかにしてくれるだろうが";
			mes "ベルナガンドとは、";
			mes "あんまり親しくしないほうがいい。";
			mes "ラスガンド様も快く思わないだろう。";
			next;
			menu "本当ですか？",-,"はい",-;
			mes "[ユラミガンド]";
			mes "……。";
			next;
			mes "[ユラミガンド]";
			mes "ベルナガンドの、";
			mes "ラスガンド様に対する忠誠心は";
			mes "本物だが、";
			mes "ラスガンド様の意思を正しく";
			mes "汲み取れているわけではない。";
			next;
			mes "[ユラミガンド]";
			mes "……あのな、";
			mes "ベルナガンドの言う通りに";
			mes "みんながラスガンド様の力で";
			mes "生まれたなら、";
			mes "どうしてここまで違うんだ？";
			close2;
			setquest 130515;
			compquest 130515;
			end;
		}
		mes "[ユラミガンド]";
		mes "……。";
		close;
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,239,244,5	script	シドルガンド#1	10475,{/* 2807 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[シドルガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 41) {	//切り替わりタイミング未調査
		if(checkquest(8796)&8) {
			mes "[シドルガンド]";
			mes "来てくれたんだ！";
			mes "じゃあ、今日も同族狩りした時の";
			mes "感じについて話しましょう？";
			mes "ちょっと、";
			mes "そこまで露骨に嫌な顔しないでよ！";
			mes "……あ、ちょっと付き合ってよ！";
			close;
		}
		mes "[シドルガンド]";
		mes "あらあら！";
		mes "初めてみる子ね！";
		mes "あら～鱗見て。キラキラ光ってる～。";
		mes "こんなに綺麗な子は、";
		mes "あんまり見たこと無いのに～。";
		next;
		mes "[シドルガンド]";
		mes "あんた気に入ったよ。";
		mes "この辺の孵化場出身じゃないよね？";
		mes "この間外に出た時には、";
		mes "良さそうな卵を見なかったもの～。";
		next;
		mes "[シドルガンド]";
		mes "低級孵化場から";
		mes "こんなにぴかぴかな子が";
		mes "急に出てくるとはね～。";
		mes "私の見る目もまだまだなんだから～";
		mes "私はシドルガンドだよ～。";
		next;
		menu "セネキオガンド……です",-;
		mes "[シドルガンド]";
		mes "鱗をもらえないかな？";
		next;
		menu "はい？",-;
		mes "[シドルガンド]";
		mes "心配しないで、司祭様～。";
		mes "私は階級がたかいけど～、";
		mes "あんたのこと～、";
		mes "無理やりどうにかしたいわけじゃ";
		mes "ないの～。";
		mes "あ、血はどう？";
		next;
		menu "はい？",-;
		mes "[シドルガンド]";
		mes "ダメかぁ……なら仕方ないわ～。";
		mes "どうせ脱皮したり……するじゃない～？";
		mes "その時に～、";
		mes "皮はどう？";
		next;
		mes "[シドルガンド]";
		mes "あぁん～。";
		mes "そこまで露骨的に嫌な顔しないで～。";
		mes "可愛いのに";
		mes "眉間にしわができちゃうじゃない～。";
		next;
		mes "[シドルガンド]";
		mes "う～ん。";
		mes "なかなか乗らないね～。";
		next;
		menu "鱗をくれた同族……いましたか？",-;
		mes "[シドルガンド]";
		mes "いない！";
		mes "あらまぁ、それを聞いてどうするの？";
		mes "私の鱗と交換してって言っても、";
		mes "嫌なんだって！";
		next;
		menu "……",-;
		mes "[シドルガンド]";
		mes "私も生まれてきて";
		mes "あんまり経っていないけどさ。";
		mes "我が種族が凄く不利な立場に";
		mes "置かれているのは事実じゃない？";
		next;
		mes "[シドルガンド]";
		mes "同じく生まれて間もないあんたに";
		mes "こんな話をするのも笑っちゃうけどさ。";
		mes "シュルシュル……。";
		next;
		mes "‐彼の口から蛇が這うような音がする。";
		mes "　それなりに笑っているようだ‐";
		next;
		mes "[シドルガンド]";
		mes "あんたも外へ出てみると分かるけど、";
		mes "寒いよ！";
		mes "こんなやせた場所で";
		mes "復讐をしようだなんて、";
		mes "本当に凄いと思わない？";
		next;
		mes "[シドルガンド]";
		mes "ならそれなりにできることは";
		mes "全部やってみないと！";
		mes "私の勢力も増やして……、";
		mes "同調者も増やして……、";
		mes "あんた！あんたのことだよ。";
		mes "私の傘下に入らない？";
		next;
		mes "[シドルガンド]";
		mes "年寄りたちは何をしようにも";
		mes "待ってくればかり言うし、";
		mes "鱗も血もくれないし……。";
		mes "それじゃ私たちは";
		mes "何の発展ができるというの！";
		next;
		mes "[シドルガンド]";
		mes "それで、話は戻るけど、";
		mes "抜けた鱗もない？";
		next;
		menu "ありません",-;
		mes "[シドルガンド]";
		mes "鱗ばかりキラキラしてて、";
		mes "役に立たないね。";
		next;
		mes "‐口調に統一性がなく、";
		mes "　話の導線もどこかおかしい。";
		mes "　言いようもない恐怖と";
		mes "　危険さを感じる‐";
		next;
		mes "[シドルガンド]";
		mes "そういえば、自然界には、";
		mes "元から同族を殺す動物が多いという話を、";
		mes "年寄りの誰かから";
		mes "言われたことがあったけど。";
		next;
		mes "[シドルガンド]";
		mes "私も年寄りも、";
		mes "この寒い大陸の外へ出たことがないから";
		mes "よく解らないな。";
		next;
		mes "[シドルガンド]";
		mes "多分人間も同じだとおもうが。";
		mes "なんとなくそうなんじゃないかな？";
		mes "資源は節約しなきゃならないから。";
		mes "そうそう、原始ルガンは倒してみた？";
		mes "同族という感じはした？";
		next;
		menu "あんまりしなかった",-;
		mes "[シドルガンド]";
		mes "だろう？私もそうだった。";
		mes "そして、消えたら残るのは";
		mes "ちっさい魔力核だけとは、";
		mes "私たちはどうして生まれてくるのだろう？";
		next;
		mes "[シドルガンド]";
		mes "あそこで教理を説法をしている";
		mes "ベルナガンドという年寄りに聞いたら、";
		mes "教えてくれるのかな？";
		next;
		mes "[シドルガンド]";
		mes "まあいいや、";
		mes "今日はもう疲れちゃったから、";
		mes "明日また会おう！";
		close2;
		setquest 8796;
		compquest 8796;
		end;
	}
	mes "‐無暗にルガンに話しかけて、";
	mes "　正体がバレたらまずい。";
	mes "　いまはやめておこう‐";
	close;
}

jor_nest.gat,272,196,5	script	ミレデヤミガンド#1	21529,{/* 2808 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ミレデヤミガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ミレデヤミガンド]";
	mes "働く。私は素晴らしい働き手だ。";
	close;
}

jor_nest.gat,278,219,5	script	ワユナゴスガンド#1	21529,{/* 2809 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ワユナゴスガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	//切り替わり前、未調査
	mes "[ワユナゴスガンド]";
	mes "働く。私は格好いい働き手だ。";
	mes "格好いいと何がいいのか分からんが、";
	mes "そうなんだ。";
	close;
}

jor_nest.gat,251,279,7	script	ケスビラミガンド#1	21529,{/* 2810 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ケスビラミガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ケスビラミガンド]";
	mes "働く。どこへ行っても上手いと言われる。";
	close;
}

jor_nest.gat,272,257,7	script	ハヌコリマガンド#1	21529,{/* 2811 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ハヌコリマガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ハヌコリマガンド]";
	mes "働く。私は素晴らしい働き者だ。";
	close;
}

jor_nest.gat,241,223,5	script	ドギドギガンド#1	10470,{/* 2812 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ドギドギガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ドギドギガンド]";
	mes "遊んでる子がいるようだけど、";
	mes "区別が付かない。";
	close;
}

jor_nest.gat,243,223,3	script	ラクルスガンド#1	10472,{/* 2813 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ラクルスガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	mes "[ラクルスガンド]";
	mes "ちょっとサボってもいいじゃない。";
	close;
}

jor_nest.gat,258,236,3	script	イガノウガンド#1	10472,{/* 2814 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[イガノウガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 68) {	// ? 未調査
		mes "[イガノウガンド]";
		mes "ラスガンド様の意を、";
		mes "私たちがどうやって知るかな。";
		close;
	}
	mes "[イガノウガンド]";
	mes "初めてみる司祭様？";
	mes "これから神の恩恵が共にあらんことを。";
	close;
}

jor_nest.gat,261,233,3	script	ムラミナガンド#1	10471,{/* 2815 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ムラミナガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 68) {	// ? 未調査
		mes "[ムラミナガンド]";
		mes "私は正直、変わっていない気がする。";
		close;
	}
	mes "[ムラミナガンド]";
	mes "ハァ、今日も忙しかった。ちょっと休憩。";
	close;
}

jor_nest.gat,152,108,5	script	ビラニマガンド#1	10470,{/* 2816 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ビラニマガンド]";
		mes "人間だ！人間が現れた！";
		close;
	}
	if(EP19_1QUE >= 68) {
		mes "[ビラニマガンド]";
		mes "何か用？";
		mes "私を探してないなら、休ませてくれ。";
		close;
	}
	mes "[ビラニマガンド]";
	mes "今日も一生懸命に";
	mes "ラスガンド様のために働いた。";
	mes "ふふ。";
	close;
}

jor_nest.gat,253,75,7	script	ミララシミガンド#1	21529,{/* 2817 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[ミララシミガンド]";
		mes "……すやすや。";
		close;
	}
	mes "[ミララシミガンド]";
	mes "……すや。";
	mes "今日も一生懸命に働いた。";
	mes "ちょっと休む……";
	mes "ヨルムンガンド様も許してくれるだろ。";
	mes "すやすや……。";
	next;
	mes "‐ルガンでなくても分かるぐらい";
	mes "　疲れた顔で";
	mes "　壁に寄りかかって寝ている‐";
	close;
}

icecastle.gat,190,217,3	script	アーウィンの兵士#ep19iw	21515,{/* 2818 */
	cutin "ep19_iwin04.png", 2;
	mes "[アーウィンの兵士]";
	mes "兵舎に何か用？";
	mes "兵舎の左の部屋はパトロール隊で、";
	mes "ヴェルグンデ様は右の部屋だよ。";
	close2;
	cutin "ep19_iwin04.png", 255;
	end;
}

icecastle.gat,180,206,3	script	アーウィンの兵士#ep19iw	21515,{/* 2819 */
	cutin "ep19_iwin09.png", 2;
	mes "[アーウィンの兵士]";
	mes "ちょっとぉ……";
	mes "ここがいくら演舞場だとしてもぉ……";
	mes "雪かきするの、意味あるかな？かな？";
	next;
	cutin "ep19_iwin10.png", 2;
	mes "[アーウィンの兵士]";
	mes "あ……積もる前にしたから、";
	mes "ようやくこの程度で収まってるって？";
	mes "いやぁ……でも……。";
	close2;
	cutin "ep19_iwin10.png", 255;
	end;
}

icas_in.gat,109,242,5	script	ギュルル#ep19iwin05	21513,{/* 2820 */
	cutin "ep19_iwin04.png", 2;
	mes "[ギュルル]";
	mes "近頃、人間たちが多く訪ねてきていいね。";
	mes "君たちが来る前は時間が過ぎるのも";
	mes "分からなかったんだよな。";
	mes "レオン様とオーレリー様は、";
	mes "ほとんど眠っていらっしゃったし……。";
	next;
	menu "眠り続けてたって？",-;
	mes "[ギュルル]";
	mes "でも凄いことに何かあると起きるよ。";
	mes "夢で全部見るんだって。";
	mes "不思議だよね？";
	close2;
	cutin "ep19_iwin04.png", 255;
	end;
}

icas_in.gat,142,201,3	script	トルル#ep19iwin05	21513,{/* 2821 */
	cutin "ep19_iwin03.png", 2;
	mes "[トルル]";
	mes "前にはな。";
	mes "バルムント様がよく遊びにきてたんだ。";
	mes "当時作っておいた";
	mes "人間専用宿舎や食堂がある。";
	next;
	mes "[トルル]";
	mes "食堂は左側、宿舎は右側。";
	mes "分かった？";
	close2;
	cutin "ep19_iwin03.png", 255;
	end;
}

icecastle.gat,52,124,3	script	シャリャラ#ep19iwin06	21515,{/* 2822 */
	if(EP19_1QUE < 23) {
		mes "[シャリャラ]";
		mes "氷道に気を付けて？";
		mes "すっげぇ滑るんだよ～？";
		close2;
		cutin "ep19_iwin04.png", 255;
		end;
	}
	//showevent 6, 3, シャリャラ#ep19iwin06;	// 2822: 52, 124
	cutin "ep19_iwin04.png", 2;
	mes "[シャリャラ]";
	mes "ルガンの巣に潜入する仕事、ご苦労様。";
	mes "今日も潜入しに行くの？";
	mes "氷道で歩き辛いだろうから、";
	mes "ちょっと手伝おうか？";
	next;
	if(EP19_1QUE >= 19) {	// 未調査
		set '@str1$,"フリーデリケの滞在所";
		set '@str2$,"ヘルロックの所";
	}
	switch(select("必要ない","蛇の巣","氷の城","ヴェルグンデの研究室","ゾリャラのキッチン",'@str1$,'@str2$)) {
	case 1:
		mes "[シャリャラ]";
		mes "もしも、道で転びそうだったら";
		mes "言ってくれ。";
		mes "私が氷の城の神速配達アーウィンだよ。";
		mes "人間一人飛ばすのは、";
		mes "お茶の子さいさいだぜ。";
		close2;
		cutin "ep19_iwin04.png", 255;
		end;
	case 2:
		if(EP19_1QUE >= 63 && EP19_1QUE <= 67) {
			mes "[シャリャラ]";
			mes "^0000ff蛇の巣^000000か？";
			mes "今は、直接向かうわけにはいかないから、";
			mes "付近まで飛ばすぜ！";
			close2;
			cutin "ep19_iwin04.png", 255;
			warp "jor_que.gat", 281, 87;
			end;
		}
		mes "[シャリャラ]";
		mes "^0000ff蛇の巣^000000だな？";
		mes "前はルガンに変身して行っただろ？";
		mes "すっげぇ楽しかったよ。";
		mes "あの時に道を覚えたからな。";
		mes "それじゃあ、";
		mes "巣の入口に飛ばすぜ！";
		close2;
		cutin "ep19_iwin04.png", 255;
		warp "jor_nest.gat", 275, 19;
		end;
	case 3:
		set '@name$,"氷の城";
		set '@map$,"icas_in.gat";
		setarray '@xy,138,187;
		break;
	case 4:
		set '@name$,"ヴェルグンデの研究室";
		set '@map$,"icas_in.gat";
		setarray '@xy,190,61;
		break;
	case 5:
		set '@name$,"ゾリャラのキッチン";
		set '@map$,"icas_in.gat";
		setarray '@xy,237,62;
		break;
	case 6:
		set '@name$,"フリーデリケの滞在所";
		set '@map$,"icas_in.gat";
		setarray '@xy,33,112;
		break;
	case 7:
		set '@name$,"ヘルロックの所";
		set '@map$,"jor_tail.gat";
		setarray '@xy,214,60;
		break;
	}
	mes "[シャリャラ]";
	mes "^0000ff" +'@name$+ "^000000だな？";
	mes "人間一人飛ばすのは、";
	mes "お茶の子さいさいだぜ。";
	close2;
	cutin "ep19_iwin04.png", 255;
	warp '@map$, '@xy[0], '@xy[1];
	end;
}

jor_nest.gat,273,23,0	script	#e19sw_tele_1	139,7,7,{/* 2823 */
	if(EP19_1QUE >= 23)
		cloakoffnpc "シャリャラ#ep19iwin07";
	end;
}

jor_nest.gat,273,23,3	script	シャリャラ#ep19iwin07	21529,{/* 2824 (cloaking)*/
	mes "[シャリャラ]";
	mes "ちょっと！";
	mes "私だよ、ほら！シャリャラ！";
	mes "氷の城へ戻る？";
	mes "一緒に行こうか？";
	next;
	if(select("まだやることがある","氷の城へ帰ろう！") == 2) {
		mes "[シャリャラ]";
		mes "分かった。";
		mes "では後で一緒に帰ろう。";
		mes "私はここにずっといるから。";
		close;
	}
	mes "[シャリャラ]";
	mes "私は氷の城のアーウィンの中でも、";
	mes "物凄く早いアーウィンなんだ。";
	mes "氷道で滑らないように手伝うから、";
	mes "早く行こう！";
	close2;
	warp "icecastle.gat", 55, 120;
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,59,122,6	script	コラリョ#icecastle	21513,{/* 2825 */
	mes "[コラリョ]";
	mes "こっちも雪、あっちは氷、";
	mes "四方八方が雪と氷だけで溢れる氷の城に";
	mes "ようこそいらっしゃい、異邦人！";
	mes "この^B47096シルキー・ウェル＝バランスド・トーマス・ジョイ^000000様が";
	mes "案内担当だから、気になることを聞いてみるように。";
	mes "そこの倉庫も管理してるから、ぜひ使ってくれ！";
	messize 180,364;
	while(1) {
		next;
		switch(select("氷の城","兵舎","ヴェルグンデの研究室","ゾリャラのキッチン","羽根の民宿","ミニマップ表示を消す","やめておく")) {
		case 1:
			mes "[コラリョ]";
			mes "氷の城はここだ！";
			mes "ミニマップにもメモしてあげよう！";
			mes "他の場所の案内も必要か？";
			viewpoint 1, 213, 174, 0, 0x0A82FF;
			break;
		case 2:
			mes "[コラリョ]";
			mes "兵舎はここだ！";
			mes "ミニマップにもメモしてあげよう！";
			mes "他の場所の案内も必要か？";
			viewpoint 1, 186, 222, 1, 0xAAFF00;
			break;
		case 3:
			mes "[コラリョ]";
			mes "ヴェルグンデ様の研究室はここだ！";
			mes "ミニマップにもメモしてあげよう！";
			mes "他の場所の案内も必要か？";
			viewpoint 1, 186, 222, 2, 0x008080;
			break;
		case 4:
			mes "[コラリョ]";
			mes "ゾリャラのキッチンはここだ！";
			mes "ミニマップにもメモしてあげよう！";
			next;
			mes "[コラリョ]";
			mes "食堂で働くアーウィンたちのため、";
			mes "託児所も一緒に運営しているよ。";
			mes "子供たちが可愛いからって";
			mes "連れて行っちゃダメだぞ！！";
			mes "他の場所の案内も必要か？";
			viewpoint 1, 124, 171, 3, 0xFF1493;
			break;
		case 5:
			mes "[コラリョ]";
			mes "羽根の民宿はここだ！";
			mes "ミニマップにもメモしてあげよう！";
			mes "一晩泊まるには、^ff0000屋根の上^000000の主に";
			mes "宿泊できるか聞いてみるといい！";
			mes "他の場所の案内も必要か？";
			viewpoint 1, 64, 224, 4, 0x8B4513;
			break;
		case 6:
			mes "[コラリョ]";
			mes "メモを消したよ！";
			mes "他に気になることはあるか？";
			viewpoint 2, 1, 1, 0, 0xFFFFFF;
			viewpoint 2, 1, 1, 1, 0xFFFFFF;
			viewpoint 2, 1, 1, 2, 0xFFFFFF;
			viewpoint 2, 1, 1, 3, 0xFFFFFF;
			viewpoint 2, 1, 1, 4, 0xFFFFFF;
			break;
		case 7:
			mes "[コラリョ]";
			mes "異邦人たちは羽毛がなくて寒いだろうから、";
			mes "あっちこっち歩き回ってると風邪を引くよ。";
			mes "暖かい建物の中にいて。";
			close;
		}
	}
OnInit:
	setnpctitle "<氷の城ガイド>";	// NPC:コラリョ#icecastle(2825)
	end;
}

icecastle.gat,177,221,4	script	兵舎#左	111,{/* 2836 */}
icecastle.gat,194,221,4	script	兵舎#右	111,{/* 2837 */}
icecastle.gat,199,148,4	script	氷城#左	111,{/* 2838 */}
icecastle.gat,213,148,4	script	氷城#右	111,{/* 2839 */}
icecastle.gat,123,173,4	script	ゾリャラのキッチン#食堂	111,{/* 2840 */
	end;
OnInit:
	setnpctitle "<16代の手作りの味>";	// NPC:ゾリャラのキッチン#食堂(2840)
	end;
}

icas_in.gat,245,53,5	script	チョロリ#ep19in	10461,{/* 2841 */
	mes "[チョロリ]";
	mes "今日は何をして遊ぼう？";
	mes "ゾリャラの毛づくろいしようか？";
	close;
}

icas_in.gat,236,45,5	script	ゴリャル#ep19in	10461,{/* 2842 */
	mes "[ゴリャル]";
	mes "ワカメ、もう少し食べたいな。";
	close;
}

icas_in.gat,241,49,3	script	チョロル#ep19in	10461,{/* 2843 */
	mes "[チョロル]";
	mes "ご飯食べたら眠い…";
	close;
}

icas_in.gat,251,60,3	script	ホラリ#ep19in	10461,{/* 2844 */
	mes "[ホラリ]";
	mes "母さんはパトロール";
	mes "上手くやってるのかな？";
	close;
}

icas_in.gat,251,59,7	script	トリラ#ep19in	10461,{/* 2845 */
	mes "[トリラ]";
	mes "私も父さんみたいに立派な大人になる。";
	close;
}

icas_in.gat,244,63,1	script	チョロロ#ep19in	10461,{/* 2846 */
	mes "[チョロロ]";
	mes "私は大きくなったら～";
	mes "ゾリャラを手伝う！";
	unittalk getnpcid(0,"ゾリャラ#ep19_dq_kitche"),"ゾリャラ : 今手伝ってもいいけど…";
	close;
}

icas_in.gat,252,50,5	script	コリリ#ep19in	10461,{/* 2847 */
	mes "[コリリ]";
	mes "私は大きくなったら、";
	mes "パトロール隊になるよ！";
	mes "パトロール隊の帽子あるじゃない、";
	mes "私は緑色が好き。緑色を被る。";
	unittalk getnpcid(0,"ソララン#ep19in"),"ソララン : 黄色がもっと格好いい！";
	unittalk getnpcid(0,"コリリ#ep19in"),"コリリ : 緑色がもっと格好いい！";
	close;
}

icas_in.gat,251,46,7	script	ソララン#ep19in	10461,{/* 2848 */
	mes "[ソララン]";
	mes "大きくなったらパトロール隊になる！";
	mes "パトロール隊の帽子？";
	mes "私は黄色が好き。赤色はださい。";
	unittalk getnpcid(0,"コリリ#ep19in"),"コリリ : そうそう、赤色がださいのは本当。";
	close;
}

icas_in.gat,235,57,3	script	ホリャラ#ep19in	10461,{/* 2849 */
	mes "[ホリャラ]";
	mes "私はホリャラだ！";
	mes "将来は偉大な守護者になるから！";
	close;
}

icas_in.gat,232,59,5	script	トラルン#ep19in	10461,{/* 2850 */
	mes "[トラルン]";
	mes "私はトラルンだ！";
	mes "将来は……";
	mes "私は……偉大な守護者になる！";
	mes "こういえばいいの？";
	unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : うん！";
	unittalk getnpcid(0,"トラルン#ep19in"),"トラルン : ひゅぅ。";
	close;
}

icas_in.gat,248,47,3	script	ソリリ#ep19in	10461,{/* 2851 */
	mes "[ソリリ]";
	mes "ちょっとだけ待っててよ、";
	mes "飯食ったら遊んであげ……";
	mes "いや、子供じゃなかったな。";
	next;
	mes "[ソリリ]";
	mes "時間があればうちの子たちと";
	mes "遊んでくれないか？";
	mes "外から来た人間の話なら、";
	mes "きっと気に入るだろ。";
	close;
}

icas_in.gat,234,49,3	script	フルル#ep19in	10461,{/* 2852 */
	unittalk getcharid(3),strcharinfo(0)+" : ‐食事するのに忙しそうだ‐",1;
	end;
}

icas_in.gat,237,66,7	script	かめ#1	111,{/* 2853 */
	unittalk getnpcid(0,"ゾリャラ#ep19_dq_kitche"),"ゾリャラ : それは千年前から続いてきた秘伝のタレだよ。みだりに触れないで欲しい。";
	end;
}

icas_in.gat,235,65,7	script	かめ#2	111,{/* 2854 */
	unittalk getnpcid(0,"ゾリャラ#ep19_dq_kitche"),"ゾリャラ : 人間、それは千年の秘法で造られたカラマリン塩辛だが、人間は食べられないらしい。本当にもったいない。";
	end;
}

icecastle.gat,170,142,3	script	チョリロン#ep19in	10461,{/* 2855 */
	mes "[チョリロン]";
	mes "たまに羽毛に押された跡がある";
	mes "友達がいるけど、";
	mes "まるで他の動物が";
	mes "風避けにしていたみたいなんだよね。";
	next;
	mes "[チョリロン]";
	mes "しかし、そんな大きさで";
	mes "私たちを恐れない動物は";
	mes "見たことがないんだよ？";
	mes "噂にあった猫や犬がどこかにいるのかな？";
	close;
}

icecastle.gat,261,179,7	script	ゴリュリュ#ep19in	10461,{/* 2856 */
	mes "[ゴリュリュ]";
	mes "ふ……。";
	mes "何もない平穏な日が、";
	mes "どれだけありがたい物か知っているか？";
	mes "そんな時は、";
	mes "あの冷たい海さえも暖かく見えちゃう。";
	close;
}

icecastle.gat,105,227,3	script	トルラ#ep19in	10461,{/* 2857 */
	mes "[トルラ]";
	mes "昨日食べた物じゃなくて、";
	mes "違う物が食べたいな……。";
	close;
}

icecastle.gat,103,227,5	script	チョリル#ep19in	10461,{/* 2858 */
	mes "[チョリル]";
	mes "夕飯は何を食べよう……。";
	close;
}

icecastle.gat,149,216,3	script	ボリリ#ep19in	21516,{/* 2859 */
	mes "[ボリリ]";
	mes "勤務中、異常ありませぇぇん。";
	close;
}

icecastle.gat,241,115,5	script	ボラリャ#ep19in	21515,{/* 2860 */
	mes "[ボラリャ]";
	mes "勤務中、異常ありませぇぇん。へくしっ！";
	close;
}

icecastle.gat,35,224,7	script	ボララ#ep19in	21516,{/* 2861 */
	mes "[ボララ]";
	mes "勤務中、異常ありませぇぇん。";
	close;
}

jor_back1.gat,376,247,5	script	ボリラ#ep19in	21515,{/* 2862 */
	mes "[ボリラ]";
	mes "勤務中、異常ありませぇぇん。";
	close;
}

jor_tail.gat,239,40,5	script	ゴリリ#ep19in	21515,{/* 2863 */
	mes "[ゴリリ]";
	mes "勤務中、異常ありません！";
	close;
}

jor_tail.gat,285,94,5	script	ドラロ#ep19in	21515,{/* 2864 */
	mes "[ドラロ]";
	mes "勤務中……うん？知らない人間だな。";
	mes "風邪ひかないように気を付けてね。";
	mes "羽毛も全くないし…可哀そうに。";
	close;
}

jor_tail.gat,56,196,3	script	ポリャリョ#ep19in	21515,{/* 2865 */
	mes "[ポリャリョ]";
	mes "しーっ……静かに。";
	mes "釣りを邪魔しないでくれ。";
	mes "他の釣り場へ行ってみて。";
	close;
}

jor_back1.gat,95,256,5	script	トロロ#ep19in	21515,{/* 2866 */
	mes "[トロロ]";
	mes "人間、その氷の結晶の上には上がるな。";
	mes "沈んでしまう。気を付けないと。";
	close;
}

jor_back1.gat,81,266,5	script	コルロ#ep19in	21516,{/* 2867 */
	mes "[コルロ]";
	mes "勤務中、異常ありませぇぇん。へくしっ！";
	close;
}

icecastle.gat,101,216,5	script	ゴリュロ#ep19in	10461,{/* 2868 */
	mes "[ゴリュロ]";
	mes "ううん？";
	mes "名前が似たような子たちばかりって？";
	mes "全然違うよ？";
	mes "お前たちが聞き取れないだけなんだ。";
	close;
}

icecastle.gat,103,216,3	script	ゴルロ#ep19in	10461,{/* 2869 */
	mes "‐静かに毛づくろいをしている‐";
	close;
}

icecastle.gat,241,146,7	script	チョラリ#ep19in	10461,{/* 2870 */
	mes "[チョラリ]";
	mes "この辺には";
	mes "こんな見た目の生物はいないけど、";
	mes "ご先祖様が見た本物は、";
	mes "これとそっくりなのかな？";
	close;
}

icecastle.gat,243,147,7	script	氷の彫刻像#1	111,{/* 2871 */
	mes "作品名:";
	mes "＜　　　＞";
	mes "氷の城の地下から掘り出した一番堅い氷で、";
	mes "ジェファーソン・エイミー・絵稟・ソロモン・アリスター・";
	mes "クリーフ・エディス・モニカー・アリス・ニーマが作った。";
	mes "　";
	mes "‐警告：像に上らないでください‐";
	messize 180,364;
	close;
}

icecastle.gat,248,211,1	script	ドルリ#ep19in	10461,{/* 2872 */
	mes "[ドルリ]";
	mes "この作品には動物の名前が";
	mes "書かれていない。";
	mes "私たちの祖先は";
	mes "こんな見た目だったということかな？";
	close;
}

icecastle.gat,244,213,7	script	氷の彫刻像#2	111,{/* 2873 */
	mes "作品名:";
	mes "＜勇猛な先祖の魂＞";
	mes "氷の城の地下から掘り出した一番堅い氷で、";
	mes "ジェファーソン・エイミー・絵稟・ソロモン・アリスター・";
	mes "クリーフ・エディス・モニカー・アリス・ニーマが作った。";
	mes "　";
	mes "‐警告：像に上らないでください‐";
	messize 180,364;
	close;
}

icecastle.gat,172,153,3	script	ノリリ#ep19in	10461,{/* 2874 */
	unittalk getcharid(3),strcharinfo(0)+" : ‐凄く遠い場所を切ない目差しで見つめているようだ。特に何かの事情があるわけでは無さそうだ‐",1;
	end;
}

icecastle.gat,129,121,3	script	ホラリョン#1	10461,{/* 2875 */
	unittalk getcharid(3),strcharinfo(0)+" : ‐アーウィンの子供たちが、海の中を目をキラキラさせながら覗き込んでいる。魚を見ているようだ。‐",1;
	end;
}

icecastle.gat,131,121,3	script	ドリャルン#ep19in	10461,{/* 2876 */
	unittalk getcharid(3),strcharinfo(0)+" : ‐アーウィンの子供たちが、海の中を目をキラキラさせながら覗き込んでいる。魚を見ているようだ。‐",1;
	end;
}

icecastle.gat,130,136,5	script	ソロリョ#ep19in	21514,{/* 2877 */
	mes "[ソロリョ]";
	mes "ふぅ……！";
	mes "はっ！はあっ！";
	mes "たあっ！";
	close;
}

icecastle.gat,49,98,5	script	ゾロロ#1	10461,{/* 2878 */
	mes "[ゾロロ]";
	mes "人間は大人だよね？";
	mes "大人は本当のパトロール隊があるから、";
	mes "私たちのパトロール隊ごっこ遊びには";
	mes "入れてあげないよ。";
	close2;
	if('flag == 0) {
		set 'flag,rand(1,5);
		sleep 1000;
		set '@timer,'flag==1? 500: 1000;
		setarray '@name$,"ゾロロ#1","ノロル#1","ドリャロ#1","チョルリョン#1";
		setarray '@mes$,	"頭上注意！","頭上注意！","頭上注意！","注意！",
							"足！","元！","注！","意！",
							"(ひそひそ)","(ぶつぶつ)","なんて言ってるの？","私も入れて～",
							"お前たちに失望した！","失明した！","弁明だ！","発明した！",
							"に！","に！","さん！","し！";
		for(set '@i,0; '@i < 4; set '@i,'@i+1) {
			unittalk getnpcid(0,'@name$['@i]),substr('@name$['@i],0,-2)+ " : " +'@mes$[('flag-1)*4+'@i];
			sleep '@timer;
		}
		set 'flag,0;
	}
	end;
}

icecastle.gat,47,100,5	script	ノロル#1	10461,{/* 2879 */
	mes "[ノロル]";
	mes "人間は大人だよね？";
	mes "大人は本物のパトロール隊をやって。";
	mes "私たちはこの辺の担当だよ。";
	close;
}

icecastle.gat,45,102,5	script	ドリャロ#1	10461,{/* 2880 */
	mes "[ドリャロ]";
	mes "人間は大人だよね？";
	mes "大人は本物のパトロール隊をやって。";
	mes "私たちの訓練を邪魔しないで。";
	close;
}

icecastle.gat,43,104,5	script	チョルリョン#1	10461,{/* 2881 */
	mes "[チョルリョン]";
	mes "人間は大人だよね？";
	mes "大人は本物のパトロール隊をやって。";
	mes "私たちのやることを覗かずに。";
	close;
}

icecastle.gat,77,106,3	script	モロリョ#ep19in	10461,{/* 2882 */
	mes "[モロリョ]";
	mes "新鮮じゃない魚はな、";
	mes "下ごしらえが肝心だよ。";
	mes "先祖代々伝わる技がある。";
	mes "教えてあげようか？";
	next;
	if(select("うん","必要ない") == 2) {
		mes "[モロリョ]";
		mes "残念だな。";
		close;
	}
	mes "[モロリョ]";
	mes "よし、さぁ先ずは鰓をくちばしで…";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "……。";
	next;
	mes "[モロリョ]";
	mes "……。";
	next;
	mes "[モロリョ]";
	mes "人間にはくちばしがない。";
	mes "見落としてた。";
	close;
}

icecastle.gat,73,101,7	script	チョラルン#ep19in	10461,{/* 2883 */
	mes "‐モロリョの技を、";
	mes "　真剣に目に焼き付けているようだ‐";
	close2;
	unittalk getnpcid(0,"モロリョ#ep19in"),"モロリョ : チョラルン、君ももっと大きくなったら教えてあげよう。";
	unittalk getnpcid(0,"チョラルン#ep19in"),"チョラルン : うん！";
	end;
}

icecastle.gat,90,100,3	script	ノロリョン#ep19in	10461,{/* 2884 */
	mes "[ノロリョン]";
	mes "人間も、一杯どうだ？";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "それはなに？";
	next;
	mes "[ノロリョン]";
	mes "アドカラだよ。体が熱くなる。";
	next;
	mes "‐物凄く強いアルコールの匂いがする";
	mes "　羽毛に隠れて見えない";
	mes "　アーウィンの顔が、";
	mes "　真っ赤に染まっていそうな感じだ‐";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "結構です。";
	next;
	mes "[ノロリョン]";
	mes "美味しいのに。";
	close;
}

icecastle.gat,86,100,5	script	ポララ#ep19in	10461,{/* 2885 */
	mes "[ポララ]";
	mes "人間、酒は好きかい？";
	mes "これを飲むと温まるよ。";
	mes "茎ワカメで仕込んだ酒だけど、";
	mes "悪くない。";
	next;
	mes "‐物凄く強いアルコールの匂いと、";
	mes "　深いワカメの香りが混ざり、";
	mes "　上手く調和している‐";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "……結構です。";
	next;
	mes "[ポララ]";
	mes "このワカメをすくって食べても";
	mes "美味しいのに……残念だな。";
	close;
}
icecastle.gat,85,95,5	script	トリロ#ep19in	10461,{/* 2886 */
	mes "[トリロ]";
	mes "これはあげないよ！";
	mes "人間も食べたいなら、";
	mes "あっちで氷を砕いてこい。";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "それはなに？";
	next;
	mes "[トリロ]";
	mes "スノースラッシュ！";
	mes "くちばしで氷を砕いて、";
	mes "カラマリンを切り刻んだものを";
	mes "まぶすとできるけど……。";
	next;
	mes "[トリロ]";
	mes "人間はくちばしがないよね。";
	mes "不便そう。";
	close2;
	unittalk getnpcid(0,"ポララ#ep19in"),"ポララ : そんな……くちばしが無いとは……";
	unittalk getnpcid(0,"オリル#ep19in"),"オリル : そんな……";
	unittalk getnpcid(0,"ノロリョン#ep19in"),"ノロリョン : ひくっ。";
	end;
}

icecastle.gat,89,94,3	script	オリル#ep19in	10461,{/* 2887 */
	mes "[オリル]";
	mes "大人なら酒を飲んでもいい。";
	mes "水は外では飲めないよ。";
	mes "室内で氷を溶かして飲んで。";
	close;
}

icas_in.gat,95,57,0	script	イーグルパトロール隊#iw	139,{/* 2889 */}
icas_in.gat,95,62,6	script	イーグルパトロール隊#iw	858,{/* 2890 */}

icas_in.gat,33,53,8	script	一等兵ホリリュ#in_iwp	21513,{/* 2891 */
	cutin "ep19_iwin08.png", 2;
	emotion 56,"一等兵ホリリュ#in_iwp";
	unittalk "一等兵ホリリュ : 一等兵ホリリュ!",1;
	if(!sleep2(1000)) end;
	cutin "ep19_iwin09.png", 2;
	mes "[一等兵ホリリュ]";
	mes "あっ！";
	mes "なんだ、先任アーウィンじゃないな。";
	mes "えぇい……驚いて損した……。";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:一等兵ホリリュ#in_iwp(2891)
	end;
}

icas_in.gat,42,53,8	script	新兵ポロロン#s_iw	21513,{/* 2892 */
	unittalk "Z.....z....z...";
	unittalk getcharid(3),strcharinfo(0)+" : 深く眠っている。",1;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:新兵ポロロン#s_iw(2892)
	end;
}

icas_in.gat,51,53,8	script	新兵ホルルン#s_iw	21513,{/* 2893 */
	unittalk "z Z z Z z";
	unittalk getcharid(3),strcharinfo(0)+" : 深く眠っている。",1;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:新兵ホルルン#s_iw(2893)
	end;
}

icas_in.gat,33,68,4	script	？？？ゴロリ#s_iw	21513,{/* 2894 */
	unittalk "zzzz..ZZ..zzz",1;
	unittalk getcharid(3),strcharinfo(0)+" : 深く眠っている。",1;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:？？？ゴロリ#s_iw(2894)
	end;
}

icas_in.gat,42,68,4	script	二等兵トラリ#s_iw	21513,{/* 2895 */
	unittalk "zz zZz zz zZz";
	unittalk getcharid(3),strcharinfo(0)+" : 深く眠っている。",1;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:二等兵トラリ#s_iw(2895)
	end;
}

icas_in.gat,51,68,4	script	二等兵トラロン#s_iw	21513,{/* 2896 */
	unittalk "…z……Z…Z…z";
	unittalk getcharid(3),strcharinfo(0)+" : 深く眠っている。",1;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:二等兵トラロン#s_iw(2896)
	end;
}

icas_in.gat,56,60,2	script	新入幹部オリリョ#c_iw	21518,{/* 2897 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,42,57,6	script	新兵ポロロン#m_iw	21514,{/* 2898 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,52,57,6	script	新兵ホルルン#m_iw	21514,{/* 2899 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,33,65,4	script	？？？ゴロリ#m_iw	21517,{/* 2900 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,42,65,6	script	二等兵トラリ#m_iw	21515,{/* 2901 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,49,65,6	script	二等兵トラロン#m_iw	21515,{/* 2902 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

// 浄化の聖女
icas_in.gat,163,226,0	script	#ep19_healrock_sw_1	139,4,4,{/* 2903 */
	switch(EP19_2QUE) {
	case 4:
		cloakoffnpc "ヴォークリンデ#ep19";
		cloakoffnpc "レハール#ep19_2";
		cloakonnpc "マラム#ep19";
		cloakonnpc "ミリアム#ep19";
		cloakonnpc "レハール#ep19";
		end;
	case 5:
		cloakoffnpc "ヴォークリンデ#ep19";
		cloakoffnpc "レハール#ep19_2";
		end;
	case 6:
	case 7:
		end;
	default:
		if(EP19_1QUE >= 12)
			cloakoffnpc "ヴォークリンデ#ep19";
		end;
	}
	end;
}
icas_in.gat,163,226,3	script	ヴォークリンデ#ep19	10467,{/* 2904 (cloaking)*/
	switch(EP19_2QUE) {
	case 0:
		if(EP19_1QUE < 12)
			end;
		mes "[ヴォークリンデ]";
		mes "よく来たね！";
		mes "レハールはどうしたんだい？";
		cloakoffnpc "ヴォークリンデ#ep19";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "レハールは他の用事があるから、";
		mes "先に行けと言われたって？";
		mes "あの子はいつも自分ばかりが";
		mes "忙しいんだから。";
		mes "やれやれ……。";
		next;
		mes "[ヴォークリンデ]";
		mes "いつ来るか分からない子を";
		mes "待つ暇はないな。";
		mes "おばさん、";
		mes "聞きたいことがあるんだけど、";
		mes "時間は大丈夫かい？";
		next;
		if(select("大丈夫です","忙しいです") == 2) {
			mes "[ヴォークリンデ]";
			mes "そうかい。";
			mes "それなら仕方がないさね。";
			mes "忙しいだろうから、";
			mes "早く仕事に戻るといいさ。";
			cutin "ep19_voglinde02.png", 0;
			close2;
			cutin "ep19_voglinde02.png", 255;
			end;
		}
		mes "[ヴォークリンデ]";
		mes "そうかい！";
		mes "ありがとうね！";
		mes "それじゃあ、先ずは";
		mes "遠くから来てお腹も空いてるだろうから、";
		mes "これを一つお食べ。";
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep19_friederike04.png", 255;
			end;
		}
		setquest 130500;
		delquest 18128;
		set EP19_2QUE,1;
		getitem 12322,1;
		cutin "ep19_voglinde04.png", 0;
		close2;
		//showevent 0, 3, "ヴォークリンデ#ep19";	// 2890: 163, 226
		cutin "ep19_voglinde04.png", 255;
		end;
	case 1:
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "大したことじゃないんだが、";
		mes "飛行船に乗って来た時のことを";
		mes "思い出しておくれ。";
		next;
		mes "[ヴォークリンデ]";
		mes "一緒に乗っていた人たちの中に、";
		mes "^e5555e髪の毛がこんなに……";
		mes "^e5555eいや、こんなもんだったかね？";
		mes "^e5555eヘンテコな鞄を持ったカーディナル^000000は、";
		mes "いなかったかい？";
		next;
		mes "[ヴォークリンデ]";
		mes "特徴があやふやで、すまないね。";
		mes "私もここへ来てからは";
		mes "手紙の交換だけだから、";
		mes "直に見ていなくて、";
		mes "確信が持てないんだ。";
		next;
		menu "見てません",-;
		mes "[ヴォークリンデ]";
		mes "そうかい……。";
		mes "苦労して支援許可を貰ったんだがね……";
		mes "はぁ……本当に頭が痛い。";
		mes "レハールには^e5555eプロンテラ^000000から";
		mes "連れてくるように言っておいたんだがね。";
		next;
		mes "[ヴォークリンデ]";
		mes "あの子はあの子で";
		mes "レオンたちとの顔合わせが";
		mes "終わった途端に消えて、";
		mes "どこへ行ったのかも分からないし……。";
		mes "こんなことしてる場合じゃないんだがね。";
		mes "うーん……どうしたもんか。";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "すまないが、";
		mes "一つ頼みを聞いてくれないかい？";
		mes "今、おばさんは忙し過ぎて、";
		mes "ここを離れられないんだ。";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "^e5555e飛行船に一緒に乗ってきた子たち^000000に、";
		mes "^e5555e青色の服で、髪の長い、";
		mes "^e5555eベールを被ったカーディナル^000000を";
		mes "見なかったか確認してきてくれるかい？";
		mes "事情があって今は詳しく話せないが、";
		mes "本当に重要な子なんだ。";
		close2;
		cloakoffnpc "マラム#ep19";
		cutin "ep19_voglinde01.png", 255;
		setquest 11794;
		delquest 130500;
		set EP19_2QUE,2;
		mes "‐マラムのもとへ向かいますか？‐";
		next;
		//showevent 0, 3, "マラム#ep19";	// 2894: 130, 201
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐マラムのもとへ向かった‐";
		close2;
		warp "icas_in.gat", 132, 199;	// from: icas_in.gat(161, 226)
		end;
	case 2:
	case 3:
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "^e5555e飛行船に一緒に乗ってきた子たち^000000に、";
		mes "^e5555e青色の服で、髪の長い、";
		mes "^e5555eベールを被ったカーディナル^000000を";
		mes "見なかったか確認してきてくれるかい？";
		mes "事情があって今は詳しく話せないが、";
		mes "本当に重要な子なんだ。";
		next;
		cloakoffnpc "マラム#ep19";
		cutin "ep19_voglinde01.png", 255;
		mes "‐マラムのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐マラムのもとへ向かった‐";
		close2;
		warp "icas_in.gat", 132, 199;	// from: icas_in.gat(161, 226)
		end;
	case 4:
		mes "[ヴォークリンデ]";
		mes "おや、戻ってきたんだね。";
		mes "外は寒くて苦労しただろう？";
		mes "それで、あの子は見つかったかい？";
		cutin "ep19_voglinde01.png", 0;
		next;
		menu "正直に言う",-;
		mes "[ヴォークリンデ]";
		mes "<FONT SIZE = 16><B>まぁ！！</FONT></B>";
		mes "<FONT SIZE = 16><B>呆れた……本当に！</FONT></B>";
		mes "<FONT SIZE = 16><B>本当に呆れたよ！この子は！</FONT></B>";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[レハール]";
		mes "違います！";
		mes "伯母さん！落ち着いて！";
		mes "伯母さん、そうじゃないんです！";
		cutin "ep19_lehar05.png", 2;
		cloakoffnpc "レハール#ep19_2";
		next;
		mes "[ヴォークリンデ]";
		mes "<FONT SIZE = 16><B>そうじゃないなら、何だというんだ！</FONT></B>";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "だから、忘れないようにと";
		mes "あんなに注意したじゃないか！";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "はぁ……仕方ないね。";
		mes "そっちの子、";
		mes "悪いんだがもう一つ、";
		mes "おばさんの頼みを聞いてくれるかい？";
		next;
		mes "[ヴォークリンデ]";
		mes "ここまで苦労してきてもらったのに";
		mes "申し訳ないんだが、";
		mes "また^e5555eミッドガルド^000000へ戻って、";
		mes "カーディナルの子を";
		mes "見付けてきてくれないかい？";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "ミッドガルドに戻る際には、";
		mes "ヘルロックというトナカイみたいな子が";
		mes "足になってくれる。";
		mes "君たちが飛行船で着陸した場所の近くに";
		mes "いるから、まずはそこへ向かっておくれ。";
		mes "話はおばさんから通しておく。";
		next;
		mes "[ヴォークリンデ]";
		mes "ヘルロック君は";
		mes "アルデバランまでは";
		mes "連れて行ってくれるはずだから、";
		mes "その後は^0000ffプロンテラの大聖堂^000000に向かい、";
		mes "^0000ffアリス^000000という";
		mes "アコライト担当官に会っておくれ。";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "アリスに会えたなら、";
		mes "ヴォークリンデから";
		mes "<B>^0000ff聖女^000000</B>の件で依頼を受けた";
		mes "と伝えれば話は通じるはずだ。";
		next;
		mes "[ヴォークリンデ]";
		mes "そして、今、このことについては";
		mes "誰にも話しちゃいけないよ。";
		mes "解った？";
		mes "それじゃ、よろしく頼むよ。";
		cutin "ep19_voglinde04.png", 0;
		next;
		cutin "ep19_voglinde02.png", 255;
		setquest 11797;
		delquest 11796;
		set EP19_2QUE,5;
		//showevent 0, 3, "ヴォークリンデ#ep19";	// 2890: 163, 226
		//showevent 0, 3, "ヘルロック#ep19";	// 2896: 211, 63
		unittalk getnpcid(0,"レハール#ep19_2"),"レハール : 伯母さん！その件は私がもう一度いってきますから！";
		unittalk getnpcid(0,"ヴォークリンデ#ep19"),"ヴォークリンデ : あんたはちょっと話があるから、黙って礼拝室まで付いてきなさい。";
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"レハール#ep19_2"),"レハール : 顔も名前も知らないのに、どうやって確認するんですか！伯母さん！！私は無実ですよ！誰なのか名前も教えてくれなかったじゃないですか！！";
		unittalk getnpcid(0,"ヴォークリンデ#ep19"),"ヴォークリンデ : どうして分からないんだい！！昔あったじゃないか！！";
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"レハール#ep19_2"),"レハール : 何年前の話ですか！！小さい頃に会った切りじゃないですか！伯母さん！！ぐぁ！！待ってください！！！"+strcharinfo(0)+"様！助けて！私、このままじゃ……！！！！";
		unittalk getnpcid(0,"ヴォークリンデ#ep19"),"ヴォークリンデ : 誰が取って食うとでもいうんだい？早く来な！";
		if(!sleep2(3000)) end;
		mes "‐ヘルロックのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ヘルロックのもとへ向かった‐";
		close2;
		warp "jor_tail.gat", 214, 61;	// from: icas_in.gat(157, 229)
		end;
	case 5:
		cloakoffnpc "ヴォークリンデ#ep19";
		mes "[ヴォークリンデ]";
		mes "ヘルロック君は";
		mes "アルデバランまでは";
		mes "連れて行ってくれるはずだから、";
		mes "その後は^0000ffプロンテラの大聖堂^000000に向かい、";
		mes "^0000ffアリス^000000という";
		mes "アコライト担当官に会っておくれ。";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "アリスに会えたなら、";
		mes "ヴォークリンデから";
		mes "<B>^0000ff聖女^000000</B>の件で依頼を受けた";
		mes "と伝えれば話は通じるはずだ。";
		cutin "ep19_voglinde02.png", 255;
		mes "‐ヘルロックのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ヘルロックのもとへ向かった‐";
		close2;
		warp "jor_tail.gat", 214, 61;	// from: icas_in.gat(159, 224)
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,162,228,5	script	レハール#ep19_2	10469,{/* 2905 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,130,201,0	script	#ep19_healrock_sw_2	139,4,4,{/* 2906 */
	switch(EP19_2QUE) {
	case 2:
		cloakoffnpc "マラム#ep19";
		end;
	case 3:
		cloakoffnpc "マラム#ep19";
		cloakoffnpc "レハール#ep19";
		end;
	case 4:
		cloakoffnpc "マラム#ep19";
		cloakoffnpc "ミリアム#ep19";
		cloakoffnpc "レハール#ep19";
		end;
	}
	end;
}
icas_in.gat,132,201,3	script	ミリアム#ep19	10377,{/* 2907 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,130,201,5	script	マラム#ep19	10376,{/* 2908 (cloaking)*/
	switch(EP19_2QUE) {
	case 2:
		cloakoffnpc "マラム#ep19";
		mes "[マラム]";
		mes "ここは灰色狼の村とは";
		mes "比べられないほど寒いですね。";
		mes "ラヘル……いやミッドガルド大陸を";
		mes "離れてこんな場所までくるとは、";
		mes "複雑な気持ちです。";
		cutin "ep18_maram_03.png", 2;
		next;
		mes "[マラム]";
		mes "氷しかない場所だから不思議でもあり、";
		mes "段々私が責任を取るものが増えていて";
		mes "不安でもあり……。";
		next;
		mes "[マラム]";
		mes "あ……身の上話がしたかったわけでは";
		mes "ないんです。";
		mes "単に妙な気分になっただけなので、";
		mes "気にしないでください。";
		cutin "ep18_maram_02.png", 2;
		next;
		mes "[マラム]";
		mes "それより何か用件があって";
		mes "僕の所に来たんですよね？";
		mes "どういうご用件ですか？";
		cutin "ep18_maram_01.png", 2;
		next;
		menu "カーディナルについて聞く",-;
		mes "[マラム]";
		mes "カーディナルの方ですか……。";
		mes "そんな方はいなかったとおもいますが……";
		mes "もしも、飛行船に一緒に乗っていたなら";
		mes "気づかないはずはないですね。";
		mes "人数も多くなかったですし。";
		next;
		mes "[マラム]";
		mes "正直、情報が少なすぎますね。";
		mes "^e5555eレハール^000000様に直接聞いてみた方が、";
		mes "いいじゃないでしょうか？";
		cutin "ep18_maram_03.png", 2;
		next;
		menu "レハールに付いて聞く",-;
		mes "[マラム]";
		mes "レハール様なら、";
		mes "少し前に外へ出かけたみたいですが……。";
		next;
		mes "[マラム]";
		mes "あっ、ちょうど戻ってきたみたいですね。";
		mes "レハール様！！";
		cutin "ep18_maram_02.png", 2;
		cloakoffnpc "レハール#ep19";
		setquest 11795;
		delquest 11794;
		set EP19_2QUE,3;
		close2;
		//showevent 9999, 0, "マラム#ep19";	// 2894: 130, 201
		//showevent 0, 3, "レハール#ep19";	// 2895: 136, 197
		cutin "ep18_maram_02.png", 255;
		end;
	case 3:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ちょうどレハール様が";
		mes "戻ってきたみたいですよ。";
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakoffnpc "レハール#ep19";
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,136,197,3	script	レハール#ep19	10469,{/* 2909 (cloaking)*/
	switch(EP19_2QUE) {
	case 3:
		mes "[レハール]";
		mes "何ですか？";
		mes "今は忙しいから、";
		mes "急用じゃなければ後にして";
		mes "ほしいのですが……。";
		cutin "ep19_lehar01.png", 2;
		next;
		menu "カーディナルについて聞く",-;
		mes "[レハール]";
		mes "^e5555e髪が長くて青い服に";
		mes "^e5555eベールを被ったカーディナル^000000ですか？";
		mes "飛行船で挨拶もしたじゃありませんか。";
		mes strcharinfo(0)+"さんも一緒にいたじゃないですか。";
		cutin "ep19_lehar02.png", 2;
		next;
		mes "[マラム]";
		mes "一緒にいたですって？";
		cutin "ep18_maram_03.png", 2;
		hideoffnpc "マラム#ep19";
		next;
		mes "[レハール]";
		mes "はい。";
		mes "マラム様もよくご存じじゃありませんか？";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[マラム]";
		mes "？？？";
		cutin "ep18_maram_03.png", 2;
		next;
		mes "[ミリアム]";
		mes "マラム!";
		mes "ここで何やってるの！";
		mes "のんびりしてる場合じゃないよ！！";
		cutin "ep18_miriam_01.png", 0;
		cloakoffnpc "ミリアム#ep19";
		next;
		mes "[ミリアム]";
		mes "早く次の予定を決めよう。";
		mes "さっきヴォークリンデ様が";
		mes "仰った話も整理したいし。";
		next;
		mes "[マラム]";
		mes "落ち着いて、ミリアム。";
		mes "先ずは他の方たちと";
		mes "議論もしないといけないから。";
		cutin "ep18_maram_01.png", 2;
		next;
		mes "[レハール]";
		mes "ちょうどいらっしゃいましたね。";
		mes "^e5555e髪が長くて、青い服に、";
		mes "^e5555eベールを被ったカーディナル！！^000000";
		cutin "ep19_lehar02.png", 2;
		next;
		mes "[マラム]";
		mes "えっ……？";
		cutin "ep18_maram_01.png", 2;
		next;
		mes "[ミリアム]";
		mes "うん……？";
		mes "ボクはカーディナルじゃないよ？";
		cutin "ep18_miriam_03.png", 0;
		next;
		mes "[レハール]";
		mes "……えっ？";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "‐レハールの額から、";
		mes "　冷や汗が滝のように流れ始めた‐";
		next;
		mes "[ミリアム]";
		mes "レハール様、急にどうされましたか？";
		mes "顔色が悪いですが、具合でも悪いのですか？";
		cutin "ep18_miriam_03.png", 0;
		unittalk getnpcid(0,"ミリアム#ep19"),"ミリアム : 冷汗が！！！";
		next;
		mes "[レハール]";
		mes "ちょ……ちょっとミリアム様、";
		mes "プロンテラ聖堂のあの……";
		mes "アリス様の紹介で、あの……";
		mes "極秘の……。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[ミリアム]";
		mes "ボクはマラムと一緒に";
		mes "ラヘルから来たよ？";
		cutin "ep18_miriam_03.png", 0;
		next;
		mes "[レハール]";
		mes "ああ……。";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[レハール]";
		mes "これは……私が勘違いしていた……？";
		mes "あ、完全に終わ……。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[マラム]";
		mes "う～ん……";
		mes "何やらよく分かりませんが、";
		mes "レハール様が";
		mes "こうも慌てているところをみると、";
		mes "一旦、^e5555eヴォークリンデ^000000様に";
		mes "話をした方がよさそうですね。";
		cutin "ep18_maram_03.png", 2;
		next;
		menu "そうしよう",-;
		mes "[レハール]";
		mes "<FONT SIZE = 16><B>ちょっと待ってください！！</FONT></B>";
		mes "<FONT SIZE = 16><B>ダメです！！それだけは！</FONT></B>";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[レハール]";
		mes "<FONT SIZE = 16><B>私、殺されちゃいますよ！</FONT></B>";
		mes strcharinfo(0)+"様！！！";
		cutin "ep19_lehar04.png", 2;
		setquest 11796;
		delquest 11795;
		set EP19_2QUE,4;
		close2;
		//showevent 0, 3, "ヴォークリンデ#ep19";	// 2890: 163, 226
		//showevent 9999, 0, "マラム#ep19";	// 2894: 130, 201
		//showevent 9999, 0, "レハール#ep19";	// 2895: 136, 197
		cutin "ep19_lehar04.png", 255;
		end;
	case 4:
		cloakoffnpc "マラム#ep19";
		cloakoffnpc "ミリアム#ep19";
		cloakoffnpc "レハール#ep19";
		mes "[レハール]";
		mes "<FONT SIZE = 16><B>お願いします！</FONT></B>";
		mes "<FONT SIZE = 16><B>叔母には内緒にしてください！</FONT></B>";
		mes "<FONT SIZE = 16><B>私、殺されちゃいますよ！</FONT></B>";
		mes strcharinfo(0)+"様！！！";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[マラム]";
		mes "一旦、^e5555eヴォークリンデ^000000様に";
		mes "話しに行きましょう。";
		cutin "ep18_maram_03.png", 2;
		close2;
		cutin "ep19_lehar04.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,211,63,5	script	ヘルロック#ep19	10460,{/* 2910 */
	switch(EP19_2QUE) {
	case 5:
		mes "[ヘルロック]";
		mes "おっ。";
		mes "<FONT SIZE = 16><B>こんにちは。</FONT></B>";
		mes strcharinfo(0)+"さん！";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[ヘルロック]";
		mes "ヴォークリンデ様から話は聞いています。";
		mes "^e5555eミッドナイト^000000へ";
		mes "行かれるんでしたよね？";
		cutin "ep19_healrock01.png", 2;
		next;
		switch(select("ミッドナイト？","ミッドガルド大陸のこと？")) {
		case 1:
			mes "[ヘルロック]";
			mes "アルデバランがある、";
			mes "向こう側の大陸のことですよ！";
			break;
		case 2:
			mes "[ヘルロック]";
			mes "それです！";
			break;
		}
		next;
		mes "[ヘルロック]";
		mes strcharinfo(0)+"さんだけ、";
		mes "いらっしゃるんですよね？";
		mes "ちょっと軽すぎるけど……";
		mes "砂袋でも少し乗せるべきかな……？";
		mes "このまま走ったら、筋肉が落ちてしまう。";
		next;
		menu "筋肉……？",-;
		mes "[ヘルロック]";
		mes "おっと、失礼。";
		mes "とにかく早く出発しましょう！";
		next;
		mes "[ヘルロック]";
		mes "^e5555eアルデバラン^000000には、";
		mes "私が直接ソリを引いて移動しますから、";
		mes "心配しないでください。";
		mes "私の広い背中に";
		mes "がっちりと固定しますから！";
		next;
		mes "[ヘルロック]";
		mes "運動にもなるし！";
		mes "正に一石二鳥ではありませんか！";
		mes "はははっ！！！";
		next;
		if(select("出発","待機") == 2) {
			mes "[ヘルロック]";
			mes "そうですか？";
			mes "では準備できたら話しかけてくださいね。";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
		mes "[ヘルロック]";
		mes "では出発しますよ。";
		mes "しっかり掴まってください！";
		setquest 11798;
		delquest 11797;
		set EP19_2QUE,6;
		close2;
		//showevent 0, 3, "ヘルロック#ep19";	// 2896: 211, 63
		//showevent 0, 3, "ヘルロック#ep19_a";	// 5716: 102, 103
		cutin "ep19_healrock01.png", 255;
		warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(222, 64) port : 5122
		end;
	case 6:
		mes "[ヘルロック]";
		//mes "とにかく早く出発してみまよう！";
		mes "とにかく早く出発してみましょう！";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[ヘルロック]";
		mes "^e5555eアルデバラン^000000には、";
		mes "私が直接ソリを引いて移動しますから、";
		mes "心配しないでください。";
		mes "私の広い背中に";
		mes "がっちりと固定しますから！";
		next;
		mes "[ヘルロック]";
		mes "では出発しますよ。";
		mes "しっかり掴まってください！";
		close2;
		cutin "ep19_healrock01.png", 255;
		warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(216, 58) port : 5122
		end;
	case 17:
	case 18:
		mes "[ヘルロック]";
		mes "うぐっ……";
		mes "う……うあぁ……！！";
		cutin "ep19_healrock03.png", 2;
		next;
		mes "[ヘルロック]";
		mes "腰が限界です……！";
		mes "申し訳ないですが、氷の城までは、";
		mes "ご自分で移動をお願いします……！";
		cutin "ep19_healrock03.png", 255;
		if(EP19_2QUE == 17) {
			setquest 130501;	showevent 0, 3, "レハール#ep19_3";	// 2902: 27, 123
			delquest 11809;
			set EP19_2QUE,18;
		}
		next;
		//showevent 0, 3, "ヘルロック#ep19";	// 2896: 211, 63
		mes "‐氷の城へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ向かった‐";
		close2;
		warp "icecastle.gat", 23, 123;	// from: jor_tail.gat(214, 60)
		end;
	}
	if(EP19_2QUE >= 19) {
		mes "[ヘルロック]";
		mes "こんにちは！！！";
		mes "今日もアルデバランへ行かれますか？";
		mes "それとも、氷の城へ戻りますか？";
		cutin "ep19_healrock01.png", 2;
		next;
		switch(select("アルデバランへ","氷の城へ","待機")) {
		case 1:
			mes "[ヘルロック]";
			mes "では出発しますよ。";
			mes "しっかり捕まって！";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(214, 60) port : 5122
			end;
		case 2:
			mes "[ヘルロック]";
			mes "では出発しますよ。";
			mes "しっかり捕まって！";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "icecastle.gat", 55, 120;	// from: jor_tail.gat(213, 62)
			end;
		case 3:
			mes "[ヘルロック]";
			mes "そうですか？";
			mes "では、準備できましたら";
			mes "話しかけてくださいね。";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
	}
	else if(EP19_2QUE >= 7) {
		mes "[ヘルロック]";
		mes "こんにちは！！！";
		mes "今日もアルデバランへ行かれますか？";
		mes "それとも、氷の城へ戻りますか？";
		cutin "ep19_healrock01.png", 2;
		next;
		switch(select("アルデバランへ","氷の城へ","待機")) {
		case 1:
			mes "[ヘルロック]";
			mes "では出発しますよ。";
			mes "しっかり捕まって！";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(218, 67) port : 5122
			end;
		case 2:
			mes "[ヘルロック]";
			mes "では出発しますよ。";
			mes "しっかり捕まって！";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "icecastle.gat", 55, 120;	// from: jor_tail.gat(219, 53)
			end;
		case 3:
			mes "[ヘルロック]";
			mes "そうですか？";
			mes "では、準備できましたら";
			mes "話しかけてくださいね。";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
	}
	mes "[ヘルロック]";
	mes "むははははっ！！";
	mes "では、今日も一生懸命";
	mes "三角筋を酷使してみようか！";
	cutin "ep19_healrock01.png", 2;
	close2;
	cutin "ep19_healrock01.png", 255;
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[転送]";
	end;
}

aldebaran.gat,102,103,5	script	ヘルロック#ep19_a	10460,{/* 5730 */
	switch(EP19_2QUE) {
	case 6:
	case 7:
		mes "[ヘルロック]";
		mes "あ！"+strcharinfo(0)+"様。";
		mes "やっと気が付きましたか！";
		mes "アルデバランです。";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[ヘルロック]";
		mes "私は様々な協定の所為で";
		mes "プロンテラまで行けませんから、";
		mes "ここで待ってますね。";
		mes "用事が終わったら";
		mes "^e5555eアルデバラン^000000へ";
		mes "来てください。";
		if(EP19_2QUE == 6) {
			setquest 11799;
			delquest 11798;
			set EP19_2QUE,7;
		}
		next;
		//showevent 9999, 0, "ヘルロック#ep19_a";	// 5716: 102, 103
		unittalk "ヘルロック : 私は折角ミッドガルドに来たので、新発売された大豆タンパク質パウダーを買わなきゃ！",1;
		cutin "ep19_healrock01.png", 255;
		mes "‐プロンテラへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐プロンテラへ向かった‐";
		close2;
		warp "prontera.gat", 254, 305;	// from: aldebaran.gat(108, 103) port : 5121
		end;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
		mes "[ヘルロック]";
		mes "プロンテラでの用事は";
		mes "全部終わりましたか？";
		mes "終わったら^e5555eアルデバラン^000000に来てください。";
		cutin "ep19_healrock01.png", 2;
		close2;
		cutin "ep19_healrock01.png", 255;
		end;
	case 16:
	case 17:
	case 18:
		mes "[ヘルロック]";
		mes "いらっしゃいましたか。";
		mes "ではすぐに……待って……";
		mes "人数がヴォークリンデ様の仰っていたより";
		mes "ずいぶんと多くなっていませんか……？";
		mes "カーディナルが1人のはずじゃ……。";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[ヘルロック]";
		mes "それに、皆さんが手に持っている物は";
		mes "なんですか？";
		mes "荷物が少しありますって？";
		mes "鞄が一、二、……ちょっと待ってください！";
		next;
		mes "[ヘルロック]";
		mes "いやいや、ダメという訳じゃなくて";
		mes "ですね……その……";
		mes "荷物が……ちょっと……。";
		cutin "ep19_healrock02.png", 2;
		next;
		if(select("出発","待機") == 2) {
			mes "[ヘルロック]";
			mes "そうですか？";
			mes "では準備できましたら、";
			mes "話しかけてくださいね。";
			close2;
			cutin "ep19_healrock02.png", 255;
			end;
		}
		mes "[テューリアン]";
		mes "あれ？？";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[ヘルロック]";
		mes "では行きます……";
		mes "うおぉぉぉぉ！！！";
		cutin "ep19_healrock02.png", 2;
		next;
		mes "[ヘルロック]";
		mes "うぐっ……！";
		mes "持ってくれよ……！";
		mes "私……私の腰……！";
		cutin "ep19_healrock03.png", 2;
		if(EP19_2QUE == 16) {
			setquest 11809;
			delquest 11808;
			set EP19_2QUE,17;
		}
		close2;
		//showevent 0, 3, "ヘルロック#ep19_a";	// 5716: 102, 103
		cutin "ep19_healrock03.png", 255;
		warp "jor_tail.gat", 214, 60;	// from: aldebaran.gat(104, 105) port : 5121
		end;
	}
	if(EP19_2QUE >= 19) {
		mes "[ヘルロック]";
		mes "こんにちは！！！";
		mes "今日も^e5555eイスガルド^000000へ行かれますか？";
		cutin "ep19_healrock01.png", 2;
		next;
		if(select("出発","待機") == 2) {
			mes "[ヘルロック]";
			mes "そうですか？";
			mes "では準備できましたら、";
			mes "話しかけてくださいね。";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
		mes "[ヘルロック]";
		mes "では出発しますよ。";
		mes "しっかり捕まって！";
		close2;
		cutin "ep19_healrock01.png", 255;
		warp "jor_tail.gat", 214, 60;	// from: aldebaran.gat(108, 103) port : 5121
		end;
	}
	mes "[ヘルロック]";
	mes "こんにちは。";
	mes "冒険者様、いいお天気ですよね？";
	cutin "ep19_healrock01.png", 2;
	close;
	cutin "ep19_healrock01.png", 255;
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[転送]";
	end;
}

prontera.gat,254,309,3	script	アリス#ep19	641,{/* 1305 */
	if(EP19_2QUE == 7) {
		//showevent 0, 3, "アリス#ep19";	// 1305: 254, 309
		cutin "acact_01.bmp", 2;
		mes "[アリス]";
		mes "あら！こんにちは。";
		mes "私はアコライト担当官のアリスです。";
		mes "どういうご用件ですか？";
		mes "アコライトになりたい訳じゃ";
		mes "なさそうですけれど……。";
		cutin "acact_01.bmp", 2;
		next;
		menu "ヴォークリンデに頼まれた",-;
		mes "[アリス]";
		mes "ヴォークリンデ様ですか……？";
		mes "……。";
		cutin "acact_03.bmp", 2;
		next;
		menu "聖女",-;
		mes "[アリス]";
		mes "そこまでご存じなら、";
		mes "隠す必要は無さそうですね。";
		cutin "acact_01.bmp", 2;
		next;
		mes "[アリス]";
		mes "あの娘ならレハール様が";
		mes "お探しでしたので、";
		mes "約束の場所へ向かわせました。";
		mes "また何かあったんですか？";
		cutin "acact_03.bmp", 2;
		next;
		menu "消えました",-;
		mes "[アリス]";
		mes "<FONT SIZE = 16><B>はい？！</FONT></B>";
		mes "ちょっと……！！";
		mes "ただ消えたで終わるものでは";
		mes "ないんですけど！！";
		cutin "acact_04.bmp", 2;
		next;
		mes "[アリス]";
		mes "えぇ……？";
		mes "あの娘を連れてどこかへ行く際は、";
		mes "到着するまで";
		mes "目を離しちゃダメなのに……。";
		mes "ちょっと……レハール様、";
		mes "いったい……。";
		next;
		menu "大丈夫？",-;
		mes "[アリス]";
		mes "失礼、取り乱しました。";
		mes "ひと先ず、あの娘の^e5555e部屋^000000へ";
		mes "行きましょう。";
		mes "どこかへ歩き回る娘じゃないから、";
		mes "戻って来ているかもしれません。";
		mes "いないなら、本当に……大事です……。";
		setquest 11800;
		delquest 11799;
		setquest 130505;
		delquest 130505;
		set EP19_2QUE,8;
		next;
		//showevent 9999, 0, "アリス#ep19";	// 1305: 254, 309
		cutin "acact_04.bmp", 255;
		mes "‐あの娘の部屋へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あの娘の部屋へ向かった‐";
		close2;
		warp "prt_cas.gat", 178, 152;	// from: prontera.gat(246, 307) port : 5125
		end;
	}
	if(EP19_2QUE == 8) {
		cutin "acact_01.bmp", 2;
		mes "[アリス]";
		mes "失礼、取り乱しました。";
		mes "ひと先ず、あの娘の^e5555e部屋^000000へ";
		mes "行きましょう。";
		mes "どこかへ歩き回る娘じゃないから、";
		mes "戻って来ているかもしれません。";
		mes "いないなら、本当に……大事です……。";
		cutin "acact_04.bmp", 2;
		next;
		cutin "acact_04.bmp", 255;
		mes "‐あの娘の部屋へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あの娘の部屋へ向かった‐";
		close2;
		warp "prt_cas.gat", 178, 152;	// from: prontera.gat(246, 307) port : 5125
		end;
	}
	if(EP19_2QUE >= 9 && EP19_2QUE <= 17) {
		cutin "acact_01.bmp", 2;
		mes "[アリス]";
		mes "ここでゆっくりしている場合では";
		mes "ないですよ。";
		mes "早く準備して^e5555eイスガルド^000000へ";
		mes "出発しないといけませんでしょう？";
		cutin "acact_01.bmp", 2;
		close2;
		cutin "acact_01.bmp", 255;
		end;
	}
	cutin "acact_01.bmp", 2;
	mes "[アリス]";
	mes "あら！";
	mes "プロンテラ大聖堂に";
	mes "ようこそいらっしゃいませ。";
	mes "オーディン様は";
	mes "いつでも両手を広げて";
	mes "歓迎していらっしゃいます。";
	cutin "acact_02.bmp", 2;
	close2;
	cutin "acact_02.bmp", 255;
	end;
OnInit:
	setnpctitle "[アコライト担当官]";	// NPC:アリス#ep19(1305)
	end;
}

prt_cas.gat,178,148,0	script	guestroom_l2_in_guestro	45,1,1,{/* 5424 */
	mes "‐来客用の部屋が多数ある。";
	mes "　どちらへ向かおうか？‐";
	next;
	switch(select("[客室 01] 冒険者歓迎室","[客室 02] フリーデリケの部屋","")) {
	case 1:
		warp "prt_cas.gat",27,43;	// 5424 from: prt_cas.gat(178, 149)
		end;
	case 2:
		warp "p_cas_gr_2.gat",27,43;	// 5424 from: prt_cas.gat(178, 149)
		end;
	}
}

p_cas_gr_2.gat,27,47,0	warp	gr_2_out	1,1,prt_cas.gat,178,152	// 5427 from: p_cas_gr_2.gat(27, 46)
p_cas_gr_2.gat,20,32,0	script	p_cas_gr_2_sw	139,9,9,{/* 5605 */
	switch(EP19_2QUE) {
	case 8:
		//showevent 0, 3, "旅行用鞄#ep19_1";	// 5606: 20, 32
		cloakoffnpc "旅行用鞄#ep19_1";
		cloakoffnpc "アリス#ep19";
		end;
	case 9:
		cloakoffnpc "旅行用鞄#ep19_1";
		cloakoffnpc "聖女#ep19";
		cloakoffnpc "アリス#ep19";
		end;
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
		cloakoffnpc "旅行用鞄#ep19_1";
		cloakoffnpc "マークイシャ#ep19_cas";
		cloakoffnpc "アリス#ep19";
		cloakoffnpc "聖女#ep19";
		cloakoffnpc "旅行用鞄#ep19_2";
		cloakoffnpc "旅行用鞄#ep19_3";
		cloakoffnpc "旅行用鞄#ep19_4";
		cloakoffnpc "旅行用鞄#ep19_5";
		cloakoffnpc "旅行用鞄#ep19_6";
		end;
	default:
		cloakonnpc "旅行用鞄#ep19_1";
		cloakonnpc "マークイシャ#ep19_cas";
		cloakonnpc "アリス#ep19";
		cloakonnpc "聖女#ep19";
		cloakonnpc "旅行用鞄#ep19_2";
		cloakonnpc "旅行用鞄#ep19_3";
		cloakonnpc "旅行用鞄#ep19_4";
		cloakonnpc "旅行用鞄#ep19_5";
		cloakonnpc "旅行用鞄#ep19_6";
		end;
	}
	end;
}
p_cas_gr_2.gat,20,32,3	script	旅行用鞄#ep19_1	10459,{/* 5606 (cloaking)*/
	switch(EP19_2QUE) {
	case 8:
		mes "[アリス]";
		mes "あら！";
		mes "鞄があるのをみると、";
		mes "ここに戻ってきているみたいですね？";
		mes "九死に一生を得た気分です。";
		cloakoffnpc "アリス#ep19";
		cutin "acact_03.bmp", 2;
		next;
		cloakoffnpc "聖女#ep19";
		mes "[聖女]";
		mes "アリス姉？来てたの？";
		mes "よかった！";
		mes "こっちの白いコートとピンク色マント、";
		mes "どっちが可愛い？";
		mes "両方可愛くて選べないよ。";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[アリス]";
		mes "どうしてここにいるの？";
		mes "レハール様が迎えに来たんじゃないの？";
		cutin "acact_04.bmp", 2;
		next;
		mes "[聖女]";
		mes "レハール？";
		mes "あ……約束した場所に行ったら、";
		mes "レハールはいなくて";
		mes "誰かに手紙を渡されたよ？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アリス]";
		mes "手……紙……？";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "バルムント邸へ来いって書かれてたよ。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes "じゃあ、何でここにいるの？";
		mes "バルムント邸には行かなかったの？";
		cutin "acact_04.bmp", 2;
		next;
		mes "[アリス]";
		mes "いや、それよりも、";
		mes "バルムント邸はすごく遠いわね。";
		mes "あそこまで貴女ひとりで来いと";
		mes "言われたの？";
		next;
		mes "[聖女]";
		mes "うん……行ってみたけど……";
		mes "誰もいなくて退屈で邸宅を見回って……";
		mes "たくさん待ってたけど、";
		mes "誰も来ないから帰ってきたよ。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[アリス]";
		mes "人を呼びつけておいて";
		mes "何でいないんだよ！";
		cutin "acact_04.bmp", 2;
		next;
		mes "[アリス]";
		mes "……。";
		mes "………。";
		mes "…………。";
		next;
		mes "[アリス]";
		mes "いえ、こんなこと考えている暇はないわ。";
		mes strcharinfo(0)+"様が";
		mes "迎えにいらしたんだから、";
		mes "貴女、ついていきなさい。";
		mes "ヴォークリンデ様が";
		mes "待っているらしいわ。";
		cutin "acact_01.bmp", 2;
		next;
		mes "[聖女]";
		mes "ヴォークリンデ様が？";
		mes "私、ヴォークリンデ様のところへ";
		mes "行くの？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[聖女]";
		mes "じゃ早く荷造りしないと！";
		next;
		mes "[アリス]";
		mes "荷造り？？？";
		mes "まあ、確かに……？";
		mes "じゃあ、しばらくは荷造りしていて。";
		mes "私は荷物運び要員を連れて来るから。";
		cutin "acact_04.bmp", 2;
		next;
		mes "[アリス]";
		mes strcharinfo(0)+"様、";
		mes "申し訳ありませんが、";
		mes "この娘の荷造りを";
		mes "見守ってくださいますか？";
		mes "目を離すのは心配で……";
		mes "すぐ戻りますから。";
		cutin "acact_01.bmp", 2;
		setquest 11801;
		delquest 11800;
		set EP19_2QUE,9;
		close2;
		//showevent 9999, 0, "旅行用鞄#ep19_1";	// 5606: 20, 32
		//showevent 0, 3, "聖女#ep19";	// 5611: 18, 32
		cutin "acact_01.bmp", 255;
		cloakonnpc "アリス#ep19";
		end;
	case 9:
		mes "‐アリスを待つ間、聖女と話してみよう‐";
		hideoffnpc "聖女#ep19";
		close;
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
		mes "[アリス]";
		mes "ちょっと、なんで鞄が増えてるのよ……";
		mes "まさかここにあるもの、";
		mes "全部持って行くつもりじゃないわよね？";
		cloakoffnpc "マークイシャ#ep19_cas";
		cloakoffnpc "アリス#ep19";
		cloakoffnpc "旅行用鞄#ep19_2";
		cloakoffnpc "旅行用鞄#ep19_3";
		cloakoffnpc "旅行用鞄#ep19_4";
		cloakoffnpc "旅行用鞄#ep19_5";
		cloakoffnpc "旅行用鞄#ep19_6";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "だめ？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes "当然ダメよ！";
		mes "必要な物だけ持ってきなさい！";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "全部必要な物なんだから。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes strcharinfo(0)+"様、";
		mes "そんな目で見ないでください。";
		mes "こう見えても、聖職者としての腕だけは";
		mes "本当に優れていますから……";
		mes "腕だけは……本当に……マジで……。";
		cutin "acact_04.bmp", 2;
		next;
		mes "[アリス]";
		mes "このままじゃダメですね。";
		mes "開けて確認して整理しないと、";
		mes "本当にこれを全部持って";
		mes "イスガルドに行く羽目になります。";
		next;
		mes "[アリス]";
		mes "鞄に何が入っているのか見て、";
		mes "減らせる物は最大限に減らしましょうか。";
		cutin "acact_01.bmp", 2;
		close2;
		cutin "acact_01.bmp", 255;
		end;
	case 15:
		mes "[アリス]";
		mes "ふう、荷造りはこんなところでしょうか？";
		cutin "acact_01.bmp", 2;
		cloakoffnpc "マークイシャ#ep19_cas";
		cloakoffnpc "アリス#ep19";
		cloakoffnpc "聖女#ep19";
		cloakoffnpc "旅行用鞄#ep19_2";
		cloakoffnpc "旅行用鞄#ep19_3";
		cloakoffnpc "旅行用鞄#ep19_4";
		cloakoffnpc "旅行用鞄#ep19_5";
		cloakoffnpc "旅行用鞄#ep19_6";
		close2;
		cutin "acact_01.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,22,33,3	script	マークイシャ#ep19_cas	10383,{/* 5607 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,23,32,3	script	テューリアン#ep19_cas	10382,{/* 5608 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,24,31,3	script	マギスティン#ep19_cas	10365,{/* 5609 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,25,31,5	script	アルプオカート#ep19_cas	10384,{/* 5610 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,18,32,5	script	聖女#ep19	10458,{/* 5611 (cloaking)*/
	switch(EP19_2QUE) {
	case 9:
		mes "[フリーデリケ]";
		mes "初めまして";
		mes strcharinfo(0)+"様。";
		mes "私はフリーデリケと申します。";
		mes "会えて嬉しいです。";
		cutin "ep19_friederike03.png", 2;
		cloakoffnpc "旅行用鞄#ep19_2";
		next;
		mes "[フリーデリケ]";
		mes "ところで、"+strcharinfo(0)+"様は";
		mes "ヴォークリンデ様の";
		mes "お使いでいらしたんですよね？";
		mes "イスガルドは結構寒いですか？";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "旅行用鞄#ep19_3";
		next;
		menu "寒い",-;
		mes "[フリーデリケ]";
		mes "寒いのは嫌だけど。";
		mes "そこは家も氷で出来てるの？";
		mes "羽毛の布団も持って行かないと！";
		cloakoffnpc "旅行用鞄#ep19_4";
		next;
		menu "氷でできた城もある",-;
		mes "[フリーデリケ]";
		mes "わぁ！綺麗そう！";
		mes "ならこの水色のドレスと白いドレス、";
		mes "どちらが氷の城と合いますか？";
		cutin "ep19_friederike03.png", 2;
		cloakoffnpc "旅行用鞄#ep19_5";
		next;
		mes "[フリーデリケ]";
		mes "あ！";
		mes "ドレスに併せた靴も持ってかなくちゃ！";
		cutin "ep19_friederike01.png", 2;
		cloakoffnpc "旅行用鞄#ep19_6";
		next;
		mes "[マークイシャ]";
		mes "荷物を増やしてどうするんだよ！";
		cloakoffnpc "マークイシャ#ep19_cas";
		cutin "ep18_mark_03.png", 0;
		next;
		mes "[マークイシャ]";
		mes "あっ！";
		mes strcharinfo(0)+"様、";
		mes "こんにちは。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[アリス]";
		mes "ちょっと、なんで鞄が増えてるのよ……";
		mes "まさかここにあるもの、";
		mes "全部持って行くつもりじゃないわよね？";
		cloakoffnpc "アリス#ep19";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "だめ？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes "当然ダメよ！";
		mes "必要な物だけ持ってきなさい！";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "全部必要な物なんだから。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes strcharinfo(0)+"様、";
		mes "そんな目で見ないでください。";
		mes "こう見えても、聖職者としての腕だけは";
		mes "本当に優れていますから……";
		mes "腕だけは……本当に……マジで……。";
		cutin "acact_04.bmp", 2;
		next;
		mes "[アリス]";
		mes "このままじゃダメですね。";
		mes "開けて確認して整理しないと、";
		mes "本当にこれを全部持って";
		mes "イスガルドに行く羽目になります。";
		next;
		mes "[アリス]";
		mes "鞄に何が入っているのか見て、";
		mes "減らせる物は最大限に減らしましょうか。";
		cutin "acact_01.bmp", 2;
		setquest 11802;
		delquest 11801;
		set EP19_2QUE,10;
		close2;
		//showevent 0, 3, "旅行用鞄#ep19_2";	// 5612: 15, 31
		cutin "acact_01.bmp", 255;
		end;
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
		mes "[アリス]";
		mes "ちょっと、なんで鞄が増えてるのよ……";
		mes "まさかここにあるもの、";
		mes "全部持って行くつもりじゃないわよね？";
		cloakoffnpc "マークイシャ#ep19_cas";
		cloakoffnpc "アリス#ep19";
		cloakoffnpc "旅行用鞄#ep19_2";
		cloakoffnpc "旅行用鞄#ep19_3";
		cloakoffnpc "旅行用鞄#ep19_4";
		cloakoffnpc "旅行用鞄#ep19_5";
		cloakoffnpc "旅行用鞄#ep19_6";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "だめ？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes "当然ダメよ！";
		mes "必要な物だけ持ってきなさい！";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "全部必要な物なんだから。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes strcharinfo(0)+"様、";
		mes "そんな目で見ないでください。";
		mes "こう見えても、聖職者としての腕だけは";
		mes "本当に優れていますから……";
		mes "腕だけは……本当に……マジで……。";
		cutin "acact_04.bmp", 2;
		next;
		mes "[アリス]";
		mes "このままじゃダメですね。";
		mes "開けて確認して整理しないと、";
		mes "本当にこれを全部持って";
		mes "イスガルドに行く羽目になります。";
		next;
		mes "[アリス]";
		mes "鞄に何が入っているのか見て、";
		mes "減らせる物は最大限に減らしましょうか。";
		cutin "acact_01.bmp", 2;
		close2;
		cutin "acact_01.bmp", 255;
		end;
	}
	end;
}
p_cas_gr_2.gat,15,31,5	script	旅行用鞄#ep19_2	10459,{/* 5612 (cloaking)*/
	if(EP19_2QUE == 10) {
		mes "‐鞄の中には分厚いコートが";
		mes "　沢山入っている‐";
		next;
		mes "[フリーデリケ]";
		mes "イスガルドは寒いから、";
		mes "冬用コートがないとね。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アリス]";
		mes "そりゃそうね。";
		mes "では次！";
		cutin "acact_01.bmp", 2;
		setquest 11803;
		delquest 11802;
		set EP19_2QUE,11;
		close2;
		showevent 0, 3, "旅行用鞄#ep19_3";	// 5613: 16, 27
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "‐旅行用鞄がある‐";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,16,27,3	script	旅行用鞄#ep19_3	10459,{/* 5613 (cloaking)*/
	if(EP19_2QUE == 11) {
		mes "‐鞄の中には分厚いコートが";
		mes "　沢山入っている‐";
		next;
		mes "[アリス]";
		mes "……。";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "イスガルドは寒いから……。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アリス]";
		mes "他の鞄にも";
		mes "コートが入っていたじゃない……。";
		cutin "acact_03.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "でも……。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[アリス]";
		mes "どうせ寒いからって、";
		mes "外には出ないじゃない。";
		mes "さっきのあの鞄だけにして！";
		mes "では次！";
		cutin "acact_01.bmp", 2;
		setquest 11804;
		delquest 11803;
		set EP19_2QUE,12;
		close2;
		//showevent 0, 3, "旅行用鞄#ep19_4";	// 5614: 26, 27
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "‐旅行用鞄がある‐";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,26,27,3	script	旅行用鞄#ep19_4	10459,{/* 5614 (cloaking)*/
	if(EP19_2QUE == 12) {
		mes "‐鞄の中には";
		mes "　クマのぬいぐるみが入っている‐";
		next;
		mes "[アリス]";
		mes "……。";
		cutin "acact_02.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "だめ～～！";
		mes "アンジェリカなしじゃ眠れないんだから！";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[アリス]";
		mes "じゃあ、";
		mes "ぬいぐるみはこれ一つだけよ……。";
		cutin "acact_01.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "うん。";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[アリス]";
		mes "では次！";
		cutin "acact_01.bmp", 2;
		setquest 11805;
		delquest 11804;
		set EP19_2QUE,13;
		close2;
		//showevent 0, 3, "旅行用鞄#ep19_5";	// 5615: 21, 27
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "‐旅行用鞄がある‐";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,21,27,3	script	旅行用鞄#ep19_5	10459,{/* 5615 (cloaking)*/
	if(EP19_2QUE == 13) {
		mes "‐鞄の中にはお菓子が入っている‐";
		next;
		mes "[アリス]";
		mes "イスガルドでは";
		mes "入手し難いかもしれないから、";
		mes "これは持っていってよし。";
		mes "では次！";
		cutin "acact_01.bmp", 2;
		next;
		mes "[マークイシャ]";
		mes "（……姉さん、";
		mes "　食べ物には甘いんだよなぁ……）";
		cutin "ep18_mark_01.png", 0;
		setquest 11806;
		delquest 11805;
		set EP19_2QUE,14;
		close2;
		showevent 0, 3, "旅行用鞄#ep19_6";	// 5616: 22, 30
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "‐旅行用鞄がある‐";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,22,30,5	script	旅行用鞄#ep19_6	10459,{/* 5616 (cloaking)*/
	if(EP19_2QUE == 14) {
		mes "‐鞄の中にはバルムントの";
		mes "　等身大人形が入っている‐";
		next;
		mes "[アリス]";
		mes "こんなの、いったいどこで手に入れたの？";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "この前バルムント邸に行った時に、";
		mes "アルファさんがプレゼントでくれたよ。";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[アリス]";
		mes "とにかく、";
		mes "これはイスガルドから戻ってきたら";
		mes "鑑賞しなさい。";
		cutin "acact_04.bmp", 2;
		next;
		mes "[フリーデリケ]";
		mes "ひーん……。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[アリス]";
		mes "荷物はこれぐらいで結構！";
		cutin "acact_01.bmp", 2;
		setquest 11807;
		delquest 11806;
		set EP19_2QUE,15;
		close2;
		showevent 0, 3, "アリス#ep19";	// 5617: 21, 31
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "‐旅行用鞄がある‐";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,21,31,3	script	アリス#ep19	641,{/* 5617 (cloaking)*/
	if(EP19_2QUE == 15) {
		mes "[アリス]";
		mes "ふー！";
		mes "減らしに減らしたんだけど、";
		mes "こんなにあるなんて。";
		mes "ポーターが足りないわね……。";
		cutin "acact_04.bmp", 2;
		next;
		mes "[テューリアン]";
		mes "お～い！";
		mes "マークイシャ、ここにいるか？";
		mes "お！"+strcharinfo(0)+"も";
		mes "いるじゃん！";
		mes "商店街に新しくできた";
		mes "ポリン炒めの店へ行かない？";
		cloakoffnpc "テューリアン#ep19_cas";
		cloakoffnpc "マギスティン#ep19_cas";
		cloakoffnpc "アルプオカート#ep19_cas";
		cutin "ep18_dew_01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "私も食べる！";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アリス]";
		mes "あら～～！";
		mes "テューリアン！";
		mes "マギスティン！";
		mes "アルプオカートさん！";
		cutin "acact_03.bmp", 2;
		next;
		mes "[アリス]";
		mes "ちょうどよかった！";
		mes "アリスお姉さんがポリン炒め奢るから、";
		mes "この荷物運び手伝ってくれない？";
		cutin "acact_02.bmp", 2;
		next;
		mes "[テューリアン]";
		mes "え！本当？";
		mes "姉貴が奢ってくれる？";
		cutin "ep18_dew_05.png", 2;
		next;
		mes "[マークイシャ]";
		mes "姉さん！";
		mes "それは……！";
		mes "うぐっ……！";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[アリス]";
		mes "黙ってなさい……。";
		cutin "acact_02.bmp", 2;
		next;
		mes "[アリス]";
		mes "もちろん！";
		mes "食べたい分なら、いくらでも奢るわよ！";
		next;
		mes "[テューリアン]";
		mes "よし！";
		mes "風のような速さで行ってくるから、";
		mes "姉貴は財布の用意を頼んだぞ！";
		cutin "ep18_dew_01.png", 2;
		next;
		mes "[アリス]";
		mes "じゃ"+strcharinfo(0)+"様、";
		mes "私がアルデバランまでお送りいたします。";
		mes "どうか気を付けていってらっしゃい。";
		mes "それとフリーデリケのこと、";
		mes "よろしくお願いします。";
		cutin "acact_01.bmp", 2;
		next;
		if(select("移動する","やめておく") == 2) {
			mes "[アリス]";
			mes "では準備ができたら、";
			mes "話しかけてくださいね。";
			close2;
			cutin "acact_03.bmp", 255;
			end;
		}
		mes "[フリーデリケ]";
		mes "アリス姉、私行ってくるよ～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[テューリアン]";
		mes "あれ？アルデバラン？？？";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[アリス]";
		mes "気を付けていくのよ～。";
		mes "ヴォークリンデ様の話を、";
		mes "よく聞いてね。";
		cutin "acact_03.bmp", 2;
		setquest 11808;
		delquest 11807;
		set EP19_2QUE,16;
		close2;
		showevent 0, 3, "アリス#ep19";	// 5617: 21, 31
		cutin "acact_03.bmp", 255;
		warp "aldebaran.gat", 104, 105;	// from: p_cas_gr_2.gat(24, 33) port : 5122
		showevent 0, 3, "ヘルロック#ep19_a";	// 5716: 102, 103
		end;
	}
	if(EP19_2QUE == 16) {
		mes "[アリス]";
		mes "じゃ"+strcharinfo(0)+"様、";
		mes "私がアルデバランまでお送りいたします。";
		mes "どうか気を付けていってらっしゃい。";
		mes "それとフリーデリケのこと、";
		mes "よろしくお願いします。";
		cutin "acact_01.bmp", 2;
		next;
		cutin "acact_03.bmp", 255;
		mes "‐アルデバランへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐アルデバランへ向かった‐";
		close2;
		warp "aldebaran.gat", 104, 105;	// from: p_cas_gr_2.gat(24, 30) port : 5122
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,25,121,5	script	フリーデリケ#ep19入口	10458,{/* 2911 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,20,126,5	script	テューリアン#ep19入口	10382,{/* 2912 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,21,127,5	script	マークイシャ#ep19入口	10383,{/* 2913 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,21,128,5	script	マギスティン#ep19入口	10365,{/* 2914 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,22,129,5	script	アルプオカート#ep19入口	10384,{/* 2915 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,27,123,3	script	レハール#ep19_3	10469,{/* 2916 (cloaking)*/
	if(EP19_2QUE == 18) {
		mes "[レハール]";
		mes "あ！";
		mes strcharinfo(0)+"様、";
		mes "やっといらっしゃいましたね！";
		mes "聖女様は……。";
		cutin "ep19_lehar01.png", 2;
		cloakoffnpc "レハール#ep19_3";
		cloakoffnpc "フリーデリケ#ep19入口";
		cloakoffnpc "テューリアン#ep19入口";
		cloakoffnpc "マークイシャ#ep19入口";
		cloakoffnpc "マギスティン#ep19入口";
		cloakoffnpc "アルプオカート#ep19入口";
		next;
		mes "[フリーデリケ]";
		mes "フリーデリケだよ。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[レハール]";
		mes "こんにちは、";
		mes "フリーデリケ様。";
		mes "他の方たちも……";
		mes "氷の城までの道中、お疲れ様でした。";
		cutin "ep19_lehar07.png", 2;
		next;
		mes "[レハール]";
		mes "バルムント邸に置いてきてしまったこと、";
		mes "本当に申し訳ありません。";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "大丈夫だよ。";
		mes "ヴォークリンデ様にはいっぱい叱られた？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[レハール]";
		mes "くっ……。";
		mes "記憶が……。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[テューリアン]";
		mes "あれ？？";
		mes "ここはどこ！！";
		mes "寒い！！";
		mes "俺のポリン炒めは！？";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[マークイシャ]";
		mes "思ったよりもずっと寒い場所ですね。";
		mes "早く移動した方がいいでしょう。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[レハール]";
		mes "あ！！そうですね。";
		mes "すいません、僕は慣れているせいか、";
		mes "配慮に欠けました。";
		mes "先ずはそこの家に入りましょう。";
		mes "外に長くいると風邪をひいてしまいます。";
		cutin "ep19_lehar05.png", 2;
		setquest 11810;	showevent 0, 3, "#in_house1";	// 2903: 59, 213
		delquest 130501;
		//setquest 130502;
		//delquest 130502;
		set EP19_2QUE,19;
		close2;
		//showevent 9999, 0, "レハール#ep19_3";	// 2902: 27, 123
		//showevent 0, 3, "#in_house1";	// 2903: 59, 213
		//showevent 0, 3, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		cutin "ep19_lehar05.png", 255;
		unittalk "レハール : もう礼拝室はコリゴリだ……";
		viewpoint 1, 59, 213, 1, 0xFFFF00;
		end;
	}
	if(EP19_2QUE == 19) {
		mes "[レハール]";
		mes "先ずはそこの家に入りましょう。";
		mes "外に長くいると風邪をひいてしまいます。";
		hideoffnpc "レハール#ep19_3";
		cutin "ep19_lehar05.png", 2;
		close2;
		cutin "ep19_lehar05.png", 255;
		unittalk "レハール : もう礼拝室はコリゴリだ……";
		viewpoint 1, 59, 213, 1, 0xFFFF00;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,59,213,0	script	#in_house1	45,1,1,{/* 2917 */
	if(EP19_2QUE < 19) {
		mes "‐鍵がかかってるようだ。-";
		close;
	}
	warp "icas_in.gat",33,112;
	end;
}

icas_in.gat,33,109,0	warp	#out_house1	1,1,icecastle.gat,60,211	// 2918 from: icas_in.gat(34, 110)
icas_in.gat,32,122,0	script	#seizyo_sw	139,10,10,{/* 2919 */
	switch(EP19_2QUE) {
	case 0:
		end;
	case 19:
	case 20:
		cloakoffnpc "フリーデリケ#ep19_seizy";
		cloakoffnpc "レハール#ep19_room";
		end;
	case 21:
		cloakoffnpc "フリーデリケ#ep19_seizy";
		cloakoffnpc "シュルル#ep19_dq_jorab";
		end;
	default:
		cloakoffnpc "フリーデリケ#ep19_seizy";
		cloakoffnpc "シュルル#ep19_dq_jorab";
		cloakoffnpc "タマリン#ep19_refrigera";
		end;
	}
	end;
}
icas_in.gat,34,121,3	script	ヴォークリンデ#ep19_roo	10467,{/* 2920 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,27,119,5	script	テューリアン#ep19_room	10382,{/* 2921 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,30,121,5	script	マークイシャ#ep19_room	10383,{/* 2922 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,29,120,5	script	マギスティン#ep19_room	10365,{/* 2923 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,26,119,5	script	アルプオカート#ep19_roo	10384,{/* 2924 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,32,123,5	script	フリーデリケ#ep19_seizy	10458,{/* 2925 (cloaking)*/
	switch(EP19_2QUE) {
	case 19:
		mes "[フリーデリケ]";
		mes "ここが私の部屋なの？";
		mes "カワイイ！";
		cutin "ep19_friederike03.png", 2;
		cloakoffnpc "レハール#ep19_room";
		cloakoffnpc "テューリアン#ep19_room";
		cloakoffnpc "マークイシャ#ep19_room";
		cloakoffnpc "マギスティン#ep19_room";
		cloakoffnpc "アルプオカート#ep19_roo";
		next;
		mes "[ヴォークリンデ]";
		mes "若い子たち、よく来たね。";
		mes "ここまでご苦労様。";
		cutin "ep19_voglinde01.png", 0;
		cloakoffnpc "ヴォークリンデ#ep19_roo";
		next;
		mes "[フリーデリケ]";
		mes "あっ！！";
		mes "ヴォークリンデ様、私来ました～。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[マークイシャ]";
		mes "こ……こんにちは！";
		mes "王女殿下！！";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[テューリアン]";
		mes "<FONT SIZE = 16><B>王……王女殿下？！</FONT></B>";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "おやおや！";
		mes "アリスの弟だね。";
		mes "そんなに堅苦しくしなくていいよ。";
		mes "ヴォークリンデおばさんと呼んでおくれ。";
		mes "隣にいるのは友達かい？";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[マークイシャ]";
		mes "はい。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "よく来たね！";
		mes "ただでさえ、人手不足でね。";
		mes "<FONT SIZE = 16><B>ほほほ！</FONT></B>";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "では、私はフリーデリケが来たのを";
		mes "確認したから、もう戻るわ。";
		mes "やるべきことが多過ぎる。";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[フリーデリケ]";
		mes "えぇ～。";
		mes "もう行かれるのですか……？";
		mes "今会ったばかりなのに……！";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "少し余裕ができたら呼ぶわ。";
		mes "美味しいお茶と";
		mes "お菓子も準備しておいたから。";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[フリーデリケ]";
		mes "本当？";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "もちろん！";
		mes "お前が来るから";
		mes "特別な物を用意しておいたよ。";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[フリーデリケ]";
		mes "おば様大好き！";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "あぁ！";
		mes "もうこんな時間に！";
		mes "本当に行かないと。";
		mes "^e5555eレハール^000000、後は頼むわよ。";
		mes "信じてるからね。";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[レハール]";
		mes "はい…？はい！";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "そっちの二人は私に付いておいで。";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[テューリアン]";
		mes "はい！？";
		cutin "ep18_dew_02.png", 1;
		next;
		mes "[マギスティン]";
		mes "はい！";
		cutin "4job_maggi_04.png", 2;
		unittalk getnpcid(0,"テューリアン#ep19_room"),"テューリアン : はい！？";
		unittalk getnpcid(0,"マギスティン#ep19_room"),"マギスティン : はい！";
		cloakonnpc "テューリアン#ep19_room";
		cloakonnpc "マギスティン#ep19_room";
		cloakonnpc "ヴォークリンデ#ep19_roo";
		setquest 11811;
		delquest 11810;
		set EP19_2QUE,20;
		close2;
		showevent 9999, 0, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		showevent 0, 3, "レハール#ep19_room";	// 2912: 35, 118
		cutin "ep19_lehar05.png", 255;
		end;
	case 20:
		mes "[フリーデリケ]";
		mes "レハール。";
		mes "ヴォークリンデ様は";
		mes "何て仰ったの？";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "レハール#ep19_room";
		close2;
		cutin "ep19_friederike02.png", 255;
		end;
	case 27:
		mes "[フリーデリケ]";
		mes "いらしてたんですね。";
		mes "外は本当に寒いですよね？";
		mes "みんなもこっちにおいでよ。";
		mes "ここは羽毛が敷かれてるから、";
		mes "凄く暖かいよ。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[マークイシャ]";
		mes "休みたい気持ちは山々だけど、";
		mes "今はそんな時じゃないから。";
		cloakoffnpc "マークイシャ#ep19_room";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[マークイシャ]";
		mes "フリーデリケ、上着を着て。";
		mes "行く場所がある。";
		next;
		mes "[フリーデリケ]";
		mes "どこへ？";
		mes "外に出るんだよね？";
		mes "こんなに寒いのに？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[マークイシャ]";
		mes "^e5555e毒の溢れる穴^000000を見付けたんだ。";
		mes "タマリンがそこへ落ちて";
		mes "ああなったみたい。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[タマリン]";
		mes "くあぁ、死ぬぅ！！";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[マークイシャ]";
		mes "だから、浄化しておかないと、";
		mes "また被害者が出るだろ？";
		mes "シュルルさんの魔力核も";
		mes "割れてしまったって話だし。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[フリーデリケ]";
		mes "魔力核が割れるぐらいなら、";
		mes "生身で落ちると";
		mes "死んじゃうかもしれないよ。";
		mes "誰かが辛い思いをするのは嫌だから……";
		mes "私いくね。";
		cutin "ep19_friederike02.png", 2;
		setquest 11821;
		delquest 11820;
		set EP19_2QUE,28;
		cloakonnpc "マークイシャ#ep19_room";
		next;
		//showevent 0, 3, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		//showevent 0, 3, "シュルル#ep19_1";	// 2923: 255, 312
		cutin "ep19_friederike01.png", 255;
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: icas_in.gat(32, 120)
		end;
	case 28:
		mes "[フリーデリケ]";
		mes "魔力核が割れるぐらいなら、";
		mes "生身で落ちると";
		mes "死んじゃうかもしれないよ。";
		mes "誰かが辛い思いをするのは嫌だから……";
		mes "私いくね。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike01.png", 255;
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: icas_in.gat(32, 120)
		end;
	case 35:
		mes "[フリーデリケ]";
		mes "おかえりなさい。";
		mes "怪我はしてないですか？";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "マークイシャ#ep19_room";
		cloakoffnpc "アルプオカート#ep19_roo";
		next;
		mes "[レハール]";
		mes "ご無事で何よりです。";
		mes "マギスティン様から話を聞いて";
		mes "どれほど驚いたか。";
		cutin "ep19_lehar01.png", 2;
		cloakoffnpc "レハール#ep19_room";
		next;
		mes "[レハール]";
		mes "それで、穴の中はどうでしたか？";
		mes "危険度によっては、";
		mes "伯母さんに早く報告しないと……。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "その必要はないわ。";
		cutin "ep19_voglinde01.png", 0;
		cloakoffnpc "ヴォークリンデ#ep19_roo";
		cloakoffnpc "テューリアン#ep19_room";
		cloakoffnpc "マギスティン#ep19_room";
		next;
		mes "[レハール]";
		mes "<FONT SIZE = 16>伯母さん！</FONT>";
		mes "どうやって……。";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "フリーデリケが来て、";
		mes "^e5555e腐った穴を浄化^000000したと、";
		mes "自慢してくれてね。";
		mes "それでどういう事なのかを";
		mes "確認しに来たわけ。";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "みんな無事に戻って来たようだね。";
		mes "怪我が無くて、本当によかった。";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "あんなものまで見付けて、";
		mes "この子たちは……";
		mes "おばさんの期待を裏切らないんだから！";
		mes "もう最高よ！";
		next;
		mes "[ヴォークリンデ]";
		mes "あんな穴があること自体は、";
		mes "よい報せではないが、";
		mes "事故になる前に見つけたんだから";
		mes "とても喜ばしいことだ！";
		cutin "ep19_voglinde04.png", 0;
		next;
		mes "[マークイシャ]";
		mes "（あれ……？タマリンは……？）";
		cutin "ep18_mark_02.png", 0;
		next;
		mes "[シュルル]";
		mes "<FONT SIZE = 14><B>ヴォークリンデ殿！</FONT></B>";
		mes "<FONT SIZE = 14><B>穴は、内側が結構広い感じでしたが、</FONT></B>";
		mes "<FONT SIZE = 14><B>他の場所に繋がってはいなさそうでした。</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[シュルル]";
		mes "<FONT SIZE = 14><B>しかし、異様な姿をしたルガンと</FONT></B>";
		mes "<FONT SIZE = 14><B>モンスターたちが</FONT></B>";
		mes "<FONT SIZE = 14><B>ウロウロしており、</FONT></B>";
		mes "<FONT SIZE = 14><B>そのままにしておくのは危険だと</FONT></B>";
		mes "<FONT SIZE = 14><B>判断されます！</FONT></B>";
		next;
		mes "[ヴォークリンデ]";
		mes "異様な姿をしたルガン？";
		mes "本当か？";
		mes "普通のルガンとはどういう風に違うんだ？";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[シュルル]";
		mes "<FONT SIZE = 14><B>異様な姿をしたルガンたちは、</FONT></B>";
		mes "<FONT SIZE = 14><B>どこか動きも不自然で、</FONT></B>";
		mes "<FONT SIZE = 14><B>奇怪に捻じ曲がっていました。</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[シュルル]";
		mes "<FONT SIZE = 14><B>モンスターたちは、色もおかしくて……。</FONT></B>";
		mes "<FONT SIZE = 14><B>外では見たことも無いものまでいました！</FONT></B>";
		next;
		mes "[ヴォークリンデ]";
		mes "奇怪にねじ曲がったルガンとは……";
		mes "その穴で";
		mes "自然発生したものかもしれないが、";
		mes "^e5555eルガンたちの廃棄場^000000である可能性も";
		mes "排除できないね。";
		cutin "ep19_voglinde02.png", 0;
		next;
		menu "廃棄場？",-;
		mes "[ヴォークリンデ]";
		mes "ルガンたちは自分たちの中で";
		mes "能力が基準に達していない者たちを、";
		mes "同じ種族だとは思えないほどに";
		mes "残忍な差別をするんだ。";
		mes "そして、巣の外へ捨てられるんだよ。";
		cutin "ep19_voglinde04.png", 0;
		next;
		mes "[シュルル]";
		mes "<FONT SIZE = 14><B>そしてこちらが、</FONT></B>";
		mes "<FONT SIZE = 14><B>モンスターたちから</FONT></B>";
		mes "<FONT SIZE = 14><B>採取してきた肉片です。</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "あ……そうかい？";
		mes "に……臭いがすさまじいね。";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "フリーデリケ、浄化してくれるかい？";
		mes "鼻が曲がりそうだ。";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[フリーデリケ]";
		mes "はい。";
		mes "浄化しました。";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[シュルル]";
		mes "うむ。";
		mes "浄化したら臭いもせず";
		mes "肉質は柔らかくて美味しいですね。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[テューリアン]";
		mes "食べた？！";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "まぁ、私たちの基準じゃ";
		mes "少しおかしいかもしれないが、";
		mes "この子たちにとって、";
		mes "ルガンはただの^e5555e虫^000000、";
		mes "それ以上もそれ以下でもないからね。";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[シュルル]";
		mes "腹を壊したら、";
		mes "フリーデリケ殿が浄化してくださると、";
		mes "固く信じています。";
		mes "ふふ。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[シュルル]";
		mes "では私は狩りに戻りますね。";
		next;
		mes "[レハール]";
		mes "シュルル、無理しすぎではありませんか？";
		mes "少し休んだ方がいいのでは？";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[シュルル]";
		mes "タマリンも倒れたから、";
		mes "少し無理をしないと";
		mes "^e5555e食糧が切れ^000000てしまうよ。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[レハール]";
		mes "その気持ちは分かるけど……。";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[タマリン]";
		mes "私も体調が回復したらすぐ手伝うから、";
		mes "今は少しでも休んどいて。";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[シュルル]";
		mes "そうか……そこまで言うなら";
		mes "わかった。休もう。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[ヴォークリンデ]";
		mes "そうだね。";
		mes "食糧調達は他の子たちも手伝うから、";
		mes "今は休んでおきな。";
		mes "まだやるべきことは沢山あるからね。";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[ヴォークリンデ]";
		mes "では、私もまだやることがあるから、";
		mes "ゆっくり休んでおいておくれ。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep19_friederike04.png", 255;
			end;
		}
		setquest 202370;
		delquest 11828;
		setquest 130502;
		delquest 130502;
		setquest 130505;
		delquest 130505;
		set EP19_2QUE,36;
		getitem 1000608,25;
		for(set '@i,0; '@i < 40; set '@i,'@i+1) {
			getexp 2000000000,0,0;
			getexp 0,1400000000,0;
		}
		mes "[レハール]";
		mes "私たちのことばかり心配していないで、";
		mes "伯母さんも少し休んだらいいのに……";
		mes "こっちが心配です。";
		cutin "ep19_lehar04.png", 2;
		cloakonnpc "ヴォークリンデ#ep19_roo";
		cloakonnpc "マギスティン#ep19_room";
		cloakonnpc "テューリアン#ep19_room";
		close2;
		showevent 0, 3, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		showevent 9999, 0, "レハール#ep19_room";	// 2912: 35, 118
		showevent 0, 3, "シュルル#ep19_dq_jorab";	// 2913: 27, 116
		showevent 0, 3, "タマリン#ep19_refrigera";	// 2914: 27, 122
		//showevent 0, 3;	// 2941: 185, 63
		cutin "ep19_lehar01.png", 255;
		cloakonnpc "アルプオカート#ep19_roo";
		cloakonnpc "マークイシャ#ep19_room";
		cloakonnpc "レハール#ep19_room";
		end;
	case 36:
		if(checkquest(11812)&8) {
			mes "[フリーデリケ]";
			mes "今日はどうされるんですか？";
			cutin "ep19_friederike01.png", 2;
			next;
			switch(select("フリーデリケを手伝う","浄化された魔力核の作成","雑談をする","また今度")) {
			case 1:
				break;
			case 2:
				mes "[フリーデリケ]";
				mes "はい。";
				mes "浄化された魔力核の作成ですね？";
				cutin "ep19_friederike05.png", 2;
				next;
				mes "[フリーデリケ]";
				mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を浄化して上手く固めると！！";
				mes "凄く有用な<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>になります！";
				mes "^e5555eヴェルグンデ^000000様に持って行けば、喜びますよ～！";
				mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>が5個あれば、";
				mes "<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>1個は作れますよ～！";
				messize 180,364;
				next;
				if(select("作成する","やめる") == 2) {
					mes "[フリーデリケ]";
					mes "そうですか～？";
					mes "しょんぼりです。";
					close2;
					cutin "ep19_friederike01.png", 255;
					end;
				}
				mes "[フリーデリケ]";
				mes "いいですね！";
				mes "では実力を発揮しちゃいますよ～！";
				next;
				if(countitem(1000707) < 5) {
					mes "[フリーデリケ]";
					mes "あらら～？";
					mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>は^e5555e5個^000000はないと、";
					mes "<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>は作れませんよ～？";
					mes "あまりにも微弱な魔力しかないですから～。";
					cutin "ep19_friederike02.png", 2;
					close2;
					cutin "ep19_friederike01.png", 255;
					end;
				}
				mes "[フリーデリケ]";
				mes "そ～れ～！";
				next;
				if(checkitemblank() == 0) {
					mes "^009eff【インフォメーション】";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。^000000";
					close2;
					cutin "ep19_friederike04.png", 255;
					end;
				}
				delitem 1000707,5;
				getitem 1000706,1;
				mes "[フリーデリケ]";
				mes "できましたぁ～！";
				mes "^e5555eヴェルグンデ^000000様に持って行けば、喜びますよ～！";
				cutin "ep19_friederike03.png", 2;
				close2;
				cutin "ep19_friederike01.png", 255;
				end;
			case 3:
				mes "[フリーデリケ]";
				mes "イスガルドの調査は上手く行ってますか？";
				mes "外は凄く寒いですよね。";
				mes "早く終わって、";
				mes "部屋で休めたらいいのに……。";
				cutin "ep19_friederike04.png", 2;
				close2;
				cutin "ep19_friederike04.png", 255;
				end;
			case 4:
				mes "[フリーデリケ]";
				mes "はい。";
				mes "またいらしてくださいね～。";
				cutin "ep19_friederike03.png", 2;
				close2;
				cutin "ep19_friederike03.png", 255;
				end;
			}
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の氷河(クエスト))") == 2) {
				mes "[フリーデリケ]";
				cutin "ep19_friederike03.png", 2;
				mes "は～い。";
				mes "それでは、現地に送りますね～。";
				mes "頑張ってください～。";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_back3.gat", 65, 321;	// from: icas_in.gat(31, 116)
				end;
			}
			mes "クエストの受注や報告、";
			mes "取り消しが可能です。";
			next;
			switch(select("全て受注する","全て報告する","[受注可] フリーデリケの一日","全て破棄する")) {
			case 3:
				if(checkquest(11813)) {
					if(!(checkquest(11813)&4) || countitem(1000705) < 5) {
						mes "[フリーデリケ]";
						cutin "ep19_friederike01.png", 2;
						mes "<URL>原始ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>と<URL>最下級ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>を";
						mes "各5匹ずつ倒して、";
						mes "<ITEM>[ルガンの魔力核]<INFO>1000705</INFO></ITEM>も5個集めてきてください～。";
						next;
						mes "<<B>クエスト</B>>";
						mes "「^ff0000フリーデリケの一日^000000」";
						mes "は受注済みのクエストです。";
						mes "こちらのクエストを破棄しますか？";
						next;
						if(select("やめる","破棄する") == 2) {
							mes "^ff0000[インフォメーション]";
							mes "処理を中断しました。^000000";
							close2;
							cutin "kafra_01.bmp", 255;
							end;
						}
					}
					mes "<<B>クエスト</B>>";
					mes "「^ff0000フリーデリケの一日^000000」";
					mes "<内容1>";
					mes "対象：<URL>原始ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>　5体";
					mes "対象：<URL>最下級ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>　5体";
					mes "の討伐と";
					next;
					mes "<内容2>";
					mes "アイテム：<ITEM>ルガンの魔力核<INFO>1000705</INFO></ITEM>　5個";
					mes "の納品";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 8.2G ( 8200000000 )";
					mes "※410000000を20回受け取ります。";
					mes "JobExp 6.2G ( 6200000000 )";
					mes "※310000000を20回受け取ります。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000フリーデリケの一日^000000」";
					mes "を報告しますか？";
					next;
					if(select("報告する","やめる") == 2) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close;
					}
					delitem 1000705,5;
					delquest 11813;
					setquest 11814;
					getitem 1000608,3;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 410000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,310000000,0;
					mes "[フリーデリケ]";
					cutin "ep19_friederike05.png", 2;
					mes "わぁ～！これほど無傷の魔力核なら、";
					mes "きっと素晴らしいものが作れますよ～！";
					mes "早くヴェルグンデ様に";
					cutin "ep19_friederike03.png", 2;
					mes "今日の成果を伝えないと～！";
					next;
					mes "[フリーデリケ]";
					mes strcharinfo(0)+"様も、ゆっくり休んでくださいね。";
					mes "手伝ってくださって、";
					mes "本当にありがとうございました。";
					mes "私がずっと祈ってますから。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 8.2G";
					mes "( 8200000000 )";
					mes "※410000000 BaseExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "JobExp 6.2G";
					mes "( 6200000000 )";
					mes "※310000000 JobExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
					mes "を獲得しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "[フリーデリケ]";
				cutin "ep19_friederike03.png", 2;
				mes "わぁ～！お手伝いしてくださるんですか？";
				mes "まずは、<URL>原始ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>と<URL>最下級ルガン<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>を";
				mes "各5匹ずつ倒してください。";
				next;
				mes "[フリーデリケ]";
				cutin "ep19_friederike05.png", 2;
				mes "あとは、出発前に私が"+strcharinfo(0)+"さんに祝福を掛けます！";
				mes "私の予想が確かなら、祝福の効果で";
				mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>よりも状態の良い";
				mes "<ITEM>[ルガンの魔力核]<INFO>1000705</INFO></ITEM>が手に入るはずです～。";
				mes "ですので、そちらも5個集めてきてください。";
				next;
				mes "[フリーデリケ]";
				cutin "ep19_friederike04.png", 2;
				mes "ただし、あんまり無理はせずに、無事に戻ってきてくださいね！";
				mes strcharinfo(0)+"様が怪我をされた姿を見るのは辛いです！";
				mes "いいですか～？";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000フリーデリケの一日^000000」";
				mes "<内容1>";
				mes "対象：<URL>原始ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>　5体";
				mes "対象：<URL>最下級ルガン<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>　5体";
				mes "の討伐と";
				next;
				mes "<内容2>";
				mes "アイテム：<ITEM>ルガンの魔力核<INFO>1000705</INFO></ITEM>　5個";
				mes "の納品の";
				mes "両方の達成で報告が可能です。";
				mes "クエストを受注しますか？";
				next;
				if(select("受注する","やめる") == 2) {
					mes "[フリーデリケ]";
					cutin "ep19_friederike01.png", 2;
					mes "やめるのですか～？";
					mes "わかりました。";
					mes "また、お時間ができましたら、よろしくお願いしますね。";
					next;
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 11813;
				mes "[フリーデリケ]";
				cutin "ep19_friederike03.png", 2;
				mes "それでは、よろしくお願いしますね～。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000フリーデリケの一日^000000」";
				mes "を受注しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		mes "[フリーデリケ]";
		mes "そういえば、";
		mes "さっきヴォークリンデ様から";
		mes "聞きましたが。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "レオン様やオーレリー様は";
		mes "汚染やルガンの魔力核を浄化できるが、";
		mes "魔力の消費が激しくて";
		mes "今まで苦労が絶えなかったみたいですね。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "魔力核を浄化すれば、";
		mes "それを^e5555eヴェルグンデ^000000様が……。";
		mes "う～ん……説明は聞いたけど、";
		mes "私じゃよく分からない分野の話で……";
		mes "何かをこうやってそうやって……。";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "とにかく！";
		mes "魔力核を浄化して、";
		mes "浄化された魔力核から魔力を";
		mes "抽出して様々な魔力の結晶体を";
		mes "作ることができるらしいです。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "それを色んな用途に使用しているんです。";
		mes "水をきれいにするとか、";
		mes "食べ物を作るとか、";
		mes "部屋を明るくするとか……";
		mes "シュルルさんみたいに";
		mes "潜水服に付けたり……。";
		next;
		mes "[フリーデリケ]";
		mes "苦労して浄化した魔力核を、";
		mes "そんなことに使うのは";
		mes "勿体ないと言ったら、";
		mes "ヴォークリンデ様に叱られました。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ヴォークリンデ様は、";
		mes "資源の豊富な";
		mes "ルーンミッドガッツのようなところでは";
		mes "部屋に明かりや飲み水は、";
		mes "当たり前のように手に入るけれど、";
		mes "イスガルドでは、";
		mes "違うということを教えてくださいました。";
		next;
		mes "[フリーデリケ]";
		mes "ここでは、木も育たないため、";
		mes "部屋に明かりを灯すためことも難しく、";
		mes "水を浄化しないと";
		mes "飲み水も得られないそうです。";
		next;
		mes "[フリーデリケ]";
		mes "だから、些細なこと一つ一つが、";
		mes "生きていくには欠かせられない";
		mes "必要なことなんですって。";
		next;
		mes "[フリーデリケ]";
		mes "それで、これからはレオン様や";
		mes "オーレリー様の代わりに、";
		mes "浄化が得意な私が！";
		mes "魔力核の浄化をして、";
		mes "おば様たちを手伝うことになりました！";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "だから"+strcharinfo(0)+"様も";
		mes "ルガンから^e5555e魔力核^000000を得たら、";
		mes "私に持ってきてください。";
		mes "私が綺麗に浄化してお返ししますから。";
		next;
		cutin "ep19_friederike01.png", 2;
		mes "[フリーデリケ]";
		mes "あ！それと、もう一つ！";
		mes "これからの私の課題らしいのですが、";
		mes "私が来るまでに、";
		mes "浄化できないまま溜めこまれた";
		mes "物凄い量の魔力核のある倉庫が";
		mes "あるんだそうです。";
		next;
		mes "[フリーデリケ]";
		mes "これも浄化するんですが……";
		mes "その話を聞いて、";
		mes "1つ閃いたことがあるのです。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "普通の魔力核は";
		mes "^e5555e等級の低いルガン^000000から";
		mes "得た物が多いので、";
		mes "汚いし、加工も難しいのです。";
		mes "臭う上に周囲の地も";
		mes "汚染されてしまって……。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "そこで、";
		mes "私の浄化の祝福を受けた状態で";
		mes "^e5555eルガンの低級の魔力核^000000を得ると、";
		mes "魔力核が浄化された状態で";
		mes "手に入るんじゃないかと";
		mes "思ったのです。";
		mes "それを調べようと思いまして！";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "それだけでも、";
		mes "とても作業がはかどりそうです！";
		mes strcharinfo(0)+"様も興味ありましたら、";
		mes "参加してみませんか？";
		cutin "ep19_friederike05.png", 2;
		setquest 11812;
		compquest 11812;
		close2;
		cutin "ep19_friederike05.png", 255;
		end;
	}
	mes "[フリーデリケ]";
	mes "こんにちわ～。";
	mes "今日はどうされましたか～？";
	cutin "ep19_friederike03.png", 2;
	next;
	menu "雑談をする",-;
	mes "[フリーデリケ]";
	mes "わぁ！";
	mes "今日はどんな面白い話を";
	mes "聞かせてくださいますか？";
	close2;
	cutin "ep19_friederike01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,35,118,3	script	レハール#ep19_room	10469,{/* 2926 (cloaking)*/
	switch(EP19_2QUE) {
	case 20:
		mes "[レハール]";
		mes "では、フリーデリケ様は";
		mes "この部屋でお過ごしくださいね。";
		mes "必要な物があったら私を呼んでください。";
		mes "一緒にいらした方たちと";
		mes "ここで一緒に居るのは大丈夫ですね？";
		mes "フリーデリケ様？";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "うん。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[レハール]";
		mes "後で私が……。";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[？？？]";
		mes "<FONT SIZE = 16><B>レハール殿！</FONT></B>";
		mes "<FONT SIZE = 16><B>ここにいる？</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "シュルル#ep19_dq_jorab";
		next;
		mes "[？？？]";
		mes "あ！";
		mes "ミッドガルドから来たお客様たちかな？";
		mes "急に入ってすまん。";
		mes "急いでいたもので……。";
		next;
		mes "[レハール]";
		mes "シュルル、どうしたんですか？";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[シュルル]";
		mes "あ！それが……";
		mes "さっき狩りをしていたら";
		mes "友達が^e5555e穴^000000に落ちたんだ。";
		mes "中に水があったからか、";
		mes "びっしょり濡れてしまい、";
		mes "目を覚まさないんだ。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[シュルル]";
		mes "可愛そうに羽毛が一つもない奴だから、";
		mes "他の奴らが羽毛を集めて着せたんだけど";
		mes "体が冷たいんだ。";
		next;
		mes "[シュルル]";
		mes "それで、^e5555e浄化された魔力核^000000が";
		mes "余ってないか聞きに来たんだ。";
		mes "^e5555e浄化された魔力核^000000を使えば、";
		mes "すぐ回復できるだろうから。";
		next;
		mes "[シュルル]";
		mes "^e5555eルガンの低級魔力核^000000なら";
		mes "少しは持っているんだが……";
		mes "浄化しないと只の使えない石ころに";
		mes "過ぎないからな……。";
		next;
		mes "[レハール]";
		mes "そんな！";
		mes "友人の方がご無事ならいいのですが……";
		mes "大変ですね！";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[レハール]";
		mes "浄化された魔力核なら";
		mes "どうにかなりそうですから、";
		mes "一旦その人を";
		mes "こちらに連れて来てください。";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[シュルル]";
		mes "大丈夫？";
		mes "^e5555eレオン様^000000も^e5555eオーレリー様^000000も、";
		mes "今は余力が無さそうだったけれど……。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[レハール]";
		mes "大丈夫！心配しないで！";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[シュルル]";
		mes "<FONT SIZE = 16><B>ありがとう！</FONT></B>";
		mes "すぐ連れて来るから！";
		cutin "ep19_iwin03.png", 2;
		cloakonnpc "シュルル#ep19_dq_jorab";
		next;
		mes "[レハール]";
		mes "では、フリーデリケ様。";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "うん？";
		mes "なに？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[レハール]";
		mes "さぁ！";
		mes "この魔力核を浄化してください。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "その汚い物はなに？";
		mes "それを浄化しなきゃならないの？";
		mes "触りたくないのに……。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[レハール]";
		mes "伯母さんが頼んだものです。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ひーん……。";
		mes "浄化さえすればいいよね？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[レハール]";
		mes "フリーデリケ様は";
		mes "どうせ汚れないじゃありませんか。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "でも、触る時は気持ち悪いもの……。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "じゃあ、はい。";
		mes "これでいい？";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[レハール]";
		mes "はぁ……。";
		mes "予想はしていましたが、";
		mes "それ以上に呆気なく";
		mes "浄化してしまいますね。";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[レハール]";
		mes "魔力核の浄化はレオン様や";
		mes "オーレリー様もできますが、";
		mes "浄化に特化された方たちではないから、";
		mes "本当に必要な時にだけ、";
		mes "少しずつ浄化されていました。";
		next;
		mes "[レハール]";
		mes "同じ量の魔力でできる";
		mes "他の仕事を考えれば、";
		mes "効率は悪過ぎましたからね。";
		next;
		mes "[レハール]";
		mes "伯母さんがあんなに必死になって";
		mes "フリーデリケ様を探していたことにも";
		mes "納得がいきます。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "本当？";
		mes "ヴォークリンデ様が";
		mes "私をそんなに探していたの？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[レハール]";
		mes "引き続き、";
		mes "魔力核の浄化をしていただけたら、";
		mes "伯母さんももっと喜ぶでしょう。";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "えへへ……。";
		cutin "ep19_friederike03.png", 2;
		next;
		cutin "ep19_friederike01.png", 255;
		cloakoffnpc "シュルル#ep19_dq_jorab";
		mes "[シュルル]";
		mes "連れてきたよ！";
		close2;
		setquest 130503;
		delquest 11811;
		set EP19_2QUE,21;
		showevent 9999, 0, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		showevent 9999, 0, "レハール#ep19_room";	// 2912: 35, 118
		showevent 0, 3, "シュルル#ep19_dq_jorab";	// 2913: 27, 116
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,27,116,5	script	シュルル#ep19_dq_jorab	10461,{/* 2927 (cloaking)*/
	switch(EP19_2QUE) {
	case 21:
		mes "[シュルル]";
		mes "レハール様！！";
		mes "連れて来ました！";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "タマリン#ep19_refrigera";
		next;
		mes "[レハール]";
		mes "くっ……なんですか。";
		mes "このおかしな臭いは……。";
		cutin "ep19_lehar03.png", 2;
		cloakoffnpc "レハール#ep19_room";
		next;
		mes "[シュルル]";
		mes "詳しいことは私も分からない。";
		mes "目が覚めたら話が聞けるんじゃないかな？";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[レハール]";
		mes "フリーデリケ様、";
		mes "一旦この方も浄化を……。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "もう……";
		mes "何度も変なことばかりやらせて……";
		mes "臭いよう……。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[？？？]";
		mes "うう……。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[？？？]";
		mes "<FONT SIZE = 16><B>うわっ！！</FONT></B>";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[シュルル]";
		mes "タマリン、気が付いたか？";
		mes "大丈夫！？";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[シュルル]";
		mes "ありがとうございます。";
		mes "レハール様！";
		mes "フリー…デリケ様……？";
		next;
		mes "[タマリン]";
		mes "あはははっ……";
		mes "死ぬかと思った……。";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[テューリアン]";
		mes "あっ！！";
		mes "タマリン！！";
		mes "ここで何やってるんだ！？";
		cutin "ep18_dew_02.png", 2;
		cloakoffnpc "テューリアン#ep19_room";
		next;
		mes "[タマリン]";
		mes "はっ！！";
		mes "テューリアン！";
		mes "ここにはどうやってきたんです！？";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[テューリアン]";
		mes "俺も知らん！！";
		cutin "ep18_dew_01.png", 2;
		next;
		mes "[マークイシャ]";
		mes "本当にどうなってるんですか？";
		cloakoffnpc "マークイシャ#ep19_room";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[タマリン]";
		mes "マークイシャまで？";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[レハール]";
		mes "お知り合いですか？";
		mes "イスガルドは^e5555e招待状^000000なしでは";
		mes "入れないはずなのに、";
		mes "どうやってここまで来たんですか？";
		cutin "ep19_lehar04.png", 2;
		setquest 11815;
		delquest 130503;
		set EP19_2QUE,22;
		close2;
		showevent 9999, 0, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		showevent 9999, 0, "レハール#ep19_room";	// 2912: 35, 118
		showevent 9999, 0, "シュルル#ep19_dq_jorab";	// 2913: 27, 116
		showevent 0, 3, "タマリン#ep19_refrigera";	// 2914: 27, 122
		cutin "ep19_lehar01.png", 255;
		end;
	case 22:
		mes "[シュルル]";
		mes "ありがとうございます。";
		mes "レハール様！";
		mes "フリー…デリケ様……？";
		cutin "ep19_iwin03.png", 2;
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	case 24:
	case 26:
	case 27:
	case 35:
		mes "[シュルル]";
		mes "羽毛が濡れると体も重く、";
		mes "風邪をひきやすくなります。";
		mes "いつでも室内で";
		mes "よく乾かすことが大事です。";
		cutin "ep19_iwin03.png", 2;
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	case 36:
		mes "[シュルル]";
		mes "こんにちわ。";
		mes "時間があったら";
		mes "捨てられた穴の調査を";
		mes "手伝っていただけますか？";
		cutin "ep19_iwin01.png", 2;
		next;
		if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の平原(クエスト))") == 2) {
			mes "[シュルル]";
			cutin "ep19_iwin03.png", 2;
			mes "分かりました。";
			mes "それでは、現地に送ります。";
			close2;
			cutin "kafra_01.bmp", 255;
			warp "jor_back2.gat", 258, 310;	// from: icas_in.gat(30, 116)
			end;
		}
		mes "クエストの受注や報告、";
		mes "取り消しが可能です。";
		next;
		switch(select("全て受注する","全て報告する","[受注可] 捨てられるほどの場所①","[^888888BaseLv230から受注可能^000000] 捨てられるほどの場所②","[受注可] 掘って、また掘って","全て破棄する")) {
		case 3:
			if(checkquest(11831)) {
				if(!(checkquest(11831)&4)) {
					mes "[シュルル]";
					cutin "ep19_iwin03.png", 2;
					mes "<URL>廃棄された原始ルガン<INFO>https://rotool.gungho.jp/monster/EP19_WASTED_RGAN_A</INFO></URL>と<URL>洞窟カラマリン<INFO>https://rotool.gungho.jp/monster/EP19_CAVE_CALMARING</INFO></URL>を各10匹ずつ倒して、";
					mes "<ITEM>[凍り付いた肉]<INFO>1000708</INFO></ITEM>を10個ほど持ってきてください。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000捨てられるほどの場所①^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000捨てられるほどの場所①^000000」";
				mes "<内容1>";
				mes "対象：<URL>廃棄された原始ルガン<INFO>https://rotool.gungho.jp/map/EP19_WASTED_RGAN_A</INFO></URL>　10体";
				mes "対象：<URL>洞窟カラマリン<INFO>https://rotool.gungho.jp/map/EP19_CAVE_CALMARING</INFO></URL>　10体";
				mes "の討伐と";
				next;
				mes "<内容2>";
				mes "アイテム：<ITEM>凍り付いた肉<INFO>1000708</INFO></ITEM>　10個";
				mes "の納品";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 12G ( 12000000000 )";
				mes "※600000000を20回受け取ります。";
				mes "JobExp 13.125G ( 13125000000 )";
				mes "※656250000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　4個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000捨てられるほどの場所①^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 23228,10;
				delquest 11831;
				setquest 11832;
				getitem 1000608,4;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 600000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,656250000,0;
				mes "[シュルル]";
				cutin "ep19_iwin03.png", 2;
				mes "おかえりなさい。";
				mes "ご無事で何よりです。";
				next;
				mes "[シュルル]";
				mes "こんなに沢山の肉をいただく度に";
				mes "あの穴がこのまま維持されたらいいな、";
				mes "という心と、あんな気持ち悪い穴は";
				mes "すぐにでも埋めてしまいたいという";
				mes "気持ちがせめぎ合います。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 12G";
				mes "( 12000000000 )";
				mes "※600000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 13.125G";
				mes "( 13125000000 )";
				mes "※656250000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　4個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(11832)) {
				if(!(checkquest(11832)&2)) {
					mes "[シュルル]";
					cutin "ep19_iwin03.png", 2;
					mes "ありがとうございました！";
					mes "今日はここまでにしましょう！";
					mes "ゆっくり休んで下さい。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000捨てられるほどの場所①^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			mes "[シュルル]";
			cutin "ep19_iwin03.png", 2;
			mes "手伝ってくれるんですか？";
			mes "それでは、^e5555e廃棄された原始ルガン^000000と^e5555e洞窟カラマリン^000000を各10匹ずつ倒して、";
			mes "^e5555e凍り付いた肉^000000を10個ほど持ってきてください。";
			next;
			mes "[シュルル]";
			mes "くれぐれも気を付けてくださいね。";
			mes "命よりも大事なものはありませんから。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000捨てられるほどの場所①^000000」";
			mes "<内容1>";
			mes "対象：<URL>廃棄された原始ルガン<INFO>https://rotool.gungho.jp/map/EP19_WASTED_RGAN_A</INFO></URL>　10体";
			mes "対象：<URL>洞窟カラマリン<INFO>https://rotool.gungho.jp/map/EP19_CAVE_CALMARING</INFO></URL>　10体";
			mes "の討伐と";
			next;
			mes "<内容2>";
			mes "アイテム：<ITEM>凍り付いた肉<INFO>1000708</INFO></ITEM>　10個";
			mes "の納品の";
			mes "両方の達成で報告が可能です。";
			mes "クエストを受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[シュルル]";
				cutin "ep19_iwin03.png", 2;
				mes "やめるのですか？";
				mes "大丈夫ですよ。";
				mes "命より大事なものはありませんからね。";
				next;
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11831;
			mes "[シュルル]";
			cutin "ep19_iwin03.png", 2;
			mes "それでは、よろしくお願いします。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000捨てられるほどの場所①^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 4:
			mes "<<B>クエスト</B>>";
			mes "「^ff0000捨てられるほどの場所②^000000」は";
			mes "BaseLv230から受注できるクエストです。";
			close;
		case 5:
			if(checkquest(11849)) {
				mes "<<B>クエスト</B>>";
				mes "「^ff0000掘って、また掘って^000000」";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 4.5G ( 4500000000 )";
				mes "※225000000を20回受け取ります。";
				mes "JobExp 3.5G ( 3500000000 )";
				mes "※175000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000掘って、また掘って^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 11835;
				delquest 11849;
				setquest 11850;
				getitem 1000608,2;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 225000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,175000000,0;
				mes "[シュルル]";
				cutin "ep19_iwin03.png", 2;
				mes "おかえりなさい。";
				mes "ご無事で何よりです。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 4.5G";
				mes "( 4500000000 )";
				mes "※225000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 3.5G";
				mes "( 3500000000 )";
				mes "※175000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(11835)) {
			}
			if(checkquest(11850)) {
				mes "[シュルル]";
				cutin "ep19_iwin03.png", 2;
				mes "ありがとうございました！";
				mes "今日はここまでにしましょう！";
				mes "ゆっくり休んで下さい。";
				next;
				mes "[インフォメーション]";
				mes "<<B>クエスト</B>>";
				mes "「^ff0000掘って、また掘って^000000」";
				mes "は時間制限中です。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[シュルル]";
			cutin "ep19_iwin03.png", 2;
			mes "捨てられた穴はまだ大きな問題が見付かっていませんが、";
			mes "いつ何が起きるか分かりません。";
			mes "なので、^e5555e怪しい痕跡^000000が無いか";
			mes "常に隈なく調査しています。";
			next;
			mes "[シュルル]";
			mes "今日も^e5555eアルプオカート^000000様に調査を依頼していますが、";
			mes "独りで調査するには、時間も多く掛かって危険です。";
			mes "ですから、"+strcharinfo(0)+"さんも^e5555e何かの痕跡^000000が無いか、";
			mes "調査を手伝っていただけませんか？";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000掘って、また掘って^000000」";
			mes "を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[シュルル]";
				cutin "ep19_iwin03.png", 2;
				mes "やめるのですか？";
				mes "大丈夫ですよ。";
				mes "命より大事なものはありませんからね。";
				next;
				mes "^ff0000[インフォメーション]";
				mes "処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11835;
			mes "[シュルル]";
			cutin "ep19_iwin03.png", 2;
			mes "まずは、^e5555eアルプオカート^000000様のところへ";
			mes "向かって、指示を受けてください。";
			mes "それでは、よろしくお願いします。";
			next;
			//showevent 0, 2, "シュルル#ep19_dq_jorab";	// 2913: 27, 116
			mes "<<B>クエスト</B>>";
			mes "「^ff0000掘って、また掘って^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
		mes "[シュルル]";
		mes "ふぅ……";
		mes "本当に恐ろしい穴でした。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[シュルル]";
		mes "そんなものが見付かったことは";
		mes "頭痛の種ですが、";
		mes "それでも幸いなのは^e5555e上級ルガン^000000が";
		mes "いなさそうなことぐらいですね。";
		next;
		mes "[シュルル]";
		mes "ルガンは頭を使える奴がいないと、";
		mes "単なる烏合の衆に過ぎませんからね。";
		next;
		mes "[シュルル]";
		mes "しかも、";
		mes "上級ルガンがいないということは、";
		mes "ルガンたちがあの穴については、";
		mes "重要視していないということです。";
		next;
		mes "[シュルル]";
		mes "こちら側から上手く塞げば、";
		mes "状況が悪化することはないでしょう。";
		mes "上手くいかなければ、";
		mes "フリーデリケ様の力を";
		mes "借りるしかないでしょうけれど。";
		next;
		mes "[シュルル]";
		mes "そうなったら";
		mes "食糧を採集できる場所も増えて、";
		mes "悪いことばかりじゃありません。";
		next;
		mes "[シュルル]";
		mes "私も引き続き穴を調査してみますが、";
		mes "今は手が足りていません。";
		mes "みなさんも時間があったら";
		mes "手伝っていただけたら幸いです。";
		setquest 11830;
		compquest 11830;
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	}
	mes "[シュルル]";
	mes "アーウィンは羽毛が豊富なほど";
	mes "格好いいものなんです。";
	cutin "ep19_iwin03.png", 2;
	close2;
	cutin "ep19_iwin03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,27,122,5	script	タマリン#ep19_refrigera	10463,{/* 2928 (cloaking)*/
	switch(EP19_2QUE) {
	case 22:
		cloakoffnpc "レハール#ep19_room";
		mes "[タマリン]";
		mes "話をすると長いのですが……。";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[タマリン]";
		mes "ええと……";
		mes "私がバルムント邸で";
		mes "働いていた時のことです。";
		mes "地下水路がまた壊れたとの報告を聞いて、";
		mes "修理をしに行ったんです。";
		next;
		mes "[タマリン]";
		mes "そうしたら、";
		mes "いきなり^e5555eイルシオン^000000たちが現れて";
		mes "私を拉致したんです。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[タマリン]";
		mes "^e5555e飛行船^000000みたいな物に";
		mes "乗せられたようでしたが……";
		mes "気が付いた時は、";
		mes "^e5555e腐った臭いが充満した洞窟^000000みたいな";
		mes "場所でした。";
		next;
		mes "[タマリン]";
		mes "周囲には私と同じように";
		mes "^e5555e拉致された人たち^000000が多かったんですが、";
		mes "数人はなんとか逃げ出したんです。";
		mes "私もその一人です。";
		mes "他の方たちが無事なのかは";
		mes "分かりません。";
		next;
		mes "[タマリン]";
		mes "洞窟を脱出して";
		mes "逃げる道中で倒れていたのを、";
		mes "こちらにいるシュルルが";
		mes "見付けて助けてくれました。";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[シュルル]";
		mes "あっ！!";
		mes "タマリン、お前、";
		mes "アーウィンじゃなかったんだ？";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[タマリン]";
		mes "いや、私のどこを見たら、";
		mes "アーウィンなんですか。";
		mes "道理で、";
		mes "何となく可哀想だといって、";
		mes "羽毛をくれる訳です……。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[シュルル]";
		mes "そうなのか！";
		mes "まぁ、些細なことは置いておこう。";
		mes "さっきはどうしたんだよ？";
		mes "急に倒れてるから";
		mes "すごい驚いたよ。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[タマリン]";
		mes "いや、些細なことって……。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[シュルル]";
		mes "まあまあ！";
		mes "それよりも、";
		mes "目は覚めず、体は段々冷たくなるし、";
		mes "そのまま死んじゃうかと思ったよ！";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[タマリン]";
		mes "ただ、いつもみたいに";
		mes "リマキナを狩っていただけなのに、";
		mes "急に足元が崩れて、";
		mes "下に落ちてしまいました。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[タマリン]";
		mes "最初は、単に氷が割れて水に落ちたと";
		mes "思ったんです。";
		mes "だけど、すぐに水の色がおかしいことに";
		mes "気づいて、急いで這い上がりました。";
		mes "そして、そこからの記憶がありません。";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[レハール]";
		mes "う～ん。";
		mes "シュルルに話によると、";
		mes "落ちたのは穴だって言ってましたね。";
		mes "かなり危険な穴なのではないでしょうか？";
		mes "気を失った原因も、";
		mes "低体温だけではないでしょう。";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[タマリン]";
		mes "そうですね。";
		mes "そういえば、穴に落ちる前に調べていた";
		mes "^e5555e罠^000000も壊れていたみたいです。";
		mes "お陰で罠に掛かっていたリマキナが";
		mes "急に解放されてひどい目にあいました。";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[シュルル]";
		mes "罠が壊れることは";
		mes "よくあることじゃないか。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[タマリン]";
		mes "そうじゃなくて……";
		mes "誰かがわざと壊したような痕跡が";
		mes "あったんです。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[シュルル]";
		mes "あの穴を疑うしかないな……。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[タマリン]";
		mes "やはり、調査した方がよさそうです。";
		mes "また誰かが怪我すると困りますから。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[シュルル]";
		mes "無理するな！";
		mes "お前は休んでいろ。";
		mes "私が行って調査してみるから。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[マークイシャ]";
		mes "私たちも手伝います。";
		mes "一人で調査でもして";
		mes "何かあったら大変ですからね。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[シュルル]";
		mes "ありがとうございます。";
		mes "では、みなさんは、<URL>凍て付いた鱗の丘<INFO>https://rotool.gungho.jp/map/jor_back1</INFO></URL>と";
		mes "<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>に";
		mes "設置してある罠を調査してください。";
		mes "私はタマリンを見つけた場所の近くを";
		mes "先に調査していますから。";
		cutin "ep19_iwin03.png", 2;
		next;
		menu "危険です",-;
		mes "[シュルル]";
		mes "心配しないでください。";
		mes "^e5555e浄化された魔力核で強化されたダイビング装備^000000を";
		mes "着ていきますので、";
		mes "ある程度は耐えられますよ。";
		next;
		mes "[シュルル]";
		mes "では、";
		mes "<URL>凍て付いた鱗の丘<INFO>https://rotool.gungho.jp/map/jor_back1</INFO></URL>と";
		mes "<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>で、";
		mes "^e5555e罠を調査^000000して";
		mes "何かを発見したら、";
		mes "<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>の北西側に";
		mes "来てください。";
		setquest 11816;	showevent 0, 3, "狩猟罠#ep19_1";	// 2915: 300, 272
		delquest 11815;
		set EP19_2QUE,23;
		cutin "ep19_iwin03.png", 255;
		cloakonnpc "レハール#ep19_room";
		cloakonnpc "テューリアン#ep19_room";
		cloakonnpc "マークイシャ#ep19_room";
		next;
		//showevent 9999, 0, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		//showevent 9999, 0, "レハール#ep19_room";	// 2912: 35, 118
		//showevent 9999, 0, "シュルル#ep19_dq_jorab";	// 2913: 27, 116
		//showevent 0, 3, "タマリン#ep19_refrigera";	// 2914: 27, 122
		mes "‐凍て付いた鱗の丘へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の丘へ向かった‐";
		close2;
		warp "jor_back1.gat", 300, 267;	// from: icas_in.gat(32, 116)
		end;
	case 23:
	case 24:
	case 25:
	case 26:
		mes "[タマリン]";
		mes "そういえば穴に落ちる前に調べた";
		mes "^e5555e罠も壊れていた^000000ようですが。";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[タマリン]";
		mes "誰かがわざと壊してような";
		mes "痕跡がありました。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[タマリン]";
		mes "やはり調査した方が良さそうです。";
		mes "また誰か怪我したら困りますからね。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[タマリン]";
		mes "まずは、";
		mes "<URL>凍て付いた鱗の丘<INFO>https://rotool.gungho.jp/map/jor_back1</INFO></URL>と";
		mes "<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>で、";
		mes "^e5555e罠を調査^000000してください。";
		next;
		mes "[タマリン]";
		mes "何かを発見したら、";
		mes "<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>の北西側にいる";
		mes "ダイバースーツのシュルルさんの所へ";
		mes "向かってください。";
		cutin "ep19_tamarin03.png", 255;
		next;
		set '@num,EP19_2QUE - 23;
		setarray '@str$,"凍て付いた鱗の丘","凍て付いた鱗の平原","凍て付いた鱗の平原","凍て付いた鱗の平原";
		setarray '@map$,"jor_back1.gat","jor_back2.gat","jor_back2.gat","jor_back2.gat";
		setarray '@x,300,346,264,259;
		setarray '@y,267,197,290,309;
		mes "‐" +'@str$['@num]+ "へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の丘へ向かった‐";
		close2;
		warp '@map$['@num], '@x['@num], '@y['@num];	// from: icas_in.gat(32, 116)
		end;
	case 36:
		if(checkquest(11851)&8) {
			cutin "ep19_tamarin01.png", 2;
			mes "[タマリン]";
			mes strcharinfo(0)+"様！";
			mes "今日も狩りに行って、";
			mes "食料調達の";
			mes "お手伝いをしていただけるんですか？";
			next;
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の丘)") == 2) {
				mes "[タマリン]";
				cutin "ep19_tamarin04.png", 2;
				mes "分かりました。";
				mes "それでは、現地に向かってください。";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_back1.gat", 226, 382;	// from: icas_in.gat(29, 119)
				end;
			}
			mes "クエストの受注や報告、";
			mes "取り消しが可能です。";
			next;
			switch(select("全て受注する","全て報告する","[受注可] 冷蔵庫が必要か？","[受注可] パリパリな道具","全て破棄する")) {
			case 3:
				if(checkquest(11852)) {
					if(countitem(1000708) < 30) {
						mes "[タマリン]";
						cutin "ep19_tamarin04.png", 2;
						mes "<URL>凍て付いた鱗の平原に出現するモンスター<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>を倒して、";
						mes "<ITEM>[凍り付いた肉]<INFO>1000708</INFO></ITEM>を^e5555e30^000000個集めてきてください。";
						mes "冷蔵庫に足しておかないと、";
						mes "ゆっくり休めそうにないんです。";
						next;
						mes "<<B>クエスト</B>>";
						mes "「^ff0000冷蔵庫が必要か？^000000」";
						mes "は受注済みのクエストです。";
						mes "こちらのクエストを破棄しますか？";
						next;
						if(select("やめる","破棄する") == 1) {
							mes "^ff0000[インフォメーション]";
							mes "処理を中断しました。^000000";
							close2;
							cutin "kafra_01.bmp", 255;
							end;
						}
					}
					mes "<<B>クエスト</B>>";
					mes "「^ff0000冷蔵庫が必要か？^000000」";
					mes "<内容>";
					mes "アイテム：<ITEM>[凍り付いた肉]<INFO>1000708</INFO></ITEM>　30個";
					mes "を納品";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 6G ( 6000000000 )";
					mes "※300000000を20回受け取ります。";
					mes "JobExp 4.5G ( 4500000000 )";
					mes "※225000000を20回受け取ります。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000冷蔵庫が必要か？^000000」";
					mes "を報告しますか？";
					next;
					if(select("報告する","やめる") == 2) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close;
					}
					delitem 1000708,30;
					delquest 11852;
					setquest 11853;
					getitem 1000608,3;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 300000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,225000000,0;
					mes "[タマリン]";
					cutin "ep19_tamarin02.png", 2;
					mes "はっ……。";
					mes strcharinfo(0)+"様、いらっしゃいませ。";
					mes "つい、眠ってしまっていました。";
					next;
					mes "[タマリン]";
					cutin "ep19_tamarin04.png", 2;
					mes "本当にお疲れ様です。";
					mes "私も早く回復して合流します。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 6G";
					mes "( 6000000000 )";
					mes "※300000000 BaseExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "JobExp 4.5G";
					mes "( 4500000000 )";
					mes "※225000000 JobExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
					mes "を獲得しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(11853)) {
					if(!(checkquest(11853)&2)) {
						mes "[タマリン]";
						cutin "ep19_tamarin04.png", 2;
						mes "今日の必要な分は十分ですから。";
						mes "無理せずにゆっくり休んでください。";
						mes "また明日もよろしくお願いします。";
						next;
						mes "[インフォメーション]";
						mes "<<B>クエスト</B>>";
						mes "「^ff0000冷蔵庫が必要か？^000000」";
						mes "は時間制限中です。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "[タマリン]";
				cutin "ep19_tamarin04.png", 2;
				mes "それでは、<URL>凍て付いた鱗の平原に出現するモンスター<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>を倒して、^e5555e凍り付いた肉^000000を^e5555e30^000000個集めてきてください。";
				mes "冷蔵庫に足しておかないと、ゆっくり休めそうにないんです。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000冷蔵庫が必要か？^000000」";
				mes "<内容>";
				mes "アイテム：<ITEM>[凍り付いた肉]<INFO>1000708</INFO></ITEM>　30個";
				mes "の納品を受注しますか？";
				next;
				if(select("受注する","やめる") == 2) {
					mes "[タマリン]";
					cutin "ep19_tamarin04.png", 2;
					mes "やめますか？";
					mes "分かりました。";
					mes "暇な時にお願いします。";
					next;
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 11852;
				mes "[タマリン]";
				cutin "ep19_tamarin04.png", 2;
				mes "それでは、よろしくお願いします。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000冷蔵庫が必要か？^000000」";
				mes "を受注しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			case 4:
				if(checkquest(11858)) {
					mes "<<B>クエスト</B>>";
					mes "「^ff0000パリパリな道具^000000」";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 4.5G ( 4500000000 )";
					mes "※225000000を20回受け取ります。";
					mes "JobExp 3.5G ( 3500000000 )";
					mes "※175000000を20回受け取ります。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000パリパリな道具^000000」";
					mes "を報告しますか？";
					next;
					if(select("報告する","やめる") == 2) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close;
					}
					delquest 11854;
					delquest 11858;
					setquest 11859;
					getitem 1000608,2;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 225000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,175000000,0;
					mes "[タマリン]";
					cutin "ep19_tamarin02.png", 2;
					mes "はっ……。";
					mes strcharinfo(0)+"様、いらっしゃいませ。";
					mes "つい、眠ってしまっていました。";
					next;
					mes "[タマリン]";
					cutin "ep19_tamarin04.png", 2;
					mes "本当にお疲れ様です。";
					mes "私も早く回復して合流します。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 4.5G";
					mes "( 4500000000 )";
					mes "※225000000 BaseExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "JobExp 3.5G";
					mes "( 3500000000 )";
					mes "※175000000 JobExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　2個";
					mes "を獲得しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(11854)) {
					mes "[タマリン]";
					cutin "ep19_tamarin04.png", 2;
					mes "<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>に行き、";
					mes "設置してある^e5555e罠^000000を調べてきてください。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000パリパリな道具^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				if(checkquest(11859)) {
					if(!(checkquest(11859)&2)) {
						mes "[タマリン]";
						cutin "ep19_tamarin04.png", 2;
						mes "今日の必要な分は十分ですから。";
						mes "無理せずにゆっくり休んでください。";
						mes "また明日もよろしくお願いします。";
						next;
						mes "[インフォメーション]";
						mes "<<B>クエスト</B>>";
						mes "「^ff0000パリパリな道具^000000」";
						mes "は時間制限中です。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "[タマリン]";
				cutin "ep19_tamarin04.png", 2;
				mes "以前、数日放置された罠を修理しようと触ったら、粉々になって風に飛んでいってしまいました。";
				next;
				mes "[タマリン]";
				cutin "ep19_tamarin04.png", 2;
				mes "そうなる前に、<URL>凍て付いた鱗の平原<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>に行き、設置してある^e5555e罠^000000を調べてきてください。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000パリパリな道具^000000」";
				mes "を受注しますか？";
				next;
				if(select("受注する","やめる") == 2) {
					mes "[タマリン]";
					cutin "ep19_tamarin04.png", 2;
					mes "やめますか？";
					mes "分かりました。";
					mes "暇な時にお願いします。";
					next;
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 11854;
				mes "[タマリン]";
				cutin "ep19_tamarin04.png", 2;
				mes "それでは、よろしくお願いします。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000パリパリな道具^000000」";
				mes "を受注しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		mes "[タマリン]";
		mes "あいたた……";
		mes "胃がむかむかして……";
		mes "脚もズキズキする……。";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[タマリン]";
		mes "身体が思ったより回復しませんね。";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[タマリン]";
		mes "早く狩りに出かけないと、";
		mes "冷蔵庫が直ぐ空になってしまうのに。";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[タマリン]";
		mes "フリーデリケ様は死ななかっただけでも";
		mes "幸いだと仰ってましたけど……。";
		cutin "ep19_tamarin04.png", 2;
		next;
		mes "[タマリン]";
		mes "今はシュルルも穴の調査の所為で";
		mes "狩りに参加できないですから、";
		mes "他の猟兵たちが目が回るほど";
		mes "忙しく働いているようですね。";
		next;
		mes "[タマリン]";
		mes "厳しい環境だから、";
		mes "狩りの道具や罠も";
		mes "すぐに劣化してしまうし……。";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[タマリン]";
		mes "よろしければ、";
		mes ""+strcharinfo(0)+"様も";
		mes "食料の調達を";
		mes "手伝っていただけませんか？";
		mes "もちろん、お礼もします。";
		next;
		if(select("手伝う","今は忙しい") == 2) {
			mes "[タマリン]";
			mes "そうですか……";
			mes "また時間ができたら";
			mes "よろしくお願いします。";
			close;
		}
		mes "[タマリン]";
		mes "ありがとうございます！";
		mes "では、冷蔵庫を確認して、";
		mes "必要な量をメモしますので";
		mes "少ししたら、";
		mes "もう一度話しかけてください。";
		cutin "ep19_tamarin04.png", 2;
		close2;
		cutin "ep19_tamarin04.png", 255;
		setquest 11851;
		compquest 11851;
		end;
	}
	mes "[タマリン]";
	mes "あ……いたた……死ぬぅ。";
	cutin "ep19_tamarin03.png", 2;
	close2;
	cutin "ep19_tamarin03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back1.gat,300,272,3	script	狩猟罠#ep19_1	10024,{/* 2929 */
	if(EP19_2QUE == 23) {
		mes "‐冷たく凍り付いた狩猟罠がある。";
		mes "　古いこと以外は特に問題は無さそうだ‐";
		next;
		mes "[アーウィンの猟兵]";
		mes "誰だ！";
		mes "猟兵でもないみたいだが、";
		mes "うちの罠を何で触っているんだ？";
		mes "敵か？！";
		cutin "ep19_iwin09.png", 2;
		next;
		menu "事情を話す",-;
		mes "[アーウィンの猟兵]";
		mes "そうでしたか。";
		mes "失礼いたしました。";
		next;
		mes "[アーウィンの猟兵]";
		mes "この周辺は特に問題ありません。";
		mes "獲物が少し減った感じはしますが……。";
		next;
		mes "[アーウィンの猟兵]";
		mes "ここら辺よりは少し北側を";
		mes "調査した方がいいと思います。";
		mes "確かに近頃モンスターたちが";
		mes "より凶暴になった気もしますから……。";
		next;
		mes "‐もっと北側を調査した方が良さそうだ‐";
		setquest 11817;
		delquest 11816;
		set EP19_2QUE,24;
		cutin "ep18_dew_09.png", 255;
		viewpoint 1, 226, 387, 1, 0xFFFF00;
		next;
		//showevent 0, 3, "タマリン#ep19_refrigera";	// 2914: 27, 122
		//showevent 0, 3, "狩猟罠#ep19_1";	// 2915: 300, 272
		//showevent 0, 3, "狩猟罠#ep19_2";	// 2916: 346, 203
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 346, 198;	// from: jor_back1.gat(300, 279)
		end;
	}
	if(EP19_2QUE == 24) {
		mes "‐冷たく凍り付いた狩猟罠がある。";
		mes "　古いこと以外は特に問題は無さそうだ‐";
		next;
		mes "‐もっと北側を調査した方が良いだろう‐";
		viewpoint 1, 226, 387, 1, 0xFFFF00;
		next;
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 346, 198;	// from: jor_back1.gat(300, 279)
		end;
	}
	end;
}
jor_back2.gat,346,203,3	script	狩猟罠#ep19_2	10024,{/* 2930 */
	if(EP19_2QUE == 24) {
		mes "‐冷たく凍り付いた狩猟罠がある。";
		mes "　古いこと以外は特に問題は無さそうだ‐";
		next;
		mes "‐穴があるという場所の周囲を";
		mes "　調査した方がよさそうだ‐";
		setquest 11818;
		delquest 11817;
		set EP19_2QUE,25;
		viewpoint 1, 260, 294, 1, 0xFFFF00;
		next;
		//showevent 0, 3, "タマリン#ep19_refrigera";	// 2914: 27, 122
		//showevent 0, 3, "狩猟罠#ep19_2";	// 2916: 346, 203
		//showevent 0, 3, "狩猟罠#ep19_3";	// 2919: 260, 294
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 264, 290;	// from: jor_back2.gat(340, 205)
		end;
	}
	if(EP19_2QUE == 25) {
		mes "‐冷たく凍り付いた狩猟罠がある。";
		mes "　古いこと以外は特に問題は無さそうだ‐";
		next;
		mes "‐穴があるという場所の周囲を";
		mes "　調査した方がよさそうだ‐";
		viewpoint 1, 260, 294, 1, 0xFFFF00;
		next;
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 264, 290;	// from: jor_back2.gat(340, 205)
		end;
	}
	end;
}
jor_back2.gat,260,296,5	script	アルプオカート#ep19_jor	10384,{/* 2931 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,258,295,3	script	マークイシャ#ep19_jor2	10383,{/* 2932 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,260,294,3	script	狩猟罠#ep19_3	10024,{/* 2933 */
	if(EP19_2QUE == 25) {
		mes "‐冷たく凍り付いた狩猟罠がある。";
		mes "　奇妙に腐敗した痕跡がある‐";
		next;
		mes "[アルプオカート]";
		mes "……毒か？";
		mes "タマリンに付いていたのと、";
		mes "似たような成分みたいだな……。";
		cutin "ep18_alf_01.png", 2;
		cloakoffnpc "アルプオカート#ep19_jor";
		cloakoffnpc "マークイシャ#ep19_jor2";
		next;
		mes "[マークイシャ]";
		mes "やはり何かがいたんですかね？";
		mes "あの穴に落ちたモンスターが";
		mes "罠に掛かったとか……。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[アルプオカート]";
		mes "それにしては、ここの連結部分……";
		mes "ここに集中的に毒が付いているのが妙だ。";
		mes "誰かが^e5555eわざと壊そうとした^000000ように見える。";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[アルプオカート]";
		mes "……一旦、ここから^e5555e北側にいるシュルル^000000に";
		mes "報告しよう。";
		mes "誰の所為で";
		mes "罠が壊れたのかは知らないが、";
		mes "どうやら穴と関連性が";
		mes "ありそうだからな。";
		setquest 11819;
		delquest 11818;
		set EP19_2QUE,26;
		cutin "ep18_alf_01.png", 255;
		cloakonnpc "アルプオカート#ep19_jor";
		cloakonnpc "マークイシャ#ep19_jor2";
		viewpoint 1, 251, 310, 1, 0xFFFF00;
		next;
		//showevent 0, 3, "狩猟罠#ep19_3";	// 2919: 260, 294
		//showevent 0, 3, "シュルル#ep19_1";	// 2923: 255, 312
		//showevent 0, 3, "タマリン#ep19_refrigera";	// 2914: 27, 122
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: jor_back2.gat(256, 302)
		end;
	}
	if(EP19_2QUE == 26) {
		mes "‐冷たく凍り付いた狩猟罠がある。";
		mes "　奇妙に腐敗した痕跡がある‐";
		next;
		mes "‐^e5555e北側にいるシュルル^000000に報告しよう‐";
		viewpoint 1, 251, 310, 1, 0xFFFF00;
		next;
		mes "‐凍て付いた鱗の平原へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: jor_back2.gat(256, 302)
		end;
	}
	end;
}
jor_back2.gat,267,279,0	script	jor_back2_sw_1	139,{/* 2934 */}
jor_back2.gat,242,303,0	script	jor_back2_sw_2	139,{/* 2935 */}
jor_back2.gat,273,307,0	script	jor_back2_sw_3	139,{/* 2936 */}
jor_back2.gat,255,312,5	script	シュルル#ep19_1	10462,{/* 2937 */
	if(EP19_2QUE == 26) {
		mes "[シュルル]";
		mes "いらっしゃいましたか。";
		mes "穴の毒は思ったよりも、";
		mes "ずっと酷いものでした。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[シュルル]";
		mes "魔力核を装着した潜水服なら";
		mes "ある程度耐えられると思いましたが、";
		mes "穴に入った途端に潜水服に装着された";
		mes "^e5555e魔力核^000000が割れてしまいました。";
		next;
		mes "[マークイシャ]";
		mes "う～ん……。";
		mes "これ以上の調査は難しそうですね。";
		mes "一度戻って^e5555eフリーデリケ^000000を";
		mes "連れて来ましょう。";
		cutin "ep18_mark_01.png", 0;
		cloakoffnpc "マークイシャ#ep19_ab";
		next;
		mes "[マークイシャ]";
		mes "さっきタマリンの毒も浄化できたから、";
		mes "この穴も浄化できるでしょう。";
		cutin "ep18_mark_01.png", 0;
		setquest 11820;
		delquest 11819;
		set EP19_2QUE,27;
		next;
		//showevent 0, 3, "シュルル#ep19_1";	// 2923: 255, 312
		//showevent 0, 3, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		cutin "ep18_mark_01.png", 255;
		cloakonnpc "マークイシャ#ep19_ab";
		mes "‐フリーデリケのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐フリーデリケのもとへ向かった‐";
		close2;
		warp "icas_in.gat", 33, 113;	// from: jor_back2.gat(258, 312)
		end;
	}
	if(EP19_2QUE == 27) {
		mes "[シュルル]";
		mes "今は氷の城へ行き^e5555eフリーデリケ^000000様を";
		mes "連れてくるのが最善のようです。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		cutin "ep19_iwin_diver01.png", 255;
		mes "‐フリーデリケのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐フリーデリケのもとへ向かった‐";
		close2;
		warp "icas_in.gat", 33, 113;	// from: jor_back2.gat(258, 312)
		end;
	}
	if(EP19_2QUE == 28) {
		mes "[シュルル]";
		mes "フリーデリケ様は";
		mes "連れてきてくださいましたか？";
		mes "早く^e5555e穴^000000を浄化しましょう！";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		cutin "ep19_iwin_diver01.png", 255;
		mes "[フリーデリケ]";
		mes "寒い……。";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "アルプオカート#ep19_ab";
		cloakoffnpc "マークイシャ#ep19_ab";
		cloakoffnpc "フリーデリケ#ep19_ab";
		next;
		mes "[フリーデリケ]";
		mes "ここ気持ち悪いよ……。";
		mes "この周囲を全部浄化したとしても、";
		mes "また毒気が上がってくると思う。";
		mes "穴の深いところで、";
		mes "毒を吐き続けてる";
		mes "何かがいるのを感じるよ。";
		next;
		mes "[シュルル]";
		mes "この周囲を全部浄化するのは無理です。";
		mes "一先ずは毒が溜まってる";
		mes "この穴の部分だけでも浄化して、";
		mes "調査することにしましょう。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "穴はすでに浄化し……くちゅん！";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[マークイシャ]";
		mes "あっ！";
		mes "身体が冷えてしまったかな？";
		mes "後は私たちが調査するから、";
		mes "フリーデリケはもう氷の城へ戻ろう。";
		mes "風邪でも引かせたら、";
		mes "私が牢獄に入れられるかも……。";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[フリーデリケ]";
		mes "じゃあ、私はテレポートで戻るよ。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "あ、そうだ。";
		mes "これはさっき浄化した魔力核だよ、";
		mes "みんなの服に一つずつ付けてあげます。";
		mes "怪我しないで戻って来てね。";
		cutin "ep19_friederike03.png", 2;
		next;
		cloakonnpc "フリーデリケ#ep19_ab";
		mes "[シュルル]";
		mes "フリーデリケ様のような方が";
		mes "この氷の城に来てくださったことは、";
		mes "どれほど幸運なことか……。";
		mes "このように魔力核も";
		mes "用意してくださって……。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[シュルル]";
		mes "ついさっきまでゲロのようだった穴が、";
		mes "こんなに綺麗な水に変わるとは……。";
		next;
		mes "[シュルル]";
		mes "……そうだ！";
		mes "こうしている暇はありません。";
		mes "毒気がまた上がってくる前に";
		mes "私から先に入ってみます。";
		next;
		mes "[シュルル]";
		mes "他の方たちは安全のために、";
		mes "^e5555e周囲のモンスターの退治^000000を";
		mes "お願いします。";
		mes "そして、^e5555e凍り付いた肉を1個^000000";
		mes "採集していただけますか？";
		next;
		mes "[シュルル]";
		mes "この穴に影響を受けた";
		mes "モンスターがいるのか、";
		mes "調査してみる必要があります。";
		setquest 11822;
		delquest 11821;
		set EP19_2QUE,29;
		close2;
		//showevent 0, 2, "シュルル#ep19_1";	// 2923: 255, 312
		cutin "ep19_iwin_diver01.png", 255;
		cloakonnpc "アルプオカート#ep19_ab";
		cloakonnpc "マークイシャ#ep19_ab";
		end;
	}
	if(EP19_2QUE == 29) {
		if(checkquest(11822)&4 && countitem(1000708) > 0) {
			mes "[シュルル]";
			mes "モンスターの退治と肉の採集";
			mes "ありがとうございます。";
			cutin "ep19_iwin_diver01.png", 2;
			next;
			mes "[シュルル]";
			mes "はぁ……";
			mes "私たちはえぐい物を";
			mes "発見したのかもしれません……。";
			next;
			mes "[シュルル]";
			mes "穴に潜水してみたら、";
			mes "人が一人通れるのがやっとぐらいの";
			mes "狭い通路が続いていて、";
			mes "最後は岩で塞がってました。";
			mes "岩を退かしたら、";
			mes "水が引き広い空間が出ましたね。";
			next;
			mes "[シュルル]";
			mes "^e5555eルガン^000000みたいなものを見たようですが、";
			mes "独りで調査するには危険過ぎると思い、";
			mes "引き上げてきました。";
			next;
			mes "[シュルル]";
			mes "皆でもう一度降りて";
			mes "調査をした方が良さそうです。";
			mes "この穴が本当に危険かどうか確認して、";
			mes "早くヴォークリンデ様に";
			mes "お知らせしないと。";
			close2;
			cutin "ep19_iwin_diver01.png", 255;
			delitem 1000708,1;
			setquest 11823;
			delquest 11822;
			set EP19_2QUE,30;
			viewpoint 1, 258, 314, 1, 0xFFFF00;
			//showevent 9999, 0, "シュルル#ep19_1";	// 2923: 255, 312
			//showevent 0, 3, "#to_jor_ab01";	// 2927: 258, 315
			end;
		}
		mes "[シュルル]";
		mes "他の方たちは安全のために、";
		mes "^e5555e周囲のモンスターの退治^000000を";
		mes "お願いします。";
		mes "そして、^e5555e凍り付いた肉を1個^000000";
		mes "採集していただけますか？";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[シュルル]";
		mes "この穴に影響を受けた";
		mes "モンスターがいるのか、";
		mes "調査してみる必要があります。";
		close2;
		cutin "ep19_iwin_diver01.png", 255;
		end;
	}
	if(EP19_2QUE == 30) {
		mes "[シュルル]";
		mes "皆でもう一度降りて";
		mes "調査をした方が良さそうです。";
		mes "この穴が本当に危険かどうか確認して、";
		mes "早くヴォークリンデ様に";
		mes "お知らせしないと。";
		close;
	}
	cutin "ep19_iwin_diver01.png", 2;
	mes "[シュルル]";
	mes "すみません。今は忙しいのです。";
	close2;
	cutin "ep19_iwin_diver01.png", 255;
	end;
}
jor_back2.gat,263,311,5	script	アルプオカート#ep19_ab	10384,{/* 2938 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,261,312,3	script	マークイシャ#ep19_ab	10383,{/* 2939 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,260,312,5	script	フリーデリケ#ep19_ab	10458,{/* 2940 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,258,315,0	script	#to_jor_ab01	45,1,1,{/* 2941 */
	if(EP19_2QUE < 30) {
		unittalk getcharid(3),strcharinfo(0)+" : ‐濁ってねっとりとした液体で塞がっており、入ることができない‐",1;
		end;
	}
	if(EP19_2QUE < 36) {
		if(EP19_2QUE == 30) {
			setquest 11824;
			delquest 11823;
			//showevent 0, 3, "アルプオカート#ep19_1_a";	// 2932: 115, 14
			set EP19_2QUE,31;
		}
		warp "jor_ab01.gat",113,10;	// 2927 from: jor_back2.gat(259, 315)
		end;
	}
	mes "‐どちらへ向かおうか？‐";
	next;
	switch(select("捨てられた穴 01","捨てられた穴 01(クエスト)") == 2) {
	case 1:
		mes "‐捨てられた穴 01へ向かった‐";
		close2;
		warp "jor_ab01_.gat", 113, 10;
		end;
	case 2:
		mes "‐捨てられた穴 01(クエスト)へ向かった‐";
		close2;
		warp "jor_ab01.gat", 113, 10;
		end;
	}
}
jor_back2_.gat,258,315,0	script	#to_jor_ab01_	45,1,1,{/* 6049 */
	unittalk getcharid(3),strcharinfo(0)+" : ‐今は入ることができない‐",1;
	end;
}

jor_ab01.gat,113,7,0	script	#to_jor_back2	45,1,1,{/* 2942 */
	mes "‐どちらへ向かおうか？‐";
	next;
	switch(select("凍て付いた鱗の平原","凍て付いた鱗の平原(クエスト)")) {
	case 1:
		mes "‐凍て付いた鱗の平原へ向かった‐";
		close2;
		warp "jor_back2_.gat",261,313;
		end;
	case 2:
		mes "‐凍て付いた鱗の平原(クエスト)へ向かった‐";
		close2;
		warp "jor_back2.gat",261,313;
		end;
	}
}
jor_ab01_.gat,113,7,0	duplicate(#to_jor_back2)	#to_jor_back2_	45,1,1

jor_ab01.gat,113,14,0	script	jor_ab01_sw_1	139,5,5,{/* 2943 */
	if(EP19_2QUE == 31 || EP19_2QUE == 32) {
		cloakonnpc "シュルル#ep19_ab";
		cloakoffnpc "アルプオカート#ep19_1_a";
	}
	if(EP19_2QUE == 33) {
		cloakonnpc "シュルル#ep19_ab";
		cloakonnpc "アルプオカート#ep19_1_a";
	}
	end;
}
jor_ab01.gat,113,34,0	script	jor_ab01_sw_2	139,{/* 2944 */}
jor_ab01.gat,116,11,3	script	シュルル#ep19_ab	10462,{/* 2945 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_ab01.gat,115,14,3	script	アルプオカート#ep19_1_a	10384,{/* 2946 (cloaking)*/
	if(EP19_2QUE == 31 || EP19_2QUE == 32) {
		mes "[アルプオカート]";
		mes "あれは全部なんだろ？";
		mes "蛇かな？";
		mes "ミミズ？？";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[シュルル]";
		mes "ルガンという種族です。";
		mes "ヨルムンガンドに仕える厄介者なんです。";
		cloakoffnpc "シュルル#ep19_ab";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[シュルル]";
		mes "蛇の巣はずっと内側にある筈なのに、";
		mes "こんな場所で";
		mes "ルガンたちが集まっているのが";
		mes "見付かるとは。";
		mes "もう少し奥まで調査してみましょう。";
		next;
		mes "[シュルル]";
		mes "ルガンもできるだけ刺激しない方が";
		mes "いいですね。";
		mes "移動しながら静かに";
		mes "観察してみるくらいにしましょう。";
		cutin "ep19_iwin_diver02.png", 2;
		if(EP19_2QUE == 31) {
			setquest 11825;
			delquest 11824;
			set EP19_2QUE,32;
		}
		next;
		//showevent 0, 3, "アルプオカート#ep19_1_a";	// 2932: 115, 14
		//showevent 0, 3, "怪しい痕跡#ep19_1_ab1";	// 2933: 223, 107
		cloakonnpc "シュルル#ep19_ab";
		cutin "ep19_iwin_diver01.png", 255;
		viewpoint 1, 222, 107, 1, 0xFFFF00;
		mes "‐内部の調査へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
	}
	if(EP19_2QUE == 33) {
		// 未調査
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_ab01.gat,223,107,3	script	怪しい痕跡#ep19_1_ab1	10045,{/* 2947 */
	if(EP19_2QUE == 32) {
		mes "[マークイシャ]";
		mes "ここから毒気が";
		mes "漏れ出してるんでしょうか？";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[アルプオカート]";
		mes "ふむ……";
		mes "腐敗毒の一種のようだな……";
		mes "自然的に発生したのか、";
		mes "人為的に作られたのかまでは";
		mes "よく解らないが……。";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[シュルル]";
		mes "確かにモンスターたちの姿も";
		mes "少しおかしいです。";
		mes "もう少し移動してみましょう。";
		cutin "ep19_iwin_diver01.png", 2;
		setquest 11826;
		delquest 11825;
		set EP19_2QUE,33;
		next;
		//showevent 9999, 0, "アルプオカート#ep19_1_a";	// 2932: 115, 14
		//showevent 0, 3, "怪しい痕跡#ep19_1_ab1";	// 2933: 223, 107
		//showevent 0, 3, "怪しい痕跡#ep19_1_ab2";	// 2934: 104, 270
		cutin "ep19_iwin_diver01.png", 255;
		viewpoint 1, 104, 270, 1, 0xFFFF00;
		mes "‐次の場所へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の場所へ向かった‐";
		close2;
		warp "jor_ab01.gat", 104, 265;	// from: jor_ab01.gat(214, 105)
		end;
	}
	if(EP19_2QUE == 33) {
		mes "[シュルル]";
		mes "確かにモンスターたちの姿も";
		mes "少しおかしいです。";
		mes "もう少し移動してみましょう。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		cutin "ep19_iwin_diver01.png", 255;
		viewpoint 1, 104, 270, 1, 0xFFFF00;
		mes "‐次の場所へ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の場所へ向かった‐";
		close2;
		warp "jor_ab01.gat", 104, 265;	// from: jor_ab01.gat(214, 105)
		end;
	}
	end;
}

jor_ab01.gat,104,270,3	script	怪しい痕跡#ep19_1_ab2	10045,{/* 2948 */
	if(EP19_2QUE == 33) {
		mes "[アルプオカート]";
		mes "ここも同じだ……";
		mes "毒気が漏れ出している。";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[シュルル]";
		mes "しかも、ここ、思ったより広いですね。";
		mes "この規模になると、";
		mes "簡単に処理できる問題ではなさそうです。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[マークイシャ]";
		mes "ハァハァ……大変です。";
		mes "皆さん。";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[シュルル]";
		mes "何がありました？";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[マークイシャ]";
		mes "あの向こう側に";
		mes "違う場所に繋がっているような";
		mes "通路があります。";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[シュルル]";
		mes "ここが終わりではないと？！";
		mes "早く行きましょう。";
		mes "異様な姿のモンスターに付いても";
		mes "知らせた方がいいでしょう。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[マークイシャ]";
		mes "その方がいいですね。";
		mes "こっちに付いて来てください。";
		cutin "ep18_mark_04.png", 0;
		setquest 11827;
		delquest 11826;
		set EP19_2QUE,34;
		close2;
		//showevent 9999, 0, "アルプオカート#ep19_1_a";	// 2932: 115, 14
		//showevent 9999, 0, "怪しい痕跡#ep19_1_ab1";	// 2933: 223, 107
		//showevent 0, 3, "怪しい痕跡#ep19_1_ab2";	// 2934: 104, 270
		//showevent 0, 3, "#to_jor_ab02";	// 2936: 8, 238
		cutin "ep18_mark_01.png", 255;
		viewpoint 1, 16, 235, 1, 0xFFFF00;
		mes "‐マークイシャがいるへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐マークイシャがいるへ向かった‐";
		close2;
		warp "jor_ab01.gat", 13, 238;	// from: jor_ab01.gat(102, 267)
		end;
	}
	if(EP19_2QUE == 34) {
		viewpoint 1, 16, 235, 1, 0xFFFF00;
		mes "‐マークイシャがいるへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐マークイシャがいるへ向かった‐";
		close2;
		warp "jor_ab01.gat", 13, 238;	// from: jor_ab01.gat(102, 267)
		end;
	}
	end;
}

jor_ab01.gat,24,238,0	script	jor_ab01_sw_3	139,{/* 2949 */}
jor_ab01.gat,8,238,0	script	#to_jor_ab02	45,{/* 2950 */
	if(EP19_2QUE < 34) {
		//未調査
		end;
	}
	if(EP19_2QUE == 34) {
		mes "[マークイシャ]";
		mes "こっちです。";
		mes "見えますか？";
		mes "この通路……。";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[シュルル]";
		mes "はぁ……。";
		mes "入口に溜まっていたほどでは";
		mes "ありませんが、";
		mes "少しずつ毒気が積もってるようです。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[シュルル]";
		mes "フリーデリケ様に付けて頂いた";
		mes "魔力核も限界のようですし、";
		mes "これ以上は危険ですから、";
		mes "一度調査は切り上げて、";
		mes "フリーデリケ様の所へ戻りましょう。";
		close2;
		cutin "ep19_iwin_diver01.png", 255;
		setquest 11828;
		delquest 11827;
		set EP19_2QUE,35;
		mes "‐フリーデリケのもとへ向かいますか？‐";
		next;
		//showevent 9999, 0, "アルプオカート#ep19_1_a";	// 2932: 115, 14
		//showevent 9999, 0, "怪しい痕跡#ep19_1_ab1";	// 2933: 223, 107
		//showevent 9999, 0, "怪しい痕跡#ep19_1_ab2";	// 2934: 104, 270
		//showevent 0, 3, "#to_jor_ab02";	// 2936: 8, 238
		//showevent 0, 3, "フリーデリケ#ep19_seizy";	// 2911: 32, 123
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐フリーデリケのもとへ向かった‐";
		close2;
		warp "icas_in.gat",33,112;	// 2936 from: jor_ab01.gat(9, 239)
		end;
	}
	if(EP19_2QUE == 35) {
		mes "[シュルル]";
		mes "はぁ……。";
		mes "入口に溜まっていたほどでは";
		mes "ありませんが、";
		mes "少しずつ毒気が積もってるようです。";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[シュルル]";
		mes "フリーデリケ様に付けて頂いた";
		mes "魔力核も限界のようですし、";
		mes "これ以上は危険ですから、";
		mes "一度調査は切り上げて、";
		mes "フリーデリケ様の所へ戻りましょう。";
		next;
		cutin "ep19_iwin_diver01.png", 255;
		mes "‐フリーデリケのもとへ向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐フリーデリケのもとへ向かった‐";
		close2;
		warp "icas_in.gat",33,112;	// 2936 from: jor_ab01.gat(9, 239)
		end;
	}
	mes "^e6328c‐「捨てられた穴 02」に入場するには、";
	mes "^e6328c　以下の条件を満たす必要があります‐";
	mes "^e6328c　・BaseLv230以上";
	mes "^e6328c　・クエスト「説話の地」のクリア";
	mes "^e6328c　・クエスト「浄化の聖女」のクリア";
	mes "^e6328c　^000000";
	mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	close;
}

jor_ab01_.gat,115,14,3	script	アルプオカート#ep19_1_a	10384,{/* 5825 */
	if(checkquest(11836)) {
		mes "[アルプオカート]";
		mes "来たか……";
		mes "俺は残りを調査する。";
		mes "調査が終わったら、";
		mes "^e5555eシュルル^000000に直接報告を頼む。";
		cutin "ep18_alf_01.png", 2;
		close2;
		cutin "ep18_alf_01.png", 255;
		end;
	}
	mes "[アルプオカート]";
	mes "来たか……";
	mes "今日も^e5555e何かの痕跡^000000がないか";
	mes "調査に向かおう。";
	cutin "ep18_alf_01.png", 2;
	next;
	mes "[アルプオカート]";
	mes "君は^e5555e捨てられた穴^000000の中で、";
	mes "^e5555e何かの痕跡^000000が無いか、";
	mes "3ヶ所ほど調べてきてくれるか？";
	mes "俺は残りを調査する。";
	mes "調査が終わったら、";
	mes "^e5555eシュルル^000000に直接報告を頼む。";
	setquest 11836;
	close2;
	//showevent 9999, 0, "アルプオカート#ep19_1_a";	// 5825: 115, 14
	//@showevent 0, 3;	// 5828: 163, 253
	//@showevent 0, 3;	// 5829: 117, 141
	//@showevent 0, 3;	// 5830: 222, 125
	//@showevent 0, 3;	// 5831: 196, 260
	//@showevent 0, 3;	// 5832: 112, 62
	//@showevent 0, 3;	// 5833: 25, 265
	cutin "ep18_alf_01.png", 255;
	end;
}
jor_ab01_.gat,163,253,3	script	何かの痕跡#ep19_1	10045,{/* 5828 */
jor_ab01_.gat,117,141,3	script	何かの痕跡#ep19_2	10045,{/* 5829 */
	unittalk getcharid(3),""+strcharinfo(0)+" : ‐何かの痕跡がある。調べてみよう‐",1;
	progressbar 1;	//color=0xb04a23
	setquest 11838;
	delquest 11838;
	unittalk getcharid(3),""+strcharinfo(0)+" : ‐あと1ヶ所調べよう‐",1;
}
jor_ab01_.gat,222,125,3	script	何かの痕跡#ep19_3	10045,{/* 5830 */}
jor_ab01_.gat,196,260,3	script	何かの痕跡#ep19_4	10045,{/* 5831 */}
jor_ab01_.gat,112,62,3	script	何かの痕跡#ep19_5	10045,{/* 5832 */
	if(checkquest(11841)) {
		unittalk getcharid(3),strcharinfo(0)+" : ‐あと2ヶ所調べよう‐",1;
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : ‐何かの痕跡がある。調べてみよう‐",1;
	progressbar 1;	//color=0xb04a23
	setquest 11841;
	compquest 11841;
	unittalk getcharid(3),strcharinfo(0)+" : ‐あと2ヶ所調べよう‐",1;
	end;
}
jor_ab01_.gat,25,265,3	script	何かの痕跡#ep19_6	10045,{/* 5833 */}

jor_back2_.gat,367,36,3	script	凍り付いた罠#ep19_0	10024,{/* 6050 */
	for(set '@i,0; '@i < 3; set '@i,'@i+1) {
		if(checkquest(11855+'@i))
			'@j++;
	}
	if(checkquest(11858)) {
		mes "‐すべての罠の整備が完了した。";
		mes "　タマリンの元へもどろう‐";
		close;
	}
	set '@num,substr(strnpcinfo(0),-1);
	set '@quest,11855+'@num;
	if(checkquest('@quest)) {
		mes "‐整備を完了した。";
		mes "　次の罠を調べてみよう‐";
		close;
	}
	mes "‐冷たく凍り付いた狩猟罠がある。";
	mes "　タマリンが言っていた罠はこれだろう。";
	mes "　整備しよう‐";
	next;
	misceffect 101;
	progressbar 1;	//color=0xffff00
	misceffect 18;
	next;
	setquest '@quest;
	compquest '@quest;
	if('@j == 2) {
		setquest 11858;
		setquest 11855;
		delquest 11855;
		setquest 11856;
		delquest 11856;
		setquest 11857;
		delquest 11857;
		mes "‐すべての罠の整備が完了した。";
		mes "　タマリンの元へもどろう‐";
		close;
	}
	mes "‐整備を完了した。";
	mes "　次の罠を調べてみよう‐";
	close;
}

jor_back2_.gat,84,88,3		duplicate(凍り付いた罠#ep19_0)	凍り付いた罠#ep19_1	10024	/* 6051 */
jor_back2_.gat,158,320,3	duplicate(凍り付いた罠#ep19_0)	凍り付いた罠#ep19_3	10024	/* 6052 */

icas_in.gat,119,62,3	script	ヴェルグンデの研究室	858,{/* 2951 */
	unittalk "ヴェルグンデの研究室",1;
	end;
}

-	shop	icas_in#callshop1	-1,611:40,602:300,601:60,645:800,656:1500,657:3000,501:50,502:200,503:550,504:1200,506:40,610:4000,717:600,1771:50
-	shop	icas_in#callshop2	-1,1100006:1200
//-	barter	icas_in#callbarter1	-1,450206:-1:0 { 1000608:-1:100 },450207:-1:0 { 1000608:-1:100 },480159:-1:0 { 1000608:-1:100 },480160:-1:0 { 1000608:-1:100 },470115:-1:0 { 1000608:-1:100 },470116:-1:0 { 1000608:-1:100 },490177:-1:0 { 1000608:-1:100 },490176:-1:0 { 1000608:-1:100 },490179:-1:0 { 1000608:-1:100 },490178:-1:0 { 1000608:-1:100 },101187:-1:0 { 1000608:-1:100 }
//-	barter	icas_in#callbarter2	-1,610037:-1:0 { 1000608:-1:100 },700052:-1:0 { 1000608:-1:100 },500049:-1:0 { 1000608:-1:100 },510061:-1:0 { 1000608:-1:100 },520017:-1:0 { 1000608:-1:100 },530025:-1:0 { 1000608:-1:100 },540049:-1:0 { 1000608:-1:100 },550069:-1:0 { 1000608:-1:100 },560032:-1:0 { 1000608:-1:100 },570029:-1:0 { 1000608:-1:100 },580030:-1:0 { 1000608:-1:100 },590038:-1:0 { 1000608:-1:100 }

icas_in.gat,180,61,5	script	マラム#ep19trader	10376,{/* 2952 */
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "何か必要な物はありますか？";
	mes "冒険者の方たちが普段よく使用する物を";
	mes "空輸してきました。";
	next;
	switch(select("道具と雑貨を見る","雪花シリーズ","グレイシア武器シリーズ","所持品を処分する","これってどういうこと？")) {
	case 1:
		mes "[マラム]";
		mes "数は十分に用意して来ましたから、";
		mes "是非ご覧ください。";
		close2;
		callshop "icas_in#callshop1",1;
		cutin "ep18_maram_01.png", 255;
		end;
	case 2:
		mes "[マラム]";
		mes "ヴェルグンデ様が制作した防具です。";
		mes "雪花の魔力で作ったものだから、";
		mes "雪花の花びらと交換しています。";
		close2;
		//callshop "icas_in#callbarter1",1;
		cutin "ep18_maram_01.png", 255;
		end;
	case 3:
		mes "[マラム]";
		mes "私が基本材料を空輸して、";
		mes "ヴェルグンデ様が製造した武器です。";
		mes "雪花の花びらと交換しています。";
		close2;
		//callshop "icas_in#callbarter2",1;
		cutin "ep18_maram_01.png", 255;
		end;
	case 4:
		mes "[マラム]";
		mes "不必要な物があれば、";
		mes "私が代わりに買取しますよ。";
		close2;
		callshop "icas_in#callshop1",2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 5:
		mes "[マラム]";
		mes "ここで私にできることは何があるかを";
		mes "考えてみました。";
		mes "どうにも私は物流調達関連の仕事ばかり";
		mes "やってきましたので、";
		mes "そちらの方向で、";
		mes "皆さんを支援する結論にいたりました。";
		next;
		mes "[マラム]";
		mes "ここは既存物資が不足しているから、";
		mes "ジンジャーさんと相談して";
		mes "定期的に飛行船で";
		mes "物資の配達をすることにしました。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ついでにヴェルグンデ様も手伝って、";
		mes "商店も開いてみましたよ。";
		mes "どうしても距離があるため、";
		mes "ある程度の";
		mes "お代を貰う必要はあるんですが……。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "必要な物資が不足しないように、";
		mes "常に物資を用意しておきますから、";
		mes "心配しないで仕事に集中してくださいね！";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1070;	// NPC:マラム#ep19trader(2952)
	setnpctitle "[アイテム交換]";	// NPC:マラム#ep19trader(2952)
	end;
}
icas_in.gat,175,63,3	script	ホヨヨ#ep19trader	10461,{/* 2953 */
	cutin "ep19_iwin02.png", 2;
	cutin "ep19_iwin02.png", 2;
	mes "[ホヨヨ]";
	mes "ヴェルグンデ様と共に";
	mes "ヨルムンガンド様の魔力を研究中です。";
	mes "アーウィン界で話題の";
	mes "スーパーフードを超えた";
	mes "ウルトラフード<ITEM>干しアイスフナムシ<INFO>1100006</INFO></ITEM>の";
	mes "販売も片手間に行っています。";
	next;
	switch(select("干しアイスフナムシを買う","干しアイスフナムシって？","あなたの名前は？","やめる")) {
	case 1:
		mes "[ホヨヨ]";
		mes "栄養満点の";
		mes "干しアイスフナムシです。";
		mes "ぜひご賞味ください。";
		close2;
		callshop "icas_in#callshop2",1;
		cutin "ep19_iwin02.png", 255;
		end;
	case 2:
		mes "[ホヨヨ]";
		mes "もしかして、";
		mes "ウルトラフード<ITEM>干しアイスフナムシ<INFO>1100006</INFO></ITEM>を";
		mes "ご存じない？";
		next;
		mes "[ホヨヨ]";
		mes "アイスフナムシは、";
		mes "その美味しさから、";
		mes "アーウィンたちの";
		mes "ソウルフードと呼ばれていると同時に、";
		mes "非常に栄養が豊富な";
		mes "スーパーフードでもあります。";
		next;
		mes "[ホヨヨ]";
		mes "そのアイスフナムシを";
		mes "乾燥させることにより、";
		mes "持ち運びまでしやすくなった、";
		mes "<ITEM>干しアイスフナムシ<INFO>1100006</INFO></ITEM>は、";
		mes "まさに^FF0000ウルトラフード^000000と呼ぶに";
		mes "ふさわしい食べ物です。";
		next;
		mes "[ホヨヨ]";
		mes "これさえあれば、";
		mes "他の食料はいらないんじゃないかとさえ";
		mes "思えてくるほどですよ。";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 3:
		mes "[ホヨヨ]";
		mes "私の本来の名前は";
		mes "ホヨヨ・ホヨヨ・ホヨヨ。";
		mes "(ロイヤル・シグニチャー・ベルガモット)";
		next;
		menu "ホヨヨ？",-;
		mes "[ホヨヨ]";
		mes "そうですね。";
		mes "格好いい名前を付けても、";
		mes "人間の耳には";
		mes "ホヨヨに聞こえるようです。";
		mes "気にせずにホヨヨと呼んでください。";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 4:
		mes "[ホヨヨ]";
		mes "そうですか。";
		mes "用事があれば、";
		mes "また声をかけてください。";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1071;	// NPC:ホヨヨ#ep19trader(2953)
	setnpctitle "[干しアイスフナムシ]";	// NPC:ホヨヨ#ep19trader(2953)
	end;
}
icas_in.gat,185,63,3	script	ヴェルグンデ#ep19vell02	10468,{/* 2955 */
	cutin "ep19_vellgunde01.png", 2;
	mes "[ヴェルグンデ]";
	mes "私に何か用か？";
	mes "普段ヨルムンガンドとルガンたちの魔力を";
	mes "研究しているんだけど、";
	mes "お互い助けられることがあったら";
	mes "助け合おう。";
	messize 180,280;
	next;
	switch(select("^888888ヴェルグンデの研究材料調達^000000","雪花エンチャント","グレイシア武器エンチャント","話をやめる")) {
	case 1:
		if(EP19_1QUE < 100 || EP19_2QUE < 36) {
			cutin "ep19_vellgunde01.png", 2;
			mes "[ヴェルグンデ]";
			mes "研究材料調達を頼むには、";
			mes "今は少しバタバタしているね。";
			mes "また落ち着いた時に頼むよ。";
			next;
			cutin "ep19_vellgunde01.png", 255;
			mes "^e6328c‐このクエストを進行するには";
			mes "^e6328c　以下の条件を満たす必要があります‐";
			mes "^e6328c　・BaseLv220以上";
			mes "^e6328c　・クエスト「説話の地」のクリア";
			mes "^e6328c　・クエスト「浄化の聖女」のクリア";
			mes "^e6328c　^000000";
			mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
			messize 180,364;
			close;
		}
		if(checkquest(130510)&8) {
			mes "[ヴェルグンデ]";
			mes "研究材料調達を手伝ってくれるのか？";
			next;
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(蛇神の温もり 01)") == 2) {
				mes "[ヴェルグンデ]";
				cutin "ep19_vellgunde01.png", 2;
				mes "分かった。";
				mes "それじゃあ、気を付けてな。";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_dun01_.gat", 113, 12;	// from: icas_in.gat(190, 61) port : 5127
				end;
			}
			mes "クエストの受注や報告、";
			mes "取り消しが可能です。";
			next;
			switch(select("全て受注する","全て報告する","[受注可] ヴェルグンデの研究材料調達","全て破棄する")) {
			case 3:
				if(checkquest(18130)) {
					if(countitem(1000706) < 3) {
						mes "[ヴェルグンデ]";
						cutin "ep19_vellgunde01.png", 2;
						mes "それじゃあ、<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>を";
						mes "3個持ってきてくれる？";
						next;
						mes "[ヴェルグンデ]";
						cutin "ep19_vellgunde01.png", 2;
						mes "<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>は、";
						mes "フリーデリケの所に行って、";
						mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を5個くらい";
						mes "浄化して貰えば手に入るはずだから。";
						next;
						mes "<<B>クエスト</B>>";
						mes "「^ff0000ヴェルグンデの研究材料調達^000000」";
						mes "は受注済みのクエストです。";
						mes "こちらのクエストを破棄しますか？";
						next;
						if(select("やめる","破棄する") == 1) {
							mes "^ff0000[インフォメーション]";
							mes "処理を中断しました。^000000";
							close2;
							cutin "kafra_01.bmp", 255;
							end;
						}
					}
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴェルグンデの研究材料調達^000000」";
					mes "<内容>";
					mes "アイテム：<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>　3個";
					mes "を納品";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 6G ( 6000000000 )";
					mes "※300000000を20回受け取ります。";
					mes "JobExp 4.5G ( 4500000000 )";
					mes "※225000000を20回受け取ります。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴェルグンデの研究材料調達^000000」";
					mes "を報告しますか？";
					next;
					if(select("報告する","やめる") == 2) {
						mes "^ff0000[インフォメーション]";
						mes "処理を中断しました。^000000";
						close;
					}
					if(checkitemblank() == 0) {
						mes "[インフォメーション]";
						mes "これ以上多くの種類の";
						mes "荷物を持つことが出来ません。";
						mes "1個以上の空きを作ってください。";
						close;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delitem 1000706,3;
					delquest 18130;
					setquest 18131;
					getitem 1000608,3;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 300000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,225000000,0;
					mes "[ヴェルグンデ]";
					cutin "ep19_vellgunde01.png", 2;
					mes "どうかした？";
					mes "お、浄化された魔力核を";
					mes "持ってきてくれたか！";
					mes "毎度ありがとう。";
					mes "やはり人手が増えるの良いことだな。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "BaseExp 6G";
					mes "( 6000000000 )";
					mes "※300000000 BaseExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "JobExp 4.5G";
					mes "( 4500000000 )";
					mes "※225000000 JobExpを";
					mes "　20回受け取りました。";
					next;
					mes "^0000ff<<B>報酬</B>>^000000";
					mes "アイテム：<ITEM>雪花の花びら<INFO>1000608</INFO></ITEM>　3個";
					mes "を獲得しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(18131)) {
					if(!(checkquest(18131)&2)) {
						mes "[ヴェルグンデ]";
						cutin "ep19_vellgunde02.png", 2;
						mes "今は大丈夫だ。";
						mes "君が持ってきた魔力核が、";
						mes "まだ十分残っているから。";
						mes "後で必要になったら、";
						mes "また要請するよ。";
						next;
						mes "[インフォメーション]";
						mes "<<B>クエスト</B>>";
						mes "「^ff0000ヴェルグンデの研究材料調達^000000」";
						mes "は時間制限中です。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "[ヴェルグンデ]";
				cutin "ep19_vellgunde01.png", 2;
				mes "それじゃあ、<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>を";
				mes "3個持ってきてくれる？";
				next;
				mes "[ヴェルグンデ]";
				cutin "ep19_vellgunde01.png", 2;
				mes "<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>は、";
				mes "フリーデリケの所に行って、";
				mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を5個くらい";
				mes "浄化して貰えば手に入るはずだから。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ヴェルグンデの研究材料調達^000000」";
				mes "<内容>";
				mes "アイテム：<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>　3個";
				mes "の納品を受注しますか？";
				next;
				if(select("受注する","やめる") == 2) {
					mes "[ヴェルグンデ]";
					cutin "ep19_vellgunde01.png", 2;
					mes "わかった。";
					mes "気にすることはない。";
					mes "レハールにやらせればいいから。";
					next;
					mes "^ff0000[インフォメーション]";
					mes "処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 18130;
				mes "[ヴェルグンデ]";
				cutin "ep19_vellgunde01.png", 2;
				mes "ありがとう。";
				mes "期待しているよ。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ヴェルグンデの研究材料調達^000000」";
				mes "を受注しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "私が必要としているのは、";
		mes "ルガンの魔力核を浄化した物。";
		mes "<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>だ。";
		next;
		mes "[ヴェルグンデ]";
		mes "ルガンたちを退治してると、";
		mes "<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>が手に入るだろう？";
		mes "あれもヨルムンガンドの残余魔力を";
		mes "吸収した結晶体なんだ。";
		next;
		mes "[ヴェルグンデ]";
		mes "だから、上手く浄化すれば、";
		mes "雪花の花びらのように";
		mes "使用が可能ということさ。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "もちろん魔力の質も落ちるから、";
		mes "使い捨てみたいなものだね。";
		mes "私はルガンとヨルムンガンドの魔力成分を";
		mes "研究中だから、それが必要なんだ。";
		next;
		mes "[ヴェルグンデ]";
		mes "まずは、<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
		mes "適当に集めてくれ。";
		mes "その後、^4d4dffフリーデリケ^000000だったかな、";
		mes "聖堂から来た娘の所へいってくれ。";
		mes "あの娘が<ITEM>[ルガンの低級魔力核]<INFO>1000707</INFO></ITEM>を";
		mes "浄化できる。";
		next;
		mes "[ヴェルグンデ]";
		mes "浄化が終わったら、";
		mes "私の所へ持ってきてほしい。";
		mes "とりあえず、<ITEM>[浄化された魔力核]<INFO>1000706</INFO></ITEM>は";
		mes "^4d4dff3^000000個あれば、十分そうだ。";
		close2;
		setquest 130510;
		compquest 130510;
		cutin "ep19_vellgunde02.png", 255;
		end;
	case 2:
		switch(select("グループ1(鎧・肩・靴)","グループ2(アクセサリー1・2)","立ち去る")) {
		case 1:
			mes "[ヴェルグンデ]";
			mes "まずは装備を確認させて。";
			mes "どれにエンチャントを施すの？";
			messize 180,280;
			next;
			mes "^ff0000エンチャント対象のアイテムを";
			mes "装着していません。";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 2:
			mes "[ヴェルグンデ]";
			mes "まずは装備を確認させて。";
			mes "どれにエンチャントを施すの？";
			messize 180,280;
			next;
			mes "^ff0000エンチャント対象のアイテムを";
			mes "装着していません。";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 3:
			cutin "ep19_vellgunde01.png", 2;
			mes "[ヴェルグンデ]";
			mes "そう。";
			mes "またくるといいわ。";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		}
	case 3:
		switch(select("グループ1(小さな氷華の魔石)","グループ2(氷華の魔石)","立ち去る")) {
		case 1:
			mes "[ヴェルグンデ]";
			mes "まずは装備を確認させて。";
			mes "どれにエンチャントを施すの？";
			messize 180,280;
			next;
			mes "^ff0000エンチャント対象のアイテムを";
			mes "装着していません。";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 2:
			mes "[ヴェルグンデ]";
			mes "まずは装備を確認させて。";
			mes "どれにエンチャントを施すの？";
			messize 180,280;
			next;
			mes "^ff0000エンチャント対象のアイテムを";
			mes "装着していません。";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 3:
			cutin "ep19_vellgunde01.png", 2;
			mes "[ヴェルグンデ]";
			mes "そう。";
			mes "またくるといいわ。";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		}
	case 4:
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "そう。";
		mes "またくるといいわ。";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	}
}

jor_tail.gat,98,287,0	warp	#to_jor_back1_1	1,1,jor_back1.gat,98,13	// 2450 from: jor_tail.gat(98, 287)
jor_back1.gat,98,10,0	warp	#to_tail_1		1,1,jor_tail.gat,98,284	// 2451 from: jor_back1.gat(98, 11)
jor_tail.gat,134,281,0	warp	#to_jor_back1_2	1,1,jor_back1.gat,131,13	// 2452 from: jor_tail.gat(135, 282)
jor_back1.gat,131,10,0	warp	#to_tail_2		1,1,jor_tail.gat,139,280	// 2453 from: jor_back1.gat(131, 11)
jor_tail.gat,219,294,0	warp	#to_jor_back1_3	1,1,jor_back1.gat,222,22	// 2454 from: jor_tail.gat(220, 294)
jor_back1.gat,222,19,0	warp	#to_tail_3		1,1,jor_tail.gat,219,291	// 2455 from: jor_back1.gat(221, 20)
jor_back1.gat,385,229,0	warp	#to_icecastle	1,1,icecastle.gat,20,123	// 2456 from: jor_back1.gat(384, 229)
icecastle.gat,17,123,0	warp	#to_jor_back1	1,1,jor_back1.gat,380,229	// 2457 from: icecastle.gat(18, 123)
jor_back1.gat,226,387,0	script	#to_jor_back2	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "‐どちらへ向かおうか？‐";
		next;
		switch(select("凍て付いた鱗の平原","凍て付いた鱗の平原(クエスト)")) {
		case 1:
			mes "‐凍て付いた鱗の平原へ向かった‐";
			close2;
			warp "jor_back2_.gat",229,17;
			end;
		case 2:
			mes "‐凍て付いた鱗の平原(クエスト)へ向かった‐";
			close2;
			warp "jor_back2.gat",229,17;
			end;
		}
	}
	warp "jor_back2.gat",229,17;
	end;
}
jor_back2.gat,229,12,0	warp	#to_jor_back1	1,1,jor_back1.gat,226,384	// 2459 from: jor_back2.gat(229, 13)
jor_back2.gat,13,248,0	script	#to_jor_back3	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "‐どちらへ向かおうか？‐";
		next;
		switch(select("凍て付いた鱗の氷河","凍て付いた鱗の氷河(クエスト)")) {
		case 1:
			mes "‐凍て付いた鱗の氷河へ向かった‐";
			close2;
			warp "jor_back3_.gat",364,245;
			end;
		case 2:
			mes "‐凍て付いた鱗の氷河(クエスト)へ向かった‐";
			close2;
			warp "jor_back3.gat",364,245;
			end;
		}
	}
	warp "jor_back3.gat",364,245;
	end;
}
jor_back2_.gat,13,248,0	duplicate(#to_jor_back3)	#to_jor_back3_	45,1,1

jor_back3.gat,368,245,0	script	#to_jor_back2	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "‐どちらへ向かおうか？‐";
		next;
		switch(select("凍て付いた鱗の平原","凍て付いた鱗の平原(クエスト)")) {
		case 1:
			mes "‐凍て付いた鱗の平原へ向かった‐";
			close2;
			warp "jor_back2_.gat",17,248;
			end;
		case 2:
			mes "‐凍て付いた鱗の平原(クエスト)へ向かった‐";
			close2;
			warp "jor_back2.gat",17,248;
			end;
		}
	}
	warp "jor_back2.gat",17,248;
	end;
}
jor_back3_.gat,368,245,0	duplicate(#to_jor_back3)	#to_jor_back2_	45,1,1

jor_back3.gat,63,326,0	script	#to_jor_dun01	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "‐どちらへ向かおうか？‐";
		next;
		switch(select("蛇神の温もり 01","蛇神の温もり 01(クエスト)")) {
		case 1:
			mes "‐蛇神の温もり 01へ向かった‐";
			close2;
			warp "jor_dun01_.gat",113,10;
			end;
		case 2:
			mes "‐蛇神の温もり 01(クエスト)へ向かった‐";
			close2;
			warp "jor_dun01.gat",113,10;
			end;
		}
	}
	if(EP19_1QUE < 18) {
		mes "‐今は他にやることがある‐";
		close;
	}
	warp "jor_dun01.gat",113,10;
	end;
}
jor_back3_.gat,63,326,0	duplicate(#to_jor_dun01)	#to_jor_dun01_	45,1,1

jor_dun01.gat,113,7,0	script	#to_jor_back3	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "‐どちらへ向かおうか？‐";
		next;
		switch(select("凍て付いた鱗の氷河","凍て付いた鱗の氷河(クエスト)")) {
		case 1:
			mes "‐凍て付いた鱗の氷河へ向かった‐";
			close2;
			warp "jor_back3_.gat",65,321;
			end;
		case 2:
			mes "‐凍て付いた鱗の氷河(クエスト)へ向かった‐";
			close2;
			warp "jor_back3.gat",65,321;
			end;
		}
	}
	warp "jor_back3.gat",65,321;
	end;
}
jor_dun01_.gat,113,7,0	duplicate(#to_jor_back3)	#to_jor_back3_	45,1,1

jor_dun01.gat,10,238,0	script	#to_jor_dun02	45,1,1,{/* 2464 */
	if(EP19_1QUE >= 68) {
		warp "jor_dun02.gat",282,87;
		end;
	}
	if(EP19_1QUE >= 63 && EP19_1QUE <= 67) {
		cloakoffnpc "アーウィン捜索隊#epm00";
		mes "[アーウィン捜索隊]";
		mes "冒険者様！今進入されますか？";
		mes "今捜索作戦に突入すると、総力を尽くさなくてはなりません。向こう側は多少混乱しております。";
		next;
		if(select("今、進入する。","準備する時間が必要だ。") == 2) {
			mes "[アーウィン捜索隊]";
			mes "はい。では準備をしっかりしてから進入してください！";
			close2;
			cloakonnpc "アーウィン捜索隊#epm00";
			end;
		}
		mes "[アーウィン捜索隊]";
		mes "武運をお祈りします！";
		close2;
		cloakonnpc "アーウィン捜索隊#epm00";
		warp "jor_que.gat",282,87;
		end;
	}
	warp "jor_dun02.gat",282,87;
	end;
}
jor_dun01_.gat,10,238,0	duplicate(#to_jor_dun02)	#to_jor_dun02_	45,1,1

jor_dun01.gat,12,240,3	script	アーウィン捜索隊#epm00	21529,{/* 2465 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_dun02.gat,286,87,0	warp	#to_jor_dun01		1,1,jor_dun01.gat,12,238	// 2466 from: jor_dun02.gat(285, 87)
jor_dun02_.gat,286,87,0	warp	#to_jor_dun01_		1,1,jor_dun01_.gat,12,238
jor_dun02.gat,18,31,0	warp	#to_jor_nest		1,1,jor_nest.gat,278,18	// 2467 from: jor_dun02.gat(19, 32)
jor_dun02_.gat,18,31,0	warp	#to_jor_nest_		1,1,jor_nest.gat,278,18
jor_nest.gat,282,18,0	script	#to_jor_dun02		45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "‐どちらへ向かおうか？‐";
		next;
		switch(select("蛇神の温もり 02","蛇神の温もり 02(クエスト)")) {
		case 1:
			mes "‐蛇神の温もり 02へ向かった‐";
			close2;
			warp "jor_dun02_.gat",21,32;
			end;
		case 2:
			mes "‐蛇神の温もり 02(クエスト)へ向かった‐";
			close2;
			warp "jor_dun02.gat",21,32;
			end;
		}
	}
	warp "jor_dun02.gat",21,32;
	end;
}
jor_que.gat,286,87,0	warp	#jor_que_jor_dun01_1	1,1,jor_dun01.gat,12,238	// 2469 from: jor_que.gat(285, 88)
icecastle.gat,213,175,0	warp	#to_icas_in			1,1,icas_in.gat,138,187	// 2470 from: icecastle.gat(213, 174)
icas_in.gat,138,183,0	warp	#out_icas			1,1,icecastle.gat,208,168	// 2471 from: icas_in.gat(138, 184)
icas_in.gat,85,257,0	warp	#in_icas_room_L		1,1,icas_in.gat,49,258	// 2472 from: icas_in.gat(86, 257)
icas_in.gat,53,258,0	warp	#out_icas_romm_L	1,1,icas_in.gat,89,257	// 2473 from: icas_in.gat(52, 258)
icas_in.gat,193,257,0	warp	#in_icas_room_R		1,1,icas_in.gat,226,258	// 2474 from: icas_in.gat(192, 257)
icas_in.gat,222,258,0	warp	#out_icas_romm_R	1,1,icas_in.gat,189,257	// 2475 from: icas_in.gat(223, 258)
icas_in.gat,83,233,0	warp	#in_dining		1,1,icas_in.gat,25,169	// 2476 from: icas_in.gat(83, 232)
icas_in.gat,25,166,0	warp	#out_dining		1,1,icas_in.gat,83,229	// 2477 from: icas_in.gat(25, 167)
icas_in.gat,193,233,0	warp	#in_bedroom		1,1,icas_in.gat,253,169	// 2478 from: icas_in.gat(193, 232)
icas_in.gat,253,166,0	warp	#ep19_in_hotel	1,1,icas_in.gat,193,229	// 2479 from: icas_in.gat(253, 167)
icecastle.gat,186,222,0	script	#in_barracks	45,1,1,{/* 2480 */
	if(EP19_1QUE < 12) {
		unittalk getcharid(3),strcharinfo(0)+" : まずは、氷の城へ向かおう。",1;
		viewpoint 1, 213, 175, 99, 0xFFFF00;
		end;
	}
	warp "icas_in.gat",108,32;
	end;
}
icas_in.gat,108,29,0	warp	#out_barracks	1,1,icecastle.gat,186,218	// 2481 from: icas_in.gat(108, 30)
icas_in.gat,92,60,0		warp	#in_barracks_L	1,1,icas_in.gat,56,60	// 2482 from: icas_in.gat(93, 60)
icas_in.gat,59,60,0		warp	#out_barracks_L	1,1,icas_in.gat,95,60	// 2483 from: icas_in.gat(58, 60)
icas_in.gat,125,60,0	warp	#in_barracks_R	1,1,icas_in.gat,161,60	// 2484 from: icas_in.gat(124, 60)
icas_in.gat,158,60,0	warp	#out_barracks_R	1,1,icas_in.gat,122,60	// 2485 from: icas_in.gat(159, 60)
icecastle.gat,124,171,0	warp	#in_restaurant	1,1,icas_in.gat,243,36	// 2486 from: icecastle.gat(123, 171)
icas_in.gat,243,33,0	warp	#out_restaurant	1,1,icecastle.gat,123,168	// 2487 from: icas_in.gat(243, 34)
icecastle.gat,64,225,0	warp	#in_house2		1,1,icas_in.gat,85,112	// 2488 from: icecastle.gat(64, 224)
icas_in.gat,85,109,0	warp	#out_house2		1,1,icecastle.gat,67,222	// 2489 from: icas_in.gat(85, 110)
icecastle.gat,88,241,0	warp	#in_house3		1,1,icas_in.gat,138,112	// 2490 from: icecastle.gat(87, 241)
icas_in.gat,138,109,0	warp	#out_house3		1,1,icecastle.gat,88,238	// 2491 from: icas_in.gat(138, 110)
icecastle.gat,159,243,0	warp	#in_house4		1,1,icas_in.gat,191,112	// 2492 from: icecastle.gat(158, 243)
icas_in.gat,191,109,0	warp	#out_house4		1,1,icecastle.gat,159,241	// 2493 from: icas_in.gat(191, 110)
icecastle.gat,62,137,0	warp	#in_house5		1,1,icas_in.gat,249,112	// 2494 from: icecastle.gat(62, 137)
icas_in.gat,249,109,0	warp	#out_house5		1,1,icecastle.gat,62,134	// 2495 from: icas_in.gat(249, 110)

icecastle.gat,61,112,5	script	メイン倉庫#icecastle	464,{/* 2826 */}
icecastle.gat,63,112,4	script	サブ倉庫1#icecastle	464,{/* 2827 */}
icecastle.gat,65,112,4	script	サブ倉庫2#icecastle	464,{/* 2828 */}
icecastle.gat,67,112,4	script	サブ倉庫3#icecastle	464,{/* 2829 */}
icecastle.gat,62,229,6	script	オララン#icecastle	21513,{/* 2830 */
	mes "[オララン]";
	mes "いらっしゃいん。羽根の民宿ですん。";
	mes "異邦人からはZenyという物をもらえと";
	mes "言われてるん！";
	mes "宿泊は5000Zeny！！";
	next;
	if(select("宿泊する - 5000z","やめる") == 2) {
		emotion 32;
		mes "[オララン]";
		mes "ふん、嫌ならやめちゃえん！";
		close;
	}
	if(Zeny < 5000) {
		// 未調査
		mes "[オララン]";
		mes "ふん、お金が足りないえん！";
		close;
	}
	mes "[オララン]";
	mes "暖かくゆっくり眠ってん～。";
	close2;
	set Zeny, Zeny -5000;
	percentheal 100,100;
	warp "icas_in.gat", 87, 114;
	end;
OnInit:
	setnpctitle "<羽根の民宿>";	// NPC:オララン#icecastle(2830)
	end;
}

icecastle.gat,69,231,5	script	メイン倉庫#icecastle_h	464,{/* 2831 */}
icecastle.gat,71,231,4	script	サブ倉庫1#icecastle_h	464,{/* 2832 */}
icecastle.gat,73,231,4	script	サブ倉庫2#icecastle_h	464,{/* 2833 */}
icecastle.gat,75,231,4	script	サブ倉庫3#icecastle_h	464,{/* 2834 */}
icas_in.gat,81,121,4	script	そうぅこ#倉庫	10046,{/* 2835 */
	unittalk getcharid(3),strcharinfo(0)+" : そうぅこ？",1;
	mes "‐変な名前のカチカチに凍った壺だ。";
	mes "　積み上げられた小銭と、";
	mes "　民宿の主のメモが貼られている‐";
	mes "　";
	mes "『倉庫は^389DD4 40Zeny^000000だん。";
	mes "　側に置いて置くと、後で持って行くん～』";
	mes "^0000ff～　羽根の民宿の主　オララン　～^000000";
	next;
	switch(select("^0000FFメイン倉庫^000000を開く","^FF0000サブ倉庫1^000000を開く","^FF0000サブ倉庫2^000000を開く","^FF0000サブ倉庫3^000000を開く","立ち去る")) {
	case 1:
	case 2:
	case 3:
	case 4:
		if(Zeny < 40) {
			// 未調査
			mes "‐お金が足りないようだ‐";
			close;
		}
		mes "^0000FF‐メイン倉庫を開いた‐^000000";
		close2;
		set Zeny, Zeny -40;
		openstorage;
		end;
	case 5:
		mes "^0000FF‐その場から立ち去った‐^000000";
		close;
	}
}

icecastle.gat,97,177,4	script	補給官#iws	21518,{/* 2888 */
	emotion 1;
	mes "[補給官ゴリル]";
	mes "どうしてこんな寒い場所まで来た？";
	mes "ここは寒くて";
	mes "霜焼けになる恐れがあるから、";
	mes "どこか暖かい場所へ入ってなさい。";
	close;
OnInit:
	setnpctitle "<イーグルパトロール隊>";	// NPC:補給官#iws(2888)
	end;
}

jor_nest.gat,21,258,1	script	#whl_effect	844,{/* 2957 (hide)*/
OnTouch:
	delmisceffect 581, "#whl_effect";
	misceffect 581,"#whl_effect";
	end;
OnInit:
	hideonnpc;
	end;
}
jor_nest.gat,22,255,6	script	ロープ#whl	10024,3,3,{/* 2958 */
	if(EP19_1QUE < 100 || BaseLevel < 230) {
		mes "^e6328c‐このクエストを進行するには";
		mes "　以下の条件を満たす必要があります‐";
		mes "　・BaseLv230以上";
		mes "　・クエスト「説話の地」のクリア";
		close;
	}
	if(checkquest(17637)) {
		mes "‐ロープの近くでレイジーに渡された";
		mes "　メモを広げてみた。";
		mes "　何か乱雑な落書きと";
		mes "　請求費用のようなものが";
		mes "　たくさん書かれている‐";
		next;
		mes "‐メモの裏面を詳しく見てみると、";
		mes "　無駄に見えるが……捨てるには";
		mes "　少々釈然としない箇所がある";
		mes "　よく見ると、";
		mes "　暗号になっているようだ‐";
		next;
		mes "‐あなたは暗号を解読した‐";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "どうやら、";
		mes "重要な構文を見つけられたようだな？";
		mes "流石は冒険者だ。";
		mes "時間がなくて詳細は省くが、";
		mes "理解してほしい。私たちは親友だろう？";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "本論から始めよう。";
		mes "イルシオンが我が物顔で使っている";
		mes "あの飛行船のことだけど、";
		mes "壊せないよ。";
		mes "それがジンジャーから聞いた内容だ。";
		next;
		menu "落書きの中の他の文章たちを組み合わせてみる。",-;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "あの飛行船を動かしている者は、";
		mes "人間じゃないらしい。";
		next;
		menu "少し変色した別の部分の文章を読んでみる",-;
		mes "[レイジー]";
		mes "どれどれ、";
		mes "ジンジャーの分析報告書によると、";
		mes "無限に自己修復が可能な";
		mes "エネルギーコア形態の人工知能のようだ。";
		mes "完全な知能を持つ、";
		mes "エネルギー体ということだね。";
		next;
		menu "昼食代が計算された部分の下を読んでみる",-;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "理解できるか？";
		mes "あの飛行船を動かす奴は、";
		mes "無限にエネルギー生成が可能な";
		mes "爆弾のような存在だ。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "あれを力づくで無理やり破壊する場合……";
		mes "なんてこった！";
		mes "最低でも半径10kmぐらいは跡形も残さず";
		mes "更地になるらしいよ！";
		next;
		menu "さらに続きの部分を読んでみる",-;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "一定レベル以上の";
		mes "ダメージが蓄積すると";
		mes "一次的にコアが停止する。";
		next;
		mes "[レイジー]";
		mes "その状態でダメージが";
		mes "さらに蓄積すると";
		mes "大爆発が発生するが";
		mes "これは欠陥のようだ。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "おそらく、バルムントも";
		mes "人工知能で制御している";
		mes "飛行船が能動的な爆弾になることに";
		mes "気づいたんだろう。";
		next;
		mes "[レイジー]";
		mes "だから同じモデルが";
		mes "追加生産されていないのではないかと";
		mes "推測中だ。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "ジンジャーは";
		mes "^0000ff「これが主様の『痛い指』らしいよ。";
		mes "^0000ffそれが何て意味なのかは";
		mes "^0000ffよく分からないけど」";
		mes "^000000と言っていた。";
		next;
		mes "[レイジー]";
		mes "完全に壊すと爆発するし、";
		mes "少し壊しても復旧するのが";
		mes "目に見えている。";
		next;
		mes "[レイジー]";
		mes "なら答えは一つしかない。";
		mes "まぁ、適当に運行できない程度に";
		mes "飛行船の内部を壊しといて、";
		mes "とんずらするんだよ。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "今頃、";
		mes "表情が凄いことになっていそうだね。";
		mes "とにかく、";
		mes "本気で飛行船を壊しそうだったから、";
		mes "老婆心で助言したんだよ。";
		mes "ありがたいと思ってくれ！";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "じゃあ、幸運を祈るよ！";
		mes "生きてまた会おう！";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "‐メモの内容はここまでのようだ。";
		mes "　準備ができたら、";
		mes "　再度ロープを調べて";
		mes "　飛行船に突入しよう‐";
		close2;
		delquest 17637;
		end;
	}
	mes "‐飛行船を留めるためのロープがある‐";
	next;
	mes "^e6328cメモリアルダンジョン";
	mes "「飛行船破壊作戦」の";
	mes "生成と入場が行えます。";
	mes "　";
	mes "^8c32e6ダンジョン生成：^191970生成可能";
	mes "^8c32e6ダンジョン入場：^191970入場可能";
	mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	messize 180,364;
	next;
	switch(select("^191970立ち去る","^0b0b33メモリアルダンジョンへ入場","^0b0b33注意事項の確認")) {
	case 1:
		mes "‐あなたはこの場を去った‐";
		close;
	case 2:
		break;
	case 3:
		mes "詳しくはこちらをご確認ください。";
		mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
	if(mdopenstate("飛行船破壊作戦")) {
		mes "‐飛行船破壊作戦に向かいますか？‐";
		next;
		if(select("^191970少し考える","^e6328c飛行船破壊作戦へ向かう") == 1) {
			mes "‐あなたは少し考えることにした‐";
			close;
		}
		mes "‐あなたは飛行船破壊作戦に向かった‐";
		close2;
		switch(mdenter("飛行船破壊作戦")) {
		case 0:	// エラーなし
			setquest 130605;	// state=1
			setquest 130610;	// state=1
			announce "メモリアルダンジョン[飛行船破壊作戦] に入場しました　：　"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			//warp "1@whl.gat", 32, 53;
			end;
		case 1:	// パーティー未加入
			mes "^8c32e6パーティーが解体されているため";
			mes "入場できません。";
			mes "もう一度確認してから";
			mes "やり直してください。";
			close;
		case 2:	// ダンジョン未作成
			mes "^8c32e6パーティーリーダーが";
			mes "メモリアルダンジョンを";
			mes "生成していない状態です。";
			close;
		default:	// その他エラー
			end;
		}
	}
	else {
	}
}
OnTouch:
	delmisceffect 581, "#whl_effect";
	misceffect 581,"#whl_effect";
	end;
OnInit:
	setnpcgroup 1013;	// NPC:ロープ#whl(2958)
	setnpctitle "[MDの生成と入場]";	// NPC:ロープ#whl(2958)
	end;
}
jor_nest.gat,63,257,0	script	#hw_ep19re6	139,8,8,{/* 2959 */
	if(EP19_1QUE >= 68)
		cloakoffnpc "アロロン#ep19re2";
	else
		cloakonnpc "アロロン#ep19re2";
	end;
}
jor_nest.gat,63,257,3	script	アロロン#ep19re2	10461,{/* 2960 (cloaking)*/
	if(EP19_1QUE < 68)	// ? 未調査
		end;
	if(!(checkquest(16663)&8)) {
		cutin "ep19_iwin01.png", 2;
		mes "[アロロン]";
		mes "ユンケアとの戦闘、";
		mes "ビリっときませんでしたか？";
		mes "また戦いたいと、思いませんか？";
		next;
		cutin "ep19_iwin01.png", 255;
		if(select("思う","思わない") == 2) {
			cutin "ep19_iwin01.png", 2;
			mes "[アロロン]";
			mes "そうですか？";
			mes "つまらない方ですね。";
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		cutin "ep19_iwin01.png", 2;
		mes "[アロロン]";
		mes "そんな冒険者様のために";
		mes "準備いたしました。";
		mes "シミュレーションデータのユンケアとの";
		mes "ビリビリする模擬戦闘。";
		next;
		mes "[アロロン]";
		mes "氷の城の方々と準備したものですから";
		mes "安全、安心！";
		mes "シミュレーション戦闘は";
		mes "週に2回まで可能です。";
		mes "挑戦してみますか？";
		next;
		if(select("する","しない") == 2) {
			cutin "ep19_iwin01.png", 2;
			mes "[アロロン]";
			mes "あら、つまらない方ですね。";
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		compquest 16663;
		mes "[アロロン]";
		mes "それでは、準備ができましたら、";
		mes "もう一度話しかけてくださいませ。";
		close2;
		//showevent 0, 1, "バゴットの研究室#warp_e";	// 2652: 66, 260
		//showevent 9999, 0, "アロロン#ep19re2";	// 2946: 63, 257
		cutin "ep19_iwin01.png", 255;
		end;
	}
	cutin "ep19_iwin01.png", 2;
	mes "[アロロン]";
	mes "シミュレーション室の";
	mes "準備を開始してもよろしいですか？";
	next;
	mes "^e6328cメモリアルダンジョン";
	mes "「シミュレーション戦闘」の";
	mes "生成と入場が行えます。";
	mes "　";
	mes "^8c32e6ダンジョン生成：^191970生成可能";
	mes "^8c32e6ダンジョン生成：^191970生成不可";
	mes "　";
	mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	messize 180,364;
	next;
	if(mdopenstate("シミュレーション戦闘"))
		set '@menu$,"^0b0b33ダンジョンへ入場";
	else if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@menu$,"^0b0b33ダンジョンの作成";
	else
		set '@menu$,"";
	if(select("^191970立ち去る",'@menu$) == 1) {
		mes "[アロロン]";
		mes "残念ですね。";
		messize 180,280;
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	if(mdopenstate("シミュレーション戦闘")) {
		mes "[アロロン]";
		mes "シミュレーション室の";
		mes "準備ができました。";
		messize 180,280;
		close2;
		cutin "ep19_iwin01.png", 255;
		switch(mdenter("はじめてのパトロール")) {
		case 0:	// エラーなし
			announce "メモリアルダンジョン[シミュレーション戦闘] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x9, 0x00ff99;
			donpcevent getmdnpcname("FirstPatrolControl1")+ "::OnStart";
			//warp "1@jca_1.gat", 57, 45;
			end;
		case 1:	// パーティー未加入
			mes "^8c32e6パーティーが解体されているため";
			mes "入場できません。";
			mes "もう一度確認してから";
			mes "やり直してください。";
			close;
		case 2:	// ダンジョン未作成
			mes "^8c32e6パーティーリーダーが";
			mes "メモリアルダンジョンを";
			mes "生成していない状態です。";
			close;
		default:	// その他エラー
			end;
		}
	}
	else {
		if(getonlinepartymember() < 1) {
			mes "^8c32e6空白のパーティー名では、";
			mes "メモリアルダンジョンを";
			mes "作成することは出来ません。";
			messize 180,280;
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		mes "^000000シミュレーション戦闘を生成します。";
		mes "^000000よろしいですか？";
		mes "^0000ff週間生成回数( 0 / 2 )";
		mes "　";
		mes "^e6328c◆注意事項";
		mes "^000000・「シミュレーション戦闘」は約1週間での生成回数が定められています。";
		mes "^000000　最大2回まで生成が可能です。";
		mes "^000000　生成回数は次の火曜日の正午以降に";
		mes "^000000　初めて「シミュレーション戦闘」を生成する際にリセットされます。";
		mes "　";
		mes "^ff0000・作成中または作成済みのメモリアルダンジョンが存在する場合、";
		mes "^ff0000　ダンジョンの作成に失敗する場合があります。";
		mes "^ff0000　また、作成に失敗した場合でも、生成回数はカウントされます。";
		mes "　";
		mes "^000000そのほかの注意事項は、";
		mes "公式サイトにある「シミュレーション戦闘のルール」をご覧ください。";
		mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 364,448;
		next;
		if(select("^191970少し考える","^e6328c作成する") == 1) {
			mes "‐その場を離れた‐";
			messize 180,280;
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			close;
mes "「"+strcharinfo(0)+"」は、";
mes "再生成待機時間中のため、";
mes "メモリアルダンジョンは生成出来ません。";
mes "以下の条件を全て満たすと生成が可能です。";
mes "　";
mes "^e6328c・次の火曜日の正午以降";
messize 180,364;
close;
cutin "ep19_iwin01.png", 255;
		setquest 130630;
		setquest 130631;
		mdcreate "シミュレーション戦闘";
		mes "■パーティー名";
		mes "^009eff#ふえふえ^000000";
		mes "■パーティーリーダー";
		mes "^009eff"+strcharinfo(0)+"^000000";
		mes "　";
		mes "^006400シミュレーション戦闘の";
		mes "作成申請を受け付けました。^000000";
		messize 180,280;
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1013;	// NPC:アロロン#ep19re2(2946)
	setnpctitle "[MDの生成と入場]";	// NPC:アロロン#ep19re2(2946)
	cloakonnpc;
	end;
}

//------------------------------------------------------------
// jor_tail.gat
jor_tail.gat,0,0,0,0	monster	光るワカメ	21524,80,5000,0,0	// aid: 249-328
jor_tail.gat,0,0,0,0	monster	アイスフナムシ	21525,90,5000,0,0	// aid: 329-418
//------------------------------------------------------------
// jor_back1.gat
jor_back1.gat,0,0,0,0	monster	光るワカメ	21524,60,5000,0,0	// aid: 419-478
jor_back1.gat,0,0,0,0	monster	アイスフナムシ	21525,60,5000,0,0	// aid: 479-538
jor_back1.gat,0,0,0,0	monster	アイスストロー	21523,80,5000,0,0	// aid: 540-618
//------------------------------------------------------------
// jor_back2.gat
jor_back2.gat,0,0,0,0	monster	不凍花	21521,10,5000,0,0	// aid: 619-628
jor_back2.gat,0,0,0,0	monster	アイスフナムシ	21525,40,5000,0,0	// aid: 629-668
jor_back2.gat,0,0,0,0	monster	アイスストロー	21523,40,5000,0,0	// aid: 669-708
jor_back2.gat,0,0,0,0	monster	リマキナ	21520,10,5000,0,0	// aid: 709-718
//------------------------------------------------------------
// jor_back3.gat
jor_back3.gat,0,0,0,0	monster	原始ルガン	21526,1,5000,0,0	// aid: 719
jor_back3.gat,0,0,0,0	monster	最下級ルガン	21527,1,5000,0,0	// aid: 720
jor_back3.gat,0,0,0,0	monster	アイスフナムシ	21525,40,5000,0,0	// aid: 721-760
jor_back3.gat,0,0,0,0	monster	不凍花	21521,3,5000,0,0	// aid: 762-763
jor_back3.gat,0,0,0,0	monster	カラマリン	21522,10,5000,0,0	// aid: 764-773
jor_back3.gat,0,0,0,0	monster	リマキナ	21520,10,5000,0,0	// aid: 774-783
//------------------------------------------------------------
// jor_dun01.gat
jor_dun01.gat,0,0,0,0	monster	原始ルガン	21526,6,5000,0,0	// aid: 784-789
jor_dun01.gat,0,0,0,0	monster	最下級ルガン	21527,6,5000,0,0	// aid: 790-795
jor_dun01.gat,0,0,0,0	monster	下級ルガン	21528,6,5000,0,0	// aid: 796-801
jor_dun01.gat,0,0,0,0	monster	ハートハンターAT	21599,3,5000,0,0	// aid: 802-804
//------------------------------------------------------------
// jor_dun02.gat
jor_dun02.gat,0,0,0,0	monster	最下級ルガン	21527,6,5000,0,0	// aid: 805-810
jor_dun02.gat,0,0,0,0	monster	下級ルガン	21528,6,5000,0,0	// aid: 811-816
jor_dun02.gat,0,0,0,0	monster	中級ルガン	21529,6,5000,0,0	// aid: 817-822
jor_dun02.gat,0,0,0,0	monster	ハートハンターAT	21599,3,5000,0,0	// aid: 823-825
//------------------------------------------------------------
// gw_fild01.gat
//gw_fild01.gat,0,0,0,0	monster	アッシュホッパー	21302,16,0,0,0	// aid: 4670-4716
//gw_fild01.gat,0,0,0,0	monster	アッシュリン	21303,19,5371,0,0	// aid: 4721-4828
//gw_fild01.gat,0,0,0,0	monster	グレイウルフ	21304,13,172832,0,0	// aid: 4834-4864
//------------------------------------------------------------
// gw_fild02.gat
//gw_fild02.gat,0,0,0,0	monster	シゲリン	21305,6,38593,0,0	// aid: 4871-4906
//gw_fild02.gat,0,0,0,0	monster	グレイウルフ	21304,2,0,0,0	// aid: 4944-4946
//gw_fild02.gat,0,0,0,0	monster	アッシュリン	21303,3,0,0,0	// aid: 4950-4957
//gw_fild02.gat,0,0,0,0	monster	ファイアウィンドカイト	21306,18,0,0,0	// aid: 4967-5069
//gw_fild02.gat,0,0,0,0	monster	ファントムウルフ	21307,14,0,0,0	// aid: 5077-5180

/*
21305,シゲリン＠ポイズンアタック,attack,188,1,2000,0,0,no,target,always,0,,,,,,
21305,シゲリン＠アーススパイク,chase,90,5,2000,0,0,no,target,always,0,,,,,,
21306,ファイアウィンドカイト＠ボウリングバッシュ,attack,62,1,2000,0,32,no,target,always,0,,,,,,
21306,ファイアウィンドカイト＠ソニックブロー,attack,136,8,2000,0,49885,no,target,always,0,,,,,,
21307,ファントムウルフ＠ガイデッドアタック,chase,172,1,2000,0,17178,no,target,always,0,,,,,,
21307,ファントムウルフ＠テレキネシスアタック,attack,191,1,2000,0,31396,no,target,always,0,,,,,,
21307,ファントムウルフ＠グラウンドアタック,attack,185,1,2000,0,0,no,target,always,0,,,,,,
21307,ファントムウルフ＠クローキング,attack,135,1,2000,300,3227,no,self,always,0,,,,,,
21307,ファントムウルフ＠グリムトゥース,chase,137,1,2000,0,39,no,target,always,0,,,,,,
21307,ファントムウルフ＠バッシュ,attack,5,1,2000,0,3092,no,target,always,0,,,,,,
21520,リマキナ＠ホーリーアタック,attack,189,1,2000,0,1154,no,target,always,0,,,,,,
21520,リマキナ＠ダブルストレイフィング,attack,46,2,2000,0,237279,no,target,always,0,,,,,,
21520,リマキナ＠ウォーターアタック,attack,184,1,2000,0,269293,no,target,always,0,,,,,,
21520,リマキナ＠シャープシューティング,attack,382,1,2000,0,48,no,target,always,0,,,,,,
21520,リマキナ＠ブラインドアタック,attack,177,1,2000,0,325618,no,target,always,0,,,,,,
21521,不凍花＠ベナムフォグ,chase,706,0,2000,0,31,no,self,always,0,,,,,,
21521,不凍花＠ヒール,chase,28,115940,2000,0,9589775,no,friend,always,0,,,,,,
21521,不凍花＠Mレイオブジェネシス,attack,737,7,2000,200,30,no,friend,always,0,,,,,,
21521,不凍花＠ホーリーアタック,chase,189,1,2000,0,1952540,no,target,always,0,,,,,,
21521,不凍花＠スピアブーメラン,chase,59,1,2000,0,0,no,target,always,0,,,,,,
21521,不凍花＠ウォーターアタック,chase,184,1,2000,0,0,no,target,always,0,,,,,,
21522,カラマリン＠ベナムフォグ,chase,706,0,2000,0,46,no,self,always,0,,,,,,
21522,カラマリン＠ヒール,chase,28,110300,2000,0,0,no,friend,always,0,,,,,,
21522,カラマリン＠ホーリーアタック,chase,189,1,2000,0,86260,no,target,always,0,,,,,,
21523,アイスストロー＠コールドボルト,chase,14,5,2000,0,127988,no,target,always,0,,,,,,
21523,アイスストロー＠ウォーターアタック,attack,184,1,2000,0,0,no,target,always,0,,,,,,
21525,アイスフナムシ＠ウォーターアタック,attack,184,1,2000,0,0,no,target,always,0,,,,,,
21525,アイスフナムシ＠フロストダイバー,chase,15,1,2000,0,307347,no,target,always,0,,,,,,
21526,原始ルガン＠ベナムフォグ,chase,706,10,2000,0,20,no,self,always,0,,,,,,
21526,原始ルガン＠ベナムフォグ,attack,706,10,2000,0,20,no,self,always,0,,,,,,
21526,原始ルガン＠ポイズンアタック,chase,188,1,2000,0,12532,no,target,always,0,,,,,,
21526,原始ルガン＠カースアタック,chase,181,1,2000,0,116215,no,target,always,0,,,,,,
21526,原始ルガン＠テレキネシスアタック,chase,191,1,2000,0,71501,no,target,always,0,,,,,,
21526,原始ルガン＠ヒール,chase,28,127870,2000,0,452,no,friend,always,0,,,,,,
21527,最下級ルガン＠スリープアタック,chase,182,1,2000,0,11763,no,target,always,0,,,,,,
21527,最下級ルガン＠ポイズンアタック,chase,188,1,2000,0,9685,no,target,always,0,,,,,,
21527,最下級ルガン＠ベナムフォグ,chase,706,0,2000,0,24,no,self,always,0,,,,,,
21527,最下級ルガン＠テレキネシスアタック,chase,191,1,2000,0,34372,no,target,always,0,,,,,,
21527,最下級ルガン＠グラウンドアタック,attack,185,1,2000,0,0,no,target,always,0,,,,,,
21528,下級ルガン＠ベナムフォグ,chase,706,0,2000,0,19,no,self,always,0,,,,,,
21528,下級ルガン＠ポイズンアタック,chase,188,1,2000,0,1078996,no,target,always,0,,,,,,
21528,下級ルガン＠ポイズンアタック,attack,188,1,2000,0,1078996,no,target,always,0,,,,,,
21528,下級ルガン＠テレキネシスアタック,chase,191,1,2000,0,907,no,target,always,0,,,,,,
21528,下級ルガン＠ダークストライク,chase,340,3,2000,0,395689,no,target,always,0,,,,,,
21528,下級ルガン＠ブラインドアタック,chase,177,1,2000,0,25975,no,target,always,0,,,,,,
21528,下級ルガン＠ブラッドドレイン,chase,199,1,2000,0,0,no,target,always,0,,,,,,
21528,下級ルガン＠ヒール,chase,28,126800,2000,0,942,no,friend,always,0,,,,,,
21529,中級ルガン＠ベナムフォグ,chase,706,0,2000,0,22,no,self,always,0,,,,,,
21529,中級ルガン＠ポイズンアタック,chase,188,1,2000,0,77721,no,target,always,0,,,,,,
21529,中級ルガン＠テレキネシスアタック,chase,191,1,2000,0,46904,no,target,always,0,,,,,,
21529,中級ルガン＠ソウルストライク,chase,13,5,2000,0,0,no,target,always,0,,,,,,
21529,中級ルガン＠マグナムブレイク,attack,7,1,2000,0,26,no,target,always,0,,,,,,
21529,中級ルガン＠コールドボルト,chase,14,3,2000,0,8100079,no,target,always,0,,,,,,
21599,ハートハンターAT＠テレキネシスアタック,chase,191,1,2000,0,2556023,no,target,always,0,,,,,,
21599,ハートハンターAT＠Mサイキックウェーブ,attack,736,4,2000,0,19,no,around,always,0,,,,,,
*/

//ルガン変身スクロール
/*
{
	if(!getmapxy('@map$,'@x,'@y,0))
		misceffect 53,"";
	else if('@map$ == "jor_back3.gat" || '@map$ == "jor_dun01.gat" || '@map$ == "jor_dun02.gat" || '@map$ == "jor_nest.gat") {
		misceffect 595,"";
		sc_start SC_MONSTER_TRANSFORM,180000,21530;
	}
	else {
		misceffect 53,"";
	}
	end;
}
*/