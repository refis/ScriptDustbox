//= Auriga Script ==============================================================
// Ragnarok Online Illusion of TeddyBear Quest Script	by refis
//= Registry ===================================================================
// IL_TBEAR_QUE -> 0�`9
//==============================================================================

//------------------------------------------------------------
// ein_d02_i.gat
ein_d02_i.gat,0,0,0,0	monster	�ԐF�̃x�A�h�[��		20255,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	���F�̃x�A�h�[��		20256,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	�ΐF�̃x�A�h�[��		20257,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	���F�̃x�A�h�[��		20258,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	�F�̃x�A�h�[��		20259,14,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	�J���^�s�b�g�}��		20261,10,5000,0,0
ein_d02_i.gat,0,0,0,0	monster	�הO�̃I�u�V�f�B�A��	20263,6,5000,0,0

//@move(type: BL_MOB, ID, 8436, speed: 150, option: 0x0, class: 20255," pos: (""unknown.gat""",179,128), dir: 2," name""�ԐF�̃x�A�h�[��"")"
//@spawn(type: BL_MOB, ID, 8450, speed: 150, option: 0x0, class: 20256," pos: (""unknown.gat""",221,293), dir: 6," name""���F�̃x�A�h�[��"")"
//@spawn(type: BL_MOB, ID, 8464, speed: 150, option: 0x0, class: 20257," pos: (""unknown.gat""",240,187), dir: 4," name""�ΐF�̃x�A�h�[��"")"
//@move(type: BL_MOB, ID, 8478, speed: 150, option: 0x0, class: 20258," pos: (""unknown.gat""",258,192), dir: 3," name""���F�̃x�A�h�[��"")"
//@spawn(type: BL_MOB, ID, 8492, speed: 300, option: 0x0, class: 20259," pos: (""unknown.gat""",234,21), dir: 5," name""�F�̃x�A�h�[��"")"
//@spawn(type: BL_MOB, ID, 8506, speed: 180, option: 0x0, class: 20261," pos: (""unknown.gat""",193,236), dir: 6," name""�J���^�s�b�g�}��"")"
//@move(type: BL_MOB, ID, 8516, speed: 350, option: 0x0, class: 20263," pos: (""unknown.gat""",172,260), dir: 2," name""�הO�̃I�u�V�f�B�A��"")"

//@spawn(type: BL_MOB, ID: 96690, speed: 250, option: 0x0, class: 20262, pos: ("ein_d02_i.gat",167,160), dir: 0, name"���̔j��")
//@nomalattack(src: 20262:"���̔j��"(96690), dst: (4631724), damage: 1429, sDelay: 480, dDelay: 488, tick: 648)
//@skillnodamage(src: 20262:"���̔j��"(96690), dst: (96690), skill: "�q�[��"(28), val: 2227)
//20262,���̔j�Ё������_���A�^�b�N,attack,183,2,1000,500,5000,yes,target,always,0,,,,,,
//20262,���̔j�Ё��}�O�i���u���C�N,attack,7,10,10000,0,10000,yes,self,always,0,,,,,,32
//20262,���̔j�Ё��R���{�A�^�b�N,attack,171,4,1000,700,5000,no,target,always,0,,,,,,
//20262,���̔j�Ё��K�C�f�b�h�A�^�b�N,attack,172,1,1000,0,10000,no,target,always,0,,,,,,37
//20262,���̔j�Ё��q�[��,idle,28,5,1000,0,5000,yes,self,mystatuson,hiding,,,,,,18
//20262,���̔j�Ё��O�����g�D�[�X,idle,137,10,1000,0,700,yes,anothertarget,mystatuson,hiding,,,,,,
//20262,���̔j�Ё��n�C�f�B���O,chase,51,1,500,0,50000,yes,self,always,0,,,,,,19
//20262,���̔j�Ё��n�C�f�B���O,idle,51,1,500,0,50000,yes,self,always,0,,,,,,
//20262,���̔j�Ё����܂�,attack,149,1,500,0,5000,no,target,always,0,,,,,,6
//20262,���̔j�Ё����b�V���A�^�b�N,attack,349,3,3000,0,360000,no,self,myhpltmaxrate,30,,,,,,

einbroch.gat,149,242,5	script	�P�����ސN#ITB_001	798,5,5,{
	switch(IL_TBEAR_QUE) {
	case 0:
		mes "[�P�����ސN]";
		mes "�Ȃ�Ŗ߂��ė��Ȃ��̂���c�c";
		mes "���ق����ق��I";
		next;
		if(BaseLevel < 170) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "�N�G�X�g�u�l�W���A���鍑�̉A�d�v��";
			mes "BaseLv170�ȏ�Ői�s�\�ł��B^000000";
			close;
		}
		mes "[�P�����ސN]";
		mes "���ق��c�c���ق��c�c���ق��c�c";
		mes "�͂��͂��c�c���������āA";
		mes "�����N�������̂��c�c�H";
		next;
		mes "[�P�����ސN]";
		mes "���ڍs���Ċm�F���Ȃ�����c�c";
		mes "���ق����ق�";
		mes "���c�c�فc�c���I";
		next;
		if(select("�N�ɐ���������","��������") == 2) {
			mes "[�P�����ސN]";
			mes "�c�c���ق��c�c";
			mes "���ق��فc�c���ق��B";
			close;
		}
		mes "[�P�����ސN]";
		mes "���ق��c�c";
		mes "�d���ōz�R�ɍs�����F�l���A";
		mes "�܂��A���ė��Ȃ��āc�c";
		mes "���ق����ق��B";
		next;
		mes "[�P�����ސN]";
		mes "�����O�A�d�����I����Ă����c�c";
		mes "�[�i���c�c���ق��c�c";
		mes "�A���ė���ƌ����āA�o�������̂Ɂc�c";
		mes "�����ɋA���āc�c���ق��c�c�܂���B";
		next;
		mes "[�P�����ސN]";
		mes "���فc�c���ق����ق��c�c����";
		mes "�x�����ɂ����k���Ă݂܂������c�c���فc�c";
		mes "�҂������łǂ����Ŏ������";
		mes "�Ԃ�Ă�񂶂�Ȃ����ƁA";
		mes "���ق����ق��c�c";
		mes "�^�ʖڂɕ����Ă���܂��񂵁c�c�B";
		next;
		mes "[�P�����ސN]";
		mes "^0000ff�X�e�B�[�u��^000000�́A";
		mes "����ȓz���Ⴀ��܂���c�c���ق���";
		mes "�����ɘA�����Ȃ��̂́A";
		mes "�����Ɖ����Ɋ������܂ꂽ��ł���B";
		next;
		setquest 11556;
		set IL_TBEAR_QUE,1;
		mes "[�P�����ސN]";
		mes "�m��^0000ff�A�C���x�t�̍z�R^000000��";
		mes "�s���ƌ����܂����B";
		mes "���̎��ӂ�T���΁A";
		mes "�Ȃɂ��́c�c�肪�����͂߂�Ǝv���܂��B";
		next;
		mes "�]�z�R�_���W���� 01��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 1:
		mes "[�P�����ސN]";
		mes "�����O�A�d�����I����Ă����c�c";
		mes "�[�i���c�c���ق��c�c";
		mes "�A���ė���ƌ����āA�o�������̂Ɂc�c";
		mes "�����ɋA���āc�c���ق��c�c�܂���B";
		next;
		mes "[�P�����ސN]";
		mes "���فc�c���ق����ق��c�c����";
		mes "�x�����ɂ����k���Ă݂܂������c�c���فc�c";
		mes "�҂������łǂ����Ŏ������";
		mes "�Ԃ�Ă�񂶂�Ȃ����ƁA";
		mes "���ق����ق��c�c";
		mes "�^�ʖڂɕ����Ă���܂��񂵁c�c�B";
		next;
		mes "[�P�����ސN]";
		mes "^0000ff�X�e�B�[�u��^000000�́A";
		mes "����ȓz���Ⴀ��܂���c�c���ق���";
		mes "�����ɘA�����Ȃ��̂́A";
		mes "�����Ɖ����Ɋ������܂ꂽ��ł���B";
		next;
		mes "[�P�����ސN]";
		mes "�m��^0000ff�A�C���x�t�̍z�R^000000��";
		mes "�s���ƌ����܂����B";
		mes "���̎��ӂ�T���΁A";
		mes "�Ȃɂ��́c�c�肪�����͂߂�Ǝv���܂��B";
		next;
		mes "�]�z�R�_���W���� 01��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 2:
	case 3:
	case 4:
		mes "[�P�����ސN]";
		mes "���ق����ق��c�c";
		mes "�X�e�B�[�u���́c�c���ق�";
		mes "������܂������H";
		next;
		mes "�]�z�R�_���W���� 01��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 5:
		mes "[�T��]";
		mes "���ق����ق��c�c";
		mes "�X�e�B�[�u���́c�c���ق�";
		mes "������܂������H";
		next;
		menu "�󂯎����������n��",-;
		mes "[�T��]";
		mes "�c�c";
		mes "���ق��فc�c";
		mes "��������������ł��ˁH";
		next;
		mes "[�T��]";
		mes "�������Ȃ��̂ɁA";
		mes "������������͂�������܂���B";
		mes "���ق��ق��ق��I";
		next;
		mes "[�T��]";
		mes "�����c�c���فc�c���ڍs���Ȃ���c�c";
		mes "���ق��ق��c�c�Ȃ�܂���B";
		mes "�厖�ȗF�B���c�c���ق��c�c";
		mes "��@�Ɋׂ��������m��Ȃ��̂ɁA";
		mes "�����Ƃ��Ă����܂���I";
		mes "�c�c���ق��ق����ق��I";
		next;
		setquest 11561;
		delquest 11560;
		set IL_TBEAR_QUE,6;
		mes "[�T��]";
		mes "���ق��فc�c�`���҂��܁c�c���ق��c�c";
		mes "����A��čs���Ă��������I";
		mes "���肢���܂��I";
		next;
		mes "�]�z�R�_���W���� 01��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 6:
	case 7:
	case 8:
		mes "[�T��]";
		mes "�������Ȃ��̂ɁA";
		mes "������������͂�������܂���B";
		mes "���ق��ق��ق��B";
		next;
		mes "[�T��]";
		mes "�����c�c���فc�c���ڍs���Ȃ���c�c";
		mes "���ق��ق��c�c�Ȃ�܂���B";
		mes "�厖�ȗF�B���c�c���ق��c�c";
		mes "��@�Ɋׂ��������m��Ȃ��̂ɁA";
		mes "�����Ƃ��Ă����܂���I";
		mes "�c�c���ق��ق����ق��I";
		next;
		mes "[�T��]";
		mes "���ق��فc�c�`���҂��܁c�c���ق��c�c";
		mes "����A��čs���Ă��������I";
		mes "���肢���܂��I";
		next;
		mes "�]�z�R�_���W���� 01��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "ein_dun01.gat", 195, 76;
		end;
	case 9:
		mes "[�T��]";
		mes "����ȗ��A�z�R�ɍs���@�";
		mes "�������̂ł����A";
		mes "�P�������āA�̂����C�ɂȂ�܂����B";
		mes "�z�R����������C�Ȃ�āB";
		next;
		mes "[�T��]";
		mes "�c�c���ق��B����H";
		mes "�܂��P�������Ȃ�Ȃ�������";
		mes "�z�R�ɍs���������ǂ������ł��B";
		mes "�X�e�B�[�u�����S�z�ł����ˁB";
		mes "�����ł�����o����̂�";
		mes "�`���҂��܂��ꏏ�ɍs���܂����H";
		next;
		if(select("�s��","�s���Ȃ�") == 2) {
			mes "[�T��]";
			mes "�K�v�Ȏ��͌����Ă��������B";
			close;
		}
		mes "[�T��]";
		mes "����ł͌��n���U�ŁB";
		mes "�c�c���ق��B";
		close2;
		warp "ein_dun01.gat", 189, 80;
		end;
	}
OnTouch:
	if(IL_TBEAR_QUE < 9)
		unittalk "�P�����ސN : ���ق����ق��I�I",1;
	end;
}

ein_dun01.gat,198,79,3	script	�x�A�h�[��#ITB_002	10290,{
	switch(IL_TBEAR_QUE) {
	case 1:
		mes "[�x�A�h�[��]";
		mes "�������Ƃ������ƁI";
		mes "����ŕ���ŁI";
		mes "�e�L�p�L�����āI";
		next;
		menu "�Ȃ�����ł���́H",-;
		mes "[�x�A�h�[��]";
		mes "�ȂɁI";
		mes "����ȏd��Ȕ閧��";
		mes "�ꌩ����̃L�~��";
		mes "������Ƃł��v�����H";
		next;
		mes "[�x�A�h�[��]";
		mes "����Ȃɒm�肽���Ȃ�A";
		mes "�l�̌��ɕ����";
		mes "���ԂɂȂ�܂ő҂��ȁI";
		next;
		mes "[�x�A�h�[��]";
		mes "���Ƃ����̂́A";
		mes "�^�_�Ŏ�ɓ�����̂ł͂Ȃ��̂���B";
		mes "�S�����ԂƘJ�͂��c�c�B";
		next;
		emotion 23,"";
		emotion 23,"�x�A�h�[��#ITB_002";
		misceffect 183,"�傫�Ȍ�#ITB_011";
		mes "[�H�H�H�H]";
		mes "���������������I";
		mes "�͂Ȃ��[�[�I";
		mes "���̃��R���R�N�}��Y�߁I";
		next;
		setquest 11557;
		delquest 11556;
		set IL_TBEAR_QUE,2;
		mes "�]��̈�ԑO�̕�����";
		mes "�@�j�̋��ѐ�����������";
		mes "�@�O�̏󋵂��m�F���Ă݂悤�]";
		close;
	case 2:
		unittalk getcharid(3),strcharinfo(0)+" : �]��̈�ԑO�̕�����j�̋��ѐ�����������B�O�̏󋵂��m�F���Ă݂悤�]",1;
		end;
	default:
		switch(rand(3)) {
		case 0: unittalk "�x�A�h�[�� : �������Ƃ������ƁI",1;	break;
		case 1: unittalk "�x�A�h�[�� : ����ŕ���ŁI",1;	break;
		case 2: unittalk "�x�A�h�[�� : �e�L�p�L�����āI",1;	break;
		}
		end;
	}
}

ein_dun01.gat,189,85,7	script	�x�A�h�[��#ITB_003	10290,{
	switch(IL_TBEAR_QUE) {
	case 2:
		mes "[�x�A�h�[��]";
		mes "�ȁc�c�Ȃɂ��N���������āH";
		mes "��ɑO�ɕ���ł����j��";
		mes "�������r�[�A���ѐ������������񂾁B";
		next;
		menu "�ǂ�Ȓj�������H",-;
		mes "[�x�A�h�[��]";
		mes "�ȂɁH";
		mes "����Ȃ̃L�~�A";
		mes "�o���Ă�킯�������낤�I";
		next;
		mes "[�x�A�h�[��]";
		mes "�c�c�B";
		next;
		mes "[�x�A�h�[��]";
		mes "�Ӂc�c�ӂށc�c�B";
		mes "�ǂ����Ă��m�肽����΁A";
		mes "�L�~�����ɓ����Ċm�F�����";
		mes "�����񂶂�Ȃ����H";
		mes "���ʂɑO�ɓ���̂������悤�B";
		next;
		setquest 11558;
		delquest 11557;
		set IL_TBEAR_QUE,3;
		mes "[�x�A�h�[��]";
		mes "���c�c�����ĕ|���Ȃ����󂶂�Ȃ����I";
		mes "�l�͂����A�����ɋ}���ł܂�";
		mes "�m�F����K�v���Ȃ���";
		mes "�v���Ă��邾�����B";
		close;
	case 3:
		mes "[�x�A�h�[��]";
		mes "�ǂ����Ă��m�肽����΁A";
		mes "�L�~�����ɓ����Ċm�F�����";
		mes "�����񂶂�Ȃ����H";
		mes "���ʂɑO�ɓ���̂������悤�B";
		next;
		mes "[�x�A�h�[��]";
		mes "���c�c�����ĕ|���Ȃ����󂶂�Ȃ����I";
		mes "�l�͂����A�����ɋ}���ł܂�";
		mes "�m�F����K�v���Ȃ���";
		mes "�v���Ă��邾�����B";
		close;
	default:
		unittalk "�x�A�h�[�� : �ӂӁA���������Ŗl�̔Ԃ��B",1;
		end;
	}
}

ein_dun01.gat,189,83,7	script	�x�A�h�[��#ITB_004	10290,{
	unittalk "�x�A�h�[�� : �����A�����I���荞�ނȁI",1;
	end;
}

ein_dun01.gat,189,81,1	script	�x�A�h�[��#ITB_005	10290,{
	unittalk "�x�A�h�[�� : ����ł邩�獡�Z�����́I",1;
	end;
}

ein_dun01.gat,190,80,7	script	�x�A�h�[��#ITB_006	10290,{
	unittalk "�x�A�h�[�� : ���ו��ׁ[�I",1;
	end;
}

ein_dun01.gat,191,80,1	script	�x�A�h�[��#ITB_007	10290,{
	unittalk "�x�A�h�[�� : ���̏ꏊ����ĂĂ���܂��񂩁B",1;
	end;
}

ein_dun01.gat,193,80,7	script	�x�A�h�[��#ITB_008	10290,{
	unittalk "�x�A�h�[�� : �����o����������񂾁c�c�B",1;
	end;
}

ein_dun01.gat,195,80,5	script	����ł���j#ITB_009	854,{
	if(IL_TBEAR_QUE == 9 || BaseLevel < 170) {
		unittalk "����ł���j : �O�ɉ�������̂��m�肽���ĕ���ł���񂾁B",1;
		end;
	}
	else if(IL_TBEAR_QUE == 0) {
		mes "[����ł���j]";
		mes "����͂Ȃ�̍s�񂾂Ǝv���H";
		mes "�O�̕��ŕ���ł����j��";
		mes "^0000ff�A�C���u���b�N^000000���痈������������";
		mes "�s���Ă݂��";
		mes "���̍s�񂩂͕�����̂�������Ȃ��B";
		next;
		mes "[����ł���j]";
		mes "�����܂��A���͂��ꂪ���̍s�񂩒m�肽����";
		mes "�����܂ŕ���ł��܂��Ă��邩��A";
		mes "�����Ӓn�ł�";
		mes "��𔲂������͂Ȃ����ǂˁB";
		close;
	}
	mes "[����ł���j]";
	mes "�݂�Ȃ����ɕ���ł邩��";
	mes "��������ł݂��񂾁B";
	mes "�O�ɉ������邩���āH";
	mes "�����H�@�����m�肽���ĕ���ł邩��ˁc�c�B";
	close;
}

ein_dun01.gat,196,80,1	script	�x�A�h�[��#ITB_010	10290,{
	unittalk "�x�A�h�[�� : �O�A�i�񂾂���l�߂Ă�[�B",1;
	end;
}

ein_dun01.gat,189,87,3	script	�傫�Ȍ�#ITB_011	10043,{
	if(IL_TBEAR_QUE < 3) {
		mes "�]���ւƑ�����������";
		mes "�@�^���ÂŒ���";
		mes "�@��������ł͌����Ȃ��]";
		close;
	}
	mes "�]�z�R�̉��ւƑ����ł��낤";
	mes "�@�傫�Ȍ�������";
	mes "�@�^���ÂŒ���";
	mes "�@��������ł͌����Ȃ��]";
	next;
	if(IL_TBEAR_QUE == 3) {
		mes "�]�X�e�B�[�u����";
		mes "�@���̐�ɂ��邩������Ȃ�";
		mes "�@���ւƐi��ł݂悤�]";
		next;
	}
	if(select("��э���","��������") == 2) {
		mes "�]���̏ꂩ�痧���������]";
		close;
	}
	if(IL_TBEAR_QUE < 9)
		warp "ein_d02_i_q.gat", 168, 197;
	else
		warp "ein_d02_i.gat", 168, 197;
	end;
}

ein_d02_i_q.gat,161,189,3	script	��w�ւƑ�����#ITB_012	10043,{
	mes "�]�u�z�R�_���W���� 01�v��";
	mes "�@�߂�܂����H�]";
	next;
	if(select("�߂�","��������") == 2) {
		mes "�]���̏ꂩ�痧���������]";
		close;
	}
	warp "ein_dun01.gat", 189, 80;
	end;
}
ein_d02_i_q.gat,170,193,5	script	�X�e�B�[�u��#ITB_013	98,7,7,{
	switch(IL_TBEAR_QUE) {
	case 3:
		unittalk "�X�e�B�[�u���F����A�́E�ȁE���[�[�I���̃��R���R�N�}��Y�I",1;
		cloakoffnpc "���F�̃x�A�h�[��#ITB_014";
		cloakoffnpc "�x�A�h�[��#ITB_015";
		mes "[�X�e�B�[�u��]";
		mes "����A�́E�ȁE���[�[�I";
		mes "���̃��R���R�N�}��Y�I";
		next;
		setquest 11559;
		delquest 11558;
		set IL_TBEAR_QUE,4;
		unittalk getnpcid(0,"���F�̃x�A�h�[��#ITB_014"),"���F�̃x�A�h�[�� : �����I�o�����I�@�o�����I",1;
		unittalk getnpcid(0,"�x�A�h�[��#ITB_015"),"�x�A�h�[�� : ������I",1;
		mes "[���F�̃x�A�h�[��]";
		mes "�����I";
		mes "�o�����I�@�o�����I";
		mes "�@";
		mes "[�x�A�h�[��]";
		mes "������I";
		if(!sleep2(3000)) end;
		close2;
		cloakonnpc "���F�̃x�A�h�[��#ITB_014";
		cloakonnpc "�x�A�h�[��#ITB_015";
		end;
	case 4:
		mes "[�X�e�B�[�u��]";
		mes "�Ȃ񂾂�����";
		mes "����́c�c�B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���[���I";
		mes "�����̂��񂽁I";
		mes "���񂽂�������ȁH";
		mes "���������R���R��������c�c";
		next;
		menu "�X�e�B�[�u������ł����H",-;
		mes "[�X�e�B�[�u��]";
		mes "����H";
		mes "�A�C���u���b�N�ŊP�����ޓz���A";
		mes "����T���Ă���ƌ��������āH";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�T���̓z���c�c";
		mes "�d������A��r����";
		mes "���̐����s��������ĂȁB";
		mes "�y�����Ă���A����肾�����񂾂��A";
		mes "�C�ɂȂ��ĕ���ł��܂����񂾁B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���юn�߂�Ɨ����ɗ�����Ȃ�����H";
		mes "������A����������ł悤�₭";
		mes "���̔Ԃ����āA";
		mes "�傫�Ȍ��ɓ���Ɓc�c�C�t����";
		mes "�������̃��R���R��";
		mes "�A��čs���ꂻ���ɂȂ��Ă����񂾁B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�����A���āA������";
		mes "�a�@�ɍs�����Ȃ���Ȃ�Ȃ����ǁc�c";
		mes "�������𗣂��킯�ɂ́c�c�B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���[��c�c";
		mes "�ǂ��������̂��c�c�B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�c�c�B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���񂽁A";
		mes "�ЂƂ��܂�Ă���Ȃ����H";
		mes "���������͕a�@�̓������A";
		mes "����������Ȃ��͂��Ȃ񂾁B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���͂����ł�������";
		mes "���ׂ������Ƃ����邩��A";
		mes "�T���ɂ��̂�����n���Ă���B";
		mes "���łɉ��͑��v����";
		mes "�`���Ă�����B";
		next;
		setquest 11560;
		delquest 11559;
		set IL_TBEAR_QUE,5;
		mes "[�X�e�B�[�u��]";
		mes "���񂾂��B";
		mes "���͎������킹�͂Ȃ����A";
		mes "��ŉ������Ԃ��͂��邩��B";
		next;
		mes "�]�P�����ސN�̖��O��";
		mes "�@�T���Ƃ����炵���]";
		next;
		mes "�]�T���̂Ƃ���֖߂�܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "einbroch.gat", 155, 242;
		end;
	case 5:
		mes "[�X�e�B�[�u��]";
		mes "���񂽁A";
		mes "�ЂƂ��܂�Ă���Ȃ����H";
		mes "���������͕a�@�̓������A";
		mes "����������Ȃ��͂��Ȃ񂾁B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���͂����̎d����";
		mes "�Еt���Ȃ���Ȃ�Ȃ�����B";
		mes "�T���ɂ��̂�����n���Ă���B";
		mes "���łɉ��͑��v����";
		mes "�`���Ă�����B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���񂾂��B";
		mes "���͎������킹�͂Ȃ����A";
		mes "��ŉ������Ԃ��͂��邩��B";
		next;
		mes "�]�T���̂Ƃ���֖߂�܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "einbroch.gat", 155, 242;
		end;
	case 6:
		cloakonnpc "�T��#ITB_016";
		mes "[�X�e�B�[�u��]";
		mes "�T���ɂ�����";
		mes "�n���Ă��ꂽ���H";
		mes "�����f���ɕa�@�ɍs�����̂��H";
		next;
		cloakoffnpc "�T��#ITB_016";
		unittalk getnpcid(0,"�T��#ITB_016"),"�T�� : �X�e�B�[�u���I",1;
		mes "[�T��]";
		mes "�X�e�B�[�u���I";
		mes "�l��S�z�����Ă����ĉ����c�c�I";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�c�c�T���H";
		mes "���O�Ȃ�ŗ����񂾁I";
		mes "�a�@�ւ͍s���Ȃ������̂��H";
		next;
		mes "[�T��]";
		mes "���A�����a�@�֍s���ׂ������H�I";
		mes "��k����Ȃ��I";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�����c�c";
		mes "�킩�����c�c�킩������I";
		mes "���������Ă���B";
		next;
		setquest 11562;
		delquest 11561;
		set IL_TBEAR_QUE,7;
		mes "[�X�e�B�[�u��]";
		mes "�c�c�c�c�H";
		mes "�����k�̕�����";
		mes "�b��������������悤�����B";
		mes "���ɍs���Ă݂邩�H";
		viewpoint 1, 135, 241, 1, 0xFF0000;
		next;
		mes "�]�b�����̂���ꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "ein_d02_i_q.gat", 135, 238;
		end;
	case 7:
		mes "[�X�e�B�[�u��]";
		mes "�c�c�c�c�H";
		mes "�����k�̕�����";
		mes "�b��������������悤�����B";
		mes "���ɍs���Ă݂邩�H";
		viewpoint 1, 135, 241, 1, 0xFF0000;
		next;
		mes "�]�b�����̂���ꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���Ȃ��͎v���Ƃǂ܂����]";
			close;
		}
		warp "ein_d02_i_q.gat", 135, 238;
		end;
	case 8:
		mes "[�X�e�B�[�u��]";
		mes "�ӂ��c�c";
		mes "�z��͎T�������H";
		next;
		cloakoffnpc "�T��#ITB_016";
		mes "[�T��]";
		mes "���̃N�}�̂ʂ������";
		mes "�N���Ƃ��c�c���������̂��Ƃ�";
		mes "�l�W���A�����Ƃ������Ă���ȁH";
		next;
		mes "[�X�e�B�[�u��]";
		mes "��̉����ǂ��Ȃ��Ă₪��c�c";
		mes "�킯���킩���c�c�B";
		next;
		menu "���̃N�}�̂ʂ�����݂͈�́H",-;
		mes "[�T��]";
		mes "����́A�X�e�B�[�u����";
		mes "�u�Ƃł�������������Ƃ��������I�v";
		mes "�ƁA�����󂯂Ă������E�̐��ʕ��ł��B";
		next;
		mes "[�T��]";
		mes "��Ƃ̊��ɕ�V���ǂ����邵�A";
		mes "�[�i����ꏊ���z�R�������̂ŁA";
		mes "���������玄�͒f��悤�Ɍ�������ł����c�c�B";
		next;
		mes "[�T��]";
		mes "���̃o�J�͊���";
		mes "�����󂯂ė�����ł���B";
		next;
		unittalk "�X�e�B�[�u�� : �o�J�Ƃ͉����I",1;
		mes "[�X�e�B�[�u��]";
		mes "�o�J�Ƃ͉����I";
		mes "�������ŕa�@����҂��ŁA���O�̊P���c�c";
		mes "����c�c���������΂��O�P���ĂȂ����H";
		next;
		unittalk getnpcid(0,"�T��#ITB_016"),"�T�� : ���c�c�H",1;
		mes "[�T��]";
		mes "���c�c�H";
		mes "�����Ă݂�ƁA";
		mes "�ċz���y�ɂȂ����悤�ȁc�c�B";
		mes "�a�@�ɂ�����ʂ��Ă��A";
		mes "�S�R�ǂ��Ȃ�Ȃ��Ǝv������c�c";
		mes "�܂����A�P�ɋ�C���������������c�c�H";
		next;
		unittalk "�X�e�B�[�u�� : �z�R����������C�Ȃ�āc�c�B",1;
		mes "[�X�e�B�[�u��]";
		mes "�z�R����������C�Ȃ�āc�c�B";
		next;
		mes "[�T��]";
		mes "����A���͂���ǂ��낶��Ȃ��c�c";
		mes "���B�̍�����ʂ�����݂��A";
		mes "�����ē����Ă�񂾂�I";
		mes "�������A�N�͊댯�Ȗڂɑ������񂾂�I�H";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�m���ɕ߂܂肻���ɂȂ������B";
		mes "�����A���B���[�i�����ʂ�����݂�";
		mes "�����Ƃ�ł��Ȃ����Ƃ�";
		mes "��ĂĂ�悤�������B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�ʓ|���������A";
		mes "���̗ǂ�����d�����󂯂�";
		mes "���Ƃ��O�͂��Ȃ��ƂȁB";
		mes "���͂������������Ɏc����";
		mes "�������Ă݂邱�Ƃɂ��邺�B";
		mes "�T���I���O�͈�U���֖߂��Ă���B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		setquest 202100;
		delquest 11563;
		set IL_TBEAR_QUE,9;
		getitem 25271,10;
		getexp 300000000,0,1;
		getexp 0,60000000,0;
		mes "[�X�e�B�[�u��]";
		mes "���񂽂���`���Ă���Ă��肪�Ƃ��B";
		mes "����ƌ����Ă͉������A";
		mes "�O�������������z�΂��������B";
		mes "���܂茩�����Ȃ��z�΂�����";
		mes "�����Ɖ��l�̂�����̂��Ǝv���񂾁B";
		mes "���ꂶ�Ⴀ�O�܂ő��邺�B";
		close2;
	case 9:
		warp "ein_dun01.gat", 189, 80;
		end;
	}
OnTouch:
	if(IL_TBEAR_QUE == 3) {
		unittalk "�X�e�B�[�u���F����A�́E�ȁE���[�[�I���̃��R���R�N�}��Y�I",1;
		cloakoffnpc "���F�̃x�A�h�[��#ITB_014";
		cloakoffnpc "�x�A�h�[��#ITB_015";
		mes "[�X�e�B�[�u��]";
		mes "����A�́E�ȁE���[�[�I";
		mes "���̃��R���R�N�}��Y�I";
		next;
		setquest 11559;
		delquest 11558;
		set IL_TBEAR_QUE,4;
		unittalk getnpcid(0,"���F�̃x�A�h�[��#ITB_014"),"���F�̃x�A�h�[�� : �����I�o�����I�@�o�����I",1;
		unittalk getnpcid(0,"�x�A�h�[��#ITB_015"),"�x�A�h�[�� : ������I",1;
		mes "[���F�̃x�A�h�[��]";
		mes "�����I";
		mes "�o�����I�@�o�����I";
		mes "�@";
		mes "[�x�A�h�[��]";
		mes "������I";
		if(!sleep2(3000)) end;
		close2;
	}
	cloakonnpc "���F�̃x�A�h�[��#ITB_014";
	cloakonnpc "�x�A�h�[��#ITB_015";
	end;
}
ein_d02_i_q.gat,169,193,5	script	���F�̃x�A�h�[��#ITB_014	10292,{
	end;
OnInit:
	cloakonnpc;
	end;
}
ein_d02_i_q.gat,171,193,3	script	�x�A�h�[��#ITB_015	10290,{
	end;
OnInit:
	cloakonnpc;
	end;
}
ein_d02_i_q.gat,172,192,1	script	�T��#ITB_016	798,{
	if(IL_TBEAR_QUE == 7 || IL_TBEAR_QUE == 8) {
		mes "[�T��]";
		mes "�X�e�B�[�u����";
		mes "���ɂł����˂����ނ���";
		mes "�����͎����̐S�z�����ė~�����ł���B";
		close;
	}
	cloakonnpc;
	end;
OnInit:
	cloakonnpc;
	end;
}

ein_d02_i_q.gat,134,240,7	script	�X�e�B�[�u��#ITB_017	98,{
	if(IL_TBEAR_QUE == 8) {
		mes "[�X�e�B�[�u��]";
		mes "�����I";
		mes "�������߂���B";
		mes "������܂ő����ē����邼�I";
		close2;
		cloakonnpc "�X�e�B�[�u��#ITB_017";
		cloakonnpc "�T��#ITB_018";
		cloakonnpc "�H�H�H�H#ITB_019";
		cloakonnpc "�H�H�H�H#ITB_021";
		cloakonnpc "�H�H�H�H#ITB_022";
		cloakonnpc "�H�H�H�H#ITB_023";
		cloakonnpc "�H�H�H�H#ITB_024";
		cloakonnpc "�H�H�H�H#ITB_025";
		cloakonnpc "�H�H�H�H#ITB_026";
		cloakonnpc "�H�H�H�H#ITB_027";
		cloakonnpc "�H�H�H�H#ITB_028";
		cloakonnpc "�H�H�H�H#ITB_029";
		cloakonnpc "�H�H�H�H#ITB_030";
		cloakonnpc "�H�H�H�H#ITB_031";
		cloakonnpc "�H�H�H�H#ITB_032";
		cloakonnpc "�H�H�H�H#ITB_033";
		cloakonnpc "�H�H�H�H#ITB_034";
		cloakonnpc "�H�H�H�H#ITB_035";
		cloakonnpc "�H�H�H�H#ITB_036";
		cloakonnpc "�H�H�H�H#ITB_037";
		cloakonnpc "�H�H�H�H#ITB_038";
		cloakonnpc "�H�H�H�H#ITB_039";
		cloakonnpc "�H�H�H�H#ITB_040";
		cloakonnpc "�H�H�H�H#ITB_041";
		warp "ein_d02_i_q.gat", 168, 197;
		end;
	}
	else {
		mes "�]���A�ɉB�ꂽ�]";
		next;
		warp "ein_d02_i_q.gat", 135, 235;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}
ein_d02_i_q.gat,133,238,7	script	�T��#ITB_018	798,{
	mes "�]���A�ɉB�ꂽ�]";
	next;
	warp "ein_d02_i_q.gat", 135, 235;
	end;
OnInit:
	cloakonnpc;
	end;
}
ein_d02_i_q.gat,142,244,3	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_019	10291
ein_d02_i_q.gat,141,244,5	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_020	10294
ein_d02_i_q.gat,141,244,5	script	�H�H�H�H#ITB_021	10293,{
	end;
OnInit:
	cloakonnpc;
	end;
}
ein_d02_i_q.gat,140,244,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_022	10292
ein_d02_i_q.gat,141,240,5	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_023	10290
ein_d02_i_q.gat,139,240,5	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_024	10292
ein_d02_i_q.gat,140,238,5	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_025	10290
ein_d02_i_q.gat,144,237,5	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_026	10292
ein_d02_i_q.gat,145,243,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_027	10293
ein_d02_i_q.gat,142,237,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_028	10290
ein_d02_i_q.gat,140,236,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_029	10292
ein_d02_i_q.gat,142,243,1	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_030	10290
ein_d02_i_q.gat,144,242,3	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_031	10290
ein_d02_i_q.gat,144,240,1	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_032	10290
ein_d02_i_q.gat,141,246,5	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_033	10292
ein_d02_i_q.gat,141,237,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_034	10290
ein_d02_i_q.gat,141,242,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_035	10293
ein_d02_i_q.gat,147,240,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_036	10290
ein_d02_i_q.gat,145,238,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_037	10290
ein_d02_i_q.gat,147,238,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_038	10290
ein_d02_i_q.gat,141,241,7	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_039	10293
ein_d02_i_q.gat,145,241,1	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_040	10290
ein_d02_i_q.gat,140,243,5	duplicate(�T��#ITB_018)	�H�H�H�H#ITB_041	10290
ein_d02_i_q.gat,135,241,0	script	#ITB_042	139,4,5,{
	if(IL_TBEAR_QUE != 7)
		end;
	cloakoffnpc "�H�H�H�H#ITB_019";
	cloakoffnpc "�H�H�H�H#ITB_020";
	cloakonnpc "�H�H�H�H#ITB_021";
	cloakoffnpc "�H�H�H�H#ITB_022";
	cloakoffnpc "�H�H�H�H#ITB_023";
	cloakoffnpc "�H�H�H�H#ITB_024";
	cloakoffnpc "�H�H�H�H#ITB_025";
	cloakoffnpc "�H�H�H�H#ITB_026";
	cloakoffnpc "�H�H�H�H#ITB_027";
	cloakoffnpc "�H�H�H�H#ITB_028";
	cloakoffnpc "�H�H�H�H#ITB_029";
	cloakoffnpc "�H�H�H�H#ITB_030";
	cloakoffnpc "�H�H�H�H#ITB_031";
	cloakoffnpc "�H�H�H�H#ITB_032";
	cloakoffnpc "�H�H�H�H#ITB_033";
	cloakoffnpc "�H�H�H�H#ITB_034";
	cloakoffnpc "�H�H�H�H#ITB_035";
	cloakoffnpc "�H�H�H�H#ITB_036";
	cloakoffnpc "�H�H�H�H#ITB_037";
	cloakoffnpc "�H�H�H�H#ITB_038";
	cloakoffnpc "�H�H�H�H#ITB_039";
	cloakoffnpc "�H�H�H�H#ITB_040";
	cloakoffnpc "�H�H�H�H#ITB_041";
	unittalk getnpcid(0,"�H�H�H�H#ITB_019"),"�H�H�H�H : ���͂͂͂͂͂͂͂́I�I�I",1;
	mes "[�H�H�H�H]";
	mes "���͂͂͂͂͂͂͂́I�I�I";
	mes "����A�����Ȃ����I�I";
	mes "���ɉ�X��";
	mes "���j�̕\����ɗ����������̂��I";
	next;
	unittalk getnpcid(0,"�H�H�H�H#ITB_019"),"�H�H�H�H : �Â��Ď������n���Ɏ���ꂽ�A���J�I�ȉߋ��͖Y��A",1;
	mes "[�H�H�H�H]";
	mes "�Â��Ď������n���Ɏ���ꂽ�A";
	mes "���J�I�ȉߋ��͖Y��A";
	next;
	unittalk getnpcid(0,"�H�H�H�H#ITB_019"),"�H�H�H�H : ���̒n���I�I",1;
	mes "[�H�H�H�H]";
	mes "���̒n���I�I";
	next;
	unittalk getnpcid(0,"�H�H�H�H#ITB_019"),"�H�H�H�H : ���̐��E���I�I",1;
	mes "[�H�H�H�H]";
	mes "���̐��E���I�I";
	next;
	unittalk getnpcid(0,"�H�H�H�H#ITB_019"),"�H�H�H�H : ���l�W���A���̎x�z���ɂ����A���̓��܂ŁI�I",1;
	mes "[�H�H�H�H]";
	mes "���l�W���A���̎x�z���ɂ����A";
	mes "���̓��܂ŁI�I";
	next;
	unittalk getnpcid(0,"�H�H�H�H#ITB_019"),"�H�H�H�H : �N�����~�߂邱�Ƃ͂Ȃ����낤�I",1;
	mes "[�H�H�H�H]";
	mes "�N�����~�߂邱�Ƃ͂Ȃ����낤�I";
	next;
	mes "[�l�W���A���H�H]";
	mes "�����I�V�����ߑオ�͂����I";
	mes "���̋󋕂ȃ{�f�B��";
	mes "�_���ȗ���(�R�A)��A���t����I";
	next;
	mes "[�H�H�H�H]";
	mes "�h���C�r�E�X�I����������I�I";
	next;
	emotion 52,"�H�H�H�H#ITB_022";
	mes "[�h���C�r�E�X]";
	mes "�͂��I�I�c��É��A������ɁI�I";
	next;
	mes "[�l�W���A���G���y���[]";
	mes "�����c�c����I";
	mes "���̙z�X�����������p���c�c�B";
	close2;
	misceffect 99,"�H�H�H�H#ITB_020";
	cloakonnpc "�H�H�H�H#ITB_020";
	cloakoffnpc "�H�H�H�H#ITB_021";
	unittalk getnpcid(0,"�H�H�H�H#ITB_019"),"�l�W���A���G���y���[ : �c�c�����c�c�����c�c�I",1;
	if(!sleep2(1000)) end;
	mes "[�l�W���A���G���y���[]";
	mes "����I�I";
	mes "���}����I";
	mes "�V�������܂ꂽ�E���Ȑ�m���I�I";
	next;
	mes "[�l�W���A��]";
	mes "�Ȃ�ƁI�f���炵���Ȑ����I�I";
	next;
	mes "[�l�W���A��]";
	mes "�L���[�I���āI���̂����܂��������I�I";
	mes "�J�b�R�C�C�[�I�I";
	next;
	mes "[�l�W���A��]";
	mes "�����������������������I�I�I";
	mes "�c��É��A���΁I�I�I";
	next;
	mes "[�l�W���A���G���y���[]";
	mes "���̐��E�͋���ȃl�W���A����";
	mes "�͂̑O�ɂЂꕚ���ł��낤�I�I�I";
	next;
	cloakoffnpc "�X�e�B�[�u��#ITB_017";
	cloakoffnpc "�T��#ITB_018";
	mes "[�l�W���A��]";
	mes "�����������������������I�I�I";
	mes "�c��É��A���΁I�I�I";
	mes "�o���U�C�I�I�o���o���U�[�C�I�I";
	next;
	mes "[�X�e�B�[�u��]";
	mes "������Ƒ҂āA����͉����H";
	mes "���̐��N�}�̂ʂ�����݂�";
	mes "����������������̂��c�c�H";
	next;
	mes "[�T��]";
	mes "�ǂ��݂Ă��A�����݂������ˁH";
	next;
	mes "[�X�e�B�[�u��]";
	mes "�����݂�������Ȃ��āA";
	mes "���S�ɂ�������Ȃ����I";
	mes "���̃��R���R�N�}��Y�͌��X��";
	mes "�����̂ʂ�����݂Ȃ̂��c�c�H";
	next;
	mes "[�X�e�B�[�u��]";
	mes "���O���ٖD���~�X�����ӏ���";
	mes "�������Ɍ����邾��I";
	next;
	mes "[�T��]";
	mes "�~�X���Ȃ�āc�c";
	mes "����͂���Ȃ�ɁA";
	mes "�����Ƃ��낪����񂾂�H";
	next;
	mes "[�X�e�B�[�u��]";
	mes "�c�c�����H�ǂ������c�c�H";
	next;
	mes "[�l�W���A���G���y���[]";
	mes "�ӂށc�c";
	mes "�܂����c�c�B";
	next;
	mes "[�l�W���A���G���y���[]";
	mes "�_���ȏW���";
	mes "�l�Y�~�����ꍞ��ł��悤�Ƃ͂ȁB";
	next;
	mes "[�l�W���A���G���y���[]";
	mes "�l�W���A���̐�m������I�I";
	mes "�N���҂����f����I�I";
	next;
	mes "[�l�W���A��]";
	mes "���̂܂܂ɁI";
	next;
	mes "[�l�W���A��]";
	mes "�����������������������I�I";
	mes "���f����I";
	mes "�N���҂��I�I";
	next;
	mes "[�X�e�B�[�u��]";
	mes "������I";
	mes "�ǂ����o�����݂������I";
	next;
	setquest 11563;
	delquest 11562;
	set IL_TBEAR_QUE,8;
	mes "[�X�e�B�[�u��]";
	mes "�����I";
	mes "�������߂���B";
	mes "������܂ő����ē����邼�I";
	close2;
	cloakonnpc "�X�e�B�[�u��#ITB_017";
	cloakonnpc "�T��#ITB_018";
	cloakonnpc "�H�H�H�H#ITB_019";
	cloakonnpc "�H�H�H�H#ITB_021";
	cloakonnpc "�H�H�H�H#ITB_022";
	cloakonnpc "�H�H�H�H#ITB_023";
	cloakonnpc "�H�H�H�H#ITB_024";
	cloakonnpc "�H�H�H�H#ITB_025";
	cloakonnpc "�H�H�H�H#ITB_026";
	cloakonnpc "�H�H�H�H#ITB_027";
	cloakonnpc "�H�H�H�H#ITB_028";
	cloakonnpc "�H�H�H�H#ITB_029";
	cloakonnpc "�H�H�H�H#ITB_030";
	cloakonnpc "�H�H�H�H#ITB_031";
	cloakonnpc "�H�H�H�H#ITB_032";
	cloakonnpc "�H�H�H�H#ITB_033";
	cloakonnpc "�H�H�H�H#ITB_034";
	cloakonnpc "�H�H�H�H#ITB_035";
	cloakonnpc "�H�H�H�H#ITB_036";
	cloakonnpc "�H�H�H�H#ITB_037";
	cloakonnpc "�H�H�H�H#ITB_038";
	cloakonnpc "�H�H�H�H#ITB_039";
	cloakonnpc "�H�H�H�H#ITB_040";
	cloakonnpc "�H�H�H�H#ITB_041";
	warp "ein_d02_i_q.gat", 168, 197;
	end;
}
ein_d02_i_q.gat,138,239,4	script	#ITB_044	10025,{
	end;
OnInit:
	areasetcell "ein_d02_i_q.gat",137,234,139,238,5;
	end;
}
ein_d02_i_q.gat,138,238,4	script	#ITB_045	10025,{}
ein_d02_i_q.gat,138,237,4	script	#ITB_046	10025,{}
ein_d02_i_q.gat,138,236,4	script	#ITB_047	10025,{}
ein_d02_i_q.gat,138,235,4	script	#ITB_048	10025,{}
ein_d02_i_q.gat,138,234,4	script	#ITB_049	10025,{}
ein_d02_i_q.gat,159,235,0	script	#ITB_052	139,1,4,{
	if(IL_TBEAR_QUE != 7)
		end;
	mes "�]��ȑ�����������������";
	mes "�@�Ƃ����ɕ��A�ɉB�ꂽ�]";
	next;
	warp "ein_d02_i_q.gat", 135, 235;
	end;
}

ein_d02_i_q.gat,135,234,0	script	#ITB_053	139,0,1,{
	if(IL_TBEAR_QUE != 7)
		end;
	pushpc 4, 1;
	end;
}

ein_d02_i.gat,161,189,3	script	��w�ւƑ�����#ITB_050	10043,{
	mes "�]�u�z�R�_���W���� 01�v��";
	mes "�@�߂�܂����H�]";
	next;
	if(select("�߂�","��������") == 2) {
		mes "�]���̏ꂩ�痧���������]";
		close;
	}
	warp "ein_dun01.gat", 189, 80;
	end;
}

ein_d02_i.gat,170,193,5	script	�X�e�B�[�u��#ITB_051	98,{
	if(checkquest(11566)) {
		if(checkquest(11566)&0x2 == 0) {
			mes "[�X�e�B�[�u��]";
			mes "�����͘J���^�s�b�g�}����";
			mes "�x��ł����";
			mes "�l�W���A������";
			mes "�������₷���Ȃ�����B";
			mes "���񂽂�������Ƌx��ǂ��B";
			mes "�����߂�����A�̉󂷂��������B";
			close;
		}
		delquest 11566;
		mes "[�X�e�B�[�u��]";
		mes "�����c�c";
		mes "������͈��";
		mes "���܂œ����Ă���񂾂�B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "�c�c�����A���񂽂��B���͍��A";
		mes "���́u�l�W���A���v���𒲍����Ȃ񂾂��A";
		mes "�����҃����X�^�[�̊������ז���";
		mes "�������i�܂Ȃ��񂾁B";
		next;
		mes "[�X�e�B�[�u��]";
		mes "���񂽂��Z�����Ȃ���΁A";
		mes "^0000cd�J���^�s�b�g�}����5��^000000";
		mes "�ގ����Ă����Ə�����B";
		mes "����͂��邩��A";
		mes "�����󂯂Ă���Ȃ����H";
		next;
		if(select("�����󂯂�","�Z����") == 2) {
			mes "[�X�e�B�[�u��]";
			mes "�������B";
			mes "���񂽂��Z�����񂾂ȁB";
			close;
		}
		setquest 11565;
		mes "[�X�e�B�[�u��]";
		mes "���񂾂��B";
		mes "^0000cd�J���^�s�b�g�}����5��^000000���I";
		mes "���񂽂�����������";
		mes "�̂��󂷂̂��ǂ��Ȃ�����";
		mes "5�̂ł������B";
		close;
	}
	if(checkquest(11565)) {
		if(checkquest(11565)&0x4 == 0) {
			mes "[�X�e�B�[�u��]";
			mes "^0000cd�J���^�s�b�g�}����5��^000000�ގ�����";
			mes "�x�ɂ�^���Ă���Ă���B";
			mes "���񂽂�����������";
			mes "�̂��󂷂̂��ǂ��Ȃ�����";
			mes "5�̂ł������B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		setquest 11566;
		delquest 11565;
		getitem 25271,2;
		getexp 100000000,0,1;
		getexp 0,20000000,0;
		mes "[�X�e�B�[�u��]";
		mes "�����A�����I";
		mes "����ŗ��������Ē����o���������B";
		mes "����ɂ܂��������z�΂���邺�B";
		close;
	}
	mes "[�X�e�B�[�u��]";
	mes "�c�c�����A���񂽂��B���͍��A";
	mes "���́u�l�W���A���v���𒲍����Ȃ񂾂��A";
	mes "�����҃����X�^�[�̊������ז���";
	mes "�������i�܂Ȃ��񂾁B";
	next;
	mes "[�X�e�B�[�u��]";
	mes "���񂽂��Z�����Ȃ���΁A";
	mes "^0000cd�J���^�s�b�g�}����5��^000000";
	mes "�ގ����Ă����Ə�����B";
	mes "����͂��邩��A";
	mes "�����󂯂Ă���Ȃ����H";
	next;
	if(select("�����󂯂�","�Z����") == 2) {
		mes "[�X�e�B�[�u��]";
		mes "�������B";
		mes "���񂽂��Z�����񂾂ȁB";
		close;
	}
	setquest 11565;
	mes "[�X�e�B�[�u��]";
	mes "���񂾂��B";
	mes "^0000cd�J���^�s�b�g�}����5��^000000���I";
	mes "���񂽂�����������";
	mes "�̂��󂷂̂��ǂ��Ȃ�����";
	mes "5�̂ł������B";
	close;
}

ein_d02_i.gat,0,0,0	script	#IllTeddyBear	-1,{
OnInit:
	for(set '@i,0;'@i<10;set '@i,'@i+1)
		areamonster "ein_d02_i.gat",0,0,0,0,"--ja--",20255+rand(4),1,strnpcinfo(0)+"::OnSummon";
	end;

OnKilled:
	set 'mob,0;
OnSummon:
	if('mob == 0 && rand(100) == 0) {
		// �b��
		set 'mob,areacallmonster("ein_d02_i.gat",0,0,0,0,"���̔j��",20262,strnpcinfo(0)+"::OnKilled");
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		mobuseskillpos 'mob,21,10,'@x,'@y,0,0;	// �T���_�[�X�g�[��
		mobuseskill 'mob,730,1,0,0,0,1;	// M�����w
		unittalk 'mob,"���̔j�� : ���񂾃{�f�B�܂��͂��ĂȂ��ȁB";
	}
	else {
		areamonster "ein_d02_i.gat",0,0,0,0,"--ja--",20255+rand(4),1,strnpcinfo(0)+"::OnSummon";
	}
	end;
}
