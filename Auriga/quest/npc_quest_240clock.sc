// clock_01.gat
clock_01.gat,0,0,0,0	monster	�G�N�X�g���W���[�J�[	20175,5,5000,0,0	// aid: 4376-4380
clock_01.gat,0,0,0,0	monster	�G���W�F�[�x�g	20176,75,90935,0,0	// aid: 4381-4455
clock_01.gat,0,0,0,0	monster	�W�F�j�t�@�[	20177,55,5000,0,0	// aid: 4456-4510
clock_01.gat,0,0,0,0	monster	�W�F�l�����I�[�N	20178,75,5000,0,0	// aid: 4511-4585
clock_01.gat,0,0,0,0	monster	�W�N���E�X	20179,60,5000,0,0	// aid: 4586-4645

/*
20178,�W�F�l�����I�[�N���X���[�L���O,attack,195,1,2000,0,1933,no,self,always,0,,,,,,
20178,�W�F�l�����I�[�N��M���C�I�u�W�F�l�V�X,attack,737,7,2000,0,2,no,around,always,0,,,,,,
20178,�W�F�l�����I�[�N���X�^���A�^�b�N,attack,179,1,2000,0,158,no,target,always,0,,,,,,
20178,�W�F�l�����I�[�N���V�[���h�`���[�W,attack,250,1,2000,0,14972,no,target,always,0,,,,,,
20178,�W�F�l�����I�[�N���p���X�X�g���C�N,attack,661,1,2000,0,2,no,self,always,0,,,,,,
20178,�W�F�l�����I�[�N���_�[�N�l�X�A�^�b�N,attack,190,1,2000,0,212,no,target,always,0,,,,,,
20176,�G���W�F�[�x�g���_�[�N�T���_�[,chase,341,12,2000,0,3,no,target,always,0,,,,,,
20176,�G���W�F�[�x�g��M���C�I�u�W�F�l�V�X,attack,737,7,2000,0,2,no,around,always,0,,,,,,
20176,�G���W�F�[�x�g���T�C�����X�A�^�b�N,attack,178,1,2000,0,13406,no,target,always,0,,,,,,
20176,�G���W�F�[�x�g���G�i�W�[�h���C��,attack,200,1,2000,0,98,no,target,always,0,,,,,,
20176,�G���W�F�[�x�g���J�[�X�A�^�b�N,attack,181,1,2000,0,7,no,target,always,0,,,,,,
20176,�G���W�F�[�x�g���z�[���h�E�F�u,attack,342,1,2000,0,1500,no,target,always,0,,,,,,
20176,�G���W�F�[�x�g���f�X�n���h,attack,747,0,2000,500,0,no,target,always,0,,,,,,
20179,�W�N���E�X���_�[�N�l�X�A�^�b�N,attack,190,1,2000,0,122,no,target,always,0,,,,,,
20179,�W�N���E�X���O���E���h�A�^�b�N,attack,185,1,2000,0,812,no,target,always,0,,,,,,
20179,�W�N���E�X��M���C�I�u�W�F�l�V�X,attack,737,7,2000,0,3,no,around,always,0,,,,,,
20177,�W�F�j�t�@�[���R���{�A�^�b�N,attack,171,2,2000,0,4,no,target,always,0,,,,,,
20177,�W�F�j�t�@�[���_�[�N�u���X,attack,202,1,2000,0,4,no,target,always,0,,,,,,
20177,�W�F�j�t�@�[���_�[�N�l�X�A�^�b�N,attack,190,1,2000,0,3,no,target,always,0,,,,,,
20177,�W�F�j�t�@�[���u���b�h�h���C��,attack,199,1,2000,0,16,no,target,always,0,,,,,,
20175,�G�N�X�g���W���[�J�[���_�[�N�T���_�[,attack,341,12,2000,0,11447,no,target,always,0,,,,,,
20175,�G�N�X�g���W���[�J�[���z�[���[�A�^�b�N,attack,189,1,2000,0,1689,no,target,always,0,,,,,,
20175,�G�N�X�g���W���[�J�[���t�@�C�A�[�{�[��,chase,17,1,2000,0,0,no,target,always,0,,,,,,
20175,�G�N�X�g���W���[�J�[���A�g���r���[�g�`�F���W,attack,161,1,2000,0,0,no,self,always,0,,,,,,
*/

c_tower1.gat,246,197,4	script	����ȃ[���}�C#240clock	10046,{/* 7174 */
	if(!checkquest(5971)) {
		unittalk getnpcid(0,"��̔�#240clock"),"�K�^�K�^�I�@�K�^�K�^�I",1;
		if(!sleep2(1000)) end;;
		unittalk getcharid(3),strcharinfo(0)+" : �]�����特������B��ɔ��𒲂ׂĂ݂悤�]",1;
		end;
	}
	mes "�]����ȃ[���}�C������B";
	mes "�@�͂����ē������΁A";
	mes "�@���������ȋC������]";
	next;
	switch(select("�E�����Ɋ���","�������Ɋ���")) {
	case 1:
		mes "�]�h�����ă[���}�C���E�����Ɋ����ƁA";
		mes "�@�ǂ����ւƓ]�����ꂽ�c�c�]";
		close2;
		warp "clock_01.gat", 86, 42;
		end;
	case 2:
		mes "�]�h�����ă[���}�C���������Ɋ����ƁA";
		mes "�@�ǂ����ւƓ]�����ꂽ�c�c�]";
		close2;
		warp "clock_01.gat", 136, 143;
		end;
	}
}
c_tower1.gat,243,202,4	script	��̔�#240clock	10033,{/* 7176 */
	if(!checkquest(5971)) {
		mes "�]����ȏꏊ�ɂ��肻���Ȕ��ł͂Ȃ�";
		mes "�@�؂₩�ɑ�������Ă��锠�����A";
		mes "�@�܂����V��̃~�~�b�N���낤���H�]";
		next;
		if(select("�G���Ă݂�","�����Ă���") == 2) {
			mes "�]�����Ă������]";
			close;
		}
	}
	else {
		mes "�����������Ă��锠���B";
		mes "�������N���������H";
		next;
		if(select("�N����","�����Ă���") == 2)
			close;
	}
	emotion 41;
	if(!sleep2(1000)) end;;
	misceffect 768;
	cloakonnpc;
	cloakoffnpc "���̈���#240clock";
	unittalk getnpcid(0,"���̈���#240clock"),"���̈��� : ���̉��l���N�����̂́A�N���H";
	close;
}

//�����p���ς��H
//1882
c_tower1.gat,243,202,4	script	���̈���#240clock	2155,{/* 7177 (cloaking)*/
	if(!checkquest(5971)) {
		mes "�]�悭������Ȃ��������́A";
		mes "�@�������яo���Ȃ�A";
		mes "�@�������������ƌ��߂Ă���A";
		mes "�@�������Ȃ��������̂悤��";
		mes "�@�Ƃ茾���n�߂��]";
		next;
		mes "[���̈���]";
		mes "����H�I";
		mes "�Ȃ񂾁H�����͂ǂ����H";
		mes "�����́c�c";
		next;
		mes "[���̈���]";
		mes "�ӂށc�c�����́c�c���v���H�Ȃ̂��H";
		mes "�܂��A�厖�Ȃ̂�";
		mes "���������ꏊ�ł͂Ȃ����Ă��Ƃ��ȁI";
		next;
		mes "[���̈���]";
		mes "���`��";
		next;
		mes "[���̈���]";
		mes "���I�����ۂ������c�c���̃[���}�C����";
		mes "���̂����ꏊ�̓���������ȁB";
		mes "�A��Ȃ�����B";
		next;
		emotion 9;
		mes "[���̈���]";
		mes "�c�c�B";
		next;
		emotion 23;
		mes "[���̈���]";
		mes "�������H�I�Ȃ񂾁H";
		mes "�Ȃ�ŁH�Ȃ�œ���Ȃ��񂾂�I";
		next;
		mes "�]����獢���Ă���悤���B";
		mes "�@���������Ă݂悤���H�]";
		while(1) {
			next;
			if(select("�T�ς���","����������") == 2)
				break;
			mes "[���̈���]";
			mes "�Ⴄ�I����Ȃ��Ƃ͂��蓾�Ȃ��B";
			mes "���̎����ۂ��������炵�āA";
			mes "�������͂�����";
			mes "���������ꏊ�ɈႢ�Ȃ��I";
			next;
			mes "[���̈���]";
			mes "�c�c�B";
			next;
			emotion 57;
			mes "[���̈���]";
			mes "���[���I";
			mes "�Ȃ�ŁH�Ȃ�œ���Ȃ��񂾂�I";
			next;
			mes "�]����獢���Ă���悤���B";
			mes "�@���������Ă݂悤���H�]";
			next;
			if(select("�T�ς���","����������") == 2)
				break;
			mes "[���̈���]";
			mes "�Ȃ�ŁI�Ȃ�ŁI�Ȃ�ŁI";
			mes "�Ȃ�œ���Ȃ��񂾂悧�I�I�I";
			next;
			emotion 28;
			mes "[���̈���]";
			mes "���������������Ƃł��������Ă̂��H";
			mes "�ǂ����I���点�āc�c�I";
			next;
			mes "�]����獢���Ă���悤���B";
			mes "�@���������Ă݂悤���H�]";
			next;
			if(select("�T�ς���","����������") == 2)
				break;
			mes "[���̈���]";
			mes "����I";
			mes "���������āA�悭�l���Ă݂悤�I";
			mes "���i�̂悤�Ƀy�b�g�~�~�b�N��";
			mes "�U�������āc�c�B";
			next;
			emotion 57;
			mes "[���̈���]";
			mes "�����c�c�v���o���Ȃ��B";
			mes "���͉��ł����ɂ���񂾁H";
			next;
			mes "�]����獢���Ă���悤���B";
			mes "�@���������Ă݂悤���H�]";
			continue;
		}
		emotion 23;
		mes "[���̈���]";
		mes "��������H�I";
		mes "�����H�����H����������̂��H";
		next;
		mes "�]���Ȃ��������A";
		mes "�@�菕����\���o���]";
		next;
		mes "�]���̈�����";
		mes "�@�������҂�����ڂ��ɂ�ł���]";
		next;
		mes "[���̈���]";
		mes "���[��c�c�}�}�ɁA";
		mes "���R���Ȃ��P�ӂ��{�����Ƃ���҂́A";
		mes "�S�ċ^���ƌ���ꂽ���ǁc�c�B";
		next;
		menu "�����e��",-;
		mes "[���̈���]";
		mes "�����I";
		mes "�̑�Ȉ�������̃K�L��������Ƃ́A";
		mes "���������z�I�I";
		next;
		mes "[���̈���]";
		mes "���O�ɂ͈����̎􂢂�";
		mes "����킹�Ă��I�I";
		next;
		emotion 1,"���̈���#240clock";
		mes "[���̈���]";
		mes "�H";
		next;
		emotion 1,"";
		mes "�]���������������悤�����A";
		mes "�@�����ω��͂Ȃ��]";
		next;
		unittalk "���[�[�c";
		mes "�]�ǂ���炨���������Ă���悤���B";
		mes "�@���Ȃ��͍ēx�A���͂�\���o���]";
		next;
		mes "[���̈���]";
		mes "�������c�c";
		mes "�����������Ă��Ȃ���΁c�c";
		mes "���������ǁA";
		mes "���͏_��Ȉ���������";
		mes "�����Ă��炨�����ȁH";
		next;
		menu "�����͉���H�ׂ�H",-;
		mes "[���̈���]";
		mes "�ӂӁA�������Ɩ�����B";
		mes "���̈����l��";
		mes "�V�N�ȍ��̎c��J�X��H�ׂ邼�B";
		next;
		menu "�ǂ��Ŏ�ɓ����΂����H",-;
		mes "[���̈���]";
		mes "���̃[���}�C�̌�����������A";
		mes "�����������ꏊ�Ɠ�������������B";
		mes "�������̃[���}�C�̌���������";
		mes "�����X�^�[��|���΁A���̎c��J�X��";
		mes "���񂽂ɂ������͂����B";
		next;
		menu "�킩����",-;
		mes "[���̈���]";
		mes "�����ڂƈ���Č����z���ȁB";
		mes "�悵�A";
		mes "���ꂩ�炨�O�͂��т������҂��B";
		mes "�����͂��񕜂�����A";
		mes "�ア�􂢂𖡂�킹�Ă��B";
		mes "���l�͊��傾����ȁB";
		next;
		switch(select("��V�͂Ȃ��̂��H","�킩����")) {
		case 1:
			mes "[���̈���]";
			mes "��V�H";
			next;
			menu "�M�u�A���h�e�C�N",-;
			mes "[���̈���]";
			mes "�M�u�A���h�e�C�N�H";
			next;
			menu "�m��Ȃ��H",-;
			mes "[���̈���]";
			mes "�Ɓc�c���R�m���Ă�I";
			mes "�������B�M�u�A���h�e�C�N�A";
			mes "���͌�������������A���R����I";
			next;
			menu "��V��p�ӂ��Đ����Ɉ˗����Ăق���",-;
			emotion 6,"���̈���#240clock";
			mes "[���̈���]";
			mes "���������z�߁I";
			mes "�܂��b�������āA";
			mes "���̈˗��Ƃ������̂�";
			mes "������󂯎���Ă݂�I";
			break;
		case 2:
			mes "[���̈���]";
			mes "���ꂶ��A";
			mes "���񂾂��I";
			break;
		}
		close2;
		setquest 5971;
		compquest 5971;
		end;
	}
	mes "[���̈���]";
	mes "���т������҂�I";
	mes "�����͉����ɗ����񂾁H";
	next;
	switch(select("�f�C���[�N�G�X�g","�G�k����","��߂�")) {
	case 1:
		break;
	case 2:
		switch(rand(6)) {
		case 0:
			unittalk getcharid(3),strcharinfo(0)+" : �y�b�g�~�~�b�N�͂ǂ����Ď������ƂɂȂ����́H",1;
			if(!sleep2(500)) end;;
			unittalk "���̈��� : ���R�E�����B���ł��悭�H�ׂ邩��A�������Ƃɂ����B",1;
			if(!sleep2(500)) end;;
			unittalk getcharid(3),strcharinfo(0)+" : �P�ǂȈ������ˁB",1;
			if(!sleep2(500)) end;;
			unittalk "���̈��� : �������������������āA�����Ȃ舫���������Ȃ���Ȃ��̂��H���񂽂͈�����荓���z���ȁB",1;
			close;
		case 1:
			unittalk getcharid(3),strcharinfo(0)+" : �I�}�P�ł���郂�m�͂ȂɁH",1;
			if(!sleep2(500)) end;;
			unittalk "���̈��� : �����m��Ȃ��B���������Ă��锠�ɐ����R�������B�����L���g�����ƁA�������̂Ă�Œ��������B",1;
			close;
		case 2:
			unittalk "���̈��� : ���������A�����x����Ă�C������c�c�B",1;
			if(!sleep2(500)) end;;
			unittalk getcharid(3),strcharinfo(0)+" : �C�̂�������B",1;
			close;
		case 3:
			unittalk getcharid(3),strcharinfo(0)+" : �ǂ����Ė����p���ς��́H",1;
			if(!sleep2(500)) end;;
			unittalk "���̈��� : ���̘b���H���͖����f�G�Ȉ����̎p�����Ă����B������������������A���͑f�G�Ȉ����Ȃ񂾁B",1;
			if(!sleep2(500)) end;;
			unittalk getcharid(3),strcharinfo(0)+" : ���c�c�����c�c�ǂ���炠�Ȃ����m��Ȃ��悤���ˁc�c�B",1;
			close;
		case 4:
			unittalk getcharid(3),strcharinfo(0)+" : �ǂ����Ĕ��ɓ����Ă��܂����́H",1;
			if(!sleep2(500)) end;;
			unittalk "���̈��� : �n�����ȁB���ꂪ�������炱���ɗ��܂��Ă�Ǝv�����H",1;
			if(!sleep2(500)) end;;
			unittalk getcharid(3),strcharinfo(0)+" : ����͂������c�c�B",1;
			close;
		case 5:
			unittalk getcharid(3),strcharinfo(0)+" : ���������Ζ��O�͂Ȃ�Ă����́H",1;
			if(!sleep2(500)) end;;
			unittalk "���̈��� : ����Ƃ��̈̑�Ȉ����̖��O�𕷂��Ă݂�C�ɂȂ������H���̖��O�̓p�J�Y���`���I",1;
			if(!sleep2(500)) end;;
			unittalk getcharid(3),strcharinfo(0)+" : ������ˁH�I���������ƌĂԂ�c�c�B",1;
			if(!sleep2(500)) end;;
			unittalk "���̈��� : $%^#$#%#$�I���̈�����荓���z�I",1;
			close;
		}
	case 3:
		mes "[���̈���]";
		mes "�܂��ȁI";
		mes "�M�u�A���h�e�C�N���Ă�����I";
		close;
	}
	mes "[���̈���]";
	mes "���т������̂��H";
	next;
	if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�A���f�o�������v���n�� ���m�̋��)") == 2) {
		close2;
		warp "clock_01.gat", 86, 42;
		end;
	}
	mes "�N�G�X�g�̎󒍂�񍐁A";
	mes "���������\�ł��B";
	next;
	switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[�󒍉�] �����̐H��","[�󒍉�] �����̓��ʂȐH��","[�󒍉�] �����̂����","[�󒍉�] �����̃y�b�g�̃~�~�b�N�̃G�T","�S�Ĕj������")) {
	case 3:
		if(checkquest(5961)) {
			if(checkquest(5961)&4) {
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����̐H��^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>�G���W�F�[�x�g<INFO>https://rotool.gungho.jp/monster/ERZSEBET</INFO></URL>�@10��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����̐H��^000000�v";
				mes "��񍐂��܂����H";
				next;
				switch(select("�񍐂���","��߂�","")) {
				}
				delquest 5961;
				setquest 5962;
				getitem 101099,1;
				for(set '@i,0; '@i<20; set '@i,'@i+1)
					getexp 400000000,0,0;
				for(set '@i,0; '@i<20; set '@i,'@i+1)
					getexp 0,300000000,0;
				mes "[���̈���]";
				mes "�߂��Ă������I";
				mes "�ӂӂӁA�V�N�ȍ��̎c��J�X�I";
				mes "���܂����I";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
				mes "���l�����܂����B";
				close;
			}
		}
		mes "[���̈���]";
		mes "���т������҂�I";
		mes "���т̎��������I";
		mes "^e5555e�G���W�F�[�x�g^000000��";
		mes "10�C�|���ė��Ă���B";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̐H��^000000�v";
		mes "<���e>";
		mes "�ΏہF<URL>�G���W�F�[�x�g<INFO>https://rotool.gungho.jp/monster/ERZSEBET</INFO></URL>�@10��";
		mes "�̓������󒍂��܂����H";
		next;
		if(select("�󒍂���","��߂�") == 2) {
			mes "[���̈���]";
			mes "���̐H�~��M�񂾂̂��H";
			mes "�������������z���ȁB";
			next;
			mes "^ff0000[�C���t�H���[�V����]^000000";
			mes "^ff0000�����𒆒f���܂����B^000000";
			close;
		}
		setquest 5961;
		if(checkquest(5962)&2) delquest 5962;
		mes "[���̈���]";
		mes "�����I���񂾂��I";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̐H��^000000�v";
		mes "���󒍂��܂����B";
		close;
	case 4:
		if(checkquest(5963)) {
			if(checkquest(5963)&4) {
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����̓��ʂȐH��^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>�W�N���E�X<INFO>https://rotool.gungho.jp/monster/SIEGLOUSE</INFO></URL>�@10��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����̓��ʂȐH��^000000�v";
				mes "��񍐂��܂����H";
				next;
				switch(select("�񍐂���","��߂�","")) {
				}
				delquest 5963;
				setquest 5964;
				getitem 101099,1;
				for(set '@i,0; '@i<20; set '@i,'@i+1)
					getexp 400000000,0,0;
				for(set '@i,0; '@i<20; set '@i,'@i+1)
					getexp 0,300000000,0;
				mes "[���̈���]";
				mes "���ق��I";
				mes "����̍��̎c��J�X����Ȃ����I";
				mes "�ō������I";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
				mes "���l�����܂����B";
				close;
			}
		}
		mes "[���̈���]";
		mes "���т������҂�I";
		mes "���ʂȐH���̎��������I";
		mes "^e5555e�W�N���E�X^000000��";
		mes "10�C�|���ė��Ă���B";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̓��ʂȐH��^000000�v";
		mes "<���e>";
		mes "�ΏہF<URL>�W�N���E�X<INFO>https://rotool.gungho.jp/monster/SIEGLOUSE</INFO></URL>�@10��";
		mes "�̓������󒍂��܂����H";
		next;
		if(select("�󒍂���","��߂�") == 2) {
			mes "[���̈���]";
			mes "���̐H�~��M�񂾂̂��H";
			mes "�������������z���ȁB";
			next;
			mes "^ff0000[�C���t�H���[�V����]^000000";
			mes "^ff0000�����𒆒f���܂����B^000000";
			close;
		}
		setquest 5963;
		if(checkquest(5964)&2) delquest 5964;
		mes "[���̈���]";
		mes "�����I���񂾂��I";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̓��ʂȐH��^000000�v";
		mes "���󒍂��܂����B";
		close;
	case 5:
		if(checkquest(5965)) {
			if(countitem(25507) >= 5) {
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����̂����^000000�v";
				mes "<���e>";
				mes "�A�C�e���F<ITEM>[�ؗ�ȃT���S]<INFO>25507</INFO></ITEM>�@5��";
				mes "��[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 4G ( 4000000000 )";
				mes "��200000000��20��󂯎��܂��B";
				mes "JobExp 3G ( 3000000000 )";
				mes "��150000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����̂����^000000�v";
				mes "��񍐂��܂����H";
				next;
				switch(select("�񍐂���","��߂�","")) {
				}
				delitem 25507,5;
				delquest 5965;
				setquest 5966;
				getitem 101099,1;
				for(set '@i,0; '@i<20; set '@i,'@i+1)
					getexp 200000000,0,0;
				for(set '@i,0; '@i<20; set '@i,'@i+1)
					getexp 0,150000000,0;
				mes "[���̈���]";
				mes "�����Ă����̂��H";
				mes "���ق��I���ꂾ�悱��I";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 4G";
				mes "( 4000000000 )";
				mes "��200000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 3G";
				mes "( 3000000000 )";
				mes "��150000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
				mes "���l�����܂����B";
				close;
			}
		}
		mes "[���̈���]";
		mes "���т������҂�I";
		mes "�ԐH��������Ǝ����ė����I";
		mes "^e5555e�ؗ�ȃT���S^000000��";
		mes "5���I";
		mes "�H�����ԐH���厖�Ȃ񂾁I";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̂����^000000�v";
		mes "<���e>";
		mes "�A�C�e���F<ITEM>[�ؗ�ȃT���S]<INFO>25507</INFO></ITEM>�@5��";
		mes "�̔[�i���󒍂��܂����H";
		next;
		if(select("�󒍂���","��߂�") == 2) {
			mes "[���̈���]";
			mes "���̐H�~��M�񂾂̂��H";
			mes "�������������z���ȁB";
			next;
			mes "^ff0000[�C���t�H���[�V����]^000000";
			mes "^ff0000�����𒆒f���܂����B^000000";
			close;
		}
		setquest 5965;
		if(checkquest(5966)&2) delquest 5966;
		mes "[���̈���]";
		mes "�����I���񂾂��I";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̂����^000000�v";
		mes "���󒍂��܂����B";
		close;
	case 6:
		if(checkquest(5968)) {
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�����̃y�b�g�̃~�~�b�N�̃G�T^000000�v";
			next;
			mes "^0000ff<<B>��V</B>>^000000";
			mes "BaseExp 6G ( 6000000000 )";
			mes "��300000000��20��󂯎��܂��B";
			mes "JobExp 4.5G ( 4500000000 )";
			mes "��225000000��20��󂯎��܂��B";
			next;
			mes "^0000ff<<B>��V</B>>^000000";
			mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�����̃y�b�g�̃~�~�b�N�̃G�T^000000�v";
			mes "��񍐂��܂����H";
			next;
			switch(select("�񍐂���","��߂�","")) {
			}
			delquest 5968;
			setquest 5969;
			getitem 101099,1;
			for(set '@i,0; '@i<20; set '@i,'@i+1)
				getexp 300000000,0,0;
			for(set '@i,0; '@i<20; set '@i,'@i+1)
				getexp 0,225000000,0;
			mes "[���̈���]";
			mes "�y�b�g�~�~�b�N��";
			mes "�G�T������Ă��ꂽ�悤���ȁB";
			mes "���������C�����Ȃ�悩�����B";
			next;
			mes "^0000ff<<B>��V</B>>^000000";
			mes "BaseExp 6G";
			mes "( 6000000000 )";
			mes "��300000000 BaseExp��";
			mes "�@20��󂯎��܂����B";
			next;
			mes "^0000ff<<B>��V</B>>^000000";
			mes "JobExp 4.5G";
			mes "( 4500000000 )";
			mes "��225000000 JobExp��";
			mes "�@20��󂯎��܂����B";
			next;
			mes "^0000ff<<B>��V</B>>^000000";
			mes "�A�C�e���F<ITEM>�[���}�C����@<INFO>101099</INFO></ITEM>�@1��";
			mes "���l�����܂����B";
			close;
		}
		mes "[���̈���]";
		mes "���̃y�b�g�~�~�b�N�̐H����";
		mes "�Y�ꂿ�።��I";
		mes "�G�T������Ă��Ă���I";
		mes "^e5555e���m�̋��^000000��";
		mes "�ǂ����ɂ���͂����I";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̃y�b�g�̃~�~�b�N�̃G�T^000000�v";
		mes "���󒍂��܂����H";
		next;
		if(select("�󒍂���","��߂�") == 2) {
			mes "[���̈���]";
			mes "���̐H�~��M�񂾂̂��H";
			mes "�������������z���ȁB";
			next;
			mes "^ff0000[�C���t�H���[�V����]^000000";
			mes "^ff0000�����𒆒f���܂����B^000000";
			close;
		}
		setquest 5967;
		if(checkquest(5968)&2) delquest 5968;
		mes "[���̈���]";
		mes "�����I���񂾂��I";
		next;
		mes "<<B>�N�G�X�g</B>>";
		mes "�u^ff0000�����̃y�b�g�̃~�~�b�N�̃G�T^000000�v";
		mes "���󒍂��܂����B";
		close;
	}
OnQuestInfo:
	if(checkquest(5961) || checkquest(5963) || checkquest(5965) || checkquest(5967))
		showevent 0, 2, "���̈���#240clock";
	else if(BaseLevel >= 240)
		showevent 0, 3, "���̈���#240clock";
	else
		showevent 9999,0,"���̈���#240clock";
	end;
OnInit:
	cloakonnpc;
	end;
}

aldebaran.gat,151,138,4	script	�؂₩�Ȕ�#240clock_enc	10033,{/* 7685 */
	mes "�]���̒����牽���̋C�z��������]";
	next;
	if(select("���̒��𒲂ׂ�","�����Ă���") == 2) {
		mes "�]�����Ă������]";
		close;
	}
	emotion 41;
	if(!sleep2(1000)) end;;
	misceffect 768;
	cloakonnpc;
	cloakoffnpc "���̈���#240clock_enc";
	unittalk getnpcid(0,"���̈���#240clock_enc"),"���̈��� : �����I�@�B��Ă�̂ɂ킴�킴�\�����Ƃ���񂶂�Ȃ��I";
	close;
}

aldebaran.gat,151,138,4	script	���̈���#240clock_enc	1261,{/* 7687 (cloaking)*/
	mes "[���̈���]";
	mes "�Ȃ񂾂��O�́H";
	mes "���ɉ����p���H";
	next;
	switch(select("�G���`�����g����","���ʂȐ��B������","�A�C�e������������","��߂�")) {
	case 1:
		switch(select("�O���[�v1(�Z)","�O���[�v2(����)","��������")) {
		case 1:
		case 2:
			break;
		case 3:
			mes "[���̈���]";
			mes "���Ⴀ�ȁI";
			mes "�����b��������񂶂�Ȃ����I";
			messize 180,280;
			close;
		}
		mes "[���̈���]";
		mes "�͂₭�����������I";
		mes "�ǂ�ɃG���`�����g������񂾁H";
		messize 180,280;
		next;
		mes "^ff0000�G���`�����g�Ώۂ̃A�C�e����";
		mes "�������Ă��܂���B";
		messize 180,280;
		close;
	case 2:
		mes "[���̈���]";
		mes "���ʂȐ��B������̂��H";
		mes "�͂₭�����������I";
		next;
		switch(select("���ʂȐ��B","�����𕷂�","��������")) {
		case 1:
			mes "[���̈���]";
			mes "�E�B�L�b�h�E�\���b�h�E";
			mes "�v���W�V�����V���[�Y�̐��B��";
			mes "^0000FF�u���v�̎��ԁv100��^000000��";
			mes "1�񂵂Ă��I";
			next;
			mes "[���̈���]";
			mes "^0000ff�X�ōs����^000000";
			mes "^0000ff�I���f�I�R�����g����^000000";
			mes "^0000ff���B�����������̍������B���s����B^000000";
			mes "^0000ff�������A���s���Ă��A^000000";
			mes "^0000ff�����͔j�󂳂�Ȃ����I^000000";
			next;
			mes "[���̈���]";
			mes "�������A���s������";
			mes "^FF0000���B�l���u1�v���������܂�����ȁI^000000";
			mes "�@";
			mes "^0000FF���v�̎��ԁF0��^000000";
			next;
			mes "[���̈���]";
			mes "�E�B�L�b�h�E�\���b�h�E";
			mes "�v���W�V�����V���[�Y��";
			mes "�������ĂȂ����I";
			close;
		case 2:
			mes "[���̈���]";
			mes "�E�B�L�b�h�E�\���b�h�E";
			mes "�v���W�V�����V���[�Y�̐��B��";
			mes "^0000FF�u���v�̎��ԁv100��^000000��";
			mes "���Ă��I";
			mes "�@";
			mes "<URL>�u�E�B�L�b�h�E�\���b�h�E�v���W�V�����v�V���[�Y�l���E����<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/fourth-weapon.html</INFO></URL>";
			messize 210,280;
			close;
		case 3:
			mes "[���̈���]";
			mes "���Ⴀ�ȁI";
			mes "�����b��������񂶂�Ȃ����I";
			close;
		}
	case 3:
		mes "[���̈���]";
		mes "�A�C�e���������H";
		mes "�ǂ����ɂ���񂾁H";
		next;
		switch(select("���B�l10�̑����Ō���","���B�l9�̑����Ō���","��߂�")) {
		case 1:
			mes "[���̈���]";
			mes "���B�l10���ȁH";
			mes "�ق��I";
			next;
			mes "^0000ff�ޗ��ƂȂ�A�C�e���̐��B�l�A";
			mes "^0000ff��������Ă���J�[�h��G���`�����g�A";
			mes "^0000ff�����_���I�v�V��������";
			mes "^0000ff�����p����܂���B";
			mes "^0000ff�܂��A�ΏۃA�C�e����";
			mes "^0000ff�����������Ă���ꍇ��";
			mes "^0000ff���ꂩ�̃A�C�e�����g�p����܂��B";
			next;
			//-	barter	aldebaran#callbarter	-1,620016:4294901769:0 { 620005:65546:1, 1000681:65536:1 },610035:4294901769:0 { 610015:65546:1, 1000681:65536:1 },590036:4294901765:0 { 590015:65546:1, 1000681:65536:1 },510051:4294901765:0 { 510026:65546:1, 1000681:65536:1 },550056:4294901765:0 { 550058:65546:1, 1000681:65536:1 },540042:4294901765:0 { 540043:65546:1, 1000681:65536:1 },500045:4294901765:0 { 500018:65546:1, 1000681:65536:1 },500044:4294901765:0 { 510054:65546:1, 1000681:65536:1 },21063:4294901769:0 { 600013:65546:1, 1000681:65536:1 },640031:4294901769:0 { 640013:65546:1, 1000681:65536:1 },530023:4294901765:0 { 530009:65546:1, 1000681:65536:1 },540041:4294901765:0 { 540013:65546:1, 1000681:65536:1 },550055:4294901765:0 { 550057:65546:1, 1000681:65536:1 },550054:4294901765:0 { 550059:65546:1, 1000681:65536:1 },830008:4294901775:0 { 830009:65546:1, 1000681:65536:1 },840004:4294901775:0 { 840005:65546:1, 1000681:65536:1 },820004:4294901775:0 { 820005:65546:1, 1000681:65536:1 },800009:4294901775:0 { 800010:65546:1, 1000681:65536:1 },560030:4294901765:0 { 560011:65546:1, 1000681:65536:1 },580028:4294901765:0 { 580012:65546:1, 1000681:65536:1 },700050:4294901768:0 { 700021:65546:1, 1000681:65536:1 },810005:4294901775:0 { 810006:65546:1, 1000681:65536:1 },570028:4294901765:0 { 570012:65546:1, 1000681:65536:1 },650019:4294901769:0 { 650020:65546:1, 1000681:65536:1 }	// selfpos(150, 135)
			close;
		case 2:
			mes "[���̈���]";
			mes "���B�l9���ȁH";
			mes "�ق��I";
			next;
			mes "^0000ff�ޗ��ƂȂ�A�C�e���̐��B�l�A";
			mes "^0000ff��������Ă���J�[�h��G���`�����g�A";
			mes "^0000ff�����_���I�v�V��������";
			mes "^0000ff�����p����܂���B";
			mes "^0000ff�܂��A�ΏۃA�C�e����";
			mes "^0000ff�����������Ă���ꍇ��";
			mes "^0000ff���ꂩ�̃A�C�e�����g�p����܂��B";
			next;
			//-	barter	aldebaran#callbarter	-1,620016:4294901769:0 { 620005:65545:1, 1000681:65536000:1000 },610035:4294901769:0 { 610015:65545:1, 1000681:65536000:1000 },590036:4294901765:0 { 590015:65545:1, 1000681:65536000:1000 },510051:4294901765:0 { 510026:65545:1, 1000681:65536000:1000 },550056:4294901765:0 { 550058:65545:1, 1000681:65536000:1000 },540042:4294901765:0 { 540043:65545:1, 1000681:65536000:1000 },500045:4294901765:0 { 500018:65545:1, 1000681:65536000:1000 },500044:4294901765:0 { 510054:65545:1, 1000681:65536000:1000 },21063:4294901769:0 { 600013:65545:1, 1000681:65536000:1000 },640031:4294901769:0 { 640013:65545:1, 1000681:65536000:1000 },530023:4294901765:0 { 530009:65545:1, 1000681:65536000:1000 },540041:4294901765:0 { 540013:65545:1, 1000681:65536000:1000 },550055:4294901765:0 { 550057:65545:1, 1000681:65536000:1000 },550054:4294901765:0 { 550059:65545:1, 1000681:65536000:1000 },830008:4294901775:0 { 830009:65545:1, 1000681:65536000:1000 },840004:4294901775:0 { 840005:65545:1, 1000681:65536000:1000 },820004:4294901775:0 { 820005:65545:1, 1000681:65536000:1000 },800009:4294901775:0 { 800010:65545:1, 1000681:65536000:1000 },560030:4294901765:0 { 560011:65545:1, 1000681:65536000:1000 },580028:4294901765:0 { 580012:65545:1, 1000681:65536000:1000 },700050:4294901768:0 { 700021:65545:1, 1000681:65536000:1000 },810005:4294901775:0 { 810006:65545:1, 1000681:65536000:1000 },570028:4294901765:0 { 570012:65545:1, 1000681:65536000:1000 },650019:4294901769:0 { 650020:65545:1, 1000681:65536000:1000 }	// selfpos(150, 135)
			close;
		case 3:
			mes "[���̈���]";
			mes "���Ⴀ�ȁI";
			mes "�����b��������񂶂�Ȃ����I";
			close;
		}
	case 4:
		mes "[���̈���]";
		mes "���Ⴀ�ȁI";
		mes "�����b��������񂶂�Ȃ����I";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}

clock_01.gat,37,221,2	script	�y�b�g�~�~�b�N#240clock_1	464,{/* 7179 (hide)*/
}

clock_01.gat,37,70,4	script	�y�b�g�~�~�b�N#240clock_2	464,{/* 7180 */
	if(checkquest(5968)) {
		emotion 37;
		unittalk "�y�b�g�~�~�b�N : ���߁@����",1;
		unittalk getcharid(3),strcharinfo(0)+" : �y�b�g�~�~�b�N�̓G�T��H�ׂĂ���B���̈����̂Ƃ���֖߂낤�B",1;
		end;
	}
	if(checkquest(5967)) {
		mes "�_���W�����̊O�̈�������";
		mes "���b�𗊂܂ꂽ�y�b�g�~�~�b�N���B";
		mes "�G�T���グ�悤�B";
		close2;
		emotion 37;
		unittalk "�y�b�g�~�~�b�N : ���߁@����",1;
		delquest 5967;
		setquest 5968;
		end;
	}
}
clock_01.gat,136,143,2	script	�y�b�g�~�~�b�N#240clock_3	464,{/* 7181 (hide)*/
}
clock_01.gat,37,221,2	script	�����̐�#240clock_1	550,{/* 7182 */
	unittalk getcharid(3),strcharinfo(0)+" : �����������Ղ�����B�ʂ̏ꏊ��T�����B",1;
	end;
}
clock_01.gat,37,70,4	script	�����̐�#240clock_2	550,{/* 7183 (hide)*/
	unittalk getcharid(3),strcharinfo(0)+" : �����������Ղ�����B�ʂ̏ꏊ��T�����B",1;
	end;
}
clock_01.gat,136,143,2	script	�����̐�#240clock_3	550,{/* 7184 */
	unittalk getcharid(3),strcharinfo(0)+" : �����������Ղ�����B�ʂ̏ꏊ��T�����B",1;
	end;
}

clock_01.gat,79,39,0	warp	clock_01_Out_c_tower1	2,2,c_tower1.gat,241,200
