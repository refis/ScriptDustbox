//= Auriga Script ==============================================================
// Ragnarok Online Illusion of TeddyBear Quest Script	by refis
//= Registry ===================================================================
// IL_TBEAR_QUE -> 0～9
//==============================================================================

//------------------------------------------------------------
// ein_d02_i.gat
ein_d02_i.gat,0,0,0,0	monster	赤色のベアドール		20255,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	黄色のベアドール		20256,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	緑色のベアドール		20257,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	白色のベアドール		20258,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	青色のベアドール		20259,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	労働型ピットマン		20261,10,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	邪念のオブシディアン	20263,6,5000,0,0

//@move(type: BL_MOB, ID, 8436, speed: 150, option: 0x0, class: 20255," pos: (""unknown.gat""",179,128), dir: 2," name""赤色のベアドール"")"
//@spawn(type: BL_MOB, ID, 8450, speed: 150, option: 0x0, class: 20256," pos: (""unknown.gat""",221,293), dir: 6," name""黄色のベアドール"")"
//@spawn(type: BL_MOB, ID, 8464, speed: 150, option: 0x0, class: 20257," pos: (""unknown.gat""",240,187), dir: 4," name""緑色のベアドール"")"
//@move(type: BL_MOB, ID, 8478, speed: 150, option: 0x0, class: 20258," pos: (""unknown.gat""",258,192), dir: 3," name""白色のベアドール"")"
//@spawn(type: BL_MOB, ID, 8492, speed: 300, option: 0x0, class: 20259," pos: (""unknown.gat""",234,21), dir: 5," name""青色のベアドール"")"
//@spawn(type: BL_MOB, ID, 8506, speed: 180, option: 0x0, class: 20261," pos: (""unknown.gat""",193,236), dir: 6," name""労働型ピットマン"")"
//@move(type: BL_MOB, ID, 8516, speed: 350, option: 0x0, class: 20263," pos: (""unknown.gat""",172,260), dir: 2," name""邪念のオブシディアン"")"
//20255~20258ランダム

einbroch.gat,149,242,5	script	咳き込む青年#ITB_001	798,5,5,{/* 7620 */
	switch(IL_TBEAR_QUE) {
	case 0:
		mes "[咳き込む青年]";
		mes "なんで戻って来ないのだろ……";
		mes "けほっけほっ！";
		next;
		mes "[咳き込む青年]";
		mes "けほっ……けほっ……けほっ……";
		mes "はぁはぁ……もしかして、";
		mes "何か起こったのか……？";
		next;
		mes "[咳き込む青年]";
		mes "直接行って確認しなくちゃ……";
		mes "けほっけほっ";
		mes "け……ほ……っ！";
		next;
		if(select("青年に声をかける","立ち去る") == 2) {
			mes "[咳き込む青年]";
			mes "……けほっ……";
			mes "けほけほ……けほっ。";
			close;
		}
		mes "[咳き込む青年]";
		mes "けほっ……";
		mes "仕事で鉱山に行った友人が、";
		mes "まだ帰って来なくて……";
		mes "けほっけほっ。";
		next;
		mes "[咳き込む青年]";
		mes "数日前、仕事が終わってすぐ……";
		mes "納品し……けほっ……";
		mes "帰って来ると言って、出かけたのに……";
		mes "未だに帰って……けほっ……ません。";
		next;
		mes "[咳き込む青年]";
		mes "けほ……けほっけほっ……けほ";
		mes "警備隊にも相談してみましたが……けほ……";
		mes "稼いだ金でどこかで酒飲んで";
		mes "つぶれてるんじゃないかと、";
		mes "けほっけほっ……";
		mes "真面目に聞いてくれませんし……。";
		next;
		mes "[咳き込む青年]";
		mes "^0000ffスティーブン^000000は、";
		mes "そんな奴じゃありません……けほけほ";
		mes "未だに連絡もないのは、";
		mes "きっと何かに巻き込まれたんですよ。";
		next;
		setquest 11556;	// state=1
		set IL_TBEAR_QUE,1;
		mes "[咳き込む青年]";
		mes "確か^0000ffアインベフの鉱山^000000へ";
		mes "行くと言いました。";
		mes "その周辺を探せば、";
		mes "なにかの……手がかりを掴めると思います。";
		next;
		mes "‐鉱山ダンジョン 01に";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		//
		warp "ein_dun01.gat", 195, 76;
		end;
	case 1:
		mes "[咳き込む青年]";
		mes "数日前、仕事が終わってすぐ……";
		mes "納品し……けほっ……";
		mes "帰って来ると言って、出かけたのに……";
		mes "未だに帰って……けほっ……ません。";
		next;
		mes "[咳き込む青年]";
		mes "けほ……けほっけほっ……けほ";
		mes "警備隊にも相談してみましたが……けほ……";
		mes "稼いだ金でどこかで酒飲んで";
		mes "つぶれてるんじゃないかと、";
		mes "けほっけほっ……";
		mes "真面目に聞いてくれませんし……。";
		next;
		mes "[咳き込む青年]";
		mes "^0000ffスティーブン^000000は、";
		mes "そんな奴じゃありません……けほけほ";
		mes "未だに連絡もないのは、";
		mes "きっと何かに巻き込まれたんですよ。";
		next;
		mes "[咳き込む青年]";
		mes "確か^0000ffアインベフの鉱山^000000へ";
		mes "行くと言いました。";
		mes "その周辺を探せば、";
		mes "なにかの……手がかりを掴めると思います。";
		next;
		mes "‐鉱山ダンジョン 01に";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 2:
	case 3:
	case 4:
		mes "[咳き込む青年]";
		mes "けほっけほっ……";
		mes "スティーブンは……けほっ";
		mes "見つかりましたか？";
		next;
		mes "‐鉱山ダンジョン 01に";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 5:
		mes "[サン]";
		mes "けほっけほっ……";
		mes "スティーブンは……けほっ";
		mes "見つかりましたか？";
		next;
		menu "受け取ったお金を渡す",-;
		mes "[サン]";
		mes "……";
		mes "けほけほ……";
		mes "何かがあったんですね？";
		next;
		mes "[サン]";
		mes "何事もないのに、";
		mes "お金だけ送るはずがありません。";
		mes "けほけほけほっ！";
		next;
		mes "[サン]";
		mes "私が……けほ……直接行かなきゃ……";
		mes "けほけほっ……なりません。";
		mes "大事な友達が……けほっ……";
		mes "危機に陥ったかも知れないのに、";
		mes "じっとしていられません！";
		mes "……けほけほっけほっ！";
		next;
		setquest 11561;	// state=1
		delquest 11560;
		set IL_TBEAR_QUE,6;
		mes "[サン]";
		mes "けほけほ……冒険者さま……けほっ……";
		mes "私を連れて行ってください！";
		mes "お願いします！";
		next;
		mes "‐鉱山ダンジョン 01に";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		//
		warp "ein_dun01.gat", 195, 76;
		end;
	case 6:
	case 7:
	case 8:
		mes "[サン]";
		mes "何事もないのに、";
		mes "お金だけ送るはずがありません。";
		mes "けほけほけほっ。";
		next;
		mes "[サン]";
		mes "私が……けほ……直接行かなきゃ……";
		mes "けほけほっ……なりません。";
		mes "大事な友達が……けほっ……";
		mes "危機に陥ったかも知れないのに、";
		mes "じっとしていられません！";
		mes "……けほけほっけほっ！";
		next;
		mes "[サン]";
		mes "けほけほ……冒険者さま……けほっ……";
		mes "私を連れて行ってください！";
		mes "お願いします！";
		next;
		mes "‐鉱山ダンジョン 01に";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 9:
		mes "[サン]";
		mes "あれ以来、鉱山に行く機会が";
		mes "増えたのですが、";
		mes "咳も減って、体も元気になりました。";
		mes "鉱山よりも悪い空気なんて。";
		next;
		mes "[サン]";
		mes "……けほっ。おや？";
		mes "また咳が酷くならないうちに";
		mes "鉱山に行った方が良さそうです。";
		mes "スティーブンも心配ですしね。";
		mes "無料でお送り出来るので";
		mes "冒険者さまも一緒に行きますか？";
		next;
		if(select("行く","行かない") == 2) {
			mes "[サン]";
			mes "必要な時は言ってください。";
			close;
		}
		mes "[サン]";
		mes "それでは現地解散で。";
		mes "……けほっ。";
		close2;
		warp "ein_dun01.gat", 189, 80;
		end;
	}
OnTouch:
	unittalk "咳き込む青年 : けほっけほっ！！",1;	// 7620
	end;
}

ein_dun01.gat,198,79,3	script	ベアドール#ITB_002	10290,{/* 11158 */
	switch(IL_TBEAR_QUE) {
	case 0:
		//
	case 1:
		mes "[ベアドール]";
		mes "さっさとさっさと！";
		mes "並んで並んで！";
		mes "テキパキ動いて！";
		next;
		menu "なぜ並んでいるの？",-;
		mes "[ベアドール]";
		mes "なに！";
		mes "そんな重大な秘密を";
		mes "一見さんのキミに";
		mes "教えるとでも思った？";
		next;
		mes "[ベアドール]";
		mes "そんなに知りたいなら、";
		mes "僕の後ろに並んで";
		mes "順番になるまで待ちな！";
		next;
		mes "[ベアドール]";
		mes "情報というのは、";
		mes "タダで手に入るものではないのだよ。";
		mes "全部時間と労力が……。";
		next;
		emotion 23,"";	// self
		emotion 23,"ベアドール#ITB_002";	// 11158
		misceffect 183,"大きな穴#ITB_011";	// 11167
		mes "[？？？？]";
		mes "うおおおおおお！";
		mes "はなせーー！";
		mes "このモコモコクマ野郎め！";
		next;
		setquest 11557;	// state=1
		delquest 11556;
		set IL_TBEAR_QUE,2;
		mes "‐列の一番前の方から";
		mes "　男の叫び声が聞こえる";
		mes "　前の状況を確認してみよう‐";
		close;
	case 2:
		unittalk getcharid(3),strcharinfo(0)+" : ‐列の一番前の方から男の叫び声が聞こえる。前の状況を確認してみよう‐",1;
		end;
	default:
		switch(rand(3)) {
		case 0: unittalk "ベアドール : さっさとさっさと！",1;	break;
		case 1: unittalk "ベアドール : 並んで並んで！",1;	break;
		case 2: unittalk "ベアドール : テキパキ動いて！",1;	break;
		}
		end;
	}
}
ein_dun01.gat,189,85,7	script	ベアドール#ITB_003	10290,{/* 11159 */
	switch(IL_TBEAR_QUE) {
	case 2:
		mes "[ベアドール]";
		mes "な……なにが起こったって？";
		mes "先に前に並んでいた男が";
		mes "入った途端、叫び声が聞こえたんだ。";
		next;
		menu "どんな男だった？",-;
		mes "[ベアドール]";
		mes "なに？";
		mes "そんなのキミ、";
		mes "覚えてるわけ無いだろう！";
		next;
		mes "[ベアドール]";
		mes "……。";
		next;
		mes "[ベアドール]";
		mes "ふ……ふむ……。";
		mes "どうしても知りたければ、";
		mes "キミが中に入って確認すれば";
		mes "いいんじゃないか？";
		mes "特別に前に入るのを許可しよう。";
		next;
		setquest 11558;	// state=1
		delquest 11557;
		set IL_TBEAR_QUE,3;
		mes "[ベアドール]";
		mes "け……決して怖くなった訳じゃないぞ！";
		mes "僕はただ、無理に急いでまで";
		mes "確認する必要がないと";
		mes "思っているだけだ。";
		close;
	case 3:
		mes "[ベアドール]";
		mes "どうしても知りたければ、";
		mes "キミが中に入って確認すれば";
		mes "いいんじゃないか？";
		mes "特別に前に入るのを許可しよう。";
		next;
		mes "[ベアドール]";
		mes "け……決して怖くなった訳じゃないぞ！";
		mes "僕はただ、無理に急いでまで";
		mes "確認する必要がないと";
		mes "思っているだけだ。";
		close;
	default:
		unittalk "ベアドール : ふふ、もう少しで僕の番だ。",1;	// 11159
		end;
	}
}
ein_dun01.gat,189,83,7	script	ベアドール#ITB_004	10290,{/* 11160 */
	unittalk "ベアドール : おい、そこ！割り込むな！",1;	// 11160
	end;
}
ein_dun01.gat,189,81,1	script	ベアドール#ITB_005	10290,{/* 11161 */
	unittalk "ベアドール : 並んでるから今忙しいの！",1;	// 11161
	end;
}
ein_dun01.gat,190,80,7	script	ベアドール#ITB_006	10290,{/* 11162 */
	unittalk "ベアドール : 並べ並べー！",1;	// 11162
	end;
}
ein_dun01.gat,191,80,1	script	ベアドール#ITB_007	10290,{/* 11163 */
	unittalk "ベアドール : この場所取っててくれませんか。",1;	// 11163
	end;
}
ein_dun01.gat,193,80,7	script	ベアドール#ITB_008	10290,{/* 11164 */
	unittalk "ベアドール : 何日経ったら入れるんだ……。",1;	// 11164
	end;
}
ein_dun01.gat,195,80,5	script	並んでいる男#ITB_009	854,{/* 11165 */
	if(IL_TBEAR_QUE == 9) {
		unittalk "並んでいる男 : 前に何があるのか知りたくて並んでいるんだ。",1;	// 11165
		end;
	}
	mes "[並んでいる男]";
	mes "みんなここに並んでるから";
	mes "私も並んでみたんだ。";
	mes "前に何があるかって？";
	mes "さぁ？　私も知りたくて並んでるからね……。";
	close;
}
ein_dun01.gat,196,80,1	script	ベアドール#ITB_010	10290,{/* 11166 */
	unittalk "ベアドール : 前、進んだから詰めてよー。",1;	// 11166
	end;
}
ein_dun01.gat,189,87,3	script	大きな穴#ITB_011	10043,{/* 11167 */
	if(IL_TBEAR_QUE < 3) {
		mes "‐奥へと続く穴がある";
		mes "　真っ暗で中は";
		mes "　ここからでは見えない‐";
		close;
	}
	mes "‐鉱山の奥へと続くであろう";
	mes "　大きな穴がある";
	mes "　真っ暗で中は";
	mes "　ここからでは見えない‐";
	next;
	if(IL_TBEAR_QUE == 3) {
		mes "‐スティーブンは";
		mes "　この先にいるかもしれない";
		mes "　奥へと進んでみよう‐";
		next;
	}
	if(select("飛び込む","立ち去る") == 2) {
		mes "‐その場から立ち去った‐";
		close;
	}
	if(IL_TBEAR_QUE < 9)
		warp "ein_d02_i_q.gat", 168, 197;
	else
		warp "ein_d02_i.gat", 168, 197;
	end;
}

ein_d02_i_q.gat,161,189,3	script	上層へと続く道#ITB_012	10043,{/* 9876 */
	mes "‐「鉱山ダンジョン 01」に";
	mes "　戻りますか？‐";
	next;
	if(select("戻る","立ち去る") == 2) {
		mes "‐その場から立ち去った‐";
		close;
	}
	warp "ein_dun01.gat", 189, 80;
	end;
}
ein_d02_i_q.gat,170,193,5	script	スティーブン#ITB_013	98,7,7,{/* 9877 */
	switch(IL_TBEAR_QUE) {
	case 3:
		unittalk "スティーブン：こら、は・な・せーー！このモコモコクマ野郎！",1;	// 9877
		cloakoffnpc "白色のベアドール#ITB_014";	// 9878
		cloakoffnpc "ベアドール#ITB_015";	// 9879
		mes "[スティーブン]";
		mes "こら、は・な・せーー！";
		mes "このモコモコクマ野郎！";
		next;
		setquest 11559;	// state=1
		delquest 11558;
		set IL_TBEAR_QUE,4;
		unittalk getnpcid(0,"白色のベアドール#ITB_014"),"白色のベアドール : あっ！バレた！　バレた！",1;	// 9878
		unittalk getnpcid(0,"ベアドール#ITB_015"),"ベアドール : 逃げよ！",1;	// 9879
		mes "[白色のベアドール]";
		mes "あっ！";
		mes "バレた！　バレた！";
		mes "　";
		mes "[ベアドール]";
		mes "逃げよ！";
		close2;
		cloakonnpc "白色のベアドール#ITB_014";	// 9878
		cloakonnpc "ベアドール#ITB_015";	// 9879
		end;
	case 4:
		mes "[スティーブン]";
		mes "なんだったんだ";
		mes "あれは……。";
		next;
		mes "[スティーブン]";
		mes "おーい！";
		mes "そこのあんた！";
		mes "あんたも見たよな？";
		mes "さっきモコモコしたやつが……";
		next;
		menu "スティーブンさんですか？",-;
		mes "[スティーブン]";
		mes "うん？";
		mes "アインブロックで咳き込む奴が、";
		mes "俺を探してくれと言ったって？";
		next;
		mes "[スティーブン]";
		mes "サンの奴か……";
		mes "仕事から帰る途中に";
		mes "もの凄い行列を見つけてな。";
		mes "軽く見てから帰るつもりだったんだが、";
		mes "気になって並んでしまったんだ。";
		next;
		mes "[スティーブン]";
		mes "並び始めると離れるに離れられないだろ？";
		mes "だから、何日も並んでようやく";
		mes "俺の番が来て、";
		mes "大きな穴に入ると……気付けば";
		mes "さっきのモコモコに";
		mes "連れて行かれそうになっていたんだ。";
		next;
		mes "[スティーブン]";
		mes "早く帰って、あいつを";
		mes "病院に行かせなきゃならないけど……";
		mes "今ここを離れるわけには……。";
		next;
		mes "[スティーブン]";
		mes "うーん……";
		mes "どうしたものか……。";
		next;
		mes "[スティーブン]";
		mes "……。";
		next;
		mes "[スティーブン]";
		mes "あんた、";
		mes "ひとつ頼まれてくれないか？";
		mes "あいつ今日は病院の日だが、";
		mes "お金が足りないはずなんだ。";
		next;
		mes "[スティーブン]";
		mes "俺はここでもう少し";
		mes "調べたいことがあるから、";
		mes "サンにこのお金を渡してくれ。";
		mes "ついでに俺は大丈夫だと";
		mes "伝えておくれ。";
		next;
		setquest 11560;	// state=1
		delquest 11559;
		set IL_TBEAR_QUE,5;
		mes "[スティーブン]";
		mes "頼んだぞ。";
		mes "今は持ち合わせはないが、";
		mes "後で何かお返しはするから。";
		next;
		mes "‐咳き込む青年の名前は";
		mes "　サンというらしい‐";
		next;
		mes "‐サンのところへ戻りますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		//
		warp "einbroch.gat", 155, 242;
		end;
	case 5:
		mes "[スティーブン]";
		mes "あんた、";
		mes "ひとつ頼まれてくれないか？";
		mes "あいつ今日は病院の日だが、";
		mes "お金が足りないはずなんだ。";
		next;
		mes "[スティーブン]";
		mes "俺はここの仕事を";
		mes "片付けなきゃならないから。";
		mes "サンにこのお金を渡してくれ。";
		mes "ついでに俺は大丈夫だと";
		mes "伝えておくれ。";
		next;
		mes "[スティーブン]";
		mes "頼んだぞ。";
		mes "今は持ち合わせはないが、";
		mes "後で何かお返しはするから。";
		next;
		mes "‐サンのところへ戻りますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		warp "einbroch.gat", 155, 242;
		end;
	case 6:
		cloakonnpc "サン#ITB_016";	// 9880
		mes "[スティーブン]";
		mes "サンにお金を";
		mes "渡してくれたか？";
		mes "あいつ素直に病院に行ったのか？";
		next;
		cloakoffnpc "サン#ITB_016";	// 9880
		unittalk getnpcid(0,"サン#ITB_016"),"サン : スティーブン！",1;	// 9880
		mes "[サン]";
		mes "スティーブン！";
		mes "人を心配させておいて何を……！";
		next;
		mes "[スティーブン]";
		mes "……サン？";
		mes "お前なんで来たんだ！";
		mes "病院へは行かなかったのか？";
		next;
		mes "[サン]";
		mes "今、私が病院へ行くべき時か？！";
		mes "冗談じゃない！";
		next;
		mes "[スティーブン]";
		mes "くっ……";
		mes "わかった……わかったよ！";
		mes "落ち着いてくれ。";
		next;
		setquest 11562;	// state=1
		delquest 11561;
		set IL_TBEAR_QUE,7;
		mes "[スティーブン]";
		mes "…………？";
		mes "何か北の方から";
		mes "話し声が聞こえるようだが。";
		mes "見に行ってみるか？";
		viewpoint 1, 135, 241, 1, 0xFF0000;	// 0x144
		next;
		mes "‐話し声のする場所に";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		//
		warp "ein_d02_i_q.gat", 135, 238;
		end;
	case 7:
		mes "[スティーブン]";
		mes "…………？";
		mes "何か北の方から";
		mes "話し声が聞こえるようだが。";
		mes "見に行ってみるか？";
		viewpoint 1, 135, 241, 1, 0xFF0000;	// 0x144
		next;
		mes "‐話し声のする場所に";
		mes "　向かいますか？‐";
		next;
		if(select("はい","いいえ") == 2) {
			mes "‐あなたは思いとどまった‐";
			close;
		}
		warp "ein_d02_i_q.gat", 135, 238;
		end;
	case 8:
		mes "[スティーブン]";
		mes "ふぅ……";
		mes "奴らは撒けたか？";
		next;
		cloakoffnpc "サン#ITB_016";	// 9880
		mes "[サン]";
		mes "あのクマのぬいぐるみ";
		mes "侵略とか……自分たちのことを";
		mes "ネジリアンだとか言ってたよな？";
		next;
		mes "[スティーブン]";
		mes "一体何がどうなってやがる……";
		mes "わけがわからん……。";
		next;
		menu "あのクマのぬいぐるみは一体？",-;
		mes "[サン]";
		mes "あれは、スティーブンが";
		mes "「家でやれる美味しい副業を見つけた！」";
		mes "と、引き受けてきた内職の成果物です。";
		next;
		mes "[サン]";
		mes "作業の割に報酬が良すぎるし、";
		mes "納品する場所も鉱山だったので、";
		mes "怪しいから私は断るように言ったんですが……。";
		next;
		mes "[サン]";
		mes "このバカは喜んで";
		mes "引き受けて来たんですよ。";
		next;
		unittalk "スティーブン : バカとは何だ！",1;	// 9877
		mes "[スティーブン]";
		mes "バカとは何だ！";
		mes "おかげで病院代も稼いで、お前の咳も……";
		mes "あれ……そういえばお前咳してないぞ？";
		next;
		unittalk getnpcid(0,"サン#ITB_016"),"サン : え……？",1;	// 9880
		mes "[サン]";
		mes "え……？";
		mes "言われてみると、";
		mes "呼吸も楽になったような……。";
		mes "病院にいくら通っても、";
		mes "全然良くならないと思ったら……";
		mes "まさか、単に空気が悪かっただけ……？";
		next;
		unittalk "スティーブン : 鉱山よりも悪い空気なんて……。",1;	// 9877
		mes "[スティーブン]";
		mes "鉱山よりも悪い空気なんて……。";
		next;
		mes "[サン]";
		mes "いや、今はそれどころじゃない……";
		mes "私達の作ったぬいぐるみが、";
		mes "生きて動いてるんだよ！";
		mes "しかも、君は危険な目に遭ったんだろ！？";
		next;
		mes "[スティーブン]";
		mes "確かに捕まりそうになったぜ。";
		mes "だが、俺達が納品したぬいぐるみが";
		mes "何かとんでもないことを";
		mes "企ててるようだった。";
		next;
		mes "[スティーブン]";
		mes "面倒くさいが、";
		mes "割の良すぎる仕事を受けた";
		mes "落とし前はつけないとな。";
		mes "俺はもう少しここに残って";
		mes "調査してみることにするぜ。";
		mes "サン！お前は一旦町へ戻ってくれ。";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff【インフォメーション】";
			mes "これ以上多くの種類の";
			mes "荷物を持つことが出来ません。";
			mes "1個以上の空きを作ってください。^000000";
			close;
		}
		setquest 202100;	// state=1
		delquest 11563;
		set IL_TBEAR_QUE,9;
		getitem 25271,10;
		getexp 300000000,0,1;
		getexp 0,0,0;
		mes "[スティーブン]";
		mes "あんたも手伝ってくれてありがとう。";
		mes "お礼と言っては何だが、";
		mes "前見つけた珍しい鉱石をあげるよ。";
		mes "あまり見かけない鉱石だから";
		mes "きっと価値のあるものだと思うんだ。";
		mes "それじゃあ外まで送るぜ。";
		close2;
		warp "ein_dun01.gat", 189, 80;
		end;
	}
OnTouch:
	switch(IL_TBEAR_QUE) {
	case 3:
		unittalk "スティーブン：こら、は・な・せーー！このモコモコクマ野郎！",1;	// 9877
		cloakoffnpc "白色のベアドール#ITB_014";	// 9878
		cloakoffnpc "ベアドール#ITB_015";	// 9879
		mes "[スティーブン]";
		mes "こら、は・な・せーー！";
		mes "このモコモコクマ野郎！";
		next;
		setquest 11559;	// state=1
		delquest 11558;
		set IL_TBEAR_QUE,4;
		unittalk getnpcid(0,"白色のベアドール#ITB_014"),"白色のベアドール : あっ！バレた！　バレた！",1;	// 9878
		unittalk getnpcid(0,"ベアドール#ITB_015"),"ベアドール : 逃げよ！",1;	// 9879
		mes "[白色のベアドール]";
		mes "あっ！";
		mes "バレた！　バレた！";
		mes "　";
		mes "[ベアドール]";
		mes "逃げよ！";
		close2;
		cloakonnpc "白色のベアドール#ITB_014";	// 9878
		cloakonnpc "ベアドール#ITB_015";	// 9879
		end;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
		cloakonnpc "白色のベアドール#ITB_014";	// 9878
		cloakonnpc "ベアドール#ITB_015";	// 9879
		end;
	}
}
ein_d02_i_q.gat,169,193,5	script	白色のベアドール#ITB_014	10292,{/* 9878 (cloaking)*/
	end;
OnInit:
	cloakonnpc;	// 9878
	end;
}
ein_d02_i_q.gat,171,193,3	script	ベアドール#ITB_015	10290,{/* 9879 (cloaking)*/
	end;
OnInit:
	cloakonnpc;	// 9879
	end;
}
ein_d02_i_q.gat,172,192,1	script	サン#ITB_016	798,{/* 9880 (cloaking)*/
	if(IL_TBEAR_QUE >= 7) {
		mes "[サン]";
		mes "スティーブンは";
		mes "何にでも首を突っ込むから";
		mes "少しは自分の心配もして欲しいですよ。";
		close;
	}
	cloakonnpc;	// 9880
	end;
OnInit:
	cloakonnpc;	// 9880
	end;
}

ein_d02_i_q.gat,134,240,7	script	スティーブン#ITB_017	98,{/* 9881 (cloaking)*/}
ein_d02_i_q.gat,133,238,7	script	サン#ITB_018	798,{/* 9882 (cloaking)*/}
ein_d02_i_q.gat,142,244,3	script	？？？？#ITB_019	10291,{/* 9883 (cloaking)*/
	mes "‐物陰に隠れた‐";
	next;
	warp "ein_d02_i_q.gat", 135, 235;	// from: ein_d02_i_q.gat(135, 236)
	end;
}
ein_d02_i_q.gat,141,244,5	script	？？？？#ITB_020	10294,{/* 9884 (cloaking)*/}
ein_d02_i_q.gat,141,244,5	script	？？？？#ITB_021	10293,{/* 9885 (cloaking)*/}
ein_d02_i_q.gat,140,244,7	script	？？？？#ITB_022	10292,{/* 9886 (cloaking)*/}
ein_d02_i_q.gat,141,240,5	script	？？？？#ITB_023	10290,{/* 9887 (cloaking)*/}
ein_d02_i_q.gat,139,240,5	script	？？？？#ITB_024	10292,{/* 9888 (cloaking)*/}
ein_d02_i_q.gat,140,238,5	script	？？？？#ITB_025	10290,{/* 9889 (cloaking)*/}
ein_d02_i_q.gat,144,237,5	script	？？？？#ITB_026	10292,{/* 9890 (cloaking)*/}
ein_d02_i_q.gat,145,243,7	script	？？？？#ITB_027	10293,{/* 9891 (cloaking)*/}
ein_d02_i_q.gat,142,237,7	script	？？？？#ITB_028	10290,{/* 9892 (cloaking)*/}
ein_d02_i_q.gat,140,236,7	script	？？？？#ITB_029	10292,{/* 9893 (cloaking)*/}
ein_d02_i_q.gat,142,243,1	script	？？？？#ITB_030	10290,{/* 9894 (cloaking)*/}
ein_d02_i_q.gat,144,242,3	script	？？？？#ITB_031	10290,{/* 9895 (cloaking)*/}
ein_d02_i_q.gat,144,240,1	script	？？？？#ITB_032	10290,{/* 9896 (cloaking)*/}
ein_d02_i_q.gat,141,246,5	script	？？？？#ITB_033	10292,{/* 9897 (cloaking)*/}
ein_d02_i_q.gat,141,237,7	script	？？？？#ITB_034	10290,{/* 9898 (cloaking)*/}
ein_d02_i_q.gat,141,242,7	script	？？？？#ITB_035	10293,{/* 9899 (cloaking)*/}
ein_d02_i_q.gat,147,240,7	script	？？？？#ITB_036	10290,{/* 9900 (cloaking)*/}
ein_d02_i_q.gat,145,238,7	script	？？？？#ITB_037	10290,{/* 9901 (cloaking)*/}
ein_d02_i_q.gat,147,238,7	script	？？？？#ITB_038	10290,{/* 9902 (cloaking)*/}
ein_d02_i_q.gat,141,241,7	script	？？？？#ITB_039	10293,{/* 9903 (cloaking)*/}
ein_d02_i_q.gat,145,241,1	script	？？？？#ITB_040	10290,{/* 9904 (cloaking)*/}
ein_d02_i_q.gat,140,243,5	script	？？？？#ITB_041	10290,{/* 9905 (cloaking)*/}
ein_d02_i_q.gat,135,241,0	script	#ITB_042	139,4,5,{/* 9906 */
	cloakoffnpc "？？？？#ITB_019";	// 9883
	cloakoffnpc "？？？？#ITB_020";	// 9884
	cloakonnpc "？？？？#ITB_021";	// 9885
	cloakoffnpc "？？？？#ITB_022";	// 9886
	cloakoffnpc "？？？？#ITB_023";	// 9887
	cloakoffnpc "？？？？#ITB_024";	// 9888
	cloakoffnpc "？？？？#ITB_025";	// 9889
	cloakoffnpc "？？？？#ITB_026";	// 9890
	cloakoffnpc "？？？？#ITB_027";	// 9891
	cloakoffnpc "？？？？#ITB_028";	// 9892
	cloakoffnpc "？？？？#ITB_029";	// 9893
	cloakoffnpc "？？？？#ITB_030";	// 9894
	cloakoffnpc "？？？？#ITB_031";	// 9895
	cloakoffnpc "？？？？#ITB_032";	// 9896
	cloakoffnpc "？？？？#ITB_033";	// 9897
	cloakoffnpc "？？？？#ITB_034";	// 9898
	cloakoffnpc "？？？？#ITB_035";	// 9899
	cloakoffnpc "？？？？#ITB_036";	// 9900
	cloakoffnpc "？？？？#ITB_037";	// 9901
	cloakoffnpc "？？？？#ITB_038";	// 9902
	cloakoffnpc "？？？？#ITB_039";	// 9903
	cloakoffnpc "？？？？#ITB_040";	// 9904
	cloakoffnpc "？？？？#ITB_041";	// 9905
	unittalk getnpcid(0,"？？？？#ITB_019"),"？？？？ : うはははははははは！！！",1;	// 9883
	mes "[？？？？]";
	mes "うはははははははは！！！";
	mes "民よ、聞きなさい！！";
	mes "ついに我々が";
	mes "歴史の表舞台に立つ時が来たのだ！";
	next;
	unittalk getnpcid(0,"？？？？#ITB_019"),"？？？？ : 暗くて湿った地下に囚われた、屈辱的な過去は忘れ、",1;	// 9883
	mes "[？？？？]";
	mes "暗くて湿った地下に囚われた、";
	mes "屈辱的な過去は忘れ、";
	next;
	unittalk getnpcid(0,"？？？？#ITB_019"),"？？？？ : この地を！！",1;	// 9883
	mes "[？？？？]";
	mes "この地を！！";
	next;
	unittalk getnpcid(0,"？？？？#ITB_019"),"？？？？ : この世界を！！",1;	// 9883
	mes "[？？？？]";
	mes "この世界を！！";
	next;
	unittalk getnpcid(0,"？？？？#ITB_019"),"？？？？ : 我らネジリアンの支配下におく、その日まで！！",1;	// 9883
	mes "[？？？？]";
	mes "我らネジリアンの支配下におく、";
	mes "その日まで！！";
	next;
	unittalk getnpcid(0,"？？？？#ITB_019"),"？？？？ : 侵略を止めることはないだろう！",1;	// 9883
	mes "[？？？？]";
	mes "侵略を止めることはないだろう！";
	next;
	mes "[ネジリアン？？]";
	mes "さぁ！新しい憑代が届いた！";
	mes "この空虚なボディに";
	mes "神聖な螺旋(コア)を植え付ける！";
	next;
	mes "[？？？？]";
	mes "ドライビウス！早くあれを！！";
	next;
	emotion 52,"？？？？#ITB_022";	// 9886
	mes "[ドライビウス]";
	mes "はい！！皇帝陛下、こちらに！！";
	next;
	mes "[ネジリアンエンペラー]";
	mes "ああ……見よ！";
	mes "この凛々しく美しい姿を……。";
	close2;
	misceffect 99,"？？？？#ITB_020";	// 9884
	cloakonnpc "？？？？#ITB_020";	// 9884
	cloakoffnpc "？？？？#ITB_021";	// 9885
	unittalk getnpcid(0,"？？？？#ITB_019"),"ネジリアンエンペラー : ……おっ……おお……！",1;	// 9883
	if(!sleep2(1000)) end;
	mes "[ネジリアンエンペラー]";
	mes "民よ！！";
	mes "歓迎せよ！";
	mes "新しく生まれた勇敢な戦士を！！";
	next;
	mes "[ネジリアン]";
	mes "なんと！素晴らしい曲線美！！";
	next;
	mes "[ネジリアン]";
	mes "キャー！見て！あのたくましいお腹！！";
	mes "カッコイイー！！";
	next;
	mes "[ネジリアン]";
	mes "うおおおおおおおおおお！！！";
	mes "皇帝陛下、万歳！！！";
	next;
	mes "[ネジリアンエンペラー]";
	mes "この世界は強大なネジリアンの";
	mes "力の前にひれ伏すであろう！！！";
	next;
	cloakoffnpc "スティーブン#ITB_017";	// 9881
	cloakoffnpc "サン#ITB_018";	// 9882
	mes "[ネジリアン]";
	mes "うおおおおおおおおおお！！！";
	mes "皇帝陛下、万歳！！！";
	mes "バンザイ！！バンバンザーイ！！";
	next;
	mes "[スティーブン]";
	mes "ちょっと待て、あれは何だ？";
	mes "あの青いクマのぬいぐるみは";
	mes "俺たちが作ったものか……？";
	next;
	mes "[サン]";
	mes "どうみても、そうみたいだね？";
	next;
	mes "[スティーブン]";
	mes "そうみたいじゃなくて、";
	mes "完全にそうじゃないか！";
	mes "あのモコモコクマ野郎は元々は";
	mes "ただのぬいぐるみなのか……？";
	next;
	mes "[スティーブン]";
	mes "お前が裁縫をミスした箇所が";
	mes "あそこに見えるだろ！";
	next;
	mes "[サン]";
	mes "ミスだなんて……";
	mes "あれはあれなりに、";
	mes "可愛いところがあるんだよ？";
	next;
	mes "[スティーブン]";
	mes "……可愛い？どこがだ……？";
	next;
	mes "[ネジリアンエンペラー]";
	mes "ふむ……";
	mes "まさか……。";
	next;
	mes "[ネジリアンエンペラー]";
	mes "神聖な集会に";
	mes "ネズミが紛れ込んでいようとはな。";
	next;
	mes "[ネジリアンエンペラー]";
	mes "ネジリアンの戦士たちよ！！";
	mes "侵入者を処断せよ！！";
	next;
	mes "[ネジリアン]";
	mes "仰せのままに！";
	next;
	mes "[ネジリアン]";
	mes "うおおおおおおおおおお！！";
	mes "処断せよ！";
	mes "侵入者だ！！";
	next;
	mes "[スティーブン]";
	mes "うわっ！";
	mes "どうやらバレたみたいだ！";
	next;
	setquest 11563;	// state=1
	delquest 11562;
	set IL_TBEAR_QUE,8;
	mes "[スティーブン]";
	mes "おい！";
	mes "数が多過ぎる。";
	mes "入り口まで走って逃げるぞ！";
	close2;
	cloakonnpc "スティーブン#ITB_017";	// 9881
	cloakonnpc "サン#ITB_018";	// 9882
	cloakonnpc "？？？？#ITB_019";	// 9883
	cloakonnpc "？？？？#ITB_021";	// 9885
	cloakonnpc "？？？？#ITB_022";	// 9886
	cloakonnpc "？？？？#ITB_023";	// 9887
	cloakonnpc "？？？？#ITB_024";	// 9888
	cloakonnpc "？？？？#ITB_025";	// 9889
	cloakonnpc "？？？？#ITB_026";	// 9890
	cloakonnpc "？？？？#ITB_027";	// 9891
	cloakonnpc "？？？？#ITB_028";	// 9892
	cloakonnpc "？？？？#ITB_029";	// 9893
	cloakonnpc "？？？？#ITB_030";	// 9894
	cloakonnpc "？？？？#ITB_031";	// 9895
	cloakonnpc "？？？？#ITB_032";	// 9896
	cloakonnpc "？？？？#ITB_033";	// 9897
	cloakonnpc "？？？？#ITB_034";	// 9898
	cloakonnpc "？？？？#ITB_035";	// 9899
	cloakonnpc "？？？？#ITB_036";	// 9900
	cloakonnpc "？？？？#ITB_037";	// 9901
	cloakonnpc "？？？？#ITB_038";	// 9902
	cloakonnpc "？？？？#ITB_039";	// 9903
	cloakonnpc "？？？？#ITB_040";	// 9904
	cloakonnpc "？？？？#ITB_041";	// 9905
	warp "ein_d02_i_q.gat", 168, 197;
	end;;
}
ein_d02_i_q.gat,138,239,4	script	#ITB_044	10025,{/* 9907 */
	end;
OnInit:
	areasetcell "ein_d02_i_q.gat",137,234,139,238,5;
	end;
}
ein_d02_i_q.gat,138,238,4	script	#ITB_045	10025,{/* 9908 */}
ein_d02_i_q.gat,138,237,4	script	#ITB_046	10025,{/* 9909 */}
ein_d02_i_q.gat,138,236,4	script	#ITB_047	10025,{/* 9910 */}
ein_d02_i_q.gat,138,235,4	script	#ITB_048	10025,{/* 9911 */}
ein_d02_i_q.gat,138,234,4	script	#ITB_049	10025,{/* 9912 */}
ein_d02_i_q.gat,159,235,0	script	#ITB_052	139,1,4,{/* 9915 */
	mes "‐奇妙な足音が聞こえたため";
	mes "　とっさに物陰に隠れた‐";
	next;
	warp "ein_d02_i_q.gat", 135, 235;
	end;
}
ein_d02_i_q.gat,135,234,0	script	#ITB_053	139,0,1,{/* 9916 */
	pushpc 4, 1;
}

ein_d02_i.gat,161,189,3	script	上層へと続く道#ITB_050	10043,{/* 9913 */
	mes "‐「鉱山ダンジョン 01」に";
	mes "　戻りますか？‐";
	next;
	if(select("戻る","立ち去る") == 2) {
		mes "‐その場から立ち去った‐";
		close;
	}
	warp "ein_dun01.gat", 189, 80;
	end;
}

ein_d02_i.gat,170,193,5	script	スティーブン#ITB_051	98,{/* 9914 */
	if(checkquest(11566)) {
		if(checkquest(11566)&0x2 == 0) {
			mes "[スティーブン]";
			mes "少しは労働型ピットマンが";
			mes "休んでくれて";
			mes "ネジリアン共を";
			mes "調査しやすくなったよ。";
			mes "あんたもちょっと休んどけ。";
			mes "働き過ぎたら、体壊すだけだぞ。";
			close;
		}
		//
		delquest 11566;
	}
	if(checkquest(11565)) {
		if(checkquest(11565)&0x4 == 0) {
			mes "[スティーブン]";
			mes "^0000cd労働型ピットマンを5体^000000退治して";
			mes "休暇を与えてやってくれ。";
			mes "あんたが働きすぎで";
			mes "体を壊すのも良くないから";
			mes "5体でいいぜ。";
			close;
		}
		setquest 11566;	// state=1
		delquest 11565;
		getitem 25271,2;
		getexp 100000000,0,1;
		getexp 0,0,0;
		mes "[スティーブン]";
		mes "おぅ、お疲れ！";
		mes "これで落ち着いて調査出来そうだ。";
		mes "お礼にまた見つけた鉱石をやるぜ。";
		close;
	}
	mes "[スティーブン]";
	mes "……ああ、あんたか。俺は今、";
	mes "自称「ネジリアン」共を調査中なんだが、";
	mes "働き者モンスターの活動が邪魔で";
	mes "調査が進まないんだ。";
	next;
	mes "[スティーブン]";
	mes "あんたが忙しくなければ、";
	mes "^0000cd労働型ピットマンを5体^000000";
	mes "退治してくれると助かる。";
	mes "お礼はするから、";
	mes "引き受けてくれないか？";
	next;
	if(select("引き受ける","忙しい") == 2) {
		mes "[スティーブン]";
		mes "そうか。";
		mes "あんたも忙しいんだな。";
		close;
	}
	setquest 11565;	// state=1
	mes "[スティーブン]";
	mes "頼んだぞ。";
	mes "^0000cd労働型ピットマンを5体^000000だ！";
	mes "あんたが働きすぎで";
	mes "体を壊すのも良くないから";
	mes "5体でいいぜ。";
	close;
}
