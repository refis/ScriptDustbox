// イスガルド汎用クエスト処理ファンクション
//
// getarg(0)  クエスト名称配列
// getarg(1)  納品クエストの場合必要アイテムのID、NUM配列
//            ID0で区切ると複数クエスト扱いになります
//            討伐のみの場合は有効配列0
// getarg(2)  クエストID配列
// getarg(3)  クールタイムID配列
// getarg(4)  報酬アイテムID、NUM配列
// getarg(5)  EXP配列
// getarg(6)  終了クエストID配列
function	script	IsgardDQ	{
	function EXP_SEPFIX;

	set '@max,getarraysize(getarg(0));
	mes "クエストの受注や報告、";
	mes "取り消しが可能です。";
	next;
	copyarray '@q_nametbl$,getarg(0),'@max;
	setarray '@s_msg$,"[^ff0000挑戦中^000000]","[^ff0000納品○・討伐×^000000]","[^ff0000納品×・討伐○^000000]","[受注可]","[^ff0000報告可^000000]","[^888888時間制限中^000000]";
	setarray '@menu$[1],"全て受注する","全て報告する","全て破棄する";
	for('@i=0;'@i<'@max;'@i++) {
		// 有効配列0(討伐のみ)、または必要アイテム不足
		set '@q_name$,getelementofarray(getarg(0),'@i);
		set '@item_max,getarraysize(getarg(1));
		'@flag |= 3;

		// 納品ありは所持チェック
		if('@item_max > 0) {
			for('@j='@k;'@j<'@item_max;'@j='@j+2) {
				if(getelementofarray(getarg(1),'@j) == 0) {
					set '@k,'@j+1;
					break;
				}
				if(countitem(getelementofarray(getarg(1),'@j)) < getelementofarray(getarg(1),'@j+1))
					'@flag &= ~1;
			}
		}

		// 討伐ありは討伐チェック
		set '@quest,getelementofarray(getarg(2),'@i);
		if(getquestmaxcount('@quest) > 0)
			if(checkquest('@quest) && !(checkquest('@quest)&4) )
				'@flag &= ~2;

		// 会話ありは終了クエスト獲得チェック
		if(getargcount() > 6)
			if(checkquest(getelementofarray(getarg(6),'@i)) == 0)
				'@flag &= ~3;

		// 納品のみ　NG　2:　OK　3
		// 討伐のみ　NG　1:　OK　3
		// 両方　　　討伐NG　納品NG　0
		// 両方　　　討伐NG　納品OK　1
		// 両方　　　討伐OK　納品NG　2
		// 両方　　　討伐OK　納品OK　3
		if(checkquest('@quest) == 0 && (checkquest(getelementofarray(getarg(3),'@i)) == 0 || checkquest(getelementofarray(getarg(3),'@i))&2))
			set '@type['@i],3;
		else if(checkquest(getelementofarray(getarg(3),'@i)))
			set '@type['@i],5;
		else if('@flag < 3) {
			if('@flag && '@item_max > 0 && '@quest > 0) {
				set '@type['@i], '@flag == 1? 1: 2;
			}
			else
				set '@type['@i],0;
		}
		else
			set '@type['@i],4;
		set getelementofarray(getarg(0),'@i),'@s_msg$['@type['@i]]+" "+'@q_name$;
		if('@type['@i] <= 2)
			'@swich |= 1;
	}
	// menuの入れ替え
	if('@swich)
		setarray '@selecter[0],2,0,1,3;
	else
		setarray '@selecter[0],1,2,0,3;
	for('@i=0;'@i<getarraysize('@selecter);'@i++) {
		if('@selecter['@i] == 0) {
			for('@j=0;'@j<'@max;'@j++) {
				set '@menu_array$[getarraysize('@menu_array$)],getelementofarray(getarg(0),'@j);
				set '@list[getarraysize('@list)],'@j+getarraysize('@selecter);
			}
		}
		else {
			set '@menu_array$[getarraysize('@menu_array$)],'@menu$['@selecter['@i]];
			set '@list[getarraysize('@list)],'@selecter['@i];
		}
	}
	set '@sel,select(printarray('@menu_array$)) - 1;
	switch('@list['@sel]) {
	case 1:
		mes "^ff0000[インフォメーション]^000000";
		mes "^ff0000現在、受注可能な表示のクエストを^000000";
		mes "^ff0000全て一括で受注することが出来ます。^000000";
		mes "^ff0000クエストの一括受注を行いますか？^000000";
		next;
		if(select("一括受注を行う","やめる") == 2) {
			mes "^ff0000[インフォメーション]^000000";
			mes "^ff0000処理を中断しました。^000000";
			close2;
			cutin "", 255;
			end;
		}
		for('@i=0; '@i < '@max; '@i++) {
			// クエストを受けていない、かつクールタイムがついてないかクールタイム明けなら受注
			if( checkquest(getelementofarray(getarg(2),'@i)) == 0 && (checkquest(getelementofarray(getarg(3),'@i)) == 0 || (checkquest(getelementofarray(getarg(3),'@i))&2)) )
				set '@setquest[getarraysize('@setquest)],'@i+1;
		}
		if(getarraysize('@setquest) == 0) {
			mes "[インフォメーション]";
			mes "受注可能なクエストが存在しません。";
			close2;
			cutin "", 255;
			end;
		}
		mes "<<B>クエスト</B>>";
		for(set '@i,0; '@i < getarraysize('@setquest); set '@i,'@i+1) {
			setquest getelementofarray(getarg(2),'@setquest['@i]-1);
			delquest getelementofarray(getarg(3),'@setquest['@i]-1);
			if(getelementofarray(getarg(2),'@setquest['@i]-1) == 17651)	// 地上からの隠れ処探し
				getitem 1000842,6;
			mes "「^ff0000" +'@q_nametbl$['@setquest['@i]-1]+ "^000000」";
		}
		mes "を受注しました。";
		close2;
		cutin "", 255;
		end;
	case 2:
		mes "^ff0000[インフォメーション]^000000";
		mes "^ff0000クエスト達成の条件が^000000";
		mes "^ff0000モンスター討伐・アイテム納品の^000000";
		mes "^ff0000いずれか1つの場合、^000000";
		mes "^ff0000どちらの条件も満たしている場合は^000000";
		mes "^ff0000モンスター討伐を優先して報告します。^000000";
		mes "^ff0000この場合、アイテムは納品されません。^000000";
		next;
		for(set '@i,0; '@i < '@max; set '@i,'@i+1) {
			// クエストを受けていて討伐済み、かつアイテムリスト設定があるなら持っていれば報告
			if( checkquest(getelementofarray(getarg(2),'@i)) && (checkquest(getelementofarray(getarg(2),'@i))&4) && 
				(getarraysize(getarg(1)) == 0 || countitem(getelementofarray(getarg(1),'@i*2)) >= getelementofarray(getarg(1),'@i*2+1)) ) {
				set '@repoquest[getarraysize('@repoquest)],'@i+1;
				if(getarraysize(getarg(1)) >= 2)
					set '@count,1;
			}
		}
		if('@count) {
			mes "<<B>納品アイテム</B>>";
			for('@i=0; '@i < getarraysize('@repoquest); '@i++) {
				mes "アイテム：<ITEM>" +getitemname(getelementofarray(getarg(1),('@repoquest['@i]-1)*2))+ "<INFO>" +getelementofarray(getarg(1),('@repoquest['@i]-1)*2)+ "</INFO></ITEM>　" +getelementofarray(getarg(1),('@repoquest['@i]-1)*2+1)+ "個";
			}
			mes "こちらのアイテムを納品しても";
			mes "よろしいですか？";
			next;
			if(select("やめる","一括報告に進む") == 1) {
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "", 255;
				end;
			}
		}
		mes "[インフォメーション]";
		mes "報告可能なクエストを全て一括で";
		mes "報告することが出来ます。";
		mes "クエストの一括報告を行いますか？";
		next;
		if(select("一括報告を行う","やめる") == 2) {
			mes "^ff0000[インフォメーション]^000000";
			mes "^ff0000処理を中断しました。^000000";
			close2;
			cutin "", 255;
			end;
		}
		if(getarraysize('@repoquest) == 0) {
			mes "[インフォメーション]";
			mes "報告可能なクエストが存在しません。";
			close2;
			cutin "", 255;
			end;
		}
		mes "<<B>クエスト</B>>";
		if(checkitemblank() < getarraysize('@repoquest)) {
			mes "[インフォメーション]";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes getarraysize('@repoquest)+"個以上の空きを作ってください。";
			close2;
			cutin "", 255;
			end;
		}
		for('@i=0; '@i < getarraysize('@repoquest); '@i++) {
			if(getarraysize(getarg(1)) >= 2)
				delitem getelementofarray(getarg(1),('@repoquest['@i]-1)*2),getelementofarray(getarg(1),('@repoquest['@i]-1)*2+1);
			delquest getelementofarray(getarg(2),('@repoquest['@i]-1));
			setquest getelementofarray(getarg(3),('@repoquest['@i]-1));
			if(getelementofarray(getarg(4),('@repoquest['@i]-1)*2)) {
				getitem getelementofarray(getarg(4),('@repoquest['@i]-1)*2),getelementofarray(getarg(4),('@repoquest['@i]-1)*2+1);
				set '@count2,1;
			}
			for(set '@j,0; '@j < 20; set '@j,'@j+1) {
				getexp getelementofarray(getarg(5),('@repoquest['@i]-1)*2),0,0;
				set '@baseexp,'@baseexp + getelementofarray(getarg(5),('@repoquest['@i]-1)*2) / 1000;
			}
			for(set '@j,0; '@j < 20; set '@j,'@j+1) {
				getexp 0,getelementofarray(getarg(5),('@repoquest['@i]-1)*2+1),0;
				set '@jobexp,'@jobexp + getelementofarray(getarg(5),('@repoquest['@i]-1)*2+1) / 1000;
			}
			mes "「^ff0000" +'@q_nametbl$[('@repoquest['@i]-1)]+ "^000000」";
		}
		mes "の報告が完了しました。";
		if('@baseexp) {
			next;
			set '@exp$,EXP_SEPFIX('@baseexp);
			mes "^0000ff<<B>報酬</B>>^000000";
			mes "BaseExp " +'@exp$;
			mes "( " +'@baseexp+"000 )";
			mes "※BaseExpを受け取りました。";
		}
		if('@jobexp) {
			next;
			set '@exp$,EXP_SEPFIX('@jobexp);
			mes "^0000ff<<B>報酬</B>>^000000";
			mes "JobExp " +'@exp$;
			mes "( " +'@jobexp+"000 )";
			mes "※JobExpを受け取りました。";
		}
		if('@count2) {
			next;
			mes "^0000ff<<B>報酬</B>>^000000";
			for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1)
				mes "アイテム：<ITEM>" +getitemname(getelementofarray(getarg(4),('@repoquest['@i]-1)*2))+ "<INFO>" +getelementofarray(getarg(4),('@repoquest['@i]-1)*2)+ "</INFO></ITEM>　" +getelementofarray(getarg(4),('@repoquest['@i]-1)*2+1)+ "個";
			mes "を獲得しました。";
		}
		close2;
		cutin "", 255;
		end;
	case 3:
		mes "^ff0000[インフォメーション]^000000";
		mes "^ff0000現在、挑戦中表示のクエストを^000000";
		mes "^ff0000全て一括で破棄することが出来ます。^000000";
		mes "^ff0000報告可、時間制限中のクエストは^000000";
		mes "^ff0000破棄の処理が行われません。^000000";
		mes "^ff0000クエストの一括破棄を行いますか？^000000";
		next;
		if(select("やめる","全て破棄する") == 1) {
			mes "^ff0000[インフォメーション]^000000";
			mes "^ff0000処理を中断しました。^000000";
			close2;
			cutin "", 255;
			end;
		}
		for('@i=0; '@i < '@max; '@i++) {
			// クエストを受けていて討伐完了していない、かつクールタイムがついてないかクールタイム明けなら破棄
			if( checkquest(getelementofarray(getarg(2),'@i)) && !(checkquest(getelementofarray(getarg(2),'@i))&4) &&
				(checkquest(getelementofarray(getarg(3),'@i)) == 0 || (checkquest(getelementofarray(getarg(3),'@i))&2)) )
				set '@delquest[getarraysize('@delquest)],'@i+1;
		}
		if(getarraysize('@delquest) == 0) {
			mes "[インフォメーション]";
			mes "破棄出来るクエストが存在しません。";
			close2;
			cutin "", 255;
			end;
		}
		mes "<<B>クエスト</B>>";
		for('@i=0; '@i < getarraysize('@delquest); '@i++) {
			delquest getelementofarray(getarg(2),'@delquest['@i]-1);
			if(getelementofarray(getarg(2),'@delquest['@i]-1) == 17651)	// 地上からの隠れ処探し
				getitem 1000842,countitem(1000842);
			mes "「^ff0000" +'@q_nametbl$['@delquest['@i]-1]+ "^000000」";
		}
		mes "を破棄しました。";
		close2;
		cutin "", 255;
		end;
	default:
		return ('@list['@sel]-4);
	}
	function EXP_SEPFIX {
		set '@num$,getarg(0);
		set '@len,getstrlen('@num$);
		set '@type,('@len >= 10)? 0: (('@len >= 7)? 1: (('@len >= 4)? 2: 3) );
		setarray '@sep,9,6,3,0;
		setarray '@c$,"T","G","M","K";
		for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
			if(substr('@num$,-1) == "0") {
				set '@num$,substr('@num$,0,-1);
			}
			else
				break;
		}
		return substr('@num$,0,('@len - '@sep['@type])) +(substr('@num$,('@len - '@sep['@type]))!=""? ".": "")+ substr('@num$,('@len - '@sep['@type])) +'@c$['@type];
	}
}

//isgard.sc 内 NPCと置き換え
icecastle.gat,204,165,0	script	#ep19_evt_3	139,7,7,{/* 2522 */
	cloakonnpc "レハール#ep19lehar_1";
	if(EP19_1QUE == 10)
		cloakoffnpc "レハール#ep19lehar_1";
	cloakonnpc "ホルル#ep20_1";
	if(EP19_1QUE == 100 && EP20_1QUE == 0 && BaseLevel >= 240)
		cloakoffnpc "ホルル#ep20_1";
	end;
}

icecastle.gat,52,124,3	script	シャリャラ#ep19iwin06	21515,{/* 2822 */
	if(EP19_1QUE < 23) {
		mes "[シャリャラ]";
		mes "氷道に気を付けて？";
		mes "すっげぇ滑るんだよ～？";
		close2;
		cutin "ep19_iwin04.png", 255;
		end;
	}
	cutin "ep19_iwin04.png", 2;
	mes "[シャリャラ]";
	mes "ルガンの巣に潜入する仕事、ご苦労様。";
	mes "今日も潜入しに行くの？";
	mes "氷道で歩き辛いだろうから、";
	mes "ちょっと手伝おうか？";
	mes "手数料は^0000ff500Zeny^000000だよ。";
	while(1) {
		next;
		setarray '@str$,"必要ない","蛇の巣","氷の城(イスガルド 氷の城)","ヴェルグンデの研究室(イスガルド 室内)","ゾリャラのキッチン(イスガルド 室内)","^999999？？？^000000","^999999？？？^000000","^999999？？？^000000","^999999？？？^000000";
		if(EP19_2QUE >= 19) {	// 未調査
			set '@str$[0],"フリーデリケの滞在所(イスガルド 室内)";
			set '@str$[1],"ヘルロックの所(凍て付いた尻尾)";
		}
		if(EP20_1QUE >= 100) {
			set '@str$[2],"蛇神の根源 聖域";
			set '@str$[3],"イスガルドの聖域 小さな枝の在り処";
		}
		switch(select(printarray('@str$))) {
		case 1:
			mes "[シャリャラ]";
			mes "もしも、道で転びそうだったら";
			mes "言ってくれ。";
			mes "私が氷の城の神速配達アーウィンだよ。";
			mes "人間一人飛ばすのは、";
			mes "お茶の子さいさいだぜ。";
			close2;
			cutin "ep19_iwin04.png", 255;
			end;
		case 2:
			if(EP19_1QUE >= 63 && EP19_1QUE <= 67) {
				mes "[シャリャラ]";
				mes "^0000ff蛇の巣^000000か？";
				mes "今は、直接向かうわけにはいかないから、";
				mes "付近まで飛ばすぜ！";
				close2;
				cutin "ep19_iwin04.png", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_que.gat", 281, 87;
				end;
			}
			mes "[シャリャラ]";
			mes "^0000ff蛇の巣^000000だな？";
			mes "前はルガンに変身して行っただろ？";
			mes "すっげぇ楽しかったよ。";
			mes "あの時に道を覚えたからな。";
			mes "それじゃあ、";
			mes "巣の入口に飛ばすぜ！";
			close2;
			cutin "ep19_iwin04.png", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_nest.gat", 275, 19;
			end;
		case 3:
			set '@name$,"氷の城";
			set '@map$,"icas_in.gat";
			setarray '@xy,138,187;
			break;
		case 4:
			set '@name$,"ヴェルグンデの研究室";
			set '@map$,"icas_in.gat";
			setarray '@xy,190,61;
			break;
		case 5:
			set '@name$,"ゾリャラのキッチン";
			set '@map$,"icas_in.gat";
			setarray '@xy,237,62;
			break;
		case 6:
			if(EP19_2QUE < 19) {	// 未調査
				mes "^ff0000クエスト^000000";
				mes "^ff0000「浄化の聖女」を^000000";
				mes "^ff0000途中まで進めると^000000";
				mes "^ff0000利用できるようになります。^000000";
				continue;
			}
			set '@name$,"フリーデリケの滞在所";
			set '@map$,"icas_in.gat";
			setarray '@xy,33,112;
			break;
		case 7:
			if(EP19_2QUE < 19) {	// 未調査
				mes "^ff0000クエスト^000000";
				mes "^ff0000「浄化の聖女」を^000000";
				mes "^ff0000途中まで進めると^000000";
				mes "^ff0000利用できるようになります。^000000";
				continue;
			}
			set '@name$,"ヘルロックの所";
			set '@map$,"jor_tail.gat";
			setarray '@xy,214,60;
			break;
		case 8:
			if(EP20_1QUE < 100) {
				mes "^ff0000クエスト^000000";
				mes "^ff0000「死なない者」を^000000";
				mes "^ff0000途中まで進めると^000000";
				mes "^ff0000利用できるようになります。^000000";
				continue;
			}
			set '@name$,"蛇神の根源 聖域";
			set '@map$,"jor_sanct.gat";
			setarray '@xy,150,80;
			break;
		case 9:
			if(EP20_1QUE < 100) {
				mes "^ff0000クエスト^000000";
				mes "^ff0000「死なない者」を^000000";
				mes "^ff0000途中まで進めると^000000";
				mes "^ff0000利用できるようになります。^000000";
				continue;
			}
			mes "^0000ffイスガルドの聖域 ^000000";
			mes "^0000ff小さな枝の在り処^000000だな？";
			mes "人間一人飛ばすのは、";
			mes "お茶の子さいさいだぜ。";
			close2;
			cutin "ep19_iwin04.png", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_twig.gat",125,157;
			end;;
		}
		break;
	}
	mes "[シャリャラ]";
	mes "^0000ff" +'@name$+ "^000000だな？";
	mes "人間一人飛ばすのは、";
	mes "お茶の子さいさいだぜ。";
	close2;
	cutin "ep19_iwin04.png", 255;
	if(Zeny < 500)
		end;
	set Zeny, Zeny -500;
	warp '@map$, '@xy[0], '@xy[1];
	end;
}

icas_in.gat,32,122,0	script	#seizyo_sw	139,10,10,{/* 2919 */
	switch(EP19_2QUE) {
	case 0:
		end;
	case 19:
	case 20:
		cloakoffnpc "フリーデリケ#ep19_seizy";
		cloakoffnpc "レハール#ep19_room";
		end;
	case 21:
		cloakoffnpc "フリーデリケ#ep19_seizy";
		cloakoffnpc "シュルル#ep19_dq_jorab";
		end;
	default:
		cloakoffnpc "フリーデリケ#ep19_seizy";
		cloakoffnpc "シュルル#ep19_dq_jorab";
		cloakoffnpc "タマリン#ep19_refrigera";
		if(EP20_3QUE == 1) {
			cloakoffnpc "コポ#ep20_1";
			cloakoffnpc "コポ#ep20_2";
			cloakoffnpc "コポ#ep20_3";
			cloakoffnpc "コポ#ep20_4";
			mes "‐わいわい　がやがや‐";
			next;
			mes "！！！！！！";
			next;
			cloakonnpc "コポ#ep20_1";
			cloakonnpc "コポ#ep20_2";
			cloakonnpc "コポ#ep20_3";
			cloakonnpc "コポ#ep20_4";
			mes "[フリーデリケ]";
			mes "あら？";
			mes "みんな、どうしちゃったの？";
			cutin "ep19_friederike02.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "あ！";
			mes strcharinfo(0)+"様";
			mes "こんにちは～。";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[フリーデリケ]";
			mes strcharinfo(0)+"様を見て";
			mes "みんな、隠れちゃったみたい。";
			mes "恥ずかしがり屋さんだね～。";
			cutin "ep19_friederike05.png", 2;
			next;
			menu "箱を渡す",-;
			mes "[フリーデリケ]";
			mes "わぁ！";
			mes "わざわざありがとうございます。";
			mes "ヴォークリンデ様からですか？";
			mes "おば様、何をくれたのかな？";
			cutin "ep19_friederike03.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "かさかさ……。";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "あっ！";
			mes "これは前に頼んでた毛糸の靴下！";
			mes "ふわふわのもこもこで";
			mes "とっても可愛い～！";
			cutin "ep19_friederike03.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "そして、ヒナレのお茶と……";
			mes "タタリン宛の手紙……。";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "ポリンクリスプ！";
			mes "しかも新フレ～バ～だぁ!!";
			cutin "ep19_friederike02.png", 2;
			next;
			cloakoffnpc "コポ#ep20_1";
			mes "[ちびアーウィン]";
			mes "お菓子？";
			mes "美味しそう！";
			mes "早く食べようよ～！";
			cutin "ep20_cocopo02.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "今は、ダメだよ～。";
			cutin "ep19_friederike01.png", 2;
			next;
			cloakoffnpc "コポ#ep20_2";
			mes "[ちびアーウィン]";
			mes "え～～～なんでぇ～～？";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "お菓子はお食事の後に";
			mes "食べるものだから。";
			cutin "ep19_friederike01.png", 2;
			next;
			cloakoffnpc "コポ#ep20_3";
			mes "[ちびアーウィン]";
			mes "今食べちゃダメなの？";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "ダメよ～！";
			mes "ご飯の前にお菓子を食べちゃうと";
			mes "ヴォークリンデ様に叱られるんだから！";
			cutin "ep19_friederike04.png", 2;
			next;
			cloakoffnpc "コポ#ep20_4";
			mes "[ちびアーウィン]";
			mes "だけど、フリーデリケさまも";
			mes "ご飯の前にお菓子食べたよね？";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[タマリン]";
			mes "それでマークイシャと";
			mes "ヴォークリンデ様に叱られてましたね。";
			cutin "ep19_tamarin04.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "あ～～っ。";
			cutin "ep19_friederike02.png", 2;
			next;
			mes "[ちびアーウィン]";
			mes "フリーデリケさまも";
			mes "ヴォークリンデさまに";
			mes "叱られちゃったんだ～。";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "も～～なんで言っちゃうの～！";
			mes "でも、タタリンも一緒に叱られたよね！";
			cutin "ep19_friederike04.png", 2;
			next;
			mes "[タマリン]";
			mes "私はお菓子を食べたからじゃなくて";
			mes "フリーデリケ様がお菓子を食べるのを";
			mes "止めなかったから叱られたんです。";
			mes "それとタタリンじゃなくて";
			mes "タマリンなんですけど……。";
			cutin "ep19_tamarin02.png", 2;
			next;
			mes "[ちびアーウィン]";
			mes "喧嘩はダメー！";
			mes "ママが友達とは仲良くしないと";
			mes "いけないって言ってたよ～。";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[ちびアーウィン]";
			mes "そうそう！";
			mes "だからお菓子はご飯の後に食べようよ。";
			mes "それまで我慢できるよね？";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[タマリン]";
			mes "口が達者なちびっこだなぁ……。";
			cutin "ep19_tamarin03.png", 2;
			next;
			mes "[ちびアーウィン]";
			mes "でもでもママは";
			mes "友達と仲良くしなさいって言うくせに";
			mes "峡谷に住むアーウィンたちには";
			mes "近づいちゃダメ、って言うんだよ？";
			cutin "ep20_cocopo03.png", 2;
			next;
			menu "峡谷のアーウィン？",-;
			mes "[ちびアーウィン]";
			mes "冒険者さまも知らないことがあるんだ！";
			mes "北の峡谷にはアーウィン達が";
			mes "たくさん住んでるんだよ。";
			cutin "ep20_cocopo02.png", 2;
			next;
			mes "[ちびアーウィン]";
			mes "すっげー昔には";
			mes "一緒に住んでいたけど";
			mes "今はそうじゃないんだって～。";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[ちびアーウィン]";
			mes "一緒に住めばいいのにな～。";
			mes "ここに来れば、暖かい家もあって";
			mes "美味しいお菓子も食べられるのに～！";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "ロロヒュは、いい子だね～。";
			cutin "ep19_friederike03.png", 2;
			next;
			mes "[ロロヒュ]";
			mes "そ、そんなんじゃないもん！";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[タマリン]";
			mes "恥ずかしがり屋だね～。";
			cutin "ep19_tamarin04.png", 2;
			next;
			mes "[ロロヒュ]";
			mes "ふん！";
			mes "二人ともからかって！";
			mes "もう、ご飯食べにおうちに帰るから！";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "あっ！";
			mes "そういえば、もうこんな時間？";
			mes "遅くなる前に、他のコポたちも";
			mes "おうちに帰らせなくっちゃ～。";
			cutin "ep19_friederike02.png", 2;
			close2;
			cutin "ep19_friederike03.png", 255;
			chgquest 11928,11929;
			set EP20_3QUE,2;
			end;
		}
		if(EP20_3QUE >= 2 && EP20_3QUE <= 5) {
			if(EP20_3QUE <= 2)
				cloakoffnpc "コポ#ep20_1";
			else
				cloakonnpc "コポ#ep20_1";
			if(EP20_3QUE <= 3)
				cloakoffnpc "コポ#ep20_2";
			else
				cloakonnpc "コポ#ep20_2";
			if(EP20_3QUE <= 4)
				cloakoffnpc "コポ#ep20_3";
			else
				cloakonnpc "コポ#ep20_3";
			cloakoffnpc "コポ#ep20_4";
			mes "[フリーデリケ]";
			mes "あっ！";
			mes "そういえば、もうこんな時間？";
			mes "遅くなる前に、他のコポたちも";
			mes "おうちに帰らせなくっちゃ～。";
			cutin "ep19_friederike02.png", 2;
			close2;
			cutin "ep19_friederike03.png", 255;
			end;
		}
		if(EP20_3QUE == 6) {
			cloakonnpc "コポ#ep20_1";
			cloakonnpc "コポ#ep20_2";
			cloakonnpc "コポ#ep20_3";
			cloakoffnpc "コポ#ep20_4";
			mes "[フリーデリケ]";
			mes "しょうがないなぁ～。";
			mes "私はこの子の家を知っていますから";
			mes "送り届けますね。";
			cutin "ep19_friederike02.png", 2;
			next;
			mes "[タマリン]";
			mes "あっ！";
			mes "お出かけですか？";
			cutin "ep19_tamarin02.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "遠くはないから";
			mes "すぐ帰って来るよ。";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[タマリン]";
			mes "う～ん……";
			mes strcharinfo(0)+"様、";
			mes "フリーデリケ様だけでは心配なので";
			mes "一緒について行ってもらえませんか？";
			cutin "ep19_tamarin01.png", 2;
			next;
			mes "[フリーデリケ]";
			mes "街の中を歩くだけだから";
			mes "大丈夫だよ～。";
			cutin "ep19_friederike04.png", 2;
			next;
			mes "[タマリン]";
			mes "最近よくない噂があるんです。";
			mes "杞憂だと思いますが、お願いします。";
			cutin "ep19_tamarin01.png", 2;
			next;
			cutin "ep19_tamarin04.png", 255;
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
			warp "icecastle.gat", 65, 213;
			end;
		}
		end;
	}
	end;
}

-	shop	icas_in#callshop2	-1,1100006:1200
//-	exchange	icas_in#callexchange	-1,102202:1001217:100
icas_in.gat,175,63,3	script	ホヨヨ#ep19trader	10461,{/* 2953 */
	cutin "ep19_iwin02.png", 2;
	mes "[ホヨヨ]";
	mes "ヴェルグンデ様と共に";
	mes "ヨルムンガンド様の魔力を研究中です。";
	mes "アーウィン界で話題の";
	mes "スーパーフードを超えた";
	mes "ウルトラフード<ITEM>干しアイスフナムシ<INFO>1100006</INFO></ITEM>の";
	mes "販売も片手間に行っています。";
	next;
	switch(select("干しアイスフナムシを買う","まるまるとしたアイスフナムシを買う","干しアイスフナムシって？","あなたの名前は？","やめる")) {
	case 1:
		mes "[ホヨヨ]";
		mes "栄養満点の";
		mes "干しアイスフナムシです。";
		mes "ぜひご賞味ください。";
		close2;
		callshop "icas_in#callshop2",1;
		cutin "ep19_iwin02.png", 255;
		end;
	case 2:
		mes "[ホヨヨ]";
		mes "コポたちの大好物。";
		mes "まるまるとしたアイスフナムシですね。";
		close2;
		//callshop "icas_in#callexchange",1;
		cutin "ep19_iwin02.png", 255;
		end;
	case 3:
		mes "[ホヨヨ]";
		mes "もしかして、";
		mes "ウルトラフード<ITEM>干しアイスフナムシ<INFO>1100006</INFO></ITEM>を";
		mes "ご存じない？";
		next;
		mes "[ホヨヨ]";
		mes "アイスフナムシは、";
		mes "その美味しさから、";
		mes "アーウィンたちの";
		mes "ソウルフードと呼ばれていると同時に、";
		mes "非常に栄養が豊富な";
		mes "スーパーフードでもあります。";
		next;
		mes "[ホヨヨ]";
		mes "そのアイスフナムシを";
		mes "乾燥させることにより、";
		mes "持ち運びまでしやすくなった、";
		mes "<ITEM>干しアイスフナムシ<INFO>1100006</INFO></ITEM>は、";
		mes "まさに^FF0000ウルトラフード^000000と呼ぶに";
		mes "ふさわしい食べ物です。";
		next;
		mes "[ホヨヨ]";
		mes "これさえあれば、";
		mes "他の食料はいらないんじゃないかとさえ";
		mes "思えてくるほどですよ。";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 4:
		mes "[ホヨヨ]";
		mes "私の本来の名前は";
		mes "ホヨヨ・ホヨヨ・ホヨヨ。";
		mes "(ロイヤル・シグニチャー・ベルガモット)";
		next;
		menu "ホヨヨ？",-;
		mes "[ホヨヨ]";
		mes "そうですね。";
		mes "格好いい名前を付けても、";
		mes "人間の耳には";
		mes "ホヨヨに聞こえるようです。";
		mes "気にせずにホヨヨと呼んでください。";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 5:
		mes "[ホヨヨ]";
		mes "そうですか。";
		mes "用事があれば、";
		mes "また声をかけてください。";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1071;
	setnpctitle "[干しアイスフナムシ]";
	end;
}

//isgard.sc 内 NPC(OnQuestInfo:)に挿し込み
// if(EP20_1QUE == 7)
// 	showevent 0, 1, "#in_barracks";

// if(EP20_1QUE == 8)
// 	showevent 0, 1, "#in_house2";

// if(EP20_3QUE == 10)
// 	showevent 1, 1, "#in_barracks";

//============================================================
// 死なない者クエスト
//- Registry -------------------------------------------------
// EP20_1QUE -> 0～80	完了:100
//------------------------------------------------------------
icecastle.gat,205,170,3	script(CLOAKED)	ホルル#ep20_1	10461,{/* 3335 (cloaking)*/
	switch(EP20_1QUE) {
	case 0:
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "冒険者、丁度いいところに！";
		mes "ルガンどもの巣窟を見つける為";
		mes "これまで捜索活動をしていたな？";
		next;
		mes "[ホルル]";
		mes "残念ながらいまだに奴らの居場所が";
		mes "特定できていない。";
		mes "奴らが出入りしている場所が";
		mes "どこかにあるはずなのに……。";
		next;
		mes "[ホルル]";
		mes "奴らは何かを企んでいる。";
		mes "しかし、いまだに発見できないとなると";
		mes "これまでの捜索範囲を広げるしかない。";
		mes "その話をするために";
		mes "冒険者を待っていたんだ。";
		next;
		menu "捜索範囲を広げる？",-;
		mes "[ホルル]";
		mes "そう！　人員を新しく編成する予定だ。";
		mes "もちろん、冒険者にも手伝って欲しい。";
		mes "詳しい説明は城の中でするから";
		mes "早く行こう。";
		mes "みんな集まってるはずだ。";
		next;
		cutin "ep19_iwin06.png", 255;
		setquest 17690;
		set EP20_1QUE,1;
		mes "‐氷の城 室内へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐氷の城 室内へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	case 1:
		mes "[ホルル]";
		mes "詳しい説明は城の中でするから";
		mes "早く行こう。";
		mes "みんな集まってるはずだ。";
		next;
		mes "‐氷の城 室内へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城 室内へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	}
	end;
OnQuestInfo:
	if(EP19_1QUE == 100 && EP20_1QUE <= 1 && BaseLevel >= 240)
		showevent 0, 1, "ホルル#ep20_1";
	else
		showevent 9999,0, "ホルル#ep20_1";
	end;
}

icas_in.gat,258,196,0	script	#ep20_re01	139,5,5,{/* 3336 */
	if(EP20_1QUE <= 1 || EP20_1QUE == 5) {//0?
		cloakoffnpc "レオン#ep20_re01";
		cloakoffnpc "オーレリー#ep20_re01";
		cloakoffnpc "レイジー#ep20_re01";
		cloakoffnpc "ミリアム#ep20_re01";
		cloakoffnpc "レハール#ep20_re01";
		cloakoffnpc "ホルル#ep20_re01";
	}
	else if(EP20_1QUE == 6 || EP20_1QUE == 12) {
		cloakoffnpc "レオン#ep20_re01";
		cloakoffnpc "オーレリー#ep20_re01";
		cloakoffnpc "レイジー#ep20_re01";
		cloakoffnpc "ミリアム#ep20_re01";
		cloakoffnpc "レハール#ep20_re01";
		cloakoffnpc "ヴェルグンデ#ep20_re01";
	}
	else if(EP20_1QUE == 11) {
		cloakonnpc "ホルル#ep20_re07";
		cloakonnpc "ヴェルグンデ#ep20_re02";
		cloakoffnpc "レオン#ep20_re01";
		cloakoffnpc "オーレリー#ep20_re01";
		cloakoffnpc "レイジー#ep20_re01";
		cloakoffnpc "ミリアム#ep20_re01";
		cloakoffnpc "レハール#ep20_re01";
		cloakoffnpc "ホルル#ep20_re01";
		cloakoffnpc "ヴェルグンデ#ep20_re01";
	}
	else if(EP20_1QUE == 13) {
		cloakoffnpc "ミリアム#ep20_re01";
	}
	else if(EP20_1QUE == 14 || EP20_1QUE == 15) {//15?
		cloakoffnpc "レオン#ep20_re01";
		cloakoffnpc "オーレリー#ep20_re01";
		cloakoffnpc "レイジー#ep20_re01";
		cloakoffnpc "ミリアム#ep20_re01";
		cloakoffnpc "レハール#ep20_re01";
		cloakoffnpc "ホルル#ep20_re01";
	}
	end;
}
icas_in.gat,262,202,5	script(CLOAKED)	レオン#ep20_re01	10464,{/* 3337 (cloaking)*/
	switch(EP20_1QUE) {
	case 0:	//
	case 1:
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "皆さん、お集まりのようですね。";
		mes "お話したいことがあり";
		mes "集まってもらいました。";
		mes "ラスガンドの行方についてですが……";
		mes "捜索範囲を広げようと思います。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "捜索範囲を広げるだって？";
		mes "まだ探してない場所があるってこと？";
		mes "ワカメ1本たりとも見逃さないよう";
		mes "捜索したはずなんだけど!?";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "一か所、捜索できていない場所がある。";
		mes "うん……行く必要はないと思っていたが";
		mes "奴らが見つからない以上";
		mes "調べないわけにはいかなくなった。";
		next;
		cutin "ep19_aurelie03.png", 0;
		mes "[オーレリー]";
		mes "「古代の氷の峡谷」という場所でね。";
		mes "そこには「古代アイスウィンド」という名の";
		mes "種族が住んでいる。";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "古代アイスウィンド？";
		emotion 1,"ミリアム#ep20_re01",1;
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "アーウィンとは異なる方向に進化した";
		mes "アーウィンの野生種と言える種族です。";
		mes "古の姿を保っており";
		mes "縄張り意識が非常に高く、好戦的です。";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[レオン]";
		mes "ラスガンドやその一族であっても";
		mes "彼らの縄張りに侵入するのは危険です。";
		mes "そう考えてこれまで";
		mes "捜索範囲からは外していたのです。";
		next;
		cutin "ep19_aurelie03.png", 0;
		mes "[オーレリー]";
		mes "その考えを正す必要があるということ。";
		mes "奴らの尻尾を掴めない以上はね。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "その場所の捜索に";
		mes "ボクも参加させてもらえませんか？";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "捜索隊の人員選定は、ご自由にどうぞ。";
		mes "ここを守る人員は足りていますから。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "それなら私も捜索に参加しよう！";
		mes "冒険者は知ってるだろうが";
		mes "私は、こういうことの専門家だから。";
		next;
		mes "[レイジー]";
		mes "奴らに気付かれないように";
		mes "迅速に行動しなくちゃ！";
		mes "もちろん冒険者も一緒に来てもらうぞ！";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "私も行きましょう。";
		mes "古代種と簡単な意思疎通が";
		mes "できますから！";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "お～流石は元同族！";
		mes "好戦的な相手であっても";
		mes "話が通じるなら";
		mes "余計な争いを避けられるな。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "話が通じるというか";
		mes "そこまで正確ではなくて……";
		mes "腹が減ってるんだなぁとか";
		mes "怒っているんだなぁ……ぐらい？";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "……それぐらいなら";
		mes "きっと私でもわかる。";
		mes "本当に役に立つのか？";
		emotion 4,"レイジー#ep20_re01",1;
		next;
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "ま、まったく話が通じないよりは";
		mes "少しは役に立つと思いますよ！";
		mes "……おそらく。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "では私も行きましょう！";
		mes "道案内ならお任せください！";
		mes "峡谷の入口まで";
		mes "安全にご案内いたします！";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "よしよ～し！";
		mes "甥っ子ちゃんは少々危なっかしいが";
		mes "真っ白い誰かさんと違って頼もしいな！";
		mes "そうと決まればすぐに";
		mes "「古代の氷の峡谷」に出発しよう。";
		unittalk getnpcid(0,"ホルル#ep20_re01"),"ホルル : ひどい物言い！",1;
		emotion 19,"ホルル#ep20_re01",1;
		next;
		cutin "ep19_leizi02.png", 255;
		chgquest 17690,16691;
		set EP20_1QUE,2;
		mes "‐古代の氷の峡谷 東部へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐古代の氷の峡谷 東部へ";
		mes "　向かった‐";
		close2;
		warp "jor_back5.gat", 353, 73;
		end;
	case 2:
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "「古代の氷の峡谷」の捜索を";
		mes "お願いします。";
		mes "どうか、お気をつけて。";
		next;
		cutin "ep19_leon01.png", 255;
		mes "‐古代の氷の峡谷 東部へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐古代の氷の峡谷 東部へ";
		mes "　向かった‐";
		close2;
		warp "jor_back5.gat", 353, 73;
		end;
	case 5:
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "おかえりなさい。";
		mes "何か成果はありましたか？";
		next;
		cutin "ep19_leon01.png", 255;
		menu "成果がありました",-;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "それは、いいことね。";
		mes "……実は焦っていたんだよ。";
		mes "捜索できていない場所は";
		mes "あそこだけだったからね。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ルガンが活動していたと思われる";
		mes "痕跡を発見しました。";
		mes "怪しい装置も持って帰ってきましたよ。";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "怪しい装置ですか？";
		mes "これは専門家に";
		mes "来てもらった方が良いですね。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		cloakoffnpc "ヴェルグンデ#ep20_re01";
		mes "[ヴェルグンデ]";
		mes "あら、私を呼んだ？";
		mes "まぁまぁ、初めてみるものだわ。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "ふ～ん……興味深い。";
		mes "魔力も感じられる。";
		mes "これを私が調べれば良いのよね？";
		emotion 2,"ヴェルグンデ#ep20_re01",1;
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "流石はヴェルグンデ様！";
		mes "話が早い！";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "ちゃんと調べたいから";
		mes "少し時間をもらえないかしら？";
		mes "終わったら、皆に集まってもらうから";
		mes "それまでは、ゆっくりしててちょうだい。";
		next;
		cutin "ep19_iwin06.png", 2;
		unittalk getnpcid(0,"レハール#ep20_re01"),"レハール : それなら、私は修行してきます。",1;
		unittalk getnpcid(0,"ミリアム#ep20_re01"),"ミリアム : ちょっと休ませてもらおうかな。",1;
		unittalk getnpcid(0,"レイジー#ep20_re01"),"レイジー : 釣りの時間だ！　すっげー穴釣り場があるらしいから。",1;
		mes "[ホルル]";
		mes "……もし、"+strcharinfo(0)+"様。";
		mes "お時間をもらえませんか？";
		mes "お話したいことがあるのですが……。";
		next;
		cutin "ep19_iwin01.png", 255;
		menu "何の話ですか？",-;
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "しーっ！";
		mes "小さい声でお声がけしたのには";
		mes "意味があるということです。";
		mes "空気を読んでください！";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ヴェルグンデ様が怪しい装置を";
		mes "調べている間にやるべき事があります。";
		mes "……この宿舎の上の方にいますから";
		mes "こっそり話しかけてください。";
		mes "くれぐれもこっそり！　ですよ！";
		next;
		cutin "ep19_iwin01.png", 255;
		cloakonnpc "ホルル#ep20_re01";
		cloakoffnpc "ホルル#ep20_re07";
		chgquest 16694,16695;
		set EP20_1QUE,6;
		mes "‐イスガルド 室内へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐イスガルド 室内へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	case 6:
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ヴェルグンデ様が怪しい装置を";
		mes "調べている間にやるべき事があります。";
		mes "……この宿舎の上の方にいますから";
		mes "こっそり話しかけてください。";
		mes "くれぐれもこっそり！　ですよ！";
		next;
		cutin "ep19_iwin01.png", 255;
		cloakonnpc "ホルル#ep20_re01";
		cloakoffnpc "ホルル#ep20_re07";
		mes "‐イスガルド 室内へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐イスガルド 室内へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	case 11:
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "怪しい装置に関する調査が";
		mes "終わったようですよ。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 12:
		cutin "ep19_leon04.png", 2;
		mes "[レオン]";
		mes "外に長くいると体温が落ちてしまいます。";
		mes "峡谷に向かわれるなら";
		mes "温かい服装を心がけてください。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 14:
		cutin "ep19_leon04.png", 2;
		mes "[レオン]";
		mes "行方不明になったと聞いて";
		mes "心配していました。";
		mes "無事だったみたいですね。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 15:
		cutin "ep19_leon04.png", 2;
		mes "[レオン]";
		mes "私達が躊躇している間に";
		mes "奴等は計画を進めるはずです。";
		mes "もうあまり時間はありません。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 1 || EP20_1QUE == 2 || EP20_1QUE == 5 || EP20_1QUE == 6)
		showevent 0, 1, "レオン#ep20_re01";
	else
		showevent 9999,0, "レオン#ep20_re01";
	end;
}
icas_in.gat,260,202,5	script(CLOAKED)	オーレリー#ep20_re01	10465,{/* 3338 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "うん……行く必要はないと思っていたが";
		mes "奴らが見つからない以上";
		mes "あの場所を調べないわけには";
		mes "いかなくなったな。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_aurelie02.png", 0;
		mes "[オーレリー]";
		mes "何か成果はあったかな？";
		mes "その表情を見るに";
		mes "何か見つけてきたみたいだけど？";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep19_aurelie04.png", 0;
		mes "[オーレリー]";
		mes "ヴェルグンデの調査を待ちましょう。";
		mes "その間は、ゆっくりできそうね。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_aurelie02.png", 0;
		mes "[オーレリー]";
		mes "調査が終わったみたい。";
		mes "休憩する暇も無かったかな？";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "長時間、待ち伏せすることになるかも。";
		mes "身体が冷えたら戻って来て";
		mes "温かいお茶で体を温めて。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "大変な目に遭ったんだって？";
		mes "大丈夫？";
		mes "怪我はない？";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "無理はしないで。";
		mes "危険だと判断したら";
		mes "すぐに引き返すこと。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	end;
}
icas_in.gat,263,200,3	script(CLOAKED)	レイジー#ep20_re01	10454,{/* 3339 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "探せる場所は全部探したんだがなぁ。";
		mes "さて、これからどうするつもりだろう？";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "さっそく発表といこう！";
		mes "私達の夢と希望！";
		mes "……では無くて";
		mes "峡谷で見つけたものをさ。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "手伝えることは無さそうだから";
		mes "私は釣りでもしてくるよ。";
		mes "アーウィンたちが、いかす穴釣り場を";
		mes "紹介してくれると言うからさ！";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "穴釣り？";
		mes "よかったよ！　すっげー楽しかった!!";
		mes "たくさん釣れたけど";
		mes "アーウィンの子供たちに";
		mes "全部あげちゃった。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "敵に見つからないように";
		mes "各人分かれて待ち伏せしよう。";
		mes "退屈だろうけど心配するな。";
		mes "私は隠密行動する時は";
		mes "徹底して喋らないんだ。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "二人とも無事だったか！";
		mes "急にどっか行っちゃうから";
		mes "みんな心配してたんだぜ！";
		mes "それで何があった？";
		next;
		cutin "ep19_leizi01.png", 255;
		menu "ルガンに捕まったことを説明する",-;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "……マジか？";
		mes "ルガンがアーウィンに変身したって？";
		mes "はぁ、やられたな。";
		mes "夜道で背後からいきなり";
		mes "殴られた時みたいなショックだ！";
		emotion 0,"レイジー#ep20_re01",1;
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "イヤな予感が当たりました……";
		mes "アーウィンに化けたルガンが";
		mes "うろついている可能性があるなんて！";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[レハール]";
		mes "それだけじゃありません。";
		mes "ルガンたちは、変身した私たちの正体を";
		mes "見破る術も見つけたと言っていました。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "一難去ってまた一難、か。";
		mes "これからはルガンに変身しても";
		mes "必ずしも安全とは言えないってわけだ。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "私はバゴットが言っていたという";
		mes "「あの場所」というのが気になる。";
		mes "ラスガンドが固執している場所とは";
		mes "いったい……。";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "私たちを助けてくれた白い猫も";
		mes "「あの場所」という言葉が出る度に";
		mes "過剰な反応を見せていました。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "あの白い猫は、私達を逃がしてくれた後";
		mes "忽然と姿を消していました。";
		mes "いつの間にか現れて";
		mes "いつの間にか消えていたんです。";
		mes "霊獣……みたいなものでしょうか。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "結果的にルガンたちの居場所が";
		mes "判明しましたが";
		mes "依然として、わからないことばかりです。";
		mes "情報が不足しています。";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[レオン]";
		mes "情報を得るためには";
		mes "奴等の本拠地に";
		mes "侵入する必要があるでしょう。";
		next;
		mes "[レオン]";
		mes "私達が躊躇している間に";
		mes "奴等は計画を進めるはずです。";
		mes "これまで以上に危険が伴いますが";
		mes "奴等の本拠地を調査して来て";
		mes "もらえませんか？";
		next;
		cutin "ep19_leon01.png", 255;
		menu "任せてください",-;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "もちろんです！";
		mes "脱出してきた私たちだからこそ";
		mes "案内できるというものです！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "私も同行いたします。";
		mes "情報収集をするなら";
		mes "人手が多い方が良いでしょう。";
		next;
		mes "[ミリアム]";
		mes "変身した私達を見破る術が";
		mes "あるとのことですが";
		mes "元より危険は承知しています。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "話を聞く限りじゃ";
		mes "私達がルガンに変身したとしても";
		mes "完全に見分けられるわけじゃ";
		mes "ないんだろ？";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "つまり、ルガンに変身するのは";
		mes "ある程度は有効ってことだ。";
		mes "よし、今回はヴェルグンデ様から";
		mes "魔石をたくさんもらって行こう！";
		next;
		mes "[レイジー]";
		mes "敵の本拠地には上級のルガンだけで";
		mes "下級のルガンはいない。";
		mes "変身するにしても";
		mes "上級ルガンに変身しなくちゃ";
		mes "上手くいかないだろう。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "それが良いでしょう。";
		mes "残る問題は、アーウィンに変身している";
		mes "ルガンを見つけることですが";
		mes "その件に関しては心配無用です！";
		next;
		mes "[ホルル]";
		mes "我がアーウィンの中に専門家がいます！";
		mes "「オリリョ鳥兵」がスパイを上手いこと";
		mes "見つけ出してくれるでしょう！";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "それじゃあ、こっちも作戦開始だ。";
		mes "ひゅ～スパイ合戦ってわけか！";
		mes "この私に諜報活動で勝負を挑んだこと";
		mes "ばっちり後悔させてやろうじゃない？";
		next;
		mes "[レイジー]";
		mes "準備ができたら";
		mes "蛇の巣の門の前で集合だぞ！";
		emotion 2,"レイジー#ep20_re01",1;
		next;
		cutin "ep19_leizi03.png", 255;
		chgquest 16703,16704;
		set EP20_1QUE,15;
		mes "‐蛇の巣の門の前へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐蛇の巣の門の前へ";
		mes "　向かった‐";
		close2;
		warp "jor_nest.gat", 38, 270;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "それじゃあ、こっちも作戦開始だ。";
		mes "ひゅ～スパイ合戦ってわけか！";
		mes "この私に諜報活動で勝負を挑んだこと";
		mes "ばっちり後悔させてやろうじゃない？";
		next;
		mes "[レイジー]";
		mes "準備ができたら";
		mes "蛇の巣の門の前で集合だぞ！";
		emotion 2,"レイジー#ep20_re01",1;
		next;
		cutin "ep19_leizi03.png", 255;
		mes "‐蛇の巣の門の前へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐蛇の巣の門の前へ";
		mes "　向かった‐";
		close2;
		warp "jor_nest.gat", 38, 270;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 14 || EP20_1QUE == 15)
		showevent 0, 1, "レイジー#ep20_re01";
	else
		showevent 9999,0, "レイジー#ep20_re01";
	end;
}
icas_in.gat,259,200,7	script(CLOAKED)	ミリアム#ep20_re01	10377,{/* 3340 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "探せる場所は探したけど";
		mes "成果は出てないね。";
		mes "このまま同じことをしていても";
		mes "大丈夫かな？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "レハールさんが見つけたものを";
		mes "皆さんに見てもらいましょう。";
		mes "でも、これって一体なんなんだろう？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep18_miriam_02.png", 0;
		mes "[ミリアム]";
		mes "急に時間ができてしまいましたね。";
		mes "さて、何をしたら良いか……";
		mes "ボクはちょっと考えてみます。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep18_miriam_02.png", 0;
		mes "[ミリアム]";
		mes "ゆっくり休めましたか？";
		mes "ボクは城の中を";
		mes "あっちこっち見てまわっていました。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep18_miriam_02.png", 0;
		mes "[ミリアム]";
		mes "監視する装置は";
		mes "あちこちにあったから";
		mes "分かれて行動しないと。";
		mes "危険だけど";
		mes "やらないわけにはいかない。";
		close2;
		cutin "ep18_miriam_02.png", 255;
		end;
	}
	else if(EP20_1QUE == 13) {
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "あっ、"+strcharinfo(0)+"さん！";
		mes "レハールさんも！";
		mes "二人とも急にいなくなったから";
		mes "みんな心配してたんですよ。";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "私達は大丈夫です。";
		mes "それより、皆さんを集めてください。";
		mes "急いで報告しないといけないことが";
		mes "あるんです。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "わかりました。";
		mes "皆さんを呼んできます！";
		chgquest 16702,16703;
		set EP20_1QUE,14;
		close2;
		cutin "ep18_miriam_01.png", 255;
		warp "icas_in.gat", 262, 195;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "急いで報告しないといけないことって";
		mes "なんでしょう？";
		mes "本当に休まなくても大丈夫ですか？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "アーウィンに化けたルガンたちが";
		mes "周囲をうろついていると思うと";
		mes "ゾッとするな……。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 13)
		showevent 0, 1, "ミリアム#ep20_re01";
	else
		showevent 9999,0, "ミリアム#ep20_re01";
	end;
}
icas_in.gat,262,198,3	script(CLOAKED)	レハール#ep20_re01	10469,{/* 3341 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "もしかして、まだ探してない場所が？";
		mes "あ……そう言えば、あそこ……。";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "私のお手柄じゃないですか？";
		mes "まあ、この装置を見つけられたのは";
		mes "運が良かっただけかもですが。";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "冒険者様はゆっくり休んでください。";
		mes "私は体を鍛えてきます！";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "しっかり汗を流してきましたよ！";
		mes "温かいお風呂にも入ってきたので";
		mes "気合十分です！";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "設置された装置を見張りましょう。";
		mes "準備ができたら";
		mes "城の前に集まってください。";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "みんなに早く報告しないと！";
		mes "話さないといけないことが";
		mes "多すぎますよ！";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "私たちを閉じ込めた奴らを";
		mes "とっちめてやりましょう！";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	end;
}
icas_in.gat,259,197,1	script(CLOAKED)	ホルル#ep20_re01	10461,{/* 3342 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "捜索できていない場所がある？";
		mes "……私の記憶が確かなら";
		mes "一か所、心当たりがあります。";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "やれやれ……";
		mes "峡谷ではひどい目に遭いました。";
		mes "これで何も発見できてなかったら";
		mes "骨折り損になるところでしたよ。";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "調査を手伝ってくださり";
		mes "ありがとうございました。";
		mes "まだわからないことがありますが";
		mes "今はいったん保留としましょう。";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "見つからないように";
		mes "設置された装置を見張る……";
		mes "これは忍耐力が必要ですよ。";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ご無事で何よりです！";
		mes "本当に心配しましたよ！";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_iwin08.png", 2;
		mes "[ホルル]";
		mes "まさかアーウィンに変身するなんて！";
		mes "……ま、私達もひとのことは";
		mes "言えないですけど。";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	end;
}
icas_in.gat,260,205,5	script(CLOAKED)	ヴェルグンデ#ep20_re01	10468,{/* 3343 (cloaking)*/
	if(EP20_1QUE <= 6) {
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "見つけてきた装置は";
		mes "私が調べておくから";
		mes "その間に息抜きでもしておいて。";
		mes "休めるうちに休んでおくのも";
		mes "大切なことだからね。";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_vellgunde01.png", 2;
		cloakonnpc "ホルル#ep20_re07";
		cloakonnpc "ヴェルグンデ#ep20_re02";
		mes "[ヴェルグンデ]";
		mes "みんな、集まった？";
		mes "私が調べ物している間に";
		mes "きちんと息抜きはできたかしら。";
		mes "休める時にちきんと休むのも";
		mes "仕事のうちだからね。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "それじゃあ、調査の結果を報告するわ。";
		mes "これは、魔力吸収装置ね。";
		mes "周囲の魔力を吸収し、それを保存する。";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[ヴェルグンデ]";
		mes "しかも、一度吸い上げた場所の魔力が";
		mes "二度と元に戻らないほど";
		mes "徹底的に吸収するわ。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "悪質だな～。";
		mes "ぜったいに性格の悪い奴が";
		mes "作ったに違いない。";
		next;
		emotion 9,"ヴェルグンデ#ep20_re02",1;
		cutin "ep19_vellgunde03.png", 2;
		mes "[ヴェルグンデ]";
		mes "恐らくこれを作ったのは、バゴットね。";
		mes "あくまで推測だけど";
		mes "設計思想が独特だから。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "バゴットが……！";
		mes "この装置に魔力を保存して";
		mes "いったいどうするんでしょう。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "これも推測だけど……";
		mes "魔力が満タンになった装置を回収して";
		mes "ルガンたちの本拠地へ運ぶものと";
		mes "思われるわ。";
		next;
		mes "[ヴェルグンデ]";
		mes "つまり、この装置を回収している";
		mes "ルガンを見つけて、尾行することで";
		mes "奴らの本拠地を見つけ出せるかも。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "設置されている装置を";
		mes "監視すれば良いと？";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "忍耐力の勝負になりそうですな……。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "古代アイスウィンドに追い回されるより";
		mes "よっぽど気が楽じゃない？";
		mes "よし、人員と区域を決めよう！";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "わかりました！";
		mes "区画の選定と担当の割り振りは";
		mes "やっておきますから";
		mes "準備ができた人は";
		mes "城の前に集まってください。";
		next;
		cutin "ep19_lehar05.png", 255;
		chgquest 16700,16701;
		set EP20_1QUE,12;
		mes "‐城の前へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐城の前へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 201, 165;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "また、いろいろ忙しくなりそうね。";
		next;
		cutin "ep19_vellgunde01.png", 255;
		mes "‐城の前へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐城の前へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 201, 165;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 11 || EP20_1QUE == 12)
		showevent 0, 1, "ヴェルグンデ#ep20_re01";
	else
		showevent 9999,0, "ヴェルグンデ#ep20_re01";
	end;
}

jor_back5.gat,353,73,0	script	#ep20_re02	139,5,5,{/* 3344 */
	if(EP20_1QUE == 2 || EP20_1QUE == 3) {
		cloakoffnpc "レイジー#ep20_re02";
		cloakoffnpc "ミリアム#ep20_re02";
		cloakoffnpc "レハール#ep20_re02";
		cloakoffnpc "ホルル#ep20_re02";
	}
	end;
}
jor_back5.gat,350,75,3	script(CLOAKED)	レハール#ep20_re02	10469,{/* 3345 (cloaking)*/
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "この場所は";
	mes "長話するのに向いてませんね。";
	mes "移動しましょう。";
	close2;
	cutin "ep19_lehar02.png", 255;
	if(EP20_1QUE == 2)
		warp "jor_safty1.gat", 67, 331;
	else if(EP20_1QUE == 3)
		warp "jor_safty1.gat", 198, 328;
	end;
OnQuestInfo:
	if(EP20_1QUE == 2 || EP20_1QUE == 3)
		showevent 0, 1, "レオン#ep20_re02";
	else
		showevent 9999,0, "レオン#ep20_re02";
	end;
}
jor_back5.gat,350,72,5	script(CLOAKED)	レイジー#ep20_re02	10454,{/* 3346 (cloaking)*/
	cutin "ep19_leizi01.png", 2;
	mes "[レイジー]";
	mes "ほ～。";
	mes "ここが「古代の氷の峡谷」か。";
	close2;
	cutin "ep19_leizi01.png", 255;
	end;
}
jor_back5.gat,348,78,3	script(CLOAKED)	ミリアム#ep20_re02	10377,{/* 3347 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "古代アイスウィンド……";
	mes "アーウィンたちとはずいぶんと";
	mes "姿が違いますね。";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_back5.gat,353,77,5	script(CLOAKED)	ホルル#ep20_re02	10461,{/* 3348 (cloaking)*/
	cutin "ep19_iwin06.png", 2;
	mes "[ホルル]";
	mes "滑らないように気を付けて歩いて！";
	mes "転ぶと大変だから。";
	close2;
	cutin "ep19_iwin01.png", 255;
	end;
}

jor_safty1.gat,64,328,5	script	レハール#ep20_re03	10469,{/* 3349 */
	if(EP20_1QUE == 2) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ここが「古代の氷の峡谷」です。";
		mes "古代アイスウィンドの縄張り内ですから";
		mes "気を付けてください。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "険しい地形ですね。";
		mes "足元にも気を付けないと……。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "うわっ！";
		mes "身を低くして隠れて！";
		mes "古代アイスウィンドです！";
		next;
		cutin "ep19_lehar02.png", 255;
		cloakoffnpc "古代アイスウィンド#ep20";
		mes "[古代アイスウィンド]";
		mes "――――――！！！";
		next;
		// 仕様
		misceffect 962,"ホルル#ep20_re03",0;
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "う、うああぁぁ～～～っ！";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "ちょっと、どうなってる？";
		mes "あのデカイ鳥、ホルルさんばかり";
		mes "攻撃してない？";
		mes "言葉が通じるんじゃないの??";
		next;
		// 仕様
		misceffect 962,"ホルル#ep20_re03",0;
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "り、理由はわかりませんが！";
		mes "も、ものすご～～く！";
		mes "うわっ！　怒ってるみたいですっ!!";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "ここから500歩離れた場所で";
		mes "ジュノーの伝統的なダンスを";
		mes "踊っていたとしても";
		mes "その鳥が怒っているのはわかるよ。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "冗談言ってる場合じゃないですよ！";
		mes "縄張りから離れないと……皆さん！";
		mes "私の後について来てください！";
		next;
		cutin "ep19_lehar05.png", 255;
		chgquest 16691,16692;
		set EP20_1QUE,3;
		mes "‐安全な場所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐安全な場所へ";
		mes "　向かった‐";
		close2;
		warp "jor_safty1.gat", 198, 328;
		end;
	}
	if(EP20_1QUE == 3) {
		//
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "冗談言ってる場合じゃないですよ！";
		mes "縄張りから離れないと……皆さん！";
		mes "私の後について来てください！";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "‐安全な場所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐安全な場所へ";
		mes "　向かった‐";
		close2;
		warp "jor_safty1.gat", 198, 328;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 2 || EP20_1QUE == 3)
		showevent 0, 1, "レハール#ep20_re03";
	else
		showevent 9999,0, "レハール#ep20_re03";
	end;
}
jor_safty1.gat,67,327,5	script	レイジー#ep20_re03	10454,{/* 3350 */
	cutin "ep19_leizi02.png", 2;
	mes "[レイジー]";
	mes "うわっ！　デカイ鳥がいるぞ！";
	close2;
	cutin "ep19_leizi02.png", 255;
	end;
}
jor_safty1.gat,71,329,3	script	ミリアム#ep20_re03	10377,{/* 3351 */
	cutin "ep18_miriam_03.png", 0;
	mes "[ミリアム]";
	mes "気を付けてください。";
	mes "油断禁物です。";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_safty1.gat,70,332,5	script	ホルル#ep20_re03	10461,{/* 3352 */
	cutin "ep19_iwin06.png", 2;
	mes "[ホルル]";
	mes "私は古代アイスウィンドたちの言葉を";
	mes "ある程度、理解できます！";
	mes "……ある程度。";
	close2;
	cutin "ep19_iwin07.png", 255;
	end;
}
jor_safty1.gat,72,333,3	script(CLOAKED)	古代アイスウィンド#ep20	21966,{/* 3353 (cloaking)*/
	mes "[古代アイスウィンド]";
	mes "――――――！！！";
	close;
}

jor_safty1.gat,195,327,5	script	レハール#ep20_re04	10469,{/* 3354 */
	if(EP20_1QUE != 3) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "周囲を調査して、何か見つけたら";
		mes "すぐに集まりましょう。";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "‐古代の氷の峡谷 東部へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐古代の氷の峡谷 東部へ";
		mes "　向かった‐";
		close2;
		warp "jor_back5.gat", 355, 350;
		end;
	}
	cutin "ep19_lehar04.png", 2;
	mes "[レハール]";
	mes "はぁはぁ……。";
	mes "ここなら安全なはずです……";
	mes "ちょっと休みましょう。";
	next;
	cutin "ep19_leizi02.png", 2;
	mes "[レイジー]";
	mes "いや～ビックリしたな！";
	mes "あんなデカイ鳥に追い回されるなんて！";
	mes "甥っ子ちゃんが";
	mes "ここの地理に詳しくて良かったよ！";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "昔はここに、冒険ごっこに来ては";
	mes "よく追い回されてましたからね。";
	mes "やんちゃだった自分の経験が";
	mes "役に立つ日が来るなんて。";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "それに比べて";
	mes "そっちの白いまんまるは……";
	mes "誰と誰の言葉が通じるって？";
	mes "そもそも相手はまったく";
	mes "コミュニケーション取るつもりが";
	mes "なかったみたいだけど？";
	next;
	cutin "ep19_iwin06.png", 2;
	mes "[ホルル]";
	mes "それが……わ、分かりません。";
	mes "以前は、あんな激しくはなかったのに!?";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "皆さん！";
	mes "見てください、これ……";
	mes "何か地面に設置されてます。";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "ひとつやふたつじゃありませんね。";
	mes "うん？　この装置からは";
	mes "魔力の流れを感じます。";
	next;
	mes "[レハール]";
	mes "……ふんっ！";
	mes "くっ……びくともしない。";
	mes "動かすのは無理か……。";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "いかにも怪しい装置は、調べなくちゃ。";
	mes "何か方法はない？";
	mes "バラシてみる？";
	next;
	cutin "ep19_leizi03.png", 255;
	menu "解体するのは難しそうです",-;
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "そうみたいだな。";
	mes "がっちり地面に固定されているし。";
	mes "どうにかして持って帰り……。";
	next;
	cutin "ep19_iwin09.png", 2;
	mes "[ホルル]";
	mes "そ、そんな!?";
	mes "これは、どういうこと!!??";
	next;
	cutin "ep19_iwin09.png", 2;
	mes "[ホルル]";
	mes "これを見てください！";
	mes "アーウィンの羽毛です！";
	mes "それに、うっすらとですが";
	mes "アーウィンの足跡も残ってます！";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "古代アイスウィンドの足跡では……？";
	next;
	cutin "ep19_iwin07.png", 2;
	mes "[ホルル]";
	mes "あんな野蛮な鳥と";
	mes "守護者たちの区別もつかないんですか！";
	mes "ほら、このふわふわで見事な羽毛!!";
	mes "あんなゴワゴワな羽毛と";
	mes "一緒にしないで！";
	emotion 7,"ホルル#ep20_re04",1;
	next;
	menu "アーウィンがここにいた？",-;
	cutin "ep19_iwin09.png", 2;
	mes "[ホルル]";
	mes "……う～～ん。";
	mes "あ、アーウィン以外の痕跡もあります。";
	mes "何かを引きずったかのような……。";
	next;
	cutin "ep18_miriam_02.png", 0;
	mes "[ミリアム]";
	mes "これは……";
	mes "見覚えがありますよね？";
	emotion 19,"ミリアム#ep20_re04",1;
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "ルガン！";
	mes "ルガンがにょろにょろと移動した跡だ！";
	mes "ほら、この鱗の跡！　間違いない。";
	mes "遂に奴らの痕跡を見つけたぞ！";
	next;
	cutin "ep19_iwin06.png", 2;
	mes "[ホルル]";
	mes "この付近を調査しなければ！";
	mes "慎重に！　注意深く！";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "そうしましょう。";
	mes "周囲を調査して、何か見つけたら";
	mes "すぐに集まりましょう。";
	mes "バラバラに動くのは危険ですからね。";
	next;
	cutin "ep19_iwin06.png", 255;
	chgquest 16692,16693;
	set EP20_1QUE,4;
	mes "‐古代の氷の峡谷 東部へ";
	mes "　向かいますか？‐";
	next;
	if(select("向かう","やめる") == 2) {
		mes "‐その場にとどまった‐";
		close;
	}
	//
	mes "‐古代の氷の峡谷 東部へ";
	mes "　向かった‐";
	close2;
	warp "jor_back5.gat", 355, 350;
	end;
OnQuestInfo:
	if(EP20_1QUE == 3 || EP20_1QUE == 4)
		showevent 0, 1, "レハール#ep20_re04";
	else
		showevent 9999,0, "レハール#ep20_re04";
	end;
}
jor_safty1.gat,194,325,5	script	レイジー#ep20_re04	10454,{/* 3355 */
	cutin "ep19_leizi02.png", 2;
	mes "[レイジー]";
	mes "ホルルさん、話が違くない？";
	mes "古代アイスウィンドの悪口でも言った？";
	close2;
	cutin "ep19_leizi03.png", 255;
	end;
}
jor_safty1.gat,198,324,1	script	ミリアム#ep20_re04	10377,{/* 3356 */
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "どうしてあんなに";
	mes "ホルルさんに対して攻撃的だったんだろ？";
	mes "何か理由がありそうだけど。";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_safty1.gat,201,327,3	script	ホルル#ep20_re04	10461,{/* 3357 */
	cutin "ep19_iwin09.png", 2;
	mes "[ホルル]";
	mes "私は紳士なので悪口なんて言いません！";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
}
jor_safty1.gat,209,324,3	script	魔力の感じられる設置物#01	10538,{/* 3358 */
	mes "‐魔力の感じられる";
	mes "　奇妙な装置が設置されている‐";
	close;
}
jor_safty1.gat,205,320,3	script	魔力の感じられる設置物#02	10539,{/* 3359 */
	mes "‐魔力の感じられる";
	mes "　奇妙な装置が設置されている‐";
	close;
}
jor_safty1.gat,201,323,3	script	魔力の感じられる設置物#03	10538,{/* 3360 */
	mes "‐魔力の感じられる";
	mes "　奇妙な装置が設置されている‐";
	close;
}
jor_safty1.gat,197,320,3	script	魔力の感じられる設置物#04	10539,{/* 3361 */
	mes "‐魔力の感じられる";
	mes "　奇妙な装置が設置されている‐";
	close;
}
jor_safty1.gat,189,325,3	script	魔力の感じられる設置物#05	10540,{/* 3362 */
	mes "‐魔力の感じられる";
	mes "　奇妙な装置が設置されている‐";
	close;
}

jor_back5.gat,353,352,0	script	#ep20_re03	139,5,5,{/* 3363 */
	if(EP20_1QUE == 4) {
		cloakoffnpc "ミリアム#ep20_re05";
		cloakoffnpc "レイジー#ep20_re05";
		cloakoffnpc "レハール#ep20_re05";
		cloakoffnpc "ホルル#ep20_re05";
		cloakoffnpc "魔力の感じられる設置物#";
	}
	else if(EP20_1QUE == 5) {
		cloakoffnpc "ミリアム#ep20_re05";
	}
	end;
}
jor_back5.gat,353,357,7	script(CLOAKED)	ミリアム#ep20_re05	10377,{/* 3364 (cloaking)*/
	if(EP20_1QUE == 4) {
		cutin "ep18_miriam_03.png", 0;
		mes "[ミリアム]";
		mes "皆さん、見てください。";
		mes "あの氷の中に見えるのは……";
		mes "ここは油断できないので";
		mes "安全な場所に行って話をしましょう。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		warp "jor_safty1.gat", 333, 329;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "「氷の城」に戻ろうか。";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "‐イスガルド 氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐イスガルド 氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	}
OnQuestInfo:
	if(EP20_1QUE == 4 || EP20_1QUE == 5)
		showevent 0, 1, "ミリアム#ep20_re05";
	else
		showevent 9999,0, "ミリアム#ep20_re05";
	end;
}
jor_back5.gat,352,355,7	script(CLOAKED)	レイジー#ep20_re05	10454,{/* 3365 (cloaking)*/
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "うわ～、あれってもしかして……";
	mes "カッチカチに凍っちゃってるな。";
	close2;
	cutin "ep19_leizi02.png", 255;
	end;
}
jor_back5.gat,355,354,7	script(CLOAKED)	レハール#ep20_re05	10469,{/* 3366 (cloaking)*/
	cutin "ep19_lehar05.png", 2;
	mes "[レハール]";
	mes "うん？";
	mes "これってもしかして……";
	mes "持って行けるんじゃ……！";
	close2;
	cutin "ep19_lehar03.png", 255;
	end;
}
jor_back5.gat,356,355,3	script(CLOAKED)	魔力の感じられる設置物#	10540,{/* 3367 (cloaking)*/
	mes "‐魔力の感じられる";
	mes "　奇妙な装置が設置されている‐";
	close;
}
jor_back5.gat,353,353,7	script(CLOAKED)	ホルル#ep20_re05	10461,{/* 3368 (cloaking)*/
	cutin "ep19_iwin08.png", 2;
	mes "[ホルル]";
	mes "えっ!?";
	mes "あれって、もしかして！";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
}

jor_safty1.gat,330,327,5	script	ミリアム#ep20_re06	10377,{/* 3369 */
	if(EP20_1QUE != 4) {
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "そうですね。";
		mes "いったん「氷の城」に戻りましょう。";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "‐イスガルド 氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐イスガルド 氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	}
	cutin "ep18_miriam_03.png", 0;
	mes "[ミリアム]";
	mes "突き当りで凍り付いていたもの";
	mes "皆さん見ましたよね？";
	mes "……ルガンの死体でした。";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "どうやら、古代アイスウィンドたちに";
	mes "やられたみたいだな。";
	mes "近くに巣らしきものがあったけど";
	mes "卵でも盗もうとしてやられたのかな？";
	next;
	cutin "ep19_lehar02.png", 2;
	mes "[レハール]";
	mes "ふふふ……ジャーン!!";
	mes "あの恐ろしい現場から";
	mes "持ってきましたよ！";
	mes "さあ、見てください!!";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "え？";
	mes "いったい何を持ってきたんですか？";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "まだ地面に固定されてない";
	mes "あの怪しい装置です！";
	mes "凍ったルガンの近くに落ちてました。";
	mes "これを設置している最中に";
	mes "襲われたみたいですよ。";
	next;
	cutin "ep19_leizi01.png", 2;
	emotion 2,"レイジー#ep20_re06",1;
	mes "[レイジー]";
	mes "甥っ子ちゃん！　いいセンスだっ！";
	mes "ルガンの痕跡だけでなく";
	mes "怪しい装置まで手に入ったぞ！";
	mes "ここまで来た甲斐があったよ～。";
	next;
	mes "[レイジー]";
	mes "よし、いったん氷の城に戻ろう。";
	mes "その怪しい装置について";
	mes "詳しく調べなくちゃ！";
	mes "これ以上、調査をするにしても";
	mes "もっと計画を練った方が良い。";
	next;
	cutin "ep19_leizi03.png", 255;
	menu "そうしましょう",-;
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "そうですね。";
	mes "では「氷の城」に戻りましょう。";
	next;
	cutin "ep18_miriam_01.png", 255;
	chgquest 16693,16694;
	set EP20_1QUE,5;
	mes "‐イスガルド 氷の城へ";
	mes "　向かいますか？‐";
	next;
	if(select("向かう","やめる") == 2) {
		mes "‐その場にとどまった‐";
		close;
	}
	//
	mes "‐イスガルド 氷の城へ";
	mes "　向かった‐";
	close2;
	warp "icas_in.gat", 261, 196;
	end;
OnQuestInfo:
	if(EP20_1QUE == 4 || EP20_1QUE == 5)
		showevent 0, 1, "ミリアム#ep20_re06";
	else
		showevent 9999,0, "ミリアム#ep20_re06";
	end;
}
jor_safty1.gat,336,327,3	script	レイジー#ep20_re06	10454,{/* 3370 */
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "カッチカチに凍ってたな……";
	mes "ゾッとするよ。";
	close2;
	cutin "ep19_leizi03.png", 255;
	end;
}
jor_safty1.gat,334,325,1	script	レハール#ep20_re06	10469,{/* 3371 */
	cutin "ep19_lehar02.png", 2;
	mes "[レハール]";
	mes "ふふふ……";
	mes "良いものを拾っておきましたよ。";
	close2;
	cutin "ep19_lehar05.png", 255;
	end;
}
jor_safty1.gat,331,325,7	script	ホルル#ep20_re06	10461,{/* 3372 */
	cutin "ep19_iwin06.png", 2;
	mes "[ホルル]";
	mes "いくらルガンだとしても";
	mes "あんな姿になるなんて哀れです。";
	close2;
	cutin "ep19_iwin08.png", 255;
	end;
}

icas_in.gat,259,216,0	script	#ep20_re04	139,5,5,{/* 3373 */
	if(EP20_1QUE >= 6 && EP20_1QUE <= 11)
		cloakoffnpc "ホルル#ep20_re07";
	end;
}
icas_in.gat,259,219,5	script(CLOAKED)	ホルル#ep20_re07	10461,{/* 3374 (cloaking)*/
	if(EP20_1QUE == 6) {
		cloakonnpc "レオン#ep20_re01";
		cloakonnpc "オーレリー#ep20_re01";
		cloakonnpc "レイジー#ep20_re01";
		cloakonnpc "ミリアム#ep20_re01";
		cloakonnpc "レハール#ep20_re01";
		cloakonnpc "ヴェルグンデ#ep20_re01";
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ふむ……"+strcharinfo(0)+"様。";
		mes "周囲に人はいませんね？";
		mes "……けっこう。";
		next;
		mes "[ホルル]";
		mes "……峡谷捜索の際、";
		mes "ルガンの死体を見つけたことで";
		mes "有耶無耶になってしまいましたが";
		mes "アーウィンの足跡と羽毛の跡も";
		mes "あの場所にありましたよね？";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "それが気掛かりで仕方ありません。";
		mes "不安な気持ちがずっと離れないのです。";
		mes "失踪したアーウィンがいるのではないか";
		mes "あるいは捕まったアーウィンが";
		mes "いるんじゃないかって……。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ですから、私と共に";
		mes "アーウィンの失踪者がいないか";
		mes "密かに調査して欲しいんです。";
		next;
		cutin "ep19_iwin01.png", 255;
		menu "密かに？",-;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "……最悪の状況も";
		mes "想定する必要があるからです。";
		mes "現時点で伝えることではありませんが。";
		next;
		mes "[ホルル]";
		mes "それでは、お力添えをお願いします。";
		mes "私は城内を調べますので";
		mes strcharinfo(0)+"様は兵舎と旅館……";
		mes "それと路地裏といった人目につきにくい";
		mes "場所の確認もお願いします。";
		next;
		//cloakoffnpc "トルル#ep20_re01";
		//cloakoffnpc "チャルル#ep20_re01";
		//cloakoffnpc "路地裏#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		chgquest 16695,16696;
		set EP20_1QUE,7;
		mes "‐兵舎へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐兵舎へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 186, 217;
		end;
	}
	else if(EP20_1QUE == 7) {
		mes "[ホルル]";
		mes "私は城内を調べますので";
		mes strcharinfo(0)+"様は兵舎と旅館……";
		mes "それと路地裏といった人目につきにくい";
		mes "場所の確認もお願いします。";
		next;
		//cloakoffnpc "トルル#ep20_re01";
		//cloakoffnpc "チャルル#ep20_re01";
		//cloakoffnpc "路地裏#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		mes "‐兵舎へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐兵舎へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 186, 217;
		end;
	}
	else if(EP20_1QUE == 8) {
		mes "[ホルル]";
		mes "私は城内を調べますので";
		mes strcharinfo(0)+"様は兵舎と旅館……";
		mes "それと路地裏といった人目につきにくい";
		mes "場所の確認もお願いします。";
		next;
		cloakoffnpc "トルル#ep20_re01";
		cloakoffnpc "チャルル#ep20_re01";
		cloakoffnpc "路地裏#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		mes "‐兵舎へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐兵舎へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 186, 217;
		end;
	}
	else if(EP20_1QUE == 9) {
		mes "[ホルル]";
		mes "私は城内を調べますので";
		mes strcharinfo(0)+"様は兵舎と旅館……";
		mes "それと路地裏といった人目につきにくい";
		mes "場所の確認もお願いします。";
		next;
		cloakoffnpc "トルル#ep20_re01";
		cloakoffnpc "チャルル#ep20_re01";
		cloakoffnpc "路地裏#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		mes "‐路地裏へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐路地裏へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 208, 236;
		end;
	}
	else if(EP20_1QUE == 10) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "戻られましたか！";
		mes "お願いしていた調査の結果は";
		mes "いかがです？";
		mes "報告を聞きたいのですが。";
		next;
		cutin "ep19_iwin01.png", 255;
		if(select("特に無さそうだが……","ちょっと気掛かりなことが……") == 1) {
			cutin "ep19_iwin06.png", 2;
			mes "[ホルル]";
			mes "特に何もないのであれば";
			mes "幸いですが……";
			mes "本当に何もなかったのですか？";
			next;
			cutin "ep19_iwin01.png", 255;
			menu "ちょっと気掛かりなことが……",-;
		}
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "……気掛かりなこと？";
		mes "ふむ……どういったものですか？";
		mes "念のため確認したいです。";
		next;
		cutin "ep19_iwin01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "まず、誰かが失踪したとか";
		mes "見かけなくなった、ということは";
		mes "ないようです。";
		mes "むしろ、みんな積極的に";
		mes "活動しているようでした。";
		next;
		cutin "ep19_iwin01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "私が気になったのは";
		mes "兵舎の路地裏で見つけた痕跡です。";
		mes "誰かが外部から侵入したような";
		mes "痕跡です。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "それは、外から入ってきた痕跡ですが";
		mes "出て行った痕跡はありませんでした。";
		mes "注意する必要があるように思います。";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "………………";
		mes "私が想定していた最悪の状況とは";
		mes "異なりますが";
		mes "警戒した方が良さそうですね。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "悪い予感がします。";
		mes "私が想定していた";
		mes "最悪の状況というのは……。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		cloakoffnpc "ヴェルグンデ#ep20_re02";
		unittalk "ホルル : ハッ！",1;
		mes "[ヴェルグンデ]";
		mes "話に熱中しているところ";
		mes "申し訳ないけど";
		mes "頼まれていた調査が終わったわ。";
		mes "皆を呼んで来てもらえないかしら？";
		next;
		cloakonnpc "ホルル#ep20_re07";
		cloakonnpc "ヴェルグンデ#ep20_re02";
		cutin "ep19_vellgunde01.png", 255;
		cloakoffnpc "レオン#ep20_re01";
		cloakoffnpc "オーレリー#ep20_re01";
		cloakoffnpc "レイジー#ep20_re01";
		cloakoffnpc "ミリアム#ep20_re01";
		cloakoffnpc "レハール#ep20_re01";
		cloakoffnpc "ホルル#ep20_re01";
		cloakoffnpc "ヴェルグンデ#ep20_re01";
		chgquest 16699,16700;
		set EP20_1QUE,11;
		mes "‐ヴェルグンデの所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐ヴェルグンデの所へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 257, 202;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_vellgunde01.png", 2;
		cloakoffnpc "ヴェルグンデ#ep20_re02";
		unittalk "ホルル : ハッ！",1;
		mes "[ヴェルグンデ]";
		mes "話に熱中しているところ";
		mes "申し訳ないけど";
		mes "頼まれていた調査が終わったわ。";
		mes "皆を呼んで来てもらえないかしら？";
		next;
		cloakonnpc "ホルル#ep20_re07";
		cloakonnpc "ヴェルグンデ#ep20_re02";
		cutin "ep19_vellgunde01.png", 255;
		cloakoffnpc "レオン#ep20_re01";
		cloakoffnpc "オーレリー#ep20_re01";
		cloakoffnpc "レイジー#ep20_re01";
		cloakoffnpc "ミリアム#ep20_re01";
		cloakoffnpc "レハール#ep20_re01";
		cloakoffnpc "ホルル#ep20_re01";
		cloakoffnpc "ヴェルグンデ#ep20_re01";
		mes "‐ヴェルグンデの所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ヴェルグンデの所へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 257, 202;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 6 && EP20_1QUE <= 10)
		showevent 0, 1, "ホルル#ep20_re07";
	else
		showevent 9999,0, "ホルル#ep20_re07";
	end;
}
icas_in.gat,260,217,5	script(CLOAKED)	ヴェルグンデ#ep20_re02	10468,{/* 3375 (cloaking)*/
	cutin "ep19_vellgunde01.png", 2;
	mes "[ヴェルグンデ]";
	mes "話に熱中しているところ";
	mes "申し訳ないけど";
	mes "頼まれていた調査が終わったわ。";
	mes "皆を呼んで来てもらえないかしら？";
	close2;
	cutin "ep19_vellgunde01.png", 255;
	end;
}
icas_in.gat,113,41,0	script	#ep20_re05	139,9,9,{/* 3376 */
	if(EP20_1QUE == 7 || EP20_1QUE == 8)
		cloakoffnpc "トルル#ep20_re01";
	end;
}
icas_in.gat,113,41,5	script(CLOAKED)	トルル#ep20_re01	10461,{/* 3377 (cloaking)*/
	if(EP20_1QUE == 7) {
		cutin "ep19_iwin02.png", 2;
		mes "[トルル]";
		mes "敬礼！";
		mes "兵舎には、どのような用事で";
		mes "いらっしゃいましたか？";
		mes "お聞きしたいことがあると？";
		next;
		cutin "ep19_iwin02.png", 255;
		menu "最近、姿を見ないアーウィンはいますか？",-;
		cutin "ep19_iwin02.png", 2;
		mes "[トルル]";
		mes "姿を見せないアーウィン？";
		mes "どういう意味でしょう？";
		mes "言っておられることがわかりませんが";
		mes "氷の城を守護する我らが";
		mes "ここから去ることはありません！";
		next;
		cutin "ep19_iwin02.png", 255;
		menu "いえ、深い意味はありません",-;
		cutin "ep19_iwin02.png", 2;
		mes "[トルル]";
		mes "私達はここで";
		mes "常に誇りをもって城を護っております！";
		mes "むしろ、これまで見なかった";
		mes "アーウィンたちも真面目に";
		mes "兵役に務めております！";
		mes "敬礼！";
		next;
		cutin "ep19_iwin02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "敬礼！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（他の場所も調査してみよう。";
		mes "　次は旅館だったかな？）";
		next;
		chgquest 16696,16697;
		set EP20_1QUE,8;
		mes "‐旅館へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐旅館へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 67, 222;
		end;
	}
	else if(EP20_1QUE == 8) {
		mes "["+strcharinfo(0)+"]";
		mes "敬礼！";
		next;
		cutin "ep19_iwin02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（他の場所も調査してみよう。";
		mes "　次は旅館だったかな？）";
		next;
		mes "‐旅館へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐旅館へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 67, 222;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 7 || EP20_1QUE == 8)
		showevent 0, 1, "トルル#ep20_re01";
	else
		showevent 9999,0, "トルル#ep20_re01";
	end;
}
icas_in.gat,85,113,0	script	#ep20_re06	139,5,5,{/* 3378 */
	if(EP20_1QUE == 8 || EP20_1QUE == 9)
		cloakoffnpc "チャルル#ep20_re01";
	end;
}
icas_in.gat,92,113,5	script(CLOAKED)	チャルル#ep20_re01	10461,{/* 3379 (cloaking)*/
	if(EP20_1QUE == 8) {
		cutin "ep19_iwin04.png", 2;
		mes "[チャルル]";
		mes "あら、あらあら！";
		mes "この旅館に何の御用でしょう？";
		mes "冒険者の皆さんは、冒険者用の宿舎に";
		mes "泊ってらっしゃるのでしょう？";
		mes "おかげで、当旅館は稼ぎが少なくて";
		mes "残念なのですが。";
		next;
		mes "[チャルル]";
		mes "話が聞きたいのですか？";
		mes "何でしょう？　何でしょう??";
		mes "お金になるお話でしたら";
		mes "大歓迎ですよ！";
		next;
		cutin "ep19_iwin04.png", 255;
		menu "最近、見かけなくなった友達はいますか？",-;
		cutin "ep19_iwin04.png", 2;
		mes "[チャルル]";
		mes "私の友達で、ですか？";
		mes "いませんね、全然、いませんね。";
		mes "とっても不思議な質問ですね。";
		next;
		mes "[チャルル]";
		mes "ご近所さんは、みんな寒い日であっても";
		mes "真面目に歩き回ってますよ。";
		mes "だから、特に見かけなくなった友人は";
		mes "いないということです。";
		next;
		mes "[チャルル]";
		mes "あ～本当は情報料をいただかないと";
		mes "こんな話をしちゃいけないのに！";
		next;
		cutin "ep19_iwin04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "教えてくれてありがとう！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "（他の場所も密かに調査してみよう。";
		mes "　次は路地裏だったはず）";
		next;
		chgquest 16697,16698;
		set EP20_1QUE,9;
		mes "‐路地裏へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐路地裏へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 208, 236;
		end;
	}
	else if(EP20_1QUE == 9) {
		mes "[チャルル]";
		mes "特に見かけなくなった友人は";
		mes "いないということです。";
		mes "あ～本当は情報料をいただかないと";
		mes "こんな話をしちゃいけないのに！";
		next;
		cutin "ep19_iwin04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "（他の場所も密かに調査してみよう。";
		mes "　次は路地裏だったはず）";
		next;
		mes "‐路地裏へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐路地裏へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 208, 236;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 8 || EP20_1QUE == 9)
		showevent 0, 1, "チャルル#ep20_re01";
	end;
}


icecastle.gat,208,236,0	script	#ep20_re07	139,5,5,{/* 3380 */
	if(EP20_1QUE == 9 || EP20_1QUE == 10)
		cloakoffnpc "路地裏#ep20_re01";
	end;
}
icecastle.gat,209,243,3	script(CLOAKED)	路地裏#ep20_re01	10429,{/* 3381 (cloaking)*/
	if(EP20_1QUE == 9) {
		mes "["+strcharinfo(0)+"]";
		mes "兵舎の路地裏を";
		mes "調べてみようか……。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ホルルさんは";
		mes "誰かが連れて行かれたのではないかと";
		mes "心配しているようだったから……。";
		mes "何か痕跡がないだろうか。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "おや？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "うん……これは……";
		mes "いや……でも、どういうことだろう？";
		next;
		mes "‐何者かが外部から侵入したような";
		mes "　痕跡が残っている‐";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "……ここから出て行った痕跡は無いな。";
		mes "別のところから外に出た？";
		mes "あるいは、まだ街の中にいる？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "調査して欲しいと言われた場所は";
		mes "全部調べたな。";
		mes "一度、ホルルさんのところに戻ろう。";
		next;
		chgquest 16698,16699;
		set EP20_1QUE,10;
		mes "‐イスガルド 室内へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐イスガルド 室内へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	}
	else if(EP20_1QUE == 10) {
		mes "‐何者かが外部から侵入したような";
		mes "　痕跡が残っている‐";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "……ここから出て行った痕跡は無いな。";
		mes "別のところから外に出た？";
		mes "あるいは、まだ街の中にいる？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "調査して欲しいと言われた場所は";
		mes "全部調べたな。";
		mes "一度、ホルルさんのところに戻ろう。";
		next;
		mes "‐イスガルド 室内へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐イスガルド 室内へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 9 || EP20_1QUE == 10)
		showevent 0, 1, "路地裏#ep20_re01";
	end;
}
icecastle.gat,202,168,0	script	#ep20_re08	139,5,5,{/* 3382 */
	if(EP20_1QUE == 12 || EP20_1QUE == 13)
		cloakoffnpc "レハール#ep20_re07";
	end;
}
icecastle.gat,201,171,3	script(CLOAKED)	レハール#ep20_re07	10469,{/* 3383 (cloaking)*/
	if(EP20_1QUE == 13) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "すぐにみんなに";
		mes "ルガンたちがアーウィンに";
		mes "変身していたことを伝えないと。";
		mes "早く中に入りましょう。";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "‐イスガルド 室内へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐イスガルド 室内へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 259, 195;
		end;
	}
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "峡谷に設置された装置を監視する";
	mes "準備ができたようですね。";
	mes "では、出発の用意をいたしましょう。";
	next;
	cutin "ep19_lehar01.png", 255;
	mes "^e6328cメモリアルダンジョン";
	mes "「峡谷探査」の";
	mes "生成と入場が行えます。";
	if(mdopenstate("峡谷探査"))
		set '@str$,"^0b0b33メモリアルダンジョンへ入場";
	else if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@str$,"^0b0b33メモリアルダンジョンの作成";
	next;
	switch(select("^191970立ち去る",'@str$,"^0b0b33注意事項の確認") == 2) {
	case 1:
		mes "‐その場を離れた‐";
		close;
	case 2:
		if(mdopenstate("峡谷探査")) {
			mes "[レハール]";
			mes "峡谷探査へ向かいましょう！";
			next;
			if(select("^191970少し考える","^e6328c峡谷探査へ向かう") == 1) {
				cutin "ep19_lehar01.png", 255;
				mes "‐その場を離れた‐";
				close;
			}
			mes "[レハール]";
			mes "それでは出発です。";
			close2;
			cutin "ep19_lehar01.png", 255;
			if(getonlinepartymember() > 1) {
				mes "^8c32e6このメモリアルダンジョンは、";
				mes "1人用です。";
				mes "パーティーメンバーが";
				mes "2人以上の場合は入場できません。";
				mes "もう一度確認してから";
				mes "やり直してください。";
				close;
			}
			switch(mdenter("峡谷探査")) {
			case 0:	// エラーなし
				announce "メモリアルダンジョン[峡谷探査] に入場しました　：　"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				//warp "1@20cn1.gat", 94, 79;
				end;
			case 1:	// パーティー未加入
				mes "^8c32e6パーティーが解体されているため";
				mes "入場できません。";
				mes "もう一度確認してから";
				mes "やり直してください。";
				close;
			case 2:	// ダンジョン未作成
				mes "^8c32e6パーティーリーダーが";
				mes "メモリアルダンジョンを";
				mes "生成していない状態です。";
				close;
			default:	// その他エラー
				close;
			}
		}
		else {
			if(getonlinepartymember() < 1) {
				mes "^8c32e6空白のパーティー名では、";
				mes "メモリアルダンジョンを";
				mes "作成することは出来ません。";
				close;
			}
			mes "メモリアルダンジョンを作成しますか？";
			next;
			if(select("^191970少し考える","^e6328c作成する") == 1) {
				cutin "ep19_lehar01.png", 2;
				mes "[レハール]";
				mes "探索の準備がまだでしたか。";
				mes "準備を終えたら、また来てくださいね。";
				close2;
				cutin "ep19_lehar01.png", 255;
				end;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0))
				close;
			mdcreate "峡谷探査";
			mes "■パーティー名";
			mes "^009eff"+strcharinfo(1)+"^000000";
			mes "■パーティーリーダー";
			mes "^009eff"+strcharinfo(0)+"^000000";
			mes "　";
			mes "^006400峡谷探査の";
			mes "作成申請を受け付けました。^000000";
			close;
		}
	case 3:
		mes "詳しくはこちらをご確認ください。";
		mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
		messize 180,364;
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 12 || EP20_1QUE == 13)
		showevent 0, 1, "レハール#ep20_re07";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの生成と入場]";
	end;
}
jor_back5.gat,365,187,3	script	魔力の感じられる設置物#	10538,{/* 3385 */}
jor_back6.gat,122,180,3	script	魔力の感じられる設置物#	10539,{/* 3395 */
	mes "‐魔力の感じられる";
	mes "　奇妙な装置が設置されている‐";
	close;
}

jor_nest.gat,38,268,0	script	#20ms00	139,6,6,{/* 3398 */
	if(EP20_1QUE == 15 || EP20_1QUE == 16 || EP20_1QUE == 17) {
		cloakoffnpc "レイジー#20ms00";
		cloakoffnpc "ホルル#20ms00";
		cloakoffnpc "ミリアム#20ms00";
		cloakoffnpc "レハール#20ms00";
	}
	if(EP20_1QUE >= 17) //24で確認
		cloakoffnpc "門#20ms00";
	end;
}
jor_nest.gat,38,274,5	script(CLOAKED)	門#20ms00	10046,{/* 3399 (cloaking)*/
	mes "‐中へ";
	mes "　向かいますか？‐";
	next;
	if(select("向かう","やめる") == 2) {
		mes "‐その場にとどまった‐";
		close;
	}
	mes "‐中へ";
	mes "　向かった‐";
	close2;
	warp "jor_root1.gat", 32, 21;
	end;
}
jor_nest.gat,36,274,5	script(CLOAKED)	レイジー#20ms00	10475,{/* 3400 (cloaking)*/
	if(EP20_1QUE == 15) {
		mes "[レイジー]";
		mes "潜入するメンバーが揃ったな。";
		mes "うん？";
		mes "この面々、見覚えがあるぞ。";
		next;
		mes "[レイジー]";
		mes "斥候、潜入、突撃、連絡及び事後収拾。";
		mes "全てが可能な編成じゃない？";
		mes "このメンツなら都市一つ";
		mes "混乱に陥れることもできるぞ。";
		emotion 23,"ミリアム#20ms00",1;
		emotion 23,"レハール#20ms00",1;
		emotion 23,"ホルル#20ms00",1;
		next;
		menu "……冗談ですよね？",-;
		unittalk getnpcid(0,"ミリアム#20ms00"),"ミリアム : 都市って、どこの都市ですか？",1;
		unittalk getnpcid(0,"レハール#20ms00"),"レハール : 私たちって、都市を破壊しに行くんですか？",1;
		unittalk getnpcid(0,"ホルル#20ms00"),"ホルル : 任務はどうするんだ！！",1;
		mes "[レイジー]";
		mes "要するに精鋭ということ。";
		mes "私たちは素晴らしいチームであることを";
		mes "覚えておけ。";
		next;
		mes "[レイジー]";
		mes "この力を悪いことに使わないんだから";
		mes "本当に立派だよね？";
		mes "さて、前に潜入した時と同じように";
		mes "上手く立ち回るとしよう。";
		next;
		mes "[レハール]";
		mes "少し遠回りしましたが";
		mes "ようやく、この扉の先に";
		mes "進めるというわけですね。";
		next;
		mes "[ホルル]";
		mes "ここから本当に入れるのですか？";
		mes "外に出ることはできたそうですが";
		mes "入れるとは限りませんよ。";
		next;
		mes "[レイジー]";
		mes "やってみないと分からないよ。";
		mes "何事も挑戦してみないと。";
		unittalk getnpcid(0,"レイジー#20ms00"),"レイジー : どれどれ～っと",1;
		next;
		misceffect 0,"ミリアム#20ms00",1;
		mes "<FONT SIZE = 20>[- カチャッ -]</FONT>";
		mesalign 2;
		mesalign 4;
		close2;
		mes "[レイジー]";
		mes "おっ!!　ドアノブが回るぞ！";
		mes "しかし……扉が重すぎる……。";
		next;
		menu "みんなで力を合わせましょう",-;
		mes "[レハール]";
		mes "そうしましょうか。";
		mes "皆さん、タイミングを合わせて！";
		next;
		misceffect 0,"ミリアム#20ms00",1;
		mes "<FONT SIZE = 20>[- キイィィィ -]</FONT>";
		mesalign 2;
		mesalign 4;
		close2;
		mes "[レイジー]";
		mes "いいぞ！";
		mes "鍛え上げた立派な筋肉で";
		mes "力を振り絞るんだ！　そら！";
		emotion 21,"レイジー#20ms00",1;
		next;
		mes "[ホルル]";
		mes "口ばっかりじゃないですか！";
		mes "一緒に手伝ってくださいよ！";
		misceffect 0,"レイジー#20ms00",1;
		misceffect 0,"ホルル#20ms00",1;
		misceffect 0,"ミリアム#20ms00",1;
		unittalk getnpcid(0,"レイジー#20ms00"),"レイジー : 私はエールを送る係！",1;
		unittalk getnpcid(0,"レハール#20ms00"),"レハール : うりゃぁぁ！",1;
		unittalk getnpcid(0,"ミリアム#20ms00"),"ミリアム : もう少し……！",1;
		next;
		misceffect 670,"ミリアム#20ms00",1;
		mes "[レハール]";
		mes "開いた！";
		unittalk getnpcid(0,"ミリアム#20ms00"),"ミリアム : ふぅ……",1;
		next;
		mes "[レイジー]";
		mes "みんなお疲れ！";
		mes "ちょっと休憩しよう。";
		unittalk getnpcid(0,"ホルル#20ms00"),"ホルル : あんたは何もやってないじゃないか！",1;
		close2;
		chgquest 16704,17691;
		set EP20_1QUE,16;
		end;
	}
	else if(EP20_1QUE == 16) {
		mes "[レイジー]";
		mes "本当疲れた。そうだろ？";
		mes "ホルルの旦那が何か言ってるけど";
		mes "代わりに聞いてくれよ。";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 15)
		showevent 0, 1, "レイジー#20ms00";
	end;
}
jor_nest.gat,40,274,3	script(CLOAKED)	ホルル#20ms00	10470,{/* 3401 (cloaking)*/
	if(EP20_1QUE == 16) {
		mes "[ホルル]";
		mes "門は開いたけど……";
		mes "どうもすっきりしません。";
		next;
		mes "[レイジー]";
		mes "^0000cdわざと開けておいた^000000みたいじゃない？";
		mes "これまで開けようとしても";
		mes "ビクともしなかったのに。";
		next;
		mes "[ミリアム]";
		mes "やはり、罠でしょうか？";
		next;
		mes "[ホルル]";
		mes "罠だとしても入ってみるしかない。";
		next;
		mes "[レハール]";
		mes "そういうことです。";
		mes "元から危険は承知しています。";
		next;
		mes "[ホルル]";
		mes "^0000cdルガン変身スクロール^000000は持ってますか？";
		mes "この先にはルガンがいるはずですから";
		mes "ここで変身してから先に進みましょう。";
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530)
			close;
		next;
		mes "[ホルル]";
		mes "忘れないでくれ。";
		mes "侵入の目的は、ラスガンドが言っていた";
		mes "「あの場所」について調べること。";
		mes "そこで何をしようとしているのか";
		mes "それを調べることが最優先です。";
		next;
		mes "[ホルル]";
		mes "それと敵の本拠地に潜入するのですから";
		mes "くれぐれも無理な行動や";
		mes "目立つ行動は避けること！";
		next;
		mes "[レイジー]";
		mes "なぜ私の目を見ながら言うの？";
		mes "それにしても今回は前回と比べて";
		mes "危険度が高いから興奮するな！";
		mes "よ～し、はりきっちゃうぞー！";
		cloakonnpc "レイジー#20ms00";
		next;
		mes "[ミリアム]";
		mes "……心配になってきました。";
		next;
		menu "目を離さないよう気をつけよう",-;
		mes "[レハール]";
		mes "では、慎重に中に入りましょう。";
		next;
		chgquest 17691,17692;
		set EP20_1QUE,17;
		mes "‐中へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐中へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 32, 21;
		end;
	}
	if(EP20_1QUE == 17) {
		mes "[ホルル]";
		mes "早く中に入りましょう。";
		next;
		mes "‐中へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐中へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 32, 21;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 16 || EP20_1QUE == 17)
		showevent 0, 1, "ホルル#20ms00";
	end;
}
jor_nest.gat,37,272,7	script(CLOAKED)	ミリアム#20ms00	10471,{/* 3402 (cloaking)*/}
jor_nest.gat,39,272,1	script(CLOAKED)	レハール#20ms00	10472,{/* 3403 (cloaking)*/}

jor_root1.gat,32,34,0	script	#20ms05	139,9,9,{/* 3404 */
	if(EP20_1QUE == 17)
		cloakoffnpc "ルガン呪術師#20ms10";
	else if(EP20_1QUE == 18)
		cloakoffnpc "形跡#20ms10";
	end;
}
jor_root1.gat,32,34,5	script(CLOAKED)	ルガン呪術師#20ms10	21985,{/* 3405 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン呪術師]";
		mes "どうして、ここに人間が!?";
		close;
	}
	//timer missing
	emotion 23,"ルガン呪術師#20ms10",1;
	unittalk getnpcid(0,"ルガン呪術師#20ms10"),"ルガン呪術師 : 貴様人間だな！　私の目は誤魔化せん！",1;
	unittalk getcharid(3),strcharinfo(0)+" : 人間を感知するルガンがいる。感知する奴を処理しながら、みんなと合流しよう",1;
	misceffect 0,"ルガン呪術師#20ms10",1;
	unittalk getnpcid(0,"ルガン呪術師#20ms10"),"ルガン呪術師 : ぐあっ!!",1;
	cloakonnpc "ルガン呪術師#20ms10";
	cloakoffnpc "形跡#20ms10";
	chgquest 17692,17693;
	set EP20_1QUE,18;
	end;
OnQuestInfo:
	if(EP20_1QUE == 17)
		showevent 0, 1, "ルガン呪術師#20ms10";
	end;
}
jor_root1.gat,32,34,5	script(CLOAKED)	形跡#20ms10	10046,{/* 3406 (cloaking)*/
	mes "‐周辺の確認へ";
	mes "　向かいますか？‐";
	next;
	if(select("向かう","やめる") == 2) {
		mes "‐その場にとどまった‐";
		close;
	}
	mes "‐周辺の確認へ";
	mes "　向かった‐";
	close2;
	warp "jor_root2.gat", 234, 243;
	end;
OnQuestInfo:
	if(EP20_1QUE == 18)
		showevent 0, 1, "形跡#20ms10";
	end;
}
jor_root2.gat,239,243,0	script	#20ms10	139,9,9,{/* 3407 */
	if(EP20_1QUE >= 18 || EP20_1QUE <= 21)
		cloakoffnpc "穴#20ms10";
	end;
}
jor_root2.gat,239,243,5	script(CLOAKED)	穴#20ms10	10046,{/* 3408 (cloaking)*/
	mes "‐床に開いた穴の先から";
	mes "　聞き覚えのある声が聞こえる‐";
	close2;
	warp "jor_safty2.gat", 75, 358;
	end;
OnQuestInfo:
	if(EP20_1QUE == 18)
		showevent 0, 1, "穴#20ms10";
	end;
}

jor_safty2.gat,75,358,0	script	#20ms11	139,3,3,{/* 3409 */
	if(EP20_1QUE == 18) {
		cloakoffnpc "レイジー#20ms10";
		cloakoffnpc "ホルル#20ms10";
		cloakoffnpc "ミリアム#20ms10";
	}
	else if(EP20_1QUE == 19 || EP20_1QUE == 20) {
		cloakonnpc "レイジー#20ms10";
		cloakoffnpc "ホルル#20ms10";
		cloakoffnpc "ミリアム#20ms10";
		cloakoffnpc "レハール#20ms10";
	}
	else if(EP20_1QUE == 21) {
		cloakonnpc "レイジー#20ms10";
		cloakoffnpc "ホルル#20ms10";
		cloakonnpc "ミリアム#20ms10";
		cloakonnpc "レハール#20ms10";
		cloakoffnpc "ルガン主教#20ms10";
	}
	end;
}
jor_safty2.gat,65,357,0	script	#20ms12	45,1,1,{
OnTouch:
	warp "jor_root2.gat",234,243;
	end;
OnQuestInfo:
	if(EP20_1QUE == 21)
		showevent 0, 1, "#20ms12";
	end;
}
jor_safty2.gat,77,362,5	script(CLOAKED)	レイジー#20ms10	10475,{/* 3411 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[レイジー]";
		mes "その姿でうろつくのはマズイって。";
		mes "早くルガンに変身してくれ。";
		close;
	}
	if(EP20_1QUE == 18) {
		mes "[レイジー]";
		mes "お！　"+strcharinfo(0)+"！";
		mes "こっちこっち！";
		emotion 2,"レイジー#20ms10",1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ルガン呪術師が";
		mes "人間を感知できるみたいです。";
		next;
		mes "[レイジー]";
		mes "みたいだな。";
		mes "だから私たちもここに隠れて";
		mes "様子を窺っていたんだ。";
		next;
		mes "[ホルル]";
		mes "ルガンに変身しても";
		mes "バレてしまうのであれば";
		mes "別の方法を探した方が良いのでは？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "呪術師は私が排除しました。";
		mes "ルガンに変身する方法は";
		mes "もうしばらくは有効でしょう。";
		next;
		mes "[ホルル]";
		mes "いまのうちに作戦を進行しないと。";
		mes "出来る限り迅速に……。";
		next;
		mes "[ミリアム]";
		mes "本拠地へ続く道を";
		mes "まだ見つけられていません……";
		mes "この一帯を探したのですが。";
		next;
		mes "[ミリアム]";
		mes "入口と思われる穴を探ってみても";
		mes "穴の中で中級のルガンたちが";
		mes "仕事をしているだけでした。";
		next;
		mes "[ホルル]";
		mes "奴らは皆、慣れない手つきでしたね。";
		mes "いったい何をしているのか……。";
		next;
		menu "そう言えば、レハールは？",-;
		cloakoffnpc "レハール#20ms10";
		mes "[レハール]";
		mes "皆さん、どうしてこんなところに";
		mes "集まっているんです？";
		mes "本拠地の入口で待っていたのに";
		mes "誰も来られないので心配になって";
		mes "探しに来たんですけど。";
		next;
		mes "[ホルル]";
		mes "入口で待っていたんですか！";
		mes "もしかして、入口の場所を知っている？";
		next;
		mes "[レハール]";
		mes "脱出した時に、ここを通りましたから";
		mes "それはまあ……。";
		next;
		mes "[ホルル]";
		mes "よし、早く行こう！";
		mes "ルガン呪術師に見つかる前に！";
		next;
		mes "[レイジー]";
		mes "待ってくれ。乗り込む前に";
		mes "本拠地の情報を確認したい。";
		mes "私達がルガンに変身していたことは";
		mes "バレているんだろ？";
		next;
		mes "[レイジー]";
		mes "本拠地で行動する時に";
		mes "何か気をつけないといけないこととか";
		mes "あったりしない？";
		next;
		mes "[レハール]";
		mes "私たちが捕らえられていた場所は";
		mes "もっと奥にあるわけですが";
		mes "とても重要そうな場所でした。";
		next;
		mes "[レハール]";
		mes "居住地では無さそうでしたが";
		mes "そこで見かけたのは";
		mes "最上級のルガンだけでした。";
		mes "上級以下のルガンは";
		mes "いなかったように思います。";
		next;
		mes "[レイジー]";
		mes "つまり、上級ルガンの姿で入ると";
		mes "怪しまれる可能性が高いってことか。";
		mes "変身しても熱血アーウィンの旦那は";
		mes "入れそうもないなぁ。";
		next;
		mes "[ホルル]";
		mes "では、どうする？";
		next;
		mes "[レイジー]";
		mes "私がいるだろ？";
		mes "最上級ルガンの姿をしているのは";
		mes "私だけみたいだから";
		mes "まずは私が偵察に行ってみるよ。";
		next;
		mes "[レイジー]";
		mes "みんなは、ここで待機しててくれ。";
		mes "ばっちり調べてくるからさ！";
		close2;
		cloakonnpc "レイジー#20ms10";
		chgquest 17693,17694;
		set EP20_1QUE,19;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 18)
		showevent 0, 1, "レイジー#20ms10";
	end;
}
jor_safty2.gat,81,359,3	script(CLOAKED)	ミリアム#20ms10	10471,{/* 3412 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ミリアム]";
		mes "……冒険者さん。";
		mes "ここではルガンに変身していた方が";
		mes "良さそうだよ。";
		close;
	}
	if(EP20_1QUE == 19) {
		mes "[ミリアム]";
		mes "……レイジーさん、本当にひとりで";
		mes "大丈夫なんでしょうか？";
		mes "もし途中で、呪術師と遭遇したら……。";
		next;
		mes "[ホルル]";
		mes "あんな図太い神経の持ち主には";
		mes "これまで会ったことはないよ。";
		mes "彼との付き合いは長くはないけど";
		mes "上手くやるんじゃないかなぁ……。";
		next;
		cloakoffnpc "レイジー#20ms10";
		mes "[レイジー]";
		mes "ハァハァ！";
		mes "みんな聞いてくれ！";
		mes "大変なことになった!!";
		emotion 54,"レイジー#20ms10",1;
		next;
		mes "[レイジー]";
		mes "甥っ子ちゃんに教えてもらった場所から";
		mes "奴らの本拠地に入ったまでは良かったが";
		mes "中にいたルガンの奴ら";
		mes "私の顔を見るなり";
		mes "襲い掛かって来たんだよ！";
		next;
		mes "[レイジー]";
		mes "こっちはフレンドリーに";
		mes "やあ！　って挨拶したのにさ！";
		mes "挨拶の代わりに、暴力を振るうなんて";
		mes "まったく礼儀がなってない奴らだ。";
		next;
		mes "[レイジー]";
		mes "……まあ、冗談はともかくとして";
		mes "私のこのルガンの顔は";
		mes "人間が変身していたルガンの顔として";
		mes "知れ渡っちゃってるみたいだよ。";
		next;
		mes "[ミリアム]";
		mes "最上級のルガンは数が少ないので";
		mes "お互いに顔見知りですからね。";
		mes "新参者ならすぐに";
		mes "気づかれてしまうのでしょうね。";
		next;
		mes "[レハール]";
		mes "う～ん、どうしましょうか。";
		mes "最上級ルガンでないと怪しまれるのに";
		mes "レイジーさんの変身後の顔を";
		mes "知られていては、お手上げ状態です。";
		next;
		mes "[レイジー]";
		mes "どうにかして";
		mes "別の最上級ルガンに変装できれば";
		mes "なんとかなりそうなんだがなぁ……。";
		next;
		cloakoffnpc "ルガン主教#20ms10";
		mes "[ルガン主教]";
		mes "さ～～てと。";
		mes "今日もここで時間を潰すとするか。";
		mes "私が長時間の労働に従事するなど";
		mes "あり得ないことだ。ぶつぶつ……。";
		next;
		emotion 23,"ホルル#20ms10",1;
		emotion 23,"レハール#20ms10",1;
		emotion 23,"ミリアム#20ms10",1;
		emotion 1,"ルガン主教#20ms10",1;
		mes "[ルガン主教]";
		mes "なんだ……お前たちは？";
		mes "主教と下っ端か？";
		mes "初めて見る顔だ。";
		next;
		mes "[レイジー]";
		mes "私のこと、知らない？";
		mes "こっちの司祭も？";
		next;
		mes "[ルガン主教]";
		mes "知るわけないだろ！";
		mes "さては、油を売っているな？";
		emotion 1,"ルガン主教#20ms10",1;
		next;
		mes "[ルガン主教]";
		mes "ただでさえ人材が少ないのに";
		mes "お前たちのような下っ端がサボるから";
		mes "私まで仕事に駆り出される羽目になる。";
		next;
		emotion 2,"レイジー#20ms10",1;
		mes "[レイジー]";
		mes "最上級ルガンの主教様か……";
		mes "ふふっ……閃いた！";
		mes "私の好きな言葉を教えよう。";
		mes "目には目を。歯には歯を！";
		next;
		menu "はあ？",-;
		mes "[レイジー]";
		mes "冒険者や甥っ子ちゃんも";
		mes "ルガンに誘拐されたわけだが";
		mes "それをやり返そうというわけだ。";
		mes "要するに、この主教様を誘拐する！";
		next;
		mes "[レハール]";
		mes "ええぇ～～っ!?";
		next;
		mes "[ミリアム]";
		mes "そ、それでどうするつもりですか？";
		mes "人質にして、ルガンと交渉する……？";
		next;
		mes "[レイジー]";
		mes "違う違う。";
		mes "コイツを氷の城に閉じ込めた上で";
		mes "コイツに変装するんだ。";
		mes "それなら怪しまれずに";
		mes "奴らの本拠地に潜入できる。";
		next;
		mes "[レイジー]";
		mes "この主教様、頭弱そうだろ？";
		mes "私たちがルガンに変身していることに";
		mes "気付いていないみたいだし。";
		next;
		mes "[レイジー]";
		mes "こういうのに変装すれば";
		mes "少々おかしな振舞いをしても";
		mes "怪しまれないで済むよ。";
		next;
		mes "[ルガン主教]";
		mes "お～い。";
		mes "何か私に対する悪口のようなものが";
		mes "聞こえた気がするが？";
		emotion 6,"ルガン主教#20ms10",1;
		next;
		mes "[ミリアム]";
		mes "変装するって言われても……";
		mes "そんな簡単なことではないですよね？";
		mes "外見だけならともかく";
		mes "口調だったり、振舞いだったり……。";
		next;
		mes "[レイジー]";
		mes "キミの目の前にいるのは";
		mes "いったい誰だと思ってる？";
		mes "私に5分だけくれ。";
		mes "このルガンの全てを";
		mes "完璧に模倣してみせるからさ。";
		next;
		mes "[ルガン主教]";
		mes "お～い！";
		mes "私をどこに連れて行く気だ？";
		mes "私は忙しいんだ。";
		mes "手間を取らすんじゃない……。";
		close2;
		cloakonnpc "レイジー#20ms10";
		cloakonnpc "ルガン主教#20ms10";
		chgquest 17694,17695;
		set EP20_1QUE,20;
		end;
	}
	if(EP20_1QUE == 20) {
		mes "[ミリアム]";
		mes "本当に、大丈夫なんでしょうか？";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 19)
		showevent 0, 1, "ミリアム#20ms10";
	end;
}
jor_safty2.gat,81,362,3	script(CLOAKED)	ホルル#20ms10	10470,{/* 3413 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ホルル]";
		mes "ルガンに変身した方が良いですよ。";
		close;
	}
	if(EP20_1QUE == 20) {
		mes "[ホルル]";
		mes "あのルガンの全てを模倣する？";
		mes "そんなの信じられませんね。";
		next;
		mes "[ホルル]";
		mes "まあ、あのルガンは私が";
		mes "氷の城に連れて行きます。";
		mes "捕虜として情報を聞き出せるなら";
		mes "悪い話ではありませんから。";
		next;
		cloakoffnpc "レイジー#20ms11";
		cloakoffnpc "ルガン主教#20ms10";
		mes "[ルガン主教]";
		mes "お～～い！";
		unittalk getnpcid(0,"レハール#20ms10"),"レハール : うわぁっ!?",1;
		emotion 23,"レハール#20ms10",1;
		next;
		menu "……どっちがレイジーさん？",-;
		mes "[レイジー]";
		mes "ふふふ……";
		mes "冒険者にも区別がつかないだろ？";
		mes "流石はレイジーさん！　だって？";
		mes "そんなに褒めなくても良いよ。";
		mes "ほら、私って謙虚だから。";
		unittalk getnpcid(0,"ルガン主教#20ms10"),"ルガン主教 : んむむ！　んむむ～～！！",1;
		next;
		mes "[レイジー]";
		mes "これなら奴らの本拠地に";
		mes "侵入できるだろう。";
		mes "さて、私のことはこれから";
		mes "「ナドヤガンド」と呼ぶように。";
		next;
		mes "[ミリアム]";
		mes "ほ、本当に大丈夫なんでしょうか？";
		mes "バレたりしませんか？";
		next;
		mes "[レイジー]";
		mes "この人から聞いた話だと";
		mes "本拠地は身元が保証されたルガンだけが";
		mes "入れるらしい。";
		mes "呪術師も、外の見回りが主で";
		mes "本拠地の中にはいないそうだ。";
		next;
		mes "[ホルル]";
		mes "では、このルガンは";
		mes "私が連れて行きます。";
		mes "皆さんは侵入作戦を継続してください。";
		unittalk getnpcid(0,"レイジー#20ms11"),"レイジー : よし、行こう！",1;
		next;
		cloakonnpc "レイジー#20ms11";
		cloakonnpc "ミリアム#20ms10";
		cloakonnpc "レハール#20ms10";
		chgquest 17695,17696;
		set EP20_1QUE,21;
		mes "‐情報収集へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐情報収集へ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 25, 280;
		end;
	}
	if(EP20_1QUE == 21) {
		mes "[ホルル]";
		mes "では、このルガンは";
		mes "私が連れて行きます。";
		mes "皆さんは侵入作戦を継続してください。";
		next;
		mes "‐情報収集へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐情報収集へ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 25, 280;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 20)
		showevent 0, 1, "ホルル#20ms10";
	end;
}
jor_safty2.gat,78,357,7	script(CLOAKED)	レハール#20ms10	10472,{/* 3414 (cloaking)*/}
jor_safty2.gat,75,360,5	script(CLOAKED)	ルガン主教#20ms10	10474,{/* 3415 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "なぜここに人間が!?";
		close;
	}
	end;
}
jor_safty2.gat,77,362,5	script(CLOAKED)	レイジー#20ms11	10474,{/* 3416 (cloaking)*/}
jor_sanct.gat,162,86,3	script	ルガン#20ms20	10475,{/* 3417 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "何で人間めが！！";
		close;
	}
	if(EP20_1QUE == 21) {
		cloakoffnpc "レイジー#20ms20";
		cloakoffnpc "レハール#20ms20";
		cloakoffnpc "ミリアム#20ms20";
		mes "[ルガン]";
		mes "……ナドヤガンド？";
		mes "私はどうやら疲れているようだ。";
		mes "ここにいるはずのない";
		mes "ナドヤガンドの姿が見える。";
		next;
		cloakoffnpc "ルガン#20ms21";
		cloakoffnpc "ルガン#20ms22";
		mes "[ルガン]";
		mes "なんだって？";
		mes "今日担当した仕事を終えて";
		mes "ナドヤガンドが戻ってきたのか？";
		mes "そんなバカなことがあるか！";
		emotion 23,"ルガン#20ms21",1;
		next;
		mes "[ルガン]";
		mes "いつものように";
		mes "やるべき仕事を放棄して";
		mes "戻って来たに違いない。";
		mes "そんなことを続ければ";
		mes "サレクガンドがただではおかないぞ。";
		next;
		mes "[ルガン]";
		mes "ナドヤガンドのように";
		mes "仕事をさぼっても平気なら";
		mes "私も仕事をさぼれば良かった！";
		next;
		mes "[ルガン]";
		mes "何を言うのか！";
		mes "私達はラスガンド様の為に";
		mes "大切な仕事に従事しているのだ！";
		mes "仕事をいただけて光栄だと思え！";
		next;
		mes "[ルガン]";
		mes "キツイことは、キツイんだ。";
		mes "我々最上級ルガンはこれまで";
		mes "労働に従事したことがあったか？";
		next;
		mes "[ルガン]";
		mes "それは……そうだが……。";
		next;
		mes "[ルガン]";
		mes "とは言え、ナドヤガンド。";
		mes "キミも外に出て";
		mes "仕事を終わらせてきた方が良い。";
		mes "サレクガンドにどやされる前にな。";
		next;
		mes "[ルガン]";
		mes "ところで、その後ろの司祭たちは";
		mes "初めてみる顔だが……？";
		mes "まさか、人間が化けているんじゃ";
		mes "ないだろうな？";
		next;
		mes "[ルガン]";
		mes "ナドヤガンド、キミが戻る前に";
		mes "我らに変身した人間が";
		mes "ここに入って来たのだ。";
		next;
		mes "[レイジー]";
		mes "そんなことがあったのか。";
		mes "この司祭たちは";
		mes "遠方の偵察任務に就いていたが";
		mes "先ほど戻ってきたところなのだ。";
		next;
		mes "[レイジー]";
		mes "以前の居住地がああいう状況だから";
		mes "彷徨っていたところを私が保護した。";
		mes "ついでに、私の仕事も代わりに";
		mes "やってもらったのだ。";
		next;
		mes "[レハール]";
		mes "そのとおりです。";
		mes "私たちの身元を保証してくださったので";
		mes "ナドヤガンド主教様の仕事を";
		mes "代わりに行いました。";
		next;
		mes "[ルガン]";
		mes "なに!?　代わりに仕事を行った？";
		mes "つまり……働き手か？";
		unittalk getnpcid(0,"ルガン#20ms21"),"ルガン : 働き手だと！",1;
		unittalk getnpcid(0,"ルガン#20ms22"),"ルガン : それは本当か！",1;
		emotion 3,"ルガン#20ms21",1;
		emotion 3,"ルガン#20ms22",1;
		next;
		mes "[ルガン]";
		mes "今は慢性的な働き手不足だからな！";
		mes "身分の保証された人員が増えるのは";
		mes "ありがたいことだ！";
		next;
		mes "[ルガン]";
		mes "君たち、ここを片付けてくれ！";
		next;
		mes "[ルガン]";
		mes "私の仕事からやってもらう！";
		next;
		mes "[ルガン]";
		mes "何を言ってる！　私の仕事が先だ！";
		next;
		mes "[ルガン]";
		mes "私の仕事の方が";
		mes "お前の仕事より重要だぞ！";
		next;
		mes "[レイジー]";
		mes "みんな、落ち着け。";
		mes "この者たちに仕事を頼みたいのなら";
		mes "順番に聞こうじゃないか。";
		next;
		mes "[ルガン]";
		mes "そ、そうしよう……";
		mes "まずは私から頼みたいことがある。";
		next;
		mes "[レイジー]";
		mes "仕事は、この司祭に頼めば良い。";
		mes "器用になんでもこなしてくれる。";
		mes "あとの二人は、私に付いてくるように。";
		mes "では失礼する。";
		close2;
		cloakonnpc "ルガン#20ms21";
		cloakonnpc "ルガン#20ms22";
		cloakonnpc "レイジー#20ms20";
		cloakonnpc "レハール#20ms20";
		cloakonnpc "ミリアム#20ms20";
		chgquest 17696,17697;
		set EP20_1QUE,22;
		end;
	}
	if(EP20_1QUE == 22) {
		mes "[ルガン]";
		mes "ふむ……確かに仕事ができそうな";
		mes "司祭だな。";
		next;
		mes "[ルガン]";
		mes "私達がここに来てから";
		mes "しばらくは大変だった。";
		mes "最近になってようやく以前のような";
		mes "生活を送れるようになったが……。";
		next;
		mes "[ルガン]";
		mes "司教以下の実務に当たる者は";
		mes "本当に身分の保証された";
		mes "少数しかいない。";
		next;
		mes "[ルガン]";
		mes "要するに、人手不足なのだ。";
		mes "本来、実務に当たることはない主教が";
		mes "仕事をしている理由が";
		mes "これでわかっただろう？";
		emotion 54,"ルガン#20ms20",1;
		next;
		menu "はい、承知いたしました",-;
		mes "[ルガン]";
		mes "では、私の仕事をお前に与えよう。";
		mes "外に出て^0000cdヘビイチゴ^000000を";
		mes "採取してくるのだ。";
		next;
		menu "ヘビイチゴですか？",-;
		mes "[ルガン]";
		mes "そうだ。";
		mes "ここでは贅沢な生活はできないが";
		mes "ヘビイチゴのような嗜好品が";
		mes "まったく無いのは由々しき事態だ。";
		mes "皆の不満が溜まるだろう。";
		next;
		mes "[ルガン]";
		mes "「蛇神の根源 02」にて";
		mes "^0000cdヘビイチゴ 3個^000000を採取したら";
		mes "ここに戻って来てくれ。";
		mes "私は休憩しているからな。";
		next;
		chgquest 17697,17698;
		set EP20_1QUE,23;
		mes "‐ヘビイチゴの採取へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐ヘビイチゴの採取へ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 38, 63;
		end;
	}
	if(EP20_1QUE == 23) {
		mes "[ルガン]";
		mes "「蛇神の根源 02」にて";
		mes "^0000cdヘビイチゴ 3個^000000を採取してくるよう";
		mes "言ったはずだが？";
		mes "真面目にやってくれ。";
		next;
		mes "‐ヘビイチゴの採取へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ヘビイチゴの採取へ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 38, 63;
		end;
	}
	if(EP20_1QUE == 24) {
		//ヘビイチゴ所持数チェックなし
		mes "[ルガン]";
		mes "戻ったか。";
		mes "確かに依頼した数は";
		mes "揃っているようだな。";
		next;
		mes "[ルガン]";
		mes "ヘビイチゴは、主教たちの";
		mes "嗜好品だ。";
		mes "司祭たちの口に入ることはなかったな。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "そうなのですね。";
		mes "自分には解らないことが多いです。";
		mes "ここも、どういった場所なのでしょう？";
		next;
		mes "[ルガン]";
		mes "教えてやろう。";
		mes "この場所は我ら";
		mes "^0000cdヨルムンガンド教団の聖域^000000。";
		mes "ヨルムンガンド様の祝福を受け";
		mes "ラスガンド様が目覚めた場所なり。";
		next;
		mes "[ルガン]";
		mes "今は、ラスガンド様の居所であり";
		mes "祭祀を行う神聖なる場所。";
		mes "以前は、ラスガンド様の他は";
		mes "限られた者しか入れなかったが";
		mes "人間どもの騒動以降は、";
		mes "主教以上も入れるようになったのだ。";
		next;
		menu "主教以上が集まっている？",-;
		mes "[ルガン]";
		mes "そうだ。";
		mes "時が迫っている。";
		mes "主教たちは心身を清め";
		mes "間もなくいらっしゃる";
		mes "ヨルムンガンド様をお迎えするのだ。";
		next;
		menu "それは……いつでしょうか？",-;
		mes "[ルガン]";
		mes "さあ……だが";
		mes "その時は、そう遠くはない。";
		mes "お前も心身を清め、奉仕すれば";
		mes "再臨されるヨルムンガンド様の";
		mes "お近くにいることを許されるだろう。";
		next;
		menu "はい、そうしましょう",-;
		mes "[ルガン]";
		mes "よい返事だ。";
		mes "ヨルムンガンド様の祝福を受ければ";
		mes "永遠に生きられる。";
		mes "……さあ、私はもう休む。";
		mes "仕事を依頼したい他の者のところに";
		mes "行くが良い。";
		next;
		chgquest 17719,17699;
		delitem 1001154,countitem(1001154);
		set EP20_1QUE,25;
		mes "‐他のルガンたちの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐他のルガンたちの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 185, 123;
		end;
	}
	if(EP20_1QUE == 25) {
		mes "[ルガン]";
		mes "ヨルムンガンド様の祝福を受ければ";
		mes "永遠に生きられる。";
		mes "……さあ、私はもう休む。";
		mes "仕事を依頼したい他の者のところに";
		mes "行くが良い。";
		next;
		mes "‐他のルガンたちの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐他のルガンたちの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 185, 123;
		end;
	}
	//29で確認
	mes "[ルガン]";
	mes "あの日はいつ来るのか……";
	mes "そう遠くはない。";
	mes "そんな気がする。";
	close;
OnQuestInfo:
	if(EP20_1QUE >= 21 && EP20_1QUE <= 25)
		showevent 0, 1, "ルガン#20ms20";
	end;
}
jor_root2.gat,43,63,0	script	#20ms00_berry	139,9,9,{/* 3418 */
	if(EP20_1QUE == 23)
		cloakoffnpc "固まった場所#20ms00";
	end;
}
jor_root2.gat,43,63,5	script(CLOAKED)	固まった場所#20ms00	10428,{/* 3419 (cloaking)*/
	if(EP20_1QUE == 23) {
		mes "‐ヘビイチゴを手に入れた‐";
		close2;
		chgquest 17698,17719;
		getitem 1001154,3;
		set EP20_1QUE,24;
		mes "‐依頼主のルガンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
	}
	if(EP20_1QUE == 24) {
		mes "‐これ以上、ヘビイチゴは必要ない。";
		mes "　戻って報告しよう‐";
		next;
		mes "‐依頼主のルガンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐依頼主のルガンのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 159, 83;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 23 || EP20_1QUE == 24)
		showevent 0, 1, "固まった場所#20ms00";
	end;
}
jor_sanct.gat,160,82,7	script(CLOAKED)	レハール#20ms20	10472,{/* 3420 (cloaking)*/}
jor_sanct.gat,159,84,7	script(CLOAKED)	レイジー#20ms20	10474,{/* 3421 (cloaking)*/}
jor_sanct.gat,157,85,7	script(CLOAKED)	ミリアム#20ms20	10471,{/* 3422 (cloaking)*/}
jor_sanct.gat,161,88,3	script(CLOAKED)	ルガン#20ms21	10474,{/* 3423 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "なぜここに人間が!?";
		close;
	}
	end;
}
jor_sanct.gat,164,86,3	script(CLOAKED)	ルガン#20ms22	10473,{/* 3424 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "なぜここに人間が!?";
		close;
	}
	end;
}
jor_sanct.gat,185,128,3	script	ルガン#20ms23	10474,{/* 3425 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "なぜここに人間が!?";
		close;
	}
	if(EP20_1QUE == 25) {
		mes "[ルガン]";
		mes "来たか。";
		mes "待っていたぞ。";
		next;
		menu "何をすれば良いですか？",-;
		mes "[ルガン]";
		mes "この装置を設置しなおしてもらう。";
		mes "集めた魔力を取り出して";
		mes "空っぽの状態だ。";
		mes "適当な場所に置いてくれば良い。";
		next;
		menu "これは何ですか？",-;
		mes "[ルガン]";
		mes "遠方から戻って来たばかりだったな。";
		mes "これは外部からきた人間が作ったもので";
		mes "あちこちに溜まっている魔力を";
		mes "収集する装置だ。";
		next;
		mes "[ルガン]";
		mes "魔力が収集できたら回収して";
		mes "ここで魔力を抽出する。";
		mes "魔力抽出後はまた";
		mes "装置を設置する必要があるのだ。";
		next;
		mes "[ルガン]";
		mes "本来は、司祭たちがやる仕事だろうが";
		mes "人手が足りないからな……";
		mes "このように我々も手伝っている。";
		emotion 54,"ルガン#20ms23",1;
		next;
		mes "[ルガン]";
		mes "幸いなことに、この装置から";
		mes "魔力を抽出する作業は";
		mes "外部からきた人間の仕事だ。";
		mes "あれは、見ているだけでも";
		mes "頭が痛くなる作業だからな。";
		next;
		mes "[ルガン]";
		mes "さて、鳥変身装置は持っているか？";
		next;
		menu "何ですか、それ？",-;
		mes "[ルガン]";
		mes "うっかりしていたな。";
		mes "それも外部から来た人間が作った物だ。";
		mes "我々の姿を、あの忌まわしい鳥の姿に";
		mes "変化させてくれる。";
		next;
		mes "[ルガン]";
		mes "屈辱的だが仕方ない。";
		mes "あの姿であれば、氷の城の人間どもに";
		mes "気付かれずに行動できる。";
		mes "阿呆な鳥たちも";
		mes "偽物を見分けることができないようだ。";
		next;
		mes "[ルガン]";
		mes "ふむ……この仕事は";
		mes "お前以外の者に任せた方が良さそうだ。";
		mes "鳥変身装置を使った事が無いのだろう？";
		mes "あれに適応するのは訓練が必要だ。";
		next;
		mes "[ルガン]";
		mes "時間がある時に訓練しておくように。";
		mes "とはいえ、この装置を";
		mes "どうにかして設置しなければ……";
		mes "よし、この装置は";
		mes "別の主教に渡してくれ。";
		next;
		mes "[ルガン]";
		mes "奴は怒るだろうが";
		mes "最終的にはやってくれるだろう。";
		next;
		mes "[ルガン]";
		mes "装置を渡しても";
		mes "ここに戻って来る必要はないぞ。";
		mes "さあ、装置を持って行け。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		chgquest 17699,17700;
		set EP20_1QUE,26;
		getitem 1001218,1;
		mes "‐別の主教へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐別の主教へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 44, 105;
		end;
	}
	if(EP20_1QUE == 26) {
		mes "[ルガン]";
		mes "装置を渡しても";
		mes "ここに戻って来る必要はないぞ。";
		mes "早く別の主教に渡してくれ。";
		next;
		mes "‐別の主教へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐別の主教へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 44, 105;
		end;
	}
	mes "[ルガン]";
	mes "いつまでこんなことを……";
	mes "いや、違う！";
	mes "ラスガンド様の為ならこれしきのこと！";
	close;
OnQuestInfo:
	if(EP20_1QUE == 25 || EP20_1QUE == 26)
		showevent 0, 1, "ルガン#20ms23";
	end;
}
jor_sanct.gat,183,131,3	script	魔力回収装置#20ms4	10538,{/* 3426 */}
jor_sanct.gat,184,130,5	script	魔力回収装置#20ms5	10538,{/* 3427 */}
jor_sanct.gat,183,130,7	script	魔力回収装置#20ms6	10540,{/* 3428 */}

jor_sanct.gat,42,105,0	script	#20ms20	139,9,9,{/* 3429 */
	if(EP20_1QUE == 26)
		cloakoffnpc "ルガン#20ms24";
	else if(EP20_1QUE == 27) {
		cloakoffnpc "レイジー#20ms21";
		cloakoffnpc "レハール#20ms21";
		cloakoffnpc "ミリアム#20ms21";
	}
	end;
}
jor_sanct.gat,42,105,5	script(CLOAKED)	ルガン#20ms24	10473,{/* 3430 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "なぜここに人間が!?";
		close;
	}
	if(EP20_1QUE == 26) {
		mes "[ルガン]";
		mes "新しく来た司祭だな？";
		mes "残念だが、キミに渡す仕事は";
		mes "無くなってしまった。";
		next;
		mes "[ルガン]";
		mes "暇だったから全部自分で";
		mes "やってしまったのだ。";
		mes "案外私は、こうした仕事が";
		mes "性に合っているのかもしれん。";
		next;
		mes "[ルガン]";
		mes "おっと……他の主教には言うなよ。";
		mes "奴らの仕事まで";
		mes "受け持つつもりは無いからな。";
		next;
		menu "人手不足なのですね",-;
		mes "[ルガン]";
		mes "その通りだ。";
		mes "ヨルムンガンド様の復活が迫る中";
		mes "我々は心身を清める必要がある。";
		mes "しかし、労務に携わる者が少ないため";
		mes "主教であっても仕事をせねばならない。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "この装置は、外部からきた人間が";
		mes "作り出したと聞きました。";
		next;
		mes "[ルガン]";
		mes "魔力を吸収する装置だな。";
		mes "そうだ。";
		mes "あの黒髪の人間が作ったものだ。";
		mes "奴は人間のくせに";
		mes "魔力を扱う技術を持っている。";
		next;
		mes "[ルガン]";
		mes "ルガンの中でも、少数の呪術師のみが";
		mes "魔力の扱いに長けているが";
		mes "それに劣らない技術だ。";
		mes "少々、人間を見直したぞ。";
		next;
		mes "[ルガン]";
		mes "あの黒髪の人間の助力によって";
		mes "ヨルムンガンド様の復活が";
		mes "現実のものとなろうとしている。";
		mes "それゆえに、ラスガンド様の";
		mes "信も得ているというわけだ。";
		next;
		menu "ラスガンド様は、どちらにおられますか？",-;
		mes "[ルガン]";
		mes "さあ……特別な理由がない限りは";
		mes "我々主教といえども";
		mes "そのお姿を見ることはできない。";
		mes "聞く話によれば";
		mes "ヨルムンガンド様復活の為に";
		mes "注力しておられるらしいが。";
		next;
		menu "「あの場所」で、ですか？",-;
		mes "[ルガン]";
		mes "あの場所とは、なんのことだ？";
		mes "あのお方が何処で何をしておられるか";
		mes "我々が知る必要はない。";
		next;
		mes "[ルガン]";
		mes "そう言えば、黒髪の人間以外にも";
		mes "ハートなんとかと呼ばれる人間がいる。";
		mes "奴らは、ラスガンド様や黒髪の人間の";
		mes "護衛をすることもあるそうだ。";
		next;
		mes "[ルガン]";
		mes "普段は、キミが持っている";
		mes "その装置から魔力を抽出している。";
		mes "気になったのなら探してみると良い。";
		next;
		menu "これは、貴方に渡すように言われて……",-;
		mes "[ルガン]";
		mes "なにっ？";
		mes "私にまた仕事を押し付けるつもりか！";
		mes "今度は許さん！　抗議してやる！";
		next;
		cloakoffnpc "レイジー#20ms21";
		mes "[レイジー]";
		mes "お～い、冒険者！";
		mes "探してたよ。";
		mes "お、ちょうど他のみんなも";
		mes "集まって来たぞ！";
		next;
		cloakoffnpc "レハール#20ms21";
		cloakoffnpc "ミリアム#20ms21";
		mes "[レハール]";
		mes "ふぅ～、何とか合流できました。";
		next;
		mes "[ミリアム]";
		mes "たくさんの仕事を押し付けられて";
		mes "抜け出すのに苦労しました。";
		next;
		menu "何か情報は得られましたか？",-;
		mes "[レハール]";
		mes "それが全然。";
		mes "仕事の話はするくせに";
		mes "その他のことは教えてくれません。";
		next;
		mes "[ミリアム]";
		mes "司祭に教える必要はない。";
		mes "という雰囲気でしたね。";
		next;
		menu "レイジーさんはどうです？",-;
		mes "[レイジー]";
		mes "それがさ～この変装元の";
		mes "「ナドヤガンド」の評判が最悪でね。";
		mes "誰も私と話をしてくれないんだよ！";
		mes "人選を間違えたな～こりゃ。";
		next;
		mes "[レイジー]";
		mes "というわけだから情報収集には";
		mes "もう少し時間が掛かりそうだよ。";
		mes "で、冒険者の方はどう？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ラスガンドの居場所を聞きましたが";
		mes "情報は得られませんでした。";
		mes "ただ……ヨルムンガンドの復活が";
		mes "近づいていると、みんな言っています。";
		next;
		mes "[レハール]";
		mes "そうですね。浮足立っているようです。";
		mes "でも、欲しい情報が得られません。";
		mes "本当に知らないのでしょうか？";
		next;
		mes "[レイジー]";
		mes "誰か知っているはずだ。";
		mes "例えば、ラスガンドの右手と";
		mes "呼ばれてる主教が……。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "確か名前は……。";
		next;
		mes "[レイジー]";
		mes "「^0000cdサレクガンド^000000」。";
		mes "誰かが、ここを取り仕切っていると";
		mes "言っていた気がする。";
		next;
		mes "[レイジー]";
		mes "よし、サレクガンド様に取り入って";
		mes "情報を聞きだすとしよう！";
		mes "引き続き、ルガンたちの仕事を手伝えば";
		mes "サレクガンド様のお眼鏡に";
		mes "かなうかもしれないぞ！";
		next;
		mes "[レイジー]";
		mes "冒険者は「パモスガンド」のところに";
		mes "行ってみてくれ。";
		mes "何やら作業員を探していたからな。";
		next;
		chgquest 17700,17701;
		set EP20_1QUE,27;
		delitem 568,1;
		mes "‐パモスガンドのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐パモスガンドのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 252, 115;
		end;
	}
	if(EP20_1QUE == 27) {
		mes "[ルガン]";
		mes "他の仕事も……面白いだろうか？";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 26)
		showevent 0, 1, "ルガン#20ms24";
	end;
}
jor_sanct.gat,47,105,1	script(CLOAKED)	レハール#20ms21	10472,{/* 3431 (cloaking)*/
	mes "[レハール]";
	mes "潜入作戦も骨が折れますね……。";
	close;
}
jor_sanct.gat,47,108,3	script(CLOAKED)	ミリアム#20ms21	10471,{/* 3432 (cloaking)*/
	mes "[ミリアム]";
	mes "ルガンたちの手伝いをしながら";
	mes "情報を集めようか。";
	close;
}
jor_sanct.gat,44,108,5	script(CLOAKED)	レイジー#20ms21	10474,{/* 3433 (cloaking)*/
	if(EP20_1QUE == 27) {
		mes "[レイジー]";
		mes "冒険者は「パモスガンド」のところに";
		mes "行ってみてくれ。";
		mes "何やら作業員を探していたからな。";
		next;
		mes "‐パモスガンドのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐パモスガンドのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 252, 115;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 27)
		showevent 0, 1, "レイジー#20ms21";
	end;
}
jor_sanct.gat,157,171,3	script	サレクガンド#20ms20	10473,{/* 3434 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[サレクガンド]";
		mes "なぜ人間がここにいる！";
		close;
	}
	if(EP20_1QUE == 40) {
		mes "[サレクガンド]";
		mes "……。";
		next;
		menu "あの、主教様？",-;
		mes "[サレクガンド]";
		mes "……挨拶もせずに";
		mes "何をぼーっとしている？";
		emotion 6,"サレクガンド#20ms20",1;
		next;
		menu "お、おはようございます。",-;
		mes "[サレクガンド]";
		mes "挨拶は、もういい。";
		mes "ナドヤガンドが連れて来た";
		mes "司祭らしいな？";
		mes "偵察任務に当たっていたと。";
		next;
		mes "[サレクガンド]";
		mes "お前が他の主教たちを";
		mes "手伝っていたのは知っている。";
		next;
		emotion 9,"",1;
		mes "[サレクガンド]";
		mes "主教に幾つか仕事を任せていたが";
		mes "実務に慣れていないせいで";
		mes "文句ばかり言う。";
		next;
		mes "[サレクガンド]";
		mes "その点、お前は上手くやってくれた。";
		mes "そこでお前に";
		mes "特別な仕事を任せるつもりだ。";
		next;
		menu "特別な仕事ですか？",-;
		mes "[サレクガンド]";
		mes "そうだ。";
		mes "隠れた[道]の先に門がある。";
		mes "他の者に気付かれぬよう";
		mes "静かについて来るのだ。";
		next;
		chgquest 8840,17702;
		set EP20_1QUE,41;
		mes "‐隠れた道へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐隠れた道へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 27, 278;
		end;
	}
	if(EP20_1QUE == 41) {
		mes "[サレクガンド]";
		mes "隠れた[道]の先に門がある。";
		mes "他の者に気付かれぬよう";
		mes "静かについて来るのだ。";
		next;
		mes "‐隠れた道へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐隠れた道へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 27, 278;
		end;
	}
	mes "[サレクガンド]";
	mes "不吉な予感がするが";
	mes "良い予感もする……。";
	close;
OnQuestInfo:
	if(EP20_1QUE == 40 || EP20_1QUE == 41)
		showevent 0, 1, "サレクガンド#20ms20";
	end;
}
jor_sanct.gat,22,283,5	script	監督官#ep20_DQ_9	10473,5,5,{/* 3435 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[監督官]";
		mes "なぜここに人間が！";
		close;
	}
	if(EP20_1QUE == 41) {
		mes "[監督官]";
		mes "何者だ！";
		mes "……お前は司祭か？";
		mes "なぜここにいる！";
		next;
		emotion 9,"",1;
		menu "サレクガンド様に言われて……",-;
		mes "[監督官]";
		mes "サレクガンドから？";
		mes "何を言われたんだ？";
		next;
		cloakoffnpc "サレクガンド#20ms31";
		mes "[サレクガンド]";
		mes "……何を騒いでいる？";
		next;
		mes "[監督官]";
		mes "この司祭が、お前の名前を口にしたぞ！";
		next;
		mes "[サレクガンド]";
		mes "そうだ。私が連れて来た。";
		next;
		mes "[監督官]";
		mes "ははぁ！";
		mes "わかったぞ！";
		mes "そうか、そういうことだな！";
		mes "なあ？　そうなんだろ？";
		next;
		menu "何ですか？",-;
		mes "[監督官]";
		mes "掃除員としてだ！";
		mes "そうだよな、サレクガンド？";
		next;
		mes "[サレクガンド]";
		mes "言葉遣いに気をつけろ。";
		mes "お前のその言動が";
		mes "ラスガンド様のお耳に入れば";
		mes "お前は追い出されるかもしれん。";
		next;
		mes "[監督官]";
		mes "そんなはずあるか。";
		mes "誰よりも掃除に熱心な俺を";
		mes "追い出すはずがない！";
		next;
		mes "[サレクガンド]";
		mes "ラスガンド様が通られる道は";
		mes "綺麗で静謐なものでなければならない。";
		mes "この司祭は、その為の人材だ。";
		next;
		mes "[監督官]";
		mes "そうか！";
		mes "ただでさえ人手不足だったから";
		mes "ちょうどよかった。";
		mes "ところで、この司祭は信用できるのか？";
		next;
		mes "[サレクガンド]";
		mes "外は呪術師たちが監視しているし";
		mes "主教であるナドヤガンドが";
		mes "連れて来た者たちだ。";
		next;
		mes "[監督官]";
		mes "連れて来た者「たち」？";
		mes "他にも人材がいるのか！";
		mes "よし、全員ここに来させろ！";
		mes "全員、こき使ってやる！";
		emotion 18,"監督官#ep20_DQ_9",1;
		next;
		mes "[サレクガンド]";
		mes "もっと品のある言葉をだな……。";
		next;
		mes "[監督官]";
		mes "ああ、もういい！";
		mes "お前はここに人員を連れて来た。";
		mes "それで十分だ。";
		mes "さっさと戻って自分の仕事をしろ。";
		next;
		mes "[サレクガンド]";
		mes "まったく……";
		mes "では任せるが、ラスガンド様のご機嫌を";
		mes "損ねるわけにはいかん。";
		mes "今からお迎えに向かうから";
		mes "早く処理しておくのだぞ。";
		next;
		mes "[監督官]";
		mes "俺が仕事を適当にしたことあるか？";
		mes "ちゃんと綺麗にしておいてやるから";
		mes "さっさと行け。";
		next;
		menu "私も同行いたします！",-;
		mes "[サレクガンド]";
		mes "お前は、ここでやるべきことがある。";
		mes "やるべき仕事に専念しろ。";
		next;
		cloakonnpc "サレクガンド#20ms31";
		mes "[監督官]";
		mes "2人だけになったな。";
		mes "仕事の内容を教えてやる。";
		mes "この先にいる気持ちの悪い";
		mes "寄生虫を倒せばいい。";
		next;
		menu "寄生虫ですか？",-;
		mes "[監督官]";
		mes "遥か昔から^0000cdヨルムンガンド・ガーディアン^000000と";
		mes "呼ばれる奴らだ。";
		mes "明らかに奇妙な形をしている。";
		emotion 6,"監督官#ep20_DQ_9",1;
		next;
		mes "[監督官]";
		mes "あれのどこがガーディアンなんだ？";
		mes "どう考えても寄生虫だろ。";
		mes "最初に名付けた奴は";
		mes "どうかしてたに違いない。";
		next;
		menu "そうかもしれません",-;
		mes "[監督官]";
		mes "そうだ。";
		mes "ここで養分を吸い取って生きる";
		mes "ただの寄生虫だ。";
		next;
		mes "[監督官]";
		mes "おっと！";
		mes "こんなことしている場合じゃない！";
		mes "間もなくここをラスガンド様が通る。";
		mes "その前に奴らを片付けなきゃならん。";
		mes "それが俺たちの仕事だ。";
		next;
		menu "どこからお戻りになられますか？",-;
		mes "[監督官]";
		mes "そんなのは俺たちにとっちゃ";
		mes "どうでも良いことだ。";
		mes "ただ通路をキレイにすれば良い。";
		next;
		mes "[監督官]";
		mes "最近は、外から来た人間を連れて";
		mes "いろいろやっておられるが";
		mes "上手くいっていないのか";
		mes "機嫌が悪いみたいだしな。";
		next;
		mes "[監督官]";
		mes "よし、この先をうろつく2種類の";
		mes "^0000cdヨルムンガンド・ガーディアン^000000を";
		mes "1匹ずつ倒してこい。";
		mes "それぐらいならできるだろう？";
		close2;
		chgquest 17702,17703;
		set EP20_1QUE,42;
		end;
	}
	if(EP20_1QUE == 42) {
		if(!(checkquest(17703) & 0x4)) {
			mes "[監督官]";
			mes "倒してきたのか？";
			next;
			mes "[監督官]";
			mes "おいおい！　奴らはこの先で";
			mes "堂々とうろついてるやがる！";
			mes "2種類の";
			mes "^0000cdヨルムンガンド・ガーディアン^000000を";
			mes "1匹ずつ倒してこい。";
			close;
		}
		mes "[監督官]";
		mes "倒してきたのか？";
		next;
		menu "はい、倒してきました",-;
		mes "["+strcharinfo(0)+"]";
		mes "あいつらはなぜ";
		mes "私たちを攻撃しますか？";
		mes "近付いた者全てに攻撃しています。";
		mes "^0000cdここに何か重要な物^000000でも";
		mes "あるのでしょうか？";
		next;
		mes "[監督官]";
		mes "そんなこと知るか。";
		mes "物凄い馬鹿だからじゃないか？";
		mes "……たぶんラスガンド様が目覚められた";
		mes "聖域に近いし、魔力が豊富だから";
		mes "ここに押し寄せたとかだろ。";
		emotion 4,"",1;
		next;
		mes "[監督官]";
		mes "名前通りに^0000cd守る者^000000";
		mes "かもしれないが";
		mes "ここは我らルガンの領域だ。";
		mes "倒しても倒しても湧いて来る";
		mes "面倒な奴らだよ……。";
		next;
		cloakoffnpc "レハール#20ms30";
		cloakoffnpc "ミリアム#20ms30";
		mes "[監督官]";
		mes "おい、何者だ！";
		next;
		mes "[レハール]";
		mes "あ……サレクガンド様が";
		mes "ここの掃除を手伝えと仰って……。";
		next;
		mes "[監督官]";
		mes "お前たちが、新しく来た者たちか！";
		emotion 2,"監督官#ep20_DQ_9",1;
		next;
		mes "[ミリアム]";
		mes "この先を掃除すればいいですか？";
		next;
		mes "[監督官]";
		mes "そうだ。";
		mes "この付近は、この司祭が片づけたが";
		mes "他の主教たちもこの先で";
		mes "それぞれ掃除を行っている。";
		next;
		mes "[監督官]";
		mes "お前たちは掃除中の主教たちを手伝え。";
		mes "ラスガンド様がここを通るまでに";
		mes "まだ時間があるはずだ。";
		mes "最近、忙しくしておられるからな。";
		mes "……そこのお前！";
		next;
		menu "はい、私ですか？",-;
		mes "[監督官]";
		mes "そう、お前だ。";
		mes "新しく来た奴を連れて";
		mes "この先にある「労役場」に行け。";
		mes "お前が、こいつらの大将だ。";
		next;
		mes "[監督官]";
		mes "頑張れよ。";
		mes "栄光のその日が来た時には";
		mes "お前の席も用意されるかもしれない。";
		next;
		mes "[レハール]";
		mes "<FONT SIZE = 10>私たち、どこに行けばいいですか？</FONT>";
		next;
		menu "サレクガンドが……",-;
		mes "[ミリアム]";
		mes "その者がラスガンドを迎えに";
		mes "行っているのですか？";
		mes "つまり、その者の「痕跡」を追えば";
		mes "ラスガンドの居場所がわかるのですね。";
		unittalk getnpcid(0,"レハール#20ms30"),"レハール : よし、追い掛けましょう！",1;
		close2;
		cloakonnpc "レハール#20ms30";
		cloakonnpc "ミリアム#20ms30";
		chgquest 17703,17704;
		set EP20_1QUE,43;
		end;
	}
	if(EP20_1QUE == 43) {
		mes "[監督官]";
		mes "ラスガンド様のご機嫌を損ねないよう";
		mes "綺麗に片付けなきゃならない！";
		close2;
		unittalk getcharid(3),strcharinfo(0)+" : 蛇の迷路を進んでサレクガンドを追おう。",1;
		end;
	}
	if(EP20_1QUE == 100) {
		mes "[監督官]";
		mes "掃除はまだなのか？";
		mes "修行するという気持ちで";
		mes "一生懸命掃除しろよ。";
		mes "復活の時が近づけば司祭と言えども";
		mes "あの方のために働けるようになる。";
		//if(checkquest(131265) == 0) {
		//	setquest 131265;
		//	compquest 131265;
		//}
		next;
		if(select("クエストの受注や報告を行う","ダンジョンに移動する(蛇の迷路)") == 2) {
			mes "^ff0000‐移動には500Zenyが必要です‐^000000";
			next;
			mes "[監督官]";
			mes "よし。";
			mes "それじゃ、現地までいくか？";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_maze.gat", 140, 74;
			end;
		}
		setarray '@questname$,"蛇の迷路の掃除";
		setarray '@questid,17710;
		setarray '@coolid,17711;
		setarray '@gainlist,1001217,10;
		setarray '@explist,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// 蛇の迷路の掃除
			if(checkquest(17711)) {
				if(checkquest(17711)&2 == 0) {
					mes "[監督官]";
					mes "何でもう来たんだ？";
					mes "今日はもう掃除をしなくていいぞ。";
					mes "また明日来てくれ。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000蛇の迷路の掃除^000000」";
					mes "は時間制限中です。^000000";
					close;
				}
			}
			if(checkquest(17710)) {
				if(checkquest(17710)&4 == 0) {
					mes "[監督官]";
					mes "^e5555eJガーディアン-P^000000と";
					mes "^e5555eJガーディアン-Y^000000を";
					mes "各5匹ずつ倒してこい。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000蛇の迷路の掃除^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close;
					}
					delquest 17710;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000蛇の迷路の掃除^000000」";
					mes "を破棄しました。";
					close;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000蛇の迷路の掃除^000000」";
				mes "<内容>";
				mes "対象：<URL>Jガーディアン-P<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD1</INFO></URL>　5体";
				mes "対象：<URL>Jガーディアン-Y<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD2</INFO></URL>　5体";
				mes "の討伐";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "※400000000を20回受け取ります。";
				mes "JobExp 6G ( 6000000000 )";
				mes "※300000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000蛇の迷路の掃除^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close;
				}
				delquest 17710;
				setquest 17711;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[監督官]";
				mes "司祭が懸命に奉仕したお陰で、";
				mes "凄く綺麗になった。";
				mes "もやもやしていた気分が晴れて";
				mes "すっきりしたぞ。よくやった。";
				mes "今日は休んで、明日また来てくれ。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "※400000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "※300000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close;
			}
			mes "[監督官]";
			mes "お前か。ちょうどいいところにきた。";
			mes "この前に向こう側に人間一人が侵入して";
			mes "騒動になったらしい。";
			mes "近頃ラスガンド様のご機嫌が";
			mes "悪いと言う話が聞こえてくる。";
			next;
			mes "[監督官]";
			mes "だから、より一生懸命に";
			mes "掃除をしなくちゃいけない。";
			mes "以前のように閉鎖すればいいのに、";
			mes "そうされないのは、ラスガンド様に";
			mes "何か考えがあるのだろう。";
			next;
			mes "[監督官]";
			mes "今回もあの寄生虫たち、";
			mes "^e5555eJガーディアン-P^000000と";
			mes "^e5555eJガーディアン-Y^000000を";
			mes "各5匹ずつ倒してきてくれ。";
			next;
			mes "[監督官]";
			mes "あいつらがいなくなれば、";
			mes "すっきりする。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000蛇の迷路の掃除^000000」";
			mes "<内容>";
			mes "対象：<URL>Jガーディアン-P<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD1</INFO></URL>　5体";
			mes "対象：<URL>Jガーディアン-Y<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD2</INFO></URL>　5体";
			mes "の討伐を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[監督官]";
				mes "何？休む？";
				mes "ふむ……まあ、何も言わずに";
				mes "来ないよりかはいいか。";
				mes "分かった。";
				mes "今日は休んで、明日また来い。";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close;
			}
			if(checkquest(17711)) delquest 17711;
			setquest 17710;
			mes "[監督官]";
			mes "よし、いってこい。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000蛇の迷路の掃除^000000」";
			mes "を受注しました。";
			close;
		}
	}
	mes "[監督官]";
	mes "ラスガンド様のご機嫌を損ねないよう";
	mes "綺麗に片付けなきゃならない！";
	close;
OnTouch:
	if(EP20_1QUE == 41)
		unittalk "監督官 : お前か？　お前がそうなのか？",1;
	end;
OnQuestInfo:
	if(checkquest(17703) && !checkquest(17703)&0x4)
		showevent 0, 2, "監督官#ep20_DQ_9";
	else if(EP20_1QUE == 41 || EP20_1QUE == 42)
		showevent 0, 1, "監督官#ep20_DQ_9";
	else if(EP20_1QUE == 100 && checkquest(17710)&4 == 0)
		showevent 0, 3, "監督官#ep20_DQ_9";
	end;
}
jor_sanct.gat,26,282,3	script(CLOAKED)	レハール#20ms30	10472,{/* 3436 (cloaking)*/}
jor_sanct.gat,25,280,1	script(CLOAKED)	ミリアム#20ms30	10471,{/* 3437 (cloaking)*/}
jor_sanct.gat,26,283,3	script(CLOAKED)	サレクガンド#20ms31	10473,{/* 3438 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[サレクガンド]";
		mes "なぜ人間がここにいる！";
		close;
	}
	end;
}

jor_maze.gat,15,47,7	script	労役場1への入口#20ms40	10046,{/* 3439 */
	if(EP20_1QUE == 43) {
		unittalk getcharid(3),strcharinfo(0)+" : サレクガンドの痕跡が残っている！　入ってみよう",1;
		if(!sleep2(500)) end;
	}
	warp "jor_safty2.gat", 193, 36;
	end;
OnQuestInfo:
	if(EP20_1QUE == 43)
		showevent 0, 1, "労役場1への入口#20ms40";
	end;
}
jor_safty2.gat,193,39,0	script	#20ms40_sw	139,5,5,{/* 3440 */
	if(EP20_1QUE == 43 || EP20_1QUE == 44) {
		cloakoffnpc "ミリアム#20ms40";
		cloakoffnpc "レハール#20ms40";
		cloakoffnpc "ルガン#20ms40";
		cloakoffnpc "ルガン#20ms41";
		cloakoffnpc "Jガーディアン#ms40";
	}
	end;
}
jor_safty2.gat,190,38,7	script(CLOAKED)	ミリアム#20ms40	10471,{/* 3441 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ミリアム]";
		mes "ここではルガンに変身していた方が";
		mes "良いですよ。";
		close;
	}
	if(EP20_1QUE == 43) {
		mes "[ミリアム]";
		mes "サレクガンドの痕跡を追ってきましたが";
		mes "そう簡単にはいかないね……。";
		next;
		mes "[レハール]";
		mes "ここは監督官が言ってた";
		mes "労役場でしょうか？";
		unittalk getnpcid(0,"ルガン#20ms40"),"ルガン : そこ、捕まえろ！！",1;
		next;
		menu "そのようです",-;
		mes "[ミリアム]";
		mes "……何かを狩っている？";
		next;
		mes "[レハール]";
		mes "あれを討伐することを";
		mes "掃除だと言ってるんですね？";
		next;
		menu "はい、そうです",-;
		mes "[ミリアム]";
		mes "あれは……何なのですか？";
		unittalk getnpcid(0,"Jガーディアン#ms40"),"Jガーディアン : くおぉー",1;
		unittalk getnpcid(0,"ルガン#20ms41"),"ルガン : ほぼ倒せた！！",1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "ヨルムンガンド・ガーディアンと";
		mes "呼ばれているようです。";
		unittalk getnpcid(0,"ルガン#20ms40"),"ルガン : ギャア！！",1;
		unittalk getnpcid(0,"ルガン#20ms41"),"ルガン : 大丈夫か！",1;
		next;
		mes "[レハール]";
		mes "ここに足を踏み入れた者を";
		mes "執拗に攻撃しているようですね。";
		mes "ほら、ルガンが攻撃されています。";
		next;
		mes "[ミリアム]";
		mes "こちらにとっては都合が良いですね。";
		next;
		mes "[レハール]";
		mes "さっき話を聞きましたが";
		mes "ラスガンドは定期的にこの通路を";
		mes "行き来しているようですね。";
		unittalk getnpcid(0,"ルガン#20ms40"),"ルガン : なんて狂暴な奴らだ！",1;
		next;
		menu "そうみたいです",-;
		mes "[ミリアム]";
		mes "バゴットも一緒に";
		mes "行動しているそうです。";
		next;
		mes "[レハール]";
		mes "この先で何をやってるんでしょうか？";
		next;
		mes "[ミリアム]";
		mes "^0000cdここをガーディアンたちが守る理由と";
		mes "^0000cdラスガンドが行き来する理由は";
		mes "何か関係があるように思います。";
		next;
		mes "[ミリアム]";
		mes "ボクは、ここに残ります。";
		mes "あのルガンたちから";
		mes "何か聞けるかもしれませんから。";
		next;
		mes "[レハール]";
		mes "では私たちは引き続き";
		mes "サレクガンドの痕跡を追いましょう。";
		close2;
		chgquest 17704,17705;
		set EP20_1QUE,44;
		end;
	}
	if(EP20_1QUE == 44) {
		mes "[ミリアム]";
		mes "ボクは、ここに残ります。";
		mes "あのルガンたちから";
		mes "何か聞けるかもしれませんから。";
		next;
		mes "[レハール]";
		mes "では私たちは引き続き";
		mes "サレクガンドの痕跡を追いましょう。";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 43)
		showevent 0, 1, "ミリアム#20ms40";
	end;
}
jor_safty2.gat,189,36,7	script(CLOAKED)	レハール#20ms40	10472,{/* 3442 (cloaking)*/}
jor_safty2.gat,193,42,7	script(CLOAKED)	ルガン#20ms40	10475,{/* 3443 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "なぜ人間が！";
		close;
	}
	unittalk "ルガン : 今日は一段と狂暴だな！",1;
	end;
}
jor_safty2.gat,196,40,7	script(CLOAKED)	ルガン#20ms41	10473,{/* 3444 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "人間めが！";
		close;
	}
	unittalk "ルガン : 昔が懐かしい…",1;
	end;
}
jor_safty2.gat,196,44,3	script(CLOAKED)	Jガーディアン#ms40	21972,{/* 3445 (cloaking)*/}
jor_safty2.gat,193,31,0	warp	#20ms41	1,1,jor_maze.gat,15,40
jor_maze.gat,17,153,7	script	労役場2への入口##20ms42	10046,{/* 3447 */
	warp "jor_safty2.gat", 316, 36;
	end;
OnQuestInfo:
	if(EP20_1QUE == 44)
		showevent 0, 1, "労役場2への入口##20ms42";
	end;
}
jor_safty2.gat,313,36,0	script	#20ms40_sw	139,5,5,{/* 3448 */
	if(EP20_1QUE == 44) {
		cloakoffnpc "レハール#20ms41";
		cloakonnpc "ルガン#20ms42";
		cloakonnpc "ルガン#20ms43";
	}
	if(EP20_1QUE == 45) {
		cloakonnpc "レハール#20ms41";
		cloakonnpc "ルガン#20ms42";
		cloakonnpc "ルガン#20ms43";
	}
	end;
}
jor_safty2.gat,310,43,3	script(CLOAKED)	レハール#20ms41	10472,{/* 3449 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[レハール]";
		mes "冒険者様！";
		mes "ルガンに変身しないとマズイですよ！";
		close;
	}
	if(EP20_1QUE == 44) {
		mes "[レハール]";
		mes "サレクガンドの痕跡を追ってきましたが";
		mes "途切れ途切れで";
		mes "探すのに苦労します。";
		next;
		menu "ここはまるで迷路ですね",-;
		mes "[レハール]";
		mes "本当にそうですね……";
		mes "私たち、道に迷ったんじゃないですか？";
		next;
		cloakoffnpc "ルガン#20ms42";
		cloakoffnpc "ルガン#20ms43";
		mes "[ルガン主教]";
		mes "何者だ？";
		next;
		mes "[レハール]";
		mes "おはようございます。";
		mes "お手伝いに来ました！";
		next;
		mes "[ルガン主教]";
		mes "新入りか？";
		mes "司祭が手伝いに来るとは";
		mes "聞いていないぞ？";
		next;
		mes "[レハール]";
		mes "偵察任務から帰ってきた者です。";
		mes "サレクガンド様から";
		mes "お手伝いするように言われました。";
		next;
		mes "[ルガン主教]";
		mes "ああ、そうか。";
		mes "……なら、お前はここに残って";
		mes "手伝ってくれ。";
		unittalk getnpcid(0,"レハール#20ms41"),"レハール : 私ですか？",1;
		next;
		menu "私は？",-;
		mes "[ルガン主教]";
		mes "お前は他の場所に行け。";
		mes "ここは手が足りている。";
		next;
		menu "ラスガンド様の通られる道を……",-;
		mes "[ルガン主教]";
		mes "ラスガンド様が通られる道を";
		mes "重点的に掃除したいだと？";
		mes "それなら、外に出て上を道を進め。";
		mes "寄生虫どもが暴れていて";
		mes "手伝いが必要だろう。";
		next;
		menu "わかりました！",-;
		mes "[レハール]";
		mes "<FONT SIZE = 10>早く掃除を終わらせますので</FONT>";
		mes "<FONT SIZE = 10>先に進んでください。</FONT>";
		mes "<FONT SIZE = 10>……後で合流しましょう。</FONT>";
		close2;
		chgquest 17705,17706;
		set EP20_1QUE,45;
		end;
	}
	if(EP20_1QUE == 45) {
		mes "[レハール]";
		mes "<FONT SIZE = 10>早く掃除を終わらせますので</FONT>";
		mes "<FONT SIZE = 10>先に進んでください。</FONT>";
		mes "<FONT SIZE = 10>……後で合流しましょう。</FONT>";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 44)
		showevent 0, 1, "レハール#20ms41";
	end;
}
jor_safty2.gat,305,44,5	script(CLOAKED)	ルガン#20ms42	10473,{/* 3450 (cloaking)*/
	unittalk "ルガン : 無暗に歩き回るな！",1;
	end;
}
jor_safty2.gat,303,41,5	script(CLOAKED)	ルガン#20ms43	10475,{/* 3451 (cloaking)*/
	unittalk "ルガン : あの寄生虫たちから、特有の波長が感じられる。覚えておけ。",1;
	end;
}
jor_safty2.gat,320,36,0	warp	#20ms43	1,1,jor_maze.gat,17,147

jor_maze.gat,140,68,0	script	#20ms43	139,5,5,{/* 3453 */
	if(EP20_1QUE == 45 || EP20_1QUE == 46) {
		cloakoffnpc "揺らめく壁#20ms40";
		cloakonnpc "流氷地帯#ep20_md02";
	}
	if(EP20_1QUE == 47) {
		cloakoffnpc "揺らめく壁#20ms40";
		cloakoffnpc "流氷地帯#ep20_md02";
	}
	if(EP20_1QUE >= 48) {
		cloakonnpc "揺らめく壁#20ms40";
		cloakoffnpc "流氷地帯#ep20_md02";
	}
	end;
}
jor_maze.gat,136,72,3	script(CLOAKED)	流氷地帯#ep20_md02	10046,{/* 3454 (cloaking)*/
	if(EP20_1QUE >= 47) {
		mes "[インフォメーション]";
		mes "既に「流氷地帯」を";
		mes "クリアしているキャラクターは、";
		mes "パーティメンバーとして";
		mes "「流氷地帯」に";
		mes "入場できます。";
		next;
		mes "[インフォメーション]";
		mes "パーティメンバーとして";
		mes "「流氷地帯」に";
		mes "入場しますか？";
		next;
		if(select("やめる","「流氷地帯」入場") == 1) {
			mes "‐やめた‐";
			close;
		}
		mes "[インフォメーション]";
		mes "「流氷地帯」へ入場します。";
		close2;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[インフォメーション]";
			mes "既に「流氷地帯」を";
			mes "クリアしているキャラクターは、";
			mes "パーティリーダーとして";
			mes "入場できません。";
			close;
		}
		if(getonlinepartymember() == 0 || getonlinepartymember() > 2) {
			mes "[インフォメーション]";
			mes "このメモリアルダンジョンは";
			mes "2人以下のパーティーで";
			mes "入場することができます。";
			close;
		}
		switch(mdenter("流氷地帯")) {
		case 0:	// エラーなし
			announce "メモリアルダンジョン[流氷地帯] に入場しました　：　"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			//warp "1@twsd.gat", 317, 70;
			end;
		case 1:	// パーティー未加入
			//mes "^8c32e6パーティーが解体されているため";
			//mes "入場できません。";
			//mes "もう一度確認してから";
			//mes "やり直してください。";
			close;
		case 2:	// ダンジョン未作成
			mes "[インフォメーション]";
			mes "対象のメモリアルダンジョンが";
			mes "作成されていないため";
			mes "入場できません。";
			close;
		default:	// その他エラー
			close;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 48)
		showevent 0, 1, "流氷地帯#ep20_md02";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの入場]";
	end;
}
jor_maze.gat,140,72,3	script(CLOAKED)	揺らめく壁#20ms40	10527,{/* 3455 (cloaking)*/
	if(EP20_1QUE == 45) {
		mes "["+strcharinfo(0)+"]";
		mes "ここは本当に迷路のようだ……";
		mes "ちゃんと帰れるだろか？";
		mes "うん？　これは……！";
		next;
		mes "‐誰かが通ったような痕跡がある‐";
		next;
		menu "周りを調べる",-,"床を調査してみる",-;
		mes "["+strcharinfo(0)+"]";
		mes "壁が……揺らいでいる？";
		mes "^0000cd空間認識を阻害する装置^000000のようだ。";
		mes "恐らくバゴットが作ったものだな……";
		mes "この先にいるのだろうか？";
		next;
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "["+strcharinfo(0)+"]";
			mes "ルガンでないと装置が反応しない。";
			mes "ルガン変身スクロールを使おう。";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "装置に触ってみよう……。";
		chgquest 17706,17707;
		set EP20_1QUE,46;
		close;
	}
	if(EP20_1QUE == 46) {
		mes "[身隠し装置]";
		mes "ユーザーの確認、完了しました。";
		next;
		mes "^e6328cメモリアルダンジョン";
		mes "「流氷地帯」の";
		mes "生成と入場が行えます。";
		if(mdopenstate("流氷地帯"))
			set '@str$,"^0b0b33メモリアルダンジョンへ入場";
		else if(getpartyleader(getcharid(1)) == strcharinfo(0))
			set '@str$,"^0b0b33メモリアルダンジョンの作成";
		next;
		switch(select("^191970立ち去る",'@str$,"^0b0b33注意事項の確認")) {
		case 1:
			mes "‐その場を離れた‐";
			close;
		case 2:
			if(mdopenstate("流氷地帯")) {
				mes "[身隠し装置]";
				mes "移動の準備が完了しました。";
				next;
				if(select("^191970少し考える","^e6328c流氷地帯へ向かう") == 2) {
					mes "‐その場を離れた‐";
					close;
				}
				mes "[身隠し装置]";
				mes "移動を開始します。";
				close2;
				cutin "ep19_lehar01.png", 255;
				switch(mdenter("流氷地帯")) {
				case 0:	// エラーなし
					announce "メモリアルダンジョン[流氷地帯] に入場しました　：　"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
					//warp "1@twsd.gat", 317, 70;
					end;
				case 1:	// パーティー未加入
					mes "^8c32e6パーティーが解体されているため";
					mes "入場できません。";
					mes "もう一度確認してから";
					mes "やり直してください。";
					close;
				case 2:	// ダンジョン未作成
					mes "^8c32e6パーティーリーダーが";
					mes "メモリアルダンジョンを";
					mes "生成していない状態です。";
					close;
				default:	// その他エラー
					close;
				}
			}
			else {
				if(getonlinepartymember() < 1) {
					mes "^8c32e6空白のパーティー名では、";
					mes "メモリアルダンジョンを";
					mes "作成することは出来ません。";
					close;
				}
				mes "メモリアルダンジョンを作成しますか？";
				next;
				if(select("^191970少し考える","^e6328c作成する") == 1) {
					mes "‐その場を離れた‐";
					close;
				}
				if(getpartyleader(getcharid(1)) != strcharinfo(0))
					close;
				mdcreate "流氷地帯";
				mes "■パーティー名";
				mes "^009eff"+strcharinfo(1)+"^000000";
				mes "■パーティーリーダー";
				mes "^009eff"+strcharinfo(0)+"^000000";
				mes "　";
				mes "^006400流氷地帯の";
				mes "作成申請を受け付けました。^000000";
				close;
			}
		case 3:
			mes "詳しくはこちらをご確認ください。";
			mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			messize 180,364;
			close;
		}
	}
	if(EP20_1QUE == 47) {
		mes "‐レハールのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐レハールのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_back1.gat", 363, 222;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 45 || EP20_1QUE == 46 || EP20_1QUE == 47)
		showevent 0, 1, "揺らめく壁#20ms40";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの生成と入場]";
	end;
}

jor_back1.gat,365,226,0	script	#20ms50	139,5,5,{/* 3456 */
OnTouch:
	if(EP20_1QUE == 47) {
		cloakoffnpc "レハール#20ms50";
		unittalk getnpcid(0,"レハール#20ms50"),"レハール : 冒険者様！！",1;
	}
	if(EP20_1QUE == 48)
		cloakoffnpc "レハール#20ms50";
	end;
}
jor_back1.gat,365,226,3	script(CLOAKED)	レハール#20ms50	10469,{/* 3457 (cloaking)*/
	if(EP20_1QUE == 47) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ご無事なようで、なによりです。";
		mes "ところで、ここはどこ……？";
		next;
		menu "凍て付いた鱗の丘のようです",-;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "そのようですね。";
		mes "あの猫は私たちを";
		mes "助けてくれたみたいです。";
		next;
		menu "氷の城へ戻りましょう",-;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "そうしましょう。";
		mes "みんなと合流しないといけません。";
		next;
		cutin "ep19_lehar02.png", 255;
		chgquest 17708,17709;
		set EP20_1QUE,48;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 226, 257;
		end;
	}
	if(EP20_1QUE == 48) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "氷の城に戻りましょう。";
		mes "みんなと合流しないといけません。";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 226, 257;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 47 || EP20_1QUE == 48)
		showevent 0, 1, "レハール#20ms50";
	end;
}
jor_sanct.gat,72,169,3	script	ウリヤガンド#20ms	10473,{/* 3458 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ウリヤガンド : 人間!?　あの時の人間だ！",1;
		end;
	}
	unittalk "ウリヤガンド : 仕事漬けにされるなんて……ここに来るんじゃなかった……",1;
	end;
}
jor_sanct.gat,69,170,5	script	バロモガンド#20ms	10474,{/* 3459 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "バロモガンド : に、人間だ！",1;
		end;
	}
	unittalk "バロモガンド : これ見て……私の手が、私の手がっ……！",1;
	end;
}

jor_sanct.gat,185,99,5	script	サルザガンド#20ms	10475,{/* 3460 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "サルザガンド : 人間！ 人間がいるぞ！",1;
		end;
	}
	unittalk "サルザガンド : 私たちを呼んだのは仕事をさせるためか……？",1;
	end;
}

jor_sanct.gat,243,177,3	script	カメルガンド#20ms	10474,{/* 3461 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "カメルガンド : お前、あの時の人間か！",1;
		end;
	}
	unittalk "カメルガンド : これも全てヨルムンガンドから与えられた苦難だと思えば……",1;
	end;
}
jor_sanct.gat,52,125,3	script	フギエガンド#20ms	10475,{/* 3462 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "フギエガンド : おのれ人間め！",1;
		end;
	}
	unittalk "フギエガンド : 休憩中だ……",1;
	end;
}

jor_sanct.gat,91,153,7	script	ズルルガンド#20ms	10473,{/* 3463 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ズルルガンド : ひ……に、人間！",1;
		end;
	}
	unittalk "ズルルガンド : ここは素晴らしい場所だ。ここに骨を埋めたい",1;
	end;
}

jor_sanct.gat,236,140,3	script	ゼガドガンド#20ms	10474,{/* 3464 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ゼガドガンド : なんだ……人間だと!?",1;
		end;
	}
	unittalk "ゼガドガンド : 私たちをここに呼んでいただけるなんて！",1;
	end;
}

jor_sanct.gat,118,264,5	script	テルマガンド#20ms	10473,{/* 3465 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "テルマガンド : 人間だ！　人間がいるぞ！",1;
		end;
	}
	unittalk "テルマガンド : 見れば見るほど感動する……聖なる場所……ラスガンド様！",1;
	end;
}

jor_sanct.gat,125,201,5	script	ササヨガンド#20ms	10475,{/* 3466 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ササヨガンド : 人間だ！ あの時の奴か！",1;
		end;
	}
	unittalk "ササヨガンド : すべて私たちの手でやるのも悪くない。",1;
	end;
}

jor_sanct.gat,145,247,7	script	ゾイシガンド#20ms	10473,{/* 3467 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ゾイシガンド : お前は……あの時の人間！",1;
		end;
	}
	unittalk "ゾイシガンド : ヨルムンガンド様の力が感じられる……",1;
	end;
}

jor_sanct.gat,234,155,3	script	バラレガンド#20ms	10474,{/* 3468 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "バラレガンド : 人間だ！　人間がいるぞ！",1;
		end;
	}
	unittalk "バラレガンド : やがて来られるあの方の為に、一生懸命に働こう！",1;
	end;
}

jor_sanct.gat,98,137,3	script	オエリガンド#20ms	10475,{/* 3469 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "オエリガンド : 誰か！　ここに人間がいるぞ！",1;
		end;
	}
	unittalk "オエリガンド : 汚らわしい人間たちのせいで、どれだけ私たちが苦労をしてるか！",1;
	end;
}

jor_sanct.gat,138,75,5	script	ピオシガンド#20ms	10473,{/* 3470 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ピオシガンド : どうなっている！　なぜ人間がっ！",1;
		end;
	}
	end;
}

jor_sanct.gat,146,210,7	script	エシオガンド#20ms	10474,{/* 3471 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "エシオガンド : くそっ！　人間め！",1;
		end;
	}
	unittalk "エシオガンド : 私たちは選ばれた！　選ばれたんだよ！",1;
	end;
}

jor_sanct.gat,137,110,1	script	マイヨガンド#20ms	10473,{/* 3472 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "マイヨガンド : 人間!?!?",1;
		end;
	}
	unittalk "マイヨガンド : あの日が来ることを思えばワクワクが……いったいいつ来るのだろう。",1;
	end;
}

jor_sanct.gat,139,163,5	script	ウポシガンド#20ms	10473,{/* 3473 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ウポシガンド : なぜ人間が？　おい！　人間がいるぞ！",1;
		end;
	}
	unittalk "ウポシガンド : 未だに信じられない。私が、私がここに！",1;
	end;
}

jor_sanct.gat,147,245,1	script	ホゲレガンド#20ms	10474,{/* 3474 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ホゲレガンド : お前……人間!?",1;
		end;
	}
	unittalk "ホゲレガンド : ラスガンド様に、お目に掛かれるだろうか？",1;
	end;
}

jor_sanct.gat,143,146,5	script	ラスヌガンド#20ms	10475,{/* 3475 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ラスヌガンド : に、人間だー！",1;
		end;
	}
	unittalk "ラスヌガンド : 選ばれし者のみがここに入れる……が、思ったより多いな？",1;
	end;
}

jor_sanct.gat,80,88,5	script	ガトギガンド#20ms	10473,{/* 3476 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ガトギガンド : お前！　人間だろ!!",1;
		end;
	}
	unittalk "ガトギガンド : ここに来られたことが栄光なことではないか！",1;
	end;
}

jor_sanct.gat,91,195,5	script	ムドテガンド#20ms	10474,{/* 3477 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ムドテガンド : 人間が何をしている！",1;
		end;
	}
	unittalk "ムドテガンド : 聖域に入れるなんて、考えたこともなかったのに！",1;
	end;
}

jor_sanct.gat,143,56,5	script	パクオガンド#20ms	10475,{/* 3478 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "パクオガンド : 汚らわしい人間め！",1;
		end;
	}
	end;
}
jor_sanct.gat,109,73,1	script	パニパガンド#20ms	10473,{/* 3479 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "パニパガンド : 人間だ！",1;
		end;
	}
	unittalk "パニパガンド : ラスガンド様は、なぜあの人間をお傍に置いているのだろう？",1;
	end;
}

jor_sanct.gat,128,203,3	script	ネテオガンド#20ms	10474,{/* 3480 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ネテオガンド : お前！　人間だな！",1;
		end;
	}
	unittalk "ネテオガンド : ヘビイチゴ余ってる人いない？",1;
	end;
}

jor_sanct.gat,53,255,3	script	ヒオリガンド#20ms	10475,{/* 3481 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ヒオリガンド : 人間……!?!?",1;
		end;
	}
	unittalk "ヒオリガンド : 聖域に来たはいいが、仕事をする羽目になるとは聞いてない……",1;
	end;
}

jor_sanct.gat,178,205,1	script	サラビガンド#20ms	10473,{/* 3482 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "サラビガンド : 人間め！　追い出してやる！",1;
		end;
	}
	unittalk "サラビガンド : あの方はいつ来られるのか……ラスガンド様のお顔が見たい！",1;
	end;
}

jor_sanct.gat,184,97,1	script	エマリガンド#20ms	10475,{/* 3483 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "エマリガンド : 汚らわしい人間めっ！",1;
		end;
	}
	unittalk "エマリガンド : 汚らわしい人間共がのさばるから！　この有り様だっ！",1;
	end;
}

jor_sanct.gat,152,226,3	script	ミアソガンド#20ms	10475,{/* 3484 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ミアソガンド : なんだ……人間だと!?",1;
		end;
	}
	unittalk "ミアソガンド : なぜ主教たちだけが選ばれたのだろう？",1;
	end;
}

jor_sanct.gat,80,103,5	script	ルナリガンド#20ms	10473,{/* 3485 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ルナリガンド : な……人間っ!?",1;
		end;
	}
	unittalk "ルナリガンド : ここは息苦しい……鳥の変身係に志願してみるか？",1;
	end;
}

jor_sanct.gat,94,105,1	script	ソルベガンド#20ms	10474,{/* 3486 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ソルベガンド : まさか！　人間がいるぞ！",1;
		end;
	}
	unittalk "ソルベガンド : 私たちは、いつ戻れるのだろう？",1;
	end;
}

jor_sanct.gat,98,135,3	script	ゼイアガンド#20ms	10474,{/* 3487 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ゼイアガンド : 人間！　なぜここにいる!!",1;
		end;
	}
	unittalk "ゼイアガンド : 私は不安だよ。いつ、なにが、どう変わるかわからないから。",1;
	end;
}

jor_sanct.gat,168,242,1	script	ククオガンド#20ms	10475,{/* 3488 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ククオガンド : 人間め！　汚らわしい！",1;
		end;
	}
	unittalk "ククオガンド : ヨルムンガンド様が共にいらっしゃる！ ヨルムンガンド様の祝福を！",1;
	end;
}

jor_sanct.gat,31,127,3	script	ハートハンター#20ms	21994,{/* 3489 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ハートハンター : お前！　どこから侵入した！",1;
		end;
	}
	unittalk "ハートハンター : なあ、これいつ終わるんだ？　あいつらの仕事だろ、これ？",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"ハートハンター#20ms1"),"ハートハンター : 仕方ねえだろ……俺たちの方が上手くやれるんだからよ。",1;
	if(!sleep2(1000)) end;
	unittalk "ハートハンター : 全部教えてやっただろ！　あいつらさぼってるだけだ！",1;
	end;
}

jor_sanct.gat,30,123,1	script	ハートハンター#20ms1	21994,{/* 3490 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ハートハンター : お前は！　どうやってここに来た！",1;
		end;
	}
	unittalk "ハートハンター : 早くやっつけて休もうぜ。",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"ハートハンター#20ms"),"ハートハンター : こんなことになるなんて思ってなかった！",1;
	end;
}

jor_sanct.gat,202,114,5	script	ハートハンター#20ms2	21994,{/* 3491 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ハートハンター : お前！　あの時の人間だな！",1;
		end;
	}
	unittalk "ハートハンター : 仕事が……仕事が三倍になった……",1;
	end;
}

jor_sanct.gat,210,171,3	script	ハートハンター#20ms3	21994,{/* 3492 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "ハートハンター : その恰好！　バレバレだぜ！",1;
		end;
	}
	unittalk "ハートハンター : どれどれ、休める場所はないかな……？",1;
	end;
}

jor_sanct.gat,29,127,3	script	魔力回収装置#20ms1	10540,{/* 3493 */}
jor_sanct.gat,28,125,5	script	魔力回収装置#20ms2	10538,{/* 3494 */}
jor_sanct.gat,27,123,7	script	魔力回収装置#20ms3	10540,{/* 3495 */}
jor_sanct.gat,201,115,3	script	魔力回収装置#20ms7	10540,{/* 3496 */}

icas_in.gat,226,257,0	script	#hw_ep20_pn01	139,2,2,{/* 3498 */
	if(EP20_1QUE == 48 || EP20_1QUE == 49) {
		cloakoffnpc "レハール#e20pn01";
		cloakoffnpc "レオン#e20pn01";
		cloakoffnpc "オーレリー#e20pn01";
		cloakoffnpc "マラム#e20pn01";
		cloakoffnpc "ホルル#e20pn01";
		cloakoffnpc "ミリアム#e20pn01";
		cloakoffnpc "レイジー#e20pn01";
		cloakoffnpc "ヴォークリンデ#e20pn01";
		cloakoffnpc "ヴェルグンデ#e20pn01";
	}
	end;
}
icas_in.gat,226,255,3	script(CLOAKED)	レハール#e20pn01	10469,{/* 3499 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "あ、"+strcharinfo(0)+"様！";
		next;
		menu "どうしたのですか？",-;
		cutin "ep19_lehar06.png", 2;
		mes "[レハール]";
		mes "それが、入りずらい状況で……";
		mes "タイミングをうかがっているんです。";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "冒険者さんとレハールさんを";
		mes "見た人は誰もいないということですか？";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "私はルガンの捕虜と帰って来たから……";
		mes "何か問題でも起きたのだろうか？";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "捜索隊を送るべきじゃありませんか？";
		mes "敵陣の奥まで侵入していたようですから";
		mes "心配です。";
		next;
		cutin "ep19_voglinde01.png", 2;
		mes "[ヴォークリンデ]";
		mes "レハールの子供の頃を思い出すよ。";
		mes "昔はよく無茶をして大人たちを";
		mes "心配させたものさ。";
		mes "そうそう、あの時、あの子は……。";
		next;
		cutin "ep19_lehar06.png", 2;
		mes "[レハール]";
		mes "ウギャァーーー！";
		mes "ストップ！　それ以上はダメッ！";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "レハールと冒険者じゃないか！";
		mes "いきなり連絡が取れなくなったから";
		mes "すっげー心配してたんだぜ！";
		mes "ほら、私の心は幼いアーウィンの産毛";
		mes "みたいに繊細だからさ。";
		unittalk getcharid(3),strcharinfo(0)+" : ……優雅にお茶を飲んでませんでしたか？",1;
		next;
		cutin "ep19_voglinde01.png", 2;
		mes "[ヴォークリンデ]";
		mes "皆、二人のことを心配していたのよ。";
		mes "まあ、無事に帰って来たんだから";
		mes "良しとしようじゃないか。";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[レオン]";
		mes "無事なようで良かったです。";
		mes "恐らくトラブルに巻き込まれたのだと";
		mes "推測しますが";
		mes "いったい、何があったのですか？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "実はラスガンドと遭遇して……。";
		unittalk getnpcid(0,"ミリアム#e20pn01"),"ミリアム : ええっ!?",1;
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "いきなり敵の親玉と遭遇するなんて……";
		mes "まさか、戦ったりとかしてないわよね？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "あ、ええっとぉ……";
		mes "攻撃を受けたんですけど";
		mes "白い猫が現れて";
		mes "私たちを救ってくれました。";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "……猫？";
		mes "あ、もしかして、前捕まった時に";
		mes "助けてもらったという……。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "その猫に助けてもらったんです！";
		mes "やっぱり、普通の猫じゃないですよ！";
		mes "胴体がこ～～～んなに長い";
		mes "不思議な猫なんです！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "そんなに長い猫がいるとは";
		mes "思えませんが……";
		mes "何かの見間違いでは？";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "北の大地には魔女が住むと言う";
		mes "お伽噺は聞いたことありますが……";
		mes "ホルルさんは、心当たりはありますか？";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "イスガルドの地において";
		mes "背が高くて白い毛を持つのは";
		mes "私たちアーウィンだけです！";
		mes "断言します！";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "古代アイスウィンドは？";
		next;
		cutin "ep19_iwin07.png", 2;
		mes "[ホルル]";
		mes "あんな凶暴で無知な鳥たちと";
		mes "知的でクールなアーウィンたちを";
		mes "一緒にしないでいただきたい！";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "喧嘩しないで。";
		mes "それにしても不思議な力で";
		mes "冒険者たちを助けた白い猫……ね。";
		mes "ふむ……。";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "その猫……";
		mes "^FF0000ヨルムンガンド^000000かもしれない。";
		unittalk "レハール : ヨルムンガンドォォォ!?!?",1;
		next;
		menu "ヨルムンガンドですか？",-;
		mes "[オーレリー]";
		mes "アーウィンたちから";
		mes "猫のような生き物の噂や";
		mes "その足跡についての話を聞いていない？";
		mes "以前からその猫がヨルムンガンドでは";
		mes "ないかと推測していたのよ。";
		next;
		mes "[オーレリー]";
		mes "ヨルムンガンドは力を蓄えるために";
		mes "眠っていたはず。";
		mes "それで、いままで感知できなかったわ。";
		next;
		mes "[オーレリー]";
		mes "でも、最近になって力を取り戻したから";
		mes "私達の前に姿を見せるように";
		mes "なったのかも……";
		mes "あくまで可能性に過ぎないけどね。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "私もオーレリーと同じ考えです。";
		mes "お二人には、少し休んでいただいてから";
		mes "その白い猫を";
		mes "探しに行きたいのですが……。";
		next;
		if(select("今すぐ出発しましょう","少し休みたいです") == 2) {
			mes "[レオン]";
			mes "わかりました。";
			mes "しっかり休んでから出発しましょう。";
			close2;
			cutin "ep19_leon01.png", 255;
			end;
		}
		mes "[レオン]";
		mes "わかりました。";
		mes "氷の城の外に";
		mes "有能な[潜水アーウィン]がいます。";
		mes "彼に手伝ってもらいましょう。";
		next;
		cutin "ep19_leon01.png", 255;
		chgquest 17709,23100;
		set EP20_1QUE,49;
		mes "‐潜水アーウィンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐潜水アーウィンのもとへ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 146, 207;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "しっかり休まれましたか？";
		mes "レオン様がお待ちですよ。";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "‐潜水アーウィンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐潜水アーウィンのもとへ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 146, 207;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 48 || EP20_1QUE == 49)
		showevent 0, 1, "レハール#e20pn01";
	end;
}
icas_in.gat,233,252,5	script(CLOAKED)	レオン#e20pn01	10464,{/* 3500 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_leon05.png", 2;
		mes "[レオン]";
		mes "捜索隊を組織するべきか……。";
		close2;
		cutin "ep19_leon05.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "準備はよろしいですか？";
		mes "氷の城の外に";
		mes "有能な[潜水アーウィン]がいます。";
		mes "彼に手伝ってもらいましょう。";
		close2;
		cutin "ep19_leon05.png", 255;
		end;
	}
}
icas_in.gat,237,252,5	script(CLOAKED)	オーレリー#e20pn01	10465,{/* 3501 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "あの二人……心配だな。";
		close2;
		cutin "ep19_aurelie03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "無事で良かった。";
		mes "戻って来てすぐで申し訳ないけど";
		mes "準備ができたらレオンに話しかけて。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
}
icas_in.gat,230,253,7	script(CLOAKED)	ホルル#e20pn01	10461,{/* 3502 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ほるるるるるるる。";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_iwin06.png", 2;
		mes "[ホルル]";
		mes "ほるるるるるるる。";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
}
icas_in.gat,231,250,7	script(CLOAKED)	マラム#e20pn01	10376,{/* 3503 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "何かあったのでしょうか……";
		mes "心配です。";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "お二人がご無事で良かったです。";
		mes "ミリアムが本当に心配してたんですよ！";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
}
icas_in.gat,234,249,7	script(CLOAKED)	ミリアム#e20pn01	10377,{/* 3504 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "もっと慎重に行動するべきだった……！";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "本当に良かったです。";
		mes "もし冒険者さんの身に何かあったら";
		mes "ボクはどうしようかと……。";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
}
icas_in.gat,238,248,3	script(CLOAKED)	レイジー#e20pn01	10454,{/* 3505 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "冒険者もレハールも";
		mes "目を離すとすぐどこかに";
		mes "いっちゃうからなぁ！";
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "めちゃくちゃ二人のこと";
		mes "心配したんだぜ？";
		mes "お茶だって喉を通らないぐらいに！";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "……。";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "嘘だと思ってるな？";
		mes "冒険者がいなかったら";
		mes "力仕事や報告書の作成を";
		mes "私がやらないといけなくなるんだぜ。";
		mes "そりゃ心配になるというものだ！";
		next;
		unittalk getcharid(3),strcharinfo(0)+" : 結局、自分の心配ですよね？",1;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "ハハッ、バレた？";
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
}
icas_in.gat,239,252,3	script(CLOAKED)	ヴォークリンデ#e20pn01	10467,{/* 3506 (cloaking)*/}
icas_in.gat,237,254,5	script(CLOAKED)	ヴェルグンデ#e20pn01	10468,{/* 3507 (cloaking)*/}

icecastle.gat,146,206,0	script	#hw_ep20_pn02	139,3,3,{/* 3507 */
	if(EP20_1QUE >= 49 && EP20_1QUE <= 51) {
		cloakoffnpc "レハール#e20pn02";
		cloakoffnpc "レオン#e20pn02";
		cloakoffnpc "オーレリー#e20pn02";
		cloakoffnpc "マラム#e20pn02";
		cloakoffnpc "ミリアム#e20pn02";
		cloakoffnpc "レイジー#e20pn02";
	}
	end;
}
icecastle.gat,141,212,3	script	コロロ#ep20_DQ_3	10461,{/* 3508 */
	if(EP20_1QUE == 49) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "コロロ、元気にしてる？";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "もちろんです。";
		mes "オーレリー様とレオン様が";
		mes "気を使ってくださったお陰で";
		mes "これ以上ないぐらいに元気です！";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "それはよかった。";
		mes "一つお願いを聞いてくれないかい？";
		mes "とても大事なことでね。";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "お二人のお願いなら";
		mes "やらないわけにはいきません。";
		mes "星を取って来てと言われても";
		mes "やりましょう！";
		unittalk getnpcid(0,"レイジー#e20pn02"),"レイジー : こりゃ頼もしいな！",1;
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "私たちを「流氷地帯」まで";
		mes "連れて行って欲しいんだ。";
		mes "探さないといけないものがあってね。";
		mes "おおよその場所は冒険者様が";
		mes "教えてくれる。";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "流氷地帯ですか？";
		mes "海を泳ぐのは朝飯前ですが";
		mes "流氷地帯なら話が違います。";
		mes "氷河の欠片がたくさんあって危険だし";
		mes "水温も低くて……。";
		next;
		mes "[コロロ]";
		mes "しかも正確な位置がわからない以上";
		mes "周囲をぐるぐる回りながら";
		mes "経路を探すことになるでしょうね。";
		mes "本当に厳しい戦いになりそうです……。";
		mes "　";
		mes "‐そう言いながら、羽根を揉んでいる‐";
		unittalk getnpcid(0,"レイジー#e20pn02"),"レイジー : お星様は取れるのに泳ぎはダメなの？",1;
		unittalk getnpcid(0,"コロロ#ep20_DQ_3"),"コロロ : 星の話はたとえ話ですよ！",1;
		next;
		menu "何か欲しいものはある？",-;
		mes "[コロロ]";
		mes "……いやだなぁ";
		mes "そんなあさましいことは言いません。";
		mes "欲しいのではなく、必要な物なんです！";
		mes "体温維持のためにも";
		mes "高カロリーの食事は必須です。";
		next;
		mes "[コロロ]";
		mes "通常の潜水なら";
		mes "普段の食事だけで大丈夫ですが";
		mes "危険な流氷地帯に行くのなら";
		mes "準備をしっかりしないと！";
		next;
		mes "[コロロ]";
		mes "お肉は当然必要として";
		mes "オヤツとして凍てついたムシの皮まで";
		mes "食べなきゃなりません。";
		next;
		cutin "ep19_iwin05.png", 2;
		mes "[コロロ]";
		mes "でないと、途中で腹が減って";
		mes "ゴボゴボと沈んでいくかも……";
		mes "自分はアーウィンだから";
		mes "それでも大丈夫でしょうが";
		mes "人間の体だと、どうなるか……。";
		unittalk getnpcid(0,"レイジー#e20pn02"),"レイジー : こいつ、脅迫しているぞ？",1;
		unittalk getnpcid(0,"コロロ#ep20_DQ_3"),"コロロ : 心配しているんですって！",1;
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "上手く利用されているような気が……。";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "とはいえ、他に方法が無いので……";
		mes "お肉は私が用意しますから";
		mes "冒険者様は「凍てついたムシの皮」を";
		mes "集めて来てもらえますか？";
		next;
		menu "しょうがないですね",-;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "そう来なくちゃ！";
		mes "「アイスフナムシ」を3匹倒して";
		mes "「凍てついたムシの皮」を3個";
		mes "持ってきてください。";
		next;
		mes "[コロロ]";
		mes "アイスフナムシは";
		mes "[凍て付いた鱗の丘]にいるはずです。";
		mes "自分は泳ぐための";
		mes "体力を温存しておきますね！";
		unittalk getnpcid(0,"レイジー#e20pn02"),"レイジー : 要するにゴロゴロしてるってことか？",1;
		unittalk getnpcid(0,"レハール#e20pn02"),"レハール : しーっ！　コロロの機嫌を損ねちゃダメですよ！",1;
		next;
		cutin "ep19_lehar01.png", 255;
		chgquest 23100,23101;
		set EP20_1QUE,50;
		mes "‐凍て付いた鱗の丘へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐凍て付いた鱗の丘へ";
		mes "　向かった‐";
		close2;
		warp "jor_back1.gat", 380, 229;
		end;
	}
	if(EP20_1QUE == 50) {
		if(checkquest(23101) && (!checkquest(23101)&0x4 || countitem(1000832) < 3)) {
			cutin "ep19_iwin03.png", 1;
			mes "[コロロ]";
			mes "アイスフナムシは";
			mes "[凍て付いた鱗の丘]にいるはずです。";
			mes "「アイスフナムシ」を3匹倒して";
			mes "「凍てついたムシの皮」を3個";
			mes "持ってきてください。";
			next;
			cutin "ep19_iwin03.png", 255;
			mes "‐凍て付いた鱗の丘へ";
			mes "　向かいますか？‐";
			next;
			if(select("向かう","やめる") == 2) {
				mes "‐その場にとどまった‐";
				close;
			}
			mes "‐凍て付いた鱗の丘へ";
			mes "　向かった‐";
			close2;
			warp "jor_back1.gat", 380, 229;
			end;
		}
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "凍てついたムシの皮！";
		mes "一つ、二つ、三つ…確かに！";
		mes "これさえ食べれば";
		mes "長時間泳いでも問題ありません。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "では出発の準備を……。";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "その前に！";
		mes "羽に塗る保護剤が要ります！";
		mes "たくさんの人を運ぶので";
		mes "最大限の浮力を確保しないと！";
		unittalk getnpcid(0,"レイジー#e20pn02"),"レイジー : ほぉん……",1;
		next;
		mes "[コロロ]";
		mes "自分もみなさんを早く連れて行きたい";
		mes "気持ちは山々ですが安全第一です！";
		mes "もしも途中で羽がすっかり濡れて";
		mes "沈んでしまったら……。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "……保護剤を持って来れば良いですか？";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "いやだなぁ、そこまで仰るなら";
		mes "お願いするしかないですよね！";
		mes "では、光るワカメの葉体を";
		mes "持って来てください。";
		next;
		mes "[コロロ]";
		mes "ワカメの葉体から抽出したオイルは";
		mes "素晴らしい天然保護剤になります！";
		mes "塩水にさらされるアーウィンの羽には";
		mes "何よりも大事なものです。";
		next;
		mes "[コロロ]";
		mes "「光るワカメ」を3個採集して";
		mes "「光るワカメの葉体」を3個";
		mes "持ってきてください。";
		mes "[凍て付いた鱗の丘]に行けば";
		mes "うろついているはずですよ。";
		next;
		cutin "ep19_iwin05.png", 2;
		mes "[コロロ]";
		mes "さぁさぁ、自分はおやつ……";
		mes "もとい燃料を補充しておきますから";
		mes "早く行ってらっしゃい！";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "お腹の脂肪だけでなく";
		mes "面の皮も厚いみたいだぞ？";
		next;
		cutin "ep19_leizi01.png", 255;
		chgquest 23101,23102;
		set EP20_1QUE,51;
		delitem 1000832,3;
		mes "‐凍て付いた鱗の丘へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐凍て付いた鱗の丘へ";
		mes "　向かった‐";
		close2;
		warp "jor_back1.gat", 380, 229;
		end;
	}
	if(EP20_1QUE == 51) {
		if(checkquest(23102) && (!checkquest(23102)&0x4 || countitem(1000831) < 3)) {
			cutin "ep19_iwin03.png", 2;
			mes "[コロロ]";
			mes "「光るワカメ」を3個採集して";
			mes "「光るワカメの葉体」を3個";
			mes "持ってきてください。";
			mes "[凍て付いた鱗の丘]に行けば";
			mes "うろついているはずですよ。";
			next;
			cutin "ep19_iwin06.png", 255;
			mes "‐凍て付いた鱗の丘へ";
			mes "　向かいますか？‐";
			next;
			if(select("向かう","やめる") == 2) {
				mes "‐その場にとどまった‐";
				close;
			}
			mes "‐凍て付いた鱗の丘へ";
			mes "　向かった‐";
			close2;
			warp "jor_back1.gat", 380, 229;
			end;
		}
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "光るワカメの葉体は持ってきました？";
		mes "どれどれ確認してみましょう。";
		mes "……いいですね、ピッタリです！";
		mes "ドゥフフフフ！";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "もふもふな見た目に騙されていました。";
		mes "柔らかい羽毛の中に";
		mes "こんな恐ろしい顔を隠しているとは。";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "マラムより、やり手だよね。";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "ドゥフフフ……";
		mes "では次は……。";
		next;
		cutin "ep19_iwin06.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "もう出発できますよ……ね？";
		unittalk "コロロ : ぞくっ！",1;
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "も、もちろんですとも！";
		mes "その武器をしまってください！";
		mes "あとは目的地の場所を";
		mes "教えてもらうだけ！";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "最初からこうすれば良かったな。";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "‐白い猫に出会った場所の景色や";
		mes "　周囲の様子をコロロに伝えた‐";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "うむ！　うむ！　";
		mes "それだけ聞ければ十分です！";
		mes "自分の天才的な頭脳と";
		mes "完ぺきな潜水能力を使えば";
		mes "あっという間に着きますよ！";
		unittalk getnpcid(0,"レイジー#e20pn02"),"レイジー : 今度は信じていいのか？",1;
		next;
		mes "[コロロ]";
		mes "お腹が空く前に出発しましょう！";
		mes "さあ、しっかり掴まってください！";
		next;
		cutin "ep19_iwin06.png", 255;
		chgquest 23102,23103;
		set EP20_1QUE,52;
		delitem 1000831,3;
		mes "‐流氷地帯へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐流氷地帯へ";
		mes "　向かった‐";
		close2;
		warp "jor_safty1.gat", 198, 152;
		end;
	}
	if(EP20_1QUE == 52) {
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "流氷地帯まで連れて行きますから";
		mes "羽根にしっかり掴まってください！";
		next;
		cutin "ep19_iwin06.png", 255;
		mes "‐流氷地帯へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐流氷地帯へ";
		mes "　向かった‐";
		close2;
		warp "jor_safty1.gat", 198, 152;
		end;
	}
	if(EP20_1QUE >= 53) {
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "レオン様から頼まれて";
		mes "自分が　特　別　に！";
		mes "流氷地帯まで行かれる方の";
		mes "お手伝いをすることになりました。";
		if(EP20_1QUE == 100)
			set '@str$,"ルガンを倒す";
		next;
		switch(select("行く","行かない",'@str$)) {
		case 1:
			mes "[コロロ]";
			mes "羽根にしっかり掴まってください！";
			mes "落ちたらどうなるか";
			mes "自分にもわかりませんからね！";
			close2;
			cutin "ep19_iwin06.png", 255;
			warp "jor_twice.gat", 235, 107;
			end;
		case 2:
			cutin "ep19_iwin03.png", 2;
			mes "[コロロ]";
			mes "もしお暇でしたら";
			mes "自分の為におやつを持って来てくれても";
			mes "いいんですよ～。";
			unittalk getcharid(3),strcharinfo(0)+" : 暇じゃない！",1;
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		case 3:
			break;
		}
		mes "[コロロ]";
		mes "冒険者様";
		mes "ルガンを狩ってきてくださるんですか？";
		mes "ありがとう！　ありがとう！";
		mes "本当は怖かったんです～！";
		cutin "ep19_iwin03.png", 2;
		next;
		if(select("クエストの受注や報告を行う","ダンジョンに移動する(流氷地帯)") == 2) {
			mes "^ff0000‐移動には500Zenyが必要です‐^000000";
			next;
			mes "[コロロ]";
			cutin "ep19_iwin03.png", 2;
			mes "さっそく現地に向かいますか？";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_twice.gat", 235, 107;
			end;
		}
		setarray '@questname$,"ルガンの根絶";
		setarray '@questid,23110;
		setarray '@coolid,23111;
		setarray '@gainlist,1001217,10;
		setarray '@explist,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// ルガンの根絶
			if(checkquest(23111)) {
				if(checkquest(23111)&2 == 0) {
					mes "[コロロ]";
					cutin "ep19_iwin03.png", 2;
					mes "今日は十分ですから、";
					mes "明日また来てください！";
					mes "ルガンたちも勘が良くて、";
					mes "一度攻撃されると隠れてしまうので";
					mes "色々面倒になります。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ルガンの根絶^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			mes "[コロロ]";
			cutin "ep19_iwin03.png", 2;
			mes "^e5555eヨルムンガンド教団術師^000000を";
			mes "10体討伐してきてください。";
			next;
			if(checkquest(23110)) {
				if(checkquest(23110)&4 == 0) {
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ルガンの根絶^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 23110;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ルガンの根絶^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ルガンの根絶^000000」";
				mes "<内容>";
				mes "対象：<URL>ヨルムンガンド教団術師<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_WARLOCK</INFO></URL>　10体";
				mes "の討伐";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "※400000000を20回受け取ります。";
				mes "JobExp 6G ( 6000000000 )";
				mes "※300000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ルガンの根絶^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 23110;
				setquest 23111;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[コロロ]";
				cutin "ep19_iwin03.png", 2;
				mes "お！戻って来ましたね。";
				mes "ルガンたちも結構減ってますね！";
				next;
				mes "[コロロ]";
				cutin "ep19_iwin03.png", 2;
				mes "はい？";
				mes "見てもいないのに";
				mes "なんで解りますかって？";
				mes "空気ですよ！";
				next;
				mes "[コロロ]";
				cutin "ep19_iwin03.png", 2;
				mes "冒険者様も、もうちょっと頑張ったら、";
				mes "その差が感じとれるようになりますよ！";
				mes "そういう意味でも、";
				mes "明日も来てはどうですか？";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "※400000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "※300000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ルガンの根絶^000000」";
			mes "<内容>";
			mes "対象：<URL>ヨルムンガンド教団術師<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_WARLOCK</INFO></URL>　10体";
			mes "の討伐を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[コロロ]";
				cutin "ep19_iwin03.png", 2;
				mes "中断……マジですか？";
				mes "一度は助けてくれるって言ったのに";
				mes "ひどい人……。";
				mes "";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 23110;
			if(checkquest(23111)) delquest 23111;
			mes "[コロロ]";
			cutin "ep19_iwin03.png", 2;
			mes "ヒュ～！信じてましたよ！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ルガンの根絶^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(23101) && (!checkquest(23101)&0x4 || countitem(1000832) < 3))
		showevent 0, 2, "コロロ#ep20_DQ_3";
	else if(checkquest(23101) && checkquest(23101)&0x4 && countitem(1000832) >= 3)
		showevent 0, 3, "コロロ#ep20_DQ_3";
	if(checkquest(23102) && (!checkquest(23102)&0x4 || countitem(1000831) < 3))
		showevent 0, 2, "コロロ#ep20_DQ_3";
	else if(checkquest(23102) && checkquest(23102)&0x4 && countitem(1000831) >= 3)
		showevent 0, 3, "コロロ#ep20_DQ_3";
	if(EP20_1QUE >= 49 && EP20_1QUE <= 52)
		showevent 0, 1, "コロロ#ep20_DQ_3";
	if(EP20_1QUE >= 53 && EP20_1QUE <= 99)
		showevent 6, 3, "コロロ#ep20_DQ_3";
	if(EP20_1QUE == 100) {
		if(!checkquest(23110) && (!checkquest(23111) || checkquest(23111)&0x2) || checkquest(23110) && checkquest(23110)&0x4)
			showevent 0, 3, "コロロ#ep20_DQ_3";
		else if(checkquest(23110) && !checkquest(23110)&0x4 == 0)
			showevent 0, 2, "コロロ#ep20_DQ_3";
		else
			showevent 6, 3, "コロロ#ep20_DQ_3";
	}
	end;
OnInit:
	setnpctitle "[潜水アーウィン]";
	end;
}
icecastle.gat,148,210,5	script(CLOAKED)	レオン#e20pn02	10464,{/* 3509 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "流氷地帯まで連れて行って欲しいと";
		mes "こちらの潜水アーウィンに";
		mes "お願いするつもりです。";
		mes "実力だけは確かですからね。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "コロロもここまで多くの人を";
		mes "運ぶのは初めてですから";
		mes "協力してあげないと。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_leon03.png", 2;
		mes "‐レオンは困った顔をしている‐";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
icecastle.gat,145,212,5	script(CLOAKED)	オーレリー#e20pn02	10465,{/* 3510 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "自分で解決できないことは";
		mes "他人の力を借りることで解決できる。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "この程度なら";
		mes "それほどの手間じゃないよね。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "…………。";
		next;
		mes "[オーレリー]";
		mes "ギブアンドテイク、というやつね。";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	end;
}
icecastle.gat,143,210,5	script(CLOAKED)	レハール#e20pn02	10469,{/* 3511 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "わぁ！";
		mes "潜水アーウィンの背中に乗るのは";
		mes "初めてです！";
		next;
		mes "[レハール]";
		mes "きっと楽しいですよ！";
		mes "楽しみだなぁ！";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ふぅぅ～～～。";
		mes "つ、疲れた……";
		mes "言われた量のお肉を";
		mes "持ってきましたよ～～。";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "……はっ!?";
		mes "もしかして騙されたのでは??";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
}
icecastle.gat,144,207,5	script(CLOAKED)	マラム#e20pn02	10376,{/* 3512 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "アーウィンに乗って海を渡る！";
		mes "なんだか不思議ですよね。";
		mes "ラヘルでは考えられない";
		mes "移動方法です。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "アーウィン達は";
		mes "たくさん食事を食べるみたいです。";
		mes "……本当に全部食べるのでしょうか？";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "なかなか出発できないですね……。";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	end;
}
icecastle.gat,141,206,5	script(CLOAKED)	ミリアム#e20pn02	10377,{/* 3513 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "レオン様とオーレリー様が頼りにする";
		mes "アーウィンなのだから";
		mes "実力は保証されているんだろうね。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "正当な対価が必要……と。";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "……何故か損した気分です。";
		mes "そう思ったのは、ボクだけ？";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
}
icecastle.gat,143,203,7	script(CLOAKED)	レイジー#e20pn02	10454,{/* 3514 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "この集団をどうやって";
		mes "流氷地帯に運ぶつもりだろう？";
		mes "え？";
		mes "このアーウィンに運んでもらうだって？";
		next;
		mes "[レイジー]";
		mes "人使い……いや";
		mes "鳥使いが結構荒いよね？";
		mes "ここの人たちって。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "思いっきりカモにされてないか？";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_leizi03.png", 2;
		mes "[レイジー]";
		mes "やっぱりカモにされてるじゃないか！";
		mes "こういう手合いは";
		mes "きっちりわからせておかないと";
		mes "あとで後悔するぜ？";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,198,152,0	script	#hw_ep20_pn0301	139,2,2,{/* 3516 */
	if(EP20_1QUE == 52) {
		cloakoffnpc "コロロ#e20pn0301";
		cloakoffnpc "レハール#e20pn0301";
		cloakoffnpc "レオン#e20pn0301";
		cloakoffnpc "オーレリー#e20pn0301";
		cloakoffnpc "マラム#e20pn0301";
		cloakoffnpc "ミリアム#e20pn0301";
		cloakoffnpc "レイジー#e20pn0301";
		end;
	}
}
jor_safty1.gat,195,155,3	script(CLOAKED)	コロロ#e20pn0301	10461,{/* 3517 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "ハァ……ハァ……";
		mes "ジュノーが誇る飛行船の";
		mes "ファーストクラスにしか乗らない";
		mes "私にとっては耐え難い乗り心地だった。";
		mes "よく耐えたな、私……さすが……。";
		next;
		cutin "Ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "到着しました！";
		mes "いち、に、さん……うあっ！";
		mes "1人足りないじゃん！";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "誰を海の中に落としてきたんだ!?";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "自分を数え忘れてました！";
		mes "全員無事ですから";
		mes "心配しないでください。";
		next;
		cutin "ep19_leon04.png", 2;
		mes "[レオン]";
		mes "それなら良かったけど……";
		mes "うっ……ふらふらする。";
		next;
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "大丈夫？";
		mes "私は少し目が回ったけど";
		mes "そこまでじゃないわ。";
		mes "やはり若い体だからかな……。";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[レオン]";
		mes "それは、恐らく関係ないよ……。";
		next;
		cutin "ep19_leon01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "それはともかく……ここはどこだろう？";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "ハハ、流氷地帯ですよ！";
		mes "冒険者様が仰ってた場所です！";
		mes "もしかして冒険者様も";
		mes "船酔いされてます？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "う～ん……";
		mes "白い猫に出会った場所とは";
		mes "ちょっと違いますね。";
		mes "こんな感じじゃなかったけど……。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "私たちをあんなに搾取しておいて";
		mes "場所を間違えるなんて！";
		mes "どうやって責任を取るつもりだ？";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "うわっ！";
		mes "レオン様、助けてくださ～い！";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ハハ……代わりに私が謝ります。";
		mes "でも……そうですね。";
		mes "コロロにはこれから無償で";
		mes "流氷地帯を行き来するのを";
		mes "手伝ってもらうことにしましょう。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "いくら守護者でも甘過ぎじゃない？";
		mes "まあ、無償というのが気に入った。";
		mes "それで手打ちにしよう。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "さて、冒険者様。";
		mes "白い猫に会った位置は憶えていますか？";
		mes "大体の位置で結構なのですが。";
		next;
		menu "どこも似たような景色で……",-;
		mes "[レオン]";
		mes "でしたら、皆で手分けして";
		mes "捜索しましょうか。";
		mes "立ち止まっていても仕方ありません。";
		mes "もし、それらしい場所を見つけたら";
		mes "教えてください。";
		next;
		cutin "ep19_leon01.png", 255;
		cutin "ep19_iwin06.png", 255;
		chgquest 23103,131257;
		set EP20_1QUE,53;
		mes "‐流氷地帯へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐流氷地帯へ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 235, 107;
		end;
	}
	if(EP20_1QUE == 53) {
		cutin "ep19_iwin03.png", 2;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "さて、冒険者様。";
		mes "白い猫に会った位置は憶えていますか？";
		mes "大体の位置で結構なのですが。";
		next;
		menu "どこも似たような景色で……",-;
		mes "[レオン]";
		mes "でしたら、皆で手分けして";
		mes "捜索しましょうか。";
		mes "立ち止まっていても仕方ありません。";
		mes "もし、それらしい場所を見つけたら";
		mes "教えてください。";
		next;
		cutin "ep19_leon01.png", 255;
		cutin "ep19_iwin06.png", 255;
		mes "‐流氷地帯へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐流氷地帯へ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 235, 107;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 52 || EP20_1QUE == 53)
		showevent 0, 1, "コロロ#e20pn0301";
	end;
}
jor_safty1.gat,192,146,5	script(CLOAKED)	ミリアム#e20pn0301	10377,{/* 3518 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "冒険者さんが指示した場所に";
		mes "到着できたのかな？";
		mes "コロロさんに聞いてみようか。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	//53未確認
	end;
}
jor_safty1.gat,191,153,5	script(CLOAKED)	レオン#e20pn0301	10464,{/* 3519 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_leon05.png", 2;
		mes "[レオン]";
		mes "うっ……ふらふらする。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,192,150,5	script(CLOAKED)	オーレリー#e20pn0301	10465,{/* 3520 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "特別な魔力は感じられないな……。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,195,148,5	script(CLOAKED)	マラム#e20pn0301	10376,{/* 3522 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "ふぅ……思ったよりもその……";
		mes "スゴイ乗り心地でした。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,192,156,5	script(CLOAKED)	レイジー#e20pn0301	10454,{/* 3523 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "想像を絶する危険運転……";
		mes "いや、危険水泳と呼ぶべきかな？";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,201,152,3	script(CLOAKED)	レハール#e20pn0301	10469,{/* 3521 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "まさか、あんな揺れるなんて……";
		mes "うっ……！";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}

jor_twice.gat,235,107,0	script	#hw_ep20_pn03	139,14,14,{/* 3524 */
	if(EP20_1QUE == 53) {
		cloakoffnpc "レハール#e20pn03";
		cloakoffnpc "レオン#e20pn04";
		cloakoffnpc "オーレリー#e20pn03";
		cloakoffnpc "マラム#e20pn03";
		cloakoffnpc "ミリアム#e20pn03";
		cloakoffnpc "レイジー#e20pn03";
	}
	end;
}
jor_twice.gat,235,111,3	script	コロロ#e20pn03	10461,{/* 3525 */
	if(EP20_1QUE == 53) {
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "他の方たちは、先に行かれましたよ。";
		mes "右側の道に沿って進んでみてください！";
		close2;
		cutin "ep19_iwin06.png", 255;
		chgquest 131257,23104;
		set EP20_1QUE,54;
		end;
	}
	if(EP20_1QUE == 54 || EP20_1QUE == 55) {
		cloakoffnpc "レハール#e20pn03";
		cloakoffnpc "レオン#e20pn04";
		cloakoffnpc "オーレリー#e20pn03";
		cloakoffnpc "マラム#e20pn03";
		cloakoffnpc "ミリアム#e20pn03";
		cloakoffnpc "レイジー#e20pn03";
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "他の方たちは、先に行かれましたよ。";
		mes "右側の道に沿って進んでみてください！";
		mes "それとも、氷の城に戻りますか？";
		next;
		if(select("帰らない","帰る") == 1) {
			cutin "ep19_iwin03.png", 2;
			mes "[コロロ]";
			mes "あああああ、退屈だ、退屈……。";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		}
		mes "[コロロ]";
		mes "羽根をしっかり掴んでください！";
		mes "海は凄く冷たいから気を付けて！";
		close2;
		cutin "ep19_iwin06.png", 255;
		warp "icecastle.gat", 141, 208;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "どうしたんですか？";
		next;
		switch(select("なんでもない","北西へ向かう","氷の城へ帰る")) {
		case 1:
			cutin "ep19_iwin03.png", 2;
			mes "[コロロ]";
			mes "あああああ、退屈だ、退屈……。";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		case 2:
			mes "[コロロ]";
			mes "そうですか？";
			mes "いってらっしゃい！";
			close2;
			cutin "ep19_iwin06.png", 255;
			warp "jor_twice.gat", 53, 323;
			end;
		case 3:
			mes "[コロロ]";
			mes "羽根をしっかり掴んでください！";
			mes "海は凄く冷たいから気を付けて！";
			close2;
			cutin "ep19_iwin06.png", 255;
			warp "icecastle.gat", 141, 208;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 53 || EP20_1QUE == 54)
		showevent 0, 1, "コロロ#e20pn03";
	if(EP20_1QUE >= 55)
		showevent 6, 3, "コロロ#e20pn03";
	end;
}
jor_twice.gat,255,125,5	script(CLOAKED)	マラム#e20pn03	10376,{/* 3526 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[マラム]";
	mes "凍っている場所を移動しながら";
	mes "北の方に行きましょう。";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,247,163,5	script	ミリアム#e20pn03	10377,{/* 3527 */
	cutin "ep18_miriam_01.png", 2;
	mes "[ミリアム]";
	mes "水が浅い場所は";
	mes "どうにか歩いて行けますね。";
	mes "もう少し北の方へ行きましょうか。";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,222,226,7	script(CLOAKED)	レイジー#e20pn03	10454,{/* 3528 (cloaking)*/
	cutin "ep19_leizi02.png", 2;
	mes "[レイジー]";
	mes "おう、足が冷える！";
	mes "我が温暖なる故郷ジュノーを離れて";
	mes "私はここで何をしているんだろう？";
	next;
	cutin "ep19_leizi01.png", 2;
	mes "[レイジー]";
	mes "なに？　どこへ向かえば良いかだって？";
	mes "私の直感は北東へ行って";
	mes "水溜まりに足を浸せと言っているよ！";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[レイジー]";
	mes "おほ、その顔は何？";
	mes "もしかして私の話を疑ってる？";
	mes "私と同じように";
	mes "冷たい水で靴を濡らせば良いと";
	mes "思っているわけじゃないからな？";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,232,249,5	script(CLOAKED)	レハール#e20pn03	10469,{/* 3529 (cloaking)*/
	cutin "ep19_lehar01.png", 2;
	mes "[レハール]";
	mes "この先にある狭い道を";
	mes "上がってください！";
	mes "乾いた地面が見えます！";
	mes "そっちに進みましょう。";
	next;
	mes "[レハール]";
	mes "水に落ちないようにしないと……";
	mes "水上歩行の術を習っておけば";
	mes "良かったなぁ。";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,237,310,5	script(CLOAKED)	オーレリー#e20pn03	10465,{/* 3530 (cloaking)*/
	cutin "ep19_aurelie01.png", 2;
	mes "[オーレリー]";
	mes "こっちよ。";
	mes "丘の上に登ってみて。";
	mes "レオンが待ってるわ。";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,238,330,0	script	#hw_ep20_pn04	139,5,5,{/* 3531 */
	if(EP20_1QUE == 54)
		cloakoffnpc "レオン#e20pn04";
	end;
}
jor_twice.gat,238,330,7	script(CLOAKED)	レオン#e20pn04	10464,{/* 3532 (cloaking)*/
	if(EP20_1QUE == 54) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "あ、"+strcharinfo(0)+"様。";
		next;
		menu "白い猫は見つかりましたか？",-;
		mes "[レオン]";
		mes "ここにはいないようです。";
		mes "高台に上がれば";
		mes "何か見えるかと思ったのですが。";
		next;
		mes "[レオン]";
		mes "あ……微力ではありますが";
		mes "ヨルムンガンドの魔力を感じます。";
		mes "流氷地帯の西側です。";
		mes "そちらに行ってみましょうか。";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 23104,23105;
		set EP20_1QUE,55;
		mes "‐西側へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐西側へ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 153, 238;
		end;
	}
	if(EP20_1QUE == 55) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "あ……微力ではありますが";
		mes "ヨルムンガンドの魔力を感じます。";
		mes "流氷地帯の西側です。";
		mes "そちらに行ってみましょうか。";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "‐西側へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐西側へ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 153, 238;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 54 || EP20_1QUE == 55)
		showevent 0, 1, "レオン#e20pn04";
	end;
}
jor_twice.gat,155,241,0	script	#hw_ep20_pn05	139,5,5,{/* 3533 */
	if(EP20_1QUE == 55) {
		cloakoffnpc "レハール#e20pn05";
		cloakoffnpc "レオン#e20pn05";
		cloakoffnpc "オーレリー#e20pn05";
		cloakoffnpc "マラム#e20pn05";
		cloakoffnpc "ミリアム#e20pn05";
		cloakoffnpc "レイジー#e20pn05";
	}
	if(EP20_1QUE == 56) {
		cloakoffnpc "レハール#e20pn05";
		cloakoffnpc "マラム#e20pn05";
		cloakoffnpc "ミリアム#e20pn05";
		cloakoffnpc "レイジー#e20pn05";
	}
	if(EP20_1QUE == 58) {
		cloakoffnpc "レハール#e20pn05";
		cloakoffnpc "レオン#e20pn05";
		cloakoffnpc "オーレリー#e20pn05";
		cloakoffnpc "マラム#e20pn05";
		cloakoffnpc "ミリアム#e20pn05";
		cloakoffnpc "レイジー#e20pn05";
	}
	end;
}
jor_twice.gat,153,243,7	script(CLOAKED)	レオン#e20pn05	10464,{/* 3534 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ここでヨルムンガンドの";
		mes "魔力を感じました。";
		mes "冒険者様は";
		mes "この場所に見覚えはありますか？";
		next;
		cutin "ep19_leon01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "ハッキリとは覚えていないのですが";
		mes "猫に出会ったのは";
		mes "この近くだった気がします。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "でしたら、間違いなさそうです。";
		mes "世界樹とヨルムンガンド……";
		mes "私とオーレリーなら";
		mes "知らないはずのない魔力です。";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "ヨルムンガンド教団も同じ魔力を感じて";
		mes "根源の地を探そうと";
		mes "していたのかもしれない。";
		mes "彼らもヨルムンガンドの魔力から";
		mes "生まれた存在だから。";
		next;
		mes "[オーレリー]";
		mes "前にも言ったと思うけど";
		mes "ヨルムンガンドの捨てられた身体に";
		mes "残っている魔力は、間もなく枯渇する。";
		mes "ルガンはイスガルドを離れるためにも";
		mes "力が必要だし、頭数も多い。";
		mes "かなり切迫しているはず……。";
		cloakoffnpc "白い猫#e20pn05";
		unittalk getnpcid(0,"白い猫#e20pn05"),"白い猫 : にゃおー",1;
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "……あれ？";
		next;
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "彼らより早くヨルムンガンドを";
		mes "見つけなきゃいけない。";
		unittalk getnpcid(0,"白い猫#e20pn05"),"白い猫 : みゃああっ",1;
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "オーレリー様、オーレリー様！";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "うん？";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "猫ですよ、あそこ！";
		unittalk getnpcid(0,"白い猫#e20pn05"),"白い猫 : くしくし",1;
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "ヨルムンガンドが私たちを";
		mes "見つけてくれたみたいだぞ？";
		mes "やっぱり神様は違うなぁ！";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "胴体がすっごく長いですね！";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "そうです！　あの長さ！";
		mes "間違いないですよ！";
		mes "ええっと……それでどうしましょうか？";
		next;
		misceffect 0,"白い猫#e20pn05",1;
		misceffect 0,"レオン#e20pn05",1;
		misceffect 0,"オーレリー#e20pn05",1;
		cloakonnpc "レオン#e20pn05";
		cloakonnpc "オーレリー#e20pn05";
		cloakonnpc "白い猫#e20pn05";
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "あ、あぁ!?";
		mes "オーレリー様、レオン様！";
		mes "どこに行かれるんですか！";
		next;
		mes "[レハール]";
		mes "冒険者様！";
		mes "お二人を見失わないように";
		mes "追いかけましょう！";
		close2;
		cutin "ep19_lehar01.png", 255;
		chgquest 23105,23106;
		set EP20_1QUE,56;
		end;
	}
	if(EP20_1QUE == 58) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "私とオーレリーはここで";
		mes "自分たちにできることをやります。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 55)
		showevent 0, 1, "レオン#e20pn05";
	end;
}
jor_twice.gat,160,244,3	script(CLOAKED)	レハール#e20pn05	10469,{/* 3535 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "レイジーさんはひとりで何を";
		mes "やってるんでしょう？";
		mes "氷の間に何かあるのかな？";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "冒険者様！";
		mes "レオン様とオーレリー様を";
		mes "追いかけましょう！";
		mes "急いで！";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "‐レオンたちのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐レオンたちのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 53, 323;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 56)
		showevent 0, 1, "レハール#e20pn05";
	end;
}
jor_twice.gat,155,247,5	script(CLOAKED)	マラム#e20pn05	10376,{/* 3536 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "うう、寒い……ここの風は";
		mes "まるで刃物ような鋭さです。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep18_maram_03.png", 2;
		mes "[マラム]";
		mes "あっという間に行ってしまいましたね。";
		mes "あのお二人は、どこに？";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_twice.gat,159,248,5	script(CLOAKED)	ミリアム#e20pn05	10377,{/* 3537 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "ふぅ。覚悟はしてたけど";
		mes "険しい道のりですね。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "一瞬で姿が見えなくなったけど";
		mes "もしかして、ボクの見間違えだった？";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_twice.gat,160,239,1	script(CLOAKED)	レイジー#e20pn05	10454,{/* 3538 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "あぁ……退勤したいな。";
		next;
		mes "[レイジー]";
		mes "もう若くもない私が";
		mes "買わなくても良い苦労を買うなんてね。";
		mes "お気に入りの靴が水浸しだ……。";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "なんだ、あの早さは！";
		mes "同じ人類なのに、あの二人は";
		mes "明らかにスピード違反じゃない？";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_twice.gat,157,246,7	script(CLOAKED)	白い猫#e20pn05	10537,{/* 3539 (cloaking)*/
	cutin "ep20_nyar01.png", 2;
	mes "[白い猫]";
	mes "ゴロゴロゴロ。";
	close2;
	cutin "ep20_nyar03.png", 255;
	end;
}
jor_twice.gat,43,331,0	script	#ep20_link_sw_1	139,14,14,{/* 3540 */
	if(EP20_1QUE == 56) {
		cloakoffnpc "白い猫#e20pn055";
		cloakoffnpc "レオン#e20pn055";
		cloakoffnpc "オーレリー#e20pn055";
		cloakoffnpc "レハール#e20pn055";
		cloakonnpc "白い猫#nyar_warp";
	}
	if(EP20_1QUE == 57) {
		cloakonnpc "白い猫#e20pn055";
		cloakonnpc "レオン#e20pn055";
		cloakonnpc "オーレリー#e20pn055";
		cloakonnpc "レハール#e20pn055";
		cloakoffnpc "白い猫#nyar_warp";
		cloakoffnpc "レオン#e20pn056";
		cloakoffnpc "オーレリー#e20pn056";
		cloakoffnpc "レハール#e20pn056";
		cloakoffnpc "小さな枝の在り処#ep20_m";
	}
	end;
}
jor_twice.gat,43,331,1	script(CLOAKED)	白い猫#e20pn055	10537,{/* 3541 (cloaking)*/}
jor_twice.gat,46,326,1	script(CLOAKED)	レオン#e20pn055	10464,{/* 3542 (cloaking)*/}
jor_twice.gat,50,330,1	script(CLOAKED)	オーレリー#e20pn055	10465,{/* 3543 (cloaking)*/}
jor_twice.gat,46,326,5	script(CLOAKED)	レオン#e20pn056	10464,{/* 3544 (cloaking)*/
	cutin "ep19_leon01.png", 2;
	mes "[レオン]";
	mes "他の皆さんともお話したいので";
	mes "場所を移しましょう。";
	close2;
	cutin "ep19_leon01.png", 255;
	end;
}
jor_twice.gat,50,330,5	script(CLOAKED)	オーレリー#e20pn056	10465,{/* 3545 (cloaking)*/
	cutin "ep19_aurelie01.png", 2;
	mes "[オーレリー]";
	mes "あまりここに長居はできないな。";
	close2;
	cutin "ep19_aurelie01.png", 255;
	end;
}
jor_twice.gat,50,326,1	script(CLOAKED)	レハール#e20pn055	10469,{/* 3546 (cloaking)*/
	if(EP20_1QUE == 56) {
		cloakonnpc "白い猫#e20pn055";
		cloakonnpc "レオン#e20pn055";
		cloakonnpc "オーレリー#e20pn055";
		unittalk "レハール : くっ！　追いつけない……!?",1;
		sleep 200;
		cloakonnpc "レハール#e20pn055";
		cloakoffnpc "レハール#e20pn056";
	}
	end;
}
jor_twice.gat,50,326,5	script(CLOAKED)	レハール#e20pn056	10469,{/* 3547 (cloaking)*/
	if(EP20_1QUE == 56) {
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes strcharinfo(0)+"様！";
		mes "他の方が到着するのを";
		mes "待っている時間はありません！";
		mes "私と一緒にレオン様とオーレリー様を";
		mes "探しに行きましょう！";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "^e6328cメモリアルダンジョン";
		mes "「小さな枝の在り処」の";
		mes "生成と入場が行えます。";
		if(mdopenstate("小さな枝の在り処"))
			set '@str$,"^0b0b33メモリアルダンジョンへ入場";
		else if(getpartyleader(getcharid(1)) == strcharinfo(0))
			set '@str$,"^0b0b33メモリアルダンジョンの作成";
		next;
		switch(select("^191970立ち去る",'@str$,"^0b0b33注意事項の確認")) {
		case 1:
			mes "‐その場を離れた‐";
			close;
		case 2:
			if(mdopenstate("小さな枝の在り処")) {
				cutin "ep19_lehar01.png", 2;
				mes "[レハール]";
				mes "準備できたら、すぐに行きますよ！";
				next;
				if(select("^191970少し考える","^e6328c小さな枝の在り処へ向かう") == 2) {
					mes "‐その場を離れた‐";
					close2;
					cutin "ep19_lehar05.png", 255;
					end;
				}
				mes "[レハール]";
				mes "この先に何があるのか……";
				mes "予想できませんね。";
				close2;
				cutin "ep19_lehar01.png", 255;
				switch(mdenter("小さな枝の在り処")) {
				case 0:	// エラーなし
					announce "メモリアルダンジョン[小さな枝の在り処] に入場しました　：　"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
					//warp "1@twig.gat", 220, 145;
					end;
				case 1:	// パーティー未加入
					mes "^8c32e6パーティーが解体されているため";
					mes "入場できません。";
					mes "もう一度確認してから";
					mes "やり直してください。";
					close;
				case 2:	// ダンジョン未作成
					mes "^8c32e6パーティーリーダーが";
					mes "メモリアルダンジョンを";
					mes "生成していない状態です。";
					close;
				default:	// その他エラー
					close;
				}
			}
			else {
				if(getonlinepartymember() < 1) {
					mes "^8c32e6空白のパーティー名では、";
					mes "メモリアルダンジョンを";
					mes "作成することは出来ません。";
					close;
				}
				mes "メモリアルダンジョンを作成しますか？";
				next;
				if(select("^191970少し考える","^e6328c作成する") == 1) {
					mes "‐その場を離れた‐";
					close;
				}
				if(getpartyleader(getcharid(1)) != strcharinfo(0))
					close;
				mdcreate "小さな枝の在り処";
				mes "■パーティー名";
				mes "^009eff"+strcharinfo(1)+"^000000";
				mes "■パーティーリーダー";
				mes "^009eff"+strcharinfo(0)+"^000000";
				mes "　";
				mes "^006400小さな枝の在り処の";
				mes "作成申請を受け付けました。^000000";
				close;
			}
		case 3:
			mes "詳しくはこちらをご確認ください。";
			mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			messize 180,364;
			close;
		}
	}
	if(EP20_1QUE == 57) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "安全な場所で話をしましょう。";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "‐安全な場所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐安全な場所へ";
		mes "　向かった‐";
		close2;
		warp "jor_safty1.gat", 331, 150;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 56 || EP20_1QUE == 57)
		showevent 0, 1, "レハール#e20pn056";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの生成と入場]";
	end;
}
jor_twice.gat,46,334,3	script(CLOAKED)	小さな枝の在り処#ep20_m	10046,{/* 3548 (cloaking)*/
	if(EP20_1QUE >= 57) {
		mes "[インフォメーション]";
		mes "既に「小さな枝の在り処」を";
		mes "クリアしているキャラクターは、";
		mes "パーティメンバーとして";
		mes "「小さな枝の在り処」に";
		mes "入場できます。";
		next;
		mes "[インフォメーション]";
		mes "パーティメンバーとして";
		mes "「小さな枝の在り処」に";
		mes "入場しますか？";
		next;
		if(select("やめる","「小さな枝の在り処」入場") == 1) {
			mes "‐やめた‐";
			close;
		}
		mes "[インフォメーション]";
		mes "「小さな枝の在り処」へ入場します。";
		close2;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[インフォメーション]";
			mes "既に「小さな枝の在り処」を";
			mes "クリアしているキャラクターは、";
			mes "パーティリーダーとして";
			mes "入場できません。";
			close;
		}
		if(getonlinepartymember() == 0 || getonlinepartymember() > 2) {
			mes "[インフォメーション]";
			mes "このメモリアルダンジョンは";
			mes "2人以下のパーティーで";
			mes "入場することができます。";
			close;
		}
		switch(mdenter("小さな枝の在り処")) {
		case 0:	// エラーなし
			announce "メモリアルダンジョン[小さな枝の在り処] に入場しました　：　"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			//warp "1@twig.gat", 220, 145;
			end;
		case 1:	// パーティー未加入
			//mes "^8c32e6パーティーが解体されているため";
			//mes "入場できません。";
			//mes "もう一度確認してから";
			//mes "やり直してください。";
			close;
		case 2:	// ダンジョン未作成
			mes "[インフォメーション]";
			mes "対象のメモリアルダンジョンが";
			mes "作成されていないため";
			mes "入場できません。";
			close;
		default:	// その他エラー
			close;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 58)
		showevent 0, 1, "小さな枝の在り処#ep20_m";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの入場]";
	end;
}

jor_safty1.gat,328,150,5	script	オーレリー#e20pn0501	10465,{/* 3549 */
	if(EP20_1QUE == 57) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "みんな、ここに集まっていたのか。";
		mes "私達が急に消えたみたいに見えたから";
		mes "驚かせてしまったようね。";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[レイジー]";
		mes "高速移動の秘伝でもあるの？";
		mes "追いかけようと思ったのに";
		mes "全然無理だったよ。";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "ルガンもたくさん徘徊しているので";
		mes "心配してたんですよ！";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ごめん、ごめん。";
		mes "でも、みんなに伝えたいことがある。";
		mes "とても重要なことだよ。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "もしかして";
		mes "白い猫を見つけたんですか？";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "そう。";
		mes "直接会話はできなかったけど";
		mes "ヨルムンガンドの意思は";
		mes "確かに預かったよ。";
		next;
		mes "[オーレリー]";
		mes "この近くに結界で隠れた場所があって";
		mes "そこにヨルムンガンドが";
		mes "護ろうとしてる世界樹があった。";
		mes "ルガンたちは、そこを探して出して";
		mes "魔力を利用しようとしている……。";
		next;
		mes "[オーレリー]";
		mes "私達は、ルガンたちに";
		mes "そこを発見されないように";
		mes "行動しないといけない。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "ひとつ、提案しても良い？";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "わぁ！";
		mes "もしかして、ルガンを止める";
		mes "良い案があるんですか！";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "ヨルムンガンドじゃなくて";
		mes "別の呼び方にしない？";
		mes "例えば「^FF0000ニャル様^000000」とかどう？";
		mes "ほら、文字数多いし、呼びにくいからさ。";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[レハール]";
		mes "……は？";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "簡潔で呼びやすいし";
		mes "何よりも可愛いじゃない？";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[ミリアム]";
		mes "神に対して……";
		mes "不敬ではないでしょうか？";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "……そうしましょうか。";
		mes "私達がヨルムンガンドという単語で";
		mes "会話していると、ルガンたちの注意を";
		mes "引いてしまう可能性があります。";
		unittalk getnpcid(0,"レオン#e20pn0501"),"レオン : 若干……可愛らしすぎる気がしますが。",1;
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "うん。";
		mes "敢えて威厳の無い名前を使用すれば";
		mes "ルガンの奴らにも気付かれない。";
		mes "……それぐらい、ヨルムンガンドも";
		mes "大目に見てくれるでしょう……たぶん。";
		next;
		mes "[オーレリー]";
		mes "じゃあ次は、この付近の";
		mes "ルガン討伐を開始したい。";
		mes "レハールの発案によるものだけど";
		mes "上手くやれば、ルガンたちの行動を";
		mes "妨害することができるはず。";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "甥っ子ちゃんって";
		mes "いいところ出のはずなのに";
		mes "けっこう過激だよね？";
		mes "私は、そういうの大好きだけど。";
		unittalk getnpcid(0,"レハール#e20pn0501"),"レハール : えへへ……",1;
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "反対意見は無いみたいね。";
		mes "では、各人それそれルガン1体を";
		mes "退治することを目標にしようか。";
		next;
		mes "[オーレリー]";
		mes "各人、目標を達成したら";
		mes "私に声をかけてくれる？";
		mes "私とレオンは、この付近の";
		mes "魔力の推移を調査しておくわ。";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 23108,23109;
		set EP20_1QUE,58;
		mes "‐ルガンの討伐へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐ルガンの討伐へ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 155, 240;
		end;
	}
	if(EP20_1QUE == 58) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "反対意見は無いみたいね。";
		mes "では、各人それそれルガン1体を";
		mes "退治することを目標にしようか。";
		next;
		mes "[オーレリー]";
		mes "各人、目標を達成したら";
		mes "私に声をかけてくれる？";
		mes "私とレオンは、この付近の";
		mes "魔力の推移を調査しておくわ。";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "‐ルガンの討伐へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ルガンの討伐へ";
		mes "　向かった‐";
		close2;
		warp "jor_twice.gat", 155, 240;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 57 || EP20_1QUE == 58)
		showevent 0, 1, "オーレリー#e20pn0501";
	end;
}
jor_safty1.gat,325,148,5	script	レオン#e20pn0501	10464,{/* 3550 */}
jor_safty1.gat,325,145,5	script	レハール#e20pn0501	10469,{/* 3551 */}
jor_safty1.gat,331,146,3	script	コロロ#e20pn0501	10461,{/* 3552 */}
jor_safty1.gat,329,152,5	script	ミリアム#e20pn0501	10377,{/* 3553 */}
jor_safty1.gat,333,152,3	script	マラム#e20pn0501	10376,{/* 3554 */}
jor_safty1.gat,336,150,3	script	レイジー#e20pn0501	10454,{/* 3555 */}

jor_twice.gat,156,243,3	script(CLOAKED)	オーレリー#e20pn05	10465,{/* 3555 (cloaking)*/
	if(EP20_1QUE == 58) {
		if(checkquest(23109) && !checkquest(23109)&0x4) {
			cutin "ep19_aurelie01.png", 2;
			mes "[オーレリー]";
			mes "魔力の推移を調べてるわ。";
			mes "ルガンを排除したことで";
			mes "たしかに魔力の減少が低下している。";
			mes "でも、まだ十分じゃない。";
			next;
			mes "[オーレリー]";
			mes "各人、ルガンを1体排除して欲しい。";
			mes "よろしくね。";
			close2;
			cutin "ep19_aurelie01.png", 255;
			end;
		}
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "みんなご苦労様。";
		mes "ルガンを排除したことで";
		mes "魔力の減少が低下しているわ。";
		mes "今日はこれで十分よ。";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "ふぅ……倒しても倒しても";
		mes "キリが無いですね。";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[レオン]";
		mes "配下のルガンたちを倒せば";
		mes "ラスガンドが姿を現す可能性も";
		mes "考えていたのですが";
		mes "そういう動きは見られませんね。";
		next;
		cutin "ep19_aurelie03.png", 2;
		mes "[オーレリー]";
		mes "奴も慎重になっているのかもしれない。";
		mes "この付近で冒険者と直接会ったからね。";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "こちらから打って出ましょうか？";
		next;
		cutin "ep19_leon02.png", 2;
		mes "[レオン]";
		mes "蛇の迷路に入るつもりですか？";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "……たしかに、あの迷路に攻め込んで";
		mes "出入り口を塞ぐことができれば";
		mes "この付近のルガンを";
		mes "排除しやすくなるでしょう。";
		next;
		mes "[レオン]";
		mes "ここでルガンを排除し続けるのも";
		mes "現実的ではありません。";
		mes "可能なら、できる限りルガンたちの";
		mes "今の状況も調べておきたい。";
		next;
		mes "[レオン]";
		mes "危険を伴いますが……";
		mes "やる価値はあるでしょう。";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "念のため、この流氷地帯の見回りと";
		mes "ルガンの排除も必要ね。";
		mes "その仕事は、コロロに任せても良い？";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[コロロ]";
		mes "任せてください！";
		mes "毎日きちんと見回りしますよ！";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "では私たちは、蛇の迷路に向かおう。";
		mes "ルガン変身スクロールを忘れないで。";
		mes "準備ができたなら";
		mes "迷路の前で合流しましょう。";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 23109,23112;
		mes "‐蛇の迷路へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐蛇の迷路へ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 148, 52;
		end;
	}
	if(EP20_1QUE == 59) {
		cutin "ep19_aurelie01.png", 2;
		mes "[オーレリー]";
		mes "では私たちは、蛇の迷路に向かおう。";
		mes "ルガン変身スクロールを忘れないで。";
		mes "準備ができたなら";
		mes "迷路の前で合流しましょう。";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "‐蛇の迷路へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐蛇の迷路へ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 148, 52;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(23109)) {
		if(checkquest(23109)&0x4)
			showevent 0, 1, "オーレリー#e20pn05";
		else
			showevent 0, 2, "オーレリー#e20pn05";
	}
	if(EP20_1QUE == 59)
		showevent 0, 1, "オーレリー#e20pn05";
	end;
}
jor_maze.gat,145,50,0	script	#hw_ep20_pn07	139,6,10,{/* 3556 */
	if(EP20_1QUE >= 59 && EP20_1QUE <= 63) {	//60,61,62不明
		cloakoffnpc "レハール#e20pn07";
		cloakoffnpc "レオン#e20pn07";
		cloakoffnpc "オーレリー#e20pn07";
		cloakoffnpc "マラム#e20pn07";
		cloakoffnpc "ミリアム#e20pn07";
		cloakoffnpc "レイジー#e20pn07";
	}
	end;
}
jor_maze.gat,151,54,3	script(CLOAKED)	レハール#e20pn07	10472,{/* 3557 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[レハール]";
		mes "冒険者様！";
		mes "ここは敵の巣窟内ですよ！";
		mes "その姿で歩きまわるのは危険です！";
		close;
	}
	if(EP20_1QUE == 59) {
		mes "[レハール]";
		mes "う～～ん……あ、冒険者様。";
		mes "ルガンたちの様子が変じゃないですか？";
		mes "以前、侵入した時と比べて……。";
		next;
		menu "浮かれているように見えます",-;
		mes "[レハール]";
		mes "そうです！";
		mes "浮かれているみたいです。";
		mes "妙に楽しそうというか";
		mes "テンションが高いと言うか。";
		next;
		mes "[レハール]";
		mes "イヤな予感がしますね……";
		mes "状況を探る必要がありそうです。";
		mes "この周辺にいるルガンたちの話を";
		mes "聞いて回りましょう。";
		next;
		chgquest 23112,23113;
		set EP20_1QUE,60;
		mes "‐噂話の収集へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐噂話の収集へ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 54, 242;
		end;
	}
	if(EP20_1QUE >= 60 && EP20_1QUE <= 63) {
		mes "[レハール]";
		mes "イヤな予感がしますね……";
		mes "状況を探る必要がありそうです。";
		mes "この周辺にいるルガンたちの話を";
		mes "聞いて回りましょう。";
		next;
		mes "‐噂話の収集へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐噂話の収集へ";
		mes "　向かった‐";
		close2;
		switch(EP20_1QUE) {
		case 60: warp "jor_maze.gat", 54, 242; break;
		case 61: warp "jor_maze.gat", 154, 239; break;
		case 62: warp "jor_maze.gat", 281, 186; break;
		case 63: warp "jor_maze.gat", 148, 40; break;
		}
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 59 || EP20_1QUE == 60)
		showevent 0, 1, "レハール#e20pn07";
	end;
}
jor_maze.gat,151,45,3	script(CLOAKED)	ミリアム#e20pn07	10471,{/* 3558 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ミリアム]";
		mes "その姿のままだと";
		mes "ルガンに気付かれてしまうから";
		mes "変身スクロールを使って。";
		close;
	}
	if(EP20_1QUE == 63) {
		mes "[ミリアム]";
		mes "冒険者さん、ルガンたちから";
		mes "話は聞けた？";
		mes "情報を共有して欲しいんだけど。";
		next;
		mes "[マラム]";
		mes "……ニャル様が現れたことを";
		mes "みんな知っているようでした。";
		mes "それと、ラスガンドはニャル様を";
		mes "ヨルムンガンド再臨の触媒体だと";
		mes "言っているようです。";
		next;
		mes "[ミリアム]";
		mes "ボクが聞いた話によると";
		mes "ラスガンドはルガンたちに";
		mes "ニャル様を捕まえるよう命じたみたい。";
		next;
		mes "[マラム]";
		mes "捕まえて、その魔力を何かに";
		mes "利用するつもりなのでしょうか？";
		next;
		menu "おそらくは……",-;
		mes "[マラム]";
		mes "ルガンたちがニャル様を捕まえる前に";
		mes "こちらが保護できれば良いのですが……";
		mes "いったい、どこにいるのだろう？";
		next;
		mes "[ミリアム]";
		mes "調査の範囲を広げましょうか？";
		mes "ここでの調査は済んだから";
		mes "迷路の内側にも行ってみようよ。";
		next;
		chgquest 23116,23118;
		set EP20_1QUE,64;
		mes "‐迷路の内側へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐迷路の内側へ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 202, 29;
		end;
	}
	if(EP20_1QUE == 64) {
		mes "[ミリアム]";
		mes "調査の範囲を広げましょうか？";
		mes "ここでの調査は済んだから";
		mes "迷路の内側にも行ってみようよ。";
		next;
		mes "‐迷路の内側へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐迷路の内側へ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 202, 29;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 63 || EP20_1QUE == 64)
		showevent 0, 1, "ミリアム#e20pn07";
	end;
}
jor_maze.gat,145,50,5	script(CLOAKED)	レオン#e20pn07	10471,{/* 3559 (cloaking)*/}
jor_maze.gat,145,53,5	script(CLOAKED)	オーレリー#e20pn07	10470,{/* 3560 (cloaking)*/}
jor_maze.gat,151,50,3	script(CLOAKED)	マラム#e20pn07	10472,{/* 3561 (cloaking)*/}
jor_maze.gat,145,41,7	script(CLOAKED)	レイジー#e20pn07	10475,{/* 3562 (cloaking)*/}
jor_maze.gat,53,238,0	script	#hw1	139,9,5,{/* 3563 */
	if(EP20_1QUE == 60) {
		cloakoffnpc "ホトロケガンド#e20rgan_";
		cloakoffnpc "ソヘガルガンド#e20rgan_";
	}
	end;
}
jor_maze.gat,52,238,7	script(CLOAKED)	ホトロケガンド#e20rgan_	10470,{/* 3564 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ホトロケガンド]";
		mes "ギャーー！　汚らわしい人間！";
		close;
	}
	if(EP20_1QUE == 60) {
		mes "[ホトロケガンド]";
		mes "聞いたか！";
		mes "ヨルムンガンド様が再臨されるらしい！";
		mes "ああ、嬉しすぎて";
		mes "仕事も手につかない程だ！";
		next;
		mes "[ソヘガルガンド]";
		mes "そうらしいな！";
		mes "だが、こんな時こそ";
		mes "よく食べて、よく寝て、よく働くのだ！";
		mes "ヨルムンガンド様をお迎えする為に！";
		next;
		mes "[ホトロケガンド]";
		mes "まったくもってその通りだ！";
		mes "……んん？";
		next;
		mes "[ホトロケガンド]";
		mes "お前！　もっともらしい事を言ってるが";
		mes "私が仕事をしている間に";
		mes "ヨルムンガンド様を";
		mes "お迎えするつもりだな！";
		next;
		mes "[ソヘガルガンド]";
		mes "ちっ、勘のいいやつめ！";
		mes "信仰深い俺の方が先に";
		mes "ヨルムンガンド様にお会いするのは";
		mes "当然のことだろう？";
		next;
		mes "[ホトロケガンド]";
		mes "こ、こいつっ！";
		emotion 7,"ホトロケガンド#e20rgan_",1;
		next;
		mes "‐どうやら、ルガンたちの間に";
		mes "　ヨルムンガンドが再臨するという";
		mes "　噂が広まっているようだ。";
		mes "　別の場所でも話を聞いてみよう‐";
		next;
		chgquest 23113,23114;
		set EP20_1QUE,61;
		mes "‐次のルガンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 154, 239;
		end;
	}
	if(EP20_1QUE == 61) {
		mes "‐どうやら、ルガンたちの間に";
		mes "　ヨルムンガンドが再臨するという";
		mes "　噂が広まっているようだ。";
		mes "　別の場所でも話を聞いてみよう‐";
		next;
		mes "‐次のルガンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 154, 239;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 60 || EP20_1QUE == 61)
		showevent 0, 1, "ホトロケガンド#e20rgan_";
	end;
}
jor_maze.gat,55,238,7	script(CLOAKED)	ソヘガルガンド#e20rgan_	10471,{/* 3565 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ソヘガルガンド]";
		mes "ギャーー！　汚らわしい人間！";
		close;
	}
	if(EP20_1QUE == 60) {
		mes "[ソヘガルガンド]";
		mes "こんな時こそ";
		mes "よく食べて、よく寝て、よく働くのだ！";
		mes "ヨルムンガンド様をお迎えする為に！";
		close;
	}
	if(EP20_1QUE == 61) {
		mes "[ソヘガルガンド]";
		mes "ちっ、勘のいいやつめ！";
		close;
	}
	end;
}
jor_maze.gat,155,243,0	script	#hw3	139,9,9,{/* 3566 */
	if(EP20_1QUE == 61) {
		cloakoffnpc "ミスゴゼガンド#e20rgan_";
		cloakoffnpc "ナアルガンド#e20rgan_sr";
	}
	end;
}
jor_maze.gat,154,244,3	script(CLOAKED)	ミスゴゼガンド#e20rgan_	10472,{/* 3567 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ミスゴゼガンド]";
		mes "汚らわしい人間め！";
		mes "排除してやる！";
		close;
	}
	if(EP20_1QUE == 61) {
		mes "[ミスゴゼガンド]";
		mes "司祭様、ヨルムンガンド様の触媒体は";
		mes "どのようなお姿なのですか？";
		next;
		mes "[ナアルガンド]";
		mes "……白くて、胴が長い。";
		mes "そしてヨルムンガンド様の魔力を";
		mes "鮮明に感じられる。";
		next;
		mes "[ミスゴゼガンド]";
		mes "もっと詳しく";
		mes "教えていただけないでしょうか？";
		mes "私は上級だからでしょうか……";
		mes "上手く理解できません。";
		next;
		mes "[ナアルガンド]";
		mes "……私もそれだけしか聞いていない。";
		mes "詳しいことは";
		mes "ラスガンド様にお聞きしなければ……。";
		emotion 4,"ミスゴゼガンド#e20rgan_",1;
		next;
		mes "‐下っ端のルガンたちには";
		mes "　ヨルムンガンドに関する";
		mes "　正確な情報が伝わっていないらしい。";
		mes "　……どこの組織も似たようなものだ‐";
		next;
		chgquest 23114,23115;
		set EP20_1QUE,62;
		mes "‐次のルガンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 281, 186;
		end;
	}
	if(EP20_1QUE == 62) {
		mes "‐下っ端のルガンたちには";
		mes "　ヨルムンガンドに関する";
		mes "　正確な情報が伝わっていないらしい。";
		mes "　……どこの組織も似たようなものだ‐";
		next;
		mes "‐次のルガンのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 281, 186;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 61 || EP20_1QUE == 62)
		showevent 0, 1, "ミスゴゼガンド#e20rgan_";
	end;
}
jor_maze.gat,157,241,5	script(CLOAKED)	ナアルガンド#e20rgan_sr	10473,{/* 3568 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ナアルガンド]";
		mes "近寄るな！";
		mes "汚らわしい人間め！";
		close;
	}
	if(EP20_1QUE == 61) {
		mes "[ナアルガンド]";
		mes "……白くて、胴が長い。";
		mes "そしてヨルムンガンド様の魔力を";
		mes "鮮明に感じられる。";
		close;
	}
	if(EP20_1QUE == 62) {
		mes "[ナアルガンド]";
		mes "……私に聞かれても困る。";
		close;
	}
	end;
}
jor_maze.gat,282,190,0	script	#hw5	139,9,9,{/* 3569 */
	if(EP20_1QUE == 62) {
		cloakoffnpc "ハナウガンド#e20rgan_sr";
		cloakoffnpc "ケグトガンド#e20rgan_sr";
	}
	end;
}
jor_maze.gat,281,191,4	script(CLOAKED)	ケグトガンド#e20rgan_sr	10474,{/* 3570 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ケグトガンド]";
		mes "なぜ人間がっ！";
		close;
	}
	if(EP20_1QUE == 62) {
		mes "[ケグトガンド]";
		mes "白くて長くて魔力を持つ存在……。";
		next;
		mes "[ハナウガンド]";
		mes "白くて長くて魔力を持つ存在……。";
		next;
		mes "[ケグトガンド]";
		mes "その存在が、ヨルムンガンド様が";
		mes "再臨されるための触媒体だと";
		mes "ラスガンド様は仰られたな？";
		next;
		mes "[ハナウガンド]";
		mes "それって要するに";
		mes "私達ルガンのことだよな！";
		mes "白くて長い尻尾！";
		mes "そして、魔力を持っている！";
		next;
		mes "[ケグトガンド]";
		mes "ヨルムンガンド様は";
		mes "我々の起源だからな！";
		mes "さぞかし美しく滑らかな鱗と";
		mes "カッコいい尻尾をお持ちなのだろう！";
		next;
		mes "[ハナウガンド]";
		mes "そうに違いない！";
		mes "白く、長くて、魔力を持つ存在なんて";
		mes "ルガン以外にあり得ない！";
		emotion 3,"ケグトガンド#e20rgan_sr",1;
		emotion 3,"ハナウガンド#e20rgan_sr",1;
		next;
		mes "‐ルガンたちの間では";
		mes "　「白くて長くて魔力を持つ存在」が";
		mes "　ヨルムンガンド再臨の触媒体であると";
		mes "　噂されているようだ‐";
		next;
		chgquest 23115,23116;
		set EP20_1QUE,63;
		mes "‐みんなのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐みんなのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 148, 40;
		end;
	}
	if(EP20_1QUE == 63) {
		mes "‐ルガンたちの間では";
		mes "　「白くて長くて魔力を持つ存在」が";
		mes "　ヨルムンガンド再臨の触媒体であると";
		mes "　噂されているようだ‐";
		next;
		mes "‐みんなのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐みんなのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_maze.gat", 148, 40;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 62 || EP20_1QUE == 63)
		showevent 0, 1, "ケグトガンド#e20rgan_sr";
	end;
}
jor_maze.gat,283,188,3	script(CLOAKED)	ハナウガンド#e20rgan_sr	10475,{/* 3571 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ハナウガンド]";
		mes "人間めっ！　いますぐ追い出せ！";
		close;
	}
	mes "[ハナウガンド]";
	mes "白く、長くて、魔力を持つ存在なんて";
	mes "ルガン以外にあり得ない！";
	close;
}
jor_maze.gat,198,33,0	script	#hw_ep20_pn0802	139,9,9,{/* 3572 */
	if(EP20_1QUE == 64)
		cloakoffnpc "ミリアム#e20pn08_enter";
	end;
}
jor_maze.gat,197,34,5	script(CLOAKED)	ミリアム#e20pn08_enter	10471,{/* 3573 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ミリアム]";
		mes "その姿のままだと";
		mes "ルガンに気付かれてしまうから";
		mes "変身スクロールを使って。";
		close;
	}
	if(EP20_1QUE == 64) {
		mes "[ミリアム]";
		mes "冒険者さん。";
		mes "迷路の内側がなにやら騒がしい。";
		mes "慎重に進んだ方が良さそうだよ。";
		close2;
		warp "jor_safty2.gat", 300, 151;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 64)
		showevent 0, 1, "ミリアム#e20pn08_enter";
	end;
}
jor_safty2.gat,309,150,0	script	#hw_ep20_pn08	139,9,9,{/* 3575 */
	if(EP20_1QUE == 64) {
		cloakoffnpc "レハール#e20pn08";
		cloakoffnpc "レオン#e20pn08";
		cloakoffnpc "オーレリー#e20pn08";
		cloakoffnpc "マラム#e20pn08";
		cloakoffnpc "ミリアム#e20pn08";
		cloakoffnpc "レイジー#e20pn08";
	}
	end;
}
jor_safty2.gat,300,148,5	script(CLOAKED)	ミリアム#e20pn08	10471,{/* 3576 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ミリアム]";
		mes "その姿のままだと";
		mes "ルガンに気付かれてしまうから";
		mes "変身スクロールを使って。";
		close;
	}
	if(EP20_1QUE == 64) {
		cloakonnpc "スダダガンド#e20pn08";
		cloakonnpc "パキロガンド#e20pn08";
		cloakonnpc "カトセドガンド#e20pn08";
		cloakonnpc "タイナガンド#e20pn08";
		cloakonnpc "ラムゼデガンド#e20pn08";
		cloakonnpc "バヘドガンド#e20pn08";
		cloakonnpc "スロセガンド#e20pn08";
		cloakonnpc "白い猫#e20pn08";
		cloakonnpc "ラスガンド#e20pn08";
		mes "[ミリアム]";
		mes "ルガンには正体はバレてない。";
		mes "このまま奥まで侵入できると";
		mes "良いんだけど……。";
		next;
		mes "[マラム]";
		mes "……あれは？";
		cloakoffnpc "白い猫#e20pn08";
		misceffect 0,"白い猫#e20pn08",1;
		unittalk getnpcid(0,"白い猫#e20pn08"),"白い猫: ミャオォォォン。",1;
		next;
		mes "[ミリアム]";
		mes "急に立ち止まってどうしたの？";
		next;
		mes "[マラム]";
		mes "ヨル……ニャル様だ！";
		next;
		mes "[ミリアム]";
		mes "えっ……!?";
		next;
		mes "[ニャル]";
		mes "ミャオオン。";
		next;
		cloakoffnpc "スダダガンド#e20pn08";
		unittalk getnpcid(0,"スダダガンド#e20pn08"),"……なんだ、あれ？",1;
		mes "[レオン]";
		mes "ニャル様の魔力に";
		mes "奴らも気付いたみたいですね……。";
		close2;
		if(!sleep2(1000)) end;
		cloakoffnpc "パキロガンド#e20pn08";
		unittalk getnpcid(0,"スダダガンド#e20pn08"),"猫だ、胴が物凄く長い！",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"パキロガンド#e20pn08"),"白色だ！",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "カトセドガンド#e20pn08";
		cloakoffnpc "タイナガンド#e20pn08";
		unittalk getnpcid(0,"カトセドガンド#e20pn08"),"ヨルムンガンド様の力を感じる！",1;
		unittalk getnpcid(0,"スダダガンド#e20pn08"),"私も感じるぞ！",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"タイナガンド#e20pn08"),"ヨルムンガンド様なら、どうお迎えすれば!?",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "ラムゼデガンド#e20pn08";
		if(!sleep2(1000)) end;
		cloakoffnpc "バヘドガンド#e20pn08";
		unittalk getnpcid(0,"ラムゼデガンド#e20pn08"),"主教様、恐れ多いです！",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"バヘドガンド#e20pn08"),"それはまさに敬虔な信仰の表れだ。",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "スロセガンド#e20pn08";
		unittalk getnpcid(0,"スロセガンド#e20pn08"),"みだりに触れてはいけないが……",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"スダダガンド#e20pn08"),"だ、誰でもいいから、早く捕まえろ！",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"カトセドガンド#e20pn08"),"ラスガンド様を呼んでくる！",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"バヘドガンド#e20pn08"),"とりあえず、猫を取り囲め！",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"白い猫#e20pn08"),"白い猫: ミャオ！",1;
		misceffect 554,"白い猫#e20pn08",1;
		misceffect 1065,"白い猫#e20pn08",1;
		unittalk getnpcid(0,"パキロガンド#e20pn08"),"猫が、消えた!?",1;
		if(!sleep2(500)) end;
		misceffect 1065,"レハール#e20pn08",1;
		if(!sleep2(500)) end;
		misceffect 1065,"レオン#e20pn08",1;
		misceffect 1065,"オーレリー#e20pn08",1;
		if(!sleep2(500)) end;
		misceffect 1065,"マラム#e20pn08",1;
		misceffect 1065,"ミリアム#e20pn08",1;
		if(!sleep2(500)) end;
		misceffect 1065,"レイジー#e20pn08",1;
		misceffect 1065,"",1;
		unittalk getnpcid(0,"ラムゼデガンド#e20pn08"),"周りにいたルガンたちも消えたぞ!?",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"タイナガンド#e20pn08"),"何が起きた!?",1;
		if(!sleep2(1000)) end;
		mes "[ミリアム]";
		mes "……ルガンたちの目には";
		mes "ボクたちが消えたように";
		mes "見えているのかな？";
		next;
		mes "[レハール]";
		mes "私達が以前、逃げ出した時も";
		mes "同じように姿を隠してくれました。";
		next;
		mes "[レオン]";
		mes "ニャル様の魔力が私達を包んでいます。";
		mes "聖地を隠している結界と";
		mes "同じもののようです。";
		next;
		mes "[オーレリー]";
		mes "私達を助けに来てくれた？";
		next;
		cloakoffnpc "ラスガンド#e20pn08";
		mes "[レイジー]";
		mes "それはつまり、これ以上進むのは";
		mes "危険ってこと？";
		mes "おっと、親分のご登場だぞ。";
		next;
		cutin "ep20_lasgand01.png", 2;
		mes "[ラスガンド]";
		mes "……何の騒ぎだ？";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "[スロセガンド]";
		mes "ラスガンド様、胴の長い猫が！";
		unittalk getnpcid(0,"ラムゼデガンド#e20pn08"),"ここに居たのです！",1;
		unittalk getnpcid(0,"パキロガンド#e20pn08"),"もしかして、見間違えた？",1;
		unittalk getnpcid(0,"スダダガンド#e20pn08"),"いや、確かにここに……",1;
		next;
		mes "[バヘドガンド]";
		mes "つい先ほどここにいたんです！";
		mes "ですが、消えてしまって！";
		unittalk getnpcid(0,"カトセドガンド#e20pn08"),"そう、本当にいたんだ！",1;
		next;
		cutin "ep20_lasgand01.png", 2;
		mes "[ラスガンド]";
		mes "……流氷地帯で感じた魔力と";
		mes "同じ魔力を感じるぞ。";
		mes "そう、確かにヨルムンガンドの触媒体は";
		mes "ここに存在している。";
		mes "くく……すぐ隣にいるかのようだ。";
		unittalk getnpcid(0,"パキロガンド#e20pn08"),"ラスガンド様……！",1;
		next;
		cutin "ep20_lasgand01.png", 255;
		mes "[レイジー]";
		mes "感覚が鋭いな……";
		mes "流石は蛇……。";
		next;
		mes "[オーレリー]";
		mes "ここから離れた方が良い。";
		mes "……イヤな予感がする。";
		next;
		misceffect 910,"ラスガンド#e20pn08",1;
		mes "[レオン]";
		mes "あれは……まさか";
		mes "ヨルムンガンドの魔力を吸収している？";
		next;
		cutin "ep20_lasgand04.png", 2;
		mes "[ラスガンド]";
		mes "先手を打ったつもりだろうが";
		mes "この迷路は、私の身体の様なものだ。";
		mes "……お前たちは";
		mes "私の掌の上で踊っているに過ぎぬ。";
		next;
		mes "[ラスガンド]";
		mes "くくく……手間が省けた。";
		mes "大人しく我が大望の贄と成れ！";
		unittalk getnpcid(0,"ラムゼデガンド#e20pn08"),"ラスガンド様！",1;
		unittalk getnpcid(0,"タイナガンド#e20pn08"),"ラスガンド様！",1;
		unittalk getnpcid(0,"パキロガンド#e20pn08"),"ラスガンド様！",1;
		unittalk getnpcid(0,"スダダガンド#e20pn08"),"ラスガンド様！",1;
		next;
		cutin "ep20_lasgand04.png", 255;
		mes "[レオン]";
		mes "これ以上は、いけない！";
		next;
		cutin "ep20_nyar05.png", 2;
		misceffect 894,"白い猫#e20pn08",1;
		mes "[ニャル]";
		mes "！";
		next;
		cutin "ep19_leon01.png", 255;
		misceffect 484,"",1;
		if(!sleep2(3000)) end;
		chgquest 23118,18220;
		set EP20_1QUE,65;
		warp "jor_back1.gat", 364, 217;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 64)
		showevent 0, 1, "ミリアム#e20pn08";
	end;
}
jor_safty2.gat,307,147,1	script(CLOAKED)	白い猫#e20pn08	10537,{/* 3577 (cloaking)*/
	cutin "ep20_nyar03.png", 2;
	mes "[白い猫]";
	mes "ミャオオォォン";
	close2;
	cutin "ep20_nyar05.png", 255;
	end;
}
jor_safty2.gat,304,147,5	script(CLOAKED)	オーレリー#e20pn08	10471,{/* 3578 (cloaking)*/}
jor_safty2.gat,305,151,7	script(CLOAKED)	レオン#e20pn08	10471,{/* 3579 (cloaking)*/}
jor_safty2.gat,301,145,5	script(CLOAKED)	レハール#e20pn08	10472,{/* 3580 (cloaking)*/}
jor_safty2.gat,298,143,5	script(CLOAKED)	レイジー#e20pn08	10475,{/* 3581 (cloaking)*/}
jor_safty2.gat,303,151,5	script(CLOAKED)	マラム#e20pn08	10471,{/* 3582 (cloaking)*/}
jor_safty2.gat,316,145,3	script2(CLOAKED)	ラスガンド#e20pn08	22007,{/* 3583 (cloaking)*/}
//setnpcspeed 150,"ラスガンド#e20pn08";
jor_safty2.gat,309,150,3	script(CLOAKED)	スダダガンド#e20pn08	10474,{/* 3584 (cloaking)*/}
jor_safty2.gat,311,148,3	script(CLOAKED)	パキロガンド#e20pn08	10475,{/* 3585 (cloaking)*/}
jor_safty2.gat,309,145,1	script2(CLOAKED)	カトセドガンド#e20pn08	10472,{/* 3586 (cloaking)*/}
//setnpcspeed 200,"カトセドガンド#e20pn08";
jor_safty2.gat,307,143,7	script(CLOAKED)	タイナガンド#e20pn08	10473,{/* 3587 (cloaking)*/}
jor_safty2.gat,309,141,1	script2(CLOAKED)	ラムゼデガンド#e20pn08	10470,{/* 3588 (cloaking)*/}
//setnpcspeed 200,"ラムゼデガンド#e20pn08";
jor_safty2.gat,311,143,1	script(CLOAKED)	バヘドガンド#e20pn08	10474,{/* 3589 (cloaking)*/}
jor_safty2.gat,306,140,8	script(CLOAKED)	スロセガンド#e20pn08	10475,{/* 3590 (cloaking)*/}

jor_back1.gat,365,218,0	script	#ep20_part_end_evt1	139,9,9,{/* 3590 */
	if(EP20_1QUE == 65)
		cloakoffnpc "ニャル#ep20_nyar_e1";
	if(EP20_1QUE == 66 || EP20_1QUE == 67)
		cloakoffnpc "レイジー#ep20_end01";
	end;
}
jor_back1.gat,364,222,3	script(CLOAKED)	ニャル#ep20_nyar_e1	10537,{/* 3591 (cloaking)*/
	if(EP20_1QUE == 65) {
		unittalk getcharid(3),strcharinfo(0)+" : ……ここは？　みんなは、どこだ？",1;
		if(!sleep2(500)) end;
		mes "[ニャル]";
		mes "ミャオッ？";
		cutin "ep20_nyar02.png", 1;
		next;
		cutin "ep20_nyar02.png", 255;
		mes "‐どうやらニャルが氷の城の近くに";
		mes "　転送してくれたようだ‐";
		close2;
		cutin "ep20_nyar02.png", 255;
		cloakoffnpc "レイジー#ep20_end01";
		if(!sleep2(200)) end;
		misceffect 1,"レイジー#ep20_end01",1;
		misceffect 563,"レイジー#ep20_end01",1;
		misceffect 194,"レイジー#ep20_end01",1;
		if(!sleep2(200)) end;
		cloakonnpc "ニャル#ep20_nyar_e1";
		chgquest 18220,18240;
		set EP20_1QUE,66;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 65)
		showevent 0, 1, "ニャル#ep20_nyar_e1";
	end;
}
jor_back1.gat,368,222,3	script(CLOAKED)	レイジー#ep20_end01	10454,{/* 3592 (cloaking)*/
	if(EP20_1QUE == 66) {
		mes "[レイジー]";
		mes "いたたたた……";
		mes "あまりに急なことだったから";
		mes "着地に失敗しちゃったじゃないか。";
		mes "うん？　ここは氷の城の近くか？";
		cutin "ep19_leizi01.png", 2;
		next;
		mes "[レイジー]";
		mes "家の前まで送ってもらったんだから";
		mes "いったん家に帰ろうぜ。";
		mes "ここに立ってても事態は進まないから。";
		mes "他のみんなも、きっとそうしてるって。";
		next;
		cutin "ep19_leizi01.png", 255;
		chgquest 18240,131258;
		set EP20_1QUE,67;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 115, 226;
		end;
	}
	if(EP20_1QUE == 67) {
		cutin "ep19_leizi01.png", 2;
		mes "[レイジー]";
		mes "家の前まで送ってもらったんだから";
		mes "いったん家に帰ろうぜ。";
		mes "ここに立ってても事態は進まないから。";
		mes "他のみんなも、きっとそうしてるって。";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icas_in.gat", 115, 226;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 66 || EP20_1QUE == 67)
		showevent 0, 1, "レイジー#ep20_end01";
	end;
}
icas_in.gat,142,201,3	script	トルル#ep20iwin01	21513,{/* 3593 */}
icas_in.gat,116,222,0	script	#ep20_part_end_evt2	139,5,5,{/* 3595 */
	if(EP20_1QUE == 67 || EP20_1QUE == 68) {
		cloakoffnpc "レオン#ep20_end01";
		cloakoffnpc "オーレリー#ep20_end01";
	}
	end;
}
icas_in.gat,111,228,4	script(CLOAKED)	レオン#ep20_end01	10464,{/* 3596 (cloaking)*/
	if(EP20_1QUE == 67) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ご無事でよかった。";
		mes "急に氷の城に転送されて……";
		mes "ニャル様のお力によるものですね。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "みんな、バラバラに";
		mes "飛ばされたみたいね。";
		mes "探しに行こうと思っていたけど";
		mes "ここで待っていたのよ。";
		next;
		cloakoffnpc "レイジー#ep20_end02";
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "行き違いになると困るからなぁ。";
		mes "さて……";
		mes "他のみんなが来るまでの間に";
		mes "情報を整理しておきましょうか？";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "そうしましょう。";
		mes "まず、ラスガンドがニャル様の魔力を";
		mes "感知できるのは間違いありません。";
		mes "しかも、それを吸収できます。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "あの口ぶりからすると";
		mes "今のラスガンドの目的は";
		mes "ニャル様の魔力を奪うことで";
		mes "間違いないと思うわ。";
		mes "……考えてみれば、当然だけど。";
		next;
		menu "どういうことですか？",-;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "元々、モンスターに過ぎない存在が";
		mes "ヨルムンガンドの魔力を吸収して";
		mes "生まれたのがルガンです。";
		next;
		mes "[レオン]";
		mes "ラスガンドも同じです。";
		mes "ヨルムンガンドの魔力を得て";
		mes "今のような存在になった。";
		next;
		mes "[レオン]";
		mes "しかし、ヨルムンガンドの亡骸から";
		mes "これ以上魔力を吸収することは";
		mes "難しい状況です。";
		mes "ニャル様は、格好の餌なのでしょう。";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "うえーー！";
		mes "自分たちの神を食べようとするなんて！";
		mes "まるで寄生虫だな！";
		next;
		cloakoffnpc "ヴォークリンデ#ep20_end";
		cloakoffnpc "ヴェルグンデ#ep20_end01";
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "正にそうよ。";
		mes "だからニャル様は最近まで";
		mes "力を使わず眠っていたのよ。";
		next;
		mes "[オーレリー]";
		mes "ニャル様が力を使えば";
		mes "ラスガンドは、その魔力を吸収して……。";
		mes "巨大な存在として";
		mes "生まれ変わってしまう可能性がある。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "恐らく、ニャル様はこれ以上";
		mes "力を使うことはないでしょう。";
		mes "自ら進んで敵に";
		mes "餌を与えるわけにはいきませんから。";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "話の途中にすまないけど";
		mes "ひとつ確認したいことがあるの。";
		next;
		mes "[ヴォークリンデ]";
		mes "その……ヨルムンガンド？";
		mes "ニャル様と言っていたけど……";
		mes "その猫は、ゲオルグ家にかけられた";
		mes "呪いを解くことはできるの？";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[レオン]";
		mes "その可能性は、低いでしょう。";
		mes "あの呪いは、ヨルムンガンド教団が";
		mes "主体となっています。";
		mes "むしろ、ラスガンドの方と";
		mes "繋がりが深いかもしれません。";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "……仮にラスガンドが";
		mes "呪いの主体であるなら";
		mes "あの者を倒せば";
		mes "呪いが消えるかもしれない？";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "……倒せれば、ね。";
		mes "ニャル様は、今のままでは";
		mes "ラスガンドには敵わないと判断して";
		mes "逃がしてくれたんじゃないのかい？";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "とはいえ、ラスガンドが";
		mes "これ以上魔力を吸収すれば";
		mes "ますます太刀打ちできなくなります。";
		mes "何か方法を考えないと。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "同感ね。";
		mes "ここからは、時間との勝負かも……。";
		next;
		menu "他のみんなが戻ってこないですね",-;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "だな？";
		mes "本当にみんなバラバラの場所に";
		mes "転送させられちゃったのかも？";
		next;
		cloakoffnpc "マラム#ep20_end01";
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "今戻りました！";
		mes "ここに集まっておられると聞いて。";
		mes "到着が遅れてしまって";
		mes "申し訳ありません。";
		next;
		menu "マラム、ひとり？",-;
		mes "[マラム]";
		mes "それが……";
		mes "私とミリアムとレハールさんは";
		mes "ルガンの洞窟の";
		mes "入口に転送されたんです。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "レハールさんが言うには";
		mes "ニャル様が洞窟の入り口に送ったのには";
		mes "意味があるのだろうと。";
		next;
		mes "[マラム]";
		mes "せっかくだから";
		mes "バゴットの研究室を調べると";
		mes "レハールさんとミリアムは";
		mes "洞窟に入っていきました。";
		next;
		mes "[マラム]";
		mes "私は、そのことを知らせるために";
		mes "戻って来たというわけです。";
		next;
		cutin "ep19_vellgunde01.png", 1;
		mes "[ヴェルグンデ]";
		mes "危ない目に遭ったばかりなのに";
		mes "まったく、あの子は……。";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "なかなか根性あるじゃないか。";
		mes "でも、どうするの？";
		mes "ラスガンドの動きも";
		mes "活発になっているみたいだし？";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "レハールたちには";
		mes "増援が必要ってことだな。";
		mes "大丈夫大丈夫！";
		mes "ここに潜入の達人がいるから！";
		mes "あ、私のことじゃないぞ？";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[ヴェルグンデ]";
		mes "……レハールのことは";
		mes "冒険者に任せるのが良さそうね。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "私とオーレリーは";
		mes "流氷地帯に戻ります。";
		mes "ラスガンドの目的がニャル様なら";
		mes "あの場所を警戒しておかないと。";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "冒険者はレハールを探しに行くついでに";
		mes "ルガンやラスガンドの動きも";
		mes "探って来てくれる？";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "ヴェルグンデ様は";
		mes "魔力資料の整理をお願いします。";
		mes "ヴォークリンデ様は";
		mes "私たちと共に流氷地帯へ行きましょう。";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "冒険者さん。";
		mes "うちの甥っ子を頼むよ。";
		mes "くれぐれも無理はしないでね。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "ミリアムが蛇神の根源の入口側に";
		mes "「標識」を残しているはずです。";
		mes "レハールさんとミリアムを探す際は";
		mes "それを目印にしてください！";
		next;
		cutin "ep19_leizi01.png", 255;
		cloakonnpc "オーレリー#ep20_end01";
		cloakonnpc "ヴォークリンデ#ep20_end";
		cloakonnpc "ヴェルグンデ#ep20_end01";
		cloakonnpc "レイジー#ep20_end02";
		chgquest 131258,18221;
		set EP20_1QUE,68;
		mes "‐蛇神の根源 01へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐蛇神の根源 01へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 32, 70;
		end;
	}
	if(EP20_1QUE == 68) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "私とオーレリーは";
		mes "ヴォークリンデ様と共に";
		mes "流氷地帯に向かいます。";
		mes "お互い気をつけましょう。";
		next;
		cutin "ep19_leon01.png", 255;
		mes "‐蛇神の根源 01へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐蛇神の根源 01へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 32, 70;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 67 || EP20_1QUE == 68)
		showevent 0, 1, "レオン#ep20_end01";
	end;
}
icas_in.gat,113,228,3	script(CLOAKED)	オーレリー#ep20_end01	10465,{/* 3597 (cloaking)*/}
icas_in.gat,115,227,3	script(CLOAKED)	レイジー#ep20_end02	10454,{/* 3598 (cloaking)*/}
icas_in.gat,108,228,5	script(CLOAKED)	ヴォークリンデ#ep20_end	10467,{/* 3599 (cloaking)*/}
icas_in.gat,108,225,6	script(CLOAKED)	ヴェルグンデ#ep20_end01	10468,{/* 3600 (cloaking)*/}
icas_in.gat,115,223,1	script(CLOAKED)	マラム#ep20_end01	10376,{/* 3601 (cloaking)*/}

jor_root1.gat,32,75,3	script	標識#ep20_end01	10429,{/* 3601 */
	if(EP20_1QUE == 68 || EP20_1QUE == 69) {
		unittalk "ミリアムの声 : こっちです！",1;
		if(!sleep2(1000)) end;
		warp "jor_safty2.gat", 70, 249;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 68 || EP20_1QUE == 69)
		showevent 0, 1, "標識#ep20_end01";
	end;
}
jor_safty2.gat,66,245,0	warp	safty2_out	1,1,jor_root1.gat,32,70
jor_safty2.gat,75,258,0	script	#ep20_part_end_evt3	139,9,9,{/* 3604 */
	if(EP20_1QUE == 68 || EP20_1QUE == 69) {
		cloakoffnpc "レハール#ep20_end01";
		cloakoffnpc "ミリアム#ep20_end01";
	}
	end;
}
jor_safty2.gat,79,257,3	script(CLOAKED)	ミリアム#ep20_end01	10377,{/* 3605 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[ミリアム]";
	mes "奪われたユミルの心臓の欠片を";
	mes "見つけたくて……";
	mes "バゴットが持っているはずですよね。";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_safty2.gat,75,258,5	script(CLOAKED)	レハール#ep20_end01	10469,{/* 3606 (cloaking)*/
	if(EP20_1QUE == 68) {
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "冒険者様も来てくださったのですね！";
		mes "何とかバゴットの研究室を調査したくて";
		mes "ここに潜入したのですが……";
		mes "その研究室の場所がわからなくて";
		mes "困っているんです。";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[レハール]";
		mes "以前、逃げ出した時は";
		mes "ニャル様の後について逃げ出したので";
		mes "正確な位置を思い出せなくて……。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "冒険者さんは";
		mes "バゴットの研究室の位置を";
		mes "覚えていますか？";
		next;
		menu "正確には覚えてないです",-;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "では見覚えのある場所に出るまで";
		mes "見て回るしかなさそうですね。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "まだ確認していない場所を";
		mes "手分けして探しましょう。";
		next;
		mes "[レハール]";
		mes "怪しいと思われる場所に";
		mes "「標識」を残して来ました。";
		mes "冒険者様は、蛇神の根源 01にある";
		mes "標識のある場所を確認してください。";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[レハール]";
		mes "私達は、2階を調べてみます。";
		mes "調査が終わったら";
		mes "蛇神の根源 聖域で合流しましょう。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "蛇神の根源 聖域の様子も";
		mes "確認したいからね。";
		mes "では、よろしくお願いします。";
		next;
		cutin "ep19_lehar01.png", 255;
		chgquest 18221,18222;
		set EP20_1QUE,69;
		mes "‐標識のある場所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐標識のある場所へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 30, 145;
		end;
	}
	if(EP20_1QUE == 69) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "怪しいと思われる場所に";
		mes "「標識」を残して来ました。";
		mes "冒険者様は、蛇神の根源 01にある";
		mes "標識のある場所を確認してください。";
		next;
		mes "[レハール]";
		mes "調査が終わったら";
		mes "蛇神の根源 聖域で合流しましょう。";
		mes "呪術師には気を付けてくださいね。";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "‐標識のある場所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐標識のある場所へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 30, 145;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 68 || EP20_1QUE == 69)
		showevent 0, 1, "レハール#ep20_end01";
	end;
}

jor_root1.gat,25,145,0	script	#ep20_p4_sw_1	139,9,9,{/* 3607 */
	if(EP20_1QUE == 69 || EP20_1QUE == 70)
		cloakoffnpc "標識#ep20_check01-1";
	end;
}
jor_root1.gat,25,145,3	script(CLOAKED)	標識#ep20_check01-1	10432,{/* 3608 (cloaking)*/
	if(EP20_1QUE == 69) {
		progressbar 1;	//color=0x0d4dff
		mes "‐標識の周囲を調べてみるが";
		mes "　バゴットの研究室に";
		mes "　通じる道ではなさそうだ。";
		mes "　他の標識がある場所を調べてみよう‐";
		next;
		chgquest 18222,18223;
		set EP20_1QUE,70;
		mes "‐次の標識へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次の標識へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 22, 194;
		end;
	}
	if(EP20_1QUE == 70) {
		mes "‐標識の周囲を調べてみるが";
		mes "　バゴットの研究室に";
		mes "　通じる道ではなさそうだ。";
		mes "　他の標識がある場所を調べてみよう‐";
		next;
		mes "‐次の標識へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の標識へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 22, 194;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 69 || EP20_1QUE == 70)
		showevent 0, 1, "標識#ep20_check01-1";
	end;
}
jor_root1.gat,17,194,0	script	#ep20_p4_sw_2	139,9,9,{/* 3609 */
	if(EP20_1QUE == 70 || EP20_1QUE == 71)
		cloakoffnpc "標識#ep20_check02-1";
	end;
}
jor_root1.gat,17,194,3	script(CLOAKED)	標識#ep20_check02-1	10432,{/* 3610 (cloaking)*/
	if(EP20_1QUE == 70) {
		progressbar 1;	//color=0x0d4dff
		mes "‐標識の周囲を調べてみるが";
		mes "　バゴットの研究室に";
		mes "　通じる道ではなさそうだ。";
		mes "　他の標識がある場所を調べてみよう‐";
		next;
		chgquest 18223,18224;
		set EP20_1QUE,71;
		mes "‐次の標識へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次の標識へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 278, 69;
		end;
	}
	if(EP20_1QUE == 71) {
		mes "‐標識の周囲を調べてみるが";
		mes "　バゴットの研究室に";
		mes "　通じる道ではなさそうだ。";
		mes "　他の標識がある場所を調べてみよう‐";
		next;
		mes "‐次の標識へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次の標識へ";
		mes "　向かった‐";
		close2;
		warp "jor_root1.gat", 278, 69;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 70 || EP20_1QUE == 71)
		showevent 0, 1, "標識#ep20_check02-1";
	end;
}
jor_root1.gat,278,74,0	script	#ep20_p4_sw_3	139,9,9,{/* 3611 */
	if(EP20_1QUE == 71 || EP20_1QUE == 72)
		cloakoffnpc "標識#ep20_check03-1";
	end;
}
jor_root1.gat,278,74,3	script(CLOAKED)	標識#ep20_check03-1	10432,{/* 3612 (cloaking)*/
	if(EP20_1QUE == 71) {
		progressbar 1;	//color=0x0d4dff
		mes "‐標識の周囲を調べてみるが";
		mes "　バゴットの研究室に";
		mes "　通じる道ではなさそうだ。";
		mes "　標識のある場所を全部調べたので";
		mes "　蛇神の根源 聖域に行って";
		mes "　レハールたちと合流しよう‐";
		next;
		chgquest 18224,18225;
		set EP20_1QUE,72;
		mes "‐蛇神の根源 聖域へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐蛇神の根源 聖域へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 133, 81;
		end;
	}
	if(EP20_1QUE == 72) {
		mes "‐標識の周囲を調べてみるが";
		mes "　バゴットの研究室に";
		mes "　通じる道ではなさそうだ。";
		mes "　蛇神の根源 聖域に行って";
		mes "　レハールたちと合流しよう‐";
		next;
		mes "‐蛇神の根源 聖域へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐蛇神の根源 聖域へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 133, 81;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 71 || EP20_1QUE == 72)
		showevent 0, 1, "標識#ep20_check03-1";
	end;
}
jor_sanct.gat,133,86,0	script	#ep20_p4_sw_4	139,9,9,{/* 3612 */
	if(EP20_1QUE == 72 || EP20_1QUE == 73)
		cloakoffnpc "標識#ep20_end04";
	end;
}
jor_sanct.gat,133,86,3	script(CLOAKED)	標識#ep20_end04	10429,{/* 3613 (cloaking)*/
	if(EP20_1QUE == 72) {
		unittalk getcharid(3),strcharinfo(0)+" : ……レハール？",1;
		if(!sleep2(2000)) end;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "こちらです。";
		mes "どうですか、バゴットの研究室は";
		mes "見つかりましたか？";
		next;
		menu "見つからなかった",-;
		mes "[レハール]";
		mes "こちらも残念ながら……";
		mes "ニャル様に道案内を頼めたら";
		mes "楽なんですけど……。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "冒険者さんの話によれば";
		mes "ラスガンドがニャル様を";
		mes "狙っているらしいから";
		mes "それは難しいでしょうね。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "そうでした……";
		mes "このまま引き下がるしかないのかなぁ。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ユミルの心臓の欠片の行方だけでも";
		mes "知りたかったけど……。";
		next;
		menu "ルガンたちの動向を調べてみる",-;
		mes "[ミリアム]";
		mes "うん、たしかに。";
		mes "もしかしたら、バゴットの居場所が";
		mes "わかるかもしれない。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "ラスガンドの動向も調べましょう。";
		mes "少々危険ですが";
		mes "手ぶらで帰るわけにはいきませんから！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "私は、東側を調べてみます。";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "なら私は西側を調べますね。";
		mes "冒険者様は中央広場の動向を";
		mes "確認してください。";
		next;
		cutin "ep19_lehar01.png", 255;
		cutin "ep18_miriam_01.png", 255;
		chgquest 18225,18227;
		set EP20_1QUE,73;
		mes "‐中央広場へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐中央広場へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 150, 202;
		end;
	}
	if(EP20_1QUE == 73) {
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "冒険者様は中央広場の動向を";
		mes "確認してください。";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "‐中央広場へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐中央広場へ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 150, 202;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 72 || EP20_1QUE == 73)
		showevent 0, 1, "標識#ep20_end04";
	end;
}
jor_sanct.gat,150,207,0	script	#ep20_p4_sw_5	139,9,9,{/* 3614 */
	if(EP20_1QUE == 73)
		cloakoffnpc "主教#ep20_end01";
	end;
}
jor_sanct.gat,150,207,3	script(CLOAKED)	主教#ep20_end01	10473,{/* 3615 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[主教]";
		mes "ここは神聖なる場所！";
		mes "汚らわしい存在は出ていけ！";
		close;
	}
	if(EP20_1QUE == 73) {
		mes "[主教]";
		mes "お前も、こちらに来るのだ。";
		mes "いまこそ我が教団の大業が";
		mes "成し遂げられる時……。";
		next;
		menu "大業とは？",-,"神聖な生贄でも見付かりましたか？",-;
		mes "[主教]";
		mes "白くて神聖なる存在！";
		mes "純粋なヨルムンガンド様の";
		mes "再臨のための存在……。";
		next;
		mes "[主教]";
		mes "それを手に入れる為";
		mes "ラスガンド様がいらっしゃった。";
		mes "我々は魔力を捧げる為に";
		mes "こうして集まったのだ。";
		next;
		mes "[主教]";
		mes "ラスガンド様が";
		mes "新しい力を手に入れた暁には";
		mes "私たちは祈りを基に";
		mes "根源と一つになるであろう……。";
		next;
		menu "新しい力とは？",-;
		mes "[主教]";
		mes "お前は迷路の奥で";
		mes "ずっと労働ばかりしていたようだな。";
		mes "ここに来て魔力を捧げて祈るのだ。";
		mes "バゴットという人間が持ってきた神物が";
		mes "いよいよラスガンド様の力と成った！";
		next;
		mes "[主教]";
		mes "我々ルガンは、一つから起源され";
		mes "一つに結ばれた存在！";
		mes "ラスガンド様の意思が";
		mes "私たちの意思であり、神の意思である。";
		next;
		mes "[主教]";
		mes "真の力を持つ方が、殻を破る日！";
		mes "冷たい氷の牢獄から逃れ";
		mes "新たな世界へと旅立つ時！";
		next;
		misceffect 563,"",1;
		mes "[治療師]";
		mes "到来！　到来！";
		mes "大陸に死を！";
		cloakoffnpc "主教#ep20_end04";
		cloakoffnpc "主教#ep20_end05";
		cloakoffnpc "司祭#ep20_end06";
		unittalk getnpcid(0,"主教#ep20_end04"),"到来！到来！",1;
		unittalk getnpcid(0,"主教#ep20_end05"),"到来！到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end06"),"到来！到来！",1;
		next;
		misceffect 563,"",1;
		mes "[主教]";
		mes "降神再臨！　万物仰伏！";
		mes "降神再臨！　万物仰伏！";
		cloakoffnpc "司祭#ep20_end07";
		cloakoffnpc "教団呪術師#ep20_end08";
		cloakoffnpc "教団治療師#ep20_end09";
		unittalk getnpcid(0,"司祭#ep20_end07"),"到来！　到来！　万物仰伏！",1;
		unittalk getnpcid(0,"教団呪術師#ep20_end08"),"到来！　到来！　万物仰伏！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end09"),"到来！　到来！　万物仰伏！",1;
		unittalk getnpcid(0,"主教#ep20_end04"),"到来！　到来！　万物仰伏！",1;
		unittalk getnpcid(0,"主教#ep20_end05"),"到来！　到来！　万物仰伏！",1;
		unittalk getnpcid(0,"司祭#ep20_end06"),"到来！　到来！　万物仰伏！",1;
		next;
		misceffect 563,"",1;
		mes "[司祭]";
		mes "渡海！　渡海！";
		mes "我らの神による新世界を！";
		cloakoffnpc "教団守護者#ep20_end10";
		cloakoffnpc "聖地呪術師#ep20_end11";
		cloakoffnpc "主教#ep20_end12";
		cloakoffnpc "主教#ep20_end13";
		unittalk getnpcid(0,"教団守護者#ep20_end10"),"海の向こうの大陸に死を！　新世界を！",1;
		unittalk getnpcid(0,"聖地呪術師#ep20_end11"),"海の向こうの大陸に死を！　新世界を！",1;
		unittalk getnpcid(0,"主教#ep20_end12"),"大陸に死を！　新世界を！",1;
		unittalk getnpcid(0,"主教#ep20_end13"),"大陸に死を！　新世界を！",1;
		unittalk getnpcid(0,"主教#ep20_end04"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end05"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end06"),"渡海！　渡海！",1;
		unittalk getnpcid(0,"司祭#ep20_end07"),"渡海！　渡海！　万物仰伏！",1;
		unittalk getnpcid(0,"教団呪術師#ep20_end08"),"到来！　到来！　万物仰伏！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end09"),"到来！　到来！　万物仰伏！",1;
		close2;
		misceffect 970,"",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "治療師#ep20_end02";
		unittalk getnpcid(0,"主教#ep20_end01"),"来た。",1;
		unittalk getnpcid(0,"治療師#ep20_end02"),"来た。",1;
		unittalk getnpcid(0,"司祭#ep20_end03"),"来た。",1;
		unittalk getnpcid(0,"主教#ep20_end04"),"来た。",1;
		unittalk getnpcid(0,"主教#ep20_end05"),"来た。",1;
		unittalk getnpcid(0,"司祭#ep20_end06"),"来た。",1;
		unittalk getnpcid(0,"司祭#ep20_end07"),"来た。",1;
		if(!sleep2(200)) end;
		unittalk getnpcid(0,"教団呪術師#ep20_end08"),"我らの神！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end09"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団守護者#ep20_end10"),"再臨！",1;
		unittalk getnpcid(0,"聖地呪術師#ep20_end11"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end12"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end13"),"到来！　到来！",1;
		if(!sleep2(200)) end;
		misceffect 563,"",1;
		cloakoffnpc "教団呪術師#ep20_end14";
		cloakoffnpc "教団治療師#ep20_end15";
		cloakoffnpc "教団治療師#ep20_end16";
		if(!sleep2(200)) end;
		unittalk getnpcid(0,"教団呪術師#ep20_end14"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end15"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end16"),"到来！　到来！",1;
		if(!sleep2(200)) end;
		misceffect 970,"",1;
		cloakoffnpc "司祭#ep20_end17";
		cloakoffnpc "司祭#ep20_end18";
		cloakoffnpc "司祭#ep20_end19";
		cloakoffnpc "司祭#ep20_end20";
		unittalk getnpcid(0,"司祭#ep20_end17"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end18"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end19"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end20"),"到来！　到来！",1;
		if(!sleep2(1000)) end;
		misceffect 970,"",1;
		unittalk getnpcid(0,"主教#ep20_end01"),"到来！　到来！",1;
		unittalk getnpcid(0,"治療師#ep20_end02"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end03"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end04"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end05"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end06"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end07"),"到来！　到来！",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"教団呪術師#ep20_end08"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end09"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団守護者#ep20_end10"),"到来！　到来！",1;
		unittalk getnpcid(0,"聖地呪術師#ep20_end11"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end12"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end13"),"到来！　到来！",1;
		if(!sleep2(1000)) end;
		misceffect 970,"",1;
		unittalk getnpcid(0,"教団呪術師#ep20_end14"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end15"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end16"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end17"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end18"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end19"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end20"),"到来！　到来！",1;
		if(!sleep2(1000)) end;
		misceffect 970,"",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"主教#ep20_end01"),"来た！",1;
		unittalk getnpcid(0,"治療師#ep20_end02"),"来た！",1;
		unittalk getnpcid(0,"司祭#ep20_end03"),"来た！",1;
		unittalk getnpcid(0,"主教#ep20_end04"),"来た！",1;
		unittalk getnpcid(0,"主教#ep20_end05"),"来た！",1;
		unittalk getnpcid(0,"司祭#ep20_end06"),"来た！",1;
		unittalk getnpcid(0,"司祭#ep20_end07"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団呪術師#ep20_end08"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end09"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団守護者#ep20_end10"),"到来！　到来！",1;
		unittalk getnpcid(0,"聖地呪術師#ep20_end11"),"到来！　到来！",1;
		unittalk getnpcid(0,"主教#ep20_end12"),"到来！到来！",1;
		unittalk getnpcid(0,"主教#ep20_end13"),"到来！到来！",1;
		unittalk getnpcid(0,"教団呪術師#ep20_end14"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end15"),"到来！　到来！",1;
		unittalk getnpcid(0,"教団治療師#ep20_end16"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end17"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end18"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end19"),"到来！　到来！",1;
		unittalk getnpcid(0,"司祭#ep20_end20"),"到来！　到来！",1;
		if(!sleep2(1000)) end;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "冒険者様！";
		mes "いったい何の騒ぎですか？";
		mes "全員……まともじゃない！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "まるで熱に浮かされたように……！";
		mes "いったん、ここを離れた方が……。";
		next;
		cutin "ep19_lehar01.png", 255;
		misceffect 970,"",1;
		if(!sleep2(200)) end;
		misceffect 563,"",1;
		if(!sleep2(200)) end;
		cutin "ep20_nyar02.png", 1;
		mes "[ニャル]";
		mes "ウヴェルッ！！";
		unittalk getnpcid(0,"主教#ep20_end01"),"神聖な生贄！",1;
		unittalk getnpcid(0,"治療師#ep20_end02"),"神聖な生贄！",1;
		unittalk getnpcid(0,"司祭#ep20_end03"),"神聖な生贄！",1;
		unittalk getnpcid(0,"主教#ep20_end04"),"神聖な生贄！",1;
		unittalk getnpcid(0,"主教#ep20_end05"),"神聖な生贄！",1;
		unittalk getnpcid(0,"司祭#ep20_end06"),"神聖な生贄！",1;
		close2;
		cutin "ep20_nyar02.png", 255;
		misceffect 885,"",1;
		cloakonnpc "主教#ep20_end01";
		cloakonnpc "治療師#ep20_end02";
		cloakonnpc "司祭#ep20_end03";
		cloakonnpc "主教#ep20_end04";
		cloakonnpc "主教#ep20_end05";
		cloakonnpc "司祭#ep20_end06";
		cloakonnpc "司祭#ep20_end07";
		cloakonnpc "教団呪術師#ep20_end08";
		cloakonnpc "教団治療師#ep20_end09";
		cloakonnpc "教団守護者#ep20_end10";
		cloakonnpc "聖地呪術師#ep20_end11";
		cloakonnpc "主教#ep20_end12";
		cloakonnpc "主教#ep20_end13";
		cloakonnpc "教団呪術師#ep20_end14";
		cloakonnpc "教団治療師#ep20_end15";
		cloakonnpc "教団治療師#ep20_end16";
		cloakonnpc "司祭#ep20_end17";
		cloakonnpc "司祭#ep20_end18";
		cloakonnpc "司祭#ep20_end19";
		cloakonnpc "司祭#ep20_end20";
		chgquest 18227,18228;
		set EP20_1QUE,74;
		warp "jor_twig.gat", 192, 193;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 73)
		showevent 0, 1, "主教#ep20_end01";
	end;
}
jor_sanct.gat,147,207,6	script(CLOAKED)	治療師#ep20_end02	21986,{/* 3616 (cloaking)*/}
jor_sanct.gat,156,205,1	script(CLOAKED)	司祭#ep20_end03	10470,{/* 3617 (cloaking)*/}
jor_sanct.gat,147,203,7	script(CLOAKED)	主教#ep20_end04	10474,{/* 3618 (cloaking)*/}
jor_sanct.gat,151,201,1	script(CLOAKED)	主教#ep20_end05	10475,{/* 3619 (cloaking)*/}
jor_sanct.gat,155,202,1	script(CLOAKED)	司祭#ep20_end06	10471,{/* 3620 (cloaking)*/}
jor_sanct.gat,143,205,5	script(CLOAKED)	司祭#ep20_end07	10472,{/* 3621 (cloaking)*/}
jor_sanct.gat,144,202,7	script(CLOAKED)	教団呪術師#ep20_end08	21985,{/* 3622 (cloaking)*/}
jor_sanct.gat,157,209,3	script(CLOAKED)	教団治療師#ep20_end09	21986,{/* 3623 (cloaking)*/}
jor_sanct.gat,140,202,3	script(CLOAKED)	教団守護者#ep20_end10	21989,{/* 3624 (cloaking)*/}
jor_sanct.gat,143,201,3	script(CLOAKED)	聖地呪術師#ep20_end11	21985,{/* 3625 (cloaking)*/}
jor_sanct.gat,146,197,3	script(CLOAKED)	主教#ep20_end12	10473,{/* 3626 (cloaking)*/}
jor_sanct.gat,150,197,1	script(CLOAKED)	主教#ep20_end13	10474,{/* 3627 (cloaking)*/}
jor_sanct.gat,154,198,1	script(CLOAKED)	教団呪術師#ep20_end14	21987,{/* 3628 (cloaking)*/}
jor_sanct.gat,159,200,1	script(CLOAKED)	教団治療師#ep20_end15	21986,{/* 3629 (cloaking)*/}
jor_sanct.gat,142,209,4	script(CLOAKED)	教団治療師#ep20_end16	21988,{/* 3630 (cloaking)*/}
jor_sanct.gat,158,203,2	script(CLOAKED)	司祭#ep20_end17	10470,{/* 3631 (cloaking)*/}
jor_sanct.gat,148,200,6	script(CLOAKED)	司祭#ep20_end18	10471,{/* 3632 (cloaking)*/}
jor_sanct.gat,141,209,4	script(CLOAKED)	司祭#ep20_end19	10472,{/* 3633 (cloaking)*/}
jor_sanct.gat,154,208,3	script(CLOAKED)	司祭#ep20_end20	10470,{/* 3634 (cloaking)*/}
jor_twig.gat,187,198,0	script	#ep20_p4_sw_6	139,9,9,{/* 3636 */
	//if(EP20_1QUE == 74 || EP20_1QUE == 75)
	//	cloakoffnpc "ニャル#ep20end_nyar01";
	//end;
}
jor_twig.gat,187,198,5	script	ニャル#ep20end_nyar01	22006,{/* 3637 */
	if(EP20_1QUE == 74) {
		menu "ニャル…？",-;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "うう……ここは……？";
		mes "私達はさっきまで";
		mes "奴らの本拠地で怪しげな儀式を";
		mes "見ていたはずですが。";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "あれはいったい";
		mes "何をしていたんだろう……？";
		mes "良くない予感が……。";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[ニャル]";
		mes "グルッ、ウルェエッ！！";
		next;
		misceffect 563,"",1;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "揺れてる!?";
		mes "じ、地震でしょうか？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "地震ではないです！";
		mes "何か巨大な力の衝突を感じます！";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[ニャル]";
		mes "ウェウッ！！　ミャアァッ！！";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "ニャル様が私たちを連れ出したのと";
		mes "関係があるみたいです。";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "ニャル様に案内してもらいましょう！";
		mes "早く！";
		next;
		cutin "ep19_lehar05.png", 255;
		chgquest 18228,18229;
		set EP20_1QUE,75;
		mes "‐ニャルの呼ぶ方へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐ニャルの呼ぶ方へ";
		mes "　向かった‐";
		close2;
		warp "jor_twig.gat", 182, 118;
		end;
	}
	if(EP20_1QUE == 75) {
		cutin "ep20_nyar02.png", 1;
		mes "[ニャル]";
		mes "ウェウッ！！　ミャアァッ！！";
		next;
		cutin "ep20_nyar02.png", 255;
		mes "‐ニャルの呼ぶ方へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ニャルの呼ぶ方へ";
		mes "　向かった‐";
		close2;
		warp "jor_twig.gat", 182, 118;
		end;
	}
	unittalk "ニャル : ミャォン",1;
	end;
OnQuestInfo:
	if(EP20_1QUE == 74 || EP20_1QUE == 75)
		showevent 0, 1, "ニャル#ep20end_nyar01";
	end;
}
jor_twig.gat,180,123,0	script	#ep20_p4_sw_7	139,9,9,{/* 3638 */
	if(EP20_1QUE == 75 || EP20_1QUE == 76)
		cloakoffnpc "ニャル#ep20end_nyar02";
	end;
}
jor_twig.gat,180,123,1	script(CLOAKED)	ニャル#ep20end_nyar02	22006,{/* 3639 (cloaking)*/
	if(EP20_1QUE == 75) {
		unittalk "ニャル : ウェオォッ！　ウェオッ！",1;
		if(!sleep2(500)) end;
		cloakoffnpc "レハール#ep20_end02";
		cloakoffnpc "ミリアム#ep20_end02";
		if(!sleep2(500)) end;
		cutin "ep19_lehar01.png", 2;
		mes "[レハール]";
		mes "……ニャル様？";
		mes "急に止まりましたね。";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "誰か、この先にいるみたい。";
		close2;
		cutin "ep20_nyar02.png", 255;
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"ニャル#ep20end_nyar02"),"ニャル : ウェオオオン！　ウォオン！",1;
		misceffect 563,"",1;
		cloakoffnpc "バゴット#ep20_end01";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"バゴット#ep20_end01"),"バゴット : ちょっと！　この猫はなにっ！　なんで猫だらけ～!?",1;
		unittalk getnpcid(0,"ニャル#ep20end_nyar02"),"ニャル : ヒャアアッ！　ヒャッ!!",1;
		if(!sleep2(500)) end;
		misceffect 897,"バゴット#ep20_end01",1;
		cloakoffnpc "ヴォークリンデ#ep20_end";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"バゴット#ep20_end01"),"バゴット : うっ？　なんですか、これはぁぁ？",1;
		misceffect 899,"バゴット#ep20_end01",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"ヴォークリンデ#ep20_end"),"ヴォークリンデ : ようやく拘束できた。　もう諦めな。",1;
		if(!sleep2(1500)) end;
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "ヴォークリンデ様と";
		mes "バゴットです！";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[レハール]";
		mes "なんでバゴットがここに!?";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "冒険者にレハールか！";
		mes "こいつを縛るのを手伝ってちょうだい。";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[バゴット]";
		mes "ア～ハハハハハッ！";
		mes "今ごろバゴットを捕まえたって";
		mes "無意味～～ぃ！";
		mes "これからが始まりだからなぁ～！";
		next;
		menu "どういうこと？",-;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "ラヘルから奪って来た";
		mes "ユミルの心臓の欠片を";
		mes "ラスガンドが利用しているらしい。";
		mes "こいつの研究の成果なんだってさ。";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[バゴット]";
		mes "ククククッ!!";
		mes "バゴットは失敗しなかったんですよ？";
		mes "傑作を作り上げましたぁ！";
		mes "その瞬間を目撃したからには";
		mes "もはや悔いはありませぇぇ～ん。";
		next;
		mes "[バゴット]";
		mes "お前たちはぁ！";
		mes "新しい神を迎える準備をしなさぁい！";
		mes "バゴットが創り出した神のぉぉ！";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "時間がない！";
		mes "オーレリー様とレオン様は";
		mes "力を手に入れたラスガンドを";
		mes "阻止している最中だ！";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[ミリアム]";
		mes "ボクはヴォークリンデ様を手伝います。";
		mes "バゴットにも聞きたいことがあります！";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "レハール、お前も手伝いな！";
		mes "怪しい魔道具を使うから";
		mes "目を離さないように！";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "冒険者は巣の中心に行って！";
		mes "オーレリー様とレオン様には";
		mes "支援が必要だ！";
		mes "あんたに任せる以外にないよ！";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[ニャル]";
		mes "エオン！　エオン！";
		next;
		cutin "ep20_nyar03.png", 255;
		cloakonnpc "バゴット#ep20_end01";
		cloakonnpc "ヴォークリンデ#ep20_end";
		chgquest 18229,18230;
		set EP20_1QUE,76;
		mes "‐巣の中心へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐巣の中心へ";
		mes "　向かった‐";
		close2;
		warp "jor_twig.gat", 147, 153;
		end;
	}
	if(EP20_1QUE == 76) {
		cutin "ep20_nyar03.png", 1;
		mes "[ニャル]";
		mes "エオン！　エオン！";
		next;
		mes "‐巣の中心へ急ごう‐";
		cutin "ep20_nyar03.png", 255;
		next;
		mes "‐巣の中心へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐巣の中心へ";
		mes "　向かった‐";
		close2;
		warp "jor_twig.gat", 147, 153;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 75 || EP20_1QUE == 76)
		showevent 0, 1, "ニャル#ep20end_nyar02";
	end;
}
jor_twig.gat,179,120,7	script(CLOAKED)	レハール#ep20_end02	10469,{/* 3640 (cloaking)*/}
jor_twig.gat,184,121,1	script(CLOAKED)	ミリアム#ep20_end02	10377,{/* 3641 (cloaking)*/}
jor_twig.gat,178,126,3	script(CLOAKED)	バゴット#ep20_end01	10386,{/* 3642 (cloaking)*/}
jor_twig.gat,176,129,3	script(CLOAKED)	ヴォークリンデ#ep20_end	10467,{/* 3643 (cloaking)*/}

jor_twig.gat,142,153,0	script	#ep20_p4_sw_8	139,14,14,{/* 3644 */
	if(EP20_1QUE == 76) {
		cloakoffnpc "ニャル#ep20end_nyar03";
		cloakoffnpc "オーレリー#ep20_end02";
		cloakoffnpc "レオン#ep20_end02";
		cloakoffnpc "ラスガンド#ep20end_las0";
	}
	if(EP20_1QUE == 77 || EP20_1QUE == 78) {
		cloakoffnpc "ニャル#ep20end_nyar03";
		cloakoffnpc "オーレリー#ep20_end02";
		cloakoffnpc "レオン#ep20_end02";
	}
	if(EP20_1QUE >= 79) {
		cloakoffnpc "ニャル#ep20end_nyar03";
		cloakoffnpc "オーレリー#ep20_end02";
		cloakoffnpc "レオン#ep20_end02";
		cloakoffnpc "分離された聖域#ep20_md0";
	}
	end;
}
jor_twig.gat,142,153,1	script(CLOAKED)	ニャル#ep20end_nyar03	22006,{/* 3645 (cloaking)*/
	if(EP20_1QUE == 76) {
		cloakoffnpc "オーレリー#ep20_end02";
		cloakoffnpc "レオン#ep20_end02";
		cloakoffnpc "ラスガンド#ep20end_las0";
		unittalk getnpcid(0,"ニャル#ep20end_nyar03"),"ニャル : ハアァッ！",1;
		if(!sleep2(500)) end;
		misceffect 563,"ラスガンド#ep20end_las0",1;
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"ラスガンド#ep20end_las0"),"ラスガンド : ……その程度か？　大人しく私の餌になれ……。",1;
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"オーレリー#ep20_end02"),"オーレリー : ニャル様..!",1;
		unittalk getnpcid(0,"レオン#ep20_end02"),"レオン : もっと力を！",1;
		if(!sleep2(1000)) end;
		misceffect 899,"ラスガンド#ep20end_las0",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"ラスガンド#ep20end_las0"),"ラスガンド : 無駄な足掻きを……。",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"ニャル#ep20end_nyar03"),"ニャル : キャオォン！",1;
		if(!sleep2(1000)) end;
		misceffect 897,"ラスガンド#ep20end_las0",1;
		unittalk getnpcid(0,"ラスガンド#ep20end_las0"),"ラスガンド : 愚か者め。この力……全て吸収してくれるわ！",1;
		unittalk getnpcid(0,"ニャル#ep20end_nyar03"),"ニャル : キャオォン！",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "ニャルの分身#ep20end_ny";
		if(!sleep2(1000)) end;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		misceffect 57,"ニャルの分身#ep20end_ny",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"ラスガンド#ep20end_las0"),"ラスガンド : これは……何のつもりだ？",1;
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,"ラスガンド#ep20end_las0"),"ラスガンド : 無駄な足掻きと言っているっ!!",1;
		if(!sleep2(500)) end;
		misceffect 899,"ラスガンド#ep20end_las0",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		unittalk getnpcid(0,"ニャルの分身#ep20end_ny"),"ニヤァオン～！",1;
		if(!sleep2(1000)) end;
		misceffect 898,"ラスガンド#ep20end_las0",1;
		misceffect 899,"ラスガンド#ep20end_las0",1;
		if(!sleep2(1000)) end;
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ニャルの分身#ep20end_ny";
		cloakonnpc "ラスガンド#ep20end_las0";
		chgquest 18230,18231;
		set EP20_1QUE,77;
		end;
	}
	if(EP20_1QUE == 77) {
		unittalk getnpcid(0,"ニャル#ep20end_nyar03"),"ニャル : ニャオオォォォー",1;
		cloakoffnpc "レオン#ep20_end02";
		cloakoffnpc "オーレリー#ep20_end02";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"レオン#ep20_end02"),"レオン : どうされましたか？",1;
		unittalk getnpcid(0,"オーレリー#ep20_end02"),"オーレリー : 呼んだ?",1;
		end;
	}
	unittalk "ニャル : ミャオ～",1;
	end;
OnQuestInfo:
	if(EP20_1QUE == 76)
		showevent 0, 1, "ニャル#ep20end_nyar03";
	end;
}
jor_twig.gat,138,157,5	script(CLOAKED)	レオン#ep20_end02	10464,{/* 3646 (cloaking)*/
	if(EP20_1QUE == 77) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "はぁ……はぁ……";
		mes "ラスガンドが……消えた？";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "ニャル様が、何かしたようね……";
		mes "まさか、ユミルの心臓の欠片の力を";
		mes "吸収させるなんて……";
		mes "バゴット……とんでもない奴ね……。";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[ニャル]";
		mes "エウウゥゥン……";
		mes "ニャンニャンニゃン";
		mes "ニャニャン、アオン……";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[ニャル]";
		mes "ゴロロロ……ゴロ……";
		mes "ウェオッ";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "ああ……そういう仕組みで……。";
		next;
		menu "ニャル様はなんと？",-;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ラスガンドが";
		mes "ユミルの心臓の欠片の力を";
		mes "完全に吸収する前に";
		mes "分離したと言っています。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "だけど、ラスガンドは今も";
		mes "ヨルムンガンドと結界の魔力を";
		mes "吸収しようとしているわ。";
		mes "……完全な融合のためにね。";
		next;
		cutin "ep20_nyar01.png", 1;
		mes "[ニャル]";
		mes "エンオン…エエン";
		mes "　";
		mes "‐衰弱しているように見える‐";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "イスガルドの結界のように";
		mes "別の空間にラスガンドを分離しましたが";
		mes "分離しておくのも限界があります。";
		next;
		menu "分離ですか？",-;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "同じ場所、同じ時間だが";
		mes "異なる次元だと説明したらいいかな……。";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[ニャル]";
		mes "エオオォォン…ゴロ";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ユミルの心臓の欠片の力と";
		mes "ラスガンドが完全に融合する前に";
		mes "止めて欲しいと言ってます。";
		next;
		mes "[レオン]";
		mes "ラスガンドが融合を果たし";
		mes "分離した聖域を破って出てきたら";
		mes "もはや止める方法はありません。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "私とレオンは";
		mes "ニャル様を手伝わなきゃならない。";
		mes "ラスガンドを止める大役は";
		mes "……冒険者！";
		mes "貴方にやってもらうしかない。";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[ニャル]";
		mes "ウェオン！ウェオン！";
		mes "ゴロロ、ゴロゴロ";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "よし……ニャル様とレオンが";
		mes "分離された聖域を維持する役目。";
		mes "聖域へ繋がる通路の案内は";
		mes "私が務めるわ。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ラスガンドの力を奪うことだけに";
		mes "集中してください！";
		mes "いまはまだ倒せなくても大丈夫です。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "こちらの準備はできている。";
		mes "貴方の準備が終わったら";
		mes "私に話しかけてちょうだい。";
		mes "……ここが正念場よ。";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[ニャル]";
		mes "ミャッ、ミャン～エンォン";
		close2;
		cutin "ep20_nyar04.png", 255;
		chgquest 18231,18232;
		set EP20_1QUE,78;
		end;
	}
	if(EP20_1QUE == 78) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "……楽な戦いではないでしょう。";
		mes "信頼できる仲間の方たちと";
		mes "一緒に挑んでください。";
		mes "案内はオーレリーがします。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	if(EP20_1QUE == 79) {
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ここで何があったのか";
		mes "氷の城に戻ってヴォークリンデ様に";
		mes "伝えてください。";
		mes "私はここでニャル様と";
		mes "結界を点検してから戻ります。";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 77)
		showevent 0, 1, "レオン#ep20_end02";
	end;
}
jor_twig.gat,135,155,3	script(CLOAKED)	分離された聖域#ep20_md0	10046,{/* 3647 (cloaking)*/
	mes "[インフォメーション]";
	mes "既に「分離された聖域」を";
	mes "クリアしているキャラクターは、";
	mes "パーティメンバーとして";
	mes "「分離された聖域」に";
	mes "入場できます。";
	next;
	mes "[インフォメーション]";
	mes "パーティメンバーとして";
	mes "「分離された聖域」に";
	mes "入場しますか？";
	next;
	if(select("やめる","「分離された聖域」入場") == 1) {
		mes "‐やめた‐";
		close;
	}
	mes "[インフォメーション]";
	mes "「分離された聖域」へ入場します。";
	close2;
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "[インフォメーション]";
		mes "既に「分離された聖域」を";
		mes "クリアしているキャラクターは、";
		mes "パーティリーダーとして";
		mes "入場できません。";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 80)
		showevent 0, 1, "分離された聖域#ep20_md0";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの入場]";
	end;
}
jor_twig.gat,138,152,7	script(CLOAKED)	オーレリー#ep20_end02	10465,{/* 3648 (cloaking)*/
	if(EP20_1QUE == 78) {
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "準備はできた？";
		mes "貴方の準備が終わり次第";
		mes "分離された聖域へ送るわ。";
		next;
		mes "^e6328cメモリアルダンジョン";
		mes "「分離された聖域」の";
		mes "生成と入場が行えます。";
		if(mdopenstate("分離された聖域"))
			set '@str$,"^0b0b33メモリアルダンジョンへ入場";
		else if(getpartyleader(getcharid(1)) == strcharinfo(0))
			set '@str$,"^0b0b33メモリアルダンジョンの作成";
		next;
		switch(select("^191970立ち去る",'@str$,"^0b0b33注意事項の確認")) {
		case 1:
			mes "‐その場を離れた‐";
			close2;
			cutin "ep19_aurelie01.png", 255;
			end;
		case 2:
			if(mdopenstate("分離された聖域")) {
				cutin "ep19_aurelie01.png", 0;
				mes "[オーレリー]";
				mes "準備はできた？";
				next;
				if(select("^191970少し考える","^e6328c分離された聖域へ向かう") == 2) {
					cutin "ep19_aurelie01.png", 0;
					mes "[オーレリー]";
					mes "焦ってはダメよ。";
					mes "私とレオンが力添えをしてるから";
					mes "ラスガンドはすぐに脱出はできない。";
					mes "用意ができたら声をかけてね。";
					next;
					mes "[オーレリー]";
					mes "私が見当たらない時は";
					mes "ニャル様に声をかけて。";
					mes "すぐ来るから。";
					close2;
					cutin "ep19_aurelie01.png", 255;
					end;
				}
				mes "[オーレリー]";
				mes "それじゃあ、行きましょう。";
				close2;
				cutin "ep19_aurelie01.png", 255;
				switch(mdenter("分離された聖域")) {
				case 0:	// エラーなし
					announce "メモリアルダンジョン[分離された聖域] に入場しました　：　"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
					//warp "1@twas.gat", 94, 71;
					end;
				case 1:	// パーティー未加入
					mes "^8c32e6パーティーが解体されているため";
					mes "入場できません。";
					mes "もう一度確認してから";
					mes "やり直してください。";
					close;
				case 2:	// ダンジョン未作成
					mes "^8c32e6パーティーリーダーが";
					mes "メモリアルダンジョンを";
					mes "生成していない状態です。";
					close;
				default:	// その他エラー
					close;
				}
			}
			else {
				if(getonlinepartymember() < 1) {
					mes "^8c32e6空白のパーティー名では、";
					mes "メモリアルダンジョンを";
					mes "作成することは出来ません。";
					close2;
					cutin "ep19_aurelie01.png", 255;
					end;
				}
				mes "メモリアルダンジョンを作成しますか？";
				next;
				if(select("^191970少し考える","^e6328c作成する") == 1) {
					cutin "ep19_aurelie01.png", 0;
					mes "[オーレリー]";
					mes "あまり時間がないから";
					mes "早く決めてくれるかしら？";
					close2;
					cutin "ep19_aurelie01.png", 255;
					end;
				}
				if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
					cutin "ep19_aurelie01.png", 255;
					close;
				}
				mdcreate "分離された聖域";
				mes "■パーティー名";
				mes "^009eff"+strcharinfo(1)+"^000000";
				mes "■パーティーリーダー";
				mes "^009eff"+strcharinfo(0)+"^000000";
				mes "　";
				mes "^006400分離された聖域の";
				mes "作成申請を受け付けました。^000000";
				close2;
				cutin "ep19_aurelie01.png", 255;
				end;
			}
		case 3:
			mes "詳しくはこちらをご確認ください。";
			mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			messize 180,364;
			close2;
			cutin "ep19_aurelie01.png", 255;
			end;
		}
	}
	if(EP20_1QUE == 79) {
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "分離された聖域で得た";
		mes "ユミルの心臓の欠片だけど……";
		mes "ラスガンドが使ったのは";
		mes "その力の一部のみ……。";
		next;
		mes "[オーレリー]";
		mes "完全融合していたらと思うと";
		mes "ゾッとするわね。";
		next;
		mes "[オーレリー]";
		mes "とにかく、その欠片は";
		mes "返しに行かないとね。";
		mes "氷の城に戻ったら、ヴォークリンデに";
		mes "いろいろ説明しておいて。";
		next;
		mes "[オーレリー]";
		mes "私はレオンと共に";
		mes "結界をしっかり補強してから戻るわ。";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 18233,131259;
		set EP20_1QUE,80;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 70, 121;
		end;
	}
	if(EP20_1QUE == 80) {
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "とにかく、その欠片は";
		mes "返しに行かないとね。";
		mes "氷の城に戻ったら、ヴォークリンデに";
		mes "いろいろ説明しておいて。";
		next;
		mes "[オーレリー]";
		mes "私はレオンと共に";
		mes "結界をしっかり補強してから戻るわ。";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 70, 121;
		end;
	}
	cutin "ep19_aurelie01.png", 0;
	mes "[オーレリー]";
	mes "ユミルの心臓の欠片の力を";
	mes "吸収するだなんて……";
	mes "バゴットという者、尋常じゃなかったよ。";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnQuestInfo:
	if(EP20_1QUE == 78 || EP20_1QUE == 79 || EP20_1QUE == 80)
		showevent 0, 1, "オーレリー#ep20_end02";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの生成と入場]";
	end;
}
jor_twig.gat,140,155,5	script(CLOAKED)	ラスガンド#ep20end_las0	10536,{/* 3649 (cloaking)*/}
jor_twig.gat,140,164,1	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3650 (cloaking)*/}
jor_twig.gat,143,161,3	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3651 (cloaking)*/}
jor_twig.gat,146,158,3	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3652 (cloaking)*/}
jor_twig.gat,149,155,3	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3653 (cloaking)*/}
jor_twig.gat,146,152,1	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3654 (cloaking)*/}
jor_twig.gat,143,149,1	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3655 (cloaking)*/}
jor_twig.gat,140,146,1	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3656 (cloaking)*/}
jor_twig.gat,137,149,7	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3657 (cloaking)*/}
jor_twig.gat,134,152,7	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3658 (cloaking)*/}
jor_twig.gat,130,155,7	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3659 (cloaking)*/}
jor_twig.gat,134,158,5	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3660 (cloaking)*/}
jor_twig.gat,137,161,5	script(CLOAKED)	ニャルの分身#ep20end_ny	22006,{/* 3661 (cloaking)*/}

icecastle.gat,75,126,3	script	チチリン#ep20_DQ_4	21515,{/* 3661 */
	if(EP20_1QUE == 80) {
		mes "[チチリン]";
		mes "お！　冒険者～!!";
		mes "ヴォークリンデ様がお待ちしているよ！";
		mes "すぐ案内するように言われてる！";
		next;
		mes "[チチリン]";
		mes "さぁさぁ、こっちだよ！";
		close2;
		warp "icecastle.gat", 160, 203;
		end;
	}
	if(EP20_1QUE == 100) {
		if(!checkquest(131263)) {
			mes "[チチリン]";
			mes "蛇神の根源とかに行く用事があったら";
			mes "私に言って。";
			mes "最近、ヴォークリンデ様が";
			mes "あの場所へよく通ってるから";
			mes "私も手伝っているんだよ。";
			next;
			mes "[チチリン]";
			mes "ほら、冒険者～！";
			mes "古代の氷の峡谷を脅かす";
			mes "「蛇神の根源 深い洞窟」攻略の";
			mes "時間だヨ～！";
			next;
			mes "[チチリン]";
			mes "古代アイスウィンドの安全のために";
			mes "深い洞窟の悪い奴らを";
			mes "懲らしめて欲しいんだ。";
			mes "時間があったらやってくれない？";
			setquest 131263;
			compquest 131263;
		}
		else {
			mes "[チチリン]";
			mes "古代アイスウィンドの安全のために";
			mes "深い洞窟の悪い奴らを";
			mes "懲らしめて欲しいんだ。";
			mes "時間があったらやってくれない？";
		}
		while(1) {
			next;
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(蛇神の根源 深い洞窟)") == 2) {
				mes "^ff0000‐移動には500Zenyが必要です‐^000000";
				next;
				if(!checkquest(18234)) {
					mes "[チチリン]";
					cutin "ep19_iwin03.png", 2;
					mes "まだ、お願いを聞いてもらってないけど";
					mes "このまま現地に向かう？";
					next;
					if(select("クエストの受注や報告を行う","ダンジョンに移動する(蛇神の根源 深い洞窟)") == 1)
						break;
					mes "[チチリン]";
					cutin "ep19_iwin03.png", 2;
					mes "分かったよ。";
					mes "それじゃ、現地に送るね。";
				}
				else {
					mes "[チチリン]";
					cutin "ep19_iwin03.png", 2;
					mes "蛇神の根源 深い洞窟がどこかって？";
					mes "古代の氷の峡谷の西部にあるよ。";
					mes "古代アイスウィンドたちが心配だけど";
					mes "奴らも荒々しいから気を付けて。";
					mes "良ければ送ろっか？";
				}
				close2;
				cutin "kafra_01.bmp", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_root3.gat", 367, 129;
				end;
			}
		}
		setarray '@questname$,"アーウィンのアーウィン心配";
		setarray '@questid,18234;
		setarray '@coolid,18235;
		setarray '@gainlist,1001217,10;
		setarray '@explist,1100000000,825000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// アーウィンのアーウィン心配
			if(checkquest(18235)) {
				if(checkquest(18235)&2 == 0) {
					mes "[チチリン]";
					cutin "ep19_iwin03.png", 2;
					mes "これで古代アイスウィンドたちも";
					mes "一安心できるよね。";
					mes "次も手伝ってくれたらいいな。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000アーウィンのアーウィン心配^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(18234)) {
				if(checkquest(18234)&4 == 0) {
					mes "[チチリン]";
					cutin "ep19_iwin03.png", 2;
					mes "^e5555eクマムシ^000000と";
					mes "^e5555eメリベウミウシ^000000を";
					mes "各5匹ずつやっつけてくれ！";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000アーウィンのアーウィン心配^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 18234;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000アーウィンのアーウィン心配^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000アーウィンのアーウィン心配^000000」";
				mes "<内容>";
				mes "対象：<URL>クマムシ<INFO>https://rotool.gungho.jp/monster/EP20_ICEBEAR</INFO></URL>　5体";
				mes "対象：<URL>メリベウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>　5体";
				mes "の討伐";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 22G ( 22000000000 )";
				mes "※1100000000を20回受け取ります。";
				mes "JobExp 16.5G ( 16500000000 )";
				mes "※825000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000アーウィンのアーウィン心配^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 18234;
				setquest 18235;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 1100000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,825000000,0;
				mes "[チチリン]";
				cutin "ep19_iwin03.png", 2;
				mes "わ～、お疲れ様！";
				mes "これで古代の氷の峡谷は";
				mes "より安全になったよ！";
				mes "キミって本当に凄いよ！";
				mes "次もまた手伝ってくれるよね？";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 22G";
				mes "( 22000000000 )";
				mes "※1100000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 16.5G";
				mes "( 16500000000 )";
				mes "※825000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[チチリン]";
			cutin "ep19_iwin03.png", 2;
			mes "蛇神の根源 深い洞窟に行って";
			mes "^e5555eクマムシ^000000と";
			mes "^e5555eメリベウミウシ^000000を";
			mes "各5匹ずつやっつけてくれ！";
			next;
			mes "[チチリン]";
			cutin "ep19_iwin03.png", 2;
			mes "そうすれば近所に住む";
			mes "古代アイスウィンドたちも安全だろう。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000アーウィンのアーウィン心配^000000」";
			mes "<内容>";
			mes "対象：<URL>クマムシ<INFO>https://rotool.gungho.jp/monster/EP20_ICEBEAR</INFO></URL>　5体";
			mes "対象：<URL>メリベウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>　5体";
			mes "の討伐を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[チチリン]";
				cutin "ep19_iwin03.png", 2;
				mes "中断するの？";
				mes "そっか、";
				mes "忙しいのに声をかけてごめんね。";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 18234;
			if(checkquest(18235)) delquest 18235;
			mes "[チチリン]";
			cutin "ep19_iwin03.png", 2;
			mes "それじゃ、よろしく！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000アーウィンのアーウィン心配^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 80)
		showevent 0, 1, "チチリン#ep20_DQ_4";
	else if(EP20_1QUE == 100)
		showevent 0, 3, "チチリン#ep20_DQ_4";
	end;
}

icas_in2.gat,248,112,0	script	#ep20_pr_endevt	139,1,1,{/* 3663 */
	if(EP20_1QUE == 80) {
		cloakoffnpc "捕らえられたバゴット#ep";
		cloakoffnpc "マラム#ep20_end02";
		cloakoffnpc "ミリアム#ep20_end03";
	}
	end;
}
icas_in2.gat,247,122,3	script(CLOAKED)	捕らえられたバゴット#ep	10386,{/* 3664 (cloaking)*/
	mes "‐厳重に拘束されている‐";
	close;
}
icas_in2.gat,253,118,3	script	ヴォークリンデ#ep20_DQ_	10467,{/* 3665 */
	if(EP20_1QUE == 80) {
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "無事みたいで良かった。";
		mes "バゴットは御覧の通り";
		mes "きっちり拘束しておいた。";
		mes "さて、あの場所で何があったのか";
		mes "説明してもらえるかい？";
		next;
		menu "汚染されたユミルの心臓の欠片を見せる",-;
		mes "[ヴォークリンデ]";
		mes "……これは？";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "少し変形していますが";
		mes "ユミルの心臓の欠片です。";
		mes "セスルムニルで保管していた物です。";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "なぜ、それを持ってる？";
		mes "まさか……ラスガンドと完全に";
		mes "融合してなかったってことぉ!?";
		next;
		menu "完全に融合する前に取り戻した",-;
		cutin "ep18_bagot_02.png", 2;
		mes "[バゴット]";
		mes "あり得ないっ！";
		mes "バゴットの計算は完ぺきだった！";
		mes "お前ぇ……嘘を吐いてるなーーーっ！";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "聞き分けが悪いなぁ……";
		mes "とりあえず、私と一緒に祖国に帰ろう。";
		mes "この寒い大地と";
		mes "ようやくおさらばできるぞ！";
		mes "帰って牢獄生活を楽しもう♪";
		next;
		cutin "ep18_bagot_02.png", 0;
		mes "[バゴット]";
		mes "正直に言えーーっ！";
		mes "バゴットを無視するなぁーー！";
		next;
		cloakoffnpc "レオン#ep20_end03";
		cloakoffnpc "オーレリー#ep20_end03";
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "こちらにいらっしゃいましたか。";
		mes "懸念していた問題は";
		mes "落ち着きましたが……";
		mes "皆様は、これからどうなさいますか？";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "レイジーさんはバゴットを";
		mes "連行されるそうです。";
		mes "ボクとマラムはユミルの心臓の欠片を";
		mes "ラヘルに持って帰ります。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "うん。問題はないよ。";
		mes "あとは我々に残された仕事だが……。";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[バゴット]";
		mes "おい！　バゴットを無視するなぁ！";
		mes "ラスガンドの奴はどうなった！";
		mes "答えろぉ～～！";
		next;
		menu "ラスガンドは倒した",-;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "じゃあ……ゲオルグ家の呪いも";
		mes "解けたのかい？";
		mes "ヨルムンガンド教団との腐れ縁も";
		mes "ようやくこれで……。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "完全にとどめを刺したわけでは";
		mes "ありません。";
		mes "ニャルの力で一時的に";
		mes "聖地に封印した状況なんです。";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[バゴット]";
		mes "ハハ！　ハハハハ!!";
		mes "ほぉらっ！";
		mes "バゴットが失敗する訳ないでしょ！";
		next;
		mes "[バゴット]";
		mes "ラスガンドがヨルムンガンドの魔力を";
		mes "完全に吸収したら、神になるでしょう！";
		mes "ろくでもない結界なんか";
		mes "あっという間に破られます！";
		next;
		mes "[バゴット]";
		mes "やはり！";
		mes "バゴットは神を創り上げたんです！";
		mes "ア～～～ハハハハハ!!";
		mes "……あっ!?";
		misceffect 899,"捕らえられたバゴット#ep",1;
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[ミリアム]";
		mes "……すいません。";
		mes "あまりにうるさかったので";
		mes "つい……。";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[オーレリー]";
		mes "いや、よくやった。";
		mes "……そのユミルの心臓の欠片は";
		mes "汚染されてしまったようだから";
		mes "セスルムニルの奥底で";
		mes "浄化が必要だろうね。";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[マラム]";
		mes "わかりました。";
		mes "あの……今回の件で";
		mes "恩返しをしたいのですが";
		mes "引き続き、手伝えることはありますか？";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[レイジー]";
		mes "まだやっかいな問題が";
		mes "残っているみたいだけど";
		mes "まぁ、普段のように出入りしながら";
		mes "手伝えることをすればいいんじゃない？";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "そうしてくれるとありがたいよ。";
		mes "しかし……ラスガンドを";
		mes "どう処理したものか……。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "ニャル様が封印を維持する間";
		mes "ラスガンドの魔力融合を";
		mes "継続的に阻止し続けることができれば";
		mes "勝算があります。";
		next;
		mes "[レオン]";
		mes "私とオーレリーは";
		mes "ニャル様の魔力が途切れないように";
		mes "手伝う予定です。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "長い戦いになるかもしれない。";
		mes "それでも、やらなければね。";
		mes "私たちが永い時間眠っていたのは";
		mes "この時のためだったみたい。";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[レオン]";
		mes "もし、ラスガンドの様子が";
		mes "気になる様でしたら";
		mes "「小さな枝の在り処」を訪ねて来てください。";
		mes "ニャル様も待っておられますから。";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[ヴォークリンデ]";
		mes "私はヨルムンガンド教団の残党を";
		mes "根絶やしてやるとしようか。";
		mes "冒険者も時間があれば";
		mes "手を貸してちょうだい。";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[オーレリー]";
		mes "ここまで事態が進展したのは";
		mes "冒険者が手伝ってくれたおかげ。";
		mes "ありがとう。";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[ヴォークリンデ]";
		mes "ようやく希望が見えて来た。";
		mes "さて、私は私の成すべきことを";
		mes "成すとしよう。";
		close2;
		cutin "ep19_voglinde01.png", 255;
		cloakonnpc "マラム#ep20_end02";
		cloakonnpc "ミリアム#ep20_end03";
		cloakonnpc "レイジー#ep20_end03";
		cloakonnpc "捕らえられたバゴット#ep";
		cloakonnpc "レオン#ep20_end03";
		cloakonnpc "オーレリー#ep20_end03";
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		setquest 202425;
		delquest 131259;
		set EP20_1QUE,100;
		getitem 1001217,100;
		for(set '@i,0;'@i<120;set '@i,'@i+1) {
			getexp 2000000000,0,0;
			getexp 0,1400000000,0;
		}
		delitem 12624,1;
		setquest 19158;
		setquest 12589;
		setquest 131261;
		compquest 131261;
		end;
	}
	if(EP20_1QUE == 100) {
		cutin "ep19_voglinde01.png", 2;
		mes "[ヴォークリンデ]";
		mes "ようやく希望が見えて来た。";
		mes "これもすべて貴方のおかげね。";
		mes "さて、私は私の成すべきことを";
		mes "成すとしよう。";
		next;
		mes "[ヴォークリンデ]";
		mes "ルガンたちを根絶やしにすると";
		mes "言ってただろ？";
		mes "もし、手が空いているなら";
		mes "一緒に狩りに行こうじゃないか。";
		next;
		if(select("クエストの受注や報告を行う","ダンジョンに移動する(蛇神の根源 02)") == 2) {
			mes "^ff0000‐移動には500Zenyが必要です‐^000000";
			next;
			mes "[ヴォークリンデ]";
			cutin "ep19_voglinde01.png", 2;
			mes "よし！";
			mes "それじゃ、現地まで送ろうかね！";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_root2j.gat", 25, 17;
			end;
		}
		setarray '@questname$,"ヴォークリンデの殲滅作戦①","ヴォークリンデの殲滅作戦②";
		setarray '@questid,18236,18238;
		setarray '@coolid,18237,18239;
		setarray '@gainlist,1000608,10,1000608,10;
		setarray '@explist,400000000,300000000,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// ヴォークリンデの殲滅作戦①
			if(checkquest(18237)) {
				if(checkquest(18237)&2 == 0) {
					mes "[ヴォークリンデ]";
					cutin "ep19_voglinde01.png", 2;
					mes "頑張って働いてくれているが、";
					mes "ルガンは相変わらず減らないな。";
					mes "今日はもうゆっくり休んでおくれ。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(18236)) {
				if(checkquest(18236)&4 == 0) {
					mes "[ヴォークリンデ]";
					cutin "ep19_voglinde01.png", 2;
					mes "^e5555e上級ルガン呪術師^000000と";
					mes "^e5555e上級ルガン治療師^000000を";
					mes "各10匹ずつ倒してきておくれ！";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 18236;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
				mes "<内容>";
				mes "対象：<URL>上級ルガン呪術師<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_WARLOCK</INFO></URL>　10体";
				mes "対象：<URL>上級ルガン治療師<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_HEALER</INFO></URL>　10体";
				mes "の討伐";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "※400000000を20回受け取ります。";
				mes "JobExp 6G ( 6000000000 )";
				mes "※300000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 18236;
				setquest 18237;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[ヴォークリンデ]";
				cutin "ep19_voglinde01.png", 2;
				mes "終ったのかい？";
				mes "ルガンたちは相変わらずのようだね。";
				mes "本当にご苦労様。";
				mes "しっかり休んであったかい物を食べな！";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "※400000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "※300000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[ヴォークリンデ]";
			cutin "ep19_voglinde01.png", 2;
			mes "よし、ラスガンドが出てこれない今のうちに";
			mes "蛇神の根源を綺麗にしてやろう。";
			mes "^e5555e上級ルガン呪術師^000000と";
			mes "^e5555e上級ルガン治療師^000000を";
			mes "各10匹ずつ倒してきておくれ！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
			mes "<内容>";
			mes "対象：<URL>上級ルガン呪術師<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_WARLOCK</INFO></URL>　10体";
			mes "対象：<URL>上級ルガン治療師<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_HEALER</INFO></URL>　10体";
			mes "の討伐を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[ヴォークリンデ]";
				cutin "ep19_voglinde01.png", 2;
				mes "む、中断するのか？";
				mes "仕方がない。";
				mes "また手が空いた時に頼むよ！";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 18236;
			if(checkquest(18237)) delquest 18237;
			mes "[ヴォークリンデ]";
			cutin "ep19_voglinde01.png", 2;
			mes "思いっきり暴れてきな！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 1:	// ヴォークリンデの殲滅作戦②
			if(checkquest(18239)) {
				if(checkquest(18239)&2 == 0) {
					mes "[ヴォークリンデ]";
					cutin "ep19_voglinde01.png", 2;
					mes "頑張って働いてくれているが、";
					mes "ルガンは相変わらず減らないな。";
					mes "今日はもうゆっくり休んでおくれ。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴォークリンデの殲滅作戦②^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(18238)) {
				if(checkquest(18238)&4 == 0) {
					mes "[ヴォークリンデ]";
					cutin "ep19_voglinde01.png", 2;
					mes "^e5555eヨルムンガンド教団守衛^000000を";
					mes "10匹倒してきておくれ！";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴォークリンデの殲滅作戦②^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 18238;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ヴォークリンデの殲滅作戦①^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ヴォークリンデの殲滅作戦②^000000」";
				mes "<内容>";
				mes "対象：<URL>ヨルムンガンド教団守衛<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_GUARDIAN</INFO></URL>　10体";
				mes "の討伐";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "※400000000を20回受け取ります。";
				mes "JobExp 6G ( 6000000000 )";
				mes "※300000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ヴォークリンデの殲滅作戦②^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 18238;
				setquest 18239;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[ヴォークリンデ]";
				cutin "ep19_voglinde01.png", 2;
				mes "終ったのかい？";
				mes "ルガンたちは相変わらずのようだね。";
				mes "本当にご苦労様。";
				mes "しっかり休んであったかい物を食べな！";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "※400000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "※300000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[ヴォークリンデ]";
			cutin "ep19_voglinde01.png", 2;
			mes "よし、ラスガンドが出てこれない今のうちに";
			mes "蛇神の根源を綺麗にしてやろう。";
			mes "^e5555eヨルムンガンド教団守衛^000000を";
			mes "10匹倒してきておくれ！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ヴォークリンデの殲滅作戦②^000000」";
			mes "<内容>";
			mes "対象：<URL>ヨルムンガンド教団守衛<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_GUARDIAN</INFO></URL>　10体";
			mes "の討伐を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[ヴォークリンデ]";
				cutin "ep19_voglinde01.png", 2;
				mes "む、中断するのか？";
				mes "仕方がない。";
				mes "また手が空いた時に頼むよ！";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 18238;
			if(checkquest(18239)) delquest 18239;
			mes "[ヴォークリンデ]";
			cutin "ep19_voglinde01.png", 2;
			mes "思いっきり暴れてきな！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ヴォークリンデの殲滅作戦②^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 80)
		showevent 0, 1, "ヴォークリンデ#ep20_DQ_";
	else if(EP20_1QUE == 100) {
		if((!checkquest(18236) && (!checkquest(18237) || checkquest(23111)&0x2) || checkquest(18236) && checkquest(18236)&0x4 == 0) || 
		(!checkquest(18238) && (!checkquest(18239) || checkquest(23111)&0x2) || checkquest(18238) && checkquest(18238)&0x4 == 0))
			showevent 0, 3, "ヴォークリンデ#ep20_DQ_";
	}
	end;
}
icas_in2.gat,246,119,5	script(CLOAKED)	マラム#ep20_end02	10376,{/* 3666 (cloaking)*/}
icas_in2.gat,251,121,3	script(CLOAKED)	ミリアム#ep20_end03	10377,{/* 3667 (cloaking)*/}
icas_in2.gat,252,113,1	script(CLOAKED)	レイジー#ep20_end03	10454,{/* 3668 (cloaking)*/}
icas_in2.gat,245,115,7	script(CLOAKED)	レオン#ep20_end03	10464,{/* 3669 (cloaking)*/}
icas_in2.gat,246,112,7	script(CLOAKED)	オーレリー#ep20_end03	10465,{/* 3670 (cloaking)*/}

icecastle.gat,106,130,3	script	ココポ#ex01	21995,{/* 3670 */
	unittalk "ココポ : ピャッ！",1;
	end;
}
icecastle.gat,102,126,4	script	ココポ#ex02	21995,{/* 3671 */
	unittalk "ココポ : ピャッ！",1;
	end;
}
icecastle.gat,98,123,3	script	ココポ#ex03	21995,{/* 3672 */
	unittalk "ココポ : ピョッピョッピョウ！",1;
	end;
}
icecastle.gat,96,120,14	script	ココポ#ex04	21995,{/* 3673 */
	unittalk "ココポ : ピャッ！",1;
	end;
}
icecastle.gat,98,115,4	script	ココポ#ex05	21995,{/* 3674 */
	unittalk "ココポ : ピョッピョッピョウ！",1;
	end;
}
icecastle.gat,99,115,3	script	ココポ#ex06	21995,{/* 3675 */
	unittalk "ココポ : ペーエッ！",1;
	end;
}
icecastle.gat,55,124,3	script	クエストボード#ep20_dq_	857,{/* 3676 */
	mes "こちらのクエストボードでは、";
	mes "イスガルドに関連する";
	mes "デイリークエストをまとめて受注・報告することが可能です。";
	mes "^e6328cただし、利用するには、^000000";
	mes "^e6328c対象クエストを^000000";
	mes "^e6328c初回の受注ができる直前の状態までクエストを進める必要があります。^000000";
	mes "^e6328c　^000000";
	mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
	messize 270,364;
	next;
	setquest 19168;
	delquest 19168;
	setquest 19170;
	delquest 19170;
	setquest 19171;
	delquest 19171;
	setquest 19172;
	delquest 19172;
	setquest 19173;
	delquest 19173;
	setquest 19174;
	delquest 19174;
	setquest 19175;
	delquest 19175;
	setquest 19176;
	delquest 19176;
	setarray '@questname$,"ヴェルグンデの研究材料調達","捨てられるほどの場所①","捨てられるほどの場所②","掘って、また掘って","ゾリャラの楽しいランチタイム",
						"冷蔵庫が必要か？","パリパリな道具","フリーデリケの一日","地上からの隠れ処探し","特別な生存方式",
						"遭難者捜索","ヴォークリンデの殲滅作戦①","ヴォークリンデの殲滅作戦②","スパイ捜索","諜報情報の回収",
						"ルガンの根絶","アーウィンのアーウィン心配","ぷにぷに珍味収集①","ぷにぷに珍味収集②","一日の締めにヘビイチゴ",
						"声の出ない答えの例示","仲直りしたらいいな①","仲直りしたらいいな②","蛇の迷路の掃除";
	setarray '@questid, 18130,11831,0,11849,8788,	11852,11854,11813,17651,18139,
						18134,18236,18238,19162,19165,	23110,18234,8855,8857,17718,
						8844,11953,11955,17710;
	setarray '@questid2,0,0,0,11835,0,	0,11858,0,17661,0,
						18136,0,0,19163,19166,	0,0,0,0,0,
						0,0,0,0;
	setarray '@coolid,  18131,11832,0,11850,8789,	11853,11859,11814,17662,18140,
						18137,18237,18239,19164,19167,	23111,18235,8856,8858,17721,
						8845,11954,11956,17711;
	setarray '@itemlist,1000706,3,23228,10,0,0,1000830,10,	1000708,30,0,1000705,5,0,1000707,5,
						0,0,0,0,0,	0,0,1001233,5,1001232,5,0,1001231,5,1001154,3,
						1001244,5,0,0,0;
	setarray '@gainlist,1000608,3,1000608,4,0,0,1000608,2,1000608,2,	1000608,3,1000608,2,1000608,3,1000608,2,1000608,3,
						1000608,2,1000608,10,1000608,10,1001217,3,1001217,3,	1001217,10,1001217,10,1001217,10,1001217,10,1001217,3,
						1001217,10,1001217,10,1001217,10,1001217,10;
	setarray '@explist, 300000000,225000000,600000000,656250000,0,0,225000000,175000000,300000000,225000000,
						300000000,225000000,225000000,175000000,410000000,310000000,375000000,275000000,410000000,310000000,
						225000000,175000000,400000000,300000000,400000000,300000000,400000000,300000000,400000000,300000000,
						400000000,300000000,1100000000,825000000,950000000,712500000,1100000000,825000000,200000000,150000000,
						475000000,356250000,475000000,356250000,475000000,356250000,400000000,300000000;
	// ToDo: quest flag or BaseLevel missmuch
	// [^888888開始条件未達成^000000] 
	set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
	// 以下個別処理
	for('@j=0;'@j<getarraysize('@itemlist);'@j++) {
		if('@itemlist['@j] == 0)	// 納品無しはスキップして一つ先の配列へ
			continue;
		// 選択クエスト配列分回したので離脱
		if('@sel == '@k)
			break;
		'@j++;	// 納品ありを通過するときは二つ先へ飛ぶのでここで追加
		'@k++;
	}
	mes "<<B>クエスト</B>>";
	mes "「^ff0000"+'@questname$['@sel]+"^000000」";
	if('@questid2 > 0) {	// 会話系クエスト
		mes "を受注しますか？";
	}
	else if(getquestmaxcount('@questid['@sel]) > 0 && '@itemlist['@j] > 0) {	// 討伐+納品クエスト
		mes "<内容1>";
		//for('@i=1;'@i<=3;'@i++)
		//	mes "対象：<URL>"+getmobname(getquesttarget('@questid['@sel],'@i))+"<INFO>https://rotool.gungho.jp/monster/"+getmobname2(getquesttarget('@questid['@sel],'@i))+"</INFO></URL>　"+getquestmaxcount('@questid['@sel],'@i)+"体";
		mes "の討伐と";
		next;
		mes "<内容2>";
		// とりあえず2枠のチェックまでにする
		mes "アイテム：<ITEM>["+getitemname('@itemlist['@j])+"]<INFO>"+'@itemlist['@j]+"</INFO></ITEM>　"+'@itemlist['@j+1]+"個";
		if('@itemlist['@j+2] > 0)	// 2枠目もIDがあるので納品2品とする
			mes "アイテム：<ITEM>["+getitemname('@itemlist['@j+2])+"]<INFO>"+'@itemlist['@j]+"</INFO></ITEM>　"+'@itemlist['@j+3]+"個";
		mes "の納品の";
		mes "両方の達成で報告が可能です。";
		mes "クエストを受注しますか？";
	}
	else if(getquestmaxcount('@questid['@sel]) > 0) {	// 討伐のみクエスト
		mes "<内容>";
		//for('@i=1;'@i<=3;'@i++)
		//	mes "対象：<URL>"+getmobname(getquesttarget('@questid['@sel],'@i))+"<INFO>https://rotool.gungho.jp/monster/"+getmobname2(getquesttarget('@questid['@sel],'@i))+"</INFO></URL>　"+getquestmaxcount('@questid['@sel],'@i)+"体";
		mes "の討伐を受注しますか？";
	}
	else if('@itemlist['@j] > 0) {	// 納品のみクエスト
		mes "<内容>";
		mes "アイテム：<ITEM>["+getitemname('@itemlist['@j])+"]<INFO>"+'@itemlist['@j]+"</INFO></ITEM>　"+'@itemlist['@j+1]+"個";
		mes "の納品を受注しますか？";
	}
	else {
		mes "^ff0000[インフォメーション]^000000";
		mes "^ff0000処理を中断しました。^000000";
		close2;
		cutin "kafra_01.bmp", 255;
		end;
	}
	next;
	if(select("受注する","やめる") == 2) {
		mes "^ff0000[インフォメーション]^000000";
		mes "^ff0000処理を中断しました。^000000";
		close2;
		cutin "kafra_01.bmp", 255;
		end;
	}
	setquest '@questid['@sel];
	if(checkquest('@coolid['@sel])) delquest '@coolid['@sel];
	if('@questid['@sel] == 17651)	// 地上からの隠れ処探し
		getitem 1000842,6;
	mes "<<B>クエスト</B>>";
	mes "「^ff0000"+'@questname$['@sel]+"^000000」";
	mes "を受注しました。";
	close2;
	cutin "kafra_01.bmp", 255;
	end;
}

jor_sanct.gat,257,115,3	script	パモスガンド#ep20_DQ_7	10474,{/* 3681 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[最上級ルガン]";
		mes "人間だ！　人間が現れたぞ！";
		close;
	}
	if(EP20_1QUE == 27) {
		mes "[パモスガンド]";
		mes "討論をするのか？";
		next;
		menu "ビックリした",-,"はい",-;
		mes "[パモスガンド]";
		mes "初めて見る顔だな。";
		mes "今までずっとラスガンド様の傍に";
		mes "お仕えしていたから";
		mes "下賤の者の顔を知らないのも……。";
		next;
		mes "[パモスガンド]";
		mes "……当然のことだ！";
		mes "ハハハ！";
		mes "こんな場所で己の役割を知るとは！";
		mes "この窮屈な蛇神の根源 聖域からでも";
		mes "悟りを得られるかもしれない。";
		next;
		mes "[パモスガンド]";
		mes "そう、私と討論をしよう。";
		mes "こちらのドリリロガンドは";
		mes "沈黙の行の最中なので";
		mes "討論することができない。";
		next;
		mes "‐パモスガンドの後ろにいる";
		mes "　上級ルガンは";
		mes "　こっそりこちらを見てから";
		mes "　視線を逸らした‐";
		next;
		mes "[パモスガンド]";
		mes "沈黙の行というのは";
		mes "言葉を発しないことそのものが";
		mes "悟りを開く修行になるもので……。";
		next;
		mes "[パモスガンド]";
		mes "そうやっていつからか";
		mes "ドリリロガンドは私の世話をしながら";
		mes "沈黙の行をやっているのだ。";
		next;
		mes "[パモスガンド]";
		mes "その意志を尊重して";
		mes "修行を続けさせているが";
		mes "私はラスガンド様の教えについて";
		mes "話し合う相手がいなくて、少し残念だ。";
		next;
		mes "‐ふいに視線を感じた。";
		mes "　ドリリロガンドがこちらを見ている‐";
		next;
		mes "‐彼は首を横に振った。";
		mes "　人間と同じ意味だろうか？‐";
		next;
		mes "[パモスガンド]";
		mes "下賤の者よ。";
		mes "ヨルムンガンド教団について";
		mes "どれだけ知っている？";
		next;
		mes "[パモスガンド]";
		mes "ここにいるということは";
		mes "お前の忠誠心が認められたのだろう。";
		mes "当然、我々の歴史についても";
		mes "知っているはずだ。";
		next;
		mes "[パモスガンド]";
		mes "特に重要なのは";
		mes "他の種族とは異なり";
		mes "皆がラスガンド様の末裔だと";
		mes "いうことだろう。";
		next;
		mes "[パモスガンド]";
		mes "老いて死ぬと言うのがどういうことか";
		mes "考えるだけでも悲惨ではないか？";
		mes "ラスガンド様は、そうした苦しみの無い";
		mes "世界を夢見たんじゃないかな？";
		next;
		menu "……そうかもしれないですね",-;
		mes "[パモスガンド]";
		mes "このパモスガンドは！";
		mes "如何なる時もラスガンド様の説法と";
		mes "教理探求の準備ができている。";
		mes "しかし！　説法を聞きにくるルガンが";
		mes "ここにはいない！";
		next;
		menu "私がいるじゃありませんか？",-;
		mes "[パモスガンド]";
		mes "ううん？　何だって？";
		mes "私の説法を聞きに来たって？";
		mes "フフ……";
		mes "フフフ、それはそれは！";
		next;
		emotion 56,"パモスガンド#ep20_DQ_7",1;
		mes "‐パモスガンドは嬉しそうに";
		mes "　その場でグルグル歩き回った。";
		mes "　気分が良くなったようだ‐";
		next;
		mes "[ドリリロガンド]";
		mes "……。";
		emotion 9,"ドリリロガンド#ep20_sub",1;
		next;
		mes "‐奥にいるドリリロガンドが";
		mes "　こちらを見ている。";
		mes "　「可哀想に」という目つきだ‐";
		next;
		emotion 0,"パモスガンド#ep20_DQ_7",1;
		mes "[パモスガンド]";
		mes "おっと、そういえば";
		mes "お前は偵察兵だったと聞いている。";
		mes "ならば、戦闘に長けているな？";
		next;
		mes "[パモスガンド]";
		mes "忙しい私の為に";
		mes "<ITEM>[大きな灰色の羽根]<INFO>1001244</INFO></ITEM>を";
		mes "持って来てくれないか？";
		mes "^ff00001個^000000あればいい。";
		mes "^0000ff古代の氷の峡谷 東部^000000にいる";
		mes "^0000ffグレーアイスウィンド^000000から手に入るぞ。";
		next;
		mes "[パモスガンド]";
		mes "早く行け。";
		mes "お前に拒否権はないのだ！";
		mes "エッヘン。";
		emotion 54,"ドリリロガンド#ep20_sub",1;
		chgquest 17701,8843;
		set EP20_1QUE,28;
		close;
	}
	if(EP20_1QUE == 28) {
		if(countitem(1001244) < 1) {
			//未調査
			mes "[パモスガンド]";
			mes "忙しい私の為に";
			mes "<ITEM>[大きな灰色の羽根]<INFO>1001244</INFO></ITEM>を";
			mes "持って来てくれないか？";
			mes "^ff00001個^000000あればいい。";
			mes "^0000ff古代の氷の峡谷 東部^000000にいる";
			mes "^0000ffグレーアイスウィンド^000000から手に入るぞ。";
			next;
			mes "[パモスガンド]";
			mes "早く行け。";
			mes "お前に拒否権はないのだ！";
			mes "エッヘン。";
			emotion 54,"ドリリロガンド#ep20_sub",1;
			close;
		}
		mes "[パモスガンド]";
		mes "どうしたのだ、下賤の者よ。";
		mes "……うん？";
		mes "これは……";
		mes "<ITEM>[大きな灰色の羽根]<INFO>1001244</INFO></ITEM>！";
		next;
		mes "[パモスガンド]";
		mes "そういえば、誰かに頼んでおいたな。";
		mes "お前だったか。";
		mes "どれどれ……";
		mes "お前はヨルムンガンド教団について";
		mes "どれほど知っている？";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "頼まれた物を、持ってき……。";
		next;
		mes "[パモスガンド]";
		mes "それどころではない。";
		mes "私は説法したいのだ！";
		emotion 9,"ドリリロガンド#ep20_sub",1;
		next;
		mes "‐パモスガンドの背後から";
		mes "　ドリリロガンドがこちらを見ている‐";
		next;
		mes "[ドリリロガンド]";
		mes "………。";
		next;
		mes "‐ドリリロガンドに";
		mes "　「ちょっと助けて欲しい」";
		mes "　と視線を送り、祈った‐";
		next;
		mes "[ドリリロガンド]";
		mes "………。";
		next;
		mes "‐ドリリロガンドは目を閉じて";
		mes "　首を左右に振った‐";
		next;
		mes "‐ドリリロガンドに";
		mes "　「どうか助けて欲しい」";
		mes "　と視線を送り、強く祈った‐";
		next;
		mes "[ドリリロガンド]";
		mes "………。";
		next;
		mes "‐ドリリロガンドに";
		mes "　「どうか！　どうか助けて欲しい」";
		mes "　と視線を送り、切実に祈った‐";
		next;
		mes "[ドリリロガンド]";
		mes "………。";
		next;
		mes "‐ドリリロガンドに";
		mes "　「なにとぞ！　どうか助けて欲しい」";
		mes "　と視線を送り、必死に祈った‐";
		next;
		mes "[ドリリロガンド]";
		mes "………。";
		next;
		mes "‐ドリリロガンドは";
		mes "　黙々と続く祈りに";
		mes "　そっと目を開けた‐";
		next;
		menu "ドリリロガンド様！",-;
		mes "‐声を出したわけではないが";
		mes "　こちらの切実なる祈りを";
		mes "　ドリリロガンドは理解したようだ。";
		mes "　パモスガンドのお陰で";
		mes "　祈りに対する悟りを得た‐";
		next;
		mes "‐ドリリロガンドは";
		mes "　パモスガンドに目を向けた。";
		mes "　すると、話しかけられたかのように";
		mes "　パモスガンドが答える‐";
		next;
		mes "[パモスガンド]";
		mes "どうしたのだ、ドリリロガンド？";
		next;
		mes "[ドリリロガンド]";
		mes "……。";
		next;
		mes "‐ドリリロガンドは";
		mes "　少し視線を逸らしてから";
		mes "　再びパモスガンドを見つめた‐";
		emotion 9,"ドリリロガンド#ep20_sub",1;
		next;
		mes "[パモスガンド]";
		mes "それか……";
		mes "……それなら仕方がない。";
		next;
		mes "‐パモスガンドは、人が……";
		mes "　いや、ルガンが変わったかのように";
		mes "　慈悲深い顔で";
		mes "　こちらを見つめながら語った‐";
		next;
		mes "[パモスガンド]";
		mes "いまはまだ目覚めぬ者よ。";
		mes "私はこれから午睡に入る。";
		mes "この羽根は大事に使おう。";
		mes "教理を知ることは大事だが";
		mes "自身の平穏も大事にせよ。";
		next;
		mes "[パモスガンド]";
		mes "サレクガンドにもお前のことは";
		mes "伝えておこう。";
		mes "聡い者がいると。";
		mes "引き続き、作務に当たりなさい。";
		next;
		mes "‐ドリリロガンドを見ると";
		mes "　彼は目を閉じて静かに頷いた‐";
		next;
		chgquest 8843,8841;
		set EP20_1QUE,29;
		delitem 1001244,1;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 210, 84;
		end;
	}
	if(EP20_1QUE >= 29 && EP20_1QUE < 100) {
		mes "[パモスガンド]";
		mes "サレクガンドにもお前のことは";
		mes "伝えておこう。";
		mes "聡い者がいると。";
		mes "引き続き、作務に当たりなさい。";
		next;
		mes "‐ドリリロガンドを見ると";
		mes "　彼は目を閉じて静かに頷いた‐";
		if(EP20_1QUE > 29)	//不明
			close;
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 210, 84;
		end;
	}
	if(EP20_1QUE == 100) {
		mes "[パモスガンド]";
		mes "おお、来たか。下賤の者よ。";
		if(checkquest(131264) == 0) {
			next;
			mes "[ドリリロガンド]";
			mes "………";
			next;
			mes "[パモスガンド]";
			mes "ふむ？";
			mes "ドリリロガンド、どうした？";
			next;
			mes "‐ドリリロガンドが";
			mes "　パモスガンドをじろじろ見る。";
			mes "　どういうことなのかパモスガンドは";
			mes "　理解したようだ‐";
			setquest 131264;
			compquest 131264;
		}
		while(1) {
			next;
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(古代の氷の峡谷 東部)") == 2) {
				mes "^ff0000‐移動には500Zenyが必要です‐^000000";
				next;
				if(!checkquest(8844) && !checkquest(8845)) {
					mes "[パモスガンド]";
					mes "依頼をちゃんと確認する前に";
					mes "現地に向かっていいのか？";
					continue;
				}
				mes "[パモスガンド]";
				mes "現地まで向かうのか？";
				mes "しっかり頼むぞ。";
				close2;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_back5j.gat", 15, 239;
				end;
			}
			break;
		}
		setarray '@questname$,"声の出ない答えの例示";
		setarray '@questid,8844;
		setarray '@coolid,8845;
		setarray '@itemlist,1001244,5;
		setarray '@gainlist,1001217,10;
		setarray '@explist,475000000,356250000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// 声の出ない答えの例示
			if(checkquest(8845)) {
				if(checkquest(8845)&2 == 0) {
					mes "[パモスガンド]";
					mes "ドリリロガンドの仕事も片付いたし";
					mes "討論しようじゃないか。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000声の出ない答えの例示^000000」";
					mes "は時間制限中です。^000000";
					close;
				}
			}
			if(checkquest(8844)) {
				if(checkquest(8844)&4 == 0 || countitem(1001244) < 5) {
					mes "[パモスガンド]";
					mes "忙しそうなドリリロガンドの代わりに";
					mes "^e5555e大きな灰色の羽根^000000を";
					mes "5個集めてきてくれ。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000声の出ない答えの例示^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close;
					}
					delquest 8844;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000声の出ない答えの例示^000000」";
					mes "を破棄しました。";
					close;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000声の出ない答えの例示^000000」";
				mes "<内容1>";
				mes "対象：<URL>グレーアイスウィンド<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>　10体";
				mes "の討伐と";
				next;
				mes "<内容2>";
				mes "アイテム：<ITEM>大きな灰色の羽根<INFO>1001244</INFO></ITEM>　5個";
				mes "の納品";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 9.5G ( 9500000000 )";
				mes "※475000000を20回受け取ります。";
				mes "JobExp 7.125G ( 7125000000 )";
				mes "※356250000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000声の出ない答えの例示^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close;
				}
				delitem 1001244,5;
				delquest 8844;
				setquest 8845;
				getitem 1001217,10;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				mes "[パモスガンド]";
				mes "もう来たのか？";
				mes "では、私と教理の討論を……。";
				next;
				mes "‐ドリリロガンドが素早く手を出して";
				mes "　頼んだ物を持って行った。";
				mes "　自分もさっさと退散した方が";
				mes "　よさそうだ‐";
				next;
				mes "[パモスガンド]";
				mes "おい、ちょっと！　下賤の者！";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 9.5G";
				mes "( 9500000000 )";
				mes "※475000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 7.125G";
				mes "( 7125000000 )";
				mes "※356250000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close;
			}
			mes "[パモスガンド]";
			mes "むぅ、ドリリロガンドが";
			mes "凄く忙しそうだから助けてあげなさい。";
			mes "^e5555e大きな灰色の羽根^000000を";
			mes "5個持ってくればいい。";
			mes "討論は他の上級ルガンともできるから。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000声の出ない答えの例示^000000」";
			mes "<内容1>";
			mes "対象：<URL>グレーアイスウィンド<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>　10体";
			mes "の討伐と";
			next;
			mes "<内容2>";
			mes "アイテム：<ITEM>大きな灰色の羽根<INFO>1001244</INFO></ITEM>　5個";
			mes "の納品の";
			mes "両方の達成で報告が可能です。";
			mes "クエストを受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[パモスガンド]";
				mes "中断だと？";
				mes "まったく、困った奴だ。";
				next;
				mes "[ドリリロガンド]";
				mes "……。";
				next;
				mes "‐ドリリロガンドは訴えるような眼で";
				mes "　こちらを見ていた……‐";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close;
			}
			setquest 8844;
			if(checkquest(8845)) delquest 8845;
			mes "‐本当に悟りを開いたのは";
			mes "　ドリリロガンドかも知れない……‐";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000声の出ない答えの例示^000000」";
			mes "を受注しました。";
			close;
		}
	}
	mes "‐今ここには、用事はなさそうだ‐";
	close;
OnQuestInfo:
	if(EP20_1QUE == 27 || EP20_1QUE == 28 || EP20_1QUE == 29)
		showevent 0, 1, "パモスガンド#ep20_DQ_7";
	else if(EP20_1QUE == 100 && checkquest(8844)&4 == 0 || countitem(1001244) < 5) {
		showevent 0, 3, "パモスガンド#ep20_DQ_7";
	}
	end;
}
jor_sanct.gat,258,117,5	script	ドリリロガンド#ep20_sub	10470,{/* 3682 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[上級ルガン]";
		mes "…………………。";
		close;
	}
	if(EP20_1QUE == 100) {	// 不明
		mes "‐ドリリロガンドは";
		mes "　こちらの気配を感じると、";
		mes "　振り向いて静かに微笑んだ‐";
		close;
	}
	mes "‐今ここには、用事はなさそうだ‐";
	close;
}
jor_sanct.gat,215,84,3	script	コミアガンド#ep20_sub	10475,{/* 3683 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[最上級ルガン]";
		mes "人間だ！　人間が現れたぞ！";
		close;
	}
	if(EP20_1QUE == 29) {
		mes "[コミアガンド]";
		mes "ううん？";
		mes "何か不都合はないか、だと？";
		mes "うむ～ここが狭くて小汚いと";
		mes "言い触らしたことがバレたのか？";
		next;
		mes "[コミアガンド]";
		mes "いや、今は大丈夫だ。";
		mes "少し狭いが……ラスガンド様が";
		mes "くださった場所だからな。";
		next;
		mes "[コミアガンド]";
		mes "ガミラバガンドも";
		mes "勉強への意欲が溢れて……";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ………",1;
		next;
		mes "[コミアガンド]";
		mes "おい、ガミラバガンド！";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: あっ、はい！",1;
		next;
		mes "[コミアガンド]";
		mes "……私は、どこまで話したかな？";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: あ…だから。英雄ブラタガンドの話でした。",1;
		next;
		mes "[コミアガンド]";
		mes "ブラタガンド？";
		mes "その話は、この前して";
		mes "お前は拍手までしたじゃないか。";
		next;
		mes "[コミアガンド]";
		mes "ブラタガンドの次にスラギガンドと";
		mes "ミタシガンド……";
		mes "そしてシナミガンド……までは";
		mes "話をした覚えがあるんだが？";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ああ……",1;
		next;
		mes "[コミアガンド]";
		mes "もしかして……寝てたのか？";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ヒイッ。",1;
		next;
		mes "[コミアガンド]";
		mes "寝てたな？";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ち、違います！",1;
		next;
		mes "[コミアガンド]";
		mes "ハァ～……";
		mes "おい、そこのお前。";
		mes "下賤の者。";
		next;
		if(select("周囲を見回す","答える") == 1) {
			mes "[コミアガンド]";
			mes "お前以外に誰がいる？";
			mes "そう、お前だよ、お前。";
			next;
			menu "はい？",-;
		}
		mes "[コミアガンド]";
		mes "よし、いい返事だ。";
		mes "さきほど不都合はないと言ったが";
		mes "今できた。";
		mes "お前、少し勉強しよう。";
		mes "私たちルガンの歴史についてだ。";
		next;
		mes "[コミアガンド]";
		mes "ガミラバガンド、";
		mes "お前は……後でどうしてやろうか……";
		mes "しばらく、そこで反省していなさい！";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: はい…",1;
		next;
		mes "[コミアガンド]";
		mes "私たちがどうやって";
		mes "この世界に生まれた種族なのかは";
		mes "知ってるだろ？";
		next;
		mes "[コミアガンド]";
		mes "しかし教理の勉強が";
		mes "各自の意欲に任されていた所為で";
		mes "ここに来れたのにも関わらず";
		mes "ガミラバガンドのような子がいる。";
		next;
		mes "[コミアガンド]";
		mes "しかしそれは";
		mes "ガミラバガンドの責任ではない。";
		mes "今まで私に出会えなかった所為だ。";
		mes "お前は……そう……";
		mes "過去の他のルガンたちについて";
		mes "聞いたことがあるか？";
		next;
		menu "ベルナガンドの説法は聞いた",-;
		mes "[コミアガンド]";
		mes "ベルナガンド！";
		mes "ああ……そう。";
		mes "気が早くて粗暴な……";
		mes "そうでない振りをするが";
		mes "本性が丸見えの奴だよな。";
		next;
		mes "[コミアガンド]";
		mes "恐らくそれが原因でラスガンド様は";
		mes "奴をここに連れて来なかったのだろう。";
		next;
		menu "詳しく聞く",-;
		mes "[コミアガンド]";
		mes "その可能性が高い……。";
		next;
		mes "‐コミアガンドは少し考え込んだ‐";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ……。",1;
		next;
		mes "‐コミアガンドは少し考え込んだ‐";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ぐうぐう……。",1;
		next;
		mes "‐ガミラバガンドは";
		mes "　壁に寄りかかって眠っている‐";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: スヤスヤ……。",1;
		next;
		mes "[コミアガンド]";
		mes "結構前の話だが";
		mes "ラスガンド様の傍には";
		mes "アレイガンドと私と……";
		mes "パモスガンドという奴がいた。";
		mes "……それ以外にもいたかもしれないな。";
		next;
		mes "[コミアガンド]";
		mes "長い時間が経つと";
		mes "私の記憶も曖昧だ。";
		mes "とにかく、その時はラスガンド様が";
		mes "自ら何でもやっていた。";
		mes "孵化場管理から、細かい面倒見まで。";
		next;
		mes "[コミアガンド]";
		mes "暗い洞窟の中に生まれた私たちを励まし";
		mes "自信を持つようにと。";
		mes "全ての教えを受け入れながら";
		mes "私はヨルムンガンド教団の一員として";
		mes "誇りを持っていた。";
		next;
		mes "[コミアガンド]";
		mes "やがて、大地の魔力が少なくなり";
		mes "主教が殆ど増えなくなった頃になると";
		mes "ラスガンド様は自ら行っていた仕事を";
		mes "私たちに任せるようになった。";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: うみゃ。",1;
		next;
		mes "[コミアガンド]";
		mes "例えば、孵化場に寄って";
		mes "司祭を教育されたりする仕事を。";
		mes "今からでは想像もできないことだ。";
		next;
		mes "[コミアガンド]";
		mes "それからは、ラスガンド様に";
		mes "直接会うことも難しくなった。";
		mes "そこのガミラバガンドは";
		mes "一度もお会いしたことが無いと言う。";
		mes "お前もそうだろう？";
		next;
		menu "はい",-,"そうです",-;
		mes "[コミアガンド]";
		mes "私達は生まれ持つ知識と";
		mes "デパナガンドの出生者教育により";
		mes "司祭たちを養成することになった。";
		mes "だが、ブラタガンドはもちろん";
		mes "スラギガンドの名前を知る司祭たちは";
		mes "一部に過ぎなくなった。";
		next;
		mes "[コミアガンド]";
		mes "私たちは人間たちが持たない";
		mes "魔法的な能力があるのだが";
		mes "記録を残すという発想はなかった。";
		mes "ラスガンド様がすべてのことを";
		mes "覚えていらっしゃったから、なおさら。";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: スヤ…スヤ…",1;
		next;
		mes "[コミアガンド]";
		mes "シナミガンドの言葉に";
		mes "耳を傾けるべきだった……。";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ぐうぐう…",1;
		next;
		mes "[コミアガンド]";
		mes "それができていれば";
		mes "ベルナガンドのように粗暴な子が";
		mes "生まれることは無かっただろうに。";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: もぐもぐ…",1;
		next;
		mes "[コミアガンド]";
		mes "しかも今は……";
		mes "ラスガンド様は外から来た人間たちと";
		mes "手を組んでしまわれた。";
		mes "果たして奴らは私たちを";
		mes "本当に助けてくれるのだろうか？";
		mes "何か企んでいるのではないか？";
		next;
		mes "[コミアガンド]";
		mes "………";
		mes "今の話は聞かなかったことにしてくれ。";
		mes "ちょっと口が滑ってしまった。";
		next;
		if(select("私もそう思います","何も聞いていない") == 2) {
			mes "[コミアガンド]";
			mes "わかった、下賤の子よ。";
			mes "また話を聞きに来なさい。";
			close;
		}
		mes "[コミアガンド]";
		mes "………。";
		mes "　";
		mes "‐コミアガンドは口を閉ざし";
		mes "　何かを考え出した。";
		mes "　やがて溜め息を吐き、話を続けた‐";
		next;
		mes "[コミアガンド]";
		mes "……ラスガンド様が最近";
		mes "何を考えてらっしゃるのか解らない。";
		next;
		mes "[コミアガンド]";
		mes "私も長くラスガンド様の傍にいた。";
		mes "誰も覚えていないであろう";
		mes "シナミガンドやスラギガンドが死して";
		mes "ラスガンド様の元に還るのも";
		mes "この目で見た。";
		next;
		mes "[コミアガンド]";
		mes "しかし、ベルナガンドのような";
		mes "幼い子たちにそんな話をすると";
		mes "そんなことを敢えて言う必要があるのか";
		mes "と言われる。";
		next;
		mes "[コミアガンド]";
		mes "……アレイガンドは";
		mes "これ以上私たちには";
		mes "変化も発展もないと言った。";
		mes "……どういう意味なのか";
		mes "私にも分かるよ。";
		next;
		mes "[コミアガンド]";
		mes "では、何をすべきだろうか？";
		mes "毎日ただ食べて";
		mes "寝るだけでいいのだろうか？";
		mes "ラスガンド様の望みが";
		mes "なんであるのか知らないまま？";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: うみゃ。",1;
		next;
		if(select("ガミラバガンドの肩を叩く","じっとしている") == 2) {
			mes "[コミアガンド]";
			mes "……下賤の子よ、また後で話そう。";
			mes "どこまで話したのか";
			mes "忘れてしまったよ。";
			close;
		}
		mes "‐全く反応が無い。";
		mes "　ガミラバガンドは熟睡中だ‐";
		next;
		mes "[コミアガンド]";
		mes "……。";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: ぐうぐう…",1;
		next;
		mes "[コミアガンド]";
		mes "ガミラバガンドや！";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: うわっ！",1;
		next;
		mes "[コミアガンド]";
		mes "説法をするぞ！";
		unittalk getnpcid(0,"ガミラバガンド#ep20_sub"),"ガミラバガンド: わ、私ひとりで聞くんですか？",1;
		next;
		mes "[コミアガンド]";
		mes "この子は、話を十分に聞いた。";
		mes "はぁ……みんなお前のように";
		mes "賢ければ良かったのに……";
		mes "昔話を聞いてくれてありがとう。";
		next;
		chgquest 8841,8842;
		set EP20_1QUE,30;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
	}
	if(EP20_1QUE == 30) {
		mes "[コミアガンド]";
		mes "はぁ……みんなお前のように";
		mes "賢ければ良かったのに……";
		mes "昔話を聞いてくれてありがとう。";
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 190, 123;
		end;
	}
	mes "‐コミアガンドはガミラバガンドに";
	mes "　絶えず何かを教えている‐";
	close;
OnQuestInfo:
	if(EP20_1QUE == 29 || EP20_1QUE == 30)
		showevent 0, 1, "コミアガンド#ep20_sub";
	end;
}
jor_sanct.gat,218,86,5	script	ガミラバガンド#ep20_sub	10471,{/* 3684 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[上級ルガン]";
		mes "人間!?";
		mes "どうやってここに！";
		close;
	}
	mes "[ガミラバガンド]";
	mes "はぁぁぁ……";
	mes "……。";
	next;
	mes "‐立ったまま眠っている。";
	mes "　死ぬほど疲れてるみたいだ‐";
	close;
}
jor_sanct.gat,190,128,5	script	ホシビガンド#ep20_sub	10474,{/* 3685 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[最上級ルガン]";
		mes "人間だ！　人間が現れたぞ！";
		close;
	}
	if(EP20_1QUE == 30) {
		mes "[ホシビガンド]";
		mes "何か用か、下賤の者。";
		mes "このホシビガンドは苦悩している。";
		next;
		mes "[ホシビガンド]";
		mes "こんなにも狭い洞窟の中で";
		mes "永遠に近い余生を";
		mes "送らなきゃならないこと！";
		mes "それが我が種族の苦しみ！";
		next;
		mes "[ホシビガンド]";
		mes "しかし、このすべての苦悩を";
		mes "ラスガンド様が御救いくださるのだ！";
		mes "下賤の者よ、お前は信じるか？";
		next;
		menu "はい、はい？私ですか？",-,"信じます",-;
		mes "[ホシビガンド]";
		mes "私は！";
		mes "ラスガンド様の最側近として！";
		mes "この暗い洞窟まで";
		mes "ラスガンド様をお連れした！";
		next;
		mes "[ホシビガンド]";
		mes "ところが、ラスガンド様は";
		mes "外から来た人間やパモスガンド";
		mes "コミアガンドみたいな者に囲まれ";
		mes "このホシビガンドと共に";
		mes "人間討伐の計画を進めることが";
		mes "できずにおられる！";
		next;
		mes "[ホシビガンド]";
		mes "この悔しさを、どうすれば良い!?";
		mes "下賤の者よ、お前もそう思わないか？";
		next;
		if(select("その通りであります","わからないであります") == 2) {
			mes "["+strcharinfo(0)+"]";
			mes "わからないであります！";
			next;
			mes "[ホシビガンド]";
			mes "……そうだよな。";
			mes "　";
			mes "‐ホシビガンドは滅入って";
			mes "　口を閉ざした‐";
			close;
		}
		mes "‐適当に機嫌を取ることにした‐";
		unittalk getcharid(3),strcharinfo(0)+" : まったくもってその通り……？",1;
		next;
		mes "[ホシビガンド]";
		mes "ええいっ、頭にくる！";
		mes "デパナガンド、アレイガンドみたいな";
		mes "愚か者たちを置いて来たと聞いて";
		mes "喜んでいたのに！";
		mes "コミアガンドが付いて来るとは！";
		next;
		mes "[ホシビガンド]";
		mes "このホシビガンドの秘められし力が";
		mes "覚醒したなら";
		mes "あの半端者たちを全部追い出し";
		mes "ラスガンド様の右手……";
		mes "いや！　槍に盾に！　斧となり！";
		next;
		mes "[ホシビガンド]";
		mes "一騎当千の力で";
		mes "人間どもを成敗できるのに！";
		mes "私がラスガンド様を";
		mes "約束された勝利へ導くその日は";
		mes "もうすぐなのに！";
		next;
		mes "[ホシビガンド]";
		mes "悔しい！";
		mes "あと少し……";
		mes "もう少しだけ時間があったなら！";
		mes "……お前は最上級じゃないから";
		mes "わからないだろうがな！";
		next;
		if(select("とても気になるであります！","わからないであります") == 2) {
			mes "["+strcharinfo(0)+"]";
			mes "わからないであります！";
			next;
			mes "[ホシビガンド]";
			mes "……そうだよな。";
			mes "　";
			mes "‐ホシビガンドは滅入って";
			mes "　口を閉ざした‐";
			close;
		}
		mes "‐気になる振りをした‐";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "何をですか？";
		next;
		mes "[ホシビガンド]";
		mes "お前みたいな下賤の者は";
		mes "当然知らないはずだ。";
		mes "脱皮する時に感じれる全能感！";
		next;
		mes "[ホシビガンド]";
		mes "新しい私が、再び足を踏み出す";
		mes "その感触！";
		mes "どうだ、お前にはわからないだろう！";
		unittalk getcharid(3),strcharinfo(0)+" : 脱皮とか……うわぁ……！",1;
		next;
		mes "[ホシビガンド]";
		mes "脱皮して強くなった私の力は";
		mes "ラスガンド様のための力！";
		unittalk getcharid(3),strcharinfo(0)+" : パチパチパチ。",1;
		next;
		mes "[ホシビガンド]";
		mes "……わかってくれるのか？";
		mes "このホシビガンドの忠誠心を！";
		next;
		mes "[ホシビガンド]";
		mes "嬉しいなぁ……";
		mes "　";
		mes "‐ホシビガンドは";
		mes "　ほろほろと涙を流した‐";
		next;
		mes "[ホシビガンド]";
		mes "……私はラスガンド様の趣味や";
		mes "特技をよく知っている。";
		mes "好きなものや嫌いなものも知っている。";
		mes "……気になるか？";
		next;
		menu "はい",-;
		mes "[ホシビガンド]";
		mes "ふふ……だと思ったよ。";
		mes "しかし、教える訳にはいかない。";
		mes "それらを知るために";
		mes "私がどれだけ苦労したか！";
		next;
		menu "教えてください",-;
		mes "[ホシビガンド]";
		mes "私の忠誠心を理解してくれたお前には";
		mes "特別に教えてあげよう。";
		mes "ラスガンド様は実は……。";
		next;
		mes "‐相当に意外な話を聞いた。";
		mes "　しかし、ラスガンドも";
		mes "　食事を取るというような";
		mes "　役に立たない情報もあった‐";
		next;
		mes "[ホシビガンド]";
		mes "ふ……どうだ、下賤の者よ。";
		mes "このような素晴らしい事実を知れば";
		mes "ますますラスガンド様のことが";
		mes "好きになっただろう。";
		next;
		mes "[ホシビガンド]";
		mes "ところで私は";
		mes "<ITEM>[大きな白色の羽根]<INFO>1001245</INFO></ITEM>を収集している。";
		mes "^ff00001個^000000持ってきたら";
		mes "もっと凄い事を教えてあげよう。";
		mes "どうだ、ラスガンド様の秘密……！";
		next;
		menu "ラスガンド様の……秘密！",-;
		mes "[ホシビガンド]";
		mes "<ITEM>[大きな白色の羽根]<INFO>1001245</INFO></ITEM>";
		mes "^ff00001個^000000を持って来てくれ。";
		mes "^0000ff古代の氷の峡谷 西部^000000にいる";
		mes "あの憎らしい";
		mes "^0000ffホワイトアイスウィンド^000000を狩れば";
		mes "手に入るはずだ。さあ、行ってこい！";
		close2;
		chgquest 8842,131255;
		set EP20_1QUE,31;
		end;
	}
	if(EP20_1QUE == 31) {
		if(countitem(1001245) < 1) {
			mes "[ホシビガンド]";
			mes "<ITEM>[大きな白色の羽根]<INFO>1001245</INFO></ITEM>";
			mes "^ff00001個^000000を持って来てくれ。";
			mes "^0000ff古代の氷の峡谷 西部^000000にいる";
			mes "あの憎らしい";
			mes "^0000ffホワイトアイスウィンド^000000を狩れば";
			mes "手に入るはずだ。さあ、行ってこい！";
			close;
		}
		mes "[ホシビガンド]";
		mes "私の忠誠心に惚れ込んだ";
		mes "下賤の者じゃないか！";
		mes "この私が、ラスガンド様の右手！";
		mes "ホシビガンド!!";
		next;
		menu "そうですとも！",-;
		mes "["+strcharinfo(0)+"]";
		mes "もちろん、そうですとも！";
		next;
		delitem 1001245,1;
		chgquest 131255,8854;
		set EP20_1QUE,32;
		mes "[ホシビガンド]";
		mes "よし！　これを持ってきたお前に";
		mes "さらに大きな秘密を教えよう。";
		mes "なんと！　ラスガンド様は";
		mes "一日四時間お休みになる!!";
		mes "ふ……なんて尊い。";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "……はい？";
		next;
		mes "[ホシビガンド]";
		mes "あまりの驚きに言葉も出ないか？";
		mes "私もそうだった。";
		next;
		mes "[ホシビガンド]";
		mes "ラスガンド様だから可能なことで";
		mes "私たちのような存在は";
		mes "真似することすらできない。";
		mes "くれぐれも真似しようとするなよ。";
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 96, 143;
		end;
	}
	if(EP20_1QUE == 32) {
		mes "[ホシビガンド]";
		mes "ラスガンド様だから可能なことで";
		mes "私たちのような存在は";
		mes "真似することすらできない。";
		mes "くれぐれも真似しようとするなよ。";
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 96, 143;
		end;
	}
	mes "[ホシビガンド]";
	mes "今は機嫌が悪い……";
	mes "私に近づくんじゃない……！";
	close;
OnQuestInfo:
	if(EP20_1QUE == 31 && countitem(1001245) < 1)
		showevent 0, 2, "ホシビガンド#ep20_sub";
	else if(EP20_1QUE == 30 || EP20_1QUE == 31 || EP20_1QUE == 32)
		showevent 0, 1, "ホシビガンド#ep20_sub";
	end;
}
jor_sanct.gat,101,138,5	script	エリリガンド#ep20_sub	10475,{/* 3686 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[最上級ルガン]";
		mes "ここに人間がいるぞ！";
		close;
	}
	if(EP20_1QUE == 32) {
		mes "[エリリガンド]";
		mes "うん？　どうしたの？";
		next;
		menu "手伝えることはありませんか？",-;
		mes "[エリリガンド]";
		mes "ううん？";
		mes "あら、初めて見る子ね。";
		next;
		mes "[エリリガンド]";
		mes "キミ、ここにはどうやって来たの？";
		mes "ラスガンド様が選ばれたわけでは";
		mes "無さそうだし……";
		mes "労務のために連れて来られたのね？";
		next;
		menu "そうだと思います",-;
		mes "[エリリガンド]";
		mes "素直な子だね。";
		mes "うむ……ううむ。";
		next;
		mes "[エリリガンド]";
		mes "ああ！";
		mes "可哀想なサレクガンド！";
		emotion 28,"エリリガンド#ep20_sub",1;
		next;
		mes "‐目の前の最上級ルガンは";
		mes "　いきなり涙を流しながら";
		mes "　大声を出した‐";
		next;
		mes "[エリリガンド]";
		mes "私たちがどうしてここに";
		mes "来たのか知ってる？";
		mes "サレクガンドもホシビガンドも皆";
		mes "ラスガンド様の寵愛だと";
		mes "思っているようだけど……。";
		next;
		mes "[エリリガンド]";
		mes "……私たちはラスガンド様の";
		mes "お弁当に過ぎない。";
		mes "きっとラスガンド様は私たちを";
		mes "必要な時に食べちゃうために";
		mes "連れて来たに違いないわ！";
		next;
		mes "[エリリガンド]";
		mes "ああ、なんて……。";
		next;
		mes "[エリリガンド]";
		mes "なんて素晴らしいことなの!!";
		mes "こんな栄光なこと他にないわ！";
		next;
		mes "‐エリリガンドはすでに泣き止み";
		mes "　代わりにうっとりした表情で";
		mes "　笑みを浮かべている。";
		mes "　こんな澄んだ瞳のルガンは";
		mes "　見たことがない‐";
		next;
		mes "[エリリガンド]";
		mes "私たちはルガンは";
		mes "すべてラスガンド様から生まれた。";
		mes "ラスガンド様の血から生まれたのよ。";
		next;
		mes "[エリリガンド]";
		mes "ルガンとは、ラスガンド様の血！";
		mes "ラスガンド様に属するもの！";
		mes "そして、いつかラスガンド様の元に";
		mes "還るべきものよ！";
		next;
		mes "[エリリガンド]";
		mes "私たちに知性があるのは";
		mes "ラスガンド様に捧げる魔力を";
		mes "自ら手に入れるためだわ！";
		next;
		mes "[エリリガンド]";
		mes "そうでしょ？";
		mes "キミは、どう思う？";
		mes "　";
		mes "‐澄んだ瞳をキラキラさせて";
		mes "　エリリガンドが聞いてくる‐";
		next;
		switch(select("何を仰ってるのか、よく解りません","わかります","忘れてしまいました")) {
		case 1:
			mes "[エリリガンド]";
			mes "あらまぁ……";
			mes "下級ルガンみたいな者たちを";
			mes "食べちゃっても誰も";
			mes "何とも言わない理由を考えてごらん。";
			mes "奴らが弱いから？";
			break;
		case 2:
			mes "[エリリガンド]";
			mes "わかる……？";
			mes "わかってて尚、逃げ出さない？";
			mes "ラスガンド様に魔力を捧げることは";
			mes "魔力核を持ってくるとか";
			mes "そんなことではないよ？";
			next;
			mes "[エリリガンド]";
			mes "下級ルガンみたいな者たちを";
			mes "食べちゃっても誰も";
			mes "何とも言わない理由を考えてごらん。";
			mes "奴らが弱いから？";
			break;
		case 3:
			mes "[エリリガンド]";
			mes "キミの仕事は何だったのか";
			mes "覚えてないの？";
			mes "私の話をもう一度よく聞いて。";
			close;
		}
		next;
		mes "[エリリガンド]";
		mes "弱いから食べてもいいとしたら……";
		mes "私がお前を食べても構わないでしょ？";
		next;
		mes "[エリリガンド]";
		mes "でもそれだと効率がよくない。";
		mes "お前は仕事ができるのだから";
		mes "敢えてそうする必要がない。";
		next;
		mes "‐エリリガンドは、笑った。";
		mes "　人間と違い、奇妙で完璧な笑みだ‐";
		next;
		mes "[エリリガンド]";
		mes "最上級ルガンはなぜ";
		mes "働く代わりに教理を勉強している？";
		mes "考えてみたことはない？";
		next;
		mes "[エリリガンド]";
		mes "仕事で無駄に疲労せず";
		mes "魔力を上手く蓄積させておいて……";
		mes "ラスガンド様が望まれた";
		mes "最高のタイミングで";
		mes "その溜め込んだ魔力を提供する。";
		next;
		mes "[エリリガンド]";
		mes "遠出する際に持って行く";
		mes "魔力核のように……";
		mes "最高の……お弁当。";
		next;
		mes "[エリリガンド]";
		mes "……フフフ。";
		mes "……アハハハ！";
		mes "キミはどう思う？";
		mes "この光栄なる真実について！";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "……本当ですか？";
		next;
		mes "[エリリガンド]";
		mes "何で私が嘘を吐くの？";
		mes "キミも私が嘘を吐いてると思ってるの？";
		mes "　";
		mes "‐事実のように思えるが";
		mes "　エリリガンドも正常ではなさそうだ‐";
		next;
		menu "よく解りません",-,"他の方たちは何と…",-;
		mes "[エリリガンド]";
		mes "キミも……私を信じていないんだね？";
		mes "ラスガンド様の一番近くにいる";
		mes "この私を信じない？";
		mes "キミもホシビガンドと同じだね!!";
		next;
		mes "[エリリガンド]";
		mes "キミみたいなのは、";
		mes "パクっと食べてしまおうかっ！";
		mes "　";
		mes "‐突然、飛び掛ってきたエリリガンドに";
		mes "　手の甲を噛まれた！‐";
		unittalk getcharid(3),strcharinfo(0)+" : 痛ッ!!",1;
		next;
		mes "[エリリガンド]";
		mes "……。";
		next;
		mes "[エリリガンド]";
		mes "……血は出なかったよね？";
		mes "……ごめんね。";
		next;
		mes "[エリリガンド]";
		mes "アハハハ……";
		mes "……どうして誰も信じてくれないの。";
		mes "　";
		mes "‐エリリガンドはもう何も見ていない。";
		mes "　ただ笑ってるだけだった‐";
		next;
		chgquest 8854,131256;
		set EP20_1QUE,33;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 261, 155;
		end;
	}
	if(EP20_1QUE >= 33) {
		mes "[エリリガンド]";
		mes "……フフフ……アハハハ。";
		mes "　";
		mes "‐再び話しかけようとしたが";
		mes "　エリリガンドは涙を流しながら";
		mes "　笑ってるだけで反応はなかった‐";
		if(EP20_1QUE > 33)	//不明
			close;
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 261, 155;
		end;
	}
	mes "[エリリガンド]";
	mes "……フフフ……アハハ。";
	close;
OnQuestInfo:
	if(EP20_1QUE == 32 || EP20_1QUE == 33)
		showevent 0, 1, "エリリガンド#ep20_sub";
	end;
}
jor_sanct.gat,271,156,3	script	ナシオラミガンド#ep20_sub	21529,{/* 3687 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[中級ルガン]";
		mes "ニンゲンだ!!!";
		close;
	}
	if(EP20_1QUE == 33) {
		mes "‐落ち着かない様子で";
		mes "　輪になっている";
		mes "　中級ルガンたちがいる‐";
		next;
		if(select("話しかける","知らないふりをする") == 2) {
			mes "‐知らないふりをした‐";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "何をしているの？";
		next;
		mes "[ナシオラミガンド]";
		mes "……！";
		mes "司祭様だっ！";
		unittalk getnpcid(0,"ヌカサイカガンド#ep20_sub"),"ヌカサイカガンド : 司祭様！",1;
		unittalk getnpcid(0,"オネチラメガンド#ep20_sub"),"オネチラメガンド : 司祭様がいらっしゃった！",1;
		unittalk getnpcid(0,"ザルダクミガンド#ep20_sub"),"ザルダクミガンド : 司祭様！",1;
		next;
		mes "[ナシオラミガンド]";
		mes "仕事を……ください。";
		mes "私たち、仕事をしなきゃならないのに";
		mes "仕事がありません。";
		unittalk getnpcid(0,"オネチラメガンド#ep20_sub"),"オネチラメガンド : 不安なんです…",1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "自分たちで仕事を探せば良いのでは？";
		mes "掃除とか……。";
		next;
		mes "[ナシオラミガンド]";
		mes "それは私たちの権限外です、司祭様。";
		unittalk getnpcid(0,"ヌカサイカガンド#ep20_sub"),"ヌカサイカガンド : 命令なしで仕事をしたら叱られます。",1;
		next;
		if(select("中級ルガンの仕事？","後で見つけてあげよう") == 2) {
			mes "‐後でまた来るとしよう‐";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "（中級ルガンにできそうな仕事？）";
		next;
		switch(select("掃除","孵化場のお世話","ノイローゼになった最上級ルガンを慰める")) {
		case 1:
			mes "‐物寂しい室内を見渡してみる。";
			mes "　蛇の巣も生活感のない場所だったが";
			mes "　ここは本当に、ただの洞窟だ‐";
			break;
		case 2:
			mes "‐ここには孵化場はないようだ。";
			mes "　ラスガンドはもう";
			mes "　ルガンを増やすつもりは";
			mes "　無いかもしれない‐";
			break;
		case 3:
			mes "‐最上級ルガンには必ず一人は";
			mes "　お付きの部下がいた気がする。";
			mes "　みんな適当にやってるだろうか‐";
			break;
		}
		next;
		menu "以前は何をしていたか聞いてみる",-;
		mes "[ナシオラミガンド]";
		mes "掃除です。";
		next;
		mes "[ヌカサイカガンド]";
		mes "孵化場のお世話です。";
		next;
		mes "[クゼイナモガンド]";
		mes "エリリガンド様のお世話をする";
		mes "予定でしたが尻尾を噛まれて……";
		mes "サレクガンド様にここで待機するよう";
		mes "言われたままです。";
		next;
		mes "[ザルダクミガンド]";
		mes "掃除です。";
		next;
		mes "[オネチラメガンド]";
		mes "倉庫管理です。";
		next;
		if(select("仕事を探してみる","後で見つけてあげよう") == 2) {
			mes "‐後でまた来るとしよう‐";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "私が仕事を探してこよう。";
		mes "ここで待つように。";
		unittalk getnpcid(0,"ナシオラミガンド#ep20_sub"),"ナシオラミガンド : はい、司祭様！",1;
		unittalk getnpcid(0,"ヌカサイカガンド#ep20_sub"),"ヌカサイカガンド : はいっ、司祭様！",1;
		unittalk getnpcid(0,"オネチラメガンド#ep20_sub"),"オネチラメガンド : は、はいっ、司祭様！",1;
		unittalk getnpcid(0,"ザルダクミガンド#ep20_sub"),"ザルダクミガンド : はい！　司祭様！",1;
		unittalk getnpcid(0,"クゼイナモガンド#ep20_sub"),"クゼイナモガンド : わかりました、司祭様！",1;
		next;
		mes "‐おろおろしている中級ルガンたちの";
		mes "　仕事を探すことになった。";
		mes "　「蛇神の根源 聖域」「蛇神の根源」で";
		mes "　任せられそうな仕事を見つけよう‐";
		next;
		chgquest 131256,8846;
		set EP20_1QUE,34;
		mes "‐作業が必要な場所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐作業が必要な場所へ";
		mes "　向かった‐";
		close2;
		switch(EP20_1QUE) {
		case 34: warp "jor_sanct.gat", 53, 159;	break;
		case 35: warp "jor_sanct.gat", 95, 147;	break;
		case 36: warp "jor_root2.gat", 17, 177;	break;
		case 37: warp "jor_root2.gat", 237, 129;	break;
		case 38: warp "jor_root2.gat", 149, 120;	break;
		}
		end;
	}
	if(EP20_1QUE >= 34 && EP20_1QUE <= 38) {
		mes "["+strcharinfo(0)+"]";
		mes "私が仕事を探してこよう。";
		mes "ここで待つように。";
		unittalk getnpcid(0,"ナシオラミガンド#ep20_sub"),"ナシオラミガンド : はい、司祭様！",1;
		unittalk getnpcid(0,"ヌカサイカガンド#ep20_sub"),"ヌカサイカガンド : はいっ、司祭様！",1;
		unittalk getnpcid(0,"オネチラメガンド#ep20_sub"),"オネチラメガンド : は、はいっ、司祭様！",1;
		unittalk getnpcid(0,"ザルダクミガンド#ep20_sub"),"ザルダクミガンド : はい！　司祭様！",1;
		unittalk getnpcid(0,"クゼイナモガンド#ep20_sub"),"クゼイナモガンド : わかりました、司祭様！",1;
		next;
		mes "‐おろおろしている中級ルガンたちの";
		mes "　仕事を探すことになった。";
		mes "　「蛇神の根源 聖域」「蛇神の根源」で";
		mes "　任せられそうな仕事を見つけよう‐";
		next;
		mes "‐作業が必要な場所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐作業が必要な場所へ";
		mes "　向かった‐";
		close2;
		switch(EP20_1QUE) {
		case 34: warp "jor_sanct.gat", 53, 159;	break;
		case 35: warp "jor_sanct.gat", 95, 147;	break;
		case 36: warp "jor_root2.gat", 17, 177;	break;
		case 37: warp "jor_root2.gat", 237, 129;	break;
		case 38: warp "jor_root2.gat", 149, 120;	break;
		}
		end;
	}
	if(EP20_1QUE == 39) {
		mes "‐中級ルガンたち全員の";
		mes "　仕事を見つけることができた‐";
		next;
		mes "[ナシオラミガンド]";
		mes "私達はもう大丈夫です。";
		mes "そう言えば、サレクガンド様が";
		mes "探しておられるそうです。";
		mes "お会いになってはいかがですか？";
		next;
		chgquest 8851,8840;
		set EP20_1QUE,40;
		mes "‐サレクガンドのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐サレクガンドのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 152, 166;
		end;
	}
	if(EP20_1QUE == 40) {
		mes "[ナシオラミガンド]";
		mes "私達はもう大丈夫です。";
		mes "そう言えば、サレクガンド様が";
		mes "探しておられるそうです。";
		mes "お会いになってはいかがですか？";
		next;
		mes "‐サレクガンドのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐サレクガンドのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 152, 166;
		end;
	}
	mes "[ナシオラミガンド]";
	mes "私達はもう大丈夫です。";
	close;
OnQuestInfo:
	if(EP20_1QUE == 33 || EP20_1QUE == 34 || EP20_1QUE == 39 || EP20_1QUE == 40)
		showevent 0, 1, "ナシオラミガンド#ep20_sub";
	end;
}
jor_sanct.gat,264,160,5	script	ヌカサイカガンド#ep20_sub	21529,{/* 3688 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	if(EP20_1QUE == 35)	//未確認
		end;
	if(EP20_1QUE == 36) {	//不明
		mes "[ヌカサイカガンド]";
		mes "やるべき事ができて";
		mes "安心しました。";
		close;
	}
	mes "[ヌカサイカガンド]";
	mes "やるべき事……";
	mes "仕事が無ければ……";
	mes "不安なんです……。";
	close;
}
jor_sanct.gat,266,155,7	script	オネチラメガンド#ep20_sub	21529,{/* 3689 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	if(EP20_1QUE == 35)	//未確認
		end;
	if(EP20_1QUE == 36) {	//不明
		mes "[オネチラメガンド]";
		mes "やるべき事ができて";
		mes "安心しました。";
		close;
	}
	mes "[オネチラメガンド]";
	mes "仕事……";
	mes "仕事を……。";
	close;
}
jor_sanct.gat,268,160,3	script	ザルダクミガンド#ep20_sub	21529,{/* 3690 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	if(EP20_1QUE == 36)	//不明
		end;
	if(EP20_1QUE == 37) {
		mes "[ザルダクミガンド]";
		mes "やるべき事ができて";
		mes "安心しました。";
		close;
	}
	mes "[ザルダクミガンド]";
	mes "仕事をください……。";
	close;
}
jor_sanct.gat,267,161,5	script	クゼイナモガンド#ep20_sub	21529,{/* 3691 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	if(EP20_1QUE == 37)
		end;
	if(EP20_1QUE == 38) {
		mes "[クゼイナモガンド]";
		mes "やるべき事ができて";
		mes "安心しました。";
		close;
	}
	mes "[クゼイナモガンド]";
	mes "仕事……";
	mes "ください……。";
	close;
}
jor_root2.gat,12,172,0	script	safty2-2in	45,1,1,{/* 3692 */
	warp "jor_safty2.gat",199,369;
	end;
OnQuestInfo:
	if(EP20_1QUE == 36)
		showevent 0, 1, "safty2-2in";
	end;
}
jor_safty2.gat,199,371,0	warp	safty2-2out	1,1,jor_root2.gat,14,174
jor_root2.gat,242,124,0	script	safty2-3in	45,1,1,{/* 3694 */
	warp "jor_safty2.gat",297,368;
	end;
OnQuestInfo:
	if(EP20_1QUE == 37)
		showevent 0, 1, "safty2-3in";
	end;
}
jor_safty2.gat,295,369,0	warp	safty2-3out	1,1,jor_root2.gat,240,124
jor_root2.gat,149,125,0	script	safty2-6in	45,1,1,{/* 3696 */
	warp "jor_safty2.gat",310,245;
	end;
OnQuestInfo:
	if(EP20_1QUE == 38)
		showevent 0, 1, "safty2-6in";
	end;
}
jor_safty2.gat,310,243,0	warp	safty2-6out	1,1,jor_root2.gat,149,123

jor_sanct.gat,48,159,3	script	水溜まり#ep20_sub	10046,{/* 3698 */
	if(EP20_1QUE == 34) {
		mes "‐誰も管理していない水場だ‐";
		next;
		mes "‐誰も管理していない水場だ。";
		mes "　ナシオラミガンドを呼ぼうか？‐";
		next;
		cloakoffnpc "ナシオラミガンド#2";
		mes "[ナシオラミガンド]";
		mes "司祭様！";
		mes "仕事をくださり感謝します！";
		mes "綺麗にします！";
		unittalk getnpcid(0,"ナシオラミガンド#2"),"ナシオラミガンド : 楽しい！",1;
		next;
		mes "‐良いことをしたようで";
		mes "　誇らしい気分になった。";
		mes "　他の中級ルガンたちの仕事も";
		mes "　探してみよう-";
		next;
		chgquest 8846,8847;
		set EP20_1QUE,35;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 95, 147;
		end;
	}
	if(EP20_1QUE >= 35) {
		mes "‐世の中から隔離されたかのように";
		mes "　腐っていない水が溜まっている‐";
		if(EP20_1QUE > 35)
			close;
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 95, 147;
		end;
	}
	mes "‐溜まっている水は濁っているが";
	mes "　腐っているわけではないようだ‐";
	close;
OnQuestInfo:
	if(EP20_1QUE == 34 || EP20_1QUE == 35)
		showevent 0, 1, "水溜まり#ep20_sub";
	end;
}
jor_sanct.gat,95,152,3	script	塔#ep20_sub	10046,{/* 3699 */
	if(EP20_1QUE == 35) {
		mes "‐用途は不明だが";
		mes "　搭状の物体に塵が積もっている‐";
		next;
		mes "‐用途は不明だが";
		mes "　搭状の物体に塵が積もっている。";
		mes "　ヌカサイカガンドを呼ぼうか？";
		next;
		cloakoffnpc "ヌカサイカガンド#2";
		cloakonnpc "ヌカサイカガンド#ep20_sub";
		mes "[ヌカサイカガンド]";
		mes "司祭様が仕事をくださった！";
		mes "感謝します！";
		unittalk getnpcid(0,"ヌカサイカガンド#2"),"ヌカサイカガンド : 楽しい！",1;
		next;
		mes "‐良いことをしたようで";
		mes "　誇らしい気分になった。";
		mes "　他の中級ルガンたちの仕事も";
		mes "　探してみよう-";
		next;
		chgquest 8847,8848;
		set EP20_1QUE,36;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 17, 177;
		end;
	}
	if(EP20_1QUE >= 36) {
		mes "‐用途は不明だが";
		mes "　それなりに綺麗になった";
		mes "　搭状の物体がある‐";
		if(EP20_1QUE > 36)
			close;
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 17, 177;
		end;
	}
	mes "‐用途は不明だが";
	mes "　搭状の物体に塵が積もっている‐";
	close;
OnQuestInfo:
	if(EP20_1QUE == 35 || EP20_1QUE == 36)
		showevent 0, 1, "塔#ep20_sub";
	end;
}
jor_safty2.gat,195,355,3	script	ゴミ捨て場#ep20_sub	10046,{/* 3700 */
	if(EP20_1QUE == 36) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "‐この姿のままでは都合が悪い‐";
			close;
		}
		mes "‐滅茶苦茶に汚れたゴミ捨て場だ‐";
		next;
		mes "‐滅茶苦茶に汚れたゴミ捨て場だ。";
		mes "　オネチラメガンドを呼ぼうか？‐";
		next;
		cloakoffnpc "オネチラメガンド#2";
		cloakonnpc "オネチラメガンド#ep20_sub";
		mes "[オネチラメガンド]";
		mes "司祭様！　お仕事をくださった！";
		mes "感謝します！";
		unittalk getnpcid(0,"オネチラメガンド#2"),"オネチラメガンド : 楽しい！",1;
		next;
		chgquest 8848,8849;
		set EP20_1QUE,37;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
	}
	if(EP20_1QUE >= 37) {
		mes "‐少しだけ綺麗になった";
		mes "　ゴミ捨て場だ‐";
		if(EP20_1QUE > 37)
			close;
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 237, 129;
		end;
	}
	//未調査
	end;
OnQuestInfo:
	if(EP20_1QUE == 36 || EP20_1QUE == 37)
		showevent 0, 1, "ゴミ捨て場#ep20_sub";
	end;
}
jor_safty2.gat,303,349,3	script	山のようなガラクタ#ep20_sub	10046,{/* 3701 */
	if(EP20_1QUE == 37) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "‐この姿のままでは都合が悪い‐";
			close;
		}
		mes "‐ガラクタが山のように積まれている‐";
		next;
		mes "‐ガラクタが山のように積まれている。";
		mes "　ザルダクミガンドを呼ぼうか？‐";
		next;
		cloakoffnpc "ザルダクミガンド#2";
		cloakonnpc "ザルダクミガンド#ep20_sub";
		mes "[ザルダクミガンド]";
		mes "司祭様！";
		mes "仕事をくださり感謝します！";
		unittalk getnpcid(0,"ザルダクミガンド#2"),"ザルダクミガンド : 楽しい！",1;
		next;
		chgquest 8849,8850;
		set EP20_1QUE,38;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 149, 120;
		end;
	}
	if(EP20_1QUE >= 38) {
		mes "‐使いようのないガラクタが";
		mes "　集められている。";
		mes "　やはり使えるものは無いようだ‐";
		if(EP20_1QUE > 38)
			close;
		next;
		mes "‐次のルガンの手伝いへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐次のルガンの手伝いへ";
		mes "　向かった‐";
		close2;
		warp "jor_root2.gat", 149, 120;
		end;
	}
	//未調査
	end;
OnQuestInfo:
	if(EP20_1QUE == 37 || EP20_1QUE == 38)
		showevent 0, 1, "山のようなガラクタ#ep20_sub";
	end;
}
jor_safty2.gat,318,254,3	script	倉庫#ep20_sub	10046,{/* 3702 */
	if(EP20_1QUE == 38) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "‐この姿のままでは都合が悪い‐";
			close;
		}
		mes "‐まったく整理されていない倉庫だ‐";
		next;
		mes "‐まったく整理されていない倉庫だ。";
		mes "　クゼイナモガンドを呼ぼうか？‐";
		next;
		cloakoffnpc "クゼイナモガンド#2";
		cloakonnpc "クゼイナモガンド#ep20_s";
		mes "[クゼイナモガンド]";
		mes "感謝します、司祭様！";
		mes "仕事だ！";
		unittalk getnpcid(0,"クゼイナモガンド#2"),"クゼイナモガンド : 楽しい！",1;
		next;
		mes "‐良いことをしたようで";
		mes "　誇らしい気分になった。";
		mes "　クゼイナモガンドがどう片付けるのか";
		mes "　それはわからないが……‐";
		next;
		chgquest 8850,8851;
		set EP20_1QUE,39;
		mes "‐ナシオラミガンドのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐ナシオラミガンドのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 261, 156;
		end;
	}
	if(EP20_1QUE >= 39) {
		mes "‐まったく整理されていない倉庫だ。";
		mes "　整理することを誰もが";
		mes "　諦めてしまったのだろう‐";
		if(EP20_1QUE > 39)
			close;
		next;
		mes "‐ナシオラミガンドのもとへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ナシオラミガンドのもとへ";
		mes "　向かった‐";
		close2;
		warp "jor_sanct.gat", 261, 156;
		end;
	}
	mes "‐まったく整理されていない倉庫だ。";
	mes "　整理することを誰もが";
	mes "　諦めてしまったのだろう‐";
	close;
OnQuestInfo:
	if(EP20_1QUE == 38 || EP20_1QUE == 39)
		showevent 0, 1, "倉庫#ep20_sub";
	end;
}
jor_sanct.gat,46,157,3	script(CLOAKED)	ナシオラミガンド#2	21529,{/* 3703 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	mes "[ナシオラミガンド]";
	mes "ふぅ……後もう少し……。";
	close;
}
jor_sanct.gat,90,153,3	script(CLOAKED)	ヌカサイカガンド#2	21529,{/* 3704 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	mes "[ヌカサイカガンド]";
	mes "サッ……サッ…。";
	close;
}
jor_safty2.gat,191,358,5	script(CLOAKED)	オネチラメガンド#2	21529,{/* 3705 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	mes "[オネチラメガンド]";
	mes "よいしょ、よいしょ……。";
	close;
}
jor_safty2.gat,306,349,3	script(CLOAKED)	ザルダクミガンド#2	21529,{/* 3706 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	mes "[ザルダクミガンド]";
	mes "よいしょ、よいしょ……。";
	close;
}
jor_safty2.gat,314,254,5	script(CLOAKED)	クゼイナモガンド#2	21529,{/* 3707 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[ルガン]";
		mes "ニンゲン！　ニンゲンだ！";
		close;
	}
	mes "[クゼイナモガンド]";
	mes "よいしょ、よいしょ……。";
	close;
}

icas_in.gat,100,62,4	script	オリリョ鳥兵#ep20_DQ_2	21518,{/* 3708 */
	if(checkquest(202440)) {
		mes "[オリリョ鳥兵]";
		mes "分かりました。";
		mes "本日の合言葉をお伝えいたします。";
		mes "　";
		mes "本日の合言葉（問）："+'Question$['TodayQuestion];
		mes "本日の合言葉（答）："+'Answer$['TodayAnswer];
		next;
		mes "[オリリョ鳥兵]";
		mes "ご存じだとは思いますが";
		mes "流出防止のためどこにも書かずに";
		mes "必ず暗記してください。";
		next;
		if(select("クエストの受注や報告を行う","氷の城の入口に移動する(イスガルド 氷の城)") == 2) {
			mes "^ff0000‐移動には500Zenyが必要です‐^000000";
			next;
			mes "[オリリョ鳥兵]";
			mes "それでは、現地まで向かってください。";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "icecastle.gat", 55, 120;
			end;
		}
		setarray '@questname$,"スパイ捜索","諜報情報の回収";
		setarray '@questid,19162,19165;
		setarray '@questid2,19163,19166;
		setarray '@coolid,19164,19167;
		setarray '@gainlist,1001217,3,1001217,3;
		setarray '@explist,400000000,300000000,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist,'@questid2);
		// 以下個別処理
		switch('@sel) {
		case 0:	// スパイ捜索
			if(checkquest(19164)) {
				if(checkquest(19164)&2 == 0) {
					mes "[オリリョ鳥兵]";
					mes "私はエージェント殿の苦労を";
					mes "知っておりますが、";
					mes "これ以上は差し上げられません……。";
					mes "それでもよければ、";
					mes "また明日、手伝ってください。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000スパイ捜索^000000」";
					mes "は時間制限中です。^000000";
					close;
				}
			}
			if(checkquest(19162)) {
				mes "[オリリョ鳥兵]";
				mes "挙動不審だったり、変な場所にいる";
				mes "アーウィンを見つけてください。";
				mes "エージェント殿の訓練された観察力で";
				mes "捕まえてくださることを";
				mes "期待してやまないです。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000スパイ捜索^000000」";
				mes "は受注済みのクエストです。";
				mes "こちらのクエストを破棄しますか？";
				next;
				if(select("やめる","破棄する") == 1) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close;
				}
				delquest 19162;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000スパイ捜索^000000」";
				mes "を破棄しました。";
				close;
			}
			if(checkquest(19163)) {
				mes "<<B>クエスト</B>>";
				mes "「^ff0000スパイ捜索^000000」";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "※400000000を20回受け取ります。";
				mes "JobExp 6G ( 6000000000 )";
				mes "※300000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　3個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000スパイ捜索^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close;
				}
				delquest 19163;
				setquest 19164;
				getitem 1001217,3;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[オリリョ鳥兵]";
				mes "お！";
				mes "エージェント殿がスパイ捜索で";
				mes "大きな成果をあげたと聞いてますよ！";
				mes "コチラは上層部によって制定された";
				mes "報酬になります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "※400000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "※300000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　3個";
				mes "を獲得しました。";
				close;
			}
			mes "[オリリョ鳥兵]";
			mes "アーウィン変身スクロールで";
			mes "氷の城に潜入したルガンが、";
			mes "いつどこで情報を盗んでいるのかは、";
			mes "誰にも分からない状況です。";
			mes "氷の城を1人で散策しながら、";
			next;
			mes "[オリリョ鳥兵]";
			mes "少しでも";
			mes "挙動不審なアーウィンを見かけたら、";
			mes "合言葉で確認を";
			mes "お願いいたします。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000スパイ捜索^000000」";
			mes "を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[オリリョ鳥兵]";
				mes "今は手が空いてないのですか？";
				mes "仕方がないですね……。";
				mes "また、手が空いた時にお願いします。";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close;
			}
			setquest 19162;
			if(checkquest(19164)) delquest 19164;
			mes "[オリリョ鳥兵]";
			mes "私たちもスパイに関する情報は";
			mes "特にございません。";
			mes "スパイが羽にスパイだと";
			mes "書いている訳がないでしょう。";
			next;
			mes "[オリリョ鳥兵]";
			mes "挙動不審だったり、変な場所にいる";
			mes "アーウィンを見つけてください。";
			mes "エージェント殿の訓練された観察力で";
			mes "捕まえてくださることを";
			mes "期待してやまないです。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000スパイ捜索^000000」";
			mes "を受注しました。";
			close;
		case 1:	// 諜報情報の回収
			if(checkquest(19167)) {
				if(checkquest(19167)&2 == 0) {
					mes "[オリリョ鳥兵]";
					mes "私はエージェント殿の苦労を";
					mes "知っておりますが、";
					mes "これ以上は差し上げられません……。";
					mes "それでもよければ、";
					mes "また明日、手伝ってください。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000諜報情報の回収^000000」";
					mes "は時間制限中です。^000000";
					close;
				}
			}
			if(checkquest(19165)) {
				mes "[オリリョ鳥兵]";
				mes "接触場所に向かって、";
				mes "派遣隊員から情報を回収してください。";
				mes "合言葉の確認がありますので、";
				mes "忘れないように。";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000諜報情報の回収^000000」";
				mes "は受注済みのクエストです。";
				mes "こちらのクエストを破棄しますか？";
				next;
				if(select("やめる","破棄する") == 1) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close;
				}
				delquest 19165;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000諜報情報の回収^000000」";
				mes "を破棄しました。";
				close;
			}
			if(checkquest(19166)) {
				mes "<<B>クエスト</B>>";
				mes "「^ff0000諜報情報の回収^000000」";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "※400000000を20回受け取ります。";
				mes "JobExp 6G ( 6000000000 )";
				mes "※300000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　3個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000諜報情報の回収^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close;
				}
				delquest 19166;
				setquest 19167;
				getitem 1001217,3;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[オリリョ鳥兵]";
				mes "手にしているのが、";
				mes "受け取った情報ですか？";
				mes "ふむ……この捺印と封印……";
				mes "間違いないようですね。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "※400000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "※300000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　3個";
				mes "を獲得しました。";
				close;
			}
			mes "[オリリョ鳥兵]";
			mes "派遣された隊員たちが収集した情報を、";
			mes "回収することも極めて重要です。";
			mes "私が指定した接触場所に行き、";
			mes "隊員から情報を回収してきてください。";
			next;
			mes "[オリリョ鳥兵]";
			mes "もちろん、合言葉を活用して、";
			mes "味方の隊員であるかを";
			mes "必ず確認してください。";
			mes "熟練したエージェントならば、";
			mes "上手くやってくれると信じてます。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000諜報情報の回収^000000」";
			mes "を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[オリリョ鳥兵]";
				mes "今は手が空いてないのですか？";
				mes "仕方がないですね……。";
				mes "また、手が空いた時にお願いします。";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close;
			}
			setquest 19165;
			if(checkquest(19167)) delquest 19167;
			mes "[オリリョ鳥兵]";
			mes "派遣隊員との接触場所は、";
			mes "今渡した用紙に書いておきました。";
			mes "該当の位置に行けば";
			mes "隊員が先に接触してくるので、";
			next;
			mes "[オリリョ鳥兵]";
			mes "合言葉の確認後、";
			mes "情報を受け取ってください。";
			mes "合言葉を忘れたら、";
			mes "必ず再確認してから";
			mes "任務に出かけてください。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000諜報情報の回収^000000」";
			mes "を受注しました。";
			close;
		}
	}
	if(checkquest(19159)) {
		cloakoffnpc "補給官ゴリル#ep20iw";
		cloakoffnpc "パトロール隊長ホロリョ#ep20iw";
		mes "[オリリョ鳥兵]";
		mes "ブリーフィングを開始いたします。";
		mes "ご存じの通り";
		mes "停滞していたルガンとの戦争で";
		mes "私たちは大きな成果をあげました。";
		next;
		mes "[オリリョ鳥兵]";
		mes "パトロール隊分析チームで";
		mes "成果があがった理由を分析した結果";
		mes "冒険者たちが仕入れた";
		mes "ルガン変身スクロールにより";
		mes "容易く潜入できたことが";
		mes "決定的な要因だったと判明しました。";
		next;
		mes "[パトロール隊長ホロリョ]";
		mes "うむ！　パトロール隊でも";
		mes "変身スクロールを使用した";
		mes "パトロールが開始された。";
		next;
		mes "[オリリョ鳥兵]";
		mes "そうであります！";
		mes "危険地域に侵入する作戦もありましたが";
		mes "悪くなかったという分析であります。";
		next;
		mes "[オリリョ鳥兵]";
		mes "しかし、ルガンの奴らも";
		mes "アーウィン変身スクロールを開発し";
		mes "私たちの元に潜入し始めました。";
		next;
		mes "[補給官ゴリル]";
		mes "なんと!?";
		mes "ではここ、氷の城にもルガンが";
		mes "潜入しているかもしれないのか？";
		next;
		mes "[オリリョ鳥兵]";
		mes "そうであります！";
		next;
		mes "[オリリョ鳥兵]";
		mes "姿が私たちと似つかない冒険者は";
		mes "問題になりませんが";
		mes "アーウィン変身スクロールを使用して";
		mes "潜入したルガンを見破る方法は";
		mes "現時点ではありません！";
		next;
		mes "[パトロール隊長ホロリョ]";
		mes "そういうことだ。";
		mes "この問題を解決するために";
		mes "ゴリル補給官と冒険者にも";
		mes "ブリーフィングに参加してもらった。";
		next;
		menu "…‥は!?　いつの間に???",-;
		delquest 19159;
		setquest 19160;
		mes "[パトロール隊長ホロリョ]";
		mes "些細なものでもいい。";
		mes "アイデアがあったら、発言してくれ。";
		mes "では、後は任せる！";
		mes "上手くやるように。";
		close2;
		cloakonnpc "パトロール隊長ホロリョ#ep20iw";
		end;
	}
	if(checkquest(19160)) {
		cloakoffnpc "補給官ゴリル#ep20iw";
		cloakonnpc "パトロール隊長ホロリョ#ep20iw";
		mes "[オリリョ鳥兵]";
		mes "エージェント殿！";
		mes "何か良いアイデアはありませんか？";
		next;
		mes "‐参加しないといけない";
		mes "　会議では無いだろう。";
		mes "　了承を得て立ち去ろう……‐";
		next;
		menu "すみません、ちょっとお花を詰みに……",-;
		mes "[補給官ゴリル]";
		mes "私に良い考えがある!!";
		mes "エージェント・"+strcharinfo(0)+"！";
		mes "絶対にキミも賛同してくれるはずだ。";
		next;
		mes "[補給官ゴリル]";
		mes "「合言葉」を作るのだよ。";
		mes "例えば「山」と言ったら「川」のような！";
		mes "見た目で判断できないなら";
		mes "味方だと判断できるような";
		mes "合言葉を作れば良いのだ。";
		next;
		menu "意外にも説得力のある案ですね！",-;
		mes "[補給官ゴリル]";
		mes "エージェントなら";
		mes "そう言ってくれると信じてた。";
		mes "私たちのやるべきことは、ふたつ。";
		next;
		mes "[補給官ゴリル]";
		mes "合言葉を使って";
		mes "ルガンたちの区域に侵入している";
		mes "隊員たちから情報を回収すること！";
		next;
		mes "[補給官ゴリル]";
		mes "ふたつ！";
		mes "氷の城にいる挙動不審なアーウィンに";
		mes "合言葉を投げかけ";
		mes "正しい合言葉が返ってこなかった時に";
		mes "そのアーウィンを捕まえること！";
		next;
		menu "良い考えだと思います",-;
		mes "[オリリョ鳥兵]";
		mes "はい、見事な作戦であります！";
		next;
		mes "[補給官ゴリル]";
		mes "よし！";
		mes "では業務を分担しよう。";
		mes "合言葉を毎日変更する必要がある。";
		mes "その業務はオリリョ鳥兵が";
		mes "担当してくれ。";
		next;
		mes "[補給官ゴリル]";
		mes "合言葉はたくさん用意して";
		mes "出来る限りパターンが";
		mes "重複しないようにしてくれ。";
		next;
		mes "[オリリョ鳥兵]";
		mes "はっ！　了解しました。";
		next;
		mes "[補給官ゴリル]";
		mes "侵入している隊員たちの元に行き";
		mes "情報を持って帰ってくる任務は";
		mes "エージェント・"+strcharinfo(0)+"に";
		mes "任せたい。";
		next;
		menu "どうせまた",-,"変な選択肢が",-,"出てくるはずだから喜んで",-,"やると伝える",-;
		emotion 1,"",1;
		mes "[補給官ゴリル]";
		mes "もうひとつ、氷の城にて";
		mes "挙動不審なアーウィンを探す任務だが";
		mes "これもエージェント・"+strcharinfo(0)+"に";
		mes "お願いしたい。";
		next;
		mes "[補給官ゴリル]";
		mes "注意力が散漫なアーウィンたちより";
		mes "熟練したエージェントの方が";
		mes "観察力に優れているみたいだからな。";
		next;
		menu "お待ちを！　補給官殿の業務が決まっておりません！",-;
		mes "[補給官ゴリル]";
		mes "私？";
		mes "私は補給業務をしなくちゃ。";
		mes "主兵にもなった身で実務をやれるか？";
		mes "そんなのは、オリリョ鳥兵みたいな";
		mes "新入りの幹部に任せないと。";
		next;
		mes "[補給官ゴリル]";
		mes "では2人で上手くやるように！";
		mes "私はキミたちを信じて";
		mes "自分の仕事をしに行くよ。";
		next;
		cloakonnpc "補給官ゴリル#ep20iw";
		emotion 22,"オリリョ鳥兵#ep20_DQ_2";
		if(!sleep2(3000)) end;
		emotion 18,"オリリョ鳥兵#ep20_DQ_2";
		delquest 19160;
		setquest 19161;
		mes "[オリリョ鳥兵]";
		mes "ハハハ……素晴らしい仕事の";
		mes "押し付け能力ですね。";
		mes "私も職級が上がれば";
		mes "あんな風になるんでしょうか……？";
		mes "とにかく、ちょっと話をしましょう。";
		close;
	}
	if(checkquest(19161)) {
		cloakonnpc "補給官ゴリル#ep20iw";
		cloakonnpc "パトロール隊長ホロリョ#";
		mes "[オリリョ鳥兵]";
		mes "担当する業務について";
		mes "改めて確認しましょう。";
		mes "どの業務から確認しますか？";
		while(1) {
			next;
			switch(select("変更された合言葉を知る方法は？","合言葉と情報回収","隠れた敵スパイ捜索","もう十分")) {
			case 1:
				mes "[オリリョ鳥兵]";
				mes "熟練のエージェントなら";
				mes "よくご存じでしょう。";
				mes "合言葉は口頭でのみ伝達できます。";
				mes "私の所に来てもらえば";
				mes "変更された合言葉をお伝えしますよ。";
				next;
				mes "[オリリョ鳥兵]";
				mes "合言葉の変更は毎日5時に行います。";
				mes "時間には注意してください。";
				mes "変更前の合言葉を記憶して";
				mes "任務に当たらないようにお願いします。";
				next;
				mes "[オリリョ鳥兵]";
				mes "もし合言葉を忘れたとしても";
				mes "心配しないでください。";
				mes "私に聞いてもらえれば";
				mes "何度でもお教えいたします。";
				break;
			case 2:
				mes "[オリリョ鳥兵]";
				mes "侵入作戦に従事している隊員たちから";
				mes "情報を回収してくることも";
				mes "極めて重要です。";
				next;
				mes "[オリリョ鳥兵]";
				mes "私が指定した場所に行き";
				mes "派遣中の隊員が集めた情報を";
				mes "持って帰ってきてください。";
				next;
				mes "[オリリョ鳥兵]";
				mes "もちろん合言葉を使って";
				mes "本物の隊員なのか必ず確認が必要です。";
				mes "熟練したエージェントなら";
				mes "上手くやってくれると信じてます。";
				break;
			case 3:
				mes "[オリリョ鳥兵]";
				mes "アーウィン変身スクロールを使って";
				mes "氷の城に潜入したルガンが";
				mes "どこに潜伏しているのか";
				mes "誰にもわからない状況です。";
				next;
				mes "[オリリョ鳥兵]";
				mes "氷の城を見回り";
				mes "挙動不審なアーウィンを見つけて";
				mes "合言葉による身元の確認を";
				mes "行ってください。";
				break;
			case 4:
				if(checkitemblank() == 0) {
					mes "^009eff【インフォメーション】";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。^000000";
					close;
				}
				setquest 202440;
				delquest 19161;
				getitem 1001217,6;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				mes "[オリリョ鳥兵]";
				mes "作戦を開始する準備ができたら";
				mes "いつでもお声がけください。";
				mes "合言葉をお伝えします。";
				close;
			}
			next;
			mes "[オリリョ鳥兵]";
			mes "まだ気になることがありますか？";
			continue;
		}
	}
	mes "[オリリョ鳥兵]";
	mes "最近、噂になっている冒険者か？";
	next;
	mes "[オリリョ鳥兵]";
	mes "実力はありそうだが";
	mes "あまり出しゃばらない方がいい。";
	next;
	mes "[オリリョ鳥兵]";
	mes "他のアーウィンとは違って私は";
	mes "冒険者というものに懐疑的だから。";
	if(checkquest(19158)) {
		next;
		cloakoffnpc "補給官ゴリル#ep20iw";
		emotion 23;
		unittalk "オリリョ : 鳥兵！　オリリョ！";
		mes "[オリリョ鳥兵]";
		mes "お越しになりましたか、補給官殿！";
		mes "ちょうどこちらに冒険者も";
		mes "到着したばかりです。";
		next;
		mes "[補給官ゴリル]";
		mes "おお、誰かと思ったら";
		mes "エージェント・"+strcharinfo(0)+"!!";
		mes "おひさしぶりだな！";
		next;
		mes "[オリリョ鳥兵]";
		mes "エ、エージェント!?";
		mes "エージェントでしたか!!";
		mes "さ、先ほどは、失礼いたしました！";
		next;
		mes "‐そうは言ってるが";
		mes "　何故先に言ってくれなかったのかと";
		mes "　恨めしそうな顔をしている‐";
		next;
		mes "[補給官ゴリル]";
		mes "最近の調子はどう？";
		mes "まぁ、いまや有名だからな。";
		mes "噂は、常々聞いているよ。";
		next;
		cloakoffnpc "パトロール隊長ホロリョ#ep20iw";
		unittalk getnpcid(0,"パトロール隊長ホロリョ#"),"ホロリョ : ふむ……",1;
		if(!sleep2(1000)) end;
		unittalk "オリリョ : 鳥兵！　オリリョ！",1;
		mes "[オリリョ鳥兵]";
		mes "隊長殿、いらっしゃいましたか！";
		next;
		mes "[パトロール隊長ホロリョ]";
		mes "さっき、話が聞こえたが";
		mes "エージェントとか言っていたな？";
		next;
		mes "[パトロール隊長ホロリョ]";
		mes "補給官！";
		mes "お前は未だに誰かを捕まえて";
		mes "エージェントごっこ遊びしてるのか？";
		next;
		unittalk getnpcid(0,"補給官ゴリル#ep20iw"),"ゴリル : 鳥兵！　ゴリル！",1;
		mes "[補給官ゴリル]";
		mes "う……誤解であります！";
		mes "隊長殿……！";
		next;
		mes "[補給官ゴリル]";
		mes "この冒険者は、私と幾度と無く";
		mes "作戦に投入された実力者！";
		mes "本物のエージェントなんです!!";
		next;
		mes "[補給官ゴリル]";
		mes "違わないよな？　な？";
		mes "ほら、あんたもなんか言ってくれ。";
		next;
		mes "‐補給官ゴリルは早く答えろと";
		mes "　私をじろじろ見てくる。";
		mes "　何？　この状況??";
		mes "　しかし、こういうのは";
		mes "　初めてでは無い気がする……‐";
		next;
		switch(select("ハハ、隊長殿。こう見えてもエージェントなんです！","補給官殿には、お世話になりました！","次の任務は何でありますか？","（ん？　ちょっと選択肢の状態が??）")) {
		case 1:
			emotion 33,"パトロール隊長ホロリョ#ep20iw",1;
			mes "[パトロール隊長ホロリョ]";
			mes "ふむ、私から見ても";
			mes "エージェントには見えないなぁ。";
			next;
			break;
		case 2:
			emotion 1,"パトロール隊長ホロリョ#ep20iw",1;
			mes "[パトロール隊長ホロリョ]";
			mes "お世話になっていると？";
			mes "みんな同じことを言っているな。";
			next;
			break;
		case 3:
			emotion 0,"パトロール隊長ホロリョ#ep20iw",1;
			mes "[パトロール隊長ホロリョ]";
			mes "お！";
			mes "その必要なことだけ言う姿勢！";
			mes "エージェントっぽい！";
			mes "うん、エージェントに違いない！";
			next;
			break;
		case 4:
			emotion 36,"補給官ゴリル#ep20iw",1;
			break;
		}
		mes "[パトロール隊長ホロリョ]";
		mes "まぁ、よし！";
		mes "実際にエージェントなのかどうかは";
		mes "重要なことではないだろう。";
		next;
		mes "[パトロール隊長ホロリョ]";
		mes "人手不足で苦労しているが";
		mes "冒険者のように身元が明らかな人材なら";
		mes "例の作戦に投入しても問題ない。";
		mes "ゴリル補給官！";
		mes "適切な人材の推薦！　流石だ！";
		next;
		unittalk getnpcid(0,"補給官ゴリル#ep20iw"),"ゴリル : 鳥兵！　ゴリル！",1;
		mes "[補給官ゴリル]";
		mes "光栄であります、隊長殿！";
		next;
		delquest 19158;
		setquest 19159;
		mes "[パトロール隊長ホロリョ]";
		mes "時間だ。";
		mes "では、オリリョ鳥兵！";
		mes "ブリーフィングを開始せよ！";
		close;
	}
	close;
OnQuestInfo:
	if(checkquest(19163))
		showevent 0, 2, "オリリョ鳥兵#ep20_DQ_2";
	else if(checkquest(19158) || checkquest(19159) || checkquest(19160) || checkquest(19161) || checkquest(19162) || checkquest(19165))
		showevent 0, 3, "オリリョ鳥兵#ep20_DQ_2";
	end;
OnInit:
	setarray 'Question$,"ババヤガ","ジェスター";
	setarray 'Answer$,"古木の枝","狐の尻尾";
	set 'TodayQuestion,rand(getarraysize('Question$));
	set 'TodayAnswer,rand(getarraysize('Answer$));
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icas_in.gat,104,60,2	script(CLOAKED)	補給官ゴリル#ep20iw	21518,{/* 3709 (cloaking)*/
	unittalk "補給官ゴリル : ゴロリ～、作業しに出て来い～。中にいるのは知ってるよ。",1;
	sleep 1500;
	unittalk "補給官ゴリル : 逃げ出す音が聞こえてるよ。お前が逃げたところで、高が知れてる。",1;
	sleep 1500;
	cloakonnpc;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icas_in.gat,99,57,6	script(CLOAKED)	パトロール隊長ホロリョ#ep20iw	21518,{/* 3710 (cloaking)*/
	unittalk "パトロール隊長ホロリョ : ふむ……上手くやってるのか気になって、こっそり来てみた。もう戻らなきゃ。";
	sleep 1500;
	cloakonnpc;
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,204,238,2	script	怪しいアーウィン#SSQ01	10461,{/* 3711 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 7,"怪しいアーウィン#SSQ01";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : "+'@str$+"？合ってる？私の知ってる合言葉とは違うけど？お前がスパイじゃないか？",1;
			if(!sleep2(1500)) end;
			cloakoffnpc "上等兵モルラン#SSQ01";
			if(!sleep2(500)) end;
			unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: 連絡を受けて参りました。",1;
			if(!sleep2(800)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : おや、丁度よかった。こちらの者はどうやらスパイみたい。おかしな合言葉を言うんだから。",1;
			if(!sleep2(1500)) end;
			emotion 55,"上等兵モルラン#SSQ01";
			unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: あっ！冒険者殿？そして先輩じゃありませんか？ここまでどういうご用で？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : お！後輩、私を知ってる？なんだ、こちらの者はお知り合いか？",1;
			if(!sleep2(1500)) end;
			emotion 20,"上等兵モルラン#SSQ01";
			unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: 私たちの仕事を手伝ってるんです。合言葉は…忘れたのかな？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : おや…賢い種族ではなさそうだな。まぁ、いいか。補給官殿によろしくと伝えてくれ。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: このまま行かれますか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : 訓練すると言われて来たけど、どうにも気分が晴れない。また今度でいいだろう。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: 先輩、お気をつけてお帰り下さい。",1;
			if(!sleep2(1500)) end;
			emotion 12,"怪しいアーウィン#SSQ01";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : お疲れ～",1;
			if(!sleep2(800)) end;
			cloakonnpc "怪しいアーウィン#SSQ01";
			unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: 冒険者殿、もう私も行きます。お忘れになった合言葉は、オリリョ鳥兵殿からご確認ください。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: お疲れ様です。",1;
			if(!sleep2(800)) end;
			cloakonnpc "上等兵モルラン#SSQ01";
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : 合言葉？答えは"+'@a$+"だったかな？",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			emotion 18,"怪しいアーウィン#SSQ01";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : ほほ、最近はこんなこともするんだな。ご苦労様。",1;
			cloakonnpc "怪しいアーウィン#SSQ01";
			if(!checkquest(19168)) {
				setquest 19168;
				compquest 19168;
			}
			close;
		}
		emotion 23,"怪しいアーウィン#SSQ01";
		unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : あ…合言葉？なにそれ？！そんなの私知らないよ。",1;
		if(!sleep2(1500)) end;
		cloakoffnpc "上等兵モルラン#SSQ01";
		unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: 連絡を受けて参りました。",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"怪しいアーウィン#SSQ01"),"怪しいアーウィン : うぐっ！パトロール隊？に…逃げなきゃ…",1;
		if(!sleep2(800)) end;
		cloakonnpc "怪しいアーウィン#SSQ01";
		if(!sleep2(700)) end;
		emotion 6,"上等兵モルラン#SSQ01";
		unittalk getnpcid(0,"上等兵モルラン#SSQ01"),"上等兵モルラン: こいつ、スパイか？待ちやがれ！",1;
		cloakonnpc "上等兵モルラン#SSQ01";
		if(!sleep2(1500)) end;
		emotion 1,"";
		unittalk getcharid(3),strcharinfo(0)+" : ？",1;
		if(!sleep2(1500)) end;
		if(checkquest(19169)) delquest 19169;
		if(checkquest(19170)) delquest 19170;
		if(checkquest(19171)) delquest 19171;
		if(checkquest(19172)) delquest 19172;
		if(checkquest(19173)) delquest 19173;
		if(checkquest(19174)) delquest 19174;
		if(checkquest(19175)) delquest 19175;
		if(checkquest(19176)) delquest 19176;
		if(checkquest(19177)) delquest 19177;
		delquest 19162;
		setquest 19163;
		unittalk getcharid(3),strcharinfo(0)+" : (氷城に潜入したスパイの捜索に成果が出た。オリリョに報告しよう。)",1;
		close;
	}
	cloakonnpc "怪しいアーウィン#SSQ01";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 3,"怪しいアーウィン#SSQ01",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19168))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,207,240,4	script(CLOAKED)	上等兵モルラン#SSQ01	21517,{/* 3712 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,238,185,2	script	怪しいアーウィン#SSQ02	10461,7,7,{/* 3713 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		emotion 23,"怪しいアーウィン#SSQ02";
		unittalk getnpcid(0,"怪しいアーウィン#SSQ02"),"怪しいアーウィン : ん？"+'@str$+"？それ合ってる？作業番長のポさんが教えてくれたのと違うんだけど？あのなに、スプァイか？",1;
		if(!sleep2(800)) end;
		cloakoffnpc "二等兵ロルル#SSQ02";
		if(!sleep2(800)) end;
		unittalk getnpcid(0,"二等兵ロルル#SSQ02"),"二等兵ロルル: 連絡を受けて参りました。",1;
		if(!sleep2(1500)) end;
		emotion 38,"怪しいアーウィン#SSQ02";
		unittalk getnpcid(0,"怪しいアーウィン#SSQ02"),"怪しいアーウィン : おや、パトロール隊の後輩たちじゃないか。隊長殿はお元気かの？あ！？こちらの、何だ。スプァイ！そう、スプァイみたい。",1;
		if(!sleep2(1500)) end;
		emotion 1,"二等兵ロルル#SSQ02";
		unittalk getnpcid(0,"二等兵ロルル#SSQ02"),"二等兵ロルル: スプァイ？あぁ、スパイですね。この人が？勘違いのようですね。私たちの仕事を手伝っている冒険者殿です。",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"怪しいアーウィン#SSQ02"),"怪しいアーウィン : え？スプァイじゃないの？スプァイじゃないのに、なんで間違ったの？",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"二等兵ロルル#SSQ02"),"二等兵ロルル: ご存じの通り、合言葉って覚えにくいじゃありませんか。どうやら忘れたようですね。",1;
		if(!sleep2(1500)) end;
		emotion 20,"怪しいアーウィン#SSQ02";
		unittalk getnpcid(0,"怪しいアーウィン#SSQ02"),"怪しいアーウィン : そんな…ちょっと足りなさそうだけど、仕事とか任せていいのか不安だな。そうだ！こんなことしてる時じゃない。",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"二等兵ロルル#SSQ02"),"二等兵ロルル: お忙しいですか？",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"怪しいアーウィン#SSQ02"),"怪しいアーウィン : とんでもないよ。寒い時に氷でつなぎ合わせたのが、ちょっと暖かくなった途端に溶け出して大惨事だよ。",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"二等兵ロルル#SSQ02"),"二等兵ロルル: お気をつけて。",1;
		unittalk getnpcid(0,"怪しいアーウィン#SSQ02"),"怪しいアーウィン : うん～パトロール隊の後輩もお疲れさん～。",1;
		if(!sleep2(800)) end;
		cloakonnpc "怪しいアーウィン#SSQ02";
		if(!sleep2(800)) end;
		unittalk getnpcid(0,"二等兵ロルル#SSQ02"),"二等兵ロルル: 冒険者殿、では私も行きます。お忘れになった合言葉は、オリリョ鳥兵殿から確認お願いします。",1;
		if(!sleep2(1500)) end;
		emotion 12,"二等兵ロルル#SSQ02";
		unittalk getnpcid(0,"二等兵ロルル#SSQ02"),"二等兵ロルル: 私はもう行きます～",1;
		cloakonnpc "二等兵ロルル#SSQ02";
		close;
	}
	cloakonnpc "怪しいアーウィン#SSQ02";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 4,"怪しいアーウィン#SSQ02",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19169))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,240,187,4	script(CLOAKED)	二等兵ロルル#SSQ02	21515,{/* 3714 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,132,182,6	script	怪しいアーウィン#SSQ03	10461,7,7,{/* 3715 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 77,"怪しいアーウィン#SSQ03";
			emotion 19,"";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ03"),"怪しいアーウィン : うん？"+'@str$+"？それ違うんだけど？今私が酔っ払ってるとバカにしてるんだろ？おい！",1;
			if(!sleep2(800)) end;
			cloakoffnpc "一等兵ホリリュ#SSQ03";
			if(!sleep2(700)) end;
			unittalk getnpcid(0,"一等兵ホリリュ#SSQ03"),"一等兵ホリリュ: 連絡を受け…て、みんな知り合いばかりですね…",1;
			if(!sleep2(1500)) end;
			emotion 7,"怪しいアーウィン#SSQ03";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ03"),"怪しいアーウィン : なんだ？！またあんたか？ここのパトロール隊ってあんただけか？何で毎回あんただよ？あん？！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ホリリュ#SSQ03"),"一等兵ホリリュ: そうですね。私も、もううんざりですよ。ところで冒険者殿、ここで酔っ払いと何をしてますか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ03"),"怪しいアーウィン : 何？知り合い？あ…あれってスパイだよ！スパイ！間違った合言葉を言うんだから？私じゃなくてあいつを捕まえろ。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ホリリュ#SSQ03"),"一等兵ホリリュ: どう見てもおじさんの方が怪しく見えるんだけど？酒を飲んでこんな場所で徘徊してるから。",1;
			if(!sleep2(1500)) end;
			emotion 77,"怪しいアーウィン#SSQ03";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ03"),"怪しいアーウィン : いやぁ…それがなぁ…@.@ ヒクッ…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ホリリュ#SSQ03"),"一等兵ホリリュ: さぁ…さぁ…家に帰りましょう。何度も会ってるから、おじさんの家を覚えてるんだよ。",1;
			if(!sleep2(1500)) end;
			emotion 45,"怪しいアーウィン#SSQ03";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ03"),"怪しいアーウィン : あぁ…眠い…z.Z.z..zZ",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ホリリュ#SSQ03"),"一等兵ホリリュ: うわぁっ！おじさん、寝ちゃ駄目だよ。こんな場所で寝ると風邪引くよ！",1;
			if(!sleep2(1500)) end;
			emotion 16,"一等兵ホリリュ#SSQ03";
			unittalk getnpcid(0,"一等兵ホリリュ#SSQ03"),"一等兵ホリリュ: うおぉ…もう行きます。忘れた合言葉はオリリョ鳥兵殿に行って聞いて。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ホリリュ#SSQ03"),"一等兵ホリリュ: うわっ！おじさん起きて！寝ちゃダメだってば！",1;
			cloakonnpc "一等兵ホリリュ#SSQ03";
			cloakonnpc "怪しいアーウィン#SSQ03";
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ03"),"怪しいアーウィン : え？合言葉？ヒクッ…あの…あの何だ…そう、狐の尻尾、これだ！…合ってるよな？",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ03"),"怪しいアーウィン : ああ…もっと酔う前に帰らないとな。風邪引きそう。",1;
			cloakonnpc "怪しいアーウィン#SSQ03";
			if(!checkquest(19170)) {
				setquest 19170;
				delquest 19170;
			}
			close;
		}
	}
	cloakonnpc "怪しいアーウィン#SSQ03";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 77,"怪しいアーウィン#SSQ03",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19170))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,129,184,6	script(CLOAKED)	一等兵ホリリュ#SSQ03	21516,{/* 3716 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,66,71,8	script	怪しいアーウィン#SSQ04	10461,7,7,{/* 3717 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 1,"怪しいアーウィン#SSQ04";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ04"),"怪しいアーウィン : "+'@str$+"？●●●？●●？● ●●●●？",1;
			if(!sleep2(800)) end;
			cloakoffnpc "一等兵ソルル#SSQ04";
			if(!sleep2(700)) end;
			unittalk getnpcid(0,"一等兵ソルル#SSQ04"),"一等兵ソルル: 連絡を受けて参りました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ04"),"怪しいアーウィン : ●？●● ●●●？●●●●●●？●●●●●？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ソルル#SSQ04"),"一等兵ソルル: あれ？！ポルリョ上等兵殿のお父さんじゃありませんか？冒険者様も？あぁ、大体どういう状況か解ります。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ04"),"怪しいアーウィン : ●● ● ●●●● ●●●● ●●●！●●● ●●●？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ソルル#SSQ04"),"一等兵ソルル: いいえ、お父さん。違います。私たちの仕事を手伝ってます。合言葉はまぁ！忘れることもありますよね。私たちもたまにそうじゃありませんか。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ04"),"怪しいアーウィン : ●●● ●●●●。●● ●● ●●● ●●● ●●● ●●●！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ソルル#SSQ04"),"一等兵ソルル: ハハハ、冒険者様が聞き取れないみたいですから、私から上手く伝えますよ。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ04"),"怪しいアーウィン : ●● ● ●● ●●！●● ●●●● ● ●● ●● ●● ●●● ●●●●。",1;
			if(!sleep2(800)) end;
			cloakonnpc "怪しいアーウィン#SSQ04";
			unittalk getnpcid(0,"一等兵ソルル#SSQ04"),"一等兵ソルル: お父さん、お気をつけて。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ソルル#SSQ04"),"一等兵ソルル: 冒険者殿、では私も行きます。忘れた合言葉は、オリリョ鳥兵殿に行ってまた聞いてください。",1;
			if(!sleep2(1500)) end;
			emotion 12,"一等兵ソルル#SSQ04";
			unittalk getnpcid(0,"一等兵ソルル#SSQ04"),"一等兵ソルル: お疲れ様でした。",1;
			cloakonnpc "一等兵ソルル#SSQ04";
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ04"),"怪しいアーウィン : ●●●？●●● "+'@a$+"●●？",1;
			unittalk getcharid(3),strcharinfo(0)+" : (小さい声だったが、どうしてか合言葉だけは明確に聞こえた。)",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ04"),"怪しいアーウィン : ●●● ●●。●● ●●！",1;
			cloakonnpc "怪しいアーウィン#SSQ04";
			if(!checkquest(19171)) {
				setquest 19171;
				delquest 19171;
			}
			close;
		}
	}
	cloakonnpc "怪しいアーウィン#SSQ04";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 9,"怪しいアーウィン#SSQ04",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19171))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,62,73,6	script(CLOAKED)	一等兵ソルル#SSQ04	21516,{/* 3718 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}

icecastle.gat,58,223,8	script	怪しいアーウィン#SSQ05	10461,7,7,{/* 3719 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 79,"怪しいアーウィン#SSQ05";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : あれ？！"+'@str$+"？合言葉はそれじゃないよな？ほら、今日の合言葉違いますよ。まさか…？ス…ス…スパイだ！！！スパイが出た！！",1;
			if(!sleep2(800)) end;
			cloakoffnpc "二等兵トラリ#SSQ05";
			if(!sleep2(700)) end;
			unittalk getnpcid(0,"二等兵トラリ#SSQ05"),"二等兵トラリ: 連絡を受けて参りました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : うわ…イーグルパトロール隊の方たち、本当早いな。こっちです！こっち！スパイがいます。スパイ！！",1;
			if(!sleep2(1500)) end;
			emotion 25,"二等兵トラリ#SSQ05";
			unittalk getnpcid(0,"二等兵トラリ#SSQ05"),"二等兵トラリ: 残念～。正解は私たちの仕事を手伝う冒険者殿でした。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : ああ、なんだ…ところでどうして合言葉を間違えたんですか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"二等兵トラリ#SSQ05"),"二等兵トラリ: そうですね、何で間違えたんでしょう？おかしいけど、短いのに…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : まぁ、あり得るでしょう。とにかくスパイじゃなくて幸いです。音も立てずにシャキーン！ギャー！とやられると思ったんですよ。",1;
			if(!sleep2(1500)) end;
			emotion 33,"二等兵トラリ#SSQ05";
			unittalk getnpcid(0,"二等兵トラリ#SSQ05"),"二等兵トラリ: 冒険者殿も私たちも一生懸命に探し出しています。まぁ、偶にこんなことが起きたりしますけどね。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : 苦労してますね。私は仕事も終わったし、そろそろ行きます。お疲れ様でした。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"二等兵トラリ#SSQ05"),"二等兵トラリ: はい！お気をつけて。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : お疲れ様です。",1;
			if(!sleep2(800)) end;
			cloakonnpc "怪しいアーウィン#SSQ05";
			if(!sleep2(800)) end;
			unittalk getnpcid(0,"二等兵トラリ#SSQ05"),"二等兵トラリ: 冒険者殿、忘れた合言葉は、オリリョ鳥兵殿にまた聞いてください。では私も参ります。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"二等兵トラリ#SSQ05"),"二等兵トラリ: ご苦労様です。",1;
			cloakonnpc "二等兵トラリ#SSQ05";
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : "+'@a$+"です。",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : 念のために言いますが、泥棒ではありません。旅館内に溜まってるタンス貯金を回収しようとしただけですよ。",1;
			if(!sleep2(1500)) end;
			emotion 12,"怪しいアーウィン#SSQ05";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ05"),"怪しいアーウィン : 回収は終わりました。では失礼！",1;
			cloakonnpc "怪しいアーウィン#SSQ05";
			if(!checkquest(19172)) {
				setquest 19172;
				delquest 19172;
			}
			close;
		}
	}
	cloakonnpc "怪しいアーウィン#SSQ05";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 5,"怪しいアーウィン#SSQ05",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19172))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,61,221,2	script(CLOAKED)	二等兵トラリ#SSQ05	21515,{/* 3720 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,54,209,8	script	怪しいアーウィン#SSQ06	10461,7,7,{/* 3721 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 36,"怪しいアーウィン#SSQ06";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : "+'@str$+"？"+'@str$+"？？"+'@str$+"？？？",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (そうじゃなくても小さいアーウィンの目がより小さくなっていき、こちらを疑いの目で見ている。)",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (少し固まっていた小さな羽が、動いたような気がした…しばらく後…)",1;
			if(!sleep2(700)) end;
			cloakoffnpc "一等兵ポララン#SSQ06";
			if(!sleep2(500)) end;
			emotion 6,"一等兵ポララン#SSQ06";
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: 通報を受けてきま…ちょっとおじさん、またおじさんが通報したの？どうして？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : (スパイだ、スパイ…合言葉も間違って、とにかくスパイだ。)",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: あのですね～冒険者殿？私のお知り合いのようですが、もしかしてスパイですか？",1;
			if(!sleep2(1500)) end;
			emotion 9,"";
			unittalk getcharid(3),strcharinfo(0)+" : … … … …",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: ですよね？違いますよね？それはそれとして、おじさん。この建物に接近禁止命令されたんじゃないですか？何でまたここにいるんですか？",1;
			if(!sleep2(1500)) end;
			emotion 55,"怪しいアーウィン#SSQ06";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : あ…そ…そうね。合言葉ぐらい忘れることもあるよね。冒険者でも何でもできる訳じゃないよね？",1;
			if(!sleep2(1500)) end;
			emotion 6,"一等兵ポララン#SSQ06";
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: ちょっと、おじさん。話を逸らさないでください。どうしてまたここにいるんですか！",1;
			if(!sleep2(1500)) end;
			emotion 16,"怪しいアーウィン#SSQ06";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : そうね、正直に言ってみようじゃないか。カチカチと凍った金髪の頭の人間が、この家に入るのを見たんだから？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: それで？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : 何がそれでだ？おい！私が窓から盗み見たら金髪の頭の人間は居なくてアーウィン2人とプリーデグルルとか？いう人だけ居るんだから！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : きっとその金髪の頭の人間はどこかに拉致されたか、あのなんだ、スパイ！スパイに違いない！",1;
			if(!sleep2(1500)) end;
			emotion 54,"一等兵ポララン#SSQ06";
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: あ…一旦分かりました。でも居住地接近禁止命令を違反しましたね。また他人の家を何で盗み見るんですか？行きましょう。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: ふ…冒険者殿はオリリョ鳥兵殿のところへ行かれて、変更された合言葉を確認してください。ではもう行きますね。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"一等兵ポララン#SSQ06"),"一等兵ポララン: おじさん、行きましょう。",1;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : ヒーン…",1;
			if(!sleep2(700)) end;
			cloakonnpc "一等兵ポララン#SSQ06";
			cloakonnpc "怪しいアーウィン#SSQ06";
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : "+'@a$+"！これで合ってるよね？スパイじゃないから、静かにしてくれ。重要なものを観察してるから。",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ06"),"怪しいアーウィン : あっ！バレた。逃げるぞ。",1;
			cloakonnpc "怪しいアーウィン#SSQ06";
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (何だったんだろ？)",1;
			if(!checkquest(19173)) {
				setquest 19173;
				delquest 19173;
			}
			close;
		}
	}
	cloakonnpc "怪しいアーウィン#SSQ06";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 79,"怪しいアーウィン#SSQ06",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19173))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,52,207,8	script(CLOAKED)	一等兵ポララン#SSQ06	21516,{/* 3722 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,96,245,2	script	怪しいアーウィン#SSQ07	10461,7,7,{/* 3723 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : "+'@str$+"？だと言ってましたよね？",1;
			if(!sleep2(1500)) end;
			emotion 22,"怪しいアーウィン#SSQ07";
			unittalk getcharid(3),strcharinfo(0)+" : (怪しいアーウィンは緊張した表情でにらんでくる。)",1;
			if(!sleep2(700)) end;
			cloakoffnpc "上等兵ポルリョ#SSQ07";
			if(!sleep2(800)) end;
			emotion 56,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: (?▽?)/ … … …～",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : うん？何言ってるんだよ？無駄に楽しそうにしてるんじゃねぇ！",1;
			if(!sleep2(1500)) end;
			emotion 28,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: ...... (Ｔ_Ｔ)? ",1;
			if(!sleep2(1500)) end;
			emotion 7,"怪しいアーウィン#SSQ07";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : くそ、何と言ってるのかマジでわからない。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : 無駄に落ち込むのも禁止！こっちはこっちなりに言うから、分かったら相槌を打って！",1;
			if(!sleep2(1500)) end;
			emotion 56,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: (*'▼'*)b ●~",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : 私はこちらの空き家を見に来たんだけど、こちらの冒険者が合言葉を聞いて来たんだよ…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : しかし本日の合言葉ではなかった！その時気付いたよ、こいつスパイなんだと！",1;
			if(!sleep2(1500)) end;
			emotion 25,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: X(?▽?)X ……！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : なに？違うっていうの？ハァ…ならいいんだけど…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : パトロール隊の人に聞いてみるんだけど、私はこの家を買おうと思っているんだ…この近くに開発のニュースとかない？",1;
			if(!sleep2(1500)) end;
			emotion 55,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: (*'▽'*)",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : ぱっと見てもわからないようだね…まぁいい…。でも出動時間を見ると安全な場所ではありそうだな。",1;
			if(!sleep2(1500)) end;
			emotion 56,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : 私はもう行かなきゃ。冒険者の人も次からは気を付けてくれ。",1;
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: ('_')(._ .)('_')(._ .)",1;
			if(!sleep2(1500)) end;
			cloakonnpc "怪しいアーウィン#SSQ07";
			if(!sleep2(1500)) end;
			emotion 56,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: (*'▼'*)b ……！●●●！ …… … … ……",1;
			if(!sleep2(1500)) end;
			emotion 12,"上等兵ポルリョ#SSQ07";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ07"),"上等兵ポルリョ: (￣▽￣)~… …",1;
			if(!sleep2(800)) end;
			cloakonnpc "上等兵ポルリョ#SSQ07";
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : 合言葉か…！！あ、思い出した！狐の尻尾ですよね？",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),""+strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ07"),"怪しいアーウィン : 何と人気のない場所だから管理しないと思ったのに、ここもパトロールをするんだな。やはりここに住むべきかな？",1;
			if(!sleep2(700)) end;
			cloakonnpc "怪しいアーウィン#SSQ07";
			if(!sleep2(800)) end;
			unittalk getcharid(3),""+strcharinfo(0)+" : (訳分からないことを言いながら、消えた。)",1;
			if(!checkquest(19174)) {
				setquest 19174;
				compquest 19174;
			}
			close;
		}
	}
	cloakonnpc "怪しいアーウィン#SSQ07";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 52,"怪しいアーウィン#SSQ07",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19174))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,99,243,2	script(CLOAKED)	上等兵ポルリョ#SSQ07	21517,{/* 3724 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,134,268,4	script	怪しいアーウィン#SSQ08	10461,7,7,{/* 3725 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : "+'@str$+"…"+'@str$+"だと…ふむ…君も何か間違ったという気がしないか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : どこからそんな変な単語を持ってきたんだろう。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : 本来なら警備隊に通報して警備隊が来て確認作業をした後に…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : 君を逮捕したり、私を逮捕したりする複雑な過程を通るだろうけど…そんなことはしないよ。",1;
			if(!sleep2(1500)) end;
			emotion 15,"";
			unittalk getcharid(3),strcharinfo(0)+" : 感謝いたします。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : 礼はいらない。君の顔を知っていただけだから。私も誰にだって甘くはないさ！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : この間、氷城で苦労してるのを何度も見守ったよ。あ、それはそうとして、君は伝説とか好きなのか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : 私が最近研究中の伝説だけど。こちらの氷の絶壁を見ると何かが引っ掛けた跡が見えるんだよ。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : そして外に出てみると、氷の間に鱗模様の紋様もあって…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : 正体不明の足跡も残ってる…この全てのことを総合してみた結果！伝説のトカゲみたいなものに違いない！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : ジュルル…美味そうだな。腹が減って来た。私は飯に行くから、ご苦労様。",1;
			if(!sleep2(800)) end;
			cloakonnpc "怪しいアーウィン#SSQ08";
			unittalk getcharid(3),strcharinfo(0)+" : ？？？？？",1;
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : 合言葉は"+'@a$+"。そしてしーっ！静かにしてくれ。この絶壁に残った痕跡を調査しているから…",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			emotion 7,"怪しいアーウィン#SSQ08";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ08"),"怪しいアーウィン : ええいっ、静かにしないか！",1;
			cloakonnpc "怪しいアーウィン#SSQ08";
			if(!sleep2(700)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (怒って、行ってしまった。)",1;
			if(!checkquest(19175)) {
				setquest 19175;
				compquest 19175;
			}
			close;
		}
	}
	cloakonnpc "怪しいアーウィン#SSQ08";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 19,"怪しいアーウィン#SSQ08",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19175))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,130,269,6	script(CLOAKED)	二等兵トラロン#SSQ08	21515,{/* 3726 (cloaking)*/}
icecastle.gat,154,247,6	script	怪しいアーウィン#SSQ09	10461,7,7,{/* 3727 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 79,"怪しいアーウィン#SSQ09";
			if(!sleep2(1000)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : "+'@str$+"ですって？あ…あ？ああ？！それじゃダメなのに…",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (幼く見えるアーウィンは、慌てたのか羽をばたつかせた。)",1;
			if(!sleep2(800)) end;
			cloakoffnpc "上等兵モルリュ#SSQ09";
			if(!sleep2(800)) end;
			emotion 1,"上等兵モルリュ#SSQ09";
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: 通報を受けてきまｓ…おや？もしかしてこの前のパトロール隊の訓練兵じゃありませんか？ここでなにしてますか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : モルリュ教官殿じゃないですか。こちらの冒険者が合言葉を間違えたので通報いたしました！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: お！訓練した甲斐がありますね。ところで冒険者が合言葉を間違えたと！おや？この人って、私たちの手伝いをしてる？",1;
			if(!sleep2(1500)) end;
			emotion 40,"";
			unittalk getcharid(3),strcharinfo(0)+" : ハハ…はい…まぁ…私が合言葉を間違えたみたいです。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: ハハハ、何をぼんやりしながら私の面倒ごとを増やしてくださるのですか…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: …まぁ、そんなこともありますね。人って完璧にはなりませんから。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: 合言葉はオリリョ鳥兵殿に聞いてください。ところで、訓練兵殿？",1;
			if(!sleep2(1500)) end;
			emotion 56,"怪しいアーウィン#SSQ09";
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : はい！モルリュ教官殿！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: 先ず通報してくださいありがとうございます。幸いにも私たちの仕事を手伝ってくださる冒険者殿なんです。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : ふー、よかった。凄く怖かったんですよ。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: ところでここにはどういうご用でいらっしゃいました？まだパトロール隊の合格発表はまだだと思いますが…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : 何故か合格しそうな感じがしましてね、折角なら近い距離に家を借りたくなっちゃって…家を探しに参りました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: あ…そうなんですね。折角会えたんだから、兵舎でお茶でも一杯いかがですか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : え？！いいですか？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵モルリュ#SSQ09"),"上等兵モルリュ: 行きましょう。では冒険者殿、ご苦労様でした。",1;
			if(!sleep2(700)) end;
			cloakonnpc "怪しいアーウィン#SSQ09";
			cloakonnpc "上等兵モルリュ#SSQ09";
			close;
		}
		if(rand(3)) {	// 不明
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : 合言葉は"+'@a$+"です！お疲れ様です、冒険者殿！",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : はい、合ってます。確認しました。失礼いたしました。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ09"),"怪しいアーウィン : うわーあの方が噂の冒険者殿なんだな。みんなに会ったと自慢しなきゃ～",1;
			if(!sleep2(700)) end;
			cloakonnpc "怪しいアーウィン#SSQ09";
			if(!checkquest(19176)) {
				setquest 19176;
				compquest 19176;
			}
			close;
		}
	}
	cloakonnpc "怪しいアーウィン#SSQ09";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 2,"怪しいアーウィン#SSQ09",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19176))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,152,244,8	script(CLOAKED)	上等兵モルリュ#SSQ09	21517,{/* 3728 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}
icecastle.gat,228,134,8	script	怪しいアーウィン#SSQ10	10461,7,7,{/* 3729 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (怪しいな……潜入したルガンかもしれない。確認してみよう)",1;
		if(select("合言葉を確認する","確認しない") == 2) {
			unittalk "怪しいアーウィン : うん？",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : 失礼します、アーウィンさん。合言葉の確認をいたします。",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"…"+'@str$+"…返答をどうぞ。",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		if('@str$ != '@q$) {
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : …本当、中古品取引も面倒なのに、スパイまで？来て下さい～、パトロール隊！",1;
			if(!sleep2(800)) end;
			cloakoffnpc "上等兵ポルリョ#SSQ10";
			if(!sleep2(800)) end;
			emotion 56,"上等兵ポルリョ#SSQ10";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (?▽?)… … … ……？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : あれ？！もしかしてポルリョ？そうよね！アイスフナムシが這う音より小さい声だもの、間違いない。私だよ、私！",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (θ_θ?) … …？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : そうだよ！ポルリョじゃないか。お父さんはお元気で？今も魚を獲っていらっしゃる？",1;
			if(!sleep2(1500)) end;
			emotion 56,"上等兵ポルリョ#SSQ10";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (?_?) …！ … … … … …？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : 私はお前のお父さんに沢山ご馳走してもらったんだ。それにしてもお前パトロール隊になったんだな。",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : 入隊は難しいと聞いていたのに、合格したんだな？",1;
			if(!sleep2(1500)) end;
			emotion 56,"上等兵ポルリョ#SSQ10";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (*'ω'*) … …！ …… … …？… …… … … …？",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : あ、そうだ！久し振り過ぎて嬉しくて、忘れるところだったよ。え？お知り合い？",1;
			if(!sleep2(1500)) end;
			emotion 56,"上等兵ポルリョ#SSQ10";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: ('▽') … … … …… …",1;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : そうなんだ…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : あの、気を付けてください。何で合言葉を間違えて、紛らわしい…",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : 中古品取引に来ただけなのに。",1;
			if(!sleep2(800)) end;
			cloakonnpc "怪しいアーウィン#SSQ10";
			if(!sleep2(700)) end;
			emotion 56,"上等兵ポルリョ#SSQ10";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (?▽?)/ …～",1;
			if(!sleep2(1500)) end;
			emotion 56,"上等兵ポルリョ#SSQ10";
			unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (-_-a);;; …… …… … … ……",1;
			if(!sleep2(1500)) end;
			cloakonnpc "上等兵ポルリョ#SSQ10";
			unittalk getcharid(3),strcharinfo(0)+" : (ふむ…何を言ってたんだろ？わからない。)",1;
			close;
		}
		if(rand(3)) {	// 不明
		}
		unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : あの、いくらセキュリティが大事でも、そんなことをさせて恥ずかしくないのか？",1;
		if(!sleep2(1500)) end;
		emotion 40,"怪しいアーウィン#SSQ10";
		unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : キャロット～、キャロット！キャロット～、キャロット！",1;
		if(!sleep2(3000)) end;
		emotion 19,"怪しいアーウィン#SSQ10";
		unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : これじゃない？あ…ということは、私いまバレたよな？",1;
		if(!sleep2(1500)) end;
		emotion 9,"怪しいアーウィン#SSQ10";
		emotion 9,"";
		unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : … … …。",1;
		unittalk getcharid(3),strcharinfo(0)+" : … … …。",1;
		if(!sleep2(800)) end;
		cloakoffnpc "上等兵ポルリョ#SSQ10";
		if(!sleep2(700)) end;
		emotion 56,"上等兵ポルリョ#SSQ10";
		unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (?▽?)/ … ……～",1;
		if(!sleep2(1500)) end;
		emotion 56,"上等兵ポルリョ#SSQ10";
		unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (?_?)？…… …？",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : 潜入したルガンのスパイを見付けました。お互い気まずいから、早く連れて行ってください。",1;
		if(!sleep2(1500)) end;
		emotion 56,"上等兵ポルリョ#SSQ10";
		emotion 9,"怪しいアーウィン#SSQ10";
		unittalk getnpcid(0,"上等兵ポルリョ#SSQ10"),"上等兵ポルリョ: (-_-a)？… …… ……… ……",1;
		unittalk getnpcid(0,"怪しいアーウィン#SSQ10"),"怪しいアーウィン : … … …",1;
		if(!sleep2(700)) end;
		cloakonnpc "怪しいアーウィン#SSQ10";
		cloakonnpc "上等兵ポルリョ#SSQ10";
		if(!sleep2(700)) end;
		if(checkquest(19168)) delquest 19168;
		if(checkquest(19169)) delquest 19169;
		if(checkquest(19170)) delquest 19170;
		if(checkquest(19171)) delquest 19171;
		if(checkquest(19172)) delquest 19172;
		if(checkquest(19173)) delquest 19173;
		if(checkquest(19174)) delquest 19174;
		if(checkquest(19175)) delquest 19175;
		if(checkquest(19176)) delquest 19176;
		delquest 19162;
		setquest 19163;
		unittalk getcharid(3),strcharinfo(0)+" : (氷城に潜入したスパイの捜索に成果が出た。オリリョに報告しよう。)",1;
		close;
	}
	cloakonnpc "怪しいアーウィン#SSQ10";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : （あっ！　消えてしまった。見間違えかな？）",1;
	end;
OnTouch:
	emotion 18,"怪しいアーウィン#SSQ10",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19177))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,225,136,6	script(CLOAKED)	上等兵ポルリョ#SSQ10	21517,{/* 3730 (cloaking)*/
	end;
OnInit:
	setnpctitle "<イーグルパトロール隊>";
	end;
}

-	script	接触場所#EP20_DQ	-1,{/* 3732 */
	if(checkquest(19165)) {
		unittalk getcharid(3),strcharinfo(0)+" : （指定された場所から、気配を感じる）",1;
		set '@today_q,getvariableofnpc('TodayQuestion,"オリリョ鳥兵#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"オリリョ鳥兵#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"オリリョ鳥兵#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"オリリョ鳥兵#ep20_DQ_2");
		mes "[誰か]";
		mes "動くな！";
		mes "どの陣営の者だ？";
		mes "^000000 "+'@q$+"^000000…";
		next;
		unittalk getcharid(3),strcharinfo(0)+" : （合言葉を答えよう）",1;
		input '@str$;
		if('@str$ != '@a$) {
			mes "[誰か]";
			mes "まずい！　バレたか!?";
			cloakonnpc;
			next;
			mes "‐相手を見失ってしまった‐";
			close;
		}
		mes "[誰か]";
		mes "よし、私が得た情報だ。持って行け！";
		mes "ルガンに見つかるなよ！";
		next;
		delquest 19165;
		setquest 19166;
		cloakonnpc;
		unittalk getcharid(3),strcharinfo(0)+" : （情報の書かれた紙を受け取った。オリリョに報告しよう）",1;
		close;
	}
	unittalk getcharid(3),strcharinfo(0)+" : 気配は感じられない。",1;
	end;
OnTouch:
	if(checkquest(19165))
		emotion 56,strnpcinfo(0),1;
	else
		cloakonnpc;
	end;
OnQuestInfo:
	if(checkquest(19165))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
jor_back5.gat,296,149,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19169	10429,5,5,	/* 3732 */
jor_twice.gat,76,100,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19170	10429,5,5	/* 3733 */
jor_maze.gat,253,267,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19171	10429,5,5	/* 3734 */
jor_root1.gat,39,93,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19172	10429,5,5	/* 3735 */
jor_root2.gat,19,44,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19173	10429,5,5	/* 3736 */
jor_twig.gat,192,211,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19174	10429,5,5	/* 3737 */
jor_sanct.gat,120,86,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19175	10429,5,5	/* 3738 */
jor_root3.gat,347,147,4	duplicate(接触場所#EP20_DQ)	接触場所#Q19176	10429,5,5	/* 3739 */

//============================================================
// 新しい生活の拠り所クエスト
//------------------------------------------------------------
icas_in.gat,243,66,5	script	トリョリョ#ep20_DQ_5	10461,{/* 3740 */
	if(EP20_1QUE == 100) {
		if(!checkquest(131260)) {
			mes "[トリョリョ]";
			mes "会えて嬉しいよ、人間。";
			mes "私は……。";
			next;
			mes "[ホリャラ]";
			mes "我が従兄弟！";
			unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : お父さんの弟の息子だよ！",1;
			next;
			mes "[ゾリャラ]";
			mes "……我が従兄弟なんだ。";
			next;
			mes "[トリョリョ]";
			mes "……うむ。";
			mes "今回、保育園に配属されたトリョリョだ。";
			unittalk getnpcid(0,"ゾリャラ#ep19_dq_kitche"),"ゾリャラ : 食堂。食堂。",1;
			next;
			mes "[トリョリョ]";
			mes "……食堂の厨房に配属された";
			mes "トリョリョだ。";
			unittalk getnpcid(0,"ホリャラ#ep19in"),"ホリャラ : キャハハ！",1;
			unittalk getnpcid(0,"トラルン#ep19in"),"トラルン : キャハハ！",1;
			next;
			mes "[トリョリョ]";
			mes "パトロールは、どうも適正に会わない……";
			mes "それで向いてるものをやりに来たよ。";
			mes "こう見えても、子供たちを眠らせることは";
			mes "得意なんだ。";
			next;
			mes "[トリョリョ]";
			mes "……話は変わるが";
			mes "ゾリャラに聞いた話では";
			mes "君は色々と物々交換をしてくれる";
			mes "らしいじゃないか。";
			next;
			mes "[トリョリョ]";
			mes "私もここに配属された以上、";
			mes "子供たちが好きそうな物を用意したい。";
			mes "そこらへんにいるウミウシを倒して";
			mes "食材を手に入れたいんだ。";
			next;
			mes "[トリョリョ]";
			mes "だが、私は適性が合わず";
			mes "パトロールから外された身……";
			mes "私より強い人間よ。";
			mes "手伝ってくれないか？";
			next;
			if(select("代わりに狩りに行く","慰める") == 2) {
				mes "[トリョリョ]";
				mes "いつものことではあるけれど……";
				mes "そう。いつものことだよ……。";
				unittalk getnpcid(0,"ゾリャラ#ep19_dq_kitche"),"ゾリャラ : そこでぽかんとしていないで、私の仕事を手伝ってくれ！",1;
				unittalk getnpcid(0,"トリョリョ#ep20_DQ_5"),"トリョリョ : おっとと、行くよ、行く！　ちょっと待て！",1;
				close;
			}
			mes "[トリョリョ]";
			mes "ありがとう、人間！";
			mes "詳細を伝えるから";
			mes "もう一度話しかけてくれ。";
			close2;
			setquest 131260;
			compquest 131260;
			end;
		}
		mes "[トリョリョ]";
		mes "私もここに配属された以上、子供たちが好きそうな物をお願いしたい。";
		mes "そこらへんにいるウミウシを倒して";
		mes "食材を採ってきて欲しい。";
		while(1) {
			next;
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の海辺)") == 2) {
				mes "^ff0000‐移動には500Zenyが必要です‐^000000";
				next;
				if(!checkquest(8855) && !checkquest(8857)) {
					mes "[トリョリョ]";
					cutin "ep19_iwin03.png", 2;
					mes "まだ、頼んでない依頼があるんだが、";
					mes "もう、現地に向かうか？";
					next;
					if(select("クエストの受注や報告を行う","ダンジョンに移動する(凍て付いた鱗の海辺)") == 1)
						break;
					mes "[トリョリョ]";
					cutin "ep19_iwin03.png", 2;
					mes "よし！";
					mes "それじゃ現地へ向かってくれ！";
				}
				else {
					mes "[トリョリョ]";
					cutin "ep19_iwin03.png", 2;
					mes "よし！";
					mes "さっそく現地に向かうか？";
				}
				close2;
				cutin "kafra_01.bmp", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_back4j.gat", 10, 370;
				end;
			}
			break;
		}
		setarray '@questname$,"ぷにぷに珍味収集①","ぷにぷに珍味収集②";
		setarray '@questid,8855,8857;
		setarray '@itemlist,1001233,5,1001232,5,0,1001231,5;
		setarray '@coolid,8856,8858;
		setarray '@gainlist,1001217,10,1001217,10;
		setarray '@explist,950000000,712500000,1100000000,825000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// ぷにぷに珍味収集①
			if(checkquest(8856)) {
				if(checkquest(8856)&2 == 0) {
					mes "[トリョリョ]";
					cutin "ep19_iwin03.png", 2;
					mes "ありがとう、人間。";
					mes "明日またお願いするよ。";
					mes "そうそう、持ってきてくれた食材だけど、";
					mes "前に他の人間が味わってみて仰天してたよ。";
					mes "人間の口には会わないのかも知れない。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ぷにぷに珍味収集①^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(8855)) {
				if(checkquest(8855)&4 == 0 || countitem(1001233) < 5 || countitem(1001232) < 5) {
					mes "[トリョリョ]";
					cutin "ep19_iwin03.png", 2;
					mes "^e5555e天使ウミウシ^000000と";
					mes "^e5555e雪ウサギウミウシ^000000を各10匹ずつ倒して、";
					mes "<ITEM>[ほどよく甘いぷにぷに蛍光細胞]<INFO>1001233</INFO></ITEM> 5個と";
					mes "<ITEM>[すこし塩辛いぷにぷに蛍光細胞]<INFO>1001232</INFO></ITEM> 5個を";
					mes "採ってきてくれ。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ぷにぷに珍味収集①^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 8855;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ぷにぷに珍味収集①^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ぷにぷに珍味収集①^000000」";
				mes "<内容1>";
				mes "対象：<URL>天使ウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_ANGEL_ICESLUG</INFO></URL>　10体";
				mes "対象：<URL>雪ウサギウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_RABBIT_ICESLUG</INFO></URL>　10体";
				mes "の討伐と";
				next;
				mes "<内容2>";
				mes "アイテム：<ITEM>ほどよく甘いぷにぷに蛍光細胞<INFO>1001233</INFO></ITEM>　5個";
				mes "アイテム：<ITEM>すこし塩辛いぷにぷに蛍光細胞<INFO>1001232</INFO></ITEM>　5個";
				mes "の納品";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 19G ( 19000000000 )";
				mes "※950000000を20回受け取ります。";
				mes "JobExp 14.25G ( 14250000000 )";
				mes "※712500000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ぷにぷに珍味収集①^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 1001233,5;
				delitem 1001232,5;
				delquest 8855;
				setquest 8856;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 950000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,712500000,0;
				mes "[トリョリョ]";
				cutin "ep19_iwin03.png", 2;
				mes "ありがとう、人間！";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 19G";
				mes "( 19000000000 )";
				mes "※950000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 14.25G";
				mes "( 14250000000 )";
				mes "※712500000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[トリョリョ]";
			cutin "ep19_iwin03.png", 2;
			mes "^e5555e天使ウミウシ^000000と";
			mes "^e5555e雪ウサギウミウシ^000000を各10匹ずつ倒して、";
			mes "<ITEM>[ほどよく甘いぷにぷに蛍光細胞]<INFO>1001233</INFO></ITEM> 5個と";
			mes "<ITEM>[すこし塩辛いぷにぷに蛍光細胞]<INFO>1001232</INFO></ITEM> 5個を";
			mes "採ってきてくれ。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ぷにぷに珍味収集①^000000」";
			mes "<内容1>";
			mes "対象：<URL>天使ウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_ANGEL_ICESLUG</INFO></URL>　10体";
			mes "対象：<URL>雪ウサギウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_RABBIT_ICESLUG</INFO></URL>　10体";
			mes "の討伐と";
			next;
			mes "<内容2>";
			mes "アイテム：<ITEM>ほどよく甘いぷにぷに蛍光細胞<INFO>1001233</INFO></ITEM>　5個";
			mes "アイテム：<ITEM>すこし塩辛いぷにぷに蛍光細胞<INFO>1001232</INFO></ITEM>　5個";
			mes "の納品の";
			mes "両方の達成で報告が可能です。";
			mes "クエストを受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[トリョリョ]";
				cutin "ep19_iwin03.png", 2;
				mes "む、中断するのか？";
				mes "それがあれば、";
				mes "育児の手間が減るだが……仕方がない。";
				mes "また手が空いた時に頼むよ！";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 8855;
			if(checkquest(8856)) delquest 8856;
			mes "[トリョリョ]";
			cutin "ep19_iwin03.png", 2;
			mes "ありがとう、人間！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ぷにぷに珍味収集①^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 1:	// ぷにぷに珍味収集②
			if(checkquest(8858)) {
				if(checkquest(8858)&2 == 0) {
					mes "[トリョリョ]";
					cutin "ep19_iwin03.png", 2;
					mes "ありがとう、人間。";
					mes "明日またお願いするよ。";
					mes "そうそう、持ってきてくれた食材だけど、";
					mes "前に他の人間が味わってみて仰天してたよ。";
					mes "人間の口には会わないのかも知れない。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ぷにぷに珍味収集②^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(8857)) {
				if(checkquest(8857)&4 == 0 || countitem(1001231) < 5) {
					mes "[トリョリョ]";
					cutin "ep19_iwin03.png", 2;
					mes "^e5555eメリベウミウシ^000000を15匹倒して";
					mes "<ITEM>[ちょっと酸っぱいぷにぷに蛍光細胞]<INFO>1001231</INFO></ITEM> 5個を";
					mes "採ってきてくれ。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ぷにぷに珍味収集②^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 8857;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000ぷにぷに珍味収集②^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ぷにぷに珍味収集②^000000」";
				mes "<内容1>";
				mes "対象：<URL>メリベウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>　15体";
				mes "の討伐と";
				next;
				mes "<内容2>";
				mes "アイテム：<ITEM>ちょっと酸っぱいぷにぷに蛍光細胞<INFO>1001231</INFO></ITEM>　5個";
				mes "の納品";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 22G ( 22000000000 )";
				mes "※1100000000を20回受け取ります。";
				mes "JobExp 16.5G ( 16500000000 )";
				mes "※825000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000ぷにぷに珍味収集②^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 1001231,5;
				delquest 8857;
				setquest 8858;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 1100000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,825000000,0;
				mes "[トリョリョ]";
				cutin "ep19_iwin03.png", 2;
				mes "ありがとう、人間！";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 22G";
				mes "( 22000000000 )";
				mes "※1100000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 16.5G";
				mes "( 16500000000 )";
				mes "※825000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[トリョリョ]";
			cutin "ep19_iwin03.png", 2;
			mes "^e5555eメリベウミウシ^000000を15匹倒して";
			mes "<ITEM>[ちょっと酸っぱいぷにぷに蛍光細胞]<INFO>1001231</INFO></ITEM> 5個を";
			mes "採ってきてくれ。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ぷにぷに珍味収集②^000000」";
			mes "<内容1>";
			mes "対象：<URL>メリベウミウシ<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>　15体";
			mes "の討伐と";
			next;
			mes "<内容2>";
			mes "アイテム：<ITEM>ちょっと酸っぱいぷにぷに蛍光細胞<INFO>1001231</INFO></ITEM>　5個";
			mes "の納品の";
			mes "両方の達成で報告が可能です。";
			mes "クエストを受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[トリョリョ]";
				cutin "ep19_iwin03.png", 2;
				mes "む、中断するのか？";
				mes "それがあれば、";
				mes "育児の手間が減るだが……仕方がない。";
				mes "また手が空いた時に頼むよ！";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 8857;
			if(checkquest(8858)) delquest 8858;
			mes "[トリョリョ]";
			cutin "ep19_iwin03.png", 2;
			mes "ありがとう、人間！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000ぷにぷに珍味収集②^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	//未調査
	close;
OnQuestInfo:
	if(EP20_1QUE == 100) {
		if((checkquest(8855) && checkquest(8855)&4 == 0 || countitem(1001233) < 5 || countitem(1001232) < 5) && 
			(checkquest(8857) && checkquest(8857)&4 == 0 || countitem(1001231) < 5))
			showevent 0, 3, "トリョリョ#ep20_DQ_5";
	}
	end;
}
icas_in.gat,242,45,3	script	コポ#保育園01	21995,{/* 3741 */
	unittalk "ぴゅ。",1;
	end;
}
icas_in.gat,243,45,5	script	コポ#保育園02	21995,{/* 3742 */
	unittalk "ぴゅぴゅ。",1;
	end;
}
icas_in.gat,241,44,5	script	コポ#保育園03	21995,{/* 3743 */
	unittalk "きゅきゅ。",1;
	end;
}
icas_in.gat,242,42,3	script	コポ#保育園04	21995,{/* 3744 */
	unittalk "きゅっ。",1;
	end;
}
icas_in.gat,243,42,1	script	コポ#保育園05	21995,{/* 3745 */
	unittalk "ぴゅびゅ。ぴゅ. 。",1;
	end;
}
icas_in.gat,244,43,7	script	コポ#保育園06	21995,{/* 3746 */
	unittalk "ぴゃっ。",1;
	end;
}
icas_in.gat,244,44,5	script	コポ#保育園07	21995,{/* 3747 */
	unittalk "ぴょっぴょっ。",1;
	end;
}
icas_in.gat,253,49,5	script	コポ#保育園08	21995,{/* 3748 */
	unittalk "ぴゅうぅ。",1;
	end;
}
icas_in.gat,241,58,3	script	コポ#保育園09	21995,{/* 3749 */
	unittalk "ぴゅ。",1;
	end;
}
icas_in.gat,240,58,5	script	コポ#保育園10	21995,{/* 3750 */
	unittalk "きゅきゅ。",1;
	end;
}
icas_in.gat,252,58,1	script	コポ#保育園11	21995,{/* 3751 */
	unittalk "ぴょっ！",1;
	end;
}
icas_in.gat,252,49,5	script	コポ#保育園12	21995,{/* 3752 */
	unittalk "ぴゅ！",1;
	end;
}
icas_in.gat,240,49,7	script	コポ#保育園13	21995,{/* 3753 */
	unittalk "ぴょっぴょっ。ぴょっ。",1;
	end;
}

//============================================================
// 新しい生活の拠り所クエスト
//- Registry -------------------------------------------------
// EP20_2QUE -> 0～	完了:100
//------------------------------------------------------------
icecastle.gat,46,164,5	script	アーウィン兵士#20ms60	21515,{/* 3754 */
	unittalk "毎日イライラしちゃうよ、マジで……",1;
	if(EP20_2QUE > 0) {
		mes "[アーウィン兵士]";
		mes "ルガンの捕虜に会いに行くんですよね？";
		mes "すぐにご案内いたしますね。";
		close2;
		warp "icas_in2.gat", 33, 114;
		end;
	}
	if(BaseLevel < 240 || EP20_1QUE < 100) {
		mes "[アーウィン兵士]";
		mes "冒険者殿！";
		mes "お願いしたいことがあるのですが";
		mes "後で改めてお願いさせてもらいます！";
		mes "では！";
		next;
		mes "^e6328c‐このクエストを進行するには";
		mes "^e6328c　以下の条件を満たす必要があります‐";
		mes "^e6328c　・BaseLv240以上";
		mes "^e6328c　・クエスト「死なない者」のクリア";
		mes "　^000000";
		mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
		messize 180,364;
		close;
	}
	mes "[アーウィン兵士]";
	mes "冒険者殿！";
	mes "ちょうど探していたところです！";
	mes "早く一緒に来てください。";
	next;
	menu "何かあったの？",-;
	mes "[アーウィン兵士]";
	mes "ホルルが捕虜にしたルガンなのですが";
	mes "私たちの手に負えないんです！";
	mes "あんな厄介な奴は初めてです！";
	emotion 54,"アーウィン兵士#20ms60",1;
	next;
	mes "[アーウィン兵士]";
	mes "経験豊富な冒険者殿なら";
	mes "奴をどうにかできるんじゃないかと";
	mes "思いまして……";
	mes "どうか私たちを助けてください！";
	next;
	if(select("行ってみましょう","後で行きます") == 2) {
		mes "[アーウィン兵士]";
		mes "あ……いきなり過ぎでしたね？";
		mes "では時間が出来た時にお願いします。";
		mes "本当に困っているんです……。";
		close;
	}
	mes "[アーウィン兵士]";
	mes "助かります！";
	mes "捕虜の身分なので隔離しているんです。";
	mes "すぐにご案内いたしますね。";
	setquest 17712;
	set EP20_2QUE,1;
	close2;
	warp "icas_in2.gat", 33, 114;
	end;
OnQuestInfo:
	if(BaseLevel >= 240 && EP20_1QUE >= 100 && EP20_2QUE == 0)
		showevent 1, 1;
	else if(EP20_2QUE == 100)
		showevent 6, 1, "アーウィン兵士#20ms60";
	// 1 以外 不明
	else if(EP20_2QUE >= 3)
		showevent 1, 1;
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[移動]";
	end;
}

icas_in2.gat,33,109,0	warp	#20ms64	1,1,icecastle.gat,51,164
icas_in2.gat,33,114,0	script	#20ms60	139,3,3,{/* 3756 */
	if(EP20_2QUE < 100) {
		cloakoffnpc "ホルル#20ms60";
		cloakoffnpc "アーウィン兵士#20ms61";
		cloakoffnpc "アーウィン兵士#20ms63";
		cloakoffnpc "アーウィン兵士#20ms64";
		cloakoffnpc "アーウィン兵士#20ms65";
		if(EP20_2QUE >= 5)
			cloakoffnpc "レイジー#20ms60";
	}
	else {
		cloakonnpc "ホルル#20ms60";
		cloakonnpc "アーウィン兵士#20ms61";
		cloakonnpc "アーウィン兵士#20ms63";
		cloakonnpc "アーウィン兵士#20ms64";
		cloakonnpc "アーウィン兵士#20ms65";
	}
	end;
}
icas_in2.gat,30,121,5	script	ナドヤガンド#ep20_DQ_6	10474,{/* 3757 */
	if(EP20_2QUE == 1) {
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "いい加減、知ってることを喋れ。";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[ナドヤガンド]";
		mes "うぅぅん……腹が減って";
		mes "しゃべる気力もないのだが？";
		unittalk "ナドヤガンド : こうやって死んでいくのか……",1;
		next;
		mes "[アーウィン兵士]";
		mes "これを食え、食いなさいよ！";
		mes "知らない人が見たら";
		mes "アーウィンは捕虜に対して";
		mes "ご飯も出さないのかと";
		mes "誤解されるじゃないか！";
		next;
		mes "[ナドヤガンド]";
		mes "こんな物は……お前らが啄め。";
		mes "まるで鳥の餌みたいだ。";
		next;
		mes "[アーウィン兵士]";
		mes "あーあーあーー！　言い方！　言い方!!";
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : こいつ、ぶっ飛ばしてやる！",1;
		emotion 54,"アーウィン兵士#20ms61";
		next;
		mes "[アーウィン兵士]";
		mes "これもイヤ、あれもダメ。";
		mes "できるだけの食料を集めたのに";
		mes "わがまま言って、食べない理由はなに？";
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : 鳥の餌だと言いやがった！",1;
		emotion 6,"アーウィン兵士#20ms62";
		next;
		mes "[アーウィン兵士]";
		mes "何が不満なんだよ？";
		mes "あんたひとりの機嫌を取るのに";
		mes "こっちは全員がイライラしてる。";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : これ以上、我慢する必要ある？",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms64"),"アーウィン兵士 : 興奮した熱で、氷の城が溶けちゃう！",1;
		next;
		mes "[ナドヤガンド]";
		mes "ああ……眩暈が……";
		mes "目がぐるぐる回る……。";
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : 目を回しているのは、こっちだよ～。",1;
		emotion 53,"ナドヤガンド#ep20_DQ_6";
		emotion 53,"アーウィン兵士#20ms65";
		next;
		mes "[ナドヤガンド]";
		mes "私の最後の言葉を聞いてくれ。";
		mes "もしかしたら、これが最後に";
		mes "なるかもしれない……。";
		next;
		mes "[アーウィン兵士]";
		mes "急に気落ちしてるぞ!?";
		mes "ルガンたちって、みんなこうなのか？";
		unittalk getnpcid(0,"アーウィン兵士#20ms64"),"アーウィン兵士 : 言う事が極端なんだよ！",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "こちらが用意したものを";
		mes "全部拒否しておいて……";
		mes "こいつ、何が欲しいと言ってたっけ？";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[アーウィン兵士]";
		mes "……ヘビイチゴ……だったかな？";
		unittalk getnpcid(0,"ホルル#20ms60"),"ホルル : なんだ、それ？",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : 知ってたら教えてる！",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : 誰も知らないんだ！",1;
		next;
		mes "[ナドヤガンド]";
		mes "^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]";
		mes "^i[1001154]ヘビイチゴ…ヘビイチゴ…^e[27]";
		mes "^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]";
		next;
		mes "[アーウィン兵士]";
		mes "何でも良いから、食べろよ……";
		mes "なんでこんなにわがままなんだ？";
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : 私なんてまだ、おやつも食べていないのに！",1;
		next;
		mes "[アーウィン兵士]";
		mes "一週間ほど放っておけば";
		mes "何でもありがたく食べるようになるって。";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : うちの婆さんも似たようなこと言ってたな",1;
		next;
		mes "[アーウィン兵士]";
		mes "まだ何も聞き出せていないのに";
		mes "飢え死にしちゃわない？";
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : それは、ちょっとあれだよね。",1;
		next;
		mes "[アーウィン兵士]";
		mes "餓えさせるだけだよ。";
		mes "死なないぐらいにね！";
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : それなら……まあ？",1;
		next;
		mes "[アーウィン兵士]";
		mes "このままじゃ私たちの方が";
		mes "先に倒れちまう！";
		unittalk getnpcid(0,"アーウィン兵士#20ms64"),"アーウィン兵士 : 同意",1;
		emotion 54,"アーウィン兵士#20ms65";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "本当に困ったな……";
		mes "どうしようか？";
		unittalk getnpcid(0,"ホルル#20ms60"),"ホルル : う～～ん……",1;
		chgquest 17712,17713;
		set EP20_2QUE,2;
		close2;
		cutin "ep19_iwin09.png", 255;
		end;
	}
	if(EP20_2QUE == 4) {
		mes "[ナドヤガンド]";
		mes "あぁ……もう限界だ……。";
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : こいつ、本当にいらいらする",1;
		next;
		mes "[アーウィン兵士]";
		mes "まだ腹が減ってないんじゃない？";
		mes "本当に空腹なら、なんでも食うだろ。";
		next;
		mes "[ナドヤガンド]";
		mes "大切な私を飢えさせるなんて……";
		mes "本当に使えん奴ら……。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "私たちはあんたの部下じゃない。";
		mes "あんたの言うことを聞く必要が";
		mes "どこにあるんだ？";
		next;
		cutin "ep19_iwin09.png", 255;
		menu "ヘビイチゴを持ってきましたよ",-;
		mes "[ナドヤガンド]";
		mes "ヘビイチゴ!!";
		next;
		mes "[ナドヤガンド]";
		mes "ふぅ！";
		mes "満足満足！";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : 顔色が変わったぞ！",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "満足したな？";
		mes "こちらはお前の要望を叶えた。";
		mes "次は、お前の知ってることを";
		mes "全部吐いてもらうぞ！";
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : わー悪党っぽい",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : ……格好いい",1;
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[ナドヤガンド]";
		mes "何を言えばいいのか、わからないな。";
		mes "ああ……";
		mes "最近ラスガンド様が外から来た人間と";
		mes "何かをやっていたな。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "それはすでに知ってる。";
		mes "どこで何をやっていたんだ？";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[ナドヤガンド]";
		mes "私も知らん。";
		mes "ああ！";
		mes "外から人間たちが魔力回収装置で";
		mes "魔力を吸収している！";
		next;
		mes "[アーウィン兵士]";
		mes "それも知ってるよ。";
		mes "それをヨルムンガンドの復活に";
		mes "使うためなのか？";
		next;
		mes "[ナドヤガンド]";
		mes "え？";
		mes "そうなの？";
		mes "知らなかった……。";
		next;
		mes "[アーウィン兵士]";
		mes "他に何か知らないのか？";
		mes "ラスガンドの目的とか…‥・";
		mes "弱点とか！";
		next;
		mes "[ナドヤガンド]";
		mes "知らない。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "最上級のルガンなんだろーー！";
		mes "なんで何も知らないんだ！";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[ナドヤガンド]";
		mes "最近、結構疲れてさ。";
		mes "時が近付いたとか言って";
		mes "主教である私たちだけ呼んでは";
		mes "そこで仕事をさせるんだ。";
		next;
		mes "[ナドヤガンド]";
		mes "私はそんな仕事などやったこと無いし";
		mes "やるつもりもないのに";
		mes "仕事をさせるんだよ。";
		next;
		mes "[アーウィン兵士]";
		mes "……完全にお坊ちゃまじゃないか。";
		next;
		mes "[ナドヤガンド]";
		mes "ところで、ここはすごく良い。";
		mes "楽だからな。";
		mes "ずっと、ここに住みたいぐらいだ。";
		next;
		mes "[アーウィン兵士]";
		mes "お世話してもらいながら";
		mes "過ごしたいってこと？";
		mes "とんでもない！";
		next;
		mes "[ナドヤガンド]";
		mes "なら、ここから逃げ出して";
		mes "全部、バラしてやるとしよう。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "それは困る。";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[ナドヤガンド]";
		mes "他にも食べたい物を";
		mes "思い出したんだが……？";
		next;
		mes "[アーウィン兵士]";
		mes "これ以上はダメ！";
		mes "恥知らずにもほどがある!!";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : もう出てけ、出て行けよ！",1;
		next;
		mes "[ナドヤガンド]";
		mes "ファァ……飯を食ったら眠くなった。";
		mes "昼寝をするから消灯してくれ。";
		mes "1時間以上寝るのはよくないから";
		mes "その前に起こすように。";
		mes "起きたらすぐ食事をするぞ。";
		next;
		mes "[アーウィン兵士]";
		mes "もう、うんざりだ！　帰ってくれ！";
		mes "これは温情ってやつだ……";
		mes "あんたにも大事な家族や";
		mes "友達がいるだろうからな！";
		next;
		mes "[ナドヤガンド]";
		mes "私たちは卵生だから";
		mes "家族とは言えないな？";
		mes "それに私には友達はいない。";
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : 無敵か!?　コイツ!!",1;
		next;
		cloakoffnpc "レイジー#20ms60";
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "お～い、冒険者～！";
		mes "結構探したんだぜ？";
		mes "うん？　ここで何をしてるんだ？";
		delitem 1001154,3;
		chgquest 17715,17716;
		set EP20_2QUE,5;
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
	if(EP20_2QUE == 5 || EP20_2QUE == 6) {
		cloakoffnpc "レイジー#20ms60";
		mes "[ナドヤガンド]";
		mes "あの者は……？";
		close;
	}
	if(EP20_2QUE == 100) {
		mes "[ナドヤガンド]";
		mes "ヘビイチゴを……なんだ。";
		mes "まだ持ってきてなかったのか。";
		mes "あれを食べないと元気が出ないから";
		mes "持って来るように。";
		next;
		if(select("クエストの受注や報告を行う","ダンジョンに移動する(蛇神の根源 02)") == 2) {
			mes "^ff0000‐移動には500Zenyが必要です‐^000000";
			next;
			mes "[ナドヤガンド]";
			mes "よし！";
			mes "それじゃ、現地にいってこい！";
			close;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_root2j.gat", 25, 17;
			end;
		}
		mes "クエストの受注や報告、";
		mes "取り消しが可能です。";
		next;
		setarray '@questname$,"一日の締めにヘビイチゴ";
		setarray '@questid,17718;
		setarray '@coolid,17721;
		setarray '@itemlist,1001154,3;
		setarray '@gainlist,1001217,3;
		setarray '@explist,200000000,150000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// 一日の締めにヘビイチゴ
			if(checkquest(17721)) {
				if(checkquest(17721)&2 == 0) {
					mes "[ナドヤガンド]";
					mes "一日の締めにヘビイチゴ……いいね！";
					mes "これが最近の楽しみなんだ！";
					mes "また、明日も持ってきてくれ！";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000一日の締めにヘビイチゴ^000000」";
					mes "は時間制限中です。^000000";
					close;
				}
			}
			if(checkquest(17718)) {
				if(countitem(1001154) < 3) {
					mes "[ナドヤガンド]";
					mes "蛇神の根源 02にいって、";
					mes "ヘビイチゴを3個採ってきてくれ。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000一日の締めにヘビイチゴ^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close;
					}
					delquest 17718;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000一日の締めにヘビイチゴ^000000」";
					mes "を破棄しました。";
					close;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000一日の締めにヘビイチゴ^000000」";
				mes "<内容>";
				mes "アイテム：<ITEM>[ヘビイチゴ]<INFO>1001154</INFO></ITEM>　3個";
				mes "を納品";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 4G ( 4000000000 )";
				mes "※200000000を20回受け取ります。";
				mes "JobExp 3G ( 3000000000 )";
				mes "※150000000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　3個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000一日の締めにヘビイチゴ^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close;
				}
				delitem 1001154,3;
				delquest 17718;
				setquest 17721;
				getitem 1001217,3;
				for('@i=0; '@i < 20; '@i++)
					getexp 200000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,150000000,0;
				mes "[ナドヤガンド]";
				mes "ありがとう！";
				mes "嗜好品を手に入れるのにも";
				mes "こんなにも働かないといけないんだな。";
				mes "一日の締めにヘビイチゴ……いいね！";
				mes "これが最近の楽しみなんだ！";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 4G";
				mes "( 4000000000 )";
				mes "※200000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 3G";
				mes "( 3000000000 )";
				mes "※150000000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　3個";
				mes "を獲得しました。";
				close;
			}
			mes "[ナドヤガンド]";
			mes "蛇神の根源 02にいって、";
			mes "ヘビイチゴを3個採ってきてくれ。";
			mes "それを食べなきゃ元気が出ないからな。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000一日の締めにヘビイチゴ^000000」";
			mes "<内容>";
			mes "アイテム：<ITEM>[ヘビイチゴ]<INFO>1001154</INFO></ITEM>　3個";
			mes "の納品を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[ナドヤガンド]";
				mes "何？？今日は我慢しろと？？";
				mes "このことは正式に抗議するぞ！";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 17718;
			if(checkquest(17721)) delquest 17721;
			mes "[ナドヤガンド]";
			mes "よし！頼んだからな！";
			mes "ヘビイチゴ3個だぞ！";
			mes "毎日それくらいは食べなきゃ、";
			mes "やってられないからな！";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000一日の締めにヘビイチゴ^000000」";
			mes "を受注しました。";
			close;
		}
	}
	mes "[ナドヤガンド]";
	mes "……今は何も聞きたくない。";
	close;
OnQuestInfo:
	if(EP20_2QUE == 2 || EP20_2QUE == 4)
		showevent 1, 1, "ナドヤガンド#ep20_DQ_6";
	else if(EP20_2QUE == 100) {
		if(checkquest(17718) && countitem(1001154) < 3)
			showevent 0, 2, "ナドヤガンド#ep20_DQ_6";
		else if(!checkquest(17718) || checkquest(17721)&2)
			showevent 0, 3, "ナドヤガンド#ep20_DQ_6";
		else
			showevent 9999, 0, "ナドヤガンド#ep20_DQ_6";
	}
	else
		showevent 9999, 0, "ナドヤガンド#ep20_DQ_6";
	end;
}
icas_in2.gat,31,116,1	script(CLOAKED)	ホルル#20ms60	10461,{/* 3758 (cloaking)*/
	if(EP20_2QUE == 2) {
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "欲しいと言ってるヘビイチゴを";
		mes "あげた方がいいんだろうが……。";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[アーウィン兵士]";
		mes "それって、どこで手に入るんだ？";
		mes "それが何なのかも知らないのに。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "こいつに聞くしかない。";
		mes "そのヘビイチゴというのは";
		mes "どうやって手に入れるんだ？";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[ナドヤガンド]";
		mes "私も知らん。";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : じゃあ何を知ってるんだよ！",1;
		next;
		mes "[ナドヤガンド]";
		mes "司祭たちが勝手に持ってくるものを";
		mes "私が知っているわけないだろう？";
		next;
		mes "[アーウィン兵士]";
		mes "何だぁ、こいつ!?";
		mes "もしかしてお坊ちゃまなの???";
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : ルガンの階級制度は徹底しているらしいが……",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : 自分が食べてるものぐらいは……",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms64"),"アーウィン兵士 : 何か口に入れるのも、手伝いが必要なのか？",1;
		next;
		menu "何かお困りのようですね？",-;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "ああ、冒険者！";
		mes "いいところに来てくれた！";
		mes "情報を得る為に連れて来たルガンが";
		mes "欲しい物をくれないと";
		mes "何も喋らないと無茶を言うんだ！";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[アーウィン兵士]";
		mes "わがままな上司が";
		mes "ひとり増えたみたいだ……。";
		next;
		mes "[アーウィン兵士]";
		mes "ルガンが上官だなんて";
		mes "世も末だなぁ。";
		next;
		menu "何を要求しているのですか？",-;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "「ヘビイチゴ」が食べたいらしい！";
		mes "そんなもの、聞いたことも無いのに！";
		next;
		cutin "ep19_iwin09.png", 255;
		menu "私は知ってますよ",-;
		unittalk getcharid(3),strcharinfo(0)+" : ルガンたちにとっての嗜好品らしいです",1;
		mes "[ナドヤガンド]";
		mes "その通り。";
		next;
		mes "[アーウィン兵士]";
		mes "流石は冒険者だ！";
		mes "なんでも知ってるなぁ！";
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : 信じていたよ！",1;
		next;
		menu "何個必要ですか？",-;
		mes "[ナドヤガンド]";
		mes "3個だ！";
		mes "^0000cdヘビイチゴ 3個^000000は食べたい！！";
		mes "主教である私には";
		mes "当然与えられるべきである。";
		next;
		mes "[アーウィン兵士]";
		mes "……要するに沢山ということか。";
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : 急に元気になったな",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : まるで上官じゃないか",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms64"),"アーウィン兵士 : 捕虜生活が悠々過ぎる！",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : 舌だけ回りやがって",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "冒険者だけが頼りだ。";
		mes "手に入る場所を知ってるなら";
		mes "そこに送るだけなら協力できそうだ。";
		mes "気を付けて行って来てくれ。";
		next;
		cutin "ep19_iwin09.png", 255;
		chgquest 17713,17714;
		set EP20_2QUE,3;
		mes "‐ヘビイチゴの採取へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐ヘビイチゴの採取へ";
		mes "　向かった‐";
		close2;
		warp "jor_root2j.gat", 85, 50;
		end;
	}
	if(EP20_2QUE == 3) {
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "冒険者だけが頼りだ。";
		mes "手に入る場所を知ってるなら";
		mes "そこに送るだけなら協力できそうだ。";
		mes "気を付けて行って来てくれ。";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "‐ヘビイチゴの採取へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ヘビイチゴの採取へ";
		mes "　向かった‐";
		close2;
		warp "jor_root2j.gat", 85, 50;
		end;
	}
	if(EP20_2QUE >= 5) {
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "あの人がこれほど";
		mes "頼りになる人だったなんて！";
		mes "私は勘違いしていたみたいだ。";
		close2;
		cutin "ep19_iwin09.png", 255;
		end;
	}
	cutin "ep19_iwin09.png", 2;
	mes "[ホルル]";
	mes "こんなに面倒なルガンだと知っていたら";
	mes "違う方法を取っていたよ。";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
OnQuestInfo:
	if(EP20_2QUE == 2 || EP20_2QUE == 3)
		showevent 1, 1, "ホルル#20ms60";
	end;
}
icas_in2.gat,32,120,3	script(CLOAKED)	レイジー#20ms60	10454,{/* 3759 (cloaking)*/
	if(EP20_2QUE == 5) {
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "おやおや！";
		mes "どこかで見たルガンだと思ったら";
		mes "私が変装させてもらったヤツか。";
		mes "こんにちは、私？";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[ナドヤガンド]";
		mes "お前は、あの時の人間か。";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "あんたのお陰様で助かったよ。";
		mes "本当にありがたいと思ってるが";
		mes "この恩はどうやって返せば良いんだ？";
		mes "感謝の気持ちを送るだけで良い？";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[ナドヤガンド]";
		mes "私もお前のお陰で嫌な仕事を";
		mes "やらずに済んだ。";
		mes "お互い様ということにしよう。";
		next;
		mes "[ナドヤガンド]";
		mes "さて、そこの者。";
		mes "私の足を揉みなさい。";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : いきなり？",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms64"),"アーウィン兵士 : そんなこと言う？",1;
		next;
		mes "[アーウィン兵士]";
		mes "イヤだよ！";
		mes "代わりに仕事を与えてやるから";
		mes "仕事をしろ！";
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : そうだ！　よく言った！",1;
		next;
		mes "[ナドヤガンド]";
		mes "こんな冷遇が許されると思うのか？";
		mes "主教である私に？";
		next;
		mes "[アーウィン兵士]";
		mes "ここではルガンの一匹に過ぎない！";
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : そうそう、只のルガンだ！",1;
		next;
		mes "[アーウィン兵士]";
		mes "はあ……もう行ってくれ。";
		mes "私たちが向こうまで運んであげるから。";
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : そこら辺に置いて来よう",1;
		next;
		mes "[ナドヤガンド]";
		mes "私は！";
		mes "行かない!!";
		next;
		mes "[アーウィン兵士]";
		mes "ああ！　もう！";
		mes "こっちがおかしくなりそうだ！";
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : まったくだ！",1;
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "わ～お！　なにこれ？";
		mes "もしかして今までずっと";
		mes "こんなやり取りしてたの？";
		next;
		menu "はい、ずっとこんな感じです",-;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "羽毛のみんな、";
		mes "ちょっと私とお話しよう。";
		mes "あのルガンの処遇について。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "何を話すと言うんだ！";
		mes "もう、いい加減うんざりなんだ！";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "今まで主教様として";
		mes "お坊ちゃんのように育てられてきたから";
		mes "あんな態度も仕方がない。";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "ああいうのは、今さら忠告したところで";
		mes "どうにもならない。";
		mes "何故だって？";
		mes "生まれてからずっと";
		mes "そうやって暮らしてきたんだからな。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "なら、あの厄介者を";
		mes "どうすれば良いんだ？";
		mes "ルガンの巣に送り返した方が";
		mes "私たちのためじゃないのか？";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : ずっと我慢しなきゃならないの？",1;
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : そんな！",1;
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "送り返すのはマズイ。";
		mes "こちらの情報を";
		mes "敵さんに知らせることになるからな。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "……何か考えがあるのか？";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "こき使ってやろう。";
		mes "思いっきり、こき使えばいい。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "こき使うだって？";
		mes "指一本だって動かさない奴なんだぞ？";
		mes "私たちを顎で使う態度、見てただろ！";
		mes "冒険者だってそのせいで";
		mes "わざわざ蛇の巣まで行って";
		mes "ヘビイチゴを採って来たんだ！";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "ふむ……おおよそ理解した。";
		mes "態度が問題みたいだな？";
		mes "では私が少し話をしてみるよ。";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "やあ、そこの私。";
		mes "私とちょっと話をしてみない？";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[ナドヤガンド]";
		mes "今はやることもないから、いくらでも。";
		next;
		mes "[レイジー]";
		mes "……仕事は……。";
		next;
		mes "[ナドヤガンド]";
		mes "……しかし……。";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : 何の話をしてるんだ？",1;
		emotion 9,"ナドヤガンド#ep20_DQ_6";
		next;
		mes "[レイジー]";
		mes "考え……を……。";
		next;
		mes "[ナドヤガンド]";
		mes "ほう……それはどうやって？";
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : あんなので説得できるかな？",1;
		next;
		mes "[レイジー]";
		mes "うん……そう、正しい！";
		emotion 33,"レイジー#20ms60";
		next;
		mes "[ナドヤガンド]";
		mes "本当にそれで……。";
		unittalk getnpcid(0,"アーウィン兵士#20ms65"),"アーウィン兵士 : 空気……変わったな",1;
		next;
		mes "[レイジー]";
		mes "できないことは……。";
		next;
		mes "[ナドヤガンド]";
		mes "なるほど……助言、感謝する。";
		emotion 21,"ナドヤガンド#ep20_DQ_6";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "はい、終わり！";
		unittalk getnpcid(0,"アーウィン兵士#20ms62"),"アーウィン兵士 : な、なんだってーー!?",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "な、なにが？";
		mes "なにが終わったんだって？";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "言葉通り";
		mes "全部解決したということだよ。";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : 信じられない！　こんなに短い時間で？",1;
		chgquest 17716,17717;
		set EP20_2QUE,6;
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
	if(EP20_2QUE == 6) {
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "問題は解決したから";
		mes "私はもう行くね～。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "待ってくれ！";
		mes "いったいどんな話をしたら";
		mes "あいつの顔が";
		mes "あんな爽やかになるんだ？";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "羽毛のみんな。";
		mes "見てあげておくれ。";
		mes "彼の新しい姿を……！";
		next;
		emotion 2,"ナドヤガンド#ep20_DQ_6";
		cutin "ep19_leizi02.png", 255;
		mes "[ナドヤガンド]";
		mes "釣竿をくれないか。";
		mes "それと網の手入れも教えてくれ。";
		next;
		mes "[ナドヤガンド]";
		mes "料理というのは";
		mes "下位の者がやるものだと思っていた。";
		mes "しかし、その者の話によれば";
		mes "料理ほど繊細で奥深い学問は";
		mes "無いらしい。";
		next;
		mes "[ナドヤガンド]";
		mes "正確な長さで素材を切り分け";
		mes "正確な計量によって完成させる……";
		mes "新しい生活の始まりを";
		mes "素晴らしい学問で豊かにするのも";
		mes "悪くはないだろう。";
		next;
		mes "[ナドヤガンド]";
		mes "期待で胸が高まる！";
		mes "さぁ、どこへ行けばいい？";
		mes "釣りから始めたいのだが？";
		next;
		mes "[アーウィン兵士]";
		mes "あ、ああ……";
		mes "私が案内しよう。";
		unittalk getnpcid(0,"アーウィン兵士#20ms63"),"アーウィン兵士 : なんてことだ!!",1;
		next;
		cloakonnpc "アーウィン兵士#20ms65";
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "いったいどういう手を使ったんだ!? ";
		mes "私たちはあの手この手で";
		mes "懐柔しようとして出来なかったのに!!";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[レイジー]";
		mes "それが私の飯の種だからな。";
		mes "まあ、なんというか今回は";
		mes "ある行為を別の観点から見れるように";
		mes "少し助言をしたんだよ。";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "労働、という行為に対する認識を";
		mes "彼に適応するように教えれば良い。";
		mes "網の手入れは気高い精神修行であり";
		mes "釣りは手応えを感じる瞑想であり";
		mes "料理は新たな創造を司る魔法である";
		mes "と、そんな風にね。";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[アーウィン兵士]";
		mes "うわぁ……";
		mes "この人、怖い……。";
		unittalk getnpcid(0,"アーウィン兵士#20ms61"),"アーウィン兵士 : 詐欺師みたい……",1;
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[レイジー]";
		mes "そうそう、冒険者にお願いがあるんだ。";
		mes "彼の為にヘビイチゴを採って来てくれ。";
		mes "可能であれば、毎日が良い。";
		mes "一生懸命働く人を無償で使うなんて";
		mes "非人道的だろ？";
		next;
		menu "それは、そうですね",-;
		cutin "ep19_leizi02.png", 0;
		mes "[レイジー]";
		mes "これにて一件落着。";
		mes "じゃ、もう私は行くよ～。";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[ホルル]";
		mes "私たちも、各自の仕事に戻らなきゃ！";
		mes "一応、解決したみたいですが";
		mes "ヘビイチゴの採取の件で";
		mes "冒険者には手伝ってもらいたい。";
		mes "明日から、よろしくお願いするよ。";
		close2;
		cutin "ep19_iwin09.png", 255;
		cloakonnpc "レイジー#20ms60";
		setquest 202435;
		delquest 17717;
		set EP20_2QUE,100;
		getitem 1001217,10;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_2QUE == 5 || EP20_2QUE == 6)
		showevent 1, 1, "レイジー#20ms60";
	else
		showevent 9999, 0, "レイジー#20ms60";
	end;
}
icas_in2.gat,37,118,3	script(CLOAKED)	アーウィン兵士#20ms61	10461,{/* 3760 (cloaking)*/
	unittalk "アーウィン兵士 : なんで、こんな目に遭わなきゃならないの？",1;
	end;
}
icas_in2.gat,34,117,3	script	アーウィン兵士#20ms62	10461,{/* 3761 */
	unittalk "アーウィン兵士 : 苦労するよ……まったく……",1;
	end;
}
icas_in2.gat,29,114,1	script(CLOAKED)	アーウィン兵士#20ms63	10461,{/* 3762 (cloaking)*/
	unittalk "アーウィン兵士 : ルガンたちはみんな、あんな感じなのか？",1;
	end;
}
icas_in2.gat,27,118,1	script(CLOAKED)	アーウィン兵士#20ms64	10461,{/* 3763 (cloaking)*/
	unittalk "アーウィン兵士 : 一生ここにいるつもりじゃないだろうな？",1;
	end;
}
icas_in2.gat,37,115,3	script(CLOAKED)	アーウィン兵士#20ms65	10461,{/* 3764 (cloaking)*/
	unittalk "アーウィン兵士 : 長生きすると、思いもよらないものを見てしまうな。",1;
	end;
}
icecastle.gat,134,108,0	script	#20ms61	139,{/* 3765 */}
icecastle.gat,134,108,3	script(CLOAKED)	ナドヤガンド#20ms61	10474,{/* 3766 (cloaking)*/}
icecastle.gat,69,107,0	script	#20ms62	139,{/* 3767 */}
icecastle.gat,69,107,5	script(CLOAKED)	ナドヤガンド#20ms62	10474,{/* 3768 (cloaking)*/}
icas_in.gat,235,54,0	script	#20ms63	139,{/* 3769 */}
icas_in.gat,235,54,3	script(CLOAKED)	ナドヤガンド#20ms63	10474,{/* 3770 (cloaking)*/}

jor_root2j.gat,90,50,5	script	固まった場所#20ms01	10428,{/* 6339 */
	if(EP20_2QUE == 3) {
		delquest 17714;
		setquest 17715;
		set EP20_2QUE,4;
		getitem 1001154,3;
		mes "‐ヘビイチゴを手に入れた‐";
		close;
	}
	if(EP20_2QUE == 4) {
		mes "‐ヘビイチゴを手に入れた";
		mes "　戻って報告しよう‐";
		close2;
		warp "icas_in2.gat", 33, 114;
		end;
	}
	if(checkquest(17718)) {
		if(countitem(1001154) >= 3) {
			mes "‐ヘビイチゴを手に入れた";
			mes "　戻って報告しよう‐";
			close2;
			warp "icas_in2.gat", 33, 114;
			end;
		}
		getitem 1001154,3;
		mes "‐ヘビイチゴを手に入れた‐";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_2QUE == 3 || EP20_2QUE == 4 || checkquest(17718))
		showevent 1, 1;
	end;
}
jor_root2j.gat,235,258,5	duplicate(固まった場所#20ms01)	固まった場所#20ms02	10428
jor_root2j.gat,77,191,5		duplicate(固まった場所#20ms01)	固まった場所#20ms03	10428

//============================================================
// コポの秘密基地クエスト
//- Registry -------------------------------------------------
// EP20_3QUE -> 0～24	完了:100
//------------------------------------------------------------
icecastle.gat,109,241,0	script	#ep20slug_1	139,9,9,{/* 3771 */
	if(EP20_3QUE == 9 || EP20_3QUE == 10)
		cloakoffnpc "フリーデリケ#ep20_1";
	end;
}
icecastle.gat,109,241,3	script	アーウィン配達員#ep20_1	10461,{/* 3772 */
	if(EP20_3QUE == 0) {
		if(EP19_2QUE < 36 || EP20_1QUE < 100) {
			mes "[アーウィン配達員]";
			mes "おっと～！";
			mes "すみません！";
			mes "ちょっと通りますよ～！";
			cutin "ep19_iwin11.png", 2;
			next;
			cutin "ep19_iwin11.png", 255;
			mes "^e6328c‐このクエストを進行するには^000000";
			mes "^e6328c　以下の条件を満たす必要があります‐^000000";
			mes "^e6328c　・クエスト「浄化の聖女」のクリア^000000";
			mes "^e6328c　・クエスト「死なない者」のクリア^000000";
			mes "　";
			mes "<URL>EPISODE：ISGARD ～説話の地～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
			mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			close;
		}
		mes "[アーウィン配達員]";
		mes "おっと～！";
		mes "すみません！";
		mes "ちょっと通りますよ～！";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[アーウィン配達員]";
		mes "あ！";
		mes strcharinfo(0)+"様！";
		mes "こんなところで会うなんて！";
		mes "荷物が多くて前がよく見えませんでした！";
		mes "ホホホホホッ！";
		next;
		menu "手伝いましょうか？",-;
		mes "[アーウィン配達員]";
		mes "いえいえ。";
		mes "大丈夫ですよ！";
		mes "いろいろお忙しいのに";
		mes "こんな仕事まで手伝うことないです！";
		next;
		menu "重そうですよ？",-;
		mes "[アーウィン配達員]";
		mes "ゆっくり運びますから";
		mes "大丈夫……うっ！（ゴキッ）";
		next;
		mes "[アーウィン配達員]";
		mes "ふぅ……";
		mes "では、お言葉に甘えて";
		mes "この小さい箱を運んでいただけますか？";
		next;
		mes "[アーウィン配達員]";
		mes "フリーデリケ様宛のお荷物です。";
		mes "ヴォークリンデ様からと言えば";
		mes "わかっていただけるでしょう。";
		next;
		mes "[アーウィン配達員]";
		mes "すいませんが";
		mes "よろしくお願いします～。";
		next;
		cutin "ep19_iwin11.png", 255;
		setquest 11928;
		set EP20_3QUE,1;
		viewpoint 1, 68, 210, 1, 0xFF0000;
		mes "‐フリーデリケの滞在所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐フリーデリケの滞在所へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 68, 210;
		end;
	}
	if(EP20_3QUE == 1) {
		mes "[アーウィン配達員]";
		mes "ふぅ……";
		mes "では、お言葉に甘えて";
		mes "この小さい箱を運んでいただけますか？";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[アーウィン配達員]";
		mes "フリーデリケ様宛のお荷物です。";
		mes "ヴォークリンデ様からと言えば";
		mes "わかっていただけるでしょう。";
		next;
		mes "[アーウィン配達員]";
		mes "すいませんが";
		mes "よろしくお願いします～。";
		next;
		cutin "ep19_iwin11.png", 255;
		viewpoint 1, 68, 210, 1, 0xFF0000;
		mes "‐フリーデリケの滞在所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐フリーデリケの滞在所へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 68, 210;
		end;
	}
	if(EP20_3QUE == 9) {
		mes "[アーウィン配達員]";
		mes "こんにちは";
		mes "フリーデリケ様。";
		mes "お荷物は受け取っていただけましたか？";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "無事に受け取りました。";
		mes "いつもありがとう。";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[アーウィン配達員]";
		mes "いえいえ。";
		mes "これが私の仕事ですから。";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "あ、そうだ！";
		mes "ロロヒュを見てませんか？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アーウィン配達員]";
		mes "ロロヒュですか？";
		mes "う～ん、見ていませんねぇ。";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "どこへ行ったのかな？";
		mes "お腹減ってるはずなのに～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "う～ん……";
		mes "他の場所も探してみようか。";
		mes "「兵舎」に行ってみましょう。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アーウィン配達員]";
		mes "外は危ないですから";
		mes "あまり遠くまで行かないでくださいね。";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "は～～い！";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		viewpoint 1, 186, 218, 1, 0xFF0000;
		chgquest 11936,11937;
		set EP20_3QUE,10;
		mes "‐兵舎へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐兵舎へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 186, 218;
		end;
	}
	if(EP20_3QUE == 10) {
		mes "[アーウィン配達員]";
		mes "ロロヒュですか？";
		mes "う～ん、見ていませんねぇ。";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "どこへ行ったのかな？";
		mes "お腹減ってるはずなのに～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "う～ん……";
		mes "他の場所も探してみようか。";
		mes "「兵舎」に行ってみましょう。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アーウィン配達員]";
		mes "外は危ないですから";
		mes "あまり遠くまで行かないでくださいね。";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "は～～い！";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		viewpoint 1, 186, 218, 1, 0xFF0000;
		mes "‐兵舎へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐兵舎へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 186, 218;
		end;
	}
	mes "[アーウィン配達員]";
	mes "おっと～！";
	mes "すみません！";
	mes "ちょっと通りますよ～！";
	cutin "ep19_iwin11.png", 2;
	close2;
	cutin "ep19_iwin11.png", 255;
	end;
OnQuestInfo:
	if(EP20_3QUE == 1 || EP20_3QUE == 9)
		showevent 1, 1, "アーウィン配達員#ep20_1";
	else if(EP20_3QUE == 10)
		showevent 1, 1, "アーウィン配達員#ep20_1";
	else if(EP19_2QUE == 36 && EP20_1QUE == 100)
		showevent 0, 1, "アーウィン配達員#ep20_1";
	end;
}
icecastle.gat,106,241,5	script(CLOAKED)	フリーデリケ#ep20_1	10458,{/* 3773 (cloaking)*/}

icas_in.gat,32,116,3	script(CLOAKED)	コポ#ep20_1	21995,{/* 3775 (cloaking)*/
	if(EP20_3QUE == 2) {
		mes "[コポ]";
		mes "もうご飯の時間？";
		mes "なら、おうちに帰らなきゃ。";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[コポ]";
		mes "遅れたら、ママに怒られちゃう！";
		close2;
		cutin "ep20_cocopo02.png", 255;
		cloakonnpc "コポ#ep20_1";
		chgquest 11929,11930;
		set EP20_3QUE,3;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 2)
		showevent 1, 1, "コポ#ep20_1";
	end;
}
icas_in.gat,30,120,3	script(CLOAKED)	コポ#ep20_2	21995,{/* 3776 (cloaking)*/
	if(EP20_3QUE == 3) {
		mes "[コポ]";
		mes "え～～っ！";
		mes "家に帰りたくない！";
		mes "ここが一番暖かいもん!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[タマリン]";
		mes "また、ママに怒られるよ？";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[コポ]";
		mes "ちぇっ……。";
		cutin "ep20_cocopo03.png", 2;
		close2;
		cutin "ep20_cocopo02.png", 255;
		cloakonnpc "コポ#ep20_2";
		chgquest 11930,11931;
		set EP20_3QUE,4;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 3)
		showevent 1, 1, "コポ#ep20_2";
	end;
}
icas_in.gat,36,117,3	script(CLOAKED)	コポ#ep20_3	21995,{/* 3777 (cloaking)*/
	if(EP20_3QUE == 4) {
		mes "[コポ]";
		mes "知ってる？";
		mes "今日のお夕飯は、酢ルガンだよ。";
		cutin "ep20_cocopo02.png", 2;
		close2;
		cutin "ep20_cocopo02.png", 255;
		cloakonnpc "コポ#ep20_3";
		chgquest 11931,11932;
		set EP20_3QUE,5;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 4)
		showevent 1, 1, "コポ#ep20_3";
	end;
}
icas_in.gat,28,119,3	script(CLOAKED)	コポ#ep20_4	21995,{/* 3778 (cloaking)*/
	if(EP20_3QUE == 5) {
		mes "[コポ]";
		mes "……スヤスヤ～。";
		cutin "ep20_cocopo_baby.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "その子は、カポポです。";
		mes "チャココはお兄ちゃんだから";
		mes "カポポの面倒をみてあげないと～。";
		mes "……あれ？　チャココ？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "チャココは先に";
		mes "帰っちゃったみたい。";
		mes "しょうがないなぁ～。";
		mes "私はこの子の家を知っていますから";
		mes "送り届けますね。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[タマリン]";
		mes "あっ！";
		mes "お出かけですか？";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "遠くはないから";
		mes "すぐ帰って来るよ。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[タマリン]";
		mes "う～ん……";
		mes strcharinfo(0)+"様、";
		mes "フリーデリケ様だけでは心配なので";
		mes "一緒について行ってもらえませんか？";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "街の中を歩くだけだから";
		mes "大丈夫だよ～。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[タマリン]";
		mes "最近よくない噂があるんです。";
		mes "杞憂だと思いますが、お願いします。";
		cutin "ep19_tamarin01.png", 2;
		next;
		cutin "ep19_tamarin04.png", 255;
		chgquest 11932,11933;
		set EP20_3QUE,6;
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
		warp "icecastle.gat", 65, 213;
		end;
	}
	if(EP20_3QUE == 6) {
		mes "[コポ]";
		mes "……スヤスヤ～。";
		cutin "ep20_cocopo_baby.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "しょうがないなぁ～。";
		mes "私はこの子の家を知っていますから";
		mes "送り届けますね。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[タマリン]";
		mes strcharinfo(0)+"様、";
		mes "フリーデリケ様だけでは心配なので";
		mes "一緒について行ってもらえませんか？";
		cutin "ep19_tamarin01.png", 2;
		next;
		cutin "ep19_tamarin01.png", 255;
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
		warp "icecastle.gat", 65, 213;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 5 || EP20_3QUE == 6)
		showevent 1, 1, "コポ#ep20_4";
	end;
}

icecastle.gat,65,213,0	script	#ep20slug_3	139,9,9,{/* 3778 */
	if(EP20_3QUE == 6 || EP20_3QUE == 7 || EP20_3QUE == 8 || EP20_3QUE == 9)
		cloakoffnpc "フリーデリケ#ep20_2";
	else if(EP20_3QUE == 23) {
		cloakoffnpc "ロロヒュ#ep20_e";
		cloakoffnpc "ララハ#ep20_DQ_8";
	}
	end;
}
icecastle.gat,70,216,3	script(CLOAKED)	フリーデリケ#ep20_2	10458,{/* 3779 (cloaking)*/
	if(EP20_3QUE == 6) {
		mes "[フリーデリケ]";
		mes "もう！";
		mes "みんな過保護過ぎ！";
		mes "私ひとりでも大丈夫なのに～。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "チャココのおうちは";
		mes "ここから下にくだったところです。";
		mes "遅くなるとタタリンがうるさいので";
		mes "早く行きましょ～。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11933,11934;
		set EP20_3QUE,7;
		mes "‐チャココの家へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐チャココの家へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 64, 164;
		end;
	}
	if(EP20_3QUE == 7) {
		mes "[フリーデリケ]";
		mes "チャココのおうちは";
		mes "ここから下にくだったところです。";
		mes "遅くなるとタタリンがうるさいので";
		mes "早く行きましょ～。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "‐チャココの家へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐チャココの家へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 64, 164;
		end;
	}
	if(EP20_3QUE == 8) {
		mes "[フリーデリケ]";
		mes strcharinfo(0)+"様。";
		mes "せっかくですから";
		mes "お部屋で休んでいかれませんか？";
		mes "お菓子とお茶を用意しますよ～。";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[ララハ]";
		mes "フリーデリケ様！";
		mes "フリーデリケ様ぁ！";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "こんにちは、ララハ。";
		mes "どうかしたの？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[ララハ]";
		mes "ロロヒュを探してるんです。";
		mes "お部屋の中にいますか？";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "え～～っと……";
		mes "ちょっと待ってくださいね。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "タ～タ～リ～～ン！";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[タマリン]";
		mes "タマリンですってば！";
		mes "それで、どうしたんですか？";
		mes "部屋にも入らずに。";
		cutin "ep19_tamarin01.png", 0;
		next;
		mes "[フリーデリケ]";
		mes "ロロヒュは、部屋の中にいる？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[タマリン]";
		mes "いいえ。";
		mes "さっき、ご飯を食べに帰ると言って";
		mes "部屋から出て行きましたよ？";
		cutin "ep19_tamarin01.png", 0;
		next;
		mes "[ララハ]";
		mes "ああ、そんな……";
		mes "家には帰ってきていません！";
		mes "もう、ご飯の時間なのに。";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[ララハ]";
		mes "あの子はどこで";
		mes "道草を食っているのかしら。";
		next;
		mes "[フリーデリケ]";
		mes "それじゃあ、お散歩中に会ったら";
		mes "おうちに送るようにしますね～。";
		cutin "ep19_friederike01.png", 2;
		next;
		menu "お散歩？",-;
		mes "[フリーデリケ]";
		mes "街の中をお散歩しましょう";
		mes strcharinfo(0)+"様。";
		mes "いいですよね～？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "では、少し歩いてみましょうか～。";
		mes "ふふっ。";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11935,11936;
		set EP20_3QUE,9;
		mes "‐東側へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐東側へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 107, 236;
		end;
	}
	if(EP20_3QUE == 9) {
		mes "[フリーデリケ]";
		mes "街の中をお散歩しましょう";
		mes strcharinfo(0)+"様。";
		mes "いいですよね～？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "では、少し歩いてみましょうか～。";
		mes "ふふっ。";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "‐東側へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐東側へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 107, 236;
		end;
	}
	//23不明
	end;
OnQuestInfo:
	if(EP20_3QUE == 6 || EP20_3QUE == 7 || EP20_3QUE == 8 || EP20_3QUE == 9)
		showevent 1, 1, "フリーデリケ#ep20_2";
	end;
}

icecastle.gat,62,160,0	script	#ep20slug_4	139,9,9,{/* 3780 */
	if(EP20_3QUE == 7 || EP20_3QUE == 8) {
		cloakoffnpc "フリーデリケ#ep20_3";
		cloakoffnpc "チャチャロ#ep20";
	}
	end;
}
icecastle.gat,62,160,5	script(CLOAKED)	フリーデリケ#ep20_3	10458,{/* 3781 (cloaking)*/}
icecastle.gat,63,158,3	script(CLOAKED)	チャココ#ep20_3	21995,{/* 3782 (cloaking)*/}
icecastle.gat,65,159,3	script(CLOAKED)	チャチャロ#ep20	10461,{/* 3783 (cloaking)*/
	if(EP20_3QUE == 7) {
		mes "[チャチャロ]";
		mes "あら！　フリーデリケ様。";
		mes "それに"+strcharinfo(0)+"様も。";
		mes "お散歩ですか？";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "カポポをお届けに参りました～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[チャチャロ]";
		mes "あ～～！";
		mes "またチャココがカポポを";
		mes "置いて来たのね！";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[チャチャロ]";
		mes "チャココ！";
		mes "チャココ!!";
		cloakoffnpc "チャココ#ep20_3";
		next;
		mes "[チャココ]";
		mes "うん？";
		mes "なに～母ちゃん？";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[チャチャロ]";
		mes "あんたまた";
		mes "フリーデリケ様のお部屋に";
		mes "カポポを置いてきたでしょ！";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[チャココ]";
		mes "あーっ！";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[チャチャロ]";
		mes "まったく、あんたって子は!!";
		mes "弟を置いて来るなんて！";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[チャチャロ]";
		mes "フリーデリケ様";
		mes "カポポを連れてきてくださり";
		mes "ありがとうございます。";
		mes "チャココは厳しく叱っておきますので。";
		next;
		mes "[フリーデリケ]";
		mes "私のことは気にしないでください～。";
		mes "えっと……";
		mes "あまり叱らないであげてくださいね？";
		mes "では、お部屋に帰りましょうか。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[チャココ]";
		mes "フリーデリケさま、行かないで～！";
		mes "ママに叱られちゃう！";
		mes "ペンペンされちゃうよ～～！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[チャチャロ]";
		mes "オホホホ！";
		mes "フリーデリケ様はお忙しいのよ。";
		mes "さあ、早くお家にはいりなさ～～い。";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[チャココ]";
		mes "キャ～～～ッ!!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo02.png", 255;
		chgquest 11934,11935;
		set EP20_3QUE,8;
		mes "‐フリーデリケの滞在所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐フリーデリケの滞在所へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 70, 211;
		end;
	}
	if(EP20_3QUE == 8) {
		mes "[チャココ]";
		mes "フリーデリケさま、行かないで～！";
		mes "ママに叱られちゃう！";
		mes "ペンペンされちゃうよ～～！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[チャチャロ]";
		mes "オホホホ！";
		mes "フリーデリケ様はお忙しいのよ。";
		mes "さあ、早くお家にはいりなさ～～い。";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[チャココ]";
		mes "キャ～～～ッ!!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo02.png", 255;
		mes "‐フリーデリケの滞在所へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐フリーデリケの滞在所へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 70, 211;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 7 || EP20_3QUE == 8)
		showevent 1, 1, "チャチャロ#ep20";
	end;
}
icas_in.gat,111,40,5	script(CLOAKED)	フリーデリケ#ep20_4	10458,{/* 3784 (cloaking)*/}
icas_in.gat,113,38,3	script	アーウィン警備兵#ep20_1	10461,{/* 3785 */
	if(EP20_3QUE == 10) {
		mes "[アーウィン警備兵]";
		mes "ごきげんよう";
		mes "フリーデリケ様。";
		mes "ヴェルグンデ様に御用ですか？";
		cutin "ep19_iwin01.png", 2;
		cloakoffnpc "フリーデリケ#ep20_4";
		next;
		mes "[フリーデリケ]";
		mes "そうじゃなくて";
		mes "ロロヒュを探してるの。";
		mes "見てませんか？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アーウィン警備兵]";
		mes "見ていませんね。";
		mes "最近、何かと物騒ですから";
		mes "警備隊にも連絡しておきましょうか？";
		cutin "ep19_iwin01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "お手数でなければ";
		mes "お願いできますか？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "街の入口に行ってみましょうか。";
		mes "入口を見張っている警備隊に";
		mes "連絡が行ってるかもしれません。";
		mes "何事もなければいいけど……。";
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11937,11938;
		set EP20_3QUE,11;
		mes "‐街の入口へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐街の入口へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 24, 125;
		end;
	}
	if(EP20_3QUE == 11) {
		mes "[アーウィン警備兵]";
		mes "警備隊にも連絡しておきますね。";
		cutin "ep19_iwin01.png", 2;
		cloakoffnpc "フリーデリケ#ep20_4";
		next;
		mes "[フリーデリケ]";
		mes "お願いします。";
		mes "では、街の入口に行ってみましょうか。";
		mes "入口を見張っている警備隊に";
		mes "連絡が行ってるかもしれません。";
		mes "何事もなければいいけど……。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "‐街の入口へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐街の入口へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 24, 125;
		end;
	}
	cutin "ep19_iwin01.png", 2;
	mes "[アーウィン警備兵]";
	mes "敬礼時の羽根の角度！　足の開き方！";
	mes "一見カンタンな動作でも";
	mes "全員の動きが完璧に揃うと";
	mes "すごく格好いいんです。";
	mes "基礎教練は奥が深いですね。";
	close2;
	cutin "ep19_iwin01.png", 255;
	end;
OnQuestInfo:
	if(EP20_3QUE == 10 || EP20_3QUE == 11)
		showevent 1, 1, "アーウィン警備兵#ep20_1";
	end;
}

icecastle.gat,26,129,3	script(CLOAKED)	フリーデリケ#ep20_5	10458,{/* 3786 (cloaking)*/}
icecastle.gat,24,130,5	script	アーウィン警備兵#ep20_2	10461,{/* 3787 */
	if(EP20_3QUE == 11) {
		mes "[アーウィン警備兵]";
		mes "こんにちは";
		mes "フリーデリケ様。";
		mes "ここまでいらっしゃるなんて";
		mes "珍しいですね？";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "フリーデリケ#ep20_5";
		next;
		mes "[フリーデリケ]";
		mes "ロロヒュを探してるんです。";
		mes "見ませんでしたか～？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アーウィン警備兵]";
		mes "ロロヒュなら入口付近に立ってますよ。";
		mes "外に出たいと言って来たので";
		mes "ダメだと断ったら";
		mes "なら入口から外を見るって";
		mes "言い出して……。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[アーウィン警備兵]";
		mes "ほら、そこに。";
		next;
		mes "[フリーデリケ]";
		mes "ここにいたんだね。";
		mes "よかった～。";
		cutin "ep19_friederike03.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		chgquest 11938,11939;
		set EP20_3QUE,12;
		end;
	}
	if(EP20_3QUE == 12) {
		mes "[アーウィン警備兵]";
		mes "ロロヒュなら入口付近に立ってますよ。";
		mes "外に出たいと言って来たので";
		mes "ダメだと断ったら";
		mes "なら入口から外を見るって";
		mes "言い出して……。";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "フリーデリケ#ep20_5";
		cloakonnpc "フリーデリケ#ep20_6";
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 11)
		showevent 1, 1, "アーウィン警備兵#ep20_2";
	end;
}
icecastle.gat,22,128,3	script(CLOAKED)	フリーデリケ#ep20_6	10458,{/* 3788 (cloaking)*/}
icecastle.gat,20,128,3	script	コポ#ep20_綿	21995,{/* 3789 */
	if(EP20_3QUE == 12) {
		mes "[フリーデリケ]";
		mes "ここにいたのね、ロロヒュ？";
		mes "お母さんが心配してたよ。";
		mes "早くおうちに帰ろ……あ～～！";
		cloakonnpc "フリーデリケ#ep20_5";
		cloakoffnpc "フリーデリケ#ep20_6";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "これってロロヒュじゃなくて";
		mes "ただの綿の塊です～。";
		next;
		mes "[アーウィン警備兵]";
		mes "なんだってぇ!?";
		mes "あいつ、まさか綿の塊を";
		mes "自分の身代わりにして";
		mes "外に出ちゃったのか！";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[アーウィン警備兵]";
		mes "えらいこっちゃ！";
		mes "早く探しに行かなくちゃ！";
		next;
		mes "[フリーデリケ]";
		mes "私も行きます。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アーウィン警備兵]";
		mes "いけません！";
		mes "外は危険ですから";
		mes "捜索は警備隊にお任せください。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "足手まといには";
		mes "なりませんからぁ……";
		mes "ほら、回復魔法も使えますし？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[アーウィン警備兵]";
		mes "う～～～む。";
		mes "では"+strcharinfo(0)+"様から";
		mes "離れないようにしてくださいね。";
		mes "いいですかな？";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "は～～い！";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[アーウィン警備兵]";
		mes strcharinfo(0)+"様";
		mes "フリーデリケ様のこと";
		mes "よろしくお願いいたします。";
		mes "私は、捜索に向かう警備隊員たちを";
		mes "集めてきます。";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "では、外に出て";
		mes "ロロヒュを探しましょう。";
		mes "……ロロヒュ、大丈夫かなぁ。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11939,11940;
		set EP20_3QUE,13;
		mes "‐ロロヒュ探しへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐ロロヒュ探しへ";
		mes "　向かった‐";
		close2;
		warp "jor_back1.gat", 315, 245;
		end;
	}
	if(EP20_3QUE == 13) {
		mes "[アーウィン警備兵]";
		mes strcharinfo(0)+"様";
		mes "フリーデリケ様のこと";
		mes "よろしくお願いいたします。";
		mes "私は、捜索に向かう警備隊員たちを";
		mes "集めてきます。";
		cutin "ep19_iwin03.png", 2;
		cloakonnpc "フリーデリケ#ep20_5";
		cloakoffnpc "フリーデリケ#ep20_6";
		next;
		mes "[フリーデリケ]";
		mes "では、外に出て";
		mes "ロロヒュを探しましょう。";
		mes "……ロロヒュ、大丈夫かなぁ。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "‐ロロヒュ探しへ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐ロロヒュ探しへ";
		mes "　向かった‐";
		close2;
		warp "jor_back1.gat", 315, 245;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 12 || EP20_3QUE == 13)
		showevent 1, 1, "コポ#ep20_綿";
	end;
}
jor_back1.gat,310,245,3	script	綿毛#ep20_1	10046,{/* 3790 */
	if(EP20_3QUE == 13) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは北側へ移動したみたいだ-";
		next;
		chgquest 11940,11941;
		set EP20_3QUE,14;
		mes "‐北へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐北へ";
		mes "　向かった‐";
		close2;
		warp "jor_back1.gat", 219, 387;
		end;
	}
	if(EP20_3QUE == 14) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは北側へ移動したみたいだ-";
		next;
		mes "‐北へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐北へ";
		mes "　向かった‐";
		close2;
		warp "jor_back1.gat", 219, 387;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 13 || EP20_3QUE == 14)
		showevent 1, 1, "綿毛#ep20_1";
	end;
}
jor_back1.gat,219,392,3	script	綿毛#ep20_2	10046,{/* 3791 */
	if(EP20_3QUE == 14) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは北側へ移動したみたいだ-";
		next;
		chgquest 11941,11942;
		set EP20_3QUE,15;
		mes "‐北へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐北へ";
		mes "　向かった‐";
		close2;
		warp "jor_back2.gat", 13, 242;
		end;
	}
	if(EP20_3QUE == 15) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは北側へ移動したみたいだ-";
		next;
		mes "‐北へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐北へ";
		mes "　向かった‐";
		close2;
		warp "jor_back2.gat", 13, 242;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 14 || EP20_3QUE == 15)
		showevent 1, 1, "綿毛#ep20_2";
	end;
}
jor_back2.gat,8,242,3	script	綿毛#ep20_3	10046,{/* 3792 */
	if(EP20_3QUE == 15) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは西側へ移動したみたいだ-";
		next;
		chgquest 11942,11943;
		set EP20_3QUE,16;
		mes "‐西へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐西へ";
		mes "　向かった‐";
		close2;
		warp "jor_back3.gat", 158, 360;
		end;
	}
	if(EP20_3QUE == 16) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは西側へ移動したみたいだ-";
		next;
		mes "‐西へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐西へ";
		mes "　向かった‐";
		close2;
		warp "jor_back3.gat", 158, 360;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 15 || EP20_3QUE == 16)
		showevent 1, 1, "綿毛#ep20_3";
	end;
}
jor_back3.gat,163,360,3	script	綿毛#ep20_4	10046,{/* 3793 */
	if(EP20_3QUE == 16) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは北側へ移動したみたいだ-";
		next;
		chgquest 11943,11944;
		set EP20_3QUE,17;
		mes "‐北へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐北へ";
		mes "　向かった‐";
		close2;
		warp "jor_back4.gat", 101, 260;
		end;
	}
	if(EP20_3QUE == 17) {
		mes "‐ロロヒュの綿毛のようだ。";
		mes "　落ちている綿毛の方向から考えると";
		mes "　ロロヒュは北側へ移動したみたいだ-";
		next;
		mes "‐北へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐北へ";
		mes "　向かった‐";
		close2;
		warp "jor_back4.gat", 101, 260;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 16 || EP20_3QUE == 17)
		showevent 1, 1, "綿毛#ep20_4";
	end;
}

jor_back4.gat,101,265,0	script	#ep20slug_5	139,9,9,{/* 3794 */
	if(EP20_3QUE == 17 || EP20_3QUE == 18) {
		cloakoffnpc "フリーデリケ#ep20_7";
		cloakoffnpc "コポ#ep20_5";
	}
	if(EP20_3QUE >= 19)
		cloakoffnpc "コポ#ep20_5";
	end;
}
jor_back4.gat,103,264,3	script(CLOAKED)	フリーデリケ#ep20_7	10458,{/* 3795 (cloaking)*/
	if(EP20_3QUE == 17) {
		mes "[フリーデリケ]";
		mes "……ロロヒュ？";
		cutin "ep19_friederike02.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		end;
	}
	if(EP20_3QUE == 18) {
		mes "[フリーデリケ]";
		mes "この子が中に入る方法を";
		mes "知っているみたいです。";
		cutin "ep19_friederike02.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		end;
	}
	end;
}
jor_back4.gat,101,265,3	script(CLOAKED)	コポ#ep20_5	21995,{/* 3796 (cloaking)*/
	if(EP20_3QUE == 17) {
		mes "[フリーデリケ]";
		mes "あっ！";
		mes "こんな場所にコポがいますよ。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ねぇ貴方、大丈夫？";
		mes "ここで何をしているの？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[コポ]";
		mes "……。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "もしかして、怪我してる？";
		mes "すぐ治療してあげるね。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[コポ]";
		mes "……。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "どうしてこんな場所にいるの？";
		mes "街では見かけない子だけど……。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[コポ]";
		mes "………。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "どうして黙ってるの？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[コポ]";
		mes "……T.T";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "あっ、何で泣き出すの!?";
		mes "泣かないで～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[コポ]";
		mes "ピッ……ピイッ！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "あっ！";
		mes "この綿毛は、ロロヒュの！";
		mes "もしかして、ロロヒュがどこにいるか";
		mes "知ってるの？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[コポ]";
		mes "ピイッ！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes strcharinfo(0)+"様";
		mes "この子、上手く喋れないみたいだし";
		mes "子供にしては羽も多いし……";
		mes "ちょっと様子がおかしいです。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[コポ]";
		mes "……ピッピッ！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[コポ]";
		mes "ピッ……T.T";
		next;
		mes "[フリーデリケ]";
		mes "うん？";
		mes "なにしてるの？";
		mes "綿が……穴へ……？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "あ、もしかして……";
		mes "ロロヒュは、この穴の中にいるの？";
		next;
		mes "[コポ]";
		mes "ピョッ……T.T";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ロロヒュが、どうしてここに来たのか";
		mes "わからないけど……";
		mes "穴に落ちちゃったみたいです。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "う～～～ん……";
		mes "この前の洞窟のように";
		mes "毒で汚染されてはいないみたいです。";
		next;
		mes "[フリーデリケ]";
		mes "でも、警備隊の到着を待ってたら";
		mes "手遅れになるかも……";
		mes "私たちだけでも穴に入りましょう。";
		next;
		mes "[フリーデリケ]";
		mes "この子が中に入る方法を";
		mes "知ってるみたい～。";
		next;
		mes "[コポ]";
		mes "ピッ！！";
		mes "ピョッピョッ！！";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11944,11945;
		set EP20_3QUE,18;
		mes "‐中へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐中へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 51, 56;
		end;
	}
	if(EP20_3QUE == 18) {
		mes "[コポ]";
		mes "ピョッ……T.T";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "この子が中に入る方法を";
		mes "知ってるみたい～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[コポ]";
		mes "ピッ！！";
		mes "ピョッピョッ！！";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo03.png", 255;
		mes "‐中へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐中へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 51, 56;
		end;
	}
	if(EP20_3QUE >= 19) {
		mes "[コポ]";
		mes "ピッ！！";
		mes "ピョッピョッ！！";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo03.png", 255;
		mes "‐中へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐中へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 51, 56;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 17 || EP20_3QUE == 18)
		showevent 1, 1, "コポ#ep20_5";
	else if(EP20_3QUE >= 19)
		showevent 6, 1, "コポ#ep20_5";
	end;
}
jor_slug_j.gat,40,52,0	warp	#slugout	2,2,jor_back4.gat,101,260
jor_slug_j.gat,52,61,0	script	#ep20_slug_sw1	139,9,9,{/* 3799 */
	if(EP20_3QUE == 18 || EP20_3QUE == 19) {
		cloakoffnpc "フリーデリケ#sl1";
		cloakoffnpc "ロロヒュ#sl1";
	}
	else {
		cloakonnpc "フリーデリケ#sl1";
		cloakonnpc "ロロヒュ#sl1";
	}
	end;
}
jor_slug_j.gat,50,61,5	script(CLOAKED)	フリーデリケ#sl1	10458,{/* 3800 (cloaking)*/}
jor_slug_j.gat,52,61,3	script(CLOAKED)	ロロヒュ#sl1	21995,{/* 3801 (cloaking)*/
	if(EP20_3QUE == 18) {
		mes "[ロロヒュ]";
		mes "あっ！";
		mes "フリーデリケさま！";
		mes strcharinfo(0)+"さまも！";
		cutin "ep20_cocopo02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ロロヒュ！";
		mes "無事だったんだね。";
		mes "も～心配したんだから～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "どうして、こんな場所まで";
		mes "来ちゃったの？";
		next;
		mes "[ロロヒュ]";
		mes "あ……";
		mes "そ、それが……。";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "怪我してない？";
		mes "早く街に帰ろ？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "あ……";
		mes "だ、ダメ……！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ダメって、どういうこと？";
		mes "ここは危険だって知ってるよね？";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "そ、それは……。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "何があったのか教えて？";
		mes "言ってくれないと～";
		mes strcharinfo(0)+"様が";
		mes "力尽くで連れ帰っちゃうよ～。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "と、友達が……ひっく！";
		mes "化け物に…… ひっく……";
		mes "つ、連れ……ひっく……";
		mes "連れて行かれちゃったんだ!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "フリーデリケさまぁ！";
		mes strcharinfo(0)+"さまぁ！";
		mes "ボクの友達を助けてよぉ！";
		mes "うあああああん!!!";
		next;
		mes "[フリーデリケ]";
		mes "ええ～～大変！";
		mes "早く助けなくちゃ！";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ロロヒュ、友達はどちらの方に";
		mes "連れて行かれたの？";
		mes "案内して欲しいんだけど？";
		next;
		mes "[ロロヒュ]";
		mes "ひっく……うん！";
		mes "こっち！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes strcharinfo(0)+"様";
		mes "ロロヒュが案内してくれますから";
		mes "お友達を助けに行きましょう。";
		mes "迷っている暇はないですよ～。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		chgquest 11945,11946;
		set EP20_3QUE,19;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 85, 122;
		end;
	}
	if(EP20_3QUE == 19) {
		mes "[ロロヒュ]";
		mes "ひっく……";
		mes "こっち！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes strcharinfo(0)+"様";
		mes "ロロヒュが案内してくれますから";
		mes "お友達を助けに行きましょう。";
		mes "迷っている暇はないですよ～。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 85, 122;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 18 || EP20_3QUE == 19)
		showevent 1, 1, "ロロヒュ#sl1";
	end;
}
jor_slug_j.gat,86,127,0	script	#ep20_slug_sw2	139,9,9,{/* 3802 */
	if(EP20_3QUE == 19 || EP20_3QUE == 20) {
		cloakoffnpc "フリーデリケ#sl2";
		cloakoffnpc "コポ#sl2";
		cloakoffnpc "ロロヒュ#sl2";
	}
	else {
		cloakonnpc "フリーデリケ#sl2";
		cloakonnpc "コポ#sl2";
		cloakonnpc "ロロヒュ#sl2";
	}
	end;
}
jor_slug_j.gat,84,124,3	script(CLOAKED)	フリーデリケ#sl2	10458,{/* 3803 (cloaking)*/}
jor_slug_j.gat,83,127,5	script(CLOAKED)	コポ#sl2	21995,{/* 3804 (cloaking)*/}
jor_slug_j.gat,86,127,3	script(CLOAKED)	ロロヒュ#sl2	21995,{/* 3805 (cloaking)*/
	if(EP20_3QUE == 19) {
		mes "[ロロヒュ]";
		mes "え？　本当に？";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[コポ]";
		mes "ピョッ！";
		next;
		mes "[フリーデリケ]";
		mes "？？？";
		mes "ロロヒュは、この子の言ってることが";
		mes "わかるの？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "え？";
		mes "う、うん？";
		mes "少しだけ？";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ところで、お友達の名前を";
		mes "教えてくれない？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "え……";
		mes "名前？";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "呼びかける際に";
		mes "知っておかないと困るでしょ？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "あの子の名前は";
		mes "ピヨピョ……だよ。";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ピヨピョ?";
		mes "聞いたことのない名前だね。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "フリーデリケさまは";
		mes "会ったことないと思う……。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "そうなの？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "こっちの道だよ。";
		mes "でも、ウミウシたちが邪魔してる……";
		mes "先に進むなら気を付けなくちゃ。";
		cutin "ep20_cocopo01.png", 2;
		next;
		cutin "ep20_cocopo01.png", 255;
		chgquest 11946,131300;
		set EP20_3QUE,20;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 48, 181;
		end;
	}
	if(EP20_3QUE == 20) {
		mes "[ロロヒュ]";
		mes "こっちの道だよ。";
		mes "でも、ウミウシたちが邪魔してる……";
		mes "先に進むなら気を付けなくちゃ。";
		cutin "ep20_cocopo01.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 48, 181;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 19 || EP20_3QUE == 20)
		showevent 1, 1, "ロロヒュ#sl2";
	end;
}
jor_slug_j.gat,50,186,0	script	#ep20_slug_sw3	139,9,9,{/* 3806 */
	if(EP20_3QUE == 20 || EP20_3QUE == 21) {
		cloakoffnpc "フリーデリケ#sl3";
		cloakoffnpc "コポ#sl3";
		cloakoffnpc "ロロヒュ#sl3";
	}
	else {
		cloakonnpc "フリーデリケ#sl3";
		cloakonnpc "コポ#sl3";
		cloakonnpc "ロロヒュ#sl3";
	}
	end;
}
jor_slug_j.gat,49,188,3	script(CLOAKED)	フリーデリケ#sl3	10458,{/* 3807 (cloaking)*/}
jor_slug_j.gat,46,186,5	script(CLOAKED)	コポ#sl3	21995,{/* 3808 (cloaking)*/}
jor_slug_j.gat,50,186,3	script(CLOAKED)	ロロヒュ#sl3	21995,{/* 3809 (cloaking)*/
	if(EP20_3QUE == 20) {
		mes "[コポ]";
		mes "ピッピッピョッ！";
		mes "ピイッピョッ！";
		next;
		mes "[ロロヒュ]";
		mes "化け物が、こちらの道に行ったのを";
		mes "見たって言ってる！";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "教えてくれてありがとう～。";
		cutin "ep19_friederike03.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "[コポ]";
		mes "ピョッ～";
		next;
		mes "[ロロヒュ]";
		mes "早く行こう！";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "……ねえ、そう言えば";
		mes "ピヨピョは、どうやって街から出たの？";
		mes "警備隊が見張っていたはずだよね。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "警備隊が見ていない時に";
		mes "外に出たんじゃないかなぁ？";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "ほ、ほら！";
		mes "綿の塊に騙されて";
		mes "ボクを見逃しちゃったぐらいだから。";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "そうだった！";
		mes "街に帰ったら、警備隊の人に";
		mes "ちゃんと謝るのよ？";
		mes "あんなヒドイ悪戯して！";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "ひいっ！";
		mes "あ、またウミウシがいるよ！";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "こら！";
		mes "誤魔化しても無駄なんだから～！";
		cutin "ep19_friederike04.png", 2;
		next;
		cutin "ep19_friederike04.png", 255;
		chgquest 131300,131301;
		set EP20_3QUE,21;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 159, 304;
		end;
	}
	if(EP20_3QUE == 21) {
		mes "[ロロヒュ]";
		mes "早く行こう！";
		cutin "ep20_cocopo01.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 159, 304;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 20 || EP20_3QUE == 21)
		showevent 1, 1, "ロロヒュ#sl3";
	end;
}
jor_slug_j.gat,159,309,0	script	#ep20_slug_sw4	139,9,9,{/* 3810 */
	if(EP20_3QUE == 21 || EP20_3QUE == 22) {
		cloakoffnpc "フリーデリケ#sl4";
		cloakoffnpc "ロロヒュ#sl4";
		cloakoffnpc "コポ#sl4";
	}
	else {
		cloakonnpc "フリーデリケ#sl4";
		cloakonnpc "ロロヒュ#sl4";
		cloakonnpc "コポ#sl4";
	}
	end;
}
jor_slug_j.gat,157,307,5	script(CLOAKED)	フリーデリケ#sl4	10458,{/* 3811 (cloaking)*/}
jor_slug_j.gat,161,307,3	script(CLOAKED)	ロロヒュ#sl4	21995,{/* 3812 (cloaking)*/}
jor_slug_j.gat,159,309,3	script(CLOAKED)	コポ#sl4	21995,{/* 3813 (cloaking)*/
	if(EP20_3QUE == 21) {
		mes "[コポ]";
		mes "ピョッピョッ？";
		next;
		mes "[ロロヒュ]";
		mes "化け物とピヨピョは、こっちだって！";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ちょっと待って……";
		mes "ロロヒュ……何か隠してるよね？";
		mes "何を隠しているの？";
		mes "正直に言いなさい。";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "な、なにを言ってるの？";
		mes "何も隠してないよ！";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "嘘ついてもダ～メ！";
		mes "隠し事がある時は";
		mes "いつも目が泳いでるんだから～。";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "うっ……";
		mes "それは……。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "…………。";
		next;
		mes "[ロロヒュ]";
		mes "……ママには";
		mes "内緒にしておいてくれる？";
		mes "約束してくれるなら";
		mes "話しても良いよ……。";
		cutin "ep20_cocopo02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "……わかった。";
		mes "約束する。";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "……実はピヨピョは";
		mes "街に住む子じゃなくて";
		mes "古代の氷の峡谷に住む子なんだ。";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "大人たちに知られると";
		mes "ピヨピョと会えなくなっちゃう。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "それで嘘ついてたのね？";
		mes "でも、こんな危険な場所に";
		mes "来ちゃダメだよ。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "あんな恐ろしい化け物が出たのは";
		mes "初めてだったんだ！";
		mes "ここは、いつもピヨピョが";
		mes "ご飯を食べてる場所なんだ。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "ボクはただ……";
		mes "ピヨピョと一緒に";
		mes "新しいフレーバーの";
		mes "ポリンクリスプを食べたかっただけ……";
		mes "ぐすっ。";
		next;
		mes "[フリーデリケ]";
		mes "うんうん、そうだね。";
		mes "早くピヨピョを助けて、帰ろう。";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		chgquest 131301,131302;
		set EP20_3QUE,22;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 71, 336;
		end;
	}
	if(EP20_3QUE == 22) {
		mes "[フリーデリケ]";
		mes "うんうん、そうだね。";
		mes "早くピヨピョを助けて、帰ろう。";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		mes "‐先へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐先へ";
		mes "　向かった‐";
		close2;
		warp "jor_slug_j.gat", 71, 336;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 21 || EP20_3QUE == 22)
		showevent 1, 1, "コポ#sl4";
	end;
}
jor_slug_j.gat,66,336,0	script	#ep20_slug_sw5	139,9,9,{/* 3814 */
	if(EP20_3QUE == 22 || EP20_3QUE == 23) {
		cloakoffnpc "フリーデリケ#sl5";
		cloakoffnpc "ロロヒュ#sl5";
		cloakoffnpc "コポ#sl5";
	}
	end;
}
jor_slug_j.gat,68,337,3	script(CLOAKED)	フリーデリケ#sl5	10458,{/* 3815 (cloaking)*/}
jor_slug_j.gat,67,334,3	script(CLOAKED)	ロロヒュ#sl5	21995,{/* 3816 (cloaking)*/}
jor_slug_j.gat,60,336,5	script(CLOAKED)	堕落した天使ウミウシ#ep	21982,{/* 3817 (cloaking)*/}
jor_slug_j.gat,66,336,5	script(CLOAKED)	コポ#sl5	21995,{/* 3818 (cloaking)*/
	if(EP20_3QUE == 22) {
		mes "[ロロヒュ]";
		mes "ピヨピョ!!!";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[ピヨピョ]";
		mes "ピッ～！";
		cutin "ep20_cocopo01.png", 255;
		next;
		cloakoffnpc "堕落した天使ウミウシ#ep";
		setnpcdisplay "堕落した天使ウミウシ#ep",21982;
		misceffect 668,"堕落した天使ウミウシ#ep",1;
		mes "[フリーデリケ]";
		mes "ロロヒュ!!!";
		mes "危ない！";
		cutin "ep19_friederike02.png", 2;
		if(!sleep2(1000)) end;
		misceffect 58,"フリーデリケ#sl5",1;
		if(!sleep2(1000)) end;
		misceffect 112,"ロロヒュ#sl5",1;
		misceffect 112,"コポ#sl5",1;
		misceffect 112,"フリーデリケ#sl5",1;
		if(!sleep2(200)) end;
		misceffect 336,"フリーデリケ#sl5",1;
		misceffect 336,"ロロヒュ#sl5",1;
		misceffect 336,"コポ#sl5",1;
		next;
		menu "ロロヒュを助ける！",-;
		misceffect 565,"堕落した天使ウミウシ#ep",1;
		if(!sleep2(1000)) end;
		misceffect 567,"堕落した天使ウミウシ#ep",1;
		if(!sleep2(1000)) end;
		misceffect 17,"堕落した天使ウミウシ#ep",1;
		cloakonnpc "堕落した天使ウミウシ#ep";
		next;
		mes "[ロロヒュ]";
		mes "ありがとう！";
		mes strcharinfo(0)+"さま!!";
		mes "フリーデリケさまも！";
		cutin "ep20_cocopo02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "二人も無事でよかった～。";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ピヨピョも怪我してないよね？";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "早く帰らないと～。";
		mes "ここは子供たちには危険過ぎるよ。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		chgquest 131302,131303;
		set EP20_3QUE,23;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		//
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 67, 213;
		end;
	}
	if(EP20_3QUE == 23) {
		mes "[フリーデリケ]";
		mes "早く帰らないと～。";
		mes "ここは子供たちには危険過ぎるよ。";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "‐氷の城へ";
		mes "　向かいますか？‐";
		next;
		if(select("向かう","やめる") == 2) {
			mes "‐その場にとどまった‐";
			close;
		}
		mes "‐氷の城へ";
		mes "　向かった‐";
		close2;
		warp "icecastle.gat", 67, 213;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 22 || EP20_3QUE == 23)
		showevent 1, 1, "コポ#sl5";
	end;
}

icecastle.gat,67,218,5	script(CLOAKED)	ララハ#ep20_DQ_8	10461,{/* 3818 (cloaking)*/
	if(EP20_3QUE == 23) {
		mes "[ララハ]";
		mes "ああ、ロロヒュ！";
		mes "いったいどこへ行ってたの！";
		mes "み～んなお前のことを";
		mes "心配していたのよ！";
		cutin "ep19_iwin04.png", 2;
		cloakoffnpc "フリーデリケ#ep20_2";
		cloakoffnpc "ロロヒュ#ep20_e";
		next;
		mes "[ララハ]";
		mes strcharinfo(0)+"様";
		mes "フリーデリケ様！";
		mes "ロロヒュを探してくださり";
		mes "本当にありがとうございました！";
		next;
		mes "[ロロヒュ]";
		mes "……";
		mes "ごめんなさい。";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[ララハ]";
		mes "まあ！　えらく素直じゃない!!";
		mes "いったい何があったの？";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "疲れてるようなので";
		mes "まずは休ませてあげてください。";
		mes "詳しい話は後で……。";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[ララハ]";
		mes "そうですね。";
		mes "ほら、ロロヒュ、おうちに入りなさい。";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[ロロヒュ]";
		mes "うん……！";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[フリーデリケ]";
		mes "ロロヒュが無事で良かったです～。";
		mes "あ、でも私も疲れてしまいました。";
		mes "私も部屋に帰りますね～。";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[フリーデリケ]";
		mes strcharinfo(0)+"様。";
		mes "お手伝いいただき";
		mes "ありがとうございます。";
		mes "また私の部屋に遊びに来てください。";
		mes "お菓子もいっぱい用意してますから～。";
		cutin "ep19_friederike03.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		cloakonnpc "フリーデリケ#ep20_2";
		chgquest 131303,11947;
		set EP20_3QUE,24;
		end;
	}
	if(EP20_3QUE == 24) {
		cutin "ep19_iwin04.png", 2;
		mes "[ララハ]";
		mes "フリーデリケ様から";
		mes "お話を聞きました。";
		next;
		mes "[ララハ]";
		mes "峡谷に住む古代アイスウィンドとは";
		mes "微妙な関係ではあるのですが";
		mes "幼いコポたち同士は";
		mes "そんなこと気にならないようですね。";
		next;
		mes "[ララハ]";
		mes "今回は幸い、大事にならなかったので";
		mes "大目に見るつもりですが……";
		mes "あのウミウシの巣窟に行くコポは";
		mes "意外に多いようなんです。";
		next;
		mes "[ララハ]";
		mes "子供たちの安全の為にも";
		mes "できるだけ危険なモンスターを";
		mes "排除したいと考えています。";
		mes "よければ手を貸していただけませんか？";
		close2;
		cutin "ep19_iwin04.png", 255;
		setquest 202430;
		delquest 11947;
		set EP20_3QUE,100;
		getitem 1001217,50;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		setquest 11928;
		compquest 11928;
		setquest 11945;
		compquest 11945;
		setquest 131304;
		end;
	}
	if(EP20_3QUE == 100) {
		mes "[ララハ]";
		mes "おはようございます";
		mes strcharinfo(0)+"様。";
		mes "今日も良い天気ですね！";
		cutin "ep19_iwin04.png", 2;
		while(1) {
			next;
			if(select("クエストの受注や報告を行う","ダンジョンに移動する(古代の氷の峡谷 東部)") == 2) {
				mes "^ff0000‐移動には500Zenyが必要です‐^000000";
				next;
				if(!checkquest(11953) || !checkquest(11955)) {
					mes "[ララハ]";
					cutin "ep19_iwin04.png", 2;
					mes "まだ、詳細を確認していない";
					mes "依頼があるみたいですが……";
					mes "現地へ向かわれますか？";
					next;
					if(select("クエストの受注や報告を行う","ダンジョンに移動する(古代の氷の峡谷 東部)") == 1)
						break;
					mes "[ララハ]";
					cutin "ep19_iwin04.png", 2;
					mes "分かりました。";
					mes "それでは、お気をつけて。";
				}
				else {
					mes "[ララハ]";
					cutin "ep19_iwin04.png", 2;
					mes "それでは、現地へ向かってください。";
				}
				close2;
				cutin "kafra_01.bmp", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_back5j.gat", 16, 239;
				end;
			}
			break;
		}
		setarray '@questname$,"仲直りしたらいいな①","仲直りしたらいいな②";
		setarray '@questid,11953,11955;
		setarray '@coolid,11954,11956;
		setarray '@gainlist,1001217,10,1001217,10;
		setarray '@explist,475000000,356250000,475000000,356250000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// 以下個別処理
		switch('@sel) {
		case 0:	// 仲直りしたらいいな①
			if(checkquest(11954)) {
				if(checkquest(11954)&2 == 0) {
					mes "[ララハ]";
					cutin "ep19_iwin04.png", 2;
					mes "今日はもう休んで";
					mes "明日また状況を見ましょう。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000仲直りしたらいいな①^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(11953)) {
				if(checkquest(11953)&4 == 0) {
					mes "[ララハ]";
					cutin "ep19_iwin04.png", 2;
					mes "古代の氷の峡谷の東部にいる";
					mes "^e5555eグレーアイスウィンド^000000を";
					mes "10匹懲らしめてきてください。";
					mes "時にはガツンとやることも";
					mes "必要ですからね。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000仲直りしたらいいな①^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 11953;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000仲直りしたらいいな①^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000仲直りしたらいいな①^000000」";
				mes "<内容>";
				mes "対象：<URL>グレーアイスウィンド<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>　10体";
				mes "の討伐";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 9.5G ( 9500000000 )";
				mes "※475000000を20回受け取ります。";
				mes "JobExp 7.125G ( 7125000000 )";
				mes "※356250000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000仲直りしたらいいな①^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close;
				}
				delquest 11953;
				setquest 11954;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 475000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,356250000,0;
				mes "[ララハ]";
				cutin "ep19_iwin04.png", 2;
				mes "ありがとうございました。";
				mes "どうでしょう……";
				mes "少しでも効果があればいいんだけど。";
				mes "今日はもう休んで";
				mes "明日また状況を見ましょう。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 9.5G";
				mes "( 9500000000 )";
				mes "※475000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 7.125G";
				mes "( 7125000000 )";
				mes "※356250000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[ララハ]";
			cutin "ep19_iwin04.png", 2;
			mes "子供たち同士はともかく";
			mes "同族以外に攻撃的な奴らに";
			mes "問題があるように思います。";
			mes "少し懲らしめれば";
			mes "考え直してくれるかも……。";
			next;
			mes "[ララハ]";
			cutin "ep19_iwin04.png", 2;
			mes "古代の氷の峡谷の東部にいる";
			mes "^e5555eグレーアイスウィンド^000000を";
			mes "10匹懲らしめてきてください。";
			mes "時にはガツンとやることも";
			mes "必要ですからね。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000仲直りしたらいいな①^000000」";
			mes "<内容>";
			mes "対象：<URL>グレーアイスウィンド<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>　10体";
			mes "の討伐を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[ララハ]";
				cutin "ep19_iwin04.png", 2;
				mes "中断するのですか？";
				mes "分かりました。";
				mes "また手が空いた時にお願いします。";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11953;
			if(checkquest(11954)) delquest 11954;
			mes "[ララハ]";
			cutin "ep19_iwin04.png", 2;
			mes "それでは、よろしくお願いします。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000仲直りしたらいいな①^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 1:	// 仲直りしたらいいな②
			if(checkquest(11956)) {
				if(checkquest(11956)&2 == 0) {
					mes "[ララハ]";
					cutin "ep19_iwin04.png", 2;
					mes "今日はもう休んで";
					mes "明日また状況を見ましょう。";
					next;
					mes "[インフォメーション]";
					mes "<<B>クエスト</B>>";
					mes "「^ff0000仲直りしたらいいな②^000000」";
					mes "は時間制限中です。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(11955)) {
				if(checkquest(11955)&4 == 0) {
					mes "[ララハ]";
					cutin "ep19_iwin04.png", 2;
					mes "古代の氷の峡谷の西部にいる";
					mes "^e5555eホワイトアイスウィンド^000000を";
					mes "10匹懲らしめてきてください。";
					mes "時にはガツンとやることも";
					mes "必要ですからね。";
					next;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000仲直りしたらいいな②^000000」";
					mes "は受注済みのクエストです。";
					mes "こちらのクエストを破棄しますか？";
					next;
					if(select("やめる","破棄する") == 1) {
						mes "^ff0000[インフォメーション]^000000";
						mes "^ff0000処理を中断しました。^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 11955;
					mes "<<B>クエスト</B>>";
					mes "「^ff0000仲直りしたらいいな②^000000」";
					mes "を破棄しました。";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>クエスト</B>>";
				mes "「^ff0000仲直りしたらいいな②^000000」";
				mes "<内容>";
				mes "対象：<URL>ホワイトアイスウィンド<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND2</INFO></URL>　10体";
				mes "の討伐";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 9.5G ( 9500000000 )";
				mes "※475000000を20回受け取ります。";
				mes "JobExp 7.125G ( 7125000000 )";
				mes "※356250000を20回受け取ります。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				next;
				mes "<<B>クエスト</B>>";
				mes "「^ff0000仲直りしたらいいな②^000000」";
				mes "を報告しますか？";
				next;
				if(select("報告する","やめる") == 2) {
					mes "^ff0000[インフォメーション]^000000";
					mes "^ff0000処理を中断しました。^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[インフォメーション]";
					mes "これ以上多くの種類の";
					mes "荷物を持つことが出来ません。";
					mes "1個以上の空きを作ってください。";
					close;
				}
				delquest 11955;
				setquest 11956;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 475000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,356250000,0;
				mes "[ララハ]";
				cutin "ep19_iwin04.png", 2;
				mes "ありがとうございました。";
				mes "どうでしょう……";
				mes "少しでも効果があればいいんだけど。";
				mes "今日はもう休んで";
				mes "明日また状況を見ましょう。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "BaseExp 9.5G";
				mes "( 9500000000 )";
				mes "※475000000 BaseExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "JobExp 7.125G";
				mes "( 7125000000 )";
				mes "※356250000 JobExpを";
				mes "　20回受け取りました。";
				next;
				mes "^0000ff<<B>報酬</B>>^000000";
				mes "アイテム：<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>　10個";
				mes "を獲得しました。";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[ララハ]";
			cutin "ep19_iwin04.png", 2;
			mes "子供たち同士はともかく";
			mes "同族以外に攻撃的な奴らに";
			mes "問題があるように思います。";
			mes "少し懲らしめれば";
			mes "考え直してくれるかも……。";
			next;
			mes "[ララハ]";
			cutin "ep19_iwin04.png", 2;
			mes "古代の氷の峡谷の西部にいる";
			mes "^e5555eホワイトアイスウィンド^000000を";
			mes "10匹懲らしめてきてください。";
			mes "時にはガツンとやることも";
			mes "必要ですからね。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000仲直りしたらいいな②^000000」";
			mes "<内容>";
			mes "対象：<URL>ホワイトアイスウィンド<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND2</INFO></URL>　10体";
			mes "の討伐を受注しますか？";
			next;
			if(select("受注する","やめる") == 2) {
				mes "[ララハ]";
				cutin "ep19_iwin04.png", 2;
				mes "中断するのですか？";
				mes "分かりました。";
				mes "また手が空いた時にお願いします。";
				next;
				mes "^ff0000[インフォメーション]^000000";
				mes "^ff0000処理を中断しました。^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11955;
			if(checkquest(11956)) delquest 11956;
			mes "[ララハ]";
			cutin "ep19_iwin04.png", 2;
			mes "それでは、よろしくお願いします。";
			next;
			mes "<<B>クエスト</B>>";
			mes "「^ff0000仲直りしたらいいな②^000000」";
			mes "を受注しました。";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 23 || EP20_3QUE == 24)
		showevent 1, 1, "ララハ#ep20_DQ_8";
	else if(EP20_3QUE == 100) {
		if((!checkquest(11953) && (!checkquest(11954) || checkquest(11954)&0x2) || checkquest(11953) && checkquest(11953)&0x4) || 
			(!checkquest(11955) && (!checkquest(11956) || checkquest(11956)&0x2) || checkquest(11955) && checkquest(11955)&0x4))
			showevent 0, 3, "ララハ#ep20_DQ_8";
		else if(checkquest(11953) && checkquest(11953)&0x4 == 0 || checkquest(11955) && checkquest(11955)&0x4 == 0)
			showevent 0, 2, "ララハ#ep20_DQ_8";
		else
			showevent 9999, 0, "ララハ#ep20_DQ_8";
	}
	end;
}
icecastle.gat,69,217,3	script(CLOAKED)	ロロヒュ#ep20_e	21995,{/* 3819 (cloaking)*/
	if(EP20_3QUE < 100) {
		mes "[ロロヒュ]";
		mes "……。";
		cutin "ep20_cocopo03.png", 2;
		close2;
		cutin "ep20_cocopo03.png", 255;
		end;
	}
	if(checkquest(131304)) {
		mes "[ロロヒュ]";
		mes "ピヨピョたちと遊びたいなぁ……。";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "‐ロロヒュは";
		mes "　これからも「べたつく海」に";
		mes "　行くつもりのようだ。";
		mes "　心配だから、ついて行って";
		mes "　あげようかな……‐";
		close2;
		cutin "ep20_cocopo01.png", 255;
		delquest 131304;
		end;
	}
	mes "‐ロロヒュは「べたつく海」に";
	mes "　向かおうとしているようだ‐";
	next;
	mes "^e6328cメモリアルダンジョン^000000";
	mes "^e6328c「べたつく海」の^000000";
	mes "^e6328c生成と入場が行えます。^000000";
	mes "　";
	mes "^8c32e6ダンジョン生成：^191970生成可能";
	mes "^8c32e6ダンジョン入場：^191970入場可能";
	mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
	messize 180,364;
	next;
	switch(select("^191970立ち去る","^0b0b33メモリアルダンジョンの作成","^0b0b33注意事項の確認")) {
	case 1:
		mes "‐あなたはこの場を去った‐";
		close;
	case 2:
	case 3:
		mes "詳しくはこちらをご確認ください。";
		mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
		messize 180,364;
		close;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 100)
		showevent 0, 3, "ロロヒュ#ep20_e";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの生成と入場]";
	end;
}

jor_twig.gat,114,147,0	script	#hw_ep20re6	139,14,14,{/* 3821 */
	if(EP20_1QUE < 100)
		cloakonnpc "世界樹の枝#jor_twig";
	else
		cloakoffnpc "世界樹の枝#jor_twig";
	end;
}
jor_twig.gat,125,152,4	script(CLOAKED)	オーレリー#ep20_twbs_in	10465,{/* 3822 (cloaking)*/}
jor_twig.gat,121,153,4	script(CLOAKED)	ニャル#ep20_twbs_in	10537,{/* 3823 (cloaking)*/}
jor_twig.gat,114,147,4	script(CLOAKED)	世界樹の枝#jor_twig	10046,{/* 3824 (cloaking)*/
	mes "^e6328c‐このクエストを進行するには";
	mes "　以下の条件を満たす必要があります‐";
	mes "　・BaseLv260以上";
	mes "　・クエスト「死なない者」のクリア";
	mes "　";
	mes "詳細は公式サイトをご覧ください。";
	mes "<URL>EPISODE：ISGARD ～死なない者～<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
	messize 180,364;
	close;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MDの生成と入場]";
	end;
}

icas_in.gat,188,60,3	script	ポルル#ep19	10461,{/* 3824 */
	cutin "ep19_iwin11.png", 2;
	mes "[ポルル]";
	mes "私はヴェルグンデ様が製造した";
	mes "グレイシア武器の研究を行っている。";
	mes "　";
	mes "キミがもし「<ITEM>蛇神の鱗<INFO>1001251</INFO></ITEM>」を持っていたら";
	mes "「グレイシア武器」シリーズを";
	mes "「ディムグレイシア武器」シリーズに";
	mes "強化してあげよう。";
	mes "　";
	mes "さらに、一部の装備は私の力で";
	mes "エンチャントを施すことが可能だ。";
	mes "「ディムグレイシア武器」シリーズなら";
	mes "「<ITEM>小さな氷華の魔石<INFO>1000811</INFO></ITEM>」か";
	mes "「<ITEM>氷華の魔石<INFO>1000812</INFO></ITEM>」を";
	mes "「グレイシア防具」シリーズなら";
	mes "「<ITEM>神聖な猫のひげ<INFO>1001217</INFO></ITEM>」を持ってきたら";
	mes "魔力を調節して性能を引き上げてみせよう。";
	mes "　";
	mes "<URL>「グレイシア武器」シリーズ獲得・強化<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/glacier.html</INFO></URL>";
	mes "<URL>「グレイシア防具」シリーズ獲得・強化<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/glacier-armor.html</INFO></URL>";
	mes "<URL>「ディムグレイシア武器」シリーズ獲得・強化<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/d-glacier.html</INFO></URL>";
	messize 430,364;
	next;
	switch(select("グレイシア防具シリーズ","ディムグレイシア武器作成","エンチャント","話をやめる")) {
	case 4:
		mes "[ポルル]";
		mes "当分の間、ここで";
		mes "ヴェルグンデ様の仕事を";
		mes "手伝うつもりだ。";
		mes "いつでも気楽に訪ねてくれ。";
		messize 180,280;
		close2;
		cutin "ep19_iwin11.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1016;
	setnpctitle "[エンチャント]";
	end;
}

// Warp
jor_sanct.gat,28,291,0	warp	enter_maze	1,1,jor_maze.gat,206,16
jor_maze.gat,206,12,0	warp	out_maze	1,1,jor_sanct.gat,28,286

jor_maze.gat,198,58,0	script	maze_a1_to_b1	45,1,1,{/* 3829 */
	warp "jor_maze.gat",268,116;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,268,113,0	script	maze_b1_to_a1	45,1,1,{/* 3830 */
	warp "jor_maze.gat",198,54;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,264,187,0	script	maze_b2_to_c2	45,1,1,{/* 3831 */
	warp "jor_maze.gat",85,256;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,89,256,0	script	maze_c2_to_b2	45,1,1,{/* 3832 */
	warp "jor_maze.gat",268,187;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,46,275,0	script	maze_c3_to_d3	45,1,1,{/* 3833 */
	warp "jor_maze.gat",16,16;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,16,12,0	script	maze_d3_to_c3	45,1,1,{/* 3834 */
	warp "jor_maze.gat",46,271;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,88,28,0	script	maze_d4_to_e4	45,1,1,{/* 3835 */
	warp "jor_maze.gat",151,281;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,151,285,0	script	maze_e4_to_d4	45,1,1,{/* 3836 */
	warp "jor_maze.gat",88,32;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,182,206,0	script	maze_e5_to_f5	45,1,1,{/* 3837 */
	warp "jor_maze.gat",192,153;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,192,157,0	script	maze_f5_to_e5	45,1,1,{/* 3838 */
	warp "jor_maze.gat",182,210;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,164,138,0	script	maze_f6_to_g6	45,1,1,{/* 3839 */
	warp "jor_maze.gat",49,162;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,53,162,0	script	maze_g6_to_f6	45,1,1,{/* 3840 */
	warp "jor_maze.gat",168,138;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,50,125,0	script	maze_g7_to_f7	45,1,1,{/* 3841 */
	warp "jor_maze.gat",192,106;
	end;
}
jor_maze.gat,192,102,0	script	maze_f7_to_g7	45,1,1,{/* 3842 */
	warp "jor_maze.gat",50,121;
	end;
}
jor_maze.gat,34,189,0	script	maze_g8_to_h8	45,1,1,{/* 3843 */
	warp "jor_maze.gat",104,156;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,104,152,0	script	maze_h8_to_g8	45,1,1,{/* 3844 */
	warp "jor_maze.gat",34,185;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,104,207,0	script	maze_h9_to_i9	45,1,1,{/* 3845 */
	warp "jor_maze.gat",148,28;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,148,24,0	script	maze_i9_to_h9	45,1,1,{/* 3846 */
	warp "jor_maze.gat",104,203;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,140,79,0	script	maze_to_twice	45,1,1,{/* 3847 */
	if(EP20_1QUE < 47) {
		unittalk getcharid(3),strcharinfo(0)+" : 何か違和感があったような気がする……。",1;
		end;
	}
	warp "jor_twice.gat",42,55;
	end;
}
jor_twice.gat,40,52,0	warp	twice_to_maze	1,1,jor_maze.gat,140,75
jor_maze.gat,136,176,0	script	maze_h10_to_j10	45,1,1,{/* 3849 */
	warp "jor_maze.gat",260,46;
	end;
}
jor_maze.gat,260,50,0	script	maze_j10_to_h10	45,1,1,{/* 3850 */
	warp "jor_maze.gat",136,180;
	end;
}
jor_maze.gat,14,283,0	script	maze_c11_to_k11	45,1,1,{/* 3851 */
	warp "jor_maze.gat",282,246;
	end;
}
jor_maze.gat,282,242,0	script	maze_k11_to_c11	45,1,1,{/* 3852 */
	warp "jor_maze.gat",14,279;
	end;
}
jor_maze.gat,217,289,0	script	maze_k12_to_b12	45,1,1,{/* 3853 */
	warp "jor_maze.gat",243,156;
	end;
}
jor_maze.gat,243,152,0	script	maze_b12_to_k12	45,1,1,{/* 3854 */
	warp "jor_maze.gat",217,285;
	end;
}
//jor_maze.gat,260,50,0	script	maze_j10_to_h10	45,{/* 3855 */}

jor_back3.gat,159,365,0	warp	back3_to_back4	1,1,jor_back4.gat,273,19
jor_back4.gat,277,16,0	warp	back4_to_back3	1,1,jor_back3.gat,159,360
jor_back4.gat,6,374,0	warp	back4_to_back5	1,1,jor_back5.gat,340,20
jor_back5.gat,339,14,0	warp	back5_to_back4	1,1,jor_back4.gat,10,370
jor_back6.gat,30,147,0	warp	back6_to_root3	1,1,jor_root3.gat,367,129
jor_back6j.gat,30,147,0	warp	back6j_to_root3	1,1,jor_root3.gat,367,129
jor_root3.gat,372,129,0	script	root3_to_back6	45,1,1,{/* 6105 */
	mes "‐どちらへ向かおうか？‐";
	next;
	switch(select("古代の氷の峡谷 西部","古代の氷の峡谷 西部(クエスト)")) {
	case 1:
		mes "‐古代の氷の峡谷 西部へ向かった‐";
		close2;
		warp "jor_back6j.gat",34,147;
		end;
	case 2:
		mes "‐古代の氷の峡谷 西部(クエスト)へ向かった‐";
		close2;
		warp "jor_back6.gat",34,147;
		end;
	}
}
jor_root1.gat,32,11,0	warp	roo1_to_nest	1,1,jor_nest.gat,38,270
jor_root1.gat,59,295,0	warp	root1_to_root2	1,1,jor_root2.gat,25,17
jor_root2.gat,25,10,0	warp	root2_to_root1	1,1,jor_root1.gat,59,290
jor_root2.gat,25,291,0	script	root2_to_sanct	45,1,1,{/* 3865 */
OnTouch:
	warp "jor_sanct.gat",150,47;
	end;
OnQuestInfo:
	if(EP20_1QUE == 21)
		showevent 0, 1, "root2_to_sanct";
	end;
}
jor_sanct.gat,150,43,0	warp	sanct_to_root2	1,1,jor_root2.gat,25,285
icecastle.gat,230,160,0	warp	enter_in2	1,1,icas_in2.gat,109,32
icas_in2.gat,109,29,0	warp	in2_out	1,1,icecastle.gat,227,158
icas_in2.gat,125,60,0	warp	ente_in2_right	1,1,icas_in2.gat,163,60
icas_in2.gat,159,60,0	warp	out_in2_right	1,1,icas_in2.gat,121,60
icas_in2.gat,92,60,0	warp	ente_in2_left	1,1,icas_in2.gat,56,60
icas_in2.gat,59,60,0	warp	out_in2_left	1,1,icas_in2.gat,96,60
icecastle.gat,157,206,0	script	enter_icasin2_room5	45,1,1,{/* 3873 */
	if(EP20_1QUE < 80) {
		mes "扉は施錠されている";
		close;
	}
	warp "icas_in2.gat",248,112;
	end;
OnQuestInfo:
	if(EP20_1QUE == 80)
		showevent 0, 1, "enter_icasin2_room5";
	end;
}
icas_in2.gat,250,109,0	warp	out_icasin2_room5	1,1,icecastle.gat,160,203
jor_twig.gat,212,109,0	warp	out_twig	1,1,jor_twice.gat,47,327
jor_twice.gat,43,331,5	script	白い猫#nyar_warp	22006,{/* 3877 */
	if(EP20_1QUE < 57) {
		unittalk "ミャ～",1;
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : 白い猫はどこかにいってしまった……",1;
		cloakonnpc;
		end;
	}
	cutin "ep20_nyar01.png", 2;
	mes "[ニャル]";
	mes "ウェオン？";
	next;
	if(select("小さな枝の在り処に入らせてください","ミャオン") == 2) {
		cutin "ep20_nyar01.png", 255;
		mes "[ニャル]";
		mes "ゴロゴロ…";
		close2;
		unittalk "ゴロゴロ…",1;
		end;
	}
	cutin "ep20_nyar01.png", 255;
	mes "[ニャル]";
	mes "ミャ～";
	close2;
	warp "jor_twig.gat", 212, 114;
	end;
OnQuestInfo:
	if(EP20_1QUE >= 57)
		showevent 6, 3, "白い猫#nyar_warp";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[転送]";
	end;
}
