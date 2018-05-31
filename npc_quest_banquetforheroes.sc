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
		if(checkquest(201730)) {
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
	if(!(checkquest(5415) & 0x8)) {
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
		emotion 32, "ビッグフットマン#ep16wa"; //60704
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
	switch(select("地下監獄に行く:地下監獄について:囚人について:似たような奴らを見たような気がする")) {
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

prt_cas_q.gat,80,80,4	script	リハルト家執事#EP161GAM	57,{/* 60566 */}
prt_cas_q.gat,93,74,4	script	ポー・リハルト#EP161GAM	993,{/* 60567 */}
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
	case Job_Oboro:			unittalk "侍従 : 揺るぎない信念のマスター" +strcharinfo(0)+ "様です。";	break;
	case Job_ArchBishop:	unittalk "侍従 : 大いなる神の代理人" +strcharinfo(0)+ "様です。";	break;
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
		initnpctimer;
		pcblockmove 1;
		donpcevent "守護騎士#ep16_prigate01::OnTalk1";
	}
	warp "prt_pri00.gat",54,134;
	end;
OnTimer3000:
	pcblockmove 0;
	warp "prt_cas.gat",182,258;
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
	initnpctimer;
	unittalk "守護騎士 : 勤務中、異常なし……";
	end;
OnTimer3000:
	stopnpctimer;
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
	switch(EP16_1QUE) {
	case 1:
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
		end;
	}
	end;
OnTalk1:
	unittalk "侍従ベル : お待ちしていました。" +strcharinfo(0)+ " 様。";
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
	switch(EP16_1QUE) {
	case 1:
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
		end;
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
	switch(EP16_1QUE) {
	case 1:
		mes "[侍従ベル]";
		mes "詳しい内容につきましては";
		mes "ご入室後に";
		mes "説明させていただきます。";
		mes "どうぞ、お入りください。";
		close2;
		cloakonnpc "侍従ベル#ep16_03";
		end;
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
		if(checkquest(201730)) {
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
		mes "ハイネン家";
		mes "ネリウス家";
		mes "リハルト家";
		mes "バルター家";
		mes "ウィグナー家";
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

prt_cas_q.gat,82,21,1	script	ルヴィエル・ウィグナー#	10132,{/* 60654 */}
prt_cas_q.gat,82,23,0	script	カタリナ・ウィグナー#ep	71,{/* 60655 */}
prt_cas_q.gat,80,23,5	script	ユルゲン・ウィグナー#ep	989,{/* 60656 (cloaking)*/}
prt_cas_q.gat,95,9,5	script	ユルゲン・ウィグナー#ep	989,{/* 60657 */}
prt_cas_q.gat,96,7,1	script	カトリン・ウィグナー#ep	10125,{/* 60658 */}
prt_cas_q.gat,90,16,0	script	#ep16wig004	139,{/* 60659 */}
prt_cas_q.gat,94,7,7	script	アイザック・ウィグナー#	10126,{/* 60660 */}
prt_cas_q.gat,93,10,4	script	メイド#ep16wig01	69,{/* 60661 (cloaking)*/}
prt_cas.gat,322,216,5	script	メイド#ep16wig02	69,{/* 60662 */
	mes "[メイド]";
	mes "フフフ～ン♪";
	mes "お掃除、お掃除～♪";
	mes "めんどくさいね～♪";
	close;
}
prt_cas.gat,339,212,5	script	暗く湿った壁#ep16wig	111,{/* 60663 */
	end;
}
prt_cas.gat,339,198,5	script	べとべとした壁#ep16wig	111,{/* 60664 */
	end;
}
prt_cas.gat,309,215,5	script	真っ黒な床#ep16wig	111,{/* 60665 */
	end;
}
prt_cas_q.gat,150,122,4	script	恋する女性#ep16wig	71,{/* 60666 */
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
prt_cas_q.gat,148,122,4	script	一途な女性#ep16wig	68,{/* 60667 */
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
prt_cas_q.gat,148,117,7	script	お嬢様な女性#ep16wig	91,{/* 60668 */
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
prt_cas_q.gat,150,117,7	script	端整な女性#ep16wig	90,{/* 60669 */
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
prt_cas_q.gat,146,121,4	script	田舎者の男性#ep16wig	59,{/* 60670 */
	emotion 28; //60722
	mes "[田舎者の男性]";
	mes "ここの女性たちは怖いです……";
	mes "暴言は吐くし、列は乱すし……";
	next;
	switch(select("もう帰ったら？:がんばれ")) {
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
prt_cas_q.gat,95,11,4	script	一途な女性#ep16wig01	68,{/* 60673 (hide)*/}
prt_cas_q.gat,94,12,4	script	王宮警備兵#ep16wig03	105,{/* 60674 (hide)*/}
prt_cas_q.gat,95,12,4	script	王宮警備兵#ep16wig04	105,{/* 60675 (hide)*/}
prt_cas_q.gat,98,23,1	script	田舎者の男性#ep16wig01	59,{/* 60676 (hide)*/}
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
	mes "[王室料理人]";
	mes "目が回るほど忙しいというが、";
	mes "今、あまりに忙しくて";
	mes "本当に目が回っているんだ！";
	close;
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
		initnpctimer;
		pcblockmove 1;
		donpcevent "王室守護騎士#02::OnTalk1";
		end;
	}
	warp "prt_cas_q.gat",150,8;
	end;
OnTimer3000:
	pcblockmove 0;
	donpcevent "王室守護騎士#02::OnTalk2";
	end;
}

prt_cas_q.gat,154,8,0	warp	qroom_L_to_way_way_to_q	1,1,prt_cas.gat,156,163	//60766

prt_cas.gat,278,163,0	script	way_to_qroom_R_qroom_R_	45,1,1,{/* 60767 */
OnTouch:
	if(EP16_1QUE < 1) {
		initnpctimer;
		pcblockmove 1;
		donpcevent "王室守護騎士#03::OnTalk1";
		end;
	}
	warp "prt_cas_q.gat",150,8;
	end;
OnTimer3000:
	pcblockmove 0;
	donpcevent "王室守護騎士#03::OnTalk2";
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


