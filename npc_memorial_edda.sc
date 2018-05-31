//= Auriga Script ==============================================================
// Ragnarok Online Half moon in the Daylight Memorial Script	by refis
//==============================================================================

//============================================================
// NPC
//------------------------------------------------------------
rachel.gat,177,139,3	script	大神官補佐#01	920,{/* 58944 */
	mes "[大神官補佐]";
	mes "私はニルエン大神官様の";
	mes "補佐をしている者です。";
	mes "夢の力でお役に立てることがあれば";
	mes "お申し付けください。";
	while(1) {
		next;
		switch(select("夢の加護をうける","信頼度を確認する","夢の力、加護、信頼度って何？","何でもないです")) {
		case 1:
			mes "[大神官補佐]";
			mes "どの加護をうけますか？";
			next;
			switch(select("神官のネックレスにエンチャント","神官のネックレスをもらう","アルナベルツ転送サービス(要信頼度20)","[衣装] たれルーミン(要信頼度30)","[衣装] たれ教皇(私服)(要信頼度150)","やっぱりいいです")) {
			case 1:
				mes "[大神官補佐]";
				mes "付与するには^ff0000神官のネックレス^000000を";
				mes "装備している必要があります。";
				next;
				select("アクセサリー[1]‐装備していない:アクセサリー[2]‐装備していない:やめる")
				mes "[大神官補佐]";
				mes "^ff0000神官のネックレス^000000を";
				mes "装備してください。";
				close;
			case 2:
				mes "[大神官補佐]";
				mes "神官のネックレスですね。";
				mes "無料で提供しています。";
				mes "いかがでしょうか？";
				next;
				if(select("やっぱりやめます","もらいます") == 1) {
					mes "[大神官補佐]";
					mes "わかりました。";
					mes "また来てくださいね。";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[大神官補佐]";
					mes "荷物の種類が多いようです。";
					mes "一度整理してからきてください";
					close;
				}
				mes "[大神官補佐]";
				mes "こちらどうぞ。";
				mes "それではお受け取りください。";
				getitem 28387, 1;
				close;
			case 3:
			case 4:
			case 5:
				mes "[大神官補佐]";
				mes "信頼度が足りないようです。";
				mes "この加護を";
				mes "受けることができません。";
				close;
			case 6:
				mes "[大神官補佐]";
				mes "わかりました。";
				mes "また来てくださいね。";
				close;
			}
		case 2:
			mes "[大神官補佐]";
			mes "夢の力を感じてみます。";
			mes "教皇様とあなたの信頼度は……";
			next;
			mes "[大神官補佐]";
			mes QUE1_EDDA_INTIMATE +"です！";
			break;
		case 3:
			mes "[大神官補佐]";
			mes "夢の中で、";
			mes "その夢を見ている方を";
			mes "助けると信頼度があがります。";
			next;
			mes "[大神官補佐]";
			mes "その信頼度が高いほど、";
			mes "夢の力が大きくなります。";
			mes "私がその夢の力を利用して";
			mes "特別な力を宿すことができます。";
			mes "その力を加護と呼んでいます。";
			next;
			mes "[大神官補佐]";
			mes "今回夢に囚われている方がいます。";
			mes "あなたにその方を";
			mes "助けていただきたいのです……";
			mes "詳しくはニルエン大神官様に";
			mes "お話を伺ってください。";
			next;
			mes "[大神官補佐]";
			mes "このように私は夢の力を感じ、";
			mes "僅かながら力を";
			mes "使うことができます。";
			mes "どうして私が";
			mes "夢の力を使えるようになったのか……";
			mes "^0000FFふふ……それについては秘密です^000000。";
			break;
		case 4:
			mes "[大神官補佐]";
			mes "わかりました。";
			mes "また来てくださいね。";
			close;
		}
	}
}

rachel.gat,174,138,6	script	ニルエン大神官#ponir01	915,{/* 58945 */
	if(!(checkquest(14594) & 0x8)) {
		cutin "ra_gwoman.bmp", 2;
		mes "[ニルエン大神官]";
		mes "おや、あなたは……";
		mes "良いところに";
		mes "いらっしゃいましたね。";
		next;
		mes "[ニルエン大神官]";
		mes "実は少々困ったことに";
		mes "なっておりまして、";
		mes "良ければ我々に";
		mes "協力してはいただけないでしょうか？";
		next;
		menu "何でしょう",-;
		mes "[ニルエン大神官]";
		mes "詳細をお話しする前に一つ、";
		mes "確認していただきたいことが";
		mes "あります。";
		next;
		mes "[ニルエン大神官]";
		mes "これからお話しすることは";
		mes "極秘事項となります。";
		mes "口外すればあなただけでなく、";
		mes "それを聞いた人にも";
		mes "災いが及ぶでしょう。";
		next;
		mes "[ニルエン大神官]";
		mes "本来ならば、あなたのような";
		mes "冒険者に依頼することでは";
		mes "ありません。";
		next;
		mes "[ニルエン大神官]";
		mes "しかし、それをおしても";
		mes "あなたに依頼したい";
		mes "事情があるのです。";
		mes "そのことを重々承知して";
		mes "いただけるようお願いします。";
		next;
		mes "[ニルエン大神官]";
		mes "また、話を聞いた場合には、";
		mes "必ずこの依頼を";
		mes "引き受けてもらいます。";
		mes "断ることはできません。";
		mes "それだけ重大な秘密なのです。";
		next;
		mes "[ニルエン大神官]";
		mes "これらのことを";
		mes "ご理解いただいたうえで";
		mes "私からの依頼を";
		mes "お受けいただけますか？";
		next;
		if(select("わかりました","やめておきます") == 2) {
			mes "[ニルエン大神官]";
			mes "慎重な方ですね。";
			mes "わかりました。";
			mes "他の方をあたることにします";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		mes "[ニルエン大神官]";
		mes "ありがとうございます。";
		mes "くれぐれも他言無用で";
		mes "お願いします。";
		cutin "ra_gwoman.bmp", 2;
		next;
		mes "[ニルエン大神官]";
		mes "薄々感づいておられるかも";
		mes "しれませんが、";
		mes "話というのは教皇様のことです。";
		next;
		mes "[ニルエン大神官]";
		mes "最近、教皇様のお体に";
		mes "変化が起こりはじめました。";
		mes "^0000cd教皇様の睡眠時間^000000が";
		mes "異常なまでに増えたのです。";
		next;
		mes "[ニルエン大神官]";
		mes "以前は夜早く寝室に入り、";
		mes "朝早くお目覚めになっていたのに、";
		mes "徐々にその時間が";
		mes "遅くなっていきました。";
		next;
		mes "[ニルエン大神官]";
		mes "そしてそれだけではなく、";
		mes "頻繁にお眠りになるように";
		mes "なりました。";
		next;
		mes "[ニルエン大神官]";
		mes "睡眠時間は日に日に";
		mes "増え続けています。";
		mes "今も教皇様はお眠りに";
		mes "なっています。";
		next;
		menu "何か病気になったのでしょうか？",-;
		mes "[ニルエン大神官]";
		mes "私たちも教皇様の体に";
		mes "何か起きたのではないかと思い、";
		mes "様々な検査をしてみましたが、";
		mes "異常は見つかりませんでした。";
		mes "ただ……";
		next;
		mes "[ニルエン大神官]";
		mes "目覚めた後は哀しい表情を見せたり、";
		mes "心ここにあらずといった感じの";
		mes "姿をお見せになります。";
		next;
		mes "[ニルエン大神官]";
		mes "そしてまたすぐお眠りに";
		mes "なろうとするのです。";
		next;
		menu "他に考えられる問題は？",-;
		mes "[ニルエン大神官]";
		mes "心理的な問題ではないかと";
		mes "考えています。";
		mes "^0000cd夢^000000の中で";
		mes "何かを見ているのかも";
		mes "しれません。";
		next;
		mes "[ニルエン大神官]";
		mes "一度だけ、お目覚めになった直後に";
		mes "^0000cd家族^000000について";
		mes "お尋ねになられたことがありました。";
		next;
		menu "教皇様にも家族はいますか……？",-;
		mes "[ニルエン大神官]";
		mes "はい。";
		mes "しかし神殿にいらっしゃる前の";
		mes "俗世のことは";
		mes "すべて忘れなければなりません。";
		next;
		mes "[ニルエン大神官]";
		mes "そしてそれは";
		mes "家族についても同じです。";
		next;
		mes "[ニルエン大神官]";
		mes "ひとつの時代にただ一人。";
		mes "選ばれた子として生まれ、";
		mes "神殿に入ることで女神を祭る身として";
		mes "生まれ変わるのです。";
		next;
		mes "[ニルエン大神官]";
		mes "そのため表向きには";
		mes "教皇様に俗世の家族はいません。";
		next;
		mes "[ニルエン大神官]";
		mes "そのことをご存知のはずの教皇様が";
		mes "夢を見た後に聞いてきた";
		mes "ということは、";
		mes "夢で見たものに関係があるのでは";
		mes "ないでしょうか。";
		next;
		mes "[ニルエン大神官]";
		mes "もちろん、夢の中の話です。";
		mes "しかし私はただの夢ではなかった";
		mes "のではないかと考えています。";
		next;
		mes "[ニルエン大神官]";
		mes "教皇様は神殿内の人間でも";
		mes "そう簡単にお会いすることは";
		mes "できません。";
		next;
		mes "[ニルエン大神官]";
		mes "そんな教皇様に外部の人間が";
		mes "秘密裏に接触するのは至難の業です。";
		mes "とても現実的ではありません。";
		next;
		mes "[ニルエン大神官]";
		mes "しかし……夢の中なら。";
		mes "夢の中なら誰にも見つかることなく";
		mes "教皇様と接触することができます。";
		next;
		mes "[ニルエン大神官]";
		mes "そして、教皇様に接触していると";
		mes "思われる人物ですが、";
		mes "実は……心当たりがあるのです。";
		next;
		mes "[ニルエン大神官]";
		mes "^0000cd氷の洞窟^000000の地下深く、";
		mes "クトルラナックスに守られ";
		mes "^0000cd氷の中に封印^000000されている";
		mes "教皇様の双子の兄、^0000cdルーミン^000000……。";
		next;
		mes "[ニルエン大神官]";
		mes "最近の調査報告書によると";
		mes "クトルラナックスが何らかの影響を";
		mes "与えたのか、ルーミンから";
		mes "微弱な魔力の反応が";
		mes "あったそうなのです。";
		next;
		mes "[ニルエン大神官]";
		mes "ひとつのお腹から";
		mes "同じ日、同じ時間に生まれた";
		mes "双子同士が共鳴しあっている";
		mes "のかもしれません。";
		next;
		mes "[ニルエン大神官]";
		mes "無意識のうちに夢を通じて";
		mes "教皇様の意識に触れたとしたら、";
		mes "そのまま教皇様に干渉することも";
		mes "可能でしょう。";
		next;
		mes "[ニルエン大神官]";
		mes "現在も教皇様の睡眠時間が";
		mes "増え続けていることを考えると、";
		mes "誰かが夢の中に留めさせているか、";
		mes "もしくは教皇様自らが目覚めることを";
		mes "拒んでいるのではないかと";
		mes "推測しています。";
		next;
		mes "[ニルエン大神官]";
		mes "そこであなたには";
		mes "教皇様の夢の中に入り、";
		mes "何が起こっているのかを";
		mes "見て来てほしいのです。";
		mes "もし問題が起こっていたら";
		mes "それを解決してください。";
		next;
		mes "[ニルエン大神官]";
		mes "夢の中には";
		mes "私の術でお送りしましょう。";
		next;
		menu "どうして私に頼んだのですか？",-;
		mes "[ニルエン大神官]";
		mes "詳しい内容は言えませんが、";
		mes "現在はアルナベルツの状況が……";
		mes "特に神殿の内部状況が";
		mes "あまり良くありません。";
		next;
		mes "[ニルエン大神官]";
		mes "少し間違えれば、";
		mes "教皇様の現在の状態を";
		mes "政治的に利用される可能性が";
		mes "あるのです。";
		next;
		mes "[ニルエン大神官]";
		mes "ゆえに神殿内のどの派閥にも";
		mes "偏らない外部の人間、";
		mes "そのうえである程度腕が立ちそうな";
		mes "冒険者のあなたに";
		mes "依頼することにしたのです。";
		next;
		mes "[ニルエン大神官]";
		mes "教皇様はアルナベルツの希望であり、";
		mes "夢です。";
		next;
		mes "[ニルエン大神官]";
		mes "それがあんなことになってしまい、";
		mes "もしも永遠に眠りから覚めないなどと";
		mes "いうことになってしまったら……。";
		next;
		mes "[ニルエン大神官]";
		mes "教皇様を夢の中で守りながら、";
		mes "いったい何が起こっているのか";
		mes "できる限り最後まで";
		mes "見届けてください。";
		next;
		mes "[ニルエン大神官]";
		mes "夢の中ですので、";
		mes "何が起こるかわかりません。";
		mes "教皇様が何を見せてくれるか、";
		mes "どのように反応するかは";
		mes "誰にもわかりません。";
		mes "くれぐれも気を付けてください。";
		next;
		mes "[ニルエン大神官]";
		mes "それから、私の術で";
		mes "夢の中に送れるのは";
		mes "一人だけです。";
		mes "夢の中に入る際には";
		mes "^ff0000一人で来てください。^000000";
		next;
		mes "[ニルエン大神官]";
		mes "それでは準備が出来たら";
		mes "私に声をかけてください。";
		setquest 14594; //state=1
		compquest 14594;
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	}
	cutin "ra_gwoman.bmp", 2;
	mes "[ニルエン大神官]";
	mes "夢の中に入りますか？";
	next;
	switch(select("準備をしてもらう(ダンジョン作成)","夢の中に入る(ダンジョン入場)","やめる")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[ニルエン大神官]";
			mes "すみませんが、";
			mes "パーティーリーダー以外の方は";
			mes "ご遠慮いただけますか。";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		mdcreate "halfmoon";
		mes "[ニルエン大神官]";
		mes "もう少しで準備が終わります。";
		mes "よろしくお願いします。";
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	case 2:
		mes "[ニルエン大神官]";
		mes "わかりました。";
		mes "送る先を選んでください。";
		next;
		switch(select("^0000ff夢の中に入る(BaseLv70以上)^000000","^ff0000より深い夢の中に入る(BaseLv99以上)^000000","やめる")) {
		case 1:
			mes "[ニルエン大神官]";
			mes "では^0000ff夢の中^000000に送ります。";
			mes "よろしいですか？";
			next;
			if(select("はい","やめる") == 2) {
				mes "[ニルエン大神官]";
				mes "気が変わりましたか？";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[ニルエン大神官]";
				mes "すみませんが、";
				mes "パーティーリーダー以外の方は";
				mes "ご遠慮いただけますか。";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			switch(mdenter("halfmoon")) {
			case 0:
				mes "[ニルエン大神官]";
				mes "それでは夢の中に送ります。";
				mes "教皇様をよろしくお願いします。";
				announce "メモリアルダンジョン[halfmoon] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x1,0x00ff99,0x190,12,0,0;
				setquest 14585; //state=1
				set QUE1_EDDA,0;
				// warp "1@pop1.gat",47,133;
				close;
			default:
				mes "[ニルエン大神官]";
				mes "まだ夢の中に送る準備が";
				mes "できていません。";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
		case 2:
			mes "[ニルエン大神官]";
			mes "では^ff0000より深い夢の中^000000に送ります。";
			mes "よろしいですか？";
			next;
			if(select("はい","やめる") == 2) {
				mes "[ニルエン大神官]";
				mes "気が変わりましたか？";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[ニルエン大神官]";
				mes "すみませんが、";
				mes "パーティーリーダー以外の方は";
				mes "ご遠慮いただけますか。";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			switch(mdenter()) {
			case 0:
			default:
				mes "[ニルエン大神官]";
				mes "まだ夢の中に送る準備が";
				mes "できていません。";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
		case 3:
			mes "[ニルエン大神官]";
			mes "気が変わりましたか？";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
	case 3:
		mes "[ニルエン大神官]";
		mes "わかりました。";
		mes "また今度訪ねて来てください。";
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	}
OnInit:
	waitingroom "真昼の弦月",0; //58945
	end;
}

1@pop1.gat,50,137,3	script	教皇#1hmoon01	936,{/* 80708 */
	if(QUE1_EDDA) {
		npctalk "東へ……";
		end;
	}
	cutin "pop_sim.bmp", 2;
	mes "[教皇]";
	mes "ティルビー……";
	npctalk "ティルビー……";
	next;
	mes "[教皇]";
	mes "……";
	mes "ティルビー、いない。";
	next;
	mes "[教皇]";
	mes "……ニルエン";
	next;
	mes "[教皇]";
	mes "ニルエン……";
	mes "　";
	mes "ティルビー……";
	npctalk "ニルエン……ティルビー……";
	next;
	mes "[教皇]";
	mes "どこにいるの……？";
	npctalk "どこにいるの……？";
	next;
	mes "[教皇]";
	mes "……";
	mes "ここはとても……";
	mes "暗い……";
	npctalk "……ここはとても……暗い……";
	next;
	menu "声をかける",-;
	mes "[教皇]";
	mes "……";
	mes "　";
	mes "‐教皇はあなたを見て";
	mes "　小さくまばたきをした‐";
	next;
	select("名乗る:ニルエンの名前を出す")
	mes "[教皇]";
	mes "……"+ strcharinfo(0) +"、";
	mes "冒険者……？";
	next;
	mes "[教皇]";
	mes "……ニルエンに言われて";
	mes "来たの？";
	npctalk "……ニルエンに言われて来たの？";
	next;
	select("何をしていたのか聞く:ティルビーについて聞く")
	mes "[教皇]";
	mes "……ティルビーを探していた。";
	npctalk "……ティルビーを探していた。";
	next;
	mes "[教皇]";
	mes "ニルエンが私にくれた人形……";
	npctalk "ニルエンが私にくれた人形……";
	next;
	mes "[教皇]";
	mes "先ほどまで";
	mes "持っていたのに";
	mes "見つからない……";
	next;
	menu "自分も探す",-;
	mes "[教皇]";
	mes "もう遅い。";
	npctalk "もう遅い。";
	next;
	select("あきらめるのは早い:他の場所にあるかも")
	mes "[教皇]";
	mes "そうじゃなくて";
	mes "……約束があるんだ。";
	npctalk "そうじゃなくて……約束があるんだ。";
	next;
	menu "約束？",-;
	mes "[教皇]";
	mes "会わないといけない人がいるんだ。";
	mes "ティルビーを探していたら、";
	mes "時間になってしまった。";
	mes "そろそろ行かないと……";
	npctalk "会わないといけない人がいるんだ。";
	npctalk "ティルビーを探していたら時間になってしまった。そろそろ行かないと……";
	next;
	select("着いていく:一緒に行きます")
	mes "[教皇]";
	mes "一緒に？";
	next;
	menu "人形が外で見つかるかも",-;
	cutin "pop_nor.bmp", 2;
	mes "[教皇]";
	mes "……わかった。いいよ。";
	next;
	mes "[教皇]";
	mes strcharinfo(0) +"、";
	mes "よろしくね。";
	mes "早く行こう。";
	close2;
	cutin "pop_nor.bmp", 255;
	set QUE1_EDDA,1;
	hideoffnpc "#1hmoond01"; //80709
	misceffect 140, "#1hmoond01"; //80709
	end;
}

1@pop1.gat,63,139,0	warp	#1hmoond01	1,1,1@pop1.gat,92,143	//80709

1@pop1.gat,100,134,0	warp	#1hmoond03	1,1,1@pop1.gat,99,111	//80710

1@pop1.gat,100,142,3	script	教皇#1hmoon03	936,3,3,{/* 80711 */
	npctalk "南に……";
	hideonnpc "教皇#1hmoon03"; //80711
	end;
}

1@pop1.gat,95,99,6	script	神官#1hmoon01	935,{/* 80712 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
OnTalk:
	npctalk "教皇様だ。";
	end;
}
1@pop1.gat,104,99,4	script	神官#1hmoon02	920,{/* 80713 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
OnTalk:
	npctalk "教皇様がいらっしゃった。";
	end;
}
1@pop1.gat,93,97,6	script	信者#1hmoon01	927,{/* 80714 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
OnTalk1:
	npctalk "教皇様、お探ししました。";
	end;
OnTalk2:
	npctalk "教皇様がお部屋を抜け出したりなど、一体どこにおられたのですか。";
	end;
}
1@pop1.gat,106,97,4	script	信者#1hmoon02	917,{/* 80715 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
OnTalk:
	npctalk "教皇様。自覚ある行動をしてくださいませ。";
	end;
}
1@pop1.gat,91,95,6	script	信者#1hmoon03	926,{/* 80716 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
OnTalk:
	npctalk "教皇様。決まりを守らないことは、女神フレイヤ様を辱める行為ですよ。";
	end;
}
1@pop1.gat,108,95,4	script	信者#1hmoon04	916,{/* 80717 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
}
1@pop1.gat,91,92,6	script	信者#1hmoon05	926,{/* 80718 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
}
1@pop1.gat,108,92,4	script	信者#1hmoon06	916,{/* 80719 */
	mes "[信者]";
	mes "女神フレイヤ様の";
	mes "ご加護がありますように。";
	close;
}
1@pop1.gat,100,98,3	script	教皇#1hmoon04	936,3,3,{/* 80720 */
	end;
OnTouch:
	mes "‐教皇のもとに大勢の神官や";
	mes "　信者たちが集っている‐";
	next;
	mes "[神官]";
	mes "教皇様だ。";
	donpcevent "神官#1hmoon01::OnTalk";
	next;
	mes "[神官]";
	mes "教皇様がいらっしゃった。";
	donpcevent "神官#1hmoon02::OnTalk";
	next;
	mes "[信者]";
	mes "教皇様、お探ししました。";
	donpcevent "信者#1hmoon01::OnTalk1";
	next;
	mes "[信者]";
	mes "教皇様がお部屋を抜け出したりなど";
	mes "一体どこにおられたのですか。";
	donpcevent "信者#1hmoon01::OnTalk2";
	next;
	mes "[信者]";
	mes "教皇様。";
	mes "決まりを守らないことは";
	mes "女神フレイヤ様を辱める行為ですよ。";
	donpcevent "信者#1hmoon03::OnTalk";
	next;
	mes "[信者]";
	mes "教皇様。";
	mes "自覚ある行動を";
	mes "してくださいませ。";
	donpcevent "信者#1hmoon02::OnTalk";
	next;
	select("……","あれ？")
	close;
}
1@pop1.gat,89,103,5	script	警備兵#1hmoon01	934,{/* 80721 */}
1@pop1.gat,110,103,3	script	警備兵#1hmoon02	934,{/* 80722 */}
1@pop1.gat,96,83,5	script	警備兵#1hmoon03	934,{/* 80723 */}
1@pop1.gat,103,83,3	script	警備兵#1hmoon04	934,{/* 80724 */}
1@pop1.gat,96,80,5	script	警備兵#1hmoon05	934,{/* 80725 */}
1@pop1.gat,103,80,3	script	警備兵#1hmoon06	934,{/* 80726 */}
1@pop1.gat,96,77,5	script	警備兵#1hmoon07	934,{/* 80727 */}
1@pop1.gat,103,77,3	script	警備兵#1hmoon08	934,{/* 80728 */}
1@pop1.gat,96,74,5	script	警備兵#1hmoon09	934,{/* 80729 */}
1@pop1.gat,103,74,3	script	警備兵#1hmoon10	934,{/* 80730 */}
1@pop1.gat,96,71,5	script	警備兵#1hmoon11	934,{/* 80731 */}
1@pop1.gat,103,71,3	script	警備兵#1hmoon12	934,{/* 80732 */}
1@pop1.gat,96,68,5	script	警備兵#1hmoon13	934,{/* 80733 */}
1@pop1.gat,103,68,3	script	警備兵#1hmoon14	934,{/* 80734 */}
1@pop1.gat,99,89,7	script	警備兵#1hmoon21	934,{/* 80735 (hide)*/}
1@pop1.gat,100,82,1	script	警備兵#1hmoon22	934,{/* 80736 (hide)*/}

1@pop1.gat,96,87,7	script	警備兵#1hmoon23	934,{/* 80872 (hide)*/}
1@pop1.gat,98,87,7	script	警備兵#1hmoon24	934,{/* 80876 (hide)*/}
1@pop1.gat,101,87,1	script	警備兵#1hmoon25	934,{/* 80877 (hide)*/}
1@pop1.gat,103,87,1	script	警備兵#1hmoon26	934,{/* 80878 (hide)*/}
1@pop1.gat,96,84,7	script	警備兵#1hmoon27	934,{/* 80879 (hide)*/}
1@pop1.gat,98,84,7	script	警備兵#1hmoon28	934,{/* 80880 (hide)*/}
1@pop1.gat,101,84,1	script	警備兵#1hmoon29	934,{/* 80881 (hide)*/}
1@pop1.gat,103,84,1	script	警備兵#1hmoon30	934,{/* 80882 (hide)*/}

1@pop1.gat,100,98,3	script	教皇#1hmoon02	936,{/* 81303 (hide)*/}

1@pop1.gat,99,68,0	script	#1hmoond05	45,{/* 81528 (hide)*/}
1@pop1.gat,99,54,3	script	教皇#1hmoon05	936,{/* 81529 (hide)*/}

1@pop1.gat,100,96,3	script	教皇#1hmoon09	936,{/* 81535 (hide)*/}
1@pop1.gat,99,94,3	script	教皇#1hmoon10	936,{/* 81536 (hide)*/}
1@pop1.gat,100,92,3	script	教皇#1hmoon11	936,{/* 81537 (hide)*/}
1@pop1.gat,97,97,6	script	信者#1hmoon11	927,{/* 81538 (hide)*/}
1@pop1.gat,102,97,4	script	信者#1hmoon12	917,{/* 81539 (hide)*/}
1@pop1.gat,97,95,6	script	信者#1hmoon13	926,{/* 81540 (hide)*/}
1@pop1.gat,102,95,4	script	信者#1hmoon14	916,{/* 81541 (hide)*/}
1@pop1.gat,97,92,6	script	信者#1hmoon15	926,{/* 81542 (hide)*/}
1@pop1.gat,102,92,4	script	信者#1hmoon16	916,{/* 81543 (hide)*/}
1@pop1.gat,101,94,3	script	神官#1hmoon21	935,{/* 81544 (hide)*/}
1@pop1.gat,98,94,5	script	神官#1hmoon22	920,{/* 81545 (hide)*/}
1@pop1.gat,96,92,6	script	信者#1hmoon23	927,{/* 81546 (hide)*/}
1@pop1.gat,103,92,4	script	信者#1hmoon24	917,{/* 81547 (hide)*/}
1@pop1.gat,96,90,7	script	信者#1hmoon25	926,{/* 81548 (hide)*/}
1@pop1.gat,103,90,1	script	信者#1hmoon26	916,{/* 81549 (hide)*/}
1@pop1.gat,101,89,1	script	信者#1hmoon27	926,{/* 81550 (hide)*/}
1@pop1.gat,98,89,7	script	信者#1hmoon28	916,{/* 81551 (hide)*/}

