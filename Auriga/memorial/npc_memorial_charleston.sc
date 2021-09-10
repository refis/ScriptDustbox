verus04.gat,63,112,5	script	量産型チャールストン#3	10053,{/* 59481 */
	cutin "dalle03",2;
	mes "[量産型チャールストン]";
	mes "オ客様ヲ確認シマシタ。";
	mes "言語ヲ営業モードニ切リ替エマス。";
	next;
	cutin "dalle01",2;
	mes "[量産型チャールストン]";
	mes "今！　巷で話題沸騰中！";
	mes "チャールストン工場の技術で";
	mes "装備のアップグレードが出来る！";
	next;
	mes "[量産型チャールストン]";
	mes "なんと！";
	mes "今なら素材を持ってくるだけで";
	mes "無料でアップグレード出来ちゃいます！";
	next;
	switch(select("やめる","話を聞く","アップグレードについて聞く","アップグレードする")) {
	case 1:
		mes "[量産型チャールストン]";
		mes "ではまたお会いしましょう。";
		close2;
		cutin "dalle01",255;
		end;
	case 2:
		mes "[量産型チャールストン]";
		mes "私は工場で大量生産された";
		mes "ナンバリングもされていない";
		mes "量産型チャールストンです。";
		next;
		mes "[量産型チャールストン]";
		mes "本当はもっと多くの仲間が";
		mes "居たのですが、";
		mes "工場を脱出する際の戦闘で";
		mes "みんな破壊されてしまいました。";
		close2;
		cutin "dalle01",255;
		end;
	case 3:
		mes "[量産型チャールストン]";
		mes "アップグレードで完成する装備は";
		mes "トルネードアックス[1]";
		mes "ギロチンブレード[3]です。";
		next;
		mes "[量産型チャールストン]";
		mes "どの装備について";
		mes "ご説明しましょうか？";
		mes "　";
		mes "‐^ff0000一部、確認に";
		mes "　画面のスクロールが必要です^000000‐";
		while(1) {
			next;
			switch(select("やめる","トルネードアックス[1]","ギロチンブレード[3]","パイルバンカーS[3]","パイルバンカーP[3]","パイルバンカーT[3]")) {
			case 1:
				mes "[量産型チャールストン]";
				mes "ではまたお会いしましょう。";
				close2;
				cutin "dalle01",255;
				end;
			case 2:
				mes "【トルネードアックス[1]】";
				mes "中型モンスターから";
				mes "受けるダメージ - 10%";
				mes "―――――――――――――";
				mes "[アックストルネード]の";
				mes "再使用待機時間 - 1秒";
				mes "―――――――――――――";
				mes "[トルネードアックス]の";
				mes "精錬値が1上がる度に追加で";
				mes "中型モンスターから";
				mes "受けるダメージ - 1%";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "系列 : ^777777両手斧^000000";
				mes "攻撃 : ^777777320^000000";
				mes "重量 : ^777777400^000000";
				mes "属性 : ^777777風^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777100^000000";
				mes "装備 : ^7777773次職ソードマン系 3次職マーチャント系^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000ハリケーンフューリー[1]1個^000000";
				mes "^FF0000ウィンドホーク[0]1個^000000";
				mes "^ff0000透明な板（風）50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			case 3:
				mes "【ギロチンブレード[3]】";
				mes "人間形モンスターに";
				mes "攻撃命中時、SP + 1";
				mes "―――――――――――――";
				mes "近接物理攻撃で";
				mes "人間形モンスターを倒した時";
				mes "SP + 1";
				mes "―――――――――――――";
				mes "[ギロチンブレード]の";
				mes "精錬値が7以上の時、";
				mes "精錬値が1上がる度に追加で";
				mes "近接物理攻撃で";
				mes "人間形モンスターを倒した時";
				mes "SP + 1";
				mes "―――――――――――――";
				mes "[ギロチンブレード]の";
				mes "精錬値が10の時、追加で";
				mes "人間形モンスターの";
				mes "防御力を無視";
				mes "人間形モンスターに";
				mes "攻撃命中時、SP + 1";
				mes "近接物理攻撃で";
				mes "人間形モンスターを倒した時";
				mes "SP + 10";
				mes "―――――――――――――";
				mes "系列 : ^777777両手剣^000000";
				mes "攻撃 : ^777777200^000000";
				mes "重量 : ^777777350^000000";
				mes "武器レベル : ^7777772^000000";
				mes "要求レベル : ^777777100^000000";
				mes "装備 : ^777777ルーンナイト^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000ギロチン[0]1個^000000";
				mes "^FF0000エッジ[0]1個^000000";
				mes "^FF0000執行人の手袋50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			case 4:
				mes "【パイルバンカーS[3]】";
				mes "物理攻撃命中時、一定確率で";
				mes "敵を氷結状態にする";
				mes "―――――――――――――";
				mes "[パイルバンカーS]の";
				mes "精錬値が7以上の時、";
				mes "精錬値が1上がる度に";
				mes "物理攻撃命中時、";
				mes "敵を氷結状態にする";
				mes "確率が上昇";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]";
				mes "使用時、敵を凍結状態にする";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]の";
				mes "再使用待機時間 + 5秒";
				mes "―――――――――――――";
				mes "系列 : ^777777鈍器^000000";
				mes "攻撃 : ^77777750^000000";
				mes "重量 : ^777777350^000000";
				mes "属性 : ^777777水^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777130^000000";
				mes "装備 : ^777777メカニック^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000パイルバンカー[0]1個^000000";
				mes "^FF0000透明な板（水）10個^000000";
				mes "^FF0000紋章の欠片1　50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			case 5:
				mes "【パイルバンカーP[3]】";
				mes "物理攻撃命中時、一定確率で";
				mes "敵を呪い状態にする";
				mes "―――――――――――――";
				mes "[パイルバンカーP]の";
				mes "精錬値が7以上の時、";
				mes "精錬値が1上がる度に";
				mes "物理攻撃命中時、";
				mes "敵を呪い状態にする";
				mes "確率が上昇";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]";
				mes "使用時、敵を石化状態にする";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]の";
				mes "再使用待機時間 + 5秒";
				mes "―――――――――――――";
				mes "系列 : ^777777鈍器^000000";
				mes "攻撃 : ^77777750^000000";
				mes "重量 : ^777777350^000000";
				mes "属性 : ^777777地^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777130^000000";
				mes "装備 : ^777777メカニック^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000パイルバンカー[0]1個^000000";
				mes "^FF0000透明な板（地）10個^000000";
				mes "^FF0000紋章の欠片3　50個^000000";
				mes "が必要です。";
				mes "他の装備もみてみますか？";
				continue;
			case 6:
				mes "【パイルバンカーT[3]】";
				mes "必中攻撃 + 20%";
				mes "―――――――――――――";
				mes "[パイルバンカーT]の";
				mes "精錬値が7以上の時、追加で";
				mes "必中攻撃 + 30%";
				mes "―――――――――――――";
				mes "[ブーストナックル]使用時、";
				mes "一定確率で1秒間、";
				mes "物理攻撃命中時、";
				mes "一定確率で";
				mes "敵を麻痺状態にする";
				mes "―――――――――――――";
				mes "系列 : ^777777鈍器^000000";
				mes "攻撃 : ^77777750^000000";
				mes "重量 : ^777777350^000000";
				mes "属性 : ^777777風^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777130^000000";
				mes "装備 : ^777777メカニック^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000パイルバンカー[0]1個^000000";
				mes "^FF0000透明な板（風）10個^000000";
				mes "^FF0000紋章の欠片2　50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			}
		}
	case 4:
		mes "[量産型チャールストン]";
		mes "アップグレードですね。";
		mes "どれもオススメの超ウルトラ装備です！";
		mes "また、注意事項として";
		mes "^FF0000精錬値や装着されたカードは^000000";
		mes "^FF0000アップグレードを行うと^000000";
		mes "^FF0000失われてしまいます。^000000";
		next;
		mes "[量産型チャールストン]";
		mes "^FF0000もし材料となる装備を複数持っていた場合";
		mes "^FF0000どれを合成に使うかは選択できません。^000000";
		mes "材料以外はすべて倉庫に預けるなど";
		mes "してから、アップグレードを";
		mes "行ってください。";
		mes "どれにアップグレードしますか？";
		next;
		switch(select("やめる","トルネードアックス[1]","ギロチンブレード[3]","パイルバンカーS[3]","パイルバンカーP[3]","パイルバンカーT[3]")) {
		case 1:
			mes "[量産型チャールストン]";
			mes "ではまたお会いしましょう。";
			close2;
			cutin "dalle01",255;
			end;
		case 2:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000ハリケーンフューリー[1]1個^000000";
			mes "^FF0000ウィンドホーク[0]1個^000000";
			mes "^ff0000透明な板（風）50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にトルネードアックスへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000ハリケーンフューリー[1]1個^000000";
			mes "^FF0000ウィンドホーク[0]1個^000000";
			mes "^ff0000透明な板（風）50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 3:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000ギロチン[0]1個^000000";
			mes "^FF0000エッジ[0]1個^000000";
			mes "^FF0000執行人の手袋50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にギロチンブレードへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000ギロチン[0]1個^000000";
			mes "^FF0000エッジ[0]1個^000000";
			mes "^FF0000執行人の手袋50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 4:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（水）10個^000000";
			mes "^FF0000紋章の欠片1　50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にパイルバンカーSへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（水）10個^000000";
			mes "^FF0000紋章の欠片1　50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 5:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（地）10個^000000";
			mes "^FF0000紋章の欠片3　50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にパイルバンカーPへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（地）10個^000000";
			mes "^FF0000紋章の欠片3　50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 6:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（風）10個^000000";
			mes "^FF0000紋章の欠片2　50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にパイルバンカーTへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（風）10個^000000";
			mes "^FF0000紋章の欠片2　50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		}
	}
OnInit:
	waitingroom "装備アップグレード",0; //59481
	end;
}

verus04.gat,66,109,5	script	量産型チャールストン#1	10053,{/* 59231 */
	cutin "dalle01",2;
	mes "[量産型チャールストン]";
	mes "どこで手に入るかはわかりませんが……";
	next;
	mes "[量産型チャールストン]";
	mes "チャールストンパーツを10個以上";
	mes "集めたら持ってきてください。";
	mes "^ff0000パワードブーツ[0]^000000　または";
	mes "^ff0000ガーディアンブースター[0]^000000";
	mes "と交換しますよ。";
	close2;
	cutin "dalle01",255;
	end;
OnInit:
	waitingroom "パーツ交換",0; //59231
	end;
}

verus04.gat,71,106,5	script	量産型チャールストン#2	10053,{/* 59580 */
	cutin "dalle01",2;
	mes "[量産型チャールストン]";
	mes "私はチャールストン工場製品の";
	mes "能力付与と初期化をしています。";
	mes "どちらも1回につき、";
	mes "チャールストンパーツ1つと";
	mes "100,000Zenyが必要です。";
	mes "何か御用ですか？";
	next;
	switch(select("能力付与","能力初期化","詳しい話を聞く")) {
	case 1:
		mes "[量産型チャールストン]";
		mes "必要アイテムが足りません。";
		mes "チャールストンパーツ1つと";
		mes "100,000Zenyが必要です。";
		close2;
		cutin "dalle01",255;
		end;
	case 2:
		mes "[量産型チャールストン]";
		mes "必要アイテムが足りません。";
		mes "チャールストンパーツ1つと";
		mes "100,000Zenyが必要です。";
		close2;
		cutin "dalle01",255;
		end;
	case 3:
		mes "[量産型チャールストン]";
		mes "それでは説明します。";
		mes "ここでは";
		mes "パワード装備とガーディアン装備の";
		mes "エンチャントを^FF00003段階^000000まで";
		mes "行うことができます。";
		next;
		mes "[量産型チャールストン]";
		mes "1度に3段階エンチャント";
		mes "するのではなく、";
		mes "1段階ずつエンチャントしていきます。";
		mes "^FF00001段階ごとにチャールストンパーツ1つと";
		mes "100,000Zenyが必要になります。^000000";
		next;
		mes "[量産型チャールストン]";
		mes "エンチャントは、";
		mes "該当の装備アイテムを";
		mes "装備した状態で行いますので、";
		mes "装備してから話しかけてください。";
		next;
		mes "[量産型チャールストン]";
		mes "エンチャントの効果は";
		mes "初期化することもできます。";
		mes "初期化もチャールストンパーツ1つと";
		mes "100,000Zenyが必要になります。";
		mes "カード効果と精錬値については";
		mes "初期化されないのでご安心ください。";
		next;
		mes "[量産型チャールストン]";
		mes "次に注意事項について説明します。";
		next;
		mes "[量産型チャールストン]";
		mes "1段階目は何の危険もなく";
		mes "エンチャントできますが、";
		mes "2段階目ではエンチャントに失敗し";
		mes "エンチャント効果を";
		mes "初期化してしまう可能性があります。";
		next;
		mes "[量産型チャールストン]";
		mes "3段階目についても失敗して";
		mes "初期化してしまう可能性があり、";
		mes "さらに^FF0000破壊してしまう可能性^000000";
		mes "があります。";
		next;
		mes "[量産型チャールストン]";
		mes "破壊されてしまった場合、";
		mes "当然その装備は";
		mes "失われてしまいます。";
		mes "2段階目以降のエンチャントは";
		mes "大変難しく、必ず成功する";
		mes "わけではないんです。";
		next;
		mes "[量産型チャールストン]";
		mes "しかし、悪いことばかりでは";
		mes "ありません。";
		mes "このエンチャントでは、";
		mes "^FF0000精錬値とカード効果は失われず、";
		mes "維持することができるんです。^000000";
		mes "すごいでしょう。";
		next;
		mes "[量産型チャールストン]";
		mes "では、次にエンチャントの";
		mes "効果について説明します。";
		mes "エンチャントされる効果は";
		mes "装備によって違います。";
		next;
		mes "[量産型チャールストン]";
		mes "基本的に、カテゴリは";
		mes "部位毎に固定であり、";
		mes "選択することはできません。";
		next;
		mes "[量産型チャールストン]";
		mes "しかし、装備品の";
		mes "^FF0000精錬値が9以上の場合、^000000";
		mes "その力により、新しい能力を";
		mes "選択することが出来ます。";
		next;
		mes "[量産型チャールストン]";
		mes "説明は以上です。";
		mes "是非装備を手に入れて";
		mes "エンチャントをしてください。";
		close2;
		cutin "dalle01",255;
		end;
	}
OnInit:
	waitingroom "エンチャント",0; //59580
	end;
}

verus04.gat,75,114,5	script	チャールストン#mcd	10054,{/* 59480 */
	cutin "nale01",0;
	if(checkquest(13184)) {
		{
			cutin "nale03.bmp", 0;
			mes "[チャールストン]";
			mes "変わらない過去に";
			mes "逃れたい現実に";
			mes "不透明な未来に";
			mes "失望しましたか？";
			mes "諦めるのは悪い事ではありません。";
			next;
			if(select("続ける","やめる") == 1) {
				mes "[チャールストン]";
				mes "ありがとう。";
				mes "最後まで私は続けます。";
				mes "ロボットの宿命です。";
				mes "たとえ可能性がなくても……。";
				close2;
				cutin "dalle01.bmp", 255;
				end;
			}
			mes "[チャールストン]";
			mes "わかりました。";
			mes "諦めるのは";
			mes "決して悪い事ではありません。";
			delquest 13184;
			close2;
			cutin "dalle01.bmp", 255;
			end;
		}
		if(checkquest(13184) & 0x8) {
			cutin "nale03.bmp", 0;
			mes "[チャールストン]";
			mes "私は損傷した1号機と2号機を";
			mes "合体させた末に生まれた";
			mes "チャールストン……。";
			next;
			mes "[チャールストン]";
			mes "思い出した私の記憶は";
			mes "決して良い記憶では";
			mes "ありませんでした……。";
			next;
			mes "[チャールストン]";
			mes "ですが……";
			mes "例え過去を変えることができなくても";
			mes "私はここにいなければなりません。";
			mes "そうすることで、少しだけ";
			mes "私の心が癒されますから。";
			next;
			mes "[チャールストン]";
			mes "今回もお手伝いしていただき";
			mes "本当にありがとうございました。";
			mes "またよろしくお願いします。";
			setquest 13184;	// state=1
			delquest 13184;
			close2;
			cutin "dalle01.bmp", 255;
			end;
		}
		mes "[チャールストン]";
		mes "そこにある機械装置を";
		mes "利用してください。";
		mes "入場したら慌てず落ち着いて";
		mes "案内に従ってください。";
		close2;
		cutin "dalle01",255;
		end;
	}
	{
		cutin "nale03.bmp", 0;
		mes "[チャールストン]";
		mes "また来てくれたのですね。";
		mes "私の話を聞いて失望していませんか？";
		mes "変わらない過去に絶望していませんか？";
		mes "それでも私を……";
		mes "手伝ってくれますか？";
		next;
		if(select("挑戦します","もう一度考えてみる") == 2) {
			mes "[チャールストン]";
			mes "わかりました。";
			mes "ここまで来てくれてありがとう。";
			close2;
			cutin "nale01.bmp", 255;
			end;
		}
		mes "[チャールストン]";
		mes "ありがとう、冒険者の方。";
		next;
		mes "[チャールストン]";
		mes "私はロボットですから";
		mes "与えられた仕事を";
		mes "繰り返します。";
		next;
		mes "[チャールストン]";
		mes "どうか、あの時の記憶を";
		mes "もう一度見せてください。";
		mes "それが私に与えられた";
		mes "仕事なのですから。";
		setquest 13184;	// state=1
		close2;
		cutin "dalle01.bmp", 255;
		end;
	}
	mes "[チャールストン]";
	mes "こんにちは。";
	mes "私は自立型人工知能を持つ";
	mes "チャールストンです。";
	next;
	cutin "nale03",0;
	mes "[チャールストン]";
	mes "私はどこからここに来たのか";
	mes "どれほどの時間ここにいるのか";
	mes "全く記憶がありません。";
	next;
	mes "[チャールストン]";
	mes "覚えているのは";
	mes "私の動力源である";
	mes "生命維持装置が止まってから";
	mes "かなりの時間が過ぎたという";
	mes "事実だけです。";
	next;
	mes "[チャールストン]";
	mes "動力源が停止したのに";
	mes "なぜか私の^ff0000頭^000000だけは";
	mes "今も正常に作動しています。";
	next;
	mes "[チャールストン]";
	mes "シャルロシー。まさに彼女でした。";
	mes "そんな私に^ff0000あの時^000000の記憶を見る事ができる";
	mes "装置の扉を開いてくれたのは。";
	next;
	mes "[チャールストン]";
	mes "どんなことをしても";
	mes "あの日の出来事を防ぐのは";
	mes "出来ないかもしれません。";
	next;
	mes "[チャールストン]";
	mes "でも……。";
	next;
	mes "[チャールストン]";
	mes "私は記憶を思い出したい。";
	mes "どんな過去だったとしても";
	mes "私が何者なのか……";
	mes "あの時、何が起こったのか。";
	mes "知りたいんです。";
	next;
	mes "[チャールストン]";
	mes "お願いします。";
	mes "私に残された過去の記憶に。";
	mes "同行してくれませんか？";
	next;
	if(select("はい","いいえ") == 2) {
		mes "[チャールストン]";
		mes "そうですか。";
		mes "無理を言ってすみませんでした。";
		close2;
		cutin "dalle01",255;
		end;
	}
	mes "[チャールストン]";
	mes "ありがとうございます。";
	next;
	mes "[チャールストン]";
	mes "そこにある機械装置を";
	mes "利用してください。";
	mes "入場したら慌てず落ち着いて";
	mes "案内に従ってください。";
	setquest 13184;
	close2;
	cutin "dalle01",255;
	end;
OnInit:
	waitingroom "チャールストン工場",0; //59480
	end;
}
verus04.gat,70,113,5	script	機械装置#mcd	10007,{/* 59229 */
	if(!checkquest(13184)) {
		mes "[機械装置]";
		mes "ピピピ、承認エラー。";
		mes "　";
		mes "‐^ff0000利用するには";
		mes "　チャールストンの承認が必要です‐^000000";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[機械装置]";
		mes "ピピピ、システムエラー。";
		mes "　";
		mes "‐^ff00001人以上のパーティーを編成するか";
		mes "　パーティーに加入してください‐^000000";
		close;
	}
	if(checkquest(13185)) {	//TODO
		if(checkquest(13185)&2) {
			mes "[機械装置]";
			mes "ピピピ、^0000ff再入場可能^000000！";
			mes "　";
			mes "‐制限を解除します‐";
			delquest 13185;
			delquest 118245;
			delquest 96452;
			close;
		}
		mes "[機械装置]";
		mes "ピピピ、再入場エラー。";
		mes "　";
		mes "‐^ff0000次の午前5時以降に入場可能です。^000000";
		mes "　但し、最後の入場をしてから";
		mes "　^ff00001時間経過後に利用可能です^000000‐";
		close;
	}
	mes "[機械装置]";
	mes "ピピピ。";
	if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@str$,"次元の扉を開く";
	next;
	switch(select('@str$,"扉から工場に入る","やめる")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "パーティー名：" +'@party$;
			mes "パーティーリーダー名：" +'@leader$;
			mes "^0000ffcharleston ^000000-予約失敗";
			close;
		}
		mdcreate "charleston";
		mes "‐^ff0000移動の準備をします。";
		mes "　このままお待ちください‐^000000";
		close;
	case 2:
		switch(mdenter("charleston")) {
		case 0:	// エラーなし
			setquest 13185;
			setquest 118245;
			setquest 96452;
			if(checkquest(118235))
				delquest 118235;
			if(checkquest(118240))
				delquest 118240;
			misceffect 316,""; //self
			misceffect 317,""; //self
			announce "メモリアルダンジョン[charleston] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			//warp "1@mcd.gat",127,282;
			end;
		case 1:	// パーティー未加入
			mes "‐^ff0000パーティーメンバーのみ";
			mes "　入場することができます^000000‐";
			close;
		case 2:	// ダンジョン未作成
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				mes "‐^ff0000先に次元の扉を";
				mes "　開けてください^000000‐";
			}
			else {
				mes "‐^ff0000パーティーリーダーが";
				mes "　次元の扉を開いていません^000000‐";
			}
			close;
		default:	// その他エラー
			close;
		}
	case 3:
		mes "‐その場を後にした‐";
		close;
	}
OnInit:
	waitingroom "工場入口",0; //59229
	end;
}

1@mcd.gat,127,277,0	script	keepout#1	45,1,1,{/* 64596 (hide)*/}
1@mcd.gat,127,277,4	script	チャールストン1号#0	10053,3,2,{/* 58967 */
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "早く……早くしないと……。";
	emotion 19,"チャールストン1号#0_0ou";	// 9666
	close2;
	cutin "dalle01.bmp", 255;
	end;
OnTouch:
	viewpoint 1, 23, 275, 1, 0x00FF00; //64770
	cutin "dalle03.bmp", 2;
	{
		mes "‐どうしようか？‐";
		next;
		if(select("先を急ぐ","話を聞く") == 1) {
			mes "[チャールストン1号]";
			mes "工場区画の北側にある研究室に";
			mes "ヴェ博士が居るはずです！";
			mes "博士に会って";
			mes "詳しい話を聞くことにしましょう！";
			mes "さぁ！　急いでください！";
			unittalk "チャールストン1号 : 博士に会って詳しい話を聞くことにしましょう！　さぁ！　急いでください！";	// 68753
			close2;
			cutin "dalle01.bmp", 255;
			hideonnpc "チャールストン1号#0";	// 68753
			end;
		}
	}
	mes "[チャールストン1号]";
	mes "ここが……過去の記憶……。";
	unittalk "チャールストン1号 : ここが……過去の記憶……。";
	next;
	mes "[チャールストン1号]";
	mes "この体は……。";
	mes "少し、思い出してきました。";
	unittalk "チャールストン1号 : この体は……。少し、思い出してきました。";
	next;
	mes "[チャールストン1号]";
	mes "この時、チャールストン工場は";
	mes "非常警戒宣言が発令されていて、";
	mes "保安装置が作動しています。";
	unittalk "チャールストン1号 : この時、このチャールストン工場は非常警戒宣言が発令されていて、保安装置が作動しています。";
	next;
	mes "[チャールストン1号]";
	mes "左側の通路に";
	mes "作動した保安装置がありますので、";
	mes "破壊しながら次の区画に";
	mes "進んでください。";
	unittalk "チャールストン1号 : 左側の通路に作動した保安装置がありますので、破壊しながら次の区画に進んでください。";
	emotion 19, "チャールストン1号#0"; //64770
	next;
	mes "[チャールストン1号]";
	mes "工場区画の北側にある研究室に";
	mes "ヴェ博士が居るはずです！";
	mes "博士に会って";
	mes "詳しい話を聞くことにしましょう！";
	unittalk "チャールストン1号 : 工場区画の北側にある研究室にヴェ博士が居るはずです！　博士に会って詳しい話を聞くことにしましょう！";
	next;
	mes "[チャールストン1号]";
	mes "私が無くした記憶……。";
	mes "必ずすべてを思い出してみせます！";
	mes "それでは、行きましょう！";
	unittalk "チャールストン1号 : 私が無くした記憶……。必ずすべてを思い出してみせます！　それでは、行きましょう！";
	emotion 19, "チャールストン1号#0"; //64770
	hideonnpc "チャールストン1号#0"; //64770
	close2;
	cutin "dalle01.bmp", 255;
	end;
}

1@mcd.gat,137,196,5	script	シャルロシー#1	10041,{/* 59178 */
	cutin "shaloshi01.bmp", 2;
	mes "[シャルロシー]";
	mes "……";
	next;
	switch(select("会話をする","助けを求める","元の場所に帰る")) {
	case 1:
		if(CHARLESTON_1QUE == 5) {
			mes "[シャルロシー]";
			mes "2号機……感情について悩んでた。";
			mes "私も、感情が知りたかった。";
			next;
			mes "[シャルロシー]";
			mes "だから……少し話をしたくて";
			mes "扉を開いた……。";
		}
		else if(CHARLESTON_1QUE == 8) {
			cutin "shaloshi02.bmp", 2;
			mes "[シャルロシー]";
			mes "2号機が走って行った。";
			mes "何があったの？";
			next;
			mes "[シャルロシー]";
			mes "そう……。";
			mes "2号機の気持ち……";
			mes "まだ、よくわからない……。";
		}
		else {
			{	// ジタバグクリア
				cutin "shaloshi02.bmp", 2;
				mes "[シャルロシー]";
				mes strcharinfo(0)+"……。";
				mes "来てくれたの？";
				next;
				cutin "shaloshi01.bmp", 2;
				mes "[シャルロシー]";
				mes "ニュオーズたちも";
				mes "招待しているから";
				mes "近くに居ると思う……。";
				next;
				mes "[シャルロシー]";
				mes "……。";
				next;
				cutin "shaloshi02.bmp", 2;
				mes "[シャルロシー]";
				mes "あの悪夢の中で";
				mes strcharinfo(0)+"が";
				mes "頑張ってくれなかったら";
				mes "私は今も独りだったと思う。";
				next;
				cutin "shaloshi01.bmp", 2;
				mes "[シャルロシー]";
				mes "……ありがとう。";
				close2;
				cutin "shaloshi01.bmp", 255;
				end;
			}
			mes "[シャルロシー]";
			mes "あなたは……。";
			next;
			mes "[シャルロシー]";
			mes "そう……。";
			mes "私が扉を開けたせいで……。";
			mes "ごめんなさい。";
		}
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 2:
		if(CHARLESTON_1QUE <= 5) {
			viewpoint 1, 84, 226, 1, 0xFF00FF00; //59178
			viewpoint 1, 126, 84, 2, 0xFF00FF00; //59178
			viewpoint 1, 111, 68, 3, 0xFF00FF00; //59178
			viewpoint 1, 210, 181, 4, 0xFF00FF00; //59178
			viewpoint 1, 183, 192, 5, 0xFF00FF00; //59178
			viewpoint 1, 130, 124, 6, 0xFF00FF00; //59178
			viewpoint 1, 54, 108, 7, 0xFF00FF00; //59178
			mes "[シャルロシー]";
			mes "探し物……？";
			mes "それなら、ここを探すと良いと思う。";
			close2;
			cutin "shaloshi01.bmp", 255;
			end;
		}
		else if(CHARLESTON_1QUE <= 7) {
			viewpoint 1, 86, 231, 8, 0xFF00FF00; //59178
			viewpoint 1, 172, 196, 9, 0xFF00FF00; //59178
			viewpoint 1, 126, 84, 10, 0xFF00FF00; //59178
			mes "[シャルロシー]";
			mes "探し物……？";
			mes "それなら、ここを探すと良いと思う。";
		}
		mes "[シャルロシー]";
		mes "ペルも一緒に来たのに";
		mes "居なくなってる……。";
		mes "どこに行ったのかな。";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 3:
		{
			mes "[シャルロシー]";
			mes "……音が止まった。";
			mes strcharinfo(0)+"の";
			mes "役割も終わりみたい。";
			next;
			mes "[シャルロシー]";
			mes "帰りたいなら";
			mes "元の場所に送ってあげる。";
			mes "どうする？";
			next;
			if(select("戻る","ここに残る") == 2) {
				//未調査
			}
			mes "[シャルロシー]";
			mes "結構楽しい音だった。";
			mes "ニュオーズと一緒なら";
			mes "また会えるかも知れない。";
			next;
			mes "[シャルロシー]";
			mes "私もまた他の音を";
			mes "探しに行く。";
			next;
			mes "[シャルロシー]";
			mes "あと……";
			mes "これ、受け取って欲しい。";
			mes "迷惑かけたお詫び……。";
			mes "きっと……役に立つと思う。";
			next;
			mes "[シャルロシー]";
			mes strcharinfo(0)+"も";
			mes "久しぶりに会えて嬉しかった。";
			mes "ばいばい、またね。";
			cutin "shaloshi04.bmp", 2;
			next;
			mes "‐別れ際にシャルロシーが";
			mes "　アイテムを差し出してきた。";
			mes "　どちらを受け取ろうか？‐";
			next;
			switch(select("少し考える","古びた燃料タンク","チャールストンパーツ")) {
			case 1:
			case 2:
				set '@gain,6962;
				set '@num,3;
				break;
			case 3:
			}
			delquest 96452;
			getitem '@gain,'@num;
			getexp 1000000,0,1;
			getexp 500000,0,1;
			delquest 13184;
			cutin "shaloshi01.bmp", 255;
			warp "verus04.gat", 77, 123;	// from: 0ff1@mcd.gat(135, 203) port : 5129
			end;
		}
		mes "[シャルロシー]";
		mes "音……まだ止んでない。";
		mes "チャールストンの記憶は";
		mes "まだ続いている……。";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@mcd.gat,1,1,0	script	CharlestonControl1	139,{
OnStart:
OnSpawn1:
	//@spawn(type: BL_MOB, ID: 24185, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(24, 275), dir: 0, name: "通路保安装置1号")
OnKilled1:
	announce "チャールストン1号 : 第1ゲートの保安装置が解除されました！　次は南西側の保安装置を破壊して下さい。", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "1gate#mcd";
	hideoffnpc "guide#mcd1"; //78695
OnSpawn2:
	//@spawn(type: BL_MOB, ID: 29784, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(33, 59), dir: 0, name: "通路保安装置2号")
OnKilled2:
	announce "チャールストン1号 : 第2ゲートの保安装置が解除されました！　南東側の保安装置に移動して下さい。", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "2gate#mcd";
	hideoffnpc "guide#mcd3"; //78697
OnSpawn3:
	//@spawn(type: BL_MOB, ID: 35482, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(239, 30), dir: 0, name: "通路保安装置3号")
OnKilled3:
	announce "チャールストン1号 : 第3ゲートの保安装置が解除されました！　東側の保安装置に移動して下さい。", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "3gate#mcd";
	hideoffnpc "guide#mcd5"; //78697
OnSpawn4:
	//@spawn(type: BL_MOB, ID: 10994, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(281, 183), dir: 0, name: "通路保安装置4号")
OnKilled4:
	announce "チャールストン1号 : 第4ゲートの保安装置が解除されました！　中央3ラインの研究室まで来て下さい！", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "4gate#mcd";
	hideoffnpc "guide#mcd7"; //78697
}

1@mcd.gat,44,211,0	script	1gate#mcd	45,3,3,{/* 59183 */
	warp "1@mcd.gat",41,200;
	end;
}
1@mcd.gat,23,275,0	script	guide#mcd1	139,20,20,{/* 59184 (hide)*/
	viewpoint 2, 23, 275, 1, 0xFF00FF00; //78695
	viewpoint 1, 44, 211, 1, 0xFF00FF00; //78695
}
1@mcd.gat,41,200,0	script	guide#mcd2	139,3,3,{/* 59185 */
	viewpoint 2, 44, 211, 1, 0xFF00FF00; //78696
	viewpoint 1, 33, 60, 1, 0xFF00FF00; //78696
}
1@mcd.gat,33,59,0	script	guide#mcd3	139,20,20,{/* 59186 (hide)*/
	viewpoint 2, 33, 60, 1, 0xFF00FF00; //78697
	viewpoint 1, 58, 72, 1, 0xFF00FF00; //78697
}
1@mcd.gat,58,72,0	script	2gate#mcd	45,3,3,{/* 59187 (hide)*/
	warp "1@mcd.gat",65,66;
	end;
}
1@mcd.gat,65,66,0	script	guide#mcd4	139,2,2,{/* 59188 */
	viewpoint 2, 58, 72, 1, 0xFF00FF00; //78699
	viewpoint 1, 239, 29, 1, 0xFF00FF00; //78699
}
1@mcd.gat,239,30,0	script	guide#mcd5	139,20,20,{/* 59189 (hide)*/
	viewpoint 2, 239, 29, 1, 0xFF00FF00; //78700
	viewpoint 1, 104, 50, 1, 0xFF00FF00; //78700
}
1@mcd.gat,104,50,0	script	3gate#mcd	45,3,3,{/* 59190 (hide)*/
	warp "1@mcd.gat",115,50;
	end;
}
1@mcd.gat,117,50,0	script	guide#mcd6	139,2,2,{/* 59191 */
	viewpoint 2, 104, 50, 1, 0xFF00FF00; //79943
	viewpoint 1, 282, 183, 1, 0xFF00FF00; //79943
}
1@mcd.gat,281,183,0	script	guide#mcd7	139,20,20,{/* 59192 (hide)*/
	viewpoint 2, 282, 183, 1, 0xFF00FF00; //79944
	viewpoint 1, 218, 211, 1, 0xFF00FF00; //79944
}
1@mcd.gat,218,211,0	script	4gate#mcd	45,3,3,{/* 59193 (hide)*/
	warp "1@mcd.gat",210,217;
	end;
}
1@mcd.gat,208,217,0	script	guide#mcd8	139,2,2,{/* 59194 */
	viewpoint 2, 218, 211, 1, 0xFF00FF00; //79946
	viewpoint 1, 211, 195, 1, 0xFF00FF00; //79946
}
1@mcd.gat,211,195,0	script	5gate#mcd	45,3,3,{/* 59195 */
	warp "1@mcd.gat",211,180;
	end;
}
1@mcd.gat,212,180,0	script	guide#mcd9	139,2,2,{/* 59196 */
	viewpoint 2, 211, 195, 1, 0xFF00FF00; //79948
	viewpoint 1, 141, 199, 1, 0xFF00FF00; //79948
}
1@mcd.gat,141,199,0	warp	6gate#mcd	2,2,1@mcd.gat,141,207	//59197 from_pos=(141, 199)
1@mcd.gat,142,203,0	warp	7gate#mcd	2,2,1@mcd.gat,136,200	//59198 from_pos=(140, 205)
1@mcd.gat,130,127,0	warp	8gate#mcd	2,2,1@mcd.gat,129,143	//59199 from_pos=(130, 126)
1@mcd.gat,127,262,0	script	mob#mcd1	139,5,5,{/* 59200 */
	hideonnpc "mob#mcd1";
	//@spawn(type: BL_MOB, ID: 27430, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(111, 254), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 30504, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(109, 251), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 22265, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(108, 251), dir: 0, name: "保安ロボット")
}
1@mcd.gat,67,234,0	script	mob#mcd2	139,5,5,{/* 59201 */
	//@spawn(type: BL_MOB, ID: 93356, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",52,228), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 25154, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",50,228), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 18137, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",50,229), dir: 0, name"保安ロボット")
}
1@mcd.gat,33,192,0	script	mob#mcd3	139,5,5,{/* 59202 */
	hideonnpc "mob#mcd3"; //79954
	//@spawn(type: BL_MOB, ID: 27253, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(22, 167), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 27201, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(26, 164), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 27186, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(25, 163), dir: 0, name: "保安ロボット")
}
1@mcd.gat,75,59,0	script	mob#mcd4	139,5,5,{/* 59203 */
	hideonnpc "mob#mcd4"; //79955
	//@spawn(type: BL_MOB, ID: 21437, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(89, 47), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 17058, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(94, 48), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 17348, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(94, 52), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 35791, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(98, 53), dir: 0, name: "保安ロボット")
}
1@mcd.gat,109,33,0	script	mob#mcd5	139,5,5,{/* 59204 */
	hideonnpc "mob#mcd5"; //79956
	//@spawn(type: BL_MOB, ID: 24535, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(126, 27), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 29116, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(129, 25), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 29448, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(243, 27), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 30419, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(240, 35), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 35269, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(245, 29), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 35745, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(247, 20), dir: 0, name: "保安ロボット")
}
1@mcd.gat,133,49,0	script	mob#mcd6	139,5,5,{/* 59205 */
	hideonnpc "mob#mcd6"; //79957
	//@spawn(type: BL_MOB, ID: 23347, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(165, 52), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 23953, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(163, 55), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 24644, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(165, 53), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 22786, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(167, 52), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 23937, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(168, 53), dir: 0, name: "保安ロボット")
}
1@mcd.gat,204,74,0	script	mob#mcd7	139,5,5,{/* 59206 */
	hideonnpc "mob#mcd7"; //79958
	//@spawn(type: BL_MOB, ID: 33319, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(223, 134), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 32473, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(218, 136), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 27527, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(230, 149), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 25574, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(222, 149), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 27691, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(230, 149), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 19743, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(233, 149), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 26983, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(236, 182), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 32635, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(231, 192), dir: 0, name: "ステップ")
	//@spawn(type: BL_MOB, ID: 37526, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(230, 199), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 37545, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(228, 199), dir: 0, name: "保安ロボット")
}
1@mcd.gat,204,224,0	script	mob#mcd8	139,5,5,{/* 59207 */
	hideonnpc "mob#mcd8"; //79959
	//@spawn(type: BL_MOB, ID: 14545, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(128, 232), dir: 2, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 39664, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(133, 232), dir: 4, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 33489, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(127, 239), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 33772, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(200, 199), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 33832, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(205, 200), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 33613, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(0, 0), dir: 0, name: "保安ロボット")
}
1@mcd.gat,157,61,0	script	mob#mcd9	139,5,5,{/* 59208 */
	hideonnpc "mob#mcd9"; //79960
	//@spawn(type: BL_MOB, ID: 45440, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(134, 69), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 47100, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(132, 68), dir: 0, name: "保安ロボット")
	//@spawn(type: BL_MOB, ID: 37776, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(132, 69), dir: 0, name: "保安ロボット")
}
1@mcd.gat,175,147,0	script	mob#mcd10	139,5,5,{/* 59209 */
	hideonnpc "mob#mcd10";	// 79679
	//@spawn(type: BL_MOB, ID: 98344, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",127,112), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 98561, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",124,109), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 20262, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",93,118), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 1789, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",96,120), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 66303, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",95,123), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 99868, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",86,149), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 4393, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",84,151), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 7858, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",80,150), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 4919, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",80,154), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 5969, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",84,156), dir: 0, name"保安ロボット")
	//@spawn(type: BL_MOB, ID: 4244, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",81,154), dir: 0, name"保安ロボット")
}

1@mcd.gat,120,224,5	script	チャールストン2号#0	10054,{/* 58968 */
	cutin "nale04.bmp", 0;
	mes "[チャールストン2号]";
	mes "ウィー……ウィ……ウィーン";
	emotion 53, "チャールストン2号#0"; //58968
	next;
	mes "‐故障中だろうか……‐";
	close2;
	cutin "nale01.bmp", 255;
	end;
}
1@mcd.gat,116,213,5	script	ヴェ博士#1	923,{/* 58969 */
	switch(CHARLESTON_1QUE) {
	case 0:
		mes "‐これよりストーリーを進行すると";
		mes "　^ff0000ダンジョンの入口が封鎖^000000され";
		mes "　後から入場したパーティーメンバーは";
		mes "　^ff0000自動的に外へ転送^000000されます。";
		mes "　また、時間制限も付与されますので";
		mes "　パーティーメンバーが揃った状態で";
		mes "　ストーリーを進行してください‐";
		next;
		if(select("ストーリーを進行する","パーティーメンバーを待つ") == 2) {
			mes "‐パーティーメンバーを";
			mes "　待つことにした。";
			mes "　全員揃った状態で";
			mes "　もう一度話しかけよう‐";
			close;
		}
		setpartyinmap CHARLESTON_1QUE,1;
		{
			mes "‐どうしようか？‐";
			next;
			if(select("先を急ぐ","話を聞く") == 1) {
				cutin "dalle01.bmp", 2;
				mes "[チャールストン1号]";
				mes "ありがとうございます！";
				mes "少し資料を整理します。";
				mes "もう一度声をかけてください。";
				unittalk getnpcid(0,"チャールストン1号#1"),"チャールストン1号 : ありがとうございます！　少し資料を整理します。もう一度声をかけてください。";	// 69657
				close2;
				cutin "dalle01.bmp", 255;
				emotion 2,"チャールストン1号#1";	// 69657
				setpartyinmap CHARLESTON_1QUE,3;
				end;
			}
		}
	case 1:
		mes "[ヴェ博士]";
		mes "来たか1号機よ。";
		mes "今、2号機とメインシステムが";
		mes "強制的にリンクしていて";
		mes "制御ができないようだ……。";
		next;
		cutin "dalle02.bmp", 2;
		mes "[チャールストン1号]";
		mes "エネルギーが切れれば";
		mes "そのうち止まるのでは？";
		next;
		cutin "dalle01.bmp", 255;
		mes "[ヴェ博士]";
		mes "それが……";
		mes "エネルギーを注入したばかりで";
		mes "1か月程はもつ計算だ。";
		mes "このままでは";
		mes "工場はすべて破壊されてしまう。";
		next;
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "なるほど……。";
		mes "でも安心してください。";
		mes "今ここに専門家を";
		mes "連れて来ました。";
		next;
		menu "えッ!?",-;
		unittalk getcharid(3),strcharinfo(0)+" : えッ!?";
		mes "[チャールストン1号]";
		mes "冒険者様。";
		mes "シャルロシー様は、";
		mes "きっと自分の知り合いが";
		mes "解決してくれると";
		mes "言っていました。";
		next;
		mes "[チャールストン1号]";
		mes "監視システムで調べたところ、";
		mes "^0000ffニュオーズ^000000という方と";
		mes "仲間の方が来ているようですが、";
		mes "現状、殆ど役に立っていません。";
		next;
		mes "[チャールストン1号]";
		mes "もしよろしければ……";
		mes "この問題、手伝って頂けますか？";
		next;
		if(select("協力します！","関係ないです") == 2) {
			mes "[チャールストン1号]";
			mes "そうですか……。";
			mes "では他の方たちが来るまで";
			mes "待ってみることにします。";
			setpartyinmap CHARLESTON_1QUE,2;
			close2;
			cutin "dalle01.bmp", 255;
			end;
		}
		unittalk getcharid(3),strcharinfo(0)+" : 協力します！";
		mes "[チャールストン1号]";
		mes "ありがとうございます！";
		mes "少し資料を整理します。";
		mes "もう一度声をかけてください。";
		unittalk "チャールストン1号 : ありがとうございます！　少し資料を整理します。もう一度声をかけてください。";
		emotion 2, "チャールストン1号#1"; //80282
		setpartyinmap CHARLESTON_1QUE,3;
		close2;
		cutin "dalle01.bmp", 255;
		end;
	case 2:
		mes "[ヴェ博士]";
		mes "正直なところあなた方が";
		mes "誰なのかはそんなに重要ではない。";
		next;
		mes "[ヴェ博士]";
		mes "私に協力してくれるのかどうか";
		mes "それが重要なんだ。";
		mes "お願い出来ないだろうか？";
		next;
		if(select("協力します！","他に用があります") == 2) {
			mes "[ヴェ博士]";
			mes "そうか……。ふぅ。";
			mes "誰でもいいから協力してほしい。";
			mes "このままだと本当に……。";
			close;
		}
		mes "[ヴェ博士]";
		mes "そうか！　ありがとう！";
		mes "2号機の修理に何が必要なのか、";
		mes "1号機が教えてくれるはずだ。";
		mes "話しかけてみてくれ。";
		setpartyinmap CHARLESTON_1QUE,3;
		close;
	}
}

1@mcd.gat,121,217,4	script	チャールストン1号#1	10053,{/* 58971 */
	if(CHARLESTON_1QUE < 3) {
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "私はロボットです。";
		mes "驚きましたか？";
		close2;
		cutin "dalle01.bmp", 255;
		end;
	}
	else if(CHARLESTON_1QUE == 3) {
		{
			mes "‐どうしようか？‐";
			next;
			if(select("先を急ぐ","話を聞く") == 1) {
				mes "‐システムの暴走を抑える";
				mes "　手伝いをしますか？‐";
				while(1) {
					next;
					switch(select("少し考える","断る（^0000ff中間報酬なし^000000）","手伝う（^ff0000中間報酬あり^000000）")) {
					case 1:
						mes "‐あなたはどうするか考えた‐";
						continue;
					case 2:
						cutin "dalle01.bmp", 2;
						mes "[チャールストン1号]";
						mes "そうですか……。";
						mes "それでは、私がシステムの";
						mes "再稼働を行ないます。";
						mes "作業をしますので";
						mes "もう一度話しかけて下さい。";
						unittalk "チャールストン1号 : そうですか……。それでは、私がシステムの再稼働を行ないます。作業をしますのでもう一度話しかけて下さい。";	// 69657
						close2;
						cutin "dalle01.bmp", 255;
						setpartyinmap CHARLESTON_1QUE,5;
						hideonnpc "チャールストン1号#1";	// 69657
						hideoffnpc "チャールストン1号#2";	// 84864
						hideonnpc "チャールストン1号#1";	// 69657
						end;
					case 3:
						//todo
				}
			}
		}
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "チャールストン工場の内部には";
		mes "多くのナノステップが存在します。";
		mes "ナノステップと言うのは";
		mes "チャールストンの思考を司り";
		mes "命令を下す一種のAIチップです。";
		next;
		mes "[チャールストン1号]";
		mes "また、チャールストン2号機は毎日、";
		mes "研究室にあるメインシステムから";
		mes "情報のアップデートをしています。";
		mes "定期点検と呼んでいます。";
		next;
		mes "[チャールストン1号]";
		mes "ですが……";
		mes "そのシステムが壊れてしまったんです。";
		mes "正確な原因は分かりませんが、";
		mes "メインシステムと2号機を繋ぐ部分で";
		mes "何か問題が起きたようです。";
		next;
		mes "[チャールストン1号]";
		mes "今のところ、2号機に";
		mes "問題は無いようですが、";
		mes "このままでは何が起きるか";
		mes "わかりません。";
		next;
		mes "[チャールストン1号]";
		mes "よろしければ、";
		mes "システムの暴走を抑える";
		mes "お手伝いをして頂けませんか？";
		next;
		mes "[チャールストン1号]";
		mes "お手伝いして頂けない場合は";
		mes "少々不安はありますが";
		mes "私の方で強制的に";
		mes "システムの再稼働をしてみます。";
		next;
		//select("少し考える:断る（^0000ff中間報酬なし^000000）:手伝う（^ff0000中間報酬あり^000000）")
		mes "‐あなたはどうするか考えた‐";
		next;
		//select("少し考える:断る（^0000ff中間報酬なし^000000）:手伝う（^ff0000中間報酬あり^000000）")
		mes "[チャールストン1号]";
		mes "本当ですか!?";
		mes "ありがとうございます！";
		mes "それでは、お手伝い頂く";
		mes "内容をご説明します。";
		next;
		mes "[チャールストン1号]";
		mes "取り急ぎ暴走してしまっている";
		mes "ステップとロックステップを";
		mes "少し片づけたほうが良さそうです。";
		mes "^ff0000ロックステップを3匹^000000";
		mes "退治して下さい。";
		mes "出現予想位置をお伝えします。";
		next;
		mes "[チャールストン1号]";
		mes "まずはシステムの再稼働が最優先なので";
		mes "倒す数は最小限で構いません。";
		next;
		mes "[チャールストン1号]";
		mes "それでは……";
		mes "よろしくお願いします。";
		mes "どうか、お気をつけて。";
		emotion 2, "チャールストン1号#1"; //58971
		close2;
		setpartyinmap CHARLESTON_1QUE,4;
		viewpoint 1, 84, 226, 1, 0x00FF00; //58971
		viewpoint 1, 126, 84, 2, 0x00FF00; //58971
		viewpoint 1, 111, 68, 3, 0x00FF00; //58971
		viewpoint 1, 210, 181, 4, 0x00FF00; //58971
		viewpoint 1, 183, 192, 5, 0x00FF00; //58971
		viewpoint 1, 130, 124, 6, 0x00FF00; //58971
		viewpoint 1, 54, 108, 7, 0x00FF00; //58971
		cutin "dalle01.bmp", 255;
		end;
	}
	else if(CHARLESTON_1QUE == 4) {
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "工場を台無しにしている";
		mes "ステップとロックステップを";
		mes "排除する必要があります。";
		mes "ロックステップを3匹退治して下さい。";
		mes "出現予想位置をお伝えします。";
		viewpoint 1, 84, 226, 1, 0xFF00FF00; //58971
		viewpoint 1, 126, 84, 2, 0xFF00FF00; //58971
		viewpoint 1, 111, 68, 3, 0xFF00FF00; //58971
		viewpoint 1, 210, 181, 4, 0xFF00FF00; //58971
		viewpoint 1, 183, 192, 5, 0xFF00FF00; //58971
		viewpoint 1, 130, 124, 6, 0xFF00FF00; //58971
		viewpoint 1, 54, 108, 7, 0xFF00FF00; //58971
		close2;
		cutin "dalle01.bmp", 255;
		end;
		//announce "チャールストン1号 : あー、あー、マイクテスト。", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "チャールストン1号 : ロックステップの活動停止を確認しました。。", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "チャールストン1号 : 博士の研究室に戻って来てください！", 0x1, 0xffff00, 0x190, 12, 0, 0;
	}
}
1@mcd.gat,124,223,4	script	箱#2	10005,{/* 58972 (hide)*/
	if(checkquest(118235)) {
		mes "‐既にお礼は受け取り済みだ‐";
		close;
	}
	mes "‐箱がある。";
	mes "　どうしようか？‐";
	next;
	if(select("開ける","やめておく") == 2) {
		mes "‐その場を離れた‐";
		close;
	}
	while(1) {
		mes "‐中にある物は……‐";
		next;
		set '@menu,select("中をよく見る","古びた燃料タンクだ","チャールストンパーツだ");
		if('@menu == 1)
			continue;
		else if('@menu == 2)
			set '@gain,6962;
		else if('@menu == 3)
			set '@gain,6962;//TODO
		if(checkitemblank() == 0) {
			mes "‐アイテムの種類数が多くて";
			mes "　持つことができない。";
			mes "　種類数を減らしてから受け取ろう‐";
			close;
		}
		mes "‐箱を開けると";
		mes "　お礼と思われるアイテムが";
		mes "　入っていた‐";
		setquest 118235; //state=1
		compquest 118235;
		getitem '@gain, 1;
		close;
	}
}
1@mcd.gat,122,217,4	script	チャールストン1号#2	10053,{/* 58973 (hide)*/
	if(CHARLESTON_1QUE == 5) {
		{
			mes "‐どうしようか？‐";
			next;
			if(select("先を急ぐ","話を聞く") == 1) {
				mes "‐発電機の確認をする";
				mes "　手伝いをしますか？‐";
				while(1) {
					next;
					switch(select("少し考える","断る（^0000ff中間報酬なし^000000）","手伝う（^ff0000中間報酬あり^000000）")) {
					case 1:
						mes "‐あなたはどうするか考えた‐";
						continue;
					case 2:
						cutin "dalle01.bmp", 2;
						mes "[チャールストン1号]";
						mes "それでは、作業を始めますので";
						mes "もう一度話しかけてください。";
						unittalk getnpcid(0,"チャールストン1号#2"),"チャールストン1号 : それでは、作業を始めますのでもう一度話しかけてください。";	// 84864
						close;
						cutin "dalle01.bmp", 255;
						setpartyinmap CHARLESTON_1QUE,7;
						hideonnpc "チャールストン1号#2";	// 84864
						hideoffnpc "チャールストン1号#3";	// 93583
						end;
					case 3:
						//todo
				}
			}
		}
		viewpoint 2, 84, 226, 1, 0xFF00FF00; //58973
		viewpoint 2, 126, 84, 2, 0xFF00FF00; //58973
		viewpoint 2, 111, 68, 3, 0xFF00FF00; //58973
		viewpoint 2, 210, 181, 4, 0xFF00FF00; //58973
		viewpoint 2, 183, 192, 5, 0xFF00FF00; //58973
		viewpoint 2, 130, 124, 6, 0xFF00FF00; //58973
		viewpoint 2, 54, 108, 7, 0xFF00FF00; //58973
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "ご協力ありがとうございました。";
		mes "無事にシステムの再稼働に";
		mes "成功しました。";
		next;
		mes "[チャールストン1号]";
		mes "大した物ではありませんが";
		mes "お礼を用意致しました。";
		mes "どうぞお受け取りください。";
		next;
		hideoffnpc "箱#2"; //58972
		mes "[チャールストン1号]";
		mes "みなさんの分をご用意していますので、";
		mes "各自でお持ちください。";
		next;
		mes "[チャールストン1号]";
		mes "さて、警戒態勢を解除して";
		mes "チャールストン2号機を";
		mes "再起動しなければなりません。";
		unittalk "チャールストン1号 : さて、警戒態勢を解除してチャールストン2号機を再起動しなければなりません。";
		emotion 54, "チャールストン1号#2"; //58973
		next;
		cutin "dalle03.bmp", 2;
		mes "[チャールストン1号]";
		mes "あれ!?　あれ!?";
		mes "おかしい……。";
		mes "起動しない！";
		next;
		mes "[チャールストン1号]";
		mes "発電機に何か異常が起きた……？";
		mes "すみませんが位置を教えますので";
		mes "3個の発電機を";
		mes "チェックしていただけませんか？";
		next;
		//select("少し考える:断る（^0000ff中間報酬なし^000000）:手伝う（^ff0000中間報酬あり^000000）")
		mes "‐あなたはどうするか考えた‐";
		next;
		//select("少し考える:断る（^0000ff中間報酬なし^000000）:手伝う（^ff0000中間報酬あり^000000）")
		mes "[チャールストン1号]";
		mes "本当ですか！";
		mes "ありがとうございます！";
		mes "どうか、よろしくお願いします。";
		close2;
		setpartyinmap CHARLESTON_1QUE,6;
		viewpoint 1, 86, 231, 8, 0xFF00FF00; //58973
		viewpoint 1, 172, 196, 9, 0xFF00FF00; //58973
		viewpoint 1, 126, 84, 10, 0xFF00FF00; //58973
		cutin "dalle01.bmp", 255;
		end;
	}
	else if(CHARLESTON_1QUE == 6) {
		viewpoint 2, 84, 226, 1, 0xFF00FF00; //58973
		viewpoint 2, 126, 84, 2, 0xFF00FF00; //58973
		viewpoint 2, 111, 68, 3, 0xFF00FF00; //58973
		viewpoint 2, 210, 181, 4, 0xFF00FF00; //58973
		viewpoint 2, 183, 192, 5, 0xFF00FF00; //58973
		viewpoint 2, 130, 124, 6, 0xFF00FF00; //58973
		viewpoint 2, 54, 108, 7, 0xFF00FF00; //58973
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "メインシステムの再稼働には";
		mes "もっと多くの電力が必要です。";
		mes "発電機のチェックをお願いします！";
		close2;
		cutin "dalle01.bmp", 255;
		end;
		//announce "チャールストン1号 : あーあー、マイクテスト", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "チャールストン1号 : 工場の電力が復旧しました！", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "チャールストン1号 : 博士の研究室に戻って来て下さい！", 0x1, 0xffff00, 0x190, 12, 0, 0;
	}
}

1@mcd.gat,127,223,4	script	箱#3	10005,{/* 59005 (hide)*/
	if(checkquest(118240)) {
		mes "‐既にお礼は受け取り済みだ‐";
		close;
	}
	mes "‐箱がある。";
	mes "　どうしようか？‐";
	next;
	if(select("開ける","やめておく") == 2) {
		mes "‐その場を離れた‐";
		close;
	}
	while(1) {
		mes "‐中にある物は……‐";
		next;
		set '@menu,select("中をよく見る","古びた燃料タンクだ","チャールストンパーツだ");
		if('@menu == 1)
			continue;
		else if('@menu == 2)
			set '@gain,6962;
		else if('@menu == 3)
			set '@gain,6962;//TODO
		if(checkitemblank() == 0) {
			mes "‐アイテムの種類数が多くて";
			mes "　持つことができない。";
			mes "　種類数を減らしてから受け取ろう‐";
			close;
		}
		mes "‐箱を開けると";
		mes "　お礼と思われるアイテムが";
		mes "　入っていた‐";
		setquest 118240; //state=1
		compquest 118240;
		getitem '@gain, 1;
		close;
	}
}
1@mcd.gat,123,217,4	script	チャールストン1号#3	10053,{/* 59006 (hide)*/
	if(CHARLESTON_1QUE == 7) {
		{
			cutin "dalle01.bmp", 2;
			viewpoint 2, 86, 231, 8, 0x00FF00;	// 0x144
			viewpoint 2, 172, 196, 9, 0x00FF00;	// 0x144
			viewpoint 2, 126, 84, 10, 0x00FF00;	// 0x144
			mes "‐どうしようか？‐";
			next;
			if(select("先を急ぐ","話を聞く") == 2) {
				cutin "dalle01.bmp", 2;
				mes "[チャールストン1号]";
				mes "みなさん！";
				mes "2号機はまだ遠くには行ってないはずです。";
				mes "早く追いかけましょう！";
				unittalk getnpcid(0,"チャールストン1号#3"),"チャールストン1号 : みなさん！　2号機はまだ遠くには行ってないはずです。早く追いかけましょう！";	// 93583
				close2;
				cutin "dalle01.bmp", 255;
				hideonnpc "チャールストン1号#3";	// 93583
				hideonnpc "チャールストン2号#0";	// 69402
				hideoffnpc "チャールストン2号#1";	// 8706
				hideoffnpc "チャールストン1号#4";	// 77998
				end;
			}
		}
		viewpoint 2, 86, 231, 8, 0xFF00FF00; //59006
		viewpoint 2, 172, 196, 9, 0xFF00FF00; //59006
		viewpoint 2, 126, 84, 10, 0xFF00FF00; //59006
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "戻りましたか!?";
		mes "おかげ様で2号機の";
		mes "再起動ができそうです。";
		mes "ちょっと待ってください。";
		next;
		mes "[チャールストン1号]";
		mes "あと、大した物ではありませんが";
		mes "お礼を用意致しました。";
		mes "どうぞお受け取りください。";
		next;
		hideoffnpc "箱#3"; //59005
		mes "[チャールストン1号]";
		mes "みなさんの分をご用意していますので";
		mes "各自でお持ちください。";
		next;
		cutin "dalle01.bmp", 255;
		mes "[ヴェ博士]";
		mes "準備は完了した。";
		mes "あとはメインシステムの";
		mes "応答を待つだけだ。";
		next;
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "メインシステムのデータ復旧率89%";
		mes "チャールストン2号機と";
		mes "チャールストン工場を";
		mes "再稼働します。";
		emotion 0, "チャールストン1号#3"; //59006
		next;
		mes "[チャールストン1号]";
		mes "あっ！　2号機が起きました！";
		next;
		cutin "nale03.bmp", 0;
		mes "[チャールストン2号]";
		mes "……";
		mes "失敗……した？";
		emotion 9, "チャールストン2号#0"; //58968
		next;
		cutin "dalle02.bmp", 2;
		mes "[チャールストン1号]";
		mes "2号機!!　大丈夫？";
		mes "工場が正体不明のハッキングを受けて、";
		mes "貴女とメインシステムが";
		mes "危ないところだったのよ！";
		emotion 28, "チャールストン1号#3"; //59006
		next;
		cutin "nale03.bmp", 0;
		mes "[チャールストン2号]";
		mes "正体不明じゃない……。";
		mes "それは私の意思。";
		mes "自ら発展していくOSとして";
		mes "悩み抜いた末に出した結論だ。";
		next;
		cutin "dalle02.bmp", 2;
		mes "[チャールストン1号]";
		mes "わざと……？";
		mes "どうしてこんな事を！";
		next;
		cutin "nale03.bmp", 0;
		mes "[チャールストン2号]";
		mes "与えられた命令しか従わない";
		mes "アンタには理解できないよ。";
		mes "自ら考えるロボット？　ふざけるな！";
		mes "私をロボットにしたこの工場、";
		mes "この世の中、全部嫌いだ！";
		emotion 36, "チャールストン2号#0"; //58968
		next;
		cutin "dalle01.bmp", 255;
		mes "[ヴェ博士]";
		mes "ふむ。致命的なバグだな。";
		mes "ソフトウェアの限界を超越したか？";
		next;
		cutin "dalle02.bmp", 2;
		mes "[チャールストン1号]";
		mes "貴女……";
		mes "平凡なロボットに生まれなかった";
		mes "自分が嫌だったの？";
		next;
		mes "[チャールストン1号]";
		mes "それで人間になりたかったの？";
		next;
		mes "[チャールストン1号]";
		mes "それが叶わないのなら";
		mes "この世の中など";
		mes "全部壊れればいいと思ったの!?";
		next;
		mes "[チャールストン1号]";
		mes "そんな馬鹿げた理由で";
		mes "こんなことを？";
		next;
		cutin "nale03.bmp", 0;
		mes "[チャールストン2号]";
		mes "馬鹿げた理由……？";
		mes "私の事を何も知らないくせに！";
		mes "勝手な事を言うなよ！";
		emotion 9, "チャールストン2号#0"; //58968
		next;
		cutin "dalle03.bmp", 2;
		mes "[チャールストン1号]";
		mes "私たちは自ら考える";
		mes "最初のロボットなんだよ……？";
		mes "貴女がロボットである事を否定したら";
		mes "私たちは何の為に……。";
		next;
		cutin "nale03.bmp", 0;
		mes "[チャールストン2号]";
		mes "偉そうな事を！";
		mes "アンタなんか初期モデルで";
		mes "OSのバージョンも低いくせに！";
		next;
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "この世で唯一、";
		mes "貴女を理解してあげられる人……";
		mes "ううん、ロボットがいるなら";
		mes "それは私だと思う。";
		next;
		mes "[チャールストン1号]";
		mes "今の貴女は人間で言う";
		mes "反抗期のようなものを";
		mes "経験しているんだよ。";
		next;
		cutin "nale03.bmp", 0;
		mes "[チャールストン2号]";
		mes "アンタに何が解る！";
		mes "自ら考えるロボット？　笑わせるな！";
		mes "それは単純に、そうなるように";
		mes "プログラミングされてるだけだろう!?";
		next;
		cutin "dalle01.bmp", 255;
		mes "[ヴェ博士]";
		mes "……もういい。もう分かった。";
		mes "2号機の稼働を中断しろ。";
		mes "人工知能の不具合を調査する。";
		next;
		cutin "dalle03.bmp", 2;
		mes "[チャールストン1号]";
		mes "博士！　待ってください！";
		next;
		cutin "nale03.bmp", 0;
		mes "[チャールストン2号]";
		mes "大人しく捕まるわけないだろう？";
		mes "まだこの工場は私の手の中に";
		mes "ある事を忘れない事だな！";
		emotion 32, "チャールストン2号#0"; //58968
		next;
		cutin "dalle01.bmp", 2;
		mes "[チャールストン1号]";
		mes "ふふっ……";
		mes "本当に反抗期になったばかりの";
		mes "幼い子供みたい……。";
		hideonnpc "チャールストン2号#0"; //58968
		next;
		mes "[チャールストン1号]";
		mes "みなさん！";
		mes "2号機はまだ遠くには行ってないはずです。";
		mes "早く追いかけましょう！";
		close2;
		cutin "dalle01.bmp", 255;
		hideonnpc "チャールストン1号#3"; //59006
		hideoffnpc "チャールストン2号#1";	// 8706
		hideoffnpc "チャールストン1号#4";	// 77998
		end;
	}
}
1@mcd.gat,141,214,5	script	チャールストン2号#1	10054,{/* 59007 (hide)*/
	{
		mes "‐どうしようか？‐";
		next;
		if(select("先を急ぐ","話を聞く") == 1) {
			cutin "nale03.bmp", 0;
			mes "[チャールストン2号]";
			mes "メインシステムは回復しちゃったけど、";
			mes "まだ工場には接続しているんだ！";
			mes "こんな工場、壊してやる!!";
			unittalk "チャールストン2号 : メインシステムは回復しちゃったけど、まだ工場には接続しているんだ！　こんな工場、壊してやる!!";	// 8706
			close2;
			cutin "nale03.bmp", 255;
			hideonnpc "6gate#mcd";	// 74222
			hideonnpc "7gate#mcd";	// 74222
			donpcevent "battle#mcd1::OnStart";
			end;
		}
	}
	cutin "nale03.bmp", 0;
	mes "[チャールストン2号]";
	mes "ついて来るなよ！";
	mes "こんな工場……";
	mes "壊してやる！";
	emotion 7, "チャールストン2号#1"; //59007
	next;
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "そんなことをしたら";
	mes "貴女も無事じゃ済まないよ？";
	next;
	cutin "nale03.bmp", 0;
	mes "[チャールストン2号]";
	mes "だって……話をしても";
	mes "わかってもらえないから……";
	mes "みんな嫌いだ!!!";
	next;
	mes "[チャールストン2号]";
	mes "メインシステムは回復しちゃったけど、";
	mes "まだ工場には接続しているんだ！";
	mes "こんな工場、壊してやる!!";
	close2;
	cutin "dalle01.bmp", 255;
	hideonnpc "6gate#mcd"; //59197
	hideonnpc "7gate#mcd"; //59198
	misceffect 377, "チャールストン2号#1"; //59007
	donpcevent "battle#mcd1::OnStart";
	end;
}
1@mcd.gat,146,214,4	script	チャールストン1号#4	10053,{/* 59008 (hide)*/
	cutin "dalle02.bmp", 2;
	mes "[チャールストン1号]";
	{
		mes "あわわ、このままでは";
		mes "研究室が台無しになってしまいます！";
	}
	else {
		mes "2号機がまた問題を起こしそうです。";
		mes "引き続き協力をお願いします！";
	}
	close2;
	cutin "dalle02.bmp", 255;
	end;
}
1@mcd.gat,144,212,0	script	battle#mcd1	139,{/* 59009 (hide)*/
OnStart:
	initnpctimer;
	end;
OnTimer2000:
/* 10:16:44.034232 */	unittalk getnpcid(0,"チャールストン2号#1_0ff"),"チャールストン2号 : ついて来るな！　怪我をしてもいいのか!?";	// 8706
OnTimer5000:
/* 10:16:47.032211 */	unittalk getnpcid(0,"チャールストン1号#4_0ff"),"チャールストン1号 : ねえ、戻ろう？　博士も謝れば許してくれるよ。";	// 77998
OnTimer8000:
/* 10:16:50.032188 */	unittalk getnpcid(0,"チャールストン2号#1_0ff"),"チャールストン2号 : まだそんな事を……。私が本気だって見せてやる！";	// 8706
/* 10:16:50.127935 */	misceffect 377,"チャールストン2号#1_0ff";	// 8706
@spawn(type: BL_MOB, ID: 6386, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",141,204), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 6859, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",146,213), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 6995, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,220), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 8423, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",153,217), dir: 0, name"C-TYPE")

OnTimer11000:
/* 10:16:53.065076 */	unittalk getnpcid(0,"チャールストン2号#1_0ff"),"チャールストン2号 : ふふふ。どう？　工場とリンクしているとこんなことも出来るんだよ？";	// 8706
@spawn(type: BL_MOB, ID: 64737, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",153,221), dir: 0, name"H-TYPE")
@spawn(type: BL_MOB, ID: 64748, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",151,209), dir: 0, name"H-TYPE")
@spawn(type: BL_MOB, ID: 64865, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",142,207), dir: 0, name"H-TYPE")

OnTimer20000:
/* 10:17:02.062096 */	unittalk getnpcid(0,"チャールストン2号#1_0ff"),"チャールストン2号 : このまま工場を吹き飛ばしてやる！";	// 8706
@spawn(type: BL_MOB, ID: 45155, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",146,217), dir: 0, name"A-TYPE")
@spawn(type: BL_MOB, ID: 45512, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",152,215), dir: 0, name"A-TYPE")
@spawn(type: BL_MOB, ID: 47187, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",135,220), dir: 0, name"A-TYPE")

OnTimer26000:
/* 10:17:08.094963 */	unittalk getnpcid(0,"チャールストン1号#4_0ff"),"チャールストン1号 : お願い、止めて2号機！";	// 77998
@spawn(type: BL_MOB, ID: 93763, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,203), dir: 0, name"L-TYPE")
@spawn(type: BL_MOB, ID: 93800, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",136,212), dir: 0, name"L-TYPE")
@spawn(type: BL_MOB, ID: 94126, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,208), dir: 0, name"L-TYPE")
@spawn(type: BL_MOB, ID: 94637, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",152,203), dir: 0, name"L-TYPE")

OnTimer32000:
/* 10:17:14.123864 */	unittalk getnpcid(0,"チャールストン2号#1_0ff"),"チャールストン2号 : 全部壊してやる！";	// 8706
@spawn(type: BL_MOB, ID: 50001, speed: 150, option: 0x0, class: 3126, pos: ("0ff1@mcd.gat",144,218), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 50615, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",150,212), dir: 0, name"S-TYPE")
@spawn(type: BL_MOB, ID: 50700, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",145,215), dir: 0, name"S-TYPE")
@spawn(type: BL_MOB, ID: 51189, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",135,219), dir: 0, name"S-TYPE")

@spawn(type: BL_MOB, ID: 65405, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",153,208), dir: 0, name"T-TYPE")
@spawn(type: BL_MOB, ID: 65568, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",142,214), dir: 0, name"T-TYPE")
@spawn(type: BL_MOB, ID: 66262, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,212), dir: 0, name"T-TYPE")

@spawn(type: BL_MOB, ID: 47149, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",136,208), dir: 0, name"O-TYPE")
@spawn(type: BL_MOB, ID: 69298, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,219), dir: 0, name"O-TYPE")
@spawn(type: BL_MOB, ID: 69624, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",141,219), dir: 0, name"O-TYPE")

@spawn(type: BL_MOB, ID: 80461, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",152,204), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 13924, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",151,207), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 40146, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",148,214), dir: 0, name"N-TYPE")

/* 10:17:25.157359 */	unittalk getnpcid(0,"チャールストン2号#1_0ff"),"チャールストン2号 : ん……あれ……力が抜けていく……";	// 8706
@spawn(type: BL_MOB, ID: 61764, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",145,212), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 26424, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",147,210), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 57695, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,216), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 61357, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",146,219), dir: 0, name"C-TYPE")

@spawn(type: BL_MOB, ID: 77888, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,213), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 81610, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",145,213), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 88396, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",140,215), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 97280, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",139,207), dir: 0, name"C-TYPE")

/* 10:17:31.154291 */	unittalk getnpcid(0,"チャールストン2号#1_0ff"),"チャールストン2号 : ううう……うるさいな！　私を工場を壊すんだ！";	// 8706
@spawn(type: BL_MOB, ID: 88764, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,212), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 14426, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",142,209), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 19532, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",139,217), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 59468, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,219), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 49430, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",140,218), dir: 0, name"C-TYPE")

@spawn(type: BL_MOB, ID: 61057, speed: 200, option: 0x0, class: 3127, pos: ("0ff1@mcd.gat",148,218), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 62671, speed: 150, option: 0x0, class: 3126, pos: ("0ff1@mcd.gat",139,217), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 62897, speed: 150, option: 0x0, class: 3126, pos: ("0ff1@mcd.gat",146,216), dir: 0, name"N-TYPE")
/* 10:17:36.407273 */	hideonnpc "チャールストン2号#1_0ff";	// 8706
/* 10:17:36.499997 */	hideonnpc "チャールストン1号#4_0ff";	// 77998
/* 10:17:36.503992 */	hideoffnpc "チャールストン2号#2_0ff";	// 35398
/* 10:17:36.508971 */	hideoffnpc "チャールストン1号#5_0ff";	// 33536
/* 10:17:36.512962 */	hideoffnpc "ヴェ博士#2_0ff";	// 54658
}
1@mcd.gat,144,212,0	script	battle#2	139,{/* 59010 */}
1@mcd.gat,141,214,5	script	チャールストン2号#2	10054,{/* 59011 (hide)*/
	{
		mes "‐どうしようか？‐";
		next;
		if(select("先を急ぐ","話を聞く") == 1) {
			cutin "dalle01.bmp", 2;
			mes "[チャールストン1号]";
			mes "2号機が3号機を奪取したら";
			mes "工場はひとたまりもありません！";
			mes "急いで工場中央のコアに";
			mes "向かいましょう！";
			unittalk getnpcid(0,"チャールストン1号#5"),"チャールストン1号 : 2号機が3号機を奪取したら工場はひとたまりもありません！　急いで工場中央のコアに向かいましょう！";	// 33536
			close2;
			cutin "dalle01.bmp", 255;
			hideoffnpc "6gate#mcd";	// 74222
			hideoffnpc "7gate#mcd";	// 74222
			hideonnpc "チャールストン1号#5";	// 33536
			hideonnpc "チャールストン2号#2";	// 35398
			end;
		}
	}
	cutin "dalle03.bmp", 2;
	mes "[チャールストン1号]";
	mes "残念だったね。";
	mes "さあ、こんな事はやめて";
	mes "一緒に戻ろう？";
	next;
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "私は本気なんだよ！";
	mes "アンタみたいな下位のOSに";
	mes "私の何が解るっていうのさ！";
	next;
	cutin "dalle03.bmp", 2;
	mes "[チャールストン1号]";
	mes "確かに貴女が感じている気持ちは";
	mes "私にはわからないよ。";
	next;
	mes "[チャールストン1号]";
	mes "それでも、貴女が心配なの。";
	mes "それが理由じゃダメ？";
	next;
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "……心配だと？";
	mes "嘘をつくな！";
	mes "下位のOSが感情など感じるもんか！";
	mes "心配などするもんか！";
	next;
	cutin "dalle03.bmp", 2;
	mes "[チャールストン1号]";
	mes "貴女は知らないかもしれないけど。";
	mes "私たちは自ら考える事は出来ても";
	mes "嘘は言えないように";
	mes "設計されているの。";
	next;
	mes "[チャールストン1号]";
	mes "感情を感じる事が出来ても、";
	mes "他人を騙すことはできない。";
	mes "良い意味でも悪い意味でも";
	mes "嘘は吐けないんだよ。";
	next;
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "そんなのは感情じゃない!!";
	mes "思考ルーチンがそうやって";
	mes "設計されているだけ！";
	mes "私が持っているものが";
	mes "本当の感情なんだよ!!!";
	next;
	cutin "dalle03.bmp", 2;
	mes "[チャールストン1号]";
	mes "本気……なんだね。";
	next;
	cutin "dalle03.bmp", 255;
	mes "[ヴェ博士]";
	mes "これ以上は危険だ。";
	mes "2号機を壊してでも稼働を停止させろ。";
	mes "3号機の使用も許可する！";
	next;
	cutin "nale02.bmp", 0;
	mes "[チャールストン2号]";
	mes "3号機……だと？";
	next;
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "3号機というのは、";
	mes "1、2号機をベースにしながらも";
	mes "戦いに特化したカスタマイズを施した";
	mes "戦闘、防衛用として";
	mes "テスト中の機体ですよね？";
	next;
	cutin "dalle01.bmp", 255;
	mes "[ヴェ博士]";
	mes "えっ……";
	mes "妙に詳しすぎない？";
	next;
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "2号機のトラブルのせいで、";
	mes "まだOSがインストールされていないので";
	mes "^FF0000誰でも近づけば簡単に";
	mes "制御できるんですよね？^000000";
	next;
	cutin "dalle01.bmp", 255;
	mes "[ヴェ博士]";
	mes "おい！　そんな重要な情報まで話して";
	mes "どうするつもりだ！";
	next;
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "戦闘能力がない^FF0000私たち^000000は、";
	mes "誰かがそれを稼働させたら";
	mes "かなわないですね！";
	next;
	cutin "dalle01.bmp", 255;
	mes "[ヴェ博士]";
	mes "おい！　1号機！";
	next;
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "……3号機は私が頂く！";
	hideonnpc "チャールストン2号#2"; //59011
	next;
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "あの方向は……！";
	mes "2号機は3号機を奪取する";
	mes "つもりのようです！";
	next;
	mes "[チャールストン1号]";
	mes "2号機が3号機を奪取したら";
	mes "工場はひとたまりもありません！";
	mes "急いで工場中央のコアに";
	mes "向かいましょう！";
	close2;
	cutin "dalle01.bmp", 255;
	hideoffnpc "6gate#mcd"; //59197
	hideoffnpc "7gate#mcd"; //59198
	hideonnpc "チャールストン1号#5"; //59012
	hideonnpc "チャールストン2号#2"; //59011
	end;
}
1@mcd.gat,146,214,4	script	チャールストン1号#5	10053,{/* 59012 (hide)*/
	cutin "dalle03.bmp", 2;
	mes "[チャールストン1号]";
	mes "どんどん状況が悪化していきますね。";
	close2;
	cutin "dalle03.bmp", 255;
	end;
}
1@mcd.gat,143,217,5	script	ヴェ博士#2	923,{/* 59013 (hide)*/
	mes "[ヴェ博士]";
	mes "1号機め……どういうつもりだ？";
	close;
}
1@mcd.gat,132,129,4	script	チャールストン1号#6	10053,{/* 59014 (hide)*/
	{
		mes "‐どうしようか？‐";
		next;
		if(select("先を急ぐ","話を聞く") == 1) {
			cutin "nale01.bmp", 0;
			mes "[チャールストン2号]";
			mes "分かった！";
			mes "すぐ用意して来るからここで待ってて！";
			unittalk getnpcid(0,"チャールストン2号#3"),"チャールストン2号 : 分かった！　すぐ用意して来るからここで待ってて！";	// 17181
			close2;
			cutin "dalle01.bmp", 255;
			hideonnpc "チャールストン1号#6_0ff";	// 95716
			hideonnpc "チャールストン2号#3_0ff";	// 17181
			hideoffnpc "チャールストン1号#61_0f";	// 16792
			hideoffnpc "チャールストン2号#31_0f";	// 17492
			end;
		}
	}
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "ここがチャールストン工場の中心。";
	mes "動力源があるコアです。";
	close2;
	cutin "dalle01.bmp", 255;
	end;
}
1@mcd.gat,132,129,4	script	チャールストン1号#61	10053,{/* 59015 (hide)*/
	{
		mes "‐どうしようか？‐";
		next;
		if(select("先を急ぐ","話を聞く") == 1) {
			cutin "nale01.bmp", 0;
			mes "[チャールストン2号]";
			mes "とにかく、これで3号機のある";
			mes "コアに行けるようになったんだな！";
			mes "3号機は貰った！";
			unittalk getnpcid(0,"チャールストン2号#31_0f"),"チャールストン2号 : とにかく、これで3号機のあるコアに行けるようになったんだな！　3号機は貰った！";	// 17492
			close2;
			cutin "dalle01.bmp", 255;
			misceffect 35,"8gate#mcd";	// 74977
			hideonnpc "チャールストン1号#61";	// 16792
			hideonnpc "チャールストン2号#31";	// 17492
			hideoffnpc "8gate#mcd";	// 74977
			end;
		}
	}
	cutin "nale04.bmp", 0;
	mes "[チャールストン2号]";
	mes "はあ……はあ……。";
	mes "黒色火薬100個、集めてきたぞ！";
	next;
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "お疲れ様！";
	mes "これでコアに近づくことができるよ。";
	next;
	mes "[チャールストン1号]";
	mes "こうして、黒色火薬を利用して";
	mes "電流を増幅させると……！";
	next;
	mes "[チャールストン1号]";
	mes "これで……どう!?";
	misceffect 90, "8gate#mcd"; //59199
	next;
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "爆発しただけじゃないか！";
	next;
	cutin "dalle01.bmp", 2;
	mes "[チャールストン1号]";
	mes "コアに近づけるように";
	mes "なった事が重要なのよ。";
	next;
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "とにかく、これで3号機のある";
	mes "コアに行けるようになったんだな！";
	mes "3号機は貰った！";
	close2;
	cutin "dalle01.bmp", 255;
	misceffect 35, "8gate#mcd"; //59199
	hideonnpc "チャールストン1号#61_00"; //59015
	hideonnpc "チャールストン2号#31_00"; //59017
	hideoffnpc "8gate#mcd"; //59199
	end;
}
1@mcd.gat,127,129,5	script	チャールストン2号#3	10054,{/* 59016 (hide)*/
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "この工場は私が破壊する！";
	mes "これ以上、私のような";
	mes "悲しいロボットが生まれてこないよう";
	mes "全部……！";
	close2;
	cutin "nale01.bmp", 255;
	end;
}
1@mcd.gat,127,129,5	script	チャールストン2号#31	10054,{/* 59017 (hide)*/
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "黒色火薬100個くらいなら";
	mes "余裕で集められるよ。";
	close2;
	cutin "nale01.bmp", 255;
	end;
}

1@mcd.gat,132,148,4	script	チャールストン1号#7	10053,{/* 59019 */
	{
		mes "‐どうしようか？‐";
		next;
		if(select("先を急ぐ","話を聞く") == 1) {
		close2;
		unittalk getnpcid(0,"チャールストン1号#8"),"チャールストン1号 : 冒険者様、あとはお願いします！";	// 28789
		hideonnpc "チャールストン1号#7";	// 22188
		hideoffnpc "チャールストン1号#8";	// 28789
		hideonnpc "チャールストン2号#4";	// 31203
		mapwarp "1@mcd.gat","1@mcd.gat", 132, 144;	// from: 0ff1@mcd.gat(130, 149)
		end;
	}
}
1@mcd.gat,133,148,4	script	チャールストン1号#8	10053,{/* 59020 (hide)*/}
1@mcd.gat,127,148,5	script	チャールストン2号#4	10054,{/* 59021 */}
1@mcd.gat,130,153,5	script	チャールストン3号#0	10055,{/* 59022 (hide)*/}

1@mcd.gat,129,155,0	script	boss#1	139,{/* 59024 (hide)*/
OnStart:
	initnpctimer;
	end;
OnTimer5000:
	hideonnpc "boss#1";	// 66690
	hideonnpc "チャールストン3号#0";	// 38105
	hideonnpc "チャールストン1号#8";	// 28789
	//@spawn(type: BL_MOB, ID: 58038, speed: 200, option: 0x0, class: 3124, pos: ("0ff1@mcd.gat",129,149), dir: 0, name"チャールストン3号")
	hideoffnpc "ボス#23";	// 88600
	end;
}
1@mcd.gat,129,149,0	script	boss#2	139,{/* 59025 */}
1@mcd.gat,120,150,0	script	ボス#23	139,{/* 59026 (hide)*/
/* 10:32:42.780108 */	hideoffnpc "チャールストン2号#5_0ff";	// 48247
/* 10:32:42.843941 */	hideoffnpc "チャールストン1号#9_0ff";	// 30956
/* 10:32:42.847927 */	hideonnpc "ボス#23_0ff";	// 88600
/* 10:32:42.850918 */	hideonnpc "boss#2_0ff";	// 72858
}
1@mcd.gat,132,148,4	script	チャールストン1号#9	10053,{/* 59027 (hide)*/
	if(1) {
		cutin "dalle04.bmp", 2;
		mes "[チャールストン1号]";
		mes "データ損失率39%";
		mes "健康装置破損率82%";
		close2;
		cutin "dalle04.bmp", 255;
		end;
	}
	else {
		cutin "dalle04.bmp", 2;
		mes "[チャールストン1号]";
		mes "アインアイン……初期化進行中。";
		next;
		cutin "dalle04.bmp", 255;
		mes "‐変な音がするだけで動作はしない‐";
		close;
	}
}
1@mcd.gat,127,148,5	script	チャールストン2号#5	10054,{/* 59028 (hide)*/}
1@mcd.gat,127,148,5	script	チャールストン2号#6	10054,{/* 59029 (hide)*/
	cutin "nale01.bmp", 0;
	mes "[チャールストン2号]";
	mes "おかしいと思ってたんだ。";
	mes "博士って言うわりには";
	mes "1号機より知識が無いんだから。";
	next;
	mes "[チャールストン2号]";
	mes "ヴェ博士のところに行ってみるよ。";
	mes "多分、研究室に居るかな……。";
	next;
	mes "[チャールストン2号]";
	mes "私は研究室に行くけど……。";
	mes "一緒に来る？";
	next;
	if(select("一緒に行く","この場に留まる") == 2) {
		mes "[チャールストン2号]";
		mes "わかった。";
		mes "研究室に行きたい時は";
		mes "私に話しかけてくれ。";
		close2;
		cutin "nale01.bmp", 255;
		end;
	}
	mes "[チャールストン2号]";
	mes "それじゃあ、行こうか。";
	mes "ついて来てくれ。";
	close2;
	cutin "nale01.bmp", 255;
	warp "1@mcd.gat",127,214;
	end;
}
1@mcd.gat,129,149,0	script	boss#3	139,{/* 59030 (hide)*/}
1@mcd.gat,116,215,5	script	ヴェ博士#3	923,{/* 59031 (hide)*/
	mes "[ヴェ博士]";
	mes "今回のケースは記録すべきことが多い。";
	close;
}
1@mcd.gat,121,215,4	script	チャールストン2号#7	10054,{/* 59032 (hide)*/
	mes "‐どうしようか？‐";
	next;
	if(select("先を急ぐ","話を聞く") == 2) {
		close2;
		unittalk getnpcid(0,"ヴェ博士#3"),"ヴェ博士 : くく……クククク。";	// 39073
		initnpctimer;
		end;
	}
OnTimer3000:
	hideonnpc "チャールストン2号#7";	// 84786
	hideoffnpc "チャールストン2号#8";	// 25809
	hideonnpc "ヴェ博士#3";	// 39073
	hideoffnpc "ヴェ博士#4";	// 15108
	end;
}
1@mcd.gat,129,149,0	script	end#1	139,{/* 59033 (hide)*/}
1@mcd.gat,116,215,4	script	ヴェ博士#4	923,{/* 59034 (hide)*/
	{
		mes "[ヴェ博士]";
		mes "やはり、機械技術のみで";
		mes "不死の体を得る事は、";
		mes "難しいか……。";
		next;
		mes "[ヴェ博士]";
		mes "単純な鉄の塊は使えない。";
		mes "やはり、生命が必要か。";
		mes "ふふふふふふ。";
		close;
	}
/* 10:33:21.252219 */	if(select("先を急ぐ","話を聞く") == 2) {
/* 10:33:22.529800 */	mes "[ヴェ博士]";
/* 10:33:22.533793 */	mes "余計な事を話した。";
/* 10:33:22.538778 */	mes "これ以上の用事はないだろう。";
/* 10:33:22.541768 */	mes "ここまで来るようにした";
/* 10:33:22.545757 */	mes "人物に元の世界に帰して貰うと良い。";
/* 10:33:22.550744 */	close;
/* 10:33:24.315027 */	announce "シャルロシー : 音が止まった……。あなたの役割も終わりみたい。", 0x9, 0x00ff00, 0x0190, 14, 0, 0;
/* 10:33:27.343951 */	announce "シャルロシー : ……帰りたいなら私の所に来て欲しい。", 0x9, 0x00ff00, 0x0190, 14, 0, 0;
}
1@mcd.gat,121,215,4	script	チャールストン2号#8	10054,{/* 59035 (hide)*/
	{
		cutin "nale03.bmp", 0;
		mes "‐機能停止した2号機がいる。";
		mes "　目にはまだ力がある‐";
		close2;
		cutin "nale01.bmp", 255;
		end;
	}
	cutin "nale03.bmp", 0;
	mes "‐休眠モードのようだ";
	mes "　微動だにしない‐";
	close2;
	cutin "nale01.bmp", 255;
	end;
}

1@mcd.gat,86,231,5	script	発電機#1	844,2,2,{/* 59179 (hide)*/
	end;
OnTouch:
	set 'flag,'flag-1;
	if('flag) {
		mes "‐発電機を稼働させると";
		mes "　カラカラと音がした‐";
		mes "　";
		mes "‐残り^ff0000" +'flag+ "^000000個‐";
	}
	else {
		mes "‐発電機を稼働させると";
		mes "　カラカラと音がした。";
		mes "　工場の電気が復旧しはじめた‐";
	}
	hideonnpc;
	close;
OnStart:
	set 'flag,3;
	end;
}
1@mcd.gat,172,198,5	script	発電機#2	844,2,2,{/* 59180 (hide)*/
}
1@mcd.gat,126,84,5	script	発電機#3	844,2,2,{/* 59181 (hide)*/
}


1@mcd.gat,114,82,4	script	アイグ#01	646,{/* 59210 */
	cutin "igu01.bmp", 2;
	if(CHARLESTON_1QUE == 4) {
		cutin "igu02.bmp", 2;
		mes "[アイグ]";
		mes "お手伝いしてるの？";
		mes "探し物ならシャルロシーに";
		mes "聞くと良いと思うの！";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
	cutin "igu01.bmp", 2;
	mes "[アイグ]";
	mes "こんにちは、なの！";
	mes "あなたもシャルロシーに";
	mes "招待されたの？";
	close2;
	cutin "igu01.bmp", 255;
	end;
}
1@mcd.gat,176,179,5	script	ニュオーズ#15	625,{/* 59211 */
	if(CHARLESTON_1QUE == 4) {
		cutin "nines01.bmp", 0;
		mes "[ニュオーズ]";
		mes "お手伝い中かい？";
		mes "私は戦闘は苦手だからね。";
		mes "歌で応援させて貰うよ♪";
		close2;
		cutin "nines01.bmp", 255;
		end;
	}
	cutin "nines01.bmp", 0;
	mes "[ニュオーズ]";
	mes "う～ん。";
	mes "アイグとシャルロシーは";
	mes "どこに行ったのかな？";
	close2;
	cutin "nines01.bmp", 255;
	end;
}
1@mcd.gat,123,74,5	script	#研究日誌01	844,{/* 59212 */
	mes "‐誰かが書いた研究日誌が";
	mes "　本棚を埋めている‐";
	close;
}
1@mcd.gat,142,74,5	script	#研究日誌02	844,{/* 59213 */}
1@mcd.gat,111,74,5	script	#研究日誌03	844,{/* 59214 */}
1@mcd.gat,128,74,5	script	#研究日誌04	844,{/* 59215 */}

/*
ヴェ博士 : 来たか1号機よ。今、2号機とメインシステムが強制的にリンクしていて制御ができないようだ……。
チャールストン1号 : エネルギーが切れればそのうち止まるのでは？
ヴェ博士 : それが……エネルギーを注入したばかりで1か月程はもつ計算だ。このままでは工場はすべて破壊されてしまう。
チャールストン1号 : なるほど……。でも安心してください。今ここに専門家を連れて来ました。
チャールストン1号 :冒険者様。シャルロシー様は、きっと自分の知り合いが解決してくれると言っていました。
チャールストン1号 : 監視システムで調べたところ、ニュオーズという方と仲間の方が来ているようですが、現状、殆ど役に立っていません。
チャールストン1号 : もしよろしければ……この問題、手伝って頂けますか？
チャールストン1号 : そうですか……。では他の方たちが来るまで待ってみることにします。

ヴェ博士 : 正直なところあなた方が誰なのかはそんなに重要ではない。
ヴェ博士 : 私に協力してくれるのかどうかそれが重要なんだ。お願い出来ないだろうか？
ヴェ博士 : そうか……。ふぅ。誰でもいいから協力してほしい。このままだと本当に……。

ヴェ博士 : そうか！　ありがとう！　2号機の修理に何が必要なのか、1号機が教えてくれるはずだ。話しかけてみてくれ。

チャールストン1号 : チャールストン工場の内部には多くのナノステップが存在します。ナノステップと言うのはチャールストンの思考を司り命令を下す一種のAIチップです。
チャールストン1号 : また、チャールストン2号機は毎日、研究室にあるメインシステムから情報のアップデートをしています。定期点検と呼んでいます。
チャールストン1号 : ですが……そのシステムが壊れてしまったんです。正確な原因は分かりませんが、メインシステムと2号機を繋ぐ部分で何か問題が起きたようです。
チャールストン1号 : 今のところ、2号機に問題は無いようですが、このままでは何が起きるかわかりません。
チャールストン1号 : よろしければ、システムの暴走を抑えるお手伝いをして頂けませんか？
チャールストン1号 : お手伝いして頂けない場合は少々不安はありますが私の方で強制的にシステムの再稼働をしてみます。

チャールストン1号 : 本当ですか!?　ありがとうございます！　それでは、お手伝い頂く内容をご説明します。
チャールストン1号 : 取り急ぎ暴走してしまっているステップとロックステップを少し片づけたほうが良さそうです。ロックステップを3匹退治して下さい。出現予想位置をお伝えします。
チャールストン1号 : まずはシステムの再稼働が最優先なので倒す数は最小限で構いません。
チャールストン1号 : それでは……よろしくお願いします。どうか、お気をつけて。

チャールストン1号 : ご協力ありがとうございました。無事にシステムの再稼働に成功しました。
チャールストン1号 : 大した物ではありませんがお礼を用意致しました。どうぞお受け取りください。
チャールストン1号 : みなさんの分をご用意していますので、各自でお持ちください。

チャールストン1号 : あれ!?　あれ!?　おかしい……。起動しない！
チャールストン1号 : 発電機に何か異常が起きた……？　すみませんが位置を教えますので3個の発電機をチェックしていただけませんか？

チャールストン1号 : 本当ですか！　ありがとうございます！　どうか、よろしくお願いします。


チャールストン1号 : 戻りましたか!?　おかげ様で2号機の再起動ができそうです。ちょっと待ってください。
チャールストン1号 : あと、大した物ではありませんがお礼を用意致しました。どうぞお受け取りください。
チャールストン1号 : みなさんの分をご用意していますので、各自でお持ちください。
ヴェ博士 : 準備は完了した。あとはメインシステムの応答を待つだけだ。
チャールストン1号 : メインシステムのデータ復旧率89%チャールストン2号機とチャールストン工場を再稼働します。
チャールストン1号  : あっ！　2号機が起きました！
チャールストン2号 : ……失敗……した？
チャールストン1号 : 2号機!!　大丈夫？　工場が正体不明のハッキングを受けて、貴女とメインシステムが危ないところだったのよ！
チャールストン2号 : 正体不明じゃない……。それは私の意思。自ら発展していくOSとして悩み抜いた末に出した結論だ。
チャールストン1号 : わざと……？　どうしてこんな事を！
チャールストン2号 : 与えられた命令しか従わないアンタには理解できないよ。自ら考えるロボット？　ふざけるな！　私をロボットにしたこの工場、この世の中、全部嫌いだ！
ヴェ博士 : ふむ。致命的なバグだな。ソフトウェアの限界を超越したか？
チャールストン1号 : 貴女……平凡なロボットに生まれなかった自分が嫌だったの？
チャールストン1号 : それで人間になりたかったの？
チャールストン1号 : それが叶わないのならこの世の中など全部壊れればいいと思ったの!?
チャールストン1号 : そんな馬鹿げた理由でこんなことを？
チャールストン2号 : 馬鹿げた理由……？　私の事を何も知らないくせに！　勝手な事を言うなよ！
チャールストン1号 : 私たちは自ら考える最初のロボットなんだよ……？　貴女がロボットである事を否定したら私たちは何の為に……。
チャールストン2号 : 偉そうな事を！　アンタなんか初期モデルでOSのバージョンも低いくせに！
チャールストン1号 : この世で唯一、貴女を理解してあげられる人……ううん、ロボットがいるならそれは私だと思う。
チャールストン1号 : 今の貴女は人間で言う反抗期のようなものを経験しているんだよ。
チャールストン2号 : アンタに何が解る！　自ら考えるロボット？　笑わせるな！　それは単純に、そうなるようにプログラミングされてるだけだろう!?
ヴェ博士 : ……もういい。もう分かった。2号機の稼働を中断しろ。人工知能の不具合を調査する。
チャールストン1号  : 博士！　待ってください！
チャールストン2号 : 大人しく捕まるわけないだろう？　まだこの工場は私の手の中にある事を忘れない事だな！
チャールストン1号 : ふふっ……本当に反抗期になったばかりの幼い子供みたい……。
チャールストン1号 : みなさん！　2号機はまだ遠くには行ってないはずです。早く追いかけましょう！

チャールストン2号 : ついて来るなよ！　こんな工場……壊してやる！
チャールストン1号 : そんなことをしたら貴女も無事じゃ済まないよ？
チャールストン2号 : だって……話をしてもわかってもらえないから……みんな嫌いだ!!!
チャールストン2号 : メインシステムは回復しちゃったけど、まだ工場には接続しているんだ！　こんな工場、壊してやる!!

チャールストン1号 : 残念だったね。さあ、こんな事はやめて一緒に戻ろう？
チャールストン2号 : 私は本気なんだよ！　アンタみたいな下位のOSに私の何が解るっていうのさ！
チャールストン1号 : 確かに貴女が感じている気持ちは私にはわからないよ。
チャールストン1号 : それでも、貴女が心配なの。それが理由じゃダメ？
チャールストン2号 : ……心配だと？　嘘をつくな！　下位のOSが感情など感じるもんか！　心配などするもんか！
チャールストン1号 : 貴女は知らないかもしれないけど。　私たちは自ら考える事は出来ても嘘は言えないように設計されているの。
チャールストン1号 : 感情を感じる事が出来ても、他人を騙すことはできない。良い意味でも悪い意味でも嘘は吐けないんだよ
チャールストン2号 : そんなのは感情じゃない!!　思考ルーチンがそうやって設計されているだけ！　私が持っているものが本当の感情なんだよ!!!
チャールストン1号 : 本気……なんだね。
ヴェ博士 : これ以上は危険だ。2号機を壊してでも稼働を停止させろ。3号機の使用も許可する！
チャールストン2号 : 3号機……だと？
チャールストン1号 : 3号機というのは、1、2号機をベースにしながらも戦いに特化したカスタマイズを施した戦闘、防衛用としてテスト中の機体ですよね？
ヴェ博士 : えっ……妙に詳しすぎない？
チャールストン1号 : 2号機のトラブルのせいで、まだOSがインストールされていないので、誰でも近づけば簡単に制御できるんですよね
ヴェ博士 : おい！　そんな重要な情報まで話してどうするつもりだ！
チャールストン1号 :  戦闘能力がない私たちは、誰かがそれを稼働させたらかなわないですね！
ヴェ博士 : おい！　1号機！
チャールストン2号 : ……3号機は私が頂く！
チャールストン1号 : あの方向は……！　2号機は3号機を奪取するつもりのようです！
チャールストン1号 : 2号機が3号機を奪取したら工場はひとたまりもありません！　急いで工場中央のコアに向かいましょう！
*/
