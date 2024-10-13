//==============================================================================
// Isolated Sanctuary Memorial Dungeon Script
//==============================================================================
1@twas.gat,0,0,0	script	Twas_Control	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	initnpctimer getmdnpcname("オーレリー#aurelie01");
	end;
}

1@twas.gat,99,76,4	script	オーレリー#aurelie01	10465,{
	if(.scean == 0) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "ここはニャル様が";
		mes "ラスガンドを隔離した聖域。";
		mes "貴方が次元の迷子にならないよう";
		mes "私は懸け橋の役目をしている。";
		mes "目の前の私は幻影の様なものよ。";
		unittalk "オーレリー : ここはニャル様がラスガンドを隔離した聖域。私は懸け橋の役目をしている。";
		next;
		mes "[オーレリー]";
		mes "ここでは私は手を出せない。";
		mes "貴方だけが頼りよ。";
		mes "さあ、ラスガンドが";
		mes "ユミルの心臓の欠片と完全に";
		mes "融合する前に、彼の魔力を奪わないと。";
		unittalk "オーレリー : ラスガンドがユミルの心臓の欠片と完全に融合する前に、彼の魔力を奪わないと。";
		next;
		mes "[オーレリー]";
		mes "ラスガンドを倒せれば良いのだけど";
		mes "相当難しいでしょう。";
		mes "今はとにかく魔力を奪う事だけに";
		mes "専念してちょうだい。";
		unittalk "オーレリー : ラスガンドを倒せれば良いのだけど相当難しいでしょう。魔力を奪う事だけに専念してちょうだい。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			hideonnpc;
			stopnpctimer;
			initnpctimer getmdnpcname("ラスガンド#lasgand01");
			set .scean,1;
		}
		end;
	}
	if(.scean == 2) {
		if(EP20_1QUE == 78) {
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "大丈夫？";
			next;
			menu "ラスガンドを倒せたんでしょうか？",-;
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "残念ながら、それは無い。";
			mes "でもラスガンドの力を";
			mes "弱らせることができたから";
			mes "ニャル様の分身たちが";
			mes "ラスガンドを抑えこんでいるわ。";
			next;
			cutin "ep20_nyar04.png", 1;
			mes "[ニャルの分身]";
			mes "ウミャァ。";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "うん？　何か持ってきたけど";
			mes "これって……";
			mes "ユミルの心臓の欠片じゃない!?";
			next;
			cutin "ep20_nyar03.png", 1;
			mes "[ニャルの分身]";
			mes "ウニャオン。";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "ユミルの心臓の欠片と";
			mes "完全に融合する前に";
			mes "冒険者の攻撃が通じたのね！";
			mes "だけど……。";
			next;
			cutin "ep20_nyar01.png", 1;
			mes "[ニャルの分身]";
			mes "ミャオン…ミャオン…";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "やっぱり……";
			mes "ゲオルグが存在する限り";
			mes "運命を共にするという呪いが";
			mes "ラスガンドを不死身にさせている。";
			next;
			mes "[オーレリー]";
			mes "今はどうにか押さえつけられているけど";
			mes "ラスガンドの力は強大だわ……。";
			next;
			mes "[オーレリー]";
			mes "貴方は、スプーン戦法って知ってる？";
			mes "例えスプーン1本だけでも";
			mes "諦めずに繰り返し土を掘れば";
			mes "山も動かせるという戦法よ。";
			next;
			mes "[オーレリー]";
			mes "要するに、ラスガンドの力を";
			mes "少しずつ削ぐことで勝機を得る。";
			mes "……今日はいったん撤退しましょう。";
			mes "ラスガンドが力を回復させる前に";
			mes "こちらも準備を整えなくては。";
			next;
			cutin "ep19_aurelie01.png", 255;
			if(checkitemblank() == 0) {
				mes "‐荷物をこれ以上持てません";
				mes "　荷物に1個以上の空きを";
				mes "　作ってください‐";
				close;
			}
			chgquest 18232,18233;
			set EP20_1QUE,79
			getitem 1001254,1;
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
			warp "jor_twig.gat", 145, 156;
			end;
		}
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "ユミルの心臓の欠片と";
		mes "完全に融合する前に";
		mes "ラスガンドを止められて良かった。";
		mes "でも、今日はいったん撤退しましょう。";
		next;
		mes "[オーレリー]";
		mes "取り戻したユミルの心臓の欠片も";
		mes "元の場所に戻さないといけないからね。";
		next;
		cutin "ep19_aurelie01.png", 255;
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
		warp "jor_twig.gat", 145, 156;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twas.gat,94,84,3	script	ラスガンド#lasgand01	21979,{
	if(.scean == 1) {
		cutin "ep20_lasgand_god01.png", 1;
		mes "[ラスガンド]";
		mes "今、この身には神の力が溢れているが";
		mes "少々扱いに困っていたところだ。";
		unittalk "ラスガンド : この身には神の力が溢れているが、少々扱いに困っていたところだ。";
		next;
		mes "[ラスガンド]";
		mes "お前たちは、私を隔離することに";
		mes "成功したと思っているようだが";
		mes "それならば、もっと慎重に";
		mes "行動すべきだったのではないか？";
		unittalk "ラスガンド : お前たちは、もっと慎重に行動すべきだったのではないか？";
		misceffect 897;
		misceffect 380;
		cutin "ep20_lasgand_god02.png", 1;
		next;
		mes "[ラスガンド]";
		mes "恐れを知らぬ愚か者め……";
		mes "わざわざ自分たちの方から";
		mes "門を開けるために来てくれるとは！";
		unittalk "ラスガンド : わざわざ自分たちの方から、門を開けるために来てくれるとは！";
		close2;
		cutin "ep20_lasgand_god02.png", 255;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			donpcevent getmdnpcname("Twas_MobSpawn")+ "::OnStart";
		end;
	}
	if(.scean == 2) {
		cutin "ep20_lasgand02.png", 1;
		mes "[ラスガンド]";
		mes "汚らわしい人間風情め……";
		mes "だが、これで終わりと思うなよ。";
		mes "貴様らが王として称える";
		mes "ゲオルグの血筋が絶えぬ限り";
		mes "私は死ぬことは無い。";
		next;
		cutin "ep20_lasgand03.png", 1;
		mes "[ラスガンド]";
		mes "イスガルドの結界内で";
		mes "数百年を耐えて来た身なのだ。";
		mes "ヨルムンガンドの力が尽きるのが先か";
		mes "私がこの場の魔力を吸収し尽くして";
		mes "ここを破るのが先か……";
		mes "試してみようではないか？";
		close2;
		cutin "ep20_lasgand03.png", 255;
		end;
	}
	unittalk "ラスガンド : 鬱陶しい奴らが集まってきたな……";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twas.gat,94,81,0	script(HIDDEN)	ニャルの分身#nyar01	10537,{
	unittalk "ニャルルルル…。";
	end;
}

1@twas.gat,91,83,6	script(HIDDEN)	ニャルの分身#nyar02	10537,{
	unittalk "ニャルルルル…。";
	end;
}

1@twas.gat,97,83,1	script(HIDDEN)	ニャルの分身#nyar03	10537,{
	unittalk "ニャルルルル…。";
	end;
}

1@twas.gat,0,0,0	script	Twas_MobSpawn	-1,{
OnStart:
	sleep 1000;
	misceffect 898,getmdnpcname("ラスガンド#lasgand01");
	unittalk getnpcid(0,getmdnpcname("ラスガンド#lasgand01")),"ラスガンド : 門を開けよ!!";
	sleep 1000;
	misceffect 380,getmdnpcname("ラスガンド#lasgand01");
	stopnpctimer getmdnpcname("ラスガンド#lasgand01");
	hideonnpc getmdnpcname("ラスガンド#lasgand01");
	monster getmdmapname("1@twas.gat"),96,80,"究極のラスガンド",21979,1,getmdnpcname("Twas_MobSpawn")+"::OnKilled";
	end;
OnKilled:
	sleep 2000;
	mapwarp getmdmapname("1@twas.gat"), getmdmapname("1@twas.gat"), 94, 77;
	sleep 2000;
	hideoffnpc getmdnpcname("オーレリー#aurelie01");
	hideoffnpc getmdnpcname("ラスガンド#lasgand01");
	setnpcdisplay getmdnpcname("ラスガンド#lasgand01"),10536;
	hideoffnpc getmdnpcname("ニャルの分身#nyar01");
	hideoffnpc getmdnpcname("ニャルの分身#nyar02");
	hideoffnpc getmdnpcname("ニャルの分身#nyar03");
	initnpctimer getmdnpcname("オーレリー#aurelie01");
	set .scean,2;
	end;
}







/*
//150,1200,288,576
21979,究極のラスガンド＠ポイズンアタック,attack,188,5,2000,0,5000,no,target,always,0,,,,,,
21979,究極のラスガンド＠致命的な傷,attack,673,2,2000,0,30000,no,target,always,0,,,,,,
21979,究極のラスガンド＠ダメージヒール,attack,753,1,500,1500,5000,no,self,always,0,,,,,,
21979,究極のラスガンド＠ワイドソウルドレイン,attack,680,7,1000,500,20000,no,self,always,0,,,,,,
21979,究極のラスガンド＠グリムトゥース,chase,137,5,2000,0,5000,no,target,always,0,,,,,,
21979,究極のラスガンド＠インデュア,chase,8,1,2000,0,20000,no,self,always,0,,,,,,
21979,究極のラスガンド＠ヒール,idle,28,10,10000,500,5000,no,self,always,0,,,,,,

21989,ヨルムンガンド教団守衛＠スタンアタック,attack,179,1,2000,0,17,no,target,always,0,,,,,,
21989,ヨルムンガンド教団守衛＠ホーリーアタック,chase,189,1,2000,0,9,no,target,always,0,,,,,,
21989,ヨルムンガンド教団守衛＠Mレイオブジェネシス,chase,737,7,2000,0,6,no,around,always,0,,,,,,
21989,ヨルムンガンド教団守衛＠スパイラルピアース,attack,397,5,2000,0,0,no,target,always,0,,,,,,
21985,上級ルガン呪術師＠Mクラウドキル,chase,739,1,2000,0,7,no,around,always,0,,,,,,
21985,上級ルガン呪術師＠ポイズンアタック,chase,188,1,2000,0,300620,no,target,always,0,,,,,,
21985,上級ルガン呪術師＠カースアタック,attack,181,1,2000,0,0,no,target,always,0,,,,,,
21985,上級ルガン呪術師＠サイトラッシャー,chase,81,10,2000,0,5,no,target,always,0,,,,,,
21986,上級ルガン治療師＠ホーリーアタック,chase,189,1,2000,0,0,no,target,always,0,,,,,,
21973,Jガーディアン-Y＠ポイズンアタック,chase,188,1,2000,0,1054,no,target,always,0,,,,,,
21973,Jガーディアン-Y＠プロボック,chase,6,5,2000,0,1620141,no,target,always,0,,,,,,
21972,Jガーディアン-P＠ホーリーアタック,attack,189,1,2000,0,3937,no,target,always,0,,,,,,
21972,Jガーディアン-P＠プロボック,chase,6,5,2000,0,5657583,no,target,always,0,,,,,,
*/
