1@tcamp.gat,0,0,0	script	ThorMilitaryBaseControl1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;

	for(set '@i,1; '@i <= 17; set '@i,'@i+1)
		donpcevent getmdnpcname("�Ď���#�Ď�" +'@i+ "_002")+"::OnStart";
	hideonnpc getmdnpcname("�}����#���b�N���u1_021");
	hideonnpc getmdnpcname("�}����#���b�N���u2_026");
	hideonnpc getmdnpcname("�}����#���b�N���u3_029");
	hideonnpc getmdnpcname("�}����#���b�N���u4_033");
	end;
}

1@tcamp.gat,106,237,3	script	�}����#��n1_034	10376,{/* 79402 */
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "����悭�N���ł��܂����ˁB";
	mes "�_���f�����ɂ��΁A��n���ŕ����";
	mes "���������s���Ă����悤�ł��B";
	next;
	mes "[�}����]";
	mes "�������̌�����m�F���邩";
	mes "�\�ł���΁A�؋��ƂȂ���̂�";
	mes "��ɓ��ꂽ���Ƃ���ł��B";
	mes "��@�Ȏ���𒆎~�����Ȃ��ƁB";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "��n���ɂ́A�Ď������ݒu����Ă��܂��B";
	mes "�߂Â��ƌx�񂪖���";
	mes "�x�������W�܂��Ă��܂�����";
	mes "���ӂ��Đi�݂܂��傤�B";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
}
1@tcamp.gat,120,228,3	script	�Ď���#�Ď�1_002	10248,7,7,{/* 77176 */
OnTouch:
	stopnpctimer;
	unittalk "�Ď��� : �s�R�҂����m!!";
	sleep 2000;
	announce "�{�ݕ��� : �s�R�҂�T�m�I�@�S���̌x�����͌���ɋ}�s����I", 0x9, 0xff0000;
	sleep 4000;
	monster getmdmapname("1@tcamp.gat"),121,229,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),120,228,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),119,228,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),119,228,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),121,228,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),122,228,"��n�̕��m",21309,1;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 8;
	end;
}
1@tcamp.gat,135,228,3	script	�Ď���#�Ď�2_003	10248,7,7,{/* 77177 */
OnTouch:
	stopnpctimer;
	unittalk "�Ď��� : �s�R�҂����m!!";
	sleep 2000;
	announce "�{�ݕ��� : �s�R�҂�T�m�I�@�S���̌x�����͌���ɋ}�s����I", 0x9, 0xff0000;
	sleep 4000;
	monster getmdmapname("1@tcamp.gat"),135,227,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),133,226,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),137,228,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),135,228,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),135,228,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),136,228,"��n�̕��m",21309,1;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 8;
	end;
}
1@tcamp.gat,152,133,3	script	�Ď���#�Ď�3_004	10248,{/* 77178 */}
1@tcamp.gat,167,133,3	script	�Ď���#�Ď�4_005	10248,{/* 77224 */}
1@tcamp.gat,182,133,3	script	�Ď���#�Ď�5_006	10248,{/* 77225 */}
1@tcamp.gat,161,96,3	script	�Ď���#�Ď�6_007	10248,{/* 77226 */}
1@tcamp.gat,146,96,3	script	�Ď���#�Ď�7_008	10248,{/* 77227 */}
1@tcamp.gat,116,102,3	script	�Ď���#�Ď�8_009	10248,{/* 77228 */}
1@tcamp.gat,88,92,3		script	�Ď���#�Ď�9_010	10248,{/* 77229 */}
1@tcamp.gat,240,148,3	script	�Ď���#�Ď�10_011	10248,{/* 77230 */}
1@tcamp.gat,156,71,3	script	�Ď���#�Ď�11_012	10248,{/* 77231 */}
1@tcamp.gat,176,194,3	script	�Ď���#�Ď�12_013	10248,7,7,{/* 77232 */
OnTouch:
	stopnpctimer;
	unittalk "�Ď��� : �s�R�҂����m!!";
	sleep 2000;
	announce "�{�ݕ��� : �s�R�҂�T�m�I�@�S���̌x�����͌���ɋ}�s����I", 0x9, 0xff0000;
	sleep 4000;
	monster getmdmapname("1@tcamp.gat"),176,196,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),177,195,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),177,193,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),176,195,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),176,194,"��n�̕��m",21309,1;
	monster getmdmapname("1@tcamp.gat"),176,193,"��n�̕��m",21309,1;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 8;
	end;
}
1@tcamp.gat,192,194,3	script	�Ď���#�Ď�13_014	10248,{/* 77233 */}
1@tcamp.gat,142,153,3	script	�Ď���#�Ď�14_015	10248,{/* 77234 */}
1@tcamp.gat,142,168,3	script	�Ď���#�Ď�15_016	10248,{/* 79279 */}
1@tcamp.gat,192,179,3	script	�Ď���#�Ď�16_017	10248,{/* 78756 */}
1@tcamp.gat,237,90,3	script	�Ď���#�Ď�17_018	10248,{/* 79537 */}

1@tcamp.gat,138,216,3	script	���b�N���u#1-1_019	10024,{/* 79281 */
	hideoffnpc getmdnpcname("�}����#���b�N���u1_021");	// 79404
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u1_021")),"�}���� : ���b�N���|�����Ă��܂��ˁB���ɂ��C�����c�c�B";	// 79404
	progressbar 10,getmdnpcname("�}����#���b�N���u1_021");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u1_021")),"�}���� : ����Œʂ�܂���B��p�Ȃ���ł��傤�H";	// 79404
	hideonnpc getmdnpcname("���b�N���u#1-1_019");	// 79281
	hideonnpc getmdnpcname("���b�N���u#1-2_020");	// 79400
	setcell getmdmapname("1@tcamp.gat"), 137, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 138, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 139, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 140, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 141, 216, 0;
	setcell getmdmapname("1@tcamp.gat"), 142, 216, 0;
	hideonnpc getmdnpcname("�}����#���b�N���u1_021");	// 79404
	end;
}
1@tcamp.gat,141,216,3	script	���b�N���u#1-2_020	10024,{/* 79400 */}
1@tcamp.gat,140,218,3	script	�}����#���b�N���u1_021	10376,{/* 79404 (hide)*/}

1@tcamp.gat,136,145,3	script	���b�N���u#2-1_022	10024,{/* 79415 */
	hideoffnpc getmdnpcname("�}����#���b�N���u2_026");	// 79461
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u2_026")),"�}���� : ���̐�͌x�������������ł��ˁB";	// 79461
	progressbar 10,getmdnpcname("�}����#���b�N���u2_026");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u2_026")),"�}���� : ����Ői�߂܂����A�T�d�ɍs���܂��傤�B";	// 79461
	hideonnpc getmdnpcname("���b�N���u#2-1_022");	// 79415
	hideonnpc getmdnpcname("���b�N���u#2-2_023");	// 79418
	hideonnpc getmdnpcname("���b�N���u#2-3_024");	// 79459
	hideonnpc getmdnpcname("���b�N���u#2-4_025");	// 79460
	setcell getmdmapname("1@tcamp.gat"), 135, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 136, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 137, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 138, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 139, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 140, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 141, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 142, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 143, 145, 0;
	setcell getmdmapname("1@tcamp.gat"), 144, 145, 0;
	hideonnpc getmdnpcname("�}����#���b�N���u2_026");	// 79461
	end;
}
1@tcamp.gat,138,145,3	script	���b�N���u#2-2_023	10024,{/* 79418 */}
1@tcamp.gat,141,145,3	script	���b�N���u#2-3_024	10024,{/* 79459 */}
1@tcamp.gat,143,145,3	script	���b�N���u#2-4_025	10024,{/* 79460 */}
1@tcamp.gat,142,147,3	script	�}����#���b�N���u2_026	10376,{/* 79461 (hide)*/
	cutin "ep18_maram_01.png", 1;
	mes "[�}����]";
	mes "���������b�N���|�����Ă��܂��B";
	mes "�Ăі��\���̏o�ԂƂ����킯�ł��ˁB";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
}

1@tcamp.gat,223,109,3	script	���b�N���u#3-1_027	10024,{/* 79462 */
	hideoffnpc getmdnpcname("�}����#���b�N���u3_029");	// 79439
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u3_029")),"�}���� : �����̒����������x�����~����Ă��܂��ˁB";	// 79439
	progressbar 10,getmdnpcname("�}����#���b�N���u3_029");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u3_029")),"�}���� : ���������A�T�d�ɐi�݂܂��傤�B";	// 79439
	hideonnpc getmdnpcname("���b�N���u#3-1_027");	// 79462
	hideonnpc getmdnpcname("���b�N���u#3-2_028");	// 79438
	setcell getmdmapname("1@tcamp.gat"), 223, 110, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 109, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 108, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 107, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 106, 0;
	setcell getmdmapname("1@tcamp.gat"), 223, 105, 0;
	hideonnpc getmdnpcname("�}����#���b�N���u3_029");	// 79439
	end;
}
1@tcamp.gat,223,106,3	script	���b�N���u#3-2_028	10024,{/* 79438 */}
1@tcamp.gat,226,114,3	script	�}����#���b�N���u3_029	10376,{/* 79439 (hide)*/}

1@tcamp.gat,80,99,3	script	���b�N���u#4-1_030	10024,{/* 79441 */
	hideoffnpc getmdnpcname("�}����#���b�N���u4_033");	// 79401
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u4_033")),"�}���� : ���̐悪�w�ߏ��݂����ł��B�d�v�Ȃ��̂��W�܂�ꏊ�ł��ˁB";	// 79401
	progressbar 10,getmdnpcname("�}����#���b�N���u4_033");	//color=0x3131ff
	unittalk getnpcid(0,getmdnpcname("�}����#���b�N���u4_033")),"�}���� : �T���Ă�����̂�������Ηǂ��̂ł����c�c�B";	// 79401
	hideonnpc getmdnpcname("���b�N���u#4-1_030");	// 79441
	hideonnpc getmdnpcname("���b�N���u#4-2_031");	// 79442
	hideonnpc getmdnpcname("���b�N���u#4-3_032");	// 79581
	setcell getmdmapname("1@tcamp.gat"), 80, 100, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 99, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 98, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 97, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 96, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 95, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 94, 0;
	setcell getmdmapname("1@tcamp.gat"), 80, 93, 0;
	hideonnpc getmdnpcname("�}����#���b�N���u4_033");	// 79401
	end;
}
1@tcamp.gat,80,97,3	script	���b�N���u#4-2_031	10024,{/* 79442 */}
1@tcamp.gat,80,95,3	script	���b�N���u#4-3_032	10024,{/* 79581 */}
1@tcamp.gat,82,100,3	script	�}����#���b�N���u4_033	10376,{/* 79401 (hide)*/
	cutin "ep18_maram_01.png", 1;
	mes "[�}����]";
	mes "�����c�c�Ń��[�g�Ŏd���ꂽ����";
	mes "����Ȃɖ��ɗ��Ȃ�āc�c";
	mes "����Ȏp����Ɍ���ꂽ��";
	mes "�Ȃ�ƌ����邩�c�c�B";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
}

1@tcamp.gat,194,232,0	script	#tc_hwarp3_035	139,14,14,{/* 79403 */
	cloakoffnpc getmdnpcname("�}����#��n4_036");	// 79407
	end;
}
1@tcamp.gat,194,232,3	script	�}����#��n4_036	10376,{/* 79407 */
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�ӂށc�c���̕ӂ�𒲂ׂĂ݂܂�����";
	mes "����Ƃ��������͖̂����悤�ł��B";
	next;
	mes "[�}����]";
	mes "�����̎{�ݓ��𒲂ׂČ�������";
	mes "�ǂ���������܂���B";
	mes "�x�������d�ł�����";
	mes "��������Ƃ�����A������ł��傤�B";
	close2;
	cutin "ep18_maram_01.png", 255;
	cloakonnpc getmdnpcname("�}����#��n4_036");	// 79407
	end;
}

1@tcamp.gat,34,100,3	script	�~���A��#��n1_037	10377,7,7,{/* 79408 */
	if(countitem(1000409) < 5) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�܂����`���҂���ƃ}������";
		mes "�����ŉ�Ƃ͎v���ĂȂ������ȁB";
		mes "�ǂ�����āA�����ɂ��ǂ蒅�����̂�";
		mes "�b�𕷂������Ƃ��낾���ǁc�c�B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "���͕K�v�Ȃ��̂��W�߂Ȃ��ƁB";
		mes "�����ɂ��鏑�ނ��W�߂Ă��炦�܂��񂩁H";
		mes "�{�N�ЂƂ肾�Ǝ肪���Ȃ���";
		mes "�����Ă�����ł��B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	cutin "ep18_miriam_02.png", 0;
	mes "[�~���A��]";
	mes "���ނ��W�߂Ă�������";
	mes "���肪�Ƃ��������܂��B";
	mes "�{�N�ЂƂ肾�Ǝ肪���Ȃ���";
	mes "�����Ă���ł��B";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "���͂����Ƀ~���A�������邱�Ƃ�";
	mes "�����Ă���񂾂��ǁB";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�����͌�ɂ��悤�B";
	mes "������ق�A���̏��ނ����āB";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "����̉������̃��X�g����Ȃ����I";
	mes "�g�p�������߂���";
	mes "�p���\��̕��킪�ΏۂɂȂ��Ă�B";
	next;
	mes "[�}����]";
	mes "�����c�c�Ȃ�قǁB";
	mes "���K�̏��ޏ�́A�j�������ɂ��Ă�����";
	mes "���ۂ͉��������Ă����Ƃ����킯���B";
	mes "�Ǘ���������߂���c�c";
	mes "�`�F�b�N�@�\�������ĂȂ��ȁB";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�����́A�{�N�̕��オ�Ǘ�����";
	mes "��n�̈�Ȃ񂾁B";
	mes "���Ō�������Ɍ��o��������������";
	mes "������������Ǝv���Ē��ׂĂ��񂾂�B";
	next;
	cutin "ep18_miriam_03.png", 0;
	mes "[�~���A��]";
	mes "���̉������̌��A";
	mes "����͒m��Ȃ���������Ȃ��B";
	mes "�m���߂Ȃ��Ɓc�c�B";
	next;
	mes "[�~���A��]";
	mes "���ނ̓{�N���؋��i�Ƃ���";
	mes "����ɒ�o���܂��B";
	mes "���킪�s���ɏo���̂�";
	mes "�~�߂Ȃ��ƁB";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "�~���A���̌䕃�ォ�c�c";
	mes "�Ȃ�قǁc�c�B";
	delitem 1000409,5;
	set EP18_1QUE,47;
	delquest 16578;
	setquest 16579;	// state=1
	close2;
	cutin "ep18_miriam_02.png", 255;
	end;
OnQuestInfo:
	if(countitem(1000409) >= 5)
		showevent 1, 1, "�~���A��#��n1_037";
	else
		showevent 9999,0,"�~���A��#��n1_037";
	end;
OnTouch:
	unittalk "�~���A�� : �����A�`���҂���c�c!?";	// 79408
	end;
}
1@tcamp.gat,32,102,3	script	�}����#��n5_038	10376,{/* 79412 */
	if(EP18_1QUE < 47) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����Ƀ~���A��������Ƃ�";
		mes "�v���Ă��݂܂���ł����B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 47) {
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�~���A���B";
		mes "���w���ɖ߂�񂾂낤�H";
		mes "�����ꏏ�ɍs�����B";
		next;
		mes "[�}����]";
		mes "�`���җl�́A���̊�n����s���ȕ��킪";
		mes "���o���Ă������Ƃ�";
		mes "�X�A�h�ɓ`���Ă��炦�܂����B";
		next;
		mes "[�}����]";
		mes "�s���̏؋��͎�ɓ���܂�������";
		mes "����ȏ�A���������킪";
		mes "���o���邱�Ƃ͂Ȃ��Ǝv���܂��B";
		mes "�ł́A�O�ɏo�܂��傤�B";
		set EP18_1QUE,48;
		delquest 16579;
		setquest 16580;	// state=1
		close2;
		cutin "ep18_maram_01.png", 255;
		warp "wolfvill.gat", 145, 109;
		end;
	}
	//������
	mes "[�}����]";
	mes "�s���̏؋��͎�ɓ���܂�������";
	mes "����ȏ�A���������킪";
	mes "���o���邱�Ƃ͂Ȃ��Ǝv���܂��B";
	mes "�ł́A�O�ɏo�܂��傤�B";
	close2;
	cutin "ep18_maram_01.png", 255;
	warp "wolfvill.gat", 145, 109;
	end;
OnQuestInfo:
	if(EP18_1QUE == 47)
		showevent 1, 1, "�}����#��n5_038";
	else
		showevent 9999,0,"�}����#��n5_038";
	end;
}
1@tcamp.gat,32,100,3	script	���ނ̎R#��n1_039	10391,{/* 79426 */
	mes "�]���ނ����G�ɒu����Ă���]";
	next;
	mes "�]����̏��ނɖڂ�ʂ��B";
	mes "�@�����́A��n���ɕۊǂ���Ă���";
	mes "�@����̊Ǘ��\�̂悤���]";
	next;
	mes "�]�g�p�������߂�������ɂ�";
	mes "�@�j���̃}�[�N���t�����Ă���B";
	mes "�@";
	mes "�@�O�̂��߁A���ނ������čs�����]";
	getitem 1000409,1;
	cloakonnpc;	// 79426
	close;
}
1@tcamp.gat,49,123,3	script	���ނ̎R#��n2_040	10391,{/* 79433 */
	mes "�]���ނ����G�ɒu����Ă���]";
	next;
	mes "�]��ԏ�̏��ނɂ�";
	mes "�@�u�������т̃��j���[�����v��";
	mes "�@�\�肪�t�����Ă���]";
	next;
	mes "�]����̉������Ƃ͊֌W�Ȃ���������";
	mes "�@�O�̂��߁A���ނ������čs�����]";
	getitem 1000409,1;
	cloakonnpc;	// 79433
	close;
}
1@tcamp.gat,29,86,3		script	���ނ̎R#��n3_041	10391,{/* 79437 */
	mes "�]���ނ����G�ɒu����Ă���]";
	next;
	mes "�]���ނ��ꖇ���o���Ċm�F����B";
	mes "�@�ǂ����x�����̔z�u�}�̂悤���]";
	next;
	mes "�]����̉������Ƃ͊֌W�Ȃ���������";
	mes "�@�O�̂��߁A���ނ������čs�����]";
	getitem 1000409,1;
	cloakonnpc;	// 79437
	close;
}
1@tcamp.gat,60,122,3	script	���ނ̎R#��n4_042	10391,{/* 79515 */
	mes "�]���ނ����G�ɒu����Ă���B";
	mes "�@";
	mes "�@��ԏ�̏��ނ��m�F���Ă݂�]";
	next;
	mes "[����]";
	mes "�}�O�}������";
	mes "�W���K�C����H�ׂ�����";
	mes "���΂炭���Ă���|���ƁA";
	mes "�z�N�z�N�̏Ă��W���K�C����";
	mes "�h���b�v����̂��낤���H";
	next;
	mes "�]����̉������Ƃ͊֌W�Ȃ���������";
	mes "�@�O�̂��߁A���ނ������čs�����]";
	getitem 1000409,1;
	cloakonnpc;	// 79515
	close;
}
1@tcamp.gat,31,84,3		script	���ނ̎R#��n5_043	10391,{/* 79614 */
	mes "�]���ނ����G�ɒu����Ă���]";
	next;
	mes "�]���ނ��m�F���Ă����";
	mes "�@�u���c�v�̃C���X�g���o�Ă����B";
	mes "�@";
	mes "�@�Ƃ�ł��Ȃ����ȃC���X�g���c�c";
	mes "�@�쐶�̃v���̔ƍs�ɈႢ�Ȃ��I-";
	next;
	mes "�]����̉������Ƃ͊֌W�Ȃ���������";
	mes "�@���������Ȃ̂ł�����Ă������]";
	getitem 1000409,1;
	cloakonnpc;	// 79614
	close;
}
