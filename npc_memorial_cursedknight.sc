dali02.gat,46,135,5	script	老婆#dk	846,{/* 51201 */
	mes "[老婆]";
	mes "強い思いは時に強い力を持つ……。";
	mes "^ff0000記憶の欠片^000000を持っていたら";
	mes "私の所に持ってきなさい。";
	mes "^ff0000レクイエム装備^000000に";
	mes "精錬をしてあげるぞよ。";
	close;
OnInit:
	waitingroom "レクイエム装備精錬",0; //51201
	end;
}

dali02.gat,43,129,5	script	近衛兵#dk	686,{/* 51199 */
	if(BaseLevel < 110) {
	}
	if(checkquest(114750) & 0x8 == 8) {
		mes "‐一人の鎧で身を固めた男が";
		mes "　虚ろな顔でなにかをつぶやいている‐";
		next;
		mes "[近衛兵]";
		mes "この機械がせめて、生きていれば……。";
		mes "誰かこの機械を直せるものがいれば";
		mes "良いのだが……。";
		next;
		menu "声をかける",-;
		mes "[近衛兵]";
		mes "……君は……!?";
		mes "……。";
		mes "そうか、冒険者か。";
		mes "まさか独り言を聞かれるとは";
		mes "恥ずかしいところを見られて";
		mes "しまったな。";
		next;
		mes "‐先ほどまでの様子が嘘のように";
		mes "　男の顔に生気が宿った。‐";
		next;
		mes "[近衛兵]";
		mes "恥ついでにもう一つ、";
		mes "君はこの^FF0000壊れた次元移動機^000000を";
		mes "修理することはできないだろうか？";
		mes "恐らくこの機械こそ、私の記憶を";
		mes "呼び戻すために必要なものだと";
		mes "思うのだが……。";
		next;
		menu "記憶……？",-;
		mes "[近衛兵]";
		mes "すまない、本来は自己紹介を";
		mes "するべきなのだろうが、";
		mes "私は^0000FF記憶を失って^000000いるんだ。";
		mes "自分の名前はおろか、";
		mes "どうしてここに居るのかも私自身、";
		mes "まったくわからないんだ。";
		next;
		mes "[近衛兵]";
		mes "ただ、この壊れた次元移動機を";
		mes "みていると不意に胸に、";
		mes "よくわからない痛みが走るんだ……。";
		mes "だから恐らくこの次元移動機に";
		mes "私が記憶をなくした理由が";
		mes "あるに違いないと思ってね。";
		next;
		if(select("調べてみましょう","機械は苦手で……") == 2) {
			mes "[近衛兵]";
			mes "そうか……仕方ない。";
			mes "誰かこの機械について";
			mes "詳しい人間が通ることを";
			mes "祈っておこう。";
			next;
			mes "[近衛兵]";
			mes "すまなかった。";
			mes "話を出来ただけでも良かった。";
			mes "ありがとう。";
			close;
		}
		mes "[近衛兵]";
		mes "ありがとう、助かるよ！";
		mes "どうも私はこの手のものが";
		mes "苦手らしい……。";
		next;
		mes "^0000FF‐次元移動機の前に、";
		mes "　アプレシアが";
		mes "　立つと、次元移動機が低い";
		mes "　起動音をあげながら";
		mes "　起動し始めた……‐^000000";
		next;
		mes "[近衛兵]";
		mes "すごいな君は……！";
		mes "何もしていない？　いや。";
		mes "だとしてもこの機械が動いたのは";
		mes "君が来てくれたお陰だ。";
		next;
		mes "[近衛兵]";
		mes "さっき会ったばかりの君に";
		mes "このようなことをいうのは";
		mes "心苦しいのだが……。";
		mes "私がこの機械を使う暫くの間、";
		mes "一緒にいてもらえないだろうか？";
		next;
		mes "[近衛兵]";
		mes "君が居なければこの機械は";
		mes "動かない。ならば君にしばらく";
		mes "一緒にいてもらい、私はなるべく";
		mes "早く、自分の記憶の手がかりを";
		mes "手に入れるように努める。";
		next;
		mes "[近衛兵]";
		mes "……どうだろうか？";
		mes "やっと記憶の手がかりと";
		mes "なりそうなこの機械が";
		mes "動いたんだ……。";
		mes "このチャンスをどうしても";
		mes "逃したくないんだ。";
		next;
		if(select("力を貸す","断る") == 2) {
			mes "[近衛兵]";
			mes "……そうだな、すまない。";
			mes "やっと記憶の手がかりが";
			mes "見つかったと喜び、";
			mes "君の都合を考えていなかった。";
			next;
			mes "[近衛兵]";
			mes "何にしろ起動することは分かった。";
			mes "後は何とか、私の力で起動するよう";
			mes "試行錯誤してみようと思う。";
			mes "ここまでで、十分だ。";
			mes "本当にありがとう。";
			close;
		}
		mes "[近衛兵]";
		mes "本当か？";
		mes "君にはどれほど感謝をしても";
		mes "足りないな。";
		mes "本当に助かるよ。";
		mes "";
		next;
		mes "[近衛兵]";
		mes "さて、君にも準備が必要だろう。";
		mes "この機械を使う準備ができたら";
		mes "私に話しかけてくれるかな？";
		setquest 114750; //state=1
		compquest 114750;
		close;
	}
	mes "[近衛兵]";
	mes "君か……。";
	mes "私に何か用なのか？";
	next;
	if(select("次元の狭間を開く","何でもない") == 2) {
		mes "[近衛兵]";
		mes "そうか……。";
		mes "君さえよければ";
		mes "私の記憶を取り戻す";
		mes "手伝いをしてくれると助かる。";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[近衛兵]";
		mes "……すまない。";
		mes "次元移動機がまだ不安定で";
		mes "あまり負荷をかけられないんだ。";
		next;
		mes "[近衛兵]";
		mes "気持ちはありがたいが、";
		mes "次元移動機の起動は";
		mes "パーティーに所属している";
		mes "パーティーリーダーに";
		mes "限らせて貰っているんだ。";
		close;
	}
	mes "[近衛兵]";
	mes "私の記憶を取り戻すために";
	mes "協力してくれるのか？";
	next;
	if(select("はい","いいえ") == 2) {
		mes "[近衛兵]";
		mes "そうか……。";
		mes "無理強いはできないからな。";
		mes "今回は諦めるとしよう。";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[近衛兵]";
		mes "おや、起動出来ないようだな。";
		mes "少し待ってくれ。";
		close;
	}
	mdcreate "Cursed Knight";
	mes "[近衛兵]";
	mes "次元移動機を起動させたぞ！";
	mes "準備を整えて、まっていてくれ。";
	close;
OnInit:
	waitingroom "呪いの剣士",0; //51199
	end;
}

dali02.gat,40,134,5	script	次元移動機	10007,{/* 51200 */
	mes "‐次元移動機がある‐";
	next;
	if(select("入る","やめておく") == 2) {
		mes "[近衛兵]";
		mes "そうか……仕方ない。";
		close;
	}
	switch(mdenter("Cursed Knight")) {
	case 0:	// エラーなし
		announce "メモリアルダンジョン[Cursed Knight] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		donpcevent getmdnpcname("#DK_Control1")+ "::OnStart";
		setquest 1261; //state=1
		setquest 114760; //state=1
		close2;
		//warp "1@spa.gat",42,196;
		end;
	case 1:	// パーティー未加入
		mes "‐メモリアルダンジョンを";
		mes "　生成したパーティーのメンバーのみ、";
		mes "　メモリアルダンジョンに入れます‐";
		close;
	case 2:	// ダンジョン未作成
		mes "^ff0000‐次元の狭間が生成されていません。";
		mes "　パーティーリーダーが";
		mes "　生成することができます‐^000000";
		close;
	default:	// その他エラー
		close;
	}
}

1@spa.gat,0,0,0	script	#DK_Control1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("亡霊の王宮2階");
	hideonnpc getmdnpcname("亡霊の王宮3階");
	hideonnpc getmdnpcname("亡霊の王宮4階");
	hideonnpc getmdnpcname("亡霊の王宮5階");
	hideonnpc getmdnpcname("隣国の王子#dk3");
	hideonnpc getmdnpcname("近衛兵#dk3");
	hideonnpc getmdnpcname("魔剣タルタノス#dkt");
	hideonnpc getmdnpcname("呪いの根源#dk");
	donpcevent getmdnpcname("国王#dk")+ "::OnStart";
	end;
}

1@spa.gat,42,201,1	script	近衛兵#dk	686,{/* 68730 */
	mes "‐何も反応がない……。";
	mes "　まるで時が止まっているように";
	mes "　微動だにしない……‐";
	close;
OnTalk1:
	unittalk "近衛兵 : ありがたき幸せ。……この命に代えましても必ずや姫をお守りすることを陛下と、この剣に誓いましょう。";
	end;
OnTalk2:
	unittalk "近衛兵 : ……御意にございます、陛下。おや？　なにか外が騒がしいようですね。……!?　この匂いは血の匂い……。";
	end;
OnTalk3:
	unittalk "近衛兵 : 陛下!!　何かが起きていることは事実の模様……ここに居ては危険です!!　ひとまず、お部屋へお戻りください!!";
	end;
OnTalk4:
	unittalk "近衛兵 : 御意。……。姫の私室は2階、急がねば……。　彼女にもしものことがあれば私は……。";
	end;
}
1@spa.gat,41,207,4	script	黒づくめの男#dkf1	685,{/* 68731 */
	mes "‐全身黒づくめの";
	mes "　長い髪の男が";
	mes "　大きな剣を持ち";
	mes "　目の前の二人を";
	mes "　冷ややかな目で";
	mes "　見つめている……‐";
	close;
OnTalk1:
	unittalk "謎の声 : ほう……これは珍しい。アレを見ろ、アイツは生きた人間のようだぞ。";
	end;
OnTalk2:
	unittalk "黒づくめの男 : 人間だと……？　どうしてここに人間がいる。";
	end;
OnTalk3:
	unittalk "謎の声 : まあ待て。この人間の始末はいつでも可能なんだ。そう焦る必要もない。それに……観客は多いほうがいい。";
	end;
OnTalk4:
	unittalk "黒づくめの男 : ……そういうことらしい。ならば、お前に教えてやろう。この世界はある男の記憶だ。ゆえにお前がこいつらに干渉することは出来ない。";
	end;
OnTalk5:
	unittalk "黒づくめの男 : そこでこのバカな男の顛末を見届けるといい。ただし、干渉できないのはこのバカな男にだけだ。";
	end;
OnTalk6:
	unittalk "黒づくめの男 : モンスターどもはお前に干渉することが出来る。せいぜい殺されないようにするんだな。クックックック……。";
	end;
OnTalk7:
	unittalk "謎の声 : 人間は他人の不幸が好きらしいからな……。蜜をたっぷり吸い込んだ頃にまた会おうじゃないか。";
	end;
}
1@spa.gat,41,204,5	script	国王#dk	965,{/* 68732 */
	stopnpctimer;
	mes "‐先ほどの近衛兵がいたので";
	mes "　声をかけようとした瞬間……‐";
	next;
	mes "[謎の声]";
	mes "ほう……これは珍しい。";
	mes "アレを見ろ、アイツは生きた";
	mes "人間のようだぞ。";
	donpcevent getmdnpcname("黒づくめの男#dkf1")+ "::OnTalk1";
	next;
	mes "[黒づくめの男]";
	mes "人間だと……？";
	mes "どうしてここに人間がいる。";
	donpcevent getmdnpcname("黒づくめの男#dkf1")+ "::OnTalk2";
	next;
	mes "‐そんな言葉と共に";
	mes "　視線を感じそちらを見ると、";
	mes "　大きな剣を持った";
	mes "　一人の黒づくめの男が";
	mes "　こちらを見つめていた‐";
	cutin "sakray.bmp", 2;
	next;
	cutin "sakray.bmp", 255;
	mes "‐しかし何故だろう。";
	mes "　黒づくめの男の顔と声に";
	mes "　見覚えがある気がした。";
	mes "　どこかで会ったような";
	mes "　気がする……‐";
	next;
	mes "[謎の声]";
	mes "まあ待て。";
	mes "この人間の始末はいつでも";
	mes "可能なんだ。";
	mes "そう焦る必要もない。";
	mes "それに……";
	mes "観客は多いほうがいい。";
	donpcevent getmdnpcname("黒づくめの男#dkf1")+ "::OnTalk3";
	next;
	mes "‐驚いたことに、その声は";
	mes "　^FF0000禍々しい気を放つ一振りの";
	mes "　剣^000000から聞こえていた……‐";
	cutin "tartanos.bmp", 3;
	next;
	cutin "tartanos.bmp", 255;
	cutin "sakray.bmp", 2;
	mes "[黒づくめの男]";
	mes "……そういうことらしい。";
	mes "ならば、お前に教えてやろう。";
	mes "この世界はある男の記憶だ。";
	mes "ゆえにお前がこいつらに";
	mes "干渉することは出来ない。";
	donpcevent getmdnpcname("黒づくめの男#dkf1")+ "::OnTalk4";
	next;
	mes "[黒づくめの男]";
	mes "そこでこのバカな男の";
	mes "顛末を見届けるといい。";
	mes "ただし、干渉できないのは";
	mes "このバカな男にだけだ。";
	donpcevent getmdnpcname("黒づくめの男#dkf1")+ "::OnTalk5";
	next;
	mes "[黒づくめの男]";
	mes "モンスターどもはお前に";
	mes "干渉することが出来る。";
	mes "せいぜい殺されないように";
	mes "するんだな。";
	mes "クックックック……。";
	donpcevent getmdnpcname("黒づくめの男#dkf1")+ "::OnTalk6";
	next;
	cutin "tartanos.bmp", 3;
	mes "[謎の声]";
	mes "人間は他人の不幸が";
	mes "好きらしいからな……。";
	mes "蜜をたっぷり吸い込んだ";
	mes "頃にまた会おうじゃないか。";
	donpcevent getmdnpcname("黒づくめの男#dkf1")+ "::OnTalk7";
	next;
	cutin "tartanos.bmp", 255;
	misceffect 454, getmdnpcname("黒づくめの男#dkf1"); //68731
	hideonnpc getmdnpcname("黒づくめの男#dkf1"); //68731
	mes "‐そして男の姿が消えた途端、";
	mes "　止まっていた時が";
	mes "　動き出したような感覚に";
	mes "　襲われた‐";
	misceffect 454,"";
	next;
	mes "[国王]";
	mes "そなたを我が娘、ティアラ姫の";
	mes "直属の近衛兵として任命する。";
	mes "そなたの卓越した剣術と忠誠心を信じよう。";
	mes "姫をよろしく頼む。";
	unittalk "国王 : そなたを我が娘、ティアラ姫の直属の近衛兵として任命する。そなたの卓越した剣術と忠誠心を信じよう。姫をよろしく頼む。";
	next;
	mes "[近衛兵]";
	mes "ありがたき幸せ。";
	mes "……この命に代えましても";
	mes "必ずや姫をお守りすることを";
	mes "陛下と、この剣に誓いましょう。";
	donpcevent getmdnpcname("近衛兵#dk")+ "::OnTalk1";
	next;
	mes "[国王]";
	mes "幸多くも今、この城を";
	mes "訪れている隣国の王子と";
	mes "我が娘との縁談もまとまりつつある。";
	mes "この縁談がまとまれば、わが国は";
	mes "今後も末永く安泰であろう。";
	unittalk "国王 : 幸多くも今、この城を訪れている隣国の王子と我が娘との縁談もまとまりつつある。この縁談がまとまれば、わが国は今後も末永く安泰であろう。";
	next;
	mes "[国王]";
	mes "娘も今はこの縁談に";
	mes "あまり乗り気ではないようだが";
	mes "きっと必ずや、わかってくれる日が";
	mes "くるであろう。";
	mes "一国の王女としてなすべき";
	mes "ことは何かということを……。";
	unittalk "国王 : 娘も今はこの縁談にあまり乗り気ではないようだがきっと必ずや、わかってくれる日がくるであろう。一国の王女としてなすべきことは何かということを……。";
	next;
	mes "[近衛兵]";
	mes "……御意にございます、陛下。";
	mes "おや？";
	mes "なにか外が騒がしいようですね。";
	mes "……!?　この匂いは血の匂い……。";
	donpcevent getmdnpcname("近衛兵#dk")+ "::OnTalk2";
	next;
	mes "[国王]";
	mes "この音は、剣戟の音なのか!?";
	mes "どうした！　なにが起こっているのだ!?";
	mes "誰か報告をするのだ！";
	unittalk "国王 : この音は、剣戟の音なのか!?　どうした！　なにが起こっているのだ!?　誰か報告をするのだ！";
	next;
	mes "[近衛兵]";
	mes "陛下!!";
	mes "何かが起きていることは";
	mes "事実の模様……";
	mes "ここに居ては危険です!!";
	mes "ひとまず、お部屋へお戻りください!!";
	donpcevent getmdnpcname("近衛兵#dk")+ "::OnTalk3";
	next;
	mes "‐さっき見た黒づくめの男が";
	mes "　言っていたモンスターという";
	mes "　言葉が脳裏を過ぎる。";
	mes "　今回の騒動と何か";
	mes "　関係があるのだろうか……？‐";
	next;
	mes "[国王]";
	mes "私のことは心配ない。";
	mes "それよりもそなたは、娘を……";
	mes "ティアラ姫を守ってやってくれ!!";
	unittalk "国王 : 私のことは心配ない。それよりもそなたは、娘を……ティアラ姫を守ってやってくれ!!";
	next;
	mes "[近衛兵]";
	mes "御意。";
	mes "……。";
	mes "姫の私室は2階、急がねば……。";
	mes "彼女にもしものことがあれば私は……。";
	donpcevent getmdnpcname("近衛兵#dk")+ "::OnTalk4";
	close2;
	hideonnpc getmdnpcname("国王#dk"); //68732
	hideonnpc getmdnpcname("近衛兵#dk"); //68730
	donpcevent getmdnpcname("#DK_NPCTimer1")+ "::OnStart";
	misceffect 904,"";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("国王#dk"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer1	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "若い男の声 : そうだ……。ティアラ姫の側で彼女を守ること。それだけが私の幸せ、生きがいだった。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer6000:
	announce "若い男の声 : しかし、突然のモンスターの襲来。これが全ての悲劇の始まりだった……。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	announce "‐時間が速く流れるような感覚の後、北で何かが開くような音がした‐", 0x9, 0xffff00, 0x190, 20, 0, 0;
	misceffect 35, getmdnpcname("亡霊の王宮2階"); //68734
	hideoffnpc getmdnpcname("亡霊の王宮2階"); //68734
	donpcevent getmdnpcname("近衛兵#dk1")+ "::OnStart";
	end;
}

1@spa.gat,41,217,0	warp	亡霊の王宮2階	2,2,1@spa.gat,114,120 //68734 from_pos=(41, 217)

1@spa.gat,135,125,3	script	ティアラ姫#dk	640,{/* 68735 */
	mes "‐美しい女性が佇んでいる。";
	mes "　どこか儚げに見えるのは";
	mes "　気のせいだろうか？‐";
	close;
OnTalk1:
	unittalk "ティアラ姫 : この城にモンスターが入り込んだと、侍女から聞きました……。それで、お父様はご無事なのですね？";
	end;
OnTalk2:
	unittalk "ティアラ姫 : ……私にとって安全で安心な場所は一つしかありません。それは昔から、ずっと変わってはおりません……。";
	end;
OnTalk3:
	unittalk "ティアラ姫 : ……ごめんなさい。モンスターが城を襲うなど、今までなかったことが起きたせいでいやな予感がぬぐえないのです……。なにか悪いことがおきそうで……。";
	end;
OnTalk4:
	unittalk "ティアラ姫 : モンスターがこの城を襲った理由は定かではありません。そしてこのような時に、貴方にこのようなことを聞くのは不謹慎かもしれないのですが……。";
	end;
OnTalk5:
	unittalk "ティアラ姫 : ……お聞かせください。あなたにとっても私は、顔も知らない隣国の殿方と結婚の契りを交わすことが望みなのでしょうか……。私は……。私の望みはあなたと……。";
	end;
}
1@spa.gat,132,122,7	script	近衛兵#dk1	686,{/* 68736 */
	stopnpctimer;
	mes "[近衛兵]";
	mes "……姫様、ご無事でなによりです。";
	unittalk "近衛兵 : ……姫様、ご無事でなによりです。";
	next;
	mes "[ティアラ姫]";
	mes "この城にモンスターが入り込んだと、";
	mes "侍女から聞きました……。";
	mes "それで、お父様はご無事なのですね？";
	donpcevent getmdnpcname("ティアラ姫#dk")+ "::OnTalk1";
	next;
	mes "[近衛兵]";
	mes "ご安心ください。";
	mes "陛下は無事です。";
	mes "姫様もここではなく";
	mes "もう少し安全な場所に参りましょう。";
	mes "このままでは";
	mes "いつ危険な目にあうか……。";
	unittalk "近衛兵 : ご安心ください。陛下は無事です。姫様もここではなくもう少し安全な場所に参りましょう。このままではいつ危険な目にあうか……。";
	next;
	mes "[ティアラ姫]";
	mes "……私にとって安全で安心な場所は";
	mes "一つしかありません。";
	mes "それは昔から、ずっと変わっては";
	mes "おりません……。";
	donpcevent getmdnpcname("ティアラ姫#dk")+ "::OnTalk2";
	next;
	mes "[近衛兵]";
	mes "ティアラ姫……。";
	unittalk "近衛兵 : ティアラ姫……。";
	next;
	mes "‐ティアラ姫と近衛兵の間に";
	mes "　主従関係を超えた";
	mes "　空気と距離感を感じる‐";
	next;
	mes "[ティアラ姫]";
	mes "……ごめんなさい。";
	mes "モンスターが城を襲うなど、";
	mes "今までなかったことが起きたせいで";
	mes "いやな予感がぬぐえないのです……。";
	mes "なにか悪いことがおきそうで……。";
	donpcevent getmdnpcname("ティアラ姫#dk")+ "::OnTalk3";
	next;
	mes "[近衛兵]";
	mes "姫様、不安を感じるのは";
	mes "よくわかります。";
	mes "ですが姫様は、今後";
	mes "この国を背負って立つお方です。";
	mes "どうか気をしっかりもち、隣国の";
	mes "あの方の、よき伴侶になってください……。";
	unittalk "近衛兵 : 姫様、不安を感じるのはよくわかります。ですが姫様は、今後この国を背負って立つお方です。どうか気をしっかりもち、隣国のあの方の、よき伴侶になってください……。";
	next;
	mes "[ティアラ姫]";
	mes "モンスターがこの城を襲った";
	mes "理由は定かではありません。";
	mes "そしてこのような時に、";
	mes "貴方にこのようなことを聞くのは";
	mes "不謹慎かもしれないのですが……。";
	donpcevent getmdnpcname("ティアラ姫#dk")+ "::OnTalk4";
	next;
	mes "[ティアラ姫]";
	mes "……お聞かせください。";
	mes "あなたにとっても私は、顔も知らない";
	mes "隣国の殿方と結婚の契りを交わすことが";
	mes "望みなのでしょうか……。";
	mes "私は……。";
	mes "私の望みはあなたと……。";
	donpcevent getmdnpcname("ティアラ姫#dk")+ "::OnTalk5";
	next;
	mes "[近衛兵]";
	mes "……姫様。";
	mes "わ、私は……。";
	unittalk "近衛兵 : ……姫様。わ、私は……。";
	next;
	mes "[近衛兵]";
	mes "!?";
	mes "騒音が……近い!!";
	unittalk "近衛兵 : !?　騒音が……近い!!";
	next;
	mes "‐剣戟と人々の叫び声が";
	mes "　すぐ側に迫っているのが";
	mes "　聞こえた！‐";
	next;
	mes "[近衛兵]";
	mes "姫様！";
	mes "安全な場所までお送りします!!";
	mes "……参りましょう！";
	unittalk "近衛兵 : 姫様！　安全な場所までお送りします!!……参りましょう！";
	close2;
	hideonnpc getmdnpcname("近衛兵#dk1"); //68736
	hideonnpc getmdnpcname("ティアラ姫#dk"); //68735
	misceffect 904,""; //self
	donpcevent getmdnpcname("#DK_NPCTimer2")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("近衛兵#dk1"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer2	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "若い男の声 : 美しく聡明なティアラ姫……私は……私は……。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer6000:
	announce "若い男の声 : 願わくば貴女と、永遠の時を過ごしたかった……。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	hideoffnpc getmdnpcname("隣国の王子#dk3"); //68738
	end;
}

1@spa.gat,111,133,5	script	隣国の王子#dk3	470,7,7,{/* 68738 (hide)*/
	mes "‐仕立てられた上品そうな";
	mes "　服を着た男が、不気味な笑顔を";
	mes "　浮かべながら笑っている‐";
	close;
OnTouch:
	mes "[隣国の王子]";
	mes "あの近衛兵は使えそうだ。";
	mes "とりあえず彼には今回の";
	mes "モンスターの襲撃事件の";
	mes "首謀者という役でも";
	mes "担っていただこう……。";
	mes "ククククク。";
	unittalk "隣国の王子 : あの近衛兵は使えそうだ。とりあえず彼には今回のモンスターの襲撃事件の首謀者という役でも担っていただこう。ククククク。";
	close2;
	announce "‐時間が速く流れるような感覚の後、北で何かが開くような音がした‐", 0x9, 0xffff00, 0x190, 20, 0, 0;
	misceffect 35, getmdnpcname("亡霊の王宮3階"); //68739
	hideoffnpc getmdnpcname("亡霊の王宮3階"); //68739
	donpcevent getmdnpcname("国王#dk1")+ "::OnStart";
	end;
}
1@spa.gat,117,137,0	warp	亡霊の王宮3階	2,2,1@spa.gat,60,43 //68739 from_pos=(119, 135)

1@spa.gat,28,52,7	script	騎士団長#dk	418,{/* 68740 */
	mes "‐男は苦渋の色を浮かべた表情で、";
	mes "　近衛兵を見つめている……‐";
	close;
}
1@spa.gat,25,53,7	script	兵士#dk1	413,{/* 68741 */
	mes "‐男は苦渋の色を浮かべた表情で、";
	mes "　近衛兵を見つめている……‐";
	close;
}
1@spa.gat,34,53,1	script	兵士#dk2	413,{/* 68742 */
	mes "‐男は戸惑いの表情で、";
	mes "　近衛兵を見つめている……‐";
	close;
}
1@spa.gat,30,52,7	script	兵士#dk3	417,{/* 68743 */
	mes "‐男は戸惑いの表情で、";
	mes "　近衛兵を見つめている……‐";
	close;
}
1@spa.gat,30,58,5	script	近衛兵#dk2	10018,{/* 68744 */
	mes "‐鎖にしっかりと繋がれ、";
	mes "　身動きがとれないようだ‐";
	close;
OnTalk1:
	unittalk "近衛兵 : 誤解です！　陛下！　私は……私は断じて陛下を、この国を裏切るような行為はおこなっておりません！";
	end;
OnTalk2:
	unittalk "近衛兵 : そ、それは……。";
	end;
OnTalk3:
	unittalk "近衛兵 : ティアラ姫……。私の者のようなもののために……。";
	end;
}
1@spa.gat,32,54,1	script	国王#dk1	965,{/* 68745 */
	stopnpctimer;
	mes "[国王]";
	mes "ここにモンスターを呼び寄せたのが";
	mes "まさかそなただったとは……。";
	mes "一番信頼していたそなたに";
	mes "まさか裏切られるとは……な。";
	unittalk "国王 : ここにモンスターを呼び寄せたのがまさかそなただったとは……。一番信頼していたそなたにまさか裏切られるとは……な。";
	next;
	mes "[近衛兵]";
	mes "誤解です！　陛下！";
	mes "私は……私は断じて";
	mes "陛下を、この国を裏切るような";
	mes "行為はおこなっておりません！";
	donpcevent getmdnpcname("近衛兵#dk2")+ "::OnTalk1";
	next;
	mes "[国王]";
	mes "私もそなたを信じたい気持ちはある。";
	mes "しかし、あの方が嘘をつく理由がない。";
	mes "今一度、問おう。";
	mes "そなたに、その理由を説明できるのか？";
	unittalk "国王 : 私もそなたを信じたい気持ちはある。しかし、あの方が嘘をつく理由がない。今一度、問おう。そなたに、その理由を説明できるのか？";
	next;
	mes "[近衛兵]";
	mes "そ、それは……。";
	donpcevent getmdnpcname("近衛兵#dk2")+ "::OnTalk2";
	next;
	mes "[国王]";
	mes "そなたのこれまでの働きに免じ";
	mes "命までは、奪わん。";
	mes "我が娘もこのことを聞いてから";
	mes "床に伏した状態が続いている。";
	mes "そなたの命を奪ったと知れば";
	mes "命を落としかねないほどに……な。";
	unittalk "国王 : そなたのこれまでの働きに免じ命までは、奪わん。我が娘もこのことを聞いてから床に伏した状態が続いている。そなたの命を奪ったと知れば命を落としかねないほどに……な。";
	next;
	mes "[近衛兵]";
	mes "ティアラ姫……。";
	mes "私のようなもののために……。";
	donpcevent getmdnpcname("近衛兵#dk2")+ "::OnTalk3";
	close2;
	hideonnpc getmdnpcname("国王#dk1"); //68745
	hideonnpc getmdnpcname("近衛兵#dk2"); //68744
	hideonnpc getmdnpcname("騎士団長#dk"); //68740
	hideonnpc getmdnpcname("兵士#dk1"); //68741
	hideonnpc getmdnpcname("兵士#dk2"); //68742
	hideonnpc getmdnpcname("兵士#dk3"); //68743
	hideoffnpc getmdnpcname("近衛兵#dk3"); //68747
	hideoffnpc getmdnpcname("魔剣タルタノス#dkt"); //68748
	donpcevent getmdnpcname("#DK_NPCTimer3")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("国王#dk1"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer3	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "不吉な声 : この場所に珍しく人間が来たと思えば……クックック。忠誠心高き近衛兵よ、謀られたな。", 0x9, 0xff0000, 0x190, 16, 0, 0;
	misceffect 885, getmdnpcname("魔剣タルタノス#dkt"); //68748
	misceffect 829, getmdnpcname("魔剣タルタノス#dkt"); //68748
	end;
OnTimer6000:
	unittalk "近衛兵 : 誰だ……。誰が私に語りかけている……。私のことは放っておいてくれ……。";
	end;
OnTimer9000:
	announce "不吉な声 : 後から来た身分で、随分なご挨拶だな。我はこの世を支配するために生まれた剣、タルタノス。", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer12000:
	announce "魔剣タルタノス : もし貴様がこの状況からの脱却を願うのであれば、我と契約をするといい。さすれば命の危険が迫る姫君もまだ、助かるかもしれぬぞ？", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer15000:
	unittalk "近衛兵 : 契約？　どうして、私が契約を……！　それよりも何故だ!!　何故、姫に危険が迫っている!!";
	end;
OnTimer18000:
	announce "魔剣タルタノス : 特別にもう一つ教えてやろう。貴様を陥れた相手……それこそ、あの隣国の王子だ。", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer21000:
	unittalk "近衛兵 : ……隣国の王子……!?　やはりあの時見た人影は……！　……クッ……！　この鎖さえなければ……!!";
	end;
OnTimer24000:
	announce "魔剣タルタノス : クックックッ。まだ我が言葉が信じられぬようだな。しかしそうでなくては、面白くない。", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer27000:
	announce "魔剣タルタノス : では、今回だけ特別だ。面白いショーを見せてやろう。……我を手に取れ。さすれば、わかるだろう。", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer30000:
	announce "若い男の声 : 魔剣タルタノスとの邂逅……。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer33000:
	announce "若い男の声 : 魔剣を手に取る私の心にあったのは果たして姫への想いか、それとも……。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer36000:
	stopnpctimer;
	hideonnpc getmdnpcname("近衛兵#dk3"); //68747
	hideonnpc getmdnpcname("魔剣タルタノス#dkt"); //68748
	hideoffnpc getmdnpcname("亡霊の王宮4階"); //68749
	donpcevent getmdnpcname("近衛兵#dk4")+ "::OnStart";
	announce "‐時間が速く流れるような感覚の後、南東で何かが開くような音がした‐", 0x9, 0xffff00, 0x190, 20, 0, 0;
	end;
}

1@spa.gat,31,57,5	script	近衛兵#dk3	10018,{/* 68747 (hide)*/}
1@spa.gat,35,56,5	script	魔剣タルタノス#dkt	844,{/* 68748 (hide)*/}
1@spa.gat,54,28,0	warp	亡霊の王宮4階	2,2,1@spa.gat,218,186 //68749 from_pos=(54, 30)

1@spa.gat,201,214,1	script	魔剣タルタノス#dkt1	1205,{/* 68750 */
	end;
OnTalk1:
	unittalk "魔剣タルタノス : ……その言葉に嘘はないな？　貴様と我はいまこの時から魂をともにし、我は貴様に力を与えよう！　貴様は我に血を捧げるのだ！";
	end;
OnTalk2:
	unittalk "魔剣タルタノス : 愛しの姫君はどうやら牢獄に幽閉されているようだぞ。";
	end;
}
1@spa.gat,197,218,5	script	隣国の王子#dk	470,{/* 68751 */
	mes "‐不適な笑みを浮かべ";
	mes "　近衛兵を見つめている‐";
	close;
OnTalk1:
	unittalk "隣国の王子 : 随分と遅かったね。君があまりにも遅いからうっかり問い詰めてきた僕の義理の父と家来を殺める結果になってしまったじゃないか。";
	end;
OnTalk2:
	unittalk "隣国の王子 : しかし、人の命なんて安いものさ。そう、君がその手に握っているその剣。呪われし魔剣タルタノスに比べたらね。……この国にそれがあると知ってから僕がどれだけその魔剣を探し求めたことか……。";
	end;
OnTalk3:
	unittalk "隣国の王子 : 誰に聞いたのか知らないけれど君のいっていることは概ね正解かな。ただ、僕だってできれば命を奪うなんて野蛮なことは避けたかったんだよ？";
	end;
OnTalk4:
	unittalk "隣国の王子 : 許婚だとかいうあの姫も近衛兵の君はそんな人じゃないって泣きながら訴えてくるしさ。あんまりにもうるさいからある場所に一人で留守番してもらっているよ。";
	end;
OnTalk5:
	unittalk "隣国の王子 : なぜだ!?　呪われし魔剣タルタノスよ！　お前が仕えるべき主人はそいつじゃなくこの僕のほうが相応しいはず!!　なぜそれがわからない!?";
	end;
OnTalk6:
	unittalk "隣国の王子 : 待てっ!!　どうして僕を無視する!!　お前達も母上や父上のように僕を無能だと思ってるんだな!?　……いいだろう。僕の本当の姿を見せてやる!!";
	end;
OnTalk7:
	unittalk "呪いの根源 : グオオオオ……ッ！　見るがいい、これが僕の本当の力!!　魔剣を……世界を……統べる新しい世界の王となる者!";
	end;
OnTalk8:
	unittalk "呪いの根源 : では、魔剣を置いていけっ!! 貴様には不要なもののはず!!　何よりその魔剣を使って、あの女を助けようなど今更手遅れだ!!";
	end;
OnTalk9:
	unittalk "呪いの根源 : あの女が悪いんだよッ!!　僕が魔物を呼び込んでるとこを見た上に、誰にも殴られたことがないこの僕を殴ったんだ……この僕を……。卑怯者っていいながらさぁ……？　許せない……許せないよ……。";
	end;
}
1@spa.gat,197,218,5	script	呪いの根源#dk	2959,{/* 68752 (hide)*/}
1@spa.gat,194,214,5	script	倒れた国王#dk	956,{/* 68753 */
	mes "‐返事がない……。";
	mes "　殺されて間もないようだ‐";
	close;
}
1@spa.gat,211,194,3	script	倒れた騎士団長#dk	887,{/* 68754 */
	mes "‐返事がない……。";
	mes "　殺されて間もないようだ‐";
	close;
}
1@spa.gat,201,198,1	script	倒れた兵士#dk	849,{/* 68755 */
	mes "‐返事がない……。";
	mes "　殺されて間もないようだ‐";
	close;
}
1@spa.gat,197,190,1	script	倒れた兵士#dk1	849,{/* 68756 */
	mes "‐返事がない……。";
	mes "　殺されて間もないようだ‐";
	close;
}
1@spa.gat,191,207,7	script	倒れた兵士#dk2	849,{/* 68757 */
	mes "‐返事がない……。";
	mes "　殺されて間もないようだ‐";
	close;
}
1@spa.gat,206,209,7	script	倒れた兵士#dk3	849,{/* 68758 */
	mes "‐返事がない……。";
	mes "　殺されて間もないようだ‐";
	close;
}
1@spa.gat,189,195,1	script	倒れた兵士#dk4	849,{/* 68759 */
	mes "‐返事がない……。";
	mes "　殺されて間もないようだ‐";
	close;
}
1@spa.gat,199,214,1	script	近衛兵#dk4	686,{/* 68760 */
	stopnpctimer;
	mes "‐隣国の王子と近衛兵が";
	mes "　話しているのが見える‐";
	next;
	mes "[近衛兵]";
	mes "……あなたが我が主に嘘を伝え";
	mes "私を今回の事件の首謀者として";
	mes "仕立て上げたというのは本当ですか。";
	unittalk "近衛兵 : ……あなたが我が主に嘘を伝え私を今回の事件の首謀者として仕立て上げたというのは本当ですか。";
	next;
	mes "[隣国の王子]";
	mes "随分と遅かったね。";
	mes "君があまりにも遅いから";
	mes "うっかり問い詰めてきた";
	mes "僕の義理の父と家来を殺める結果に";
	mes "なってしまったじゃないか。";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk1";
	next;
	mes "[隣国の王子]";
	mes "しかし、人の命なんて安いものさ。";
	mes "そう、君がその手に握っているその剣。";
	mes "呪われし魔剣タルタノスに比べたらね。";
	mes "……この国にそれがあると知ってから";
	mes "僕がどれだけその魔剣を";
	mes "探し求めたことか……。";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk2";
	next;
	mes "[近衛兵]";
	mes "この剣を手に入れるためだけに";
	mes "あなたは国王を騙し、私を陥れ";
	mes "この城にモンスターを呼び込み";
	mes "我らが同胞の命を奪い、";
	mes "ティアラ姫まで、危険な目に";
	mes "あわせようとしたのか!?";
	unittalk "近衛兵 : この剣を手に入れるためだけにあなたは国王を騙し、私を陥れこの城にモンスターを呼び込み我らが同胞の命を奪い、ティアラ姫まで、危険な目にあわせようとしたのか!?";
	next;
	mes "[隣国の王子]";
	mes "誰に聞いたのか知らないけれど";
	mes "君のいっていることは概ね正解かな。";
	mes "ただ、僕だってできれば命を奪うなんて";
	mes "野蛮なことは避けたかったんだよ？";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk3";
	next;
	mes "[隣国の王子]";
	mes "許婚だとかいうあの姫も";
	mes "近衛兵の君はそんな人じゃないって";
	mes "泣きながら訴えてくるしさ。";
	mes "あんまりにもうるさいから";
	mes "ある場所に一人で";
	mes "留守番してもらっているよ。";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk4";
	next;
	mes "[近衛兵]";
	mes "……そうか。";
	mes "これで納得がいった。";
	mes "お前が私にいったことは";
	mes "正しかったようだな、魔剣タルタノス。";
	mes "改めて……契約成立だ。";
	unittalk "近衛兵 : ……そうか。これで納得がいった。お前が私にいったことは正しかったようだな、魔剣タルタノス。改めて……契約成立だ。";
	next;
	cutin "tartanos.bmp", 3;
	mes "[魔剣タルタノス]";
	mes "……その言葉に嘘はないな？";
	mes "貴様と我はいまこの時から魂をともにし、";
	mes "我は貴様に力を与えよう！";
	mes "貴様は我に血を捧げるのだ！";
	donpcevent getmdnpcname("魔剣タルタノス#dkt1")+ "::OnTalk1";
	next;
	cutin "tartanos.bmp", 255;
	mes "[隣国の王子]";
	mes "なぜだ!?";
	mes "呪われし魔剣タルタノスよ！";
	mes "お前が仕えるべき主人はそいつではなく";
	mes "この僕のほうが相応しいはず!!";
	mes "なぜそれがわからない!?";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk5";
	next;
	mes "[近衛兵]";
	mes "お前に時間をかけるほど、暇ではない。";
	mes "……私はティアラ姫を探す。";
	unittalk "近衛兵 : お前に時間をかけるほど、暇ではない。……私はティアラ姫を探す。";
	next;
	mes "[魔剣タルタノス]";
	mes "愛しの姫君はどうやら";
	mes "牢獄に幽閉されて";
	mes "いるようだぞ。";
	donpcevent getmdnpcname("魔剣タルタノス#dkt1")+ "::OnTalk2";
	next;
	mes "[隣国の王子]";
	mes "待てっ!!";
	mes "どうして僕を無視する!!";
	mes "お前達も母上や父上のように";
	mes "僕を無能だと思ってるんだな!?";
	mes "……いいだろう。";
	mes "僕の本当の姿を見せてやる!!";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk6";
	next;
	cutin "tartanos.bmp", 255;
	misceffect 276, getmdnpcname("隣国の王子#dk"); //68751
	hideonnpc getmdnpcname("隣国の王子#dk"); //68751
	hideoffnpc getmdnpcname("呪いの根源#dk"); //68752
	mes "[呪いの根源]";
	mes "グオオオオ……ッ！";
	mes "見るがいい、これが僕の";
	mes "本当の力!!";
	mes "魔剣を……世界を……";
	mes "統べる新しい世界の王となる者!";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk7";
	next;
	mes "[近衛兵]";
	mes "新しい世界の王だと……？";
	mes "……くだらない……。";
	mes "私はそんなもの、興味はない。";
	mes "安心しろ。";
	unittalk "近衛兵 : 新しい世界の王だと……？　……くだらない……。私はそんなもの、興味はない。安心しろ。";
	next;
	mes "[呪いの根源]";
	mes "では、魔剣を置いていけっ!!";
	mes "貴様には不要なもののはず!!";
	mes "何よりその魔剣を使って、";
	mes "あの女を助けようなど今更";
	mes "手遅れだ!!";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk8";
	next;
	mes "[近衛兵]";
	mes "姫に……彼女に……";
	mes "何をした……ッ!!";
	unittalk "近衛兵 : 姫に……彼女に……何をした……ッ!!";
	next;
	mes "[呪いの根源]";
	mes "あの女が悪いんだよッ!!";
	mes "僕が魔物を呼び込んでるとこを";
	mes "見た上に、誰にも殴られたことがない";
	mes "この僕を殴ったんだ……この僕を……。";
	mes "卑怯者っていいながらさぁ……？";
	mes "許せない……許せないよ……。";
	donpcevent getmdnpcname("隣国の王子#dk")+ "::OnTalk9";
	next;
	mes "[近衛兵]";
	mes "……こんな奴に……こんな奴に……";
	mes "姫が……国王が……ッ!!";
	unittalk "近衛兵 : ……こんな奴に……こんな奴に……姫が……国王が……ッ!!";
	next;
	mes "[近衛兵]";
	mes "その小汚い姿を私の前に";
	mes "晒すな、失せろ……！";
	unittalk "近衛兵 : その小汚い姿を私の前に晒すな、失せろ……！";
	next;
	mes "‐近衛兵が隣国の王子に";
	mes "　一太刀浴びせると";
	mes "　隣国の王子は跡形もなく";
	mes "　消滅してしまった‐";
	misceffect 565, getmdnpcname("呪いの根源#dk"); //68752
	hideonnpc getmdnpcname("呪いの根源#dk"); //68752
	close2;
	hideonnpc getmdnpcname("近衛兵#dk4"); //68760
	hideonnpc getmdnpcname("魔剣タルタノス#dkt1"); //68750
	hideonnpc getmdnpcname("倒れた国王#dk"); //68753
	hideonnpc getmdnpcname("倒れた騎士団長#dk"); //68754
	hideonnpc getmdnpcname("倒れた兵士#dk"); //68755
	hideonnpc getmdnpcname("倒れた兵士#dk1"); //68756
	hideonnpc getmdnpcname("倒れた兵士#dk2"); //68757
	hideonnpc getmdnpcname("倒れた兵士#dk3"); //68758
	hideonnpc getmdnpcname("倒れた兵士#dk4"); //68759
	donpcevent getmdnpcname("#DK_NPCTimer4")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("近衛兵#dk4"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer4	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "若い男の声 : もっと力があれば、違った未来が待っていたのだろうか……。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer6000:
	announce "若い男の声 : 私は残酷な運命を、理不尽な世界を、そして無力な己を呪っていた。", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	hideoffnpc getmdnpcname("亡霊の王宮5階"); //68762
	announce "‐時間が速く流れるような感覚の後、南西で何かが開くような音がした‐", 0x9, 0xffff00, 0x190, 20, 0, 0;
	end;
}

1@spa.gat,178,186,0	script	亡霊の王宮5階	45,{/* 68762 (hide)*/}
