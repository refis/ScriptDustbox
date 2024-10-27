ra_fild10.gat,0,0,0,0	monster	グレイゴート	21323,5,60000,0,0
ra_fild10.gat,0,0,0,0	monster	子グレイウルフ	21324,5,60000,0,0
ra_fild10.gat,0,0,0,0	monster	マグマリン	1836,75,5000,0,0
ra_fild10.gat,0,0,0,0	monster	ドロセラ	1781,75,5000,0,0
ra_fild10.gat,0,0,0,0	monster	ラケソン	21296,5,60000,0,0

ra_fild11.gat,0,0,0,0	monster	グレイゴート	21323,5,60000,0,0
ra_fild11.gat,0,0,0,0	monster	子グレイウルフ	21324,5,60000,0,0
ra_fild11.gat,0,0,0,0	monster	ラケソン	21296,5,60000,0,0
ra_fild11.gat,0,0,0,0	monster	ドロセラ	1781,75,5000,0,0

// gw_fild01.gat
gw_fild01.gat,0,0,0,0	monster	アッシュホッパー	21302,50,5000,0,0	// aid: 8898-8947
gw_fild01.gat,0,0,0,0	monster	アッシュリン	21303,110,5000,0,0	// aid: 8948-9057
gw_fild01.gat,0,0,0,0	monster	グレイウルフ	21304,35,5000,0,0	// aid: 9058-9092


// EP18_1QUE

ba_in01.gat,26,266,0	script	#ep18w11_147	139,15,15,{
OnTouch:
	if(EP172_1QUE == 100) {
		cloakonnpc "スマートエリー#ep172_ely01";
		cloakoffnpc "スマートエリー#ep18ely0_001";
	} else {
		cloakoffnpc "スマートエリー#ep172_ely01";
		cloakonnpc "スマートエリー#ep18ely0_001";
	}
	end;
}

// スマートエリー#ep172_ely01の15セル以内に入るとcloakoff
ba_in01.gat,26,266,3	script	スマートエリー#ep18ely0_001	10354,{/* 10652 (cloaking)*/
	if(EP172_1QUE != 100 && checkquest(202235) == 0)
		end;
	if(EP18_1QUE == 0) {
		if(checkitemblank() < 1) {
			mes "‐荷物をこれ以上持てません";
			mes "　荷物に1個以上の空きを";
			mes "　作ってください‐";
			close;
		}
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "現在、特異信号の内容と";
		mes "バルムント様のコレクション3号の行方を";
		mes "解析しております。";
		mes "現在、解析率が99％まで達しています。";
		mes "もう少しお待ちください。";
		next;
		mes "[スマートエリー]";
		mes "……。";
		next;
		mes "[スマートエリー]";
		mes "……。";
		mes "…………。";
		next;
		mes "[スマートエリー]";
		mes "……。";
		mes "…………。";
		mes "………………。";
		next;
		mes "[スマートエリー]";
		mes "暗号の解析が完了しました。";
		mes "時間が掛かってしまい申し訳ありません。";
		next;
		cloakoffnpc "ルッキー#ep181_rk01_003";
		cloakoffnpc "エスト・ラブロイ#ep181_002";
		cutin "ep162_est01.bmp", 1;
		mes "[エスト]";
		mes "特異信号の解析が済んだそうだな。";
		mes "結果を報告しろ。";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "解析の結果、特異信号は";
		mes "アルナベルツ教国の「ラヘル」から";
		mes "発信されていました。";
		mes "信号の内容は";
		mes "「次の指示を待つ」とのことです。";
		next;
		cutin "ep162_est03.bmp", 1;
		mes "[エスト]";
		mes "ラヘルにいる奴らは、まだここから";
		mes "仲間が逃げ出したことを知らないんだな？";
		mes "それは都合が良い。";
		mes "……が、私たちは動けん。";
		next;
		cutin "16loo_01.bmp", 0;
		mes "[ルッキー]";
		mes "……え？";
		mes "せっかくのチャンスを逃すんですか？";
		next;
		cutin "ep162_est03.bmp", 1;
		mes "[エスト]";
		mes "私たちみたいな非合法の武装集団が";
		mes "いきなり国境を越えて";
		mes "他国に移動したらどうなると思う？";
		mes "歓迎してもらえるとでも思ってるのか？";
		next;
		mes "[エスト]";
		mes "戦争でもおっぱじめるつもりなら";
		mes "それでも構わんが。";
		mes "お前は、もう少し考えてから発言しろ。";
		next;
		cutin "16loo_03.bmp", 0;
		mes "[ルッキー]";
		mes "なるほど、たしかに……";
		mes "失礼しました。";
		next;
		cutin "ep162_est01.bmp", 1;
		mes "[エスト]";
		mes "レッケンベルとの問題も";
		mes "完全に解決したわけじゃない。";
		mes "奴らを牽制するために";
		mes "私たちがここを離れるわけにはいかん。";
		next;
		cutin "16loo_02.bmp", 0;
		mes "[ルッキー]";
		mes "では、どうしますか？";
		mes "と言ったものの、考えていることは";
		mes "同じだと思いますが。";
		next;
		cutin "16loo_03.bmp", 255;
		mes "‐エストとルッキーは";
		mes "　同時にこちらに顔を向けた‐";
		next;
		cutin "ep162_est01.bmp", 1;
		mes "[エスト]";
		mes "ご指名だぞ。";
		mes "「"+strcharinfo(0)+"」。";
		mes "単独で動けるお前なら";
		mes "奴らの動向を探ってくるのに";
		mes "うってつけと云うわけだ。";
		next;
		menu "任せてください",-,"……仕方ない",-;
		cutin "ep162_est02.bmp", 1;
		mes "[エスト]";
		mes "それにしても冒険者ってのは";
		mes "本当に便利な奴らだな。";
		mes "武装したまま国境を越えても";
		mes "怪しまれんのはお前たちぐらいなものだ。";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "お待ちください。";
		mes "単独行動は危険です。";
		mes "遠方での活動に加えて";
		mes "相手の戦力がハッキリしない以上";
		mes "サポートが必要と思われます。";
		next;
		cutin "ep162_est01.bmp", 1;
		mes "[エスト]";
		mes "こちらから人員は出せんぞ？";
		mes "「"+strcharinfo(0)+"」が";
		mes "ヘマした際に、リベリオンのことが";
		mes "表沙汰になるのは困る。";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "私……「エリー」がサポートいたします。";
		mes "管理者アルファからも承認を得ました。";
		mes "とはいえ、私もここから離れるわけには";
		mes "いきませんので……";
		mes "こちらをお受け取りください。";
		next;
		cutin "ep162_est01.bmp", 255;
		mes "^0000FF‐スマートエリーから";
		mes "　彼女によく似た人形を手渡された。";
		mes "　その人形はどことなく";
		mes "　「たれている」ように見える‐^000000";
		next;
		cutin "16loo_03.bmp", 0;
		mes "[ルッキー]";
		mes "これは……";
		mes "「たれスマートエリー」？";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "グッドです。";
		mes "その名前を採用いたしましょう。";
		mes "これは私のリソースを利用した";
		mes "分身体のようなものです。";
		mes "視覚、聴覚などを私と共有しており";
		mes "通信も可能です。";
		next;
		cutin "ep162_est02.bmp", 1;
		mes "[エスト]";
		mes "くっくっく……頼もしい相棒じゃないか。";
		mes "こいつを頭に乗せていれば";
		mes "イルシオンの奴らも油断するぞ？";
		next;
		cutin "16loo_01.bmp", 0;
		mes "[ルッキー]";
		mes "ええっと……";
		mes "人員を送ることはできませんが";
		mes "何かあれば連絡ください。";
		mes "こちらもできることがあれば";
		mes "協力いたしますから。";
		next;
		set EP18_1QUE,1;
		setquest 8681;
		getitem 400127,1;
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "では、「ラヘル」に向かいましょう。";
		mes "到着しましたら、「印」を出します。";
		mes "何があるかわかりませんので";
		mes "準備を怠らないでください。";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	} else if(EP18_1QUE == 1) {
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "では、「ラヘル」に向かいましょう。";
		mes "到着しましたら、「印」を出します。";
		mes "何があるかわかりませんので";
		mes "準備を怠らないでください。";
		next;
		cutin "ep172_beta.bmp", 255;
		mes "‐「ラヘル」へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		warp "rachel.gat", 182, 168;
		close;
	} else {
		cutin "ep172_beta.bmp", 2;
		mes "[スマートエリー]";
		mes "分析はスマートエリーと";
		mes "アルファにお任せください。";
		mes "お客様は、自身の役目を果たしてください。";
		mes "お客様を待っている方が";
		mes "世界中にいるみたいですから。";
		next;
		mes "[スマートエリー]";
		mes "再び、相手の信号を待ち続ける状況に";
		mes "なってしまいましたが";
		mes "ご心配には及びません。";
		mes "時間は、私たちの味方です。";
		next;
		mes "[スマートエリー]";
		mes "例え、五兆五億年ぐらい";
		mes "ずーっとやっても飽きることが無いのが";
		mes "私たちの利点です。";
		mes "あ、ここは笑うところですよ？";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP172_1QUE == 100 && EP18_1QUE == 0 && checkquest(202235))
		showevent 1,1,"スマートエリー#ep18ely0_001";
	else
		showevent 9999,0,"スマートエリー#ep18ely0_001";
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_in01.gat,22,262,6	script	エスト・ラブロイ#ep181_002	10183,{/* 10653 (cloaking)*/
	cutin "ep162_est01.bmp", 1;
	mes "[エスト]";
	mes "解析が終わったらしいな？";
	close2;
	cutin "ep162_est01.bmp", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_in01.gat,24,262,7	script	ルッキー#ep181_rk01_003	10181,{/* 10654 (cloaking)*/
	cutin "16loo_01.bmp", 0;
	mes "[ルッキー]";
	mes "解析が完了したと聞きました。";
	mes "結果を聞きましょう。";
	close2;
	cutin "16loo_01.bmp", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

rachel.gat,182,176,0	script	#ep18w02_138	139,19,19,{/* 15824 */
OnTouch:
	if(EP18_1QUE >= 1 && EP18_1QUE <= 3) {
		cloakoffnpc "観衆#ep18c01_005";
		cloakoffnpc "観衆#ep18c02_006";
		cloakoffnpc "観衆#ep18c03_007";
		cloakoffnpc "観衆#ep18c04_008";
		cloakoffnpc "観衆#ep18c05_009";
		cloakoffnpc "観衆#ep18c06_010";
	}
	if(EP18_1QUE >= 1 && EP18_1QUE <= 4)
		cloakoffnpc "焦る神官#e18a_011";
	end;
}
rachel.gat,182,176,3	script	マスクをした人#004	917,{/* 15825 */
	if(EP18_1QUE == 1) {
		mes "[演説家]";
		mes "……フレイヤは愛なのです！";
		mes "　";
		mes "‐広場に集まっている人々に向かって";
		mes "　演説をしている人がいる‐";
		next;
		mes "[たれスマートエリー]";
		mes "……ピピ!!";
		mes "『この辺りが信号の発信源です。";
		mes "　周辺の様子を確認してください』";
		unittalk getcharid(3),strcharinfo(0)+" : 頭の中から声がする!?",1;
		next;
		mes "[たれスマートエリー]";
		mes "『他の人には聞こえない";
		mes "　特殊な音波を使って";
		mes "　お客様に直接語り掛けています。";
		mes "　このような形でサポートしますので";
		mes "　慣れてください』";
		next;
		mes "[たれスマートエリー]";
		mes "『では、改めて";
		mes "　周辺の様子を確認してください』";
		next;
		mes "^0000FF‐周囲の状況を伺う中、";
		mes "　演説者の声が次第に熱を帯びていく‐^000000";
		next;
		mes "[演説家]";
		mes "私たちに必要なのは、より良い未来です。";
		mes "……今すぐ解決しなければ";
		mes "我がアルナベルツの輝ける未来は";
		mes "崩れ去ってしまうのです！";
		cloakoffnpc "観衆#ep18c01_005";
		cloakoffnpc "観衆#ep18c04_008";
		unittalk getnpcid(0,"観衆#ep18c01_005"),"観衆 : なにを言ってるんだ？",1;
		next;
		mes "[演説家]";
		mes "これを悲劇と言えないなら";
		mes "何を悲劇と言えるのでしょうか？";
		mes "誰の目にも国が分裂する兆しが";
		mes "映っているのに";
		mes "このまま無視するおつもりですか？";
		cloakoffnpc "観衆#ep18c05_009";
		next;
		mes "[演説家]";
		mes "どうしてこんな事になったのでしょうか？";
		mes "どうして相手を尊重しないのですか？";
		mes "各々考えが異なると言うかもしれませんが";
		mes "私はこう言います。";
		cloakoffnpc "観衆#ep18c02_006";
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : あいつは一体誰だ？",1;
		next;
		mes "[演説家]";
		mes "出生、血統に己の価値を委託し、";
		mes "暴力を行使することが";
		mes "国の一員として、どんな意味があるのか？";
		mes "自身にとって、どんな意味があるのか？";
		cloakoffnpc "焦る神官#e18a_011";
		cloakoffnpc "観衆#ep18c03_007";
		unittalk getnpcid(0,"観衆#ep18c01_005"),"観衆 : いったい誰なんだ？",1;
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : そいつを黙らせろ！",1;
		unittalk getnpcid(0,"観衆#ep18c03_007"),"観衆 : いったい何様のつもりだ？",1;
		next;
		mes "[演説家]";
		mes "私の話を聞いて怒り出すこと自体が";
		mes "おかしいとは思いませんか？";
		unittalk getnpcid(0,"観衆#ep18c04_008"),"観衆 : そうだそうだ！",1;
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : こいつ、原住民だろ？",1;
		unittalk getnpcid(0,"観衆#ep18c03_007"),"観衆 : お前の方こそ区別してるだろ！",1;
		next;
		mes "[演説家]";
		mes "私は皆さんがお互いに";
		mes "争うことを望んでおりません。";
		mes "皆さんが共に手を携えない限り";
		mes "私たちに未来はないのですから。";
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : あんた、何者だ？",1;
		unittalk getnpcid(0,"観衆#ep18c04_008"),"観衆 : はぁ……話にならんな",1;
		next;
		mes "^0000FF‐演説を聞いていた人々の声も";
		mes "　次第に大きくなっていく‐^000000";
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : ケガ人が絶えず病院に運ばれてるのに、言葉だけでどうにかなるか？",1;
		unittalk getnpcid(0,"観衆#ep18c05_009"),"観衆 : で、結局誰のせいなんだよ？",1;
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : 移住の民だけ狙った暴行事件もあったじゃん？",1;
		next;
		mes "[焦る神官]";
		mes "あわわわ……ど、どうしよう……";
		mes "止めなきゃ……。";
		unittalk getnpcid(0,"観衆#ep18c05_009"),"観衆 : 他人に暴力を振るうのが原因じゃないか！",1;
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : 殴られた側にも原因があったんだろう？",1;
		unittalk getnpcid(0,"観衆#ep18c04_008"),"観衆 : 被害者側に原因があるって？　そんな話は聴きたくもない！",1;
		next;
		unittalk getnpcid(0,"焦る神官#e18a_011"),"焦る神官 : どうにかしないと……",1;
		mes "^0000FF‐騒ぎ出す人々の後方から";
		mes "　様子を見ていた神官に気付く。";
		mes "　神官は、騒ぎを止めようとしているようだ。";
		mes "　彼女に話しかけてみよう‐^000000";
		set EP18_1QUE,2;
		delquest 8681;
		setquest 8682;
		close;
	} else if(EP18_1QUE == 2 || EP18_1QUE == 3) {
		mes "^0000FF‐もはや演説家の演説とは関係なしに";
		mes "　人々はののしり合いを始めている‐^000000";
		close;
	} else if(EP18_1QUE >= 4) {
		mes "[マスクをした人]";
		mes "どうかしましたか？";
		mes "え？　私は演説なんてしていませんよ。";
		mes "ああ、貴方は外国の人ですね？";
		mes "それじゃあ、見分けがつかないのも";
		mes "無理はない。";
		next;
		mes "[マスクをした人]";
		mes "私たちは、マスクをしていても";
		mes "移住の民なのか原住民なのか";
		mes "区別ができますからね。";
		close;
	}
	mes "[演説家]";
	mes "……フレイヤは愛なのです！";
	close;
OnQuestInfo:
	if(EP18_1QUE == 1)
		showevent 1,1,"マスクをした人#004";
	else
		showevent 9999,0,"マスクをした人#004";
	end;
}
rachel.gat,179,175,7	script	観衆#ep18c01_005	917,{/* 15826 (cloaking)*/
	mes "^0000FF‐何やら騒いでいるようだ‐^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,177,178,5	script	観衆#ep18c02_006	931,{/* 15827 (cloaking)*/
	mes "^0000FF‐何やら騒いでいるようだ‐^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,179,171,7	script	観衆#ep18c03_007	930,{/* 15828 (cloaking)*/
	mes "^0000FF‐何やら騒いでいるようだ‐^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,181,170,0	script	観衆#ep18c04_008	929,{/* 15829 (cloaking)*/
	mes "^0000FF‐何やら騒いでいるようだ‐^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,186,173,1	script	観衆#ep18c05_009	917,{/* 15830 (cloaking)*/
	mes "^0000FF‐何やら騒いでいるようだ‐^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,184,171,1	script	観衆#ep18c06_010	917,{/* 15831 (cloaking)*/
	mes "^0000FF‐何やら騒いでいるようだ‐^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,183,170,3	script	焦る神官#e18a_011	935,{/* 15832 (cloaking)*/
	if(EP18_1QUE == 1) {
		mes "^0000FF‐神官は演説家の話と";
		mes "　周囲の人々の話を";
		mes "　注意深く聞いているようだ‐^000000";
		close;
	} else if(EP18_1QUE == 2) {
		mes "[焦る神官]";
		mes "……外国の方……？";
		mes "ああ、冒険者の方ですね。";
		mes "ど、どうにも最近、街中で";
		mes "こんな騒ぎがたびたび起きているんです。";
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : どうやって判断するって？　とんだバカがいるな！",1;
		unittalk getnpcid(0,"観衆#ep18c04_008"),"観衆 : この野郎、誰がバカだって!?",1;
		next;
		mes "[焦る神官]";
		mes "お恥ずかしい話なのですが";
		mes "アルナベルツでは住民の出身による";
		mes "争いが昔からあるのです。";
		next;
		mes "[焦る神官]";
		mes "この地に移住してきた人たちは";
		mes "原住民を追い出し";
		mes "アルナベルツ教国を作りましたが";
		mes "それ以来、移住の民と原住民の間で";
		mes "隔たりが……。";
		unittalk getnpcid(0,"観衆#ep18c01_005"),"観衆 : なんで、あそこまで争ってるんだ？",1;
		unittalk getnpcid(0,"観衆#ep18c03_007"),"観衆 : バカだからやってるんだろう",1;
		next;
		mes "[焦る神官]";
		mes "その現状を変えたいと";
		mes "街頭で演説する人もいるのですが";
		mes "元々隔たりがあるため";
		mes "当然妨害する人も現れて……。";
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : 聞こえたぞ！　この野郎がぁ！",1;
		unittalk getnpcid(0,"観衆#ep18c03_007"),"観衆 : なんだ、こらぁ！　殴れるもんなら殴ってみろや！",1;
		next;
		mes "[焦る神官]";
		mes "今までと違う人が演説していると気づいて";
		mes "様子を見ていたのですが……";
		mes "あわわわ……";
		mes "と、止めないと……でもどうしたら!?";
		next;
		mes "^0000FF‐今にも取っ組み合いの喧嘩が";
		mes "　始まりそうな雰囲気だ。";
		mes "　この神官と共に";
		mes "　声を荒げている人に声を掛けてみよう‐^000000";
		set EP18_1QUE,3;
		delquest 8682;
		setquest 8683;
		close;
	} else if(EP18_1QUE == 3) {
		mes "^0000FF‐神官と一緒に声を掛けることにする‐^000000";
		next;
		menu "そこのお腹が出た人！",-;
		mes "[お腹が出た観衆]";
		mes "失礼な！";
		mes "誰だっ!!　お前は！";
		unittalk getnpcid(0,"観衆#ep18c02_006"),"観衆 : お！　また新しいのが出てきたぞ！",1;
		unittalk getnpcid(0,"焦る神官#e18a_011"),"焦る神官 : えぇ……火に油を注がないでぇ!!",1;
		next;
		menu "聞いて驚け、冒険者だ！",-;
		mes "[お腹が出た観衆]";
		mes "冒険者だぁ？";
		mes "俺も若い頃は、さんざん冒険したぜ！";
		mes "言っておくが俺はあのトール火山の";
		mes "頂上まで行ったことのあるんだぞ？";
		mes "軟弱な原住民と違ってなぁ！";
		unittalk getnpcid(0,"観衆#ep18c03_007"),"観衆 : それ観光ツアーでしょ？",1;
		unittalk getnpcid(0,"観衆#ep18c05_009"),"観衆 : 自慢話にもなってないじゃん……",1;
		next;
		menu "私はフレイヤ大神殿で……",-;
		mes "["+strcharinfo(0)+"]";
		mes "私はフレイヤ大神殿で……";
		next;
		cloakoffnpc "少女#ep18c07_012";
		cloakoffnpc "治安隊員ガーラ#ep18c08_013";
		cloakoffnpc "治安隊員イズ#ep18c09_014";
		mes "[少女]";
		mes "治安隊のみなさん！";
		mes "あそこです!!";
		next;
		mes "[お腹が出た観衆]";
		mes "あっちゃー、誰が呼んだんだ？";
		unittalk getnpcid(0,"観衆#ep18c04_008"),"観衆 : 面倒事になる前に退散！",1;
		unittalk getnpcid(0,"観衆#ep18c05_009"),"観衆 : ちぇっ！　面白くなるところだったのに！",1;
		unittalk getnpcid(0,"観衆#ep18c06_010"),"観衆 : 家に帰ろう……",1;
		cloakonnpc "観衆#ep18c01_005";
		cloakonnpc "観衆#ep18c02_006";
		cloakonnpc "観衆#ep18c03_007";
		cloakonnpc "観衆#ep18c04_008";
		cloakonnpc "観衆#ep18c05_009";
		cloakonnpc "観衆#ep18c06_010";
		next;
		mes "[治安隊員ガーラ]";
		mes "不審者が騒動を起こしていると聞いて";
		mes "来てみたが……お前か？";
		mes "その身なりは冒険者だな？";
		next;
		mes "[焦る神官]";
		mes "この方は、不審者ではありません！";
		mes "騒動を収めようとする私を";
		mes "手伝ってくださったのです！";
		next;
		mes "[ジュノーク]";
		mes "私は神官「^0000FFジュノーク^000000」と申します。";
		mes "しばらく外遊しておりましたが";
		mes "先日、セスルムニルに帰還いたしました。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes ""+strcharinfo(0)+"……";
		mes "冒険者です。";
		next;
		mes "[治安隊員ガーラ]";
		mes "そうでしたか。";
		mes "どうにも最近、街中で諍いが絶えず……";
		mes "さぞ驚かれたことでしょう。";
		next;
		menu "いったい何が起きているのですか？",-;
		mes "^0000FF‐治安隊員とジュノークは";
		mes "　しばらく周辺を見回した後、";
		mes "　視線を交わして頷いた‐^000000";
		next;
		mes "[ジュノーク]";
		mes "街中では説明しづらいので";
		mes "「フレイヤ大神殿」の方に";
		mes "来ていただけませんか？";
		mes "そこで説明させていただきます。";
		set EP18_1QUE,4;
		delquest 8683;
		setquest 8684;
		close;
	} else if(EP18_1QUE == 4) {
		mes "[ジュノーク]";
		mes "私もすぐに行きますので";
		mes "「フレイヤ大神殿」の方で";
		mes "お会いしましょう。";
		next;
		mes "‐「フレイヤ大神殿」へ";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは「フレイヤ大神殿」へ";
		mes "　向かった‐";
		close2;
		warp "ra_temple.gat", 72, 49;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 2 && EP18_1QUE <= 4)
		showevent 1,1,"焦る神官#e18a_011";
	else
		showevent 9999,0,"焦る神官#e18a_011";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,187,170,3	script	少女#ep18c07_012	941,{/* 15833 (cloaking)*/
	mes "[少女]";
	mes "みんな逃げ出しちゃった！";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,187,173,3	script	治安隊員ガーラ#ep18c08_013	934,{/* 15834 (cloaking)*/
	mes "[治安隊員ガーラ]";
	mes "ここで説明するのもなんですので";
	mes "大神殿の方に来ていただけますか？";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,187,174,3	script	治安隊員イズ#ep18c09_014	934,{/* 15835 (cloaking)*/
	mes "[治安隊員イズ]";
	mes "ハァ……";
	mes "最近、こんな騒動ばっかりです。";
	close;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,75,54,0	script	#ep18w01_015	139,14,14,{/* 15836 */
OnTouch:
	if(EP18_1QUE == 4) {
		cloakoffnpc "焦る神官ジュノーク#e18b_016";
		cloakoffnpc "治安隊員ガーラ#ep18c10_017";
		unittalk getnpcid(0,"焦る神官ジュノーク#e18b_016"),"焦る神官ジュノーク : 冒険者殿！",1;
	} else if(EP18_1QUE == 5) {
		cloakoffnpc "焦る神官ジュノーク#e18b_016";
	}
	end;
}
ra_temple.gat,72,54,5	script	焦る神官ジュノーク#e18b_016	935,{/* 15837 (cloaking)*/
	if(EP18_1QUE == 4) {
		mes "[たれスマートエリー]";
		mes "……ピピ!!";
		mes "『お客様。少しよろしいですか？";
		mes "　ここに来るまでの間に";
		mes "　怪しい視線を感知しました』";
		next;
		switch(select("私が外国人だからかも？","イルシオンの奴らかも？")) {
		case 1:
			mes "[たれスマートエリー]";
			mes "『この街の人たちは";
			mes "　外国から来た人に対して";
			mes "　閉鎖的というわけですか？』";
			break;
		case 2:
			mes "[たれスマートエリー]";
			mes "『先ほどの騒ぎで少しばかり";
			mes "　目立ってしまったのかもしれません』";
			break;
		}
		next;
		mes "[たれスマートエリー]";
		mes "『現時点では情報が少ないので";
		mes "　判断はできませんが";
		mes "　今後は注意して";
		mes "　行動するようにしましょう』";
		next;
		mes "[ジュノーク]";
		mes "冒険者殿。";
		mes "わざわざ神殿まで来ていただき";
		mes "ありがとうございます。";
		next;
		mes "[ジュノーク]";
		mes "私も、しばらく外に出ていたので";
		mes "ラヘルは久しぶりなのですが";
		mes "以前に比べて、緊張感というか";
		mes "そういう空気を感じています。";
		next;
		mes "[ジュノーク]";
		mes "特に移住の民と原住民の間の諍いを";
		mes "助長する過激な発言をする人が";
		mes "増えたように思います。";
		mes "私は、移住の民と原住民の間の溝を";
		mes "埋めたいと思っているのですが……。";
		next;
		mes "[治安隊員ガーラ]";
		mes "それに加えて何者かが";
		mes "大神殿に何度も侵入を試みています。";
		mes "いまのところ、侵入行為は";
		mes "上手くいっていませんが";
		mes "無視することができない状況です。";
		next;
		mes "[治安隊員ガーラ]";
		mes "現在、大神殿の警備を強化しています。";
		mes "ただその分、街の方の見回りが";
		mes "十分できているとは言えません。";
		mes "どこも人手不足で、人員を増やすことも";
		mes "すぐにはできない状況で……";
		mes "うん？";
		cloakoffnpc "新入りの治安隊員#ep18c11_018";
		unittalk getnpcid(0,"新入りの治安隊員#ep18c11_018"),"新入りの治安隊員 : 神殿の西側に侵入者あり！",1;
		next;
		mes "[治安隊員ガーラ]";
		mes "言ってるそばから……！";
		next;
		mes "[たれスマートエリー]";
		mes "『神殿への侵入者……気になる情報です。";
		mes "　確認しに行きましょう。";
		mes "　神殿の西側だそうです』";
		set EP18_1QUE,5;
		delquest 8684;
		setquest 8685;
		cloakonnpc "治安隊員ガーラ#ep18c10_017";
		cloakonnpc "新入りの治安隊員#ep18c11_018";
		close;
	} else if(EP18_1QUE == 5) {
		mes "[ジュノーク]";
		mes "侵入した者たちは";
		mes "神殿の西側だそうです。";
		next;
		mes "‐神殿の西側へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは神殿の西側へ向かった‐";
		close2;
		warp "ra_temple.gat", 35, 145;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 4 || EP18_1QUE == 5)
		showevent 1,1,"焦る神官ジュノーク#e18b_016";
	else
		showevent 9999,0,"焦る神官ジュノーク#e18b_016";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,75,54,3	script	治安隊員ガーラ#ep18c10_017	934,{/* 15838 (cloaking)*/
	unittalk getnpcid(0,"治安隊員ガーラ#ep18c10_017"),"治安隊員ガーラ : ……",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,78,56,3	script	新入りの治安隊員#ep18c11_018	934,{/* 15839 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,25,147,0	script	#ep18w02_020	139,10,10,{/* 15840 */
OnTouch:
	if(EP18_1QUE == 5) {
		unittalk getnpcid(0,"治安隊員ガーラ#ep18c12_023"),"治安隊員ガーラ : 容疑者を刺激しないでください！",1;
	}
	end;
}
ra_temple.gat,31,142,0	script	#ep18w02_021	139,14,14,{/* 15841 */
OnTouch:
	if(EP18_1QUE == 5 || EP18_1QUE == 6) {
		cloakoffnpc "焦る神官ジュノーク#e18c_022";
		cloakoffnpc "治安隊員ガーラ#ep18c12_023";
		cloakoffnpc "治安隊員イズ#ep18c13_024";
		cloakoffnpc "治安隊員カルソッツ#c14_025";
		cloakoffnpc "ハートハンター#ep18c15_026";
		cloakoffnpc "ハートハンター#ep18c16_027";
	} else if(EP18_1QUE == 7) {
		cloakoffnpc "焦る神官ジュノーク#e18c_022";
		cloakonnpc "治安隊員ガーラ#ep18c12_023";
		cloakonnpc "治安隊員イズ#ep18c13_024";
		cloakonnpc "治安隊員カルソッツ#c14_025";
		cloakonnpc "ハートハンター#ep18c15_026";
		cloakonnpc "ハートハンター#ep18c16_027";
		cloakonnpc "治安隊員チャイブ#c17_028";
		cloakonnpc "ハートハンター#ep18c18_029";
		cloakonnpc "ハートハンター#ep18c19_030";
	}
	end;
}
ra_temple.gat,30,142,1	script	焦る神官ジュノーク#e18c_022	935,{/* 15842 */
	if(EP18_1QUE == 5) {
		mes "[たれスマートエリー]";
		mes "……ピピ！";
		mes "『思ったより早く見つかりました。";
		mes "　あの服装は、バルムント様の邸宅に";
		mes "　侵入した者たちと同じです』";
		next;
		mes "[治安隊員イズ]";
		mes "お前らは包囲されてる！　投降しろ！";
		next;
		mes "[ハートハンター]";
		mes "はっ、包囲しただって？";
		mes "おめでたい奴らだぜ。";
		mes "今頃は別働隊が神殿内に……。";
		next;
		mes "[治安隊員チャイブ]";
		mes "別働隊とは、こいつらのことか？";
		cloakoffnpc "治安隊員チャイブ#c17_028";
		cloakoffnpc "ハートハンター#ep18c18_029";
		cloakoffnpc "ハートハンター#ep18c19_030";
		unittalk getnpcid(0,"ハートハンター#ep18c19_030"),"ハートハンター : うう……",1;	// 15850
		unittalk getnpcid(0,"ハートハンター#ep18c18_029"),"ハートハンター : ちくしょう……",1;	// 15849
		next;
		mes "[ハートハンター]";
		mes "……つ、次は必ず成功させてみせる！";
		next;
		mes "^0000FF‐侵入者について心当たりがあることを";
		mes "　治安隊員に伝えよう‐^000000";
		close2;
		set EP18_1QUE,6;
		delquest 8685;
		setquest 8686;
		cloakonnpc "ハートハンター#ep18c15_026";
		cloakonnpc "ハートハンター#ep18c16_027";
		cloakonnpc "焦る神官ジュノーク#e18b_016";
		end;
	} else if(EP18_1QUE == 6) {
		cloakoffnpc "治安隊員チャイブ#c17_028";
		cloakoffnpc "ハートハンター#ep18c18_029";
		cloakoffnpc "ハートハンター#ep18c19_030";
		mes "[治安隊員ガーラ]";
		mes "……";
		mes "理解に苦しみます。";
		mes "手口が雑だし、明らかに目立っている。";
		mes "陽動というのとも違う気がするし……";
		mes "何が目的で、どこから来たのか……。";
		next;
		menu "心当たりがあることを伝える",-;
		mes "^0000FF‐事情をすべて説明する訳にはいかないが";
		mes "　彼らを追って来たことを伝えた‐^000000";
		next;
		mes "[治安隊員ガーラ]";
		mes "ふむ……";
		mes "大神官の「ニルエン」様に";
		mes "お伝えした方が良さそうですね。";
		next;
		mes "[ジュノーク]";
		mes "私もそれが良いと思います。";
		mes "ニルエン大神官様なら";
		mes "きっと手を貸してくださるでしょう。";
		unittalk getnpcid(0,"治安隊員ガーラ#ep18c12_023"),"治安隊員ガーラ : まず、あいつらを拘禁しろ。新入りのようだがな。",1;
		unittalk getnpcid(0,"治安隊員チャイブ#c17_028"),"治安隊員チャイブ : 了解しました。",1;
		next;
		mes "[治安隊員ガーラ]";
		mes "神殿内に入ったら";
		mes "「^0000FF治安隊員のデント^000000」に聞いてください。";
		mes "神殿内を案内してくれるはずです。";
		set EP18_1QUE,7;
		delquest 8686;
		setquest 8687;
		close;
	} else if(EP18_1QUE == 7) {
		mes "[ジュノーク]";
		mes "「ニルエン大神官」様に";
		mes "事情をお伝えください。";
		mes "きっと手を貸してくださるでしょう。";
		mes "神殿内の「^0000FF治安隊員のデント^000000」に";
		mes "取り次いでもらってください。";
		next;
		mes "‐神殿の入口へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは神殿の入口へ向かった‐";
		close2;
		warp "ra_temple.gat", 119, 173;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 5 && EP18_1QUE <= 7)
		showevent 1,1,"焦る神官ジュノーク#e18c_022";
	else
		showevent 9999,0,"焦る神官ジュノーク#e18c_022";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,25,147,5	script	治安隊員ガーラ#ep18c12_023	934,{/* 15843 */
	unittalk getnpcid(0,"治安隊員ガーラ#ep18c12_023"),"治安隊員ガーラ : 素直に投降せよ！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,29,143,1	script	治安隊員イズ#ep18c13_024	934,{/* 15844 */
	unittalk getnpcid(0,"治安隊員イズ#ep18c13_024"),"治安隊員イズ : 神官殿、前に出ないでください！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,26,145,7	script	治安隊員カルソッツ#c14_025	934,{/* 15845 */
	unittalk getnpcid(0,"治安隊員カルソッツ#c14_025"),"治安隊員カルソッツ : 武器を下ろせ！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,31,147,4	script	ハートハンター#ep18c15_026	20681,{/* 15846 */
	unittalk getnpcid(0,"ハートハンター#ep18c15_026"),"ハートハンター : しくじった～！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,29,146,4	script	ハートハンター#ep18c16_027	20681,{/* 15847 */
	unittalk getnpcid(0,"ハートハンター#ep18c16_027"),"ハートハンター : なんてこった～！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,35,141,1	script	治安隊員チャイブ#c17_028	934,{/* 15848 (cloaking)*/
	unittalk getnpcid(0,"治安隊員チャイブ#c17_028"),"治安隊員チャイブ : 近づかないでください、危険です！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,36,140,4	script	ハートハンター#ep18c18_029	20681,{/* 15849 (cloaking)*/
	unittalk getnpcid(0,"ハートハンター#ep18c18_029"),"ハートハンター : つかまっちまった～！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,37,140,4	script	ハートハンター#ep18c19_030	20681,{/* 15850 (cloaking)*/
	unittalk getnpcid(0,"ハートハンター#ep18c19_030"),"ハートハンター : おぼえとけよ～！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,173,38,0	script	#ep18w03_139	139,15,15,{/* 15851 */
OnTouch:
	if(EP18_1QUE >= 7) {
		cloakoffnpc "治安隊員デント#ep18_032";
		cloakoffnpc "治安隊員ニール#ep18_033";
		cloakoffnpc "フレイヤの司祭#ep18_034";
		cloakoffnpc "ラヘルの住民#ep18_in1_036";
		cloakoffnpc "ラヘルの住民#ep18_in2_037";
		cloakoffnpc "ラヘルの住民#ep18_in3_038";
		cloakoffnpc "ラヘルの住民#ep18_in4_039";
		cloakoffnpc "ラヘルの住民#ep18_in5_040";
		cloakoffnpc "ラヘルの住民#ep18_in6_041";
		cloakoffnpc "ラヘルの住民#ep18_in7_042";
	}
	else {
		cloakonnpc "治安隊員デント#ep18_032";
		cloakonnpc "治安隊員ニール#ep18_033";
		cloakonnpc "フレイヤの司祭#ep18_034";
		cloakonnpc "ラヘルの住民#ep18_in1_036";
		cloakonnpc "ラヘルの住民#ep18_in2_037";
		cloakonnpc "ラヘルの住民#ep18_in3_038";
		cloakonnpc "ラヘルの住民#ep18_in4_039";
		cloakonnpc "ラヘルの住民#ep18_in5_040";
		cloakonnpc "ラヘルの住民#ep18_in6_041";
		cloakonnpc "ラヘルの住民#ep18_in7_042";
	}
	end;
}
ra_temin.gat,173,40,3	script	治安隊員デント#ep18_032	934,{/* 15852 */
	if(EP18_1QUE == 7) {
		mes "[治安隊員デント]";
		mes "おい！";
		mes "みんな並んでるのが見えないのか？";
		mes "ニルエン様に用事があるのなら";
		mes "順番を守ってくれよ！";
		next;
		mes "[治安隊員デント]";
		mes "はぁ……なんでこんなに忙しいんだ？";
		mes "街の騒動を止める為に出動したのが";
		mes "今日だけでも何回か知ってるか!?";
		next;
		mes "[治安隊員デント]";
		mes "前から移住の民と原住民の";
		mes "小さなもめごとはあったが";
		mes "最近は度が過ぎる！";
		mes "あ～思い出すだけで頭が痛くなってきた。";
		next;
		mes "[治安隊員デント]";
		mes "二ール！";
		mes "お前は最近どうだ？";
		set EP18_1QUE,8;
		delquest 8687;
		setquest 11696;
		close;
	} else if(EP18_1QUE == 8) {
		mes "[治安隊員デント]";
		mes "二ール！";
		mes "お前は最近どうだ？";
		close;
	}
	mes "[治安隊員デント]";
	mes "はぁ……";
	mes "早く街が落ち着いて欲しいぜ。";
	close;
OnQuestInfo:
	if(EP18_1QUE == 7)
		showevent 1,0,"治安隊員デント#ep18_032";
	else
		showevent 9999,0,"治安隊員デント#ep18_032";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,174,38,3	script	治安隊員ニール#ep18_033	939,{/* 15853 */
	if(EP18_1QUE == 8) {
		mes "[治安隊員ニール]";
		mes "キミはまだマシな方だよ！";
		mes "見ての通り、ボクって原住民出身だろ？";
		mes "ボクを見た瞬間、お前じゃなくて";
		mes "移住の民の治安隊員を呼んで来いって";
		mes "言われる始末なんだから！";
		next;
		mes "[治安隊員ニール]";
		mes "どいつもこいつも";
		mes "原住民のくせに～原住民のくせに～って";
		mes "耳にタコができたよ！";
		next;
		mes "[治安隊員ニール]";
		mes "……正直に言えば";
		mes "本当におかしい気がする。";
		mes "最近は些細な口喧嘩でも";
		mes "大きな喧嘩になっちゃうんだから。";
		next;
		mes "[治安隊員ニール]";
		mes "ボクの話が気になるのかい？";
		mes "それなら、そこの神官様にも";
		mes "聞いてみたら？";
		mes "そこの神官様ももめ事に";
		mes "巻き込まれてたみたいだからさ。";
		set EP18_1QUE,9;
		delquest 11696;
		setquest 11697;
		close;
	} else if(EP18_1QUE == 11) {
		cloakoffnpc "ニルエン#ep18_in1_035";
		cutin "ra_gwoman.bmp", 0;
		mes "[ニルエン大神官]";
		mes "ニール。";
		mes "「マラム」がどこにいるか知りませんか？";
		mes "街に出ていると思うのですが。";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "[治安隊員ニール]";
		mes "マラム様ですか？";
		mes "神殿を出た先の広場でお会いしましたよ！";
		next;
		mes "[治安隊員ニール]";
		mes "まだ広場におられるかはわかりませんが";
		mes "「広場にいる人たち」に聞いて回れば";
		mes "見つかるんじゃないですかね。";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[ニルエン大神官]";
		mes "ありがとう。";
		mes "……"+strcharinfo(0)+"様。";
		mes "会っていただきたい人物というのは";
		mes "私の息子の「マラム」です。";
		next;
		menu "息子……!?",-;
		cutin "ra_gwoman2.bmp", 0;
		mes "[ニルエン大神官]";
		mes "あら？　そんなに驚かれるとは";
		mes "少し心外ですね。";
		mes "本当の子ではありません。";
		mes "マラムは「養子」なのです。";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[ニルエン大神官]";
		mes "直接、紹介したいところですが";
		mes "私は神殿から離れられません。";
		mes "街の広場でマラムを探してください。";
		mes "私からの紹介だと言えば";
		mes "話を聞いてくれるでしょう。";
		set EP18_1QUE,12;
		delquest 11699;
		setquest 11700;
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	} else if(EP18_1QUE == 12) {
		mes "[治安隊員ニール]";
		mes "マラム様でしたら";
		mes "神殿を出た先の広場でお会いしましたよ。";
		mes "まだ広場におられるかはわかりませんが";
		mes "「広場にいる人たち」に聞いて回れば";
		mes "見つかるんじゃないですかね。";
		next;
		mes "‐ラヘルの広場へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたはラヘルの広場へ向かった‐";
		close2;
		warp "rachel.gat", 142, 140;
		end;
	}
	mes "[治安隊員ニール]";
	mes "ニルエン様もお忙しそうだなぁ～。";
	close;
OnQuestInfo:
	if(EP18_1QUE == 8 || EP18_1QUE == 11 || EP18_1QUE == 12)
		showevent 1,1,"治安隊員ニール#ep18_033";
	else
		showevent 9999,0,"治安隊員ニール#ep18_033";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,172,36,7	script	フレイヤの司祭#ep18_034	916,{/* 15854 (cloaking)*/
	if(EP18_1QUE == 9) {
		mes "[フレイヤの司祭]";
		mes "私たちは信徒たちの";
		mes "真実の信仰と心の平穏のために";
		mes "常に祈りを捧げております。";
		mes "しかし……。";
		next;
		mes "[フレイヤの司祭]";
		mes "近頃、神殿内でも問題を起こす人たちが";
		mes "増えています。";
		mes "入口で騒いだり大声を上げたりする";
		mes "程度なのですが……。";
		next;
		mes "[フレイヤの司祭]";
		mes "以前に比べると";
		mes "喧嘩にまで発展するケースが";
		mes "増えたように思います。";
		next;
		cloakoffnpc "ニルエン#ep18_in1_035";
		cutin "ra_gwoman.bmp", 0;
		mes "[ニルエン大神官]";
		mes "神聖な神殿で喧嘩とは……";
		mes "その人たちの不満を話し合いで";
		mes "解決する方法はありませんか？";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "[フレイヤの司祭]";
		mes "ニルエン様!!";
		mes "喧嘩の仲裁に入っても";
		mes "お互いに異端者だと言い合って";
		mes "話を聞こうともしないのです！";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[ニルエン大神官]";
		mes "はぁ……";
		mes "異端などと軽々しく口にして";
		mes "良い言葉ではないのに……";
		mes "まるで「急進派」のような物言いですね。";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "[フレイヤの司祭]";
		mes "「ビルド大神官」をはじめとする";
		mes "「急進派」の御歴々は失脚しましたが";
		mes "彼らの支持者たちや考え方には";
		mes "未だに影響力があります。";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[ニルエン大神官]";
		mes "これまで私たちは";
		mes "移住の民と原住民との溝を埋めるために";
		mes "心を砕いてきましたが";
		mes "その努力は無駄だったのでしょうか……。";
		next;
		mes "[ニルエン大神官]";
		mes "あら……！";
		mes strcharinfo(0)+"様!?";
		mes "申し訳ありません。";
		mes "まったく気づきませんでした。";
		next;
		mes "[ニルエン大神官]";
		mes "……お恥ずかしい話ですが";
		mes "今のラヘルは穏やかなとは";
		mes "言い難い状況なのです。";
		mes "……ところで、何か理由があって";
		mes "ここに来られたのではないですか？";
		next;
		menu "侵入者についてお話が……",-;
		mes "[ニルエン大神官]";
		mes "……ふむ。";
		mes "場所を移しましょうか。";
		mes "奥の^ff0000階段^000000の所に来てください。";
		mes "話はそこで伺います。";
		viewpoint 1, 217, 83, 18, 0x00FF00;
		set EP18_1QUE,10;
		delquest 11697;
		setquest 11698;
		close2;
		cloakonnpc "ニルエン#ep18_in1_035";
		cutin "ra_gwoman.bmp", 255;
		end;
	} else if(EP18_1QUE == 10) {
		cloakonnpc "ニルエン#ep18_in1_035";
		mes "[フレイヤの司祭]";
		mes "ニルエン様とお話があるのでは？";
		mes "ニルエン様は、奥の階段の所に";
		mes "行かれましたよ？";
		next;
		mes "‐奥の階段の所へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは奥の階段の所へ向かった‐";
		close2;
		warp "ra_temin.gat", 212, 82;
		end;
	}
	mes "[フレイヤの司祭]";
	mes "私たちは信徒たちの";
	mes "真実の信仰と心の平穏のために";
	mes "常に祈りを捧げております。";
	close;
OnQuestInfo:
	if(EP18_1QUE == 9 || EP18_1QUE == 10)
		showevent 1,1,"フレイヤの司祭#ep18_034";
	else
		showevent 9999,0,"フレイヤの司祭#ep18_034";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,170,38,5	script	ニルエン#ep18_in1_035	915,{/* 15855 (cloaking)*/
	mes "[ニルエン大神官]";
	mes "いかがしましたか？";
	close;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,171,42,5	script	ラヘルの住民#ep18_in1_036	919,{/* 15856 */
	unittalk getnpcid(0,"ラヘルの住民#ep18_in1_036"),"ラヘルの住民 : なんとかしてー！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,173,43,3	script	ラヘルの住民#ep18_in2_037	930,{/* 15857 */
	unittalk getnpcid(0,"ラヘルの住民#ep18_in2_037"),"ラヘルの住民 : どーなってるの？",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,175,36,8	script	ラヘルの住民#ep18_in3_038	940,{/* 15858 (cloaking)*/
	unittalk getnpcid(0,"ラヘルの住民#ep18_in3_038"),"ラヘルの住民 : 理不尽だよ！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,170,35,1	script	ラヘルの住民#ep18_in4_039	945,{/* 15859 (cloaking)*/
	unittalk getnpcid(0,"ラヘルの住民#ep18_in4_039"),"ラヘルの住民 : はぁ……。",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,174,34,3	script	ラヘルの住民#ep18_in5_040	929,{/* 15860 (cloaking)*/
	unittalk getnpcid(0,"ラヘルの住民#ep18_in5_040"),"ラヘルの住民 : こんなに祈っているのに！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,177,33,5	script	ラヘルの住民#ep18_in6_041	921,{/* 15861 (cloaking)*/
	unittalk getnpcid(0,"ラヘルの住民#ep18_in6_041"),"ラヘルの住民 : フレイヤ様！　フレイヤ様！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,173,32,8	script	ラヘルの住民#ep18_in7_042	917,{/* 15862 (cloaking)*/
	unittalk getnpcid(0,"ラヘルの住民#ep18_in7_042"),"ラヘルの住民 : どうにかしてよ！",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,213,87,3	script	ニルエン#ep18_in2_043	915,{/* 15863 */
	if(EP18_1QUE == 10) {
		cutin "ra_gwoman.bmp", 1;
		mes "[ニルエン大神官]";
		mes "ここなら盗み聞きする人もいないでしょう。";
		mes "特にデリケートな問題のようですし。";
		next;
		menu "ここに来た理由を説明する",-;
		mes "[ニルエン大神官]";
		mes "……その話は本当ですか？";
		mes "「イルシオン」に「ハートハンター」……";
		mes "彼らが「ユミルの心臓の欠片」や";
		mes "「バルムントの遺産」を狙っていたとは。";
		next;
		mes "[ニルエン大神官]";
		mes "そしていま、神殿への侵入を";
		mes "繰り返しているのが";
		mes "「ハートハンター」たちだというのなら";
		mes "その目的は恐らく神殿内の……。";
		next;
		mes "[ニルエン大神官]";
		mes "情報の共有、ありがとうございます。";
		mes "すぐに神殿内の警護を強化しましょう。";
		next;
		mes "[ニルエン大神官]";
		mes "それにしても……移住の民と";
		mes "原住民との軋轢がこれまでになく";
		mes "大きくなっている最中だというのに";
		mes "人手が足りるかどうか……。";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "^0000FF‐ため息を吐くニルエンだったが";
		mes "　何か思いついたのか";
		mes "　真剣なまなざしでこちらの顔を";
		mes "　じっと見つめてきた‐^000000";
		next;
		cutin "ra_gwoman.bmp", 1;
		mes "[ニルエン大神官]";
		mes strcharinfo(0)+"様に";
		mes "ひとつお願いがあります。";
		mes "この時期にあなたがラヘルに来たのは";
		mes "フレイヤ様の思し召しなのでしょう。";
		next;
		mes "[ニルエン大神官]";
		mes "すでにご存じかと思いますが";
		mes "今のラヘルは、移住の民と原住民との間で";
		mes "頻繁にもめ事が発生しています。";
		next;
		mes "[ニルエン大神官]";
		mes "これまでも、原住民に差別的な";
		mes "「急進派」の影響もあって";
		mes "両者が敵対することはありました。";
		next;
		mes "[ニルエン大神官]";
		mes "しかし「急進派」が失脚したにも関わらず";
		mes "自体は進展するどころか";
		mes "悪化しているように思うのです。";
		next;
		mes "[ニルエン大神官]";
		mes "一朝にして両者が和解することなど";
		mes "ありえないのはわかっていたつもりです。";
		mes "ですが……どうして今";
		mes "このような状況に陥ったのか";
		mes "正直、私には理解できません。";
		next;
		mes "[ニルエン大神官]";
		mes "私は、移住の民と原住民が";
		mes "いつか和解できると信じています。";
		mes "ですから、今の状況になった原因と";
		mes "和解のためのきっかけとなるものを";
		mes "見つけ出したいのです。";
		next;
		menu "私は部外者ですが……",-;
		cutin "ra_gwoman2.bmp", 1;
		mes "[ニルエン大神官]";
		mes "だからこそ、お願いしているのです。";
		mes "移住の民でもなく、原住民でもない";
		mes "あなただからこそ、問題の解決に";
		mes "必要なのではないかと。";
		next;
		cutin "ra_gwoman.bmp", 1;
		mes "[ニルエン大神官]";
		mes "……あなたに紹介したい人物がいます。";
		mes "移住の民と原住民の仲を取り持つ";
		mes "「懸け橋」となる者です。";
		mes "今は、街に出かけていますが。";
		next;
		mes "[ニルエン大神官]";
		mes "いったん神殿の入口に戻りましょう。";
		mes "入口にいる治安隊に聞けば";
		mes "彼の居場所を教えてくれるでしょう。";
		set EP18_1QUE,11;
		delquest 11698;
		setquest 11699;
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	} else if(EP18_1QUE == 11) {
		cutin "ra_gwoman.bmp", 1;
		mes "[ニルエン大神官]";
		mes "いったん神殿の入口に戻りましょう。";
		mes "入口にいる治安隊に聞けば";
		mes "彼の居場所を教えてくれるでしょう。";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "‐入口にいる治安隊のもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは入口にいる治安隊のもとへ";
		mes "　向かった‐";
		close2;
		warp "ra_temin.gat", 170, 39;
		end;
	}
	mes "[ニルエン大神官]";
	mes "今は少し忙しくて";
	mes "手が離せないのです。";
	mes "また後程……。";
	cutin "ra_gwoman.bmp", 1;
	close2;
	cutin "ra_gwoman.bmp", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 10 || EP18_1QUE == 11)
		showevent 1,1,"ニルエン#ep18_in2_043";
	else
		showevent 9999,0,"ニルエン#ep18_in2_043";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,137,135,7	script	村人#ep18_ラヘル1_044	929,{/* 15864 */
	if(EP18_1QUE == 12) {
		mes "^0000FF‐この辺りが、街の広場のようだ。";
		mes "　マラムを見ていないか";
		mes "　人々に声を掛けてみよう‐^000000";
		next;
		menu "マラムを見てないですか？",-;
		mes "[村人]";
		mes "なにぃ～マラムだって？";
		mes "知るか！";
		mes "アイツの居場所なんて";
		mes "知ったこっちゃない！";
		next;
		mes "[村人]";
		mes "そういえば、あんた。";
		mes "ここらじゃ見ない顔だな……";
		mes "外の国の人間か？";
		next;
		mes "[村人]";
		mes "あいつを何で探してる？";
		mes "何か企んでるんじゃねぇよなぁ？";
		next;
		mes "[スマートエリー]";
		mes "……ピピ！";
		mes "『敵対的な感情を確認しました。";
		mes "　建設的な会話は望めないようです。";
		mes "　^ff0000他の人間^000000に聞くことを提案いたします』";
		set EP18_1QUE,13;
		delquest 11700;
		setquest 11701;
		viewpoint 1, 136, 120, 18, 0x00FF00;
		close;
	}
	else if(EP18_1QUE == 13) {
		mes "[村人]";
		mes "あいつを何で探してる？";
		mes "何か企んでるんじゃねぇよなぁ？";
		next;
		mes "[スマートエリー]";
		mes "……ピピ！";
		mes "『敵対的な感情を確認しました。";
		mes "　建設的な会話は望めないようです。";
		mes "　^ff0000他の人間^000000に聞くことを提案いたします』";
		close2;
		viewpoint 1, 136, 120, 18, 0x00FF00;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	mes "[村人]";
	mes "そういえば、あんた。";
	mes "ここらじゃ見ない顔だな……";
	mes "外の国の人間か？";
	close;
OnQuestInfo:
	if(EP18_1QUE == 12)
		showevent 1,1,"村人#ep18_ラヘル1_044";
	else
		showevent 9999,0,"村人#ep18_ラヘル1_044";
	end;
}
rachel.gat,136,120,3	script	村人#ep18_ラヘル2_045	931,{/* 15865 */
	if(EP18_1QUE == 13) {
		mes "^0000FF‐この辺りが、街の広場のようだ。";
		mes "　マラムを見ていないか";
		mes "　人々に声を掛けてみよう‐^000000";
		next;
		menu "マラムを探しているのですが",-;
		mes "[村人]";
		mes "……";
		mes "よく分かりません。";
		mes "ところで、どなたですか？";
		mes "どうしてマラムを探してるんですか？";
		mes "マラムとはどのような仲ですか？";
		next;
		mes "[スマートエリー]";
		mes "……ピピ！";
		mes "『敵対的な感情を確認しました。";
		mes "　建設的な会話は望めないようです。";
		mes "　^ff0000少し広場から外れてみる^000000ことを";
		mes "　提案いたします』";
		viewpoint 1, 69, 117, 18, 0x00FF00;
		set EP18_1QUE,14;
		delquest 11701;
		setquest 11702;
		close;
	}
	else if(EP18_1QUE == 14) {
		mes "[村人]";
		mes "……";
		mes "よく分かりません。";
		mes "ところで、どなたですか？";
		mes "どうしてマラムを探してるんですか？";
		mes "マラムとはどのような仲ですか？";
		next;
		mes "[スマートエリー]";
		mes "……ピピ！";
		mes "『敵対的な感情を確認しました。";
		mes "　建設的な会話は望めないようです。";
		mes "　^ff0000少し広場から外れてみる^000000ことを";
		mes "　提案いたします』";
		viewpoint 1, 69, 117, 18, 0x00FF00;
		close;
	}
	mes "[村人]";
	mes "……";
	close;
OnQuestInfo:
	if(EP18_1QUE == 13)
		showevent 1,1,"村人#ep18_ラヘル2_045";
	else
		showevent 9999,0,"村人#ep18_ラヘル2_045";
	end;
}
rachel.gat,69,117,7	script	村人#ep18_ラヘル3_046	919,{/* 15866 */
	if(EP18_1QUE == 14) {
		mes "^0000FF‐この辺りが、街の広場のようだ。";
		mes "　マラムを見ていないか";
		mes "　人々に声を掛けてみよう‐^000000";
		next;
		menu "マラムを見かけませんでしたか？",-;
		mes "[村人]";
		mes "マラム様を探してるのかい？";
		mes "人に会う約束があると言ってたかな……";
		mes "この前を通り過ぎたので";
		mes "^ff0000北^000000に行けば会えるんじゃない。";
		viewpoint 1, 70, 147, 18, 0x00FF00;
		set EP18_1QUE,15;
		delquest 11702;
		setquest 11703;
		close;
	}
	else if(EP18_1QUE == 15) {
		mes "[村人]";
		mes "マラム様を探してるのかい？";
		mes "人に会う約束があると言ってたかな……";
		mes "この前を通り過ぎたので";
		mes "^ff0000北^000000に行けば会えるんじゃない。";
		viewpoint 1, 70, 147, 18, 0x00FF00;
		close;
	}
	mes "[村人]";
	mes "最近のラヘルは、";
	mes "不穏な空気が漂ってるね。";
	mes "何も起きなければ良いけど。";
	close;
OnQuestInfo:
	if(EP18_1QUE == 14)
		showevent 1,1,"村人#ep18_ラヘル3_046";
	else
		showevent 9999,0,"村人#ep18_ラヘル3_046";
	end;
}
rachel.gat,70,147,3	script	マラム#ep18_ラヘル_047	10376,{/* 15867 */
	switch(EP18_1QUE) {
	case 15:
		viewpoint 2, 70, 147, 18, 0x00FF00;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ミリアムは、いつ来るのかな～。";
		mes "おや？";
		mes "こんにちは、旅のお方。";
		mes "私は「^0000FFマラム^000000」と言います。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ラヘルは暑くないですか？";
		mes "口の中が砂だらけになって";
		mes "苦労していませんか？";
		mes "何かお困りのことがあれば";
		mes "遠慮なく私に相談してくださいね。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[スマートエリー]";
		mes "……ピピ！";
		mes "『この最初から親密度がMAXの";
		mes "　少し変わった人間が";
		mes "　「マラム」さんで間違いないようです』";
		next;
		menu "ニルエンからの頼まれごとを伝える",-;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "母上から移住の民と原住民の仲裁を";
		mes "お願いされたのですか！";
		mes "そんな重要なことをお願いされるなんて";
		mes "母上はよほどあなたのことを";
		mes "信用しているのでしょうね。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "改めて自己紹介させてください。";
		mes "私は「マラム」と申します。";
		mes strcharinfo(0)+"様のような";
		mes "素晴らしい方に協力してもらえるなんて";
		mes "今日は最高の一日になりそうです！";
		next;
		mes "[マラム]";
		mes "さて……まずは何から始めましょうか。";
		mes "やるべきことは多いのですが";
		mes "さしあたり、原住民たちと";
		mes "私たち「灰色の子供達」の現状について";
		mes "説明いたしましょうか。";
		next;
		menu "灰色の子供達？",-;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "アルナベルツ教国の歴史は";
		mes "ご存じですか？";
		mes "この地は元々遊牧民が住む";
		mes "荒れ果てた土地でした。";
		next;
		mes "[マラム]";
		mes "そこに約千年前に人々が移住し";
		mes "荒れ果てた土地を時間をかけて";
		mes "豊かな土地と街を";
		mes "作り上げていったのです。";
		next;
		mes "[マラム]";
		mes "この美しいラヘルの街もそうですが";
		mes "元は原住民の土地です。";
		mes "移住してきた人々は";
		mes "元々住んでいた人々を迫害し";
		mes "彼らの土地を奪いました。";
		next;
		mes "[マラム]";
		mes "原住民の中には移住の民の街に";
		mes "住もうとする人もいましたが";
		mes "全員が移住できたわけではありません。";
		mes "街に住んでも、移住の民にとっては";
		mes "迫害の対象でした。";
		next;
		mes "[マラム]";
		mes "それらが全て過去の出来事であれば";
		mes "良かったのですが……";
		mes "今でもそれが続いているのです。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "その結果として、居場所を失う子供たちも";
		mes "存在しています。";
		mes "……私もそうした子供の一人です。";
		mes "そんな状況を憂いた母上は";
		mes "私を養子にしてくれました。";
		next;
		mes "[マラム]";
		mes "さらに大神官となってからは";
		mes "居場所を失った子たちを";
		mes "裕福な家庭が積極的に";
		mes "迎え入れる政策を";
		mes "進めてくれたのです。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "ですが……それを気に入らない人たちは";
		mes "私たちのことを「灰色の子供達」と呼び";
		mes "差別し始めました。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "母上は、私たちを移住の民と原住民の";
		mes "懸け橋となることを期待していましたが";
		mes "移住の民にも、原住民にもなじめない";
		mes "中途半端な存在にしかなれませんでした。";
		mes "現実は厳しいですね。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[？？？]";
		mes "厳しいとか言ってるけど";
		mes "本当はそんなこと";
		mes "微塵も思っていないだろ？";
		mes "お前はいつも楽観的だからな。";
		next;
		cloakoffnpc "ミリアム#ep18_ラヘル_04";
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "あっ！　ミリアム！";
		mes "いつからそこにいたんだよ？";
		mes "遅刻してくるなんてヒドイよ！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "……";
		mes "いつものことだろ。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes strcharinfo(0)+"様。";
		mes "こちらは、友人の「^0000FFミリアム^000000」です。";
		mes "ちょっと不愛想ですがお気になさらず";
		mes "照れてるだけですから。";
		mes "……いてっ！";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "^0000FF‐ミリアムはマラムを容赦なく";
		mes "　蹴っ飛ばした‐^000000";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "それと、少々お転婆でぇ……";
		mes "イタッ！　痛いって、ミリアム！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "話は聞いてたから。";
		mes "冒険者さんは";
		mes "ニルエン様の依頼で来たんでしょ？";
		mes "だったら、ボクたちのこと";
		mes "手伝ってくれるんだよね。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "それはそうだと思うけど……";
		mes "あれ？";
		mes "ミリアム……頼んでいたものは？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "だから……";
		mes "手伝って欲しいんだ。";
		mes "ボクの話を聞いてくれる？";
		set EP18_1QUE,16;
		delquest 11703;
		setquest 11704;
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	case 16:
		cloakoffnpc "ミリアム#ep18_ラヘル_048";
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes strcharinfo(0)+"様。";
		mes "こちらは、友人の「^0000FFミリアム^000000」です。";
		mes "ちょっと不愛想ですがお気になさらず";
		mes "照れてるだけですから。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 17:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "少々買物をしたいのですが、";
		mes "ここから^ff0000南東^000000にいる商人のところまで";
		mes "一緒に来てもらいたいのです。";
		mes "そうすれば「灰色の子供達」が";
		mes "置かれている状況も";
		mes "理解していただけると思いますし。";
		close2;
		viewpoint 1, 87, 122, 18, 0x00FF00;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "ミリアム#ep18_ラヘル_048";
		end;
	//18-20 未調査
	case 21:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "やれやれ……";
		mes "買物も簡単ではありませんね。";
		mes "以前は、もっとラクだったのですけど。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	//22 未調査
	case 23:
	case 24:
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "こちらの準備は順調ですよ。";
		mes "引き続き、よろしくお願いしますね。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 25:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "お疲れ様です";
		mes strcharinfo(0)+"様。";
		mes "必要な人員は集まりそうですか？";
		mes "あれ？";
		next;
		mes "[タマリン]";
		mes "この前は、どうも。";
		mes "ニルエン大神官のご子息様。";
		cloakoffnpc "タマリン#ep18_マラム_04";
		cutin "ep18_tamarin_02.png", 1;
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "先日、母上を訪ねていらした方々ですね！";
		mes strcharinfo(0)+"様の";
		mes "お知り合いでしたか。";
		next;
		cloakoffnpc "ミリアム#ep18_ラヘル_04";
		cutin "ep18_miriam_02.png", 0;
		mes "[ミリアム]";
		mes "……マラム。";
		mes "言われた通り";
		mes "それっぽい服を見繕って来たよ。";
		mes "これで足りるかな？";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ははは！　素晴らしい～！";
		mes "さっすがミリアム！";
		mes "うん、これなら問題無さそうだ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "……それでは準備が整ったので";
		mes "これからやることを説明しますね。";
		next;
		mes "[マラム]";
		mes "私たちはミリアムが持ってきた服で";
		mes "異国のキャラバン隊員に変装して";
		mes "購入した品物を受取ります。";
		next;
		mes "[マラム]";
		mes "品物を受け取ったら";
		mes "キャラバンを装ったまま街を出て";
		mes "とある場所まで荷物を運んでください。";
		mes "目的地は秘密なので教えられませんから";
		mes "私の後をついて来てください。";
		next;
		mes "[マラム]";
		mes ""+strcharinfo(0)+"様は";
		mes "^ff0000先ほど買物をした店^000000に行って";
		mes "もうすぐ出発すると伝えてください。";
		mes "私と他のメンバーは着替えて";
		mes "「^0000FF西の門^000000」で待機していますからね。";
		viewpoint 1, 137, 85, 18, 0x00FF00;
		set EP18_1QUE,26;
		delquest 11713;
		setquest 11714;
		close2;
		showevent 0, 1, "商人#ep18_ラヘル_0643_0";	// 2295: 137, 85
		cloakonnpc "ミリアム#ep18_ラヘル_04";
		cloakonnpc "タマリン#ep18_マラム_04";
		cutin "ep18_maram_01.png", 255;
		end;
	case 26:
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes strcharinfo(0)+"様は";
		mes "^ff0000先ほど買物をした店^000000に行って";
		mes "もうすぐ出発すると伝えてください。";
		mes "私と他のメンバーは着替えて";
		mes "「^0000FF西の門^000000」で待機していますからね。";
		close2;
		viewpoint 1, 137, 85, 18, 0x00FF00;
		cutin "ep18_maram_01.png", 255;
		end;
	case 27:
	case 28:
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes strcharinfo(0)+"様に";
		mes "手伝ってもらったおかげで";
		mes "全てが順調にいきそうです。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "ミリアムは、いつ来るのかな～。";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 15 || EP18_1QUE == 25)
		showevent 0,1,"マラム#ep18_ラヘル_047";
	else
		showevent 9999,0,"マラム#ep18_ラヘル_047";
	end;
}
rachel.gat,62,144,0	script	#ep18w05_141	139,14,14,{/* 15868 */
	if(EP18_1QUE == 16 || EP18_1QUE == 17) {
		cloakoffnpc "ミリアム#ep18_ラヘル_048";
	}
	end;
}
rachel.gat,62,144,5	script	ミリアム#ep18_ラヘル_048	10377,{/* 15869 (cloaking)*/
	if(EP18_1QUE == 16) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ふぅ……その……";
		mes "会えて嬉しいです";
		mes strcharinfo(0)+"様。";
		mes "マラムの友人で「ミリアム」と申します。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "出たぁ……ミリアムの猫かぶりモード。";
		mes "どうやったらそんな急に";
		mes "しおらしくなれるのか……。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "余計なことは言わなくて良いから！";
		mes "ほら、これ、返すよ。";
		mes "マラムから預かっていた小切手。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ええっ!?";
		mes "なに？";
		mes "もしかして、買えなかったってこと？";
		next;
		mes "[マラム]";
		mes "ねぇ……もしかして、買い物の際に";
		mes "失礼なことしてないよね？";
		mes "ミリアムっていきなりムッとして";
		mes "失礼なこと言う時あるからさ。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "そんなこと無いし！";
		mes "ボクのことを何だと思ってるの？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "本当に～？";
		mes "う～ん……でも困ったな。";
		mes "やっぱり、私が交渉に出ないとダメかぁ。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "わかった、私が行くよ。";
		mes strcharinfo(0)+"様";
		mes "申し訳ないのですが";
		mes "私と一緒に来てくれませんか。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "少々買物をしたいのですが、";
		mes "ここから^ff0000南東^000000にいる商人のところまで";
		mes "一緒に来てもらいたいのです。";
		mes "そうすれば「灰色の子供達」が";
		mes "置かれている状況も";
		mes "理解していただけると思いますし。";
		set EP18_1QUE,17;
		delquest 11704;
		setquest 11705;
		viewpoint 1, 87, 122, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "ミリアム#ep18_ラヘル_048";
		end;
	}
	else if(EP18_1QUE == 17) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ふぅ……その……";
		mes "会えて嬉しいです";
		mes strcharinfo(0)+"様。";
		mes "マラムの友人で「ミリアム」と申します。";
		close2;
		cutin "ep18_miriam_03.png", 255;
		cloakonnpc "ミリアム#ep18_ラヘル_048";
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 16)
		showevent 0,1,"ミリアム#ep18_ラヘル_048";
	else
		showevent 9999,0,"ミリアム#ep18_ラヘル_048";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,68,146,5	script	タマリン#ep18_マラム_049	10381,{/* 15870 (cloaking)*/
	//fallthrough
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,87,122,7	script	商人#ep18_ラヘル_0641_01	942,{/* 15871 */
	if(EP18_1QUE == 17) {
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "こんにちは～スリン社長。";
		mes "取引のお願いに来たのですが……。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[商人スリン]";
		mes "マラム！";
		mes "貴様ら「灰色の子供達」に";
		mes "売る品は無い！";
		mes "他所に行け！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "そんなこと仰らずに……";
		mes "以前は、取引に応じてくださったでは";
		mes "ありませんか。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[商人スリン]";
		mes "うるさい！";
		mes "ニルエン様の名前がなかったら";
		mes "叩き出してるところだ！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "もういいよ。";
		mes "帰ろう、マラム。";
		mes "失礼しました、スリン社長……。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "……こういうこともあります。";
		mes "気を取り直して";
		mes "もう少し^ff0000南東^000000にある";
		mes "他の店に行きましょうか。";
		set EP18_1QUE,18;
		delquest 11705;
		setquest 11706;
		viewpoint 1, 107, 102, 18, 0x00FF00;
		close2;
		showevent 0, 1, "商人#ep18_ラヘル_0642_02";	// 2290: 107, 102
		cutin "ep18_maram_02.png", 255;
		end;
	}
	else if(EP18_1QUE == 18) {
		mes "[商人スリン]";
		mes "「灰色の子供達」に";
		mes "売る品は無い！";
		mes "他所に行け！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "……こういうこともあります。";
		mes "気を取り直して";
		mes "もう少し^ff0000南東^000000にある";
		mes "他の店に行きましょうか。";
		viewpoint 1, 107, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_02.png", 255;
		end;
	}
	//19 未調査
	mes "[商人スリン]";
	mes "ふむ……";
	mes "外国から来られた方ですか？";
	mes "よろしければ、うちの商品を";
	mes "見ていってください。";
	close;
OnQuestInfo:
	if(EP18_1QUE == 17)
		showevent 0, 1, "商人#ep18_ラヘル_0641_01";
	else
		showevent 9999,0,"商人#ep18_ラヘル_0641_01";
	end;
}
rachel.gat,107,102,7	script	商人#ep18_ラヘル_0642_02	943,{/* 15872 */
	if(EP18_1QUE == 18) {
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "こんにちは、";
		mes "サンナットのおじさん。";
		mes "おばさんもお元気ですか？";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人サンナット]";
		mes "あ……";
		mes "そう……";
		mes "何の用だ？";
		mes "マラム。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "こちらに書かれている品を";
		mes "買いたいですが？";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[商人サンナット]";
		mes "あ……うむ……";
		mes "それは……";
		mes "すまないが、今在庫を切らしていて。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "在庫のある品だけでも";
		mes "構いません。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[商人サンナット]";
		mes "うむ……すまないが……";
		mes "どれも在庫不足でね……。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "……ちょっと足りなくてもいいのですが。";
		next;
		set EP18_1QUE,19;
		delquest 11706;
		setquest 11707;
		cloakoffnpc "ミリアム#ep18_商人2_052";
		cloakoffnpc "マラム#ep18_商人2_053";
		cutin "ep18_maram_01.png", 255;
		mes "[商人サンナット]";
		mes "…………。";
		next;
		showevent 0, 1, "ミリアム#ep18_商人2_052";	// 2292: 117, 104
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "では、いつも通りに";
		mes "パンとお肉を……。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人サンナット]";
		mes "あ……";
		mes "それもすでに予約が……。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "はい……わかりました。";
		mes "お邪魔しました……。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[商人サンナット]";
		mes "すまんな……。";
		close2;
		viewpoint 1, 117, 104, 18, 0x00FF00;
		end;
	}
	else if(EP18_1QUE == 19 || EP18_1QUE == 20) {
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "では、いつも通りに";
		mes "パンとお肉を……。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人サンナット]";
		mes "あ……";
		mes "それもすでに予約が……。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "はい……わかりました。";
		mes "お邪魔しました……。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[商人サンナット]";
		mes "すまんな……。";
		close2;
		viewpoint 1, 117, 104, 18, 0x00FF00;
		end;
	}
	else if(EP18_1QUE == 21) {
		mes "[商人サンナット]";
		mes "すいませんが";
		mes "現在どれも在庫を切らしてまして……";
		mes "他の店に行かれてはいかがです？";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ここから更に^ff0000南東^000000にある";
		mes "別の店に行きましょう。";
		viewpoint 1, 137, 85, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_02.png", 255;
		end;
	}
	mes "[商人サンナット]";
	mes "すいませんが";
	mes "現在どれも在庫を切らしてまして……";
	mes "他の店に行かれてはいかがです？";
	close;
OnQuestInfo:
	if(EP18_1QUE == 18)
		showevent 0, 1, "商人#ep18_ラヘル_0642_02";
	else
		showevent 9999,0,"商人#ep18_ラヘル_0642_02";
	end;
}
rachel.gat,117,104,0	script	#ep18w10_148	139,15,15,{/* 15873 */
OnTouch:
	if(EP18_1QUE == 19 || EP18_1QUE == 20) {
		cloakoffnpc "ミリアム#ep18_商人2_052";
		cloakoffnpc "マラム#ep18_商人2_053";
	}
	else {
		cloakonnpc "ミリアム#ep18_商人2_052";
		cloakonnpc "マラム#ep18_商人2_053";
	}
	end;
}
rachel.gat,117,104,5	script	ミリアム#ep18_商人2_052	10377,{/* 15874 (cloaking)*/
	if(EP18_1QUE == 19) {
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "はぁぁぁ……";
		mes "もう！";
		mes "なんだってのさ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "はいはい、ミリアム。";
		mes "落ち着いて。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "冒険者さんも、これでわかったでしょ？";
		mes "これがボクら「灰色の子供達」が";
		mes "置かれている状況なんだ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "……まあ、そういうことです。";
		mes "スリン社長も、サンナットおじさんも";
		mes "この前までは品を売ってくれたけど";
		mes "今はもう売ってはくれません。";
		next;
		mes "[マラム]";
		mes "このラヘルを取り巻く空気が";
		mes "変わってしまったんです。";
		mes "あの人たちを非難するのは簡単だけど";
		mes "それで問題が解決するとは";
		mes "思ってはいません。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ミリアムもわかってるから";
		mes "こうやって暴れてるんです。";
		mes "……痛っ!!";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "マラムはいつも一言多い！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "イタタタ……";
		mes "う～ん、でも実際困ったなぁ。";
		mes "何か方法を考えないと……。";
		mes "う～～ん……。";
		set EP18_1QUE,20;
		delquest 11707;
		setquest 11708;
		viewpoint 1, 119, 103, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	else if(EP18_1QUE == 20) {
		mes "[ミリアム]";
		mes "マラムが考え事してる。";
		mes "何か良い案はないかな？";
		cutin "ep18_miriam_03.png", 2;
		viewpoint 1, 119, 103, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	//21 未調査
	end;
OnQuestInfo:
	if(EP18_1QUE == 19)
		showevent 0, 1, "ミリアム#ep18_商人2_052";
	else
		showevent 9999,0,"ミリアム#ep18_商人2_052";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,119,103,3	script	マラム#ep18_商人2_053	10376,{/* 15875 (cloaking)*/
	if(EP18_1QUE == 20) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "う～ん……買い物ができないなんて";
		mes "困ったなぁ。";
		mes "別の街に行って仕入れるか？";
		mes "だけど、ラヘルから離れるのは";
		mes "マズイ……状況が状況だしなぁ……。";
		next;
		mes "[マラム]";
		mes "こんな時に、他国のキャラバンでも";
		mes "通りかかってくれないかなぁ。";
		mes "他国……他国の……";
		mes "あっ!!";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "国外から来られた";
		mes strcharinfo(0)+"様と";
		mes "一緒ならいけるかもしれません！";
		next;
		menu "何を買おうとしてるのか聞く",-;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "あ……";
		mes "ええっとぉ……";
		mes "それは……ですねぇ……。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "いつまで隠すつもりだよ？";
		mes "何を買うのかわからないんじゃ";
		mes "警戒されるのも当然だろ。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "あははは……";
		mes "それもそうですね。";
		mes "あ、あの……";
		mes "母上には内緒でお願いしますね？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "実は私とミリアムは";
		mes "街の外で暮らす原住民たちを助けるために";
		mes "活動をしているんです。";
		mes "生活に必要な物資を調達するのも";
		mes "その一環です。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "彼らの置かれた境遇は、かなり悲惨です。";
		mes "女神フレイヤ様を奉じない原住民に対し";
		mes "「急進派」を始めとする熱狂的な信者は";
		mes "彼らを徹底的に迫害しました。";
		next;
		mes "[マラム]";
		mes "彼らが生き残るために選んだ道は";
		mes "隠れることでした。";
		mes "ただ、隠れるということは";
		mes "何かあった場合に、外からの援助を";
		mes "得られないということです。";
		next;
		mes "[マラム]";
		mes "そして今、外からの援助がないと";
		mes "やっていけない状況に陥っています。";
		mes "どうか、彼らの為にも";
		mes "手を貸してもらえないでしょうか。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ボクからもお願いします。";
		mes "餓えで苦しむ子たちが";
		mes "ボクたちと同じ道を……";
		mes "同じ苦痛を味わうことだけは";
		mes "防ぎたいんです。";
		next;
		menu "助ける",-;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "本当ですか！";
		mes "ありがとうございます！";
		mes "さすがは母上の見込んだお方！";
		next;
		mes "[マラム]";
		mes "それでは、ここから更に^ff0000南東^000000にある";
		mes "別の店に行きましょう。";
		mes "なに、心配はいりません。";
		mes "私が上手くやりますから";
		mes strcharinfo(0)+"様は";
		mes "突っ立ってるだけで大丈夫ですよ！";
		set EP18_1QUE,21;
		delquest 11708;
		setquest 11709;
		viewpoint 1, 137, 85, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_02.png", 255;
		cloakonnpc "ミリアム#ep18_商人2_052";
		cloakonnpc "マラム#ep18_商人2_053";
		end;
	}
	//21 未調査
	end;
OnQuestInfo:
	if(EP18_1QUE == 20)
		showevent 0, 1, "マラム#ep18_商人2_053";
	else
		showevent 9999,0,"マラム#ep18_商人2_053";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,137,85,0	script	#ep18w10_149	139,14,14,{/* 15876 */
OnTouch:
	if(EP18_1QUE == 22)
		cloakoffnpc "ミリアム#ep18_商人3_055";
	else if(EP18_1QUE == 23) {
		cloakoffnpc "ミリアム#ep18_商人3_055";
		cloakoffnpc "濡れバーガー#ep18_ラヘル饅";
	}
	else
		cloakonnpc "ミリアム#ep18_商人3_055";
	end;
}
rachel.gat,137,85,5	script	商人#ep18_ラヘル_0643_054	928,{/* 15877 */
	if(EP18_1QUE == 21) {
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "こんにちは～";
		mes "レンシア社長～♪";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人レンシア]";
		mes "なんだぁ……マラムか。";
		mes "お前には売らないと言ったはずだ。";
		mes "帰れ。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "いえいえ、私ではなく";
		mes "こちらの商人様が品を購入したいと。";
		mes "私はただの良い品が手に入るお店を";
		mes "案内しているだけですよ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "おっほん！";
		mes "こちらはマロルでキャラバンを";
		mes "率いておられる";
		mes "カウ"+strcharinfo(0)+"ウル様^000000！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "まさか、レンシア社長ほどのお方が";
		mes "カウ"+strcharinfo(0)+"ウル様^000000を";
		mes "ご存じないなんてこと";
		mes "ありませんよねぇ？";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人レンシア]";
		mes "カウ"+strcharinfo(0)+"ウル様!?";
		mes "……ああ、き、聞いたことあるぞ。";
		mes "あの有名な……マロルの……。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "さあ！";
		mes "こちらが購入したい品の目録です。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人レンシア]";
		mes "うおっほ!?";
		mes "こんな膨大な量の品を";
		mes "お買い上げくださるのですか!!";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "当然でしょ！";
		mes "カウ"+strcharinfo(0)+"ウル様の";
		mes "キャラバンで運ぶのですからね。";
		mes "あ、支払いはこれで。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人レンシア]";
		mes "小切手での一括払いぃぃ!?";
		mes "さすがは";
		mes "カウ"+strcharinfo(0)+"ウル様!!";
		mes "す、すぐに手配いたしますぅ！";
		next;
		mes "[商人レンシア]";
		mes "いつ出発なさるのかだけ";
		mes "教えていただけますか？";
		mes "教えていただければ";
		mes "貴方様のキャラバンまで";
		mes "品をお運びいたしますよ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "あ……いやぁそこまでしなくてもぉ……。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人レンシア]";
		mes "うん？";
		mes "何か言ったか、マラム？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "まだ出発する時間は決めてないし……";
		mes "そのぉ、キャラバンもまだ";
		mes "到着してないし……";
		mes "もごもご……。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[商人レンシア]";
		mes "お買い上げありがとうございます。";
		mes "カウ"+strcharinfo(0)+"ウル様！";
		mes "それではお時間だけお知らせください！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "あ……あははは……。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ちょっと、別の場所で話をしよう。";
		mes "ここから^ff0000南西^000000にある屋台がいいかな。";
		set EP18_1QUE,22;
		delquest 11709;
		setquest 11710;
		viewpoint 1, 105, 72, 18, 0x00FF00;
		cloakoffnpc "ミリアム#ep18_商人3_055";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
	else if(EP18_1QUE == 22) {
		mes "[商人レンシア]";
		mes "お買い上げありがとうございます。";
		mes "カウ"+strcharinfo(0)+"ウル様！";
		mes "それではお時間だけお知らせください！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "あ……あははは……。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ちょっと、別の場所で話をしよう。";
		mes "ここから^ff0000南西^000000にある屋台がいいかな。";
		viewpoint 1, 105, 72, 18, 0x00FF00;
		cloakoffnpc "ミリアム#ep18_商人3_055";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
	else if(EP18_1QUE == 26) {
		mes "[商人レンシア]";
		mes "あ！";
		mes "カウ"+strcharinfo(0)+"ウル様！";
		mes "いかがなさいましたか？";
		mes "注文の品は用意できておりますよ！";
		next;
		menu "出発の準備ができた",-;
		mes "[商人レンシア]";
		mes "左様でございますか！";
		mes "それでは、";
		mes "「^0000FF西側の入口^000000」で品を受け取ってください。";
		mes "お買い上げありがとうございました！";
		mes "またご贔屓に～～～！";
		set EP18_1QUE,27;
		delquest 11714;
		setquest 11715;
		viewpoint 1, 41, 132, 18, 0x00FF00;
		close;
	}
	else if(EP18_1QUE == 27) {
		mes "[商人レンシア]";
		mes "それでは、";
		mes "「^0000FF西側の入口^000000」で品を受け取ってください。";
		mes "お買い上げありがとうございました！";
		mes "またご贔屓に～～～！";
		viewpoint 1, 41, 132, 18, 0x00FF00;
		close;
	}
	mes "[商人レンシア]";
	mes "お買い上げありがとうございました！";
	mes "またご贔屓に～～～！";
	close;
OnQuestInfo:
	if(EP18_1QUE == 21 || EP18_1QUE == 26)
		showevent 0, 1, "商人#ep18_ラヘル_0643_054";
	else
		showevent 9999,0,"商人#ep18_ラヘル_0643_054";
	end;
}
rachel.gat,105,72,5	script	ミリアム#ep18_商人3_055	10377,{/* 15878 */
	if(EP18_1QUE == 22) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "マラムの詐欺師スキルは";
		mes "大したものだよね。";
		mes "いったいこれまで";
		mes "何人ぐらい騙してきたの？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "人聞きが悪いなぁ……今回は";
		mes strcharinfo(0)+"様が";
		mes "いかにもスゴイ人ってオーラを";
		mes "持っていたから成功したんだよ。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "でも、まだ品が手に入ったわけじゃない。";
		mes "キャラバンの件はどうするつもり？";
		mes "荷物を届けてもらう時に";
		mes "キャラバンがいなければ";
		mes "商品を渡してもらえないかもしれないよ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "そうだなぁ……";
		mes "わざわざ商品を運んでくれるってことは";
		mes "直接、キャラバンの様子を見て";
		mes "確認したいってことだろうからね。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "よし！";
		mes "偽のキャラバンをでっちあげよう！";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "そんなことできるのか？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "方法がないわけじゃないよ。";
		mes "まずは、キャラバンの隊員として";
		mes "街の外から来た冒険者たちを雇う。";
		mes "街の人たちを使ったらウソだって";
		mes "バレちゃうからね。";
		next;
		mes "[マラム]";
		mes "キャラバン隊員に変装する為には";
		mes "それっぽい衣装も必要だな。";
		mes "衣装はミリアムが探してきてくれない？";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "簡単に言ってくれるな……";
		mes "まあ、わかった。";
		mes "衣装はボクの方で、なんとかするよ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes strcharinfo(0)+"様も";
		mes "キャラバン隊員に偽装してくれそうな";
		mes "知り合いの方がいれば";
		mes "お声がけいただけませんか？";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "っと、その前に腹ごしらえしましょう。";
		mes "そこのお店の「濡れバーガー」が";
		mes "とっても美味しいんです。";
		mes "ラヘルのＢ級グルメってやつです。";
		next;
		mes "[マラム]";
		mes "実はすでに注文してありますので";
		mes "ぜひご賞味ください。";
		mes "食べ終わったら、最初にお会いした場所で";
		mes "集合することにしましょう。";
		set EP18_1QUE,23;
		delquest 11710;
		setquest 11711;
		viewpoint 1, 108, 73, 18, 0x00FF00;
		close2;
		cloakonnpc "ミリアム#ep18_商人3_055";
		cloakoffnpc "濡れバーガー#ep18_ラヘ";
		cutin "ep172_beta.bmp", 255;
		end;
	}
	else if(EP18_1QUE == 23) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes strcharinfo(0)+"様も";
		mes "キャラバン隊員に偽装してくれそうな";
		mes "知り合いの方がいれば";
		mes "お声がけいただけませんか？";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "っと、その前に腹ごしらえしましょう。";
		mes "そこのお店の「濡れバーガー」が";
		mes "とっても美味しいんです。";
		mes "ラヘルのＢ級グルメってやつです。";
		next;
		mes "[マラム]";
		mes "実はすでに注文してありますので";
		mes "ぜひご賞味ください。";
		mes "食べ終わったら、最初にお会いした場所で";
		mes "集合することにしましょう。";
		viewpoint 1, 108, 73, 18, 0x00FF00;
		close2;
		cloakonnpc "ミリアム#ep18_商人3_055";
		cloakoffnpc "濡れバーガー#ep18_ラヘル饅";
		cutin "ep172_beta.bmp", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 22)
		showevent 0, 1, "ミリアム#ep18_商人3_055";
	else
		showevent 9999,0,"ミリアム#ep18_商人3_055";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,108,74,0	script	#ep18w09_145	139,14,14,{/* 15879 */
	if(EP18_1QUE == 24) {
		cloakoffnpc "濡れバーガー#ep18_ラヘル饅";
	}
	end;
}
rachel.gat,105,73,5	script	タマリン#ep18_ラヘル饅	10381,{/* 15880 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,108,74,3	script	濡れバーガー#ep18_ラヘル饅	10428,{/* 15881 (cloaking)*/
	if(EP18_1QUE == 23) {
		cloakonnpc "ミリアム#ep18_商人3_055";
		mes "^0000FF‐屋台の席に腰を下ろしマラムが";
		mes "　注文した「濡れバーガー」を頬張る。";
		mes "　スパイスが効いた異国情緒あふれる";
		mes "　しっとりした肉まんのような味だ‐^000000";
		next;
		cloakoffnpc "タマリン#ep18_ラヘル饅";
		cutin "ep18_tamarin_02.png", 1;
		mes "[？？？]";
		mes strcharinfo(0)+"様！";
		mes "こんなところで会えるなんて";
		mes "奇遇ですね！";
		next;
		menu "どちら様ですか？",-;
		cutin "ep18_tamarin_01.png", 1;
		mes "[タマリン]";
		mes "あ、こんな格好していたら";
		mes "誰だかわからないですよね。";
		mes "私です、「タマリン」です。";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF‐タマリンは隣の席に座ると";
		mes "　濡れバーガーを注文した‐^000000";
		next;
		cutin "ep18_tamarin_02.png", 1;
		mes "[タマリン]";
		mes "ここの濡れバーガー、美味しいですよね！";
		mes "以前、ラヘルに来た時に食べましたが";
		mes "その美味しさに感動してしまいました。";
		mes "以来、ラヘルに来る度に食べてます。";
		next;
		menu "ラヘルに来た理由を聞く",-;
		cutin "ep18_tamarin_01.png", 1;
		mes "[タマリン]";
		mes "えっと……詳しくは話せないのですが";
		mes "ニルエン大神官様から神殿の";
		mes "警護にあたる人員が欲しいと言われ";
		mes "テューリアンとアルプオカートの二人を";
		mes "連れて来たんです。";
		next;
		mes "[タマリン]";
		mes "マークとマギスティンも一緒に来ましたが";
		mes "私たちは警護人員ではないので";
		mes "こうして街を散策中です。";
		mes "要するに、暇しているわけですね。";
		next;
		menu "キャラバン隊員に変装して欲しいと伝える",-;
		cutin "ep18_tamarin_02.png", 1;
		mes "[タマリン]";
		mes "はははは！";
		mes "それは面白そうですね。";
		mes "ぜひお手伝いさせてください！";
		mes "マークとマギスティンにも";
		mes "手伝ってもらいましょうか。";
		next;
		cutin "ep18_tamarin_01.png", 1;
		mes "[タマリン]";
		mes "二人はここから北にある";
		mes "^ff0000広場^000000の付近にいるはずです。";
		mes "では、濡れバーガーを食べ終わったら";
		mes "探しに行きましょう。";
		set EP18_1QUE,24;
		delquest 11711;
		setquest 11712;
		viewpoint 1, 122, 120, 18, 0x00FF00;
		close2;
		showevent 0, 1, "マークイシャ#ep18_ラヘ";	// 2300: 122, 120
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	else if(EP18_1QUE == 24) {
		cloakoffnpc "タマリン#ep18_ラヘル饅";
		cutin "ep18_tamarin_02.png", 2;
		mes "[タマリン]";
		mes "ぜひお手伝いさせてください！";
		mes "マークとマギスティンにも";
		mes "手伝ってもらいましょうか。";
		next;
		mes "[タマリン]";
		mes "二人は^ff0000広場^000000の付近にいるはずです。";
		mes "では、濡れバーガーを食べ終わったら";
		mes "探しに行きましょう。";
		viewpoint 1, 122, 120, 18, 0x00FF00;
		close2;
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 23)
		showevent 0, 1, "濡れバーガー#ep18_ラヘル饅";
	else
		showevent 9999,0,"濡れバーガー#ep18_ラヘル饅";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,122,120,5	script	マークイシャ#ep18_ラヘル饅	10383,{/* 15882 */
	if(EP18_1QUE == 24) {
		cloakonnpc "タマリン#ep18_ラヘル饅";
		cloakonnpc "濡れバーガー#ep18_ラヘル饅";
		cutin "ep18_mark_02.png", 0;
		mes "[マークイシャ]";
		mes "こんにちは";
		mes strcharinfo(0)+"様。";
		mes "仕事で来られたのですか？";
		mes "それとも観光ですか？";
		next;
		cutin "ep18_mark_01.png", 0;
		mes "[マークイシャ]";
		mes "あれ？　タマリンも一緒でしたか。";
		next;
		cutin "ep18_tamarin_02.png", 1;
		mes "[タマリン]";
		mes "マークとマギスティンの用事は";
		mes "済んでいますか？";
		mes strcharinfo(0)+"様から";
		mes "お仕事の依頼が来ているんです。";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF‐マークイシャとマギスティンに";
		mes "　事情を説明し、キャラバンの隊員に";
		mes "　変装して欲しいと伝えた‐^000000";
		next;
		cutin "4job_maggi_04.PNG", 2;
		mes "[マギスティン]";
		mes "アルプオカートさんから頼まれていた";
		mes "本は手に入れました……";
		mes "テューから頼まれていたお菓子は";
		mes "見つかりませんでしたけど……。";
		next;
		cutin "ep18_mark_02.png", 0;
		mes "[マークイシャ]";
		mes "あのバカのことは放っておこう。";
		mes "こちらはちょうど手が空いてますので";
		mes "お手伝いさせてもらいますよ。";
		mes "人手は多い方が良さそうですしね。";
		next;
		cutin "ep18_tamarin_01.png", 1;
		mes "[タマリン]";
		mes "では、"+strcharinfo(0)+"様。";
		mes "依頼主のところに案内してもらえますか？";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF‐マラムは、最初に会った場所に";
		mes "　集合しようと言っていた。";
		mes "　最初に会った場所に行ってみよう‐^000000";
		set EP18_1QUE,25;
		delquest 11712;
		setquest 11713;
		viewpoint 1, 70, 147, 18, 0x00FF00;
		close2;
		showevent 0, 1, "マラム#ep18_ラヘル_047";	// 2285: 70, 147
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	else if(EP18_1QUE == 25) {
		cutin "ep18_mark_02.png", 0;
		mes "[マークイシャ]";
		mes "こちらはちょうど手が空いてますので";
		mes "お手伝いさせてもらいますよ。";
		mes "人手は多い方が良さそうですしね。";
		next;
		cutin "ep18_tamarin_01.png", 1;
		mes "[タマリン]";
		mes "では、"+strcharinfo(0)+"様。";
		mes "依頼主のところに案内してもらえますか？";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF‐マラムは、最初に会った場所に";
		mes "　集合しようと言っていた。";
		mes "　最初に会った場所に行ってみよう‐^000000";
		viewpoint 1, 70, 147, 18, 0x00FF00;
		close2;
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	mes "[マークイシャ]";
	mes "こんにちは";
	mes strcharinfo(0)+"様。";
	mes "仕事で来られたのですか？";
	mes "それとも観光ですか？";
	cutin "ep18_mark_01.png", 2;
	close2;
	cutin "ep18_mark_01.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 24)
		showevent 0, 1, "マークイシャ#ep18_ラヘル饅";
	else
		showevent 9999,0,"マークイシャ#ep18_ラヘル饅";
	end;
}
rachel.gat,124,120,4	script	マギスティン#ep18_ラヘル饅	10365,{/* 15883 */
	mes "[マギスティン]";
	mes "こ……こんにちは……";
	mes "ラヘルは暑いですね……";
	mes "水分はこまめに、取ってくださいね……。";
	cutin "4job_maggi_01.PNG", 2;
	close2;
	cutin "4job_maggi_01.PNG", 255;
	end;
}
rachel.gat,41,132,0	script	#ep18w07_143	139,16,14,{/* 15884 */
	if(EP18_1QUE == 27) {
		cloakoffnpc "商人#ep18_ラヘル_0643j_";
		cloakoffnpc "箱#ep18_調達品1_060";
		cloakoffnpc "箱#ep18_調達品2_061";
		cloakoffnpc "箱#ep18_調達品3_062";
		cloakoffnpc "箱#ep18_調達品4_063";
	}
	else if(EP18_1QUE == 28) {
		cloakoffnpc "商人#ep18_ラヘル_0643j_";
		cloakoffnpc "マラム#ep18_商人3j_142";
		cloakoffnpc "箱#ep18_調達品1_060";
		cloakoffnpc "箱#ep18_調達品2_061";
		cloakoffnpc "箱#ep18_調達品3_062";
		cloakoffnpc "箱#ep18_調達品4_063";
	}
	end;
}
rachel.gat,43,132,5	script	商人#ep18_ラヘル_0643j_	928,{/* 15885 (cloaking)*/
	mes "[商人レンシア]";
	mes "こちらがご注文の品です！";
	mes "ご確認ください！";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,40,135,4	script	マラム#ep18_商人3j_142	10376,{/* 15886 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "ではでは～";
	mes "カウ"+strcharinfo(0)+"ウル様。";
	mes "^ff0000西側の門^000000を出たところで改めて";
	mes "経路の確認をいたしましょう！";
	close2;
	viewpoint 1, 25, 125, 18, 0x00FF00;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,42,133,3	script	箱#ep18_調達品1_060	10250,{/* 15887 */
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,40,133,3	script	箱#ep18_調達品2_061	10250,{/* 15888 */
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,39,132,3	script	箱#ep18_調達品3_062	10250,{/* 15889 */
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,41,132,3	script	箱#ep18_調達品4_063	10250,{/* 15890 */
	if(EP18_1QUE == 27) {
		cloakoffnpc "マラム#ep18_商人3j_142";
		mes "[商人レンシア]";
		mes "カウ"+strcharinfo(0)+"ウル様！";
		mes "ご注文の品に間違いないか";
		mes "どうぞ、ご確認ください！";
		next;
		menu "大丈夫そうです",-;
		mes "[商人レンシア]";
		mes "どうも、ありがとうございます！";
		mes "またのご利用をお待ちしております！";
		next;
		cloakonnpc "商人#ep18_ラヘル_0643j_";
		mes "[マラム]";
		mes "ではでは～";
		mes "カウ"+strcharinfo(0)+"ウル様。";
		mes "^ff0000西側の門^000000を出たところで改めて";
		mes "経路の確認をいたしましょう！";
		cutin "ep18_maram_01.png", 2;
		set EP18_1QUE,28;
		delquest 11715;
		setquest 11716;
		viewpoint 1, 25, 125, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		showevent 0, 1, "箱#ep18_調達品4_063";	// 2308: 41, 132
		end;
	}
	else if(EP18_1QUE == 28) {
		cloakoffnpc "マラム#ep18_商人3j_142";
		cloakonnpc "商人#ep18_ラヘル_0643j_";
		mes "[マラム]";
		mes "ではでは～";
		mes "カウ"+strcharinfo(0)+"ウル様。";
		mes "^ff0000西側の門^000000を出たところで改めて";
		mes "経路の確認をいたしましょう！";
		cutin "ep18_maram_01.png", 2;
		viewpoint 1, 25, 125, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 27 || EP18_1QUE == 28)
		showevent 0, 1, "箱#ep18_調達品4_063";
	else
		showevent 9999,0,"箱#ep18_調達品4_063";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,354,235,3	script	商人#ep18_ラヘル_064	10380,{/* 15891 */
	if(EP18_1QUE == 28) {
		cloakoffnpc "商人#ep18_ラヘル_065";
		cloakoffnpc "商人#ep18_ラヘル_066";
		cloakoffnpc "商人#ep18_ラヘル_067";
		cloakoffnpc "商人#ep18_ラヘル_068";
		cutin "ep18_merchant.png", 2;
		mes "[変装したマラム]";
		mes "望みの品が上手く手に入りました。";
		mes strcharinfo(0)+"様の";
		mes "おかげです。";
		next;
		mes "[変装したマラム]";
		mes "引き続きで申し訳ありませんが";
		mes "荷物を運ぶのを手伝ってもらえませんか。";
		mes "これを……原住民たちが";
		mes "隠れ住む村に運びます。";
		next;
		cutin "ep18_merchant.png", 0;
		mes "[変装したミリアム]";
		mes "みんな変装したまま運ぶんだよね？";
		mes "この格好、動きづらいなぁ。";
		next;
		cutin "ep18_merchant.png", 2;
		mes "[変装したマラム]";
		mes "だからって、途中で脱いじゃダメだよ。";
		mes "せめて迷路の中までは";
		mes "我慢して欲しいな。";
		next;
		cutin "ep18_merchant.png", 0;
		mes "[変装したミリアム]";
		mes "わかってるよ……";
		mes "これも、あの子たちの為だからね。";
		next;
		cutin "ep18_merchant.png", 2;
		mes "[変装したマラム]";
		mes "詳しい場所は、ここでは言えませんが……";
		mes "まずは^ff0000西^000000にある「^0000FFオズ峡谷^000000」に";
		mes "移動しましょう。";
		viewpoint 1, 28, 290, 18, 0x00FF00;
		set EP18_1QUE,29;
		delquest 11716;
		setquest 11717;
		close2;
		cloakonnpc "商人#ep18_ラヘル_065";
		cloakonnpc "商人#ep18_ラヘル_066";
		cloakonnpc "商人#ep18_ラヘル_067";
		cloakonnpc "商人#ep18_ラヘル_068";
		cutin "ep18_merchant.png", 255;
		end;
	}
	else if(EP18_1QUE == 29) {
		cloakoffnpc "商人#ep18_ラヘル_065";
		cloakoffnpc "商人#ep18_ラヘル_066";
		cloakoffnpc "商人#ep18_ラヘル_067";
		cloakoffnpc "商人#ep18_ラヘル_068";
		cutin "ep18_merchant.png", 2;
		mes "[変装したマラム]";
		mes "引き続きで申し訳ありませんが";
		mes "荷物を運ぶのを手伝ってもらえませんか。";
		mes "これを……原住民たちが";
		mes "隠れ住む村に運びます。";
		next;
		mes "[変装したマラム]";
		mes "詳しい場所は、ここでは言えませんが……";
		mes "まずは^ff0000西^000000にある「^0000FFオズ峡谷^000000」に";
		mes "移動しましょう。";
		close2;
		viewpoint 1, 28, 290, 18, 0x00FF00;
		cloakonnpc "商人#ep18_ラヘル_065";
		cloakonnpc "商人#ep18_ラヘル_066";
		cloakonnpc "商人#ep18_ラヘル_067";
		cloakonnpc "商人#ep18_ラヘル_068";
		cutin "ep18_merchant.png", 255;
		end;
	}
	mes "[商人]";
	mes "今日は風が強いな……。";
	close;
OnQuestInfo:
	if(EP18_1QUE == 28 || EP18_1QUE == 29)
		showevent 0, 1, "商人#ep18_ラヘル_064";
	else
		showevent 9999,0,"商人#ep18_ラヘル_064";
	end;
}
ra_fild11.gat,352,233,3	script	商人#ep18_ラヘル_065	10380,{/* 15892 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,356,233,3	script	商人#ep18_ラヘル_066	10380,{/* 15893 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,352,237,3	script	商人#ep18_ラヘル_067	10380,{/* 15894 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,356,237,3	script	商人#ep18_ラヘル_068	10380,{/* 15895 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild10.gat,379,283,0	script	#ep180_ra_fild10_1	139,2,2,{/* 15896 */
	if(EP18_1QUE == 29)
		viewpoint 1, 179, 176, 18, 0x00FF00;
	end;
}
ra_fild10.gat,179,176,5	script	商人#ep18_峡谷_065	10380,{/* 15897 */
	if(EP18_1QUE == 29) {
		cutin "ep18_merchant.png", 2;
		mes "[変装したミリアム]";
		mes "ふぅ……";
		mes "ここまでは順調ですね。";
		mes "ここから「^0000FFオズの迷路^000000」に入ります。";
		mes "少々準備がありますので、";
		mes "少ししたら声をかけていただけますか？";
		set EP18_1QUE,30;
		delquest 11717;
		setquest 11719;
		close2;
		cutin "ep18_merchant.png", 255;
		end;
	}
	else if(EP18_1QUE == 30) {
		cutin "ep18_merchant.png", 2;
		mes "[変装したミリアム]";
		mes "ここから「^0000FFオズの迷路^000000」に入ります。";
		mes "大体の準備は終わりました。";
		mes "今からロープを下すので、";
		mes "もう少々お時間をいただきます。";
		if(mdopenstate("maze of oz") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			set '@menu$,"「オズの迷路」入場";
		}
		else {
			next;
			cutin "ep18_merchant.png", 2;
			mes "[変装したミリアム]";
			mes "^ff0000パーティーリーダー^000000の方に";
			mes "準備をお願いしてください。";
			set '@menu$,"「オズの迷路」(maze of oz)作成";
		}
		next;
		if(select("やめる",'@menu$) == 1) {
			cutin "ep18_merchant.png", 2;
			mes "[変装したミリアム]";
			mes "準備が出来たら";
			mes "下に降りますから";
			mes "私に話しかけてください。";
			close2;
			cutin "ep18_merchant.png", 255;
			end;
		}
		if(mdopenstate("maze of oz")) {
			cutin "ep18_merchant.png", 2;
			mes "[変装したミリアム]";
			mes "では「^0000FFオズの迷路^000000」に";
			mes "出発いたします。";
			close2;
			cutin "ep18_merchant.png", 255;
			switch(mdenter("maze of oz")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[maze of oz] に入場しました　 : 　" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("MazeOfOzControl1")+ "::OnStart";
				//warp "1@oz.gat", 284, 167;
				end;
			case 1:	// パーティー未加入
				mes "[変装したミリアム]";
				mes "念のために^ff0000パーティーを作成^000000して";
				mes "入った方が良さそうです。";
				next;
				cutin "ep18_merchant.png", 255;
				mes "[インフォメーション]";
				mes "パーティーに加入していないため";
				mes "入場できません。";
				close;
			case 2:	// ダンジョン未作成
				mes "[変装したミリアム]";
				mes "少し待ってから、やり直してみましょう。";
				next;
				cutin "ep18_merchant.png", 255;
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
				cutin "ep18_merchant.png", 255;
				mes "[インフォメーション]";
				mes "パーティーリーダーのみ";
				mes "メモリアルダンジョンを";
				mes "作成することができます。";
				close;
			}
			cutin "ep18_merchant.png", 255;
			mdcreate "maze of oz";
			mes "■パーティー名";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "■パーティーリーダー";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "　";
			mes "^006400maze of oz^000000の作成申請を受け付けます。";
			next;
			cutin "ep18_merchant.png", 2;
			mes "[変装したミリアム]";
			mes "少し待ってから";
			mes "入った方が良さそうです。";
			close2;
			cutin "ep18_merchant.png", 255;
			end;
		}
	}
	else if(EP18_1QUE >= 31) {
		mes "[インフォメーション]";
		mes "既に「オズの迷路」を";
		mes "クリアしているキャラクターは、";
		mes "パーティメンバーとして";
		mes "「オズの迷路」に";
		mes "入場できます。";
		next;
		mes "[インフォメーション]";
		mes "パーティメンバーとして";
		mes "「オズの迷路」に";
		mes "入場しますか？";
		next;
		if(select("やめる","「オズの迷路」入場") == 1) {
			mes "‐やめた‐";
			close;
		}
		mes "[インフォメーション]";
		mes "「オズの迷路」へ入場します。";
		close2;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[インフォメーション]";
			mes "既に「オズの迷路」を";
			mes "クリアしているキャラクターは、";
			mes "パーティリーダーとして";
			mes "入場できません。";
			close;
		}
		mes "[インフォメーション]";
		mes "対象のメモリアルダンジョンが";
		mes "作成されていないため";
		mes "入場できません。";
		close;
	}
	cutin "ep18_merchant.png", 2;
	mes "[商人]";
	mes "人影が見えたと思ったんだが";
	mes "誰もいないな。";
	mes "まあ、こんなところに人が来るとは";
	mes "思えないが。";
	close2;
	cutin "ep18_merchant.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 29 || EP18_1QUE == 30)
		showevent 0, 1, "商人#ep18_峡谷_065";
	else
		showevent 9999,0,"商人#ep18_峡谷_065";
	end;
}

gw_fild01.gat,276,339,3	script	マラム#ep18_オズの出口_066	10376,{/* 15898 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "ここから^ff0000西^000000に進めば";
	mes "原住民たちが隠れ住む村の";
	mes "入口に到着します。";
	viewpoint 1, 35, 102, 18, 0x00FF00;
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,273,339,3	script	#ep18_オズの出口前_067	10428,7,7,{/* 15899 */
	if(EP18_1QUE >= 31 && EP18_1QUE <= 32) {	//未調査
		cloakoffnpc "マラム#ep18_オズの出口_066";
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ここから^ff0000西^000000に進めば";
		mes "原住民たちが隠れ住む村の";
		mes "入口に到着します。";
		mes "さあ、行きましょう。";
		viewpoint 1, 35, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "マラム#ep18_オズの出口_066";
	}
	end;
OnTouch:
	if(EP18_1QUE == 31) {
		cloakoffnpc "マラム#ep18_オズの出口_066";
		cutin "ep18_maram_01.png", 2;
		set EP18_1QUE,32;
		delquest 11720;
		setquest 11721;
		mes "[マラム]";
		mes "ふぅ……";
		mes "無事に抜けられましたね。";
		mes "ここまで来れば、もう少しです。";
		next;
		//@showevent 0, 1;	// 6822: 35, 102
		mes "[マラム]";
		mes "ここから^ff0000西^000000に進めば";
		mes "原住民たちが隠れ住む村の";
		mes "入口に到着します。";
		mes "さあ、行きましょう。";
		viewpoint 1, 35, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "マラム#ep18_オズの出口_066";
		end;
	}
	else if(EP18_1QUE == 32) {
		cloakoffnpc "マラム#ep18_オズの出口_066";
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ここから^ff0000西^000000に進めば";
		mes "原住民たちが隠れ住む村の";
		mes "入口に到着します。";
		mes "さあ、行きましょう。";
		viewpoint 1, 35, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "マラム#ep18_オズの出口_066";
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 31)
		showevent 0, 1, "#ep18_オズの出口前_067";
	else
		showevent 9999,0,"#ep18_オズの出口前_067";
	end;
}
gw_fild01.gat,35,102,5	script	マラム#ep18_gw_068	10376,{/* 15900 */
	if(EP18_1QUE == 32) {
		mes "[キャンパー]";
		mes "ふあわぁぁぁ～～。";
		mes "たまには、こんなキャンピングも";
		mes "悪くないね～。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "お～～い！";
		mes "……あれぇ？";
		mes "いつもと反応が違うな……。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "私だよ、私！";
		mes "ほら、貴方の知り合いの！";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[キャンパー]";
		mes "ん～～～新手の詐欺師かな？";
		next;
		cloakoffnpc "ミリアム#ep18_gw_069";
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "詐欺師っぽくはあるね。";
		mes "けど、冗談に付き合ってるほど";
		mes "ボクたちに時間的な余裕は無いはずだよ。";
		mes "知ってるでしょ？";
		next;
		cutin "ep18_miriam_03.png", 255;
		mes "[キャンパー]";
		mes "さあ……何のことやら？";
		next;
		cloakoffnpc "イムリル#ep18_gw_071";
		cutin "ep18_imril_02.png", 0;
		mes "[イムリル]";
		mes "キミたちを通すつもりは無いってさ。";
		mes "じゃあ、おいらは先に行くよ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "あっ!!";
		mes "もしかして、知らない人たちと";
		mes "一緒だからってこと？";
		mes "イムリル！　ちょっと待ってくれよ!!";
		set EP18_1QUE,33;
		delquest 11721;
		setquest 11722;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 33) {
		cutin "ep18_maram_01.png", 2;
		cloakoffnpc "イムリル#ep18_gw_071";
		mes "[マラム]";
		mes "あっ!!";
		mes "もしかして、知らない人たちと";
		mes "一緒だからってこと？";
		mes "イムリル！　ちょっと待ってくれよ!!";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 34) {
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "スアド、遅いなぁ。";
		mes "イムリルは、ちゃんと物資の件も";
		mes "伝えてくれたのかなぁ。";
		next;
		cutin "ep18_miriam_03.png", 0;
		cloakoffnpc "ミリアム#ep18_gw_069";
		mes "[ミリアム]";
		mes "……もしダメだったら";
		mes "ラヘルに帰るしかないよ。";
		mes "最悪の場合、もう二度とボクたちを";
		mes "村に入れない可能性だってある。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "そんな無茶な！";
		mes "まとまった物資を調達できるのは";
		mes "私たちだけだ！";
		mes "必要なら、外から来た人間を";
		mes "受け入れないと！";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "マラムは……相変わらずだよね。";
		mes "言ってることはわかるけど";
		mes "彼らがどんな目に遭ってきたか……";
		mes "キミは……みんなと違って";
		mes "幸せ過ぎたんだ。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "私は……原住民のみんなのことを";
		mes "理解したいし……";
		mes "理解し合えると思っている。";
		mes "理想論だ楽観的だと言われても";
		mes "……私は諦めない。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "……ゴメン。";
		mes "そんなつもりはなかったんだ。";
		mes "ボクだって、みんなのことを……。";
		next;
		cutin "ep18_suad_01.png", 1;
		cloakoffnpc "スアド#ep18_gw_070";
		mes "[スアド]";
		mes "己が楽観的な性格だと知ってるのなら";
		mes "もう少し慎重に行動したらどうだ？";
		mes "いい加減大人になれ、マラム。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ああ～スアド！";
		mes "来てくれないんじゃないかって";
		mes "心配してたんだ！";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[スアド]";
		mes "……勘違いするなよ。";
		mes "今までの付き合いがあるから";
		mes "別れの挨拶をしに来ただけだ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "スアドに相談せず";
		mes "よそ者を連れて来たことは謝るよ！";
		mes "私が軽率だった！";
		mes "本当にごめん！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "でも、この冒険者様は";
		mes "母上が大事な仕事を任せるほど";
		mes "信頼のおける方なんだ。";
		mes "だから何も心配はいらない！";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "ニルエン大神官が信用しているから";
		mes "俺たちも同じように信用するとでも";
		mes "思っているのか？";
		mes "これだから楽観主義者は……。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "むぐ……。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "スアドの方こそ現実を見なよ！";
		next;
		cutin "ep18_suad_04.png", 1;
		mes "[スアド]";
		mes "なに……？";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "ラヘルの今の状況を知ってるだろ？";
		mes "原住民に対する感情が";
		mes "今までになく悪化していて";
		mes "村に送る物資を集めるのだって";
		mes "簡単じゃないんだ。";
		next;
		mes "[ミリアム]";
		mes "オズの迷路だって";
		mes "以前ほど安全じゃなくなってる。";
		mes "何か手を打たないと";
		mes "村に必要な物資が届かなくて";
		mes "みんな飢えちゃうんじゃないの？";
		next;
		mes "[ミリアム]";
		mes "掟を守ることが現実的だって言うなら";
		mes "村のみんなは餓死するしかないよ。";
		mes "……スアドは、それで良いって言うの！";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "ミリアム……。";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "……なら聞くが";
		mes "解決策があるのか？";
		mes "具体的で現実的な解決策だ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "母上の考えておられる";
		mes "移住の民と原住民の関係が修復されれば";
		mes "オズの峡谷に橋だって再建できる。";
		next;
		mes "[マラム]";
		mes "そうすれば、今よりも簡単に";
		mes "必要な物資を村に運び込めるよ。";
		mes "食べ物だって薬だって";
		mes "不足することはなくなるはずだ。";
		next;
		mes "[マラム]";
		mes "そして、こちらの冒険者様は母上の依頼で";
		mes "移住の民と原住民との関係を";
		mes "修復するために動いておられる。";
		next;
		mes "[マラム]";
		mes strcharinfo(0)+"様を";
		mes "ここにお連れしたのは";
		mes "原住民の置かれている状況を";
		mes "知ってもらう為なんだ。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "だから……";
		mes "私が二度と村に入れなくなっても良いから";
		mes strcharinfo(0)+"様と";
		mes "荷物を村に入れる許可が欲しい！";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "…………";
		mes "………。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "……それのどこが具体的で";
		mes "現実的な解決策なんだ？";
		mes "お前は相変わらずだ……マラム。";
		next;
		mes "[スアド]";
		mes "…………冒険者。";
		mes "物資を運んできてくれたこと感謝する。";
		mes "礼は用意できないが代わりに";
		mes "村に入ることを許可しよう。";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "ニルエン大神官が俺たちに";
		mes "機会を与えたように……";
		mes "お前に何かできるというなら";
		mes "それを俺たちに証明してみせろ。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "……マラム、ミリアム。";
		mes "お前たちもさっさと中に入れ。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "え……本当？";
		mes "本当に村に入って良いの？";
		mes "嘘……じゃないよね？";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "やったーーー！";
		mes "さっすがスアドおにいちゃん！";
		mes "おにいちゃん大好きーー！";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[スアド]";
		mes "……やっぱりこいつは通すな。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "はぁ……";
		mes "マラムのことは、放っておいて";
		mes "村に入ろう、冒険者さん。";
		mes "スアドの気が変わらないうちにね。";
		set EP18_1QUE,35;
		delquest 11723;
		setquest 11724;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "ミリアム#ep18_gw_069";
		cloakonnpc "スアド#ep18_gw_070";
		warp "wolfvill.gat", 152, 113;
		end;
	}
	if(EP18_1QUE == 35) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "スアドの気が変わらないうちに";
		mes "村に入りましょう！";
		close2;
		cutin "ep18_maram_01.png", 255;
		warp "wolfvill.gat", 152, 113;
		end;
	}
	if(EP18_1QUE >= 36) {
		mes "[マラム]";
		mes "ふぅ～。";
		mes "焚き火でもしてみようかなぁ。";
		cutin "ep18_maram_01.png", 2;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 32 || EP18_1QUE == 34 || EP18_1QUE == 35)
		showevent 0, 1, "マラム#ep18_gw_068";
	else
		showevent 9999,0,"マラム#ep18_gw_068";
	end;
}
gw_fild01.gat,36,103,5	script	ミリアム#ep18_gw_069	10377,{/* 15901 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,41,103,5	script	スアド#ep18_gw_070	10378,{/* 15902 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,37,105,0	script	#ep180_gw_fild01_1	139,{/* 15903 */}
gw_fild01.gat,37,105,5	script	イムリル#ep18_gw_071	10379,{/* 15904 (cloaking)*/
	if(EP18_1QUE == 33) {
		cutin "ep18_imril_02.png", 0;
		mes "[イムリル]";
		mes "「よそ者を入れるべからず」";
		mes "それが、この村の掟でしょ？";
		mes "よそ者を連れて来たマラムたちを";
		mes "村に入れるわけにはいかないって。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……掟のことは知ってるよ。";
		mes "でも今回はいろいろ事情があって。";
		mes "そうだ「^0000FFスアド^000000」を呼んできてくれ。";
		mes "それぐらい良いだろ！";
		next;
		cutin "ep18_imril_01.png", 0;
		mes "[イムリル]";
		mes "……あ、もしかして";
		mes "「スアド」にも連絡してなかったの？";
		mes "あちゃ～～～。";
		mes "それじゃあ、なおさら無理だよ。";
		next;
		cutin "ep18_imril_03.png", 0;
		mes "[イムリル]";
		mes "……さっき助けてもらったから";
		mes "スアドに声は掛けてみるよ。";
		mes "でも、期待しないでくれ。";
		mes "あの掟に厳しいスアドのことだからさ。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "ラヘルで仕入れた物資を運んできたと";
		mes "伝えてくれれば望みはある。";
		mes "……た、たぶん。";
		next;
		cutin "ep18_miriam_03.png", 1;
		mes "[ミリアム]";
		mes "詰めが甘かったな。";
		mes "まさか、村の入口まで来て";
		mes "入れさせてもらえないなんて";
		mes "思ってなかった。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "すいませんでした";
		mes strcharinfo(0)+"様。";
		mes "原住民が隠れて暮らしている為、";
		mes "よそから来た人間に対して";
		mes "非常に敏感なんです。";
		next;
		mes "[マラム]";
		mes "とにかく「スアド」……";
		mes "村でリーダー的な立場の人間ですが";
		mes "彼をなんとかして説得しないと。";
		mes "……来てくれると良いのですが。";
		set EP18_1QUE,34;
		delquest 11722;
		setquest 11723;
		close2;
		cloakonnpc "イムリル#ep18_gw_071";
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 34) {
		//未調査
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 33)
		showevent 0, 1, "イムリル#ep18_gw_071";
	else
		showevent 9999,0,"イムリル#ep18_gw_071";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,39,100,5	script	異国の商人#ep18_gw2_072	10380,{/* 15905 */}
gw_fild01.gat,34,96,3	script	異国の商人#ep18_gw3_073	10380,{/* 15906 */}

wolfvill.gat,143,114,5	script	マラム#ep18_wv_074	10376,{/* 15907 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,145,114,5	script	ミリアム#ep18_wv_075	10377,{/* 15908 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,113,5	script	イムリル#ep18_wv_076	10379,{/* 15909 */
	if(EP18_1QUE == 35) {
		cutin "ep18_imril_03.png", 0;
		mes "[イムリル]";
		mes "うわぁ～～～！";
		mes "え？　マジ!?";
		mes "マジで村に入れたの？";
		mes "あのカタブツがよそ者を";
		mes "村に招き入れるなんて！";
		next;
		cloakoffnpc "ミリアム#ep18_wv_075";
		cloakoffnpc "マラム#ep18_wv_074";
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "ヒドイ物言いだね。";
		mes "物資が届かない方が良かった？";
		next;
		cutin "ep18_imril_04.png", 0;
		mes "[イムリル]";
		mes "あ、ごめんて！";
		mes "そんなわけはないよ！";
		mes "歓迎するよウェルカーム！";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "調子が良いな……";
		mes "まあ、それだけ村の状況が";
		mes "切羽詰まっているんだろうけど。";
		next;
		cutin "ep18_imril_01.png", 0;
		mes "[イムリル]";
		mes "そういう事。";
		mes "スアドも口には出してないだろうけど";
		mes "現状には頭を抱えているはずさ。";
		mes "誰よりも責任感強いから。";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[スマートエリー]";
		mes "……ピピ！";
		mes "『周囲の状況を確認。";
		mes "　樹木が石のように固い模様……";
		mes "　いえ、これは樹木ではなく石です。";
		mes "　この環境で自給自足は不可能です』";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "今回の荷物の運び入れで";
		mes "少しでも余裕ができると良いんだけど……";
		mes "さて、それでは冒険者様。";
		mes "村を見て回りましょう。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ここに暮らす原住民たちの話を聞いて";
		mes "信頼関係を築くことができれば";
		mes "問題解決のきっかけになるかも";
		mes "しれませんからね。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "‐「灰色の子供達」の協力もあり";
		mes "　灰色狼の村の住民と";
		mes "　対話する機会が得られた。";
		mes "　ニルエンの頼みを解決するためにも";
		mes "　住民の話を聞いて周り";
		mes "　信頼関係を築こう‐";
		set EP18_1QUE,36;
		delquest 11724;
		setquest 11718;
		setquest 130101;
		setquest 130102;
		setquest 130103;
		setquest 130104;
		setquest 130105;
		setquest 130106;
		setquest 130107;
		setquest 130108;
		setquest 130109;
		setquest 130110;
		setquest 130111;
		setquest 130112;
		setquest 130113;
		setquest 130114;
		cloakonnpc "ミリアム#ep18_wv_075";
		cloakonnpc "マラム#ep18_wv_074";
		close;
	}
	if(EP18_1QUE >= 36) {
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "よう！";
		mes strcharinfo(0);
		mes "村のみんなとは馴染めてるかい？";
		next;
		switch(select("手伝えることはない？","灰色狼の村の人達はどう思っている？","用はない")) {
		case 1:
			if(checkquest(11735)) {
				cutin "ep18_imril_02.png", 2;
				mes "[イムリル]";
				mes "うぅぅ……";
				mes "肌がチクチクする。";
				mes "日焼けしたみたいだ。";
				next;
				cutin "ep18_suad_03.png", 0;
				mes "[スアド]";
				mes "聞いたぞ、イムリル。";
				mes "迷路の奥まで行ったそうだな？";
				mes "よく無事に戻ってこれたものだ。";
				next;
				cutin "ep18_imril_01.png", 2;
				mes "[イムリル]";
				mes "はん！　こちらの冒険者さんに";
				mes "一緒に来てもらったんだ。";
				mes "誰も迷路の奥を調べようとしないからさ。";
				next;
				cutin "ep18_suad_01.png", 0;
				mes "[スアド]";
				mes "まったく……無茶をするな。";
				next;
				cutin "ep18_imril_04.png", 2;
				mes "[イムリル]";
				mes "心配してくれて、ありがとうよ。";
				mes "てか、やっぱり状況は良くなかった。";
				mes "溶岩地域が徐々に広がってる。";
				mes "このままじゃいずれ迷路は使えなくなる。";
				next;
				cutin "ep18_suad_01.png", 0;
				mes "[スアド]";
				mes "本当か？";
				mes "……何かしら対策が必要だな。";
				mes "まずはモンスターを駆除して";
				mes "安全を確保したいところだな。";
				next;
				cutin "ep18_imril_04.png", 2;
				mes "[イムリル]";
				mes "お！";
				mes "スアドもようやく事態の深刻さに";
				mes "気付いてくれたみたいだ。";
				mes "無茶した甲斐があったかな。";
				next;
				cutin "ep18_imril_02.png", 2;
				mes "[イムリル]";
				mes "これも冒険者さんのおかげだよ。";
				mes "ありがとう。";
				mes "まだまだ問題は山積みだなぁ。";
				next;
				mes "[イムリル]";
				mes "品を運ぶにも、溶岩の対処をするにも";
				mes "ネックとなるのはモンスターだな。";
				mes "一匹残らず駆逐できたらいいけど、";
				mes "どうすればいいんだろう？";
				cutin "ep18_imril_01.png", 2;
				next;
				cutin "ep18_imril_03.png", 2;
				mes "[イムリル]";
				mes "……冒険者さん。";
				mes "これからも手伝ってくれない？";
				mes "今度は報酬も用意するからさ。";
				next;
				menu "引き受ける",-,"仕方ない",-;
				cutin "ep18_imril_04.png", 2;
				mes "[イムリル]";
				mes "本当！？　今度は";
				mes "^e5555e「ホットモル」を「15」体^000000";
				mes "退治して欲しい。";
				mes "オズの迷路の中でも";
				mes "行商人たちにとって";
				mes "迷惑なモンスターなんだ！頼むよ！";
				delquest 11735;
				setquest 11738;
				close2;
				cutin "ep18_imril_04.png", 255;
				end;
			}
			if(checkquest(11725)) {
				//未調査
				close;
			}
			if(checkquest(130114)) {
				cutin "ep18_imril_03.png", 2;
				mes "[イムリル]";
				mes "そういえば、「オズの迷路」では";
				mes "おいらを助けてくれてありがとう。";
				mes "ちゃんとお礼してなかったからさ。";
				next;
				cutin "ep18_imril_02.png", 2;
				mes "[イムリル]";
				mes "以前なら、一人でも通れたのに";
				mes "段々と一人で通るのが難しくなってる。";
				mes "溶岩とモンスターが増えてきたことが";
				mes "原因だと思う。";
				mes "理由はさっぱりわからないけどね。";
				next;
				mes "[イムリル]";
				mes "実は、迷路の奥を調査しようと思ってる。";
				mes "けど一人じゃ危険だし";
				mes "だからと言って、村は人手不足で";
				mes "誰も手伝ってくれない。";
				next;
				mes "[イムリル]";
				mes "……冒険者さんは強いよね。";
				mes "おいらを手伝ってくれない？";
				mes "暇な時でいいからさ。";
				mes "村の為だと思ってさ。";
				next;
				if(select("今すぐ出発しよう","今は暇じゃない") == 2) {
					cutin "ep18_imril_02.png", 2;
					mes "[イムリル]";
					mes "ですよねー……";
					mes "はぁ、誰か手を貸してくれないかなぁ。";
					close2;
					cutin "ep18_imril_02.png", 255;
					end;
				}
				cutin "ep18_imril_03.png", 2;
				mes "[イムリル]";
				mes "え？　マジ!?";
				mes "今すぐで良いの？";
				mes "こんなにあっさり引き受けてくれるなんて";
				mes "ちょっと感動した。";
				next;
				mes "[イムリル]";
				mes "じゃあ、「^0000FFオズの迷路^000000」の入口で";
				mes "落ち合おうか。";
				mes "場所は、覚えてるよね？";
				mes "よろしく！";
				delquest 130114;
				setquest 11725;
				close2;
				cutin "ep18_imril_03.png", 255;
				end;
			}
			mes "[イムリル]";
			mes "品を運ぶにも、溶岩の対処をするにも";
			mes "ネックとなるのはモンスターだな。";
			mes "一匹残らず駆逐できたら";
			mes "いいんだけど。";
			cutin "ep18_imril_01.png", 2;
			next;
			cutin "ep18_imril_03.png", 2;
			mes "[イムリル]";
			mes "どう、冒険者さん。";
			mes "モンスターの数を減らしたいんだけど";
			mes "手伝ってくれない？";
			mes "報酬も用意するからさ。";
			next;
			if(select("引き受ける","やめておく") == 2) {
				mes "[イムリル]";
				mes "なに、忙しいの？";
				mes "それなら、仕方ないかぁ。";
				cutin "ep18_imril_02.png", 2;
				close2;
				cutin "ep18_imril_02.png", 255;
				end;
			}
			if(checkquest(11739)) {
				mes "[イムリル]";
				mes "今日は、お疲れ様。";
				mes "村は人手が少ないからさ。";
				mes "明日も手伝ってくれると助かるよ。";
				cutin "ep18_imril_04.png", 2;
				close2;
				cutin "ep18_imril_04.png", 255;
				end;
			}
			if(checkquest(11738)&4) {
				delquest 11738;
				setquest 11739;
				getitem 1000405,4;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				setquest 130134;
				compquest 130134;
				mes "[イムリル]";
				mes "もう終わったの!?";
				mes "さすが、凄腕冒険者さん！";
				mes "ほんとうに助かるよ。";
				mes "さあ、報酬を受け取って。";
				cutin "ep18_imril_04.png", 2;
				close2;
				cutin "ep18_imril_04.png", 255;
				end;
			}
			mes "[イムリル]";
			mes "^e5555e「ホットモル」を「15」体^000000";
			mes "退治して欲しい。";
			mes "少しでもモンスターの数が減れば";
			mes "迷路を通る行商人たちも";
			mes "安全に行き来できるようになるから。";
			close2;
			cutin "ep18_imril_03.png", 255;
			end;
		case 2:
			mes "[イムリル]";
			mes "おいらから見た";
			mes "村の人々からの信頼度は……";
			mes "こんなとこだな！";
			mes "";
			mes "【灰色狼の村信頼度】";
			mes "□□□□□□□□□□□□□□";
			next;
			if(EP18_1QUE >= 37) {
				mes "[イムリル]";
				mes "もうすっかり村のみんな";
				mes strcharinfo(0)+"のこと";
				mes "同じ村の住民だと思ってるよ！";
				if(EP18_1QUE == 37) {
					next;
					unittalk getnpcid(0,"村の少年#区別_077"),"村の少年 : 冒険者さん、大会議がはじまるよ！冒険者さんの席もあるんだって！";
					emotion 12,"村の少年#区別_077";
					mes "[イムリル]";
					mes "ほら、^ff0000大会議^000000の席まで";
					mes "用意されたってさ。";
					mes "せっかくだし、";
					mes "そこの少年に詳しく聞いてあげてよ。";
				}
				close2;
				cutin "ep18_imril_01.png", 255;
				end;
			}
			mes "[イムリル]";
			mes "村のみんなの悩みを解決すれば、";
			mes "信頼を得られるんじゃないかな？";
			mes "村の^ff0000大会議^000000に";
			mes "招待されるくらいになれば、";
			mes "村のメンバーとして";
			mes "十分認められた証さ。";
			next;
			cutin "ep18_imril_01.png", 255;
			mes "‐住民の話を聞いて周り";
			mes "　信頼関係を築こう‐";
			close2;
			cutin "ep18_imril_01.png", 255;
			end;
		case 3:
			mes "[イムリル]";
			mes "なに、忙しいの？";
			mes "それなら、仕方ないかぁ。";
			cutin "ep18_imril_02.png", 2;
			close2;
			cutin "ep18_imril_02.png", 255;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 35)
		showevent 0, 1, "イムリル#ep18_wv_076";
	else if(checkquest(130114))
		showevent 0, 3, "イムリル#ep18_wv_076";
	else
		showevent 9999,0,"イムリル#ep18_wv_076";
	end;
}
wolfvill.gat,141,123,3	script	村の少年#区別_077	944,{/* 15910 */
	if(EP18_1QUE == 37) {
		mes "[少年]";
		mes "間もなく^ff0000大会議^000000が始まるよ！";
		mes "村のメンバーが全員参加する会議だよ！";
		next;
		mes "[少年]";
		mes "あっ！　冒険者の人！";
		mes "冒険者の席もあるんだって！";
		mes "村のメンバーとして";
		mes "認められたってことですね！";
		next;
		mes "[少年]";
		mes "さあ、冒険者の人！";
		mes "ここから^ff0000北^000000に皆が集まってるので、";
		mes "早く向かってください！";
		set EP18_1QUE,38;
		delquest 18082;
		setquest 16567;
		close2;
		cloakoffnpc "スアド#1_079";
		cloakoffnpc "ミリアム#1_080";
		cloakoffnpc "マラム#1_082";
		cloakoffnpc "熱血青年#過激派1_083";
		cloakoffnpc "過激派の若者#過激派2_08";
		cloakoffnpc "豪快な青年#過激派3_085";
		cloakoffnpc "血の気の多い青年#過激派";
		cloakoffnpc "怒った青年#過激派5_087";
		cloakoffnpc "地着きの老人#老年層1_08";
		cloakoffnpc "慌てる壮年#老年層2_089";
		cloakoffnpc "内気な壮年#老年層3_090";
		cloakoffnpc "臆病な老人#老年層4_091";
		cloakoffnpc "熱血壮年#武器所持者1_09";
		cloakoffnpc "弱気な青年#中立派1_093";
		cloakoffnpc "無口な青年#中立派2_094";
		cloakoffnpc "中立派の青年#中立派3_09";
		cloakoffnpc "過激派の青年#過激派2_09";
		end;
	}
	if(EP18_1QUE == 38) {
		mes "[少年]";
		mes "さあ、冒険者の人！";
		mes "ここから^ff0000北^000000に皆が集まってるので、";
		mes "早く向かってください！";
		mes "大会議が始まりますよ！";
		close2;
		cloakoffnpc "スアド#1_079";
		cloakoffnpc "ミリアム#1_080";
		cloakoffnpc "マラム#1_082";
		cloakoffnpc "熱血青年#過激派1_083";
		cloakoffnpc "過激派の若者#過激派2_08";
		cloakoffnpc "豪快な青年#過激派3_085";
		cloakoffnpc "血の気の多い青年#過激派";
		cloakoffnpc "怒った青年#過激派5_087";
		cloakoffnpc "地着きの老人#老年層1_08";
		cloakoffnpc "慌てる壮年#老年層2_089";
		cloakoffnpc "内気な壮年#老年層3_090";
		cloakoffnpc "臆病な老人#老年層4_091";
		cloakoffnpc "熱血壮年#武器所持者1_09";
		cloakoffnpc "弱気な青年#中立派1_093";
		cloakoffnpc "無口な青年#中立派2_094";
		cloakoffnpc "中立派の青年#中立派3_09";
		cloakoffnpc "過激派の青年#過激派2_09";
		end;
	}
	mes "[少年]";
	mes "村の決め事は「^ff0000大会議^000000」で";
	mes "決めているんです。";
	next;
	mes "[少年]";
	mes "村のメンバーが全員参加する";
	mes "とっても大切な会議なんですよ！";
	mes "村のメンバーとして認められない人は";
	mes "参加することができませんけどね。";
	next;
	mes "[少年]";
	mes "もし参加したいって言うなら";
	mes "頑張って村の人たちから";
	mes "信頼を得てください！";
	close;
OnQuestInfo:
	if(EP18_1QUE == 37)
		showevent 0, 1, "村の少年#区別_077";
	else
		showevent 9999,0,"村の少年#区別_077";
	end;
}
wolfvill.gat,146,148,0	script	#大会議1_078	139,14,14,{/* 15911 */
	if(EP18_1QUE >= 38 && EP18_1QUE <= 40) {
		cloakoffnpc "スアド#1_079";
		cloakoffnpc "ミリアム#1_080";
		cloakoffnpc "マラム#1_082";
		cloakoffnpc "熱血青年#過激派1_083";
		cloakoffnpc "過激派の若者#過激派2_08";
		cloakoffnpc "豪快な青年#過激派3_085";
		cloakoffnpc "血の気の多い青年#過激派";
		cloakoffnpc "怒った青年#過激派5_087";
		cloakoffnpc "地着きの老人#老年層1_08";
		cloakoffnpc "慌てる壮年#老年層2_089";
		cloakoffnpc "内気な壮年#老年層3_090";
		cloakoffnpc "臆病な老人#老年層4_091";
		cloakoffnpc "熱血壮年#武器所持者1_09";
		cloakoffnpc "弱気な青年#中立派1_093";
		cloakoffnpc "無口な青年#中立派2_094";
		cloakoffnpc "中立派の青年#中立派3_09";
		cloakoffnpc "過激派の青年#過激派2_09";
	}
	else if(EP18_1QUE == 41) {
		cloakoffnpc "スアド#1_079";
		cloakoffnpc "ミリアム#1_080";
		cloakoffnpc "マラム#1_082";
		cloakonnpc "熱血青年#過激派1_083";
		cloakonnpc "過激派の若者#過激派2_08";
		cloakoffnpc "豪快な青年#過激派3_085";
		cloakonnpc "血の気の多い青年#過激派";
		cloakonnpc "怒った青年#過激派5_087";
		cloakonnpc "地着きの老人#老年層1_08";
		cloakonnpc "慌てる壮年#老年層2_089";
		cloakonnpc "内気な壮年#老年層3_090";
		cloakonnpc "臆病な老人#老年層4_091";
		cloakonnpc "熱血壮年#武器所持者1_09";
		cloakonnpc "弱気な青年#中立派1_093";
		cloakonnpc "無口な青年#中立派2_094";
		cloakonnpc "中立派の青年#中立派3_09";
		cloakoffnpc "過激派の青年#過激派2_09";
	}
	else if(EP18_1QUE == 42) {
		cloakonnpc "スアド#1_079";
		cloakonnpc "ミリアム#1_080";
		cloakonnpc "マラム#1_082";
		cloakonnpc "熱血青年#過激派1_083";
		cloakonnpc "過激派の若者#過激派2_08";
		cloakoffnpc "豪快な青年#過激派3_085";
		cloakonnpc "血の気の多い青年#過激派";
		cloakonnpc "怒った青年#過激派5_087";
		cloakonnpc "地着きの老人#老年層1_08";
		cloakonnpc "慌てる壮年#老年層2_089";
		cloakonnpc "内気な壮年#老年層3_090";
		cloakonnpc "臆病な老人#老年層4_091";
		cloakonnpc "熱血壮年#武器所持者1_09";
		cloakonnpc "弱気な青年#中立派1_093";
		cloakonnpc "無口な青年#中立派2_094";
		cloakonnpc "中立派の青年#中立派3_09";
		cloakoffnpc "過激派の青年#過激派2_09";
	}
	else {
		cloakonnpc "スアド#1_079";
		cloakonnpc "ミリアム#1_080";
		cloakonnpc "マラム#1_082";
		cloakonnpc "熱血青年#過激派1_083";
		cloakonnpc "過激派の若者#過激派2_08";
		cloakonnpc "豪快な青年#過激派3_085";
		cloakonnpc "血の気の多い青年#過激派";
		cloakonnpc "怒った青年#過激派5_087";
		cloakonnpc "地着きの老人#老年層1_08";
		cloakonnpc "慌てる壮年#老年層2_089";
		cloakonnpc "内気な壮年#老年層3_090";
		cloakonnpc "臆病な老人#老年層4_091";
		cloakonnpc "熱血壮年#武器所持者1_09";
		cloakonnpc "弱気な青年#中立派1_093";
		cloakonnpc "無口な青年#中立派2_094";
		cloakonnpc "中立派の青年#中立派3_09";
		cloakonnpc "過激派の青年#過激派2_09";
		cloakonnpc "マラム#1_081";
	}
	end;
}
wolfvill.gat,144,151,5	script	スアド#1_079	10378,{/* 15912 (cloaking)*/
	if(EP18_1QUE == 38) {
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "今から「大会議」が開かれる。";
		mes "……冒険者、お前の席も用意しておいた。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "さっすが冒険者様！";
		mes "みんな、貴方に期待してるんですよ。";
		mes "よっ！　希望の星！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "マラムは、浮かれ過ぎ……";
		mes "よほど冒険者様が";
		mes "「大会議」に席を用意されたのが";
		mes "嬉しいのかな。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "開始までには、まだ時間がある。";
		mes "それまで集まった村人たちの話を";
		mes "聞いておいたらどうだ？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "それは良い考えです。";
		mes "聞いて回っている間に";
		mes "会議が始まるでしょうからね。";
		set EP18_1QUE,39;
		delquest 16567;
		setquest 16568;
		setquest 16569;
		setquest 16570;
		setquest 16571;
		close2;
		showevent 0, 1, "熱血青年#過激派1_083";	// 2318: 145, 146
		showevent 0, 1, "地着きの老人#老年層1_08";	// 2323: 139, 148
		showevent 0, 1, "熱血壮年#武器所持者1_09";	// 2327: 150, 147
		showevent 0, 1, "弱気な青年#中立派1_093";	// 2328: 152, 145
		cutin "ep18_suad_01.png", 255;
		end;
	}
	if(EP18_1QUE == 39) {
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "開始までには、まだ時間がある。";
		mes "それまで集まった村人たちの話を";
		mes "聞いておいたらどうだ？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "それは良い考えです。";
		mes "聞いて回っている間に";
		mes "会議が始まるでしょうからね。";
		close2;
		cutin "ep18_suad_01.png", 255;
		end;
	}
	if(EP18_1QUE == 40) {
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "準備が整ったようだな……";
		mes "では、これから「大会議」を始める。";
		mes "今回の議題は、この村の今後についてだ。";
		next;
		mes "[スアド]";
		mes "説明は不要だろうが";
		mes "あえて言わせてもらう。";
		mes "……この村の状況は極めて厳しい。";
		next;
		mes "[スアド]";
		mes "街を追われ、この村にたどり着く者は";
		mes "増える一方だが";
		mes "食料や薬といった生活に必要な物資は";
		mes "十分に足りているとは言えない。";
		next;
		mes "[スアド]";
		mes "現状を鑑み";
		mes "今後どうしていくべきか……";
		mes "難しい問題だが、だからこそ";
		mes "ここに集まった皆の知恵を貸して欲しい。";
		mes "意見があれば自由に発言してくれ。";
		next;
		cutin "ep18_suad_01.png", 255;
		emotion 7,"熱血青年#過激派1_083";
		mes "[熱血青年]";
		mes "ラヘルの移住の民たちに";
		mes "思い知らせてやろう！";
		mes "奴らの神殿を破壊するんだ！";
		unittalk getnpcid(0,"過激派の若者#過激派2_08"),"過激派の若者 : そうだ！そうだ！";
		unittalk getnpcid(0,"血の気の多い青年#過激派"),"血の気の多い青年 : 全部壊してしまえ！！";
		next;
		mes "[地着きの老人]";
		mes "我らは貧しいとは言え";
		mes "今までこの村で平和にやって来た。";
		mes "いきなり神殿を破壊するなどというのは";
		mes "あまりに暴力的すぎる。";
		unittalk getnpcid(0,"臆病な老人#老年層4_091"),"臆病な老人 : そうじゃ。短絡的すぎるわい。";
		next;
		emotion 7,"熱血青年#過激派1_083";
		mes "[熱血青年]";
		mes "いつまでこんな猫の額みたいな場所に";
		mes "隠れているつもりなんだ！";
		mes "食い物も薬も何もかもが";
		mes "足りていないのに！";
		next;
		mes "[熱血青年]";
		mes "この地は元々原住民のものだ！";
		mes "それを取り戻す時が来たんだよ！";
		unittalk getnpcid(0,"過激派の若者#過激派2_08"),"過激派の若者 : 奪うんじゃない！　取り戻すんだ！";
		unittalk getnpcid(0,"血の気の多い青年#過激派"),"血の気の多い青年 : そうだ、これは正当な闘争だ！";
		next;
		mes "[地着きの老人]";
		mes "口で言うのは簡単じゃが";
		mes "争えば血が流れ、大勢の仲間が死ぬ。";
		mes "いったいそれで何を得ようというのか？";
		unittalk getnpcid(0,"内気な壮年#老年層3_090"),"内気な壮年 : 戦の経験もないヤツは……わかってない。";
		next;
		mes "[過激派の若者]";
		mes "今まで俺たちが血を流してないと？";
		mes "流して来たさ！　たくさんの血と涙をな！";
		mes "街でどんな目に遭ってきたと";
		mes "思ってるんだ！";
		unittalk getnpcid(0,"過激派の青年#過激派2_09"),"過激派の青年 : 臆病者たちめ！";
		unittalk getnpcid(0,"怒った青年#過激派5_087"),"怒った青年 : お前らはみんな、迫害する側と同じだ！";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……随分とヒートアップしてきたな。";
		mes "スアド……？";
		next;
		cutin "ep18_suad_03.png", 1;
		emotion 9,"スアド#1_079";
		mes "[スアド]";
		mes "…………";
		mes "……。";
		next;
		cutin "ep18_suad_03.png", 255;
		mes "[過激派の若者]";
		mes "俺たちはもう十分に耐えた！";
		mes "偽りの女神を妄信する奴らには";
		mes "俺たちが天罰をくれてやる！";
		next;
		mes "[慌てる壮年]";
		mes "ヤケになることしかできない青二才め！";
		mes "我々が隠れている理由を考えろ！";
		mes "全員で心中するつもりか!?";
		next;
		mes "[熱血青年]";
		mes "隠れる事でしか";
		mes "その安っぽい命を";
		mes "守れなかったんだろ！";
		mes "俺たちは違うぞ！";
		mes "命を懸けて戦う覚悟ができてるんだ！";
		next;
		cutin "ep18_suad_01.png", 1;
		emotion 1,"スアド#1_079";
		mes "[スアド]";
		mes "そこまでだ！";
		mes "ここは、お互いの怒りをぶつけあうために";
		mes "用意した場ではない。";
		mes "互いに結束を固め";
		mes "より良い未来を築くための場だ。";
		next;
		cutin "ep18_suad_01.png", 255;
		emotion 7,"熱血青年#過激派1_083";
		mes "[熱血青年]";
		mes "より良い未来を築くために";
		mes "邪魔者を打倒しろって言ってるんです！";
		mes "まさかスアドさんも";
		mes "あんな敗北主義者の味方なんですか？";
		next;
		mes "[慌てる壮年]";
		mes "知識も経験も足りない青二才が";
		mes "騒ぎ立てているだけです！";
		mes "事を荒立てるだけ荒立てて";
		mes "我々を破滅させようとしているんだ！";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "……いい加減にしろ。";
		mes "俺は、どちらにも加担しない。";
		mes "両方の立場と根拠を聞く。";
		unittalk getnpcid(0,"慌てる壮年#老年層2_089"),"慌てる壮年 : ……。";
		unittalk getnpcid(0,"過激派の若者#過激派2_08"),"過激派の若者 : ……。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "その上で、皆が幸せになれる";
		mes "具体的で現実的な方法を模索する。";
		mes "時間は少ない……";
		mes "だが急いで決められることじゃない。";
		next;
		cutin "ep18_suad_03.png", 255;
		mes "[熱血青年]";
		mes "具体的な手段なら、ここにある！";
		mes "この武器がそうだ！";
		mes "　";
		mes "^0000FF‐青年の手には軍隊が持つような";
		mes "　武器が握られている‐^000000";
		next;
		cutin "ep18_maram_03.png", 2;
		emotion 1,"マラム#1_082";
		mes "[マラム]";
		mes "あの武器は……";
		mes "私たちが持ち込んだものとは";
		mes "違うよね……。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "……え……？";
		mes "あの武器は……。";
		next;
		cutin "ep18_suad_03.png", 255;
		mes "[熱血青年]";
		mes "これを見せれば";
		mes "俺たちを一方的に迫害してきた奴らも";
		mes "目が覚めるだろうよ！";
		mes "奴らは、俺たちを牙の無い狼と";
		mes "思ってるんだからな！";
		next;
		mes "^0000FF‐会議に参加していた者全員が";
		mes "　青年の持つ武器に視線を向けた。";
		mes "　高く掲げられた武器から";
		mes "　誰も視線を外すことができない‐^000000";
		next;
		mes "^0000FF‐その様子はまるで武器を……";
		mes "　村の窮地を救う「力」の象徴として";
		mes "　偶像の如く奉じている様に見えたのは";
		mes "　気のせいだったのだろうか……‐^000000";
		next;
		mes "[内気な壮年]";
		mes "ぶ、武力を行使するのは反対だ……";
		mes "だが……俺たちに不満があることを";
		mes "奴らに知らしめる手段があれば……。";
		next;
		mes "[弱気な青年]";
		mes "……武器を使わなくても";
		mes "あの武器を見せて回れば……";
		mes "私たちの決意を示せるのでは……？";
		next;
		mes "[地着きの老人]";
		mes "武力行使には、あくまで反対じゃ。";
		mes "……じゃが……例えば……";
		mes "示威運動……デモに……";
		mes "参加するだけなら……。";
		next;
		mes "[熱血壮年]";
		mes "そうだ！　示威の伴わないデモには";
		mes "なんの意味も無い！";
		mes "派手にやらなきゃ";
		mes "奴らは目は覚まさないんだ！";
		next;
		mes "[慌てる壮年]";
		mes "懸念が無いわけではないが……";
		mes "ううむ……。";
		next;
		cutin "ep18_suad_01.png", 1;
		emotion 0,"スアド#1_079";
		mes "[スアド]";
		mes "ある程度意見が出そろったな。";
		mes "俺たちの意志を示す為に";
		mes "ラヘルでデモを行うというのだな？";
		next;
		cutin "ep18_suad_01.png", 255;
		mes "[熱血青年]";
		mes "おおーー！";
		next;
		mes "[地着きの老人]";
		mes "……方法は詰めねばならんが";
		mes "やるのであれば、参加はするぞ。";
		next;
		mes "[中立派の青年]";
		mes "僕たちにできるかな……";
		mes "でも、大会議で決定された以上は";
		mes "できる限り協力する。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "では、今後の計画に関しては";
		mes "追って会議を行う。";
		mes "これにて今回の大会議は閉会だ。";
		next;
		cloakonnpc "熱血青年#過激派1_083";
		cloakonnpc "無口な青年#中立派2_094";
		cloakonnpc "内気な壮年#老年層3_090";
		cloakonnpc "怒った青年#過激派5_087";
		cloakonnpc "地着きの老人#老年層1_08";
		cloakonnpc "慌てる壮年#老年層2_089";
		cloakonnpc "血の気の多い青年#過激派";
		cloakonnpc "弱気な青年#中立派1_093";
		cloakonnpc "熱血壮年#武器所持者1_09";
		cloakonnpc "過激派の若者#過激派2_08";
		cloakonnpc "中立派の青年#中立派3_09";
		cloakonnpc "臆病な老人#老年層4_091";
		cutin "ep18_suad_01.png", 255;
		mes "^0000FF‐会議の参加者は";
		mes "　各々感じたことを語りながら";
		mes "　大会議を退出していった‐^000000";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "ふぅ……";
		mes "一時はどうなるかと思ったけど";
		mes "……デモ……デモかぁ。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "マラム、スアド。";
		mes "さっきの会議で気になることがある。";
		mes "冒険者さんもボクの話を聞いて欲しい。";
		set EP18_1QUE,41;
		delquest 16572;
		setquest 16573;
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 41) {
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "ミリアムが呼んでいるな。";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 42) {
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "……武器の件は";
		mes "お前たちに任せる。";
		mes "無茶は……するな。";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 38 || EP18_1QUE == 40)
		showevent 0, 1, "スアド#1_079";
	else
		showevent 9999,0,"スアド#1_079";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,148,153,3	script	ミリアム#1_080	10377,{/* 15913 (cloaking)*/
	if(EP18_1QUE == 39) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "大会議の前に";
		mes "いろんな人の話を聞いてみたらどう？";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 40) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "大会議の前に";
		mes "いろんな人の話を聞いてみたらどう？";
		next;
		mes "[ミリアム]";
		mes "あっ。";
		mes "そろそろ始まりそうだね。";
		mes "スアドに声を掛けてみて。";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 41) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "さっきの会議で気になることがある。";
		mes "マラムとスアドは";
		mes "何か気付かなかった？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "んん～～？";
		mes "……あ、もしかして";
		mes "「あの武器」のこと？";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "村で製造している物ではないな。";
		mes "お前たちが持ち込んだんじゃないのか？";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "あんな物騒な物を持ち込んだりはしない。";
		mes "それに、あんな軍隊が持つような武器は";
		mes "一般に流通していないよ。";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "そんなものが、なぜ村にある？";
		mes "ミリアムが気にしてるのは";
		mes "そのことか？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "うん。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "正直に言えば、俺も武器は欲しい。";
		mes "あくまで抑止力としてだが";
		mes "牙を持った狼である必要はある。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "そのおっかない顔で睨みつければ";
		mes "十分に抑止力になりそうな……。";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[スアド]";
		mes "……あぁ？";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "冗談を言い合ってる暇はないんだ。";
		mes "スアドも把握していない方法で村に";
		mes "軍用の武器が流れてきているのは";
		mes "マズいと思わない？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "デモをするにして";
		mes "あんな武器が大量にあったら";
		mes "何が起こるかわからないよ……。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "…………";
		mes "……ミリアムの言いたいことは理解した。";
		mes "俺もそんなことは望んでいない。";
		mes "では、どうする？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "スアドがこの件で動くのは";
		mes "避けた方がいい。";
		mes "スアドは、デモを滞りなく進めるための";
		mes "計画と準備に専念すべきだ。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "というわけで、この件は";
		mes "私とミリアムに任せて欲しい。";
		mes "もちろん、冒険者様も手を貸して";
		mes "くださいますよね？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ボクは別行動を取らせてもらうよ。";
		mes "確認しないといけないことがあるから。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ミリアムがそう言うなら、仕方ない。";
		mes "では、冒険者様。";
		mes "先ほど武器を持っていた人に";
		mes "話を聞きにいきましょう。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "どこから武器を手に入れたのか";
		mes "確かめるんです。";
		mes "心配はいりません。";
		mes "交渉事なら、私の出番ですよ！";
		set EP18_1QUE,42;
		delquest 16573;
		setquest 16574;
		close2;
		cutin "ep18_suad_03.png", 255;
		cloakonnpc "ミリアム#1_080";
		cloakonnpc "マラム#1_082";
		end;
	}
	if(EP18_1QUE == 42) {//未調査
	}
	cutin "ep18_miriam_02.png", 0;
	mes "[ミリアム]";
	mes "スアドが、冒険者さんも";
	mes "大会議に参加しても良いって";
	mes "言ってくれたんだ。";
	next;
	mes "[ミリアム]";
	mes "あのスアドが、外の人間を大会議に";
	mes "参加させるなんて、ビックリだ。";
	mes "……スアドも何か冒険者さんに";
	mes "感じるものがあるのかな。";
	close2;
	cutin "ep18_suad_03.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 41)
		showevent 0, 1, "ミリアム#1_080";
	else
		showevent 9999,0,"ミリアム#1_080";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,148,145,3	script	マラム#1_081	10376,{/* 15914 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,149,152,3	script	マラム#1_082	10376,{/* 15915 (cloaking)*/
	if(EP18_1QUE == 39) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "騒ぐと、ミリアムとスアドが怒るので";
		mes "私は静かにしていますよ。";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 40) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "騒ぐと、ミリアムとスアドが怒るので";
		mes "私は静かにしていますよ。";
		next;
		mes "[マラム]";
		mes "あ！";
		mes "会議が始まりそうです。";
		mes "スアドに声を掛けください。";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 41) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ミリアムが呼んでますね。";
		mes "気になることって何でしょうか？";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 42) {//未調査
	}
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "ふふふ。";
	mes "さすが冒険者様。";
	mes "外の人なのに大会議に参加できるなんて";
	mes "やっぱり普通じゃないですね。";
	next;
	mes "[マラム]";
	mes "スアドも口では";
	mes "なんだかんだと言ってますが";
	mes "冒険者様に期待してるに違いありません。";
	close2;
	cutin "ep18_suad_03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,145,146,5	script	熱血青年#過激派1_083	10397,{/* 15916 (cloaking)*/
	if(checkquest(16568)) {
		mes "[熱血青年]";
		mes "フレイヤの神殿を破壊してやれ！";
		mes "この地が誰の物なのか";
		mes "ハッキリさせてやるんだ！";
		next;
		mes "[熱血青年]";
		mes "だが、その為には「力」が必要だ！";
		mes "俺たちには武器が必要なんだ！";
		next;
		mes "[熱血青年たち]";
		mes "おぉーっ！";
		mes "俺たちは負けない！";
		mes "必ず勝つ！";
		unittalk getnpcid(0,"過激派の若者#過激派2_082"),"過激派の若者 : 頑張れ！";
		unittalk getnpcid(0,"過激派の青年#過激派2_096"),"過激派の青年 : 勝つぞ！勝つぞ！";
		unittalk getnpcid(0,"豪快な青年#過激派3_085"),"豪快な青年 : 絶対に負けない！";
		unittalk getnpcid(0,"血の気の多い青年#過激派4_086"),"血の気の多い青年 : 頑張れ～～！";
		unittalk getnpcid(0,"怒った青年#過激派5_087"),"怒った青年 : 目にものみせてやる！";
		next;
		mes "[熱血青年]";
		mes "俺たち自身の居場所を取り戻すため！";
		mes "俺たちがやるべきは明白だ！";
		delquest 16568;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : 話を聞いて回った。そろそろ会議が始まるだろう",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	mes "[熱血青年]";
	mes "この地が誰の物なのか";
	mes "ハッキリさせてやるんだ！";
	close;
OnQuestInfo:
	if(checkquest(16568))
		showevent 0, 1, "熱血青年#過激派1_083";
	else
		showevent 9999,0,"熱血青年#過激派1_083";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,147,148,3	script	過激派の若者#過激派2_082	939,{/* 15917 (cloaking)*/
	unittalk "過激派の若者 : 勝つぞ！　勝たなきゃならん！";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,145,144,7	script	豪快な青年#過激派3_085	10398,{/* 15918 (cloaking)*/
	if(EP18_1QUE != 42)
		unittalk "豪快な青年 : 勝つのは俺たちだ！";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,148,144,1	script	血の気の多い青年#過激派4_086	10399,{/* 15919 (cloaking)*/
	unittalk "血の気の多い青年 : 奴らの神殿を破壊しよう！";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,148,5	script	怒った青年#過激派5_087	10398,{/* 15920 (cloaking)*/
	unittalk "怒った青年 : 奴らを駆逐してやる！";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,139,148,5	script	地着きの老人#老年層1_088	10393,{/* 15921 (cloaking)*/
	if(checkquest(16569)) {
		mes "[地着きの老人]";
		mes "ワシは生まれてから一度も";
		mes "村を離れたことがない。";
		mes "この村で生まれ、育ち、老いた。";
		next;
		mes "[地着きの老人]";
		mes "そうやって生きてきたが";
		mes "何も問題は無かった。";
		mes "今さら何をしようというのか？";
		next;
		mes "[地着きの老人]";
		mes "そこにいる若い衆の考えは";
		mes "わからんでもないが";
		mes "後先考えずに行動しようとするのなら";
		mes "ワシら年寄りが諫めねばならん。";
		delquest 16569;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : 話を聞いて回った。そろそろ会議が始まるだろう",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(16569))
		showevent 0, 1, "地着きの老人#老年層1_088";
	else
		showevent 9999,0,"地着きの老人#老年層1_088";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,140,150,5	script	慌てる壮年#老年層2_089	10395,{/* 15922 (cloaking)*/
	unittalk "慌てる壮年 : 最近の若者ときたら……";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,138,145,7	script	内気な壮年#老年層3_090	10396,{/* 15923 (cloaking)*/
	unittalk "内気な壮年 : 考えが短絡的すぎる。";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,141,146,7	script	臆病な老人#老年層4_091	945,{/* 15924 (cloaking)*/
	unittalk "臆病な老人 : 私たちの意見も聞いてもらわねば……";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,150,147,1	script	熱血壮年#武器所持者1_092	929,{/* 15925 (cloaking)*/
	if(checkquest(16570)) {
		mes "[熱血壮年]";
		mes "よお！　よそ者！";
		mes "そう緊張するなよ！";
		mes "ほら、一緒に一杯やろうぜ！";
		next;
		switch(select("遠慮します","いただきます")) {
		case 1:
			mes "[熱血壮年]";
			mes "生真面目だなぁ、おい！";
			mes "そんなんで人生楽しいかぁ？";
			mes "まあ、いいや！";
			break;
		case 2:
			mes "[熱血壮年]";
			mes "うははは！";
			mes "よしよし、いい飲みっぷりだ。";
			mes "気に入ったぜ、よそ者！";
			break;
		}
		next;
		mes "[熱血壮年]";
		mes "大会議では、みんな言いたいことを言う！";
		mes "俺ももちろん遠慮なく言うぞ！";
		mes "お前もきっと俺の意見に";
		mes "賛成してくれるはずだ！";
		next;
		mes "[熱血壮年]";
		mes "戦争だ！　移住の民をやっつけろ！";
		mes "がははは！";
		mes "ほれ、見てみろ、この武器を！";
		mes "準備だってバッチリよぉ！";
		next;
		mes "[熱血壮年]";
		mes "後はラヘルに行って";
		mes "街も神殿も破壊してやる！";
		mes "がははは！";
		delquest 16570;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : 話を聞いて回った。そろそろ会議が始まるだろう",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	mes "[熱血壮年]";
	mes "大会議ってのはお祭りみたいなもんだ！";
	mes "だからいっぱい飲まなきゃな！";
	mes "さあ、飲んだ飲んだ～！";
	close;
OnQuestInfo:
	if(checkquest(16570))
		showevent 0, 1, "熱血壮年#武器所持者1_092";
	else
		showevent 9999,0,"熱血壮年#武器所持者1_092";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,152,145,1	script	弱気な青年#中立派1_093	931,{/* 15926 (cloaking)*/
	if(checkquest(16571)) {
		mes "[弱気な青年]";
		mes "あっちで大声上げてる奴らと";
		mes "一緒にしないでください。";
		mes "あいつらはいったい何を考えて";
		mes "騒いでるのか、よく分かりません……。";
		next;
		mes "[弱気な青年]";
		mes "本気で移住の民たちを";
		mes "倒せると思ってるんじゃないでしょうね？";
		mes "兵隊の数も、武器の質も";
		mes "差がありすぎますよ。";
		next;
		mes "[弱気な青年]";
		mes "どうして、ああも強気な発言ができるのか";
		mes "……ああ。";
		mes "最近、武器を持った人間が増えてますが";
		mes "虎の威を借る狐ってやつか……。";
		delquest 16571;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : 話を聞いて回った。そろそろ会議が始まるだろう",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	mes "[弱気な青年]";
	mes "あっちで大声上げてる奴らと";
	mes "一緒にしないでください。";
	close;
OnQuestInfo:
	if(checkquest(16571))
		showevent 0, 1, "弱気な青年#中立派1_093";
	else
		showevent 9999,0,"弱気な青年#中立派1_093";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,154,146,1	script	無口な青年#中立派2_094	10398,{/* 15927 (cloaking)*/
	unittalk "無口な青年 : ……。";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,151,150,1	script	中立派の青年#中立派3_095	10397,{/* 15928 (cloaking)*/
	unittalk "中立派の青年 : 私は誰の意見にも賛成しません。皆、思慮が足りてない。";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,145,7	script	過激派の青年#過激派2_096	934,{/* 15929 (cloaking)*/
	if(EP18_1QUE == 42) {
		cloakonnpc "スアド#1_079";
		cloakonnpc "ミリアム#1_080";
		cloakonnpc "マラム#1_082";
		cloakoffnpc "マラム#1_081";
		mes "[過激派の青年]";
		mes "さっきの見たか？";
		mes "大会議でこの武器を見せたら";
		mes "全員うらやましそうに";
		mes "俺のことを見ていたんだぜ！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "おお！";
		mes "まさにそれです！";
		mes "ちょうどそのカッコイイ武器について";
		mes "お聞きしたいと思って";
		mes "声を掛けさせてもらいました。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[過激派の青年]";
		mes "カッコイイって？";
		mes "へへっ、そうだろそうだろ！";
		mes "自分の身も守れるし！";
		mes "他人にも自慢できるもんな！";
		next;
		mes "[豪快な青年]";
		mes "おうよ！";
		mes "この武器を見せれば";
		mes "神殿の奴らもビビって";
		mes "俺たちに手出しできねえよ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "私もそんな武器が欲しいんですけど";
		mes "どうやったら手に入れることが";
		mes "できるんでしょう。";
		mes "ぜひ教えてもらえませんか？";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[過激派の青年]";
		mes "ふぅ～～ん、どうしようかなぁ～。";
		mes "俺たちも苦労して手に入れたんだ。";
		mes "簡単には教えられねぇよなぁ？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ふむ……私であれば一度に";
		mes "たくさん武器を村に持って来れます。";
		mes "デモを行う前にたくさん武器は";
		mes "欲しいですよね？";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[過激派の青年]";
		mes "そりゃそうだ。";
		mes "あればあるだけ良いもんな！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "貴方のおかげで村にたくさん";
		mes "武器が供給されたとなれば……";
		mes "貴方はまさに村の救世主となるでしょう！";
		mes "私は、そのお手伝いをしたいのです。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[過激派の青年]";
		mes "俺がこの村の救世主かぁ！";
		mes "でへへへへ～！";
		mes "そりゃあいい！";
		mes "よしよし、それなら教えてやるよ！";
		next;
		mes "[過激派の青年]";
		mes "ラヘルの街で商売している";
		mes "「^0000FFヒゲ坊ジャック^000000」ってのがいるから";
		mes "「^FF0000臭いタンポポ^000000」を買いにきたって";
		mes "伝えるんだ。";
		next;
		mes "[豪快な青年]";
		mes "「^FF0000臭いタンポポ^000000」だぜ！";
		mes "へっへっへ！";
		mes "間違えるんじゃねえぞ。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ありがとうございます！";
		mes "　";
		mes "ふむ。どうやら一度、";
		mes "ラヘルに戻る必要がありますね。";
		set EP18_1QUE,43;
		delquest 16574;
		setquest 16575;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 43) {
		mes "[過激派の青年]";
		mes "ラヘルの街で商売している";
		mes "「^0000FFヒゲ坊ジャック^000000」ってのがいるから";
		mes "「^FF0000臭いタンポポ^000000」を買いにきたって";
		mes "伝えるんだ。";
		next;
		mes "[豪快な青年]";
		mes "「^FF0000臭いタンポポ^000000」だぜ！";
		mes "へっへっへ！";
		mes "間違えるんじゃねえぞ。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ありがとうございます！";
		mes "　";
		mes "ふむ。どうやら一度、";
		mes "ラヘルに戻る必要がありますね。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "‐ラヘルへ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたはラヘルへ向かった‐";
		close2;
		warp "rachel.gat", 75, 39;
		end;
	}
	mes "[過激派の青年]";
	mes "これぐらいの武器がなきゃ";
	mes "安全とは言えないからな。";
	mes "女神病にかかった移住の民も";
	mes "俺たちには手を出せないぜ！";
	close;
OnQuestInfo:
	if(EP18_1QUE == 42 || EP18_1QUE == 43)
		showevent 0, 1, "過激派の青年#過激派2_096";
	else
		showevent 9999,0,"過激派の青年#過激派2_096";
	end;
OnInit:
	cloakonnpc;
	end;
}

rachel.gat,72,42,3	script	マラム#1_082_2	10376,{/* 15930 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,75,44,3	script	ヒゲ坊ジャック#武器商人	928,{/* 15931 */
	if(EP18_1QUE == 43) {
		mes "[ヒゲ坊ジャック]";
		mes "ラヘルで包丁や鍋をお探しなら";
		mes "「ヒゲ坊ジャック」の店が一番だ！";
		mes "この店こそが、オレのすべて！";
		mes "さあ、ゆっくり見ていってくれ！";
		next;
		cloakoffnpc "マラム#1_082_2";
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "この方が「ヒゲ坊ジャック」さんの";
		mes "ようですね……";
		mes "さて……なんだったかな？";
		mes "伝えるべき言葉があったと思いますが。";
		next;
		switch(select("臭い靴下","臭いタンポポ","良い香りの靴下","良い香りのタンポポ")) {
		case 1:
			cutin "ep18_maram_01.png", 255;
			mes "[ヒゲ坊ジャック]";
			mes "俺の靴下が欲しいのかい？";
			mes "しょうがねえぇなぁ……";
			mes "うっ！";
			mes "こりゃあ、なかなか……。";
			next;
			cutin "ep18_maram_03.png", 2;
			mes "[マラム]";
			mes "で、出直しましょう！";
			close2;
			cutin "ep18_maram_01.png", 255;
			cloakonnpc "マラム#1_082_2";
			end;
		case 2:
			cutin "ep18_maram_01.png", 255;
			mes "[ヒゲ坊ジャック]";
			mes "なぁ～んだ。";
			mes "「臭いタンポポ」をご所望ってわけか。";
			mes "じゃあ、それが咲いている場所を";
			mes "教えてやろう。";
			next;
			mes "[ヒゲ坊ジャック]";
			mes "「ベインス」の街の北東に";
			mes "武器商人がいる。";
			mes "そいつに会ったら";
			mes "俺からの紹介で来たと言うんだ。";
			next;
			mes "[ヒゲ坊ジャック]";
			mes "行くなら、急いだほうがいいぞ。";
			mes "在庫が捌けたら足を洗うって";
			mes "言ってたからな。";
			mes "じゃあな！";
			set EP18_1QUE,44;
			delquest 16575;
			setquest 16576;
			close2;
			cutin "ep18_maram_01.png", 255;
			cloakonnpc "マラム#1_082_2";
			end;
		case 3:
			cutin "ep18_maram_01.png", 255;
			mes "[ヒゲ坊ジャック]";
			mes "うちの店では靴下は売ってないぞ？";
			mes "金物屋なんだが。";
			close2;
			cloakonnpc "マラム#1_082_2";
			end;
		case 4:
			cutin "ep18_maram_01.png", 255;
			mes "[ヒゲ坊ジャック]";
			mes "そういうのは花屋に行って";
			mes "探してくれないか？";
			close2;
			cloakonnpc "マラム#1_082_2";
			end;
		}
	}
	if(EP18_1QUE == 44) {
		mes "[ヒゲ坊ジャック]";
		mes "「ベインス」の街の北東に";
		mes "武器商人がいる。";
		mes "そいつに会ったら";
		mes "俺からの紹介で来たと言うんだ。";
		next;
		mes "‐ベインスへ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたはベインスへ向かった‐";
		close2;
		warp "veins.gat", 288, 277;
		end;
	}
	mes "[ヒゲ坊ジャック]";
	mes "ラヘルで包丁や鍋をお探しなら";
	mes "「ヒゲ坊ジャック」の店が一番だ！";
	mes "この店こそが、オレのすべて！";
	mes "さあ、ゆっくり見ていってくれ！";
	close;
OnQuestInfo:
	if(EP18_1QUE == 43 || EP18_1QUE == 44)
		showevent 0, 1, "ヒゲ坊ジャック#武器商人";
	else
		showevent 9999,0,"ヒゲ坊ジャック#武器商人";
	end;
}

veins.gat,289,281,7	script	マラム#1_082_3	10376,{/* 16054 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
veins.gat,293,282,3	script	ダンデロン#武器商_ベインス	943,{/* 16055 */
	if(EP18_1QUE == 44) {
		cloakoffnpc "マラム#1_082_3";
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "こんにちは。";
		mes "武器を売って欲しいんですけど～。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[ダンデロン]";
		mes "……帰れ。";
		mes "もう閉店だ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ジャックさんの紹介で";
		mes "ここに来たんですけどね。";
		mes "あ、もしかして「臭いタンポポ」って";
		mes "いうのは……。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[ダンデロン]";
		mes "誰が臭いだと！";
		mes "ジャックの野郎、ふざけた合言葉を";
		mes "考えやがって！";
		mes "ええい、俺に何の用だ！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "さっきも言いましたよね？";
		mes "武器を買いに来たんです。";
		mes "もちろん、一般には出回っていない";
		mes "武器です。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[ダンデロン]";
		mes "……幾つ欲しいんだ？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "あればあるだけ。";
		mes "そう……一国の軍隊と戦えるぐらいの";
		mes "量が欲しいですね。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[ダンデロン]";
		mes "ごくり……";
		mes "戦争でも始めるつもりか？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "教えても良いですが……";
		mes "この商売からますます足を";
		mes "洗えなくなりますよ？";
		next;
		mes "[マラム]";
		mes "知ってますよ？";
		mes "在庫が捌けたら";
		mes "足を洗うつもりなんですよね？";
		mes "まあ、隠れてコソコソやってる";
		mes "ヤバ～イ商売ですもんね。";
		next;
		mes "[マラム]";
		mes "あ！";
		mes "そういえばさっきからこの辺りを";
		mes "警備の人たちが";
		mes "たくさんうろついてましたよ？";
		mes "もしかして……気付かれたんじゃ？";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[ダンデロン]";
		mes "……こ、小遣い稼ぎのつもりだったんだ！";
		mes "すぐに足を洗うつもりだった！";
		mes "で、でも抜けるつもりなら";
		mes "お前の代わりになるヤツを";
		mes "連れて来いって言われてるんだ！";
		next;
		mes "[ダンデロン]";
		mes "それができないなら";
		mes "取引を続けろって……";
		mes "で、でも、俺の知り合いに";
		mes "こんなヤバい商売を引き継いでくれる";
		mes "ヤツは一人もいなくて……";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "私がその取引を引き継ぐ";
		mes "というのはどうですか？";
		mes "なんなら、手数料もお支払いしますよ。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[ダンデロン]";
		mes "ほ、本当か!?";
		mes "金がもらえて足も洗えるなら";
		mes "願ったり叶ったりだ！";
		next;
		mes "[ダンデロン]";
		mes "トール火山だ！";
		mes "そこに秘密基地があって";
		mes "そこから武器が横流しされてる。";
		mes "ほら、このメモ書きを持って行け！";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ありがとうございます。";
		mes "では、この小切手をどうぞ。";
		mes "お互い今のやり取りは秘密にしましょう。";
		mes "よろしいですね？";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……ふむ。";
		mes "トール火山の秘密基地……";
		mes "武器の出所を調べに来ましたが";
		mes "そこが本命ですかね。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "二人で一緒に行動すると目立ちますから";
		mes "いったんバラバラに行動して";
		mes "トール火山で落ち合いましょうか。";
		set EP18_1QUE,45;
		delquest 16576;
		setquest 16577;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "マラム#1_082_3";
		end;
	}
	//47まで転送？
	if(EP18_1QUE >= 45 && EP18_1QUE <= 47) {
		cloakoffnpc "マラム#1_082_3";
		mes "[ダンデロン]";
		mes "俺はもう足を洗ったんだ。";
		mes "何も知らん！";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……ふむ。";
		mes "トール火山の秘密基地……";
		mes "武器の出所を調べに来ましたが";
		mes "そこが終着点でしょうか。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "二人で一緒に行動すると目立ちますから";
		mes "いったんバラバラに行動して";
		mes "トール火山で落ち合いましょうか。";
		next;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "マラム#1_082_3";
		mes "‐トール火山へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたはトール火山へ向かった‐";
		close2;
		warp "thor_v01.gat", 164, 164;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 44 && EP18_1QUE <= 47)
		showevent 0, 1, "ダンデロン#武器商_ベインス";
	else
		showevent 9999,0,"ダンデロン#武器商_ベインス";
	end;
}

thor_v01.gat,169,169,0	script	#ep180_maram	139,14,14,{/* 16183 */
	if(EP18_1QUE >= 45)
		cloakoffnpc "マラム#軍事基地-秘密通路";
	end;
}
thor_v01.gat,169,169,3	script	マラム#軍事基地-秘密通路	10376,{/* 16184 (cloaking)*/
	if(EP18_1QUE >= 45 && EP18_1QUE <= 47) {
		cutin "ep18_maram_02.png", 0;
		mes "[マラム]";
		mes strcharinfo(0)+"様！";
		mes "こっちです、こっち！";
		mes "火山にある基地に通じる";
		mes "抜け穴があるんです。";
		close2;
		cutin "ep18_maram_02.png", 255;
		warp "que_thr.gat", 181, 53;
		end;
	}
	if(EP18_1QUE == 48) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "私とミリアムはラヘルに戻ります。";
		mes "冒険者様は、この基地から不正な武器が";
		mes "流出していたことを";
		mes "スアドに伝えてもらえますか。";
		close2;
		cutin "ep18_maram_01.png", 255;
		warp "wolfvill.gat", 145, 109;
		end;
	}
	if(EP18_1QUE >= 48) {
		cutin "ep18_maram_02.png", 0;
		mes "[マラム]";
		mes "少し気になることがあって";
		mes "調査を続けてるんです。";
		mes "もしかして、"+strcharinfo(0)+"様も、";
		mes "基地にやり残したことがありますか？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[マラム]";
			mes "そうですか。";
			mes "私はもう少し調査を続けますね。";
			close2;
			cutin "ep18_maram_02.png", 255;
			end;
		}
		mes "[マラム]";
		mes "そうでしたか。";
		mes "基地に通じる抜け穴はこちらです。";
		close2;
		cutin "ep18_maram_02.png", 255;
		warp "que_thr.gat", 181, 53;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 45)
		showevent 0, 1, "マラム#軍事基地-秘密通路";
	else
		showevent 9999,0,"マラム#軍事基地-秘密通路";
	end;
OnInit:
	cloakonnpc;
	end;
}
que_thr.gat,186,58,0	warp	#秘密通路-軍事基地	2,2,thor_v01.gat,164,167

que_thr.gat,133,53,5	script	マラム#軍事基地1_101	10376,{/* 15932 */
	if(EP18_1QUE == 45) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "冒険者様！";
		mes "こちらです！";
		mes "秘密基地を様子を伺っていましたが";
		mes "ここが本命で間違いなさそうです。";
		next;
		mes "[マラム]";
		mes "中に入って、調査したいところですが";
		mes "かなり警備が厳重です。";
		mes "慎重に行動しないといけません。";
		next;
		mes "[マラム]";
		mes "侵入する準備はできていますか？";
		mes "もし、上手くいかなくても";
		mes "ここからやり直せば大丈夫です。";
		set EP18_1QUE,46;
		delquest 16577;
		setquest 16578;
	}
	else if(EP18_1QUE <= 47) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "侵入する準備はできていますか？";
		mes "もし、上手くいかなくても";
		mes "ここからやり直せば大丈夫です。";
	}
	else {
		mes "[インフォメーション]";
		mes "既に「トール軍事基地」を";
		mes "クリアしているキャラクターは、";
		mes "パーティメンバーとして";
		mes "「トール軍事基地」に";
		mes "入場できます。";
		next;
		mes "[インフォメーション]";
		mes "パーティメンバーとして";
		mes "「トール軍事基地」に";
		mes "入場しますか？";
	}
	next;
	if(mdopenstate("Thor military base") || getpartyleader(getcharid(1)) != strcharinfo(0) || EP18_1QUE >= 49) {
		set '@menu$,"「トール軍事基地」入場";
	}
	else {
		set '@menu$,"「トール軍事基地」(Thor military base)の作成";
	}
	next;
	if(select("やめる",'@menu$) == 1) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "準備が出来たら声をかけてくださいね。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(mdopenstate("Thor military base")) {
		if(EP18_1QUE >= 49) {
			mes "[インフォメーション]";
			mes "「トール軍事基地」へ入場します。";
			close2;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				mes "[インフォメーション]";
				mes "既に「トール軍事基地」を";
				mes "クリアしているキャラクターは、";
				mes "パーティリーダーとして";
				mes "入場できません。";
				close;
			}
		}
		switch(mdenter("Thor military base")) {
		case 0:	// エラーなし
			announce "メモリアルダンジョン[Thor military base] に入場しました　 : 　" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			donpcevent getmdnpcname("ThorMilitaryBaseControl1")+ "::OnStart";
			//warp "1@tcamp.gat", 103, 237;
			close;
		case 1:	// パーティー未加入
			cutin "ep18_maram_01.png", 2;
			mes "[マラム]";
			mes "あれ？";
			mes "パーティーを結成していませんね。";
			mes "^FF0000パーティー結成後、^000000";
			mes "^FF0000また会話してください。^000000";
			next;
			cutin "ep18_maram_01.png", 255;
			mes "[インフォメーション]";
			mes "パーティーに加入していないため";
			mes "入場できません。";
			close;
		case 2:	// ダンジョン未作成
			cutin "ep18_maram_01.png", 2;
			mes "[マラム]";
			mes "まだパーティーのリーダーが";
			mes "ダンジョンを生成していないようです。";
			mes "しばらくしてから、確認してください。";
			next;
			cutin "ep18_maram_01.png", 255;
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
			cutin "ep18_maram_01.png", 255;
			mes "[インフォメーション]";
			mes "パーティーリーダーのみ";
			mes "メモリアルダンジョンを";
			mes "作成することができます。";
			close;
		}
		mdcreate "Thor military base";
		cutin "ep18_maram_01.png", 255;
		mes "■パーティー名";
		mes "^0000ff"+strcharinfo(1)+"^000000";
		mes "■パーティーリーダー";
		mes "^0000ff"+strcharinfo(0)+"^000000";
		mes "　";
		mes "^006400Thor military base^000000の作成申請を受け付けます。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "申込が完了したら";
		mes "私に話しかけて";
		mes "^0000CDトール軍事基地へ入場^000000を";
		mes "選択してください。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnQuestInfo:
	if(EP18_1QUE >= 45 && EP18_1QUE <= 47)
		showevent 0, 1, "マラム#軍事基地1_101";
	else
		showevent 9999,0,"マラム#軍事基地1_101";
	end;
}
wolfvill.gat,140,112,0	script	#sms01_102	139,14,14,{/* 15933 */
	if(EP18_1QUE == 48 || EP18_1QUE == 49) {
		cloakoffnpc "スアド#sms01_103";
		unittalk getnpcid(0,"スアド#sms01_103"),"スアド : ……。";
	}
	end;
}
wolfvill.gat,140,112,5	script	スアド#sms01_103	10378,{/* 15934 (cloaking)*/
	if(EP18_1QUE == 48) {
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "冒険者か……";
		mes "マラムはどうした？";
		mes "一緒ではなかったのか？";
		next;
		menu "武器の横流しについて伝える",-;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "怪しい武器だと思っていたが";
		mes "使用期限切れの武器だったか……";
		mes "そんな危険なものを使う訳にはいかない。";
		next;
		mes "[スアド]";
		mes "それにしても";
		mes "軍が絡んでいたとはな。";
		mes "それが俺たちの村に運ばれて……";
		mes "……何か恣意的なものを感じる。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "まあ、深く考えても仕方がない。";
		mes "怪しい武器の流入が収まれば";
		mes "血気盛んな奴らも";
		mes "少しは大人しくなるだろう。";
		next;
		cloakoffnpc "ミリアム#sms01_104";
		cloakoffnpc "マラム#sms01_105";
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "スアドォ～～！　スアド、スアドッ!!";
		mes "ああ～ここにいたのか！";
		mes "大変なことが起きて……";
		mes "それで大変なことが起きたんだ！";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "騒がしい奴だ……";
		mes "何が起きた？";
		mes "落ち着いて話せ。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "ボクが説明するよ。";
		mes "……ラヘルの隊商が襲われた。";
		mes "犯人は、この村の住民だ。";
		next;
		cutin "ep18_suad_04.png", 1;
		mes "[スアド]";
		mes "……なんだと？";
		mes "証拠はあるのか？";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "横流しされた武器が使われていた。";
		mes "それに、隊商から奪った荷物も";
		mes "この村に運び込んだらしい。";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "俺のところには";
		mes "何も報告が来ていない。";
		mes "くそっ……マズイな。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "……ラヘルの街の動きは";
		mes "どうなっている？";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……良くない。";
		mes "街の隊商が原住民に襲われたって話は";
		mes "すでに知れ渡ってる。";
		mes "元々原住民への感情が悪化してたけど";
		mes "その感情を隠さない人が明らかに増えた。";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "早急に確認が必要だ。";
		mes "襲ったのは……";
		mes "あの武器を持ってた奴らか……。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "話が確かなら、奪った荷物を持って";
		mes "村に戻ってきているはず。";
		mes "探し出して、話を聞く。";
		set EP18_1QUE,49;
		delquest 16580;
		setquest 17517;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "マラム#sms01_105";
		cloakonnpc "ミリアム#sms01_104";
		end;
	}
	if(EP18_1QUE == 49) {
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "隊商から奪った荷物を持って";
		mes "奴らは村に戻ってきているはず。";
		mes "探し出して、話を聞く。";
		next;
		cutin "ep18_suad_01.png", 255;
		mes "‐犯人を捜しに向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは犯人を捜しに向かった‐";
		close2;
		warp "wolfvill.gat", 123, 250;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 48 || EP18_1QUE == 49)
		showevent 0, 1, "スアド#sms01_103";
	else
		showevent 9999,0,"スアド#sms01_103";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,142,109,1	script	ミリアム#sms01_104	10377,{/* 15935 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,110,1	script	マラム#sms01_105	10376,{/* 15936 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,132,256,1	script	略奪品#sms01_106	10250,{/* 15937 */}
wolfvill.gat,131,258,1	script	略奪品#sms02_107	10250,{/* 15938 */}
wolfvill.gat,132,258,1	script	略奪品#sms03_108	10250,{/* 15939 */}
wolfvill.gat,131,257,1	script	略奪品#sms04_109	10250,20,20,{/* 15940 */
	if(EP18_1QUE == 49) {
		cloakoffnpc "スアド#sms02_113";
		cloakoffnpc "マラム#sms02_115";
		cloakoffnpc "ミリアム#sms02_114";
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "あった……";
		mes "隊商から奪われた荷物だ。";
		next;
		cutin "ep18_maram_03.png", 255;
		cloakoffnpc "ラマクス#sms01_110";
		cloakoffnpc "クーン#sms01_111";
		cloakoffnpc "ヨピ#sms01_112";
		emotion 1,"ラマクス#sms01_110";
		mes "[ラマクス]";
		mes "俺たちの戦利品を見に来たのか？";
		mes "お！";
		mes "スアドも見てくれよ！";
		mes "すげぇ～だろ！";
		next;
		mes "[クーン]";
		mes "へっへっへ！　武器があれば";
		mes "こんな風に街の奴らから";
		mes "荷物を奪うこともできるんだ！";
		next;
		mes "[ヨピ]";
		mes "褒めてくれてもいいよ～？";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[スアド]";
		mes "ふざけるな。";
		mes "お前たち……自分が何をしたのか";
		mes "理解してるのか？";
		next;
		mes "[スアド]";
		mes "お前たちの勝手な行動によって";
		mes "俺たちの立場が";
		mes "これまでになく悪化している。";
		mes "移住の民と";
		mes "どうやって和解するつもりだ？";
		next;
		cutin "ep18_suad_01.png", 255;
		mes "[ラマクス]";
		mes "奴らはこれまで俺たちから";
		mes "さんざん奪ってきたんだ。";
		mes "ちょっとやり返しただけで";
		mes "文句を言われる筋合いはないね！";
		next;
		mes "[クーン]";
		mes "それに～スアドもきっと喜ぶと思うよ？";
		mes "なにせ「アーマッド商会」の奴らから";
		mes "荷物を奪って来たんだからさ～。";
		emotion 0,"スアド#sms02_113";
		emotion 23,"ミリアム#sms02_114";
		emotion 23,"マラム#sms02_115";
		next;
		cutin "ep18_suad_04.png", 1;
		mes "[スアド]";
		mes "なに……!?";
		next;
		cutin "ep18_suad_04.png", 255;
		mes "[クーン]";
		mes "聞こえなかった？";
		mes "「アーマッド商会」だよ！";
		mes "スアドを養子にしたくせに";
		mes "ゴミのように扱ったアーマッドだよ！";
		next;
		mes "[ヨピ]";
		mes "この村に来たのも";
		mes "父親から逃げる為だったんでしょ？";
		mes "その憎い相手に復讐できたんだから";
		mes "もっと喜んでくれよ！";
		next;
		mes "[ラマクス]";
		mes "本当はスアドもアーマッドの奴らに";
		mes "復讐したいと思ってたんだろ？";
		mes "この武器さえあれば～";
		mes "「力」さえあれば";
		mes "全て解決できるんだー！";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[スアド]";
		mes "…………。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "スアド……？";
		set EP18_1QUE,50;
		delquest 17517;
		setquest 17518;
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	if(EP18_1QUE == 50) {
		cloakoffnpc "スアド#sms02_113";
		cloakoffnpc "マラム#sms02_115";
		cloakoffnpc "ミリアム#sms02_114";
		cloakoffnpc "ラマクス#sms01_110";
		cloakoffnpc "クーン#sms01_111";
		cloakoffnpc "ヨピ#sms01_112";
		cloakonnpc "住民#sms01_116";
		cloakonnpc "住民#sms02_117";
		cloakonnpc "住民#sms03_118";
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 49)
		showevent 0, 1, "略奪品#sms04_109";
	else
		showevent 9999,0,"略奪品#sms04_109";
	end;
OnTouch:
	if(EP18_1QUE == 49) {
		cloakoffnpc "スアド#sms02_113";
		cloakoffnpc "マラム#sms02_115";
		cloakoffnpc "ミリアム#sms02_114";
		cloakonnpc "ラマクス#sms01_110";
		cloakonnpc "クーン#sms01_111";
		cloakonnpc "ヨピ#sms01_112";
		cloakonnpc "住民#sms01_116";
		cloakonnpc "住民#sms02_117";
		cloakonnpc "住民#sms03_118";
	}
	else if(EP18_1QUE == 50) {//	未調査
		cloakoffnpc "スアド#sms02_113";
		cloakoffnpc "マラム#sms02_115";
		cloakoffnpc "ミリアム#sms02_114";
		cloakoffnpc "ラマクス#sms01_110";
		cloakoffnpc "クーン#sms01_111";
		cloakoffnpc "ヨピ#sms01_112";
		cloakonnpc "住民#sms01_116";
		cloakonnpc "住民#sms02_117";
		cloakonnpc "住民#sms03_118";
	}
	else if(EP18_1QUE == 51) {
		cloakonnpc "スアド#sms02_113";
		cloakonnpc "マラム#sms02_115";
		cloakonnpc "ミリアム#sms02_114";
		cloakoffnpc "ラマクス#sms01_110";
		cloakonnpc "クーン#sms01_111";
		cloakonnpc "ヨピ#sms01_112";
		cloakonnpc "住民#sms01_116";
		cloakonnpc "住民#sms02_117";
		cloakonnpc "住民#sms03_118";
	}
	end;
}
wolfvill.gat,131,252,3	script	ラマクス#sms01_110	21292,{/* 15941 (cloaking)*/
	if(EP18_1QUE == 50) {
		cloakoffnpc "スアド#sms02_113";
		cloakoffnpc "マラム#sms02_115";
		cloakoffnpc "ミリアム#sms02_114";
		cloakoffnpc "クーン#sms01_111";
		cloakoffnpc "ヨピ#sms01_112";
		cloakonnpc "住民#sms01_116";
		cloakonnpc "住民#sms02_117";
		cloakonnpc "住民#sms03_118";
		mes "[ラマクス]";
		mes "この武器さえあれば～";
		mes "復讐だって成し遂げられる！";
		mes "スアドだって本当は";
		mes "この「力」が欲しいんだろ？";
		mes "俺たちのこと認めてくれよ～？";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "…………。";
		next;
		cutin "ep18_suad_02.png", 255;
		mes "^0000FF‐スアドが黙り込んでいる間に";
		mes "　騒ぎを聞きつけ住民たちが";
		mes "　次々と集まって来た‐^000000";
		cloakoffnpc "住民#sms01_116";
		cloakoffnpc "住民#sms02_117";
		cloakoffnpc "住民#sms03_118";
		next;
		mes "[住民]";
		mes "街の隊商を襲撃したって聞いたぞ！";
		mes "良くやった！";
		next;
		mes "[住民]";
		mes "武器さえあれば";
		mes "俺たちだってやれるってことだ！";
		next;
		mes "[ラマクス]";
		mes "そういうこと！";
		mes "実際、隊商の奴らをやっつけるの";
		mes "簡単だったぜ！";
		next;
		mes "[住民]";
		mes "余ってる武器は無いのか？";
		mes "俺たちも手伝うぜ！";
		mes "いい加減、やられっぱなしの生活には";
		mes "うんざりしていたからな！";
		unittalk getnpcid(0,"住民#sms02_117"),"住民 : そうだ！そうだ！";
		unittalk getnpcid(0,"住民#sms01_116"),"住民 : 私たちにもできる！";
		unittalk getnpcid(0,"ラマクス#sms01_110"),"ラマクス : だろう？　オレたちに時がきた！";
		unittalk getnpcid(0,"クーン#sms01_111"),"クーン : いつまでこんな生活を送るつもりだ？";
		unittalk getnpcid(0,"ヨピ#sms01_112"),"ヨピ : そうだ！";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……マズイな。";
		mes "せっかく武器の流入を";
		mes "止めようとしたのに";
		mes "このままじゃ彼らが暴徒化してしまう。";
		mes "スアド！";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "……マラム？";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "この事態を収拾できるのは";
		mes "この村のリーダーであるスアド、";
		mes "キミだけだ。";
		next;
		mes "[マラム]";
		mes "スアドがどんなにツライ目に遭ったのか";
		mes "私も知っている。";
		mes "アーマッドさんを恨むのも無理はない。";
		mes "だけど……。";
		next;
		mes "[マラム]";
		mes "今、「力」に頼ることを拒否して";
		mes "彼らの憎悪を留めなければ";
		mes "移住の民の亀裂は";
		mes "決定的になってしまう。";
		next;
		mes "[マラム]";
		mes "スアド……頼むよ。";
		mes "「力」に頼らないでくれ……";
		mes "それに頼ってしまったら";
		mes "これまでやってきた努力が全て";
		mes "暴力と憎悪で押し流されてしまう。";
		next;
		mes "[マラム]";
		mes "頼む……スアド。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "……スアド。";
		mes "ボクからもお願いするよ。";
		mes "キミの心情は理解できる……けど……";
		mes "みんなの未来の為にも";
		mes "一時的な感情に流されないで……。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "…………";
		mes "………………";
		mes "……………………。";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[スアド]";
		mes "お前らに心配されるなんて";
		mes "思ってもなかったな。";
		mes "俺も焼きが回ったものだ。";
		mes "ふん……。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "皆、聞けっ！";
		mes "隊商から奪って来た荷は返す！";
		mes "その上で武力に頼らない";
		mes "非武装のデモを行う！";
		next;
		mes "[スアド]";
		mes "ここにある武器は元々は";
		mes "移住の民が戦争の為に用意した武器だ！";
		mes "先祖たちは、その汚れた武器によって";
		mes "土地を奪われた！";
		mes "俺たちが、それを頼るわけにはいかない！";
		next;
		mes "[スアド]";
		mes "武器など必要ない！";
		mes "俺たちひとりひとりの気高く";
		mes "誇り高い意志と魂こそが";
		mes "牙となるからだ！";
		next;
		mes "[スアド]";
		mes "デモの準備はすでにできている。";
		mes "いまこそ俺たちの想いを示し";
		mes "先祖や同志たちの名誉を取り戻そう！";
		next;
		cutin "ep18_suad_02.png", 255;
		mes "[ラマクス]";
		mes "ちょ……ちょっと待てよ！";
		mes "武器が必要ないだって!?";
		mes "いや、持って行った方が絶対に良いって！";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[スアド]";
		mes "武器に頼り、復讐を口にするのは";
		mes "臆病者のすることだ。";
		mes "この村に臆病な者は、ひとりもいない！";
		next;
		mes "^0000FF‐スアドが自身の迷いを";
		mes "　断ち切るように発した";
		mes "　その力強い宣言に";
		mes "　集まった村人たちも";
		mes "　勇気づけられたようだ‐^000000";
		next;
		cutin "ep18_suad_02.png", 255;
		mes "[住民]";
		mes "……スアドの言う通りだ！";
		unittalk getnpcid(0,"住民#sms03_118"),"住民 : 武器に頼る必要は無い！";
		unittalk getnpcid(0,"住民#sms01_116"),"住民 : 俺たちの誇りを見せてやる！";
		unittalk getnpcid(0,"住民#sms02_117"),"住民 : 臆病者はいない！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "スアド……";
		mes "よ、よかった……。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "ぼさっとするな、マラム。";
		mes "お前には奪って来た荷を";
		mes "返しに行ってもらいたい。";
		mes "……できるか？";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "はは……";
		mes "無茶を言ってくれるなぁ……";
		mes "できないって言っても";
		mes "やらせるつもりなんだろ？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ボクもデモに参加する。";
		mes "ボクだって「灰色の子供達」なんだ。";
		mes "村のみんなと一緒の道を歩みたい。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "冒険者様、お願いがあります。";
		mes "スアドたちのデモを";
		mes "見届けてもらえませんか？";
		mes "彼らと……スアドたちの想いを";
		mes "見て欲しいんです。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "移住の民でも原住民でもない冒険者が";
		mes "デモの正当性を証明してくれる";
		mes "というわけか。";
		mes "……良いだろう。";
		next;
		mes "[スアド]";
		mes "デモは、ラヘルの大神殿で行う予定だ。";
		mes "準備ができたらラヘルの神殿前に来い。";
		mes "ミリアムも準備を怠るな。";
		cloakonnpc "住民#sms01_116";
		cloakonnpc "住民#sms02_117";
		cloakonnpc "住民#sms03_118";
		set EP18_1QUE,51;
		delquest 17518;
		setquest 17519;
		close2;
		cutin "ep18_suad_01.png", 255;
		cloakonnpc "スアド#sms02_113";
		cloakonnpc "マラム#sms02_115";
		cloakonnpc "ミリアム#sms02_114";
		cloakonnpc "クーン#sms01_111";
		cloakonnpc "ヨピ#sms01_112";
		end;
	}
	if(EP18_1QUE == 51) {
		mes "[ラマクス]";
		mes "デモはラヘルの大神殿で行うんだよ。";
		mes "さっさとラヘルに行こうぜ～。";
		next;
		mes "‐ラヘルの大神殿へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたはラヘルの大神殿へ向かった‐";
		close2;
		warp "rachel.gat", 169, 240;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 50 || EP18_1QUE == 51)
		showevent 0, 1, "ラマクス#sms01_110";
	else
		showevent 9999,0,"ラマクス#sms01_110";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,129,256,3	script	クーン#sms01_111	21293,{/* 15942 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,126,255,5	script	ヨピ#sms01_112	21294,{/* 15943 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,126,252,7	script	スアド#sms02_113	10378,{/* 15944 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,124,253,5	script	ミリアム#sms02_114	10377,{/* 15945 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,127,250,7	script	マラム#sms02_115	10376,{/* 15946 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,129,251,1	script	住民#sms01_116	931,{/* 15947 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,129,248,7	script	住民#sms02_117	928,{/* 15948 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,132,250,1	script	住民#sms03_118	10397,{/* 15949 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

rachel.gat,169,245,3	script	平凡な人#sms04_119	10399,{/* 15950 */
	if(EP18_1QUE < 51) {
		mes "[平凡な人]";
		mes "ここには何もないですよ～。";
		mes "修理作業中で";
		mes "関係者以外は近寄らないでください～。";
		close;
	}
	if(EP18_1QUE >= 53) {//53未確認
		mes "[平凡な人]";
		mes "中央の広場の近くにある";
		mes "^ff0000宿屋の中庭^000000で";
		mes "今後の件について";
		mes "相談するみたいですよ？";
		viewpoint 1, 116, 200, 18, 0x00FF00;
		next;
		mes "‐^ff0000宿屋の中庭^000000へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは^ff0000宿屋の中庭^000000へ向かった‐";
		close2;
		warp "rachel.gat", 116, 200;
		end;
	}
	if(EP18_1QUE == 51) {
		mes "[平凡な人]";
		mes "ここには何もないですよ～。";
		mes "修理作業中で";
		mes "関係者以外は近寄らないでください～。";
		next;
		cutin "ep18_suad_01.png", 2;
		cloakoffnpc "スアド#sms03_120";
		mes "[スアド]";
		mes "警戒しなくていい。";
		mes "こいつは俺たちのデモについてくる";
		mes "冒険者だ。";
		mes "俺たちの正当性を証明してくれる。";
		next;
		cutin "ep18_miriam_01.png", 0;
		cloakoffnpc "ミリアム#sms03_121";
		mes "[ミリアム]";
		mes "これで全員揃ったね。";
		set EP18_1QUE,52;
		delquest 17519;
		setquest 17520;
		next;
	}
	else if(EP18_1QUE == 52) {
		cloakoffnpc "スアド#sms03_120";
		cloakoffnpc "ミリアム#sms03_121";
	}
	cutin "ep18_suad_01.png", 2;
	mes "[スアド]";
	mes "ここから神殿の裏口に入れる。";
	mes "「デモ開始の合図」を行った後に";
	mes "神殿に入るぞ。";
	if(mdopenstate("wolf in sheep's clothing") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
		set '@menu$,"「羊の中の狼」入場";
	}
	else {
		set '@menu$,"「羊の中の狼」(wolf in sheep's clothing)の作成";
	}
	next;
	if(select("準備が必要です",'@menu$) == 1) {
		mes "[スアド]";
		mes "準備ができたら";
		mes "もう一度話しかけてくれ。";
		close2;
		cutin "ep18_suad_01.png", 255;
		end;
	}
	if(mdopenstate("wolf in sheep's clothing")) {
		cutin "ep18_suad_01.png", 2;
		mes "[スアド]";
		mes "デモの準備が完了したようだ。";
		mes "では、行くぞ。";
		close2;
		cutin "ep18_suad_01.png", 255;
		switch(mdenter("wolf in sheep's clothing")) {
		case 0:	// エラーなし
			announce "メモリアルダンジョン[wolf in sheep's clothing] に入場しました　 : 　" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			donpcevent getmdnpcname("WolfInSheepsClothingControl1")+ "::OnStart";
			//warp "1@tcamp.gat", 103, 237;
			close;
		case 1:	// パーティー未加入
			cutin "ep18_suad_01.png", 255;
			mes "[インフォメーション]";
			mes "パーティーに加入していないため";
			mes "入場できません。";
			close;
		case 2:	// ダンジョン未作成
			cutin "ep18_suad_01.png", 2;
			mes "[スアド]";
			mes "パーティーリーダーの準備を待て。";
			next;
			cutin "ep18_suad_01.png", 255;
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
			cutin "ep18_maram_01.png", 255;
			mes "[インフォメーション]";
			mes "パーティーリーダーのみ";
			mes "メモリアルダンジョンを";
			mes "作成することができます。";
			close;
		}
		mdcreate "wolf in sheep's clothing";
		cutin "ep18_suad_01.png", 255;
		mes "■パーティー名";
		mes "^0000ff"+strcharinfo(1)+"^000000";
		mes "■パーティーリーダー";
		mes "^0000ff"+strcharinfo(0)+"^000000";
		mes "　";
		mes "^006400wolf in sheep's clothing^000000の作成申請を受け付けます。";
		next;
		cutin "ep18_suad_01.png", 2;
		mes "[スアド]";
		mes "……ピーッ!!";
		next;
		mes "[スアド]";
		mes "合図を送った。";
		mes "準備が完了すれば";
		mes "神殿に入れるようになるだろう。";
		close2;
		cutin "ep18_suad_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 51 || EP18_1QUE <= 53)
		showevent 0, 1, "平凡な人#sms04_119";
	else
		showevent 9999,0,"平凡な人#sms04_119";
	end;
}
rachel.gat,167,244,5	script	スアド#sms03_120	10378,{/* 15951 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,167,242,7	script	ミリアム#sms03_121	10377,{/* 15952 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,116,200,0	script	#ep18w14_150	139,14,14,{/* 15953 */
	if(EP18_1QUE == 53) {
		cloakoffnpc "ニルエン#sms01_122";
		cloakoffnpc "ジェド#sms01_123";
		cloakoffnpc "ミリアム#sms04_125";
		cloakoffnpc "スアド#sms04_124";
	}
	if(EP18_1QUE == 54) {
		cloakoffnpc "ニルエン#sms01_122";
		cloakoffnpc "ジェド#sms01_123";
	}
	if(EP18_1QUE == 55) {
		cloakoffnpc "ニルエン#sms01_122";
	}
	end;
}
rachel.gat,116,200,5	script	ニルエン#sms01_122	915,{/* 15954 (cloaking)*/
	if(EP18_1QUE == 53) {
		cloakoffnpc "ジェド#sms01_123";
		cloakoffnpc "スアド#sms04_124";
		cloakoffnpc "ミリアム#sms04_125";
		cutin "ra_gwoman.bmp", 2;
		mes "[ニルエン大神官]";
		mes "ようやく一息つきました。";
		mes "それぞれの状況を確認しましょうか。";
		next;
		cutin "ra_gman.bmp", 2;
		mes "[ジェド大神官]";
		mes "神殿側の負傷者は";
		mes "皆、大きな怪我は負っていない。";
		mes "冒険者様のおかげだな。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "こちらも幸い、重傷者はいません。";
		mes "ただ、ショックが大きかったようで";
		mes "精神的に参っている人がいます。";
		next;
		cutin "ra_gwoman.bmp", 2;
		mes "[ニルエン大神官]";
		mes "先日の隊商が襲われた件と";
		mes "今回の件が立て続けに続いたことで";
		mes "ラヘルの街の人々も不安に";
		mes "思うかもしれません。";
		next;
		cutin "ra_gman2.bmp", 2;
		mes "[ジェド大神官]";
		mes "そこは我々が何とかするしかない。";
		mes "事件が仕組まれていたことを公にして";
		mes "互いに不備があったことを説明しよう。";
		next;
		cutin "ra_gwoman.bmp", 2;
		mes "[ニルエン大神官]";
		mes "まさか神殿の兵士たちも……";
		mes "いえ……ユス・アマール……";
		mes "元「ビルド大神官」がイルシオンと共に";
		mes "教国に災いをもたらしていたなんて。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "父上は失脚後、無気力な日々を";
		mes "過ごしていました。";
		mes "ところが、ある日を境に";
		mes "以前のように活発になられて……。";
		next;
		mes "[ミリアム]";
		mes "ボクは、純粋に嬉しかったのですが";
		mes "今思い返せば、その時からです。";
		mes "ラヘルの街で、原住民と移住の民との間の";
		mes "軋轢が大きくなり始めたのは。";
		next;
		cutin "ep18_suad_02.png", 0;
		mes "[スアド]";
		mes "あのイルシオンといかいうヤツらと";
		mes "ユス・アマールが結託したんだな？";
		mes "くそっ……。";
		next;
		mes "[スアド]";
		mes "俺たちは……利用されていたのか！";
		mes "奴らの目的を達成する為の";
		mes "駒に過ぎなかったというわけか！";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "ボクのせいだ……";
		mes "ボクが父上の変化に";
		mes "もっと早く気づいていれば……。";
		next;
		cutin "ra_gwoman.bmp", 2;
		mes "[ニルエン大神官]";
		mes "不備はこちらにも言えることです。";
		mes "街で起きていた騒ぎに真剣に対応せず";
		mes "神殿内の兵士たちまで";
		mes "懐柔されていたのですから。";
		next;
		cutin "ra_gman.bmp", 2;
		mes "[ジェド大神官]";
		mes "今回のことは不幸だった。";
		mes "だが、まだ終わったわけではない。";
		mes "そうだろう？";
		next;
		menu "ユミルの心臓の欠片を取り戻さないと",-;
		mes "[ジェド大神官]";
		mes "そういうことだ。";
		mes "さっきも言ったが一連の混乱の収拾は";
		mes "我々に任せて欲しい。";
		mes "キミにはユミルの心臓の欠片を";
		mes "奪還する大役を担って欲しい。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "多分だけど……";
		mes "「ユミルの心臓の欠片」は";
		mes "父上の別荘にあるはずです。";
		mes "最近、療養のためと言って頻繁に";
		mes "通っていました。";
		next;
		mes "[ミリアム]";
		mes "別荘の使用人たちも";
		mes "父上の客人が大勢泊っていると";
		mes "聞いています。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "別荘に入るには特別な鍵が必要ですが";
		mes "目途はついています。";
		mes "ボクが案内できますから";
		mes "冒険者さんも一緒に来てください。";
		next;
		mes "[ミリアム]";
		mes "「^0000FFオズの迷路^000000」で落ち合いましょう。";
		mes "準備ができたら来てください。";
		set EP18_1QUE,54;
		delquest 17521;
		setquest 17525;
		close2;
		cutin "ep18_miriam_01.png", 255;
		cloakonnpc "ミリアム#sms04_125";
		cloakonnpc "スアド#sms04_124";
		end;
	}
	if(EP18_1QUE >= 54 && EP18_1QUE <= 55) {
		cutin "ra_gwoman.bmp", 0;
		mes "[ニルエン]";
		mes "ミリアムとは「^0000FFオズの迷路^000000」で";
		mes "落ち合うことになっていたと思いますが？";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "‐「^0000FFオズの迷路^000000」へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたは「^0000FFオズの迷路^000000」へ向かった‐";
		close2;
		warp "oz_dun01.gat", 218, 116;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 53 && EP18_1QUE <= 55)
		showevent 0, 1, "ニルエン#sms01_122";
	else
		showevent 9999,0,"ニルエン#sms01_122";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,115,198,5	script	ジェド#sms01_123	932,{/* 15955 (cloaking)*/
	cutin "ra_gman2.bmp", 0;
	mes "[ジェド大神官]";
	mes "どうも君が現れると";
	mes "事態が大きく動いてしまうようだ。";
	close2;
	cutin "ra_gman2.bmp", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,119,199,3	script	スアド#sms04_124	10378,{/* 15956 (cloaking)*/
	cutin "ep18_suad_02.png", 0;
	mes "[スアド]";
	mes "俺たちは……利用されていたのか。";
	mes "奴らの目的を達成する為の";
	mes "駒に過ぎなかったというわけか！";
	close2;
	cutin "ep18_suad_02.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,118,197,1	script	ミリアム#sms04_125	10377,{/* 15957 (cloaking)*/
	cutin "ep18_miriam_03.png", 0;
	mes "[ミリアム]";
	mes "父上……";
	mes "どうしてこんな……。";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,223,114,0	script	#ep180_oz_c12	139,{/* 15958 */
	if(EP18_1QUE == 54) {
		cloakonnpc "マラム#c12_01_128";
		cloakonnpc "スアド#c12_01_129";
		cloakonnpc "ミリアム#c12_01_130";
		cloakonnpc "アイラ#c12_01_131";
	}
	if(EP18_1QUE == 55) {
		cloakoffnpc "マラム#c12_01_128";
		cloakoffnpc "スアド#c12_01_129";
		cloakoffnpc "ミリアム#c12_01_130";
		cloakoffnpc "アイラ#c12_01_131";
	}
	end;
}
oz_dun01.gat,223,114,3	script	約束の場所#c12_evt01_127	10043,{/* 15959 */
	if(EP18_1QUE == 54) {
		mes "^0000FF‐ミリアムに指定された場所には";
		mes "　マラムとスアドが待っていた‐^000000";
		cloakoffnpc "マラム#c12_01_128";
		cloakoffnpc "スアド#c12_01_129";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "大神殿での一件は";
		mes "母上とスアドから聞きました。";
		mes "大変でしたね。";
		mes "その場にいなかったのが";
		mes "悔やまれます……。";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "お前は、俺の依頼通り";
		mes "無事に隊商に荷を返してくれた。";
		mes "やるべき事をやったんだ。";
		mes "……それで十分だ。";
		next;
		cloakoffnpc "ミリアム#c12_01_130";
		cloakoffnpc "アイラ#c12_01_131";
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "もうみんな集まってるのか。";
		mes "冒険者さん、彼女は「アイラ」。";
		mes "父上の世話をしている者です。";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[アイラ]";
		mes "はじめまして！";
		mes "マラム兄さまもお久しぶりです。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "アイラ？";
		mes "彼女は今回の件と関係あるの？";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[アイラ]";
		mes "アマール様の別荘に行くんですよね？";
		mes "私はアマール様の車いすを押して";
		mes "いろんな場所に出入りしますから";
		mes "別荘の「鍵」も持っているですよ。";
		next;
		mes "[アイラ]";
		mes "お話は、ミリアム姉さまから聞きました。";
		mes "私も別荘に何かあると思っています。";
		next;
		mes "[アイラ]";
		mes "しばらく前から、アマール様が別荘を";
		mes "司祭見習いたちに貸していたんです。";
		mes "関係者に別荘を貸すのは";
		mes "以前からありましたけど";
		mes "今回は様子がおかしくて……。";
		next;
		mes "[アイラ]";
		mes "別荘に泊っている人たちが";
		mes "司祭というのは嘘ですね。";
		mes "何というか……怪しい団体というか";
		mes "普通じゃないんです。";
		next;
		mes "[アイラ]";
		mes "特に……前髪で目が隠れている";
		mes "あの女性……";
		mes "意思の疎通がまるでできなくて……";
		mes "バケモノと会話しているみたいな……。";
		next;
		mes "[アイラ]";
		mes "アマール様が失脚してから";
		mes "戦争の話は聞かなくなりましたけど";
		mes "また戦争を企てておられるのかと思うと";
		mes "恐ろしくて恐ろしくて！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "心配はいらない。";
		mes "そんなことにならないよう";
		mes "私たちと冒険者様が動いているんだ。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "アイラの話を聞く限りだと";
		mes "別荘にいるのは神殿で出会った奴らで";
		mes "間違いないと思う。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "別荘にはボクと冒険者様とで";
		mes "行こうと思う。";
		mes "マラムとスアドは";
		mes "やることがあるよね？";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "それはそうだけど……";
		mes "スアド？";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[スアド]";
		mes "相当な危険を伴うだろうが……";
		mes "俺とマラムが行ったところで";
		mes "足手まといになるだけだろう。";
		next;
		mes "[スアド]";
		mes "冒険者、お前がミリアムを守れ。";
		mes "お前なら、できるだろう。";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "なるほど。";
		mes "冒険者様にならミリアムのこと";
		mes "安心してお任せできます。";
		mes "よろしくお願いします！";
		next;
		cutin "ep18_miriam_02.png", 0;
		mes "[ミリアム]";
		mes "決まりだね。";
		mes "頼りにしてるよ、冒険者さん。";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[アイラ]";
		mes "別荘の「鍵」を使って";
		mes "別荘の入口を出現させます。";
		mes "準備はよろしいですか？";
		set EP18_1QUE,55;
		delquest 17525;
		setquest 18083;
		close2;
		end;
	}
	if(EP18_1QUE == 55) {
		unittalk getnpcid(0,"アイラ#c12_01_131"),"アイラ : 準備できましたか？",1;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 54 || EP18_1QUE == 55)
		showevent 0, 1, "約束の場所#c12_evt01_127";
	else
		showevent 9999,0,"約束の場所#c12_evt01_127";
	end;
}
oz_dun01.gat,225,119,3	script	マラム#c12_01_128	10376,{/* 15960 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,223,120,5	script	スアド#c12_01_129	10378,{/* 15961 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,220,118,5	script	ミリアム#c12_01_130	10377,{/* 15962 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,219,117,5	script	アイラ#c12_01_131	475,{/* 15963 (cloaking)*/
	if(EP18_1QUE == 55) {
		if(mdopenstate("High Priest's villa") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[アイラ]";
			mes "準備ができましたら";
			mes "別荘へ案内しましょう。";
			set '@menu$,"「大神官の別荘」入場";
		}
		else {
			mes "[アイラ]";
			mes "アマール様の別荘は";
			mes "「鍵」を使うことでしか入れないんです。";
			mes "魔法？　みたいなもので";
			mes "普通は入れないそうです。";
			next;
			mes "[アイラ]";
			mes "準備ができましたら";
			mes "「鍵」を使って、入口を繋げますね。";
			set '@menu$,"「大神官の別荘」(High Priest's villa)の作成";
		}
		next;
		if(select("やめる",'@menu$) == 1) {
			mes "[アイラ]";
			mes "準備が整うまで待っていますね。";
			close;
		}
		if(mdopenstate("High Priest's villa")) {
			mes "[アイラ]";
			mes "では、別荘へ案内します。";
			close2;
			switch(mdenter("wolf in sheep's clothing")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[High Priest's villa] に入場しました　 : 　" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("HighPriestsVillaControl1")+ "::OnStart";
				//warp "1@adv.gat", 123, 17;
				close;
			case 1:	// パーティー未加入
				mes "[インフォメーション]";
				mes "パーティーに加入していないため";
				mes "入場できません。";
				close;
			case 2:	// ダンジョン未作成
				mes "[アイラ]";
				mes "パーティーリーダーに";
				mes "準備ができたのか";
				mes "確認していただけますか？";
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
			mdcreate "High Priest's villa";
			mes "■パーティー名";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "■パーティーリーダー";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "　";
			mes "^006400High Priest's villa^000000の作成申請を受け付けます。";
			close;
		}
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 55)
		showevent 0, 1, "アイラ#c12_01_131";
	else
		showevent 9999,0,"アイラ#c12_01_131";
	end;
OnInit:
	cloakonnpc;
	end;
}

ra_temin.gat,261,121,0	script	#ep18w04_140	139,{/* 15964 */}
ra_temin.gat,256,130,0	script	#ep18w10_146	139,{/* 15965 */}
ra_temin.gat,256,130,1	script	神殿騎士#c12_02_132	934,3,3,{/* 15966 */
	mes "[神殿騎士]";
	mes "こちら関係者以外は立入禁止です。";
	mes "お引き取りください。";
	close;
OnTouch:
	unittalk getnpcid(0,"神殿騎士#c12_02_132"),"神殿騎士 : 関係者以外立ち入り禁止です",1;
	warp "ra_temin.gat",255,138;
	end;
}
ra_temin.gat,259,111,1	script	マラム#c12last_133	10376,{/* 15967 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,254,114,7	script	スアド#c12last_134	10378,{/* 15968 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,258,114,3	script	ニルエン#c12last_135	915,{/* 15969 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,254,117,5	script	ミリアム#c12_02_136	10377,{/* 15970 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,258,117,3	script	スマートエリーの形象#c1	10354,{/* 15971 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,27,184,0	script	#ep18w10_152	139,14,14,{/* 15972 */
	if(checkquest(11725) || checkquest(11726))
		cloakoffnpc "イムリル#ep18_sb1";
	end;
}
oz_dun01.gat,27,184,5	script	イムリル#ep18_sb1	10379,{/* 15973 (cloaking)*/
	if(checkquest(11725)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ふぅ～～、あっつい！";
		mes "前は涼しい洞窟だったのに";
		mes "今はジッとしてても";
		mes "汗が滝のように流れるよ。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "長くいるとフラフラになるから";
		mes "さっさと回って調査しよう。";
		mes "まずこの道は^e5555e一本道^000000だから";
		mes "このまま歩いて進めばいい。";
		delquest 11725;
		setquest 11726;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11726)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ふぅ～～、あっつい！";
		mes "前は涼しい洞窟だったのに";
		mes "今はジッとしてても";
		mes "汗が滝のように流れるよ。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "長くいるとフラフラになるから";
		mes "さっさと回って調査しよう。";
		mes "まずこの道は^e5555e一本道^000000だから";
		mes "このまま歩いて進めばいい。";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11725))
		showevent 0, 3, "イムリル#ep18_sb1";
	else
		showevent 9999,0,"イムリル#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,68,284,5	script	箱#ep18_sb1	10250,{/* 15974 */
	if(checkquest(11726)) {
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "おっと、これは……";
		mes "誰かが荷物を置いて行ったんだ。";
		mes "モンスターと鉢合わせしたり";
		mes "疲れて動けなくなった時に";
		mes "こうやって荷物を隠したりする。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "荷物運びは大事だけど";
		mes "命はひとつしかないからね。";
		next;
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "この荷物は後で回収するとして";
		mes "先に進もう。";
		delquest 11726;
		setquest 11727;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11727)) {
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "おっと、これは……";
		mes "誰かが荷物を置いて行ったんだ。";
		mes "モンスターと鉢合わせしたり";
		mes "疲れて動けなくなった時に";
		mes "こうやって荷物を隠したりする。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "荷物運びは大事だけど";
		mes "命はひとつしかないからね。";
		next;
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "この荷物は後で回収するとして";
		mes "先に進もう。";
		delquest 11726;
		setquest 11727;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : ‐箱が放置されている‐",1;
	end;
OnQuestInfo:
	if(checkquest(11726))
		showevent 0, 3, "箱#ep18_sb1";
	else
		showevent 9999,0,"箱#ep18_sb1";
	end;
}
oz_dun01.gat,65,189,0	script	#ep18w10_153	139,{/* 15975 */
	if(checkquest(11727))
		cloakoffnpc "険しい道#ep18_sb1";
	end;
}
oz_dun01.gat,65,189,5	script	険しい道#ep18_sb1	10428,{/* 15976 (cloaking)*/
	if(checkquest(11727)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ここは険しいから気を付けてくれ。";
		mes "うっかり滑ったら";
		mes "足首の骨が逝っちゃうからさ。";
		mes "ふぅ！";
		next;
		mes "[イムリル]";
		mes "ここからはもっと下りだ。";
		mes "^e5555e南の方^000000に進もう。";
		delquest 11727;
		setquest 11728;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11728)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ここは険しいから気を付けてくれ。";
		mes "うっかり滑ったら";
		mes "足首の骨が逝っちゃうからさ。";
		mes "ふぅ！";
		next;
		mes "[イムリル]";
		mes "ここからはもっと下りだ。";
		mes "^e5555e南の方^000000に進もう。";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11727))
		showevent 0, 3, "険しい道#ep18_sb1";
	else
		showevent 9999,0,"険しい道#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,111,96,0	script	#ep18w10_154	139,14,14,{/* 8413 */
	if(checkquest(11728))
		cloakoffnpc "蒸気の出る穴#ep18_sb1";
	end;
}
oz_dun01.gat,111,96,5	script	蒸気の出る穴#ep18_sb1	10428,{/* 8414 (cloaking)*/
	if(checkquest(11728)) {
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "あっつ！　あっつ!!!";
		mes "亀裂の隙間から";
		mes "蒸気が漏れてる！";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "ここの温度が高くなってきてるんだ。";
		mes "溶岩が近くに来てるのかもね。";
		mes "このままだといずれ";
		mes "この道も使えなくなるかもなぁ。";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[？？？]";
		mes "<FONT SIZE = 16><B>イムリル!!</FONT></B>";
		next;
		mes "‐近くでイムリルを呼ぶ声が聞こえた。";
		mes "　声の主を探してみよう‐";
		delquest 11728;
		setquest 11729;
		cloakoffnpc "休んでいる男性#ep18_sb1";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(11728))
		showevent 0, 3, "蒸気の出る穴#ep18_sb1";
	else
		showevent 9999,0,"蒸気の出る穴#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,100,92,0	script	#ep18w10_155	139,14,14,{/* 8415 */
	if(checkquest(11729) || checkquest(11730) || checkquest(11731))
		cloakoffnpc "休んでいる男性#ep18_sb1";
	end;
}
oz_dun01.gat,100,92,3	script	休んでいる男性#ep18_sb1	10396,{/* 8416 (cloaking)*/
	if(checkquest(11729)) {
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "ポールズさん。";
		mes "大丈夫？";
		next;
		cutin "ep18_imril_02.png", 255;
		mes "[ポールズ]";
		mes "モンスターから逃げ回ってたら";
		mes "蒸気に当たっちまった……";
		mes "慣れた道だからと油断したよ。";
		next;
		mes "[ポールズ]";
		mes "荷物もどこに落としたのか";
		mes "よく分からない。";
		mes "最悪だな……。";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "荷物より命の方が大事だよ。";
		mes "そんなに気を落とすことはないさ。";
		next;
		cutin "ep18_imril_02.png", 255;
		mes "[ポールズ]";
		mes "ハハハ。";
		mes "そうだな。";
		mes "ありがとう。";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "薬を持って来てるから";
		mes "先に村に帰ってて。";
		mes "荷物は後で探すからさ。";
		next;
		cutin "ep18_imril_02.png", 255;
		mes "[ポールズ]";
		mes "村の貴重な資源を";
		mes "浪費するわけにはいかんよ。";
		mes "少し休めば動けるようになる。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "強情だなぁ。";
		mes "じゃあ、";
		mes "おいらが自腹の回復剤で";
		mes "ボールズさんの手当てをするから";
		mes "冒険者さん";
		mes "ちょっとだけ待っててよ。";
		next;
		mes "[ポールズ]";
		mes "……そういうお前も";
		mes "強情だからな。";
		mes "……すまないが、";
		mes "言葉に甘えるとしよう。";
		delquest 11729;
		setquest 11730;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11730)) {
		mes "‐イムリルが慣れた手つきで";
		mes "　ポールズさんに";
		mes "　手当てをしている‐";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "…………";
		mes "…………";
		mes "…………これでよしっと。";
		next;
		cutin "ep18_imril_04.png", 255;
		mes "[ポールズ]";
		mes "よいしょっと。";
		mes "おかげで動けるまでは回復したよ。";
		mes "二人ともありがとう。";
		mes "それじゃあ、村に出発するよ。";
		next;
		mes "[ポールズ]";
		mes "イムリル、調査を続けるなら";
		mes "気を付けるんだぞ。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "わかってるって。";
		mes "ポールズさんもモンスターに";
		mes "追い掛けられないように";
		mes "気を付けて。";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "う～～ん。";
		mes "モンスターだけじゃなくて";
		mes "噴き出す蒸気も問題だな。";
		next;
		mes "[イムリル]";
		mes "村の人がここまで来ることは";
		mes "滅多にないけど、";
		mes "モンスターに追われて";
		mes "道を間違えたりするからなぁ。";
		next;
		mes "[イムリル]";
		mes "もう少し奥も調査しておくか。";
		delquest 11730;
		setquest 11731;
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	mes "[ポールズ]";
	mes "すぐ村に戻るって。";
	mes "心配しなさんな。";
	close;
OnQuestInfo:
	if(checkquest(11729) || checkquest(11730))
		showevent 0, 3, "休んでいる男性#ep18_sb1";
	else
		showevent 9999,0,"休んでいる男性#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,134,56,5	script	箱#ep18_sb2	10250,{/* 8417 */
	if(checkquest(11731)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ここにも荷物があるな。";
		mes "ポールズさんの荷物かな？";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "回収は後回しにしよう。";
		mes "先に奥の方を";
		mes "調査しに行こう。";
		delquest 11731;
		setquest 11732;
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	if(checkquest(11732)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ここにも荷物があるな。";
		mes "ポールズさんの荷物かな？";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "回収は後回しにしよう。";
		mes "先に下の方を";
		mes "調査しに行こう。";
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : ‐箱が放置されている‐",1;
	end;
OnQuestInfo:
	if(checkquest(11731))
		showevent 0, 3, "箱#ep18_sb2";
	else
		showevent 9999,0,"箱#ep18_sb2";
	end;
}

oz_dun01.gat,110,37,0	script	#ep18w10_156	139,{/* 8418 */
	if(checkquest(11732) || checkquest(11733))
		cloakoffnpc "熱気#ep18_sb2";
	end;
}
oz_dun01.gat,110,37,5	script	熱気#ep18_sb2	10428,{/* 8419 (cloaking)*/
	if(checkquest(11732)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "うへぇ……";
		mes "ここも凄い熱気だ。";
		mes "この下はここより危険だから";
		mes "これまで以上に注意して。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "冒険者さんがいるから";
		mes "おいらもここまで来れたんだ。";
		mes "ひとりじゃ危なくて進めないからね。";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "さて……それじゃ意を決して";
		mes "下に降りるとするか。";
		delquest 11732;
		setquest 11733;
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	if(checkquest(11733)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "うへぇ……";
		mes "ここも凄い熱気だ。";
		mes "この下はここより危険だから";
		mes "これまで以上に注意して。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "冒険者さんがいるから";
		mes "おいらもここまで来れたんだ。";
		mes "ひとりじゃ危なくて進めないからね。";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "さて……それじゃ意を決して";
		mes "下に降りるとするか。";
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11732))
		showevent 0, 3, "熱気#ep18_sb2";
	else
		showevent 9999,0,"熱気#ep18_sb2";
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun02.gat,152,276,0	script	#ep18w10_157	139,14,14,{/* 8420 */
	if(checkquest(11733) || checkquest(11734))
		cloakoffnpc "イムリル#ep18_sb3";
	end;
}
oz_dun02.gat,152,276,5	script	イムリル#ep18_sb3	10379,{/* 8421 (cloaking)*/
	if(checkquest(11733)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ここいらは、生息してるモンスターも";
		mes "違ってる。";
		mes "冒険者さんも気を付けて。";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "長居は危険だから";
		mes "少し回ったら村に帰った方がいいな。";
		delquest 11733;
		setquest 11734;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11734)) {
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "ここいらは、生息してるモンスターも";
		mes "違ってる。";
		mes "冒険者さんも気を付けて。";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "長居は危険だから";
		mes "少し回ったら村に帰った方がいいな。";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11733))
		showevent 0, 3, "イムリル#ep18_sb3";
	else
		showevent 9999,0,"イムリル#ep18_sb3";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun02.gat,143,231,3	script	老人#ep18_sb1	10393,{/* 8422 */
	if(checkquest(11734)) {
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "あっ！";
		mes "オジイ！";
		mes "なんでこんなところに!?";
		next;
		cutin "ep18_imril_03.png", 255;
		mes "[迷路番のオジイ]";
		mes "最近モンスターが騒がしいから";
		mes "誰ぞ道に迷っとらんかと";
		mes "見回っておるんじゃ。";
		mes "お前こそ、何をしとる？";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "迷路の調査に来たんだよ。";
		mes "モンスターの分布だったり";
		mes "蒸気の位置を調べたり。";
		next;
		cutin "ep18_imril_03.png", 255;
		mes "[迷路番のオジイ]";
		mes "そうか。ならば";
		mes "溶岩がここまで上がってきたと";
		mes "スアドの奴に伝えてくれ。";
		next;
		mes "[迷路番のオジイ]";
		mes "それと、こっから先は";
		mes "地面が溶け始めておるから";
		mes "立入禁止にした方が良いぞ。";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "わかったよ。";
		mes "それじゃあ、ほら、";
		mes "オジイも一緒に村に帰ろう。";
		next;
		cutin "ep18_imril_03.png", 255;
		mes "[迷路番のオジイ]";
		mes "儂は帰らん。";
		mes "迷路番がおらんようになったら";
		mes "この道を誰が管理するんじゃ？";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "やれやれ……";
		mes "相変わらず頑固なんだから。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "よし、調査はこれぐらいにして";
		mes "引き上げよう。";
		mes "これ以上、ここにいたら";
		mes "干からびちゃうよ。";
		delquest 11734;
		setquest 11735;
		cloakonnpc "イムリル#ep18_sb3";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11735)) {
		mes "[迷路番のオジイ]";
		mes "儂は帰らん。";
		mes "迷路番がおらんようになったら";
		mes "この道を誰が管理するんじゃ？";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[イムリル]";
		mes "やれやれ……";
		mes "相変わらず頑固なんだから。";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[イムリル]";
		mes "よし、調査はこれぐらいにして";
		mes "引き上げよう。";
		mes "これ以上、ここにいたら";
		mes "干からびちゃうよ。";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11734))
		showevent 0, 3, "老人#ep18_sb1";
	else
		showevent 9999,0,"老人#ep18_sb1";
	end;
}


oz_dun01.gat,112,30,0	script	#to_oz_dun02	45,1,1,{/* 8431 */
	warp "oz_dun02.gat",142,279;
	end;
}
oz_dun02.gat,142,284,0	warp	#to_oz_dun01	1,1,oz_dun01.gat,112,34	// 8432 from: oz_dun02.gat(142, 283)

rachel.gat,176,80,0	script	#灰色森花スタート	139,5,5,{/* 15987 */
	if(checkquest(130111)) {
		cloakoffnpc "貪欲な男性#E18_1";
		cloakoffnpc "虐待される子供#E18_2";
		mes "‐貪欲そうな男が";
		mes "　子供を叱りつけている‐";
		next;
		if(select("様子を見てみる","無視する") == 2) {
			mes "‐その場を去った‐";
			close;
		}
		mes "[貪欲な男性]";
		mes "行き場のない原住民のお前に";
		mes "仕事をくれてやったのに";
		mes "お客様の財布に手を出すとは！";
		mes "え～い、お前はクビだ！";
		mes "すぐに失せろ！";
		next;
		misceffect 0,"虐待される子供#E18_2";
		mes "[子供]";
		mes "社長、すみませんでした。";
		mes "どうかクビだけは……";
		mes "父さんの薬代が要るんです！";
		mes "せめて今までの給料だけでも……。";
		next;
		emotion 28,"虐待される子供#E18_2";
		misceffect 0,"虐待される子供#E18_2";
		cloakonnpc "虐待される子供#E18_2";
		cloakoffnpc "虐待される子供#E18_4";
		emotion 6,"貪欲な男性#E18_1";
		unittalk getnpcid(0,"貪欲な男性#E18_1"),"貪欲な男性 : ええい、むかつく。";
		mes "[貪欲な男性]";
		mes "はあ？　給料だぁ！？";
		mes "財布を盗んでおいて給与だと？";
		mes "賠償を請求したいのは、こっちだ！";
		mes "さっさと失せろ！";
		next;
		delquest 130111;
		setquest 5932;
		cloakonnpc "貪欲な男性#E18_1";
		close;
	}
	else if(checkquest(5932)) {
		cloakonnpc "虐待される子供#E18_2";
		cloakoffnpc "虐待される子供#E18_4";
	}
	else {
		cloakonnpc "貪欲な男性#E18_1";
		cloakonnpc "虐待される子供#E18_2";
		cloakonnpc "虐待される子供#E18_4";
	}
	end;
OnQuestInfo:
	if(checkquest(130111))
		showevent 0, 3, "#灰色森花スタート";
	else
		showevent 9999,0,"#灰色森花スタート";
	end;
}
rachel.gat,169,79,0	script	#演出用ワープ	45,{/* 15988 */}
rachel.gat,170,80,6	script	貪欲な男性#E18_1	934,{/* 15989 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,172,80,4	script	虐待される子供#E18_2	944,{/* 15990 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,180,80,4	script	虐待される子供#E18_4	944,{/* 15991 (cloaking)*/
	if(checkquest(5932)) {
		mes "[子供]";
		mes "……あ～あ。";
		mes "楽な仕事だったから";
		mes "結構気に入ってたんだけど";
		mes "盗みがバレちゃしょうがねえや。";
		next;
		menu "大丈夫？",-;
		mes "[子供]";
		mes "あん？";
		mes "なんだ、よそ者か。";
		mes "同情なんていらないぜ。";
		mes "ここいらじゃ原住民への差別は";
		mes "日常茶飯事だからな。";
		next;
		mes "‐目の前の子供はそう言うと";
		mes "　懐から小銭入れを取り出した‐";
		next;
		mes "[子供]";
		mes "社長もアホだよなぁ。";
		mes "俺が盗んだのは社長の財布なのに。";
		mes "さ～～て、幾ら入ってるかなぁ。";
		next;
		mes "[子供]";
		mes "いち、に、さん、し、ご、ろく……";
		mes "お！";
		mes "さっすが社長さん。";
		mes "たんまり持ってるねぇ。";
		next;
		menu "返した方が良いんじゃない？",-;
		mes "[子供]";
		mes "ばっかお前！";
		mes "俺はあいつから給料もらってないの。";
		mes "これは正当な報酬ってわけ。";
		mes "さ～って、事業資金も溜まったし";
		mes "ここいらで一旗揚げるとするか！";
		next;
		menu "事業資金？",-;
		mes "[子供]";
		mes "お前、目ざといなぁ……";
		mes "はは～ん、さては俺のかっちょいい";
		mes "事業のアイデアを知りたいんだな？";
		next;
		mes "[子供]";
		mes "俺の事業を手伝う気があるなら";
		mes "教えてやってもいいぜ。";
		mes "その気があるなら、俺のところに来な。";
		mes "おっと、俺の名前を教えておいて";
		mes "やらねえとな。";
		next;
		delquest 5932;
		setquest 5933;
	}
	mes "[メザイ]";
	mes "俺の名前は「^0000FFメザイ^000000」だ。";
	mes "忘れんなよ？";
	mes "そんじゃな！";
	cloakonnpc "虐待される子供#E18_4";
	next;
	mes "-メザイの元に向かいますか？-";
	next;
	if(select("メザイの元に向かう","やめておく") == 2) {
		mes "-その場から離れた-";
		close;
	}
	mes "-メザイの元に向かう事にした-";
	close2;
	warp "rachel.gat", 70, 129;
	end;
OnQuestInfo:
	if(checkquest(5932))
		showevent 0, 3, "虐待される子供#E18_4";
	else
		showevent 9999,0,"虐待される子供#E18_4";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,66,135,0	script	#フラワールーム本店	139,14,14,{/* 15992 */
OnTouch:
	if(checkquest(5933) || checkquest(5934)) {
		cloakoffnpc "メザイ#E18_5";
		cloakonnpc "メザイ#E18_7";
	}
	else if(checkquest(5935)) {
		cloakoffnpc "メザイ#E18_5";
		cloakoffnpc "ハーフフラワー#E18_6";
		cloakonnpc "メザイ#E18_7";
	}
	else if(checkquest(5936)) {
		if(checkquest(5936)&8) {
			cloakonnpc "メザイ#E18_5";
			cloakonnpc "ハーフフラワー#E18_6";
			cloakoffnpc "メザイ#E18_7";
		}
		else {
			cloakoffnpc "メザイ#E18_5";
			cloakonnpc "ハーフフラワー#E18_6";
			cloakonnpc "メザイ#E18_7";
		}
	}
	else {
		cloakonnpc "メザイ#E18_5";
		cloakonnpc "ハーフフラワー#E18_6";
		cloakonnpc "メザイ#E18_7";
	}
	end;
}
rachel.gat,70,135,4	script	メザイ#E18_5	944,{/* 15993 (cloaking)*/
	if(checkquest(5933)) {
		mes "[メザイ]";
		mes "らっしゃっせー……";
		mes "って、なんだ、さっきの冒険者か。";
		mes "ここに来たってことは……";
		mes "俺の事業を手伝ってくれるんだな？";
		next;
		if(select("話を聞きたい","興味ない") == 2) {
			mes "[メザイ]";
			mes "なんだ、冷やかしかよ。";
			mes "帰れ帰れ！";
			close;
		}
		mes "[メザイ]";
		mes "よーし、耳の穴をかっぽじって";
		mes "よーく聞けよ！";
		mes "俺の事業ってのは、この街で";
		mes "花を売ることだ！";
		next;
		menu "それだけ？",-;
		mes "[メザイ]";
		mes "はぁ～これだからよそ者は！";
		mes "砂漠の街で花を売るってのが";
		mes "どれだけ革新的なことか";
		mes "わかってねえだろ？";
		next;
		mes "[メザイ]";
		mes "この街で売られてる花は";
		mes "ぜ～～んぶ造花なんだ。";
		mes "つまり、偽物！";
		mes "だけど、俺が売ろうとしてるのは";
		mes "本物の生花なんだよ！";
		next;
		menu "生花をどうやって手に入れる？",-;
		mes "[メザイ]";
		mes "ふ～ん、鋭いな、よそ者。";
		mes "気にいったぜ。";
		mes "そうそう、そこが肝ってわけだ。";
		next;
		mes "[メザイ]";
		mes "「ハーフフラワー」って知ってるか？";
		mes "もっとも、原住民でなきゃ";
		mes "聞いたこともないだろうけどな。";
		next;
		mes "[メザイ]";
		mes "ハーフフラワーってのは";
		mes "灰色狼の森にのみ咲く花だ。";
		mes "俺のオトンがオカンに";
		mes "プロポーズする時に贈ったんだ。";
		next;
		mes "[メザイ]";
		mes "オカンはとっくに死んじまって";
		mes "オトンも飲んだくれになってるけど";
		mes "俺はオトンから";
		mes "ハーフフラワーについて";
		mes "いろいろ聞かされてきたのさ。";
		next;
		mes "[メザイ]";
		mes "ハーフフラワーが咲く場所が";
		mes "木の根元なら何だかんだ……";
		mes "石の下ならああのこうの……";
		mes "草の側なら……ってな風に。";
		next;
		mes "[メザイ]";
		mes "ま、そういうわけで";
		mes "ハーフフラワーを仕入れて";
		mes "街で売るって事業を思いついたのさ。";
		mes "じゃあ、こっからが本題だ。";
		next;
		mes "[メザイ]";
		mes "冒険者のアンタには";
		mes "「ハーフフラワー」を仕入れてきて";
		mes "欲しいんだ。";
		mes "まずは安定的に商品となるものを";
		mes "仕入れるのが大事だからな。";
		next;
		if(select("手伝う","今は無理だ") == 2) {
			mes "[メザイ]";
			mes "ちぇっ！";
			mes "せっかくビッグになれる";
			mes "チャンスなのにな！";
			close;
		}
		mes "[メザイ]";
		mes "へっへっへ！";
		mes "それじゃ、俺と契約しよう。";
		mes "これから俺のことは";
		mes "「シャチョーさん」と呼ぶように。";
		next;
		delquest 5933;
		setquest 5934;
		mes "[メザイ]";
		mes "代わりに、社員教育は";
		mes "バッチリしてやるからな。";
		mes "まず、ハーフフラワーの採取方法から";
		mes "教えてやるから";
		mes "準備ができたら、話しかけてくれ。";
		close;
	}
	if(checkquest(5934)) {
		mes "[メザイ]";
		mes "おっほん！　";
		mes "ハーフフラワーの採集について";
		mes "講義をはじめる。";
		mes "準備はいいか？";
		next;
		if(select("始めてくださいシャッチョーさん","ちょっと待って") == 2) {
			mes "[メザイ]";
			mes "さっさと準備してくれよ～。";
			close;
		}
		mes "[メザイ]";
		mes "では、始めるぞ！";
		mes "ハーフフラワーの採集は";
		mes "大きく分けて4つの工程に分けられる。";
		mes "先ず始めに「茎」を切るんだ。";
		next;
		mes "[メザイ]";
		mes "二番目は、切った茎から";
		mes "葉っぱを除去して……";
		next;
		mes "[メザイ]";
		mes "三番目にお花を挿す小さい瓶に";
		mes "水と秘伝の粉を入れて……";
		mes "よく混ぜる！";
		next;
		mes "[メザイ]";
		mes "最後は、小さい瓶に茎の先端を浸けて";
		mes "花が痛まないように丁寧に包装！";
		mes "ほい、完成！";
		next;
		mes "[メザイ]";
		mes "簡単だろ？　まあ実際には";
		mes "花が咲いてる場所によって";
		mes "茎を切る角度や除去する葉っぱの数や";
		mes "水に入れる粉の量が違うから";
		mes "あとでマニュアルを渡すよ。";
		next;
		mes "[メザイ]";
		mes "さて、注目～。";
		mes "ここに練習用のハーフフラワーがある。";
		mes "こいつで練習してもらう。";
		next;
		delquest 5934;
		setquest 5935;
		cloakoffnpc "ハーフフラワー#E18_6";
		mes "[メザイ]";
		mes "今回は、木の下に咲くタイプで";
		mes "やるとするかー。";
		mes "準備ができたら花を調べてくれよ。";
		close;
	}
	if(checkquest(5935)) {
		mes "[メザイ]";
		mes "さて、注目～。";
		mes "ここに練習用のハーフフラワーがある。";
		mes "こいつで練習してもらう。";
		next;
		mes "[メザイ]";
		mes "今回は、木の下に咲くタイプで";
		mes "やるとするかー。";
		mes "準備ができたら花を調べてくれよ。";
		close;
	}
	if(checkquest(5936)) {
		if(countitem(1000407) == 0) {
			cloakoffnpc "ハーフフラワー#E18_6";
			setquest 5935;
			delquest 5936;
			mes "[メザイ]";
			mes "なんだぁ？";
			mes "練習用のハーフフラワーが枯れてるな。";
			mes "これじゃ売り物になんねえよ。";
			mes "もう一回、練習しなきゃダメだ。";
			close;
		}
		mes "[メザイ]";
		mes "お疲れぃ！";
		mes "なかなかやるじゃん。";
		mes "物覚えが早くて助かるぜ。";
		mes "今の要領で花を仕入れてくるんだ。";
		next;
		mes "[メザイ]";
		mes "ちなみに、花は鮮度が命だ！";
		mes "手に入れた花は";
		mes "できるだけ早く持って来てくれよ。";
		next;
		mes "[メザイ]";
		mes "採取方法を上手くやればその分";
		mes "長持ちするからな。";
		next;
		delitem 1000407,1;
		compquest 5936;
		cloakonnpc "メザイ#E18_5";
		cloakoffnpc "メザイ#E18_7";
		mes "[メザイ]";
		mes "さて、本格的な仕事は";
		mes "これからだ！";
		mes "また来てくれよ。";
		mes "そんじゃな！";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(5933) || checkquest(5934) || (checkquest(5936) && !(checkquest(5936)&8)))
		showevent 0, 3, "メザイ#E18_5";
	else
		showevent 9999,0,"メザイ#E18_5";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,72,133,4	script	ハーフフラワー#E18_6	10392,{/* 15994 (cloaking)*/
	if(checkquest(5935)) {
		mes "^0000FF‐練習用のハーフフラワーだ‐^000000";
		next;
		mes "[メザイ]";
		mes "今回は、木の下にハーフフラワーが";
		mes "咲いていると想定したパターンで";
		mes "練習するからな。";
		next;
		mes "^ff0000[インフォメーション]";
		mes "クエストウィンドウの";
		mes "「灰色狼の森の花」を";
		mes "確認して進めてみましょう。^000000";
		next;
		mes "[メザイ]";
		mes "まずは、ハーフフラワーの茎を切る！";
		next;
		switch(select("10度の角度で切る","20度の角度で切る","30度の角度で切る","40度の角度で切る")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[メザイ]";
		mes "次は葉を落とす。";
		mes "残したい葉っぱ以外は";
		mes "全部除去するんだぞ。";
		next;
		switch(select("2枚を残す","4枚を残す","6枚を残す","8枚を残す")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[メザイ]";
		mes "次は、瓶に水を入れるんだ。";
		next;
		switch(select("20mlを入れる","30mlを入れる","40mlを入れる","50mlを入れる")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[メザイ]";
		mes "水を入れたら";
		mes "俺が作った秘伝の粉を";
		mes "瓶に入れて水と混ぜる！";
		next;
		switch(select("2グラム入れる","4グラム入れる","6グラム入れる","8グラム入れる")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[メザイ]";
		mes "最後は、切った花を";
		mes "瓶に入れて包装すれば！";
		mes "でっきあがりーー！";
		next;
		// 採取方法の一致で制限時間延長
		getitem2 1000407,1,1,0,0,0,0,0,0,1800;
		delquest 5935;
		setquest 5936;
		cloakonnpc "ハーフフラワー#E18_6";
		mes "[メザイ]";
		mes "じゃあ、今採取したハーフフラワーを";
		mes "俺に渡してくれ！";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(5935))
		showevent 0, 3, "ハーフフラワー#E18_6";
	else
		showevent 9999,0,"ハーフフラワー#E18_6";
	end;
OnInit:
	setnpctitle "練習用";
	cloakonnpc;
	end;
}
rachel.gat,70,135,4	script	メザイ#E18_7	944,{/* 15995 (cloaking)*/
	if(checkquest(5942) && !checkquest(5943)) {
		cloakoffnpc "お客#E18_8";
		unittalk getnpcid(0,"お客#E18_8"),"お客 : ふむふむ……";
		if(!sleep2(1000)) end;
		mes "[メザイ社長]";
		mes "らっしゃっせー！";
		mes "お客様！";
		mes "今日は何をご所望ですか？";
		next;
		mes "[お客]";
		mes "ふむ……いつものヤツをお願いするよ。";
		mes "ところで、相談なんだが";
		mes "ここって配達サービスはやってないの？";
		next;
		mes "[お客]";
		mes "毎回買いに来るのが面倒でな。";
		mes "配達サービスがあるなら";
		mes "それで頼みたいんだが。";
		next;
		mes "[メザイ社長]";
		mes "はっはぁ～！";
		mes "配達サービスももちろん可能です！";
		mes "なにせ、今から始めちゃいますから！";
		next;
		mes "[お客]";
		mes "ほほ～そりゃよかった。";
		mes "では今日から配達してくれ。";
		mes "誰に送って欲しいのか教えるから。";
		next;
		cloakonnpc "お客#E18_8";
		setquest 5943;
		compquest 5943;
		mes "[メザイ社長]";
		mes "……というわけだ！";
		mes "今日からこの『フラワールーム』は";
		mes "配達サービスを開始するぞ！";
		mes "もちろん、手伝ってくれよな！";
		mes "ヨロシク！";
		close;
	}
	if(checkquest(5936) && checkquest(5936)&8) {
		mes "[メザイ社長]";
		mes "よし！";
		mes "じゃあ今から俺の店";
		mes "『フラワールーム』の開業式をやろうと";
		mes "思う！";
		mes "あんたも参加してけよ。";
		next;
		mes "[メザイ社長]";
		mes "まずはシャチョーの挨拶だ。";
		mes "うおっほん！";
		next;
		mes "[メザイ社長]";
		mes "俺はラヘルの生花キングになる!!";
		mes "超ビッグになってやるから";
		mes "そこんとこ、ヨロシク！";
		next;
		delquest 5936;
		setquest 5942;
		compquest 5942;
		mes "[メザイ社長]";
		mes "以上！";
		mes "開業式終わり！";
		mes "さあ、働くぞーー！";
		next;
	}
	if(checkquest(5943)) {
		unittalk "メザイ社長 : 今日も、はりきってくぞー！";
		unittalk "メザイ社長 : 今日は木曜か？　まだまだ働くぞーー！";
	}
	mes "[メザイ社長]";
	mes "今日もヨロシクな！";
	next;
	switch(select("今は手伝えない","ハーフフラワーの採集","ハーフフラワーの配送")) {
	case 1:
		mes "[メザイ社長]";
		mes "おいおい！";
		mes "そんなんじゃビッグになれねぇぞ！";
		close;
	case 2:
		if(checkquest(5947)) {
			mes "[メザイ社長]";
			mes "配達に行くんだろ？";
			mes "今日は配達に専念してくれよな！";
			close;
		}
		mes "[メザイ社長]";
		mes "お！　ハーフフラワーの採集に";
		mes "行ってくれるのか？";
		next;
		if(select("採集してきます","やっぱりやめます") == 2) {
			mes "[メザイ社長]";
			mes "おいおい！";
			mes "そんなんじゃビッグになれねぇぞ！";
			close;
		}
	case 3:
		if(checkquest(5947)) {
			mes "[メザイ社長]";
			mes "渡したメモに書かれた";
			mes "宛先に届けてくれ。";
			mes "間違えるなよ～？";
			close;
		}
		if(checkquest(5949)) {
			delquest 5947;
			delquest 5949;
			setquest 5937;
			getitem 1000405,5;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			mes "[メザイ社長]";
			mes "間違った宛先に";
			mes "花を届けてねぇか？";
			mes "ま、いっか！";
			mes "お代は先にもらってるしな！";
			mes "バレねぇバレねぇ！";
			next;
			mes "[メザイ社長]";
			mes "次は気を付けようぜ！";
			mes "お疲れぃ！";
			close;
		}
		mes "[メザイ社長]";
		mes "お！";
		mes "配達に出てくれるのか。";
		mes "へへっ助かるぜ！";
		next;
		if(select("配達先を教えて","やっぱりやめる") == 2) {
			mes "[メザイ社長]";
			mes "おいおい！";
			mes "そんなんじゃビッグになれねぇぞ！";
			close;
		}
		getitem 1000407,1;	//名前入り
		setquest 5947;
		mes "[メザイ社長]";
		mes "あいよ！";
		mes "メモを渡すから、そこに書かれた";
		mes "宛先に届けてくれ。";
		mes "間違えるなよ～？";
		next;
		mes "[メザイ社長]";
		mes "花にはあんたの名前が入ってるが";
		mes "確認手続き用だから";
		mes "あんまり気にしなくて良いぜ。";
		mes "んじゃ、ヨロシクな！";
		close;
	}
OnQuestInfo:
	if((checkquest(5936) && checkquest(5936)&8) || checkquest(5942))
		showevent 0, 3, "メザイ#E18_7";
	else
		showevent 9999,0,"メザイ#E18_7";
	end;
OnInit:
	setnpctitle "フラワールーム";
	cloakonnpc;
	end;
}
rachel.gat,67,134,8	script	お客#E18_8	10057,{/* 15996 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,114,66,2	script	花屋のおばさん#E18_9	701,{/* 15997 */
	end;
}
gw_fild01.gat,325,376,1	script	ハーフフラワー#EP18_R01	10392,{/* 15998 */}
gw_fild01.gat,280,106,1	script	ハーフフラワー#EP18_R02	10392,{/* 15999 */}

gw_fild01.gat,297,310,1	script	ハーフフラワー#EP18_L01	10392,{/* 16001 */}
gw_fild01.gat,219,211,1	script	ハーフフラワー#EP18_L02	10392,{/* 16002 */}
gw_fild01.gat,316,150,1	script	ハーフフラワー#EP18_L03	10392,{/* 16003 */}
gw_fild01.gat,157,92,1	script	ハーフフラワー#EP18_T01	10392,{/* 16004 */}
gw_fild01.gat,189,183,1	script	ハーフフラワー#EP18_T02	10392,{/* 16005 */}
gw_fild01.gat,202,358,1	script	ハーフフラワー#EP18_T03	10392,{/* 16006 */}
gw_fild01.gat,279,64,1	script	ハーフフラワー#EP18_T04	10392,{/* 16007 */}
gw_fild01.gat,159,206,1	script	ハーフフラワー#EP18_T05	10392,{/* 16008 */}
gw_fild01.gat,48,83,1	script	ハーフフラワー#EP18_W01	10392,{/* 16009 */}

wolfvill.gat,78,222,1	script	ハーフフラワー#EP18_W04	10392,{/* 16022 */}
wolfvill.gat,193,238,1	script	ハーフフラワー#EP18_W05	10392,{/* 16023 */}
wolfvill.gat,208,245,1	script	ハーフフラワー#EP18_W06	10392,{/* 16024 */}
wolfvill.gat,258,226,1	script	ハーフフラワー#EP18_T09	10392,{/* 16025 */}
wolfvill.gat,130,203,1	script	ハーフフラワー#EP18_T10	10392,{/* 16026 */}
wolfvill.gat,212,86,1	script	ハーフフラワー#EP18_L08	10392,{/* 16027 */}

rachel.gat,135,208,6	script	モソー#E18_D1	917,{/* 16030 */
	mes "[モソー]";
	mes "貴方にフレイヤの恵みが";
	mes "ありますように……。";
	close;
}
rachel.gat,163,196,4	script	モリー#E18_D2	916,{/* 16031 */
	mes "[モリー]";
	mes "貴方にフレイヤの恵みが";
	mes "ありますように……。";
	close;
}
veins.gat,231,335,4	script	アーシャ#E18_D3	815,{/* 7609 */
	if(checkquest(5947)) {
		if(checkquest(5948)) {
			mes "[アーシャ]";
			mes "ハーフフラワーを見れただけで";
			mes "ベインスまで来た甲斐がありました。";
			close;
		}
		mes "[アーシャ]";
		mes "注文してたお花";
		mes "そろそろ届くかな？";
		mes "あっ！";
		next;
		if(select("お花のお届けに参りました","人違いのようです") == 2) {
			mes "[アーシャ]";
			mes "それは、お疲れ様です。";
			close;
		}
		delitem 1000407,1;
		setquest 5948;
		mes "[アーシャ]";
		mes "待ってました。";
		mes "ハーフフラワーというのですか？";
		mes "ベインスまで来た甲斐がありました。";
		close;
	}
}
veins.gat,192,345,6	script	マーシャ#E18_D4	817,{/* 7610 */
	if(checkquest(5947)) {
		if(checkquest(5948)) {
		}
		mes "[マーシャ]";
		mes "知り合いがお花を送ってくれると";
		mes "言っていました。";
		mes "あら、綺麗なお花……。";
		mes "でも私の好みとはちょっと違いますね。";
		next;
		if(select("お花のお届けに参りました","人違いのようです") == 2) {
			mes "[マーシャ]";
			mes "そうですか。";
			mes "それは、残念です。";
			close;
		}
	}
	mes "[マーシャ]";
	mes "知ってますか？";
	mes "わたしの着ている衣装は";
	mes "海の向こうのどこかにある";
	mes "龍之城という街の伝統衣装なんです。";
	close;
}
rachel.gat,31,89,6	script	ティーリング#E18_D5	91,{/* 16032 */
	mes "[ティーリング]";
	mes "いらっしゃいませ～。";
	mes "悠久な伝統を誇るラヘル武器商店です。";
	mes "あ、そうだ！";
	mes "今から休憩に入るんだった！";
	close;
}
rachel.gat,55,106,6	script	ディーリング#E18_D6	724,{/* 16033 */
	mes "[ディーリング]";
	mes "砂漠で暑い時は日陰へ行け！";
	mes "という諺があります。";
	mes "……嘘です。";
	mes "特に意味はありません。";
	close;
}
wolfvill.gat,90,261,6	script	ゼイル#E18_D7	959,{/* 16034 */
	if(checkquest(5947)) {
		mes "[ゼイル]";
		mes "……よそ者？";
		mes "まさか、花を配達してるの？";
		mes "私がお願いをしたお花屋さんとは";
		mes "違うようだけど……。";
		next;
		if(select("お花のお届けに参りました","人違いのようです") == 2) {
			mes "[ゼイル]";
			mes "そう……";
			mes "違ったのならごめんなさい。";
			close;
		}
		delitem 1000407,1;
		setquest 5949;
		mes "[ゼイル]";
		mes "う～～ん？";
		mes "送り主の名前に心当たりは";
		mes "無いのだけれど……";
		mes "まあ、いいか。";
		close;
	}
	if(checkquest(5949)) {
		mes "[ゼイル]";
		mes "う～～ん？";
		mes "送り主の名前に心当たりは";
		mes "無いのだけれど……";
		close;
	}
	mes "[ゼイル]";
	mes "人が少ない場所を探して";
	mes "ここに来たのだけれど";
	mes "どこにでも人はいるものね。";
	close;
}
wolfvill.gat,269,68,4	script	セイル#E18_D8	960,{/* 16035 */
	if(checkquest(5947)) {
		mes "[セイル]";
		mes "お花……ねぇ。";
		mes "ここまで本当に届くのかしら？";
		next;
		if(select("お花のお届けに参りました","人違いのようです") == 2) {
			mes "[セイル]";
			mes "ふ、ふん！";
			mes "期待なんてしてないんだから！";
			close;
		}
	}
	if(checkquest(5949)) {
		mes "[セイル]";
		mes "やっぱりこんな場所じゃ";
		mes "お花なんて届かないのね……";
		mes "ぐすん。";
		close;
	}
	mes "[セイル]";
	mes "灰色狼の村へようこそ～！";
	close;
}
wolfvill.gat,171,253,5	script	エゼキエル#hms01	930,5,5,{/* 16036 */
	if(EP18_1QUE < 36) {
		mes "[エゼキエル]";
		mes "ここに来たことは";
		mes "間違いではなかった……。";
		next;
		mes "^ff0000‐クエスト「わたしのうちはどこ」は";
		mes "　下記の条件を満たすと進行可能です。";
		mes "　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(17504)) {
		mes "[エゼキエル]";
		mes "お年寄りたちの説得をお願いします。";
		mes "診療所はこの村に";
		mes "必要な施設なんです。";
		close;
	}
	if(checkquest(17505)) {
		cloakoffnpc "マラム#hms01";
		mes "[エゼキエル]";
		mes "お年寄りたちはどうだった？";
		mes "まあ、その表情を見れば";
		mes "おおよそ察しがつくけど。";
		next;
		mes "^0000FF‐老人たちと話した内容を";
		mes "　エゼキエルに伝えた‐^000000";
		next;
		mes "[エゼキエル]";
		mes "そうでしたか。";
		mes "でも、私は諦めませんよ。";
		mes "こうなれば、意地でも診療所を";
		mes "建ててみせますから！";
		next;
		mes "[エゼキエル]";
		mes "賛成してくれる人もいますからね。";
		mes "彼らも私を応援してくれるそうですから";
		mes "弱気になってちゃダメってことです。";
		next;
		mes "[エゼキエル]";
		mes "そこで冒険者様にお願いがあるのですが";
		mes "「^ff0000ベリーカタイ結晶^000000」を「^ff000010個^000000」";
		mes "調達して来てもらえませんか？";
		mes "建築資材として必要なのですが";
		mes "私では手に入れられなくて……。";
		next;
		menu "持ってきます",-;
		mes "[エゼキエル]";
		mes "ありがとうございます！";
		mes "「ベリーカタイ結晶」は";
		mes "グレイウルフを倒すと手に入ります。";
		mes "では、工事の準備に取り掛かろう。";
		mes "マラムも手伝ってくれ。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "うぅ、力仕事は苦手なんだけど……。";
		delquest 17505;
		setquest 17506;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "マラム#hms01";
		end;
	}
	if(checkquest(17506)) {
		if(countitem(1000406) < 10) {
			mes "[エゼキエル]";
			mes "冒険者様にお願いがあるのですが";
			mes "「ベリーカタイ結晶」を「10」個";
			mes "調達して来てもらえませんか？";
			mes "建築資材として必要なのですが";
			mes "私では手に入れられなくて……。";
			next;
			mes "[エゼキエル]";
			mes "「ベリーカタイ結晶」は";
			mes "グレイウルフを倒すと手に入ります。";
			mes "よろしくお願いします。";
			close;
		}
		mes "[エゼキエル]";
		mes "材料を持って来ていただけたのですね！";
		mes "ありがとうございます！";
		mes "診療所が完成したら";
		mes "「"+strcharinfo(0)+"診療所」と";
		mes "名づけさせていただきますよ！";
		next;
		cloakoffnpc "マラム#hms01";
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "うん！　それはいい考えだ。";
		mes "未来永劫、冒険者様の名前が";
		mes "ここに残りますよ。";
		next;
		cutin "ep18_maram_02.png", 255;
		cloakoffnpc "老人#hms01";
		cloakoffnpc "老人#hms02";
		cloakoffnpc "老人#hms03";
		mes "[老人]";
		mes "おい！";
		mes "何をしておるんじゃ！";
		mes "まさか、診療所を建てるつもりか？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "やれやれ……";
		mes "みなさん、落ち着いてください。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[老人]";
		mes "儂らは落ち着いておるぞ？";
		mes "前にも言ったはずじゃが";
		mes "村に診療所を建てることは許さん。";
		next;
		mes "[エゼキエル]";
		mes "診療所が出来れば";
		mes "これまで治せなかった病気や怪我を";
		mes "治すことができるんです！";
		mes "便利な暮らしを享受することに";
		mes "どうして反対するのですか？";
		next;
		mes "[老人]";
		mes "移住の民の便利な技術は";
		mes "儂らの文化をダメにする。";
		mes "一度、受け入れたら";
		mes "昔の文化に戻れんようになるぞ。";
		next;
		mes "[老人]";
		mes "ここに移住して、共に暮らすというなら";
		mes "儂らの文化になじんでもらわねば。";
		mes "それが出来んと言うなら";
		mes "受け入れるわけにはいかん！";
		next;
		mes "[エゼキエル]";
		mes "話にならない！";
		mes "　";
		mes "[老人]";
		mes "それはこちらの台詞じゃ！";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "う～～ん。";
		mes "折り合いがつきそうにないですね。";
		mes "困ったなぁ……あれ？";
		next;
		cutin "ep18_maram_02.png", 255;
		cloakoffnpc "村人#hms01";
		cloakoffnpc "負傷者#hms01";
		mes "[ヨエル]";
		mes "痛いっ！";
		mes "痛いよぉーーー！";
		next;
		mes "[老人]";
		mes "ヨエル!?";
		mes "どうしたんじゃ！";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "荷物運びの途中で事故があってさ。";
		mes "ここに来れば手当てができるかと思って";
		mes "連れて来たんだ。";
		next;
		cutin "ep18_imril_01.png", 255;
		emotion 28,"負傷者#hms01";
		mes "[ヨエル]";
		mes "ボクはもうダメだぁ！";
		mes "ボクが死んだら、頑張って集めた";
		mes "全財産と共に葬ってくれ！";
		mes "死んでも、集めた財産は";
		mes "誰にもやらん！";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "落ち着け。";
		mes "これぐらいじゃ死にやしない。";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[老人]";
		mes "どれどれ……";
		mes "こりゃあ、片足が完全にダメになっとる。";
		mes "切り落とさにゃならん。";
		next;
		mes "[ヨエル]";
		mes "うえっ!?";
		next;
		mes "[老人]";
		mes "その後、軟膏を塗っておけば";
		mes "腐らんじゃろう。";
		next;
		mes "[ヨエル]";
		mes "ドロヤナギのお爺さんみたいに";
		mes "脚を切り落とされちゃうんですか～!?";
		mes "それはダメ！";
		mes "この前に買ったワークブーツが";
		mes "履けなくなっちゃう～～！";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "心配するの、そこなの？";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[エゼキエル]";
		mes "脚は切り落とさないよ。";
		mes "私が治療するから。";
		next;
		mes "[老人]";
		mes "なに？";
		mes "こんなに酷い有り様なのにか!?";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "大丈夫ですよ。";
		mes "エゼキエルはこう見えて";
		mes "凄腕なんですから。";
		next;
		cutin "ep18_maram_02.png", 255;
		misceffect 14,"負傷者#hms01";
		mes "[エゼキエル]";
		mes "こう見えて、とはなんだ？";
		mes "ふぅ……設備さえ整っていれば";
		mes "もっと上手くできるのに……。";
		mes "まあ、仕方がない。";
		mes "おりゃぁぁ～～～！";
		next;
		misceffect 101,"負傷者#hms01";
		mes "[ヨエル]";
		mes "ぎゃあーーー！";
		mes "死ぬーーーっ!!!";
		unittalk getnpcid(0,"老人#hms01"),"そんなっ!!";
		unittalk getnpcid(0,"老人#hms02"),"あれで殺してしまうんじゃないのか？";
		unittalk getnpcid(0,"老人#hms03"),"早く止めるんじゃ～～！";
		delitem 1000406,10;
		delquest 17506;
		setquest 17507;
		close;
	}
	if(checkquest(17507)) {
		misceffect 305,"負傷者#hms01";
		misceffect 14,"負傷者#hms01";
		mes "[エゼキエル]";
		mes "……はい、終わりました。";
		mes "しばらくは無理せず";
		mes "栄養のあるものを食べれば";
		mes "すぐにジョギングぐらいは";
		mes "できるようになりますよ。";
		next;
		mes "[ヨエル]";
		mes "すごい！　全然痛くない!!";
		mes "脚を切り落とされずに済んだ！";
		mes "先生はボクのブーツを";
		mes "守ってくれたんですね！";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[イムリル]";
		mes "そんなにブーツが大事だったの？";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[老人]";
		mes "な、なんと……";
		mes "最近の医療というのは";
		mes "こんなひどい怪我も治せるのか？";
		next;
		mes "[エゼキエル]";
		mes "もちろんです。";
		mes "更にきちんとした施設と道具があれば";
		mes "より完璧な治療が施せます。";
		next;
		mes "[老人]";
		mes "ふ～～む！";
		mes "そこの冒険者の方！";
		mes "本当なのかね？";
		next;
		menu "本当ですよ",-;
		mes "[老人]";
		mes "そうか！";
		mes "儂は感動したぞ！";
		mes "儂は診療所を建てることに賛成する！";
		next;
		mes "[エゼキエル]";
		mes "え？";
		next;
		mes "[老人]";
		mes "儂もじゃ！";
		mes "こんな凄いものを見せられたら";
		mes "反対する気にもならん！";
		next;
		mes "[老人]";
		mes "時代が変わった気がするぞ！";
		mes "乗らねばならぬ！";
		mes "この大きな波に～!!";
		next;
		cloakonnpc "老人#hms01";
		cloakonnpc "老人#hms02";
		cloakonnpc "老人#hms03";
		mes "[エゼキエル]";
		mes "えっと……";
		mes "診療所を建てても良いってこと？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "……手のひら返しがスゴイけど";
		mes "とりあえず一安心だね。";
		next;
		cutin "ep18_imril_02.png", 2;
		mes "[イムリル]";
		mes "まったく話についていけてないんだけど";
		mes "結局なんだったのさ???";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ははは！";
		mes "村がこれまで以上に";
		mes "良くなるってことだよ。";
		mes "冒険者様もお力添え";
		mes "ありがとうございました。";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[エゼキエル]";
		mes "これをお受け取りください。";
		mes "私が持っていても仕方ないですから。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		delquest 17507;
		setquest 17509;
		getitem 1000405,2;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		setquest 130127;
		compquest 130127;
		mes "[エゼキエル]";
		mes "また何かお願いすることが";
		mes "あるかもしれませんが";
		mes "その時は、よろしくお願いいたします！";
		cloakonnpc "マラム#hms01";
		cloakonnpc "村人#hms01";
		cloakonnpc "負傷者#hms01";
		close;
	}
	if(checkquest(17509)) {
		mes "[エゼキエル]";
		mes "資材の調達、ありがとうございます。";
		mes "現段階では十分に足りていますが";
		mes "別の日になったら";
		mes "新たにお願いするかもしれません。";
		mes "その時は、またよろしくお願いします！";
		close;
	}
	mes "[エゼキエル]";
	mes "エゼキエル、お前は富貴栄華を";
	mes "極める為に";
	mes "ここに来たとでも言うのか？";
	next;
	mes "[エゼキエル]";
	mes "いや、違う。";
	mes "ここで生きることが";
	mes "私の本当の道だ。";
	mes "街に居る限り、私はずっと";
	mes "異邦人のままだろう。";
	next;
	mes "[エゼキエル]";
	mes "ここでも異邦人扱いされているのに？";
	mes "街もこの村も変わらないのなら";
	mes "楽な暮らしができる街に";
	mes "戻るべきじゃないのか？";
	next;
	mes "[エゼキエル]";
	mes "合意できない。";
	mes "私の目標は、私のルーツを";
	mes "探すことなのだから。";
	next;
	menu "あの人は……？",-;
	cloakoffnpc "マラム#hms01";
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "相変わらずだなぁ……";
	mes "エゼキエル！";
	mes "元気にしてる？";
	mes "何をぶつぶつ独り言を言ってるんだい？";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[エゼキエル]";
	mes "ああ、マラム！";
	mes "ここには知り合いがいないから";
	mes "悩みを聞いてくれるのは";
	mes "マラムしかいなかったんだ！";
	mes "私の悩みを聞いてくれ！";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "わかったわかった。";
	mes "悩みを聞くから、少し落ち着いて。";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[エゼキエル]";
	mes "私は君の誘いを受けて";
	mes "衛生環境の悪いこの村に";
	mes "診療所を建てるために来たんだ。";
	mes "ところが、診療所を建てようとすると";
	mes "村の年寄りたちが邪魔をするんだよ。";
	next;
	mes "[エゼキエル]";
	mes "最新の医療技術を揃えた";
	mes "診療所なんだよ！　なのに";
	mes "この村に移住の民の技術を持ち込むな！";
	mes "原住民の文化を破壊する気か！って";
	mes "ぎゃーぎゃー言い出すんだ！";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "スアドには相談したの？";
	mes "合理主義の塊みたいなスアドなら";
	mes "診療所を建てることに";
	mes "反対はしないはずだけど。";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[エゼキエル]";
	mes "もちろん、相談したさ。";
	mes "ただ、村の老人たちの意見を";
	mes "無視するわけにはいかないから";
	mes "説得するための時間をくれと言われて";
	mes "それっきり進展が無いんだ。";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "う～～ん。";
	mes "スアドも忙しいから";
	mes "後回しにされてるのかもなぁ。";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[エゼキエル]";
	mes "このまま診療所が建てられないなら";
	mes "ラヘルに戻ろうかと考えてるんだ。";
	mes "ここは不便だし、目的が果たせないなら";
	mes "楽な暮らしができる街に";
	mes "戻ろうかなって。";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "う～～ん……";
	mes "君に無理を言って来てもらったのは";
	mes "村に診療所が欠かせないと";
	mes "思ったからなんだけど……";
	mes "よし、わかった！";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "私と冒険者様とで";
	mes "お年寄りを説得してみるよ。";
	mes "……あの頑固な人たちを";
	mes "説得するのは骨が折れるだろうけど";
	mes "このまま放ってはおけない。";
	next;
	mes "[マラム]";
	mes "冒険者様、どうか手伝ってください。";
	mes "この村には診療所が必要です。";
	mes "昔ながらの民間療法では病気や";
	mes "怪我を治すのにも限界があります。";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[エゼキエル]";
	mes "私からもお願いします。";
	mes "……私も原住民の出身なので";
	mes "ここの人々の役に立ちたいのです。";
	mes "どうかお願いいたします。";
	delquest 130107;
	setquest 17504;
	close2;
	cloakonnpc "マラム#hms01";
	end;
OnTouch:
	if(checkquest(130107))
		unittalk "エゼキエル : エゼキエル、お前は富貴栄華を極める為に、ここに来たとでも言うのか？";
	end;
OnQuestInfo:
	if(checkquest(17506) && countitem(1000406) < 10)
		showevent 0, 2, "エゼキエル#hms01";
	else if(checkquest(130107) || checkquest(17505) || checkquest(17506) || checkquest(17507))
		showevent 0, 3, "エゼキエル#hms01";
	else
		showevent 9999,0,"エゼキエル#hms01";
	end;
}
wolfvill.gat,174,252,3	script	マラム#hms01	10376,{/* 16037 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,175,249,1	script	老人#hms01	10393,{/* 16038 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,173,247,1	script	老人#hms02	10394,{/* 16039 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,170,248,7	script	老人#hms03	10395,{/* 16040 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,170,251,5	script	村人#hms01	931,{/* 16041 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,172,250,1	script	負傷者#hms01	849,{/* 16042 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,167,253,1	script	建設資材#hms01	10250,{/* 16043 */}
wolfvill.gat,166,252,1	script	建設資材#hms02	10250,{/* 16044 */}
wolfvill.gat,165,254,1	script	建設資材#hms03	10024,{/* 16045 */}
wolfvill.gat,165,250,1	script	建設資材#hms04	10026,{/* 16046 */}
wolfvill.gat,164,251,1	script	建設資材#hms05	10025,{/* 16047 */}
wolfvill.gat,176,111,3	script	老人#hms04	10393,{/* 16048 */
	if(checkquest(17504)) {
		mes "[老人]";
		mes "この前、村に来た人たちも";
		mes "上手くなじんでくれたらしいのう。";
		next;
		mes "[老人]";
		mes "もう一度、会いに行くとしようか。";
		next;
		mes "[老人]";
		mes "あんまり世話を焼き過ぎるな。";
		mes "向こうも嫌がるんじゃないか。";
		mes "儂らの時代とは違うからのう。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "こんにちは。";
		mes "今、お時間よろしいでしょうか。";
		next;
		cutin "ep18_maram_01.png", 255;
		menu "こんにちは",-;
		mes "[老人]";
		mes "おうおう！";
		mes "マラムと……";
		mes "外からきた冒険者の人だな？";
		next;
		mes "[老人]";
		mes "時間なら幾らでもあるぞ。";
		mes "儂らは若い衆と違って";
		mes "がっつり仕事はしとらんからのう。";
		next;
		mes "[老人]";
		mes "なんぞ、困ってることでも";
		mes "あるのかね？";
		next;
		menu "診療所の件で来ました",-;
		mes "[老人]";
		mes "なにぃ～？";
		mes "診療所じゃと～？";
		next;
		mes "[老人]";
		mes "あやつには、もう話をしたぞ？";
		mes "この村に新しい診療所は必要ないって。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "医療施設は大事なんですよ？";
		mes "最新の医療を受けられる環境があれば";
		mes "病気になっても";
		mes "すぐに治療できるんです。";
		mes "怪我だって……。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[老人]";
		mes "今までのやり方で問題なかったんじゃ。";
		mes "病気も怪我も。";
		mes "移住の民の技術や文化を";
		mes "この村に持ち込まんでくれ。";
		next;
		mes "[老人]";
		mes "便利とかそういう話じゃない。";
		mes "儂らが新しい技術を受け入れてしまえば";
		mes "それは移住の民の文化を";
		mes "受け入れてしまうということじゃ。";
		next;
		mes "[老人]";
		mes "お前さん方には世話になっておるが";
		mes "診療所の件は別じゃ。";
		mes "あのエゼキエルという奴には";
		mes "儂らが改めて言っておくから";
		mes "この件にはもう関わらんでくれ。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……ふ～む。";
		mes "なかなか手強いですね。";
		mes "合理性ではないと……";
		mes "スアドも手を焼くわけです。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "いったん、エゼキエルのところに";
		mes "戻りましょうか。";
		mes "どうするか考えないと。";
		delquest 17504;
		setquest 17505;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(checkquest(17505)) {
		mes "[老人]";
		mes "お前さん方には世話になっておるが";
		mes "診療所の件は別じゃ。";
		mes "あのエゼキエルという奴には";
		mes "儂らが改めて言っておくから";
		mes "この件にはもう関わらんでくれ。";
		close;
	}
	mes "[老人]";
	mes "新しく村に来た者たちを";
	mes "訪ねてみるとしようかのう。";
	close;
OnQuestInfo:
	if(checkquest(17504))
		showevent 0, 3, "老人#hms04";
	else
		showevent 9999,0,"老人#hms04";
	end;
}
wolfvill.gat,174,111,5	script	老人#hms05	10394,{/* 16049 */
	mes "[老人]";
	mes "何か困ったことがあれば";
	mes "相談に乗りますぞ？";
	close;
}
wolfvill.gat,178,110,3	script	老人#hms06	10395,{/* 16050 */
	mes "[老人]";
	mes "儂らに聞きたいことでも";
	mes "あるのかね？";
	close;
}
wolfvill.gat,154,217,3	script	サラナ#cmm01	10399,{/* 16051 */
	mes "[サラナ]";
	mes "畑には主にトウモロコシや豆を植える。";
	mes "こんな場所でも良く育つからね。";
	next;
	mes "[サラナ]";
	mes "ジャガイモの育ちもいい。";
	mes "でも、それ以外は……";
	mes "はぁ、小麦粉を使った食べ物を";
	mes "腹いっぱい食べたいなぁ。";
	close;
}
wolfvill.gat,146,131,1	script	村の子供#cmm01	10402,{/* 16052 */
	mes "[村の子供]";
	mes "あの焚火の中に";
	mes "ジャガイモを隠したんだ～。";
	mes "神聖な炎だから近づくなって";
	mes "大人たちは言うけど";
	mes "知ったこっちゃないね。へへっ！";
	next;
	mes "[村の子供]";
	mes "焼きポテト……";
	mes "美味しんだ。";
	mes "早く焼けないかな～！";
	close;
}
wolfvill.gat,192,146,3	script	オハ#cmm01	10395,{/* 16053 */
	mes "[オハ]";
	mes "これで全員分？";
	mes "毎日作っても量が合わないから";
	mes "まあ、適当でいっか。";
	close;
}
wolfvill.gat,123,162,7	script	ゼン#cmm01	10394,{/* 2413 */
	mes "[ゼン]";
	mes "太古の炎が";
	mes "この村と森を飲み込まないように";
	mes "ただ守り給え……。";
	close;
}
wolfvill.gat,147,97,5	script	アヒール#ep18	944,3,3,{/* 16054 */
	if(EP18_1QUE < 36) {
		mes "[アヒール]";
		mes "あっ、よそ者……。";
		next;
		mes "^ff0000‐クエスト「眠れません」は^000000";
		mes "^ff0000　下記の条件を満たすと進行可能です。^000000";
		mes "^ff0000　・BaseLv210以上^000000";
		mes "^ff0000　・4次職、拡張4次職^000000";
		mes "^ff0000　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(16548)) {
		if(!(checkquest(16548)&4)) {
			//未調査
		}
		mes "[アヒール]";
		mes "ありがとうございます！";
		mes "おかげさまで今夜はぐっすり";
		mes "眠れそうです。";
		next;
		mes "[アヒール]";
		mes "明日になると、また戻ってきそうなので";
		mes "日が変わったらまた討伐に";
		mes "行っていただけるとありがたいです。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		delquest 16548;
		setquest 16550;
		getitem 1000405,4;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		setquest 130133;
		compquest 130133;
		mes "[アヒール]";
		mes "こちらは、今晩安眠できることへの";
		mes "感謝の印です。";
		mes "どうぞ受け取ってください！";
		close;
	}
	if(checkquest(16550)) {
		mes "[アヒール]";
		mes "明日になると、また戻ってきそうなので";
		mes "日が変わったらまた討伐に";
		mes "行っていただけるとありがたいです。";
		close;
	}
	mes "[アヒール]";
	mes "うん？　見覚えのない人。";
	mes "もしかして、村の新しい住人ですか？";
	mes "ふああぁぁ……。";
	next;
	menu "眠たそうですね？",-;
	mes "[アヒール]";
	mes "……うん。";
	mes "夜の灰色狼の森は";
	mes "とっても騒がしいんだ。";
	next;
	mes "[アヒール]";
	mes "コオロギの鳴き声に";
	mes "大人たちの雑談。";
	mes "それに獣の徘徊する音……";
	mes "けど一番うるさいのは";
	mes "モンスターの鳴き声です。";
	next;
	mes "[アヒール]";
	mes "ふあぁ……、その中でも";
	mes "一番うるさいのは";
	mes "「ファイアウィンドカイト」の";
	mes "鳴き声……。";
	next;
	mes "[アヒール]";
	mes "くちばしで火種をつまんだまま";
	mes "鋭い声で鳴く姿は";
	mes "本当に恐ろしいです……。";
	next;
	menu "退治してきましょうか？",-;
	mes "[アヒール]";
	mes "本当!?";
	mes "だったら「15」体倒して来て！";
	mes "一群を狩れば、他の群れも";
	mes "大人しくなるかもしれません。";
	next;
	if(select("任せて","やっぱりやめよう") == 2) {
		mes "[アヒール]";
		mes "う～～ん……";
		mes "今夜も寝不足になりそう……。";
		close;
	}
	mes "[アヒール]";
	mes "心ばかりですけど";
	mes "お礼も用意しますので";
	mes "よろしくお願いしますね！";
	delquest 130113;
	setquest 16548;
	close;
OnTouch:
	unittalk "アヒール : 眠い……くたびれたよぉ。";
	end;
OnQuestInfo:
	if(checkquest(16548) && !(checkquest(16548)&4))
		showevent 0, 2, "アヒール#ep18";
	else if(checkquest(130113) || checkquest(16548))
		showevent 0, 3, "アヒール#ep18";
	else
		showevent 9999,0,"アヒール#ep18";
	end;
}
wolfvill.gat,61,170,5	script	民俗学者グドラ#ep18	919,{/* 16056 */
	if(EP18_1QUE < 36) {
		mes "[民俗学者グドラ]";
		mes "初めてお会いする方ですね。";
		mes "どちら様でしょうか？";
		next;
		mes "^ff0000‐クエスト「物語を集めてください」は^000000";
		mes "^ff0000　下記の条件を満たすと進行可能です。^000000";
		mes "^ff0000　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(16554)) {
		mes "[民俗学者グドラ]";
		mes "3人からお話を聞くことが";
		mes "できたみたいですね。";
		mes "さて、どんな物語なのでしょう。";
		next;
		switch(rand(3)) {
		case 0:
			mes "[民俗学者グドラ]";
			mes "これは……";
			mes "聞いたこともない物語です。";
			mes "しかし……何かおかしい。";
			mes "誰から聞いた話ですか？";
			next;
			mes "[民俗学者グドラ]";
			mes "ディナルが……";
			mes "自分で作った物語なんですか!?";
			mes "私が知りたいのは";
			mes "昔話の類なのですが……。";
			next;
			mes "[民俗学者グドラ]";
			mes "しかし……";
			mes "ふむ、これは……悪くありません。";
			mes "粗削りですが";
			mes "独創的で素敵なお話です。";
			next;
			mes "[民俗学者グドラ]";
			mes "本来の目的とは異なりますが";
			mes "この物語の続きを聞きたいですね。";
			mes "よろしければまたディナルから";
			mes "お話を聞いて来てください。";
			break;
		case 1:
			mes "[民俗学者グドラ]";
			mes "これはアミラが聞かせてくれた";
			mes "物語ですか？";
			mes "多彩で素敵な話です！";
			mes "私も幼い頃、この神たちに関する昔話を";
			mes "聞いた覚えがあります。";
			next;
			mes "[民俗学者グドラ]";
			mes "でもこの物語に出てくる";
			mes "動物神の名前は";
			mes "私が子供の頃に聞いた名前とは";
			mes "少し違いますね。";
			mes "この違いは何なのか……興味深い。";
			next;
			mes "[民俗学者グドラ]";
			mes "好奇心を刺激してくれる";
			mes "素晴らしい物語です！";
			mes "これからも、アミラの話を聞いて";
			mes "記録していただけるとありがたいです！";
			break;
		case 2:
			mes "[民俗学者グドラ]";
			mes "ふぅん、ほぅ……";
			mes "これは今の子供たちには";
			mes "聞かせられない童話ですね。";
			mes "今の基準では受け入れ難い";
			mes "差別的な固定観念が染み付いています。";
			next;
			mes "[民俗学者グドラ]";
			mes "あ、誤解しないでください。";
			mes "子供たちに聞かせられないだけで";
			mes "とても貴重な情報なんです。";
			mes "どなたから聞いたお話なのですか？";
			next;
			mes "[民俗学者グドラ]";
			mes "シャーニナお婆さんが";
			mes "聞かせてくださったものですか。";
			mes "これは昔の人の考え方を知る上で";
			mes "貴重な記録となるでしょう。";
			next;
			mes "[民俗学者グドラ]";
			mes "ですから、機会があればぜひ";
			mes "シャーニナお婆さんから";
			mes "お話を聞いて来てくださいね。";
			break;
		}
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		delitem 1000408,1;
		delquest 16554;
		setquest 16559;
		getitem 1000405,1;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		setquest 130129;
		compquest 130129;
		mes "[民俗学者グドラ]";
		mes "今日はここまでにしましょう。";
		mes "こちらが本日の手当てとなります。";
		mes "また、明日以降お手伝いいただけると";
		mes "助かります。";
		close;
	}
	if(checkquest(16551) || checkquest(16552) || checkquest(16553)) {
		mes "[民俗学者グドラ]";
		mes "「ディナル」という女の子と";
		mes "「アミラ」という女性。";
		mes "それと「シャーニナ」お婆さんから";
		mes "話を聞いてきてください。";
		mes "よろしくお願いしますね。";
		close;
	}
	if(checkquest(16559)){
		if(checkquest(16559) & 0x02 == 0){
			mes "[民俗学者グドラ]";
			mes "今日はここまでにしましょう。";
			mes "早くお話を集めたいのは山々なのですが";
			mes "村の人も話疲れてしまいますから。";
			next;
			mes "[民俗学者グドラ]";
			mes "冒険者さんも今日は休んでください。";
			mes "私も集めてもらったお話を";
			mes "整理したいですからね。";
			close;
		}
		delquest 16559;
		mes "[民俗学者グドラ]";
		mes "前回はありがとうございました。";
		mes "本日も村の人たちから";
		mes "お話を聞いてきてもらえますか？";
		next;
		mes "[民俗学者グドラ]";
		mes "「ディナル」という女の子と";
		mes "「アミラ」という女性。";
		mes "それと「シャーニナ」お婆さんから";
		mes "話を聞いてきてください。";
		mes "それでは、記録用の手帳をどうぞ。";
		next;
		if(select("行ってきます！","今は時間がないです") == 2) {
			mes "[民俗学者グドラ]";
			mes "それは仕方ありませんね。";
			mes "またお時間ができたらで良いので";
			mes "ぜひお願いいたします。";
			mes "継続は力ですから";
			mes "歩みを止めるわけにはいきません。";
			close;
		}
		setquest 16555;
		setquest 16556;
		setquest 16557;
		getitem 1000408,1;
		mes "[民俗学者グドラ]";
		mes "ありがとうございます。";
		mes "この恩は、立派な本を作り上げて";
		mes "お返ししたいと思います。";
		mes "あ、もちろん報酬は用意してますので";
		mes "ご心配なく。";
		close;
	}
	if(checkquest(16555) || checkquest(16556) || checkquest(16557)) {
		mes "[民俗学者グドラ]";
		mes "「ディナル」という女の子と";
		mes "「アミラ」という女性。";
		mes "それと「シャーニナ」お婆さんから";
		mes "話を聞いてきてください。";
		mes "よろしくお願いしますね。";
		close;
	}
	if(checkquest(16558)){
		switch(rand(3)) {
			case 0:
				mes "[民俗学者グドラ]";
				mes "今日もディナルが";
				mes "創作神話を聞かせてくれたのですね？";
				mes "実は続きが気になってたんです。";
				mes "どれどれ……。";
				next;
				mes "[民俗学者グドラ]";
				mes "ほ～～これは素晴らしいです。";
				mes "ディナルには小説家の才能があります。";
				mes "私の仕事がひと段落したら";
				mes "ディナルから許可をもらって";
				mes "この物語も出版したいですね。";
				next;
				mes "[民俗学者グドラ]";
				mes "私の本来の目的とは異なりますが";
				mes "この才能を埋もれたままにしておくのは";
				mes "惜しいですから。";
				mes "よろしければまたディナルから";
				mes "お話を聞いて来てくださいね。";
				next;
				break;
			case 1:
				mes "[民俗学者グドラ]";
				mes "アミラの物語の中には";
				mes "私が知っている神話も多くあります。";
				mes "おそらく原住民たちの間で";
				mes "古くから語り継がれていた";
				mes "共通の神話なのでしょう。";
				next;
				mes "[民俗学者グドラ]";
				mes "ところが、私の知っている神話とは";
				mes "異なる部分も存在します。";
				mes "この違いは何なのか？";
				mes "何が原因となって違いが生じたのか？";
				next;
				mes "[民俗学者グドラ]";
				mes "この差異を研究することこそ";
				mes "正に私の主要な研究テーマなのです。";
				mes "うふふふ……素晴らしい！";
				next;
				mes "[民俗学者グドラ]";
				mes "これからも、アミラの話を聞いて";
				mes "記録していただけるとありがたいです！";
				mes "うふふふふふ！";
				next;
				break;
			case 2:
				mes "[民俗学者グドラ]";
				mes "ふぅん、ほぅ……";
				mes "これは今の子供たちには";
				mes "聞かせられない童話ですね。";
				mes "今の基準では受け入れ難い";
				mes "差別的な固定観念が染み付いています。";
				next;
				mes "[民俗学者グドラ]";
				mes "文化の多様性は";
				mes "考え方の多様性に繋がります。";
				next;
				mes "[民俗学者グドラ]";
				mes "ですから、機会があればぜひ";
				mes "シャーニナお婆さんから";
				mes "お話を聞いて来てくださいね。";
				mes "偏狭な考え方を避けるためにも";
				mes "この物語は、きちんと記録に残します。";
				next;
				break;
		}
		delitem 1000408,1;
		getitem 1000405,1;
		setquest 16555;
		delquest 16555;
		setquest 16556;
		delquest 16556;
		setquest 16557;
		delquest 16557;
		delquest 16558;
		setquest 16559;
		for(set '@i,0; '@i< 20 ; set '@i,'@i+1){
			getexp 150000000,0,0;
			getexp 0,100000000,0;
		}
		mes "[民俗学者グドラ]";
		mes "今日はここまでにしましょう。";
		mes "こちらが本日の手当てとなります。";
		mes "また、明日以降お手伝いいただけると";
		mes "助かります。";
		close;
	}
	mes "[民俗学者グドラ]";
	mes "初めてお会いする方ですね。";
	mes "どちら様でしょうか？";
	next;
	menu "学者さんですか？",-;
	mes "[民俗学者グドラ]";
	mes "お、おお……！";
	mes "……私が学者に見えますか？";
	mes "外からいらした方が一目で私を";
	mes "学者だと見抜くなんて";
	mes "驚きですね。";
	next;
	mes "[民俗学者グドラ]";
	mes "私は民俗学を研究しています。";
	mes "代々伝わってくる神話や";
	mes "口承文学を集める仕事です。";
	mes "私たち原住民の大切な文化を守る";
	mes "やりがいのある仕事です。";
	next;
	mes "[民俗学者グドラ]";
	mes "今も住民たちから聞いた話を";
	mes "整理していました。";
	mes "原住民の文化を後世に残す為に";
	mes "いずれ本にまとめて";
	mes "出版する予定なんですよ。";
	next;
	mes "[民俗学者グドラ]";
	mes "ところで……";
	mes "冒険者さんもこの仕事に";
	mes "興味はありますか？";
	next;
	if(select("興味あるよ","興味ないよ") == 2) {
		mes "[民俗学者グドラ]";
		mes "あれ……興味ないんですか？";
		mes "ありそうに見えたのですが";
		mes "勘違いだったようですね。";
		close;
	}
	mes "[民俗学者グドラ]";
	mes "本当ですか！";
	mes "実はアシスタントを探していたんです。";
	mes "私の代わりに、人から聞いたお話を";
	mes "記録してきて欲しいんです。";
	next;
	mes "[民俗学者グドラ]";
	mes "村の住民たちから";
	mes "お話を聞かせてもらう予定なんです。";
	mes "いずれも長い話なので";
	mes "1日では終わらないかもしれません。";
	mes "では、記録用の手帳をお渡しします。";
	next;
	if(checkitemblank() == 0) {
		mes "^009eff【インフォメーション】";
		mes "これ以上多くの種類の";
		mes "荷物を持つことが出来ません。";
		mes "1個以上の空きを作ってください。^000000";
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	}
	delquest 130109;
	setquest 16551;
	setquest 16552;
	setquest 16553;
	getitem 1000408,1;
	mes "[民俗学者グドラ]";
	mes "「ディナル」という女の子と";
	mes "「アミラ」という女性。";
	mes "それと「シャーニナ」お婆さんから";
	mes "話を聞いてきてください。";
	mes "よろしくお願いしますね。";
	close;
OnQuestInfo:
	if(checkquest(130109) || checkquest(16554))
		showevent 0, 3, "民俗学者グドラ#ep18";
	else
		showevent 9999,0,"民俗学者グドラ#ep18";
	end;
}
wolfvill.gat,106,224,3	script	ディナル#ep18	941,{/* 16057 */
	if(checkquest(16551)) {
		mes "[ディナル]";
		mes "私のお話を聞きにきたのね！";
		mes "いいよ～！";
		mes "グドラおばさんと約束してたもんね！";
		next;
		mes "[ディナル]";
		mes "一回しか言わないから";
		mes "ちゃんと記録してね？";
		mes "これは私が経験した事なんだけど……。";
		next;
		menu "口伝されてる物語じゃない？",-;
		mes "[ディナル]";
		mes "口伝ってなんですか？";
		mes "とにかく集中して聞いてください！";
		mes "むか～しむかし、";
		mes "私がまだ幼い頃の出来事です。";
		next;
		menu "今も幼いような……",-;
		mes "[ディナル]";
		mes "口出ししないで！　……おほん！";
		mes "灰色狼の森で出会った";
		mes "灰色狼の中に";
		mes "ボスらしきとても大きな狼がいました。";
		delquest 16551;
		if(!checkquest(16551) && !checkquest(16552) && !checkquest(16553)) {
			unittalk getcharid(3),strcharinfo(0)+" : 3人の物語を書き留めた。グドラのところへ戻ろう！",1;
			setquest 16554;
		}
		close;
	}
	if(checkquest(16555)){
		mes "[ディナル]";
		mes "今日も私のお話を聞きにきたのね！";
		mes "グドラおばさんが私の話を";
		mes "本にしてくれるって言ってたの。";
		mes "うれしいな～！";
		next;
		switch(rand(3)) {
			case 0:
				mes "[ディナル]";
				mes "えっと……";
				mes "前回にどこまで話をしたっけ？";
				mes "妖精の金色の瞳が";
				mes "すごく綺麗だったところまで？";
				mes "覚えてたんですね！";
				next;
				mes "[ディナル]";
				mes "それで竜と妖精は";
				mes "永遠の友達になりました。";
				mes "そう……「親友」と書いて";
				mes "「ライバル」と読む仲です。";
				break;
			case 1:
				mes "[ディナル]";
				mes "えっと……";
				mes "前回にどこまで話をしたっけ？";
				mes "竜と妖精が最後の勝負をする";
				mes "ところでしたっけ？";
				next;
				mes "[ディナル]";
				mes "竜が最後に";
				mes "巨大な金属の塔を呼び出すと";
				mes "妖精は巨大な火の精霊を呼んで";
				mes "対抗しました……。";
				break;
			case 2:
				mes "[ディナル]";
				mes "今日も私のお話を聞きにきたのね！";
				mes "グドラおばさんが私の話を";
				mes "本にしてくれるって言ってたの。";
				mes "うれしいな～！";
				next;
				mes "[ディナル]";
				mes "えっと……";
				mes "前回にどこまで話をしたっけ？";
				mes "サファイアの瞳を持つ竜が";
				mes "紫色の妖精と出逢う場面でしたよね？";
				next;
				mes "[ディナル]";
				mes "紫色の妖精は、妖精たちの中でも";
				mes "一番優れた1人でした。";
				mes "それをどうやって証明したのか……。";
				break;
		}
		delquest 16555;
		if(!checkquest(16555) && !checkquest(16556) && !checkquest(16557)) {
				unittalk getcharid(3),""+strcharinfo(0)+" : 3人の物語を書き留めた。グドラのところへ戻ろう！",1;	// self:hidden
				setquest 16558;
			}
		close;
	}
	mes "[ディナル]";
	mes "面白いお話を読むのは";
	mes "とっても楽しいです！";
	mes "その続きを想像するのは";
	mes "もっと楽しいです！";
	next;
	mes "[ディナル]";
	mes "お話の中の人物たちは";
	mes "私の心の中で生きています。";
	mes "私は演劇を観るように";
	mes "その人物たちが動くのを眺めるの……";
	mes "ほわわ～～ん。";
	close;
OnQuestInfo:
	if(checkquest(16551))
		showevent 0, 3, "ディナル#ep18";
	else
		showevent 9999,0,"ディナル#ep18";
	end;
}
wolfvill.gat,180,204,3	script	アミラ#ep18	940,{/* 16058 */
	if(checkquest(16552)) {
		mes "[アミラ]";
		mes "あなたがグドラのアシスタント？";
		mes "あの人から変なことを頼まれたのよね。";
		mes "知ってるだけで良いから";
		mes "昔話をたくさん教えて欲しいって。";
		next;
		mes "[アミラ]";
		mes "まあ、私が知ってる話なんて";
		mes "ここに来る前に亡くなった";
		mes "お爺ちゃんから聞いた話だけなんだけど。";
		mes "それでも良い？";
		next;
		mes "[アミラ]";
		mes "それで良いなら、聞かせてあげる。";
		mes "……世の中には私達が知っているよりも";
		mes "遥かに多い神々がいるけど……。";
		delquest 16552;
		if(!checkquest(16551) && !checkquest(16552) && !checkquest(16553)) {
			unittalk getcharid(3),strcharinfo(0)+" : 3人の物語を書き留めた。グドラのところへ戻ろう！",1;
			setquest 16554;
		}
		close;
	}
	if(checkquest(16552)) {
		mes "[アミラ]";
		mes "今日もグドラのお手伝い？";
		mes "私の話って何の役に立つのかしら？";
		mes "まあ、そんなことは良いか。";
		next;
		mes "[アミラ]";
		mes "次のお話を聞かせてあげる。";
		mes "これも私のお爺ちゃんから";
		mes "聞いた話だけど……";
		mes "とある神たちは未だ……。";
		next;
		mes "[アミラ]";
		mes "……それで、うん？";
		mes "ちゃんと思い出せないけど";
		mes "とにかく大事なことは……。";
		delquest 16556;
		if(!checkquest(16555) && !checkquest(16556) && !checkquest(16557)) {
				unittalk getcharid(3),""+strcharinfo(0)+" : 3人の物語を書き留めた。グドラのところへ戻ろう！",1;	// self:hidden
				setquest 16558;
			}
		close;
	}
	mes "[アミラ]";
	mes "お爺ちゃんが言ってたの。";
	mes "私たちが神々を忘れないことが";
	mes "大切なんだって。";
	next;
	mes "[アミラ]";
	mes "いろんな話を聞いただけど";
	mes "もう忘れちゃったのも多いんだ。";
	mes "けど、グドラが本にしてくれれば";
	mes "もう忘れることは無いよね。";
	close;
OnQuestInfo:
	if(checkquest(16552))
		showevent 0, 3, "アミラ#ep18";
	else
		showevent 9999,0,"アミラ#ep18";
	end;
}
wolfvill.gat,154,184,5	script	シャーニナ#ep18	942,{/* 16059 */
	if(checkquest(16553)) {
		mes "[シャーニナ]";
		mes "あぁ、グドラのお手伝いかい？";
		mes "昔話を聞きに来たんだっけ？";
		mes "迷惑じゃないかって？";
		mes "な～に、構わないよ。";
		mes "暇つぶしになって楽しいからね。";
		next;
		mes "[シャーニナ]";
		mes "それじゃあ、始めようかね。";
		mes "これは私のお婆さんから聞いた";
		mes "古い昔話さ。";
		mes "昔々、とあるところに";
		mes "一人の鍛冶屋がおりました……。";
		delquest 16553;
		if(!checkquest(16551) && !checkquest(16552) && !checkquest(16553)) {
			unittalk getcharid(3),strcharinfo(0)+" : 3人の物語を書き留めた。グドラのところへ戻ろう！",1;
			setquest 16554;
		}
		close;
	}
	if(checkquest(16557)) {
		mes "[シャーニナ]";
		mes "今日も話を聞きにきたのかい？";
		mes "毎度毎度、酔狂だねぇ。";
		mes "ふ～ん、私の話は貴重だって？";
		mes "そうかいそうかい。";
		next;
		mes "[シャーニナ]";
		mes "さて……今日はどうしようかね。";
		mes "鳥の物語をする順番だっけ？";
		next;
		mes "[シャーニナ]";
		mes "それとも前回の話が";
		mes "まだ終わってなかったかね？";
		mes "鍛冶屋が空から現れた";
		mes "ミミズクに乗って";
		mes "空へ上るところまで聞いたのかい？";
		next;
		mes "[シャーニナ]";
		mes "記憶力が良いのう。";
		mes "ではその続きを始めようか。";
		mes "可哀そうな天女は思わず……。";
		delquest 16557;
		if(!checkquest(16555) && !checkquest(16556) && !checkquest(16557)) {
				unittalk getcharid(3),""+strcharinfo(0)+" : 3人の物語を書き留めた。グドラのところへ戻ろう！",1;	// self:hidden
				setquest 16558;
			}
		close;
	}
	mes "[シャーニナ]";
	mes "私はもう生きる楽しみは";
	mes "無いて思っておったが";
	mes "こうして若いもんに昔話をするのは";
	mes "楽しいものじゃ。";
	next;
	mes "[シャーニナ]";
	mes "私の話を聞いてくれて";
	mes "ありがとうね。";
	mes "また来てちょうだいね。";
	close;
OnQuestInfo:
	if(checkquest(16553))
		showevent 0, 3, "シャーニナ#ep18";
	else
		showevent 9999,0,"シャーニナ#ep18";
	end;
}
wolfvill.gat,85,111,3	script	ズラン#ep18	931,{/* 16060 */
	if(EP18_1QUE < 36) {
		mes "^ff0000‐クエスト「ここは向こうではない」は^000000";
		mes "^ff0000　下記の条件を満たすと進行可能です。^000000";
		mes "^ff0000　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(130105)) {
		mes "[ズラン]";
		mes "うう…今日も村の会議で";
		mes "変なことばかり述べてたよ、";
		mes "あのおじさん。";
		mes "ラヘルでは偉い人だったみたいだけど";
		mes "それがここじゃ何になるってんだよ!?";
		next;
		mes "[ズラン]";
		mes "アハブやらアハハやらという";
		mes "あのおじさんってば！";
		mes "「ラヘルではそういう風にしない～」とか";
		mes "「ラヘルと違うよ～」とか";
		mes "そんなこと言うぐらいなら";
		mes "ラヘルに帰ればいいじゃん！";
		next;
		mes "[カヤル]";
		mes "今も自分がラヘルにいると";
		mes "思ってるんじゃない？";
		mes "隙間風が入るテントで寝てるのに";
		mes "未だに夢から覚めないのかな？";
		next;
		mes "[ズラン]";
		mes "夢の中にいるならそれでいいじゃん。";
		mes "なぜ他人に迷惑かけるんだよ？";
		mes "……ところで、さっきから";
		mes "俺たちの話を立ち聞きしてる";
		mes "アンタは誰?";
		delquest 130105;
		setquest 16560;
		close;
	}
	if(checkquest(16566)) {
		mes "[ズラン]";
		mes "帰ってきた。";
		mes "それで、アハハ～おじさんは";
		mes "なんだって？";
		next;
		mes "[ズラン]";
		mes "なに!?";
		mes "これからは人の話を素直に聞くって？";
		mes "やっぱり今までちゃんと";
		mes "聞いてなかったんだな!!";
		next;
		mes "[カヤル]";
		mes "落ち着けって、ズラン。";
		mes "素直になるって決めたのは";
		mes "重要なことじゃないか。";
		next;
		mes "[レッドセル]";
		mes "むしろビックリだ！";
		mes "あのアハブおじさんが";
		mes "そんなこと言うなんて！";
		mes "冒険者さん、何をしたんだい？";
		next;
		mes "[ズラン]";
		mes "……考えてみりゃ俺も";
		mes "追い出すなんて言って";
		mes "大人げなかったな。";
		mes "ありがとう、冒険者さん。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		delquest 16566;
		setquest 202335;
		getitem 1000405,10;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		setquest 130125;
		compquest 130125;
		mes "[ズラン]";
		mes "あんたみたいな世話焼きがいて";
		mes "助かったよ。";
		mes "俺ももう少し大人にならないとな。";
		close;
	}
	if(checkquest(202335)) {
		mes "[ズラン]";
		mes "アハブおじさんも少しずつ";
		mes "聞く耳を持つようになってからは";
		mes "そこまでダメな人でもない……";
		mes "気がする。たぶん。";
		next;
		mes "[ズラン]";
		mes "まあ、俺も大人気なかったし";
		mes "あんまり人のことは言えないぜ。";
		mes "いや～、追い出さなくて良かった。";
		mes "これこそが大人のやり方だよな。";
		close;
	}
	mes "[ズラン]";
	mes "村の規則を守れないなら";
	mes "出て行って欲しいよ。";
	mes "規則は守るためにあるんだからさ。";
	next;
	mes "[ズラン]";
	mes "礼儀だって同じだよ。";
	mes "みんなが互いに尊重しあってこそ";
	mes "成熟した社会と言えるんだ。";
	mes "言いたいことをただ言うだけなんて";
	mes "動物と変わらないぞ。";
	close;
OnQuestInfo:
	if(checkquest(130105))
		showevent 0, 3, "ズラン#ep18";
	else
		showevent 9999,0,"ズラン#ep18";
	end;
}
wolfvill.gat,83,109,5	script	カヤル#ep18	99,{/* 16061 */
	if(EP18_1QUE >= 36) {
		if(checkquest(16560)) {
			mes "[カヤル]";
			mes "最近、村の中をうろついてる";
			mes "冒険者だな？";
			mes "スアドさんとも仲がいいらしい。";
			next;
			mes "[レッドセル]";
			mes "スアドさんの友人なら";
			mes "僕たちの話を聞いて！";
			mes "アハブというおじさんを";
			mes "どうにかしてくれない？";
			next;
			mes "[ズラン]";
			mes "本当どうしようもない";
			mes "おじさんなんだ！";
			mes "人の話は聞かないくせに";
			mes "自分のことばかり言い出すんだ！";
			mes "しかもそれが役に立つ内容じゃない！";
			next;
			mes "[ズラン]";
			mes "ラヘルにいた頃は、";
			mes "移住の民に協力して";
			mes "上手くやってたらしいけど";
			mes "同じようなノリでここに来られても";
			mes "いい迷惑なんだよな！";
			next;
			mes "[カヤル]";
			mes "この村から追い出せるなら";
			mes "追い出してやりたいよ。";
			next;
			mes "[レッドセル]";
			mes "気持ちは分かるけど";
			mes "ここは、もう行く場所のない人たちが";
			mes "集まる場所なんだ。";
			mes "ここから追い出したら";
			mes "あのおじさんはもう行く場所が無いぞ。";
			next;
			mes "[ズラン]";
			mes "だとしても、俺たちだって";
			mes "これ以上は我慢できない！";
			mes "俺もアハブおじさんみたいに";
			mes "好き勝手しても許してくれるのか？";
			next;
			mes "[カヤル]";
			mes "……それは、耐えられないな。";
			next;
			mes "[レッドセル]";
			mes "というわけで、冒険者さんに";
			mes "お願いしてるってわけです。";
			delquest 16560;
			setquest 16561;
			close;
		}
		if(checkquest(16566)) {
			mes "[カヤル]";
			mes "なに、アハブさんが";
			mes "これからはちゃんとすると言ったの？";
			mes "人って簡単には変わらないと";
			mes "思うんだけど……。";
			next;
			mes "[カヤル]";
			mes "ううん。";
			mes "もう一度信じてみようかな。";
			mes "簡単には変わらないかもだけど";
			mes "確率は0じゃないもんな。";
			close;
		}
		if(checkquest(202335)) {
			mes "[カヤル]";
			mes "人って簡単には変わらないと";
			mes "思うんだけど、確率は0じゃない。";
			mes "もっと時間が必要かもしれないけど";
			mes "これからアハブさんとは";
			mes "いい関係になりそうな気がするよ。";
			close;
		}
		mes "[カヤル]";
		mes "僕たちの村では";
		mes "大事なことは大会議で決める。";
		mes "そこには偉い人も偉くない人も無い。";
		mes "全員同じ立場で参加してる。";
		next;
		mes "[カヤル]";
		mes "でも、あのアハブおじさんは";
		mes "大会議でも偉そうなんだよな。";
		mes "ああいう態度は良くないよ。";
		close;
	}
	mes "[カヤル]";
	mes "悩ましい、悩ましい！";
	mes "人間関係の問題ってのは";
	mes "どうしてこう悩ましいんだ！";
	close;
OnQuestInfo:
	if(checkquest(16560))
		showevent 0, 3, "カヤル#ep18";
	else
		showevent 9999,0,"カヤル#ep18";
	end;
}
wolfvill.gat,87,109,3	script	レッドセル#ep18	943,{/* 16062 */
	if(checkquest(16561)) {
		mes "[レッドセル]";
		mes "僕たちがいくら言っても";
		mes "アハブおじさんには話が通じない。";
		mes "だから代わりに話してみてくれない？";
		next;
		mes "[レッドセル]";
		mes "このままじゃ、アハブおじさんを";
		mes "村から追い出すことになる！";
		mes "まじ、本当、一生のお願いだ。";
		next;
		mes "[ズラン]";
		mes "おっと！";
		mes "こいつの一生のお願いだからな！";
		mes "俺のお願いじゃないからな！";
		mes "俺のは大事に取っておいて";
		mes "恋人ができたら使うんだぁ……。";
		next;
		mes "[レッドセル]";
		mes "てめぇ～～！";
		mes "まあ、とにかくなんでもいいよ！";
		mes "アハブおじさんを何とかして～！";
		delquest 16561;
		setquest 16562;
		close;
	}
	if(checkquest(16562)) {
		mes "[レッドセル]";
		mes "僕たちがいくら言っても";
		mes "アハブおじさんには話が通じない。";
		mes "だから代わりに話してみてくれない？";
		next;
		mes "[レッドセル]";
		mes "君が思ってる以上に";
		mes "大変だと思うけど……";
		mes "よろしく頼むよ！";
		close;
	}
	if(checkquest(16566)) {
		mes "[レッドセル]";
		mes "アハブおじさんに";
		mes "話が通じたってこと!?";
		mes "頼んでおいてなんだけど";
		mes "マジでビックリだ！";
		close;
	}
	if(checkquest(202335)) {
		mes "[レッドセル]";
		mes "アハブおじさん、";
		mes "少しはマシになってきたよ。";
		mes "まだまだ様子は見ないとだけど";
		mes "前に比べりゃすごいマシだよ！";
		next;
		mes "[レッドセル]";
		mes "なんだか僕も考えさせられるよ。";
		mes "自分を変えようと努力してる人って";
		mes "かっこいいんだな。";
		close;
	}
	mes "[レッドセル]";
	mes "聞く耳を持たない人！";
	mes "同じことを何度も言う人！";
	mes "すぐに感情的になる人！";
	mes "自分の仕事に責任を負わない人！";
	mes "みんなうんざりだ！";
	next;
	mes "[レッドセル]";
	mes "嫌いな人が多いって？";
	mes "違う違う！";
	mes "僕が嫌いな人は、ひとりだけだよ！";
	close;
OnQuestInfo:
	if(checkquest(16561))
		showevent 0, 3, "レッドセル#ep18";
	else
		showevent 9999,0,"レッドセル#ep18";
	end;
}
wolfvill.gat,127,155,3	script	アハブ#ep18	928,{/* 16063 */
	if(checkquest(16562)) {
		mes "[アハブ]";
		mes "おーい、そこのお前！";
		mes "名前は覚えてないが";
		mes "ここの住人だろ？";
		next;
		mes "[アハブ]";
		mes "上の立場の人間は";
		mes "いちいち下の人間の名前なんて";
		mes "覚えていないもんだ。";
		mes "特にこのアハブ様は";
		mes "とっても偉い立場の人間だからな！";
		next;
		mes "[アハブ]";
		mes "そんな偉いアハブ様が";
		mes "君に仕事を与えよう。";
		mes "なに、簡単な仕事だ。";
		mes "そこらへんの鶏にだってできる。";
		next;
		// お手伝い～　未確認
		if(select("お手伝いさせていただきます","本当に失礼な人だな！") == 2) {
			mes "[アハブ]";
			mes "はぁ、これだから若いもんは……";
			mes "身勝手で、まるで礼儀を知らない。";
			mes "心遣いができないヤツは";
			mes "天罰が下るぞ！　天罰がな！";
			next;
		}
		mes "[アハブ]";
		mes "このアハブ様が食事をする際に";
		mes "欠かせないソースがあるんだ。";
		mes "そのソースをかけないと";
		mes "何も食べた気にならない！";
		mes "すごく重要なものなんだ。";
		next;
		mes "[アハブ]";
		mes "そのソースを買って来てくれ。";
		mes "ラヘルの「マノマート」で売ってる";
		mes "「キュウグルトソース」だ！";
		mes "急いで行ってくれ！";
		delquest 16562;
		setquest 16563;
		close;
	}
	if(checkquest(16563)) {
		mes "[アハブ]";
		mes "ラヘルの「マノマート」で売ってる";
		mes "「キュウグルトソース」だ！";
		mes "あれが無い食事は";
		mes "食事とは言えないからな。";
		mes "さあ、早く行け！";
		close;
	}
	if(checkquest(16564)) {
		mes "[アハブ]";
		mes "おお！";
		mes "キュウグルトソース！";
		mes "どれどれ…・・・";
		mes "うむ、間違いない！";
		next;
		mes "[アハブ]";
		mes "それじゃあ、食事とするか。";
		mes "この村に来てからようやくまともに";
		mes "食事らしい食事が取れる。";
		next;
		menu "その前にちょっと話を……",-;
		mes "[アハブ]";
		mes "ええい、この不届き者め！";
		mes "この儂が食事をするのに！";
		mes "終わるまで正座して待っていろ！";
		next;
		menu "アハブさんの態度についての話です",-;
		mes "[アハブ]";
		mes "もぐもぐもぐもぐ……";
		mes "アハブさんの態度だとぉ？";
		mes "ちょっと手伝いをしたぐらいで";
		mes "調子に乗ってるな？";
		next;
		mes "[アハブ]";
		mes "よ～し！";
		mes "御高説を賜ろうじゃないか！";
		mes "……食べながら聞いてやるぞ！";
		delquest 16564;
		setquest 16565;
		close;
	}
	if(checkquest(16565)) {
		mes "[アハブ]";
		mes "もぐもぐ……。";
		mes "よし、このアハブ様の態度に関する";
		mes "話をしてみろ！";
		mes "的外れなことを言うなら許さんぞ！";
		next;
		menu "みんなが貴方を嫌っていること、ご存知ですか？",-;
		mes "[アハブ]";
		mes "ブフーーーッ！";
		mes "……し、知ってるぞ！";
		mes "そ、それがどうしたというんだ？";
		mes "若い奴らが、儂のことを老人扱いして";
		mes "除け者にしてるだけじゃないのか？";
		next;
		menu "そんな問題ではありません",-,"アハブさん自身の問題なんです",-;
		mes "[アハブ]";
		mes "儂に何の問題があるって？";
		mes "わ、儂は間違ってない！";
		mes "儂は悪くないぞ！";
		mes "もぐもぐもぐもぐ……。";
		next;
		menu "ここから追い出す話までしてるんですよ？",-;
		mes "[アハブ]";
		mes "ブハーーーーッ！";
		mes "ゴホッ！　ゴホッ!!";
		mes "な、なんだと？　そ、それはダメッ！";
		mes "儂にはもうここ以外に";
		mes "行く当ては無いんだ！";
		next;
		mes "[アハブ]";
		mes "ラヘルでは、全て上手くいってたんだ。";
		mes "原住民の中で儂ほど成功した者は";
		mes "いなかった！";
		mes "なのにいつの間にか移住の民の社長に";
		mes "憎まれてしまって……。";
		next;
		mes "[アハブ]";
		mes "家も財産も全部没収されて";
		mes "ここに来るしかなかったんだ。";
		mes "あ……ああ……。";
		next;
		mes "[アハブ]";
		mes "ね、ねぇ。";
		mes "どうすれば、ここから追い出されずに";
		mes "済むと思う？";
		next;
		mes "[アハブ]";
		mes "本当は、わかってるんだ……";
		mes "儂にはもう何の力も無いことぐらい。";
		mes "権力も無ければ";
		mes "お金も無いんだから！";
		next;
		menu "権力とお金は必要ありません",-,"人々に礼儀正しく接してください",-;
		mes "[アハブ]";
		mes "儂は最善を尽くしてるんだ！";
		mes "若者たちに助言もしたり";
		mes "村の会議に欠かさず参加して";
		mes "意見を述べたり……。";
		next;
		menu "自分の方が立場が上だと思ってはいけません",-;
		mes "[アハブ]";
		mes "だが、儂の方が年上だ！";
		mes "これまでの経験もある！";
		next;
		menu "なら追い出されるしか……",-;
		mes "[アハブ]";
		mes "ぬがーーーっ！";
		mes "だったら何をどうすればいいんだーー！";
		next;
		menu "先ずは大声を出さないで",-,"状況を正確に理解してください",-,"まずは人の話に耳を傾けましょう",-;
		mes "[アハブ]";
		mes "わ……分かった。";
		mes "分かったから、儂を追い出さないでくれ。";
		mes "ほら、君の話に耳を傾けたじゃないか？";
		mes "大声も出さずに。";
		mes "ね？　ね？";
		next;
		mes "[アハブ]";
		mes "儂はただ、若い者たちと";
		mes "仲良くしたかったんだ。";
		mes "偉そうにしてたと言うのなら";
		mes "もう偉そうにはしない！";
		next;
		mes "[アハブ]";
		mes "みんなに認めてもらえるように";
		mes "自分を変えてみせる！";
		mes "と、アハブが言っていたこと";
		mes "みんなに伝えておくれ。";
		next;
		mes "[アハブ]";
		mes "……君も儂の為に来てくれたんだろ？";
		mes "儂の我儘に付き合ってくれて";
		mes "ありがとう……感謝してるよ。";
		delquest 16565;
		setquest 16566;
		close;
	}
	if(checkquest(16566)) {
		mes "[アハブ]";
		mes "みんなに認めてもらえるように";
		mes "自分を変えてみせる！";
		mes "と、アハブが言っていたこと";
		mes "みんなに伝えておくれ。";
		next;
		mes "[アハブ]";
		mes "……君も儂の為に来てくれたんだろ？";
		mes "儂の我儘に付き合ってくれて";
		mes "ありがとう……感謝してるよ。";
		close;
	}
	mes "[アハブ]";
	mes "おーい、そこのお前！";
	mes "名前は覚えてないが";
	mes "ここの住人だろ？";
	next;
	mes "[アハブ]";
	mes "上の立場の人間は";
	mes "いちいち下の人間の名前なんて";
	mes "覚えていないもんだ。";
	mes "特にこのアハブ様は";
	mes "とっても偉い立場の人間だからな！";
	close;
OnQuestInfo:
	if(checkquest(16562) || checkquest(16564) || checkquest(16565))
		showevent 0, 3, "アハブ#ep18";
	else
		showevent 9999,0,"アハブ#ep18";
	end;
}
rachel.gat,135,64,3	script	店主#ep18	930,{/* 16064 */
	if(checkquest(16563)) {
		mes "[店主]";
		mes "らっしゃい！";
		mes "食材専門店「マノマート」だよ！";
		mes "ラヘル最高の食材専門店なんです！";
		mes "さて、何をお探しで？";
		next;
		if(select("キュイグルメソース","キュイグルトソース","キュウグルトソース","キュウグルネソース") != 3) {
			mes "[店主]";
			mes "そんな名前のソースは";
			mes "うちには無いですね～？";
			mes "何かと間違ってません？";
			close;
		}
		mes "[店主]";
		mes "キュウグルトソースね！";
		mes "さすがお客さん、お目が高い！";
		mes "このソースにはキュウリと";
		mes "ヨーグルトが入っていて";
		mes "パンに乗せて食べると美味しいですよ！";
		next;
		mes "[店主]";
		mes "涼しい場所に保管して";
		mes "封を開けたら早く食べてくださいね。";
		mes "はい、どうぞ！";
		delquest 16563;
		setquest 16564;
		close;
	}
	mes "[店主]";
	mes "らっしゃい！";
	mes "食材専門店「マノマート」だよ！";
	mes "ラヘル最高の食材専門店なんです！";
	next;
	mes "[店主]";
	mes "ラヘル中のレストランで";
	mes "うちの食材を使ってます！";
	mes "温めて、揚げるだけで";
	mes "美味しい料理がトントントン♪";
	close;
OnQuestInfo:
	if(checkquest(16563))
		showevent 0, 3, "店主#ep18";
	else
		showevent 9999,0,"店主#ep18";
	end;
}
rachel.gat,38,44,3	script	サマリアム#ep18	921,{/* 16065 */
	if(EP18_1QUE < 36) {
		mes "^ff0000‐クエスト「子供たちも知っている」は";
		mes "　下記の条件を満たすと進行可能です。";
		mes "　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(130102)) {
		mes "[サマリアム]";
		mes "ナイマン、オレ喉乾いた！";
		mes "水を持って来てくれよ！";
		mes "ここからお前んちが";
		mes "一番近いだろ～？";
		next;
		mes "[カルゥ]";
		mes "ドライフルーツも持って来て。";
		mes "家に無ければ買ってきて。";
		next;
		mes "[ナイマン]";
		mes "食べ物は……無いよ。";
		mes "それにボク、お金も持ってないし……。";
		next;
		mes "[ラクシー]";
		mes "え～～嘘だ～？";
		mes "本当は、俺たちに水もドライフルーツも";
		mes "あげたくないんだろ？";
		next;
		mes "[サマリアム]";
		mes "がっかりだな～ナイマン。";
		mes "心の友だと思ってたのに！";
		next;
		mes "[ナイマン]";
		mes "み、水はあるから";
		mes "持ってくるよ！";
		next;
		mes "[サマリアム]";
		mes "水を買うにも金は必要だろ？";
		mes "お前んちに金があるのかよ～？";
		delquest 130102;
		setquest 16581;
		close;
	}
	mes "[サマリアム]";
	mes "遊びすぎて腹減った！";
	mes "喉も乾いたし！";
	mes "どこか涼しいところで";
	mes "冷たいお茶とドライフルーツが";
	mes "食べたいなぁ！";
	close;
OnQuestInfo:
	if(checkquest(130102))
		showevent 0, 3, "サマリアム#ep18";
	else
		showevent 9999,0,"サマリアム#ep18";
	end;
}
rachel.gat,37,42,7	script	カルゥ#ep18	931,{/* 16066 */
	if(checkquest(16581)) {
		mes "[カルゥ]";
		mes "お金ないの？";
		mes "ナイマンの父ちゃんは";
		mes "ラクシーのところの反物屋で";
		mes "働いてるんでしょ？";
		next;
		mes "[ラクシー]";
		mes "母ちゃんは、ナイマンの父ちゃんに";
		mes "ちゃんと金は払ってる！";
		mes "なのに、ナイマンは俺たちに";
		mes "ドライフルーツのひとつも";
		mes "くれないんだな～？";
		next;
		mes "[サマリアム]";
		mes "おい、お前ら～もうやめろよ。";
		mes "ナイマンのところはお金が無いんだから！";
		mes "可哀そうだろ～？";
		next;
		mes "[ナイマン]";
		mes "違う！";
		mes "可哀そうじゃない……";
		mes "可哀そうじゃないよ!!";
		next;
		mes "[サマリアム]";
		mes "冗談だって！";
		mes "そうムキになるなよな！";
		mes "やっぱり原住民は怒りっぽいって";
		mes "本当だったんだな～。";
		next;
		mes "[カルゥ]";
		mes "そんなんでも一緒に遊んであげてる";
		mes "俺たちに感謝してくれよな？";
		delquest 16581;
		setquest 16582;
		close;
	}
	mes "[カルゥ]";
	mes "甘いお茶に冷たい氷をいれて";
	mes "がぶがぶ飲みたいな～。";
	close;
OnQuestInfo:
	if(checkquest(16581))
		showevent 0, 3, "カルゥ#ep18";
	else
		showevent 9999,0,"カルゥ#ep18";
	end;
}
rachel.gat,40,45,3	script	ラクシー#ep18	944,{/* 16067 */
	if(checkquest(16582)) {
		mes "[ラクシー]";
		mes "そうだそうだ！";
		mes "俺たちに感謝しろ～！";
		next;
		menu "見てられないな",-,"いい加減にしろ",-;
		mes "[ラクシー]";
		mes "うん？";
		mes "なんかよそ者が言ってるぞ？";
		next;
		menu "それのどこが遊びなんだ？",-,"いじめてるだけだろ",-;
		mes "[サマリアム]";
		mes "よそ者だから知らないんでしょ？";
		mes "ナイマンは原住民。";
		mes "俺たちは移住の民なんだ。";
		next;
		mes "[サマリアム]";
		mes "原住民は、移住の民に比べて";
		mes "いろいろ「足りない」んだ。";
		mes "ラクシーの母ちゃんも言ってる。";
		mes "原住民は仕事を覚えるのが遅いし";
		mes "怒りっぽいって！";
		next;
		mes "[サマリアム]";
		mes "それなのに、一緒に遊んでやってる";
		mes "俺たちに口出しするっての？";
		delquest 16582;
		setquest 16583;
		close;
	}
	mes "[ラクシー]";
	mes "ナイマンの家が一番近いよね？";
	mes "お茶とお菓子を持って来れないの？";
	close;
OnQuestInfo:
	if(checkquest(16582))
		showevent 0, 3, "ラクシー#ep18";
	else
		showevent 9999,0,"ラクシー#ep18";
	end;
}
rachel.gat,36,45,5	script	ナイマン#ep18	941,{/* 16068 */
	if(checkquest(16583)) {
		mes "[ナイマン]";
		mes "……。";
		next;
		menu "どうしてあの子たちと遊んでるの？",-;
		mes "[ナイマン]";
		mes "それは……友達ですから。";
		mes "この子たちじゃなきゃ";
		mes "私と遊んでくれる子もいないし。";
		next;
		mes "[ナイマン]";
		mes "……家から水を持ってくるよ。";
		mes "それと……怒ってごめん。";
		next;
		cloakonnpc "ナイマン#ep18";
		mes "[サマリアム]";
		mes "まぁ、遊んでるとそんなこともあるよな？";
		mes "あんまり気にするなよ！";
		next;
		cloakonnpc "サマリアム#ep18";
		mes "[ラクシー]";
		mes "他の場所で遊ぼうぜ。";
		mes "異邦人に邪魔されないように！";
		next;
		delquest 16583;
		setquest 202340;
		getitem 1000405,10;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		setquest 130122;
		compquest 130122;
		mes "[カルゥ]";
		mes "ほら異邦人！";
		mes "俺からのお駄賃！";
		mes "もう邪魔しないでくれよなー。";
		mes "じゃ、行こうぜー！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（……原住民と移住の民か。";
		mes "　子供たちの間にも";
		mes "　こういう意識が浸透してるのか）";
		cloakonnpc "ラクシー#ep18";
		cloakonnpc "カルゥ#ep18";
		close;
	}
	mes "[ナイマン]";
	mes "暑い……家に帰りたい。";
	mes "けど、まだまだ遊びたいし……。";
	close;
OnQuestInfo:
	if(checkquest(16583))
		showevent 0, 3, "ナイマン#ep18";
	else
		showevent 9999,0,"ナイマン#ep18";
	end;
}
rachel.gat,181,51,3	script	アモディピン#ep18	929,{/* 16069 */
	if(EP18_1QUE < 36) {
		mes "^ff0000‐クエスト「労働の対価」は";
		mes "　下記の条件を満たすと進行可能です。";
		mes "　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(130101)) {
		mes "[アモディピン]";
		mes "今日も給料をもらえないなんて！";
		mes "もう三か月目なんだぞ……";
		mes "こんな店、すぐに辞めたいけど";
		mes "そうしたら未払いの給与がもらえない。";
		next;
		mes "[アモディピン]";
		mes "仮に仕事を辞めても";
		mes "私みたいな原住民は";
		mes "すぐに仕事が見つからないし";
		mes "ああ、どうしたらいいんだ！";
		next;
		mes "[アモディピン]";
		mes "はっ！";
		mes "貴方、冒険者ですね！";
		mes "厚かましいとは思いますが";
		mes "お願いがございます！";
		next;
		mes "[アモディピン]";
		mes "うちの社長に未払いの給料を";
		mes "私に支払うよう催促してもらえません？";
		next;
		mes "[アモディピン]";
		mes "実は、社長は「冒険者」に";
		mes "憧れてるんです。";
		mes "私の話は聞いてくれませんが";
		mes "貴方の話なら聞いてくれるに";
		mes "違いありませんよ。";
		next;
		if(select("やってみましょう","今は時間がないです") == 2) {
			mes "[アモディピン]";
			mes "そんな殺生な～～！";
			close;
		}
		mes "[アモディピン]";
		mes "ありがとうございます！";
		mes "ありがとうございます！";
		mes "社長の名前は「ダヒル」です。";
		mes "よろしくお願します！";
		delquest 130101;
		setquest 16584;
		close;
	}
	if(checkquest(16585)) {
		mes "[アモディピン]";
		mes "お帰りなさい！";
		mes "で、いかがでしたか？";
		mes "上手くやっていただけました？";
		next;
		mes "[アモディピン]";
		mes "給料を支払ってくれると！";
		mes "ああ、おかげさまで子供たちに";
		mes "腹いっぱいの食事と";
		mes "服を買ってやれます！";
		mes "ありがとうございます！";
		next;
		mes "[アモディピン]";
		mes "は～～でも、明日からまた";
		mes "小言を言われるんだろうなぁ。";
		mes "まあ、給料もらえるから";
		mes "我慢我慢。";
		next;
		mes "[アモディピン]";
		mes "そりゃ～腹は立ちますけど";
		mes "原住民が街で暮らしていく以上は";
		mes "これぐらいのことは我慢しないと";
		mes "やっていけないんですよ。";
		next;
		mes "[アモディピン]";
		mes "街から逃げ出した原住民の村が";
		mes "あるって噂も聞いたことありますが";
		mes "子供もいますからね。";
		mes "そんなところに行く勇気はないです。";
		next;
		delquest 16585;
		setquest 202345;
		getitem 1000405,10;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		setquest 130121;
		compquest 130121;
		mes "[アモディピン]";
		mes "とにかく、貴方は私の恩人です。";
		mes "お忙しいところ";
		mes "本当にありがとうございました。";
		mes "旅の御無事を祈ってますよ。";
		close;
	}
	mes "[アモディピン]";
	mes "毎日毎日、その日の食べ物や";
	mes "子供たちのことが心配で……";
	mes "悩み事のない日はありません。";
	mes "原住民として生まれただけで";
	mes "どうしてこんなに苦労をするのか……。";
	close;
OnQuestInfo:
	if(checkquest(130101) || checkquest(16585))
		showevent 0, 3, "アモディピン#ep18";
	else
		showevent 9999,0,"アモディピン#ep18";
	end;
}
rachel.gat,136,95,3	script	ダヒル#ep18	930,{/* 16070 */
	mes "[ダヒル]";
	mes "いらっしゃい！";
	mes "ダヒル商会でありますよ！";
	mes "何かお探しで……おや？";
	mes "貴方は冒険者様ですね！";
	next;
	mes "[ダヒル]";
	mes "何を隠そう私もかつては";
	mes "冒険者を志していたんです。";
	mes "しかし、足に怪我を負ってしまい";
	mes "冒険者となる道を断念したのです。";
	mes "いや～あれは痛かったな～！";
	if(checkquest(16584)) {
		next;
		mes "[ダヒル]";
		mes "よろしければ、冒険者様のご活躍を";
		mes "聞かせていただけませんか？";
		mes "私は、冒険者様のお話を聞くのが";
		mes "大好きなんですよ。";
		next;
		menu "違う話をしに来ました",-;
		mes "[ダヒル]";
		mes "アモディピンの給料ですか？";
		mes "アモディピンから頼まれた訳ですか？";
		mes "来月、一気に払うと言っていたのに";
		mes "冒険者様を利用するとは";
		mes "如何にも原住民らしい小癪な手を！";
		next;
		menu "どういうことですか？",-;
		mes "[ダヒル]";
		mes "原住民は私達移住の民と違って";
		mes "人の後ろに隠れることを好みます。";
		mes "まったく困ったものだ！";
		next;
		menu "給料の未払いは間違ってる",-,"それは差別では？",-;
		mes "[ダヒル]";
		mes "いやいや、わかってますって！";
		mes "今はキャッシュを持ち合わせて";
		mes "いないだけです！";
		next;
		mes "[ダヒル]";
		mes "まぁ、確かに～アモディピンへの";
		mes "支払いが一番最後になりましたが～。";
		mes "あくまで順番の問題です。はい。";
		next;
		mes "[ダヒル]";
		mes "ええい！";
		mes "明日には給与を支払うし";
		mes "今回のことも叱らないと";
		mes "アモディピンにお伝えください！";
		mes "今、辞められても困りますからね！";
		delquest 16584;
		setquest 16585;
	}
	close;
OnQuestInfo:
	if(checkquest(16584))
		showevent 0, 3, "ダヒル#ep18";
	else
		showevent 9999,0,"ダヒル#ep18";
	end;
}
wolfvill.gat,188,140,7	script	カスレ#町の住民	10401,{/* 16071 */
	mes "[カスレ]";
	mes "う～～ん、うまそうな匂い！";
	mes "出来上がるまでここで";
	mes "待ってよ～っと。";
	next;
	mes "[カスレ]";
	mes "ここで待っていれば";
	mes "一番最初に食べられるもんね！";
	close;
}
wolfvill.gat,202,130,7	script	ヒヤレス#町の住民	10400,{/* 16072 */
	mes "[ヒヤレス]";
	mes "よそ者は、これが気になるの？";
	mes "保存食品の樽だよ。";
	mes "まだ発酵中だから、触っちゃダメ。";
	next;
	mes "[ヒヤレス]";
	mes "お爺ちゃんのお爺ちゃんから伝わる";
	mes "酵母で発酵させてるの。";
	mes "くっさいけど、美味しいよ？";
	close;
}
wolfvill.gat,224,230,3	script	ニニシ#町の住民	10402,{/* 16073 */
	mes "[ニニシ]";
	mes "水に入っちゃダメなんだって。";
	mes "どうしてかな？";
	mes "温かくて気持ちよさそうなのに……。";
	next;
	mes "[ニニシ]";
	mes "ここはすぐに灰まみれになるから";
	mes "水遊びしたいのにな～。";
	close;
}
wolfvill.gat,53,234,0	script	#ep18_wp01	139,14,14,{/* 16074 */
	if(checkquest(130104)) {
		cloakoffnpc "ハザール#ep18_1";
		cloakoffnpc "カミル#ep18_1";
		cloakoffnpc "輸送用荷車#ep18_1";
	}
	else if(checkquest(12532)) {
		cloakoffnpc "ハザール#ep18_1";
		cloakoffnpc "輸送用荷車#ep18_1";
	}
	else if(checkquest(12533)) {
		//Non
	}
	else {
		cloakonnpc "ハザール#ep18_1";
		cloakonnpc "カミル#ep18_1";
		cloakonnpc "輸送用荷車#ep18_1";
	}
	end;
}
wolfvill.gat,50,234,6	script	ハザール#ep18_1	10389,{/* 16075 (cloaking)*/
	if(checkquest(12532)) {
		if(!(checkquest(12532)&8)) {
			mes "[ハザール]";
			mes "ふむ、お前さんが本当に";
			mes "荷車の車輪を直せるか分からんが";
			mes "ここは信じてみようじゃないか。";
			close;
		}
		mes "^0000ff‐ハザールが友好的な眼差を向けてきた‐^000000";
		next;
		mes "[ハザール]";
		mes "ほお……";
		mes "お前さん、器用じゃのう。";
		mes "冒険者というのはみんな";
		mes "お前さんみたいに器用なのかね？";
		next;
		cloakoffnpc "カミル#ep18_1";
		cloakoffnpc "輸送用荷車#ep18_1";
		mes "[カミル]";
		mes "親方！";
		mes "目録を確認しました。";
		mes "必要なものは全部揃っています。";
		mes "あとは車輪が直れば出発できます。";
		next;
		mes "[ハザール]";
		mes "車輪なら、こちらの冒険者様が";
		mes "修理してくださったぞ。";
		mes "ちゃんと礼をしなさい。";
		next;
		mes "[カミル]";
		mes "誠にありがとうございます";
		mes "冒険者様。";
		mes "戻ったら必ずお礼をいたしますので";
		mes "名前を教えていただけないでしょうか？";
		next;
		mes "[カミル]";
		mes strcharinfo(0)+"様ですね。";
		mes "本当にありがとうございます。";
		mes "では親方、行って参ります！";
		next;
		cloakonnpc "カミル#ep18_1";
		cloakonnpc "輸送用荷車#ep18_1";
		mes "[ハザール]";
		mes "やれやれ……";
		mes "こたびは弟子を助けてくださり";
		mes "ありがとうございます。";
		mes "しかし、無事にラヘルまで";
		mes "たどり着けるかどうか……。";
		next;
		mes "[ハザール]";
		mes strcharinfo(0)+"さん。";
		mes "もうひとつ、この老いぼれの願いを";
		mes "聞いてもらえんだろうか？";
		next;
		mes "[ハザール]";
		mes "カミルの奴が隊商を率いて";
		mes "ラヘルまで荷を届けられるか";
		mes "見届けてもらえんじゃろうか。";
		mes "カミルが隊商を率いるのは";
		mes "今回が初めてでな。";
		next;
		mes "[ハザール]";
		mes "ラヘルに約束の品が届かんと";
		mes "この村の収入が絶えることになる。";
		mes "カミルが失敗せぬように";
		mes "助けてもらいたいのじゃ。";
		next;
		menu "承諾する",-;
		mes "[ハザール]";
		mes "ありがとう、";
		mes strcharinfo(0)+"さん。";
		mes "よろしく頼みますぞ。";
		delquest 12532;
		setquest 12533;
		close;
	}
	if(checkquest(12533)) {
		mes "^0000ff‐ハザールが友好的な眼差を向けてきた‐^000000";
		next;
		mes "[ハザール]";
		mes "ありがとう、";
		mes strcharinfo(0)+"さん。";
		mes "よろしく頼みますぞ。";
		close2;
		cloakonnpc "ハザール#ep18_1";
		end;
	}
	if(checkquest(130104)) {
		mes "^0000FF‐老人が青年を叱っているのが見えた‐^000000";
		next;
		mes "[ハザール]";
		mes "今日がラヘルに荷を運ぶ日だと";
		mes "伝えていたはずじゃが";
		mes "この荷車はなんじゃ？";
		mes "車輪にヒビが入っとる。";
		next;
		mes "[カミル]";
		mes "申し訳ございません！";
		mes "新しい車輪を探したんですが";
		mes "予備がなくて……。";
		next;
		mes "[ハザール]";
		mes "革が30包み必要じゃが";
		mes "どこにある？";
		mes "それに荷車を引く牛馬も";
		mes "見あたらんぞ？";
		next;
		mes "[カミル]";
		mes "申し訳ございません、";
		mes "すぐ到着するはずです！";
		next;
		mes "[ハザール]";
		mes "……護衛の者は、どうした？";
		mes "なぜここにいないのだ？";
		mes "まさか、お前一人で";
		mes "ラヘルまで荷を運ぶつもりか？";
		next;
		mes "[カミル]";
		mes "それが……";
		mes "護衛を募集したのですが";
		mes "志願してくれる人がいなくて……。";
		next;
		mes "[ハザール]";
		mes "はぁ……";
		mes "準備不足に関しては";
		mes "後で改めて問いただすが";
		mes "取引に遅れるわけにはいかん。";
		mes "まずは問題を解決せねば。";
		next;
		mes "[カミル]";
		mes "……まずは革を調達します。";
		mes "他は手配済なので";
		mes "これから到着するはずです。";
		next;
		mes "[ハザール]";
		mes "荷車の車輪はどうする？";
		mes "少し動かしただけで壊れそうじゃ。";
		mes "これではラヘルまで持たんぞ？";
		next;
		if(select("車輪の修理を手伝う","通り過ぎる") == 2) {
			mes "^0000FF‐関わるのは、やめておこう‐^000000";
			close;
		}
		mes "[ハザール]";
		mes "なんじゃと？";
		mes "ふむふむ……丈夫な蔓で車輪を";
		mes "補強すると？";
		next;
		mes "[ハザール]";
		mes "ふむ、お前さんが本当に";
		mes "荷車の車輪を直せるか分からんが";
		mes "ここは信じてみようじゃないか。";
		next;
		mes "[カミル]";
		mes "冒険者様！";
		mes "今回のラヘルへの荷運びは";
		mes "僕が責任者を任されています。";
		next;
		mes "[カミル]";
		mes "荷車の車輪を修理していただければ";
		mes "お礼も用意いたしますので";
		mes "何卒よろしくお願いいたします。";
		mes "では、僕は荷物の確認のために";
		mes "席を外します。";
		delquest 130104;
		setquest 12532;
		close2;
		cloakonnpc "カミル#ep18_1";
		end;
	}
OnQuestInfo:
	if(checkquest(130104))
		showevent 0, 3, "ハザール#ep18_1";
	else
		showevent 9999,0,"ハザール#ep18_1";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,53,234,4	script	輸送用荷車#ep18_1	10390,{/* 16076 (cloaking)*/
	if(checkquest(12532)) {
		mes "‐ボロボロになった荷車の車輪がある。";
		mes "　<ITEM>[丈夫な蔓]<INFO>7197</INFO></ITEM>があれば";
		mes "　補強できるかもしれない‐";
		next;
		if(select("補強を試す","やめておく") == 2) {
			mes "^0000FF‐出直すことにした‐^000000";
			close;
		}
		progressbar 2,"輸送用荷車#ep18_1";	//color=0xffff00
		if(countitem(7197) < 1) {
			mes "‐車輪を補強するための";
			mes "　<ITEM>[丈夫な蔓]<INFO>7197</INFO></ITEM>を";
			mes "　持っていなかった‐";
			close;
		}
		if(rand(100) < 50) {
			misceffect 154,"輸送用荷車#ep18_1";
			mes "^0000FF‐上手く補強できた！‐^000000";
			delitem 7197,1;
			delmisceffect 1090, "輸送用荷車#ep18_1";
			compquest 12532;
			close;
		}
		else {
			//未調査
			misceffect 155,"輸送用荷車#ep18_1";
			mes "^0000FF‐補強に失敗してしまった！‐^000000";
			delitem 7197,1;
			close;
		}
	}
	mes "‐ボロボロになった荷車の車輪がある。";
	close;
OnQuestInfo:
	if(checkquest(12532) && !(checkquest(12532)&8) && countitem(7197) < 1)
		showevent 0, 2, "輸送用荷車#ep18_1";
	else if(!(checkquest(12532)&8))
		showevent 0, 3, "輸送用荷車#ep18_1";
	else
		showevent 9999,0,"輸送用荷車#ep18_1";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,56,234,4	script	カミル#ep18_1	10388,{/* 16077 (cloaking)*/
	mes "^0000FF‐老人に叱られている青年が見えた‐^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,115,130,0	script	#ep18_wp02	139,5,5,{/* 16078 */
	if(checkquest(12533)) {
		cloakoffnpc "輸送用荷車#ep18_2";
	}
	end;
}
gw_fild01.gat,115,130,4	script	輸送用荷車#ep18_2	10390,{/* 16079 (cloaking)*/
	if(checkquest(12533)) {
		mes "^0000FF‐カミルが率いていた荷車だ。";
		mes "　積荷が周囲に散乱している。";
		mes "　何か良くないことが起きたに違いない。";
		mes "　カミルを探した方が良いだろう‐^000000";
		delquest 12533;
		setquest 12534;
		close;
	}
	if(checkquest(12534)) {
		mes "^0000FF‐カミルが率いていた荷車だ。";
		mes "　積荷が周囲に散乱している‐^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(12533))
		showevent 0, 3, "輸送用荷車#ep18_2";
	else
		showevent 9999,0,"輸送用荷車#ep18_2";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,202,102,0	script	#ep18_wp03	139,4,4,{/* 16080 */
	if(checkquest(12534)) {
		if(!(checkquest(12534)&8))
			cloakoffnpc "#ep18_2_mon";
		cloakoffnpc "カミル#ep18_2";
	}
	else {
		cloakonnpc "カミル#ep18_2";
		cloakonnpc "#ep18_2_mon";
	}
	end;
}
gw_fild01.gat,205,102,4	script	#ep18_2_mon	21304,{/* 16081 (cloaking)*/
	if(checkquest(12534)) {
		unittalk getnpcid(0,"#ep18_2_mon"),"ぐるるる…";
		unittalk getnpcid(0,"カミル#ep18_2"),"ちくしょう";
		mes "^0000FF‐カミルがモンスターと対峙している。";
		mes "　状況はあまり良くなさそうだ。";
		mes "　カミルを支援した方が良いだろう‐^000000";
		while(1) {
			next;
			switch(select("戦闘の助言を行う","モンスターを直接倒す","知らんぷりして通り過ぎる")) {
			case 1:
				mes "^0000ffカミルに狼への攻撃方法を指示しよう^000000";
				set '@kamir_hp,1000;
				set '@mon_hp,1000;
				break;
			case 2:
				mes "["+strcharinfo(0)+"]";
				mes "（いや……";
				mes "　彼の成長のためにもここは";
				mes "　助言してあげる方がいいだろう)";
				continue;
			case 3:
				mes "^0000FF‐いったん出直すことにしよう‐^000000";
				close;
			}
			break;
		}
		do {
			mes "狼の生命力 - ^ff0000" +'@mon_hp+ "^000000";
			mes "カミルの生命力 - ^0000ff" +'@kamir_hp+ "^000000";
			next;
			switch(select("弱攻撃(高い確率)","中攻撃(普通の確率)","強攻撃(低い確率)","会心の一撃(奇跡的な確率)","いったん退却する")) {
			case 1:
				set '@rate,90;
				set '@damage,10;
				break;
			case 2:
				set '@rate,60;
				set '@damage,30;
				break;
			case 3:
				set '@rate,30;
				set '@damage,70;
				break;
			case 4:
				set '@rate,10;
				set '@damage,200;
				break;
			case 5:
				mes "^0000FF‐いったん出直すことにしよう‐^000000";
				close;
			}
			if('@rate < rand(100)) {
				misceffect 537,"#ep18_2_mon";
				misceffect 567,"#ep18_2_mon";
				unittalk getnpcid(0,"#ep18_2_mon"),"-"+ '@damage;
				unittalk getnpcid(0,"カミル#ep18_2")," ";
			}
			else {
				misceffect 537,"カミル#ep18_2";
				misceffect 567,"カミル#ep18_2";
				unittalk getnpcid(0,"#ep18_2_mon")," ";
				unittalk getnpcid(0,"カミル#ep18_2"),"-"+ '@damage;
			}
		} while('@mon_hp <= 0 || '@kamir_hp <= 0);
		if('@mon_hp <= 0) {
			mes "^0000ff狼を倒した！^000000";
			compquest 12534;
			cloakonnpc "#ep18_2_mon";
			close;
		}
		else {
			mes "^0000ff一度撤退しよう！^000000";
			close;
		}
	}
OnQuestInfo:
	if(checkquest(12534) && !(checkquest(12534)&8))
		showevent 0, 3, "#ep18_2_mon";
	else
		showevent 9999,0,"#ep18_2_mon";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,201,102,6	script	カミル#ep18_2	10388,{/* 16082 (cloaking)*/
	if(checkquest(12534) && checkquest(12534)&8) {
		mes "[カミル]";
		mes "はぁ……はぁ……";
		mes "ありがとうございます、冒険者様。";
		mes "助言をいただかなければ";
		mes "今頃僕は、モンスターの腹の中でした。";
		next;
		mes "[カミル]";
		mes "荷馬車をご覧になられたと思いますが";
		mes "奴らに積荷を奪われてしまって……";
		mes "全部を取り返すのは無理でしたが";
		mes "なんとか一部を取り戻せました。";
		next;
		mes "[カミル]";
		mes "僕は取り戻せた分の積荷を持って";
		mes "村に戻り、今回の失敗の罰を";
		mes "受けるつもりです。";
		next;
		menu "今回は事故ではないですか？",-;
		mes "[カミル]";
		mes "……数か月分の食料や生活必需品と";
		mes "交換する予定の積荷だったんです。";
		mes "決して軽い罪ではありません。";
		next;
		mes "[カミル]";
		mes "元々、親方は僕が荷物を運ぶことに";
		mes "反対しておられたんです。";
		mes "にも関わらず無理を通したのは僕です。";
		mes "すべて僕の責任です。";
		next;
		mes "[カミル]";
		mes "もし僕が逃げたりしたら";
		mes "親方が代わりに";
		mes "責任を負うことになります。";
		mes "それだけはあってはいけません。";
		next;
		mes "[カミル]";
		mes "……ご協力に感謝いたします。";
		mes "僕は村に戻ります。";
		mes "運命が許してくれれば";
		mes "また会えると思います……。";
		delquest 12534;
		setquest 12535;
		close2;
		cloakonnpc "カミル#ep18_2";
		end;
	}
	if(checkquest(12535)) {
		// 未調査
	}
	mes "^0000FF‐今は話を聞けない状態のようだ‐^000000";
	close;
OnQuestInfo:
	if(checkquest(12534) && checkquest(12534)&8)
		showevent 0, 3, "カミル#ep18_2";
	else
		showevent 9999,0,"カミル#ep18_2";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,76,210,0	script	#ep18_wp03	139,4,4,{/* 16083 */
	if(checkquest(12535) || checkquest(12531)) {
		cloakoffnpc "ハザール#ep18_3";
		cloakoffnpc "カミル#ep18_3";
		cloakoffnpc "立会人#ep18_31";
		cloakoffnpc "立会人#ep18_32";
		cloakoffnpc "立会人#ep18_33";
	}
	else {
		cloakonnpc "ハザール#ep18_3";
		cloakonnpc "カミル#ep18_3";
		cloakonnpc "立会人#ep18_31";
		cloakonnpc "立会人#ep18_32";
		cloakonnpc "立会人#ep18_33";
	}
	end;
}
wolfvill.gat,75,214,4	script	ハザール#ep18_3	10389,{/* 16084 (cloaking)*/
	if(checkquest(12535)) {
		mes "^0000FF‐村の隊商主たちによる会議が";
		mes "　行われている‐^000000";
		next;
		mes "[ハザール]";
		mes "皆にはまことに申し訳ない……";
		mes "大事な積荷を失うとは";
		mes "儂の不徳の致すところ。";
		next;
		mes "[立会人]";
		mes "ハザール、お前のせいではない。";
		mes "無理やり隊商を率いようとした";
		mes "カミルの責任だろう？";
		next;
		mes "[ハザール]";
		mes "いや。弟子に経験を積ませるために";
		mes "隊商を率いるように言ったのは";
		mes "儂なのじゃ。";
		next;
		mes "[カミル]";
		mes "違います！";
		mes "僕がわがままを言って";
		mes "師匠に役を譲っていただいたのです！";
		mes "全ての責任は僕にあります！";
		next;
		mes "[ハザール]";
		mes "カミル！";
		mes "お前は黙っておれ！";
		unittalk getnpcid(0,"立会人#ep18_31"),"はぁ……";
		unittalk getnpcid(0,"立会人#ep18_32"),"ふぅむ……";
		unittalk getnpcid(0,"立会人#ep18_33"),"やれやれ……";
		next;
		mes "[立会人]";
		mes "俺たちもカミルを幼い頃から";
		mes "見守ってきた立場だ。";
		mes "事情は分からなくもない。";
		next;
		mes "[立会人]";
		mes "事情は分かるが";
		mes "隊商には隊商の掟がある。";
		next;
		mes "[立会人]";
		mes "隊商の掟に従えば";
		mes "カミルの首を差し出さねばならん。";
		next;
		mes "[カミル]";
		mes "掟に従います。";
		mes "僕の責任なのですから";
		mes "ケジメをつけさせてください。";
		next;
		mes "[ハザール]";
		mes "口を慎め、カミル！";
		next;
		mes "[立会人]";
		mes "そう結論を急ぐな……";
		mes "まずは被害の状況を確認しよう。";
		next;
		mes "[立会人]";
		mes "革を失ったことによって";
		mes "本来購入できるはずだった食糧などを";
		mes "予定通りに購入できなかった。";
		mes "ここまでは間違いないな？";
		next;
		mes "[立会人]";
		mes "うむ……";
		mes "それなら、今すぐに隊商たちで";
		mes "捜索隊を組織し";
		mes "モンスターに奪われた荷を";
		mes "探せば良いのではないか？";
		next;
		mes "[立会人]";
		mes "それはそうだが";
		mes "我らが捜索隊を組織すれば";
		mes "今回の件、村中に知れ渡るだろう。";
		next;
		mes "[立会人]";
		mes "……そうなれば、カミルを";
		mes "処罰しなければならなくなるな。";
		next;
		menu "手を貸しましょうか？",-;
		mes "[ハザール]";
		mes strcharinfo(0)+"さん？";
		mes "しかし……";
		mes "部外者の手を借りるわけには……。";
		next;
		mes "[立会人]";
		mes "いや。";
		mes "部外者であることの方が都合が良い。";
		mes "部外者が荷物を探し出してくれれば";
		mes "今回の件は隊商内だけで";
		mes "完結したことにできる。";
		next;
		mes "[ハザール]";
		mes strcharinfo(0)+"さん……";
		mes "本当に手を貸してくださるのか？";
		mes "我々の代わりに";
		mes "積荷を探してきてくれると？";
		next;
		menu "お任せください！",-;
		mes "[立会人]";
		mes "カミルのために動いてくれるとは";
		mes "……感謝いたします。";
		next;
		mes "[立会人]";
		mes "私からも感謝いたします。";
		mes "カミルはまだまだ未熟ですが";
		mes "失うには惜しい人物ですからな。";
		next;
		mes "[ハザール]";
		mes "本当に、なんと礼を言えば良いか……";
		mes "カミル、冒険者様に積荷を";
		mes "失くした場所をお伝えしなさい。";
		next;
		mes "[カミル]";
		mes "は、はい！";
		mes "わかりました！";
		mes "　";
		mes "^0000FF‐カミルから積み荷を失くした場所を";
		mes "　教えてもらった‐^000000";
		delquest 12535;
		setquest 12536;
		setquest 12537;
		setquest 12538;
		setquest 12539;
		next;
		mes "[ハザール]";
		mes "何卒よろしくお願いいたします。";
		close2;
		cloakonnpc "ハザール#ep18_3";
		cloakonnpc "カミル#ep18_3";
		cloakonnpc "立会人#ep18_31";
		cloakonnpc "立会人#ep18_32";
		cloakonnpc "立会人#ep18_33";
		end;
	}
	if(checkquest(12531)) {
		mes "^0000FF‐村の隊商主たちによる会議が";
		mes "　行われている。";
		mes "　彼らに見つけた積荷を渡した‐^000000";
		next;
		mes "[立会人]";
		mes "おお……こんなにも早く!?";
		next;
		mes "[立会人]";
		mes "どれどれ……？";
		mes "うむ……少し足りないようだが";
		mes "これぐらいの量は、不良品として";
		mes "取引対象にならなかったものとして";
		mes "処理できますな。";
		next;
		mes "[立会人]";
		mes "許容範囲内であれば";
		mes "今回の会議の案件も";
		mes "変更するべきでしょうな。";
		next;
		mes "[立会人]";
		mes "交易品の遺失に関してではなく";
		mes "隊商の出発が遅延している件に";
		mes "変更するということで";
		mes "構いませんな？";
		next;
		mes "[ハザール]";
		mes "出発が予定より二日遅れておる。";
		mes "この件について結論を出してくだされ。";
		next;
		mes "[立会人]";
		mes "では、遅延の責任を取って";
		mes "カミルには3か月間の";
		mes "雑務に当たることを言いつける。";
		mes "事務作業を行いつつ";
		mes "今回の件を反省してもらおう。";
		next;
		mes "[立会人]";
		mes "異議なし！";
		mes "　";
		mes "[立会人]";
		mes "私も異議ありません。";
		next;
		mes "[ハザール]";
		mes "よかったの、カミル。";
		mes "打ち首は免れたわい。";
		next;
		mes "[カミル]";
		mes "ありがとうございます、親方。";
		mes "隊商主の皆様にも感謝いたします。";
		next;
		delquest 12531;
		setquest 202330;
		getitem 1000405,20;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		setquest 130124;
		compquest 130124;
		mes "[カミル]";
		mes strcharinfo(0)+"様も";
		mes "本当にありがとうございました！";
		mes "貴方は私の命の恩人です。";
		mes "……ささやかですがお礼の品を";
		mes "用意しました。お受け取りください。";
		emotion 28,"立会人#ep18_31";
		close2;
		cloakonnpc "ハザール#ep18_3";
		cloakonnpc "カミル#ep18_3";
		cloakonnpc "立会人#ep18_31";
		cloakonnpc "立会人#ep18_32";
		cloakonnpc "立会人#ep18_33";
	}
	end;
OnQuestInfo:
	if(checkquest(12535) || checkquest(12531))
		showevent 0, 3, "ハザール#ep18_3";
	else
		showevent 9999,0,"ハザール#ep18_3";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,79,213,3	script	カミル#ep18_3	10388,{/* 16085 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,72,209,8	script	立会人#ep18_31	929,{/* 16086 (cloaking)*/
	mes "[立会人]";
	mes "会議中の雑談は禁止されておる。";
	close;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,74,208,8	script	立会人#ep18_32	928,{/* 16087 (cloaking)*/
	mes "[立会人]";
	mes "雑談している暇は無いぞ。";
	close;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,77,207,8	script	立会人#ep18_33	931,{/* 16088 (cloaking)*/
	mes "[立会人]";
	mes "すまないが";
	mes "後にしてくれないか？";
	mes "今は会議中なんだ。";
	close;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,242,325,4	script	#ep18_12536	10428,{/* 16089 (cloaking)*/
	if(checkquest(12536)) {
		misceffect 561,"#ep18_12536";
		progressbar 2,"#ep18_12536";	//color=0xffff00
		delmisceffect 561, "#ep18_12536";
		misceffect 135,"#ep18_12536";
		delquest 12536;
		if(checkquest(12536) || checkquest(12537) || checkquest(12538) || checkquest(12539))
			unittalk getcharid(3),strcharinfo(0)+" : ‐荷物を見つけた！‐",1;
		else {
			unittalk getcharid(3),strcharinfo(0)+" : ‐荷物を見つけた！もう充分回収できたようだ‐",1;
			setquest 12531;
		}
		cloakonnpc "#ep18_12536";
	}
	end;
OnQuestInfo:
	if(checkquest(12536))
		showevent 0, 3, "#ep18_12536";
	else
		showevent 9999,0,"#ep18_12536";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,242,325,0	script	#wp12536	139,{/* 16090 */}
gw_fild01.gat,89,211,4	script	#ep18_12537	10428,{/* 16091 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,89,211,0	script	#wp12537	139,{/* 16092 */}
gw_fild01.gat,347,194,4	script	#ep18_12538	10428,{/* 16093 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,347,194,0	script	#wp12538	139,{/* 16094 */}
gw_fild01.gat,230,52,4	script	#ep18_12539	10428,{/* 16095 (cloaking)*/
	if(checkquest(12539)) {
		misceffect 561,"#ep18_12539";
		progressbar 2,"#ep18_12539";	//color=0xffff00
		delmisceffect 561, "#ep18_12539";
		misceffect 135,"#ep18_12539";
		delquest 12539;
		if(checkquest(12536) || checkquest(12537) || checkquest(12538) || checkquest(12539))
			unittalk getcharid(3),strcharinfo(0)+" : ‐荷物を見つけた！‐",1;
		else {
			unittalk getcharid(3),strcharinfo(0)+" : ‐荷物を見つけた！もう充分回収できたようだ‐",1;
			setquest 12531;
		}
		cloakonnpc "#ep18_12539";
	}
	end;
OnQuestInfo:
	if(checkquest(12539))
		showevent 0, 3, "#ep18_12539";
	else
		showevent 9999,0,"#ep18_12539";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,230,52,0	script	#wp12539	139,5,5,{/* 16096 */
	if(checkquest(12539))
		cloakoffnpc "#ep18_12539";
	end;
}
rachel.gat,155,236,0	script	#ep18w12_148	139,14,14,{/* 16097 */
	if(EP18_1QUE >= 36)
		cloakoffnpc "平静な神官ジュノーク#atm0";
	else
		cloakonnpc "平静な神官ジュノーク#atm0";
	end;
}
rachel.gat,155,236,3	script	平静な神官ジュノーク#atm0	935,{/* 16098 (cloaking)*/
	// 初回未調査
	mes "[ジュノーク]";
	mes "お変わりありませんか？";
	mes "よろしければ今日も";
	mes "原住民たちと移住の民たちの様子を";
	mes "調査してきてもらえませんか？";
	next;
	if(select("手伝いましょう","今は時間が無い") == 2) {
		mes "[ジュノーク]";
		mes "それは残念です。";
		mes "とても悲しい……。";
		close;
	}
	mes "[ジュノーク]";
	mes "では、こちらが指定する";
	mes "原住民と移住の民の3人ずつから";
	mes "お話を聞いてきてください。";
	mes "よろしくお願いいたします。";
	delquest 3504;
	setquest 3503;
	setquest 3495;
	setquest 3496;
	setquest 3497;
	setquest 3498;
	setquest 3499;
	setquest 3501;
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,69,234,3	script	ジャラド#atm1	921,{/* 16099 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
		}
	}
	mes "[ジャラド]";
	mes "こんにちは。";
	mes "最近、街の雰囲気が怪しい気がします。";
	mes "まぁ、自分とはそこまで";
	mes "関係ないですけどね。";
	close;
}
rachel.gat,100,72,3	script	ロヒ#atm2	919,{/* 16100 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
			mes "[ロヒ]";
			mes "今日も明るい気持ちで";
			mes "仕事に向かえます。";
			close;
		}
		mes "[ロヒ]";
		mes "こんにちは、お元気ですか。";
		mes "ようやくジーナ様から適切な給料を";
		mes "もらえるようになりました。";
		next;
		mes "[ロヒ]";
		mes "これもマラム様や神官たちが";
		mes "不当な状況を改善しようと";
		mes "動いてくださったおかげです。";
		mes "本当に感謝しています。";
		next;
		mes "[ロヒ]";
		mes "今後、他の原住民たちの処遇も";
		mes "改善させていくことでしょう。";
		mes "悩み事も解決したので";
		mes "ゆっくり眠れそうです。";
		next;
		compquest 3494;
		mes "[ロヒ]";
		mes "それでは、";
		mes "今日も良い日になりますように。";
		mes "　";
		mes "^0000FF‐ロヒから話を聞いた。";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[ロヒ]";
	mes "こんにちは、ロヒです。";
	mes "ようやく新しい仕事を見つけましたが";
	mes "新しい悩みが出て来ました……。";
	close;
}
rachel.gat,258,207,3	script	ジョジン#atm3	918,{/* 16101 */
	if(checkquest(3495)) {
		if(checkquest(3495)&8) {
			mes "[ジョジン]";
			mes "これまでつらい時期を過ごしてきたけど";
			mes "今は将来に期待することが";
			mes "できるようになったよ。";
			close;
		}
		mes "[ジョジン]";
		mes "お元気？　僕はジョジンと申します。";
		next;
		mes "[ジョジン]";
		mes "以前に、建物を売却するかどうか";
		mes "悩んでいるって言ってたけど";
		mes "売却せずに済みそうだよ。";
		next;
		mes "[ジョジン]";
		mes "神殿の神官たちが";
		mes "原住民に対して、移住の民と同等の";
		mes "権利を認めてくれたんだ。";
		next;
		mes "[ジョジン]";
		mes "そうなれば、僕の事業も安定するし";
		mes "建物を売らずに済むからね。";
		mes "良い知らせを伝えられて、僕も嬉しい。";
		next;
		compquest 3495;
		mes "[ジョジン]";
		mes "ではでは、よい一日を。";
		mes "　";
		mes "^0000FF‐ジョジンから話を聞いた。";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[ジョジン]";
	mes "お元気？　僕はジョジンと申します。";
	next;
	mes "[ジョジン]";
	mes "僕はラヘル内に複数の建物を";
	mes "所有してますが";
	mes "維持管理が難しい状況です。";
	mes "建物を売却するしか方法がないのかも？";
	close;
}
rachel.gat,159,173,3	script	スクアイン#atm4	870,{/* 16102 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
			mes "[スクアイン]";
			mes "今日もやりがいのある一日が";
			mes "始まるぞぉ！";
			close;
		}
		mes "[スクアイン]";
		mes "この街で一番貧乏だった";
		mes "スクアインと申します。";
		mes "ありがたいことに";
		mes "お仕事をもらえたんです。";
		next;
		mes "[スクアイン]";
		mes "これで他人に頼ってばかりの生活とも";
		mes "おさらばです。";
		next;
		mes "[スクアイン]";
		mes "今まで多くの人のお世話になったので";
		mes "これからは、私も他人を助けるような";
		mes "人になろうと思ってます。";
		next;
		compquest 3496;
		mes "[スクアイン]";
		mes "では、お気をつけて。";
		mes "　";
		mes "^0000FF‐スクアインから話を聞いた。";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[スクアイン]";
	mes "こんにちは。";
	mes "この街で一番貧乏な";
	mes "スクアインと申します。";
	mes "今日も一日無事に過ごしたいです。";
	close;
}
rachel.gat,190,30,5	script	セナド#atm5	746,{/* 16103 */
	if(checkquest(3497)) {
		if(checkquest(3497)&8) {
			mes "[セナド]";
			mes "闘いで負けたことが";
			mes "いつのことだったのか";
			mes "もう思い出せません。";
			close;
		}
		mes "[セナド]";
		mes "こんにちは。";
		mes "武闘家のセナドと言います。";
		next;
		mes "[セナド]";
		mes "私に試合を申し込んできたのは";
		mes "移住の民でしたが";
		mes "私自身は、原住民の代表として";
		mes "負けられない！　という思いは";
		mes "持っていませんでした。";
		next;
		mes "[セナド]";
		mes "それよりも、自由に強敵と闘える";
		mes "環境が整備されたことの方が";
		mes "私には重要でしたからね。";
		next;
		mes "[セナド]";
		mes "試合の結果ですか？";
		mes "もちろん、私の勝ちです。";
		mes "次はぜひ、貴方とも戦いたいものです。";
		next;
		compquest 3497;
		mes "[セナド]";
		mes "それでは、またお会いしましょう。";
		mes "　";
		mes "^0000FF‐セナドから話を聞いた。";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[セナド]";
	mes "こんにちは。";
	mes "武闘家のセナドと言います。";
	mes "ふむ……見たところ";
	mes "あなたもかなりの使い手ですね。";
	mes "いつか手合わせしたいものです。";
	close;
}
rachel.gat,210,52,5	script	ジェイパー#atm6	46,{/* 16104 */
	if(checkquest(3498)) {
		if(checkquest(3498)&8) {
			mes "[ジェイパー]";
			mes "まぁ、他の商人たちも";
			mes "商売がしやすくなるってことは";
			mes "条件が一緒ってことだからな。";
			mes "もう一度、頑張ってみるさ！";
			close;
		}
		mes "[ジェイパー]";
		mes "元気かね。";
		mes "商人組合をやっているジェイパーだ。";
		mes "今回、街で起こったいざこざのおかげで";
		mes "いろいろ思うことがあったよ。";
		next;
		mes "[ジェイパー]";
		mes "自分の商圏から原住民の商人を";
		mes "追い出したり";
		mes "原住民たちを安い給料で";
		mes "雇っていたり……";
		mes "それができなくなったがね。";
		next;
		mes "[ジェイパー]";
		mes "本音を言えば";
		mes "納得できないことも多いんだが";
		mes "長い目で見れば、商圏が発展する";
		mes "機会を得たと思えば";
		mes "そう悪い話でもないよな。";
		next;
		compquest 3498;
		mes "[ジェイパー]";
		mes "では、またね。";
		mes "　";
		mes "^0000FF‐ジェイパーから話を聞いた。";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[ジェイパー]";
	mes "元気かね。";
	mes "商人組合をやっているジェイパーだ。";
	mes "よそでは真似のできない";
	mes "高品質の品をたくさん扱ってるよ。";
	close;
}
rachel.gat,40,73,7	script	シロアン#atm7	67,{/* 16105 */
	if(checkquest(3499)) {
		if(checkquest(3499)&8) {
			mes "[シロアン]";
			mes "結果的に、落ちるところに";
			mes "落ちたようで良かったです。";
			close;
		}
		mes "[シロアン]";
		mes "ジェイパーさんの秘書をしている";
		mes "シロアンと申します。";
		next;
		mes "[シロアン]";
		mes "ジェイパーさんが神官たちの法令を";
		mes "受け入れたのは意外でした。";
		mes "てっきり、法令を無視するかと";
		mes "思っていましたから。";
		next;
		mes "[シロアン]";
		mes "もちろん合理的な人ですから";
		mes "考えた末にそれが賢明であるとの";
		mes "判断なのでしょうが。";
		next;
		mes "[シロアン]";
		mes "原住民たちへのお給料も増やしましたが";
		mes "おかげで原住民たちとの摩擦も";
		mes "少なくなりました。";
		mes "本当によかったです。";
		next;
		compquest 3499;
		mes "[シロアン]";
		mes "では、平穏な一日になりますように。";
		mes "　";
		mes "^0000FF‐シロアンから話を聞いた";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[シロアン]";
	mes "こんにちは。";
	mes "ジェイパーさんの秘書をしている";
	mes "シロアンと申します。";
	mes "最近は街が騒がしいですね。";
	mes "どうかお気をつけください。";
	close;
}
rachel.gat,88,151,3	script	イシラ#atm8	68,{/* 16106 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
		}
	}
	mes "[イシラ]";
	mes "こんにちは、イシラと申します。";
	mes "近頃、聖都全体が騒がしいですね。";
	mes "どうか気を付けてください。";
	close;
}
rachel.gat,240,182,5	script	ジーナ#atm9	69,{/* 16107 */
	if(checkquest(3501)) {
		if(checkquest(3501)&8) {
			mes "[ジーナ]";
			mes "私は少しばかり";
			mes "利己的すぎたのでしょうか？";
			close;
		}
		mes "[ジーナ]";
		mes "こんにちは。";
		mes "移住の民のジーナと申します。";
		next;
		mes "[ジーナ]";
		mes "原住民たちとの関係の中で";
		mes "落ち込むことが多かったのですが";
		mes "ようやく前向きに考えられるように";
		mes "なってきました。";
		next;
		mes "[ジーナ]";
		mes "彼らの犠牲の上で成り立つ";
		mes "事業を起こしても";
		mes "長続きはしなかったことでしょう。";
		mes "今回の件で、いろいろと";
		mes "気付かされました。";
		next;
		compquest 3501;
		mes "[ジーナ]";
		mes "では、良い一日を。";
		mes "　";
		mes "^0000FF‐ジーナから話を聞いた。";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[ジーナ]";
	mes "こんにちは。";
	mes "移住の民のジーナと申します。";
	close;
}
rachel.gat,212,52,3	script	ハリ#atm10	74,{/* 16108 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
			mes "[ハリ]";
			mes "今日も良い一日を";
			mes "お過ごしくださいませ。";
			close;
		}
		mes "[ハリ]";
		mes "こんにちは、私は「ハリ」。";
		mes "意地っ張りのジェイパーと私は";
		mes "夫婦なんですよ。";
		next;
		mes "[ハリ]";
		mes "原住民たちとの給与交渉も";
		mes "折り合いをつけることができて";
		mes "ほっとしています。";
		mes "ジェイパーは、給与を増やす気は";
		mes "なかったみたいですけど。";
		next;
		mes "[ハリ]";
		mes "お互いにギクシャクしたまま";
		mes "仕事なんてできないですからね。";
		mes "売上は下がりますが";
		mes "私は納得していますよ。";
		next;
		compquest 3502;
		mes "[ハリ]";
		mes "では、お気をつけてお帰り下さい。";
		mes "　";
		mes "^0000FF‐ハリから話を聞いた。";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "　6人全員から話を聞くことができた。";
			mes "　ジュノークに報告しよう‐^000000";
			setquest 3505;
		}
		else
			mes "　次の会話相手を探してみよう‐^000000";
		close;
	}
	mes "[ハリ]";
	mes "こんにちは、私は「ハリ」。";
	mes "意地っ張りのジェイパーと私は";
	mes "夫婦なんですよ。";
	close;
}
ra_in01.gat,388,59,0	script	#ep18w01	139,14,14,{/* 16109 */
	if(checkquest(8718)) {
		cloakoffnpc "従業員#ep1800";
		cloakonnpc "支配人#ep18";
	}
	end;
}
ra_in01.gat,388,59,5	script	従業員#ep1800	930,{/* 16110 (cloaking)*/
	if(checkquest(8718)) {
		mes "[従業員]";
		mes "いらっしゃいま……！";
		mes "冒険者さま、火山灰の匂いがしますね。";
		mes "トール火山……いや、違う。";
		next;
		mes "^0000FF‐従業員は周りを警戒してから";
		mes "　低い声で話し出した‐^000000";
		next;
		mes "[従業員]";
		mes "もしかして、灰色狼の村へ行く道を";
		mes "知ってらっしゃるのでは？";
		next;
		if(select("知ってます","知らないなぁ") == 2) {
			mes "[従業員]";
			mes "……とぼけても無駄ですよ。";
			next;
		}
		mes "[従業員]";
		mes "……私をそこに案内して";
		mes "もらえませんか？";
		mes "本当に……";
		mes "本当にそこへ行きたいんです！";
		next;
		menu "貴方は誰なんですか？",-;
		mes "[ホリム]";
		mes "す、すいません。";
		mes "いきなりでビックリされたでしょう。";
		mes "私は「ホリム」と申します。";
		mes "……原住民です。";
		next;
		mes "[ホリム]";
		mes "私の家族や友人たちは";
		mes "皆、ラヘルを去って";
		mes "隠れ村に行きました。";
		mes "でも、私だけラヘルに残ったんです。";
		mes "怖かったんです、街の外に出るのが。";
		next;
		mes "[ホリム]";
		mes "おかげで、今はひとりぼっちです。";
		mes "ラヘルでの原住民に対する扱いは";
		mes "改善の兆しも見られますが";
		mes "何かあっても誰にも相談できません。";
		mes "正直、ツライです。";
		next;
		mes "[ホリム]";
		mes "だから、今さらですけど";
		mes "ラヘルを出て、みんなと一緒に";
		mes "暮らしたいんです。";
		next;
		mes "[ホリム]";
		mes "危険な道であるのも承知しておりますが";
		mes "冒険者さまに案内してもらえば";
		mes "あるいは……。";
		next;
		menu "お手伝いしましょう",-;
		mes "[ホリム]";
		mes "ありがとうございます！";
		next;
		cloakoffnpc "支配人#ep18";
		unittalk getnpcid(0,"支配人#ep18"),"支配人  :  手が空いてるスタッフは、ちょっと来てくれ！";
		mes "[ホリム]";
		mes "すみません。";
		mes "今は仕事中なので";
		mes "もう行かないと。";
		next;
		cloakonnpc "支配人#ep18";
		mes "[ホリム]";
		mes "ラヘルの西門の外でお会いしましょう。";
		mes "よろしくお願いしますね。";
		delquest 8718;
		setquest 8698;
		close2;
		cloakonnpc "従業員#ep1800";
		end;
	}
	if(checkquest(8698)) {
		// 未確認
	}
	end;
OnQuestInfo:
	if(checkquest(8718))
		showevent 0, 3, "従業員#ep1800";
	else
		showevent 9999,0,"従業員#ep1800";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_in01.gat,388,63,5	script	従業員#ep1801	85,{/* 16111 */
	mes "[従業員]";
	mes "はぁ～。";
	mes "人をこんなに働かせてどうすんだよ？";
	next;
	mes "[従業員]";
	mes "おっとと、いらっしゃいませ！";
	mes "フレイヤ様の祝福が";
	mes "共にあらんことを～！";
	close;
}
ra_in01.gat,381,63,5	script	支配人#ep18	928,{/* 16112 (cloaking)*/
	// 未確認
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,350,236,0	script	#ep18w02	139,14,14,{/* 16113 */
	if(checkquest(8698))
		cloakoffnpc "ホリム#ep1810";
	end;
}
ra_fild11.gat,350,236,3	script	ホリム#ep1810	930,{/* 16114 (cloaking)*/
	if(checkquest(8698)) {
		mes "[ホリム]";
		mes "……ああ、冒険者さま。";
		mes "私はラヘルから";
		mes "離れたことがなくて……";
		mes "いざ、離れるとなると心細いです。";
		next;
		mes "[ホリム]";
		mes "でも、ラヘルのどこにいても";
		mes "安らぐことができないのなら";
		mes "やはり去るべきなのでしょう。";
		next;
		mes "[ホリム]";
		mes "……話が長くなりましたね。";
		mes "ここから、どの方向に向かうのですか？";
		mes "冒険者様の向かう先に";
		mes "私も移動します。";
		delquest 8698;
		setquest 8699;
		cloakonnpc "ホリム#ep1810";
		next;
		mes "^0000FF‐灰色狼の村へ向かおう‐^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8698))
		showevent 0, 3, "ホリム#ep1810";
	else
		showevent 9999,0,"ホリム#ep1810";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_fild10.gat,375,293,0	script	#horim02	139,14,14,{/* 16115 */
	if(checkquest(8699))
		cloakoffnpc "ホリム#ep1811";
	end;
}
ra_fild10.gat,375,293,5	script	ホリム#ep1811	930,{/* 16116 (cloaking)*/
	if(checkquest(8699)) {
		mes "[ホリム]";
		mes "振り向いてみればラヘルが…";
		mes "あの城壁がとても遠くに見えました。";
		mes "…………";
		mes "まだ道のりの半分も来ていないですか？";
		next;
		mes "[ホリム]";
		mes "家族たちは元気でしょうか？";
		mes "友達みんな、元気でしょうか？";
		mes "私は無事に辿りつけるでしょうか？";
		mes "いろいろ考えてしまいます。";
		delquest 8699;
		setquest 8700;
		cloakonnpc "ホリム#ep1811";
		next;
		mes "^0000FF‐灰色狼の村へ向かおう‐^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8699))
		showevent 0, 3, "ホリム#ep1811";
	else
		showevent 9999,0,"ホリム#ep1811";
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,285,170,0	script	#ep18w04	139,14,14,{/* 16117 */
	if(checkquest(8700))
		cloakoffnpc "ホリム#ep1812";
	end;
}
oz_dun01.gat,285,170,5	script	ホリム#ep1812	930,{/* 16118 (cloaking)*/
	if(checkquest(8700)) {
		mes "[ホリム]";
		mes "こんな景色は、初めて見ます。";
		mes "この道は……良いですね。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "こんな道が？";
		next;
		mes "[ホリム]";
		mes "冒険者さまは見慣れておられるかも";
		mes "しれませんが";
		mes "私にとってはなんだか";
		mes "懐かしい気持ちになるのです。";
		next;
		mes "[ホリム]";
		mes "……村での暮らしは";
		mes "楽ではないと聞いていますが";
		mes "大丈夫です。";
		mes "力仕事には自信があります。";
		mes "さあ、行きましょう。";
		delquest 8700;
		setquest 8701;
		cloakonnpc "ホリム#ep1812";
		next;
		mes "^0000FF‐灰色狼の村へ向かおう‐^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8700))
		showevent 0, 3, "ホリム#ep1812";
	else
		showevent 9999,0,"ホリム#ep1812";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,272,342,0	script	#ep18w04	139,{/* 16119 */
	if(checkquest(8701))
		cloakoffnpc "ホリム#ep1813";
	end;
}
gw_fild01.gat,272,342,5	script	ホリム#ep1813	930,{/* 16120 (cloaking)*/
	if(checkquest(8701)) {
		mes "[ホリム]";
		mes "……匂いが変わりましたね。";
		mes "トール火山の火山灰とは違う匂い。";
		next;
		mes "[ホリム]";
		mes "私の同胞も";
		mes "この匂いを纏っていました。";
		mes "だから、冒険者さまのことも";
		mes "気付けたんです。";
		next;
		mes "[ホリム]";
		mes "私も、この匂いがするように";
		mes "なるのでしょうか？";
		next;
		mes "[ホリム]";
		mes "……行きましょう。";
		delquest 8701;
		setquest 8702;
		cloakonnpc "ホリム#ep1813";
		next;
		mes "^0000FF‐灰色狼の村へ向かおう‐^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8701))
		showevent 0, 3, "ホリム#ep1813";
	else
		showevent 9999,0,"ホリム#ep1813";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,36,99,0	script	#horimF	139,14,14,{/* 16121 */
	if(checkquest(8702))
		cloakoffnpc "ホリム#ep1814";
	end;
}
gw_fild01.gat,36,99,5	script	ホリム#ep1814	930,{/* 16122 (cloaking)*/
	if(checkquest(8702)) {
		mes "[ホリム]";
		mes "ちょっと休んで行きましょう。";
		mes "ちょうど座れそうな";
		mes "丸太もありますし。";
		next;
		menu "まだ迷ってますか？",-;
		mes "[ホリム]";
		mes "そうですね。";
		mes "もう、私はこんなにも";
		mes "ラヘルから離れてしまったのに。";
		next;
		mes "[ホリム]";
		mes "……。";
		next;
		mes "[ホリム]";
		mes "冒険者さまには";
		mes "帰る場所はありますか？";
		mes "ラヘルにいたころの私には";
		mes "ありませんでした。";
		next;
		mes "[ホリム]";
		mes "家が無いとか";
		mes "そういう話ではありません。";
		mes "家族と一緒に食事をして";
		mes "笑いあって、おやすみと挨拶して";
		mes "眠りにつく……";
		mes "そんな場所です。";
		next;
		mes "[ホリム]";
		mes "……行きましょうか。";
		mes "それで、結局どこまで行けば";
		mes "良いんですか？";
		mes "そろそろ教えてくれても……。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ここが入口です。";
		next;
		mes "[ホリム]";
		mes "……え？";
		next;
		mes "[門番]";
		mes "通って良いよ。";
		mes "冒険者さんが連れて来たなら";
		mes "大丈夫だろうって";
		mes "スアドも言ってたからね。";
		close2;
		delquest 8702;
		setquest 8703;
		warp "wolfvill.gat", 270, 26;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(8702))
		showevent 0, 3, "ホリム#ep1814";
	else
		showevent 9999,0,"ホリム#ep1814";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,266,26,0	script	#horimG	139,14,14,{/* 16123 */
	if(checkquest(8703))
		cloakoffnpc "ホリム#ep1815";
	end;
}
wolfvill.gat,266,26,5	script	ホリム#ep1815	930,{/* 16124 (cloaking)*/
	if(checkquest(8703)) {
		mes "["+strcharinfo(0)+"]";
		mes "到着しました。";
		mes "ここが灰色狼の村です。";
		next;
		mes "[ホリム]";
		mes "…………ここが。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "失望しました？";
		next;
		mes "[ホリム]";
		mes "いいえ。";
		mes "……家族を探してみます。";
		mes "それに友人たちも";
		mes "ここにいるはずですから。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "きっとみんな";
		mes "歓迎してくれますよ。";
		next;
		mes "[ホリム]";
		mes "あ……";
		mes "ふふっ、ありがとう……";
		mes "本当に、ありがとうございます！";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		delquest 8703;
		setquest 202325;
		getitem 1000405,10;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		setquest 130123;
		compquest 130123;
		mes "[ホリム]";
		mes "冒険者さまの旅路に";
		mes "祝福があらんことを……。";
		close2;
		cloakonnpc "ホリム#ep1815";
		end;
	}
	if(checkquest(202325)) {
		//未調査
	}
	end;
OnQuestInfo:
	if(checkquest(8703))
		showevent 0, 3, "ホリム#ep1815";
	else
		showevent 9999,0,"ホリム#ep1815";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,182,82,5	script	アルベル#ep18	931,{/* 16125 */
	if(EP18_1QUE < 36) {
		mes "[アルベル]";
		mes "…………。";
		next;
		mes "^ff0000‐クエスト「手遅れな移住」は^000000";
		mes "^ff0000　下記の条件を満たすと進行可能です。^000000";
		mes "^ff0000　・4次職、拡張4次職^000000";
		mes "^ff0000　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(202325)) {
		mes "[アルベル]";
		mes "あいつに会えたかって？";
		mes "ああ、そうだな。";
		mes "別れの際に言えなかったことも";
		mes "全部言えたよ。";
		mes "おかげでもやもやが全部吹き飛んだ。";
		next;
		mes "[アルベル]";
		mes "灰色の森が輝いて見えるぜ……";
		mes "はっ、そんな訳ないのにな。";
		mes "冒険者……あんたのお陰だ。";
		mes "ありがとうよ。";
		close;
	}
	if(checkquest(8718)) {
		mes "[アルベル]";
		mes "俺にいちいち報告しなくていい。";
		mes "ただホリムが元気にやってるか";
		mes "確認してくれればいい。";
		close;
	}
	if(checkquest(8698) || checkquest(8699) || checkquest(8700) || checkquest(8701) || checkquest(8702) || checkquest(8703)){
		mes "[アルベル]";
		mes "ホリムがここに来るって？";
		mes "そ、そうか……";
		mes "よかった、よかったよ……。";
		close;
	}
	mes "[アルベル]";
	mes "冒険者さん。";
	mes "ラヘルに戻るんだったら";
	mes "ひとつ俺の頼みを聞いてくれないか？";
	next;
	mes "[アルベル]";
	mes "ラヘルのホテルで働いている";
	mes "「ホリム」ってヤツの様子を";
	mes "見て来て欲しいんだ。";
	next;
	mes "[アルベル]";
	mes "ホリムは、俺の幼馴染なんだ。";
	mes "お互いラヘルに住んでたんだが";
	mes "俺の家族とホリムの家族が";
	mes "ここに来る時に";
	mes "アイツだけがラヘルに残ったんだ。";
	next;
	mes "[アルベル]";
	mes "ラヘルは大都市だが";
	mes "アイツはひとりぼっちかもしれない。";
	mes "そう思うと、気になってな。";
	next;
	if(select("いいですよ","今は時間がない") == 2) {
		mes "[アルベル]";
		mes "……そうか。";
		mes "いや、引き留めて悪かったな。";
		mes "気にしないでくれ。";
		close;
	}
	mes "[アルベル]";
	mes "恩に着る。";
	mes "ただホリムが元気にやってるか";
	mes "確認してくれればいい。";
	mes "俺にも報告しなくていいからな。";
	delquest 130103;
	setquest 8718;
	close;
OnQuestInfo:
	if(checkquest(130103))
		showevent 0, 3, "アルベル#ep18";
	else
		showevent 9999,0,"アルベル#ep18";
	end;
}

wolfvill.gat,117,119,5	script	スカニア#wms01	10398,5,5,{/* 16126 */
	if(EP18_1QUE < 36) {
		mes "[スカニア]";
		mes "この村の人ではないね。";
		mes "ここは危険だから帰った方が良いよ？";
		next;
		mes "^ff0000‐クエスト「この世に悪い獣はいない」は^000000";
		mes "^ff0000　下記の条件を満たすと進行可能です。^000000";
		mes "^ff0000　・4次職、拡張4次職^000000";
		mes "^ff0000　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(17510) || checkquest(17511)) {
		mes "[スカニア]";
		mes "アイシャのところに";
		mes "行くんじゃなかったの？";
		close;
	}
	if(checkquest(17512)) {
		mes "[スカニア]";
		mes "ワンワン、今日の散歩はここまでだ。";
		next;
		mes "[ワンワン]";
		mes "メエェェェェー！";
		next;
		mes "[スカニア]";
		mes "村の外には行けないんだよ。";
		mes "あんな危険な場所に";
		mes "独りで行かせるなんてできない。";
		next;
		setnpcdisplay "メエメエ#wms01",21324;
		cloakoffnpc "アイシャ#wms01";
		cloakoffnpc "メエメエ#wms01";
		cloakoffnpc "マラム#wms01";
		mes "[アイシャ]";
		mes "スカニア！";
		next;
		mes "[スカニア]";
		mes "アイシャ？";
		mes "何の用だ？";
		mes "あの狼は群れに返したのかよ？";
		next;
		unittalk getnpcid(0,"メエメエ#wms01"),"わん！！";
		mes "[スカニア]";
		mes "うっそだろ……";
		mes "お、狼を羊の前に連れてくるなんて";
		mes "正気の沙汰じゃない！";
		mes "冒険者！　お前、裏切ったのか！";
		next;
		mes "[アイシャ]";
		mes "がははは、そうだ！";
		mes "お前のその絶望する顔が";
		mes "見たかったのだ！";
		mes "冒険者は、すでに私の味方だ！";
		next;
		mes "[スカニア]";
		mes "氷の洞窟のように冷たい奴め！";
		next;
		mes "[アイシャ]";
		mes "冷血なのはそっちでしょ！";
		mes "この親を亡くした小さいメエメエを";
		mes "自然に返せるわけないじゃない！";
		next;
		setnpcdisplay "メエメエ#wms01",21324;
		mes "[スカニア]";
		mes "親を失った……？";
		mes "え、そうなの？";
		next;
		mes "[アイシャ]";
		mes "100回は説明したじゃない！";
		mes "自分の都合のいいことだけしか";
		mes "覚えてないんだから！";
		next;
		mes "[スカニア]";
		mes "でも、その狼が大きくなれば";
		mes "羊たちが……。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "説明が必要みたいですね。";
		next;
		mes "^0000FF‐マラムは狼を訓練して";
		mes "　羊たちと一緒に育てることで";
		mes "　羊たちを襲うことはなくなり";
		mes "　むしろ守ってくれるだろうと";
		mes "　スカニアに説明した‐^000000";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[アイシャ]";
		mes "証拠を見せてあげる。";
		mes "メエメエ！　お座り！　お手！";
		next;
		emotion 12,"アイシャ#wms01";
		unittalk getnpcid(0,"メエメエ#wms01"),"わん！！";
		emotion 11,"メエメエ#wms01";
		unittalk getnpcid(0,"アイシャ#wms01"),"よくできました！　うちのメエメエは超賢い！";
		mes "[スカニア]";
		mes "……本当だ。";
		mes "しかし、誰がどうやって訓練するのさ？";
		mes "アイシャは、そんな根気はないだろ？";
		next;
		mes "[アイシャ]";
		mes "はあ？";
		mes "お前、後で泣かすぞ……？";
		next;
		mes "[アイシャ]";
		mes "……おっほん！";
		mes "スカニアはワンワンを";
		mes "散歩してくれる人を探してたよね？";
		mes "危険な村の外まで散歩してくれる人を。";
		next;
		mes "[アイシャ]";
		mes "この冒険者なら";
		mes "メエメエとワンワンを連れて";
		mes "村の外までお散歩してくれるよ！";
		mes "どやっ！";
		next;
		mes "[スカニア]";
		mes "マジかよ！　やったぜ！";
		mes "羊飼いの代行業務ってことか！";
		mes "ぜひやってくれよ！";
		next;
		mes "[アイシャ]";
		mes "めっちゃ食いつくな……";
		mes "とにかく、メエメエはこれから";
		mes "羊を守る番狼として村に置くって";
		mes "みんなに説明してこなくちゃ。";
		next;
		mes "[アイシャ]";
		mes "マラムもついて来てよね。";
		mes "口だけは達者でしょ？";
		mes "大人たちを説得してもらわないと！";
		next;
		unittalk getnpcid(0,"メエメエ#wms01"),"わん！";
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "ははは……";
		mes "では、私はアイシャと行きますから";
		mes "冒険者様は羊飼い代行業を";
		mes "お願いしますね。";
		next;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "アイシャ#wms01";
		cloakonnpc "メエメエ#wms01";
		cloakonnpc "マラム#wms01";
		mes "[スカニア]";
		mes "これからよろしくな！";
		mes "期待してるぜ！";
		delquest 17512;
		setquest 17513;
		close;
	}
	if(checkquest(17513)) {
		mes "[スカニア]";
		mes "冒険者様は羊飼い代行業を頼む。";
		mes "灰色狼の森でワンワンたちの";
		mes "散歩のサポートをしてやってくれ。";
		next;
		mes "[スカニア]";
		mes "まずは、灰色狼の森にある、";
		mes "ワンワンのお気に入りの「草」が";
		mes "あるところに向かってくれ。";
		next;
		mes "[スカニア]";
		mes "その後は、ワンワンが";
		mes "草を食べるのを邪魔してくる";
		mes "「アッシュリン」も「15」体";
		mes "倒してほしい。";
		mes "じゃあ、よろしく！";
		close;
	}
	if(checkquest(17514)) {//未調査
	}
	if(checkquest(17515)) {
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		delquest 17515;
		setquest 17516;
		getitem 1000405,3;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		setquest 130130;
		compquest 130130;
		hideoffnpc "ワンワン#wms01";
		mes "[スカニア]";
		mes "お疲れさま！";
		mes "ワンワンも満足そうだな！";
		mes "あんた、羊飼いの才能あるよ。";
		close;
	}
	if(checkquest(17516)) {
		mes "[スカニア]";
		mes "今日はもう散歩の必要はないよ。";
		mes "食べて物を消化する時間も必要だし";
		mes "また明日になったら来てくれよ！";
		close;
	}
	mes "[スカニア]";
	mes "ワンワン！";
	mes "お前もそろそろ外の言葉を";
	mes "勉強しなくちゃいけない。";
	mes "息を吸い込み、吐き出す！";
	mes "そうだ！　お前は天才だな！";
	unittalk getnpcid(0,"ワンワン#wms01"),"メェ？";
	next;
	cloakoffnpc "マラム#wms01";
	cutin "ep18_maram_02.png", 2;
	mes "[マラム]";
	mes "こんにちは、スカニア！";
	mes "ワンワンも元気かい？";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[スカニア]";
	mes "マラム！";
	mes "いつ来たんだ？";
	mes "あれ？　そっちは新しい村の住人？";
	next;
	mes "[スカニア]";
	mes "いや、よそ者だな？";
	mes "まさか、スパイだったりして……";
	mes "僕たちの村のことを";
	mes "移住の民にバラすつもりじゃない？";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "この人は、そんなことはしないよ。";
	mes "村に荷物を持ってくるのも";
	mes "手伝ってもらったんだから。";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[スカニア]";
	mes "やれやれ、マラムは相変わらずだな。";
	mes "アイシャの奴は、狼を拾って来るし";
	mes "今度は、マラムが人間を拾って来た。";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[マラム]";
	mes "ごめんなさい、この子は";
	mes "口が悪くて……";
	mes "ん？";
	mes "狼を拾って来たって言った？";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[スカニア]";
	mes "そうだよ、アイシャが灰色狼の子を";
	mes "拾って来たんだ。";
	mes "俺は捨てて来いって言ったのに";
	mes "あいつは全然聞く耳を持たないんだ。";
	next;
	mes "[スカニア]";
	mes "今は小さいけど";
	mes "そのうち大きくなって";
	mes "村の羊や鶏を襲うに決まってる！";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "ふぅ～ん、それはマズイなぁ。";
	mes "この村で育てられるのは";
	mes "羊と鶏ぐらいなものですから";
	mes "それが襲われたりしたら";
	mes "一大事ってことです。";
	next;
	mes "[マラム]";
	mes "わかったよ、スカニア。";
	mes "私と冒険者様とで";
	mes "アイシャを説得してみよう。";
	mes "狼の子を村で飼うことは";
	mes "できないってね。";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[スカニア]";
	mes "アイシャが素直に言う事を";
	mes "聞くとは思えないけどね。";
	mes "まあ、頑張ってよね。";
	delquest 130110;
	setquest 17510;
	close2;
	cloakonnpc "マラム#wms01";
	end;
OnTouch:
	if(!checkquest(17510))
		unittalk "ワンワン、散歩したいだろうけど、少しだけ我慢してくれ";
	end;
OnQuestInfo:
	if(checkquest(130110) || checkquest(17512))
		showevent 0, 3, "スカニア#wms01";
	else
		showevent 9999,0,"スカニア#wms01";
	end;
}
wolfvill.gat,120,121,3	script	マラム#wms01	10376,{/* 16127 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,121,119,3	script	ワンワン#wms01	21323,{/* 16128 */
	emotion 2,"ワンワン#wms01";
	unittalk getnpcid(0,"ワンワン#wms01"),"メエェェェェーー！";
	end;
}
wolfvill.gat,120,117,1	script	アイシャ#wms01	919,{/* 16129 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,119,117,1	script	メエメエ#wms01	21324,{/* 16130 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,124,116,3	script	ヤギヤギ#wms01	890,{/* 16131 */
	unittalk "もぐ…";
	end;
}
wolfvill.gat,121,113,1	script	デカコッコ#wms01	428,{/* 16132 */
	unittalk "コケコッコー";
	end;
}
wolfvill.gat,117,113,7	script	チビコッコ#wms01	10285,{/* 16133 */
	unittalk "コッココココ～";
	end;
}
wolfvill.gat,123,110,5	script	オキャクサマ#wms01	10285,{/* 16134 */
	unittalk "……コ？";
	end;
}
wolfvill.gat,125,111,3	script	カワイイ#wms01	10285,{/* 16135 */
	unittalk "コッ！！コッコ！！";
	end;
}
wolfvill.gat,99,178,5	script	アイシャ#wms02	919,{/* 16136 */
	if(checkquest(17510)) {
		mes "[アイシャ]";
		mes "メエメエは、お姉さんと一緒に生きよう。";
		mes "君を害する人がいれば";
		mes "お姉さんがそいつを";
		mes "オズの迷路に埋めてあげるからね～。";
		next;
		mes "[メエメエ]";
		mes "グルルーわん！";
		next;
		mes "[アイシャ]";
		mes "ははぁ？";
		mes "独りの時間が欲しいのね？";
		mes "実は私もそう。";
		mes "どうせこの世はみんな独りだよ。";
		mes "私たち、上手くやれそうじゃない？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "どうやら、本当に狼の子を";
		mes "拾って来てしまったみたいだね。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[アイシャ]";
		mes "怪しい奴！　メエメエに近づくな！";
		mes "怖がってるじゃない！";
		mes "可愛そうに、それで警戒してたのね！";
		next;
		mes "[アイシャ]";
		mes "いますぐ武器を捨てて";
		mes "両手をあげろ！";
		mes "後ろに振り向いて";
		mes "そのまま去れ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "アイシャ、話を聞いて欲しいんだ。";
		mes "ほら、キャンディあげるから。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[アイシャ]";
		mes "マラムがそう言うんじゃ";
		mes "仕方ない。";
		mes "話だけは聞いてやる。";
		next;
		mes "^0000FF‐マラムは子狼のことを";
		mes "　スカニアから聞いて";
		mes "　ここに来たことを伝えた‐^000000";
		next;
		mes "[アイシャ]";
		mes "やっぱり、そうだと思った！";
		mes "スカニアがいらないことを";
		mes "貴方達に吹き込んだんだ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "もう一つキャンディあげるから";
		mes "落ち着いて……";
		mes "群れからはぐれた";
		mes "子供の狼を村には置いていけないよ。";
		mes "親が探しにくるかもしれないし。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[アイシャ]";
		mes "群れからはぐれたんじゃない！";
		mes "死んだ親狼の側で";
		mes "衰弱していたのを連れてきたんだから。";
		next;
		mes "[アイシャ]";
		mes "メエメエを自然に返しても";
		mes "ひとりじゃ生きていけないよ！";
		mes "それでも捨てて来いって言うの？";
		mes "人でなし！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "そういう事情があったのか。";
		mes "でも、どうしましょうね。";
		next;
		menu "訓練するのはどうでしょう？",-;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "なるほど。";
		mes "小さい頃からきちんと訓練すれば";
		mes "村の家畜を襲うことはないし";
		mes "むしろ、モンスターから家畜を";
		mes "守ってくれるかもしれないですね。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[アイシャ]";
		mes "わかった！";
		mes "メエメエは、褒めると伸びる子だから";
		mes "褒めた時にご褒美としてあげる";
		mes "「にく」を「1」つ用意してよね！";
		delquest 17510;
		setquest 17511;
		close;
	}
	if(checkquest(17511)) {
		mes "[アイシャ]";
		mes "メエメエを訓練しなくちゃ！";
		mes "メエメエは、褒めると伸びる子だから";
		mes "褒めた時にご褒美としてあげる";
		mes "「にく」を「1」つ用意してよね！";
		close;
	}
	if(checkquest(17512)) {
		mes "[アイシャ]";
		mes "スカニアに、私のメエメエが";
		mes "いかにできる子なのか";
		mes "見せてやらねば。";
		close;
	}
	mes "[アイシャ]";
	mes "メエメエのお尻から出てきた";
	mes "アレを見る？";
	mes "マジで可愛いんだって！";
	mes "あ、触っちゃダメだからね！";
	close;
OnQuestInfo:
	if(checkquest(17510))
		showevent 0, 3, "スカニア#wms01";
	else
		showevent 9999,0,"スカニア#wms01";
	end;
}
wolfvill.gat,100,177,1	script	メエメエ#wms02	21324,{/* 16137 */
	if(checkquest(17511)) {
		if(countitem(517) < 1) {
			mes "[アイシャ]";
			mes "メエメエは、褒めると伸びる子だから";
			mes "褒めた時にご褒美としてあげる";
			mes "「にく」を「1」つ用意してよね！";
			close;
		}
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "よし、私がばっちり";
		mes "訓練してみせましょう。";
		mes "見ていてください。";
		mes "……こんにちは、メエメエ。";
		mes "会えて嬉しいなぁ。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[メエメエ]";
		mes "……プイ！";
		mes "　";
		mes "^0000FF‐メエメエはマラムを無視した‐^000000";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "そんな……";
		mes "私では相手にされないようです。";
		mes "ここは冒険者様にお願いします。";
		next;
		cutin "ep18_maram_01.png", 255;
		menu "メエメエの目をじっと見つめる",-;
		emotion 1,"メエメエ#wms02";
		mes "[メエメエ]";
		mes "わん？";
		next;
		mes "[アイシャ]";
		mes "あっ！";
		mes "反応した！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "見てごらん、お肉だよ。";
		mes "メエメエはお肉好き？";
		mes "焼いたもの？　生もの？　蒸したもの？";
		mes "言う事を聞いてくれたら";
		mes "お肉をあげるからね～。";
		next;
		emotion 3,"メエメエ#wms02";
		mes "[メエメエ]";
		mes "わん！　わん！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "やってみようか。";
		mes "メエメエ、お座り！";
		mes "待て！";
		mes "よくできました。さぁ、お肉だよ。";
		next;
		emotion 3,"メエメエ#wms02";
		mes "[アイシャ]";
		mes "あら～、あらあら！";
		mes "今の見た!?";
		mes "うちの子ってマジ天才じゃない!!";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[マラム]";
		mes "さすが冒険者様！";
		mes "なんという手際の良さ！";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[アイシャ]";
		mes "私もやる！";
		mes "メエメエ、お座り！";
		mes "お手！";
		mes "うわ～マジ凄い！";
		mes "うちの子、賢すぎる!!";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "しばらく訓練は必要でしょうが";
		mes "これなら狼を村に置くことも";
		mes "許してもらえるでしょう。";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[アイシャ]";
		mes "よし！";
		mes "まずはスカニアに見せてやる。";
		mes "うちの子がいかに賢いか";
		mes "あいつにわからせてやるんだ！";
		delitem 517,1;
		delquest 17511;
		setquest 17512;
		close;
	}
	if(checkquest(17512)) {
		mes "[アイシャ]";
		mes "スカニアのところに行こう！";
		mes "うちの子がいかに賢いか";
		mes "あいつにわからせてやるんだ！";
		close;
	}
	if(checkquest(17513)) {//未調査
	}
	if(checkquest(17514)) {//未調査
	}
	if(checkquest(17515)) {
		emotion 1;
		mes "[メエメエ]";
		mes "わん？";
		close;
	}
	emotion 1;
	unittalk "わん？";
	mes "[アイシャ]";
	mes "うちのメエメエに触らないで！";
	mes "メエメエが嫌がってるじゃん！";
	close;
OnQuestInfo:
	if(checkquest(17511) && countitem(517) < 1)
		showevent 0, 2, "メエメエ#wms02";
	else if(checkquest(17511))
		showevent 0, 3, "メエメエ#wms02";
	else
		showevent 9999,0,"メエメエ#wms02";
	end;
}
gw_fild01.gat,26,101,0	script	#wms01	139,3,3,{/* 16138 */
	if(checkquest(17513)) {
		cloakoffnpc "ワンワン#wms02";
		cloakoffnpc "メエメエ#wms03";
	}
	end;
}
gw_fild01.gat,138,106,5	script	草#wms01	10430,{/* 16139 */
	if(checkquest(17513)) {
		delquest 17513;
		setquest 17514;
		setnpcdisplay "ワンワン#wms02",21323;
		setnpcdisplay "メエメエ#wms03",21324;
		cloakoffnpc "ワンワン#wms02";
		cloakoffnpc "メエメエ#wms03";
		unittalk getcharid(3),strcharinfo(0)+" : もう来てたの？　ここがお気に入りなのかな？　他に行きたい場所はある？",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"ワンワン#wms02"),"メェェェェ！";
		if(!sleep2(1000)) end;
		cloakonnpc "ワンワン#wms02";
		cloakonnpc "メエメエ#wms03";
		setnpcdisplay "ワンワン#wms02",844;
		setnpcdisplay "メエメエ#wms03",844;
		unittalk getcharid(3),strcharinfo(0)+" : メエメエ、ワンワンのことをよろしくね！",1;
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ワンワンの誘導はメエメエに任せて、ワンワンが落ち着いて草を食べられるよう「アッシュリン」を15体くらい討伐して、もう一度ここに戻ってこよう。",1;
		end;
	}
	if(checkquest(17514)) {
		if(!(checkquest(17514)&4)) {
			unittalk getcharid(3),strcharinfo(0)+" : ワンワンが落ち着いて草を食べられるよう「アッシュリン」を15体討伐して、もう一度ここに戻ってこよう。",1;
			end;
		}
		delquest 17514;
		setquest 17515;
		setnpcdisplay "ワンワン#wms02",21323;
		setnpcdisplay "メエメエ#wms03",21324;
		cloakoffnpc "ワンワン#wms02";
		cloakoffnpc "メエメエ#wms03";
		cloakonnpc "ワンワン#wms03";
		cloakonnpc "メエメエ#wms04";
		unittalk getcharid(3),strcharinfo(0)+" : お腹いっぱいになった？",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"ワンワン#wms02"),"メェェェェ！";
		if(!sleep2(1000)) end;
		unittalk getcharid(3),""+strcharinfo(0)+" : メエメエはワンワンを守ってくれたんだよね？",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"メエメエ#wms03"),"わん！！！";
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : よくできました。そろそろお家に帰ろうか。",1;
		cloakonnpc "ワンワン#wms02";
		cloakonnpc "メエメエ#wms03";
		cloakonnpc "ワンワン#wms03";
		cloakonnpc "メエメエ#wms04";
		setnpcdisplay "ワンワン#wms02",844;
		setnpcdisplay "メエメエ#wms03",844;
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : 灰色狼の村にいる「スカニア」の所に戻ろう。",1;
		end;
	}
	if(checkquest(17515)) {
		cloakonnpc "ワンワン#wms02";
		cloakonnpc "メエメエ#wms03";
		cloakonnpc "ワンワン#wms03";
		cloakonnpc "メエメエ#wms04";
		setnpcdisplay "ワンワン#wms02",844;
		setnpcdisplay "メエメエ#wms03",844;
		unittalk getcharid(3),strcharinfo(0)+" : 灰色狼の村にいる「スカニア」の所に戻ろう。",1;
	}
	end;
OnQuestInfo:
	if(checkquest(17514) && !(checkquest(17514)&4))
		showevent 0, 2, "草#wms01";
	else if(checkquest(17513) || checkquest(17514))
		showevent 0, 3, "草#wms01";
	else
		showevent 9999,0,"草#wms01";
	end;
}
gw_fild01.gat,140,103,3	script	ワンワン#wms02	844,{/* 16140 (cloaking)*/
	unittalk "メェェェェ？";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,136,103,7	script	メエメエ#wms03	844,{/* 16141 (cloaking)*/
	unittalk "わん！！";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,160,104,3	script	ワンワン#wms03	844,{/* 16142 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,159,104,7	script	メエメエ#wms04	844,{/* 16143 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,160,104,0	script	美味しい草#wms11	139,{/* 16144 */}
wolfvill.gat,197,170,5	script	ララマ#ep18	943,{/* 16145 */
	mes "^0000FF‐夢中になって刃物を研いでいる。";
	mes "　話しかけても返事が無かった‐^000000";
	close;
}
wolfvill.gat,202,166,3	script	エルイン#ep18	919,{/* 16146 */
	if(EP18_1QUE < 36) {
		mes "[エルイン]";
		mes "……よそ者が";
		mes "この森でモンスターでない";
		mes "普通の動物を狩るのは";
		mes "禁じられているの。";
		mes "ウサギ1羽でも獲っちゃダメ。";
		next;
		mes "^ff0000‐クエスト「日ごとの糧を今日も」は^000000";
		mes "^ff0000　下記の条件を満たすと進行可能です。^000000";
		mes "^ff0000　・BaseLv210以上^000000";
		mes "^ff0000　・4次職、拡張4次職^000000";
		mes "^ff0000　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(8688)) {
		if( checkquest(130151) || checkquest(130152) ||
			checkquest(130153) || checkquest(130154) || checkquest(130155)
		) {
			mes "[エルイン]";
			mes "灰色の森の5か所に";
			mes "罠を仕掛けてあるから";
			mes "獲物が掛かっていたら5個ほど";
			mes "回収してきて。";
			next;
			mes "[エルイン]";
			mes "掛かってなくても";
			mes "罠をそのままにしておけば";
			mes "しばらくしたら掛かるかも。";
			close;
		}
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		if(countitem(1000412)) delitem 1000412,countitem(1000412);
		if(countitem(1000413)) delitem 1000413,countitem(1000413);
		setquest 8689;
		setquest 130151;
		delquest 130151;
		setquest 130152;
		delquest 130152;
		setquest 130153;
		delquest 130153;
		setquest 130154;
		delquest 130154;
		setquest 130155;
		delquest 130155;
		delquest 8688;
		getitem 1000405,3;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		setquest 130132;
		compquest 130132;
		if(checkquest(130132)) {
			set EP18_1QUE,37;
			delquest 11718;
			setquest 18082;
		}
		mes "[エルイン]";
		mes "…よし、お疲れ様。";
		mes "もし明日以降も暇してるなら";
		mes "またお願いしてもいい？";
		next;
		if(select("いいですよ","明日は忙しいかも") == 1) {
			mes "[エルイン]";
			mes "私は、立ってる者は親でも使う";
			mes "主義だからね。助かるよ。";
			mes "ありがとう。";
			close;
		}
	}
	if(checkquest(8689)) {
		mes "[エルイン]";
		mes "今日はもう帰って休んで。";
		mes "仕事は明日また";
		mes "お願いするから。";
		close;
	}
	mes "[エルイン]";
	mes "……外から冒険者が来たと";
	mes "聞いてるけど、貴方がそうなの？";
	mes "村をうろついてるみたいだけど";
	mes "仕事を探してたりする？";
	next;
	if(select("はい","いいえ") == 2) {
		mes "[エルイン]";
		mes "やることがないなら邪魔しないで。";
		mes "向こうの焚火でも見ていたら？";
		close;
	}
	mes "[エルイン]";
	mes "私はララマと、その家族と共に";
	mes "家畜や野生動物の見張りを";
	mes "担当しているの。";
	mes "刃物なんかの道具の整備も";
	mes "私の仕事よ。";
	next;
	mes "[エルイン]";
	mes "貴方にお願いできそうな仕事は";
	mes "森に設置した罠の確認かな？";
	mes "できそう？";
	next;
	menu "それぐらい造作もないことです。",-;
	mes "[エルイン]";
	mes "灰色の森の5か所に";
	mes "罠を仕掛けてあるから";
	mes "獲物が掛かっていたら5個ほど";
	mes "回収してきて。";
	next;
	mes "[エルイン]";
	mes "掛かってなくても";
	mes "罠をそのままにしておけば";
	mes "しばらくしたら掛かるかも。";
	next;
	mes "[エルイン]";
	mes "じゃあ、お願いするわね。";
	delquest 130112;
	setquest 130151;
	setquest 130152;
	setquest 130153;
	setquest 130154;
	setquest 130155;
	setquest 8688;
	close;
OnQuestInfo:
	if(checkquest(130112) || 
		(checkquest(8688) && !checkquest(130151) && !checkquest(130152) &&
			!checkquest(130153) && !checkquest(130154) && !checkquest(130155))
	)
		showevent 0, 3, "エルイン#ep18";
	else
		showevent 9999,0,"エルイン#ep18";
	end;
}

gw_fild01.gat,24,122,0	script	設置した罠#001	844,{/* 6875 */}
gw_fild01.gat,93,113,0	script	設置した罠#002	844,{/* 6876 */}
gw_fild01.gat,229,205,0	script	設置した罠#003	844,{/* 6877 */}
gw_fild01.gat,153,212,0	script	設置した罠#004	844,{/* 6878 */}
gw_fild01.gat,335,241,0	script	設置した罠#005	844,{/* 6879 */
	if(checkquest(8688)) {
		if(!checkquest(130155)) {
			unittalk getcharid(3),strcharinfo(0)+" : ‐他の罠を探してみよう‐",1;
			end;
		}
		misceffect 101,"設置した罠#005";
		progressbar 1;	//color=0xffff00
		misceffect 18,"設置した罠#005";
		if(checkitemblank() == 0) {
			unittalk getcharid(3),strcharinfo(0)+" : ‐持ち物が多いようだ‐",1;
			end;
		}
		if(rand(100) < 20) {
			unittalk getcharid(3),strcharinfo(0)+" : ‐何も掛かっていなかった‐",1;
			end;
		}
		getitem rand(1000412,1000413),1;
		delquest 130155;
		end;
	}
	//未調査
	end;
OnQuestInfo:
	if(checkquest(130155))
		showevent 0, 3, "設置した罠#005";
	else
		showevent 9999,0,"設置した罠#005";
	end;
}
rachel.gat,103,141,5	script	聖物販売員#ep18	943,{/* 16167 */
	if(checkquest(8691)) {
		mes "[聖物販売員]";
		mes "「浄水用聖物」の販売に参りました！";
		mes "1人1つだけですよ、";
		mes "さぁさぁ～お早めにご購入くださ～い！";
		next;
		menu "浄水用聖物？",-;
		mes "[聖物販売員]";
		mes "ああ～異国の方でしたか～。";
		mes "簡単に説明しますと";
		mes "汚染された水を一気に浄化してくれる";
		mes "聖別された道具のことですよ～。";
		next;
		mes "[聖物販売員]";
		mes "神殿で作ってるものですが～";
		mes "今じゃ水路も整備されてますから";
		mes "昔ほど需要があるわけではないんです。";
		mes "でも、少量だけ作られているんです。";
		next;
		mes "[聖物販売員]";
		mes "ただ、数日内に使う必要があって";
		mes "大量に在庫を置けません。";
		mes "隊商の皆さんなどは";
		mes "飲み水が切れた時の緊急用に";
		mes "買っていかれることがありますよ～。";
		next;
		mes "[聖物販売員]";
		mes "浄化された水は沸かしてから";
		mes "飲んだ方が良いですよ～。";
		mes "沸かさずに飲んだ人から";
		mes "変な臭いがするとクレームが";
		mes "入ったことがあるので～。";
		next;
		mes "[聖物販売員]";
		mes "というわけで、おひとつ";
		mes "550Zenyになります～！";
		next;
		if(select("買う","買わない") == 2) {
			mes "[聖物販売員]";
			mes "貴方には必要なかったようですね。";
			mes "もし必要になったら";
			mes "買いに来てくださいね～。";
			close;
		}
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		if(Zeny < 550) {//未調査
			mes "[聖物販売員]";
			mes "お金が足りませんねぇ？";
			close;
		}
		set Zeny, Zeny -550;
		delquest 8691;
		setquest 8692;
		getitem 1000410,1;
		mes "[聖物販売員]";
		mes "ご購入ありがとうございま～す！";
		mes "フレイヤ様のご加護があらんことを～！";
		close;
	}
	if(checkquest(8692) || checkquest(8696)) {
		mes "[聖物販売員]";
		mes "ご購入ありがとうございま～す！";
		mes "フレイヤ様のご加護があらんことを～！";
		close;
	}
	if(checkquest(8695)){
		mes "[聖物販売員]";
		mes "「浄水用聖物」の販売に参りました！";
		mes "1人1つだけですよ、";
		mes "さぁさぁ～お早めにご購入くださ～い！";
		next;
		switch(select("聖物を買う","説明を聞く","やめる")) {
			case 1:
				mes "[聖物販売員]";
				mes "550Zenyになります～";
				next;
				if(select("買う","買わない") == 2) {
					mes "[聖物販売員]";
					mes "貴方には必要なかったようですね。";
					mes "もし必要になったら";
					mes "買いに来てくださいね～。";
					close;
				}
				if(checkitemblank() == 0) {//未調査
					mes "^009eff【インフォメーション】";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。^000000";
					close2;
					cutin "ra_gwoman.bmp", 255;
					end;
				}
				if(Zeny < 550) {//未調査
					mes "[聖物販売員]";
					mes "お金が足りませんねぇ？";
					close;
				}
				set Zeny, Zeny -550;
				delquest 8695;
				setquest 8696;
				getitem 1000410,1;
				mes "[聖物販売員]";
				mes "ご購入ありがとうございま～す！";
				mes "フレイヤ様のご加護があらんことを～！";
				close;
			case 2:
				mes "[聖物販売員]";
				mes "ああ～異国の方でしたか～。";
				mes "簡単に説明しますと";
				mes "汚染された水を一気に浄化してくれる";
				mes "聖別された道具のことですよ～。";
				next;
				mes "[聖物販売員]";
				mes "神殿で作ってるものですが～";
				mes "今じゃ水路も整備されてますから";
				mes "昔ほど需要があるわけではないんです。";
				mes "でも、少量だけ作られているんです。";
				next;
				mes "[聖物販売員]";
				mes "ただ、数日内に使う必要があって";
				mes "大量に在庫を置けません。";
				mes "隊商の皆さんなどは";
				mes "飲み水が切れた時の緊急用に";
				mes "買っていかれることがありますよ～。";
				next;
				mes "[聖物販売員]";
				mes "浄化された水は沸かしてから";
				mes "飲んだ方が良いですよ～。";
				mes "沸かさずに飲んだ人から";
				mes "変な臭いがするとクレームが";
				mes "入ったことがあるので～。";
				next;
				mes "[聖物販売員]";
				mes "おひとつ";
				mes "550Zenyになります。";
				mes "よろしければ買って行ってくださいね！";
				close;
			case 3:
				mes "[聖物販売員]";
				mes "貴方には必要なかったようですね。";
				mes "もし必要になったら";
				mes "買いに来てくださいね～。";
				close;
		}
	}
	mes "[聖物販売員]";
	mes "「浄水用聖物」の販売に参りました！";
	mes "1人1つだけですよ、";
	mes "さぁさぁ～お早めにご購入くださ～い！";
	close;
OnQuestInfo:
	if(checkquest(8691))
		showevent 0, 3, "聖物販売員#ep18";
	else
		showevent 9999,0,"聖物販売員#ep18";
	end;
}
wolfvill.gat,103,230,3	script	ブダン#ep18	931,{/* 16168 */
	if(EP18_1QUE < 36) {
		mes "[ブダン]";
		mes "よそ者が、村に出入りするとは。";
		mes "好奇心だけで覗くのは";
		mes "遠慮してもらえるか。";
		next;
		mes "^ff0000‐クエスト「綺麗な水調達」は";
		mes "　下記の条件を満たすと進行可能です。";
		mes "　・クエスト「祈りの方向」を途中まで進行‐^000000";
		close;
	}
	if(checkquest(8691) || checkquest(8695)) {
		mes "[ブダン]";
		mes "ラヘルに行けば";
		mes "「聖物販売員」がいるはずだ。";
		mes "適当な理由をつけて「浄水用聖物」を";
		mes "買ってきてくれ。頼んだよ。";
		close;
	}
	if(checkquest(8692) || checkquest(8696)) {
		mes "[ブダン]";
		mes "「浄水用聖物」は";
		mes "無事に購入できたようだな。";
		mes "じゃあ、それを村に設置されている";
		mes "水瓶に入れて";
		mes "綺麗な水を確保してくれ。";
		close;
	}
	if(checkquest(8693)) {
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		delitem 1000411,1;
		delquest 8693;
		setquest 8694;
		getitem 1000405,2;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		setquest 130126;
		compquest 130126;
		mes "[ブダン]";
		mes "ありがとう！　助かったよ。";
		mes "おかげで子供たちに安全な水を";
		mes "飲ませてやることができる。";
		next;
		mes "[ブダン]";
		mes "もし良かったら、明日以降も";
		mes "手伝ってくれると助かる。";
		mes "子供たちの為にも";
		mes "よろしく頼むよ。";
		close;
	}
	if(checkquest(8697)){
		if(checkitemblank() == 0) {//未調査
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		delitem 1000411,1;
		setquest 8695;
		delquest 8695;
		setquest 8696;
		delquest 8696;
		delquest 8697;
		setquest 8694;
		getitem 1000405,2;
		for(set '@i,0; '@i< 20 ; set '@i,'@i+1){
			getexp 225000000,0,0;
			getexp 0,175000000,0;
		}
		mes "[ブダン]";
		mes "ありがとう！　助かったよ。";
		mes "おかげで子供たちに安全な水を";
		mes "飲ませてやることができる。";
		next;
		mes "[ブダン]";
		mes "もし良かったら、明日以降も";
		mes "手伝ってくれると助かる。";
		mes "子供たちの為にも";
		mes "よろしく頼むよ。";
		close;
	}
	if(checkquest(8694)) {
		if(checkquest(8694) & 0x02 == 0){
			mes "[ブダン]";
			mes "これだけ綺麗な水があれば";
			mes "今日の分は大丈夫だろう。";
			mes "もし、よければ明日以降も";
			mes "手伝ってくれると助かる。";
			close;
		}
		delquest 8694;
		mes "[ブダン]";
		mes "やあ、来てくれたんだな。";
		mes "前と同じように";
		mes "綺麗な水の確保を手伝ってくれないか？";
		next;
		if(select("やりましょう","今は時間がない") == 2) {
			mes "[ブダン]";
			mes "そうか……仕方がない。";
			mes "また別の人にお願いするとしよう。";
			close;
		}
		mes "[ブダン]";
		mes "助かるよ。";
		mes "ラヘルに行けば";
		mes "「聖物販売員」がいるはずだ。";
		mes "適当な理由をつけて「浄水用聖物」を";
		mes "買ってきてくれ。頼んだよ。";
		setquest 8695;
		close;
	}
	mes "[ブダン]";
	mes "よそ者の冒険者か。";
	mes "村のみんなの為にいろいろと";
	mes "手を貸しているらしいな？";
	mes "私のことも手伝ってもらえないか？";
	next;
	mes "[ブダン]";
	mes "知っていると思うが";
	mes "我々はラヘルには容易に入れない。";
	mes "だから、代りにラヘルの";
	mes "セスルムニル大神殿で作られている";
	mes "「浄水用聖物」を買って来て欲しい。";
	next;
	mes "[ブダン]";
	mes "元々この地は綺麗な水を";
	mes "確保するのが難しい土地だった。";
	mes "砂漠はもちろん、火山灰もあるしな。";
	mes "そこで「浄水用聖物」が";
	mes "開発されたんだ。";
	next;
	mes "[ブダン]";
	mes "原理はよくわからんが……";
	mes "錬金術やら魔法的な技術で";
	mes "汚水を浄化してくれる。";
	mes "この森の硫黄の温泉水も";
	mes "飲めるようになるんだ。";
	next;
	mes "[ブダン]";
	mes "便利な品なんだが使用期限があって";
	mes "ストックしておけないから";
	mes "その都度、手に入れないといけない。";
	mes "というわけで、あんたの出番だ。";
	next;
	mes "[ブダン]";
	mes "ラヘルに行って「浄水用聖物」を";
	mes "買って来て、村に設置されている";
	mes "「水瓶」に入れて欲しい。";
	mes "そうすれば、綺麗な水が確保できる。";
	mes "やってもらえるか？";
	next;
	if(select("やってみましょう","難しいかも……") == 2) {
		mes "[ブダン]";
		mes "そうか……仕方がない。";
		mes "また別の人にお願いするとしよう。";
		close;
	}
	mes "[ブダン]";
	mes "助かるよ。";
	mes "ラヘルに行けば";
	mes "「聖物販売員」がいるはずだ。";
	mes "適当な理由をつけて「浄水用聖物」を";
	mes "買ってきてくれ。頼んだよ。";
	delquest 130106;
	setquest 8691;
	close;
OnQuestInfo:
	if(checkquest(130106) || checkquest(8693))
		showevent 0, 3, "ブダン#ep18";
	else
		showevent 9999,0,"ブダン#ep18";
	end;
}
wolfvill.gat,104,235,0	script	飲用水の水瓶#ep1801	844,{/* 16169 */
	if(checkquest(8692)) {
		mes "^0000FF‐村全体で使われる";
		mes "　飲用水の水瓶だ。";
		mes "　片方には綺麗な水が入っているが";
		mes "　もう片方に入っている水は濁っていて";
		mes "　今のままでは飲めそうにない‐^000000";
		next;
		misceffect 441,"飲用水の水瓶#ep1801";
		misceffect 444,"飲用水の水瓶#ep1801";
		misceffect 14,"飲用水の水瓶#ep1801";
		misceffect 44,"飲用水の水瓶#ep1801";
		mes "^0000FF‐濁っている方の水瓶に";
		mes "　「浄水用聖物」を入れると";
		mes "　不思議な光を放った。";
		mes "　瞬く間に水が綺麗になっていく‐^000000";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		delitem 1000410,1;
		delquest 8692;
		setquest 8693;
		getitem 1000411,1;
		mes "^0000FF‐綺麗になった水を汲んだ。";
		mes "　ブダンのところに持って行こう‐^000000";
		close;
	}
	if(checkquest(8696)) {
		mes "^0000FF‐村全体で使われる";
		mes "　飲用水の水瓶だ。";
		mes "　片方には綺麗な水が入っているが";
		mes "　もう片方に入っている水は濁っていて";
		mes "　今のままでは飲めそうにない‐^000000";
		next;
		misceffect 441,"飲用水の水瓶#ep1801";
		misceffect 444,"飲用水の水瓶#ep1801";
		misceffect 14,"飲用水の水瓶#ep1801";
		misceffect 44,"飲用水の水瓶#ep1801";
		mes "^0000FF‐濁っている方の水瓶に";
		mes "　「浄水用聖物」を入れると";
		mes "　不思議な光を放った。";
		mes "　瞬く間に水が綺麗になっていく‐^000000";
		next;
		delitem 1000410,1;
		getitem 1000411,1;
		delquest 8696;
		setquest 8697;
		mes "^0000FF‐綺麗になった水を汲んだ。";
		mes "　ブダンのところに持って行こう‐^000000";
		close;
	}
	if(checkquest(8693) || checkquest(8697)) {
		mes "^0000FF‐綺麗になった水を汲んだ。";
		mes "　ブダンのところに持って行こう‐^000000";
		close;
	}
	mes "^0000FF‐村全体で使われる";
	mes "　飲用水の水瓶だ。";
	mes "　片方には綺麗な水が入っているが";
	mes "　もう片方に入っている水は濁っていて";
	mes "　今のままでは飲めそうにない‐^000000";
	close;
OnQuestInfo:
	if(checkquest(8692))
		showevent 0, 3, "飲用水の水瓶#ep1801";
	else
		showevent 9999,0,"飲用水の水瓶#ep1801";
	end;
}
ra_fild10.gat,175,179,3	script	ロープ#ra_to_oz_dun01	10024,{/* 16170 */
	if(EP18_1QUE < 31) {
		unittalk getcharid(3),strcharinfo(0)+" : ‐こんなところにロープがある‐",1;
		emotion 1,"";
		end;
	}
	mes "^0000FF‐岩の裂け目から";
	mes "　洞窟の入口が見えている。";
	mes "　ロープを使えば洞窟に入れそうだ‐^000000";
	next;
	if(select("ロープを使って下る","使わない") == 2) {
		mes "‐ロープを使わなかった‐";
		close2;
		emotion 9,"";
		end;
	}
	mes "‐ロープを使って下った‐";
	close2;
	warp "oz_dun01.gat", 284, 167;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)
		showevent 6, 1, "ロープ#ra_to_oz_dun01";
	else
		showevent 9999,0,"ロープ#ra_to_oz_dun01";
	end;
}
oz_dun01.gat,284,164,3	script	ロープ#to_ra_fild10	10024,{/* 16171 */
	mes "^0000FF‐ロープを使えば上がれそうだ‐^000000";
	next;
	if(select("ロープを使って上る","使わない") == 2) {
		mes "‐ロープを使わなかった‐";
		close2;
		emotion 9,"";
		end;
	}
	mes "‐ロープを使って上った‐";
	close2;
	warp "ra_fild10.gat", 173, 176;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)	//32かも
		showevent 6, 1, "ロープ#to_ra_fild10";
	else
		showevent 9999,0,"ロープ#to_ra_fild10";
	end;
}

oz_dun01.gat,28,190,3	script	ロープ#to_gw_fild01	10024,{/* 16174 */
	mes "^0000FF‐ロープを使えば上がれそうだ‐^000000";
	next;
	if(select("ロープを使って上る","使わない") == 2) {
		mes "‐ロープを使わなかった‐";
		close2;
		emotion 9,"";
		end;
	}
	mes "‐ロープを使って上った‐";
	close2;
	warp "gw_fild01.gat", 275, 337;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)
		showevent 6, 1, "ロープ#to_gw_fild01";
	else
		showevent 9999,0,"ロープ#to_gw_fild01";
	end;
}
gw_fild01.gat,279,335,3	script	ロープ#to_oz_dun01	10024,{/* 16175 */
	mes "^0000FF‐岩の裂け目から";
	mes "　洞窟の入口が見えている。";
	mes "　ロープを使えば洞窟に入れそうだ‐^000000";
	next;
	if(select("ロープを使って下る","使わない") == 2) {
		mes "‐ロープを使わなかった‐";
		close2;
		emotion 9,"";
		end;
	}
	mes "‐ロープを使って下った‐";
	close2;
	warp "oz_dun01.gat", 27, 188;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)
		showevent 6, 1, "ロープ#to_oz_dun01";
	else
		showevent 9999,0,"ロープ#to_oz_dun01";
	end;
}
gw_fild01.gat,396,269,3	script	古い道しるべ#ep18	836,{/* 16176 */}
gw_fild01.gat,135,9,0	script	#to_gw_fild02	45,{/* 16177 */}

gw_fild01.gat,32,101,3	script	キャンパー#to_wolfvill	881,{/* 16179 */
	if(EP18_1QUE < 35) {
		mes "[キャンパー]";
		mes "試験には落ちる。";
		mes "職も見つからない。";
		mes "そんな俺ができることは";
		mes "そう！　キャンプだ！";
		next;
		mes "[キャンパー]";
		mes "い、家を追い出されたわけじゃない。";
		mes "本当だぞ？";
		close;
	}
	mes "[門番]";
	mes "やあ、あんたか。";
	mes "話は聞いてるよ。";
	mes "村に入るのかい？";
	next;
	switch(select("灰色狼の村へ行く","オズの迷路へ行く","今は入らない","貴方の正体は？")) {
	case 1:
		mes "[門番]";
		mes "じゃあ、ついて来てくれ。";
		mes "こちらの木の隙間から";
		mes "こうやって入っていくんだ。";
		close2;
		warp "wolfvill.gat", 270, 26;
		end;
	case 2:
		mes "[門番]";
		mes "オズの迷路へ行くのか？";
		mes "オズの迷路はあっちの方角だぜ。";
		viewpoint 1, 275, 337, 18, 0x00FF00;
		next;
		mes "‐オズの迷路へ向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐あなたはオズの迷路へ向かった‐";
		close2;
		warp "gw_fild01.gat", 275, 337;
		end;
	case 3:
		mes "[門番]";
		mes "そう？";
		mes "せっかくここまで来たんだったら";
		mes "ちょいと周りのモンスターを";
		mes "黙らせてくれよ。";
		mes "ゆっくりキャンプもできないぜ。";
		close;
	case 4:
		mes "[門番]";
		mes "そう、俺は村の門番だよ。";
		mes "関係ない奴が来たら";
		mes "キャンプしてるように見せて";
		mes "偽装してるってわけさ。";
		close;
	}
	if(EP18_1QUE >= 36)
		showevent 6, 1, "キャンパー#to_wolfvill";
	else
		showevent 9999,0,"キャンパー#to_wolfvill";
	end;
}
rachel.gat,106,144,5	script	行商人#ep18_0_1	10380,{/* 16180 */
	if(EP18_1QUE < 35) {
		mes "[行商人]";
		mes "すまんな。今は忙しいんだ。";
		next;
		mes "^0000ff‐クエスト「祈りの方向」を、";
		mes "　一定以上進行すると";
		mes "　利用が可能になります‐^000000";
		close;
	}
	mes "[行商人]";
	mes "む、お前は";
	mes "村で見たことある顔だな。";
	mes "今から村に行くが、";
	mes "ついでに送ってやろうか？";
	mes "無論、代金はとる。";
	mes "お代は^ff00005000Zeny^000000ってところだな。";
	next;
	if(select("灰色狼の村へ行く","やめておく") == 2) {
		mes "[行商人]";
		mes "そうか。";
		mes "村に行く時は声を掛けな。";
		mes "一緒に送ってやる。";
		close;
	}
	if(Zeny < 5000) {	// 未調査
		mes "[行商人]";
		mes "お金がないなら送れないな";
		close;
	}
	misceffect 58,"行商人#ep18_0_1";
	misceffect 35,"";
	mes "[行商人]";
	mes "毎度あり！";
	mes "それじゃ。出発だ。";
	close2;
	set Zeny, Zeny -5000;
	warp "wolfvill.gat", 143, 126;	// from: rachel.gat(117, 139)
	end;
OnQuestInfo:
	if(EP18_1QUE >= 35)
		showevent 6, 3, "行商人#ep18_0_1";
	else
		showevent 9999,0,"行商人#ep18_0_1";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[転送]";
	end;
}
wolfvill.gat,136,113,5	script	行商人#ep18_0_2	10380,{/* 16181 */
	mes "[行商人]";
	mes "む、お前は";
	mes "ラヘルで見たことある顔だな。";
	mes "今からラヘルに行くが、";
	mes "ついでに送ってやろうか？";
	mes "無論、代金はとる。";
	mes "お代は^ff00005000Zeny^000000ってところだな。";
	next;
	if(select("ラヘルへ行く","やめておく") == 2) {
		mes "[行商人]";
		mes "そうか。";
		mes "ラヘルに行く時は声を掛けな。";
		mes "一緒に送ってやる。";
		close;
	}
	if(Zeny < 5000) {	// 未調査
		mes "[行商人]";
		mes "お金がないなら送れないな";
		close;
	}
	misceffect 58,"行商人#ep18_0_2";
	misceffect 35,"";
	mes "[行商人]";
	mes "毎度あり！";
	mes "それじゃ。出発だ。";
	close2;
	set Zeny, Zeny -5000;
	warp "rachel.gat", 115, 142;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 35)
		showevent 6, 3, "行商人#ep18_0_2";
	else
		showevent 9999,0,"行商人#ep18_0_2";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[転送]";
	end;
}
wolfvill.gat,276,25,0	warp	#to_gw_fild01	2,2,gw_fild01.gat,25,101	//16182 from: wolfvill.gat(275, 24)
ra_fild10.gat,384,287,0	warp	raF10E_raF11W	1,1,ra_fild11.gat,28,290	// 16186
ra_fild11.gat,21,290,0	warp	raF11W_raF10E	1,1,ra_fild10.gat,379,283	// 16187
ra_fild11.gat,360,226,0	warp	raF11E_raWGate	1,1,rachel.gat,30,125	// 16188
rachel.gat,25,125,0	warp	raWGate_raF11E	1,1,ra_fild11.gat,353,226	// 16189
rachel.gat,167,244,0	script	#ep18w13_301	139,{/* 16190 */}
rachel.gat,167,244,5	script	神官#sms01	920,{/* 16191 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,79,260,0	script	cinematic#vod	139,{/* 16192 */}
wolfvill.gat,79,260,4	script	アイラ#vod	475,{/* 16193 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}

wolfvill.gat,167,135,3	script	アサド#wolfvill	10397,{
	mes "[アサド]";
	mes "「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を";
	mes "持っていたら分けてくれません？";
	mes "もちろん、お礼はしますので。";
	next;
	if(select("交換する","やめる") == 2) {
		mes "[アサド]";
		mes "そうですか。それは残念です。";
		mes "もし交換しても良いと思えたら";
		mes "また来てください。";
		close;
	}
	mes "^0000ff材料となるアイテムの精錬値、";
	mes "装着されているカードや";
	mes "エンチャントなどは引き継がれません。";
	mes "また、対象アイテムを";
	mes "複数所持している場合は";
	mes "何れかのアイテムが使用されます。";
//	callbarterlist "アサド#wolfvill";
	close;
OnInit:
//	barterlist "アサド#wolfvill",100626,0,1000405,100,0;
//	barterlist "アサド#wolfvill",450177,0,1000405,100,0;
//	barterlist "アサド#wolfvill",450178,0,1000405,100,0;
//	barterlist "アサド#wolfvill",480091,0,1000405,100,0;
//	barterlist "アサド#wolfvill",480090,0,1000405,100,0;
//	barterlist "アサド#wolfvill",470087,0,1000405,100,0;
//	barterlist "アサド#wolfvill",470088,0,1000405,100,0;
//	barterlist "アサド#wolfvill",490107,0,1000405,100,0;
//	barterlist "アサド#wolfvill",490108,0,1000405,100,0;
//	barterlist "アサド#wolfvill",490106,0,1000405,100,0;
//	barterlist "アサド#wolfvill",490109,0,1000405,100,0;
	setnpcgroup 1065;
	setnpctitle "[アイテム交換]";
	end;
}
wolfvill.gat,164,137,3	script	エメット#wolfvill	10399,{
	mes "[エメット]";
	mes "こんにちは。私たちは";
	mes "「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を";
	mes "集めています。";
	mes "もしあなたがお持ちでしたら";
	mes "譲っていただけないでしょうか？";
	next;
	mes "[エメット]";
	mes "もしいただけるのならお礼に";
	mes "グレイウルフシリーズに";
	mes "エンチャントを施しますよ。";
	//mes "　";
	//mes "<URL>グレイウルフシリーズの詳細を見る<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/graywolf.html</INFO></URL>";
	next;
	switch(select("エンチャント(兜・鎧・肩・靴)","エンチャント(アクセサリー1・2)","立ち去る")) {
	case 1:
		setarray '@itemid,400409,450177,450178,480090,480091,470087,470088;
		mes "[エメット]";
		mes "まずはあなたの装備を";
		mes "確認させてください。";
		mes "どれにエンチャントを施しますか？";
		next;
		for('@i = 0; '@i < getarraysize('@itemid); '@i++) {
			if(getequipid(1) == '@itemid['@i])
				set '@id[0],'@itemid['@i];
			if(getequipid(2) == '@itemid['@i])
				set '@id[1],'@itemid['@i];
			if(getequipid(5) == '@itemid['@i])
				set '@id[2],'@itemid['@i];
			if(getequipid(6) == '@itemid['@i])
				set '@id[3],'@itemid['@i];
		}
		if('@id[0] == 0 && '@id[1] == 0 && '@id[2] == 0 && '@id[3] == 0) {
			mes "^ff0000エンチャント対象のアイテムを";
			mes "装着していません。";
			close;
		}
		if('@id[0] > 0)
			set '@menu$[0],getitemname('@id[0]);
		if('@id[1] > 0)
			set '@menu$[1],getitemname('@id[1]);
		if('@id[2] > 0)
			set '@menu$[2],getitemname('@id[2]);
		if('@id[3] > 0)
			set '@menu$[3],getitemname('@id[3]);
		set '@pos,select('@menu$[0],'@menu$[1],'@menu$[2],'@menu$[3]);
		if('@pos == 1 || '@pos == 2)
			set '@pos,'@pos;
		else
			set '@pos,'@pos+2;
		set '@ref,1;
		break;
	case 2:
		setarray '@itemid,490106,490107,490108,490109;
		mes "[エメット]";
		mes "まずはあなたの装備を";
		mes "確認させてください。";
		mes "どれにエンチャントを施しますか？";
		next;
		for('@i = 0; '@i < getarraysize('@itemid); '@i++) {
			if(getequipid(7) == '@itemid['@i])
				set '@id[0],'@itemid['@i];
			if(getequipid(8) == '@itemid['@i])
				set '@id[1],'@itemid['@i];
		}
		if('@id[0] == 0 && '@id[1] == 0) {
			mes "^ff0000エンチャント対象のアイテムを";
			mes "装着していません。";
			close;
		}
		if('@id[0] > 0)
			set '@menu$[0],getitemname('@id[0]);
		if('@id[1] > 0)
			set '@menu$[1],getitemname('@id[1]);
		set '@pos,select('@menu$[0],'@menu$[1]) + 6;
		break;
	case 3:	// 立ち去る
		mes "[エメット]";
		mes "もし「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を";
		mes "手に入れて、グレイウルフシリーズに";
		mes "エンチャントを施したくなったら";
		mes "また私の所まで来てください。";
		close;
	}
	set '@refine,getequiprefinerycnt('@pos,20);
	set '@nameid,getequipid('@pos);
	set '@card[0],getequipcardid('@pos,0);
	set '@card[1],getequipcardid('@pos,1);
	set '@card[2],getequipcardid('@pos,2);
	set '@card[3],getequipcardid('@pos,3);
	mes "[エメット]";
	mes "「^0000ff<ITEM>"+ getitemname('@nameid) +"["+ getiteminfo('@nameid,10) +"]<INFO>"+ '@nameid +"</INFO></ITEM>^000000」ですね。";
	mes "どのスロットに行いますか？";
	mes "　";
	mes "^0000ff<現在のエンチャント>^000000";
	if('@card[1] > 0)
		mes "第2スロット : <ITEM>"+ getitemname('@card[1]) +"<INFO>"+ '@card[1] +"</INFO></ITEM>";
	else
		mes "第2スロット : エンチャント無し";
	if('@card[2] > 0)
		mes "第3スロット : <ITEM>"+ getitemname('@card[2]) +"<INFO>"+ '@card[2] +"</INFO></ITEM>";
	else
		mes "第3スロット : エンチャント無し";
	if('@card[3] > 0)
		mes "第4スロット : <ITEM>"+ getitemname('@card[3]) +"<INFO>"+ '@card[3] +"</INFO></ITEM>";
	else
		mes "第4スロット : エンチャント無し";
	next;
	set '@slot,select("第2スロット","第3スロット","第4スロット");
	if('@ref > 0)
		set '@ref,10 - '@slot;
	if('@refine < '@ref) {
		mes "^ff0000エンチャントに必要な";
		mes "精錬値が不足しています。";
		close;
	}
	set '@view_slot,'@slot+1;
	switch('@pos) {
	case 1:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310600,310572;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310506,310507,310567,310568,310600,310572;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310506,310507,310515,310568,310600,310572;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 2:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310597,310598;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310496,310497,310600;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515,310568,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 5:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310597,310598;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310571,310600;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515,310568,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 6:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310597,310598;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310572,310600;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515,310568,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 7:
	case 8:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310506,310507;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	default:
		mes "不明なエラー";
		close;
	}
	for('@j=0; '@j < getarraysize('@list); '@j++) {
		set '@m_rate,'@m_rate + '@list['@j];
		if('@j > 0)
			set '@rate['@j],'@list['@j] + '@rate['@j-1];
		else
			set '@rate['@j],'@list['@j];
	}
	mes "[エメット]";
	mes "確認しました。こちらの内容で";
	mes "エンチャントして良いですか？";
	mes "　";
	mes "^0000ff<エンチャントに必要なアイテム>^000000";
	mes "<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM> 1個";
	mes "　";
	mes "^0000ff<エンチャント対象>^000000";
	mes "<ITEM>"+ getitemname('@nameid) +"["+ getiteminfo('@nameid,10) +"]<INFO>"+ '@nameid +"</INFO></ITEM>";
	mes "　";
	mes "^0000ff<現在のエンチャント>^000000";
	if('@card['@slot] > 0)
		mes "第"+ '@view_slot +"スロット : <ITEM>"+ getitemname('@card['@slot]) +"<INFO>"+ '@card['@slot] +"</INFO></ITEM>";
	else
		mes "第"+ '@view_slot +"スロット : エンチャント無し";
	next;
	while(1) {
		switch(select("少し考える","いいえ","はい","指定したエンチャントが付くまで実行")) {
		case 1:
			continue;
		case 2:
			mes "[エメット]";
			mes "もし「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を";
			mes "手に入れて、グレイウルフシリーズに";
			mes "エンチャントを施したくなったら";
			mes "また私の所まで来てください。";
			close;
		case 3:
			if(countitem(1000405) < 1) {
				mes "^ff0000エンチャントに必要なアイテムが";
				mes "不足しています。";
				close;
			}
			delitem 1000405,1;
			set '@r,rand('@m_rate);
			for('@j=0; '@j < getarraysize('@list); '@j++) {
				if('@r < '@rate['@j])
					break;
			}
			setequipcardid '@pos,'@slot,'@ench['@j],2;
			misceffect 589,"";
			misceffect 729,"";
			misceffect 847,"";
			mes "[エメット]";
			mes "……ふう、完成です。";
			mes "またご利用の際は";
			mes "「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を持って";
			mes "私の所まで来てください。";
			close;
		case 4:
			if(countitem(1000405) < 1) {
				mes "^ff0000エンチャントに必要なアイテムが";
				mes "不足しています。";
				close;
			}
			mes "付与するエンチャントを";
			mes "選択してください。";
			mes "　";
			mes "^0000ff<現在のエンチャント>^000000";
			if('@card['@slot] > 0)
				mes "第"+ '@view_slot +"スロット : <ITEM>"+ getitemname('@card['@slot]) +"<INFO>"+ '@card['@slot] +"</INFO></ITEM>";
			else
				mes "第"+ '@view_slot +"スロット : エンチャント無し";
			next;
			set '@menu_max,getarraysize('@ench);
			for('@j=0; '@j < getarraysize('@ench); '@j++) {
				if('@j < 9)
					set '@emenu1$['@j],getitemname('@ench['@j]);
				else
					set '@emenu2$['@j-9],getitemname('@ench['@j]);
			}
			set '@emenu1$[9],"次のページ";
			set '@emenu2$['@menu_max-9],"やめる";
			set '@need,select(printarray('@emenu1$)) - 1;
			if('@need == 9) {
				mes "付与するエンチャントを";
				mes "選択してください。";
				mes "　";
				mes "^0000ff<現在のエンチャント>^000000";
				if('@card['@slot] > 0)
					mes "第"+ '@view_slot +"スロット : <ITEM>"+ getitemname('@card['@slot]) +"<INFO>"+ '@card['@slot] +"</INFO></ITEM>";
				else
					mes "第"+ '@view_slot +"スロット : エンチャント無し";
				next;
				set '@need,select(printarray('@emenu2$)) + 8;
				if('@need == '@menu_max) {
					mes "[エメット]";
					mes "もし「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を";
					mes "手に入れて、グレイウルフシリーズに";
					mes "エンチャントを施したくなったら";
					mes "また私の所まで来てください。";
					close;
				}
			}
			set '@tryid,'@ench['@need];
			mes "エンチャント結果が";
			mes "「^0000ff<ITEM>"+ getitemname('@tryid) +"<INFO>"+ '@tryid +"</INFO></ITEM>^000000」になるまで";
			mes "連続して実行します。";
			mes "よろしいですか？";
			mes "　";
			mes "^ff0000※必要なアイテムを全て預かり、";
			mes "指定したエンチャントが付与された時点で";
			mes "残りのアイテムをお返しいたします。";
			mes "　";
			mes "※必要アイテムが無くなるまで";
			mes "連続して実行します。";
			mes "　";
			mes "※必要アイテムを全て消費しても";
			mes "選んだエンチャントが";
			mes "付与されなかった場合は";
			mes "最後に行ったエンチャントの";
			mes "内容が装備に付与されます。";
			mes "　";
			mes "※メンテナンスや、サーバーとの接続が";
			mes "切断されるなどのトラブルが";
			mes "発生した場合、残りのアイテムが";
			mes "お返しできない場合があります。";
			mes "予めご了承下さい。";
			next;
			while(1) {
				switch(select("少し考える","いいえ","はい")) {
				case 1:
					continue;
				case 2:
					mes "[エメット]";
					mes "もし「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を";
					mes "手に入れて、グレイウルフシリーズに";
					mes "エンチャントを施したくなったら";
					mes "また私の所まで来てください。";
					close;
				case 3:
					set '@max,countitem(1000405);
					if('@max > 2000)
						set '@max,2000;
					delitem 1000405,'@max;
					for('@t = 1; '@t < '@max; '@t++) {
						set '@r,rand('@m_rate);
						for('@j=0; '@j < getarraysize('@list); '@j++) {
							if('@r < '@rate['@j])
								break;
						}
						if('@ench['@j] == '@tryid)
							break;
					}
					if('@t < '@max) {
						set '@amount,'@max - '@t;
						if('@amount > 0)
							getitem 1000405,'@amount;
					}
					setequipcardid '@pos,'@slot,'@ench['@j],2;
					misceffect 589,"";
					misceffect 729,"";
					misceffect 847,"";
					mes "<エンチャント結果>";
					mes "実施結果 : <ITEM>"+ getitemname('@ench['@j]) +"<INFO>"+ '@ench['@j] +"</INFO></ITEM>";
					mes "実施回数 :"+ '@t +"";
					next;
					mes "[エメット]";
					mes "……ふう、完成です。";
					mes "またご利用の際は";
					mes "「<ITEM>アメジストの欠片<INFO>1000405</INFO></ITEM>」を持って";
					mes "私の所まで来てください。";
					close;
				}
			}
			close;
		}
	}
	close;
OnInit:
	setnpcgroup 1016;
	setnpctitle "[グレイウルフ強化]";
	end;
}
wolfvill.gat,170,131,3	script	バムダッド#wolfvill	10394,{
	end;
OnInit:
	setnpcgroup 1016;
	setnpctitle "[フィデス作成・強化]";
	end;
}
