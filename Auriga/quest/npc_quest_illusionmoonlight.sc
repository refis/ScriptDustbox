pay_d03_i.gat,100,75,60,40	monster	�{��̋����		3759,10,5000,0,0
pay_d03_i.gat,100,75,60,40	monster	�����̃��i�b�N		3760,15,5000,0,0
pay_d03_i.gat,100,75,60,40	monster	�����̃{���S��		3761,15,5000,0,0
pay_d03_i.gat,100,75,60,40	monster	�����̃\�q�[		3762,16,5000,0,0
pay_d03_i.gat,100,75,60,40	monster	������A�X�P���g��	3763,10,5000,0,0
pay_d03_i.gat,100,200,60,60	monster	�{��̋����		3759,10,5000,0,0
pay_d03_i.gat,100,200,60,60	monster	�����̃��i�b�N		3760,16,5000,0,0
pay_d03_i.gat,100,200,60,60	monster	�����̃{���S��		3761,16,5000,0,0
pay_d03_i.gat,100,200,60,60	monster	�����̃\�q�[		3762,16,5000,0,0
pay_d03_i.gat,100,200,60,60	monster	������A�X�P���g��	3763,10,5000,0,0
pay_d03_i.gat,210,220,60,40	monster	�{��̋����		3759,10,5000,0,0
pay_d03_i.gat,210,220,60,40	monster	�����̃��i�b�N		3760,15,5000,0,0
pay_d03_i.gat,210,220,60,40	monster	�����̃{���S��		3761,16,5000,0,0
pay_d03_i.gat,210,220,60,40	monster	�����̃\�q�[		3762,16,5000,0,0
pay_d03_i.gat,210,220,60,40	monster	������A�X�P���g��	3763,10,5000,0,0
pay_d03_i.gat,0,0,0,0	monster	�{��̋����		3759,20,5000,0,0
pay_d03_i.gat,0,0,0,0	monster	�����̃��i�b�N		3760,32,5000,0,0
pay_d03_i.gat,0,0,0,0	monster	�����̃{���S��		3761,32,5000,0,0
pay_d03_i.gat,0,0,0,0	monster	�����̃\�q�[		3762,32,5000,0,0
pay_d03_i.gat,0,0,0,0	monster	������A�X�P���g��	3763,20,5000,0,0
pay_d03_i.gat,154,112,0,0	monster	�E�B�X�p�[		1185,1,1800000,0,1
pay_d03_i.gat,161,117,0,0	monster	�E�B�X�p�[		1185,1,1800000,0,1
pay_d03_i.gat,81,61,0,0		monster	�E�B�X�p�[		1185,1,1800000,0,1
pay_d03_i.gat,84,63,0,0		monster	�E�B�X�p�[		1185,1,1800000,0,1
pay_d03_i.gat,228,61,4,4	monster	�Ԃ���			1078,1,600000,300000,1
pay_d03_i.gat,138,42,4,4	monster	����			1079,1,600000,300000,1
pay_d03_i.gat,120,186,4,4	monster	�ΐF��			1080,1,600000,300000,1
pay_d03_i.gat,88,35,4,4		monster	���F��			1081,1,600000,300000,1
pay_d03_i.gat,0,0,0,0		monster	�{��̌����	3758,1,3600000,25200000,1

payon.gat,164,229,5	script	���V�T������#ilp01	78,{
	if(BaseLevel < 170) {
		mes "[�T������]";
		mes "��������������";
		mes "�N���Ă���\�������܂��B";
		mes "�N���������������`���҂Ȃ�";
		mes "�b�����Ă݂邪�c�c�c�O���B";
		next;
		mes "- ^4d4dffBaseLv170�ȏ�̎�";
		mes "  �i�s�\�ȃN�G�X�g�ł��B^000000 -";
		close;
	}
	if(IL_MOON_QUE == 0) {
		mes "[�T������]";
		mes "����̌��͎������̎�ɂ�";
		mes "�����Ȃ��悤���B";
		mes "����ł�������ڂ��B";
		next;
		mes "[�W���M����]";
		mes "�Ώ��@���l����ɂ�";
		mes "��񂪑���Ă��Ȃ��B";
		mes "�܂��̓��q������";
		mes "�҂��Ƃɂ��悤�B";
		mes "�������Ɨǂ��̂����B";
		next;
		menu "����",-;
		mes "[�T������]";
		mes "���ށH�`���҂ł͂Ȃ����B";
		mes "�������̘b��";
		mes "�����Ă����̂��H";
		next;
		mes "[�T������]";
		mes "�c�c�ӂށA�������B";
		mes "������S�Đ_�l��";
		mes "�ӌ��Ȃ̂��낤�B";
		mes "�Ђ���Ƃ�����N����������";
		mes "�͂ɂȂ邩������Ȃ��B";
		next;
		mes "[�T������]";
		mes "�t�F�C�����̗��̕��ɂ���|�葺��";
		mes "���A������̂͒m���Ă��邩�H";
		mes "�����ł͒���I��";
		mes "�S�삽��������邩��";
		mes "�򉻋V�����s���Ă���񂾁B";
		next;
		mes "[�T������]";
		mes "�������������l���Ă���";
		mes "����ς̉��O�������̂��낤�B";
		mes "�ς̍����򉻂��悤�Ƃ����";
		mes "�򉻂��Ă���҂�";
		mes "�ς̍����ڂ��Ă��܂�";
		mes "�����ɂ��Ȃ���Ă����B";
		next;
		mes "[�T������]";
		mes "����͂��ɋC���������܂�";
		mes "���A�ɑ����čs���Ă��܂����񂾁B";
		mes "������S�z�ł��傤���Ȃ��B";
		next;
		menu "���q��������̂��Ƃł����H",-;
		mes "[�T������]";
		mes "���q�����̓\�E�������J�[���B";
		mes "�����͒T���Ɍ���������";
		mes "���m�����A�߂��ɗ��Ă���̂�";
		mes "���v���Ƃ͎v�����B";
		next;
		mes "[�W���M����]";
		mes "�������ȁB������";
		mes "�����ꂪ���邩������Ȃ��B";
		mes "�N�������ɍs���Ė����Ȃ̂�";
		mes "�m�F���Ă���Ȃ����H";
		next;
		if(select("������܂���","���������|���̂Ŗ����ł�") == 2) {
			mes "[�T������]";
			mes "������������";
			mes "���������ł�ƌ������H";
			mes "���������H";
			close;
		}
		mes "[�W���M����]";
		mes "���m�������Ɍ����鎖��";
		mes "�o�����Ȃ�ǂ����A";
		mes "���ꂪ�o���Ȃ������Ȃ�";
		mes "���A�̉��ɂ���p���܂�";
		mes "�s���Ă��܂����͂����B";
		next;
		mes "[�W���M����]";
		mes "��U�A���A�߂��Ƀ��q�����ƕ��m��";
		mes "�o�ė��Ă��邩�m�F���Ă���B";
		mes "�Ⴂ�w�m�����ǂ��čs��������";
		mes "����ς�C�����Ȃ�����ȁB";
		next;
		mes "[�W���M����]";
		mes "���̊w�m�ɉ����";
		mes "����𒮂��Ă݂�̂������B";
		setquest 7776;
		set IL_MOON_QUE,1;
		next;
		mes "- �w�m�̂Ƃ����";
		mes "  �������܂����H -";
		next;
		if(select("������","��ɂ���") == 2) {
			mes "- ��ɂ��悤 -";
			close;
		}
		mes "- �w�m�̌��Ɍ������� -";
		close2;
		warp "pay_arche.gat",48,133;
		end;
	}
	else if(IL_MOON_QUE == 1) {
		mes "[�W���M����]";
		mes "���m�������Ɍ����鎖��";
		mes "�o�����Ȃ�ǂ����A";
		mes "���ꂪ�o���Ȃ������Ȃ�";
		mes "���A�̉��ɂ���p���܂�";
		mes "�s���Ă��܂����͂����B";
		next;
		mes "[�W���M����]";
		mes "��U�A���A�߂��Ƀ��q�����ƕ��m��";
		mes "�o�ė��Ă��邩�m�F���Ă���B";
		mes "�Ⴂ�w�m�����ǂ��čs��������";
		mes "����ς�C�����Ȃ�����ȁB";
		next;
		mes "[�W���M����]";
		mes "���̊w�m�ɉ����";
		mes "����𒮂��Ă݂�̂������B";
		next;
		mes "- �w�m�̂Ƃ����";
		mes "  �������܂����H -";
		next;
		if(select("������","��ɂ���") == 2) {
			mes "- ��ɂ��悤 -";
			close;
		}
		mes "- �w�m�̌��Ɍ������� -";
		close2;
		warp "pay_arche.gat",48,133;
		end;
	}
	mes "[�T������]";
	mes "�債�����ƂȂ���΂������B";
	mes "����H���R�ɂ��铴�A�̘b���B ";
	mes "�����ŋN���Ă��鎖�̂�����";
	mes "�F�X�Y�݂������č����Ă���B";
	close;
}

payon.gat,167,229,3	script	���V�W���M����#ilp02	901,{
	if(IL_MOON_QUE == 0) {
		mes "[�W���M����]";
		mes "�܂��̓��q������҂��Ƃɂ��悤�B";
		mes "���̎҂������łȂ��ƁB";
		close;
	}
	else if(IL_MOON_QUE == 1) {
		mes "[�W���M����]";
		mes "�܂��͋|�葺�ɂ��铴�A��";
		mes "������֌������Ă݂Ȃ����B";
		mes "�Ⴂ�w�m�������烀�q������";
		mes "�s���𕷂��Ă݂��炢���B";
		close;
	}
	mes "[�W���M����]";
	mes "��͂肱�ꂩ��̂��Ƃ�";
	mes "�Ⴂ�҂����ɔC���ׂ����ȁB";
	mes "�N��̏o�開�ł͂Ȃ��B";
	close;
}

pay_arche.gat,48,137,3	script	�N�w�m#ilp03	92,{
	if(IL_MOON_QUE == 0) {
		unittalk "�N�w�m : �ǂ����ďo�Ă��Ȃ��񂾁c�c",1;
		end;
	}
	else if(IL_MOON_QUE == 1) {
		mes "[�N�w�m]";
		mes "����ȍK�^���N����Ȃ�āI";
		mes "���������ɑ҂��Ă������̂悤��";
		mes "�`���҂��ڂ̑O�Ɍ����Ƃ́I";
		next;
		mes "[�N�w�m]";
		mes "���������ɖ`���҂�";
		mes "�F��Ȏd������X�̑����";
		mes "���߂Ă����Ƃ����͖̂{���ł����H";
		next;
		menu "���łɎd�����󂯂Ă���",-;
		mes "[�N�w�m]";
		mes "�c�c�����ł����B";
		mes "�Z�����݂����ł��ˁB";
		mes "��ώ��炵�܂����B";
		mes "�����ɂ͉��p��";
		mes "��������������ł����H";
		next;
		menu "���q���������܂���ł������H",-;
		mes "[�N�w�m]";
		mes "���q�����H�\�E�������J�[��";
		mes "���q�����̂��Ƃł����H";
		mes "����A�܂������ȃ\�E�������J�[�ł͂Ȃ�";
		mes "�C�����̐g�ł����c�c�B";
		next;
		mes "[�N�w�m]";
		mes "�򉻂����Ă������q������";
		mes "�����ɜ߂�����";
		mes "���A�̉��܂œ����Ă��܂����̂�";
		mes "�W���E�q�c�c����A";
		mes "���m���T���ɓ������̂ł���";
		mes "�܂����̒m�点������܂���B";
		next;
		mes "[�N�w�m]";
		mes "����2�l�̋A���������";
		mes "�҂��Ă����̂ł���";
		mes "���܂�ɂ����������Ȃ�����";
		mes "�ʂ̐l��T����";
		mes "�T���Ɍ����킹�邩�ǂ���";
		mes "�Y��ł����Ƃ���ł����B";
		next;
		mes "[�N�w�m]";
		mes "�������Ȃ���΂����ł����c";
		cloakoffnpc "���q����#ilp04";
		cloakoffnpc "���m�V���W���E�q#ilp05";
		set '@dummy,sleep2(2000);
		unittalk "�N�w�m : �o�ė��܂����I�����݂����ł��I",1;
		set '@dummy,sleep2(2000);
		unittalk getnpcid(0,"���q����#ilp04"),"���q���� : �����I������߂�I�򉻂Ȃ񂩂�߂�������!!",1;
		set '@dummy,sleep2(100);
		unittalk getnpcid(0,"���m�V���W���E�q#ilp05"),"���m�V���W���E�q : �c�c�B",1;
		next;
		mes "[���q����]";
		mes "����A�z�h�j�H";
		mes "�N�͂ǂ����Ă����ɂ���́H";
		next;
		mes "[�N�w�m]";
		mes "����͐S�z����������c�c�B";
		next;
		mes "[���q����]";
		mes "�S�z���ƌ������ɂ�";
		mes "�����ł������Ă���̂�";
		mes "����t�Ȃ�ł���H";
		mes "�z�h�j�ɐS�z���Ă��炤";
		mes "�؍����͂Ȃ�����B";
		set '@dummy,sleep2(2000);
		unittalk getnpcid(0,"���m�V���W���E�q#ilp05"),"���m�V���W���E�q : �K���ɂ���Ă�B",1;
		set '@dummy,sleep2(100);
		unittalk "�N�w�m : ������ƁA�����Ȃ����B",1;
		next;
		mes "[���q����]";
		mes "���I�����������߂��B";
		mes "���Ȃ�����ꂽ����";
		mes "����ɓ`���Ă����āI";
		mes "���ꂶ�Ⴀ�o�C�o�C�I";
		next;
		cloakonnpc "���q����#ilp04";
		mes "[�N�w�m]";
		mes "�c�c�ڂ����b��";
		mes "�������Ȃ���";
		mes "�s���Ă��܂��܂����ˁB";
		set '@dummy,sleep2(1000);
		unittalk getnpcid(0,"���m�V���W���E�q#ilp05"),"���m�V���W���E�q : �ӂ��A����ł͎�������Ŏ��炷��B��U���q������ǂ�����A���V�����ɓ`���Ă���B",1;
		set '@dummy,sleep2(1000);
		cloakonnpc "���m�V���W���E�q#ilp05";
		next;
		mes "[�N�w�m]";
		mes "���킠�I�W���E�q�܂ŁI";
		mes "���������Ζ`���җl";
		mes "���q�����ɗp���������";
		mes "�����Ă����̂ł́H";
		next;
		menu "�߂邵���Ȃ�",-;
		mes "[�N�w�m]";
		mes "���q�����͑���^4d4dff�t�F�C�������{^000000�֌��������Ǝv���܂��B";
		mes "�ꏏ�ɍs���܂��񂩁H";
		chgquest 7776,7777;
		set IL_MOON_QUE,2;
		next;
		if(select("�ꏏ�ɍs��","�ʁX�ɍs��") == 2) {
			mes "[�N�w�m]";
			mes "���q�����͑���";
			mes "^4d4dff�t�F�C�������{^000000��";
			mes "���������Ǝv���܂��B";
			mes "�����ɍs���ďڂ����b��";
			mes "�����Ă݂邱�Ƃɂ��܂��傤�B";
			mes "���V�����ɂ͎����`���Ă����܂��B";
			close;
		}
		mes "[�N�w�m]";
		mes "���ꂶ�ᗣ�{�ւƁc";
		close2;
		warp "payon.gat",105,320;
		end;
	}
	else if(IL_MOON_QUE == 2) {
		mes "[�N�w�m]";
		mes "���q�����͑���^4d4dff�t�F�C�������{^000000�֌��������Ǝv���܂��B";
		mes "�ꏏ�ɍs���܂��񂩁H";
		next;
		if(select("�ꏏ�ɍs��","�ʁX�ɍs��") == 2) {
			mes "[�N�w�m]";
			mes "���q�����͑���";
			mes "^4d4dff�t�F�C�������{^000000��";
			mes "���������Ǝv���܂��B";
			mes "�����ɍs���ďڂ����b��";
			mes "�����Ă݂邱�Ƃɂ��܂��傤�B";
			mes "���V�����ɂ͎����`���Ă����܂��B";
			close;
		}
		mes "[�N�w�m]";
		mes "���ꂶ�ᗣ�{�ւƁc";
		close2;
		warp "payon.gat",105,320;
		end;
	}
	else if(IL_MOON_QUE < 6) {
		mes "[�N�w�m]";
		mes "���̐́A���𒷂��ςݏグ���_�b��";
		mes "����ςɂȂ����炵���ł��B";
		mes "���̎q��������ԂɂȂ���";
		mes "�Ƃ����b������܂��B";
		mes "�\���Ɍ������Ă݂鉿�l�̂���";
		mes "�b���ƍl���Ă��܂��B";
		close;
	}
	else if(IL_MOON_QUE >= 6) {
		mes "[�N�w�m]";
		mes "�p���ɑ����������I";
		mes "�ꏏ�ɍs���܂����H";
		next;
		if(select("�ꏏ�ɍs��","�ʁX�ɍs��") == 2) {
			mes "[�N�w�m]";
			mes "����ł͎��������W���E�q���Ă��";
			mes "�����Ɍ��ǂ��čs���悤�ɂ��܂��I";
			close;
		}
		mes "[�N�w�m]";
		mes "�����A�����s���܂��傤�I";
		close2;
		warp "pay_dun03.gat",145,43;
		end;
	}
}

pay_arche.gat,46,135,5	script	���q����#ilp04	644,{
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_arche.gat,44,133,7	script	���m�V���W���E�q#ilp05	708,{
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,103,322,4	script	�t�F�C�������m #ilp06	708,{
	if(IL_MOON_QUE == 2) {
		mes "[�W���E�q]";
		mes "�O�ɓ��A�̑O�Ō���";
		mes "�`���҂���Ȃ����B";
		mes "���q������T���ɗ����Ȃ�";
		mes "���ɓ����Ă݂�B";
		close;
	}
	mes "[���m]";
	mes "�����̓t�F�C�������{�ł��B";
	close;
}

payon_in03.gat,33,95,3	script	���q����#ilp07	644,{
	if(IL_MOON_QUE < 2) {
		mes "[���q����]";
		mes "�C�F�W�����搶��T���ɗ����Ȃ�";
		mes "�����Ɖ��̕����ɍs���ĉ������B";
		close;
	}
	else if(IL_MOON_QUE == 2) {
		unittalk "���q���� : �����炢����b���Ă����͂������܂���I",1;
		set '@dummy,sleep2(3000);
		unittalk "���q���� : ����ł����O��ڂł���B�������̈����Ƃ͊ւ�肽���Ȃ��ł��B",1;
		set '@dummy,sleep2(100);
		unittalk getcharid(3),strcharinfo(0)+ " : �����H",1;
		set '@dummy,sleep2(100);
		unittalk getnpcid(0,"�N�w�m#ilp08"),"�N�w�m : �����H",1;
		set '@dummy,sleep2(3000);
		unittalk "���q���� : �ς̈�������B�����ɋ���ςƌ���Ԃ������񂾁B",1;
		set '@dummy,sleep2(2000);
		unittalk "���q���� : �ƂĂ��������e�������B��x�Ƃ���Ȍo�����������Ȃ��B",1;
		set '@dummy,sleep2(3000);
		unittalk getnpcid(0,"�W���M����#ilp09"),"�W���M���� : �����ǌN�����Ȃ���ΒN��������򉻂���񂾁H",1;
		set '@dummy,sleep2(2000);
		unittalk getnpcid(0,"�W���M����#ilp09"),"�W���M���� : �݂�ȏo���Ȃ��Ǝ��߂Ă������B����ł����q�����N�͎O������������Ȃ����B",1;
		set '@dummy,sleep2(2000);
		unittalk "���q���� : ���ꂪ�ł��ˁA����͌��Ȗ��ŏI��邾���ł͂Ȃ�������ł���B",1;
		set '@dummy,sleep2(2000);
		unittalk "���q���� : ���܂ł͌ϋʂɍ��߂�ꂽ�����̋C���򉻂���ƁA���Ȗ������Ă��������������̂Ɂc�c",1;
		set '@dummy,sleep2(3000);
		unittalk getnpcid(0,"�N�w�m#ilp08"),"�N�w�m : ����͉����Ⴄ��ł����H",1;
		set '@dummy,sleep2(2000);
		unittalk "���q���� : �c�c",1;
		set '@dummy,sleep2(2000);
		unittalk "���q���� : ���ƌ����̋��E�������̂ł͂ƕs�����������B",1;
		set '@dummy,sleep2(3000);
		unittalk getnpcid(0,"�W���M����#ilp09"),"�W���M���� : �c�c����͉��̘b���I���܂ł͂�������ς̉��O����߂邾���ŗǂ���������Ȃ����B",1;
		set '@dummy,sleep2(3000);
		unittalk getnpcid(0,"�W���M����#ilp09"),"�W���M���� : �����������A�ŉ��������񂾁H",1;
		set '@dummy,sleep2(2000);
		unittalk "���q���� : �������t�ł��������������A���ڌ��������ǂ��Ǝv���܂���B",1;
		set '@dummy,sleep2(2000);
		unittalk "���q���� : �ǂ����Ȃ狭�����������ł��B�������������Ă���`���҂̐l���炢�B",1;
		chgquest 7777,7778;
		set IL_MOON_QUE,3;
		end;
	}
	else if(IL_MOON_QUE == 3) {
		menu "�����ɂ��ċ����Ăق���",-;
		mes "[���q����]";
		mes "������܂����B";
		mes "�c�c������������O��";
		mes "���������̘b�����܂��傤�B";
		next;
		mes "[���q����]";
		mes "�t�F�C�������A�͐̂ɔ�������";
		mes "���鎖���ŎR���ꂪ�N����";
		mes "���̈ꕔ�����܂��č��ꂽ���̂ł��B";
		next;
		mes "[���q����]";
		mes "������O���Ǝv���܂���";
		mes "�������v����������܂�";
		mes "�����}�����҂�����";
		mes "���������̂ł��傤�B";
		mes "���ł��S�삽����";
		mes "��������c���Ă��܂��B";
		next;
		mes "[���q����]";
		mes "���ɔp���ɐ�������";
		mes "����ς����̉��O��";
		mes "���܂����قǋ��͂Ȃ̂Œ���I��";
		mes "�򉻋V�����s���̂ł���";
		mes "���͂�������ł��B";
		next;
		mes "[���q����]";
		mes "�����͒N�ɂ�������܂���";
		mes "�ŋ߂ɂȂ��Čς����̉��O��";
		mes "����ɋ����Ȃ��Ă��܂�����ł��B";
		mes "�����Ȃ����ƌ�������";
		mes "�򉻂����܂��s���Ă��Ȃ���";
		mes "���������������������m��܂���B";
		next;
		mes "[���q����]";
		mes "����ς����̉��O�͐��܂���";
		mes "���i�ʂ�򉻂�������";
		mes "���O�ɂ���Ĉ�����������";
		mes "�������ċ�������c�c�B";
		mes "���̂悤�Ȍ��Ȃ��Ƃ�";
		mes "�N����悤�ɂȂ�܂����B";
		next;
		mes "[���q����]";
		mes "�\�E�������J�[�Ƃ����̂�";
		mes "���̋������s���E�ƂȂ̂�";
		mes "�H�ɂł����ޖ��V�����s������A";
		mes "�����������Ȃ邱�Ƃ�����܂��B";
		next;
		mes "[���q����]";
		mes "�����������Ă�Ƃ���";
		mes "�l���Ă��܂���ł����B";
		mes "����������̌��Œm�鎖���o���܂����B";
		mes "��������Ȃ������ƁI";
		next;
		mes "[���q����]";
		mes "�����ς����̉��O��";
		mes "���������Ă��邩�͒m��܂���B";
		mes "���͎����̈ӎ����Ȃ����A���������";
		mes "�ς̋���������������p����";
		mes "�����g���m�炸�m�炸�̂�����";
		mes "�������Ă��܂����B";
		next;
		mes "[���q����]";
		mes "�����Č��Ă��܂����̂ł��B";
		mes "���̐��̌����������B";
		mes "����ȏ�A�l���߂Â��Ă̓_���ł��I";
		next;
		mes "[���q����]";
		mes "�ƂĂ��s�g�ȉ�����";
		mes "�N�������ȗ\�������܂��B";
		mes "����A���łɎn�܂��Ă���̂����B";
		next;
		mes "[���q����]";
		mes "���������ڂ��肵���c����";
		mes "���������͒n���ł����B";
		mes "���O���򉻂������";
		mes "�������Ă����ς����̈����B";
		next;
		mes "[���q����]";
		mes "�c�c�Ȃ̂ł�����x�Ǝ���";
		mes "���̎d���������Ȃ��ŉ������B";
		mes "���̐��_�̎コ����";
		mes "�n�܂��������Ȃ�";
		mes "�����Î󂷂ׂ����Ƃł��B";
		next;
		mes "[���q����]";
		mes "�����ǌς����̈����ɂ�";
		mes "��x�Ɗւ�肽������܂���B";
		next;
		mes "[���q����]";
		mes "�{���ɋC�ɂȂ�̂ł����";
		mes "���ڌo�����Ă݂����������ł���B";
		mes "���x�A��قǏ򉻂��悤�Ƃ��Ă���";
		mes "�ς̍�������̂ŁA�������ł��܂�����";
		mes "���ł������ĉ������B";
		chgquest 7778,7779;
		set IL_MOON_QUE,4;
		close;
	}
	else if(IL_MOON_QUE == 4) {
		mes "[���q����]";
		mes "�����͏o���܂������H";
		next;
		if(select("�o���܂���","�܂��ł�") == 2) {
			mes "[���q����]";
			mes "���҂����Ă��܂��̂�";
			mes "�������ł��܂�����";
			mes "�����ĉ������B";
			close;
		}
		mes "[���q����]";
		mes "������܂����B";
		mes "����͂܂��򉻂�";
		mes "�I����Ă��Ȃ��ς̍��ł��B";
		mes "�������̏�ɂ̂��āc";
		next;
		mes "[���q����]";
		mes "���_���W����";
		mes "�S�����₩�ɂ��ĉ������B";
		mes "�S�̔����J����";
		mes "�󂯓���Ȃ���΂Ȃ�܂���B";
		close2;
		unittalk "���q���� : ����A�����Ȃ����A�f�r������",1;
		set '@dummy,sleep2(100);
		misceffect 389, "���q����#ilp07";
		misceffect 513, "���q����#ilp07";
		set '@dummy,sleep2(2500);
		unittalk "���q���� : �O�r�̐�̌�����������B",1;
		set '@dummy,sleep2(100);
		misceffect 402, "���q����#ilp07";
		misceffect 458, "���q����#ilp07";
		set '@dummy,sleep2(400);
		cloakoffnpc "#�ύ�ilp10";
		set '@dummy,sleep2(500);
		cloakoffnpc "#�ύ�ilp11";
		set '@dummy,sleep2(500);
		cloakoffnpc "#�ύ�ilp12";
		set '@dummy,sleep2(500);
		cloakoffnpc "#�ύ�ilp13";
		set '@dummy,sleep2(500);
		misceffect 368, "#�ύ�ilp10";
		misceffect 368, "#�ύ�ilp11";
		misceffect 368, "#�ύ�ilp12";
		misceffect 368, "#�ύ�ilp13";
		misceffect 458, "#�ύ�ilp10";
		misceffect 458, "#�ύ�ilp11";
		misceffect 458, "#�ύ�ilp12";
		misceffect 458, "#�ύ�ilp13";
		unittalk "���q���� : ����ȁA�����ȁA����������B",1;
		misceffect 475,"";
		misceffect 458, "#�ύ�ilp10";
		misceffect 458, "#�ύ�ilp11";
		misceffect 458, "#�ύ�ilp12";
		misceffect 458, "#�ύ�ilp13";
		unittalk getnpcid(0,"#�ύ�ilp10"),"�ύ� : ����",1;
		set '@dummy,sleep2(1000);
		misceffect 480,"";
		misceffect 458, "#�ύ�ilp10";
		misceffect 458, "#�ύ�ilp11";
		misceffect 458, "#�ύ�ilp12";
		misceffect 458, "#�ύ�ilp13";
		unittalk getnpcid(0,"#�ύ�ilp11"),"�ύ� : ����";
		unittalk "���q���� : ���̐�����w������",1;
		set '@dummy,sleep2(100);
		misceffect 484,"";
		misceffect 458, "#�ύ�ilp10";
		misceffect 458, "#�ύ�ilp11";
		misceffect 458, "#�ύ�ilp12";
		misceffect 458, "#�ύ�ilp13";
		unittalk getnpcid(0,"#�ύ�ilp12"),"�ύ� : ����",1;
		set '@dummy,sleep2(1500);
		misceffect 899, "���q����#ilp07";
		set '@dummy,sleep2(100);
		unittalk getnpcid(0,"#�ύ�ilp13"),"�ύ� : ����",1;
		set '@dummy,sleep2(1000);
		unittalk "���q���� : �d�����̂͂����ɒu����",1;
		set '@dummy,sleep2(100);
		misceffect 692, "#�ύ�ilp10";
		misceffect 692, "#�ύ�ilp11";
		misceffect 692, "#�ύ�ilp12";
		misceffect 692, "#�ύ�ilp13";
		unittalk getnpcid(0,"#�ύ�ilp10"),"�ύ� : ���ˁI�I",1;
		unittalk getnpcid(0,"#�ύ�ilp11"),"�ύ� : ���ˁI�I",1;
		unittalk getnpcid(0,"#�ύ�ilp12"),"�ύ� : ���ˁI�I",1;
		unittalk getnpcid(0,"#�ύ�ilp13"),"�ύ� : ���ˁI�I",1;
		set '@dummy,sleep2(1500);
		misceffect 899, "���q����#ilp07";
		misceffect 563, "���q����#ilp07";
		set '@dummy,sleep2(2000);
		unittalk "���q���� : ��̌������ւƔ��ōs��",1;
		set '@dummy,sleep2(100);
		misceffect 626, "#�ύ�ilp10";
		misceffect 626, "#�ύ�ilp11";
		misceffect 626, "#�ύ�ilp12";
		misceffect 626, "#�ύ�ilp13";
		unittalk getnpcid(0,"#�ύ�ilp10"),"�ύ� : ���ˁI�I�I�I",1;
		misceffect 563, "���q����#ilp07";
		set '@dummy,sleep2(900);
		unittalk getnpcid(0,"#�ύ�ilp11"),"�ύ� : ���ˁI�I�I�I",1;
		set '@dummy,sleep2(100);
		misceffect 563, "���q����#ilp07";
		set '@dummy,sleep2(900);
		unittalk getnpcid(0,"#�ύ�ilp12"),"�ύ� : ���ˁI�I�I�I",1;
		set '@dummy,sleep2(100);
		misceffect 563, "���q����#ilp07";
		set '@dummy,sleep2(900);
		unittalk getnpcid(0,"#�ύ�ilp13"),"�ύ� : ���ˁI�I�I�I",1;
		set '@dummy,sleep2(1000);
		unittalk getnpcid(0,"#�ύ�ilp10"),"�ύ� : ���ˁI�I�I�I�I",1;
		unittalk getnpcid(0,"#�ύ�ilp11"),"�ύ� : ���ˁI�I�I�I�I",1;
		unittalk getnpcid(0,"#�ύ�ilp12"),"�ύ� : ���ˁI�I�I�I�I",1;
		unittalk getnpcid(0,"#�ύ�ilp13"),"�ύ� : ���ˁI�I�I�I�I",1;
		misceffect 1072,"";
		set '@dummy,sleep2(400);
		chgquest 7779,7780;
		set IL_MOON_QUE,5;
		warp "pay_dun03.gat",142,44;
		end;
	}
	else if(IL_MOON_QUE == 5) {
		mes "[���q����]";
		mes "�c�c����ŕ�����܂����ˁH";
		mes "���������o�������̂����B";
		mes "�����Əڂ����^���𒲍�����Ȃ�";
		mes "������x�A�p����";
		mes "�s���Ȃ���΂Ȃ�܂���B";
		next;
		mes "[���q����]";
		mes "�`���җl��";
		mes "����̌��ۂɑ΂���";
		mes "��������̂Ȃ�";
		mes "�����ɂ���o�J��";
		mes "�ƂĂ���т����ł��ˁB";
		close;
	}
	else if(IL_MOON_QUE < 9) {
		mes "[���q����]";
		mes "�C�F�W�����搶��T���ɗ����Ȃ�";
		mes "�����Ɖ��̕����ɍs���ĉ������B";
		close;
	}
	else if(IL_MOON_QUE == 9) {
		mes "[���q����]";
		mes "�����ł����B";
		mes "���ǁA��̉������";
		mes "���܂����̂ł��ˁB";
		mes "���R�ɂ��Ă�";
		mes "�m��Ȃ���ł���ˁH";
		next;
		mes "[���q����]";
		mes "��̉����ꂽ�ƌ�������";
		mes "���ƌ����̋��E�����ꂽ��";
		mes "�����̂��������ł��傤���H";
		mes "���ʂ̐l���N���̖��̒���";
		mes "����ȕ��ɍs�������邱�Ƃ�";
		mes "�o���܂���B";
		next;
		mes "[���q����]";
		mes "���ꂪ^4d4dff����Ԃ̈���^000000����";
		mes "�����̂͂悭������܂����B";
		mes "�ł��ǂ�����Ă��ꂪ������";
		mes "�q����悤�ɂȂ����̂���";
		mes "�N���m��܂���B";
		next;
		mes "[���q����]";
		mes "����Ǝ�������ł���������";
		mes "�Q�l�ɂ��܂�����";
		mes "�܂����̂悤�Șb��";
		mes "��������������܂���B";
		mes "�܂��A���̕����ɂ��Ă�";
		mes "�z�h�j�����܂��������邩�ƁB";
		next;
		mes "[���q����]";
		mes "�悵�`�I�ł͋v���Ԃ��";
		mes "�����x��ł݂悤���ȁI";
		mes "����ŗ]�v�Ȏ��͍l������";
		mes "��������Q�ꂻ���ł��B";
		next;
		mes "[���q����]";
		mes "�򉻍�Ƃ��������";
		mes "���̖��������������";
		mes "��C�ɉ����ł������Ȃ̂ŁI";
		mes "���͉���I����ł��I";
		mes "���肪�Ƃ��������܂�";
		mes "�`���җl�I";
		chgquest 7788,202075;
		set IL_MOON_QUE,10;
		getexp 300000000,0,1;
		getexp 0,60000000,0;
		getitem 25271,10;
		close;
	}
	else if(IL_MOON_QUE == 10) {
		mes "[���q����]";
		mes "�z�h�j�ƈꏏ�ɒ����A�����I";
		mes "�撣���ĉ������I";
		mes "����ς̈�������������";
		mes "���̂��񂴂肷��V����";
		mes "�����Ȃ�܂�����`�I";
		next;
		mes "[���q����]";
		mes "�Ȃ��m���Ă���̂�";
		mes "�C�ɂȂ��ł����H";
		mes "�����̊��ł���I���͂͂͂͂́I";
		mes "���������Ȃ��ł��̂܂�";
		mes "�ꐶ���邩���m��Ȃ����ǁI";
		mes "���Ɗ֌W�Ȃ����Ƃł�����I";
		close;
	}
}

payon_in03.gat,33,93,1	script	�N�w�m#ilp08	92,{
	if(IL_MOON_QUE < 2) {
		mes "[�N�w�m]";
		mes "�t�F�C�����͐̂���";
		mes "�_�b�����ƈꏏ�ɕ�炷�X�ł����B";
		mes "�R�Ŋu������Ă���";
		mes "�]���Ɣ�ׂ�ƍl������";
		mes "���Ȃ�Ⴂ������܂��B";
		close;
	}
	else if(IL_MOON_QUE == 2) {
		unittalk "�N�w�m : ���q�����͂ƂĂ��������Ă��܂��B�b�𕷂��Ă݂Ȃ��Ƃ����Ȃ��̂ł����c�c",1;
		end;
	}
	else if(IL_MOON_QUE < 5) {
		unittalk "�N�w�m : ���q�����̘b���畷���Ă݂������悳�����ł��B",1;
		end;
	}
	else if(IL_MOON_QUE == 5) {
		mes "[�N�w�m]";
		mes "�{���ɔߎS�ł��ˁB";
		mes "����Ȃ��Ƃ����q������";
		mes "�ЂƂ�Ŕw�����Ă�����ł��ˁB";
		mes "����ς̉��O��";
		mes "�z�����Ă����ȏ�ŋ����܂����B";
		next;
		mes "[�N�w�m]";
		mes "���������������K�v�ł��B";
		mes "��͂蒼�ځA�p����";
		mes "�s���Ă݂邵���Ȃ������ł��B";
		close;
	}
	else if(IL_MOON_QUE >= 6) {
		mes "[�N�w�m]";
		mes "�����̊Ԃ͔p����";
		mes "���̊�Ȍ��ۂ�";
		mes "�������邱�Ƃɂ��܂��B";
		mes "�ǂ����Ă��ЂƂ肶���ςȂ̂�";
		mes "�O�ɂ���W���E�q�ƈꏏ��";
		mes "�s�����悤�ƍl���Ă��܂��B";
		next;
		mes "[�N�w�m]";
		mes "���̑O�ɂ݂����ɖ`���җl��";
		mes "�ꏏ�ɂ��Ă����Ȃ�\�����Ȃ��ł��B";
		mes "����ł͔p���ŉ�܂��傤�B";
		close;
	}
}

payon_in03.gat,30,96,5	script	�W���M����#ilp09	901,{
	if(IL_MOON_QUE < 2) {
		mes "[�W���M����]";
		mes "�{���ł͐Â��ɂ��Ȃ����B";
		close;
	}
	else if(IL_MOON_QUE == 2) {
		unittalk "�W���M���� : ���q�����A�N�����Ȃ��ƒN������ɂȂ��Ă���Ă����ƌ����񂾁H",1;
		end;
	}
	else if(IL_MOON_QUE < 5) {
		unittalk "�W���M���� : �܂��̓��q�����̘b�𕷂��Ă݂邱�Ƃɂ��悤�B",1;
		end;
	}
	else if(IL_MOON_QUE == 5) {
		mes "[�W���M����]";
		mes "�c�c��͂�܂���";
		mes "���Ԃ̔c����D��ɂ��Ȃ��ƁB";
		mes "�`���҂̌N��";
		mes "�͂�݂��Ă����Ȃ�";
		mes "�傫�ȏ����ɂȂ�̂����B";
		close;
	}
	else if(IL_MOON_QUE < 9) {
		mes "[�W���M����]";
		mes "�{���ł͐Â��ɂ��Ȃ����B";
		close;
	}
	else if(IL_MOON_QUE == 9) {
		mes "[�W���M����]";
		mes "�c�c��͂�܂���";
		mes "���Ԃ̔c����D��ɂ��Ȃ��ƁB";
		mes "�`���҂̌N��";
		mes "�͂�݂��Ă����Ȃ�";
		mes "�傫�ȏ����ɂȂ�̂����B";
		close;
	}
	else if(IL_MOON_QUE == 10) {
		mes "[�W���M����]";
		mes "����Ԃ��ߋ��̎�����";
		mes "�����Ƃ��Č����Ă���Ƃ����̂��B";
		mes "�c�c���̎҂���Q�҂�";
		mes "���邩������Ȃ��Ƃ����̂ɁB";
		next;
		mes "[�W���M����]";
		mes "���̋�̉����ꂽ���̋��E����";
		mes "�������炢���̂��H";
		mes "�X�̎҂����ɂ�";
		mes "�����ɂ͋߂Â��Ȃ��悤";
		mes "�`���Ă������B";
		close;
	}
}

payon_in03.gat,31,96,5	script	#�ύ�ilp10	1180,{
	end;
OnInit:
	cloakonnpc;
	end;
}

payon_in03.gat,35,96,3	script	#�ύ�ilp11	1180,{
	end;
OnInit:
	cloakonnpc;
	end;
}

payon_in03.gat,31,93,7	script	#�ύ�ilp12	1180,{
	end;
OnInit:
	cloakonnpc;
	end;
}

payon_in03.gat,35,93,1	script	#�ύ�ilp13	1180,{
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_dun03.gat,140,46,3	script	�h�炮���#ilp14	10043,{
	if(IL_MOON_QUE < 5) {
		mes "�������C���h�炢�ł���B";
		mes "�s�C���Ȋ���������B";
		close;
	}
	else if(IL_MOON_QUE == 5) {
		mes "��Ԃ��c��ł���悤�ȕ�����������B";
		next;
		cloakoffnpc "�N�w�m#ilp15";
		cloakoffnpc "���m�V���W���E�q#ilp16";
		unittalk getnpcid(0,"�N�w�m#ilp15"),"�N�w�m : �͂��͂��A�����ɂ������������̂ł��ˁB",1;
		mes "[�N�w�m]";
		mes "�}�ɏ�����";
		mes "�т����肵�܂����B";
		mes "���ꂪ���q�����̌����Ă���";
		mes "��̉����ꂽ������";
		mes "�������̂Ȃ�ł����H";
		next;
		menu "���ꂩ�璲�������悤�ƍl���Ă���",-;
		mes "[�N�w�m]";
		mes "���ꂶ�Ⴛ�̒�����";
		mes "�������s������_���ł����H";
		mes "�ܘ_�A���ЂƂ�ł�";
		mes "�댯���Ǝv���܂���";
		mes "�����ɂ���W���E�q�ƈꏏ�Ȃ�";
		mes "���v���Ǝv���܂��񂩁H�I";
		unittalk getnpcid(0,"���m�V���W���E�q#ilp16"),"���m�V���W���E�q : �\�z�͂��Ă������ǁc�c�z�h�j�A���O�͖{���ɓK������Ȃ����H",1;
		next;
		mes "[�N�w�m]";
		mes "���ꂶ��A���c�c����ɐG���΂����̂��ȁH";
		unittalk getnpcid(0,"���m�V���W���E�q#ilp16"),"���m�V���W���E�q : ����ɐG��ȁI",1;
		chgquest 7780,7781;
		set IL_MOON_QUE,6;
		close2;	// �ȉ��^�C�}�[�s��
		misceffect 890, "�N�w�m#ilp15";
		misceffect 895, "�N�w�m#ilp15";
		unittalk getnpcid(0,"�N�w�m#ilp15"),"�N�w�m : ���킠���������`�I�I�I",1;
		set '@dummy,sleep2(500);
		unittalk getnpcid(0,"���m�V���W���E�q#ilp16"),"���m�V���W���E�q : �����`�I�z�h�j�I�I�I",1;
		set '@dummy,sleep2(2000);
		cloakonnpc "�N�w�m#ilp15";
		unittalk getnpcid(0,"���m�V���W���E�q#ilp16"),"���m�V���W���E�q : �c�c���̃o�J���]�v�Ȃ��Ƃ����₪���āI�I�I",1;
		set '@dummy,sleep2(2000);
		misceffect 890, "���m�V���W���E�q#ilp16";
		misceffect 895, "���m�V���W���E�q#ilp16";
		set '@dummy,sleep2(500);
		cloakonnpc "���m�V���W���E�q#ilp16";
		end;
	}
	else {
		mes "�c�Ȃ��ꂽ��Ԃ̌�������";
		mes "�������f��B";
		mes "�ǂ����悤���ȁH";
		next;
		if(select("�i������","��߂�") == 2) {
			mes "���͂�߂Ă������B";
			close;
		}
		warp "pay_d03_i.gat",140,44;
		end;
	}
}

pay_dun03.gat,138,43,7	script	�N�w�m#ilp15	92,{
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_dun03.gat,142,45,3	script	���m�V���W���E�q#ilp16	708,{
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_d03_i.gat,149,45,4	script	�w�m�z�h�j#ilp18	92,{
	if(IL_MOON_QUE == 6) {
		mes "[�z�h�j]";
		mes "������Ƃ����������ĉ������I";
		mes "��قǎ�����������";
		mes "�p���ɊԈႢ�Ȃ��̂�";
		mes "��������Ȃ��悤�ɂ������܂��I";
		next;
		mes "[�z�h�j]";
		mes "�����ɂ���l������";
		mes "����ς����������l�q���ςł��B";
		mes "���ɖ��Ȗ��@�g����";
		mes "��������Ă���̂ł���";
		mes "���̎����̌����ł͂Ȃ���ł��傤���H";
		next;
		mes "[�z�h�j]";
		mes "�����ċ���ς����I";
		mes "�l�X�I���삽���I";
		mes "�܂�Ő̘b�ɕ�����������";
		mes "�R����ő������܂������̎���";
		mes "�߂��Ă��܂����悤�ȁc�c�B";
		next;
		mes "[�z�h�j]";
		mes "�����I�������K�v�ɂȂ�Ǝv���܂��B";
		mes "�ܘ_�A���͂��Ē����܂���ˁH";
		next;
		mes "[�z�h�j]";
		mes "�������ł�����";
		mes "�b�����ĉ������B";
		chgquest 7781,7783;
		set IL_MOON_QUE,7;
		close;
	}
	else if(IL_MOON_QUE == 7) {
		mes "[�z�h�j]";
		mes "�����̐l�X���畷�����b��";
		mes "���������@�g���̂��Ƃ΂���ł����B";
		next;
		mes "[�z�h�j]";
		mes "�����l�����ɑ喂�@���g��";
		mes "���̂����Œn�Ղ������";
		mes "�R���ꂪ�N���������ł��B";
		mes "������O���Ǝv������";
		mes "����Ȏ����Ȃ�Z����";
		mes "�������񎀂񂾂�ł��傤�ˁB";
		next;
		mes "[�z�h�j]";
		mes "������l���Ă��A�����̌�����";
		mes "���̉��������@�g���ł��傤�B";
		mes "�����̌��������������";
		mes "���̈����͋�̉����ꂸ";
		mes "������̂ł͂Ȃ��ł��傤���H";
		next;
		mes "[�z�h�j]";
		mes "���ۂɂ͖��@�g����";
		mes "�����֘A�̖����l���ł���";
		mes "�\��������܂���";
		mes "���ׂĂ݂鉿�l��";
		mes "����ƍl���Ă��܂��B";
		next;
		mes "[�z�h�j]";
		mes "��������̌��ōł��d�v�Ȃ̂�";
		mes "���ƌ����̋��E���Ȃ����ꂽ�̂��ł��B";
		mes "���̏ꏊ�ł����̂悤�Ȃ��Ƃ�";
		mes "�܂���������̂ł��傤���H";
		next;
		mes "[�z�h�j]";
		mes "�Ƃɂ����������Ă݂܂��傤�B";
		mes "^4d4dff�^���̖��@�g��^000000��";
		mes "���Ȃ苭�͂����Ɍ�����̂�";
		mes "�C��t���Ă��������B";
		mes "�`���җl�̒��Ԃ�����Ȃ�ꏏ��";
		mes "���肷�鎖�������߂��܂��B";
		next;
		if(select("����������","�f��") == 2) {
			mes "[�z�h�j]";
			mes "�����c�c�ł͑��̗v�f��";
			mes "�������邵������܂���ˁI";
			mes "�ܘ_�A����̂��Ƃ�";
			mes "�����`���җl�����񂾂�͂��܂��񂪁I";
			close;
		}
		mes "[�z�h�j]";
		mes "�������̊Ԃ�";
		mes "���͂𒲂ׂĂ݂܂��̂�";
		mes "�����o������";
		mes "������x�b�������Ă��������B";
		chgquest 7783,7782;
		set IL_MOON_QUE,8;
		close;
	}
	else if(IL_MOON_QUE == 8) {
		mes "[�z�h�j]";
		mes "���҂����������܂����B";
		mes "���ƂȂ�����̌���";
		mes "�������͂߂Ă��܂�����B";
		next;
		mes "[�z�h�j]";
		mes "���q�����������Ă������Ƃ�";
		mes "�o���Ă��܂����H";
		mes "�ς̈�������̉����ꂽ��";
		mes "�����Ă����̂��B";
		next;
		mes "[�z�h�j]";
		mes "���ӂ𒲍����Ȃ���";
		mes "�l���Ă݂܂�����";
		mes "�����͂�͂茎��Ԃ����o����";
		mes "�����̂悤�ł��B";
		next;
		mes "[�z�h�j]";
		mes "�ǂ����Ĉ�����������";
		mes "�q����悤�ɂȂ����̂�";
		mes "������܂��񂪁A�ЂƂ���";
		mes "�m���Ȃ��Ƃ�����܂��B";
		next;
		mes "[�z�h�j]";
		mes "����Ԃ��ߋ��̎�����";
		mes "�܂��Y��Ă��Ȃ��Ƃ������Ƃł��B";
		next;
		mes "[�z�h�j]";
		mes "�����̎�����";
		mes "�傫���ȋ�ɂƂ��Ďc��";
		mes "�����݂܂ō��݂Ƃ���";
		mes "�ς��葱���Ă����悤�ł��B";
		mes "���ꂪ�����̐؂��|����";
		mes "���������̂ł͂Ȃ����Ɓc�c�B";
		next;
		mes "[�z�h�j]";
		mes "�܂��m��Ȃ�������";
		mes "����Ǝv���܂��񂩁H";
		mes "��������������";
		mes "�����𑱂��悤�Ǝv���܂��B";
		next;
		mes "[�z�h�j]";
		mes "���̂��Ƃ��t�F�C�������{�ɂ���";
		mes "���q�����ɂ��`���ĉ������B";
		mes "���͂���܂ł̊�";
		mes "�W���E�q�ƈꏏ��";
		mes "�t�߂�����Ē��ׂĂ݂܂��B";
		next;
		mes "[�z�h�j]";
		mes "���̌��ۂɑ΂���";
		mes "��������̉𓚂�";
		mes "�o��Ȃ炢���ł����B";
		chgquest 7782,7788;
		set IL_MOON_QUE,9;
		getexp 150000000,0,1;
		getexp 0,30000000,0;
		getitem 25271, 5;
		close;
	}
	mes "[�z�h�j]";
	mes "�܂��m��Ȃ�������";
	mes "����Ǝv���܂��񂩁H";
	mes "��������������";
	mes "�����𑱂��悤�Ǝv���܂��B";
	next;
	mes "[�z�h�j]";
	mes "���̌��ۂɑ΂���";
	mes "��������̉𓚂�";
	mes "�o��Ȃ炢���ł����B";
	close;
}

pay_d03_i.gat,152,45,3	script	���m�V���W���E�q#ilp17	708,{
	if(IL_MOON_QUE <= 6) {
		mes "[�W���E�q]";
		mes "���̑΍���Ȃ��܂�";
		mes "�����������犴���Ă܂������A";
		mes "�����̊ԁA�z�h�j�ƈꏏ��";
		mes "�s�������Ȃ���΂Ȃ�Ȃ������ł��ˁB";
		next;
		mes "[�W���E�q]";
		mes "�����������̋���ς�";
		mes "�S�삽������悭�Ȃ��C�z���������܂��B";
		mes "�c����͍��������ƂɂȂ�܂����B";
		close;
	}
	mes "[�W���E�q]";
	mes "�����ɓ����ė�������";
	mes "���l�̘c�Ȃ��ꂽ��Ԃ�����܂��B";
	mes "�G��Ă݂�ƌ��̔p����";
	mes "�o�鎖���o���܂����B";
	next;
	menu "�{��̋���ςɂ���",-;
	if(checkquest(7785)) {
		if(checkquest(7785)&2 == 0) {
			mes "[�W���E�q]";
			mes "����ς̓{���";
			mes "��U�����������悤�ł��ˁB";
			mes "^4d4dff���̌ߑO5�����߂�����^000000";
			mes "�܂����Ă��������B";
			next;
			mes "[�W���E�q]";
			mes "�z�h�j�̒����ɂ���";
			mes "�����͌���Ԃ̈����̒��������ł��B";
			mes "���e�ɂ����Ȃ�����ςł���";
			mes "�����炪������";
			mes "�����Ă���l�ɊQ���y�ڂ��Ȃ�";
			mes "�ގ�����͓̂��R���ƍl���Ă��܂��B";
			next;
			mes "[�W���E�q]";
			mes "����Ɏ��߂�";
			mes "�����Ȃ��z���ƌ����Ă�";
			mes "�Ԃ����t�͂���܂���B";
			mes "���ꂶ�ᎄ�̓z�h�j�ƈꏏ��";
			mes "���̏ꏊ��������Ă݂邱�Ƃɂ��܂��B";
			close;
		}
		delquest 7785;
		mes "[�W���E�q]";
		mes "�����͋x�߂܂������H";
		mes "�ω��̂Ȃ�����ł����z�h�j��";
		mes "�t�߂̒������~���ɍs�����߂�";
		mes "���ӂ𐮗��������̂�";
		mes "^4d4dff�{��̋����^000000��";
		mes "�����ގ����Ă���܂��񂩁H";
		next;
		if(select("�������","�f��") == 2) {
			mes "[�W���E�q]";
			mes "�����܂Œ����ɏo�����邱�Ƃ�";
			mes "�o���Ȃ������ł��ˁB";
			close;
		}
		mes "[�W���E�q]";
		mes "����ł͂��肢���܂��B";
		mes "^4d4dff�{��̋����^000000��";
		mes "�S��𗝉��ł��Ȃ��킯�ł�";
		mes "����܂��񂯂ǁA����͂���";
		mes "����͂���ł�����B";
		setquest 7784;
		close;
	}
	if(checkquest(7784)) {
		if(checkquest(7784)&4 == 0) {
			mes "[�W���E�q]";
			mes "���ӂɂ���^4d4dff�{��̋����^000000��";
			mes "�ގ����Ă��������B";
			mes "�z�h�j�̒��������������~���ɂȂ�ׂł��B";
			close;
		}
		mes "[�W���E�q]";
		mes "���ꂪ���̂ł��낤���Ȃ��낤��";
		mes "�댯�v�f�ɂȂ�̂͊ԈႢ����܂���B";
		mes "�悭�������ĉ������܂����B";
		next;
		mes "[�W���E�q]";
		mes "�z�h�j�̒������I����";
		mes "�������Ă���悤�ł���";
		mes "���낻��A�҂̏�����";
		mes "���Ă����������悳�����ł��ˁB";
		setquest 7785;
		delquest 7784;
		getexp 300000000,0,1;
		getexp 0,60000000,0;
		getitem 25271,15;
		close;
	}
	mes "[�W���E�q]";
	mes "�߂�����{��̋���ς�����";
	mes "�������ɗ��ăz�h�j�͒�����";
	mes "��J���Ă���݂����ł��B";
	mes "�`���җl�ɋ���ς����̑ގ���";
	mes "���肢�������ł����c�c�B";
	next;
	if(select("�������","�f��") == 2) {
		mes "[�W���E�q]";
		mes "�����ł����B";
		mes "�����Ȃ�Ɖ����܂�";
		mes "�����ɏo�����邱�Ƃ�";
		mes "�o���Ȃ������ł��ˁB";
		close;
	}
	mes "[�W���E�q]";
	mes "����ł͂��肢���܂��B";
	mes "^4d4dff�{��̋����^000000��";
	mes "�S��𗝉��ł��Ȃ��킯�ł�";
	mes "����܂��񂯂ǁA����͂���";
	mes "����͂���ł�����B";
	setquest 7784;
	close;
}

pay_d03_i.gat,140,46,3	script	�h�炮���#ilp10	10043,{
	mes "���̔p���ɖ߂邱�Ƃ��ł���B";
	mes "�ǂ����悤���ȁH";
	next;
	if(select("�߂�","�߂�Ȃ�") == 2) {
		mes "���͂�߂Ă������B";
		close;
	}
	warp "pay_dun03.gat",145,43;
	end;
}

pay_d03_i.gat,82,237,3	script	���l#ilp17	75,{
	mes "[���l]";
	mes "���c�c�����c�c";
	close;
}

pay_d03_i.gat,254,206,3	script	���l#ilp18	90,{
	mes "[���l]";
	mes "����͈Ⴄ�c�c�I";
	mes "���@���A���@���~�߂āc�c�I";
	mes "���A�����!!���Ⴀ��!!";
	close;
}

pay_d03_i.gat,81,136,3	script	���l#ilp19	59,{
	mes "[���l]";
	mes "����������������";
	mes "���������ƁH";
	mes "�_�b�Ɩ�����";
	mes "��ʂł��Ȃ��z�炪�c�c�I";
	next;
	mes "[���l]";
	mes "�c�c�����c�c�ϗl�B";
	mes "�����āc�c�����Ă�c�c!!";
	close;
}

pay_d03_i.gat,160,260,3	script	���l#ilp21	59,{
	mes "[���l]";
	mes "���������A���Ȃ��B�́c�c�B";
	mes "���̉��������@�g����";
	mes "�Ȃ����������c�c�B";
	next;
	mes "[���l]";
	mes "���O���c�c";
	mes "���O�����̎҂����Ɠ�����!!";
	mes "����������������!!";
	close;
}

pay_d03_i.gat,43,150,5	script	���l#ilp22	75,{
	mes "[���l]";
	mes "�ǂ�����������";
	mes "�����Ă����Ă��������I";
	next;
	mes "[���l]";
	mes "�������͖�����";
	mes "�d�������͂���܂���B";
	next;
	mes "[���l]";
	mes "���c�c�����c�c";
	mes "���@�c�c���@���c�c�~�߂Ă��������B";
	mes "�ǂ����c�c";
	mes "���@���~�߂Ă��������B�ǂ����c";
	close;
}

pay_d03_i.gat,0,0,0	script	#IllMoonlight	-1,{
OnInit:
	for(set '@i,0;'@i<5;set '@i,'@i+1)
		areamonster "pay_d03_i.gat",40,35,160,115,"--ja--",3759+rand(3),1,"::OnSummon1";
	for(set '@i,0;'@i<5;set '@i,'@i+1)
		areamonster "pay_d03_i.gat",40,140,160,260,"--ja--",3759+rand(3),1,"::OnSummon2";
	for(set '@i,0;'@i<5;set '@i,'@i+1)
		areamonster "pay_d03_i.gat",150,180,270,260,"--ja--",3759+rand(3),1,"::OnSummon3";
	end;

OnSummon1:
	if('mob1 == 0 && rand(1000) == 0) {
		set 'mob1,callmonster("pay_d03_i.gat",96,83,"�^���̖��@�g��",3764,strnpcinfo(0)+"::OnKilled1");
		unittalk 'mob1,"�^���̖��@�g�� : �^���̂��߂̑b�ɂȂ�Ȃ���";
	}
	else {
		areamonster "pay_d03_i.gat",40,35,160,115,"--ja--",3759+rand(3),1,"::OnSummon1";
	}
	end;
OnKilled1:
	set 'mob1,0;
	areamonster "pay_d03_i.gat",40,35,160,115,"--ja--",3759+rand(3),1,"::OnSummon1";
	end;
OnSummon2:
	if('mob2 == 0 && rand(1000) == 0) {
		set 'mob2,callmonster("pay_d03_i.gat",94,188,"�^���̖��@�g��",3764,strnpcinfo(0)+"::OnKilled2");
		unittalk 'mob2,"�^���̖��@�g�� : �^���̂��߂̑b�ɂȂ�Ȃ���";
	}
	else {
		areamonster "pay_d03_i.gat",40,140,160,260,"--ja--",3759+rand(3),1,"::OnSummon2";
	}
	end;
OnKilled2:
	set 'mob2,0;
	areamonster "pay_d03_i.gat",40,140,160,260,"--ja--",3759+rand(3),1,"::OnSummon2";
	end;
OnSummon3:
	if('mob3 == 0 && rand(1000) == 0) {
		set 'mob3,callmonster("pay_d03_i.gat",210,221,"�^���̖��@�g��",3764,strnpcinfo(0)+"::OnKilled3");
		unittalk 'mob3,"�^���̖��@�g�� : �^���̂��߂̑b�ɂȂ�Ȃ���";
	}
	else {
		areamonster "pay_d03_i.gat",150,180,270,260,"--ja--",3759+rand(3),1,"::OnSummon3";
	}
	end;
OnKilled3:
	set 'mob3,0;
	areamonster "pay_d03_i.gat",150,180,270,260,"--ja--",3759+rand(3),1,"::OnSummon3";
	end;
}
