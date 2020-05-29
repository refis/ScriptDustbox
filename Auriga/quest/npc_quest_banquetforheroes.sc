/*
@spawn(type: BL_MOB, ID: 57828, speed: 100, option: 0, view: 3442, pos: "prt_prison.gat"(172, 266), dir: 1, name: "フローズンウルフ")
@nomalattack(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: , damage: 9324, sDelay: 504, dDelay: 400, tick: 18682483)
@skillcasting(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: , skill: "コールドボルト"(14), pl: 1, tick: 1000)
@skillattack(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: , skill: "コールドボルト"(14), skill_lv: -1, damage: 15705, sDelay: 504, dDelay: 400, tick: 18680862)
@skillcasting(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: , skill: "フロストダイバー"(15), pl: 1, tick: 300)
@skillattack(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: , skill: "フロストダイバー"(15), skill_lv: -1, damage: 713, sDelay: 504, dDelay: 400, tick: 19001895)
@skillnodamage(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: 57828, skill: "リフレクトシールド"(252), val: 10)
@skillnodamage(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: 57828, skill: "取り巻き呼び戻し"(352), val: 1)
@skillcasting(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: 57828, skill: "NPC_MANDRAGORA"(735), pl: 0, tick: 300)
@skillnodamage(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: 57828, skill: "NPC_MANDRAGORA"(735), val: 1)
@skillattack(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: , skill: "NPC_DRAGONBREATH"(731), skill_lv: -1, damage: 16081, sDelay: 504, dDelay: 400, tick: 19012407)
@skillposeffect(src: "3442:フローズンウルフ:prt_prison.gat"(57828), skill: "NPC_DRAGONBREATH"(731), val: 65535, tick: 19012408)
@skillcasting(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: 57828, skill: "範囲凍結攻撃"(664), pl: 0, tick: 800)
@skillattack(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: 57828, skill: "範囲凍結攻撃"(664), skill_lv: 1, damage: -30000, sDelay: 504, dDelay: 0, tick: 20180612)
@skillattack(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: , skill: "水属性攻撃"(184), skill_lv: -1, damage: 5386, sDelay: 504, dDelay: 400, tick: 20183537)
@skillcasting(src: "3442:フローズンウルフ:prt_prison.gat"(57828), dst: 57828, skill: "ベナムフォグ"(706), pl: 5, tick: 500)
@skillposeffect(src: "3442:フローズンウルフ:prt_prison.gat"(57828), skill: "ベナムフォグ"(706), val: 65535, tick: 20276491)
@skillcasting(src: "3442:フローズンウルフ:prt_prison.gat"(57801), dst: 57801, skill: "ジャックフロスト"(720), pl: 1, tick: 500)
@skillnodamage(src: "3442:フローズンウルフ:prt_prison.gat"(57801), dst: 57801, skill: "ジャックフロスト"(720), val: 1)
@skillcasting(src: "3442:フローズンウルフ:prt_prison.gat"(57801), dst: 57801, skill: "ベナムフォグ"(706), pl: 5, tick: 200)
@skillposeffect(src: "3442:フローズンウルフ:prt_prison.gat"(57801), skill: "ベナムフォグ"(706), val: 65535, tick: 22330700)

@spawn(type: BL_MOB, ID: 804, speed: 100, option: 0, view: 3540, pos: "prt_prison.gat"(159, 267), dir: 0, name: "リトルフローズンウルフ")
@nomalattack(src: "3540:リトルフローズンウルフ:prt_prison.gat"(804), dst: , damage: 3525, sDelay: 504, dDelay: 400, aDelay: 1060)
@skillattack(src: "3540:リトルフローズンウルフ:prt_prison.gat"(805), dst: 805, skill: "ストーンスキン"(675), skill_lv: 4, damage: -30000, sDelay: 504, dDelay: 0, tick: 18998588)
@skillnodamage(src: "3540:リトルフローズンウルフ:prt_prison.gat"(804), dst: 804, skill: "リフレクトシールド"(252), val: 10)

@spawn(type: BL_MOB, ID: 57940, speed: 150, option: 0, view: 3475, pos: "prt_prison.gat"(147, 251), dir: 0, name: "不滅のウィンドゴースト")
@nomalattack(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57940), dst: , damage: 1246, sDelay: 1056, dDelay: 400, aDelay: 1060)
@skillcasting(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57940), dst: , skill: "ライトニングボルト"(20), pl: 4, tick: 1500)
@skillattack(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57940), dst: , skill: "ライトニングボルト"(20), skill_lv: -1, damage: 76860, sDelay: 1056, dDelay: 400, tick: 20731237)
@skillcasting(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57940), dst: , skill: "ユピテルサンダー"(84), pl: 4, tick: 1500)
@skillattack(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57940), dst: , skill: "不死属性攻撃"(347), skill_lv: -1, damage: 1200, sDelay: 1056, dDelay: 400, tick: 20975983)
@skillcasting(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57940), dst: , skill: "ユピテルサンダー"(84), pl: 4, tick: 1500)
@skillcasting(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57957), dst: , skill: "魔法打撃攻撃"(192), pl: 0, tick: 1000)
@skillattack(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57957), dst: , skill: "魔法打撃攻撃"(192), skill_lv: -1, damage: 4592, sDelay: 1056, dDelay: 400, tick: 24801191)
@skillposeffect(src: "3475:不滅のウィンドゴースト:prt_prison.gat"(57957), skill: "ショックウェーブトラップ"(118), val: 65535, tick: 22078848)
getitem 912, 1;
getitem 932, 1;

@spawn(type: BL_MOB, ID: 57867, speed: 100, option: 0, view: 3443, pos: "prt_prison.gat"(161, 245), dir: 0, name: "タフィー")
@nomalattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: , damage: 5501, sDelay: 840, dDelay: 400, aDelay: 1620)
@skillattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "ストーンスキン"(675), skill_lv: 4, damage: -30000, sDelay: 840, dDelay: 0, tick: 21108029)
@skillcasting(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "NPC_MANDRAGORA"(735), pl: 0, tick: 300)
@skillnodamage(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "NPC_MANDRAGORA"(735), val: 1)
@skillcasting(src: "3443:タフィー:prt_prison.gat"(57867), dst: , skill: "ファイアーボルト"(19), pl: 3, tick: 1000)Lv3
@skillattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: , skill: "ファイアーボルト"(19), skill_lv: -1, damage: 4101, sDelay: 840, dDelay: 400, tick: 21117896)
@skillcasting(src: "3443:タフィー:prt_prison.gat"(57867), dst: , skill: "ファイアーボール"(17), pl: 3, tick: 300)
@skillattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: , skill: "ファイアーボール"(17), skill_lv: -1, damage: 3451, sDelay: 840, dDelay: 400, tick: 21120687)
@skillcasting(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "範囲沈黙攻撃"(663), pl: 0, tick: 300)
@skillattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "範囲沈黙攻撃"(663), skill_lv: 3, damage: -30000, sDelay: 840, dDelay: 0, tick: 21123623)
@skillcasting(src: "3443:タフィー:prt_prison.gat"(57867), dst: , skill: "ダンシングブレード"(713), pl: 0, tick: 500)
@skillposeffect(src: "3443:タフィー:prt_prison.gat"(57867), skill: "ダンシングブレード"(713), val: 65535, tick: 21124686)
@skillnodamage(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "リフレクトシールド"(252), val: 10)
@skillnodamage(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "取り巻き呼び戻し"(352), val: 1)
@skillcasting(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "範囲沈黙攻撃"(663), pl: 0, tick: 800)
@skillattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: 57867, skill: "範囲沈黙攻撃"(663), skill_lv: 1, damage: -30000, sDelay: 840, dDelay: 0, tick: 21298397)
@skillattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: , skill: "ファイアブレス"(654), skill_lv: 1, damage: -30000, sDelay: 840, dDelay: 0, tick: 21391466)
@skillattack(src: "3443:タフィー:prt_prison.gat"(57867), dst: , skill: "ファイアブレス"(654), skill_lv: -1, damage: 0, sDelay: 840, dDelay: 0, tick: 21391466)
@skillcasting(src: "3443:タフィー:prt_prison.gat"(57883), dst: , skill: "NPC_ARROWSTORM"(728), pl: 0, tick: 500)Lv3
@skillattack(src: "3443:タフィー:prt_prison.gat"(57883), dst: , skill: "NPC_ARROWSTORM"(728), skill_lv: -1, damage: 55413, sDelay: 840, dDelay: 400, tick: 21660763)
@skillattack(src: "3443:タフィー:prt_prison.gat"(57890), dst: , skill: "NPC_DRAGONBREATH"(731), skill_lv: -1, damage: 38125, sDelay: 840, dDelay: 400, tick: 22198302)
@skillposeffect(src: "3443:タフィー:prt_prison.gat"(57890), skill: "NPC_DRAGONBREATH"(731), val: 65535, tick: 22198302)

@spawn(type: BL_MOB, ID: 882, speed: 100, option: 0, view: 3553, pos: "prt_prison.gat"(164, 243), dir: 0, name: "リトルタフィー")
@nomalattack(src: "3553:リトルタフィー:prt_prison.gat"(883), dst: , damage: 2999, sDelay: 840, dDelay: 400, aDelay: 1606)
@skillattack(src: "3553:リトルタフィー:prt_prison.gat"(883), dst: 883, skill: "ストーンスキン"(675), skill_lv: 4, damage: -30000, sDelay: 840, dDelay: 0, tick: 21106761)
@skillnodamage(src: "3553:リトルタフィー:prt_prison.gat"(883), dst: 883, skill: "リフレクトシールド"(252), val: 10)

@spawn(type: BL_MOB, ID: 57964, speed: 200, option: 0, view: 3474, pos: "prt_prison.gat"(123, 241), dir: 0, name: "不滅の呪われた騎士")
@nomalattack(src: "3474:不滅の呪われた騎士:prt_prison.gat"(57964), dst: , damage: 0, sDelay: 528, dDelay: 400, aDelay: 840)
@skillcasting(src: "3474:不滅の呪われた騎士:prt_prison.gat"(57975), dst: , skill: "闇属性攻撃"(190), pl: 7, tick: 500)
@skillnodamage(src: "3474:不滅の呪われた騎士:prt_prison.gat"(57964), dst: 57964, skill: "ブレイクウェポン"(343), val: 5)
@skillattack(src: "3474:不滅の呪われた騎士:prt_prison.gat"(57964), dst: , skill: "シールドチャージ"(250), skill_lv: -1, damage: 8393, sDelay: 528, dDelay: 400, tick: 21946651)
@skillcasting(src: "3474:不滅の呪われた騎士:prt_prison.gat"(57964), dst: 0, skill: "メテオストーム"(83), pl: 3, tick: 1500)
getitem 7054, 1;

@spawn(type: BL_MOB, ID: 57930, speed: 190, option: 0, view: 3444, pos: "prt_prison.gat"(108, 170), dir: 0, name: "ウォッチャー")
@nomalattack(src: "3444:ウォッチャー:prt_prison.gat"(57935), dst: , damage: 0, sDelay: 432, dDelay: 400, aDelay: 580)
@skillnodamage(src: "3444:ウォッチャー:prt_prison.gat"(57935), dst: 57935, skill: "広範囲スパイダーウェブ"(721), val: 1)
@skillnodamage(src: "3444:ウォッチャー:prt_prison.gat"(57935), dst: 57935, skill: "広範囲スパイダーウェブ"(721), val: 1)
@skillcasting(src: "3444:ウォッチャー:prt_prison.gat"(57935), dst: , skill: "石化攻撃"(180), pl: 2, tick: 500)
@skillattack(src: "3444:ウォッチャー:prt_prison.gat"(57935), dst: , skill: "石化攻撃"(180), skill_lv: -1, damage: 1285, sDelay: 432, dDelay: 400, tick: 24934972)
@skillcasting(src: "3444:ウォッチャー:prt_prison.gat"(57935), dst: , skill: "精神破壊"(159), pl: 8, tick: 800)
@skillattack(src: "3444:ウォッチャー:prt_prison.gat"(57935), dst: , skill: "精神破壊"(159), skill_lv: -1, damage: 1199, sDelay: 432, dDelay: 400, tick: 24923999)
getitem 576, 1;
*/

prt_prison.gat,159,206,0	warp	jump_A1	1,1,prt_prison.gat,159,195 //59644 from_pos=(160, 206)
prt_prison.gat,159,198,0	warp	jump_A2	1,1,prt_prison.gat,159,208 //59645 from_pos=(159, 198)
prt_prison.gat,87,254,0		warp	secret_A1	1,1,prt_prison.gat,88,207 //59648 from_pos=(88, 253)
prt_prison.gat,85,202,0		warp	jump_A2	1,1,prt_prison.gat,90,254 //59649 from_pos=(85, 202)

prt_prison.gat,117,188,4	script	囚人 117FM188#EP161F	10136,{/* 59636 */}
prt_prison.gat,103,214,4	script	囚人 103GD214#EP161G	737,{/* 59637 */}

prontera.gat,121,72,3	script	王室急使#e16_prt	833,5,5,{/* 51186 */
	if(ASH_1QUE < 100) {	//異世界クエスト未クリア
		mes "[急使]";
		mes "こんにちは。王宮では";
		mes "アッシュバキュームで活躍をした方々を";
		mes "招待して宴を開いています。";
		mes "もしあなたが知っている人の中に";
		mes "^4d4dff異世界遠征へ赴いた英雄^000000がいらしたら";
		mes "ぜひ、教えてください。";
		next;
		mes "[急使]";
		mes "軍の所属ではない冒険者様たちを";
		mes "見つけるのは難しくて、";
		mes "なかなか思うように進まないのです。";
		close;
	}
	if(EP16_1QUE == 0) {
		mes "[急使]";
		mes "お待ちください。";
		mes strcharinfo(0)+ "様ですね？";
		mes "えーと……";
		next;
		mes "[急使]";
		mes "ああ、よかった。";
		mes "間違いないですね。";
		mes "ギルドから配布された";
		mes "人相の絵と一致します。";
		next;
		mes "[急使]";
		mes "軍の所属ではない冒険者様たちを";
		mes "見つけるのはなかなか難しくて。";
		mes "都市の急使たちが皆、";
		mes "人相絵を持って";
		mes "あなた方を探しているのです。";
		next;
		menu "私になにか用ですか？",-;
		mes "[急使]";
		mes "はい。実は今、王宮では";
		mes "モロク討伐を祝う宴が";
		mes "王家主催で行われています。";
		next;
		mes "[急使]";
		if(checkquest(201730)) {	// 魔神殿攻略済み
			mes "その祝宴に";
			mes strcharinfo(0)+ "様を";
			mes "^4d4dff貴賓としてご招待^000000したいのです。";
			mes "なにしろ、あなたは";
			mes "あの、魔王モロクを討伐された";
			mes "当事者ですから！";
		}
		else {
			mes strcharinfo(0)+ "様は";
			mes "遠征と討伐に貢献した英雄ですので、";
			mes "その祝宴に^4d4dff貴賓としてご招待^000000したいのです。";
		}
		next;
		if(select("貴賓？","招待？","結構です") == 3) {
			mes "[急使]";
			mes "そ、そんなことをおっしゃらず";
			mes "……ハッ！";
			mes "もしかして、お受けするという意味の";
			mes "結構ですでしょうか？";
			mes "ありがとうございます。";
			next;
		}
		mes "[急使]";
		mes "はい。私はただの使いですので、";
		mes "詳細はわかりませんが、";
		mes "王宮で聞けると思います。";
		mes "この招待状をお持ちになってくだされば";
		mes "すぐに話は通りますから。";
		next;
		mes "[急使]";
		mes "さあ、王宮では多くの者が";
		mes "あなたの訪れを待っています。";
		mes "今すぐ王宮へ向かってください。";
		next;
		if(checkitemblank() == 0) {
			mes "‐荷物をこれ以上持てません";
			mes "　荷物に1個以上の空きを";
			mes "　作ってください‐";
			close;
		}
		mes "[急使]";
		mes "もし望むのであれば、";
		mes "すぐお送りさせていただきます。";
		getitem 6933, 1;
		setquest 7681;
		set EP16_1QUE,1;
		next;
		if(select("送ってもらわない","送ってもらう") == 1) {
			mes "[急使]";
			mes strcharinfo(0)+ "様が";
			mes "直接向かってくださるのですね。";
			mes "ありがとうございます。";
			mes "^FF0000プロンテラ城^000000に到着しましたら、";
			mes "入り口にいる祝宴の会場案内人に";
			mes "この招待状をお見せください。";
			next;
			mes "[急使]";
			mes "それでは私は";
			mes "他の方にも招待状を";
			mes "届けなければなりませんので、";
			mes "これで失礼いたします。";
			mes "よい時間をお過ごしください。";
			close;
		}
		mes "[急使]";
		mes "わかりました。";
		mes "それではお送りします。";
		mes "お送りした先に祝宴の会場案内人が";
		mes "おりますのでお声をおかけください。";
		next;
		mes "[急使]";
		mes "それではいってらっしゃいませ。";
		mes "よい時間をお過ごしください。";
		close2;
		warp "prt_castle.gat",102,24;
		end;
	}
	mes "[急使]";
	mes "おや、" +strcharinfo(0)+ "様。";
	mes "どうされました？";
	next;
	if(select("祝宴場に送って欲しい","なんでもない") == 2) {
		mes "[急使]";
		mes "そうですか。失礼いたしました。";
		close;
	}
	mes "[急使]";
	mes "わかりました。";
	mes "それではお送りします。";
	mes "お送りした先に祝宴の会場案内人が";
	mes "おりますのでお声をおかけください。";
	next;
	mes "[急使]";
	mes "それではいってらっしゃいませ。";
	mes "よい時間をお過ごしください。";
	close2;
	warp "prt_castle.gat",102,24;
	end;
OnTouch:
	if(ASH_1QUE < 100 || EP16_1QUE > 0)	//異世界クエスト未クリア
		end;
	unittalk "王室急使 : お待ちください！　" +strcharinfo(0)+ "様ではありませんか？　お伝えしたいことがあります！";
	end;
}

geffen.gat,123,68,3		duplicate(王室急使#e16_prt)	王室急使#e16_gef	833,5,5
payon.gat,121,72,3		duplicate(王室急使#e16_prt)	王室急使#e16_pay	833,5,5
morocc.gat,121,72,3		duplicate(王室急使#e16_prt)	王室急使#e16_moc	833,5,5
alberta.gat,121,72,3	duplicate(王室急使#e16_prt)	王室急使#e16_alb	833,5,5
aldebaran.gat,159,113,3	duplicate(王室急使#e16_prt)	王室急使#e16_alde	833,5,5
dali.gat,114,88,3		duplicate(王室急使#e16_prt)	王室急使#e16_dali	833,5,5

prt_castle.gat,106,27,4	script	祝宴の会場案内人#ep16	105,{/* 51188 */
	mes "[衛兵]";
	mes "祝宴が行われている会場へ";
	mes "ご案内しております。";
	mes "なお、会場は宮殿内にありまして";
	mes "王族の方々もいらっしゃるので";
	mes "振る舞いには気をつけてください。";
	next;
	if(select("行きたいです","用はないです") == 2) {
		mes "[衛兵]";
		mes "わかりました。";
		close;
	}
	mes "[衛兵]";
	mes "それではご案内します。";
	close2;
	warp "prt_cas.gat",216,146;
	end;
}

prt_cas.gat,343,67,4	script	気難しい司書#ep16lug0	71,{/* 60519 */
	mes "[気難しい司書]";
	mes "図書館にようこそ。";
	next;
	mes "[気難しい司書]";
	mes "まずはゆっくりと";
	mes "気に入る本のタイトルから";
	mes "探してみてください。";
	mes "そして気になったものは";
	mes "ぜひ読んでみてください。";
	mes "本は心に潤いを与えるものですから。";
	close;
}
prt_cas.gat,364,69,3	script	緊張した男#ep16lug01	748,{/* 60520 */
	mes "[緊張した男]";
	mes "うーん、ここにもない……";
	mes "いったいどこにあの本があるんだ。";
	next;
	mes "[からかう男]";
	mes "おいおい、そこまでして";
	mes "内容を調べる必要があるのか？";
	close;
}
prt_cas.gat,365,68,3	script	からかう男#ep16lug01	898,{/* 60521 */
	mes "[緊張した男]";
	mes "うーん、ここにもない……";
	mes "いったいどこにあの本があるんだ。";
	next;
	mes "[からかう男]";
	mes "おいおい、そこまでして";
	mes "内容を調べる必要があるのか？";
	close;
}
prt_pri00.gat,51,116,8	script	エルロンド・ロレンス#EP	751,{/* 60522 */
	if(BaseLevel < 150) {
		mes "[エルロンド・ロレンス]";
		mes "あなたは";
		mes "関係者ではありませんね？";
		mes "ここは関係者以外の";
		mes "出入りを禁止しています。";
		mes "ご協力をお願いします。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "……まあ、もう少し";
		mes "お強そうになったら";
		mes "問題なくなると思いますが。";
		next;
		mes "‐^ff0000BaseLvが150以上の場合";
		mes "　プロンテラ地下監獄に";
		mes "　進行することが出来ます^000000‐";
		close;
	}
	if(!(checkquest(5415) & 0x8)) {		// プロンテラ地下監獄入場許可
		mes "[エルロンド・ロレンス]";
		mes "こんにちは。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "失礼ですが……";
		mes "ここからは関係者以外の";
		mes "出入りを禁止しています。";
		mes "ご協力をお願いします。";
		next;
		emotion 0; //60574
		mes "[エルロンド・ロレンス]";
		mes "……それにしても";
		mes "ここは誰でも出入りできる";
		mes "区域ではないのですが……";
		mes "……むむ。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "あの魔王モロクを倒されたという";
		mes "冒険者様が今、";
		mes "王宮の祝宴に招待されたという";
		mes "話を聞いております。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "その風貌、使い込まれた武具……";
		mes "もしかして……";
		next;
		emotion 23; //60574
		mes "[エルロンド・ロレンス]";
		mes "招待された冒険者様は、";
		mes "あなたですか？";
		next;
		emotion 38; //60574
		mes "[エルロンド・ロレンス]";
		mes "うおお……凄い！";
		mes "噂で聞いていました。";
		mes "私、あなたのファンです。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "祝宴が開かれる日に";
		mes "ここの警備になってしまって";
		mes "ちょっと憂鬱だったんですが、";
		mes "お会い出来て";
		mes "本当にうれしいです！";
		next;
		mes "[エルロンド・ロレンス]";
		mes "自己紹介させてください!!";
		mes "私は王室クルセイダーの";
		mes "エルロンド・ロレンスと申します。";
		mes "冒険者様の活躍を聞いて";
		mes "憧れておりました!!";
		next;
		mes "[エルロンド・ロレンス]";
		mes "あ！";
		mes "そうだ。";
		mes "サインをお願いしても";
		mes "いいでしょうか？";
		next;
		switch(select("サインしない","サインする")) {
		case 1:
			mes "[エルロンド・ロレンス]";
			mes "そうですか……";
			mes "残念ですが、仕方ないですね。";
			mes "気が向いたらお願いします。";
			break;
		case 2:
			input '@str$;
			emotion 14; //60574
			mes "[エルロンド・ロレンス]";
			mes '@str$;
			next;
			mes "[エルロンド・ロレンス]";
			mes "……うわあ～！";
			mes "感謝します。";
			mes "同僚たちに自慢できる";
			mes "宝物ができました。";
			mes "感激です。";
			break;
		}
		next;
		mes "[エルロンド・ロレンス]";
		mes "あ！　あっ！";
		mes "そうだ。";
		mes "そう！";
		next;
		mes "[エルロンド・ロレンス]";
		mes "実は、王室クルセイダー内で";
		mes "地下監獄で発生した問題への対処を";
		mes "有名な冒険者様に";
		mes "お願いしてみようという話が";
		mes "あったんです。";
		next;
		menu "地下監獄で発生した問題？",-;
		mes "[エルロンド・ロレンス]";
		mes "お～！";
		mes "やはり冒険者様なら";
		mes "興味を持つと思いました。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "お名前と実力はすでに";
		mes "証明されたも同然ですし、";
		mes "詳しい状況をお話ししましょう。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "実はこれは";
		mes "長いこと解決されずにいる、";
		mes "とても頭を悩まされる";
		mes "問題なのです……";
		next;
		menu "ほう？",-,"そんなに……",-,"はい",-;
		mes "[エルロンド・ロレンス]";
		mes "私たちの警備するこの地下監獄に";
		mes "前はいなかったモンスターたちが";
		mes "出現しはじめたのです。";
		next;
		menu "……モンスターが",-,"警備してるんですよね？",-,"それは大変ですね",-;
		mes "[エルロンド・ロレンス]";
		mes "あっ！";
		mes "誤解されては困ります！";
		next;
		emotion 16; //60574
		mes "[エルロンド・ロレンス]";
		mes "私たちクルセイダーたちは";
		mes "地下監獄に出現したモンスター退治に";
		mes "力を注いでいます。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "ですが、私たちの倒す数より";
		mes "増える方が早いのです。";
		mes "ついに手におえない状況まで";
		mes "きてしまいました。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "恥ずかしい話ですが";
		mes "モンスターがどこを通じて";
		mes "入ってきているかさえも";
		mes "把握出来ていないのです。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "あ、すいません。";
		mes "前置きが";
		mes "長かったですよね。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "冒険者様にお願いしたいのは、";
		mes "暇な時に地下監獄の";
		mes "モンスター退治をお願いしたいのです。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "もちろん、";
		mes "報告書を書いていただく";
		mes "必要はありませんよ。";
		mes "それは私が書きます。";
		next;
		mes "‐プロンテラ地下監獄に";
		mes "　進行できるようになった‐";
		setquest 5415; //state=1
		compquest 5415;
		close;
	}
	mes "[エルロンド・ロレンス]";
	mes "地下監獄に入りますか？";
	mes "それともなにか……";
	mes "気になることでも？";
	next;
	switch(select("地下監獄に行く","地下監獄について","囚人について","似たような奴らを見たような気がする")) {
	case 1:
		mes "[エルロンド・ロレンス]";
		mes "わかりました。";
		mes "どうかお気をつけて……！";
		close2;
		warp "prt_prison.gat",160,290;
		end;
	case 2:
		mes "[エルロンド・ロレンス]";
		mes "ほうほう！";
		mes "地下監獄が気になりますか？";
		next;
		mes "[エルロンド・ロレンス]";
		mes "大体の国には、罪を犯した者を";
		mes "収容する施設があるように、";
		mes "ルーンミッドガッツ王国の";
		mes "平和と安全を脅かす存在たちを";
		mes "閉じ込める為に作られたと";
		mes "聞いています。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "基本的に丈夫に";
		mes "建てられてはいますが……";
		next;
		mes "[エルロンド・ロレンス]";
		mes "とても古い施設なので";
		mes "あらゆる補修が必要な状態です。";
		mes "状況が状況なので";
		mes "修理ができていないまま";
		mes "なんですけどね。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "ですので、現状、";
		mes "あまり良い状態ではないので、";
		mes "地下監獄で怪我などしないように";
		mes "気を付けてください。";
		close;
	case 3:
		mes "[エルロンド・ロレンス]";
		mes "見てお分かりに";
		mes "なったと思いますが、";
		mes "監獄の中にいる存在たちは";
		mes "モンスターたちです。";
		mes "誰がどうみても";
		mes "モンスターですよね？";
		next;
		mes "[エルロンド・ロレンス]";
		mes "あまりにも古い施設でもあり、";
		mes "書類すら紛失していたりもして……";
		mes "ただ伝え聞いている内容に";
		mes "なりますが、お話しますね。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "確かなのは、彼らは過去";
		mes "ルーンミッドガッツ王国を";
		mes "混乱に陥れた存在だということ。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "残念ながら彼らの罪名も";
		mes "懲役も残っている";
		mes "文書はありません。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "あるクルセイダーが";
		mes "罪名と懲役が記されていた";
		mes "文書を無くしてしまったという";
		mes "ことが書かれた文書だけは";
		mes "伝わっているんですが……";
		next;
		mes "[エルロンド・ロレンス]";
		mes "まあ地下監獄にいる奴らも";
		mes "特に気にしていなさそうなので";
		mes "問題はなさそうです。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "気になるとすれば、";
		mes "懲役が終わったかも";
		mes "しれないにも関わらず、";
		mes "外に出れない奴らも";
		mes "いるということでしょうか。";
		close;
	case 4:
		mes "[エルロンド・ロレンス]";
		mes "あ！";
		mes "その話、私も聞いたことが";
		mes "あります。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "私達、王室クルセイダーも";
		mes "集団ですから";
		mes "冒険者の経歴を持つ者もいます。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "その彼が地下監獄に収容されている";
		mes "奴らにそっくりなモンスターが";
		mes "外を歩き回っているのを見たと";
		mes "言っていました。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "クルセイダーの間では";
		mes "冒険者出身だからきっと、";
		mes "嘘をついているに違いないと";
		mes "相手にはしなかったのですが……";
		next;
		emotion 23; //60574
		mes "[エルロンド・ロレンス]";
		mes "あっ！";
		mes "冒険者様がそうだとは";
		mes "思っていませんよ!?";
		mes "ただ、そいつは普段から";
		mes "嘘や、妄想話が酷くて……";
		next;
		mes "[エルロンド・ロレンス]";
		mes "確信を持って言いますが、";
		mes "外を歩き回っているモンスターと";
		mes "地下監獄にいる奴らは";
		mes "違う存在です。";
		next;
		mes "[エルロンド・ロレンス]";
		mes "多分、それらの兄弟や";
		mes "遠い親戚みたいなものでは";
		mes "ないかと……";
		mes "モンスターに兄弟や親戚が";
		mes "いるのかは知りませんが。";
		close;
	}
}
prt_prison.gat,155,290,0	warp	prt_prison_OUT	1,1,prt_pri00.gat,50,120	//59630

prt_cas_q.gat,80,80,4	script	リハルト家執事#EP161GAM	57,{/* 60566 */
	switch(EP16_SUB2) {
	case 0:
		mes "[執事]";
		mes "こんにちは。お待ちしていました。";
		mes "ここには建国初期から";
		mes "軍権を掌握してきた";
		mes "リハルト家が滞在しています。";
		next;
		mes "[執事]";
		if(checkquest(201730)) {	// 魔神殿攻略済み
			mes "あの魔王モロクを";
			mes "討伐されたという";
		}
		else
			mes "モロク討伐に貢献したという";
		mes strcharinfo(0)+ "様の名声は";
		mes "日々、耳にしております。";
		mes "お会いできて光栄です。";
		next;
		mes "[執事]";
		mes "部屋の中で我がリハルト家の";
		mes "ポー様がお待ちです。";
		next;
		setquest 5402; //state=1
		set EP16_SUB2,1;
		mes "[執事]";
		mes "それではご案内します。";
		close;
	case 1:
		mes "[執事]";
		mes "我がリハルト家の";
		mes "ポー様がお待ちです。";
		mes "どうぞお入りください。";
		close;
	case 2:
		mes "[執事]";
		mes "ポー様とお話はされましたか？";
		close;
	case 3:
		setquest 73125; //state=1
	case 4:
		compquest 73125;	//TODO
		mes "[執事]";
		mes "戦闘訓練を行っていただけるのですね。";
		mes "協力に感謝します。";
		mes "西の離宮の前にある^ff0000冒険者歓迎室^000000に";
		mes "リハルト家の訓練官がいます。";
		mes "彼から戦闘訓練を受けてください。";
		next;
		mes "[執事]";
		mes "よろしければ、";
		mes "部屋までご案内いたしましょうか？";
		next;
		if(select("お願いする","自分の足で歩いていく") == 2) {
			mes "[執事]";
			mes "かしこまりました。";
			close;
		}
		mes "[執事]";
		mes "かしこまりました。";
		mes "ではこちらへどうぞ。";
		close2;
		warp "prt_cas.gat",15,30;
		end;
	}
}
prt_cas_q.gat,93,74,4	script	ポー・リハルト#EP161GAM	993,{/* 60567 */
	cutin "richard_po01.BMP", 2;
	switch(EP16_SUB2) {
	case 0:
		cutin "richard_po02.BMP", 2;
		emotion 19, "ポー・リハルト#EP161GAM"; //60595
		mes "[ポー]";
		mes "やあ、キミは";
		mes "祝宴に招待された冒険者かな？";
		mes "……すまないが、";
		mes "私はいま疲れているので";
		mes "休みたいのだ。";
		next;
		mes "[ポー]";
		mes "部屋の前にいる執事に話して";
		mes "時間を決めてから";
		mes "また来るといい。";
		close2;
		cutin "richard_po01.BMP", 255;
		end;
	case 1:
		emotion 52, "ポー・リハルト#EP161GAM"; //60595
		mes "[ポー]";
		if(checkquest(201730)) {	// 魔神殿攻略済み
			mes "やあ。キミが魔王モロクを";
			mes "討伐したという";
		}
		else {
			mes "やあ。キミが魔王モロクの";
			mes "討伐に貢献したという";
		}
		mes "冒険者なんだね？";
		mes "その名声は王室にも";
		mes "広く知られているよ。";
		next;
		menu "ご挨拶に伺いました",-;
		mes "[ポー]";
		mes "これはこれは。";
		mes "わざわざ恐縮だ。";
		mes "ようこそ、リハルト家へ。";
		next;
		mes "[ポー]";
		mes "祝宴を楽しんでいるか？";
		mes "それとも王位継承についての方が";
		mes "気になるか？";
		mes "ふふふ、";
		mes "この私が王位につくと思うか？";
		next;
		mes "[ポー]";
		mes "私は王位に興味がある。";
		mes "だが、最近は軍事面についてのほうが";
		mes "興味があるのだ。";
		next;
		mes "[ポー]";
		mes "王になってくれと";
		mes "他の王家の家門連中に";
		mes "土下座されたら考えてもいいがな。";
		next;
		mes "[ポー]";
		mes "正直、今は王位より";
		mes "キミのほうに興味がある。";
		next;
		menu "え！",-;
		mes "[ポー]";
		mes "……まあ、その話は後でよいか。";
		mes "挨拶回りがあるのだろう？";
		mes "祝宴を楽しんで行ってくれ。";
		next;
		cutin "richard_po02.BMP", 255;
		delquest 5402;
		delquest 73053;
		set EP16_SUB2,2;
		mes "‐^0000cdリハルト家との挨拶を済ました。^000000";
		mes "　他の王家にも挨拶に行こう‐";
		next;
		mes "‐立ち去ろうとすると";
		mes "　ポーが話しかけてきた‐";
		next;
		cutin "richard_po02.BMP", 2;
		mes "[ポー]";
		mes "挨拶回りで忙しい中悪いが、";
		mes "よかったら私の話を聞いてほしい。";
		mes "前からキミに注目していたのだ。";
		mes "時間があるならば";
		mes "私に話しかけて欲しい。";
		close2;
		cutin "richard_po02.BMP", 255;
		end;
	case 2:
		mes "[ポー]";
		mes "我がリハルト家が";
		mes "キミに注目している理由を";
		mes "話すことにしようか。";
		next;
		mes "‐ポー・リハルトが少し真面目な";
		mes "　顔つきになった‐";
		next;
		mes "[ポー]";
		mes "リハルト家は古くより、";
		mes "兵士を育成、強化して";
		mes "ルーンミッドガッツ王国の国防を";
		mes "担っている。";
		mes "まあ、戦争屋と呼ぶ者もいるがな。";
		next;
		mes "[ポー]";
		mes "優れた兵士。";
		mes "今、リハルト家が求める優れた兵士とは";
		mes "あらゆる戦局に対応できる兵士だ。";
		mes "そのために、兵士たちに";
		mes "リハルト家の戦略と戦術を";
		mes "叩き込んでいる。";
		next;
		mes "[ポー]";
		mes "どのような困難があろうとも、";
		mes "機略を駆使して突破する";
		mes "兵士の大量生産。";
		mes "それが今の私が一番望むものだ。";
		next;
		mes "[ポー]";
		mes "戦いは変化し、進化する。";
		mes "だからこそ、それに対応できる";
		mes "戦略と戦術が必要なのだ。";
		next;
		mes "[ポー]";
		mes "すなわち、";
		mes "多くの戦場の経験が必要になる。";
		mes "そこでキミへのお願いだ。";
		mes "是非、キミに";
		mes "私の指定する戦闘訓練を行ってもらい";
		mes "戦術データをとりたいのだ。";
		next;
		mes "[ポー]";
		mes "もちろん、協力してくれれば";
		mes "それに見合う報酬も支給する。";
		mes "どうだ？";
		mes "お互い悪い話ではないと思うが。";
		next;
		if(select("戦闘訓練に挑戦する","断る") == 2) {
			emotion 57, "ポー・リハルト#EP161GAM"; //60595
			mes "[ポー]";
			mes "そうか。残念だが仕方ないな。";
			mes "気が変わったら訪ねて来てくれ。";
			close2;
			cutin "richard_po02.BMP", 255;
			end;
		}
		emotion 33, "ポー・リハルト#EP161GAM"; //60595
		mes "[ポー]";
		mes "そうか！　そうか！";
		mes "チャレンジ精神旺盛な者は";
		mes "とても好きだぞ！";
		mes "協力感謝する。";
		next;
		mes "[ポー]";
		mes "執事に手筈を整えておくよう伝える。";
		mes "キミは準備が整ったら";
		mes "彼に声をかけてくれ。";
		mes "結果を楽しみにしてるぞ！";
		next;
		mes "[ポー]";
		mes "国を守るためには";
		mes "どうしても兵力が必要なのだ。";
		next;
		mes "[ポー]";
		mes "この数年、時代は大きく変化した。";
		mes "魔王モロクの登場による";
		mes "異世界への進出。";
		mes "そして、異種族の技術が流入し、";
		mes "魔神となったモロクすら討伐できた。";
		next;
		mes "[ポー]";
		mes "……驚くべきことにね、";
		mes "時を戻ることも可能になり、";
		mes "過去の英雄や偉人にも";
		mes "会えるようになった。";
		next;
		mes "[ポー]";
		mes "この状況で私は";
		mes "考えなくてはいけないよ。";
		mes "……彼らが敵になった場合、";
		mes "どのように倒せばよいのだろうか、と。";
		next;
		mes "[ポー]";
		mes "ラフィネ族を倒すためには、";
		mes "サファ族を倒すためには、";
		mes "レシア族を倒すためには、";
		mes "過去の時代の兵士を倒すためには";
		next;
		mes "[ポー]";
		mes "どのような戦略と戦術が";
		mes "必要になるのか。";
		next;
		if(select("彼らは敵じゃないです！","そんなことを考えなければ……") == 1) {
			mes "[ポー]";
			mes "気を悪くしないでくれ。";
			mes "彼らを敵とは思ってはいない。";
			mes "ただ、リハルト家の長としては、";
			mes "考えなくてはいけないのだよ。";
			next;
			mes "[ポー]";
			mes "それでは戦闘訓練を頼むよ。";
			mes "詳しくは執事に聞いてくれ。";
			setquest 5403; //state=1
			set EP16_SUB2,3;
			close2;
			cutin "richard_po02.BMP", 255;
			end;
		}
		mes "[ポー]";
		mes "……";
		mes "意外だな。";
		mes "大抵、";
		mes "このような考えをする私には";
		mes "嫌悪感を抱く者が多いのだが。";
		next;
		mes "[ポー]";
		mes "そういわれると悪い気はしない。";
		mes "フフフ、";
		mes "キミが気に入ったよ。";
		next;
		if(select("いえいえ","どれくらい気に入った？") == 1) {
			mes "[ポー]";
			mes "それでは戦闘訓練を頼むよ。";
			mes "詳しくは執事に聞いてくれ。";
			setquest 5403; //state=1
			set EP16_SUB2,3;
			close2;
			cutin "richard_po02.BMP", 255;
			end;
		}
		// 未調査
		close;
	case 3:
	case 4:
		mes "[ポー]";
		mes "訓練の進捗はどうだ？";
		mes "簡単そうに見えるものでも";
		mes "あまり油断しない方がいいぞ。";
		close2;
		cutin "richard_po02.BMP", 255;
		end;
	}
}
prt_cas.gat,218,182,3	script	王室守護騎士#01	751,{/* 60568 */
	mes "[王室守護騎士]";
	mes "こちらは魔王モロク討伐を祝う";
	mes "宴の会場となります。";
	mes "入場されますか？";
	next;
	if(select("入場する","入場しない") == 2) {
		mes "[王室守護騎士]";
		mes "承知いたしました。";
		mes "入場の際は、私にお声掛けください。";
		close;
	}
	mes "[王室守護騎士]";
	mes "それでは";
	mes "中へご案内いたします。";
	close2;
	warp "prt_cas.gat",93,212;
	end;
}
prt_cas.gat,97,216,2	script	侍従#vip_alimi	968,{/* 60569 */
	mes "[侍従]";
	mes "お楽しみいただけていますか？";
	mes "久しぶりの王室行事ですので";
	mes "はりきって準備をしました。";
	mes "お気に召すと良いのですが。";
	close;
OnTalk1:
	switch(Job) {
	case Job_ArchBishop:	unittalk "侍従 : 大いなる神の代理人" +strcharinfo(0)+ "様です。";	break;
	case Job_Guillotine:	unittalk "侍従 : 静かなる闇の支配者" +strcharinfo(0)+ "様です。";	break;
	default:		  		unittalk "侍従 : 揺るぎない信念のマスター" +strcharinfo(0)+ "様です。";	break;
	}
	end;
}
prt_cas.gat,93,214,0	script	#vip_alimi	139,1,1,{/* 60570 */
OnTouch:
	if(EP16_1QUE >= 1) {
		dopcevent "侍従#vip_alimi::OnTalk1";
	}
	end;
}
prt_cas.gat,161,168,5	script	王室守護騎士#02	751,{/* 60571 */
	mes "[守護騎士]";
	mes "プロンテラ城内を";
	mes "ご案内します。";
	next;
	switch(select("離宮","祝宴場","大丈夫です")) {
	case 1:
		mes "[守護騎士]";
		mes "すぐ西側に見える扉が";
		mes "離宮への出入り口です。";
		mes "ハイネン、ネリウス、バルター家と";
		mes "貴賓用の客室があります。";
		close;
	case 2:
		mes "[守護騎士]";
		mes "祝宴場はここから東の通路の先、";
		mes "中央にある大きな入口から";
		mes "ご入場いただけます。";
		close;
	case 3:
		mes "[守護騎士]";
		mes "なにかございましたら";
		mes "お声掛けください。";
		close;
	}
OnTalk1:
	unittalk "王室守護騎士 : その先は貴賓が滞在する離宮です。外部の方は出入りできません。";
	end;
OnTalk2:
	unittalk "王室守護騎士 : 招待を受けた方は、付き人の案内をお待ちください。";
	end;
}
prt_cas.gat,270,168,3	script	王室守護騎士#03	751,{/* 60572 */
	mes "[守護騎士]";
	mes "プロンテラ城内を";
	mes "ご案内します。";
	next;
	switch(select("離宮","祝宴場","大丈夫です")) {
	case 1:
		mes "[守護騎士]";
		mes "すぐ東側に見える扉が";
		mes "離宮への出入り口です。";
		mes "ウィグナー、レベンブルグ、";
		mes "ゲオルグ、リハルト家の";
		mes "客室があります。";
		mes "ゲオルグ家は現王家です。";
		close;
	case 2:
		mes "[守護騎士]";
		mes "祝宴場はここから西の通路の先、";
		mes "中央にある大きな入口から";
		mes "ご入場いただけます。";
		close;
	case 3:
		mes "[守護騎士]";
		mes "なにかございましたら";
		mes "お声掛けください。";
		close;
	}
OnTalk1:
	unittalk "王室守護騎士 : その先は貴賓が滞在する離宮です。外部の方は出入りできません。";
	end;
OnTalk2:
	unittalk "王室守護騎士 : 招待を受けた方は、付き人の案内をお待ちください。";
	end;
}

prt_pri00.gat,58,128,4	script	監視者テルケス#ep16	732,{/* 60574 */
	mes "[監視者テルケス]";
	mes "修行の邪魔です。";
	mes "よそへ行ってください。";
	close;
}

prt_pri00.gat,54,139,0	warp	prt_pri_to_prt_cas	1,1,prt_cas.gat,182,258	//60576
prt_cas.gat,188,258,0	script	prt_cas_to_prt_pri00	45,1,1,{/* 60577 */
OnTouch:
	if(EP16_1QUE < 2) {
		donpcevent "守護騎士#ep16_prigate01::OnTalk1";
		set '@dummy,sleep2(3000);
		warp "prt_cas.gat",182,258;
		end;
	}
	warp "prt_pri00.gat",54,134;
	end;
}
prt_cas.gat,180,264,3	script	守護騎士#ep16_prigate01	751,{/* 60578 */
	unittalk "守護騎士 : クルセイダーの執務室は廊下の最奥にあります。";
	end;
OnTalk1:
	unittalk "守護騎士 : この先には勝手に入らないでください。";
	end;
}
prt_cas.gat,180,251,3	script	守護騎士#ep16_prigate02	751,{/* 60579 */
	unittalk "守護騎士 : 勤務中、異常なし……";
	set '@dummy,sleep2(3000);
	unittalk "守護騎士 : ああ、早く交替時間になって……";
	end;
}
prt_cas.gat,91,237,3	script	エキナシア#ep16_etc01	803,{/* 60580 */
	if(ASH_5QUE < 31) {	// 魔王モロク追跡クエスト
		mes "[エキナシア]";
		mes "このような祝宴を";
		mes "設けてもらえるとは……";
		mes "異世界へ向かうと決めた時には";
		mes "予想しなかったことです。";
		next;
		mes "[エキナシア]";
		mes "とてもうれしいものですね。";
		close;
	}
	mes "[エキナシア]";
	mes "あなたも招待されていたのですね！";
	mes "お久しぶりです。";
	next;
	cutin "mocseal_rin01.bmp", 2;
	mes "[リーン]";
	mes "あら、まだ生きていたのね。";
	mes "こんな場所で会えるとは。";
	mes "そういえばキドも一緒に来てるわよ。";
	mes "どこかへ行ってるけど。";
	next;
	cutin "mocseal_rin01.bmp", 255;
	mes "[エキナシア]";
	mes "ギルドの人に会ったと言っていたので";
	mes "どこかで話しこんでるのでは";
	mes "ないでしょうか。";
	next;
	cutin "mocseal_rin01.bmp", 2;
	mes "[リーン]";
	mes "そういえば。";
	mes "知り合いっぽい人に誘われて";
	mes "食堂に行くって言ってたわ。";
	mes strcharinfo(0)+ "も";
	mes "挨拶しに行ってあげてね。";
	next;
	cutin "mocseal_rin01.bmp", 255;
	mes "[エキナシア]";
	mes "そうですね。";
	mes "久しぶりですし、";
	mes "会ってみたらいいですね。";
	mes "懐かしい仲間と祝宴を楽しみましょう。";
	close;
}
prt_cas.gat,89,238,5	script	リーン#ep16_etc02	885,{/* 60581 */
	if(ASH_5QUE < 31) {	// 魔王モロク追跡クエスト
		cutin "mocseal_rin01.bmp", 2;
		mes "[リーン]";
		mes "なるほど、裕福な人間は";
		mes "こうやって遊ぶのね。";
		mes "せっかくだから、";
		mes "綺麗なドレスでも";
		mes "見て楽しもうかしら。";
		close2;
		cutin "mocseal_rin01.bmp", 255;
		end;
	}
	cutin "mocseal_rin01.bmp", 2;
	mes "[リーン]";
	mes "なるほど、裕福な人間は";
	mes "こうやって遊ぶのね。";
	mes "あら、" +strcharinfo(0);
	mes "せっかくの機会だもの。";
	mes "楽しみましょう。";
	close2;
	cutin "mocseal_rin01.bmp", 255;
	end;
}
prt_cas.gat,367,123,7	script	キド#ep16_etc04	884,{/* 60582 */
	if(ASH_5QUE < 31) {	// 魔王モロク追跡クエスト
		mes "[キド]";
		mes "リーンも、エキナシアも";
		mes "一体どこに行ってしまったんだ。";
		mes "二人とも豪華な宴で";
		mes "浮かれすぎだろう。";
		cutin "mocseal_kid01.bmp", 2;
		next;
		mes "[キド]";
		mes "まったく";
		mes "ここは豪華すぎて";
		mes "俺には釣り合わない場所だ。";
		mes "　";
		mes "まあ、たまには良いが。";
		close2;
		cutin "mocseal_kid01.bmp", 255;
		end;
	}
	mes "[キド]";
	mes "久しぶりだな。";
	mes "もうリーンとエキナシアには会ったか？";
	cutin "mocseal_kid01.bmp", 2;
	next;
	mes "[キド]";
	mes "二人とも豪華な宴で";
	mes "ずいぶん";
	mes "浮かれていただろう？";
	next;
	mes "[キド]";
	mes "……ここは豪華すぎて";
	mes "俺には釣り合わない。";
	mes "　";
	mes "まあ、たまになら良いが。";
	close2;
	cutin "mocseal_kid01.bmp", 255;
	end;
}
prt_cas.gat,215,146,0	script	#ep16_evt_01_on	139,1,1,{/* 60583 */
	if(EP16_1QUE == 1) {
		cloakoffnpc "侍従ベル#ep16_01";	//60584
		dopcevent "侍従ベル#ep16_01::OnTalk1";
	}
	end;
}

prt_cas.gat,217,150,3	script	侍従ベル#ep16_01	967,{/* 60584 (cloaking)*/
	if(EP16_1QUE == 1) {
		mes "[侍従ベル]";
		mes strcharinfo(0)+ "様";
		mes "お待ちしておりました。";
		mes "無事、祝宴の招待状を";
		mes "お届けできたようですね。";
		next;
		mes "[侍従ベル]";
		mes "ここでの生活に不便がないよう";
		mes "お世話させていただきます。";
		mes "ベル・トワイライトと申します。";
		mes "どうぞ、ベルとお呼びください。";
		next;
		mes "[侍従ベル]";
		mes strcharinfo(0)+ "様は";
		mes "特別な貴賓として";
		mes "招待されておりますので、";
		mes "お部屋の用意がございます。";
		next;
		mes "[侍従ベル]";
		mes "まっすぐ進んでいただいて";
		mes "廊下の十字路を、";
		mes "^4d4dff左に^000000進んでください。";
		next;
		mes "[侍従ベル]";
		mes "私は、先に行って";
		mes "入室の準備をさせていただきますので、";
		mes "ゆっくりとお越しください。";
		close2;
		cloakonnpc "侍従ベル#ep16_01";
	}
	end;
OnTalk1:
	unittalk "侍従ベル : お待ちしていました。" +strcharinfo(0)+ " 様。";
	end;
OnInit:
	cloakonnpc "侍従ベル#ep16_01";
	end;
}
prt_cas.gat,163,163,0	script	#ep16_evt_02_on	139,3,3,{/* 60585 */
	if(EP16_1QUE == 1) {
		cloakoffnpc "侍従ベル#ep16_02";	//60586
		dopcevent "侍従ベル#ep16_02::OnTalk1";
	}
	end;
}
prt_cas.gat,155,165,4	script	侍従ベル#ep16_02	967,{/* 60586 (cloaking)*/
	if(EP16_1QUE == 1) {
		mes "[侍従ベル]";
		mes "貴賓用の客室は";
		mes "こちらに用意されています。";
		mes "入ってすぐに見える";
		mes "^4d4dff一番最初の部屋^000000です。";
		next;
		mes "[侍従ベル]";
		mes "特別な貴賓の説明については";
		mes "ご入室された後に";
		mes "説明させていただきますので";
		mes "こちらまでお越しください。";
		close2;
		cloakonnpc "侍従ベル#ep16_02";
	}
	end;
OnTalk1:
	unittalk "侍従ベル : こちらです。左側の廊下を進んでください。" +strcharinfo(0)+ "様。";
	end;
}
prt_cas_q.gat,146,8,0	script	#ep16_evt_03_on	139,1,1,{/* 60587 */
	if(EP16_1QUE == 1) {
		cloakoffnpc "侍従ベル#ep16_03";	//60588
		dopcevent "侍従ベル#ep16_03::OnTalk1";
	}
	end;
}
prt_cas_q.gat,135,10,4	script	侍従ベル#ep16_03	967,{/* 60588 (cloaking)*/
	if(EP16_1QUE == 1) {
		mes "[侍従ベル]";
		mes "詳しい内容につきましては";
		mes "ご入室後に";
		mes "説明させていただきます。";
		mes "どうぞ、お入りください。";
		close2;
		cloakonnpc "侍従ベル#ep16_03";
	}
	end;
OnTalk1:
	unittalk "侍従ベル : こちらのお部屋になります。" +strcharinfo(0)+ "様。";
	end;
}
prt_cas_q.gat,26,30,3	script	侍従ベル#ep16_main	967,{/* 60589 */
	switch(EP16_1QUE) {
	case 1:
		if(countitem(6933) > 0)
			delitem 6933, 1;
		mes "[侍従ベル]";
		mes "ご足労いただきまして";
		mes "ありがとうございます。";
		mes "貴賓でいらっしゃる";
		mes strcharinfo(0)+ "様には";
		mes "特別に離宮の部屋を";
		mes "割り当てられています。";
		next;
		mes "[侍従ベル]";
		mes "日程につきましては、";
		mes "私がご案内しますので、";
		mes "確認の際には";
		mes "お申し付けください。";
		next;
		if(select("貴賓について聞く","よろしくお願いします") == 2) {
			mes "[侍従ベル]";
			mes "ありがとうございます。";
			mes strcharinfo(0)+ "様には";
			mes "心地よい滞在になられますよう";
			mes "尽力させていただきます。";
			next;
			mes "[侍従ベル]";
			mes "それでは、さっそく";
			mes "特別な貴賓の意味について";
			mes "説明させていただきます。";
			next;
		}
		mes "[侍従ベル]";
		mes "現在、王城で開催している";
		mes "魔王モロク討伐の祝宴は、";
		mes "アッシュバキュームへの";
		mes "遠征隊帰還を祝い、";
		mes "労うためのものですが……";
		next;
		mes "[侍従ベル]";
		mes "同時に、とても重要な";
		mes "王位継承者決定のための";
		mes "席でもあるのです。";
		next;
		mes "[侍従ベル]";
		mes "各王家から排出された";
		mes "王位継承権を持った殿下たちが";
		mes "評価を受けて、";
		mes "この祝宴の最中に";
		mes "^FF0000次の王位継承者が決定^000000";
		mes "となる予定です。";
		next;
		mes "[侍従ベル]";
		mes "そして、正式な戴冠式が行われる前に";
		mes "執行される王家だけの儀式を";
		mes "通過すれば、";
		mes "ルーンミッドガッツ王国は";
		mes "新しい国王陛下を";
		mes "迎えることになるでしょう。";
		next;
		switch(select("それと自分になんの関係が？","王家だけで執行される儀式とは")) {
		case 1:
			mes "[侍従ベル]";
			mes strcharinfo(0)+ "様は";
			mes "その、王家だけで執行される、";
			mes "次期王位継承者が";
			mes "この地に住む者に認められるために";
			mes "必要な儀式への";
			mes "立会人として招待されたのです。";
			break;
		case 2:
			mes "[侍従ベル]";
			mes "七王家の限りない栄光のために、";
			mes "そして、次期国王に選定された者が";
			mes "この地の民に";
			mes "認められるために行う";
			mes "王室だけの秘密の儀式です。";
			next;
			mes "[侍従ベル]";
			mes  strcharinfo(0)+ "様は";
			mes "その儀式の立会人として";
			mes "招待されたのです。";
			break;
		}
		next;
		mes "[侍従ベル]";
		mes "儀式の立会人は、";
		mes "各ギルドで推薦された有能な人物、";
		mes "または異世界遠征で";
		mes "輝かしい功績を立てた英雄に";
		mes "その資格を与えることにしたそうです。";
		next;
		if(checkquest(201730)) {	// 魔神殿攻略済み
			mes "[侍従ベル]";
			mes "あなたは";
			mes "魔王モロクを討伐された英雄ですから";
			mes "選ばれないほうが";
			mes "間違っているでしょうね。";
		}
		else {
			mes "[侍従ベル]";
			mes "そしてその結果、";
			mes strcharinfo(0)+ "様が";
			mes "選定されたのです。";
		}
		next;
		menu "儀式はいつ行われるんですか？",-;
		mes "[侍従ベル]";
		mes "私が今、知る限りでは";
		mes "既に継承者決定の";
		mes "最終段階のようです。";
		next;
		mes "[侍従ベル]";
		mes "先の王様が病により退位されて、";
		mes "国も、王宮も、かなり";
		mes "混乱していましたが……";
		mes "幸いにしてルーンミッドガッツ王国は";
		mes "七王家が支えている場所。";
		next;
		mes "[侍従ベル]";
		mes "もう新しい国王陛下を迎える時です。";
		next;
		mes "[侍従ベル]";
		mes "それと、立会人として";
		mes "招待されておりますので、";
		mes "祝宴に参加する前に、";
		mes "各家門を訪問して";
		mes "挨拶をしていただく必要がございます。";
		next;
		mes "[侍従ベル]";
		mes "この離宮は、各家門が";
		mes "首都プロンテラに宿泊される際に";
		mes "ご利用になる場所。";
		mes "現在、この部屋を除くと";
		mes "全て他の家門の方が滞在されています。";
		next;
		mes "[侍従ベル]";
		mes "つい先ほど、各家門に";
		mes strcharinfo(0)+ "様が";
		mes "到着されたことを伝えましたので、";
		mes "まずは^4d4dffここから近い";
		mes "ハイネン家から訪問^000000されては";
		mes "いかがでしょうか？";
		next;
		mes "[侍従ベル]";
		mes "離宮内の案内をさせていただきますと、";
		mes "この部屋があるのは^0000FF西の離宮^000000。";
		mes "ハイネン家、ネリウス家、";
		mes "バルター家の者の部屋がございます。";
		next;
		mes "[侍従ベル]";
		mes "廊下を出て、向かいになるのが";
		mes "^0000FF東の離宮^000000です。";
		mes "ウィグナー家、リハルト家、";
		mes "ゲオルグ家、レベンブルグ家の";
		mes "お部屋がございます。";
		next;
		mes "[侍従ベル]";
		mes "各家門の方たちへの";
		mes "挨拶を決してお忘れなく。";
		delquest 7681;
		setquest 7682;
		setquest 7683;
		setquest 73051;
		setquest 73052;
		setquest 73053;
		setquest 73054;
		setquest 73055;
		setquest 73056;
		set EP16_1QUE,2;
		close;
	case 2:
		mes "[侍従ベル]";
		mes "つい先ほど、各家門に";
		mes strcharinfo(0)+ "様が";
		mes "到着されたと";
		mes "連絡を入れています。";
		next;
		mes "[侍従ベル]";
		mes "皆様、お待ちになってますので";
		mes "お早めにご挨拶に向かってください。";
		next;
		mes "[侍従ベル]";
		mes "まだ訪問していない家門は……";
		next;
		mes "[侍従ベル]";
		if(checkquest(73051))
			mes "ハイネン家";
		if(checkquest(73052))
			mes "ネリウス家";
		if(checkquest(73053))
			mes "リハルト家";
		if(checkquest(73054))
			mes "バルター家";
		if(checkquest(73055))
			mes "ウィグナー家";
		if(checkquest(73056))
			mes "レベンブルグ家";
		mes "ゲオルグ家です。";
		close;
	}
}
prt_cas_q.gat,28,28,3	script	マジシャン・ニルレム#ep	735,{/* 60590 (cloaking)*/}
prt_cas.gat,197,164,0	script	#ep16_evt_7688	139,{/* 60591 */}
prt_cas.gat,197,155,6	script	怪しいお客#ep16_01	865,{/* 60592 (cloaking)*/}
prt_cas.gat,199,154,2	script	侍従#ep16_01	47,{/* 60593 (cloaking)*/}
prt_cas.gat,106,240,3	script	スピーカ・ネリウス#ep16	10115,{/* 60594 */
	unittalk "スピーカ : ……失礼。";
	end;
}
prt_cas.gat,104,240,5	script	スキア・ネリウス#ep16_0	10116,{/* 60595 */
	unittalk "スキア : ……";
	end;
}
prt_cas.gat,108,240,3	script	クルックス#ep16_02	10118,{/* 60596 */
	cutin "ep16_crux_findel01.bmp", 2;
	mes "[クルックス]";
	mes "私の事はお気になさらず。";
	mes "ただの護衛です。";
	close2;
	cutin "ep16_crux_findel03.bmp", 255;
	end;
}
prt_cas.gat,107,237,2	script	ニーヒル・ハイネン#ep16	10114,{/* 60597 (cloaking)*/}
prt_cas.gat,103,235,7	script	ビオルレター・ハイネン#	959,{/* 60598 (cloaking)*/}
prt_cas.gat,108,235,2	script	王宮侍従#ep16_02	80,{/* 60599 (cloaking)*/}
prt_cas.gat,197,164,0	script	#ep16_evt_7689	139,{/* 60600 */}
prt_cas.gat,202,163,3	script	スキア・ネリウス#ep16_7	10116,{/* 60601 (cloaking)*/}
prt_cas.gat,31,116,0	script	#ep16_evt_7690	139,{/* 60602 */}
prt_cas.gat,31,116,3	script	ニーヒル・ハイネン#ep16	10114,{/* 60603 (cloaking)*/}
prt_cas.gat,29,117,5	script	スキア・ネリウス#ep16_7	10116,{/* 60604 (cloaking)*/}

prt_cas_q.gat,19,85,0	script	#ep16_heine_evt01	139,{/* 60632 */}
prt_cas_q.gat,22,77,0	script	#ep16_heine_evt02	139,{/* 60633 */}
prt_cas_q.gat,19,85,4	script	クロネカー・ハイネン#ep	10119,{/* 60634 */
	cutin "ep16_kronecker_granz_heine.bmp", 2;
	mes "[クロネカー]";
	mes "君の訪問は許可していない。";
	mes "速やかに下がりなさい。";
	close2;
	cutin "ep16_kronecker_granz_heine.bmp", 255;
	end;
}
prt_cas_q.gat,21,83,3	script	フリードリヒ・ハイネン#	10120,{/* 60635 */
	cutin "ep16_friedrich_stolz_heine.bmp", 1;
	mes "[フリードリヒ]";
	mes "許可もなく出入りするとは。";
	mes "すぐに出て行きなさい。";
	close2;
	cutin "ep16_friedrich_stolz_heine.bmp", 255;
	end;
}
prt_cas_q.gat,22,80,3	script	ニーヒル・ハイネン#ep16	10114,{/* 60636 (cloaking)*/}
prt_cas_q.gat,18,83,5	script	ピーター・ハイネン#ep16	987,{/* 60637 (cloaking)*/
	cutin "ep16_petter_heine01.bmp", 1;
	mes "[ピーター]";
	mes "祝宴に招待された英雄の方ですね。";
	mes "貴方達のための祝宴なのですから";
	mes "楽しんで下さい。";
	close2;
	cutin "ep16_petter_heine01.bmp", 255;
	end;
OnInsight:
	switch(EP16_1QUE) {
	case 1:
		cloakoffnpc;
		end;
	}
	end;
}
prt_cas_q.gat,9,90,3	script	ピーター・ハイネン#ep16	10117,{/* 60638 (cloaking)*/
OnInsight:
	switch(EP16_1QUE) {
	case 1:
		cloakonnpc;
		end;
	}
	end;
}
prt_cas_q.gat,142,38,0	script	#ep16_evt_7686	139,{/* 60639 */}
prt_cas_q.gat,141,39,5	script	スキア#ep16_7686	10116,{/* 60640 (cloaking)*/}
prt_cas_q.gat,144,38,3	script	ニーヒル#ep16_7686	10114,{/* 60641 (cloaking)*/}
prt_cas_q.gat,19,136,0	script	#ep16_evt_neriusroom	139,{/* 60642 */}
prt_cas_q.gat,20,139,3	script	スピーカ・ネリウス#ep16	10115,{/* 60643 */
	cutin "ep16_spica_nerius01.bmp", 1;
	mes "[スピーカ]";
	mes "祝宴に招待された方ですか？";
	mes "ここは祝宴場ではありませんよ。";
	close2;
	cutin "ep16_spica_nerius01.bmp", 255;
	end;
}
prt_cas_q.gat,18,136,5	script	スキア・ネリウス#ep16_r	10116,{/* 60644 */
	cutin "ep16_skia_nerius03.bmp", 0;
	mes "[スキア]";
	mes "こんにちは！";
	mes "お会い出来て光栄です！";
	close2;
	cutin "ep16_skia_nerius03.bmp", 255;
	end;
}
prt_cas_q.gat,21,140,3	script	護衛騎士クルックス#ep16	10118,{/* 60645 */
	cutin "ep16_crux_findel01.bmp", 1;
	mes "[クルックス]";
	mes "私の事はお気になさらず。";
	close2;
	cutin "ep16_crux_findel01.bmp", 255;
	end;
}
prt_cas_q.gat,18,136,5	script	スピーカ・ネリウス#ep16	10115,{/* 60646 (cloaking)*/}
prt_cas_q.gat,23,133,2	script	ニーヒル・ハイネン#ep16	10114,{/* 60647 (cloaking)*/}
prt_cas.gat,321,25,1	script	エリヒ・ネリウス#ep16_e	881,{/* 60648 */
	mes "[エリヒ]";
	mes "祝宴を開いてるだけあって、";
	mes "随分とにぎやかだね。";
	mes "でも、ここは図書館だから";
	mes "静かにしてくれるかな？";
	close;
}
prt_cas_q.gat,20,184,3	script	イアン・バルター#ep16wa	55,{/* 60649 */
	mes "[イアン]";
	mes "ここにどうやって";
	mes "入って来た？";
	mes "人を呼んで追い出す前に、";
	mes "出て行くがいい！";
	close;
}
prt_cas_q.gat,23,187,3	script	怪しい人#ep16wal	86,{/* 60650 (cloaking)*/}
prt_cas_q.gat,14,184,5	script	アイゼン・アノ#ep16wal	983,{/* 60651 */
	mes "[アイゼン・アノ]";
	mes "冒険者様ですね。";
	mes "こんな場所まで";
	mes "訪ねてくださるとは……";
	next;
	mes "[アイゼン・アノ]";
	mes "私たちの家門を";
	mes "代表する方はあちらにいます。";
	mes "ご挨拶されるなら、";
	mes "当主であるイアン様からどうぞ。";
	close;
}
prt_pri00.gat,57,119,1	script	ビッグフットマン#ep16wa	54,{/* 60652 */
	mes "[ビッグフットマン]";
	mes "揚げた鳥、焼いたジャガイモ……";
	mes "新鮮なチーズ……";
	mes "はあ……こんな所に";
	mes "閉じ込められていると";
	mes "普通の食べ物が食べたくなるんだなあ。";
	next;
	mes "[ビッグフットマン]";
	mes "今、俺の口までこれらの";
	mes "食べ物を運んでくれる";
	mes "美女が居たら……";
	mes "今すぐにでも結婚するのに。";
	next;
	emotion 23;	//60652
	mes "[ビッグフットマン]";
	mes "うわ!?";
	mes "あれまた現れた!!!!";
	mes "怖い!!!!";
	mes "だけど俺がここに捕まっている間は";
	mes "安全だよな……";
	close;
}

prt_cas_q.gat,82,21,1	script	ルヴィエル・ウィグナー#	10132,{/* 60654 */
	switch(EP16_SUB1) {
	case 0:
		mes "[ルヴィエル]";
		mes "ようこそ、冒険者様。";
		mes "私はウィグナー家の";
		mes "^0000cdルヴィエル・ウィグナー^000000と申します。";
		next;
		menu "ご挨拶に伺いました",-;
		mes "[ルヴィエル]";
		mes "おお、これはこれは。";
		mes "ご挨拶いただけるとは光栄です。";
		next;
		mes "[ルヴィエル]";
		mes "今回の宴は祝いの意味もありますが";
		mes "王位継承の話も進行するようで。";
		mes "いや、ははは。";
		mes "冒険者様はすでにご存じでしょうな。";
		next;
		mes "[ルヴィエル]";
		mes "私の家門でも";
		mes "王位継承権を持つ候補がおりますので";
		mes "ぜひ、お会いになってください。";
		next;
		mes "[ルヴィエル]";
		mes "そしてこちらは我が妻";
		mes "^0000cdカタリナ・ウィグナー^000000です。";
		next;
		mes "[カタリナ]";
		mes "ごきげんよう。";
		mes "ウィグナー家にようこそ。";
		next;
		mes "[カタリナ]";
		mes "冒険者様の便宜を図るよう";
		mes "私たちは最大の支援をいたしますわ。";
		mes "どうぞごゆるりと";
		mes "旅の疲れを癒してくださいまし。";
		next;
		mes "[カタリナ]";
		mes "もしお時間が許されるなら";
		mes "今度はウィグナーの本家にも";
		mes "ご訪問くださいませ。";
		mes "いつでも冒険者様を歓迎しますわ。";
		next;
		mes "[カタリナ]";
		mes "……ところで、あなた？";
		mes "^0000cdユルゲン^000000はどこに行ったのかしら。";
		next;
		cloakoffnpc "ユルゲン・ウィグナー#ep"; //61960
		cloakonnpc "ユルゲン・ウィグナー#ep"; //61961
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "お呼びですか？";
		next;
		cutin "16jur_nor.bmp", 255;
		mes "[ルヴィエル]";
		mes "ユルゲン。ちょうどよいところに。";
		mes "冒険者様、";
		mes "我が^0000cdウィグナー家の後継者^000000にして";
		mes "^0000cd王位継承候補^000000のユルゲンです。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "紹介にあずかりました";
		mes "^0000cdユルゲン・ウィグナー^000000と申します。";
		mes "お会いできて光栄です。";
		next;
		mes "[ユルゲン]";
		mes "冒険者様、どうぞおくつろぎください。";
		mes "必要なものがあれば";
		mes "いつでもおっしゃってくださいね。";
		next;
		menu "ありがとうございます",-;
		mes "[ユルゲン]";
		mes "それでは私は失礼します。";
		next;
		cloakonnpc "ユルゲン・ウィグナー#ep"; //61960
		cloakoffnpc "ユルゲン・ウィグナー#ep"; //61961
		cutin "16jur_nor.bmp", 255;
		mes "[ルヴィエル]";
		mes "なんだ。もう行ってしまうのか。";
		next;
		mes "[ルヴィエル]";
		mes "……ふぅ、";
		mes "まったく社交性が無きに等しい。";
		mes "これから後継者として";
		mes "人に接することも多くなるだろうに。";
		mes "どうか息子の無礼をお許しください。";
		next;
		mes "[ルヴィエル]";
		mes "もしよろしければ";
		mes "ウィグナー家の他の子供たちにも";
		mes "お会いになってください。";
		mes "モロクを打ち倒した英雄が";
		mes "祝宴に参加すると聞いて";
		mes "みな楽しみにしております。";
		next;
		mes "[ルヴィエル]";
		mes "では、どうぞごゆっくりと";
		mes "おくつろぎください。";
		next;
		chgquest 73054,73075;
		setquest 14475; //state=1
		compquest 14475;
		set EP16_SUB1,1;
		mes "‐^0000cdウィグナー家との挨拶を済ました。^000000";
		mes "　他の王家にも挨拶に行こう‐";
		next;
		mes "‐その時、ユルゲンが";
		mes "　話しかけてきた‐";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "挨拶回り中、失礼します。";
		mes "もし時間があれば";
		mes "もう少しお話しません？";
		mes "よければ私に話しかけてくださいね。";
		close2;
		cutin "16jur_nor.bmp", 255;
		end;
	case 1:
		mes "[ルヴィエル]";
		mes "冒険者様、ウィグナー家にようこそ。";
		next;
		mes "[ルヴィエル]";
		mes "もしよろしければ";
		mes "ウィグナー家の子供たちにも";
		mes "お会いになってください。";
		mes "冒険者様のお話を聞ければ";
		mes "さぞ喜ぶでしょう。";
		close;
	case 2:
		mes "[ルヴィエル]";
		mes "子供たちには";
		mes "お会いになりましたか？";
		mes "もしよろしければ";
		mes "ティータイムでもいかがですか？";
		next;
		mes "[ルヴィエル]";
		mes "私たち夫婦は";
		mes "冒険者様の話を聞ける事が";
		mes "とても嬉しいのです。";
		mes "経験談はお金で買えるものでは";
		mes "ありませんから。";
		next;
		mes "[カタリナ]";
		mes "そうそう。";
		mes "子供達に失礼はありませんでしたか？";
		mes "わがままを許してしまってきたので";
		mes "とても心配です。";
		next;
		mes "[カタリナ]";
		mes "最近は注意するようにしているのですが";
		mes "もし冒険者様に失礼な事を";
		mes "行なったようであれば";
		mes "代わりにお詫びいたします。";
		next;
		menu "大丈夫です",-;
		mes "[カタリナ]";
		mes "そうですか？";
		mes "それなら良いのですけれど……";
		mes "私たちが子供達のわがままを";
		mes "許しすぎた気がします。";
		next;
		mes "[カタリナ]";
		mes "前回の王位継承会議では";
		mes "準備も無く参加して";
		mes "恥を晒しましたし……";
		next;
		mes "[ルヴィエル]";
		mes "王位に就く事自体は";
		mes "それほど重要ではないよ。";
		mes "資質のあるものは";
		mes "なるべくして王になる。";
		mes "そんな事でユルゲンに";
		mes "ストレスを与えたくはない。";
		next;
		mes "[カタリナ]";
		mes "あなたは欲がなさすぎます。";
		mes "ウィグナー家から";
		mes "王が輩出されるとしたら";
		mes "どんなに光栄でしょう。";
		mes "七王家の中でも一際、";
		mes "格があがるというものですよ。";
		next;
		mes "[ルヴィエル]";
		mes "はんっ！";
		mes "そんなものただ面倒なだけだ。";
		mes "それに忘れたのか？";
		mes "いつか話した事があっただろう。";
		next;
		mes "[ルヴィエル]";
		mes "たとえ王になったところで";
		mes "利益を得ようと集まる";
		mes "ハエが増えるだけだ。";
		next;
		mes "[ルヴィエル]";
		mes "それに、王になるために";
		mes "どれだけの財産が必要か。";
		mes "以前、ウィグナー家が";
		mes "傾きかけた事もある。";
		next;
		mes "[カタリナ]";
		mes "あら。";
		mes "その反対になる可能性も";
		mes "あるじゃないですか。";
		mes "ウィグナー家の立場が";
		mes "確固たるものになるのでは？";
		next;
		mes "[カタリナ]";
		mes "今はユルゲンを支える";
		mes "カトリンとアイザックもいます。";
		next;
		mes "[ルヴィエル]";
		mes "ふふっ……アイザックか。";
		mes "そうだな。";
		mes "いや、我が子ながら頼もしい限りだ。";
		next;
		menu "アイザック様を信頼しているんですね",-;
		mes "[ルヴィエル]";
		mes "ああ、冒険者様、申し訳ありません。";
		mes "話がそれました。";
		next;
		menu "いいえ、お構いなく",-;
		mes "[ルヴィエル]";
		mes "話が出たついでですが、";
		mes "アイザックはどうでしたか。";
		mes "我が子達の中で";
		mes "もっともウィグナー家らしい子です。";
		next;
		mes "[ルヴィエル]";
		mes "ユルゲンはルックスに興味がありすぎて";
		mes "王位や財産に関心が無くて……";
		mes "もしもカトリンが男に生まれていたら";
		mes "全てを引き継がせても";
		mes "安心だったのですが……";
		next;
		mes "[ルヴィエル]";
		mes "そんな折、わがままだったアイザックが";
		mes "ウィグナー家に相応しい人物として";
		mes "育ってくれたので一安心しました。";
		next;
		mes "[ルヴィエル]";
		mes "ああ、もちろん他の子供達が";
		mes "相応しくないわけでは無いですよ。";
		next;
		menu "意味はわかります",-;
		mes "[カタリナ]";
		mes "子供達の前ではこの話は";
		mes "しないでくださいね。";
		mes "露骨に比較されるのは";
		mes "気持ちの良いものでは";
		mes "ないでしょうから……";
		next;
		mes "[ルヴィエル]";
		mes "何を言うか。";
		mes "ウィグナー家の人間であれば";
		mes "嫌な言葉も聞かなければならない。";
		mes "言葉を判断するのは自分自身だ。";
		mes "嫌な話を聞く事で";
		mes "学べる事もある。";
		next;
		mes "[カタリナ]";
		mes "いいえ、それでも子供達の前で";
		mes "そんな事は言わないでください。";
		next;
		mes "[ルヴィエル]";
		mes "私が子供達の前で";
		mes "そんな事を言った事があるか？";
		next;
		mes "[カタリナ]";
		mes "それは……";
		next;
		mes "[カタリナ]";
		mes "ところで最近、";
		mes "アイザックがどこかで何かを";
		mes "しているようなんですけど";
		mes "ご存知ですか？";
		next;
		mes "[ルヴィエル]";
		mes "レベンブルグ家の次男と";
		mes "事業を起こしているらしいな。";
		mes "まぁ、アイザックなら";
		mes "大丈夫であろう。";
		next;
		mes "[カトリン]";
		mes "キャーー!!";
		next;
		emotion 23, "ルヴィエル・ウィグナー#"; //61958
		mes "[ルヴィエル]";
		mes "^0000cdカトリン?!^000000";
		next;
		emotion 23, "カタリナ・ウィグナー#ep"; //61959
		mes "[カタリナ]";
		mes "^0000cdカトリン!!^000000";
		mes "いったい何があったのでしょう！";
		next;
		menu "お二人はここに！　状況を見てきます",-;
		mes "‐カトリンに何があったのだろうか!?";
		mes "　様子を見にいってみよう‐";
		cloakonnpc "アイザック・ウィグナー#"; //60710
		chgquest 14476,14477; //state=1
		set EP16_SUB1,3;
		close;
	case 3:
		mes "[ルヴィエル]";
		mes "カトリンは大丈夫だろうか？";
		mes "やはり行ってみるべきか。";
		next;
		mes "‐カトリンに何があったのだろうか!?";
		mes "　様子を見にいってみよう‐";
		close;
	case 4:
	case 5:
		mes "[ルヴィエル]";
		mes "ああ、冒険者様。子供達に";
		mes "何が起きているのか";
		mes "聞いてみたのですが、";
		mes "教えてもらえませんでした。";
		next;
		mes "[カタリナ]";
		mes "何かご存知ないでしょうか……？";
		next;
		menu "今は言えませんが、安心してください",-;
		mes "[カタリナ]";
		mes "そうですか。";
		mes "子供達が黙っていろと……";
		mes "冒険者様は";
		mes "事情を知っているようですね。";
		mes "子供たちの事、";
		mes "何卒よろしくお願いします。";
		close;
	case 6:	//?
	case 7:	//?
	case 8:	//?
	case 9:
		mes "[ルヴィエル]";
		mes "子供達の事、";
		mes "どうかよろしくお願いします。";
		close;
	}
}
prt_cas_q.gat,82,23,0	script	カタリナ・ウィグナー#ep	71,{/* 60655 */
	switch(EP16_SUB1) {
	case 0:
		mes "[カタリナ]";
		mes "ようこそ、冒険者様。";
		mes "歓迎いたします。";
		next;
		mes "[カタリナ]";
		mes "必要なものがあれば";
		mes "いつでもおっしゃってください。";
		mes "ウィグナー家の者として";
		mes "最善を尽くさせていただきます。";
		next;
		mes "[カタリナ]";
		mes "家門に関する話は";
		mes "ウィグナー家の主である";
		mes "ルヴィエル・ウィグナーと";
		mes "お話なさってください。";
		close;
	case 1:
	case 2:
		mes "[カタリナ]";
		mes "子供達にはお会いいただけましたか？";
		mes "冒険者様との会話は";
		mes "貴重な経験になるでしょう。";
		mes "事実、大きな困難に";
		mes "ぶつかったことがない";
		mes "子供たちなので経験が足りません。";
		next;
		mes "[カタリナ]";
		mes "建国英雄の家門に嫁いで以来、";
		mes "家柄にふさわしい子供たちに";
		mes "育て上げるつもりでしたが……";
		next;
		mes "[カタリナ]";
		mes "夫が名誉や権力に欲が無い人でして。";
		mes "私としては少し心残りです。";
		next;
		mes "[カタリナ]";
		mes "ただ、子供たちが望むものは";
		mes "できる限り叶えたいと思っています。";
		mes "そのせいで少し礼に欠ける所があって";
		mes "心配になることも多いのですが……";
		next;
		mes "[カタリナ]";
		mes "ですので、ぜひ冒険者様の";
		mes "話を聞きたいです。";
		mes "多くの経験を積んだ方の";
		mes "話を聞くのが大きな楽しみです。";
		close;
	case 3:
		mes "[カタリナ]";
		mes "カトリンに何があったのでしょうか!?";
		mes "こうしてはおれません。";
		mes "やはり行ってみるべきかしら。";
		next;
		menu "ここで待っていてください",-;
		mes "[カタリナ]";
		mes "ああ……";
		mes "何事もなければ良いのですが。";
		close;
	case 4:
	case 5:
		mes "[ルヴィエル]";
		mes "ああ、冒険者様。";
		mes "子供達に何が起きているのか";
		mes "聞いてみたのですが、";
		mes "教えて貰えませんでした。";
		next;
		mes "[カタリナ]";
		mes "何かご存知ないでしょうか……？";
		next;
		menu "今は言えませんが、安心してください",-;
		mes "[カタリナ]";
		mes "そうですか。";
		mes "子供達が黙っていろと……";
		mes "冒険者様は";
		mes "事情を知っているようですね。";
		mes "子供達の事、";
		mes "何卒よろしくお願いします。";
		close;
	case 6:	//?
	case 7:	//?
	case 8:	//?
	case 9:
		mes "[カタリナ]";
		mes "子供達の事、";
		mes "何卒よろしくお願いします。";
		close;
	}
}
prt_cas_q.gat,80,23,5	script	ユルゲン・ウィグナー#ep	989,{/* 60656 (cloaking)*/}
prt_cas_q.gat,95,9,5	script	ユルゲン・ウィグナー#ep	989,{/* 60657 */
	switch(EP16_SUB1) {
	case 0:
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "私に会いに来る";
		mes "約束はありましたか？";
		mes "それでは外でお待ちください。";
		mes "先に来た方から順番に";
		mes "会う事になっておりますので。";
		mes "私は誰にでも公平なのですよ。";
		next;
		mes "[ユルゲン]";
		mes "もし私の両親に";
		mes "お会いになる約束でしたら";
		mes "あちらにおります。";
		mes "ところで扉の外には待っている人が";
		mes "どれほどいる事でしょう。";
		next;
		mes "[ユルゲン]";
		mes "今日も美しさで世界の平和を守ります。";
		mes "ああ、美しさは正義！";
		close2;
		cutin "16jur_nor.bmp", 255;
		end;
	case 1:
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "冒険者様、よかった。";
		mes "時間があるようですね。";
		mes "先ほどは失礼しました。";
		next;
		mes "[ユルゲン]";
		mes "個人的にはもう少し";
		mes "お話をしたかったのですが";
		mes "母様は少しでも作法を間違えると";
		mes "すぐに怒るのでちょっと……";
		next;
		mes "[ユルゲン]";
		mes "まあ、人前で怒鳴るとは思えませんが、";
		mes "それでも面倒事は避けたかったので。";
		mes "本当に失礼しました。";
		next;
		mes "[ユルゲン]";
		mes "冒険者様、話は変わりますが";
		mes "私の家族を紹介いたします。";
		mes "こちらの優雅なレディーは";
		mes "私の姉、^0000cdカトリン・ウィグナー^000000です。";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "こういう時は姉、ではなく";
		mes "ウィグナー家の長女と紹介する方が";
		mes "礼儀にかなうのよ。";
		next;
		mes "[カトリン]";
		mes "冒険者様、お初にお目にかかります。";
		mes "ウィグナー家へようこそ。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "そしてこちらは私の弟、";
		mes "^0000cdアイザック・ウィグナー^000000です。";
		next;
		mes "[ユルゲン]";
		mes "ウィグナー家の次男です。";
		mes "家業に関心がない私や姉と違い";
		mes "頭も手際も良いので";
		mes "いずれはウィグナー家を";
		mes "発展させる人物になるでしょう。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "これはどうも。";
		mes "アイザック・ウィグナーと申します。";
		mes "このつまらない家門にまで";
		mes "ご足労いただき光栄です。";
		mes "どうかお楽しみくださいますよう。";
		next;
		cutin "16kat_ang.bmp", 2;
		mes "[カトリン]";
		mes "アイザック！";
		mes "そのような言葉遣いは";
		mes "控えるように注意したはずよ。";
		mes "あなたを紹介したユルゲンにも失礼よ。";
		mes "ウィグナー家の名に泥を塗るつもり？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "冗談ですよ、";
		mes "ジョ・ウ・ダ・ン。";
		mes "姉さんは本当に堅苦しいな。";
		mes "冒険者様にも癒しが必要でしょう？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "お客様に失礼になる言葉は";
		mes "冗談ではないのよ。";
		mes "それは侮辱と言うの。";
		mes "冒険者様、弟の無礼、";
		mes "どうかをお許しください。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "どうでもいいけど……";
		mes "私は家に帰りたいね。";
		mes "ここは狭いし窮屈だ。";
		mes "せめて祝宴場にでも出向きたい。";
		next;
		mes "[ユルゲン]";
		mes "ああ、私に会いたがっている人が";
		mes "どんなに多いことか！";
		mes "私はこの美しい顔を";
		mes "みなに披露する義務があるんだ！";
		next;
		mes "[ユルゲン]";
		mes "この堅苦しくも暗い王宮に";
		mes "一筋の光をもたらすようにね！";
		mes "人々に楽しみを与える必要があるんだ。";
		next;
		cutin "16kat_ang.bmp", 2;
		mes "[カトリン]";
		mes "それは王位継承に対する侮辱よ。";
		mes "最善を尽くして臨みなさい。";
		mes "あなたが思っているほど";
		mes "軽々しいものではありません。";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "あなたは七大建国王家とともに";
		mes "王国を導く王位継承者の一人である";
		mes "自覚を忘れてはならないの。";
		next;
		mes "[カトリン]";
		mes "もう子供ではいられないの。";
		mes "その責任と義務の重さを";
		mes "軽んじないよう教えたはずよ。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "もちろん！";
		mes "よく解っているさ。";
		mes "だから今日も鏡の前で服装を正し、";
		mes "ヘアスタイルも完璧にしたのさ。";
		mes "私の心の中の緊張の糸が";
		mes "切れないようにね。";
		next;
		mes "[ユルゲン]";
		mes "自分を完璧にすることで";
		mes "大局を見る目も";
		mes "養われるんじゃないかな。";
		mes "そして私は完璧に準備ができている。";
		next;
		mes "[ユルゲン]";
		mes "ほら、今日の新しいマントは";
		mes "私の瞳の色によく似合う。";
		mes "きっと王宮の雰囲気も";
		mes "明るくしてくれるさ。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "……またはじまった。";
		mes "そろそろお暇させてもらうよ。";
		mes "冒険者様、それではまた。";
		next;
		cloakonnpc "アイザック・ウィグナー#";
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "……冒険者様、";
		mes "もしよろしければ";
		mes "^0000cd私たちの両親とティータイム^000000でも";
		mes "いかがですか？";
		next;
		mes "[カトリン]";
		mes "お二人とも冒険者様の話を聞くのを";
		mes "とても楽しみにされておりました。";
		chgquest 73075,14476; //state=1
		set EP16_SUB1,2;
		close2;
		cutin "16kat_nor.bmp", 255;
		end;
	case 2:
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "^0000cd父と母^000000はあちらにおります。";
		mes "冒険者様のお話を心待ちにしています。";
		mes "ところで扉の外に私を待っている人は";
		mes "どれくらいいますか？";
		next;
		mes "[ユルゲン]";
		mes "ああ、順番に会うので";
		mes "待たせてしまっています。";
		mes "美しさで世界の平和を守るのは";
		mes "辛いですね。";
		close2;
		cutin "16jur_nor.bmp", 255;
		end;
	case 3:
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お姉さんがなにかをなくしたようですが、";
		mes "ひどく慌てていて、";
		mes "詳しいことがわからないのです。";
		mes "冒険者様になら落ち着いて";
		mes "話すのではないでしょうか。";
		close2;
		cutin "16jur_sim.bmp", 255;
		end;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お姉さんが無くしたものが";
		mes "一体何なのかは";
		mes "わかりません。";
		next;
		mes "[ユルゲン]";
		mes "私を好きな人々に声をかけて";
		mes "探してもらえば、";
		mes "あーっ！";
		mes "という間に見つかるでしょう。";
		mes "しかし、それでは父が";
		mes "黙っていない理由があるのです。";
		next;
		mes "[ユルゲン]";
		mes "仕方ありません、";
		mes "冒険者様にお任せするのが";
		mes "最善かと思われます。";
		mes "冒険者様の手にかかってますよ！";
		close2;
		cutin "16jur_sim.bmp", 255;
		end;
	case 11:
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "冒険者様、どうでしたか？";
		mes "何か成果は？";
		next;
		menu "今までのことを報告する",-;
		mes "[ユルゲン]";
		mes "なるほど……";
		mes "箱を持っていった人は";
		mes "確認できていませんか。";
		mes "箱はいつのまにか消えていた、";
		mes "ということになりますね。";
		next;
		menu "実はカトリンに対して偏見がある人がいる",-;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "それは一体？";
		next;
		menu "カトリンの自作自演が疑われています",-;
		mes "[ユルゲン]";
		mes "……！";
		mes "はあ、普段からコミュニケーションを";
		mes "もっととったほうがいいと";
		mes "言っていたのですが……";
		mes "怠っていたようですね。";
		next;
		cutin "16kat_nor.bmp", 2;
		cloakoffnpc "カトリン・ウィグナー#ep"; //60714
		mes "[カトリン]";
		mes "なぜ私を知らない人への";
		mes "評判のためにそんな事を";
		mes "する必要があるのかしら？";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "姉さん!?";
		mes "一体いつから？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "つい今ほどね。";
		mes "でもあなたが話した内容を";
		mes "聞くくらい前から。";
		mes "で、人々からの悪い評判は";
		mes "私のせいだと？";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "ある程度はあるのでは？";
		mes "ほら、私を見てよ。";
		mes "私はいつでもどんな人にでも";
		mes "最善を尽くして接しているから";
		mes "みんな私が好きなんだ。";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "……人々があなたに好感を持つのが";
		mes "あなたの態度のおかげだと";
		mes "本気で思ってるの？";
		mes "呆れた……。";
		next;
		mes "[カトリン]";
		mes "本当に呆れた……。";
		next;
		mes "[カトリン]";
		mes "以前の王位継承の件で";
		mes "あなたの態度が問題になって";
		mes "家門にどれだけ迷惑をかけたのか";
		mes "もう忘れたのね。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "私のコミュニケーションに";
		mes "問題があるとでも？";
		mes "それじゃ一体どうして";
		mes "私が好かれるのさ？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "……そんな事も解らないのね。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "まさか私のルックスのおかげだと";
		mes "言いたいのかい？";
		next;
		cutin "16kat_ang.bmp", 2;
		mes "[カトリン]";
		mes "そうよ。";
		mes "幼い頃から何もしなくても……";
		mes "いいえ、問題を起こしても";
		mes "周囲の人々はあなたに対して";
		mes "妙に優しかった。";
		next;
		mes "[カトリン]";
		mes "みんな笑っていた。";
		mes "みんなウィグナー家の後継者、";
		mes "次期王位候補のあなたに";
		mes "気に入られるために。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "それが外見のおかげだと？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "それはあなたも否定できないでしょ。";
		mes "外見だって才能の一部だから。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "例えルックスのおかげだとしても";
		mes "私が望んでそうなったわけでは";
		mes "ないだろう？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "美しいルックスの弟と";
		mes "黙っていても比較され、";
		mes "きな臭い噂話が立つのは";
		mes "私が望んでいるとでも？";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "だからお姉さんも";
		mes "もう少し他の人と話を……";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "人から誤解を受けない";
		mes "一番良い方法は「沈黙」なの。";
		mes "言葉にしなければ失敗もしないわ。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "必ずしもそうとは言えないよ。";
		mes "例えば今日聞いた話だけど、";
		mes "お姉さんが沈黙した結果……";
		next;
		cutin "16kat_ang.bmp", 2;
		mes "[カトリン]";
		mes "私はもうベストを尽くしてるわよ!!";
		mes "知ってる？";
		mes "影は光があるから生まれるの。";
		mes "私だって頑張ってるの！";
		next;
		mes "[カトリン]";
		mes "でも結局人は上辺しか見ない！";
		mes "私は何をどうすればいいの？";
		next;
		menu "お二人とも、落ち着いてください",-;
		cloakoffnpc "アイザック・ウィグナー#"; //60716
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "二人とも揉めすぎ！";
		mes "何が起きてるのかは";
		mes "知った事じゃないけど";
		mes "落ち着きなよ。";
		mes "二人の声が廊下の端まで";
		mes "響いてるぜ？";
		next;
		mes "[アイザック]";
		mes "このままじゃ、家のイメージが";
		mes "悪くなっちゃうよ。";
		next;
		mes "[アイザック]";
		mes "この前兄さんが地の底まで";
		mes "落としてくれた評判を";
		mes "やっと少し回復できたところなんだ。";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "……";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "ところで^0000cdこの箱は姉さんの^000000だよね？";
		mes "人の出入りが多いところにあったから";
		mes "とりあえず持ってきたけど。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "これ、^0000cdお前が持っていたのか^0000cd？";
		next;
		cutin "16kat_ang.bmp", 2;
		mes "[カトリン]";
		mes "持ち出したならちゃんと話しなさいよ。";
		mes "アイザック！";
		mes "あなたのせいでどんなに";
		mes "困っていたと思っているの？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "えええ……";
		mes "姉さんのためと思って";
		mes "預かっていただけなのに……";
		next;
		mes "[アイザック]";
		mes "どんなに小さな物でも";
		mes "家で物が無くなれば……";
		mes "わかるよね、";
		mes "父が何とおっしゃるか。";
		next;
		mes "[アイザック]";
		mes "「たとえ小物一つでも";
		mes "まともに管理できない者は";
		mes "ウィグナー家に必要なし。";
		mes "管理能力こそ最大の美徳である」";
		mes "でしょう。";
		next;
		emotion 3, "ユルゲン・ウィグナー#ep"; //60713
		mes "[アイザック]";
		mes "うう……言っただけで";
		mes "頭が痛くなる。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "で、その中にはいったい";
		mes "何が入ってるの？";
		mes "あんな騒ぎまで起こして。";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "この中に金銭的な価値を";
		mes "持つような物は無いわ。";
		mes "でも……私にとっては";
		mes "宝石よりも価値がある物よ。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "これは……";
		mes "ノート……？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "日記？";
		next;
		emotion 3, "ユルゲン・ウィグナー#ep"; //60713
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "言葉は慎むほど良いの。";
		mes "こぼれた水は元に戻せないのと同じ。";
		mes "でも誰にだって";
		mes "正直になりたい瞬間はある。";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "私が「私」になれる瞬間。";
		mes "それがこの日記帳だった。";
		next;
		mes "[カトリン]";
		mes "沈黙でも人々の誤解が生まれるなら";
		mes "言葉を慎むのが必ずしも";
		mes "良い事ではなかったという事ね。";
		mes "私は日記帳も見つかったし";
		mes "もう失礼するわ。";
		mes "冒険者様、それでは失礼いたします。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お姉さん、あの……";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "もういいの。";
		mes "気にしないで。";
		next;
		cloakonnpc "カトリン・ウィグナー#ep"; //60714
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "話がまったく見えないんだけど。";
		mes "何があったの？";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お前が勝手にその箱を";
		mes "持ち出したから……";
		mes "はあ……とにかく、";
		mes "簡単に言うとお姉さん怒ってる。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "なんで姉さんが怒るのさ。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "話すと長くなるんだけど、";
		mes "お姉さんに関する悪い噂が";
		mes "出回っているらしいんだ。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "その噂なら聞いたことある。";
		mes "でもそれって兄さんが";
		mes "原因になっているから、";
		mes "そのうち兄さんが";
		mes "なんとかするだろうと";
		mes "思ってたけど……？";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "知っていたのか？";
		mes "なんで話してくれなかった？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "話したところで聞き流してただろう？";
		mes "天に授かった美しさを持つ兄さんは";
		mes "どうせ理解できないよ。";
		next;
		mes "[アイザック]";
		mes "おかげで周りのちやほやも";
		mes "当たり前だっただろう。";
		mes "両親も厳しかったわけではないしね。";
		mes "だから空気読めないんだよ。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お前……";
		mes "私を怒らせたいのか？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "まさか！";
		mes "いま話しているのは全て事実だよ。";
		mes "個人的な感情なんてないから";
		mes "最後まで聞いて欲しいんだ。";
		next;
		mes "[アイザック]";
		mes "兄さんは解らないだろうけど、";
		mes "その外見のおかげで";
		mes "知らないうちに私と姉さんは";
		mes "結構な被害にあったんだ。";
		next;
		mes "[アイザック]";
		mes "さっき姉さんが話してた";
		mes "影は光があるから";
		mes "生まれるってことだよ。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "よく解らないな。";
		mes "美しい外見が何故、";
		mes "被害を与えるんだ？";
		mes "みんな美しい物は好きだろう？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "見る人は、ね。";
		mes "でもその隣にいて";
		mes "常に比較される人にとっては違うのさ。";
		mes "特に姉さんはそのとばっちりを";
		mes "受けていたし。";
		next;
		mes "[アイザック]";
		mes "天使のような美しさを持つ人の隣に";
		mes "凡人が立っていると考えてみてよ。";
		mes "まったくもって普通なのに";
		mes "比較されるんだ。";
		next;
		mes "[アイザック]";
		mes "そして、隣にいる人物が";
		mes "美しければ美しいほど";
		mes "凡人は醜く見えてしまう。";
		mes "それが今までの私たちなんだ。";
		next;
		mes "[アイザック]";
		mes "姉さんが受けたストレスは";
		mes "特にひどかったろうね。";
		mes "どれだけ我慢し、慈しみの心で";
		mes "兄さんに接していたか。";
		mes "本当の天使は姉さんの方だよ。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "そんな……そのような……";
		mes "私はただ……";
		next;
		mes "[ユルゲン]";
		mes "どうすればいいんだ……";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "さあ？";
		mes "周囲の空気に気づけない";
		mes "兄さんにも原因はあるけど、";
		mes "元はと言えばそういう外見を与えた";
		mes "天が悪いんじゃないかな。";
		next;
		mes "[アイザック]";
		mes "とにかく、いま心配なのは姉さんだよ。";
		mes "今まで姉さんが怒ったの見たことある？";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "……一度だけ怒ったことがある。";
		mes "幼いころだけど。";
		mes "よくよく考えてみたら";
		mes "今と状況が似ていたような……";
		mes "比較……なんて言ってたっけ。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "私はもっと小さかったから";
		mes "記憶が曖昧だけど、";
		mes "兄さんと姉さんが言い争った後から";
		mes "話をしなくなったのは";
		mes "なんとなく覚えてるよ。";
		mes "やっぱり兄さんが原因じゃないか。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "今は誰が悪いのかを";
		mes "論じている場合ではないだろう。";
		mes "どうしましょうか、冒険者様？";
		next;
		menu "怒った人をなだめた経験は無いんですか？",-;
		mes "[ユルゲン]";
		mes "はい。私に怒る人なんて";
		mes "この世でおそらく";
		mes "お姉さん一人だけですから。";
		next;
		mes "[ユルゲン]";
		mes "冒険者様、とにかく私たちを";
		mes "助けてください。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "私は抜けるよ。";
		mes "別に私が姉さんを";
		mes "怒らせたわけじゃないし。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "待てよ、";
		mes "原因は姉さんの日記帳を";
		mes "勝手に持ち出したお前だろう。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "いや、私はただ持ち物が";
		mes "無くならないように……";
		mes "冒険者様、助けて！";
		next;
		menu "プレゼントとかどう？",-;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お姉さんが好きな物……";
		mes "アイザックは知ってるか？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "悪いけど、";
		mes "私は兄さんと同じ情報しか";
		mes "持ち合わせていないんだ。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "つまり、何も知らないって事か。";
		next;
		menu "大切な思い出がある物とかない？",-;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "そんなもの……あ？";
		mes "あるある！";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "へ？";
		mes "そんなのあったっけ？";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "まだ小さい時に";
		mes "家族でコモドビーチを";
		mes "訪れたことがあった。";
		mes "あの時の海岸と洞窟で";
		mes "綺麗な石を拾った覚えがある。";
		next;
		mes "[ユルゲン]";
		mes "姉さんが好きだった、";
		mes "透明な石の中に海水とサンゴが";
		mes "入っているような……";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "「海涙石」？";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "そう！　それだ！";
		mes "窓辺に吊るして太陽の光に煌めくのを";
		mes "ずっと見てたよな。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "ああ、思い出した。";
		mes "姉さんの部屋にあった";
		mes "あの綺麗な石！";
		mes "あれは海涙石だったのか。";
		next;
		menu "海涙石って何ですか？",-;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "コモドの特産品だったものです。";
		mes "海水のように透明な結晶の中に";
		mes "サンゴや砂が入っています。";
		mes "人魚が流した涙とも";
		mes "呼ばれてますね。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "ロマンチストな人は";
		mes "人魚の涙や人魚の贈り物とも";
		mes "呼びますが。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "コモドビーチの奥地で";
		mes "砂をあされば見つかるんです。";
		mes "みんなでワイワイ騒ぎながら";
		mes "探し回ったものです。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "最近はコモドビーチでは";
		mes "取れないらしいよ。";
		mes "理由はわからないけど";
		mes "^0000cdコモドダンジョン 01（西洞窟カル）";
		mes "にいるメデューサ^000000から";
		mes "入手出来るようになったそうな。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "は？";
		mes "なんでモンスターがそんなものを";
		mes "持っているんだ？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "詳しくは知らないよ。";
		mes "人魚の贈り物というくらいだから";
		mes "半漁人がプレゼントでも";
		mes "したんじゃないの？";
		mes "子供の好きそうな話さ。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "あそこに半漁人は";
		mes "生息していないはずだが……";
		mes "それより、何でそんなことを";
		mes "知ってるんだ？";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "いや、実は海涙石に関する";
		mes "事業を計画していたんだ。";
		mes "前はすぐに採取できてたから";
		mes "観光客や海に祈りを捧げる人が";
		mes "たまに探してたくらいだしね。";
		next;
		mes "[アイザック]";
		mes "ところがいつの間にか";
		mes "採れなくなって、";
		mes "赤字必至なんでやめたんだ。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "知らなかった……";
		mes "うーん、あとは石に飾られた花が";
		mes "なにかあったような……";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "そうだね。";
		mes "確かに花も飾られていた。";
		mes "しかも長い間枯れなかったよね。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "冒険者様、枯れない花に";
		mes "なにか心当たりが？";
		next;
		menu "しおれないバラだと思う",-;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "そんなものがあるのですか？";
		mes "枯れてしまう前にまた新しい花を";
		mes "飾ればいいのでは？";
		next;
		menu "同じものを大切にしたいんだと思う",-;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "なるほど、同じもの。";
		mes "好きなものが長く続くことを";
		mes "望んでいるのか。";
		mes "枯れてしまって取り替えた花は";
		mes "もう「好きだった花」ではない、と。";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "確かに……";
		mes "私が私でない誰かになるなんて";
		mes "想像するだけで寒気がする。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "で、持ってきてもらえますよね？";
		next;
		menu "え？",-;
		mes "[アイザック]";
		mes "まさか、私たちに集められるとでも";
		mes "思っておいでですか?!";
		next;
		mes "[アイザック]";
		mes "私は事業の準備がありますし、";
		mes "兄さんは外に出るだけで";
		mes "身動きも取れないほど";
		mes "人が集まってしまうので無理です。";
		next;
		mes "[アイザック]";
		mes "そして今の状況を知る人であり、";
		mes "信じられる人は……";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お願いします。";
		mes "ウィグナー家の平和は";
		mes "あなたの手にかかっています！";
		next;
		menu "わかりました……",-;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "そうですね。";
		mes "^0000cdしおれないバラは1個^000000あれば";
		mes "大丈夫そうです。";
		mes "^0000cd海涙石も1個^000000お願いします。";
		next;
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "よろしくお願いします。";
		delquest 14486;
		setquest 14487; //state=1
		set EP16_SUB1,12;
		next;
		cutin "16jur_nor.bmp", 255;
		mes "‐^0000cdこのクエストを進行中のみ";
		mes "　メデューサを討伐すると";
		mes "　海涙石を入手できます^000000‐";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "海涙石を入手しに行くなら";
		mes "よろしければ、使いの者をだします。";
		mes "使いの者にコモドまで";
		mes "案内させますよ。";
		next;
		mes "[ユルゲン]";
		mes "しおれないバラは";
		mes "どこで入手できるか分からないので";
		mes "冒険者様自らの足で";
		mes "手に入れてきてください。";
		next;
		if(select("自力でいきます","お願いします") == 1) {
			mes "[ユルゲン]";
			mes "自力とはさすがですね。";
			mes "それではよろしくお願いします。";
			close2;
			cutin "16jur_nor.bmp", 255;
			end;
		}
	case 12:
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "冒険者様、お願いしていた物は";
		mes "揃いましたか？";
		next;
		mes "[ユルゲン]";
		mes "あ、もしかして何をお願いしていたか";
		mes "お忘れですか？";
		next;
		mes "[ユルゲン]";
		mes "^0000cd海涙石が1個^000000。";
		mes "これはコモド西の洞窟にいる";
		mes "メデューサを倒せば";
		mes "手に入れることが出来るようです。";
		next;
		cutin "16jur_nor.bmp", 255;
		mes "‐^0000cdこのクエストを進行中のみ";
		mes "　メデューサを討伐すると";
		mes "　海涙石を入手できます^000000‐";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "そして^0000cdしおれないバラ1個^000000です。";
		next;
		mes "[ユルゲン]";
		mes "困難な仕事かも知れませんが";
		mes "お姉さんを落ち着かせるために";
		mes "どうかお願いします。";
		next;
		mes "[ユルゲン]";
		mes "海涙石を入手しに行くなら";
		mes "よろしければ、使いの者をだします。";
		mes "使いの者にコモドまで";
		mes "案内させますよ。";
		next;
		mes "[ユルゲン]";
		mes "しおれないバラは";
		mes "どこで入手できるか分からないので";
		mes "冒険者様自らの足で";
		mes "手に入れてきてください。";
		next;
		if(select("自力でいきます","お願いします") == 1) {
			mes "[ユルゲン]";
			mes "自力とはさすがですね。";
			mes "それではよろしくお願いします。";
			close2;
			cutin "16jur_nor.bmp", 255;
			end;
		}
	}
}
prt_cas_q.gat,96,7,1	script	カトリン・ウィグナー#ep	10125,{/* 60658 */
	switch(EP16_SUB1) {
	case 0:
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "……。";
		close2;
		cutin "16kat_nor.bmp", 255;
		end;
	case 1:
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "冒険者様、";
		mes "ウィグナー家にご訪問いただき光栄です。";
		mes "ユルゲンには";
		mes "もうお会いになりましたか？";
		close2;
		cutin "16kat_nor.bmp", 255;
		end;
	case 2:
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "父とお話をしてください。";
		close2;
		cutin "16kat_nor.bmp", 255;
		end;
	case 3:
		cutin "16kat_ang.bmp", 2;
		mes "[カトリン]";
		mes "私は破滅よ！";
		next;
		menu "どうしました？",-;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "お姉さん、まずは落ち着こう。";
		mes "ここに置いたのは確かなんだね？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "そう、ここ！";
		mes "ここに置いてあったの！";
		mes "先ほど冒険者様とお話をしてから";
		mes "ここに置いたのに……";
		mes "消えてしまったの！";
		next;
		menu "何を無くしたのですか？",-;
		mes "[カトリン]";
		mes "私の宝石箱が……いえ";
		mes "中身は宝石ではないのですが、";
		mes "とにかく大事なものが入った";
		mes "^0000cd小さな箱がなくなりました^000000。";
		next;
		mes "[カトリン]";
		mes "先ほどカバンから取り出して";
		mes "ここに置いたのですが……";
		mes "どうしましょう……";
		mes "もしも誰かにあれを";
		mes "見られでもしたら……っ!!";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "もしかしたら";
		mes "掃除に来た^0000cdメイド^000000が";
		mes "片付けてしまったのでは？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "ユルゲン、いけません！";
		mes "そのメイドが持っていくのを";
		mes "直接見たわけではないでしょう？";
		mes "状況だけで人を疑うのは";
		mes "良くない事です。";
		next;
		menu "話を聞くのは良い案だと思います",-;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "いいえ、その必要はありません。";
		mes "話を聞きにいけば、";
		mes "自分は疑われていると考えるでしょう。";
		mes "きっと気分を害する事になります。";
		next;
		cutin "16jur_sim.bmp", 0;
		mes "[ユルゲン]";
		mes "でもそんなに不安になるほど、";
		mes "大事な物なんでしょう？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "それは……そうだけど……";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "絶対に見つけ出さないと";
		mes "駄目なんだよね？";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "そう……だけど……";
		next;
		menu "どうか安心してお待ちください",-;
		mes "[カトリン]";
		mes "……それが最善かは……";
		mes "わかりません。";
		mes "疑いをかけているようで……";
		next;
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "冒険者様を信じてみよう。";
		mes "多くの経験を積んだ方だから";
		mes "きっと上手くいくよ。";
		next;
		cutin "16kat_nor.bmp", 2;
		mes "[カトリン]";
		mes "……そう。";
		mes "それではお願い致します。";
		mes "私は念のため";
		mes "他の場所を探してみます。";
		next;
		cloakonnpc "カトリン・ウィグナー#ep"; //60710
		cutin "16jur_nor.bmp", 0;
		mes "[ユルゲン]";
		mes "お願いします。";
		mes "^0000cdメイド達は台所にいる^000000と聞きました。";
		chgquest 14477,14478; //state=1
		set EP16_SUB1,4;
		close2;
		cutin "16jur_nor.bmp", 255;
		end;
	case 11:	//未調査
		end;
	}
}
prt_cas_q.gat,90,16,0	script	#ep16wig004	139,11,11,{/* 60659 */
	switch(EP16_SUB1) {
	default:
		cloakoffnpc "カトリン・ウィグナー#ep"; //60710
		cloakoffnpc "アイザック・ウィグナー#"; //60712
		break;
	case 2:
	case 3:
		cloakoffnpc "カトリン・ウィグナー#ep"; //60710
		cloakonnpc "アイザック・ウィグナー#"; //60712
		break;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
		cloakonnpc "カトリン・ウィグナー#ep"; //60710
		cloakonnpc "アイザック・ウィグナー#"; //60712
		break;
	case 12:
		cloakonnpc "カトリン・ウィグナー#ep"; //60710
		cloakoffnpc "アイザック・ウィグナー#"; //60712
		break;
	}
	switch(rand(3)) {
	case 1:
		donpcevent "一途な女性#ep16wig01::OnStart";
		end;
	case 2:
		donpcevent "田舎者の男性#ep16wig01::OnStart";
		end;
	}
	end;
}
prt_cas_q.gat,94,7,7	script	アイザック・ウィグナー#	10126,{/* 60660 */
	switch(EP16_SUB1) {
	case 0:
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "ウィグナー家には";
		mes "初めていらっしゃいましたか？";
		mes "それではあちらにおります";
		mes "私の^0000cd両親にお会いになって^000000ください。";
		close2;
		cutin "16isa.bmp", 255;
		end;
	case 1:
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "冒険者様、まずはウィグナー家にいる";
		mes "他の家族にもあっていただけますか？";
		mes "父や母、王位継承候補の兄と";
		mes "長女の姉にも。";
		next;
		mes "[アイザック]";
		mes "良いお話が聞けると思います。";
		close2;
		cutin "16isa.bmp", 255;
		end;
	case 11:	//未調査
		end;
	case 12:
		cutin "16isa.bmp", 1;
		mes "[アイザック]";
		mes "冒険者様、お願いしていた物は";
		mes "集まりましたか？";
		next;
		mes "[アイザック]";
		mes "私が直接集めてきた方が";
		mes "仲直りとしては良いでしょうが、";
		mes "身内の恥を外にさらけ出すような";
		mes "ものですので……";
		next;
		mes "[アイザック]";
		mes "お手数をお掛けしますが";
		mes "お願いします。";
		mes "ああ、念のため集める物は、";
		next;
		mes "[アイザック]";
		mes "^0000cd海涙石1個、しおれないバラ1個^000000です。";
		next;
		mes "[アイザック]";
		mes "冒険者様の手に";
		mes "我々姉弟の仲がかかっています。";
		next;
		mes "[アイザック]";
		mes "それではお願いします！";
		mes "できるだけ早く！";
		close2;
		cutin "16isa.bmp", 255;
		end;
	}
}
prt_cas_q.gat,93,10,4	script	メイド#ep16wig01	69,{/* 60661 (cloaking)*/}
prt_cas.gat,322,216,5	script	メイド#ep16wig02	69,{/* 60662 */
	switch(EP16_SUB1) {
	default:
		mes "[メイド]";
		mes "フフフ～ン♪";
		mes "お掃除、お掃除～♪";
		mes "めんどくさいね～♪";
		close;
	case 4:
		mes "[メイド]";
		mes "今日もキツいと評判の";
		mes "キッチン掃除……";
		mes "何とか終わらせないと……";
		next;
		mes "[メイド]";
		mes "どこかにこんな私を";
		mes "助けてくれる人は";
		mes "いないかな……って";
		mes "何か御用でしょうか？";
		next;
		menu "ウィグナー家の掃除を担当している方？",-;
		mes "[メイド]";
		mes "あ、はい。私です。";
		mes "何か問題でも……？";
		next;
		menu "小さな箱を見ませんでしたか？カトリンの物です",-;
		mes "[メイド]";
		mes "あ、はい。たしかに見ました。";
		mes "単調ながら高級感溢れる箱でした。";
		mes "掃除の際には一度ずらしましたが、";
		mes "テーブルを拭き終えた後には";
		mes "ぴったりと元の位置に戻しました。";
		next;
		menu "状況をもっと詳しく",-;
		mes "[メイド]";
		mes "あの、すみません。";
		mes "これってもしかしなくても";
		mes "私疑われているんですよね。";
		next;
		emotion 6, "メイド#ep16wig02"; //61966
		mes "[メイド]";
		mes "貴族の部屋でなくなったものがあって、";
		mes "^0000cd掃除をしていたメイドが盗んだ^000000と……";
		next;
		menu "疑っているわけではないです",-;
		emotion 6, "メイド#ep16wig02"; //61966
		mes "[メイド]";
		mes "でも心の片隅では";
		mes "疑っておいででしょう。";
		mes "違いますか？";
		next;
		emotion 7, "メイド#ep16wig02"; //61966
		mes "[メイド]";
		mes "ふう……";
		mes "メイドという仕事をしていると";
		mes "こういう事も結構ありますので";
		mes "大丈夫です。";
		mes "疑われるのは慣れませんけど。";
		next;
		mes "[メイド]";
		mes "私は何も盗んでいません。";
		mes "でもそうですね……";
		mes "他に人は……";
		next;
		menu "あなたの他に人はいたのですか？",-;
		mes "[メイド]";
		mes "それが……いたような、";
		mes "いなかったような。";
		mes "^0000cdキッチンが綺麗になれば";
		mes "思い出せそう^000000です。";
		mes "あまりに汚くて私の頭の中も";
		mes "混乱していまして……";
		next;
		emotion 45, "メイド#ep16wig02"; //61966
		mes "[メイド]";
		mes "あ～あ～！";
		mes "誰か私を手伝ってくれる";
		mes "優しい人はいないのかな～。";
		next;
		menu "手伝いましょう",-;
		emotion 18, "メイド#ep16wig02"; //61966
		mes "[メイド]";
		mes "あら！";
		mes "手伝ってくださるのですか！";
		mes "それじゃこの^0000cdポリンたわし^000000を";
		mes "お貸しします。";
		mes "隅々までちゃんと掃除してくださいね！";
		next;
		mes "[メイド]";
		mes "特殊な製法で製作された";
		mes "とても凄いたわしなので";
		mes "いろんな場所で使う事ができます。";
		mes "掃除の手順までコーチしてくれる";
		mes "優れ物ですよ。";
		next;
		mes "[メイド]";
		mes "初めて使う方は驚くかも知れませんが、";
		mes "人に害は及ぼしたりしないので";
		mes "安心してください。";
		mes "伝説的なとある方が";
		mes "作った物だそうです。";
		next;
		if(checkitemblank() == 0) {
			mes "[メイド]";
			mes "あら？";
			mes "荷物がいっぱいですね。";
			mes "荷物に1個以上の空きを作ってから";
			mes "また来てください。";
			close;
		}
		mes "[メイド]";
		mes "ああ、あと掃除にもちゃんと";
		mes "順番がありますからね。";
		mes "まずは壁のカビ取りから。";
		mes "粘ついた汚れを取ったら";
		mes "最後に床掃除です！";
		delquest 14478;
		setquest 14479; //state=1
		setquest 73062; //state=1
		getitem 6928, 3;
		set EP16_SUB1,5;
		close;
	case 5:
	case 6:
	case 7:
		mes "[メイド]";
		mes "もう終わったのですか？";
		mes "あらあら、まだみたいですね。";
		next;
		mes "[メイド]";
		mes "先ほどお渡ししたたわしで";
		mes "ちゃんと掃除をしてくださいね。";
		close;
	case 8:
		emotion 21; //60718
		mes "[メイド]";
		mes "うわあ～！";
		mes "本当にピカピカになりました！";
		mes "私の腕力じゃ";
		mes "ここまでの掃除は無理です。";
		mes "いっそキッチン専門の";
		mes "清掃員に転職しませんか？";
		next;
		mes "[メイド]";
		mes "あの部屋は臨時で";
		mes "使用するものとはいえ、";
		mes "ルーンミッドガッツ最高の富を誇る";
		mes "ウィグナー家が使用しました。";
		next;
		mes "[メイド]";
		mes "当然それに見合う家具や";
		mes "カーペットが絶え間なく運ばれ";
		mes "飾られていたのです。";
		mes "それに私、今まであのように";
		mes "優雅で豪華な虎の皮は";
		mes "初めて見ました。";
		next;
		menu "家具ではなく人の話をしたいです",-;
		mes "[メイド]";
		mes "はあ……";
		mes "ちょっとは空気を読んでください。";
		mes "腹黒い貴族を相手している方が";
		mes "こんなに鈍感とは……";
		next;
		mes "[メイド]";
		mes "はい、ここまで聞いたら";
		mes "わかりますよね。";
		mes "なぜ私が^0000cd家具の話^000000をしていたのか。";
		next;
		menu "まさか家具の配達人？",-;
		mes "[メイド]";
		mes "私は誰とは言ってませんけど";
		mes "他にも出入りする人を調べれば";
		mes "何か解るかもしれませんね。";
		mes "ところで……";
		mes "本当に箱を無くしたのですか？";
		next;
		mes "[メイド]";
		mes "王宮ではいろんな噂話を聞けますが、";
		mes "小耳に挟んだ話です。";
		mes "ウィグナー家の王子様は";
		mes "とてもお美しいではありませんか。";
		next;
		mes "[メイド]";
		mes "幼い頃から弟の王子様ばかり";
		mes "注目を浴びていたので";
		mes "ストレスがたまったお姫様のほうは";
		mes "人々の注目を集めようと必死だと。";
		next;
		mes "[メイド]";
		mes "そのような噂話があるのです。";
		next;
		mes "[メイド]";
		mes "まだ、一部の人の間で";
		mes "ささやかれているだけのようですが、";
		mes "本日のティータイムが終わる頃には";
		mes "王宮中に知れ渡るかも知れません。";
		next;
		menu "いやいや、まさか",-;
		emotion 6; //60718
		mes "[メイド]";
		mes "だから「噂」なのです。";
		mes "私はただ聞いただけです。";
		mes "それじゃ私はこれで失礼します。";
		next;
		menu "配達人ってどこにいるの？",-;
		mes "[メイド]";
		mes "そうですね、プロンテラのどこか……";
		mes "とは思いますが。";
		mes "まずは^0000cdプロンテラ南西の";
		mes "屋台が並んでいる辺り^000000に";
		mes "行ってみてください。";
		mes "お店はその近くですから。";
		next;
		mes "[メイド]";
		mes "あ、それと私は何も話していません。";
		mes "噂話は噂ですから。";
		delquest 14483;
		setquest 14484; //state=1
		set EP16_SUB1,9;
		next;
		mes "‐配達人のところに向かおうかな？‐";
		next;
		if(select("向かわない","向かう") == 1) {
			mes "‐今はやめておこう‐";
			close;
		}
		mes "‐配達人のところに向かった‐";
		close2;
		warp "prontera.gat",46,94;
		end;
	case 9:
		mes "[メイド]";
		mes "冒険者様？";
		mes "家具配達員の方でしたら……";
		mes "^0000cd区役所の近く^000000だと思います。";
		mes "多分。";
		next;
		mes "[メイド]";
		mes "それじゃ私は掃除の続きをしますので。";
		mes "失礼いたします。";
		next;
		mes "‐配達人のところに向かおうかな？‐";
		next;
		if(select("向かわない","向かう") == 1) {
			mes "‐今はやめておこう‐";
			close;
		}
		mes "‐配達人のところに向かった‐";
		close2;
		warp "prontera.gat",46,94;
		end;
	}
}
prt_cas.gat,339,212,5	script	暗く湿った壁#ep16wig	111,7,7,{/* 60663 */
	if(EP16_SUB1 == 5) {
		if(!checkquest(14481)) {
			mes "[ポリンたわし]";
			mes "汝、臭く汚い場所にて";
			mes "我を呼び覚ましたのは人間か？";
			mes "深き眠りより呼び覚ました罪は";
			mes "掃除で償うべし。";
			next;
			mes "[ポリンたわし]";
			mes "我はこのたわしに封印されし";
			mes "掃除の神なり。";
			mes "我に再度安息の眠りをもたらすため、";
			mes "この場所を清掃せよ。";
			next;
			mes "[ポリンたわし]";
			mes "この場所に戯れる汚物は";
			mes "^0000cdカビの群生^000000なり。";
			mes "その同族と神聖なる水にて";
			mes "清掃がなされるだろう。";
			next;
			mes "[ポリンたわし]";
			mes "まずは^0000cdカビの粉1個と聖水1個^000000を";
			mes "求めるべし。";
			setquest 14481; //state=1
			close;
		}
		if(countitem(7001) < 1 || countitem(523) < 1) {
			mes "[ポリンたわし]";
			mes "汝、人間よ。";
			mes "準備は徹底して行うべし。";
			mes "まずは^0000cdカビの粉1個と聖水1個^000000を";
			mes "求めるべし。";
			next;
			mes "[ポリンたわし]";
			mes "求める物集まらば、";
			mes "清掃の資格を持つ者と認めん。";
			mes "汝、人間よ。";
			mes "準備は徹底して行うべし。";
			close;
		}
		mes "[ポリンたわし]";
		mes "カビの粉と聖水を持つものよ、";
		mes "カビの群生を消し去らん。";
		next;
		mes "[ポリンたわし]";
		mes "カビの粉をカビの群生にふりかけ、";
		mes "たわしを回しながら";
		mes "押し付けるべし。";
		next;
		mes "[ポリンたわし]";
		mes "その後、聖水をふりかけ、";
		mes "たわしでこねるように";
		mes "混ぜるべし。";
		next;
		mes "[ポリンたわし]";
		mes "そして次のように清掃行うべし。";
		next;
		mes "[ポリンたわし]";
		mes "繊細に1回はたき、";
		mes "3回強く叩くべし。";
		mes "聖水とカビの粉が";
		mes "混ざるようにせよ。";
		next;
		mes "[ポリンたわし]";
		mes "次に10回押しこみ、";
		mes "5回時計回しに強くこするべし。";
		next;
		progressbar 3;
		misceffect 78; //60719
		mes "[ポリンたわし]";
		mes "感心した。";
		mes "まれに見る清掃だった。";
		mes "ポリンたわし生、";
		mes "一点の曇りなし。";
		next;
		mes "[ポリンたわし]";
		mes "我の成すべき事";
		mes "成しとげ成仏せん。";
		mes "汝、人間よ。";
		mes "天晴れであった。";
		misceffect 66,""; //self
		delitem 6928, 1;
		delitem 7001, 1;
		delitem 523, 1;
		delquest 14481;
		delquest 73062;
		setquest 73063; //state=1
		set EP16_SUB1,6;
		close;
	}
	if(EP16_SUB1 >= 6) {
		mes "[綺麗になった壁]";
		mes "綺麗になった壁を見ると";
		mes "一緒に掃除をした";
		mes "むすっとしたポリンたわしを";
		mes "思い出す。";
		close;
	}
	end;
OnTouch:
	if(EP16_SUB1 == 5) {
		if(!checkquest(14481)) {
			misceffect 58;
			mes "[ポリンたわし]";
			mes "汝、臭く汚い場所にて";
			mes "我を呼び覚ましたのは人間か？";
			mes "深き眠りより呼び覚ました罪は";
			mes "掃除で償うべし。";
			next;
			mes "[ポリンたわし]";
			mes "我はこのたわしに封印されし";
			mes "掃除の神なり。";
			mes "我に再度安息の眠りをもたらすため、";
			mes "この場所を清掃せよ。";
			next;
			mes "[ポリンたわし]";
			mes "この場所に戯れる汚物は";
			mes "^0000cdカビの群生^000000なり。";
			mes "その同族と神聖なる水にて";
			mes "清掃がなされるだろう。";
			next;
			mes "[ポリンたわし]";
			mes "まずは^0000cdカビの粉1個と聖水1個^000000を";
			mes "求めるべし。";
			setquest 14481; //state=1
			close;
		}
	}
	end;
}
prt_cas.gat,339,198,5	script	べとべとした壁#ep16wig	111,7,7,{/* 60664 */
	if(EP16_SUB1 == 6) {
		if(!checkquest(14480)) {
			mes "[ポリンたわし]";
			mes "うーん！　よく寝た！";
			mes "君があの^0000cdべとべとした油汚れ^000000に";
			mes "僕を案内したのかい？";
			next;
			mes "[ポリンたわし]";
			mes "始めまして！";
			mes "僕はこのたわしに住んでいる";
			mes "掃除の妖精さ！";
			mes "僕と一緒に掃除をしてくれる人を";
			mes "待っていたんだ！";
			next;
			mes "[ポリンたわし]";
			mes "やっと起きる事ができたよ！";
			mes "それじゃ僕と一緒に";
			mes "楽しく掃除をしよう！";
			next;
			mes "[ポリンたわし]";
			mes "油汚れは僕の得意分野さ！";
			mes "今日もはりきっちゃうよ！";
			next;
			mes "[ポリンたわし]";
			mes "この油汚れなら……";
			mes "^0000cdオレンジとアルコールを混ぜたもの^000000が";
			mes "効果があるよ！";
			mes "まずは^0000cdオレンジ1個とアルコール1個^000000を";
			mes "準備しよう！";
			setquest 14480; //state=1
			close;
		}
		if(countitem(582) < 1 || countitem(970) < 1) {
			mes "[ポリンたわし]";
			mes "まだ掃除に必要なものが";
			mes "揃ってないよ！";
			mes "まずは^0000cdオレンジ1個とアルコール1個^000000を";
			mes "準備しよう！";
			next;
			mes "[ポリンたわし]";
			mes "できるなら僕が準備したいけどさ、";
			mes "ほら。僕ってたわしでしょう？";
			mes "だからお願いね。";
			close;
		}
		mes "[ポリンたわし]";
		mes "どうやらオレンジとアルコールが";
		mes "準備できたようだね！";
		next;
		mes "[ポリンたわし]";
		mes "まずはその美味しそうな";
		mes "オレンジの皮を剥こう！";
		mes "そして皮はアルコールに";
		mes "漬けて置くんだ！";
		mes "オレンジの実は美味しくいただこうね！";
		next;
		mes "[ポリンたわし]";
		mes "さあ、もうそろそろ";
		mes "アルコールにオレンジの皮の";
		mes "成分が溶けたとはずさ！";
		mes "よく振って混ぜてみよう！";
		next;
		mes "[ポリンたわし]";
		mes "そしてそのアルコール混合物を";
		mes "油汚れに振りかけるんだ！";
		mes "パッパッとね。";
		next;
		mes "[ポリンたわし]";
		mes "最初はゆるーくたわしで";
		mes "回しながらこするんだ。";
		mes "ゆっくりね。";
		mes "だんだん強くこするんだ。";
		next;
		mes "[ポリンたわし]";
		mes "アルコール混合物を";
		mes "もう一度パッパッと振りかけてから";
		mes "腕が痛くない程度でこするんだ。";
		next;
		progressbar 3; //color=0xffff00
		misceffect 78; //60720
		mes "[ポリンたわし]";
		mes "うわぁ！　本当に綺麗になったよ！";
		mes "それに爽やかなオレンジの香りが";
		mes "あたりに充満してるよ！";
		next;
		mes "[ポリンたわし]";
		mes "それじゃ名残惜しいけど";
		mes "これで僕の役目は終わりさ。";
		mes "掃除を終えた後に待つ運命だからね。";
		next;
		mes "[ポリンたわし]";
		mes "短い間だったけど、";
		mes "たわしの妖精としては充実できたよ！";
		mes "あーあ、今度は僕も君みたいな";
		mes "人間に生まれたい……な……ぁ……";
		misceffect 66,""; //self
		delitem 6928, 1;
		delitem 582, 1;
		delitem 970, 1;
		delquest 14480;
		delquest 73063;
		setquest 73064; //state=1
		set EP16_SUB1,7;
		close;
	}
	if(EP16_SUB1 >= 7) {
		mes "[綺麗になった壁]";
		mes "綺麗になった壁を見ると";
		mes "一緒に掃除をした";
		mes "優しかったポリンたわしを";
		mes "思い出す。";
		close;
	}
	end;
OnTouch:
	if(EP16_SUB1 == 6) {
		if(!checkquest(14480)) {
			misceffect 58;
			mes "[ポリンたわし]";
			mes "うーん！　よく寝た！";
			mes "君があの^0000cdべとべとした油汚れ^000000に";
			mes "僕を案内したのかい？";
			next;
			mes "[ポリンたわし]";
			mes "始めまして！";
			mes "僕はこのたわしに住んでいる";
			mes "掃除の妖精さ！";
			mes "僕と一緒に掃除をしてくれる人を";
			mes "待っていたんだ！";
			next;
			mes "[ポリンたわし]";
			mes "やっと起きる事ができたよ！";
			mes "それじゃ僕と一緒に";
			mes "楽しく掃除をしよう！";
			next;
			mes "[ポリンたわし]";
			mes "油汚れは僕の得意分野さ！";
			mes "今日もはりきっちゃうよ！";
			next;
			mes "[ポリンたわし]";
			mes "この油汚れなら……";
			mes "^0000cdオレンジとアルコールを混ぜたもの^000000が";
			mes "効果があるよ！";
			mes "まずは^0000cdオレンジ1個とアルコール1個^000000を";
			mes "準備しよう！";
			setquest 14480; //state=1
			close;
		}
	}
	end;
}
prt_cas.gat,309,215,5	script	真っ黒な床#ep16wig	111,{/* 60665 */
	if(EP16_SUB1 == 7) {
		if(!checkquest(14482)) {
			mes "[ポリンたわし]";
			mes "あなたですか！";
			mes "今日の掃除担当は！";
			mes "お初にお目にかかります！";
			mes "自分はポリンたわしに封印された";
			mes "掃除担当曹長であります！";
			next;
			mes "[ポリンたわし]";
			mes "自分の指示に正しくついて";
			mes "これればどんなにキツイ汚れでも";
			mes "撃破する事ができるであります！";
			mes "心配無用であります！";
			next;
			mes "[ポリンたわし]";
			mes "本日の目標を確認したであります！";
			mes "床の上にこびりついた";
			mes "黒い物体であります！";
			mes "彼我戦力差は";
			mes "芳しくないのであります！";
			next;
			mes "[ポリンたわし]";
			mes "戦力差を埋めるために";
			mes "補給品が必要であります！";
			mes "目標殲滅のため、";
			mes "^0000cdきれいな砂1個とレモン1個^000000が";
			mes "必要であります！";
			next;
			mes "[ポリンたわし]";
			mes "掃除実施は補給品がそろい次第、";
			mes "実行するであります！";
			mes "補給品捜索を頼んだであります！";
			setquest 14482; //state=1
			close;
		}
		if(countitem(582) < 1 || countitem(970) < 1) {
			mes "[ポリンたわし]";
			mes "補給品が";
			mes "まだ到着していないのであります！";
			mes "目標殲滅のため、";
			mes "^0000cdきれいな砂1個とレモン1個^000000が";
			mes "必要であります！";
			next;
			mes "[ポリンたわし]";
			mes "掃除実施は補給品がそろい次第、";
			mes "実行するであります！";
			mes "補給品の準備を頼んだであります！";
			close;
		}
		mes "[ポリンたわし]";
		mes "補給品の準備、よし！";
		mes "それでは清掃を開始するであります！";
		next;
		mes "[ポリンたわし]";
		mes "レモンを手でつぶすであります！";
		mes "レモン汁は床に振り撒くであります！";
		mes "きれいな砂はその上に";
		mes "振り掛けるであります！";
		mes "研磨作用が強くなるであります！";
		next;
		mes "[ポリンたわし]";
		mes "そして自分を力強く床に";
		mes "こすりつけるであります！";
		mes "床掃除は次のように";
		mes "こするのであります！";
		next;
		mes "[ポリンたわし]";
		mes "掃除は左から右へするのが";
		mes "定石であります！";
		mes "腕が棒になるくらいに";
		mes "強くこするのがコツであります！";
		next;
		progressbar 3; //color=0xffff00
		mes "[ポリンたわし]";
		mes "まだまだであります！";
		mes "そのような動きでは黒い物体は";
		mes "残滅できないのであります！";
		next;
		mes "[ポリンたわし]";
		mes "掃除は左から右へするのが";
		mes "定石であります！";
		mes "腕が棒になるくらいに";
		mes "強くこするのがコツであります！";
		next;
		progressbar 3; //color=0xffff00
		misceffect 78, "真っ黒な床#ep16wig"; //60721
		mes "[ポリンたわし]";
		mes "よろしい！";
		mes "最高であります！";
		mes "黒い物体の殲滅に成功したであります！";
		next;
		mes "[ポリンたわし]";
		mes "自分がいなくても";
		mes "もう大丈夫であります！";
		mes "そなたは立派な清掃兵であります！";
		next;
		mes "[ポリンたわし]";
		mes "これで自分も役目を果たしたので";
		mes "除隊できるであります！";
		mes "これにて解散！　であります！";
		misceffect 66,""; //self
		delitem 6928, 1;
		delitem 7043, 1;
		delitem 568, 1;
		delquest 14482;
		delquest 14479;
		delquest 73064;
		setquest 14483; //state=1
		set EP16_SUB1,8;
		close;
	}
	if(EP16_SUB1 >= 8) {
		mes "[輝く床]";
		mes "輝く床を見ていると";
		mes "軍人のようなポリンたわしを";
		mes "思い出す。";
		mes "メイドに掃除完了を知らせよう。";
		close;
	}
	end;
OnTouch:
	if(EP16_SUB1 == 7) {
		if(!checkquest(14482)) {
			misceffect 58;
			mes "[ポリンたわし]";
			mes "あなたですか！";
			mes "今日の掃除担当は！";
			mes "お初にお目にかかります！";
			mes "自分はポリンたわしに封印された";
			mes "掃除担当曹長であります！";
			next;
			mes "[ポリンたわし]";
			mes "自分の指示に正しくついて";
			mes "これればどんなにキツイ汚れでも";
			mes "撃破する事ができるであります！";
			mes "心配無用であります！";
			next;
			mes "[ポリンたわし]";
			mes "本日の目標を確認したであります！";
			mes "床の上にこびりついた";
			mes "黒い物体であります！";
			mes "彼我戦力差は";
			mes "芳しくないのであります！";
			next;
			mes "[ポリンたわし]";
			mes "戦力差を埋めるために";
			mes "補給品が必要であります！";
			mes "目標殲滅のため、";
			mes "^0000cdきれいな砂1個とレモン1個^000000が";
			mes "必要であります！";
			next;
			mes "[ポリンたわし]";
			mes "掃除実施は補給品がそろい次第、";
			mes "実行するであります！";
			mes "補給品捜索を頼んだであります！";
			setquest 14482; //state=1
			close;
		}
	}
	end;
}
prontera.gat,52,88,5	script	家具配達員#ep16wig	52,{/* 51233 */
	if(EP16_SUB1 <= 8) {
	}
	if(EP16_SUB1 == 9) {
		mes "[家具配達員]";
		mes "ふう、今日も良く働いたぜ！";
		mes "さーて、夕飯は何かな～。";
		mes "確か温かいスープだったような……";
		next;
		menu "すいません",-;
		emotion 28; //51233
		mes "[家具配達員]";
		mes "おっと！";
		mes "今日はもう店じまいですよ。";
		mes "急ぎの件でなければ";
		mes "明日また来て貰っても良いですか？";
		next;
		mes "[家具配達員]";
		mes "今日も良く働いて疲れてるんです。";
		mes "こういう日には";
		mes "ハーブの味つきカルビでも";
		mes "食いたいな……";
		next;
		menu "ウィグナー家の家具について",-;
		mes "[家具配達員]";
		mes "はい、どうしました？";
		mes "もしかして何か家具に問題でも？";
		mes "受け取り確認はしましたが……";
		next;
		mes "[家具配達員]";
		mes "もしかして追加の注文ですか？";
		mes "ウィグナー家はお得意さんなので";
		mes "何とかしたいのですが";
		mes "あの家具は特注でして";
		mes "すぐには配達できないんですよ。";
		emotion 54; //51233
		next;
		menu "箱を見ませんでした？",-;
		mes "[家具配達員]";
		mes "家具配達時には特には……";
		mes "いや、ちょっと待てよ。";
		mes "確か……";
		next;
		mes "[家具配達員]";
		mes "ベッド近くのテーブルの上にあった";
		mes "^0000cd小さな箱^000000ですかね？";
		mes "特に派手な装飾はない箱。";
		next;
		menu "たぶん、そうです",-;
		mes "[家具配達員]";
		mes "思い出しました。";
		mes "飾り気はないので素朴な雰囲気ですが";
		mes "あれは巨匠の作品でしょう。";
		mes "使われた木材も高級なものでしたし、";
		mes "錠も気品が感じられるものでした。";
		next;
		mes "[家具配達員]";
		mes "いやー、あれはもう芸術品の域ですよ。";
		mes "家具を取り扱って結構経ちますが";
		mes "あれほどの物はそうそう";
		mes "見た事がないです。";
		next;
		menu "配達後も、箱はありましたか？",-;
		emotion 6; //51233
		mes "[家具配達員]";
		mes "そりゃそうでしょう。";
		mes "箱が勝手に歩き回る訳でも……・";
		next;
		emotion 23; //51233
		mes "[家具配達員]";
		mes "……もしかして私が疑われてます?!";
		mes "荷車にはそんな物は";
		mes "ありませんでしたよ！";
		next;
		menu "疑っているわけではありません",-;
		emotion 7; //51233
		mes "[家具配達員]";
		mes "まあ、お偉いさんの事ですから";
		mes "何か無くなればとりあえず";
		mes "私のような下の者を疑うのでしょう。";
		mes "金が少ない物は貪欲で不道徳だと。";
		mes "偏見じゃないか。";
		next;
		emotion 7; //51233
		mes "[家具配達員]";
		mes "はあ、";
		mes "そっちがそのつもりでなくても";
		mes "受け入れる側からは";
		mes "そうは聞こえないんですよ。";
		next;
		menu "あなただけではなくみんなに聞いている",-;
		emotion 32; //51233
		mes "[家具配達員]";
		mes "ふう……";
		mes "あんたもお偉いさんの使いって事か。";
		mes "そうですね。それなら……";
		mes "(ギュルルルルル)";
		mes "うお、腹が減りすぎて……";
		mes "めまいが……";
		next;
		menu "食べ物はある？",-;
		mes "[家具配達員]";
		mes "そんなもので(ギュルルルル)";
		mes "私の気分が晴れる(グルルルルル)";
		mes "とでも(ギュルルルル)";
		mes "……ゴホン。";
		mes "それじゃ「ハーブの味つきカルビ」を。";
		next;
		menu "カルビはうまいですよね",-;
		mes "[家具配達員]";
		mes "そう、最高にうまい！";
		mes "^0000cdハーブの味つきカルビ1個^000000で";
		mes "手を打ちましょう！";
		emotion 29; //51233
		delquest 14484;
		setquest 14485; //state=1
		set EP16_SUB1,10;
		close;
	}
	if(EP16_SUB1 == 10) {
		if(countitem(12044) < 1) {
			mes "[家具配達員]";
			mes "持ってきましたか？";
			mes "（ギュルルルルルル）";
			mes "もう倒れそうです……";
			next;
			mes "[家具配達員]";
			mes "でもカルビの匂いがしませんね。";
			mes "^0000cdハーブの味つきカルビ1個^000000ですよ。";
			next;
			emotion 32; //51233
			mes "[家具配達員]";
			mes "腹ペコで意識不明になる前に";
			mes "持ってきてください。";
			mes "（ギュルルルルル）";
			close;
		}
		mes "[家具配達員]";
		mes "もう来たんですか。";
		mes "（ギュルルル）";
		mes "腹が減って倒れる前に来たのは";
		mes "評価しますよ。";
		next;
		emotion 18; //51233
		mes "[家具配達員]";
		mes "どれどれ、これはいい肉だ！";
		mes "早速焼かせて貰いましょう！";
		mes "なんて久しぶりなんだろ！";
		next;
		mes "[家具配達員]";
		mes "10年前に親父と食べた";
		mes "カルビを思い出す……";
		mes "親父ぃ……！";
		next;
		menu "箱の件",-;
		emotion 6; //51233
		mes "[家具配達員]";
		mes "ああ、あの箱なら（もぐもぐ）";
		mes "城から出るときに（もぐもぐ）";
		mes "警備兵に荷車（もぐもぐ）……";
		next;
		mes "[家具配達員]";
		mes "げほげほ！";
		mes "ふー、喉に肉が詰まった。";
		mes "まあ、警備兵に荷車を";
		mes "確認して貰ったし";
		mes "警備兵に聞いてみてくれ。";
		next;
		mes "[家具配達員]";
		mes "ああ、そうだ。";
		mes "ところで（もぐもぐ）";
		next;
		mes "[家具配達員]";
		mes "城に出入りしているうちに";
		mes "小耳に挟んだのだが、";
		mes "ウィグナー家の長女に関して";
		mes "変な噂が立っているらしい。";
		next;
		menu "噂？",-;
		emotion 20; //51233
		mes "[家具配達員]";
		mes "火の無いところに煙は立たぬ、";
		mes "とも言うじゃないか。";
		mes "何となく陰険な雰囲気で";
		mes "何かをたくらんでいそうだと。";
		next;
		mes "[家具配達員]";
		mes "下の者である私が";
		mes "こんな話を聞いたという事は";
		mes "秘密にしてくれよ。";
		next;
		menu "カトリンの自作自演だと？",-;
		mes "[家具配達員]";
		mes "だから噂話だよ。";
		mes "^0000cd気になるなら確認してみるといい。^000000";
		mes "とにかく、あの箱は";
		mes "私が部屋から出るまでは";
		mes "ずっとテーブルの上にあったよ。";
		delitem 12044, 1;
		delquest 14485;
		setquest 14486; //state=1
		set EP16_SUB1,11;
		next;
		mes "‐メイドも配達人も";
		mes "　カトリンを疑っているようだ。";
		mes "　一度ユルゲンに報告しよう‐";
		next;
		mes "‐ユルゲンのところに向かおうかな？‐";
		next;
		if(select("向かわない","向かう") == 1) {
			mes "‐今はやめておこう‐";
			close;
		}
		mes "‐ユルゲンに会いに向かった‐";
		close2;
		warp "prt_cas_q.gat",90,15;
		end;
	}
	if(EP16_SUB1 == 11) {
		mes "[家具配達員]";
		mes "何か忘れ物ですか？";
		mes "城の警備兵には";
		mes "もう聞いてみましたか？";
		next;
		mes "[家具配達員]";
		mes "それともまたカルビを";
		mes "もらえるんですかね？";
		mes "あれは美味かった。";
		next;
		if(select("向かわない","向かう") == 1) {
			mes "‐今はやめておこう‐";
			close;
		}
		mes "‐ユルゲンに会いに向かった‐";
		close2;
		warp "prt_cas_q.gat",90,15;
		end;
	}
	if(EP16_SUB1 >= 12) {
		mes "[家具配達員]";
		mes "ふう、これで今日の仕事は終わりだ！";
		mes "明日の準備も今のうちにしておこう。";
		next;
		mes "[家具配達員]";
		mes "あと、腹も減ったし";
		mes "なにか食べるとするかな。";
		close;
	}
}
prt_cas_q.gat,150,122,4	script	恋する女性#ep16wig	71,{/* 60666 */
	if(EP16_SUB1 < 5) {	//未調査
		emotion 14; //60718
		mes "[恋する女性]";
		mes "ユルゲン様はいつお出ましに";
		mes "なるのですか？";
		mes "ああ、待ち遠しいです！";
		next;
		mes "[お嬢様な女性]";
		mes "私は23番目……";
		next;
		mes "[一途な女性]";
		mes "今日中にはお会いできるかしら？";
		next;
		mes "[端整な女性]";
		mes "23番目なら今日中は";
		mes "難しいかもしれませんわ。";
		close;
	}
	else {
		mes "[恋する女性]";
		mes "整理券はもらったものの……";
		mes "いつまで待てばいいのかしら。";
		next;
		mes "[お嬢様な女性]";
		mes "とりあえずティータイムはいかが？";
		next;
		mes "[一途な女性]";
		mes "少し休みますか？";
		next;
		mes "[端整な女性]";
		mes "ちょっと、中から何か聞こえません？";
		close;
	}
}
prt_cas_q.gat,148,122,4	script	一途な女性#ep16wig	68,{/* 60667 */
	if(EP16_SUB1 < 5) {	//未調査
		emotion 6,; //60719
		mes "[一途な女性]";
		mes "ユルゲン様はみんなのものよ！";
		mes "誰かの独り占めになった";
		mes "ユルゲン様なんて見たくないの！";
		next;
		mes "[お嬢様な女性]";
		mes "そうよ！　みんなのものよ！";
		next;
		mes "[恋する女性]";
		mes "私も！　私も！";
		next;
		mes "[端整な女性]";
		mes "あら、私はそうは思いませんけど？";
		close;
	}
	else {
		mes "[一途な女性]";
		mes "ユルゲン様を独り占めするのは";
		mes "天が許しても私が許しません！";
		next;
		mes "[お嬢様な女性]";
		mes "私も許さないわ！";
		next;
		mes "[恋する女性]";
		mes "正直になりなさい。";
		mes "それが私なら私は私を許しますわ。";
		next;
		mes "[端整な女性]";
		mes "天が許したなら";
		mes "いいんじゃなくて？";
		close;
	}
}
prt_cas_q.gat,148,117,7	script	お嬢様な女性#ep16wig	91,{/* 60668 */
	if(EP16_SUB1 < 5) {	//未調査
		mes "[お嬢様な女性]";
		mes "ユルゲン様はみんなに";
		mes "平等にしてくれるのだから、";
		mes "私たちもフェアに";
		mes "抜け駆けはしないと";
		mes "言ったでしょう！";
		mes "さあ、自首なさい！";
		next;
		mes "[一途な女性]";
		mes "それで自首するようなら";
		mes "初めから入ったりしないのでは？";
		next;
		mes "[恋する女性]";
		mes "ユルゲン様はなぜ";
		mes "一人を選んでは";
		mes "くださらないのかしら……";
		next;
		mes "[端整な女性]";
		mes "ところでユルゲン様は";
		mes "いついらっしゃるの？";
		close;
	}
	else {
		emotion 7; //61972
		mes "[お嬢様な女性]";
		mes "いったいどなた？";
		mes "昨日、カトリン様に媚を売ろうと";
		mes "うろついていたのは！";
		mes "抜け駆けはしない約束でしょう！";
		next;
		mes "[一途な女性]";
		mes "私じゃありません！";
		mes "そんな目で見ないでくださいな！";
		next;
		mes "[恋する女性]";
		mes "まあ！　いったい誰がそんな！";
		next;
		mes "[端整な女性]";
		mes "カトリン様が優しすぎるのに";
		mes "付け入ったのだわ。";
		close;
	}
}
prt_cas_q.gat,150,117,7	script	端整な女性#ep16wig	90,{/* 60669 */
	if(EP16_SUB1 < 5) {	//未調査
		mes "[端整な女性]";
		mes "そこのあなた！";
		mes "初めて来たならちょっとは";
		mes "周りの雰囲気を読みなさいよ！";
		next;
		mes "[お嬢様な女性]";
		mes "そうよ！";
		mes "迷惑だわ！";
		next;
		mes "[恋する女性]";
		mes "最初の3か月は";
		mes "遠くから見るだけという";
		mes "ルールを知りませんの？";
		next;
		mes "[一途な女性]";
		mes "ここで列を整理していた人は";
		mes "どこに行ったのかしらね。";
		close;
	}
	else {
		mes "[端整な女性]";
		mes "そこのあなた！";
		mes "初めて来たならちょっとは";
		mes "周りの雰囲気を読みなさいよ！";
		next;
		mes "[お嬢様な女性]";
		mes "そうよ！";
		mes "迷惑だわ！";
		next;
		mes "[恋する女性]";
		mes "最初の3か月は";
		mes "遠くから見るだけという";
		mes "ルールを知りませんの？";
		next;
		mes "[一途な女性]";
		mes "ここで列を整理していた人は";
		mes "どこに行ったのかしらね。";
		close;
	}
}
prt_cas_q.gat,146,121,4	script	田舎者の男性#ep16wig	59,{/* 60670 */
	emotion 28; //60722
	mes "[田舎者の男性]";
	mes "ここの女性たちは怖いです……";
	mes "暴言は吐くし、列は乱すし……";
	next;
	switch(select("もう帰ったら？","がんばれ")) {
	case 1:
		emotion 7; //60722
		mes "[田舎者の男性]";
		mes "もう整理券はもらってますし";
		mes "帰るに帰れませんよ。";
		mes "少なくともユルゲン様に会うまでは！";
		next;
		emotion 14; //60722
		mes "[田舎者の男性]";
		mes "本物のユルゲン様を見るまでは";
		mes "帰りません！";
		mes "ええ！　帰りません！";
		mes "何のために田舎から";
		mes "出てきたと……";
		close;
	case 2:
		emotion 14; //60722
		mes "[田舎者の男性]";
		mes "そうです！";
		mes "すべてはユルゲン様に";
		mes "お会いするため!!";
		mes "女性の怖さなんて";
		mes "なんぼでもないです！";
		close;
	}
}
prt_cas_q.gat,153,123,3	script	王宮警備兵#ep16wig01	105,{/* 60671 */}
prt_cas_q.gat,153,116,1	script	王宮警備兵#ep16wig02	105,{/* 60672 */}
prt_cas_q.gat,95,11,4	script	一途な女性#ep16wig01	68,{/* 60673 (hide)*/
	mes "[一途な女性]";
	mes "ユルゲン様は私と";
	mes "一緒になるのよ……!!";
	close;
OnStart:
	if(!getnpctimer(1,"#tltimer")) {
		hideoffnpc "一途な女性#ep16wig01"; //60725
		unittalk "一途な女性 : キャー！　ユルゲン様!!　ユルゲン様!!　愛してます！　こっちを見て！　キャー!!";
		emotion 30, "一途な女性#ep16wig01"; //60725
	}
	end;
OnTimer22000:
	unittalk "ユルゲン・ウィグナー : ああ、あなたはこの前の……なにか御用ですか？";
	end;
OnTimer24000:
	unittalk "一途な女性 : ユルゲン様！　私と一緒になりましょう！　永遠に!!";
	misceffect 343, "一途な女性#ep16wig01"; //60725
	end;
OnTimer26000:
	unittalk "ユルゲン・ウィグナー : うーん、それは困りますね。";
	end;
OnTimer28000:
	hideoffnpc "王宮警備兵#ep16wig03"; //60726
	hideoffnpc "王宮警備兵#ep16wig04"; //60727
	unittalk "王宮警備兵 : ピーッ！　またこいつだ！　捕まえろ！"; //60726
	end;
OnTimer30000:
	unittalk "王宮警備兵 : 毎回毎回、いったいどこから入ってくるんだ！"; //60727
	end;
OnTimer32000:
	unittalk "王宮警備兵 : つまみ出せ！"; //60726
	end;
OnTimer34000:
	unittalk "一途な女性 : あぁんユルゲン様！　また来ます！";
	end;
OnTimer36000:
	hideonnpc "一途な女性#ep16wig01 //60725
	hideonnpc "王宮警備兵#ep16wig03"; //60726
	hideonnpc "王宮警備兵#ep16wig04"; //60727
	end;
OnTimer200000:
	stopnpctimer;
	end;
}
prt_cas_q.gat,94,12,4	script	王宮警備兵#ep16wig03	105,{/* 60674 (hide)*/}
prt_cas_q.gat,95,12,4	script	王宮警備兵#ep16wig04	105,{/* 60675 (hide)*/}
prt_cas_q.gat,98,23,1	script	田舎者の男性#ep16wig01	59,{/* 60676 (hide)*/
	mes "[田舎者の男性]";
	mes "ユルゲン様と握手もできず……";
	mes "あちっ！";
	close;
OnStart:
	if(!getnpctimer(1,"#tltimer")) {
		initnpctimer;
		hideoffnpc "田舎者の男性#ep16wig01"; //60728
		unittalk "田舎者の男性 : ユルゲ……あちーっ!!　あち!!";
	}
	end;
OnTimer22000:
	unittalk "田舎者の男性 : なんでこんなところ出るんだ!?";
	end;
OnTimer24000:
	unittalk "田舎者の男性 : あの女！　変な場所を教えやがって！";
	end;
OnTimer26000:
	unittalk "田舎者の男性 : うあっちいい！";
	unittalk "ユルゲン・ウィグナー : 男性のファンの方なのはわかりますが、私に会うのにこのようなパフォーマンスは必要ありませんよ。でも、すごいですね。";
	end;
OnTimer28000:
	unittalk "田舎者の男性 : あっユルゲンさ……あち！　助け！　ユルゲン様！　握手！";
	end;
OnTimer31000:
	hideoffnpc "王宮警備兵#ep16wig05"; //60729
	hideoffnpc "王宮警備兵#ep16wig06"; //60730
	unittalk "王宮警備兵 : なにごとですか！"; //60730
	end;
OnTimer33000:
	unittalk "王宮警備兵 : んん？　なんでこんなところから人が……とりあえず確保！"; //60729
	end;
OnTimer35000:
	unittalk "王宮警備兵 : まったく世の中には変な人が多い！"; //60730
	end;
OnTimer37000:
	unittalk "王宮警備兵 : つまみ出せ！"; //60729
	end;
OnTimer39000:
	unittalk "田舎者の男性 : あああ！ ユルゲン様ぁ";
	end;
OnTimer41000:
	unittalk "ユルゲン・ウィグナー : 火傷はあとが残らないようしっかり冷やすんだよ～";
	end;
OnTimer43000:
	hideonnpc "田舎者の男性#ep16wig01"; //60728
	hideonnpc "王宮警備兵#ep16wig05"; //60729
	hideonnpc "王宮警備兵#ep16wig06"; //60730
	end;
OnTimer200000:
	stopnpctimer;
	end;
}
prt_cas_q.gat,98,20,7	script	王宮警備兵#ep16wig05	105,{/* 60677 (hide)*/}
prt_cas_q.gat,96,22,7	script	王宮警備兵#ep16wig06	105,{/* 60678 (hide)*/}
prt_cas.gat,107,225,5	script	アイザック・ウィグナー#	10126,3,3,{/* 60679 */
	cutin "16isa.bmp", 1;
	mes "[アイザック]";
	mes "あははは！";
	mes "その表情を見れなかったのは";
	mes "残念ですね！";
	mes "次もそのような場があれば";
	mes "ぜひ私もお招きください。";
	next;
	cutin "16isa.bmp", 255;
	mes "[イザベラ]";
	mes "あら、アイザック様は";
	mes "いつもお忙しくて";
	mes "お招きしても";
	mes "いらっしゃることが";
	mes "できませんでしょう。";
	next;
	mes "[ベアトリス]";
	mes "そうですわ！";
	mes "今のプロンテラで、一番忙しい方の";
	mes "三本の指に入るでしょう。";
	next;
	mes "[ソフィア]";
	mes "ブライアンも";
	mes "アイザック様と一緒。";
	mes "帰ってくるのが";
	mes "いつも深夜ですの。";
	mes "憎らしいですわ。";
	next;
	mes "[ブライアン]";
	mes "いや、それは……";
	next;
	cutin "16isa.bmp", 1;
	mes "[アイザック]";
	mes "おっと！　これはこれは";
	mes "不本意ながら";
	mes "ソフィア様の楽しい時間を";
	mes "奪ってしまってましたか！";
	mes "どうかお許しください。";
	next;
	mes "[アイザック]";
	mes "ですがもうしばらくだけ、";
	mes "ブライアン様をお貸しいただけますか？";
	mes "今の重要な案件が終わったら、";
	mes "すぐソフィア様のために";
	mes "全力を尽くすよう、";
	mes "ブライアン様にお願いしましょう！";
	next;
	cutin "16isa.bmp", 255;
	mes "[ソフィア]";
	mes "あら、その約束、";
	mes "守っていただきますわよ！";
	next;
	cutin "16isa.bmp", 1;
	mes "[アイザック]";
	mes "このアイザック・ウィグナーの";
	mes "名に懸けて。";
	next;
	mes "[イザベラ]";
	mes "その時は、私の招待も";
	mes "お受けになってくださいね。";
	mes "楽しみにしていますわ。";
	cutin "16isa.bmp", 255;
	close;
OnTouch:
	unittalk "アイザック : あははは！　その表情を見れなかったのは残念ですね！";
	end;
}
prt_cas.gat,105,221,1	script	イザベラ#ep16wig	90,{/* 60680 */
	mes "[イザベラ]";
	mes "私は祝宴が大好きです！";
	mes "特に王宮の祝宴は華やかで";
	mes "きらびやかで……！";
	close;
}
prt_cas.gat,105,224,4	script	ベアトリス#ep16wig	91,{/* 60681 */
	mes "[ベアトリス]";
	mes "このような祝宴が開かれると";
	mes "女性はまず他の女性を";
	mes "鋭くチェックしますの。";
	next;
	mes "[ベアトリス]";
	mes "飾りや髪型、ドレスの色。";
	mes "宝石の大きさやカットの形。";
	mes "それこそ猛獣よりもぎらぎらとね。";
	close;
}
prt_cas.gat,107,222,1	script	ソフィア#ep16wig	71,{/* 60682 */
	mes "[ソフィア]";
	mes "久しぶりの王宮はいいですわね。";
	mes "懐かしい顔もいっぱい。";
	mes "でも……";
	next;
	mes "[ソフィア]";
	mes "みなさん、綺麗に着飾っていて";
	mes "とても輝いていますの。";
	mes "　";
	mes "私はもう色あせたかしら……";
	next;
	mes "[ブライアン]";
	mes "そんなことない！";
	mes "君が一番綺麗だよ！";
	mes "だから僕の目には";
	mes "君しか映らないんだ。";
	next;
	mes "[ソフィア]";
	mes "あら、お上手だこと……";
	close;
}
prt_cas.gat,108,223,3	script	ブライアン#ep16wig	995,{/* 60683 */
	mes "[ブライアン]";
	mes "今日はいきなり消えないでくれよ。";
	mes "とても不安になるんだ。";
	next;
	mes "[ソフィア]";
	mes "あら！　私も懐かしい方と";
	mes "お話をしたいですわ。";
	mes "あなたも知り合いの方と";
	mes "楽しんでらっしゃいな。";
	next;
	mes "[ブライアン]";
	mes "……はぁ、";
	mes "僕の知り合いは";
	mes "毎回仕事の話しかしないのだよ。";
	mes "こんな場所でまで";
	mes "したくないのに。";
	next;
	mes "[ソフィア]";
	mes "それじゃ私に";
	mes "ついていらっしゃいな。";
	next;
	mes "[ブライアン]";
	mes "……それもちょっと";
	mes "　";
	mes "女性が多い席は……";
	next;
	mes "[ソフィア]";
	mes "まあ！";
	mes "わがままね。";
	mes "私にだけなら許しますけど！";
	close;
}
prt_cas.gat,84,225,4	script	ルヴィエル・ウィグナー#	10132,{/* 60684 */
	mes "[ルヴィエル]";
	mes "マクシーミリアン様、";
	mes "ご機嫌よろしゅうございますか？";
	mes "ヴォルフ様の話を";
	mes "我が息子、アイザックから";
	mes "度々聞いています。";
	next;
	mes "[マクシーミリアン]";
	mes "おかげさまで。";
	mes "どうぞ一度我が家に";
	mes "訪問してください。";
	mes "お待ちしていますよ。";
	close;
}
prt_cas.gat,85,225,4	script	カタリナ・ウィグナー#ep	71,{/* 60685 */
	mes "[カタリナ]";
	mes "久しぶりの王宮です。";
	mes "色々と変わった気がします。";
	mes "たまには訪れたいのですが……";
	next;
	mes "[ルヴィエル]";
	mes "招待を受ければ";
	mes "良いではないか。";
	mes "訪問はそんなに難しくないよ？";
	next;
	mes "[カタリナ]";
	mes "……そういう話ではないのです。";
	close;
}
prt_cas.gat,85,223,1	script	マクシーミリアン#ep16wi	10133,{/* 60686 */
	mes "[マクシーミリアン]";
	mes "最近、我が家のヴォルフが";
	mes "ウィグナー様のお世話になっていると";
	mes "聞いていますよ。";
	next;
	mes "[ルヴィエル]";
	mes "そんなことは！";
	mes "我が家のアイザックのほうが、";
	mes "レベンブルグ家の聡明さを";
	mes "受け継いだヴォルフ様から";
	mes "色々と学んでいると聞きました。";
	mes "ははは！";
	next;
	mes "[カタリナ]";
	mes "どうかアイザックを";
	mes "よろしくお願いいたします。";
	close;
}
prt_cas.gat,104,231,3	script	祝宴場のお客様#ep16wig0	817,{/* 60687 */
	mes "[祝宴場のお客様]";
	mes "祝宴に来るのは";
	mes "いつも楽しいです！";
	mes "他国の文化に触れ合う";
	mes "機会ですからね！";
	mes "しかも美味しい料理とお酒まで！";
	close;
}
prt_cas.gat,103,232,3	script	祝宴場のお客様#ep16wig0	824,{/* 60688 */
	mes "[祝宴場のお客様]";
	mes "ふぅ……祝宴は疲れます。";
	mes "まだ旅の疲れも癒えてないのに。";
	mes "本当に人が多いですね。";
	close;
}
prt_cas.gat,81,235,3	script	祝宴場のお客様#ep16wig0	478,{/* 60689 */
	mes "[祝宴場のお客様]";
	mes "ルーンミッドガッツ王国の城は";
	mes "大きく華やかですね。";
	mes "異国の情緒を感じられます。";
	mes "ここまで来るのは大変でしたが";
	mes "来てよかったですよ。";
	close;
	}
prt_cas.gat,79,219,7	script	祝宴場のお客様#ep16wig0	583,{/* 60690 */
	mes "[祝宴場のお客様]";
	mes "ああっ！　冒険者様じゃないですか！";
	mes "ポートマラヤにも来てくださいね！";
	mes "みんな歓迎しますよ！";
	close;
}
prt_cas.gat,88,246,7	script	祝宴場のお客様#ep16wig0	839,{/* 60691 */
	mes "[祝宴場のお客様]";
	mes "ここの楽団の演奏は";
	mes "心に響きますね。";
	mes "遠くから来た甲斐があります。";
	close;
}
prt_cas.gat,114,226,5	script	祝宴場のお客様#ep16wig0	537,{/* 60692 */
	mes "[祝宴場のお客様]";
	mes "ここの花ってみんな";
	mes "このように光るのですか？";
	mes "不思議ですね。";
	close;
}
prt_cas.gat,87,231,5	script	祝宴場のお客様#ep16wig0	778,{/* 60693 */
	mes "[祝宴場のお客様]";
	mes "昔、一度だけ";
	mes "王宮に来たことがありますが……";
	mes "ずいぶんと変わりましたね。";
	mes "さらに大きく優雅になりました。";
	next;
	mes "[祝宴場のお客様]";
	mes "今は、国王が空位の状態だなんて";
	mes "言われても信じられませんよ。";
	close;
}
prt_cas.gat,86,251,5	script	祝宴場のお客様#ep16wig0	967,{/* 60694 */
	mes "[祝宴場のお客様]";
	mes "ここは人が多いですね。";
	mes "あまりに多くてめまいがします。";
	mes "でもこういう活気はいいですね。";
	close;
}
prt_cas_q.gat,81,131,0	script	#ep16_1ゲオルグ	139,{/* 60695 */}
prt_cas_q.gat,93,129,3	script	王妃#ep16_1	10121,{/* 60696 */}
prt_cas_q.gat,87,132,3	script	ゲオルグ家守護騎士#ep16	733,{/* 60697 */}
prt_cas_q.gat,85,127,3	script	ゲオルグ家守護騎士#ep16	65,{/* 60698 */}
prt_cas.gat,73,244,5	script	スカーレット・ザハー#ep	71,{/* 60699 */
	mes "[スカーレット・ザハー]";
	mes "あらあら、まあまあ";
	mes "エルンスト王子はどこかしら？";
	mes "姿が見えませんわ。";
	emotion 18;	//60699
	close;
}
prt_cas.gat,82,240,3	script	リディオン・ゲオルグ#ep	923,{/* 60700 */
	mes "[リディオン・ゲオルグ]";
	mes "どこのペコペコの骨とも";
	mes "分からん奴らを";
	mes "出入りさせるから";
	mes "王室の品格が落ちるのだ！";
	close;
}
prt_cas.gat,76,258,0	script	#ep16_1噂話1	139,{/* 60701 */}
prt_cas.gat,84,232,0	script	#ep16_1噂話2	139,{/* 60702 */}
prt_cas.gat,110,242,0	script	#ep16_1噂話3	139,{/* 60703 */}
prt_cas.gat,111,218,0	script	#ep16_1噂話4	139,{/* 60704 */}
prt_cas.gat,92,224,0	script	#ep16_1噂話5	139,{/* 60705 */}
prt_cas.gat,77,223,0	script	#ep16_1噂話6	139,{/* 60706 */}
prt_cas.gat,66,220,3	script	謎の男#ep16_1	985,{/* 60707 (cloaking)*/}
prt_cas.gat,66,217,0	script	#ep16_1噂話7	139,{/* 60708 */}
prt_cas.gat,78,250,5	script	王室料理人#ep16_1	46,{/* 60709 */
	if(EP16_1QUE < 2) {
		mes "[王室料理人]";
		mes "目が回るほど忙しいというが、";
		mes "今、あまりに忙しくて";
		mes "本当に目が回っているんだ！";
		close;
	}
	switch(EP16_2QUE) {
	case 1:
		mes "[王室料理人]";
		mes "急いで厨房に行ってくれ！";
		mes "料理長が暴れる寸前なんだ。";
		close;
	}
	end;
OnTouch:
	if(EP16_2QUE == 0 && EP16_1QUE >= 2) {
		mes "[王室料理人]";
		mes "こんな所に居たのか！";
		mes "何をしていたんだ？";
		emotion 0; //62013
		next;
		mes "[王室料理人]";
		mes "急いで厨房に行ってくれ！";
		mes "料理長が暴れる寸前なんだ。";
		setquest 11394; //state=1
		set EP16_2QUE,1;
		close;
	}
	end;
}
prt_cas.gat,309,200,5	script	王室料理長#ep16_1	10122,{/* 60710 */
	mes "[料理長]";
	mes "もーーー!!";
	mes "一体いつになったら";
	mes "至極の料理人見習いは";
	mes "来るんですかーっ！";
	emotion 6;	//60710
	cutin "ep16cook_king_1.bmp", 2;
	close2;
	cutin "ep16cook_king_1.bmp", 255;
	end;
}
prt_cas.gat,315,204,1	script	料理人#ep16_1	886,{/* 60711 */
	mes "[料理人]";
	mes "私の料理に間違いはない！";
	close;
}
prt_cas.gat,313,204,3	script	料理人#ep16_2	886,{/* 60712 */
	mes "[料理人]";
	mes "あの料理長と一緒に";
	mes "料理を作れるなんて";
	mes "夢のようです！";
	close;
}
prt_cas.gat,313,202,3	script	料理人#ep16_3	886,{/* 60713 */
	mes "[料理人]";
	mes "おいちい!!";
	close;
}
prt_cas.gat,313,200,3	script	料理人#ep16_4	886,{/* 60714 */
	mes "[料理人]";
	mes "私はどっちかといえば……";
	mes "砂糖よりは塩派です！";
	close;
}
prt_cas.gat,313,196,3	script	料理人#ep16_5	886,{/* 60715 */
	mes "[料理人]";
	mes "チューニングの終わりは";
	mes "純正なり。";
	mes "料理の終わりは、";
	mes "結局原材料のそのままの";
	mes "味を楽しむこと……";
	close;
}
prt_cas.gat,313,194,3	script	料理人#ep16_6	886,{/* 60716 */
	mes "[料理人]";
	mes "料理長と～結婚したい～♪";
	unittalk "料理人 : 料理長と～結婚したい～♪";
	close;
}
prt_cas.gat,313,199,0	script	#ep16_ビン	139,4,4,{/* 60717 */
OnTouch:
	mes "[料理長]";
	mes "そこ！";
	mes "邪魔なので下がってなさい！";
	cutin "ep16cook_king_1.bmp", 2;
	close2;
	cutin "ep16cook_king_1.bmp", 255;
	end;
}
prt_cas.gat,319,211,3	script	王室ソース造りの達人#ep	749,{/* 60718 */
	mes "[オリエンタルオイシスター]";
	mes "うむ……この食欲そそる味！";
	mes "正確な配合というのは";
	mes "いつでも美しい……";
	close;
}
prt_cas.gat,303,216,5	script	ムカージュース#ep16_1	10043,{/* 60719 */
	mes "‐みずみずしいムカーを";
	mes "　すりおろして作ったジュース。";
	mes "　爽やかな味がする‐";
	close;
}
prt_cas.gat,308,204,5	script	ポリンゼリー #ep16_1	10042,{/* 60720 */
	mes "‐やわらかいポリンで作ったゼリー。";
	mes "　グニャグニャする食感を";
	mes "　生かしている……‐";
	close;
}
prt_cas.gat,338,206,5	script	光る草#ep16_1	10046,{/* 60721 */
	mes "‐ピカピカと光る草を";
	mes "　すりおろして作った粉。";
	mes "　料理に華麗さをプラスしてくれる‐";
	close;
}
prt_cas.gat,330,211,5	script	ミノタウロスバター#ep16	10044,{/* 60722 */
	mes "‐ミノタウロスの";
	mes "　牛乳で作ったバター。";
	mes "　意外にとてもやわらかい";
	mes "　味がする‐";
	close;
}

prt_cas.gat,302,205,5	script	皿洗い#ep16_1	883,{/* 60738 */
	mes "[皿洗い]";
	mes "くっ……";
	mes "沈まれ、俺の左手の湿疹！";
	unittalk "皿洗い : 沈まれ、俺の左手の湿疹！";
	next;
	mes "[皿洗い]";
	mes "クリーム!!";
	mes "クリームを早く!!";
	unittalk "皿洗い : クリームを早く!!";
	close;
}
prt_cas.gat,358,124,0	script	グリフォン焼き#ep16_1	10131,{/* 60739 */
	mes "‐美味しそうな";
	mes "　グリフォン焼きがある‐";
	close;
}
prt_cas.gat,361,142,5	script	タマリン#ep16_1	10124,{/* 60740 */
	mes "[タマリン]";
	mes "お皿を落としてしまった……";
	unittalk "タマリン : ……はあ";
	emotion 32;	//60740
	cutin "tama_cook_4.bmp", 2;
	close2;
	cutin "tama_cook_4.bmp", 255;
	end;
}
prt_cas.gat,111,235,3	script	テューリアン#ep16_1	628,{/* 60741 */
	if(ECL_1QUE < 6) {
		mes "[テューリアン]";
		mes "お前もここに招待された";
		mes "冒険者だろ？";
		mes "俺もだ。";
		cutin "bu_du1.bmp", 2;
		next;
		mes "[テューリアン]";
		mes "名前は……";
		mes strcharinfo(0)+ "か！";
		mes "よろしくな！";
		next;
		mes "[テューリアン]";
		mes "それにしても";
		mes "すげぇ祝宴だな！";
		mes "料理も美味いんだぜ！";
		mes strcharinfo(0)+ "も、";
		mes "グリフォン焼きは食べたか？";
		next;
		mes "[テューリアン]";
		mes "このワザとらしい鶏肉味！";
		mes "グリフォンがこんなにも";
		mes "美味しいとは思わなかった！";
		mes "まだ食べてないなら、";
		mes "食べたほうがいいぞ！";
		cutin "bu_du2.bmp", 2;
		close2;
		cutin "bu_du2.bmp", 255;
		end;
	}
	mes "[テューリアン]";
	mes "おお……!?";
	mes  strcharinfo(0)+ "!!";
	mes "俺だよ、俺!!";
	mes "久しぶりだなあ！";
	emotion 18; //60793
	cutin "bu_du1.bmp", 2;
	next;
	mes "[テューリアン]";
	mes "それにしても";
	mes "すげぇ祝宴だな！";
	mes "料理も美味いんだぜ！";
	mes  strcharinfo(0)+ "も、";
	mes "グリフォン焼きは食べたか？";
	next;
	mes "[テューリアン]";
	mes "このワザとらしい鶏肉味！";
	mes "グリフォンがこんなにも";
	mes "美味しいとは思わなかった！";
	mes "まだ食べてないなら、";
	mes "食べたほうがいいぞ！";
	cutin "bu_du2.bmp", 2;
	close2;
	cutin "bu_du2.bmp", 255;
	end;
}
prt_cas.gat,111,234,3	script	マギスティン#ep16_1	612,{/* 60742 */
	mes "[マギスティン]";
	mes "あ……こんにちは。";
	cutin "bu_maggi2.bmp", 2;
	close2;
	cutin "bu_maggi2.bmp", 255;
	end;
}
prt_cas.gat,82,268,5	script	マークイシャ#ep16_1	10123,{/* 60743 */
	mes "[マークイシャ]";
	mes "こんにちは。";
	mes "祝宴は楽しんでいますか？";
	mes "何か必要なものはありますか？";
	unittalk "マークイシャ : 祝宴は楽しんでいますか？";
	emotion 2;	//60743
	cutin "mark_wt_4.bmp", 0;
	close2;
	cutin "mark_wt_4.bmp", 255;
	end;
}
prt_cas.gat,341,79,2	script	アルプオカート#ep16_1	615,{/* 60744 */
	mes "[アルプオカート]";
	mes "!!!!";
	mes "この本はあの伝説の……";
	unittalk "アルプオカート : !!!!";
	cutin "bu_alp4.bmp", 2;
	next;
	mes "[アルプオカート]";
	mes "王宮の祝宴だといわれて";
	mes "迷っていたんだが……";
	mes "……来て……よかった……";
	close2;
	cutin "bu_alp4.bmp", 255;
	end;
}
prt_cas.gat,373,57,8	script	オリバー#ep16_1	626,{/* 60745 */
	mes "[オリバー]";
	mes "わぁ！　これも！";
	mes "あれも！　それも！";
	mes "全部あるよ！";
	unittalk "オリバー : やっぱり、王宮だね！";
	cutin "bu_oliver4.bmp", 0;
	next;
	mes "[オリバー]";
	mes "あ、この本は僕も";
	mes "持っていない物だ！";
	next;
	mes "[オリバー]";
	mes "やっぱり王宮は凄いなあ……";
	close2;
	cutin "bu_oliver4.bmp", 255;
	end;
}
prt_cas.gat,76,236,3	script	バゼット#ep16_1	883,{/* 60746 */
	mes "[バゼット]";
	mes "まだ研究しなければならないものが";
	mes "山のように残っているというのに";
	mes "こんな祝宴に連れてこられては困る！";
	next;
	mes "[バゼット]";
	mes "テオレは上手く出来ているのか……";
	mes "不安でしかない。";
	close;
}
prt_cas.gat,97,248,5	script	王宮演奏家#orint	741,{/* 60747 */
	mes "[王宮演奏家オリント]";
	mes "業務中の私語は禁止です。";
	mes "演奏家の私に";
	mes "なにか御用でしょうか。";
	next;
	if(select("一曲お願いします","対話を終える") == 2) {
		mes "‐あなたは";
		mes "　演奏の邪魔になったことを";
		mes "　一言詫びて";
		mes "　彼から離れた‐";
		close;
	}
	misceffect 969, "王宮演奏家#3";	//60749
	mes "[王宮演奏家オリント]";
	switch(rand(14)) {
	case 0:  set '@title$,"<I miss you>";			set '@no$,"04";		break;
	case 1:  set '@title$,"<Marschmallow Waltz>";	set '@no$,"145";	break;
	case 2:  set '@title$,"<Splendide Dreams>";		set '@no$,"128";	break;
	case 3:  set '@title$,"<Jittering Nightmare>";	set '@no$,"160";	break;
	case 4:  set '@title$,"<Alpen Rose>";			set '@no$,"109";	break;
	case 5:  set '@title$,"<Tales of East>";		set '@no$,"115";	break;
	case 6:  set '@title$,"<Theme of Alberta>";		set '@no$,"15";		break;
	case 7:  set '@title$,"<Yuna Song>";			set '@no$,"33";		break;
	case 8:  set '@title$,"<Eclage>";				set '@no$,"155";	break;
	case 9:  set '@title$,"<Dazzling Snow>";		set '@no$,"137";	break;
	case 10: set '@title$,"<Dream of Whale>";		set '@no$,"117";	break;
	case 11: set '@title$,"<One Step Closer>";		set '@no$,"30";		break;
	case 12: set '@title$,"<Not so Far away>";		set '@no$,"74";		break;
	default:
		mes "準備していた曲ではありませんが、";
		mes "今回は私のお気に入りを";
		mes "聞いていただくのはいかがでしょう。";
		next;
		mes "[王宮演奏家オリント]";
		mes "ある島を表現した";
		mes "<Good Morning>を";
		mes "演奏させていただきます。";
		musiceffect "111";
		donpcevent "祝宴場の貴族#4::OnTalk1";
		donpcevent "祝宴場客#5::OnTalk1";
		donpcevent "祝宴場客#6::OnTalk1";
		close;
	}
	mes '@title$+ "を";
	mes "演奏させていただきます。";
	musiceffect '@no$;
	close;
}
prt_cas.gat,95,248,5	script	王宮演奏家#occi	485,{/* 60748 */
	emotion 2;	//60748
	mes "[王宮演奏家オックシー]";
	mes "私とオリントはずっと昔から";
	mes "こういう素敵な場所で";
	mes "合奏するのが夢だったの。";
	mes "ね、オリント？";
	next;
	emotion 9, "王宮演奏家#orint";	//60747
	mes "[王宮演奏家オリント]";
	mes "業務中に私語は禁止だ。";
	next;
	emotion 32;	//60748
	mes "[王宮演奏家オックシー]";
	mes "んもう！　真面目なんだから。";
	mes "でも、そういう所が";
	mes "魅力的なのよね♪";
	close;
}
prt_cas.gat,93,248,5	script	王宮演奏家#3	485,{/* 60749 */
	emotion 18;	//60749
	mes "[王宮演奏家エリー]";
	mes "ドウィット、見て。";
	mes "あの人たち、すごく綺麗……";
	next;
	emotion 33, "王宮演奏家#4";	//60750
	mes "[王宮演奏家ドウィット]";
	mes "確かに美しいご婦人達だ。";
	mes "……でも、この煌びやかな風景は";
	mes "君が一番似合うと思うよ。";
	next;
	mes "[王宮演奏家エリー]";
	mes "え……？";
	next;
	emotion 40;	//60749
	mes "[王宮演奏家ドウィット]";
	mes "エリー、君は美しい。";
	mes "君の踊りはそれこそ";
	mes "大自然に勝るほどに美しい。";
	next;
	mes "[王宮演奏家ドウィット]";
	mes "君が赤いドレスを身にまとえば";
	mes "大輪のバラよりも鮮烈で";
	mes "君が青いドレスを身にまとえば";
	mes "清流よりもたおやかだ。";
	next;
	mes "[王宮演奏家エリー]";
	mes "え……あの……";
	mes "あ、ありがとう……";
	next;
	emotion 2, "王宮演奏家#occi";	//60748
	mes "[王宮演奏家オックシー]";
	mes "あははは！";
	mes "エリーったら顔真っ赤！";
	mes "ところでドウィット、";
	mes "そのドレスを着るのが";
	mes "私だったらどうなの～？";
	next;
	mes "[王宮演奏家ドウィット]";
	mes "オックシー……";
	mes "いくら君達が双子とはいえ";
	mes "私に見分けがつかないとでも";
	mes "思っているのかい？";
	next;
	mes "[王宮演奏家ドウィット]";
	mes "足音はもちろん";
	mes "身のこなしや踊りのクセ、";
	mes "呼吸や鼓動のリズムに至るまで";
	mes "まったくの別物じゃないか。";
	emotion 32, "王宮演奏家#4";	//60750
	close;
}
prt_cas.gat,91,248,5	script	王宮演奏家#4	479,{/* 60750 */
	mes "[王宮演奏家ドウィット]";
	mes "オリントと初めて会った時は";
	mes "禁欲的で、すべてのことに対して";
	mes "無関心なつまらない男だと";
	mes "思ったものだけれど、";
	mes "その後に素晴らしい集中力を";
	mes "持っていると気づいたんだ。";
	next;
	mes "[王宮演奏家ドウィット]";
	mes "常に努力を怠らず、";
	mes "ベストな状態を保っているからこそ";
	mes "あのような旋律を紡げるのだろう。";
	next;
	mes "[王宮演奏家ドウィット]";
	mes "周囲を顧みずに没頭するから";
	mes "それによって誤解を招くことも";
	mes "多いけれどね。";
	next;
	mes "[王宮演奏家ドウィット]";
	mes "とにかく、私たちがこんな場所で";
	mes "演奏することができたのも";
	mes "オリントのお蔭だと思っている。";
	mes "君も聞きたい曲があるなら";
	mes "オリントに頼んでみるといい。";
	close;
}
prt_cas.gat,113,243,3	script	祝宴場の貴族#1	90,{/* 60751 */
	mes "[祝宴場の貴族]";
	mes "私は宴が好きなの。";
	mes "響き渡る音楽、人々が話す声、";
	mes "茶菓を運ぶ侍従たち。";
	mes "この光景を見るために";
	mes "貴族に生まれたようなものよ。";
	close;
}
prt_cas.gat,70,239,5	script	祝宴場の貴族#2	86,{/* 60752 */
	mes "[祝宴場の貴族]";
	mes "宴の主役は別に居るが、";
	mes "私も貴族だ。";
	mes "この機会に良い相手と";
	mes "巡り会えるようにしなくては。";
	close;
}
prt_cas.gat,73,232,5	script	祝宴場の貴族#3	967,{/* 60753 */
	mes "[祝宴場の貴族]";
	mes "君は宴は好きかい？";
	mes "……僕は嫌いだ。";
	mes "両親に連れてこられたけど";
	mes "早く家に帰って寝たいよ。";
	close;
}
prt_cas.gat,72,227,5	script	祝宴場客#1	766,{/* 60754 */
	mes "[祝宴場客]";
	mes "プロンテラで大きな祝宴が";
	mes "開かれると言われてのう。";
	mes "はるばるアマツから来たんじゃ。";
	close;
}
prt_cas.gat,71,227,5	script	祝宴場客#2	763,{/* 60755 */
	mes "[祝宴場客]";
	mes "お爺ちゃん、はしゃぎ過ぎて";
	mes "倒れないでね。";
	close;
}
prt_cas.gat,111,228,3	script	祝宴場客#3	421,{/* 60756 */
	mes "[祝宴場客]";
	mes "ルーンミッドガッツ王国の";
	mes "商権を握っている貴族たちが";
	mes "一同に集まるこの機会を";
	mes "私たち猫の手が";
	mes "見落とせるはずがないにゃ！";
	next;
	mes "[祝宴場客]";
	mes "私の身長と同じくらい";
	mes "長い契約書を";
	mes "手に入れるのにゃ！";
	close;
}
prt_cas.gat,98,248,5	script	猫#ep16bgm	876,{/* 60757 */
	mes "‐猫は演奏家の足にくっつき";
	mes "　まどろんでいる。";
	mes "　あなたには興味がなさそうだ‐";
	close;
}
prt_cas.gat,98,231,5	script	司令官アジフ#ep16	459,{/* 60758 */
	cutin "ep13_captin_edq.bmp", 2;
	mes "[司令官アジフ]";
	mes "ようやくアッシュ・バキュームでの";
	mes "残務が終わって帰ってきたと思ったら";
	mes "今度は宴会に出席させられるとは。";
	next;
	mes "[司令官アジフ]";
	mes "まったく……";
	mes "俺は家で昼寝でもしたいんだがな。";
	next;
	cutin "ep13_captin_edq.bmp", 255;
	mes "[参謀アビダル]";
	mes "気持ちはわかりますが、";
	mes "私たちの功労を労う為の席です。";
	mes "笑顔は崩さないようにしてくださいね。";
	next;
	mes "[教官長イグリド]";
	mes "兄貴～、";
	mes "服も靴も窮屈で苦しいんだが、";
	mes "俺は客室で寝てちゃダメか？";
	next;
	cutin "ep13_captin_edq.bmp", 2;
	mes "[司令官アジフ]";
	mes "諦めろ……";
	mes "ま、どうせ逃げられないなら";
	mes "精一杯楽しむとしよう。";
	close2;
	cutin "ep13_captin_edq.bmp", 255;
	end;
}
prt_cas.gat,100,231,3	script	遠征隊参謀アビダル#ep16	755,{/* 60759 */
	mes "[参謀アビダル]";
	mes "長い間、二つの種族が警戒しあう";
	mes "緊張の中を過ごしていたので";
	mes "こういった場所に来ると、";
	mes "まるで夢の中に居るようです。";
	mes "これが平和というものなのでしょうか？";
	close;
}
prt_cas.gat,97,229,7	script	教官長イグリド#ep16	751,{/* 60760 */
	mes "[教官長イグリド]";
	mes "まったく……";
	mes "本当に俺たちのためだと言うなら";
	mes "ゆっくり休ませるべきだと思わないか？";
	next;
	mes "[教官長イグリド]";
	mes "こんな宴会を喜んでるのは";
	mes "現場を知らない連中だけさ。";
	mes "ま、いつものことだけどな。";
	close;
}
prt_cas.gat,165,245,0	script	調査団員リョースン#ep16	748,{/* 60761 */
	emotion 28;	//60761
	mes "[リョースン]";
	mes "つ、ついに手に入れた！";
	mes "誰も手を付けていない";
	mes "イチゴのケーキ！";
	next;
	mes "[リョースン]";
	mes "遠征隊のキャンプでは";
	mes "ケーキを死守するために";
	mes "どれほどの妨害工作をしていたか……";
	mes "ああ、涙が出そうだ。";
	next;
	mes "[リョースン]";
	mes "イチゴ！　イチゴ！";
	mes "このイチゴのケーキは";
	mes "私のものです！";
	mes "誰にも渡しません！";
	close;
}
prt_cas.gat,99,247,3	script	祝宴場の貴族#4	573,{/* 60762 */
	mes "[祝宴場の貴族]";
	mes "この楽団は実に素晴らしい。";
	mes "私の離宮にも一度招待して";
	mes "パーティーを開いてみよう。";
	close;
OnTalk1:
	unittalk "祝宴場の貴族 : こ、この曲は最高だ!!体に力がみなぎる！";
	end;
}
prt_cas.gat,89,250,5	script	祝宴場客#5	895,{/* 60763 */
	mes "[祝宴場客]";
	mes "私は楽団のオリント様の";
	mes "古くからのファンです。";
	mes "この方の演奏を毎度聞くために";
	mes "どれほどの時間とお金をかけたか。";
	next;
	mes "[祝宴場客]";
	mes "この祝宴の招待状も";
	mes "どれだけ苦労して手に入れたのか";
	mes "知っていますか？";
	mes "数量限定だったので、";
	mes "本当に苦労しました！";
	close;
OnTalk1:
	unittalk "祝宴場客 : プロンテラ王家の繁栄を祝う曲だ、間違いない！";
	end;
}
prt_cas.gat,89,244,7	script	祝宴場客#6	642,{/* 60764 */
	mes "[祝宴場客]";
	mes "この楽団にいる双子の姉妹は";
	mes "性格こそ違うけれど、";
	mes "互いの真似をするのは";
	mes "本当に上手なんだ。";
	next;
	mes "[祝宴場客]";
	mes "二人で一人を演じるときは";
	mes "本当に分身したように";
	mes "錯覚してしまうんだよ。";
	close;
OnTalk1:
	unittalk "祝宴場客 : これを療養中のトリスタン3世様が聞けば病が治るだろう!!";
	end;
}
prt_cas.gat,152,163,0	script	way_to_qroom_L_qroom_L_	45,1,1,{/* 60765 */
OnTouch:
	if(EP16_1QUE < 1) {
		donpcevent "王室守護騎士#02::OnTalk1";
		set '@dummy,sleep2(3000);
		donpcevent "王室守護騎士#02::OnTalk2";
		end;
	}
	warp "prt_cas_q.gat",150,8;
	end;
}
prt_cas_q.gat,154,8,0	warp	qroom_L_to_way_way_to_q	1,1,prt_cas.gat,156,163	//60766

prt_cas.gat,278,163,0	script	way_to_qroom_R_qroom_R_	45,1,1,{/* 60767 */
OnTouch:
	if(EP16_1QUE < 2) {
		donpcevent "王室守護騎士#03::OnTalk1";
		set '@dummy,sleep2(3000);
		donpcevent "王室守護騎士#03::OnTalk2";
		end;
	}
	warp "prt_cas_q.gat",135,119;
	end;
}
prt_cas_q.gat,132,119,0	warp	qroom_R_to_way_way_to_q	1,1,prt_castle.gat,274,163	//60768

prt_cas_q.gat,130,8,0	warp	qroom_vip_in_qroom_vip_	1,1,prt_cas_q.gat,30,28	//60769
prt_cas_q.gat,34,28,0	warp	qroom_vip_out_qroom_vip	1,1,prt_cas_q.gat,134,8	//60770
prt_cas_q.gat,130,32,0	warp	qroom_heine_in_qroom_he	1,1,prt_cas_q.gat,30,78	//60771
prt_cas_q.gat,34,78,0	warp	qroom_heine_out_qroom_h	1,1,prt_cas_q.gat,134,32	//60772
prt_cas_q.gat,130,56,0	warp	qroom_nerius_in_qroom_n	1,1,prt_cas_q.gat,30,128	//60773
prt_cas_q.gat,34,128,0	warp	qroom_nerius_out_qroom_	1,1,prt_cas_q.gat,134,56	//60774
prt_cas_q.gat,130,80,0	warp	qroom_valter_in_qroom_b	1,1,prt_cas_q.gat,30,178	//60775
prt_cas_q.gat,34,178,0	warp	qroom_balter_out_qroom_	1,1,prt_cas_q.gat,134,80	//60776
prt_cas_q.gat,153,119,0	warp	qroom_wigner_in_qroom_w	2,2,prt_cas_q.gat,78,21		//60777
prt_cas_q.gat,74,21,0	warp	qroom_wigner_out_qroom_	2,2,prt_cas_q.gat,149,119	//60778
prt_cas_q.gat,153,143,0	warp	qroom_richard_in_qroom_	2,2,prt_cas_q.gat,78,77		//60779
prt_cas_q.gat,74,77,0	warp	qroom_richard_out_qroom	2,2,prt_cas_q.gat,149,143	//60780
prt_cas_q.gat,153,167,0	warp	qroom_geob_in_qroom_geo	2,2,prt_cas_q.gat,78,131	//60781
prt_cas_q.gat,74,131,0	warp	qroom_geob_out_qroom_ge	2,2,prt_cas_q.gat,149,167	//60782
prt_cas_q.gat,153,191,0	warp	qroom_lugen_in_qroom_lu	2,2,prt_cas_q.gat,78,189	//60783
prt_cas_q.gat,74,189,0	warp	qroom_lugen_out_qroom_l	2,2,prt_cas_q.gat,149,191	//60784
prt_cas.gat,216,184,0	warp	mainhall_in_mainhall_ou	1,1,prt_cas.gat,93,212	//60785
prt_cas.gat,93,208,0	warp	mainhall_out_mainhall_i	1,1,prt_cas.gat,216,180	//60786
prt_cas.gat,197,148,0	warp	guestroom_l1_in_guestro	1,1,prt_cas.gat,31,117	//60787
prt_cas.gat,31,120,0	warp	guestroom_l1_guestroom_	1,1,prt_cas.gat,197,152	//60788
prt_cas.gat,178,148,0	warp	guestroom_l2_in_guestro	1,1,prt_cas.gat,27,43	//60789
prt_cas.gat,27,47,0		warp	guestroom_l2_guestroom_	1,1,prt_cas.gat,178,152	//60790
prt_cas.gat,235,148,0	warp	guestroom_r1_in_guestro	1,1,prt_cas.gat,174,104	//60791
prt_cas.gat,174,108,0	warp	guestroom_r1_guestroom_	1,1,prt_cas.gat,235,152	//60792
prt_cas.gat,253,148,0	warp	guestroom_r2_in_guestro	1,1,prt_cas.gat,174,37	//60793
prt_cas.gat,174,40,0	warp	guestroom_r2_guestroom_	1,1,prt_cas.gat,253,152	//60794
prt_cas.gat,130,218,0	warp	library_in_library_out	1,1,prt_cas.gat,303,48	//60795
prt_cas.gat,300,48,0	warp	library_out_library_in	1,1,prt_cas.gat,127,218	//60796
prt_cas.gat,174,234,0	warp	cruroom_in_cruroom_out	1,1,prt_cas.gat,247,107	//60797
prt_cas.gat,247,111,0	warp	cruroom_out_cruroom_in	1,1,prt_cas.gat,174,237	//60798
prt_cas.gat,41,275,0	warp	cuisine_in_cuisine_out	1,1,prt_cas.gat,320,182	//60799
prt_cas.gat,320,178,0	warp	cuisine_out_cuisine_in	1,1,prt_cas.gat,41,271	//60800
prt_cas.gat,54,217,0	warp	dining_in_dining_out	1,1,prt_cas.gat,388,137	//60801
prt_cas.gat,392,137,0	warp	dining_out_dining_in	1,1,prt_cas.gat,58,217	//60802
prt_cas.gat,216,142,0	warp	cas_out_prt_to_cas	1,1,prontera.gat,156,354	//60803

prt_cas.gat,9,23,4	script	歓迎室管理兵#ep16jp	105,{/* 60813 */
	mes "[歓迎室管理兵]";
	mes "ご協力感謝いたします、冒険者様。";
	mes "この部屋より出られる場合は";
	mes "わたくしめにお申し付けください。";
	mes "ご案内いたします。";
	next;
	if(select("この場に留まる","「プロンテラの街」へ戻る") == 1) {
		mes "[歓迎室管理兵]";
		mes "承知いたしました。";
		mes "何かありましたら";
		mes "お声をお掛けください！";
		close;
	}
	mes "[歓迎室管理兵]";
	mes "承知いたしました。";
	mes "では「プロンテラの街」へと";
	mes "ご案内いたします。";
	close2;
	warp "prontera.gat",117,72;
	end;
}
prt_cas.gat,15,33,4	script	リハルト家訓練官#ep16jp	47,{/* 60814 */
	if(EP16_SUB2 < 3) {
		mes "[リハルト家訓練官]";
		mes "我が主「ポー・リハルト」様には";
		mes "もうお会いになられましたか？";
		next;
		mes "[リハルト家訓練官]";
		mes "主は多くの戦闘経験を持つ";
		mes "冒険者を探しておられます。";
		mes "もしご協力いただけるなら";
		mes "リハルト家の部屋を";
		mes "訪ねてください。";
		close;
	}
	if(EP16_SUB2 == 3) {
		mes "[リハルト家訓練官]";
		mes "ようこそおいでくださいました。";
		mes "執事より話は承っております。";
		delquest 5403;
		while(1) {
			next;
			mes "[リハルト家訓練官]";
			mes "様々な戦闘データを得るため";
			mes "冒険者様には各地にいる";
			mes "^0000ff強者^000000と戦っていただきます。";
			next;
			mes "[リハルト家訓練官]";
			mes "見事強者を打ち倒し、";
			mes "私共に貴重なデータを";
			mes "提供してくださった暁には";
			mes "^0000ff王家貢献の証^000000を差し上げます。";
			next;
			mes "[リハルト家訓練官]";
			mes "^0000ff証^000000は隣の「^0000ffディラン^000000」にて";
			mes "王家御用達の品との";
			mes "^0000ff引き換え^000000ができますので、";
			mes "ぜひご利用ください。";
			next;
			mes "[リハルト家訓練官]";
			mes "現在リハルト家で調査中の";
			mes "強者は次の通りです。";
			next;
			mes "【討伐対象】";
			mes "== ^32cd32サラの記憶^000000 ==";
			mes "・^0000ff大長老アイリン　1体^000000";
			mes "王家貢献の証　5個";
			mes "　";
			mes "== ^32cd32フェイスワームの巣^000000 ==";
			mes "・^0000ffダークフェイスワーム　2体^000000";
			mes "王家貢献の証　10個";
			mes "・^0000ff女王フェイスワーム　1体^000000";
			mes "王家貢献の証　30個";
			mes "※何れかの属性で達成となります";
			mes "　";
			mes "== ^32cd32ゲフェン魔法大会^000000 ==";
			mes "・^0000ffブルート・ハゼ　1体^000000";
			mes "王家貢献の証　5個";
			mes "・^0000ffフェンリル　1体^000000";
			mes "王家貢献の証　5個";
			mes "　";
			mes "== ^32cd32魔神の塔^000000 ==";
			mes "・^0000ff魔神の巨影　1体^000000";
			mes "王家貢献の証　8個";
			mes "　";
			mes "== ^32cd32フェンリルとサラ^000000 ==";
			mes "・^0000ffサラの幻影　1体^000000";
			mes "王家貢献の証　5個";
			mes "　";
			mes "== ^32cd32飛行船襲撃^000000 ==";
			mes "・^0000ff怒りの船長ペルロック　1体^000000";
			mes "王家貢献の証　10個";
			mes "・^0000ff暴走した船長ペルロック　1体^000000";
			mes "王家貢献の証　20個";
			mes "　";
			mes "== ^32cd32呪いの剣士^000000 ==";
			mes "・^0000ff呪いの根源　1体^000000";
			mes "王家貢献の証　3個";
			mes "　";
			mes "== ^32cd32ビオスの島^000000 ==";
			mes "・^0000ff死神アンク　1体^000000";
			mes "王家貢献の証　5個";
			mes "　";
			mes "== ^32cd32モルスの洞窟^000000 ==";
			mes "・^0000ffモルス・ネクロマンサー　1体^000000";
			mes "王家貢献の証　5個";
			mes "　";
			mes "== ^32cd32魔神殿^000000 ==";
			mes "・^0000ff絶望の神モロク　1体^000000";
			mes "王家貢献の証　20個";
			mes "　";
			mes "== ^32cd32侵攻されたプロンテラ^000000 ==";
			mes "・^0000ff不死の軍団兵士長　500体^000000";
			mes "王家貢献の証　5個";
			mes "・^0000ff不死の軍団兵士長　1000体^000000";
			mes "王家貢献の証　5個";
			mes "※各500匹討伐と同時に進行可能です";
			mes "　";
			mes "== ^32cd32プロンテラ地下監獄^000000 ==";
			mes "・^0000ffフローズンウルフ、タフィー　各50体^000000";
			mes "王家貢献の証　30個";
			mes "・^0000ffフローズンウルフ、タフィー　各100体^000000";
			mes "王家貢献の証　30個";
			mes "※各50匹討伐と同時に進行可能です";
			next;
			mes "[リハルト家訓練官]";
			mes "協力していただく際の注意点ですが、";
			mes "リハルト家の家訓として";
			mes "訓練後には十分な休息を";
			mes "しっかり取る事としています。";
			next;
			mes "^FF0000[INFORMATION]";
			mes "討伐クエストは報告後、";
			mes "一定時間は次の報告ができません。";
			mes "また、クエストの受注は";
			mes "報告時に自動的に行われます。^000000";
			next;
			mes "[リハルト家訓練官]";
			mes "説明は以上です。";
			mes "よろしいですか？";
			next;
			if(select("いいえ","はい") == 1) {
				mes "[リハルト家訓練官]";
				mes "それではもう一度";
				mes "ご説明いたします。";
				continue;
			}
			break;
		}
		setquest 97600; //state=1
		setquest 97601; //state=1
		setquest 97602; //state=1
		setquest 97603; //state=1
		setquest 97604; //state=1
		setquest 97605; //state=1
		setquest 97606; //state=1
		setquest 97607; //state=1
		setquest 97608; //state=1
		setquest 97609; //state=1
		setquest 97610; //state=1
		setquest 97611; //state=1
		setquest 97612; //state=1
		setquest 97613; //state=1
		setquest 97614; //state=1
		setquest 97615; //state=1
		setquest 97616; //state=1
		setquest 97617; //state=1
		setquest 97618; //state=1
		setquest 97619; //state=1
		setquest 97620; //state=1
		setquest 97621; //state=1
		setquest 97622; //state=1
		//setquest 73126; //state=1
		//compquest 73126;
		set EP16_SUB2,4;
		mes "[リハルト家訓練官]";
		mes "それではご武運を。";
		mes "お帰りをお待ちしています。";
		close;
	}
	mes "[リハルト家訓練官]";
	mes "お帰りなさいませ、";
	mes strcharinfo(0)+ "様。";
	mes "本日はどうされましたか？";
	next;
	select("訓練の報告をする","訓練の説明","討伐状況の確認","訓練の受注","訓練の取消","やめる")
	case 1:
		mes "[リハルト家訓練官]";
		mes "おや……？";
		mes "報告可能な課題がないようです。";
		mes "もう一度ご確認ください。";
		close;
	case 2:
		mes "[リハルト家訓練官]";
		mes "様々な戦闘データを得るため";
		mes "冒険者様には各地にいる";
		mes "^0000ff強者^000000と戦っていただきます。";
		next;
		mes "[リハルト家訓練官]";
		mes "見事強者を打ち倒し、";
		mes "私共に貴重なデータを";
		mes "提供してくださった暁には";
		mes "^0000ff王家貢献の証^000000を差し上げます。";
		next;
		mes "[リハルト家訓練官]";
		mes "^0000ff証^000000は隣の「^0000ffディラン^000000」にて";
		mes "王家御用達の品との";
		mes "^0000ff引き換え^000000ができますので、";
		mes "ぜひご利用ください。";
		next;
		mes "[リハルト家訓練官]";
		mes "現在リハルト家で調査中の";
		mes "強者は次の通りです。";
		next;
		mes "【討伐対象】";
		mes "== ^32cd32サラの記憶^000000 ==";
		mes "・^0000ff大長老アイリン　1体^000000";
		mes "王家貢献の証　5個";
		mes "　";
		mes "== ^32cd32フェイスワームの巣^000000 ==";
		mes "・^0000ffダークフェイスワーム　2体^000000";
		mes "王家貢献の証　10個";
		mes "・^0000ff女王フェイスワーム　1体^000000";
		mes "王家貢献の証　30個";
		mes "※何れかの属性で達成となります";
		mes "　";
		mes "== ^32cd32ゲフェン魔法大会^000000 ==";
		mes "・^0000ffブルート・ハゼ　1体^000000";
		mes "王家貢献の証　5個";
		mes "・^0000ffフェンリル　1体^000000";
		mes "王家貢献の証　5個";
		mes "　";
		mes "== ^32cd32魔神の塔^000000 ==";
		mes "・^0000ff魔神の巨影　1体^000000";
		mes "王家貢献の証　8個";
		mes "　";
		mes "== ^32cd32フェンリルとサラ^000000 ==";
		mes "・^0000ffサラの幻影　1体^000000";
		mes "王家貢献の証　5個";
		mes "　";
		mes "== ^32cd32飛行船襲撃^000000 ==";
		mes "・^0000ff怒りの船長ペルロック　1体^000000";
		mes "王家貢献の証　10個";
		mes "・^0000ff暴走した船長ペルロック　1体^000000";
		mes "王家貢献の証　20個";
		mes "　";
		mes "== ^32cd32呪いの剣士^000000 ==";
		mes "・^0000ff呪いの根源　1体^000000";
		mes "王家貢献の証　3個";
		mes "　";
		mes "== ^32cd32ビオスの島^000000 ==";
		mes "・^0000ff死神アンク　1体^000000";
		mes "王家貢献の証　5個";
		mes "　";
		mes "== ^32cd32モルスの洞窟^000000 ==";
		mes "・^0000ffモルス・ネクロマンサー　1体^000000";
		mes "王家貢献の証　5個";
		mes "　";
		mes "== ^32cd32魔神殿^000000 ==";
		mes "・^0000ffブリナラネア　1体^000000";
		mes "王家貢献の証　10個";
		mes "・^0000ffムスペルスコール　1体^000000";
		mes "王家貢献の証　10個";
		mes "・^0000ff絶望の神モロク　1体^000000";
		mes "王家貢献の証　20個";
		mes "　";
		mes "== ^32cd32侵攻されたプロンテラ^000000 ==";
		mes "・^0000ff不死の軍団兵士長　500体^000000";
		mes "王家貢献の証　5個";
		mes "・^0000ff不死の軍団兵士長　1000体^000000";
		mes "王家貢献の証　5個";
		mes "※各500匹討伐と同時に進行可能です";
		mes "　";
		mes "== ^32cd32プロンテラ地下監獄^000000 ==";
		mes "・^0000ffフローズンウルフ、タフィー　各50体^000000";
		mes "王家貢献の証　30個";
		mes "・^0000ffフローズンウルフ、タフィー　各100体^000000";
		mes "王家貢献の証　30個";
		mes "※各50匹討伐と同時に進行可能です";
		next;
		mes "[リハルト家訓練官]";
		mes "協力していただく際の注意点ですが、";
		mes "リハルト家の家訓として";
		mes "訓練後には十分な休息を";
		mes "しっかり取る事としています。";
		next;
		mes "^FF0000[INFORMATION]";
		mes "討伐クエストは報告後、";
		mes "一定時間は次の報告ができません。";
		mes "また、クエストの受注は";
		mes "報告時に自動的に行われます。^000000";
		next;
		mes "[リハルト家訓練官]";
		mes "説明は以上です。";
		close;
case 3:
		mes "[リハルト家訓練官]";
		mes strcharinfo(0)+ "様の";
		mes "達成状況は次の通りです。";
		next;
		mes "【^ff0000討伐対象^000000】";
		mes "== ^32cd32サラの記憶^000000 ==";
		mes "・^0000ff大長老アイリン^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32フェイスワームの巣^000000 ==";
		mes "・^0000ffダークフェイスワーム^000000";
		mes "^0000ff挑戦中^000000";
		mes "・^0000ff女王フェイスワーム^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32ゲフェン魔法大会^000000 ==";
		mes "・^0000ffブルート・ハゼ^000000";
		mes "^0000ff挑戦中^000000";
		mes "・^0000ffフェンリル^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32魔神の塔^000000 ==";
		mes "・^0000ff魔神の巨影^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32フェンリルとサラ^000000 ==";
		mes "・^0000ffサラの幻影^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32飛行船襲撃^000000 ==";
		mes "・^0000ff怒りの船長ペルロック^000000";
		mes "^0000ff挑戦中^000000";
		mes "・^0000ff暴走した船長ペルロック^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32呪いの剣士^000000 ==";
		mes "・^0000ff呪いの根源^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32ビオスの島^000000 ==";
		mes "・^0000ff死神アンク^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32モルスの洞窟^000000 ==";
		mes "・^0000ffモルス・ネクロマンサー^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32魔神殿^000000 ==";
		mes "・^0000ffブリナラネア^000000";
		mes "^0000ff挑戦中^000000";
		mes "・^0000ffムスペルスコール^000000";
		mes "^0000ff挑戦中^000000";
		mes "・^0000ff絶望の神モロク^000000";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32侵攻されたプロンテラ^000000 ==";
		mes "・^0000ff不死の軍団兵士長^000000";
		mes "　（各500匹討伐）";
		mes "^0000ff挑戦中^000000";
		mes "・^0000ff不死の軍団兵士長^000000";
		mes "　（各1000匹討伐）";
		mes "^0000ff挑戦中^000000";
		mes "　";
		mes "== ^32cd32プロンテラ地下監獄^000000 ==";
		mes "・^0000ffフローズンウルフ、タフィー^000000";
		mes "　（各50匹討伐）";
		mes "^0000ff挑戦中^000000";
		mes "・^0000ffフローズンウルフ、タフィー^000000";
		mes "　（各100匹討伐）";
		mes "^0000ff挑戦中^000000";
		close;
	case 4:
		mes "[リハルト家訓練官]";
		mes strcharinfo(0)+ "様は既に";
		mes "全ての訓練を受注しております。";
		next;
		mes "[リハルト家訓練官]";
		mes "^ff0000ご報告いただいた訓練は^000000";
		mes "^ff0000私の方で報告と同時に受注の手続きを^000000";
		mes "^ff0000取らせていただきます。^000000";
		mes "そのため、受注の手続きは不要です。";
		next;
		mes "[リハルト家訓練官]";
		mes "「^0000ff訓練の受注^000000」は";
		mes "取り消した訓練を";
		mes "再度受注される際にご利用ください。";
		close;
	case 5:
		mes "[リハルト家訓練官]";
		mes "どの訓練を取消しますか？";
		next;
		select("全ての討伐クエストを取り消す:^0000ff大長老アイリン^000000:^0000ffダークフェイスワーム^000000:^0000ff女王フェイスワーム^000000:^0000ffブルート・ハゼ^000000:^0000ffフェンリル^000000:^0000ff魔神の巨影^000000:^0000ffサラの幻影^000000:^0000ff怒りの船長ペルロック^000000:^0000ff暴走した船長ペルロック^000000:^0000ff呪いの根源^000000:^0000ff死神アンク^000000:^0000ffモルス・ネクロマンサー^000000:^0000ffブリナラネア^000000:^0000ffムスペルスコール^000000:^0000ff絶望の神モロク^000000:^0000ff不死の軍団兵士長(500体)^000000:^0000ff不死の軍団兵士長(1000体)^000000:^0000ffフローズンウルフ、タフィー(各50体)^000000:^0000ffフローズンウルフ、タフィー(各100体)^000000:やめる")
		close;
	case 6:
		mes "[リハルト家訓練官]";
		mes "そうですか。";
		mes "気が変わったらまた来てください。";
		close;
	}
}
prt_cas.gat,18,33,4	script	ディラン#ep16jp	734,{/* 60815 */
	mes "[ディラン]";
	mes "ようこそお越しくださいました、";
	mes strcharinfo(0)+ "様。";
	mes "本日はどのようなご用件ですか？";
	next;
	switch(select("ニーヴエンチャント","エンチャントについて","王家貢献の証で交換","証の交換ラインナップを見る","立ち去る")) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		mes "[ディラン]";
		mes "ご利用ありがとうございました。";
		mes "またのお越しを";
		mes "お待ちしております。";
		close;
	}
}
prt_cas.gat,21,33,4	script	ニルレムの助手#ep16jp	893,{/* 60816 */
	mes "[ニルレムの助手]";
	mes "こちらでは、時魔術師のローブの";
	mes "時を戻したり、エンチャントを";
	mes "行う事ができます。";
	next;
	switch(select("^888888時魔術師のローブの交換^000000","^888888時魔術師のローブの時を戻す^000000","^888888超越者のローブエンチャント^000000","時魔術師のローブについて聞く","超越者のローブについて聞く","やめる")) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[ニルレムの助手]";
		mes "気が変わったら来てください。";
		mes "いつでもお待ちしています。";
		close;
	}
}
prt_cas.gat,27,16,4	script	モンスター研究家#ep16jp	866,{/* 60817 */
	if(!(checkquest(73130) & 0x8)) {
		mes "[モンスター研究家]";
		mes "私は^0000ffパワフルモンスター^000000と呼ばれる";
		mes "^0000ff希少種^000000の研究をしている者です。";
		next;
		mes "[モンスター研究家]";
		mes "パワフルモンスターは";
		mes "通常のモンスターと";
		mes "色や大きさが異なり、";
		mes "強力な力を持っています。";
		next;
		mes "[モンスター研究家]";
		mes "王国内ではスケルトンや";
		mes "アーチャースケルトンなどの";
		mes "希少種が確認されており、";
		mes "何れも通常のそれに比べて";
		mes "強いモンスターでした。";
		next;
		mes "[モンスター研究家]";
		mes "パワフルモンスターは";
		mes "その力だけでなく、";
		mes "^0000ffカードもより強力な^000000";
		mes "^0000ff効果を持つといいます。^000000";
		next;
		mes "[モンスター研究家]";
		mes "しかし、パワフルモンスターは";
		mes "希少種のため滅多に";
		mes "出会うことが出来ません。";
		mes "そのためカードの入手は";
		mes "困難を極めます。";
		next;
		mes "[モンスター研究家]";
		mes "しかし、私は長年の研究の末、";
		mes "ついにパワフルモンスターの";
		mes "カードを作りだすことに";
		mes "成功したのです。";
		next;
		mes "[モンスター研究家]";
		mes "パワフルモンスターのカードは";
		mes "^0000ff通常のモンスターのカードを^000000";
		mes "^0000ff複数枚重ね、ルーンの力で^000000";
		mes "^0000ff圧縮することによって生成できます。^000000";
		next;
		mes "[モンスター研究家]";
		mes "もし興味があれば";
		mes "私のところにカードと";
		mes "「^0000ffルーン魔法の粉^000000」を";
		mes "持ってきてください。";
		mes "例え装着済みでも";
		mes "圧縮してあげますよ。";
		setquest 73130;
		compquest 73130;
		close;
	}
	mes "[モンスター研究家]";
	mes "ようこそいらっしゃいました。";
	mes "本日はどのようなご用件ですか？";
	next;
	switch(select("パワフルカードの生成","装着済みのカードのアップグレード","パワフルカードの性能を見る","やめる")) {
	case 1:
	case 2:
	case 3:
	case 4:
		mes "[モンスター研究家]";
		mes "わかりました。";
		mes "必要になったらまた来てください。";
		close;
	}
}
prt_cas.gat,27,24,3	script	マジシャン・ニルレム#ep	735,{/* 60818 (cloaking)*/}
prt_cas.gat,27,27,3	script	グラハム#ep16jp	86,{/* 60819 */
	if(EP16_1QUE < 2) {
		mes "[グラハム]";
		mes "冒険者歓迎室は";
		mes "各街に居る^0000ff王室急使^000000によって";
		mes "招かれた方へのサービスを";
		mes "行う部屋です。";
		next;
		mes "[グラハム]";
		mes "魔王モロクの遠征と討伐に";
		mes "貢献した英雄の方は";
		mes "王室急使に申し出ていただければ";
		mes "祝宴に^4d4dff貴賓としてご招待^000000";
		mes "いたします。";
		close;
	}
	if(!(chackquest(73131) & 0x8)) {
		mes "[グラハム]";
		mes strcharinfo(0)+ "様。";
		mes "お待ちしておりました。";
		next;
		mes "[グラハム]";
		mes "冒険者歓迎室では";
		mes "ここでの生活に不便がないよう";
		mes "傷の治療や倉庫の管理などの";
		mes "お世話をさせていただきますので、";
		mes "何なりとお申し付けください。";
		close2;
		setquest 73131; //state=1
		compquest 73131;
		end;
	}
	mes "[グラハム]";
	mes "ようこそお越しくださいました、";
	mes strcharinfo(0)+ "様。";
	mes "本日はいかがいたしましょう？";
	next;
	switch(select("位置セーブサービス:倉庫サービス -> 50zeny:傷の治療 -> 5000zeny:^888888転送サービス -> 無料^000000:カートサービス -> 800zeny:終了")) {
	case 2:
		mes "[グラハム]";
		mes "倉庫を開きます。";
		set Zeny,Zeny-50;
		openstorage;
		close;
	case 4:
		mes "[グラハム]";
		mes "転送サービスには宮廷マジシャンを";
		mes "呼び出す権利が必要です。";
		mes "権利を獲得しましたら";
		mes "再度お声かけください。";
		close;
	}
}

/*
@spawn(type: BL_MOB, ID: 60732, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(387, 134), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60726, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(378, 127), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60736, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(379, 148), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60730, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(381, 123), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60727, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(383, 134), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60732, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(387, 134), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60726, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(378, 127), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60736, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(379, 148), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60730, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(381, 123), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60727, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(383, 134), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60729, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(383, 154), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60734, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(375, 154), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60731, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(365, 157), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60737, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(364, 153), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60733, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(356, 150), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60728, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(353, 154), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60724, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(358, 127), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60735, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(360, 126), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60723, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(356, 124), dir: 0, name: "とても高級なお皿")
@spawn(type: BL_MOB, ID: 60725, speed: 2000, option: 0, view: 3455, pos: "prt_cas.gat"(366, 123), dir: 0, name: "とても高級なお皿")
*/

prt_cas_q.gat,90,186,5	script	マクシーミリアン#ep16lu	10133,{/* 60564 */}
prt_cas_q.gat,88,184,0	script	#ep16lug004	139,{/* 60565 */}
prt_cas_q.gat,90,184,7	script	ヘルムト・レベンブルグ#	10127,{/* 60566 */}
prt_cas_q.gat,86,180,7	script	カルベルン#ep16lug	962,{/* 60567 */}
prt_cas_q.gat,96,186,3	script	ヴォルフ・レベンブルグ#	10128,{/* 60568 */}
prt_cas_q.gat,92,182,7	script	マイアー・レベンブルグ#	10129,{/* 60569 (cloaking)*/}
prt_cas_q.gat,96,184,1	script	アグネス・レベンブルグ#	10130,{/* 60570 */}


