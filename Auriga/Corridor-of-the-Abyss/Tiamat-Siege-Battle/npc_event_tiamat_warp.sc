//= Auriga Script ==============================================================
// Ragnarok Online Tiamat Siege Battle Warp Method Script	by refis
//==============================================================================

1_tiamat_00.gat,192,176,0	script	area00#r01	45,2,2,{
	if($@tiamat_main == 0)
		warp "1_tiamat_00.gat",193,170;
	else if($@tiamat_main == 1)	// �u���v��
		warp "1_tiamat_55.gat",287,150;
	else if($@tiamat_main == 2)	// �u�n���ՋV��v�̑O��
		warp "1_tiamat_35.gat",94,164;
	else if($@tiamat_main == 3)	// �u�[���̉����v�̑O��
		warp "2_tiamat_00.gat",49,35;
	else if($@tiamat_main == 4)	// �u�閧�̕����v��
		warp "3_tiamat_00.gat",155,73;
	end;
}

1_tiamat_01.gat,102,193,0	warp	area#r731	2,2,1_tiamat_08.gat,270,389	//69
1_tiamat_02.gat,273,114,0	warp	area#r611	2,2,1_tiamat_58.gat,74,288	//76
1_tiamat_02.gat,265,141,0	warp	area#r612	2,2,1_tiamat_14.gat,90,67	//77
1_tiamat_02.gat,30,240,0	warp	area#r831	2,2,1_tiamat_42.gat,41,269	//78
1_tiamat_02.gat,47,260,0	warp	area#r832	2,2,1_tiamat_02.gat,149,10	//79
1_tiamat_02.gat,149,5,0	warp	area#r841	2,2,1_tiamat_02.gat,47,255	//80
1_tiamat_02.gat,94,46,0	warp	area#r842	2,2,1_tiamat_02.gat,100,291	//81
1_tiamat_02.gat,94,79,0	warp	area#r843	2,2,1_tiamat_20.gat,175,277	//82
1_tiamat_02.gat,203,45,0	warp	area#r844	2,2,1_tiamat_02.gat,239,50	//83
1_tiamat_02.gat,203,80,0	warp	area#r845	2,2,1_tiamat_42.gat,110,321	//84
1_tiamat_02.gat,234,50,0	warp	area#r851	2,2,1_tiamat_02.gat,198,45	//85
1_tiamat_02.gat,105,291,0	warp	area#r861	2,2,1_tiamat_02.gat,99,46	//86
1_tiamat_02.gat,143,222,0	warp	area#r921	2,2,1_tiamat_58.gat,56,60	//87
1_tiamat_02.gat,192,214,0	warp	area#r941	2,2,1_tiamat_58.gat,56,27	//88
1_tiamat_02.gat,150,171,0	warp	area#r961	2,2,1_tiamat_37.gat,99,106	//89
1_tiamat_02.gat,260,203,0	warp	area#r1471	2,2,1_tiamat_31.gat,63,93	//90
1_tiamat_02.gat,143,222,0	script	area#k921	45,2,2,{/* 91 */}
1_tiamat_02.gat,192,214,0	script	area#k941	45,2,2,{/* 92 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_02.gat,149,5,0		script	area#k841	45,2,2,{/* 93 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_02.gat,47,260,0	script	area#k832	45,2,2,{/* 94 */}
1_tiamat_02.gat,265,141,0	script	area#k612	45,2,2,{/* 95 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_02.gat,260,203,0	script	area#k1471	45,2,2,{/* 96 */}
1_tiamat_03.gat,120,326,0	warp	area#r631	2,2,1_tiamat_41.gat,21,79	//130
1_tiamat_03.gat,279,327,0	warp	area#r781	2,2,1_tiamat_22.gat,106,108	//131
1_tiamat_04.gat,142,169,0	warp	area#r1811	2,2,1_tiamat_52.gat,139,270	//144
1_tiamat_04.gat,142,205,0	warp	area#r1812	2,2,1_tiamat_04.gat,184,102	//145
1_tiamat_04.gat,70,25,0	warp	area#r1821	2,2,1_tiamat_52.gat,47,229	//146
1_tiamat_04.gat,69,55,0	warp	area#r1822	2,2,1_tiamat_52.gat,139,209	//147
1_tiamat_04.gat,66,42,0	warp	area#r1823	2,2,1_tiamat_35.gat,134,161	//148
1_tiamat_04.gat,14,36,0	warp	area#r1831	2,2,1_tiamat_54.gat,59,126	//149
1_tiamat_04.gat,14,62,0	warp	area#r1832	2,2,1_tiamat_53.gat,232,194	//150
1_tiamat_04.gat,184,97,0	warp	area#r1841	2,2,1_tiamat_04.gat,142,200	//151
1_tiamat_04.gat,184,134,0	warp	area#r1842	2,2,1_tiamat_35.gat,94,161	//152
1_tiamat_04.gat,14,36,0	script	area#k1831	45,2,2,{/* 153 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_04.gat,142,205,0	script	area#k1812	45,2,2,{/* 154 */}
1_tiamat_05.gat,34,47,0	warp	area#r121	2,2,1_tiamat_38.gat,90,103	//171
1_tiamat_05.gat,25,37,0	warp	area#r122	2,2,1_tiamat_26.gat,130,107	//172
1_tiamat_05.gat,33,120,0	warp	area#r131	2,2,1_tiamat_13.gat,89,37	//173
1_tiamat_05.gat,42,129,0	warp	area#r132	2,2,1_tiamat_26.gat,131,53	//174
1_tiamat_05.gat,111,48,0	warp	area#r1271	2,2,1_tiamat_63.gat,258,246	//175
1_tiamat_05.gat,121,38,0	warp	area#r1272	2,2,1_tiamat_53.gat,120,238	//176
1_tiamat_05.gat,33,120,0	script	area#k131	45,2,2,{/* 177 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_05.gat,25,37,0		script	area#k122	45,2,2,{/* 178 */}
1_tiamat_05.gat,111,48,0	script	area#k1271	45,2,2,{/* 179 */}
1_tiamat_05.gat,42,129,0	script	area#k132	45,2,2,{/* 180 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_06.gat,222,42,0	warp	area#r1401	2,2,1_tiamat_12.gat,168,209	//189
1_tiamat_07.gat,16,89,0	warp	area#r1851	2,2,1_tiamat_35.gat,102,164	//196
1_tiamat_07.gat,16,89,0		script	area#k1851	45,2,2,{/* 197 */}
1_tiamat_08.gat,12,309,0	warp	area#r351	2,2,1_tiamat_08.gat,132,270	//205
1_tiamat_08.gat,53,270,0	warp	area#r352	2,2,1_tiamat_60.gat,76,61	//206
1_tiamat_08.gat,96,309,0	warp	area#r361	2,2,1_tiamat_08.gat,220,270	//207
1_tiamat_08.gat,137,270,0	warp	area#r362	2,2,1_tiamat_08.gat,12,304	//208
1_tiamat_08.gat,88,271,0	warp	area#r363	2,2,1_tiamat_12.gat,180,41	//209
1_tiamat_08.gat,184,309,0	warp	area#r371	2,2,1_tiamat_57.gat,74,71	//210
1_tiamat_08.gat,225,270,0	warp	area#r372	2,2,1_tiamat_08.gat,96,304	//211
1_tiamat_08.gat,176,271,0	warp	area#r373	2,2,1_tiamat_45.gat,34,9	//212
1_tiamat_08.gat,12,222,0	warp	area#r481	2,2,1_tiamat_08.gat,132,183	//213
1_tiamat_08.gat,96,222,0	warp	area#r491	2,2,1_tiamat_08.gat,220,183	//214
1_tiamat_08.gat,137,183,0	warp	area#r492	2,2,1_tiamat_08.gat,12,217	//215
1_tiamat_08.gat,121,213,0	warp	area#r493	2,2,1_tiamat_12.gat,90,30	//216
1_tiamat_08.gat,129,191,0	warp	area#r494	2,2,1_tiamat_12.gat,232,52	//217
1_tiamat_08.gat,184,222,0	warp	area#r501	2,2,1_tiamat_57.gat,57,167	//218
1_tiamat_08.gat,225,183,0	warp	area#r502	2,2,1_tiamat_08.gat,96,217	//219
1_tiamat_08.gat,209,213,0	warp	area#r503	2,2,1_tiamat_45.gat,13,23	//220
1_tiamat_08.gat,217,191,0	warp	area#r504	2,2,1_tiamat_45.gat,24,10	//221
1_tiamat_08.gat,12,138,0	warp	area#r521	2,2,1_tiamat_08.gat,132,99	//222
1_tiamat_08.gat,53,99,0	warp	area#r522	2,2,1_tiamat_13.gat,74,34	//223
1_tiamat_08.gat,96,138,0	warp	area#r531	2,2,1_tiamat_08.gat,220,99	//224
1_tiamat_08.gat,137,99,0	warp	area#r532	2,2,1_tiamat_08.gat,12,133	//225
1_tiamat_08.gat,88,130,0	warp	area#r533	2,2,1_tiamat_58.gat,168,288	//226
1_tiamat_08.gat,88,98,0	warp	area#r534	2,2,1_tiamat_12.gat,218,87	//227
1_tiamat_08.gat,184,138,0	warp	area#r541	2,2,1_tiamat_57.gat,142,222	//228
1_tiamat_08.gat,225,99,0	warp	area#r542	2,2,1_tiamat_08.gat,96,133	//229
1_tiamat_08.gat,176,130,0	warp	area#r543	2,2,1_tiamat_48.gat,14,17	//230
1_tiamat_08.gat,176,98,0	warp	area#r544	2,2,1_tiamat_45.gat,13,80	//231
1_tiamat_08.gat,12,51,0	warp	area#r651	2,2,1_tiamat_08.gat,132,13	//232
1_tiamat_08.gat,53,13,0	warp	area#r652	2,2,1_tiamat_25.gat,28,144	//233
1_tiamat_08.gat,4,12,0	warp	area#r653	2,2,1_tiamat_22.gat,153,33	//234
1_tiamat_08.gat,96,51,0	warp	area#r661	2,2,1_tiamat_08.gat,220,13	//235
1_tiamat_08.gat,137,13,0	warp	area#r662	2,2,1_tiamat_08.gat,12,46	//236
1_tiamat_08.gat,88,12,0	warp	area#r663	2,2,1_tiamat_56.gat,230,119	//237
1_tiamat_08.gat,96,4,0	warp	area#r664	2,2,1_tiamat_56.gat,120,93	//238
1_tiamat_08.gat,184,51,0	warp	area#r671	2,2,1_tiamat_57.gat,223,167	//239
1_tiamat_08.gat,225,13,0	warp	area#r672	2,2,1_tiamat_08.gat,96,46	//240
1_tiamat_08.gat,176,12,0	warp	area#r673	2,2,1_tiamat_49.gat,72,285	//241
1_tiamat_08.gat,183,4,0	warp	area#r674	2,2,1_tiamat_49.gat,93,262	//242
1_tiamat_08.gat,12,393,0	warp	area#r691	2,2,1_tiamat_08.gat,132,355	//243
1_tiamat_08.gat,96,393,0	warp	area#r701	2,2,1_tiamat_08.gat,219,355	//244
1_tiamat_08.gat,137,355,0	warp	area#r702	2,2,1_tiamat_08.gat,12,388	//245
1_tiamat_08.gat,88,354,0	warp	area#r703	2,2,1_tiamat_12.gat,119,91	//246
1_tiamat_08.gat,184,393,0	warp	area#r711	2,2,1_tiamat_08.gat,304,355	//247
1_tiamat_08.gat,225,355,0	warp	area#r712	2,2,1_tiamat_08.gat,96,388	//248
1_tiamat_08.gat,176,354,0	warp	area#r713	2,2,1_tiamat_48.gat,62,68	//249
1_tiamat_08.gat,270,393,0	warp	area#r721	2,2,1_tiamat_01.gat,102,188	//250
1_tiamat_08.gat,311,355,0	warp	area#r722	2,2,1_tiamat_08.gat,184,388	//251
1_tiamat_08.gat,355,393,0	warp	area#r1711	2,2,1_tiamat_08.gat,390,270	//252
1_tiamat_08.gat,395,355,0	warp	area#r1712	2,2,1_tiamat_39.gat,12,174	//253
1_tiamat_08.gat,346,386,0	warp	area#r1713	2,2,1_tiamat_54.gat,35,50	//254
1_tiamat_08.gat,355,309,0	warp	area#r1721	2,2,1_tiamat_08.gat,390,183	//255
1_tiamat_08.gat,395,270,0	warp	area#r1722	2,2,1_tiamat_08.gat,355,388	//256
1_tiamat_08.gat,355,221,0	warp	area#r1731	2,2,1_tiamat_10.gat,96,72	//257
1_tiamat_08.gat,395,183,0	warp	area#r1732	2,2,1_tiamat_08.gat,355,304	//258
1_tiamat_08.gat,53,13,0		script	area#k652	45,2,2,{/* 259 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,96,51,0		script	area#k661	45,2,2,{/* 260 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,225,13,0	script	area#k672	45,2,2,{/* 261 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,96,4,0		script	area#k664	45,2,2,{/* 262 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,176,271,0	script	area#k373	45,2,2,{/* 263 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,217,191,0	script	area#k504	45,2,2,{/* 264 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,209,213,0	script	area#k503	45,2,2,{/* 265 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,176,98,0	script	area#k544	45,2,2,{/* 266 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,88,354,0	script	area#k703	45,2,2,{/* 267 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,53,99,0		script	area#k522	45,2,2,{/* 268 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,88,130,0	script	area#k533	45,2,2,{/* 269 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_08.gat,88,271,0	script	area#k363	45,2,2,{/* 270 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_09.gat,97,63,0	warp	area#r811	2,2,1_tiamat_42.gat,60,217	//334
1_tiamat_09.gat,200,55,0	warp	area#r821	2,2,1_tiamat_42.gat,124,218	//335
1_tiamat_09.gat,216,143,0	warp	area#r1181	2,2,1_tiamat_43.gat,135,80	//336
1_tiamat_10.gat,101,72,0	warp	area#r1741	2,2,1_tiamat_08.gat,355,216	//344
1_tiamat_11.gat,219,71,0	warp	area#r2001	2,2,1_tiamat_26.gat,230,175	//355
1_tiamat_11.gat,219,71,0	script	area#k2001	45,2,2,{/* 356 */}
1_tiamat_12.gat,8,224,0	warp	area#r1331	2,2,1_tiamat_12.gat,8,214	//361
1_tiamat_12.gat,44,224,0	warp	area#r1341	2,2,1_tiamat_12.gat,44,214	//362
1_tiamat_12.gat,80,224,0	warp	area#r1351	2,2,1_tiamat_12.gat,80,214	//363
1_tiamat_12.gat,116,224,0	warp	area#r1361	2,2,1_tiamat_12.gat,116,214	//364
1_tiamat_12.gat,152,224,0	warp	area#r1371	2,2,1_tiamat_12.gat,152,214	//365
1_tiamat_12.gat,188,224,0	warp	area#r1381	2,2,1_tiamat_12.gat,188,214	//366
1_tiamat_12.gat,224,224,0	warp	area#r1391	2,2,1_tiamat_12.gat,224,214	//367
1_tiamat_12.gat,8,218,0	warp	area#r1411	2,2,1_tiamat_12.gat,8,228	//368
1_tiamat_12.gat,44,218,0	warp	area#r1412	2,2,1_tiamat_12.gat,44,228	//369
1_tiamat_12.gat,79,218,0	warp	area#r1413	2,2,1_tiamat_12.gat,79,228	//370
1_tiamat_12.gat,116,218,0	warp	area#r1414	2,2,1_tiamat_12.gat,116,228	//371
1_tiamat_12.gat,152,218,0	warp	area#r1415	2,2,1_tiamat_12.gat,152,228	//372
1_tiamat_12.gat,188,218,0	warp	area#r1416	2,2,1_tiamat_12.gat,188,228	//373
1_tiamat_12.gat,223,218,0	warp	area#r1417	2,2,1_tiamat_12.gat,223,228	//374
1_tiamat_12.gat,58,198,0	warp	area#r1418	2,2,1_tiamat_25.gat,184,28	//375
1_tiamat_12.gat,168,204,0	warp	area#r1419	2,2,1_tiamat_06.gat,217,42	//376
1_tiamat_12.gat,183,41,0	warp	area#r191	2,2,1_tiamat_08.gat,94,271	//377
1_tiamat_12.gat,87,34,0	warp	area#r192	2,2,1_tiamat_08.gat,115,213	//378
1_tiamat_12.gat,232,47,0	warp	area#r201	2,2,1_tiamat_08.gat,129,187	//379
1_tiamat_12.gat,218,92,0	warp	area#r202	2,2,1_tiamat_08.gat,93,98	//380
1_tiamat_12.gat,119,96,0	warp	area#r221	2,2,1_tiamat_08.gat,93,354	//381
1_tiamat_12.gat,119,96,0	script	area#k221	45,2,2,{/* 382 */}
1_tiamat_12.gat,183,41,0	script	area#k191	45,2,2,{/* 383 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_13.gat,141,84,0	warp	area#r41	2,2,1_tiamat_50.gat,112,133	//429
1_tiamat_13.gat,95,57,0	warp	area#r42	2,2,1_tiamat_40.gat,56,33	//430
1_tiamat_13.gat,78,46,0	warp	area#r43	2,2,1_tiamat_44.gat,100,61	//431
1_tiamat_13.gat,91,34,0	warp	area#r44	2,2,1_tiamat_05.gat,33,115	//432
1_tiamat_13.gat,69,33,0	warp	area#r45	2,2,1_tiamat_08.gat,48,99	//433
1_tiamat_13.gat,91,34,0	script	area#k44	45,2,2,{/* 434 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_13.gat,69,33,0	script	area#k45	45,2,2,{/* 435 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_14.gat,39,7,0	warp	area#r561	2,2,1_tiamat_29.gat,259,202	//443
1_tiamat_14.gat,31,28,0	warp	area#r562	2,2,1_tiamat_14.gat,20,70	//444
1_tiamat_14.gat,25,70,0	warp	area#r571	2,2,1_tiamat_14.gat,31,23	//445
1_tiamat_14.gat,9,66,0	warp	area#r572	2,2,1_tiamat_56.gat,120,230	//446
1_tiamat_14.gat,52,67,0	warp	area#r573	2,2,1_tiamat_56.gat,120,9	//447
1_tiamat_14.gat,85,67,0	warp	area#r601	2,2,1_tiamat_02.gat,269,141	//448
1_tiamat_14.gat,85,67,0		script	area#k601	45,2,2,{/* 449 */}
1_tiamat_15.gat,157,68,0	warp	area#r1041	2,2,1_tiamat_42.gat,164,171	//458
1_tiamat_15.gat,157,68,0	script	area#k1041	45,2,2,{/* 459 */}
1_tiamat_17.gat,60,91,0		warp	area#r451	2,2,1_tiamat_56.gat,119,151	//470
1_tiamat_17.gat,52,9,0	warp	area#r452	2,2,1_tiamat_56.gat,88,119	//471
1_tiamat_17.gat,60,91,0	script	area#k451	45,2,2,{/* 472 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_18.gat,49,11,0	warp	area#r461	2,2,1_tiamat_46.gat,80,159	//481
1_tiamat_18.gat,49,89,0	warp	area#r462	2,2,1_tiamat_46.gat,93,170	//482
1_tiamat_18.gat,49,11,0	script	area#k461	45,2,2,{/* 483 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_18.gat,49,89,0	script	area#k462	45,2,2,{/* 484 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_20.gat,180,277,0	warp	area#r871	2,2,1_tiamat_02.gat,99,79	//499
1_tiamat_20.gat,232,175,0	warp	area#r1141	2,2,1_tiamat_43.gat,148,191	//500
1_tiamat_20.gat,274,175,0	warp	area#r1151	2,2,1_tiamat_43.gat,148,167	//501
1_tiamat_22.gat,156,93,0	warp	area#r181	2,2,1_tiamat_38.gat,84,95	//507
1_tiamat_22.gat,153,28,0	warp	area#r182	2,2,1_tiamat_08.gat,9,12	//508
1_tiamat_22.gat,158,153,0	warp	area#r751	2,2,1_tiamat_33.gat,271,291	//509
1_tiamat_22.gat,158,171,0	warp	area#r752	2,2,1_tiamat_22.gat,41,94	//510
1_tiamat_22.gat,41,89,0		warp	area#r761	2,2,1_tiamat_22.gat,158,166	//511
1_tiamat_22.gat,62,90,0		warp	area#r762	2,2,1_tiamat_22.gat,116,107	//512
1_tiamat_22.gat,52,105,0	warp	area#r763	2,2,1_tiamat_35.gat,125,163	//513
1_tiamat_22.gat,118,112,0	warp	area#r771	2,2,1_tiamat_22.gat,62,95	//514
1_tiamat_22.gat,106,113,0	warp	area#r772	2,2,1_tiamat_03.gat,279,332	//515
1_tiamat_22.gat,112,100,0	warp	area#r773	2,2,1_tiamat_49.gat,41,286	//516
1_tiamat_22.gat,52,105,0	script	area#k763	45,2,2,{/* 517 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,165,159,0	warp	area#r1941	2,2,1_tiamat_23.gat,175,159	//530
1_tiamat_23.gat,155,130,0	warp	area#r1951	2,2,1_tiamat_23.gat,155,118	//531
1_tiamat_23.gat,130,133,0	warp	area#r1961	2,2,1_tiamat_23.gat,119,133	//532
1_tiamat_23.gat,137,165,0	warp	area#r1971	2,2,1_tiamat_23.gat,136,177	//533
1_tiamat_23.gat,229,147,0	warp	area#r1981	2,2,1_tiamat_39.gat,28,128	//534
1_tiamat_23.gat,65,147,0	warp	area#r1982	2,2,1_tiamat_39.gat,95,182	//535
1_tiamat_23.gat,170,159,0	warp	area#r1983	2,2,1_tiamat_23.gat,160,159	//536
1_tiamat_23.gat,155,123,0	warp	area#r1984	2,2,1_tiamat_23.gat,155,135	//537
1_tiamat_23.gat,124,133,0	warp	area#r1985	2,2,1_tiamat_23.gat,135,133	//538
1_tiamat_23.gat,136,172,0	warp	area#r1986	2,2,1_tiamat_23.gat,142,165	//539
1_tiamat_23.gat,106,195,0	warp	area#r1987	2,2,1_tiamat_26.gat,173,175	//540
1_tiamat_23.gat,165,159,0	script	area#k1941	45,2,2,{/* 541 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,155,130,0	script	area#k1951	45,2,2,{/* 542 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,130,133,0	script	area#k1961	45,2,2,{/* 543 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,137,165,0	script	area#k1971	45,2,2,{/* 544 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,170,159,0	script	area#k1983	45,2,2,{/* 545 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,155,123,0	script	area#k1984	45,2,2,{/* 546 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,124,133,0	script	area#k1985	45,2,2,{/* 547 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_23.gat,136,172,0	script	area#k1986	45,2,2,{/* 548 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_25.gat,23,144,0	warp	area#r641	2,2,1_tiamat_08.gat,48,13	//575
1_tiamat_25.gat,52,127,0	warp	area#r642	2,2,1_tiamat_25.gat,150,15	//576
1_tiamat_25.gat,150,10,0	warp	area#r1321	2,2,1_tiamat_25.gat,52,132	//577
1_tiamat_25.gat,184,33,0	warp	area#r1322	2,2,1_tiamat_12.gat,58,203	//578
1_tiamat_25.gat,23,144,0	script	area#k641	45,2,2,{/* 579 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_26.gat,122,146,0	warp	area#r1251	2,2,1_tiamat_26.gat,90,87	//587
1_tiamat_26.gat,90,99,0		warp	area#r1252	2,2,1_tiamat_33.gat,260,278	//588
1_tiamat_26.gat,47,61,0		warp	area#r1281	2,2,1_tiamat_63.gat,223,246	//589
1_tiamat_26.gat,136,53,0	warp	area#r1282	2,2,1_tiamat_05.gat,42,124	//590
1_tiamat_26.gat,68,225,0	warp	area#r1291	2,2,1_tiamat_36.gat,35,39	//591
1_tiamat_26.gat,67,150,0	warp	area#r1292	2,2,1_tiamat_63.gat,255,266	//592
1_tiamat_26.gat,47,93,0		warp	area#r1301	2,2,1_tiamat_63.gat,271,245	//593
1_tiamat_26.gat,130,112,0	warp	area#r1302	2,2,1_tiamat_05.gat,30,37	//594
1_tiamat_26.gat,90,92,0		warp	area#r1303	2,2,1_tiamat_26.gat,117,146	//595
1_tiamat_26.gat,168,175,0	warp	area#r1991	2,2,1_tiamat_23.gat,106,190	//596
1_tiamat_26.gat,235,175,0	warp	area#r1992	2,2,1_tiamat_11.gat,219,66	//597
1_tiamat_26.gat,47,93,0		script	area#k1301	45,2,2,{/* 598 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_26.gat,130,112,0	script	area#k1302	45,2,2,{/* 599 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_26.gat,90,92,0		script	area#k1303	45,2,2,{/* 600 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_26.gat,122,146,0	script	area#k1251	45,2,2,{/* 601 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_26.gat,68,225,0	script	area#k1291	45,2,2,{/* 602 */}
1_tiamat_26.gat,67,150,0	script	area#k1292	45,2,2,{/* 603 */}
1_tiamat_26.gat,235,175,0	script	area#k1992	45,2,2,{/* 604 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_29.gat,131,207,0	warp	area#r31	2,2,1_tiamat_50.gat,152,139	//640
1_tiamat_29.gat,182,246,0	warp	area#r32	2,2,1_tiamat_34.gat,238,173	//641
1_tiamat_29.gat,264,202,0	warp	area#r33	2,2,1_tiamat_14.gat,39,12	//642
1_tiamat_29.gat,246,138,0	warp	area#r34	2,2,1_tiamat_31.gat,20,92	//643
1_tiamat_29.gat,191,172,0	warp	area#r35	2,2,1_tiamat_40.gat,15,25	//644
1_tiamat_29.gat,255,258,0	warp	area#r101	2,2,1_tiamat_36.gat,18,38	//645
1_tiamat_29.gat,182,246,0	script	area#k32	45,2,2,{/* 646 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_29.gat,191,172,0	script	area#k35	45,2,2,{/* 647 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_29.gat,246,138,0	script	area#k34	45,2,2,{/* 648 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_29.gat,131,207,0	script	area#k31	45,2,2,{/* 649 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_30.gat,79,32,0		warp	area#r1511	2,2,1_tiamat_31.gat,264,81	//661
1_tiamat_30.gat,79,70,0		warp	area#r1512	2,2,1_tiamat_56.gat,117,176	//662
1_tiamat_30.gat,79,70,0		script	area#k1512	45,2,2,{/* 663 */}
1_tiamat_31.gat,15,92,0		warp	area#r1421	2,2,1_tiamat_29.gat,246,143	//668
1_tiamat_31.gat,35,98,0		script	area#r1422	45,2,2,{/* 669 */
	if(getiteminfo(getequipid(4),16) != 1 && getiteminfo(getequipid(4),16) != 8) {
		pushpc 8,5;
		misceffect 182,""; //self
		misceffect 52,""; //self
		misceffect 257,""; //self
		unittalk getcharid(3),strcharinfo(0)+" : ���E��ʂ蔲����ɂ́u�Z���E�݊�v�̑������K�v���c�c�B",1;
		end;
	}
	warp "1_tiamat_31.gat",204,284;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 213;
	end;
}
1_tiamat_31.gat,35,87,0		script	area#r1423	45,2,2,{/* 670 */
	if(getiteminfo(getequipid(4),16) != 3 && getiteminfo(getequipid(4),16) != 5) {
		pushpc 4,5;
		misceffect 182,""; //self
		misceffect 52,""; //self
		misceffect 257,""; //self
		unittalk getcharid(3),strcharinfo(0)+" : ���E��ʂ蔲����ɂ́u���茕�E���葄�v�̑������K�v���c�c�B",1;
		end;
	}
	warp "1_tiamat_31.gat",148,186;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 213;
	end;
}
1_tiamat_31.gat,63,87,0		script	area#r1424	45,2,2,{/* 671 (hide)*/
	if(getiteminfo(getequipid(4),16) != 10 && getiteminfo(getequipid(4),16) != 23 && getiteminfo(getequipid(4),16) != 15) {
		pushpc 4,5;
		misceffect 182,""; //self
		misceffect 52,""; //self
		misceffect 257,""; //self
		unittalk getcharid(3),strcharinfo(0)+" : ���E��ʂ蔲����ɂ́u�Ў��E�����E�{�v�̑������K�v���c�c�B",1;
		end;
	}
	warp "1_tiamat_31.gat",204,186;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 213;
	end;
}
1_tiamat_31.gat,90,87,0		script	area#r1425	45,2,2,{/* 672 (hide)*/
	if(getiteminfo(getequipid(4),16) < 16 || getiteminfo(getequipid(4),16) > 22) {
		pushpc 4,5;
		misceffect 182,""; //self
		misceffect 52,""; //self
		misceffect 257,""; //self
		unittalk getcharid(3),strcharinfo(0)+" : ���E��ʂ蔲����ɂ́u�J�^�[���E�e�E�����藠���v�̑������K�v���c�c�B",1;
		end;
	}
	warp "1_tiamat_31.gat",260,186;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 213;
	end;
}
1_tiamat_31.gat,91,101,0	warp	area#r1426	2,2,1_tiamat_31.gat,282,65	//673
1_tiamat_31.gat,63,97,0		warp	area#r1427	2,2,1_tiamat_02.gat,265,203	//674
1_tiamat_31.gat,204,279,0	warp	area#r1431	2,2,1_tiamat_31.gat,35,93	//675
1_tiamat_31.gat,148,191,0	warp	area#r1441	2,2,1_tiamat_31.gat,35,92	//676
1_tiamat_31.gat,204,191,0	warp	area#r1451	2,2,1_tiamat_31.gat,63,92	//677
1_tiamat_31.gat,260,191,0	warp	area#r1461	2,2,1_tiamat_31.gat,90,91	//678
1_tiamat_31.gat,282,60,0	warp	area#r1481	2,2,1_tiamat_31.gat,91,96	//679
1_tiamat_31.gat,248,68,0	warp	area#r1482	2,2,1_tiamat_31.gat,27,37	//680
1_tiamat_31.gat,222,68,0	warp	area#r1483	2,2,1_tiamat_31.gat,88,278	//681
1_tiamat_31.gat,269,82,0	warp	area#r1484	2,2,1_tiamat_30.gat,79,37	//682
1_tiamat_31.gat,27,42,0		warp	area#r1491	2,2,1_tiamat_31.gat,248,63	//683
1_tiamat_31.gat,88,273,0	warp	area#r1501	2,2,1_tiamat_31.gat,222,63	//684
1_tiamat_31.gat,282,60,0	script	area#k1481	45,2,2,{/* 685 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_31.gat,248,68,0	script	area#k1482	45,2,2,{/* 686 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_31.gat,27,42,0		script	area#k1491	45,2,2,{/* 687 */}
1_tiamat_31.gat,91,101,0	script	area#k1426	45,2,2,{/* 688 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_31.gat,15,92,0		script	area#k1421	45,2,2,{/* 689 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_31.gat,63,97,0		script	area#k1427	45,2,2,{/* 690 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_32.gat,32,128,0	warp	area#r981	2,2,1_tiamat_37.gat,136,73	//719
1_tiamat_32.gat,27,189,0	warp	area#r1571	2,2,1_tiamat_42.gat,168,342	//720
1_tiamat_32.gat,22,167,0	warp	area#r1572	2,2,1_tiamat_51.gat,339,115	//721
1_tiamat_32.gat,45,168,0	warp	area#r1573	2,2,1_tiamat_38.gat,89,115	//722
1_tiamat_32.gat,27,189,0	script	area#k1571	45,2,2,{/* 723 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_32.gat,45,168,0	script	area#k1573	45,2,2,{/* 724 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_33.gat,279,291,0	warp	area#r741	2,2,1_tiamat_22.gat,158,158	//746
1_tiamat_33.gat,255,278,0	warp	area#r742	2,2,1_tiamat_26.gat,95,99	//747
1_tiamat_34.gat,108,26,0	warp	area#r931	2,2,1_tiamat_58.gat,43,72	//755
1_tiamat_34.gat,269,212,0	warp	area#r1131	2,2,1_tiamat_43.gat,148,143	//756
1_tiamat_34.gat,238,169,0	warp	area#r1521	2,2,1_tiamat_29.gat,182,241	//757
1_tiamat_34.gat,231,182,0	warp	area#r1522	2,2,1_tiamat_34.gat,211,200	//758
1_tiamat_34.gat,232,200,0	warp	area#r1523	2,2,1_tiamat_34.gat,211,182	//759
1_tiamat_34.gat,254,212,0	warp	area#r1524	2,2,1_tiamat_34.gat,238,149	//760
1_tiamat_34.gat,236,219,0	warp	area#r1525	2,2,1_tiamat_51.gat,375,114	//761
1_tiamat_34.gat,216,200,0	warp	area#r1531	2,2,1_tiamat_34.gat,236,182	//762
1_tiamat_34.gat,216,182,0	warp	area#r1541	2,2,1_tiamat_34.gat,236,200	//763
1_tiamat_34.gat,238,154,0	warp	area#r1551	2,2,1_tiamat_34.gat,249,212	//764
1_tiamat_34.gat,238,169,0	script	area#k1521	45,2,2,{/* 765 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_34.gat,236,219,0	script	area#k1525	45,2,2,{/* 766 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_35.gat,159,163,0	warp	area#r1061	2,2,1_tiamat_42.gat,273,163	//786
1_tiamat_35.gat,170,160,0	warp	area#r1062	2,2,1_tiamat_35.gat,51,164	//787
1_tiamat_35.gat,120,163,0	warp	area#r1071	2,2,1_tiamat_22.gat,52,100	//788
1_tiamat_35.gat,134,156,0	warp	area#r1072	2,2,1_tiamat_04.gat,69,39	//789
1_tiamat_35.gat,149,163,0	warp	area#r1073	2,2,1_tiamat_42.gat,268,171	//790
1_tiamat_35.gat,53,159,0	warp	area#r1211	2,2,1_tiamat_35.gat,170,165	//791
1_tiamat_35.gat,69,163,0	warp	area#r1212	2,2,1_tiamat_42.gat,55,167	//792
1_tiamat_35.gat,94,156,0	warp	area#r1871	2,2,1_tiamat_04.gat,184,129	//793
1_tiamat_35.gat,107,164,0	warp	area#r1872	2,2,1_tiamat_07.gat,16,94	//794
1_tiamat_35.gat,94,183,0	warp	area#r1873	2,2,2_tiamat_01.gat,196,37	//795
1_tiamat_35.gat,159,163,0	script	area#k1061	45,2,2,{/* 796 */}
1_tiamat_35.gat,120,163,0	script	area#k1071	45,2,2,{/* 797 */}
1_tiamat_35.gat,107,164,0	script	area#k1872	45,2,2,{/* 798 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_35.gat,94,183,0	script	area#k1873	45,2,2,{/* 799 (hide)*/ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_36.gat,23,38,0		warp	area#r111	2,2,1_tiamat_29.gat,255,253	//813
1_tiamat_36.gat,40,39,0		warp	area#r112	2,2,1_tiamat_26.gat,68,220	//814
1_tiamat_36.gat,99,102,0	warp	area#r1931	2,2,1_tiamat_39.gat,18,58	//815
1_tiamat_36.gat,40,39,0		script	area#k112	45,2,2,{/* 816 */}
1_tiamat_37.gat,92,91,0		warp	area#r951	2,2,1_tiamat_58.gat,20,15	//825
1_tiamat_37.gat,94,106,0	warp	area#r952	2,2,1_tiamat_02.gat,150,166	//826
1_tiamat_37.gat,141,110,0	warp	area#r953	2,2,1_tiamat_42.gat,247,106	//827
1_tiamat_37.gat,141,73,0	warp	area#r954	2,2,1_tiamat_32.gat,32,123	//828
1_tiamat_37.gat,94,77,0		warp	area#r955	2,2,1_tiamat_61.gat,103,98	//829
1_tiamat_37.gat,21,113,0	warp	area#r1201	2,2,1_tiamat_42.gat,82,170	//830
1_tiamat_37.gat,92,91,0		script	area#k951	45,2,2,{/* 831 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_37.gat,141,110,0	script	area#k953	45,2,2,{/* 832 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_37.gat,21,113,0	script	area#k1201	45,2,2,{/* 833 */}
1_tiamat_38.gat,95,103,0	warp	area#r61	2,2,1_tiamat_05.gat,34,42	//845
1_tiamat_38.gat,84,115,0	warp	area#r62	2,2,1_tiamat_32.gat,40,170	//846
1_tiamat_38.gat,79,95,0		warp	area#r63	2,2,1_tiamat_22.gat,156,88	//847
1_tiamat_38.gat,84,115,0	script	area#k62	45,2,2,{/* 848 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_39.gat,12,169,0	warp	area#r1701	2,2,1_tiamat_08.gat,390,355	//854
1_tiamat_39.gat,7,179,0		warp	area#r1702	2,2,1_tiamat_59.gat,70,92	//855
1_tiamat_39.gat,23,58,0		warp	area#r1901	2,2,1_tiamat_36.gat,99,97	//856
1_tiamat_39.gat,12,37,0		warp	area#r1902	2,2,1_tiamat_59.gat,15,91	//857
1_tiamat_39.gat,6,56,0		warp	area#r1903	2,2,1_tiamat_39.gat,12,107	//858
1_tiamat_39.gat,23,128,0	warp	area#r1911	2,2,1_tiamat_23.gat,224,147	//859
1_tiamat_39.gat,12,112,0	warp	area#r1912	2,2,1_tiamat_39.gat,11,56	//860
1_tiamat_39.gat,96,177,0	warp	area#r1921	2,2,1_tiamat_23.gat,70,147	//861
1_tiamat_40.gat,10,25,0	warp	area#r81	2,2,1_tiamat_29.gat,191,167	//877
1_tiamat_40.gat,61,33,0	warp	area#r91	2,2,1_tiamat_13.gat,95,52	//878
1_tiamat_40.gat,10,25,0	script	area#k81	45,2,2,{/* 879 */}
1_tiamat_41.gat,97,6,0	warp	area#r161	2,2,1_tiamat_57.gat,136,124	//887
1_tiamat_41.gat,73,74,0	warp	area#r581	2,2,1_tiamat_57.gat,206,71	//888
1_tiamat_41.gat,66,86,0	warp	area#r582	2,2,1_tiamat_46.gat,93,228	//889
1_tiamat_41.gat,81,86,0	warp	area#r583	2,2,1_tiamat_49.gat,93,228	//890
1_tiamat_41.gat,21,74,0	warp	area#r621	2,2,1_tiamat_03.gat,120,331	//891
1_tiamat_41.gat,14,86,0	warp	area#r622	2,2,1_tiamat_48.gat,14,44	//892
1_tiamat_41.gat,29,86,0	warp	area#r623	2,2,1_tiamat_48.gat,36,66	//893
1_tiamat_42.gat,91,53,0	warp	area#r71	2,2,1_tiamat_63.gat,235,259	//911
1_tiamat_42.gat,93,208,0	warp	area#r801	2,2,1_tiamat_49.gat,243,47	//912
1_tiamat_42.gat,115,258,0	warp	area#r802	2,2,1_tiamat_42.gat,124,258	//913
1_tiamat_42.gat,83,251,0	warp	area#r803	2,2,1_tiamat_58.gat,19,73	//914
1_tiamat_42.gat,55,217,0	warp	area#r804	2,2,1_tiamat_09.gat,97,58	//915
1_tiamat_42.gat,129,218,0	warp	area#r805	2,2,1_tiamat_09.gat,200,50	//916
1_tiamat_42.gat,41,274,0	warp	area#r806	2,2,1_tiamat_02.gat,30,245	//917
1_tiamat_42.gat,119,258,0	warp	area#r881	2,2,1_tiamat_42.gat,110,258	//918
1_tiamat_42.gat,188,258,0	warp	area#r882	2,2,1_tiamat_43.gat,29,28	//919
1_tiamat_42.gat,110,316,0	warp	area#r891	2,2,1_tiamat_02.gat,198,80	//920
1_tiamat_42.gat,173,342,0	warp	area#r892	2,2,1_tiamat_32.gat,27,184	//921
1_tiamat_42.gat,247,111,0	warp	area#r991	2,2,1_tiamat_37.gat,136,110	//922
1_tiamat_42.gat,236,81,0	warp	area#r992	2,2,1_tiamat_42.gat,235,153	//923
1_tiamat_42.gat,273,314,0	warp	area#r1031	2,2,1_tiamat_42.gat,216,179	//924
1_tiamat_42.gat,216,142,0	warp	area#r1051	2,2,1_tiamat_58.gat,41,14	//925
1_tiamat_42.gat,216,184,0	warp	area#r1052	2,2,1_tiamat_42.gat,269,314	//926
1_tiamat_42.gat,235,148,0	warp	area#r1053	2,2,1_tiamat_42.gat,241,81	//927
1_tiamat_42.gat,152,163,0	warp	area#r1054	2,2,1_tiamat_43.gat,28,178	//928
1_tiamat_42.gat,178,148,0	warp	area#r1055	2,2,1_tiamat_43.gat,28,128	//929
1_tiamat_42.gat,197,148,0	warp	area#r1056	2,2,1_tiamat_43.gat,28,78	//930
1_tiamat_42.gat,164,176,0	warp	area#r1057	2,2,1_tiamat_15.gat,157,63	//931
1_tiamat_42.gat,253,148,0	warp	area#r1058	2,2,1_tiamat_56.gat,118,70	//932
1_tiamat_42.gat,278,163,0	warp	area#r1059	2,2,1_tiamat_35.gat,164,163	//933
1_tiamat_42.gat,268,176,0	warp	area#r10510	2,2,1_tiamat_35.gat,144,163	//934
1_tiamat_42.gat,174,40,0	warp	area#r1081	2,2,1_tiamat_43.gat,148,119	//935
1_tiamat_42.gat,172,8,0		warp	area#r1082	2,2,1_tiamat_62.gat,18,97	//936
1_tiamat_42.gat,27,47,0		warp	area#r1091	2,2,1_tiamat_43.gat,137,119	//937
1_tiamat_42.gat,31,120,0	warp	area#r1101	2,2,1_tiamat_43.gat,135,32	//938
1_tiamat_42.gat,174,108,0	warp	area#r1111	2,2,1_tiamat_43.gat,135,56	//939
1_tiamat_42.gat,367,118,0	warp	area#r1161	2,2,1_tiamat_43.gat,147,8	//940
1_tiamat_42.gat,392,137,0	warp	area#r1162	2,2,1_tiamat_42.gat,310,286	//941
1_tiamat_42.gat,310,291,0	warp	area#r1171	2,2,1_tiamat_42.gat,388,137	//942
1_tiamat_42.gat,318,335,0	warp	area#r1191	2,2,1_tiamat_43.gat,135,8	//943
1_tiamat_42.gat,50,167,0	warp	area#r1221	2,2,1_tiamat_35.gat,64,163	//944
1_tiamat_42.gat,53,152,0	warp	area#r1222	2,2,1_tiamat_43.gat,143,192	//945
1_tiamat_42.gat,109,152,0	warp	area#r1223	2,2,1_tiamat_43.gat,140,80	//946
1_tiamat_42.gat,82,175,0	warp	area#r1224	2,2,1_tiamat_37.gat,21,118	//947
1_tiamat_42.gat,83,251,0	script	area#k803	45,2,2,{/* 970 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_42.gat,164,176,0	script	area#k1057	45,2,2,{/* 971 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_42.gat,253,148,0	script	area#k1058	45,2,2,{/* 972 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_42.gat,278,163,0	script	area#k1059	45,2,2,{/* 973 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_42.gat,53,152,0	script	area#k1222	45,2,2,{/* 974 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_42.gat,82,175,0	script	area#k1224	45,2,2,{/* 975 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_42.gat,173,342,0	script	area#k892	45,2,2,{/* 976 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_42.gat,247,111,0	script	area#k991	45,2,2,{/* 977 */}
1_tiamat_42.gat,216,142,0	script	area#k1051	45,2,2,{/* 978 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_43.gat,34,28,0		warp	area#r901	2,2,1_tiamat_42.gat,183,258	//1029
1_tiamat_43.gat,33,178,0	warp	area#r1001	2,2,1_tiamat_42.gat,157,163	//1030
1_tiamat_43.gat,33,128,0	warp	area#r1011	2,2,1_tiamat_42.gat,178,153	//1031
1_tiamat_43.gat,33,78,0		warp	area#r1021	2,2,1_tiamat_42.gat,197,153	//1032
1_tiamat_43.gat,138,192,0	warp	area#r1231	2,2,1_tiamat_42.gat,53,157	//1033
1_tiamat_43.gat,153,191,0	warp	area#r1232	2,2,1_tiamat_20.gat,232,170	//1034
1_tiamat_43.gat,153,167,0	warp	area#r1233	2,2,1_tiamat_20.gat,274,170	//1035
1_tiamat_43.gat,153,143,0	warp	area#r1234	2,2,1_tiamat_34.gat,274,212	//1036
1_tiamat_43.gat,153,119,0	warp	area#r1235	2,2,1_tiamat_42.gat,174,35	//1037
1_tiamat_43.gat,132,119,0	warp	area#r1236	2,2,1_tiamat_42.gat,27,42	//1038
1_tiamat_43.gat,145,80,0	warp	area#r1241	2,2,1_tiamat_42.gat,109,157	//1039
1_tiamat_43.gat,130,80,0	warp	area#r1242	2,2,1_tiamat_09.gat,221,143	//1040
1_tiamat_43.gat,130,56,0	warp	area#r1243	2,2,1_tiamat_42.gat,174,103	//1041
1_tiamat_43.gat,130,32,0	warp	area#r1244	2,2,1_tiamat_42.gat,31,115	//1042
1_tiamat_43.gat,130,8,0		warp	area#r1245	2,2,1_tiamat_42.gat,323,335	//1043
1_tiamat_43.gat,152,8,0		warp	area#r1246	2,2,1_tiamat_42.gat,367,123	//1044
1_tiamat_43.gat,138,192,0	script	area#k1231	45,2,2,{/* 1045 */}
1_tiamat_44.gat,100,56,0	warp	area#r1581	2,2,1_tiamat_13.gat,83,46	//1065
1_tiamat_44.gat,90,82,0		warp	area#r1582	2,2,1_tiamat_44.gat,33,172	//1066
1_tiamat_44.gat,108,82,0	warp	area#r1583	2,2,1_tiamat_51.gat,194,249	//1067
1_tiamat_44.gat,82,121,0	warp	area#r1584	2,2,1_tiamat_54.gat,207,74	//1068
1_tiamat_44.gat,115,122,0	warp	area#r1585	2,2,1_tiamat_54.gat,46,50	//1069
1_tiamat_44.gat,38,172,0	warp	area#r1591	2,2,1_tiamat_44.gat,95,82	//1070
1_tiamat_44.gat,82,121,0	script	area#k1584	45,2,2,{/* 1071 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_45.gat,21,10,0	warp	area#r271	2,2,1_tiamat_08.gat,217,186	//1080
1_tiamat_45.gat,41,13,0	warp	area#r272	2,2,1_tiamat_08.gat,181,271	//1081
1_tiamat_45.gat,13,18,0	warp	area#r291	2,2,1_tiamat_08.gat,204,213	//1082
1_tiamat_45.gat,13,85,0	warp	area#r292	2,2,1_tiamat_08.gat,181,98	//1083
1_tiamat_45.gat,41,13,0		script	area#k272	45,2,2,{/* 1084 */}
1_tiamat_45.gat,21,10,0		script	area#k271	45,2,2,{/* 1085 */}
1_tiamat_45.gat,13,18,0		script	area#k291	45,2,2,{/* 1086 */}
1_tiamat_45.gat,13,85,0		script	area#k292	45,2,2,{/* 1087 */}
1_tiamat_46.gat,85,159,0	warp	area#r281	2,2,1_tiamat_18.gat,44,11	//1094
1_tiamat_46.gat,58,155,0	warp	area#r282	2,2,1_tiamat_61.gat,48,58	//1095
1_tiamat_46.gat,93,166,0	warp	area#r301	2,2,1_tiamat_18.gat,49,84	//1096
1_tiamat_46.gat,93,232,0	warp	area#r302	2,2,1_tiamat_41.gat,68,82	//1097
1_tiamat_46.gat,85,159,0	script	area#k281	45,2,2,{/* 1098 */}
1_tiamat_46.gat,93,166,0	script	area#k301	45,2,2,{/* 1099 */}
1_tiamat_47.gat,175,8,0		warp	area#r51	2,2,1_tiamat_50.gat,114,156	//1106
1_tiamat_47.gat,165,58,0	warp	area#r52	2,2,1_tiamat_49.gat,243,9	//1107
1_tiamat_47.gat,175,8,0		script	area#k51	45,2,2,{/* 1108 */}
1_tiamat_48.gat,14,10,0		warp	area#r311	2,2,1_tiamat_08.gat,180,130	//1113
1_tiamat_48.gat,14,49,0		warp	area#r312	2,2,1_tiamat_41.gat,15,80	//1114
1_tiamat_48.gat,33,66,0		warp	area#r331	2,2,1_tiamat_41.gat,28,80	//1115
1_tiamat_48.gat,67,68,0		warp	area#r332	2,2,1_tiamat_08.gat,181,354	//1116
1_tiamat_49.gat,93,220,0	warp	area#r321	2,2,1_tiamat_41.gat,78,80	//1123
1_tiamat_49.gat,93,267,0	warp	area#r322	2,2,1_tiamat_08.gat,183,9	//1124
1_tiamat_49.gat,36,286,0	warp	area#r341	2,2,1_tiamat_22.gat,112,105	//1125
1_tiamat_49.gat,77,285,0	warp	area#r342	2,2,1_tiamat_08.gat,179,12	//1126
1_tiamat_49.gat,243,52,0	warp	area#r791	2,2,1_tiamat_42.gat,93,213	//1127
1_tiamat_49.gat,243,4,0		warp	area#r792	2,2,1_tiamat_47.gat,165,53	//1128
1_tiamat_50.gat,149,105,0	warp	area#r21	2,2,1_tiamat_60.gat,94,102	//1137
1_tiamat_50.gat,160,139,0	warp	area#r22	2,2,1_tiamat_29.gat,138,208	//1138
1_tiamat_50.gat,107,133,0	warp	area#r23	2,2,1_tiamat_13.gat,136,83	//1139
1_tiamat_50.gat,114,163,0	warp	area#r24	2,2,1_tiamat_47.gat,174,13	//1140
1_tiamat_50.gat,160,139,0	script	area#k22	45,2,2,{/* 1141 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_50.gat,114,163,0	script	area#k24	45,2,2,{/* 1142 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_51.gat,375,109,0	warp	area#r1561	2,2,1_tiamat_34.gat,241,219	//1149
1_tiamat_51.gat,339,120,0	warp	area#r1562	2,2,1_tiamat_32.gat,22,172	//1150
1_tiamat_51.gat,194,244,0	warp	area#r1601	2,2,1_tiamat_44.gat,103,82	//1151
1_tiamat_51.gat,375,109,0	script	area#k1561	45,2,2,{/* 1152 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_52.gat,45,45,0		warp	area#r1771	2,2,1_tiamat_53.gat,260,280	//1161
1_tiamat_52.gat,45,234,0	warp	area#r1772	2,2,1_tiamat_04.gat,70,30	//1162
1_tiamat_52.gat,139,275,0	warp	area#r1801	2,2,1_tiamat_04.gat,142,174	//1163
1_tiamat_52.gat,139,204,0	warp	area#r1802	2,2,1_tiamat_04.gat,69,50	//1164
1_tiamat_53.gat,120,229,0	warp	area#r1311	2,2,1_tiamat_05.gat,116,38	//1173
1_tiamat_53.gat,228,194,0	warp	area#r1761	2,2,1_tiamat_04.gat,14,57	//1174
1_tiamat_53.gat,231,291,0	warp	area#r1762	2,2,1_tiamat_53.gat,183,167	//1175
1_tiamat_53.gat,260,285,0	warp	area#r1763	2,2,1_tiamat_52.gat,50,46	//1176
1_tiamat_53.gat,288,291,0	warp	area#r1764	2,2,1_tiamat_53.gat,40,217	//1177
1_tiamat_53.gat,183,162,0	warp	area#r1781	2,2,1_tiamat_53.gat,231,286	//1178
1_tiamat_53.gat,40,212,0	warp	area#r1791	2,2,1_tiamat_53.gat,288,286	//1179
1_tiamat_53.gat,231,291,0	script	area#k1762	45,2,2,{/* 1181 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_53.gat,288,291,0	script	area#k1764	45,2,2,{/* 1183 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_54.gat,48,121,0	warp	area#r1611	2,2,1_tiamat_54.gat,57,120	//1202
1_tiamat_54.gat,46,44,0		warp	area#r1621	2,2,1_tiamat_44.gat,110,122	//1203
1_tiamat_54.gat,30,50,0		warp	area#r1622	2,2,1_tiamat_08.gat,351,386	//1204
1_tiamat_54.gat,52,120,0	warp	area#r1623	2,2,1_tiamat_54.gat,43,121	//1205
1_tiamat_54.gat,59,131,0	warp	area#r1624	2,2,1_tiamat_04.gat,14,41	//1206
1_tiamat_54.gat,207,69,0	warp	area#r1631	2,2,1_tiamat_44.gat,87,121	//1207
1_tiamat_54.gat,206,93,0	warp	area#r1632	2,2,1_tiamat_54.gat,304,138	//1208
1_tiamat_54.gat,255,126,0	warp	area#r1641	2,2,1_tiamat_54.gat,255,137	//1209
1_tiamat_54.gat,294,69,0	warp	area#r1651	2,2,1_tiamat_54.gat,285,69	//1210
1_tiamat_54.gat,231,145,0	warp	area#r1661	2,2,1_tiamat_54.gat,230,137	//1211
1_tiamat_54.gat,290,121,0	warp	area#r1671	2,2,1_tiamat_54.gat,282,121	//1212
1_tiamat_54.gat,309,138,0	warp	area#r1681	2,2,1_tiamat_54.gat,206,88	//1213
1_tiamat_54.gat,281,134,0	warp	area#r1682	2,2,1_tiamat_54.gat,281,125	//1214
1_tiamat_54.gat,255,132,0	warp	area#r1683	2,2,1_tiamat_54.gat,255,121	//1215
1_tiamat_54.gat,230,141,0	script	area#r1684	45,2,2,{/* 1216 */
	if(readparam(bVit) < 110) {
		pushpc 8,5;
		misceffect 182,""; //self
		misceffect 52,""; //self
		misceffect 257,""; //self
		unittalk getcharid(3),strcharinfo(0)+" : ���E��ʂ蔲����ɂ�VIT���u110�v�ȏ�K�v���c�c�B",1;
		end;
	}
	warp "1_tiamat_54.gat",231,148;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	initnpctimer;
	misceffect 146, "area#r1684"; //1218
	end;
}
1_tiamat_54.gat,281,130,0	warp	area#r1691	2,2,1_tiamat_54.gat,281,139	//1217
1_tiamat_54.gat,286,120,0	script	area#r1692	45,2,2,{/* 1218 */
	if(readparam(bVit) < 130) {
		pushpc 6,5;
		misceffect 182,""; //self
		misceffect 52,""; //self
		misceffect 257,""; //self
		unittalk getcharid(3),strcharinfo(0)+" : ���E��ʂ蔲����ɂ�VIT���u130�v�ȏ�K�v���c�c�B",1;
		end;
	}
	warp "1_tiamat_54.gat",294,121;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	initnpctimer;
	misceffect 146, "area#r1692"; //1218
	end;
}
1_tiamat_54.gat,290,69,0	warp	area#r1693	2,2,1_tiamat_54.gat,299,69	//1219
1_tiamat_54.gat,207,69,0	script	area#k1631	45,2,2,{/* 1220 */}
1_tiamat_54.gat,290,69,0	script	area#k1693	45,2,2,{/* 1221 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_54.gat,294,69,0	script	area#k1651	45,2,2,{/* 1222 */}
1_tiamat_54.gat,286,120,0	script	area#k1692	45,2,2,{/* 1223 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_54.gat,290,121,0	script	area#k1671	45,2,2,{/* 1224 */}
1_tiamat_54.gat,30,50,0		script	area#k1622	45,2,2,{/* 1225 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_54.gat,59,131,0	script	area#k1624	45,2,2,{/* 1226 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_54.gat,230,141,0	script	area#k1684	45,2,2,{/* 1227 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_54.gat,231,145,0	script	area#k1661	45,2,2,{/* 1228 */}
1_tiamat_55.gat,287,135,0	warp	area#r141	2,2,1_tiamat_00.gat,192,170	//1257
1_tiamat_55.gat,288,257,0	warp	area#r142	2,2,1_tiamat_60.gat,94,58	//1258
1_tiamat_56.gat,93,119,0	warp	area#r231	2,2,1_tiamat_17.gat,46,10	//1263
1_tiamat_56.gat,3,120,0		warp	area#r232	2,2,1_tiamat_61.gat,118,58	//1264
1_tiamat_56.gat,119,146,0	warp	area#r241	2,2,1_tiamat_17.gat,66,89	//1265
1_tiamat_56.gat,120,235,0	warp	area#r242	2,2,1_tiamat_14.gat,14,66	//1266
1_tiamat_56.gat,112,176,0	warp	area#r243	2,2,1_tiamat_30.gat,79,65	//1267
1_tiamat_56.gat,120,98,0	warp	area#r251	2,2,1_tiamat_08.gat,96,9	//1268
1_tiamat_56.gat,120,4,0		warp	area#r252	2,2,1_tiamat_14.gat,47,67	//1269
1_tiamat_56.gat,113,70,0	warp	area#r253	2,2,1_tiamat_42.gat,253,153	//1270
1_tiamat_56.gat,235,119,0	warp	area#r261	2,2,1_tiamat_08.gat,93,12	//1271
1_tiamat_56.gat,112,176,0	script	area#k243	45,2,2,{/* 1272 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_56.gat,119,146,0	script	area#k241	45,2,2,{/* 1273 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_56.gat,120,98,0	script	area#k251	45,2,2,{/* 1274 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_56.gat,113,70,0	script	area#k253	45,2,2,{/* 1275 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_57.gat,114,116,0	warp	area#r171	2,2,1_tiamat_57.gat,106,107	//1289
1_tiamat_57.gat,136,129,0	warp	area#r172	2,2,1_tiamat_41.gat,97,9	//1290
1_tiamat_57.gat,79,75,0	warp	area#r381	2,2,1_tiamat_08.gat,184,304	//1291
1_tiamat_57.gat,109,110,0	warp	area#r382	2,2,1_tiamat_57.gat,119,121	//1292
1_tiamat_57.gat,62,171,0	warp	area#r511	2,2,1_tiamat_08.gat,184,217	//1293
1_tiamat_57.gat,142,217,0	warp	area#r551	2,2,1_tiamat_08.gat,184,133	//1294
1_tiamat_57.gat,201,76,0	warp	area#r591	2,2,1_tiamat_41.gat,73,79	//1295
1_tiamat_57.gat,218,167,0	warp	area#r681	2,2,1_tiamat_08.gat,184,48	//1296
1_tiamat_58.gat,14,73,0	warp	area#r911	2,2,1_tiamat_42.gat,83,246	//1307
1_tiamat_58.gat,43,77,0	warp	area#r912	2,2,1_tiamat_34.gat,103,26	//1308
1_tiamat_58.gat,47,69,0	warp	area#r913	2,2,1_tiamat_58.gat,57,66	//1309
1_tiamat_58.gat,51,66,0	warp	area#r2011	2,2,1_tiamat_58.gat,42,69	//1310
1_tiamat_58.gat,61,60,0	warp	area#r2012	2,2,1_tiamat_02.gat,138,222	//1311
1_tiamat_58.gat,61,27,0	warp	area#r2013	2,2,1_tiamat_02.gat,197,214	//1312
1_tiamat_58.gat,50,22,0	warp	area#r2014	2,2,1_tiamat_58.gat,41,19	//1313
1_tiamat_58.gat,46,19,0	warp	area#r2021	2,2,1_tiamat_58.gat,54,25	//1314
1_tiamat_58.gat,46,12,0	warp	area#r2022	2,2,1_tiamat_42.gat,216,147	//1315
1_tiamat_58.gat,15,15,0	warp	area#r2023	2,2,1_tiamat_37.gat,97,91	//1316
1_tiamat_58.gat,173,288,0	warp	area#r211	2,2,1_tiamat_08.gat,93,130	//1317
1_tiamat_58.gat,69,288,0	warp	area#r212	2,2,1_tiamat_02.gat,273,118	//1318
1_tiamat_58.gat,14,73,0		script	area#k911	45,2,2,{/* 1319 */}
1_tiamat_58.gat,15,15,0		script	area#k2023	45,2,2,{/* 1320 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_58.gat,173,288,0	script	area#k211	45,2,2,{/* 1321 */}
1_tiamat_58.gat,61,60,0		script	area#k2012	45,2,2,{/* 1322 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_58.gat,61,27,0		script	area#k2013	45,2,2,{/* 1323 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_58.gat,46,12,0		script	area#k2022	45,2,2,{/* 1324 */ unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1; }
1_tiamat_59.gat,75,92,0	warp	area#r1751	2,2,1_tiamat_39.gat,12,179	//1349
1_tiamat_59.gat,10,91,0	warp	area#r1752	2,2,1_tiamat_39.gat,12,42	//1350
1_tiamat_60.gat,94,47,0	warp	area#r151	2,2,1_tiamat_55.gat,288,254	//1355
1_tiamat_60.gat,71,61,0	warp	area#r152	2,2,1_tiamat_08.gat,48,270	//1356
1_tiamat_60.gat,94,107,0	warp	area#r153	2,2,1_tiamat_50.gat,149,110	//1357
1_tiamat_60.gat,116,61,0	warp	area#r154	2,2,1_tiamat_61.gat,164,111	//1358
1_tiamat_61.gat,180,97,0	warp	area#r391	2,2,1_tiamat_61.gat,109,57	//1373
1_tiamat_61.gat,160,108,0	warp	area#r392	2,2,1_tiamat_60.gat,111,61	//1374
1_tiamat_61.gat,122,57,0	warp	area#r401	2,2,1_tiamat_56.gat,8,120	//1375
1_tiamat_61.gat,104,57,0	warp	area#r402	2,2,1_tiamat_61.gat,175,97	//1376
1_tiamat_61.gat,53,58,0		warp	area#r411	2,2,1_tiamat_46.gat,63,155	//1377
1_tiamat_61.gat,103,93,0	warp	area#r971	2,2,1_tiamat_37.gat,99,77	//1378
1_tiamat_62.gat,18,92,0		warp	area#r1121	2,2,1_tiamat_42.gat,177,8	//1388
1_tiamat_63.gat,235,264,0	warp	area#r1261	2,2,1_tiamat_42.gat,86,48	//1393
1_tiamat_63.gat,264,246,0	warp	area#r1262	2,2,1_tiamat_05.gat,111,53	//1394
1_tiamat_63.gat,218,246,0	warp	area#r1263	2,2,1_tiamat_26.gat,47,56	//1395
1_tiamat_63.gat,255,271,0	warp	area#r1264	2,2,1_tiamat_26.gat,68,155	//1396
1_tiamat_63.gat,277,248,0	warp	area#r1265	2,2,1_tiamat_26.gat,47,88	//1397
1_tiamat_63.gat,264,246,0	script	area#k1262	45,2,2,{/* 1398 */}
1_tiamat_63.gat,218,246,0	script	area#k1263	45,2,2,{/* 1399 */}
1_tiamat_63.gat,255,271,0	script	area#k1264	45,2,2,{/* 1400 */}
2_tiamat_00.gat,49,67,0	warp	area#r1881	2,2,2_tiamat_02.gat,36,61	//1408
2_tiamat_00.gat,49,7,0	warp	area#r1882	2,2,1_tiamat_35.gat,94,164	//1409
2_tiamat_01.gat,196,45,0	warp	area#r1861	2,2,2_tiamat_00.gat,49,11	//1436

1_tiamat_39.gat,109,152,0	script	area#	139,{
OnInit:
	areasetcell "1_tiamat_39.gat",10,175,13,181,0;	//���OB1F
	areasetcell "1_tiamat_39.gat",6,178,9,181,0;	//���OB1F

	areasetcell "1_tiamat_45.gat",18,6,38,15,0;	//��ǒʘH01
	areasetcell "1_tiamat_45.gat",38,10,43,15,0;	//��ǒʘH01
	areasetcell "1_tiamat_45.gat",10,16,16,85,0;	//��ǒʘH03

	areasetcell "1_tiamat_46.gat",58,153,86,161,0;	//��ǒʘH02
	areasetcell "1_tiamat_46.gat",90,165,96,232,0;	//��ǒʘH04

	areasetcell "1_tiamat_48.gat",10,9,18,52,0;	//��ǒʘH05
	areasetcell "1_tiamat_48.gat",33,64,67,69,0;	//��ǒʘH07

	areasetcell "1_tiamat_49.gat",35,282,78,286,0;	//��ǒʘH08
	areasetcell "1_tiamat_49.gat",90,220,96,267,0;	//��ǒʘH06
//	end;
//OnStart:
	initnpctimer;
	end;
OnTimer5000:
	initnpctimer;
	areasetcell "1_tiamat_39.gat",10,175,13,181,0;	//���OB1F
	areasetcell "1_tiamat_39.gat",6,178,9,181,0;	//���OB1F

	areasetcell "1_tiamat_45.gat",18,6,38,15,0;	//��ǒʘH01
	areasetcell "1_tiamat_45.gat",38,10,43,15,0;	//��ǒʘH01
	areasetcell "1_tiamat_45.gat",10,16,16,85,0;	//��ǒʘH03

	areasetcell "1_tiamat_46.gat",58,153,86,161,0;	//��ǒʘH02
	areasetcell "1_tiamat_46.gat",90,165,96,232,0;	//��ǒʘH04

	areasetcell "1_tiamat_48.gat",10,9,18,52,0;	//��ǒʘH05
	areasetcell "1_tiamat_48.gat",33,64,67,69,0;	//��ǒʘH07

	areasetcell "1_tiamat_49.gat",35,282,78,286,0;	//��ǒʘH08
	areasetcell "1_tiamat_49.gat",90,220,96,267,0;	//��ǒʘH06
	end;
}
