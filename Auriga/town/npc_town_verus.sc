// ver_eju.gat
ver_eju.gat,0,0,0,0	monster	偵察型ウェルスギア	3154,80,0,0,0
ver_eju.gat,0,0,0,0	monster	掘削型ウェルスギア	3153,25,0,0,0
// ver_conn.gat
ver_conn.gat,0,0,0,0	monster	偵察型ウェルスギア	3154,5,30000,0,0
// verus01.gat
verus01.gat,0,0,0,0	monster	スモッグ	3247,30,0,0,0
verus01.gat,0,0,0,0	monster	探査型ウェルスギア�U	3249,10,0,0,0
verus01.gat,0,0,0,0	monster	修理型ウェルスギア�U	3248,10,0,0,0
// verus02.gat
verus02.gat,0,0,0,0	monster	修理型ウェルスギア�U	3248,90,0,0,0
verus02.gat,0,0,0,0	monster	探査型ウェルスギア�U	3249,90,0,0,0
// verus03.gat
verus03.gat,0,0,0,0	monster	教団の目印	3159,40,0,0,0
verus03.gat,0,0,0,0	monster	探査型ウェルスギア	3156,80,0,0,0
verus03.gat,0,0,0,0	monster	修理型ウェルスギア	3155,45,0,0,0
verus03.gat,0,0,0,0	monster	スモッグ	3247,10,0,0,0
verus03.gat,0,0,0,0	monster	滅亡祝福教団信者	3158,10,0,0,0
// un_bunker.gat
un_bunker.gat,0,0,0,0	monster	盜蟲	1051,6,0,0,0
un_bunker.gat,0,0,0,0	monster	掘削型ウェルスギア	3153,20,0,0,0
un_bunker.gat,0,0,0,0	monster	沈痛の亡者	3255,68,0,0,0
un_bunker.gat,0,0,0,0	monster	悲痛の亡者	3256,80,0,0,0
un_bunker.gat,0,0,0,0	monster	クラップ	3250,28,0,0,0
un_bunker.gat,0,0,0,0	monster	DR815	3252,14,0,0,0
un_bunker.gat,0,0,0,0	monster	GC109	3251,10,0,0,0
un_bunker.gat,0,0,0,0	monster	黒いきのこ	1084,1,0,0,0
un_bunker.gat,0,0,0,0	monster	チョンチョン	1011,2,0,0,0


//====================================================================
// ファンタスマゴリカ
//====================================================================
moc_para01.gat,31,14,0	script	#atnevt01	139,{
	if(VER_1QUE == 0 && countitem(6219) >= 1) {	// 楽園団の証
		if((Job >= Job_RuneKnight && job <= Job_Rebellion) || (Job == Job_Summoner && BaseLevel >= 90)) {
			cutin "laime_evenor01",2;
			mes "[ライム]";
			mes "そういえば……";
			mes strcharinfo(0)+ "様、";
			mes "あの噂は聞きましたか？";
			mes "ジュピロスで見つかった";
			mes "新しい遺跡の噂です。";
			next;
			mes "[ライム]";
			mes "その遺跡で調査を行う発掘団員を";
			mes "募集しているそうですよ。";
			mes "実はそれを、私たち楽園団も";
			mes "お手伝いすることになったのです。";
			next;
			mes "[ライム]";
			mes "発掘団に興味がある楽園団メンバーに、";
			mes "私たちの団長が";
			mes "お会いしたがっているのですが……。";
			next;
			menu "団長がいたの？",-;
			cutin "laime_evenor02",2;
			mes "[ライム]";
			mes "はい、そうですよ。";
			mes "団長が珍しく";
			mes "意欲を出している仕事なので、";
			mes "興味があるようでしたら";
			mes "一度団長に会って";
			mes "話を聞いてみて下さい。";
			next;
			cutin "laime_evenor01",2;
			mes "[ライム]";
			mes "団長室は^ff00002階の一番左^000000にあります。";
			mes "よろしくお願いしますね。";
			set VER_1QUE,1;
			setquest 7607;
			close2;
			cutin "laime_evenor01",255;
			end;
		}
	}
	end;
}

moc_para01.gat,38,175,5	script	ライム#evtat01	952,{
	if(countitem(6219) < 1) {	// 楽園団の証
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "楽園団へようこそ。";
		mes "夢とロマンスを追い求める";
		mes "冒険者たちよ。";
		next;
		mes "[ライム]";
		mes "あなた達の楽園は";
		mes "恋人の温もりや、";
		mes "安らぎの子守唄でもない。";
		mes "そう、ここにあるのです。";
		next;
		cutin "laime_evenor02",2;
		mes "[ライム]";
		mes "楽園団に加入すると";
		mes "色々な依頼を受けることができます。";
		mes "興味がおありでしたら、";
		mes "一階の受付へお越しくださいね。";
		next;
		mes "‐^0000FFファンタスマゴリカ^000000は";
		if(Job < Job_RuneKnight || (Job == Job_Summoner && BaseLevel < 90)) {
			mes "　3次職業および限界突破した";
			mes "　スーパーノービス、リベリオン、";
			mes "　影狼、朧、BaseLv90以上のドラム族";
			mes "　が楽園団 01の1Fにいる^ff0000ライム^000000から";
			mes "　登録をおこない、^ff0000楽園団の証^000000を";
			mes "　入手する事で進行が可能となります‐";
		}
		else {
			mes "　楽園団 01の1Fにいる^ff0000ライム^000000から";
			mes "　登録をおこない、";
			mes "　^ff0000楽園団の証^000000を入手する事で";
			mes "　進行が可能となります‐";
		}
		close2;
		cutin "laime_evenor02",255;
		end;
	}
	switch(VER_1QUE) {
	case 0:
		if(Job < Job_RuneKnight || (Job == Job_Summoner && BaseLevel < 90)) {
			cutin "laime_evenor02",2;
			mes "[ライム]";
			mes "そこの真ん中の部屋が";
			mes "私の部屋なので、";
			mes "私もよくここに来ます。";
			next;
			mes "‐^0000FFファンタスマゴリカ^000000は";
			mes "　3次職業および限界突破した";
			mes "　スーパーノービス、";
			mes "　影狼、朧、リベリオン、";
			mes "　BaseLv90以上のドラム族のみ";
			mes "　開始することができるクエストです‐";
			close2;
			cutin "laime_evenor02",255;
			end;
		}
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "そういえば……";
		mes strcharinfo(0)+ "様、";
		mes "あの噂は聞きましたか？";
		mes "ジュピロスで見つかった";
		mes "新しい遺跡の噂です。";
		next;
		mes "[ライム]";
		mes "その遺跡で調査を行う発掘団員を";
		mes "募集しているそうですよ。";
		mes "実はそれを、私たち楽園団も";
		mes "お手伝いすることになったのです。";
		next;
		mes "[ライム]";
		mes "発掘団に興味がある楽園団メンバーに、";
		mes "私たちの団長が";
		mes "お会いしたがっているのですが……。";
		next;
		menu "団長がいたの？",-;
		cutin "laime_evenor02",2;
		mes "[ライム]";
		mes "はい、そうですよ。";
		mes "団長が珍しく";
		mes "意欲を出している仕事なので、";
		mes "興味があるようでしたら";
		mes "一度団長に会って";
		mes "話を聞いてみて下さい。";
		next;
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "団長室は^ff00002階の一番左^000000にあります。";
		mes "よろしくお願いしますね。";
		set VER_1QUE,1;
		setquest 7607;
		close2;
		cutin "laime_evenor01",255;
		end;
	case 1:
	case 2:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "団長が待っていますよ。";
		mes "団長室は^ff0000この階の一番左^000000にあります。";
		mes "よろしくお願いしますね。";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 3:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "団長との話は";
		mes "うまくいったみたいですね。";
		mes "それではお客様が待っていますから、";
		mes "一緒に中央の部屋へ行きましょう。";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 4:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "私はここで支援の用意をして";
		mes "お待ちしています。";
		mes "発掘調査で支援が必要になった場合は";
		mes "声をかけてくださいね。";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 37:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "発掘作業は順調のようですね。";
		mes "　";
		mes "必要でしたらウェルスシティまで";
		mes "お送りしましょうか？";
		next;
		if(select("ウェルスシティに行く","やめる") == 2) {
			mes "[ライム]";
			mes "行かないんですね。";
			mes "わかりました。";
			close2;
			cutin "laime_evenor01",255;
			end;
		}
		mes "[ライム]";
		mes "それではお送りします。";
		mes "いってらっしゃい〜。";
		close2;
		cutin "laime_evenor01",255;
		warp "verus04.gat",142,188;
		end;
	default:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "発掘作業は順調のようですね。";
		mes "アトナド博士が興味を見せた物は";
		mes "レッケンベル社でも";
		mes "注目されるはずなので、";
		mes "いい評価が出ますよ。";
		next;
		mes "[ライム]";
		mes "博士達が研究に集中する事ができるのは";
		mes strcharinfo(0) + "様のおかげです。";
		mes "これからもよろしくお願いします！";
		close2;
		cutin "laime_evenor01",255;
		end;
	}
OnInit:
	waitingroom "ファンタスマゴリカ",0;
	end;
}

moc_para01.gat,174,165,3	script	ライム#atnd02	952,{
	switch(VER_1QUE) {
	case 0:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "ここは私の部屋なので";
		mes "勝手に入らないでください。";
		mes "休む場所が必要なら";
		mes "別の部屋を利用して下さい。";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 1:
	case 2:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "団長は隣の部屋にいます。";
		mes "この部屋の左です。";
		mes "まず団長に会ってきてください。";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 3:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes strcharinfo(0)+ "様、";
		mes "いらっしゃいましたね。こちらです。";
		mes "この方はアトナド発掘団所属の";
		mes "考古学者アウレス様です。";
		next;
		mes "[ライム]";
		mes "アウレス様、彼女が";
		mes "ファンタスマゴリカプロジェクトの";
		mes "発掘作業に協力する、";
		mes strcharinfo(0)+ "です。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "おお……はじめましてアウレスです。";
		mes "志願してくれてありがとう。";
		mes "君のような若者が協力してくれるとは";
		mes "なんとも心強い。";
		next;
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "団長との話は";
		mes "うまくいったみたいですね？";
		mes "今回の依頼内容は、";
		mes "アウレス様が所属する";
		mes "アトナド発掘団に協力することです。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "私たちももう歳ですしね……。";
		mes "楽園団のみなさんが";
		mes "助けてくださらなかったら";
		mes "私たちはただ入口を見るだけで";
		mes "終わってたかもしれません。";
		next;
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "アウレス様……。";
		mes "あなた方ほど経験豊かな方たちは";
		mes "この大陸中探しても";
		mes "なかなかいらっしゃらないでしょう。";
		next;
		mes "[ライム]";
		mes "あなた方の活動や研究は";
		mes "素晴らしいものだと思います。";
		mes "私たちでそのお手伝いができるのは";
		mes "光栄な事だと思っていますよ。";
		mes "いずれにしてもアトナド博士は……";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "アトナド……か。";
		mes "ええ、確かにアトナド博士は偉大です。";
		mes "それに博士の娘さんも。";
		next;
		mes "[アウレス]";
		mes "しかし彼らは……。";
		mes "良く言えば意志が強く、";
		mes "悪く言えばわがままだ。";
		next;
		mes "[アウレス]";
		mes "家を出たまま長い間連絡もせず";
		mes "研究に没頭し続ける父と、";
		mes "その父の消息が途切れたと言って";
		mes "家や財産を処分して父と決別し、";
		mes "奔放に生きる事を選んだ娘。";
		next;
		mes "[アウレス]";
		mes "自分のやりたい事に忠実というか。";
		mes "血筋なんでしょうね……。";
		mes "私はいつも彼らに振り回されています。";
		mes "もちろん、尊敬もしていますがね。";
		next;
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "……そうですね。しかし、";
		mes "過去はどうであれ、今こうやって";
		mes "私たちがあなたのお手伝いができるのは";
		mes "その娘の奔放さがあったからこそです。";
		next;
		switch(select("詳しい話が気になる","簡単に説明してほしい")) {
		case 1:
			cutin "verus_aures",0;
			mes "[アウレス]";
			mes "ライム君が私たちを訪ねてきた時、";
			mes "あなたたち楽園団が";
			mes "なぜ私たちのような発掘団を";
			mes "手伝ってくれるのか";
			mes "不思議だったのです。";
			next;
			mes "[アウレス]";
			mes "きっと私たち……いや、父親が";
			mes "困っているのを知った、";
			mes "娘の心遣いだったのでしょう……。";
			next;
			menu "父親？　娘？",-;
			cutin "laime_evenor03",2;
			mes "[ライム]";
			mes "ナイル団長から聞いていませんか？";
			mes "アトナド発掘団の団長は、";
			mes "ナイル団長のお父様なのです。";
			next;
			mes "[ライム]";
			mes "私が団長に今回の仕事を提案した時、";
			mes "発掘作業には";
			mes "アトナド発掘団が参加しているから、";
			mes "そこに楽園団員を参加させなさいと";
			mes "団長が指示したんです。";
			next;
			cutin "laime_evenor04",2;
			mes "[ライム]";
			mes "しかし話を進めていくうちに";
			mes "二人の仲の悪さが";
			mes "支障になってきて……。";
			mes "少し困っている状態です。";
			next;
			cutin "verus_aures",0;
			mes "[アウレス]";
			mes "そうなんです。";
			mes "イアン……アトナドの名前なのですが、";
			mes "彼も最初は楽園団の手助けに";
			mes "喜んでいたのです。";
			next;
			mes "[アウレス]";
			mes "しかし、楽園団の団長が";
			mes "ナイル……娘だという事を知った途端、";
			mes "手助けは受けたくない！　と。";
			next;
			break;
		case 2:
			cutin "laime_evenor03",2;
			mes "[ライム]";
			mes "私たちが手伝う";
			mes "アトナド発掘団の団長は、";
			mes "ナイル団長のお父様なのです。";
			next;
			mes "[ライム]";
			mes "私が団長に今回の仕事を提案した時、";
			mes "発掘作業には";
			mes "アトナド発掘団が参加しているから、";
			mes "そこに楽園団員を参加させなさいと";
			mes "団長が指示したんです。";
			next;
			cutin "laime_evenor04",2;
			mes "[ライム]";
			mes "しかし話を進めていくうちに";
			mes "二人の仲の悪さが";
			mes "支障になってきて……。";
			mes "少し困っている状態です。";
			next;
			cutin "verus_aures",0;
			break;
		}
		mes "[アウレス]";
		mes "しかし既にレッケンベル社に";
		mes "参加人数や規模を報告してしまったし、";
		mes "一刻も早く人数を集めて、";
		mes "調査に向かわねばならない状態です。";
		next;
		mes "[アウレス]";
		mes "今さら参加を辞退することはできない。";
		mes "そこで貴方にあの二人の仲を";
		mes "仲介しつつ、発掘の手伝いをして";
		mes "いただきたいのです。";
		mes "私やライム君の説得では、";
		mes "聞く耳を持たないでしょうから。";
		next;
		cutin "laime_evenor04",2;
		mes "[ライム]";
		mes "今回の事をきっかけとして";
		mes "お二人が和解してくださればと";
		mes "思うのですが……。";
		mes "さあ、この話はここまでにして、";
		mes "まずは現場に行きましょう。";
		next;
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "アウレス様とはルークが護衛として";
		mes "一緒に現地へ行きます。";
		mes strcharinfo(0) + "様は";
		mes "いつでもお好きな時間に";
		mes "現地へ向かってください。";
		next;
		mes "[ライム]";
		mes "作業を行う場所は、";
		mes "^ff0000ウェルスシティ^000000という街だそうです。";
		mes "ウェルスシティへは";
		mes "ジュピロスから行けるそうですので、";
		mes "まずはジュピロスの入口へ";
		mes "向かってください。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "レッケンベル社が";
		mes "大々的に宣伝しているから、";
		mes "道に迷う心配はないと思います。";
		mes "それでは、現地で会いましょう。";
		next;
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "現地に着いたら登録を行ってください。";
		mes "個人的に仕事を受けても構いませんが、";
		mes "アトナド発掘団所属ということで";
		mes "仕事をしていただければ助かります。";
		next;
		mes "[ライム]";
		mes "出発の準備が整っているようでしたら、";
		mes "ジュピロスの入口まで";
		mes "お送りします。";
		mes "目的地まではモンスターに";
		mes "遭遇する事もありますので、";
		mes "準備を怠らないでくださいね。";
		next;
		if(select("断る","送ってもらう") == 1) {
			mes "[ライム]";
			mes "そうですか。";
			mes "準備が整ったら声をかけてくださいね。";
			mes "ジュピロスの入口まで";
			mes "お送りしますよ。";
			set VER_1QUE,4;
			delquest 7608;
			setquest 7609;
			close2;
			cutin "laime_evenor01",255;
			end;
		}
		mes "[ライム]";
		mes "わかりました。";
		mes "ジュピロスの入口は";
		mes "光の柱の先にあります。";
		mes "それではお送りしますね。";
		mes "お気をつけて！";
		set VER_1QUE,4;
		delquest 7608;
		setquest 7609;
		close2;
		cutin "laime_evenor01",255;
		warp "yuno_fild07.gat",217,176;
		end;
	case 4:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "作業を行うウェルスシティへは";
		mes "ジュピロスから行けるそうですので、";
		mes "まずはジュピロスの入口へ";
		mes "向かってください。";
		mes "現地に行けば、関係者を";
		mes "すぐにみつける事ができるはずです。";
		next;
		mes "[ライム]";
		mes "出発の準備が整っているようでしたら、";
		mes "ジュピロスの入口まで";
		mes "お送りします。";
		mes "目的地まではモンスターに";
		mes "遭遇する事もありますので、";
		mes "準備を怠らないでくださいね。";
		next;
		if(select("断る","送ってもらう") == 1) {
			mes "[ライム]";
			mes "そうですか。";
			mes "準備が整ったら声をかけてくださいね。";
			mes "ジュピロスの入口まで";
			mes "お送りしますよ。";
			close2;
			cutin "laime_evenor01",255;
			end;
		}
		mes "[ライム]";
		mes "わかりました。";
		mes "それではお送りしますね。";
		mes "お気をつけて！";
		close2;
		cutin "laime_evenor01",255;
		warp "yuno_fild07.gat",217,176;
		end;
	default:
		cutin "laime_evenor02",2;
		mes "[ライム]";
		mes "発掘作業の状況はどうですか？";
		mes "楽園団の評価が良くなるよう、";
		mes "しっかり仕事をこなしてくださいね。";
		mes "人脈を広げ、楽園団が有名になる事が";
		mes "今回の仕事の";
		mes "もう一つの目的でもあるのですから。";
		close2;
		cutin "laime_evenor01",255;
		end;
	}
}

moc_para01.gat,172,164,5	script	考古学者アウレス#atnd02	10057,{
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "その方はお客さまです。";
		mes "大事な話をしているので、";
		mes "申し訳ありませんが";
		mes "席を外してください。";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 3:
		cutin "laime_evenor01",2;
		mes "[ライム]";
		mes "その方はお客さまです。";
		mes "団長と話をしてきたようですね。";
		mes "では私が詳しい話をしましょう。";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 4:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "私は一足先に";
		mes "ウェルスシティへ向かいますね。";
		mes "それではまた、現地で会いましょう。";
		close2;
		cutin "verus_aures",255;
		end;
	default:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "君も来ていたのですね。";
		mes "私もここには頻繁に訪れていますよ。";
		mes "たまにあの子の顔が";
		mes "見たくなるものでね……。";
		next;
		mes "[アウレス]";
		mes "何度も現地と往復をしているので";
		mes "ルーク君には年寄のわがままを";
		mes "聞いてもらっています。";
		mes "それではまた、現地で会いましょう。";
		close2;
		cutin "verus_aures",255;
		end;
	}
}

moc_para01.gat,178,167,3	script	ルークラフェズ#atnd03	953,{
	if(VER_1QUE < 4) {
		cutin "looke_rapez04",0;
		mes "[ルーク]";
		mes "おい。ライム。";
		mes "お客様だぞ……。";
		close2;
		cutin "looke_rapez04",255;
		end;
	}
	else if(VER_1QUE == 4) {
		cutin "looke_rapez04",0;
		mes "[ルーク]";
		mes "……。";
		mes "……特に話すことは無い。";
		close2;
		cutin "looke_rapez04",255;
		end;
	}
	else {
		cutin "looke_rapez03",0;
		mes "[ルーク]";
		mes "……。";
		close2;
		cutin "looke_rapez03",255;
		end;
	}
}

moc_para01.gat,17,187,0		warp	#warp_2_bossroom	1,1,moc_para01.gat,132,159
moc_para01.gat,132,156,0	warp	#warp_2_2fhall_1	1,1,moc_para01.gat,17,185
moc_para01.gat,29,187,0		warp	#warp_2_room1		1,1,moc_para01.gat,180,159
moc_para01.gat,180,156,0	warp	#warp_2_2fhall_2	1,1,moc_para01.gat,29,185

moc_para01.gat,133,170,4	script	団長アルクイエン#e152a1	951,{
	switch(VER_1QUE) {
	case 0:
		cutin "Arquien_n_atnad02",2;
		mes "[団長アルクイエン]";
		mes "誰だ？　誰だか知らないが、";
		mes "勝手に立ち入らないでくれ。";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 1:
		cutin "Arquien_n_atnad01",2;
		mes "[団長アルクイエン]";
		mes "君が" +strcharinfo(0)+ "か？";
		mes "よくきてくれたね。";
		next;
		mes "[団長アルクイエン]";
		mes "まずは私の自己紹介をしようか。";
		mes "私が楽園団の設立者で団長の";
		mes "アルクイエン・ナイル・アトナドだ。";
		mes "名前が長く複雑だから、";
		mes "ナイルと呼んでくれ。";
		next;
		switch(select("呼ばれた理由を聞く","ミドルネーム？")) {
		case 1:
			cutin "Arquien_n_atnad03",2;
			mes "[ナイル]";
			mes "ほう、本題にそのまま入るか。";
			mes "仕事熱心な奴は歓迎だ。";
			mes "最近、世間に出回っている噂話で";
			mes "一番大きなものが何か知っているか？";
			break;
		case 2:
			mes "[ナイル]";
			mes "幼い時に母親が";
			mes "付けてくれたものだ……。";
			next;
			mes "[ナイル]";
			mes "これ以上は私的な話になるから";
			mes "他の事に興味を持ったらどうだ？";
			mes "例えば最近噂になっている事とかだ。";
			break;
		}
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "察したか？　そうだ。";
		mes "ジュピロスの拡張調査の話だ。";
		next;
		mes "[ナイル]";
		mes "私たちが知っている情報はこれだ。";
		mes "ジュピロス地域にて新しい通路が";
		mes "ひとつ発見されたらしい。";
		next;
		mes "[ナイル]";
		mes "驚くことに発見された通路の先には、";
		mes "ジュピロスと繋がってはいるが";
		mes "全く違う未知の遺跡があったそうだ。";
		mes "今回の発掘団の目的は、";
		mes "その発見された未知の遺跡の調査だ。";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "プロジェクト名をなんと言ったかな……";
		mes "そうだ、";
		mes "^4d4dffファンタスマゴリカプロジェクト^000000だ。";
		mes "発掘団の募集と後援の主催は";
		mes "リヒタルゼンのレッケンベル社が";
		mes "行うそうだ。";
		next;
		menu "それで？",-;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "ふむ……大して興味がないようだな？";
		mes "それじゃここでやめようか？";
		mes "ライムが推薦していた奴だから";
		mes "それなりに準備していたのだが。";
		next;
		if(select("続けて下さい","やめよう") == 2) {
			cutin "Arquien_n_atnad02",2;
			mes "[ナイル]";
			mes "まあ、興味がないなら仕方がない。";
			mes "ライムには改めて";
			mes "他の人を推薦してくれと頼むか。";
			mes "時間を取らせてすまなかったな。";
			mes "もう行っていいぞ。";
			set VER_1QUE,2;
			close2;
			cutin "Arquien_n_atnad02",255;
			end;
		}
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "そうしよう。実は私たちは";
		mes "そのファンタスマゴリカプロジェクトの";
		mes "発掘に、参加をすることを";
		mes "決めたんだ。";
		next;
		mes "[ナイル]";
		mes "正しくは、参加する人材を";
		mes "斡旋するというのが";
		mes "私たちの仕事だが。";
		mes "これまでの仕事を通じて";
		mes "君達のような冒険者との人脈はあるし、";
		mes "人材紹介にかけては楽園団はプロだ。";
		next;
		mes "[ナイル]";
		mes "できる仕事は";
		mes "なんでもやっていかないとね。";
		mes "楽園団もこのままずっと";
		mes "モロクにいるつもりはないからな。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "それにあのレッケンベル社からの";
		mes "直々の要請だ。";
		mes "人材が大量に必要だから仲介を頼むと";
		mes "言われたら、受けるのがプロだろう？";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "悪い提案ではない。正直いい機会だ。";
		mes "人を紹介して私たちは金を受け取る、";
		mes "君は仕事をして金をもらう。";
		next;
		menu "そのプロジェクトに参加しろと？",-;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "そういうことだ。";
		mes "基本的には遺跡発掘作業に参加する事が";
		mes "今回の仕事内容だ。";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "もし君が発掘団に参加してくれるなら、";
		mes "ひとつ、仕事中に";
		mes "確認して欲しい事がある。";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "現在、";
		mes "ファンタスマゴリカプロジェクトには";
		mes "いくつかの発掘団と組織が参加している。";
		mes "その中で君は、";
		mes "ライムが紹介する発掘団で";
		mes "仕事をすることになる。";
		next;
		mes "[ナイル]";
		mes "その発掘団で仕事をしながら";
		mes "^ff0000団長のイアンに";
		mes "最後の探査について聞いてみてくれ。^000000";
		mes "ちなみに仕事についての詳しい話は";
		mes "ライムが説明してくれる。";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "ライムは隣の部屋だ。";
		mes "何かわかったら私に報告するように。";
		mes "他人には漏らすなよ。";
		mes "それでは、頼んだぞ。";
		set VER_1QUE,3;
		delquest 7607;
		setquest 7608;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 2:
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "どうした、興味が湧いてきたのか？";
		next;
		if(select("そうだ","違う") == 2) {
			cutin "Arquien_n_atnad01",2;
			mes "[ナイル]";
			mes "そうか。好きにするといい。";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "それでは話を続けようか。";
		mes "実は私たちは";
		mes "そのファンタスマゴリカプロジェクトの";
		mes "発掘に参加しようと考えているのだ。";
		next;
		mes "[ナイル]";
		mes "正しくは、参加する人材を";
		mes "斡旋するというのが私たちの仕事だが。";
		mes "これまでの仕事を通じて";
		mes "君達のような冒険者との人脈はあるし、";
		mes "人材紹介にかけては楽園団はプロだ。";
		next;
		mes "[ナイル]";
		mes "できる仕事は";
		mes "なんでもやっていかないとね。";
		mes "楽園団もこのままずっと";
		mes "モロクにいるつもりはないから。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "それにあのレッケンベル社からの";
		mes "直々の要請だ。";
		mes "人材が大量に必要だから仲介を頼むと";
		mes "言われたら、受けるのがプロだろう？";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "悪い提案ではない。正直いい機会だ。";
		mes "人を紹介して私たちは金を受け取る、";
		mes "君は仕事をして金をもらう。";
		next;
		menu "そのプロジェクトに参加しろと？",-;
		mes "[ナイル]";
		mes "そういうことだ。";
		mes "基本的には遺跡発掘作業に参加することが";
		mes "今回の仕事内容だ。";
		next;
		mes "[ナイル]";
		mes "もし君が発掘団に参加してくれるなら、";
		mes "ひとつ、仕事中に";
		mes "確認して欲しい事がある。";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "現在、";
		mes "ファンタスマゴリカプロジェクトには";
		mes "いくつかの発掘団と組織が参加している。";
		mes "その中で君は、";
		mes "ライムが紹介する発掘団で";
		mes "仕事をすることになる。";
		next;
		mes "[ナイル]";
		mes "その発掘団で仕事をしながら";
		mes "^ff0000団長のイアンに";
		mes "最後の探査について聞いてみてくれ。^000000";
		mes "ちなみに仕事についての詳しい話は";
		mes "ライムが説明してくれる。";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "ライムは隣の部屋だ。";
		mes "何かわかったら私に報告するように。";
		mes "他人には漏らすなよ。";
		mes "それでは、頼んだぞ。";
		set VER_1QUE,3;
		delquest 7607;
		setquest 7608;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 3:
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "すぐ隣の部屋でライムが待っている。";
		mes "詳しい事は彼に聞いてくれ。";
		close2;
		cutin "Arquien_n_atnad04",255;
		end;
	case 4:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "仕事を引き受けてくれたそうだな。";
		mes "だったら早く作業に取り掛かるといい。";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "私の代わりに";
		mes "あの博士が何をしているのか";
		mes "そういうのをしっかり見てきなさい。";
		next;
		mes "[ナイル]";
		mes "さあ、早く行くんだ。";
		close2;
		cutin "Arquien_n_atnad04",255;
		end;
	case 22:
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "どうした、";
		mes strcharinfo(0)+ "じゃないか。";
		mes "報告ならルークから聞いている。";
		mes "結構頑張っているらしいな！";
		next;
		mes "[ナイル]";
		mes "君のお蔭で、楽園団と";
		mes "アトナド発掘団の評価は上々だ。";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "それで今日はどうしたんだ？";
		mes "最後の探査に関して";
		mes "何か分かったのか？";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "違うのか？";
		mes "なに？　親父に頼まれた？";
		mes "何をだ？";
		next;
		menu "レコードプレイヤーを貸してほしい",-;
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "ふむ……レコードプレイヤー？";
		mes "そうだな、見覚えはある。";
		mes "しかし……あの親父、そういう事だけは";
		mes "しっかり覚えてるんだな。";
		mes "アイツらしいと言えばそうだが。";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "レコードプレイヤーをよこせ？";
		mes "返事はノーだ。";
		set VER_1QUE,23;
		delquest 7644;
		setquest 118205;
		close2;
		cutin "Arquien_n_atnad04",255;
		end;
	case 23:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "なんだまだいたのか。";
		mes "レコードプレイヤーの件なら";
		mes "何度来ても同じだ。";
		next;
		mes "[ナイル]";
		mes "あの親父、こういう時だけ";
		mes "私を頼って、調子が良すぎるんだ。";
		mes "そもそもあんな古臭い機械、";
		mes "何に使うんだ？";
		next;
		menu "今までの話を詳しく話す",-;
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "ふむ……";
		mes "メモリーレコード……か。";
		mes "それの内容を知るために、";
		mes "レコードプレイヤーが必要という訳か。";
		next;
		mes "[ナイル]";
		mes "……。";
		mes "……そうだな……";
		cutin "Arquien_n_atnad01",2;
		next;
		mes "[ナイル]";
		mes "わかった。";
		mes "調査のために必要という事なら、";
		mes "少々不本意だが協力しよう。";
		mes "あの親父に恩を売る";
		mes "チャンスかもしれんしな。";
		next;
		mes "[ナイル]";
		mes "あの親父が、曾祖父の残したものだと";
		mes "大切に保管していたのは";
		mes "知っていたから、";
		mes "とりあえず家を処分する時に";
		mes "持っては来ていたのだが、";
		mes "こんなところで役に立つとはな。";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "しかしその前に";
		mes "そのメモリーレコードと言うものを";
		mes "見せて欲しい。";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "これがメモリーレコードか？";
		mes "なるほど、レコードプレイヤーに";
		mes "入りそうな形をしているな。";
		mes "ところでこれは";
		mes "どこで見つけたんだ？";
		next;
		mes "[ナイル]";
		mes "残念だけどこのメモリーレコードは";
		mes "ひとつだけじゃ動かないみたいだ。";
		mes "再生するには2個、必要だと思う。";
		mes "恐らく誰かがわざと";
		mes "分割しておいたものなんだろう。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "そうだな……";
		mes "それじゃあこうしよう。";
		mes "私がこのレコードプレイヤーを持って";
		mes "発掘地に行く。";
		next;
		mes "[ナイル]";
		mes "その間、君は残りのメモリーレコードを";
		mes "集めて来るんだ。";
		mes "きっと他にもいくつか";
		mes "近くにあるはずだ。";
		next;
		mes "[ナイル]";
		mes "いいな？";
		mes "君は君のやるべきことをやるんだ。";
		mes "それじゃあ";
		mes "ウェルスシティで会おう。";
		set VER_1QUE,24;
		delquest 118205;
		setquest 7645;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 24:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "^ff0000メモリーレコードを2個";
		mes "集めてくればいい。^000000";
		mes "最初のメモリーレコードを";
		mes "見つけた場所の近くに";
		mes "きっとあるはずだ。";
		next;
		mes "[ナイル]";
		mes "ウェルスシティへ戻るのなら";
		mes "送ってやるぞ。";
		next;
		if(select("もう少しここにいる","送ってもらう") == 1) {
			mes "[ナイル]";
			mes "なんだ？　まだここに居るのか？";
			mes "用事があるなら";
			mes "さっさと終わらせて、";
			mes "仕事に戻るんだ。";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		mes "[ナイル]";
		mes "わかった。";
		mes "では、送ろう。";
		next;
		mes "[ナイル]";
		mes "君は君のやるべきことをやるんだ。";
		mes "それじゃあ、";
		mes "ウェルスシティで会おう。";
		close2;
		cutin "Arquien_n_atnad01",255;
		warp "verus04.gat",142,188;
		end;
	case 37:
		cutin "Arquien_n_atnad01.bmp", 2;
		mes "[ナイル]";
		mes "……別に気になるから";
		mes "直接行く訳ではないぞ。";
		mes "私も忙しい身なんだ。";
		close2;
		cutin "Arquien_n_atnad01.bmp", 255;
		end;
	default:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "おや、" + strcharinfo(0) + "か。";
		mes "どうだ発掘団の仕事は、";
		mes "うまくこなせているか？";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	}
}

ver_eju.gat,114,40,4	script	管理者ミシェル#atnd05	868,{
	if(VER_1QUE < 4) {
		mes "[管理者ミシェル]";
		mes "どこの発掘団の所属ですか？";
		next;
		mes "[管理者ミシェル]";
		mes "……所属していない？";
		mes "個人登録や推薦は？";
		next;
		mes "[管理者ミシェル]";
		mes "……ないようですね。";
		mes "支援団体の推薦や、";
		mes "登録されている発掘団がないなら";
		mes "発掘作業はできません。";
		next;
		mes "[管理者ミシェル]";
		mes "そうですね……";
		mes "^ff0000楽園団^000000で発掘団の団員を";
		mes "募集していると聞きました。";
		mes "発掘作業に興味があるなら";
		mes "一度行ってみると良いでしょう。";
		next;
		mes "[管理者ミシェル]";
		mes "興味があるようでしたら";
		mes "楽園団へお送りしますが、";
		mes "どうしますか？";
		next;
		if(select("断る","送ってもらう") == 1) {
			mes "[管理者ミシェル]";
			mes "そうですか。";
			next;
			mes "[管理者ミシェル]";
			mes "さあ、危険ですので";
			mes "関係ない方は";
			mes "ここから離れてください。";
			close;
		}
		mes "[管理者ミシェル]";
		mes "わかりました。";
		mes "それではお送りしますね。";
		close2;
		warp "moc_para01.gat",28,29;
		end;
	}
	else if(VER_1QUE == 4) {
		if(checkquest(7611)) {
			mes "[管理者ミシェル]";
			mes "発掘地へ向かう道中、";
			mes "^ff0000偵察型ウェルスギア^000000を^ff000010体^000000、";
			mes "倒しながら進んでください。";
			mes "よろしくお願いします。";
			next;
			mes "‐外郭トンネルのモンスター討伐の";
			mes "　報告は、発掘団参加登録の後に";
			mes "　行うことできます。";
			mes "　参加登録は^ff0000ウェルス発掘地^000000にいる";
			mes "　^ff0000受付ナラ^000000から、";
			mes "　登録することができます‐";
			close;
		}
		mes "[管理者ミシェル]";
		mes "おや、あなたは？";
		mes "ファンタスマゴリカプロジェクトの";
		mes "発掘調査志願者ですか？";
		mes "お名前は？";
		next;
		menu "名乗る",-;
		mes "[管理者ミシェル]";
		mes strcharinfo(0) + "さんですね。";
		mes "名簿を確認します。お待ちください。";
		next;
		mes "[管理者ミシェル]";
		mes "……はい、確かに";
		mes "ご連絡いただいています。";
		mes "楽園団からいらした方ですね。";
		next;
		mes "[管理者ミシェル]";
		mes "ようこそ、ウェルスシティへ。";
		mes "ファンタスマゴリカプロジェクトへの";
		mes "ご参加、ありがとうございます。";
		mes "発掘地はこのトンネルの向こうです。";
		mes "中に入ると総合指揮所があるので";
		mes "そこで正式な登録をしてください。";
		next;
		mes "[管理者ミシェル]";
		mes "あなたにひとつ";
		mes "お願いしたい事があるのですが……。";
		mes "ここから発掘地へ向かう途中、";
		mes "道中にいるモンスターを倒しながら";
		mes "進んでもらいたいのです。";
		next;
		mes "[管理者ミシェル]";
		mes "^ff0000偵察型ウェルスギア^000000というモンスターが";
		mes "厄介で、研究者のような戦えない者達が";
		mes "なかなか先へ進めず困っているのです。";
		next;
		mes "[管理者ミシェル]";
		mes "ですので、貴方のような";
		mes "戦闘経験の豊富な冒険者に";
		mes "発掘地へ向かう道中、";
		mes "討伐に協力してもらえるよう";
		mes "お願いをしています。";
		next;
		mes "[管理者ミシェル]";
		mes "^ff0000偵察型ウェルスギア^000000を^ff000010体^000000、";
		mes "倒しながら進んでください。";
		mes "よろしくお願いします。";
		next;
		mes "[管理者ミシェル]";
		mes "討伐が終わったら報告をしてください。";
		mes "報告は、私か総合指揮所にいる";
		mes "ルイスに報告してくださいね。";
		mes "報告は発掘団の登録の後に";
		mes "受け付けます。";
		mes "それではよろしくお願いします。";
		next;
		mes "‐外郭トンネルのモンスター討伐の";
		mes "　報告は、発掘団参加登録の後に";
		mes "　行うことできます。";
		mes "　参加登録は^ff0000ウェルス発掘地^000000にいる";
		mes "　^ff0000受付ナラ^000000から、";
		mes "　登録することができます‐";
		setquest 7611;
		close;
	}
	else {
		mes "[管理者ミシェル]";
		mes "こんにちは。";
		mes "作業の進捗はいかがですか？";
		set '@str$,"モンスター討伐　(^FF0000デイリークエスト^000000)";
		if(checkquest(7611)) {
			if(checkquest(7611) & 0x4)
				set '@str$,"モンスター討伐　(^FF0000報酬受け取り可能^000000)";
			else
				set '@str$,"モンスター討伐　(^FF0000受注中^000000)";
		}
		else if(checkquest(7612)) {
			if(checkquest(7612) & 0x2)
				set '@str$,"モンスター討伐　(^FF0000クエスト受注可能^000000)";
		}
		next;
		switch(select('@str$,"話をする","立ち去る")) {
		case 1:
			if(checkquest(7611)) {
				if(checkquest(7611) & 0x4 == 0) {
					mes "[管理者ミシェル]";
					mes "外郭トンネルにいる、";
					mes "^ff0000偵察型ウェルスギア^000000というモンスターが";
					mes "厄介で、研究者のような戦えない者達が";
					mes "なかなか先へ進めず困っているのです。";
					next;
					mes "[管理者ミシェル]";
					mes "発掘地へ向かう道中、";
					mes "^ff0000偵察型ウェルスギア^000000を^ff000010体^000000、";
					mes "倒しながら進んでください。";
					next;
					mes "[管理者ミシェル]";
					mes "討伐が終わったら報告をしてください。";
					mes "報告は、私か総合指揮所にいる";
					mes "ルイスに報告してくださいね。";
					mes "それではよろしくお願いします。";
					close;
				}
				if(checkitemblank() == 0) {
					mes "‐アイテムの種類数が多くて";
					mes "　持つことができない。";
					mes "　種類数を減らしてから受け取ろう‐";
					close;
				}
				mes "[管理者ミシェル]";
				mes "偵察型ウェルスギアを";
				mes "倒してくださったみたいですね。";
				mes "ありがとうございます。";
				mes "また討伐に協力してもらえると";
				mes "助かります。";
				chgquest 7611,7612;
				getitem 6961,3;
				close;
			}
			if(checkquest(7612)) {
				if(checkquest(7612) & 0x2 == 0) {
					mes "[管理者ミシェル]";
					mes "偵察型ウェルスギアを";
					mes "倒してくださったみたいですね。";
					mes "ありがとうございます。";
					mes "また少し時間をおいて";
					mes "協力してもらえると助かります。";
					close;
				}
				mes "[管理者ミシェル]";
				mes "今日も協力していただけるのですか？";
				mes "あなたには^ff0000偵察型ウェルスギア^000000の討伐を";
				mes "お願いしたいのですが……。";
				next;
				if(select("手伝う","断る") == 2){
					mes "[管理者ミシェル]";
					mes "そうですか、残念です……。";
					mes "また気が向いたら";
					mes "よろしくお願いしますね。";
					close;
				}
				mes "[管理者ミシェル]";
				mes "ありがとうございます。";
				mes "討伐が終わったら、";
				mes "私か総合指揮所にいる";
				mes "ルイスに報告してくださいね。";
				mes "それではお気をつけて。";
				setquest 7611;
				close;
			}
		case 2:
			mes "[管理者ミシェル]";
			mes "発掘団のみなさんのご協力に";
			mes "感謝しています。";
			mes "調査の進捗は、";
			mes "指揮長のルイスに報告してくださいね。";
			close;
		case 3:
			mes "[管理者ミシェル]";
			mes "お疲れ様です。";
			close;
		}
	}
}

ver_eju.gat,116,43,5	script	レッケンベル傭兵#atd01	482,{
	switch(rand(3)) {
	case 0: unittalk "レッケンベル傭兵 : ……。"; break;
	case 1: unittalk "レッケンベル傭兵 : ……気を付けて下さい。"; break;
	case 2: unittalk "レッケンベル傭兵 : きりが無い……。"; break;
	}
	end;
}

ver_eju.gat,125,40,1	script	レッケンベル傭兵#atd02	884,{
	switch(rand(3)) {
	case 0: unittalk "レッケンベル傭兵 : 少し休みたいな……。"; break;
	case 1: unittalk "レッケンベル傭兵 : 増援はないのか？"; break;
	case 2: unittalk "レッケンベル傭兵 : 懲りない奴め！"; break;
	}
	end;
}

ver_eju.gat,117,35,7	script	レッケンベル傭兵#atd03	484,{
	switch(rand(3)) {
	case 0: unittalk "レッケンベル傭兵 : 退屈……。"; break;
	case 1: unittalk "レッケンベル傭兵 : 気を付けて下さい。"; break;
	case 2: unittalk "レッケンベル傭兵 : 発掘団員は外郭トンネルに移動して下さい。"; break;
	}
	end;
}

ver_eju.gat,15,151,3	script	レッケンベル警護員	868,{
	mes "[レッケンベル警護員]";
	mes "発掘地まで行かれるのですか？";
	mes "では、この道をまっすぐ行った後、";
	mes "最初の十字路を南、次のT字路は東へ。";
	mes "その後道なりに進んで、最初の";
	mes "曲がり角を南に、道なりに進めば";
	mes "大丈夫ですよ。";
	next;
	mes "[レッケンベル警護員]";
	mes "もし私の案内で分からない場合は";
	mes "地図に印をつけておきますから、";
	mes "印を頼りに、進んで下さいね。";
	viewpoint 1,113,36,0,0x4DFF00;
	next;
	mes "[レッケンベル警護員]";
	mes "では……";
	mes "モンスターが出没しているとの";
	mes "情報がありますので、お気をつけて！";
	close;
}

juperos_01.gat,48,243,5	script	レッケンベル警護員	868,{
	mes "[レッケンベル警護員]";
	mes "ファンタスマゴリカプロジェクトの";
	mes "発掘地まで行きますか？";
	mes "道が複雑なので";
	mes "注意して進んでくださいね。";
	next;
	mes "[レッケンベル警護員]";
	mes "ここから東側にまっすぐ行った後、";
	mes "道に沿って南の方に少しおりると";
	mes "端の方に大きな銅像があります。";
	mes "銅像を目指していただければ";
	mes "発掘地まで辿り着けます。";
	viewpoint 1,242,87,0,0x4DFF00;
	next;
	mes "[レッケンベル警護員]";
	mes "モンスターが出没しているとの";
	mes "情報がありますので、お気をつけて！";
	close;
}

juperos_01.gat,242,91,3	script	レッケンベル警護員	868,{
	mes "[レッケンベル警護員]";
	mes "ファンタスマゴリカプロジェクトの";
	mes "発掘地まで行きますか？";
	mes "この入口は";
	mes "ジュピロス廃墟東側の入口になります。";
	next;
	mes "[レッケンベル警護員]";
	mes "こちらの入口から入ると";
	mes "そこに道案内人がいるので、";
	mes "その者が発掘地までの道を";
	mes "案内してくれるはずです。";
	next;
	mes "[レッケンベル警護員]";
	mes "モンスターが出没しているとの";
	mes "情報がありますので、お気をつけて！";
	close;
}

verus04.gat,182,168,5	script	受付ナラ#atnd06	893,{
	if(VER_1QUE < 4) {
		mes "[ナラ]";
		mes "こんにちは。";
		mes "ファンタスマゴリカプロジェクト、";
		mes "発掘団受付です。";
		mes "推薦状か所属している";
		mes "発掘団はありますか？";
		next;
		mes "[ナラ]";
		mes "……どちらも無いようですね。";
		mes "登録された発掘団へ加入するか、";
		mes "推薦状をもらって来ていただければ";
		mes "受付ができますよ。";
		next;
		if(select("今すぐ登録がしたい","後でまた来る") == 2) {
			mes "[ナラ]";
			mes "わかりました。";
			mes "登録された発掘団へ加入するか、";
			mes "推薦状をもらって来てくださいね。";
			mes "お待ちしています！";
			close;
		}
		mes "[ナラ]";
		mes "困りましたね。";
		mes "支援団体の推薦や、";
		mes "登録されている発掘団がないなら";
		mes "発掘作業はできません。";
		next;
		mes "[ナラ]";
		mes "知っている発掘団や";
		mes "推薦を貰えそうな機関はありませんか？";
		mes "ないのであれば、";
		mes "^ff0000楽園団^000000へ行ってみてはいかがでしょう。";
		next;
		mes "[ナラ]";
		mes "楽園団はこの";
		mes "ファンタスマゴリカプロジェクトの";
		mes "発掘に協力してくれています。";
		mes "きっと発掘団に参加する方法を";
		mes "教えてくれるでしょう。";
		next;
		mes "[ナラ]";
		mes "楽園団へ行くのでしたら";
		mes "お送りしますよ。";
		next;
		if(select("断る","送ってもらう") == 1) {
			mes "[ナラ]";
			mes "そうですか。";
			close;
		}
		mes "[ナラ]";
		mes "わかりました。";
		mes "それではお送りしますね。";
		close2;
		warp "moc_para01.gat",28,29;
		end;
	}
	else if(VER_1QUE == 4) {
		mes "[ナラ]";
		mes "こんにちは。";
		mes "ファンタスマゴリカプロジェクト、";
		mes "発掘団受付です。";
		mes "推薦状か所属している";
		mes "発掘団はありますか？";
		next;
		menu "楽園団から来た",-;
		mes "[ナラ]";
		mes "楽園団からいらした方ですね。";
		mes strcharinfo(0) + "さん……";
		mes "はい、確認できました。";
		next;
		mes "[ナラ]";
		mes "所属している発掘団の名前を";
		mes "教えていただけますか？";
		next;
		menu "アトナド発掘団",-;
		mes "[ナラ]";
		mes "アトナド……";
		mes "確認できました。";
		mes "これで登録は完了です。";
		next;
		mes "[ナラ]";
		mes "業務の内容についてご説明しますね。";
		mes "ここでの作業は";
		mes "基本的に各発掘団の団長の指示に従い、";
		mes "進めていただければ問題ありません。";
		next;
		mes "[ナラ]";
		mes "また、総合指揮所で案内している仕事を";
		mes "個人で請け負っていただくことも";
		mes "可能です。";
		next;
		mes "[ナラ]";
		mes "特異事項が発生しましたら";
		mes "その都度お知らせします。";
		mes "もし、怪我をしたり治療が必要な場合は";
		mes "指揮所の医師から";
		mes "治療を受けることができます。";
		next;
		mes "[ナラ]";
		mes "レッケンベル社が責任を持って";
		mes "みなさんをサポートしておりますので";
		mes "ご安心下さい。";
		mes "それではお気をつけて。";
		mes "大きな成果を期待しています。";
		set VER_1QUE,5;
		chgquest 7609,7610;
		close;
	}
	else if(VER_1QUE == 5) {
		mes "[ナラ]";
		mes "登録は完了していますので、";
		mes "どうぞ、作業に取り掛かってください。";
		next;
		mes "[ナラ]";
		mes "作業の報告などは";
		mes "指揮長であるルイスさんに";
		mes "報告してくださいね。";
		next;
		mes "[ナラ]";
		mes "それではお気をつけて。";
		mes "大きな成果を期待しています。";
		close;
	}
	else {
		mes "[ナラ]";
		mes "今日も頑張っていますね。";
		mes "ご苦労さまです〜！";
		close;
	}
}

verus04.gat,179,165,5	script	指揮長ルイス#atnd07	868,{/* 59257 */
	if(VER_1QUE < 5) {
		mes "[ルイス]";
		mes "正式登録がされていないようです。";
		mes "受付で登録手続きを行ってから";
		mes "また来てください。";
		close;
	}
	mes "[ルイス]";
	mes "アトナド発掘団所属の方ですね。";
	mes "どうされましたか？";
	if(VER_1QUE == 12 || VER_1QUE >= 17)
		set '@str$,"成果報告　(^FF0000ストーリークエスト^000000)";
	else
		set '@str$,"成果報告　(^FF0000デイリークエスト^000000)";
	next;
	switch(select('@str$,"モンスター討伐　(デイリークエスト)","会話をする")) {
	case 1:
		if(VER_1QUE <= 11) {
			mes "[ルイス]";
			mes "成果報告ですか？";
			mes "報告はアトナド発掘団長の印が押された";
			mes "成果報告書を作成して提出して下さい。";
			next;
			mes "[ルイス]";
			mes "準備が出来たら声をかけてくださいね。";
			mes "おまちしています。";
			next;
			mes "‐成果報告書提出は";
			mes "　^0000FF凝集されたエネルギー収集^000000と";
			mes "　^0000FFアトナドの依頼^000000を完了し、";
			mes "　^FF0000両方のクエストの時間制限中にのみ^000000、";
			mes "　アウレスから受ける事ができます‐";
			close;
		}
		if(VER_1QUE == 12) {
			mes "[ルイス]";
			mes "成果報告書の提出ですか。";
			mes "ふむ……";
			mes "コアに対する研究を中心に";
			mes "行ったようですね。";
			next;
			mes "[ルイス]";
			mes "会長はアトナド発掘団に";
			mes "とても興味を持っています。";
			mes "発掘作業がある程度進んだら";
			mes "きっといいことがあると思います。";
			next;
			mes "[ルイス]";
			mes "お疲れ様でした。";
			mes "では次回も期待していますよ。";
			next;
			mes "[ルイス]";
			mes "おや？　待って下さい。";
			mes "……アトナド発掘団キャンプから";
			mes "連絡が来たようです。";
			next;
			mes "[ルイス]";
			mes "ふむ……。";
			mes strcharinfo(0) + "というのは";
			mes "あなたですか？";
			mes "アトナド発掘団の団長、イアン氏より";
			mes "急いで戻るようにとの連絡です。";
			mes "早く行ってみて下さい。";
			set VER_1QUE,13;
			delitem 6748,1;
			setquest 7623;
			delquest 7617;
			close;
		}
		if(VER_1QUE >= 17) {
			if(checkquest(7617)) {
				mes "[ルイス]";
				mes "成果報告書の提出ですか。";
				mes "ふむ……";
				mes "今回もコアに対する研究を中心に";
				mes "行ったようですね。";
				next;
				mes "[ルイス]";
				mes "会長はアトナド発掘団に";
				mes "とても興味を持っています。";
				mes "発掘作業がある程度進んだら";
				mes "きっといいことがあると思います。";
				next;
				if(checkitemblank() == 0) {
					mes "‐アイテムの種類数が多くて";
					mes "　持つことができない。";
					mes "　種類数を減らしてから受け取ろう‐";
					close;
				}
				mes "[ルイス]";
				mes "今日もお疲れ様でした。";
				mes "では次回も期待していますよ。";
				delitem 6748,1;
				setquest 7618;
				delquest 7617;
				getitem 6962,4;
				close;
			}
			if(checkquest(7618)) {
				mes "[ルイス]";
				mes "アトナド発掘団の調査内容は";
				mes "上層部でも好評ですよ。";
				mes "次回も期待しています。";
				close;
			}
			mes "[ルイス]";
			mes "成果報告ですか？";
			mes "報告はアトナド発掘団長の印が押された";
			mes "成果報告書を作成して提出して下さい。";
			next;
			mes "[ルイス]";
			mes "準備が出来たら声をかけてくださいね。";
			mes "おまちしています。";
			next;
			mes "‐成果報告書提出は";
			mes "　^0000FF凝集されたエネルギー収集^000000と";
			mes "　^0000FFアトナドの依頼^000000を完了し、";
			mes "　^FF0000両方のクエストの時間制限中にのみ^000000、";
			mes "　アウレスから受ける事ができます‐";
			close;
		}
		mes "[ルイス]";
		mes "アトナド発掘団の成果は";
		mes "素晴らしいですね。";
		next;
		mes "[ルイス]";
		mes "他の学者や発掘家たちの";
		mes "表面的な調査に対して、";
		mes "アトナド発掘団は技術的な部分に";
		mes "注目しているからかも知れませんね。";
		next;
		mes "[ルイス]";
		mes "この件はすぐに会長に報告して";
		mes "アトナド発掘団がさらに大きな恩恵を";
		mes "受けられるように話してみます。";
		mes "それでは次の結果を";
		mes "楽しみにしています。";
		close;
	case 2:
		mes "[ルイス]";
		mes "モンスターの討伐を";
		mes "手伝っていただけるのですか？";
		mes "どちらの地域のモンスター討伐を";
		mes "受けていただけますか？";
		set '@str1$,"外郭トンネル　(^FF0000クエスト受注可能^000000)";
		set '@str2$,"中央広場　(^FF0000クエスト受注可能^000000)";
		if(checkquest(7611)) {
			if(checkquest(7611) & 0x4)
				set '@str1$,"外郭トンネル　(^FF0000報酬受け取り可能^000000)";
			else
				set '@str1$,"外郭トンネル　(^FF0000受注中^000000)";
		}
		if(checkquest(7612)) {
			if(checkquest(7612) & 0x2)
				set '@str1$,"外郭トンネル　(^FF0000クエスト受注可能^000000)";
			else
				set '@str1$,"外郭トンネル";
		}
		if(checkquest(7613)) {
			if(checkquest(7613) & 0x4)
				set '@str2$,"中央広場　(^FF0000報酬受け取り可能^000000)";
			else
				set '@str2$,"中央広場　(^FF0000受注中^000000)";
		}
		if(checkquest(7614)) {
			if(checkquest(7614) & 0x2)
				set '@str2$,"中央広場　(^FF0000クエスト受注可能^000000)";
			else
				set '@str2$,"中央広場";
		}
		next;
		switch(select('@str1$,'@str2$,"やめる")) {
		case 1:
			if(checkquest(7611)) {
				if(checkquest(7611) & 0x4 == 0) {
					mes "[ルイス]";
					mes "助かります！";
					mes "外郭トンネルにいる、";
					mes "^ff0000偵察型ウェルスギア^000000というモンスターを";
					mes "^ff000010体^000000倒してきてください。";
					mes "研究者のような戦えない者達が";
					mes "なかなか先へ進めず困っているのです。";
					next;
					mes "[ルイス]";
					mes "討伐が終わったら";
					mes "私か、東のウェルス外郭トンネルを";
					mes "抜けた先にいる";
					mes "管理者ミシェルに報告してください。";
					mes "それではよろしくお願いします。";
					close;
				}
				if(checkitemblank() == 0) {
					mes "‐アイテムの種類数が多くて";
					mes "　持つことができない。";
					mes "　種類数を減らしてから受け取ろう‐";
					close;
				}
				mes "[ルイス]";
				mes "偵察型ウェルスギアを";
				mes "倒してくださったみたいですね。";
				mes "ありがとうございます。";
				mes "また討伐に協力してもらえると";
				mes "助かります。";
				setquest 7612;
				delquest 7611;
				getitem 6961,3;
				close;
			}
			if(checkquest(7612)) {
				if(checkquest(7612) & 0x2 == 0) {
					mes "[ルイス]";
					mes "外郭トンネルのモンスター討伐は";
					mes "他の傭兵たちが対応してます。";
					mes "今日はゆっくり休んでください。";
					close;
				}
				delquest 7612;
				mes "[ルイス]";
				mes "ありがとうございます。";
				mes "それでは必要な書類をそろえますので、";
				mes "協力してもらえるのなら、";
				mes "準備を整えて";
				mes "もう一度私に話しかけてください。";
				close;
			}
			mes "[ルイス]";
			mes "外郭トンネルのモンスターが急増して";
			mes "手に負えず困っていたところです。";
			mes "討伐を手伝っていただけませんか？";
			next;
			if(select("引き受ける","断る") == 2) {
				mes "[ルイス]";
				mes "そうですか……。";
				mes "残念です。";
				close;
			}
			mes "[ルイス]";
			mes "助かります！";
			mes "外郭トンネルにいる、";
			mes "^ff0000偵察型ウェルスギア^000000というモンスターを";
			mes "^ff000010体^000000倒してきてください。";
			mes "研究者のような戦えない者達が";
			mes "なかなか先へ進めず困っているのです。";
			next;
			mes "[ルイス]";
			mes "討伐が終わったら";
			mes "私か、東のウェルス外郭トンネルを";
			mes "抜けた先にいる";
			mes "管理者ミシェルに報告してください。";
			mes "それではよろしくお願いします。";
			setquest 7611;
			close;
		case 2:
			if(checkquest(7613)) {
				if(checkquest(7613) & 0x4 == 0) {
					mes "[ルイス]";
					mes "中央広場にいる、";
					mes "^ff0000修理型ウェルスギア^000000というモンスターと";
					mes "^ff0000探査型ウェルスギア^000000というモンスターが";
					mes "厄介で、研究者のような戦えない者達が";
					mes "調査を進められず困っているのです。";
					next;
					mes "[ルイス]";
					mes "そこであなたに";
					mes "^ff0000修理型ウェルスギア^000000を^ff000015体^000000、";
					mes "^ff0000探査型ウェルスギア^000000を^ff000015体^000000";
					mes "倒していただきたいのです。";
					next;
					mes "[ルイス]";
					mes "討伐が終わったら";
					mes "私に報告をしてください。";
					mes "それではよろしくお願いします。";
					close;
				}
				mes "[ルイス]";
				mes "修理型ウェルスギアと";
				mes "探査型ウェルスギアを";
				mes "倒してくださったみたいですね。";
				mes "ありがとうございます。";
				mes "また討伐に協力してもらえると";
				mes "助かります。";
				setquest 7614;
				delquest 7613;
				getitem 6961,10;
				close;
			}
			if(checkquest(7614)) {
				if(checkquest(7614) & 0x2 == 0) {
					mes "[ルイス]";
					mes "中央広場のモンスター討伐は";
					mes "他の傭兵たちが対応してます。";
					mes "今日はゆっくり休んでください。";
					close;
				}
				delquest 7614;
				mes "[ルイス]";
				mes "ありがとうございます。";
				mes "それでは必要な書類をそろえますので、";
				mes "協力してもらえるのなら、";
				mes "準備を整えて";
				mes "もう一度私に話しかけてください。";
				close;
			}
			mes "[ルイス]";
			mes "中央広場のモンスターが急増して";
			mes "手に負えず困っていたところです。";
			mes "討伐を手伝っていただけませんか？";
			next;
			if(select("引き受ける","断る") == 2) {
				mes "[ルイス]";
				mes "そうですか……。";
				mes "残念です。";
				close;
			}
			mes "[ルイス]";
			mes "助かります！";
			mes "中央広場にいる、";
			mes "^ff0000修理型ウェルスギア^000000と";
			mes "^ff0000探査型ウェルスギア^000000を";
			mes "^ff000015体ずつ^000000倒してきてください。";
			next;
			mes "[ルイス]";
			mes "研究者のような戦えない者達が";
			mes "なかなか先へ進めず困っているのです。";
			mes "討伐が終わったら";
			mes "私に報告をしてください。";
			mes "それではよろしくお願いします。";
			setquest 7613;
			close;
		}
	case 3:
		mes "[ルイス]";
		mes "アトナド発掘団の成果は";
		mes "素晴らしいですね。";
		mes "レッケンベル社でも好評ですよ。";
		next;
		mes "[ルイス]";
		mes "そうそう、";
		mes "何か新しいものをを発見したら";
		mes "すぐ教えてくださいね。";
		close;
	}
}

verus04.gat,117,252,5	script	治療師ミヨ#atnd08	641,{/* 59258 */
	mes "[ミヨ]";
	mes "こんにちは。お疲れ様です。";
	mes "体調はいかがですか？";
	if(VER_1QUE < 5) {
		set '@str$,"完全回復　^0000FF5000Zeny^000000　(通常料金)";
		set '@cost,5000;
	}
	else {
		set '@str$,"完全回復　^0000FF4500Zeny^000000　(割引料金)";
		set '@cost,4500;
	}
	next;
	if(select('@str$,"スマイル〜") == 2) {
		mes "[ミヨ]";
		mes "スマイル〜!!";
		close;
	}
	if(Zeny < '@cost) {
		mes "[ミヨ]";
		mes "完全回復ですね！";
		mes "正式登録をしている発掘団員さんには";
		mes "割引していますよ！";
		mes "笑ったらすべての病気が治ります。";
		mes "スマイル〜！";
		next;
		mes "[ミヨ]";
		mes "……って、あれ？";
		mes "お金が足りないみたいですよ？";
		close;
	}
	if(VER_1QUE < 5) {
		mes "[ミヨ]";
		mes "完全回復ですね！";
		mes "笑ったらすべての病気が治ります。";
		mes "スマイル〜！";
	}
	else {
		mes "[ミヨ]";
		mes "完全回復ですね！";
		mes "正式登録をしている発掘団員さんには";
		mes "割引していますよ！";
		mes "笑ったらすべての病気が治ります。";
		mes "スマイル〜！";
	}
	//npcskillsupport
	percentheal 100,100;
	set Zeny,Zeny-'@cost;
	close;
}
verus04.gat,141,193,5	script	考古学者アウレス#atnd09	10057,{/* 59259 */
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
		mes "‐学者が何かに熱中している。";
		mes "　邪魔してはならない雰囲気だ‐";
		close;
	case 4:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "おお、来たのですね！";
		mes "待っていましたよ。";
		mes "まずはあちらの総合指揮所に行って";
		mes "登録をしてきてください。";
		next;
		mes "[アウレス]";
		mes "話はしてありますから、";
		mes "あなたは本人確認だけすれば良いです。";
		mes "登録が済んだら";
		mes "また私の所に来てください。";
		next;
		mes "[アウレス]";
		mes "アトナド発掘団のメンバーを";
		mes "紹介しますよ。";
		close2;
		cutin "verus_aures",255;
		end;
	case 5:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "登録は済ませましたね？";
		mes "さあ、こちらへ。";
		mes "彼がアトナド発掘団の団長、";
		mes "イアン・アトナドです。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "……お前がアウレスの言う手伝いか。";
		mes "こんなガキに……。";
		mes "手伝いなどいらん。帰れ。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "まだそんな事を……";
		mes "年寄りだけで作業が思うように";
		mes "進まない事くらい、";
		mes "貴方もわかっているでしょう？";
		next;
		mes "[アウレス]";
		mes "貴方だけの問題ではなく、";
		mes "アトナド発掘団全体の問題なのですよ。";
		mes "わがままは控えてください。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "フン。何がわがままだ。";
		mes "……おい、ガキ。";
		mes "お前は私の娘に頼まれて";
		mes "私を監視しに来たのか？";
		next;
		if(select("発掘の協力をしにきた","仲を取り持ちにきた","なんの事だかわからない") == 2) {
			cutin "verus_ian03",2;
			mes "[イアン・アトナド]";
			mes "余計なお世話だ！";
			mes "アウレス、お前の考えることなど";
			mes "このアトナドにはお見通しなんだよ。";
			next;
			mes "[イアン・アトナド]";
			mes "おい、そこのお前。";
			mes "発掘の仕事ではなく、";
			mes "そんなくだらない仕事をしに来たやつは";
			mes "いらんぞ。帰るんだな。";
			next;
			cutin "verus_aures",0;
			mes "[アウレス]";
			mes "まあまあ。私はともかく、";
			mes "わざわざお手伝いに来てくれた方に";
			mes "そのような言い方は失礼ですよ。";
			mes "発掘の手伝いはお願いしましょう？";
			next;
		}
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……フン、まあいい。";
		mes "それじゃ今すぐ仕事をさせてやる。";
		mes "どれほどの働きをするのか見てやろう。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "やれやれ……。";
		mes "では" + strcharinfo(0) + "さん、";
		mes "改めてよろしくお願いしますね。";
		mes "少し危険な仕事もありますが、";
		mes "あなたなら問題ないでしょう。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "余計なことは言わんでいい。";
		mes "……お前はこっちだ。来い。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "いや、気難しい団長で申し訳ない。";
		mes "まずは彼の話を聞いてみてください。";
		set VER_1QUE,6;
		delquest 7610;
		setquest 118200;
		close2;
		cutin "verus_aures",255;
		end;
	case 6:
	case 7:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "イアンは口調がきついので";
		mes "よく誤解をされるのですが、";
		mes "内心、あなたが来てくれて";
		mes "嬉しいはずです。";
		mes "ただ、初対面だと恥ずかしいので";
		mes "意地をはっているのでしょう。";
		close2;
		cutin "verus_aures",255;
		end;
	case 8:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "お疲れ様です。調子はどうですか？";
		mes "もし時間があるようなら、";
		mes "私の頼みを聞いてほしいのですが……。";
		next;
		mes "[アウレス]";
		mes "実はこのアトナド発掘団には";
		mes "もう一人メンバーがいるのです。";
		mes "^4d4dffロイド^000000という名の若者です。";
		mes "発掘地の調査をするため、";
		mes "ウェルス中央広場に行っています。";
		next;
		mes "[アウレス]";
		mes "あの辺りは危険なので、";
		mes "ルーク君が一緒に行ってくれています。";
		mes "だから大丈夫だとは思うのですが、";
		mes "少し時間がかかりすぎています。";
		next;
		mes "[アウレス]";
		mes "作業進捗も確認したいですし……";
		mes "ですので、あなたにロイドの様子と";
		mes "作業の進捗を確認しに行って";
		mes "いただきたいのです。";
		next;
		mes "[アウレス]";
		mes "お願いできますか？";
		mes "ウェルス中央広場には";
		mes "モンスターも居るので危険です。";
		mes "気を付けて行ってきてください。";
		set VER_1QUE,9;
		delquest 7619;
		setquest 7620;
		close2;
		cutin "verus_aures",255;
		end;
	case 9:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "ロイドはウェルス中央広場の";
		mes "どこかにいるはずです。";
		mes "ルーク君と一緒にいると思うので、";
		mes "ルーク君を探してみると";
		mes "良いかもしれません。";
		next;
		mes "[アウレス]";
		mes "よろしくお願いしますね。";
		close2;
		cutin "verus_aures",255;
		end;
	case 10:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "ロイドはどうでした？";
		mes "おや、彼の仕事を";
		mes "手伝っているのですね？";
		next;
		mes "[アウレス]";
		mes "こんな雑用のような仕事まで";
		mes "手伝っていただいて……。";
		mes "本当にありがとうございます。";
		close2;
		cutin "verus_aures",255;
		end;
	case 11:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "おかえりなさい。";
		mes "ロイドは大丈夫そうですね。";
		mes "お手間を取らせました。";
		mes "ありがとうございます。";
		next;
		mes "[アウレス]";
		mes "そうだ、あなたにこれを。";
		mes "あなたの報告を待っている間に";
		mes "この成果報告書を作成しました。";
		next;
		mes "[アウレス]";
		mes "指揮所の指揮長ルイス氏に";
		mes "これを届けてください。";
		mes "成果報告書を提出すれば、";
		mes "報酬を受け取ることができます。";
		next;
		if(checkitemblank() == 0) {
			mes "[アウレス]";
			mes "アイテムの種類数が多くて";
			mes "持つことができないようです。";
			mes "種類数を減らしてから";
			mes "もう一度きてください。";
			close2;
			cutin "verus_aures.bmp", 255;
			end;
		}
		mes "[アウレス]";
		mes "ルイス氏は";
		mes "このウェルス発掘地の入口にいます。";
		mes "頼みましたよ。";
		set VER_1QUE,12;
		delquest 7622;
		setquest 7617;
		getitem 6748,1;
		close2;
		cutin "verus_aures",255;
		end;
	case 12:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "あなたが持っているその成果報告書を";
		mes "指揮所のルイス氏に渡してください。";
		mes "きっと報告を待っていると思います。";
		next;
		mes "[アウレス]";
		mes "ルイス氏は";
		mes "このウェルス発掘地の入口にいます。";
		mes "頼みましたよ。";
		close2;
		cutin "verus_aures",255;
		end;
	case 13:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "成果報告書を";
		mes "渡してくださったようですね。";
		mes "ありがとうございます。";
		mes "お疲れのようですし、";
		mes "少し休んではいかがですか？";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……おい、お前。";
		mes "まだやる事があるぞ。";
		mes "休んでる暇などない。";
		mes "すぐに来い。";
		close2;
		cutin "verus_aures",255;
		end;
	case 14:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "……やれやれ。";
		mes "あなたには苦労をかけっぱなしだ。";
		mes "申し訳ないが、";
		mes "もうひとふんばり頼みますね。";
		next;
		mes "[アウレス]";
		mes "そうだ、苦労ついでに";
		mes "手が空いたらで構わないので";
		mes "ロイドやルーク君の仕事も";
		mes "手伝ってほしいのですが……。";
		next;
		mes "[アウレス]";
		mes "調査には人手が必要ですし。";
		mes "直接彼らに手伝うことがないか";
		mes "きいてみてください。";
		next;
		mes "[アウレス]";
		mes "彼らは私たちとは違って若者だから、";
		mes "あなたとも話が合うでしょう。";
		mes "なにか困ったら彼らに";
		mes "相談してみても良いでしょうね。";
		close2;
		cutin "verus_aures",255;
		end;
	case 15:
	case 16:
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "またイアンのわがままですか……。";
		mes "苦労をかけますね……。";
		close2;
		cutin "verus_aures",255;
		end;
	default:
		if(checkquest(7617)) {
			cutin "verus_aures",0;
			mes "[アウレス]";
			mes "あなたが持っているその成果報告書を";
			mes "指揮所のルイス氏に渡してください。";
			mes "きっと報告を待っていると思います。";
			next;
			mes "[アウレス]";
			mes "ルイス氏は";
			mes "このウェルス発掘地の入口にいます。";
			mes "頼みましたよ。";
			close2;
			cutin "verus_aures",255;
			end;
		}
		if(checkquest(7618)) {
			if(checkquest(7618) & 0x2 == 0) {
				cutin "verus_aures",0;
				mes "[アウレス]";
				mes "成果報告書を";
				mes "渡してくださったようですね。";
				mes "ありがとうございます。";
				next;
				mes "[アウレス]";
				mes "成果報告書は度々作成するので、";
				mes "その都度ルイス氏に提出しています。";
				mes "次の成果報告書も出来上がったら";
				mes "届けていただければ助かります。";
				next;
				cutin "verus_aures",255;
				mes "‐成果報告書提出は";
				mes "　^0000FF凝集されたエネルギー収集^000000と";
				mes "　^0000FFアトナドの依頼^000000を完了し、";
				mes "　^FF0000両方のクエストの時間制限中にのみ^000000、";
				mes "　アウレスから受ける事ができます‐";
				close2;
				cutin "verus_aures",255;
				end;
			}
			cutin "verus_aures",0;
			delquest 7618;
			mes "[アウレス]";
			mes "イアンから聞きましたよ。";
			mes "あなたがこの稼働制御装置を";
			mes "集めてきてくださったそうですね。";
			mes "稼働制御装置の研究が終わったら、";
			mes "また成果報告書を作成しますよ。";
			next;
			cutin "verus_aures",255;
			mes "‐成果報告書提出は";
			mes "　^0000FF凝集されたエネルギー収集^000000と";
			mes "　^0000FFアトナドの依頼^000000を完了し、";
			mes "　^FF0000両方のクエストの時間制限中にのみ^000000、";
			mes "　アウレスから受ける事ができます‐";
			close;
		}
		if(checkquest(7616) && checkquest(7629)) {
			if(checkquest(7616) & 0x2 == 0 && checkquest(7629) & 0x2 == 0) {
				cutin "verus_aures",0;
				mes "[アウレス]";
				mes "ちょうど良いところに！";
				mes "あなたが集めてきてくださった";
				mes "この稼働制御装置のお蔭で";
				mes "少しばかりですが研究が進みました。";
				next;
				mes "[アウレス]";
				mes "ロイドが研究中の資料も";
				mes "一緒にまとめて、";
				mes "新しい成果報告書を作成しましたよ。";
				next;
				if(checkitemblank() == 0) {
					mes "[アウレス]";
					mes "アイテムの種類数が多くて";
					mes "持つことができないようです。";
					mes "種類数を減らしてから";
					mes "もう一度きてください。";
					close2;
					cutin "verus_aures.bmp", 255;
					end;
				}
				mes "[アウレス]";
				mes "さあこれを。";
				mes "指揮所のルイス氏に渡してください。";
				mes "きっと報告を待っていると思います。";
				mes "よろしくお願いしますね。";
				setquest 7617;
				getitem 6748,1;
				close2;
				cutin "verus_aures",255;
				end;
			}
		}
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "稼働制御装置については";
		mes "主にイアンが研究しています。";
		mes "それを動かす動力源については、";
		mes "ロイドが研究しています。";
		next;
		mes "[アウレス]";
		mes "私は二人の研究のまとめと";
		mes "文書の整理をやっています。";
		mes "これが結構な作業量で、";
		mes "多くの時間を費やしているのです。";
		next;
		mes "[アウレス]";
		mes "あなたには色々手伝っていただいて、";
		mes "とても感謝しています。";
		mes "これからもよろしくお願いします。";
		close2;
		cutin "verus_aures",255;
		end;
	}
}

verus04.gat,144,193,3	script	イアン・アトナド#atnd09	10056,{
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
		// TODO
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……邪魔だ。";
		next;
		mes "‐^0000FFファンタスマゴリカ^000000は";
		mes "　3次職業および限界突破した";
		mes "　スーパーノービス、リベリオン、";
		mes "　影狼、朧、BaseLv90以上のドラム族";
		mes "　が^ff0000楽園団の証^000000を所持した状態で";
		mes "　楽園団 01の2Fにいる^ff0000ライム^000000から";
		mes "　開始することができるクエストです‐";
		next;
		mes "‐^ff0000楽園団の証^000000は";
		mes "　楽園団 01の1Fにいる^ff0000ライム^000000から";
		mes "　楽園団の登録をおこなう事で";
		mes "　入手が可能です‐";
		close2;
		cutin "verus_ian01",255;
		end;
	case 5:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "なんだ、お前は。";
		mes "さっきから邪魔ばっかりしおって。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "イアン！";
		mes "この若者が、先日話した";
		mes "私たちに協力しにきてくれた人なんだ。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……お前がアウレスの言う手伝いか。";
		mes "こんなガキに……。";
		mes "手伝いなどいらん。帰れ。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "まだそんな事を……";
		mes "年寄りだけで作業が思うように";
		mes "進まない事くらい、";
		mes "貴方もわかっているでしょう？";
		next;
		mes "[アウレス]";
		mes "貴方だけの問題ではなく、";
		mes "アトナド発掘団全体の問題なのですよ。";
		mes "わがままは控えてください。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "フン。何がわがままだ。";
		mes "……おい、ガキ。";
		mes "お前は私の娘に頼まれて";
		mes "私を監視しに来たのか？";
		next;
		if(select("発掘の協力をしにきた","仲を取り持ちにきた","なんの事だかわからない") == 2) {
			cutin "verus_ian03",2;
			mes "[イアン・アトナド]";
			mes "余計なお世話だ！";
			mes "アウレス、お前の考えることなど";
			mes "このアトナドにはお見通しなんだよ。";
			next;
			mes "[イアン・アトナド]";
			mes "おい、そこのお前。";
			mes "発掘の仕事ではなく、";
			mes "そんなくだらない仕事をしに来たやつは";
			mes "いらんぞ。帰るんだな。";
			next;
			cutin "verus_aures",0;
			mes "[アウレス]";
			mes "まあまあ。私はともかく、";
			mes "わざわざお手伝いに来てくれた方に";
			mes "そのような言い方は失礼ですよ。";
			mes "発掘の手伝いはお願いしましょう？";
			next;
		}
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……フン、まあいい。";
		mes "それじゃ今すぐ仕事をさせてやる。";
		mes "どれほどの働きをするのか見てやろう。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "やれやれ……。";
		mes "では" + strcharinfo(0) + "さん、";
		mes "改めて、彼がアトナド発掘団の";
		mes "団長、イアン・アトナドです。";
		next;
		mes "[アウレス]";
		mes "来ていただいて感謝します。";
		mes "少し危険な仕事もありますが、";
		mes "あなたなら問題ないでしょう。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "余計なことは言わんでいい。";
		mes "……お前はこっちだ。来い。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "いや、気難しい団長で申し訳ない。";
		mes "まずは彼の話を聞いてみてください。";
		set VER_1QUE,6;
		chgquest 7610,118200;
		close2;
		cutin "verus_aures",255;
		end;
	case 6:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "手伝うと言ったからには";
		mes "それなりの仕事ができるんだろうな？";
		mes "期待外れだったらすぐ帰らせるからな。";
		next;
		mes "[イアン・アトナド]";
		mes "ここから少し北に行くと";
		mes "広場のような場所がある。";
		mes "そこには高度な文明の";
		mes "機械がいくつかあるはずだ。";
		next;
		mes "[イアン・アトナド]";
		mes "その機械の動力源の装置を";
		mes "私たちは^ff0000稼働制御装置^000000と呼んでいる。";
		mes "機械を調査してその稼働制御装置を";
		mes "^ff00002個^000000持って来い。";
		next;
		mes "[イアン・アトナド]";
		mes "いいか？　^ff0000稼働制御装置^000000を";
		mes "^ff00002個^000000集めてくるんだぞ。";
		mes "お前がどれほど仕事が出来るか見てやる。";
		set VER_1QUE,7;
		delquest 118200;
		setquest 118201;
		close2;
		cutin "verus_ian01",255;
		end;
	case 7:
		if(countitem(6749) < 2) {
			cutin "verus_ian01",2;
			mes "[イアン・アトナド]";
			mes "いいか？　^ff0000稼働制御装置^000000を";
			mes "^ff00002個^000000集めてくるんだぞ。";
			mes "お前がどれほど仕事が出来るか見てやる。";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……ふん。集めてきたようだな。";
		mes "これは研究に使う大事なものだ。";
		mes "さっさと出せ。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "言われたことはできるようだな。";
		mes "お前の実力がどの程度か";
		mes "見ておいてやろう。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "とりあえず今は用は無い。";
		mes "アウレスの所にでも行って";
		mes "仕事を手伝うんだな。";
		set VER_1QUE,8;
		delitem 6749,2;
		delquest 118201;
		setquest 7619;
		close2;
		cutin "verus_ian03",255;
		end;
	case 8:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……私はまだお前を信じてはいない。";
		mes "契約があるから";
		mes "仕方なくここに置いているだけだ。";
		mes "契約終了まで、大人しく";
		mes "言われた仕事だけをしておけばいい。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "とりあえず今は用は無い。";
		mes "アウレスの所にでも行って";
		mes "仕事を手伝うんだな。";
		close2;
		cutin "verus_ian03",255;
		end;
	case 9:
	case 10:
	case 11:
	case 12:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "もう一度言うが、";
		mes "私はお前が純粋に協力するためだけに";
		mes "ここへ来たとは考えていない。";
		mes "何か企んでいるんだろう？";
		next;
		mes "[イアン・アトナド]";
		mes "……まあいい。";
		mes "今やっている仕事が終わったら";
		mes "すぐ私のもとに来い。";
		mes "暇なお前に仕事を与えてやろう。";
		close2;
		cutin "verus_ian01",255;
		end;
	case 13:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "成果報告書は提出したのか？";
		mes "だったらお前に仕事を与えてやろう。";
		next;
		mes "[イアン・アトナド]";
		mes "私は腹が空いた。";
		mes "何か食べ物を持って来てくれ。";
		mes "ここで支給している食料じゃなく、";
		mes "珍しい食べ物を用意して来い。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "イアン。あなたという人は";
		mes "またそんなことを……。";
		mes "ここでそんな物さがしても";
		mes "無駄だと言う事は";
		mes "わかっているじゃないですか。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "だからこいつに頼むんだろう。";
		mes "そうだな……";
		mes "^4d4dff食べやすく肉汁も豊富で";
		mes "さっぱりする珍味^000000を探して";
		mes "持ってきてくれ。";
		next;
		mes "[イアン・アトナド]";
		mes "見つけて来ることができたら";
		mes "お前の企みを聞いてやろう。";
		mes "何かを望んで";
		mes "ここにいるのは分かっている。";
		next;
		cutin "verus_ian01",255;
		mes "‐イアン・アトナドの注文を叶えれば";
		mes "　^ff0000最後の探査^000000の事が聞けそうだ‐";
		next;
		mes "‐^4d4dff食べやすく肉汁も豊富で";
		mes "　さっぱりする珍味^000000を探してこよう‐";
		set VER_1QUE,14;
		delquest 7623;
		setquest 7624;
		close;
	case 14:
	case 15:
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "同じ事を何度も言わせるな。";
		mes "^4d4dff食べやすく肉汁も豊富で";
		mes "さっぱりする珍味^000000を探して";
		mes "持ってくるんだ。";
		next;
		mes "[イアン・アトナド]";
		mes "見つけて来ることができたら";
		mes "お前の企みを聞いてやるぞ。";
		close2;
		cutin "verus_ian03",255;
		end;
	case 16:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "ふむ……";
		mes "……作業中に片手で簡単に";
		mes "食べらそうな形だな。";
		mes "確かに食べやすそうだ。";
		mes "しかし肝心なのは味だぞ。";
		next;
		mes "‐イアンはビーフトーストを";
		mes "　ゆっくり食べ始めた‐";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "……！　これは……";
		mes "炭火で焼いた肉が細かく刻まれ、";
		mes "香ばしい風味と豊富な肉汁が";
		mes "口の中に広がる……！";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "更に異国の果物と野菜が";
		mes "余分な油を抑えていて";
		mes "さっぱりとしている！";
		next;
		menu "外の葉も食べてみて下さい",-;
		cutin "verus_ian04",2;
		mes "[イアン・アトナド]";
		mes "なるほど……";
		mes "これも一緒に食べるものだったのか。";
		mes "豊富な肉汁にさっぱりしたサラダ、";
		mes "甘い果物。";
		mes "そしてこの食べやすい形状……。";
		next;
		mes "[イアン・アトナド]";
		mes "……ガキ……";
		mes "なかなかやるじゃないか。";
		mes "私が提示した条件をすべて満たすものを";
		mes "持って来てやがったな。";
		next;
		mes "[イアン・アトナド]";
		mes "仕方ない、約束だ。";
		mes "お前がここにきた理由をきいてやろう。";
		mes "私に望むものはなんだ？";
		next;
		menu "最後の探査について",-;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……最後の探査……";
		mes "そうか。それの話か。";
		next;
		mes "[イアン・アトナド]";
		mes "わかった。";
		mes "……少し一人で考える時間がほしい。";
		mes "少し一人にしてくれないか。";
		mes "後であらためて話をしよう。";
		set VER_1QUE,17;
		delitem 11519,1;
		delquest 7626;
		setquest 7627;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		close2;
		cutin "verus_ian01",255;
		end;
	case 21:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "おお、やっと戻ったか。";
		mes "それで、何か成果があったか？";
		next;
		mes "[イアン・アトナド]";
		mes "何か持ち帰ってきたようだな？";
		mes "見せてくれ。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……こ、これは!?";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "何をそんなに驚いているのですか？";
		mes "私にも見せてください。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……これはだな……";
		mes "^ff0000メモリーレコード^000000と呼ばれるものだ。";
		next;
		mes "[イアン・アトナド]";
		mes "曽祖父の遺品で";
		mes "これと同じものを見たことがある。";
		mes "こいつは音声や周りの音を記録する";
		mes "一種の記録媒体だ。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "それは……魔法ですか？";
		mes "目に見えるものをそのまま記録に残す";
		mes "フォト魔法なら知っていますが……。";
		mes "同じ類のものなのですか？";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "いや、違う。魔法の応用でもない。";
		mes "純粋なる科学の産物だよ。";
		mes "曽祖父がこれを使って";
		mes "音声を記録するのを見たことがある。";
		next;
		mes "[イアン・アトナド]";
		mes "当時はただのおもちゃのような";
		mes "発明品だとばかり思っていたが……";
		mes "今となって考えてみれば、";
		mes "なぜ曾祖父はその技術を";
		mes "発表しなかったのか疑問だな。";
		next;
		mes "[イアン・アトナド]";
		mes "本当に小さい頃の記憶だが、";
		mes "これと全く同じものだったよ。";
		mes "……とすれば、あれで……";
		mes "こいつに記録された内容を";
		mes "知ることができるのか……。";
		next;
		mes "[イアン・アトナド]";
		mes "そうだな……あれが必要だ。";
		mes "今すぐ探して……";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……あ……。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "どうしました、イアン？";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "このメモリーレコードに記録された";
		mes "内容を見るための機械があるんだ。";
		mes "それは曽祖父が使っていた";
		mes "^ff0000レコードプレイヤー^000000という機械だ。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "私はそれを曾祖父から、";
		mes "遠い昔に譲り受けていたんだ。";
		mes "価値ある古い機械だ。";
		mes "大切に自宅に保管していたよ。";
		mes "しかし……。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "……なるほど。";
		mes "あなたの家は、貴方の娘";
		mes "アルクイエンが処分してしまった。";
		mes "そうですね？";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "そうだ、もう私の家は無い。";
		mes "おそらく曾祖父の";
		mes "レコードプレイヤーも……。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "いいえ、イアン。";
		mes "あなたが大切にしていた物ならば、";
		mes "アルクイエンは";
		mes "処分はしていないでしょう。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "どういうことだ？";
		mes "あの子は私を恨んでいる。";
		mes "私の物など、とうの昔に";
		mes "処分しているに決まっている。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "決まっているかどうか、";
		mes strcharinfo(0) + "さんに";
		mes "確かめていただきましょう。";
		next;
		mes "[アウレス]";
		mes "イアン。";
		mes "あなたは物事を、何でも";
		mes "決めつけて考えてしまう。";
		mes "あなたの悪い癖ですよ。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……";
		next;
		mes "[イアン・アトナド]";
		mes "…………";
		next;
		mes "[イアン・アトナド]";
		mes "………………";
		mes "……そうだな……。";
		mes "確かめるだけ確かめてみるか。";
		next;
		mes "[イアン・アトナド]";
		mes "……" + strcharinfo(0) + "。";
		mes "アルクイエンの元へ行き、";
		mes "曾祖父のレコードプレイヤーを";
		mes "まだ処分していないか聞いてみてくれ。";
		mes "そして、もしそれがまだあるのならば";
		mes "ここへ持ってきて欲しい。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "私からもお願いします。";
		mes "彼女に何かを頼むとすれば、";
		mes "私やイアンではなく、";
		mes "楽園団のメンバーである";
		mes "あなたからの方が良いと思います。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "楽園団に行くのならば、";
		mes "送ってやるぞ。";
		mes "用意ができたら声をかけてくれ。";
		set VER_1QUE,22;
		delquest 7643;
		setquest 7644;
		close2;
		cutin "verus_ian01",255;
		end;
	case 22:
		cutin "verus_ian01.bmp", 2;
		mes "[イアン・アトナド]";
		mes "アルクイエン、あの子に話して";
		mes "^ff0000レコードプレイヤー^000000を持って来てくれ。";
		mes "……あの子がまだそれを";
		mes "処分していなければ、だがな。";
		next;
		mes "[イアン・アトナド]";
		mes "楽園団に行くのならば、";
		mes "送ってやるぞ。";
		next;
		if(select("もう少しここにいる","送ってもらう") == 1) {
			mes "[イアン・アトナド]";
			mes "そうか。";
			mes "準備ができたら声をかけてくれ。";
			close2;
			cutin "Arquien_n_atnad01.bmp", 255;
			end;
		}
		mes "[イアン・アトナド]";
		mes "わかった。";
		mes "では、送ろう。";
		next;
		mes "[イアン・アトナド]";
		mes "……頼んだぞ。";
		close2;
		cutin "Arquien_n_atnad01.bmp", 255;
		warp "moc_para01.gat",131,164;
		end;
	case 23:
	case 24:
	case 25:
	case 26:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……。";
		next;
		cutin "verus_ian01",255;
		mes "‐何か考え込んでいるようだ。";
		mes "　今はそっとしておこう‐";
		close;
	case 27:
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "アルクイエンが？";
		mes "あの子は一体何を考えているんだ？";
		mes "私に不満があるのならば";
		mes "直接来て話せばいいものを！";
		next;
		mes "[イアン・アトナド]";
		mes "なぜレコードプレイヤーを";
		mes "渡してくれないのだ……。";
		mes "毎回お前があの子が確認した内容を";
		mes "聞いてくるというのか？";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "……悪くないですね。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "そう、悪くない。";
		mes "……じゃないだろう!?";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "いえいえ、これは良い事です。";
		mes "今までそっぽを向いてた";
		mes "あなた達親子が";
		mes "少しでも交流するチャンスですよ。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "またお前はそうやって！";
		mes "何がチャンスだ！";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "でもまあ、そうだな……。";
		mes "あの子がレコードプレイヤーを";
		mes "捨てないでいてくれただけでも……。";
		next;
		mes "[イアン・アトナド]";
		mes "わかった。仕方ない。";
		mes "とにかくこうなってしまったからには";
		mes strcharinfo(0)+ "。お前が";
		mes "キッチリ内容を聞いてきて、";
		mes "私に教えてくれ。わかったな？";
		next;
		mes "[イアン・アトナド]";
		cutin "verus_ian03",2;
		mes "……それで？";
		mes "メモリーレコードの内容は";
		mes "聞いたんだろう？";
		mes "何が録音されていた？";
		next;
		menu "メモリーレコードの内容を話す",-;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……なんだって!?";
		mes "聞き間違いじゃないのか？";
		mes "なぜ、アトナドの名が出てくる？";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "……。";
		mes "……恐らくですが……";
		next;
		mes "[アウレス]";
		mes "この地から発掘された";
		mes "メモリーレコード、";
		mes "それを再生することができる";
		mes "プレイヤーがあなたの家にあった。";
		next;
		mes "[アウレス]";
		mes "それはあなたの曾祖父から";
		mes "譲り受けたもの……。";
		mes "そしてメモリーレコードの内容に";
		mes "アトナドの名があった……。";
		mes "以上から推測すると……";
		next;
		mes "[アウレス]";
		mes "イアン、あなたは";
		mes "この都市の住人の";
		mes "末裔ではないのですか？";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "私が……ウェルスシティの末裔……!?";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……確かに、なぜかこの場所を";
		mes "懐かしいと思う感覚はあった……。";
		mes "……だから……なのか？";
		mes "……私がジュピロスに";
		mes "喰らいついた理由は……。";
		next;
		mes "[イアン・アトナド]";
		mes "しかしなぜ今になってこの場所が";
		mes "発見されたんだ？";
		mes "もっと前から知られていても";
		mes "良いはずだ！";
		mes "私の先祖がこの都市の人間なら";
		mes "なぜそれを隠したんだ……？";
		next;
		menu "落ち着いてください",-;
		mes "[イアン・アトナド]";
		mes "そ……そうだな、";
		mes "お前に聞いても仕方のないことだ……。";
		mes "……どうやらその^ff0000メモリーレコードを";
		mes "もっと集める必要がありそうだ。^000000";
		next;
		mes "[イアン・アトナド]";
		mes "このメモリーレコードは";
		mes "研究棟で見つけたものだったな。";
		mes "では今度は^ff0000実験棟^000000を";
		mes "調べてきてくれないか。";
		next;
		mes "[イアン・アトナド]";
		mes "^ff0000実験棟^000000には地下施設があって、";
		mes "メモリーレコードのようなものが";
		mes "見つかるらしい。";
		next;
		mes "[イアン・アトナド]";
		mes "お前はそこに行って";
		mes "メモリーレコードを探して欲しい。";
		mes "他の奴らが興味を持つ前に";
		mes "こちらで手を打とう。";
		mes "どうせ内容の解読もできないはずだ。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "とりあえず、この事を";
		mes "アルクイエンにも話してくれ。";
		mes "いいな、今度は";
		mes "^ff0000実験棟^000000のメモリーレコードだ。";
		mes "頼んだぞ。";
		set VER_1QUE,28;
		delquest 7647;
		setquest 7648;
		close2;
		cutin "verus_ian01",255;
		end;
	case 28:
	case 29:
	case 30:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "^0000ff実験棟^000000は、";
		mes "^ff0000広場から北西方面にある^000000と聞いた。";
		mes "近くまで行けばすぐわかるだろう。";
		next;
		mes "[イアン・アトナド]";
		mes "そこから地下施設につながる道を探して";
		mes "内部を調査してくれ。";
		next;
		mes "[イアン・アトナド]";
		mes "どうやらそこにも";
		mes "得体の知れない機械がいて、";
		mes "襲ってくるらしいと聞いた。";
		mes "注意してメモリーレコードを集めてくれ。";
		next;
		mes "[イアン・アトナド]";
		mes "最低でも2個は欲しい。";
		mes "集めたらアルクイエンの元へ行き、";
		mes "内容を聞いて私に教えてくれ。";
		close2;
		cutin "verus_ian01",255;
		end;
	case 31:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "アルクイエン……";
		mes "あの子の考えている事が";
		mes "私にはよくわからん。";
		mes "長く離れすぎていたからな……。";
		next;
		mes "[イアン・アトナド]";
		mes "だからあの子が";
		mes "私が大事にしていた";
		mes "レコードプレイヤーを";
		mes "捨てていなかったことに";
		mes "正直驚いている。";
		next;
		cutin "verus_ian04",2;
		mes "[イアン・アトナド]";
		mes "……ゆっくり";
		mes "あの子と話をする時間を";
		mes "作らなければならないとは";
		mes "思っているんだがな……。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "フン。年寄のひとり言だ。";
		mes "さあ作業を進めるぞ。";
		mes strcharinfo(0)+ "、";
		mes "お前もお前の";
		mes "やるべきことをやるんだ。";
		close2;
		cutin "verus_ian01",255;
		end;
	case 32:
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "今回もか！";
		mes "本当にあの子は何を考えてるんだ！";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "なんだって？　あの子も参加すると？";
		mes "自分がメモリーレコードの解読をして";
		mes "結果をこっちに渡すと？";
		mes "……いきなりどうしたと言うのだ？";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "アルクイエンも何かに";
		mes "気づいたのではないのでしょうか？";
		mes "ともあれ、せっかく手伝ってくれると";
		mes "言うのです。彼女の好意に";
		mes "甘えようじゃありませんか。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……くっ";
		mes "……仕方ないか。";
		mes strcharinfo(0)+ "、お前が";
		mes "キッチリ内容を聞いてきて";
		mes "私に教えてくれ。わかったな？";
		mes "アルクイエンの様子も見てきてほしい。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "そうですね。";
		mes "アルクイエンからの伝達もですが、";
		mes "メモリーレコードも";
		mes "集めていただきたいですね。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "そうだな。そっちも頼む。";
		mes "手間をかけさせるが";
		mes "よろしく頼むぞ。";
		close2;
		cutin "verus_ian01",255;
		end;
	case 33:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "ああ、お前か。";
		mes "今ちょっと取り込んでいる。";
		next;
		menu "どうしたのですか？",-;
		mes "[イアン・アトナド]";
		mes "少し厄介な事になりそうだ。";
		mes "それも……";
		next;
		cutin "ep15_tatio01",0;
		mes "[レッケンベル主席秘書官]";
		mes "はじめまして。";
		mes "レッケンベル秘書室の主席秘書官、";
		mes "W・Hと申します。";
		mes "お待ちしておりました。";
		next;
		menu "レッケンベル社の秘書？",-;
		mes "[レッケンベル主席秘書官]";
		mes "はい。";
		mes "レッケンベル社会長の";
		mes "秘書を勤めております。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "挨拶はいい。";
		mes "それで用件はなんだ？";
		mes "発掘状況に関する報告は";
		mes "別ルートで行っているはずだが。";
		next;
		cutin "ep15_tatio01",0;
		mes "[レッケンベル主席秘書官]";
		mes "我が社の会長は、あなた方に";
		mes "一度お会いしたいと言っております。";
		mes "いつでもかまいませんので";
		mes "リヒタルゼンの本社に";
		mes "お越しいただきたいのです。";
		next;
		mes "[レッケンベル主席秘書官]";
		mes "それと……";
		mes "あなた方が調査をしている";
		mes "メモリーレコードの内容について、";
		mes "当分非公開でお願い致します。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "フン。私らがメモリーレコードを";
		mes "調査している事にもう気が付いたか。";
		mes "それで内容は非公開にしろと？";
		mes "それはなぜだ？";
		next;
		cutin "ep15_tatio01",0;
		mes "[レッケンベル主席秘書官]";
		mes "そうですね……。";
		mes "まだ時期尚早と言うべきでしょうか。";
		next;
		mes "[レッケンベル主席秘書官]";
		mes "これらに関する協議も行う予定ですので";
		mes "詳しくはレッケンベル社で";
		mes "お話いたしましょう。";
		mes "なるべく早く訪問してくださるよう、";
		mes "お願いします。";
		next;
		mes "[レッケンベル主席秘書官]";
		mes "それでは私はこれで。";
		mes "ご訪問をお待ちしています。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "これは……行かざるを得ませんね。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "仕方ない。";
		mes "ここにいても何も始まらないからな。";
		mes "とりあえず行ってみるしかないだろう。";
		mes strcharinfo(0)+ "。";
		mes "お前もレッケンベル社へ行くんだ。";
		next;
		mes "[イアン・アトナド]";
		mes "なぜかお前も同席するようにと";
		mes "やつらに言われているんだ。";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "騒がしいと思ったら";
		mes "レッケンベルが来ていたのか。";
		mes "本社に来いだと？　私も行くぞ。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "アルクイエン!?";
		mes "お前も一緒に";
		mes "レッケンベルに行くだと!?";
		mes "どういう事だ!?";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "なんだ" +strcharinfo(0)+ "、";
		mes "まだ私が調査に参加する事を";
		mes "伝えてなかったのか？";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "まあいい。というわけで、";
		mes "この調査に関して";
		mes "色々興味が湧いたからな。";
		mes "私も参加するぞ。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "レコードプレイヤーも";
		mes "私が持っているしな。";
		mes "嫌とは言わせない。";
		mes "まぁ、嫌と言われても、";
		mes "勝手に参加するけどな。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "なんだと!?";
		mes "アルクイエン……";
		mes "お前が何を考えているのか";
		mes "私には全く理解できない。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "レコードプレイヤーを";
		mes "ただこちらに渡すだけで済む話なのに。";
		mes "どういう風の吹き回しだ……？";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "アルクイエンも何かに";
		mes "気づいたのではないのでしょうか？";
		mes "ともあれ、せっかく手伝ってくれると";
		mes "言うのです。彼女の好意に";
		mes "甘えようじゃありませんか。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "そうだな……確かに今は";
		mes "猫の手でも欲しい状況だ。";
		mes "……わかった。";
		mes "しかし、邪魔だけはするなよ。";
		mes "調査の邪魔だと感じたら";
		mes "すぐに追い出すからな。";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "この私が邪魔になんかなるものか。";
		mes "さあ、そうと決まったら";
		mes "さっさとレッケンベルの本社へ行こう。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……ああ、そうだな。";
		mes strcharinfo(0)+ "、";
		mes "お前も出かける準備をしてくれ。";
		mes "話だけだろうから、";
		mes "特に念入りに準備するような事も";
		mes "ないと思うが……。";
		next;
		mes "[イアン・アトナド]";
		mes "準備ができたら声をかけてくれ。";
		set VER_1QUE,34;
		delquest 118210;
		setquest 7656;
		close2;
		cutin "verus_ian01",255;
		end;
	case 34:
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "レッケンベルの本社に行く";
		mes "準備はできたか？";
		mes "すぐに出発するぞ。";
		next;
		if(select("もう少し準備がしたい","すぐに出発する") == 1) {
			mes "[イアン・アトナド]";
			mes "わかった。";
			mes "準備ができたら声をかけてくれ。";
			mes "なるべく急げ。";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		mes "[イアン・アトナド]";
		mes "わかった。";
		mes "では、行くとしよう。";
		close;
		cutin "verus_ian01",255;
		warp "lhz_in01.gat",275,229;
		end;
	default:
		cutin "verus_ian01",2;
		if(VER_1QUE < 37) {
			mes "[イアン・アトナド]";
			mes "ああ、お前か。";
			mes "なんの用だ？";
		}
		else {
			mes "[イアン・アトナド]";
			mes "世の中とは本当に";
			mes "分からない事ばかりだな。";
			mes "とにかくメモリーレコードの研究は";
			mes "続けられそうで安心した。";
			next;
			mes "[イアン・アトナド]";
			mes "それで今日は何の用だ？";
		}
		set '@str1$,"発掘作業を手伝う　(^FF0000クエスト受注可能^000000)";
		if(checkquest(7615)) {
			if(countitem(6749) < 2)
				set '@str1$,"発掘作業を手伝う　(^FF0000受注中^000000)";
			else
				set '@str1$,"発掘作業を手伝う　(^FF0000報酬受け取り可能^000000)";
		}
		if(checkquest(7616)) {
			set '@str1$,"発掘作業を手伝う　(デイリークエスト)";
			if(checkquest(7616) & 0x2)
				set '@str1$,"発掘作業を手伝う　(^FF0000クエスト受注可能^000000)";
		}
		set '@str2$,"話をする";
		if(VER_1QUE == 17 || VER_1QUE == 18) {
			set '@str2$,"話をする　(^FF0000ストーリークエスト^000000)";
		}
		set '@str3$,"立ち去る";
		if(VER_1QUE == 37) {
			set '@str3$,"";
		}
		next;
		switch(select('@str1$,'@str2$,'@str3$)) {
		case 1:
			if(checkquest(7615)) {
				if(countitem(6749) < 2) {
					mes "[イアン・アトナド]";
					mes "稼働制御装置のことだな。";
					next;
					mes "[イアン・アトナド]";
					mes "なんだ、頼んだ仕事を忘れたのか？";
					mes "^ff0000稼働制御装置^000000を";
					mes "^ff00002個^000000集めてきてくれ。";
					mes "頼んだぞ。";
					close2;
					cutin "verus_ian01",255;
					end;
				}
				mes "[イアン・アトナド]";
				mes "稼働制御装置のことだな。";
				next;
				mes "[イアン・アトナド]";
				mes "今回もちゃんと持って来たな。";
				mes "持って来たのをそこに置いて";
				mes "帰りなさい。";
				next;
				mes "[イアン・アトナド]";
				mes "……なるべく壊さないように";
				mes "努力しているんだがな。";
				mes "やはり古い物だから仕方ないのか……。";
				next;
				if(checkitemblank() == 0) {
					cutin "verus_ian04.bmp", 255;
					mes "‐アイテムの種類数が多くて";
					mes "　持つことができない。";
					mes "　種類数を減らしてから受け取ろう‐";
					close;
				}
				cutin "verus_ian04",2;
				mes "[イアン・アトナド]";
				mes "こいつらを見てると思う。";
				mes "歳はとりたくないものだな。";
				delitem 6749,2;
				setquest 7616;
				delquest 7615;
				getitem 6961,5;
				close2;
				cutin "verus_ian01",255;
				end;
			}
			if(checkquest(7616)) {
				if(checkquest(7616) & 0x2 == 0) {
					mes "[イアン・アトナド]";
					mes "稼働制御装置のことだな。";
					next;
					mes "[イアン・アトナド]";
					mes "まだ研究中だ。";
					mes "今のところはまだ必要ない。";
					mes "実験で全部壊れてしまうかも";
					mes "知れないが……。";
					close2;
					cutin "verus_ian01",255;
					end;
				}
				mes "[イアン・アトナド]";
				mes "稼働制御装置のことだな。";
				next;
				delquest 7616;
				mes "稼働制御装置のストックが";
				mes "なくなってしまったな。";
				mes "研究にはまだまだ";
				mes "数が必要なんだが……。";
				next;
				mes "[イアン・アトナド]";
				mes "この間の稼働制御装置も";
				mes "色々な実験をしていたら";
				mes "耐えられなくて、";
				mes "全部壊れてしまった。";
				mes "最近の若者と同じだ。";
				next;
				cutin "verus_ian04",2;
				mes "[イアン・アトナド]";
				mes "アルクイエン……あいつもそうだ。";
				mes "辛抱というものを知らん。";
				close2;
				cutin "verus_ian01",255;
				end;
			}
			mes "[イアン・アトナド]";
			mes "稼働制御装置のことだな。";
			next;
			cutin "verus_ian01",2;
			mes "[イアン・アトナド]";
			mes "稼働制御装置を用意してくるのが";
			mes "お前の仕事だ。";
			mes "……やりたくなければ";
			mes "やらないでいいがな。";
			next;
			if(select("稼働制御装置を用意してくる","大変ですね") == 2) {
				mes "[イアン・アトナド]";
				mes "私に用がないのなら";
				mes "他のメンバーの仕事でも";
				mes "手伝ってやってくれ。";
				close2;
				cutin "verus_ian01",255;
				end;
			}
			mes "[イアン・アトナド]";
			mes "そうか。";
			mes "それなら、^ff0000稼働制御装置^000000を";
			mes "^ff00002個^000000集めてきてくれ。";
			next;
			mes "[イアン・アトナド]";
			mes "稼働制御装置……。あれは昔、";
			mes "どこかで見たことがあるような";
			mes "気がするんだがな。";
			next;
			mes "[イアン・アトナド]";
			mes "まあ、そんなことはどうでもいい。";
			mes "年寄のひとり言だ。";
			mes "さあ、お前は早く行け。";
			mes "お前が集めて、私が研究する。";
			mes "そうすれば時間も有効に使えるだろう。";
			mes "頼んだぞ。";
			setquest 7615;
			close2;
			cutin "verus_ian01",255;
			end;
		case 2:
			break;
		case 3:
			cutin "verus_ian01",2;
			mes "[イアン・アトナド]";
			mes "古代文明に触れられる機会なんて";
			mes "めったにあるわけじゃない。";
			mes "仕事がなくて暇なら、";
			mes "その辺を探索してみるといい。";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		switch(VER_1QUE) {
		case 17:
			cutin "verus_ian02",2;
			mes "[イアン・アトナド]";
			mes "ちょうどいいところに来た。";
			mes "^ff0000実験棟^000000と^ff0000研究棟^000000への";
			mes "立ち入り許可が下りたんだ。";
			next;
			mes "[イアン・アトナド]";
			mes "早速、調査範囲を";
			mes "広げようと思うのだが……";
			next;
			menu "最後の探査の話は？",-;
			cutin "verus_ian01",2;
			mes "[イアン・アトナド]";
			mes "無論、忘れてなどいない。";
			mes "だが……最後の探査では……";
			mes "特に何も見つからなかった。";
			mes "探査地はジュピロスだったよ。";
			mes "目的はいろいろあったのだろうが……";
			next;
			cutin "verus_ian02",2;
			mes "[イアン・アトナド]";
			mes "それが私の人生の";
			mes "大きな転換になったという事だけは";
			mes "わかっている。";
			mes "だが、それ以外の事は";
			mes "頭の中にもやがかかっているようで";
			mes "よく思い出せないのだ……。";
			next;
			mes "[イアン・アトナド]";
			mes "だからこの場所を調べれば、";
			mes "そのもやを消すことができる気がして";
			mes "ファンタスマゴリカプロジェクトに";
			mes "参加したのだ。";
			next;
			mes "[イアン・アトナド]";
			mes "……私の勘だがな。";
			mes "私がずっと探していたものが";
			mes "ここと無関係ではないと";
			mes "感じているのだ。";
			next;
			cutin "verus_ian01",2;
			mes "[イアン・アトナド]";
			mes "……だから今は黙って";
			mes "私を手伝ってもらえないだろうか。";
			next;
			menu "……仕方ないですね",-;
			mes "[イアン・アトナド]";
			mes "……これが最後の仕事だ。";
			mes "アルクイエン、あの子も";
			mes "知る必要がある。";
			mes "私は仕事の準備を済ませるので、";
			mes "調査の準備ができたら";
			mes "またここに来てくれ。";
			set VER_1QUE,18;
			delquest 7627;
			setquest 118204;
			close2;
			cutin "verus_ian01",255;
			end;
		case 18:
			cutin "verus_ian01",2;
			mes "[イアン・アトナド]";
			mes "準備はできたか？";
			mes "早速、閉鎖された地域の";
			mes "探査を始めよう。";
			next;
			mes "[イアン・アトナド]";
			mes "しかし、どうやらそこは、";
			mes "生命体に敏感に反応する";
			mes "機械がいるようだ。";
			mes "恐らくそれが閉鎖されていた理由だろう。";
			next;
			mes "[イアン・アトナド]";
			mes "しかも不思議なエネルギーの障壁が";
			mes "張られている場所もあるらしい。";
			next;
			mes "[イアン・アトナド]";
			mes "まずは^ff0000研究棟^000000地域を調べてくれ。";
			mes "気になるものがあれば知らせて欲しい。";
			mes "一見、役に立ちそうもない物の中にこそ";
			mes "重要なものが隠されている可能性が高い。";
			mes "怪しげなガラクタや本の山を見つけたら";
			mes "必ず調べてみてくれ。";
			next;
			mes "[イアン・アトナド]";
			mes "^0000ff研究棟^000000は、";
			mes "^ff0000広場から北東方面にある^000000と聞いた。";
			mes "近くまで行けばすぐわかるだろう。";
			mes "研究棟の入口にいる統制員に話せば";
			mes "研究棟へ入ることができるはずだ。";
			set VER_1QUE,19;
			delquest 118204;
			setquest 7641;
			close2;
			cutin "verus_ian01",255;
			end;
		case 19:
		case 20:
			cutin "verus_ian01",2;
			mes "[イアン・アトナド]";
			mes "^0000ff研究棟^000000は、";
			mes "^ff0000広場から北東方面にある^000000と聞いた。";
			mes "近くまで行けばすぐわかるだろう。";
			next;
			mes "[イアン・アトナド]";
			mes "とにかく、何か気になるものを発見したら、";
			mes "ぜひ私に知らせてくれ。";
			mes "とくに役に立ちそうもない物の中にこそ";
			mes "重要なものが隠されている可能性が高い。";
			mes "^ff0000怪しげなガラクタや本の山を見つけたら";
			mes "必ず調べてみてくれ。^000000";
			close2;
			cutin "verus_ian01",255;
			end;
		case 37:
			mes "[イアン・アトナド]";
			mes "ウェルス、メモリーレコード、";
			mes "曾祖父のラセ……。";
			mes "考える事や調べる事はまだまだある。";
			next;
			mes "[イアン・アトナド]";
			mes strcharinfo(0)+ "、";
			mes "お前にもまだまだ手伝って貰いたい。";
			mes "よろしく頼むぞ。";
			close2;
			cutin "verus_ian01",255;
			end;
		}
	}
OnInit:
	waitingroom "ファンタスマゴリカ",0;
	end;
}

verus03.gat,107,177,3	script	ルークラフェズ#atnd09	953,{
	if(VER_1QUE == 14) {
		cutin "looke_rapez02",0;
		mes "[ルーク]";
		mes "どうした。";
		mes "何か困っているように見えるが。";
		next;
		mes "[ルーク]";
		mes "……なるほど。";
		mes "イアン氏の無理な注文か。";
		mes "食べやすく肉汁も豊富で";
		mes "さっぱりする珍味……";
		next;
		cutin "looke_rapez03",0;
		mes "[ルーク]";
		mes "……ひとつ思い浮かぶものがある。";
		mes "それはたぶん、";
		mes "モーラ名物の^ff0000ビーフトースト^000000だろう。";
		next;
		mes "[ルーク]";
		mes "レシア族の街モーラでも売っているが、";
		mes "もしお前が自分で";
		mes "材料を用意してくることができるなら";
		mes "俺が作ってやるよ。";
		next;
		mes "[ルーク]";
		mes "こう見えて料理は好きなんだ。";
		mes "ただし材料調達が";
		mes "少し困難かも知れない。";
		mes "その料理は次元の向こうの";
		mes "食べ物だからな。";
		next;
		cutin "looke_rapez04",0;
		mes "[ルーク]";
		mes "とりあえず材料を伝えよう。";
		mes "^ff0000にく2個、";
		mes "モーラオレンジ1個、";
		mes "バナナ1個^000000……。";
		mes "確かこんな感じだった。";
		next;
		cutin "looke_rapez02",0;
		mes "[ルーク]";
		mes "材料の中の果物の一部は";
		mes "^ff0000霧の森の迷宮^000000近くで自生するものだ。";
		mes "少し集め辛いと思うが";
		mes "探してみてくれ。";
		set VER_1QUE,15;
		delquest 7624;
		setquest 7625;
		close2;
		cutin "looke_rapez02",255;
		end;
	}
	else if(VER_1QUE == 15) {
		if(countitem(11519) >= 1) {
			cutin "looke_rapez02",0;
			mes "[ルーク]";
			mes "お、ビーフトーストを持ってきたか。";
			mes "そいつは温かい方が";
			mes "うまいから、温めてやろう。";
			next;
			cutin "looke_rapez02",255;
			mes "‐ルークが";
			mes "　ビーフトーストを温めはじめると、";
			mes "　辺りにおいしそうな香りが";
			mes "　漂いだした‐";
			next;
			cutin "looke_rapez01",0;
			mes "[ルーク]";
			mes "できたぞ。";
			mes "さあ、冷めないうちに";
			mes "イアン氏に持っていくといい。";
			set VER_1QUE,16;
			delquest 7625;
			setquest 7626;
			close2;
			cutin "looke_rapez02",255;
			end;
		}
		if(countitem(517) < 2 || countitem(11520) < 1 || countitem(513) < 1) {
			cutin "looke_rapez04.bmp", 0;
			mes "[ルーク]";
			mes "材料の確認か？　必要な食材は";
			mes "^ff0000にく2個、";
			mes "モーラオレンジ1個、";
			mes "バナナ1個^000000だ。";
			next;
			mes "[ルーク]";
			mes "材料の中の果物の一部は";
			mes "^ff0000霧の森の迷宮^000000近くで自生するものだ。";
			mes "気を付けて集めてきてくれ。";
			close2;
			cutin "looke_rapez04.bmp", 255;
			end;
		}
		cutin "looke_rapez04",0;
		mes "[ルーク]";
		mes "よく集めたな。";
		mes "よし、では作るぞ。";
		next;
		cutin "looke_rapez02",255;
		mes "‐渡した材料でルークが";
		mes "　手際よく、料理を始めた。";
		mes "　辺りにおいしそうな香りが漂う‐";
		next;
		cutin "looke_rapez04",0;
		mes "[ルーク]";
		mes "モーラ名物の^ff0000ビーフトースト^000000だ。";
		mes "君が話した条件に";
		mes "十分、当てはまるだろう。";
		next;
		if(checkitemblank() == 0) {
			mes "[ルーク]";
			mes "アイテムの種類数が多くて";
			mes "持つことができないようだ。";
			mes "種類数を減らしてから";
			mes "もう一度きてくれ。";
			close2;
			cutin "looke_rapez02.bmp", 255;
			end;
		}
		cutin "looke_rapez01",0;
		mes "[ルーク]";
		mes "できたぞ。";
		mes "さあ、冷めないうちに";
		mes "イアン氏に持っていくといい。";
		set VER_1QUE,16;
		delitem 517,2;
		delitem 11520,1;
		delitem 513,1;
		getitem 11519,1;
		delquest 7625;
		setquest 7626;
		close2;
		cutin "looke_rapez02",255;
		end;
	}
	else if(VER_1QUE == 16) {
		cutin "looke_rapez01",0;
		mes "[ルーク]";
		mes "あの頑固なイアン氏も";
		mes "気に入ってくれるだろう。";
		mes "冷めないうちに持っていくといい。";
		close2;
		cutin "looke_rapez01",255;
		end;
	}
	else if(VER_1QUE >= 17) {
		cutin "looke_rapez02",0;
		mes "[ルーク]";
		mes "ここは暇だな。";
		mes "もう少し強い敵はいないものか。";
		mes "腕がなまるぜ。";
		next;
		cutin "looke_rapez02",255;
		mes "[ロイド]";
		mes "冗談でもそんな事言うなよ〜。";
		mes "本当にそうなったらどうするんだ！";
		mes "僕は勇敢な猫だけど、あいつらには";
		mes "僕の爪が通用しないんだよ〜……。";
		next;
		cutin "looke_rapez01",0;
		mes "[ルーク]";
		mes "心配するな。";
		mes "俺がここに居る限り、";
		mes "あなたが死ぬ事も";
		mes "怪我をする事も絶対ない。";
		mes "安心して仕事を進めてくれ。";
		next;
		mes "[ルーク]";
		mes "その間に俺は";
		mes "食事の用意でもしておこう。";
		next;
		cutin "looke_rapez02",255;
		mes "[ロイド]";
		mes "やった〜！";
		mes "ルーク君のごはんがあると思うと、";
		mes "お仕事のヤル気がアップするニャ〜！";
		mes "よぉし！　頑張るニャ!!";
		close;
	}
	cutin "looke_rapez04",0;
	mes "[ルーク]";
	mes "……こいつの身辺は心配するな。";
	close2;
	cutin "looke_rapez04",255;
	end;
}

verus03.gat,103,177,5	script	機械学者ロイド#atnd09	421,{/* 59261 */
	if(VER_1QUE == 9) {
		mes "[ロイド]";
		mes "ん？　見ない顔だね？";
		next;
		menu "君がロイド？",-;
		mes "[ロイド]";
		mes "そうだよ〜。何の用？";
		mes "えっ、なんだって？";
		mes "アウレスさんに言われてきたの!?";
		next;
		mes "[ロイド]";
		mes "うわ、大変だ〜。";
		mes "アウレスさんの期待に";
		mes "応えないといけないのに、";
		mes "まだ研究が終わってないんだよ〜！";
		next;
		mes "[ロイド]";
		mes "どうしよう、困ったニャ〜……";
		mes "あっ、困ったなー！";
		next;
		switch(select("手伝おうか？","猫がどうしてここにいるんだ？","大変ですね")) {
		case 1:
			break;
		case 2:
			mes "[ロイド]";
			mes "僕はマラン島の奴らとは違って、";
			mes "新技術や文物に興味があって";
			mes "たくさんの研究をしたんだ〜。";
			mes "色々な企業にも行ってみて、";
			mes "錬金術も習った！";
			next;
			mes "[ロイド]";
			mes "そんな中、ウェルスシティの噂を聞いて";
			mes "ここへ来たんだけど、";
			mes "どこか発掘団に所属していないと";
			mes "調査に参加できないって言われたんだ。";
			next;
			mes "[ロイド]";
			mes "途方に暮れてね〜……。";
			mes "そんな時、助けてくれたのが";
			mes "アウレスさんなんだよ。";
			mes "それで、アトナド発掘団の";
			mes "メンバーになったんだ！";
			next;
			mes "[ロイド]";
			mes "だから、そんなお世話になった";
			mes "アウレスさんを";
			mes "がっかりさせたくないよ〜……。";
			next;
			mes "[ロイド]";
			mes "そうだ君！";
			mes "ちょっと手伝ってくれないかい？";
			mes "ちょっと、ちょっとだけでいいんだ!!";
			mes "お願いだよ〜！";
			next;
			menu "いいですよ",-;
			mes "[ロイド]";
			mes "本当？　ありがとニャ〜!!";
			mes "あっ、ありがとう〜!!";
			mes "助かるよ〜！";
			next;
			break;
		case 3:
			mes "[ロイド]";
			mes "そうなんだよ〜。";
			mes "困った、困った、どうしよう……。";
			next;
			cutin "looke_rapez02",0;
			mes "[ルーク]";
			mes "割り込んで悪いが、";
			mes "君はアトナド発掘団を手伝えと言う";
			mes "依頼を受けてここに来たんじゃないか？";
			next;
			mes "[ルーク]";
			mes "だったら少しロイドの仕事を";
			mes "手伝ってくれないか？";
			mes "俺が手伝いたいのはやまやまなんだが、";
			mes "俺の任務はロイドの身辺警護だから";
			mes "彼から目を離すことができなんだ。";
			next;
			cutin "looke_rapez02",255;
			mes "[ロイド]";
			mes "そう！それだよ〜！";
			mes "君、君、";
			mes "ちょっと手伝ってくれないかい？";
			mes "ちょっと、ちょっとだけでいいんだ!!";
			mes "お願いだよ〜！";
			next;
			menu "いいですよ",-;
			mes "[ロイド]";
			mes "本当？　ありがとニャ〜!!";
			mes "あっ、ありがとう〜!!";
			mes "助かるよ〜！";
			next;
			break;
		}
		mes "[ロイド]";
		mes "それではすぐ本題に入ろう！";
		mes "君には凝集されたエネルギーを";
		mes "集めてきてほしい。";
		next;
		mes "[ロイド]";
		mes "ここにはウェルスギアや機械の";
		mes "壊れた残骸がたくさんあるんだ〜。";
		mes "そこに原因不明のエネルギーが";
		mes "漂っているから、";
		mes "それをビンに詰めて集めてほしいんだ。";
		next;
		mes "[ロイド]";
		mes "空きビンを用意して、";
		mes "残骸のエネルギーの流れに合わせて";
		mes "待っていれば、空きビンの中に";
		mes "エネルギーが入って来るはず！";
		next;
		mes "[ロイド]";
		mes "それを^ff00002個^000000持ってきてほしい。";
		mes "お願いだよ〜、頼んだよ〜!!";
		set VER_1QUE,10;
		delquest 7620;
		setquest 7621;
		close;
	}
	else if(VER_1QUE == 10) {
		if(countitem(6756) < 2) {
			mes "[ロイド]";
			mes "ここにはウェルスギアや機械の";
			mes "壊れた残骸がたくさんあるんだ〜。";
			mes "そこに原因不明のエネルギーが";
			mes "漂っているから、";
			mes "それをビンに詰めて集めてほしいんだ。";
			next;
			mes "[ロイド]";
			mes "空きビンを用意して、";
			mes "残骸のエネルギーの流れに合わせて";
			mes "待っていれば、空きビンの中に";
			mes "エネルギーが入って来るはず！";
			next;
			mes "[ロイド]";
			mes "それを^ff00002個^000000持ってきてほしい。";
			mes "お願いだよ〜、頼んだよ〜!!";
			close;
		}
		mes "[ロイド]";
		mes "ありがとう！";
		mes "ちゃんと必要な個数、そろってるね！";
		next;
		mes "[ロイド]";
		mes "おかげで助かったよ〜。";
		mes "これでアウレスさんの力になれそうだよ。";
		mes "このエネルギーが凝集される原因と";
		mes "活用方法を見つけたら、";
		mes "イアン団長が更に研究するんだって。";
		next;
		mes "[ロイド]";
		mes "そのために、僕とアウレスさんが";
		mes "まずこのエネルギーの正体を";
		mes "調べているところなんだ。";
		next;
		mes "[ロイド]";
		mes "……もしかしたらここの機械を";
		mes "僕たちが動かせるかも知れない……。";
		mes "それがイアン団長とみんなが";
		mes "望んでいることなんだ。";
		next;
		mes "[ロイド]";
		mes "アウレスさんに伝えて。";
		mes "研究は君が手伝ってくれたから";
		mes "順調に進んでますって。それに、";
		mes "ここはルーク君がいるから";
		mes "安全ですって。";
		next;
		mes "[ロイド]";
		mes "君といい、アウレスさんといい……";
		mes "人間にもいい奴はいるんだニャ〜。";
		mes "あっ、いるんだね！";
		mes "また良かったら手伝って〜！";
		set VER_1QUE,11;
		delitem 6756,2;
		delquest 7621;
		setquest 7622;
		close;
	}
	else if(VER_1QUE >= 11 && VER_1QUE <= 16) {
		mes "[ロイド]";
		mes "今はお願いする仕事はないよ〜。";
		mes "またそのうち手伝ってほしいニャ〜。";
		mes "あっ、手伝ってほしいなー！";
		close;
	}
	else if(VER_1QUE >= 17) {
		if(checkquest(7628)) {
			if(countitem(6756) < 2) {
				mes "[ロイド]";
				mes "ここにはウェルスギアや機械の";
				mes "壊れた残骸がたくさんあるんだ〜。";
				mes "そこに原因不明のエネルギーが";
				mes "漂っているから、";
				mes "それをビンに詰めて集めてほしいんだ。";
				next;
				mes "[ロイド]";
				mes "空きビンを用意して、";
				mes "残骸のエネルギーの流れに合わせて";
				mes "待っていれば、空きビンの中に";
				mes "エネルギーが入って来るはず！";
				next;
				mes "[ロイド]";
				mes "それを^ff00002個^000000持ってきてほしい。";
				mes "お願いだよ〜、頼んだよ〜!!";
				close;
			}
			mes "[ロイド]";
			mes "ありがとう〜!!";
			mes "君の事、仕事が早いし気に入ったよ〜！";
			mes "アウレスさんとルーク君の次だけどね。";
			next;
			mes "[ロイド]";
			mes "よ〜し、研究に取り掛かるぞ〜。";
			mes "本当にありがとう！";
			mes "また良かったら手伝って〜！";
			delitem 6756,2;
			setquest 7629;
			delquest 7628;
			getitem 6962,2;
			close;
		}
		if(checkquest(7629)) {
			if(checkquest(7629) & 0x2) {
				delquest 7629;
				mes "[ロイド]";
				mes "う〜ん、難しいなぁ〜……。";
				mes "ちょっとしくじったら";
				mes "エネルギーが消えてなくなっちゃう。";
				mes "保管方法に問題があるのかな？";
				next;
				mes "[ロイド]";
				mes "ああ、君だったのか。";
				mes "もし時間があるなら";
				mes "またエネルギー集めを";
				mes "手伝ってほしいんだ〜。";
				next;
				mes "[ロイド]";
				mes "協力してくれるなら、準備を整えて";
				mes "また僕に話しかけてニャ〜。";
				mes "あっ、話かけてー！";
				close;
			}
			mes "[ロイド]";
			mes "今は集めたエネルギーを";
			mes "分析している途中だよ〜。";
			next;
			mes "[ロイド]";
			mes "忙しいから邪魔しないでね〜。";
			close;
		}
		mes "[ロイド]";
		mes "う〜ん、難しいなぁ〜……。";
		mes "ちょっとしくじったら";
		mes "エネルギーが消えてなくなっちゃう。";
		mes "保管方法に問題があるのかな？";
		next;
		mes "[ロイド]";
		mes "ああ、君だったのか。";
		mes "もし時間があるなら";
		mes "またエネルギー集めを";
		mes "手伝ってほしいんだ〜。";
		next;
		if(select("手伝う","断る") == 2) {
			mes "[ロイド]";
			mes "他の仕事でもあるのかい？";
			mes "忙しいならしょうがないね〜。";
			mes "モンスターが怖いけど、";
			mes "ルーク君と一緒に集めに行くかぁ。";
			next;
			cutin "looke_rapez01",0;
			mes "[ルーク]";
			mes "それは歓迎だ。";
			mes "暇だったからちょうどいい。";
			close2;
			cutin "looke_rapez01",255;
			end;
		}
		mes "[ロイド]";
		mes "ありがとう〜！";
		mes "とっても助かるよ。";
		mes "集め方は覚えてる？";
		next;
		mes "[ロイド]";
		mes "まず空きビンを用意して、";
		mes "残骸のエネルギーの流れに合わせて";
		mes "待っていれば、空きビンの中に";
		mes "エネルギーが入って来るはず！";
		next;
		mes "[ロイド]";
		mes "それを^ff00002個^000000持ってきてほしい。";
		mes "お願いだよ〜、頼んだよ〜!!";
		setquest 7628;
		close;
	}
	mes "[ロイド]";
	mes "……君は今、私が猫だから";
	mes "無視しようとしてたよね〜？";
	mes "外見だけで判断されちゃ困るよ〜。";
	close;
}

verus03.gat,127,145,3	script	機械の残骸#atnd01	10042,3,3,{/* 59262 */
	if(VER_1QUE != 10 && !checkquest(7628)) {
		mes "‐不思議な光が揺らめいている‐";
		close;
	}
	if(countitem(6756) >= 2) {
		mes "‐^4d4dff凝集されたエネルギー^000000は十分集めた。";
		mes "　ロイドの所へ戻ろう‐";
		close;
	}
	if(countitem(713) < 1) {
		mes "‐凝集されたエネルギーを採取するには";
		mes "　^4d4dff空きビン^000000が必要だ‐";
		close;
	}
	misceffect 362;
	mes "‐壊れた機械の隙間に";
	mes "　未知のエネルギーが集まっている。";
	mes "　揺らめきの先に空きビンを添えれば";
	mes "　エネルギーを集める事ができそうだ‐";
	next;
	progressbar 3;
	if(checkitemblank() == 0) {
		mes "‐アイテムの種類数が多くて";
		mes "　持つことができない。";
		mes "　種類数を減らしてから受け取ろう‐";
		close;
	}
	hideonnpc;
	delitem 713,1;
	getitem 6756,1;
	mes "‐凝集されたエネルギーを採取した‐";
	close;
OnTouch:
	misceffect 362;
	end;
}
verus03.gat,84,152,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd02	10042,3,3	/* 59263 */
verus03.gat,104,181,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd03	10042,3,3	/* 59264 */
verus03.gat,204,202,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd04	10042,3,3	/* 59265 */
verus03.gat,219,199,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd05	10042,3,3	/* 59266 */
verus03.gat,260,194,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd06	10042,3,3	/* 59267 */
verus03.gat,198,181,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd07	10042,3,3	/* 59268 */
verus03.gat,207,115,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd08	10042,3,3	/* 59269 */
verus03.gat,54,78,3		duplicate(機械の残骸#atnd01)	機械の残骸#atnd09	10042,3,3	/* 59270 */
verus03.gat,24,74,3		duplicate(機械の残骸#atnd01)	機械の残骸#atnd10	10042,3,3	/* 59271 */
verus03.gat,43,125,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd11	10042,3,3	/* 59272 */
verus03.gat,62,120,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd12	10042,3,3	/* 59273 */
verus03.gat,44,195,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd13	10042,3,3	/* 59274 */
verus03.gat,124,61,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd14	10042,3,3	/* 59275 */
verus03.gat,168,229,3	duplicate(機械の残骸#atnd01)	機械の残骸#atnd15	10042,3,3	/* 59276 */

verus03.gat,167,257,5	script	出入り統制員ダムハ#atnd	868,{/* 59490 */
	if(VER_1QUE == 19) {
		mes "[ダムハ]";
		mes "ここは許可を得た発掘団の団員以外は";
		mes "立ち入ることができません。";
		mes "どちらから来た方ですか？";
		next;
		switch(select("アトナド発掘団です","なぜ許可がないと立ち入れない？")) {
		case 1:
			mes "[ダムハ]";
			mes "アトナド発掘団の方ですね。";
			mes "少々お待ちください。";
			mes "……はい、確認できました。";
			mes "アトナド発掘団は";
			mes "立ち入りが許可されています。";
			next;
			menu "なぜ許可がないと立ち入れない？",-;
			mes "[ダムハ]";
			mes "ウェルスシティは";
			mes "大きく４か所の地域に分かれています。";
			next;
			mes "[ダムハ]";
			mes "その中で現在一般公開されている地域は";
			mes "ウェルスタウンと";
			mes "ウェルス中央広場です。";
			mes "その他にも施設のような物は";
			mes "あったのですが、";
			mes "その地域は閉鎖されていました。";
			next;
			mes "[ダムハ]";
			mes "ファンタスマゴリカプロジェクトで";
			mes "一般発掘団を募集する前に";
			mes "我が社でその閉鎖されていた地域を";
			mes "調査してみた結果、";
			mes "ウェルスは何らかの大きな爆発があった";
			mes "地域である事がわかりました。";
			next;
			mes "[ダムハ]";
			mes "現在は機械が襲ってくるという事と、";
			mes "内部の地形が危険である事以外は";
			mes "大きな危険は無いと判断できたため、";
			mes "実力のある一部の発掘団に限り";
			mes "立ち入りを許可しています。";
			break;
		case 2:
			mes "[ダムハ]";
			mes "ウェルスシティは";
			mes "大きく４か所の地域に分かれています。";
			next;
			mes "[ダムハ]";
			mes "その中で現在一般公開されている地域は";
			mes "ウェルスタウンと";
			mes "ウェルス中央広場です。";
			mes "その他にも施設のような物は";
			mes "あったのですが、";
			mes "その地域は閉鎖されていました。";
			next;
			mes "[ダムハ]";
			mes "ファンタスマゴリカプロジェクトで";
			mes "一般発掘団を募集する前に";
			mes "我が社でその閉鎖されていた地域を";
			mes "調査してみた結果、";
			mes "ウェルスは何らかの大きな爆発があった";
			mes "地域である事がわかりました。";
			next;
			mes "[ダムハ]";
			mes "現在は機械が襲ってくるという事と、";
			mes "内部の地形が危険である事以外は";
			mes "大きな危険は無いと判断できたため、";
			mes "実力のある一部の発掘団に限り";
			mes "立ち入りを許可しています。";
			next;
			mes "[ダムハ]";
			mes "あなたはどこの発掘団所属の方ですか？";
			next;
			menu "アトナド発掘団です",-;
			mes "[ダムハ]";
			mes "アトナド発掘団の方ですね。";
			mes "少々お待ちください。";
			mes "……はい、確認できました。";
			mes "アトナド発掘団は";
			mes "立ち入りが許可されています。";
			break;
		}
		next;
		mes "[ダムハ]";
		mes "アトナド発掘団には、";
		mes "^ff0000西側にある実験棟^000000への";
		mes "立ち入りも許可が出ていますので、";
		mes "そちらの調査もお願いします。";
		next;
		mes "[ダムハ]";
		mes "それでは良い結果を待っています。";
		mes "お気をつけて！";
		set VER_1QUE,20;
		delquest 7641;
		setquest 7642;
		close;
	}
	if(VER_1QUE >= 20) {
		mes "[ダムハ]";
		mes "調査は進んでいますか？";
		mes "調査地域は危険なので";
		mes "気を付けて下さい。";
		close;
	}
	mes "[ダムハ]";
	mes "申し訳ありませんが、この先は";
	mes "許可が下りた発掘団の方のみ";
	mes "立ち入りが可能です。";
	close;
}

verus03.gat,172,257,3	script	出入り統制員ギュハ#atnd	868,{/* 59491 */
	if(VER_1QUE == 19) {
		mes "[ギュハ]";
		mes "ここは許可を得た発掘団の団員以外は";
		mes "立ち入ることができません。";
		mes "どちらから来た方ですか？";
		next;
		switch(select("アトナド発掘団です","なぜ許可がないと立ち入れない？")) {
		case 1:
			mes "[ギュハ]";
			mes "アトナド発掘団の方ですね。";
			mes "少々お待ちください。";
			mes "……はい、確認できました。";
			mes "アトナド発掘団は";
			mes "立ち入りが許可されています。";
			next;
			menu "なぜ許可がないと立ち入れない？",-;
			mes "[ギュハ]";
			mes "ウェルスシティは";
			mes "大きく４か所の地域に分かれています。";
			next;
			mes "[ギュハ]";
			mes "その中で現在一般公開されている地域は";
			mes "ウェルスタウンと";
			mes "ウェルス中央広場です。";
			mes "その他にも施設のような物は";
			mes "あったのですが、";
			mes "その地域は閉鎖されていました。";
			next;
			mes "[ギュハ]";
			mes "ファンタスマゴリカプロジェクトで";
			mes "一般発掘団を募集する前に";
			mes "我が社でその閉鎖されていた地域を";
			mes "調査してみた結果、";
			mes "ウェルスは何らかの大きな爆発があった";
			mes "地域である事がわかりました。";
			next;
			mes "[ギュハ]";
			mes "現在は機械が襲ってくるという事と、";
			mes "内部の地形が危険である事以外は";
			mes "大きな危険は無いと判断できたため、";
			mes "実力のある一部の発掘団に限り";
			mes "立ち入りを許可しています。";
			break;
		case 2:
			mes "[ギュハ]";
			mes "ウェルスシティは";
			mes "大きく４か所の地域に分かれています。";
			next;
			mes "[ギュハ]";
			mes "その中で現在一般公開されている地域は";
			mes "ウェルスタウンと";
			mes "ウェルス中央広場です。";
			mes "その他にも施設のような物は";
			mes "あったのですが、";
			mes "その地域は閉鎖されていました。";
			next;
			mes "[ギュハ]";
			mes "ファンタスマゴリカプロジェクトで";
			mes "一般発掘団を募集する前に";
			mes "我が社でその閉鎖されていた地域を";
			mes "調査してみた結果、";
			mes "ウェルスは何らかの大きな爆発があった";
			mes "地域である事がわかりました。";
			next;
			mes "[ギュハ]";
			mes "現在は機械が襲ってくるという事と、";
			mes "内部の地形が危険である事以外は";
			mes "大きな危険は無いと判断できたため、";
			mes "実力のある一部の発掘団に限り";
			mes "立ち入りを許可しています。";
			next;
			mes "[ギュハ]";
			mes "あなたはどこの発掘団所属の方ですか？";
			next;
			menu "アトナド発掘団です",-;
			mes "[ギュハ]";
			mes "アトナド発掘団の方ですね。";
			mes "少々お待ちください。";
			mes "……はい、確認できました。";
			mes "アトナド発掘団は";
			mes "立ち入りが許可されています。";
			break;
		}
		next;
		mes "[ギュハ]";
		mes "アトナド発掘団には、";
		mes "^ff0000西側にある実験棟^000000への";
		mes "立ち入りも許可が出ていますので、";
		mes "そちらの調査もお願いします。";
		next;
		mes "[ギュハ]";
		mes "それでは良い結果を待っています。";
		mes "お気をつけて！";
		set VER_1QUE,20;
		delquest 7641;
		setquest 7642;
		close;
	}
	if(VER_1QUE >= 20) {
		mes "[ギュハ]";
		mes "調査は進んでいますか？";
		mes "調査地域は危険なので";
		mes "気を付けて下さい。";
		close;
	}
	mes "[ギュハ]";
	mes "申し訳ありませんが、この先は";
	mes "許可が下りた発掘団の方のみ";
	mes "立ち入りが可能です。";
	close;
}

verus03.gat,169,259,0	script	verus03_to_verus02	45,1,1,{/* 59492 */
	if(VER_1QUE < 20) {
		mes "[出入り統制員]";
		mes "申し訳ありませんが、この先は";
		mes "許可が下りた発掘団の方のみ";
		mes "立ち入りが可能です。";
		close;
	}
	warp "verus02.gat",72,19;
	end;
}

verus02.gat,72,16,0	warp	verus02_to_verus03	1,1,verus03.gat,169,255

verus02.gat,60,30,1	script	散らばった文書#e152a01	10043,{/* 59494 (hide)*/
	if(VER_1QUE == 20) {
		mes "‐色々な書類が";
		mes "　山積みになっている。";
		mes "　書類に記された文字は劣化し、";
		mes "　解読は困難なようだ‐";
		next;
		if(select("調べる","やめる") == 2) {
			mes "‐他の場所を調べることにした‐";
			close;
		}
		progressbar 3;
		if(checkitemblank() == 0) {
			mes "‐アイテムの種類数が多くて";
			mes "　持つことができない。";
			mes "　種類数を減らしてから受け取ろう‐";
			close;
		}
		hideonnpc;
		mes "‐乱雑に散らばった書類の中に";
		mes "　小さな円盤状の物体を見つけた‐";
		next;
		mes "^4d4dff‐イアン・アトナド博士に";
		mes "　持って行って調べて貰おう‐^000000";
		set VER_1QUE,21;
		getitem 6757,1;
		delquest 7642;
		setquest 7643;
		close;
	}
	if(VER_1QUE == 24) {
		if(countitem(6757) >= 2) {
			mes "‐メモリーレコードは十分に集まった。";
			mes "　これ以上調べる必要はなさそうだ‐";
			close;
		}
		mes "‐色々な書類が";
		mes "　山積みになっている。";
		mes "　書類に記された文字は劣化し、";
		mes "　解読は困難なようだ‐";
		next;
		if(select("調べる","やめる") == 2) {
			mes "‐他の場所を調べることにした‐";
			close;
		}
		progressbar 3;
		if(checkitemblank() == 0) {
			mes "‐アイテムの種類数が多くて";
			mes "　持つことができない。";
			mes "　種類数を減らしてから受け取ろう‐";
			close;
		}
		hideonnpc;
		mes "‐乱雑に散らばった書類の中に";
		mes "　大切そうに置かれた";
		mes "　メモリーレコードを見つけた。";
		mes "　まるで誰かが意図的に";
		mes "　隠しておいたように感じる‐";
		getitem 6757,1;
		close;
	}
	if(checkquest(7650)) {
		if(countitem(6757) >= 2) {
			mes "‐メモリーレコードは十分に集まった。";
			mes "　これ以上調べる必要はなさそうだ‐";
			close;
		}
		mes "‐色々な書類が";
		mes "　山積みになっている。";
		mes "　書類に記された文字は劣化し、";
		mes "　解読は困難なようだ‐";
		next;
		if(select("調べる","やめる") == 2) {
			mes "‐他の場所を調べることにした‐";
			close;
		}
		progressbar 3;
		if(checkitemblank() == 0) {
			mes "‐アイテムの種類数が多くて";
			mes "　持つことができない。";
			mes "　種類数を減らしてから受け取ろう‐";
			close;
		}
		hideonnpc;
		mes "‐乱雑に散らばった書類の中に";
		mes "　メモリーレコードを見つけた‐";
		getitem 6757,1;
		close;
	}
	mes "‐特に変わったものは見当たらない‐";
	close;
}

verus02.gat,178,32,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a02	10043	/* 59495 */
verus02.gat,102,135,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a03	10043	/* 59496 */
verus02.gat,42,37,3		duplicate(散らばった文書#e152a01)	散らばった文書#e152a04	10043	/* 59497 */
verus02.gat,155,64,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a05	10043	/* 59498 */
verus02.gat,80,129,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a06	10043	/* 59499 */
verus02.gat,29,129,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a07	10043	/* 59500 */
verus02.gat,125,85,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a08	10043	/* 59501 */
verus02.gat,51,237,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a09	10043	/* 59502 */
verus02.gat,160,150,3	duplicate(散らばった文書#e152a01)	散らばった文書#e152a10	10043	/* 59503 */

verus03.gat,52,250,5	script	出入り統制員グマン#atnd	868,{/* 59483 */
	if(VER_1QUE == 19) {
		mes "[グマン]";
		mes "ここは許可を得た発掘団の団員以外は";
		mes "立ち入ることができません。";
		mes "どちらから来た方ですか？";
		next;
		menu "アトナド発掘団です",-;
		mes "[グマン]";
		mes "アトナド発掘団の方ですね。";
		next;
		mes "[グマン]";
		mes "アトナド発掘団には、";
		mes "^ff0000北東側にある研究塔^000000への";
		mes "立ち入り許可が出ていますので、";
		mes "そちらの調査を先にお願いします。";
		next;
		mes "‐先に^ff0000北東側にある研究塔^000000の";
		mes "　調査をしよう‐";
		close;
	}
	if(VER_1QUE >= 20) {
		mes "[グマン]";
		mes "調査は進んでいますか？";
		mes "調査地域は危険なので";
		mes "気を付けて下さい。";
		close;
	}
	mes "[グマン]";
	mes "申し訳ありませんが、この先は";
	mes "許可が下りた発掘団の方のみ";
	mes "立ち入りが可能です。";
	close;
}

verus03.gat,52,254,0	script	verus03_to_verus01	45,1,1,{
	if(VER_1QUE < 20) {
		mes "[出入り統制員]";
		mes "申し訳ありませんが、この先は";
		mes "許可が下りた発掘団の方のみ";
		mes "立ち入りが可能です。";
		close;
	}
	warp "verus01.gat",243,62;
	end;
}

verus01.gat,247,58,0	warp	verus01_to_verus03	1,1,verus03.gat,55,251

verus04.gat,172,149,3	script	団長アルクイエン#e152v0	951,{
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "おや、君は……。";
		mes "ひょっとして発掘に興味があるのか？";
		mes "もし興味があるようなら";
		mes "楽園団へきてくれ。";
		mes "詳しい話をしよう。";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 3:
	case 4:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "発掘団の参加登録は済ませたか？";
		mes "まだなら早く登録をして、";
		mes "発掘作業を手伝ってきてくれ。";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 24:
		if(countitem(6757) < 2) {
			cutin "Arquien_n_atnad02",2;
			mes "[ナイル]";
			mes "私が事務室で話した内容は";
			mes "覚えていないのか？";
			mes "^ff0000メモリーレコードは";
			mes "ひとつだけじゃ動かないみたいだ。^000000";
			mes "再生するには2個必要だと思う。";
			next;
			cutin "Arquien_n_atnad01",2;
			mes "[ナイル]";
			mes "最初のメモリーレコードを";
			mes "見つけた場所の近くに";
			mes "もう一度行って";
			mes "^ff0000メモリーレコードを2個";
			mes "集めて持ってきてくれ。^000000";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "持って来たか？";
		mes "よし。これをこうやって集めて……";
		mes "ここに置く……。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "さあ、準備は出来た。";
		mes "再生スイッチは";
		mes "君に押してもらおうか。";
		mes "レコードプレイヤーは、";
		mes "私の隣に置いてある。";
		mes "その、再生のスイッチを押すだけだ。";
		delitem 6757,2;
		set VER_1QUE,25;
		delquest 7645;
		setquest 7646;
		emotion 0,"レコードプレイヤー#e152";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 25:
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "さあ、用意はできている。";
		mes "メモリーレコードに記された秘密を";
		mes "確認しようじゃないか。";
		mes "レコードプレイヤーは、";
		mes "私の隣に置いてある。";
		mes "その、再生のスイッチを押すだけだ。";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 26:
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "ふむ……。";
		mes "内容自体は大した事はないが……";
		mes "なぜアトナドの名が出てくる？";
		mes "親父が何か知っているのか？";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "いや、違う。";
		mes "きっとこの内容は知らないはずだ。";
		mes "それでも何かが……。";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "……ああああ！　わからん!!";
		mes "こうやって頭を使うのは私に向かない！";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "君が行って今の内容を";
		mes "うまくあの親父に伝えるんだ。";
		mes "考えるのはアイツの専門だろ？";
		mes "そしてこのメモリーレコードは……";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "……!?";
		misceffect 234,"レコードプレイヤー#e152";
		next;
		menu "今、何が…",-;
		mes "[ナイル]";
		mes "なっ……？　静電気!?";
		mes "それともよくある証拠隠滅ってヤツか？";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "まあいい。ともかく君は";
		mes "大体の内容を親父に伝えた後、";
		mes "どうしてアトナドの名が出たのか";
		mes "分かることはないか聞いてみてくれ。";
		set VER_1QUE,27;
		delquest 118206;
		setquest 7647;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 27:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "メモリーレコードの内容は";
		mes "覚えているな？　君が行って内容を";
		mes "うまくあの親父に伝えるんだ。";
		mes "考えるのはアイツの専門だろ？";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 28:
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "はあ。あの親父、本当に……。";
		mes "自分から話に来たりはしないのか？";
		mes "それで今回は実験棟の";
		mes "メモリーレコードだと？";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "全く……仕方ない人だな……。";
		mes "まあいい。協力はするよ。";
		mes "私は寛大だからね。";
		next;
		mes "[ナイル]";
		mes "それに、あの親父でも";
		mes "わからない事があるというのも、";
		mes "少し面白いしな。";
		mes "あいつが分からないなら";
		mes "私たちで調べようじゃないか。";
		next;
		mes "[ナイル]";
		mes "君も協力してくれるだろう？";
		mes "実験棟のメモリーレコードを";
		mes "2個集めて持ってきてくれ。";
		mes "気を付けて行ってくるんだぞ。";
		set VER_1QUE,29;
		delquest 7648;
		setquest 118208;
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 29:
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "はあ。あの親父、本当に……。";
		mes "自分から話に来たりはしないのか？";
		mes "それで今回は実験棟の";
		mes "メモリーレコードだと？";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "全く……仕方ない人だな……。";
		mes "まあいい。協力はするよ。";
		mes "私は寛大だからね。";
		next;
		mes "[ナイル]";
		mes "それに、あの親父でも";
		mes "わからない事があるというのも、";
		mes "少し面白いしな。";
		mes "あいつが分からないなら";
		mes "私たちで調べようじゃないか。";
		next;
		mes "[ナイル]";
		mes "君も協力してくれるだろう？";
		mes "実験棟のメモリーレコードを";
		mes "2個集めて持ってきてくれ。";
		mes "気を付けて行ってくるんだぞ。";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 30:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "持って来たか？";
		mes "よし。これをこうやって集めて……";
		mes "ここに置く……。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "さあ、準備は出来た。";
		mes "再生スイッチは";
		mes "君に押してもらおうか。";
		mes "内容はしっかり記憶して、";
		mes "親父に伝えるんだぞ。";
		delitem 6824,2;
		set VER_1QUE,31;
		delquest 118209;
		setquest 7646;
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 31:
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "さあ、用意はできている。";
		mes "メモリーレコードに記された秘密を";
		mes "確認しようじゃないか。";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 32:
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "再生後の音は、静電気ではなく";
		mes "連結部位が割れた音だったみたいだ。";
		mes "もう一度2個繋げると再生できるから、";
		mes "特に問題はなさそうだが……。";
		next;
		mes "[ナイル]";
		mes "……今回もただならぬ内容だな。";
		mes "実験というのは、この場所を";
		mes "こんな姿にした元凶なのか？";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[ナイル]";
		mes "もしかすると……内容から察するに、";
		mes "このメモリーレコードというものは";
		mes "この地域の秘密を解くのに";
		mes "大きな貢献をするかも知れないな。";
		next;
		menu "破片を見せる",-;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "ほう……これはまた";
		mes "不思議なものを見つけたな。";
		mes "レコード中央の空いていた部分に";
		mes "入っていたものなのか？";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "なるほど。この部分が壊れるのか。";
		mes "しかしこれは……";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "この破片からは強力な思念を感じる。";
		mes "気を付けて扱うようにしたほうがいい。";
		mes "何が起きるか分からないからな。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "それとだな。この調査に関して、";
		mes "色々話を聞いていたら興味が湧いた。";
		mes "私もここに参加するから、";
		mes "次からメモリーレコードは";
		mes "私に持ってきてくれ。";
		next;
		mes "[ナイル]";
		mes "とりあえずあの親父に";
		mes "私が参加する事を伝えておいてくれ。";
		mes "文句を言われても";
		mes "気にしないでいいからな。";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "ん……？　ちょっと待て、";
		mes "何か異様な雰囲気がする。";
		mes "誰か訪ねてきたのか……？";
		mes "様子を見て来るんだ。";
		set VER_1QUE,33;
		delquest 118206;
		setquest 118210;
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 33:
	case 34:
	case 35:
	case 36:
	case 37:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "ああ、君か。";
		mes "どうした？　私に用か？";
		next;
		switch(select("レコードの収集　(デイリークエスト)","話をする","とくに用はない")) {
		case 1:
			mes "[ナイル]";
			mes "メモリーレコードの収集か？";
			mes "どちらの場所の";
			mes "メモリーレコードだ？";
			next;
			set '@str1$,"研究棟　(^FF0000クエスト受注可能^000000)";
			set '@str2$,"実験棟　(^FF0000クエスト受注可能^000000)";
			if(checkquest(7650))
				set '@str1$,"研究棟　(^FF0000受注中^000000)";
			else if(checkquest(7651) & 0x2 == 0)
				set '@str1$,"研究棟";
			if(checkquest(7652))
				set '@str2$,"実験棟　(^FF0000受注中^000000)";
			else if(checkquest(7653) & 0x2 == 0)
				set '@str2$,"実験棟";
			switch(select('@str1$,'@str2$)) {
			case 1:
				if(checkquest(7654)) {
					cutin "Arquien_n_atnad01.bmp", 2;
					mes "[ナイル]";
					mes "さあ、準備は出来た。";
					mes "再生スイッチは";
					mes "君に押してもらおうか。";
					next;
					cutin "Arquien_n_atnad01.bmp", 255;
					mes "‐隣にある";
					mes "　レコードプレイヤーを調べて、";
					mes "　再生しよう‐";
					close;
				}
				if(checkquest(7650)) {
					if(countitem(6757) < 2) {
						mes "[ナイル]";
						mes "研究棟のメモリーレコードを";
						mes "探してきてくれ。";
						mes "^ff0000メモリーレコードは2個必要だぞ。^000000";
						close2;
						cutin "Arquien_n_atnad01",255;
						end;
					}
					mes "[ナイル]";
					mes "メモリーレコードを";
					mes "集めて来たようだな。";
					mes "しかし、メモリーレコードは";
					mes "一体いくつ存在するんだ？";
					next;
					mes "[ナイル]";
					mes "さあ、準備は出来た。";
					mes "再生スイッチは";
					mes "君に押してもらおうか。";
					delitem 6757, 2;
					setquest 7654;
					delquest 7650;
					close2;
					cutin "Arquien_n_atnad01.bmp", 255;
					end;
				}
				if(checkquest(7651)) {
					if(checkquest(7651) & 0x2) {
						delquest 7651;
						mes "[ナイル]";
						mes "さあ、十分休んだようだし、";
						mes "メモリーレコードの収集を";
						mes "再開しようか？";
						mes "行く気になったら";
						mes "もう一度声をかけてくれ。";
						close2;
						cutin "Arquien_n_atnad01.bmp", 255;
						end;
					}
					mes "[ナイル]";
					mes "研究棟のメモリーレコードの収集は";
					mes "一日一回だけにしてくれ。";
					next;
					mes "[ナイル]";
					mes "君も疲れていると思うし。私は";
					mes "人を酷使するタイプではないからな。";
					mes "また時間をおいて来てくれ。";
					close2;
					cutin "Arquien_n_atnad01",255;
					end;
				}
				mes "[ナイル]";
				mes "研究棟のメモリーレコードを";
				mes "再生したいのか？";
				next;
				mes "[ナイル]";
				mes "オーケーわかった。";
				mes "すぐ再生できるように";
				mes "レコードプレイヤーは準備しておこう。";
				mes "私もあれの内容には興味がある。";
				mes "^ff0000メモリーレコードを2個";
				mes "集めて持ってきてくれ。^000000";
				next;
				if(select("集めてくる","断る") == 2) {
					mes "[ナイル]";
					mes "そうか。";
					mes "気が向いたらよろしく頼む。";
					close2;
					cutin "Arquien_n_atnad01",255;
					end;
				}
				mes "[ナイル]";
				mes "頼んだぞ。";
				mes "気を付けて行ってくるんだ。";
				setquest 7650;
				close2;
				cutin "Arquien_n_atnad01",255;
				end;
			case 2:
				if(checkquest(7655)) {
					cutin "Arquien_n_atnad01.bmp", 2;
					mes "[ナイル]";
					mes "さあ、準備は出来た。";
					mes "再生スイッチは";
					mes "君に押してもらおうか。";
					next;
					cutin "Arquien_n_atnad01.bmp", 255;
					mes "‐隣にある";
					mes "　レコードプレイヤーを調べて、";
					mes "　再生しよう‐";
					close;
				}
				if(checkquest(7652)) {
					if(countitem(6824) < 2) {
						mes "[ナイル]";
						mes "実験棟のメモリーレコードを";
						mes "探してきてくれ。";
						mes "^ff0000メモリーレコードは2個必要だぞ。^000000";
						close2;
						cutin "Arquien_n_atnad01",255;
						end;
					}
					mes "[ナイル]";
					mes "メモリーレコードを";
					mes "集めて来たようだな。";
					mes "しかし、メモリーレコードは";
					mes "一体いくつ存在するんだ？";
					next;
					mes "[ナイル]";
					mes "さあ、準備は出来た。";
					mes "再生スイッチは";
					mes "君に押してもらおうか。";
					delitem 6824, 2;
					setquest 7655;
					delquest 7652;
					close2;
					cutin "Arquien_n_atnad01.bmp", 255;
					end;
				}
				if(checkquest(7653)) {
					if(checkquest(7653) & 0x2) {
						delquest 7653;
						mes "[ナイル]";
						mes "さあ、十分休んだようだし、";
						mes "メモリーレコードの収集を";
						mes "再開しようか？";
						mes "行く気になったら";
						mes "もう一度声をかけてくれ。";
						close2;
						cutin "Arquien_n_atnad01",255;
						end;
					}
					cutin "Arquien_n_atnad01.bmp", 2;
					mes "[ナイル]";
					mes "実験棟のメモリーレコードの収集は";
					mes "一日一回だけにしてくれ。";
					next;
					mes "[ナイル]";
					mes "君も疲れていると思うし。私は";
					mes "人を酷使するタイプではないからな。";
					mes "また時間をおいて来てくれ。";
					close2;
					cutin "Arquien_n_atnad01.bmp", 255;
					end;
				}
				mes "[ナイル]";
				mes "実験棟のメモリーレコードを";
				mes "再生したいのか？";
				next;
				mes "[ナイル]";
				mes "オーケーわかった。";
				mes "すぐ再生できるように";
				mes "レコードプレイヤーは準備しておこう。";
				mes "私もあれの内容には興味がある。";
				mes "^ff0000メモリーレコードを2個";
				mes "集めて持ってきてくれ。^000000";
				next;
				mes "^ff0000‐[レコードの破片]を";
				mes "　所持してる場合は、";
				mes "　新たに[レコードの破片]を";
				mes "　入手する事はできません‐^000000";
				next;
				if(select("集めてくる","断る") == 2) {
					mes "[ナイル]";
					mes "そうか。";
					mes "気が向いたらよろしく頼む。";
					close2;
					cutin "Arquien_n_atnad01",255;
					end;
				}
				mes "[ナイル]";
				mes "頼んだぞ。";
				mes "気を付けて行ってくるんだ。";
				setquest 7652;
				close2;
				cutin "Arquien_n_atnad01",255;
				end;
			}
		case 2:
			mes "[ナイル]";
			mes "話だと？　どうした。";
			next;
			menu "最後の探査について",-;
			cutin "Arquien_n_atnad04",2;
			mes "[ナイル]";
			mes "ああ、最後の探査か……。";
			mes "それはもう聞かなくていい。";
			mes "よく考えてたんだが、";
			mes "私が直接訪ねた方がいいかと";
			mes "思ったんだ。";
			next;
			cutin "Arquien_n_atnad01",2;
			mes "[ナイル]";
			mes "アウレスさんの話では";
			mes "親父はジュピロスに盲目的に";
			mes "しがみついていたらしいんだが……。";
			mes "今はなぜそうだったのか";
			mes "なんとなく理由が";
			mes "わかるような気がするんだ。";
			next;
			cutin "Arquien_n_atnad02",2;
			mes "[ナイル]";
			mes "ウェルス、メモリーレコード、";
			mes "うちにあったレコードプレイヤー……。";
			mes "それに、メモリーレコードの";
			mes "アトナドという言葉……。";
			if(VER_1QUE >= 37)
				mes "そしてレッケンベルでのあの話。";
			next;
			mes "[ナイル]";
			mes "親父……いや、父もなんとなく";
			mes "分かっていたんじゃないかな。";
			mes "きっと自身のルーツを探す事に";
			mes "執着していたんだ。";
			next;
			cutin "Arquien_n_atnad03",2;
			mes "[ナイル]";
			mes strcharinfo(0)+ "、";
			mes "君のおかげで父と";
			mes "話す気が少しだけ出てきたよ。";
			mes "ありがとう。";
			close2;
			cutin "Arquien_n_atnad03",255;
			end;
		case 3:
			cutin "Arquien_n_atnad01",2;
			mes "[ナイル]";
			mes "私は暇じゃないんだ。";
			mes "お前も暇なら";
			mes "誰かを手伝ってくるんだな。";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
	default:
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "ああ、君か。";
		mes "私はちょっとした視察にきただけだ。";
		mes "要件があるなら";
		mes "楽園団の事務室で話をきこう。";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	}
}
verus04.gat,170,150,3	script	レコードプレイヤー#e152	844,{/* 59505 */
	function memoryrecordplayer {
		mes "‐メモリーレコードに記録された";
		mes "　音声情報を再生します‐";
		next;
		if(getarg(0) == 1) {
			switch(getarg(1)) {
			case 7:
				mes "[レコードプレイヤー]";
				mes "^0000FF‐爆発32日目";
				mes "　音声記録ラセ・アトナド‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐実験棟内部のエナジー爆発は";
				mes "　止まっていない‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐例の実験に参加した";
				mes "　研究員たちの生死は……‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐現在、避難所と繋がったシステムの";
				mes "　生体反応以外は分からない‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐広場と研究棟は爆発の衝撃波で";
				mes "　一部施設が壊れたが";
				mes "　大きな被害はない‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐……しかし、実験棟から";
				mes "　ほど近い場所にいた";
				mes "　研究員と市民たちは、";
				mes "　爆発の衝撃波の影響で多数死亡‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐現在、研究棟の施設を利用して";
				mes "　探査型ウェルスギアを";
				mes "　製作中である‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐ウェルスシティの主動力が";
				mes "　止まったので、";
				mes "　補助エナジーキューブを使用して";
				mes "　最小限の施設のみ使用中だ‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐実験棟の隔壁の向こうは";
				mes "　相変わらずエナジーストームによって";
				mes "　接近不可‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐都市で孤立されたことに疲れた";
				mes "　研究員数名がタイムスリップに関する";
				mes "　研究を開始‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐……出ることが出来ない";
				mes "　この墓の中で、";
				mes "　時間の回帰を夢見る‐^000000";
				break;
			}
		}
		else if(getarg(0) == 2) {
			switch(getarg(1)) {
			case 1:
				mes "[レコードプレイヤー]";
				mes "^0000FF‐あー、あ、あ！";
				mes "　ドロシーフロレンスです。";
				mes "　今日はモニタールームにて";
				mes "　メモリーレコードを";
				mes "　ひとつ拾いました‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐実験日に録音された";
				mes "　ブラックボックスかな〜？";
				mes "　再生してみます！‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐あー、雑音がすごいなぁ……";
				mes "　あっ？　聞こえた!?‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐他の研究員は";
				mes "　ちゃんと逃げたかな……‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐一度も恋したことが無いのは";
				mes "　ちょっと悔しいかな……‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐……ああ〜。";
				mes "　こんないい経験には";
				mes "　冷たいマステラ酒と";
				mes "　たれ付き焼き肉が欲しかったな。";
				mes "　……ジジッ……‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐あれ？　これが全部？";
				mes "　だけどこの声は……。";
				mes "　あああああああ！";
				mes "　思い出した！";
				mes "　洗濯物を預けた";
				mes "　アルテミアさんですね！‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐……そっか。";
				mes "　あの日……‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐……カチャン‐^000000";
				break;
			case 15:
				mes "[レコードプレイヤー]";
				mes "^0000FF‐ドロシーフロレンスです。";
				mes "　できる事は洗濯だけの";
				mes "　ドロシーです‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐今日から私が持っている宝物で、";
				mes "　ここに生きる人たちの姿を";
				mes "　残そうと思います‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐ここには多くの人たちがいます。";
				mes "　まだ生きています‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐たくさんの人たちの話を";
				mes "　残せたらいいですね‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐私たちの姿を";
				mes "　誰かが知ってくれる事を、";
				mes "　忘れないでいてくれる事を";
				mes "　願います‐^000000";
				next;
				mes "[レコードプレイヤー]";
				mes "^0000FF‐それでは……。";
				mes "　誰からインタビューを";
				mes "　してみようかな？‐^000000";
				break;
			}
		}
		next;
		mes "‐メモリーレコードに記録された";
		mes "　すべての音声情報を再生しました‐";
		next;
		misceffect 234, "レコードプレイヤー#e152";
		mes "‐メモリーレコードを";
		mes "　取り出そうすると、小さな音と共に";
		mes "　連結部位が壊れて";
		mes "　分割した状態に戻ってしまった‐";
		return;
	}

	switch(VER_1QUE) {
	case 25:
		mes "‐メモリーレコードに記録された";
		mes "　音声情報を再生します‐";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐ジッ……ジジジ……‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐ジ……おい！　何やってんだ？";
		mes "　私の話を聞いているのか？‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐聞いているよゼルテル。";
		mes "　ああ！　お前の声が入って";
		mes "　しまったじゃないか！‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐何だ？　録音してたのか？";
		mes "　何のために？‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐タティオへのメッセージを……";
		mes "　ジジ……しようと";
		mes "　設置しているんだけど。";
		mes "　あ……ジ……なってしまうな‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐はははは！　そんな事をやるなんて、";
		mes "　やっぱりアトナド……だな！‐^000000";
		next;
		mes "[ナイル]";
		mes "……アトナド？";
		cutin "Arquien_n_atnad01",2;
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐ジジッ……‐^000000";
		cutin "Arquien_n_atnad01",255;
		next;
		mes "‐メモリーレコードに記録された";
		mes "　すべての音声情報を再生しました‐";
		set VER_1QUE,26;
		delquest 7646;
		setquest 7653;
		setquest 118206;
		close;
	case 31:
		if(checkitemblank() == 0) {
			// TODO
			mes "‐アイテムの種類数が多くて";
			mes "　進行できません。";
			mes "　種類数を減らしてください‐";
			close;
		}
		memoryrecordplayer 2,1;
		getitem 22691,1;
		set VER_1QUE,32;
		delquest 7646;
		setquest 7651;
		setquest 118206;
		setquest 118150;
		compquest 118150;
		close;
	default:
		if(VER_1QUE < 33) {
			cutin "Arquien_n_atnad01",2;
			mes "[ナイル]";
			mes "勝手に触るな。";
			mes "古い機械だ、壊れたら困る。";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		mes "‐レコードプレイヤーがある。";
		mes "　これで集めた^ff0000メモリーレコード^000000を";
		mes "　再生できそうだ‐";
		set '@str$,"再生する";
		if(checkquest(7654) || checkquest(7655))
			set '@str$,"再生する　(^FF0000報酬受け取り可能^000000)";
		next;
		switch(select('@str$,"再生履歴を聞く","やめる")) {
		case 1:
			if(checkquest(7654)) {
				memoryrecordplayer 1,7;
				next;
				cutin "Arquien_n_atnad01.bmp", 2;
				mes "[ナイル]";
				mes "また割れたか。";
				mes "毎回面倒くさくさせる破片だな。";
				mes "わざとこういう風に作ったのか？";
				next;
				mes "[ナイル]";
				mes "こいつらは科学の知識も";
				mes "それを伸ばす腕もあったのに、";
				mes "どうしてこんなモノを作ったんだ？";
				mes "それとたまに";
				mes "同じ内容のものもあるが……。";
				next;
				mes "[ナイル]";
				mes "誰かに過去の事を知れと";
				mes "説得されている気分だ。";
				next;
				setquest 7650;
				delquest 7650;
				delquest 7654;
				setquest 7651;
				getitem 6962, 1;
				cutin "Arquien_n_atnad03.bmp", 2;
				mes "[ナイル]";
				mes "とにかくこの内容は私が父に渡す。";
				mes "今日もご苦労だった。";
				setquest 118136;
				compquest 118136;
				close2;
				cutin "Arquien_n_atnad03.bmp", 255;
				end;
			}
			else if(checkquest(7655)) {
				memoryrecordplayer 2,15;
				next;
				cutin "Arquien_n_atnad01.bmp", 2;
				mes "[ナイル]";
				mes "また割れたか。";
				mes "毎回面倒くさくさせる破片だな。";
				mes "わざとこういう風に作ったのか？";
				next;
				mes "[ナイル]";
				mes "こいつらは科学の知識も";
				mes "それを伸ばす腕もあったのに、";
				mes "どうしてこんなモノを作ったんだ？";
				mes "それとたまに";
				mes "同じ内容のものもあるが……。";
				next;
				mes "[ナイル]";
				mes "誰かに過去の事を知れと";
				mes "説得されている気分だ。";
				next;
				delquest 5341;
				delquest 5370;
				setquest 7652;
				delquest 7652;
				delquest 7655;
				setquest 7653;
				getitem 6962, 1;
				getitem 22692, 1;
				cutin "Arquien_n_atnad03.bmp", 2;
				mes "[ナイル]";
				mes "とにかくこの内容は私が父に渡す。";
				mes "今日もご苦労だった。";
				setquest 118164;
				compquest 118164;
				close2;
				cutin "Arquien_n_atnad03.bmp", 255;
				end;
			}
			mes "‐再生する準備が出来ていない‐";
			close;
		case 2:
			mes "‐どちらの^ff0000メモリーレコード^000000の";
			mes "　再生履歴を聞こうか？‐";
			next;
			switch(select("研究棟のメモリーレコード","実験棟のメモリーレコード","やめる")) {
			case 1:
				switch(select(
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
						(checkquest(118136)&8? "^0000ffラセの記録　32日目^000000": "^808080未開放^000000"),
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"やめる"))
				{
				default:
					mes "‐未開放の履歴です。";
					mes "　他の履歴を選択してください‐";
					close;
				case 20:
					mes "‐その場を離れた‐";
					close;
				}
			case 2:
				switch(select(
						(checkquest(118150)&8? "^0000ffドロシーとメモリーレコード^000000": "^808080未開放^000000"),
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
						(checkquest(118164)&8? "^0000ffインタビュアードロシー^000000": "^808080未開放^000000"),
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"^808080未開放^000000",
								"やめる"))
				{
				case 1:
					memoryrecordplayer 1;
					close;
				default:
					mes "‐未開放の履歴です。";
					mes "　他の履歴を選択してください‐";
					close;
				case 24:
					mes "‐その場を離れた‐";
					close;
				}
			case 3:
			}
		case 3:
			mes "‐その場を離れた‐";
			close;
		}
	}
}

lhz_in01.gat,277,234,3	script	レッケンベルガード#e152	868,{/* 59959 */
	if(VER_1QUE < 34) {
		mes "[レッケンベルガード]";
		mes "申し訳ございませんが、";
		mes "許可が無い方は";
		mes "お通しすることができません。";
		close;
	}
	mes "[レッケンベルガード]";
	mes "アトナド発掘団の方ですね。";
	mes "中にご案内します。";
	close2;
	warp "lhz_in01.gat",275,241;
	end;
}
lhz_in01.gat,276,238,0	warp	in_to_out#e152i02	1,1,lhz_in01.gat,276,230

lhz_in01.gat,270,257,4	script	レッケンベル会長#e152i0	10085,{/* 59961 */
	if(VER_1QUE == 34) {
		cutin "ep15_rekenber01",0;
		mes "[レッケンベル会長]";
		mes "ようこそいらっしゃいました。";
		mes "私がレッケンベルの会長です。";
		mes "はるばるご足労いただき感謝します。";
		next;
		mes "[レッケンベル会長]";
		mes "アトナド発掘団のみなさんの活躍は";
		mes "私の耳にも届いていますよ。";
		mes "あなた方のような発掘団に";
		mes "協力していただけて光栄です。";
		next;
		mes "[レッケンベル会長]";
		mes "私がみなさんをお呼びした理由は……";
		mes "団長であるイアン博士は";
		mes "お察しでしょう。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……。";
		next;
		cutin "ep15_rekenber01",0;
		mes "[レッケンベル会長]";
		mes "最近、みなさんが収集に力を入れている";
		mes "メモリーレコードについてです。";
		next;
		mes "[レッケンベル会長]";
		mes "メモリーレコードの調査で得た";
		mes "一切の情報を公開せず、";
		mes "内密にしていただきたい。";
		next;
		menu "どういうことですか？",-;
		mes "[レッケンベル会長]";
		mes "メモリーレコードの内容を";
		mes "外部に広めないで欲しいと言う事です。";
		mes "従っていただけるのであれば、";
		mes "特別な待遇をお約束しましょう。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "特別な待遇？";
		mes "……何を企んでいるんだ？";
		next;
		mes "[イアン・アトナド]";
		mes "土の中に埋まっている都市の過去を";
		mes "我々以外の人々が";
		mes "知ってはならない理由は何なんだ？";
		mes "納得がいくよう、説明してもらおう。";
		next;
		cutin "ep15_tatio01",0;
		mes "[主席秘書官]";
		mes "今行っている作業を";
		mes "やめなさいという事ではありません。";
		mes "得た情報も廃棄しなさいと";
		mes "いう事でもありません。";
		next;
		mes "[主席秘書官]";
		mes "メモリーレコードの内容……";
		mes "お察しかと思いますが、";
		mes "あれにはウェルスシティの";
		mes "過去の記録が残されています。";
		next;
		mes "[主席秘書官]";
		mes "その内容が過去を紐解き、";
		mes "歴史を大きく変える内容であることは";
		mes "間違いありません。";
		next;
		mes "[主席秘書官]";
		mes "科学の発展や人類の進化のために";
		mes "メモリーレコードの内容を";
		mes "世間に公表する事は";
		mes "必要な事だと思います。";
		mes "しかし、あれは私個人にとっても、";
		mes "大切なものなのです。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "個人的に大切なもの？";
		mes "あのメモリーレコードが、か？";
		next;
		cutin "ep15_tatio01",0;
		mes "[主席秘書官]";
		mes "ええ。";
		mes "メモリーレコードもですが、";
		mes "それに記された記録が";
		mes "私のとても大切なものなのです。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "記録が？";
		mes "どういう事だ？";
		next;
		cutin "ep15_tatio01",0;
		mes "[主席秘書官]";
		mes "順を追ってお話しましょう。";
		mes "まず、私とあなたは過去に";
		mes "一度お会いしています。";
		mes "思い出せませんか？";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……そういえばどこかで";
		mes "見たことあるような顔だと思ったが……";
		mes "ジュピロスだな！";
		mes "そう、ジュピロスで見た覚えがあるぞ！";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "その時、確か……";
		mes "通路のように見える所で……";
		mes "……私を攻撃してきた男！";
		mes "お、お前の……おまえのせいで……！";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "イアン、何か思い出したのですか!?";
		mes "あの時のあなたの怪我は";
		mes "事故ではなかったのですか!?";
		next;
		menu "なにがあったの？",-;
		mes "[アウレス]";
		mes "私たちが以前、";
		mes "ジュピロスを調査していた時の事です。";
		next;
		mes "[アウレス]";
		mes "何かを見つけたと言って";
		mes "出て行ったイアンが、";
		mes "一週間を過ぎても戻らず、";
		mes "団員みんなで必死に探した結果";
		mes "ジュノーの旅館で傷を負って";
		mes "休んでいるところを発見したのです。";
		emotion 0,"団長アルクイエン#ep152i";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "なぜ自分がジュノーにいるのか、";
		mes "どれほど時間が過ぎていたかも";
		mes "分からなかった。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "イアンは記憶も無くしてたので、";
		mes "事故が起き、怪我をしたイアンを";
		mes "親切な方が旅館まで";
		mes "運んでくださったと";
		mes "片付けるしかなかったのです。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "明確に思い出せない";
		mes "その時の記憶のせいで……";
		mes "私は狂ったように";
		mes "記憶の片隅に残った";
		mes "ジュピロスにしがみついたよ。";
		next;
		mes "[イアン・アトナド]";
		mes "ジュピロスでなら、";
		mes "なくした記憶を取り戻すことができる、";
		mes "この焦燥感を抑えることができると。";
		mes "……私に家族と";
		mes "帰るべき家があったという事も";
		mes "忘れるほどにな。";
		next;
		cutin "ep15_tatio03",0;
		mes "[主席秘書官]";
		mes "……それは申し訳ありませんでした。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "その時、私を攻撃してきたのが";
		mes "お前なんだな？";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[ナイル]";
		mes "……なぜだ？";
		mes "主席秘書官どの。";
		mes "なぜ父を傷付ける必要があった？";
		next;
		cutin "ep15_tatio03",0;
		mes "[主席秘書官]";
		mes "それは……";
		mes "あの時、博士は見てはならないものを";
		mes "見てしまったからです。";
		mes "あの時ウェルスシティは";
		mes "まだ発見されては";
		mes "いけませんでしたから。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "ウェルスシティ……だと!?";
		mes "あの時私が発見したのが";
		mes "ウェルスシティへつながる";
		mes "通路だったということなのか?!";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "なんという事だ……";
		mes "私がウェルスシティを発見していた?!";
		mes "そのせいで記憶を消された……?!";
		mes "一体どういう事なんだ?!";
		next;
		mes "[イアン・アトナド]";
		mes "駄目だ、混乱しているな。";
		mes "少し整理する時間をくれないか？";
		next;
		cutin "ep15_tatio01",0;
		mes "[主席秘書官]";
		mes "分かりました。";
		mes "混乱されるのも無理はありません。";
		mes "少し休憩いたしましょう。";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[ナイル]";
		mes "……父さん。";
		mes "私も少し話がしたい……。";
		next;
		cutin "Arquien_n_atnad02",255;
		mes "‐何が起きているのか整理しよう。";
		mes "　まずはイアンかナイルに";
		mes "　話しかけてみよう‐";
		set VER_1QUE,35;
		delquest 7656;
		setquest 118215;
		close;
	}
	else if(VER_1QUE == 35) {
		cutin "ep15_rekenber02",0;
		mes "[レッケンベル]";
		mes "混乱されるのも無理はありません。";
		mes "少し休憩いたしましょう。";
		next;
		cutin "ep15_rekenber02",255;
		mes "‐何が起きているのか整理しよう。";
		mes "　まずはイアンかナイルに";
		mes "　話しかけてみよう‐";
		close;
	}
	else if(VER_1QUE == 36 || VER_1QUE == 37) {
		cutin "ep15_rekenber01",0;
		mes "[レッケンベル]";
		mes "元々会長というのは";
		mes "こういう時にじっとする職業です。";
		mes "……そんなものです。";
		close2;
		cutin "ep15_rekenber01",255;
		end;
	}
}
lhz_in01.gat,267,257,5	script	主席秘書官#e152i01	10084,{/* 59962 */
	if(VER_1QUE == 34) {
		cutin "ep15_tatio01",0;
		mes "[主席秘書官]";
		mes "会長様は長い時間待っていました。";
		mes "私もです。";
		close2;
		cutin "ep15_tatio01",255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "ep15_tatio01",0;
		mes "[主席秘書官]";
		mes "少し休憩いたしましょう。";
		mes "どうぞあなたも休んでください。";
		mes "積もる話もあるでしょうし。";
		mes "私はここでお待ちしていますね。";
		next;
		cutin "ep15_tatio03",255;
		mes "‐何が起きているのか整理しよう。";
		mes "　まずはイアンかナイルに";
		mes "　話しかけてみよう‐";
		close;
	}
	else if(VER_1QUE == 36) {
		if(checkitemblank() == 0) {
			mes "‐アイテムの種類数が多くて";
			mes "　持つことができない。";
			mes "　種類数を減らしてから受け取ろう‐";
			close;
		}
		cutin "ep15_tatio01",0;
		mes "[主席秘書官]";
		mes "お待たせいたしました。";
		mes "話の続きをいたしましょう。";
		mes "……話をする為に";
		mes "私の正体を明かします。";
		next;
		mes "[タティオ]";
		mes "私はウェルスシティの";
		mes "最後の生存者である";
		mes "タティオ.W.00H-1と申します。";
		mes "呼びやすいように";
		mes "タティオと呼んでください。";
		next;
		mes "[タティオ]";
		mes "メモリーレコードの内容を";
		mes "公表したくない理由……";
		mes "あの時、ジュピロスで";
		mes "イアン博士を攻撃したこと。";
		mes "すべて私が望んでやったことです。";
		donpcevent "イアン・アトナド#ep152i::OnTalk1";
		next;
		cutin "ep15_tatio02",0;
		mes "[タティオ]";
		mes "みなさんが発見したメモリーレコードに";
		mes "記録されているタティオはこの私です。";
		mes "そしてメモリーレコードに";
		mes "記録されているアトナドは、";
		mes "イアン博士の曾祖父である";
		mes "ラセ・アトナド氏です。";
		next;
		cutin "ep15_tatio03",0;
		mes "[タティオ]";
		mes "イアン博士、娘のアルクイエンさん、";
		mes "あなた方はお察しの通り、";
		mes "ウェルスの民の子孫です。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……やはりそうか。";
		mes "しかしウェルスは、";
		mes "遥か遠い過去に存在した都市だ。";
		mes "なぜその時代の人間が生きている!?";
		next;
		cutin "ep15_tatio02",0;
		mes "[タティオ]";
		mes "私は当時のウェルスの";
		mes "科学技術を追求する実験で";
		mes "被験者として実験に参加していました。";
		mes "何度も実験を繰り返した結果、";
		mes "朽ちる事のない体となり";
		mes "今ここに存在しています。";
		next;
		cutin "ep15_tatio03",0;
		mes "[タティオ]";
		mes "ラセは私を作った科学者の一人で、";
		mes "私の永遠の友達です。";
		mes "故郷であり、友達との思い出が多く残る";
		mes "ウェルスシティを守りたくて、";
		mes "あの時イアン博士に危害を加え";
		mes "あの場から遠ざけたのです。";
		next;
		mes "[タティオ]";
		mes "イアン博士が見たものを隠そうとして、";
		mes "少し記憶も操作して……";
		mes "ウェルスシティに関することを";
		mes "忘れていただきました。";
		next;
		cutin "ep15_tatio01",0;
		mes "[タティオ]";
		mes "そのせいでイアン博士は";
		mes "一週間の記憶を";
		mes "失っているのだと思います。";
		next;
		cutin "ep15_tatio02",0;
		mes "[タティオ]";
		mes "あの時、イアン博士が";
		mes "ラセの子孫だとわかっていたら";
		mes "あんな事はしていなかったでしょう。";
		next;
		cutin "ep15_tatio01",0;
		mes "[タティオ]";
		mes "ウェルスシティは";
		mes "とても……とても昔に";
		mes "ジュピロスと肩を並べるほどの";
		mes "いや、それ以上の科学文明を持った";
		mes "巨大な科学都市でした。";
		next;
		mes "[タティオ]";
		mes "不慮の事故で滅びてしまいましたが、";
		mes "機械で作られた私は";
		mes "死ぬことなく、";
		mes "ただ思い出のウェルスシティを";
		mes "守っていたのです。";
		next;
		cutin "ep15_tatio03",0;
		mes "[タティオ]";
		mes "何年も、何十年も、何百年も……。";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "……なんということだ……";
		mes "その話、会長は知っているのか？";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "いや、言わなくていい。";
		mes "すでに知っているのだろう。";
		mes "だから私たちを";
		mes "ここへ呼んだのではないのか。";
		next;
		cutin "ep15_tatio01",0;
		mes "[タティオ]";
		mes "そうです。";
		mes "私とウェルスシティの秘密は";
		mes "会長も知っている内容です。";
		mes "この世でたった二人だけが";
		mes "知っていた秘密です。";
		next;
		mes "[タティオ]";
		mes "いえ、違いますね。";
		mes "設立者の一人である、";
		mes "ゼニット・ゼルテルリヒタルも";
		mes "知っている内容です。";
		mes "彼もやはり、ウェルスシティの";
		mes "子孫の一人ですから。";
		next;
		cutin "ep15_tatio02",0;
		mes "[タティオ]";
		mes "……私がウェルスシティの詳細を、";
		mes "メモリーレコードの内容を、";
		mes "公開して欲しくない理由。";
		mes "わかっていただけましたか？";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "公開されたとしても、";
		mes "ウェルスシティは";
		mes "君の守りたいもの……というわけか。";
		mes "特にメモリーレコードの内容は";
		mes "彼らから君へのメッセージだからな。";
		next;
		mes "[イアン・アトナド]";
		mes "しかし、それなら";
		mes "都市の他の資料は問題ないのか？";
		mes "君や私の名前が明かされて";
		mes "取り上げられたら困る状況だから";
		mes "隠そうとしているんだろ？";
		next;
		cutin "ep15_tatio01",0;
		mes "[タティオ]";
		mes "この世界の文明と合わない";
		mes "飛躍的な水準の核心技術は";
		mes "すでに廃棄された状態です。";
		next;
		mes "[タティオ]";
		mes "大部分の資料は、";
		mes "事故で焼失してしまいましたが……";
		mes "現在残っているものだけでも";
		mes "当時の状況を知り得る";
		mes "十分な材料になるでしょう。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "そんなに隠しておきたいなら、";
		mes "レッケンベルと君は";
		mes "どうしてウェルスシティの事を";
		mes "公開したんだ？";
		mes "なぜ、ファンタスマゴリカ計画などと";
		mes "人を募り、調査させたんだ。";
		next;
		cutin "ep15_tatio01",0;
		mes "[タティオ]";
		mes "正直に話しますと、つい最近まで";
		mes "実験棟のエナジーストームのせいで";
		mes "私も近寄る事ができなかったのです。";
		next;
		mes "[タティオ]";
		mes "理由は分かりませんが、";
		mes "なぜがそのエナジーストームが";
		mes "消えたので、危険性が無くなったという";
		mes "判断を下したこともあります。";
		next;
		mes "[タティオ]";
		mes "そしてこの世界も";
		mes "科学や工学への理解が進み、";
		mes "ウェルスシティの技術を知っても";
		mes "危険ではないと考えました。";
		next;
		mes "[タティオ]";
		mes "過ぎた技術は人間を滅ぼしかねません。";
		mes "子供の手に";
		mes "武器を握らせないのと同じように、";
		mes "私は機会を伺っていたのです。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "……すべて納得したわけではないが、";
		mes "大方理解した。";
		next;
		cutin "ep15_tatio01",0;
		mes "[タティオ]";
		mes "ご理解いただき、";
		mes "ありがとうございます。";
		mes "お約束通り、メモリーレコードの";
		mes "調査に対する独占権を";
		mes "アトナド発掘団に差し上げます。";
		next;
		mes "[タティオ]";
		mes "ただし情報の公開や開示内容は";
		mes "こちらで決定致します。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "わかった。";
		mes "メモリーレコードの調査は";
		mes "今までと同様に報告する。";
		mes "その情報の公開は君らに任せる。";
		next;
		mes "[イアン・アトナド]";
		mes "これでいいんだろ？";
		next;
		cutin "ep15_tatio01",0;
		mes "[タティオ]";
		mes "はい。ありがとうございます。";
		next;
		mes "[タティオ]";
		mes "メモリーレコードに記録された内容は、";
		mes "私にはすべて大事な思い出なのです。";
		mes "そう、まるで日記を見るような……。";
		mes "ですのでこれからも";
		mes "報告をお待ちしていますよ。";
		next;
		cutin "verus_ian04",2;
		mes "[イアン・アトナド]";
		mes "まったく。";
		mes "曾祖父の友人という者は";
		mes "世話のかかるヤツだな。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "さて、話は済んだ。";
		mes "私らは戻って作業の続きをしよう。";
		mes "お前たち、帰るぞ。";
		next;
		cutin "verus_ian01",255;
		mes "‐席を立ち、";
		mes "　帰り支度をするイアンが";
		mes "　小声で話しかけてきた‐";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "……納得した素振りを見せたが、";
		mes "実は私はまだ腑に落ちない部分がある。";
		mes "タティオ……あの男、";
		mes "ほかにも重要な事を隠しているように";
		mes "思えてならない。";
		next;
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "私も同感です。";
		mes "彼にはまだ何か……";
		mes "秘密や、隠している野望のようなものを";
		mes "感じます……。";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "アウレス、お前もか。";
		mes "こういう時の";
		mes "年寄の勘は案外当たるもんだ。";
		next;
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "フン……。まあいい。";
		mes "今は調査を進めることが最優先だ。";
		mes "私らは私らの";
		mes "やるべきことをやるだけだ。";
		next;
		mes "[イアン・アトナド]";
		mes "そうだ、" +strcharinfo(0)+ "。";
		mes "お前にこれを渡しておこう。";
		mes "発掘の最中に手に入れたものだが、";
		mes "どうやら古代の燃料のようだ。";
		mes "何かに使えるかもしれん。";
		mes "お前はこれを調べてみろ。";
		set VER_1QUE,37;
		delquest 118220;
		setquest 201765;
		getitem 6962,20;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		close2;
		cutin "verus_ian01",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "ep15_tatio03",0;
		mes "[タティオ]";
		mes "ご協力に感謝いたします。";
		close2;
		cutin "ep15_tatio01",255;
		end;
	}
}
lhz_in01.gat,272,255,3	script	イアン・アトナド#ep152i	10056,{/* 59963 */
	if(VER_1QUE == 34) {
		cutin "verus_ian01.bmp", 2;
		mes "[イアン・アトナド]";
		mes "来たか。";
		mes "みんな集まったようだな。";
		mes "何の話かわからんが";
		mes "ともかく話を聞いてみるか。";
		close2;
		cutin "verus_ian01.bmp", 255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "話とはなんだ。";
		mes "何が聞きたい。";
		next;
		cutin "Arquien_n_atnad01",0;
		mes "[ナイル]";
		mes "今、あの人が話したのは、";
		mes "父さんが失踪した時の話なのか？";
		mes "今の話の記憶喪失が、";
		mes "何年間も勝手に";
		mes "ほっつきまわっていた原因なのか？";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[ナイル]";
		mes "その一週間の記憶のために";
		mes "ずっとジュピロスの研究を……";
		mes "そのために、";
		mes "そんな事のために、";
		mes "私と家を捨てたのか!?";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "そんなことだと!?";
		mes "私の研究に対する情熱を";
		mes "そんな風に言うのはやめろ！";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "私だって一人の学者である前に";
		mes "一人の娘の父だ。";
		mes "何も研究にだけに";
		mes "没頭していたわけではない。";
		next;
		mes "[イアン・アトナド]";
		mes "お前宛の手紙だって家に送った。";
		mes "それに返信しなかったのは";
		mes "お前じゃないか！";
		next;
		cutin "Arquien_n_atnad04",0;
		mes "[ナイル]";
		mes "何をえらそうに！";
		mes "手紙なんてものは見ていない！";
		mes "どうせ、私が家を処分した後に";
		mes "送ったんだろう？";
		mes "そんなの届くわけないじゃないか！";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "おまえが勝手に家を売ったせいだろう！";
		mes "たかだか数年、我慢できずに";
		mes "私が苦労して手に入れた家を売って";
		mes "行方をくらますなんて、";
		mes "わがままにも程があるだろう！";
		next;
		mes "‐平行線の言い合いが続いている。";
		mes "　アウレスと主席秘書官が";
		mes "　困った顔でこちらを見ている‐";
		next;
		menu "とりあえず話の続きを聞きませんか？",-;
		cutin "Arquien_n_atnad02",0;
		mes "[ナイル]";
		mes "む……確かにそうだな……。";
		mes "と、とにかくこの事件の原因は、";
		mes "あそこにいる主席秘書官殿に";
		mes "あるんだろう？";
		mes "詳しく話を聞こうじゃないか。";
		set VER_1QUE,36;
		delquest 118215;
		setquest 118220;
		close2;
		cutin "Arquien_n_atnad02",255;
		end;
	}
	else if(VER_1QUE == 36) {
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "やれやれ……。";
		mes "私も熱くなって大人げないな……。";
		mes "どうして私を攻撃したのか、";
		mes "彼に詳しく話を聞こう。";
		mes "私たち家族の話し合いはその後だ。";
		close2;
		cutin "verus_ian01",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "やつらにはやつらの思惑が";
		mes "あるのだろうが、";
		mes "私らは私らの";
		mes "やるべきことをやるだけだ。";
		next;
		mes "[イアン・アトナド]";
		mes "さあ、帰るぞ。";
		mes "戻って作業の続きをしよう。";
		next;
		if(select("もう少しここにいる","帰る") == 1) {
			mes "[イアン・アトナド]";
			mes "なんだ？　まだここに居るのか？";
			mes "用事があるなら";
			mes "さっさと終わらせるんだ。";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		mes "[イアン・アトナド]";
		mes "わかった。";
		mes "では、帰ろう。";
		close2;
		cutin "verus_ian01",255;
		warp "verus04.gat",142,188;
		end;
	}
OnTalk1:
	unittalk "イアン・アトナド : !?";
	end;
OnTalk2:
	unittalk "イアン・アトナド : 護衛なんぞいらん！";
	end;
}
lhz_in01.gat,267,255,7	script	アウレス#ep152i01	10057,{/* 59964 */
	if(VER_1QUE == 34) {
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "来ましたか。";
		mes "話が始まるまで少し待ちましょう。";
		next;
		mes "[アウレス]";
		mes "あの二人が一緒にいるところを見るのは";
		mes "久しぶりですね。";
		mes "あの二人は本当にそっくりだ。";
		close2;
		cutin "verus_aures",255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "レッケンベル社に";
		mes "招かれる日が来るとは……。";
		close2;
		cutin "verus_aures",255;
		end;
	}
	else if(VER_1QUE == 36) {
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "とんでもない話でしたが、";
		mes "この一件であの親子の溝が";
		mes "少しでも埋まれば良いですね。";
		next;
		mes "[アウレス]";
		mes "イアンは本当は娘想いの父なのですよ。";
		mes "それを表に出すのが";
		mes "恥ずかしいだけなのです。";
		close2;
		cutin "verus_aures",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "verus_aures",0;
		mes "[アウレス]";
		mes "とんでもない話でしたが、";
		mes "この一件であの親子の溝が";
		mes "少しでも埋まれば良いですね。";
		next;
		mes "[アウレス]";
		mes "イアンは本当は娘想いの父なのですよ。";
		mes "それを表に出すのが";
		mes "恥ずかしいだけなのです。";
		close2;
		cutin "verus_aures",255;
		end;
	}
}
lhz_in01.gat,272,251,3	script	団長アルクイエン#ep152i	951,{/* 59965 */
	if(VER_1QUE == 34) {
		cutin "Arquien_n_atnad01",2;
		mes "[ナイル]";
		mes "どんな大げさな話をするために";
		mes "私たちを集めたのか";
		mes "聞いてみようじゃないか。";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "verus_ian01",2;
		mes "[イアン・アトナド]";
		mes "話とはなんだ。";
		mes "何が聞きたい。";
		next;
		cutin "Arquien_n_atnad01",0;
		mes "[ナイル]";
		mes "今、あの人が話したのは、";
		mes "父さんが失踪した時の話なのか？";
		mes "今の話の記憶喪失が、";
		mes "何年間も勝手に";
		mes "ほっつきまわっていた原因なのか？";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[ナイル]";
		mes "その一週間の記憶のために";
		mes "ずっとジュピロスの研究を……";
		mes "そのために、";
		mes "そんな事のために、";
		mes "私と家を捨てたのか!?";
		next;
		cutin "verus_ian02",2;
		mes "[イアン・アトナド]";
		mes "そんなことだと!?";
		mes "私の研究に対する情熱を";
		mes "そんな風に言うのはやめろ！";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "私だって一人の学者である前に";
		mes "一人の娘の父だ。";
		mes "何も研究にだけに";
		mes "没頭していたわけではない。";
		next;
		mes "[イアン・アトナド]";
		mes "お前宛の手紙だって家に送った。";
		mes "それに返信しなかったのは";
		mes "お前じゃないか！";
		next;
		cutin "Arquien_n_atnad04",0;
		mes "[ナイル]";
		mes "何をえらそうに！";
		mes "手紙なんてものは見ていない！";
		mes "どうせ、私が家を処分した後に";
		mes "送ったんだろう？";
		mes "そんなの届くわけないじゃないか！";
		next;
		cutin "verus_ian03",2;
		mes "[イアン・アトナド]";
		mes "おまえが勝手に家を売ったせいだろう！";
		mes "たかだか数年、我慢できずに";
		mes "私が苦労して手に入れた家を売って";
		mes "行方をくらますなんて、";
		mes "わがままにも程があるだろう！";
		next;
		mes "‐平行線の言い合いが続いている。";
		mes "　アウレスと主席秘書官が";
		mes "　困った顔でこちらを見ている‐";
		next;
		menu "とりあえず話の続きを聞きませんか？",-;
		cutin "Arquien_n_atnad02",0;
		mes "[ナイル]";
		mes "む……確かにそうだな……。";
		mes "と、とにかくこの事件の原因は、";
		mes "あそこにいる主席秘書官殿に";
		mes "あるんだろう？";
		mes "詳しく話を聞こうじゃないか。";
		set VER_1QUE,36;
		delquest 118215;
		setquest 118220;
		close2;
		cutin "Arquien_n_atnad02",255;
		end;
	}
	else if(VER_1QUE == 36) {
		cutin "Arquien_n_atnad02",0;
		mes "[ナイル]";
		mes "あそこにいる主席秘書官殿に";
		mes "詳しく話を聞こうじゃないか。";
		mes "どんな理由であれ、";
		mes "私を納得させられる内容でなければ";
		mes "容赦はしないがな。";
		close2;
		cutin "Arquien_n_atnad02",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "Arquien_n_atnad02",2;
		mes "[ナイル]";
		mes "あのメモリーレコードには";
		mes "思い出が綴られているんだな。";
		mes "時代を超えた日記……か。";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[ナイル]";
		mes "さあ、帰るぞ。";
		mes "遊んでる暇はないんだ。";
		mes "さっさと仕事に戻れ。";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	}
}

lhz_in01.gat,275,251,3	script	ルークラフェズ#ep152i01	953,{/* 59966 */
	cutin "looke_rapez04",0;
	mes "[ルーク]";
	mes "ここには護衛としてきただけだ。";
	close2;
	cutin "looke_rapez02",255;
	initnpctimer;
	end;
OnTimer200:
	donpcevent "イアン・アトナド#ep152i::OnTalk2";
	end;
OnTimer700:
	emotion 6,"団長アルクイエン#ep152i";
	end;
OnTimer900:
	stopnpctimer;
	emotion 9,"ルークラフェズ#ep152i01";
	end;
}

verus04.gat,91,252,5	script	考古学者#tevt01	993,{/* 59277 */
	mes "[考古学者]";
	mes "私たちは";
	mes "時にはこうやって集まって、";
	mes "情報共有の会合を開いています。";
	close;
}

verus04.gat,89,251,5	script	歴史学者#tevt02	693,{/* 59279 */
	mes "[歴史学者]";
	mes "作業にあたっての辛いことですか？";
	mes "たまにですが、食事が";
	mes "とてもまずい時があります……。";
	next;
	mes "[歴史学者]";
	mes "ウェルスシティに来て、";
	mes "それが私の最初の試練でした。";
	close;
}
verus04.gat,91,248,7	script	新参発掘団員#tevt03	690,{/* 59280 */
	mes "[新参発掘団員]";
	mes "まだ知らない事が多く、";
	mes "色々と勉強をさせていただいています！";
	mes "まずは頭を使うより、";
	mes "体を使う仕事を頑張りたいですね。";
	next;
	mes "[新参発掘団員]";
	mes "ここはご飯も、お金も、寝る場所も、";
	mes "そして知識もくれるから";
	mes "最高の場所です！";
	close;
}
verus04.gat,94,251,3	script	文明学者#tevt04	10003,{/* 59281 */
	mes "[文明学者]";
	mes "私はここもジュピロスの一部だと";
	mes "考えていましたが……";
	mes "それは間違った仮説のような";
	mes "気がしてなりません。";
	next;
	mes "[文明学者]";
	mes "……似ているようで違う。";
	mes "それが何かはまだわかりませんが。";
	close;
}
verus04.gat,94,248,1	script	科学者#tevt05	755,{/* 59282 */
	mes "[科学者]";
	mes "ここの機械の発展は本当に";
	mes "驚くほど素晴らしいものです。";
	mes "いかなる魔法も使用していません。";
	next;
	mes "[科学者]";
	mes "しかし技術が大きい程、";
	mes "急な発展は人に混乱を招くのです。";
	mes "この地もそうだったのでしょうか。";
	close;
}
verus04.gat,135,213,4	script	立て札#EP15_1D中	857,{/* 59283 */
	mes "[注意事項]";
	mes "ウェルスシティへ";
	mes "ご来訪頂いた方に注意事項を";
	mes "お知らせします。";
	next;
	mes "[注意事項]";
	mes "現在、滅亡祝福教団と名乗る";
	mes "過激な教団が活動中ですので、";
	mes "被害に遭わないよう、";
	mes "注意して下さい。";
	next;
	mes "[注意事項]";
	mes "もし被害に遭われた方や、";
	mes "被害事例を目撃された方は";
	mes "ウェルスシティ警備隊まで";
	mes "ご連絡下さい。";
	mes "　";
	mes "‐ウェルスシティ警備隊長‐";
	close;
}
verus04.gat,133,212,4	script	警備隊長ケスラー#EP15_1	119,{/* 59284 */
	if(checkquest(5318) & 0x2)
		delquest 5318;
	emotion 19,"警備隊長ケスラー#EP15_1";
	mes "[警備隊長ケスラー]";
	mes "ようこそ。";
	mes "ここはウェルスシティだ。";
	if(countitem(6753) > 0 || (countitem(6753) > 0 && checkquest(5304)))
		set '@str$,"滅亡の証を持って来ました";
	else
		set '@str$,"警備隊とは何ですか？";
	next;
	switch(select("何か手伝う事はありませんか？",'@str$,"ウェルスシティで注意する点は？","何でもありません。")) {
	case 1:
		if(checkquest(5309)) {
			if(!checkquest(5310) || !checkquest(5311) || !checkquest(5312) || !checkquest(5313)) {
				emotion 1,"警備隊長ケスラー#EP15_1"; //59032
				mes "[警備隊長ケスラー]";
				mes "まだ全ての隊員と";
				mes "会っていないようだな。";
				next;
				mes "[警備隊長ケスラー]";
				mes "面倒だとは思うが、";
				mes "よろしく頼む。";
				close;
			}
			mes "‐達成した依頼の数は";
			mes "　4人中" +'@count+ "人です。";
			mes "　警備隊長ケスラーに";
			mes "　報告しますか？‐";
			next;
			if(select("報告する","報告しない") == 2) {
				mes "[警備隊長ケスラー]";
				mes "そうか。";
				mes "報告する準備が整ったら";
				mes "報告をしてくれ。";
				mes "君の報告を待っている。";
				close;
			}
			mes "[警備隊長ケスラー]";
			mes "ご苦労だった。";
			mes "全ての隊員の話を聞いてきたようだな。";
			next;
			mes "[警備隊長ケスラー]";
			mes "サルグラン、ゲレフ、";
			mes "スイデン、フィプス……。";
			mes "みんな何事も無いようで";
			mes "安心した。";
			next;
			mes "[警備隊長ケスラー]";
			mes "本当にありがとう。";
			mes "今日の活動に対する礼だ。";
			mes "受け取ってくれ。";
			next;
			delquest 5309;
			delquest 5310;
			delquest 5311;
			delquest 5312;
			delquest 5313;
			setquest 5318;
			switch('@count) {
			case 0:
				getexp 250000,125000;
				break;
			case 1:
				getexp 500000,250000;
				break;
			case 2:
				getexp 1000000,500000;
				break;
			case 3:
				getexp 1500000,750000;
				break;
			case 4:
				getexp 1500000,750000;
				break;
			}
			mes "[警備隊長ケスラー]";
			mes "もしよかったら";
			mes "明日も協力してくれると助かる。";
			close;
		}
		if(checkquest(5318)) {
			if(checkquest(5318) & 0x2 == 0) {
				mes "[警備隊長ケスラー]";
				mes "申し訳ない。";
				mes "気持ちはありがたいのだが、";
				mes "すぐに頼める仕事は";
				mes "なさそうだ。";
				close;
			}
		}
		emotion 23,"警備隊長ケスラー#EP15_1"; //59284
		mes "[警備隊長ケスラー]";
		mes "……今、何と!?";
		next;
		menu "手伝う事はありませんか？",-;
		mes "[警備隊長ケスラー]";
		mes "ま、まさか協力してくれるとは！";
		mes "最近は滅亡祝福教団のせいで";
		mes "治安が悪くなる一方でな……。";
		next;
		mes "[警備隊長ケスラー]";
		mes "ちょうどよかった。";
		mes "最近は隊員たちの苦情も";
		mes "聞いてやれていなかったからな。";
		next;
		mes "[警備隊長ケスラー]";
		mes "私の代わりにウェルスシティの";
		mes "隊員たちの苦情を";
		mes "聞いてきて欲しいのだ。";
		next;
		mes "[警備隊長ケスラー]";
		mes "現在、ウェルスシティ周辺では";
		mes "4名の隊員が警備を行っている。";
		next;
		mes "[警備隊長ケスラー]";
		mes "苦情を聞くだけでも構わないが";
		mes "もし、彼らの不満を解決してくれたら";
		mes "解決した人数に応じて";
		mes "報酬も弾むつもりだ。";
		mes "やってくれるか？";
		next;
		mes "‐このクエストでは、";
		mes "　まず4人の警備隊員を探しましょう。";
		mes "　4人の警備隊員からはそれぞれ";
		mes "　依頼を受けることができます‐";
		next;
		mes "‐依頼を達成しなくても、";
		mes "　クエストの進行が可能ですが";
		mes "　依頼を達成した場合、";
		mes "　^ff0000達成した人数に応じて^000000";
		mes "　^ff0000警備隊長ケスラーから^000000";
		mes "　^ff0000受け取る報酬が増加します^000000‐";
		next;
		if(select("やります","今度やります")) {
			emotion 28,"警備隊長ケスラー#EP15_1"; //59284
			mes "[警備隊長ケスラー]";
			mes "何……協力してくれるのでは";
			mes "なかったのか？";
			close;
		}
		setquest 5309;
		mes "[警備隊長ケスラー]";
		mes "それではよろしく頼む。 ";
		close;
	case 2:
		if(countitem(6753) == 0) {
			emotion 20,"警備隊長ケスラー#EP15_1"; //59284
			mes "[警備隊長ケスラー]";
			mes "^4E9867ウェルスシティ警備隊^000000が";
			mes "気になるのか？";
			mes "変わった奴だな。";
			next;
			mes "[警備隊長ケスラー]";
			mes "発掘が開始されて間もない場所に";
			mes "何で警備隊が必要なんだ？";
			mes "という奴も居るが、";
			mes "それなりの事情があるんだ。";
			next;
			menu "事情ですか？",-;
			mes "[警備隊長ケスラー]";
			mes "君は^F8081E滅亡祝福教団^000000という名前を";
			mes "聞いたことあるか？";
			next;
			emotion 6,"警備隊長ケスラー#EP15_1"; //59284
			mes "[警備隊長ケスラー]";
			mes "滅亡の時が到来したと叫びながら、";
			mes "様々な場所出没して、破壊活動を行う";
			mes "非常に厄介な団体だ。";
			next;
			mes "[警備隊長ケスラー]";
			mes "案の定、ウェルスシティにも現れて";
			mes "貴重な発掘物を破壊し、";
			mes "遺跡を傷つけている。";
			next;
			mes "[警備隊長ケスラー]";
			mes "その為、研究と発掘作業をしに来た";
			mes "学者や傭兵たちが自発的に";
			mes "警備隊を作るようになった。";
			mes "それがウェルスシティ警備隊だ。";
			next;
			mes "[警備隊長ケスラー]";
			mes "そうだ！";
			mes "もし^82ABE9ウェルス中央広場^000000の方を";
			mes "探検している途中に";
			mes "^F8081E滅亡祝福教団^000000を発見したら";
			mes "奴らを懲らしめてくれ！ ";
			next;
			emotion 18,"警備隊長ケスラー#EP15_1"; //59284
			mes "[警備隊長ケスラー]";
			mes "我々も人手不足でな……。";
			mes "よろしく頼む。";
			close;
		}
		if(checkquest(5304)) {
			mes "[警備隊長ケスラー]";
			mes "そういえば前回も滅亡の証を";
			mes "持って来たな？";
			next;
			mes "[警備隊長ケスラー]";
			mes "まだウェルスシティに";
			mes "滞在しているのを見ると";
			mes "ここを気に入ったようだな。";
			mes "ははは、もちろん私も";
			mes "ここを気に入っているさ。";
			while(1) {
				next;
				switch(select("滅亡の証で得る事ができるモノ","滅亡の証を渡す","なんでもない")) {
				case 1:
					mes "[警備隊長ケスラー]";
					mes "わかった。";
					mes "もう一度説明しよう。";
					next;
					mes "[警備隊長ケスラー]";
					mes "滅亡の証を持ってくれば";
					mes "ウェルスシティで";
					mes "発見されている古びた燃料タンクに";
					mes "交換しよう。";
					next;
					mes "[警備隊長ケスラー]";
					mes "何に使うのかわからないが";
					mes "東の方にロボットが居たはずだ。";
					mes "そいつに渡したら何かあるかもな。";
					continue;
				case 2:
					mes "[警備隊長ケスラー]";
					mes "わかった。";
					mes "一度に^ff000050^000000個までなら";
					mes "渡せるが……。";
					mes "いくつ欲しいんだ？";
					next;
					input '@num;
					if('@num < 1 || '@num > 50) {
						mes "[警備隊長ケスラー]";
						mes "すまないが、一度に渡せるのは";
						mes "^ff000050^000000個までなんだ。";
						close;
					}
					if(countitem(6753) < '@num*5) {
						mes "[警備隊長ケスラー]";
						mes "……おや？　";
						mes "滅亡の証の数が足りないようだな。";
						mes "古びた燃料タンク^0000ff1^000000個を交換するには";
						mes "滅亡の証を^0000ff5^000000個が必要だ。";
						close;
					}
					mes "[警備隊長ケスラー]";
					mes '@num+ "個欲しいのか？";
					mes "それなら滅亡の証";
					mes ('@num*5)+ "個と交換しよう。";
					next;
					if(select("お願いします","やめておく") == 2) {
						mes "[警備隊長ケスラー]";
						mes "わかった。";
						mes "今交換しないからと言って";
						mes "協力して貰った感謝は忘れない。";
						close;
					}
					if(checkitemblank() == 0) {
						// 未調査
						close;
					}
					delitem 6753,'@num*5;
					getitem 6962,'@num;
					mes "[警備隊長ケスラー]";
					mes "これが約束の品だ。";
					mes "また、滅亡の証を手に入れたら";
					mes "持ってきてくれ。";
					mes "よろしく頼む。";
					close;
				case 3:
					emotion 20,"警備隊長ケスラー#EP15_1"; //59030
					mes "[警備隊長ケスラー]";
					mes "む？";
					mes "先ほど滅亡の証を持って来たと";
					mes "言っていたような気が……。";
					close;
				}
			}
		}
		emotion 23,"警備隊長ケスラー#EP15_1"; //59030
		mes "[警備隊長ケスラー]";
		mes "これは滅亡祝福教団信者たちが";
		mes "持ち歩いているという";
		mes "^F8081E滅亡の証^000000ではないか！";
		next;
		mes "[警備隊長ケスラー]";
		mes "どこで手に入れた？";
		next;
		menu "手に入れた場所を教える",-;
		emotion 15,"警備隊長ケスラー#EP15_1"; //59030
		mes "[警備隊長ケスラー]";
		mes "本当か!?";
		mes "貴重な情報をありがとう。";
		mes "警備隊を代表して感謝する。 ";
		next;
		mes "[警備隊長ケスラー]";
		mes "これは何か謝礼をしなければ";
		mes "いけないな……う〜む。";
		next;
		emotion 0,"警備隊長ケスラー#EP15_1"; //59030
		mes "[警備隊長ケスラー]";
		mes "そうだ！";
		mes "^F8081E滅亡の証^000000を持ってくれば";
		mes "^4E9867古びた燃料タンク^000000と交換しよう。";
		next;
		menu "古びた燃料タンク？",-;
		mes "[警備隊長ケスラー]";
		mes "古びた燃料タンクとは、";
		mes "ウェルスシティで";
		mes "発見されている燃料だ。";
		next;
		mes "[警備隊長ケスラー]";
		mes "何に使うのかわからないが";
		mes "東の方にロボットが居たはずだ。";
		mes "そいつに渡したら何かあるかもな。";
		next;
		mes "[警備隊長ケスラー]";
		mes "滅亡の証^0000ff5^000000個を";
		mes "古びた燃料タンク^0000ff1^000000個に";
		mes "交換するか？";
		mes "もちろん、後で交換しても構わないぞ。";
		next;
		if(select("今交換する","後で交換する") == 2) {
			setquest 5304;
			compquest 5304;
			mes "[警備隊長ケスラー]";
			mes "わかった。";
			mes "今交換しないからと言って";
			mes "協力して貰った感謝は忘れない。";
			next;
			mes "[警備隊長ケスラー]";
			mes "これからも滅亡祝福教団が";
			mes "活動するのを見かけたら、";
			mes "協力してくれると助かる。";
			close;
		}
		// 未調査
		mes "[警備隊長ケスラー]";
		mes "わかった。";
		mes "一度に^ff000050^000000個までなら";
		mes "渡せるが……。";
		mes "いくつ欲しいんだ？";
		next;
		input '@num;
		if('@num < 1 || '@num > 50) {
			mes "[警備隊長ケスラー]";
			mes "すまないが、一度に渡せるのは";
			mes "^ff000050^000000個までなんだ。";
			close;
		}
		if(countitem(6753) < '@num*5) {
			mes "[警備隊長ケスラー]";
			mes "……おや？　";
			mes "滅亡の証の数が足りないようだな。";
			mes "古びた燃料タンク^0000ff1^000000個を交換するには";
			mes "滅亡の証を^0000ff5^000000個が必要だ。";
			close;
		}
		mes "[警備隊長ケスラー]";
		mes '@num+ "個欲しいのか？";
		mes "それなら滅亡の証";
		mes ('@num*5)+ "個と交換しよう。";
		next;
		if(select("お願いします","やめておく") == 2) {
			mes "[警備隊長ケスラー]";
			mes "わかった。";
			mes "今交換しないからと言って";
			mes "協力して貰った感謝は忘れない。";
			close;
		}
		if(checkitemblank() == 0) {
			// 未調査
			close;
		}
		delitem 6753,'@num*5;
		getitem 6962,'@num;
		mes "[警備隊長ケスラー]";
		mes "これが約束の品だ。";
		mes "また、滅亡の証を手に入れたら";
		mes "持ってきてくれ。";
		mes "よろしく頼む。";
		close;
	case 3:
		emotion 0,"警備隊長ケスラー#EP15_1"; //59284
		mes "[警備隊長ケスラー]";
		mes "ウェルスシティに来るのは";
		mes "初めてのようだな。";
		next;
		mes "[警備隊長ケスラー]";
		mes "ウェルスシティは";
		mes "最近、発掘が開始された場所で";
		mes "行動の制限は厳しくない。";
		next;
		emotion 0,"警備隊長ケスラー#EP15_1"; //59284
		mes "[警備隊長ケスラー]";
		mes "だが、一点だけ、";
		mes "気を付けて頂きたい事がある。";
		next;
		mes "[警備隊長ケスラー]";
		mes "ここ^82ABE9ウェルス発掘地^000000は安全だが";
		mes "^82ABE9ウェルス中央広場^000000の方に行くなら、";
		mes "しっかり準備をしておく事だ。";
		next;
		mes "[警備隊長ケスラー]";
		mes "ここはまだ発掘が開始されて間もない。";
		mes "だから本来は全ての発掘物は";
		mes "丁重に扱うべきなのだが……。";
		next;
		emotion 6,"警備隊長ケスラー#EP15_1"; //59284
		mes "[警備隊長ケスラー]";
		mes "それを滅亡祝福教団の奴らめ！";
		mes "滅亡祝福教団など滅びてしまえ！";
		next;
		mes "[警備隊長ケスラー]";
		mes "……失礼した。";
		next;
		mes "[警備隊長ケスラー]";
		mes "見てくれ。";
		mes "最近はストレスで抜け毛が酷いんだ。";
		mes "ただでさえ、髪の毛が";
		mes "少ないというのに……。";
		next;
		mes "[警備隊長ケスラー]";
		mes "話が脱線してしまったな。";
		mes "すまなかった。";
		next;
		emotion 33,"警備隊長ケスラー#EP15_1"; //59284
		mes "[警備隊長ケスラー]";
		mes "まあ、ここで発掘された物が ";
		mes "傷つかないように";
		mes "注意しろという事だ。";
		close;
	case 4:
		emotion 22,"警備隊長ケスラー#EP15_1"; //59284
		mes "[警備隊長ケスラー]";
		mes "^F8081E滅亡祝福教団^000000を見かけたら";
		mes "近くにいる警備隊に知らせてくれ。";
		close;
	}
OnInit:
	waitingroom "警備隊長の依頼",0; //59284
	end;
}
verus03.gat,38,114,4	script	立て札#EP15_1D東	857,{/* 59285 */
	mes "[注意事項]";
	mes "ウェルスシティへ";
	mes "ご来訪頂いた方に注意事項を";
	mes "お知らせします。";
	next;
	mes "[注意事項]";
	mes "現在、滅亡祝福教団と名乗る";
	mes "過激な教団が活動中ですので、";
	mes "被害に遭わないよう、";
	mes "注意して下さい。";
	next;
	mes "[注意事項]";
	mes "もし被害に遭われた方や、";
	mes "被害事例を目撃された方は";
	mes "ウェルスシティ警備隊まで";
	mes "ご連絡下さい。";
	mes "  ";
	mes "‐ウェルスシティ警備隊長‐";
	close;
}
verus03.gat,36,113,4	script	警備隊員サルグラン#EP15	118,{/* 59286 */
	if(checkquest(5309) == 0) {
		misceffect 197,"警備隊員サルグラン#EP15"; //59286
		mes "[警備隊員サルグラン]";
		mes "ぐぅぐぅ……。";
		next;
		emotion 19,"警備隊員サルグラン#EP15"; //59286
		mes "[警備隊員サルグラン]";
		mes "た、隊長助けて下さい。";
		next;
		mes "‐誰かが寝言を言っている‐";
		close;
	}
	if(checkquest(5310)) {
		mes "[警備隊員サルグラン]";
		mes "何だ、まだ隊長の任務が";
		mes "終わってないのか？";
		mes "こっちは特に変わった事はないぞ。";
		close;
	}
	if(checkquest(5315) || checkquest(5316) || checkquest(5317)) {
		mes "[警備隊員サルグラン]";
		mes "他の区域の仕事をしているのか？";
		mes "だったら、そっちの仕事を";
		mes "終わらせてから来るんだな。";
		close;
	}
	if(checkquest(5314)) {
		mes "[警備隊員サルグラン]";
		mes "もう目印を撤去してきたのか？";
		mes "少し、早すぎないか？";
		next;
		switch(select("全部撤去した","教団の目印はどこにあるの？","やめたいです","何でもない")) {
		case 1:
			if(checkquest(5314) & 0x4 == 0) {
				emotion 54,"警備隊員サルグラン#EP15"; //59032
				mes "[警備隊員サルグラン]";
				mes "何だ、まだじゃないか。";
				mes "少なくとも^ff000010個^000000は";
				mes "撤去して来てくれ。";
				close;
			}
			if(!checkquest(5305)) {
				setquest 5305;
				compquest 5305;
			}
			delquest 5314;
			setquest 5310;
			mes "[警備隊員サルグラン]";
			mes "おお！　ご苦労だった。";
			mes "隊長も喜んでくれるだろう。";
			close;
		case 2:
			emotion 23,"警備隊員サルグラン#EP15"; //59032
			mes "[警備隊員サルグラン]";
			mes "ウェルスシティ中に";
			mes "ばら撒かれているはずだが……。";
			mes "アンタには見えなかったのか？";
			close;
		case 3:
			mes "‐依頼を破棄した場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員サルグラン]";
				mes "おや、気が変わったか？";
				mes "もし手伝う気になってくれたなら";
				mes "もう一度話しかけてくれよな。";
				close;
			}
			//未調査
			setquest 5305;
			compquest 5305;
			delquest 5314;
			setquest 5310;
			mes "[警備隊員サルグラン]";
			mes "そうか……急用なら仕方ないな。";
			mes "隊長には私から伝えておく。";
			mes "急いで行った方が良いぞ。";
			close;
		case 4:
			emotion 20,"警備隊員サルグラン#EP15"; //59032
			mes "[警備隊員サルグラン]";
			mes "……？";
			mes "おかしな奴だな。";
			close;
		}
	}
	if(checkquest(5305)) {
		emotion 12,"警備隊員サルグラン#EP15"; //59032
		mes "[警備隊員サルグラン]";
		mes "今日も隊長の頼みで来たのか？";
		next;
		emotion 1,"警備隊員サルグラン#EP15"; //59032
		mes "[警備隊員サルグラン]";
		mes "よかった。";
		mes "今日も教団の目印の撤去を";
		mes "手伝ってくれないか？";
		next;
		if(select("協力する","今日は忙しいから今度") == 2) {
			mes "‐依頼を受けない場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員サルグラン]";
				mes "おや、気が変わったか？";
				mes "もし手伝う気になってくれたなら";
				mes "もう一度話しかけてくれよな。";
				close;
			}
			emotion 54,"警備隊員サルグラン#EP15"; //59032
			setquest 5310;
			mes "[警備隊員サルグラン]";
			mes "忙しいならしょうがない。";
			mes "隊長には特に変わった事はないと";
			mes "伝えておいてくれ。";
			close;
		}
	}
	else {
		misceffect 197,"警備隊員サルグラン#EP15"; //59032
		menu "あの……",-;
		emotion 23,"警備隊員サルグラン#EP15"; //59032
		mes "[警備隊員サルグラン]";
		mes "うわああっ!!";
		mes "ケスラー隊長!?";
		mes "お……私は寝ていません！";
		next;
		emotion 9,"警備隊員サルグラン#EP15"; //59032
		emotion 9,""; //self
		mes "[警備隊員サルグラン]";
		mes "……。";
		next;
		mes "[警備隊員サルグラン]";
		mes "あ……？";
		mes "何だよ隊長かと思ったじゃねーか。";
		mes "アンタ、誰だ？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "警備隊長から言われて来ました。";
		next;
		emotion 43,"警備隊員サルグラン#EP15"; //59032
		mes "[警備隊員サルグラン]";
		mes "なるほど、隊長の代理か。";
		mes "それならちょうど良い、";
		mes "少し協力してくれないか？";
		next;
		if(select("協力する","今日は忙しいから次の機会に") == 2) {
			mes "‐依頼を受けない場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員サルグラン]";
				mes "おや、気が変わったか？";
				mes "もし手伝う気になってくれたなら";
				mes "もう一度話しかけてくれよな。";
				close;
			}
			emotion 54,"警備隊員サルグラン#EP15"; //59032
			setquest 5305;
			compquest 5305;
			setquest 5310;
			mes "[警備隊員サルグラン]";
			mes "忙しいならしょうがない。";
			mes "隊長には特に変わった事はないと";
			mes "伝えておいてくれ。";
			close;
		}
	}
	setquest 5314;
	mes "[警備隊員サルグラン]";
	mes "いつも悪いな。";
	mes "それじゃあ、教団の目印を";
	mes "^ff000010個^000000ほど撤去したら";
	mes "俺に教えてくれ。";
	close;
}
verus03.gat,116,39,4	script	立て札#EP15_1D?	857,{/* 59287 */
	mes "[注意事項]";
	mes "ウェルスシティへ";
	mes "ご来訪頂いた方に注意事項を";
	mes "お知らせします。";
	next;
	mes "[注意事項]";
	mes "現在、滅亡祝福教団と名乗る";
	mes "過激な教団が活動中ですので、";
	mes "被害に遭わないよう、";
	mes "注意して下さい。";
	next;
	mes "[注意事項]";
	mes "もし被害に遭われた方や、";
	mes "被害事例を目撃された方は";
	mes "ウェルスシティ警備隊まで";
	mes "ご連絡下さい。";
	mes "  ";
	mes "‐ウェルスシティ警備隊長‐";
	close;
}
verus03.gat,116,36,6	script	警備隊員ゲレフ#EP15_1D	748,{/* 59288 */
	if(checkquest(5309) == 0) {
		emotion 57,"警備隊員ゲレフ#EP15_1D"; //59288
		mes "[警備隊員ゲレフ]";
		mes "うぅ……ストレスが溜まる。";
		mes "早くストレス解消する方法を";
		mes "見つけないと……。";
		mes "また胃が……。";
		next;
		mes "‐誰かが苦しそうにしている‐";
		close;
	}
	if(checkquest(5311)) {
		emotion 2,"警備隊員ゲレフ#EP15_1D"; //59034
		mes "[警備隊員ゲレフ]";
		mes "気分は少し良くなってきました。";
		mes "ケスラー隊長には特に変わった事は";
		mes "ないと報告して下さい。";
		close;
	}
	if(checkquest(5314) || checkquest(5316) || checkquest(5317)) {
		emotion 19,"警備隊員ゲレフ#EP15_1D"; //59034
		mes "[警備隊員ゲレフ]";
		mes "うっ……胃痛がひどい……。";
		mes "悪いけど、少し休みたいんだ。";
		mes "君は今やっている仕事を";
		mes "終えてから来てくれないかな？";
		close;
	}
	if(checkquest(5315)) {
		emotion 23,"警備隊員ゲレフ#EP15_1D"; //59034
		mes "[警備隊員ゲレフ]";
		mes "まさか……本当にもう";
		mes "罠を撤去したのですか？";
		next;
		switch(select("撤去完了！","罠はどこにありますか","急用が……","何でもありません")) {
		case 1:
			if(QUE3_VER == 0) {
				mes "[警備隊員ゲレフ]";
				mes "まだ一個も罠を";
				mes "撤去していませんね。";
				mes "お手数ですが、";
				mes "罠を^ff000010個^000000撤去して来てください。";
				close;
			}
			if(QUE3_VER < 10) {
				emotion 57,"警備隊員ゲレフ#EP15_1D"; //59034
				mes "[警備隊員ゲレフ]";
				mes "まだ^ff0000" +QUE3_VER+ "個^000000しか罠を";
				mes "撤去していませんね。";
				mes "お手数ですが、";
				mes "罠を^ff000010個^000000撤去して来てください。";
				close;
			}
			if(checkquest(5306)) {
				setquest 5306;
				compquest 5306;
			}
			delquest 5315;
			setquest 5311;
			mes "[警備隊員ゲレフ]";
			mes "ご苦労様でした。";
			mes "罠が消えたら気分が少し";
			mes "よくなった気がします。";
			mes "隊長への報告もよろしくお願いします。";
			close;
		case 2:
			emotion 36,"警備隊員ゲレフ#EP15_1D"; //59034
			mes "[警備隊員ゲレフ]";
			mes "あれ……？";
			mes "罠が見つかりませんでしたか？";
			next;
			mes "[警備隊員ゲレフ]";
			mes "滅亡祝福教団の奴ら";
			mes "あんなにたくさん";
			mes "設置しているのに。";
			next;
			mes "[警備隊員ゲレフ]";
			mes "あぁ……またストレスで胃が……。";
			close;
		case 3:
			mes "‐依頼を破棄する場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員ゲレフ]";
				mes "気が変わりましたか？";
				mes "もし、気が変わったなら";
				mes "もう一度話しかけてください。";
				close;
			}
			//未調査
			if(checkquest(5306)) {
				setquest 5306;
				compquest 5306;
			}
			delquest 5315;
			setquest 5311;
			mes "[警備隊員ゲレフ]";
			mes "そうか……急用なら仕方ないな。";
			mes "隊長には私から伝えておく。";
			mes "急いで行った方が良いぞ。";
			close;
		case 4:
			emotion 57,"警備隊員ゲレフ#EP15_1D"; //59034
			mes "[警備隊員ゲレフ]";
			mes "そうですか……。";
			mes "うぅ……胃が……。";
			close;
		}
	}
	if(checkquest(5306)) {
		mes "[警備隊員ゲレフ]";
		mes "またお会いしましたね。";
		mes "今回も隊長の遣いですか？";
		next;
		mes "[警備隊員ゲレフ]";
		mes "もし時間があるようでしたら";
		mes "滅亡祝福教団が設置した罠を";
		mes "撤去して頂けますか？";
		next;
		if(select("協力します","次の機会に") == 2) {
			mes "‐依頼を受けない場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員ゲレフ]";
				mes "気が変わりましたか？";
				mes "もし、気が変わったなら";
				mes "もう一度話しかけてください。";
				close;
			}
			setquest 5311;
			mes "[警備隊員ゲレフ]";
			mes "ふーん。";
			mes "忙しいのに隊長の手伝いは";
			mes "するんですね。";
			mes "あ、僕が隊長じゃないから";
			mes "手伝ってくれないんですか？";
			next;
			emotion 36,"警備隊員ゲレフ#EP15_1D"; //59034
			mes "[警備隊員ゲレフ]";
			mes "まあ、戻ったらケスラー「隊長」には";
			mes "特に変わった事はないと";
			mes "伝えてください。";
			close;
		}
	}
	else {
		emotion 53,"警備隊員ゲレフ#EP15_1D"; //59036
		mes "[警備隊員ゲレフ]";
		mes "あれ？　ペンがない……。";
		mes "さっきは確かにあったのに……。";
		mes "どこに行ったんだろう？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "そこの耳に乗っかっていますよ。";
		next;
		emotion 23,"警備隊員ゲレフ#EP15_1D"; //59036
		mes "[警備隊員ゲレフ]";
		mes "あれ!?　いつのまに……。";
		mes "変ですね……。";
		next;
		emotion 1,"警備隊員ゲレフ#EP15_1D"; //59036
		mes "[警備隊員ゲレフ]";
		mes "っと、失礼いたしました。";
		mes "何か用ですか？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "警備隊長から言われて来ました。";
		next;
		emotion 6,"警備隊員ゲレフ#EP15_1D"; //59036
		mes "[警備隊員ゲレフ]";
		mes "ケスラー隊長の遣いの方ですね。";
		mes "ははは、隊長は羨ましいなあ。";
		mes "手伝ってくれる人がいるなんて。";
		next;
		if(select("手伝いましょうか？","今は協力することができません") == 2) {
			mes "‐依頼を受けない場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員ゲレフ]";
				mes "気が変わりましたか？";
				mes "もし、気が変わったなら";
				mes "もう一度話しかけてください。";
				close;
			}
			setquest 5306;
			compquest 5306;
			setquest 5311;
			mes "[警備隊員ゲレフ]";
			mes "ふーん。";
			mes "忙しいのに隊長の手伝いは";
			mes "するんですね。";
			mes "あ、僕が隊長じゃないから";
			mes "手伝ってくれないんですか？";
			next;
			emotion 36,"警備隊員ゲレフ#EP15_1D"; //59034
			mes "[警備隊員ゲレフ]";
			mes "まあ、戻ったらケスラー「隊長」には";
			mes "特に変わった事はないと";
			mes "伝えてください。";
			close;
		}
	}
	setquest 5315;
	mes "[警備隊員ゲレフ]";
	mes "ありがとうございます。";
	mes "それではウェルスシティの";
	mes "至る所に設置された罠を";
	mes "^ff000010個^000000ほど撤去して下さい。";
	close;
}
verus03.gat,83,241,4	script	立て札#EP15_1D南	857,{/* 59289 */
	mes "[注意事項]";
	mes "ウェルスシティへ";
	mes "ご来訪頂いた方に注意事項を";
	mes "お知らせします。";
	next;
	mes "[注意事項]";
	mes "現在、滅亡祝福教団と名乗る";
	mes "過激な教団が活動中ですので、";
	mes "被害に遭わないよう、";
	mes "注意して下さい。";
	next;
	mes "[注意事項]";
	mes "もし被害に遭われた方や、";
	mes "被害事例を目撃された方は";
	mes "ウェルスシティ警備隊まで";
	mes "ご連絡下さい。";
	mes "  ";
	mes "‐ウェルスシティ警備隊長‐";
	close;
}
verus03.gat,81,241,6	script	警備隊員スイデン#EP15_1	89,{/* 59290 */
	if(checkquest(5309) == 0) {
		emotion 29,"警備隊員スイデン#EP15_1"; //59290
		mes "[警備隊員スイデン]";
		mes "ふふふ……。";
		mes "私はあなたを知っています……。";
		mes "ですが、話をしたくありません。";
		mes "ふふ、ふふふ……。";
		next;
		mes "‐気持ち悪い人だ‐";
		close;
	}
	if(checkquest(5312)) {
		emotion 29,"警備隊員スイデン#EP15_1"; //59038
		mes "[警備隊員スイデン]";
		mes "ふふふ……。";
		mes "誰かの恨みを買わないように";
		mes "気を付けて下さい……。";
		close;
	}
	if(checkquest(5314) || checkquest(5315) || checkquest(5317)) {
		emotion 29,"警備隊員スイデン#EP15_1"; //59036
		mes "[警備隊員スイデン]";
		mes "ふふふ……。";
		mes "一度に出来る仕事はひとつだけ。";
		mes "さもなくば、ウェルスシティの";
		mes "恨みを受けますよ……。";
		mes "ふふ、ふふふ……。";
		close;
	}
	if(checkquest(5316)) {
		emotion 29,"警備隊員スイデン#EP15_1"; //59036
		mes "[警備隊員スイデン]";
		mes "ふふふ……。";
		mes "石は全部拾いましたか？";
		next;
		switch(select("全部拾いました","石はどこにありますか？","石を拾う時間がありません","なんでもありません")) {
		case 1:
			if(QUE3_VER == 0) {
				emotion 29,"警備隊員スイデン#EP15_1"; //59036
				mes "[警備隊員スイデン]";
				mes "ふふふ……。";
				mes "石はどこにあるんですか？";
				mes "早く拾って来ないと";
				mes "石で怪我をした";
				mes "警備隊員たちの怨念が……。";
				mes "ふふ、ふふふ……。";
				close;
			}
			if(QUE3_VER < 10 && countitem(7049) >= 10) {
				emotion 29,"警備隊員スイデン#EP15_1"; //59036
				mes "[警備隊員スイデン]";
				mes "ふふふ……。";
				mes "この石はどこから拾って来ました？";
				mes "私を騙すつもりでしたか？";
				mes "ふふ、ふふふ……。";
				close;
			}
			emotion 29,"警備隊員スイデン#EP15_1"; //59036
			delitem 7049,10;
			if(checkquest(5307)) {
				setquest 5307;
				compquest 5307;
			}
			delquest 5316;
			setquest 5312;
			mes "[警備隊員スイデン]";
			mes "ふふふ……。";
			mes "ご苦労様でした。";
			mes "お蔭で怪我をした者たちの";
			mes "怨念が消えていきます。";
			close;
		case 2:
			emotion 29,"警備隊員スイデン#EP15_1"; //59036
			mes "[警備隊員スイデン]";
			mes "ふふふ……。";
			mes "何故こんなことまで聞くんですか？";
			mes "まあ、いいでしょう。";
			mes "石はどこにでもあります。";
			next;
			mes "[警備隊員スイデン]";
			mes "ウェルスシティの地面を";
			mes "よく調べてみて下さい。";
			mes "ふふふ……。";
			close;
		case 3:
			mes "‐依頼を破棄する場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員スイデン]";
				mes "やっぱり……言われたとおりだ。";
				mes "……いえ、何でもありません。";
				mes "気が変わったのなら";
				mes "もう一度話しかけてください。";
				close;
			}
			//未調査
			if(checkquest(5307)) {
				setquest 5307;
				compquest 5307;
			}
			delquest 5316;
			setquest 5312;
			mes "[警備隊員スイデン]";
			mes "え……？";
			mes "こういう風に言えば";
			mes "聞いてくれると言われたのに……。";
			mes "隊長にはうまく話しておいて下さい。";
			close;
		case 4:
			emotion 29,"警備隊員スイデン#EP15_1"; //59036
			mes "[警備隊員スイデン]";
			mes "ふふふ……。";
			mes "分かりました。";
			mes "引き続き頑張って下さい……。";
			close;
		}
	}
	if(checkquest(5307)) {
		emotion 29,"警備隊員スイデン#EP15_1"; //59036
		mes "[警備隊員スイデン]";
		mes "ふふふ……。";
		mes "そろそろ来ると思っていました。";
		next;
		mes "[警備隊員スイデン]";
		mes "ふふふ……。";
		mes "今回もウェルスシティの";
		mes "安全の為に";
		mes "石を拾ってくれますか？";
		next;
		if(select("協力します","次の機会に…") == 2) {
			mes "‐依頼を破棄した場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員スイデン]";
				mes "やっぱり……言われたとおりだ。";
				mes "……いえ、何でもありません。";
				mes "気が変わったのなら";
				mes "もう一度話しかけてください。";
				close;
			}
			// 未調査
			emotion 20,"警備隊員スイデン#EP15_1"; //59038
			delquest 5307;
			setquest 5312;
			mes "[警備隊員スイデン]";
			mes "え……？";
			mes "こういう風に言えば";
			mes "聞いてくれると言われたのに……。";
			mes "隊長にはうまく話しておいて下さい。";
			close;
		}
	}
	else {
		emotion 29,"警備隊員スイデン#EP15_1"; //59038
		mes "[警備隊員スイデン]";
		mes "ふふふ……。";
		mes "隊長に言われてきた方ですね。";
		mes "お待ちしてましたよ。";
		mes "ずっと、ずーっと……。";
		mes "ふふ、ふふふふふふふ。";
		next;
		emotion 0,""; //self
		mes "[" +strcharinfo(0)+ "]";
		mes "!?";
		next;
		mes "[警備隊員スイデン]";
		mes "偶然、わかるようになりました。";
		mes "何がわかるか……ですか？";
		next;
		mes "[警備隊員スイデン]";
		mes "……。";
		mes "ふふ、ふふふ……。";
		next;
		mes "[警備隊員スイデン]";
		mes "ふふ、大したことではありません。";
		mes "気にしないで進みましょう。";
		mes "ふふふ……。";
		next;
		mes "[警備隊員スイデン]";
		mes "ああ、そうでした。";
		mes "あなたにお願いしたい";
		mes "仕事があるのです。";
		mes "協力してくれませんか？";
		next;
		if(select("協力します","今は厳しいです") == 2) {
			mes "‐依頼を受けない場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員スイデン]";
				mes "やっぱり……言われたとおりだ。";
				mes "……いえ、何でもありません。";
				mes "気が変わったのなら";
				mes "もう一度話しかけてください。";
				close;
			}
			emotion 20,"警備隊員スイデン#EP15_1"; //59038
			setquest 5307;
			compquest 5307;
			setquest 5312;
			mes "[警備隊員スイデン]";
			mes "え……？";
			mes "こういう風に言えば";
			mes "聞いてくれると言われたのに……。";
			mes "隊長にはうまく話しておいて下さい。";
			close;
		}
	}
	setquest 5316;
	mes "[警備隊員スイデン]";
	mes "ふふふ……。";
	mes "小さな石は投げても痛くもないし、";
	mes "怪我もしないらしいです。";
	mes "大きな石で^ff000010個お願いします。";
	close;
}
verus04.gat,204,260,4	script	立て札#EP15_1D北	857,{/* 59291 */
	mes "[注意事項]";
	mes "ウェルスシティへ";
	mes "ご来訪頂いた方に注意事項を";
	mes "お知らせします。";
	next;
	mes "[注意事項]";
	mes "現在、滅亡祝福教団と名乗る";
	mes "過激な教団が活動中ですので、";
	mes "被害に遭わないよう、";
	mes "注意して下さい。";
	next;
	mes "[注意事項]";
	mes "もし被害に遭われた方や、";
	mes "被害事例を目撃された方は";
	mes "ウェルスシティ警備隊まで";
	mes "ご連絡下さい。";
	mes "  ";
	mes "‐ウェルスシティ警備隊長‐";
	close;
}
verus04.gat,202,258,4	script	警備隊員フィプス#EP15_1	755,{/* 59292 */
	if(checkquest(5309) == 0) {
		emotion 37,"警備隊員フィプス#EP15_1"; //59292
		mes "[警備隊員フィプス]";
		mes "もぐもぐ……。";
		mes "ふむ、結構美味いじゃないか。";
		next;
		mes "‐誰かが肉を食べている‐";
		close;
	}
	if(checkquest(5313)) {
		emotion 21,"警備隊員フィプス#EP15_1"; //59040
		mes "[警備隊員フィプス]";
		mes "ここは私が責任を持って警備している。";
		mes "心配するな。";
		close;
	}
	if(checkquest(5314) || checkquest(5315) || checkquest(5316)) {
		// 未調査
		close;
	}
	if(checkquest(5317)) {
		emotion 1,"警備隊員フィプス#EP15_1"; //59038
		mes "[警備隊員フィプス]";
		mes "薬草の採集は終わったか？";
		next;
		switch(select("ここにあります","薬草はどこにありますか","急用が……","何でもありません")) {
		case 1:
			if(countitem(6754) == 0) {
				mes "[警備隊員フィプス]";
				mes "はて、薬草はどこだ？";
				next;
				mes "[警備隊員フィプス]";
				mes "私は食べることなく、";
				mes "薬草の在庫を増やしたいだけだ。";
				mes "いいか？";
				mes "私は食べていない。絶対にだ。";
				close;
			}
			if(countitem(6754) < 10) {
				mes "[警備隊員フィプス]";
				mes "こ、これは違うんだ！";
				mes "私は薬草を食べていたわけではない！";
				mes "そう、これは何かの間違いだ。";
				mes "だから、もう一度話しかけてくれ。";
				mes "仕切りなおそう、わかったね？";
				close;
			}
			// 未調査
			close;
		case 2:
			mes "[警備隊員フィプス]";
			mes "薬草の場所？";
			next;
			mes "[警備隊員フィプス]";
			mes "ウェルスシティにある";
			mes "青々とした茂みをよく調べれば";
			mes "採集出来そうな薬草があるはずだ。";
			close;
		case 3:
			mes "‐依頼を破棄する場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員フィプス]";
				mes "む、考えなおしてくれたのか？";
				mes "そうであれば助かるが……。";
				mes "考えが決まったら";
				mes "もう一度話しかけてくれ。";
				close;
			}
			if(checkquest(5308)) {
				setquest 5308;
				compquest 5308;
			}
			delquest 5317;
			setquest 5313;
			mes "[警備隊員フィプス]";
			mes "そうか……急用なら仕方ないな。";
			mes "隊長には私から伝えておく。";
			mes "急いで行った方が良いぞ。";
			close;
		case 4:
			mes "[警備隊員フィプス]";
			mes "薬草^ff000010個^000000だ。";
			mes "忘れるなよ。";
			close;
		}
	}
	if(checkquest(5308)) {
		mes "[警備隊員フィプス]";
		mes "ほう、今日も隊長に頼まれて来たのか？";
		next;
		mes "[警備隊員フィプス]";
		mes "相変わらず薬草が不足していてな。";
		mes "また採集を頼めるか？";
		next;
		if(select("採集してきます","次の機会に…") == 2) {
			mes "‐依頼を受けない場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員フィプス]";
				mes "む、考えなおしてくれたのか？";
				mes "そうであれば助かるが……。";
				mes "考えが決まったら";
				mes "もう一度話しかけてくれ。";
				close;
			}
			setquest 5313;
			mes "[警備隊員フィプス]";
			mes "そうか、仕方ないな。";
			mes "また次の機会に頼む。";
			close;
		}
	}
	else {
		emotion 37,"警備隊員フィプス#EP15_1"; //59040
		mes "[警備隊員フィプス]";
		mes "もぐもぐ……。";
		mes "ふむ、美味いな。";
		mes "くくく……。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "あの……。";
		next;
		emotion 23,"警備隊員フィプス#EP15_1"; //59040
		mes "[警備隊員フィプス]";
		mes "ほう、気が付かなくてすまない。";
		mes "恥ずかしい姿を見せたな。";
		next;
		mes "[警備隊員フィプス]";
		mes "私はウェルスシティの";
		mes "研究ををしているセージだ。";
		mes "名をフィプスと言う。";
		next;
		mes "[警備隊員フィプス]";
		mes "隊長の遣いか？";
		mes "ふむ、ちょうど良かった。";
		next;
		emotion 1,"警備隊員フィプス#EP15_1"; //59040
		mes "[警備隊員フィプス]";
		mes "そろそろ薬草の在庫が少ないんだ。";
		mes "採りに行く時間もなく、";
		mes "困っていたところだ。";
		mes "悪いが手伝ってくれるか？";
		next;
		if(select("手伝います","今はちょっと難しいです") == 2) {
			mes "‐依頼を受けない場合";
			mes "　クエストを報告する際に";
			mes "　警備隊長ケスラーから受け取る";
			mes "　^ff0000報酬が減少します‐^000000";
			next;
			mes "‐また、警備隊長ケスラーに報告し";
			mes "　クエストを達成するまで、";
			mes "　^ff0000依頼を受ける事は^000000";
			mes "　^ff0000できなくなります。^000000";
			mes "　本当によろしいですか？‐";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[警備隊員フィプス]";
				mes "む、考えなおしてくれたのか？";
				mes "そうであれば助かるが……。";
				mes "考えが決まったら";
				mes "もう一度話しかけてくれ。";
				close;
			}
			setquest 5308;
			compquest 5308;
			setquest 5313;
			mes "[警備隊員フィプス]";
			mes "そうか、仕方ないな。";
			mes "また次の機会に頼む。";
			close;
		}
	}
	setquest 5317;
	mes "[警備隊員フィプス]";
	mes "ありがとう。";
	mes "ウェルスシティにある";
	mes "成長した茂みをよく調べれば";
	mes "薬草を見つけられるはずだ。";
	mes "それを^ff000010個^000000ほど採集してきてくれ。";
	close;
}
verus03.gat,127,36,4	script	???#EP15_1D_01	550,{/* 59293 */
	if(!checkquest(5315) && !checkquest(5316))
		end;
	if(checkquest(5315)) {
		if(QUE3_VER >= 10) {
			mes "‐頼まれた数の罠を撤去した";
			mes "　警備隊員ゲレフに報告しよう‐";
			close;
		}
		emotion 0; //59039
		mes "‐この場所に違和感がある。";
		mes "　どうしようか？‐";
		next;
		if(select("調査してみる","そのままにしておく") == 2) {
			mes "‐その場を立ち去った‐";
			close;
		}
		progressbar 2; //color=0xffff00
		if(rand(100) < 25) {
			mes "‐違和感は気のせいだったようだ‐";
		}
		else {
			mes "‐滅亡祝福教団が設置した";
			mes "　罠を除去した‐";
			set QUE3_VER,QUE3_VER + 1;
		}
	}
	else if(checkquest(5316)) {
		if(QUE3_VER >= 10) {
			mes "‐大きな石を10個集めた。";
			mes "　警備兵スイデンに渡そう‐";
			close;
		}
		mes "‐地面に埋まっている石を見つけた。";
		mes "　どうしようか？‐";
		next;
		if(select("拾う","そのままにしておく") == 2) {
			mes "‐その場を立ち去った‐";
			close;
		}
		if(checkitemblank() == 0){
			mes "‐アイテムの種類数が多くて";
			mes "　持つことができない。";
			mes "　種類数を減らしてから拾おう‐";
			close;
		}
		if(rand(100) < 25) {
			mes "‐非常に小さな石だった。";
			mes "　これでは投げても";
			mes "　怪我はしないだろう‐";
		}
		else {
			getitem 7049,1;
			mes "‐大きな石を拾った。";
			mes "　人に投げたら";
			mes "　非常に危険だろう‐";
			set QUE3_VER,QUE3_VER + 1;
		}
	}
	close2;
	initnpctimer;
	hideonnpc; //59039
	end;
OnTimer30000:
	stopnpctimer;
	hideoffnpc; //59039
	end;
}
verus03.gat,119,17,4	duplicate(???#EP15_1D_01)	???#EP15_1D_02	550	/* 59294 */
verus03.gat,163,33,4	duplicate(???#EP15_1D_01)	???#EP15_1D_03	550	/* 59295 */
verus03.gat,207,47,4	duplicate(???#EP15_1D_01)	???#EP15_1D_04	550	/* 59296 */
verus03.gat,225,245,4	duplicate(???#EP15_1D_01)	???#EP15_1D_05	550	/* 59297 */
verus03.gat,169,181,4	duplicate(???#EP15_1D_01)	???#EP15_1D_06	550	/* 59298 */
verus03.gat,122,139,4	duplicate(???#EP15_1D_01)	???#EP15_1D_07	550	/* 59299 */
verus03.gat,80,230,4	duplicate(???#EP15_1D_01)	???#EP15_1D_08	550	/* 59300 */
verus03.gat,42,105,4	duplicate(???#EP15_1D_01)	???#EP15_1D_09	550	/* 59301 */
verus03.gat,99,235,4	duplicate(???#EP15_1D_01)	???#EP15_1D_10	550	/* 59302 */
verus03.gat,81,207,4	duplicate(???#EP15_1D_01)	???#EP15_1D_11	550	/* 59303 */
verus03.gat,226,243,4	duplicate(???#EP15_1D_01)	???#EP15_1D_12	550	/* 59304 */
verus03.gat,148,144,4	duplicate(???#EP15_1D_01)	???#EP15_1D_13	550	/* 59305 */
verus03.gat,74,44,4		duplicate(???#EP15_1D_01)	???#EP15_1D_14	550	/* 59306 */
verus03.gat,20,54,4		duplicate(???#EP15_1D_01)	???#EP15_1D_15	550	/* 59307 */
verus03.gat,74,212,4	duplicate(???#EP15_1D_01)	???#EP15_1D_16	550	/* 59308 */
verus03.gat,42,47,4		duplicate(???#EP15_1D_01)	???#EP15_1D_17	550	/* 59309 */
verus03.gat,80,195,4	duplicate(???#EP15_1D_01)	???#EP15_1D_18	550	/* 59310 */
verus03.gat,134,72,4	duplicate(???#EP15_1D_01)	???#EP15_1D_19	550	/* 59311 */
verus03.gat,45,45,4		duplicate(???#EP15_1D_01)	???#EP15_1D_20	550	/* 59312 */
verus03.gat,115,235,4	duplicate(???#EP15_1D_01)	???#EP15_1D_21	550	/* 59313 */
verus03.gat,76,194,4	duplicate(???#EP15_1D_01)	???#EP15_1D_22	550	/* 59314 */
verus03.gat,166,32,4	duplicate(???#EP15_1D_01)	???#EP15_1D_23	550	/* 59315 */
verus03.gat,121,42,4	duplicate(???#EP15_1D_01)	???#EP15_1D_24	550	/* 59316 */
verus03.gat,141,36,4	duplicate(???#EP15_1D_01)	???#EP15_1D_25	550	/* 59317 */

verus04.gat,187,219,4	script	茂み#EP15_1D_01	527,{/* 59318 */
	if(!checkquest(5317))
		end;
	if(QUE3_VER >= 10) {
		mes "‐どこにでもありそうな";
		mes "　青々とした茂みだ‐";
		close;
	}
	mes "‐薬草がありそうな茂みだ。";
	mes "　どうしようか？‐";
	next;
	if(select("採集する","そのままにしておく") == 2) {
		mes "‐その場を立ち去った‐";
		close;
	}
	progressbar 2; //color=0xffff00
	if(rand(100) < 25) {
		if(checkitemblank() == 0){
			// 本家はチェックなし
		}
		else {
			getitem 6754,1;
			mes "‐薬草の採集に成功した‐";
		}
		set QUE3_VER,QUE3_VER + 1;
	}
	else {
		mes "‐薬草は見つからなかった‐";
	}
	close2;
	initnpctimer;
	hideonnpc; //59064
	end;
OnTimer120000:
	stopnpctimer;
	hideoffnpc; //59064
	end;
}
verus04.gat,167,206,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_02	527	/* 59319 */
verus04.gat,198,198,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_03	527	/* 59320 */
verus04.gat,143,205,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_04	527	/* 59321 */
verus04.gat,125,265,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_05	527	/* 59322 */
verus04.gat,92,203,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_06	527	/* 59323 */
verus04.gat,97,204,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_07	527	/* 59324 */
verus04.gat,85,189,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_08	527	/* 59325 */
verus04.gat,64,191,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_09	527	/* 59326 */
verus04.gat,55,185,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_10	527	/* 59327 */
verus04.gat,42,185,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_11	527	/* 59328 */
verus04.gat,29,189,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_12	527	/* 59329 */
verus04.gat,40,223,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_13	527	/* 59330 */
verus04.gat,32,240,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_14	527	/* 59331 */
verus04.gat,27,243,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_15	527	/* 59332 */
verus04.gat,34,248,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_16	527	/* 59333 */
verus04.gat,52,251,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_17	527	/* 59334 */
verus04.gat,72,247,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_18	527	/* 59335 */
verus04.gat,75,243,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_19	527	/* 59336 */
verus04.gat,81,252,4	duplicate(茂み#EP15_1D_01)	茂み#EP15_1D_20	527	/* 59337 */

yuno_fild07.gat,211,179,5	script	発掘地案内人#atd07	868,{/* 60509 */
	mes "[発掘地案内人]";
	mes "ファンタスマゴリカプロジェクトの";
	mes "発掘地まで行く方ですか？";
	next;
	mes "[発掘地案内人]";
	mes "新しく発見された遺跡、";
	mes "^4d4dffウェルスシティ^000000は";
	mes "ジュピロス奥の通路から";
	mes "行くことができます。";
	next;
	mes "[発掘地案内人]";
	mes "ジュピロスの入口は";
	mes "この光の柱を抜けた先にありますよ。";
	mes "モンスターが多数出没していますので、";
	mes "気をつけてください。";
	next;
	mes "[発掘地案内人]";
	mes "また、ここから南に行ったところには";
	mes "ウェルス発掘地に通じる";
	mes "エレベーターもありますよ。";
	mes "レッケンベル社で利用者登録を行えば";
	mes "利用が出来ます。";
	close;
}

yuno_fild07.gat,216,157,5	script	案内員エリシャ#ep15_1bs	831,{/* 59884 */
	mes "[エリシャ]";
	mes "はぁい♪";
	mes "このエレベーターの利用には";
	mes "利用者登録が必要でーす。";
	mes "ちょっと登録の確認をするので";
	mes "名前を言ってもらえます？";
	emotion 3,"案内員エリシャ#ep15_1bs"; //59884
	next;
	switch(select("名前を言う","確認手続きについて聞く","話を終える")) {
	case 1:
		if(VER2_QUE == 0) {
			mes "[エリシャ]";
			mes "ありがとうございまーす。";
			mes "楽園団所属、お名前は……";
			mes strcharinfo(0)+ "様ですね。";
			mes "では、確認してみます。";
			next;
			mes "[エリシャ]";
			mes "あら……どうやらリストに";
			mes "名前は見当たらないようですねぇ。";
			mes "このエレベーターを使用するには";
			mes "別途、^FF0000エレベーター使用許可登録^000000が";
			mes "必要なのです。";
			next;
			mes "[エリシャ]";
			mes "もし、レッケンベル本社で";
			mes "^0000FFレイトナ^000000という";
			mes "女性の敵みたいな男性に";
			mes "会った記憶がないのであれば、";
			mes "登録はまだのはずですよ。";
			emotion 19, "案内員エリシャ#ep15_1bs"; //60510
			next;
			menu "レッケンベル本社に行けと？",-;
			break;
		}
		else if(VER2_QUE == 1) {
			mes "[エリシャ]";
			mes "ありがとうございまーす。";
			mes "では、確認してみますねぇ。";
			mes "……ポチっとな。";
			mes "どうやらエレベーター使用リストに";
			mes strcharinfo(0)+ "様の";
			mes "名前は見当たらないようですねぇ。";
			next;
			mes "[エリシャ]";
			mes "もし、レッケンベル本社で";
			mes "^0000FFレイトナ^000000という";
			mes "女性の敵みたいな男性に";
			mes "会った記憶がないのであれば、";
			mes "登録はまだのはずですよ。";
			emotion 19, "案内員エリシャ#ep15_1bs"; //60510
			next;
			menu "レッケンベル本社に行けと？",-;
			break;
		}
		else if(VER2_QUE == 2) {
			mes "[エリシャ]";
			mes "はいはい。";
			mes "お名前は……";
			mes strcharinfo(0)+ "様っと……。";
			emotion 3,"案内員エリシャ#ep15_1bs"; //59884
			next;
			mes "[エリシャ]";
			mes "それじゃあ、確認してみますね。";
			mes "……ポチっとな。";
			mes "えーっと……はい。";
			mes "確かに登録されていますね。";
			mes "それでは^0000FFウェルスシティに移動^000000しますか？";
			next;
			if(select("移動する","移動しない") == 2) {
				mes "[エリシャ]";
				mes "わかりました。";
				mes "もしご利用の際は";
				mes "お声をおかけください。";
				mes "それでは良い一日を！";
				emotion 3,"案内員エリシャ#ep15_1bs"; //59884
				close;
			}
			mes "[エリシャ]";
			mes "それでは今すぐに、";
			mes "超特急でウェルスシティに";
			mes "お送りします。";
			next;
			mes "[エリシャ]";
			mes "なお、内部にて走ったり、";
			mes "ふざけたりすると事故が";
			mes "起きる可能性がありますので";
			mes "ご注意下さい。";
			next;
			mes "[エリシャ]";
			mes "準備できました？";
			mes "それでは安全な冒険に";
			mes "なる事を祈ります！";
			mes "いってら……";
			emotion 3,"案内員エリシャ#ep15_1bs"; //59884
			next;
			mes "^FF0000‐ピーーーーッ!!‐";
			mes "　";
			mes "システムエラーです。";
			mes "このため現在このエレベーターを";
			mes "使用することはできません‐^000000";
			emotion 23,""; //self
			next;
			mes "[エリシャ]";
			mes "……。";
			mes "……あれ？";
			mes "待って下さい？";
			emotion 19,"案内員エリシャ#ep15_1bs"; //59884
			next;
			mes "^FF0000‐ピーーーーッ!!‐";
			mes "　";
			mes "システムエラーです。";
			mes "このため現在このエレベーターを";
			mes "使用することはできません‐^000000";
			emotion 23,""; //self
			next;
			mes "[エリシャ]";
			mes "あらららら!?";
			mes "ど……どうしたんだろう！";
			mes "ちょっとー!?　機嫌直してよ!?";
			emotion 19,"案内員エリシャ#ep15_1bs"; //59884
			next;
			mes "^FF0000‐ピーーーーッ!!‐";
			mes "　";
			mes "システムエラーです。";
			mes "このため現在このエレベーターを";
			mes "使用することはできません‐^000000";
			emotion 23,""; //self
			next;
			mes "[エリシャ]";
			mes "いやだ！　どうしよう！";
			mes "壊れたのかな!?";
			mes "さっき、重量超過寸前の人数を";
			mes "乗せたせいかしら……。";
			mes "ど、どうしよ……。";
			emotion 23,"案内員エリシャ#ep15_1bs"; //59884
			next;
			mes "^FF0000‐ピーーーーッ!!‐";
			mes "　";
			mes "システムエラーです。";
			mes "このため現在このエレベーターを";
			mes "使用することはできません‐^000000";
			emotion 23,""; //self
			next;
			mes "[エリシャ]";
			mes "すみません……";
			mes strcharinfo(0)+ "様！";
			mes "せっかく登録してここまで";
			mes "来て頂いたのに、";
			mes "急に機械が壊れたようです。";
			mes "こんな事、初めて……。";
			emotion 19,"案内員エリシャ#ep15_1bs"; //59884
			emotion 23,""; //self
			next;
			mes "[エリシャ]";
			mes "エレベーターが来ないので、";
			mes "噴水前の乗り場で問題が起きてる……？";
			mes "どちらにしろ、すみません。";
			mes "修理工を呼んで修理しますので";
			mes "エレベーターを使わず、徒歩で";
			mes "向かっていただけますか？";
			next;
			mes "[エリシャ]";
			mes "徒歩で行く道順ですが";
			mes "この位置にいる^0000FF発掘地案内人^000000の";
			mes "そばにある光の柱に入って";
			mes "道なりに進んで頂ければ、着くはずです。";
			mes "迷ったら警護員に道を聞いて";
			mes "見てください。";
			viewpoint 1,210,175,1,0xFF8000; //59884
			next;
			mes "[エリシャ]";
			mes "なお、ジュピロス廃墟外部にある";
			mes "東南側の入口から";
			mes "南側に移動した後、";
			mes "洞窟を抜けると";
			mes "^0000FFウェルスシティ^000000です。";
			next;
			mes "[エリシャ]";
			mes "ちなみにウェルスシティは";
			mes "4つの地域に分かれています。";
			mes "恐らく歩いて最初に着くのは、";
			mes "^0000FFウェルス発掘地^000000と呼ばれる場所で、";
			mes "今回、問題が起きたエレベーターも";
			mes "そこに乗り場があるんです。";
			next;
			mes "[エリシャ]";
			mes "もし、ウェルス発掘地に着いたら";
			mes "北西にある中央噴水台近くに行き";
			mes "そこにいる、^0000FF案内員スカーレット^000000に";
			mes "良かったら使用できない原因を、";
			mes "確認していただけませんか？";
			mes "本当にすみません……。";
			emotion 28,"案内員エリシャ#ep15_1bs"; //59884
			delquest 11364;
			setquest 11365;
			set VER2_QUE,3;
			close;
		}
		else if(VER2_QUE == 3) {
			mes "[エリシャ]";
			mes "あ、" +strcharinfo(0)+ "様！";
			mes "すいません、まだエレベーターの";
			mes "修理が済んでいないんです……。";
			mes "少し遠いですが、徒歩でも行けますから";
			mes "ウェルスシティへは、";
			mes "徒歩で向かって頂けますか？";
			next;
			mes "[エリシャ]";
			mes "徒歩で行く道順ですが";
			mes "この位置にいる^0000FF発掘地案内人^000000の";
			mes "そばにある光の柱に入って";
			mes "道なりに進んで頂ければ、着くはずです。";
			mes "迷ったら警護員に道を聞いて";
			mes "見てください。";
			viewpoint 1,210,175,1,0xFF8000; //59884
			next;
			mes "[エリシャ]";
			mes "ジュピロス廃墟外部にある";
			mes "東南側の入口から";
			mes "南側に移動した後、";
			mes "洞窟を抜けると";
			mes "そこが、ウェルスシティです。";
			next;
			mes "[エリシャ]";
			mes "ちなみにウェルスシティは";
			mes "4つの地域に分かれています。";
			mes "恐らく歩いて最初に着くのは、";
			mes "^0000FFウェルス発掘地^000000と呼ばれる場所で、";
			mes "今回、問題が起きたエレベーターも";
			mes "そこに乗り場があるんです。";
			next;
			mes "[エリシャ]";
			mes "もし、ウェルス発掘地に着いたら";
			mes "北西にある中央噴水台近くに行き";
			mes "そこにいる、^0000FF案内員スカーレット^000000に";
			mes "良かったら使用できない原因を、";
			mes "確認していただけませんか？";
			mes "本当にすみません……。";
			emotion 28,"案内員エリシャ#ep15_1bs"; //59884
			close;
		}
		mes "[エリシャ]";
		mes strcharinfo(0)+ "様。";
		mes "登録が確認できました。";
		mes "ウェルスシティに移動しますか？";
		emotion 3,"案内員エリシャ#ep15_1bs"; //59884
		next;
		if(select("移動する","移動しない") == 2) {
			mes "[エリシャ]";
			mes "わかりました。";
			mes "もしご利用の際は";
			mes "お声をおかけください。";
			mes "それでは良い一日を！";
			close;
		}
		mes "[エリシャ]";
		mes "それでは今すぐに、";
		mes "ウェルスシティに";
		mes "お送りしまーす。";
		mes "内部にて走ったり、ふざけたりすると";
		mes "事故が起きる可能性がありますので";
		mes "ご注意下さい。";
		close2;
		warp "verus04.gat",122,217;
		end;
	case 2:
		mes "[エリシャ]";
		if(VER2_QUE == 0) {
			mes "どうして承認作業が必要なのか、";
			mes "聞きたいということですね。";
			mes "ご説明します。";
			mes "このエレベーターは";
			mes "^0000FFウェルスシティ^000000に";
			mes "移動するための機械で、";
		}
		else if(VER2_QUE == 1) {
			mes "ふふふ！";
			mes "このエレベーターは";
			mes "^0000FFウェルスシティ^000000に";
			mes "簡単に移動するためのもので、";
		}
		else {
			mes "ふふふ！";
			mes "この施設は^0000FFウェルスシティ^000000に";
			mes "移動するための機械で、";
		}
		next;
		mes "[エリシャ]";
		mes "楽園団と協約して";
		mes "ファンタスマゴリカ発掘団に";
		mes "無償で使用できるように";
		mes "レッケンベル社から";
		mes "支援しました。";
		next;
		mes "[エリシャ]";
		if(VER2_QUE == 0) {
			mes "このためこちらの";
			mes "エレベーターを使用するためには";
			mes "レッケンベル社にて、";
			mes "使用登録が必要です。";
		}
		else if(VER2_QUE == 1) {
			mes "なので、このエレベーターを";
			mes "使用するためには";
			mes "楽園団もしくは発掘団への登録、";
			mes "そして、レッケンベル社の";
			mes "エレベーター使用登録が";
			mes "必要です。";
		}
		else {
			mes "このエレベーターを使用するためには";
			mes "楽園団もしくは発掘団への登録、";
			mes "そして、レッケンベル社の";
			mes "エレベーター使用登録が必要です。";
		}
		next;
		mes "[エリシャ]";
		if(VER2_QUE == 0) {
			mes "使用登録は";
			mes "^0000FFレッケンベル本社^000000にて受付中で、";
			mes "楽園団所属の方でしたら、";
			mes "簡単な手続きで済むはずです。";
		}
		else if(VER2_QUE == 1) {
			mes "エレベーター使用登録は";
			mes "レッケンベル本社にて受付中で、";
			mes "使用登録には簡単な確認作業で";
			mes "可能ですよ。";
		}
		else {
			mes "エレベーター使用登録は";
			mes "^0000FFレッケンベル本社^000000にて受付中で、";
			mes "楽園団もしくは発掘団への";
			mes "登録確認だけで可能です。";
			mes "興味がありましたら是非、";
			mes "登録をお願いします♪";
			close;
		}
		next;
		if(select("位置を聞く","話を終える") == 2) {
			mes "[エリシャ]";
			mes "あら、もうよろしいですか？";
			mes "是非、気が向いたら";
			mes "今まで見る事の出来なかった";
			mes "神秘の遺跡、ウェルスシティに";
			mes "一度は訪れてみてくださいね！";
			close;
		}
		mes "[エリシャ]";
		if(VER2_QUE == 0) {
			mes "機械使用登録はリヒタルゼンにある";
		}
		else {
			mes "エレベーター使用登録は";
			mes "リヒタルゼンにある";
		}
		mes "レッケンベル本社１階入り口から、";
		mes "西側方向にいる、軽薄そうな顔の男の";
		mes "^0000FFレイトナ^000000のところで";
		mes "可能ですよ。";
		next;
		menu "レッケンベル本社に行けと？",-;
		mes "[エリシャ]";
		mes "はい、レッケンベル本社です。";
		mes "ここからでは少し距離が";
		mes "ありますから大変かも";
		mes "しれませんね。";
		mes "まあ、着いてからも大変な";
		mes "可能性が高いですが……。";
		break;
	case 3:
		mes "[エリシャ]";
		mes "何かまた、聞きたいことが";
		mes "ある場合は、";
		mes "お気軽にお声をかけて";
		mes "くださいね〜。";
		close;
	}
	next;
	mes "[エリシャ]";
	mes "うわっ、噂をすればなんとやら……。";
	mes "すいません、呼び出しです……。";
	mes "　";
	mes "^0000FF‐エリシャは面倒そうに";
	mes "　インカム型マイクの";
	mes "　スイッチを入れた‐^0000FF";
	emotion 23,"案内員エリシャ#ep15_1bs"; //59884
	next;
	mes "[エリシャ]";
	mes "はい、エリシャです……。";
	mes "……何を言ってるんですか！";
	mes "仕事中ですよ!?";
	mes "それより今から登録のために";
	mes "そちらにお客様が行きますから、";
	mes "ちゃんと対応してくださいね!?";
	next;
	mes "[エリシャ]";
	mes "えっ!?　今日は定時にあがりたい!?";
	mes "40秒でって、無理にきまってるでしょ!!";
	mes "……え、それなら転送装置で送れ!?";
	mes "ちょ、ちょっ……！";
	mes "職権乱用ーっ!!　って切るなーっ!?";
	next;
	mes "^0000FF‐エリシャは何かを悟ったような";
	mes "　表情で、こちらを振り返った‐^0000FF";
	emotion 9, "案内員エリシャ#ep15_1bs"; //60510
	next;
	mes "[エリシャ]";
	mes "……はぁ……本当、あの人は……。";
	mes "すいません、担当者がどうやら";
	mes "大事な用事があるらしく、本社まで";
	mes "なるべく早く送るようにと……。";
	mes "もし宜しければ転送装置でここから";
	mes "レッケンベル本社にお送りします……。";
	if(checkquest(11363) == 0)
		setquest 11363;
	set '@flag,VER2_QUE;
	if(VER2_QUE == 0)
		set VER2_QUE,1;
	next;
	if(select("移動する","移動しない") == 2) {
		mes "[エリシャ]";
		mes "分かりました。";
		mes "距離がありますから";
		mes "転送装置を使わない";
		mes "移動は大変かもですけど、";
		mes "お気をつけて。";
		close;
	}
	mes "[エリシャ]";
	if('@flag == 0) {
		mes "はぁ……。";
		mes "では、レッケンベル本社";
		mes "１階へまいります。";
		mes "多少揺れますから、";
		mes "酔わないようにお気をつけて。";
	}
	else {
		mes "本当、なんであんな男が";
		mes "大事な部署の担当なんだろ……。";
		mes "あ、失礼しました。";
		mes "では、転送装置でレッケンベル本社へ";
		mes "お送りいたします。";
		mes "くれぐれも彼にはお気をつけて……。";
	}
	close2;
	warp "lhz_in01.gat",79,203;
	end;
OnInit:
	waitingroom "地下遺跡アドベンチャー",0; //59884
	end;
}

yuno_fild07.gat,218,154,3	script	冒険家#ep15_1el01	937,{/* 60511 */
	mes "[冒険家]";
	mes "うう……。";
	mes "私も行ってみたい!!";
	mes "どうして私は入れて";
	mes "くれないんだよ〜！";
	close;
}

yuno_fild07.gat,218,159,5	script	冒険家#ep15_1el02	907,{/* 60512 */
	mes "[冒険家]";
	mes "決めたぞ！";
	mes "今回の現場学習課題は";
	mes "ウェルス訪問記にする！";
	next;
	mes "[冒険家]";
	mes "これならあの厳しい教授も";
	mes "A+単位をくれるだろうしっ！";
	close;
}

yuno_fild07.gat,221,157,3	script	冒険家#ep15_1el03	819,{/* 60513 */
	mes "[冒険家]";
	mes "はああああ!!";
	mes "健康な肉体に健康な精神！";
	mes "とてもイイ……!!";
	mes "今日も私の肉体は輝いている!!";
	close;
}

yuno_fild07.gat,221,155,8	script	冒険家#ep15_1el04	749,{/* 60514 */
	mes "[冒険家]";
	mes "ウェルスに行くなら、";
	mes "ポーションは余裕を持って";
	mes "用意した方が良さそうだよな？";
	close;
}

yuno_fild07.gat,217,155,5	script	冒険家#ep15_1el05	747,{/* 60515 */
	mes "[冒険家]";
	mes "レッケンベル社にてここまで";
	mes "支援してくれるとは……。";
	mes "あの会社の資産は底なしか!?";
	close;
}

yuno_fild07.gat,225,166,3	script	商人#ep15_1el06	553,{/* 60516 */
	mes "[商人]";
	mes "おほー！";
	mes "この場所、商売に良さそうに見える!!";
	mes "ここで何の商売をしようかニャン。";
	close;
}

yuno_fild07.gat,225,144,1	script	冒険家#ep15_1el07	59,{/* 60517 */
	mes "[冒険家]";
	mes "エレベーターとは……。";
	mes "シュバルツバルドの科学力は";
	mes "本当に凄いですね！";
	close;
}

yuno_fild07.gat,217,149,3	script	冒険家#ep15_1el08	726,{/* 60518 */
	mes "[冒険家]";
	mes "古代文明というのは、";
	mes "本当に凄くない？ ";
	next;
	mes "[冒険家]";
	mes "大体、字と語感からもう";
	mes "ヤバイというか……。";
	mes "女子力ならぬロマン力が";
	mes "溢れかえってるよねぇ！";
	close;
}

yuno_fild07.gat,224,152,3	script	冒険家#ep15_1el09	881,{/* 60519 */
	mes "[冒険家]";
	mes "どうしてこんなに人が";
	mes "わらわら集まっているんだ？";
	mes "見ているだけで、人に酔いそうだ。";
	close;
}

lhz_in01.gat,75,209,3	script	レイトナ#ep15_1bs	865,{/* 60546 */
	if(VER2_QUE == 0) {
		mes "[レイトナ]";
		mes "はい！　こんにちは〜！";
		mes "可愛い子ちゃんからの";
		mes "お願いならいくらでも";
		mes "聞いちゃうレイトナ";
		mes "お兄さんだよ〜！";
		emotion 30,"レイトナ#ep15_1bs"; //60546
		next;
		mes "[レイトナ]";
		mes "ごめんねぇ。";
		mes "お兄さん今ちょっと、";
		mes "デートの順番を決めるのに";
		mes "忙しいからまた、";
		mes "今度、来てね〜！";
		close;
	}
	else if(VER2_QUE == 1) {
		mes "[レイトナ]";
		mes "はい！　こんにちは〜！";
		mes "可愛い子ちゃんからの";
		mes "お願いならいくらでも";
		mes "聞いちゃうレイトナ";
		mes "お兄さんだよ〜！";
		emotion 30,"レイトナ#ep15_1bs"; //60546
		next;
		menu "登録について聞く",-;
		mes "[レイトナ]";
		mes "あ〜もしかして、";
		mes "エリシャの言ってた人？";
		mes "ここは、そう！";
		mes "ウェルスに行くための";
		mes "エレベーターを使用するために";
		mes "名前を登録するところさ！";
		emotion 9,"レイトナ#ep15_1bs"; //60546
		next;
		mes "[レイトナ]";
		mes "この仕事を最初に頼まれた頃は、";
		mes "個人用だから管理しやすかったけど〜。";
		next;
		mes "[レイトナ]";
		mes "ある日いきなり、";
		mes "「登録すれば使えるように";
		mes "規約を改定したから」と言われ、";
		mes "お兄さんに一言も言わず、登録すれば";
		mes "誰でも乗れるよう、オープンな状態に";
		mes "してしまったんだよ〜！";
		next;
		mes "[レイトナ]";
		mes "ああ、もう本当に……";
		mes "過ぎさりし、日々が懐かしい……。";
		mes "おかげで以前のように、";
		mes "仕事中に可愛い子ちゃんたちに";
		mes "会いに行く時間も無いよ〜。";
		emotion 26,"レイトナ#ep15_1bs"; //60546
		next;
		mes "[レイトナ]";
		mes "とにかく複雑な手順はないし、";
		mes "早く終わらせよう。";
		mes "君は楽園団所属って顔してるし";
		mes "確認も面倒だから、ここに名前を";
		mes "書いてくれるだけでいいよ〜。";
		mes "ほら、簡単だろ〜？";
		next;
		mes "[レイトナ]";
		mes "どうせ開放するつもりだったなら";
		mes "登録なんてしなくてもいいように";
		mes "作ってくれれば楽だったのに……。";
		mes "全く、お兄さんの都合も考えて";
		mes "ほしいよね〜？";
		mes "それじゃ、登録するよ〜。";
		next;
		mes "^0000FF‐ピッ……ピッ……。";
		mes "　";
		mes "　このエレベーターを使用するための";
		mes "　メンバー登録完了‐^000000";
		delquest 11363;
		setquest 11364;
		set VER2_QUE,2;
		next;
		mes "[レイトナ]";
		mes "ＯＫ〜。";
		mes "終わった！";
		mes "登録は終わったからこれで";
		mes "エレベーターを使えるはずだよ〜。";
		mes "そういえば……";
		next;
		mes "[レイトナ]";
		mes "良く見ると君、お兄さんの";
		mes "好みのタイプだよ〜！";
		mes "どう？　良かったらお兄さんの";
		mes "転送装置、乗っていかない？";
		mes "エレベーター前まで送るよ♪";
		mes "ちなみにZenyはいらないからね〜♪";
		next;
		if(select("利用する","利用しない") == 2) {
			mes "[レイトナ]";
			mes "ううーん、残念。";
			mes "レッケンベルには優しい";
			mes "かっこいいお兄さんがいるって";
			mes "宣伝して欲しかったのになあ。";
			mes "それじゃ、また良かったら";
			mes "会いに来てね〜。";
			close;
		}
		mes "[レイトナ]";
		mes "そうこないとね♪";
		mes "そのかわりに、";
		mes "君のお友達の女の子に";
		mes "レッケンベルに優しいかっこいい";
		mes "お兄さんがいるって宣伝してね〜。";
		mes "それじゃ、転送するよ〜。";
		close2;
		warp "yuno_fild07.gat",221,151;
		end;
	}
	else if(VER2_QUE == 2) {
		mes "[レイトナ]";
		mes "どうせ公開するつもりだったなら";
		mes "登録なんてしなくてもいいように";
		mes "作っていれば楽だったのに〜。";
		mes "お兄さんの仕事を勝手に";
		mes "増やさないでほしいね〜。";
		next;
		mes "[レイトナ]";
		mes "あれ？　まだいたの？";
		mes "登録は終わったからこれで";
		mes "エレベーターを使えるはずだよ〜。";
		next;
		mes "[レイトナ]";
		mes "あ、もしかして……";
		mes "転送装置、乗っていくのかな？";
		mes "エリシャの待っている";
		mes "エレベーター前まで送るよ♪";
		mes "ちなみにZenyはいらないからね〜♪";
		next;
		if(select("利用する","利用しない") == 2) {
			mes "[レイトナ]";
			mes "ううーん、残念。";
			mes "レッケンベルには優しい";
			mes "かっこいいお兄さんがいるって";
			mes "宣伝して欲しかったのになあ。";
			mes "それじゃ、また良かったら";
			mes "会いに来てね〜。";
			close;
		}
		mes "[レイトナ]";
		mes "そうこないとね♪";
		mes "そのかわりに、";
		mes "君のお友達の女の子に";
		mes "レッケンベルに優しいかっこいい";
		mes "お兄さんがいるって宣伝してね〜。";
		mes "それじゃ、転送するよ〜。";
		close2;
		warp "yuno_fild07.gat",221,151;
		end;
	}
	mes "[レイトナ]";
	mes "最近、使用者が多くなって";
	mes "毎日故障をしているみたいだね〜。";
	mes "あ〜あ……ナンパに行きたい……。";
	mes "お兄さん、寂しがりだから";
	mes "可愛い子ちゃんの笑顔を見ないと";
	mes "死んじゃうよ〜。";
	emotion 26, "レイトナ#ep15_1bs"; //60478
	close;
OnInit:
	waitingroom "エレベーター登録",0; //60546
	end;
}
verus04.gat,119,220,3	script	案内員スカーレット#ep15	125,{/* 59390 */
	if(VER2_QUE < 3) {
		mes "[スカーレット]";
		mes "この施設はウェルスに";
		mes "移動するための機械です。";
		next;
		mes "[スカーレット]";
		mes "楽園団と協約して";
		mes "ファンタスマゴリカ発掘団に";
		mes "無償で使用できるように";
		mes "レッケンベル社から";
		mes "支援しました。";
		next;
		mes "[スカーレット]";
		mes "この機械を使用するためには";
		mes "楽園団発掘団登録と";
		mes "レッケンベル社の";
		mes "機械使用登録確認が必要です。";
		next;
		mes "[スカーレット]";
		mes "機械使用登録は";
		mes "レッケンベル本社にて受付中ですが、";
		mes "楽園団発掘団の";
		mes "加入確認だけで可能です。";
		next;
		mes "[スカーレット]";
		mes "すべての登録が完了した場合は、";
		mes "登録状況を確認した後、";
		mes "使用して頂くように";
		mes "お願いします。";
		close;
	}
	else if(VER2_QUE == 3) {
		mes "[スカーレット]";
		mes "危ないじゃないですか！";
		mes "エレベーターの中で";
		mes "ふざけないでください！";
		emotion 6,"案内員スカーレット#ep15"; //59136
		next;
		mes "[スカーレット]";
		mes "確か乗る前に内部では";
		mes "絶対ふざけてはならないと";
		mes "言ったはずですが!?";
		next;
		mes "[スカーレット]";
		mes "こんな風に扉がへこむほど";
		mes "何をやったのですか!?";
		next;
		mes "[マークイシャ]";
		mes "本当にすみません……。";
		mes "こいつが乗る前に";
		mes "暴れてしまって……。";
		emotion 19,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark3",2;
		next;
		mes "[テューリアン]";
		mes "この程度で壊れてしまう";
		mes "機械をどうやって";
		mes "信じて乗れというんだ!?";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "うるさい！";
		mes "ほら、早くこの人に";
		mes "すみませんでしたと謝れ！";
		emotion 6,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark4",2;
		next;
		mes "[テューリアン]";
		mes "大体おかしいだろ!!";
		mes "こんな大人数をそんな得体のしれない";
		mes "機械に押し込めるなんて!!";
		mes "何かが起きた後じゃ、遅いんだぞ!?";
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "……。";
		emotion 6,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark4",2;
		next;
		mes "[タマリン]";
		mes "だからふざけないでくださいと";
		mes "あの人も言ったのでは……。";
		emotion 23,"タマリン#ep15_1elb"; //59140
		cutin "ep143_taang",2;
		next;
		mes "[アルプオカート]";
		mes "とりあえず今ハッキリしているのは";
		mes "いがみ合っている場合ではない";
		mes "と、いうことだ。";
		mes "今、床がとても不安定な状態だ。";
		mes "こんな状態では落ち着いて";
		mes "話すこともままならない。";
		emotion 19,"アルプオカート#ep15_1el"; //59141
		cutin "bu_alp2",2;
		next;
		mes "[スカーレット]";
		mes "……確かにそうですね。";
		mes "まずは降りて早く修理をしないと";
		mes "もっと大変なことになってからじゃ";
		mes "手遅れですし……。";
		cutin "bu_alp2",255;
		next;
		mes "^FF0000−ガクンッ……−^000000";
		emotion 23,"案内員スカーレット#ep15"; //59136
		emotion 23,"テューリアン#ep15_1elb"; //59138
		emotion 23,"マークイシャ#ep15_1elb"; //59139
		emotion 23,"タマリン#ep15_1elb"; //59140
		emotion 23,"アルプオカート#ep15_1el"; //59141
		emotion 23,"マギスティン#ep15_1elb"; //59142
		next;
		mes "[マギスティン]";
		mes "きゃああああああ！";
		emotion 23,"マギスティン#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		next;
		mes "[テューリアン]";
		mes "うわああ!?";
		mes "な、なんだ……!?";
		mes "今、床が動いた気がするうううっ!?";
		emotion 19,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[スカーレット]";
		mes "ま、待ってください!!";
		mes "とりあえず誰も動かないで!!";
		mes "一歩間違えれば大事故に";
		mes "つながる可能性が、あります!!";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "bu_du5",255;
		next;
		mes "[スカーレット]";
		mes "あっ。";
		mes "そこの方!!";
		mes "お名前を教えてください！";
		mes "ちょっと助けてほしいんです！";
		emotion 26,"案内員スカーレット#ep15"; //59136
		next;
		menu "名前を名乗る",-;
		mes "[スカーレット]";
		mes strcharinfo(0)+ "様ですね!?";
		mes "ありがとうございます！";
		mes "では早速なのですが……";
		next;
		mes "[スカーレット]";
		mes "今、私たちの中から";
		mes "誰かが動いたら何が起きるか";
		mes "分からない、危険な状態なので、";
		mes "床を支えられそうなものを";
		mes "少し持って来てくれませんか？";
		next;
		mes "[スカーレット]";
		mes "この状態では修理工が";
		mes "来るまで待つのは無理です……。";
		mes "^FF0000古い鉄板を30個^000000ほど";
		mes "持って来て頂ければ、";
		mes "なんとかなりそうです！";
		next;
		mes "[スカーレット]";
		mes "なるべく早く持ってきてください。";
		mes "お願いします!!";
		delquest 11365;
		setquest 11366;
		set VER2_QUE,4;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[スカーレット]";
		mes "気を付けて!!";
		mes "みんな、動かないでください!!";
		next;
		mes "[テューリアン]";
		mes "うわああ!!";
		mes "このまま落ちるのか……!?";
		mes "俺は高いところは好きだが";
		mes "足場が不安定な場所は苦手だーっ！";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[タマリン]";
		mes "不吉な事を言わないでください！";
		mes "そもそもあなたのせいですからね!?";
		emotion 6,"タマリン#ep15_1elb"; //59140
		cutin "ep143_taang",2;
		next;
		mes "[スカーレット]";
		mes "二人とも静かにしてください！";
		mes "本当に今少しでも動いたら";
		mes "大変な事になりますよ!?";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "ep143_taang",255;
		next;
		if(countitem(7319) < 30) {
			mes "[スカーレット]";
			mes "今、私たちの中から";
			mes "誰かが動いたら、";
			mes "何が起きるかわかりません……。";
			mes "^0000FF床を支えられそうなものを^000000";
			mes "少し持って来てくれませんか？";
			next;
			mes "[スカーレット]";
			mes "^FF0000古い鉄板を30個^000000ほど";
			mes "持って来て頂ければなんとか";
			mes "なりそうです！";
			mes "すいません、お願いします!!";
			close;
		}
		mes "[スカーレット]";
		mes "あっ……！";
		mes "お帰りなさい!!";
		mes "古い鉄板は用意できました!?";
		mes "それではゆっくりでいいので、";
		mes "ひとつずつ、ここに";
		mes "入れ込んでください!!";
		delitem 7319,30;
		delquest 11366;
		setquest 118330;
		set VER2_QUE,5;
		next;
		mes "[スカーレット]";
		mes "丈夫ではないけど、";
		mes "少しの間、耐えてくれれば……。";
		mes "皆さん！";
		mes "私が合図したら急いで";
		mes "降りましょう！";
		next;
		menu "古い鉄板を隙間に入れ込む",-;
		mes "[スカーレット]";
		mes "ありがとうございます。";
		mes "これなら暫くは大丈夫そうです！";
		mes "さあ、早く降りて下さい！";
		mes "鉄板でどれほど";
		mes "支えられるかわかりません！";
		next;
		mes "[テューリアン]";
		mes "ふうう、助かった！";
		mes "さあ、マギ!";
		mes "早く俺の手を握って";
		mes "慌てずに下りるんだ！";
		cutin "bu_du4",2;
		next;
		mes "[スカーレット]";
		mes "みんな無事に降りれて";
		mes "本当に良かったです……。";
		mes "今回は誰も怪我することなく、";
		mes "無事だったからよいですが……";
		mes "次からは絶対今日のような事は";
		mes "しないでくださいね!?";
		cutin "bu_du4",255;
		next;
		mes "[スカーレット]";
		mes "そして" +strcharinfo(0)+ "様、";
		mes "本当にありがとうございます。";
		mes "お蔭様で大きな事故にならずに";
		mes "すみました……。";
		emotion 15,"案内員スカーレット#ep15"; //59136
		next;
		mes "[スカーレット]";
		mes "そういえば先ほど";
		mes "エリシャから連絡が来ました。";
		mes "故障のせいでここまで";
		mes "歩いて来られたんですよね？";
		next;
		mes "[スカーレット]";
		mes "ご不便な思いをさせた点に関しては";
		mes "心からお詫びいたします……。";
		mes "なお、故障のせいで閉まっていた入口が";
		mes "再度開いたので、ジュノーに戻る時は";
		mes "私に声をかけて下さい。";
		next;
		mes "[マークイシャ]";
		mes "あ……！";
		mes strcharinfo(0)+ "様、お久しぶりです。";
		mes "エクラージュでもお世話に";
		mes "なったのに……。";
		mes "まさか今回も迷惑を";
		mes "かけてしまうとは……。";
		emotion 15,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark2",2;
		next;
		mes "[マギスティン]";
		mes "うう……";
		mes "……ヒック。";
		mes "怖かったです……。";
		mes "グスッ……。";
		emotion 28,"マギスティン#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		next;
		if(select("マギスティンを抱きしめる","特になにもしない") == 1) {
			cutin "bu_maggi3",2;
			mes "[マギスティン]";
			mes "あっ……。";
			mes "　";
			mes "^0000FF‐一瞬戸惑った様子だったが";
			mes "　そっと体を預けてきた。";
			mes "　小刻みに震えているのが分かる‐^000000";
			next;
			cutin "bu_du5",2;
			mes "[テューリアン]";
			mes "なんだよ、" +strcharinfo(0)+ "！";
			mes "俺だって怖い目に";
			mes "あったっていうのに……";
			mes "俺にはないのか!?";
			next;
			cutin "bu_mark3",2;
			mes "[マークイシャ]";
			mes "……お前が抱きついたら";
			mes "犯罪になるだろ!!";
			mes "とにかくお前は";
			mes "マギスティンに謝れ!!";
			next;
			cutin "bu_maggi2",2;
			mes "[マギスティン]";
			mes strcharinfo(0)+ "さん。";
			mes "もう大丈夫です。";
			mes "落ち着きました。";
			next;
		}
		mes "[テューリアン]";
		mes "マギ、本当にすまない……。";
		cutin "bu_du4",2;
		next;
		cutin "bu_maggi2",2;
		mes "[マギスティン]";
		mes "テュー、私は大丈夫。";
		mes strcharinfo(0)+ "さん。";
		mes "テューがご迷惑を";
		mes "おかけしました。";
		mes "そして、お久しぶりです。";
		emotion 15,"マギスティン#ep15_1elb"; //59142
		next;
		cutin "bu_du5",2;
		mes "[テューリアン]";
		mes strcharinfo(0)+ "……!?";
		mes "む、無論憶えてるぞ！";
		mes "確か、エクラージュで";
		mes "アレして、コレしたよな!!";
		mes "ひ、久しぶりだな!!";
		mes "わはははははははっ!!";
		next;
		mes "[タマリン]";
		mes "聞き覚えある名前だなと思ったら";
		mes "本当に" +strcharinfo(0)+ "様";
		mes "だったとは……!";
		mes "フレイムヴァレー以来ですね。";
		mes "お陰で友達とも合流できました。";
		mes "ありがとうございます。";
		emotion 15,"タマリン#ep15_1elb"; //59140
		cutin "ep143_tasmi",2;
		next;
		mes "[アルプオカート]";
		mes "……すまない、迷惑をかけた。";
		mes "そして久しぶりだな。";
		mes "あれからまたオリバーヒルベルトの";
		mes "コレクションが増えたんだ……。";
		cutin "bu_alp4",2;
		emotion 15,"アルプオカート#ep15_1el"; //59141
		next;
		mes "[タマリン]";
		mes "だけどちょっと、";
		mes "怪しくありませんか？";
		mes "発掘がはじまったばかりなのに";
		mes "こんな機械まで準備されていて、";
		mes "用意周到すぎるような……。";
		cutin "ep143_tasta",2;
		next;
		mes "[マークイシャ]";
		mes "うーん、まあ……";
		mes "レッケンベル社で後援しているという";
		mes "話しだし……。";
		mes "こんな機械くらいはあっても";
		mes "おかしくないんじゃないかな？";
		cutin "bu_mark1",2;
		next;
		mes "[テューリアン]";
		mes "細かいことはどうでもいい！";
		mes "それよりも、だ！";
		mes "噂によるといつの時代なのか";
		mes "識別しにくい特別な";
		mes "場所らしいぞ!!";
		mes "早く行って見ようぜ！";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "……落ち着け！";
		mes "さっきもそんな風に言って";
		mes "慌てて乗り込んだせいで、";
		mes "あんなことになったんだぞ!?";
		emotion 6,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark3",2;
		next;
		mes "[スカーレット]";
		mes "まったくもう！";
		mes "まだ床は不安定なんですよ!?";
		mes "次こそ、おとなしく乗ってください！";
		cutin "bu_mark3",255;
		close;
	}
	mes "[スカーレット]";
	mes "こんにちは。";
	mes "少し登録の確認をしますので、";
	mes "名前を言って頂けますか。";
	next;
	if(select("名前を言う","話を終える") == 2) {
		mes "[スカーレット]";
		mes "分かりました。";
		mes "何かありましたらお声を";
		mes "おかけください。";
		mes "それでは良い一日を。";
		close;
	}
	mes "[スカーレット]";
	mes strcharinfo(0)+ "様。";
	mes "登録が確認できました。";
	mes "ジュノーのエルメス峡谷にある";
	mes "エレベーターまで";
	mes "移動しますか？";
	next;
	if(select("移動する","移動しない") == 2) {
		mes "[スカーレット]";
		mes "エルメス峡谷に";
		mes "戻る際は是非、";
		mes "こちらのエレベーターを";
		mes "ご利用くださいね。";
		close;
	}
	mes "[スカーレット]";
	mes "周囲にはモンスターが";
	mes "徘徊している可能性が";
	mes "ありますので、お気をつけて！";
	mes "ご武運を！";
	close2;
	warp "yuno_fild07.gat",226,158;
	end;
}
verus04.gat,116,220,0	script	エレベーター#ep15_1elb	10007,{/* 59391 */
	mes "^FF0000‐注意事項‐^000000";
	mes "　";
	mes "‐内部で飛び跳ねたり";
	mes "　ふざけると事故を起こす";
	mes "　危険があります。";
	mes "　ご注意してください‐";
	close;
}
verus04.gat,115,220,5	script	テューリアン#ep15_1elb	628,{/* 59392 */
	if(VER2_QUE < 3) {
		mes "[テューリアン]";
		mes "冒険だ!!";
		mes "未知の領域を冒険できるなんて";
		mes "滅多にないからな!!";
		mes "俺たちが真っ先に乗り込むんだ!!";
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[テューリアン]";
		mes "うわああああああああああ!?";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[テューリアン]";
		mes "早くこれを何とかしてくれ!!";
		next;
		mes "[スカーレット]";
		mes "危ないじゃないですか!!";
		mes "エレベーターの中で";
		mes "ふざけないでください！";
		mes "確か乗る前に内部では、";
		mes "絶対ふざけてはならないと";
		mes "言ったはずですが!?";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[テューリアン]";
		mes "うあああ!!";
		mes "このまま落ちるのかな……。";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[タマリン]";
		mes "不吉な事を言わないでください！";
		mes "そもそもあなたのせいですから!!";
		emotion 23,"タマリン#ep15_1elb"; //59140
		cutin "ep143_tahuk",2;
		next;
		mes "[スカーレット]";
		mes "二人とも静かにしてください！";
		mes "本当に今少しでも動いたら、";
		mes "大変な事になりますよ!?";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "ep143_tahuk",255;
		close;
	}
	else if(VER2_QUE == 5) {
		mes "[テューリアン]";
		mes "こ、これは……!!";
		mes "……。";
		mes "う、うーん？";
		mes "思ったより普通……だな。";
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "いったいどんなものを";
		mes "想像していたんだ……。";
		emotion 9,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[テューリアン]";
		mes "何かあるだろう！";
		mes "ここまで大規模なんだから！";
		mes "凶悪なモンスターが";
		mes "封印されてるとか……。";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "そんなすごいものがあるなら";
		mes "誰かが先に見つけるだろ……。";
		cutin "bu_mark3",2;
		next;
		mes "[アルプオカート]";
		mes "……ぱっと見わかりにくいが、";
		mes "建築様式だったり、";
		mes "使用した資材の資質が";
		mes "少なくともミッドガルド大陸では";
		mes "見たことのない物だ。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "もちろん、";
		mes "ジュピロスとも少し違う。";
		next;
		mes "[テューリアン]";
		mes "おおっ!?";
		mes "みんな〜ここの噴水台を見てみろ!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[テューリアン]";
		mes "おお……。";
		mes "みんな〜あそこの噴水台を";
		mes "見てみろ!! ";
		viewpoint 1,116,226,1,0xFF8000; //59138
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		end;
	}
	mes "[テューリアン]";
	mes "冒険にはチャレンジ精神が必要なんだ！ ";
	mes "失敗したらごめんなさいの気持ちも";
	mes "大事だけどな！";
	cutin "bu_du2",2;
	close2;
	cutin "bu_du2",255;
	end;
}
verus04.gat,115,221,5	script	マークイシャ#ep15_1elb	616,{/* 59393 */
	if(VER2_QUE < 3) {
		mes "[マークイシャ]";
		mes "ウェルスシティ……";
		mes "どんな場所なのか、";
		mes "本当に気になりますね。";
		cutin "bu_mark1",2;
		next;
		mes "[マークイシャ]";
		mes "ジュピロス近くで発見されたけど";
		mes "ジュピロスとは違う文明を";
		mes "持っていたらしいと";
		mes "聞きました。";
		cutin "bu_mark2",2;
		close2;
		cutin "bu_du4",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[マークイシャ]";
		mes "気を付けろ!!";
		emotion 23,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark4",2;
		next;
		mes "[テューリアン]";
		mes "うわああああああ!!";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[スカーレット]";
		mes "危ないじゃないですか!!";
		mes "エレベーターの中で";
		mes "ふざけないでください！";
		mes "確か乗る前に内部では絶対に";
		mes "ふざけてはならないと";
		mes "言ったはずですが!?";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[マークイシャ]";
		mes "おい！　テューリアン!!";
		mes "お前のお蔭で私の寿命が";
		mes "どんどん削られていく気分だ!!";
		emotion 6,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark3",2;
		close2;
		cutin "bu_mark3",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[テューリアン]";
		mes "こ、これは……!!";
		mes "……。";
		mes "う、うーん？";
		mes "思ったより普通……だな。";
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "いったいどんなものを";
		mes "想像していたんだ……。";
		emotion 9,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[テューリアン]";
		mes "何かあるだろう！";
		mes "ここまで大規模なんだから！";
		mes "凶悪なモンスターが";
		mes "封印されてるとか……。";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "そんなすごいものがあるなら";
		mes "誰かが先に見つけるだろ……。";
		cutin "bu_mark3",2;
		next;
		mes "[アルプオカート]";
		mes "……ぱっと見わかりにくいが、";
		mes "建築様式だったり、";
		mes "使用した資材の資質が";
		mes "少なくともミッドガルド大陸では";
		mes "見たことのない物だ。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "もちろん、";
		mes "ジュピロスとも少し違う。";
		next;
		mes "[テューリアン]";
		mes "おおっ!?";
		mes "みんな〜ここの噴水台を見てみろ!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[マークイシャ]";
		mes "なんだ？";
		mes "その噴水台がどうしたんだ？";
		viewpoint 1,116,226,1,0xFF8000; //59139
		cutin "bu_mark1",2;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	mes "[マークイシャ]";
	mes "ふう……";
	mes strcharinfo(0)+ "様。";
	mes "本当に助かりました。";
	mes "あいつはいつになったら";
	mes "大人しくなるのかな……。";
	cutin "bu_mark3",0;
	close2;
	cutin "bu_mark3",255;
	end;
}
verus04.gat,116,218,5	script	タマリン#ep15_1elb	10027,{/* 59394 */
	if(VER2_QUE < 3) {
		mes "[タマリン]";
		mes "こんな凄い発掘作業なら";
		mes "たくさんの人たちが";
		mes "集まりそうですね。";
		cutin "ep143_tasta",2;
		next;
		cutin "ep143_tasmi",2;
		mes "[タマリン]";
		mes "私はとりあえず、";
		mes strcharinfo(0) + "様に";
		mes "前みたいに発掘されないよう";
		mes "気をつけます。";
		close2;
		cutin "ep143_tasmi",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[タマリン]";
		mes "だからふざけないでくださいと";
		mes "言ったじゃないですか!?";
		emotion 23,"タマリン#ep15_1elb"; //59140
		cutin "ep143_tahuk",2;
		next;
		mes "[テューリアン]";
		mes "うわあああああ!!";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[スカーレット]";
		mes "危ないじゃないですか!!";
		mes "エレベーターの中で";
		mes "ふざけないでください！";
		mes "確か乗る前に内部では絶対";
		mes "ふざけてはならないと";
		mes "言ったはずですが!?";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[タマリン]";
		mes "うわあ……";
		mes "最悪だ……。";
		emotion 28,"タマリン#ep15_1elb"; //59140
		cutin "ep143_tahuk",2;
		close2;
		cutin "ep143_tahuk",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[テューリアン]";
		mes "こ、これは……!!";
		mes "……。";
		mes "う、うーん？";
		mes "思ったより普通……だな。";
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "いったいどんなものを";
		mes "想像していたんだ……。";
		emotion 9,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[テューリアン]";
		mes "何かあるだろう！";
		mes "ここまで大規模なんだから！";
		mes "凶悪なモンスターが";
		mes "封印されてるとか……。";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "そんなすごいものがあるなら";
		mes "誰かが先に見つけるだろ……。";
		cutin "bu_mark3",2;
		next;
		mes "[アルプオカート]";
		mes "……ぱっと見わかりにくいが、";
		mes "建築様式だったり、";
		mes "使用した資材の資質が";
		mes "少なくともミッドガルド大陸では";
		mes "見たことのない物だ。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "もちろん、";
		mes "ジュピロスとも少し違う。";
		next;
		mes "[テューリアン]";
		mes "おおっ!?";
		mes "みんな〜ここの噴水台を見てみろ!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[タマリン]";
		mes "ん……？";
		mes "テューリアンが噴水台にて";
		mes "何かを発見したのかな？";
		viewpoint 1,116,226,1,0xFF8000; //59140
		cutin "ep143_tasmi",2;
		close2;
		cutin "ep143_tasmi",255;
		end;
	}
	mes "[タマリン]";
	mes "ふう、本当に";
	mes strcharinfo(0)+ "様が";
	mes "通りかかっていなかったら";
	mes "どうなっていたか……。";
	mes "本当にありがとうございます。";
	cutin "ep143_tasmi",2;
	close2;
	cutin "ep143_tasmi",255;
	end;
}
verus04.gat,117,219,0	script	アルプオカート#ep15_1el	615,{/* 59395 */
	if(VER2_QUE < 3) {
		mes "[アルプオカート]";
		mes "発掘か……いい素材だ……。";
		mes "そういえば、オリバーヒルベルトの";
		mes "小説でも発掘に関する話が";
		mes "あったような気がする……。";
		cutin "bu_alp4",2;
		close2;
		cutin "bu_alp4",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[アルプオカート]";
		mes "……。";
		mes "う……動くな……。";
		emotion 19,"アルプオカート#ep15_1el"; //59141
		cutin "bu_alp2",2;
		next;
		mes "[テューリアン]";
		mes "うわあああ!!";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[スカーレット]";
		mes "危ないじゃないですか！";
		mes "エレベーターの中で";
		mes "ふざけないでください！";
		mes "確か乗る前に内部では絶対";
		mes "ふざけてはならないと";
		mes "言ったはずですが!?";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[アルプオカート]";
		mes "動くな……。";
		mes "床……床が……。";
		emotion 19,"アルプオカート#ep15_1el"; //59141
		cutin "bu_alp2",2;
		close2;
		cutin "bu_alp2",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[テューリアン]";
		mes "こ、これは……!!";
		mes "……。";
		mes "う、うーん？";
		mes "思ったより普通……だな。";
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "いったいどんなものを";
		mes "想像していたんだ……。";
		emotion 9,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[テューリアン]";
		mes "何かあるだろう！";
		mes "ここまで大規模なんだから！";
		mes "凶悪なモンスターが";
		mes "封印されてるとか……。";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "そんなすごいものがあるなら";
		mes "誰かが先に見つけるだろ……。";
		cutin "bu_mark3",2;
		next;
		mes "[アルプオカート]";
		mes "……ぱっと見わかりにくいが、";
		mes "建築様式だったり、";
		mes "使用した資材の資質が";
		mes "少なくともミッドガルド大陸では";
		mes "見たことのない物だ。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "もちろん、";
		mes "ジュピロスとも少し違う。";
		next;
		mes "[テューリアン]";
		mes "おおっ!?";
		mes "みんな〜ここの噴水台を見てみろ!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[アルプオカート]";
		mes "噴水台がどうした？";
		viewpoint 1,116,226,1,0xFF8000; //59141
		cutin "bu_alp1",2;
		close2;
		cutin "bu_alp1",255;
		end;
	}
	mes "[アルプオカート]";
	mes "……あの時は助かった。";
	mes "皆、感謝している。";
	cutin "bu_alp1",2;
	close2;
	cutin "bu_alp1",255;
	end;
}
verus04.gat,117,220,3	script	マギスティン#ep15_1elb	612,{/* 59396 */
	if(VER2_QUE < 3) {
		mes "[マギスティン]";
		mes "ファンタスマゴリカという名前、";
		mes "響きが良くて綺麗だと思いません？";
		mes "でも、エクラージュも";
		mes "響きが良くて、私は好きです。";
		cutin "bu_maggi2",2;
		close2;
		cutin "bu_maggi2",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[マギスティン]";
		mes "きゃあああああ!!";
		emotion 23,"マギスティン#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		next;
		mes "[テューリアン]";
		mes "うわああああああ!!";
		emotion 23,"テューリアン#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[スカーレット]";
		mes "危ないじゃないですか!!";
		mes "エレベーターの中で";
		mes "ふざけないでください！";
		mes "確か乗る前に内部では絶対";
		mes "ふざけてはならないと";
		mes "言ったはずですが!?";
		emotion 23,"案内員スカーレット#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[マギスティン]";
		mes "きゃああああああ!!";
		emotion 23,"マギスティン#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		close2;
		cutin "bu_maggi4",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[テューリアン]";
		mes "こ、これは……!!";
		mes "……。";
		mes "う、うーん？";
		mes "思ったより普通……だな。";
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "いったいどんなものを";
		mes "想像していたんだ……。";
		emotion 9,"マークイシャ#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[テューリアン]";
		mes "何かあるだろう！";
		mes "ここまで大規模なんだから！";
		mes "凶悪なモンスターが";
		mes "封印されてるとか……。";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "そんなすごいものがあるなら";
		mes "誰かが先に見つけるだろ……。";
		cutin "bu_mark3",2;
		next;
		mes "[アルプオカート]";
		mes "……ぱっと見わかりにくいが、";
		mes "建築様式だったり、";
		mes "使用した資材の資質が";
		mes "少なくともミッドガルド大陸では";
		mes "見たことのない物だ。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "もちろん、";
		mes "ジュピロスとも少し違う。";
		next;
		mes "[テューリアン]";
		mes "おおっ!?";
		mes "みんな〜ここの噴水台を見てみろ!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[マギスティン]";
		mes "テューを見ていると";
		mes "元気をもらえる気がします。";
		mes "元気すぎるのが玉にキズ";
		mes "ですけど。";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_maggi1",2;
		close2;
		cutin "bu_maggi1",255;
		end;
	}
	mes "[マギスティン]";
	mes "テューがご迷惑をおかけしました。";
	mes "私のほうはもう、大丈夫です。";
	mes "本当にありがとうございました。";
	emotion 15,"マギスティン#ep15_1elb"; //59142
	cutin "bu_maggi2",2;
	close2;
	cutin "bu_maggi2",255;
	end;
}
verus04.gat,116,226,0	script	噴水台 #ep15_1elb	10043,{/* 59397 */
	if(VER2_QUE == 6) {
		mes "[テューリアン]";
		mes "一見、何の変哲もない噴水だが、";
		mes "きっと噴水に見せかけた";
		mes "最終兵器に違いない!!";
		mes "どこかにきっと隠し通路か";
		mes "何かが……。";
		cutin "bu_du2",2;
		next;
		mes "[アルプオカート]";
		mes "人の話を少しは聞け……。";
		cutin "bu_alp1",2;
		next;
		mes "[タマリン]";
		mes "ちょ……ちょっと！";
		mes "余計な事をしないで";
		mes "くれますか!?";
		cutin "ep143_taang",2;
		next;
		mes "[アルプオカート]";
		mes "むっ!?";
		mes "いや、待った……。";
		cutin "bu_alp3",2;
		next;
		mes "[アルプオカート]";
		mes "いくら地面の深い場所に";
		mes "あったからと言っても、";
		mes "古代の遺跡としては";
		mes "あまりにも状態が";
		mes "良すぎじゃないか？ ";
		cutin "bu_alp1",2;
		next;
		mes "[タマリン]";
		mes "そうですね。";
		mes "よく見てみるとほこりが";
		mes "少し積もっているだけで、";
		mes "あとはかなり綺麗ですね。";
		cutin "ep143_tasta",2;
		next;
		mes "[アルプオカート]";
		mes "どれどれ……。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "残念だ……。";
		mes "あまりにも綺麗に保存されていて、";
		mes "何かを知る事は";
		mes "できないようだ……。";
		cutin "bu_alp2",2;
		next;
		mes "[アルプオカート]";
		mes "水が溜まっていたなら";
		mes "乾きながら何かしらの";
		mes "跡でも残すと思うんだが、";
		mes "なぜか何の痕跡もない。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "単純に、かなりの年月が";
		mes "経っているからかも";
		mes "知れないけどな。";
		next;
		mes "[アルプオカート]";
		mes "周辺を回りながら";
		mes "違うものをもう少し";
		mes "探してみよう……。";
		next;
		mes "[タマリン]";
		mes "それでは左に山積みにされている";
		mes "ガラクタたちでも、";
		mes "ちょっと調べてみますか？";
		viewpoint 1,95,238,1,0xFF8000; //59143
		cutin "ep143_tasta",2;
		delquest 11367;
		setquest 11368;
		set VER2_QUE,7;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	else if(VER2_QUE == 7) {
		mes "[アルプオカート]";
		mes "周辺を回りながら";
		mes "違うものをもう少しだけ";
		mes "探してみよう……。";
		cutin "bu_alp1",2;
		next;
		mes "[タマリン]";
		mes "それでは左に山積みされている";
		mes "ガラクタでも、";
		mes "ちょっと調べてみますか？";
		viewpoint 1,95,238,1,0xFF8000; //59143
		cutin "ep143_tasta",2;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	mes "‐平凡な噴水台で何もない‐";
	close;
}
verus04.gat,95,238,0	script	ガラクタ#ep15_1elb	10043,{/* 59398 */
	if(VER2_QUE == 7) {
		mes "[アルプオカート]";
		mes "……。";
		mes "いくら見回ってみても";
		mes "荒れ果てた感じがない……。";
		mes "長い時間放置された";
		mes "遺跡だという感じが";
		mes "まったくしないほどに。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "壊れた機械が積まれている以外、";
		mes "それらしいものは";
		mes "見当たらないな……。";
		next;
		mes "[アルプオカート]";
		mes "それにあの、左側にある木を見てみろ。";
		mes "あの木も何かひっかかる……。";
		cutin "bu_alp3",2;
		viewpoint 1,79,249,1,0xFF8000; //59144
		delquest 11368;
		setquest 11369;
		set VER2_QUE,8;
		close2;
		cutin "bu_alp3",255;
		end;
	}
	else if(VER2_QUE == 8) {
		mes "[アルプオカート]";
		mes "左にある木を見てみろ。 ";
		mes "……少し気になる点がる。";
		cutin "bu_alp3",2;
		close2;
		cutin "bu_alp3",255;
		end;
	}
	mes "‐ガラクタがばらまかれている‐";
	close;
}
verus04.gat,79,249,0	script	木#ep15_1elb	10043,{/* 59399 */
	if(VER2_QUE == 8) {
		mes "[テューリアン]";
		mes "そういえば……。";
		mes "先にここに到着した時に、";
		mes "少し変だなと思っていた部分があるんだ。";
		mes "木は、お日様があってこそ、";
		mes "育つものじゃないのか？";
		cutin "bu_du1",2;
		next;
		mes "[タマリン]";
		mes "なっ……!?";
		mes "テューリアンが珍しく";
		mes "まともなことを言いましたね。";
		cutin "ep143_tahuk",2;
		next;
		mes "[テューリアン]";
		mes "何!?";
		cutin "bu_du5",2;
		next;
		mes "[マークイシャ]";
		mes "確かに、こいつの言うとおり。";
		mes "この木はどうやってこんな地下で";
		mes "育ったんでしょうね……？";
		mes "陽も当らない場所なのに……。";
		cutin "bu_mark1",2;
		next;
		mes "[マギスティン]";
		mes "……あの。";
		mes "少し調べてみましたが、";
		mes "特別な魔法などは";
		mes "かかってはいないようです。";
		cutin "bu_maggi1",2;
		next;
		mes "[テューリアン]";
		mes "賢くて可愛く、気のつくところが";
		mes "流石、マギだな！";
		mes "ところでここから見えるドアの前に";
		mes "変なものがあるぞ！";
		mes "気になるから見にいこうぜ!!";
		viewpoint 1,62,255,1,0xFF8000; //59145
		cutin "bu_du2",2;
		delquest 11369;
		setquest 11370;
		set VER2_QUE,9;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 9) {
		mes "[テューリアン]";
		mes "ここから見える";
		mes "ドアの前に変なものがあるぞ！";
		mes "気になるから見にいこうぜ!!";
		viewpoint 1,62,255,1,0xFF8000; //59145
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		end;
	}
	mes "‐地下で育った割には";
	mes "　かなり元気にたくましく";
	mes "　育った木のようだ。";
	mes "　地下で育ったという以外に";
	mes "　特別なことはないように";
	mes "　思える……‐";
	close;
}
verus04.gat,62,255,0	script	表示板#ep15_1elb	10043,{/* 59400 */
	if(VER2_QUE == 9) {
		mes "[マークイシャ]";
		mes "おい、テューリアン!!";
		mes "危険かも知れないから、";
		mes "勝手に歩き回るな！";
		cutin "bu_mark3",2;
		next;
		mes "[テューリアン]";
		mes "冒険者にチャレンジ精神は、";
		mes "必須なんだぞ！";
		cutin "bu_du2",2;
		next;
		mes "[テューリアン]";
		mes "こんなところでもたもたしていて、";
		mes "他の奴らに全部奪われたら";
		mes "どうするんだ!!";
		cutin "bu_du1",2;
		next;
		mes "[タマリン]";
		mes "以前もそんな事を言って";
		mes "結局は調査どころか、";
		mes "一ヶ月も病院に世話して";
		mes "もらったじゃないですか!!";
		cutin "ep143_taang",2;
		next;
		mes "[テューリアン]";
		mes "その時とは違う！";
		mes "そのお陰かは知らないが、";
		mes "多少の事故で怪我なんて";
		mes "しない体になってしまったしな！";
		mes "わっはっはっはっはっ！";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "自慢か？　それ……。";
		cutin "bu_mark4",2;
		next;
		mes "[アルプオカート]";
		mes "それより、見てみろ。";
		mes "この建物の後ろ。";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "よくみるとどうやら、";
		mes "上の方に道が続いているようだ。";
		cutin "bu_alp3",2;
		next;
		mes "[テューリアン]";
		mes "むむっ、確かに……。";
		mes "そこに道がある以上、";
		mes "冒険するのが俺たち、冒険者!!";
		mes "なぜならそこに、道があるからだ!!";
		mes "わはっはっはっはっはっ!!";
		mes "って事で、突撃!!";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "おい!!　止まれ!!";
		mes "最初に言った私の話を";
		mes "お前、聞いてないのか!?";
		cutin "bu_mark3",2;
		next;
		mes "[マークイシャ]";
		mes "ああ、もう！";
		mes "本当に懲りないやつだ!!";
		cutin "bu_mark4",2;
		next;
		mes "[マギスティン]";
		mes "マークさん……";
		mes "テューがもうあっちまで……。";
		cutin "bu_maggi1",2;
		next;
		mes "[マークイシャ]";
		mes "前にも似たことがあったぞ!?";
		mes "そうだ、エクラージュだ!!";
		mes "……あんの、トラブルメーカー!!";
		cutin "bu_mark3",2;
		next;
		mes "[マークイシャ]";
		mes "もっと遠くなる前に早く、";
		mes "追いつかなければ！";
		mes "急ぎましょう!!";
		cutin "bu_mark1",2;
		viewpoint 1,44,265,1,0xFF8000; //59146
		delquest 11370;
		setquest 11371;
		set VER2_QUE,10;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 10) {
		mes "[アルプオカート]";
		mes "建物の後ろの方を少し見てみろ。";
		mes "上の方に道がのびているようだ。";
		cutin "bu_alp3",2;
		next;
		mes "[テューリアン]";
		mes "むむっ、確かに……。";
		mes "そこに道がある以上、";
		mes "冒険するのが俺たち、冒険者!!";
		mes "なぜならそこに、道があるからだ!!";
		mes "わはっはっはっはっはっ!!";
		mes "って事で、突撃!!";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "おい!!　止まれ!!";
		mes "最初に言った私の話を";
		mes "お前、聞いてないのか!?";
		cutin "bu_mark3",2;
		next;
		mes "[マークイシャ]";
		mes "ああ、もう！";
		mes "本当に懲りないやつだ!!";
		cutin "bu_mark4",2;
		next;
		mes "[マギスティン]";
		mes "マークさん……";
		mes "テューがもうあっちまで……。";
		cutin "bu_maggi1",2;
		next;
		mes "[マークイシャ]";
		mes "前にも似たことがあったぞ!?";
		mes "そうだ、エクラージュだ!!";
		mes "……あんの、トラブルメーカー!!";
		cutin "bu_mark3",2;
		next;
		mes "[マークイシャ]";
		mes "もっと遠くなる前に早く、";
		mes "追いつかなければ！";
		mes "急ぎましょう!!";
		viewpoint 1,44,265,1,0xFF8000; //59146
		cutin "bu_mark1",2;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	mes "‐ドアがふさがれている‐";
	close;
}
verus03.gat,46,23,3	script	テューリアン#ep15_1elb0	628,{/* 59401 */
	if(VER2_QUE == 10) {
		mes "[テューリアン]";
		mes "へぇ。";
		mes "さっきと大して変わらない場所だと";
		mes "思っていたが……";
		mes "良くわからない機械が";
		mes "こっちには歩き回っているな。";
		emotion 23,"テューリアン#ep15_1elb0"; //59147
		cutin "bu_du5",2;
		next;
		mes "[テューリアン]";
		mes "ジュピロスに現れる奴らと";
		mes "一緒の奴らなのか……？";
		mes "ここはジュピロスと、";
		mes "どういう関係だ……？";
		cutin "bu_du1",2;
		next;
		mes "[テューリアン]";
		mes "そういえばあっちの上の方に";
		mes "さっき見た噴水台と似た形をしている";
		mes "噴水台がまたあるようだ。";
		mes "行って見るかい？";
		cutin "bu_du2",2;
		delquest 11371;
		setquest 11372;
		set VER2_QUE,11;
		viewpoint 1,44,65,1,0xFF8000; //59147
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 11) {
		mes "[テューリアン]";
		mes "そういえばあっちの上の方に";
		mes "さっき見た噴水台と似た形をしている";
		mes "噴水台がまたあるようだ。";
		mes "行って見るかい？";
		cutin "bu_du2",2;
		viewpoint 1,44,65,1,0xFFFF8000; //59147
		close2;
		cutin "bu_du2",255;
		end;
	}
	mes "[テューリアン]";
	mes "なんでだ!?";
	mes "なんでみんなすぐにどこかに";
	mes "行くんだ！？";
	mes "というかここどこだ!?";
	cutin "bu_du5",2;
	close2;
	cutin "bu_du5",255;
	end;
}
verus03.gat,44,65,0	script	噴水台#ep15_1elb03	10043,{/* 59402 */
	if(VER2_QUE == 11) {
		mes "[アルプオカート]";
		mes "ふむ……。";
		mes "相変わらず不自然なほどに";
		mes "綺麗だな。";
		cutin "bu_alp1",2;
		next;
		mes "[タマリン]";
		mes "まるでここだけ時が止まったように";
		mes "保存されている建造物群ですね……。";
		mes "一体ここに住んでいた人たちは";
		mes "どこに行ったのでしょうか？";
		cutin "ep143_tasta",2;
		next;
		mes "[アルプオカート]";
		mes "みんな死んだというには";
		mes "骨や墓のようなものも見当たらない。";
		mes "ここから忽然と";
		mes "姿を消したといったほうが";
		mes "納得できるような風景だな。";
		cutin "bu_alp3",2;
		next;
		mes "[マギスティン]";
		mes "ここも特に魔法などは";
		mes "かかっていないようです……。";
		cutin "bu_maggi1",2;
		next;
		mes "[テューリアン]";
		mes "こうして事件は迷宮に……。";
		cutin "bu_du5",2;
		next;
		mes "[マークイシャ]";
		mes "……。";
		cutin "bu_mark3",2;
		next;
		mes "[テューリアン]";
		mes "どうして殴るんだよ!?";
		cutin "bu_du4",2;
		next;
		mes "[マークイシャ]";
		mes "このバカは放っておいて……";
		mes "私は先に北側の道に沿って";
		mes "のぼってみるので、";
		mes "ゆっくりついて来てください。";
		cutin "bu_mark2",2;
		next;
		mes "[マークイシャ]";
		mes "あっ、" +strcharinfo(0)+ "様。";
		mes "すいませんが、";
		mes "テューリアンの奴が";
		mes "暴走しないように";
		mes "よく見張っておいて下さいね……。";
		cutin "bu_mark3",2;
		delquest 11372;
		setquest 11373;
		set VER2_QUE,12;
		viewpoint 1,88,237,1,0xFF8000; //59148
		close2;
		cutin "bu_mark4",255;
		end;
	}
	else if(VER2_QUE == 12) {
		mes "[マークイシャ]";
		mes "それでは私は先に北側の道に沿って";
		mes "のぼってみるので、";
		mes "ゆっくりついて来てください。";
		cutin "bu_mark2",2;
		next;
		mes "[マークイシャ]";
		mes "あっ、" +strcharinfo(0)+ "様。";
		mes "すいませんが、";
		mes "テューリアンの奴が";
		mes "暴走しないように";
		mes "よく見張っておいて下さいね……。";
		cutin "bu_mark3",2;
		viewpoint 1,88,237,1,0xFF8000; //59148
		close2;
		cutin "bu_mark4",255;
		end;
	}
	mes "‐平凡な噴水台だ。";
	mes "　何もない……‐";
	close;
}
verus03.gat,88,237,3	script	マークイシャ#ep15_1elb0	616,{/* 59403 */
	if(VER2_QUE == 12) {
		mes "[マークイシャ]";
		mes "あの、前にある巨大な機械が";
		mes "見えますか？";
		mes "最初に来た場所とは違って";
		mes "ここには巨大な機械たちが";
		mes "たくさん見えますね。";
		cutin "bu_mark1",2;
		next;
		mes "[マークイシャ]";
		mes "建物や床に壊れた箇所も多いし……。";
		next;
		mes "[マークイシャ]";
		mes "あっちにも道があるようですが、";
		mes "ふさがれていて、入る事ができません。";
		next;
		mes "[マークイシャ]";
		mes "何か危険な感じがするけど……";
		mes "多分、私の気のせいでしょう……。";
		cutin "bu_mark4",2;
		next;
		mes "[マークイシャ]";
		mes "あっ！　タマリン!!";
		mes "そっちの方にあまり深く、";
		mes "入らないで下さい！";
		cutin "bu_mark1",2;
		emotion 23,"マークイシャ#ep15_1elb0"; //59149
		viewpoint 1,51,256,1,0xFF8000; //59149
		delquest 11373;
		setquest 11374;
		set VER2_QUE,13;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 13) {
		mes "[マークイシャ]";
		mes "あっ！　タマリン!!";
		mes "そっちの方にあまり深く、";
		mes "入らないで下さい！";
		cutin "bu_mark1",2;
		emotion 23,"マークイシャ#ep15_1elb0"; //59149
		viewpoint 1,51,256,1,0xFF8000; //59149
		close2;
		cutin "bu_mark1",255;
		end;
	}
	mes "[マークイシャ]";
	mes "まったく……。";
	mes "あいつはまたどこに";
	mes "行ったんだ!?";
	mes "探す方の身にも";
	mes "なってくれ……。";
	cutin "bu_mark3",0;
	close2;
	cutin "bu_mark3",255;
	end;
}
verus03.gat,51,256,3	script	タマリン#ep15_1elb03	10027,{/* 59404 */
	if(VER2_QUE == 13) {
		mes "[タマリン]";
		mes "あっちを見て下さい。";
		mes "他の箇所に比べてかなり壊れています。";
		cutin "ep143_tahuk",2;
		next;
		mes "[タマリン]";
		mes "マギスティン。";
		mes "そっちはどうですか？";
		cutin "ep143_tasta",2;
		viewpoint 1,35,254,1,0xFF8000; //59150
		delquest 11374;
		setquest 11375;
		set VER2_QUE,14;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	else if(VER2_QUE == 14) {
		mes "[タマリン]";
		mes "あっちを見て下さい。";
		mes "他の箇所に比べてかなり壊れています。";
		cutin "ep143_tahuk",2;
		next;
		mes "[タマリン]";
		mes "マギスティン。";
		mes "そっちはどうですか？";
		cutin "ep143_tasta",2;
		viewpoint 1,35,254,1,0xFF8000; //59150
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	mes "[タマリン]";
	mes "向こうは他と比べて";
	mes "かなり壊れていますね……。";
	mes "一体何が……。";
	cutin "ep143_tahuk",2;
	close2;
	cutin "ep143_tahuk",255;
	end;
}
verus03.gat,35,254,3	script	マギスティン#ep15_1elb0	612,{/* 59405 */
	if(VER2_QUE == 14) {
		mes "[マギスティン]";
		mes "あ……。";
		mes "こっちも道が、";
		mes "ふさがれているようです。";
		cutin "bu_maggi1",2;
		next;
		mes "[マギスティン]";
		mes "タマリンさんの前にある、";
		mes "ワープポータルから";
		mes "不思議な力を";
		mes "感じられるのですが……";
		mes "詳しくは分かりません。";
		cutin "bu_maggi3",2;
		next;
		mes "[テューリアン]";
		mes "う……。";
		mes "あそこのワープポータル、";
		mes "何故かわからないが";
		mes "入りたくない感じだな……。";
		cutin "bu_du5",2;
		next;
		mes "[タマリン]";
		mes "!?";
		mes "突進しか知らないから";
		mes "赤いイノシシという";
		mes "あだ名までつけられた";
		mes "テューリアンが行きたがらないとは！";
		cutin "ep143_tahuk",0;
		next;
		mes "[テューリアン]";
		mes "誰が豚だと!?";
		cutin "bu_du5",2;
		next;
		mes "[テューリアン]";
		mes "それじゃなくて!!";
		mes "もっとかっこいいのがいい！";
		cutin "bu_du3",2;
		next;
		mes "[アルプオカート]";
		mes "テューリアン。";
		mes "豚をバカにするな。";
		mes "頭から足まで捨てるものがない、";
		mes "すばらしい家畜だ。";
		cutin "bu_alp1",0;
		next;
		mes "[アルプオカート]";
		mes "それにうまい。";
		cutin "bu_alp4",0;
		next;
		mes "[テューリアン]";
		mes "おいしいのは事実だけど!!";
		mes "それが重要ではない!!";
		cutin "bu_du5",2;
		next;
		mes "[マークイシャ]";
		mes "テューリアンは性格に難ありですけど、";
		mes "野生の勘だけははたらくから、";
		mes "あのワープポータルの先を";
		mes "調べる際は細心の注意が必要と、";
		mes "いいたいようです。";
		mes "そうだよな、イノシシテューリアン？";
		cutin "bu_mark2",0;
		next;
		mes "[テューリアン]";
		mes "おおおい！";
		mes "性格に難ありってなんだ!?";
		mes "それにさりげなく、";
		mes "イノシシテューリアンと";
		mes "呼んだよな!?";
		cutin "bu_du5",2;
		next;
		mes "[アルプオカート]";
		mes "こんなに目立つ障害物を";
		mes "片づけないのは、";
		mes "ファンタスマゴリカプロジェクト側でも";
		mes "まだ、あまり調査できていない";
		mes "場所のようだな……。";
		cutin "bu_alp1",0;
		next;
		mes "[テューリアン]";
		mes "おい!!";
		mes "俺を無視するな!?";
		cutin "bu_du5",2;
		next;
		mes "[タマリン]";
		mes "あまり気は進みませんが";
		mes "探す場所もなくなってきたし、";
		mes "次の調査場所はあの";
		mes "ワープポータルしかないでしょうね。";
		cutin "ep143_tasta",0;
		next;
		mes "[マギスティン]";
		mes "でも、あの先を調べるには";
		mes "許可をもらう必要が";
		mes "ありますよね……？";
		cutin "bu_maggi3",2;
		next;
		if(select("頷く","許可？") == 2) {
			cutin "ep143_tasta",0;
			mes "[タマリン]";
			mes "許可が下りた発掘団のみが";
			mes "立ち入り可能だと統制員の方が";
			mes "言っていましたから、どこかの";
			mes "発掘団に所属して許可を貰わないと、";
			mes "駄目なようですね。";
			next;
			mes "[タマリン]";
			mes "そういえば……";
			mes "発掘団といえばモロクにある、";
			mes "^0000FF楽園団^000000で発掘団の参加メンバーを";
			mes "募っていた気がします。";
			mes "一度、問い合わせてみては";
			mes "いかがでしょう？";
			next;
		}
		mes "[マークイシャ]";
		mes "許可か……では、";
		mes strcharinfo(0)+ "様。";
		mes "私たちは一旦、";
		mes "立ち入り許可を貰いに戻りますから";
		mes "後ほど、ワープポータルの向こうで";
		mes "落ち合うことにしませんか？";
		cutin "bu_mark1",0;
		next;
		mes "[マークイシャ]";
		mes "危険な場所のようですし、";
		mes "みんな一緒に行動したほうが";
		mes "何かあった時……";
		mes "特にあいつが暴走したときは、";
		mes "人数が多いほうが対応できますし。";
		mes "すいませんが、宜しくお願いします。";
		viewpoint 2,35,254,1,0xFFFFFF; //59151
		cutin "bu_mark2",0;
		setquest 11363;
		delquest 11363;
		setquest 11364;
		delquest 11364;
		setquest 11365;
		delquest 11365;
		setquest 11366;
		delquest 11366;
		setquest 11367;
		delquest 11367;
		setquest 11368;
		delquest 11368;
		setquest 11369;
		delquest 11369;
		setquest 11370;
		delquest 11370;
		setquest 11371;
		delquest 11371;
		setquest 11372;
		delquest 11372;
		setquest 11373;
		delquest 11373;
		setquest 11374;
		delquest 11374;
		setquest 118330;
		delquest 118330;
		delquest 11375;
		setquest 11376;
		set VER2_QUE,15;
		getexp 1000000,0; //91278582
		getexp 1000000,0; //92278582
		getexp 1000000,0; //93278582
		getexp 1000000,0; //94278582
		getexp 1000000,0; //95278582
		getexp 0,500000; //5072610
		getexp 0,500000; //5572610
		getexp 0,500000; //6072610
		getexp 0,500000; //6572610
		getexp 0,500000; //7072610
		close2;
		cutin "bu_mark2",255;
		end;
	}
	else if(VER2_QUE == 15) {
		mes "[タマリン]";
		mes "あまり気は進みませんが";
		mes "探す場所もなくなってきたし、";
		mes "次の調査場所はあの";
		mes "ワープポータルしかないでしょうね。";
		mes "ただ、ワープポータル使用には";
		mes "立ち入り許可が必要のようですけど。";
		cutin "ep143_tasta",0;
		next;
		if(select("頷く","許可？") == 2) {
			mes "[タマリン]";
			mes "許可が下りた発掘団のみが";
			mes "立ち入り可能だと統制員の方が";
			mes "言っていましたから、どこかの";
			mes "発掘団に所属して許可を貰わないと、";
			mes "駄目なようですね。";
			next;
			mes "[タマリン]";
			mes "そういえば……";
			mes "発掘団といえばモロクにある、";
			mes "^0000FF楽園団^000000で発掘団の参加メンバーを";
			mes "募っていた気がします。";
			mes "一度、問い合わせてみては";
			mes "いかがでしょう？";
			next;
		}
		mes "[マークイシャ]";
		mes strcharinfo(0)+ "様。";
		mes "では、私たちは一旦";
		mes "立ち入り許可を貰いに戻りますから";
		mes "後ほど、ワープポータルの向こうで";
		mes "落ち合うことにしませんか？";
		cutin "bu_mark1",0;
		next;
		mes "[マークイシャ]";
		mes "危険な場所のようですし、";
		mes "みんな一緒に行動したほうが";
		mes "何かあった時……";
		mes "特にあいつが暴走したときは、";
		mes "人数が多いほうが対応できますし。";
		mes "すいませんが、宜しくお願いします。";
		cutin "bu_mark2",0;
		close2;
		cutin "bu_mark2",255;
		end;
	}
	mes "[マギスティン]";
	mes "……何かはわかりませんが、";
	mes "危険な気が感じられます……。";
	cutin "bu_maggi3",2;
	close2;
	cutin "bu_maggi3",255;
	end;
}
verus04.gat,153,193,8	script	商人#ep15_1el10	879,{/* 59406 */
	mes "[商人]";
	mes "ほほほほほほ♪";
	mes "商売は、がっぽり占有が一番よ〜♪";
	mes "資産が増えれば自分も嬉しいし、";
	mes "お客様にもある程度安く、";
	mes "商品提供できるしね〜♪";
	close;
}
verus04.gat,155,197,5	script	冒険家?#ep15_1el11	870,{/* 59407 */
	mes "[冒険家？]";
	mes "ぐうううう〜……";
	mes "　";
	mes "ぐうううう〜……。";
	next;
	mes "[冒険家？]";
	mes "寝てないぞ。";
	mes "旅費で持っていた金を";
	mes "全部使ってしまって";
	mes "飯を食べるZenyがないんだ。";
	mes "……さっきのは腹の音ね。";
	close;
}
verus04.gat,150,193,3	script	冒険家#ep15_1el12	849,{/* 59408 */
	mes "[冒険家]";
	mes "あの人の腹の音がうるさくて……。";
	mes "おちおち寝てられやしない。";
	mes "特大包み料理でも";
	mes "わけてやるべきか……？";
	close;
}
verus04.gat,102,246,3	script	冒険家#ep15_1el13	930,{/* 59409 */
	mes "[冒険家]";
	mes "キノコが石を貫通して育つとは……";
	mes "これが本当の石キノコってやつ？";
	mes "先輩が見たら喜びそうだ。";
	close;
}
verus04.gat,16,157,3	script	冒険家#ep15_1el14	928,{/* 59410 */
	mes "[冒険家]";
	mes "イライラする!!";
	mes "どうしてこの道は通れない！";
	mes "通れないのに道とか";
	mes "おかしいだろ!!";
	close;
}
verus04.gat,96,192,5	script	冒険ニャン#ep15_1el15	554,{/* 59411 */
	mes "[冒険ニャン]";
	mes "いい場所だニャン……。";
	mes "日向ぼっこに最適だニャン。";
	mes "ニャニャン……♪";
	close;
}
verus04.gat,96,193,5	script	冒険ニャン#ep15_1el16	554,{/* 59412 */
	mes "[冒険ニャン]";
	mes "みんなで冒険に来たニャン。";
	mes "でもこの場所の居心地がとても";
	mes "良すぎて、動けないんだニャン。";
	close;
}
verus04.gat,96,194,5	script	冒険ニャン#ep15_1el17	554,{/* 59413 */
	mes "[冒険ニャン]";
	mes "マラン猫が一匹……マラン猫がニ匹……";
	mes "リーフキャットが一匹……二匹……";
	mes "ワイルドローズが……";
	mes "くーっ……。";
	close;
}
verus04.gat,96,195,5	script	冒険ニャン#ep15_1el18	554,{/* 59414 */
	mes "[冒険ニャン]";
	mes "レアな缶詰をゲットしたニャン!!";
	mes "ニャン達だってやるときは";
	mes "やるんだニャン……。";
	mes "むにゃむにゃ……。";
	close;
}
verus04.gat,104,120,3	script	牛?#ep15_1el19	889,{/* 59415 */
	mes "[牛？]";
	mes "も〜ぅ……。";
	close;
}
verus04.gat,111,215,5	script	冒険家#ep15_1el20	919,{/* 59416 */
	mes "[冒険家]";
	mes "はぁ……ここは凄いな……。";
	mes "で……";
	mes "どうしてあんな場所に牛が……。";
	mes "まさか、牛とウシなわれた";
	mes "文明をかけてるのか!?";
	mes "……すまん、忘れてくれ。";
	close;
}
verus04.gat,111,211,3	script	冒険家#ep15_1el21	906,{/* 59417 */
	mes "[冒険家]";
	mes "こんな凄い文明だったとは……。";
	mes "レッケンベル社が欲しがるのもわかる。";
	mes "場違いに感じる牛も";
	mes "もしかしたら……";
	mes "古代文明によって作られた";
	mes "動物兵器だったり……!?";
	close;
}
verus04.gat,113,235,5	script	冒険家#ep15_1el22	875,{/* 59418 */
	mes "[冒険家]";
	mes "早くすごくかっこいいのを、";
	mes "発見しないと!!";
	mes "古代文明ならきっと、";
	mes "オレの心をくすぐるような";
	mes "何かがみつかるはず……。";
	close;
}
verus04.gat,124,220,8	script	冒険家#ep15_1el23	900,{/* 59419 */
	mes "[冒険家]";
	mes "新しい時代は君たちの";
	mes "時代になるだろね。";
	mes "なんとなく君を見ていたら";
	mes "そう思ったよ。";
	close;
}
verus03.gat,129,21,5	script	放浪バード#ep15	51,{/* 59420 */
	if(checkquest(4295) & 0x8 == 0) {
		mes "[放浪バード]";
		mes "私は各地を巡りながら";
		mes "色々な人々から話を聞いて";
		mes "その話を詩にしています。";
		mes "もし、あなたが各地で面白い物語に";
		mes "出会ったなら私にそれを教えて下さい。";
		setquest 4295;
		compquest 4295;
		close;
	}
	mes "[放浪バード]";
	mes "こんにちは。";
	mes "話を聞かせて頂けるのですか？";
	next;
	if(select("話をする","やめる") == 2) {
		mes "[放浪バード]";
		mes "そうですか……。";
		mes "面白い話がありましたら";
		mes "ぜひ聞かせてください。";
		close;
	}
	mes "[放浪バード]";
	mes "どんな出来事について";
	mes "教えていただけますか？";
	set '@str1$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"レゲンシュルム研究所　"+ (QUE1_TEST >= 13? "報酬受取可能": "未達成") +"^000000";
	set '@str2$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"大統領　"+ (QUE1_TEST >= 13? "報酬受取可能": "未達成") +"^000000";
	set '@str3$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"ジュピロス遺跡調査　"+ (QUE1_TEST >= 13? "報酬受取可能": "未達成") +"^000000";
	set '@str4$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"研究妨害　"+ (QUE1_TEST >= 13? "報酬受取可能": "未達成") +"^000000";
	set '@str5$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"薬クエスト第2部　"+ (QUE1_TEST >= 13? "報酬受取可能": "未達成") +"^000000";
	set '@str6$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"オーディン神殿発掘団　"+ (QUE1_TEST >= 13? "報酬受取可能": "未達成") +"^000000";
	next;
	switch(select('@str1$,'@str2$,'@str3$,'@str4$,'@str5$,'@str6$,"やめる")) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		//	未調査
	case 7:
		mes "[放浪バード]";
		mes "そうですか……。";
		mes "面白い話がありましたら";
		mes "ぜひ聞かせてください。";
		close;
	}
OnInit:
	waitingroom "放浪バード",0; //59420
	end;
}
verus04.gat,194,165,5	script	レッケンベルガード#ver0	868,{/* 59421 */
	mes "[レッケンベルガード]";
	mes "発掘団所属の方ですか？";
	mes "発掘団が作業に集中できるように";
	mes "協力しろという指示を";
	mes "会長より受けておりますので、";
	mes "我々は保安に尽力致します！";
	close;
}
verus04.gat,203,171,3	script	レッケンベルガード#ver0	868,{/* 59422 */
	mes "[レッケンベルガード]";
	mes "レッケンベルはウェルスシティの";
	mes "発掘作業を後援しています。";
	mes "不便な点がありましたら";
	mes "いつでも言って下さい。";
	close;
}
verus04.gat,171,267,3	script	レッケンベルガード#ver0	867,{/* 59423 */
	mes "[レッケンベルガード]";
	mes "もぐもぐ……これは……っ！";
	mes "って、うわっ！";
	mes "危うく警備隊員から貰った";
	mes "薬草味のにくを落とすところ";
	mes "だったじゃないですか！";
	mes "脅かさないで下さい!!";
	close;
}
verus04.gat,218,217,5	script	地質学者#ver04	897,{/* 59424 */
	mes "[地質学者]";
	mes "ふむ、建物が岩の壁によって";
	mes "壊れていますね。";
	mes "しかし壊れているのは確かですが";
	mes "建物や壁の破片は見当たらない。";
	next;
	mes "[助手]";
	mes "はい。";
	next;
	mes "[地質学者]";
	mes "また、町の地層とこの岩の壁は";
	mes "違う時期の物のようですね。";
	mes "詳しい事はもう少し調査をする";
	mes "必要がありそうです。";
	next;
	mes "[助手]";
	mes "はい。";
	next;
	mes "[地質学者]";
	mes "どうしてここにこんな物が";
	mes "存在しているのかは不明ですが、";
	mes "人為的に造られた町では";
	mes "なさそうな気がしますね……。";
	mes "君の考えはどうですか？";
	next;
	mes "[助手]";
	mes "はい。";
	next;
	mes "[地質学者]";
	mes "……わかった、もうやめよう。";
	mes "食事にしよう。";
	next;
	mes "[助手]";
	mes "はいっっ!!!!!!";
	close;
}
verus04.gat,217,216,5	script	助手#ver05	898,{/* 59425 */
	mes "[助手]";
	mes "先生の話はためになるけど";
	mes "ちょっと長いのが……。";
	mes "　";
	mes "あーおなか減った。";
	close;
}
verus04.gat,50,193,3	script	学者#ver06	900,{/* 59426 */
	mes "[学者]";
	mes "シュバルツバルトはミッドガルドの中で";
	mes "最も科学力が発展している国だ。";
	mes "それでも、ここの水準には及ばない。";
	next;
	mes "[学者]";
	mes "ジュピロスも同じだ。";
	mes "ここの科学力がシュバルツバルトに";
	mes "伝わっていたら……。";
	mes "現在は相当な水準の科学大国に";
	mes "なっていただろうな。";
	close;
}
verus04.gat,127,243,3	script	ピエロ#ver07	715,{/* 59427 */
	mes "[ピエロ]";
	mes "こんな閉鎖的な場所で";
	mes "作業を続けていたら";
	mes "頭がおかしくなって";
	mes "しまうかも知れないよ！";
	next;
	mes "[ピエロ]";
	mes "不思議、不思議、";
	mes "本当に不思議な";
	mes "<ジャグリングで占う今日の運勢>";
	mes "一度、占ってみない？";
	next;
	if(select("占う","やめておく") == 2) {
		mes "[ピエロ]";
		mes "占いに油を売るような";
		mes "時間はないってことかい？";
		mes "占いだけに。";
		close;
	}
	mes "[ピエロ]";
	mes "いいよ、それじゃあ";
	mes "このジャグリングの中から";
	mes "好きな色を選んでね。";
	mes "<今日の運勢>を表すものだから";
	mes "慎重にね！";
	next;
	switch(select("赤","青","黄","緑")) {
	case 1:
	case 2:
	case 3:
	case 4:
		// 未調査
	}
	mes "[ピエロ]";
	mes "じゃじゃじゃ〜ん！";
	mes "今日の運勢〜！";
	mes "さあ、見てみましょうか？";
	mes "ジャグリングの中に隠された";
	mes "運勢の紙！";
	next;
	mes "[ピエロ]";
	mes "あなたの運勢は……。";
	next;
	mes "[ピエロ]";
	mes "今日は元気が出ない日……。";
	mes "変わらない日々はもう嫌だよ！";
	mes "だけど肯定的な力は無限なはず！";
	mes "みんなと明るく接していれば、";
	mes "だんだん運気は上がる兆し。";
	mes "ラッキーアイテムは、滅亡の証。";
	next;
	mes "[ピエロ]";
	mes "運勢は気に入った？";
	mes "それとも気に入らない？";
	mes "当たるも八卦、当たらぬも八卦。";
	mes "ってことで、あまり気にせずに";
	mes "発掘作業、頑張ろうぜ〜！";
	mes "また暇な時は遊びに来てねー！";
	close;
}
verus04.gat,180,209,3	script	発掘団員#tre01	898,{/* 59428 */
	mes "[発掘団員]";
	mes "ここに住んでいた人は";
	mes "ウェルスシティでは重要な";
	mes "役割を持った方だったようです。";
	next;
	mes "[発掘団員]";
	mes "決済された多くの書類を部屋で";
	mes "見つけましたから。";
	next;
	mes "[発掘団員]";
	mes "まあ、書類の内容は";
	mes "水道問題や隣人とのトラブルなど";
	mes "大した内容は、ありませんでした。";
	next;
	mes "[発掘団員]";
	mes "ただ、多くの書類に謎の";
	mes "落書きが書かれていたのです。";
	mes "それが猫なのか、モンスターなのか";
	mes "よくわからないのですよ……。";
	mes "恐らく単なる落書きでしょうが、";
	mes "一体誰が書いたのでしょうね。";
	close;
}
verus04.gat,202,181,3	script	#tre02	844,{/* 59429 */
	mes "‐ドアには<ビンヤーミン>";
	mes "　という文字が書かれている‐";
	close;
}
verus04.gat,121,188,3	script	発掘団員 #tre04	898,{/* 59430 */
	mes "[発掘団員]";
	mes "建物には生活に使う物が";
	mes "多く残されていましたが";
	mes "人が住んでいた痕跡は";
	mes "まるでなかったんです。";
	next;
	mes "[発掘団員]";
	mes "他の場所に住んでいたのでしょうか？";
	mes "例えば別荘のような……。";
	close;
}
verus04.gat,119,177,3	script	#tre05	844,{/* 59431 */
	mes "‐ドアには<コーレシュ>という";
	mes "　文字が書かれている。";
	close;
}
verus04.gat,85,145,3	script	#tre06	844,{/* 59432 */
	mes "‐ドアには<アンドロニコス>";
	mes "　という文字が書かれている‐";
	close;
}
verus04.gat,83,131,3	script	発掘団員 #tre07	898,{/* 59433 */
	mes "[発掘団員]";
	mes "歴史に葬られた国の存在を信じ";
	mes "仮説の証明を出来ないまま";
	mes "学会を追放された男が、手に入れた";
	mes "不思議な石を扱える人物を探す";
	mes "という物語が、本に載っていた。";
	mes "面白くてつい読んでしまったよ。";
	close;
}
verus04.gat,71,118,3	script	#tre08	844,{/* 59434 */
	mes "‐ドアには<マイカ>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,71,131,3	script	#tre09	844,{/* 59435 */
	mes "‐ドアには<ゼカリヤ>と";
	mes "　文字が書かれている-";
	close;
}
verus04.gat,71,145,3	script	#tre10	844,{/* 59436 */
	mes "‐ドアには<リヴカー>という";
	mes "　文字が書かれている-";
	close;
}
verus04.gat,39,123,3	script	#tre11	844,{/* 59437 */
	mes "‐ドアには<セイタン>";
	mes "　という文字が書かれている‐";
	close;
}
verus04.gat,17,145,3	script	#tre12	844,{/* 59438 */
	mes "‐ドアには<サーラー>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,16,166,5	script	発掘団員 #tre13	898,{/* 59439 */
	mes "[発掘団員]";
	mes "この家で怪しげなチケットを拾った。";
	mes "でもこのチケット……";
	mes "不吉というか、なんだか";
	mes "死の香りがする気がする。";
	mes "……た、多分オレの";
	mes "勘違いだよな、うん……。";
	close;
}
verus04.gat,118,159,5	script	発掘団員 #tre14	898,{/* 59440 */
	mes "[発掘団員]";
	mes "この家には謎のプランが";
	mes "書かれた紙が";
	mes "5枚ほど落ちている。";
	mes "中でもプランEの";
	mes "綺麗どころを呼ぶが";
	mes "個人的に気になる……。";
	close;
}
verus04.gat,123,143,3	script	#tre15	844,{/* 59441 */
	mes "‐ドアには<ナタン>という";
	mes "　プレートがはまっている‐";
	close;
}
verus04.gat,72,168,3	script	#tre16	844,{/* 59442 */
	mes "‐ドアには<クリースピーヌス>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,91,168,3	script	#tre17	844,{/* 59443 */
	mes "‐ドアには<フランゴー>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,50,197,3	script	発掘団員 #tre18	898,{/* 59444 */
	mes "[発掘団員]";
	mes "……。";
	mes "……ハッ！";
	mes "いつからそこに!?";
	mes "拾った本に夢中で、";
	mes "気づかなかった……。";
	next;
	mes "[発掘団員]";
	mes "この家ではくまのぬいぐるみの";
	mes "形をしたフシギな生き物の";
	mes "物語を見つけたんだ。";
	mes "生まれた場所は違っても";
	mes "仲良くしていけるって言葉が";
	mes "とても良かった……！";
	close;
}
verus04.gat,34,197,3	script	#tre19	844,{/* 59445 */
	mes "‐ドアには<ラール>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,17,245,3	script	#tre20	844,{/* 59446 */
	mes "‐ドアには<フィルス>と";
	mes "　書かれている‐";
	close;
}
verus04.gat,13,262,3	script	#tre21	844,{/* 59447 */
	mes "‐ドアには<スプリウス>と";
	mes "　書かれている‐";
	close;
}
verus04.gat,28,262,3	script	#tre22	844,{/* 59448 */
	mes "‐ドアには<プリームス>と";
	mes "　書かれている‐";
	close;
}
verus04.gat,54,256,3	script	#tre23	844,{/* 59449 */
	mes "‐ドアには<メレンダ>と";
	mes "　書かれている-";
	close;
}
verus04.gat,31,236,3	script	発掘団員 #tre24	898,{/* 59450 */
	mes "[発掘団員]";
	mes "この家から見つかった";
	mes "雑誌に気になる仮面の";
	mes "お話を見つけたんだ。";
	next;
	mes "[発掘団員]";
	mes "困難に立ち向かう";
	mes "「勇気」を込められる";
	mes "かわいらしい仮面が";
	mes "一時期、流行ったらしい。";
	mes "どんな仮面だったのか";
	mes "気になるなあ……。";
	close;
}
verus04.gat,62,230,3	script	#tre25	844,{/* 59451 */
	mes "‐ドアには<ラテレーンシス>と";
	mes "　書かれている‐";
	close;
}
verus04.gat,80,230,3	script	#tre26	844,{/* 59452 */
	mes "‐ドアには<グラックス>と";
	mes "　書かれている‐";
	close;
}
verus04.gat,79,265,3	script	#tre27	844,{/* 59453 */
	mes "‐ドアには<オーウィル>と";
	mes "　書かれている‐";
	close;
}
verus04.gat,96,267,3	script	#tre28	844,{/* 59454 */
	mes "‐ドアには<イモ^f8f8f8ッ^000000プ>と";
	mes "　書かれている‐";
	close;
}
verus04.gat,133,267,3	script	発掘団員 #tre29	898,{/* 59455 */
	mes "[発掘団員]";
	mes "ここは個人が経営する";
	mes "カフェだったのかなあ。";
	mes "ハート・オムライスとか";
	mes "ぷるるんプリンとか、";
	mes "気になる名前が書かれた";
	mes "メニューが落ちてたよ。";
	close;
}
verus04.gat,152,267,3	script	#tre30	844,{/* 59456 */
	mes "‐ドアには<アハーラ>と";
	mes "　書かれている-";
	close;
}
verus04.gat,168,267,3	script	#tre31	844,{/* 59457 */
	mes "‐ドアには<クーリアーティウス>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,190,265,3	script	#tre32	844,{/* 59458 */
	mes "‐ドアには<ラテラーヌス>という";
	mes "　文字が書かれている-";
	close;
}
verus04.gat,172,234,3	script	#tre33	844,{/* 59459 */
	mes "‐ドアには<オレステース>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,204,235,3	script	#tre34	844,{/* 59460 */
	mes "‐ドアには<クラ^f8f8f8ッシ^000000ャーマ^ffffffッス^000000ル>という";
	mes "　文字が書かれている‐";
	close;
}
verus04.gat,121,243,4	script	ジョンダ職員	874,{/* 59461 */
	cutin "zonda_01",2;
	mes "[ジョンダ職員]";
	mes "いらっしゃいませ。";
	mes "（有）ジョンダイベントは、常に";
	mes "最高のサービスを提供しております。";
	mes "どのサービスをご利用いたしますか？";
	next;
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	if('@map$ == "rachel.gat" || '@map$ == "veins.gat")
		set '@word$,"空間移動サービス";
	if('@map$ == "verus04.gat")
		set '@zeny,50;
	else
		set '@zeny,40;
	switch(select("位置セーブサービス","倉庫サービス -> " +'@zeny+ "zeny",'@word$,"カートサービス","終了")) {
	case 1:
		if('@map$ == "lighthalzen.gat")
			savepoint "lighthalzen.gat",94,240;
		else if('@map$ == "hugel.gat")
			savepoint "hugel.gat",97,153;
		else if('@map$ == "rachel.gat")
			savepoint "rachel.gat",115,125;
		else if('@map$ == "veins.gat")
			savepoint "veins.gat",205,102;
		else if('@map$ == "verus04.gat")
			savepoint "verus04.gat",205,102;
		mes "[ジョンダ職員]";
		mes "セーブいたしました。";
		mes "ご利用頂きまして、";
		mes "誠にありがとうございます。";
		break;
	case 2:
		if(basicskillcheck() && getskilllv(1) < 6) {
			mes "[ジョンダ職員]";
			mes "誠に申し訳ございません、お客様。";
			mes "倉庫は、基本スキルレベル6を";
			mes "習得してから利用可能となります。";
			break;
		}
		if(Zeny < '@zeny) {
			mes "[ジョンダ職員]";
			mes "お客様、倉庫利用料は";
			mes '@zeny+ " Zenyとなっております。";
			mes "大変申し訳ございませんが、";
			mes "所持金をお確かめの上、";
			mes "再度話し掛けてください。";
			break;
		}
		set Zeny,Zeny-'@zeny;
		mes "[ジョンダ職員]";
		mes "ご利用頂きまして、";
		mes "誠にありがとうございます。";
		close2;
		openstorage;
		cutin "zonda_01",255;
		end;
	case 3:
		mes "[ジョンダ職員]";
		mes "目的地を選んでください。";
		next;
		if('@map$ == "rachel.gat")
			set '@word$,"ベインス";
		else if('@map$ == "veins.gat")
			set '@word$,"ラヘル";
		if(select('@word$+ " -> 2200 z","キャンセル")==2) {
			mes "[ジョンダ職員]";
			mes "またご利用くださいませ。";
			break;
		}
		if(Zeny < 2200) {
			mes "[ジョンダ職員]";
			mes "お客様、" +'@word$+ "までの";
			mes "空間移動サービスの料金は";
			mes "2200 Zenyとなっております。";
			mes "所持金をお確かめの上、";
			mes "再度ご利用ください。";
			break;
		}
		cutin "zonda_01",255;
		set Zeny,Zeny-2200;
		if('@map$ == "rachel.gat")
			warp "veins.gat",205,102;
		else if('@map$ == "veins.gat")
			warp "rachel.gat",115,125;
		end;
	case 4:
		if(getbaseclass(Class) != CLASS_MC) {
			mes "[ジョンダ職員]";
			mes "お客様、大変申し訳ございませんが、";
			mes "カートサービスは、商人とその上位職";
			mes "専用のサービスとなっております。";
			break;
		}
		if(checkcart()) {
			mes "[ジョンダ職員]";
			mes "大変申し訳ございませんが、";
			mes "お客様は現在カートを";
			mes "ご利用されております。";
			break;
		}
		mes "[ジョンダ職員]";
		mes "カート利用料金は 800 Zenyです。";
		mes "また、カートを利用するには";
		mes "「プッシュカート」スキルが必要です。";
		mes "そのスキルがないとカートを利用";
		mes "できずにお金だけ消えてしまいます。";
		mes "準備はよろしいですか？";
		next;
		if(select("利用する","取り消し")==2) {
			mes "[ジョンダ職員]";
			mes "ありがとうございました。";
			mes "またのご利用をお待ちしております。";
			break;
		}
		if(Zeny < 800) {
			mes "[ジョンダ職員]";
			mes "お客様、カート利用料金は";
			mes "800 Zenyです。";
			mes "大変申し訳ございませんが、";
			mes "所持金をお確かめの上、";
			mes "再度話し掛けてください。";
			break;
		}
		set Zeny,Zeny-800;
		setcart;
		break;
	case 5:
		mes "[ジョンダ職員]";
		mes "（有）ジョンダイベントは、お客様に";
		mes "常に最高のサービスを";
		mes "提供いたしております。";
		mes "ご意見・ご要望などございましたら、";
		mes "いつでもおっしゃってください。";
		next;
		mes "[ジョンダ職員]";
		mes "ご利用頂きまして、";
		mes "誠にありがとうございました。";
		break;
	}
	close2;
	cutin "zonda_01",255;
	end;
}
verus04.gat,144,239,3	shop	道具商人#verus	536,717:600,611:40,504:1200,525:500,610:4000,645:800,656:1500,657:3000,601:60,602:300,1065:100 //59462
verus04.gat,111,251,4	shop	闇販売員	49,6186:500,6146:300,14504:5000,6145:10,12383:11000,6147:100,18000:100,18001:200,18002:200,18003:200,18004:500,12392:220,12393:500,12394:1100,2807:200000,2139:20000,2800:100000,2801:100000,2802:500000,2803:100000,2804:100000,2805:100000,2806:150000,2808:250000 //59463
juperos_01.gat,245,87,0	warp	fr_ju_to_eju		1,1,ver_eju.gat,13,148	//59464
ver_eju.gat,10,148,0	warp	fr_eju_to_ju		1,1,juperos_01.gat,242,87	//59465
ver_eju.gat,107,36,0	warp	fr_eju_to_tun		2,2,ver_tunn.gat,84,82	//59466
ver_tunn.gat,84,86,0	warp	fr_tun_to_eju		1,1,ver_eju.gat,113,38	//59467
ver_tunn.gat,10,36,0	warp	fr_tun_to_ver04		1,1,verus04.gat,202,165	//59468
verus04.gat,204,163,0	warp	fr_ver04_to_tun		1,1,ver_tunn.gat,13,35	//59469
verus04.gat,121,267,0	warp	fr_ver04_to_ver03_1	1,1,verus03.gat,121,20	//59470
verus03.gat,122,17,0	warp	fr_ver03_to_ver04_1	1,1,verus04.gat,121,264	//59471
verus04.gat,44,267,0	warp	fr_ver04_to_ver03_2	1,1,verus03.gat,44,20	//59472
verus03.gat,44,17,0		warp	fr_ver03_to_ver04_2	1,1,verus04.gat,44,264	//59473
verus04.gat,187,169,5	script	ウェルス案内員#01	71,{
	mes "[ウェルス案内員]";
	mes "こんにちは、冒険者の方ですね。";
	mes "もしお困りでしたら";
	mes "私がウェルスをご案内しますよ。";
	mes "どこか行きたい場所はありますか？";
	mes "^ff0000−転送先を選択すると^000000";
	mes "^ff0000　ミニマップに転送先が表示されます−^000000";
	set '@type,strnpcinfo(2);
	setarray '@str$,
		"入口付近",
		"アトナド発掘団キャンプ付近",
		"チャールストン付近",
		"北側",
		"北西側",
		"ミニMAP上の位置表示を消す",
		"やめる";
	set '@str$['@type-1],"";
	next;
	while(1) {
		switch(select(printarray('@str$))) {
		case 1:
			mes "[ウェルス案内員]";
			mes "入口付近ですね。";
			mes "そこでよろしいですか？";
			viewpoint 1,184,161,1,0xFF0000;
			break;
		case 2:
			mes "[ウェルス案内員]";
			mes "アトナド発掘団キャンプ付近ですね。";
			mes "そこでよろしいですか？";
			set '@x,142;
			set '@y,188;
			viewpoint 1,142,188,2,0x00FF00;
			break;
		case 3:
			mes "[ウェルス案内員]";
			mes "チャールストン付近ですね。";
			mes "そこでよろしいですか？";
			viewpoint 1,77,123,3,0x00FFFF;
			break;
		case 4:
			mes "[ウェルス案内員]";
			mes "北側ですね。";
			mes "そこでよろしいですか？";
			set '@x,121;
			set '@y,249;
			viewpoint 1,44,260,4,0xFF00FF;
			break;
		case 5:
			mes "[ウェルス案内員]";
			mes "北西側ですね。";
			mes "そこでよろしいですか？";
			viewpoint 1,44,260,5,0xFFFF00;
			break;
		case 6:
			viewpoint 2,184,161,1,0xFF0000;
			viewpoint 2,142,188,2,0x00FF00;
			viewpoint 2,77,123,3,0x00FFFF;
			viewpoint 2,121,249,4,0xFF00FF;
			viewpoint 2,44,260,5,0xFFFF00;
			continue;
		case 7:
			mes "[ウェルス案内員]";
			mes "そうですか……。";
			mes "必要になったら";
			mes "また声をかけてくださいね。";
			close;
		}
		next;
		if(select("はい","いいえ") == 2)
			continue;
		mes "[ウェルス案内員]";
		mes "それではまいりましょう。";
		close2;
		warp "verus04.gat",'@x,'@y;
		end;
	}
OnInit:
	waitingroom "ウェルス案内",0;
	end;
}
verus04.gat,137,191,4	duplicate(ウェルス案内員#01)	ウェルス案内員#02	71
verus04.gat,81,118,3	duplicate(ウェルス案内員#01)	ウェルス案内員#03	71
verus04.gat,126,252,3	duplicate(ウェルス案内員#01)	ウェルス案内員#04	71
verus04.gat,48,264,4	duplicate(ウェルス案内員#01)	ウェルス案内員#05	71

verus04.gat,115,243,3	script	デイリークエスト案内員#	95,{/* 59479 */
	mes "[デイリークエスト案内員]";
	mes "こんにちは〜！";
	mes "ここでは冒険者さん達の";
	mes "お手伝いをしていますよ〜！";
	mes "今、ウェルスには沢山の人がいるから";
	mes "迷っちゃう人が結構いるみたいで……";
	next;
	mes "[デイリークエスト案内員]";
	mes "そこで！";
	mes "どの依頼を進めたいのか聞いて、";
	mes "ご希望であれば依頼主の元まで";
	mes "私がお送りしているんです！";
	mes "えっへん！";
	next;
	mes "[デイリークエスト案内員]";
	mes "各依頼の報酬についても";
	mes "ご案内をしていますよ〜！";
	mes "さあ、どうします？";
	next;
	switch(select("報酬について教えてほしい","送ってほしい","今は用はない")) {
	case 1:
		mes "[デイリークエスト案内員]";
		mes "は〜い！";
		mes "では、こちらをご覧ください！";
		mes "報酬の一覧ですよ〜。";
		mes "　";
		mes "‐紙を見せてきた‐";
		next;
		mes "^ff0000‐外郭トンネルのモンスター討伐‐^000000";
		mes "　^ff9900古びた鉄塊3個^000000";
		mes "　";
		mes "^ff0000‐中央広場のモンスター討伐‐^000000";
		mes "　^ff9900古びた鉄塊5個^000000";
		mes "　";
		mes "^ff0000‐アトナドの依頼‐^000000";
		mes "　^ff9900古びた鉄塊5個^000000";
		mes "　";
		mes "^ff0000‐凝集されたエネルギー収集‐^000000";
		mes "　^ff9900古びた燃料タンク1個^000000";
		mes "　";
		mes "^ff0000‐成果報告書‐^000000";
		mes "　^ff9900古びた燃料タンク2個^000000";
		mes "　";
		mes "^ff0000‐研究棟のメモリーレコード集め‐^000000";
		mes "　^ff9900古びた燃料タンク1個^000000";
		mes "　";
		mes "^ff0000‐実験棟のメモリーレコード集め‐^000000";
		mes "　^ff9900古びた燃料タンク1個^000000";
		mes "　";
		mes "^ff0000‐ファンタスマゴリカ警備隊‐^000000";
		mes "　この依頼は複数の依頼になっており、";
		mes "　達成した依頼の数により、";
		mes "　報酬が変化します！";
		mes "　全ての依頼を";
		mes "　終わらせてから報告をすると";
		mes "　^FF00001,500,000BaseExp^000000";
		mes "　^FF0000750,000JobExp^000000";
		mes "　^ff9900古びた燃料タンク1個^000000";
		mes "　";
		mes "^ff0000‐月刊ブリガン　特命！生存確認！‐^000000";
		mes "　^ff9900古びた鉄塊1個^000000";
		mes "　";
		mes "^ff0000‐特命！スモッグを掃討せよ！‐^000000";
		mes "　^ff9900古びた鉄塊8個^000000";
		mes "　";
		mes "^ff0000‐特命！^000000";
		mes "^ff0000　修理型ウェルスギア�Uと戦闘せよ！‐^000000";
		mes "　^ff9900古びた鉄塊8個^000000";
		mes "　";
		mes "^ff0000‐特命！鉄虫を収集せよ！‐^000000";
		mes "　^ff9900古びた燃料タンク1個^000000";
		next;
		mes "[デイリークエスト案内員]";
		mes "どんどん";
		mes "チャレンジしてくださいね♪";
		close;
	case 2:
		mes "[デイリークエスト案内員]";
		mes "は〜い！";
		mes "どの依頼にしますか？";
		mes "^0000FF受注不可^000000の依頼は";
		mes "お送りできませんので";
		mes "ご注意くださいね。";
		next;
		switch(select(
			"外郭トンネルのモンスター討伐　^9999CC時間制限中^000000",
			"中央広場のモンスター討伐　^FF0000受注可能^000000",
			"アトナドの依頼　^FF0000受注可能^000000",
			"凝集されたエネルギー収集　^FF0000受注可能^000000",
			"成果報告書　^0000FF受注不可^000000",
			"研究棟のメモリーレコード集め　^FF0000受注可能^000000",
			"実験棟のメモリーレコード集め　^FF0000受注中^000000",
			"ファンタスマゴリカ警備隊　^9999CC時間制限中^000000",
			"月刊ブリガン　特命！生存確認！　^0000FF受注不可^000000",
			"特命！スモッグを掃討せよ！　^0000FF受注不可^000000",
			"特命！修理型ｳｪﾙｽｷﾞｱ�Uと戦闘せよ！　^0000FF受注不可^000000",
			"特命！鉄虫を収集せよ！　^0000FF受注不可^000000",
			"やめる")
		) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			// 未調査
		case 13:
			mes "[デイリークエスト案内員]";
			mes "は〜い。";
			mes "困った時はまた来てくださいね〜。";
			close;
		}
	case 3:
		mes "[デイリークエスト案内員]";
		mes "は〜い。";
		mes "困った時はまた来てくださいね〜。";
		close;
	}
OnInit:
	waitingroom "デイリークエスト案内",0; //59479
	end;
}

verus03.gat,55,245,3	script	レッケンベル学者#e152a0	121,{/* 59486 */
	mes "[レッケンベル学者]";
	mes "ふむ……この機械は";
	mes "何かを追跡する用途で";
	mes "使用されていたように見えるが……。";
	mes "君はどう考える？";
	next;
	mes "[レッケンベル技術者]";
	mes "私の考えも同じです。";
	mes "このスクリーンは追跡したり、";
	mes "監視する何かの位置や状態を";
	mes "確認する目的があったと取れます。";
	next;
	mes "[レッケンベル学者]";
	mes "この閉鎖された地域の";
	mes "内部状況の確認や記録を";
	mes "行っていたのではないか？";
	next;
	mes "[レッケンベル技術者]";
	mes "恐らくそうだと思います。";
	mes "ここで大きな爆発があったというのは";
	mes "この状況を見れば簡単に推測できます。";
	mes "そうだとしたら、外部の人たちは";
	mes "爆発内部の状況を知りたいと思うはず。";
	next;
	mes "[レッケンベル学者]";
	mes "そうだな。";
	mes "それはここの内部の状況を";
	mes "知るためのものだろう。";
	mes "……巨大な爆発の後、生存者を";
	mes "捜索するためだったのかもしれん。";
	next;
	mes "[レッケンベル技術者]";
	mes "……では調査を続けましょう。";
	mes "ここで何が起きたのか、";
	mes "その秘密を解いていくのが";
	mes "私たちの役割ですからね。";
	close;
}
verus03.gat,55,243,3	script	レッケンベル技術者#e152	851,{/* 59487 */
	mes "[レッケンベル学者]";
	mes "ふむ……この機械は";
	mes "何かを追跡する用途で";
	mes "使用されていたように見えるが……。";
	mes "君はどう考える？";
	next;
	mes "[レッケンベル技術者]";
	mes "私の考えも同じです。";
	mes "このスクリーンは追跡したり、";
	mes "監視する何かの位置や状態を";
	mes "確認する目的があったと取れます。";
	next;
	mes "[レッケンベル学者]";
	mes "この閉鎖された地域の";
	mes "内部状況の確認や記録を";
	mes "行っていたのではないか？";
	next;
	mes "[レッケンベル技術者]";
	mes "恐らくそうだと思います。";
	mes "ここで大きな爆発があったというのは";
	mes "この状況を見れば簡単に推測できます。";
	mes "そうだとしたら、外部の人たちは";
	mes "爆発内部の状況を知りたいと思うはず。";
	next;
	mes "[レッケンベル学者]";
	mes "そうだな。";
	mes "それはここの内部の状況を";
	mes "知るためのものだろう。";
	mes "……巨大な爆発の後、生存者を";
	mes "捜索するためだったのかもしれん。";
	next;
	mes "[レッケンベル技術者]";
	mes "……では調査を続けましょう。";
	mes "ここで何が起きたのか、";
	mes "その秘密を解いていくのが";
	mes "私たちの役割ですからね。";
	close;
}
verus03.gat,59,250,7	script	コラル発掘団セシル#e152	742,{/* 59488 */
	mes "[セシル]";
	mes "ねえ、コベル。";
	mes "私たちが優れた発掘団として";
	mes "選定されるために必要な事は？";
	next;
	mes "[コベル]";
	mes "選定されるために必要な事は……？";
	next;
	mes "[セシル]";
	mes "この得体の知れない機械たちの";
	mes "正体を明かすしか、方法はない！";
	next;
	mes "[コベル]";
	mes "どうしてそうなるんだ？";
	mes "私たちの専攻じゃないじゃない？";
	next;
	mes "[セシル]";
	mes "ここで一番多いのは機械なんだ！";
	mes "これを分析すると、";
	mes "私たちもあのアトナド発掘団のように";
	mes "認められるってワケ！";
	next;
	mes "[コベル]";
	mes "あは！　なるほど、そうだね！";
	mes "だけど、そのアトナド発掘団の団員が";
	mes "この近くにいるみたいだけど……";
	next;
	mes "[セシル]";
	mes "なに!?";
	mes "私たちの目標がばれてはいけない！";
	mes "これは私と君だけの秘密だからな！";
	next;
	mes "[コベル]";
	mes "秘密だね？　了解〜！";
	close;
}
verus03.gat,61,250,7	script	コラル発掘団コベル#e152	750,{/* 59489 */
	mes "[セシル]";
	mes "ねえ、コベル。";
	mes "私たちが優れた発掘団として";
	mes "選定されるために必要な事は？";
	next;
	mes "[コベル]";
	mes "選定されるために必要な事は……？";
	next;
	mes "[セシル]";
	mes "この得体の知れない機械たちの";
	mes "正体を明かすしか、方法はない！";
	next;
	mes "[コベル]";
	mes "どうしてそうなるんだ？";
	mes "私たちの専攻じゃないじゃない？";
	next;
	mes "[セシル]";
	mes "ここで一番多いのは機械なんだ！";
	mes "これを分析すると、";
	mes "私たちもあのアトナド発掘団のように";
	mes "認められるってワケ！";
	next;
	mes "[コベル]";
	mes "あは！　なるほど、そうだね！";
	mes "だけど、そのアトナド発掘団の団員が";
	mes "この近くにいるみたいだけど……";
	next;
	mes "[セシル]";
	mes "なに!?";
	mes "私たちの目標がばれてはいけない！";
	mes "これは私と君だけの秘密だからな！";
	next;
	mes "[コベル]";
	mes "秘密だね？　了解〜！";
	close;
}

verus02.gat,79,31,4	script	ケロチェル#1	893,{/* 59522 */
	mes "[ケロチェル]";
	mes "初めまして！　月刊ブリガンの主任記者";
	mes "ケロチェルといいます！";
	mes "一般公開されたこの場所が今";
	mes "冒険者の脚光を浴びているそうです。";
	next;
	mes "[ケロチェル]";
	mes "まだ公開してまもないためか";
	mes "情報が冒険者には";
	mes "伝わりきっていないそうです。";
	mes "そこで！";
	mes "私たちが直接、発掘団員からの";
	mes "情報をレポートしています！";
	next;
	mes "[ケロチェル]";
	mes "ですからよい情報だと";
	mes "思われるものは";
	mes "ぜひご提供をお願いしますね！";
	mes "もちろん情報に見合った";
	mes "見返りは用意します。";
	next;
	mes "[ケロチェル]";
	mes "え？　私たちですか？";
	mes "私たちは「月刊ブリガン」の";
	mes "冒険第2チー……";
	next;
	mes "[ケロチェル]";
	mes "……？";
	next;
	mes "[ケロチェル]";
	mes "あれ？　みんなどこ？";
	mes "……いつの間に消えてる……";
	mes "はあ、またですか。";
	mes "えっと、冒険第2チームは記者2名、";
	mes "カメラマン1名、そして";
	mes "ベテランな先輩が1名です。";
	next;
	mes "[ケロチェル]";
	mes "私はインタビューと記事の整理";
	mes "カメラマンの同期は写真";
	mes "ベテラン先輩は事前調査をしています。";
	mes "やはり危険地域に行くことが多いので";
	mes "最低でもこの構成ですね。";
	next;
	mes "[ケロチェル]";
	mes "多少の戦闘経験はありますが";
	mes "みんな本業は記者ですからね！";
	mes "しかし……新入りの子まで含めて";
	mes "みんなどこにいったのやら。";
	next;
	mes "[ケロチェル]";
	mes "冒険者さん！";
	mes "ちょっと皆さんがどこにいったか";
	mes "探してきてくれませんか？";
	mes "私がこの場を離れると";
	mes "もしも戻ってきたときに";
	mes "合流できないので……お願いします！";
	next;
	if(select("手伝う","手伝わない") == 2) {
		mes "[ケロチェル]";
		mes "そうですか……。";
		mes "気が変わったら";
		mes "また来てください。";
		close;
	}
	// 未調査

OnInit:
	waitingroom "月刊ブリガン",0; //59522
	end;
}
verus03.gat,159,207,4	script	新米記者#1	896,{/* 59523 */
	mes "[トラフ]";
	mes "こんにちは！";
	mes "トラフです！";
	mes "危険な場所でも";
	mes "がんばって取材します！";
	close;
OnInit:
	waitingroom "特命！スモッグを掃討せよ！",0; //59523
	end;
}
verus02.gat,134,169,4	script	カメラマン#1	702,{/* 59524 */
	// 未調査
OnInit:
	waitingroom "特命！修理ウェルスギア�Uと戦闘せよ！",0; //59524
	end;
}
verus01.gat,41,103,4	script	屈強そうな記者#1	52,{/* 59525 */
	mes "[グリルス]";
	mes "俺はグリズリー・グリルス！";
	mes "冒険が大好きな記者だ！";
	close;
OnInit:
	waitingroom "特命！鉄虫を収集せよ！",0; //59525
	end;
}

verus01.gat,231,66,5	script	テューリアン#ベルス	628,{/* 59697 */
	if(VER2_QUE == 15) {
		mes "[テューリアン]";
		mes "まったく、やっと入れたぞ！";
		mes "入場プロセスなんて";
		mes "無くてもいいのにな！";
		cutin "bu_du3",2;
		next;
		mes "[マークイシャ]";
		mes "……お前みたいな奴のために";
		mes "あるんだと思うぞ。";
		mes "あ、" +strcharinfo(0)+ "様も";
		mes "無事に来れたようですね。";
		cutin "bu_mark1",0;
		next;
		mes "[マギスティン]";
		mes "無事に合流できたのは";
		mes "良かったのですが……";
		mes "今までの場所と雰囲気が";
		mes "かなり違っていて、";
		mes "なんだか少し怖いです……。";
		cutin "bu_maggi3",2;
		next;
		mes "[テューリアン]";
		mes "確かに、こりゃひどい。";
		mes "完全にボロボロじゃないか！";
		mes "やっぱりここには凶悪な";
		mes "モンスターが封印されてるんじゃ";
		mes "ないか!?";
		cutin "bu_du1",2;
		next;
		mes "[マークイシャ]";
		mes "……人の話を聞けよ！";
		cutin "bu_mark3",0;
		next;
		mes "[アルプオカート]";
		mes "……。";
		mes "無駄な事で体力を使わない方が良い。";
		mes "早く調査を始めよう。";
		cutin "bu_alp1",2;
		next;
		mes "[タマリン]";
		mes "それはそうと……";
		mes "何故ここが閉鎖されていたのか";
		mes "やっと解った気がします。";
		cutin "ep143_tasta",2;
		next;
		mes "[タマリン]";
		mes "まともな建物はないし、";
		mes "地盤の亀裂も他の地域に比べて";
		mes "特に酷そうだし……。";
		next;
		mes "[タマリン]";
		mes "それに、ここのモンスター……。";
		cutin "ep143_tahuk",2;
		next;
		mes "[タマリン]";
		mes "他所では見ないモンスターですが";
		mes "ここで一体何が……。";
		next;
		mes "[テューリアン]";
		mes "う〜ん……？";
		mes "難しい事はわからないけど";
		mes "ここを調査するのが俺達の仕事だろ！";
		cutin "bu_du2",2;
		next;
		mes "[アルプオカート]";
		mes "そう言えば……";
		mes "さっき聞いた話では、";
		mes "中央に謎の施設があると";
		mes "言っていたな……。";
		cutin "bu_alp3",2;
		next;
		mes "[アルプオカート]";
		mes "確かこの辺りだった。";
		mes "　";
		mes "^0000FF‐アルプオカートが";
		mes "　該当する場所に印を";
		mes "　つけてくれた‐^000000";
		cutin "bu_alp1",2;
		viewpoint 1,151,173,1,0xFF8000;
		next;
		mes "[マークイシャ]";
		mes "では、そこから調査を始めよう。";
		cutin "bu_mark1",0;
		setquest 11375;
		delquest 11375;
		delquest 11376;
		setquest 11381;
		set VER2_QUE,16;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 16) {
		mes "[テューリアン]";
		mes "う〜ん……？";
		mes "難しい事はわかんないけど";
		mes "ここを調査するのが俺達の仕事だろ！";
		cutin "bu_du2",2;
		next;
		mes "[アルプオカート]";
		mes "そう言えば……";
		mes "さっきすれ違った人が、";
		mes "中央には凄い装置があると";
		mes "言っていたな……。";
		cutin "bu_alp3",2;
		next;
		mes "[アルプオカート]";
		mes "確かこの辺りだった。";
		mes "　";
		mes "^0000FF‐アルプオカートが";
		mes "　該当する場所に印を";
		mes "　つけてくれた‐^000000";
		cutin "bu_alp1",2;
		viewpoint 1,151,173,1,0xFF8000;
		next;
		mes "[マークイシャ]";
		mes "では、そこから調査を始めよう。";
		cutin "bu_mark1",0;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE >= 17) {
		mes "[テューリアン]";
		mes "さあ、みんな！";
		mes "調査をはじめようぜ！";
		cutin "bu_du3",2;
		close2;
		cutin "bu_du3",255;
		end;
	}
	mes "[テューリアン]";
	mes "うげっ。";
	mes "みんなとはぐれて迷ってたら";
	mes "変な場所に出たな……。";
	mes "一旦、来た道を戻るか。";
	cutin "bu_du5",2;
	close2;
	cutin "bu_du5",255;
	end;
}
verus01.gat,151,173,3	script	プルット#ベルス	10079,{/* 59698 */
	if(VER2_QUE == 16) {
		mes "[プルット]";
		mes "すっっっごーーい!!";
		mes "これが見える？";
		mes "ここなのよ！　ここ!!";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[プルット]";
		mes "なんかこう";
		mes "グルグルってなりそうじゃない？";
		mes "グルグル〜〜って!!";
		mes "はぁ、うっとり……。";
		next;
		mes "[プルット]";
		mes "丸ごと私の実験室に";
		mes "持ち帰りたいのに……。";
		mes "ここで見守ることしか";
		mes "できないなんて……。";
		cutin "EP15_2_fru_3",2;
		next;
		mes "[プルット]";
		mes "そこであなたに相談！";
		mes "私はここを離れられなくて";
		mes "まだ、ここの下にあるって言う";
		mes "地下シェルターには行ってないの。";
		cutin "EP15_2_fru_1",2;
		next;
		mes "[プルット]";
		mes "興味があるなら私の代わりに";
		mes "調査してみない？";
		mes "もちろん、興味あるよね？";
		mes "あるでしょ！";
		mes "あるに決まってるよね！";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[プルット]";
		mes "こんな親切に調査ポイントまで";
		mes "指定するなんて、";
		mes "滅多に無いんだからね！";
		next;
		mes "[プルット]";
		mes "あと、私はレッケンベル所属の";
		mes "学者だから、ここで恩を売っておけば";
		mes "あなたにとっても損な話じゃ";
		mes "ないと思うの。";
		mes "というわけで！";
		cutin "EP15_2_fru_1",2;
		next;
		mes "[プルット]";
		mes "もちろんやるよね？";
		mes "協力してくれてありがとう！";
		cutin "EP15_2_fru_2",2;
		next;
		if(select("協力する","協力しない") == 2) {
			mes "[プルット]";
			mes "え……あれ？";
			mes "嘘、やらないの？";
			mes "……ざんねーん。";
			cutin "EP15_2_fru_1",2;
			close2;
			cutin "EP15_2_fru_1",255;
			end;
		}
		mes "[プルット]";
		mes "やた♪　ありがと！";
		mes "ここから^0000FFちょびっと左に行ったら^000000";
		mes "中を案内してくれる人がいるよ！";
		mes "でもあの人、いつからあそこに";
		mes "いるんだろーー？";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[プルット]";
		mes "それにずーーっとずーーーっと";
		mes "あそこに居るきがする……。";
		mes "いない時をみたことがない";
		mes "気がするんだけど……。";
		mes "気のせいなのかな？";
		mes "まっ、いいか。";
		cutin "EP15_2_fru_1",2;
		next;
		cutin "EP15_2_fru_2",2;
		mes "[プルット]";
		mes "それじゃ、おもしろい話";
		mes "いっぱい見つけてきてね〜！";
		viewpoint 2,151,173,1,0xFF8000;
		delquest 11381;
		setquest 11382;
		set VER2_QUE,17;
		close2;
		cutin "EP15_2_fru_2",255;
		end;
	}
	else if(VER2_QUE == 17) {
		mes "[プルット]";
		mes "やた♪　ありがと！";
		mes "ここから^0000FFちょびっと左に行ったら^000000";
		mes "中を案内してくれる人がいるよ！";
		mes "でもあの人、いつからあそこに";
		mes "いるんだろーー？";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[プルット]";
		mes "それにずーーっとずーーーっと";
		mes "あそこに居るきがする……。";
		mes "いない時をみたことがない";
		mes "気がするんだけど……。";
		mes "気のせいなのかな？";
		mes "まっ、いいか。";
		cutin "EP15_2_fru_1",2;
		next;
		cutin "EP15_2_fru_2",2;
		mes "[プルット]";
		mes "それじゃ、おもしろい話";
		mes "いっぱい見つけてきてね〜！";
		close2;
		cutin "EP15_2_fru_2",255;
		end;
	}
	else if(VER2_QUE >= 18 || VER2_QUE <= 38) {
		mes "[プルット]";
		mes "どう？　何か進捗はあった？";
		mes "地下シェルターと一言で言うけど";
		mes "結構大きいらしいからね。";
		cutin "EP15_2_fru_3",2;
		next;
		mes "[プルット]";
		mes "適当に見てたら見逃しちゃうかも♪";
		close2;
		cutin "EP15_2_fru_3",255;
		end;
	}
	else if(VER2_QUE >= 39) {
		mes "[プルット]";
		mes "地下はどうだった〜？";
		mes "へえ〜!!　本当に!?";
		mes "うわぁ、すっごいね！";
		mes "で？　で？　その次は？";
		mes "どうなの？　ねえってば〜！";
		cutin "EP15_2_fru_2",2;
		close2;
		cutin "EP15_2_fru_2",255;
		end;
	}
	mes "[プルット]";
	mes "すっっっごーーい!!";
	mes "これが見える？";
	mes "これなんだよ！　これ!!";
	cutin "EP15_2_fru_2",2;
	next;
	menu "実験棟の地下施設について聞く",-;
	cutin "EP15_2_fru_1",2;
	mes "[プルット]";
	mes "んっ、実験棟の地下施設？";
	mes "シェルターのこと？";
	mes "それならここから";
	mes "^0000FFちょびっと左に行ったら^000000";
	mes "入り口があるよ。";
	next;
	cutin "EP15_2_fru_2",2;
	mes "[プルット]";
	mes "私はシェルターより今は";
	mes "ここが大事だから……";
	mes "はぁ、うっとり……。";
	mes "いつか実験室に";
	mes "持ち帰りたいなあ……。";
	close2;
	cutin "EP15_2_fru_2",255;
	end;
}
verus01.gat,123,181,3	script	ベリティ#Warper	10078,{/* 59699 */
	mes "[ベリティ]";
	mes "あら、いらっしゃい。";
	mes "地下シェルターの調査に来たの？";
	cutin "EP15_2_brt_2",2;
	next;
	if(VER2_QUE >= 39 && countitem(6828))
		set '@str$,"重力安全装置を使いたい";
	switch(select("はい","いいえ",'@str$)) {
	case 1:
		if(VER2_QUE < 39) {
			mes "[ベリティ]";
			mes "地下はかなり危険らしいわ。";
			mes "気をつけて行きなさい。";
			cutin "EP15_2_brt_1",2;
			next;
			mes "[ベリティ]";
			mes "他の地域には生息していない";
			mes "モンスターが出現……ね。";
			mes "　";
			mes "……モンスターのほうが";
			mes "まだ、マシかもね……。";
			cutin "EP15_2_brt_3",2;
			close2;
			cutin "EP15_2_brt_3",255;
			warp "un_bunker.gat",98,91;
			end;
		}
		else {
			mes "[ベリティ]";
			mes "そう……。";
			mes "また調べるのね。";
			cutin "EP15_2_brt_3",2;
			next;
			mes "[ベリティ]";
			mes "とりあえずもし何か分かっても";
			mes "私には言わないで頂戴。";
			mes "お願いよ……。";
			cutin "EP15_2_brt_4",2;
			close2;
			cutin "EP15_2_brt_4",255;
			warp "un_bunker.gat",98,91;
			end;
		}
	case 2:
		mes "[ベリティ]";
		mes "あら、そう。";
		cutin "EP15_2_brt_1",2;
		close2;
		cutin "EP15_2_brt_1",255;
		end;
	case 3:
		mes "[ベリティ]";
		mes "^0000FF重力安全装置^000000を使えば";
		mes "最深部の部屋入口まで";
		mes "簡単に行けるけど";
		mes "どうするの？";
		cutin "EP15_2_brt_1",2;
		next;
		switch(select("使用する","やめる","重力安全装置とは？")) {
		case 1:
			mes "[ベリティ]";
			mes "そう。";
			mes "じゃあ、貸して頂戴。";
			mes "私が操作するから。";
			close2;
			cutin "EP15_2_brt_1",255;
			warp "un_myst.gat",158,38;
			end;
		case 2:
			mes "[ベリティ]";
			mes "あら、そう。";
			close2;
			cutin "EP15_2_brt_1",255;
			end;
		case 3:
			mes "[ベリティ]";
			mes "^0000FF重力安全装置^000000は";
			mes "地下シェルターの重力を安定させて";
			mes "方向感覚を失わないように";
			mes "してくれる装置よ。";
			next;
			mes "[ベリティ]";
			mes "重力安全装置は壊れたりしないし、";
			mes "調査時間の短縮にもなるから";
			mes "便利なのよね……。";
			mes "持ってるなら私が操作するから";
			mes "操作方法が分からなくても";
			mes "問題ないわよ。";
			close2;
			cutin "EP15_2_brt_1",255;
			end;
		}
	}
}
un_bunker.gat,100,96,3	script	マークイシャ#シェルター	616,{/* 59700 */
	if(VER_1QUE == 29) {
		cutin "bu_mark1",0;
		mes "[マークイシャ]";
		mes "おや、私たち以外にも";
		mes "こんなところに人が……。";
		mes "よく見たら";
		mes strcharinfo(0)+ "様ではないですか。";
		next;
		mes "[マークイシャ]";
		mes "そうだ、" +strcharinfo(0)+ "様。";
		mes "ここでこんなものを";
		mes "見つけたのですが……。";
		next;
		mes "[マークイシャ]";
		mes "私にはこれが何かわかりませんが、";
		mes strcharinfo(0)+ "様なら";
		mes "何かの役に立つかもしれません。";
		mes "お渡ししておきますね。";
		next;
		if(checkitemblank() == 0) {
			mes "[マークイシャ]";
			mes "おや……。";
			mes "渡そうとしましたが、";
			mes "荷物が多いみたいですね。";
			mes "種類数を減らしてから";
			mes "声をかけてください。";
			close2;
			cutin "bu_mark1.bmp", 255;
			end;
		}
		getitem 6824,2;
		mes "‐実験棟のメモリーレコードを";
		mes "　手に入れた。";
		mes "　団長アルクイエンの元へ戻ろう‐";
		set VER_1QUE,30;
		delquest 118208;
		setquest 118209;
		close2;
		cutin "bu_mark1",255;
		end;
		
		cutin "bu_mark1.bmp", 0;
		mes "[マークイシャ]";
		mes "おや、私たち以外にも";
		mes "こんなところに人が……。";
		mes "あなたもここの調査に来た";
		mes "冒険者ですか？";
		next;
		mes "[マークイシャ]";
		mes "そうだ、ここで";
		mes "こんなものを見つけたのですが……。";
		next;
		mes "[マークイシャ]";
		mes "私にはこれが何かわかりませんが、";
		mes "あなたなら";
		mes "何かの役に立つかもしれません。";
		mes "お渡ししておきますね。";
		next;
		if(checkitemblank() == 0) {
			mes "[マークイシャ]";
			mes "おや……。";
			mes "渡そうとしましたが、";
			mes "荷物が多いみたいですね。";
			mes "種類数を減らしてから";
			mes "声をかけてください。";
			close2;
			cutin "bu_mark1.bmp", 255;
			end;
		}
		getitem 6824, 2;
		mes "‐実験棟のメモリーレコードを";
		mes "　手に入れた。";
		mes "　団長アルクイエンの元へ戻ろう‐";
		set VER_1QUE,30;
		delquest 118208;
		setquest 118209;
		close2;
		cutin "bu_mark1.bmp", 255;
		end;
	}
	if(VER2_QUE == 17) {
		mes "[マークイシャ]";
		mes "あ、" +strcharinfo(0)+ "様。";
		mes "すいません。";
		mes "あいつがいつものように";
		mes "暴走したので先に中に";
		mes "入っていました……。";
		cutin "bu_mark3",0;
		next;
		mes "[マークイシャ]";
		mes "それにしても……";
		mes "上に比べると、かなり綺麗だけど";
		mes "何だろう……";
		mes "この吐き気がする臭いは……。";
		cutin "bu_mark4",0;
		next;
		mes "[アルプオカート]";
		mes "少し先の道を見てきたが、";
		mes "他の地域には居なかった";
		mes "アンデッドがいるみたいだ。";
		mes "臭いはそのせいかもしれない。";
		cutin "bu_alp1",2;
		next;
		mes "[マークイシャ]";
		mes "そういえばここに来る前に";
		mes "聞いたんだけど……";
		mes "ここは構造上、人が避難する為の";
		mes "シェルターとして建造されたらしい。";
		cutin "bu_mark1",0;
		next;
		mes "[タマリン]";
		mes "ということは……";
		mes "ここにいるアンデッドは……。";
		cutin "ep143_tahuk",2;
		next;
		mes "[マギスティン]";
		mes "マークさん。";
		mes "……私、怖いです……。";
		mes "本当にここを、";
		mes "調べるのですか……？";
		cutin "bu_maggi4",2;
		next;
		mes "[マークイシャ]";
		mes "ごめんごめん、落ち着いて。";
		mes "他に気になる場所は";
		mes "確かに幾つかあるけど……";
		mes "まずはここをくまなく調べよう。";
		cutin "bu_mark1",0;
		next;
		mes "[テューリアン]";
		mes "そ……そ、そうだな！";
		mes "こここ、こんなのは何とも無いぞ!!";
		mes "ハハハ！";
		cutin "bu_du5",2;
		next;
		mes "[アルプオカート]";
		mes "それでは各自で調査を行い";
		mes "何か見つけたら合図をしよう。";
		cutin "bu_alp1",2;
		next;
		mes "[テューリアン]";
		mes "ちょ……ちょっと待てよ!!";
		mes "危険だから一緒に動いた方が";
		mes "いいんじゃないか……？";
		cutin "bu_du5",2;
		next;
		mes "[テューリアン]";
		mes "……おいーっ!!";
		mes "だから一緒に……";
		mes "……ってお前らー!!";
		mes "歩くの早すぎだろ!?";
		delquest 11382;
		setquest 11383;
		set VER2_QUE,18;
		close2;
		cutin "bu_du5",255;
		end;
	}
	else if(VER2_QUE == 18) {
		mes "[マークイシャ]";
		mes "まずはここをくまなく調べましょう。";
		cutin "bu_mark1",0;
		next;
		mes "[テューリアン]";
		mes "そ……そ、そうだな！";
		mes "こここ、こんなのは何とも無いぞ!!";
		cutin "bu_du5",2;
		next;
		mes "[アルプオカート]";
		mes "それでは各自で調査を行い";
		mes "何か見つけたら合図をしよう。";
		cutin "bu_alp1",2;
		next;
		mes "[テューリアン]";
		mes "ちょ……ちょっと待てよ!!";
		mes "危険だから一緒に動いた方が";
		mes "いいんじゃないか……？";
		cutin "bu_du5",2;
		next;
		mes "[テューリアン]";
		mes "……おいーっ!!";
		mes "だから一緒に……";
		mes "……ってお前らー!!";
		mes "歩くの早すぎだろ!?";
		close2;
		cutin "bu_du5",255;
		end;
	}
	mes "[マークイシャ]";
	mes "この場所を見つけたまでは";
	mes "良かったのですが……";
	mes "何だろう……";
	mes "この吐き気がする臭いは……。";
	cutin "bu_mark4",0;
	next;
	mes "[マークイシャ]";
	mes "やっぱりこの場所の調査には";
	mes "もう少し人手が居たほうが";
	mes "良さそうだ……。";
	close2;
	cutin "bu_mark4",255;
	end;
}
un_bunker.gat,363,171,3	script	アルプオカート#入口	615,{/* 59701 */
	if(VER2_QUE == 18) {
		mes "[アルプオカート]";
		mes "……。";
		mes "　";
		mes "^0000FF‐アルプオカートが熱心に";
		mes "　近くの壁を調べている‐^000000";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "来たか……。";
		mes "テューリアンが意外にも";
		mes "早いと思ったら……";
		mes "そういうことか。";
		cutin "bu_alp3",2;
		next;
		mes "[テューリアン]";
		mes "意外にもってなんだ!?";
		mes "ところでそこの、何の変哲もない";
		mes "壁がどうかしたのか？";
		cutin "bu_du5",2;
		next;
		mes "[アルプオカート]";
		mes "この壁の向こうにどうも";
		mes "空間があるようだ。";
		mes "そういえば以前……";
		cutin "bu_alp1",2;
		next;
		mes "[アルプオカート]";
		mes "いや、なんでもない。";
		mes "他の奴らも呼んで調査を始めよう。";
		cutin "bu_alp3",2;
		next;
		if(select("調査する","やめておく") == 2) {
			mes "[アルプオカート]";
			mes "調査が目的だという事を";
			mes "忘れるな……。";
			cutin "bu_alp1",2;
			close2;
			cutin "bu_alp1",255;
			end;
		}
		mes "[アルプオカート]";
		mes "合図はもう出したから、";
		mes "すぐに他の奴らも来るだろう。";
		next;
		mes "[マギスティン]";
		mes "テューはまだ迷ってるかもと";
		mes "心配していたのですが、";
		mes "もう先に着いていたんですね。";
		mes "良かった……。";
		cutin "bu_maggi2",2;
		next;
		mes "[テューリアン]";
		mes "さすがマギ！";
		mes "俺の次に早く来たんだから。";
		mes "それなのにマドリドは……";
		mes "俺より遅いとは。";
		mes "お前もまだまだだな！";
		mes "この勝負、俺の勝ちだ!!";
		cutin "bu_du2",2;
		next;
		mes "[マークイシャ]";
		mes "……。";
		cutin "bu_mark3",0;
		next;
		mes "[タマリン]";
		mes "遅くなりました。";
		mes "おや……。";
		mes "もう皆さん、お揃いでしたか。";
		mes "テューリアンも今回は";
		mes "間に合ったようですね。";
		cutin "ep143_tasta",2;
		next;
		mes "[ベリティ]";
		mes "ふ〜ん……。";
		mes "ここに何かあるの？";
		cutin "EP15_2_brt_3",2;
		next;
		mes "[テューリアン]";
		mes "うおっ！";
		mes "入口にいたお姉さんじゃないか。";
		mes "何で来てんだよ！";
		mes "ここは危険だぞ！";
		cutin "bu_du4",2;
		next;
		mes "[ベリティ]";
		mes "私はあなたのお姉さんに";
		mes "なった憶えはないわ。";
		mes "……^0000FFベリティ^000000よ。";
		mes "ところで、聞いてないの？";
		mes "私は……。";
		cutin "EP15_2_brt_5",2;
		next;
		mes "[タマリン]";
		mes "あ、そういえば";
		mes "さっきの女の子が言ってましたね。";
		mes "案内してくれる人がいるって。";
		cutin "ep143_tasmi",2;
		next;
		mes "[アルプオカート]";
		mes "ああ……。";
		cutin "bu_alp1",2;
		next;
		mes "[マークイシャ]";
		mes "では、ベリティさん。";
		mes "改めて宜しくお願いします。";
		mes "とりあえず全員揃ったんだ。";
		mes "中に入ってみよう。";
		cutin "bu_mark1",0;
		next;
		mes "[アルプオカート]";
		mes "嫌な予感がする。";
		mes "気を付けよう。";
		cutin "bu_alp1",2;
		delquest 11383;
		setquest 11384;
		set VER2_QUE,19;
		close2;
		cutin "bu_alp1",255;
		warp "un_bunker.gat",385,83;
		end;
	}
	else if(VER2_QUE >= 19) {
		mes "[アルプオカート]";
		mes "早く中を調査するぞ。";
		cutin "bu_alp1",2;
		next;
		if(select("はい","いいえ") == 2) {
			mes "[アルプオカート]";
			mes "調査が目的だという事を";
			mes "忘れるな……。";
			close2;
			cutin "bu_alp1",255;
			end;
		}
		mes "[アルプオカート]";
		mes "嫌な予感がする。";
		mes "気を付けよう。";
		close2;
		cutin "bu_alp1",255;
		warp "un_bunker.gat",385,83;
		end;
	}
	mes "[アルプオカート]";
	mes "……。";
	mes "ここに居ても時間の無駄だと";
	mes "思うぞ……。";
	cutin "bu_alp3",2;
	close2;
	cutin "bu_alp3",255;
	end;
}
un_bunker.gat,387,79,0	warp	#room_out	1,1,un_bunker.gat,362,167	//59702
un_bunker.gat,388,84,3	script	アルプオカート#入口2	615,{/* 59703 */
	if(VER2_QUE == 19) {
		mes "[アルプオカート]";
		mes "やはり……";
		mes "隠されていただけあって";
		mes "この部屋だけ他の部屋とは";
		mes "構造が違うな。";
		cutin "bu_alp3",2;
		next;
		mes "[マークイシャ]";
		mes "確かに……。";
		mes "かなり不自然な位置に";
		mes "扉が付いている。";
		cutin "bu_mark1",0;
		next;
		mes "[タマリン]";
		mes "やはり直接入って";
		mes "調査するしかなさそうですね。";
		cutin "ep143_taang",2;
		next;
		mes "[マギスティン]";
		mes "早く調べて、";
		mes "ここから出たいです……。";
		mes "なんだかここは空気が";
		mes "淀んでいる気がします……。";
		cutin "bu_maggi3",2;
		next;
		mes "[テューリアン]";
		mes "よ〜し！　突撃だ!!";
		mes "マギ、みんながいるから";
		mes "大丈夫だ!!";
		mes "怖くないぞ!!";
		mes "ふはははははははは!!";
		cutin "bu_du5",2;
		delquest 11384;
		setquest 11385;
		set VER2_QUE,20;
		close2;
		cutin "bu_du5",255;
		warp "un_bunker.gat",11,206;
		end;
	}
	else if(VER2_QUE >= 20) {
		mes "[アルプオカート]";
		mes "不自然な部屋、";
		mes "不自然な扉……";
		mes "気になるな……。";
		cutin "bu_alp1",2;
		next;
		if(select("入る","留まる") == 2) {
			mes "[アルプオカート]";
			mes "……。";
			mes "いつまでこうするつもりだ？";
			close2;
			cutin "bu_alp1",255;
			end;
		}
		mes "[アルプオカート]";
		mes "行くぞ……。";
		close2;
		cutin "bu_alp1",255;
		warp "un_bunker.gat",11,206;
		end;
	}
}
un_bunker.gat,12,207,5	script	ベリティ#ミスト	10078,{/* 59704 */
	if(VER2_QUE == 20) {
		mes "[ベリティ]";
		mes "まったく……";
		mes "ここは息が詰まるわね……。";
		mes "んもう、頭痛くなりそう。";
		cutin "EP15_2_brt_3",2;
		next;
		mes "[タマリン]";
		mes "この空間はいったい……。";
		mes "シェルターにしては";
		mes "構造が雑なようですし……。";
		cutin "ep143_tasta",2;
		next;
		mes "[アルプオカート]";
		mes "嫌な臭いが濃くなってきたな。";
		cutin "bu_alp5",2;
		next;
		mes "[タマリン]";
		mes "あっちにも扉があるみたいですね、";
		mes "行って見ましょう！";
		cutin "ep143_tasta",2;
		delquest 11385;
		setquest 11386;
		set VER2_QUE,21;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	else if(VER2_QUE == 21) {
		mes "[ベリティ]";
		mes "まったく……";
		mes "ここは息が詰まるわね……。";
		mes "んもう、頭痛くなりそう。";
		cutin "EP15_2_brt_3",2;
		next;
		mes "[タマリン]";
		mes "この空間はいったい……。";
		mes "シェルターにしては";
		mes "構造が雑なようですし……。";
		cutin "ep143_tasta",2;
		next;
		mes "[アルプオカート]";
		mes "嫌な臭いが濃くなってきたな。";
		cutin "bu_alp5",2;
		next;
		mes "[タマリン]";
		mes "巧妙に隠されていますが";
		mes "ここの扉は先ほどの部屋に戻る";
		mes "扉のようですね……。";
		mes "向こうにも扉があるみたいですが、";
		mes "先に進みますか？";
		mes "それとも一度戻りますか？";
		cutin "ep143_tasta",2;
		next;
		if(select("離れる","扉を開けて最初の部屋に戻る") == 1) {
			mes "‐あなたは扉から離れた‐";
			close2;
			cutin "ep143_tasta",255;
			end;
		}
		mes "[タマリン]";
		mes "そうですね。";
		mes "何が起きるか分かりませんし";
		mes "準備万端の状態で";
		mes "調査するのが正しいでしょうね。";
		mes "では一度、最初の部屋に";
		mes "戻りましょう。";
		cutin "ep143_tasta",2;
		close2;
		cutin "ep143_tasta",255;
		warp "un_bunker.gat",385,83;
		end;
	}
	else if(VER2_QUE >= 22) {
		mes "[ベリティ]";
		mes "んもう、頭痛くなりそう。";
		mes "そういえばこの扉は最初に";
		mes "入ってきた部屋に戻るための";
		mes "扉みたいね。";
		mes "どうする？　戻るの？";
		cutin "EP15_2_brt_3",2;
		next;
		if(select("離れる","扉を開けて部屋に戻る") == 1) {
			mes "[ベリティ]";
			mes "あらそう。";
			mes "なら、ここにとどまる";
			mes "理由はないわね。";
			mes "いきましょう。";
			cutin "EP15_2_brt_4",2;
			close2;
			cutin "EP15_2_brt_4",255;
			end;
		}
		mes "[ベリティ]";
		mes "ほら、早く戻るわよ。";
		mes "こんなところで";
		mes "じっとしてても何も";
		mes "変わらないでしょ。";
		cutin "EP15_2_brt_4",2;
		close2;
		cutin "EP15_2_brt_4",255;
		warp "un_bunker.gat",385,83;
		end;
	}
}
un_bunker.gat,56,206,0	script	#myst_1	45,1,1,{/* 59705 */
	if(VER2_QUE == 20) {
		mes "‐鍵は開いているようだが";
		mes "　扉の前に大量の大きな";
		mes "　ガラクタが置いてあり";
		mes "　簡単には通れそうにない‐";
		next;
		cutin "bu_mark1",0;
		mes "[マークイシャ]";
		mes "これは……";
		mes "とりあえずまだベリティさんが";
		mes "最初の扉付近に居ますね。";
		mes "ベリティさんに声をかけてから";
		mes "入りませんか？";
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 21) {
		mes "‐鍵は開いているようだが";
		mes "　扉の前に大量の大きな";
		mes "　ガラクタが置いてあり";
		mes "　簡単には通れそうにない‐";
		next;
		if(select("ガラクタを撤去する","立ち去る") == 2) {
			mes "[テューリアン]";
			mes "何だよ、何もしないで帰るのか？";
			mes "ここまで来たら、";
			mes "チリ一つ見逃さずに";
			mes "調べるぞ!!";
			mes "……マドリドが。";
			cutin "bu_du1",2;
			close2;
			cutin "bu_du1",255;
			end;
		}
		mes "[テューリアン]";
		mes "ふはははははははは!!";
		mes "ここは俺に任せて、";
		mes "みんな下がるんだっ!!";
		mes "イグニッションブレイクッ!!";
		cutin "bu_du1",2;
		next;
		misceffect 722,"";
		cutin "bu_du1",255;
		mes "^0000FF‐テューリアンの放った";
		mes "　イグニッションブレイクのお陰で";
		mes "　ガラクタは跡形もなく";
		mes "　吹き飛んだ……‐^000000";
		next;
		mes "[タマリン]";
		mes "危ないじゃないですか!!";
		mes "下手したら扉まで";
		mes "吹き飛ぶところですよ!?";
		mes "今回はうまくいったから";
		mes "良かったものの……。";
		cutin "ep143_tahuk",2;
		next;
		mes "[アルプオカート]";
		mes "これがテューリアンの";
		mes "最後の活躍に";
		mes "ならなければいいな……。";
		cutin "bu_alp3",2;
		next;
		mes "[テューリアン]";
		mes "なんだよそれは!?";
		mes "その言い方だと";
		mes "どう聞いても俺の";
		mes "脂肪フラグだろ!?";
		cutin "bu_du5",2;
		next;
		mes "[マークイシャ]";
		mes "テューリアン。";
		mes "それを言うなら";
		mes "死亡フラグだ……。";
		cutin "bu_mark3",0;
		next;
		mes "[マギスティン]";
		mes "あっ。";
		mes "テューのお陰で、";
		mes "通れるようになった";
		mes "みたいです。";
		cutin "bu_maggi1",2;
		delquest 11386;
		setquest 11387;
		set VER2_QUE,22;
		close2;
		cutin "bu_maggi1",255;
		warp "un_myst.gat",81,190;
		end;
	}
	else if(VER2_QUE >= 22) {
		mes "‐大量のガラクタが";
		mes "　無残に吹き飛ばされたまま";
		mes "　放置されているのを横目に";
		mes "　扉を開いた‐";
		close2;
		warp "un_myst.gat",81,190;
		end;
	}
}
un_myst.gat,100,190,3	script	テューリアン#ホール	628,{/* 59706 */
	if(VER2_QUE == 22) {
		mes "[テューリアン]";
		mes "うわぁ！";
		mes "すっごい広いな！";
		cutin "bu_du1",2;
		next;
		mes "[マークイシャ]";
		mes "何なんだここは……";
		mes "シェルター内部に";
		mes "こんな空間があるなんて。";
		cutin "bu_mark1",0;
		next;
		mes "[マギスティン]";
		mes "あ……あ……。";
		cutin "bu_maggi3",2;
		next;
		mes "[タマリン]";
		mes "それにしては作りが雑なような……。";
		cutin "ep143_tasta",2;
		next;
		mes "[マギスティン]";
		mes "と……と……。";
		cutin "bu_maggi3",2;
		next;
		mes "[アルプオカート]";
		mes "確かに……奇妙だな。";
		cutin "bu_alp3",2;
		next;
		mes "[マギスティン]";
		mes "と……とび……。";
		cutin "bu_maggi3",2;
		next;
		mes "[テューリアン]";
		mes "マギ、どうしたんだよ。";
		mes "さっきからおかしいぞ？";
		mes "トビウオでも投げたく";
		mes "なったのか？";
		cutin "bu_du2",2;
		next;
		mes "[マギスティン]";
		mes "テュー、そうじゃなくて……";
		mes "とび……";
		mes "扉が……閉まってます！";
		cutin "bu_maggi4",2;
		next;
		mes "[テューリアン]";
		mes "は？";
		cutin "bu_du5",2;
		next;
		mes "[マークイシャ]";
		mes "何っ!?";
		cutin "bu_mark4",0;
		next;
		mes "[テューリアン]";
		mes "うげぇ！";
		mes "ほんとに閉まってる！";
		cutin "bu_du5",2;
		next;
		mes "[テューリアン]";
		mes "おいおい、ちょっと待てよ！";
		mes "俺達閉じ込められたのかよ！";
		next;
		mes "[マークイシャ]";
		mes "みんな、慌てないで！";
		mes "まずは落ち着くんだ！";
		mes "も、もしかしたら引き戸とか";
		mes "合言葉で開くとか……";
		mes "ええっと、開けマゴット！";
		mes "ああ……駄目か……。";
		cutin "bu_mark4",0;
		next;
		mes "[ベリティ]";
		mes "まったく……";
		mes "あなたの方が落ち着きなさい。";
		mes "残念ながら引き戸でもないし、";
		mes "合言葉で開くような扉でもないわ。";
		mes "さて、どうしましょうね。";
		cutin "EP15_2_brt_5",2;
		next;
		mes "[アルプオカート]";
		mes "オリバーヒルベルトの小説にも";
		mes "主人公が閉じ込められる";
		mes "話があった気がする……。";
		mes "ただその時は友人が、";
		mes "助けに来てくれたしな……。";
		cutin "bu_alp2",2;
		next;
		mes "[ベリティ]";
		mes "残念ながらその小説のように";
		mes "助けに来てくれる人は";
		mes "居ないでしょうね。";
		mes "とりあえず、戻る扉は";
		mes "封鎖されて通れないことは";
		mes "確かよ。";
		cutin "EP15_2_brt_4",2;
		next;
		mes "[テューリアン]";
		mes "そういえばお姉さん！";
		mes "お姉さんは案内人なんだよな？";
		mes "出口とか知らないのか？";
		cutin "bu_du5",2;
		next;
		mes "[ベリティ]";
		mes "残念だけど……";
		mes "私もここに来るのは";
		mes "初めてなのよ。";
		mes "とにかく今は先に進むしか、";
		mes "ないでしょうね。";
		cutin "EP15_2_brt_6",2;
		delquest 11387;
		setquest 11388;
		set VER2_QUE,23;
		close2;
		cutin "EP15_2_brt_6",255;
		end;
	}
	else if(VER2_QUE >= 23) {
		mes "[テューリアン]";
		mes "おいおい、ちょっと待てよ！";
		mes "俺達閉じ込められたのかよ！";
		cutin "bu_du5",2;
		next;
		mes "[マークイシャ]";
		mes "みんな、慌てないで！";
		mes "まずは落ち着くんだ！";
		mes "落ち着くためにここは、";
		mes "聖書を読もう！";
		mes "ああ……重いからと";
		mes "置いてきたんだ……。";
		cutin "bu_mark4",0;
		next;
		mes "[ベリティ]";
		mes "どうしましょうね。";
		cutin "EP15_2_brt_5",2;
		next;
		mes "[アルプオカート]";
		mes "こういう場合……";
		mes "オリバーヒルベルトの";
		mes "作品なら……。";
		cutin "bu_alp2",2;
		next;
		mes "[ベリティ]";
		mes "残念ながらこれは現実よ。";
		mes "お話のように奇跡は";
		mes "おこらないでしょうね……。";
		mes "とりあえず、戻る扉は";
		mes "封鎖されて通れないことだけは";
		mes "確かよ。";
		cutin "EP15_2_brt_4",2;
		next;
		mes "[テューリアン]";
		mes "そういえばお姉さん！";
		mes "お姉さんは案内人なんだよな？";
		mes "出口とか知らないのか？";
		cutin "bu_du5",2;
		next;
		mes "[ベリティ]";
		mes "残念だけど……";
		mes "私もここに来るのは";
		mes "初めてなのよ。";
		mes "とにかく今は先に進むしか、";
		mes "ないでしょうね。";
		cutin "EP15_2_brt_6",2;
		close2;
		cutin "EP15_2_brt_6",255;
		end;
	}
}
un_myst.gat,124,189,0	script	#m101	45,1,1,{/* 59707 */
	if(VER2_QUE == 22) {
		mes "‐扉を開けようと";
		mes "　手を触れたかけた瞬間……‐";
		next;
		mes "[テューリアン]";
		mes "おおーい。";
		mes strcharinfo(0)+ "〜！";
		mes "先ずはみんなでこの部屋を";
		mes "調べようぜ！";
		cutin "bu_du1",2;
		next;
		cutin "bu_du1",255;
		mes "‐テューリアンが呼んでいる。";
		mes "　一旦、合流してから";
		mes "　先に進んだほうが良いだろう‐";
		close;
	}
	else if(VER2_QUE >= 23) {
		mes "‐扉を開けようと";
		mes "　手を触れた瞬間……‐";
		next;
		mes "‐何故か酷く";
		mes "　^0000FF不安な気持ち^000000になった。";
		mes "　これは……";
		mes "　この気持ちは一体……？‐";
		misceffect 334,"";
		next;
		mes "‐そんな気持ちと裏腹に";
		mes "　扉は静かに開いた……‐";
		close2;
		warp "un_myst.gat",157,197;
		end;
	}
}
un_myst.gat,171,183,0	script	#m102	45,1,1,{/* 59708 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",329,205;
	else if('@r < 60)
		warp "un_myst.gat",291,203;
	else
		warp "un_myst.gat",259,200;
	end;
}
un_myst.gat,258,208,0	script	#m103	45,1,1,{/* 59709 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",329,205;
	else if('@r < 60)
		warp "un_myst.gat",291,203;
	else
		warp "un_myst.gat",259,200;
	end;
}
un_myst.gat,295,208,0	script	#m104	45,1,1,{/* 59710 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",329,205;
	else if('@r < 60)
		warp "un_myst.gat",291,203;
	else
		warp "un_myst.gat",259,200;
	end;
}

un_myst.gat,333,206,3	script	不思議な欠片01#01	10082,{/* 59711 */
	switch(VER2_QUE) {
	case 23:
		mes "‐もう何日目なのかも分からない‐";
		next;
		mes "‐果てしなく続く闇に";
		mes "　時間感覚を失っていく。";
		mes "　周囲も日に日に衰弱している‐";
		next;
		mes "‐本当に正しい判断だったのだろうか‐";
		next;
		mes "‐だけど、すでに戻る道は失われた。";
		mes "　そう……これは脱出ではなかった。";
		mes "　生きるための逃亡だったんだ。‐";
		next;
		mes "‐私たちはいつまで逃げる事が";
		mes "　できるんだろう？‐";
		close2;
		delquest 11388;
		setquest 11389;
		set VER2_QUE,24;
		warp "un_myst.gat",260,204;
		end;
	case 24:
		mes "‐覚悟はしていたが";
		mes "　状況は悪化するばかりだ‐";
		next;
		mes "‐あの場所に居たら";
		mes "　生き延びる事が出来なかったと";
		mes "　思い込む事しかできない‐";
		next;
		mes "‐希望……‐";
		next;
		mes "‐すでに多くの人たちが";
		mes "　希望さえも持つことが";
		mes "　出来なくなってしまった……‐";
		close2;
		set VER2_QUE,25;
		warp "un_myst.gat",260,204;
		end;
	default:
		mes "‐計算通りなら、もう外に出るはずだ。";
		mes "　僅かな希望にすがる私を";
		mes "　見渡す限りの土が嘲笑っている‐";
		next;
		mes "‐計算を間違ったのだろうか……。";
		mes "　そんなはずはない。";
		mes "　何年も研究しながら";
		mes "　生きてきた空間だ‐";
		next;
		mes "‐何を間違ったんだ。";
		mes "　何度も何度も同じ場所を";
		mes "　回り続けているような";
		mes "　この気分は……‐";
		next;
		mes "‐不安だ……‐";
		next;
		mes "‐……いや、あの日以来、";
		mes "　不安でなかった日など無い‐";
		close2;
		warp "un_myst.gat",347,138;
		end;
	}
}
un_myst.gat,393,139,0	script	#m201	45,1,1,{/* 59712 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",176,137;
	else if('@r < 60)
		warp "un_myst.gat",86,136;
	else
		warp "un_myst.gat",138,138;
	end;
}
un_myst.gat,104,136,0	script	#m202	45,1,1,{/* 59713 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",176,137;
	else if('@r < 60)
		warp "un_myst.gat",86,136;
	else
		warp "un_myst.gat",138,138;
	end;
}
un_myst.gat,138,140,0	script	#m203	45,1,1,{/* 59714 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",176,137;
	else if('@r < 60)
		warp "un_myst.gat",86,136;
	else
		warp "un_myst.gat",138,138;
	end;
}
un_myst.gat,182,137,3	script	不思議な欠片02#02	10082,{/* 59715 */
	switch(VER2_QUE) {
	case 25:
		mes "‐遂に限界を迎えたようだ。";
		mes "　今では身体も自由に動かない‐";
		next;
		mes "‐すでに生存者の数も";
		mes "　かなり減ってしまった‐";
		next;
		mes "‐最後を見守るのが私の責任だと";
		mes "　考えていたけれど……。";
		mes "　それは私の欲だった。";
		mes "　私にそんな時間は";
		mes "　残されていないようだ……‐";
		close2;
		set VER2_QUE,26;
		warp "un_myst.gat",86,136;
		end;
	case 26:
		mes "‐もう歩くことさえままならない‐";
		next;
		mes "‐自信満々にみんなを引っ張ると";
		mes "　言っていた私だったが……";
		mes "　役立つどころか荷物にまで";
		mes "　成り下がった自分が情けない‐";
		next;
		mes "‐ただの荷物となった私に出来る事は";
		mes "　後悔する事だけだった。";
		mes "　私が始めた全てを、";
		mes "　私の全てを……‐";
		close2;
		set VER2_QUE,27;
		warp "un_myst.gat",86,136;
		end;
	case 27:
		mes "‐私を捨てなさい……‐";
		close2;
		set VER2_QUE,28;
		warp "un_myst.gat",86,136;
		end;
	default:
		mes "‐最近は起きている時間より、";
		mes "　眠っている時間の方が";
		mes "　多くなっている‐";
		next;
		mes "‐次第に遠のく意識の中で";
		mes "　ふと彼の顔を思い浮かべた‐";
		next;
		mes "‐タティオ……‐";
		next;
		mes "‐研究しかなかった私にも";
		mes "　優しくしてくれた人だった‐";
		next;
		mes "‐人……か。";
		mes "　彼を成功作としか思わなかった";
		mes "　過去の私に恥ずかしさと";
		mes "　腹立たしさを感じる‐";
		next;
		mes "‐このまま死んでもいいと";
		mes "　思っていたけれど……";
		mes "　彼に謝るためにも、";
		mes "　言えなかった言葉を伝えるためにも";
		mes "　生きなければならないと考えた‐";
		next;
		mes "‐……可能だろうか？‐";
		close2;
		if(VER2_QUE == 28) {
			delquest 11389;
			setquest 118225;
			set VER2_QUE,29;
		}
		warp "un_myst.gat",14,92;
		end;
	}
}
un_myst.gat,75,91,0	script	#m301	45,1,1,{/* 59716 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,121,82,0	script	#m302	45,1,1,{/* 59717 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,169,89,0	script	#m303	45,1,1,{/* 59718 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,219,88,0	script	#m304	45,1,1,{/* 59719 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,214,86,3	script	不思議な欠片03#03	10082,{/* 59720 */
	switch(VER2_QUE) {
	case 29:
		mes "01001000　01000101";
		mes "01001100　01001100";
		mes "01001111　01010111";
		mes "01001111　01010010";
		mes "01001100　01000100";
		close2;
		set VER2_QUE,30;
		warp "un_myst.gat",160,89;
		end;
	case 30:
		mes "01001001　01000001";
		mes "01001101　01000110";
		mes "01001001　01001110";
		mes "01000101";
		close2;
		set VER2_QUE,31;
		warp "un_myst.gat",160,89;
		end;
	case 31:
		mes "debugging";
		close2;
		set VER2_QUE,32;
		warp "un_myst.gat",160,89;
		end;
	case 32:
		mes "ファイル修復";
		mes "稼動範囲チェック";
		mes "25%";
		mes "……";
		mes "38%";
		close2;
		set VER2_QUE,33;
		warp "un_myst.gat",160,89;
		end;
	case 33:
		mes "45%";
		mes "……";
		mes "50%";
		mes "正常稼動域に移行";
		mes "起動プロセス開始。";
		close2;
		set VER2_QUE,34;
		warp "un_myst.gat",160,89;
		end;
	case 34:
		mes "60%";
		mes "……";
		mes "移動速度チェック正常";
		mes "身体機能チェック正常。";
		close2;
		set VER2_QUE,35;
		warp "un_myst.gat",160,89;
		end;
	case 35:
		mes "70%";
		mes "……";
		mes "言語機能回復";
		mes "器官チェック";
		mes "壊死組織を代替組織にて修復。";
		close2;
		set VER2_QUE,36;
		warp "un_myst.gat",160,89;
		end;
	case 36:
		mes "80%";
		mes "……";
		mes "まともに準備もできなかったが";
		mes "手術は成功と言えるだろう。";
		mes "この成功を元にして";
		mes "他の生存者にも治療を施す予定だ。";
		close2;
		set VER2_QUE,37;
		warp "un_myst.gat",160,89;
		end;
	default:
		mes "98%……不良セクター発見。";
		mes "作業効率を最適化するために";
		mes "メモリチップをコピーして";
		mes "T_W_O_002bを作ってみた。";
		mes "コピーの過程で一部のデータが";
		mes "損失されたようだが……。";
		close2;
		if(VER2_QUE == 37) {
			delquest 118225;
			setquest 118230;
			set VER2_QUE,38;
		}
		warp "un_myst.gat",209,37;
		end;
	}
}
un_myst.gat,209,42,3	script	タマリン#最後の部屋入口	10027,{/* 59721 */
	switch(VER2_QUE) {
	case 38:
		mes "[タマリン]";
		mes "そろそろこのシェルターで";
		mes "調べられる部屋も少なく";
		mes "なってきましたね。";
		cutin "ep143_tasmi",2;
		next;
		mes "[タマリン]";
		mes "そういえば私の後ろの穴から";
		mes "風を感じるんです。";
		mes "恐らく、ここから外に";
		mes "出ることが可能だと思います。";
		next;
		mes "[タマリン]";
		mes "ちなみに横の扉の先は";
		mes "マークイシャさんが調べて";
		mes "いるようです。";
		mes "さあ、行きましょう！";
		next;
		menu "扉を開く",-;
		cutin "ep143_taang",2;
		mes "[タマリン]";
		mes "扉を開くのですね？";
		mes "分かりました。";
		mes "……。";
		next;
		if(checkitemblank() < 2) {
			mes "[タマリン]";
			mes "渡したいものがありましたが、";
			mes "荷物が多いようです。";
			mes "種類数を減らして";
			mes "空きが出来たらまた、";
			mes "声をかけてくれますか？";
			close2;
			cutin "ep143_taang",255;
			end;
		}
		cutin "ep143_tasmi",2;
		mes "[タマリン]";
		mes "あと、これは";
		mes strcharinfo(0)+ "様の分です。";
		mes "ベリティさんがここまでの";
		mes "道順を記録してくれたそうで、";
		mes "簡易移動用の装置だそうです。";
		delquest 118230;
		setquest 201770;
		set VER2_QUE,39;
		getexp 1000000,0; //97773262
		getexp 1000000,0; //97773262
		getexp 1000000,0; //98773262
		getexp 1000000,0; //99773262
		getexp 1000000,0; //97773262
		getexp 0,500000; //8407119
		getexp 0,500000; //8407119
		getexp 0,500000; //8907119
		getexp 0,500000; //9407119
		getexp 0,500000; //9907119
		getitem 6828,1;
		getitem 6962,20;
		setquest 120260;
		compquest 120260;
		next;
		mes "[タマリン]";
		mes "一度外へ出てしまった後でも";
		mes "外に居るベリティさんに見せれば";
		mes "ここまで一瞬で移動する事が";
		mes "できるそうですよ。";
		next;
		cutin "ep143_tasta",2;
		mes "[タマリン]";
		mes "……すいません。";
		mes "あの不思議な欠片に残っていた";
		mes "メッセージの内容を考えていました。";
		mes "感傷に浸っている場合では";
		mes "なかったですね。";
		mes "扉を開けました、いきましょう。";
		close2;
		cutin "ep143_taang",255;
		warp "un_myst.gat",111,37;
		end;
	default:
		cutin "ep143_taang",2;
		mes "[タマリン]";
		mes "あの欠片に残っていた";
		mes "メッセージが事実なら……。";
		mes "なんて、私が考えたところで";
		mes "仕方ないですね……。";
		next;
		cutin "ep143_tasmi",2;
		mes "[タマリン]";
		mes "ちなみに横の扉の先は";
		mes "マークイシャさんが調べて";
		mes "いるようです。";
		mes "さあ、行きましょう！";
		next;
		menu "扉を開く",-;
		cutin "ep143_taang",2;
		mes "[タマリン]";
		mes "何故か……切ない気持ちになります。";
		mes "自分でもどうしてか、";
		mes "わからないのですが……。";
		close2;
		cutin "ep143_taang",255;
		warp "un_myst.gat",111,37;
		end;
	}
}
un_myst.gat,108,38,0	warp	#way	1,1,un_myst.gat,209,37	//59722
un_myst.gat,163,38,5	script	マークイシャ	616,{/* 59723 */
	mes "[マークイシャ]";
	mes "この扉は今までと違って";
	mes "明らかにこちら側から";
	mes "塞いだ痕跡がありますね……。";
	cutin "bu_mark4",0;
	next;
	cutin "bu_mark1",0;
	mes "[マークイシャ]";
	mes "どうしましょう。";
	mes "扉を開いて中に入りますか？";
	next;
	if(getonlinepartymember() < 1) {
		mes "[マークイシャ]";
		mes "パーティーを組んで";
		mes "いないようですね。";
		mes "……嫌な予感がしますから、";
		mes "必ずパーティーを組んでから";
		mes "中に入ってください。";
		close2;
		cutin "bu_mark1",255;
		end;
	}
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	switch(select("扉を開ける","奥に入る","やめる","外に出たい")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "パーティー名：" +'@party$;
			mes "パーティーリーダー名：" +'@leader$;
			mes "^0000fflast_room ^000000-予約失敗";
			close2;
			cutin "bu_mark1",255;
			end;
		}
		mdcreate "last_room";
		mes "[マークイシャ]";
		mes "それでは扉を開きます。";
		mes "完全に開いたら";
		mes "中に入ってください。";
		close2;
		cutin "bu_mark1",255;
		end;
	case 2:
		switch(mdenter("last_room")) {
		case 0:	// エラーなし
			setquest 11380;
			announce "メモリアルダンジョン[last_room] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			setquest 11379;
			cutin "bu_mark1",255;
			warp "1@uns.gat",144,36;
			end;
		case 1:	// パーティー未加入
			mes "[マークイシャ]";
			mes "パーティーを組んで";
			mes "いないようですね。";
			mes "……嫌な予感がしますから、";
			mes "必ずパーティーを組んでから";
			mes "中に入ってください。";
			close2;
			cutin "bu_mark1",255;
			end;
		case 2:	// ダンジョン未作成
			mes "[マークイシャ]";
			mes "パーティーリーダーが";
			mes "扉を開いていないようですね。";
			mes "リーダーの方が先ず、";
			mes "扉を開いてください。";
			close2;
			cutin "bu_mark1",255;
			end;
		default:	// その他エラー
			close;
		}
	case 3:
		cutin "bu_mark4",0;
		mes "[マークイシャ]";
		mes "そうですね。";
		mes "何が起きるかわかりませんし";
		mes "妥当な選択だと思います。";
		mes "あいつもたまにはそんな風に、";
		mes "リーダーらしく物事を考えて";
		mes "発言して欲しいものです……。";
		close2;
		cutin "bu_mark4",255;
		end;
	case 4:
		cutin "bu_mark2",0;
		mes "[マークイシャ]";
		mes "そういえばタマリンが";
		mes "誰かが掘って作ったと思われる";
		mes "出口を見つけたんです。";
		mes "ここから外に出られると思いますが";
		mes "かなり暗いので気をつけて";
		mes "進んでくださいね。";
		close2;
		cutin "bu_mark2",255;
		warp "verus01.gat",115,190;
		end;
	}
}
un_bunker.gat,98,85,0	warp	#bunker_out	1,1,verus01.gat,115,190	//59724
un_bunker.gat,97,100,0	script	#誘導その1	139,2,2,{/* 59725 */
	if(VER2_QUE >= 18) {
		cutin "bu_du5",2;
		mes "[テューリアン]";
		mes "なんだよみんな！";
		mes "俺をおいてどこかに行くとか";
		mes "酷すぎだろ……!!";
		mes "あっ！";
		mes strcharinfo(0)+ "！";
		next;
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "良かったら一緒に";
		mes "行こうぜ!!";
		mes "べ、別に怖いわけじゃ";
		mes "ないぞ!!";
		mes "みんなから連絡があった時に";
		mes "俺がいないと困るだろ!?";
		next;
		cutin "bu_du2",2;
		mes "[テューリアン]";
		mes "まあ……。";
		mes "嫌がっても俺は勝手に";
		mes "ついていくけどな!!";
		mes "わははははははははっ!!";
		close2;
		cutin "bu_du2",255;
		end;
	}
}
un_bunker.gat,298,177,0	script	#誘導その2	139,3,3,{/* 59726 */
	if(VER2_QUE >= 18) {
		cutin "bu_du2",2;
		mes "[テューリアン]";
		mes "お……！";
		mes "アルプからの連絡だ。";
		mes "どうやらこの先に居る";
		mes "みたいだ！";
		next;
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "よし、いこうぜ！";
		mes "俺たちがみんなより";
		mes "先に到着して驚かせないとな！";
		mes "わははははははははっ!!";
		close2;
		cutin "bu_du1",255;
		end;
	}
}
un_bunker.gat,41,275,0	warp	機械室#b_J-0	1,1,un_bunker.gat,21,276	//59727
un_bunker.gat,24,276,0	warp	J-0#b_機械室	1,1,un_bunker.gat,45,275	//59728
un_bunker.gat,24,256,0	warp	J-0#b_L-1		1,1,un_bunker.gat,26,190	//59729
un_bunker.gat,23,190,0	warp	L-1#b_J-0		1,1,un_bunker.gat,21,256	//59730
un_bunker.gat,31,196,0	warp	L-1#b_D-1		1,1,un_bunker.gat,22,378	//59731
un_bunker.gat,21,375,0	warp	D-1#b_L-1		1,1,un_bunker.gat,32,193	//59732
un_bunker.gat,51,196,0	warp	L-1#b_D-2		1,1,un_bunker.gat,68,378	//59733
un_bunker.gat,67,375,0	warp	D-2#b_L-1		1,1,un_bunker.gat,52,193	//59734
un_bunker.gat,60,183,0	warp	L-1#b_管制室	1,1,un_bunker.gat,75,235	//59735
un_bunker.gat,71,236,0	warp	管制室#b_L-1	1,1,un_bunker.gat,57,182	//59736
un_bunker.gat,60,169,0	warp	L-1#b_モニタリング室	1,1,un_bunker.gat,72,168	//59737
un_bunker.gat,69,167,0	warp	モニタリング室#b_L-1	1,1,un_bunker.gat,57,168	//59738
un_bunker.gat,47,135,0	warp	L-1#b_B-1				1,1,un_bunker.gat,37,134	//59739
un_bunker.gat,40,135,0	warp	B-1#b_L-1				1,1,un_bunker.gat,50,134	//59740
un_bunker.gat,57,118,0	warp	L-1#b_A-0				1,1,un_bunker.gat,72,117	//59741
un_bunker.gat,69,118,0	script	A-0#b_L-1				45,1,1,{	//59742
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",53,117;
	end;
}

un_bunker.gat,97,124,0	script	A-0#b_モニタリング室	45,1,1,{	//59743
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",100,144;
	end;
}
un_bunker.gat,97,141,0	warp	モニタリング室#b_A-0	1,1,un_bunker.gat,98,121	//59744
un_bunker.gat,128,118,0	script	A-0#b_L-2	45,1,1,{	//59745
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",144,117;
	end;
}
un_bunker.gat,140,118,0	warp	L-2#b_A-0				1,1,un_bunker.gat,125,117	//59746
un_bunker.gat,137,168,0	warp	L-2#b_モニタリング室	1,1,un_bunker.gat,122,167	//59747
un_bunker.gat,126,168,0	warp	モニタリング室#b_L-2	1,1,un_bunker.gat,140,167	//59748
un_bunker.gat,137,185,0	warp	L-2#b_管制室	1,1,un_bunker.gat,120,235	//59749
un_bunker.gat,124,236,0	warp	管制室#b_L-2	1,1,un_bunker.gat,140,184	//59750
un_bunker.gat,147,196,0	warp	L-2#b_E-1		1,1,un_bunker.gat,106,378	//59751
un_bunker.gat,105,375,0	warp	E-1#b_L-2		1,1,un_bunker.gat,148,193	//59752
un_bunker.gat,167,196,0	warp	L-2#b_E-2		1,1,un_bunker.gat,152,378	//59753
un_bunker.gat,151,375,0	warp	E-2#b_L-2		1,1,un_bunker.gat,168,193	//59754
un_bunker.gat,174,190,0	warp	L-2#b_K-0		1,1,un_bunker.gat,172,229	//59755
un_bunker.gat,169,230,0	warp	K-0#b_L-2		1,1,un_bunker.gat,171,189	//59756
un_bunker.gat,213,346,0	warp	農場#b_C-0		1,1,un_bunker.gat,213,299	//59757
un_bunker.gat,216,300,0	warp	C-0#b_農場		1,1,un_bunker.gat,216,345	//59758
un_bunker.gat,216,280,0	warp	C-0#b_G-1		1,1,un_bunker.gat,220,261	//59759
un_bunker.gat,217,262,0	warp	G-1#b_C-0		1,1,un_bunker.gat,213,279	//59760
un_bunker.gat,249,268,0	warp	G-1#b_M-0		1,1,un_bunker.gat,390,380	//59761
un_bunker.gat,389,377,0	warp	M-0#b_G-1		1,1,un_bunker.gat,250,265	//59762
un_bunker.gat,258,262,0	warp	G-1#b_食堂		1,1,un_bunker.gat,274,289	//59763
un_bunker.gat,271,290,0	warp	食堂#b_G-1		1,1,un_bunker.gat,255,261	//59764
un_bunker.gat,258,236,0	warp	G-1#b_治療室	1,1,un_bunker.gat,272,235	//59765
un_bunker.gat,269,236,0	warp	治療室#b_G-1	1,1,un_bunker.gat,255,235	//59766
un_bunker.gat,245,214,0	warp	G-1#b_F-1		1,1,un_bunker.gat,226,213	//59767
un_bunker.gat,230,214,0	warp	F-1#b_G-1		1,1,un_bunker.gat,248,213	//59768
un_bunker.gat,262,200,0	warp	G-1#b_H-0		1,1,un_bunker.gat,274,199	//59769
un_bunker.gat,271,200,0	script	H-0#b_G-1		45,1,1,{	//59770
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",258,199;
	end;
}
un_bunker.gat,75,128,0	warp	右A-0#b_右H-0	1,1,un_bunker.gat,276,196	//59771
un_bunker.gat,275,191,0	warp	右H-0#b_右A-0	1,1,un_bunker.gat,76,121	//59772
un_bunker.gat,119,128,0	script	左A-0#b_左H-0	45,1,1,{	//59773
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",319,196;
	end;
}
un_bunker.gat,320,191,0	script	左H-0#b_左A-0	45,1,1,{	//59774
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",120,121;
	end;
}
un_bunker.gat,297,206,0	script	H-0#b_治療室	45,1,1,{	//59775
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",298,224;
	end;
}
un_bunker.gat,297,221,0	warp	治療室#b_H-0	1,1,un_bunker.gat,298,203	//59776
un_bunker.gat,324,200,0	script	H-0#b_G-2		45,1,1,{	//59777
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",344,199;
	end;
}
un_bunker.gat,339,200,0	warp	G-2#b_H-0		1,1,un_bunker.gat,321,199	//59778
un_bunker.gat,350,214,0	warp	G-2#b_F-2		1,1,un_bunker.gat,368,213	//59779
un_bunker.gat,365,214,0	warp	F-2#b_G-2		1,1,un_bunker.gat,347,213	//59780
un_bunker.gat,337,236,0	warp	G-2#b_治療室	1,1,un_bunker.gat,323,235	//59781
un_bunker.gat,326,236,0	warp	治療室#b_G-2	1,1,un_bunker.gat,340,235	//59782
un_bunker.gat,281,266,0	warp	右治療室#b_右食堂	1,1,un_bunker.gat,282,282	//59783
un_bunker.gat,281,279,0	warp	右食堂#b_右治療室	1,1,un_bunker.gat,282,263	//59784
un_bunker.gat,313,266,0	warp	左治療室#b_左食堂	1,1,un_bunker.gat,314,282	//59785
un_bunker.gat,313,279,0	warp	左食堂#b_左治療室	1,1,un_bunker.gat,314,262	//59786
un_bunker.gat,324,290,0	warp	食堂#b_G-2	1,1,un_bunker.gat,340,261	//59787
un_bunker.gat,337,262,0	warp	G-2#b_食堂	1,1,un_bunker.gat,321,289	//59788
un_bunker.gat,343,270,0	warp	G-2#b_N-0	1,1,un_bunker.gat,382,328	//59789
un_bunker.gat,381,325,0	warp	N-0#b_G-2	1,1,un_bunker.gat,344,267	//59790
un_bunker.gat,370,264,0	warp	G-2#b_I-0	1,1,un_bunker.gat,388,263	//59791
un_bunker.gat,385,264,0	warp	I-0#b_G-2	1,1,un_bunker.gat,367,263	//59792
un_bunker.gat,297,192,0	warp	H-0#b_Z-0	1,1,un_bunker.gat,298,181	//59793
un_bunker.gat,297,186,0	warp	Z-0#b_H-0	1,1,un_bunker.gat,298,196	//59794
un_bunker.gat,229,163,0	script	Z-0#b_Z-1	45,1,1,{	//59795
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",159,52;
	end;
}
un_bunker.gat,164,51,0	warp	Z-1#b_Z-0	1,1,un_bunker.gat,233,164	//59796
un_bunker.gat,366,164,0	script	Z-0#b_Z-2	45,1,1,{		//59797
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[テューリアン]";
		mes "このワープポータルから、";
		mes "あいつらの気配は感じないな。";
		mes "多分このまま進んでも";
		mes "意味ないと思うぞ。";
		mes "それでも進むのか？";
		next;
		if(select("進む","やめる") == 2) {
			cutin "bu_du2",2;
			mes "[テューリアン]";
			mes "流石だな！";
			mes "マドリドとは大違いだ。";
			mes "他の道を調べようぜ！";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[テューリアン]";
		mes "そこまで言うなら";
		mes "仕方ないな……。";
		mes "よし、行こうぜ！";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",31,51;
	end;
}
un_bunker.gat,27,52,0	warp	Z-2#b_Z-0	1,1,un_bunker.gat,361,163	//59798

un_bunker.gat,382,335,3	script	箱#e152p00	10043,{/* 59506 */}
un_bunker.gat,87,167,3	script	机の下#e152p01	10043,{/* 59507 */
	mes "‐特に変わったものは見当たらない‐";
	close;
}
un_bunker.gat,316,243,3	script	机の下#e152p02	10043,{/* 59508 */}
un_bunker.gat,103,175,3	script	机の下#e152p03	10043,{/* 59509 */}
un_bunker.gat,50,292,3	script	機械残骸#e152p04	10043,{/* 59510 */}
un_bunker.gat,57,314,3	script	機械残骸#e152p05	10043,{/* 59511 */}
un_bunker.gat,128,314,3	script	機械残骸#e152p06	10043,{/* 59512 */}
un_bunker.gat,143,308,3	script	機械残骸#e152p07	10043,{/* 59513 */}
un_bunker.gat,147,287,3	script	機械残骸#e152p08	10043,{/* 59514 */}
un_bunker.gat,245,360,3	script	茂み#e152p09	10043,{/* 59515 */}
un_bunker.gat,286,348,3	script	茂み#e152p10	10043,{/* 59516 */}
un_bunker.gat,331,375,3	script	茂み#e152p11	10043,{/* 59517 */}
un_bunker.gat,321,305,3	script	重なったトレイ#e152p12	10043,{/* 59518 */}
un_bunker.gat,287,304,3	script	重なったトレイ#e152p13	10043,{/* 59519 */}
un_bunker.gat,288,263,3	script	書類の山#e152p14	10043,{/* 59520 */}
un_bunker.gat,280,243,3	script	書類の山#e152p15	10043,{/* 59521 */}

verus04.gat,161,222,4	script	屈強な老人	52,{/* 59827 */
	if(checkquest(12368) & 0x8 == 0) {
		mes "[屈強な老人]";
		mes "はぁ。ここは変な機械が多くて";
		mes "仕事がはかどらねえぜ。";
		mes "そこにある2つの鉄くずも";
		mes "ピカピカ光るかと思ったら";
		mes "何の役にも立たねえしな。";
		next;
		mes "‐^ff0000まずはMARS_01に話しかけ";
		mes "　古びた燃料タンク1個を渡し";
		mes "　PLUTO_09を起動させよう^000000‐";
		close;
	}
	mes "[屈強な老人]";
	mes "おい、あんた。";
	mes "古びた鉄塊を持っていないか？";
	mes "作業によく使うんだ。";
	mes "^ff0000古びた鉄塊5個^000000と";
	mes "^0000ff古びた燃料タンク1個^000000を";
	mes "交換して欲しいんだが。";
	next;
	if(select("交換する","やめる") == 2) {
		mes "[屈強な老人]";
		mes "そうかい。";
		close;
	}
	if(countitem(6961) < 5) {
		mes "[屈強な老人]";
		mes "ん？";
		mes "古びた鉄塊が足りないようだぞ。";
		mes "古びた鉄塊5個で";
		mes "古びた燃料タンク1個と";
		mes "交換をさせてくれ。";
		close;
	}
	set '@max,countitem(6961) / 5;
	mes "[屈強な老人]";
	mes "おお、助かるぜ。";
	mes "お前さんは今";
	mes "古びた鉄塊を" +countitem(6961)+ "個";
	mes "持っているようだな。";
	mes "古びた燃料タンク" +'@max+ "個と";
	mes "交換出来るな。";
	next;
	switch(select("古びた燃料タンク1個分交換する","全部交換する","交換をやめる")) {
	case 1:
		set '@num,1;
		break;
	case 2:
		set '@num,'@max;
		break;
	case 3:
		mes "[屈強な老人]";
		mes "そうかい。";
		mes "その気になったらまた頼むよ。";
		close;
	}
	if(checkitemblank() == 0) {
		mes "[屈強な老人]";
		mes "ん？　荷物の種類が多いようだな。";
		mes "荷物の種類を減らしてから";
		mes "もう一度声をかけてくれ。";
		close;
	}
	delitem 6961,'@num * 5;
	getitem 6962,'@num;
	mes "[屈強な老人]";
	mes "ほら、約束の古びた燃料タンクだ。";
	mes "ありがとうな！";
	close;
OnTalk:
	unittalk "なんと!?";
	end;
OnInit:
	waitingroom "古びた燃料交換",0;
	end;
}
verus04.gat,163,219,4	script	PLUTO_09#pa0829	10147,{
	if(checkquest(12368) & 0x8 == 0) {
		mes "‐^0000ff微かなＬＥＤランプが点いているが";
		mes "　動作はしないようだ。";
		mes "　";
		mes "　まずはMARS_01に話しかけ";
		mes "　古びた燃料タンク1個を渡し";
		mes "　PLUTO_09を起動させよう^000000‐";
		close;
	}
	mes "[PLUTO_09]";
	mes strcharinfo(0)+ "様";
	mes "ヨウコソ。";
	mes "ワタシハエクセリオン装備ノ生産ト";
	mes "エクセリオン装備ニ使用デキル";
	mes "設計図ノ生産ヲ行ッテイマス。";
	mes "何ヲ手伝イマスカ？";
	next;
	switch(select("エクセリオン装備生産","設計図生産","エクセリオン装備の性能確認","やめる")) {
	case 1:
		mes "[PLUTO_09]";
		mes "装備生産ニハ";
		mes "^0000ff古びた鉄塊10個^000000";
		mes "必要デス。";
		next;
		switch(select("やめる","エクセリオンウィング","エクセリオンスーツ")) {
		case 1:
			mes "[PLUTO_09]";
			mes "終了シマス。";
			close;
		case 2:
			set '@gain,20773;
			break;
		case 3:
			set '@gain,15128;
			break;
		}
		if(countitem(6961) < 10) {
			mes "[PLUTO_09]";
			mes "アイテムガ不足シテイマス。";
			mes "^0000ff古びた鉄塊10個^000000";
			mes "必要デス。";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[PLUTO_09]";
			mes "エラーエラー。";
			mes "アイテムガ^ff0000多イ^000000デス。";
			mes "所持中ノアイテム数ヲ";
			mes "減ラシテクダサイ。";
			close;
		}
		misceffect 234;
		delitem 6961,10;
		getitem '@gain,1;
		mes "[PLUTO_09]";
		mes "ピピピーピピッ！";
		mes "製作シマシタ。";
		close;
	case 2:
		while(1) {
			mes "[PLUTO_09]";
			mes "古びた燃料タンク5個デ1回";
			mes "設計図ノ生産ニ挑戦デキマス。";
			if(countitem(6828) < 5) {
				set '@str$,"^aaaaaa燃料不足^000000";
			}
			else {
				set '@str$,"設計図生産‐^ff0000" +(countitem(6828) / 5)+ "回利用可能^000000";
			}
			next;
			if(select('@str$,"やめる") == 2) {
				mes "[PLUTO_09]";
				mes "処理ヲ終了シマス。";
				mes "ゴ利用アリガトウゴザイマシタ。";
				close;
			}
			if(countitem(6828) < 5) {
				mes "[PLUTO_09]";
				mes "エラーエラー。";
				mes "燃料ガ不足シテイマス。";
				mes "古びた燃料タンクが5個必要デス。";
				close;
			}
			if(checkitemblank() == 0) {
				mes "[PLUTO_09]";
				mes "エラーエラー。";
				mes "アイテムガ^ff0000多イ^000000デス。";
				mes "所持中ノアイテム数ヲ";
				mes "減ラシテクダサイ。";
				close;
			}
			if(rand(100) < 60) {
				setarray '@table,998,998,999,1002,1002,7054,7054;
				misceffect 17;
				delitem 6828,5;
				getitem '@table[rand(getarraysize('@table))],1;
				mes "[PLUTO_09]";
				mes "失敗失敗！";
				mes "設計図ノ代ワリニ";
				mes "コレガデキマシタ……。";
			}
			else {
				setarray '@table,6973,6979,6980,6981,6982,1002,6984,6986;
				misceffect 76;
				delitem 6962,5;
				getitem '@table[rand(getarraysize('@table))],1;
				getitem 6979,1;
				mes "[PLUTO_09]";
				mes "成功成功。";
				mes "設計図ガ完成シマシタ。";
			}
			next;
		}
	case 3:
		mes "[PLUTO_09]";
		mes "カシコマリマシタ。";
		mes "ドチラヲ確認シマスカ？";
		mes "　";
		mes "‐^ff0000一部、確認に";
		mes "　画面のスクロールが必要です^000000‐";
		while(1) {
			next;
			switch(select("エクセリオンウィング","エクセリオンスーツ","見るのをやめる")) {
			case 1:
				mes "[エクセリオンウィング]";
				mes "　";
				mes "完全回避 + 8";
				mes "―――――――――――――";
				mes "BaseLv130以上の時、追加で";
				mes "完全回避 + 2 ";
				mes "―――――――――――――";
				mes "[エクセリオンウィング]の";
				mes "精錬値が1上がる度に追加で";
				mes "Flee + 2";
				mes "―――――――――――――";
				mes "[エクセリオンスーツ]と";
				mes "共に装備時、追加で";
				mes "スキルディレイ - 10%";
				mes "BaseLv130以上の時、追加で";
				mes "スキルディレイ - 10%";
				mes "完全回避 + 6";
				mes "―――――――――――――";
				mes "系列 : ^777777肩にかける物^000000";
				mes "防御 : ^77777740^000000";
				mes "重量 : ^77777790^000000";
				mes "要求レベル : ^777777100^000000";
				mes "装備 : ^777777全ての職業^000000";
				break;
			case 2:
				mes "[エクセリオンスーツ]";
				mes "　";
				mes "Vit + 6";
				mes "―――――――――――――";
				mes "BaseLv130以上の時、追加で";
				mes "Vit + 4";
				mes "―――――――――――――";
				mes "[エクセリオンスーツ]の";
				mes "精錬値が3上がる度に追加で";
				mes "MaxHP + 4%";
				mes "―――――――――――――";
				mes "[エクセリオンウィング]と";
				mes "共に装備時、追加で";
				mes "スキルディレイ - 10%";
				mes "BaseLv130以上の時、追加で";
				mes "スキルディレイ - 10%";
				mes "完全回避 + 6";
				mes "―――――――――――――";
				mes "系列 : ^777777鎧^000000";
				mes "防御 : ^777777100^000000";
				mes "重量 : ^777777100^000000";
				mes "要求レベル : ^777777100^000000";
				mes "装備 : ^777777全ての職業^000000";
				break;
			case 3:
				mes "[PLUTO_09]";
				mes "終了シマス。";
				close;
			}
		}
	case 4:
		mes "[PLUTO_09]";
		mes "終了シマス。";
		close;
	}
OnTalk:
	unittalk "エナジー反応確認。正常動作が可能になりました。";
	end;
OnInit:
	waitingroom "装備/設計図生産",0;
	end;
}
verus04.gat,165,217,4	script	MARS_01#pa0829	10080,{
	if(!checkquest(12368)) {
		mes "‐淡い光を放った液晶画面が";
		mes "　ユラユラと揺れている。";
		mes "　電力が少し足りないようだ‐";
		next;
		if(select("立ち去る","ボタンを押してみる") == 1) {
			mes "‐あなたはその場を去った‐";
			close;
		}
		mes "[?????]";
		mes "いらっしゃいませ。";
		mes "私は探査ロボットMARS_01です。";
		mes "現在、節電モードの為、";
		mes "機能メニュー制限中です。";
		next;
		if(select("終了","燃料補給") == 1) {
			mes "‐ロボットから明かりが消えた";
			mes "　スリープモードに入ったようだ‐";
			close;
		}
		mes "[MARS_01]";
		mes "私たちは超節電ロボットです。";
		mes "古びた燃料タンク1個で";
		mes "私と私の同僚であるPLUTO_09の";
		mes "エネルギーを90%ほど確保出来ます。";
		next;
		mes "[MARS_01]";
		mes "古びた燃料タンクを持ってきたら";
		mes "モニターの下にある燃料注入口に";
		mes "投入して下さい。";
		mes "節電モードを解除する事が";
		mes "できるはずです。";
		setquest 12368;
		close;
	}
	if(checkquest(12368) & 0x8 == 0) {
		if(countitem(6962) < 1) {
			mes "[MARS_01]";
			mes "古びた燃料タンクを持ってきたら";
			mes "モニターの下にある燃料注入口に";
			mes "投入して下さい。";
			mes "節電モードを解除する事が";
			mes "できるはずです。";
			close;
		}
		mes "‐電力が無くなってしまったのか";
		mes "　明かりが灯っていない。";
		mes "　燃料を注入しますか？‐";
		next;
		if(select("燃料を注入する","やめる") == 2) {
			//mes "‐完全に電力が切れたてしまったのか";
			mes "‐完全に電力が切れてしまったのか";
			mes "　全く反応がない。";
			close;
		}
		mes "‐燃料を注入すると";
		mes "　大きな音を立てながら";
		mes "　画面が明るく光り始めた‐";
		donpcevent "屈強な老人::OnTalk";
		next;
		mes "[MARS_01]";
		mes "システム稼働。";
		mes "損傷状態チェック。";
		next;
		mes "[MARS_01]";
		mes "動力系10%、制御盤損傷なし";
		mes "ボディーフレーム13%";
		mes "活動遂行能力良好";
		next;
		mes "[MARS_01]";
		mes "PLUTO_09へのエナジー投入を";
		mes "スタートします。";
		donpcevent "PLUTO_09#pa0829::OnTalk";
		next;
		mes "[MARS_01]";
		mes "燃料を注入していただき";
		mes "ありがとうございます。";
		mes "今から管理者登録をしますので";
		mes "お名前を入力してください。";
		next;
		menu "名前を入力する",-;
		mes "[MARS_01]";
		mes strcharinfo(0)+ "様ですね。";
		mes "歓迎します。";
		mes "燃料注入が完全に終了しました。";
		delitem 6962,1;
		compquest 12368;
		close;
	}
	mes "[MARS_01]";
	mes strcharinfo(0)+ "様";
	mes "いらっしゃいませ。";
	mes "お役に立てれば光栄です。";
	mes "ご用件をお伺いいたします。";
	next;
	switch(select("ヘルプメニュー","エクセリオンウィング強化","エクセリオンスーツ強化","エクセリオンレッグ強化","エクセリオンシールド強化","終了する")) {
	case 1:
		mes "[MARS_01]";
		mes "私たちは";
		mes "装備の性能向上、強化を目的として";
		mes "作成されたロボットです。";
		next;
		mes "[MARS_01]";
		mes "エクセリオンウィング、";
		mes "エクセリオンスーツ、";
		mes "エクセリオンレッグ、";
		mes "エクセリオンシールドと";
		mes "強化用設計図を共に持って来てください。";
		mes "図面に応じたエンチャントを施します。";
		next;
		mes "[MARS_01]";
		mes "強化用設計図は";
		mes "隣にいるPLUTO_09から";
		mes "入手が可能です。";
		mes "　";
		mes "続けて確認しますか？";
		while(1) {
			next;
			switch(select("エンチャントの注意事項","エンチャントの種類","終了する")) {
			case 1:
				mes "[MARS_01]";
				mes "エンチャントの注意事項について";
				mes "お伝えいたします。";
				next;
				mes "[MARS_01]";
				mes "エンチャントを行うと";
				mes "装備の精錬値は^ff0000リセット^000000されます。";
				mes "精錬をする際は";
				mes "全てのエンチャントを済ませた状態で";
				mes "行う事をおすすめします。";
				next;
				mes "[MARS_01]";
				mes "エンチャントは希望する防具を";
				mes "^ff0000装備した状態^000000でおこなってください。";
				next;
				mes "[MARS_01]";
				mes "エンチャントは設計図をもとに";
				mes "おこなわれますので";
				mes "^ff0000100%成功します^000000。";
				mes "ただし、一度行ったエンチャントの";
				mes "^ff0000リセットは出来ません。^000000";
				next;
				mes "[MARS_01]";
				mes "全てのエンチャントは";
				mes "^ff0000ライオットチップ[1]と";
				mes "共に装備する^000000事で";
				mes "性能がオーバークロックし";
				mes "隠された能力が発動します。";
				next;
				mes "[MARS_01]";
				mes "ただし、^0000ff同じ種類のエンチャントを";
				mes "複数個つけていたとしても";
				mes "セット効果は1個分しか発動しません^000000。";
				mes "例えば、A-Atkを鎧に2つ、肩に1つ";
				mes "エンチャントをしても";
				mes "発動するセット効果は1回分のみです。";
				next;
				mes "[MARS_01]";
				mes "最後に、設計図によって";
				mes "エンチャント可能な部位と";
				mes "エンチャント可能な回数が";
				mes "決められています。";
				mes "詳しくはヘルプメニュー";
				mes "エンチャントの種類でご確認ください。";
				continue;
			case 2:
				break;
			case 3:
				mes "[MARS_01]";
				mes "終了します。";
				mes "ご利用ありがとうございました。";
				close;
			}
			break;
		}
		mes "[MARS_01]";
		mes "エンチャントは大きく分けて";
		mes "以下、6つのタイプがあります。";
		next;
		mes "[MARS_01]";
		mes "Enchant･･･Type-E（属性付与）";
		mes "Resist･･･Type-R（属性耐性）";
		mes "Cure･･･Type-C（回復）";
		mes "Assist･･･Type-A（補助）";
		mes "Special･･･Type-S（特別1）";
		mes "Zenith･･･Type-Z（特別2）";
		next;
		mes "[MARS_01]";
		mes "これらは全てエンチャント可能な部位と";
		mes "エンチャント可能な回数が";
		mes "決められています。";
		mes "どれについて確認しますか？";
		mes "‐^ff0000一部、確認に";
		mes "　画面のスクロールが必要です^000000‐";
		while(1) {
			next;
			switch(select(	"E-Fire 鎧-1 肩-0 靴-0 盾-0","E-Water 鎧-1 肩-0 靴-0 盾-0","E-Ground 鎧-1 肩-0 靴-0 盾-0","E-Wind 鎧-1 肩-0 靴-0 盾-0",
							"R-Fire 鎧-0 肩-3 靴-0 盾-1","R-Water 鎧-0 肩-3 靴-0 盾-1","R-Ground 鎧-0 肩-3 靴-0 盾-1","R-Wind 鎧-0 肩-3 靴-0 盾-1",
							"C-Life 鎧-3 肩-3 靴-3 盾-3","C-Soul 鎧-3 肩-3 靴-3 盾-3","C-HPR 鎧-3 肩-3 靴-3 盾-3","C-SPR 鎧-3 肩-3 靴-3 盾-3",
							"A-Str 鎧-1 肩-0 靴-0 盾-0","A-Int 鎧-1 肩-0 靴-0 盾-0","A-Def 鎧-3 肩-3 靴-3 盾-0","A-Avoid 鎧-1 肩-1 靴-0 盾-0",
							"A-Atk 鎧-3 肩-3 靴-3 盾-3","A-Matk 鎧-3 肩-3 靴-3 盾-3","A-MaxHP 鎧-3 肩-3 靴-3 盾-3","A-MaxSP 鎧-3 肩-3 靴-3 盾-3",
							"A-Frozen 鎧-1 肩-0 靴-0 盾-0","A-ASPD 鎧-1 肩-1 靴-1 盾-0","A-Tolerance 鎧-1 肩-1 靴-1 盾-0","A-Hit 鎧-0 肩-0 靴-1 盾-1",
							"A-Flee 鎧-0 肩-0 靴-1 盾-1","A-Mdef 鎧-1 肩-1 靴-1 盾-0",
							"S-Atk 鎧-0 肩-0 靴-1 盾-0","S-Matk 鎧-0 肩-0 靴-1 盾-0","S-Avoid 鎧-0 肩-0 靴-1 盾-0",
							"S-MaxHP 鎧-0 肩-0 靴-1 盾-0","S-Quick 鎧-0 肩-0 靴-1 盾-0","S-Cri 鎧-0 肩-0 靴-1 盾-0",
							"Z-Knockback 鎧-1 肩-1 靴-1 盾-0","Z-Immortal 鎧-1 肩-0 靴-0 盾-0","Z-Killgain 鎧-1 肩-1 靴-1 盾-1","Z-Reincarnation 鎧-0 肩-0 靴-1 盾-0",
							"Z-NoDispell 鎧-1 肩-1 靴-1 盾-0","Z-Clairvoyance 鎧-0 肩-0 靴-1 盾-0","Z-CastFixed 鎧-1 肩-1 靴-1 盾-1",
							"見るのをやめる"
			)) {
			case 1:
				mes "[E-Fire]";
				mes "鎧に火属性を付与する";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "物理攻撃時、";
				mes "火属性モンスターに";
				mes "与えるダメージ + 10%";
				mes "―――――――――――――";
				mes "Type-Eは同一の鎧に";
				mes "1つのみ利用可能";
				break;
			case 2:
				mes "[E-WATER]";
				mes "鎧に水属性を付与する";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "物理攻撃時、";
				mes "水属性モンスターに";
				mes "与えるダメージ + 10%";
				mes "―――――――――――――";
				mes "Type-Eは同一の鎧に";
				mes "1つのみ利用可能";
				break;
			case 3:
				mes "[E-Ground]";
				mes "鎧に地属性を付与する";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "物理攻撃時、";
				mes "地属性モンスターに";
				mes "与えるダメージ + 10%";
				mes "―――――――――――――";
				mes "Type-Eは同一の鎧に";
				mes "1つのみ利用可能";
				break;
			case 4:
				mes "[E-Wind]";
				mes "鎧に風属性を付与する";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "物理攻撃時、";
				mes "風属性モンスターに";
				mes "与えるダメージ + 10%";
				mes "―――――――――――――";
				mes "Type-Eは同一の鎧に";
				mes "1つのみ利用可能";
				break;
			case 5:
				mes "[R-Fire]";
				mes "火属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "水属性攻撃で";
				mes "受けるダメージ + 25%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "火属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "―――――――――――――";
				mes "エクセリオンウィングに";
				mes "^ff00003回^000000利用可能";
				mes "エクセリオンシールドに";
				mes "^ff00001回^000000利用可能";
				break;
			case 6:
				mes "[R-Water]";
				mes "水属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "風属性攻撃で";
				mes "受けるダメージ + 25%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "水属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "―――――――――――――";
				mes "エクセリオンウィングに";
				mes "^ff00003回^000000利用可能";
				mes "エクセリオンシールドに";
				mes "^ff00001回^000000利用可能";
				break;
			case 7:
				mes "[R-Ground]";
				mes "地属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "火属性攻撃で";
				mes "受けるダメージ + 25%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "地属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "―――――――――――――";
				mes "エクセリオンウィングに";
				mes "^ff00003回^000000利用可能";
				mes "エクセリオンシールドに";
				mes "^ff00001回^000000利用可能";
				break;
			case 8:
				mes "[R-Wind]";
				mes "風属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "地属性攻撃で";
				mes "受けるダメージ + 25%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "風属性攻撃で";
				mes "受けるダメージ - 25%";
				mes "―――――――――――――";
				mes "エクセリオンウィングに";
				mes "^ff00003回^000000利用可能";
				mes "エクセリオンシールドに";
				mes "^ff00001回^000000利用可能";
				break;
			case 9:
				mes "[C-Life]";
				mes "5秒毎にHP + 50";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "5秒毎にHP + 50";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "5秒毎にHP + 150";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "5秒毎にHP + 1500";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 10:
				mes "[C-Soul]";
				mes "5秒毎にSP + 1";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "5秒毎にSP + 1";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "5秒毎にSP + 3";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "5秒毎にSP + 25";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 11:
				mes "[C-HPR]";
				mes "HP自然回復量 + 20%";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "HP自然回復量 + 30%";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "HP自然回復量 + 100%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "HP自然回復量 + 350%";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 12:
				mes "[C-SPR]";
				mes "SP自然回復量 + 2%";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "SP自然回復量 + 3%";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "SP自然回復量 + 10%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "SP自然回復量 + 50%";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 13:
				mes "[A-Str]";
				mes "純粋なStrが10上がる度に";
				mes "追加でAtk + 1";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、";
				mes "純粋なStrが10上がる度に";
				mes "追加でAtk + 2";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、";
				mes "純粋なStrが10上がる度に";
				mes "追加でAtk + 4";
				mes "―――――――――――――";
				mes "精錬値が9以上の時、";
				mes "純粋なStrが10上がる度に";
				mes "追加でAtk + 8";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "物理攻撃で";
				mes "与えるダメージ + 3%";
				mes "―――――――――――――";
				mes "エクセリオンスーツに";
				mes "^ff00001回^000000利用可能";
				break;
			case 14:
				mes "[A-Int]";
				mes "純粋なIntが10上がる度に";
				mes "追加でMatk + 1";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、";
				mes "純粋なIntが10上がる度に";
				mes "追加でMatk + 2";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、";
				mes "純粋なIntが10上がる度に";
				mes "追加でMatk + 4";
				mes "―――――――――――――";
				mes "精錬値が9以上の時、";
				mes "純粋なIntが10上がる度に";
				mes "追加でMatk + 8";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "魔法攻撃で";
				mes "与えるダメージ + 3%";
				mes "―――――――――――――";
				mes "エクセリオンスーツに";
				mes "^ff00001回^000000利用可能";
				break;
			case 15:
				mes "[A-Def]";
				mes "Def + 5";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "Def + 15";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "Def + 30";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "Def + 500";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグに";
				mes "^ff00003回^000000利用可能";
				break;
			case 16:
				mes "[A-Avoid]";
				mes "完全回避 + 1";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "完全回避 + 1";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "完全回避 + 1";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "完全回避 + 2";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツに";
				mes "^ff00001回^000000利用可能";
				break;
			case 17:
				mes "[A-Atk]";
				mes "Atk + 3";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "Atk + 4";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "Atk + 8";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "Atk + 15";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 18:
				mes "[A-Matk]";
				mes "Matk + 3";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "Matk + 4";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "Matk + 8";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "Matk + 15";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 19:
				mes "[A-MaxHP]";
				mes "MaxHP + 200";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "MaxHP + 300";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "MaxHP + 1000";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "MaxHP + 7500";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 20:
				mes "[A-MaxSP]";
				mes "MaxSP + 20";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "MaxSP + 30";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "MaxSP + 100";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "MaxSP + 150";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00003回^000000利用可能";
				break;
			case 21:
				mes "[A-Frozen]";
				mes "絶対に凍結状態にならない";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "MaxHP + 1000";
				mes "―――――――――――――";
				mes "エクセリオンスーツに";
				mes "^ff00001回^000000利用可能";
				break;
			case 22:
				mes "[A-ASPD]";
				mes "Aspd + 1";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "Aspd + 1";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグに";
				mes "^ff00001回^000000利用可能";
				break;
			case 23:
				mes "[A-Tolerance]";
				mes "人間・無形モンスターから";
				mes "受けるダメージ - 1%";
				mes "―――――――――――――";
				mes "精錬値が3上がる度に追加で";
				mes "人間・無形モンスターから";
				mes "受けるダメージ - 1%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が1上がる度に追加で";
				mes "人間・無形モンスターから";
				mes "受けるダメージ - 1%";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグに";
				mes "^ff00001回^000000利用可能";
				break;
			case 24:
				mes "[A-Hit]";
				mes "Hit + 20";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "Hit + 10";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "Hit + 10";
				mes "―――――――――――――";
				mes "精錬値が9以上の時、追加で";
				mes "Hit + 10";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が3上がる度に追加で";
				mes "Hit + 5";
				mes "―――――――――――――";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00001回^000000利用可能";
				break;
			case 25:
				mes "[A-Flee]";
				mes "Flee + 20";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "Flee + 10";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "Flee + 10";
				mes "―――――――――――――";
				mes "精錬値が9以上の時、追加で";
				mes "Flee + 10";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が3上がる度に追加で";
				mes "Flee + 5";
				mes "―――――――――――――";
				mes "エクセリオンレッグ、";
				mes "エクセリオンシールドに";
				mes "^ff00001回^000000利用可能";
				break;
			case 26:
				mes "[A-Mdef]";
				mes "Mdef + 2";
				mes "―――――――――――――";
				mes "精錬値が6以上の時、追加で";
				mes "Mdef + 4";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "Mdef + 8";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、追加で";
				mes "Mdef + 20";
				mes "―――――――――――――";
				mes "エクセリオンウィング、";
				mes "エクセリオンスーツ、";
				mes "エクセリオンレッグに";
				mes "^ff00001回^000000利用可能";
				break;
			case 27:
				mes "[S-Atk]";
				mes "Atk + 50";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "物理攻撃命中時、";
				mes "一定確率で3秒間、";
				mes "Atk + 150";
				mes "精錬値が8以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "精錬値が9以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "Type-Sは同一の靴に";
				mes "1つのみ利用可能";
				break;
			case 28:
				mes "[S-Matk]";
				mes "Matk + 100";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "魔法攻撃命中時、";
				mes "一定確率で3秒間、";
				mes "Matk + 150";
				mes "精錬値が8以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "精錬値が9以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "Type-Sは同一の靴に";
				mes "1つのみ利用可能";
				break;
			case 29:
				mes "[S-Avoid]";
				mes "完全回避 + 5";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "物理攻撃命中時、";
				mes "一定確率で3秒間、";
				mes "完全回避 + 100";
				mes "精錬値が8以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "精錬値が9以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "Type-Sは同一の靴に";
				mes "1つのみ利用可能";
				break;
			case 30:
				mes "[S-MaxHP]";
				mes "MaxHP + 2500";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "物理攻撃命中時、";
				mes "一定確率で";
				mes "HP + 7500";
				mes "3秒間、MaxHP + 7500";
				mes "精錬値が8以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "精錬値が9以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "Type-Sは同一の靴に";
				mes "1つのみ利用可能";
				break;
			case 31:
				mes "[S-Quick]";
				mes "詠唱時間 - 10%";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "魔法攻撃命中時、";
				mes "一定確率で3秒間、";
				mes "詠唱時間 - 100%";
				mes "スキルディレイ - 100%";
				mes "精錬値が8以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "精錬値が9以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "Type-Sは同一の靴に";
				mes "1つのみ利用可能";
				break;
			case 32:
				mes "[S-Cri]";
				mes "Cri + 10";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "物理攻撃命中時、";
				mes "一定確率で3秒間、";
				mes "Cri + 100";
				mes "精錬値が8以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "精錬値が9以上の時、";
				mes "発動率が上昇";
				mes "効果時間が1秒延長";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "Type-Sは同一の靴に";
				mes "1つのみ利用可能";
				break;
			case 33:
				mes "[Z-Knockback]";
				mes "絶対にノックバックしない";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "MaxHP + 1%";
				mes "―――――――――――――";
				mes "Type-Zは同一の装備に";
				mes "1つのみ利用可能";
				continue;
			case 34:
				mes "[Z-Immortal]";
				mes "絶対に壊れない";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "MaxHP + 1%";
				mes "―――――――――――――";
				mes "Type-Zは同一の装備に";
				mes "1つのみ利用可能";
				continue;
			case 35:
				mes "[Z-Killgain]";
				mes "物理攻撃でモンスターを";
				mes "倒した時、SP + 2";
				mes "―――――――――――――";
				mes "精錬値が7以上の時、追加で";
				mes "物理攻撃でモンスターを";
				mes "倒した時、SP + 3";
				mes "―――――――――――――";
				mes "精錬値が8以上の時、追加で";
				mes "物理攻撃でモンスターを";
				mes "倒した時、SP + 5";
				mes "―――――――――――――";
				mes "精錬値が9以上の時、追加で";
				mes "物理攻撃でモンスターを";
				mes "倒した時、SP + 10";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "MaxHP + 1%";
				mes "―――――――――――――";
				mes "Type-Zは同一の装備に";
				mes "1つのみ利用可能";
				continue;
			case 36:
				mes "[Z-Reincarnation]";
				mes "戦闘不能から復活時、";
				mes "HP・SPを100%回復する";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "MaxHP + 1%";
				mes "―――――――――――――";
				mes "Type-Zは同一の装備に";
				mes "1つのみ利用可能";
				continue;
			case 37:
				mes "[Z-NoDispell]";
				mes "詠唱が中断されない";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "MaxHP + 1%";
				mes "―――――――――――――";
				mes "Type-Zは同一の装備に";
				mes "1つのみ利用可能";
				continue;
			case 38:
				mes "[Z-Clairvoyance]";
				mes "[ハイディング]や";
				mes "[クローキング]をしている";
				mes "モンスターが見える";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "MaxHP + 1%";
				mes "―――――――――――――";
				mes "Type-Zは同一の装備に";
				mes "1つのみ利用可能";
				continue;
			case 39:
				mes "[Z-CastFixed]";
				mes "固定詠唱時間 - 50%";
				mes "―――――――――――――";
				mes "[ライオットチップ]と";
				mes "共に装備時、";
				mes "[ライオットチップ]の";
				mes "精錬値が2上がる度に追加で";
				mes "MaxHP + 1%";
				mes "―――――――――――――";
				mes "Type-Zは同一の装備に";
				mes "1つのみ利用可能";
				continue;
			case 40:
				mes "[MARS_01]";
				mes "終了します。";
				mes "ご利用ありがとうございました。";
				close;
			}
		}
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		mes "[MARS_01]";
		mes "終了します。";
		mes "ご利用ありがとうございました。";
		close;
	}
	mes "[MARS_01]";
	mes "エラーです。";
	mes "装備中の防具が";
	mes "対象装備ではありません。";
	next;
	mes "[MARS_01]";
	mes "エクセリオンウィング";
	mes "エクセリオンスーツ";
	mes "エクセリオンレッグ";
	mes "いずれかのみ強化が可能です。";
	close;
OnInit:
	waitingroom "エンチャント",0;
	end;
}
verus04.gat,197,179,3	script	修理型チャールストン#Me	10053,{/* 59818 (hide)*/}
verus04.gat,197,179,3	script	修理型チャールストン#Me	10053,{/* 61465 */
	if(countitem(25785) < 1) {
		cutin "dalle01",2;
		mes "[修理型チャールストン]";
		mes "どこで手に入るかはわかりませんが……";
		next;
		mes "[修理型チャールストン]";
		mes "焦げた記憶媒体を入手したら";
		mes "持ってきてください。";
		mes "修理して^ff0000主記憶装置[1]^000000に";
		mes "強化しますよ。";
		close2;
		cutin "dalle01",255;
		end;
	}
	cutin "dalle01",2;
	mes "[修理型チャールストン]";
	mes "それは焦げた記憶媒体ですね。";
	mes "もしよろしければ";
	mes "修理して^ff0000主記憶装置[1]^000000に";
	mes "強化しますよ。";
	next;
	mes "[修理型チャールストン]";
	mes "私たちを作ったノウハウを";
	mes "集約して完成させた";
	mes "強化パーツです。";
	mes "とてもよい品ですよ。";
	while(1) {
		next;
		switch(select("修理する","主記憶装置[1]について聞く","やめる")) {
		case 1:
			break;
		case 2:
			mes "[修理型チャールストン]";
			mes "^ff0000主記憶装置[1]^000000の詳細は";
			mes "以下の通りです。";
			next;
			mes "[主記憶装置[1]]";
			mes "Int + 3,Dex + 3";
			mes "―――――――――――――";
			mes "[ヴェスパーヘッドギア]と";
			mes "共に装備時、追加で";
			mes "詠唱時間 - 20%";
			mes "―――――――――――――";
			mes "^FF0000[主記憶装置]は";
			mes "NPC売却・倉庫への移動のみ";
			mes "可能です^000000";
			mes "―――――――――――――";
			mes "系列 : ^777777アクセサリー^000000";
			mes "位置 : ^777777-^000000";
			mes "属性 : ^777777-^000000 スロット : ^7777771^000000";
			mes "Def : ^7777770^000000 Mdef : ^7777770^000000";
			mes "精錬 : ^777777不可^000000 破損 : ^777777しない^000000";
			mes "重量 : ^77777710^000000";
			mes "要求レベル : ^777777100^000000";
			mes "装備 : ^777777全ての職業^000000";
			next;
			mes "[修理型チャールストン]";
			mes "この記憶装置に";
			mes "特別なエンチャントを";
			mes "施した状態で差し上げます。";
			next;
			mes "[修理型チャールストン]";
			mes "エンチャントは";
			mes "3段階選ぶ事が出来ます。";
			mes "効果の普通な物から高い物まで";
			mes "自分の好きなように選んでください。";
			next;
			mes "[修理型チャールストン]";
			mes "しかし、良いエンチャントは";
			mes "技術力が必要な為";
			mes "良い効果であるほど";
			mes "エンチャントの成功率が下がります。";
			next;
			mes "[修理型チャールストン]";
			mes "より良い記憶装置が欲しければ";
			mes "焦げた記憶媒体を沢山集めてくださいね。";
			continue;
		case 3:
			mes "[修理型チャールストン]";
			mes "ではまたお会いしましょう。";
			close2;
			cutin "dalle01",255;
			end;
		}
		break;
	}
	mes "[修理型チャールストン]";
	mes "第1エンチャント：未選択";
	mes "第2エンチャント：未選択";
	mes "第3エンチャント：未選択";
	mes "　";
	mes "まずは第1エンチャントを選んでください！";
	next;
	select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
	mes "[修理型チャールストン]";
	mes "ではまたお会いしましょう。";
	close2;
	cutin "dalle01",255;
	end;
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：治癒1";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：治癒1";
mes "第3エンチャント：Matk + 3%";
mes "　";
mes "これはそうですね……";
mes "全てを駆使しても出来るかどうか……";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
mes "[修理型チャールストン]";
mes "ではまたお会いしましょう。";
close;
cutin "dalle01",255;
cutin "dalle01",2;
mes "[修理型チャールストン]";
mes "それは焦げた記憶媒体ですね。";
mes "もしよろしければ";
mes "修理して^ff0000主記憶装置[1]^000000に";
mes "強化しますよ。";
next;
mes "[修理型チャールストン]";
mes "私たちを作ったノウハウを";
mes "集約して完成させた";
mes "強化パーツです。";
mes "とてもよい品ですよ。";
next;
select("修理する:主記憶装置[1]について聞く:やめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：治癒1";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：治癒1";
mes "第3エンチャント：無し";
mes "　";
mes "これはそうですね……";
mes "全てを駆使しても出来るかどうか……";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
mes "ｴ";
cutin "dalle01",255;
cutin "dalle01",2;
mes "[修理型チャールストン]";
mes "それは焦げた記憶媒体ですね。";
mes "もしよろしければ";
mes "修理して^ff0000主記憶装置[1]^000000に";
mes "強化しますよ。";
next;
mes "[修理型チャールストン]";
mes "私たちを作ったノウハウを";
mes "集約して完成させた";
mes "強化パーツです。";
mes "とてもよい品ですよ。";
next;
select("修理する:主記憶装置[1]について聞く:やめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力1";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力1";
mes "第3エンチャント：無し";
mes "　";
mes "これはそうですね……";
mes "難易度はさほど高くないですね。";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
mes "[修理型チャールストン]";
mes "ではまたお会いしましょう。";
close;
cutin "dalle01",255;
cutin "dalle01",2;
mes "[修理型チャールストン]";
mes "それは焦げた記憶媒体ですね。";
mes "もしよろしければ";
mes "修理して^ff0000主記憶装置[1]^000000に";
mes "強化しますよ。";
next;
mes "[修理型チャールストン]";
mes "私たちを作ったノウハウを";
mes "集約して完成させた";
mes "強化パーツです。";
mes "とてもよい品ですよ。";
next;
select("修理する:主記憶装置[1]について聞く:やめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：無し";
mes "　";
mes "これはそうですね……";
mes "難易度が気持ち高いですね。";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
close;
cutin "dalle01",2;
mes "[修理型チャールストン]";
mes "それは焦げた記憶媒体ですね。";
mes "もしよろしければ";
mes "修理して^ff0000主記憶装置[1]^000000に";
mes "強化しますよ。";
next;
mes "[修理型チャールストン]";
mes "私たちを作ったノウハウを";
mes "集約して完成させた";
mes "強化パーツです。";
mes "とてもよい品ですよ。";
next;
select("修理する:主記憶装置[1]について聞く:やめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：Atk + 4%";
mes "　";
mes "これはそうですね……";
mes "難易度の高さに困惑しています！";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
close;
cutin "dalle01",2;
mes "[修理型チャールストン]";
mes "それは焦げた記憶媒体ですね。";
mes "もしよろしければ";
mes "修理して^ff0000主記憶装置[1]^000000に";
mes "強化しますよ。";
next;
mes "[修理型チャールストン]";
mes "私たちを作ったノウハウを";
mes "集約して完成させた";
mes "強化パーツです。";
mes "とてもよい品ですよ。";
next;
select("修理する:主記憶装置[1]について聞く:やめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力1";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力1";
mes "第3エンチャント：Matk + 4%";
mes "　";
mes "これはそうですね……";
mes "難易度の高さに困惑しています！";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
close;
cutin "dalle01",2;
mes "[修理型チャールストン]";
mes "それは焦げた記憶媒体ですね。";
mes "もしよろしければ";
mes "修理して^ff0000主記憶装置[1]^000000に";
mes "強化しますよ。";
next;
mes "[修理型チャールストン]";
mes "私たちを作ったノウハウを";
mes "集約して完成させた";
mes "強化パーツです。";
mes "とてもよい品ですよ。";
next;
select("修理する:主記憶装置[1]について聞く:やめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：Matk + 4%";
mes "　";
mes "これはそうですね……";
mes "難易度の高さに困惑しています！";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
mes "[修理型チャールストン]";
mes "これ以上アイテムを";
mes "持てないようです。";
mes "アイテムの種類数を";
mes "減らしてきてください。";
close;
cutin "dalle01",255;
delitem 7034,1;
cutin "dalle01",2;
mes "[修理型チャールストン]";
mes "それは焦げた記憶媒体ですね。";
mes "もしよろしければ";
mes "修理して^ff0000主記憶装置[1]^000000に";
mes "強化しますよ。";
next;
mes "[修理型チャールストン]";
mes "私たちを作ったノウハウを";
mes "集約して完成させた";
mes "強化パーツです。";
mes "とてもよい品ですよ。";
next;
select("修理する:主記憶装置[1]について聞く:やめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：未選択";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "まずは第1エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:大聖堂1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：未選択";
mes "第3エンチャント：未選択";
mes "　";
mes "次に第2エンチャントを選んでください！";
next;
select("闘志1:先鋭1:鋭利1:魔力1:大司教1:名弓1:攻撃速度1:Mdef + 3:闘志2:先鋭2:鋭利2:魔力2:大司教2:名弓2:攻撃速度2:Mdef + 5:治癒1:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：未選択";
mes "　";
mes "最後に第3エンチャントを選んでください！";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:何もつけない:やっぱりやめる")
mes "[修理型チャールストン]";
mes "第1エンチャント：魔力1";
mes "第2エンチャント：魔力2";
mes "第3エンチャント：Matk + 4%";
mes "　";
mes "これはそうですね……";
mes "難易度の高さに困惑しています！";
next;
mes "[修理型チャールストン]";
mes "ではこの内容で修理しつつ強化します。";
mes "準備はよろしいですか？";
next;
select("はい:やっぱりやめる")
delitem 25785,1;
misceffect 170,"";
mes "[修理型チャールストン]";
mes "失敗しました……";
mes "申し訳ありませんでした。";
mes "くじけず手に入れたらまた";
mes "いらしてください。";
close;
cutin "dalle01",255;
}

verus04.gat,133,237,3	script	クラフト#New_Cart	851,{/* 59581 */
	if(getbaseclass(Class) != CLASS_MC) {
		mes "[クラフト]";
		mes "カンカンカーン。";
		mes "ここをこうして……";
		mes "これを乗っけて……素晴らしい！";
		mes "　";
		mes "‐カートの飾り付けに";
		mes "　夢中な男性がいる‐";
		next;
		mes "‐マーチャント系職業のみ";
		mes "　進行可能なクエストです‐";
		close;
	}
	if(CARTDECO_1QUE == 0) {
		mes "[クラフト]";
		mes "カン、カン、カーン";
		mes "　";
		mes "……ダメだダメだ！";
		mes "これじゃあポリンの";
		mes "滑らかな丸みが再現出来てない!!";
		next;
		mes "‐熱心にカートを改造している";
		mes "　青年がいる‐";
		next;
		mes "[クラフト]";
		mes "おや、何か用かい？";
		mes "ん!?　君……もしかして？";
		mes "君も普段カートを利用するのかい？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[クラフト]";
			mes "でもカートを上手く扱う事は";
			mes "出来るだろう？";
			next;
		}
		mes "[クラフト]";
		mes "実は今、新しいカートのデザインを";
		mes "模索している所なんだ。";
		mes "3種類ほど考えていてさ。";
		mes "ミストケースのような、";
		mes "箱型のカートのイメージは";
		mes "出来ているんだよ。";
		next;
		mes "[クラフト]";
		mes "後は2つほど、ポリンを元にした";
		mes "カートを考えていてね。";
		mes "構想は殆ど出来上がっているんだけど";
		mes "どうにも決め手にかけていてね。";
		mes "これだ！";
		mes "というものが出来ないんだ。";
		next;
		mes "[クラフト]";
		mes "一応、イメージを掴む為の";
		mes "方法は既に考えてあるんだ。";
		next;
		mes "[クラフト]";
		mes "とはいえ僕はカートの改修の方に";
		mes "集中したいからね。";
		next;
		mes "[クラフト]";
		mes "君さ……暇そうだよね……？";
		mes "よかったら僕の為に";
		mes "ひと肌脱いでくれないかな。";
		next;
		mes "[クラフト]";
		mes "勿論、うまく完成したあかつきには";
		mes "君のカートも装飾してあげるからさ。";
		mes "頼むよ！";
		next;
		if(select("手伝う","手伝わない") == 2) {
			mes "[クラフト]";
			mes "ちぇっ。そうかい。";
			mes "まっ、気が変わったら";
			mes "いつでも来てくれよ。";
			mes "新しいカートを手に入れたら";
			mes "きっと気分も爽快だと思うよ！";
			close;
		}
		mes "[クラフト]";
		mes "本当かい!?";
		mes "ありがとう!!";
		mes "それじゃあ今から言う事のうち";
		mes "どれか1つを達成して";
		mes "僕に報告してくれないかな。";
		setquest 96440;
		setquest 96442;
		setquest 118410;
		next;
		mes "‐^ff0000エンジェリングを3匹倒す^000000‐";
		mes "‐^ff0000ポリンを3000匹倒す^000000‐";
		mes "‐^ff0000べとべとする液体を3000個用意する^000000‐";
		next;
		mes "[クラフト]";
		mes "もしよかったら";
		mes "それぞれに関する";
		mes "僕の構想も聞くかい？";
		next;
		if(select("聞く","聞かない") == 2) {
			mes "[クラフト]";
			mes "そうかい。";
			mes "それじゃあどれでもいいので";
			mes "達成したら来てくれよな！";
			close;
		}
		//TODO
	}
	else if(CARTDECO_1QUE == 1) {
		mes "[クラフト]";
		mes "やぁ、君かい。";
		mes "僕のお願いを";
		mes "達成してきてくれたのかな。";
		mes "それとも何か別の用？";
		next;
		switch(select("エンジェリングを3匹倒した","ポリンを3000匹倒した","べとべとする液体を3000個持ってきた","構想を聞きたい","話をやめる")) {
		case 1:
			mes "[クラフト]";
			mes "^ff0000エンジェリング^000000を^ff00003匹^000000";
			mes "倒して来て欲しいんだ。";
			mes "まだ終わってないみたいだね。";
			mes "　";
			mes "僕からの依頼をどれか1つでも";
			mes "達成したら報告に来てくれ！";
			close;
		case 2:
			mes "[クラフト]";
			mes "^ff0000ポリン^000000を^ff00003000匹^000000";
			mes "倒して来て欲しいんだ。";
			mes "まだ終わってないみたいだね。";
			mes "　";
			mes "僕からの依頼をどれか1つでも";
			mes "達成したら報告に来てくれ！";
			close;
		case 3:
			mes "[クラフト]";
			mes "^ff0000べとべとする液体^000000を^ff00003000個^000000";
			mes "用意して来て欲しいんだ。";
			mes "まだ終わってないみたいだね。";
			mes "　";
			mes "僕からの依頼をどれか1つでも";
			mes "達成したら報告に来てくれ！";
			close;
		case 4:
			break;
		case 5:
			mes "[クラフト]";
			mes "そうかい。";
			mes "それじゃあどれでもいいので";
			mes "達成したら来てくれよな！";
			close;
		}
		mes "[クラフト]";
		mes "OKわかった。";
		mes "それじゃあ僕の構想を聞かせるよ。";
		while(1) {
			next;
			mes "[クラフト]";
			mes "どれについて聞くんだい？";
			next;
			switch(select("エンジェリングを3匹倒す","ポリンを3000匹倒す","べとべとする液体を3000個用意する","会話をやめる")) {
			case 1:
				mes "[クラフト]";
				mes "^ff0000エンジェリング^000000を^ff00003匹^000000";
				mes "倒して来て欲しいんだ。";
				next;
				mes "[クラフト]";
				mes "ポリンでありエンジェルでもある。";
				mes "その美しい曲線美と";
				mes "天使のような気高さを";
				mes "忠実に再現したカートを作りたいんだ。";
				mes "3匹ほど倒して来たら";
				mes "質感を詳しく聞かせてくれるかな。";
				continue;
			case 2:
				mes "[クラフト]";
				mes "^ff0000ポリン^000000を^ff00003000匹^000000";
				mes "倒して来て欲しいんだ。";
				next;
				mes "[クラフト]";
				mes "積載可能な重量はそのままに";
				mes "カートに色とりどりのポリンを";
				mes "散りばめたいんだ！";
				mes "　";
				mes "そのためにはどうしたらいいか？";
				next;
				mes "[クラフト]";
				mes "正直……今はまだわからない。";
				mes "　";
				mes "でも……！";
				mes "君がポリンを3000匹ほど";
				mes "倒して来てさえくれれば";
				mes "その答えがわかる気がするんだ。";
				continue;
			case 3:
				mes "[クラフト]";
				mes "^ff0000べとべとする液体^000000を^ff00003000個^000000";
				mes "用意して来て欲しいんだ。";
				next;
				mes "[クラフト]";
				mes "ポリンと言えば何だい？";
				mes "　";
				mes "ゼロピー？　空き瓶？";
				mes "いいや……";
				next;
				mes "[クラフト]";
				mes "べとべとする液体だ！";
				mes "こいつにこそ、";
				mes "あのぷるんぷるんの質感を";
				mes "実現させる秘訣が詰まっていると";
				mes "僕は考えているんだ。";
				next;
				mes "[クラフト]";
				mes "3000個は多すぎる？";
				mes "なぁに君もれっきとした商人だろう。";
				mes "この位の数、";
				mes "腕の立つ商人ならあっという間だよ。";
				mes "まぁ懐事情もあるし集め方は自由さ。";
				mes "大丈夫。君なら出来る。";
				continue;
			case 4:
				mes "[クラフト]";
				mes "それじゃあ頼んだよ！";
				close;
			}
		}
	}
OnInit:
	waitingroom "カートデコレーション",0;
	end;
}
verus04.gat,149,231,4	script	ウェルス研究員#dayhunt	402,{/* 59582 */
	if(!checkquest(118451)) {
		mes "[ウェルス研究員]";
		mes "はあ……。";
		mes "どうしたものか……。";
		mes "困ったなあ。";
		next;
		menu "どうかしましたか？",-;
		mes "[ウェルス研究員]";
		mes "実は困った事があってね……。";
		mes "って、もしかして君は";
		mes "冒険者ではないかな？";
		next;
		mes "[ウェルス研究員]";
		mes "それならちょうどいい！";
		mes "少し手伝って欲しいんだが";
		mes "お願いできるかな？";
		next;
		if(select("いいですよ","お断りします") == 2) {
			mes "[ウェルス研究員]";
			mes "そうか……困ったなあ。";
			mes "いや、いいんだ。";
			mes "引き留めて悪かった。";
			mes "はあ……。";
			close;
		}
		mes "[ウェルス研究員]";
		mes "本当かい!?";
		mes "いやあ、助かるよ！";
		next;
		mes "[ウェルス研究員]";
		mes "私はこの辺りに出現する";
		mes "機械や生物を研究している";
		mes "研究員なんだ。";
		next;
		mes "[ウェルス研究員]";
		mes "しかし、この辺りはとても危険でね。";
		mes "私では逃げることしかできないんだ。";
		next;
		mes "[ウェルス研究員]";
		mes "そこで！";
		mes "冒険者の君には";
		mes "私の代わりに";
		mes "調査を行って貰いたい。";
		next;
		mes "[ウェルス研究員]";
		mes "なに、難しい事はないさ。";
		mes "ただ研究対象と戦って";
		mes "その時の様子を";
		mes "報告してくれればいい。";
		next;
		mes "[ウェルス研究員]";
		mes "それと、手伝ってくれる時には";
		mes "私に声をかけてくれ。";
		mes "よろしく頼むぞ。";
		setquest 118451;
		compquest 118451;
		close;
	}
	mes "[ウェルス研究員]";
	mes "やあ。";
	mes "研究の手伝いをしてくれるのかい？";
	next;
	if(select("依頼を受注・報告する","やめておく") == 2) {
		mes "[ウェルス研究員]";
		mes "そ、そうか。";
		mes "手伝ってくれる時には";
		mes "私に声をかけてくれ。";
		mes "よろしく頼むぞ。";
		close;
	}
	mes "[ウェルス研究員]";
	mes "おお、それはありがたい。";
	mes "さて……。";
	mes "君の依頼状況はこの通りだが、";
	mes "どうするんだい？";
	set '@str1$,"^0000FF受注可能^000000";
	set '@str2$,"^0000FF受注可能^000000";
	set '@str3$,"^0000FF受注可能^000000";
	if(checkquest(96445)) {
		if(checkquest(96445) & 0x4)
			set '@str1$,"^FF0000報酬受け取り可能^000000";
		else
			set '@str1$,"^FF0000受注中^000000";
	}
	if(checkquest(96447)) {
		if(checkquest(96447) & 0x4)
			set '@str2$,"^FF0000報酬受け取り可能^000000";
		else
			set '@str2$,"^FF0000受注中^000000";
	}
	if(checkquest(96449)) {
		if(checkquest(96449) & 0x4)
			set '@str2$,"^FF0000報酬受け取り可能^000000";
		else
			set '@str2$,"^FF0000受注中^000000";
	}
	next;
	switch(select("修理型ウェルスギア討伐　^0000FF受注可能^000000","探査型ウェルスギア�U討伐　^0000FF受注可能^000000","修理型ウェルスギア�U討伐　^0000FF受注可能^000000")) {
	case 1:
		if(checkquest(96445)) {
			mes "[ウェルス研究員]";
			mes "ふむ……。";
			mes "修理型ウェルスギアについて";
			mes "調査中のようだな。";
			next;
			mes "[ウェルス研究員]";
			mes "そうなると、君には。";
			mes "^ff0000修理型ウェルスギア^000000を";
			mes "^ff0000300匹^000000ほど倒して来て欲しい。";
			mes "引き続きお願いできるか？";
			next;
			if(select("わかりました","依頼をやめたい") == 1) {
				mes "[ウェルス研究員]";
				mes "すまないな。";
				mes "引き続きよろしく頼むぞ。";
				close;
			}
			mes "[ウェルス研究員]";
			mes "依頼をやめたい？";
			mes "やめたい依頼は";
			mes "^ff0000修理型ウェルスギア^000000を";
			mes "^ff0000300匹^000000ほど倒す";
			mes "依頼で間違いないか？";
			next;
			if(select("間違いありません","やっぱり続けます") == 2) {
				mes "[ウェルス研究員]";
				mes "おお、本当か？";
				mes "すまないな。";
				mes "引き続きよろしく頼むぞ。";
				close;
			}
			mes "[ウェルス研究員]";
			mes "そ、そうか。";
			mes "君にも都合があるからな。";
			mes "しかし、また時間があれば";
			mes "いつでも手伝いに来てほしい。";
			delquest 96445;
			close;
		}
		mes "[ウェルス研究員]";
		mes "なるほど……。";
		mes "修理型ウェルスギアについて";
		mes "調べて来てくれるんだな。";
		next;
		mes "[ウェルス研究員]";
		mes "そうなると、君には。";
		mes "^ff0000修理型ウェルスギア^000000を";
		mes "^ff0000300匹^000000ほど倒して来て欲しい。";
		next;
		mes "[ウェルス研究員]";
		mes "達成してくれたら報酬として";
		mes "古びた燃料タンク5個をやろう。";
		mes "お願いできるか？";
		next;
		if(select("依頼を受ける","やめておく") == 2) {
			mes "[ウェルス研究員]";
			mes "そ、そうか。";
			mes "手伝ってくれる時には";
			mes "私に声をかけてくれ。";
			mes "よろしく頼むぞ。";
			close;
		}
		mes "[ウェルス研究員]";
		mes "おお！　受けてくれるか！";
		mes "よろしく頼むぞ。";
		setquest 96445;
		close;
	case 2:
		if(checkquest(96447)) {
			mes "[ウェルス研究員]";
			mes "ふむ……。";
			mes "探査型ウェルスギア�Uについて";
			mes "調査中のようだな。";
			next;
			mes "[ウェルス研究員]";
			mes "そうなると、君には。";
			mes "^ff0000探査型ウェルスギア�U^000000を";
			mes "^ff0000200匹^000000ほど倒して来て欲しい。";
			mes "引き続きお願いできるか？";
			next;
			if(select("わかりました","依頼をやめたい") == 1) {
				mes "[ウェルス研究員]";
				mes "すまないな。";
				mes "引き続きよろしく頼むぞ。";
				close;
			}
			mes "[ウェルス研究員]";
			mes "依頼をやめたい？";
			mes "やめたい依頼は";
			mes "^ff0000探査型ウェルスギア�U^000000を";
			mes "^ff0000200匹^000000ほど倒す";
			mes "依頼で間違いないか？";
			next;
			if(select("間違いありません","やっぱり続けます") == 2) {
				mes "[ウェルス研究員]";
				mes "おお、本当か？";
				mes "すまないな。";
				mes "引き続きよろしく頼むぞ。";
				close;
			}
			mes "[ウェルス研究員]";
			mes "そ、そうか。";
			mes "君にも都合があるからな。";
			mes "しかし、また時間があれば";
			mes "いつでも手伝いに来てほしい。";
			delquest 96447;
			close;
		}
		mes "[ウェルス研究員]";
		mes "なるほど……。";
		mes "探査型ウェルスギア�Uについて";
		mes "調べて来てくれるんだな。";
		next;
		mes "[ウェルス研究員]";
		mes "そうなると、君には。";
		mes "^ff0000探査型ウェルスギア�U^000000を";
		mes "^ff0000200匹^000000ほど倒して来て欲しい。";
		next;
		mes "[ウェルス研究員]";
		mes "達成してくれたら報酬として";
		mes "古びた燃料タンク2個か古びた鉄塊5個を";
		mes "どちらかやろう。";
		mes "すまないが、どちらを渡すかは";
		mes "私に決めさせてくれ。";
		mes "お願いできるか？";
		next;
		if(select("依頼を受ける","やめておく") == 2) {
			mes "[ウェルス研究員]";
			mes "そ、そうか。";
			mes "手伝ってくれる時には";
			mes "私に声をかけてくれ。";
			mes "よろしく頼むぞ。";
			close;
		}
		mes "[ウェルス研究員]";
		mes "おお！　受けてくれるか！";
		mes "よろしく頼むぞ。";
		setquest 96447;
		close;
	case 3:
		if(checkquest(96449)) {
			mes "[ウェルス研究員]";
			mes "ふむ……。";
			mes "修理型ウェルスギア�Uについて";
			mes "調査中のようだな。";
			next;
			mes "[ウェルス研究員]";
			mes "そうなると、君には。";
			mes "^ff0000修理型ウェルスギア�U^000000を";
			mes "^ff0000200匹^000000ほど倒して来て欲しい。";
			mes "引き続きお願いできるか？";
			next;
			if(select("わかりました","依頼をやめたい") == 1) {
				mes "[ウェルス研究員]";
				mes "すまないな。";
				mes "引き続きよろしく頼むぞ。";
				close;
			}
			mes "[ウェルス研究員]";
			mes "依頼をやめたい？";
			mes "やめたい依頼は";
			mes "^ff0000修理型ウェルスギア�U^000000を";
			mes "^ff0000200匹^000000ほど倒す";
			mes "依頼で間違いないか？";
			next;
			if(select("間違いありません","やっぱり続けます") == 2) {
				mes "[ウェルス研究員]";
				mes "おお、本当か？";
				mes "すまないな。";
				mes "引き続きよろしく頼むぞ。";
				close;
			}
			mes "[ウェルス研究員]";
			mes "そ、そうか。";
			mes "君にも都合があるからな。";
			mes "しかし、また時間があれば";
			mes "いつでも手伝いに来てほしい。";
			delquest 96449;
			close;
		}
		mes "[ウェルス研究員]";
		mes "なるほど……。";
		mes "修理型ウェルスギア�Uについて";
		mes "調べて来てくれるんだな。";
		next;
		mes "[ウェルス研究員]";
		mes "そうなると、君には。";
		mes "^ff0000修理型ウェルスギア�U^000000を";
		mes "^ff0000200匹^000000ほど倒して来て欲しい。";
		next;
		mes "[ウェルス研究員]";
		mes "達成してくれたら報酬として";
		mes "古びた燃料タンク2個か古びた鉄塊5個を";
		mes "どちらかやろう。";
		mes "すまないが、どちらを渡すかは";
		mes "私に決めさせてくれ。";
		mes "お願いできるか？";
		next;
		if(select("依頼を受ける","やめておく") == 2) {
			mes "[ウェルス研究員]";
			mes "そ、そうか。";
			mes "手伝ってくれる時には";
			mes "私に声をかけてくれ。";
			mes "よろしく頼むぞ。";
			close;
		}
		mes "[ウェルス研究員]";
		mes "おお！　受けてくれるか！";
		mes "よろしく頼むぞ。";
		setquest 96449;
		close;
	}
OnInit:
	waitingroom "討伐クエスト",0;
	end;
}

//====================================================================
// 2日目　明日を生きるための調査
//====================================================================
/* レコード2日目 -> un_bk_q 98 143 */
un_bk_q.gat,103,147,4	script	ヴァノクサイヒュ#EP15.2	750,{/* 61061 */
	switch(VER_6QUE) {
	case 0:
		emotion 46, "ヴァノクサイヒュ#EP15.2";
		mes "[ヴァノクサイヒュ]";
		mes "ふうう……。";
		mes "思い出すだけでもぞっとする。";
		mes "このシェルターに入れて";
		mes "本当に良かった……。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "もし、あの瞬間、";
		mes "外だったら……";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "…………。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "君と私は運が良かった。";
		mes "そう思わないかい？";
		next;
		menu "そうだと思う",-;
		emotion 28, "ヴァノクサイヒュ#EP15.2";
		mes "[ヴァノクサイヒュ]";
		mes "今日を生きる事ができるのを";
		mes "感謝しないと、ね。";
		mes "しかし……みんなは";
		mes "起きた爆発の責任を、一人に";
		mes "負わせようとしているみたいなんだ。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "爆発がまるでロゼ、";
		mes "彼女の責任だと言うように";
		mes "責め立てているんだ。";
		next;
		menu "ロゼ？",-;
		emotion 1,"";
		mes "[ヴァノクサイヒュ]";
		mes "彼女、ロゼ・ベリーニは";
		mes "この爆発を起こした実験の";
		mes "指揮を執っていた人なんだ。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "確かに実験は失敗してしまったけど、";
		mes "彼女だけの責任じゃないと思うんだ。";
		mes "それに、この慌ただしい状況で";
		mes "生存者の人数を把握しようとしている。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "この状況を少しでもなんとかしようと、";
		mes "必死に考えてくれているんだろう。";
		mes "私だったら、";
		mes "どうすればいいのか分からなくなって";
		mes "途方に暮れているだろうね。";
		mes "彼女はすごいよ。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "どうしよう、";
		mes "私なんかでも協力できることはあるかな。";
		mes "声をかけてみようと思うんだけど、";
		mes "君も一緒に彼女を手伝わないかい？";
		next;
		menu "手伝う",-;
		emotion 15, "ヴァノクサイヒュ#EP15.2";
		mes "[ヴァノクサイヒュ]";
		mes "本当？　よかった！";
		mes "ひとりで協力しに行くのは";
		mes "なんだか怖くって。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "この部屋の中央に";
		mes "冷たい感じをプンプン匂わせている";
		mes "研究員がいるよね？";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "彼女が実験の総責任者である";
		mes "ロゼ・ベリーニさんだ。";
		mes "みんなはドクターベリーニと呼んでいる。";
		next;
		setquest 5341;
		setquest 5342;
		set VER_6QUE,1;
		mes "[ヴァノクサイヒュ]";
		mes "彼女のところに行って、";
		mes "何か協力する事はないか";
		mes "聞いてみてくれるかい？";
		close;
	case 1://
	case 2:
	case 3:
		mes "[ヴァノクサイヒュ]";
		mes "私は料理ができる人間が何人いるのか";
		mes "調べほしいという頼みを受けたよ。";
		next;
		mes "[ヴァノクサイヒュ]";
		mes "シェルター内部は道も複雑で広いから";
		mes "大変だけど、頑張らないとね！";
		close;
	}
}
un_bk_q.gat,93,168,4	script	ドクターベリーニ#EP15.2	10078,{/* 61062 */
	switch(VER_6QUE) {
	case 0://
	case 1:
		emotion 17, "ドクターベリーニ#EP15.2";
		mes "[ロゼ・ベリーニ]";
		mes "すみません。今は忙しいので、";
		mes "話があるのでしたら";
		mes "後にしてもらえますか？";
		next;
		menu "お手伝いします",-;
		emotion 0, "ドクターベリーニ#EP15.2";
		mes "[ロゼ・ベリーニ]";
		mes "えっ？";
		mes "手伝っていただけるのですか？";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "ありがとうございます。";
		mes "皆、パニックで右往左往しているので";
		mes "人手がなく困っていたのです。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "こんな状況で、";
		mes "まともに動ける人間は";
		mes "少ないですからね……。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "ぜひ、協力をお願いします。";
		mes "実を言うとちょうど";
		mes "困っていた問題もあったので、";
		mes "本当にたすかります。";
		next;
		menu "困っていた問題？",-;
		emotion 1,"";
		mes "[ロゼ・ベリーニ]";
		mes "今、生存者の人数を把握するために";
		mes "聞き込み調査を行っています。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "冒険者や町の住民の方たちの人数は";
		mes "ある程度把握できたのですが、";
		mes "ここで働いていた職員達の";
		mes "人数把握がまだ終わっていません。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "恐らく、各自が属しているチームの";
		mes "非常事態マニュアルに沿って";
		mes "動いているはずで、あちこちに";
		mes "散らばっているのでしょう。";
		next;
		emotion 20, "ドクターベリーニ#EP15.2";
		mes "[ロゼ・ベリーニ]";
		mes "いったい職員たちはどこにいるのか……。";
		mes "シェルター内部を";
		mes "隅々まで探さないといけないのですが、";
		mes "あいにく私は";
		mes "ここを離れることができません。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "それでなんですけど、";
		mes "あなたにその人数把握を";
		mes "お願いしたいのです。";
		next;
		menu "わかりました",-;
		set VER_6QUE,2;
		setquest 5346;
		mes "[ロゼ・ベリーニ]";
		mes "ありがとうございます。";
		mes "それでは……";
		mes "^FF0000科学者^000000が何人いるのか、";
		mes "確認して来てほしいです。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "あちこちで作業をしている職員に";
		mes "聞き込みをしてきてください。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "シェルター内は道も複雑で広いので";
		mes "大変だと思いますが、";
		mes "よろしくお願いします。";
		close;
	case 2:
	case 3:
		emotion 0, "ドクターベリーニ#EP15.2";
		mes "[ロゼ・ベリーニ]";
		mes "おや、あなたでしたか。";
		mes "もう人数の把握ができたのですか？";
		mes "早かったですね！";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "ええと、お願いしていたのは……";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "^FF0000科学者^000000の人数把握でしたね。";
		mes "それで、何人いましたか？";
		next;
		input '@num;
		if(VER_6QUE != 3 && '@num != 10) {
			mes "[ロゼ・ベリーニ]";
			mes '@num+ "名ですか？";
			next;
			emotion 20, "ドクターベリーニ#EP15.2";
			mes "[ロゼ・ベリーニ]";
			mes "おかしいですね。";
			mes "従業員リストに記載されている人数と";
			mes "大きく離れているようですが……。";
			next;
			mes "[ロゼ・ベリーニ]";
			mes "すみません、";
			mes "もう一度確認してきてもらえますか？";
			close;
		}
		mes "[ロゼ・ベリーニ]";
		mes "なるほど……わかりました。";
		mes "リストの人員と大体同じくらいですね。";
		mes "ありがとうございます。";
		next;
		mes "[ロゼ・ベリーニ]";
		mes "ご苦労様でした。";
		mes "息苦しいと思いますが、";
		mes "外の状況が安定するまで";
		mes "シェルター内で生活してください。";
		close2;
		delquest 5342;
		delquest 5346;
		delquest 5350;
		setquest 5370;
		getitem 6961, 3;
		warp "un_bunker.gat",97,91;
		end;
	}
}
un_bk_q.gat,213,303,4	script	生命工学者ツアーリン#EP	98,{/* 61063 */
	mes "[生命工学者ツアーリン]";
	mes "私たち生命工学者は";
	mes "シェルター内部の人たちのために";
	mes "食料生産に総力を注いでいます。";
	close;
}
un_bk_q.gat,82,323,2	script	機械工学者アール#EP15.2	851,{/* 61064 */
	mes "[機械工学者アール]";
	mes "この人数で";
	mes "シェルター内全ての設備を";
	mes "点検するのは大変だけど頑張るよ。";
	close;
}
un_bk_q.gat,347,217,4	script	設備担当者リモデリング#	855,{/* 61065 */
	mes "[設備担当者リモデリング]";
	mes "このシェルター……。";
	mes "誰が作ったかは知らないけど、";
	mes "本当に頑丈に作ってありますね。";
	close;
}
un_bk_q.gat,86,121,4	script	科学者カールステン#EP15	749,{/* 61066 */
	switch(VER_6QUE) {
	case 0://
	case 1://
	case 2:
		emotion 1, "科学者カールステン#EP15";
		mes "[科学者カールステン]";
		mes "おや、こんな所に……。";
		mes "どなたですか？";
		next;
		menu "私は……",-;
		emotion 0, "科学者カールステン#EP15";
		mes "[科学者カールステン]";
		mes "あ〜！　ベリーニさん？";
		mes "全体会議の時に何度か";
		mes "お会いした事があります。";
		next;
		mes "[科学者カールステン]";
		mes "私の記憶が間違いなければ、";
		mes "たしか今回失敗した研究の";
		mes "総責任者でしたよね？";
		next;
		mes "[科学者カールステン]";
		mes "やはり総責任者は";
		mes "誰でもいいわけではなさそうですね。";
		mes "この慌ただしい状況で";
		mes "人員チェックとはさすがだ。";
		next;
		emotion 19, "科学者カールステン#EP15";
		mes "[科学者カールステン]";
		mes "待って下さい、";
		mes "先ほど人数をチェックして";
		mes "どこかに書いておいたんですが……。";
		next;
		mes "[科学者カールステン]";
		mes "えっと……この数字だったかな？";
		mes "違うな。こっちの数字だったかな？";
		mes "あ！　この数字だな！";
		next;
		setquest 5350;
		set VER_6QUE,3;
		mes "[科学者カールステン]";
		mes "科学者は私を含めて、";
		mes "総人員^FF000010名^000000です。";
		mes "……気の毒に、結構減りましたね。";
		next;
		mes "[科学者カールステン]";
		mes "あ！　戻ったらベリーニさんに";
		mes "私たちは、非常マニュアルに従って";
		mes "シェルター内部に危険物質が無いか";
		mes "検査中だと伝えて下さい。";
		next;
		mes "[科学者カールステン]";
		mes "こんな非常事態だ、";
		mes "自分にできることは";
		mes "どんどんやらないと。";
		close;
	case 3:
		mes "[科学者カールステン]";
		mes "科学者は私を含めて、";
		mes "総人員^FF000010名^000000です。";
		next;
		mes "[科学者カールステン]";
		mes "戻ったらベリーニさんに";
		mes "私たちは、非常マニュアルに従って";
		mes "シェルター内部に危険物質が無いか";
		mes "検査中だと伝えて下さい。";
		close;
	}
}
un_bk_q.gat,56,286,4	script	機械工学者ムガシー#EP15	851,{/* 61067 */
	mes "[機械工学者ムガシー]";
	mes "冒険者か？　ここは機械倉庫だ。";
	next;
	mes "[機械工学者ムガシー]";
	mes "元は倉庫だったけど、";
	mes "今は同僚の機械工学者たちが";
	mes "シェルターに必要な機械を";
	mes "作成しているんだ。";
	next;
	emotion 6, "機械工学者ムガシー#EP15";
	mes "[機械工学者ムガシー]";
	mes "機械工学者たちの総人員が知りたい？";
	mes "悪いが私は分からない。";
	next;
	mes "[機械工学者ムガシー]";
	mes "そうだな……あの上にいる";
	mes "アールさんなら";
	mes "知っているかも知れないな。";
	mes "聞いてみるといい。";
	close;
}
un_bk_q.gat,212,294,6	script	C-0区域設備担当者#EP15.	854,{/* 61068 */
	mes "[設備担当者]";
	mes "非常事態マニュアルに従って";
	mes "シェルター内部の施設を点検中だ。";
	close;
}
un_bk_q.gat,223,217,4	script	F-1区域設備担当者#EP15.	854,{/* 61069 */
	mes "[設備担当者]";
	mes "非常事態マニュアルに従って";
	mes "シェルター内部の施設を点検中です。";
	close;
}
un_bk_q.gat,372,217,6	script	F-2区域設備担当者#EP15.	854,{/* 61070 */
	mes "[設備担当者]";
	mes "非常事態マニュアルに従って";
	mes "シェルター内部の施設を点検中です。";
	close;
}
un_bk_q.gat,389,276,6	script	I-0区域設備担当者#EP15.	854,{/* 61071 */
	mes "[設備担当者]";
	mes "非常事態マニュアルに従って";
	mes "シェルター内部の施設を点検中だよ。";
	close;
}
un_bk_q.gat,291,158,4	script	Z-0区域設備担当者#EP15.	854,{/* 61072 */
	mes "[設備担当者]";
	mes "非常事態マニュアルに従って";
	mes "シェルター内部の施設を点検中だ。";
	close;
}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,279,294,4	script	運送責任者エルノン#EP15	869,{/* 61088 */
	mes "[運送責任者エルノン]";
	mes "事故の前は";
	mes "ここに生活品や研究道具などを";
	mes "納品する仕事をしていた。";
	next;
	mes "[運送責任者エルノン]";
	mes "ここの職員ではあるけど、";
	mes "ここより他の場所に";
	mes "行っている事が多い。そんな仕事だ。";
	close;
}
un_bk_q.gat,72,53,4	script	物流担当者アブランティ#	778,{/* 61089 */
	emotion 54, "物流担当者アブランティ#"; //61089
	mes "[物流担当者アブランティ]";
	mes "シェルター内に避難できて";
	mes "なんとか助かりました。";
	next;
	mes "[物流担当者アブランティ]";
	mes "もし少しでも遅れていたら……。";
	mes "今ここにこうして";
	mes "立っていられなかったでしょう。";
	close;
}
un_bk_q.gat,22,279,4	script	機械倉庫	858,{/* 61090 */}
un_bk_q.gat,22,259,4	script	L-1区域#J0	858,{/* 61091 */}
un_bk_q.gat,25,193,4	script	J-0区域#L1	858,{/* 61092 */}
un_bk_q.gat,58,185,4	script	管制室#左側	858,{/* 61093 */}
un_bk_q.gat,58,171,4	script	モニタールーム#L1左側	858,{/* 61094 */}
un_bk_q.gat,49,137,4	script	B-1倉庫	858,{/* 61095 */}
un_bk_q.gat,58,121,4	script	A-0区域#L1	858,{/* 61096 */}
un_bk_q.gat,71,121,4	script	L-1区域#A0	858,{/* 61097 */}
un_bk_q.gat,78,125,4	script	H-0区域#左	858,{/* 61098 */}
un_bk_q.gat,101,122,4	script	モニタールーム#A0中央	858,{/* 61099 */}
un_bk_q.gat,122,125,4	script	H-0区域#右	858,{/* 61100 */}
un_bk_q.gat,126,121,4	script	L-2区域#A0	858,{/* 61101 */}
un_bk_q.gat,141,115,4	script	A-0区域#L2	858,{/* 61102 */}
un_bk_q.gat,139,171,4	script	モニタールーム#L2右側	858,{/* 61103 */}
un_bk_q.gat,139,187,4	script	管制室#右側	858,{/* 61104 */}
un_bk_q.gat,173,193,4	script	K-0区域#L2	858,{/* 61105 */}
un_bk_q.gat,171,233,4	script	L-2区域#K0	858,{/* 61106 */}
un_bk_q.gat,278,193,4	script	A-0区域#H0左	858,{/* 61107 */}
un_bk_q.gat,300,194,4	script	Z-0区域#H0	858,{/* 61108 */}
un_bk_q.gat,301,204,4	script	臨時治療所#H0	858,{/* 61109 */}
un_bk_q.gat,317,193,4	script	A-0区域#H0右	858,{/* 61110 */}
un_bk_q.gat,322,203,4	script	G-2区域#H0	858,{/* 61111 */}
un_bk_q.gat,340,203,4	script	H-0区域#H0	858,{/* 61112 */}
un_bk_q.gat,349,217,4	script	F-2区域#G2	858,{/* 61113 */}
un_bk_q.gat,339,239,4	script	臨時治療所#G2	858,{/* 61114 */}
un_bk_q.gat,368,267,4	script	I-0区域#G2	858,{/* 61115 */}
un_bk_q.gat,388,266,4	script	G-2区域#I0	858,{/* 61116 */}
un_bk_q.gat,273,203,4	script	G-1区域#H0	858,{/* 61117 */}
un_bk_q.gat,260,203,4	script	H-0区域#G1	858,{/* 61118 */}
un_bk_q.gat,247,217,4	script	F-1区域#G1	858,{/* 61119 */}
un_bk_q.gat,228,217,4	script	G-1区域#F1	858,{/* 61120 */}
un_bk_q.gat,256,239,4	script	臨時治療所#G1	858,{/* 61121 */}
un_bk_q.gat,219,265,4	script	C-0区域#G1	858,{/* 61122 */}
un_bk_q.gat,214,283,4	script	G-1区域#C0	858,{/* 61123 */}
un_bk_q.gat,215,303,4	script	農場#C0	858,{/* 61124 */}
un_bk_q.gat,300,184,4	script	H-0区域#Z0	858,{/* 61125 */}
un_bk_q.gat,365,167,4	script	Z-2区域#Z0	858,{/* 61126 */}
un_bk_q.gat,27,55,4		script	Z-0区域#Z2	858,{/* 61127 */}
un_bk_q.gat,230,167,4	script	Z-1区域#Z0	858,{/* 61128 */}
un_bk_q.gat,164,55,4	script	Z-0区域#Z1	858,{/* 61129 */}
un_bk_q.gat,255,264,4	script	食堂#G1	858,{/* 61130 */}
un_bk_q.gat,339,263,4	script	食堂#G2	858,{/* 61131 */}
un_bk_q.gat,41,275,0	warp	機械倉庫#J-0	2,2,un_bk_q.gat,21,276 //61132 from_pos=(42, 275)
un_bk_q.gat,24,276,0	warp	J-0#機械倉庫	2,2,un_bk_q.gat,45,275 //61133 from_pos=(23, 277)
un_bk_q.gat,24,256,0	warp	J-0#L-1	2,2,un_bk_q.gat,26,190 //61134 from_pos=(24, 257)
un_bk_q.gat,23,190,0	warp	L-1#J-0	2,2,un_bk_q.gat,21,256 //61135 from_pos=(23, 190)
un_bk_q.gat,31,196,0	warp	L-1#D-1	2,2,un_bk_q.gat,22,378 //61136 from_pos=(31, 196)
un_bk_q.gat,21,375,0	warp	D-1#L-1	2,2,un_bk_q.gat,32,193 //61137 from_pos=(21, 374)
un_bk_q.gat,51,196,0	warp	L-1#D-2	2,2,un_bk_q.gat,68,378 //61138 from_pos=(51, 195)
un_bk_q.gat,67,375,0	warp	D-2#L-1	2,2,un_bk_q.gat,52,193 //61139 from_pos=(67, 375)
un_bk_q.gat,60,183,0	warp	L-1#管制室	2,2,un_bk_q.gat,75,235 //61140 from_pos=(60, 183)
un_bk_q.gat,71,236,0	warp	管制室#L-1	2,2,un_bk_q.gat,57,182 //61141 from_pos=(72, 236)
un_bk_q.gat,60,169,0	warp	L-1#モニター室	2,2,un_bk_q.gat,72,168 //61142 from_pos=(60, 169)
un_bk_q.gat,69,167,0	warp	モニター室#L-1	2,2,un_bk_q.gat,57,168 //61143 from_pos=(69, 167)
un_bk_q.gat,47,135,0	warp	L-1#B-1	2,2,un_bk_q.gat,37,134 //61144 from_pos=(47, 136)
un_bk_q.gat,40,135,0	warp	B-1#L-1	2,2,un_bk_q.gat,50,134 //61145 from_pos=(40, 135)
un_bk_q.gat,57,118,0	warp	L-1#A-0	2,2,un_bk_q.gat,72,117 //61146 from_pos=(58, 118)
un_bk_q.gat,69,118,0	warp	A-0#L-1	2,2,un_bk_q.gat,53,117 //61147 from_pos=(70, 118)
un_bk_q.gat,97,124,0	warp	A-0#モニター室	2,2,un_bk_q.gat,100,144 //61148 from_pos=(97, 124)
un_bk_q.gat,97,141,0	warp	モニター室#A-0	2,2,un_bk_q.gat,98,121 //61149 from_pos=(98, 141)
un_bk_q.gat,128,118,0	warp	A-0#L-2	2,2,un_bk_q.gat,144,117 //61150 from_pos=(127, 118)
un_bk_q.gat,140,118,0	warp	L-2#A-0	2,2,un_bk_q.gat,125,117 //61151 from_pos=(141, 118)
un_bk_q.gat,137,168,0	warp	L-2#モニター室	2,2,un_bk_q.gat,122,167 //61152 from_pos=(137, 168)
un_bk_q.gat,126,168,0	warp	モニター室#L-2	2,2,un_bk_q.gat,140,167 //61153 from_pos=(126, 168)
un_bk_q.gat,137,185,0	warp	L-2#管制室	2,2,un_bk_q.gat,120,235 //61154 from_pos=(137, 185)
un_bk_q.gat,124,236,0	warp	管制室#L-2	2,2,un_bk_q.gat,140,184 //61155 from_pos=(124, 236)
un_bk_q.gat,147,196,0	warp	L-2#E-1	2,2,un_bk_q.gat,106,378 //61156 from_pos=(147, 196)
un_bk_q.gat,105,375,0	warp	E-1#L-2	2,2,un_bk_q.gat,148,193 //61157 from_pos=(105, 375)
un_bk_q.gat,167,196,0	warp	L-2#E-2	2,2,un_bk_q.gat,152,378 //61158 from_pos=(168, 196)
un_bk_q.gat,151,375,0	warp	E-2#L-2	2,2,un_bk_q.gat,168,193 //61159 from_pos=(150, 375)
un_bk_q.gat,174,190,0	warp	L-2#K-0	2,2,un_bk_q.gat,172,229 //61160 from_pos=(175, 190)
un_bk_q.gat,169,230,0	warp	K-0#L-2	2,2,un_bk_q.gat,171,189 //61161 from_pos=(170, 230)
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,216,300,0	script	C-0#農場	45,1,1,{/* 61163 */
	mes "[生命工学者ツアーリン]";
	mes "すみません。";
	mes "今は農場に入る事はできません。";
	close;
}
un_bk_q.gat,216,280,0	warp	C-0#G-1	2,2,un_bk_q.gat,220,261 //61164 from_pos=(216, 281)
un_bk_q.gat,217,262,0	warp	G-1#C-0	2,2,un_bk_q.gat,213,279 //61165 from_pos=(217, 262)
un_bk_q.gat,249,268,0	warp	G-1#M-0	2,2,un_bk_q.gat,390,380 //61166 from_pos=(250, 268)
un_bk_q.gat,389,377,0	warp	M-0#G-1	2,2,un_bk_q.gat,250,265 //61167 from_pos=(389, 377)
un_bk_q.gat,258,262,0	warp	G-1#食堂	2,2,un_bk_q.gat,274,289 //61168 from_pos=(258, 260)
un_bk_q.gat,271,290,0	warp	食堂#G-1	2,2,un_bk_q.gat,255,261 //61169 from_pos=(270, 291)
un_bk_q.gat,269,236,0	script	治療所#G-1	45,{/* 61170 */}
un_bk_q.gat,245,214,0	warp	G-1#F-1	2,2,un_bk_q.gat,226,213 //61171 from_pos=(245, 214)
un_bk_q.gat,230,214,0	warp	F-1#G-1	2,2,un_bk_q.gat,248,213 //61172 from_pos=(230, 214)
un_bk_q.gat,262,200,0	warp	G-1#H-0	2,2,un_bk_q.gat,274,199 //61173 from_pos=(261, 200)
un_bk_q.gat,271,200,0	warp	H-0#G-1	2,2,un_bk_q.gat,258,199 //61174 from_pos=(271, 200)
un_bk_q.gat,75,128,0	warp	左A-0#左H-0	2,2,un_bk_q.gat,276,196 //61175 from_pos=(75, 128)
un_bk_q.gat,275,191,0	warp	左H-0#左A-0	2,2,un_bk_q.gat,76,121 //61176 from_pos=(275, 191)
un_bk_q.gat,119,128,0	warp	右A-0#右H-0	2,2,un_bk_q.gat,319,196 //61177 from_pos=(119, 127)
un_bk_q.gat,320,191,0	warp	右H-0#右A-0	2,2,un_bk_q.gat,120,121 //61178 from_pos=(319, 192)
un_bk_q.gat,324,200,0	warp	H-0#G-2	2,2,un_bk_q.gat,344,199 //61179 from_pos=(324, 200)
un_bk_q.gat,339,200,0	warp	G-2#H-0	2,2,un_bk_q.gat,321,199 //61180 from_pos=(338, 200)
un_bk_q.gat,350,214,0	warp	G-2#F-2	2,2,un_bk_q.gat,368,213 //61181 from_pos=(350, 214)
un_bk_q.gat,365,214,0	warp	F-2#G-2	2,2,un_bk_q.gat,347,213 //61182 from_pos=(365, 214)
un_bk_q.gat,324,290,0	warp	食堂#G-2	2,2,un_bk_q.gat,340,261 //61183 from_pos=(324, 290)
un_bk_q.gat,337,262,0	warp	G-2#食堂	2,2,un_bk_q.gat,321,289 //61184 from_pos=(337, 261)
un_bk_q.gat,343,270,0	warp	G-2#N-0	2,2,un_bk_q.gat,382,328 //61185 from_pos=(343, 271)
un_bk_q.gat,381,325,0	warp	N-0#G-2	2,2,un_bk_q.gat,344,267 //61186 from_pos=(381, 324)
un_bk_q.gat,370,264,0	warp	G-2#I-0	2,2,un_bk_q.gat,388,263 //61187 from_pos=(370, 264)
un_bk_q.gat,385,264,0	warp	I-0#G-2	2,2,un_bk_q.gat,367,263 //61188 from_pos=(386, 264)
un_bk_q.gat,297,192,0	warp	H-0#Z-0	2,2,un_bk_q.gat,298,181 //61189 from_pos=(297, 193)
un_bk_q.gat,297,186,0	warp	Z-0#H-0	2,2,un_bk_q.gat,298,196 //61190 from_pos=(297, 186)
un_bk_q.gat,229,163,0	warp	Z-0#Z-1	2,2,un_bk_q.gat,159,52 //61191 from_pos=(228, 163)
un_bk_q.gat,164,51,0	warp	Z-1#Z-0	2,2,un_bk_q.gat,233,164 //61192 from_pos=(164, 51)
un_bk_q.gat,366,164,0	warp	Z-0#Z-2	2,2,un_bk_q.gat,31,51 //61193 from_pos=(367, 164)
un_bk_q.gat,27,52,0	warp	Z-2#Z-0	2,2,un_bk_q.gat,361,163 //61194 from_pos=(27, 52)
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,100,312,6	script	機械工学者ブカル#EP15.2	851,{/* 61196 */
	mes "[機械工学者ブカル]";
	mes "機械工学者の人数ですか？";
	next;
	mes "[機械工学者ブカル]";
	mes "私は把握していないので、";
	mes "あそこにいるアールさんに";
	mes "聞いてみて下さい。";
	close;
}
un_bk_q.gat,76,175,4	script	研究員グラム#EP15.2MR	982,{/* 61197 */
	mes "[研究員グラム]";
	mes "あの女は何を偉そうに……。";
	mes "自分が代表にでもなった気で";
	mes "人数を数えているんだ？";
	next;
	mes "[研究員グラム]";
	mes "最初からあんな実験をしなければ、";
	mes "爆発もなかったんじゃないか？";
	mes "そうだろ？";
	close;
}
un_bk_q.gat,297,287,6	script	冒険家ジャン#EP15.2MR	896,{/* 61198 */
	mes "[冒険家ジャン]";
	mes "あ！　あなたも冒険者なの？";
	next;
	mes "[冒険家ジャン]";
	mes "そっか……。";
	mes "ぼくらは本当に運が悪いね……。";
	close;
}
un_bk_q.gat,318,299,2	script	食堂おばさん#EP15.2MR	979,{/* 61199 */
	mes "[食堂おばさん]";
	mes "すみません。";
	mes "まだ準備中です。";
	close;
}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,313,280,8	script	出入り統制ガード#EP15.2	899,{/* 61203 */
	mes "[出入り統制ガード]";
	mes "ここは工事中なので";
	mes "立ち入る事が出来ません。";
	next;
	mes "[出入り統制ガード]";
	mes "設備担当者の話だと、";
	mes "今後は治療所として";
	mes "使用されるそうですよ。";
	close;
}
un_bk_q.gat,280,280,8	script	出入り統制ガード#EP15.2	899,{/* 61204 */
	mes "[出入り統制ガード]";
	mes "ここは工事中なので";
	mes "立ち入る事が出来ません。";
	next;
	mes "[出入り統制ガード]";
	mes "設備担当者の話だと、";
	mes "今後は治療所として";
	mes "使用されるそうですよ。";
	close;
}
un_bk_q.gat,255,236,2	script	出入り統制ガード#EP15.2	899,{/* 61205 */
	mes "[出入り統制ガード]";
	mes "ここは工事中なので";
	mes "立ち入る事が出来ません。";
	next;
	mes "[出入り統制ガード]";
	mes "設備担当者の話だと、";
	mes "今後は治療所として";
	mes "使用されるそうですよ。";
	close;
}
un_bk_q.gat,298,203,4	script	出入り統制ガード#EP15.2	899,{/* 61206 */
	mes "[出入り統制ガード]";
	mes "ここは工事中なので";
	mes "立ち入る事が出来ません。";
	next;
	mes "[出入り統制ガード]";
	mes "設備担当者の話だと、";
	mes "今後は治療所として";
	mes "使用されるそうですよ。";
	close;
}
un_bk_q.gat,340,235,6	script	出入り統制ガード#EP15.2	899,{/* 61207 */
	mes "[出入り統制ガード]";
	mes "ここは工事中なので";
	mes "立ち入る事が出来ません。";
	next;
	mes "[出入り統制ガード]";
	mes "設備担当者の話だと、";
	mes "今後は治療所として";
	mes "使用されるそうですよ。";
	close;
}
un_bk_q.gat,98,246,8	script	設備担当者ジゴ#EP15.2MR	854,{/* 61208 */
	mes "[設備担当者ジゴ]";
	mes "ああ……。";
	mes "管制室はかなり被害が大きく、";
	mes "この通り、ひどいありさまです。";
	close;
}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,322,249,2	script	看護師#EP15.2MR2	569,{/* 61210 */}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,103,393,4	script	メモリーレコード#EP15.2	10043,{/* 61221 */
	mes "‐誰かが録音したと思われる";
	mes "　メモリーレコードの入った";
	mes "　レコードプレイヤーがある‐";
	next;
	if(select("再生する","やめる") == 2) {
		mes "‐あなたはその場を離れた‐";
		close;
	}
	while(1) {
		mes "[レコードプレイヤー]";
		mes "^0000FF‐あーあ、あ。";
		mes "　あ〜、テストーテストー。‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐シェルター内での日付けを";
		mes "　明確にする為、";
		mes "　実験の爆発以降は";
		mes "　「爆発何日目」と呼ぶことにする。‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐それでは記録を開始する。";
		mes "　本日は爆発1日目だ。‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐最初の爆発直後、";
		mes "　モニターに映し出された";
		mes "　外の状況を見て、";
		mes "　みんなパニックになってしまった。‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐だけど実験の責任者だった";
		mes "　ドクターベリーニが";
		mes "　みんなを落ち着かせて、";
		mes "　生存者の人数を確認を始めた。‐^000000";
		next;
		mes "[レコードプレイヤー]";
		mes "^0000FF‐そして先ほど、爆発の余波で";
		mes "　外を映していたカメラが壊れた。";
		mes "　もうこれで外の状況を";
		mes "　確認する事はできない。‐^000000";
		next;
		mes "‐これ以上録音された内容はない‐";
		next;
		if(select("もう一度再生する","やめる") == 2) {
			mes "‐あなたはその場を離れた‐";
			close;
		}
		continue;
	}
}
un_bk_q.gat,108,243,4	script	捨てられた機械装置#EP15	10043,{/* 61222 */
	mes "‐床に捨てられた機械装置がある。";
	mes "　動くかどうかはわからない‐";
	close;
}
un_bk_q.gat,34,138,4	script	倉庫番ピック#EP15.2MR	99,{/* 61223 */
	mes "[倉庫番ピック]";
	mes "何の要件でいらっしゃったのかは";
	mes "分かりませんが、";
	mes "倉庫のものは";
	mes "勝手に触らないでください。";
	next;
	mes "[倉庫番ピック]";
	mes "まだ在庫把握も終わっていないし、";
	mes "ものがなくなったりすると";
	mes "大変なので。";
	close;
}
un_bk_q.gat,91,283,2	script	ガード#EP15.2MR	899,{/* 61224 */
	mes "[ガード]";
	mes "冒険者様、こんにちは。";
	next;
	mes "[ガード]";
	mes "理由は分かりませんが、";
	mes "私はベリーニさんに";
	mes "ここに配置されました。";
	close;
}

un_bk_q.gat,56,192,4	script	科学者コリー#EP15.2MR	749,{/* 61225 */
	mes "[科学者コリー]";
	mes "非常状況時のマニュアルに沿って、";
	mes "シェルター内に";
	mes "危険物質があるか確認中です。";
	next;
	mes "[科学者コリー]";
	mes "科学者が何人なのか";
	mes "知りたいのですか？";
	mes "でしたらカールステンさんを";
	mes "探してみて下さい。";
	mes "どこかにいると思います。";
	close;
}
un_bk_q.gat,161,193,6	script	冒険家バンム#EP15.2MR	750,{/* 61226 */
	mes "[冒険家バム]";
	mes "シェルターを歩き回っていて";
	mes "見つけたんだけど、これは何かな？";
	mes "壁面にこんなものが";
	mes "たくさんあったんだ。";
	close;
}
un_bk_q.gat,248,258,2	script	冒険家ダルリー#EP15.2MR	882,{/* 61227 */
	mes "[冒険家ダルリー]";
	mes "もう！　腹立つ！";
	next;
	mes "[冒険家ダルリー]";
	mes "姉さんー！　走って〜！";
	//4分 移動速度増加
	close;
}



verus04.gat,170,216,3		duplicate(3rdRentalGear)	魔導ギア管理兵#ver		105	/* 50026 */


/*
announce "警備隊員フィプス : 隊長！　滅亡祝福教団の襲撃だ！",0x1,0xffff00,0x190,12,0,0;
announce "警備隊長ケスラー : すべての警備隊員は戦闘配置につけ！　ウェルスシティを死守するのだ！",0x1,0xffff00,0x190,12,0,0;
announce "滅亡祝福教団幹部 : 滅亡の時に備えよ！　破壊こそ救済の道、破壊する者だけが救われる！",0x1,0xffff00,0x190,12,0,0;
announce "警備隊員サルグラン : チッ……倒しても倒しても次から次へと出てきやがる！",0x1,0xffff00,0x190,12,0,0;
announce "警備隊長ケスラー ： 怯むな！　私たちが諦めたら誰がウェルスシティを守るのだ！",0x1,0xffff00,0x190,12,0,0;
announce "警備隊員ゲレフ ： うっ……こんな時に胃が……。負けるわけにはいかないのに！",0x1,0xffff00,0x190,12,0,0;
announce "警備隊員スイデン ： そう、それがこの戦いの結末なんだね……ふふ、ふふふ。",0x1,0xffff00,0x190,12,0,0;
announce "滅亡祝福教団幹部 : おのれ……今回は分が悪い……全員撤退する！　滅亡！　祝福！",0x1,0xffff00,0x190,12,0,0;
announce "警備隊長ケスラー : 滅亡祝福教団が撤退していく……助かった……のか？",0x1,0xffff00,0x190,12,0,0;
*/
