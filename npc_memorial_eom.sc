moro_cav.gat,41,73,4	script	���҃j�[�Y�w�b�O#epeo	510,{/* 65386 */
	if(checkquest(7598)) {	// �N�[���^�C����
	}
	if(checkquest(7597)) {	// �����㖢��
	}
	if(checkquest(7593) == 0) {
		cutin "ep14_nyd01.bmp", 2;
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
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(getonlinepartymember() < 1) {
		mes "[�j�[�Y�w�b�O]";
		mes "���̐�͈�l�ł͊댯�ł��B";
		mes "�p�[�e�B�[���������Ă��痈�ĉ������B";
		cutin "ep14_nyd01.bmp", 2;
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		cutin "ep14_nyd01.bmp", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�F����̈��S����邽�߁A";
		mes "���_�a�ɓ���\����";
		mes "�p�[�e�B�[���[�_�[�������ł��܂��B";
		mes "���Ȃ��̃p�[�e�B�[�̃��[�_�[����";
		mes "���ɘb��������悤�`���Ă��������B";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	mes "[�j�[�Y�w�b�O]";
	mes "���҂����Ă��܂����B";
	mes "�����N������[�w���܂ňē����܂��B";
	cutin "ep14_nyd04.bmp", 2;
	next;
	mes "[�j�[�Y�w�b�O]";
	mes "���̎��͐��E���Ǝ��Ă��܂��ˁB";
	mes "�����N�̖ړI�����̗\�z�Ƃ�";
	mes "�قȂ�Ɨǂ��̂ł����c�c�B";
	cutin "ep14_nyd03.bmp", 2;
	next;
	mes "[�j�[�Y�w�b�O]";
	mes "�������痬��o�閂�͂�";
	mes "���Ԋu�ő������Ă��邩�̂悤��";
	mes "����������܂��B";
	mes "���͂��̋�Ԃ���";
	mes "�[�w���ւ̓����J���܂��B";
	mes "�[�w���֍s�������͂ł��܂������H";
	cutin "ep14_nyd04.bmp", 2;
	next;
	if(select("�������ł���","�s���Ȃ�") == 2) {
		mes "[�j�[�Y�w�b�O]";
		mes "�킩��܂����B";
		mes "�o������܂ŏ\���ɏ�������";
		mes "���Ԃ��K�v�ł��傤�B";
		mes "������菀�����ė��ĉ������B";
		mes "���͂����ő҂��Ă��܂��B";
		cutin "ep14_nyd04.bmp", 2;
		close2;
		cutin "ep14_nyd04.bmp", 255;
		end;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�j�[�Y�w�b�O]";
		mes "�҂��Ă��������A����́c�c!?";
		mes "���̗͂��ꂪ�ς��܂����B";
		mes "�������̓����ɋC���t�����悤�ł��B";
		mes "���������l�q�����Ă݂܂��傤�B";
		mes "�������͏����ꂴ��q�ł�����B";
		cutin "ep14_nyd01.bmp", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�ܘ_�A�����������[�w���֍s����";
		mes "�����N�����߂����̂ł����A";
		mes "�ނ�ɋC�t����Ă���Ɗ댯�ł��B";
		mes "���΂炭�҂��܂��傤�B";
		cutin "ep14_nyd02.bmp", 2;
		close2;
		cutin "ep14_nyd02.bmp", 255;
		end;
	}
	mdcreate "end_of_morocc";
	mes "[�j�[�Y�w�b�O]";
	mes "�c�c���������œ������J���܂��B";
	mes "����ʂ��ĐN�����Ă��������B";
	mes "�|����Ȃ��ŉ������B";
	mes "�������ɍs���܂��B";
	cutin "ep14_nyd04.bmp", 2;
	close2;
	cutin "ep14_nyd04.bmp", 255;
	end;
OnInit:
	waitingroom "���_�a����", 0; //65386
	end;
}
moro_cav.gat,45,75,0	script	���E���Ɏ�����#eom_gate	844,{/* 65387 */
	if(checkquest(7598)) {	// �N�[���^�C����
	}
	if(checkquest(7597)) {	// �����㖢��
	}
	if(checkquest(7593) == 0) {
		cutin "ep14_nyd01.bmp", 2;
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
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	mes "�]���Ɏ�𓖂Ă�ƁA";
	mes "�@���̗͂��ꂪ��������B";
	mes "�@���̗���ɐg��C�����";
	mes "�@�[�w���ɐN���ł���̂��낤���]";
	next;
	if(select("����","����Ȃ�") == 2) {
		cutin "ep14_nyd04.bmp", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�킩��܂����B";
		mes "�o������܂ŏ\���ɏ�������";
		mes "���Ԃ��K�v�ł��傤�B";
		mes "������菀�����ė��ĉ������B";
		mes "���͂����ő҂��Ă��܂��B";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	if(getonlinepartymember() < 1) {
		mes "[�j�[�Y�w�b�O]";
		mes "���̐�͈�l�ł͊댯�ł��B";
		mes "�p�[�e�B�[���������Ă��痈�ĉ������B";
		cutin "ep14_nyd01.bmp", 2;
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	switch(mdenter("end_of_morocc")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[end_of_morocc] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x9, 0x00ff99, 0x190, 12, 0, 0;
		setquest 96435; //state=1
		//warp "1@eom.gat",101,16;
		end;
	case 1:	// �p�[�e�B�[������
	case 2:	// �_���W�������쐬
		mes "[�j�[�Y�w�b�O]";
		mes "���Ȃ��̃p�[�e�B�[�œ��ꋖ��";
		mes "�\������Ă��܂���B";
		mes "�p�[�e�B�[���[�_�[���琳����";
		mes "�v�����Ă���������΁A����";
		mes "���_�a�ɒʂ���������J���܂��傤�B";
		cutin "ep14_nyd01.bmp", 2;
		next;
		mes "[�j�[�Y�w�b�O]";
		mes "�F����̈��S�̂��߁A";
		mes "�����͂����肢���܂��B";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	default:	// ���̑��G���[
		close;
	}
OnInit:
	waitingroom "���_�a����", 0; //65387
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
	if(getmapusers('@mdmap$) == 1) {
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
		hideoffnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh"); //99823
		hideoffnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah"); //99825
		hideoffnpc getmdnpcname("���_�̎g�k�E�A�n�g#ah02"); //99822
	}
	end;
}

1@eom.gat,101,43,3	script	���_�̎g�k�E�A�n�g#ahat	493,{/* 61682 */
	if(Sex)
		cutin "ep13_ahat_f.bmp", 2;
	else
		cutin "ep13_ahat_m.bmp", 2;
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
	setquest 7596; //state=1
	cutin "ep13_ahat_f.bmp", 255;
	mapwarp getmdmapname("1@eom.gat"),getmdmapname("1@eom.gat"),103,16;
	donpcevent getmdnpcname("callmon#eom1")+"::OnStart";
	end;
}

1@eom.gat,101,55,3	script	���_�̎g�k�E�A�n�g#ah02	493,{/* 61684 */
	if(Sex)
		cutin "ep13_ahat_f.bmp", 2;
	else
		cutin "ep13_ahat_m.bmp", 2;
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
	misceffect 231, getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh"); //82792
	misceffect 231, getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah"); //82794
	getitem 6713,1;
	getitem 6714,1;
	hideonnpc getmdnpcname("���_�̎g�k�E�A�n�g#ah02"); //82791
	close2;
	cutin "ep13_ahat_f.bmp", 255;
	end;
}
1@eom.gat,98,56,0	script	��ɂȂ��Ă��鍰�̊�#sh	844,{/* 61685 */
	if(countitem(6714) < 1) {
		mes "�]�����J���ɂ̓V�i�C���̍���";
		mes "�@���̊�𖞂����K�v������]";
		close;
	}
	mes "�]��ɂȂ��Ă��鍰�̊��";
	mes "�@�V�i�C���̍��𒍓����܂��]";
	next;
	misceffect 72, getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh"); //82792
	progressbar 5;
	delitem 6714, 1;
	misceffect 6, getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh"); //82792
	hideonnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#sh"); //82792
	hideoffnpc getmdnpcname("���������Ă����#shnaim"); //82793
	misceffect 6, getmdnpcname("���������Ă����#shnaim"); //82793
	misceffect 202, getmdnpcname("���������Ă����#shnaim"); //82793
	donpcevent getmdnpcname("#gate_to_center")+ "::OnStartSH";
	mes "�]�킪�V�i�C���̍��Ŗ�������܂����]";
	close;
}
1@eom.gat,98,56,0	script	���������Ă����#shnaim	844,{/* 61686 (hide)*/}
1@eom.gat,104,56,0	script	��ɂȂ��Ă��鍰�̊�#ah	844,{/* 61687 */
	if(countitem(6713) < 1) {
		mes "�]�����J���ɂ̓A�n�g�̍���";
		mes "�@���̊�𖞂����K�v������]";
		close;
	}
	mes "�]��ɂȂ��Ă��鍰�̊��";
	mes "�@�A�n�g�̍��𒍓����܂��]";
	next;
	misceffect 72, getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah"); //82794
	progressbar 5;
	delitem 6713, 1;
	misceffect 6, getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah"); //82794
	hideonnpc getmdnpcname("��ɂȂ��Ă��鍰�̊�#ah"); //82794
	hideoffnpc getmdnpcname("���������Ă����#ahat02"); //82795
	misceffect 6, getmdnpcname("���������Ă����#ahat02"); //82795
	misceffect 202, getmdnpcname("���������Ă����#ahat02"); //82795
	donpcevent getmdnpcname("#gate_to_center")+ "::OnStartAH";
	mes "�]�킪�A�n�g�̍��Ŗ�������܂����]";
	close;
}
1@eom.gat,104,56,0	script	���������Ă����#ahat02	844,{/* 61688 (hide)*/}
1@eom.gat,101,58,0	script	#gate_to_center	45,2,2,{
OnTouch:
	delquest 7596;
	warp getmdmapname("1@eom.gat"),98,115; //61689
	end;
OnStartSH:
	if('flag&2 == 0) {
		set 'flag,1;
		end;
	}
	misceffect 231, getmdnpcname("#gate_to_center"); //82796
	misceffect 202, getmdnpcname("#gate_to_center"); //82796
	hideoffnpc getmdnpcname("#gate_to_center"); //82796
	end;
OnStartAH:
	if('flag&1 == 0) {
		set 'flag,2;
		end;
	}
	misceffect 231, getmdnpcname("#gate_to_center"); //82796
	misceffect 202, getmdnpcname("#gate_to_center"); //82796
	hideoffnpc getmdnpcname("#gate_to_center"); //82796
	end;
}
1@eom.gat,100,122,3	script	������Ȃ����N#mockid01	10038,{/* 61690 */
	if(select("�}��","��b������") == 1) {
		// ������
	}
	cutin "morocc_kid.bmp", 2;
	mes "[���N]";
	mes "�悤�����B";
	mes "�ǂ����ȁH�@���̕����́B";
	mes "�l�͂��ƋC�ɓ����Ă���񂾂��ǁB";
	announce "���N : �悤�����B�ǂ����ȁH�@���̕����́B�l�͂��ƋC�ɓ����Ă���񂾂��ǁB", 0x9, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�N�́H";
	unittalk getcharid(3),"�N�́H";
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
	cutin "morocc_kid.bmp", 255;
	donpcevent getmdnpcname("������Ȃ����N#mockid01")+ "::OnStart";
	end;
OnStart:
	initnpctimer;
	hideoffnpc getmdnpcname("���L#eomloki01"); //82799
	hideoffnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd01"); //82800
	end;
OnTimer1000:
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk1";
	end;
OnTimer6000:
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk2";
	end;
OnTimer11000:
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk3";
	end;
OnTimer16000:
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk4";
	end;
OnTimer21000:
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk5";
	end;
OnTimer26000:
	donpcevent getmdnpcname("�j�[�Y�w�b�O#eomnyd01")+ "::OnTalk1";
	end;
OnTimer31000:
	donpcevent getmdnpcname("�j�[�Y�w�b�O#eomnyd01")+ "::OnTalk2";
	end;
OnTimer36000:
	donpcevent getmdnpcname("�j�[�Y�w�b�O#eomnyd01")+ "::OnTalk3";
	end;
OnTimer41000:
	announce "�����N : ����ȂɎ׌��ɂ��Ȃ��łق����Ȃ��B�l�ƌN�̒�����Ȃ����A�j�[�Y�w�b�O�B", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer46000:
	announce "�����N : ���������Ă����Y�ꂿ������́H�@�l�̌��t�ɂ���ȂɔM�S�Ɏ����X���Ă��ꂽ�̂ɁB", 0x9, 0xff0000, 0x190, 14, 0, 0;
	end;
OnTimer51000:
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk6";
	end;
OnTimer51500:
	misceffect 17, getmdnpcname("������Ȃ����N#mockid01"); //82797
	end;
OnTimer56000:
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk7";
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
	misceffect 6, getmdnpcname("������Ȃ����N#mockid01"); //82797
	end;
OnTimer94500:
	hideonnpc getmdnpcname("������Ȃ����N#mockid01"); //82797
	donpcevent getmdnpcname("���L#eomloki01")+ "::OnTalk8";
	end;
OnTimer96000:
	hideonnpc getmdnpcname("���L#eomloki01"); //82799
	end;
OnTimer96500:
	hideoffnpc getmdnpcname("#eom_gate_to_ice"); //82801
	misceffect 135, getmdnpcname("#eom_gate_to_ice"); //82801
	end;
OnTimer97000:
	stopnpctimer;
	misceffect 231, getmdnpcname("#eom_gate_to_ice"); //82801
	end;
}

1@eom.gat,95,122,5	script	���L#eomloki01	512,{/* 61692 (hide)*/
	cutin "ep14_roki01.bmp", 2;
	mes "[���L]";
	mes "�c�c�t���B";
	mes "����Ȓ��ԁA�����I��点��";
	mes "�Ƃ��ƂƋA�邼�B";
	close2;
	cutin "ep14_roki01.bmp", 255;
	end;
OnTalk1:
	unittalk "���L : �t���B���̑��������ꏊ�����O���p�ӂ���Ƃł������̂��H";
	end;
OnTalk2:
	unittalk "���L : �΂킹��ȁB������͎����B�ł��̏ꏊ���A�����邱�Ƃ��o����B";
	end;
OnTalk3:
	unittalk "���L : �����ƕ�����₷�������Ă�낤�B";
	end;
OnTalk4:
	unittalk "���L : ���O���p�ӂ����ꏊ�ȂǁA������ɂ͕K�v�Ȃ��B";
	end;
OnTalk5:
	unittalk "���L : �����āA���O�����̐��E�ɑ��݂ł���ꏊ���ȁB";
	end;
OnTalk6:
	unittalk "���L : �ӂ�����ȁI";
	end;
OnTalk7:
	unittalk "���L : �c�c�`�b�B���΂Ɏ��̂ł͂Ȃ��������B";
	end;
OnTalk8:
	unittalk "���L : ������̂��I";
	end;
}
1@eom.gat,94,120,5	script	�j�[�Y�w�b�O#eomnyd01	510,{/* 61693 (hide)*/
	{
		cutin "ep14_nyd01.bmp", 2;
		mes "[�j�[�Y�w�b�O]";
		mes "�������ł������c�c�B";
		mes "��������͔��͂Ȃ���A";
		mes "������������`�����܂��B";
		close2;
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
	cutin "ep14_nyd01.bmp", 2;
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
		next;
		misceffect 72, getmdnpcname("�j�[�Y�w�b�O#eomnyd01"); //82800
		cutin "ep14_nyd01.bmp", 255;
		mes "�]^4d4dff���҃j�[�Y�w�b�O�̕��g��";
		mes "�@���ԂƂ��ĎQ�킵�܂���^000000�]";
		setquest 7605; //state=1
		close2;
		hideonnpc getmdnpcname("�j�[�Y�w�b�O#eomnyd01"); //82800
		makemerc 3087,1800;
		end;
	case 2:
		mes "[�j�[�Y�w�b�O]";
		mes "�����ł����c�c�B";
		mes "���̗͂��K�v�ɂȂ�����";
		mes "���ł������Ă��������B";
		close2;
		cutin "ep14_nyd01.bmp", 255;
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
		cutin "ep14_nyd01.bmp", 255;
		end;
	}
OnTalk1:
	unittalk "�j�[�Y�w�b�O : �����ł��A���Ȃ��͕K�v�̂Ȃ����݁c�c�B�������A���݂��Ă͂����Ȃ��̂ł��B";
	end;
OnTalk2:
	unittalk "�j�[�Y�w�b�O : ���̏؋��ɁA���E�������Ȃ��̑��݂�ے肵�Ă��܂��B";
	end;
OnTalk3:
	unittalk "�j�[�Y�w�b�O : ���E���C�O�h���V���̎��҂���A�j�[�Y�w�b�O�������܂��B�c�c���̐��E��������Ȃ���!!";
	end;
}
1@eom.gat,91,120,0	warp	#eom_gate_to_ice	2,2,1@eom.gat,56,88	//61694
1@eom.gat,100,122,3	script	�����N#mockid03	10038,{/* 61695 (hide)*/
	cutin "morocc_kid.bmp", 2;
	mes "[�����N]";
	mes "���͂́I�@�܂������Ă��񂾂ˁB";
	mes "��������B";
	announce "�����N : ���͂́I�@�܂������Ă��񂾂ˁB��������B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�����A����2�C�ɏ��Ă�Ƃ�";
	mes "�v���ĂȂ������񂾂��ǁc�c�B";
	announce "�����N : �����A����2�C�ɏ��Ă�Ƃ͎v���ĂȂ������񂾂��ǁc�c�B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�܂��A�l�����X�ɌN������r�����āA";
	mes "���̐��E��S�Ĉ��ݍ��߂΂�����B";
	announce "�����N : �܂��A�l�����X�ɌN������r�����āA���̐��E��S�Ĉ��ݍ��߂΂�����B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	next;
	mes "[�����N]";
	mes "�c�c���āA���낻��n�߂悤���B";
	mes "���̕����ő҂��Ă��B";
	announce "�����N : �c�c���āA���낻��n�߂悤���B���̕����ő҂��Ă��B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	close2;
	cutin "morocc_kid.bmp", 255;
	misceffect 57, "�����N#mockid03"; //82802
	misceffect 6, "�����N#mockid03"; //82802
	hideonnpc "�����N#mockid03"; //82802
	hideoffnpc "#eom_gate_to_last"; //82803
	misceffect 316, "#eom_gate_to_last"; //82803
	end;
}
1@eom.gat,98,127,0	script	#eom_gate_to_last	45,2,2,{
	setquest 96438; //state=1
	warp "1@eom.gat",102,178; //61696
	end;
}
1@eom.gat,56,88,0	script	#icemob01	139,{/* 61697 (hide)*/}
1@eom.gat,22,116,3	script	#icemob02	844,{/* 61698 (hide)*/}
1@eom.gat,53,134,5	script	#icemob03	844,{/* 61699 (hide)*/}
1@eom.gat,38,129,3	script	�u���i���l�A#brinpc01	3091,{/* 61700 (hide)*/}

1@eom.gat,59,147,3	script	�j�[�Y�w�b�O#eomnyd02	510,{/* 61704 */
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
	misceffect 313,""; //self
	close;
}
1@eom.gat,67,149,0	script	#eom_ice_to_center	45,2,2,{
	setquest 96437; //state=1
	warp "1@eom.gat",136,93; //61705
	end;
}
1@eom.gat,148,100,3	script	���L#flamewolf	512,{/* 61706 */}
1@eom.gat,168,133,3	script	���X�y���X�R�[��#npc	3092,{/* 61707 (hide)*/}

1@eom.gat,154,119,0	script	�����n��#lavapond01	844,{/* 61714 */}
1@eom.gat,154,119,0	script	�ł܂����n��#01	844,{/* 61715 (hide)*/}
1@eom.gat,161,122,0	script	#lavazone11	139,{/* 61716 */}
1@eom.gat,161,102,0	script	#lavazone12	139,{/* 61717 */}
1@eom.gat,182,129,0	script	�����n��#lavapond02	844,{/* 61718 */}
1@eom.gat,182,129,0	script	�ł܂����n��#02	844,{/* 61719 (hide)*/}
1@eom.gat,163,150,0	script	#lavazone21	139,{/* 61720 (hide)*/}
1@eom.gat,163,150,0	script	#lavazone22	139,{/* 61721 (hide)*/}
1@eom.gat,151,155,3	script	���L#flameend	512,{/* 61722 */
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
	misceffect 313,""; //self
	close;
}
1@eom.gat,147,156,0	warp	#eom_fire_to_center	2,2,1@eom.gat,98,115	//61723
1@eom.gat,101,194,0	script	#bgm_change1	139,{/* 61724 */}
1@eom.gat,101,194,0	script	#bgm_change2	139,{/* 61725 (hide)*/}
1@eom.gat,101,194,0	script	#bgm_change3	139,{/* 61726 (hide)*/}
1@eom.gat,101,194,0	script	#bgm_change4	139,{/* 61727 (hide)*/}
1@eom.gat,98,182,0	script	#fire_left1	139,{/* 61728 */}
1@eom.gat,105,182,0	script	#fire_right1	139,{/* 61729 */}
1@eom.gat,98,188,0	script	#fire_left2	139,{/* 61730 */}
1@eom.gat,105,188,0	script	#fire_right2	139,{/* 61731 */}
1@eom.gat,98,194,0	script	#fire_left3	139,{/* 61732 */}
1@eom.gat,105,194,0	script	#fire_right3	139,{/* 61733 */}
1@eom.gat,98,200,0	script	#fire_left4	139,{/* 61734 */}
1@eom.gat,105,200,0	script	#fire_right4	139,{/* 61735 */}
1@eom.gat,98,206,0	script	#fire_left5	139,{/* 61736 */}
1@eom.gat,105,206,0	script	#fire_right5	139,{/* 61737 */}
1@eom.gat,104,204,1	script	���L#op	512,{/* 61738 (hide)*/}
1@eom.gat,99,204,7	script	�j�[�Y�w�b�O#op	510,{/* 60510 (hide)*/}
1@eom.gat,102,209,0	script	#event_moc_talk	139,{/* 60511 */
	menu "��b������",-;
	close;
	announce "�����N : �悭�����ˁB�l�Ԕ@���������܂ŗ����Ȃ�ċ�������B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideonnpc "#bgm_change1_0ez"; //82831
	hideoffnpc "#bgm_change2_0ez"; //82832
	musiceffect "158";
	announce "�����N : �ӂӂ��A�l�̖ړI���C�ɂȂ�̂����H�@����͂ˁA���E�̑n�����B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : ���ă��~���������悤�ɖl�����E����肩����񂾂�I", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : ���ׂ̗̈͂͂��ׂđ������B�l�͍����炱�̐��E��łڂ��A�V���Ȑ��E��n�����Đ_�Ƃ��ČN�Ղ���̂��I", 0x1, 0xff0000, 0x190, 14, 0, 0;
	misceffect 90, "�����N#moc_master_0ez"; //82848
	announce "�����N : ���͂͂́I�@���ʂ��斳�ʁB�N�͖l�ɐG��鎖����o���Ȃ��B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : ���̏�ǂ������邾�낤�H�@���ꂪ�������A�N�����͖l�ɐG����Ȃ��B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �c�O�������ˁB�����Ő��E�̏I���ƍĒa�����͂��邪�����I", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �܂��͎�n�߂Ƀt���C�����@���[�ɋ���S�~����|�������悤���B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �N�͂����Œ��Ԃ̎��ɂ䂭�l���w�����킦�Č��Ă���Ɨǂ��I", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �l���I�@�l�������V���E�̐_�I�@���_�����N���I", 0x1, 0xff0000, 0x190, 14, 0, 0;
	misceffect 59, "�����N#moc_master_0ez"; //82848
	misceffect 90, "�����N#moc_master_0ez"; //82848
	misceffect 135, "�����N#moc_master_0ez"; //82848
	announce "�����N : ����́c�c��ǂ���ꂽ�H", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �����A�l�Ƃ������Ƃ��A�N�����̎������O���Ă�����B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideoffnpc "���L#op_0ez"; //82845
	hideoffnpc "�j�[�Y�w�b�O#op_0ez"; //82846
	announce "�����N : �l��|���H�@�_�ł��邱�̖l���H", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : ���q�ɏ��ȁI", 0x1, 0xff0000, 0x190, 14, 0, 0;
	misceffect 30, "���L#op_0ez"; //82845
	misceffect 30, "�j�[�Y�w�b�O#op_0ez"; //82846
	announce "�����N : ���₨��A�������ꌂ�Ŗ��g�n�w����Ȃ����B����Ŗl��|����̂����H", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �c�c�������������񂾂��H", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �c�c�ʔ�����k���ˁA���̎��ɑ��Ȃ��I", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �N���킦�Ȃ����A�N���l�ɓG���ƌ����񂾂��H", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideonnpc "���L#op_0ez"; //82845
	hideonnpc "�j�[�Y�w�b�O#op_0ez"; //82846
	announce "�����N : ���āA�N���ǂ�قǂ̗͂������Ă���̂������ĖႤ��B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �N�����l�ԂƂ̐킢���A����ŕ����B", 0x1, 0xff0000, 0x190, 14, 0, 0;
	announce "�����N : �����A�_�ɋw�Ȃ��Ǝ�Ȃ�҂�I�@���E�Ēa�̍ŏ����тƂȂ邪�����I", 0x1, 0xff0000, 0x190, 14, 0, 0;
	hideonnpc "�����N#moc_master_0ez"; //82848
	set '@mob,callmonster("1@eom.gat",102,209,"�Đ��̔����_#mk01",3096,'@event$);
}
1@eom.gat,102,209,3	script	�����N#moc_master	10038,{/* 60512 */}
1@eom.gat,101,194,3	script	#morocc_god	3097,{/* 60803 (hide)*/}
1@eom.gat,101,194,0	script	#moc_quest	139,{/* 60807 (hide)*/}
1@eom.gat,102,197,3	script	��]�̐_�����N#04	3097,{/* 60808 (hide)*/}
1@eom.gat,104,194,1	script	���L#eomnyd04	512,{/* 60809 (hide)*/}
1@eom.gat,99,194,7	script	�j�[�Y�w�b�O#eomnyd04	510,{/* 60810 (hide)*/}
1@eom.gat,48,88,0	script	�₽�����͂̌���#eom01	10043,{/* 60811 */}
1@eom.gat,51,103,0	script	�₽�����͂̌���#eom02	10043,{/* 60812 */}
1@eom.gat,24,109,0	script	�₽�����͂̌���#eom03	10043,{/* 60813 */}
1@eom.gat,26,128,0	script	�₽�����͂̌���#eom04	10043,{/* 60814 */}
1@eom.gat,40,140,0	script	�₽�����͂̌���#eom05	10043,{/* 60815 (hide)*/}
1@eom.gat,38,139,0	script	�₽�����͂̌���#eom06	10043,{/* 60816 (hide)*/}
1@eom.gat,51,149,0	script	�₽�����͂̌���#eom07	10043,{/* 60817 */}
1@eom.gat,49,148,0	script	�₽�����͂̌���#eom08	10043,{/* 60818 */}
1@eom.gat,27,100,0	script	�₽�����͂̌���#eom09	10043,{/* 60819 */}
1@eom.gat,32,94,0	script	�₽�����͂̌���#eom10	10043,{/* 60820 */}
1@eom.gat,60,140,0	script	�₽�����͂̌���#eom11	10043,{/* 60821 (hide)*/}
1@eom.gat,54,97,0	script	�₽�����͂̌���#eom12	10043,{/* 60822 */}