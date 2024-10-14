1@jorchs.gat,0,0,0	script	ConfusedNestControl1	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set .mdmap$,getmdmapname("1@jorchs.gat");
	set '@temp_mob[0],callmonster(.mdmap$,273,17,"�i���s��#273_17",3982,getmdnpcname("ConfusedNestControl1")+"::OnKilled");
	set '@temp_mob[1],callmonster(.mdmap$,273,21,"�i���s��#273_21",3982,getmdnpcname("ConfusedNestControl1")+"::OnKilled");
	for(set '@i,0; '@i < getarraysize('@temp_mob); set '@i,'@i+1)
		setunitgroup 1002,'@temp_mob['@i];

	// Gate
	setarray '@xy0,273,17,274,17,275,17,273,18,274,18,275,18,273,19,274,19,275,19,273,20,274,20,275,20,273,21,274,21,275,21,273,22,274,22,273,23,274,23;
	for(set '@i,0; '@i < getarraysize('@xy0); set '@i,'@i+2)
		setcell .mdmap$,'@xy0['@i],'@xy0['@i+1],1;

	// Area 1
	setarray '@xy1,142,58,142,57,142,56,142,55,142,54,142,62,141,62,141,61,141,60,141,59,141,58,141,57,141,56,141,55,141,54;
	for(set '@i,0; '@i < getarraysize('@xy1); set '@i,'@i+2)
		setcell .mdmap$,'@xy1['@i],'@xy1['@i+1],1;

	// Area 2
	setarray '@xy2, 124,130,124,129,124,128,124,127,124,126,123,130,123,129,123,128,123,127,123,126,122,130,122,129,122,128,122,127,122,126,121,130,121,129,121,128,
					121,127,121,126,120,130,120,129,120,128,120,127,120,126,119,130,119,129,119,128,119,127,119,126,129,126,129,125,129,124,128,126,128,125,128,124,
					127,126,127,125,127,124,126,126,126,125,126,124,125,126,125,125,125,124,124,126,124,125,124,124,123,126,123,125,123,124,122,126,122,125,122,124;
	for(set '@i,0; '@i < getarraysize('@xy2); set '@i,'@i+2)
		setcell .mdmap$,'@xy2['@i],'@xy2['@i+1],1;

	// Area 3
	setarray '@xy3, 250,177,250,176,249,177,249,176,248,177,248,176,247,177,247,176,246,177,246,176,245,177,245,176,244,177,244,176,243,177,243,176,243,175,243,174,242,177,
					242,176,242,175,242,174,241,177,241,176,241,175,241,174,240,177,240,176,240,175,240,174,239,177,239,176,239,175,239,174,238,177,238,176,238,175,238,174;
	for(set '@i,0; '@i < getarraysize('@xy3); set '@i,'@i+2)
		setcell .mdmap$,'@xy3['@i],'@xy3['@i+1],1;

	// Area 4
	setarray '@xy4, 140,183,140,182,140,181,140,180,140,179,140,178,139,183,139,182,139,181,139,180,139,179,139,178,138,183,138,182,138,181,138,180,138,179,138,178;
	for(set '@i,0; '@i < getarraysize('@xy4); set '@i,'@i+2)
		setcell .mdmap$,'@xy4['@i],'@xy4['@i+1],1;

	// Area 5
	setarray '@xy5, 43,256,43,255,42,256,42,255,41,256,41,255,40,256,40,255,39,256,39,255,38,256,38,255,37,256,37,255,36,256,36,255,35,256,35,255,34,256,34,255;
	for(set '@i,0; '@i < getarraysize('@xy5); set '@i,'@i+2)
		setcell .mdmap$,'@xy5['@i],'@xy5['@i+1],1;

	hideonnpc getmdnpcname("sw_1_0");
	hideonnpc getmdnpcname("���I��#19m00");	// 96607
	hideonnpc getmdnpcname("�~���A��#19m00");	// 14495
	hideonnpc getmdnpcname("���H�[�N�����f#19m00");	// 28233
	hideonnpc getmdnpcname("�z����#19m00");	// 75931
	hideonnpc getmdnpcname("�A�[�E�B��#19m00");	// 76011
	hideonnpc getmdnpcname("�A�[�E�B��#19m01");	// 99342
	hideonnpc getmdnpcname("�|�C�Â������K��#19m00");
	hideonnpc getmdnpcname("�|�C�Â������K��#19m01");

	hideonnpc getmdnpcname("sw_1_1");
	hideonnpc getmdnpcname("�z����#19m10");	// 59811
	hideonnpc getmdnpcname("�I�[�����[#19m10");	// 33180
	hideonnpc getmdnpcname("���I��#19m10");	// 35416
	hideonnpc getmdnpcname("�~���A��#19m10");	// 69866
	hideonnpc getmdnpcname("���H�[�N�����f#19m10");	// 86073
	hideonnpc getmdnpcname("�A�[�E�B��#19m10");	// 58881
	hideonnpc getmdnpcname("�A�[�E�B��#19m11");	// 18533

	hideonnpc getmdnpcname("sw_2_0");	// 60886
	hideonnpc getmdnpcname("���~�߂��ꂽ���K��#19m10");	// 57878
	hideonnpc getmdnpcname("���~�߂��ꂽ���K��#19m11");	// 97573

	hideonnpc getmdnpcname("sw_2_1");	// 5473
	hideonnpc getmdnpcname("�z����#19m20");	// 52504
	hideonnpc getmdnpcname("�z����#19m21");	// 18653
	hideonnpc getmdnpcname("�A�[�E�B��#19m22");	// 33307
	hideonnpc getmdnpcname("�A�[�E�B��#19m23");	// 37536
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m20");	// 49580
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m21");	// 56070
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m22");	// 69632

	hideonnpc getmdnpcname("sw_3_0");	// 30256
	hideonnpc getmdnpcname("���H�[�N�����f#19m30");	// 30262
	hideonnpc getmdnpcname("�~���A��#19m30");	// 30263
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m30");	// 30264
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m31");	// 30265
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m32");	// 30266
	hideonnpc getmdnpcname("�������u1#19m30");
	hideonnpc getmdnpcname("�������u2#19m31");
	hideonnpc getmdnpcname("�������u3#19m32");

	hideonnpc getmdnpcname("sw_4_0");	// 30280
	hideonnpc getmdnpcname("sw_4_1");	// 30281
	hideonnpc getmdnpcname("�I�[�����[#19m40");	// 30282
	hideonnpc getmdnpcname("���I��#19m40");	// 30284
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m40");	// 30285
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m41");	// 30286
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m42");	// 30287
	hideonnpc getmdnpcname("�������u3#19m40");
	hideonnpc getmdnpcname("#e19c05");
	hideonnpc getmdnpcname("#e19c06");

	hideonnpc getmdnpcname("�o�S�b�g#19m50");	// 30181
	hideonnpc getmdnpcname("���\�ȃ��K��#19m50");	// 30889
	hideonnpc getmdnpcname("���\�ȃ��K��#19m51");	// 30889
	hideonnpc getmdnpcname("���\�ȃ��K��#19m52");	// 30133
	hideonnpc getmdnpcname("���\�ȃ��K��#19m53");	// 30889
	hideonnpc getmdnpcname("���\�ȃ��K��#19m54");	// 30956
	hideonnpc getmdnpcname("���\�ȃ��K��#19m55");	// 30889
	hideonnpc getmdnpcname("���\�ȃ��K��#19m56");	// 30889

	hideonnpc getmdnpcname("�I�[�����[#19m60");	// 30948
	hideonnpc getmdnpcname("���I��#19m60");	// 30157
	hideonnpc getmdnpcname("�z����#19m60");	// 30896
	hideonnpc getmdnpcname("���H�[�N�����f#19m60");	// 28145
	hideonnpc getmdnpcname("�~���A��#19m60");	// 30290

	donpcevent getmdnpcname("�I�[�����[#19m00")+ "::OnStart";
	//hideoffnpc getmdnpcname("����Ǘ�#jorchs");
	set 'flag,2;
	end;
}

1@jorchs.gat,275,19,3	script	����Ǘ�#jorchs	10046,{/* 41925 */
	if(getvariableofnpc('flag,getmdnpcname("ConfusedNestControl2")) < 2) {
		unittalk "�]�������A���_���W�����̏������ł��]";
		//hideonnpc;
		end;
	}
	mes "^FF0000[�C���t�H���[�V����]";
	mes "���̐�ւ�";
	mes "�������A���_���W������";
	mes "��������𖞂�����";
	mes "�قȂ�Q�[���A�J�E���g��";
	mes "�L�����N�^�[��2�l�܂ŁA";
	mes "�ꏏ�ɐi�ނ��Ƃ��ł��܂��B^000000";
	next;
	mes "[�C���t�H���[�V����]";
	mes "�i�����܂����H";
	mes "�@";
	mes "^4A0084�]�i���L�����N�^�[���F " +.char_cnt+ " / 2�]^000000";
	next;
	if(select("^0000ff�͂�^000000","������") == 2) {
		mes "�]��߂��]";
		close;
	}
	mes "[�C���t�H���[�V����]";
	mes "�i�����܂��B";
	close2;
	if(.char_cnt >= 2) {
		// ������
		mes "[�C���t�H���[�V����]";
		mes "����ȏ�i���ł��܂���B";
		close;
	}
	set .char_cnt,.char_cnt+1;
	warp .mdmap$, 269, 21;
	end;
}

1@jorchs.gat,261,34,0	script	sw_1_0	139,14,14,{/* 97394 (hide)*/
	viewpoint 1, 242, 66, 1, 0xFFFF00;	// 97394
	viewpoint 1, 237, 61, 2, 0xFFFF00;	// 97394
	viewpoint 1, 221, 37, 3, 0xFFFF00;	// 97394
	viewpoint 1, 249, 79, 4, 0xFFFF00;	// 97394
	viewpoint 1, 114, 20, 5, 0xFFFF00;	// 97394
	viewpoint 1, 142, 58, 99, 0xFF0000;	// 97394
	end;
}
1@jorchs.gat,261,34,3	script	�I�[�����[#19m00	10465,{/* 94548 */
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : �����Ƌ߂Â���",1;
		end;
	}
	switch(.scean) {
	case 0:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		stopnpctimer;
		misceffect 16;	// 94548
		if(!sleep2(500)) end;
		announce "�I�[�����[ : ���͂�ϐg����K�v���Ȃ������ˁB", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("�z����#19m00")),"�z���� : ��s�����A�[�E�B���������A�����t�߂̃��K��������Еt�����B";	// 75931
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("���H�[�N�����f#19m00")),"���H�[�N�����f : ���̉��̕��ɂ́A�܂��܂����K��������݂����ˁB";	// 28233
		if(!sleep2(3000)) end;
		unittalk "�I�[�����[ : �ڕW�̓��X�K���h�ƃo�S�b�g�̊m�ہA�y�у��~���̐S���̒D�҂�B";	// 94548
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("�z����#19m00")),"�z���� : �������킯�ɂ͂����Ȃ��B�X�s�[�h�������B";	// 75931
		if(!sleep2(3000)) end;
		unittalk "�I�[�����[ : �o�����͈�����̂悤�����ǁA�������̒m��Ȃ��o����������\���������B";	// 94548
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("�z����#19m00")),"�z���� : ���̉��ɂ��ǂ蒅���ɂ́A���K�������Ƃ̐퓬�͔������Ȃ��B";	// 75931
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("�z����#19m00")),"�z���� : ��s���������̘b�ɂ��΁A���ʂ̃��K���Ƃ͈Ⴄ�炵���B";	// 75931
		if(!sleep2(3000)) end;
		unittalk "�I�[�����[ : ����͎�p�ɒ����Ă��郋�K��������B�\���ɋC��t���āB";	// 94548
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("�z����#19m00")),"�z���� : ������N�U���J�n����I�@���^���F��I";	// 75931
		if(!sleep2(100)) end;
		announce "�I�[�����[ : ���͂�{�����A���K��������r�����Ă��傤�����B", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		hideonnpc getmdnpcname("���I��#19m00");	// 96607
		hideonnpc getmdnpcname("�~���A��#19m00");	// 14495
		hideonnpc getmdnpcname("���H�[�N�����f#19m00");	// 28233
		hideonnpc getmdnpcname("�z����#19m00");	// 75931
		hideonnpc getmdnpcname("�A�[�E�B��#19m00");	// 76011
		hideonnpc getmdnpcname("�A�[�E�B��#19m01");	// 99342
		if(!sleep2(200)) end;
		hideoffnpc getmdnpcname("sw_1_0");	// 97394
		donpcevent getmdnpcname("ConfusedNestControl2")+ "::OnStart";
		end;
	case 1:
		unittalk "�I�[�����[ : ���͂�{�����A���K��������r�����Ă��傤�����B";	// 94548
		viewpoint 1, 242, 66, 1, 0xFFFF00;	// 94548
		viewpoint 1, 237, 61, 2, 0xFFFF00;	// 94548
		viewpoint 1, 221, 37, 3, 0xFFFF00;	// 94548
		viewpoint 1, 249, 79, 4, 0xFFFF00;	// 94548
		viewpoint 1, 114, 20, 5, 0xFFFF00;	// 94548
		viewpoint 1, 142, 58, 99, 0xFF0000;	// 94548
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 94548
	end;
OnInit:
	setnpctitle "[����]";	// NPC:�I�[�����[#19m00(94548)
	end;
}
1@jorchs.gat,260,35,3	script	���I��#19m00	10464,{/* 96607 */}
1@jorchs.gat,256,34,5	script	�~���A��#19m00	10377,{/* 14495 */}
1@jorchs.gat,257,35,5	script	���H�[�N�����f#19m00	10467,{/* 28233 */}
1@jorchs.gat,258,32,7	script	�z����#19m00	21518,{/* 75931 */}
1@jorchs.gat,256,31,7	script	�A�[�E�B��#19m00	21517,{/* 76011 */}
1@jorchs.gat,259,31,7	script	�A�[�E�B��#19m01	21517,{/* 99342 */}

1@jorchs.gat,0,0,0	script	ConfusedNestControl2	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set 'mob_num,5;
	set .scean,1;
	hideoffnpc getmdnpcname("�|�C�Â������K��#19m00");
	hideoffnpc getmdnpcname("�|�C�Â������K��#19m01");
	set '@label$,getmdnpcname("ConfusedNestControl2")+ "::OnKilled";
	monster .mdmap$,242,66,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,237,61,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,221,37,"�������܂ꂽ�������K��",21535,1,'@label$;
	end;
OnKilled:
	set 'mob_num,'mob_num-1;
	initnpctimer;
	end;
OnTimer500:
	if('mob_num > 0) {
		stopnpctimer;
		announce "�]���͂Ƀ��K�����܂��c���Ă���悤���]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	end;
OnTimer1000:
	hideonnpc getmdnpcname("sw_1_0");
	hideonnpc getmdnpcname("�I�[�����[#19m00");
	hideoffnpc getmdnpcname("�z����#19m10");	// 59811
	hideoffnpc getmdnpcname("�I�[�����[#19m10");	// 33180
	hideoffnpc getmdnpcname("���I��#19m10");	// 35416
	hideoffnpc getmdnpcname("�~���A��#19m10");	// 69866
	hideoffnpc getmdnpcname("���H�[�N�����f#19m10");	// 86073
	hideoffnpc getmdnpcname("�A�[�E�B��#19m10");	// 58881
	hideoffnpc getmdnpcname("�A�[�E�B��#19m11");	// 18533
	end;
OnTimer1500:
	set .scean,2;
	stopnpctimer;
	announce "�z���� : �݂�Ȑ��̕��֏W�����Ă���I�@������m�F�������B", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	donpcevent getmdnpcname("�z����#19m10")+ "::OnStart";
	end;
}

1@jorchs.gat,249,79,7	script	�|�C�Â������K��#19m00	21600,5,5,{/* 67000 (hide)*/
	// ������
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�|�C�Â������K�� : �|���c�c�̂��c�c�����ς��c�c�H";	// 67000
	end;
OnTimer3000:
	unittalk "�|�C�Â������K�� : �c�c�l�ԁH�@�M�l�̏��ׂ��H�@���ɂ�����������������!!";	// 67000
	end;
OnTimer5000:
	unittalk "�|�C�Â������K�� : ����킵���l�Ԃ̂����ɁI�@�����������Ɂc�c�I�@���c�c";	// 67000
	end;
OnTimer7000:
	stopnpctimer;
	misceffect 594;	// 67000
	hideonnpc;	// 67000
	set '@label$,getmdnpcname("ConfusedNestControl2")+ "::OnKilled";
	monster .mdmap$,249,79,"�������܂ꂽ�������K��",21535,1,'@label$;
	end;
}

1@jorchs.gat,114,20,3	script	�|�C�Â������K��#19m01	21600,5,5,{/* 94770 (hide)*/
	// ������
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�|�C�Â������K�� : ��A�����c�����Ȃ�̂��c�c�H";	// 94770
	end;
OnTimer3000:
	unittalk "�|�C�Â������K�� : �����ɂ��Ă����̂ɁA���̐l�Ԃ����́c�c���Ɉ�̉��������c�c!?";	// 94770
	end;
OnTimer5000:
	unittalk "�|�C�Â������K�� : �c�l�ԁH�@�l��!�H�@�������������l��!!??!?";	// 94770
	end;
OnTimer7000:
	unittalk "�|�C�Â������K�� : ���c�����c�c";	// 94770
	end;
OnTimer9000:
	stopnpctimer;
	misceffect 594;	// 67000
	hideonnpc;	// 67000
	set '@label$,getmdnpcname("ConfusedNestControl2")+ "::OnKilled";
	monster .mdmap$,114,20,"�������܂ꂽ�������K��",21535,1,'@label$;
	end;
}

1@jorchs.gat,142,58,0	script	sw_1_1	139,14,14,{/* 51002 (hide)*/
	viewpoint 2, 242, 66, 1, 0xFFFF00;	// 51002
	viewpoint 2, 237, 61, 2, 0xFFFF00;	// 51002
	viewpoint 2, 221, 37, 3, 0xFFFF00;	// 51002
	viewpoint 2, 249, 79, 4, 0xFFFF00;	// 51002
	viewpoint 2, 114, 20, 5, 0xFFFF00;	// 51002
	viewpoint 1, 114, 119, 99, 0xFF0000;	// 51002
	end;
}
1@jorchs.gat,142,58,5	script	�z����#19m10	21518,{/* 59811 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : �����Ƌ߂Â���",1;
		end;
	}
	switch(.scean) {
	case 2:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		stopnpctimer;
		misceffect 16;	// 59811
		if(!sleep2(500)) end;
		unittalk "�z���� : ����͂�����������!?�@���܂Ō������Ƃ��Ȃ��p�̃��K�����I";	// 59811
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("���I��#19m10")),"���I�� : �������K���݂����ł����A���̎p���ǂ̂悤�Ȃ��̂������̂��킩��܂���ˁB";	// 35416
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("�I�[�����[#19m10")),"�I�[�����[ : ���̂����܂����p�́A��̉��������񂾂낤�c�c�B";	// 33180
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("�~���A��#19m10")),"�~���A�� : �C���V�I�������ɂ���ĉ������ꂽ�̂ł��傤���H";	// 69866
		if(!sleep2(2500)) end;
		unittalk "�z���� : ���ꂪ����������!?�@�����ƌ������͍��̂�����ꂽ�悤�ȁc�c�B";	// 59811
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("���I��#19m10")),"���I�� : �܂�ŃL�����̂悤�ł����ˁB";	// 35416
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("���H�[�N�����f#19m10")),"���H�[�N�����f : ���ʂŖ����̂͊m���ˁB�X�ɒ��ׂ�K�v�͂��邯�ǁB";	// 86073
		if(!sleep2(3000)) end;
		unittalk "�z���� : ���������A���U���đ{�����������ǂ��������B";	// 59811
		if(!sleep2(3000)) end;
		unittalk getnpcid(0, getmdnpcname("�~���A��#19m10")),"�~���A�� : ���X�K���h�����W�����Ƃ����㋉�ȏ�̃��K���́A���ɂ���̂ł��傤���H";	// 69866
		if(!sleep2(3000)) end;
		unittalk "�z���� : �o�S�b�g�̌��������m�F���Ȃ��ẮB";	// 59811
		if(!sleep2(500)) end;
		hideonnpc getmdnpcname("�I�[�����[#19m10");	// 33180
		hideonnpc getmdnpcname("���I��#19m10");	// 35416
		hideonnpc getmdnpcname("�~���A��#19m10");	// 69866
		hideonnpc getmdnpcname("���H�[�N�����f#19m10");	// 86073
		hideonnpc getmdnpcname("�A�[�E�B��#19m10");	// 58881
		hideonnpc getmdnpcname("�A�[�E�B��#19m11");	// 18533
		hideonnpc getmdnpcname("�A�[�E�B��#19m12");	// 34750
		hideonnpc getmdnpcname("�A�[�E�B��#19m13");	// 44763
		if(!sleep2(200)) end;
		hideoffnpc getmdnpcname("sw_1_1");	// 51002
		set .scean,3;
		donpcevent getmdnpcname("�A�[�E�B��#19m20")+ "::OnStart";
		setarray '@xy1,142,58,142,57,142,56,142,55,142,54,142,62,141,62,141,61,141,60,141,59,141,58,141,57,141,56,141,55,141,54;
		for(set '@i,0; '@i < getarraysize('@xy1); set '@i,'@i+2)
			setcell .mdmap$,'@xy1['@i],'@xy1['@i+1],0;
		end;
	case 3:
		unittalk "�z���� : ��ɐi�����B";	// 59811
		viewpoint 2, 242, 66, 1, 0xFFFF00;	// 59811
		viewpoint 2, 237, 61, 2, 0xFFFF00;	// 59811
		viewpoint 2, 221, 37, 3, 0xFFFF00;	// 59811
		viewpoint 2, 249, 79, 4, 0xFFFF00;	// 59811
		viewpoint 2, 114, 20, 5, 0xFFFF00;	// 59811
		viewpoint 1, 114, 119, 99, 0xFF0000;	// 59811
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 59811
	end;
}

1@jorchs.gat,145,59,3	script	�I�[�����[#19m10	10465,{/* 33180 (hide)*/
	end;
OnInit:
	setnpctitle "[����]";	// NPC:�I�[�����[#19m10(33180)
	end;
}
1@jorchs.gat,146,58,3	script	���I��#19m10	10464,{/* 35416 (hide)*/
	end;
OnInit:
	setnpctitle "[����]";	// NPC:���I��#19m10(35416)
	end;
}
1@jorchs.gat,145,56,1	script	�~���A��#19m10	10377,{/* 69866 (hide)*/}
1@jorchs.gat,143,56,1	script	���H�[�N�����f#19m10	10467,{/* 86073 (hide)*/}
1@jorchs.gat,140,57,5	script	�A�[�E�B��#19m10	21517,{/* 58881 (hide)*/}
1@jorchs.gat,143,60,5	script	�A�[�E�B��#19m11	21517,{/* 18533 (hide)*/}
1@jorchs.gat,140,56,5	script	�A�[�E�B��#19m12	21516,{/* 34750 */}
1@jorchs.gat,140,58,5	script	�A�[�E�B��#19m13	21516,{/* 44763 */
	unittalk getnpcid(0, getmdnpcname("�A�[�E�B��#19m12")),"�A�[�E�B�� : ���̐�́A�܂��{�����ς�ł��܂���I";	// 34750
	if(!sleep2(500)) end;
	unittalk getnpcid(0, getmdnpcname("�A�[�E�B��#19m13")),"�A�[�E�B�� : ���͂̈��S���m�ۂ��ꂽ��i������\��ł��I�@�܂��͎��͂̑{���ɐ�O���Ă��������B";	// 44763
	if(!sleep2(500)) end;
	end;
}

1@jorchs.gat,112,116,0	script	sw_2_0	139,14,14,{/* 60886 (hide)*/
	viewpoint 1, 75, 23, 1, 0xFFFF00;	// 60886
	viewpoint 1, 51, 45, 2, 0xFFFF00;	// 60886
	viewpoint 1, 31, 59, 3, 0xFFFF00;	// 60886
	viewpoint 1, 23, 57, 4, 0xFFFF00;	// 60886
	viewpoint 1, 21, 97, 5, 0xFFFF00;	// 60886
	viewpoint 1, 114, 119, 99, 0xFF0000;	// 60886
	end;
}
1@jorchs.gat,112,116,7	script	�A�[�E�B��#19m20	21517,{/* 81046 */
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : �����Ƌ߂Â���",1;
		end;
	}
	switch(.scean) {
	case 3:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		stopnpctimer;
		misceffect 16;	// 81046
		if(!sleep2(500)) end;
		announce "�A�[�E�B�� : ���K����r��������@���������܂�����A���͂̑{�������肢���܂��B", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		if(!sleep2(200)) end;
		hideonnpc getmdnpcname("sw_1_1");	// 51002
		hideonnpc getmdnpcname("�z����#19m10");	// 59811
		hideoffnpc getmdnpcname("sw_2_0");	// 60886
		donpcevent getmdnpcname("ConfusedNestControl3")+ "::OnStart";
		end;
	case 4:
		unittalk "�A�[�E�B�� : ���K���������ǂ�����Ă܂��I�@�z���r��������@���������ł�����A���̊ԂɎ��͂̑{�������肢���܂��I";	// 81046
		viewpoint 1, 75, 23, 1, 0xFFFF00;	// 81046
		viewpoint 1, 51, 45, 2, 0xFFFF00;	// 81046
		viewpoint 1, 31, 59, 3, 0xFFFF00;	// 81046
		viewpoint 1, 23, 57, 4, 0xFFFF00;	// 81046
		viewpoint 1, 21, 97, 5, 0xFFFF00;	// 81046
		viewpoint 1, 114, 119, 99, 0xFF0000;	// 81046
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 81046
	end;
}
1@jorchs.gat,114,119,3	script	�A�[�E�B��#19m21	21517,{/* 51577 */}

1@jorchs.gat,0,0,0	script	ConfusedNestControl3	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set 'mob_num,5;
	set .scean,4;
	hideoffnpc getmdnpcname("���~�߂��ꂽ���K��#19m10");
	hideoffnpc getmdnpcname("���~�߂��ꂽ���K��#19m11");
	set '@label$,getmdnpcname("ConfusedNestControl3")+ "::OnKilled";
	monster .mdmap$,31,59,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,53,44,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,75,23,"�������܂ꂽ�������K��",21535,1,'@label$;
	end;
OnKilled:
	set 'mob_num,'mob_num-1;
	initnpctimer;
	end;
OnTimer500:
	if('mob_num > 0) {
		stopnpctimer;
		announce "�]���ɂ��������肻�����B�{�����p�����悤�]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	else {
		hideoffnpc getmdnpcname("�z����#19m20");	// 52504
		hideonnpc getmdnpcname("sw_2_0");	// 60886
		announce "�]���͂̃��K���͕Еt�����悤���]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	end;
OnTimer3500:
	announce "�z���� : ���K���̕ǂ�������I", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	end;
OnTimer4500:
	misceffect 16,getmdnpcname("�z����#19m20");
	end;
OnTimer6500:
	announce "�]���K���̕ǂ̈ʒu�֌������Ă݂悤�]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	end;
OnTimer8500:
	stopnpctimer;
	set .scean,5;
	donpcevent getmdnpcname("�z����#19m20")+ "::OnStart";
	end;
}

1@jorchs.gat,23,57,5	script	���~�߂��ꂽ���K��#19m10	21600,5,5,{/* 57878 (hide)*/
	// ������
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "���~�߂��ꂽ���K�� : �݂�Ȃǂ��֍s�����񂾁c�c�H�@�������Ȃ��Ɓc�c�c";	// 57878
	end;
OnTimer3000:
	unittalk "���~�߂��ꂽ���K�� : �l�ԁc�c�H�@�l�Ԃ͂����ɗ�������ȁI�@�����������֍s�����I";	// 57878
	end;
OnTimer5000:
	unittalk "���~�߂��ꂽ���K�� : �����I�@���A�g�̂��c�I�@�h�{�܂�ł��Ă�������̂Ɂc�H";	// 57878
	end;
OnTimer7000:
	unittalk "���~�߂��ꂽ���K�� : ���c�����c�c";	// 57878
	end;
OnTimer9000:
	stopnpctimer;
	misceffect 594;	// 57878
	hideonnpc;	// 57878
	set '@label$,getmdnpcname("ConfusedNestControl3")+ "::OnKilled";
	monster .mdmap$,23,57,"�������ꂽ�㋉���K��",21534,1,'@label$;
	end;
}

1@jorchs.gat,21,97,5	script	���~�߂��ꂽ���K��#19m11	21600,5,5,{/* 97573 (hide)*/
	// ������
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "���~�߂��ꂽ���K�� : �������S���֍s���񂾁c�c�����A����!!";	// 97573
	end;
OnTimer3000:
	unittalk "���~�߂��ꂽ���K�� : ���ϐg�����!?�@�ϐg�����ł���Β��S���ɍs�����Ƃ��ł���!!�B";	// 97573
	end;
OnTimer5000:
	unittalk "���~�߂��ꂽ���K�� : �����c���A�����c�c!!";	// 97573
	end;
OnTimer7000:
	unittalk "���~�߂��ꂽ���K�� : �c�c���悢�悾�I�@�����勳���ɂȂ�c�c!?";	// 97573
	end;
OnTimer9000:
	stopnpctimer;
	misceffect 594;	// 97573
	hideonnpc;	// 97573
	set '@label$,getmdnpcname("ConfusedNestControl3")+ "::OnKilled";
	monster .mdmap$,21,97,"�������ꂽ�㋉���K��",21534,1,'@label$;
	end;
}

1@jorchs.gat,112,119,0	script	sw_2_1	139,14,14,{/* 5473 (hide)*/
	viewpoint 2, 23, 57, 1, 0xFFFF00;	// 84096
	viewpoint 2, 21, 97, 2, 0xFFFF00;	// 84096
	viewpoint 2, 75, 23, 3, 0xFFFF00;	// 84096
	viewpoint 2, 51, 45, 4, 0xFFFF00;	// 84096
	viewpoint 2, 31, 59, 5, 0xFFFF00;	// 84096
	viewpoint 1, 142, 144, 1, 0xFFFF00;	// 84096
	viewpoint 1, 159, 151, 2, 0xFFFF00;	// 84096
	viewpoint 1, 180, 139, 3, 0xFFFF00;	// 84096
	viewpoint 1, 200, 131, 4, 0xFFFF00;	// 84096
	viewpoint 1, 216, 135, 5, 0xFFFF00;	// 84096
	viewpoint 1, 226, 141, 6, 0xFFFF00;	// 84096
	viewpoint 1, 236, 151, 7, 0xFFFF00;	// 84096
	viewpoint 1, 251, 171, 99, 0xFF0000;	// 84096
	end;
}
1@jorchs.gat,112,119,5	script	�z����#19m20	21518,{/* 52504 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : �����Ƌ߂Â���",1;
		end;
	}
	switch(.scean) {
	case 4:
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 52504
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 52504
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 52504
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 52504
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 52504
		end;
	case 5:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		stopnpctimer;
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 52504
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 52504
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 52504
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 52504
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 52504
		misceffect 16;	// 52504
		if(!sleep2(500)) end;
		unittalk getnpcid(0, getmdnpcname("�A�[�E�B��#19m20")),"�A�[�E�B�� : ���K�������̌Q�ꂪ�����ǂ��ł��܂��I";	// 81046
		if(!sleep2(2000)) end;
		unittalk "�z���� : �z���r������I�@�ˌ�!!";	// 52504
		if(!sleep2(1500)) end;
		hideonnpc;	// 52504
		hideonnpc getmdnpcname("�A�[�E�B��#19m20");	// 81046
		hideonnpc getmdnpcname("�A�[�E�B��#19m21");	// 51577
		if(!sleep2(1500)) end;
		hideoffnpc getmdnpcname("�z����#19m21");	// 18653
		hideoffnpc getmdnpcname("�A�[�E�B��#19m22");	// 33307
		hideoffnpc getmdnpcname("�A�[�E�B��#19m23");	// 37536
		if(!sleep2(1000)) end;
		misceffect 636,getmdnpcname("�z����#19m21");	// 18653
		misceffect 636,getmdnpcname("�A�[�E�B��#19m22");	// 33307
		misceffect 636,getmdnpcname("�A�[�E�B��#19m23");	// 37536
		misceffect 567,getmdnpcname("�z����#19m21");	// 18653
		misceffect 567,getmdnpcname("�A�[�E�B��#19m22");	// 33307
		misceffect 567,getmdnpcname("�A�[�E�B��#19m23");	// 37536
		misceffect 585,getmdnpcname("�z����#19m21");	// 18653
		misceffect 585,getmdnpcname("�A�[�E�B��#19m22");	// 33307
		misceffect 585,getmdnpcname("�A�[�E�B��#19m23");	// 37536
		unittalk getnpcid(0, getmdnpcname("�z����#19m21")),"�z���� : �����I";	// 18653
		if(!sleep2(1500)) end;
		hideonnpc getmdnpcname("�z����#19m21");	// 18653
		hideonnpc getmdnpcname("�A�[�E�B��#19m22");	// 33307
		hideonnpc getmdnpcname("�A�[�E�B��#19m23");	// 37536
		if(!sleep2(1500)) end;
		hideoffnpc;	// 52504
		hideoffnpc getmdnpcname("�A�[�E�B��#19m20");	// 81046
		hideoffnpc getmdnpcname("�A�[�E�B��#19m21");	// 51577
		unittalk "�z���� : �������߂���I";	// 52504
		if(!sleep2(2000)) end;
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m20");	// 49580
		unittalk getnpcid(0, getmdnpcname("�n�[�g�n���^�[#19m20")),"�n�[�g�n���^�[ : ���������܂ŗ����̂��H";	// 49580
		if(!sleep2(2000)) end;
		unittalk "�z���� : ����́c�c�n�[�g�n���^�[���H";	// 52504
		if(!sleep2(2000)) end;
		unittalk getnpcid(0, getmdnpcname("�n�[�g�n���^�[#19m20")),"�n�[�g�n���^�[ : ������5���h����A�x����v������B�J��Ԃ��x�����c�c�B";	// 49580
		if(!sleep2(2500)) end;
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m21");	// 56070
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m22");	// 69632
		unittalk getnpcid(0, getmdnpcname("�n�[�g�n���^�[#19m22")),"�n�[�g�n���^�[ : �����N�����H";	// 69632
		if(!sleep2(2000)) end;
		unittalk getnpcid(0, getmdnpcname("�n�[�g�n���^�[#19m20")),"�n�[�g�n���^�[ : �N���҂������A�����܂ŗ����B";	// 49580
		if(!sleep2(2500)) end;
		unittalk getnpcid(0, getmdnpcname("�n�[�g�n���^�[#19m21")),"�n�[�g�n���^�[ : �o�S�b�g�l�̌����ʂ肾�ȁB���K���𑀂�A�h�ǂ����o���Ă����ėǂ������B";	// 56070
		if(!sleep2(2000)) end;
		unittalk getnpcid(0, getmdnpcname("�n�[�g�n���^�[#19m20")),"�n�[�g�n���^�[ : �����A��̃��K���𑀂鑕�u�̂��Ƃ��B";	// 49580
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m20")),"�n�[�g�n���^�[ : ���O�͑��̑��u���N�����ɍs���B�����͉������B";	// 89500
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m22")),"�n�[�g�n���^�[ : �悵�A�C�������I";	// 89558
		if(!sleep2(2000)) end;
		hideonnpc getmdnpcname("�n�[�g�n���^�[#19m22");	// 89558
		unittalk "�z���� : �ʂ�ĉ�������C��!?�@���͕ʂꂽ�z��ǂ�����A�����͖`���҂ɔC����I";	// 84414
		if(!sleep2(500)) end;
		donpcevent getmdnpcname("ConfusedNestControl4")+ "::OnStart";
		end;
	case 6:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		stopnpctimer;
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 84414
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 84414
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 84414
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 84414
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 84414
		misceffect 16;	// 84414
		unittalk "�z���� : �ӂ��A�������͕ЂÂ������A���̑��u�͂������������H";	// 84414
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�A�[�E�B��#19m21")),"�A�[�E�B�� : �n�[�g�n���^�[�������Ă������u�ł��ˁH";	// 78716
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�A�[�E�B��#19m20")),"�A�[�E�B�� : �n�[�g�n���^�[�́A���K���𑀂�Ƃ������Ă܂����I";	// 79001
		if(!sleep2(2500)) end;
		unittalk "�z���� : �ӂށB���ꂪ���K���𑀂�ׂ̑��u�Ƃ����킯���B";	// 84414
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�A�[�E�B��#19m21")),"�A�[�E�B�� : �n�[�g�n���^�[��Еt����΁A���K�������̖h�ǂ���̂ł������ł��B";	// 78716
		if(!sleep2(2500)) end;
		unittalk "�z���� : �����݂������ȁB�`���҂͐�ɐi��ł���B���͂��̏��𑼂̕����ɂ����L���ɂ����B";	// 84414
		if(!sleep2(500)) end;
		announce "�z���� : ���K����r�����A��ɐi��ł���I", 0x9, 0x00ffcc;
		if(!sleep2(500)) end;
		hideoffnpc getmdnpcname("sw_2_1");	// 84096
		hideonnpc getmdnpcname("�A�[�E�B��#19m20");	// 79001
		hideonnpc getmdnpcname("�A�[�E�B��#19m21");	// 78716
		set .scean,7;
		misceffect 224,getmdnpcname("�˂���ꂽ���K��#19m20");	// 89738
		misceffect 224,getmdnpcname("�ׂꂽ���K��#19m21");	// 90218
		misceffect 224,getmdnpcname("���ԃ��K��#19m22");	// 90663
		misceffect 224,getmdnpcname("�������ꂽ�㋉���K��#19m23");	// 90904
		misceffect 224,getmdnpcname("�ꂵ��ł郋�K��#19m24");	// 91771
		misceffect 224,getmdnpcname("���킹��ꂽ���K��#19m25");	// 93998
		announce "�]�܂��A���̋��Ƀ��K�����c���Ă���悤���]", 0x9, 0x00ffcc;
		setarray '@xy2, 124,130,124,129,124,128,124,127,124,126,123,130,123,129,123,128,123,127,123,126,122,130,122,129,122,128,122,127,122,126,121,130,121,129,121,128,
						121,127,121,126,120,130,120,129,120,128,120,127,120,126,119,130,119,129,119,128,119,127,119,126,129,126,129,125,129,124,128,126,128,125,128,124,
						127,126,127,125,127,124,126,126,126,125,126,124,125,126,125,125,125,124,124,126,124,125,124,124,123,126,123,125,123,124,122,126,122,125,122,124;
		for(set '@i,0; '@i < getarraysize('@xy2); set '@i,'@i+2)
			setcell .mdmap$,'@xy2['@i],'@xy2['@i+1],0;
		donpcevent getmdnpcname("ConfusedNestControl4")+ "::OnStart2";
		end;
	case 7:
		viewpoint 2, 23, 57, 1, 0xFFFF00;	// 84414
		viewpoint 2, 21, 97, 2, 0xFFFF00;	// 84414
		viewpoint 2, 75, 23, 3, 0xFFFF00;	// 84414
		viewpoint 2, 51, 45, 4, 0xFFFF00;	// 84414
		viewpoint 2, 31, 59, 5, 0xFFFF00;	// 84414
		unittalk "�z���� : ���K����r�����A��ɐi��ł���I";	// 84414
		viewpoint 1, 142, 144, 1, 0xFFFF00;	// 84414
		viewpoint 1, 159, 151, 2, 0xFFFF00;	// 84414
		viewpoint 1, 180, 139, 3, 0xFFFF00;	// 84414
		viewpoint 1, 200, 131, 4, 0xFFFF00;	// 84414
		viewpoint 1, 216, 135, 5, 0xFFFF00;	// 84414
		viewpoint 1, 226, 141, 6, 0xFFFF00;	// 84414
		viewpoint 1, 236, 151, 7, 0xFFFF00;	// 84414
		viewpoint 1, 251, 171, 99, 0xFF0000;	// 84414
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 52504
	end;
}

1@jorchs.gat,118,127,7	script	�z����#19m21	21518,{/* 18653 (hide)*/}
1@jorchs.gat,122,126,7	script	�A�[�E�B��#19m22	21517,{/* 33307 (hide)*/}
1@jorchs.gat,124,124,7	script	�A�[�E�B��#19m23	21517,{/* 37536 (hide)*/}

1@jorchs.gat,120,129,1	script	�˂���ꂽ���K��#19m20	21535,{/* 59918 */}
1@jorchs.gat,120,127,3	script	�ׂꂽ���K��#19m21	21535,{/* 85717 */}
1@jorchs.gat,122,127,3	script	���ԃ��K��#19m22	21535,{/* 18674 */}
1@jorchs.gat,123,127,1	script	�������ꂽ�㋉���K��#19m23	21534,{/* 41048 */}
1@jorchs.gat,124,126,3	script	�ꂵ��ł郋�K��#19m24	21535,{/* 53325 */}
1@jorchs.gat,125,125,3	script	���킹��ꂽ���K��#19m25	21535,{/* 73571 */}
1@jorchs.gat,126,125,3	script	�˂���ꂽ���K��#19m26	21535,{/* 38462 */}

1@jorchs.gat,119,123,3	script	�n�[�g�n���^�[#19m20	21536,{/* 49580 (hide)*/}
1@jorchs.gat,116,124,3	script	�n�[�g�n���^�[#19m21	21536,{/* 56070 (hide)*/}
1@jorchs.gat,123,124,3	script	�n�[�g�n���^�[#19m22	21536,{/* 69632 (hide)*/}

1@jorchs.gat,0,0,0	script	ConfusedNestControl4	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideoffnpc getmdnpcname("���~�߂��ꂽ���K��#19m10");
	hideonnpc getmdnpcname("�z����#19m20");	// 84414
	hideonnpc getmdnpcname("�A�[�E�B��#19m20");	// 79001
	hideonnpc getmdnpcname("�A�[�E�B��#19m21");	// 78716
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m20");	// 89500
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m21");	// 89545
	set '@label$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled";
	monster .mdmap$,119,123,"�n�[�g�n���^�[AT",21536,1,'@label$;
	monster .mdmap$,122,123,"�n�[�g�n���^�[AT",21536,1,'@label$;
	monster .mdmap$,118,125,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,122,123,"�������܂ꂽ�������K��",21535,1,'@label$;
	end;
OnKilled:
	set '@mob,getmapmobs(.mdmap$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled");
	if('@mob <= 0) {
		initnpctimer;
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m20");	// 89500
		announce "�n�[�g�n���^�[ : �����A���̂܂܏I���Ǝv���Ȃ�c�c�I", 0x9, 0x00ffcc;
	}
	end;
OnTimer1500:
	set 'mob_num,5;
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m20");	// 89500
	hideonnpc getmdnpcname("�˂���ꂽ���K��#19m20");	// 89738
	monster .mdmap$,118,127,"�������܂ꂽ�������K��",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	hideonnpc getmdnpcname("���ԃ��K��#19m22");	// 90663
	hideonnpc getmdnpcname("�ꂵ��ł郋�K��#19m24");	// 91771
	hideonnpc getmdnpcname("���킹��ꂽ���K��#19m25");	// 93998
	monster .mdmap$,124,123,"�������܂ꂽ�������K��",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	end;
OnTimer4500:
	stopnpctimer;
	hideonnpc getmdnpcname("�ׂꂽ���K��#19m21");	// 90218
	monster .mdmap$,120,125,"�������܂ꂽ�������K��",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19m23");	// 90904
	monster .mdmap$,121,124,"�������܂ꂽ�������K��",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	hideonnpc getmdnpcname("�˂���ꂽ���K��#19m26");	// 94367
	monster .mdmap$,123,123,"�������܂ꂽ�������K��",21535,1,getmdnpcname("ConfusedNestControl4")+ "::OnKilled2";
	end;
OnKilled2:
	set 'mob_num,'mob_num - 1;;
	if('mob_num <= 0) {
		hideoffnpc getmdnpcname("�z����#19m20");	// 84414
		hideoffnpc getmdnpcname("�A�[�E�B��#19m20");	// 79001
		hideoffnpc getmdnpcname("�A�[�E�B��#19m21");	// 78716
		unittalk getnpcid(0,getmdnpcname("�z����#19m20")),"�z���� : ���������Еt�����I�@�b������������A�������ɂ��Ă���I";	// 84414
		announce "�z���� : ���������Еt�����I�@�b������������A�������ɂ��Ă���I", 0x9, 0x00ffcc;
		donpcevent getmdnpcname("�z����#19m20")+ "::OnStart";
		set .scean,6;
	}
	end;
OnStart2:
	if('flag == 2)
		end;
	set 'flag,2;
	set '@label$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled3";
	monster .mdmap$,142,144,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,159,151,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,180,139,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,200,131,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,216,135,"�������܂ꂽ�������K��",21535,1,'@label$;
	monster .mdmap$,226,141,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,236,151,"�������ꂽ�㋉���K��",21534,1,'@label$;
	end;
OnKilled3:
	set '@mob,getmapmobs(.mdmap$,getmdnpcname("ConfusedNestControl4")+ "::OnKilled3");
	if('@mob <= 0) {
		announce "�]���̋�悩�烋�K���̋C�z���������B���֐i�����]", 0x9, 0x00ffcc;
		hideoffnpc getmdnpcname("���H�[�N�����f#19m30");	// 30262
		hideoffnpc getmdnpcname("�~���A��#19m30");	// 30263
		donpcevent getmdnpcname("���H�[�N�����f#19m30")+ "::OnStart";	// 30262
	}
	else
		announce "�]�܂��A���̋��Ƀ��K�����c���Ă���悤���]", 0x9, 0x00ffcc;
	end;
}

1@jorchs.gat,251,171,0	script	sw_3_0	139,14,14,{/* 30256 (hide)*/
	viewpoint 2, 142, 144, 1, 0xFFFF00;	// 30256
	viewpoint 2, 159, 151, 2, 0xFFFF00;	// 30256
	viewpoint 2, 180, 139, 3, 0xFFFF00;	// 30256
	viewpoint 2, 200, 131, 4, 0xFFFF00;	// 30256
	viewpoint 2, 216, 135, 5, 0xFFFF00;	// 30256
	viewpoint 2, 226, 141, 6, 0xFFFF00;	// 30256
	viewpoint 2, 236, 151, 7, 0xFFFF00;	// 30256
	viewpoint 2, 251, 171, 99, 0xFF0000;	// 30256
	if(.scean == 8)
		viewpoint 1, 219, 148, 1, 0xFF3355;	// 30256
	if(.scean == 9)
		viewpoint 1, 226, 244, 1, 0xFF3355;	// 30256
	if(.scean == 10)
		viewpoint 1, 191, 203, 1, 0xFF3355;	// 30256
	end;
}

1@jorchs.gat,251,171,1	script	���H�[�N�����f#19m30	10467,{/* 30262 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : �����Ƌ߂Â���",1;
		end;
	}
	switch(.scean) {
	case 7:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		stopnpctimer;
		viewpoint 2, 142, 144, 1, 0xFFFF00;	// 30262
		viewpoint 2, 159, 151, 2, 0xFFFF00;	// 30262
		viewpoint 2, 180, 139, 3, 0xFFFF00;	// 30262
		viewpoint 2, 200, 131, 4, 0xFFFF00;	// 30262
		viewpoint 2, 216, 135, 5, 0xFFFF00;	// 30262
		viewpoint 2, 226, 141, 6, 0xFFFF00;	// 30262
		viewpoint 2, 236, 151, 7, 0xFFFF00;	// 30262
		misceffect 16;	// 30262
		if(!sleep2(500)) end;
		announce "���H�[�N�����f : ���K���������W�܂��Ă����ˁB", 0x9, 0x00ffcc;
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�~���A��#19m30")),"�~���A�� : �`���җl�A���v�ł����H";	// 30263
		if(!sleep2(2000)) end;
		unittalk "���H�[�N�����f : ���K���������A�n�[�g�n���^�[�ɑ����Ă���񂾂��āH";	// 30262
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�~���A��#19m30")),"�~���A�� : ���Ԃ�h��ǂɎg���Ȃ�āc�c�B";	// 30263
		if(!sleep2(2000)) end;
		unittalk "���H�[�N�����f : ����ȗǐS������Ȃ�A���������̂���������Ȃ�Ă��Ȃ����B";	// 30262
		if(!sleep2(2000)) end;
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m30");	// 30264
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m31");	// 30265
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m32");	// 30266
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m30")),"�n�[�g�n���^�[ : �������͖]��ŁA���̐g�̂���ɓ��ꂽ�񂾁B";	// 30264
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m31")),"�n�[�g�n���^�[ : ���̏㋉���K���������������B";	// 30265
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m32")),"�n�[�g�n���^�[ : �ŏ㋉�ɐ����`�����X�Ɠ`������A�݂�ȂŊ��ŗ�ɕ��񂾂�B";	// 30266
		if(!sleep2(2500)) end;
		unittalk "���H�[�N�����f : ���̒������K���������]��ł��̎p�ɂȂ����̂����H";	// 30262
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m30")),"�n�[�g�n���^�[ : �c�c���������͎d�����Ȃ������B";	// 30264
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m32")),"�n�[�g�n���^�[ : ���܂��܁A���R�A����������ɂ����������ȁB";	// 30266
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�~���A��#19m30")),"�~���A�� : �㋉�ȏ�̃��K�����W�߂āA�����������H";	// 30263
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m32")),"�n�[�g�n���^�[ : �����ė~�����H�@�ǂ����悤���ȁ`�B";	// 30266
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("���H�[�N�����f#19m30")),"���H�[�N�����f : ������͂����̎��ԉ҂��ˁB����ɂ���K�v�͂Ȃ���B";	// 30262
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m30")),"�n�[�g�n���^�[ : �o�����H�@���������������ƗV��ŗ~�����Ȃ��I�@�����I";	// 30264
		if(!sleep2(2000)) end;
		misceffect 563,getmdnpcname("�n�[�g�n���^�[#19m32");	// 30266
		announce "�������u1���ғ�����܂����B", 0x9, 0x00ffcc;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m32")),"�n�[�g�n���^�[ : �㋉�����u���ɛz�������鑕�u���I";	// 30266
		misceffect 515,getmdnpcname("�n�[�g�n���^�[#19m32");	// 30266
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m32")),"�n�[�g�n���^�[ : ���u���N�����Ă������A�@�������ꂽ�㋉���K�������X�����ďo�Ă��邺�B";	// 30266
		if(!sleep2(2500)) end;
		unittalk "���H�[�N�����f : �܂葕�u���~�߂�Ηǂ��킯�ˁB�����Ă���Ă��肪�Ƃ��B";	// 30262
		emotion 23,getmdnpcname("�n�[�g�n���^�[#19m30");	// 30264
		emotion 23,getmdnpcname("�n�[�g�n���^�[#19m31");	// 30265
		emotion 23,getmdnpcname("�n�[�g�n���^�[#19m32");	// 30266
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m31")),"�n�[�g�n���^�[ : �����͂�������I�@�x�����ĂׁI";	// 30265
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m30")),"�n�[�g�n���^�[ : ���͎��̑��u�Ɍ������I";	// 30264
		if(!sleep2(2000)) end;
		hideonnpc getmdnpcname("�n�[�g�n���^�[#19m30");	// 30264
		hideonnpc getmdnpcname("�n�[�g�n���^�[#19m31");	// 30265
		hideonnpc getmdnpcname("�n�[�g�n���^�[#19m32");	// 30266
		unittalk "���H�[�N�����f : �܂��͖ڂ̑O�ɂ��郋�K����|���܂��傤!!";	// 30262
		hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30267
		set '@label$,getmdnpcname("���H�[�N�����f#19m30")+ "::OnKilled";
		monster .mdmap$,249,175,"�������ꂽ�㋉���K��",21534,1,'@label$;
		hideonnpc getmdnpcname("�˂���ꂽ���K��#19m37");	// 30274
		monster .mdmap$,242,173,"�������܂ꂽ�������K��",21535,1,'@label$;
		if(!sleep2(3000)) end;
		hideonnpc getmdnpcname("�˂���ꂽ���K��#19m31");	// 30268
		monster .mdmap$,248,175,"�������܂ꂽ�������K��",21535,1,'@label$;
		hideonnpc getmdnpcname("�ׂꂽ���K��#19m35");	// 30272
		monster .mdmap$,244,175,"�������܂ꂽ�������K��",21535,1,'@label$;
		if(!sleep2(3000)) end;
		hideonnpc getmdnpcname("���킹��ꂽ���K��#19m3");	// 30269
		monster .mdmap$,247,175,"�������܂ꂽ�������K��",21535,1,'@label$;
		hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30271
		monster .mdmap$,245,175,"�������ꂽ�㋉���K��",21534,1,'@label$;
		if(!sleep2(3000)) end;
		hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30273
		monster .mdmap$,243,173,"�������ꂽ�㋉���K��",21534,1,'@label$;
		hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30270
		monster .mdmap$,246,175,"�������ꂽ�㋉���K��",21534,1,'@label$;
		//10�b���Ƃ�!~!!!!!�����_��
		unittalk "!!!!!";	// 30262
		unittalk getnpcid(0,getmdnpcname("�~���A��#19m30")),"!!!!!";	// 30263
		end;
	case 8:
		viewpoint 2, 142, 144, 1, 0xFFFF00;	// 30262
		viewpoint 2, 159, 151, 2, 0xFFFF00;	// 30262
		viewpoint 2, 180, 139, 3, 0xFFFF00;	// 30262
		viewpoint 2, 200, 131, 4, 0xFFFF00;	// 30262
		viewpoint 2, 216, 135, 5, 0xFFFF00;	// 30262
		viewpoint 2, 226, 141, 6, 0xFFFF00;	// 30262
		viewpoint 2, 236, 151, 7, 0xFFFF00;	// 30262
		misceffect 16;	// 30262
		unittalk "���H�[�N�����f : ���̐�ɓ������n�[�g�n���^�[�́A���������ǂ���B";	// 30262
		viewpoint 1, 219, 148, 1, 0xFF3355;	// 30262
		if(!sleep2(500)) end;
		unittalk "���H�[�N�����f : �������ǁA��������߂��āA�������u���~�߂Ă��傤�����B";	// 30262
		setarray '@xy3, 250,177,250,176,249,177,249,176,248,177,248,176,247,177,247,176,246,177,246,176,245,177,245,176,244,177,244,176,243,177,243,176,243,175,243,174,242,177,
						242,176,242,175,242,174,241,177,241,176,241,175,241,174,240,177,240,176,240,175,240,174,239,177,239,176,239,175,239,174,238,177,238,176,238,175,238,174;
		for(set '@i,0; '@i < getarraysize('@xy3); set '@i,'@i+2)
			setcell .mdmap$,'@xy3['@i],'@xy3['@i+1],0;
		if(!sleep2(2000)) end;
		hideonnpc;	// 30262
		hideonnpc getmdnpcname("�~���A��#19m30");	// 30263
		hideoffnpc getmdnpcname("sw_3_0");	// 30256
		hideoffnpc getmdnpcname("�������u1#19m30");
		announce "�]�������u1���ғ����܂����]", 0x9, 0x00ffcc;
		donpcevent getmdnpcname("�������u1#19m30")+ "::OnStart";
		end;
	}
	end;
OnKilled:
	set '@mob,getmapmobs(.mdmap$,getmdnpcname("���H�[�N�����f#19m30")+ "::OnKilled");
	if('@mob <= 0) {
		announce "���H�[�N�����f : �Еt�����݂����ˁB", 0x9, 0x00ffcc;
		unittalk "���H�[�N�����f : �Еt�����݂����ˁB";	// 30262
		set .scean,8;
		initnpctimer;
		//������^�C�~���O������
		hideonnpc getmdnpcname("sw_2_1");	// 30906
		hideonnpc getmdnpcname("�z����#19m20");	// 30940
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 52504
	end;
}
1@jorchs.gat,249,170,1	script	�~���A��#19m30	10377,{/* 30263 (hide)*/}
1@jorchs.gat,248,173,5	script	�n�[�g�n���^�[#19m30	21536,{/* 30264 (hide)*/}
1@jorchs.gat,246,173,5	script	�n�[�g�n���^�[#19m31	21536,{/* 30265 (hide)*/}
1@jorchs.gat,243,173,5	script	�n�[�g�n���^�[#19m32	21536,{/* 30266 (hide)*/}
1@jorchs.gat,249,177,1	script	�������ꂽ�㋉���K��#19	21534,{/* 30267 */}
1@jorchs.gat,248,176,3	script	�˂���ꂽ���K��#19m31	21535,{/* 30268 */}
1@jorchs.gat,247,176,3	script	���킹��ꂽ���K��#19m3	21535,{/* 30269 */}
1@jorchs.gat,246,176,1	script	�������ꂽ�㋉���K��#19	21534,{/* 30270 */}
1@jorchs.gat,245,176,3	script	�������ꂽ�㋉���K��#19	21534,{/* 30271 */}
1@jorchs.gat,244,176,3	script	�ׂꂽ���K��#19m35	21535,{/* 30272 */}
1@jorchs.gat,243,175,3	script	�������ꂽ�㋉���K��#19	21534,{/* 30273 */}
1@jorchs.gat,242,174,3	script	�˂���ꂽ���K��#19m37	21535,{/* 30274 */}

1@jorchs.gat,219,148,5	script	�������u1#19m30	10043,{/* 30275 (hide)*/
	if('flag) {
		unittalk getcharid(3),strcharinfo(0)+" : ���̑��u�֌�������",1;	// self:hidden
		viewpoint 1, 226, 244, 1, 0xFF3355;	// 30275
		end;
	}
	set '@label$,getmdnpcname("�������u1#19m30")+ "::OnKilled";
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
		end;
	}
	if(getmapmobs(.mdmap$,'@label$) > 0) {
		unittalk "�]���͑���ł��Ȃ��]";	// 30275
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �߂��̗����烋�K�������܂ꂽ�悤��";
	viewpoint 1, 227, 153, 2, 0xFFFF00;	// 30275
	misceffect 456;	// 30275
	misceffect 496;	// 30275
	set '@mob[0],callmonster(.mdmap$,227,153,"�������ꂽ�㋉���K��",21534,'@label$);
	set '@mob[1],callmonster(.mdmap$,224,151,"�n�[�g�n���^�[AT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,225,141,"�n�[�g�n���^�[AT#2",21536,'@label$);
	set '@mob[3],callmonster(.mdmap$,217,141,"�n�[�g�n���^�[AT#3",21536,'@label$);
	unittalk '@mob[1],"�n�[�g�n���^�[ : ���u�͉ғ������̂ɁA�z�������͈̂�C��������!?";	// 78866:�n�[�g�n���^�[AT#1
	unittalk '@mob[2],"�n�[�g�n���^�[ : �������u���~�߂��̂�!!�@�z���ł��Ȃ��������c�͑S�ł��I";	// 78867:�n�[�g�n���^�[AT#2
	unittalk '@mob[3],"�n�[�g�n���^�[ : �n�b�I�@�Ă΂�ė��Ă݂�΁A���̃U�}����!!";	// 78868:�n�[�g�n���^�[AT#3
	end;
OnKilled:
	if(getmapmobs(.mdmap$,getmdnpcname("�������u1#19m30")+ "::OnKilled") <= 0) {
		set 'flag,1;
		set .scean,9;
		announce "�]�������u1����~���܂����]", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		announce "�]�������u2���ǉ��ғ�����܂��]", 0x9, 0x00ffcc;
		hideoffnpc getmdnpcname("�������u2#19m31");
		donpcevent getmdnpcname("�������u2#19m31")+ "::OnStart";
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30275
	end;
}
1@jorchs.gat,226,244,7	script	�������u2#19m31	10043,{/* 30276 (hide)*/
	if('flag) {
		unittalk getcharid(3),strcharinfo(0)+" : ���̑��u�֌�������",1;	// self:hidden
		viewpoint 1, 191, 203, 1, 0xFF3355;	// 30276
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
		end;
	}
	if(getmapmobs(.mdmap$,getmdnpcname("�������u2#19m31")+ "::OnKilled") > 0) {
		unittalk "�]���͑���ł��Ȃ��]";	// 30276
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �k�̕��̗����烋�K�������܂ꂽ�悤��";
	viewpoint 1, 223, 278, 2, 0xFFFF00;	// 30276
	misceffect 456;	// 30276
	misceffect 496;	// 30276
	monster .mdmap$,223,278,"�������ꂽ�㋉���K��",21534,1,getmdnpcname("�������u2#19m31")+ "::OnKilled";
	end;
OnKilled:
	if(getmapmobs(.mdmap$,getmdnpcname("�������u2#19m31")+ "::OnKilled") <= 0) {
		set 'flag,1;
		set .scean,10;
		announce "�]�������u2����~���܂����]", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		announce "�]�������u3���ǉ��ғ�����܂��]", 0x9, 0x00ffcc;
		hideoffnpc getmdnpcname("�������u3#19m32");
		donpcevent getmdnpcname("�������u3#19m32")+ "::OnStart";
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30276
	end;
}
1@jorchs.gat,191,203,7	script	�������u3#19m32	10043,{/* 30277 (hide)*/
	if('flag) {
		unittalk getcharid(3),strcharinfo(0)+" : ��������쐼�ŒN�����Ă�ł���悤��",1;	// self:hidden
		viewpoint 1, 151, 179, 1, 0xFF3355;	// 30277
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
		end;
	}
	if(getmapmobs(.mdmap$,getmdnpcname("�������u3#19m32")+ "::OnKilled") > 0) {
		unittalk "�]���͑���ł��Ȃ��]";	// 30277
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �߂��̗����烋�K�������܂ꂽ�悤��";	// self:hidden
	viewpoint 1, 197, 205, 2, 0xFFFF00;	// 30277
	misceffect 456;	// 30277
	misceffect 496;	// 30277
	monster .mdmap$,197,205,"�������ꂽ�㋉���K��",21534,1,getmdnpcname("�������u3#19m32")+ "::OnKilled";
	end;
OnKilled:
	if(getmapmobs(.mdmap$,getmdnpcname("�������u3#19m32")+ "::OnKilled") <= 0) {
		set 'flag,1;
		set .scean,11;
		announce "�]�������u3����~���܂����]", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		hideoffnpc getmdnpcname("�I�[�����[#19m40");	// 30282
		hideoffnpc getmdnpcname("���I��#19m40");	// 30284
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m40");	// 30285
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m41");	// 30286
		hideoffnpc getmdnpcname("�n�[�g�n���^�[#19m42");	// 30287
		hideoffnpc getmdnpcname("sw_4_0");	// 30280
		announce "�I�[�����[ : ���̕��ɗ��Ă���邩����H", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		donpcevent getmdnpcname("�I�[�����[#19m40")+ "::OnStart";
		end;
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30277
	end;
}
1@jorchs.gat,145,179,0	script	sw_4_0	139,14,14,{/* 30280 */
	//?�A������
	end;
}
1@jorchs.gat,145,179,0	script	sw_4_1	139,14,14,{/* 30281 (hide)*/
	viewpoint 1, 16, 135, 1, 0x99FFFF;	// 30281
	viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30281
	viewpoint 1, 24, 142, 3, 0x99FFFF;	// 30281
	viewpoint 1, 97, 220, 4, 0xFF0000;	// 30281
	viewpoint 1, 121, 190, 5, 0xFFFF00;	// 30281
	viewpoint 1, 86, 165, 6, 0xFFFF00;	// 30281
	viewpoint 1, 79, 154, 7, 0xFFFF00;	// 30281
	viewpoint 1, 45, 153, 8, 0xFFFF00;	// 30281
	viewpoint 1, 25, 172, 9, 0xFFFF00;	// 30281
	viewpoint 2, 97, 220, 99, 0xFF0000;	// 30281
	end;
}
1@jorchs.gat,145,179,1	script	�I�[�����[#19m40	10465,{/* 30282 (hide)*/
	if(distance(getcharid(3)) > 10) {
		unittalk getcharid(3),strcharinfo(0)+" : �����Ƌ߂Â���",1;
		end;
	}
	switch(.scean) {
	case 11:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			//������
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		stopnpctimer;
		viewpoint 2, 145, 179, 99, 0xFF0000;	// 30282
		misceffect 16;	// 30282
		hideonnpc getmdnpcname("sw_4_0");	// 30280
		misceffect 453,getmdnpcname("�n�[�g�n���^�[#19m40");	// 30285
		misceffect 453,getmdnpcname("�n�[�g�n���^�[#19m41");	// 30286
		misceffect 453,getmdnpcname("�n�[�g�n���^�[#19m42");	// 30287
		unittalk "�I�[�����[ : ���O�����́A�����ȏꏊ�Ŗ����N�����Ă��邻���ˁH";	// 30282
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("���I��#19m40")),"���I�� : �ǂ��^�C�~���O�ŗ��Ă���܂����ˁB";	// 30284
		if(!sleep2(3000)) end;
		announce "�������u3���ĉғ�����܂��B", 0x9, 0x00ffcc;
		unittalk "�I�[�����[ : ���̎҂͎��������������~�߂Ă�������A�������u�Ƃ����~�߂Ă���Ȃ�������H";	// 30282
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("���I��#19m40")),"���I�� : �N���ɂ͑��u�̑�����@���킩��Ȃ��āc�c���������͎̂Ⴂ�l�ɂ��C�����܂��B";	// 30284
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m40")),"�n�[�g�n���^�[ : ������!?�@�g�̂������Ȃ��I";	// 30285
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m41")),"�n�[�g�n���^�[ : ����!?�@���̓����Ȃ��H";	// 30286
		if(!sleep2(2000)) end;
		unittalk "�I�[�����[ : ���ꂪ�������̗͂�B";	// 30282
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("���I��#19m40")),"���I�� : ���āA�N�����ɂ͕����������Ƃ�����B";	// 30284
		if(!sleep2(3000)) end;
		announce "�I�[�����[ : �������u���~�߂ė��Ă��傤�����B", 0x9, 0x00ffcc;
		//20�b���ɒǉ��ŕ���
		set '@label$,getmdnpcname("�������u3#19m40")+ "::OnKilled";
		monster .mdmap$,199,197,"�������ꂽ�㋉���K��",21534,1,'@label$;
		hideonnpc getmdnpcname("�������u3#19m32");	// 30277
		hideoffnpc getmdnpcname("�������u3#19m40");	// 30283
		set .scean,12;
		end;
	case 12:
		viewpoint 2, 145, 179, 99, 0xFF0000;	// 30282
		unittalk "�I�[�����[ : �܂��͒������u���~�߂Ȃ��ƁB�����͎����H���~�߂Ă�����B";	// 30282
		viewpoint 1, 192, 206, 99, 0xFF0000;	// 30282
		end;
	case 13:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		viewpoint 2, 145, 179, 99, 0xFF0000;	// 30282
		viewpoint 2, 192, 206, 99, 0xFF0000;	// 30282
		misceffect 16;	// 30282
		if(!sleep2(500)) end;
		unittalk "�I�[�����[ : �������u���~�߂Ă���ď���������B";	// 30282
		if(!sleep2(2000)) end;
		unittalk "�I�[�����[ : �㋉�ȏ�̃��K�������́A���X�K���h�̕����ɏW�߂�ꂽ������B";	// 30282
		if(!sleep2(3000)) end;
		unittalk "�I�[�����[ : ���X�K���h�ƃo�S�b�g���������ł���̂��c�c�B";	// 30282
		if(!sleep2(2000)) end;
		unittalk "�I�[�����[ : �}���ŁA���X�K���h�̕����Ɍ������܂��傤�B";	// 30282
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m42")),"�n�[�g�n���^�[ : ��������������Ă���I�@�m���Ă��邱�Ƃ͘b��������!?";	// 30287
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("���I��#19m40")),"���I�� : �ӂށc�c�ǂ����悤���B";	// 30284
		emotion 0,getmdnpcname("���I��#19m40");	// 30284
		misceffect 563,getmdnpcname("���I��#19m40");	// 30284
		announce "���͑������u�A�S�͉ғ�!!!", 0x9, 0x00ffcc;
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("���I��#19m40")),"���I�� : ����H�@���̗͂��ꂪ���������ȁH";	// 30284
		if(!sleep2(2000)) end;
		unittalk "�I�[�����[ : �����̓x�e�����ł��鎄�������Ώ����������ǂ������ˁB";	// 30282
		if(!sleep2(2500)) end;
		unittalk getnpcid(0,getmdnpcname("���I��#19m40")),"���I�� : �����͂��C�����܂��B";	// 30284
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("���I��#19m40")),"���I�� : �}�Ő\���󂠂�܂��񂪁A��낵�����肢���܂��B";	// 30284
		if(!sleep2(2000)) end;
		hideonnpc getmdnpcname("���I��#19m40");	// 30284
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m40")),"�n�[�g�n���^�[ : ����Ɖ�����ꂽ���I";	// 30285
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m41")),"�n�[�g�n���^�[ : �`���҂�����Ȃ�r�r��K�v�͂˂��I�@�|�����Ă��ȁI";	// 30286
		if(!sleep2(2000)) end;
		unittalk "�I�[�����[ : ����@��������āc�c���ꂶ�Ⴀ�A��͂��肢�ˁB�B";	// 30282
		donpcevent getmdnpcname("ConfusedNestControl5")+ "::OnStart";
		end;
	}
	end;
OnInit:
	setnpctitle "[����]";	// NPC:�I�[�����[#19m40(30282)
	end;
}
1@jorchs.gat,192,206,5	script	�������u3#19m40	10043,5,5,{/* 30283 (hide)*/
	if(.scean == 13) {
		viewpoint 1, 151, 179, 99, 0xFF0000;	// 30283
		unittalk getcharid(3),strcharinfo(0)+" : �I�[�����[�̏��֌�������",1;	// self:hidden
		end;
	}
	switch('flag) {
	case 0:
		set '@label$,getmdnpcname("�������u3#19m40")+ "::OnKilled";
		if('flag == 0 && getmapmobs(.mdmap$,'@label$) == 0) {
			set 'flag,1;
			set '@mob[1],callmonster(.mdmap$,191,199,"�n�[�g�n���^�[AT#1",21536,'@label$);
			set '@mob[2],callmonster(.mdmap$,199,197,"�n�[�g�n���^�[AT#2",21536,'@label$);
			set '@mob[3],callmonster(.mdmap$,202,207,"�n�[�g�n���^�[AT#3",21536,'@label$);
			unittalk '@mob[1],"�n�[�g�n���^�[ : �������傤�I�@���u���~�������̂�!!";	// 93280:�n�[�g�n���^�[AT#1
			unittalk '@mob[2],"�n�[�g�n���^�[ : �������痣�ꂽ�����A���O�̂��߂����I";	// 93281:�n�[�g�n���^�[AT#2
			unittalk '@mob[3],"�n�[�g�n���^�[ : �����N���Ă��m��Ȃ������!!";	// 93282:�n�[�g�n���^�[AT#3
		}
		end;
	case 1:
		end;
	case 2:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			unittalk "�]�p�[�e�B�[���[�_�[���i�s���J�n����܂ł��҂����������]",1;
			end;
		}
		if(EP19_1QUE != 67) {
			// ������
			end;
		}
		unittalk "�]�������u����~����܂����]";	// 30283
		if(!sleep2(500)) end;
		announce "�I�[�����[ : ���u����~������ˁB������֗��Ă��傤�����B", 0x9, 0x00ffcc;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �I�[�����[�̏��֌�������",1;	// self:hidden
		donpcevent getmdnpcname("�I�[�����[#19m40")+ "::OnStart";
		viewpoint 1, 151, 179, 99, 0xFF0000;	// 30283
		set .scean,13;
		end;
	}
	end;
OnTouch:
	set '@label$,getmdnpcname("�������u3#19m40")+ "::OnKilled";
	if('flag == 0 && getmapmobs(.mdmap$,'@label$) == 0) {
		set 'flag,1;
		set '@mob[1],callmonster(.mdmap$,191,199,"�n�[�g�n���^�[AT#1",21536,'@label$);
		set '@mob[2],callmonster(.mdmap$,199,197,"�n�[�g�n���^�[AT#2",21536,'@label$);
		set '@mob[3],callmonster(.mdmap$,202,207,"�n�[�g�n���^�[AT#3",21536,'@label$);
		unittalk '@mob[1],"�n�[�g�n���^�[ : �������傤�I�@���u���~�������̂�!!";	// 93280:�n�[�g�n���^�[AT#1
		unittalk '@mob[2],"�n�[�g�n���^�[ : �������痣�ꂽ�����A���O�̂��߂����I";	// 93281:�n�[�g�n���^�[AT#2
		unittalk '@mob[3],"�n�[�g�n���^�[ : �����N���Ă��m��Ȃ������!!";	// 93282:�n�[�g�n���^�[AT#3
	}
	end;
OnKilled:
	set '@label$,getmdnpcname("�������u3#19m40")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) <= 0) {
		sleep 500;
		set 'flag,2;
		announce "�]���͂̓G�͂��Ȃ��Ȃ����B�������u3���~�����悤�]", 0x9, 0x00ffcc;
		donpcevent getmdnpcname("�������u3#19m40")+ "::OnStart";
	}
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30283
	end;
}
1@jorchs.gat,144,177,1	script	���I��#19m40	10464,{/* 30284 (hide)*/
	end;
OnInit:
	setnpctitle "[����]";	// NPC:���I��#19m40(30284)
	end;
}
1@jorchs.gat,143,179,5	script	�n�[�g�n���^�[#19m40	21536,{/* 30285 (hide)*/}
1@jorchs.gat,143,178,5	script	�n�[�g�n���^�[#19m41	21536,{/* 30286 (hide)*/}
1@jorchs.gat,144,180,5	script	�n�[�g�n���^�[#19m42	21536,{/* 30287 (hide)*/}

1@jorchs.gat,0,0,0	script	ConfusedNestControl5	-1,{
OnStart:
	initnpctimer;
	end;
OnTimer500:
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("�I�[�����[#19m40");	// 30282
	hideonnpc getmdnpcname("�ׂꂽ���K��#19m41");	// 30931
	monster .mdmap$,141,182,"�������܂ꂽ�������K��",21535,1,'@label$;
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m41");	// 30286
	monster .mdmap$,149,178,"�n�[�g�n���^�[AT",21536,1,'@label$;
	end;
OnTimer3500:
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30288
	monster .mdmap$,141,183,"�������ꂽ�㋉���K��",21534,1,'@label$;
	hideonnpc getmdnpcname("�˂���ꂽ���K��#19m44");	// 30882
	monster .mdmap$,141,179,"�������܂ꂽ�������K��",21535,1,'@label$;
	end;
OnTimer6500:
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30134
	monster .mdmap$,141,181,"�������ꂽ�㋉���K��",21534,1,'@label$;
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30139
	monster .mdmap$,141,180,"�������ꂽ�㋉���K��",21534,1,'@label$;
	end;
OnTimer9500:
	stopnpctimer;
	set 'flag,1;
	set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled";
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m42");	// 30287
	monster .mdmap$,150,180,"�n�[�g�n���^�[AT",21536,1,'@label$;
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m40");	// 30285
	monster .mdmap$,149,179,"�n�[�g�n���^�[AT",21536,1,'@label$;
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30909
	monster .mdmap$,141,178,"�������ꂽ�㋉���K��",21534,1,'@label$;
	end;
OnKilled:
	if('flag && getmapmobs(.mdmap$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled") <= 0) {
		hideoffnpc getmdnpcname("sw_4_1");	// 30281
		announce "�z���� : �C���V�I���̋��ɓ�������I�@�N���m�F���Ă���I", 0x9, 0x00ffcc;
		set '@label$,getmdnpcname("ConfusedNestControl5")+ "::OnKilled2";
		monster .mdmap$,121,190,"�������܂ꂽ�������K��",21535,1,'@label$;
		monster .mdmap$,86,165,"�������ꂽ�㋉���K��",21534,1,'@label$;
		monster .mdmap$,79,154,"�������ꂽ�㋉���K��",21534,1,'@label$;
		monster .mdmap$,45,153,"�������܂ꂽ�������K��",21535,1,'@label$;
		monster .mdmap$,25,172,"�������ꂽ�㋉���K��",21534,1,'@label$;
		setarray '@xy4, 140,183,140,182,140,181,140,180,140,179,140,178,139,183,139,182,139,181,139,180,139,179,139,178,138,183,138,182,138,181,138,180,138,179,138,178;
		for(set '@i,0; '@i < getarraysize('@xy4); set '@i,'@i+2)
			setcell .mdmap$,'@xy4['@i],'@xy4['@i+1],0;
	}
	end;
OnKilled2:
	// ������
	end;
}

1@jorchs.gat,140,182,3	script	�ׂꂽ���K��#19m41	21535,{/* 30931 */}
1@jorchs.gat,139,181,3	script	�������ꂽ�㋉���K��#19m42	21534,{/* 30134 */}
1@jorchs.gat,139,180,1	script	�������ꂽ�㋉���K��#19m43	21534,{/* 30139 */}
1@jorchs.gat,140,183,1	script	�������ꂽ�㋉���K��#19	21534,{/* 30288 */}
1@jorchs.gat,138,179,3	script	�˂���ꂽ���K��#19m44	21535,{/* 30882 */}
1@jorchs.gat,138,178,3	script	�������ꂽ�㋉���K��#19	21534,{/* 30909 */}
1@jorchs.gat,97,220,0	script	w_5_1	45,2,2,{/* 30129 */
	if(.lab < 7) {
		viewpoint 1, 16, 135, 1, 0x99FFFF;	// 30129
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30129
		viewpoint 1, 24, 142, 3, 0x99FFFF;	// 30129
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30129
		unittalk getcharid(3),strcharinfo(0)+" : ��ɓ쐼�ɂ���C���V�I�����ւ�����",1;	// self:hidden
		viewpoint 2, 97, 220, 99, 0xFF0000;	// 30129
		end;
	}
	viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30129
	viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30129
	viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30129
	viewpoint 2, 97, 220, 4, 0xFF0000;	// 30129
	unittalk getcharid(3),strcharinfo(0)+" : ���̂܂܉��֐i����",1;	// self:hidden
	viewpoint 2, 121, 190, 5, 0xFFFF00;	// 30129
	viewpoint 2, 86, 165, 6, 0xFFFF00;	// 30129
	viewpoint 2, 79, 154, 7, 0xFFFF00;	// 30129
	viewpoint 2, 45, 153, 8, 0xFFFF00;	// 30129
	viewpoint 2, 25, 172, 9, 0xFFFF00;	// 30129
	viewpoint 2, 24, 188, 10, 0xFFFF00;	// 30129
	viewpoint 2, 32, 135, 11, 0xFFFF00;	// 30129
	viewpoint 2, 18, 133, 12, 0xFFFF00;	// 30129
	viewpoint 2, 77, 146, 13, 0xFFFF00;	// 30129
	viewpoint 2, 103, 215, 14, 0xFFFF00;	// 30129
	viewpoint 1, 39, 251, 99, 0xFF0000;	// 30129
	if(!sleep2(1000)) end;
	warp .mdmap$,86,220;
	end;
}
1@jorchs.gat,94,221,5	script	#stop5_1	10248,{/* 30148 */}
1@jorchs.gat,94,218,5	script	#stop5_2	10248,{/* 30965 */}
1@jorchs.gat,91,220,0	warp	w_6_1	2,2,1@jorchs.gat,102,220	// 30043 from: 1@jorchs.gat(89, 220)
1@jorchs.gat,86,220,0	script	#e19c06_	139,5,5,{/* 30870 */
	unittalk getcharid(3),strcharinfo(0)+" : ���̂܂܉��֐i����",1;	// self:hidden
	viewpoint 2, 121, 190, 5, 0xFFFF00;	// 30870
	viewpoint 2, 86, 165, 6, 0xFFFF00;	// 30870
	viewpoint 2, 79, 154, 7, 0xFFFF00;	// 30870
	viewpoint 2, 45, 153, 8, 0xFFFF00;	// 30870
	viewpoint 2, 25, 172, 9, 0xFFFF00;	// 30870
	viewpoint 2, 24, 188, 10, 0xFFFF00;	// 30870
	viewpoint 2, 32, 135, 11, 0xFFFF00;	// 30870
	viewpoint 2, 18, 133, 12, 0xFFFF00;	// 30870
	viewpoint 2, 77, 146, 13, 0xFFFF00;	// 30870
	viewpoint 2, 103, 215, 14, 0xFFFF00;	// 30870
	viewpoint 1, 39, 251, 99, 0xFF0000;	// 30870
	end;
}
1@jorchs.gat,17,188,0	script	#e19c05	139,{/* 30926 (hide)*/
OnStart:
	misceffect 456;	// 30926
	misceffect 496;	// 30926
	monster .mdmap$,17,188,"�������ꂽ�㋉���K��",21534,1;
	end;
}
1@jorchs.gat,20,195,7	script	�������u1#19m40	10043,{/* 30943 */
	set '@label$,getmdnpcname("�������u1#19m40")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) > 0) {
		unittalk getcharid(3),strcharinfo(0)+" : �܂��͓G��|����",1;	// self:hidden
		end;
	}
	if(.lab & 7) {
		unittalk getcharid(3),strcharinfo(0)+" : �k�����牜�Ɍ�������",1;	// self:hidden
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30943
		viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30943
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30943
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30943
		end;
	}
	if(.lab & 1) {
		unittalk getcharid(3),strcharinfo(0)+" : ���̏ꏊ��T����",1;	// self:hidden
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30086
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30086
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30086
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30086
		end;
	}
	misceffect 456,"�������u1#19m40";	// 30943
	misceffect 496,"�������u1#19m40";	// 30943
	donpcevent getmdnpcname("#e19c05")+ "::OnStart";
	set '@mob[1],callmonster(.mdmap$,26,194,"�n�[�g�n���^�[AT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,26,188,"�n�[�g�n���^�[AT#2",21536,'@label$);
	set '@mob[3],callmonster(.mdmap$,19,185,"�n�[�g�n���^�[AT#3",21536,'@label$);
	unittalk '@mob[1],"�n�[�g�n���^�[ : ���������ł��T���ɗ����̂��H";	// 6081:�n�[�g�n���^�[AT#1
	unittalk '@mob[2],"�n�[�g�n���^�[ : ��R����ȁI�@��l����������̂Ă�I";	// 6093:�n�[�g�n���^�[AT#2
	unittalk '@mob[3],"�n�[�g�n���^�[ : �ǂ������O���ǂ�ł��A�킩��˂���!!";	// 6105:�n�[�g�n���^�[AT#3
	end;
OnKilled:
	set .lab, .lab|1;
	if(.lab & 7) {
/* 21:29:52.127375 */	//@mob_defeated("�n�[�g�n���^�[AT#3"(6105), type: 1)
/* 21:29:53.016993 */	announce "�]�k�����牜�ɐi�����]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
/* 21:29:54.801625 */	unittalk getcharid(3),strcharinfo(0)+" : ���~���̐S���̌��Ђ́A��͂薳�����c�c�B",1;	// self:hidden
/* 21:29:54.831545 */	unittalk getcharid(3),strcharinfo(0)+" : �k�����牜�Ɍ�������",1;	// self:hidden
/* 21:29:54.836531 */	viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30943
/* 21:29:54.840522 */	viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30943
/* 21:29:54.848500 */	viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30943
/* 21:29:54.851493 */	viewpoint 1, 97, 220, 4, 0xFF0000;	// 30943
/* 21:29:56.080592 */	announce "�n�[�g�n���^�[ : �������I�@�N����Ԑ�ɓ������邩�ȁH", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	else {
		announce "�]���ɂ��������肻�����B�{�����p�����悤�]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		unittalk getcharid(3),strcharinfo(0)+" : ���~���̐S���̌��Ђ́A��͂薳�����c�c�B",1;	// self:hidden
	}
	end;
}
1@jorchs.gat,17,133,0	script	#e19c06	139,{/* 30117 (hide)*/
OnStart:
	misceffect 456;	// 30117
	misceffect 496;	// 30117
	monster .mdmap$,17,133,"�������ꂽ�㋉���K��",21534,1;
	end;
}
1@jorchs.gat,24,142,7	script	�������u2#19m41	10043,{/* 30086 */
	set '@label$,getmdnpcname("�������u2#19m41")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) > 0) {
		unittalk getcharid(3),strcharinfo(0)+" : �܂��͓G��|����",1;	// self:hidden
		end;
	}
	if(.lab & 7) {
		unittalk getcharid(3),strcharinfo(0)+" : �k�����牜�Ɍ�������",1;
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30943
		viewpoint 2, 20, 195, 2, 0x99FFFF;	// 30943
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30943
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30943
		end;
	}
	if(.lab & 2) {
		unittalk getcharid(3),strcharinfo(0)+" : ���̏ꏊ��T����",1;	// self:hidden
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30086
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30086
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30086
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30086
		end;
	}
	misceffect 456;	// 30086
	misceffect 496;	// 30086
	set '@mob[1],callmonster(.mdmap$,20,136,"�n�[�g�n���^�[AT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,30,139,"�n�[�g�n���^�[AT#2",21536,'@label$);
	unittalk '@mob[1],"�n�[�g�n���^�[ : �������A���N�f�f�ł�������肩�H";	// 94345:�n�[�g�n���^�[AT#1
	unittalk '@mob[2],"�n�[�g�n���^�[ : �����ɐG��񂶂�˂���I";	// 94346:�n�[�g�n���^�[AT#2
	end;
OnKilled:
	set .lab, .lab|2;
	if(.lab & 7) {
		sleep 1000;
		announce "�]�k�����牜�ɐi�����]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		sleep 3000;
		announce "�n�[�g�n���^�[ : �������I�@�N����Ԑ�ɓ������邩�ȁH", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	else {
		announce "�]���ɂ��������肻�����B�{�����p�����悤�]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	}
	end;
}
1@jorchs.gat,16,135,3	script	�������̍���#19m40	10043,{/* 30958 */
	if(.lab & 7) {
		unittalk getcharid(3),strcharinfo(0)+" : �k�����牜�Ɍ�������",1;
		viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30086
		viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30086
		viewpoint 2, 24, 142, 3, 0x99FFFF;	// 30086
		viewpoint 1, 97, 220, 4, 0xFF0000;	// 30086
		end;
	}
	if(.lab & 4) {
		unittalk getcharid(3),strcharinfo(0)+" : �d�v�����Ȏ����́A���ׂĉ^�яo����Ă���",1;	// self:hidden
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �قƂ�ǉ����c���Ă��Ȃ��c�c�ʂ̏ꏊ��T����",1;	// self:hidden
	viewpoint 2, 16, 135, 1, 0x99FFFF;	// 30958
	viewpoint 1, 20, 195, 2, 0x99FFFF;	// 30958
	viewpoint 1, 24, 142, 3, 0x99FFFF;	// 30958
	viewpoint 1, 97, 220, 4, 0xFF0000;	// 30958
	if(!(.lab & 4)) {
		set .lab,.lab|4;
		if(.lab & 7) {
			sleep 1000;
			announce "�]�k�����牜�ɐi�����]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			sleep 3000;
			announce "�n�[�g�n���^�[ : �������I�@�N����Ԑ�ɓ������邩�ȁH", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		}
		else {
			announce "�]���ɂ��������肻�����B�{�����p�����悤�]", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		}
	}
	end;
}
1@jorchs.gat,0,0,0	script	ConfusedNestControl6	-1,{
OnStart:
	sleep 500;
	hideonnpc getmdnpcname("�o�S�b�g#19m50");	// 30181
	announce "���͒��������B1�i�K�̖��͒������J�n����܂��B", 0x9, 0x00ffcc;
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30949
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30932
	monster .mdmap$,35,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,42,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30917
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30297
	monster .mdmap$,37,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,40,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("���\�ȃ��K��#19m50");	// 30889
	hideonnpc getmdnpcname("���\�ȃ��K��#19m51");	// 30878
	monster .mdmap$,31,249,"���͖\�������㋉���K��",21590,1,'@label$;
	monster .mdmap$,47,237,"���͖\�������㋉���K��",21590,1,'@label$;
	delmisceffect 453, getmdnpcname("���\�ȃ��K��#19m50");	// 30889
	delmisceffect 453, getmdnpcname("���\�ȃ��K��#19m51");	// 30878
	delmisceffect 754, getmdnpcname("���\�ȃ��K��#19m50");	// 30889
	delmisceffect 754, getmdnpcname("���\�ȃ��K��#19m51");	// 30878
	set .scean,15;
	end;
OnStart2:
	sleep 500;
	announce "���͒��������B2�i�K�̖��͒������J�n����܂��B", 0x9, 0x00ffcc;
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30879
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30140
	monster .mdmap$,34,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,43,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30892
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30874
	monster .mdmap$,38,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,39,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30289
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30933
	monster .mdmap$,36,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,41,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("���\�ȃ��K��#19m52");	// 30133
	hideonnpc getmdnpcname("���\�ȃ��K��#19m53");	// 30880
	monster .mdmap$,47,249,"���͖\�������㋉���K��",21590,1,'@label$;
	monster .mdmap$,31,237,"���͖\�������㋉���K��",21590,1,'@label$;
	delmisceffect 453, getmdnpcname("���\�ȃ��K��#19m52");	// 30133
	delmisceffect 453, getmdnpcname("���\�ȃ��K��#19m53");	// 30880
	delmisceffect 754, getmdnpcname("���\�ȃ��K��#19m52");	// 30133
	delmisceffect 754, getmdnpcname("���\�ȃ��K��#19m53");	// 30880
	set .scean,16;
	end;
OnStart3:
	sleep 500;
	announce "���͒��������B3�i�K�̖��͒������J�n����܂��B", 0x9, 0x00ffcc;
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30304
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30130
	monster .mdmap$,35,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,39,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30944
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30149
	monster .mdmap$,37,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,41,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30927
	hideonnpc getmdnpcname("�������ꂽ�㋉���K��#19");	// 30887
	monster .mdmap$,38,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	monster .mdmap$,42,254,"�������ꂽ�㋉���K��",21534,1,'@label$;
	sleep 4500;
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m50");	// 30895
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m51");	// 30156
	hideonnpc getmdnpcname("�n�[�g�n���^�[#19m52");	// 30132
	set '@mob[1],callmonster(.mdmap$,39,250,"�n�[�g�n���^�[AT#1",21536,'@label$);
	set '@mob[2],callmonster(.mdmap$,36,250,"�n�[�g�n���^�[AT#2",21536,'@label$);
	set '@mob[3],callmonster(.mdmap$,41,252,"�n�[�g�n���^�[AT#3",21536,'@label$);
	unittalk '@mob[1],"�n�[�g�n���^�[ : �S�͂Ŋ|�����!!";	// 7639:�n�[�g�n���^�[AT#1
	unittalk '@mob[2],"�n�[�g�n���^�[ : �����A������Ă邼�I";	// 7676:�n�[�g�n���^�[AT#2
	unittalk '@mob[3],"�n�[�g�n���^�[ : �����I�@�v������苭��!!";	// 7902:�n�[�g�n���^�[AT#3
	sleep 4500;
	hideonnpc getmdnpcname("���\�ȃ��K��#19m54");	// 30956
	hideonnpc getmdnpcname("���\�ȃ��K��#19m55");	// 30899
	hideonnpc getmdnpcname("���\�ȃ��K��#19m56");	// 30131
	monster .mdmap$,27,243,"���͖\�������㋉���K��",21590,1,'@label$;
	monster .mdmap$,50,243,"���͖\�������㋉���K��",21590,1,'@label$;
	monster .mdmap$,39,235,"���͖\�������㋉���K��",21590,1,'@label$;
	delmisceffect 453, getmdnpcname("���\�ȃ��K��#19m54");	// 30956
	delmisceffect 453, getmdnpcname("���\�ȃ��K��#19m55");	// 30899
	delmisceffect 453, getmdnpcname("���\�ȃ��K��#19m56");	// 30131
	delmisceffect 754, getmdnpcname("���\�ȃ��K��#19m54");	// 30956
	delmisceffect 754, getmdnpcname("���\�ȃ��K��#19m55");	// 30899
	delmisceffect 754, getmdnpcname("���\�ȃ��K��#19m56");	// 30131
	set .scean,17;
	end;
OnKilled:
	set '@label$,getmdnpcname("ConfusedNestControl6")+ "::OnKilled";
	if(getmapmobs(.mdmap$,'@label$) == 0) {
		switch(.scean) {
		case 15:
			donpcevent getmdnpcname("ConfusedNestControl6")+ "::OnStart2"; 
			end;
		case 16:
			donpcevent getmdnpcname("ConfusedNestControl6")+ "::OnStart3"; 
			end;
		case 17:
			announce "�]���֐i�ޓ����J�����]", 0x9, 0x00ffcc;
			misceffect 224,"�������ꂽ�㋉���K��#19m50";	// 30879
			misceffect 224,"�������ꂽ�㋉���K��#19m51";	// 30949
			misceffect 224,"�������ꂽ�㋉���K��#19m52";	// 30289
			misceffect 224,"�������ꂽ�㋉���K��#19m53";	// 30917
			misceffect 224,"�������ꂽ�㋉���K��#19m54";	// 30892
			misceffect 224,"�������ꂽ�㋉���K��#19m55";	// 30874
			misceffect 224,"�������ꂽ�㋉���K��#19m56";	// 30297
			misceffect 224,"�������ꂽ�㋉���K��#19m57";	// 30933
			misceffect 224,"�������ꂽ�㋉���K��#19m58";	// 30932
			misceffect 224,"�������ꂽ�㋉���K��#19m59";	// 30140
			setnpcdisplay "�������ꂽ�㋉���K��#19m50",844;	// 30879
			setnpcdisplay "�������ꂽ�㋉���K��#19m51",844;	// 30949
			setnpcdisplay "�������ꂽ�㋉���K��#19m52",844;	// 30289
			setnpcdisplay "�������ꂽ�㋉���K��#19m53",844;	// 30917
			setnpcdisplay "�������ꂽ�㋉���K��#19m54",844;	// 30892
			setnpcdisplay "�������ꂽ�㋉���K��#19m55",844;	// 30874
			setnpcdisplay "�������ꂽ�㋉���K��#19m56",844;	// 30297
			setnpcdisplay "�������ꂽ�㋉���K��#19m57",844;	// 30933
			setnpcdisplay "�������ꂽ�㋉���K��#19m58",844;	// 30932
			setnpcdisplay "�������ꂽ�㋉���K��#19m59",844;	// 30140
			setarray '@xy5, 43,256,43,255,42,256,42,255,41,256,41,255,40,256,40,255,39,256,39,255,38,256,38,255,37,256,37,255,36,256,36,255,35,256,35,255,34,256,34,255;
			for(set '@i,0; '@i < getarraysize('@xy5); set '@i,'@i+2)
				setcell .mdmap$,'@xy5['@i],'@xy5['@i+1],0;
			donpcevent getmdnpcname("���S���̖�#19m61")+ "::OnStart"; 
			end;
		}
	}
	end;
}
1@jorchs.gat,39,251,5	script	�n�[�g�n���^�[#19m50	21536,5,5,{/* 30895 */
	if(.scean == 13) {
		set .scean,14;
		misceffect 16;	// 30895
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m51")),"�n�[�g�n���^�[ : �`���҂���Ԑ�ɒ������ȁB";	// 30156
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("�n�[�g�n���^�[#19m52")),"�n�[�g�n���^�[ : �q�������Ă����ǁB";	// 30132
		unittalk "�n�[�g�n���^�[ : �͂͂��I�@�������������B";	// 30895
		if(!sleep2(2500)) end;
		hideoffnpc getmdnpcname("�o�S�b�g#19m50");	// 30181
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : �����̂́`�`���҂������H";	// 30181
		if(!sleep2(2000)) end;
		unittalk "�n�[�g�n���^�[ : ���̓z��A���͖\�����K���ɋ�킵�Ă�悤�ł��B";	// 30895
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : ���A�����H�@�o�S�b�g�͖`���҂ɂ���`���Ɖ�����Ǝv���Ă����Ƃ��낧�`�B";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : �悭���A�o�S�b�g���x�����Ƃ����ˁH";	// 30181
		if(!sleep2(3000)) end;
		hideoffnpc getmdnpcname("���\�ȃ��K��#19m50");	// 30889
		hideoffnpc getmdnpcname("���\�ȃ��K��#19m51");	// 30889
		hideoffnpc getmdnpcname("���\�ȃ��K��#19m52");	// 30133
		hideoffnpc getmdnpcname("���\�ȃ��K��#19m53");	// 30889
		hideoffnpc getmdnpcname("���\�ȃ��K��#19m54");	// 30956
		hideoffnpc getmdnpcname("���\�ȃ��K��#19m55");	// 30889
		hideoffnpc getmdnpcname("���\�ȃ��K��#19m56");	// 30889
		unittalk getnpcid(0,getmdnpcname("���\�ȃ��K��#19m50")),"���\�ȃ��K�� : �������[�[";	// 30889
		unittalk getnpcid(0,getmdnpcname("���\�ȃ��K��#19m51")),"���\�ȃ��K�� : ������[�[�������[�[";	// 30878
		unittalk getnpcid(0,getmdnpcname("���\�ȃ��K��#19m52")),"���\�ȃ��K�� : �܁c���c���c";	// 30133
		unittalk getnpcid(0,getmdnpcname("���\�ȃ��K��#19m53")),"���\�ȃ��K�� : �c�c�c�c";	// 30880
		unittalk getnpcid(0,getmdnpcname("���\�ȃ��K��#19m54")),"���\�ȃ��K�� : ��߁c��c���c";	// 30956
		unittalk getnpcid(0,getmdnpcname("���\�ȃ��K��#19m55")),"���\�ȃ��K�� : ���������[�[�[���[�[";	// 30899
		unittalk getnpcid(0,getmdnpcname("���\�ȃ��K��#19m56")),"���\�ȃ��K�� : ���c���c";	// 30131
		misceffect 453,getmdnpcname("���\�ȃ��K��#19m50");	// 30889
		misceffect 453,getmdnpcname("���\�ȃ��K��#19m51");	// 30889
		misceffect 453,getmdnpcname("���\�ȃ��K��#19m52");	// 30133
		misceffect 453,getmdnpcname("���\�ȃ��K��#19m53");	// 30889
		misceffect 453,getmdnpcname("���\�ȃ��K��#19m54");	// 30956
		misceffect 453,getmdnpcname("���\�ȃ��K��#19m55");	// 30889
		misceffect 453,getmdnpcname("���\�ȃ��K��#19m56");	// 30889
		misceffect 754,getmdnpcname("���\�ȃ��K��#19m50");	// 30889
		misceffect 754,getmdnpcname("���\�ȃ��K��#19m51");	// 30889
		misceffect 754,getmdnpcname("���\�ȃ��K��#19m52");	// 30133
		misceffect 754,getmdnpcname("���\�ȃ��K��#19m53");	// 30889
		misceffect 754,getmdnpcname("���\�ȃ��K��#19m54");	// 30956
		misceffect 754,getmdnpcname("���\�ȃ��K��#19m55");	// 30889
		misceffect 754,getmdnpcname("���\�ȃ��K��#19m56");	// 30889
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : �o�S�b�g���������邩�C�ɂȂ�����ł���`�H�@����ŁA�����P�A�����܂ł����̂����Ă��`�B";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : �ł��o�S�b�g�́`����Ȑ�͂��Ȏ�ɂ͈���������Ȃ��̂�˂��`�B";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : �x���ꂽ�U�肵�āA���O��̍s�����ώ@���Ă��킯���`�B�܂�܂ƈ�������������Ȃ��`�B";	// 30181
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : �ł��A�o�S�b�g���n��o���V�������E�ɁA�������O��͕s�v���[�I";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : ���X�K���h���������x�����Ƃ����l�ԂɁA�{��S�������������`�B";	// 30181
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("�o�S�b�g#19m50")),"�o�S�b�g : �����A�o�S�b�g����̃v���[���g���`�B���������ĉi�v�ɑޏꂵ�Ă��������˂��`�I";	// 30181
		donpcevent getmdnpcname("ConfusedNestControl6")+ "::OnStart"; 
	}
	end;
}
1@jorchs.gat,36,251,5	script	�n�[�g�n���^�[#19m51	21536,{/* 30156 */}
1@jorchs.gat,41,253,5	script	�n�[�g�n���^�[#19m52	21536,{/* 30132 */}
1@jorchs.gat,31,249,5	script	���\�ȃ��K��#19m50	21590,{/* 30889 (hide)*/}
1@jorchs.gat,47,237,1	script	���\�ȃ��K��#19m51	21590,{/* 30878 (hide)*/}
1@jorchs.gat,47,249,3	script	���\�ȃ��K��#19m52	21590,{/* 30133 (hide)*/}
1@jorchs.gat,31,237,7	script	���\�ȃ��K��#19m53	21590,{/* 30880 (hide)*/}
1@jorchs.gat,27,243,5	script	���\�ȃ��K��#19m54	21590,{/* 30956 (hide)*/}
1@jorchs.gat,50,243,3	script	���\�ȃ��K��#19m55	21590,{/* 30899 (hide)*/}
1@jorchs.gat,39,235,1	script	���\�ȃ��K��#19m56	21590,{/* 30131 (hide)*/}
1@jorchs.gat,37,252,5	script	�o�S�b�g#19m50	10386,{/* 30181 (hide)*/}
1@jorchs.gat,34,255,1	script	�������ꂽ�㋉���K��#19m50	21534,{/* 30879 */}
1@jorchs.gat,35,255,3	script	�������ꂽ�㋉���K��#19m51	21534,{/* 30949 */}
1@jorchs.gat,36,255,3	script	�������ꂽ�㋉���K��#19m52	21534,{/* 30289 */}
1@jorchs.gat,37,255,1	script	�������ꂽ�㋉���K��#19m53	21534,{/* 30917 */}
1@jorchs.gat,38,255,3	script	�������ꂽ�㋉���K��#19m54	21534,{/* 30892 */}
1@jorchs.gat,39,255,3	script	�������ꂽ�㋉���K��#19m55	21534,{/* 30874 */}
1@jorchs.gat,40,255,1	script	�������ꂽ�㋉���K��#19m56	21534,{/* 30297 */}
1@jorchs.gat,41,255,3	script	�������ꂽ�㋉���K��#19m57	21534,{/* 30933 */}
1@jorchs.gat,42,255,3	script	�������ꂽ�㋉���K��#19m58	21534,{/* 30932 */}
1@jorchs.gat,43,255,3	script	�������ꂽ�㋉���K��#19m59	21534,{/* 30140 */}
1@jorchs.gat,35,256,5	script	�������ꂽ�㋉���K��#19m60	21534,{/* 30304 */}
1@jorchs.gat,37,256,1	script	�������ꂽ�㋉���K��#19m61	21534,{/* 30944 */}
1@jorchs.gat,38,256,5	script	�������ꂽ�㋉���K��#19m62	21534,{/* 30927 */}
1@jorchs.gat,39,256,3	script	�������ꂽ�㋉���K��#19m63	21534,{/* 30130 */}
1@jorchs.gat,41,256,1	script	�������ꂽ�㋉���K��#19m64	21534,{/* 30149 */}
1@jorchs.gat,42,256,5	script	�������ꂽ�㋉���K��#19m65	21534,{/* 30887 */}

1@jorchs.gat,38,272,1	script	�I�[�����[#19m60	10465,{/* 30948 (hide)*/
	if(.scean != 19)
		end;
	cutin "ep19_aurelie03.png", 2;
	mes "[�I�[�����[]";
	mes "�����A�X�̏�ɖ߂�܂��傤�B";
	next;
	if(EP19_1QUE == 67) {
		delquest 17648;
		setquest 17649;	// state=1
		set EP19_1QUE,68;
	}
	cutin "ep19_juncea04.png", 255;
	mes "�]�X�̏�֌������܂����H�]";
	next;
	if(select("������","��߂�") == 2) {
		mes "�]���̏�ɂƂǂ܂����]";
		close;
	}
	mes "�]�X�̏�֌��������]";
	close2;
	warp "icas_in.gat", 35, 186;
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30877
	end;
OnInit:
	setnpctitle "[����]";	// NPC:�I�[�����[#19m60(30948)
	end;
}
1@jorchs.gat,39,271,1	script	���I��#19m60	10464,{/* 30157 (hide)*/
	end;
OnInit:
	setnpctitle "[����]";	// NPC:���I��#19m60(30157)
	end;
}
1@jorchs.gat,35,271,7	script	�~���A��#19m60	10377,{/* 30290 (hide)*/}
1@jorchs.gat,36,272,7	script	���H�[�N�����f#19m60	10467,{/* 28145 (hide)*/}
1@jorchs.gat,40,274,1	script	�z����#19m60	21518,{/* 30896 (hide)*/}
1@jorchs.gat,21,254,5	script	�A�[�E�B��#19m60	21517,{/* 30298 (hide)*/}

1@jorchs.gat,37,274,5	script	���S���̖�#19m61	10043,{/* 30877 */
	if(.scean != 17)
		end;
	set .scean,18;
	stopnpctimer;
	misceffect 16;	// 30877
	hideoffnpc getmdnpcname("�I�[�����[#19m60");	// 30948
	hideoffnpc getmdnpcname("���I��#19m60");	// 30157
	unittalk getnpcid(0,getmdnpcname("�I�[�����[#19m60")),"�I�[�����[ : �����݂����ŗǂ�������B";	// 30948
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("���I��#19m60")),"���I�� : �\�������㋉���K���̌Q��ɏP���A�������x��Ă��܂��܂����B";	// 30157
	if(!sleep2(1500)) end;
	hideoffnpc getmdnpcname("�z����#19m60");	// 30896
	hideoffnpc getmdnpcname("�A�[�E�B��#19m60");	// 30298
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : ����������B�\�������z��Ɏ肱�����Ă��܂���!!";	// 30896
	if(!sleep2(1500)) end;
	hideoffnpc getmdnpcname("���H�[�N�����f#19m60");	// 28145
	hideoffnpc getmdnpcname("�~���A��#19m60");	// 30290
	unittalk getnpcid(0,getmdnpcname("���H�[�N�����f#19m60")),"���H�[�N�����f : �A���ɏP��ꂽ�̂́A���B��������Ȃ������݂����ˁB";	// 28145
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("�~���A��#19m60")),"�~���A�� : �����ł��ėǂ������ł��B�����킩��܂������H";	// 30290
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : ����݂Ԃ��ɒ��ׂĂ݂����A�Ȃɂ������ł��Ȃ������c�c�B";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�I�[�����[#19m60")),"�I�[�����[ : �C���V�I���̌��������J���b�|��������B";	// 30948
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("���H�[�N�����f#19m60")),"���H�[�N�����f : �n�[�g�n���^�[�ɕ����Ă݂����ǁA�S�����S���ֈړ������Ƃ��������Ȃ�������B";	// 28145
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("�~���A��#19m60")),"�~���A�� : ��s�D�ŒE�o�����҂����܂���B";	// 30290
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("���I��#19m60")),"���I�� : �Ȃ�قǁc�c���ׂ��Ă��Ȃ��̂́A���̉������݂����ł��ˁB";	// 30157
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : ���̖�̐�ɁA���X�K���h������񂾂ȁH";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : �悵�I�@���̖���J���Ă݂悤�B";	// 30896
	if(!sleep2(1500)) end;
	misceffect 563;	// 30877
	unittalk getnpcid(0,getmdnpcname("���I��#19m60")),"���I�� : �c�c����������Ă��܂��ˁB";	// 30157
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : �͐s���ł��J���Ă��I";	// 30896
	if(!sleep2(2500)) end;
	misceffect 585;	// 30877
	if(!sleep2(500)) end;
	misceffect 666;	// 30877
	if(!sleep2(500)) end;
	misceffect 636;	// 30877
	misceffect 637;	// 30877
	misceffect 645;	// 30877
	misceffect 668;	// 30877
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : �т��Ƃ����Ȃ�!?�@����������ɂǂ�ȍ׍H��������!!!";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("���H�[�N�����f#19m60")),"���H�[�N�����f : �n�[�g�n���^�[������肵�����ł��J�����Ȃ���B";	// 28145
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("�I�[�����[#19m60")),"�I�[�����[ : �c�c���͂𒍓����Ă��������Ȃ���ˁB";	// 30948
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,getmdnpcname("���H�[�N�����f#19m60")),"���H�[�N�����f : �肪�����ȏ�A��������o�����̂��ǂ���������Ȃ��ˁB";	// 28145
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : ���K���̑��A�͂ǂ�����H�@�R�₵�Ă��܂����H";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�I�[�����[#19m60")),"�I�[�����[ : �c�c�����͂��̂܂܂ɂ��Ă����܂��傤�B";	// 30948
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("���I��#19m60")),"���I�� : �����������߂ċA�����Ǝv�킹��悤�ɁH";	// 30157
	if(!sleep2(2500)) end;
	unittalk getnpcid(0,getmdnpcname("�I�[�����[#19m60")),"�I�[�����[ : �����B���f���āA����J���邩������Ȃ��B";	// 30948
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�z����#19m60")),"�z���� : ���܂�C�ɓ���Ȃ����A���ɕ��@���Ȃ��������c�c�����ɊĎ��W���c���Ă������B";	// 30896
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�I�[�����[#19m60")),"�I�[�����[ : �ł́A��������X�̏�ɖ߂�܂��傤�B���[�v�|�[�^�����J����B";	// 30948
	set .scean,19;
	donpcevent getmdnpcname("�I�[�����[#19m60")+ "::OnStart"; 
	end;
OnStart:
OnTimer2000:
	initnpctimer;
	emotion 0;	// 30877
	end;
}

/*
21534,�������ꂽ�㋉���K�����A�[�X�X�p�C�N,chase,90,3,5000,0,3000,no,target,always,0,,,,,,
21534,�������ꂽ�㋉���K�����A�[�X�X�p�C�N,attack,90,4,2000,0,5000,no,target,always,0,,,,,,
21534,�������ꂽ�㋉���K�����|�C�Y���A�^�b�N,attack,188,2,2500,0,5000,no,target,always,0,,,,,,
21534,�������ꂽ�㋉���K�����O���E���h�A�^�b�N,attack,185,2,2500,0,5000,no,target,always,0,,,,,,

21535,�������܂ꂽ�������K�����R�[���h�{���g,chase,14,9,5000,0,3000,no,target,always,0,,,,,,
21535,�������܂ꂽ�������K����M�f�B�t�F���_�[,chase,205,1,2000,0,30000,no,self,longrangeattacked,0,,,,,,
21535,�������܂ꂽ�������K�����|�C�Y���A�^�b�N,attack,188,5,2500,0,5000,no,target,always,0,,,,,,
21535,�������܂ꂽ�������K�����E�H�[�^�[�A�^�b�N,attack,184,5,2500,0,5000,no,target,always,0,,,,,,
21535,�������܂ꂽ�������K�����}�O�i���u���C�N,attack,7,10,2500,0,5000,no,target,always,0,,,,,,
21535,�������܂ꂽ�������K�����u���b�h�h���C��,attack,199,1,2000,0,5000,no,target,always,0,,,,,,
//21535,�������܂ꂽ�������K����M�C�O�j�b�V�����u���C�N,attack,740,1,1000,0,5000,no,self,attackpcge,2,,,,,,
21536,�n�[�g�n���^�[AT���\�E���u���C�J�[,chase,379,1,5000,0,3000,no,target,always,0,,,,,,
21536,�n�[�g�n���^�[AT���o�b�V��,attack,5,10,2000,0,2000,no,target,always,0,,,,,,
21536,�n�[�g�n���^�[AT���N���e�B�J���X���b�V��,attack,170,1,2000,0,5000,no,target,always,0,,,,,,
21536,�n�[�g�n���^�[AT���R���{�A�^�b�N,attack,171,3,2000,0,2000,no,target,always,0,,,,,,
average 850
@skillattack(src: 21536:"�n�[�g�n���^�[AT"(83099), dst: (), skill: "�\�E���u���C�J�["(379), skill_lv: 65535, damage: 9734, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559304844)
@skillattack(src: 21536:"�n�[�g�n���^�[AT"(83099), dst: (), skill: "�\�E���u���C�J�["(379), skill_lv: 65535, damage: 10784, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559308965)
@skillattack(src: 21536:"�n�[�g�n���^�[AT"(83099), dst: (), skill: "�\�E���u���C�J�["(379), skill_lv: 65535, damage: 11179, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559312072)
@skillattack(src: 21536:"�n�[�g�n���^�[AT"(83099), dst: (), skill: "�\�E���u���C�J�["(379), skill_lv: 65535, damage: 9869, sDelay: 1080, dDelay: 444, div: 1, hit: 6, tick: 559317196)
21590,���͖\�������㋉���K�����A�[�X�X�p�C�N,chase,90,4,5000,0,3000,no,target,always,0,,,,,,
21590,���͖\�������㋉���K�����A�[�X�X�p�C�N,attack,90,5,2000,0,5000,no,target,always,0,,,,,,
21590,���͖\�������㋉���K�����|�C�Y���A�^�b�N,attack,188,8,2500,0,5000,no,target,always,0,,,,,,
21590,���͖\�������㋉���K�����O���E���h�A�^�b�N,attack,185,8,2500,0,5000,no,target,always,0,,,,,,
*/

/*
�������܂ꂽ�������K���i�N�G�X�g�j
150,792,792,576

�������ꂽ�㋉���K���i�N�G�X�g�j
150,1008,1008,576

�n�[�g�n���^�[AT�i�N�G�X�g�j
150,1080,1080,576

���͖\�������㋉���K���i�N�G�X�g�j
150,1008,1008,576
*/