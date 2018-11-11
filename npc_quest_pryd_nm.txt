//------------------------------------------------------------
// moc_prydn1.gat
moc_prydn1.gat,0,0,0,0	monster	グレイヴミノタウロス	2353,135,5000,0,0
moc_prydn1.gat,0,0,0,0	monster	グレイヴマミー	2354,25,5000,0,0
moc_prydn1.gat,0,0,0,0	monster	グレイヴベリット	2355,5,5000,0,0
moc_prydn1.gat,0,0,0,0	monster	グレイヴクラウンマミー	2360,1,5000,0,0
//------------------------------------------------------------
// moc_prydn2.gat
moc_prydn2.gat,0,0,0,0	monster	グレイヴミミック	2356,30,5000,0,0
moc_prydn2.gat,0,0,0,0	monster	グレイヴベリット	2355,25,5000,0,0
moc_prydn2.gat,0,0,0,0	monster	グレイヴクラウンマミー	2360,20,5000,0,0
moc_prydn2.gat,0,0,0,0	monster	グレイヴアクラウス	2358,20,5000,0,0

//speed: 200
2353,グレイヴミノタウロス＠ヒール,idle,28,10,5000,0,5000,yes,self,myhpltmaxrate,99,,,,,,
2353,グレイヴミノタウロス＠ハンマーフォール,attack,110,3,1000,0,5000,no,target,always,0,,,,,,32
2353,グレイヴミノタウロス＠エモーション,chase,197,1,200,0,5000,yes,self,always,,6,,,,,
2353,グレイヴミノタウロス＠火属性攻撃,attack,186,3,1000,0,5000,no,target,always,0,,,,,,
2353,グレイヴミノタウロス＠ヘヴンズドライブ,attack,91,3,1000,0,5000,yes,target,always,0,,,,,,
2353,グレイヴミノタウロス＠ガンバンテイン,attack,483,1,500,0,15000,no,target,always,0,,,,,,

//speed: 300
2354,グレイヴマミー＠テレポート,idle,26,1,100,0,0,yes,self,always,,,,,,,,
2354,グレイヴマミー＠ヒール,idle,28,10,5000,0,5000,yes,self,myhpltmaxrate,99,,,,,,,
2354,グレイヴマミー＠毒化攻撃,attack,176,3,1000,0,5000,no,target,always,0,,,,,,
2354,グレイヴマミー＠連続攻撃,attack,171,1,1000,700,5000,no,target,always,0,,,,,,
2354,グレイヴマミー＠エモーション,chase,197,1,200,0,5000,yes,self,always,0,19,129,,,,
2354,グレイヴマミー＠エモーション,idle,197,1,2000,0,5000,yes,self,always,0,9,133,,,,
2354,グレイヴマミー＠不死属性攻撃,attack,347,1,500,0,5000,yes,target,always,0,,,,,,

//speed: 250
2355,グレイヴベリット＠テレポート,idle,26,1,100,0,0,yes,self,always,,,,,,,,
2355,グレイヴベリット＠ヒール,idle,28,10,5000,0,5000,yes,self,myhpltmaxrate,99,,,,,,,
2355,グレイヴベリット＠ディスペル,attack,289,5,100,0,30000,yes,target,always,0,,,,,,
2355,グレイヴベリット＠ディスペル,chase,289,5,100,0,30000,yes,target,always,0,,,,,,
2355,グレイヴベリット＠毒化攻撃,attack,176,3,500,800,5000,no,target,always,0,,,,,,

//speed: 200
//2356,グレイヴミミック＠テレポート,idle,26,1,100,0,0,yes,self,always,,,,,,,,
2356,グレイヴミミック＠ヒール,idle,28,10,5000,0,5000,yes,self,myhpltmaxrate,99,,,,,,,
2356,グレイヴミミック＠吸血,attack,199,1,500,0,5000,yes,target,always,,,,,,,2
2356,グレイヴミミック＠エモーション,idle,197,1,2000,0,5000,yes,self,always,0,29,,,,,
2356,グレイヴミミック＠オートガード,chase,249,2,2000,0,300000,yes,self,longrangeattacked,,,,,,,
2356,グレイヴミミック＠オートガード,attack,249,2,500,0,300000,yes,self,always,0,,,,,,

//speed: 200
2358,グレイヴアクラウス＠テレポート,idle,26,1,100,0,0,yes,self,always,,,,,,,,
2358,グレイヴアクラウス＠ヒール,idle,28,10,5000,0,5000,yes,self,myhpltmaxrate,99,,,,,,,
2358,グレイヴアクラウス＠ベナムフォグ,attack,706,1,10000,0,10000,yes,target,always,,,,,,,
2358,グレイヴアクラウス＠吸血,attack,199,1,500,0,5000,yes,target,always,,,,,,,

2359,グレイヴアクラウス＠ベナムフォグ,attack,706,1,10000,0,10000,yes,target,always,,,,,,,
2359,グレイヴアクラウス＠吸血,attack,199,1,500,0,5000,yes,target,always,,,,,,,

//speed: 100
2360,グレイヴクラウンマミー＠ツーハンドクイッケン,attack,60,10,10000,0,300000,yes,self,always,0,,,,,,2
2360,グレイヴクラウンマミー＠ベナムダスト,attack,140,1,500,0,5000,no,around5,always,0,,,,,,29
2360,グレイヴクラウンマミー＠闇属性攻撃,attack,190,3,500,0,5000,no,target,always,0,,,,,,
2360,グレイヴクラウンマミー＠ダークネスブレス,attack,658,10,1000,0,0,yes,target,always,0,,,,,,
2360,グレイヴクラウンマミー＠ダークネスブレス,chase,658,4,1000,0,0,yes,target,always,0,,,,,,
2360,グレイヴクラウンマミー＠アシッドブレス,chase,657,10,1000,0,5000,no,target,always,0,,,,,,
2360,グレイヴクラウンマミー＠クリティカル攻撃,attack,170,1,1000,0,5000,yes,target,always,0,,,,,,
2360,グレイヴクラウンマミー＠吸血,attack,199,1,1000,0,0,yes,target,always,,,,,,,
2360,グレイヴクラウンマミー＠スタン攻撃,attack,179,3,1000,1500,5000,no,target,always,0,,,,,,
2360,グレイヴクラウンマミー＠範囲出血攻撃,attack,665,2,2000,0,20000,no,self,always,0,,,,,,29
2360,グレイヴクラウンマミー＠範囲沈黙攻撃,chase,663,4,2000,0,20000,no,self,always,0,,,,,,6
2360,グレイヴクラウンマミー＠ダークストライク,attack,340,10,2000,0,5000,yes,target,always,0,,,,,,
2360,グレイヴクラウンマミー＠取り巻き召喚,idle,196,2,10000,0,0,yes,self,onspawn,,2354,,,,,

2361,グレイヴクラウンマミー＠ツーハンドクイッケン,attack,60,10,10000,0,300000,yes,self,always,0,,,,,,2
2361,グレイヴクラウンマミー＠ベナムダスト,attack,140,1,500,0,5000,no,around5,always,0,,,,,,29
2361,グレイヴクラウンマミー＠闇属性攻撃,attack,190,3,500,0,5000,no,target,always,0,,,,,,
2361,グレイヴクラウンマミー＠ダークネスブレス,attack,658,10,1000,0,0,yes,target,always,0,,,,,,
2361,グレイヴクラウンマミー＠ダークネスブレス,chase,658,4,1000,0,0,yes,target,always,0,,,,,,
2361,グレイヴクラウンマミー＠アシッドブレス,chase,657,10,1000,0,5000,no,target,always,0,,,,,,
2361,グレイヴクラウンマミー＠クリティカル攻撃,attack,170,1,1000,0,5000,yes,target,always,0,,,,,,
2361,グレイヴクラウンマミー＠吸血,attack,199,1,1000,0,0,yes,target,always,,,,,,,
2361,グレイヴクラウンマミー＠スタン攻撃,attack,179,3,1000,1500,5000,no,target,always,0,,,,,,
2361,グレイヴクラウンマミー＠範囲出血攻撃,attack,665,2,2000,0,20000,no,self,always,0,,,,,,29
2361,グレイヴクラウンマミー＠範囲沈黙攻撃,chase,663,4,2000,0,20000,no,self,always,0,,,,,,6
2361,グレイヴクラウンマミー＠ダークストライク,attack,340,10,2000,0,5000,yes,target,always,0,,,,,,
//2360,グレイヴクラウンマミー＠取り巻き召喚,idle,196,2,10000,0,0,yes,self,onspawn,,2354,,,,,

//speed: 100
2362,アメンホテプ＠テレポート,idle,26,1,10000,0,0,yes,self,rudeattacked,,,,,,,
2362,アメンホテプ＠テレポート,walk,26,1,5000,0,5000,yes,self,rudeattacked,,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,skillused,18,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,skillused,89,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,skillused,21,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,skillused,28,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,skillused,79,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,skillused,83,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,longrangeattacked,,,,,,,
2362,アメンホテプ＠メテオストーム,idle,83,10,10000,0,0,yes,anothertarget,casttargeted,,,,,,,
2362,アメンホテプ＠メテオストーム,attack,83,10,5000,0,3000,yes,anothertarget,always,0,,,,,,
2362,アメンホテプ＠ヘルジャッジメント,attack,662,10,2000,0,10000,no,self,always,0,,,,,,
2362,アメンホテプ＠ファイアーピラー,idle,80,10,10000,0,2000,yes,around2,always,0,,,,,,
2362,アメンホテプ＠ファイアーピラー,attack,80,10,5000,0,2000,yes,around2,always,0,,,,,,
2362,アメンホテプ＠取り巻き呼び戻し,idle,352,1,10000,0,30000,yes,self,always,0,,,,,,
2362,アメンホテプ＠取り巻き召喚,attack,196,6,10000,0,30000,yes,self,slaves,0,2359,2361,2359,,,
2362,アメンホテプ＠取り巻き召喚,chase,196,6,10000,0,30000,yes,self,slaves,0,2359,2361,2359,,,
2362,アメンホテプ＠取り巻き召喚,idle,196,6,10000,0,30000,yes,self,slaves,0,2359,2361,2359,,,
2362,アメンホテプ＠取り巻き召喚,idle,196,1,10000,0,0,yes,self,onspawn,,1038,,,,,

moc_prydb1.gat,103,54,3	script	怪しい猫#nightmare1	547,{/* 59128 */
	if(BaseLevel < 100) {
		mes "[怪しい猫]";
		mes "まさかマミーに";
		mes "やられてしまうとは……";
		mes "‐^ff0000BaseLv100以上^000000になると";
		mes "　この場所から";
		mes "　ピラミッドダンジョン　秘密の地下室";
		mes "　入場が可能となります‐";
		close;
	}
	mes "[怪しい猫]";
	mes "この先に行きたいのか？";
	mes "この先は私が発見した特別な場所だ！";
	mes "どうしても行きたいと言うなら";
	mes "通行料として^ff00005,000^000000Zenyいただこう！";
	next;
	switch(select("5,000Zenyを払って出発","話を聞く","その場を去る")) {
	case 1:
		if(Zeny < 5000) {
			// 未調査
			mes "[怪しい猫]";
			mes "にゃにゃ！";
			mes "お金が足りないなら話にならない！";
			close;
		}
		mes "[怪しい猫]";
		mes "よし。それじゃあついて来て！";
		close2;
		set Zeny, Zeny -5000;
		warp "moc_prydn1.gat",93,96;
		end;
	case 2:
		mes "[怪しい猫]";
		mes "今まで長い間、積み上げてきた名声が";
		mes "地に落ちてしまう日が来るとは……。";
		next;
		mes "[怪しい猫]";
		mes "あいつら本当におかしいんだ……。";
		mes "マミーのくせに。　マミーだろ!!";
		mes "あんなに強いなんて！";
		next;
		if(select("続けて聞く","会話をやめる") == 2) {
			mes "‐あなたはその場を去った‐";
			close;
		}
		mes "[怪しい猫]";
		mes "そう。それは私が偶然";
		mes "隠し通路の先にある、宝を見つけて";
		mes "採掘をしていた時の事だ。";
		next;
		mes "[怪しい猫]";
		mes "遠くからマミーが近寄って来たんだよ。";
		mes "一目見てマミーだとわかったから";
		mes "気にせず作業をしていたんだ。";
		mes "マミーなんて私の敵ではないからね。";
		mes "そうしたらだ……！";
		next;
		mes "[怪しい猫]";
		mes "体が飛んで行くくらいの";
		mes "強烈なビンタをうたれたよ。";
		mes "このカワイイ猫を……。";
		mes "まさかあんなに強いとは。";
		mes "覚えとけよ、包帯野郎め!!";
		next;
		mes "[怪しい猫]";
		mes "この中にいるモンスター達の";
		mes "^ff0000見た目に惑わされるなよ^000000。";
		mes "今まで遭遇した事のある奴だと";
		mes "油断していると痛い目に遭うぞ！";
		next;
		mes "[怪しい猫]";
		mes "というわけで採掘が出来ない代わりに";
		mes "ここを通る冒険者から通行料を取って";
		mes "生計を立てる事にした。";
		mes "猫にも生活があるんだよ！";
		next;
		mes "[怪しい猫]";
		mes "そうそう、中に行けばきっと";
		mes "仲間が採掘を試みてるだろう。";
		mes "手伝ってくれれば";
		mes "一攫千金のチャンスに";
		mes "ありつけるかもしれないぞ。";
		close;
	case 3:
		mes "‐あなたはその場を去った‐";
		close;
	}
OnInit:
	waitingroom "秘密の地下室",0; //59128
	end;
}

moc_ruins.gat,75,170,3	script	採掘に向かう猫#outdoor1	561,{/* 59129 */
	if(BaseLevel < 100 || BaseLevel > 135) {
		mes "[採掘に向かう猫]";
		mes "さーて、行くかな。";
		mes "　";
		mes "‐^ff0000BaseLv100から135の間のみ^000000";
		mes "　受諾する事が出来るクエストです‐";
		close;
	}
	if(!checkquest(118850)) {
		mes "[採掘に向かう猫]";
		mes "さーて、行くかな。";
		mes "　";
		mes "おっ、なんだお前。冒険者か？";
		mes "くくっ。いい所にきたな。";
		mes "ちょっと俺の手伝いをしてくれないか？";
		next;
		mes "[採掘に向かう猫]";
		mes "俺は今この辺に眠っているお宝を探して";
		mes "採掘をしているんだ。";
		mes "ただ、採掘場所ではモンスターが";
		mes "邪魔をしてきてな。";
		next;
		mes "[採掘に向かう猫]";
		mes "俺も戦闘は嫌いじゃないんだが";
		mes "今は採掘に集中したいし、";
		mes "ちょっとした理由もあってな。";
		mes "お前にモンスターを";
		mes "倒して来て欲しいんだ。";
		next;
		mes "[採掘に向かう猫]";
		mes "もちろん、お礼ははずむぞ。";
		mes "モンスターを倒して来た数に応じて";
		mes "おたから袋から報酬を渡してやる。";
		mes "どうだ。やってくれないか？";
		next;
		if(select("手伝う","断る") == 2) {
			mes "[採掘に向かう猫]";
			mes "ちっ。";
			mes "なんだよつれねえな。";
			close;
		}
		mes "[採掘に向かう猫]";
		mes "ありがてえ。";
		mes "それじゃあもう一度話しかけてくれ。";
		setquest 118850; //state=1
		compquest 118850;
		close;
	}
	if(checkquest(118855) & 0x2)
		delquest 118855;
	if(checkquest(118860) & 0x2)
		delquest 118860;
	mes "[採掘に向かう猫]";
	mes "おう。よく来たな。";
	mes "今日はどうする？";
	next;
	switch(select("討伐を受ける/報告する","討伐をあきらめる","説明を聞く","会話をやめる")) {
	case 1:
//ダイヤモンド１カラット
//ダイヤモンド２カラット
//ダイヤモンド３カラット
//銀の指輪
//金の指輪
//ダイヤの指輪
//黄金
//宝箱　1個
//宝箱　2個
//宝箱　5個
		set '@d[0],checkquest(97000);
		set '@d[1],checkquest(97002);
		set '@d[2],checkquest(97004);
		set '@d[3],checkquest(97006);
		set '@d[4],checkquest(97008);
		set '@d[5],checkquest(97010);
		if('@d[0]+'@d[1]+'@d[2]+'@d[3]+'@d[4]+'@d[5] == 6) {
			mes "[採掘に向かう猫]";
			mes "どうだ進み具合は？";
			mes "結構あいつら強いだろう。";
			mes "期待しているぞ。";
			close;
		}
		if(checkquest(118855)) {
			if(checkquest(118855) & 0x2 == 0) {
				mes "[採掘に向かう猫]";
				mes "ん。お前か";
				mes "今はまだ大丈夫だ。";
				mes "あまり根詰めずにやってくれ。";
				mes "　";
				mes "‐このクエストは";
				mes "　1時間に1回、挑戦出来ます‐";
				close;
			}
		}
		mes "[採掘に向かう猫]";
		mes "^ff0000グレイヴアクラウス^000000と";
		mes "^ff0000グレイヴミノタウロス^000000を";
		mes "倒してきてくれ。";
		mes "頼んだぞ。";
		setquest 97000; //state=1
		setquest 118855; //state=1
		setquest 97002; //state=1
		setquest 97004; //state=1
		setquest 97006; //state=1
		setquest 118860; //state=1
		setquest 97008; //state=1
		setquest 97010; //state=1
		close;
	case 2:
		if(!checkquest(97000)) {
			mes "[採掘に向かう猫]";
			mes "ん？　依頼を諦めたい？";
			mes "だが、おまえにお願いしている";
			mes "依頼は無いようだぞ。";
			close;
		}
		mes "[採掘に向かう猫]";
		mes "お前には荷が重かったか？";
		mes "まぁ仕方ない。";
		mes "もしあきらめるのであれば";
		mes "途中まで進行したものも含めて";
		mes "全て無しになるが本当に良いか？";
		next;
		if(select("もう少し頑張る","^ff0000依頼をあきらめる^000000") == 1) {
			mes "[採掘に向かう猫]";
			mes "そうか。";
			mes "それじゃ頼んだぞ！";
			close;
		}
		mes "[採掘に向かう猫]";
		mes "そうか。仕方ないな。";
		mes "わかったよ。";
		mes "その気になったらまた来てくれよな。";
		delquest 97000;
		delquest 97002;
		delquest 97004;
		delquest 97006;
		delquest 97008;
		delquest 97010;
		close;
	case 3:
		mes "[採掘に向かう猫]";
		mes "簡単な事さ。";
		mes "この辺に生息するモンスターのうち";
		mes "特に採掘の邪魔となる";
		mes "^ff0000グレイヴミノタウロス^000000と";
		mes "^ff0000グレイヴアクラウス^000000を";
		mes "倒して来て欲しいんだ。";
		next;
		mes "[採掘に向かう猫]";
		mes "たくさん倒して来たら";
		mes "たくさん報酬をやろう。";
		mes "　";
		mes "ただし！";
		mes "腕の立つ冒険者は";
		mes "悪いが断らせてもらっている。";
		next;
		mes "‐インフォメーション‐";
		mes "　^ff0000BaseLv100から135までの間^000000";
		mes "　受諾する事が出来るクエストです。";
		mes "　報告後、^ff00001時間^000000は再受諾出来ません。";
		mes "　BaseLv136以上になると、";
		mes "　進行中のクエストのみ";
		mes "　報告が可能です。";
		next;
		mes "[採掘に向かう猫]";
		mes "俺達のような猫は冒険者との共存は";
		mes "必要不可欠だ。";
		mes "俺は腕っぷしならその辺の冒険者には";
		mes "負けるつもりは無いけどな。";
		mes "仲間の猫みんなが";
		mes "そういうわけじゃねえ。";
		next;
		mes "[採掘に向かう猫]";
		mes "だから仲間内で集まったときに";
		mes "みんなで集めたこのおたからの一部で";
		mes "成長中の冒険者の補助をしていこうと";
		mes "話をしていたのさ。";
		next;
		mes "[採掘に向かう猫]";
		mes "それならばと俺らのリーダーが";
		mes "現在採掘中のこのピラミッドで";
		mes "採掘の邪魔をするモンスターを";
		mes "倒してくれる冒険者に";
		mes "報酬という形で渡してはどうだと";
		mes "提案をしたんだよ。";
		next;
		mes "[採掘に向かう猫]";
		mes "これなら俺らにとっても";
		mes "手が減らせるし恩恵がある。";
		mes "　";
		mes "どうだ。なかなか名案だろ？";
		next;
		mes "[採掘に向かう猫]";
		mes "ということで報酬は";
		mes "豪華だと思ってくれていいぜ。";
		next;
		mes "[採掘に向かう猫]";
		mes "ただ、俺は細かい話が苦手でな。";
		mes "報酬については計算の得意な仲間に";
		mes "メモで書いてもらってある。";
		mes "詳しくはそれを見てくれ。";
		next;
		mes "‐あなたはきれいにたたまれた";
		mes "　手紙を受け取り、目を通した‐";
		next;
		mes "[手紙]";
		mes "　このお手紙を読んでいるあなたへ。";
		mes "　我々の採掘の手伝いをしてくれて";
		mes "　ありがとうですにゃ。";
		mes "　今から手伝ってくれた際の";
		mes "　報酬について説明しますにゃ。";
		next;
		mes "[手紙]";
		mes "　お渡しする報酬は次の通りですにゃ。";
		mes "　^ff0000グレイヴミノタウロス^000000、を";
		mes "　100体倒す……おたから袋の中身^ff00001^000000個";
		mes "　200体倒す……おたから袋の中身^ff00003^000000個";
		mes "　300体倒す……おたから袋の中身^ff00006^000000個";
		next;
		mes "[手紙]";
		mes "　^ff0000グレイヴアクラウス^000000、を";
		mes "　20体倒す……おたから袋の中身^ff00001^000000個";
		mes "　40体倒す……おたから袋の中身^ff00003^000000個";
		mes "　60体倒す……おたから袋の中身^ff00006^000000個";
		next;
		mes "[手紙]";
		mes "　^ff0000おたから袋^000000とは";
		mes "　我々が採掘して集めた貴重な品々を";
		mes "　一時的に保管している袋ですにゃ。";
		mes "　ダイヤモンドから宝箱まで";
		mes "　色々なものが入っていますにゃ。";
		mes "　中身は全て価値のあるものですにゃ！";
		next;
		mes "[手紙]";
		mes "　そうそう。";
		mes "　報酬は^ff0000複数合わせて^000000渡しますにゃ。";
		mes "　例えば200体倒してきた場合は";
		mes "　100体倒してきた分の報酬と";
		mes "　200体倒してきた分の報酬を";
		mes "　両方渡しますにゃ。";
		next;
		mes "[手紙]";
		mes "　受注した後、1時間待ってくれれば";
		mes "　何度でも^ff0000繰り返し出来ます^000000にゃ。";
		mes "　いっぱい手伝ってくださいにゃ。";
		mes "　採掘がはかどりますにゃ。";
		mes "　にゃっはっは。";
		mes "　以上ですにゃ！";
		next;
		mes "‐手紙はここまでのようだ‐";
		next;
		mes "[採掘に向かう猫]";
		mes "読んでくれたか？";
		mes "というわけでよろしく頼むぜ。";
		mes "期待しているぞ。";
		close;
	case 4:
		mes "[採掘に向かう猫]";
		mes "なんだ。";
		mes "声をかけるのは用がある時にしてくれ。";
		close;
	}
OnInit:
	waitingroom "討伐クエスト", 0; //59129
	end;
}

moc_prydn1.gat,94,98,3	script	怪しい猫#nightmare2	547,{/* 60763 */
	mes "[怪しい猫]";
	mes "怪しいモンスターが";
	mes "うようよしているな……。";
	mes "物騒だし早く元の場所に帰ろう。";
	next;
	if(select("戻る","まだ残る") == 2) {
		emotion 4; //60763
		mes "[怪しい猫]";
		mes "まだ残るのか？";
		mes "戻りたくなったら";
		mes "声をかけてくれ。";
		close;
	}
	mes "[怪しい猫]";
	mes "さぁさぁ、早く戻ろう。";
	close2;
	warp "moc_prydb1.gat",100,57;
	end;
}

moc_prydn2.gat,198,11,0	warp	nightmare_pry_2to1	1,1,moc_prydn1.gat,213,10	//60764
moc_prydn1.gat,218,9,0	warp	nightmare_pry_1to2	1,1,moc_prydn2.gat,195,11	//60765

moc_prydn1.gat,97,96,3	script	採掘中の猫#floor1	561,{/* 60766 */
	mes "[採掘中の猫]";
	mes "くそっ、やはりモンスターが多いな。";
	mes "　";
	mes "‐^ff0000BaseLv100から135の間のみ^000000";
	mes "　受諾する事が出来るクエストです‐";
	close;
OnInit:
	waitingroom "討伐クエスト",0; //60766
	end;
}

moc_prydn2.gat,97,59,3	script	採掘中の猫#floor2	561,{/* 60767 */
	mes "[採掘中の猫]";
	mes "くそっ、やはりモンスターが多いな。";
	mes "　";
	mes "‐^ff0000BaseLv100から135の間のみ^000000";
	mes "　受諾する事が出来るクエストです‐";
	close;
OnInit:
	waitingroom "討伐クエスト",0; //60767
	end;
}

moc_prydn1.gat,17,186,0	script	#Secret_1-1	139,0,10,{/* 60768 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,24,171,0	script	#Secret_1-2	139,1,1,{/* 60769 */
	soundeffect "se_door02.wav", 0, 0; //60769
	warp "moc_prydn1.gat",219,40;
	end;
}
moc_prydn1.gat,214,31,0	script	#Secret_2-1	139,10,0,{/* 60770 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,219,44,0	script	#Secret_2-2	139,1,1,{/* 60771 */
	soundeffect "se_door02.wav", 0, 0; //60771
	warp "moc_prydn1.gat",24,175;
	end;
}
moc_prydn1.gat,15,58,0	script	#Secret_3-1	139,10,0,{/* 60772 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,9,72,0	script	#Secret_3-2	139,2,1,{/* 60773 */
	soundeffect "se_door02.wav", 0, 0; //60773
	warp "moc_prydn1.gat",220,133;
	end;
}
moc_prydn1.gat,214,157,0	script	#Secret_4-1	139,10,0,{/* 60774 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,220,129,0	script	#Secret_4-2	139,2,1,{/* 60775 */
	soundeffect "se_door02.wav", 0, 0; //60775
	warp "moc_prydn1.gat",9,68;
	end;
}
moc_prydn1.gat,58,57,0	script	#Secret_5-1	139,0,10,{/* 60776 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,72,52,0	script	#Secret_5-2	139,1,2,{/* 60777 */
	soundeffect "se_door02.wav", 0, 0; //60777
	warp "moc_prydn1.gat",35,220;
	end;
}
moc_prydn1.gat,59,214,0	script	#Secret_6-1	139,0,10,{/* 60778 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,31,219,0	script	#Secret_6-2	139,1,2,{/* 60779 */
	soundeffect "se_door02.wav", 0, 0; //60779
	warp "moc_prydn1.gat",68,52;
	end;
}
moc_prydn1.gat,101,169,0	script	#Secret_7-1	139,0,10,{/* 60780 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,87,164,0	script	#Secret_7-1	139,1,2,{/* 60781 */
	soundeffect "se_door02.wav", 0, 0; //60781
	warp "moc_prydn1.gat",194,66;
	end;
}
moc_prydn1.gat,183,72,0	script	#Secret_8-1	139,10,0,{/* 60782 */
	emotion 1,""; //self
	end;
}
moc_prydn1.gat,198,66,0	script	#Secret_8-2	139,1,2,{/* 60783 */
	soundeffect "se_door02.wav", 0, 0; //60783
	warp "moc_prydn1.gat",91,164;
	end;
}

moc_prydn2.gat,179,99,0	script	#Secret_A	139,1,1,{/* 60784 */
	soundeffect "complete.wav", 0, 0; //60784
	warp "moc_prydn2.gat",195,11;
	end;
}
moc_prydn2.gat,193,16,0	script	#Secret_B-1	139,1,1,{/* 60785 */
	showscript "!?";
	soundeffect "se_door02.wav", 0, 0; //60785
	hideonnpc "#Secret_B-1"; //60785
	hideoffnpc "#Secret_B-2"; //60786
	initnpctimer;
	end;
OnTimer8000:
	hideonnpc "#Secret_B-2"; //60786
	hideoffnpc "#Secret_B-1"; //60785
	end;
}
moc_prydn2.gat,193,5,0	script	#Secret_B-2	139,1,1,{/* 60786 (hide)*/
	soundeffect "complete.wav", 0, 0; //60786
	warp "moc_prydn2.gat",101,187;
	end;
}
moc_prydn2.gat,127,47,0	script	#Secret_C-1	139,1,1,{/* 60787 */
	showscript "!?";
	soundeffect "se_door02.wav", 0, 0; //60785
	hideonnpc "#Secret_C-1"; //60789
	hideoffnpc "#Secret_C-2"; //60786
	initnpctimer;
	end;
OnTimer8000:
	hideonnpc "#Secret_C-2"; //60786
	hideoffnpc "#Secret_C-1"; //60789
	end;
}
moc_prydn2.gat,128,58,0	script	#Secret_C-2	139,1,1,{/* 60788 (hide)*/
	soundeffect "se_door02.wav", 0, 0; //60788
	warp "moc_prydn2.gat",135,59;
	end;
}
moc_prydn2.gat,133,75,0	script	#Secret_C-3	139,1,1,{/* 60789 */
	showscript "!?";
	soundeffect "se_door02.wav", 0, 0; //60785
	hideonnpc "#Secret_C-3"; //60789
	hideoffnpc "#Secret_C-4"; //60786
	initnpctimer;
	end;
OnTimer8000:
	hideonnpc "#Secret_C-4"; //60786
	hideoffnpc "#Secret_C-3"; //60789
	end;
}
moc_prydn2.gat,133,49,0	script	#Secret_C-4	139,1,1,{/* 60790 (hide)*/
	soundeffect "se_door02.wav", 0, 0; //60790
	warp "moc_prydn2.gat",126,51;
	end;
}
moc_prydn2.gat,29,88,0	script	#Secret_D-1	139,1,0,{/* 60791 */
OnTouch:
	switch('flag) {
	case 0:
		showscript "?";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0; //60795
		end;
	case 1:
		showscript "!?";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0; //60795
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0; //60795
		hideonnpc "#Secret_D-1"; //60795
		hideoffnpc "#Secret_D-2"; //60796
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	hideonnpc "#Secret_D-2"; //60796
	hideoffnpc "#Secret_D-1"; //60795
	end;
}
moc_prydn2.gat,44,95,0	script	#Secret_D-2	139,1,1,{/* 60792 (hide)*/
	soundeffect "se_door01.wav", 0, 0; //60792
	warp "moc_prydn2.gat",49,95;
	end;
}
moc_prydn2.gat,45,87,0	script	#Secret_D-3	139,1,0,{/* 60793 */
OnTouch:
	switch('flag) {
	case 0:
		showscript "?";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0; //60795
		end;
	case 1:
		showscript "!?";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0; //60795
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0; //60795
		hideonnpc "#Secret_D-3"; //60795
		hideoffnpc "#Secret_D-4"; //60796
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	hideonnpc "#Secret_D-4"; //60796
	hideoffnpc "#Secret_D-3"; //60795
	end;
}
moc_prydn2.gat,45,95,0	script	#Secret_D-4	139,1,1,{/* 60794 (hide)*/
	soundeffect "se_door01.wav", 0, 0; //60794
	warp "moc_prydn2.gat",40,95;
	end;
}
moc_prydn2.gat,29,172,0	script	#Secret_E-1	139,1,0,{/* 60795 */
OnTouch:
	switch('flag) {
	case 0:
		showscript "?";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0; //60795
		end;
	case 1:
		showscript "!?";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0; //60795
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0; //60795
		hideonnpc "#Secret_E-1"; //60795
		hideoffnpc "#Secret_E-2"; //60796
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	hideonnpc "#Secret_E-2"; //60796
	hideoffnpc "#Secret_E-1"; //60795
	end;
}
moc_prydn2.gat,44,178,0	script	#Secret_E-2	139,1,1,{/* 60796 (hide)*/
	soundeffect "se_door01.wav", 0, 0; //60796
	warp "moc_prydn2.gat",51,178;
	end;
}
moc_prydn2.gat,47,196,0	script	#Secret_E-3	139,1,0,{/* 60797 */
OnTouch:
	switch('flag) {
	case 0:
		showscript "?";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0; //60797
		end;
	case 1:
		showscript "!?";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0; //60797
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0; //60797
		hideonnpc "#Secret_E-3"; //60797
		hideoffnpc "#Secret_E-4"; //60798
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	hideonnpc "#Secret_E-4"; //60798
	hideoffnpc "#Secret_E-3"; //60797
	end;
}
moc_prydn2.gat,47,187,0	script	#Secret_E-4	139,1,1,{/* 60798 (hide)*/
	soundeffect "se_door01.wav", 0, 0; //60798
	warp "moc_prydn2.gat",40,187;
	end;
}
moc_prydn2.gat,156,196,0	script	#Secret_F-1	139,1,0,{/* 60799 */
OnTouch:
	switch('flag) {
	case 0:
		showscript "?";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0; //60797
		end;
	case 1:
		showscript "!?";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0; //60797
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0; //60797
		hideonnpc "#Secret_F-1"; //60797
		hideoffnpc "#Secret_F-2"; //60798
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	hideonnpc "#Secret_F-2"; //60798
	hideoffnpc "#Secret_F-1"; //60797
	end;
}
moc_prydn2.gat,156,187,0	script	#Secret_F-2	139,1,1,{/* 60800 (hide)*/
	soundeffect "se_door01.wav", 0, 0; //60798
	warp "moc_prydn2.gat",163,187;
	end;
}
moc_prydn2.gat,174,172,0	script	#Secret_F-3	139,1,0,{/* 60801 */
OnTouch:
	switch('flag) {
	case 0:
		showscript "?";
		set 'flag,1;
		soundeffect "alarm_move.wav", 0, 0; //60797
		end;
	case 1:
		showscript "!?";
		set 'flag,2;
		soundeffect "alarm_move.wav", 0, 0; //60797
		end;
	case 2:
		soundeffect "se_door02.wav", 0, 0; //60797
		hideonnpc "#Secret_F-3"; //60797
		hideoffnpc "#Secret_F-4"; //60798
		initnpctimer;
		end;
	}
OnTimer8000:
	set 'flag,0;
	hideonnpc "#Secret_F-4"; //60798
	hideoffnpc "#Secret_F-3"; //60797
	end;
}
moc_prydn2.gat,159,178,0	script	#Secret_F-4	139,1,1,{/* 60802 (hide)*/
	soundeffect "se_door01.wav", 0, 0; //60798
	warp "moc_prydn2.gat",152,178;
	end;
}
moc_prydn2.gat,102,182,4	script	アメンホテプの棺#kannok	801,{/* 60803 */}
moc_prydn2.gat,0,0,0	script	#moc_prydn2MVP	-1,{
	end;
OnInit:
	initnpctimer;
	end;
OnTimer18000000:
OnTimer19800000:
OnTimer21600000:
OnTimer23400000:
OnTimer25200000:
OnTimer27000000:
OnTimer28800000:
OnTimer30600000:
	if(rand(8))
		end;
OnTimer32400000:
	stopnpctimer;
	hideonnpc "アメンホテプの棺#kannok";
	areamonster "moc_prydn2.gat",0,0,0,0,"墓地の守護者",1098,15,"#moc_prydn2MVP::OnKilled2";
	monster "moc_prydn2.gat",102,85,"アメンホテプ",2362,1,"#moc_prydn2MVP::OnKilled";
	end;
OnKilled:
	initnpctimer;
	hideoffnpc "アメンホテプの棺#kannok";
	end;
OnKilled2:
	end;
}
