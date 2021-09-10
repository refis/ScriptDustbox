moc_para01.gat,26,95,5	script	ロエル#sara	10040,{/* 65388 */
	cutin "roel01.bmp", 0;
	mes "[ロエル]";
	mes "何か御用ですか？";
	next;
	switch(select("ダンジョンの探索","ペンダントの交換","ジターバグの牙の交換")) {
	case 1:
		if(checkquest(13181)) {
			mes "[ロエル]";
			mes "どうしたのですか？";
			mes "準備が出来たら隣にいる";
			mes "ルナインさんに話しかけて下さい。";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(checkquest(116509)) {
			mes "[ロエル]";
			mes "初めてシャルロシーと出会った";
			mes "あの冒険以来、";
			mes "不思議な事がありました。";
			next;
			mes "[ロエル]";
			mes "詳しいことはわかりませんが、";
			mes "ルナインさんのワープポータルが";
			mes "場所だけではなく、時間も一緒に";
			mes "記憶していたらしいんです。";
			next;
			mes "[ロエル]";
			mes "つまり、シャルロシーと出会った";
			mes "あの時のあの場所へ、";
			mes "もう一度行けるという事です！";
			next;
			mes "[ロエル]";
			mes "シャルロシーも本当は";
			mes "みんなと一緒に";
			mes "ここへ帰ってきたかったはずです。";
			next;
			mes "[ロエル]";
			mes "もう一度シャルロシーに会えば、";
			mes "最後に別れずにすむ方法が";
			mes "見つかるかもしれません。";
			next;
			mes "[ロエル]";
			mes "もし、ご迷惑でなければ";
			mes "もう一度一緒にあの空間に行き、";
			mes "シャルロシーを救う手助けを";
			mes "してもらえませんか？";
			next;
			if(select("はい","いいえ") == 2) {
				mes "[ロエル]";
				mes "そうですか。";
				close2;
				cutin "roel01.bmp", 255;
				end;
			}
			mes "[ロエル]";
			mes "準備が出来たら隣にいる";
			mes "ルナインさんに話しかけて下さい。";
			setquest 13181;
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(checkquest(116508)) {
			cutin "roel01.bmp", 0;
			mes "[ロエル]";
			mes "ご協力ありがとうございました。";
			mes "やはりシャルロシーと解りあうのは";
			mes "無理なんでしょうか……。";
			mes "なんて、弱気はダメですよね！";
			mes "大事なギルドメンバーのためです！";
			mes "次も頑張りましょう！";
			setquest 13181;
			compquest 13181;
			setquest 116509;
			compquest 116509;
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		mes "[ロエル]";
		mes "はじめまして。";
		mes "ニュオーズの白羽ギルドのメンバー、";
		mes "ロエルです！";
		next;
		mes "[ロエル]";
		mes "僕たちは前ギルドマスターの";
		mes "ニュオーズ様が発見したという、";
		mes "未知のダンジョンの探索へ出発します。";
		next;
		mes "[ロエル]";
		mes "しかし、そこは不可解な場所のため";
		mes "より多くの戦力を確保したいと思い、";
		mes "臨時のギルド員を";
		mes "募集することにしました。";
		mes "よかったら参加して頂けませんか？";
		next;
		if(select("はい","いいえ") == 2) {
			mes "[ロエル]";
			mes "そうですか……残念です。";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		cutin "roel02.bmp", 0;
		mes "[ロエル]";
		mes "ありがとうございます。";
		mes "ニュオーズ様というのは";
		mes "^FF0000ニュオーズの白羽ギルド^000000の";
		mes "前ギルドマスターです。";
		next;
		cutin "roel01.bmp", 0;
		mes "[ロエル]";
		mes "彼は冒険が好きで、";
		mes "常に新しい街やダンジョンを求め";
		mes "あちこちへ旅立ってしまうので、";
		mes "ギルドメンバーでさえもなかなか";
		mes "彼に会うことはできなかったんです。";
		next;
		mes "[ロエル]";
		mes "そんなニュオーズ様から、";
		mes "ある日一通の手紙が届きました。";
		mes "これがその手紙です。";
		next;
		mes "‐あなたは手紙を受け取り、開いた‐";
		next;
		mes "^FF0000‐ギルドのみんなへ";
		mes "　";
		mes "　やっほ～！　みんな元気にしてる？";
		mes "　私は毎日とっても元気だよ！";
		mes "　冒険の先々で新しいモノに出会って";
		mes "　とっても楽しいよ～。‐^000000";
		next;
		mes "^FF0000‐そうそう、冒険の途中で面白そうな";
		mes "　ダンジョンを見つけたんだ。";
		mes "　とっても不思議な雰囲気で、";
		mes "　たぶんまだ誰にも発見されていない";
		mes "　未知の場所だと思うんだ!!";
		mes "　すごいよね～！‐^000000";
		next;
		mes "^FF0000‐それでね、";
		mes "　誰も入ったことのない場所なら";
		mes "　最初にみんなで探検したいなって";
		mes "　思ったんだ！　と、いうわけなので";
		mes "　みんな早く来てね！　待ってるよ～!!";
		mes "　";
		mes "　ニュオーズより‐^000000";
		next;
		mes "‐読み終えた手紙をロエルに手渡した‐";
		next;
		mes "[ロエル]";
		mes "この手紙を見て僕は、";
		mes "ニュオーズ様の";
		mes "^0000FFギルドメンバーみんなで";
		mes "未知のダンジョンの最初の探索に";
		mes "出かけたい^000000という想いに、";
		mes "とても感動したのです！";
		next;
		mes "[ロエル]";
		mes "だけど、現マスターのロテルト様は";
		mes "散々心配をかけさせやがって！　と、";
		mes "すごく怒っていました。";
		mes "ロテルト様はニュオーズ様の事となると";
		mes "いつも怒ってばかりなんです。";
		next;
		mes "[ロエル]";
		mes "怒ってはいますが、";
		mes "きっとロテルト様は";
		mes "ニュオーズ様が本当に心配なんです。";
		mes "お二人は付き合いが長いそうですし、";
		mes "ケンカするほど";
		mes "仲が良いと言いますしね。";
		next;
		mes "[ロエル]";
		mes "さあ、そろそろ時間です。";
		mes "ニュオーズ様を";
		mes "お待たせするわけにはいきません。";
		mes "ニュオーズ様が指定した集合場所は、";
		mes "ルナインさんのワープポータルで";
		mes "記録してあります。";
		next;
		mes "[ロエル]";
		mes "準備が出来たら隣にいる";
		mes "ルナインさんに話しかけて下さい。";
		setquest 13181;
		close2;
		cutin "roel01.bmp", 255;
		end;
	}
}

moc_para01.gat,29,95,5	script	ルナイン#sara	10039,{/* 65389 */
	if(checkquest(13181) == 0) {
		cutin "lunain01.bmp", 0;
		mes "[ルナイン]";
		mes "こんにちは。";
		mes "なにか聞きたそうな顔をしているわね。";
		next;
		mes "[ルナイン]";
		mes "私達は今から";
		mes "とある場所の探索へ行くのよ。";
		mes "詳しく知りたいなら";
		mes "横にいる^ff0000ロエル^000000に話を聞くといいわ。";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
	if(checkquest(116509)) {
		cutin "lunain01.bmp", 0;
		mes "[ルナイン]";
		mes "こんにちは。";
		mes "今日はどうするの？";
		set '@str$,"外伝を見る";
	}
	else {
		cutin "lunain01.bmp", 0;
		mes "[ルナイン]";
		mes "ロエルに話をきいてきたみたいね。";
		mes "私はニュオーズの白羽ギルドのメンバー";
		mes "^ff0000ルナイン^000000よ。";
		next;
		mes "[ルナイン]";
		mes "あなたも一緒に行くのね。";
		mes "準備はいいかしら？";
	}
	next;
	switch(select("ダンジョンに行く",'@str$,"やめる")) {
	case 1:
		if(checkquest(13182) & 0x2 == 0) {
			mes "[ルナイン]";
			mes "この次元のワープは^ff0000最後に利用してから";
			mes "20時間は再使用できないわ。^000000";
			mes "もう少し時間が経ってから";
			mes "また来なさい。";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		mes "[ルナイン]";
		mes "ワープポータルはいつでも開けるけど";
		mes "どうするの？";
		next;
		mes "^ff0000‐メモリアルダンジョン作成後に";
		mes "　パーティーリーダーを変更した場合";
		mes "　正常に進行できない場合がありますので";
		mes "　ご注意ください‐^000000";
		next;
		if(select("悪夢のジターバグに入場","キャンセル") == 2) {
			mes "[ルナイン]";
			mes "やめるのね。わかったわ。";
			mes "準備ができたらまたきて。";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		mes "[ルナイン]";
		mes "わかったわ。";
		mes "ワープポータルを開くから";
		mes "入ってちょうだい。";
		next;
		mes "[ルナイン]";
		mes "この次元のワープは^ff0000最後に利用してから";
		mes "20時間は再使用できないわ。^000000";
		mes "気を付けてね。";
		next;
		switch(mdenter("jitterbug")) {
		case 0:	// エラーなし
			cutin "lunain01.bmp", 255;
			setquest 13182;
			misceffect 316,"";
			misceffect 317,"";
			announce "メモリアルダンジョン[jitterbug] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x1, 0x00ff99, 0x190, 12, 0, 0;
			warp "1@jtb.gat",16,17;
			end;
		case 1:	// パーティー未加入
			mes "‐パーティー員のみ、";
			mes "　メモリアルダンジョンに";
			mes "　入場することができます‐";
			close;
		case 2:	// ダンジョン未作成
			mes "‐パーティーリーダーが";
			mes "　メモリアルダンジョンを";
			mes "　生成していない状態です‐";
			close;
		default:	// その他エラー
			close;
		}
	case 2:
		mes "[ルナイン]";
		mes "あのダンジョンの冒険中、";
		mes "あなたが見ていない場所で";
		mes "何が起こっていたのか、";
		mes "どんな会話がされていたのか";
		mes "気にならない？";
		next;
		mes "[ルナイン]";
		mes "私のワープポータルを使えば";
		mes "あなたが本来いなかった場所に";
		mes "送ってあげることができるわ。";
		next;
		mes "[ルナイン]";
		mes "詳しくはわからないけど";
		mes "^ff0000あのダンジョンから帰ってくるたびに^000000";
		mes "私のワープポータルに";
		mes "行先が増えてるのよね……。";
		if(checkquest(116520) == 0) {
			set '@str[0],"^0000ff不名誉な疑惑^000000";
		} else {
			set '@str[0],"不名誉な疑惑";
		}
		while(1) {
			next;
			mes "[ルナイン]";
			mes "さあ、見てみたい話を選んで。";
			mes "その話が行われた場所、時間に";
			mes "送ってあげる。";
			next;
			switch(select(	"^0000ff不名誉な疑惑^000000",
							"^808080未開放^000000",
							"^808080未開放^000000",
							"^808080未開放^000000",
							"^808080未開放^000000",
							"^808080未開放^000000",
							"^808080未開放^000000",
							"^808080未開放^000000",
							"^808080未開放^000000",
							"^808080未開放^000000"
			)) {
			case 1:
				mes "[ルナイン]";
				mes "わかったわ。";
				mes "ワープポータルを開くから";
				mes "入ってちょうだい。";
				misceffect 316,"";
				misceffect 317,"";
				close2;
				cutin "lunain01.bmp", 255;
				end;
			case 2:
				mes "[ルナイン]";
				mes "ごめんなさい。";
				mes "今はそこに送れないみたい。";
				next;
				mes "[ルナイン]";
				mes "あのダンジョンを冒険してくれば";
				mes "もしかしたら、行けるように";
				mes "なるかも知れないわよ。";
				break;
			}
		}
	case 3:
		mes "[ルナイン]";
		mes "やめるのね。わかったわ。";
		mes "準備ができたらまたきて。";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
OnInit:
	waitingroom "悪夢のジターバグ", 20;
	end;
}

moc_para01.gat,198,31,5	script	ミンミン#03	643,{/* 65390 */
	cutin "min01.bmp", 2;
	mes "[ミンミン]";
	mes "ニュオーズ、話があるんだけど。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "どうかした？　ミンミン。";
	next;
	cutin "min01.bmp", 2;
	mes "[ミンミン]";
	mes "どうかした？って、あなたね！";
	mes "その手を握って連れてる子は誰よ。";
	next;
	mes "[ミンミン]";
	mes "まさかニュオーズ……";
	mes "とうとう本物のロリコンに……。";
	next;
	menu "ニュオーズはロリコンなの？",-;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes strcharinfo(0) + "……";
	mes "いきなり現れて";
	mes "ロリコンとは酷いなあ！";
	mes "確かにこの子は可愛いけどね♪";
	next;
	cutin "min01.bmp", 2;
	mes "[ミンミン]";
	mes "それで、本当に";
	mes "その子は何なの？";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "この子とはこの洞窟で";
	mes "会っただけだよ～！";
	next;
	cutin "min01.bmp", 2;
	mes "[ミンミン]";
	mes "……こんな場所で？";
	mes "ねえ、普通に考えて、";
	mes "怪しくないかしら？";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[？？？]";
	mes "……ニュオーズ。";
	mes "このおばさん、誰？";
	next;
	cutin "min02.bmp", 2;
	mes "[ミンミン]";
	mes "……おばさん？";
	next;
	mes "[ミンミン]";
	mes "……は？";
	mes "まさかとは思うけど……";
	mes "私のこと!?";
	next;
	menu "多分……",-;
	mes "[ミンミン]";
	mes "……。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "ミンミン～？";
	mes "おーい。";
	next;
	mes "[ニュオーズ]";
	mes "反応ない……。";
	mes "おばさん発言がかなり";
	mes "ショックだったみたい。";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[？？？]";
	mes "……？";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "女の人におばさんなんて";
	mes "言っちゃだめだよー？";
	next;
	mes "[ニュオーズ]";
	mes "今度言ったら、めっ！　だよ～。";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[？？？]";
	mes "……いわない。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "さて……おーい、";
	mes "ミンミンちゃーん。";
	next;
	cutin "min02.bmp", 2;
	mes "[ミンミン]";
	mes "……誰がミンミンちゃんよっ!!";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "お、さすがにこの呼び方は";
	mes "効果あったみたいだね。";
	next;
	menu "謝ったほうがいいのでは？",-;
	mes "[ニュオーズ]";
	mes "そうだね。";
	mes "ミンミンにごめんなさいしよう。";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[？？？]";
	mes "……ごめんなさい。";
	next;
	cutin "min02.bmp", 2;
	mes "[ミンミン]";
	mes "……。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "ミンミン、謝ったんだし";
	mes "そんな怖い顔……";
	next;
	cutin "min02.bmp", 2;
	mes "[ミンミン]";
	mes "違うわよ!!　モンスターよ!!";
	mes "早く構えなさいっ!!";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "おおっと～。了解だよ。";
	next;
	cutin "min02.bmp", 2;
	mes "[ミンミン]";
	mes "私……そんなに老けて見えるの……？";
	next;
	cutin "min02.bmp", 255;
	mes "‐ミンミンは武器を構えながら";
	mes "　ぶつぶつ呟いている。";
	mes "　どうやら相当ショックを";
	mes "　受けたようだ……‐";
	close2;
	if(checkquest(116520) == 0) {
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		setquest 116520;
		compquest 116520;
	}
	end;
}

moc_para01.gat,205,31,4	script	ニュオーズ#03	625,{/* 65391 */
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "ミンミンはまだまだ若いんだよ。";
	close2;
	cutin "nines01.bmp", 255;
	end;
}

moc_para01.gat,204,33,4	script	？？？#03	10041,{/* 65392 */
	cutin "shaloshi02.bmp", 2;
	mes "[？？？]";
	mes "……おばさん。";
	mes "……お姉さん？";
	close2;
	cutin "shaloshi02.bmp", 255;
	end;
}
moc_para01.gat,220,23,0	script	3番部屋出口	45,{/* 65422 */
	mes "‐外にでますか？‐";
	next;
	if(select("はい","いいえ") == 2) {
		mes "‐その場に留まる事にした‐";
		close;
	}
	mes "‐外に出た‐";
	close;
}

moc_para01.gat,37,95,5	script	ゲルカ#1	629,{/* 65433 */
	if(checkquest(116508) == 0) {
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "一に修行、二に修行！";
		mes "三四がなくて、五に師匠！";
		mes "毎日が修行の日です！";
		mes "今日も頑張ります！";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
	else {
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "あ……" + strcharinfo(0) + "さん！";
		mes "こんにちは。";
		next;
		cutin "gelca02.bmp", 2;
		mes "[ゲルカ]";
		mes "そうそう、実はですね。";
		mes "あの後、やっぱりこんな結末";
		mes "良くないんじゃないかって話に";
		mes "なったんです……。";
		mes "シャルロシーちゃんだってきっと、";
		mes "本心は違ったはず……。";
		next;
		mes "[ゲルカ]";
		mes "あと、ルナインさんのワープポータルが";
		mes "あの時の場所と時間も記憶している";
		mes "そうなので、とりあえず今一度";
		mes "修行してもう少し腕を上げてまた、";
		mes "もう一度あの場所に行こうという話に";
		mes "落ち着きました。";
		next;
		mes "[ゲルカ]";
		mes "なので私と師匠、あと何人かは";
		mes "この楽園団に戻って装備を買うための";
		mes "資金集めと修行を兼ねてバイトを。";
		mes "ニュオーズ様は一人で考えたいからと、";
		mes "私達とは今は別行動をとっています。";
		mes "今回は流石に仕方ないですね……。";
		next;
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "なのでまたもし" + strcharinfo(0) + "さんが";
		mes "あの場所の探索に協力して良いなら";
		mes "その時は是非、私達と一緒に";
		mes "またあの場所に行きましょうね！";
		mes "それまでに私ももう少し腕を";
		mes "上げておきますから。";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}

moc_para01.gat,41,95,5	script	ロテルト#12	630,{/* 65434 */
	if(checkquest(116508) == 0) {
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "ったく……！";
		mes "肝心な時にアイツは";
		mes "いつもこうだ。";
		mes "人の都合も考えないで";
		mes "いつも俺や皆が暇だとは";
		mes "限らないぞ!?";
		next;
		mes "[ロテルト]";
		mes "……なんだ？";
		mes "俺はいま少し虫の居所が";
		mes "悪いんだ。";
		mes "用がないなら離れていた方が";
		mes "いいと思うぞ。";
		close2;
		cutin "rote03.bmp", 255;
		end;
	}
	else {
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "ああ、お前か。";
		mes "妙に冒険なれした";
		mes "雰囲気のやつがいると";
		mes "思ったぜ……。";
		next;
		mes "[ロテルト]";
		mes "俺がどうしてここに";
		mes "居るのかって顔だな。";
		mes "簡単にいうとここで日々、";
		mes "飯の食い上げにならないよう";
		mes "頑張ってるってだけだ。";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "あとはまあ……";
		mes "他の連中が変にやる気になって";
		mes "もう少し腕を上げてまた、";
		mes "あの場所に挑みたいと";
		mes "言い出しててな。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "そのためには装備とか";
		mes "いろいろ先立つものが必要だしな。";
		mes "そんなわけでここで他のヤツも";
		mes "何人か働いてるんだ。";
		mes "良かったら顔だけでも";
		mes "見せてやってくれ。";
		next;
		mes "[ロテルト]";
		mes "特にゲルカのやつは、";
		mes "俺が最近忙しくてあまり相手を";
		mes "出来ていない状態だからな。";
		mes "今度暇になった時にでも、";
		mes "俺のかわりにアイツの話相手に";
		mes "なってもらえると助かるぜ。";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}
moc_para01.gat,17,95,5	script	ミンミン#1	643,{/* 65435 */
	if(checkquest(116508) == 0) {
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "さーってと。";
		mes "今日こそあの研究、";
		mes "少しは進展あるかしら？";
		mes "いい加減そろそろ";
		mes "次の段階に進みたいわね。";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
	else {
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "あら。";
		mes strcharinfo(0) + "。";
		mes "こっちで会うとなんだか";
		mes "変な感じね。";
		next;
		mes "[ミンミン]";
		mes "とりあえずシャルロシーの件は";
		mes "まだ色々と問題がありそうね。";
		mes "特に新しいギルドマスターを";
		mes "攻略しないと無理だと思うわ。";
		next;
		cutin "min02.bmp", 2;
		mes "[ミンミン]";
		mes "ロテルトって見た目通り、";
		mes "気難しい性格だから大変よ。";
		mes "特に、ギルドメンバーに何か";
		mes "危険がおよぶ可能性があることには";
		mes "かな～り敏感なのよね。";
		next;
		mes "[ミンミン]";
		mes "まあ、そこはあの子なりに";
		mes "色々あったから仕方がないんだけど。";
		mes "なにはともあれここでこうして";
		mes "色々と話してみたところで、";
		mes "机上の空論でしかないし。";
		mes "とにかく……";
		next;
		mes "[ミンミン]";
		mes "ルナインのワープポータルが";
		mes "時間を記憶しているみたいだし、";
		mes "それをうまく利用して誰かが";
		mes "ロテルトを含め、他のみんなを";
		mes "説得するしかないんじゃないかしら？";
		close2;
		cutin "min02.bmp", 255;
		end;
	}
}

moc_para01.gat,44,81,3	script	メロディージャック#1	648,8,8,{/* 65436 */
	{
		mes "[メロディージャック]";
		mes "……。";
		mes "今日はどうする？";
		next;
		switch(select("依頼を受ける","依頼を報告する","特別報酬について","依頼を破棄する","話をする")) {
		case 1:
			if(BaseLevel >= 140) {
				mes "[メロディージャック]";
				mes "残念だがお前に依頼できるものは";
				mes "無いようだ。";
				mes "私の依頼はある程度決まった腕前の";
				mes "メンバーに依頼する必要がある。";
				mes "それがクライアントからの";
				mes "指示だから仕方がない。";
				next;
				mes "[メロディージャック]";
				mes "あちらを立てればこちらが立たず";
				mes "と言ったように、細かい約束ごとが";
				mes "今回はいろいろ決められている。";
				mes "このためお前に依頼することは";
				mes "もう出来ないから、";
				mes "憶えておいてくれ。";
				next;
				mes "‐^ff0000メロディージャックの依頼は";
				mes "　BaseLv140以上では受けることが";
				mes "　できません^000000‐";
				close;
			}
		case 2:
			mes "[メロディージャック]";
			mes "おいおい、";
			mes "完了している依頼は無いようだぞ？";
			mes "もう一度よく確認してみてくれ。";
			close;
		case 3:
			mes "[メロディージャック]";
			mes "私とアイグの依頼、";
			mes "^FF0000それぞれ4種類すべてを";
			mes "完了させたら^000000特別報酬をやろう。";
			mes "もし内容が気になるなら";
			mes "私とアイグの依頼を達成してくれ。";
			next;
			mes "[メロディージャック]";
			mes "すべてこなすのは大変だろう。";
			mes "だが、その苦労に見合った";
			mes "報酬は約束する。";
			mes "その気があったら挑んでみてくれ。";
			close;
		case 4:
			mes "[メロディージャック]";
			mes "依頼した仕事を破棄したいのか？";
			mes "フン、まぁいい。";
			mes "お前にはお前の事情があるんだろう。";
			next;
			mes "[メロディージャック]";
			mes "破棄の方法は2種類ある。";
			mes "好きな方を選べ。";
			next;
			switch(select("依頼の破棄","報告記録の破棄")) {
			case 1:
				mes "[メロディージャック]";
				mes "おいおい、";
				mes "依頼している仕事は無いようだぞ？";
				mes "もう一度よく確認してみてくれ。";
				close;
			case 2:
				mes "[メロディージャック]";
				mes "おいおい、";
				mes "完了している報告の記録は";
				mes "無いようだぞ？";
				mes "もう一度よく確認してみてくれ。";
				close;
			}
		case 5:
			mes "[メロディージャック]";
			mes "何だ、まさかお前……";
			mes "私に興味があるのか？";
			mes "フン。";
			mes "あまり首をつっこむと";
			mes "大変なことになるぞ。";
			next;
			switch(select("興味がある","依頼について聞く","取引について聞く","約束とは？")) {
			case 1:
				mes "[メロディージャック]";
				mes "残念だが……";
				mes "私はお前に興味はない。";
				mes "ゆえに、語ることもない。";
				mes "そういうことだ。";
				close;
			case 2:
				mes "[メロディージャック]";
				mes "この私としたことが……";
				mes "やっかいな依頼を受けてしまった。";
				mes "信用問題があるから";
				mes "契約した奴の行方が不明とはいえ";
				mes "一度契約した内容を途中で";
				mes "投げ出すわけにもいかない。";
				next;
				mes "[メロディージャック]";
				mes "それに何より、";
				mes "私のプライドが許さない。";
				mes "契約解除という言葉は";
				mes "余程のことがない限り";
				mes "行わないのがポリシーだ。";
				next;
				mes "[メロディージャック]";
				mes "とはいえお前のような冒険者に";
				mes "依頼の一部を任せることができて";
				mes "良かった。";
				mes "二重契約が駄目とは契約書に";
				mes "書いてなかったし問題はない。";
				close;
			case 3:
				mes "[メロディージャック]";
				mes "正直、この世で信じられるのは";
				mes "何もないぞ。";
				mes "信頼や約束のようなものは";
				mes "全部意味のないことだ。";
				mes "裏切ったり、破ることは";
				mes "至極、簡単だからな。";
				next;
				mes "[メロディージャック]";
				mes "だからこそ……";
				mes "私が信じるのは自分自身と";
				mes "私がした取引だけだ。";
				mes "他人は騙せるが";
				mes "自分自身は騙せない。";
				next;
				mes "[メロディージャック]";
				mes "それに約束や信頼は";
				mes "裏切られると遺恨が残ったり";
				mes "いろいろ面倒だが、";
				mes "取引は報酬をもらったり";
				mes "報復することができる。";
				next;
				mes "[メロディージャック]";
				mes "フン、無駄にしゃべりすぎたか。";
				mes "とにかく私は以上のように";
				mes "考えているということだ。";
				mes "それを理解しろとも、";
				mes "従えとも思っていない。";
				mes "そこだけ了承してほしい。";
				close;
			case 4:
				mes "[メロディージャック]";
				mes "約束について……だと？";
				mes "それを何故お前に話す必要が";
				mes "あるというんだ？";
				mes "あまり詮索すると";
				mes "身を滅ぼすことになるぞ。";
				next;
				mes "[メロディージャック]";
				mes "今は仕方なく表に出ているが、";
				mes "影の中で生きて行くのが";
				mes "本来、私の生き方だ。";
				mes "ゆえに必要なこと以外は";
				mes "特に話すつもりはない。";
				close;
			}
	}
	if(checkquest(116508) == 0) {
		mes "[メロディージャック]";
		mes "何だ？";
		mes "見て分からないか？";
		mes "私は今、忙しいんだ。";
		mes "邪魔をしないでくれ。";
		close;
	}
	else {
		emotion 0, "メロディージャック#1";
		mes "[メロディージャック]";
		mes "お前か……。";
		mes "ニュオーズの件以来だな。";
		mes "息災なようで何よりだ。";
		next;
		emotion 0, "メロディージャック#1";
		mes "[メロディージャック]";
		mes "どうした、不思議そうな顔をして。";
		mes "私の姿に可笑しい所でも";
		mes "あるのか？";
		next;
		mes "[メロディージャック]";
		mes "ああ、あの時は姿を隠していたからな。";
		mes "私の姿は初めて見るのか。";
		mes "慣れないとは思うが我慢してくれ。";
		next;
		mes "[メロディージャック]";
		mes "さて、本題なんだが……。";
		mes "お前の腕を見込んで頼みがある。";
		next;
		mes "[メロディージャック]";
		mes "見た所、お前はアイグの依頼も";
		mes "受けているんだろう？";
		mes "そこで相談だ。";
		mes "アイグの依頼を解決しながらでいい。";
		mes "私からの依頼も同時に";
		mes "遂行してほしいのだ。";
		next;
		mes "[メロディージャック]";
		mes "私の依頼を受けてくれるなら";
		mes "無論、私からも報酬を出す。";
		mes "アイグからの報酬とは別にだ。";
		mes "お前にとってもこの話は";
		mes "悪い内容ではないはずだ。";
		next;
		mes "[メロディージャック]";
		mes "難しく考えなくていい。";
		mes "アイグの依頼を解決するついでに";
		mes "私の依頼も解決する。";
		mes "それだけだ。";
		mes "簡単なことだろう？";
		next;
		if(select("手伝う","手伝わない") == 2) {
			emotion 0, "メロディージャック#1";
			mes "[メロディージャック]";
			mes "そうか。手間をかけさせたな。";
			mes "この話は忘れてくれ。";
			close;
		}
		mes "[メロディージャック]";
		mes "そうか、手伝ってくれるか。";
		mes "助かる。";
		next;
		mes "[メロディージャック]";
		mes "ただ一点だけ、気をつけてほしい。";
		mes "私からの依頼についてだが、";
		mes "アイグには秘密だ。";
		mes "もし依頼内容を話したら";
		mes "お前の身がどうなるかは保証しない。";
		next;
		mes "[メロディージャック]";
		mes "それじゃ、準備ができたら";
		mes "話しかけてくれ。";
		close;
	}
OnTouch:
	emotion 0, "メロディージャック#1";
	mes "[メロディージャック]";
	mes "おい。";
	mes "そこのお前……。";
	mes "ちょっと私の所まで来てくれ。";
	close;
}
moc_para01.gat,17,77,5	script	アイグ#1	646,{/* 65437 */
	cutin "igu03.bmp", 255;
	{
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "こんにちは！";
		mes "何だかうれしい気分なの♪";
		mes "初めて舞台で歌った時みたいに、";
		mes "とても新鮮な感じなの！";
		next;
		switch(select("依頼を受ける","依頼を報告する","依頼を破棄する","話をする")) {
		case 1:
			if(BaseLevel >= 140) {
				cutin "igu02.bmp", 2;
				mes "[アイグ]";
				mes "ありがとうなの♪";
				mes "でも私の依頼は他の人にもう";
				mes "お願いしてしまったの。";
				mes "だから私以外で困っている人を";
				mes "助けてあげてほしいの。";
				next;
				cutin "igu02.bmp", 255;
				mes "‐^ff0000アイグの依頼は";
				mes "　BaseLv140以上では受けることが";
				mes "　できません^000000‐";
				close;
			}
		case 2:
			cutin "igu04.bmp", 2;
			mes "[アイグ]";
			mes "なの？";
			mes "完了している依頼は無いみたい。";
			mes "もう一度よく確認してみてほしいの。";
			close2;
			cutin "igu04.bmp", 255;
			end;
		case 3:
			cutin "igu01.bmp", 2;
			mes "[アイグ]";
			mes "依頼したお仕事を破棄するの？";
			mes "忙しかったの？";
			mes "ごめんね、ありがとうなの。";
			next;
			mes "[アイグ]";
			mes "破棄の方法は2種類あるの。";
			mes "好きな方を選んで。";
			next;
			switch(select("依頼の破棄","報告記録の破棄")) {
			case 1:
				cutin "igu04.bmp", 2;
				mes "[アイグ]";
				mes "なの？";
				mes "依頼したお仕事は無いみたい。";
				mes "もう一度よく確認してみてほしいの。";
				close2;
				cutin "igu04.bmp", 255;
				end;
			case 2:
				cutin "igu04.bmp", 2;
				mes "[アイグ]";
				mes "なの？";
				mes "完了している報告の記録は";
				mes "無いみたい。";
				mes "もう一度よく確認してみてほしいの。";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
		case 4:
			cutin "igu01.bmp", 2;
			mes "[アイグ]";
			mes "私が団長を務めるたんぽぽ楽団は";
			mes "世界のいろんな場所を巡りながら、";
			mes "人々に癒しの音楽を伝えるギルドなの♪";
			next;
			cutin "igu02.bmp", 2;
			mes "[アイグ]";
			mes "実際に私たちの歌は魔法ではないけど、";
			mes "人々の力になるのは確かなことなの。";
			mes "そして私たちもみんなから、";
			mes "言葉や笑顔で元気を貰っているの。";
			mes "私たちの歌はそうやって";
			mes "世界を巡っているの♪";
			close2;
			cutin "igu02.bmp", 255;
			end;
		}
	}
	if(checkquest(116508) == 0) {
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "こんにちは♪";
		mes "楽園団の冒険者は";
		mes "優しい人ばかりだと聞いたの。";
		mes "もし良かったら私のお願いを";
		mes "聞いてほしいのなの。";
		next;
		cutin "igu02.bmp", 2;
		mes "[アイグ]";
		mes "先ずは自己紹介なの。";
		mes "私は^FF0000たんぽぽ楽団^000000の団長を任されている";
		mes "^FF0000アイグ^000000なの♪";
		next;
		mes "[アイグ]";
		mes "私は長いライブツアーから";
		mes "今帰ってきたところなの。";
		mes "行った所が無いくらい";
		mes "いろんな場所で歌ってきたの♪";
		mes "旅をした後って";
		mes "誰かに話したくならない？";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "私は毎回そうなの。";
		mes "だから帰ったら真っ先に会って";
		mes "旅の話したかった人がいるんだけど、";
		mes "その人に会いに行ったら";
		mes "他の人に暫く前から行方が";
		mes "わからないって言われたの。";
		next;
		mes "[アイグ]";
		mes "だから……";
		mes "楽園団に頼みにきたの……。";
		mes "その人を探してくださいって。";
		mes "だけど……";
		next;
		mes "[アイグ]";
		mes "行方不明の人を探してくれる、";
		mes "担当者もいないし、人手も足りないし、";
		mes "みんな忙しいといわれて、";
		mes "全然相手にしてくれないの。";
		mes "だからといって待つのも嫌だし、";
		mes "直接依頼をする事にしたの！";
		next;
		mes "[アイグ]";
		mes "……ここまで話を聞いてくれたのも";
		mes "あなたが初めてなの。";
		mes "そうだ！";
		mes "迷惑を承知であなたに";
		mes "今回の依頼をお願いしたいの。";
		mes "お願いなの……！";
	}
	else {
		cutin "igu02.bmp", 2;
		mes "[アイグ]";
		mes "久しぶりなの♪";
		mes "元気そうでよかったの！";
		next;
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "それよりも大変なの！";
		mes "ニュオーズがまたどこかへ";
		mes "いなくなっちゃったの！";
		next;
		mes "[アイグ]";
		mes "楽園団にニュオーズを";
		mes "探してくれるように";
		mes "頼みにきたんだけど";
		mes "担当者も居なくて忙しいって";
		mes "断られちゃったの……。";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "だから……自分で直接、";
		mes "冒険者の人にお願いする事にしたの！";
		next;
		mes "[アイグ]";
		mes "あなたなら実力も十分だし安心なの！";
		mes "迷惑かもしれないけど、";
		mes "もし良かったら私のお願いを";
		mes "聞いてほしいの。";
		mes "お願いなの……。";
	}
	next;
	if(select("手伝う","手伝わない") == 2) {
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "なの……？";
		mes "ごめんなさい……。";
		mes "あなたにも都合があるの。";
		mes "話を聞いてくれて";
		mes "ありがとうなの……。";
		close2;
		cutin "igu05.bmp", 255;
		end;
	}
	cutin "igu03.bmp", 2;
	mes "[アイグ]";
	mes "よかった！　引き受けてくれて";
	mes "とっても嬉しいの！";
	mes "今の私にはあなたしか";
	mes "頼れる人が居ないの……。";
	next;
	cutin "igu02.bmp", 2;
	mes "[アイグ]";
	mes "依頼を受ける準備ができたら";
	mes "もう一度話しかけて欲しいの。";
	mes "依頼内容を整理して、";
	mes "詳しい話をするの。";
	close2;
	cutin "igu02.bmp", 255;
	end;
}
moc_para01.gat,41,76,3	script	ラギ#1	647,{/* 65438 */
	if(checkquest(116508) == 0) {
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "その髪は黄金蟲のように……";
		mes "ふむ、さすがに歌詞に";
		mes "蟲はあまり良くない気が";
		mes "しますねぇ。";
		mes "他に何かあるかな……。";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
	else {
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes strcharinfo(0) + "さん。";
		mes "今日も冒険に行かれる";
		mes "予定ですか？";
		next;
		cutin "ragi03.bmp", 2;
		mes "[ラギ]";
		mes "それにしても……";
		mes "一難去ってまた一難。";
		mes "そんな言葉がピッタリの";
		mes "展開になっていますねぇ。";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "とはいえ僕はロテルト様の";
		mes "言うことももっともだと";
		mes "思うんですよねぇ。";
		mes "いうなればモンスターの首に";
		mes "鈴を付けるようなものですし。";
		next;
		mes "[ラギ]";
		mes "ただ、アイグ様を見ていると";
		mes "僕個人としてはやはり、";
		mes "シャルロシーのことをなんとか";
		mes "出来ないものかと頭を";
		mes "悩ませてはいるのですが……";
		mes "成果は出ていません。";
		next;
		mes "[ラギ]";
		mes "とりあえずルナインさんの";
		mes "ワープポータルで何度もあの場所に";
		mes "通って、皆さんが納得できるような";
		mes "解答が見つかるまで頑張るしか";
		mes "ないようですねぇ……。";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
}

1@jtb.gat,25,28,5	script	ロテルト#01	630,{/* 61513 */
	switch(JTB_1QUE) {
	case 0:
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "あ？　お前が臨時のギルド員か。";
		mes "やる気があるのはいいが、";
		mes "俺の邪魔だけはするなよ。";
		close2;
		cutin "rote01.bmp", 255;
		end;
	case 1:
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "チッ！";
		mes "何なんだこのダンジョンは、";
		mes "悪霊でも住み着いていやがるのか？";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}
1@jtb.gat,31,28,4	script	アイグ#01	646,{/* 61514 */
	switch(JTB_1QUE) {
	case 1:
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "ニュオーズは相変わらずなの。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,23,26,5	script	ゲルカ#01	629,{/* 61515 */
	switch(JTB_1QUE) {
	case 0:
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "新人さんですか？";
		mes "よろしくお願いします！";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	case 1:
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "この邪悪な気……";
		mes "何なんでしょうか？";
		mes "邪悪なんですけど、";
		mes "悪意は感じないんです。";
		mes "不思議ですよね！";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}
1@jtb.gat,33,26,4	script	ラギ#01	647,{/* 61516 */
	switch(JTB_1QUE) {
	case 1:
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "不思議な体験をしましたねぇ。";
		mes "早速、今の気持ちを歌にしたく";
		mes "なってきましたよぉ。";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
}
1@jtb.gat,25,24,5	script	ミンミン#01	643,{/* 61517 */
	switch(JTB_1QUE) {
	case 0:
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "あなたが臨時のギルド員ね？";
		mes "よろしく。";
		close2;
		cutin "min01.bmp", 255;
		end;
	case 1:
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "こんな場所に平然と呼び出すなんて";
		mes "ニュオーズは相変わらずね……。";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
}
1@jtb.gat,31,24,4	script	アラン#01	644,{/* 61518 */
	switch(JTB_1QUE) {
	case 1:
		cutin "arang01.bmp", 2;
		mes "[アラン]";
		mes "ほ、本当に幽霊だったら";
		mes "どうしよう……。";
		mes "幽霊怖いな……。";
		close2;
		cutin "arang01.bmp", 255;
		end;
	}
}
1@jtb.gat,23,22,5	script	ルナイン#01	10039,{/* 61519 */
	switch(JTB_1QUE) {
	case 0:
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "あら、来たのね。";
		mes "短い間だけどよろしくね。";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	case 1:
		cutin "lunain01.bmp", 2;
		mes "[ルナイン]";
		mes "あ、あれが本物のニュオーズ様！";
		mes "やっと会えた……。";
		mes "ニュオーズ様に憧れて";
		mes "ギルドに入った甲斐があったわ。";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	}
}
1@jtb.gat,34,22,4	script	ロエル#01	10040,{/* 61520 */
	switch(JTB_1QUE) {
	case 1:
		cutin "roel03.bmp", 2;
		mes "[ロエル]";
		mes "ニュオーズ様……";
		mes "初めてお会いしましたが";
		mes "本当にロテルト様と";
		mes "仲が良いんですね！";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}
1@jtb.gat,28,21,5	script	メロディージャック#01	844,{/* 61521 */
	switch(JTB_1QUE) {
	case 0:
		mes "[メロディージャック]";
		mes "……面倒だな。";
		mes "隠れているのがわからないのか？";
		close;
	case 1:
		mes "[メロディージャック]";
		mes "さて、妙な輩がいるようだが";
		mes "私は私の仕事をするだけだ。";
		mes "奴との約束のためにな。";
		close;
	}
}
1@jtb.gat,28,30,5	script	ニュオーズ#01	625,{/* 61522 */
	switch(JTB_1QUE) {
	case 0:
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "ギルド条項8番に基づき、";
		mes "ギルドマスターはこの俺だ！";
		mes "今のお前はギルドメンバーの";
		mes "下っ端でしかない！";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "あ、そうなの？";
		mes "じゃあ、ロテが今は";
		mes "新マスターなんだね。";
		next;
		mes "[ニュオーズ]";
		mes "よろしくね、新マスター。";
		mes "初めましてのみんなも";
		mes "これからよろしくね～。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "お前……俺になにか言うことや、";
		mes "思うことはないのかよ!?";
		next;
		mes "[ロテルト]";
		mes "ギルドマスターのくせに連絡も寄こさず";
		mes "いきなり連絡してきたと思ったら";
		mes "面白い場所を見つけたから、";
		mes "みんなで来いだと!?";
		mes "ふざけるな!!";
		next;
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "ごめんごめん。";
		mes "流石に急すぎたかなと思ったんだけど";
		mes "ロテならきっと来てくれるって";
		mes "信じてたからね♪";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "……ニュオーズ。お、お前な……。";
		next;
		cutin "nines02.bmp", 2;
		mes "[ニュオーズ]";
		mes "ふふ、私は本当果報者だよ～！";
		mes "いつも私のことを心配してくれて";
		mes "ありがとうね、ロテルト♪";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "ち、違う!!";
		mes "俺は別にお前を心配で";
		mes "来たわけじゃない!!";
		mes "ミンミンや新人メンバーがだな……。";
		next;
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "あーら、私と新人のせいにするなとか";
		mes "野暮なことは言わないけど、";
		mes "どうせあいつはろくなものを";
		mes "食べてないはずだって言って、";
		mes "にくを大量に買っていたのは";
		mes "どこの誰かしらね。";
		next;
		cutin "nines02.bmp", 2;
		mes "[ニュオーズ]";
		mes "それは本当かい!?";
		mes "にくなんて、久しぶりだよ～！";
		next;
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "あら、私が嘘をついても";
		mes "仕方ないでしょ。";
		next;
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "師匠が大量のにくを1人で";
		mes "持ち帰ってきたので";
		mes "不思議だったんですよね～！";
		mes "ミンミンさんのお話を聞いて、";
		mes "納得しました！";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "ゲルカ！";
		mes "余計なことは言うな！";
		next;
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "ほら、これでわかったでしょ？";
		mes "ロテルトは本当にあんたのことを";
		mes "心配してるのよ。";
		next;
		mes "[ミンミン]";
		mes "旅に出るなとはいわないけど、";
		mes "ロテルトくらいには";
		mes "連絡してあげなさいよね。";
		next;
		mes "[ミンミン]";
		mes "あんたのことを心配する話を、";
		mes "毎日聞かされる";
		mes "こっちの身にもなってほしいわ。";
		next;
		cutin "arang01.bmp", 2;
		mes "[アラン]";
		mes "そうだよー！";
		mes "それにロテルト、心配しすぎて";
		mes "盜蟲つぶしたような顔になってて";
		mes "怖いんだよー？";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "アラン、お前まで";
		mes "そんなこというのかよ……。";
		next;
		mes "[ロテルト]";
		mes "はあ……俺の味方は";
		mes strcharinfo(0)+ "だけ";
		mes "のようだな……。";
		next;
		switch(select("ロテルトはツンデレなんですね","みなさん、仲が良いんですね。")) {
		case 1:
			cutin "rote01.bmp", 2;
			mes "[ロテルト]";
			mes "ツンデレ!?";
			next;
		}
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "あら、よくわかってるじゃない。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "違うよ～！";
		mes "ロテはテレ屋なだけだよ♪";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "お前らなぁ……。";
		next;
		cutin "arang01.bmp", 2;
		mes "[アラン]";
		mes "あまり怒るとしわが増えるよ？";
		mes "ロテルト。";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "クソッ！　今は分が悪い……。";
		mes "それでニュオーズ。";
		mes "この洞窟はなんなんだ!?";
		mes "ここに居るだけで妙に";
		mes "落ち着かない……。";
		next;
		mes "[ロテルト]";
		mes "誰かにずっと見られているみたいだ。";
		next;
		cutin "arang01.bmp", 2;
		mes "[アラン]";
		mes "他のみんなもこの洞窟の空気のせいで";
		mes "なんだか元気がないね……。";
		next;
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "そうね、この洞窟は普通じゃない。";
		mes "さっきも入り口に戻ろうとしたら、";
		mes "不思議な力でみんな";
		mes "バラバラにされたし。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "なんとかこうしてまた集まれたのが";
		mes "奇跡だな。";
		next;
		cutin "gelca03.bmp", 2;
		mes "[ゲルカ]";
		mes "私は、師匠がいるから平気ですけど！";
		next;
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "そうだね！";
		mes "でもそれだけじゃないんだよ！";
		mes "この洞窟には私たち以外に";
		mes "何かいるみたいなんだ。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "……おい、何かって何だ!?";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "あれ？";
		mes "ロテ、君には聞こえないかい？";
		mes "さっきから、何かが私を";
		mes "呼んでいるようなんだけど。";
		next;
		cutin "gelca02.bmp", 2;
		mes "[ゲルカ]";
		mes "……え、それってまさか。";
		next;
		cutin "arang02.bmp", 2;
		mes "[アラン]";
		mes "幽霊……？";
		next;
		cutin "arang01.bmp", 255;
		mes "[？？？]";
		mes "幽霊って……何？";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "な、なんだ!?";
		mes "頭に直接声が……。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "あ、ロテにも聞こえたんだね～。";
		mes "良かった良かった！";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "テメェェェェェッ！";
		mes "そういうことは早く言えっ！";
		next;
		cutin "nines04.bmp", 2;
		mes "[ニュオーズ]";
		mes "ロテ～……";
		mes "そんなに襟を掴むと苦しいよ～？";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "お前は一度ここで";
		mes "オーディンの奴にでも";
		mes "会っておくべきかもなっ!?";
		next;
		cutin "rote01.bmp", 255;
		mes "[？？？]";
		mes "……だめ。";
		misceffect 563,"";
		next;
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "……!!";
		mes "地震なの！　みんな気を付けて！";
		next;
		cutin "gelca04.bmp", 2;
		mes "[ゲルカ]";
		mes "師匠！　何か邪悪な気を感じます！";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "クソッ！　とにかく出口を探すぞ！";
		mes "ここは何かヤバイ感じがする！";
		mes "戦闘の準備は怠るなよ！";
		set JTB_1QUE,1;
		close2;
		cutin "rote01.bmp", 255;
		end;
	case 1:
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "さあ、冒険のはじまりだ！";
		mes "ワクワクするね！";
		close2;
		cutin "nines01.bmp", 255;
		end;
	}
}
1@jtb.gat,205,31,4	script	？？？#03	10041,{/* 61523 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "手、暖かい……。";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,200,28,5	script	アイグ#03	646,{/* 61524 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "この子、どこから来たんだろう？";
		mes "不思議な子だけど……";
		mes "まずは安全な所に";
		mes "連れて行ってあげるの！";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,203,28,4	script	ルナイン#03	10039,{/* 61525 (hide)*/
	switch(JTB_1QUE) {
	case 1:
		cutin "lunain01.bmp", 2;
		mes "[ルナイン]";
		mes "あら。あなたも無事だったのね。";
		mes "アイグー！";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "どうかしたの？　ルナイン。";
		next;
		cutin "lunain01.bmp", 2;
		mes "[ルナイン]";
		mes "ギルドメンバーの";
		mes strcharinfo(0) + "がいたわ。";
		next;
		cutin "igu03.bmp", 2;
		mes "[アイグ]";
		mes "よかったの！";
		mes "さっきの戦闘でみんなとはぐれて、";
		mes "心細かったの。";
		next;
		cutin "lunain03.bmp", 2;
		mes "[ルナイン]";
		mes "ニュオーズ様だったら";
		mes "最高だったんだけど、";
		mes "バカロエルじゃなくて良かったわ。";
		next;
		cutin "igu04.bmp", 2;
		mes "[アイグ]";
		mes "そういえば";
		mes "どうしてバカロエルなの？";
		next;
		cutin "lunain03.bmp", 2;
		mes "[ルナイン]";
		mes "バカだから。";
		next;
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "身も蓋もない言い方なの……。";
		next;
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "だってあいつ、モロクの現身(人間型)を";
		mes "生きた怪我人だと勘違いして";
		mes "助けようとして、襲われたのよ？";
		mes "バカ以外の何者でもないじゃない。";
		next;
		cutin "lunain03.bmp", 255;
		mes "[？？？]";
		mes "モロク……。";
		next;
		emotion 23, "ルナイン#03";
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes strcharinfo(0) + "、";
		mes "アイグ、";
		mes "なにか言った？";
		next;
		menu "何も言ってない",-;
		cutin "igu04.bmp", 2;
		mes "[アイグ]";
		mes "……え？";
		mes "私も何も言ってないけど……。";
		next;
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "!!";
		mes "ちょ……ちょっと、";
		mes "ルナイン！　後ろ！";
		next;
		cutin "lunain04.bmp", 2;
		emotion 23, "ルナイン#03";
		mes "[ルナイン]";
		mes "え？　きゃああああっ!?";
		mes "って、人間……!?";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "……。";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "びっくりしたの！";
		mes "ねえ、お嬢ちゃん。";
		mes "どこからここに来たの？";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "……知らない。";
		mes "……聞いた事ある言葉、聞こえた。";
		mes "……だから来ただけ。";
		next;
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "もしかして迷子なの？";
		next;
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "ちょっと、アイグ！";
		mes "どうやってこんな小さい子が、";
		mes "こんな次元の狭間までやってくるのよ！";
		next;
		cutin "lunain03.bmp", 255;
		mes "[" + strcharinfo(0) + "]";
		mes "ニュオーズの例もあるし……。";
		next;
		cutin "lunain01.bmp", 2;
		mes "[ルナイン]";
		mes "何いってるのよ。";
		mes "ニュオーズ様は特別だからに";
		mes "決まってるじゃない。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "ニュオーズ……歌う人。";
		next;
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "ニュオーズ様を知ってるの!?";
		mes "って、キャッ！";
		misceffect 563,"";
		next;
		cutin "lunain01.bmp", 255;
		mes "[" + strcharinfo(0) + "]";
		mes "とりあえず、みんなと合流しよう。";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes strcharinfo(0) + "の";
		mes "言う通りなの。";
		mes "でも、この子をここに";
		mes "置いて行くのも危険だし、";
		mes "一緒に連れていくの。";
		next;
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "そうね。他に誰も居ないみたいだし、";
		mes "ニュオーズ様を知ってるなら";
		mes "なおさら、放っておけないわ。";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "迷子になったら困るし、";
		mes "手をつないで行くの。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "……手……つなぐ？";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "あれ？　つないだことない？";
		mes "えっと、こうなの。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "……。";
		next;
		cutin "igu04.bmp", 2;
		mes "[アイグ]";
		mes "こんな場所にいたからかな？";
		mes "手が冷えてるの。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "……不思議な感じがする。";
		next;
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "ほら、温かくなってきた。";
		mes "ぽかぽかなの♪";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[？？？]";
		mes "……ぽかぽか。";
		mes "……なの。";
		next;
		cutin "lunain01.bmp", 2;
		mes "[ルナイン]";
		mes "^ff0000険しい道^000000と^ff0000なだらかな道^000000、";
		mes "道が2つあるわね。";
		next;
		cutin "igu04.bmp", 2;
		mes "[アイグ]";
		mes "うそー……。うーん……";
		mes "険しい道から凄い力を感じるの。";
		next;
		cutin "igu02.bmp", 2;
		mes "[アイグ]";
		mes "どっちに進むか、君たちの代表者と";
		mes "相談するから待ってて欲しいの。";
		set JTB_1QUE,2;
		close2;
		cutin "lunain01.bmp", 255;
		end;
	case 2:
		cutin "lunain01.bmp", 2;
		mes "[ルナイン]";
		mes "さ、道を決めたら";
		mes "さっさと進みましょ。";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
}
1@jtb.gat,289,118,3	script	？？？#08	10041,{/* 61536 (hide)*/
	switch(JTB_1QUE) {
	case 3:
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "感情……。";
		mes "どうすれば泣ける？";
		mes "……どうすれば笑える？";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,288,122,4	script	ラギ#08	647,{/* 61537 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "こんな時こそ";
		mes "歌を歌って元気をだしましょう。";
		close2;
		cutin "ragi02.bmp", 255;
		end;
	case 3:
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "シャルロシーもいつか";
		mes "自分の気持ちを上手に";
		mes "表現できると良いですねぇ。";
		close2;
		cutin "ragi02.bmp", 255;
		end;
	}
}
1@jtb.gat,283,121,5	script	ニュオーズ#08	625,{/* 61538 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "nines03.bmp", 2;
		emotion 2, "ニュオーズ#08";
		mes "[ニュオーズ]";
		mes "その温もりはいまだに遠く～";
		mes "触れることすらかなわない～";
		next;
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "さすがですねぇ、ニュオーズ様。";
		next;
		cutin "nines02.bmp", 2;
		emotion 15, "ニュオーズ#08";
		mes "[ニュオーズ]";
		mes "ありがとう、ラギ君！";
		mes "おや、" + strcharinfo(0) + "！";
		mes "君もいたんだね～！";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "ん？　かわいい子を連れているね！";
		mes "その子は誰かな？";
		next;
		menu "迷子みたいなんです",-;
		mes "[ニュオーズ]";
		mes "それはいけないね。";
		mes "出口まで一緒に行こうか。";
		mes "お嬢ちゃん、";
		mes "お名前はなんていうのかな？";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "…………シャルロシー。";
		next;
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "シャルロシーか！";
		mes "私はニュオーズ。彼はラギ君だよ。";
		mes "よろしくね、シャルロシー。";
		mes "出口までみんなで一緒に行こうね。";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "よろしくお願いしますね、";
		mes "シャルロシー。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "ところで他のみんなは";
		mes "一緒じゃないのかい？";
		next;
		menu "アイグとルナインとはぐれた",-;
		mes "[ニュオーズ]";
		mes "なるほど。";
		mes "じゃあ二人も探さないとだね。";
		next;
		mes "[ニュオーズ]";
		mes "なんだかここは不思議な力で";
		mes "すぐ一緒にいたメンバーが";
		mes "居なくなっちゃうんだよね。";
		mes "せっかく会えたんだ。";
		mes "はぐれないようにしないとね。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……歌で思い出した。";
		next;
		mes "[シャルロシー]";
		mes "……暗闇で聞こえたあの声……。";
		next;
		menu "声？",-;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……真っ暗な所で何か聞こえた。";
		next;
		mes "[シャルロシー]";
		mes "……歌だった。";
		next;
		mes "[シャルロシー]";
		mes "……ニュオーズが歌ってた。";
		next;
		mes "[シャルロシー]";
		mes "……音楽に乗って";
		mes "……知らない言葉いっぱい";
		mes "……流れてきた。";
		next;
		mes "[シャルロシー]";
		mes "……その中の友達っていう言葉、";
		mes "……友達と過ごす日々、";
		mes "……すごく気に入った。";
		next;
		mes "[シャルロシー]";
		mes "……私も友達と一緒に";
		mes "……歌いたいと思った。";
		mes "……だから、お願いした。";
		next;
		mes "[シャルロシー]";
		mes "……友達をくださいって。";
		next;
		mes "[シャルロシー]";
		mes "……そしたら、";
		mes "……アイグとルナインがいた。";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "なるほど。";
		mes "もしかしたらそれは音楽の神様が、";
		mes "願いを叶えてくれたのかも";
		mes "しれませんねぇ。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "そうかもしれないね。";
		mes "音楽の神様には、";
		mes "願いや想いを届けてくれたり";
		mes "叶えてくれたりする";
		mes "不思議な力があるのかもしれないね。";
		next;
		mes "[ニュオーズ]";
		mes "そういえばさっきの歌も、";
		mes "依頼主の想い人の誕生石の";
		mes "真珠をイメージした曲で、";
		mes "彼の想いが伝わるようにって";
		mes "作ったんだ。";
		next;
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "この曲を贈る人にも";
		mes "想いが伝わるといいなぁ。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……真珠ってなに？";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "シャルロシー、これですよぉ。";
		next;
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "他にも「人魚の涙」や";
		mes "「月のしずく」「天の露」などとも";
		mes "呼ばれてますねぇ。";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[シャルロシー]";
		mes "……きれい。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "人魚も涙を流すのかな？";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "どうなんでしょうか。";
		mes "人魚もですが、僕としては";
		mes "魔族やモンスターも泣くのか";
		mes "気になりますねぇ。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……魔族やモンスターは泣かない？";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "事実は不明ですが、少なくとも僕は";
		mes "魔族やモンスターが泣いたという話を";
		mes "聞いたことはないですねぇ。";
		next;
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "涙を流すということは";
		mes "感情があるという証拠だろうし、";
		mes "そんな魔族やモンスターがいるなら、";
		mes "私はすぐに友達になれそうだよ♪";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "そんな魔族やモンスターなら、";
		mes "一緒に歌を歌えたら";
		mes "楽しいでしょうねぇ。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……どうしたら涙、流せる？";
		next;
		cutin "ragi03.bmp", 2;
		mes "[ラギ]";
		mes "おや、シャルロシーは";
		mes "泣いたことがないのですか？";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……多分ない。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "シャルロシー。涙は泣こうとして";
		mes "流すものじゃないんだよ～。";
		mes "そうして流した涙には";
		mes "意味がないからね。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……しゅん。";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "シャルロシーは";
		mes "涙を流してみたいんですねぇ。";
		next;
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "そうだ、";
		mes "シャルロシーこれをどうぞ。";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[シャルロシー]";
		mes "……真珠。";
		next;
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "シャルロシーが";
		mes "いつか涙を流せる時まで、";
		mes "それが涙のかわりって事にしましょう。";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[シャルロシー]";
		mes "……わかった。";
		next;
		cutin "nines02.bmp", 2;
		mes "[ニュオーズ]";
		mes "さすがだね、ラギ君！";
		mes "ラギ君なら";
		mes "素晴らしいクラウンやミンストレルに";
		mes "なれると思うよ～！";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "ありがとうございます。";
		mes "でも僕は、まだしばらく";
		mes "バードのままでいたいんですよねぇ。";
		next;
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "はは、バードでも歌えるもんね！";
		mes "職業はあまり関係ないか♪";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[シャルロシー]";
		mes "……私も一緒に歌いたい。";
		next;
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "そうだね♪";
		mes "今度シャルロシーにも";
		mes "歌い方を教えてあげようね！";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "その時はみんなで歌いましょう。";
		mes "もちろん、";
		mes strcharinfo(0)+ "さんも";
		mes "一緒にですよぉ。";
		set JTB_1QUE,3;
		close2;
		cutin "ragi01.bmp", 255;
		end;
	case 3:
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes "いつか、シャルロシーとも";
		mes "歌ってみたいね。";
		mes "きっと楽しいよ。";
		close2;
		cutin "nines03.bmp", 255;
		end;
	}
}
1@jtb.gat,34,193,5	script	ロエル#10	10040,{/* 61539 (hide)*/}
1@jtb.gat,40,198,3	script	ルナイン#10	10039,{/* 61540 (hide)*/}
1@jtb.gat,38,197,4	script	シャルロシー#10	10041,{/* 61541 (hide)*/
	switch(JTB_1QUE) {
	case 3:
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "はぐれないように手……つなぐ。";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 4:
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "他人が考えていること";
		mes "聞こえない？";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,31,194,5	script	ロテルト#10	630,{/* 61542 (hide)*/}
1@jtb.gat,36,191,5	script	ゲルカ#10	629,{/* 61543 (hide)*/}
1@jtb.gat,38,191,4	script	ミンミン#10	643,{/* 61544 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "あのガキ……";
		mes "やっぱり怪しいわね……。";
		mes "研究材料にしてやろうかしら。";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
}
1@jtb.gat,40,193,4	script	アラン#10	644,{/* 61545 (hide)*/}
1@jtb.gat,34,198,5	script	ニュオーズ#10	625,{/* 61546 (hide)*/
	switch(JTB_1QUE) {
	case 3:
		cutin "nines03.bmp", 2;
		mes "[ニュオーズ]";
		mes strcharinfo(0) + "！";
		mes "シャルロシー！　良かった！";
		mes "無事だったんだね～！";
		mes "今の戦闘でラギ君とは";
		mes "はぐれてしまったよ……。";
		next;
		switch(select("このまま会話を続ける","他のメンバーを探す")) {
		case 1:
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "……ニュオーズ、";
			mes "安心したらお腹すいたの？";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "えっ!?　私そんなこと言った？";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "……聞こえた。";
			mes strcharinfo(0) + "には";
			mes "聞こえなかった？";
			next;
			menu "聞こえなかった",-;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "……。";
			next;
			mes "[ニュオーズ]";
			mes "……もしかしてシャルロシーには";
			mes "人の心の声が聞こえるの？";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "……聞こえる。";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……？";
			mes "どうして怖がってるの？";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "とりあえずシャルロシーが";
			mes "人の心を読めることは";
			mes "一旦みんなには内緒にして……";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……残念ね、聞こえてるわよって";
			mes "ミンミンが言ってる。";
			next;
			cutin "nines04.bmp", 2;
			mes "[ニュオーズ]";
			mes "ミンミン!?";
			mes "い、いつのまにそこにいたんだい!?";
			next;
			cutin "min02.bmp", 2;
			mes "[ミンミン]";
			mes "さっきから居たわよ。";
			mes "とりあえずいつかバレるんだし、";
			mes "ちゃんと説明しなさい。";
			mes "あっちに何人かいるから。";
			next;
			cutin "min02.bmp", 255;
			mes "‐結局、シャルロシーが";
			mes "　心の声を口に出さないと約束し、";
			mes "　この話は一旦、終わることになった‐";
			next;
			mes "‐人の心が読めるシャルロシーは";
			mes "　人間ではないのだろうか……‐";
			set JTB_1QUE,4;
			close2;
			cutin "nines01.bmp", 255;
			end;
		case 2:
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "ん？　あっちから声がするよ！";
			mes "誰かこっちに向かってきてる！";
			next;
			cutin "arang01.bmp", 2;
			mes "[アラン]";
			mes "おーい！　やっぱりニュオーズ達だ！";
			mes "みんな～ニュオーズ達がいたよー！";
			mes strcharinfo(0) + "と";
			mes "シャルロシーも一緒だよ！";
			next;
			cutin "lunain01.bmp", 2;
			mes "[ルナイン]";
			mes "シャルロシー！　ニュオーズ様や";
			mes strcharinfo(0) + "と";
			mes "一緒だったのね。よかったわ。";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "みんな無事だったかい？";
			next;
			cutin "arang01.bmp", 2;
			mes "[アラン]";
			mes "大丈夫。みんなケガとかしてないよ！";
			mes "でもモンスターがいっぱいいて";
			mes "大変だったんだから！";
			next;
			cutin "nines02.bmp", 2;
			mes "[ニュオーズ]";
			mes "ヒーローは最後に";
			mes "現れるものだよ、アラン！";
			mes "私のようにね！";
			next;
			cutin "lunain01.bmp", 2;
			mes "[ルナイン]";
			mes "そこまで計算してたなんて、";
			mes "さすがニュオーズ様!!";
			next;
			cutin "min01.bmp", 2;
			mes "[ミンミン]";
			mes "その割には間に合ってないけどね。";
			next;
			cutin "rote01.bmp", 2;
			mes "[ロテルト]";
			mes "こいつがヒーローだと、";
			mes "俺はどうなるんだ!?";
			next;
			cutin "gelca01.bmp", 2;
			mes "[ゲルカ]";
			mes "師匠は……。";
			next;
			cutin "arang02.bmp", 2;
			mes "[アラン]";
			mes "闇落ちしたヒーローのライバル!!";
			mes "とか！";
			next;
			cutin "roel03.bmp", 2;
			mes "[ロエル]";
			mes "すごく似合いそうです!!";
			next;
			cutin "min02.bmp", 2;
			mes "[ミンミン]";
			mes "そんないい役、";
			mes "ロテルトには勿体無いわよ。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "……ロテが、ライバルには";
			mes strcharinfo(0) + "が";
			mes "いいかもって。";
			next;
			cutin "rote01.bmp", 2;
			mes "[ロテルト]";
			mes "なっ!?";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "……ミンミンは女幹部？";
			next;
			cutin "gelca04.bmp", 2;
			emotion 23, "ゲルカ#10";
			mes "[ゲルカ]";
			mes "わわわわ、私じゃないですよ!?";
			mes "私そんなこと言ってませんからっ！";
			mes "……って、あれ？";
			next;
			cutin "min02.bmp", 2;
			mes "[ミンミン]";
			mes "ちょっと待ちなさいよ!?";
			mes "この子、もしかして……。";
			next;
			cutin "shaloshi02.bmp", 2;
			emotion 23, "ルナイン#10";
			mes "[シャルロシー]";
			mes "……やだ、私が";
			mes "いつもニュ……（もごもご）";
			next;
			cutin "lunain04.bmp", 2;
			emotion 19, "ルナイン#10";
			mes "[ルナイン]";
			mes "シ、シャルロシー!!";
			mes "あなたもしかして";
			mes "みんなの考えていることがわかるの!?";
			next;
			cutin "roel03.bmp", 2;
			mes "[ロエル]";
			mes "ルナインさん……";
			mes "とりあえずその塞いでる手を外さないと";
			mes "話せないと思います……。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "ぷはー。";
			mes "……聞こえる。";
			mes "……心の声、みんなには聞こえない？";
			next;
			cutin "arang01.bmp", 2;
			mes "[アラン]";
			mes "私は聞こえたことないよ……。";
			next;
			cutin "rote03.bmp", 2;
			mes "[ロテルト]";
			mes "……こいつやっぱりここで……";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……ニュオーズ、";
			mes "みんなどうして怖がってるの？";
			next;
			mes "[シャルロシー]";
			mes "……心の声、聞こえちゃいけないの？";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "シャルロシー。";
			mes "一つ私やみんなと約束しよう。";
			next;
			mes "[ニュオーズ]";
			mes "心の声が聞こえるのが";
			mes "良いか悪いか、私には決められない。";
			next;
			mes "[ニュオーズ]";
			mes "だけど、みんな心の中で";
			mes "秘密に思ってる事や";
			mes "悩んでることがあるかもしれない。";
			next;
			mes "[ニュオーズ]";
			mes "心の中っていうのは";
			mes "そういうものなんだよ。";
			mes "だからみんなの声が聞こえても、";
			mes "口に出しちゃいけないよ。";
			next;
			cutin "nines03.bmp", 2;
			mes "[ニュオーズ]";
			mes "心の中のナイショがバレちゃうと、";
			mes "みんなが困ったり、びっくりしたり、";
			mes "悲しくなっちゃうかもしれないからね。";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……うん。";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……みんな、ごめんなさい。";
			next;
			cutin "nines03.bmp", 2;
			mes "[ニュオーズ]";
			mes "いい子だね、シャルロシー。";
			next;
			cutin "rote01.bmp", 2;
			mes "[ロテルト]";
			mes "おい、ニュオーズ……";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "ロテ。……後でね。";
			next;
			cutin "rote03.bmp", 2;
			mes "[ロテルト]";
			mes "……チッ。勝手にしろ!!";
			next;
			cutin "min02.bmp", 2;
			mes "[ミンミン]";
			mes "バカバカしい。";
			mes "大体、頭の中読まれて困るのは";
			mes "ロテルトぐらいでしょ。";
			next;
			cutin "min01.bmp", 2;
			mes "[ミンミン]";
			mes "それより早くここから出て、";
			mes "お風呂に入る事の方が大事だわ。";
			next;
			cutin "gelca01.bmp", 2;
			mes "[ゲルカ]";
			mes "そうですね……それに本じゃ、";
			mes "そういう力がある方が";
			mes "大変なこと多いですし……。";
			next;
			cutin "arang03.bmp", 2;
			mes "[アラン]";
			mes "よく考えたら、私も";
			mes "読まれても困ることなんて";
			mes "考えたことないかも!!";
			next;
			cutin "lunain04.bmp", 2;
			mes "[ルナイン]";
			mes "……わ、私も読まれて困る事なんて";
			mes "な、ないんだから……。";
			next;
			cutin "roel03.bmp", 2;
			mes "[ロエル]";
			mes "（こっそり僕が";
			mes "ルナインさんの言動に萌えてるの、";
			mes "バレちゃう……!?）";
			next;
			cutin "rote03.bmp", 2;
			mes "[ロテルト]";
			mes "（心が読めるということは";
			mes "こいつ、人間じゃない……のか？）";
			set JTB_1QUE,4;
			close2;
			cutin "nines01.bmp", 255;
			end;
		}
	case 4:
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "ロテは気付いたのかな。";
		mes "シャルロシーの……。";
		close2;
		cutin "nines01.bmp", 255;
		end;
	}
}
1@jtb.gat,110,196,5	script	ロエル#11	10040,{/* 61547 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "roel02.bmp", 2;
		mes "[ロエル]";
		mes "僕は大丈夫です。";
		mes "シャルロシーを守れましたから。";
		mes "誰かを守る事ができて誇らしいです。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 5:
		cutin "roel02.bmp", 2;
		mes "[ロエル]";
		mes "モンスターと友達……。";
		mes "人間がみんなシャルロシーみたいに";
		mes "モンスターと友達になれるなら、";
		mes "モンスターと人間が共存する";
		mes "平和な世の中になるんでしょうね。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,108,198,5	script	シャルロシー#11	10041,{/* 61548 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "みんな怪我してる……。";
		mes "大丈夫？　治る？";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 5:
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "ペルは友達じゃない……。";
		mes "私の友達は……誰？";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,112,196,3	script	ルナイン#11	10039,{/* 61549 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "lunain04.bmp", 2;
		mes "[ルナイン]";
		mes "何よ、今の大きなモンスター……。";
		mes "今までいっぱい居た小さいのとは";
		mes "段違いの強さだったわ……。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "ロエル。ルナイン。怪我してる。";
		mes "大丈夫？";
		next;
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "私は平気よ。";
		mes "ちょっとロエル！";
		mes "あんた怪我してるじゃない!!";
		mes "こっち来なさい!!";
		next;
		cutin "roel04.bmp", 2;
		mes "[ロエル]";
		mes "ぼ、僕は大丈夫です。";
		mes "このくらい大したこと……。";
		next;
		cutin "lunain04.bmp", 2;
		mes "[ルナイン]";
		mes "いいから来なさい!!";
		next;
		switch(select("シャルロシーの様子を見る","ロエルの様子を見る")) {
		case 1:
			misceffect 313, "ロエル#11";
			cutin "lunain04.bmp", 255;
			mes "‐ヒールされているロエルを見て";
			mes "　シャルロシーは悲しげに口を開く‐";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……ペル、前は暴れなかったのに。";
			next;
			menu "ペルってモンスターの名前？",-;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "ペルペル鳴くから「ペル」。";
			mes "噛んだり、暴れたりしなかった。";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "だから友達になった。";
			mes "でも……。";
			next;
			cutin "lunain04.bmp", 2;
			mes "[ルナイン]";
			mes "モンスターと友達に!?";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……変？";
			next;
			cutin "lunain04.bmp", 2;
			mes "[ルナイン]";
			mes "シャルロシーはわかってない";
			mes "みたいだから言うけど。";
			next;
			mes "[ルナイン]";
			mes "モンスターとは友達になれない。";
			mes "あいつらは私達にとって敵よ。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "……敵？";
			next;
			mes "[シャルロシー]";
			mes "敵って何？";
			next;
			cutin "roel01.bmp", 2;
			mes "[ロエル]";
			mes "僕達に害をなす相手……でしょうか。";
			next;
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "簡単にいうと、";
			mes "私達に痛いことをしたり";
			mes "困らせたりする相手。";
			next;
			mes "[ルナイン]";
			mes "モンスターとは友達になれない。";
			mes "あいつらは私達にとって敵よ。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "でもペルは、私に痛いことや";
			mes "困ることをしたことない。";
			next;
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "今まではそうだった";
			mes "かもしれないけど、";
			mes "今は違うでしょ？";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "今は……。";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……。";
			next;
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "さ、次は";
			mes strcharinfo(0) + "の番よ。";
			mes "そこに座りなさい。";
			next;
			cutin "lunain01.bmp", 255;
			mes "‐シャルロシーは何か";
			mes "　考え込んでいるようだ‐";
			next;
			mes "‐声をかけようとしたが";
			mes "　ルナインに捕まってしまったので";
			mes "　話すのは難しそうだ‐";
			set JTB_1QUE,5;
			close2;
			cutin "lunain02.bmp", 255;
			end;
		case 2:
			misceffect 313, "ロエル#11";
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "まったく……先陣きって、";
			mes "モンスターにつっこみすぎ!!";
			next;
			cutin "roel04.bmp", 2;
			mes "[ロエル]";
			mes "す、すいません!!";
			mes "皆さんの役に立てるのが";
			mes "嬉しくてつい……。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "ルナイン。";
			mes "文句言いながら治療してる。";
			next;
			cutin "roel02.bmp", 2;
			mes "[ロエル]";
			mes "優しいですよね、";
			mes "ルナインさん!!";
			next;
			cutin "lunain04.bmp", 2;
			mes "[ルナイン]";
			mes "か、勘違いしないでよね!!";
			mes "子供1人の世話も";
			mes "できないのかって、";
			mes "ニュオーズ様に";
			mes "思われたくないだけよ!!";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "顔が赤い。";
			next;
			cutin "lunain04.bmp", 2;
			mes "[ルナイン]";
			mes "う、うるさいわね！";
			mes "……ちょ、ちょっとこの洞窟が";
			mes "暑いだけよ!!";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "ペルは、ここは洞窟じゃないって";
			mes "言ってた。";
			next;
			menu "ペル？",-;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "ルナインとアイグに会う前に、";
			mes "いっぱいいた。";
			next;
			cutin "roel02.bmp", 2;
			mes "[ロエル]";
			mes "ペルさんですか。";
			mes "僕はまだお会いしたことが";
			mes "ない気がしますね。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "名前はないっていうから、";
			mes "私がつけた。";
			next;
			mes "[シャルロシー]";
			mes "ペルペル鳴くから「ペル」。";
			next;
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "もしかしてあの小さいモンスター？";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "ペルペル鳴くだけ。";
			mes "噛んだり、暴れたりしなかった。";
			next;
			mes "[シャルロシー]";
			mes "だから友達になった。";
			mes "でも……。";
			next;
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "シャルロシーはわかってない";
			mes "みたいだから言うけど。";
			next;
			mes "[ルナイン]";
			mes "モンスターとは友達になれない。";
			mes "あいつらは私達にとって敵よ。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "……敵？";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "敵って何？";
			next;
			cutin "roel01.bmp", 2;
			mes "[ロエル]";
			mes "僕達に害をなす相手……でしょうか。";
			next;
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "簡単にいうと、";
			mes "私達に痛いことをしたり";
			mes "困らせたりする相手。";
			next;
			mes "[ルナイン]";
			mes "モンスターと平和的にお話しで";
			mes "問題を解決なんて無理。";
			mes "だから戦うしかないのよ。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "でもペルは、私に痛いことや";
			mes "困ることをしたことない。";
			next;
			cutin "lunain02.bmp", 2;
			mes "[ルナイン]";
			mes "今まではそうだった";
			mes "かもしれないけど、";
			mes "今は違うでしょ？";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "今は……。";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……。";
			next;
			cutin "roel02.bmp", 2;
			mes "[ロエル]";
			mes "そ、そうだ！";
			next;
			cutin "roel03.bmp", 2;
			mes "[ロエル]";
			mes "……ぺ、ペルペルペルペル!!";
			next;
			menu "ロエル!?",-;
			cutin "lunain04.bmp", 2;
			mes "[ルナイン]";
			mes "ちょ……なにやってるのよ!?";
			next;
			cutin "roel01.bmp", 2;
			mes "[ロエル]";
			mes "え……いや……";
			mes "僕がペルのかわりに";
			mes "シャルロシーさんのお友達にと……。";
			next;
			cutin "lunain01.bmp", 2;
			mes "[ルナイン]";
			mes "ふーん？";
			mes "ってことは……";
			mes "倒すしかないわね。";
			next;
			misceffect 85, "ロエル#11";
			cutin "roel03.bmp", 2;
			mes "[ロエル]";
			mes "ペ……ペルー!?";
			next;
			cutin "lunain03.bmp", 2;
			mes "[ルナイン]";
			mes "冗談よ。";
			next;
			cutin "lunain01.bmp", 2;
			mes "[ルナイン]";
			mes "さ、次は";
			mes strcharinfo(0) + "の番よ。";
			mes "そこに座りなさい。";
			next;
			cutin "lunain03.bmp", 255;
			mes "‐シャルロシーは何か";
			mes "　考え込んでいるようだ‐";
			next;
			mes "‐とりあえず今はそっと";
			mes "　しておいた方がいいだろう‐";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "ペルは友達じゃない……";
			mes "でも……。";
			set JTB_1QUE,5;
			close2;
			cutin "lunain02.bmp", 255;
			end;
		}
	case 5:
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "モンスターをペットにする人もいるけど";
		mes "あれは例外ね。";
		mes "やっぱりモンスターは危険で";
		mes "友達にはなれないのよ。";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	}
}
1@jtb.gat,192,205,5	script	アイグ#12	646,{/* 61550 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "igu01.bmp", 2;
		mes "[アイグ]";
		mes "シャルロシー、やっと会えたの！";
		mes "無事で良かったの！";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "シャルロシーを放ってなんて";
		mes "おけないの！";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,201,203,4	script	アラン#12	644,{/* 61551 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "arang01.bmp", 2;
		mes "[アラン]";
		mes "ようやくみんなと合流できたよ。";
		mes "でも、シャルロシーが";
		mes "少し元気なさそう……。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "arang01.bmp", 2;
		mes "[アラン]";
		mes "そんな……";
		mes "せっかく友達になれそうだと";
		mes "思ってたのに……。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,191,204,5	script	ラギ#12	647,{/* 61552 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "みなさんとも合流できましたし";
		mes "そろそろクライマックスですかねぇ。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "彼女は別れ際に一体";
		mes "何を想ったんでしょうねぇ。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,192,202,5	script	ルナイン#12	10039,{/* 61553 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,191,200,5	script	ロエル#12	10040,{/* 61554 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
		cutin "roel01.bmp", 2;
		mes "[ロエル]";
		mes "普段は何だかんだ言っても";
		mes "ロテルト様とニュオーズ様は";
		mes "やっぱり親友なんですね！";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,199,200,4	script	ミンミン#12	643,{/* 61555 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "min02.bmp", 2;
		mes "[ミンミン]";
		mes "あいつの手紙に乗せられて";
		mes "ホイホイこんな所まで来て、";
		mes "私も結構お人好しよね。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "min02.bmp", 2;
		mes "[ミンミン]";
		mes "背格好ばかり大人になって";
		mes "ロテルトもまだまだ子供ね。";
		mes "ニュオーズの事になると";
		mes "すぐに感情的に動くんだもの。";
		next;
		mes "[ミンミン]";
		mes "何てね、これじゃあ私が";
		mes "年寄りみたいじゃない……。";
		mes "私はまだまだ若いんだから";
		mes "勘違いしちゃダメよ、";
		mes strcharinfo(0) + "。";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,195,206,4	script	ニュオーズ#12	625,{/* 61556 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,199,204,4	script	ゲルカ#12	629,{/* 61557 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "さっきから起こる地震って";
		mes "何かのきっかけで";
		mes "起こっているような";
		mes "気がしませんか？";
		next;
		mes "[ゲルカ]";
		mes "地震が起こる度に";
		mes "まるで人の気持ちみたいに";
		mes "雰囲気が変わったり、";
		mes "空間が不安定になってる";
		mes "気がするんです。";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	case 6:
		cutin "gelca01.bmp", 2;
		mes "[ゲルカ]";
		mes "確かにこのまま進むのは";
		mes "危険かも知れませんが";
		mes "私は師匠を信じます！";
		next;
		cutin "gelca03.bmp", 2;
		mes "[ゲルカ]";
		mes "だって、私の師匠なんですから！";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}
1@jtb.gat,189,203,5	script	メロディージャック#12	844,{/* 61558 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,194,200,5	script	ペル#12a	10047,{/* 61559 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,196,200,5	script	ペル#12b	10047,{/* 61560 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,195,200,5	script	シャルロシー#12	10041,{/* 61561 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,198,206,4	script	ロテルト#12	630,{/* 61562 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "……おい、みんな待て！";
		mes "何か変だぞ！";
		next;
		cutin "nines01.bmp", 2;
		misceffect 563,"";
		mes "[ニュオーズ]";
		mes "わっ！　また地震!?";
		next;
		cutin "nines01.bmp", 255;
		mes "[メロディージャック]";
		mes "……まずいな。";
		next;
		mes "[メロディージャック]";
		mes "空間の崩壊が始まっているようだ。";
		next;
		switch(select("簡単に現状を知りたい","詳細に現状を知りたい")) {
		case 1:
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "ペルが……怒ってる。";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "この空間とペルは何か";
			mes "関係があるのかい？";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "ペルは……私を守るために、";
			mes "みんなを攻撃したの。";
			next;
			cutin "rote01.bmp", 2;
			mes "[ロテルト]";
			mes "……どういうことだ!?";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "……それは……。";
			next;
			emotion 0, "シャルロシー#12";
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "ペル……？";
			next;
			emotion 6, "ペル#12b";
			mes "[ペル]";
			mes "ペルペルペル!!";
			next;
			cutin "gelca01.bmp", 2;
			mes "[ゲルカ]";
			mes "何か言ってるみたいですね……。";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "うん……。";
			mes "わかった……。";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "シャルロシー？";
			mes "ペルは何て言っているんだい？";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "ニュオーズ……。";
			mes "みんな……。";
			next;
			cutin "igu05.bmp", 2;
			mes "[アイグ]";
			mes "どうしたの？";
			mes "すごく悲しそうな顔してるの……。";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[シャルロシー]";
			mes "ごめんなさい……";
			mes "ばいばい……。";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "シャルロシー！";
			next;
			cutin "roel01.bmp", 2;
			mes "[ロエル]";
			mes "あのモンスターも居ません！";
			next;
			cutin "arang01.bmp", 2;
			mes "[アラン]";
			mes "うわっ、地震!?";
			misceffect 563,"";
			next;
			cutin "min02.bmp", 2;
			mes "[ミンミン]";
			mes "洞窟の様子がおかしいわ!!";
			mes "早くここから出るわよ!!";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "…………。";
			next;
			mes "[ニュオーズ]";
			mes "……ロテ、ミンミン、ジャック。";
			mes "みんなをお願いするね。";
			next;
			cutin "rote01.bmp", 2;
			mes "[ロテルト]";
			mes "おい、お前まさか……!!";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "あの子に約束したから。";
			mes "歌の歌い方を教えてあげるって。";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "だから、あの子を迎えにいってくるね。";
			next;
			cutin "lunain04.bmp", 2;
			mes "[ルナイン]";
			mes "ニュオーズ様!!";
			next;
			cutin "rote03.bmp", 2;
			mes "[ロテルト]";
			mes "……あのバカッ!!";
			mes "お前ら!!　ニュオーズを追うぞ!!";
			next;
			cutin "rote03.bmp", 2;
			mes "[ロテルト]";
			mes "全員、気を引き締めろ！";
			mes "油断するんじゃねえぞ!!";
			set JTB_1QUE,6;
			close2;
			cutin "rote03.bmp", 255;
			end;
		}
	case 6:
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "ニュオーズの野郎……";
		mes "いつも勝手な事ばかり";
		mes "しやがって……。";
		close2;
		cutin "rote03.bmp", 255;
		end;
	}
}
1@jtb.gat,318,358,5	script	ニュオーズ#21	625,{/* 61563 */
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "あれ……";
	mes strcharinfo(0) + "!?";
	next;
	menu "経緯を話す",-;
	mes "[ニュオーズ]";
	mes "なるほど。みんな私を追って";
	mes "ここに向かってくれているんだね。";
	mes "やはり持つべきものは";
	mes "ギルドメンバーだね！";
	next;
	mes "[ニュオーズ]";
	mes "では私たちは先に";
	mes "シャルロシーを探そう。";
	mes "何が起きるかわからないから、";
	mes "戦闘準備だけは忘れずにね。";
	next;
	mes "[ニュオーズ]";
	mes "さあいこう！";
	close2;
	cutin "nines01.bmp", 255;
	end;
}
1@jtb.gat,324,327,4	script	ペル#22	10047,{/* 61564 */
	mes "[ペル]";
	mes "ペル！　ペル！";
	close;
}
1@jtb.gat,324,327,4	script	ペル#23	10048,{/* 61565 (hide)*/
	mes "[ペル]";
	mes "ペル！　ペル！";
	close;
}
1@jtb.gat,326,329,4	script	シャルロシー#22	10041,{/* 61566 */
	cutin "shaloshi03.bmp", 2;
	mes "[シャルロシー]";
	mes "どうして……。";
	close2;
	cutin "shaloshi03.bmp", 255;
	end;
}
1@jtb.gat,320,323,5	script	ニュオーズ#22	625,{/* 61567 */
	cutin "nines04.bmp", 2;
	mes "[ニュオーズ]";
	mes "はあ、はあ……";
	mes "あっ、あそこにいるのは……！";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[シャルロシー]";
	mes "ペル、いいこいいこ。";
	mes "頭をなでると安心するんだって。";
	mes "ニュオーズが教えてくれた。";
	next;
	cutin "shaloshi02.bmp", 255;
	mes "[ペル]";
	mes "ペルー。";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[シャルロシー]";
	mes "ペルもしたいの？";
	mes "ありがとう。でも、";
	mes "ペルは私より小さいから無理だよ。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "そうそう。";
	mes "シャルロシーの頭を撫でるのは、";
	mes "私達の特権だからね。";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "ニュオーズ……";
	mes strcharinfo(0) + "……";
	mes "どうして……。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "シャルロシー、";
	mes "君とちゃんと話がしたくてね。";
	next;
	mes "[ニュオーズ]";
	mes "他のみんなもこっちに";
	mes "向かってるみたいなんだけど、";
	mes "まだ迷ってるのかな？";
	mes "ここは迷いやすいみたいだからね。";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "迷いやすい……";
	mes "みんなが来れないのは";
	mes "私のせいかもしれない。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "シャルロシー。";
	mes "私のせいかもって、どういう……";
	next;
	cutin "nines01.bmp", 255;
	mes "[ペル]";
	mes "ペルルルルルル……";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[シャルロシー]";
	mes "ペル？";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "ペル、私は大丈夫。";
	mes "だから……";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "……ペルはなんて？";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[シャルロシー]";
	mes "私を連れ去ろうとする人間は";
	mes "許さないって……";
	mes "……ペル？";
	next;
	cutin "shaloshi01.bmp", 255;
	mes "[ペル]";
	mes "ペルペル！ペルペル!!";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[シャルロシー]";
	mes "どうしよう……";
	mes "ペルの力が強まっていく……。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "ペル、落ち着くんだ。";
	mes "私は君の友達を奪ったりしないよ。";
	mes "ただ私もシャルロシーと……。";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "ペル……お願い……";
	mes "話を聞いて……。";
	next;
	cutin "shaloshi01.bmp", 255;
	mes "[ペル]";
	mes "ペルペル、ペルペル、ペル！";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "ペルの姿が……!!";
	mes "……ふう。どうやら、";
	mes "聞く耳もたないって感じだね。";
	mes "仕方ない、戦おう。";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "でも……";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "……ニュオーズ……";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "うん……信じる……";
	mes "だから、ペルを止めて……！";
	next;
	cutin "nines03.bmp", 2;
	mes "[ニュオーズ]";
	mes "ああ！　私たちに任せて！";
	close2;
	cutin "nines03.bmp", 255;
	end;
}

1@jtb.gat,10,10,0	script	ボス#22	139,{/* 61568 (hide)*/}
1@jtb.gat,320,323,5	script	ニュオーズ#boss	625,{/* 61569 (hide)*/}
1@jtb.gat,328,326,4	script	ロテルト#23	630,{/* 61570 (hide)*/
	cutin "rote01.bmp", 2;
	mes "[ロテルト]";
	mes "お前ら！　無事だったか……。";
	mes "心配させやがって！";
	close2;
	cutin "rote01.bmp", 255;
	end;
}
1@jtb.gat,330,328,4	script	ゲルカ#23	629,{/* 61571 (hide)*/
	cutin "gelca01.bmp", 2;
	mes "[ゲルカ]";
	mes "あんなに強そうなモンスターを";
	mes "倒してしまうなんて、";
	mes strcharinfo(0) + "さんって";
	mes "凄く強いんですね！";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}
1@jtb.gat,329,323,4	script	ミンミン#23	643,{/* 61572 (hide)*/
	cutin "min01.bmp", 2;
	mes "[ミンミン]";
	mes "あなた、結構やるのね。";
	mes "口下手なロテルトに変わって";
	mes "礼を言うわ。";
	mes "ニュオーズを助けてくれて";
	mes "ありがとう。";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}
1@jtb.gat,317,325,5	script	アイグ#23	646,{/* 61573 (hide)*/
	cutin "igu01.bmp", 2;
	mes "[アイグ]";
	mes "あのモンスター……";
	mes "何であんなにシャルロシーの事を";
	mes "守ろうとしてたんだろう……。";
	close2;
	cutin "igu01.bmp", 255;
	end;
}
1@jtb.gat,316,322,5	script	ラギ#23	647,{/* 61574 (hide)*/
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "ご無事でしたか。";
	mes "あのモンスターの出す音色……";
	mes "きっと、シャルロシーを守ろうと";
	mes "必死だったんでしょうねぇ。";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}
1@jtb.gat,319,320,5	script	アラン#23	644,{/* 61575 (hide)*/
	cutin "arang02.bmp", 2;
	mes "[アラン]";
	mes "すっごく強そうで格好良い";
	mes "モンスターだったね！";
	mes "あんなのを倒しちゃうなんて";
	mes strcharinfo(0) + "は";
	mes "凄いなぁ！";
	close2;
	cutin "arang01.bmp", 255;
	end;
}
1@jtb.gat,319,328,5	script	ルナイン#23	10039,{/* 61576 (hide)*/
	cutin "lunain02.bmp", 2;
	mes "[ルナイン]";
	mes "け、結構やるじゃない。";
	mes "その、怪我とかしてない？";
	mes "ニュオーズ様の次なら";
	mes "ヒールしてあげるわよ。";
	close2;
	cutin "lunain01.bmp", 255;
	end;
}
1@jtb.gat,325,321,4	script	ロエル#23	10040,{/* 61577 (hide)*/
	cutin "roel04.bmp", 2;
	mes "[ロエル]";
	mes "ご無事でしたか！";
	mes "いざという時にお役に立てず";
	mes "申し訳ありません!!";
	close2;
	cutin "roel01.bmp", 255;
	end;
}
1@jtb.gat,322,321,4	script	メロディージャック#23	844,{/* 61578 (hide)*/}
1@jtb.gat,324,327,4	script	ペル#25	10047,{/* 61579 (hide)*/
	mes "[ペル]";
	mes "ペルルル……。";
	close;
}
1@jtb.gat,326,329,4	script	シャルロシー#23	10041,{/* 61580 (hide)*/
	cutin "shaloshi03.bmp", 2;
	mes "[シャルロシー]";
	mes "みんな……。";
	close2;
	cutin "shaloshi03.bmp", 255;
	end;
}
1@jtb.gat,320,323,5	script	ニュオーズ#23	625,{/* 61581 (hide)*/
	menu "会話をする",-;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "ふう、ずいぶんとタフだったね。";
	mes "これで少しは大人しくなるかな？";
	next;
	cutin "rote01.bmp", 2;
	mes "[ロテルト]";
	mes "やっと見つけた……!!";
	mes "お前ら、大丈夫か!!";
	next;
	switch(select("簡単に話を聞きたい","詳しく話を聞きたい")) {
	case 1:
		cutin "min01.bmp", 2;
		mes "[ミンミン]";
		mes "とりあえずここから出ましょう。";
		mes "話はそれからよ。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "ああ、そうだな。";
		mes "しかし出口が見当たらねえ。";
		mes "そいつに原因があるんじゃないか？";
		next;
		cutin "rote01.bmp", 255;
		mes "‐悲しそうに話し出すシャルロシー。";
		mes "　シャルロシーの話から、";
		mes "　彼女は魔王モロクに作られた";
		mes "　使徒であることが発覚した‐";
		next;
		mes "‐ニュオーズは、シャルロシーを";
		mes "　白羽ギルドに迎えようと提案するが、";
		mes "　ギルドメンバーの反応は";
		mes "　非常に冷たいものだった‐";
		next;
		mes "‐自分に向けられた視線の意味を";
		mes "　察したシャルロシーは";
		mes "　何処かに消えてしまった……‐";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "……";
		next;
		mes "[ロテルト]";
		mes "チッ……";
		mes "お前ら、さっさと帰るぞ！";
		mes "準備しろ。";
		close2;
		warp "1@jtb.gat",360,23;
		end;
	case 2:
		cutin "rote01.bmp", 255;
		mes "[メロディージャック]";
		mes "そのモンスター、";
		mes "生かしておくつもりか？";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "ここで倒さねーと、";
		mes "また襲ってくるかも知れないぞ。";
		mes "なんなら退魔界一の悪童と呼ばれる";
		mes "俺の力を見せてやろうか。";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[シャルロシー]";
		mes "ダメ！　ペルは私の友達。";
		next;
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "シャルロシー……。";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[シャルロシー]";
		mes "ここは私の為に";
		mes "ペルが作ってくれた空間……。";
		mes "ペルが暴走したり、消えると";
		mes "この空間も消えてなくなる。";
		mes "ここにいる全員を含めて。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "脅しのつもりか……!!";
		next;
		cutin "min02.bmp", 2;
		mes "[ミンミン]";
		mes "とりあえずここから出ましょう。";
		mes "話はそれからよ。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "ああ、そうだな。";
		mes "しかし出口が見当たらねえ。";
		next;
		cutin "min02.bmp", 2;
		mes "[ミンミン]";
		mes "恐らくだけど、";
		mes "この空間から脱出できない原因も";
		mes "その子にあるんじゃないかしら？";
		next;
		cutin "arang01.bmp", 2;
		mes "[アラン]";
		mes "どういうこと？";
		next;
		cutin "min02.bmp", 2;
		mes "[ミンミン]";
		mes "この空間の土の状態を調べたときに、";
		mes "崩壊したモロクの街と同じ魔力を";
		mes "微力ながら感じたわ。";
		next;
		mes "[ミンミン]";
		mes "そして多発する地震。";
		mes "その子が不安そうにしていたり";
		mes "感情が昂ったりした時に";
		mes "起こっていたように見えた。";
		next;
		mes "[ミンミン]";
		mes "この空間、あなたの精神……";
		mes "気持ちにリンクしてるんじゃない？";
		mes "私たちに帰ってほしくない、";
		mes "あなたがそう思ってるから";
		mes "出口が無いんじゃないのかしら。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……。";
		next;
		mes "[シャルロシー]";
		mes "私はただ友達が欲しかっただけ。";
		mes "みんなを閉じ込めるつもりなんて";
		mes "なかった……。";
		next;
		mes "[シャルロシー]";
		mes "でも、出口が消えてしまった。";
		mes "みんなに迷惑かけた……。";
		next;
		cutin "min02.bmp", 2;
		mes "[ミンミン]";
		mes "空間を自由に支配する力なんて……。";
		mes "そしてこの魔力の感じ……";
		mes "あなた、一体何者なの？";
		mes "それだけ記憶が戻っているようなら";
		mes "説明できるわよね？";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……私は……";
		next;
		mes "[シャルロシー]";
		mes "私は次元の狭間で生まれた悪魔。";
		mes "魔王モロクに作られた";
		mes "第三の使徒、シャルロシー。";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "おい、今何て言った！";
		mes "モロクだと!?";
		next;
		cutin "rote03.bmp", 255;
		mes "[メロディージャック]";
		mes "魔王モロクに作られた存在。";
		mes "さしずめ、魔王の娘と言ったところか。";
		mes "……なるほど。";
		mes "それで懐かしい力を感じたのか。";
		next;
		cutin "lunain02.bmp", 2;
		mes "[ルナイン]";
		mes "……どういうことよ、それ……。";
		next;
		cutin "igu05.bmp", 2;
		mes "[アイグ]";
		mes "魔王モロクの使徒……!?";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "やっぱりこいつ、ここで……！";
		next;
		cutin "ragi02.bmp", 2;
		mes "[ラギ]";
		mes "これは困りましたねぇ。";
		mes "シャルロシーと戦う理由が";
		mes "できてしまいました……。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "でも、安心して。";
		mes "私は今、モロクとの繋がりはない。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "繋がりはないって……";
		mes "どういう事だい？";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "魔王モロクが倒された。";
		mes "だから、モロクとの繋がりが";
		mes "なくなった。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "何寝ぼけたこと言ってやがる！";
		mes "そんな話聞いてないぞ！";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "この空間は外とは時間の流れが違う。";
		mes "みんなにとっては過去かも知れないし";
		mes "未来かもしれない。";
		mes "魔王モロクを倒したのだって……。";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "‐シャルロシーは一瞬";
		mes "　こちらに目を向けると、";
		mes "　すぐに視線を戻した‐";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "……だから、今は自由の身。";
		mes "でも、私が悪魔だって事実は";
		mes "変わらない。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "私は悪魔だから……";
		mes "一緒に居ちゃいけないって……";
		mes "そう思って……だから……。";
		next;
		cutin "gelca02.bmp", 2;
		mes "[ゲルカ]";
		mes "シャルロシーちゃん……";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "ねぇ、ロテ、みんな。";
		next;
		mes "[ニュオーズ]";
		mes "……私は悪魔だとか関係なく、";
		mes "今のシャルロシーが好きだし、";
		mes "これからも力になってあげたいんだ。";
		next;
		mes "[ニュオーズ]";
		mes "だから……私はシャルロシーを";
		mes "白羽ギルドに迎え入れたい。";
		next;
		cutin "rote03.bmp", 2;
		mes "[ロテルト]";
		mes "……ニュオーズ、お前……";
		mes "自分が何を言っているか、";
		mes "わかってるのか!?";
		next;
		mes "[ロテルト]";
		mes "こいつは悪魔だ。";
		mes "お前はこいつが、";
		mes "今後も悪さをしないって";
		mes "保証できるのか？";
		next;
		mes "[ロテルト]";
		mes "モロクの力が復活して、";
		mes "こいつが今後も操られないって保証は？";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "……私が全部、責任を持つよ。";
		mes "だからシャルロシーを……";
		next;
		cutin "nines01.bmp", 255;
		mes "[メロディージャック]";
		mes "最悪の事態を想定してみろ。";
		mes "お前の責任だけで";
		mes "済む問題ではないだろう。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "ジャック……";
		mes "で、でも、他のみんなもきっと……";
		next;
		cutin "nines01.bmp", 255;
		mes "‐続けて何かを言おうとした";
		mes "　ニュオーズを遮るかのように";
		mes "　シャルロシーが口を開いた‐";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[シャルロシー]";
		mes "ニュオーズ、ありがとう。";
		mes "……でも。";
		next;
		mes "[シャルロシー]";
		mes "私は、私が神様に";
		mes "お願いを叶えてもらったように";
		mes "今度はペルの夢をかなえてあげたいの。";
		mes "これは私にしか出来ない……。";
		next;
		mes "[シャルロシー]";
		mes "ペルの夢……。";
		mes "それは私と誰にも邪魔されずに";
		mes "一緒に居たいって言ってる。";
		mes "だから……ごめん。私……行くね。";
		next;
		mes "[シャルロシー]";
		mes strcharinfo(0) + "も、";
		mes "みんなも……。";
		mes "仲良くしてくれてありがとう……。";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "‐こちらを見たシャルロシーの顔が";
		mes "　とても寂しげに見えた‐";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "シャルロシー……";
		mes "こんな悲しい結末だなんて、";
		mes "私は嫌だよ……。";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[シャルロシー]";
		mes "ごめんなさい……";
		mes "……ばいばい。";
		next;
		cutin "rote01.bmp", 2;
		mes "[ロテルト]";
		mes "……";
		next;
		mes "[ロテルト]";
		mes "チッ……";
		mes "お前ら、さっさと帰るぞ！";
		mes "準備しろ。";
		close2;
		warp "1@jtb.gat",360,23;
		end;
	}
}
1@jtb.gat,368,21,5	script	ロテルト#end	630,{/* 61582 */
	cutin "rote01.bmp", 2;
	mes "[ロテルト]";
	mes "今は臨時のギルドメンバー";
	mes "かも知れねえが、";
	mes "頑張ったら良い事あるかもな。";
	close2;
	cutin "rote01.bmp", 255;
	end;
}
1@jtb.gat,366,20,5	script	ゲルカ#end	629,{/* 61583 */
	cutin "gelca01.bmp", 2;
	mes "[ゲルカ]";
	mes "もっと強くなります。";
	mes "修行も頑張らないと！";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}
1@jtb.gat,375,18,4	script	アイグ#end	646,{/* 61584 */
	cutin "igu03.bmp", 2;
	mes "[アイグ]";
	mes "お疲れ様なの！";
	mes "みんな無事でよかったの。";
	close2;
	cutin "igu01.bmp", 255;
	end;
}
1@jtb.gat,364,18,5	script	ミンミン#end	643,{/* 61585 */
	cutin "min01.bmp", 2;
	mes "[ミンミン]";
	mes "もしかしてと思って";
	mes "シャルロシーの髪の毛を";
	mes "何本か採取しておいたわ。";
	mes "まずは研究はしてみないと。";
	next;
	emotion 29, "ミンミン#end";
	mes "[ミンミン]";
	mes "ここにはまだ";
	mes "研究しなきゃいけないものが";
	mes "たくさんあるわね。";
	close2;
	cutin "min01.bmp", 255;
	end;
}
1@jtb.gat,373,25,3	script	ラギ#end	647,{/* 61586 */
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "心を読めるというのも";
	mes "時と場合によりけり、ですねぇ。";
	mes "僕にはそんな力がなくて、";
	mes "良かったと思いますよ。";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}
1@jtb.gat,370,26,5	script	アラン#end	644,{/* 61587 */
	cutin "arang03.bmp", 2;
	mes "[アラン]";
	mes "ロエルと友達になったよ！";
	close2;
	cutin "arang03.bmp", 255;
	end;
}
1@jtb.gat,373,16,3	script	ルナイン#end	10039,{/* 61588 */
	cutin "lunain02.bmp", 2;
	mes "[ルナイン]";
	mes "あの子もしかして……";
	mes "な、なんでもないわ。";
	mes "流石に疲れたし、";
	mes "早く帰って休みたいわ……。";
	close2;
	cutin "lunain03.bmp", 255;
	end;
}
1@jtb.gat,376,23,3	script	ロエル#end	10040,{/* 61589 */
	cutin "roel03.bmp", 2;
	mes "[ロエル]";
	mes "アランと友達になりました！";
	mes "今度、一緒にダンジョンへ";
	mes "冒険しに行くんですよ！";
	close2;
	cutin "roel01.bmp", 255;
	end;
}
1@jtb.gat,367,13,5	script	メロディージャック#end_	844,{/* 61590 */
	mes "[メロディージャック]";
	mes "隠れているのだから声をかけるな！";
	mes "まったく……。";
	mes "隠れている者を見つけるのには";
	mes "それなりの修業が必要だというのに。";
	mes "……お前は大した奴だな。";
	close;
}
1@jtb.gat,372,22,4	script	ニュオーズ#end	625,{/* 61591 */
	menu "会話をする",-;
	cutin "nines02.bmp", 2;
	mes "[ニュオーズ]";
	mes "みんな、ひとまずお疲れ様。";
	mes "いろいろあった後だし、少し";
	mes "ここで休憩して帰ろう。";
	next;
	cutin "rote01.bmp", 2;
	emotion 36, "ロテルト#end";
	mes "[ロテルト]";
	mes "そういや……";
	mes "ニュオーズ!!";
	mes "お前さっきはよくも";
	mes "勝手に「白羽ギルド」とか";
	mes "言いやがったな！";
	next;
	cutin "nines04.bmp", 2;
	mes "[ニュオーズ]";
	mes "えっ？";
	mes "ギルドマスターは変わったけど……";
	mes "もうギルド名まで変更したのかい？";
	next;
	cutin "rote01.bmp", 2;
	emotion 32, "ロテルト#end";
	mes "[ロテルト]";
	mes "ギルドマスターが変わったんだ！";
	mes "ギルド名も変えるのが、普通だろ！";
	mes "その……う～ん。";
	mes "アレだ！　あの名前……。";
	next;
	emotion 54, "ミンミン#end";
	cutin "min02.bmp", 2;
	mes "[ミンミン]";
	mes "新しい名前が思いつかないなら、";
	mes "そのままにすれば？";
	next;
	emotion 52, "ロテルト#end";
	cutin "rote01.bmp", 2;
	mes "[ロテルト]";
	mes "そんなことはできるか！";
	mes "俺がギルドマスターだしな。";
	next;
	mes "[ロテルト]";
	mes "おっ、そうだ!!";
	mes "これからは";
	mes "「ロテルトの超必殺ギルド」だ！";
	emotion 40, "ロテルト#end";
	next;
	emotion 57, "アイグ#end";
	cutin "igu05.bmp", 2;
	mes "[アイグ]";
	mes "変な名前、なの。";
	next;
	cutin "gelca03.bmp", 2;
	mes "[ゲルカ]";
	mes "師匠らしいギルド名ですよね!!";
	next;
	cutin "roel04.bmp", 2;
	mes "[ロエル]";
	mes "こ、個性的ですね……。";
	next;
	cutin "lunain04.bmp", 2;
	mes "[ルナイン]";
	mes "うわっダサッ！";
	next;
	cutin "rote01.bmp", 2;
	emotion 36, "ロテルト#end";
	mes "[ロテルト]";
	mes "うるせー!!";
	mes "ギルドマスターは俺だ！";
	mes "決定権は俺にある！";
	next;
	cutin "arang01.bmp", 2;
	mes "[アラン]";
	mes "……格好悪い。";
	next;
	emotion 29, "ミンミン#end";
	cutin "min02.bmp", 2;
	mes "[ミンミン]";
	mes "その名前で決定っていうなら";
	mes "私はギルドを脱退するわ。";
	mes "そんな名前、名乗りたくないもの。";
	next;
	cutin "rote01.bmp", 2;
	mes "[ロテルト]";
	mes "なんだと！";
	emotion 23, "ロテルト#end";
	next;
	cutin "min02.bmp", 255;
	mes "[メロディージャック]";
	mes "私は元々ギルドメンバーではないしな。";
	mes "好きにさせて貰うぞ。";
	emotion 9, "メロディージャック#end_";
	next;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "こんな恥ずかしいギルド名じゃ";
	mes "どこに行っても目立ちますねぇ。";
	mes "そのせいでアイグ様の人気にも";
	mes "変な影響が出ないと良いですが。";
	next;
	cutin "igu02.bmp", 2;
	mes "[アイグ]";
	mes "あはは、大丈夫なの。";
	mes "多分……。";
	emotion 14, "アイグ#end";
	next;
	cutin "lunain04.bmp", 2;
	mes "[ルナイン]";
	mes "白羽ギルドの方が";
	mes "分かりやすいし、何より";
	mes "ニュオーズ様のセンスが";
	mes "光る名前で良かったのに。";
	next;
	cutin "lunain02.bmp", 2;
	mes "[ルナイン]";
	mes "でもまあ……";
	mes "こんな名前になるなら";
	mes "あの子が入らなくて";
	mes "ある意味、正解だったかもね……。";
	next;
	cutin "rote01.bmp", 2;
	mes "[ロテルト]";
	mes "お前ら……";
	mes "好き勝手言いやがって！";
	mes "とにかく今日は疲れたから解散するぞ！";
	mes "ロテルトの超必殺ギルドの冒険終了！";
	close2;
	cutin "rote01.bmp", 255;
	end;
cutin "nines01.bmp", 2;
mes "[ニュオーズ]";
mes "やあ、君か。ちょうどよかった！";
mes "実はちょっと話したいことが";
mes "あるんだけど……。";
mes "よかったら聞いてくれないかな？";
next;
if(select("はい","いいえ") == 2) {
	mes "[ニュオーズ]";
	mes "残念だなぁ……。";
	mes "気が変わったらでいいから";
	mes "いつか聞いてくれると嬉しいな。";
	close2;
	cutin "nines01.bmp", 255;
	end;
}
cutin "nines02.bmp", 2;
mes "[ニュオーズ]";
mes "本当かい!?";
mes "それじゃあ、場所を移動しようか。";
mes "こっちだよ。";
close2;
warp "1@jtb.gat",13,274;
end;
}
1@jtb.gat,36,289,3	script	ラギ#15	647,{/* 61609 */
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes strcharinfo(0) + "さん、";
	mes "お疲れ様です。";
	mes "僕もニュオーズ様に呼ばれて";
	mes "きたのですが、";
	mes "何があるのでしょうか。";
	close2;
	cutin "ragi01.bmp", 255;
	end;
cutin "ragi01.bmp", 2;
mes "[ラギ]";
mes "素晴らしい曲ができましたね。";
mes "アイグ様のダンスも";
mes "とても楽しみですねぇ。";
close;
cutin "ragi01.bmp", 255;
}
1@jtb.gat,34,291,3	script	ニュオーズ#15	625,{/* 61610 */
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "やあやあ、ラギ君、";
	mes strcharinfo(0) + "。";
	mes "こんなところに呼び出してごめんね～。";
	mes "実は二人にお願いがあるんだ。";
	next;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "なんでしょう。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "今回の冒険を曲にしたくってさ。";
	mes "冒険者は冒険記を書いたりするだろう？";
	mes "私はそれを音楽で残すのが好きなんだ。";
	next;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "それは素晴らしいですねぇ。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "それでね、二人に";
	mes "曲作りのお手伝いをして欲しいんだ～。";
	mes "どうかな？";
	next;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "僕は構わないですよ。";
	mes "ニュオーズ様とゆっくり音楽について";
	mes "お話もしたかったところですし。";
	next;
	cutin "nines03.bmp", 2;
	mes "[ニュオーズ]";
	mes "ラギ君！　ありがとう～！";
	mes strcharinfo(0) + "は";
	mes "どう？　お願いできる？";
	next;
	menu "手伝う",-;
	cutin "nines02.bmp", 2;
	mes "[ニュオーズ]";
	mes "やった～！　ありがとう！";
	mes "さっそくだけど、";
	mes "どんな曲にしたらいいと思う？";
	next;
	select("明るい曲","暗い曲","激しい曲")
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "明るい曲か！　いいね！";
	mes "冒険は楽しいものだからね！";
	next;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "allegramente……いいですねぇ。";
	mes "白羽ギルドにぴったりですね。";
	next;
	menu "アレグラメンテ？",-;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "はい。allegramenteとは";
	mes "音楽用語で";
	mes "明るく、楽しくという意味です。";
	next;
	menu "なるほど",-;
	cutin "nines03.bmp", 2;
	mes "[ニュオーズ]";
	mes "よし、ギルドによく似合う";
	mes "明るい曲にしよう！";
	mes "賑やかなメンバーに負けない、";
	mes "元気な曲にしないとね！";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes "うん、うん！　イメージが湧いてきた！";
	mes "メロディも浮かんできた～！";
	mes "これから私は曲を作るから、";
	mes "ラギ君、演奏を手伝って！";
	next;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "わかりました。";
	next;
	cutin "nines01.bmp", 2;
	mes "[ニュオーズ]";
	mes strcharinfo(0) + "には";
	mes "歌詞を考えて欲しいな。";
	mes "この紙に書いてくれたら、";
	mes "曲と合わせるよ。";
	next;
	cutin "nines01.bmp", 255;
	mes "‐紙とペンを受け取った‐";
	next;
	cutin "nines03.bmp", 2;
	mes "[ニュオーズ]";
	mes "頼んだよ～！";
	mes "さあ、ラギ君。";
	mes "私達もかんばろう！";
	next;
	cutin "ragi01.bmp", 2;
	mes "[ラギ]";
	mes "はい。";
	next;
	cutin "ragi01.bmp", 255;
	mes "‐さっそく受け取った紙に";
	mes "　思いつく歌詞を書いてみよう。";
	mes "　最初は何を書こうか‐";
	set '@str$[1],"シャルロシーの事","ニュオーズの事","自分の事";
	while(1) {
		next;
		switch('@succsess) {
		case 0:
			switch(select('@str$[1],'@str$[2],'@str$[3])) {
			case 1:
				mes "[" + strcharinfo(0) + "]";
				mes "ダンジョンで出会った謎の少女……";
				mes "魔王の娘、シャルロシー……";
				mes "彼女は友達がほしかった……";
				set '@song[1],1;
				set '@str$[1],"";
				break;
			case 2:
				mes "[" + strcharinfo(0) + "]";
				mes "お騒がせな前マスター……";
				mes "ミンストレルのニュオーズ……";
				mes "彼と仲間の冒険記……";
				set '@song[1],2;
				set '@str$[2],"";
				break;
			case 3:
				mes "[" + strcharinfo(0) + "]";
				mes "臨時で入った白羽ギルド……";
				mes "冒険者" + strcharinfo(0) + "……";
				mes "新しい冒険の始まり……";
				set '@song[1],3;
				set '@str$[3],"";
				break;
			}
			next;
			mes "‐紙にするすると";
			mes "　思いついた言葉を書いていく。";
			mes "　次は何を書こうか‐";
			set '@succsess,'@succsess + 1;
			continue;
		case 1:
			switch(select('@str$[1],'@str$[2],'@str$[3])) {
			case 1:
				mes "[" + strcharinfo(0) + "]";
				mes "ダンジョンで出会った謎の少女……";
				mes "魔王の娘、シャルロシー……";
				mes "彼女は友達がほしかった……";
				set '@song[2],1;
				set '@str$[1],"";
				break;
			case 2:
				mes "[" + strcharinfo(0) + "]";
				mes "お騒がせな前マスター……";
				mes "ミンストレルのニュオーズ……";
				mes "彼と仲間の冒険記……";
				set '@song[2],2;
				set '@str$[2],"";
				break;
			case 3:
				mes "[" + strcharinfo(0) + "]";
				mes "臨時で入った白羽ギルド……";
				mes "冒険者" + strcharinfo(0) + "……";
				mes "新しい冒険の始まり……";
				set '@song[2],3;
				set '@str$[3],"";
				break;
			}
			next;
			mes "‐紙にするすると";
			mes "　思いついた言葉を書いていく。";
			mes "　最後の文章も書こう‐";
			set '@succsess,'@succsess + 1;
			continue;
		case 2:
			switch(select('@str$[1],'@str$[2],'@str$[3])) {
			case 1:
				mes "[" + strcharinfo(0) + "]";
				mes "ダンジョンで出会った謎の少女……";
				mes "魔王の娘、シャルロシー……";
				mes "彼女は友達がほしかった……";
				set '@song[3],1;
				set '@str$[1],"";
				break;
			case 2:
				mes "[" + strcharinfo(0) + "]";
				mes "お騒がせな前マスター……";
				mes "ミンストレルのニュオーズ……";
				mes "彼と仲間の冒険記……";
				set '@song[3],2;
				set '@str$[2],"";
				break;
			case 3:
				mes "[" + strcharinfo(0) + "]";
				mes "臨時で入った白羽ギルド……";
				mes "冒険者" + strcharinfo(0) + "……";
				mes "新しい冒険の始まり……";
				set '@song[3],3;
				set '@str$[3],"";
				break;
			}
			next;
			mes "‐紙にするすると";
			mes "　思いついた言葉を書いていく。";
			mes "　歌詞が出来上がった‐";
			set '@succsess,'@succsess + 1;
			continue;
		case 3:
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes strcharinfo(0) + "～！";
			mes "曲ができたよ～！";
			mes strcharinfo(0) + "は";
			mes "できたかい？";
			next;
			menu "できた",-;
			cutin "nines03.bmp", 2;
			mes "[ニュオーズ]";
			mes "おおっ！　見せて見せて！";
			mes "どれどれ……";
			next;
			mes "[ニュオーズ]";
			mes "……";
			next;
			mes "[ニュオーズ]";
			mes "……";
			mes "…………";
			next;
			cutin "nines02.bmp", 2;
			mes "[ニュオーズ]";
			mes "……";
			mes "…………";
			mes "いいね～！　すばらしい!!";
			next;
			cutin "nines03.bmp", 2;
			mes "[ニュオーズ]";
			mes "さぁ、ラギ君！";
			mes "私達が作ったメロディーに乗せて";
			mes "歌ってみようじゃないか！";
			next;
			cutin "ragi01.bmp", 2;
			mes "[ラギ]";
			mes "はい。それでは演奏を始めます。";
			next;
			cutin "ragi02.bmp", 2;
			mes "[ラギ]";
			mes "ラ～ララ～ラ～";
			mes "白羽ギルドの物語～";
			mes "小さな冒険の物語～";
			for(set '@i,1; '@i<=3; set '@i,'@i+1) {
				next;
				switch('@song['@i]) {
				case 1:
					cutin "nines02.bmp", 2;
					mes "[ニュオーズ]";
					mes "ダンジョンで出会った謎の少女～";
					mes "魔王の娘、シャルロシー～";
					mes "彼女は友達がほしかった～";
					break;
				case 2:
					cutin "nines02.bmp", 2;
					mes "[ニュオーズ]";
					mes "お騒がせな前マスター～";
					mes "ミンストレルのニュオーズ～";
					mes "彼と仲間の冒険記～";
					break;
				case 3:
					cutin "nines02.bmp", 2;
					mes "[ニュオーズ]";
					mes "臨時で入った白羽ギルド～";
					mes "冒険者" + strcharinfo(0) + "～";
					mes "新しい冒険の始まり～";
					break;
				}
			}
			next;
			cutin "ragi02.bmp", 2;
			mes "[ラギ]";
			mes "こうして僕らはまた明日も";
			mes "仲間と冒険を繰り返す～";
			mes "ラ～ララ～ラ～";
			mes "白羽ギルドの物語～";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "……ふう。";
			mes strcharinfo(0) + "、";
			mes "どうかな？";
			next;
			menu "いいね！",-;
			cutin "nines02.bmp", 2;
			mes "[ニュオーズ]";
			mes "本当かい？　嬉しいな！";
			mes "私も素晴らしいと思うよ！";
			mes "とても良い曲ができた。";
			next;
			cutin "ragi01.bmp", 2;
			mes "[ラギ]";
			mes "僕も、ニュオーズ様と";
			mes strcharinfo(0) + "さんと";
			mes "合作が作れて嬉しいです。";
			mes "ありがとうございます。";
			next;
			cutin "nines03.bmp", 2;
			mes "[ニュオーズ]";
			mes "うんうん、私も";
			mes "3人でこんな良い曲を作れて";
			mes "大満足だよ～!!";
			next;
			mes "[ニュオーズ]";
			mes strcharinfo(0) + "、";
			mes "ラギ君、ありがとう！";
			next;
			mes "[ニュオーズ]";
			mes "さぁ、さっそく";
			mes "みんなにお披露目してこよう！";
			mes "アイグにも踊ってもらわないと～！";
			next;
			cutin "ragi01.bmp", 2;
			mes "[ラギ]";
			mes "僕もお供します。";
			next;
			cutin "nines01.bmp", 2;
			mes "[ニュオーズ]";
			mes "戻ってきたらシャルロシーにも";
			mes "聴かせてあげないとね！";
			next;
			cutin "ragi01.bmp", 2;
			mes "[ラギ]";
			mes "そうですね。";
			mes "その時は全員で歌えるように";
			mes "みんなに覚えてもらわないと";
			mes "いけませんねぇ。";
			next;
			cutin "nines03.bmp", 2;
			mes "[ニュオーズ]";
			mes "そうだね～！";
			mes "とっても楽しみだ！";
			close2;
			cutin "nines01.bmp", 255;
			setquest 116500;
			compquest 116500;
			end;
		}
	}
	cutin "nines02.bmp", 2;
	mes "[ニュオーズ]";
	mes "素敵な曲ができて嬉しいな。";
	close2;
	cutin "nines01.bmp", 255;
	end;
}

1@jtb.gat,45,47,0	warp	1番部屋出口	2,2,1@jtb.gat,100,14
1@jtb.gat,135,17,0	warp	2番部屋出口	2,2,1@jtb.gat,184,17
1@jtb.gat,220,23,0	warp	3番部屋出口	2,2,1@jtb.gat,183,128
1@jtb.gat,209,133,0	warp	7番部屋出口	2,2,1@jtb.gat,277,95
1@jtb.gat,307,122,0	warp	8番部屋出口	2,2,1@jtb.gat,359,97
1@jtb.gat,386,133,0	warp	9番部屋出口	2,2,1@jtb.gat,13,214
1@jtb.gat,49,196,0	warp	10番部屋出口	2,2,1@jtb.gat,95,201
1@jtb.gat,133,197,0	script	11番部屋出口	45,{/* 61603 (hide)*/
	mes "‐これまでの戦闘で得た";
	mes "　経験からだろうか、";
	mes "　少し成長できた気がする。‐";
	close2;
	setquest 116509;
	compquest 116509;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 0,1000000;
	getexp 0,1000000;
	warp "1@jtb.gat",181,198;
	end;
}
1@jtb.gat,218,203,0	warp	12番部屋出口	2,2,1@jtb.gat,287,355
1@jtb.gat,311,358,0	warp	トンネル部屋出口	2,2,1@jtb.gat,335,320
1@jtb.gat,10,10,0	script	22番部屋出口	139,{/* 61606 (hide)*/}
1@jtb.gat,391,30,0	script	23番部屋出口	45,{/* 61607 */
	{
		mes "‐誰かの声が聞こえる‐";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "ラギ君、ちょっといいかい？";
		next;
		cutin "ragi03.bmp", 2;
		mes "[ラギ]";
		mes "なんでしょうか？";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes "実は君にお願いがあるんだ。";
		mes "この後、少しだけ";
		mes "付き合ってくれないかな？";
		next;
		cutin "ragi01.bmp", 2;
		mes "[ラギ]";
		mes "ええ、構いませんよ。";
		next;
		cutin "nines01.bmp", 2;
		mes "[ニュオーズ]";
		mes strcharinfo(0) + "にも";
		mes "話がしたいんだけど";
		mes "どこにいるかな～……。";
		next;
		cutin "nines01.bmp", 255;
		mes "‐ニュオーズが何か相談したいようだ。";
		mes "　詳しい話を聞くべきだろうか？‐";
		next;
		if(select("話を聞きに行く","話を聞きに行かない") == 1) {
			mes "‐ニュオーズの所へ行ってみよう‐";
			close;
		}
		//
	}
	mes "‐ここからダンジョンの外へ";
	mes "　移動することができるようだ‐";
	next;
	if(select("移動しない","移動する") == 1) {
		mes "‐その場に留まる事にした‐";
		close;
	}
	mes "‐移動しよう‐";
	close2;
	delquest 13181;
	setquest 13183;
	compquest 13183;
	setquest 116508;
	compquest 116508;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 0,1000000;
	getexp 0,1000000;
	getexp 0,500000;
	getitem 6719, 1;
	warp "moc_para01.gat",30,88;
	end;
}
1@jtb.gat,24,304,0	script	#周回15番部屋出口	45,{/* 61608 */
	mes "‐ここからメンバーがいる場所へ";
	mes "　移動することができるようだ‐";
	next;
	if(select("移動しない","移動する") == 1) {
		mes "‐その場に留まる事にした‐";
		close;
	}
	mes "‐移動しよう‐";
	close2;
	warp "1@jtb.gat",353,42;
	end;
}
