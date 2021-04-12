//= Auriga Script ==============================================================
// Ragnarok Online Temple of Demon God Script	by refis
//==============================================================================

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
moro_cav.gat,41,73,4	script	���҃j�[�Y�w�b�O#epeo	510,{
	if(!checkquest(201720) || !checkquest(201725)) {	// �r�I�X�̓��A�����X�̓��A���N���A
		cutin "ep14_nyd01", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "���̉��F����ƐԂ��ԁA";
		mes "����ɂ��̎��c�c�B";
		mes "�����N�͉����l���Ă���̂ł��傤�B";
		next;
		mes "�]^ff0000���_�a�ɓ���ɂ�";
		mes "�@�r�I�X�̓��A�����X�̓��A��";
		mes "�@�N���A����K�v������܂�^000000�]";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	if(checkquest(116545)) {
		mes "[�j�[�Y�w�b�O]";
		mes "���Ƀ����N��|���܂����ˁB";
		cutin "ep14_nyd04", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�ނ͗~����߂��܂����B";
		mes "���܂�ς���ē�������ȗ́B";
		mes "���̐��E�����ݍ��݁A";
		mes "�V�������g�̐��E��n��Ƃ�����]�B";
		mes "�ނ͉������������̎v���ʂ��";
		mes "�����������̂ł��傤�B";
		cutin "ep14_nyd02", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�������A�F����̂�������";
		mes "�ނ̖�]��ł��ӂ������ł��܂����B";
		mes "���B�͎푰�𒴂��ċ��͂��邱�ƂŁA";
		mes "����Ȑ�]��ނ��鎖���ł����̂ł��B";
		cutin "ep14_nyd04", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�i�ߊ��ɕ񍐂ł���悤�ɁA";
		mes "���������N�����̎�����";
		mes "�`���Ă����܂��傤�B";
		mes "����J�l�ł����B";
		next;
		cutin "ep14_nyd04", 255;
		mes "�]^ff0000����ȍ~�A���_�a�ɓ��邱�Ƃ�";
		mes "�@�ł��Ȃ��Ȃ�܂��B";
		mes "�@�i�ߊ��A�W�t�ɕ񍐂��Ă���A";
		mes "�@1��ڂ̌ߑO5���ȍ~�ɁA";
		mes "�@�ēx���_�a�ɓ��邱�Ƃ�";
		mes "�@�ł���悤�ɂȂ�܂�^000000�]";
		if(checkquest(7593)) {
			setquest 7597;
			delquest 7593;
		}
		if(checkquest(116545)) {
			setquest 116545;
			delquest 116545;
		}
		close;
	}
	if(checkquest(7597)) {	// �����㖢��
		mes "[�j�[�Y�w�b�O]";
		mes "�{���ɂ����l�ł����B";
		cutin "ep14_nyd04", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�i�ߊ��ɕ񍐂ł���悤�ɁA";
		mes "���������N�����̎�����";
		mes "�`���Ă����܂����̂ŁA";
		mes "�񍐂Ɍ������Ă��������B";
		close2;
		cutin "ep14_nyd04", 255;
		end;
	}
	if(checkquest(7605)&0x4)	// ���҂Ƃ̌_�񎞊Ԑ���
		delquest 7605;
	if(checkquest(7593) == 0) {
		cutin "ep14_nyd01", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�\���󂠂�܂��񂪁A";
		mes "�i�ߊ��̋��Ȃ��ɂ�";
		mes "�o���������邱�Ƃ��ł��܂���B";
		mes "���_�������˗����ꂽ���̂�";
		mes "����������Ă��܂��B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�i�ߊ��q�o�E�A�W�t�l�ɉ���āA";
		mes "�˗����󂯂Ă��ĉ������B";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	if(getonlinepartymember() < 1) {
		mes "[�j�[�Y�w�b�O]";
		mes "���̐�͈�l�ł͊댯�ł��B";
		mes "�p�[�e�B�[���������Ă��痈�ĉ������B";
		cutin "ep14_nyd01", 2;
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		cutin "ep14_nyd01", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�F����̈��S����邽�߁A";
		mes "���_�a�ɓ���\����";
		mes "�p�[�e�B�[���[�_�[�������ł��܂��B";
		mes "���Ȃ��̃p�[�e�B�[�̃��[�_�[����";
		mes "���ɘb��������悤�`���Ă��������B";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	mes "[�j�[�Y�w�b�O]";
	mes "���҂����Ă��܂����B";
	mes "�����N������[�w���܂ňē����܂��B";
	cutin "ep14_nyd04", 2;
	next;
	mes "[�j�[�Y�w�b�O]";
	mes "���̎��͐��E���Ǝ��Ă��܂��ˁB";
	mes "�����N�̖ړI�����̗\�z�Ƃ�";
	mes "�قȂ�Ɨǂ��̂ł����c�c�B";
	cutin "ep14_nyd03", 2;
	next;
	mes "[�j�[�Y�w�b�O]";
	mes "�������痬��o�閂�͂�";
	mes "���Ԋu�ő������Ă��邩�̂悤��";
	mes "����������܂��B";
	mes "���͂��̋�Ԃ���";
	mes "�[�w���ւ̓����J���܂��B";
	mes "�[�w���֍s�������͂ł��܂������H";
	cutin "ep14_nyd04", 2;
	next;
	if(select("�������ł���","�s���Ȃ�") == 2) {
		mes "[�j�[�Y�w�b�O]";
		mes "�킩��܂����B";
		mes "�o������܂ŏ\���ɏ�������";
		mes "���Ԃ��K�v�ł��傤�B";
		mes "������菀�����ė��ĉ������B";
		mes "���͂����ő҂��Ă��܂��B";
		cutin "ep14_nyd04", 2;
		close2;
		cutin "ep14_nyd04", 255;
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�j�[�Y�w�b�O]";
		mes "�҂��Ă��������A����́c�c!?";
		mes "���̗͂��ꂪ�ς��܂����B";
		mes "�������̓����ɋC���t�����悤�ł��B";
		mes "���������l�q�����Ă݂܂��傤�B";
		mes "�������͏����ꂴ��q�ł�����B";
		cutin "ep14_nyd01", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�ܘ_�A�����������[�w���֍s����";
		mes "�����N�����߂����̂ł����A";
		mes "�ނ�ɋC�t����Ă���Ɗ댯�ł��B";
		mes "���΂炭�҂��܂��傤�B";
		cutin "ep14_nyd02", 2;
		close2;
		cutin "ep14_nyd02", 255;
		end;
	}
	mdcreate "end_of_morocc";
	if(checkquest(7596))
		delquest 7596;
	mes "[�j�[�Y�w�b�O]";
	mes "�c�c���������œ������J���܂��B";
	mes "����ʂ��ĐN�����Ă��������B";
	mes "�|����Ȃ��ŉ������B";
	mes "�������ɍs���܂��B";
	cutin "ep14_nyd04", 2;
	close2;
	cutin "ep14_nyd04", 255;
	end;
OnInit:
	waitingroom "���_�a����", 0;
	end;
}

//============================================================
// ����NPC
//------------------------------------------------------------
moro_cav.gat,45,75,0	script	���E���Ɏ�����#eom_gate	844,{
	if(!checkquest(201720) || !checkquest(201725)) {	// �r�I�X�̓��A�����X�̓��A���N���A
		mes "[�j�[�Y�w�b�O]";
		mes "���̉��F����ƐԂ��ԁA";
		mes "����ɂ��̎��c�c�B";
		mes "�����N�͉����l���Ă���̂ł��傤�B";
		cutin "ep14_nyd01", 2;
		next;
		mes "�]^ff0000���_�a�ɓ���ɂ�";
		mes "�@�r�I�X�̓��A�����X�̓��A��";
		mes "�@�N���A����K�v������܂�^000000�]";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	if(checkquest(7597)) {	// �����㖢��
		mes "[�j�[�Y�w�b�O]";
		mes "�{���ɂ����l�ł����B";
		cutin "ep14_nyd04", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�i�ߊ��ɕ񍐂ł���悤�ɁA";
		mes "���������N�����̎�����";
		mes "�`���Ă����܂����̂ŁA";
		mes "�񍐂Ɍ������Ă��������B";
		close2;
		cutin "ep14_nyd04", 255;
		end;
	}
	if(checkquest(116545)) {
		mes "[�j�[�Y�w�b�O]";
		mes "���Ƀ����N��|���܂����ˁB";
		cutin "ep14_nyd04", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�ނ͗~����߂��܂����B";
		mes "���܂�ς���ē�������ȗ́B";
		mes "���̐��E�����ݍ��݁A";
		mes "�V�������g�̐��E��n��Ƃ�����]�B";
		mes "�ނ͉������������̎v���ʂ��";
		mes "�����������̂ł��傤�B";
		cutin "ep14_nyd02", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�������A�F����̂�������";
		mes "�ނ̖�]��ł��ӂ������ł��܂����B";
		mes "���B�͎푰�𒴂��ċ��͂��邱�ƂŁA";
		mes "����Ȑ�]��ނ��鎖���ł����̂ł��B";
		cutin "ep14_nyd04", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�i�ߊ��ɕ񍐂ł���悤�ɁA";
		mes "���������N�����̎�����";
		mes "�`���Ă����܂��傤�B";
		mes "����J�l�ł����B";
		next;
		cutin "ep14_nyd04", 255;
		mes "�]^ff0000����ȍ~�A���_�a�ɓ��邱�Ƃ�";
		mes "�@�ł��Ȃ��Ȃ�܂��B";
		mes "�@�i�ߊ��A�W�t�ɕ񍐂��Ă���A";
		mes "�@1��ڂ̌ߑO5���ȍ~�ɁA";
		mes "�@�ēx���_�a�ɓ��邱�Ƃ�";
		mes "�@�ł���悤�ɂȂ�܂�^000000�]";
		setquest 7597;
		delquest 7593;
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	if(checkquest(7593) == 0) {
		cutin "ep14_nyd01", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�\���󂠂�܂��񂪁A";
		mes "�i�ߊ��̋��Ȃ��ɂ�";
		mes "�o���������邱�Ƃ��ł��܂���B";
		mes "���_�������˗����ꂽ���̂�";
		mes "����������Ă��܂��B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�i�ߊ��q�o�E�A�W�t�l�ɉ���āA";
		mes "�˗����󂯂Ă��ĉ������B";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	mes "�]���Ɏ�𓖂Ă�ƁA";
	mes "�@���̗͂��ꂪ��������B";
	mes "�@���̗���ɐg��C�����";
	mes "�@�[�w���ɐN���ł���̂��낤���]";
	next;
	if(select("����","����Ȃ�") == 2) {
		cutin "ep14_nyd04", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�킩��܂����B";
		mes "�o������܂ŏ\���ɏ�������";
		mes "���Ԃ��K�v�ł��傤�B";
		mes "������菀�����ė��ĉ������B";
		mes "���͂����ő҂��Ă��܂��B";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	if(getonlinepartymember() < 1) {
		mes "[�j�[�Y�w�b�O]";
		mes "���̐�͈�l�ł͊댯�ł��B";
		mes "�p�[�e�B�[���������Ă��痈�ĉ������B";
		cutin "ep14_nyd01", 2;
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	switch(mdenter("end_of_morocc")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[end_of_morocc] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x9, 0x00ff99, 0x190, 12, 0, 0;
		if(!checkquest(96435))
			setquest 96435;
		//warp "1@eom.gat",101,16;
		//warp "1@eom_jp.gat",45,66;
		end;
	case 1:	// �p�[�e�B�[������
	case 2:	// �_���W�������쐬
		mes "[�j�[�Y�w�b�O]";
		mes "���Ȃ��̃p�[�e�B�[�œ��ꋖ��";
		mes "�\������Ă��܂���B";
		mes "�p�[�e�B�[���[�_�[���琳����";
		mes "�v�����Ă���������΁A����";
		mes "���_�a�ɒʂ���������J���܂��傤�B";
		cutin "ep14_nyd01", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�F����̈��S�̂��߁A";
		mes "�����͂����肢���܂��B";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	default:	// ���̑��G���[
		close;
	}
OnInit:
	waitingroom "���_�a����", 0;
	end;
}

1@eom_jp.gat,45,75,0	script	���E���Ɏ�����#eom_jp	844,{
	if(checkquest(7598)) {
		if(checkquest(7598)&2 == 0 && checkquest(73730)&2) {
			mes "^ff0000[�C���t�H���[�V����]";
			mes "�ē��ꎞ�Ԃ��߂��Ă��邽��";
			mes "�i�ނ��Ƃ��o���܂���]^000000";
			close2;
			warp "moro_cav.gat",45,66;
			end;
		}
		if(checkquest(7598)&2) {
			delquest 7598;
			delquest 73730;
			setquest 7598;
			setquest 73730;
		}
	}
	else {
		setquest 7598;
		setquest 73730;
	}
	donpcevent getmdnpcname("EoMControl")+ "::OnStart";
	warp getmdmapname("1@eom.gat"),101,16;
	end;
OnInit:
	waitingroom "���_�a����",0;
	end;
}

//============================================================
// Floor 1
//------------------------------------------------------------
1@eom.gat,1,1,0	script	EoMControl	139,{
OnStart:
	if('flag)
		end;
	set 'flag,1;

	hideonnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh");
	hideonnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah");
	hideonnpc getmdnpcname("���_�̎g�k�E�A�n�g#ah02");
	hideonnpc getmdnpcname("���������Ă����#shnaim");
	hideonnpc getmdnpcname("���������Ă����#ahat02");
	hideonnpc getmdnpcname("#gate_to_center");
	hideonnpc getmdnpcname("���L#eomloki01");
	hideonnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd01");
	hideonnpc getmdnpcname("#eom_gate_to_ice");
	hideonnpc getmdnpcname("#eom_ice_to_center");
	hideonnpc getmdnpcname("�����N#mockid03");
	hideonnpc getmdnpcname("#eom_gate_to_last");
	hideonnpc getmdnpcname("�ł܂����n��#01");
	hideonnpc getmdnpcname("�ł܂����n��#02");
	hideonnpc getmdnpcname("#eom_fire_to_center");
	hideonnpc getmdnpcname("���L#op");
	hideonnpc getmdnpcname("�j�[�Y�w�b�O#op");
	hideonnpc getmdnpcname("#eom_bgm_change2");
	hideonnpc getmdnpcname("#eom_bgm_change3");
	hideonnpc getmdnpcname("#eom_bgm_change4");
	hideonnpc getmdnpcname("#morocc_god");
	hideonnpc getmdnpcname("#eom_quest");
	hideonnpc getmdnpcname("��]�̐_�����N#04");
	hideonnpc getmdnpcname("���L#eomnyd04");
	hideonnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd04");
	hideonnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd02");
	end;
}

1@eom.gat,1,1,0	script	callmon#eom1	139,{
OnStart:
	initnpctimer;
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@event$,getmdnpcname("callmon#eom1")+"::OnKilled";
	set '@mob1,callmonster('@mdmap$,102,30,"���_�̎g�k�E�A�n�g",3105,'@event$);
	set '@mob2,callmonster('@mdmap$,98, 30,"���_�̔j��",1918,'@event$);
	set '@mob3,callmonster('@mdmap$,100, 30,"���_�̔j��",1918,'@event$);
	set '@mob4,callmonster('@mdmap$,104, 30,"���_�̔j��",1918,'@event$);
	set '@mob5,callmonster('@mdmap$,106, 30,"���_�̔j��",1918,'@event$);
	set '@mob6,callmonster('@mdmap$,102,40,"���_�̎g�k�E�V�i�C��",3106,'@event$);
	set '@mob7,callmonster('@mdmap$,98, 40,"���_�̔j��",1921,'@event$);
	set '@mob8,callmonster('@mdmap$,100, 40,"���_�̔j��",1921,'@event$);
	set '@mob9,callmonster('@mdmap$,104, 40,"���_�̔j��",1921,'@event$);
	set '@mob0,callmonster('@mdmap$,106, 40,"���_�̔j��",1921,'@event$);
	if(getmapusers('@mdmap$) <= 2) {
		setmobhp '@mob1,getmobhp('@mob1)/2;
		setmobhp '@mob6,getmobhp('@mob6)/2;
	}
	end;
OnTimer3000:
	announce "�A�n�g : ���̖�̐�ɐi�ނɂ́A���ƃV�i�C����|�����̍��������K�v������܂��B", 0x9, 0x00ff00;
	end;
OnTimer6000:
	stopnpctimer;
	announce "�A�n�g : �����A�䂪��Ɖ�ɑ��������͂������Ă��邩�A���Ɍ����Ă��������I", 0x9, 0x00ff00;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom1")+ "::OnKilled");
	if('@count <= 0) {
		hideoffnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh");
		hideoffnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah");
		hideoffnpc getmdnpcname("���_�̎g�k�E�A�n�g#ah02");
	}
	end;
}

1@eom.gat,101,43,3	script	���_�̎g�k�E�A�n�g#ahat	493,{
	if(Sex)
		cutin "ep13_ahat_f", 2;
	else
		cutin "ep13_ahat_m", 2;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		// ������
		mes "[�A�n�g]";
		mes "���߂Ă��ڂɂ�����܂��ˁB";
		mes "���_�̍ŏ��̂����ׁA";
		mes "�A�n�g�Ɛ\���܂��B";
		close2;
		cutin "ep13_ahat_f", 255;
		end;
	}
	if(DIC_2QUE < 16) {		// �L���ƐK���̒j�N�G�X�g
		mes "[�A�n�g]";
		mes "���߂Ă��ڂɂ�����܂��ˁB";
		mes "���_�̍ŏ��̂����ׁA";
		mes "�A�n�g�Ɛ\���܂��B";
		unittalk "�A�n�g : ���߂Ă��ڂɂ�����܂��ˁB���_�̍ŏ��̂����ׁA�A�n�g�Ɛ\���܂��B";
	}
	else {
		mes "[�A�n�g]";
		mes "���ǂ����܂ŗ��Ă��܂��܂������B";
		mes "���Ȃ��Ƃ����l��";
		mes "�{���ɂ������ł��ˁB";
		unittalk "�A�n�g : ���ǂ����܂ŗ��Ă��܂��܂������B���Ȃ��Ƃ����l�͖{���ɂ������ł��ˁB";
		next;
		mes "[�A�n�g]";
		mes "�t�t�t�c�c";
		mes "���������ɂ��邱�Ƃ�";
		mes "�����Ă���悤�ł��ˁB";
		mes "�����������͗\�z���Ă����̂ł�";
		mes "�Ȃ��ł����H";
		unittalk "�A�n�g : �t�t�t�c�c���������ɂ��邱�Ƃɋ����Ă���悤�ł��ˁB�����������͗\�z���Ă����̂ł͂Ȃ��ł����H";
		next;
		mes "[�A�n�g]";
		mes "���߂Ă����A�������܂��傤�B";
		mes "���_�̍ŏ��̂����ׁA";
		mes "�A�n�g�Ɛ\���܂��B";
		unittalk "�A�n�g : ���߂Ă����A�������܂��傤�B���_�̍ŏ��̂����ׁA�A�n�g�Ɛ\���܂��B";
	}
	next;
	mes "[�A�n�g]";
	mes "�䂪�傩��";
	mes "���Ȃ��ɋq�l�Ƃ��Ă̎��i�����邩�A";
	mes "���ƃV�i�C���Ŏ����悤�ɂ�";
	mes "�������܂����B";
	unittalk "�A�n�g : �䂪�傩�炠�Ȃ��ɋq�l�Ƃ��Ă̎��i�����邩�A���ƃV�i�C���Ŏ����悤�ɂƖ������܂����B";
	next;
	mes "[�A�n�g]";
	mes "���Ȃ��͎���̗͂�";
	mes "�����ɗ����Ǝv���Ă���悤�ł����A";
	mes "����͑傫�ȊԈႢ�ł��B";
	unittalk "�A�n�g : ���Ȃ��͎���̗͂ł����ɗ����Ǝv���Ă���悤�ł����A����͑傫�ȊԈႢ�ł��B";
	next;
	mes "[�A�n�g]";
	mes "���ׂĂ͉䂪��̈ӎv�B";
	mes "�܂��͂��̖���J�����Ƃ��ł��邩";
	mes "�����Ă݂܂��傤�B";
	unittalk "�A�n�g : ���ׂĂ͉䂪��̈ӎv�B�܂��͂��̖���J�����Ƃ��ł��邩�����Ă݂܂��傤�B";
	close2;
	setquest 7596;
	cutin "ep13_ahat_f", 255;
	mapwarp getmdmapname("1@eom.gat"),getmdmapname("1@eom.gat"),103,16;
	donpcevent getmdnpcname("callmon#eom1")+"::OnStart";
	hideonnpc;
	end;
}

1@eom.gat,101,55,3	script	���_�̎g�k�E�A�n�g#ah02	493,{
	if(Sex)
		cutin "ep13_ahat_f", 2;
	else
		cutin "ep13_ahat_m", 2;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�A�n�g]";
		mes "�������ł��ˁB";
		mes "�䂪��̋q�l�Ƃ���";
		mes "�����������͂ł��B";
		close2;
		cutin "ep13_ahat_f", 255;
		end;
	}
	mes "[�A�n�g]";
	mes "�N�b�c�c�n�n�c�c�A�n�n�n�b�I";
	mes "���A���΁c�c�䂪�傪��ڂ���";
	mes "����ł��ˁc�c����قǂ܂łƂ́c�c�B";
	unittalk "�A�n�g : �N�b�c�c�n�n�c�c�A�n�n�n�b�I�@���A���΁c�c�䂪�傪��ڂ�������ł��ˁc�c����قǂ܂łƂ́c�c�B";
	next;
	mes "[�A�n�g]";
	mes "�ǂ����c�c";
	mes "��X�̖�ڂ͂����܂ł̂悤�ł��c�c�B";
	unittalk "�A�n�g : �ǂ����c�c��X�̖�ڂ͂����܂ł̂悤�ł��c�c�B";
	next;
	mes "[�A�n�g]";
	mes "�����A�����ɂ����ɉ�X�̍�������A";
	mes "��ɐi��ł��������B";
	mes "�䂪��ɉ���i���[���A";
	mes "�M���B�ɂ��邱�Ƃ�";
	mes "�ؖ����ꂽ�̂ł�����c�c�B";
	unittalk "�A�n�g : �����A�����ɂ����ɉ�X�̍��������ɐi��ł��������B�䂪��ɉ���i���[���A�M���B�ɂ��邱�Ƃ͏ؖ����ꂽ�̂ł�����c�c�B";
	misceffect 231, getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh");
	misceffect 231, getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah");
	getitem 6713,1;
	getitem 6714,1;
	hideonnpc getmdnpcname("���_�̎g�k�E�A�n�g#ah02");
	close2;
	cutin "ep13_ahat_f", 255;
	end;
}

1@eom.gat,98,56,0	script	��ɂȂ��Ă��鍰�̊�#sh	844,{
	if(countitem(6714) < 1) {
		mes "�]�����J���ɂ̓V�i�C���̍���";
		mes "�@���̊�𖞂����K�v������]";
		close;
	}
	mes "�]��ɂȂ��Ă��鍰�̊��";
	mes "�@�V�i�C���̍��𒍓����܂��]";
	next;
	misceffect 72, getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh");
	progressbar 5;
	delitem 6714, 1;
	misceffect 6, getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh");
	hideonnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh");
	hideoffnpc getmdnpcname("���������Ă����#shnaim");
	misceffect 6, getmdnpcname("���������Ă����#shnaim");
	misceffect 202, getmdnpcname("���������Ă����#shnaim");
	donpcevent getmdnpcname("#gate_to_center")+ "::OnStart";
	mes "�]�킪�V�i�C���̍��Ŗ�������܂����]";
	close;
}
1@eom.gat,98,56,0	script	���������Ă����#shnaim	844,{}

1@eom.gat,104,56,0	script	��ɂȂ��Ă��鍰�̊�#ah	844,{
	if(countitem(6713) < 1) {
		mes "�]�����J���ɂ̓A�n�g�̍���";
		mes "�@���̊�𖞂����K�v������]";
		close;
	}
	mes "�]��ɂȂ��Ă��鍰�̊��";
	mes "�@�A�n�g�̍��𒍓����܂��]";
	next;
	misceffect 72, getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah");
	progressbar 5;
	delitem 6713, 1;
	misceffect 6, getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah");
	hideonnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah");
	hideoffnpc getmdnpcname("���������Ă����#ahat02");
	misceffect 6, getmdnpcname("���������Ă����#ahat02");
	misceffect 202, getmdnpcname("���������Ă����#ahat02");
	donpcevent getmdnpcname("#gate_to_center")+ "::OnStart";
	mes "�]�킪�A�n�g�̍��Ŗ�������܂����]";
	close;
}
1@eom.gat,104,56,0	script	���������Ă����#ahat02	844,{}

1@eom.gat,101,58,0	script	#gate_to_center	45,2,2,{
OnTouch:
	if(checkquest(7596))
		delquest 7596;
	warp getmdmapname("1@eom.gat"),98,115;
	end;
OnStart:
	if(!'flag) {
		set 'flag,1;
		end;
	}
	misceffect 231, getmdnpcname("#gate_to_center");
	misceffect 202, getmdnpcname("#gate_to_center");
	hideoffnpc getmdnpcname("#gate_to_center");
	end;
}

//============================================================
// Center Room
//------------------------------------------------------------
1@eom.gat,100,122,3	script	������Ȃ����N#mockid01	10038,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		cutin "morocc_kid.bmp", 2;
		mes "[���N]";
		mes "�l�͍��Ƃ��Ă�";
		mes "�C���������񂾁B";
		mes "�����炱���ōU��������A";
		mes "�����Ȃ��Ƃ͂��Ȃ���B";
		close2;
		cutin "morocc_kid.bmp", 255;
		end;
	}
	if(checkquest(201730)) {
		if(select("�}��","��b������") == 1) {
			if('flag)
				close;
			hideonnpc getmdnpcname("������Ȃ����N#mockid01");
			hideoffnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd01");
			hideoffnpc getmdnpcname("#eom_gate_to_ice");
			misceffect 135, getmdnpcname("#eom_gate_to_ice");
			set 'dummy,sleep2(1000);
			misceffect 231, getmdnpcname("#eom_gate_to_ice");
			close;
		}
	}
	else {
		menu "��b������",-;
	}
	if('flag)
		close;
	set 'flag,1;
	cutin "morocc_kid", 2;
	mes "[���N]";
	mes "�悤�����B";
	mes "�ǂ����ȁH�@���̕����́B";
	mes "�l�͂��ƋC�ɓ����Ă���񂾂��ǁB";
	announce "���N : �悤�����B�ǂ����ȁH�@���̕����́B�l�͂��ƋC�ɓ����Ă���񂾂��ǁB", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�N�́H";
	unittalk getcharid(3),strcharinfo(0)+" : �N�́H";
	next;
	mes "[���N]";
	mes "����H�@������Ȃ��́H";
	announce "���N : ����H�@������Ȃ��́H", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[���N]";
	mes "���͂́A�������I";
	mes "�N�����̖͐̂l����";
	mes "�m��Ȃ��񂾂�ˁB";
	announce "���N : ���͂́A�������I�@�N�����̖͐̂l�����m��Ȃ��񂾂�ˁB", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[���N]";
	mes "���߂񂲂߂�B";
	mes "���点�����͂Ȃ��񂾁B";
	mes "�l�͌N������";
	mes "�����܂Œǂ������Ă����ړI����B";
	announce "���N : ���߂񂲂߂�B���点�����͂Ȃ��񂾁B�l�͌N�����������܂Œǂ������Ă����ړI����B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�c�c�����A�l�������N�B";
	mes "�Ȍ�A�����m�肨�����B";
	announce "�����N : �c�c�����A�l�������N�B�Ȍ�A�����m�肨�����B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�܂����A����2�l��|���Ȃ�ĂˁA";
	mes "����2�l�͐M�����Ă����̂ɂȁc�c�B";
	announce "�����N : �܂����A����2�l��|���Ȃ�ĂˁA����2�l�͐M�����Ă����̂ɂȁc�c�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�˂��A�ǂ����Ă����܂�";
	mes "���͂�����Ȃ���`���҂Ȃ��";
	mes "�����Ă���́H";
	mes "�����Ƒ��ɁA����������������";
	mes "����ƁA�l�͎v����B";
	announce "�����N : �˂��A�ǂ����Ă����܂Ŏ��͂�����Ȃ���`���҂Ȃ�đ����Ă���́H�@�����Ƒ��ɁA��������������������ƁA�l�͎v����B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	close2;
	cutin "morocc_kid", 255;
	donpcevent getmdnpcname("������Ȃ����N#mockid01")+ "::OnStart";
	end;
OnStart:
	initnpctimer;
	hideoffnpc getmdnpcname("���L#eomloki01");
	hideoffnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd01");
	end;
OnTimer1000:
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : �t���B���̑��������ꏊ�����O���p�ӂ���Ƃł������̂��H";
	end;
OnTimer6000:
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : �΂킹��ȁB������͎����B�ł��̏ꏊ���A�����邱�Ƃ��o����B";
	end;
OnTimer11000:
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : �����ƕ�����₷�������Ă�낤�B";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : ���O���p�ӂ����ꏊ�ȂǁA������ɂ͕K�v�Ȃ��B";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : �����āA���O�����̐��E�ɑ��݂ł���ꏊ���ȁB";
	end;
OnTimer26000:
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd01")),"�j�[�Y�w�b�O : �����ł��A���Ȃ��͕K�v�̂Ȃ����݁c�c�B�������A���݂��Ă͂����Ȃ��̂ł��B";
	end;
OnTimer31000:
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd01")),"�j�[�Y�w�b�O : ���̏؋��ɁA���E�������Ȃ��̑��݂�ے肵�Ă��܂��B";
	end;
OnTimer36000:
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd01")),"�j�[�Y�w�b�O : ���E���C�O�h���V���̎��҂���A�j�[�Y�w�b�O�������܂��B�c�c���̐��E��������Ȃ���!!";
	end;
OnTimer41000:
	announce "�����N : ����ȂɎ׌��ɂ��Ȃ��łق����Ȃ��B�l�ƌN�̒�����Ȃ����A�j�[�Y�w�b�O�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer46000:
	announce "�����N : ���������Ă����Y�ꂿ������́H�@�l�̌��t�ɂ���ȂɔM�S�Ɏ����X���Ă��ꂽ�̂ɁB", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer51000:
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : �ӂ�����ȁI";
	misceffect 17, getmdnpcname("������Ȃ����N#mockid01");
	end;
OnTimer56000:
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : �c�c�`�b�B���΂Ɏ��̂ł͂Ȃ��������B";
	end;
OnTimer62000:
	announce "�����N : ����A�����ĂȂ��������ȁH�@����͖l�̌��B�����珝�����Ȃ���B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer68000:
	announce "�����N : �����������q�l�����Ă��ꂽ�񂾁B����Ȃ�̂����ĂȂ������Ȃ��ƂˁB", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer74000:
	announce "�����N : �������I�@�A�n�g�ƃV�i�C���ɂ́A������x�`�����X�������悤�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer80000:
	announce "�����N : �_�ƂȂ����l�̗͂ō��o����2�C�̏b������񂾂��ǁc�c�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer86000:
	announce "�����N : �����ɃA�n�g�ƃV�i�C���̍����ڐA����̂��I�@�ǂ������A�ʔ��������낤�H", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer91000:
	announce "�����N : ������Ƃ����]�����B�l�̗͂Ő��܂�ς����2�l�̗͂������Ă������B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer94000:
	misceffect 6, getmdnpcname("������Ȃ����N#mockid01");
	hideonnpc getmdnpcname("������Ȃ����N#mockid01");
	unittalk getnpcid(0,getmdnpcname("���L#eomloki01")),"���L : ������̂��I";
	set getvariableofnpc('flag,getmdnpcname("�j�[�Y�w�b�O#eomnyd01")),1;
	end;
OnTimer96000:
	hideonnpc getmdnpcname("���L#eomloki01");
	hideoffnpc getmdnpcname("#eom_gate_to_ice");
	misceffect 135, getmdnpcname("#eom_gate_to_ice");
	end;
OnTimer97000:
	stopnpctimer;
	misceffect 231, getmdnpcname("#eom_gate_to_ice");
	end;
}

1@eom.gat,95,122,5	script	���L#eomloki01	512,{
	cutin "ep14_roki01", 2;
	mes "[���L]";
	mes "�c�c�t���B";
	mes "����Ȓ��ԁA�����I��点��";
	mes "�Ƃ��ƂƋA�邼�B";
	close2;
	cutin "ep14_roki01", 255;
	end;
}

1@eom.gat,94,120,5	script	�j�[�Y�w�b�O#eomnyd01	510,2,2,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		cutin "ep14_nyd01.bmp", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "����̌���ɂ͎������͂��܂��B";
		mes "���̕��g�𓯍s���������̂ł���";
		mes "��\�҂̕��Ƃ��b������";
		mes "�����܂��񂩁H";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if('flag == 0) {
		cutin "ep14_nyd01", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�������ł������c�c�B";
		mes "��������͔��͂Ȃ���A";
		mes "������������`�����܂��B";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	if(getmercinfo(0)) {
		cutin "ep14_nyd01", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "���łɗb�������܂��ˁc�c�B";
		mes "���݌_�񒆂ł���b���Ƃ̌_���؂�A";
		mes "����A��čs���Ă͂��������܂��񂩁H";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
	cutin "ep14_nyd01", 2;
	mes "[�j�[�Y�w�b�O]";
	mes "����̌���ɂ͎������͂��܂��B";
	mes "���Ȃ����]�ނȂ��";
	mes "���̕��g�𓯍s�����܂��傤�B";
	unittalk "�j�[�Y�w�b�O : ����̌���ɂ͎������͂��܂��B���Ȃ����]�ނȂ�Ύ��̕��g�𓯍s�����܂��傤�B";
	next;
	switch(select("�ꏏ�ɍs��","���͂܂�����","^ff0000������@���m�F����^000000")) {
	case 1:
		mes "[�j�[�Y�w�b�O]";
		mes "���������҂̖��߂�";
		mes "�ʂ����܂��傤�B";
		unittalk "�j�[�Y�w�b�O : ���������҂̖��߂��ʂ����܂��傤�B";
		misceffect 72, getmdnpcname("�j�[�Y�w�b�O#eomnyd01");
		setnpcdisplay getmdnpcname("�j�[�Y�w�b�O#eomnyd01"),2131;
		setnpcdisplay getmdnpcname("�j�[�Y�w�b�O#eomnyd01"),510;
		hideonnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd01");
		cutin "ep14_nyd01", 255;
		mes "�]^4d4dff���҃j�[�Y�w�b�O�̕��g��";
		mes "�@���ԂƂ��ĎQ�킵�܂���^000000�]";
		setquest 7605;
		makemerc 3087,1800;
		close;
	case 2:
		mes "[�j�[�Y�w�b�O]";
		mes "�����ł����c�c�B";
		mes "���̗͂��K�v�ɂȂ�����";
		mes "���ł������Ă��������B";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	case 3:
		mes "�]���҂̕��g��";
		mes "�@�v���C���[�Ƌ��ɐ���Ă����";
		mes "�@NPC�ł��B";
		mes "�@30���o�߂��邩�AHP��0�ɂȂ��";
		mes "�@���Ȃ��Ȃ��Ă��܂��܂��]";
		next;
		mes "[������@]";
		mes "�]^ff0000[Alt]^000000�L�[+�����X�^�[�����N���b�N��";
		mes "�@�N���b�N���������X�^�[��";
		mes "�@�U�����܂��B";
		mes "�@^ff0000[Alt]^000000�L�[+�n�ʂ����N���b�N��";
		mes "�@�N���b�N�����ꏊ�Ɉړ����܂��]";
		next;
		mes "[�X�e�[�^�X]";
		mes "�]���҂̕��g���E�N���b�N�����";
		mes "�@^0000ff[��ԕ\��]^000000��^0000ff[�ҋ@]^000000���\������܂��B";
		mes "�@^0000ff[��ԕ\��]^000000��I�Ԃ�";
		mes "�@�X�e�[�^�X�E�B���h�E��";
		mes "�@�\������܂��]";
		next;
		mes "�]�X�e�[�^�X�E�B���h�E����";
		mes "�@^0000ff[����]^000000��I�ԂƎ��҂̕��g��";
		mes "�@���ł��܂��B";
		mes "�@^0000ff[�X�L��]^000000�͏������Ă��Ȃ����߁A";
		mes "�@�Ȃɂ��I�Ԃ��Ƃ��ł��܂���]";
		next;
		mes "�]^0000ff[�ҋ@]^000000��I�ԂƍU������߂�";
		mes "�@�v���C���[��ǔ�����";
		mes "�@�ҋ@��ԂɂȂ�܂��B";
		mes "�@������x^0000ff[�ҋ@]^000000��I�������";
		mes "�@�ҋ@��Ԃ���������܂��]";
		next;
		mes "�]��x���҂̕��g�𒇊Ԃɂ���ƁA";
		mes "�@^ff00003���Ԍo�߂���܂�";
		mes "�@�ēx���Ԃɂ��邱�Ƃ��ł��܂���^000000�]";
		close2;
		cutin "ep14_nyd01", 255;
		end;
	}
OnTouch:
	if('flag > 0)
		unittalk "�j�[�Y�w�b�O : �҂��ĉ������I";
	end;
}

1@eom.gat,91,120,0	script	#eom_gate_to_ice	45,2,2,{
	if(!checkquest(96436))
		setquest 96436;
	warp getmdmapname("1@eom.gat"),56,88;
	end;
}

1@eom.gat,100,122,3	script	�����N#mockid03	10038,{
	cutin "morocc_kid", 2;
	mes "[�����N]";
	mes "���͂́I�@�܂������Ă��񂾂ˁB";
	mes "��������B";
	announce "�����N : ���͂́I�@�܂������Ă��񂾂ˁB��������B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�����A����2�C�ɏ��Ă�Ƃ�";
	mes "�v���ĂȂ������񂾂��ǁc�c�B";
	announce "�����N : �����A����2�C�ɏ��Ă�Ƃ͎v���ĂȂ������񂾂��ǁc�c�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�܂��A�l�����X�ɌN������r�����āA";
	mes "���̐��E��S�Ĉ��ݍ��߂΂�����B";
	announce "�����N : �܂��A�l�����X�ɌN������r�����āA���̐��E��S�Ĉ��ݍ��߂΂�����B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�c�c���āA���낻��n�߂悤���B";
	mes "���̕����ő҂��Ă��B";
	announce "�����N : �c�c���āA���낻��n�߂悤���B���̕����ő҂��Ă��B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	close2;
	cutin "morocc_kid", 255;
	misceffect 57, getmdnpcname("�����N#mockid03");
	sleep 2000;
	misceffect 6, getmdnpcname("�����N#mockid03");
	hideonnpc getmdnpcname("�����N#mockid03");
	hideoffnpc getmdnpcname("#eom_gate_to_last");
	sleep 1000;
	misceffect 316, getmdnpcname("#eom_gate_to_last");
	donpcevent getmdnpcname("�����N#eom_master")+ "::OnStart";
	end;
}

1@eom.gat,98,127,0	script	#eom_gate_to_last	45,2,2,{
	if(!checkquest(96438))
		setquest 96438;
	warp getmdmapname("1@eom.gat"),102,178;
	end;
}

//============================================================
// Floor 2
//------------------------------------------------------------
1@eom.gat,56,88,0	script	#icemob01	139,1,1,{
OnTouch:
	hideonnpc;
	set '@mdmap$,getmdmapname("1@eom.gat");
	areamonster '@mdmap$,35,90,49,100,"�t���X�g�X�p�C�_�[",3088,5;
	end;
}

1@eom.gat,22,116,3	script	#icemob02	844,2,2,{
	end;
OnTouch:
	hideonnpc;
	set '@mdmap$,getmdmapname("1@eom.gat");
	areamonster '@mdmap$,22,113,26,117,"�t���X�g�X�p�C�_�[",3088,5;
	end;
}

1@eom.gat,53,134,5	script	#icemob03	844,2,2,{
	end;
OnTouch:
	hideonnpc;
	set '@mdmap$,getmdmapname("1@eom.gat");
	areamonster '@mdmap$,48,132,53,136,"�t���X�g�X�p�C�_�[",3088,5;
	end;
}

1@eom.gat,38,129,3	script	�u���i���l�A#brinpc01	3091,10,10,{
	end;
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	announce "�u���i���l�A : ���҂����Ă��܂����B�c�c���ł���A�V�i�C���ł��B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	sleep 3000;
	announce "�u���i���l�A : �����N�l��蒸�����V���ȑ́c�c���ɑf���炵���͂������Ă��܂��B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	sleep 3000;
	announce "�u���i���l�A : �ӂӂӁc�c�C���͂������ł����H�@���Ȃ��̖��^�������܂łł��B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	sleep 3000;
	announce "�u���i���l�A : �����A������x�����肵�܂��傤�B����ł͂��悤�Ȃ�I", 0x9, 0xff0000, 0x190, 14, 0, 0;
	misceffect 236, getmdnpcname("�u���i���l�A#brinpc01");
	hideonnpc getmdnpcname("�u���i���l�A#brinpc01");
	donpcevent getmdnpcname("callmon#eom2")+ "::OnStart";
	initnpctimer;
	end;
OnTimer3000:
OnTimer6000:
OnTimer9000:
OnTimer12000:
OnTimer15000:
	// TODO
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@event$,getmdnpcname("�u���i���l�A#brinpc01")+"::OnKilled";
	set '@mob_id,getvariableofnpc('mob_id,getmdnpcname("callmon#eom2"));
	set '@mobhp,getmobhp('@mob_id);
	if('@mobhp < 25000000)
		set 'type,4;
	else if('@mobhp > 25000000 && '@mobhp < 30000000 && 'flag2 < 3)
		set 'type,3;
	else if('@mobhp > 30000000 && '@mobhp < 35000000 && 'flag2 < 2)
		set 'type,2;
	else if('@mobhp > 35000000 && '@mobhp < 40000000 && 'flag2 < 1)
		set 'type,1;
	else
		set 'type,0;
	if('type == 0)
		initnpctimer;
	else if('type == 4)
		stopnpctimer;
	else {
		if('type == 1)
			unittalk '@mob_id,"�u���i���l�A : �ӂӂӁc�c�����ő������������܂��傤�B";
		else if('type == 2)
			unittalk '@mob_id,"�u���i���l�A : �ő���A�G��H�炢�s�����Ȃ����I";
		else if('type == 3)
			unittalk '@mob_id,"�u���i���l�A : �ӂӂӁc�c�����ő��͂������󂩂��Ă���悤�ł��B";
		donpcevent getmdnpcname("callmon#eom2")+"::OnReSpawn";
		set '@count,getmapmobs('@mdmap$,'@event$ +'type);
		if('@count <= 0) {
			areamonster '@mdmap$,33,118,43,128," ",3088,5,'@event$ +'type;
		}
	}
	end;
OnTimer18000:
	initnpctimer;
	set 'flag2,'type;
	end;
OnKilled1:
OnKilled2:
OnKilled3:
	end;
}

1@eom.gat,1,1,0	script	callmon#eom2	139,{
OnStart:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@event$,getmdnpcname("callmon#eom2")+"::OnIceSpider";
	set 'mob_id,callmonster('@mdmap$,38,123,"�u���i���l�A#brimob01",3091,'@event$);
	sleep 3000;
	announce "�u���i���l�A : ��قǂ܂ł̎��Ɠ����Ǝv��Ȃ��ł��������I ", 0x9, 0xff0000, 0x190, 14, 0, 0;
	initnpctimer;
	end;
OnTimer10000:
	switch(rand(4)) {
	case 0:	donpcevent getmdnpcname("callmon#eom2")+ "::OnHeal";	break;
	case 1:	donpcevent getmdnpcname("callmon#eom2")+ "::OnJupitel";	break;
	case 2:	donpcevent getmdnpcname("callmon#eom2")+ "::OnThunder1";	break;
	case 3:	donpcevent getmdnpcname("callmon#eom2")+ "::OnThunder2";	break;
	}
	initnpctimer;
	end;
OnReSpawn:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@event$,getmdnpcname("callmon#eom2")+"::OnIceSpider";
	set '@mobhp,getmobhp('mob_id);
	set '@dummy,removemonster('mob_id);
	set 'mob_id,callmonster('@mdmap$,38,123,"�u���i���l�A#brimob01",3091,'@event$);
	setmobhp 'mob_id,'@mobhp;
	end;
OnHeal:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"�u���i���l�A : �ӂӂӁc�c�I";
	sleep 1000;
	mobuseskill 'mob_id,28,10,0,0,0,0;	// �q�[��
	sleep 1000;
	mobuseskill 'mob_id,28,10,0,0,0,0;	// �q�[��
	sleep 1000;
	mobuseskill 'mob_id,28,10,0,0,0,0;	// �q�[��
	end;
OnJupitel:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"�u���i���l�A : ���������̂͂������ł����H";
	sleep 2000;
	mobuseskill 'mob_id,664,5,0,0,0,0;	// ���C�h�t���[�Y
	sleep 2000;
	mobuseskill 'mob_id,84,28,0,0,0,1;	// ���s�e���T���_�[
	end;
OnThunder1:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"�u���i���l�A : ���ꂪ���܂�ς�������̗͂ł��I";
	sleep 1000;
	mobuseskill 'mob_id,664,5,0,0,0,0;	// ���C�h�t���[�Y
	sleep 1500;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,21,10,'@x-3,'@y+3,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x+3,'@y+3,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x+3,'@y-3,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-3,'@y-3,0,0;	// �T���_�[�X�g�[��
	end;
OnThunder2:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"�u���i���l�A : ���̑f���炵�����́A�g�������Ė��킢�Ȃ����I";
	sleep 1000;
	mobuseskill 'mob_id,664,5,0,0,0,0;	// ���C�h�t���[�Y
	sleep 1500;
	mobuseskill 'mob_id,85,5,0,0,0,0;	// ���[�h�I�u���@�[�~���I��
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,21,10,'@x-3,'@y+3,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+3,'@y+3,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+3,'@y-3,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-3,'@y-3,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y-4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y-4,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-5,'@y+5,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+5,'@y+5,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+5,'@y-5,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-5,'@y-5,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-6,'@y+6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+6,'@y+6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+6,'@y-6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-6,'@y-6,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-7,'@y+7,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+7,'@y+7,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+7,'@y-7,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-7,'@y-7,0,0;	// �T���_�[�X�g�[��
	end;
OnIceSpider:
	stopnpctimer;
	stopnpctimer getmdnpcname("�u���i���l�A#brinpc01");
	announce "�j�[�Y�w�b�O : �u���i���l�A���|��A�o�����J�����悤�ł��I", 0x9, 0x00ff00, 0x190, 12, 0, 0;
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("�u���i���l�A#brinpc01")+"::OnKilled1";
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("�u���i���l�A#brinpc01")+"::OnKilled2";
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("�u���i���l�A#brinpc01")+"::OnKilled3";
	hideonnpc getmdnpcname("#icemob02");
	hideonnpc getmdnpcname("#icemob03");
	hideoffnpc getmdnpcname("#eom_ice_to_center");
	hideoffnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd02");
	donpcevent getmdnpcname("�����n��#lavapond01")+ "::OnStart";
	donpcevent getmdnpcname("�����n��#lavapond02")+ "::OnStart";
	end;
}

1@eom.gat,59,147,3	script	�j�[�Y�w�b�O#eomnyd02	510,{
	mes "[�j�[�Y�w�b�O]";
	mes "���̐�͎ܔM�̗n��n�т�";
	mes "�L�����Ă���悤�ł��B";
	mes "���̏ꏊ�Ɏ�������^ff0000�i�v��^000000��";
	mes "�������̎悵�Ă��������������B";
	mes "�����Ɩ��ɗ��ł��傤�B";
	next;
	mes "[�j�[�Y�w�b�O]";
	mes "�Ȃɂ͂Ƃ�����A";
	mes "��ςȐ킢�ł����ˁc�c�B";
	mes "������o���邱�Ƃ͑�������܂��񂪁A";
	mes "���҂Ƃ��ċM���ɁA";
	mes "�C�O�h���V���̉�����c�c�B";
	misceffect 313,"";
	percentheal 100,100;
	close;
}

1@eom.gat,67,149,0	script	#eom_ice_to_center	45,2,2,{
	if(!checkquest(96437))
		setquest 96437;
	warp getmdmapname("1@eom.gat"),136,93;
	end;
}

//============================================================
// Floor 3
//------------------------------------------------------------
1@eom.gat,148,100,3	script	���L#flamewolf	512,5,5,{
	mes "[���L]";
	mes "���̗n��c�c�B";
	mes "�i�v���̋��͂ȗ�C�Ȃ�";
	mes "�~�߂��邩������Ȃ��ȁB";
	close;
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	sleep 1000;
	announce "���L : �����A���ĔM�C���I�@�̗͂��D���Ă����c�c�I", 0x9, 0x00ff00;
	sleep 3000;
	announce "���L : ���̗n������Ƃ����Ȃ���Εs�����ȁc�c�B", 0x9, 0x00ff00;
	sleep 3000;
	announce "���L : �����A�n��ɉi�v�����g���Ă݂Ă���B����Ȃ�n����~�߂��邩������Ȃ��B", 0x9, 0x00ff00;
	sleep 2000;
	hideonnpc getmdnpcname("���L#flamewolf");
	end;
}

1@eom.gat,168,133,3	script	���X�y���X�R�[��#npc	3092,10,10,{
	end;
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	announce "���X�y���X�R�[�� : �c�c��قǂԂ�ł��ˁB�A�n�g�ł��B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	sleep 3000;
	announce "���X�y���X�R�[�� : ��x�łт��g�ɂ��ւ�炸�A���̂悤�Ȏp�ɂȂ�A�܂����Ȃ��Ƒ��΂���Ƃ́c�c�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	sleep 3000;
	announce "���X�y���X�R�[�� : �������A�䂪��̖]�݂Ƃ���΁A�Ăт��̐g���ʂĂ�܂Ős�����܂��傤�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	sleep 3000;
	announce "���X�y���X�R�[�� : �����A�Q��܂��傤�B�������̉^���ɏI�~����ł̂ł��I", 0x9, 0xff0000, 0x190, 14, 0, 0;
	misceffect 225;
	hideonnpc;
	donpcevent getmdnpcname("callmon#eom3")+ "::OnStart";
	sleep 1000;
	initnpctimer;
	end;
OnTimer10000:
	initnpctimer;
	switch(rand(4)) {
	case 0:	donpcevent getmdnpcname("callmon#eom3")+ "::OnHellBurning1"; break;
	case 1:	donpcevent getmdnpcname("callmon#eom3")+ "::OnHellBurning2"; break;
	case 2:	donpcevent getmdnpcname("callmon#eom3")+ "::OnHellBurning3"; break;
	}
}

1@eom.gat,1,1,0	script	callmon#eom3	139,{
OnStart:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@event1$,getmdnpcname("callmon#eom3")+"::OnFlameWolf";
	set '@event2$,getmdnpcname("callmon#eom3")+"::OnKilled1";
	set '@mob2,callmonster('@mdmap$,162,130,"���C�̃J�[�T",3089,'@event2$);
	set '@mob3,callmonster('@mdmap$,165,130,"���C�̃J�[�T",3089,'@event2$);
	set '@mob4,callmonster('@mdmap$,168,130,"���C�̃J�[�T",3089,'@event2$);
	set '@mob5,callmonster('@mdmap$,171,130,"���C�̃J�[�T",3089,'@event2$);
	set '@mob6,callmonster('@mdmap$,174,130,"���C�̃J�[�T",3089,'@event2$);
	set '@mob7,callmonster('@mdmap$,162,133,"���C�̃J�[�T",3089,'@event2$);
	set '@mob8,callmonster('@mdmap$,165,133,"���C�̃J�[�T",3089,'@event2$);
	set '@mob9,callmonster('@mdmap$,168,133,"���C�̃J�[�T",3089,'@event2$);
	set '@mob10,callmonster('@mdmap$,171,133,"���C�̃J�[�T",3089,'@event2$);
	set '@mob11,callmonster('@mdmap$,174,133,"���C�̃J�[�T",3089,'@event2$);
	announce "���X�y���X�R�[�� : �ܔM�̉���A�S�Ă�R�₵�s�����Ȃ����I", 0x9, 0xff0000, 0x190, 14, 0, 0;
	set 'mob1,callmonster('@mdmap$,167,133,"���X�y���X�R�[��#01",3092,'@event1$);
	mobuseskill 'mob1,81,10,0,0,0,0;	// �T�C�g���b�V���[
	sleep 1000;
	unittalk 'mob1,"���X�y���X�R�[�� : �S�Ă͉䂪��̈ӂ̂܂܂ɁI";
	initnpctimer;
	sleep 2000;
	mobuseskill 'mob1,724,1,0,0,0,0;	// �t�@�C�A�X�g�[��
	end;
OnTimer7000:
	donpcevent getmdnpcname("callmon#eom3")+"::OnLeftLavaHeal";
	end;
OnTimer10000:
	donpcevent getmdnpcname("callmon#eom3")+"::OnRightLavaHeal";
	end;
OnTimer13000:
	donpcevent getmdnpcname("callmon#eom3")+"::OnWarpReturn";
	if(getmobhp('mob1) > 22500000 && rand(2))
		initnpctimer;
	end;
OnTimer27000:
	stopnpctimer;
	if(getmobhp('mob1) > 22500000)
		initnpctimer;
	end;
OnLeftLavaHeal:
	if(getmobhp('mob1) < 1) end;
	unittalk 'mob1,"���X�y���X�R�[�� : �䂪��̍�肾�����ܔM�̉����Â����Ȃ����Ƃł��I";
	set 'hp,getmobhp('mob1);
	set '@dummy,removemonster('mob1);
	set 'mob1,callmonster(getmdmapname("1@eom.gat"),156,117,"���X�y���X�R�[��#01",3092,getmdnpcname("callmon#eom3")+"::OnFlameWolf");
	setmobhp 'mob1,'hp;
	set getvariableofnpc('mob_id,getmdnpcname("���X�y���X�R�[��#npc")),'mob1;
	sleep 2000;
	mobuseskill 'mob1,724,1,0,0,0,0;	// �t�@�C�A�X�g�[��
	areamonster getmdmapname("1@eom.gat"),156-3,117-3,156+3,117+3,"���C�̃J�[�T",3089,3,getmdnpcname("callmon#eom3")+"::OnKilled1";
	end;
OnRightLavaHeal:
	if(getmobhp('mob1) < 1) end;
	set 'hp,getmobhp('mob1);
	set '@dummy,removemonster('mob1);
	set 'mob1,callmonster(getmdmapname("1@eom.gat"),180,129,"���X�y���X�R�[��#01",3092,getmdnpcname("callmon#eom3")+"::OnFlameWolf");
	setmobhp 'mob1,'hp;
	set getvariableofnpc('mob_id,getmdnpcname("���X�y���X�R�[��#npc")),'mob1;
	sleep 2000;
	mobuseskill 'mob1,721,1,0,0,0,0;	// ���C�h�E�F�u
	mobuseskill 'mob1,724,1,0,0,0,0;	// �t�@�C�A�X�g�[��
	areamonster getmdmapname("1@eom.gat"),180-3,129-3,180+3,129+3,"���C�̃J�[�T",3089,3,getmdnpcname("callmon#eom3")+"::OnKilled1";
	end;
OnWarpReturn:
	if(getmobhp('mob1) < 1) end;
	unittalk 'mob1,"���X�y���X�R�[�� : �������A��x�͎���|���������̂��Ƃ͂���܂��ˁB�ł����A�܂��ł�!!";
	set 'hp,getmobhp('mob1);
	set '@dummy,removemonster('mob1);
	set 'mob1,callmonster(getmdmapname("1@eom.gat"),168,121,"���X�y���X�R�[��#01",3092,getmdnpcname("callmon#eom3")+"::OnFlameWolf");
	setmobhp 'mob1,'hp;
	set getvariableofnpc('mob_id,getmdnpcname("���X�y���X�R�[��#npc")),'mob1;
	mobuseskill 'mob1,252,1,0,0,0,0;	// ���t���N�g�V�[���h
	end;
OnHellBurning1:
	if(getmobhp('mob1) < 1) end;
	unittalk 'mob1,"���X�y���X�R�[�� : �ܔM�̊C�Ɉ��܂�Ȃ����I";
	sleep 1000;
	mobuseskill 'mob1,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	sleep 2000;
	mobuseskill 'mob1,81,10,0,0,0,0;	// �T�C�g���b�V���[
	end;
OnHellBurning2:
	if(getmobhp('mob1) < 1) end;
	mobuseskill 'mob1,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	unittalk 'mob1,"���X�y���X�R�[�� : �ܔM�̉��ɕ�����Ȃ����I";
	sleep 2000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob1);
	mobuseskillpos 'mob1,80,10,'@x-2,'@y+2,0,0;	// �t�@�C�A�[�s���[
	sleep 2000;
	mobuseskillpos 'mob1,80,10,'@x+2,'@y+2,0,0;	// �t�@�C�A�[�s���[
	sleep 2000;
	mobuseskillpos 'mob1,80,10,'@x-2,'@y-2,0,0;	// �t�@�C�A�[�s���[
	sleep 2000;
	mobuseskillpos 'mob1,80,10,'@x+2,'@y-2,0,0;	// �t�@�C�A�[�s���[
	end;
OnHellBurning3:
	if(getmobhp('mob1) < 1) end;
	unittalk 'mob1,"���X�y���X�R�[�� : �ܔM��覐΂ŋ����ʂĂȂ���!!";
	sleep 1000;
	mobuseskill 'mob1,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	set '@mdmap$,getmdmapname("1@eom.gat");
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob1);
	monster '@mdmap$,'@x+3,'@y+3," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-3,'@y-3," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x+3,'@y-3," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-3,'@y+3," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	sleep 200;
	monster '@mdmap$,'@x+6,'@y+6," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-6,'@y-6," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x+6,'@y-6," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-6,'@y+6," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	sleep 200;
	monster '@mdmap$,'@x+9,'@y+9," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-9,'@y-9," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x+9,'@y-9," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-9,'@y+9," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	sleep 200;
	monster '@mdmap$,'@x+13,'@y-13," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-13,'@y+13," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x+13,'@y-13," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	monster '@mdmap$,'@x-13,'@y+13," ",2960,1,getmdnpcname("callmon#eom3")+"::OnKilled2";
	sleep 4400;
	mobuseskillpos 'mob1,83,5,'@x,'@y+6,0,0;	// ���e�I�X�g�[��
	sleep 1000;
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom3")+"::OnKilled2";
	sleep 1000;
	mobuseskillpos 'mob1,83,5,'@x,'@y-6,0,0;	// ���e�I�X�g�[��
	sleep 2000;
	mobuseskillpos 'mob1,83,5,'@x,'@y+8,0,0;	// ���e�I�X�g�[��
	sleep 2000;
	mobuseskillpos 'mob1,83,5,'@x,'@y+8,0,0;	// ���e�I�X�g�[��
	end;
OnFlameWolf:
	stopnpctimer;
	stopnpctimer getmdnpcname("���X�y���X�R�[��#npc");
	announce "���L : ���X�y���X�R�[�����|��A�o�����J�����悤���B", 0x9, 0x00ff00;
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom3")+"::OnKilled1";
	hideonnpc getmdnpcname("�����n��#lavapond01");
	hideonnpc getmdnpcname("�ł܂����n��#01");
	hideonnpc getmdnpcname("�����n��#lavapond02");
	hideonnpc getmdnpcname("�ł܂����n��#02");
	stopnpctimer getmdnpcname("�����n��#lavapond01");
	stopnpctimer getmdnpcname("�ł܂����n��#01");
	stopnpctimer getmdnpcname("�����n��#lavapond02");
	stopnpctimer getmdnpcname("�ł܂����n��#02");
	hideoffnpc getmdnpcname("���L#flameend");
	hideoffnpc getmdnpcname("#eom_fire_to_center");
	hideonnpc getmdnpcname("#eom_gate_to_ice");
	hideoffnpc getmdnpcname("�����N#mockid03");
	end;
OnKilled1:
OnKilled2:
	end;
}

1@eom.gat,154,119,0	script	�����n��#lavapond01	844,{
	if(countitem(22566) == 0) {
		mes "�]�n�₪����o���Ă���B";
		mes "�@���ʂ̕X�Ŏ~�߂�͓̂�������]";
		close;
	}
	mes "�]�i�v���ŗ���o���n���";
	mes "�@�~�߂邱�Ƃ��ł��܂��]";
	next;
	if(select("�����g�p����","�g�p���Ȃ�") == 2) {
		mes "�]�i�v�����g���̂���߂��]";
		close;
	}
	delitem 22566,1;
	stopnpctimer;
	donpcevent getmdnpcname("�ł܂����n��#01")+ "::OnStart";
	close;
OnStart:
OnTimer1000:
	initnpctimer;
	misceffect 97;
	end;
}

1@eom.gat,154,119,0	script	�ł܂����n��#01	844,{
	end;
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("�����n��#lavapond01");
	hideoffnpc getmdnpcname("�ł܂����n��#01");
	hideonnpc getmdnpcname("#lavazone11");
	hideonnpc getmdnpcname("#lavazone12");
	hideonnpc getmdnpcname("���L#flamewolf");
	end;
OnTimer180000:
	stopnpctimer;
	announce "���L : ���̌��ʂ��؂ꂽ���c�c�B�܂��n�₪����n�߂����I", 0x9, 0x00ff00, 0x190, 12, 0, 0;
	hideonnpc getmdnpcname("�ł܂����n��#01");
	hideoffnpc getmdnpcname("�����n��#lavapond01");
	hideoffnpc getmdnpcname("#lavazone11");
	hideoffnpc getmdnpcname("#lavazone12");
	end;
}

1@eom.gat,161,122,0	script	#lavazone11	139,5,5,{
OnTouch:
	end;
OnTouchNPC:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@cnt,getareamobs('@mdmap$,161-5,122-5,161+5,122+5,3092);
	if('@cnt > 0) {
		announce "���L : ���X�y���X�R�[�����n��𗘗p���ĉ񕜂����悤�Ƃ��Ă��邼�I", 0x9, 0x00ff00;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,122-5,161+5,122+5,3092,28,10,0,0,0,0;
	}
	end;
}

1@eom.gat,161,102,0	script	#lavazone12	139,5,5,{
OnTouch:
	end;
OnTouchNPC:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@cnt,getareamobs('@mdmap$,161-5,102-5,161+5,102+5,3092);
	if('@cnt > 0) {
		announce "���L : ���X�y���X�R�[�����n��𗘗p���ĉ񕜂����悤�Ƃ��Ă��邼�I", 0x9, 0x00ff00;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,161-5,102-5,161+5,102+5,3092,28,10,0,0,0,0;
	}
	end;
}

1@eom.gat,182,129,0	script	�����n��#lavapond02	844,{
	if(countitem(22566) == 0) {
		mes "�]�n�₪����o���Ă���B";
		mes "�@���ʂ̕X�Ŏ~�߂�͓̂�������]";
		close;
	}
	mes "�]�i�v���ŗ���o���n���";
	mes "�@�~�߂邱�Ƃ��ł��܂��]";
	next;
	if(select("�����g�p����","�g�p���Ȃ�") == 2) {
		mes "�]�i�v�����g���̂���߂��]";
		close;
	}
	delitem 22566,1;
	stopnpctimer;
	donpcevent getmdnpcname("�ł܂����n��#02")+ "::OnStart";
	close;
OnStart:
OnTimer1000:
	initnpctimer;
	misceffect 97;
	end;
}

1@eom.gat,182,129,0	script	�ł܂����n��#02	844,{
	end;
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("�����n��#lavapond02");
	hideoffnpc getmdnpcname("�ł܂����n��#02");
	hideonnpc getmdnpcname("#lavazone21");
	hideonnpc getmdnpcname("#lavazone22");
	hideonnpc getmdnpcname("���L#flamewolf");
	end;
OnTimer180000:
	stopnpctimer;
	announce "���L : ���̌��ʂ��؂ꂽ���c�c�B�܂��n�₪����n�߂����I", 0x9, 0x00ff00, 0x190, 12, 0, 0;
	hideonnpc getmdnpcname("�ł܂����n��#02");
	hideoffnpc getmdnpcname("�����n��#lavapond02");
	hideoffnpc getmdnpcname("#lavazone21");
	hideoffnpc getmdnpcname("#lavazone22");
	end;
}

1@eom.gat,163,150,0	script	#lavazone21	139,5,5,{
OnTouch:
	end;
OnTouchNPC:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@cnt,getareamobs('@mdmap$,163-5,150-5,163+5,150+5,3092);
	if('@cnt > 0) {
		//announce "���L : ���X�y���X�R�[�����n��𗘗p���ĉ񕜂����悤�Ƃ��Ă��邼�I", 0x9, 0x00ff00;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
		sleep 200;
		areamobuseskill '@mdmap$,163-5,150-5,163+5,150+5,3092,28,10,0,0,0,0;
	}
	end;
}

1@eom.gat,163,150,0	script	#lavazone22	139,5,5,{}

1@eom.gat,151,155,3	script	���L#flameend	512,{
	mes "[���L]";
	mes "�c�c�����Ă����ȁB";
	mes "������������܂�";
	mes "���͂ȃ����X�^�[��";
	mes "���ݏo�����Ƃ��o����Ƃ͂ȁB";
	next;
	mes "[���L]";
	mes "�������ςȐ킢�������ȁB";
	mes "�������ꂩ�炪�{���̓������B";
	mes "���̑O�ɏ�������Ă��B";
	misceffect 313,"";
	percentheal 100,100;
	close;
}

1@eom.gat,147,156,0	warp	#eom_fire_to_center	2,2,1@eom.gat,98,115

//============================================================
// Floor 4
//------------------------------------------------------------
1@eom.gat,101,178,0	script	#eom_bgm_change1	139,2,2,{
	musiceffect "997";
	end;
}

1@eom.gat,101,194,0	script	#eom_bgm_change2	139,20,20,{
	musiceffect "158";
	end;
}

1@eom.gat,101,194,0	script	#eom_bgm_change3	139,20,20,{
	musiceffect "997";
	end;
}

1@eom.gat,101,194,0	script	#eom_bgm_change4	139,20,20,{
	musiceffect "103";
	end;
}

1@eom.gat,98,182,0	script	#eom_fire_left1	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,105,182,0	script	#eom_fire_right1	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,98,188,0	script	#eom_fire_left2	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,105,188,0	script	#eom_fire_right2	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,98,194,0	script	#eom_fire_left3	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,105,194,0	script	#eom_fire_right3	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,98,200,0	script	#eom_fire_left4	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,105,200,0	script	#eom_fire_right4	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,98,206,0	script	#eom_fire_left5	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,105,206,0	script	#eom_fire_right5	139,10,0,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	misceffect 47;
	end;
}

1@eom.gat,104,204,1	script	���L#op	512,{
	// ������
}

1@eom.gat,99,204,7	script	�j�[�Y�w�b�O#op	510,{
	// ������
}

1@eom.gat,102,209,0	script	#event_eom_talk	139,3,3,{
OnTouch:
	if('flag)
		end;
	set 'flag,1;
	initnpctimer;
OnTimer2000:
	misceffect 47,getmdnpcname("#eom_fire_left1");
	misceffect 47,getmdnpcname("#eom_fire_left2");
	misceffect 47,getmdnpcname("#eom_fire_left3");
	misceffect 47,getmdnpcname("#eom_fire_left4");
	misceffect 47,getmdnpcname("#eom_fire_left5");
	misceffect 47,getmdnpcname("#eom_fire_right1");
	misceffect 47,getmdnpcname("#eom_fire_right2");
	misceffect 47,getmdnpcname("#eom_fire_right3");
	misceffect 47,getmdnpcname("#eom_fire_right4");
	misceffect 47,getmdnpcname("#eom_fire_right5");
	initnpctimer;
	end;
OnStart:
	announce "�����N : �悭�����ˁB�l�Ԕ@���������܂ŗ����Ȃ�ċ�������B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	hideonnpc getmdnpcname("#eom_bgm_change1");
	hideoffnpc getmdnpcname("#eom_bgm_change2");
	sleep 3000;
	announce "�����N : �ӂӂ��A�l�̖ړI���C�ɂȂ�̂����H�@����͂ˁA���E�̑n�����B", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : ���ă��~���������悤�ɖl�����E����肩����񂾂�I", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : ���ׂ̗̈͂͂��ׂđ������B�l�͍����炱�̐��E��łڂ��A�V���Ȑ��E��n�����Đ_�Ƃ��ČN�Ղ���̂��I", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	misceffect 90,getmdnpcname("�����N#eom_master");
	sleep 2000;
	announce "�����N : ���͂͂́I�@���ʂ��斳�ʁB�N�͖l�ɐG��鎖����o���Ȃ��B", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : ���̏�ǂ������邾�낤�H�@���ꂪ�������A�N�����͖l�ɐG����Ȃ��B", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �c�O�������ˁB�����Ő��E�̏I���ƍĒa�����͂��邪�����I", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �܂��͎�n�߂Ƀt���C�����@���[�ɋ���S�~����|�������悤���B", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �N�͂����Œ��Ԃ̎��ɂ䂭�l���w�����킦�Č��Ă���Ɨǂ��I", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �l���I�@�l�������V���E�̐_�I�@���_�����N���I", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 2000;
	misceffect 59,getmdnpcname("�����N#eom_master");
	stopnpctimer getmdnpcname("�����N#eom_master");
	stopnpctimer getmdnpcname("#event_eom_talk");
	sleep 3000;
	misceffect 90,getmdnpcname("�����N#eom_master");
	sleep 5000;
	misceffect 135,getmdnpcname("�����N#eom_master");
	sleep 1000;
	announce "�����N : ����́c�c��ǂ���ꂽ�H", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �����A�l�Ƃ������Ƃ��A�N�����̎������O���Ă�����B", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	hideoffnpc getmdnpcname("���L#op");
	hideoffnpc getmdnpcname("�j�[�Y�w�b�O#op");
	unittalk getnpcid(0,getmdnpcname("���L#op")),"���L : �S�Ă��v���ʂ�ɂȂ�Ǝv���Ȃ�A�����N�I";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#op")),"�j�[�Y�w�b�O : ��ǂ͔j�󂵂܂����B���Ƃ͂��Ȃ���|�������ł��I";
	sleep 3000;
	announce "�����N : �l��|���H�@�_�ł��邱�̖l���H", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : ���q�ɏ��ȁI", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	misceffect 30,getmdnpcname("���L#op");
	misceffect 30,getmdnpcname("�j�[�Y�w�b�O#op");
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���L#op")),"���L : �����c�c�B";
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#op")),"�j�[�Y�w�b�O : �����c�c�B";
	sleep 3000;
	announce "�����N : ���₨��A�������ꌂ�Ŗ��g�n�w����Ȃ����B����Ŗl��|����̂����H", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���L#op")),"���L : �ӂ��c�c�������B";
	sleep 3000;
	announce "�����N : �c�c�������������񂾂��H", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���L#op")),"���L : ���S���Ă���ƁA�܂������邼�A�����N�B";
	sleep 3000;
	announce "�����N : �c�c�ʔ�����k���ˁA���̎��ɑ��Ȃ��I", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �N���킦�Ȃ����A�N���l�ɓG���ƌ����񂾂��H", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���L#op")),"���L : �m���ɉ������ɂ͂����키�͎͂c���Ă��Ȃ��B";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("���L#op")),"���L : �����A���O��|���z�͂����ɂ���I";
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#op")),"�j�[�Y�w�b�O : ���̐��E�̖������c�c���Ȃ��ɑ����܂��I";
	sleep 1000;
	hideonnpc getmdnpcname("���L#op");
	hideonnpc getmdnpcname("�j�[�Y�w�b�O#op");
	sleep 2000;
	announce "�����N : ���āA�N���ǂ�قǂ̗͂������Ă���̂������ĖႤ��B", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �N�����l�ԂƂ̐킢���A����ŕ����B", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 3000;
	announce "�����N : �����A�_�ɋw�Ȃ��Ǝ�Ȃ�҂�I�@���E�Ēa�̍ŏ����тƂȂ邪�����I", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 2000;
	hideonnpc getmdnpcname("�����N#eom_master");
	donpcevent getmdnpcname("callmon#eom4")+ "::OnStart";
	end;
}

1@eom.gat,102,209,3	script	�����N#eom_master	10038,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		cutin "morocc_kid.bmp", 2;
		mes "[�����N]";
		mes "�����܂ŗ�������ɂ�";
		mes "�l�����ڑ�������Ă������B";
		mes "�N�����͐_�̎�ɂ����";
		mes "�łڂ����񂾁A���h���낤�H";
		next;
		mes "[�����N]";
		mes "�o�傪�o�����烊�[�_�[��ʂ���";
		mes "�l�ɋ����ĂˁB";
		mes "����܂ł͑҂��ĂĂ������B";
		mes "�l�͗D��������ˁB";
		mes "�͂��ȗ]���𖞋i����Ƃ�����B";
		close2;
		cutin "morocc_kid.bmp", 255;
		end;
	}
	if('flag == 0) {
		if(checkquest(201730)) {
			if(select("�}��","��b������") == 1) {
				stopnpctimer getmdnpcname("�����N#eom_master");
				stopnpctimer getmdnpcname("#event_eom_talk");
				hideonnpc getmdnpcname("#eom_bgm_change1");
				hideoffnpc getmdnpcname("#eom_bgm_change2");
				hideonnpc getmdnpcname("�����N#eom_master");
				donpcevent getmdnpcname("callmon#eom4")+ "::OnStart";
				close;
			}
			set 'flag,1;
			donpcevent getmdnpcname("#event_eom_talk")+ "::OnStart";
			close;
		}
		menu "��b������",-;
		set 'flag,1;
		donpcevent getmdnpcname("#event_eom_talk")+ "::OnStart";
		close;
	}
	end;
OnStart:
OnTimer1000:
	initnpctimer;
	misceffect 252;
	end;
}

1@eom.gat,1,1,0	script	callmon#eom4	139,{
OnStart:
	initnpctimer;
	set 'mob_id,callmonster(getmdmapname("1@eom.gat"),102,209,"�Đ��̔����_#mk01",3096,getmdnpcname("callmon#eom4")+"::OnKilled");
	mobuseskill 'mob_id,83,10,0,0,0,0;	// ���e�I�X�g�[��
	mobuseskill 'mob_id,83,10,0,0,0,0;	// ���e�I�X�g�[��
	end;
OnTimer3000:
OnTimer6000:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@mobhp,getmobhp('mob_id);
	if('@mobhp < 1) {
		stopnpctimer;
		end;
	}
	if('@mobhp < 18000000 && 'flag == 2) {
		set '@count,getmapmobs('@mdmap$,getmdnpcname("callmon#eom4")+"::OnKilled4");
		if('@count < 1) {
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
			monster '@mdmap$,'@x-1,'@y,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
			monster '@mdmap$,'@x,'@y-1,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
			monster '@mdmap$,'@x+1,'@y,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
			monster '@mdmap$,'@x,'@y+1,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
		}
	}
	end;
OnTimer10000:
	set '@mdmap$,getmdmapname("1@eom.gat");
	set '@mobhp,getmobhp('mob_id);
	set '@count,getmapmobs('@mdmap$,getmdnpcname("callmon#eom4")+"::OnKilled2") + getmapmobs('@mdmap$,getmdnpcname("callmon#eom4")+"::OnKilled3");
	if('@mobhp < 1) {
		stopnpctimer;
		end;
	}
	if('@count > 0) {
		initnpctimer;
		end;
	}
	else if('@mobhp < 30000000 && 'flag == 0) {
		set 'flag,1;
		//stopnpctimer;
		unittalk 'mob_id,"�Đ��̔����_ : ���̂܂܏I��点�͂��Ȃ���I";
		set '@dummy,removemonster('mob_id);
		set 'mob_id,callmonster(getmdmapname("1@eom.gat"),102,209,"�Đ��̔����_#mk01",3096,getmdnpcname("callmon#eom4")+"::OnKilled");
		setmobhp 'mob_id,'@mobhp;
		set 'mob_id2,callmonster(getmdmapname("1@eom.gat"),114,198,"���Ẫ����N#origin",3098,getmdnpcname("callmon#eom4")+"::OnKilled2");
		set 'mob_id3,callmonster(getmdmapname("1@eom.gat"),86,199,"�����̃����N#rest",3099,getmdnpcname("callmon#eom4")+"::OnKilled3");
		mobuseskill 'mob_id2,675,4,0,0,0,0;	// �X�g�[���X�L��
		mobuseskill 'mob_id3,676,4,0,0,0,0;	// �A���`�}�W�b�N
		donpcevent getmdnpcname("callmon#eom4_timer")+"::OnStart";
		end;
	}
	else if('@mobhp < 18000000 && 'flag == 2) {
		switch(rand(3)) {
		case 0: donpcevent getmdnpcname("callmon#eom4")+"::OnMoroccKidMS";	break;
		case 1: donpcevent getmdnpcname("callmon#eom4")+"::OnMoroccKidTS";	break;
		case 2: donpcevent getmdnpcname("callmon#eom4")+"::OnMoroccKidLoV";	break;
		}
		set '@count,getmapmobs('@mdmap$,getmdnpcname("callmon#eom4")+"::OnKilled4");
		if('@count < 1) {
			set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
			monster getmdmapname("1@eom.gat"),'@x-1,'@y,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
			monster getmdmapname("1@eom.gat"),'@x,'@y-1,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
			monster getmdmapname("1@eom.gat"),'@x+1,'@y,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
			monster getmdmapname("1@eom.gat"),'@x,'@y+1,"���C�̃J�[�T",3089,1,getmdnpcname("callmon#eom4")+"::OnKilled4";
		}
	}
	else {
		switch(rand(3)) {
		case 0: donpcevent getmdnpcname("callmon#eom4")+"::OnMoroccKidMS";	break;
		case 1: donpcevent getmdnpcname("callmon#eom4")+"::OnMoroccKidTS";	break;
		case 2: donpcevent getmdnpcname("callmon#eom4")+"::OnMoroccKidLoV";	break;
		}
	}
	end;
OnMoroccKidMS:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"�Đ��̔����_ : �Ǝ�ȍ������ׂ̈Ƀt�B�i�[�����I";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskill 'mob_id,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	sleep 2000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,83,5,'@x+rand(11)-5,'@y+rand(11)-5,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,5,'@x+rand(11)-5,'@y+rand(11)-5,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,5,'@x+rand(11)-5,'@y+rand(11)-5,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,5,'@x+rand(11)-5,'@y+rand(11)-5,0,0;	// ���e�I�X�g�[��
	sleep 4000;
	unittalk 'mob_id,"�Đ��̔����_ : �ӂӂӁc�c�I�@�����Ɗy��������I";
	sleep 2000;
	mobuseskill 'mob_id,85,10,0,0,0,1;	// ���[�h�I�u���@�[�~���I��
	sleep 2000;
	initnpctimer;
	end;
OnMoroccKidTS:
	if(getmobhp('mob_id) < 1) end;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	unittalk 'mob_id,"�Đ��̔����_ : �Ǝ�ȍ������ׂ̈Ƀ��N�C�G�����I";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-2,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+2,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+2,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-2,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-6,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+6,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y-4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y-4,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-10,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+10,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+10,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-10,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-8,'@y+8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-8,'@y-8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+8,'@y+8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+8,'@y-8,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-16,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+16,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+16,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-16,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+12,'@y+12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-12,'@y-12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-12,'@y+12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+12,'@y-12,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	initnpctimer;
	end;
OnMoroccKidLoV:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"�Đ��̔����_ : �ӂӂ�!!�@�ς�������̂Ȃ�ς��Ă݂�񂾂�!!";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskill 'mob_id,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	sleep 2000;
	mobuseskill 'mob_id,85,10,0,0,0,1;	// ���[�h�I�u���@�[�~���I��
	sleep 2000;
	mobuseskill 'mob_id,252,1,0,0,0,0;	// ���t���N�g�V�[���h
	initnpctimer;
	end;
OnHeal1:
	mobuseskill 'mob_id,28,10,0,0,0,0;	// �q�[��
	end;
OnHeal2:
	mobuseskill 'mob_id,675,5,0,0,0,0;	// �X�g�[���X�L��
	mobuseskill 'mob_id,671,5,0,0,0,0;	// �}�W�b�N�~���[
	end;
OnReStart:
	set 'flag,2;
	set '@mobhp,getmobhp('mob_id);
	set '@dummy,removemonster('mob_id);
	set 'mob_id,callmonster(getmdmapname("1@eom.gat"),102,209,"�Đ��̔����_#mk01",3096,getmdnpcname("callmon#eom4")+"::OnKilled");
	setmobhp 'mob_id,'@mobhp;
	unittalk 'mob_id,"�Đ��̔����_ : �ӂӂӁc�c�I�@�܂�������߂Ȃ��́H";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskill 'mob_id,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	sleep 1000;
	mobuseskill 'mob_id,17,10,0,0,0,1;	// �t�@�C�A�[�{�[��
	initnpctimer;
	end;
OnKilled:
	stopnpctimer;
	donpcevent getmdnpcname("#morocc_god")+ "::OnStart";
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom4")+"::OnKilled4";
	end;
OnKilled2:
	unittalk 'mob_id3,"�����̃����N : ���ׂĂ̐��҂Ɉ�����^���Ă��!!�@���ꂪ������̎��߂�!!";
	//5�b�Ԋu
	//mobuseskill 'mob_id3,83,9,800,0,0,0;	// ���e�I�X�g�[��
	end;
OnKilled3:
	unittalk 'mob_id2,"���Ẫ����N : �K�A�A�A�A�A�A�@�@�b!!";
	end;
OnKilled4:
	end;
}

1@eom.gat,1,1,0	script	callmon#eom4_timer	139,{
OnStart:
	initnpctimer;
	set 'cnt,0;
	donpcevent getmdnpcname("callmon#eom4")+"::OnHeal2";
	end;
OnTimer200:
	initnpctimer;
	set '@mdmap$,getmdmapname("1@eom.gat");
	set 'cnt,'cnt+1;
	if('cnt > 10) {
		set 'cnt,0;
		set '@count,getmapmobs('@mdmap$,getmdnpcname("callmon#eom4")+"::OnKilled2") + getmapmobs('@mdmap$,getmdnpcname("callmon#eom4")+"::OnKilled3");
		if('@count <= 0) {
			stopnpctimer;
			donpcevent getmdnpcname("callmon#eom4")+"::OnReStart";
			end;
		}
		donpcevent getmdnpcname("callmon#eom4")+"::OnHeal2";
	}
	donpcevent getmdnpcname("callmon#eom4")+"::OnHeal1";
	end;
}

1@eom.gat,101,194,3	script	#morocc_god	3097,{
OnStart:
	hideonnpc getmdnpcname("#eom_bgm_change2");
	hideoffnpc getmdnpcname("#eom_bgm_change3");
	sleep 4000;
	announce "�����N : �ʔ����Ȃ��Ă�������Ȃ����B�N�N�N�N�N�c�c�B", 0x9, 0xff0000, 0x0190, 16, 0, 0;
	sleep 4000;
	announce "�����N : ���������A�܂�������ŏI��肾�Ǝv���Ă͂��Ȃ���ȁH", 0x9, 0xff0000, 0x0190, 16, 0, 0;
	sleep 4000;
	misceffect 897,getmdnpcname("#morocc_god");
	announce "�����N : �_�ƂȂ������̎p������I", 0x9, 0xff0000, 0x0190, 16, 0, 0;
	sleep 3000;
	misceffect 897,getmdnpcname("#morocc_god");
	sleep 2000;
	hideonnpc getmdnpcname("#eom_bgm_change3");
	hideoffnpc getmdnpcname("#eom_bgm_change4");
	sleep 1000;
	misceffect 432,getmdnpcname("#morocc_god");
	sleep 2000;
	misceffect 432,getmdnpcname("#morocc_god");
	misceffect 488,getmdnpcname("#morocc_god");
	sleep 1000;
	announce "�����N : �N�N�N�c�c�_�̗͂ɋ���ɂ�������!!", 0x9, 0xff0000, 0x0190, 16, 0, 0;
	misceffect 796,getmdnpcname("#morocc_god");
	sleep 2000;
	misceffect 30,getmdnpcname("#morocc_god");
	misceffect 587,getmdnpcname("#morocc_god");
	donpcevent getmdnpcname("callmon#eom5")+"::OnStart";
	hideonnpc getmdnpcname("#eom_bgm_change4");
	end;
}

1@eom.gat,1,1,0	script	callmon#eom5	139,{
OnStart:
	set 'mob_id,callmonster(getmdmapname("1@eom.gat"),101,194,"��]�̐_�����N#ma01",3097,getmdnpcname("callmon#eom5")+"::OnKilled");
	mobuseskill 'mob_id,653,1,0,0,0,0;	// �A�[�X�N�G�C�N
	sleep 1000;
	unittalk 'mob_id,"��]�̐_�����N : �����A�ߒɂ̋��т𕷂����Ă���I";
	initnpctimer;
	end;
OnTimer10000:
	set '@mobhp,getmobhp('mob_id);
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom5")+"::OnKilled2";
	if('flag == 0) {
		if('@mobhp < 45000000) {
			set 'flag,1;
			donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtChange";
			end;
		}
		switch(rand(5)) {
		case 0: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtTS";	break;
		case 1: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtLoV";	break;
		case 2: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtFP";	break;
		case 3:	donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtMS";	break;
		case 4:	donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtFC";	break;
		}
		end;
	}
	else if('flag == 1) {
		if('@mobhp < 30000000) {
			set 'flag,2;
			donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtChange";
			end;
		}
		switch(rand(4)) {
		case 0: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtTS2";	break;
		case 1: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtEstr";	break;
		case 2: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtJF";	break;
		case 3: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtFW";	break;
		}
		end;
	}
	else if('flag == 2) {
		switch(rand(4)) {
		case 0: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtPSHJ";	break;
		case 1: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtComet";	break;
		case 2: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtAllMagic";	break;
		case 3: donpcevent getmdnpcname("callmon#eom5")+"::OnMoroccAdtCall";	break;
		}
		end;
	}
	initnpctimer;
	end;
OnMoroccAdtTS:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : ��҂̍���A���ɑł��ꋀ���邪�����I";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,21,10,'@x-2,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+2,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+2,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-2,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-6,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+6,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y-4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y-4,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-10,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+10,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+10,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-10,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-8,'@y+8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-8,'@y-8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+8,'@y+8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+8,'@y-8,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	mobuseskillpos 'mob_id,21,10,'@x-16,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+16,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+16,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-16,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-12,'@y+12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-12,'@y-12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+12,'@y+12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+12,'@y-12,0,0;	// �T���_�[�X�g�[��
	sleep 1000;
	initnpctimer;
	end;
OnMoroccAdtLoV:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : ���|�I�Ȏ��̗����������Ă�낤!!";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 2000;
	mobuseskill 'mob_id,664,5,0,0,0,0;	// ���C�h�t���[�Y
	sleep 2000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,85,5,'@x-7,'@y,0,0;	// ���[�h�I�u���@�[�~���I��
	sleep 500;
	mobuseskillpos 'mob_id,85,5,'@x+7,'@y,0,0;	// ���[�h�I�u���@�[�~���I��
	sleep 500;
	mobuseskillpos 'mob_id,85,5,'@x,'@y+7,0,0;	// ���[�h�I�u���@�[�~���I��
	sleep 500;
	mobuseskillpos 'mob_id,85,5,'@x,'@y-7,0,0;	// ���[�h�I�u���@�[�~���I��
	sleep 2500;
	unittalk 'mob_id,"��]�̐_�����N : �c�c�N�N�N�c�c���������􂩂��ɂ݂ɑς���邩�H";
	sleep 2000;
	mobuseskill 'mob_id,85,10,0,0,0,1;	// ���[�h�I�u���@�[�~���I��
	sleep 2000;
	initnpctimer;
	end;
OnMoroccAdtFP:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : �N�N�N�c�c�S�Ă�ł��Ă�낤�I";
	sleep 2000;
	mobuseskill 'mob_id,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	sleep 2000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,80,10,'@x-1,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+1,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y+1,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y-1,0,0;	// �t�@�C�A�[�s���[
	sleep 500;
	mobuseskillpos 'mob_id,80,10,'@x-5,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+5,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y+5,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y-5,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x-3,'@y+3,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x-3,'@y-3,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+3,'@y+3,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+3,'@y-3,0,0;	// �t�@�C�A�[�s���[
	sleep 500;
	mobuseskillpos 'mob_id,80,10,'@x-9,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+9,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y+9,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y-9,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x-7,'@y+7,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x-7,'@y-7,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+7,'@y+7,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+7,'@y-7,0,0;	// �t�@�C�A�[�s���[
	sleep 500;
	mobuseskillpos 'mob_id,80,10,'@x-15,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+15,'@y,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y+15,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x,'@y-15,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x-11,'@y+11,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x-11,'@y-11,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+11,'@y+11,0,0;	// �t�@�C�A�[�s���[
	mobuseskillpos 'mob_id,80,10,'@x+11,'@y-11,0,0;	// �t�@�C�A�[�s���[
	sleep 2000;
	initnpctimer;
	end;
OnMoroccAdtMS:
	//TODO:timer, MS Lv
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : �Ɖ΂ɏĂ�����ɂ𖡂킦!!";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskill 'mob_id,724,3,0,0,0,0;	// �t�@�C�A�X�g�[��
	sleep 1000;
	mobuseskill 'mob_id,83,9,0,0,0,0;	// ���e�I�X�g�[��
	initnpctimer;
	end;
OnMoroccAdtFC:
	//TODO:FC Lv
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : ���̖��A�Ⴂ�󂯂邼!!";
	sleep 2000;
	mobuseskill 'mob_id,711,1,0,0,0,0;	// �t���C���N���X
	sleep 1000;
	mobuseskill 'mob_id,81,10,0,0,0,0;	// �T�C�g���b�V���[
	sleep 1000;
	initnpctimer;
	end;
OnMoroccAdtChange:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : �t�t�t�c�c���������̂͂ǂ����H";
	sleep 1000;
	mobuseskill 'mob_id,85,10,0,0,0,0;	// ���[�h�I�u���@�[�~���I��
	sleep 1000;
	mobuseskill 'mob_id,289,5,0,0,0,1;	// �f�B�X�y��
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	monster getmdmapname("1@eom.gat"),'@x+1,'@y," ",20131,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
	monster getmdmapname("1@eom.gat"),'@x-1,'@y," ",20132,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
	monster getmdmapname("1@eom.gat"),'@x,'@y-1," ",20129,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
	monster getmdmapname("1@eom.gat"),'@x,'@y+1," ",20130,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
	sleep 10000;
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom5")+"::OnKilled2";
	initnpctimer;
	end;
OnMoroccAdtEstr:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : ���łȂ�c���M�Ɋт���A�X�Ԃ��N���������B";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskill 'mob_id,2216,5,0,0,0,1;	// �A�[�X�X�g���C��
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,91,5,'@x-2,'@y,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x+2,'@y,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x,'@y+2,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x,'@y-2,0,0;	// �w�����Y�h���C�u
	sleep 500;
	mobuseskillpos 'mob_id,91,5,'@x-6,'@y,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x+6,'@y,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x,'@y+6,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x,'@y-6,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x-4,'@y+4,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x-4,'@y-4,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x+4,'@y+4,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x+4,'@y-4,0,0;	// �w�����Y�h���C�u
	sleep 500;
	mobuseskillpos 'mob_id,91,5,'@x-10,'@y,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x+10,'@y,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x,'@y+10,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x,'@y-10,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x-8,'@y+8,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x-8,'@y-8,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x+8,'@y+8,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,91,5,'@x+8,'@y-8,0,0;	// �w�����Y�h���C�u
	initnpctimer;
	end;
OnMoroccAdtJF:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : ���Â�葱���₽�����ɕ�����A�������悢!!";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskill 'mob_id,720,5,0,0,0,0;	// M�W���b�N�t���X�g
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,89,10,'@x-2,'@y,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x+2,'@y,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x,'@y+2,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x,'@y-2,0,0;	// �X�g�[���K�X�g
	sleep 1000;
	mobuseskillpos 'mob_id,89,10,'@x-10,'@y,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x+10,'@y,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x,'@y+10,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x,'@y-10,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x-8,'@y+8,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x-8,'@y-8,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x+8,'@y+8,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,89,10,'@x+8,'@y-8,0,0;	// �X�g�[���K�X�g
	initnpctimer;
	end;
OnMoroccAdtFW:
	unittalk 'mob_id,"��]�̐_�����N : �ɂ݂�������Ԃ��Ȃ��A�R�₵�����Ă�낤!!";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,18,10,'@x-2,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+2,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y+2,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y-2,0,0;	// �t�@�C�A�[�E�H�[��
	sleep 500;
	mobuseskillpos 'mob_id,18,10,'@x-6,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+6,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y+6,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y-6,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x-4,'@y+4,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x-4,'@y-4,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+4,'@y+4,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+4,'@y-4,0,0;	// �t�@�C�A�[�E�H�[��
	sleep 500;
	mobuseskillpos 'mob_id,18,10,'@x-10,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+10,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y+10,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y-10,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x-8,'@y+8,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x-8,'@y-8,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+8,'@y+8,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+8,'@y-8,0,0;	// �t�@�C�A�[�E�H�[��
	sleep 500;
	mobuseskillpos 'mob_id,18,10,'@x-16,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+16,'@y,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y+16,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x,'@y-16,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x-12,'@y+12,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x-12,'@y-12,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+12,'@y+12,0,0;	// �t�@�C�A�[�E�H�[��
	mobuseskillpos 'mob_id,18,10,'@x+12,'@y-12,0,0;	// �t�@�C�A�[�E�H�[��
	sleep 500;
	mobuseskillpos 'mob_id,83,10,'@x-12,'@y+12,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,10,'@x-12,'@y-12,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,10,'@x+12,'@y+12,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,10,'@x+12,'@y-12,0,0;	// ���e�I�X�g�[��
	sleep 1000;
	initnpctimer;
	end;
OnMoroccAdtTS2:
	unittalk 'mob_id,"��]�̐_�����N : �ق��̗��ɂ��̐g���ł����������c�c�I";
	sleep 2000;
	mobuseskill 'mob_id,721,1,0,0,0,0;	// ���C�h�E�F�u
	sleep 1000;
	mobuseskill 'mob_id,84,28,0,0,0,1;	// ���s�e���T���_�[
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	mobuseskillpos 'mob_id,21,10,'@x-2,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+2,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+2,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-2,0,0;	// �T���_�[�X�g�[��
	sleep 500;
	mobuseskillpos 'mob_id,21,10,'@x-6,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+6,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-6,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-4,'@y-4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y+4,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+4,'@y-4,0,0;	// �T���_�[�X�g�[��
	sleep 500;
	mobuseskillpos 'mob_id,21,10,'@x-10,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+10,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+10,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-10,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-8,'@y+8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-8,'@y-8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+8,'@y+8,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+8,'@y-8,0,0;	// �T���_�[�X�g�[��
	sleep 500;
	mobuseskillpos 'mob_id,21,10,'@x-16,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+16,'@y,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y+16,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x,'@y-16,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-12,'@y+12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x-12,'@y-12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+12,'@y+12,0,0;	// �T���_�[�X�g�[��
	mobuseskillpos 'mob_id,21,10,'@x+12,'@y-12,0,0;	// �T���_�[�X�g�[��
	sleep 500;
	initnpctimer;
	end;
OnMoroccAdtPSHJ:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : �����炪�c�c�������ꂵ�ނ�����!!";
	sleep 1000;
	mobuseskill 'mob_id,289,5,0,0,0,1;	// �f�B�X�y��
	sleep 2000;
	unittalk 'mob_id,"��]�̐_�����N : �ł̒�ɒ��߂�����!!";
	sleep 1000;
	mobuseskill 'mob_id,661,3,0,0,0,0;	// �p���X�X�g���C�N
	sleep 1000;
	mobuseskill 'mob_id,662,5,0,0,0,0;	// �w���W���b�W�����g
	sleep 1000;
	initnpctimer;
	end;
OnMoroccAdtComet:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : �N�b�c�c!!�@�l�Ԃ��Ƃ����������b!!";
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	sleep 2000;
	mobuseskillpos 'mob_id,483,5,'@x-6,'@y,0,0;	// �K���o���e�C��
	mobuseskillpos 'mob_id,483,5,'@x+6,'@y,0,0;	// �K���o���e�C��
	mobuseskillpos 'mob_id,483,5,'@x,'@y+6,0,0;	// �K���o���e�C��
	mobuseskillpos 'mob_id,483,5,'@x,'@y-6,0,0;	// �K���o���e�C��
	sleep 1000;
	unittalk 'mob_id,"��]�̐_�����N : �n���𖡂킦�I�@����Ńt�B�i�[�����I";
	sleep 2000;
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	mobuseskill 'mob_id,708,5,0,0,0,0;	// M�R���b�g
	initnpctimer;
	end;
OnMoroccAdtAllMagic:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : �M�l��c�c�����C�ɂȂ�Ȃ�!!";
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	sleep 2000;
	mobuseskillpos 'mob_id,483,5,'@x-3,'@y,0,0;	// �K���o���e�C��
	mobuseskillpos 'mob_id,483,5,'@x+3,'@y,0,0;	// �K���o���e�C��
	mobuseskillpos 'mob_id,483,5,'@x,'@y-3,0,0;	// �K���o���e�C��
	mobuseskillpos 'mob_id,483,5,'@x,'@y+3,0,0;	// �K���o���e�C��
	sleep 1000;
	mobuseskillpos 'mob_id,85,10,'@x+2,'@y,0,0;	// ���[�h�I�u���@�[�~���I��
	mobuseskillpos 'mob_id,89,10,'@x,'@y+2,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,91,5,'@x,'@y-2,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,83,10,'@x-2,'@y,0,0;	// ���e�I�X�g�[��
	sleep 500;
	mobuseskillpos 'mob_id,85,10,'@x+10,'@y,0,0;	// ���[�h�I�u���@�[�~���I��
	mobuseskillpos 'mob_id,89,10,'@x,'@y+10,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,91,5,'@x,'@y-10,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,83,10,'@x-10,'@y,0,0;	// ���e�I�X�g�[��
	sleep 500;
	mobuseskillpos 'mob_id,85,10,'@x-8,'@y-8,0,0;	// ���[�h�I�u���@�[�~���I��
	mobuseskillpos 'mob_id,89,10,'@x+8,'@y+8,0,0;	// �X�g�[���K�X�g
	mobuseskillpos 'mob_id,91,5,'@x+8,'@y-8,0,0;	// �w�����Y�h���C�u
	mobuseskillpos 'mob_id,83,10,'@x-8,'@y+8,0,0;	// ���e�I�X�g�[��
	sleep 1000;
	unittalk 'mob_id,"��]�̐_�����N : �c�c����ŏI��肾�b!!!!";
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	sleep 1000;
	mobuseskillpos 'mob_id,83,10,'@x,'@y,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,10,'@x,'@y,0,0;	// ���e�I�X�g�[��
	mobuseskillpos 'mob_id,83,10,'@x,'@y,0,0;	// ���e�I�X�g�[��
	initnpctimer;
	end;
OnMoroccAdtCall:
	if(getmobhp('mob_id) < 1) end;
	unittalk 'mob_id,"��]�̐_�����N : ���̐_�ɋt�炤�����҂ǂ���!!";
	sleep 2000;
	mobuseskill 'mob_id,85,10,0,0,0,0;	// ���[�h�I�u���@�[�~���I��
	sleep 1000;
	mobuseskill 'mob_id,289,5,0,0,0,1;	// �f�B�X�y��
	sleep 1000;
	set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob_id);
	switch(rand(3)) {
	case 0:
		monster getmdmapname("1@eom.gat"),'@x+1,'@y," ",20131,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
		monster getmdmapname("1@eom.gat"),'@x-1,'@y," ",20132,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
		break;
	case 1:
		monster getmdmapname("1@eom.gat"),'@x+1,'@y," ",20129,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
		monster getmdmapname("1@eom.gat"),'@x-1,'@y," ",20130,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
		break;
	case 2:
		monster getmdmapname("1@eom.gat"),'@x+1,'@y," ",3096,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
		monster getmdmapname("1@eom.gat"),'@x-1,'@y," ",3096,1,getmdnpcname("callmon#eom5")+"::OnKilled2";
		break;
	}
	sleep 10000;
	killmonster getmdmapname("1@eom.gat"),getmdnpcname("callmon#eom5")+"::OnKilled2";
	initnpctimer;
	end;
OnKilled:
	announce "�����N : �c�c���͐_�����c�c!?�@�������l�ԕ���ɂ��̎����c�c�����c�c�b!!", 0x9, 0xff0000, 0x0190, 14, 0, 0;
	sleep 1000;
	hideoffnpc getmdnpcname("#eom_quest");
	sleep 3000;
	hideonnpc getmdnpcname("#eom_quest");
	hideoffnpc getmdnpcname("��]�̐_�����N#04");
	hideoffnpc getmdnpcname("���L#eomnyd04");
	hideoffnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd04");
	hideonnpc getmdnpcname("#eom_bgm_change3");
	end;
OnKilled2:
	end;
}

1@eom.gat,101,194,0	script	#eom_quest	139,20,20,{
	setquest 116545;
	compquest 116545;
	end;
}

1@eom.gat,102,197,3	script	��]�̐_�����N#04	3097,{
	end;
OnStart:
	sleep 2000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �����c�c�����A�_���s���̂��c�c�I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : ������􂫁A��n��n�����A�����̍��𑀂鎄�̗́c�c�B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : ���̂��I�@���́A���E�n���̗͂��M�l�@���ɔs���I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("���L#eomnyd04")),"���L : �c�c�������ȁA�����N�B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("���L#eomnyd04")),"���L : �_�͖�����n�������B�������n�����ꂵ���͎̂��̗���𐶂���B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("���L#eomnyd04")),"���L : ���̐��E�́A���̐��E�ɏZ�ޑS�Ă̐����̈ӎu��s���ɂ���Ďx�����Ă���񂾁B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �n���ȁI�@������n������_�̗͂Ƃ͖������x�z���A�j��ł���͂��I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �����A�l�Ԃ��x�z�ł���͂��I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �l�Ԃ��x�z�H�@�΂킹�Ă���܂��ˁB";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : ���Ȃ��́u�_�v�����Ă��Ȃ��B���ǌ��Ă���̂́u�l�ԁv�B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : ���Ȃ��͐_�̎p�����Ă���̂ł͂Ȃ��B�l�Ԃ̎p�����Ă���̂ł��B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �Y�����c�c�I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �������A������p�`��^���悤�Ɩ��Ӗ��ł��B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �q�g�͑S�ɂ��ČA�ɂ��đS�B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �����Ȃ����A�t���C�����@���[�ɂ���ҒB���I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �~�b�h�K���h�A�A�[�����w�C���A���g�D���w�C���c�c�B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : ���ׂ̈Ⴂ����Ǒ����̃q�g���傫�ȌƂȂ�΁A���Ȃ��̑n�낤�Ƃ��钣��ڂĂ̐��E�Ȃǔ��X�̂悤�ɐƂ��̂ł��I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : ���肦�ʁI�@�Ǝ�ȃq�g�Ȃǐ_�̑O�ł͉H�������R�c�c�B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("���L#eomnyd04")),"���L : �����N�A�M�l�̓q�g�ɐ_�̎p���d�ˁA����Ă����������B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("���L#eomnyd04")),"���L : �M�l�̓q�g�ɓ���A�q�g�ɂȂꂸ�A�����āA�q�g�ɖłڂ����B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �ق�ق�I�@�_�ł��鎄�ɐ������ƁH�@�ӂ�����ȁI";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : ���Ȃ��͋C�t���Ă��Ȃ������ł��I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �q�g�ɓ��ꂽ�I�@���E��A�񂾁I�@���̎v���͂��Ȃ��̐��ݏo�������̂���������܂��I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �n���ȁI�@���́c�c�I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �c�c����Ȃ����B�������Ȃ����B�����ɂ��Ȃ������₷�鐢�E�͂���܂���B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : ���͏����ʁI�@�Ⴆ���̎c�������������E��������悤�Ƃ��ȁI";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �M�l��̋L���Ɏ����������A���͉��x�ł��M�l��̑O�ɗ����͂����낤�I";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("��]�̐_�����N#04")),"�����N : �M�l�炪�����������ƂȂǁA�o���ʂ̂��I";
	sleep 3000;
	misceffect 183,getmdnpcname("��]�̐_�����N#04");
	misceffect 62,getmdnpcname("��]�̐_�����N#04");
	misceffect 266,getmdnpcname("��]�̐_�����N#04");
	sleep 500;
	misceffect 183,getmdnpcname("��]�̐_�����N#04");
	misceffect 62,getmdnpcname("��]�̐_�����N#04");
	misceffect 266,getmdnpcname("��]�̐_�����N#04");
	hideonnpc getmdnpcname("��]�̐_�����N#04");
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �m���Ɏ������̋L�����犮�S�ɏ����Ȃ�����A���������N�͎c�葱����ł��傤�c�c�B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : ���������N�́A�ł񂾂��Ƃɂ���āA��X�̈ӎ��̒��ŉi���̖����ƂȂ�܂����B";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("���L#eomnyd04")),"���L : �c�c�z�ɂ͍ō��̔����������Ȃ��ȁB";
	sleep 5000;
	unittalk getnpcid(0,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),"�j�[�Y�w�b�O : �c�c�����A�A��܂��傤�B�O�ɏo��Ƃ��͎��ɘb�������ĉ������B";
	set getvariableofnpc('flag,getmdnpcname("�j�[�Y�w�b�O#eomnyd04")),2;
	end;
}

1@eom.gat,104,194,1	script	���L#eomnyd04	512,{
	mes "[���L]";
	mes "���������N�̍Ŋ����B";
	mes "������������������܂ł��B";
	cutin "ep14_roki01", 2;
	close2;
	cutin "ep14_roki01", 255;
	end;
}

1@eom.gat,99,194,7	script	�j�[�Y�w�b�O#eomnyd04	510,{
	if(getpartyleader(getcharid(1)) == strcharinfo(0) && 'flag == 0) {
		if(checkquest(201730)) {
			if(select("�}��","��b������") == 1) {
				misceffect 172,getmdnpcname("��]�̐_�����N#04");
				set '@dummy,sleep2(2000);
				misceffect 183,getmdnpcname("��]�̐_�����N#04");
				misceffect 62,getmdnpcname("��]�̐_�����N#04");
				misceffect 266,getmdnpcname("��]�̐_�����N#04");
				set '@dummy,sleep2(500);
				misceffect 183,getmdnpcname("��]�̐_�����N#04");
				misceffect 62,getmdnpcname("��]�̐_�����N#04");
				misceffect 266,getmdnpcname("��]�̐_�����N#04");
				hideonnpc getmdnpcname("��]�̐_�����N#04");
				close;
			}
			set 'flag,1;
			donpcevent getmdnpcname("��]�̐_�����N#04")+"::OnStart";
			close;
		}
		menu "��b������",-;
		set 'flag,1;
		donpcevent getmdnpcname("��]�̐_�����N#04")+"::OnStart";
		close;
	}
	if('flag <= 1) {
		mes "[�j�[�Y�w�b�O]";
		mes "���������N�c�c�B";
		mes "�_�ɂȂ낤�Ƃ��Ă����悤�ł���";
		mes "���̎��A�q�g�ւ̓��ꂪ";
		mes "�������̂ł��傤�B";
		cutin "ep14_nyd03", 2;
		close2;
		cutin "ep14_nyd03", 255;
		end;
	}
	if(checkquest(7597)) {
		mes "[�j�[�Y�w�b�O]";
		mes "�c�c���ꂪ�Ō�ł͂Ȃ��C�����܂��B";
		mes "�����̓����N�̐��_���E�ł��B";
		mes "���炭�A���̏ꏊ�Ŕނ�";
		mes "�I���Ȃ���]���J��Ԃ��͂��ł��B";
		cutin "ep14_nyd03", 2;
		next;
		menu "�O�ɏo��",-;
		mes "[�j�[�Y�w�b�O]";
		mes "��������������ꏊ�܂ł����肵�܂��B";
		cutin "ep14_nyd04", 2;
		close2;
		cutin "ep14_nyd04", 255;
		warp "moro_vol.gat",91,87;
		end;
	}
	if(checkquest(7593)&0x4) {
		mes "[�j�[�Y�w�b�O]";
		mes "�c�c����ł����";
		mes "���������N�̊�݂�";
		mes "�{���̈Ӗ��Ŏ~�߂邱�Ƃ�";
		mes "�o���܂����B";
		mes "���肪�Ƃ��������܂��B";
		cutin "ep14_nyd03", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�����͔ނ̍�肾�������_���E�B";
		mes "�ނ͐g�̂������Ă��Ȃ�";
		mes "���̋�Ԃ��i���ɜf�r���A";
		mes "������������ł��傤�B";
		cutin "ep14_nyd02", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�����Ă܂��A�����ɗ���S�Ă̐l��";
		mes "�����̂悤�ȏo�������J��Ԃ��܂��B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�����̐�]�𖾓����B";
		mes "�����Ă��̖������܂��������c�c�B";
		mes "���x�ƂȂ�������ł��傤�B";
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�������͂����m���Ă��Ă��A";
		mes "���̓��������܂������ł��傤�B";
		mes "���̓x�Ɏ��́A";
		mes "���҂Ƃ��Ă��Ȃ��̑��Ɂc�c�B";
		cutin "ep14_nyd03", 2;
		next;
		cutin "ep14_nyd04", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�b�������Ȃ�܂����B";
		mes "�i�ߊ����҂��Ă��܂���ˁH";
		mes "����̌��̕񍐂����肢���܂��B";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		next;
		mes "�]^ff0000����ȍ~�A���_�a�ɓ��邱�Ƃ�";
		mes "�@�ł��Ȃ��Ȃ�܂��B";
		mes "�@�i�ߊ��A�W�t�ɕ񍐂��Ă���A";
		mes "�@1��ڂ̌ߑO5���ȍ~�ɁA";
		mes "�@�ēx���_�a�ɓ��邱�Ƃ�";
		mes "�@�ł���悤�ɂȂ�܂�^000000�]";
		setquest 7597;
		delquest 7593;
		setquest 116545;
		delquest 116545;
		next;
	}
	menu "�O�ɏo��",-;
	mes "[�j�[�Y�w�b�O]";
	mes "��������������ꏊ�܂ł����肵�܂��B";
	cutin "ep14_nyd04", 2;
	close2;
	cutin "ep14_nyd04", 255;
	warp "moro_vol.gat",91,87;
	end;
}

1@eom.gat,48,88,0	script	�₽�����͂̌���#eom01	10043,{
	misceffect 362;
	hideonnpc;
	getitem 22566,1;
	end;
}
1@eom.gat,51,103,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom02	10043
1@eom.gat,24,109,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom03	10043
1@eom.gat,26,128,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom04	10043
1@eom.gat,40,140,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom05	10043
1@eom.gat,38,139,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom06	10043
1@eom.gat,51,149,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom07	10043
1@eom.gat,49,148,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom08	10043
1@eom.gat,27,100,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom09	10043
1@eom.gat,32,94,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom10	10043
1@eom.gat,60,140,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom11	10043
1@eom.gat,54,97,0	duplicate(�₽�����͂̌���#eom01)	�₽�����͂̌���#eom12	10043
