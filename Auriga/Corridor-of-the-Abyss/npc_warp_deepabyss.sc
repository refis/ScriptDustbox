//= Auriga Script ==============================================================
// Ragnarok Online Deep Abyss Warp Method Script	by refis
//==============================================================================

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£i’ë‰€j
//------------------------------------------------------------
// “üêNPC
pab_camp.gat,40,211,6	script	‚Ğ‚½‚Ş‚«‚È‰qm#pab_camp	417,{
	mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
	mes "‚¨”æ‚ê—l‚Å‚·A–`Œ¯Ò—lI";
	mes "u^0000ffƒvƒƒ“ƒeƒ‰[•£i’ë‰€j^000000v‚Æ";
	mes "u^0000ffƒvƒƒ“ƒeƒ‰[•£•\‘wi’ë‰€j^000000v‚É";
	mes "ˆÄ“à‚¢‚½‚µ‚Ü‚·B";
	set '@str$,(BaseLevel > 130? "^888888•\‘w’ë‰€‚ÉŒü‚©‚¤^000000": "•\‘w’ë‰€‚ÉŒü‚©‚¤");
	next;
	switch(select("’ë‰€‚ÉŒü‚©‚¤",'@str$,"æ‚è‚â‚ß‚é")) {
	case 1:
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½I";
		mes "‚Ç‚¿‚ç‚És‚©‚ê‚Ü‚·‚©H";
		next;
		switch(select("’ë‰€(–k¼)","’ë‰€(“Œ)","æ‚è‚â‚ß‚é")) {
		case 1:
			warp "pab_dun01.gat",43,232;
			end;
		case 2:
			warp "pab_dun01.gat",254,104;
			end;
		case 3:
			mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
			mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½B";
			mes "uƒvƒƒ“ƒeƒ‰[•£i’ë‰€jv‚É";
			mes "Œü‚©‚í‚ê‚éÛ‚Í";
			mes "„‚É‚¨\‚µ•t‚¯‚­‚¾‚³‚¢I";
			close;
		}
	case 2:
		if(BaseLevel > 130) {
			mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
			mes "–`Œ¯Ò—l‚Å‚ ‚ê‚Î";
			mes "•\‘w‚És‚­•K—v‚Í–³‚¢‚Í‚¸‚Å‚·B";
			mes "•\‘wˆÈŠO‚ÌêŠ‚ÉŒü‚©‚Á‚Ä‚­‚¾‚³‚¢B";
			mes "@";
			mes "^0000ff]BaseLv130ˆÈ‰º‚È‚ç•\‘w‚É";
			mes "@“ü‚é‚±‚Æ‚ª‚Å‚«‚Ü‚·]^000000";
			close;
		}
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½I";
		mes "‚Ç‚¿‚ç‚És‚©‚ê‚Ü‚·‚©H";
		next;
		switch(select("•\‘w’ë‰€(–k¼)","•\‘w’ë‰€(“Œ)","æ‚è‚â‚ß‚é")) {
		case 1:
			warp "pab_dun05.gat",43,232;
			end;
		case 2:
			warp "pab_dun05.gat",254,104;
			end;
		case 3:
			mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
			mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½B";
			mes "uƒvƒƒ“ƒeƒ‰[•£•\‘wi’ë‰€jv‚É";
			mes "Œü‚©‚í‚ê‚éÛ‚Í";
			mes "„‚É‚¨\‚µ•t‚¯‚­‚¾‚³‚¢I";
			close;
		}
	default:
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½B";
		mes "uƒvƒƒ“ƒeƒ‰[•£i’ë‰€jv‚É";
		mes "Œü‚©‚í‚ê‚éÛ‚Í";
		mes "„‚É‚¨\‚µ•t‚¯‚­‚¾‚³‚¢I";
		close;
	}
}

// ƒvƒƒ“ƒeƒ‰[•£i’ë‰€j‹AŠÒNPC
pab_dun01.gat,30,232,0	warp	#warp_pab_dun01_01	2,2,pab_camp.gat,40,203
pab_dun01.gat,263,109,0	warp	#warp_pab_dun01_02	2,2,pab_camp.gat,40,203

// ƒvƒƒ“ƒeƒ‰[•£•\‘wi’ë‰€j‹AŠÒNPC
pab_dun05.gat,30,232,0	warp	#warp_pab_dun05_01	2,2,pab_camp.gat,40,203
pab_dun05.gat,263,109,0	warp	#warp_pab_dun05_02	2,2,pab_camp.gat,40,203

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£iÕâJêj
//------------------------------------------------------------
// “üêNPC
pab_camp.gat,19,190,6	script	‚Ğ‚½‚Ş‚«‚È‰qm#pab_camp	417,{
	mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
	mes "‚¨”æ‚ê—l‚Å‚·A–`Œ¯Ò—lI";
	mes "u^0000ffƒvƒƒ“ƒeƒ‰[•£iÕâJêj^000000v‚Ö";
	mes "ˆÄ“à‚¢‚½‚µ‚Ü‚·B";
	next;
	switch(select("ÕâJê‚ÉŒü‚©‚¤","æ‚è‚â‚ß‚é")) {
	case 1:
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½I";
		mes "‚Ç‚¿‚ç‚És‚©‚ê‚Ü‚·‚©H";
		next;
		switch(select("ÕâJê(–k“Œ)","ÕâJê(“ì¼)","æ‚è‚â‚ß‚é")) {
		case 1:
			warp "pab_dun02.gat",216,185;
			end;
		case 2:
			warp "pab_dun02.gat",49,52;
			end;
		case 3:
			mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
			mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½B";
			mes "uƒvƒƒ“ƒeƒ‰[•£iÕâJêjv‚É";
			mes "Œü‚©‚í‚ê‚éÛ‚Í";
			mes "„‚É‚¨\‚µ•t‚¯‚­‚¾‚³‚¢I";
			close;
		}
	default:
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½B";
		mes "uƒvƒƒ“ƒeƒ‰[•£iÕâJêjv‚É";
		mes "Œü‚©‚í‚ê‚éÛ‚Í";
		mes "„‚É‚¨\‚µ•t‚¯‚­‚¾‚³‚¢I";
		close;
	}
}

// ƒvƒƒ“ƒeƒ‰[•£iÕâJêj‹AŠÒNPC
pab_dun02.gat,54,58,0	warp	#warp_pab_dun02_01	2,2,pab_camp.gat,28,191
pab_dun02.gat,222,197,0	warp	#warp_pab_dun02_02	2,2,pab_camp.gat,28,191

// ƒvƒƒ“ƒeƒ‰[•£iÕâJêj=> ƒvƒƒ“ƒeƒ‰[•£iX—Ñj
pab_dun02.gat,219,46,0	warp	#warp_pab_dun02_03	2,2,pab_dun09.gat,34,139

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£i‰ñ˜Lj
//------------------------------------------------------------
// “üêNPC
pab_camp.gat,64,189,4	script	‚Ğ‚½‚Ş‚«‚È‰qm#pab_camp	417,{
	mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
	mes "‚¨”æ‚ê—l‚Å‚·A–`Œ¯Ò—lI";
	mes "u^0000ffƒvƒƒ“ƒeƒ‰[•£i‰ñ˜Lj^000000v‚Æ";
	mes "u^0000ffƒvƒƒ“ƒeƒ‰[•£•\‘wi‰ñ˜Lj^000000v‚É";
	mes "ˆÄ“à‚¢‚½‚µ‚Ü‚·B";
	set '@str$,(BaseLevel > 130? "^888888•\‘w‰ñ˜L‚ÉŒü‚©‚¤^000000": "•\‘w‰ñ˜L‚ÉŒü‚©‚¤");
	next;
	switch(select("‰ñ˜L‚ÉŒü‚©‚¤",'@str$,"æ‚è‚â‚ß‚é")) {
	case 1:
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½I";
		mes "‚Ç‚¿‚ç‚És‚©‚ê‚Ü‚·‚©H";
		next;
		switch(select("‰ñ˜L(¼)","‰ñ˜L(“Œ)","æ‚è‚â‚ß‚é")) {
		case 1:
			warp "pab_dun03.gat",13,132;
			end;
		case 2:
			warp "pab_dun03.gat",224,130;
			end;
		case 3:
			break;
		}
		break;
	case 2:
		if(BaseLevel > 130) {
			mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
			mes "–`Œ¯Ò—l‚Å‚ ‚ê‚Î";
			mes "•\‘w‚És‚­•K—v‚Í–³‚¢‚Í‚¸‚Å‚·B";
			mes "•\‘wˆÈŠO‚ÌêŠ‚ÉŒü‚©‚Á‚Ä‚­‚¾‚³‚¢B";
			mes "@";
			mes "^0000ff]BaseLv130ˆÈ‰º‚È‚ç•\‘w‚É";
			mes "@“ü‚é‚±‚Æ‚ª‚Å‚«‚Ü‚·]^000000";
			close;
		}
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½I";
		mes "‚Ç‚¿‚ç‚És‚©‚ê‚Ü‚·‚©H";
		next;
		switch(select("•\‘w‰ñ˜L(¼)","•\‘w‰ñ˜L(“Œ)","æ‚è‚â‚ß‚é")) {
		case 1:
			warp "pab_dun07.gat",13,132);
			end;
		case 2:
			warp "pab_dun07.gat",224,130;
			end;
		case 3:
			break;
		}
		break;
	default:
		break;
	}
	mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
	mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½B";
	mes "uƒvƒƒ“ƒeƒ‰[•£i‰ñ˜Ljv‚É";
	mes "Œü‚©‚í‚ê‚éÛ‚Í";
	mes "„‚É‚¨\‚µ•t‚¯‚­‚¾‚³‚¢I";
	close;
}

// ƒvƒƒ“ƒeƒ‰[•£i‰ñ˜Lj‹AŠÒNPC
pab_dun03.gat,6,130,0	warp	#warp_pab_dun03_01	2,2,pab_camp.gat,57,189
pab_dun03.gat,232,130,0	warp	#warp_pab_dun03_02	2,2,pab_camp.gat,57,189

// ƒvƒƒ“ƒeƒ‰[•£•\‘wi‰ñ˜Lj‹AŠÒNPC
pab_dun07.gat,6,130,0	warp	#warp_pab_dun07_01	2,2,pab_camp.gat,57,189
pab_dun07.gat,232,130,0	warp	#warp_pab_dun07_02	2,2,pab_camp.gat,57,189

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£i‹ŒsŠX’nj
//------------------------------------------------------------
// “üêNPC
pab_camp.gat,40,168,7	script	‚Ğ‚½‚Ş‚«‚È‰qm#pab_camp	417,{
	mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
	mes "‚¨”æ‚ê—l‚Å‚·A–`Œ¯Ò—lI";
	mes "u^0000ffƒvƒƒ“ƒeƒ‰[•£i‹ŒsŠX’nj^000000v‚É";
	mes "ˆÄ“à‚¢‚½‚µ‚Ü‚·B";
	next;
	switch(select("‹ŒsŠX’n‚ÉŒü‚©‚¤","æ‚è‚â‚ß‚é")) {
	case 1:
		mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
		mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½I";
		mes "‚Ç‚¿‚ç‚És‚©‚ê‚Ü‚·‚©H";
		next;
		switch(select("‹ŒsŠX’n(¼)","‹ŒsŠX’n(“Œ)","æ‚è‚â‚ß‚é")) {
		case 1:
			warp "pab_dun04.gat",25,132;
			end;
		case 2:
			warp "pab_dun04.gat",259,131;
			end;
		case 3:
			break;
		}
	default:
		break;
	}
	mes "[‚Ğ‚½‚Ş‚«‚È‰qm]";
	mes "‚©‚µ‚±‚Ü‚è‚Ü‚µ‚½B";
	mes "uƒvƒƒ“ƒeƒ‰[•£i‹ŒsŠX’njv‚É";
	mes "Œü‚©‚í‚ê‚éÛ‚Í";
	mes "„‚É‚¨\‚µ•t‚¯‚­‚¾‚³‚¢I";
	close;
}

// ƒvƒƒ“ƒeƒ‰[•£i‹ŒsŠX’nj‹AŠÒNPC
pab_dun04.gat,14,132,0	warp	#warp_pab_dun04_01	2,2,pab_camp.gat,41,176
pab_dun04.gat,267,131,0	warp	#warp_pab_dun04_02	2,2,pab_camp.gat,41,176

// ƒvƒƒ“ƒeƒ‰[•£i‹ŒsŠX’nj=> ƒvƒƒ“ƒeƒ‰[•£iŒk’Jj
pab_dun04.gat,96,10,0	warp	#warp_pab_dun04_03	2,2,pab_dun10.gat,96,169

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£iX—Ñj
//------------------------------------------------------------
// “üêNPC
pab_castle.gat,268,222,6	script	dŒú‚È‚é‹ß‰q•º#pab_cast	734,{
	if(BaseLevel < 150) {
		mes "[dŒú‚È‚é‹ß‰q•º]";
		mes "‘Ò‚½‚ê‚æI";
		mes "‚±‚Ìæ‚Í‹¶–\‚È‰»‚¯•¨‚Ç‚à‚ª";
		mes "’µ—Àæëç»‚·‚éâ–]‚Ì•£B";
		mes "„‚ÌÒ‚Å‚È‚¯‚ê‚Îi‚Ş‚±‚Æ‚ª”\‚í‚Ê";
		mes "Œ‹ŠE‚ğ’£‚Á‚Ä‚¨‚éB";
		next;
		mes "[dŒú‚È‚é‹ß‰q•º]";
		mes "^ff0000BaseLv‚ª150ˆÈã^000000‚É‚È‚ê‚Î";
		mes "Œ‹ŠE‚ğ’Ê‚é‚±‚Æ‚ª‚Å‚«‚æ‚¤B";
		mes "‚Ü‚¸‚Í’b˜B‚ğÏ‚ñ‚ÅQ‚ç‚ê‚æB";
		close;
	}
	mes "[dŒú‚È‚é‹ß‰q•º]";
	mes "‹M“a‚Ù‚Ç‚Ì„‚ÌÒ‚Å‚ ‚ê‚Î";
	mes "‚±‚Ìê‚ğç‚éŒ‹ŠE‚ğ";
	mes "–â‘è‚È‚­’Ê‚é‚±‚Æ‚ª‚Å‚«‚æ‚¤B";
	mes "u^0000ffƒvƒƒ“ƒeƒ‰[•£iX—Ñj^000000v‚Öi‚Ş‚È‚ç";
	mes "™G‰z‚È‚ª‚çÙÒ‚ªˆÄ“à‚¢‚½‚·B";
	next;
	switch(select("X—Ñ‚ÉŒü‚©‚¤","‚±‚Ìê‚É—¯‚Ü‚é")) {
	case 1:
		mes "[dŒú‚È‚é‹ß‰q•º]";
		mes "‚Å‚ÍAQ‚è‚Ü‚µ‚å‚¤‚¼B";
		mes "‚»‚Ì—ÍA‘¶•ª‚ÉU‚é‚í‚ê‚æB";
		close2;
		warp "pab_dun09.gat",219,225;
		end;
	default:
		mes "[dŒú‚È‚é‹ß‰q•º]";
		mes "³’mB";
		mes "‹M“a‚ª–]‚Ü‚ê‚é‚È‚ç";
		mes "‚¢‚Â‚Å‚àˆÄ“à‚¢‚½‚µ‚Ü‚µ‚å‚¤B";
		close;
	}
}

// ƒvƒƒ“ƒeƒ‰[•£iX—Ñj=> ƒvƒƒ“ƒeƒ‰[•£i—I‹v‚Ì‹uj
pab_dun09.gat,222,230,0	warp	#warp_pab_dun09_01	2,2,pab_castle.gat,268,229

// ƒvƒƒ“ƒeƒ‰[•£iX—Ñj=> ƒvƒƒ“ƒeƒ‰[•£iÕâJêj
pab_dun09.gat,31,135,0	warp	#warp_pab_dun09_02	2,2,pab_dun02.gat,213,47

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£iŒk’Jj
//------------------------------------------------------------
// “üêNPC
pab_castle.gat,290,247,4	script	]‡‚È‚é‹ß‰q•º#pab_cast	413,{
	if(BaseLevel < 150) {
		mes "[]‡‚È‚é‹ß‰q•º]";
		mes "\‚µ–ó‚ ‚è‚Ü‚¹‚ñA–`Œ¯Ò—lB";
		mes "‚±‚Ìæ‚Í‘å•ÏŠëŒ¯‚Å‚·‚Ì‚Å";
		mes "n—û‚Ì–`Œ¯Ò—l‚Å‚È‚¯‚ê‚Î";
		mes "“ü‚ê‚È‚¢Œ‹ŠE‚ª’£‚ç‚ê‚Ä‚¨‚è‚Ü‚·B";
		next;
		mes "[]‡‚È‚é‹ß‰q•º]";
		mes "‚»‚¤‚Å‚·‚Ëcc";
		mes "^ff0000BaseLv‚ª150ˆÈã^000000‚Å‚ ‚ê‚Î";
		mes "Œ‹ŠE‚ğ–â‘è‚È‚­’Ê‚ê‚é‚Í‚¸‚Å‚·B";
		mes "‚»‚Ì‚ª—ˆ‚ê‚Î‰ü‚ß‚Ä";
		mes "‚¨‰z‚µ‚­‚¾‚³‚¢B";
		close;
	}
	mes "[]‡‚È‚é‹ß‰q•º]";
	mes "‚¨‘Ò‚¿‚µ‚Ä‚¨‚è‚Ü‚µ‚½B";
	mes "‹M•û—l‚Ì‚æ‚¤‚Èn—û‚Ì–`Œ¯Ò‚Å‚ ‚ê‚Î";
	mes "ˆÀS‚µ‚ÄˆÄ“à‚Å‚«‚Ü‚·B";
	mes "‚±‚Ìæ‚É‚ ‚éu^0000ffƒvƒƒ“ƒeƒ‰[•£iŒk’Jj^000000v‚Ö";
	mes "Œü‚©‚í‚ê‚Ü‚·‚©H";
	next;
	switch(select("Œk’J‚ÉŒü‚©‚¤","‚±‚Ìê‚É—¯‚Ü‚é")) {
	case 1:
		mes "[]‡‚È‚é‹ß‰q•º]";
		mes "³’m‚¢‚½‚µ‚Ü‚µ‚½B";
		mes "„‚ª‚²ˆÄ“à‚¢‚½‚µ‚Ü‚·B";
		mes "‚³‚ AQ‚è‚Ü‚µ‚å‚¤B";
		close2;
		warp "pab_dun10.gat",95,25;
		end;
	default:
		mes "[]‡‚È‚é‹ß‰q•º]";
		mes "³’m‚¢‚½‚µ‚Ü‚µ‚½B";
		mes "‚à‚µ‚±‚Ìæ‚Éi‚Ü‚ê‚é‚Ì‚Å‚ ‚ê‚Î";
		mes "„‚ª‚²ˆÄ“à‚¢‚½‚µ‚Ü‚µ‚å‚¤B";
		close;
	}
}

// ƒvƒƒ“ƒeƒ‰[•£iŒk’Jj=> ƒvƒƒ“ƒeƒ‰[•£i—I‹v‚Ì‹uj
pab_dun10.gat,96,17,0	warp	#warp_pab_dun10_01	2,2,pab_castle.gat,290,239

// ƒvƒƒ“ƒeƒ‰[•£iŒk’Jj=> ƒvƒƒ“ƒeƒ‰[•£i‹ŒsŠX’nj
pab_dun10.gat,96,176,0	warp	#warp_pab_dun10_02	2,2,pab_dun04.gat,96,16

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£i‘Œ´j
//------------------------------------------------------------
// “üêNPC
pab_castle.gat,271,251,5	script	ˆĞ•—“°X‚½‚é‹ß‰q•º#pab_	470,{
	if(BaseLevel < 170) {
		mes "[ˆĞ•—“°X‚½‚é‹ß‰q•º]";
		mes "‚±‚Ìæ‚Í–‚•¨‚Ì‘ƒŒA‚Æ‰»‚µ‚½";
		mes "‰¤é‚Ö‚Æ‘±‚­“¹‚Å‚ ‚éB";
		mes "–‚•¨‚Ç‚à‚Ìi“ü‚ğ–h‚®‚½‚ß";
		mes "•P—l‚Ì‚¨—Í‚ÅŒ‹ŠE‚ğ’£‚Á‚Ä‚¢‚éB";
		next;
		mes "[ˆĞ•—“°X‚½‚é‹ß‰q•º]";
		mes "‰¤é‚Ö‚Ì“¹‚ÍŒ¯‚µ‚­";
		mes "‹¥ˆ«‚È–‚•¨‚Ç‚à‚ª‘Ò‚¿\‚¦‚Ä‚¢‚éB";
		mes "‚»‚ê‚Å‚à®A‚±‚Ì“¹‚É’§‚Ş‚Æ‰]‚¤‚È‚ç";
		mes "^ff0000BaseLv‚ğ170ˆÈã^000000‚É‚µ‚Ä‚­‚é‚Ì‚¾B";
		mes "Œ¤èr‚ğÏ‚ñ‚¾‚çA‚Ü‚½—ˆ‚é‚ª—Ç‚¢B";
		close;
	}
	mes "[ˆĞ•—“°X‚½‚é‹ß‰q•º]";
	mes "‚±‚Ìæ‚Í–‚•¨‚Ì‘ƒŒA‚Æ‰»‚µ‚½";
	mes "‰¤é‚Ö‚Æ‘±‚­“¹‚Å‚ ‚éB";
	mes "“¹‚ÍŒ¯‚µ‚­A‹¥ˆ«‚È–‚•¨‚Ç‚à‚ª";
	mes "‘Ò‚¿\‚¦‚Ä‚¢‚éB";
	next;
	mes "[ˆĞ•—“°X‚½‚é‹ß‰q•º]";
	mes "”‘½‚­‚Ì—Em‚ª’§‚İ";
	mes "U‚Á‚Äs‚Á‚½ˆï‚Ì“¹‚Å‚ ‚éB";
	mes "‚»‚ê‚Å‚à®A‚±‚Ì“¹‚É’§‚Ş‚Æ‰]‚¤‚È‚ç";
	mes "„‚ªÓ”C‚ğ‚Á‚ÄˆÄ“à‚µ‚æ‚¤B";
	next;
	switch(select("‘Œ´‚ÉŒü‚©‚¤","‚±‚Ìê‚É—¯‚Ü‚é")) {
	case 1:
		mes "[ˆĞ•—“°X‚½‚é‹ß‰q•º]";
		mes "‚»‚ÌŠácc";
		mes "‚·‚Å‚ÉŠoŒå‚ÍŒˆ‚Ü‚Á‚Ä‚¢‚½‚©B";
		mes "‚È‚ç‚Î‰½‚àŒ¾‚¤‚±‚Æ‚Í‚È‚¢B";
		mes "‚Å‚ÍAQ‚ë‚¤B";
		close2;
		warp "pab_dun11.gat",307,44;
		end;
	default:
		mes "[ˆĞ•—“°X‚½‚é‹ß‰q•º]";
		mes "‚±‚Ì“¹‚ğ’Ê‚èA‰¤é‚ÉŒü‚©‚¤‚Í";
		mes "‚İ‚·‚İ‚·–½‚ğÌ‚Ä‚é‚æ‚¤‚È‚à‚ÌB";
		mes "‘Ş‚­‚àA‚Ü‚½—E‹C‚Å‚ ‚ë‚¤B";
		close;
	}
}

// ƒvƒƒ“ƒeƒ‰[•£i‘Œ´j=> ƒvƒƒ“ƒeƒ‰[•£i“´ŒAj
pab_dun11.gat,233,334,0	warp	#warp_pab_dun11_01	2,2,pab_dun12.gat,294,257

// ƒvƒƒ“ƒeƒ‰[•£i‘Œ´j=> ƒvƒƒ“ƒeƒ‰[•£i—I‹v‚Ì‹uj
pab_dun11.gat,307,39,0	warp	#warp_pab_dun11_02	2,2,pab_castle.gat,276,247

//============================================================
// ƒvƒƒ“ƒeƒ‰[•£i“´ŒAj
//------------------------------------------------------------
// “üêNPC
pab_base01.gat,344,64,1	script	—ô‚¯–Ú#pab_base01	550,{
	mes "]‘å‚«‚È‹T—ô‚©‚ç";
	mes "@‚©‚ÑL‚¢¼‚Á‚½•—‚ª";
	mes "@—¬‚ê‚Ä‚­‚é]";
	next;
	if(select("­‚µl‚¦‚é","—ô‚¯–Ú‚É”ò‚Ñ‚Ş") == ) {
		mes "]‚ ‚È‚½‚Í—§‚¿‹‚Á‚½]";
		close;
	}
	if(BaseLevel < 170) {
		mes "[HHHH]";
		mes "Œ‹ŠE‚É‚ÄA—Í‚È‚«Ò‚ÌN“ü‚ğ‹Ö‚¸‚éB";
		mes "@";
		mes "^FF0000BaseLv‚ª170ˆÈã^000000cc";
		mes "‚»‚Ì‹­‚³‚ğè‚É“ü‚ê‚½‚È‚ç";
		mes "“ğ‚ğ–W‚°‚é‚à‚Ì‚Í–³‚­‚È‚é‚Å‚ ‚ë‚¤B";
		close;
	}
	warp "pab_dun12.gat",33,384;
	end;
OnInit:
	initnpctimer;
	end;
OnTimer5000:
	initnpctimer;
	misceffect 6;
	end;
}

// ƒvƒƒ“ƒeƒ‰[•£i“´ŒAj‹AŠÒNPC
pab_dun12.gat,29,387,0	warp	#warp_pab_dun12_01	2,2,pab_base01.gat,338,75

// ƒvƒƒ“ƒeƒ‰[•£i“´ŒAjƒ[ƒvƒŠƒ“ƒN

// ƒvƒƒ“ƒeƒ‰[•£i“´ŒAj=> ƒvƒƒ“ƒeƒ‰[•£i‘Œ´j
pab_dun12.gat,278,257,0	warp	#warp_pab_dun12_02	3,3,pab_dun11.gat,233,329

// ƒvƒƒ“ƒeƒ‰[•£i“´ŒAj=> [•£‚Ì—ûê
pab_dun12.gat,181,45,0	warp	#warp_pab_dun12_03	3,3,pab_alter.gat,66,16

pab_dun12.gat,311,257,0	warp	#warp_pab_dun12_001	3,3,pab_dun12.gat,170,257

// ƒvƒƒ“ƒeƒ‰[•£i“´ŒAj=> UéíŠî’n
pab_dun12.gat,164,257,0	warp	#warp_pab_dun12_002	3,3,pab_base01.gat,337,76

pab_dun12.gat,197,257,0	warp	#warp_pab_dun12_003	3,3,pab_dun12.gat,360,181
pab_dun12.gat,354,181,0	warp	#warp_pab_dun12_004	3,3,pab_dun12.gat,191,257
pab_dun12.gat,387,181,0	warp	#warp_pab_dun12_005	3,3,pab_dun12.gat,131,333
pab_dun12.gat,126,333,0	warp	#warp_pab_dun12_006	3,3,pab_dun12.gat,381,181
pab_dun12.gat,159,333,0	warp	#warp_pab_dun12_007	3,3,pab_dun12.gat,360,143
pab_dun12.gat,354,143,0	warp	#warp_pab_dun12_008	3,3,pab_dun12.gat,154,333
pab_dun12.gat,387,143,0	warp	#warp_pab_dun12_009	3,3,pab_dun12.gat,94,181
pab_dun12.gat,88,181,0	warp	#warp_pab_dun12_010	3,3,pab_dun12.gat,381,143
pab_dun12.gat,121,181,0	warp	#warp_pab_dun12_011	3,3,pab_dun12.gat,284,295
pab_dun12.gat,278,295,0	warp	#warp_pab_dun12_012	3,3,pab_dun12.gat,115,181
pab_dun12.gat,311,295,0	warp	#warp_pab_dun12_013	3,3,pab_dun12.gat,132,67
pab_dun12.gat,126,67,0	warp	#warp_pab_dun12_014	3,3,pab_dun12.gat,305,295
pab_dun12.gat,159,67,0	warp	#warp_pab_dun12_015	3,3,pab_dun12.gat,94,143
pab_dun12.gat,88,143,0	warp	#warp_pab_dun12_016	3,3,pab_dun12.gat,154,67
pab_dun12.gat,121,143,0	warp	#warp_pab_dun12_017	3,3,pab_dun12.gat,284,372
pab_dun12.gat,278,372,0	warp	#warp_pab_dun12_018	3,3,pab_dun12.gat,115,143
pab_dun12.gat,311,372,0	warp	#warp_pab_dun12_019	3,3,pab_dun12.gat,246,219
pab_dun12.gat,240,219,0	warp	#warp_pab_dun12_020	3,3,pab_dun12.gat,305,372
pab_dun12.gat,273,219,0	warp	#warp_pab_dun12_021	3,3,pab_dun12.gat,55,219
pab_dun12.gat,50,219,0	warp	#warp_pab_dun12_022	3,3,pab_dun12.gat,267,219
pab_dun12.gat,83,219,0	warp	#warp_pab_dun12_023	3,3,pab_dun12.gat,56,295
pab_dun12.gat,50,295,0	warp	#warp_pab_dun12_024	3,3,pab_dun12.gat,78,219
pab_dun12.gat,66,282,0	warp	#warp_pab_dun12_025	3,3,pab_dun12.gat,65,191
pab_dun12.gat,66,197,0	warp	#warp_pab_dun12_026	3,3,pab_dun12.gat,66,287
pab_dun12.gat,66,168,0	warp	#warp_pab_dun12_027	3,3,pab_dun12.gat,66,381
pab_dun12.gat,66,387,0	warp	#warp_pab_dun12_028	3,3,pab_dun12.gat,66,172
pab_dun12.gat,66,358,0	warp	#warp_pab_dun12_029	3,3,pab_dun12.gat,218,153
pab_dun12.gat,218,159,0	warp	#warp_pab_dun12_030	3,3,pab_dun12.gat,66,362
pab_dun12.gat,218,130,0	warp	#warp_pab_dun12_031	3,3,pab_dun12.gat,370,117
pab_dun12.gat,370,121,0	warp	#warp_pab_dun12_032	3,3,pab_dun12.gat,218,134
pab_dun12.gat,370,92,0	warp	#warp_pab_dun12_033	3,3,pab_dun12.gat,332,267
pab_dun12.gat,332,273,0	warp	#warp_pab_dun12_034	3,3,pab_dun12.gat,370,96
pab_dun12.gat,332,244,0	warp	#warp_pab_dun12_035	3,3,pab_dun12.gat,294,154
pab_dun12.gat,294,159,0	warp	#warp_pab_dun12_036	3,3,pab_dun12.gat,332,248
pab_dun12.gat,294,130,0	warp	#warp_pab_dun12_037	3,3,pab_dun12.gat,332,306
pab_dun12.gat,332,311,0	warp	#warp_pab_dun12_038	3,3,pab_dun12.gat,294,134
pab_dun12.gat,332,282,0	warp	#warp_pab_dun12_039	3,3,pab_dun12.gat,294,191
pab_dun12.gat,294,197,0	warp	#warp_pab_dun12_040	3,3,pab_dun12.gat,332,286
pab_dun12.gat,294,168,0	warp	#warp_pab_dun12_041	3,3,pab_dun12.gat,66,343
pab_dun12.gat,66,349,0	warp	#warp_pab_dun12_042	3,3,pab_dun12.gat,294,172
pab_dun12.gat,66,320,0	warp	#warp_pab_dun12_043	3,3,pab_dun12.gat,104,381
pab_dun12.gat,104,387,0	warp	#warp_pab_dun12_044	3,3,pab_dun12.gat,66,324
pab_dun12.gat,294,16,0	warp	#warp_pab_dun12_045	3,3,pab_dun12.gat,351,77
pab_dun12.gat,351,83,0	warp	#warp_pab_dun12_046	3,3,pab_dun12.gat,294,20
pab_dun12.gat,351,16,0	warp	#warp_pab_dun12_047	3,3,pab_dun12.gat,142,229
pab_dun12.gat,142,235,0	warp	#warp_pab_dun12_048	3,3,pab_dun12.gat,351,20
pab_dun12.gat,142,320,0	warp	#warp_pab_dun12_049	3,3,pab_dun12.gat,104,77
pab_dun12.gat,104,83,0	warp	#warp_pab_dun12_050	3,3,pab_dun12.gat,142,324
pab_dun12.gat,104,54,0	warp	#warp_pab_dun12_051	3,3,pab_dun12.gat,142,191
pab_dun12.gat,142,197,0	warp	#warp_pab_dun12_052	3,3,pab_dun12.gat,104,58
pab_dun12.gat,142,168,0	warp	#warp_pab_dun12_053	3,3,pab_dun12.gat,180,305
pab_dun12.gat,180,311,0	warp	#warp_pab_dun12_054	3,3,pab_dun12.gat,142,172
pab_dun12.gat,180,282,0	warp	#warp_pab_dun12_055	3,3,pab_dun12.gat,294,229
pab_dun12.gat,294,235,0	warp	#warp_pab_dun12_056	3,3,pab_dun12.gat,180,286
pab_dun12.gat,104,168,0	warp	#warp_pab_dun12_057	3,3,pab_dun12.gat,28,343
pab_dun12.gat,28,349,0	warp	#warp_pab_dun12_058	3,3,pab_dun12.gat,104,172
pab_dun12.gat,28,320,0	warp	#warp_pab_dun12_059	3,3,pab_dun12.gat,180,229
pab_dun12.gat,180,235,0	warp	#warp_pab_dun12_060	3,3,pab_dun12.gat,28,324
pab_dun12.gat,197,219,0	warp	#warp_pab_dun12_061	3,3,pab_dun12.gat,170,143
pab_dun12.gat,164,143,0	warp	#warp_pab_dun12_062	3,3,pab_dun12.gat,193,219
pab_dun12.gat,197,143,0	warp	#warp_pab_dun12_063	3,3,pab_dun12.gat,170,29
pab_dun12.gat,164,29,0	warp	#warp_pab_dun12_064	3,3,pab_dun12.gat,191,143
pab_dun12.gat,197,29,0	warp	#warp_pab_dun12_065	3,3,pab_dun12.gat,132,105
pab_dun12.gat,126,105,0	warp	#warp_pab_dun12_066	3,3,pab_dun12.gat,191,29
pab_dun12.gat,159,105,0	warp	#warp_pab_dun12_067	3,3,pab_dun12.gat,18,295
pab_dun12.gat,12,295,0	warp	#warp_pab_dun12_068	3,3,pab_dun12.gat,151,105
pab_dun12.gat,45,295,0	warp	#warp_pab_dun12_069	3,3,pab_dun12.gat,283,67
pab_dun12.gat,278,67,0	warp	#warp_pab_dun12_070	3,3,pab_dun12.gat,39,295
pab_dun12.gat,256,206,0	warp	#warp_pab_dun12_071	3,3,pab_dun12.gat,332,115
pab_dun12.gat,332,121,0	warp	#warp_pab_dun12_072	3,3,pab_dun12.gat,256,210
pab_dun12.gat,332,92,0	warp	#warp_pab_dun12_073	3,3,pab_dun12.gat,294,78
pab_dun12.gat,294,83,0	warp	#warp_pab_dun12_074	3,3,pab_dun12.gat,332,96
pab_dun12.gat,294,54,0	warp	#warp_pab_dun12_075	3,3,pab_dun12.gat,256,191
pab_dun12.gat,256,197,0	warp	#warp_pab_dun12_076	3,3,pab_dun12.gat,294,58
pab_dun12.gat,256,168,0	warp	#warp_pab_dun12_077	3,3,pab_dun12.gat,180,382
pab_dun12.gat,180,387,0	warp	#warp_pab_dun12_078	3,3,pab_dun12.gat,256,172
pab_dun12.gat,142,206,0	warp	#warp_pab_dun12_079	3,3,pab_dun12.gat,142,305
pab_dun12.gat,142,311,0	warp	#warp_pab_dun12_080	3,3,pab_dun12.gat,142,210
pab_dun12.gat,159,295,0	warp	#warp_pab_dun12_081	3,3,pab_dun12.gat,170,181
pab_dun12.gat,164,181,0	warp	#warp_pab_dun12_082	3,3,pab_dun12.gat,153,295
pab_dun12.gat,197,181,0	warp	#warp_pab_dun12_083	3,3,pab_dun12.gat,284,219
pab_dun12.gat,278,219,0	warp	#warp_pab_dun12_084	3,3,pab_dun12.gat,192,181
pab_dun12.gat,311,219,0	warp	#warp_pab_dun12_085	3,3,pab_dun12.gat,322,143
pab_dun12.gat,316,143,0	warp	#warp_pab_dun12_086	3,3,pab_dun12.gat,305,219
pab_dun12.gat,349,143,0	warp	#warp_pab_dun12_087	3,3,pab_dun12.gat,132,29
pab_dun12.gat,126,29,0	warp	#warp_pab_dun12_088	3,3,pab_dun12.gat,343,143
pab_dun12.gat,159,29,0	warp	#warp_pab_dun12_089	3,3,pab_dun12.gat,170,333
pab_dun12.gat,164,333,0	warp	#warp_pab_dun12_090	3,3,pab_dun12.gat,153,29
pab_dun12.gat,197,333,0	warp	#warp_pab_dun12_091	3,3,pab_dun12.gat,18,29
pab_dun12.gat,12,29,0	warp	#warp_pab_dun12_092	3,3,pab_dun12.gat,191,333
pab_dun12.gat,45,29,0	warp	#warp_pab_dun12_093	3,3,pab_dun12.gat,18,219
pab_dun12.gat,12,219,0	warp	#warp_pab_dun12_094	3,3,pab_dun12.gat,39,29
pab_dun12.gat,45,219,0	warp	#warp_pab_dun12_095	3,3,pab_dun12.gat,208,67
pab_dun12.gat,202,67,0	warp	#warp_pab_dun12_096	3,3,pab_dun12.gat,39,219
pab_dun12.gat,235,67,0	warp	#warp_pab_dun12_097	3,3,pab_dun12.gat,170,372
pab_dun12.gat,164,372,0	warp	#warp_pab_dun12_098	3,3,pab_dun12.gat,229,67
pab_dun12.gat,180,168,0	warp	#warp_pab_dun12_099	3,3,pab_dun12.gat,370,305
pab_dun12.gat,370,311,0	warp	#warp_pab_dun12_100	3,3,pab_dun12.gat,180,173
pab_dun12.gat,370,282,0	warp	#warp_pab_dun12_101	3,3,pab_dun12.gat,28,115
pab_dun12.gat,28,121,0	warp	#warp_pab_dun12_102	3,3,pab_dun12.gat,370,286
pab_dun12.gat,218,54,0	warp	#warp_pab_dun12_103	3,3,pab_dun12.gat,142,153
pab_dun12.gat,142,159,0	warp	#warp_pab_dun12_104	3,3,pab_dun12.gat,218,58
pab_dun12.gat,142,130,0	warp	#warp_pab_dun12_105	3,3,pab_dun12.gat,218,39
pab_dun12.gat,218,45,0	warp	#warp_pab_dun12_106	3,3,pab_dun12.gat,142,134
pab_dun12.gat,45,105,0	warp	#warp_pab_dun12_107	3,3,pab_dun12.gat,322,181
pab_dun12.gat,316,181,0	warp	#warp_pab_dun12_108	3,3,pab_dun12.gat,39,105
pab_dun12.gat,349,181,0	warp	#warp_pab_dun12_109	3,3,pab_dun12.gat,94,29	139
pab_dun12.gat,88,29,0	warp	#warp_pab_dun12_110	3,3,pab_dun12.gat,344,181
pab_dun12.gat,121,29,0	warp	#warp_pab_dun12_111	3,3,pab_dun12.gat,360,333
pab_dun12.gat,354,333,0	warp	#warp_pab_dun12_112	3,3,pab_dun12.gat,115,29
pab_dun12.gat,387,333,0	warp	#warp_pab_dun12_113	3,3,pab_dun12.gat,246,67
pab_dun12.gat,240,67,0	warp	#warp_pab_dun12_114	3,3,pab_dun12.gat,381,333
pab_dun12.gat,273,67,0	warp	#warp_pab_dun12_115	3,3,pab_dun12.gat,56,257
pab_dun12.gat,50,257,0	warp	#warp_pab_dun12_116	3,3,pab_dun12.gat,267,67
pab_dun12.gat,83,257,0	warp	#warp_pab_dun12_117	3,3,pab_dun12.gat,94,105
pab_dun12.gat,88,105,0	warp	#warp_pab_dun12_118	3,3,pab_dun12.gat,77,257
pab_dun12.gat,121,105,0	warp	#warp_pab_dun12_119	3,3,pab_dun12.gat,208,29
pab_dun12.gat,202,29,0	warp	#warp_pab_dun12_120	3,3,pab_dun12.gat,115,105
pab_dun12.gat,235,29,0	warp	#warp_pab_dun12_121	3,3,pab_dun12.gat,94,295
pab_dun12.gat,88,295,0	warp	#warp_pab_dun12_122	3,3,pab_dun12.gat,229,29
pab_dun12.gat,104,92,0	warp	#warp_pab_dun12_123	3,3,pab_dun12.gat,218,343
pab_dun12.gat,218,349,0	warp	#warp_pab_dun12_124	3,3,pab_dun12.gat,104,96
pab_dun12.gat,218,320,0	warp	#warp_pab_dun12_125	3,3,pab_dun12.gat,256,39
pab_dun12.gat,256,45,0	warp	#warp_pab_dun12_126	3,3,pab_dun12.gat,218,324
pab_dun12.gat,255,16,0	warp	#warp_pab_dun12_127	3,3,pab_dun12.gat,332,381
pab_dun12.gat,332,387,0	warp	#warp_pab_dun12_128	3,3,pab_dun12.gat,256,20
pab_dun12.gat,104,282,0	warp	#warp_pab_dun12_129	3,3,pab_dun12.gat,66,153
pab_dun12.gat,66,159,0	warp	#warp_pab_dun12_130	3,3,pab_dun12.gat,104,286
pab_dun12.gat,66,130,0	warp	#warp_pab_dun12_131	3,3,pab_dun12.gat,218,115
pab_dun12.gat,218,121,0	warp	#warp_pab_dun12_132	3,3,pab_dun12.gat,66,134
pab_dun12.gat,218,92,0	warp	#warp_pab_dun12_133	3,3,pab_dun12.gat,104,229
pab_dun12.gat,104,235,0	warp	#warp_pab_dun12_134	3,3,pab_dun12.gat,218,96
pab_dun12.gat,387,257,0	warp	#warp_pab_dun12_135	3,3,pab_dun12.gat,322,219
pab_dun12.gat,316,219,0	warp	#warp_pab_dun12_136	3,3,pab_dun12.gat,382,257
pab_dun12.gat,349,219,0	warp	#warp_pab_dun12_137	3,3,pab_dun12.gat,56,67	167
pab_dun12.gat,50,67,0	warp	#warp_pab_dun12_138	3,3,pab_dun12.gat,343,219
pab_dun12.gat,83,67,0	warp	#warp_pab_dun12_139	3,3,pab_dun12.gat,208,257
pab_dun12.gat,202,257,0	warp	#warp_pab_dun12_140	3,3,pab_dun12.gat,77,67	170
pab_dun12.gat,235,257,0	warp	#warp_pab_dun12_141	3,3,pab_dun12.gat,246,105
pab_dun12.gat,240,105,0	warp	#warp_pab_dun12_142	3,3,pab_dun12.gat,229,257
pab_dun12.gat,273,105,0	warp	#warp_pab_dun12_143	3,3,pab_dun12.gat,208,181
pab_dun12.gat,202,181,0	warp	#warp_pab_dun12_144	3,3,pab_dun12.gat,267,105
pab_dun12.gat,235,181,0	warp	#warp_pab_dun12_145	3,3,pab_dun12.gat,246,29
pab_dun12.gat,240,29,0	warp	#warp_pab_dun12_146	3,3,pab_dun12.gat,229,181
pab_dun12.gat,349,372,0	warp	#warp_pab_dun12_147	3,3,pab_dun12.gat,246,295
pab_dun12.gat,240,295,0	warp	#warp_pab_dun12_148	3,3,pab_dun12.gat,345,372
pab_dun12.gat,273,295,0	warp	#warp_pab_dun12_149	3,3,pab_dun12.gat,94,219
pab_dun12.gat,88,219,0	warp	#warp_pab_dun12_150	3,3,pab_dun12.gat,267,295
pab_dun12.gat,121,219,0	warp	#warp_pab_dun12_151	3,3,pab_dun12.gat,246,257
pab_dun12.gat,240,257,0	warp	#warp_pab_dun12_152	3,3,pab_dun12.gat,115,219
pab_dun12.gat,273,257,0	warp	#warp_pab_dun12_153	3,3,pab_dun12.gat,56,333
pab_dun12.gat,50,333,0	warp	#warp_pab_dun12_154	3,3,pab_dun12.gat,267,257
pab_dun12.gat,370,244,0	warp	#warp_pab_dun12_155	3,3,pab_dun12.gat,104,267
pab_dun12.gat,104,273,0	warp	#warp_pab_dun12_156	3,3,pab_dun12.gat,370,248
pab_dun12.gat,104,244,0	warp	#warp_pab_dun12_157	3,3,pab_dun12.gat,256,343
pab_dun12.gat,256,349,0	warp	#warp_pab_dun12_158	3,3,pab_dun12.gat,104,248
pab_dun12.gat,256,319,0	warp	#warp_pab_dun12_159	3,3,pab_dun12.gat,66,115
pab_dun12.gat,66,121,0	warp	#warp_pab_dun12_160	3,3,pab_dun12.gat,256,325
pab_dun12.gat,66,92,0	warp	#warp_pab_dun12_161	3,3,pab_dun12.gat,256,382
pab_dun12.gat,256,387,0	warp	#warp_pab_dun12_162	3,3,pab_dun12.gat,66,96	192
pab_dun12.gat,256,358,0	warp	#warp_pab_dun12_163	3,3,pab_dun12.gat,142,267
pab_dun12.gat,142,273,0	warp	#warp_pab_dun12_164	3,3,pab_dun12.gat,256,362
pab_dun12.gat,142,244,0	warp	#warp_pab_dun12_165	3,3,pab_dun12.gat,370,229
pab_dun12.gat,370,235,0	warp	#warp_pab_dun12_166	3,3,pab_dun12.gat,142,248
pab_dun12.gat,370,206,0	warp	#warp_pab_dun12_167	3,3,pab_dun12.gat,218,381
pab_dun12.gat,218,387,0	warp	#warp_pab_dun12_168	3,3,pab_dun12.gat,370,210
pab_dun12.gat,256,281,0	warp	#warp_pab_dun12_169	3,3,pab_dun12.gat,218,229
pab_dun12.gat,218,235,0	warp	#warp_pab_dun12_170	3,3,pab_dun12.gat,256,285
pab_dun12.gat,218,206,0	warp	#warp_pab_dun12_171	3,3,pab_dun12.gat,66,40	201
pab_dun12.gat,66,45,0	warp	#warp_pab_dun12_172	3,3,pab_dun12.gat,218,210
pab_dun12.gat,66,16,0	warp	#warp_pab_dun12_173	3,3,pab_dun12.gat,142,381
pab_dun12.gat,142,387,0	warp	#warp_pab_dun12_174	3,3,pab_dun12.gat,66,20	204
pab_dun12.gat,294,320,0	warp	#warp_pab_dun12_175	3,3,pab_dun12.gat,218,305
pab_dun12.gat,218,311,0	warp	#warp_pab_dun12_176	3,3,pab_dun12.gat,294,324
pab_dun12.gat,218,282,0	warp	#warp_pab_dun12_177	3,3,pab_dun12.gat,180,78
pab_dun12.gat,180,83,0	warp	#warp_pab_dun12_178	3,3,pab_dun12.gat,218,286
pab_dun12.gat,273,372,0	warp	#warp_pab_dun12_179	3,3,pab_dun12.gat,284,105
pab_dun12.gat,278,105,0	warp	#warp_pab_dun12_180	3,3,pab_dun12.gat,267,372
pab_dun12.gat,311,105,0	warp	#warp_pab_dun12_181	3,3,pab_dun12.gat,360,372
pab_dun12.gat,354,372,0	warp	#warp_pab_dun12_182	3,3,pab_dun12.gat,305,105
pab_dun12.gat,387,372,0	warp	#warp_pab_dun12_183	3,3,pab_dun12.gat,18,143
pab_dun12.gat,12,143,0	warp	#warp_pab_dun12_184	3,3,pab_dun12.gat,381,372
pab_dun12.gat,45,143,0	warp	#warp_pab_dun12_185	3,3,pab_dun12.gat,18,181
pab_dun12.gat,12,181,0	warp	#warp_pab_dun12_186	3,3,pab_dun12.gat,39,143
pab_dun12.gat,45,181,0	warp	#warp_pab_dun12_187	3,3,pab_dun12.gat,169,67
pab_dun12.gat,164,67,0	warp	#warp_pab_dun12_188	3,3,pab_dun12.gat,39,181
pab_dun12.gat,197,67,0	warp	#warp_pab_dun12_189	3,3,pab_dun12.gat,170,105
pab_dun12.gat,164,105,0	warp	#warp_pab_dun12_190	3,3,pab_dun12.gat,185,67
pab_dun12.gat,197,105,0	warp	#warp_pab_dun12_191	3,3,pab_dun12.gat,18,257
pab_dun12.gat,12,257,0	warp	#warp_pab_dun12_192	3,3,pab_dun12.gat,191,105
pab_dun12.gat,45,257,0	warp	#warp_pab_dun12_193	3,3,pab_dun12.gat,132,372
pab_dun12.gat,126,372,0	warp	#warp_pab_dun12_194	3,3,pab_dun12.gat,39,257
pab_dun12.gat,387,48,0	warp	#warp_pab_dun12_195	3,3,pab_dun12.gat,94,333
pab_dun12.gat,88,333,0	warp	#warp_pab_dun12_196	3,3,pab_dun12.gat,381,48
pab_dun12.gat,121,333,0	warp	#warp_pab_dun12_197	3,3,pab_dun12.gat,322,333
pab_dun12.gat,316,333,0	warp	#warp_pab_dun12_198	3,3,pab_dun12.gat,115,333
pab_dun12.gat,349,333,0	warp	#warp_pab_dun12_199	3,3,pab_dun12.gat,284,333
pab_dun12.gat,278,333,0	warp	#warp_pab_dun12_200	3,3,pab_dun12.gat,343,333
pab_dun12.gat,235,372,0	warp	#warp_pab_dun12_201	3,3,pab_dun12.gat,246,143
pab_dun12.gat,240,143,0	warp	#warp_pab_dun12_202	3,3,pab_dun12.gat,229,372
pab_dun12.gat,273,143,0	warp	#warp_pab_dun12_203	3,3,pab_dun12.gat,18,372
pab_dun12.gat,12,372,0	warp	#warp_pab_dun12_204	3,3,pab_dun12.gat,267,143
pab_dun12.gat,104,358,0	warp	#warp_pab_dun12_205	3,3,pab_dun12.gat,294,39
pab_dun12.gat,294,45,0	warp	#warp_pab_dun12_206	3,3,pab_dun12.gat,104,364
