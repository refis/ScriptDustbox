ice_d03_i.gat,0,0,0,0	monster	怒りのスノウアー	3793,80,0,0,0
ice_d03_i.gat,0,0,0,0	monster	怒りのアイスタイタン	3794,80,0,0,0
ice_d03_i.gat,0,0,0,0	monster	怒りのゲイズティ	3792,80,0,0,0
ice_d03_i.gat,0,0,0,0	monster	鋭いアイシクル	3795,20,0,0,0

//鋭いアイシクル,怒りのゲイズティ,怒りのアイスタイタン,計10体ランダム沸き

//@spawn(type: BL_MOB, ID: 10690, speed: 300, option: 0, view: 3792, pos: "ice_d03_i.gat"(152, 41), dir: 2, name: "怒りのゲイズティ")
//@spawn(type: BL_MOB, ID: 10748, speed: 250, option: 0, view: 3793, pos: "ice_d03_i.gat"(141, 49), dir: 2, name: "怒りのスノウアー")
//@spawn(type: BL_MOB, ID: 10882, speed: 280, option: 0, view: 3794, pos: "ice_d03_i.gat"(117, 44), dir: 2, name: "怒りのアイスタイタン")
//@spawn(type: BL_MOB, ID: 10915, speed: 2000, option: 0, view: 3795, pos: "ice_d03_i.gat"(163, 46), dir: 0, name: "鋭いアイシクル")

ice_dun02.gat,150,11,1	script	#tofrozen	10237,{
	if(BaseLevel < 170) {
		//TODO
		close;
	}
	mes "- 精神がぼんやりしている。";
	mes "  まるで夢の中に入るみたいだ。 -";
	next;
	if(select("進入する","やめる") == 2) {
		mes "今はやめておこう。";
		close;
	}
	warp "ice_d03_i.gat",149,24;
	end;
}

ice_d03_i.gat,149,19,1	script	#fromfrozen	10237,{
	mes "元の場所に戻ることができる。";
	mes "どうしようかな？";
	next;
	if(select("戻る","戻らない") == 2) {
		mes "今はやめておこう。";
		close;
	}
	warp "ice_dun02.gat",150,17;
	end;
}

ice_d03_i.gat,152,43,0	script	cine1#frozen	139,13,13,{
OnTouch:
	if(IL_FROZEN_QUE <= 2) {
		cloakoffnpc "ブリド#frozen01";
		cloakoffnpc "ジェイス#frozen01";
	}
	else if(IL_FROZEN_QUE == 3) {
		cloakoffnpc "ブリド#frozen01";
		cloakoffnpc "ジェイス#frozen02";
	}
	else if(IL_FROZEN_QUE == 4) {
		cloakoffnpc "ブリド#frozen02";
		cloakoffnpc "ジェイス#frozen02";
	}
	else if(IL_FROZEN_QUE == 5) {
		if(checkquest(15115) & 2) {
			cloakoffnpc "ブリド#frozen01";
			cloakoffnpc "ジェイス#frozen01";
		}
	}
	end;
}

ice_d03_i.gat,150,43,5	script	ブリド#frozen01	10036,{
	if(IL_FROZEN_QUE == 3) {
		mes "[ブリド]";
		mes "まさか本当に壊せるとは……";
		mes "おいジェイス！大丈夫か？";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end
}

ice_d03_i.gat,150,43,5	script	ブリド#frozen02	468,{
	end;
OnInit:
	cloakonnpc;
	end
}

ice_d03_i.gat,155,43,3	script	ジェイス#frozen01	10035,{
	if(IL_FROZEN_QUE == 0) {
		mes "[ジェイス]";
		mes "ふぅ……このバカ野郎の所為で";
		mes "こんな目に合って……。";
		next;
		mes "[ブリド]";
		mes "いや可哀想じゃないか、あいつ。";
		mes "折角助けてやろうと";
		mes "手を差し伸べてやったのに";
		mes "私たちをこんな風にするとは！";
		mes "私も被害者だぞ！";
		next;
		mes "[ジェイス]";
		mes "あいつのどこが可哀想に見えるか";
		mes "全く理解し難いが……。";
		mes "兎に角、ここからどうやって";
		mes "脱出するかを考えなくちゃな。";
		mes "しくしく……。";
		next;
		emotion 28, "ジェイス#frozen01";
		mes "[ブリド]";
		mes "この氷、固過ぎて身動きが取れない。";
		mes "私たちだけじゃ、";
		mes "ここから出るのは難しそうだな。";
		mes "近くに助けてくれそうな人は……";
		mes "あ！そこの君！";
		next;
		menu "私ですか？",-;
		mes "[ブリド]";
		mes "君以外に自由に動ける人がいるか？";
		mes "見ての通り、私たちは氷漬けにされて";
		mes "凄く困ってるんだよ。";
		mes "何故こうなったのかって？";
		mes "説明すると長くなるから";
		mes "先ずは助けてくれ。";
		next;
		menu "どうすればいい？",-;
		mes "[ブリド]";
		mes "素晴らしい質問だ！";
		mes "さぁ答えてあげな、ジェイス!";
		next;
		mes "[ジェイス]";
		mes "結局、私任せなのか。";
		mes "……火を使うしかないな。";
		next;
		mes "[ブリド]";
		mes "火だと？";
		mes "私は熱いのが嫌なんだよ！";
		mes "焼け死ぬだけだぞ！";
		next;
		mes "[ジェイス]";
		mes "氷を溶かす程度の火なら";
		mes "大丈夫だろ、多分。";
		mes "だからさ、うむ……新しい友よ……。";
		next;
		mes "[ジェイス]";
		mes "すまないが、この氷の洞窟にある";
		mes "土盛りの中から^ff0000乾いた木の枝^000000を";
		mes "集めてくれないか？";
		mes "10個ぐらいならいけそうな気がする。";
		next;
		mes "[ブリド]";
		mes "ああ…私たち2人とも焼死するぞ〜。";
		setquest 15110;
		set IL_FROZEN_QUE,1;
		close;
	}
	else if(IL_FROZEN_QUE == 1) {
		if(countitem(25309) < 10) {
			mes "[ジェイス]";
			mes "乾いた木の枝が10個必要だ。";
			mes "洞窟内に乾いた土盛りが";
			mes "ある筈だから";
			mes "そこを探してみてくれ。";
			close;
		}
		delitem 25309,10;
		chgquest 15110,15111;
		set IL_FROZEN_QUE,2;
		mes "[ジェイス]";
		mes "……乾いた木の枝を";
		mes "持ってきてくれたのか。";
		mes "そういえばお互い";
		mes "自己紹介もまだだったな。";
		mes "私はジェイス、そしてこちらは……";
		next;
		mes "[ブリド]";
		mes "ああ……";
		mes "私たち2人とも焼死するぞ……。";
		next;
		mes "[ジェイス]";
		mes "……ふぅ、こちらはブリド。";
		mes "君の名は何という？";
		next;
		menu strcharinfo(0)+"です。",-;
		mes "[ジェイス]";
		mes strcharinfo(0)+"…いい名前だ。";
		mes "先ず持ってきた乾いた木の枝に";
		mes "火を付け氷を溶かしてみるか。";
		mes "先にこいつで試すのがいいかも。";
		next;
		mes "[ブリド]";
		mes "うわぁぁぁ！この悪魔め！";
		mes "私は絶対やらないぞ！";
		mes "いっそ私を殺せ！";
		next;
		mes "[ジェイス]";
		mes "…まぁいい。私から先に試そう。";
		mes "乾いた木の枝に火を付けて、";
		mes "私の近くに置いてくれないか？";
		mes "念のために先に言っておくが";
		mes "火を近付け過ぎるなよ。";
		next;
		mes "- ^ff0000乾いた木の枝に火を付けた。";
		mes "  しばらく経ったが";
		mes "  氷は溶ける気がしない。^000000 -";
		next;
		mes "[ジェイス]";
		mes "魔法で凍らせた所為か";
		mes "全然溶けないな。";
		mes "ブリド、お前もぼけっとしないで";
		mes "何か方法を考えてみろ！";
		next;
		mes "[ブリド]";
		mes "やれやれ……";
		mes "君たちは頭が固いんだよ。";
		mes "氷には火。普通に考えればそうなる。";
		mes "しかし時には発想の転換が必要だ。";
		mes "氷をどう砕くかって？";
		mes "眼には眼を！氷には氷を！";
		next;
		mes "[ブリド]";
		mes "ここにいるモンスターの冷気を";
		mes "上手く利用すれば";
		mes "氷は砕け散るかも知れない！";
		mes "……多分。";
		next;
		mes "[ジェイス]";
		mes "……何だその常識ハズレな発想は";
		mes "しかも冷気を";
		mes "どう利用するつもりだよ？";
		next;
		mes "[ブリド]";
		mes "聞いて驚け！";
		mes "ブリド・レポート！";
		mes "怒りのアイスタイタンの巻！";
		next;
		mes "[ブリド]";
		mes "私の調査によると";
		mes "怒りのアイスタイタンは";
		mes "本来塵のように小さく";
		mes "愛おしいモンスターだった。";
		next;
		mes "[ブリド]";
		mes "しかし、この洞窟で";
		mes "長く生きることで";
		mes "体の氷が今みたいに";
		mes "大きくなったらしい。";
		next;
		mes "[ブリド]";
		mes "それじゃ不便で寒いよね！";
		mes strcharinfo(0);
		mes "君は、奴らの体が軽くなるよう";
		mes "体に付いてる氷を取ってくれ。";
		next;
		mes "[ブリド]";
		mes "そうすると奴らの出す冷気が";
		mes "君に移りその冷気の力で氷漬けにされた";
		mes "私たちを抱いてくれたら";
		mes "冷気の力で氷は砕け散るだろ。";
		mes "どうだ？いけそうじゃないか？";
		next;
		mes "[ジェイス]";
		mes "全然ちっとも、そうは思えないんだが。";
		mes "大体お前のブリド・レポートというのも、";
		mes "出所の分からない";
		mes "信じられない情報ばかりだし……。";
		next;
		mes "[ジェイス]";
		mes "はぁ……問題は他の方法が";
		mes "思い浮かばないことだよな。";
		mes "こいつの話を実行してみるしかなさそうだ。";
		mes "怒りのアイスタイタン10体を退治し";
		mes "ここに戻ってくれないか？";
		next;
		mes "[ブリド]";
		mes "これは退治ではない。";
		mes "人助けなんだよ!!";
		next;
		mes "[ジェイス]";
		mes "それはどうでもいい。";
		mes "兎に角、頼む。";
		close;
	}
	else if(IL_FROZEN_QUE == 2) {
		if(checkquest(15111) & 4 == 0) {
			mes "[ジェイス]";
			mes "怒りのアイスタイタンを";
			mes "10体退治してきてくれ。";
			close;
		}
		mes "[ブリド]";
		mes "おお、やっぱ私の言った通りだろ？";
		mes "見ろよ！全身から溢れだす";
		mes "凄まじい冷気を！";
		next;
		emotion 79,"";
		mes "[ジェイス]";
		mes "…寒くて震えてるようにしか見えないが…";
		next;
		mes "[ブリド]";
		mes "さぁ！その冷気を以て私たちを……";
		mes "もとい私を先に抱きしめてくれ！";
		mes "そしたらピカッと光り出して";
		mes "奇跡のように氷が割れるだろ。";
		mes "そんなこと、おとぎ話とかで";
		mes "よくあるだろ？";
		next;
		emotion 52,"";
		emotion 78, "ブリド#frozen01";
		mes "- ブリドの頼み通りに、";
		mes "  彼を閉じ込めた氷を抱きしめた。 -";
		mes "";
		mes "ピカッ！ ";
		mes "と光り出した気がしたが、気の所為だった。";
		mes "何も起こらなかった。";
		next;
		mes "[ブリド]";
		mes "う……寒っ。もう離れろ！";
		mes "凍死しそうだ！";
		next;
		mes "[ジェイス]";
		mes "そりゃそうだ。あんな";
		mes "屁理屈がまかり通る訳ないだろ！";
		mes "もとはお前のあんな";
		mes "バカげた話を信じて";
		mes "この洞窟に来たこと自体が";
		mes "全ての災難の始まりだったんだ！";
		next;
		menu "バカげた話？",-;
		mes "[ブリド]";
		mes "バカげた話だと？";
		mes "事実を述べただけさ！";
		mes "ブリド・レポート！";
		mes "氷の洞窟の謎の巻!!";
		next;
		mes "[ジェイス]";
		mes "はぁ……";
		next;
		mes "[ブリド]";
		mes "私の調査によると、ここは昔";
		mes "地下世界の王国だったらしい。";
		mes "洞窟の全てが黄金で出来てる";
		mes "凄い場所だった。";
		mes "エルドラドー！";
		next;
		mes "- ここでジェイスが呆れ顔になったが";
		mes "  ブリドは構わず話を続けた。 -";
		next;
		mes "[ブリド]";
		mes "宝を狙う外部の侵入者は";
		mes "増えるばかり……。";
		mes "悩む王様の前にある日";
		mes "王国の外から来た勇者が現れた。";
		next;
		mes "[ブリド]";
		mes "勇者は一人で侵入者たちを";
		mes "全員蹴散らした。";
		mes "王様は大喜びし、自分の娘と勇者を";
		mes "結婚させたらしい。";
		next;
		mes "[ブリド]";
		mes "しかしその勇者も宝を狙う悪党の一人で";
		mes "王国の至宝を持ち逃げしたという。";
		next;
		mes "[ブリド]";
		mes "裏切られ激怒した王様は";
		mes "洞窟を全て氷漬けにしてしまい";
		mes "誰も侵入出来ないよう";
		mes "恐ろしいモンスターたちを放した。";
		mes "そんな悲しい伝説があるんだ。";
		next;
		mes "[ブリド]";
		mes "も……もちろん私は";
		mes "宝を狙ってここに来たのではないぞ。";
		mes "通り過ぎるついでに";
		mes "気になって入っただけだぞ。";
		next;
		mes "[ジェイス]";
		mes "この前、私に話したのと";
		mes "内容が相当違うんだが。";
		mes "お前のバカげた話を";
		mes "鵜呑みした訳ではないけれど";
		mes "好奇心で入りこんな目に合うとはね。";
		next;
		mes "[ブリド]";
		mes "はっはっ！";
		mes "どちらにしてもこれで";
		mes "残った道は一つしかない！";
		mes "それはな……。";
		next;
		mes "[ジェイス]";
		mes "まだ試すようなバカなまねが";
		mes "残ってたのか！";
		next;
		mes "[ブリド]";
		mes "問答無用！砕け散るまで殴り続けたら、";
		mes "氷も無くなるんじゃない？";
		mes "だから先ずジェイスの氷の方から";
		mes "思いっきり頼むぞ！";
		next;
		mes "[ジェイス]";
		mes "結局力任せか！";
		mes "しかも私が先だとは……卑怯な奴！";
		mes "ふう、仕方がない。";
		mes "ゆっくり……いや、力いっぱいで頼む！";
		next;
		mes "- ジェイスを覆う氷を";
		mes "  力いっぱい殴りつけた！ -";
		chgquest 15111,15112;
		set IL_FROZEN_QUE,3;
		cloakonnpc "ジェイス#frozen01";
		cloakoffnpc "ジェイス#frozen02";
		misceffect 135, "ジェイス#frozen02";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end
}

ice_d03_i.gat,155,43,3	script	ジェイス#frozen02	467,{
	if(IL_FROZEN_QUE == 3) {
		mes "[ジェイス]";
		mes "まさかと思ったが";
		mes "本当に叩いて砕くとは。";
		next;
		mes "[ブリド]";
		mes "私の天才的な発想のお蔭だ！";
		mes "感謝しろよ、ジェイス。";
		next;
		mes "[ジェイス]";
		mes "ふっ自慢げに語る";
		mes "ところじゃなかろうに…";
		mes strcharinfo(0);
		mes "あんな奴は置いといて";
		mes "私たちだけここから出よう。";
		next;
		mes "[ブリド]";
		mes "ぇ……え？";
		mes "待て待て待て！";
		mes "それはないだろ、ジェイス！";
		mes "私たちの友情はこんなものだったのか？";
		next;
		mes "[ジェイス]";
		mes "ふぅ。できるならここに";
		mes "捨てて行きたいところだが仕方ない。";
		mes "私はまだ体が痺れるから";
		mes "代わりにこいつも頼む。";
		next;
		mes "- ブリドを覆う氷を";
		mes "  力いっぱい殴りつけた！ -";
		chgquest 15112,15113;
		set IL_FROZEN_QUE,4;
		cloakonnpc "ブリド#frozen01";
		cloakoffnpc "ブリド#frozen02";
		misceffect 135,"ブリド#frozen02";
		close;
	}
	else if(IL_FROZEN_QUE == 4) {
		mes "[ブリド]";
		mes "おお！お蔭で助かった！";
		mes "結構な実力者なんだな";
		mes "ありがとう、" +strcharinfo(0)+ "！";
		next;
		mes "[ジェイス]";
		mes "もうここから出よう。";
		mes "二度と同じ目に合いたくない。";
		next;
		mes "[ブリド]";
		mes "いやはや、復讐も果たさず逃げては";
		mes "勇者とは言えんぞ！";
		mes "私たちをあんな目に合わせた奴に復讐を！";
		next;
		mes "[ジェイス]";
		mes "復讐って……お前";
		mes "また氷漬けにされたいのか？";
		next;
		menu "復讐？",-;
		mes "[ジェイス]";
		mes "ふぅ……このバカが";
		mes "手を出してはいけない相手に";
		mes "触れてしまってな。";
		next;
		mes "[ブリド]";
		mes "いやはや、善意による行動を";
		mes "そう言われると寂しいぞ！";
		next;
		mes "[ジェイス]";
		mes "善意ってお前な";
		mes "誰が見てもあやつに";
		mes "手を出してはいけなかっただろ。";
		next;
		mes "[ブリド]";
		mes "さぁ、お聞きなさい。";
		mes "ブリド・レポート！不思議なトカゲの巻！";
		next;
		mes "[ブリド]";
		mes "前も話したことだが";
		mes "この氷の洞窟がまだ王国だった時代";
		mes "王様が可愛がってた";
		mes "ペットのトカゲがいたらしい。";
		next;
		mes "[ブリド]";
		mes "だが王様が怒り出して以来";
		mes "そのトカゲも王様の呪いを受け、";
		mes "醜い氷のトカゲになってしまったという。";
		next;
		mes "[ブリド]";
		mes "今も主の愛情に飢え、";
		mes "主を探し求め洞窟内を彷徨ってる。";
		mes "可哀想じゃん？";
		mes "そんな奴を撫でてあげる為に近づいた";
		mes "この優しさが、間違いだと言いたいのか!?";
		next;
		mes "[ジェイス]";
		mes "そんな訳分からない";
		mes "ブリド・レポートみたいな話は";
		mes "いったい何処から仕入れてきてるんだ。";
		mes "しかも、聞く度に話が";
		mes "少し変わってるようだが。";
		next;
		mes "[ジェイス]";
		mes "はぁ……兎に角、";
		mes "そんなトカゲが";
		mes "この洞窟にいるから気を付けてくれ。";
		next;
		mes "[ジェイス]";
		mes "奴は強いが、君みたいな";
		mes "実力者がパーティーを組めば";
		mes "倒せるだろう。";
		next;
		mes "[ジェイス]";
		mes "君と出会えてよかった。";
		mes strcharinfo(0);
		mes "機会があれば、また会おう。";
		next;
		mes "- さよならを言った瞬間";
		mes "  彼らはまるで霧のように";
		mes "  消え去って行った。";
		mes "  まるで始めから";
		mes "  存在しなかったかのように。";
		mes "  今まで夢でも見ていたんだろうか？ -";
		delquest 15113;
		setquest 15115;
		setquest 15116;
		delquest 15116;
		setquest 202080;
		set IL_FROZEN_QUE,5;
		getitem 25271,10;
		getexp 300000000,0,1;
		getexp 0,60000000,0;
		cloakonnpc "ブリド#frozen02";
		cloakonnpc "ジェイス#frozen02";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end
}

ice_d03_i.gat,64,231,3	script	乾いた土盛り#frozen1	557,{
	if(checkitemblank() == 0) {
		mes "‐所持アイテムの種類数が多いため、";
		mes "　アイテムを拾うことができない。";
		mes "　種類数を減らしてからまた調べよう‐";
		close;
	}
	if(IL_FROZEN_QUE != 1) {
		mes "- 特に何もないようだ。 -";
		close;
	}
	if(countitem(25309) >= 10) {
		mes "乾いた木の枝は全部揃った。";
		mes "ジェイスたちのところへ戻ろう。";
		close;
	}
	mes "^006400乾いた木の枝^000000を探すため";
	mes "土盛りに手を突っ込んだ。";
	next;
	progressbar 2;
	hideonnpc;
	initnpctimer;
	if(rand(10)) {
		getitem 25309,1;
		mes "^006400乾いた木の枝^000000を手に入れた。";
	}
	else
		mes "乾いた土盛りの中には、何も無かった。";
	close;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end
}

ice_d03_i.gat,100,246,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen2	557
ice_d03_i.gat,46,206,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen3	557
ice_d03_i.gat,84,208,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen4	557
ice_d03_i.gat,70,184,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen5	557
ice_d03_i.gat,112,188,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen6	557
ice_d03_i.gat,110,150,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen7	557
ice_d03_i.gat,238,231,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen8	557
ice_d03_i.gat,196,246,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen9	557
ice_d03_i.gat,252,206,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen10	557
ice_d03_i.gat,214,208,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen11	557
ice_d03_i.gat,228,184,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen12	557
ice_d03_i.gat,186,188,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen13	557
ice_d03_i.gat,150,187,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen14	557
ice_d03_i.gat,238,64,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen15	557
ice_d03_i.gat,219,90,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen16	557
ice_d03_i.gat,230,111,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen17	557
ice_d03_i.gat,186,44,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen18	557
ice_d03_i.gat,171,72,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen19	557
ice_d03_i.gat,189,112,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen20	557
ice_d03_i.gat,187,149,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen21	557
ice_d03_i.gat,65,70,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen22	557
ice_d03_i.gat,86,87,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen23	557
ice_d03_i.gat,70,113,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen24	557
ice_d03_i.gat,126,73,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen25	557
ice_d03_i.gat,111,45,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen26	557
ice_d03_i.gat,112,111,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen27	557
ice_d03_i.gat,150,104,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen28	557
ice_d03_i.gat,137,38,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen29	557
ice_d03_i.gat,160,48,3	duplicate(乾いた土盛り#frozen1)	乾いた土盛り#frozen30	557
