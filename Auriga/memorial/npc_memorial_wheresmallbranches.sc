//==============================================================================
// Where the Small Branches Memorial Dungeon Script
//==============================================================================
1@twig.gat,0,0,0	script	Twig_Control	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@map$,getmdmapname("1@twsd.gat");
	monster '@map$,219,152,"進入不可#219_152",3982,1;
	monster '@map$,221,152,"進入不可#221_152",3982,1;
	areasetcell '@map$,218,151,222,153,1;
	initnpctimer getmdnpcname("レハール#ep20twig_1");
	end;
}

1@twig.gat,220,150,3	script	入場管理#twig	10046,{
	if(distance(getcharid(3)) > 5) {
		unittalk getcharid(3),strcharinfo(0)+" : ここからは触れない。",1;
		end;
	}
	set '@accept,2;
	mes "^FF0000[インフォメーション]^000000";
	mes "^FF0000この先へは^000000";
	mes "^FF0000メモリアルダンジョンの^000000";
	mes "^FF0000入場条件を満たした^000000";
	mes "^FF0000異なるゲームアカウントの^000000";
	mes "^FF0000キャラクターが"+'@accept+"人まで、^000000";
	mes "^FF0000一緒に進むことができます。^000000";
	next;
	mes "[インフォメーション]";
	mes "進入しますか？";
	mes "　";
	mes "^4A0084‐進入キャラクター数： "+'@user+" / "+'@accept+"‐^000000";
	next;
	if(select("^0000ffはい^000000","いいえ") == 2) {
		mes "‐やめた‐";
		close;
	}
	mes "[インフォメーション]";
	mes "進入します。";
	close2;
	for('@i=0; '@i<'@user; '@i++) {
		if(.user_id['@i] == 0)
			break;
		if(.user_id['@i] == getcharid(3)) {	// 入場済みアカウント
			if(.char_id['@i] != getcharid(0)) {	// 別キャラはNG
				// 未調査
				mes "[インフォメーション]";
				mes "同じアカウントに入場済みキャラクターが存在します。";
				close;
			}
			break;
		}
	}
	if('@i == '@accept) {	// 入場上限
		// 未調査
		mes "[インフォメーション]";
		mes "これ以上入場することはできません。";
		close;
	}
	else if('@i == '@user) {	// 未登録
		set .user_id['@i],getcharid(3);
		set .char_id['@i],getcharid(0);
	}
	warp getmdmapname("1@twig.gat"), 220, 157;
	end;
}

1@twig.gat,207,178,5	script2(HIDDEN)	レハール#ep20twig_move	21519,{
	end;
OnStart:
	setarray '@walkpos,197,188,187,198,177,208,167,211,157,216,147,216,137,217,124,215,114,213,104,210,94,204,84,194,74,184;
	for('@i=0;'@i<getarraysize('@walkpos); set '@i,'@i+2) {
		if('@i == 5)
			unittalk "レハール : ここ、不思議な地形ですね！";
		npcwalkto '@walkpos['@i],'@walkpos['@i+1];
		npcwalkwait;
	}
	initnpctimer getmdnpcname("レハール#ep20twig_2");
	hideonnpc getmdnpcname("レハール#ep20twig_move");
	hideoffnpc getmdnpcname("レハール#ep20twig_2");
	unittalk "レハール : あれ、何かが道を塞いでいますね？";
	set .scean,1;
	end;
OnStart2:
	setarray '@walkpos,64,174,57,164,56,154,56,144,56,134,60,124,61,114,68,104,78,94,88,84,98,74,108,67,118,65,128,65;
	for('@i=0;'@i<getarraysize('@walkpos); set '@i,'@i+2) {
		if('@i == 7)
			unittalk "レハール : なぜ……こんなに長いのか？";
		npcwalkto '@walkpos['@i],'@walkpos['@i+1];
		npcwalkwait;
	}
	initnpctimer getmdnpcname("レハール#ep20twig_3");
	hideonnpc getmdnpcname("レハール#ep20twig_move");
	hideoffnpc getmdnpcname("レハール#ep20twig_3");
	unittalk "レハール : また現れました！";
	set .scean,3;
	end;
OnStart3:
	setarray '@walkpos,138,65,148,72,158,78,166,88,173,98,178,108,179,118,176,128,168,138,158,148,148,154,138,155,128,158;
	for('@i=0;'@i<getarraysize('@walkpos); set '@i,'@i+2) {
		if('@i == 4)
			unittalk "レハール : いったい、どこまで進めば……";
		if('@i == 13)
			unittalk "レハール : 見つけました！";
		npcwalkto '@walkpos['@i],'@walkpos['@i+1];
		npcwalkwait;
	}
	initnpctimer getmdnpcname("レオン#e20pn06");
	hideonnpc getmdnpcname("レハール#ep20twig_move");
	hideoffnpc getmdnpcname("レハール#ep20twig_4");
	set .scean,5;
	end;
OnInit:
	setnpcspeed 150;
	end;
}

1@twig.gat,207,178,5	script	レハール#ep20twig_1	21519,{
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "うわぁ、これってなに？";
	mes "こんな地形は初めて見ます！";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "あっちに足跡が見えますね。";
	mes "レオン様とオーレリー様は";
	mes "この道を通られたようです。";
	mes "私たちも行きましょう！";
	misceffect 211,"";
	next;
	mes "[レハール]";
	mes "さあ、急ぎましょう！";
	close2;
	hideonnpc getmdnpcname("レハール#ep20twig_1");
	hideoffnpc getmdnpcname("レハール#ep20twig_move");
	cutin "ep19_lehar01.png", 255;
	donpcevent getmdnpcname("レハール#ep20twig_move")+"::OnStart";
	stopnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twig.gat,74,184,3	script(HIDDEN)	レハール#ep20twig_2	21519,{
	if(.scean == 1) {
		if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled")) {
			unittalk "レハール : まだ敵が残っていますよ！";
			end;
		}
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "あれはガーディアン……？";
		mes "まるで私たちを邪魔するように";
		mes "立ってますね。";
		close2;
		hideonnpc getmdnpcname("Jガーディアン#twig_jg01");
		hideonnpc getmdnpcname("Jガーディアン#twig_jg02");
		hideonnpc getmdnpcname("Jガーディアン#twig_jg03");
		unittalk "レハール : ええ？　えええ？";
		cutin "ep19_lehar01.png", 255;
		stopnpctimer;
		donpcevent getmdnpcname("Twig_MobSpawn")+ "::OnStart";
		end;
	}
	if(.scean == 2) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "いきなり攻撃してくるとは";
		mes "思いませんでした！";
		mes "注意しながら進んだ方が良さそうです。";
		close2;
		misceffect 211,"";
		cutin "ep19_lehar01.png", 255;
		hideonnpc getmdnpcname("レハール#ep20twig_2");
		hideoffnpc getmdnpcname("レハール#ep20twig_move");
		cutin "ep19_lehar01.png", 255;
		donpcevent getmdnpcname("レハール#ep20twig_move")+"::OnStart2";
		stopnpctimer;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twig.gat,66,181,3	script	Jガーディアン#twig_jg01	21972,{}
1@twig.gat,62,182,3	script	Jガーディアン#twig_jg02	21973,{}
1@twig.gat,67,177,3	script	Jガーディアン#twig_jg03	21973,{}

1@twig.gat,128,65,5	script(HIDDEN)	レハール#ep20twig_3	21519,{
	if(.scean == 3) {
		if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled2")) {
			unittalk "レハール : まだ敵が残っていますよ！";
			end;
		}
		cutin "ep19_lehar04.png", 2;
		mes "[レハール]";
		mes "う……また、あいつらです。";
		mes "倒さないと先に進めそうにないですね。";
		close2;
		hideonnpc getmdnpcname("Jガーディアン#twig_jg04");
		hideonnpc getmdnpcname("Jガーディアン#twig_jg05");
		hideonnpc getmdnpcname("Jガーディアン#twig_jg06");
		cutin "ep19_lehar01.png", 255;
		stopnpctimer;
		donpcevent getmdnpcname("Twig_MobSpawn")+ "::OnStart2";
		end;
	}
	if(.scean == 4) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "レオン様とオーレリー様は";
		mes "どうやってここを通ったのでしょうか？";
		close2;
		misceffect 211,"";
		cutin "ep19_lehar01.png", 255;
		hideonnpc getmdnpcname("レハール#ep20twig_3");
		hideoffnpc getmdnpcname("レハール#ep20twig_move");
		cutin "ep19_lehar01.png", 255;
		donpcevent getmdnpcname("レハール#ep20twig_move")+"::OnStart3";
		stopnpctimer;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}
1@twig.gat,135,65,3	script	Jガーディアン#twig_jg04	21973,{}
1@twig.gat,135,61,3	script	Jガーディアン#twig_jg05	21972,{}
1@twig.gat,135,69,3	script	Jガーディアン#twig_jg06	21973,{}

1@twig.gat,128,158,3	script(HIDDEN)	レハール#ep20twig_4	21519,{
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "人間と……神が意思を共有するのは";
	mes "容易なことではないようです……";
	mes "そう思いませんか？";
	next;
	cutin "ep19_lehar06.png", 2;
	mes "[レハール]";
	mes "え？";
	mes "そんなの当たり前ですって？";
	mes "し、失言でした、忘れてください！";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
}

1@twig.gat,119,149,3	script	レオン#e20pn06	10464,{
	if(.scean == 5) {
		if(EP20_1QUE == 56) {
			cutin "ep19_lehar05.png", 2;
			mes "[レハール]";
			mes "うああ、レオン様、オーレリー様！";
			mes "やっと追い付いた！";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "やあ、レハール。";
			mes "他の皆さんはどうしましたか？";
			mes "姿が見えないようですが。";
			next;
			cutin "ep19_lehar05.png", 2;
			mes "[レハール]";
			mes "いやいや！　レオン様たちが";
			mes "ものスゴイ早さで移動されるから";
			mes "必死に追いかけて来たんです！";
			mes "他のみんなは、おいてけぼりです！";
			next;
			mes "[レハール]";
			mes "途中でガーディアンにも";
			mes "邪魔されましたし！";
			mes "お二人は大丈夫みたいで";
			mes "安心しましたけど。";
			next;
			cutin "ep19_leon04.png", 2;
			mes "[レオン]";
			mes "うん？　ガーディアンに邪魔された？";
			mes "あれらはヨルムンガンドを護る";
			mes "存在ではありませんか。";
			mes "私たちを襲うわけ……。";
			next;
			cutin "ep19_leon05.png", 2;
			mes "[レオン]";
			mes "……あ、しまった。";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "ヨルムンガンドの意思が";
			mes "あまりにも強烈に感じられたので";
			mes "皆さんにもてっきり";
			mes "伝わっているものだとばかり……。";
			next;
			cutin "ep19_lehar01.png", 2;
			mes "[レハール]";
			mes "ええっと、どういうことなのか";
			mes "説明していただけますか？";
			mes "できれば、簡潔に！";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "私たちはこの場所と";
			mes "ここにある世界樹を";
			mes "護らなければなりません。";
			next;
			cutin "ep19_lehar05.png", 2;
			mes "[レハール]";
			mes "……すいません。";
			mes "簡潔すぎて、まったく理解できません。";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "ええっと……";
			mes "少し整理する時間をください。";
			mes "私達がここで聞いたことを";
			mes "皆さんに理解できるように伝えないと。";
			mes "オーレリーも手伝ってくれる？";
			next;
			cutin "ep19_lehar01.png", 2;
			mes "[レハール]";
			mes "（神の魔力を分け与えられた";
			mes "　守護者になるというのも";
			mes "　大変なんだろうなぁ……）";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "順を追って話そうか。";
			mes "レオンと私はイスガルドの守護者よ。";
			mes "イスガルドを守護する代わりに";
			mes "ヨルムンガンドの祝福を受けて";
			mes "永生を維持している。";
			next;
			mes "[オーレリー]";
			mes "もちろん、ヨルムンガンドの魔力を";
			mes "知らない訳がない。";
			mes "ただ、ヨルムンガンドが私たちの前に";
			mes "姿を見せたことはないわ。";
			next;
			mes "[オーレリー]";
			mes "それが今、私達の前に姿を見せた";
			mes "ということは……";
			mes "状況が差し迫っているということ。";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "ヨルムンガンドの魔力を感じ取れるのは";
			mes "私たちだけではありません。";
			mes "ヨルムンガンドの魔力から生まれた";
			mes "ヨルムンガンド教団のルガンたちも";
			mes "感じ取ることができます。";
			next;
			mes "[レオン]";
			mes "冒険者様は、この付近で";
			mes "ルガンたちに遭遇されたのですよね？";
			mes "恐らくヨルムンガンドの魔力を頼りに";
			mes "この聖域を探していたのでしょう。";
			unittalk getnpcid(0,getmdnpcname("白い猫#e20pn06")),"白い猫: ミャアアー";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "ここはイスガルド結界の中心地で";
			mes "世界樹の枝がある。";
			mes "今は結界で隠されているけど";
			mes "ヨルムンガンド教団に見つかれば";
			mes "ここに押し寄せてくるはずよ。";
			next;
			mes "[オーレリー]";
			mes "この聖域が破壊されれば";
			mes "イスガルドの結界は破られ";
			mes "ヨルムンガンド教団による";
			mes "ミッドガルド大陸侵攻を許してしまう。";
			next;
			mes "[オーレリー]";
			mes "だから、ここを護らないといけない。";
			mes "……これで理解できたかな？";
			next;
			cutin "ep19_lehar05.png", 2;
			mes "[レハール]";
			mes "ええと……";
			mes "どうやって護れば良いのでしょうか？";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "この結界に力添えできれば";
			mes "良いのですが";
			mes "魔力をどこから";
			mes "割り当てるのかが問題です。";
			mes "まずはそれを考えないと。";
			next;
			cutin "ep19_lehar01.png", 2;
			mes "[レハール]";
			mes "時間稼ぎが必要そうなら";
			mes "私に考えがあります。";
			next;
			cutin "ep19_lehar02.png", 2;
			mes "[レハール]";
			mes "ルガンたちの調査を";
			mes "妨害するのはどうですか？";
			mes "この付近にいるルガンを見つけたら";
			mes "ぶん殴ってやっつける！";
			unittalk getcharid(3),strcharinfo(0)+" : 過激だなぁ……";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[レオン]";
			mes "……なるほど。";
			mes "ルガンたちの調査を邪魔して";
			mes "時間を稼いでいる間に";
			mes "ここを護る手段を考えます。";
			unittalk getcharid(3),strcharinfo(0)+" : え、本当にやるの??";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "ヨルムンガンドはルガンたちが";
			mes "結界を傷つけたり";
			mes "この地の魔力を採集したりすることを";
			mes "望んでいない。";
			next;
			mes "[オーレリー]";
			mes "よし、決まりね。";
			mes "外にいる他のメンバーと合流して";
			mes "手を貸してもらいましょう。";
			next;
			cutin "ep19_aurelie01.png", 255;
			chgquest 23106,23108;
			set EP20_1QUE,57;
			mes "‐外へ";
			mes "　向かいますか？‐";
			next;
			if(select("向かう","やめる") == 2) {
				mes "‐その場にとどまった‐";
				close;
			}
			//
			mes "‐外へ";
			mes "　向かった‐";
			close2;
			warp "jor_twice.gat", 53, 323;
			end;
		}
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "いったん外にでましょう。";
		mes "他の皆さんにも";
		mes "説明する必要がありますから。";
		next;
		cutin "ep19_leon01.png", 255;
		mes "‐外へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐外へ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 53, 323;
		end;
	}
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "冒険者様、いらっしゃいましたか。";
	next;
	cutin "ep19_leon03.png", 2;
	mes "[レオン]";
	mes "レハールも一緒ですね。";
	mes "彼が到着するまで待つとしましょう。";
	close2;
	cutin "ep19_leon01.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twig.gat,117,151,3	script	オーレリー#e20pn06	10465,{
	cutin "ep19_aurelie01.png", 2;
	mes "[オーレリー]";
	mes "どうりで今まで誰もここを";
	mes "見つけられなかったわけだ……";
	mes "この結界の構造は……。";
	mes "　";
	mes "‐オーレリーは考え事に没頭している‐";
	close2;
	cutin "ep19_aurelie01.png", 255;
	end;
}

1@twig.gat,116,145,7	script	白い猫#e20pn06	10537,{
	cutin "ep20_nyar0" +rand(2,4)+ ".png", 2;
	mes "[白い猫]";
	mes "ミャアオン。";
	close2;
	cutin "ep20_nyar01.png", 255;
	end;
}

1@twig.gat,0,0,0	script	Twig_MobSpawn	-1,{
OnStart:
	monster getmdmapname("1@twig.gat"),66,181,"Jガーディアン-P#jor_gar",21991,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled";
	monster getmdmapname("1@twig.gat"),62,182,"Jガーディアン-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled";
	monster getmdmapname("1@twig.gat"),67,177,"Jガーディアン-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled"))
		end;
	sleep 500;
	unittalk getnpcid(0,"レハール#ep20twig_2"),"レハール : お疲れ様でした！";
	initnpctimer getmdnpcname("レハール#ep20twig_2");
	set .scean,2;
	end;
OnStart2:
	monster getmdmapname("1@twig.gat"),135,61,"Jガーディアン-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled2";
	monster getmdmapname("1@twig.gat"),135,69,"Jガーディアン-P#jor_gar",21991,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled2";
	monster getmdmapname("1@twig.gat"),135,65,"Jガーディアン-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled2"))
		end;
	sleep 500;
	unittalk getnpcid(0,"レハール#ep20twig_3"),"レハール : お疲れ様でした！";
	initnpctimer getmdnpcname("レハール#ep20twig_3");
	set .scean,4;
	end;
}
