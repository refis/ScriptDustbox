//250,1452,483,528
/*
@skillcasting(src: 3802:"�s�g�ȃ\���b�h�^�[�g��"(6593), dst: 4631724, skill: "�O���E���h�A�^�b�N"(185), casttime: 500)
@skillattack(src: 3802:"�s�g�ȃ\���b�h�^�[�g��"(6593), dst: (4631724), skill: "�O���E���h�A�^�b�N"(185), skill_lv: 65535, damage: 4919, sDelay: 483, dDelay: 504, div: 1, hit: 6, tick: 552715165)
@skillnodamage(src: 3802:"�s�g�ȃ\���b�h�^�[�g��"(6593), dst: (6593), skill: "�I�[�g�K�[�h"(249), val: 5)
@skillcasting(src: 3802:"�s�g�ȃ\���b�h�^�[�g��"(6593), dst: 4631724, skill: "�X�^���A�^�b�N"(179), casttime: 1500)
@skillattack(src: 3802:"�s�g�ȃ\���b�h�^�[�g��"(6593), dst: (4631724), skill: "�X�^���A�^�b�N"(179), skill_lv: 65535, damage: 903, sDelay: 483, dDelay: 504, div: 1, hit: 6, tick: 552557527)

*/
// tur_d04_i.gat
tur_d04_i.gat,0,0,0,0	monster	�s�g�ȃq�[�g�^�[�g��	3803,10,5000,0,0
tur_d04_i.gat,0,0,0,0	monster	�s�g�ȃt���[�Y�^�[�g��	3801,10,5000,0,0
// tur_d03_j.gat
tur_d03_j.gat,0,0,0,0	monster	�s�g�ȃt���[�Y�^�[�g��	3801,60,5000,0,0
tur_d03_j.gat,0,0,0,0	monster	�s�g�ȃq�[�g�^�[�g��	3803,60,5000,0,0
// tur_d04_j.gat
tur_d04_j.gat,0,0,0,0	monster	�s�g�ȃA�T���g�^�[�g��	3799,105,5000,0,0
tur_d04_j.gat,0,0,0,0	monster	�s�g��P�^�[�g��	3800,35,5000,0,0

alberta.gat,211,28,5	script	�R�m�G�C���o��#illtur	405,{
	switch(IL_TUR_QUE) {
	case 0:
		mes "[�R�m�G�C���o��]";
		mes "���������Ė`���җl�ł����H";
		mes "���������Ȃ琥��";
		mes "���肢���������Ƃ�����܂��B";
		next;
		if(select("�ǂ��������Ƃł����H","���͖Z�����̂�") == 2) {
			mes "[�R�m�G�C���o��]";
			mes "�ˑR�̂�������������������B";
			mes "�`���җl�ɏj�����B";
			close;
		}
		mes "[�R�m�G�C���o��]";
		mes "�ˑR�̂�������������������B";
		mes "���̓A���x���^�x�����A";
		mes "��1�R�m�c�����A�R�m�G�C���o���ł���܂��B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "���͋R�m�c�̖����󂯁A";
		mes "�^�[�g���A�C�����h�ŉߋ����H����";
		mes "�A���x���^��2�R�m�c��";
		mes "�{���C�������Ă���܂����B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�����������Ɛ���̍q�C�ŗ��ɉ";
		mes "�������C�̏��f�r������";
		mes "�^�[�g���A�C�����h�ł�����";
		mes "�^�[�g���A�C�����h�łȂ��ꏊ��";
		mes "�H����܂����B";
		emotion 1,"";
		next;
		menu "����͂ǂ̂悤�ȏꏊ�ł����H",-;
		mes "[�R�m�G�C���o��]";
		mes "���ɂ���肭�����͂ł��܂���B";
		mes "�����̓^�[�g���A�C�����h��";
		mes "�ԈႢ�Ȃ��̂ł����A";
		mes "���ɂ����Ƃ���Ƃ���ł����B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "���鋰��T�����n�߂����ł�����";
		mes "�����Ŋ�@�ɕm���Ă��܂�";
		mes "���͂��]�I�Ƃ����󋵂܂�";
		mes "�ǂ����܂�Ă��܂����̂ł��B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�����_�����Ǝv�������̎�";
		mes "�N����������������";
		mes "�����o����悤��";
		mes "�U�����Ă��ꂽ�̂ł��B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "���̎��͖��䖲������������";
		mes "���܂�ڂ����o���Ă��Ȃ��̂ł���";
		mes "�C���t���Ύ��̓A���x���^��";
		mes "�C���̐����`�ɗ����Ă��āA";
		mes "���̋T�̍b���̌��Ђ�2��������";
		mes "��̒��ɂ���܂����B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�����N�������̂��͕�����܂���B";
		mes "�ǂ��ɂ������ċA���Ă������Ɓc�c";
		mes "���ꂾ���͕�����܂����B";
		next;
		menu "�T�̍b���̌��Ђ�2���������̂ł́H",-;
		mes "[�R�m�G�C���o��]";
		mes "����1���͎��̗F�l�������Ă��܂��B";
		mes "����A�����Ă���͂���";
		mes "�����ׂ��ł��傤���B";
		next;
		switch(select("���̗F�l�ɉ����H","�M���������ł���")) {
		case 1:
			emotion 19;
			mes "[�R�m�G�C���o��]";
			mes "��قǂ̂��肢�Ƃ����̂�";
			mes "���ł��Ȃ��F�l�̘b�ł��B";
			mes "�O�u���������Ȃ��Ă��݂܂���B";
			mes "�X������΂�����������";
			mes "���̘b�𕷂��Ă��������B";
			break;
		case 2:
			emotion 19;
			mes "[�R�m�G�C���o��]";
			mes "��ʂ肾�Ǝv���܂��B";
			mes "�������T�����܂�������B";
			mes "�������A�����������������Ă��������B";
			mes "���̗F�l���~�����߂ɂ��B";
			break;
		}
		next;
		mes "[�R�m�G�C���o��]";
		mes "�F�l�̖���^0000CD�C�G���t�F��^000000�B";
		mes "�W���m�[�ōl�Êw�̋���������Ă��܂��B";
		mes "�����ނɁA���̌��Ђ���������";
		mes "��ϋ����������Ă���܂����B";
		mes "^0000CD�^�[�g���A�C�����h�ɂ̂ݐ�������";
		mes "�T�̍b���ō�������̂��Ɗ֐S���Ă܂���^000000�B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�������A�������̌��Ђ�n�������";
		mes "���Ђ𒲂ׂĂ����C�G���t�F�����A";
		mes "�����Ȃ艽���Ɋ������܂ꂽ���̂悤��";
		mes "�e���`���������������Ă��܂��܂����B";
		emotion 20,"";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�M�����Ȃ��̂������͂���܂���B";
		mes "�ł����A���̖ڂŃn�b�L��������ł��B";
		mes "���̏ꏊ�ŃC�G���t�F����������̂��I";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�c�c���ꂪ����^FF0000�����O^000000�̂��Ƃł��B";
		mes "���̊ԁA�W���m�[�̑�w�ɂ��A������";
		mes "�^�[�g���A�C�����h�ɂ��s���ė��܂������A";
		mes "���̐��ʂ������m�ɂ�������v����";
		mes "�C�G���t�F���̏��������̏ꏊ��";
		mes "�T�̍b���̌��Ђ������Ă��܂����B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�`���җl�A���肢�ł��B";
		mes "���̗F�l��T���̂�";
		mes "��`���Ă��������܂��񂩁H";
		mes "���̋T�̍b���̌��Ђ�����";
		mes "�肪����Ȃ̂ł��B";
		next;
		menu "�F�l�̌����ڂ������Ă�������",-;
		mes "[�R�m�G�C���o��]";
		mes "^0000CD�����ŁA�ዾ�������Ă܂�^000000�B";
		mes "^0000CD��Ɋw�҂Ə�����Ă�悤�Ȏp^000000������A";
		mes "����΂���������ł��傤�B";
		next;
		menu "�T�̍b���̌��Ђ������Ă�������",-;
		mes "�]�R�m���n���Ă��ꂽ";
		mes "�@�T�̍b���̌��Ђ���Ɏ����Ă݂��B";
		mes "�@�T�̐��b���ɏ������t��";
		mes "�@�ꖇ���܂�Ă���B";
		mes "�@�ق���肾��";
		mes "�@�ǂ�������������������B�]";
		next;
		mes "�]^424242���΂炭���Ђ𒲂ׂĂ�����";
		mes "�@���̒��ɔ����ɉ�����";
		mes "�@������ł���̂�����������";
		mes "�@�����Ȃ�˕��������N����";
		mes "�@���E�������Ȃ��Ă����B^000000�]";
		next;
		emotion 16;
		mes "[�R�m�G�C���o��]";
		mes "�����A�ȑO�̍q�C�̎���";
		mes "����ȕ��������Ă��܂����B";
		mes "�`���җl�A���v�ł���!?";
		next;
		mes "�]^424242�G�C���o���̐��Ƌ��ɁA";
		mes "�@�ӎ��������Ȃ��Ă䂭�B";
		mes "�@�������D�̓��������Ă����c�c�B^000000�]";
		close2;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		getitem 25315,1;
		setquest 16096;
		set IL_TUR_QUE,1;
		warp "tur_d03_i.gat",132,187;
		end;
	case 1:
		mes "�]^424242�ӎ��������Ȃ��Ă䂭�B";
		mes "�@�������D�̓��������Ă����c�c�B^000000�]";
		close2;
		warp "tur_d03_i.gat",132,187;
		end;
	case 2:
	case 3:
		emotion 0,"�R�m�G�C���o��#illtur";
		mes "[�R�m�G�C���o��]";
		mes "�`���җl�I�������ł������I";
		mes "�C�G���t�F���ɑ�����";
		mes "�`���җl�܂ŏ����Ă��܂�";
		mes "�{���ɐS�z���Ă���܂����B";
		next;
		menu "�C�G���t�F�������̎�|����������܂���",-;
		emotion 0,"�R�m�G�C���o��#illtur";
		mes "[�R�m�G�C���o��]";
		mes "�{���ł����H";
		mes "�����A�{���ɗǂ������B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�܂��C�G���t�F����";
		mes "�T���ɍs�����̂ł����H";
		mes "����A�������s�����Ă��������B";
		next;
		if(select("�����s���܂�","����������܂�") == 2) {
			mes "[�R�m�G�C���o��]";
			mes "�ǂ����C�G���t�F���̂���";
			mes "���肢�������܂��B";
			close;
		}
		mes "[�R�m�G�C���o��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�ǂ����C�G���t�F����";
		mes "���~�����������B";
		next;
		mes "�]^424242�T�̍b���̌��Ђ����肵�߂��";
		mes "�@���Ŕ��̖т��Ȃт��̂��������B^000000�]";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�ǂ����A���C�����āB";
		next;
		mes "�]^424242���S�ɖڂ̑O���Â��Ȃ�O";
		mes "�@�j�ɂ��₽����C���G�ꂽ�c�c�B^000000 �]";
		close2;
		warp "tur_d03_i.gat",132,187;
		end;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
		emotion 0,"�R�m�G�C���o��#illtur";
		mes "[�R�m�G�C���o��]";
		mes "�`���җl�I�������ł������I";
		mes "�C�G���t�F���ɑ�����";
		mes "�`���җl�܂ŏ����Ă��܂�";
		mes "�{���ɐS�z���Ă���܂����B";
		next;
		menu "�C�G���t�F�������������܂���",-;
		emotion 0,"�R�m�G�C���o��#illtur";
		mes "[�R�m�G�C���o��]";
		mes "�{���ł����H";
		mes "�����A�{���ɗǂ������B";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�܂��C�G���t�F���̌���";
		mes "�s�����̂ł����H";
		mes "����A�������s�����Ă��������B";
		next;
		if(select("�����s���܂�","����������܂�") == 2) {
			mes "[�R�m�G�C���o��]";
			mes "�ǂ����C�G���t�F���̂���";
			mes "���肢�������܂��B";
			close;
		}
		mes "[�R�m�G�C���o��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�ǂ����C�G���t�F����";
		mes "���~�����������B";
		next;
		mes "�]^424242�T�̍b���̌��Ђ����肵�߂��";
		mes "�@���Ŕ��̖т��Ȃт��̂��������B^000000�]";
		next;
		mes "[�R�m�G�C���o��]";
		mes "�ǂ����A���C�����āB";
		next;
		mes "�]^424242���S�ɖڂ̑O���Â��Ȃ�O";
		mes "�@�j�ɂ��₽����C���G�ꂽ�c�c�B^000000 �]";
		close2;
		warp "tur_d03_i.gat",132,187;
		end;
	case 9:
		mes "[�R�m�G�C���o��]";
		mes "�`���җl�A����ɂ��́B";
		next;
		switch(select("�܂��������֍s��","�G�k�����ɂ���","���ł��Ȃ�")) {
		case 1:
			switch(select("�߂��݂̗z������","�߂��݂̗z����(�N�G�X�g)��")) {
			case 1:
				set '@map$,"tur_d03_j.gat";
				break;
			case 2:
				set '@map$,"tur_d03_i.gat";
				break;
			}
			mes "�]�T�̍b���̌��Ђ����肵�߂��";
			mes "�@���Ŕ��̖т��Ȃт��̂��������B�]";
			next;
			mes "[�R�m�G�C���o��]";
			mes "�ǂ����A���C�����āB";
			next;
			mes "�]^424242���S�ɖڂ̑O���Â��Ȃ�O";
			mes "�@�j�ɂ��₽����C���G�ꂽ�c�c�B^000000 �]";
			close2;
			warp '@map$,132,187;
			end;
		case 2:
			mes "[�R�m�G�C���o��]";
			mes "�`���җl�A����ɂ��́B";
			mes "�C�G���t�F���ɑS�Ă̘b�𕷂��܂����B";
			mes "�����͐l��S�z�����Ă�����";
			mes "�܂��s���Ă��܂��܂����B";
			mes "�������̔閧����������";
			mes "�߂�ƌ����Ă܂����ˁB";
			next;
			mes "[�R�m�G�C���o��]";
			mes "�C�G���t�F�������łȂ��A";
			mes "�i�����Ƃ���������";
			mes "������ꂽ�ƕ����܂����B";
			mes "�`���җl�͗��h�ȕ����ƐM����";
			mes "���̖ڂɋ����͖��������悤�ł��B";
			next;
			mes "[�R�m�G�C���o��]";
			mes "�������ɍs���Ƃ���";
			mes "�C�G���t�F���̗l�q��";
			mes "���ɍs���Ă����Ă��������B";
			mes "�������g����";
			mes "�������厖�ȓz�Ȃ̂�";
			mes "�F�l�Ƃ��Ă͐S�z�ł��B";
			next;
			mes "[�R�m�G�C���o��]";
			mes "�������A����܂ł̎���";
			mes "�R�m�c�ɕ񍐂�����";
			mes "�K���Ȃ��ƂɎ���";
			mes "�C�G���t�F���̌�����";
			mes "�x������C����C����܂����B";
			next;
			mes "[�R�m�G�C���o��]";
			mes "���͎�̓͂��Ȃ����ɂ��܂���";
			mes "������1�x�̓C�G���t�F����";
			mes "���C�Ȏp������܂���";
			mes "�����͈��S�ł��܂��B";
			next;
			mes "[�R�m�G�C���o��]";
			mes "�C�G���t�F���ɉ������";
			mes "�z������������Ă��邩";
			mes "�m�F�����肢���܂��B";
			close;
		case 3:
			mes "[�R�m�G�C���o��]";
			mes "���������Ƃ�����܂�����";
			mes "���ł����𗊂��Ă��������B";
			mes "�`���җl�ɂ͊��ӂ��Ă�";
			mes "������Ȃ��قǂ�";
			mes "�䉶������܂�����B";
			close;
		}
	}
}

tur_d03_i.gat,139,186,3	script	����#illtur01	10238,{
	switch(IL_TUR_QUE) {
	case 1:
		mes "[����]";
		mes "�܂����m��ʐl�B";
		mes "�������A����ς�";
		mes "�����A���Ă����̂ˁB";
		mes "���̋T�̍b���̌��Ђ��B";
		next;
		emotion 19,"";
		menu "�N�́H",-;
		mes "[����]";
		mes "���Ȃ��Ɋ֌W�Ȃ��B";
		mes "���Ȃ����m��Ȃ��Ă����ҁB";
		next;
		menu "�����͂ǂ��H",-;
		mes "[����]";
		mes "���Ȃ������Ă͂����Ȃ��ꏊ�B";
		next;
		menu "�ǂ����Ă����ɁH",-;
		mes "[����]";
		mes "���Ȃ����m��K�v�͂Ȃ��B";
		next;
		mes "[����]";
		mes "�����m��Ȃ��Ă����B";
		mes "�����ǁA^0000CD�����ɂ��Ă͂����Ȃ��l^000000��";
		mes "���Ȃ��ȊO�ɂ�����́B";
		mes "���̏ꏊ�֘A��ċA���āB";
		mes "^0000CD�����̊w��^000000�B�m���Ă�H";
		next;
		menu "���̐l��T���ɗ���",-;
		mes "[����]";
		mes "����͂悩�����B";
		mes "���͂ǂ��ɂ���̂�";
		mes "������Ȃ����ǁA";
		mes "�������ȏꏊ�͂��������邩��";
		mes "�����Ă�����B";
		viewpoint 1, 80, 180, 1, 0xFFFF33;
		viewpoint 1, 235, 187, 2, 0xFFFF33;
		viewpoint 1, 217, 73, 3, 0xFFFF33;
		next;
		mes "[����]";
		mes "^0000CD�����̓񂩏��A���̓񂩏�^000000�B";
		mes "����������A�T���ĘA��ċA���āB";
		mes "�����ē�x�Ɨ��Ȃ��ŁB";
		next;
		mes "�]���Ȃ��͖ڂ̑O�̏�����";
		mes "�@��������������邱�Ƃɂ����B�]";
		next;
		menu "�N�͒N�H���̃C�G���t�F����m���Ă���H",-;
		mes "[����]";
		mes "���������������Ƃ���B";
		mes "���Ȃ��͓�x��";
		mes "�����ɗ���K�v�̂Ȃ��l�B";
		mes "�����m��K�v�͂Ȃ��B";
		next;
		menu "�ǂ��������A���H",-;
		emotion 9,"����#illtur01";
		mes "[����]";
		mes "�A����͒m��Ȃ��B";
		mes "�ǂ����痈���̂����m��Ȃ��̂ɁA";
		mes "�ǂ��֍s���΂����̂�";
		mes "������󂪂Ȃ��B";
		next;
		mes "[����]";
		mes "�ł��������A�������̒��Ɂc�c";
		mes "�������邩���B�ڂ����͒m��Ȃ��B";
		mes "���Ȃ��̕����m���Ă�͂��B";
		next;
		mes "�]^424242�����͌��̌Q��̕���";
		mes "�@�ڔz��������B";
		mes "�@���̏ꏊ�ɋA�肽������";
		mes "�@�ߕt���Ē��ׂĂ݂悤�B^000000�]";
		next;
		misceffect 778,"����#illtur01";
		if(!sleep2(1000)) end;
		misceffect 778,"";
		misceffect 877,"";
		menu "����́H",-;
		mes "[����]";
		mes "���Ȃ������΂炭�̊ԁA����p�B";
		mes "�������A�����͏�ɑ��ɂ���B";
		if(!sleep2(1000)) end;
		mes "���ÂɍD��S������Ȃ��ŁB";
		if(!sleep2(1000)) end;
		mes "�����Ȃ��̂����߂Ȃ��ŁB";
		if(!sleep2(1000)) end;
		mes "��{���ŐU��Ԃ�Ȃ��ŁB";
		if(!sleep2(1000)) end;
		mes "���l�̔w�������Ȃ���b���Ȃ��ŁB";
		next;
		mes "[����]";
		mes "^FF0000���Ȃ������m��ʑ�������҂ł���ƁA";
		mes "�����ăo���Ȃ��ŁB^000000";
		delquest 16096;
		setquest 16097;
		setquest 16098;
		setquest 16099;
		set IL_TUR_QUE,2;
		close;
	case 2:
	case 3:
	case 4:
	case 5:
		mes "[����]";
		mes "�c�c�܂��A�����Ă����񂾂ˁB";
		next;
		mes "[����]";
		mes "�댯�Ȗڂɂ����O��";
		mes "���̐l��A��Ă�������o�Ă��āB";
		next;
		mes "[����]";
		mes "�������ȏꏊ�͂��������邩��";
		mes "�����Ă�����B";
		viewpoint 1, 80, 180, 1, 0xFFFF33;
		viewpoint 1, 235, 187, 2, 0xFFFF33;
		viewpoint 1, 217, 73, 3, 0xFFFF33;
		close;
	case 6:
		mes "[����]";
		mes "�����������񂾂ˁB��l�Ƃ��B";
		mes "�c�c�댯�ɂ����Ă��߂�B";
		next;
		cloakoffnpc "�l�Êw�҃C�G���t�F��#i1";
		emotion 4,"�l�Êw�҃C�G���t�F��#i1";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�c�c�ӂ��A���ʂ��Ǝv���܂����B";
		next;
		mes "[����]";
		mes "��������A���āB���̏ꏊ�ցB";
		mes "�����đS���Y��āB";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�͂��H�����Ȃ�ǂ��������Ƃł����B";
		mes "�l�͖߂��Ă��܂���B";
		mes "�����̔閧��S�ĉ𖾂���܂ł͂ˁB";
		next;
		mes "[����]";
		mes "�Ȃ��A����Ȃ��Ƃ�����H";
		mes "�������ˁB";
		next;
		emotion 32,"�l�Êw�҃C�G���t�F��#i1";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�l�͊w�҂ł�����B";
		next;
		mes "[����]";
		mes "���Ȃ����w�҂��Ƃ��Ă�";
		mes "������������񂷌����͂Ȃ��B";
		next;
		menu "�������̂��Ƃ��ڂ����������Ăق���",-;
		mes "[����]";
		mes "�m��K�v�͂Ȃ��B";
		mes "�ǂ�������Ă����l�����B";
		mes "�O���b�������ǒN���A���ė��Ȃ������B";
		mes "�������҂��Ȃ��B���������";
		mes "���]���邱�Ƃ��Ȃ�����B";
		next;
		emotion 1,"";
		if(!sleep2(1000)) end;
		emotion 9,"";
		mes "[����]";
		mes "�c�c�N���A���ė��Ȃ��B";
		mes "���Ȃ����������B";
		mes "�����͊�Ȃ�����B";
		next;
		emotion 0,"�l�Êw�҃C�G���t�F��#i1";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���Ȃ����~�����̂�";
		mes "����ł������ɋA���Ă���";
		mes "�N���ł���ˁB";
		next;
		if(!sleep2(3000)) end;
		emotion 7,"����#illtur01";
		unittalk getnpcid(0,"����#illtur01"),"���� : �c�c�{���A����ȍl���B";
		next;
		mes "[����]";
		mes "�ӂ��c�c���������B";
		mes "�b���Ă�����B";
		mes "��������A��Ɩ񑩂��āB";
		mes "���܂�b���������́A�ł͂Ȃ����ǁB";
		mes "���Ȃ������������߂��邩��";
		mes "���ʂɘb���Ă�����B";
		next;
		mes "[����]";
		mes "�c�c������Ƒ҂��ĂāB";
		mes "�������鎞�Ԃ��K�v�B";
		mes "�������i����";
		mes "����ĂȂ������b������B";
		next;
		emotion 54,"";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���ꂶ��A�l��";
		mes "������Ƃ��̕ӂ�����Ă��܂��B";
		next;
		cloakonnpc "�l�Êw�҃C�G���t�F��#i1";
		mes "[����]";
		mes "�����҂��Ă���";
		mes "�܂��b�������Ă����H";
		chgquest 16104,16116;
		set IL_TUR_QUE,7;
		close;
	case 7:
		cloakoffnpc "�l�Êw�҃C�G���t�F��#i1";
		mes "[�i����]";
		mes "�҂��Ă���Ă��肪�Ƃ��B";
		mes "���ȏЉ��n�߂�����������ˁB";
		mes "���A�i�����B^0000CD�Â��썰�B^000000";
		next;
		mes "[�i����]";
		mes "�������ƕ��ʂ�";
		mes "��b�ł���̂��݂��";
		mes "���Ȃ��͂���܂ł�";
		mes "��R�̌o���������݂����ˁB";
		next;
		mes "[�i����]";
		mes "���͂��镨�̂�������";
		mes "���b�ł��Ă邯��";
		mes "�����̂悤�ȕ��}�Ȑl��";
		mes "�{���Ȃ玄������";
		mes "���邱�Ƃ��o���Ȃ��B";
		next;
		mes "[�i����]";
		mes "�����̏Z��������";
		mes "�݂�ȉ��O�ɔ���ꂽ�썰����B";
		mes "���񂾓�������";
		mes "�؂Ɋ���������Ɏ����";
		next;
		mes "[�i����]";
		mes "���g�����񂾂��Ƃɂ���";
		mes "�C�t�����Ƃ��ł�����";
		mes "���܂ł��������Ƃ��J��Ԃ��B";
		next;
		mes "[�i����]";
		mes "���̓}�V�ȕ��ŁA���܂�";
		mes "�������甲���o���邯��";
		mes "���ǂ͌��ɖ߂���";
		mes "�������Ƃ��J��Ԃ��B";
		next;
		unittalk getnpcid(0,"����#illtur01"),"�i����  :  �������͑�������B";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur01"),"�i����  :  �����Ă�ҁB";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur01"),"�i����  :  ���O�ɔ����Ȃ��ҁB";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur01"),"�i����  :  ���m��ʑ�������ҁB";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur01"),"�i����  :  �Ō�̑����A����������B";
		if(!sleep2(1000)) end;
		mes "[�i����]";
		mes "�����ǁA�K���Ȃ��Ƃ�";
		mes "���Ȃ���������������";
		mes "�C�t���Ȃ����莄������";
		mes "���Ȃ������ɋC�t���Ȃ��B";
		next;
		mes "[�i����]";
		mes "�����ǁA����������͑����Ȃ��B";
		mes "�����ɒ�������΂���ق�";
		mes "���݂��ɋC�t���Ă��܂��B�������B";
		mes "�����Ă����Ȃ�C�Â��Ă��܂��B";
		mes "����͌�����Ă��Ȃ����̂��ƁB";
		mes "�c�c�����Ȃ�΁A�I���B";
		next;
		mes "[�i����]";
		mes "�����͎��̕��������Ă邩��";
		mes "���������������ǁB";
		mes "���ʂȂ玄���C�t���Ȃ��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�i��������̕��Ƃ�";
		mes "�T�̍b���̌��Ђ̂��Ƃł����H";
		mes "�G�C���o�����������̂�";
		mes "��͂�A���Ȃ��ł������B";
		mes "�F�l�������Ă���Ă��肪�Ƃ��B";
		next;
		mes "[�i����]";
		mes "���̂��߂ɂ�������Ƃ������B";
		mes "���ӂ������̂���Ȃ��B";
		mes "���𔛂��Ă鉅�O��";
		mes "^0000CD�����ŁA�N�����Ȃ������Ȃ��B";
		mes "�݂�Ȃ��~������^000000�B";
		mes "�Ƃ����A���̂�����B";
		next;
		emotion 7,"����#illtur01";
		mes "[�i����]";
		mes "���c�c�{���A�o�J�Șb����B";
		mes "�c�c���߂�A������Ƃ���";
		mes "��l�ɂ��Ă���Ȃ��H";
		mes "���Ԃ�ׂ��Ă��āB";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "��肠��܂���B";
		mes "������ƐȂ��O���Ă����܂��傤�B";
		mes strcharinfo(0)+"�l�A�s���܂��傤���B";
		emotion 33,"";
		chgquest 16116,16117;
		set IL_TUR_QUE,8;
		close2;
		cloakonnpc "�l�Êw�҃C�G���t�F��#i1";
		end;
	case 8:
		cloakoffnpc "�l�Êw�҃C�G���t�F��#i1";
		emotion 2,"�l�Êw�҃C�G���t�F��#i1";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�����X�����̂ł���?";
		mes "�������Ȃ��ėǂ��ł���B";
		mes "���̕ӂɂ͋����[�����̂�";
		mes "�����ł�����B";
		next;
		mes "[�i����]";
		mes "�҂��Ă���Ă��肪�Ƃ��B";
		mes "�������v�B�c���b���Ă�����B";
		next;
		mes "[�i����]";
		mes "�����ɗ����l��";
		mes "�����̗F�l�����߂Ă���Ȃ��B";
		mes "�H�����ǈȑO�ɂ�";
		mes "��������ł����l�����������B";
		next;
		mes "[�i����]";
		mes "�Â��썰����������";
		mes "���߂Ă����ɗ����l����������";
		mes "����������]��ł����̂���";
		mes "�v���o�����B";
		next;
		mes "[�i����]";
		mes "���̐l�͎��̎���";
		mes "���ʂقǋ������Ă�������";
		mes "�Ō�͐����Ă�������o�Ă����B";
		mes "���̎��͎����v���Ԃ�Ɏ����";
		mes "�ۂ��Ƃ��ł����B";
		next;
		mes "[�i����]";
		mes "���O�ɗ����ꗝ�������������킸";
		mes "���̂܂܂ł����鎞�ԁc�c";
		mes "�{���ɋv���Ԃ��";
		mes "�Ƃ��Ă������������B";
		next;
		mes "[�i����]";
		mes "������A�݂�Ȃ��~�����������B";
		mes "����Ă����l�X��";
		mes "�i���ɔ���ꂽ�҂����������B";
		mes "�����ǁA�C�t�����B";
		mes "�����~�����l�����݂͂��";
		mes "�����̂���ׂ��ꏊ�ɋA���Ă��܂����B";
		next;
		mes "[�i����]";
		mes "�����Ď��͓Ƃ�ڂ����ɂȂ����B";
		mes "�����N�ŁA�������Ă��邩��";
		mes "�͂����芴���Ȃ���B";
		mes "���������������X�ƁB";
		next;
		mes "[�i����]";
		mes "����́A�ނ���";
		mes "���O�ɔ���ꂽ�썰������";
		mes "�A�܂����قǂ�";
		mes "�ꂵ�݂������B";
		next;
		mes "[�i����]";
		mes "�����ǌ��̂Ă邱�Ƃ�";
		mes "�o���Ȃ������B";
		mes "�댯�Ɋׂ����l�������B";
		mes "�������o��Γ�x��";
		mes "�A���Ă��Ȃ��ƒm��Ȃ���B";
		next;
		mes "[�i����]";
		mes "���҂͂������Ȃ��B";
		mes "���҂���Η��؂��邩��B";
		mes "�c�c����ł��I���A���̘b�B";
		mes "�������̌��Ђ͕Ԃ��āA��l���A���āB";
		next;
		mes "[�i����]";
		mes "�������Y���Ƃ��낾�����B";
		mes "�܂��|���Ă�����A��p�B";
		mes "�キ�āA���������Ȃ��B";
		mes "�؂��O�ɁA�o�čs���āB";
		if(!sleep2(500)) end;
		misceffect 778,"����#illtur01";
		if(!sleep2(1000)) end;
		misceffect 778,"";
		misceffect 778,"�l�Êw�҃C�G���t�F��#i1";
		misceffect 877,"";
		misceffect 877,"�l�Êw�҃C�G���t�F��#i1";
		next;
		menu "��J�����񂾂�",-;
		mes "[�i����]";
		mes "�c�c�����邽��";
		mes "�����b�����񂶂�A�Ȃ��B";
		mes "�C�ɂȂ�悤�Ȃ���";
		mes "����Ȃ��ŁB";
		next;
		menu "�A��Ȃ�",-;
		emotion 0,"����#illtur01";
		mes "[�i����]";
		mes "���������Ă��!?";
		mes "�b�𕷂�����";
		mes "�A��ƌ������c�c�I";
		mes "�����A�������҂��Ȃ���";
		mes "����������Ȃ��I";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�l�����͂܂����܂���B";
		mes "�Ƃ�Ŏ₵���Ȃ��悤�ɁB";
		mes "�����̑��̍�������";
		mes "��������߂���悤��";
		mes "��`���܂���B";
		next;
		emotion 9,"����#illtur01";
		mes "[�i����]";
		mes "����͖{���H";
		mes "�c�c������B";
		mes "���R���ƌ������B";
		mes "���̂悤�ɂ͂����Ȃ��A�ނ�́B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "����͂���Ă݂Ȃ��ƕ�����܂���B";
		mes "�����ł��傤�H";
		mes "������肭�s���Ȃ��Ă�";
		mes "�������͂܂������ɗ��܂�����B";
		next;
		mes "[�i����]";
		mes "���߁A���Ȃ��ŁB";
		mes "�����͊댯�B";
		mes "���������Ⴞ�߁B";
		next;
		mes "[�i����]";
		mes "���������B";
		mes "���͓�l�̂��ƖY���B";
		mes "�����̉���͑S��";
		mes "�����o���Ă邩��B";
		next;
		emotion 0,"";
		mes "[�i����]";
		mes "���݂͂�Ȃ��";
		mes "�ق�̏��������o���Ă���";
		mes "�����ǌ��ǖY���B";
		mes "�Y��Ă��v���o����̂�";
		mes "�̂��炸���Ǝ����Ă���";
		mes "�T�̍b���̌��Ђ̂������B";
		next;
		mes "[�i����]";
		mes "�����ł͂ǂ����Ă�";
		mes "���̋T�̍b���̌��Ђ�";
		mes "�̂Ă邱�Ƃ��ł��Ȃ������B";
		mes "��l���̂ĂĂ�����";
		mes "���͑S�Ă�";
		mes "�Y��邱�Ƃ��ł���B";
		next;
		mes "[�i����]";
		mes "�c�c���̂����";
		mes "�����̗F�l�Ɏ��������́B";
		mes "�S�Ă�Y��邽�߂ɁB";
		next;
		mes "[�i����]";
		mes "����ɂ��ꂪ����������";
		mes "��l�͂�����";
		mes "�����܂ŗ����Ȃ��B";
		mes "�ǂ���ɂ��Ă�";
		mes "���͓�l�̎���Y���B";
		next;
		menu "���Ƃ��Y��Ă��v���o�̓i�����̒��ɂ���",-;
		mes "[�i����]";
		mes "�݂�Ȃ��~�������Ƃ���";
		mes "�肢���������";
		mes "�܂������Ǝv���o����H";
		mes "�c�c��l�̎����H";
		next;
		menu "�����Y��Ă����x�ł��v���o������",-;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�l���i��������";
		mes "�₵���v�������Ȃ��悤��";
		mes "�܂��K�����܂��B";
		mes "�����̂��߂�����܂���";
		mes "�i���������";
		mes "�܂��܂����b�������ł�����B";
		next;
		mes "[�i����]";
		mes "�{���c�c�{���̖{���H";
		mes "����K�˂Ă��Ă����H";
		mes "�c�c�Ƃ�ڂ�������c�c";
		mes "�Ȃ��Ă��A�����H";
		next;
		menu "�񑩂���",-;
		mes "[�i����]";
		mes "�c�c�B";
		next;
		mes "[�i����]";
		mes "�c�c���c�c�B";
		next;
		mes "[�i����]";
		mes "���肪�Ƃ��c�c";
		mes "�{���Ɂc�c�B";
		next;
		if(countitem(25315) > 0)
			delitem 25315,1;
		misceffect 861,"";
		misceffect 861,"�l�Êw�҃C�G���t�F��#i1";
		if(!sleep2(500)) end;
		emotion 0,"�l�Êw�҃C�G���t�F��#i1";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���A����H�����Ă���";
		mes "�T�̍b���̌��Ђ������܂����B";
		mes "�}�ɗn�����݂����ɁB";
		next;
		mes "[�i����]";
		mes "����͎��̊肢��";
		mes "���߂�ꂽ������������B";
		mes "�����c�c���݂���K�v��";
		mes "�Ȃ��Ȃ�������B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "����͂ǂ��������Ƃł����H";
		next;
		emotion 7,"����#illtur01";
		mes "[�i����]";
		mes "�ڂ������Ƃ͒m��Ȃ��B";
		mes "�������������m��Ȃ������B";
		next;
		mes "[�i����]";
		mes "�������B���ꂠ����B";
		mes "����A�����ɂ��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���c�c����́A���z�̐΁I";
		next;
		mes "[�i����]";
		mes "�c�c����Ȗ��O�������H";
		mes "�Y�킾�������玝���Ă����B";
		mes "���Ȃ̂���������Ȃ��B";
		next;
		mes "[�i����]";
		mes "����񑩂̏؁B";
		mes "��l���v���o���悤�ɓw�͂���B";
		mes "������K���K�˂ė��āB";
		mes "�c�c�K���B";
		next;
		mes "[�i����]";
		mes "�������A��������c�c";
		mes "�҂��Ă��邩��c�c�B";
		mes "�o����A�����B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�񑩂��܂��B";
		mes "�܂��K��������܂��傤�B";
		next;
		menu "���̐l��������������",-;
		mes "[�i����]";
		mes "���@�͂���B";
		mes "�����������B";
		mes "�ǂ��������c�c�������邩�B";
		next;
		mes "[�i����]";
		mes "^0000CD�ނ�̊肢���Ƃ������āB";
		mes "�o����ɂ͂ǂ�Ȃ�";
		mes "�܂�Ȃ����Ƃł�";
		mes "�ނ炪��Ԃ��̂Ȃ�A�����āB^000000";
		mes "�������Ă�ƁA�ނ�������́c�c�B";
		next;
		menu "��������",-;
		emotion 40,"����#illtur01";
		mes "[�i����]";
		mes "�ӂӁc�c�B";
		next;
		mes "[�i����]";
		mes "���A���܂œƂ��";
		mes "�ς���ꂽ�̂�";
		mes "������l��";
		mes "�o�����邩�炾�������ȁc�c�B";
		next;
		emotion 33,"����#illtur01";
		mes "[�i����]";
		mes "�����ƁA�����B";
		if(!sleep2(1000)) end;
		mes "�K���c�c�v���o������c�c";
		mes "��΁c�c�܂����āB";
		if(!sleep2(1000)) end;
		mes "�c�c�񑩁B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�l�͂����̔閧��";
		mes "�����������܂ł�";
		mes "�����Ƃ����ɂ��܂�����ˁB";
		mes "�S�z���Ȃ��ŁB";
		mes "�l��"+strcharinfo(0)+"�����";
		mes "�i���������Y��₵�܂���B";
		close2;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		delquest 16117;
		setquest 16105;
		setquest 202095;
		set IL_TUR_QUE,9;
		getitem 25271,10;
		getexp 300000000,0,1;
		getexp 0,60000000,0;
		unittalk getnpcid(0,"�l�Êw�҃C�G���t�F��#i1"),"�C�G���t�F�� : ���ꂶ��A�܂����܂��I";
		cloakonnpc "�l�Êw�҃C�G���t�F��#i1";
		end;
	case 9:
		mes "[�i����]";
		mes "�܂����Ă˂Ƃ͌��������ǁc�c";
		mes "�����͂����A���āB";
		mes "��������Ɗ댯�B";
		mes "��p���|���Ď��ɂ�";
		mes "���E�����邩��B";
		next;
		mes "[�i����]";
		mes "�܂���l�ňꏏ�ɗ��āB";
		mes "���̎��܂���p���|���Ă�����B";
		mes "�c�c���������Y�ꂽ��";
		mes "�K���܂��v���o������c�c�B";
		close;
	}
}

tur_d03_i.gat,132,194,3	script	���̌Q��#illtur01	10042,{
	if(IL_TUR_QUE <= 1) {
		mes "[����]";
		mes "�܂����m��ʐl�B";
		mes "�������A����ς�";
		mes "�����A���Ă����̂ˁB";
		mes "���̋T�̍b���̌��Ђ��B";
		close;
	}
	if(IL_TUR_QUE == 9) {
		if(select("�A���x���^�ɖ߂�","�����Ɏc��") == 2) {
			mes "�]�܂�������";
			mes "�@���ׂ����Ƃ��c���Ă�B�]";
			close;
		}
		warp "alberta.gat",219,31;
		end;
	}
	mes "�]^424242���̌������͍������܂�A";
	mes "�@�������݂��Ȃ����̂悤�Ɍ������B";
	mes "�@�������\�̑O�A���Ԃ����̌Q�ꂪ";
	mes "�@�Y���Ă���B�����͂�������A";
	mes "�@������Ƃ��ǂ��������Ɍ����B^000000�]";
	next;
	mes "[����]";
	mes "���Ȃ��̎���";
	mes "�T�̍b���̌��Ђ������Ă����B";
	mes "���������Ă݂āB";
	next;
	mes "[����]";
	mes "�c�c�����͔O��̏ꏊ�B";
	mes "�؂Ȃ��āA�S�ꂵ��";
	mes "������łɂȂ�B";
	next;
	if(select("�A���x���^�ɖ߂�","�����Ɏc��") == 2) {
		mes "[����]";
		mes "�c�c�A��Ȃ��c�c����H";
		next;
		mes "�]�܂�������";
		mes "�@���ׂ����Ƃ��c���Ă�B�]";
		close;
	}
	mes "�]^424242�B���Șb����";
	mes "�@�s�v�c�ƐM������C�������B";
	mes "�@�����̋����ʂ�ɋT�̍b���̌��Ђ�";
	mes "�@�����������B^000000�]";
	next;
	mes "[����]";
	mes "�����B����";
	mes "�c�c�A���Ă��܂��B";
	next;
	mes "�]^424242���h�������̂��镗���A����h�炵���B";
	mes "�@�A���x���^�̍`�̔g����";
	mes "�@�J�����̖�������������B^000000�]";
	close2;
	warp "alberta.gat",219,31;
	end;
}

tur_d03_i.gat,136,187,5	script	�l�Êw�҃C�G���t�F��#i1	740,{
	end;
OnInit:
	cloakonnpc;
	end;
}

tur_d03_i.gat,80,180,1	script	�C�̑����j#illtur01	10239,{
	switch(IL_TUR_QUE) {
	case 0:
		donpcevent "�C�̑����j#illtur01::OnTalk"+ rand(1,3);
		mes "[�C�̑����j]";
		mes "�Ȃ�����������A�Ȃ�����������B";
		mes "�䂪�q�B�䂪�������q�B";
		mes "�ǂ��֍s�����́H�䂪�q�B";
		mes "���O�����������̉䂪���B";
		mes "���H�䂪�q�B";
		next;
		mes "[�C�̑����j]";
		mes "�N���H";
		mes "�䂪�q�A�N���H";
		close;
	case 2:
	case 3:
	case 4:
		if(checkquest(16097) == 0){
			donpcevent "�C�̑����j#illtur01::OnTalk"+ rand(1,3);
			mes "[�C�̑����j]";
			mes "^FF0000���Ȃ��A�䂪���B��^000000�����䂪�q���B";
			mes "�������Ȃ��B�Ȃ�^FF0000�������^000000���B";
			mes "�Ȃ�����������B�ӂ��c�c�ӂ����c�c";
			mes "��^FF0000�����䂪�q���c�c�݂�^000000";
			mes "���^FF0000���A�݁A��^000000��";
			mes "�Ȃ��A�Ȃ��A ^FF0000�݁A�݂���^000000�A�Ȃ��c�c�B";
			close;
		}
		donpcevent "�C�̑����j#illtur01::OnTalk"+ rand(1,3);
		mes "[�C�̑����j]";
		mes "�Ȃ�����������A�Ȃ�����������B";
		mes "�䂪�q�B�䂪�������q�B";
		mes "�ǂ��֍s�����́H�䂪�q�B";
		mes "���O�����������̉䂪���B";
		mes "���H�䂪�q�B";
		next;
		mes "[�C�̑����j]";
		mes "�N���H�䂪�q�A�ǂ��ɂ���H";
		mes "�䂪���H�䂪�c�c���H";
		mes "�͂́A�͂͂́B�Ȃ�����������B";
		mes "�Ȃ�����������B";
		next;
		menu "�q�������T���ł����H",-,"������`���܂��傤���H",-;
		mes "[�C�̑����j]";
		mes "�������B";
		mes "^FF0000�������Ȃ�^000000�B";
		next;
		mes "[�C�̑����j]";
		mes "��^FF0000�Ȃ��B���Ȃ��B";
		mes "����^000000���Ȃ��B";
		next;
		mes "[�C�̑����j]";
		mes "������^FF0000�Ȃ��B";
		mes "�䂪��^000000�B�q���c�c�q���H";
		mes "���Ȃ��B�͂͂��A�͂�^FF0000�͂́B";
		mes "���Ȃ��B�͂��A��^000000�́A��������";
		mes "��^FF0000�����䂪�q^000000���A";
		mes "�䂪�������䂪^FF0000���A���Ȃ�^000000�B���Ȃ��B";
		next;
		mes "�]�ǂ�����b�������������ɂȂ��B�]";
		next;
		delquest 16097;
		if(checkquest(16097) == 0 && checkquest(16098) == 0 && checkquest(16099) == 0) {
			mes "�]���̏����������Ă��ꂽ";
			mes "�@�ꏊ��^0000CD�����ꂩ��^000000����B";
			mes "�@^0000CD���Â��v�z�{^000000��";
			mes "�@�~��ĒT���Ă݂邩�B�]";
			setquest 16100;
			set IL_TUR_QUE,3;
			close;
		}
		mes "�]���̏����������Ă��ꂽ";
		mes "�@�ꏊ���܂�����B";
		mes "�@���̏ꏊ�֍s���Ă݂悤�B�]";
		close;
	}
OnTalk1:
	sleep 3000;
	unittalk "�C�̑����j : �䂪�q�A�Ȃ�����������B�Ȃ������������B�������䂪�q���B�ǂ��s�����H";
	sleep 3000;
	unittalk "�C�̑����j : �䂪�q�H�q���H�Ȃ���������A�Ȃ��A�䂪���c�c�q���B�ǂ��c�c�ǂ��H";
	sleep 3000;
	end;
OnTalk2:
	sleep 3000;
	unittalk "�C�̑����j : ���Ȃ��B�T�����Ȃ��B�䂪�q�B�������Ȃ��B�������䂪���B";
	sleep 3000;
	unittalk "�C�̑����j : �������Ȃ��B�T�����Ȃ��c�c�䂪���A�䂪�c�c���H���A���H�䂪�c�c";
	sleep 3000;
	end;
OnTalk3:
	sleep 3000;
	unittalk "�C�̑����j : �q�������Ȃ��c�c�䂪�q���A���Ȃ��Ȃ����B�������䂪���B";
	sleep 3000;
	unittalk "�C�̑����j : �����Ƃ�������Ȑl�`������ȂɍD���������̂ɁB�����l�`�͂Ȃ��B�������Ȃ��B";
	sleep 3000;
	end;
}

tur_d03_i.gat,235,187,7	script	�ׂ����R�l#illtur01	10240,{
	switch(IL_TUR_QUE) {
	default:
		donpcevent "�ׂ����R�l#illtur01::OnTalk"+ rand(1,3);
		mes "[�ׂ����R�l]";
		mes "�N�X�N�X�c�c";
		mes "^FF0000�u�c^000000�A�u�c�B^FF0000�N�X�N�X^000000�c�c";
		mes "���̂�^BDBDBD��^000000�݂�����";
		mes "����^BDBDBD�X^000000�^�[�������Ȃ�������c�c�B";
		next;
		mes "[�ׂ����R�l]";
		mes "���c�c�S���A���̕���";
		mes "^BDBDBD�Ȃ�^000000��^BDBDBD�͂�^000000�Ȃ̂Ɂc�c";
		mes "���c���̕�^BDBDBD��^000000���c�c";
		mes "^FF0000�N�X�N�X^000000�c�c�B";
		close;
	case 2:
	case 3:
		donpcevent "�ׂ����R�l#illtur01::OnTalk"+ rand(1,3);
		mes "[�ׂ����R�l]";
		mes "�N�X�N�X�c�c";
		mes "^FF0000�u�c^000000�A�u�c�B^FF0000�N�X�N�X^000000�c�c";
		mes "���̂�^BDBDBD��^000000�݂�����";
		mes "����^BDBDBD�X^000000�^�[�������Ȃ�������c�c�B";
		next;
		mes "[�ׂ����R�l]";
		mes "���c�c�S���A���̕���";
		mes "^BDBDBD�Ȃ�^000000��^BDBDBD�͂�^000000�Ȃ̂Ɂc�c";
		mes "���c���̕�^BDBDBD��^000000���c�c";
		mes "^FF0000�N�X�N�X^000000�c�c�B";
		if(checkquest(16098) == 0){
			close;
		}
		next;
		mes "[�ׂ����R�l]";
		mes "�u�c�A�u�c�c�c�N�X�N�X�c�c";
		mes "��^BDBDBD��^000000�c�c����^BDBDBD��^000000���c�c";
		mes "�S��^BDBDBD���^000000�����c�c�B";
		next;
		switch(select("�߂��Ől�����Ȃ������H","���v�ł����H")) {
		case 1:
			misceffect 563,"�ׂ����R�l#illtur01";
			mes "[�ׂ����R�l]";
			mes "^BDBDBD�l^000000�ԁH�l��^BDBDBD��^000000�ƁH";
			mes "����Ȃ̂���^BDBDBD��^000000�󂪂Ȃ�^BDBDBD�����^000000!!";
			break;
		case 2:
			misceffect 563,"�ׂ����R�l#illtur01";
			mes "[�ׂ����R�l]";
			mes "^BDBDBD��^000000��v�H�����I";
			mes "���^BDBDBD�v��^000000��^BDBDBD��^000000������!!";
			break;
		}
		mes "�o^BDBDBD�J^000000��낤�I";
		mes "�����o�J^BDBDBD��^000000����^BDBDBD����^000000��";
		mes "��邳^BDBDBD��^000000���I";
		next;
		mes "[�ׂ����R�l]";
		mes "����^BDBDBD��^000000�����ȁc�c^BDBDBD��^000000�����c�c";
		mes "�N�X�A�N�X�N�X�c�c^FF0000�u�c^000000�A�u�c�c�c�B";
		next;
		mes "�]�ǂ�����b�������������ɂȂ��B�]";
		next;
		delquest 16098;
		if(checkquest(16097) == 0 && checkquest(16098) == 0 && checkquest(16099) == 0) {
			mes "�]���̏����������Ă��ꂽ";
			mes "�@�ꏊ��^0000CD�����ꂩ��^000000����B";
			mes "�@^0000CD���Â��v�z�{^000000��";
			mes "�@�~��ĒT���Ă݂邩�B�]";
			setquest 16100;
			set IL_TUR_QUE,3;
			close;
		}
		mes "�]���̏����������Ă��ꂽ";
		mes "�@�ꏊ���܂�����B";
		mes "�@���̏ꏊ�֍s���Ă݂悤�B";
		close;
	}
OnTalk1:
	sleep 3000;
	unittalk "�ׂ����R�l : �N�X�c�c�N�X�N�X�c�c�u�c�A�u�c�u�c�c�c�N�X�c�c";
	sleep 3000;
	unittalk "�ׂ����R�l : ���A���̕󕨁c�c�N�X�N�X�A������c�c";
	sleep 3000;
	end;
OnTalk2:
	sleep 3000;
	unittalk "�ׂ����R�l : ���Q�c�c���Q���Ȃ���c�u�c�u�c�A�u�c�A�N�X�N�X�A�N�X�N�X�N�X�c�c";
	sleep 3000;
	unittalk "�ׂ����R�l : �S���c�c���Q���Ȃ���c�s�g�ȃA�T���g�^�[�g���c�c���̕󕨂�D�����I";
	sleep 3000;
	end;
OnTalk3:
	sleep 3000;
	unittalk "�ׂ����R�l : ���̕󕨁A�s�g�ȃA�T���g�^�[�g���������Ȃ�������c�c�S���A�u�c�A�u�c�u�c�c�c";
	sleep 3000;
	unittalk "�ׂ����R�l : �N�X�N�X�A�󕨁c�c���̕󕨁c�c�u�c�c�c�u�c�u�c�A�N�X�N�X�c�c";
	sleep 3000;
	end;
}

tur_d04_i.gat,96,112,1	script	���C�̂Ȃ���#illtur01	10241,{
	switch(IL_TUR_QUE) {
	case 0:
	case 1:
	case 4:
		donpcevent "���C�̂Ȃ���#illtur01::OnTalk"+ rand(1,3);
		mes "[���C�̂Ȃ���]";
		mes "�Ђ������ł��B";
		mes "���������ɂ�����܂���B";
		mes "�ǂ������߂��b��ł��������B";
		mes "���܂�ɂ��Q���Ă܂��c�c�B";
		close;
	case 2:
	case 3:
		if(checkquest(16099) == 0){
			donpcevent "���C�̂Ȃ���#illtur01::OnTalk"+ rand(1,3);
			mes "[���C�̂Ȃ���]";
			mes "�Ђ������ł��B";
			mes "���������ɂ�����܂���B";
			mes "�ǂ������߂��b��ł��������B";
			mes "���܂�ɂ��Q���Ă܂��c�c�B";
			close;
		}
		donpcevent "���C�̂Ȃ���#illtur01::OnTalk"+ rand(1,3);
		mes "[���C�̂Ȃ���]";
		mes "�Ђ������ł��B";
		mes "���������ɂ�����܂���B";
		mes "�ǂ������߂��b��ł��������B";
		mes "���܂�ɂ��Q���Ă܂��c�c�B";
		next;
		mes "[���C�̂Ȃ���]";
		mes "���������H�ׂ�܂���ł����B";
		mes "������A�������A���̑O���B";
		mes "����ł��܂��܂��B���߂��b��ł��������B";
		mes "�ǂ����c�c�ǂ������߂��B";
		next;
		menu "�����܂�",-;
		mes "[���C�̂Ȃ���]";
		mes "���̂܂܂��Ǝ���ł��܂��܂��B";
		mes "����ł��܂��܂��B";
		mes "�Ђ������ł��B";
		mes "�Ƃ��Ă��Ђ������ł��B";
		next;
		mes "[���C�̂Ȃ���]";
		mes "���������H�ׂ�܂���ł����B";
		mes "������Q���܂����B";
		mes "�q�����Q���Ă܂��B�v���Q���Ă܂��B";
		mes "����ł��܂��܂��B";
		mes "�݂�Ȏ���ł��܂��܂���B";
		next;
		mes "�]�ǂ�����b�������������ɂȂ��B�]";
		next;
		delquest 16099;
		if(checkquest(16097) == 0 && checkquest(16098) == 0 && checkquest(16099) == 0) {
			mes "�]���̏����������Ă��ꂽ";
			mes "�@�ꏊ��^0000CD�����ꂩ��^000000����B";
			mes "�@^0000CD���Â��v�z�{^000000�ƌ����Ă����̂�";
			mes "�@�{���Ă݂悤�B-";
			setquest 16100;
			set IL_TUR_QUE,3;
			close;
		}
		mes "�]���̏����������Ă��ꂽ";
		mes "�@�ꏊ���܂�����B";
		mes "�@���̏ꏊ�֍s���Ă݂悤�B";
		close;
	case 5:
		donpcevent "���C�̂Ȃ���#illtur01::OnTalk"+ rand(1,3);
		cloakoffnpc "�l�Êw�҃C�G���t�F��#i2";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���̎��ӂł����H";
		mes "���x�������ꏊ�ł����c�c�B";
		next;
		mes "[���C�̂Ȃ���]";
		mes "�Ђ������ł��B��������߂��܂����B";
		mes "���̂܂܂��ᎀ�񂶂Ⴂ�܂��c�c�B";
		mes "�ǂ����A�ǂ��������āB";
		next;
		menu "���̕��ł�",-;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�c�c���́A�`���җl�B";
		mes "���A�N�Ƙb���Ă܂����H";
		mes "�����ɂ͖l������l�ȊO";
		mes "�N�����܂��񂪁B";
		next;
		unittalk getnpcid(0,"���C�̂Ȃ���#illtur01"),"���́A�������B";
		cloakonnpc "���C�̂Ȃ���#illtur01";
		misceffect 563,"����#illtur01";
		misceffect 847,"����#illtur01";
		cloakoffnpc "����#illtur01";
		next;
		misceffect 563,"����#illtur02";
		misceffect 847,"����#illtur02";
		cloakoffnpc "����#illtur02";
		sc_start3 SC_BLIND,0,0,0,0,10000,10;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur02"),"�������B";
		misceffect 847,"����#illtur03";
		cloakoffnpc "����#illtur03";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur03"),"��������҂��B";
		misceffect 563,"����#illtur04";
		misceffect 847,"����#illtur04";
		cloakoffnpc "����#illtur04";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur04"),"�����Ă�҂��������B";
		misceffect 847,"����#illtur05";
		cloakoffnpc "����#illtur05";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur05"),"�߂܂��āI";
		misceffect 847,"����#illtur06";
		cloakoffnpc "����#illtur06";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur06"),"�E���I";
		misceffect 563,"����#illtur07";
		misceffect 847,"����#illtur07";
		cloakoffnpc "����#illtur07";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur07"),"�o���o���ɂ���I";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�����c�c���������I";
		mes "�Ȃ񂾂悱��́I";
		next;
		sc_end SC_BLIND;
		cloakoffnpc "����#illtur02";
		mes "[����]";
		mes "���������ŁB";
		mes "���[���A�Â��ɁI";
		mes "�����~�߂āB";
		mes "�����̊w�҂�����B";
		next;
		menu "����͋T�̍b���̌��ЁH",-;
		misceffect 120,"";
		unittalk getnpcid(0,"�l�Êw�҃C�G���t�F��#i2"),"�C�G���t�F�� : �܂�������܂т��H���̂тǂ͂��łłÂ��H";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur02"),"���� : ���A�~�߂āI����Ȃ��I";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�l�Êw�҃C�G���t�F��#i2"),"�C�G���t�F�� : �͂��c�c�B";
		misceffect 120,"�l�Êw�҃C�G���t�F��#i2";
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"����#illtur01"),"�ǂ��֍s�����H";
		unittalk getnpcid(0,"����#illtur03"),"�������҂������������B";
		unittalk getnpcid(0,"����#illtur05"),"�����Ă��܂����B";
		unittalk getnpcid(0,"����#illtur07"),"�ǂ�����ď������H";
		unittalk getnpcid(0,"����#illtur04"),"�N�̎d�Ƃ��H";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"����#illtur02"),"�����Ă��܂����I";
		unittalk getnpcid(0,"����#illtur06"),"�������B���S�ɏ�����������I";
		unittalk getnpcid(0,"����#illtur04"),"�����Ă�҂����A�n�b�L�������̂ɁH";
		unittalk getnpcid(0,"����#illtur03"),"�������̂ɁA���������o�����̂ɁI";
		unittalk getnpcid(0,"����#illtur05"),"�o���o���ɂ��Ȃ�����I";
		if(!sleep2(1000)) end;
		mes "[����]";
		mes "�����A������l�̎p�������Ȃ��B";
		mes "�c�c�ǂ����֍s������_���B";
		mes "���������Řb������B";
		mes "�c�c�����ɂ����ˁH";
		next;
		mes "[����]";
		mes "���Ɂc�c�����ˁH";
		mes "�M���āB�b������B";
		mes "��x������������悭�����āB";
		next;
		mes "[����]";
		mes "��������Ɋ���";
		mes "�f����R�炳�Ȃ�����A�΂�Ȃ��B";
		mes "�o������葁���������甲���o���āB";
		mes "���������̂����ꏊ�֖߂��āB";
		next;
		mes "[����]";
		mes "���ƍŏ��ɏo�������ꏊ�A�o���Ă�H";
		mes "�҂��Ă�B";
		next;
		unittalk getnpcid(0,"����#illtur04"),"���Ȃ��B�����Ă�҂��������Ȃ��B";
		if(!sleep2(1000)) end;
		misceffect 847,"����#illtur04";
		cloakonnpc "����#illtur04";
		unittalk getnpcid(0,"����#illtur02"),"���Ȃ��A�䂪�q�c";
		if(!sleep2(1000)) end;
		misceffect 847,"����#illtur02";
		cloakonnpc "����#illtur02";
		unittalk getnpcid(0,"����#illtur06"),"�����͎��񂾎҂������Ȃ��B";
		if(!sleep2(1000)) end;
		misceffect 847,"����#illtur06";
		cloakonnpc "����#illtur06";
		unittalk getnpcid(0,"����#illtur03"),"���̕󕨁c";
		if(!sleep2(1000)) end;
		misceffect 847,"����#illtur03";
		cloakonnpc "����#illtur03";
		unittalk getnpcid(0,"����#illtur02"),"�A�낤�A�݂�ȁB";
		if(!sleep2(1000)) end;
		cloakonnpc "����#illtur02";
		unittalk getnpcid(0,"����#illtur01"),"�Ђ������c�Ђ������B";
		if(!sleep2(1000)) end;
		misceffect 847,"����#illtur01";
		cloakonnpc "����#illtur01";
		cloakoffnpc "���C�̂Ȃ���#illtur01";
		unittalk getnpcid(0,"����#illtur07"),"���������������悤�ɁB";
		if(!sleep2(1000)) end;
		misceffect 847,"����#illtur07";
		cloakonnpc "����#illtur07";
		unittalk getnpcid(0,"����#illtur05"),"���l�������c";
		if(!sleep2(1000)) end;
		misceffect 847,"����#illtur05";
		cloakonnpc "����#illtur05";
		if(!sleep2(3000)) end;
		menu "���̎q��M���܂��傤",-;
		mes "�]^424242�C�G���t�F��������";
		mes "�@�����~�߂��܂܁A�������B^000000�]";
		chgquest 16103,16104;
		set IL_TUR_QUE,6;
		close2;
		cloakonnpc "�l�Êw�҃C�G���t�F��#i2";
		end;
	}
	end;
OnTalk1:
	sleep 3000;
	unittalk "���C�̂Ȃ��� : �����Ă��������B�Ђ������ł��B�ǂ��������Ă��������B";
	sleep 3000;
	unittalk "���C�̂Ȃ��� : �������ł��H�ׂ܂�����B�ǂ������ł��b��ł��������B";
	sleep 3000;
	end;
OnTalk2:
	sleep 3000;
	unittalk "���C�̂Ȃ��� : �Ђ������ł��B�Ђ������ł��B�ǂ��������Ă��������B";
	sleep 3000;
	unittalk "���C�̂Ȃ��� : ���̂܂܂��ᎀ��ł��܂��܂��B����ł��܂��܂��B���ɂ܂��B";
	sleep 3000;
	end;
OnTalk3:
	sleep 3000;
	unittalk "���C�̂Ȃ��� : �Q�����ɂȂ��Ă��܂��܂��B�����H�ׂȂ��ƁB���ɂ܂��B";
	sleep 3000;
	unittalk "���C�̂Ȃ��� : �Ђ������ł��B�ǂ��������Ă��������B�ǂ����c�c";
	sleep 3000;
	end;
}

tur_d03_i.gat,147,170,7	script	#illturg11	844,{
	mes "["+strcharinfo(0)+"]";
	mes "�����������C���������ǁc";
	close;
}
tur_d03_i.gat,137,170,0	script	#illturgg11	139,10,10,{
	setnpcdisplay "#illturg11",796;
	unittalk getnpcid(0,"#illturg11"),"�����ǂ��H�݂�Ȃǂ��֍s�����H";
	sleep 1000;
	setnpcdisplay "#illturg11",844;
	unittalk getnpcid(0,"#illturg11"),"�A���������c�c�A���B";
	end;
}

tur_d03_i.gat,142,229,1	script	#illturg12	844,{
	mes "["+strcharinfo(0)+"]";
	mes "������Ɗ��C������悤���B";
	close;
}
tur_d03_i.gat,146,223,0	script	#illturgg12	139,10,10,{
	setnpcdisplay "#illturg12",792;
	unittalk getnpcid(0,"#illturg12"),"�R���A�R���B";
	sleep 1000;
	setnpcdisplay "#illturg12",844;
	unittalk getnpcid(0,"#illturg12"),"�A���Ă���ƌ������̂ɁH";
	end;
}

tur_d03_i.gat,214,105,7	script	#illturg13	844,{
	mes "["+strcharinfo(0)+"]";
	mes "�C�������������c";
	close;
}
tur_d03_i.gat,207,104,0	script	#illturgg13	139,10,10,{
	setnpcdisplay "#illturg13",792;
	unittalk getnpcid(0,"#illturg13"),"���́A���͂͂́A���͂́c�c";
	sleep 1000;
	setnpcdisplay "#illturg13",844;
	unittalk getnpcid(0,"#illturg13"),"���͂́c�c�́c�c�ӁA�ӂ�����c�c";
	end;
}

tur_d03_i.gat,217,73,0	warp	illtur03_04	2,2,tur_d04_i.gat,99,186
tur_d04_i.gat,99,191,0	warp	illtur04_03	2,2,tur_d03_i.gat,217,82

tur_d04_i.gat,99,153,7	script	#illturg21	844,{
	mes "�]�C�̂������B�]";
	close;
}
tur_d04_i.gat,99,160,0	script	#illturgg21	139,10,10,{
	setnpcdisplay "#illturg21",792;
	unittalk getnpcid(0,"#illturg21"),"�����͂ǂ��H�����͂ǂ��֍s�����H";
	sleep 1000;
	setnpcdisplay "#illturg21",844;
	unittalk getnpcid(0,"#illturg21"),"�N�����邩�H�����N���H";
	end;
}
tur_d04_i.gat,37,137,7	script	#illturg22	844,{
	mes "�]�����������邪�N�����Ȃ��悤���B�]";
	close;
}
tur_d04_i.gat,45,137,0	script	#illturgg22	139,{
	setnpcdisplay "#illturg22",796;
	unittalk getnpcid(0,"#illturg22"),"�͂��A�͂��A�����c�c�A�肽���c�c";
	sleep 1000;
	setnpcdisplay "#illturg22",844;
	unittalk getnpcid(0,"#illturg22"),"�N�����܂��񂩁H�N���c�c�H";
	end;
}

tur_d04_i.gat,76,35,7	script	#illturg23	844,{
	mes "�]�C���������Ȃ����B�]";
	close;
}
tur_d04_i.gat,69,31,0	script	#illturgg23	139,{
	setnpcdisplay "#illturg23",792;
	setnpcdisplay "#illturg23",844;
	unittalk getnpcid(0,"#illturg23"),"���͂͂͂͂͂͂͂͂͂͂͂͂͂�";
}

tur_d04_i.gat,135,133,1	script	#illturg24	844,{
	mes "�]�����������������C�������B�]";
	close;
}
tur_d04_i.gat,137,126,0	script	#illturgg24	139,{
	setnpcdisplay "#illturg24",796;
	unittalk getnpcid(0,"#illturg24"),"�҂��Ă��H����҂��Ă��ꂽ�H";
	sleep 1000;
	setnpcdisplay "#illturg24",844;
	unittalk getnpcid(0,"#illturg24"),"�x���A�����x���B";
	end;
}

tur_d04_i.gat,26,167,0	script	#illtur01	139,15,15,{
	if(IL_TUR_QUE == 3 || IL_TUR_QUE == 4)
		cloakoffnpc "�l�Êw�҃C�G���t�F��#t2";
	end;
}
tur_d04_i.gat,26,167,5	script	�l�Êw�҃C�G���t�F��#t2	740,{
	switch(IL_TUR_QUE) {
	case 3:
		emotion 0;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�M�����Ȃ��c�c�l�ԁA�l�Ԃł���ˁH";
		mes "�{���ɐl�Ԃł���ˁH";
		mes "�c�c�l�������ɁH";
		mes "���肪�Ƃ��������܂��B";
		mes "�����Ŗ쐂�ꎀ�ʂ��Ǝv���܂�����I";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�������A�l��";
		mes "�ǂ��Œm������ł����H";
		next;
		menu "�G�C���o�����񂩂畷���܂���",-;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes strcharinfo(0)+"����Ƌ�̂ł��ˁB";
		mes "�ӂ��c�c�G�C���o����";
		mes strcharinfo(0)+"���񂪂��Ȃ�������A";
		mes "�{���Ɏ��ʂƂ���ł����B";
		mes "^FF0000������^000000�낭�ɖ��ꂸ�H�ׂ�Ȃ��܂܁A";
		mes "�f�r���Ă��܂�������B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�l���������̂������O�̂��Ƃ��ƁH";
		mes "����͂��������ł��ˁB";
		mes "�c�c����A���蓾�邩������܂���B";
		mes "���Ȃ��Ƃ������͖l�����̒m��";
		mes "�^�[�g���A�C�����h�ł͂���܂���B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�G�C���o������b�͕����܂������H";
		mes "�l���ŏ��͔��M���^�ł�����";
		mes "�ǂ����A�����̓G�C���o���̘b����";
		mes "���ɂ����Ƃ���Ƃ����";
		mes "�ԈႢ�Ȃ��悤�ł��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�����������玞�̗��ꂳ����";
		mes "��X�̂����ꏊ�Ƃ�";
		mes "�Ⴄ��Ԃł���\��������܂��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�������������Ƃ��������܂���";
		mes "��[�A���̏ꏊ�ɖ߂�܂��傤�B";
		mes "���܂�ɔ��ʂĂĂ܂���";
		mes "�܂Ƃ��ɋL�^���c������������̂�";
		mes "�W�߂Ă��܂��B";
		next;
		emotion 32;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�����ɖ߂���肩���āH";
		mes "�������߂�܂��B";
		mes "�^�[�g���A�C�����h�̗��j�ɂ���";
		mes "�V������������������邩���m��܂����B";
		next;
		mes "�]�߂낤�Ƃ������̎��A";
		mes "�@�������Əd�����傫�ȉ���";
		mes "�@�C�G���t�F���̂�������";
		mes "�@�苿�����B�]";
		next;
		emotion 4;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���A�����c�c";
		mes "���݂܂���B�ǂ����Ă����������āc�c";
		mes "�ƂĂ����������ɂ���܂���B";
		mes "������낵����΁A���̕ӂ̃����X�^�[��";
		mes "��������Ď����Ă��Ă���܂��񂩁H";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�������������ƁA���H����";
		mes "���n�Œ��B�ł���悤�ɂȂ�܂��B";
		mes "�����ɂ̓����X�^�[�������܂���";
		mes "�{���͋T�ł�����\���H�ׂ��͂��ł��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�������c�O�Ȃ���";
		mes "�l1�l�ł͎��܂���ł����B";
		mes "������̃����X�^�[�����́A";
		mes "�l�����̒m���Ă�";
		mes "�^�[�g���A�C�����h�̂��̂��";
		mes "�����Ƌ�����������ł��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "����ł��l��T����";
		mes "�����܂ŗ��ꂽ";
		mes strcharinfo(0)+"�l�Ȃ�";
		mes "�|����̂ł͂Ȃ��ł��傤���B";
		mes "���肢���Ă��X�����ł����H";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���������X�^�[��肪";
		mes "�ʓ|�����ł�����";
		mes "�l��w�����Ă�����Ă�";
		mes "���v�ł���B";
		next;
		menu "�ǂ̃����X�^�[������Ă��܂��傤���H",-;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "����������Ă�������";
		mes "���肪�Ƃ��������܂��B";
		mes "^0000CD�s�g�ȃt���[�Y�^�[�g����";
		mes "�s�g�ȃq�[�g�^�[�g��^000000��";
		mes "^0000CD�e1�̂���^000000����ė��Ă��������B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "������^0000CD�������瓾����";
		mes "����^000000��^0000CD1��^000000���肢���܂��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���̊ԁA�l�͉΂������Ă݂܂��B";
		mes "�����Ȃ�T�o�C�o���ɒ��ނ��ƂɂȂ�Ƃ́B";
		mes "�l�͍l�Êw�҂ł���";
		mes "����̎�l���ł͂Ȃ��̂ɁB";
		chgquest 16100,16102;
		set IL_TUR_QUE,4;
		close;
	case 4:
		if(checkquest(16102) & 0x4 == 0 || countitem(7564) < 1) {
			mes "[�l�Êw�҃C�G���t�F��]";
			mes "���܂��΂��t���܂���ˁB";
			mes "�{��Ƌ��R�₷��ɂ�";
			mes "�����܂��񂵁B";
			next;
			mes "[�l�Êw�҃C�G���t�F��]";
			mes "^0000CD��������^000000�ł�";
			mes "�\���܂��񂩂�^0000CD1��^000000���肢���܂��B";
			mes "�����H�ׂȂ��ƁA�����";
			mes "���������ɂ�����܂���c�c�B";
			close;
		}
		unittalk "���A���A��Ȃ����A"+strcharinfo(0)+"�l�B";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���A���A��Ȃ���";
		mes strcharinfo(0)+"�l�B";
		mes "���������Ƃ�";
		mes "�R�₹�����ȕ��������������̂�";
		mes "���ǁA�΂������܂���ł����B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���H�����X�^�[�̓���";
		mes "�S�������Ă����̂ł����H";
		mes "���������ł��ˁB";
		mes "�����Ă郂���X�^�[��|�����̂ɁA";
		mes "���̕����������o��̂ł��傤�H";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�΂��ʂ��Ă��Ȃ������������c�c";
		mes "����ł��H�ׂ��";
		mes "�G�l���M�[�ɂ͂Ȃ�ł��傤�I";
		mes "���������c�c";
		mes "���A�������c�c";
		mes "�؂��؂��I";
		next;
		emotion 28;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�����c�c�\���󂠂�܂���c�c";
		mes "�ƂĂ��H������̂ł͂���܂���ˁB";
		mes "���ʍ���܂点�Ă��܂��܂����B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�ӂ��B������͖l�Ɩ`���҂��܈ȊO��";
		mes "�N�����Ȃ��ł���ˁH";
		mes "�����������������ł���";
		mes "^FF0000������1�l�ɂ���܂���ł���^000000�B";
		mes "�N�����Z��ł�����";
		mes "���������߂��̂ł����B";
		next;
		emotion 23;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�{���ł����A�l�Ԃ��Z��ł���ƁH";
		mes "�Z�������������̂ł��ˁH";
		mes "���₟�A�����b���Ă��������";
		mes "�ǂ������̂ɁB";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�ǂ��Ō��܂������H";
		mes "�������s���Ęb�𕷂��Ă݂܂��傤�I";
		mes "�����������Ƃ������ł��I";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�����Ȃ��H���������Ă��ł����B";
		mes "�����s���܂��傤�I";
		mes "������ƕς�����l�X�΂����";
		mes "���t���ʂ��邩������Ȃ������H";
		mes "����Ȃ���v�ł��B";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�������t���ʂ��Ȃ��Ƃ�";
		mes "�l�X�̐�������p�������";
		mes "�����邱�Ƃ͑����ł�����B";
		mes "���������s���܂��傤�I";
		mes "�ē����肢���܂��B";
		mes "��ԋ߂��ꏊ����I";
		next;
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���A���̕���������";
		mes "���Ԃ����܂��B";
		mes "�l�̎��`���t����";
		mes "���܂��Ă��܂���";
		mes "���l�ɔ��镪�ɂ�";
		mes "���Ȃ��ł��傤�B";
		next;
		emotion 20,"";
		mes "�]^FF0000���C�̂Ȃ���^000000�̂Ƃ���܂�";
		mes "�@�C�G���t�F�����ē����悤�B�]";
		chgquest 16102,16103;
		set IL_TUR_QUE,5;
		close;
	case 5:
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "���₟����ȏꏊ������Ȃ�āB";
		mes "���E�͂܂��܂�";
		mes "���m�ň��Ă܂��ˁI";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

tur_d04_i.gat,100,112,3	script	����#illtur02	10238,{
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,101,110,3	script	�l�Êw�҃C�G���t�F��#i2	740,{
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,96,112,5	script	����#illtur01	792,{
	unittalk "���́c�������Ă����񂾂�c";
	if(!sleep2(3000)) end;
	cloakonnpc "����#illtur01";
	cloakonnpc "����#illtur02";
	cloakonnpc "����#illtur03";
	cloakonnpc "����#illtur04";
	cloakonnpc "����#illtur05";
	cloakonnpc "����#illtur06";
	cloakonnpc "����#illtur07";
	if(!sleep2(1000)) end;
	cloakoffnpc "���C�̂Ȃ���#illtur01";
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,94,108,7	script	����#illtur02	796,{
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,91,111,5	script	����#illtur03	792,{
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,97,104,7	script	����#illtur04	792,{
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,107,109,3	script	����#illtur05	792,{
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,104,112,3	script	����#illtur06	796,{
	end;
OnInit:
	cloakonnpc;
	end;
}
tur_d04_i.gat,102,102,1	script	����#illtur07	796,{
	end;
OnInit:
	cloakonnpc;
	end;
}

tur_d03_j.gat,132,194,3	script	���̌Q��#illtur02	10042,{
	if(select("�A���x���^�ɖ߂�","�����Ɏc��") == 2) {
		mes "�]�܂�������";
		mes "�@���ׂ����Ƃ��c���Ă�B�]";
		close;
	}
	warp "alberta.gat",219,31;
	end;
}

tur_d03_j.gat,139,186,3	script	�i����#illtur01	10238,{
	if(checkquest(16105))
		delquest 16105;
	if(checkquest(16108)) {
		if(checkquest(16108)&0x2 == 0) {
			mes "[�i����]";
			mes "�o����c�c�܂������́H";
			mes "��p�͈���߂�����";
			mes "�����Ă��܂�����c�c";
			mes "^4d4dff���̌ߑO5�����߂�����^000000";
			mes "�܂����āB";
			next;
			mes "[�i����]";
			mes "�����o�����Y�ꂽ�Ƃ��Ă�";
			mes "��������_���B";
			mes "�c�c��΁A��΂���B";
			close;
		}
		delquest 16108;
	}
	if(checkquest(16107)) {
		if(checkquest(16110) == 0 && checkquest(16113) == 0) {
			mes "[�i����]";
			mes "�߂��݂̗z�����ɂ���";
			mes "^4d4dff�ׂ����R�l^000000��";
			mes "���Â��v�z�{�ɂ���";
			mes "^4d4dff���C�̂Ȃ���^000000��";
			mes "�肢���Ƃ������Ă����āB";
			next;
			mes "[�i����]";
			mes "�o����B";
			mes "�C��t���ĂˁB";
			close;
		}
		cloakoffnpc "�l�Êw�҃C�G���t�F��#i3";
		mes "[�i����]";
		mes "�ނ�̊肢���Ƃ�";
		mes "�����Ă��ꂽ�񂾂ˁB";
		mes "���肪�Ƃ��o����B";
		next;
		mes "[�i����]";
		mes "����͍����̖񑩂̏؁B";
		mes "�����A�o����B";
		mes "�܂����Ă���āc�c���肪�Ƃ��B";
		mes "�������҂��Ă邩��B";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�l�Êw�҃C�G���t�F��#i3"),"�C�G���t�F�� : �܂������A�i��������B";
		close2;
		if(checkquest(16110))
			delquest 16110;
		if(checkquest(16113))
			delquest 16113;
		delquest 16107;
		setquest 16108;
		getitem 25271,2;
		getexp 100000000,0,1;
		getexp 0,20000000,0;
		if(!sleep2(1000)) end;
		cloakonnpc "�l�Êw�҃C�G���t�F��#i3";
		end;
	}
	if(select("�}���Řb��(��b�X�L�b�v)","�������b��") == 2) {
		mes "[����]";
		mes "���m��ʐl�B";
		mes "�댯�Ȗڂɂ����O��";
		mes "��������o�Ă��āB";
		next;
		mes "[�i����]";
		mes "�c�c�܂��N�������B";
		next;
		cloakoffnpc "�l�Êw�҃C�G���t�F��#i3";
		mes "[�l�Êw�҃C�G���t�F��]";
		mes "�l�����܂����B";
		mes "�����C�ł������H";
		mes "�i��������B";
		next;
		mes "[�i����]";
		mes "�c�c�B";
		next;
		mes "[�i����]";
		mes "�c�c�c�c�B";
		next;
		mes "[�i����]";
		mes "�c�c�c�c�c�c�c�c�B";
		next;
		mes "[�i����]";
		mes "�c�c�c�c�c�c�c�c�����B";
		next;
		emotion 4;
		mes "[�i����]";
		mes "�c�c�܂��c�c";
		mes "�Y��Ă��܂����c�c�B";
		next;
		mes "[�i����]";
		mes "���A�o���Ă�Ԃ�";
		mes "�����Ƒ҂��Ă����c�c�m���ɁB";
		mes "���肪�Ƃ��c�c";
		mes "�܂����Ă���āA�������B";
		next;
		mes "[�i����]";
		mes "�c�c������";
		mes "��p�������Ă�����B";
		mes "���������̐l�̂Ƃ��s����ˁH";
		next;
		mes "[�i����]";
		mes "�߂��݂̗z�����ɂ���";
		mes "^4d4dff�ׂ����R�l^000000��";
		mes "���Â��v�z�{�ɂ���";
		mes "^4d4dff���C�̂Ȃ���^000000��";
		mes "�肢���Ƃ������Ă����āB";
		next;
	}
	else {
		cloakoffnpc "�l�Êw�҃C�G���t�F��#i3";
	}
	mes "[�i����]";
	mes "��������l�������Ȃ悤�Ɂc�c�B";
	misceffect 778;
	if(!sleep2(1000)) end;
	misceffect 778,"";
	misceffect 778,"�l�Êw�҃C�G���t�F��#i3";
	misceffect 877,"";
	misceffect 877,"�l�Êw�҃C�G���t�F��#i3";
	setquest 16107;
	if(!sleep2(1000)) end;
	cloakonnpc "�l�Êw�҃C�G���t�F��#i3";
	close;
}

tur_d03_j.gat,136,187,5	script	�l�Êw�҃C�G���t�F��#i3	740,{
	end;
OnInit:
	cloakonnpc;
	end;
}

tur_d03_j.gat,80,180,1	script	�C�̑����j#illtur02	10239,{
	mes "[�C�̑����j]";
	mes "�Ȃ�����������A�Ȃ�����������B";
	mes "�䂪�q�B�䂪�������q�B";
	mes "�ǂ��֍s�����́H�䂪�q�B";
	mes "���O�����������̉䂪���B";
	mes "���H�䂪�q�B";
	next;
	mes "[�C�̑����j]";
	mes "�N���H";
	mes "�䂪�q�A�N���H";
	close;
}

tur_d03_j.gat,235,187,7	script	�ׂ����R�l#illtur02	10240,{
	if(checkquest(16110)) {
		mes "[�ׂ����R�l]";
		mes "�Ӂc�c�ӂӁc�c�ӂ�^BDBDBD��^000000�Ӂc�c";
		mes "�ӂ�^BDBDBD��^000000�ӂӂӁc�c�B";
		mes "�s�J�s�J�c�c�s�J�s�J����c�c";
		mes "�Y��A�Ƃ��Ă��Y�킾�B";
		next;
		mes "�]�ڂ�ڂ�̋����Ђ�";
		mes "�@�����Ȃ悤���B�]";
		close;
	}
	if(checkquest(16109)) {
		if(checkquest(16109)&0x4 == 0 || countitem(25316) < 10) {
			misceffect 563;
			mes "[�ׂ����R�l]";
			mes "^FF0000����Ȃ�!!^000000";
			next;
			mes "[�ׂ����R�l]";
			mes "^FF0000���́A�󕨁c�c���̕��Q�c�c�B";
			mes "����Ȃ��A����Ȃ�!!^000000";
			next;
			mes "�]�s�g�ȃq�[�g�^�[�g���A";
			mes "�@�s�g�ȃt���[�Y�^�[�g����";
			mes "�@10�̓������A�ڂ�ڂ�̋����Ђ�";
			mes "�@10�����Ă��悤�B�]";
			close;
		}
		mes "[�ׂ����R�l]";
		mes "���Q�����H���̊��X����^BDBDBD�z��^000000�ɁH";
		mes "�����ĉ��́A�󕨁c�c^FF0000�u�c�u�c^000000�A�u�c";
		mes "�c�c�󕨂�������^BDBDBD��^000000���H";
		next;
		misceffect 563;
		mes "[�ׂ����R�l]";
		mes "^FF0000�����񂱂�^000000�I���̕󕨁I";
		next;
		mes "[�ׂ����R�l]";
		mes "�Ӂc�c�ӂӁc�c�ӂ�^BDBDBD��^000000�Ӂc�c";
		mes "�ӂ�^BDBDBD��^000000�ӂӂӁc�c�B";
		mes "�s�J�s�J�c�c�s�J�s�J����c�c";
		mes "�Y��A�Ƃ��Ă��Y�킾�B";
		delitem 25316,10;
		delquest 16109;
		setquest 16110;
		close;
	}
	if(checkquest(16107)) {
		mes "[�ׂ����R�l]";
		mes "�N�X�N�X�c�c^FF0000�u�c^000000�A�u�c�B";
		mes "^FF0000�N�X�N�X^000000�c�c�B";
		mes "���̂�^BDBDBD��^000000�݂�����";
		mes "����^BDBDBD�X^000000�^�[�������Ȃ�������c�c�B";
		next;
		mes "[�ׂ����R�l]";
		mes "���c�c�S���A���̕���^BDBDBD�Ȃ�^000000��^BDBDBD�͂�^000000�Ȃ̂Ɂc�c�B";
		mes "���c�c���̕�^BDBDBD��^000000���c�c";
		mes "^FF0000�N�X�N�X^000000�c�c�B";
		next;
		menu "�������߂��܂��傤",-;
		mes "[�ׂ����R�l]";
		mes "���O���H���O^BDBDBD��^000000�s�����ƁH";
		mes "�s����^BDBDBD���^000000�߂��I";
		mes "���̕�^BDBDBD��^000000�I";
		mes "�z�炪�����Ă���͂����I";
		mes "�厖�ȕ�^BDBDBD^000000�I";
		next;
		mes "[�ׂ����R�l]";
		mes "�����^0000CD�s�g�ȃq�[�g�^�[�g��^000000��";
		mes "^0000CD�s�g�ȃt���[�Y�^�[�g��^000000��";
		mes "10�́c�c�����I����^BDBDBD��^000000���܂�!!";
		mes "����^BDBDBD��^000000���܂�!!";
		next;
		if(select("������܂���","�܂����") == 2) {
			mes "[�ׂ����R�l]";
			mes "�N�X�N�X�c�c";
			mes "^FF0000�u�c^000000�A�u�c�B^FF0000�N�X�N�X^000000�c�c";
			mes "���̂�^BDBDBD��^000000�݂�����";
			mes "����^BDBDBD�X^000000�^�[�������Ȃ�������c�c�B";
			next;
			mes "[�ׂ����R�l]";
			mes "���c�c�S���A���̕���";
			mes "^BDBDBD�Ȃ�^000000��^BDBDBD�͂�^000000�Ȃ̂Ɂc�c";
			mes "���c���̕�^BDBDBD��^000000���c�c";
			mes "^FF0000�N�X�N�X^000000�c�c�B";
			close;
		}
		mes "[�ׂ����R�l]";
		mes "^FF0000���Q^000000�c�c�N�X�N�X";
		mes "�c�c���̕��Q^BDBDBD��^000000���Ă���c�c�B";
		setquest 16109;
		close;
	}
	mes "[�ׂ����R�l]";
	mes "��^BDBDBD��^000000��c�c����^BDBDBD��^000000�������c�c�{���I";
	mes "^BDBDBD����^000000�Ă���?!���́I";
	mes "���͎���^BDBDBD��^000000�ɁI";
	mes "��邳^BDBDBD�Ȃ�^000000�I�T��^BDBDBD�o��^000000��";
	mes "^BDBDBD�E^000000���Ă��!!";
	mes "^FF0000�N�X^000000�c�c�N�X�N�X�c�c�B";
	close;
}

tur_d04_j.gat,96,112,1	script	���C�̂Ȃ���#illtur02	10241,{
	if(checkquest(16113)) {
		mes "[���C�̂Ȃ���]";
		mes "�����A�����������ς��B";
		mes "����Ŏ��ȂȂ��B�����������ς��B";
		mes "���肪�Ƃ��B";
		next;
		mes "�]���͂��������ς���";
		mes "�@�������Ă���悤���B�]";
		close;
	}
	if(checkquest(16111)) {
		if(checkquest(16111)&0x4 == 0 || countitem(7564) < 10) {
			mes "[���C�̂Ȃ���]";
			mes "�������肢���܂��B";
			mes "�^�[�g���������B";
			mes "^0000CD�s�g�ȃA�T���g�^�[�g���A";
			mes "�s�g��P�^�[�g����10�̂��B^000000";
			mes "�����Ă��Ă��������B";
			mes "^0000CD����������10�B^000000";
			close;
		}
		mes "[���C�̂Ȃ���]";
		mes "�����A�����̓������B";
		mes "�����̓����B";
		mes "�����������A�Ƃ��Ă������������B";
		mes "�������������B";
		mes "�Ђ������ł��B�����B";
		next;
		mes "[���C�̂Ȃ���]";
		mes "�R�c�b�A�o���A�o���o��";
		mes "�����Ⴍ����A��������c�c�B";
		mes "�����A�����������ς��B";
		mes "����Ŏ��ȂȂ��B�����������ς��B";
		mes "���肪�Ƃ��B";
		delitem 7564,10;
		delquest 16111;
		setquest 16113;
		close;
	}
	if(checkquest(16107)) {
		mes "[���C�̂Ȃ���]";
		mes "�Ђ������ł��B";
		mes "�����Ă��������A�ǂ����B";
		mes "�Ђ������ł��B";
		next;
		menu "�ǂ������炢���ł����H",-;
		mes "[���C�̂Ȃ���]";
		mes "�����Ă���܂����H�{���ɁH";
		mes "�Q���Ď��ȂȂ��悤��";
		mes "�����Ă���܂����H";
		next;
		mes "[���C�̂Ȃ���]";
		mes "����Ȃ�������肢���܂��B";
		mes "�^�[�g���������B";
		mes "^0000CD�s�g�ȃA�T���g�^�[�g��^000000�A";
		mes "^0000CD�s�g�ȃp�[���b�g�^�[�g��^000000��10�̂��B";
		mes "�����Ă��Ă��������B";
		mes "^0000CD����������10�B^000000";
		next;
		if(select("������܂���","�܂����") == 2) {
			mes "[���C�̂Ȃ���]";
			mes "����ł͎��A���񂶂Ⴂ�܂��B";
			mes "�����Q���Ď��ɂ܂��B";
			next;
			mes "[���C�̂Ȃ���]";
			mes "^FF0000���ł��H�ׂ�̂ɁB";
			mes "�{���ɉ��ł��H�ׂ��̂ɁB";
			mes "���肩��ۂ�ۂ��";
			mes "���ݍӂ��z������ŐH�ׂ��̂ɁB^000000";
			close;
		}
		mes "[���C�̂Ȃ���]";
		mes "���肪�Ƃ��B";
		mes "���A�H�ׂ��玀�ɂ܂���B";
		mes "�����Ɛ�����܂��B";
		mes "�����Ɓc�c������";
		mes "�����Ă����܂���B";
		setquest 16111;
		close;
	}
	mes "[���C�̂Ȃ���]";
	mes "�Ђ������ł��B";
	mes "�Ђ�������";
	mes "���������ɂ�����܂���B";
	mes "�ǂ����c�c�ǂ���";
	mes "���߂��b��ł��������B";
	mes "���܂�ɂ������Q���Ă܂��c�c�B";
	next;
	mes "�]�b��������̂͊댯�������B";
	mes "�@��Ƀi�����Ɏ�p��";
	mes "�@�|���Ă�����Ă��悤�B�]";
	close;
}

tur_d04_j.gat,26,167,5	script	�l�Êw�҃C�G���t�F��#i4	740,{
	mes "[�l�Êw�҃C�G���t�F��]";
	mes "����ɂ���";
	mes strcharinfo(0)+"����B";
	mes "���������܂����ˁB";
	next;
	mes "[�l�Êw�҃C�G���t�F��]";
	mes "���тƐ����̓A���x���^��";
	mes "�Ƃ�悤�ɂ��Ă��܂��B";
	mes "�����̐��̂������������܂ł�";
	mes "�W���m�[�ɖ߂�����";
	mes "����܂��񂩂�ˁB";
	next;
	emotion 4,"";
	mes "[�l�Êw�҃C�G���t�F��]";
	mes "���A����������";
	mes "�����Y��܂�����";
	mes "�l�͒����x�ɒ��ł��̂�";
	mes "���Ƃ̐S�z�͂���܂����B";
	close;
}

tur_d03_j.gat,217,73,0	warp	illtur03_04	2,2,tur_d04_j.gat,99,186
tur_d04_j.gat,99,191,0	warp	illtur04_03	2,2,tur_d03_j.gat,217,82

tur_d03_j.gat,0,0,0	script	#IllTurtleIsland01	-1,{
OnInit:
	for(set '@i,0;'@i<10;set '@i,'@i+1)
		areamonster "tur_d03_j.gat",0,0,0,0,"--ja--",rand(2)? 3801: 3803,1,"::OnSummon";
	end;
OnSummon:
	if('mob == 0 && rand(500) == 0) {
		set 'mob,areacallmonster("tur_d03_j.gat",0,0,0,0,"�s�g�ȃ\���b�h�^�[�g��",3802,strnpcinfo(0)+"::OnKilled");
		unittalk 'mob,"�s�g�ȃ\���b�h�^�[�g�� : �c�c�B";
	}
	else {
		areamonster "tur_d03_j.gat",0,0,0,0,"--ja--",rand(2)? 3801: 3803,1,"::OnSummon";
	}
	end;
OnKilled:
	set 'mob,0;
	areamonster "tur_d03_j.gat",0,0,0,0,"--ja--",rand(2)? 3801: 3803,1,"::OnSummon";
	end;
}

tur_d04_j.gat,0,0,0	script	#IllTurtleIsland02	-1,{
OnInit:
	for(set '@i,0;'@i<10;set '@i,'@i+1)
		areamonster "tur_d04_j.gat",0,0,0,0,"--ja--",rand(2)? 3799: 3800,1,"::OnSummon";
	end;
OnSummon:
	if('mob == 0 && rand(500) == 0) {
		set 'mob,areacallmonster("tur_d04_j.gat",0,0,0,0,"�s�g�ȃ\���b�h�^�[�g��",3802,strnpcinfo(0)+"::OnKilled");
		unittalk 'mob,"�s�g�ȃ\���b�h�^�[�g�� : �c�c�B";
	}
	else {
		areamonster "tur_d04_j.gat",0,0,0,0,"--ja--",rand(2)? 3799: 3800,1,"::OnSummon";
	}
	end;
OnKilled:
	set 'mob,0;
	areamonster "tur_d04_j.gat",0,0,0,0,"--ja--",rand(2)? 3799: 3800,1,"::OnSummon";
	end;
}
