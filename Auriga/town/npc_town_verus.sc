// ver_eju.gat
ver_eju.gat,0,0,0,0	monster	��@�^�E�F���X�M�A	3154,80,0,0,0
ver_eju.gat,0,0,0,0	monster	�@��^�E�F���X�M�A	3153,25,0,0,0
// ver_conn.gat
ver_conn.gat,0,0,0,0	monster	��@�^�E�F���X�M�A	3154,5,30000,0,0
// verus01.gat
verus01.gat,0,0,0,0	monster	�X���b�O	3247,30,0,0,0
verus01.gat,0,0,0,0	monster	�T���^�E�F���X�M�A�U	3249,10,0,0,0
verus01.gat,0,0,0,0	monster	�C���^�E�F���X�M�A�U	3248,10,0,0,0
// verus02.gat
verus02.gat,0,0,0,0	monster	�C���^�E�F���X�M�A�U	3248,90,0,0,0
verus02.gat,0,0,0,0	monster	�T���^�E�F���X�M�A�U	3249,90,0,0,0
// verus03.gat
verus03.gat,0,0,0,0	monster	���c�̖ڈ�	3159,40,0,0,0
verus03.gat,0,0,0,0	monster	�T���^�E�F���X�M�A	3156,80,0,0,0
verus03.gat,0,0,0,0	monster	�C���^�E�F���X�M�A	3155,45,0,0,0
verus03.gat,0,0,0,0	monster	�X���b�O	3247,10,0,0,0
verus03.gat,0,0,0,0	monster	�ŖS�j�����c�M��	3158,10,0,0,0
// un_bunker.gat
un_bunker.gat,0,0,0,0	monster	�X�	1051,6,0,0,0
un_bunker.gat,0,0,0,0	monster	�@��^�E�F���X�M�A	3153,20,0,0,0
un_bunker.gat,0,0,0,0	monster	���ɂ̖S��	3255,68,0,0,0
un_bunker.gat,0,0,0,0	monster	�ߒɂ̖S��	3256,80,0,0,0
un_bunker.gat,0,0,0,0	monster	�N���b�v	3250,28,0,0,0
un_bunker.gat,0,0,0,0	monster	DR815	3252,14,0,0,0
un_bunker.gat,0,0,0,0	monster	GC109	3251,10,0,0,0
un_bunker.gat,0,0,0,0	monster	�������̂�	1084,1,0,0,0
un_bunker.gat,0,0,0,0	monster	�`�����`����	1011,2,0,0,0


//====================================================================
// �t�@���^�X�}�S���J
//====================================================================
moc_para01.gat,31,14,0	script	#atnevt01	139,{
	if(VER_1QUE == 0 && countitem(6219) >= 1) {	// �y���c�̏�
		if((Job >= Job_RuneKnight && job <= Job_Rebellion) || (Job == Job_Summoner && BaseLevel >= 90)) {
			cutin "laime_evenor01",2;
			mes "[���C��]";
			mes "���������΁c�c";
			mes strcharinfo(0)+ "�l�A";
			mes "���̉\�͕����܂������H";
			mes "�W���s���X�Ō�������";
			mes "�V������Ղ̉\�ł��B";
			next;
			mes "[���C��]";
			mes "���̈�ՂŒ������s�����@�c����";
			mes "��W���Ă��邻���ł���B";
			mes "���͂�����A�������y���c��";
			mes "����`�����邱�ƂɂȂ����̂ł��B";
			next;
			mes "[���C��]";
			mes "���@�c�ɋ���������y���c�����o�[�ɁA";
			mes "�������̒c����";
			mes "������������Ă���̂ł����c�c�B";
			next;
			menu "�c���������́H",-;
			cutin "laime_evenor02",2;
			mes "[���C��]";
			mes "�͂��A�����ł���B";
			mes "�c����������";
			mes "�ӗ~���o���Ă���d���Ȃ̂ŁA";
			mes "����������悤�ł�����";
			mes "��x�c���ɉ����";
			mes "�b�𕷂��Ă݂ĉ������B";
			next;
			cutin "laime_evenor01",2;
			mes "[���C��]";
			mes "�c������^ff00002�K�̈�ԍ�^000000�ɂ���܂��B";
			mes "��낵�����肢���܂��ˁB";
			set VER_1QUE,1;
			setquest 7607;
			close2;
			cutin "laime_evenor01",255;
			end;
		}
	}
	end;
}

moc_para01.gat,38,175,5	script	���C��#evtat01	952,{
	if(countitem(6219) < 1) {	// �y���c�̏�
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�y���c�ւ悤�����B";
		mes "���ƃ��}���X��ǂ����߂�";
		mes "�`���҂�����B";
		next;
		mes "[���C��]";
		mes "���Ȃ��B�̊y����";
		mes "���l�̉������A";
		mes "���炬�̎q��S�ł��Ȃ��B";
		mes "�����A�����ɂ���̂ł��B";
		next;
		cutin "laime_evenor02",2;
		mes "[���C��]";
		mes "�y���c�ɉ��������";
		mes "�F�X�Ȉ˗����󂯂邱�Ƃ��ł��܂��B";
		mes "������������ł�����A";
		mes "��K�̎�t�ւ��z�����������ˁB";
		next;
		mes "�]^0000FF�t�@���^�X�}�S���J^000000��";
		if(Job < Job_RuneKnight || (Job == Job_Summoner && BaseLevel < 90)) {
			mes "�@3���E�Ƃ���ь��E�˔j����";
			mes "�@�X�[�p�[�m�[�r�X�A���x���I���A";
			mes "�@�e�T�A�O�ABaseLv90�ȏ�̃h������";
			mes "�@���y���c 01��1F�ɂ���^ff0000���C��^000000����";
			mes "�@�o�^�������Ȃ��A^ff0000�y���c�̏�^000000��";
			mes "�@���肷�鎖�Ői�s���\�ƂȂ�܂��]";
		}
		else {
			mes "�@�y���c 01��1F�ɂ���^ff0000���C��^000000����";
			mes "�@�o�^�������Ȃ��A";
			mes "�@^ff0000�y���c�̏�^000000����肷�鎖��";
			mes "�@�i�s���\�ƂȂ�܂��]";
		}
		close2;
		cutin "laime_evenor02",255;
		end;
	}
	switch(VER_1QUE) {
	case 0:
		if(Job < Job_RuneKnight || (Job == Job_Summoner && BaseLevel < 90)) {
			cutin "laime_evenor02",2;
			mes "[���C��]";
			mes "�����̐^�񒆂̕�����";
			mes "���̕����Ȃ̂ŁA";
			mes "�����悭�����ɗ��܂��B";
			next;
			mes "�]^0000FF�t�@���^�X�}�S���J^000000��";
			mes "�@3���E�Ƃ���ь��E�˔j����";
			mes "�@�X�[�p�[�m�[�r�X�A";
			mes "�@�e�T�A�O�A���x���I���A";
			mes "�@BaseLv90�ȏ�̃h�������̂�";
			mes "�@�J�n���邱�Ƃ��ł���N�G�X�g�ł��]";
			close2;
			cutin "laime_evenor02",255;
			end;
		}
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "���������΁c�c";
		mes strcharinfo(0)+ "�l�A";
		mes "���̉\�͕����܂������H";
		mes "�W���s���X�Ō�������";
		mes "�V������Ղ̉\�ł��B";
		next;
		mes "[���C��]";
		mes "���̈�ՂŒ������s�����@�c����";
		mes "��W���Ă��邻���ł���B";
		mes "���͂�����A�������y���c��";
		mes "����`�����邱�ƂɂȂ����̂ł��B";
		next;
		mes "[���C��]";
		mes "���@�c�ɋ���������y���c�����o�[�ɁA";
		mes "�������̒c����";
		mes "������������Ă���̂ł����c�c�B";
		next;
		menu "�c���������́H",-;
		cutin "laime_evenor02",2;
		mes "[���C��]";
		mes "�͂��A�����ł���B";
		mes "�c����������";
		mes "�ӗ~���o���Ă���d���Ȃ̂ŁA";
		mes "����������悤�ł�����";
		mes "��x�c���ɉ����";
		mes "�b�𕷂��Ă݂ĉ������B";
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�c������^ff00002�K�̈�ԍ�^000000�ɂ���܂��B";
		mes "��낵�����肢���܂��ˁB";
		set VER_1QUE,1;
		setquest 7607;
		close2;
		cutin "laime_evenor01",255;
		end;
	case 1:
	case 2:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�c�����҂��Ă��܂���B";
		mes "�c������^ff0000���̊K�̈�ԍ�^000000�ɂ���܂��B";
		mes "��낵�����肢���܂��ˁB";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 3:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�c���Ƃ̘b��";
		mes "���܂��������݂����ł��ˁB";
		mes "����ł͂��q�l���҂��Ă��܂�����A";
		mes "�ꏏ�ɒ����̕����֍s���܂��傤�B";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 4:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "���͂����Ŏx���̗p�ӂ�����";
		mes "���҂����Ă��܂��B";
		mes "���@�����Ŏx�����K�v�ɂȂ����ꍇ��";
		mes "���������Ă��������ˁB";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 37:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "���@��Ƃ͏����̂悤�ł��ˁB";
		mes "�@";
		mes "�K�v�ł�����E�F���X�V�e�B�܂�";
		mes "�����肵�܂��傤���H";
		next;
		if(select("�E�F���X�V�e�B�ɍs��","��߂�") == 2) {
			mes "[���C��]";
			mes "�s���Ȃ���ł��ˁB";
			mes "�킩��܂����B";
			close2;
			cutin "laime_evenor01",255;
			end;
		}
		mes "[���C��]";
		mes "����ł͂����肵�܂��B";
		mes "�����Ă�����Ⴂ�`�B";
		close2;
		cutin "laime_evenor01",255;
		warp "verus04.gat",142,188;
		end;
	default:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "���@��Ƃ͏����̂悤�ł��ˁB";
		mes "�A�g�i�h���m������������������";
		mes "���b�P���x���Ђł�";
		mes "���ڂ����͂��Ȃ̂ŁA";
		mes "�����]�����o�܂���B";
		next;
		mes "[���C��]";
		mes "���m�B�������ɏW�����鎖���ł���̂�";
		mes strcharinfo(0) + "�l�̂������ł��B";
		mes "���ꂩ�����낵�����肢���܂��I";
		close2;
		cutin "laime_evenor01",255;
		end;
	}
OnInit:
	waitingroom "�t�@���^�X�}�S���J",0;
	end;
}

moc_para01.gat,174,165,3	script	���C��#atnd02	952,{
	switch(VER_1QUE) {
	case 0:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�����͎��̕����Ȃ̂�";
		mes "����ɓ���Ȃ��ł��������B";
		mes "�x�ޏꏊ���K�v�Ȃ�";
		mes "�ʂ̕����𗘗p���ĉ������B";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 1:
	case 2:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�c���ׂ͗̕����ɂ��܂��B";
		mes "���̕����̍��ł��B";
		mes "�܂��c���ɉ���Ă��Ă��������B";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 3:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes strcharinfo(0)+ "�l�A";
		mes "��������Ⴂ�܂����ˁB������ł��B";
		mes "���̕��̓A�g�i�h���@�c������";
		mes "�l�Êw�҃A�E���X�l�ł��B";
		next;
		mes "[���C��]";
		mes "�A�E���X�l�A�ޏ���";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
		mes "���@��Ƃɋ��͂���A";
		mes strcharinfo(0)+ "�ł��B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�����c�c�͂��߂܂��ăA�E���X�ł��B";
		mes "�u�肵�Ă���Ă��肪�Ƃ��B";
		mes "�N�̂悤�Ȏ�҂����͂��Ă����Ƃ�";
		mes "�Ȃ�Ƃ��S�����B";
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�c���Ƃ̘b��";
		mes "���܂��������݂����ł��ˁH";
		mes "����̈˗����e�́A";
		mes "�A�E���X�l����������";
		mes "�A�g�i�h���@�c�ɋ��͂��邱�Ƃł��B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�������������΂ł����ˁc�c�B";
		mes "�y���c�݂̂Ȃ���";
		mes "�����Ă�������Ȃ�������";
		mes "�������͂������������邾����";
		mes "�I����Ă���������܂���B";
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�A�E���X�l�c�c�B";
		mes "���Ȃ����قǌo���L���ȕ�������";
		mes "���̑嗤���T���Ă�";
		mes "�Ȃ��Ȃ�����������Ȃ��ł��傤�B";
		next;
		mes "[���C��]";
		mes "���Ȃ����̊����⌤����";
		mes "�f���炵�����̂��Ǝv���܂��B";
		mes "�������ł��̂���`�����ł���̂�";
		mes "���h�Ȏ����Ǝv���Ă��܂���B";
		mes "������ɂ��Ă��A�g�i�h���m�́c�c";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�A�g�i�h�c�c���B";
		mes "�����A�m���ɃA�g�i�h���m�͈̑�ł��B";
		mes "����ɔ��m�̖�������B";
		next;
		mes "[�A�E���X]";
		mes "�������ނ�́c�c�B";
		mes "�ǂ������Έӎu�������A";
		mes "���������΂킪�܂܂��B";
		next;
		mes "[�A�E���X]";
		mes "�Ƃ��o���܂ܒ����ԘA��������";
		mes "�����ɖv���������镃�ƁA";
		mes "���̕��̏������r�؂ꂽ�ƌ�����";
		mes "�Ƃ���Y���������ĕ��ƌ��ʂ��A";
		mes "�z���ɐ����鎖��I�񂾖��B";
		next;
		mes "[�A�E���X]";
		mes "�����̂�肽�����ɒ����Ƃ������B";
		mes "���؂Ȃ�ł��傤�ˁc�c�B";
		mes "���͂����ނ�ɐU��񂳂�Ă��܂��B";
		mes "�������A���h�����Ă��܂����ˁB";
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�c�c�����ł��ˁB�������A";
		mes "�ߋ��͂ǂ��ł���A�����������";
		mes "�����������Ȃ��̂���`�����ł���̂�";
		mes "���̖��̖z���������������炱���ł��B";
		next;
		switch(select("�ڂ����b���C�ɂȂ�","�ȒP�ɐ������Ăق���")) {
		case 1:
			cutin "verus_aures",0;
			mes "[�A�E���X]";
			mes "���C���N����������K�˂Ă������A";
			mes "���Ȃ������y���c��";
			mes "�Ȃ��������̂悤�Ȕ��@�c��";
			mes "��`���Ă����̂�";
			mes "�s�v�c�������̂ł��B";
			next;
			mes "[�A�E���X]";
			mes "�����Ǝ������c�c����A���e��";
			mes "�����Ă���̂�m�����A";
			mes "���̐S�����������̂ł��傤�c�c�B";
			next;
			menu "���e�H�@���H",-;
			cutin "laime_evenor03",2;
			mes "[���C��]";
			mes "�i�C���c�����畷���Ă��܂��񂩁H";
			mes "�A�g�i�h���@�c�̒c���́A";
			mes "�i�C���c���̂����l�Ȃ̂ł��B";
			next;
			mes "[���C��]";
			mes "�����c���ɍ���̎d�����Ă������A";
			mes "���@��Ƃɂ�";
			mes "�A�g�i�h���@�c���Q�����Ă��邩��A";
			mes "�����Ɋy���c�����Q�������Ȃ�����";
			mes "�c�����w��������ł��B";
			next;
			cutin "laime_evenor04",2;
			mes "[���C��]";
			mes "�������b��i�߂Ă���������";
			mes "��l�̒��̈�����";
			mes "�x��ɂȂ��Ă��āc�c�B";
			mes "���������Ă����Ԃł��B";
			next;
			cutin "verus_aures",0;
			mes "[�A�E���X]";
			mes "�����Ȃ�ł��B";
			mes "�C�A���c�c�A�g�i�h�̖��O�Ȃ̂ł����A";
			mes "�ނ��ŏ��͊y���c�̎菕����";
			mes "���ł����̂ł��B";
			next;
			mes "[�A�E���X]";
			mes "�������A�y���c�̒c����";
			mes "�i�C���c�c�����Ƃ�������m�����r�[�A";
			mes "�菕���͎󂯂����Ȃ��I�@�ƁB";
			next;
			break;
		case 2:
			cutin "laime_evenor03",2;
			mes "[���C��]";
			mes "����������`��";
			mes "�A�g�i�h���@�c�̒c���́A";
			mes "�i�C���c���̂����l�Ȃ̂ł��B";
			next;
			mes "[���C��]";
			mes "�����c���ɍ���̎d�����Ă������A";
			mes "���@��Ƃɂ�";
			mes "�A�g�i�h���@�c���Q�����Ă��邩��A";
			mes "�����Ɋy���c�����Q�������Ȃ�����";
			mes "�c�����w��������ł��B";
			next;
			cutin "laime_evenor04",2;
			mes "[���C��]";
			mes "�������b��i�߂Ă���������";
			mes "��l�̒��̈�����";
			mes "�x��ɂȂ��Ă��āc�c�B";
			mes "���������Ă����Ԃł��B";
			next;
			cutin "verus_aures",0;
			break;
		}
		mes "[�A�E���X]";
		mes "���������Ƀ��b�P���x���Ђ�";
		mes "�Q���l����K�͂�񍐂��Ă��܂������A";
		mes "�ꍏ�������l�����W�߂āA";
		mes "�����Ɍ�����˂΂Ȃ�Ȃ���Ԃł��B";
		next;
		mes "[�A�E���X]";
		mes "������Q�������ނ��邱�Ƃ͂ł��Ȃ��B";
		mes "�����ŋM���ɂ��̓�l�̒���";
		mes "����A���@�̎�`��������";
		mes "�������������̂ł��B";
		mes "���⃉�C���N�̐����ł́A";
		mes "�������������Ȃ��ł��傤����B";
		next;
		cutin "laime_evenor04",2;
		mes "[���C��]";
		mes "����̎������������Ƃ���";
		mes "����l���a�����Ă�������΂�";
		mes "�v���̂ł����c�c�B";
		mes "�����A���̘b�͂����܂łɂ��āA";
		mes "�܂��͌���ɍs���܂��傤�B";
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�A�E���X�l�Ƃ̓��[�N����q�Ƃ���";
		mes "�ꏏ�Ɍ��n�֍s���܂��B";
		mes strcharinfo(0) + "�l��";
		mes "���ł����D���Ȏ��Ԃ�";
		mes "���n�֌������Ă��������B";
		next;
		mes "[���C��]";
		mes "��Ƃ��s���ꏊ�́A";
		mes "^ff0000�E�F���X�V�e�B^000000�Ƃ����X�������ł��B";
		mes "�E�F���X�V�e�B�ւ�";
		mes "�W���s���X����s���邻���ł��̂ŁA";
		mes "�܂��̓W���s���X�̓�����";
		mes "�������Ă��������B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���b�P���x���Ђ�";
		mes "��X�I�ɐ�`���Ă��邩��A";
		mes "���ɖ����S�z�͂Ȃ��Ǝv���܂��B";
		mes "����ł́A���n�ŉ�܂��傤�B";
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "���n�ɒ�������o�^���s���Ă��������B";
		mes "�l�I�Ɏd�����󂯂Ă��\���܂��񂪁A";
		mes "�A�g�i�h���@�c�����Ƃ������Ƃ�";
		mes "�d�������Ă���������Ώ�����܂��B";
		next;
		mes "[���C��]";
		mes "�o���̏����������Ă���悤�ł�����A";
		mes "�W���s���X�̓����܂�";
		mes "�����肵�܂��B";
		mes "�ړI�n�܂ł̓����X�^�[��";
		mes "�������鎖������܂��̂ŁA";
		mes "������ӂ�Ȃ��ł��������ˁB";
		next;
		if(select("�f��","�����Ă��炤") == 1) {
			mes "[���C��]";
			mes "�����ł����B";
			mes "�������������琺�������Ă��������ˁB";
			mes "�W���s���X�̓����܂�";
			mes "�����肵�܂���B";
			set VER_1QUE,4;
			delquest 7608;
			setquest 7609;
			close2;
			cutin "laime_evenor01",255;
			end;
		}
		mes "[���C��]";
		mes "�킩��܂����B";
		mes "�W���s���X�̓�����";
		mes "���̒��̐�ɂ���܂��B";
		mes "����ł͂����肵�܂��ˁB";
		mes "���C�����āI";
		set VER_1QUE,4;
		delquest 7608;
		setquest 7609;
		close2;
		cutin "laime_evenor01",255;
		warp "yuno_fild07.gat",217,176;
		end;
	case 4:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "��Ƃ��s���E�F���X�V�e�B�ւ�";
		mes "�W���s���X����s���邻���ł��̂ŁA";
		mes "�܂��̓W���s���X�̓�����";
		mes "�������Ă��������B";
		mes "���n�ɍs���΁A�֌W�҂�";
		mes "�����ɂ݂��鎖���ł���͂��ł��B";
		next;
		mes "[���C��]";
		mes "�o���̏����������Ă���悤�ł�����A";
		mes "�W���s���X�̓����܂�";
		mes "�����肵�܂��B";
		mes "�ړI�n�܂ł̓����X�^�[��";
		mes "�������鎖������܂��̂ŁA";
		mes "������ӂ�Ȃ��ł��������ˁB";
		next;
		if(select("�f��","�����Ă��炤") == 1) {
			mes "[���C��]";
			mes "�����ł����B";
			mes "�������������琺�������Ă��������ˁB";
			mes "�W���s���X�̓����܂�";
			mes "�����肵�܂���B";
			close2;
			cutin "laime_evenor01",255;
			end;
		}
		mes "[���C��]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��ˁB";
		mes "���C�����āI";
		close2;
		cutin "laime_evenor01",255;
		warp "yuno_fild07.gat",217,176;
		end;
	default:
		cutin "laime_evenor02",2;
		mes "[���C��]";
		mes "���@��Ƃ̏󋵂͂ǂ��ł����H";
		mes "�y���c�̕]�����ǂ��Ȃ�悤�A";
		mes "��������d�������Ȃ��Ă��������ˁB";
		mes "�l�����L���A�y���c���L���ɂȂ鎖��";
		mes "����̎d����";
		mes "������̖ړI�ł�����̂ł�����B";
		close2;
		cutin "laime_evenor01",255;
		end;
	}
}

moc_para01.gat,172,164,5	script	�l�Êw�҃A�E���X#atnd02	10057,{
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "���̕��͂��q���܂ł��B";
		mes "�厖�Șb�����Ă���̂ŁA";
		mes "�\���󂠂�܂���";
		mes "�Ȃ��O���Ă��������B";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 3:
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "���̕��͂��q���܂ł��B";
		mes "�c���Ƙb�����Ă����悤�ł��ˁB";
		mes "�ł͎����ڂ����b�����܂��傤�B";
		close2;
		cutin "laime_evenor01",255;
		end;
	case 4:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���͈ꑫ���";
		mes "�E�F���X�V�e�B�֌������܂��ˁB";
		mes "����ł͂܂��A���n�ŉ�܂��傤�B";
		close2;
		cutin "verus_aures",255;
		end;
	default:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�N�����Ă����̂ł��ˁB";
		mes "���������ɂ͕p�ɂɖK��Ă��܂���B";
		mes "���܂ɂ��̎q�̊炪";
		mes "�������Ȃ���̂łˁc�c�B";
		next;
		mes "[�A�E���X]";
		mes "���x�����n�Ɖ��������Ă���̂�";
		mes "���[�N�N�ɂ͔N��̂킪�܂܂�";
		mes "�����Ă�����Ă��܂��B";
		mes "����ł͂܂��A���n�ŉ�܂��傤�B";
		close2;
		cutin "verus_aures",255;
		end;
	}
}

moc_para01.gat,178,167,3	script	���[�N���t�F�Y#atnd03	953,{
	if(VER_1QUE < 4) {
		cutin "looke_rapez04",0;
		mes "[���[�N]";
		mes "�����B���C���B";
		mes "���q�l�����c�c�B";
		close2;
		cutin "looke_rapez04",255;
		end;
	}
	else if(VER_1QUE == 4) {
		cutin "looke_rapez04",0;
		mes "[���[�N]";
		mes "�c�c�B";
		mes "�c�c���ɘb�����Ƃ͖����B";
		close2;
		cutin "looke_rapez04",255;
		end;
	}
	else {
		cutin "looke_rapez03",0;
		mes "[���[�N]";
		mes "�c�c�B";
		close2;
		cutin "looke_rapez03",255;
		end;
	}
}

moc_para01.gat,17,187,0		warp	#warp_2_bossroom	1,1,moc_para01.gat,132,159
moc_para01.gat,132,156,0	warp	#warp_2_2fhall_1	1,1,moc_para01.gat,17,185
moc_para01.gat,29,187,0		warp	#warp_2_room1		1,1,moc_para01.gat,180,159
moc_para01.gat,180,156,0	warp	#warp_2_2fhall_2	1,1,moc_para01.gat,29,185

moc_para01.gat,133,170,4	script	�c���A���N�C�G��#e152a1	951,{
	switch(VER_1QUE) {
	case 0:
		cutin "Arquien_n_atnad02",2;
		mes "[�c���A���N�C�G��]";
		mes "�N���H�@�N�����m��Ȃ����A";
		mes "����ɗ�������Ȃ��ł���B";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 1:
		cutin "Arquien_n_atnad01",2;
		mes "[�c���A���N�C�G��]";
		mes "�N��" +strcharinfo(0)+ "���H";
		mes "�悭���Ă��ꂽ�ˁB";
		next;
		mes "[�c���A���N�C�G��]";
		mes "�܂��͎��̎��ȏЉ�����悤���B";
		mes "�����y���c�̐ݗ��҂Œc����";
		mes "�A���N�C�G���E�i�C���E�A�g�i�h���B";
		mes "���O���������G������A";
		mes "�i�C���ƌĂ�ł���B";
		next;
		switch(select("�Ă΂ꂽ���R�𕷂�","�~�h���l�[���H")) {
		case 1:
			cutin "Arquien_n_atnad03",2;
			mes "[�i�C��]";
			mes "�ق��A�{��ɂ��̂܂ܓ��邩�B";
			mes "�d���M�S�ȓz�͊��}���B";
			mes "�ŋ߁A���Ԃɏo����Ă���\�b��";
			mes "��ԑ傫�Ȃ��̂������m���Ă��邩�H";
			break;
		case 2:
			mes "[�i�C��]";
			mes "�c�����ɕ�e��";
			mes "�t���Ă��ꂽ���̂��c�c�B";
			next;
			mes "[�i�C��]";
			mes "����ȏ�͎��I�Șb�ɂȂ邩��";
			mes "���̎��ɋ�������������ǂ����H";
			mes "�Ⴆ�΍ŋ߉\�ɂȂ��Ă��鎖�Ƃ����B";
			break;
		}
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�@�������H�@�������B";
		mes "�W���s���X�̊g�������̘b���B";
		next;
		mes "[�i�C��]";
		mes "���������m���Ă�����͂��ꂾ�B";
		mes "�W���s���X�n��ɂĐV�����ʘH��";
		mes "�ЂƂ������ꂽ�炵���B";
		next;
		mes "[�i�C��]";
		mes "�������Ƃɔ������ꂽ�ʘH�̐�ɂ́A";
		mes "�W���s���X�ƌq�����Ă͂��邪";
		mes "�S���Ⴄ���m�̈�Ղ��������������B";
		mes "����̔��@�c�̖ړI�́A";
		mes "���̔������ꂽ���m�̈�Ղ̒������B";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�v���W�F�N�g�����Ȃ�ƌ��������ȁc�c";
		mes "�������A";
		mes "^4d4dff�t�@���^�X�}�S���J�v���W�F�N�g^000000���B";
		mes "���@�c�̕�W�ƌ㉇�̎�Â�";
		mes "���q�^���[���̃��b�P���x���Ђ�";
		mes "�s���������B";
		next;
		menu "����ŁH",-;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�ӂށc�c�債�ċ������Ȃ��悤���ȁH";
		mes "���ꂶ�Ⴑ���ł�߂悤���H";
		mes "���C�������E���Ă����z������";
		mes "����Ȃ�ɏ������Ă����̂����B";
		next;
		if(select("�����ĉ�����","��߂悤") == 2) {
			cutin "Arquien_n_atnad02",2;
			mes "[�i�C��]";
			mes "�܂��A�������Ȃ��Ȃ�d�����Ȃ��B";
			mes "���C���ɂ͉��߂�";
			mes "���̐l�𐄑E���Ă���Ɨ��ނ��B";
			mes "���Ԃ���点�Ă��܂Ȃ������ȁB";
			mes "�����s���Ă������B";
			set VER_1QUE,2;
			close2;
			cutin "Arquien_n_atnad02",255;
			end;
		}
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�������悤�B���͎�������";
		mes "���̃t�@���^�X�}�S���J�v���W�F�N�g��";
		mes "���@�ɁA�Q�������邱�Ƃ�";
		mes "���߂��񂾁B";
		next;
		mes "[�i�C��]";
		mes "�������́A�Q������l�ނ�";
		mes "��������Ƃ����̂�";
		mes "�������̎d�������B";
		mes "����܂ł̎d����ʂ���";
		mes "�N�B�̂悤�Ȗ`���҂Ƃ̐l���͂��邵�A";
		mes "�l�ޏЉ�ɂ����Ă͊y���c�̓v�����B";
		next;
		mes "[�i�C��]";
		mes "�ł���d����";
		mes "�Ȃ�ł�����Ă����Ȃ��ƂˁB";
		mes "�y���c�����̂܂܂�����";
		mes "�����N�ɂ������͂Ȃ�����ȁB";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "����ɂ��̃��b�P���x���Ђ����";
		mes "���X�̗v�����B";
		mes "�l�ނ���ʂɕK�v�����璇��𗊂ނ�";
		mes "����ꂽ��A�󂯂�̂��v�����낤�H";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "������Ăł͂Ȃ��B���������@��B";
		mes "�l���Љ�Ď������͋����󂯎��A";
		mes "�N�͎d�������ċ������炤�B";
		next;
		menu "���̃v���W�F�N�g�ɎQ������ƁH",-;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�����������Ƃ��B";
		mes "��{�I�ɂ͈�Ք��@��ƂɎQ�����鎖��";
		mes "����̎d�����e���B";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�����N�����@�c�ɎQ�����Ă����Ȃ�A";
		mes "�ЂƂA�d������";
		mes "�m�F���ė~������������B";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "���݁A";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g�ɂ�";
		mes "�������̔��@�c�Ƒg�D���Q�����Ă���B";
		mes "���̒��ŌN�́A";
		mes "���C�����Љ�锭�@�c��";
		mes "�d�������邱�ƂɂȂ�B";
		next;
		mes "[�i�C��]";
		mes "���̔��@�c�Ŏd�������Ȃ���";
		mes "^ff0000�c���̃C�A����";
		mes "�Ō�̒T���ɂ��ĕ����Ă݂Ă���B^000000";
		mes "���Ȃ݂Ɏd���ɂ��Ă̏ڂ����b��";
		mes "���C�����������Ă����B";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "���C���ׂ͗̕������B";
		mes "�����킩�����玄�ɕ񍐂���悤�ɁB";
		mes "���l�ɂ͘R�炷�Ȃ�B";
		mes "����ł́A���񂾂��B";
		set VER_1QUE,3;
		delquest 7607;
		setquest 7608;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 2:
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "�ǂ������A�������N���Ă����̂��H";
		next;
		if(select("������","�Ⴄ") == 2) {
			cutin "Arquien_n_atnad01",2;
			mes "[�i�C��]";
			mes "�������B�D���ɂ���Ƃ����B";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "����ł͘b�𑱂��悤���B";
		mes "���͎�������";
		mes "���̃t�@���^�X�}�S���J�v���W�F�N�g��";
		mes "���@�ɎQ�����悤�ƍl���Ă���̂��B";
		next;
		mes "[�i�C��]";
		mes "�������́A�Q������l�ނ�";
		mes "��������Ƃ����̂��������̎d�������B";
		mes "����܂ł̎d����ʂ���";
		mes "�N�B�̂悤�Ȗ`���҂Ƃ̐l���͂��邵�A";
		mes "�l�ޏЉ�ɂ����Ă͊y���c�̓v�����B";
		next;
		mes "[�i�C��]";
		mes "�ł���d����";
		mes "�Ȃ�ł�����Ă����Ȃ��ƂˁB";
		mes "�y���c�����̂܂܂�����";
		mes "�����N�ɂ������͂Ȃ�����B";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "����ɂ��̃��b�P���x���Ђ����";
		mes "���X�̗v�����B";
		mes "�l�ނ���ʂɕK�v�����璇��𗊂ނ�";
		mes "����ꂽ��A�󂯂�̂��v�����낤�H";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "������Ăł͂Ȃ��B���������@��B";
		mes "�l���Љ�Ď������͋����󂯎��A";
		mes "�N�͎d�������ċ������炤�B";
		next;
		menu "���̃v���W�F�N�g�ɎQ������ƁH",-;
		mes "[�i�C��]";
		mes "�����������Ƃ��B";
		mes "��{�I�ɂ͈�Ք��@��ƂɎQ�����邱�Ƃ�";
		mes "����̎d�����e���B";
		next;
		mes "[�i�C��]";
		mes "�����N�����@�c�ɎQ�����Ă����Ȃ�A";
		mes "�ЂƂA�d������";
		mes "�m�F���ė~������������B";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "���݁A";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g�ɂ�";
		mes "�������̔��@�c�Ƒg�D���Q�����Ă���B";
		mes "���̒��ŌN�́A";
		mes "���C�����Љ�锭�@�c��";
		mes "�d�������邱�ƂɂȂ�B";
		next;
		mes "[�i�C��]";
		mes "���̔��@�c�Ŏd�������Ȃ���";
		mes "^ff0000�c���̃C�A����";
		mes "�Ō�̒T���ɂ��ĕ����Ă݂Ă���B^000000";
		mes "���Ȃ݂Ɏd���ɂ��Ă̏ڂ����b��";
		mes "���C�����������Ă����B";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "���C���ׂ͗̕������B";
		mes "�����킩�����玄�ɕ񍐂���悤�ɁB";
		mes "���l�ɂ͘R�炷�Ȃ�B";
		mes "����ł́A���񂾂��B";
		set VER_1QUE,3;
		delquest 7607;
		setquest 7608;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 3:
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�����ׂ̕����Ń��C�����҂��Ă���B";
		mes "�ڂ������͔ނɕ����Ă���B";
		close2;
		cutin "Arquien_n_atnad04",255;
		end;
	case 4:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�d���������󂯂Ă��ꂽ�������ȁB";
		mes "�������瑁����ƂɎ��|����Ƃ����B";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "���̑����";
		mes "���̔��m���������Ă���̂�";
		mes "���������̂��������茩�Ă��Ȃ����B";
		next;
		mes "[�i�C��]";
		mes "�����A�����s���񂾁B";
		close2;
		cutin "Arquien_n_atnad04",255;
		end;
	case 22:
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�ǂ������A";
		mes strcharinfo(0)+ "����Ȃ����B";
		mes "�񍐂Ȃ烋�[�N���畷���Ă���B";
		mes "���\�撣���Ă���炵���ȁI";
		next;
		mes "[�i�C��]";
		mes "�N�̂����ŁA�y���c��";
		mes "�A�g�i�h���@�c�̕]���͏�X���B";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "����ō����͂ǂ������񂾁H";
		mes "�Ō�̒T���Ɋւ���";
		mes "�������������̂��H";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�Ⴄ�̂��H";
		mes "�ȂɁH�@�e���ɗ��܂ꂽ�H";
		mes "�������H";
		next;
		menu "���R�[�h�v���C���[��݂��Ăق���",-;
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "�ӂށc�c���R�[�h�v���C���[�H";
		mes "�������ȁA���o���͂���B";
		mes "�������c�c���̐e���A����������������";
		mes "��������o���Ă�񂾂ȁB";
		mes "�A�C�c�炵���ƌ����΂��������B";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "���R�[�h�v���C���[���悱���H";
		mes "�Ԏ��̓m�[���B";
		set VER_1QUE,23;
		delquest 7644;
		setquest 118205;
		close2;
		cutin "Arquien_n_atnad04",255;
		end;
	case 23:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�Ȃ񂾂܂������̂��B";
		mes "���R�[�h�v���C���[�̌��Ȃ�";
		mes "���x���Ă��������B";
		next;
		mes "[�i�C��]";
		mes "���̐e���A��������������";
		mes "���𗊂��āA���q���ǂ�����񂾁B";
		mes "������������ȌÏL���@�B�A";
		mes "���Ɏg���񂾁H";
		next;
		menu "���܂ł̘b���ڂ����b��",-;
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "�ӂށc�c";
		mes "�������[���R�[�h�c�c���B";
		mes "����̓��e��m�邽�߂ɁA";
		mes "���R�[�h�v���C���[���K�v�Ƃ����󂩁B";
		next;
		mes "[�i�C��]";
		mes "�c�c�B";
		mes "�c�c�������ȁc�c";
		cutin "Arquien_n_atnad01",2;
		next;
		mes "[�i�C��]";
		mes "�킩�����B";
		mes "�����̂��߂ɕK�v�Ƃ������Ȃ�A";
		mes "���X�s�{�ӂ������͂��悤�B";
		mes "���̐e���ɉ��𔄂�";
		mes "�`�����X��������񂵂ȁB";
		next;
		mes "[�i�C��]";
		mes "���̐e�����A�\�c���̎c�������̂���";
		mes "��؂ɕۊǂ��Ă����̂�";
		mes "�m���Ă�������A";
		mes "�Ƃ肠�����Ƃ��������鎞��";
		mes "�����Ă͗��Ă����̂����A";
		mes "����ȂƂ���Ŗ��ɗ��Ƃ͂ȁB";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "���������̑O��";
		mes "���̃������[���R�[�h�ƌ������̂�";
		mes "�����ė~�����B";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "���ꂪ�������[���R�[�h���H";
		mes "�Ȃ�قǁA���R�[�h�v���C���[��";
		mes "���肻���Ȍ`�����Ă���ȁB";
		mes "�Ƃ���ł����";
		mes "�ǂ��Ō������񂾁H";
		next;
		mes "[�i�C��]";
		mes "�c�O�����ǂ��̃������[���R�[�h��";
		mes "�ЂƂ������ᓮ���Ȃ��݂������B";
		mes "�Đ�����ɂ�2�A�K�v���Ǝv���B";
		mes "���炭�N�����킴��";
		mes "�������Ă��������̂Ȃ񂾂낤�B";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�������ȁc�c";
		mes "���ꂶ�Ⴀ�������悤�B";
		mes "�������̃��R�[�h�v���C���[��������";
		mes "���@�n�ɍs���B";
		next;
		mes "[�i�C��]";
		mes "���̊ԁA�N�͎c��̃������[���R�[�h��";
		mes "�W�߂ė���񂾁B";
		mes "�����Ƒ��ɂ�������";
		mes "�߂��ɂ���͂����B";
		next;
		mes "[�i�C��]";
		mes "�����ȁH";
		mes "�N�͌N�̂��ׂ����Ƃ����񂾁B";
		mes "���ꂶ�Ⴀ";
		mes "�E�F���X�V�e�B�ŉ���B";
		set VER_1QUE,24;
		delquest 118205;
		setquest 7645;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 24:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "^ff0000�������[���R�[�h��2��";
		mes "�W�߂Ă���΂����B^000000";
		mes "�ŏ��̃������[���R�[�h��";
		mes "�������ꏊ�̋߂���";
		mes "�����Ƃ���͂����B";
		next;
		mes "[�i�C��]";
		mes "�E�F���X�V�e�B�֖߂�̂Ȃ�";
		mes "�����Ă�邼�B";
		next;
		if(select("�������������ɂ���","�����Ă��炤") == 1) {
			mes "[�i�C��]";
			mes "�Ȃ񂾁H�@�܂������ɋ���̂��H";
			mes "�p��������Ȃ�";
			mes "�������ƏI��点�āA";
			mes "�d���ɖ߂�񂾁B";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		mes "[�i�C��]";
		mes "�킩�����B";
		mes "�ł́A���낤�B";
		next;
		mes "[�i�C��]";
		mes "�N�͌N�̂��ׂ����Ƃ����񂾁B";
		mes "���ꂶ�Ⴀ�A";
		mes "�E�F���X�V�e�B�ŉ���B";
		close2;
		cutin "Arquien_n_atnad01",255;
		warp "verus04.gat",142,188;
		end;
	case 37:
		cutin "Arquien_n_atnad01.bmp", 2;
		mes "[�i�C��]";
		mes "�c�c�ʂɋC�ɂȂ邩��";
		mes "���ڍs����ł͂Ȃ����B";
		mes "�����Z�����g�Ȃ񂾁B";
		close2;
		cutin "Arquien_n_atnad01.bmp", 255;
		end;
	default:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "����A" + strcharinfo(0) + "���B";
		mes "�ǂ������@�c�̎d���́A";
		mes "���܂����Ȃ��Ă��邩�H";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	}
}

ver_eju.gat,114,40,4	script	�Ǘ��҃~�V�F��#atnd05	868,{
	if(VER_1QUE < 4) {
		mes "[�Ǘ��҃~�V�F��]";
		mes "�ǂ��̔��@�c�̏����ł����H";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "�c�c�������Ă��Ȃ��H";
		mes "�l�o�^�␄�E�́H";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "�c�c�Ȃ��悤�ł��ˁB";
		mes "�x���c�̂̐��E��A";
		mes "�o�^����Ă��锭�@�c���Ȃ��Ȃ�";
		mes "���@��Ƃ͂ł��܂���B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "�����ł��ˁc�c";
		mes "^ff0000�y���c^000000�Ŕ��@�c�̒c����";
		mes "��W���Ă���ƕ����܂����B";
		mes "���@��Ƃɋ���������Ȃ�";
		mes "��x�s���Ă݂�Ɨǂ��ł��傤�B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "����������悤�ł�����";
		mes "�y���c�ւ����肵�܂����A";
		mes "�ǂ����܂����H";
		next;
		if(select("�f��","�����Ă��炤") == 1) {
			mes "[�Ǘ��҃~�V�F��]";
			mes "�����ł����B";
			next;
			mes "[�Ǘ��҃~�V�F��]";
			mes "�����A�댯�ł��̂�";
			mes "�֌W�Ȃ�����";
			mes "�������痣��Ă��������B";
			close;
		}
		mes "[�Ǘ��҃~�V�F��]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��ˁB";
		close2;
		warp "moc_para01.gat",28,29;
		end;
	}
	else if(VER_1QUE == 4) {
		if(checkquest(7611)) {
			mes "[�Ǘ��҃~�V�F��]";
			mes "���@�n�֌����������A";
			mes "^ff0000��@�^�E�F���X�M�A^000000��^ff000010��^000000�A";
			mes "�|���Ȃ���i��ł��������B";
			mes "��낵�����肢���܂��B";
			next;
			mes "�]�O�s�g���l���̃����X�^�[������";
			mes "�@�񍐂́A���@�c�Q���o�^�̌��";
			mes "�@�s�����Ƃł��܂��B";
			mes "�@�Q���o�^��^ff0000�E�F���X���@�n^000000�ɂ���";
			mes "�@^ff0000��t�i��^000000����A";
			mes "�@�o�^���邱�Ƃ��ł��܂��]";
			close;
		}
		mes "[�Ǘ��҃~�V�F��]";
		mes "����A���Ȃ��́H";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
		mes "���@�����u��҂ł����H";
		mes "�����O�́H";
		next;
		menu "�����",-;
		mes "[�Ǘ��҃~�V�F��]";
		mes strcharinfo(0) + "����ł��ˁB";
		mes "������m�F���܂��B���҂����������B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "�c�c�͂��A�m����";
		mes "���A�����������Ă��܂��B";
		mes "�y���c���炢�炵�����ł��ˁB";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "�悤�����A�E�F���X�V�e�B�ցB";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g�ւ�";
		mes "���Q���A���肪�Ƃ��������܂��B";
		mes "���@�n�͂��̃g���l���̌������ł��B";
		mes "���ɓ���Ƒ����w����������̂�";
		mes "�����Ő����ȓo�^�����Ă��������B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "���Ȃ��ɂЂƂ�";
		mes "���肢��������������̂ł����c�c�B";
		mes "�������甭�@�n�֌������r���A";
		mes "�����ɂ��郂���X�^�[��|���Ȃ���";
		mes "�i��ł��炢�����̂ł��B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "^ff0000��@�^�E�F���X�M�A^000000�Ƃ��������X�^�[��";
		mes "���ŁA�����҂̂悤�Ȑ킦�Ȃ��ҒB��";
		mes "�Ȃ��Ȃ���֐i�߂������Ă���̂ł��B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "�ł��̂ŁA�M���̂悤��";
		mes "�퓬�o���̖L�x�Ȗ`���҂�";
		mes "���@�n�֌����������A";
		mes "�����ɋ��͂��Ă��炦��悤";
		mes "���肢�����Ă��܂��B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "^ff0000��@�^�E�F���X�M�A^000000��^ff000010��^000000�A";
		mes "�|���Ȃ���i��ł��������B";
		mes "��낵�����肢���܂��B";
		next;
		mes "[�Ǘ��҃~�V�F��]";
		mes "�������I�������񍐂����Ă��������B";
		mes "�񍐂́A���������w�����ɂ���";
		mes "���C�X�ɕ񍐂��Ă��������ˁB";
		mes "�񍐂͔��@�c�̓o�^�̌��";
		mes "�󂯕t���܂��B";
		mes "����ł͂�낵�����肢���܂��B";
		next;
		mes "�]�O�s�g���l���̃����X�^�[������";
		mes "�@�񍐂́A���@�c�Q���o�^�̌��";
		mes "�@�s�����Ƃł��܂��B";
		mes "�@�Q���o�^��^ff0000�E�F���X���@�n^000000�ɂ���";
		mes "�@^ff0000��t�i��^000000����A";
		mes "�@�o�^���邱�Ƃ��ł��܂��]";
		setquest 7611;
		close;
	}
	else {
		mes "[�Ǘ��҃~�V�F��]";
		mes "����ɂ��́B";
		mes "��Ƃ̐i���͂������ł����H";
		set '@str$,"�����X�^�[�����@(^FF0000�f�C���[�N�G�X�g^000000)";
		if(checkquest(7611)) {
			if(checkquest(7611) & 0x4)
				set '@str$,"�����X�^�[�����@(^FF0000��V�󂯎��\^000000)";
			else
				set '@str$,"�����X�^�[�����@(^FF0000�󒍒�^000000)";
		}
		else if(checkquest(7612)) {
			if(checkquest(7612) & 0x2)
				set '@str$,"�����X�^�[�����@(^FF0000�N�G�X�g�󒍉\^000000)";
		}
		next;
		switch(select('@str$,"�b������","��������")) {
		case 1:
			if(checkquest(7611)) {
				if(checkquest(7611) & 0x4 == 0) {
					mes "[�Ǘ��҃~�V�F��]";
					mes "�O�s�g���l���ɂ���A";
					mes "^ff0000��@�^�E�F���X�M�A^000000�Ƃ��������X�^�[��";
					mes "���ŁA�����҂̂悤�Ȑ킦�Ȃ��ҒB��";
					mes "�Ȃ��Ȃ���֐i�߂������Ă���̂ł��B";
					next;
					mes "[�Ǘ��҃~�V�F��]";
					mes "���@�n�֌����������A";
					mes "^ff0000��@�^�E�F���X�M�A^000000��^ff000010��^000000�A";
					mes "�|���Ȃ���i��ł��������B";
					next;
					mes "[�Ǘ��҃~�V�F��]";
					mes "�������I�������񍐂����Ă��������B";
					mes "�񍐂́A���������w�����ɂ���";
					mes "���C�X�ɕ񍐂��Ă��������ˁB";
					mes "����ł͂�낵�����肢���܂��B";
					close;
				}
				if(checkitemblank() == 0) {
					mes "�]�A�C�e���̎�ސ���������";
					mes "�@�����Ƃ��ł��Ȃ��B";
					mes "�@��ސ������炵�Ă���󂯎�낤�]";
					close;
				}
				mes "[�Ǘ��҃~�V�F��]";
				mes "��@�^�E�F���X�M�A��";
				mes "�|���Ă����������݂����ł��ˁB";
				mes "���肪�Ƃ��������܂��B";
				mes "�܂������ɋ��͂��Ă��炦���";
				mes "������܂��B";
				chgquest 7611,7612;
				getitem 6961,3;
				close;
			}
			if(checkquest(7612)) {
				if(checkquest(7612) & 0x2 == 0) {
					mes "[�Ǘ��҃~�V�F��]";
					mes "��@�^�E�F���X�M�A��";
					mes "�|���Ă����������݂����ł��ˁB";
					mes "���肪�Ƃ��������܂��B";
					mes "�܂��������Ԃ�������";
					mes "���͂��Ă��炦��Ə�����܂��B";
					close;
				}
				mes "[�Ǘ��҃~�V�F��]";
				mes "���������͂��Ă���������̂ł����H";
				mes "���Ȃ��ɂ�^ff0000��@�^�E�F���X�M�A^000000�̓�����";
				mes "���肢�������̂ł����c�c�B";
				next;
				if(select("��`��","�f��") == 2){
					mes "[�Ǘ��҃~�V�F��]";
					mes "�����ł����A�c�O�ł��c�c�B";
					mes "�܂��C����������";
					mes "��낵�����肢���܂��ˁB";
					close;
				}
				mes "[�Ǘ��҃~�V�F��]";
				mes "���肪�Ƃ��������܂��B";
				mes "�������I�������A";
				mes "���������w�����ɂ���";
				mes "���C�X�ɕ񍐂��Ă��������ˁB";
				mes "����ł͂��C�����āB";
				setquest 7611;
				close;
			}
		case 2:
			mes "[�Ǘ��҃~�V�F��]";
			mes "���@�c�݂̂Ȃ���̂����͂�";
			mes "���ӂ��Ă��܂��B";
			mes "�����̐i���́A";
			mes "�w�����̃��C�X�ɕ񍐂��Ă��������ˁB";
			close;
		case 3:
			mes "[�Ǘ��҃~�V�F��]";
			mes "�����l�ł��B";
			close;
		}
	}
}

ver_eju.gat,116,43,5	script	���b�P���x���b��#atd01	482,{
	switch(rand(3)) {
	case 0: unittalk "���b�P���x���b�� : �c�c�B"; break;
	case 1: unittalk "���b�P���x���b�� : �c�c�C��t���ĉ������B"; break;
	case 2: unittalk "���b�P���x���b�� : ���肪�����c�c�B"; break;
	}
	end;
}

ver_eju.gat,125,40,1	script	���b�P���x���b��#atd02	884,{
	switch(rand(3)) {
	case 0: unittalk "���b�P���x���b�� : �����x�݂����ȁc�c�B"; break;
	case 1: unittalk "���b�P���x���b�� : �����͂Ȃ��̂��H"; break;
	case 2: unittalk "���b�P���x���b�� : ����Ȃ��z�߁I"; break;
	}
	end;
}

ver_eju.gat,117,35,7	script	���b�P���x���b��#atd03	484,{
	switch(rand(3)) {
	case 0: unittalk "���b�P���x���b�� : �ދ��c�c�B"; break;
	case 1: unittalk "���b�P���x���b�� : �C��t���ĉ������B"; break;
	case 2: unittalk "���b�P���x���b�� : ���@�c���͊O�s�g���l���Ɉړ����ĉ������B"; break;
	}
	end;
}

ver_eju.gat,15,151,3	script	���b�P���x���x���	868,{
	mes "[���b�P���x���x���]";
	mes "���@�n�܂ōs�����̂ł����H";
	mes "�ł́A���̓����܂������s������A";
	mes "�ŏ��̏\���H���A����T���H�͓��ցB";
	mes "���̌㓹�Ȃ�ɐi��ŁA�ŏ���";
	mes "�Ȃ���p���ɁA���Ȃ�ɐi�߂�";
	mes "���v�ł���B";
	next;
	mes "[���b�P���x���x���]";
	mes "�������̈ē��ŕ�����Ȃ��ꍇ��";
	mes "�n�}�Ɉ�����Ă����܂�����A";
	mes "��𗊂�ɁA�i��ŉ������ˁB";
	viewpoint 1,113,36,0,0x4DFF00;
	next;
	mes "[���b�P���x���x���]";
	mes "�ł́c�c";
	mes "�����X�^�[���o�v���Ă���Ƃ�";
	mes "��񂪂���܂��̂ŁA���C�����āI";
	close;
}

juperos_01.gat,48,243,5	script	���b�P���x���x���	868,{
	mes "[���b�P���x���x���]";
	mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
	mes "���@�n�܂ōs���܂����H";
	mes "�������G�Ȃ̂�";
	mes "���ӂ��Đi��ł��������ˁB";
	next;
	mes "[���b�P���x���x���]";
	mes "�������瓌���ɂ܂������s������A";
	mes "���ɉ����ē�̕��ɏ���������";
	mes "�[�̕��ɑ傫�ȓ���������܂��B";
	mes "������ڎw���Ă����������";
	mes "���@�n�܂ŒH�蒅���܂��B";
	viewpoint 1,242,87,0,0x4DFF00;
	next;
	mes "[���b�P���x���x���]";
	mes "�����X�^�[���o�v���Ă���Ƃ�";
	mes "��񂪂���܂��̂ŁA���C�����āI";
	close;
}

juperos_01.gat,242,91,3	script	���b�P���x���x���	868,{
	mes "[���b�P���x���x���]";
	mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
	mes "���@�n�܂ōs���܂����H";
	mes "���̓�����";
	mes "�W���s���X�p�Г����̓����ɂȂ�܂��B";
	next;
	mes "[���b�P���x���x���]";
	mes "������̓�����������";
	mes "�����ɓ��ē��l������̂ŁA";
	mes "���̎҂����@�n�܂ł̓���";
	mes "�ē����Ă����͂��ł��B";
	next;
	mes "[���b�P���x���x���]";
	mes "�����X�^�[���o�v���Ă���Ƃ�";
	mes "��񂪂���܂��̂ŁA���C�����āI";
	close;
}

verus04.gat,182,168,5	script	��t�i��#atnd06	893,{
	if(VER_1QUE < 4) {
		mes "[�i��]";
		mes "����ɂ��́B";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g�A";
		mes "���@�c��t�ł��B";
		mes "���E�󂩏������Ă���";
		mes "���@�c�͂���܂����H";
		next;
		mes "[�i��]";
		mes "�c�c�ǂ���������悤�ł��ˁB";
		mes "�o�^���ꂽ���@�c�։������邩�A";
		mes "���E���������ė��Ă����������";
		mes "��t���ł��܂���B";
		next;
		if(select("�������o�^��������","��ł܂�����") == 2) {
			mes "[�i��]";
			mes "�킩��܂����B";
			mes "�o�^���ꂽ���@�c�։������邩�A";
			mes "���E���������ė��Ă��������ˁB";
			mes "���҂����Ă��܂��I";
			close;
		}
		mes "[�i��]";
		mes "����܂����ˁB";
		mes "�x���c�̂̐��E��A";
		mes "�o�^����Ă��锭�@�c���Ȃ��Ȃ�";
		mes "���@��Ƃ͂ł��܂���B";
		next;
		mes "[�i��]";
		mes "�m���Ă��锭�@�c��";
		mes "���E��Ⴆ�����ȋ@�ւ͂���܂��񂩁H";
		mes "�Ȃ��̂ł���΁A";
		mes "^ff0000�y���c^000000�֍s���Ă݂Ă͂������ł��傤�B";
		next;
		mes "[�i��]";
		mes "�y���c�͂���";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
		mes "���@�ɋ��͂��Ă���Ă��܂��B";
		mes "�����Ɣ��@�c�ɎQ��������@��";
		mes "�����Ă����ł��傤�B";
		next;
		mes "[�i��]";
		mes "�y���c�֍s���̂ł�����";
		mes "�����肵�܂���B";
		next;
		if(select("�f��","�����Ă��炤") == 1) {
			mes "[�i��]";
			mes "�����ł����B";
			close;
		}
		mes "[�i��]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��ˁB";
		close2;
		warp "moc_para01.gat",28,29;
		end;
	}
	else if(VER_1QUE == 4) {
		mes "[�i��]";
		mes "����ɂ��́B";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g�A";
		mes "���@�c��t�ł��B";
		mes "���E�󂩏������Ă���";
		mes "���@�c�͂���܂����H";
		next;
		menu "�y���c���痈��",-;
		mes "[�i��]";
		mes "�y���c���炢�炵�����ł��ˁB";
		mes strcharinfo(0) + "����c�c";
		mes "�͂��A�m�F�ł��܂����B";
		next;
		mes "[�i��]";
		mes "�������Ă��锭�@�c�̖��O��";
		mes "�����Ă��������܂����H";
		next;
		menu "�A�g�i�h���@�c",-;
		mes "[�i��]";
		mes "�A�g�i�h�c�c";
		mes "�m�F�ł��܂����B";
		mes "����œo�^�͊����ł��B";
		next;
		mes "[�i��]";
		mes "�Ɩ��̓��e�ɂ��Ă��������܂��ˁB";
		mes "�����ł̍�Ƃ�";
		mes "��{�I�Ɋe���@�c�̒c���̎w���ɏ]���A";
		mes "�i�߂Ă���������Ζ�肠��܂���B";
		next;
		mes "[�i��]";
		mes "�܂��A�����w�����ňē����Ă���d����";
		mes "�l�Ő��������Ă����������Ƃ�";
		mes "�\�ł��B";
		next;
		mes "[�i��]";
		mes "���َ������������܂�����";
		mes "���̓s�x���m�点���܂��B";
		mes "�����A����������莡�Â��K�v�ȏꍇ��";
		mes "�w�����̈�t����";
		mes "���Â��󂯂邱�Ƃ��ł��܂��B";
		next;
		mes "[�i��]";
		mes "���b�P���x���Ђ��ӔC��������";
		mes "�݂Ȃ�����T�|�[�g���Ă���܂��̂�";
		mes "�����S�������B";
		mes "����ł͂��C�����āB";
		mes "�傫�Ȑ��ʂ����҂��Ă��܂��B";
		set VER_1QUE,5;
		chgquest 7609,7610;
		close;
	}
	else if(VER_1QUE == 5) {
		mes "[�i��]";
		mes "�o�^�͊������Ă��܂��̂ŁA";
		mes "�ǂ����A��ƂɎ��|�����Ă��������B";
		next;
		mes "[�i��]";
		mes "��Ƃ̕񍐂Ȃǂ�";
		mes "�w�����ł��郋�C�X�����";
		mes "�񍐂��Ă��������ˁB";
		next;
		mes "[�i��]";
		mes "����ł͂��C�����āB";
		mes "�傫�Ȑ��ʂ����҂��Ă��܂��B";
		close;
	}
	else {
		mes "[�i��]";
		mes "�������撣���Ă��܂��ˁB";
		mes "����J���܂ł��`�I";
		close;
	}
}

verus04.gat,179,165,5	script	�w�������C�X#atnd07	868,{/* 59257 */
	if(VER_1QUE < 5) {
		mes "[���C�X]";
		mes "�����o�^������Ă��Ȃ��悤�ł��B";
		mes "��t�œo�^�葱�����s���Ă���";
		mes "�܂����Ă��������B";
		close;
	}
	mes "[���C�X]";
	mes "�A�g�i�h���@�c�����̕��ł��ˁB";
	mes "�ǂ�����܂������H";
	if(VER_1QUE == 12 || VER_1QUE >= 17)
		set '@str$,"���ʕ񍐁@(^FF0000�X�g�[���[�N�G�X�g^000000)";
	else
		set '@str$,"���ʕ񍐁@(^FF0000�f�C���[�N�G�X�g^000000)";
	next;
	switch(select('@str$,"�����X�^�[�����@(�f�C���[�N�G�X�g)","��b������")) {
	case 1:
		if(VER_1QUE <= 11) {
			mes "[���C�X]";
			mes "���ʕ񍐂ł����H";
			mes "�񍐂̓A�g�i�h���@�c���̈󂪉����ꂽ";
			mes "���ʕ񍐏����쐬���Ē�o���ĉ������B";
			next;
			mes "[���C�X]";
			mes "�������o�����琺�������Ă��������ˁB";
			mes "���܂����Ă��܂��B";
			next;
			mes "�]���ʕ񍐏���o��";
			mes "�@^0000FF�ÏW���ꂽ�G�l���M�[���W^000000��";
			mes "�@^0000FF�A�g�i�h�̈˗�^000000���������A";
			mes "�@^FF0000�����̃N�G�X�g�̎��Ԑ������ɂ̂�^000000�A";
			mes "�@�A�E���X����󂯂鎖���ł��܂��]";
			close;
		}
		if(VER_1QUE == 12) {
			mes "[���C�X]";
			mes "���ʕ񍐏��̒�o�ł����B";
			mes "�ӂށc�c";
			mes "�R�A�ɑ΂��錤���𒆐S��";
			mes "�s�����悤�ł��ˁB";
			next;
			mes "[���C�X]";
			mes "��̓A�g�i�h���@�c��";
			mes "�ƂĂ������������Ă��܂��B";
			mes "���@��Ƃ�������x�i�񂾂�";
			mes "�����Ƃ������Ƃ�����Ǝv���܂��B";
			next;
			mes "[���C�X]";
			mes "�����l�ł����B";
			mes "�ł͎�������҂��Ă��܂���B";
			next;
			mes "[���C�X]";
			mes "����H�@�҂��ĉ������B";
			mes "�c�c�A�g�i�h���@�c�L�����v����";
			mes "�A���������悤�ł��B";
			next;
			mes "[���C�X]";
			mes "�ӂށc�c�B";
			mes strcharinfo(0) + "�Ƃ����̂�";
			mes "���Ȃ��ł����H";
			mes "�A�g�i�h���@�c�̒c���A�C�A�������";
			mes "�}���Ŗ߂�悤�ɂƂ̘A���ł��B";
			mes "�����s���Ă݂ĉ������B";
			set VER_1QUE,13;
			delitem 6748,1;
			setquest 7623;
			delquest 7617;
			close;
		}
		if(VER_1QUE >= 17) {
			if(checkquest(7617)) {
				mes "[���C�X]";
				mes "���ʕ񍐏��̒�o�ł����B";
				mes "�ӂށc�c";
				mes "������R�A�ɑ΂��錤���𒆐S��";
				mes "�s�����悤�ł��ˁB";
				next;
				mes "[���C�X]";
				mes "��̓A�g�i�h���@�c��";
				mes "�ƂĂ������������Ă��܂��B";
				mes "���@��Ƃ�������x�i�񂾂�";
				mes "�����Ƃ������Ƃ�����Ǝv���܂��B";
				next;
				if(checkitemblank() == 0) {
					mes "�]�A�C�e���̎�ސ���������";
					mes "�@�����Ƃ��ł��Ȃ��B";
					mes "�@��ސ������炵�Ă���󂯎�낤�]";
					close;
				}
				mes "[���C�X]";
				mes "�����������l�ł����B";
				mes "�ł͎�������҂��Ă��܂���B";
				delitem 6748,1;
				setquest 7618;
				delquest 7617;
				getitem 6962,4;
				close;
			}
			if(checkquest(7618)) {
				mes "[���C�X]";
				mes "�A�g�i�h���@�c�̒������e��";
				mes "��w���ł��D�]�ł���B";
				mes "��������҂��Ă��܂��B";
				close;
			}
			mes "[���C�X]";
			mes "���ʕ񍐂ł����H";
			mes "�񍐂̓A�g�i�h���@�c���̈󂪉����ꂽ";
			mes "���ʕ񍐏����쐬���Ē�o���ĉ������B";
			next;
			mes "[���C�X]";
			mes "�������o�����琺�������Ă��������ˁB";
			mes "���܂����Ă��܂��B";
			next;
			mes "�]���ʕ񍐏���o��";
			mes "�@^0000FF�ÏW���ꂽ�G�l���M�[���W^000000��";
			mes "�@^0000FF�A�g�i�h�̈˗�^000000���������A";
			mes "�@^FF0000�����̃N�G�X�g�̎��Ԑ������ɂ̂�^000000�A";
			mes "�@�A�E���X����󂯂鎖���ł��܂��]";
			close;
		}
		mes "[���C�X]";
		mes "�A�g�i�h���@�c�̐��ʂ�";
		mes "�f���炵���ł��ˁB";
		next;
		mes "[���C�X]";
		mes "���̊w�҂┭�@�Ƃ�����";
		mes "�\�ʓI�Ȓ����ɑ΂��āA";
		mes "�A�g�i�h���@�c�͋Z�p�I�ȕ�����";
		mes "���ڂ��Ă��邩�炩���m��܂���ˁB";
		next;
		mes "[���C�X]";
		mes "���̌��͂����ɉ�ɕ񍐂���";
		mes "�A�g�i�h���@�c������ɑ傫�ȉ��b��";
		mes "�󂯂���悤�ɘb���Ă݂܂��B";
		mes "����ł͎��̌��ʂ�";
		mes "�y���݂ɂ��Ă��܂��B";
		close;
	case 2:
		mes "[���C�X]";
		mes "�����X�^�[�̓�����";
		mes "��`���Ă���������̂ł����H";
		mes "�ǂ���̒n��̃����X�^�[������";
		mes "�󂯂Ă��������܂����H";
		set '@str1$,"�O�s�g���l���@(^FF0000�N�G�X�g�󒍉\^000000)";
		set '@str2$,"�����L��@(^FF0000�N�G�X�g�󒍉\^000000)";
		if(checkquest(7611)) {
			if(checkquest(7611) & 0x4)
				set '@str1$,"�O�s�g���l���@(^FF0000��V�󂯎��\^000000)";
			else
				set '@str1$,"�O�s�g���l���@(^FF0000�󒍒�^000000)";
		}
		if(checkquest(7612)) {
			if(checkquest(7612) & 0x2)
				set '@str1$,"�O�s�g���l���@(^FF0000�N�G�X�g�󒍉\^000000)";
			else
				set '@str1$,"�O�s�g���l��";
		}
		if(checkquest(7613)) {
			if(checkquest(7613) & 0x4)
				set '@str2$,"�����L��@(^FF0000��V�󂯎��\^000000)";
			else
				set '@str2$,"�����L��@(^FF0000�󒍒�^000000)";
		}
		if(checkquest(7614)) {
			if(checkquest(7614) & 0x2)
				set '@str2$,"�����L��@(^FF0000�N�G�X�g�󒍉\^000000)";
			else
				set '@str2$,"�����L��";
		}
		next;
		switch(select('@str1$,'@str2$,"��߂�")) {
		case 1:
			if(checkquest(7611)) {
				if(checkquest(7611) & 0x4 == 0) {
					mes "[���C�X]";
					mes "������܂��I";
					mes "�O�s�g���l���ɂ���A";
					mes "^ff0000��@�^�E�F���X�M�A^000000�Ƃ��������X�^�[��";
					mes "^ff000010��^000000�|���Ă��Ă��������B";
					mes "�����҂̂悤�Ȑ킦�Ȃ��ҒB��";
					mes "�Ȃ��Ȃ���֐i�߂������Ă���̂ł��B";
					next;
					mes "[���C�X]";
					mes "�������I�������";
					mes "�����A���̃E�F���X�O�s�g���l����";
					mes "��������ɂ���";
					mes "�Ǘ��҃~�V�F���ɕ񍐂��Ă��������B";
					mes "����ł͂�낵�����肢���܂��B";
					close;
				}
				if(checkitemblank() == 0) {
					mes "�]�A�C�e���̎�ސ���������";
					mes "�@�����Ƃ��ł��Ȃ��B";
					mes "�@��ސ������炵�Ă���󂯎�낤�]";
					close;
				}
				mes "[���C�X]";
				mes "��@�^�E�F���X�M�A��";
				mes "�|���Ă����������݂����ł��ˁB";
				mes "���肪�Ƃ��������܂��B";
				mes "�܂������ɋ��͂��Ă��炦���";
				mes "������܂��B";
				setquest 7612;
				delquest 7611;
				getitem 6961,3;
				close;
			}
			if(checkquest(7612)) {
				if(checkquest(7612) & 0x2 == 0) {
					mes "[���C�X]";
					mes "�O�s�g���l���̃����X�^�[������";
					mes "���̗b���������Ή����Ă܂��B";
					mes "�����͂������x��ł��������B";
					close;
				}
				delquest 7612;
				mes "[���C�X]";
				mes "���肪�Ƃ��������܂��B";
				mes "����ł͕K�v�ȏ��ނ����낦�܂��̂ŁA";
				mes "���͂��Ă��炦��̂Ȃ�A";
				mes "�����𐮂���";
				mes "������x���ɘb�������Ă��������B";
				close;
			}
			mes "[���C�X]";
			mes "�O�s�g���l���̃����X�^�[���}������";
			mes "��ɕ����������Ă����Ƃ���ł��B";
			mes "��������`���Ă��������܂��񂩁H";
			next;
			if(select("�����󂯂�","�f��") == 2) {
				mes "[���C�X]";
				mes "�����ł����c�c�B";
				mes "�c�O�ł��B";
				close;
			}
			mes "[���C�X]";
			mes "������܂��I";
			mes "�O�s�g���l���ɂ���A";
			mes "^ff0000��@�^�E�F���X�M�A^000000�Ƃ��������X�^�[��";
			mes "^ff000010��^000000�|���Ă��Ă��������B";
			mes "�����҂̂悤�Ȑ킦�Ȃ��ҒB��";
			mes "�Ȃ��Ȃ���֐i�߂������Ă���̂ł��B";
			next;
			mes "[���C�X]";
			mes "�������I�������";
			mes "�����A���̃E�F���X�O�s�g���l����";
			mes "��������ɂ���";
			mes "�Ǘ��҃~�V�F���ɕ񍐂��Ă��������B";
			mes "����ł͂�낵�����肢���܂��B";
			setquest 7611;
			close;
		case 2:
			if(checkquest(7613)) {
				if(checkquest(7613) & 0x4 == 0) {
					mes "[���C�X]";
					mes "�����L��ɂ���A";
					mes "^ff0000�C���^�E�F���X�M�A^000000�Ƃ��������X�^�[��";
					mes "^ff0000�T���^�E�F���X�M�A^000000�Ƃ��������X�^�[��";
					mes "���ŁA�����҂̂悤�Ȑ킦�Ȃ��ҒB��";
					mes "������i�߂�ꂸ�����Ă���̂ł��B";
					next;
					mes "[���C�X]";
					mes "�����ł��Ȃ���";
					mes "^ff0000�C���^�E�F���X�M�A^000000��^ff000015��^000000�A";
					mes "^ff0000�T���^�E�F���X�M�A^000000��^ff000015��^000000";
					mes "�|���Ă������������̂ł��B";
					next;
					mes "[���C�X]";
					mes "�������I�������";
					mes "���ɕ񍐂����Ă��������B";
					mes "����ł͂�낵�����肢���܂��B";
					close;
				}
				mes "[���C�X]";
				mes "�C���^�E�F���X�M�A��";
				mes "�T���^�E�F���X�M�A��";
				mes "�|���Ă����������݂����ł��ˁB";
				mes "���肪�Ƃ��������܂��B";
				mes "�܂������ɋ��͂��Ă��炦���";
				mes "������܂��B";
				setquest 7614;
				delquest 7613;
				getitem 6961,10;
				close;
			}
			if(checkquest(7614)) {
				if(checkquest(7614) & 0x2 == 0) {
					mes "[���C�X]";
					mes "�����L��̃����X�^�[������";
					mes "���̗b���������Ή����Ă܂��B";
					mes "�����͂������x��ł��������B";
					close;
				}
				delquest 7614;
				mes "[���C�X]";
				mes "���肪�Ƃ��������܂��B";
				mes "����ł͕K�v�ȏ��ނ����낦�܂��̂ŁA";
				mes "���͂��Ă��炦��̂Ȃ�A";
				mes "�����𐮂���";
				mes "������x���ɘb�������Ă��������B";
				close;
			}
			mes "[���C�X]";
			mes "�����L��̃����X�^�[���}������";
			mes "��ɕ����������Ă����Ƃ���ł��B";
			mes "��������`���Ă��������܂��񂩁H";
			next;
			if(select("�����󂯂�","�f��") == 2) {
				mes "[���C�X]";
				mes "�����ł����c�c�B";
				mes "�c�O�ł��B";
				close;
			}
			mes "[���C�X]";
			mes "������܂��I";
			mes "�����L��ɂ���A";
			mes "^ff0000�C���^�E�F���X�M�A^000000��";
			mes "^ff0000�T���^�E�F���X�M�A^000000��";
			mes "^ff000015�̂���^000000�|���Ă��Ă��������B";
			next;
			mes "[���C�X]";
			mes "�����҂̂悤�Ȑ킦�Ȃ��ҒB��";
			mes "�Ȃ��Ȃ���֐i�߂������Ă���̂ł��B";
			mes "�������I�������";
			mes "���ɕ񍐂����Ă��������B";
			mes "����ł͂�낵�����肢���܂��B";
			setquest 7613;
			close;
		}
	case 3:
		mes "[���C�X]";
		mes "�A�g�i�h���@�c�̐��ʂ�";
		mes "�f���炵���ł��ˁB";
		mes "���b�P���x���Ђł��D�]�ł���B";
		next;
		mes "[���C�X]";
		mes "���������A";
		mes "�����V�������̂��𔭌�������";
		mes "���������Ă��������ˁB";
		close;
	}
}

verus04.gat,117,252,5	script	���Ît�~��#atnd08	641,{/* 59258 */
	mes "[�~��]";
	mes "����ɂ��́B�����l�ł��B";
	mes "�̒��͂������ł����H";
	if(VER_1QUE < 5)
		set '@str$,"���S�񕜁@^0000FF5000Zeny^000000�@(�ʏ헿��)";
	else
		set '@str$,"���S�񕜁@^0000FF4500Zeny^000000�@(��������)";
	next;
	if(select('@str$,"�X�}�C���`") == 2) {
		mes "[�~��]";
		mes "�X�}�C���`!!";
		close;
	}
	if(VER_1QUE < 5) {
		// ������
		if(Zeny < 5000) {
			close;
		}
		mes "[�~��]";
		mes "���S�񕜂ł��ˁI";
		mes "�΂����炷�ׂĂ̕a�C������܂��B";
		mes "�X�}�C���`�I";
		//npcskillsupport
		percentheal 100,100;
		set Zeny,Zeny-5000;
	}
	else {
		if(Zeny < 4500) {
			// ������
			close;
		}
		mes "[�~��]";
		mes "���S�񕜂ł��ˁI";
		mes "�����o�^�����Ă��锭�@�c������ɂ�";
		mes "�������Ă��܂���I";
		mes "�΂����炷�ׂĂ̕a�C������܂��B";
		mes "�X�}�C���`�I";
		//npcskillsupport
		percentheal 100,100;
		set Zeny,Zeny-4500;
	}
	close;
}
verus04.gat,141,193,5	script	�l�Êw�҃A�E���X#atnd09	10057,{/* 59259 */
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
		mes "�]�w�҂������ɔM�����Ă���B";
		mes "�@�ז����Ă͂Ȃ�Ȃ����͋C���]";
		close;
	case 4:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�����A�����̂ł��ˁI";
		mes "�҂��Ă��܂�����B";
		mes "�܂��͂�����̑����w�����ɍs����";
		mes "�o�^�����Ă��Ă��������B";
		next;
		mes "[�A�E���X]";
		mes "�b�͂��Ă���܂�����A";
		mes "���Ȃ��͖{�l�m�F��������Ηǂ��ł��B";
		mes "�o�^���ς񂾂�";
		mes "�܂����̏��ɗ��Ă��������B";
		next;
		mes "[�A�E���X]";
		mes "�A�g�i�h���@�c�̃����o�[��";
		mes "�Љ�܂���B";
		close2;
		cutin "verus_aures",255;
		end;
	case 5:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�o�^�͍ς܂��܂����ˁH";
		mes "�����A������ցB";
		mes "�ނ��A�g�i�h���@�c�̒c���A";
		mes "�C�A���E�A�g�i�h�ł��B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���O���A�E���X�̌�����`�����B";
		mes "����ȃK�L�Ɂc�c�B";
		mes "��`���Ȃǂ����B�A��B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�܂�����Ȏ����c�c";
		mes "�N��肾���ō�Ƃ��v���悤��";
		mes "�i�܂Ȃ������炢�A";
		mes "�M�����킩���Ă���ł��傤�H";
		next;
		mes "[�A�E���X]";
		mes "�M�������̖��ł͂Ȃ��A";
		mes "�A�g�i�h���@�c�S�̖̂��Ȃ̂ł���B";
		mes "�킪�܂܂͍T���Ă��������B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�t���B�����킪�܂܂��B";
		mes "�c�c�����A�K�L�B";
		mes "���O�͎��̖��ɗ��܂��";
		mes "�����Ď����ɗ����̂��H";
		next;
		if(select("���@�̋��͂����ɂ���","������莝���ɂ���","�Ȃ�̎������킩��Ȃ�") == 2) {
			cutin "verus_ian03",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "�]�v�Ȃ����b���I";
			mes "�A�E���X�A���O�̍l���邱�ƂȂ�";
			mes "���̃A�g�i�h�ɂ͂����ʂ��Ȃ񂾂�B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�����A�����̂��O�B";
			mes "���@�̎d���ł͂Ȃ��A";
			mes "����Ȃ�����Ȃ��d�������ɗ������";
			mes "����񂼁B�A��񂾂ȁB";
			next;
			cutin "verus_aures",0;
			mes "[�A�E���X]";
			mes "�܂��܂��B���͂Ƃ������A";
			mes "�킴�킴����`���ɗ��Ă��ꂽ����";
			mes "���̂悤�Ȍ������͎���ł���B";
			mes "���@�̎�`���͂��肢���܂��傤�H";
			next;
		}
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�t���A�܂������B";
		mes "���ꂶ�፡�����d���������Ă��B";
		mes "�ǂ�قǂ̓���������̂����Ă�낤�B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�����c�c�B";
		mes "�ł�" + strcharinfo(0) + "����A";
		mes "���߂Ă�낵�����肢���܂��ˁB";
		mes "�����댯�Ȏd��������܂����A";
		mes "���Ȃ��Ȃ���Ȃ��ł��傤�B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�]�v�Ȃ��Ƃ͌����ł����B";
		mes "�c�c���O�͂��������B�����B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "����A�C����c���Ő\����Ȃ��B";
		mes "�܂��͔ނ̘b�𕷂��Ă݂Ă��������B";
		set VER_1QUE,6;
		delquest 7610;
		setquest 118200;
		close2;
		cutin "verus_aures",255;
		end;
	case 6:
	case 7:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�C�A���͌����������̂�";
		mes "�悭����������̂ł����A";
		mes "���S�A���Ȃ������Ă����";
		mes "�������͂��ł��B";
		mes "�����A���Ζʂ��ƒp���������̂�";
		mes "�Ӓn���͂��Ă���̂ł��傤�B";
		close2;
		cutin "verus_aures",255;
		end;
	case 8:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�����l�ł��B���q�͂ǂ��ł����H";
		mes "�������Ԃ�����悤�Ȃ�A";
		mes "���̗��݂𕷂��Ăق����̂ł����c�c�B";
		next;
		mes "[�A�E���X]";
		mes "���͂��̃A�g�i�h���@�c�ɂ�";
		mes "������l�����o�[������̂ł��B";
		mes "^4d4dff���C�h^000000�Ƃ������̎�҂ł��B";
		mes "���@�n�̒��������邽�߁A";
		mes "�E�F���X�����L��ɍs���Ă��܂��B";
		next;
		mes "[�A�E���X]";
		mes "���̕ӂ�͊댯�Ȃ̂ŁA";
		mes "���[�N�N���ꏏ�ɍs���Ă���Ă��܂��B";
		mes "��������v���Ƃ͎v���̂ł����A";
		mes "�������Ԃ������肷���Ă��܂��B";
		next;
		mes "[�A�E���X]";
		mes "��Ɛi�����m�F�������ł����c�c";
		mes "�ł��̂ŁA���Ȃ��Ƀ��C�h�̗l�q��";
		mes "��Ƃ̐i�����m�F���ɍs����";
		mes "�������������̂ł��B";
		next;
		mes "[�A�E���X]";
		mes "���肢�ł��܂����H";
		mes "�E�F���X�����L��ɂ�";
		mes "�����X�^�[������̂Ŋ댯�ł��B";
		mes "�C��t���čs���Ă��Ă��������B";
		set VER_1QUE,9;
		delquest 7619;
		setquest 7620;
		close2;
		cutin "verus_aures",255;
		end;
	case 9:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���C�h�̓E�F���X�����L���";
		mes "�ǂ����ɂ���͂��ł��B";
		mes "���[�N�N�ƈꏏ�ɂ���Ǝv���̂ŁA";
		mes "���[�N�N��T���Ă݂��";
		mes "�ǂ���������܂���B";
		next;
		mes "[�A�E���X]";
		mes "��낵�����肢���܂��ˁB";
		close2;
		cutin "verus_aures",255;
		end;
	case 10:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���C�h�͂ǂ��ł����H";
		mes "����A�ނ̎d����";
		mes "��`���Ă���̂ł��ˁH";
		next;
		mes "[�A�E���X]";
		mes "����ȎG�p�̂悤�Ȏd���܂�";
		mes "��`���Ă��������āc�c�B";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		close2;
		cutin "verus_aures",255;
		end;
	case 11:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "��������Ȃ����B";
		mes "���C�h�͑��v�����ł��ˁB";
		mes "����Ԃ���点�܂����B";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�A�E���X]";
		mes "�������A���Ȃ��ɂ�����B";
		mes "���Ȃ��̕񍐂�҂��Ă���Ԃ�";
		mes "���̐��ʕ񍐏����쐬���܂����B";
		next;
		mes "[�A�E���X]";
		mes "�w�����̎w�������C�X����";
		mes "�����͂��Ă��������B";
		mes "���ʕ񍐏����o����΁A";
		mes "��V���󂯎�邱�Ƃ��ł��܂��B";
		next;
		if(checkitemblank() == 0) {
			mes "[�A�E���X]";
			mes "�A�C�e���̎�ސ���������";
			mes "�����Ƃ��ł��Ȃ��悤�ł��B";
			mes "��ސ������炵�Ă���";
			mes "������x���Ă��������B";
			close2;
			cutin "verus_aures.bmp", 255;
			end;
		}
		mes "[�A�E���X]";
		mes "���C�X����";
		mes "���̃E�F���X���@�n�̓����ɂ��܂��B";
		mes "���݂܂�����B";
		set VER_1QUE,12;
		delquest 7622;
		setquest 7617;
		getitem 6748,1;
		close2;
		cutin "verus_aures",255;
		end;
	case 12:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���Ȃ��������Ă��邻�̐��ʕ񍐏���";
		mes "�w�����̃��C�X���ɓn���Ă��������B";
		mes "�����ƕ񍐂�҂��Ă���Ǝv���܂��B";
		next;
		mes "[�A�E���X]";
		mes "���C�X����";
		mes "���̃E�F���X���@�n�̓����ɂ��܂��B";
		mes "���݂܂�����B";
		close2;
		cutin "verus_aures",255;
		end;
	case 13:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���ʕ񍐏���";
		mes "�n���Ă����������悤�ł��ˁB";
		mes "���肪�Ƃ��������܂��B";
		mes "�����̂悤�ł����A";
		mes "�����x��ł͂������ł����H";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�����A���O�B";
		mes "�܂���鎖�����邼�B";
		mes "�x��ł�ɂȂǂȂ��B";
		mes "�����ɗ����B";
		close2;
		cutin "verus_aures",255;
		end;
	case 14:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�c�c�����B";
		mes "���Ȃ��ɂ͋�J���������ςȂ����B";
		mes "�\����Ȃ����A";
		mes "�����ЂƂӂ�΂藊�݂܂��ˁB";
		next;
		mes "[�A�E���X]";
		mes "�������A��J���ł�";
		mes "�肪�󂢂���ō\��Ȃ��̂�";
		mes "���C�h�⃋�[�N�N�̎d����";
		mes "��`���Ăق����̂ł����c�c�B";
		next;
		mes "[�A�E���X]";
		mes "�����ɂ͐l�肪�K�v�ł����B";
		mes "���ڔނ�Ɏ�`�����Ƃ��Ȃ���";
		mes "�����Ă݂Ă��������B";
		next;
		mes "[�A�E���X]";
		mes "�ނ�͎������Ƃ͈���Ď�҂�����A";
		mes "���Ȃ��Ƃ��b�������ł��傤�B";
		mes "�Ȃɂ���������ނ��";
		mes "���k���Ă݂Ă��ǂ��ł��傤�ˁB";
		close2;
		cutin "verus_aures",255;
		end;
	case 15:
	case 16:
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�܂��C�A���̂킪�܂܂ł����c�c�B";
		mes "��J�������܂��ˁc�c�B";
		close2;
		cutin "verus_aures",255;
		end;
	default:
		if(checkquest(7617)) {
			cutin "verus_aures",0;
			mes "[�A�E���X]";
			mes "���Ȃ��������Ă��邻�̐��ʕ񍐏���";
			mes "�w�����̃��C�X���ɓn���Ă��������B";
			mes "�����ƕ񍐂�҂��Ă���Ǝv���܂��B";
			next;
			mes "[�A�E���X]";
			mes "���C�X����";
			mes "���̃E�F���X���@�n�̓����ɂ��܂��B";
			mes "���݂܂�����B";
			close2;
			cutin "verus_aures",255;
			end;
		}
		if(checkquest(7618)) {
			if(checkquest(7618) & 0x2 == 0) {
				cutin "verus_aures",0;
				mes "[�A�E���X]";
				mes "���ʕ񍐏���";
				mes "�n���Ă����������悤�ł��ˁB";
				mes "���肪�Ƃ��������܂��B";
				next;
				mes "[�A�E���X]";
				mes "���ʕ񍐏��͓x�X�쐬����̂ŁA";
				mes "���̓s�x���C�X���ɒ�o���Ă��܂��B";
				mes "���̐��ʕ񍐏����o���オ������";
				mes "�͂��Ă���������Ώ�����܂��B";
				next;
				cutin "verus_aures",255;
				mes "�]���ʕ񍐏���o��";
				mes "�@^0000FF�ÏW���ꂽ�G�l���M�[���W^000000��";
				mes "�@^0000FF�A�g�i�h�̈˗�^000000���������A";
				mes "�@^FF0000�����̃N�G�X�g�̎��Ԑ������ɂ̂�^000000�A";
				mes "�@�A�E���X����󂯂鎖���ł��܂��]";
				close2;
				cutin "verus_aures",255;
				end;
			}
			cutin "verus_aures",0;
			delquest 7618;
			mes "[�A�E���X]";
			mes "�C�A�����畷���܂�����B";
			mes "���Ȃ������̉ғ����䑕�u��";
			mes "�W�߂Ă��Ă��������������ł��ˁB";
			mes "�ғ����䑕�u�̌������I�������A";
			mes "�܂����ʕ񍐏����쐬���܂���B";
			next;
			cutin "verus_aures",255;
			mes "�]���ʕ񍐏���o��";
			mes "�@^0000FF�ÏW���ꂽ�G�l���M�[���W^000000��";
			mes "�@^0000FF�A�g�i�h�̈˗�^000000���������A";
			mes "�@^FF0000�����̃N�G�X�g�̎��Ԑ������ɂ̂�^000000�A";
			mes "�@�A�E���X����󂯂鎖���ł��܂��]";
			close;
		}
		if(checkquest(7616) && checkquest(7629)) {
			if(checkquest(7616) & 0x2 == 0 && checkquest(7629) & 0x2 == 0) {
				cutin "verus_aures",0;
				mes "[�A�E���X]";
				mes "���傤�Ǘǂ��Ƃ���ɁI";
				mes "���Ȃ����W�߂Ă��Ă���������";
				mes "���̉ғ����䑕�u�̂�����";
				mes "�����΂���ł����������i�݂܂����B";
				next;
				mes "[�A�E���X]";
				mes "���C�h���������̎�����";
				mes "�ꏏ�ɂ܂Ƃ߂āA";
				mes "�V�������ʕ񍐏����쐬���܂�����B";
				next;
				if(checkitemblank() == 0) {
					mes "[�A�E���X]";
					mes "�A�C�e���̎�ސ���������";
					mes "�����Ƃ��ł��Ȃ��悤�ł��B";
					mes "��ސ������炵�Ă���";
					mes "������x���Ă��������B";
					close2;
					cutin "verus_aures.bmp", 255;
					end;
				}
				mes "[�A�E���X]";
				mes "����������B";
				mes "�w�����̃��C�X���ɓn���Ă��������B";
				mes "�����ƕ񍐂�҂��Ă���Ǝv���܂��B";
				mes "��낵�����肢���܂��ˁB";
				setquest 7617;
				getitem 6748,1;
				close2;
				cutin "verus_aures",255;
				end;
			}
		}
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�ғ����䑕�u�ɂ��Ă�";
		mes "��ɃC�A�����������Ă��܂��B";
		mes "����𓮂������͌��ɂ��ẮA";
		mes "���C�h���������Ă��܂��B";
		next;
		mes "[�A�E���X]";
		mes "���͓�l�̌����̂܂Ƃ߂�";
		mes "�����̐���������Ă��܂��B";
		mes "���ꂪ���\�ȍ�ƗʂŁA";
		mes "�����̎��Ԃ��₵�Ă���̂ł��B";
		next;
		mes "[�A�E���X]";
		mes "���Ȃ��ɂ͐F�X��`���Ă��������āA";
		mes "�ƂĂ����ӂ��Ă��܂��B";
		mes "���ꂩ�����낵�����肢���܂��B";
		close2;
		cutin "verus_aures",255;
		end;
	}
}

verus04.gat,144,193,3	script	�C�A���E�A�g�i�h#atnd09	10056,{
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
		// TODO
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�ז����B";
		next;
		mes "�]^0000FF�t�@���^�X�}�S���J^000000��";
		mes "�@3���E�Ƃ���ь��E�˔j����";
		mes "�@�X�[�p�[�m�[�r�X�A���x���I���A";
		mes "�@�e�T�A�O�ABaseLv90�ȏ�̃h������";
		mes "�@��^ff0000�y���c�̏�^000000������������Ԃ�";
		mes "�@�y���c 01��2F�ɂ���^ff0000���C��^000000����";
		mes "�@�J�n���邱�Ƃ��ł���N�G�X�g�ł��]";
		next;
		mes "�]^ff0000�y���c�̏�^000000��";
		mes "�@�y���c 01��1F�ɂ���^ff0000���C��^000000����";
		mes "�@�y���c�̓o�^�������Ȃ�����";
		mes "�@���肪�\�ł��]";
		close2;
		cutin "verus_ian01",255;
		end;
	case 5:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ񂾁A���O�́B";
		mes "����������ז��΂����肵�����āB";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�C�A���I";
		mes "���̎�҂��A����b����";
		mes "�������ɋ��͂��ɂ��Ă��ꂽ�l�Ȃ񂾁B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���O���A�E���X�̌�����`�����B";
		mes "����ȃK�L�Ɂc�c�B";
		mes "��`���Ȃǂ����B�A��B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�܂�����Ȏ����c�c";
		mes "�N��肾���ō�Ƃ��v���悤��";
		mes "�i�܂Ȃ������炢�A";
		mes "�M�����킩���Ă���ł��傤�H";
		next;
		mes "[�A�E���X]";
		mes "�M�������̖��ł͂Ȃ��A";
		mes "�A�g�i�h���@�c�S�̖̂��Ȃ̂ł���B";
		mes "�킪�܂܂͍T���Ă��������B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�t���B�����킪�܂܂��B";
		mes "�c�c�����A�K�L�B";
		mes "���O�͎��̖��ɗ��܂��";
		mes "�����Ď����ɗ����̂��H";
		next;
		if(select("���@�̋��͂����ɂ���","������莝���ɂ���","�Ȃ�̎������킩��Ȃ�") == 2) {
			cutin "verus_ian03",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "�]�v�Ȃ����b���I";
			mes "�A�E���X�A���O�̍l���邱�ƂȂ�";
			mes "���̃A�g�i�h�ɂ͂����ʂ��Ȃ񂾂�B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�����A�����̂��O�B";
			mes "���@�̎d���ł͂Ȃ��A";
			mes "����Ȃ�����Ȃ��d�������ɗ������";
			mes "����񂼁B�A��񂾂ȁB";
			next;
			cutin "verus_aures",0;
			mes "[�A�E���X]";
			mes "�܂��܂��B���͂Ƃ������A";
			mes "�킴�킴����`���ɗ��Ă��ꂽ����";
			mes "���̂悤�Ȍ������͎���ł���B";
			mes "���@�̎�`���͂��肢���܂��傤�H";
			next;
		}
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�t���A�܂������B";
		mes "���ꂶ�፡�����d���������Ă��B";
		mes "�ǂ�قǂ̓���������̂����Ă�낤�B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�����c�c�B";
		mes "�ł�" + strcharinfo(0) + "����A";
		mes "���߂āA�ނ��A�g�i�h���@�c��";
		mes "�c���A�C�A���E�A�g�i�h�ł��B";
		next;
		mes "[�A�E���X]";
		mes "���Ă��������Ċ��ӂ��܂��B";
		mes "�����댯�Ȏd��������܂����A";
		mes "���Ȃ��Ȃ���Ȃ��ł��傤�B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�]�v�Ȃ��Ƃ͌����ł����B";
		mes "�c�c���O�͂��������B�����B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "����A�C����c���Ő\����Ȃ��B";
		mes "�܂��͔ނ̘b�𕷂��Ă݂Ă��������B";
		set VER_1QUE,6;
		chgquest 7610,118200;
		close2;
		cutin "verus_aures",255;
		end;
	case 6:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "��`���ƌ���������ɂ�";
		mes "����Ȃ�̎d�����ł���񂾂낤�ȁH";
		mes "���ҊO�ꂾ�����炷���A�点�邩��ȁB";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������班���k�ɍs����";
		mes "�L��̂悤�ȏꏊ������B";
		mes "�����ɂ͍��x�ȕ�����";
		mes "�@�B������������͂����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "���̋@�B�̓��͌��̑��u��";
		mes "��������^ff0000�ғ����䑕�u^000000�ƌĂ�ł���B";
		mes "�@�B�𒲍����Ă��̉ғ����䑕�u��";
		mes "^ff00002��^000000�����ė����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������H�@^ff0000�ғ����䑕�u^000000��";
		mes "^ff00002��^000000�W�߂Ă���񂾂��B";
		mes "���O���ǂ�قǎd�����o���邩���Ă��B";
		set VER_1QUE,7;
		delquest 118200;
		setquest 118201;
		close2;
		cutin "verus_ian01",255;
		end;
	case 7:
		if(countitem(6749) < 2) {
			cutin "verus_ian01",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "�������H�@^ff0000�ғ����䑕�u^000000��";
			mes "^ff00002��^000000�W�߂Ă���񂾂��B";
			mes "���O���ǂ�قǎd�����o���邩���Ă��B";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�ӂ�B�W�߂Ă����悤���ȁB";
		mes "����͌����Ɏg���厖�Ȃ��̂��B";
		mes "�������Əo���B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "����ꂽ���Ƃ͂ł���悤���ȁB";
		mes "���O�̎��͂��ǂ̒��x��";
		mes "���Ă����Ă�낤�B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ƃ肠�������͗p�͖����B";
		mes "�A�E���X�̏��ɂł��s����";
		mes "�d������`���񂾂ȁB";
		set VER_1QUE,8;
		delitem 6749,2;
		delquest 118201;
		setquest 7619;
		close2;
		cutin "verus_ian03",255;
		end;
	case 8:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���͂܂����O��M���Ă͂��Ȃ��B";
		mes "�_�񂪂��邩��";
		mes "�d���Ȃ������ɒu���Ă��邾�����B";
		mes "�_��I���܂ŁA��l����";
		mes "����ꂽ�d�����������Ă����΂����B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ƃ肠�������͗p�͖����B";
		mes "�A�E���X�̏��ɂł��s����";
		mes "�d������`���񂾂ȁB";
		close2;
		cutin "verus_ian03",255;
		end;
	case 9:
	case 10:
	case 11:
	case 12:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "������x�������A";
		mes "���͂��O�������ɋ��͂��邽�߂�����";
		mes "�����֗����Ƃ͍l���Ă��Ȃ��B";
		mes "�������ł���񂾂낤�H";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�܂������B";
		mes "������Ă���d�����I�������";
		mes "�������̂��Ƃɗ����B";
		mes "�ɂȂ��O�Ɏd����^���Ă�낤�B";
		close2;
		cutin "verus_ian01",255;
		end;
	case 13:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���ʕ񍐏��͒�o�����̂��H";
		mes "�������炨�O�Ɏd����^���Ă�낤�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "���͕����󂢂��B";
		mes "�����H�ו��������ė��Ă���B";
		mes "�����Ŏx�����Ă���H������Ȃ��A";
		mes "�������H�ו���p�ӂ��ė����B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�C�A���B���Ȃ��Ƃ����l��";
		mes "�܂�����Ȃ��Ƃ��c�c�B";
		mes "�����ł���ȕ��������Ă�";
		mes "���ʂ��ƌ�������";
		mes "�킩���Ă��邶��Ȃ��ł����B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����炱���ɗ��ނ񂾂낤�B";
		mes "�������ȁc�c";
		mes "^4d4dff�H�ׂ₷�����`���L�x��";
		mes "�����ς肷�钿��^000000��T����";
		mes "�����Ă��Ă���B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����ė��邱�Ƃ��ł�����";
		mes "���O�̊�݂𕷂��Ă�낤�B";
		mes "������]���";
		mes "�����ɂ���͕̂������Ă���B";
		next;
		cutin "verus_ian01",255;
		mes "�]�C�A���E�A�g�i�h�̒������������";
		mes "�@^ff0000�Ō�̒T��^000000�̎��������������]";
		next;
		mes "�]^4d4dff�H�ׂ₷�����`���L�x��";
		mes "�@�����ς肷�钿��^000000��T���Ă��悤�]";
		set VER_1QUE,14;
		delquest 7623;
		setquest 7624;
		close;
	case 14:
	case 15:
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����������x�����킹��ȁB";
		mes "^4d4dff�H�ׂ₷�����`���L�x��";
		mes "�����ς肷�钿��^000000��T����";
		mes "�����Ă���񂾁B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����ė��邱�Ƃ��ł�����";
		mes "���O�̊�݂𕷂��Ă�邼�B";
		close2;
		cutin "verus_ian03",255;
		end;
	case 16:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�ӂށc�c";
		mes "�c�c��ƒ��ɕЎ�ŊȒP��";
		mes "�H�ׂ炻���Ȍ`���ȁB";
		mes "�m���ɐH�ׂ₷�������B";
		mes "�������̐S�Ȃ͖̂������B";
		next;
		mes "�]�C�A���̓r�[�t�g�[�X�g��";
		mes "�@�������H�׎n�߂��]";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�I�@����́c�c";
		mes "�Y�΂ŏĂ��������ׂ������܂�A";
		mes "���΂��������ƖL�x�ȓ��`��";
		mes "���̒��ɍL����c�c�I";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�X�Ɉٍ��̉ʕ��Ɩ�؂�";
		mes "�]���Ȗ���}���Ă���";
		mes "�����ς�Ƃ��Ă���I";
		next;
		menu "�O�̗t���H�ׂĂ݂ĉ�����",-;
		cutin "verus_ian04",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ�قǁc�c";
		mes "������ꏏ�ɐH�ׂ���̂������̂��B";
		mes "�L�x�ȓ��`�ɂ����ς肵���T���_�A";
		mes "�Â��ʕ��B";
		mes "�����Ă��̐H�ׂ₷���`��c�c�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�K�L�c�c";
		mes "�Ȃ��Ȃ���邶��Ȃ����B";
		mes "�����񎦂������������ׂĖ��������̂�";
		mes "�����ė��Ă₪�����ȁB";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�d���Ȃ��A�񑩂��B";
		mes "���O�������ɂ������R�������Ă�낤�B";
		mes "���ɖ]�ނ��̂͂Ȃ񂾁H";
		next;
		menu "�Ō�̒T���ɂ���",-;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�Ō�̒T���c�c";
		mes "�������B����̘b���B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�킩�����B";
		mes "�c�c������l�ōl���鎞�Ԃ��ق����B";
		mes "������l�ɂ��Ă���Ȃ����B";
		mes "��ł��炽�߂Ęb�����悤�B";
		set VER_1QUE,17;
		delitem 11519,1;
		delquest 7626;
		setquest 7627;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		close2;
		cutin "verus_ian01",255;
		end;
	case 21:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����A����Ɩ߂������B";
		mes "����ŁA�������ʂ����������H";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "���������A���Ă����悤���ȁH";
		mes "�����Ă���B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���A�����!?";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "��������Ȃɋ����Ă���̂ł����H";
		mes "���ɂ������Ă��������B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c����͂��ȁc�c";
		mes "^ff0000�������[���R�[�h^000000�ƌĂ΂����̂��B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�]�c���̈�i��";
		mes "����Ɠ������̂��������Ƃ�����B";
		mes "�����͉��������̉����L�^����";
		mes "���̋L�^�}�̂��B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "����́c�c���@�ł����H";
		mes "�ڂɌ�������̂����̂܂܋L�^�Ɏc��";
		mes "�t�H�g���@�Ȃ�m���Ă��܂����c�c�B";
		mes "�����ނ̂��̂Ȃ̂ł����H";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "����A�Ⴄ�B���@�̉��p�ł��Ȃ��B";
		mes "�����Ȃ�Ȋw�̎Y������B";
		mes "�]�c����������g����";
		mes "�������L�^����̂��������Ƃ�����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����͂����̂�������̂悤��";
		mes "�����i���Ƃ΂���v���Ă������c�c";
		mes "���ƂȂ��čl���Ă݂�΁A";
		mes "�Ȃ��\�c���͂��̋Z�p��";
		mes "���\���Ȃ������̂��^�₾�ȁB";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�{���ɏ��������̋L�������A";
		mes "����ƑS���������̂�������B";
		mes "�c�c�Ƃ���΁A����Łc�c";
		mes "�����ɋL�^���ꂽ���e��";
		mes "�m�邱�Ƃ��ł���̂��c�c�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������ȁc�c���ꂪ�K�v���B";
		mes "�������T���āc�c";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���c�c�B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�ǂ����܂����A�C�A���H";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���̃������[���R�[�h�ɋL�^���ꂽ";
		mes "���e�����邽�߂̋@�B������񂾁B";
		mes "����͑]�c�����g���Ă���";
		mes "^ff0000���R�[�h�v���C���[^000000�Ƃ����@�B���B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���͂����\�c������A";
		mes "�����̂ɏ���󂯂Ă����񂾁B";
		mes "���l����Â��@�B���B";
		mes "��؂Ɏ���ɕۊǂ��Ă�����B";
		mes "�������c�c�B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�c�c�Ȃ�قǁB";
		mes "���Ȃ��̉Ƃ́A�M���̖�";
		mes "�A���N�C�G�����������Ă��܂����B";
		mes "�����ł��ˁH";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������A�������̉Ƃ͖����B";
		mes "�����炭�\�c����";
		mes "���R�[�h�v���C���[���c�c�B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�������A�C�A���B";
		mes "���Ȃ�����؂ɂ��Ă������Ȃ�΁A";
		mes "�A���N�C�G����";
		mes "�����͂��Ă��Ȃ��ł��傤�B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�ǂ��������Ƃ��H";
		mes "���̎q�͎�������ł���B";
		mes "���̕��ȂǁA�Ƃ��̐̂�";
		mes "�������Ă���Ɍ��܂��Ă���B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���܂��Ă��邩�ǂ����A";
		mes strcharinfo(0) + "�����";
		mes "�m���߂Ă��������܂��傤�B";
		next;
		mes "[�A�E���X]";
		mes "�C�A���B";
		mes "���Ȃ��͕������A���ł�";
		mes "���߂��čl���Ă��܂��B";
		mes "���Ȃ��̈����Ȃł���B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�c�c";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�������ȁc�c�B";
		mes "�m���߂邾���m���߂Ă݂邩�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c" + strcharinfo(0) + "�B";
		mes "�A���N�C�G���̌��֍s���A";
		mes "�\�c���̃��R�[�h�v���C���[��";
		mes "�܂��������Ă��Ȃ��������Ă݂Ă���B";
		mes "�����āA�������ꂪ�܂�����̂Ȃ��";
		mes "�����֎����Ă��ė~�����B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "����������肢���܂��B";
		mes "�ޏ��ɉ����𗊂ނƂ���΁A";
		mes "����C�A���ł͂Ȃ��A";
		mes "�y���c�̃����o�[�ł���";
		mes "���Ȃ�����̕����ǂ��Ǝv���܂��B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�y���c�ɍs���̂Ȃ�΁A";
		mes "�����Ă�邼�B";
		mes "�p�ӂ��ł����琺�������Ă���B";
		set VER_1QUE,22;
		delquest 7643;
		setquest 7644;
		close2;
		cutin "verus_ian01",255;
		end;
	case 22:
		cutin "verus_ian01.bmp", 2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�A���N�C�G���A���̎q�ɘb����";
		mes "^ff0000���R�[�h�v���C���[^000000�������ė��Ă���B";
		mes "�c�c���̎q���܂������";
		mes "�������Ă��Ȃ���΁A�����ȁB";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�y���c�ɍs���̂Ȃ�΁A";
		mes "�����Ă�邼�B";
		next;
		if(select("�������������ɂ���","�����Ă��炤") == 1) {
			mes "[�C�A���E�A�g�i�h]";
			mes "�������B";
			mes "�������ł����琺�������Ă���B";
			close2;
			cutin "Arquien_n_atnad01.bmp", 255;
			end;
		}
		mes "[�C�A���E�A�g�i�h]";
		mes "�킩�����B";
		mes "�ł́A���낤�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���񂾂��B";
		close2;
		cutin "Arquien_n_atnad01.bmp", 255;
		warp "moc_para01.gat",131,164;
		end;
	case 23:
	case 24:
	case 25:
	case 26:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�B";
		next;
		cutin "verus_ian01",255;
		mes "�]�����l������ł���悤���B";
		mes "�@���͂����Ƃ��Ă������]";
		close;
	case 27:
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�A���N�C�G�����H";
		mes "���̎q�͈�̉����l���Ă���񂾁H";
		mes "���ɕs��������̂Ȃ��";
		mes "���ڗ��Ęb���΂������̂��I";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ����R�[�h�v���C���[��";
		mes "�n���Ă���Ȃ��̂��c�c�B";
		mes "���񂨑O�����̎q���m�F�������e��";
		mes "�����Ă���Ƃ����̂��H";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�c�c�����Ȃ��ł��ˁB";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����A�����Ȃ��B";
		mes "�c�c����Ȃ����낤!?";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���������A����͗ǂ����ł��B";
		mes "���܂ł����ۂ������Ă�";
		mes "���Ȃ��B�e�q��";
		mes "�����ł��𗬂���`�����X�ł���B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�܂����O�͂�������āI";
		mes "�����`�����X���I";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�ł��܂��A�������ȁc�c�B";
		mes "���̎q�����R�[�h�v���C���[��";
		mes "�̂ĂȂ��ł��Ă��ꂽ�����ł��c�c�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�킩�����B�d���Ȃ��B";
		mes "�Ƃɂ��������Ȃ��Ă��܂�������ɂ�";
		mes strcharinfo(0)+ "�B���O��";
		mes "�L�b�`�����e�𕷂��Ă��āA";
		mes "���ɋ����Ă���B�킩�����ȁH";
		next;
		mes "[�C�A���E�A�g�i�h]";
		cutin "verus_ian03",2;
		mes "�c�c����ŁH";
		mes "�������[���R�[�h�̓��e��";
		mes "�������񂾂낤�H";
		mes "�����^������Ă����H";
		next;
		menu "�������[���R�[�h�̓��e��b��",-;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�Ȃ񂾂���!?";
		mes "�����ԈႢ����Ȃ��̂��H";
		mes "�Ȃ��A�A�g�i�h�̖����o�Ă���H";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�c�c�B";
		mes "�c�c���炭�ł����c�c";
		next;
		mes "[�A�E���X]";
		mes "���̒n���甭�@���ꂽ";
		mes "�������[���R�[�h�A";
		mes "������Đ����邱�Ƃ��ł���";
		mes "�v���C���[�����Ȃ��̉Ƃɂ������B";
		next;
		mes "[�A�E���X]";
		mes "����͂��Ȃ��̑\�c������";
		mes "����󂯂����́c�c�B";
		mes "�����ă������[���R�[�h�̓��e��";
		mes "�A�g�i�h�̖����������c�c�B";
		mes "�ȏォ�琄������Ɓc�c";
		next;
		mes "[�A�E���X]";
		mes "�C�A���A���Ȃ���";
		mes "���̓s�s�̏Z�l��";
		mes "����ł͂Ȃ��̂ł����H";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����c�c�E�F���X�V�e�B�̖���c�c!?";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�m���ɁA�Ȃ������̏ꏊ��";
		mes "���������Ǝv�����o�͂������c�c�B";
		mes "�c�c������c�c�Ȃ̂��H";
		mes "�c�c�����W���s���X��";
		mes "��炢�������R�́c�c�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������Ȃ����ɂȂ��Ă��̏ꏊ��";
		mes "�������ꂽ�񂾁H";
		mes "�����ƑO����m���Ă��Ă�";
		mes "�ǂ��͂����I";
		mes "���̐�c�����̓s�s�̐l�ԂȂ�";
		mes "�Ȃ�������B�����񂾁c�c�H";
		next;
		menu "���������Ă�������",-;
		mes "[�C�A���E�A�g�i�h]";
		mes "���c�c�������ȁA";
		mes "���O�ɕ����Ă��d���̂Ȃ����Ƃ��c�c�B";
		mes "�c�c�ǂ���炻��^ff0000�������[���R�[�h��";
		mes "�����ƏW�߂�K�v�����肻�����B^000000";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "���̃������[���R�[�h��";
		mes "�������Ō��������̂������ȁB";
		mes "�ł͍��x��^ff0000������^000000��";
		mes "���ׂĂ��Ă���Ȃ����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "^ff0000������^000000�ɂ͒n���{�݂������āA";
		mes "�������[���R�[�h�̂悤�Ȃ��̂�";
		mes "������炵���B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "���O�͂����ɍs����";
		mes "�������[���R�[�h��T���ė~�����B";
		mes "���̓z�炪���������O��";
		mes "������Ŏ��łƂ��B";
		mes "�ǂ������e�̉�ǂ��ł��Ȃ��͂����B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ƃ肠�����A���̎���";
		mes "�A���N�C�G���ɂ��b���Ă���B";
		mes "�����ȁA���x��";
		mes "^ff0000������^000000�̃������[���R�[�h���B";
		mes "���񂾂��B";
		set VER_1QUE,28;
		delquest 7647;
		setquest 7648;
		close2;
		cutin "verus_ian01",255;
		end;
	case 28:
	case 29:
	case 30:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "^0000ff������^000000�́A";
		mes "^ff0000�L�ꂩ��k�����ʂɂ���^000000�ƕ������B";
		mes "�߂��܂ōs���΂����킩�邾�낤�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "��������n���{�݂ɂȂ��铹��T����";
		mes "�����𒲍����Ă���B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�ǂ���炻���ɂ�";
		mes "���̂̒m��Ȃ��@�B�����āA";
		mes "�P���Ă���炵���ƕ������B";
		mes "���ӂ��ă������[���R�[�h���W�߂Ă���B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Œ�ł�2�͗~�����B";
		mes "�W�߂���A���N�C�G���̌��֍s���A";
		mes "���e�𕷂��Ď��ɋ����Ă���B";
		close2;
		cutin "verus_ian01",255;
		end;
	case 31:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�A���N�C�G���c�c";
		mes "���̎q�̍l���Ă��鎖��";
		mes "���ɂ͂悭�킩���B";
		mes "�������ꂷ���Ă�������ȁc�c�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����炠�̎q��";
		mes "�����厖�ɂ��Ă���";
		mes "���R�[�h�v���C���[��";
		mes "�̂ĂĂ��Ȃ��������Ƃ�";
		mes "���������Ă���B";
		next;
		cutin "verus_ian04",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�������";
		mes "���̎q�Ƙb�����鎞�Ԃ�";
		mes "���Ȃ���΂Ȃ�Ȃ��Ƃ�";
		mes "�v���Ă���񂾂��ȁc�c�B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�t���B�N��̂ЂƂ茾���B";
		mes "������Ƃ�i�߂邼�B";
		mes strcharinfo(0)+ "�A";
		mes "���O�����O��";
		mes "���ׂ����Ƃ����񂾁B";
		close2;
		cutin "verus_ian01",255;
		end;
	case 32:
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "��������I";
		mes "�{���ɂ��̎q�͉����l���Ă�񂾁I";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ񂾂��āH�@���̎q���Q������ƁH";
		mes "�������������[���R�[�h�̉�ǂ�����";
		mes "���ʂ��������ɓn���ƁH";
		mes "�c�c�����Ȃ�ǂ������ƌ����̂��H";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�A���N�C�G����������";
		mes "�C�Â����̂ł͂Ȃ��̂ł��傤���H";
		mes "�Ƃ�����A����������`���Ă�����";
		mes "�����̂ł��B�ޏ��̍D�ӂ�";
		mes "�Â��悤���Ⴀ��܂��񂩁B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c����";
		mes "�c�c�d���Ȃ����B";
		mes strcharinfo(0)+ "�A���O��";
		mes "�L�b�`�����e�𕷂��Ă���";
		mes "���ɋ����Ă���B�킩�����ȁH";
		mes "�A���N�C�G���̗l�q�����Ă��Ăق����B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�����ł��ˁB";
		mes "�A���N�C�G������̓`�B���ł����A";
		mes "�������[���R�[�h��";
		mes "�W�߂Ă������������ł��ˁB";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������ȁB�����������ށB";
		mes "��Ԃ����������邪";
		mes "��낵�����ނ��B";
		close2;
		cutin "verus_ian01",255;
		end;
	case 33:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����A���O���B";
		mes "��������Ǝ�荞��ł���B";
		next;
		menu "�ǂ������̂ł����H",-;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������Ȏ��ɂȂ肻�����B";
		mes "������c�c";
		next;
		cutin "ep15_tatio01",0;
		mes "[���b�P���x����Ȕ鏑��]";
		mes "�͂��߂܂��āB";
		mes "���b�P���x���鏑���̎�Ȕ鏑���A";
		mes "W�EH�Ɛ\���܂��B";
		mes "���҂����Ă���܂����B";
		next;
		menu "���b�P���x���Ђ̔鏑�H",-;
		mes "[���b�P���x����Ȕ鏑��]";
		mes "�͂��B";
		mes "���b�P���x���Љ��";
		mes "�鏑���΂߂Ă���܂��B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���A�͂����B";
		mes "����ŗp���͂Ȃ񂾁H";
		mes "���@�󋵂Ɋւ���񍐂�";
		mes "�ʃ��[�g�ōs���Ă���͂������B";
		next;
		cutin "ep15_tatio01",0;
		mes "[���b�P���x����Ȕ鏑��]";
		mes "�䂪�Ђ̉�́A���Ȃ�����";
		mes "��x����������ƌ����Ă���܂��B";
		mes "���ł����܂��܂���̂�";
		mes "���q�^���[���̖{�Ђ�";
		mes "���z���������������̂ł��B";
		next;
		mes "[���b�P���x����Ȕ鏑��]";
		mes "����Ɓc�c";
		mes "���Ȃ��������������Ă���";
		mes "�������[���R�[�h�̓��e�ɂ��āA";
		mes "��������J�ł��肢�v���܂��B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�t���B���炪�������[���R�[�h��";
		mes "�������Ă��鎖�ɂ����C���t�������B";
		mes "����œ��e�͔���J�ɂ���ƁH";
		mes "����͂Ȃ����H";
		next;
		cutin "ep15_tatio01",0;
		mes "[���b�P���x����Ȕ鏑��]";
		mes "�����ł��ˁc�c�B";
		mes "�܂����������ƌ����ׂ��ł��傤���B";
		next;
		mes "[���b�P���x����Ȕ鏑��]";
		mes "�����Ɋւ��鋦�c���s���\��ł��̂�";
		mes "�ڂ����̓��b�P���x���Ђ�";
		mes "���b�������܂��傤�B";
		mes "�Ȃ�ׂ������K�₵�Ă�������悤�A";
		mes "���肢���܂��B";
		next;
		mes "[���b�P���x����Ȕ鏑��]";
		mes "����ł͎��͂���ŁB";
		mes "���K������҂����Ă��܂��B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "����́c�c�s������𓾂܂���ˁB";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�d���Ȃ��B";
		mes "�����ɂ��Ă������n�܂�Ȃ�����ȁB";
		mes "�Ƃ肠�����s���Ă݂邵���Ȃ����낤�B";
		mes strcharinfo(0)+ "�B";
		mes "���O�����b�P���x���Ђ֍s���񂾁B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ������O�����Ȃ���悤�ɂ�";
		mes "���Ɍ����Ă���񂾁B";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "���������Ǝv������";
		mes "���b�P���x�������Ă����̂��B";
		mes "�{�Ђɗ������ƁH�@�����s�����B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�A���N�C�G��!?";
		mes "���O���ꏏ��";
		mes "���b�P���x���ɍs������!?";
		mes "�ǂ���������!?";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�Ȃ�" +strcharinfo(0)+ "�A";
		mes "�܂����������ɎQ�����鎖��";
		mes "�`���ĂȂ������̂��H";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�܂������B�Ƃ����킯�ŁA";
		mes "���̒����Ɋւ���";
		mes "�F�X�������N��������ȁB";
		mes "�����Q�����邼�B";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "���R�[�h�v���C���[��";
		mes "���������Ă��邵�ȁB";
		mes "���Ƃ͌��킹�Ȃ��B";
		mes "�܂��A���ƌ����Ă��A";
		mes "����ɎQ�����邯�ǂȁB";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ񂾂�!?";
		mes "�A���N�C�G���c�c";
		mes "���O�������l���Ă���̂�";
		mes "���ɂ͑S�������ł��Ȃ��B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���R�[�h�v���C���[��";
		mes "����������ɓn�������ōςޘb�Ȃ̂ɁB";
		mes "�ǂ��������̐����񂵂��c�c�H";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�A���N�C�G����������";
		mes "�C�Â����̂ł͂Ȃ��̂ł��傤���H";
		mes "�Ƃ�����A����������`���Ă�����";
		mes "�����̂ł��B�ޏ��̍D�ӂ�";
		mes "�Â��悤���Ⴀ��܂��񂩁B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������ȁc�c�m���ɍ���";
		mes "�L�̎�ł��~�����󋵂��B";
		mes "�c�c�킩�����B";
		mes "�������A�ז������͂���Ȃ�B";
		mes "�����̎ז����Ɗ�������";
		mes "�����ɒǂ��o������ȁB";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "���̎����ז��ɂȂ񂩂Ȃ���̂��B";
		mes "�����A�����ƌ��܂�����";
		mes "�������ƃ��b�P���x���̖{�Ђ֍s�����B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�����A�������ȁB";
		mes strcharinfo(0)+ "�A";
		mes "���O���o�����鏀�������Ă���B";
		mes "�b�������낤����A";
		mes "���ɔO����ɏ�������悤�Ȏ���";
		mes "�Ȃ��Ǝv�����c�c�B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������ł����琺�������Ă���B";
		set VER_1QUE,34;
		delquest 118210;
		setquest 7656;
		close2;
		cutin "verus_ian01",255;
		end;
	case 34:
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���b�P���x���̖{�Ђɍs��";
		mes "�����͂ł������H";
		mes "�����ɏo�����邼�B";
		next;
		if(select("��������������������","�����ɏo������") == 1) {
			mes "[�C�A���E�A�g�i�h]";
			mes "�킩�����B";
			mes "�������ł����琺�������Ă���B";
			mes "�Ȃ�ׂ��}���B";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		mes "[�C�A���E�A�g�i�h]";
		mes "�킩�����B";
		mes "�ł́A�s���Ƃ��悤�B";
		close;
		cutin "verus_ian01",255;
		warp "lhz_in01.gat",275,229;
		end;
	default:
		cutin "verus_ian01",2;
		if(VER_1QUE < 37) {
			mes "[�C�A���E�A�g�i�h]";
			mes "�����A���O���B";
			mes "�Ȃ�̗p���H";
		}
		else {
			mes "[�C�A���E�A�g�i�h]";
			mes "���̒��Ƃ͖{����";
			mes "������Ȃ����΂��肾�ȁB";
			mes "�Ƃɂ����������[���R�[�h�̌�����";
			mes "������ꂻ���ň��S�����B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "����ō����͉��̗p���H";
		}
		set '@str1$,"���@��Ƃ���`���@(^FF0000�N�G�X�g�󒍉\^000000)";
		if(checkquest(7615)) {
			if(countitem(6749) < 2)
				set '@str1$,"���@��Ƃ���`���@(^FF0000�󒍒�^000000)";
			else
				set '@str1$,"���@��Ƃ���`���@(^FF0000��V�󂯎��\^000000)";
		}
		if(checkquest(7616)) {
			set '@str1$,"���@��Ƃ���`���@(�f�C���[�N�G�X�g)";
			if(checkquest(7616) & 0x2)
				set '@str1$,"���@��Ƃ���`���@(^FF0000�N�G�X�g�󒍉\^000000)";
		}
		set '@str2$,"�b������";
		if(VER_1QUE == 17 || VER_1QUE == 18) {
			set '@str2$,"�b������@(^FF0000�X�g�[���[�N�G�X�g^000000)";
		}
		set '@str3$,"��������";
		if(VER_1QUE == 37) {
			set '@str3$,"";
		}
		next;
		switch(select('@str1$,'@str2$,'@str3$)) {
		case 1:
			if(checkquest(7615)) {
				if(countitem(6749) < 2) {
					mes "[�C�A���E�A�g�i�h]";
					mes "�ғ����䑕�u�̂��Ƃ��ȁB";
					next;
					mes "[�C�A���E�A�g�i�h]";
					mes "�Ȃ񂾁A���񂾎d����Y�ꂽ�̂��H";
					mes "^ff0000�ғ����䑕�u^000000��";
					mes "^ff00002��^000000�W�߂Ă��Ă���B";
					mes "���񂾂��B";
					close2;
					cutin "verus_ian01",255;
					end;
				}
				mes "[�C�A���E�A�g�i�h]";
				mes "�ғ����䑕�u�̂��Ƃ��ȁB";
				next;
				mes "[�C�A���E�A�g�i�h]";
				mes "����������Ǝ����ė����ȁB";
				mes "�����ė����̂������ɒu����";
				mes "�A��Ȃ����B";
				next;
				mes "[�C�A���E�A�g�i�h]";
				mes "�c�c�Ȃ�ׂ��󂳂Ȃ��悤��";
				mes "�w�͂��Ă���񂾂��ȁB";
				mes "��͂�Â���������d���Ȃ��̂��c�c�B";
				next;
				if(checkitemblank() == 0) {
					cutin "verus_ian04.bmp", 255;
					mes "�]�A�C�e���̎�ސ���������";
					mes "�@�����Ƃ��ł��Ȃ��B";
					mes "�@��ސ������炵�Ă���󂯎�낤�]";
					close;
				}
				cutin "verus_ian04",2;
				mes "[�C�A���E�A�g�i�h]";
				mes "����������Ă�Ǝv���B";
				mes "�΂͂Ƃ肽���Ȃ����̂��ȁB";
				delitem 6749,2;
				setquest 7616;
				delquest 7615;
				getitem 6961,5;
				close2;
				cutin "verus_ian01",255;
				end;
			}
			if(checkquest(7616)) {
				if(checkquest(7616) & 0x2 == 0) {
					mes "[�C�A���E�A�g�i�h]";
					mes "�ғ����䑕�u�̂��Ƃ��ȁB";
					next;
					mes "[�C�A���E�A�g�i�h]";
					mes "�܂����������B";
					mes "���̂Ƃ���͂܂��K�v�Ȃ��B";
					mes "�����őS�����Ă��܂�����";
					mes "�m��Ȃ����c�c�B";
					close2;
					cutin "verus_ian01",255;
					end;
				}
				mes "[�C�A���E�A�g�i�h]";
				mes "�ғ����䑕�u�̂��Ƃ��ȁB";
				next;
				delquest 7616;
				mes "�ғ����䑕�u�̃X�g�b�N��";
				mes "�Ȃ��Ȃ��Ă��܂����ȁB";
				mes "�����ɂ͂܂��܂�";
				mes "�����K�v�Ȃ񂾂��c�c�B";
				next;
				mes "[�C�A���E�A�g�i�h]";
				mes "���̊Ԃ̉ғ����䑕�u��";
				mes "�F�X�Ȏ��������Ă�����";
				mes "�ς����Ȃ��āA";
				mes "�S�����Ă��܂����B";
				mes "�ŋ߂̎�҂Ɠ������B";
				next;
				cutin "verus_ian04",2;
				mes "[�C�A���E�A�g�i�h]";
				mes "�A���N�C�G���c�c�������������B";
				mes "�h���Ƃ������̂�m���B";
				close2;
				cutin "verus_ian01",255;
				end;
			}
			mes "[�C�A���E�A�g�i�h]";
			mes "�ғ����䑕�u�̂��Ƃ��ȁB";
			next;
			cutin "verus_ian01",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "�ғ����䑕�u��p�ӂ��Ă���̂�";
			mes "���O�̎d�����B";
			mes "�c�c��肽���Ȃ����";
			mes "���Ȃ��ł������ȁB";
			next;
			if(select("�ғ����䑕�u��p�ӂ��Ă���","��ςł���") == 2) {
				mes "[�C�A���E�A�g�i�h]";
				mes "���ɗp���Ȃ��̂Ȃ�";
				mes "���̃����o�[�̎d���ł�";
				mes "��`���Ă���Ă���B";
				close2;
				cutin "verus_ian01",255;
				end;
			}
			mes "[�C�A���E�A�g�i�h]";
			mes "�������B";
			mes "����Ȃ�A^ff0000�ғ����䑕�u^000000��";
			mes "^ff00002��^000000�W�߂Ă��Ă���B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�ғ����䑕�u�c�c�B����͐́A";
			mes "�ǂ����Ō������Ƃ�����悤��";
			mes "�C������񂾂��ȁB";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�܂��A����Ȃ��Ƃ͂ǂ��ł������B";
			mes "�N��̂ЂƂ茾���B";
			mes "�����A���O�͑����s���B";
			mes "���O���W�߂āA������������B";
			mes "��������Ύ��Ԃ��L���Ɏg���邾�낤�B";
			mes "���񂾂��B";
			setquest 7615;
			close2;
			cutin "verus_ian01",255;
			end;
		case 2:
			break;
		case 3:
			cutin "verus_ian01",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "�Ñ㕶���ɐG�����@��Ȃ��";
			mes "�߂����ɂ���킯����Ȃ��B";
			mes "�d�����Ȃ��ĉɂȂ�A";
			mes "���̕ӂ�T�����Ă݂�Ƃ����B";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		switch(VER_1QUE) {
		case 17:
			cutin "verus_ian02",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "���傤�ǂ����Ƃ���ɗ����B";
			mes "^ff0000������^000000��^ff0000������^000000�ւ�";
			mes "�������苖�����肽�񂾁B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�����A�����͈͂�";
			mes "�L���悤�Ǝv���̂����c�c";
			next;
			menu "�Ō�̒T���̘b�́H",-;
			cutin "verus_ian01",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "���_�A�Y��ĂȂǂ��Ȃ��B";
			mes "�����c�c�Ō�̒T���ł́c�c";
			mes "���ɉ���������Ȃ������B";
			mes "�T���n�̓W���s���X��������B";
			mes "�ړI�͂��낢�날�����̂��낤���c�c";
			next;
			cutin "verus_ian02",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "���ꂪ���̐l����";
			mes "�傫�ȓ]���ɂȂ����Ƃ�����������";
			mes "�킩���Ă���B";
			mes "�����A����ȊO�̎���";
			mes "���̒��ɂ��₪�������Ă���悤��";
			mes "�悭�v���o���Ȃ��̂��c�c�B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�����炱�̏ꏊ�𒲂ׂ�΁A";
			mes "���̂�����������Ƃ��ł���C������";
			mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
			mes "�Q�������̂��B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�c�c���̊������ȁB";
			mes "���������ƒT���Ă������̂�";
			mes "�����Ɩ��֌W�ł͂Ȃ���";
			mes "�����Ă���̂��B";
			next;
			cutin "verus_ian01",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "�c�c�����獡�͖ق���";
			mes "������`���Ă��炦�Ȃ����낤���B";
			next;
			menu "�c�c�d���Ȃ��ł���",-;
			mes "[�C�A���E�A�g�i�h]";
			mes "�c�c���ꂪ�Ō�̎d�����B";
			mes "�A���N�C�G���A���̎q��";
			mes "�m��K�v������B";
			mes "���͎d���̏������ς܂���̂ŁA";
			mes "�����̏������ł�����";
			mes "�܂������ɗ��Ă���B";
			set VER_1QUE,18;
			delquest 7627;
			setquest 118204;
			close2;
			cutin "verus_ian01",255;
			end;
		case 18:
			cutin "verus_ian01",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "�����͂ł������H";
			mes "�����A�����ꂽ�n���";
			mes "�T�����n�߂悤�B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�������A�ǂ���炻���́A";
			mes "�����̂ɕq���ɔ�������";
			mes "�@�B������悤���B";
			mes "���炭���ꂪ������Ă������R���낤�B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�������s�v�c�ȃG�l���M�[�̏�ǂ�";
			mes "�����Ă���ꏊ������炵���B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�܂���^ff0000������^000000�n��𒲂ׂĂ���B";
			mes "�C�ɂȂ���̂�����Βm�点�ė~�����B";
			mes "�ꌩ�A���ɗ����������Ȃ����̒��ɂ���";
			mes "�d�v�Ȃ��̂��B����Ă���\���������B";
			mes "�������ȃK���N�^��{�̎R����������";
			mes "�K�����ׂĂ݂Ă���B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "^0000ff������^000000�́A";
			mes "^ff0000�L�ꂩ��k�����ʂɂ���^000000�ƕ������B";
			mes "�߂��܂ōs���΂����킩�邾�낤�B";
			mes "�������̓����ɂ��铝�����ɘb����";
			mes "�������֓��邱�Ƃ��ł���͂����B";
			set VER_1QUE,19;
			delquest 118204;
			setquest 7641;
			close2;
			cutin "verus_ian01",255;
			end;
		case 19:
		case 20:
			cutin "verus_ian01",2;
			mes "[�C�A���E�A�g�i�h]";
			mes "^0000ff������^000000�́A";
			mes "^ff0000�L�ꂩ��k�����ʂɂ���^000000�ƕ������B";
			mes "�߂��܂ōs���΂����킩�邾�낤�B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes "�Ƃɂ����A�����C�ɂȂ���̂𔭌�������A";
			mes "���Ў��ɒm�点�Ă���B";
			mes "�Ƃ��ɖ��ɗ����������Ȃ����̒��ɂ���";
			mes "�d�v�Ȃ��̂��B����Ă���\���������B";
			mes "^ff0000�������ȃK���N�^��{�̎R����������";
			mes "�K�����ׂĂ݂Ă���B^000000";
			close2;
			cutin "verus_ian01",255;
			end;
		case 37:
			mes "[�C�A���E�A�g�i�h]";
			mes "�E�F���X�A�������[���R�[�h�A";
			mes "�\�c���̃��Z�c�c�B";
			mes "�l���鎖�⒲�ׂ鎖�͂܂��܂�����B";
			next;
			mes "[�C�A���E�A�g�i�h]";
			mes strcharinfo(0)+ "�A";
			mes "���O�ɂ��܂��܂���`���ĖႢ�����B";
			mes "��낵�����ނ��B";
			close2;
			cutin "verus_ian01",255;
			end;
		}
	}
OnInit:
	waitingroom "�t�@���^�X�}�S���J",0;
	end;
}

verus03.gat,107,177,3	script	���[�N���t�F�Y#atnd09	953,{
	if(VER_1QUE == 14) {
		cutin "looke_rapez02",0;
		mes "[���[�N]";
		mes "�ǂ������B";
		mes "���������Ă���悤�Ɍ����邪�B";
		next;
		mes "[���[�N]";
		mes "�c�c�Ȃ�قǁB";
		mes "�C�A�����̖����Ȓ������B";
		mes "�H�ׂ₷�����`���L�x��";
		mes "�����ς肷�钿���c�c";
		next;
		cutin "looke_rapez03",0;
		mes "[���[�N]";
		mes "�c�c�ЂƂv�������Ԃ��̂�����B";
		mes "����͂��Ԃ�A";
		mes "���[��������^ff0000�r�[�t�g�[�X�g^000000���낤�B";
		next;
		mes "[���[�N]";
		mes "���V�A���̊X���[���ł������Ă��邪�A";
		mes "�������O��������";
		mes "�ޗ���p�ӂ��Ă��邱�Ƃ��ł���Ȃ�";
		mes "��������Ă���B";
		next;
		mes "[���[�N]";
		mes "���������ė����͍D���Ȃ񂾁B";
		mes "�������ޗ����B��";
		mes "����������m��Ȃ��B";
		mes "���̗����͎����̌�������";
		mes "�H�ו�������ȁB";
		next;
		cutin "looke_rapez04",0;
		mes "[���[�N]";
		mes "�Ƃ肠�����ޗ���`���悤�B";
		mes "^ff0000�ɂ�2�A";
		mes "���[���I�����W1�A";
		mes "�o�i�i1��^000000�c�c�B";
		mes "�m������Ȋ����������B";
		next;
		cutin "looke_rapez02",0;
		mes "[���[�N]";
		mes "�ޗ��̒��̉ʕ��̈ꕔ��";
		mes "^ff0000���̐X�̖��{^000000�߂��Ŏ���������̂��B";
		mes "�����W�ߐh���Ǝv����";
		mes "�T���Ă݂Ă���B";
		set VER_1QUE,15;
		delquest 7624;
		setquest 7625;
		close2;
		cutin "looke_rapez02",255;
		end;
	}
	else if(VER_1QUE == 15) {
		if(countitem(11519) >= 1) {
			cutin "looke_rapez02",0;
			mes "[���[�N]";
			mes "���A�r�[�t�g�[�X�g�������Ă������B";
			mes "�����͉���������";
			mes "���܂�����A���߂Ă�낤�B";
			next;
			cutin "looke_rapez02",255;
			mes "�]���[�N��";
			mes "�@�r�[�t�g�[�X�g�����߂͂��߂�ƁA";
			mes "�@�ӂ�ɂ����������ȍ��肪";
			mes "�@�Y���������]";
			next;
			cutin "looke_rapez01",0;
			mes "[���[�N]";
			mes "�ł������B";
			mes "�����A��߂Ȃ�������";
			mes "�C�A�����Ɏ����Ă����Ƃ����B";
			set VER_1QUE,16;
			delquest 7625;
			setquest 7626;
			close2;
			cutin "looke_rapez02",255;
			end;
		}
		if(countitem(517) < 2 || countitem(11520) < 1 || countitem(513) < 1) {
			cutin "looke_rapez04.bmp", 0;
			mes "[���[�N]";
			mes "�ޗ��̊m�F���H�@�K�v�ȐH�ނ�";
			mes "^ff0000�ɂ�2�A";
			mes "���[���I�����W1�A";
			mes "�o�i�i1��^000000���B";
			next;
			mes "[���[�N]";
			mes "�ޗ��̒��̉ʕ��̈ꕔ��";
			mes "^ff0000���̐X�̖��{^000000�߂��Ŏ���������̂��B";
			mes "�C��t���ďW�߂Ă��Ă���B";
			close2;
			cutin "looke_rapez04.bmp", 255;
			end;
		}
		cutin "looke_rapez04",0;
		mes "[���[�N]";
		mes "�悭�W�߂��ȁB";
		mes "�悵�A�ł͍�邼�B";
		next;
		cutin "looke_rapez02",255;
		mes "�]�n�����ޗ��Ń��[�N��";
		mes "�@��ۂ悭�A�������n�߂��B";
		mes "�@�ӂ�ɂ����������ȍ��肪�Y���]";
		next;
		cutin "looke_rapez04",0;
		mes "[���[�N]";
		mes "���[��������^ff0000�r�[�t�g�[�X�g^000000���B";
		mes "�N���b����������";
		mes "�\���A���Ă͂܂邾�낤�B";
		next;
		if(checkitemblank() == 0) {
			mes "[���[�N]";
			mes "�A�C�e���̎�ސ���������";
			mes "�����Ƃ��ł��Ȃ��悤���B";
			mes "��ސ������炵�Ă���";
			mes "������x���Ă���B";
			close2;
			cutin "looke_rapez02.bmp", 255;
			end;
		}
		cutin "looke_rapez01",0;
		mes "[���[�N]";
		mes "�ł������B";
		mes "�����A��߂Ȃ�������";
		mes "�C�A�����Ɏ����Ă����Ƃ����B";
		set VER_1QUE,16;
		delitem 517,2;
		delitem 11520,1;
		delitem 513,1;
		getitem 11519,1;
		delquest 7625;
		setquest 7626;
		close2;
		cutin "looke_rapez02",255;
		end;
	}
	else if(VER_1QUE == 16) {
		cutin "looke_rapez01",0;
		mes "[���[�N]";
		mes "���̊�łȃC�A������";
		mes "�C�ɓ����Ă���邾�낤�B";
		mes "��߂Ȃ������Ɏ����Ă����Ƃ����B";
		close2;
		cutin "looke_rapez01",255;
		end;
	}
	else if(VER_1QUE >= 17) {
		cutin "looke_rapez02",0;
		mes "[���[�N]";
		mes "�����͉ɂ��ȁB";
		mes "�������������G�͂��Ȃ����̂��B";
		mes "�r���Ȃ܂邺�B";
		next;
		cutin "looke_rapez02",255;
		mes "[���C�h]";
		mes "��k�ł�����Ȏ������Ȃ�`�B";
		mes "�{���ɂ����Ȃ�����ǂ�����񂾁I";
		mes "�l�͗E���ȔL�����ǁA������ɂ�";
		mes "�l�̒܂��ʗp���Ȃ��񂾂�`�c�c�B";
		next;
		cutin "looke_rapez01",0;
		mes "[���[�N]";
		mes "�S�z����ȁB";
		mes "���������ɋ������A";
		mes "���Ȃ������ʎ���";
		mes "��������鎖����΂Ȃ��B";
		mes "���S���Ďd����i�߂Ă���B";
		next;
		mes "[���[�N]";
		mes "���̊Ԃɉ���";
		mes "�H���̗p�ӂł����Ă������B";
		next;
		cutin "looke_rapez02",255;
		mes "[���C�h]";
		mes "������`�I";
		mes "���[�N�N�̂��͂񂪂���Ǝv���ƁA";
		mes "���d���̃����C���A�b�v����j���`�I";
		mes "�悧���I�@�撣��j��!!";
		close;
	}
	cutin "looke_rapez04",0;
	mes "[���[�N]";
	mes "�c�c�����̐g�ӂ͐S�z����ȁB";
	close2;
	cutin "looke_rapez04",255;
	end;
}

verus03.gat,103,177,5	script	�@�B�w�҃��C�h#atnd09	421,{/* 59261 */
	if(VER_1QUE == 9) {
		mes "[���C�h]";
		mes "��H�@���Ȃ��炾�ˁH";
		next;
		menu "�N�����C�h�H",-;
		mes "[���C�h]";
		mes "��������`�B���̗p�H";
		mes "�����A�Ȃ񂾂��āH";
		mes "�A�E���X����Ɍ����Ă�����!?";
		next;
		mes "[���C�h]";
		mes "����A��ς��`�B";
		mes "�A�E���X����̊��҂�";
		mes "�����Ȃ��Ƃ����Ȃ��̂ɁA";
		mes "�܂��������I����ĂȂ��񂾂�`�I";
		next;
		mes "[���C�h]";
		mes "�ǂ����悤�A�������j���`�c�c";
		mes "�����A�������ȁ[�I";
		next;
		switch(select("��`�������H","�L���ǂ����Ă����ɂ���񂾁H","��ςł���")) {
		case 1:
			break;
		case 2:
			mes "[���C�h]";
			mes "�l�̓}�������̓z��Ƃ͈���āA";
			mes "�V�Z�p�╶���ɋ�����������";
			mes "��������̌����������񂾁`�B";
			mes "�F�X�Ȋ�Ƃɂ��s���Ă݂āA";
			mes "�B���p���K�����I";
			next;
			mes "[���C�h]";
			mes "����Ȓ��A�E�F���X�V�e�B�̉\�𕷂���";
			mes "�����֗����񂾂��ǁA";
			mes "�ǂ������@�c�ɏ������Ă��Ȃ���";
			mes "�����ɎQ���ł��Ȃ����Č���ꂽ�񂾁B";
			next;
			mes "[���C�h]";
			mes "�r���ɕ��Ăˁ`�c�c�B";
			mes "����Ȏ��A�����Ă��ꂽ�̂�";
			mes "�A�E���X����Ȃ񂾂�B";
			mes "����ŁA�A�g�i�h���@�c��";
			mes "�����o�[�ɂȂ����񂾁I";
			next;
			mes "[���C�h]";
			mes "������A����Ȃ����b�ɂȂ���";
			mes "�A�E���X�����";
			mes "�������肳�������Ȃ���`�c�c�B";
			next;
			mes "[���C�h]";
			mes "�������N�I";
			mes "������Ǝ�`���Ă���Ȃ������H";
			mes "������ƁA������Ƃ����ł�����!!";
			mes "���肢����`�I";
			next;
			menu "�����ł���",-;
			mes "[���C�h]";
			mes "�{���H�@���肪�ƃj���`!!";
			mes "�����A���肪�Ƃ��`!!";
			mes "�������`�I";
			next;
			break;
		case 3:
			mes "[���C�h]";
			mes "�����Ȃ񂾂�`�B";
			mes "�������A�������A�ǂ����悤�c�c�B";
			next;
			cutin "looke_rapez02",0;
			mes "[���[�N]";
			mes "���荞��ň������A";
			mes "�N�̓A�g�i�h���@�c����`���ƌ���";
			mes "�˗����󂯂Ă����ɗ����񂶂�Ȃ����H";
			next;
			mes "[���[�N]";
			mes "�������班�����C�h�̎d����";
			mes "��`���Ă���Ȃ����H";
			mes "������`�������̂͂�܂�܂Ȃ񂾂��A";
			mes "���̔C���̓��C�h�̐g�ӌx�삾����";
			mes "�ނ���ڂ𗣂����Ƃ��ł��Ȃ񂾁B";
			next;
			cutin "looke_rapez02",255;
			mes "[���C�h]";
			mes "�����I���ꂾ��`�I";
			mes "�N�A�N�A";
			mes "������Ǝ�`���Ă���Ȃ������H";
			mes "������ƁA������Ƃ����ł�����!!";
			mes "���肢����`�I";
			next;
			menu "�����ł���",-;
			mes "[���C�h]";
			mes "�{���H�@���肪�ƃj���`!!";
			mes "�����A���肪�Ƃ��`!!";
			mes "�������`�I";
			next;
			break;
		}
		mes "[���C�h]";
		mes "����ł͂����{��ɓ��낤�I";
		mes "�N�ɂ͋ÏW���ꂽ�G�l���M�[��";
		mes "�W�߂Ă��Ăق����B";
		next;
		mes "[���C�h]";
		mes "�����ɂ̓E�F���X�M�A��@�B��";
		mes "��ꂽ�c�[���������񂠂�񂾁`�B";
		mes "�����Ɍ����s���̃G�l���M�[��";
		mes "�Y���Ă��邩��A";
		mes "������r���ɋl�߂ďW�߂Ăق����񂾁B";
		next;
		mes "[���C�h]";
		mes "�󂫃r����p�ӂ��āA";
		mes "�c�[�̃G�l���M�[�̗���ɍ��킹��";
		mes "�҂��Ă���΁A�󂫃r���̒���";
		mes "�G�l���M�[�������ė���͂��I";
		next;
		mes "[���C�h]";
		mes "�����^ff00002��^000000�����Ă��Ăق����B";
		mes "���肢����`�A���񂾂�`!!";
		set VER_1QUE,10;
		delquest 7620;
		setquest 7621;
		close;
	}
	else if(VER_1QUE == 10) {
		if(countitem(6756) < 2) {
			mes "[���C�h]";
			mes "�����ɂ̓E�F���X�M�A��@�B��";
			mes "��ꂽ�c�[���������񂠂�񂾁`�B";
			mes "�����Ɍ����s���̃G�l���M�[��";
			mes "�Y���Ă��邩��A";
			mes "������r���ɋl�߂ďW�߂Ăق����񂾁B";
			next;
			mes "[���C�h]";
			mes "�󂫃r����p�ӂ��āA";
			mes "�c�[�̃G�l���M�[�̗���ɍ��킹��";
			mes "�҂��Ă���΁A�󂫃r���̒���";
			mes "�G�l���M�[�������ė���͂��I";
			next;
			mes "[���C�h]";
			mes "�����^ff00002��^000000�����Ă��Ăق����B";
			mes "���肢����`�A���񂾂�`!!";
			close;
		}
		mes "[���C�h]";
		mes "���肪�Ƃ��I";
		mes "�����ƕK�v�Ȍ��A������Ă�ˁI";
		next;
		mes "[���C�h]";
		mes "�������ŏ���������`�B";
		mes "����ŃA�E���X����̗͂ɂȂꂻ������B";
		mes "���̃G�l���M�[���ÏW����錴����";
		mes "���p���@����������A";
		mes "�C�A���c�����X�Ɍ�������񂾂��āB";
		next;
		mes "[���C�h]";
		mes "���̂��߂ɁA�l�ƃA�E���X����";
		mes "�܂����̃G�l���M�[�̐��̂�";
		mes "���ׂĂ���Ƃ���Ȃ񂾁B";
		next;
		mes "[���C�h]";
		mes "�c�c�����������炱���̋@�B��";
		mes "�l�������������邩���m��Ȃ��c�c�B";
		mes "���ꂪ�C�A���c���Ƃ݂�Ȃ�";
		mes "�]��ł��邱�ƂȂ񂾁B";
		next;
		mes "[���C�h]";
		mes "�A�E���X����ɓ`���āB";
		mes "�����͌N����`���Ă��ꂽ����";
		mes "�����ɐi��ł܂����āB����ɁA";
		mes "�����̓��[�N�N�����邩��";
		mes "���S�ł����āB";
		next;
		mes "[���C�h]";
		mes "�N�Ƃ����A�A�E���X����Ƃ����c�c";
		mes "�l�Ԃɂ������z�͂���񂾃j���`�B";
		mes "�����A����񂾂ˁI";
		mes "�܂��ǂ��������`���ā`�I";
		set VER_1QUE,11;
		delitem 6756,2;
		delquest 7621;
		setquest 7622;
		close;
	}
	else if(VER_1QUE >= 11 && VER_1QUE <= 16) {
		mes "[���C�h]";
		mes "���͂��肢����d���͂Ȃ���`�B";
		mes "�܂����̂�����`���Ăق����j���`�B";
		mes "�����A��`���Ăق����ȁ[�I";
		close;
	}
	else if(VER_1QUE >= 17) {
		if(checkquest(7628)) {
			if(countitem(6756) < 2) {
				mes "[���C�h]";
				mes "�����ɂ̓E�F���X�M�A��@�B��";
				mes "��ꂽ�c�[���������񂠂�񂾁`�B";
				mes "�����Ɍ����s���̃G�l���M�[��";
				mes "�Y���Ă��邩��A";
				mes "������r���ɋl�߂ďW�߂Ăق����񂾁B";
				next;
				mes "[���C�h]";
				mes "�󂫃r����p�ӂ��āA";
				mes "�c�[�̃G�l���M�[�̗���ɍ��킹��";
				mes "�҂��Ă���΁A�󂫃r���̒���";
				mes "�G�l���M�[�������ė���͂��I";
				next;
				mes "[���C�h]";
				mes "�����^ff00002��^000000�����Ă��Ăق����B";
				mes "���肢����`�A���񂾂�`!!";
				close;
			}
			mes "[���C�h]";
			mes "���肪�Ƃ��`!!";
			mes "�N�̎��A�d�����������C�ɓ�������`�I";
			mes "�A�E���X����ƃ��[�N�N�̎������ǂˁB";
			next;
			mes "[���C�h]";
			mes "��`���A�����Ɏ��|���邼�`�B";
			mes "�{���ɂ��肪�Ƃ��I";
			mes "�܂��ǂ��������`���ā`�I";
			delitem 6756,2;
			setquest 7629;
			delquest 7628;
			getitem 6962,2;
			close;
		}
		if(checkquest(7629)) {
			if(checkquest(7629) & 0x2) {
				delquest 7629;
				mes "[���C�h]";
				mes "���`��A����Ȃ��`�c�c�B";
				mes "������Ƃ�����������";
				mes "�G�l���M�[�������ĂȂ��Ȃ����Ⴄ�B";
				mes "�ۊǕ��@�ɖ�肪����̂��ȁH";
				next;
				mes "[���C�h]";
				mes "�����A�N�������̂��B";
				mes "�������Ԃ�����Ȃ�";
				mes "�܂��G�l���M�[�W�߂�";
				mes "��`���Ăق����񂾁`�B";
				next;
				mes "[���C�h]";
				mes "���͂��Ă����Ȃ�A�����𐮂���";
				mes "�܂��l�ɘb�������ăj���`�B";
				mes "�����A�b�����ā[�I";
				close;
			}
			mes "[���C�h]";
			mes "���͏W�߂��G�l���M�[��";
			mes "���͂��Ă���r������`�B";
			next;
			mes "[���C�h]";
			mes "�Z��������ז����Ȃ��łˁ`�B";
			close;
		}
		mes "[���C�h]";
		mes "���`��A����Ȃ��`�c�c�B";
		mes "������Ƃ�����������";
		mes "�G�l���M�[�������ĂȂ��Ȃ����Ⴄ�B";
		mes "�ۊǕ��@�ɖ�肪����̂��ȁH";
		next;
		mes "[���C�h]";
		mes "�����A�N�������̂��B";
		mes "�������Ԃ�����Ȃ�";
		mes "�܂��G�l���M�[�W�߂�";
		mes "��`���Ăق����񂾁`�B";
		next;
		if(select("��`��","�f��") == 2) {
			mes "[���C�h]";
			mes "���̎d���ł�����̂����H";
			mes "�Z�����Ȃ炵�傤���Ȃ��ˁ`�B";
			mes "�����X�^�[���|�����ǁA";
			mes "���[�N�N�ƈꏏ�ɏW�߂ɍs�������B";
			next;
			cutin "looke_rapez01",0;
			mes "[���[�N]";
			mes "����͊��}���B";
			mes "�ɂ��������炿�傤�ǂ����B";
			close2;
			cutin "looke_rapez01",255;
			end;
		}
		mes "[���C�h]";
		mes "���肪�Ƃ��`�I";
		mes "�Ƃ��Ă��������B";
		mes "�W�ߕ��͊o���Ă�H";
		next;
		mes "[���C�h]";
		mes "�܂��󂫃r����p�ӂ��āA";
		mes "�c�[�̃G�l���M�[�̗���ɍ��킹��";
		mes "�҂��Ă���΁A�󂫃r���̒���";
		mes "�G�l���M�[�������ė���͂��I";
		next;
		mes "[���C�h]";
		mes "�����^ff00002��^000000�����Ă��Ăق����B";
		mes "���肢����`�A���񂾂�`!!";
		setquest 7628;
		close;
	}
	mes "[���C�h]";
	mes "�c�c�N�͍��A�����L������";
	mes "�������悤�Ƃ��Ă���ˁ`�H";
	mes "�O�������Ŕ��f���ꂿ�።���`�B";
	close;
}

verus03.gat,127,145,3	script	�@�B�̎c�[#atnd01	10042,3,3,{/* 59262 */
	if(VER_1QUE != 10 && !checkquest(7628)) {
		mes "�]�s�v�c�Ȍ����h��߂��Ă���]";
		close;
	}
	if(countitem(6756) >= 2) {
		mes "�]^4d4dff�ÏW���ꂽ�G�l���M�[^000000�͏\���W�߂��B";
		mes "�@���C�h�̏��֖߂낤�]";
		close;
	}
	if(countitem(713) < 1) {
		mes "�]�ÏW���ꂽ�G�l���M�[���̎悷��ɂ�";
		mes "�@^4d4dff�󂫃r��^000000���K�v���]";
		close;
	}
	misceffect 362;
	mes "�]��ꂽ�@�B�̌��Ԃ�";
	mes "�@���m�̃G�l���M�[���W�܂��Ă���B";
	mes "�@�h��߂��̐�ɋ󂫃r����Y�����";
	mes "�@�G�l���M�[���W�߂鎖���ł��������]";
	next;
	progressbar 3;
	if(checkitemblank() == 0) {
		mes "�]�A�C�e���̎�ސ���������";
		mes "�@�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���󂯎�낤�]";
		close;
	}
	hideonnpc;
	delitem 713,1;
	getitem 6756,1;
	mes "�]�ÏW���ꂽ�G�l���M�[���̎悵���]";
	close;
OnTouch:
	misceffect 362;
	end;
}
verus03.gat,84,152,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd02	10042,3,3	/* 59263 */
verus03.gat,104,181,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd03	10042,3,3	/* 59264 */
verus03.gat,204,202,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd04	10042,3,3	/* 59265 */
verus03.gat,219,199,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd05	10042,3,3	/* 59266 */
verus03.gat,260,194,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd06	10042,3,3	/* 59267 */
verus03.gat,198,181,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd07	10042,3,3	/* 59268 */
verus03.gat,207,115,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd08	10042,3,3	/* 59269 */
verus03.gat,54,78,3		duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd09	10042,3,3	/* 59270 */
verus03.gat,24,74,3		duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd10	10042,3,3	/* 59271 */
verus03.gat,43,125,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd11	10042,3,3	/* 59272 */
verus03.gat,62,120,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd12	10042,3,3	/* 59273 */
verus03.gat,44,195,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd13	10042,3,3	/* 59274 */
verus03.gat,124,61,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd14	10042,3,3	/* 59275 */
verus03.gat,168,229,3	duplicate(�@�B�̎c�[#atnd01)	�@�B�̎c�[#atnd15	10042,3,3	/* 59276 */

verus03.gat,167,257,5	script	�o���蓝�����_���n#atnd	868,{/* 59490 */
	if(VER_1QUE == 19) {
		mes "[�_���n]";
		mes "�����͋��𓾂����@�c�̒c���ȊO��";
		mes "�������邱�Ƃ��ł��܂���B";
		mes "�ǂ��炩�痈�����ł����H";
		next;
		switch(select("�A�g�i�h���@�c�ł�","�Ȃ������Ȃ��Ɨ�������Ȃ��H")) {
		case 1:
			mes "[�_���n]";
			mes "�A�g�i�h���@�c�̕��ł��ˁB";
			mes "���X���҂����������B";
			mes "�c�c�͂��A�m�F�ł��܂����B";
			mes "�A�g�i�h���@�c��";
			mes "�������肪������Ă��܂��B";
			next;
			menu "�Ȃ������Ȃ��Ɨ�������Ȃ��H",-;
			mes "[�_���n]";
			mes "�E�F���X�V�e�B��";
			mes "�傫���S�����̒n��ɕ�����Ă��܂��B";
			next;
			mes "[�_���n]";
			mes "���̒��Ō��݈�ʌ��J����Ă���n���";
			mes "�E�F���X�^�E����";
			mes "�E�F���X�����L��ł��B";
			mes "���̑��ɂ��{�݂̂悤�ȕ���";
			mes "�������̂ł����A";
			mes "���̒n��͕�����Ă��܂����B";
			next;
			mes "[�_���n]";
			mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
			mes "��ʔ��@�c���W����O��";
			mes "�䂪�Ђł��̕�����Ă����n���";
			mes "�������Ă݂����ʁA";
			mes "�E�F���X�͉��炩�̑傫�Ȕ�����������";
			mes "�n��ł��鎖���킩��܂����B";
			next;
			mes "[�_���n]";
			mes "���݂͋@�B���P���Ă���Ƃ������ƁA";
			mes "�����̒n�`���댯�ł��鎖�ȊO��";
			mes "�傫�Ȋ댯�͖����Ɣ��f�ł������߁A";
			mes "���͂̂���ꕔ�̔��@�c�Ɍ���";
			mes "��������������Ă��܂��B";
			break;
		case 2:
			mes "[�_���n]";
			mes "�E�F���X�V�e�B��";
			mes "�傫���S�����̒n��ɕ�����Ă��܂��B";
			next;
			mes "[�_���n]";
			mes "���̒��Ō��݈�ʌ��J����Ă���n���";
			mes "�E�F���X�^�E����";
			mes "�E�F���X�����L��ł��B";
			mes "���̑��ɂ��{�݂̂悤�ȕ���";
			mes "�������̂ł����A";
			mes "���̒n��͕�����Ă��܂����B";
			next;
			mes "[�_���n]";
			mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
			mes "��ʔ��@�c���W����O��";
			mes "�䂪�Ђł��̕�����Ă����n���";
			mes "�������Ă݂����ʁA";
			mes "�E�F���X�͉��炩�̑傫�Ȕ�����������";
			mes "�n��ł��鎖���킩��܂����B";
			next;
			mes "[�_���n]";
			mes "���݂͋@�B���P���Ă���Ƃ������ƁA";
			mes "�����̒n�`���댯�ł��鎖�ȊO��";
			mes "�傫�Ȋ댯�͖����Ɣ��f�ł������߁A";
			mes "���͂̂���ꕔ�̔��@�c�Ɍ���";
			mes "��������������Ă��܂��B";
			next;
			mes "[�_���n]";
			mes "���Ȃ��͂ǂ��̔��@�c�����̕��ł����H";
			next;
			menu "�A�g�i�h���@�c�ł�",-;
			mes "[�_���n]";
			mes "�A�g�i�h���@�c�̕��ł��ˁB";
			mes "���X���҂����������B";
			mes "�c�c�͂��A�m�F�ł��܂����B";
			mes "�A�g�i�h���@�c��";
			mes "�������肪������Ă��܂��B";
			break;
		}
		next;
		mes "[�_���n]";
		mes "�A�g�i�h���@�c�ɂ́A";
		mes "^ff0000�����ɂ��������^000000�ւ�";
		mes "��������������o�Ă��܂��̂ŁA";
		mes "������̒��������肢���܂��B";
		next;
		mes "[�_���n]";
		mes "����ł͗ǂ����ʂ�҂��Ă��܂��B";
		mes "���C�����āI";
		set VER_1QUE,20;
		delquest 7641;
		setquest 7642;
		close;
	}
	if(VER_1QUE >= 20) {
		mes "[�_���n]";
		mes "�����͐i��ł��܂����H";
		mes "�����n��͊댯�Ȃ̂�";
		mes "�C��t���ĉ������B";
		close;
	}
	mes "[�_���n]";
	mes "�\���󂠂�܂��񂪁A���̐��";
	mes "�������肽���@�c�̕��̂�";
	mes "�������肪�\�ł��B";
	close;
}

verus03.gat,172,257,3	script	�o���蓝�����M���n#atnd	868,{/* 59491 */
	if(VER_1QUE == 19) {
		mes "[�M���n]";
		mes "�����͋��𓾂����@�c�̒c���ȊO��";
		mes "�������邱�Ƃ��ł��܂���B";
		mes "�ǂ��炩�痈�����ł����H";
		next;
		switch(select("�A�g�i�h���@�c�ł�","�Ȃ������Ȃ��Ɨ�������Ȃ��H")) {
		case 1:
			mes "[�M���n]";
			mes "�A�g�i�h���@�c�̕��ł��ˁB";
			mes "���X���҂����������B";
			mes "�c�c�͂��A�m�F�ł��܂����B";
			mes "�A�g�i�h���@�c��";
			mes "�������肪������Ă��܂��B";
			next;
			menu "�Ȃ������Ȃ��Ɨ�������Ȃ��H",-;
			mes "[�M���n]";
			mes "�E�F���X�V�e�B��";
			mes "�傫���S�����̒n��ɕ�����Ă��܂��B";
			next;
			mes "[�M���n]";
			mes "���̒��Ō��݈�ʌ��J����Ă���n���";
			mes "�E�F���X�^�E����";
			mes "�E�F���X�����L��ł��B";
			mes "���̑��ɂ��{�݂̂悤�ȕ���";
			mes "�������̂ł����A";
			mes "���̒n��͕�����Ă��܂����B";
			next;
			mes "[�M���n]";
			mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
			mes "��ʔ��@�c���W����O��";
			mes "�䂪�Ђł��̕�����Ă����n���";
			mes "�������Ă݂����ʁA";
			mes "�E�F���X�͉��炩�̑傫�Ȕ�����������";
			mes "�n��ł��鎖���킩��܂����B";
			next;
			mes "[�M���n]";
			mes "���݂͋@�B���P���Ă���Ƃ������ƁA";
			mes "�����̒n�`���댯�ł��鎖�ȊO��";
			mes "�傫�Ȋ댯�͖����Ɣ��f�ł������߁A";
			mes "���͂̂���ꕔ�̔��@�c�Ɍ���";
			mes "��������������Ă��܂��B";
			break;
		case 2:
			mes "[�M���n]";
			mes "�E�F���X�V�e�B��";
			mes "�傫���S�����̒n��ɕ�����Ă��܂��B";
			next;
			mes "[�M���n]";
			mes "���̒��Ō��݈�ʌ��J����Ă���n���";
			mes "�E�F���X�^�E����";
			mes "�E�F���X�����L��ł��B";
			mes "���̑��ɂ��{�݂̂悤�ȕ���";
			mes "�������̂ł����A";
			mes "���̒n��͕�����Ă��܂����B";
			next;
			mes "[�M���n]";
			mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
			mes "��ʔ��@�c���W����O��";
			mes "�䂪�Ђł��̕�����Ă����n���";
			mes "�������Ă݂����ʁA";
			mes "�E�F���X�͉��炩�̑傫�Ȕ�����������";
			mes "�n��ł��鎖���킩��܂����B";
			next;
			mes "[�M���n]";
			mes "���݂͋@�B���P���Ă���Ƃ������ƁA";
			mes "�����̒n�`���댯�ł��鎖�ȊO��";
			mes "�傫�Ȋ댯�͖����Ɣ��f�ł������߁A";
			mes "���͂̂���ꕔ�̔��@�c�Ɍ���";
			mes "��������������Ă��܂��B";
			next;
			mes "[�M���n]";
			mes "���Ȃ��͂ǂ��̔��@�c�����̕��ł����H";
			next;
			menu "�A�g�i�h���@�c�ł�",-;
			mes "[�M���n]";
			mes "�A�g�i�h���@�c�̕��ł��ˁB";
			mes "���X���҂����������B";
			mes "�c�c�͂��A�m�F�ł��܂����B";
			mes "�A�g�i�h���@�c��";
			mes "�������肪������Ă��܂��B";
			break;
		}
		next;
		mes "[�M���n]";
		mes "�A�g�i�h���@�c�ɂ́A";
		mes "^ff0000�����ɂ��������^000000�ւ�";
		mes "��������������o�Ă��܂��̂ŁA";
		mes "������̒��������肢���܂��B";
		next;
		mes "[�M���n]";
		mes "����ł͗ǂ����ʂ�҂��Ă��܂��B";
		mes "���C�����āI";
		set VER_1QUE,20;
		delquest 7641;
		setquest 7642;
		close;
	}
	if(VER_1QUE >= 20) {
		mes "[�M���n]";
		mes "�����͐i��ł��܂����H";
		mes "�����n��͊댯�Ȃ̂�";
		mes "�C��t���ĉ������B";
		close;
	}
	mes "[�M���n]";
	mes "�\���󂠂�܂��񂪁A���̐��";
	mes "�������肽���@�c�̕��̂�";
	mes "�������肪�\�ł��B";
	close;
}

verus03.gat,169,259,0	script	verus03_to_verus02	45,1,1,{/* 59492 */
	if(VER_1QUE < 20) {
		mes "[�o���蓝����]";
		mes "�\���󂠂�܂��񂪁A���̐��";
		mes "�������肽���@�c�̕��̂�";
		mes "�������肪�\�ł��B";
		close;
	}
	warp "verus02.gat",72,19;
	end;
}

verus02.gat,72,16,0	warp	verus02_to_verus03	1,1,verus03.gat,169,255

verus02.gat,60,30,1	script	�U��΂�������#e152a01	10043,{/* 59494 (hide)*/
	if(VER_1QUE == 20) {
		mes "�]�F�X�ȏ��ނ�";
		mes "�@�R�ς݂ɂȂ��Ă���B";
		mes "�@���ނɋL���ꂽ�����͗򉻂��A";
		mes "�@��ǂ͍���Ȃ悤���]";
		next;
		if(select("���ׂ�","��߂�") == 2) {
			mes "�]���̏ꏊ�𒲂ׂ邱�Ƃɂ����]";
			close;
		}
		progressbar 3;
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���󂯎�낤�]";
			close;
		}
		hideonnpc;
		mes "�]���G�ɎU��΂������ނ̒���";
		mes "�@�����ȉ~�Տ�̕��̂��������]";
		next;
		mes "^4d4dff�]�C�A���E�A�g�i�h���m��";
		mes "�@�����čs���Ē��ׂĖႨ���]^000000";
		set VER_1QUE,21;
		getitem 6757,1;
		delquest 7642;
		setquest 7643;
		close;
	}
	if(VER_1QUE == 24) {
		if(countitem(6757) >= 2) {
			mes "�]�������[���R�[�h�͏\���ɏW�܂����B";
			mes "�@����ȏ㒲�ׂ�K�v�͂Ȃ��������]";
			close;
		}
		mes "�]�F�X�ȏ��ނ�";
		mes "�@�R�ς݂ɂȂ��Ă���B";
		mes "�@���ނɋL���ꂽ�����͗򉻂��A";
		mes "�@��ǂ͍���Ȃ悤���]";
		next;
		if(select("���ׂ�","��߂�") == 2) {
			mes "�]���̏ꏊ�𒲂ׂ邱�Ƃɂ����]";
			close;
		}
		progressbar 3;
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���󂯎�낤�]";
			close;
		}
		hideonnpc;
		mes "�]���G�ɎU��΂������ނ̒���";
		mes "�@��؂����ɒu���ꂽ";
		mes "�@�������[���R�[�h���������B";
		mes "�@�܂�ŒN�����Ӑ}�I��";
		mes "�@�B���Ă������悤�Ɋ�����]";
		getitem 6757,1;
		close;
	}
	if(checkquest(7650)) {
		if(countitem(6757) >= 2) {
			mes "�]�������[���R�[�h�͏\���ɏW�܂����B";
			mes "�@����ȏ㒲�ׂ�K�v�͂Ȃ��������]";
			close;
		}
		mes "�]�F�X�ȏ��ނ�";
		mes "�@�R�ς݂ɂȂ��Ă���B";
		mes "�@���ނɋL���ꂽ�����͗򉻂��A";
		mes "�@��ǂ͍���Ȃ悤���]";
		next;
		if(select("���ׂ�","��߂�") == 2) {
			mes "�]���̏ꏊ�𒲂ׂ邱�Ƃɂ����]";
			close;
		}
		progressbar 3;
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���󂯎�낤�]";
			close;
		}
		hideonnpc;
		mes "�]���G�ɎU��΂������ނ̒���";
		mes "�@�������[���R�[�h���������]";
		getitem 6757,1;
		close;
	}
	mes "�]���ɕς�������̂͌�������Ȃ��]";
	close;
}

verus02.gat,178,32,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a02	10043	/* 59495 */
verus02.gat,102,135,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a03	10043	/* 59496 */
verus02.gat,42,37,3		duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a04	10043	/* 59497 */
verus02.gat,155,64,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a05	10043	/* 59498 */
verus02.gat,80,129,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a06	10043	/* 59499 */
verus02.gat,29,129,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a07	10043	/* 59500 */
verus02.gat,125,85,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a08	10043	/* 59501 */
verus02.gat,51,237,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a09	10043	/* 59502 */
verus02.gat,160,150,3	duplicate(�U��΂�������#e152a01)	�U��΂�������#e152a10	10043	/* 59503 */

verus03.gat,52,250,5	script	�o���蓝�����O�}��#atnd	868,{/* 59483 */
	if(VER_1QUE == 19) {
		mes "[�O�}��]";
		mes "�����͋��𓾂����@�c�̒c���ȊO��";
		mes "�������邱�Ƃ��ł��܂���B";
		mes "�ǂ��炩�痈�����ł����H";
		next;
		menu "�A�g�i�h���@�c�ł�",-;
		mes "[�O�}��]";
		mes "�A�g�i�h���@�c�̕��ł��ˁB";
		next;
		mes "[�O�}��]";
		mes "�A�g�i�h���@�c�ɂ́A";
		mes "^ff0000�k�����ɂ��錤����^000000�ւ�";
		mes "�������苖���o�Ă��܂��̂ŁA";
		mes "������̒������ɂ��肢���܂��B";
		next;
		mes "�]���^ff0000�k�����ɂ��錤����^000000��";
		mes "�@���������悤�]";
		close;
	}
	if(VER_1QUE >= 20) {
		mes "[�O�}��]";
		mes "�����͐i��ł��܂����H";
		mes "�����n��͊댯�Ȃ̂�";
		mes "�C��t���ĉ������B";
		close;
	}
	mes "[�O�}��]";
	mes "�\���󂠂�܂��񂪁A���̐��";
	mes "�������肽���@�c�̕��̂�";
	mes "�������肪�\�ł��B";
	close;
}

verus03.gat,52,254,0	script	verus03_to_verus01	45,1,1,{
	if(VER_1QUE < 20) {
		mes "[�o���蓝����]";
		mes "�\���󂠂�܂��񂪁A���̐��";
		mes "�������肽���@�c�̕��̂�";
		mes "�������肪�\�ł��B";
		close;
	}
	warp "verus01.gat",243,62;
	end;
}

verus01.gat,247,58,0	warp	verus01_to_verus03	1,1,verus03.gat,55,251

verus04.gat,172,149,3	script	�c���A���N�C�G��#e152v0	951,{
	switch(VER_1QUE) {
	case 0:
	case 1:
	case 2:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "����A�N�́c�c�B";
		mes "�Ђ���Ƃ��Ĕ��@�ɋ���������̂��H";
		mes "��������������悤�Ȃ�";
		mes "�y���c�ւ��Ă���B";
		mes "�ڂ����b�����悤�B";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 3:
	case 4:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "���@�c�̎Q���o�^�͍ς܂������H";
		mes "�܂��Ȃ瑁���o�^�����āA";
		mes "���@��Ƃ���`���Ă��Ă���B";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 24:
		if(countitem(6757) < 2) {
			cutin "Arquien_n_atnad02",2;
			mes "[�i�C��]";
			mes "�����������Řb�������e��";
			mes "�o���Ă��Ȃ��̂��H";
			mes "^ff0000�������[���R�[�h��";
			mes "�ЂƂ������ᓮ���Ȃ��݂������B^000000";
			mes "�Đ�����ɂ�2�K�v���Ǝv���B";
			next;
			cutin "Arquien_n_atnad01",2;
			mes "[�i�C��]";
			mes "�ŏ��̃������[���R�[�h��";
			mes "�������ꏊ�̋߂���";
			mes "������x�s����";
			mes "^ff0000�������[���R�[�h��2��";
			mes "�W�߂Ď����Ă��Ă���B^000000";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�����ė������H";
		mes "�悵�B�������������ďW�߂āc�c";
		mes "�����ɒu���c�c�B";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�����A�����͏o�����B";
		mes "�Đ��X�C�b�`��";
		mes "�N�ɉ����Ă��炨�����B";
		mes "���R�[�h�v���C���[�́A";
		mes "���ׂ̗ɒu���Ă���B";
		mes "���́A�Đ��̃X�C�b�`�������������B";
		delitem 6757,2;
		set VER_1QUE,25;
		delquest 7645;
		setquest 7646;
		emotion 0,"���R�[�h�v���C���[#e152";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 25:
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�����A�p�ӂ͂ł��Ă���B";
		mes "�������[���R�[�h�ɋL���ꂽ�閧��";
		mes "�m�F���悤����Ȃ����B";
		mes "���R�[�h�v���C���[�́A";
		mes "���ׂ̗ɒu���Ă���B";
		mes "���́A�Đ��̃X�C�b�`�������������B";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 26:
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "�ӂށc�c�B";
		mes "���e���̂͑債�����͂Ȃ����c�c";
		mes "�Ȃ��A�g�i�h�̖����o�Ă���H";
		mes "�e���������m���Ă���̂��H";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "����A�Ⴄ�B";
		mes "�����Ƃ��̓��e�͒m��Ȃ��͂����B";
		mes "����ł��������c�c�B";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�c�c���������I�@�킩���!!";
		mes "��������ē����g���͎̂��Ɍ����Ȃ��I";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�N���s���č��̓��e��";
		mes "���܂����̐e���ɓ`����񂾁B";
		mes "�l����̂̓A�C�c�̐�傾��H";
		mes "�����Ă��̃������[���R�[�h�́c�c";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�c�c!?";
		misceffect 234,"���R�[�h�v���C���[#e152";
		next;
		menu "���A�����c",-;
		mes "[�i�C��]";
		mes "�Ȃ��c�c�H�@�Ód�C!?";
		mes "����Ƃ��悭����؋��B�ł��ă��c���H";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�܂������B�Ƃ������N��";
		mes "��̂̓��e��e���ɓ`������A";
		mes "�ǂ����ăA�g�i�h�̖����o���̂�";
		mes "�����邱�Ƃ͂Ȃ��������Ă݂Ă���B";
		set VER_1QUE,27;
		delquest 118206;
		setquest 7647;
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 27:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�������[���R�[�h�̓��e��";
		mes "�o���Ă���ȁH�@�N���s���ē��e��";
		mes "���܂����̐e���ɓ`����񂾁B";
		mes "�l����̂̓A�C�c�̐�傾��H";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	case 28:
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�͂��B���̐e���A�{���Ɂc�c�B";
		mes "��������b�ɗ�����͂��Ȃ��̂��H";
		mes "����ō���͎�������";
		mes "�������[���R�[�h���ƁH";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�S���c�c�d���Ȃ��l���ȁc�c�B";
		mes "�܂������B���͂͂����B";
		mes "���͊��傾����ˁB";
		next;
		mes "[�i�C��]";
		mes "����ɁA���̐e���ł�";
		mes "�킩��Ȃ���������Ƃ����̂��A";
		mes "�����ʔ������ȁB";
		mes "������������Ȃ��Ȃ�";
		mes "�������Œ��ׂ悤����Ȃ����B";
		next;
		mes "[�i�C��]";
		mes "�N�����͂��Ă���邾�낤�H";
		mes "�������̃������[���R�[�h��";
		mes "2�W�߂Ď����Ă��Ă���B";
		mes "�C��t���čs���Ă���񂾂��B";
		set VER_1QUE,29;
		delquest 7648;
		setquest 118208;
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 29:
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "�͂��B���̐e���A�{���Ɂc�c�B";
		mes "��������b�ɗ�����͂��Ȃ��̂��H";
		mes "����ō���͎�������";
		mes "�������[���R�[�h���ƁH";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�S���c�c�d���Ȃ��l���ȁc�c�B";
		mes "�܂������B���͂͂����B";
		mes "���͊��傾����ˁB";
		next;
		mes "[�i�C��]";
		mes "����ɁA���̐e���ł�";
		mes "�킩��Ȃ���������Ƃ����̂��A";
		mes "�����ʔ������ȁB";
		mes "������������Ȃ��Ȃ�";
		mes "�������Œ��ׂ悤����Ȃ����B";
		next;
		mes "[�i�C��]";
		mes "�N�����͂��Ă���邾�낤�H";
		mes "�������̃������[���R�[�h��";
		mes "2�W�߂Ď����Ă��Ă���B";
		mes "�C��t���čs���Ă���񂾂��B";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 30:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�����ė������H";
		mes "�悵�B�������������ďW�߂āc�c";
		mes "�����ɒu���c�c�B";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�����A�����͏o�����B";
		mes "�Đ��X�C�b�`��";
		mes "�N�ɉ����Ă��炨�����B";
		mes "���e�͂�������L�����āA";
		mes "�e���ɓ`����񂾂��B";
		delitem 6824,2;
		set VER_1QUE,31;
		delquest 118209;
		setquest 7646;
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 31:
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�����A�p�ӂ͂ł��Ă���B";
		mes "�������[���R�[�h�ɋL���ꂽ�閧��";
		mes "�m�F���悤����Ȃ����B";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 32:
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "�Đ���̉��́A�Ód�C�ł͂Ȃ�";
		mes "�A�����ʂ����ꂽ���������݂������B";
		mes "������x2�q����ƍĐ��ł��邩��A";
		mes "���ɖ��͂Ȃ����������c�c�B";
		next;
		mes "[�i�C��]";
		mes "�c�c����������Ȃ�ʓ��e���ȁB";
		mes "�����Ƃ����̂́A���̏ꏊ��";
		mes "����Ȏp�ɂ��������Ȃ̂��H";
		next;
		cutin "Arquien_n_atnad04",2;
		mes "[�i�C��]";
		mes "����������Ɓc�c���e����@����ɁA";
		mes "���̃������[���R�[�h�Ƃ������̂�";
		mes "���̒n��̔閧�������̂�";
		mes "�傫�ȍv�������邩���m��Ȃ��ȁB";
		next;
		menu "�j�Ђ�������",-;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�ق��c�c����͂܂�";
		mes "�s�v�c�Ȃ��̂��������ȁB";
		mes "���R�[�h�����̋󂢂Ă���������";
		mes "�����Ă������̂Ȃ̂��H";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "�Ȃ�قǁB���̕���������̂��B";
		mes "����������́c�c";
		next;
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "���̔j�Ђ���͋��͂Ȏv�O��������B";
		mes "�C��t���Ĉ����悤�ɂ����ق��������B";
		mes "�����N���邩������Ȃ�����ȁB";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "����Ƃ��ȁB���̒����Ɋւ��āA";
		mes "�F�X�b�𕷂��Ă����狻�����N�����B";
		mes "���������ɎQ�����邩��A";
		mes "�����烁�����[���R�[�h��";
		mes "���Ɏ����Ă��Ă���B";
		next;
		mes "[�i�C��]";
		mes "�Ƃ肠�������̐e����";
		mes "�����Q�����鎖��`���Ă����Ă���B";
		mes "����������Ă�";
		mes "�C�ɂ��Ȃ��ł�������ȁB";
		next;
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "��c�c�H�@������Ƒ҂āA";
		mes "�����ٗl�ȕ��͋C������B";
		mes "�N���K�˂Ă����̂��c�c�H";
		mes "�l�q�����ė���񂾁B";
		set VER_1QUE,33;
		delquest 118206;
		setquest 118210;
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	case 33:
	case 34:
	case 35:
	case 36:
	case 37:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�����A�N���B";
		mes "�ǂ������H�@���ɗp���H";
		next;
		switch(select("���R�[�h�̎��W�@(�f�C���[�N�G�X�g)","�b������","�Ƃ��ɗp�͂Ȃ�")) {
		case 1:
			mes "[�i�C��]";
			mes "�������[���R�[�h�̎��W���H";
			mes "�ǂ���̏ꏊ��";
			mes "�������[���R�[�h���H";
			next;
			set '@str1$,"�������@(^FF0000�N�G�X�g�󒍉\^000000)";
			set '@str2$,"�������@(^FF0000�N�G�X�g�󒍉\^000000)";
			if(checkquest(7650))
				set '@str1$,"�������@(^FF0000�󒍒�^000000)";
			else if(checkquest(7651) & 0x2 == 0)
				set '@str1$,"������";
			if(checkquest(7652))
				set '@str2$,"�������@(^FF0000�󒍒�^000000)";
			else if(checkquest(7653) & 0x2 == 0)
				set '@str2$,"������";
			switch(select('@str1$,'@str2$)) {
			case 1:
				if(checkquest(7654)) {
					cutin "Arquien_n_atnad01.bmp", 2;
					mes "[�i�C��]";
					mes "�����A�����͏o�����B";
					mes "�Đ��X�C�b�`��";
					mes "�N�ɉ����Ă��炨�����B";
					next;
					cutin "Arquien_n_atnad01.bmp", 255;
					mes "�]�ׂɂ���";
					mes "�@���R�[�h�v���C���[�𒲂ׂāA";
					mes "�@�Đ����悤�]";
					close;
				}
				if(checkquest(7650)) {
					if(countitem(6757) < 2) {
						mes "[�i�C��]";
						mes "�������̃������[���R�[�h��";
						mes "�T���Ă��Ă���B";
						mes "^ff0000�������[���R�[�h��2�K�v�����B^000000";
						close2;
						cutin "Arquien_n_atnad01",255;
						end;
					}
					mes "[�i�C��]";
					mes "�������[���R�[�h��";
					mes "�W�߂ė����悤���ȁB";
					mes "�������A�������[���R�[�h��";
					mes "��̂������݂���񂾁H";
					next;
					mes "[�i�C��]";
					mes "�����A�����͏o�����B";
					mes "�Đ��X�C�b�`��";
					mes "�N�ɉ����Ă��炨�����B";
					delitem 6757, 2;
					setquest 7654;
					delquest 7650;
					close2;
					cutin "Arquien_n_atnad01.bmp", 255;
					end;
				}
				if(checkquest(7651)) {
					if(checkquest(7651) & 0x2) {
						delquest 7651;
						mes "[�i�C��]";
						mes "�����A�\���x�񂾂悤�����A";
						mes "�������[���R�[�h�̎��W��";
						mes "�ĊJ���悤���H";
						mes "�s���C�ɂȂ�����";
						mes "������x���������Ă���B";
						close2;
						cutin "Arquien_n_atnad01.bmp", 255;
						end;
					}
					mes "[�i�C��]";
					mes "�������̃������[���R�[�h�̎��W��";
					mes "�����񂾂��ɂ��Ă���B";
					next;
					mes "[�i�C��]";
					mes "�N�����Ă���Ǝv�����B����";
					mes "�l�����g����^�C�v�ł͂Ȃ�����ȁB";
					mes "�܂����Ԃ������ė��Ă���B";
					close2;
					cutin "Arquien_n_atnad01",255;
					end;
				}
				mes "[�i�C��]";
				mes "�������̃������[���R�[�h��";
				mes "�Đ��������̂��H";
				next;
				mes "[�i�C��]";
				mes "�I�[�P�[�킩�����B";
				mes "�����Đ��ł���悤��";
				mes "���R�[�h�v���C���[�͏������Ă������B";
				mes "��������̓��e�ɂ͋���������B";
				mes "^ff0000�������[���R�[�h��2��";
				mes "�W�߂Ď����Ă��Ă���B^000000";
				next;
				if(select("�W�߂Ă���","�f��") == 2) {
					mes "[�i�C��]";
					mes "�������B";
					mes "�C�����������낵�����ށB";
					close2;
					cutin "Arquien_n_atnad01",255;
					end;
				}
				mes "[�i�C��]";
				mes "���񂾂��B";
				mes "�C��t���čs���Ă���񂾁B";
				setquest 7650;
				close2;
				cutin "Arquien_n_atnad01",255;
				end;
			case 2:
				if(checkquest(7655)) {
					cutin "Arquien_n_atnad01.bmp", 2;
					mes "[�i�C��]";
					mes "�����A�����͏o�����B";
					mes "�Đ��X�C�b�`��";
					mes "�N�ɉ����Ă��炨�����B";
					next;
					cutin "Arquien_n_atnad01.bmp", 255;
					mes "�]�ׂɂ���";
					mes "�@���R�[�h�v���C���[�𒲂ׂāA";
					mes "�@�Đ����悤�]";
					close;
				}
				if(checkquest(7652)) {
					if(countitem(6824) < 2) {
						mes "[�i�C��]";
						mes "�������̃������[���R�[�h��";
						mes "�T���Ă��Ă���B";
						mes "^ff0000�������[���R�[�h��2�K�v�����B^000000";
						close2;
						cutin "Arquien_n_atnad01",255;
						end;
					}
					mes "[�i�C��]";
					mes "�������[���R�[�h��";
					mes "�W�߂ė����悤���ȁB";
					mes "�������A�������[���R�[�h��";
					mes "��̂������݂���񂾁H";
					next;
					mes "[�i�C��]";
					mes "�����A�����͏o�����B";
					mes "�Đ��X�C�b�`��";
					mes "�N�ɉ����Ă��炨�����B";
					delitem 6824, 2;
					setquest 7655;
					delquest 7652;
					close2;
					cutin "Arquien_n_atnad01.bmp", 255;
					end;
				}
				if(checkquest(7653)) {
					if(checkquest(7653) & 0x2) {
						delquest 7653;
						mes "[�i�C��]";
						mes "�����A�\���x�񂾂悤�����A";
						mes "�������[���R�[�h�̎��W��";
						mes "�ĊJ���悤���H";
						mes "�s���C�ɂȂ�����";
						mes "������x���������Ă���B";
						close2;
						cutin "Arquien_n_atnad01",255;
						end;
					}
					cutin "Arquien_n_atnad01.bmp", 2;
					mes "[�i�C��]";
					mes "�������̃������[���R�[�h�̎��W��";
					mes "�����񂾂��ɂ��Ă���B";
					next;
					mes "[�i�C��]";
					mes "�N�����Ă���Ǝv�����B����";
					mes "�l�����g����^�C�v�ł͂Ȃ�����ȁB";
					mes "�܂����Ԃ������ė��Ă���B";
					close2;
					cutin "Arquien_n_atnad01.bmp", 255;
					end;
				}
				mes "[�i�C��]";
				mes "�������̃������[���R�[�h��";
				mes "�Đ��������̂��H";
				next;
				mes "[�i�C��]";
				mes "�I�[�P�[�킩�����B";
				mes "�����Đ��ł���悤��";
				mes "���R�[�h�v���C���[�͏������Ă������B";
				mes "��������̓��e�ɂ͋���������B";
				mes "^ff0000�������[���R�[�h��2��";
				mes "�W�߂Ď����Ă��Ă���B^000000";
				next;
				mes "^ff0000�][���R�[�h�̔j��]��";
				mes "�@�������Ă�ꍇ�́A";
				mes "�@�V����[���R�[�h�̔j��]��";
				mes "�@���肷�鎖�͂ł��܂���]^000000";
				next;
				if(select("�W�߂Ă���","�f��") == 2) {
					mes "[�i�C��]";
					mes "�������B";
					mes "�C�����������낵�����ށB";
					close2;
					cutin "Arquien_n_atnad01",255;
					end;
				}
				mes "[�i�C��]";
				mes "���񂾂��B";
				mes "�C��t���čs���Ă���񂾁B";
				setquest 7652;
				close2;
				cutin "Arquien_n_atnad01",255;
				end;
			}
		case 2:
			mes "[�i�C��]";
			mes "�b���ƁH�@�ǂ������B";
			next;
			menu "�Ō�̒T���ɂ���",-;
			cutin "Arquien_n_atnad04",2;
			mes "[�i�C��]";
			mes "�����A�Ō�̒T�����c�c�B";
			mes "����͂��������Ȃ��Ă����B";
			mes "�悭�l���Ă��񂾂��A";
			mes "�������ږK�˂�������������";
			mes "�v�����񂾁B";
			next;
			cutin "Arquien_n_atnad01",2;
			mes "[�i�C��]";
			mes "�A�E���X����̘b�ł�";
			mes "�e���̓W���s���X�ɖӖړI��";
			mes "�����݂��Ă����炵���񂾂��c�c�B";
			mes "���͂Ȃ������������̂�";
			mes "�Ȃ�ƂȂ����R��";
			mes "�킩��悤�ȋC������񂾁B";
			next;
			cutin "Arquien_n_atnad02",2;
			mes "[�i�C��]";
			mes "�E�F���X�A�������[���R�[�h�A";
			mes "�����ɂ��������R�[�h�v���C���[�c�c�B";
			mes "����ɁA�������[���R�[�h��";
			mes "�A�g�i�h�Ƃ������t�c�c�B";
			if(VER_1QUE >= 37)
				mes "�����ă��b�P���x���ł̂��̘b�B";
			next;
			mes "[�i�C��]";
			mes "�e���c�c����A�����Ȃ�ƂȂ�";
			mes "�������Ă����񂶂�Ȃ����ȁB";
			mes "�����Ǝ��g�̃��[�c��T������";
			mes "�������Ă����񂾁B";
			next;
			cutin "Arquien_n_atnad03",2;
			mes "[�i�C��]";
			mes strcharinfo(0)+ "�A";
			mes "�N�̂������ŕ���";
			mes "�b���C�����������o�Ă�����B";
			mes "���肪�Ƃ��B";
			close2;
			cutin "Arquien_n_atnad03",255;
			end;
		case 3:
			cutin "Arquien_n_atnad01",2;
			mes "[�i�C��]";
			mes "���͉ɂ���Ȃ��񂾁B";
			mes "���O���ɂȂ�";
			mes "�N������`���Ă���񂾂ȁB";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
	default:
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�����A�N���B";
		mes "���͂�����Ƃ������@�ɂ����������B";
		mes "�v��������Ȃ�";
		mes "�y���c�̎������Řb���������B";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	}
}
verus04.gat,170,150,3	script	���R�[�h�v���C���[#e152	844,{/* 59505 */
	function memoryrecordplayer {
		mes "�]�������[���R�[�h�ɋL�^���ꂽ";
		mes "�@���������Đ����܂��]";
		next;
		if(getarg(0) == 1) {
			switch(getarg(1)) {
			case 7:
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]����32����";
				mes "�@�����L�^���Z�E�A�g�i�h�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�����������̃G�i�W�[������";
				mes "�@�~�܂��Ă��Ȃ��]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]��̎����ɎQ������";
				mes "�@�����������̐����́c�c�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]���݁A���ƌq�������V�X�e����";
				mes "�@���̔����ȊO�͕�����Ȃ��]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�L��ƌ������͔����̏Ռ��g��";
				mes "�@�ꕔ�{�݂���ꂽ��";
				mes "�@�傫�Ȕ�Q�͂Ȃ��]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�c�c�������A����������";
				mes "�@�قǋ߂��ꏊ�ɂ���";
				mes "�@�������Ǝs�������́A";
				mes "�@�����̏Ռ��g�̉e���ő������S�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]���݁A�������̎{�݂𗘗p����";
				mes "�@�T���^�E�F���X�M�A��";
				mes "�@���쒆�ł���]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�E�F���X�V�e�B�̎哮�͂�";
				mes "�@�~�܂����̂ŁA";
				mes "�@�⏕�G�i�W�[�L���[�u���g�p����";
				mes "�@�ŏ����̎{�݂̂ݎg�p�����]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�������̊u�ǂ̌�������";
				mes "�@���ς�炸�G�i�W�[�X�g�[���ɂ����";
				mes "�@�ڋߕs�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�s�s�ŌǗ����ꂽ���Ƃɔ�ꂽ";
				mes "�@�������������^�C���X���b�v�Ɋւ���";
				mes "�@�������J�n�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�c�c�o�邱�Ƃ��o���Ȃ�";
				mes "�@���̕�̒��ŁA";
				mes "�@���Ԃ̉�A�𖲌���]^000000";
				break;
			}
		}
		else if(getarg(0) == 2) {
			switch(getarg(1)) {
			case 1:
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]���[�A���A���I";
				mes "�@�h���V�[�t�������X�ł��B";
				mes "�@�����̓��j�^�[���[���ɂ�";
				mes "�@�������[���R�[�h��";
				mes "�@�ЂƂE���܂����]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�������ɘ^�����ꂽ";
				mes "�@�u���b�N�{�b�N�X���ȁ`�H";
				mes "�@�Đ����Ă݂܂��I�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]���[�A�G�����������Ȃ��c�c";
				mes "�@�����H�@��������!?�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]���̌�������";
				mes "�@�����Ɠ��������ȁc�c�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]��x�����������Ƃ������̂�";
				mes "�@������Ɖ��������ȁc�c�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�c�c�����`�B";
				mes "�@����Ȃ����o���ɂ�";
				mes "�@�₽���}�X�e������";
				mes "�@����t���Ă������~���������ȁB";
				mes "�@�c�c�W�W�b�c�c�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]����H�@���ꂪ�S���H";
				mes "�@�����ǂ��̐��́c�c�B";
				mes "�@���������������I";
				mes "�@�v���o�����I";
				mes "�@���󕨂�a����";
				mes "�@�A���e�~�A����ł��ˁI�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�c�c�������B";
				mes "�@���̓��c�c�]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�c�c�J�`�����]^000000";
				break;
			case 15:
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�h���V�[�t�������X�ł��B";
				mes "�@�ł��鎖�͐��󂾂���";
				mes "�@�h���V�[�ł��]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�������玄�������Ă���󕨂ŁA";
				mes "�@�����ɐ�����l�����̎p��";
				mes "�@�c�����Ǝv���܂��]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�����ɂ͑����̐l���������܂��B";
				mes "�@�܂������Ă��܂��]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]��������̐l�����̘b��";
				mes "�@�c�����炢���ł��ˁ]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]�������̎p��";
				mes "�@�N�����m���Ă���鎖���A";
				mes "�@�Y��Ȃ��ł��Ă���鎖��";
				mes "�@�肢�܂��]^000000";
				next;
				mes "[���R�[�h�v���C���[]";
				mes "^0000FF�]����ł́c�c�B";
				mes "�@�N����C���^�r���[��";
				mes "�@���Ă݂悤���ȁH�]^000000";
				break;
			}
		}
		next;
		mes "�]�������[���R�[�h�ɋL�^���ꂽ";
		mes "�@���ׂẲ��������Đ����܂����]";
		next;
		misceffect 234, "���R�[�h�v���C���[#e152";
		mes "�]�������[���R�[�h��";
		mes "�@���o��������ƁA�����ȉ��Ƌ���";
		mes "�@�A�����ʂ�����";
		mes "�@����������Ԃɖ߂��Ă��܂����]";
		return;
	}

	switch(VER_1QUE) {
	case 25:
		mes "�]�������[���R�[�h�ɋL�^���ꂽ";
		mes "�@���������Đ����܂��]";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�W�b�c�c�W�W�W�c�c�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�W�c�c�����I�@������Ă񂾁H";
		mes "�@���̘b�𕷂��Ă���̂��H�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�����Ă����[���e���B";
		mes "�@�����I�@���O�̐���������";
		mes "�@���܂�������Ȃ����I�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�����H�@�^�����Ă��̂��H";
		mes "�@���̂��߂ɁH�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�^�e�B�I�ւ̃��b�Z�[�W���c�c";
		mes "�@�W�W�c�c���悤��";
		mes "�@�ݒu���Ă���񂾂��ǁB";
		mes "�@���c�c�W�c�c�Ȃ��Ă��܂��ȁ]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�͂͂͂́I�@����Ȏ������Ȃ�āA";
		mes "�@����ς�A�g�i�h�c�c���ȁI�]^000000";
		next;
		mes "[�i�C��]";
		mes "�c�c�A�g�i�h�H";
		cutin "Arquien_n_atnad01",2;
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�W�W�b�c�c�]^000000";
		cutin "Arquien_n_atnad01",255;
		next;
		mes "�]�������[���R�[�h�ɋL�^���ꂽ";
		mes "�@���ׂẲ��������Đ����܂����]";
		set VER_1QUE,26;
		delquest 7646;
		setquest 7653;
		setquest 118206;
		close;
	case 31:
		if(checkitemblank() == 0) {
			// TODO
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�i�s�ł��܂���B";
			mes "�@��ސ������炵�Ă��������]";
			close;
		}
		memoryrecordplayer 2,1;
		getitem 22691,1;
		set VER_1QUE,32;
		delquest 7646;
		setquest 7651;
		setquest 118206;
		setquest 118150;
		compquest 118150;
		close;
	default:
		if(VER_1QUE < 33) {
			cutin "Arquien_n_atnad01",2;
			mes "[�i�C��]";
			mes "����ɐG��ȁB";
			mes "�Â��@�B���A��ꂽ�獢��B";
			close2;
			cutin "Arquien_n_atnad01",255;
			end;
		}
		mes "�]���R�[�h�v���C���[������B";
		mes "�@����ŏW�߂�^ff0000�������[���R�[�h^000000��";
		mes "�@�Đ��ł��������]";
		set '@str$,"�Đ�����";
		if(checkquest(7654) || checkquest(7655))
			set '@str$,"�Đ�����@(^FF0000��V�󂯎��\^000000)";
		next;
		switch(select('@str$,"�Đ������𕷂�","��߂�")) {
		case 1:
			if(checkquest(7654)) {
				memoryrecordplayer 1,7;
				next;
				cutin "Arquien_n_atnad01.bmp", 2;
				mes "[�i�C��]";
				mes "�܂����ꂽ���B";
				mes "����ʓ|������������j�Ђ��ȁB";
				mes "�킴�Ƃ����������ɍ�����̂��H";
				next;
				mes "[�i�C��]";
				mes "������͉Ȋw�̒m����";
				mes "�����L�΂��r���������̂ɁA";
				mes "�ǂ����Ă���ȃ��m��������񂾁H";
				mes "����Ƃ��܂�";
				mes "�������e�̂��̂����邪�c�c�B";
				next;
				mes "[�i�C��]";
				mes "�N���ɉߋ��̎���m���";
				mes "��������Ă���C�����B";
				next;
				setquest 7650;
				delquest 7650;
				delquest 7654;
				setquest 7651;
				getitem 6962, 1;
				cutin "Arquien_n_atnad03.bmp", 2;
				mes "[�i�C��]";
				mes "�Ƃɂ������̓��e�͎������ɓn���B";
				mes "����������J�������B";
				setquest 118136;
				compquest 118136;
				close2;
				cutin "Arquien_n_atnad03.bmp", 255;
				end;
			}
			else if(checkquest(7655)) {
				memoryrecordplayer 2,15;
				next;
				cutin "Arquien_n_atnad01.bmp", 2;
				mes "[�i�C��]";
				mes "�܂����ꂽ���B";
				mes "����ʓ|������������j�Ђ��ȁB";
				mes "�킴�Ƃ����������ɍ�����̂��H";
				next;
				mes "[�i�C��]";
				mes "������͉Ȋw�̒m����";
				mes "�����L�΂��r���������̂ɁA";
				mes "�ǂ����Ă���ȃ��m��������񂾁H";
				mes "����Ƃ��܂�";
				mes "�������e�̂��̂����邪�c�c�B";
				next;
				mes "[�i�C��]";
				mes "�N���ɉߋ��̎���m���";
				mes "��������Ă���C�����B";
				next;
				delquest 5341;
				delquest 5370;
				setquest 7652;
				delquest 7652;
				delquest 7655;
				setquest 7653;
				getitem 6962, 1;
				getitem 22692, 1;
				cutin "Arquien_n_atnad03.bmp", 2;
				mes "[�i�C��]";
				mes "�Ƃɂ������̓��e�͎������ɓn���B";
				mes "����������J�������B";
				setquest 118164;
				compquest 118164;
				close2;
				cutin "Arquien_n_atnad03.bmp", 255;
				end;
			}
			mes "�]�Đ����鏀�����o���Ă��Ȃ��]";
			close;
		case 2:
			mes "�]�ǂ����^ff0000�������[���R�[�h^000000��";
			mes "�@�Đ������𕷂������H�]";
			next;
			switch(select("�������̃������[���R�[�h","�������̃������[���R�[�h","��߂�")) {
			case 1:
				switch(select(
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
						(checkquest(118136)&8? "^0000ff���Z�̋L�^�@32����^000000": "^808080���J��^000000"),
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"��߂�"))
				{
				default:
					mes "�]���J���̗����ł��B";
					mes "�@���̗�����I�����Ă��������]";
					close;
				case 20:
					mes "�]���̏�𗣂ꂽ�]";
					close;
				}
			case 2:
				switch(select(
						(checkquest(118150)&8? "^0000ff�h���V�[�ƃ������[���R�[�h^000000": "^808080���J��^000000"),
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
						(checkquest(118164)&8? "^0000ff�C���^�r���A�[�h���V�[^000000": "^808080���J��^000000"),
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"^808080���J��^000000",
								"��߂�"))
				{
				case 1:
					memoryrecordplayer 1;
					close;
				default:
					mes "�]���J���̗����ł��B";
					mes "�@���̗�����I�����Ă��������]";
					close;
				case 24:
					mes "�]���̏�𗣂ꂽ�]";
					close;
				}
			case 3:
			}
		case 3:
			mes "�]���̏�𗣂ꂽ�]";
			close;
		}
	}
}

lhz_in01.gat,277,234,3	script	���b�P���x���K�[�h#e152	868,{/* 59959 */
	if(VER_1QUE < 34) {
		mes "[���b�P���x���K�[�h]";
		mes "�\���󂲂����܂��񂪁A";
		mes "������������";
		mes "���ʂ����邱�Ƃ��ł��܂���B";
		close;
	}
	mes "[���b�P���x���K�[�h]";
	mes "�A�g�i�h���@�c�̕��ł��ˁB";
	mes "���ɂ��ē����܂��B";
	close2;
	warp "lhz_in01.gat",275,241;
	end;
}
lhz_in01.gat,276,238,0	warp	in_to_out#e152i02	1,1,lhz_in01.gat,276,230

lhz_in01.gat,270,257,4	script	���b�P���x���#e152i0	10085,{/* 59961 */
	if(VER_1QUE == 34) {
		cutin "ep15_rekenber01",0;
		mes "[���b�P���x���]";
		mes "�悤������������Ⴂ�܂����B";
		mes "�������b�P���x���̉�ł��B";
		mes "�͂�΂邲���J�����������ӂ��܂��B";
		next;
		mes "[���b�P���x���]";
		mes "�A�g�i�h���@�c�݂̂Ȃ���̊����";
		mes "���̎��ɂ��͂��Ă��܂���B";
		mes "���Ȃ����̂悤�Ȕ��@�c��";
		mes "���͂��Ă��������Č��h�ł��B";
		next;
		mes "[���b�P���x���]";
		mes "�����݂Ȃ�������Ăт������R�́c�c";
		mes "�c���ł���C�A�����m��";
		mes "���@���ł��傤�B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�B";
		next;
		cutin "ep15_rekenber01",0;
		mes "[���b�P���x���]";
		mes "�ŋ߁A�݂Ȃ��񂪎��W�ɗ͂����Ă���";
		mes "�������[���R�[�h�ɂ��Ăł��B";
		next;
		mes "[���b�P���x���]";
		mes "�������[���R�[�h�̒����œ���";
		mes "��؂̏������J�����A";
		mes "�����ɂ��Ă������������B";
		next;
		menu "�ǂ��������Ƃł����H",-;
		mes "[���b�P���x���]";
		mes "�������[���R�[�h�̓��e��";
		mes "�O���ɍL�߂Ȃ��ŗ~�����ƌ������ł��B";
		mes "�]���Ă���������̂ł���΁A";
		mes "���ʂȑҋ������񑩂��܂��傤�B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���ʂȑҋ��H";
		mes "�c�c�������ł���񂾁H";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�y�̒��ɖ��܂��Ă���s�s�̉ߋ���";
		mes "��X�ȊO�̐l�X��";
		mes "�m���Ă͂Ȃ�Ȃ����R�͉��Ȃ񂾁H";
		mes "�[���������悤�A�������Ă��炨���B";
		next;
		cutin "ep15_tatio01",0;
		mes "[��Ȕ鏑��]";
		mes "���s���Ă����Ƃ�";
		mes "��߂Ȃ����Ƃ������ł͂���܂���B";
		mes "���������p�����Ȃ�����";
		mes "�������ł�����܂���B";
		next;
		mes "[��Ȕ鏑��]";
		mes "�������[���R�[�h�̓��e�c�c";
		mes "���@�����Ǝv���܂����A";
		mes "����ɂ̓E�F���X�V�e�B��";
		mes "�ߋ��̋L�^���c����Ă��܂��B";
		next;
		mes "[��Ȕ鏑��]";
		mes "���̓��e���ߋ���R�����A";
		mes "���j��傫���ς�����e�ł��邱�Ƃ�";
		mes "�ԈႢ����܂���B";
		next;
		mes "[��Ȕ鏑��]";
		mes "�Ȋw�̔��W��l�ނ̐i���̂��߂�";
		mes "�������[���R�[�h�̓��e��";
		mes "���ԂɌ��\���鎖��";
		mes "�K�v�Ȏ����Ǝv���܂��B";
		mes "�������A����͎��l�ɂƂ��Ă��A";
		mes "��؂Ȃ��̂Ȃ̂ł��B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�l�I�ɑ�؂Ȃ��́H";
		mes "���̃������[���R�[�h���A���H";
		next;
		cutin "ep15_tatio01",0;
		mes "[��Ȕ鏑��]";
		mes "�����B";
		mes "�������[���R�[�h���ł����A";
		mes "����ɋL���ꂽ�L�^��";
		mes "���̂ƂĂ���؂Ȃ��̂Ȃ̂ł��B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�L�^���H";
		mes "�ǂ����������H";
		next;
		cutin "ep15_tatio01",0;
		mes "[��Ȕ鏑��]";
		mes "����ǂ��Ă��b���܂��傤�B";
		mes "�܂��A���Ƃ��Ȃ��͉ߋ���";
		mes "��x������Ă��܂��B";
		mes "�v���o���܂��񂩁H";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���������΂ǂ�����";
		mes "�������Ƃ���悤�Ȋ炾�Ǝv�������c�c";
		mes "�W���s���X���ȁI";
		mes "�����A�W���s���X�Ō����o�������邼�I";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���̎��A�m���c�c";
		mes "�ʘH�̂悤�Ɍ����鏊�Łc�c";
		mes "�c�c�����U�����Ă����j�I";
		mes "���A���O�́c�c���܂��̂����Łc�c�I";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�C�A���A�����v���o�����̂ł���!?";
		mes "���̎��̂��Ȃ��̉����";
		mes "���̂ł͂Ȃ������̂ł���!?";
		next;
		menu "�Ȃɂ��������́H",-;
		mes "[�A�E���X]";
		mes "���������ȑO�A";
		mes "�W���s���X�𒲍����Ă������̎��ł��B";
		next;
		mes "[�A�E���X]";
		mes "�������������ƌ�����";
		mes "�o�čs�����C�A�����A";
		mes "��T�Ԃ��߂��Ă��߂炸�A";
		mes "�c���݂�ȂŕK���ɒT��������";
		mes "�W���m�[�̗��قŏ��𕉂���";
		mes "�x��ł���Ƃ���𔭌������̂ł��B";
		emotion 0,"�c���A���N�C�G��#ep152i";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ��������W���m�[�ɂ���̂��A";
		mes "�ǂ�قǎ��Ԃ��߂��Ă�������";
		mes "������Ȃ������B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�C�A���͋L�����������Ă��̂ŁA";
		mes "���̂��N���A����������C�A����";
		mes "�e�؂ȕ������ق܂�";
		mes "�^��ł�����������";
		mes "�Еt���邵���Ȃ������̂ł��B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���m�Ɏv���o���Ȃ�";
		mes "���̎��̋L���̂����Łc�c";
		mes "���͋������悤��";
		mes "�L���̕Ћ��Ɏc����";
		mes "�W���s���X�ɂ����݂�����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�W���s���X�łȂ�A";
		mes "�Ȃ������L�������߂����Ƃ��ł���A";
		mes "���̏ő�����}���邱�Ƃ��ł���ƁB";
		mes "�c�c���ɉƑ���";
		mes "�A��ׂ��Ƃ��������Ƃ�������";
		mes "�Y���قǂɂȁB";
		next;
		cutin "ep15_tatio03",0;
		mes "[��Ȕ鏑��]";
		mes "�c�c����͐\���󂠂�܂���ł����B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���̎��A�����U�����Ă����̂�";
		mes "���O�Ȃ񂾂ȁH";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[�i�C��]";
		mes "�c�c�Ȃ����H";
		mes "��Ȕ鏑���ǂ́B";
		mes "�Ȃ��������t����K�v���������H";
		next;
		cutin "ep15_tatio03",0;
		mes "[��Ȕ鏑��]";
		mes "����́c�c";
		mes "���̎��A���m�͌��Ă͂Ȃ�Ȃ����̂�";
		mes "���Ă��܂�������ł��B";
		mes "���̎��E�F���X�V�e�B��";
		mes "�܂���������Ă�";
		mes "�����܂���ł�������B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�E�F���X�V�e�B�c�c����!?";
		mes "���̎��������������̂�";
		mes "�E�F���X�V�e�B�ւȂ���";
		mes "�ʘH�������Ƃ������ƂȂ̂�?!";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�Ȃ�Ƃ��������c�c";
		mes "�����E�F���X�V�e�B�𔭌����Ă���?!";
		mes "���̂����ŋL���������ꂽ�c�c?!";
		mes "��̂ǂ��������Ȃ�?!";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�ʖڂ��A�������Ă���ȁB";
		mes "�����������鎞�Ԃ�����Ȃ����H";
		next;
		cutin "ep15_tatio01",0;
		mes "[��Ȕ鏑��]";
		mes "������܂����B";
		mes "���������̂������͂���܂���B";
		mes "�����x�e�������܂��傤�B";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[�i�C��]";
		mes "�c�c������B";
		mes "���������b���������c�c�B";
		next;
		cutin "Arquien_n_atnad02",255;
		mes "�]�����N���Ă���̂��������悤�B";
		mes "�@�܂��̓C�A�����i�C����";
		mes "�@�b�������Ă݂悤�]";
		set VER_1QUE,35;
		delquest 7656;
		setquest 118215;
		close;
	}
	else if(VER_1QUE == 35) {
		cutin "ep15_rekenber02",0;
		mes "[���b�P���x��]";
		mes "���������̂������͂���܂���B";
		mes "�����x�e�������܂��傤�B";
		next;
		cutin "ep15_rekenber02",255;
		mes "�]�����N���Ă���̂��������悤�B";
		mes "�@�܂��̓C�A�����i�C����";
		mes "�@�b�������Ă݂悤�]";
		close;
	}
	else if(VER_1QUE == 36 || VER_1QUE == 37) {
		cutin "ep15_rekenber01",0;
		mes "[���b�P���x��]";
		mes "���X��Ƃ����̂�";
		mes "�����������ɂ����Ƃ���E�Ƃł��B";
		mes "�c�c����Ȃ��̂ł��B";
		close2;
		cutin "ep15_rekenber01",255;
		end;
	}
}
lhz_in01.gat,267,257,5	script	��Ȕ鏑��#e152i01	10084,{/* 59962 */
	if(VER_1QUE == 34) {
		cutin "ep15_tatio01",0;
		mes "[��Ȕ鏑��]";
		mes "��l�͒������ԑ҂��Ă��܂����B";
		mes "�����ł��B";
		close2;
		cutin "ep15_tatio01",255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "ep15_tatio01",0;
		mes "[��Ȕ鏑��]";
		mes "�����x�e�������܂��傤�B";
		mes "�ǂ������Ȃ����x��ł��������B";
		mes "�ς���b������ł��傤���B";
		mes "���͂����ł��҂����Ă��܂��ˁB";
		next;
		cutin "ep15_tatio03",255;
		mes "�]�����N���Ă���̂��������悤�B";
		mes "�@�܂��̓C�A�����i�C����";
		mes "�@�b�������Ă݂悤�]";
		close;
	}
	else if(VER_1QUE == 36) {
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���󂯎�낤�]";
			close;
		}
		cutin "ep15_tatio01",0;
		mes "[��Ȕ鏑��]";
		mes "���҂����������܂����B";
		mes "�b�̑������������܂��傤�B";
		mes "�c�c�b������ׂ�";
		mes "���̐��̂𖾂����܂��B";
		next;
		mes "[�^�e�B�I]";
		mes "���̓E�F���X�V�e�B��";
		mes "�Ō�̐����҂ł���";
		mes "�^�e�B�I.W.00H-1�Ɛ\���܂��B";
		mes "�Ăт₷���悤��";
		mes "�^�e�B�I�ƌĂ�ł��������B";
		next;
		mes "[�^�e�B�I]";
		mes "�������[���R�[�h�̓��e��";
		mes "���\�������Ȃ����R�c�c";
		mes "���̎��A�W���s���X��";
		mes "�C�A�����m���U���������ƁB";
		mes "���ׂĎ����]��ł�������Ƃł��B";
		donpcevent "�C�A���E�A�g�i�h#ep152i::OnTalk1";
		next;
		cutin "ep15_tatio02",0;
		mes "[�^�e�B�I]";
		mes "�݂Ȃ��񂪔��������������[���R�[�h��";
		mes "�L�^����Ă���^�e�B�I�͂��̎��ł��B";
		mes "�����ă������[���R�[�h��";
		mes "�L�^����Ă���A�g�i�h�́A";
		mes "�C�A�����m�̑\�c���ł���";
		mes "���Z�E�A�g�i�h���ł��B";
		next;
		cutin "ep15_tatio03",0;
		mes "[�^�e�B�I]";
		mes "�C�A�����m�A���̃A���N�C�G������A";
		mes "���Ȃ����͂��@���̒ʂ�A";
		mes "�E�F���X�̖��̎q���ł��B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c��͂肻�����B";
		mes "�������E�F���X�́A";
		mes "�y�������ߋ��ɑ��݂����s�s���B";
		mes "�Ȃ����̎���̐l�Ԃ������Ă���!?";
		next;
		cutin "ep15_tatio02",0;
		mes "[�^�e�B�I]";
		mes "���͓����̃E�F���X��";
		mes "�Ȋw�Z�p��ǋ����������";
		mes "�팱�҂Ƃ��Ď����ɎQ�����Ă��܂����B";
		mes "���x���������J��Ԃ������ʁA";
		mes "�����鎖�̂Ȃ��̂ƂȂ�";
		mes "�������ɑ��݂��Ă��܂��B";
		next;
		cutin "ep15_tatio03",0;
		mes "[�^�e�B�I]";
		mes "���Z�͎���������Ȋw�҂̈�l�ŁA";
		mes "���̉i���̗F�B�ł��B";
		mes "�̋��ł���A�F�B�Ƃ̎v���o�������c��";
		mes "�E�F���X�V�e�B����肽���āA";
		mes "���̎��C�A�����m�Ɋ�Q������";
		mes "���̏ꂩ�牓�������̂ł��B";
		next;
		mes "[�^�e�B�I]";
		mes "�C�A�����m���������̂��B�����Ƃ��āA";
		mes "�����L�������삵�āc�c";
		mes "�E�F���X�V�e�B�Ɋւ��邱�Ƃ�";
		mes "�Y��Ă��������܂����B";
		next;
		cutin "ep15_tatio01",0;
		mes "[�^�e�B�I]";
		mes "���̂����ŃC�A�����m��";
		mes "��T�Ԃ̋L����";
		mes "�����Ă���̂��Ǝv���܂��B";
		next;
		cutin "ep15_tatio02",0;
		mes "[�^�e�B�I]";
		mes "���̎��A�C�A�����m��";
		mes "���Z�̎q�����Ƃ킩���Ă�����";
		mes "����Ȏ��͂��Ă��Ȃ������ł��傤�B";
		next;
		cutin "ep15_tatio01",0;
		mes "[�^�e�B�I]";
		mes "�E�F���X�V�e�B��";
		mes "�ƂĂ��c�c�ƂĂ��̂�";
		mes "�W���s���X�ƌ�����ׂ�قǂ�";
		mes "����A����ȏ�̉Ȋw������������";
		mes "����ȉȊw�s�s�ł����B";
		next;
		mes "[�^�e�B�I]";
		mes "�s���̎��̂ŖłтĂ��܂��܂������A";
		mes "�@�B�ō��ꂽ����";
		mes "���ʂ��ƂȂ��A";
		mes "�����v���o�̃E�F���X�V�e�B��";
		mes "����Ă����̂ł��B";
		next;
		cutin "ep15_tatio03",0;
		mes "[�^�e�B�I]";
		mes "���N���A���\�N���A���S�N���c�c�B";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�Ȃ�Ƃ������Ƃ��c�c";
		mes "���̘b�A��͒m���Ă���̂��H";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "����A����Ȃ��Ă����B";
		mes "���łɒm���Ă���̂��낤�B";
		mes "�����玄������";
		mes "�����֌Ă񂾂̂ł͂Ȃ��̂��B";
		next;
		cutin "ep15_tatio01",0;
		mes "[�^�e�B�I]";
		mes "�����ł��B";
		mes "���ƃE�F���X�V�e�B�̔閧��";
		mes "����m���Ă�����e�ł��B";
		mes "���̐��ł�������l������";
		mes "�m���Ă����閧�ł��B";
		next;
		mes "[�^�e�B�I]";
		mes "�����A�Ⴂ�܂��ˁB";
		mes "�ݗ��҂̈�l�ł���A";
		mes "�[�j�b�g�E�[���e�����q�^����";
		mes "�m���Ă�����e�ł��B";
		mes "�ނ���͂�A�E�F���X�V�e�B��";
		mes "�q���̈�l�ł�����B";
		next;
		cutin "ep15_tatio02",0;
		mes "[�^�e�B�I]";
		mes "�c�c�����E�F���X�V�e�B�̏ڍׂ��A";
		mes "�������[���R�[�h�̓��e���A";
		mes "���J���ė~�����Ȃ����R�B";
		mes "�킩���Ă��������܂������H";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���J���ꂽ�Ƃ��Ă��A";
		mes "�E�F���X�V�e�B��";
		mes "�N�̎�肽�����́c�c�Ƃ����킯���B";
		mes "���Ƀ������[���R�[�h�̓��e��";
		mes "�ނ炩��N�ւ̃��b�Z�[�W������ȁB";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������A����Ȃ�";
		mes "�s�s�̑��̎����͖��Ȃ��̂��H";
		mes "�N�⎄�̖��O�����������";
		mes "���グ��ꂽ�獢��󋵂�����";
		mes "�B�����Ƃ��Ă���񂾂�H";
		next;
		cutin "ep15_tatio01",0;
		mes "[�^�e�B�I]";
		mes "���̐��E�̕����ƍ���Ȃ�";
		mes "����I�Ȑ����̊j�S�Z�p��";
		mes "���łɔp�����ꂽ��Ԃł��B";
		next;
		mes "[�^�e�B�I]";
		mes "�啔���̎����́A";
		mes "���̂ŏĎ����Ă��܂��܂������c�c";
		mes "���ݎc���Ă�����̂����ł�";
		mes "�����̏󋵂�m�蓾��";
		mes "�\���ȍޗ��ɂȂ�ł��傤�B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "����ȂɉB���Ă��������Ȃ�A";
		mes "���b�P���x���ƌN��";
		mes "�ǂ����ăE�F���X�V�e�B�̎���";
		mes "���J�����񂾁H";
		mes "�Ȃ��A�t�@���^�X�}�S���J�v��Ȃǂ�";
		mes "�l����A�����������񂾁B";
		next;
		cutin "ep15_tatio01",0;
		mes "[�^�e�B�I]";
		mes "�����ɘb���܂��ƁA���ŋ߂܂�";
		mes "�������̃G�i�W�[�X�g�[���̂�����";
		mes "�����ߊ�鎖���ł��Ȃ������̂ł��B";
		next;
		mes "[�^�e�B�I]";
		mes "���R�͕�����܂��񂪁A";
		mes "�Ȃ������̃G�i�W�[�X�g�[����";
		mes "�������̂ŁA�댯���������Ȃ����Ƃ���";
		mes "���f�����������Ƃ�����܂��B";
		next;
		mes "[�^�e�B�I]";
		mes "�����Ă��̐��E��";
		mes "�Ȋw��H�w�ւ̗������i�݁A";
		mes "�E�F���X�V�e�B�̋Z�p��m���Ă�";
		mes "�댯�ł͂Ȃ��ƍl���܂����B";
		next;
		mes "[�^�e�B�I]";
		mes "�߂����Z�p�͐l�Ԃ�łڂ����˂܂���B";
		mes "�q���̎��";
		mes "��������点�Ȃ��̂Ɠ����悤�ɁA";
		mes "���͋@����f���Ă����̂ł��B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c���ׂĔ[�������킯�ł͂Ȃ����A";
		mes "������������B";
		next;
		cutin "ep15_tatio01",0;
		mes "[�^�e�B�I]";
		mes "���������������A";
		mes "���肪�Ƃ��������܂��B";
		mes "���񑩒ʂ�A�������[���R�[�h��";
		mes "�����ɑ΂���Ɛ茠��";
		mes "�A�g�i�h���@�c�ɍ����グ�܂��B";
		next;
		mes "[�^�e�B�I]";
		mes "���������̌��J��J�����e��";
		mes "������Ō���v���܂��B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�킩�����B";
		mes "�������[���R�[�h�̒�����";
		mes "���܂łƓ��l�ɕ񍐂���B";
		mes "���̏��̌��J�͌N��ɔC����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "����ł����񂾂�H";
		next;
		cutin "ep15_tatio01",0;
		mes "[�^�e�B�I]";
		mes "�͂��B���肪�Ƃ��������܂��B";
		next;
		mes "[�^�e�B�I]";
		mes "�������[���R�[�h�ɋL�^���ꂽ���e�́A";
		mes "���ɂ͂��ׂđ厖�Ȏv���o�Ȃ̂ł��B";
		mes "�����A�܂�œ��L������悤�ȁc�c�B";
		mes "�ł��̂ł��ꂩ���";
		mes "�񍐂����҂����Ă��܂���B";
		next;
		cutin "verus_ian04",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�܂������B";
		mes "�\�c���̗F�l�Ƃ����҂�";
		mes "���b�̂����郄�c���ȁB";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���āA�b�͍ς񂾁B";
		mes "����͖߂��č�Ƃ̑��������悤�B";
		mes "���O�����A�A�邼�B";
		next;
		cutin "verus_ian01",255;
		mes "�]�Ȃ𗧂��A";
		mes "�@�A��x�x������C�A����";
		mes "�@�����Řb�������Ă����]";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�c�c�[�������f�U������������A";
		mes "���͎��͂܂��D�ɗ����Ȃ�����������B";
		mes "�^�e�B�I�c�c���̒j�A";
		mes "�ق��ɂ��d�v�Ȏ����B���Ă���悤��";
		mes "�v���ĂȂ�Ȃ��B";
		next;
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���������ł��B";
		mes "�ނɂ͂܂������c�c";
		mes "�閧��A�B���Ă����]�̂悤�Ȃ��̂�";
		mes "�����܂��c�c�B";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�A�E���X�A���O�����B";
		mes "������������";
		mes "�N��̊��͈ĊO��������񂾁B";
		next;
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�t���c�c�B�܂������B";
		mes "���͒�����i�߂邱�Ƃ��ŗD�悾�B";
		mes "����͎����";
		mes "���ׂ����Ƃ���邾�����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������A" +strcharinfo(0)+ "�B";
		mes "���O�ɂ����n���Ă������B";
		mes "���@�̍Œ��Ɏ�ɓ��ꂽ���̂����A";
		mes "�ǂ����Ñ�̔R���̂悤���B";
		mes "�����Ɏg���邩�������B";
		mes "���O�͂���𒲂ׂĂ݂�B";
		set VER_1QUE,37;
		delquest 118220;
		setquest 201765;
		getitem 6962,20;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 1000000,0,1;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		getexp 0,500000,0;
		close2;
		cutin "verus_ian01",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "ep15_tatio03",0;
		mes "[�^�e�B�I]";
		mes "�����͂Ɋ��ӂ������܂��B";
		close2;
		cutin "ep15_tatio01",255;
		end;
	}
}
lhz_in01.gat,272,255,3	script	�C�A���E�A�g�i�h#ep152i	10056,{/* 59963 */
	if(VER_1QUE == 34) {
		cutin "verus_ian01.bmp", 2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������B";
		mes "�݂�ȏW�܂����悤���ȁB";
		mes "���̘b���킩���";
		mes "�Ƃ������b�𕷂��Ă݂邩�B";
		close2;
		cutin "verus_ian01.bmp", 255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�b�Ƃ͂Ȃ񂾁B";
		mes "�������������B";
		next;
		cutin "Arquien_n_atnad01",0;
		mes "[�i�C��]";
		mes "���A���̐l���b�����̂́A";
		mes "�����񂪎��H�������̘b�Ȃ̂��H";
		mes "���̘b�̋L���r�����A";
		mes "���N�Ԃ������";
		mes "�ق����܂���Ă��������Ȃ̂��H";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[�i�C��]";
		mes "���̈�T�Ԃ̋L���̂��߂�";
		mes "�����ƃW���s���X�̌������c�c";
		mes "���̂��߂ɁA";
		mes "����Ȏ��̂��߂ɁA";
		mes "���ƉƂ��̂Ă��̂�!?";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "����Ȃ��Ƃ���!?";
		mes "���̌����ɑ΂����M��";
		mes "����ȕ��Ɍ����̂͂�߂�I";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������Ĉ�l�̊w�҂ł���O��";
		mes "��l�̖��̕����B";
		mes "���������ɂ�����";
		mes "�v�����Ă����킯�ł͂Ȃ��B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "���O���̎莆�����ĉƂɑ������B";
		mes "����ɕԐM���Ȃ������̂�";
		mes "���O����Ȃ����I";
		next;
		cutin "Arquien_n_atnad04",0;
		mes "[�i�C��]";
		mes "�������炻���ɁI";
		mes "�莆�Ȃ�Ă��̂͌��Ă��Ȃ��I";
		mes "�ǂ����A�����Ƃ������������";
		mes "�������񂾂낤�H";
		mes "����Ȃ̓͂��킯�Ȃ�����Ȃ����I";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���܂�������ɉƂ𔄂����������낤�I";
		mes "�����������N�A�䖝�ł�����";
		mes "������J���Ď�ɓ��ꂽ�Ƃ𔄂���";
		mes "�s��������܂��Ȃ�āA";
		mes "�킪�܂܂ɂ��������邾�낤�I";
		next;
		mes "�]���s���̌��������������Ă���B";
		mes "�@�A�E���X�Ǝ�Ȕ鏑����";
		mes "�@��������ł���������Ă���]";
		next;
		menu "�Ƃ肠�����b�̑����𕷂��܂��񂩁H",-;
		cutin "Arquien_n_atnad02",0;
		mes "[�i�C��]";
		mes "�ށc�c�m���ɂ������ȁc�c�B";
		mes "�ƁA�Ƃɂ������̎����̌����́A";
		mes "�������ɂ����Ȕ鏑���a��";
		mes "����񂾂낤�H";
		mes "�ڂ����b�𕷂�������Ȃ����B";
		set VER_1QUE,36;
		delquest 118215;
		setquest 118220;
		close2;
		cutin "Arquien_n_atnad02",255;
		end;
	}
	else if(VER_1QUE == 36) {
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����c�c�B";
		mes "�����M���Ȃ��đ�l���Ȃ��ȁc�c�B";
		mes "�ǂ����Ď����U�������̂��A";
		mes "�ނɏڂ����b�𕷂����B";
		mes "�������Ƒ��̘b�������͂��̌ゾ�B";
		close2;
		cutin "verus_ian01",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���ɂ͂��̎v�f��";
		mes "����̂��낤���A";
		mes "����͎����";
		mes "���ׂ����Ƃ���邾�����B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "�����A�A�邼�B";
		mes "�߂��č�Ƃ̑��������悤�B";
		next;
		if(select("�������������ɂ���","�A��") == 1) {
			mes "[�C�A���E�A�g�i�h]";
			mes "�Ȃ񂾁H�@�܂������ɋ���̂��H";
			mes "�p��������Ȃ�";
			mes "�������ƏI��点��񂾁B";
			close2;
			cutin "verus_ian01",255;
			end;
		}
		mes "[�C�A���E�A�g�i�h]";
		mes "�킩�����B";
		mes "�ł́A�A�낤�B";
		close2;
		cutin "verus_ian01",255;
		warp "verus04.gat",142,188;
		end;
	}
OnTalk1:
	unittalk "�C�A���E�A�g�i�h : !?";
	end;
OnTalk2:
	unittalk "�C�A���E�A�g�i�h : ��q�Ȃ񂼂����I";
	end;
}
lhz_in01.gat,267,255,7	script	�A�E���X#ep152i01	10057,{/* 59964 */
	if(VER_1QUE == 34) {
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���܂������B";
		mes "�b���n�܂�܂ŏ����҂��܂��傤�B";
		next;
		mes "[�A�E���X]";
		mes "���̓�l���ꏏ�ɂ���Ƃ��������̂�";
		mes "�v���Ԃ�ł��ˁB";
		mes "���̓�l�͖{���ɂ������肾�B";
		close2;
		cutin "verus_aures",255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "���b�P���x���Ђ�";
		mes "��������������Ƃ́c�c�B";
		close2;
		cutin "verus_aures",255;
		end;
	}
	else if(VER_1QUE == 36) {
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�Ƃ�ł��Ȃ��b�ł������A";
		mes "���̈ꌏ�ł��̐e�q�̍a��";
		mes "�����ł����܂�Ηǂ��ł��ˁB";
		next;
		mes "[�A�E���X]";
		mes "�C�A���͖{���͖��z���̕��Ȃ̂ł���B";
		mes "�����\�ɏo���̂�";
		mes "�p�������������Ȃ̂ł��B";
		close2;
		cutin "verus_aures",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "verus_aures",0;
		mes "[�A�E���X]";
		mes "�Ƃ�ł��Ȃ��b�ł������A";
		mes "���̈ꌏ�ł��̐e�q�̍a��";
		mes "�����ł����܂�Ηǂ��ł��ˁB";
		next;
		mes "[�A�E���X]";
		mes "�C�A���͖{���͖��z���̕��Ȃ̂ł���B";
		mes "�����\�ɏo���̂�";
		mes "�p�������������Ȃ̂ł��B";
		close2;
		cutin "verus_aures",255;
		end;
	}
}
lhz_in01.gat,272,251,3	script	�c���A���N�C�G��#ep152i	951,{/* 59965 */
	if(VER_1QUE == 34) {
		cutin "Arquien_n_atnad01",2;
		mes "[�i�C��]";
		mes "�ǂ�ȑ傰���Șb�����邽�߂�";
		mes "���������W�߂��̂�";
		mes "�����Ă݂悤����Ȃ����B";
		close2;
		cutin "Arquien_n_atnad01",255;
		end;
	}
	else if(VER_1QUE == 35) {
		cutin "verus_ian01",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�b�Ƃ͂Ȃ񂾁B";
		mes "�������������B";
		next;
		cutin "Arquien_n_atnad01",0;
		mes "[�i�C��]";
		mes "���A���̐l���b�����̂́A";
		mes "�����񂪎��H�������̘b�Ȃ̂��H";
		mes "���̘b�̋L���r�����A";
		mes "���N�Ԃ������";
		mes "�ق����܂���Ă��������Ȃ̂��H";
		next;
		cutin "Arquien_n_atnad02",0;
		mes "[�i�C��]";
		mes "���̈�T�Ԃ̋L���̂��߂�";
		mes "�����ƃW���s���X�̌������c�c";
		mes "���̂��߂ɁA";
		mes "����Ȏ��̂��߂ɁA";
		mes "���ƉƂ��̂Ă��̂�!?";
		next;
		cutin "verus_ian02",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "����Ȃ��Ƃ���!?";
		mes "���̌����ɑ΂����M��";
		mes "����ȕ��Ɍ����̂͂�߂�I";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "�������Ĉ�l�̊w�҂ł���O��";
		mes "��l�̖��̕����B";
		mes "���������ɂ�����";
		mes "�v�����Ă����킯�ł͂Ȃ��B";
		next;
		mes "[�C�A���E�A�g�i�h]";
		mes "���O���̎莆�����ĉƂɑ������B";
		mes "����ɕԐM���Ȃ������̂�";
		mes "���O����Ȃ����I";
		next;
		cutin "Arquien_n_atnad04",0;
		mes "[�i�C��]";
		mes "�������炻���ɁI";
		mes "�莆�Ȃ�Ă��̂͌��Ă��Ȃ��I";
		mes "�ǂ����A�����Ƃ������������";
		mes "�������񂾂낤�H";
		mes "����Ȃ̓͂��킯�Ȃ�����Ȃ����I";
		next;
		cutin "verus_ian03",2;
		mes "[�C�A���E�A�g�i�h]";
		mes "���܂�������ɉƂ𔄂����������낤�I";
		mes "�����������N�A�䖝�ł�����";
		mes "������J���Ď�ɓ��ꂽ�Ƃ𔄂���";
		mes "�s��������܂��Ȃ�āA";
		mes "�킪�܂܂ɂ��������邾�낤�I";
		next;
		mes "�]���s���̌��������������Ă���B";
		mes "�@�A�E���X�Ǝ�Ȕ鏑����";
		mes "�@��������ł���������Ă���]";
		next;
		menu "�Ƃ肠�����b�̑����𕷂��܂��񂩁H",-;
		cutin "Arquien_n_atnad02",0;
		mes "[�i�C��]";
		mes "�ށc�c�m���ɂ������ȁc�c�B";
		mes "�ƁA�Ƃɂ������̎����̌����́A";
		mes "�������ɂ����Ȕ鏑���a��";
		mes "����񂾂낤�H";
		mes "�ڂ����b�𕷂�������Ȃ����B";
		set VER_1QUE,36;
		delquest 118215;
		setquest 118220;
		close2;
		cutin "Arquien_n_atnad02",255;
		end;
	}
	else if(VER_1QUE == 36) {
		cutin "Arquien_n_atnad02",0;
		mes "[�i�C��]";
		mes "�������ɂ����Ȕ鏑���a��";
		mes "�ڂ����b�𕷂�������Ȃ����B";
		mes "�ǂ�ȗ��R�ł���A";
		mes "����[������������e�łȂ����";
		mes "�e�͂͂��Ȃ����ȁB";
		close2;
		cutin "Arquien_n_atnad02",255;
		end;
	}
	else if(VER_1QUE == 37) {
		cutin "Arquien_n_atnad02",2;
		mes "[�i�C��]";
		mes "���̃������[���R�[�h�ɂ�";
		mes "�v���o���Ԃ��Ă���񂾂ȁB";
		mes "����𒴂������L�c�c���B";
		next;
		cutin "Arquien_n_atnad03",2;
		mes "[�i�C��]";
		mes "�����A�A�邼�B";
		mes "�V��ł�ɂ͂Ȃ��񂾁B";
		mes "�������Ǝd���ɖ߂�B";
		close2;
		cutin "Arquien_n_atnad03",255;
		end;
	}
}

lhz_in01.gat,275,251,3	script	���[�N���t�F�Y#ep152i01	953,{/* 59966 */
	cutin "looke_rapez04",0;
	mes "[���[�N]";
	mes "�����ɂ͌�q�Ƃ��Ă����������B";
	close2;
	cutin "looke_rapez02",255;
	initnpctimer;
	end;
OnTimer200:
	donpcevent "�C�A���E�A�g�i�h#ep152i::OnTalk2";
	end;
OnTimer700:
	emotion 6,"�c���A���N�C�G��#ep152i";
	end;
OnTimer900:
	stopnpctimer;
	emotion 9,"���[�N���t�F�Y#ep152i01";
	end;
}

verus04.gat,91,252,5	script	�l�Êw��#tevt01	993,{/* 59277 */
	mes "[�l�Êw��]";
	mes "��������";
	mes "���ɂ͂�������ďW�܂��āA";
	mes "��񋤗L�̉���J���Ă��܂��B";
	close;
}

verus04.gat,89,251,5	script	���j�w��#tevt02	693,{/* 59279 */
	mes "[���j�w��]";
	mes "��Ƃɂ������Ă̐h�����Ƃł����H";
	mes "���܂ɂł����A�H����";
	mes "�ƂĂ��܂�����������܂��c�c�B";
	next;
	mes "[���j�w��]";
	mes "�E�F���X�V�e�B�ɗ��āA";
	mes "���ꂪ���̍ŏ��̎����ł����B";
	close;
}
verus04.gat,91,248,7	script	�V�Q���@�c��#tevt03	690,{/* 59280 */
	mes "[�V�Q���@�c��]";
	mes "�܂��m��Ȃ����������A";
	mes "�F�X�ƕ׋��������Ă��������Ă��܂��I";
	mes "�܂��͓����g�����A";
	mes "�̂��g���d�����撣�肽���ł��ˁB";
	next;
	mes "[�V�Q���@�c��]";
	mes "�����͂��т��A�������A�Q��ꏊ���A";
	mes "�����Ēm��������邩��";
	mes "�ō��̏ꏊ�ł��I";
	close;
}
verus04.gat,94,251,3	script	�����w��#tevt04	10003,{/* 59281 */
	mes "[�����w��]";
	mes "���͂������W���s���X�̈ꕔ����";
	mes "�l���Ă��܂������c�c";
	mes "����͊Ԉ���������̂悤��";
	mes "�C�����ĂȂ�܂���B";
	next;
	mes "[�����w��]";
	mes "�c�c���Ă���悤�ňႤ�B";
	mes "���ꂪ�����͂܂��킩��܂��񂪁B";
	close;
}
verus04.gat,94,248,1	script	�Ȋw��#tevt05	755,{/* 59282 */
	mes "[�Ȋw��]";
	mes "�����̋@�B�̔��W�͖{����";
	mes "�����قǑf���炵�����̂ł��B";
	mes "�����Ȃ閂�@���g�p���Ă��܂���B";
	next;
	mes "[�Ȋw��]";
	mes "�������Z�p���傫�����A";
	mes "�}�Ȕ��W�͐l�ɍ����������̂ł��B";
	mes "���̒n�������������̂ł��傤���B";
	close;
}
verus04.gat,135,213,4	script	���ĎD#EP15_1D��	857,{/* 59283 */
	mes "[���ӎ���]";
	mes "�E�F���X�V�e�B��";
	mes "�����K���������ɒ��ӎ�����";
	mes "���m�点���܂��B";
	next;
	mes "[���ӎ���]";
	mes "���݁A�ŖS�j�����c�Ɩ����";
	mes "�ߌ��ȋ��c���������ł��̂ŁA";
	mes "��Q�ɑ���Ȃ��悤�A";
	mes "���ӂ��ĉ������B";
	next;
	mes "[���ӎ���]";
	mes "������Q�ɑ���ꂽ����A";
	mes "��Q�����ڌ����ꂽ����";
	mes "�E�F���X�V�e�B�x�����܂�";
	mes "���A���������B";
	mes "�@";
	mes "�]�E�F���X�V�e�B�x�������]";
	close;
}
verus04.gat,133,212,4	script	�x�������P�X���[#EP15_1	119,{/* 59284 */
	if(checkquest(5318) & 0x2)
		delquest 5318;
	emotion 19,"�x�������P�X���[#EP15_1";
	mes "[�x�������P�X���[]";
	mes "�悤�����B";
	mes "�����̓E�F���X�V�e�B���B";
	if(countitem(6753) > 0 || (countitem(6753) > 0 && checkquest(5304)))
		set '@str$,"�ŖS�̏؂������ė��܂���";
	else
		set '@str$,"�x�����Ƃ͉��ł����H";
	next;
	switch(select("������`�����͂���܂��񂩁H",'@str$,"�E�F���X�V�e�B�Œ��ӂ���_�́H","���ł�����܂���B")) {
	case 1:
		if(checkquest(5309)) {
			if(!checkquest(5310) || !checkquest(5311) || !checkquest(5312) || !checkquest(5313)) {
				emotion 1,"�x�������P�X���[#EP15_1"; //59032
				mes "[�x�������P�X���[]";
				mes "�܂��S�Ă̑�����";
				mes "����Ă��Ȃ��悤���ȁB";
				next;
				mes "[�x�������P�X���[]";
				mes "�ʓ|���Ƃ͎v�����A";
				mes "��낵�����ށB";
				close;
			}
			mes "�]�B�������˗��̐���";
			mes "�@4�l��" +'@count+ "�l�ł��B";
			mes "�@�x�������P�X���[��";
			mes "�@�񍐂��܂����H�]";
			next;
			if(select("�񍐂���","�񍐂��Ȃ�") == 2) {
				mes "[�x�������P�X���[]";
				mes "�������B";
				mes "�񍐂��鏀������������";
				mes "�񍐂����Ă���B";
				mes "�N�̕񍐂�҂��Ă���B";
				close;
			}
			mes "[�x�������P�X���[]";
			mes "����J�������B";
			mes "�S�Ă̑����̘b�𕷂��Ă����悤���ȁB";
			next;
			mes "[�x�������P�X���[]";
			mes "�T���O�����A�Q���t�A";
			mes "�X�C�f���A�t�B�v�X�c�c�B";
			mes "�݂�ȉ����������悤��";
			mes "���S�����B";
			next;
			mes "[�x�������P�X���[]";
			mes "�{���ɂ��肪�Ƃ��B";
			mes "�����̊����ɑ΂���炾�B";
			mes "�󂯎���Ă���B";
			next;
			delquest 5309;
			delquest 5310;
			delquest 5311;
			delquest 5312;
			delquest 5313;
			setquest 5318;
			switch('@count) {
			case 0:
				getexp 250000,125000;
				break;
			case 1:
				getexp 500000,250000;
				break;
			case 2:
				getexp 1000000,500000;
				break;
			case 3:
				getexp 1500000,750000;
				break;
			case 4:
				getexp 1500000,750000;
				break;
			}
			mes "[�x�������P�X���[]";
			mes "�����悩������";
			mes "���������͂��Ă����Ə�����B";
			close;
		}
		if(checkquest(5318)) {
			if(checkquest(5318) & 0x2 == 0) {
				mes "[�x�������P�X���[]";
				mes "�\����Ȃ��B";
				mes "�C�����͂��肪�����̂����A";
				mes "�����ɗ��߂�d����";
				mes "�Ȃ��������B";
				close;
			}
		}
		emotion 23,"�x�������P�X���[#EP15_1"; //59284
		mes "[�x�������P�X���[]";
		mes "�c�c���A����!?";
		next;
		menu "��`�����͂���܂��񂩁H",-;
		mes "[�x�������P�X���[]";
		mes "�܁A�܂������͂��Ă����Ƃ́I";
		mes "�ŋ߂͖ŖS�j�����c�̂�����";
		mes "�����������Ȃ����łȁc�c�B";
		next;
		mes "[�x�������P�X���[]";
		mes "���傤�ǂ悩�����B";
		mes "�ŋ߂͑��������̋���";
		mes "�����Ă��Ă��Ȃ���������ȁB";
		next;
		mes "[�x�������P�X���[]";
		mes "���̑���ɃE�F���X�V�e�B��";
		mes "���������̋���";
		mes "�����Ă��ė~�����̂��B";
		next;
		mes "[�x�������P�X���[]";
		mes "���݁A�E�F���X�V�e�B���ӂł�";
		mes "4���̑������x�����s���Ă���B";
		next;
		mes "[�x�������P�X���[]";
		mes "���𕷂������ł��\��Ȃ���";
		mes "�����A�ނ�̕s�����������Ă��ꂽ��";
		mes "���������l���ɉ�����";
		mes "��V���e�ނ��肾�B";
		mes "����Ă���邩�H";
		next;
		mes "�]���̃N�G�X�g�ł́A";
		mes "�@�܂�4�l�̌x��������T���܂��傤�B";
		mes "�@4�l�̌x����������͂��ꂼ��";
		mes "�@�˗����󂯂邱�Ƃ��ł��܂��]";
		next;
		mes "�]�˗���B�����Ȃ��Ă��A";
		mes "�@�N�G�X�g�̐i�s���\�ł���";
		mes "�@�˗���B�������ꍇ�A";
		mes "�@^ff0000�B�������l���ɉ�����^000000";
		mes "�@^ff0000�x�������P�X���[����^000000";
		mes "�@^ff0000�󂯎���V���������܂�^000000�]";
		next;
		if(select("���܂�","���x���܂�")) {
			emotion 28,"�x�������P�X���[#EP15_1"; //59284
			mes "[�x�������P�X���[]";
			mes "���c�c���͂��Ă����̂ł�";
			mes "�Ȃ������̂��H";
			close;
		}
		setquest 5309;
		mes "[�x�������P�X���[]";
		mes "����ł͂�낵�����ށB ";
		close;
	case 2:
		if(countitem(6753) == 0) {
			emotion 20,"�x�������P�X���[#EP15_1"; //59284
			mes "[�x�������P�X���[]";
			mes "^4E9867�E�F���X�V�e�B�x����^000000��";
			mes "�C�ɂȂ�̂��H";
			mes "�ς�����z���ȁB";
			next;
			mes "[�x�������P�X���[]";
			mes "���@���J�n����ĊԂ��Ȃ��ꏊ��";
			mes "���Ōx�������K�v�Ȃ񂾁H";
			mes "�Ƃ����z�����邪�A";
			mes "����Ȃ�̎������񂾁B";
			next;
			menu "����ł����H",-;
			mes "[�x�������P�X���[]";
			mes "�N��^F8081E�ŖS�j�����c^000000�Ƃ������O��";
			mes "���������Ƃ��邩�H";
			next;
			emotion 6,"�x�������P�X���[#EP15_1"; //59284
			mes "[�x�������P�X���[]";
			mes "�ŖS�̎������������Ƌ��тȂ���A";
			mes "�l�X�ȏꏊ�o�v���āA�j�󊈓����s��";
			mes "���ɖ��Ȓc�̂��B";
			next;
			mes "[�x�������P�X���[]";
			mes "�Ă̒�A�E�F���X�V�e�B�ɂ������";
			mes "�M�d�Ȕ��@����j�󂵁A";
			mes "��Ղ������Ă���B";
			next;
			mes "[�x�������P�X���[]";
			mes "���ׁ̈A�����Ɣ��@��Ƃ����ɗ���";
			mes "�w�҂�b�������������I��";
			mes "�x���������悤�ɂȂ����B";
			mes "���ꂪ�E�F���X�V�e�B�x�������B";
			next;
			mes "[�x�������P�X���[]";
			mes "�������I";
			mes "����^82ABE9�E�F���X�����L��^000000�̕���";
			mes "�T�����Ă���r����";
			mes "^F8081E�ŖS�j�����c^000000�𔭌�������";
			mes "�z��𒦂炵�߂Ă���I ";
			next;
			emotion 18,"�x�������P�X���[#EP15_1"; //59284
			mes "[�x�������P�X���[]";
			mes "��X���l��s���łȁc�c�B";
			mes "��낵�����ށB";
			close;
		}
		if(checkquest(5304)) {
			mes "[�x�������P�X���[]";
			mes "���������ΑO����ŖS�̏؂�";
			mes "�����ė����ȁH";
			next;
			mes "[�x�������P�X���[]";
			mes "�܂��E�F���X�V�e�B��";
			mes "�؍݂��Ă���̂������";
			mes "�������C�ɓ������悤���ȁB";
			mes "�͂͂́A������񎄂�";
			mes "�������C�ɓ����Ă��邳�B";
			while(1) {
				next;
				switch(select("�ŖS�̏؂œ��鎖���ł��郂�m","�ŖS�̏؂�n��","�Ȃ�ł��Ȃ�")) {
				case 1:
					mes "[�x�������P�X���[]";
					mes "�킩�����B";
					mes "������x�������悤�B";
					next;
					mes "[�x�������P�X���[]";
					mes "�ŖS�̏؂������Ă����";
					mes "�E�F���X�V�e�B��";
					mes "��������Ă���Âт��R���^���N��";
					mes "�������悤�B";
					next;
					mes "[�x�������P�X���[]";
					mes "���Ɏg���̂��킩��Ȃ���";
					mes "���̕��Ƀ��{�b�g�������͂����B";
					mes "�����ɓn�����牽�����邩���ȁB";
					continue;
				case 2:
					mes "[�x�������P�X���[]";
					mes "�킩�����B";
					mes "��x��^ff000050^000000�܂łȂ�";
					mes "�n���邪�c�c�B";
					mes "�����~�����񂾁H";
					next;
					input '@num;
					if('@num < 1 || '@num > 50) {
						mes "[�x�������P�X���[]";
						mes "���܂Ȃ����A��x�ɓn����̂�";
						mes "^ff000050^000000�܂łȂ񂾁B";
						close;
					}
					if(countitem(6753) < '@num*5) {
						mes "[�x�������P�X���[]";
						mes "�c�c����H�@";
						mes "�ŖS�̏؂̐�������Ȃ��悤���ȁB";
						mes "�Âт��R���^���N^0000ff1^000000����������ɂ�";
						mes "�ŖS�̏؂�^0000ff5^000000���K�v���B";
						close;
					}
					mes "[�x�������P�X���[]";
					mes '@num+ "�~�����̂��H";
					mes "����Ȃ�ŖS�̏�";
					mes ('@num*5)+ "�ƌ������悤�B";
					next;
					if(select("���肢���܂�","��߂Ă���") == 2) {
						mes "[�x�������P�X���[]";
						mes "�킩�����B";
						mes "���������Ȃ�����ƌ�����";
						mes "���͂��Ė�������ӂ͖Y��Ȃ��B";
						close;
					}
					if(checkitemblank() == 0) {
						// ������
						close;
					}
					delitem 6753,'@num*5;
					getitem 6962,'@num;
					mes "[�x�������P�X���[]";
					mes "���ꂪ�񑩂̕i���B";
					mes "�܂��A�ŖS�̏؂���ɓ��ꂽ��";
					mes "�����Ă��Ă���B";
					mes "��낵�����ށB";
					close;
				case 3:
					emotion 20,"�x�������P�X���[#EP15_1"; //59030
					mes "[�x�������P�X���[]";
					mes "�ށH";
					mes "��قǖŖS�̏؂������ė�����";
					mes "�����Ă����悤�ȋC���c�c�B";
					close;
				}
			}
		}
		emotion 23,"�x�������P�X���[#EP15_1"; //59030
		mes "[�x�������P�X���[]";
		mes "����͖ŖS�j�����c�M�҂�����";
		mes "���������Ă���Ƃ���";
		mes "^F8081E�ŖS�̏�^000000�ł͂Ȃ����I";
		next;
		mes "[�x�������P�X���[]";
		mes "�ǂ��Ŏ�ɓ��ꂽ�H";
		next;
		menu "��ɓ��ꂽ�ꏊ��������",-;
		emotion 15,"�x�������P�X���[#EP15_1"; //59030
		mes "[�x�������P�X���[]";
		mes "�{����!?";
		mes "�M�d�ȏ������肪�Ƃ��B";
		mes "�x�������\���Ċ��ӂ���B ";
		next;
		mes "[�x�������P�X���[]";
		mes "����͉����ӗ�����Ȃ����";
		mes "�����Ȃ��ȁc�c���`�ށB";
		next;
		emotion 0,"�x�������P�X���[#EP15_1"; //59030
		mes "[�x�������P�X���[]";
		mes "�������I";
		mes "^F8081E�ŖS�̏�^000000�������Ă����";
		mes "^4E9867�Âт��R���^���N^000000�ƌ������悤�B";
		next;
		menu "�Âт��R���^���N�H",-;
		mes "[�x�������P�X���[]";
		mes "�Âт��R���^���N�Ƃ́A";
		mes "�E�F���X�V�e�B��";
		mes "��������Ă���R�����B";
		next;
		mes "[�x�������P�X���[]";
		mes "���Ɏg���̂��킩��Ȃ���";
		mes "���̕��Ƀ��{�b�g�������͂����B";
		mes "�����ɓn�����牽�����邩���ȁB";
		next;
		mes "[�x�������P�X���[]";
		mes "�ŖS�̏�^0000ff5^000000��";
		mes "�Âт��R���^���N^0000ff1^000000��";
		mes "�������邩�H";
		mes "�������A��Ō������Ă��\��Ȃ����B";
		next;
		if(select("����������","��Ō�������") == 2) {
			setquest 5304;
			compquest 5304;
			mes "[�x�������P�X���[]";
			mes "�킩�����B";
			mes "���������Ȃ�����ƌ�����";
			mes "���͂��Ė�������ӂ͖Y��Ȃ��B";
			next;
			mes "[�x�������P�X���[]";
			mes "���ꂩ����ŖS�j�����c��";
			mes "��������̂�����������A";
			mes "���͂��Ă����Ə�����B";
			close;
		}
		// ������
		mes "[�x�������P�X���[]";
		mes "�킩�����B";
		mes "��x��^ff000050^000000�܂łȂ�";
		mes "�n���邪�c�c�B";
		mes "�����~�����񂾁H";
		next;
		input '@num;
		if('@num < 1 || '@num > 50) {
			mes "[�x�������P�X���[]";
			mes "���܂Ȃ����A��x�ɓn����̂�";
			mes "^ff000050^000000�܂łȂ񂾁B";
			close;
		}
		if(countitem(6753) < '@num*5) {
			mes "[�x�������P�X���[]";
			mes "�c�c����H�@";
			mes "�ŖS�̏؂̐�������Ȃ��悤���ȁB";
			mes "�Âт��R���^���N^0000ff1^000000����������ɂ�";
			mes "�ŖS�̏؂�^0000ff5^000000���K�v���B";
			close;
		}
		mes "[�x�������P�X���[]";
		mes '@num+ "�~�����̂��H";
		mes "����Ȃ�ŖS�̏�";
		mes ('@num*5)+ "�ƌ������悤�B";
		next;
		if(select("���肢���܂�","��߂Ă���") == 2) {
			mes "[�x�������P�X���[]";
			mes "�킩�����B";
			mes "���������Ȃ�����ƌ�����";
			mes "���͂��Ė�������ӂ͖Y��Ȃ��B";
			close;
		}
		if(checkitemblank() == 0) {
			// ������
			close;
		}
		delitem 6753,'@num*5;
		getitem 6962,'@num;
		mes "[�x�������P�X���[]";
		mes "���ꂪ�񑩂̕i���B";
		mes "�܂��A�ŖS�̏؂���ɓ��ꂽ��";
		mes "�����Ă��Ă���B";
		mes "��낵�����ށB";
		close;
	case 3:
		emotion 0,"�x�������P�X���[#EP15_1"; //59284
		mes "[�x�������P�X���[]";
		mes "�E�F���X�V�e�B�ɗ���̂�";
		mes "���߂Ă̂悤���ȁB";
		next;
		mes "[�x�������P�X���[]";
		mes "�E�F���X�V�e�B��";
		mes "�ŋ߁A���@���J�n���ꂽ�ꏊ��";
		mes "�s���̐����͌������Ȃ��B";
		next;
		emotion 0,"�x�������P�X���[#EP15_1"; //59284
		mes "[�x�������P�X���[]";
		mes "�����A��_�����A";
		mes "�C��t���Ē���������������B";
		next;
		mes "[�x�������P�X���[]";
		mes "����^82ABE9�E�F���X���@�n^000000�͈��S����";
		mes "^82ABE9�E�F���X�����L��^000000�̕��ɍs���Ȃ�A";
		mes "�������菀�������Ă��������B";
		next;
		mes "[�x�������P�X���[]";
		mes "�����͂܂����@���J�n����ĊԂ��Ȃ��B";
		mes "������{���͑S�Ă̔��@����";
		mes "���d�Ɉ����ׂ��Ȃ̂����c�c�B";
		next;
		emotion 6,"�x�������P�X���[#EP15_1"; //59284
		mes "[�x�������P�X���[]";
		mes "�����ŖS�j�����c�̓z��߁I";
		mes "�ŖS�j�����c�ȂǖłтĂ��܂��I";
		next;
		mes "[�x�������P�X���[]";
		mes "�c�c���炵���B";
		next;
		mes "[�x�������P�X���[]";
		mes "���Ă���B";
		mes "�ŋ߂̓X�g���X�Ŕ����т������񂾁B";
		mes "�����ł����A���̖т�";
		mes "���Ȃ��Ƃ����̂Ɂc�c�B";
		next;
		mes "[�x�������P�X���[]";
		mes "�b���E�����Ă��܂����ȁB";
		mes "���܂Ȃ������B";
		next;
		emotion 33,"�x�������P�X���[#EP15_1"; //59284
		mes "[�x�������P�X���[]";
		mes "�܂��A�����Ŕ��@���ꂽ���� ";
		mes "�����Ȃ��悤��";
		mes "���ӂ���Ƃ��������B";
		close;
	case 4:
		emotion 22,"�x�������P�X���[#EP15_1"; //59284
		mes "[�x�������P�X���[]";
		mes "^F8081E�ŖS�j�����c^000000������������";
		mes "�߂��ɂ���x�����ɒm�点�Ă���B";
		close;
	}
OnInit:
	waitingroom "�x�������̈˗�",0; //59284
	end;
}
verus03.gat,38,114,4	script	���ĎD#EP15_1D��	857,{/* 59285 */
	mes "[���ӎ���]";
	mes "�E�F���X�V�e�B��";
	mes "�����K���������ɒ��ӎ�����";
	mes "���m�点���܂��B";
	next;
	mes "[���ӎ���]";
	mes "���݁A�ŖS�j�����c�Ɩ����";
	mes "�ߌ��ȋ��c���������ł��̂ŁA";
	mes "��Q�ɑ���Ȃ��悤�A";
	mes "���ӂ��ĉ������B";
	next;
	mes "[���ӎ���]";
	mes "������Q�ɑ���ꂽ����A";
	mes "��Q�����ڌ����ꂽ����";
	mes "�E�F���X�V�e�B�x�����܂�";
	mes "���A���������B";
	mes "  ";
	mes "�]�E�F���X�V�e�B�x�������]";
	close;
}
verus03.gat,36,113,4	script	�x�������T���O����#EP15	118,{/* 59286 */
	if(checkquest(5309) == 0) {
		misceffect 197,"�x�������T���O����#EP15"; //59286
		mes "[�x�������T���O����]";
		mes "���������c�c�B";
		next;
		emotion 19,"�x�������T���O����#EP15"; //59286
		mes "[�x�������T���O����]";
		mes "���A���������ĉ������B";
		next;
		mes "�]�N�����Q���������Ă���]";
		close;
	}
	if(checkquest(5310)) {
		mes "[�x�������T���O����]";
		mes "�����A�܂������̔C����";
		mes "�I����ĂȂ��̂��H";
		mes "�������͓��ɕς�������͂Ȃ����B";
		close;
	}
	if(checkquest(5315) || checkquest(5316) || checkquest(5317)) {
		mes "[�x�������T���O����]";
		mes "���̋��̎d�������Ă���̂��H";
		mes "��������A�������̎d����";
		mes "�I��点�Ă��痈��񂾂ȁB";
		close;
	}
	if(checkquest(5314)) {
		mes "[�x�������T���O����]";
		mes "�����ڈ��P�����Ă����̂��H";
		mes "�����A�������Ȃ����H";
		next;
		switch(select("�S���P������","���c�̖ڈ�͂ǂ��ɂ���́H","��߂����ł�","���ł��Ȃ�")) {
		case 1:
			if(checkquest(5314) & 0x4 == 0) {
				emotion 54,"�x�������T���O����#EP15"; //59032
				mes "[�x�������T���O����]";
				mes "�����A�܂�����Ȃ����B";
				mes "���Ȃ��Ƃ�^ff000010��^000000��";
				mes "�P�����ė��Ă���B";
				close;
			}
			if(!checkquest(5305)) {
				setquest 5305;
				compquest 5305;
			}
			delquest 5314;
			setquest 5310;
			mes "[�x�������T���O����]";
			mes "�����I�@����J�������B";
			mes "���������ł���邾�낤�B";
			close;
		case 2:
			emotion 23,"�x�������T���O����#EP15"; //59032
			mes "[�x�������T���O����]";
			mes "�E�F���X�V�e�B����";
			mes "�΂�T����Ă���͂������c�c�B";
			mes "�A���^�ɂ͌����Ȃ������̂��H";
			close;
		case 3:
			mes "�]�˗���j�������ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������T���O����]";
				mes "����A�C���ς�������H";
				mes "������`���C�ɂȂ��Ă��ꂽ�Ȃ�";
				mes "������x�b�������Ă����ȁB";
				close;
			}
			//������
			setquest 5305;
			compquest 5305;
			delquest 5314;
			setquest 5310;
			mes "[�x�������T���O����]";
			mes "�������c�c�}�p�Ȃ�d���Ȃ��ȁB";
			mes "�����ɂ͎�����`���Ă����B";
			mes "�}���ōs���������ǂ����B";
			close;
		case 4:
			emotion 20,"�x�������T���O����#EP15"; //59032
			mes "[�x�������T���O����]";
			mes "�c�c�H";
			mes "�������ȓz���ȁB";
			close;
		}
	}
	if(checkquest(5305)) {
		emotion 12,"�x�������T���O����#EP15"; //59032
		mes "[�x�������T���O����]";
		mes "�����������̗��݂ŗ����̂��H";
		next;
		emotion 1,"�x�������T���O����#EP15"; //59032
		mes "[�x�������T���O����]";
		mes "�悩�����B";
		mes "���������c�̖ڈ�̓P����";
		mes "��`���Ă���Ȃ����H";
		next;
		if(select("���͂���","�����͖Z�������獡�x") == 2) {
			mes "�]�˗����󂯂Ȃ��ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������T���O����]";
				mes "����A�C���ς�������H";
				mes "������`���C�ɂȂ��Ă��ꂽ�Ȃ�";
				mes "������x�b�������Ă����ȁB";
				close;
			}
			emotion 54,"�x�������T���O����#EP15"; //59032
			setquest 5310;
			mes "[�x�������T���O����]";
			mes "�Z�����Ȃ炵�傤���Ȃ��B";
			mes "�����ɂ͓��ɕς�������͂Ȃ���";
			mes "�`���Ă����Ă���B";
			close;
		}
	}
	else {
		misceffect 197,"�x�������T���O����#EP15"; //59032
		menu "���́c�c",-;
		emotion 23,"�x�������T���O����#EP15"; //59032
		mes "[�x�������T���O����]";
		mes "���킠����!!";
		mes "�P�X���[����!?";
		mes "���c�c���͐Q�Ă��܂���I";
		next;
		emotion 9,"�x�������T���O����#EP15"; //59032
		emotion 9,""; //self
		mes "[�x�������T���O����]";
		mes "�c�c�B";
		next;
		mes "[�x�������T���O����]";
		mes "���c�c�H";
		mes "������������Ǝv��������ˁ[���B";
		mes "�A���^�A�N���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�x���������猾���ė��܂����B";
		next;
		emotion 43,"�x�������T���O����#EP15"; //59032
		mes "[�x�������T���O����]";
		mes "�Ȃ�قǁA�����̑㗝���B";
		mes "����Ȃ炿�傤�Ǘǂ��A";
		mes "�������͂��Ă���Ȃ����H";
		next;
		if(select("���͂���","�����͖Z�������玟�̋@���") == 2) {
			mes "�]�˗����󂯂Ȃ��ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������T���O����]";
				mes "����A�C���ς�������H";
				mes "������`���C�ɂȂ��Ă��ꂽ�Ȃ�";
				mes "������x�b�������Ă����ȁB";
				close;
			}
			emotion 54,"�x�������T���O����#EP15"; //59032
			setquest 5305;
			compquest 5305;
			setquest 5310;
			mes "[�x�������T���O����]";
			mes "�Z�����Ȃ炵�傤���Ȃ��B";
			mes "�����ɂ͓��ɕς�������͂Ȃ���";
			mes "�`���Ă����Ă���B";
			close;
		}
	}
	setquest 5314;
	mes "[�x�������T���O����]";
	mes "���������ȁB";
	mes "���ꂶ�Ⴀ�A���c�̖ڈ��";
	mes "^ff000010��^000000�قǓP��������";
	mes "���ɋ����Ă���B";
	close;
}
verus03.gat,116,39,4	script	���ĎD#EP15_1D?	857,{/* 59287 */
	mes "[���ӎ���]";
	mes "�E�F���X�V�e�B��";
	mes "�����K���������ɒ��ӎ�����";
	mes "���m�点���܂��B";
	next;
	mes "[���ӎ���]";
	mes "���݁A�ŖS�j�����c�Ɩ����";
	mes "�ߌ��ȋ��c���������ł��̂ŁA";
	mes "��Q�ɑ���Ȃ��悤�A";
	mes "���ӂ��ĉ������B";
	next;
	mes "[���ӎ���]";
	mes "������Q�ɑ���ꂽ����A";
	mes "��Q�����ڌ����ꂽ����";
	mes "�E�F���X�V�e�B�x�����܂�";
	mes "���A���������B";
	mes "  ";
	mes "�]�E�F���X�V�e�B�x�������]";
	close;
}
verus03.gat,116,36,6	script	�x�������Q���t#EP15_1D	748,{/* 59288 */
	if(checkquest(5309) == 0) {
		emotion 57,"�x�������Q���t#EP15_1D"; //59288
		mes "[�x�������Q���t]";
		mes "�����c�c�X�g���X�����܂�B";
		mes "�����X�g���X����������@��";
		mes "�����Ȃ��Ɓc�c�B";
		mes "�܂��݂��c�c�B";
		next;
		mes "�]�N�����ꂵ�����ɂ��Ă���]";
		close;
	}
	if(checkquest(5311)) {
		emotion 2,"�x�������Q���t#EP15_1D"; //59034
		mes "[�x�������Q���t]";
		mes "�C���͏����ǂ��Ȃ��Ă��܂����B";
		mes "�P�X���[�����ɂ͓��ɕς��������";
		mes "�Ȃ��ƕ񍐂��ĉ������B";
		close;
	}
	if(checkquest(5314) || checkquest(5316) || checkquest(5317)) {
		emotion 19,"�x�������Q���t#EP15_1D"; //59034
		mes "[�x�������Q���t]";
		mes "�����c�c�ݒɂ��Ђǂ��c�c�B";
		mes "�������ǁA�����x�݂����񂾁B";
		mes "�N�͍�����Ă���d����";
		mes "�I���Ă��痈�Ă���Ȃ����ȁH";
		close;
	}
	if(checkquest(5315)) {
		emotion 23,"�x�������Q���t#EP15_1D"; //59034
		mes "[�x�������Q���t]";
		mes "�܂����c�c�{���ɂ���";
		mes "㩂�P�������̂ł����H";
		next;
		switch(select("�P�������I","㩂͂ǂ��ɂ���܂���","�}�p���c�c","���ł�����܂���")) {
		case 1:
			if(QUE3_VER == 0) {
				mes "[�x�������Q���t]";
				mes "�܂����㩂�";
				mes "�P�����Ă��܂���ˁB";
				mes "���萔�ł����A";
				mes "㩂�^ff000010��^000000�P�����ė��Ă��������B";
				close;
			}
			if(QUE3_VER < 10) {
				emotion 57,"�x�������Q���t#EP15_1D"; //59034
				mes "[�x�������Q���t]";
				mes "�܂�^ff0000" +QUE3_VER+ "��^000000����㩂�";
				mes "�P�����Ă��܂���ˁB";
				mes "���萔�ł����A";
				mes "㩂�^ff000010��^000000�P�����ė��Ă��������B";
				close;
			}
			if(checkquest(5306)) {
				setquest 5306;
				compquest 5306;
			}
			delquest 5315;
			setquest 5311;
			mes "[�x�������Q���t]";
			mes "����J�l�ł����B";
			mes "㩂���������C��������";
			mes "�悭�Ȃ����C�����܂��B";
			mes "�����ւ̕񍐂���낵�����肢���܂��B";
			close;
		case 2:
			emotion 36,"�x�������Q���t#EP15_1D"; //59034
			mes "[�x�������Q���t]";
			mes "����c�c�H";
			mes "㩂�������܂���ł������H";
			next;
			mes "[�x�������Q���t]";
			mes "�ŖS�j�����c�̓z��";
			mes "����Ȃɂ�������";
			mes "�ݒu���Ă���̂ɁB";
			next;
			mes "[�x�������Q���t]";
			mes "�����c�c�܂��X�g���X�ň݂��c�c�B";
			close;
		case 3:
			mes "�]�˗���j������ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������Q���t]";
				mes "�C���ς��܂������H";
				mes "�����A�C���ς�����Ȃ�";
				mes "������x�b�������Ă��������B";
				close;
			}
			//������
			if(checkquest(5306)) {
				setquest 5306;
				compquest 5306;
			}
			delquest 5315;
			setquest 5311;
			mes "[�x�������Q���t]";
			mes "�������c�c�}�p�Ȃ�d���Ȃ��ȁB";
			mes "�����ɂ͎�����`���Ă����B";
			mes "�}���ōs���������ǂ����B";
			close;
		case 4:
			emotion 57,"�x�������Q���t#EP15_1D"; //59034
			mes "[�x�������Q���t]";
			mes "�����ł����c�c�B";
			mes "�����c�c�݂��c�c�B";
			close;
		}
	}
	if(checkquest(5306)) {
		mes "[�x�������Q���t]";
		mes "�܂�������܂����ˁB";
		mes "����������̌����ł����H";
		next;
		mes "[�x�������Q���t]";
		mes "�������Ԃ�����悤�ł�����";
		mes "�ŖS�j�����c���ݒu����㩂�";
		mes "�P�����Ē����܂����H";
		next;
		if(select("���͂��܂�","���̋@���") == 2) {
			mes "�]�˗����󂯂Ȃ��ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������Q���t]";
				mes "�C���ς��܂������H";
				mes "�����A�C���ς�����Ȃ�";
				mes "������x�b�������Ă��������B";
				close;
			}
			setquest 5311;
			mes "[�x�������Q���t]";
			mes "�Ӂ[��B";
			mes "�Z�����̂ɑ����̎�`����";
			mes "�����ł��ˁB";
			mes "���A�l����������Ȃ�����";
			mes "��`���Ă���Ȃ���ł����H";
			next;
			emotion 36,"�x�������Q���t#EP15_1D"; //59034
			mes "[�x�������Q���t]";
			mes "�܂��A�߂�����P�X���[�u�����v�ɂ�";
			mes "���ɕς�������͂Ȃ���";
			mes "�`���Ă��������B";
			close;
		}
	}
	else {
		emotion 53,"�x�������Q���t#EP15_1D"; //59036
		mes "[�x�������Q���t]";
		mes "����H�@�y�����Ȃ��c�c�B";
		mes "�������͊m���ɂ������̂Ɂc�c�B";
		mes "�ǂ��ɍs�����񂾂낤�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����̎��ɏ�������Ă��܂���B";
		next;
		emotion 23,"�x�������Q���t#EP15_1D"; //59036
		mes "[�x�������Q���t]";
		mes "����!?�@���̂܂Ɂc�c�B";
		mes "�ςł��ˁc�c�B";
		next;
		emotion 1,"�x�������Q���t#EP15_1D"; //59036
		mes "[�x�������Q���t]";
		mes "���ƁA���炢�����܂����B";
		mes "�����p�ł����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�x���������猾���ė��܂����B";
		next;
		emotion 6,"�x�������Q���t#EP15_1D"; //59036
		mes "[�x�������Q���t]";
		mes "�P�X���[�����̌����̕��ł��ˁB";
		mes "�͂͂́A�����͑A�܂����Ȃ��B";
		mes "��`���Ă����l������Ȃ�āB";
		next;
		if(select("��`���܂��傤���H","���͋��͂��邱�Ƃ��ł��܂���") == 2) {
			mes "�]�˗����󂯂Ȃ��ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������Q���t]";
				mes "�C���ς��܂������H";
				mes "�����A�C���ς�����Ȃ�";
				mes "������x�b�������Ă��������B";
				close;
			}
			setquest 5306;
			compquest 5306;
			setquest 5311;
			mes "[�x�������Q���t]";
			mes "�Ӂ[��B";
			mes "�Z�����̂ɑ����̎�`����";
			mes "�����ł��ˁB";
			mes "���A�l����������Ȃ�����";
			mes "��`���Ă���Ȃ���ł����H";
			next;
			emotion 36,"�x�������Q���t#EP15_1D"; //59034
			mes "[�x�������Q���t]";
			mes "�܂��A�߂�����P�X���[�u�����v�ɂ�";
			mes "���ɕς�������͂Ȃ���";
			mes "�`���Ă��������B";
			close;
		}
	}
	setquest 5315;
	mes "[�x�������Q���t]";
	mes "���肪�Ƃ��������܂��B";
	mes "����ł̓E�F���X�V�e�B��";
	mes "���鏊�ɐݒu���ꂽ㩂�";
	mes "^ff000010��^000000�قǓP�����ĉ������B";
	close;
}
verus03.gat,83,241,4	script	���ĎD#EP15_1D��	857,{/* 59289 */
	mes "[���ӎ���]";
	mes "�E�F���X�V�e�B��";
	mes "�����K���������ɒ��ӎ�����";
	mes "���m�点���܂��B";
	next;
	mes "[���ӎ���]";
	mes "���݁A�ŖS�j�����c�Ɩ����";
	mes "�ߌ��ȋ��c���������ł��̂ŁA";
	mes "��Q�ɑ���Ȃ��悤�A";
	mes "���ӂ��ĉ������B";
	next;
	mes "[���ӎ���]";
	mes "������Q�ɑ���ꂽ����A";
	mes "��Q�����ڌ����ꂽ����";
	mes "�E�F���X�V�e�B�x�����܂�";
	mes "���A���������B";
	mes "  ";
	mes "�]�E�F���X�V�e�B�x�������]";
	close;
}
verus03.gat,81,241,6	script	�x�������X�C�f��#EP15_1	89,{/* 59290 */
	if(checkquest(5309) == 0) {
		emotion 29,"�x�������X�C�f��#EP15_1"; //59290
		mes "[�x�������X�C�f��]";
		mes "�ӂӂӁc�c�B";
		mes "���͂��Ȃ���m���Ă��܂��c�c�B";
		mes "�ł����A�b������������܂���B";
		mes "�ӂӁA�ӂӂӁc�c�B";
		next;
		mes "�]�C���������l���]";
		close;
	}
	if(checkquest(5312)) {
		emotion 29,"�x�������X�C�f��#EP15_1"; //59038
		mes "[�x�������X�C�f��]";
		mes "�ӂӂӁc�c�B";
		mes "�N���̍��݂𔃂�Ȃ��悤��";
		mes "�C��t���ĉ������c�c�B";
		close;
	}
	if(checkquest(5314) || checkquest(5315) || checkquest(5317)) {
		emotion 29,"�x�������X�C�f��#EP15_1"; //59036
		mes "[�x�������X�C�f��]";
		mes "�ӂӂӁc�c�B";
		mes "��x�ɏo����d���͂ЂƂ����B";
		mes "�����Ȃ��΁A�E�F���X�V�e�B��";
		mes "���݂��󂯂܂���c�c�B";
		mes "�ӂӁA�ӂӂӁc�c�B";
		close;
	}
	if(checkquest(5316)) {
		emotion 29,"�x�������X�C�f��#EP15_1"; //59036
		mes "[�x�������X�C�f��]";
		mes "�ӂӂӁc�c�B";
		mes "�΂͑S���E���܂������H";
		next;
		switch(select("�S���E���܂���","�΂͂ǂ��ɂ���܂����H","�΂��E�����Ԃ�����܂���","�Ȃ�ł�����܂���")) {
		case 1:
			if(QUE3_VER == 0) {
				emotion 29,"�x�������X�C�f��#EP15_1"; //59036
				mes "[�x�������X�C�f��]";
				mes "�ӂӂӁc�c�B";
				mes "�΂͂ǂ��ɂ����ł����H";
				mes "�����E���ė��Ȃ���";
				mes "�΂ŉ��������";
				mes "�x�����������̉��O���c�c�B";
				mes "�ӂӁA�ӂӂӁc�c�B";
				close;
			}
			if(QUE3_VER < 10 && countitem(7049) >= 10) {
				emotion 29,"�x�������X�C�f��#EP15_1"; //59036
				mes "[�x�������X�C�f��]";
				mes "�ӂӂӁc�c�B";
				mes "���̐΂͂ǂ�����E���ė��܂����H";
				mes "�����x������ł������H";
				mes "�ӂӁA�ӂӂӁc�c�B";
				close;
			}
			emotion 29,"�x�������X�C�f��#EP15_1"; //59036
			delitem 7049,10;
			if(checkquest(5307)) {
				setquest 5307;
				compquest 5307;
			}
			delquest 5316;
			setquest 5312;
			mes "[�x�������X�C�f��]";
			mes "�ӂӂӁc�c�B";
			mes "����J�l�ł����B";
			mes "�����ŉ���������҂�����";
			mes "���O�������Ă����܂��B";
			close;
		case 2:
			emotion 29,"�x�������X�C�f��#EP15_1"; //59036
			mes "[�x�������X�C�f��]";
			mes "�ӂӂӁc�c�B";
			mes "���̂���Ȃ��Ƃ܂ŕ�����ł����H";
			mes "�܂��A�����ł��傤�B";
			mes "�΂͂ǂ��ɂł�����܂��B";
			next;
			mes "[�x�������X�C�f��]";
			mes "�E�F���X�V�e�B�̒n�ʂ�";
			mes "�悭���ׂĂ݂ĉ������B";
			mes "�ӂӂӁc�c�B";
			close;
		case 3:
			mes "�]�˗���j������ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������X�C�f��]";
				mes "����ς�c�c����ꂽ�Ƃ��肾�B";
				mes "�c�c�����A���ł�����܂���B";
				mes "�C���ς�����̂Ȃ�";
				mes "������x�b�������Ă��������B";
				close;
			}
			//������
			if(checkquest(5307)) {
				setquest 5307;
				compquest 5307;
			}
			delquest 5316;
			setquest 5312;
			mes "[�x�������X�C�f��]";
			mes "���c�c�H";
			mes "�����������Ɍ�����";
			mes "�����Ă����ƌ���ꂽ�̂Ɂc�c�B";
			mes "�����ɂ͂��܂��b���Ă����ĉ������B";
			close;
		case 4:
			emotion 29,"�x�������X�C�f��#EP15_1"; //59036
			mes "[�x�������X�C�f��]";
			mes "�ӂӂӁc�c�B";
			mes "������܂����B";
			mes "���������撣���ĉ������c�c�B";
			close;
		}
	}
	if(checkquest(5307)) {
		emotion 29,"�x�������X�C�f��#EP15_1"; //59036
		mes "[�x�������X�C�f��]";
		mes "�ӂӂӁc�c�B";
		mes "���낻�뗈��Ǝv���Ă��܂����B";
		next;
		mes "[�x�������X�C�f��]";
		mes "�ӂӂӁc�c�B";
		mes "������E�F���X�V�e�B��";
		mes "���S�ׂ̈�";
		mes "�΂��E���Ă���܂����H";
		next;
		if(select("���͂��܂�","���̋@��Ɂc") == 2) {
			mes "�]�˗���j�������ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������X�C�f��]";
				mes "����ς�c�c����ꂽ�Ƃ��肾�B";
				mes "�c�c�����A���ł�����܂���B";
				mes "�C���ς�����̂Ȃ�";
				mes "������x�b�������Ă��������B";
				close;
			}
			// ������
			emotion 20,"�x�������X�C�f��#EP15_1"; //59038
			delquest 5307;
			setquest 5312;
			mes "[�x�������X�C�f��]";
			mes "���c�c�H";
			mes "�����������Ɍ�����";
			mes "�����Ă����ƌ���ꂽ�̂Ɂc�c�B";
			mes "�����ɂ͂��܂��b���Ă����ĉ������B";
			close;
		}
	}
	else {
		emotion 29,"�x�������X�C�f��#EP15_1"; //59038
		mes "[�x�������X�C�f��]";
		mes "�ӂӂӁc�c�B";
		mes "�����Ɍ����Ă������ł��ˁB";
		mes "���҂����Ă܂�����B";
		mes "�����ƁA���[���Ɓc�c�B";
		mes "�ӂӁA�ӂӂӂӂӂӂӁB";
		next;
		emotion 0,""; //self
		mes "[" +strcharinfo(0)+ "]";
		mes "!?";
		next;
		mes "[�x�������X�C�f��]";
		mes "���R�A�킩��悤�ɂȂ�܂����B";
		mes "�����킩�邩�c�c�ł����H";
		next;
		mes "[�x�������X�C�f��]";
		mes "�c�c�B";
		mes "�ӂӁA�ӂӂӁc�c�B";
		next;
		mes "[�x�������X�C�f��]";
		mes "�ӂӁA�債�����Ƃł͂���܂���B";
		mes "�C�ɂ��Ȃ��Ői�݂܂��傤�B";
		mes "�ӂӂӁc�c�B";
		next;
		mes "[�x�������X�C�f��]";
		mes "�����A�����ł����B";
		mes "���Ȃ��ɂ��肢������";
		mes "�d��������̂ł��B";
		mes "���͂��Ă���܂��񂩁H";
		next;
		if(select("���͂��܂�","���͌������ł�") == 2) {
			mes "�]�˗����󂯂Ȃ��ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������X�C�f��]";
				mes "����ς�c�c����ꂽ�Ƃ��肾�B";
				mes "�c�c�����A���ł�����܂���B";
				mes "�C���ς�����̂Ȃ�";
				mes "������x�b�������Ă��������B";
				close;
			}
			emotion 20,"�x�������X�C�f��#EP15_1"; //59038
			setquest 5307;
			compquest 5307;
			setquest 5312;
			mes "[�x�������X�C�f��]";
			mes "���c�c�H";
			mes "�����������Ɍ�����";
			mes "�����Ă����ƌ���ꂽ�̂Ɂc�c�B";
			mes "�����ɂ͂��܂��b���Ă����ĉ������B";
			close;
		}
	}
	setquest 5316;
	mes "[�x�������X�C�f��]";
	mes "�ӂӂӁc�c�B";
	mes "�����Ȑ΂͓����Ă��ɂ����Ȃ����A";
	mes "��������Ȃ��炵���ł��B";
	mes "�傫�Ȑ΂�^ff000010���肢���܂��B";
	close;
}
verus04.gat,204,260,4	script	���ĎD#EP15_1D�k	857,{/* 59291 */
	mes "[���ӎ���]";
	mes "�E�F���X�V�e�B��";
	mes "�����K���������ɒ��ӎ�����";
	mes "���m�点���܂��B";
	next;
	mes "[���ӎ���]";
	mes "���݁A�ŖS�j�����c�Ɩ����";
	mes "�ߌ��ȋ��c���������ł��̂ŁA";
	mes "��Q�ɑ���Ȃ��悤�A";
	mes "���ӂ��ĉ������B";
	next;
	mes "[���ӎ���]";
	mes "������Q�ɑ���ꂽ����A";
	mes "��Q�����ڌ����ꂽ����";
	mes "�E�F���X�V�e�B�x�����܂�";
	mes "���A���������B";
	mes "  ";
	mes "�]�E�F���X�V�e�B�x�������]";
	close;
}
verus04.gat,202,258,4	script	�x�������t�B�v�X#EP15_1	755,{/* 59292 */
	if(checkquest(5309) == 0) {
		emotion 37,"�x�������t�B�v�X#EP15_1"; //59292
		mes "[�x�������t�B�v�X]";
		mes "���������c�c�B";
		mes "�ӂށA���\����������Ȃ����B";
		next;
		mes "�]�N��������H�ׂĂ���]";
		close;
	}
	if(checkquest(5313)) {
		emotion 21,"�x�������t�B�v�X#EP15_1"; //59040
		mes "[�x�������t�B�v�X]";
		mes "�����͎����ӔC�������Čx�����Ă���B";
		mes "�S�z����ȁB";
		close;
	}
	if(checkquest(5314) || checkquest(5315) || checkquest(5316)) {
		// ������
		close;
	}
	if(checkquest(5317)) {
		emotion 1,"�x�������t�B�v�X#EP15_1"; //59038
		mes "[�x�������t�B�v�X]";
		mes "�򑐂̍̏W�͏I��������H";
		next;
		switch(select("�����ɂ���܂�","�򑐂͂ǂ��ɂ���܂���","�}�p���c�c","���ł�����܂���")) {
		case 1:
			if(countitem(6754) == 0) {
				mes "[�x�������t�B�v�X]";
				mes "�͂āA�򑐂͂ǂ����H";
				next;
				mes "[�x�������t�B�v�X]";
				mes "���͐H�ׂ邱�ƂȂ��A";
				mes "�򑐂̍݌ɂ𑝂₵�����������B";
				mes "�������H";
				mes "���͐H�ׂĂ��Ȃ��B��΂ɂ��B";
				close;
			}
			if(countitem(6754) < 10) {
				mes "[�x�������t�B�v�X]";
				mes "���A����͈Ⴄ�񂾁I";
				mes "���͖򑐂�H�ׂĂ����킯�ł͂Ȃ��I";
				mes "�����A����͉����̊ԈႢ���B";
				mes "������A������x�b�������Ă���B";
				mes "�d�؂�Ȃ������A�킩�����ˁH";
				close;
			}
			// ������
			close;
		case 2:
			mes "[�x�������t�B�v�X]";
			mes "�򑐂̏ꏊ�H";
			next;
			mes "[�x�������t�B�v�X]";
			mes "�E�F���X�V�e�B�ɂ���";
			mes "�X�Ƃ����΂݂��悭���ׂ��";
			mes "�̏W�o�������Ȗ򑐂�����͂����B";
			close;
		case 3:
			mes "�]�˗���j������ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������t�B�v�X]";
				mes "�ށA�l���Ȃ����Ă��ꂽ�̂��H";
				mes "�����ł���Ώ����邪�c�c�B";
				mes "�l�������܂�����";
				mes "������x�b�������Ă���B";
				close;
			}
			if(checkquest(5308)) {
				setquest 5308;
				compquest 5308;
			}
			delquest 5317;
			setquest 5313;
			mes "[�x�������t�B�v�X]";
			mes "�������c�c�}�p�Ȃ�d���Ȃ��ȁB";
			mes "�����ɂ͎�����`���Ă����B";
			mes "�}���ōs���������ǂ����B";
			close;
		case 4:
			mes "[�x�������t�B�v�X]";
			mes "��^ff000010��^000000���B";
			mes "�Y���Ȃ�B";
			close;
		}
	}
	if(checkquest(5308)) {
		mes "[�x�������t�B�v�X]";
		mes "�ق��A�����������ɗ��܂�ė����̂��H";
		next;
		mes "[�x�������t�B�v�X]";
		mes "���ς�炸�򑐂��s�����Ă��ĂȁB";
		mes "�܂��̏W�𗊂߂邩�H";
		next;
		if(select("�̏W���Ă��܂�","���̋@��Ɂc") == 2) {
			mes "�]�˗����󂯂Ȃ��ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������t�B�v�X]";
				mes "�ށA�l���Ȃ����Ă��ꂽ�̂��H";
				mes "�����ł���Ώ����邪�c�c�B";
				mes "�l�������܂�����";
				mes "������x�b�������Ă���B";
				close;
			}
			setquest 5313;
			mes "[�x�������t�B�v�X]";
			mes "�������A�d���Ȃ��ȁB";
			mes "�܂����̋@��ɗ��ށB";
			close;
		}
	}
	else {
		emotion 37,"�x�������t�B�v�X#EP15_1"; //59040
		mes "[�x�������t�B�v�X]";
		mes "���������c�c�B";
		mes "�ӂށA�������ȁB";
		mes "�������c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c�B";
		next;
		emotion 23,"�x�������t�B�v�X#EP15_1"; //59040
		mes "[�x�������t�B�v�X]";
		mes "�ق��A�C���t���Ȃ��Ă��܂Ȃ��B";
		mes "�p���������p���������ȁB";
		next;
		mes "[�x�������t�B�v�X]";
		mes "���̓E�F���X�V�e�B��";
		mes "�����������Ă���Z�[�W���B";
		mes "�����t�B�v�X�ƌ����B";
		next;
		mes "[�x�������t�B�v�X]";
		mes "�����̌������H";
		mes "�ӂށA���傤�Ǘǂ������B";
		next;
		emotion 1,"�x�������t�B�v�X#EP15_1"; //59040
		mes "[�x�������t�B�v�X]";
		mes "���낻��򑐂̍݌ɂ����Ȃ��񂾁B";
		mes "�̂�ɍs�����Ԃ��Ȃ��A";
		mes "�����Ă����Ƃ��낾�B";
		mes "��������`���Ă���邩�H";
		next;
		if(select("��`���܂�","���͂�����Ɠ���ł�") == 2) {
			mes "�]�˗����󂯂Ȃ��ꍇ";
			mes "�@�N�G�X�g��񍐂���ۂ�";
			mes "�@�x�������P�X���[����󂯎��";
			mes "�@^ff0000��V���������܂��]^000000";
			next;
			mes "�]�܂��A�x�������P�X���[�ɕ񍐂�";
			mes "�@�N�G�X�g��B������܂ŁA";
			mes "�@^ff0000�˗����󂯂鎖��^000000";
			mes "�@^ff0000�ł��Ȃ��Ȃ�܂��B^000000";
			mes "�@�{���ɂ�낵���ł����H�]";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�x�������t�B�v�X]";
				mes "�ށA�l���Ȃ����Ă��ꂽ�̂��H";
				mes "�����ł���Ώ����邪�c�c�B";
				mes "�l�������܂�����";
				mes "������x�b�������Ă���B";
				close;
			}
			setquest 5308;
			compquest 5308;
			setquest 5313;
			mes "[�x�������t�B�v�X]";
			mes "�������A�d���Ȃ��ȁB";
			mes "�܂����̋@��ɗ��ށB";
			close;
		}
	}
	setquest 5317;
	mes "[�x�������t�B�v�X]";
	mes "���肪�Ƃ��B";
	mes "�E�F���X�V�e�B�ɂ���";
	mes "���������΂݂��悭���ׂ��";
	mes "�򑐂���������͂����B";
	mes "�����^ff000010��^000000�قǍ̏W���Ă��Ă���B";
	close;
}
verus03.gat,127,36,4	script	???#EP15_1D_01	550,{/* 59293 */
	if(!checkquest(5315) && !checkquest(5316))
		end;
	if(checkquest(5315)) {
		if(QUE3_VER >= 10) {
			mes "�]���܂ꂽ����㩂�P������";
			mes "�@�x�������Q���t�ɕ񍐂��悤�]";
			close;
		}
		emotion 0; //59039
		mes "�]���̏ꏊ�Ɉ�a��������B";
		mes "�@�ǂ����悤���H�]";
		next;
		if(select("�������Ă݂�","���̂܂܂ɂ��Ă���") == 2) {
			mes "�]���̏�𗧂��������]";
			close;
		}
		progressbar 2; //color=0xffff00
		if(rand(100) < 25) {
			mes "�]��a���͋C�̂����������悤���]";
		}
		else {
			mes "�]�ŖS�j�����c���ݒu����";
			mes "�@㩂����������]";
			set QUE3_VER,QUE3_VER + 1;
		}
	}
	else if(checkquest(5316)) {
		if(QUE3_VER >= 10) {
			mes "�]�傫�Ȑ΂�10�W�߂��B";
			mes "�@�x�����X�C�f���ɓn�����]";
			close;
		}
		mes "�]�n�ʂɖ��܂��Ă���΂��������B";
		mes "�@�ǂ����悤���H�]";
		next;
		if(select("�E��","���̂܂܂ɂ��Ă���") == 2) {
			mes "�]���̏�𗧂��������]";
			close;
		}
		if(checkitemblank() == 0){
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(rand(100) < 25) {
			mes "�]���ɏ����Ȑ΂������B";
			mes "�@����ł͓����Ă�";
			mes "�@����͂��Ȃ����낤�]";
		}
		else {
			getitem 7049,1;
			mes "�]�傫�Ȑ΂��E�����B";
			mes "�@�l�ɓ�������";
			mes "�@���Ɋ댯���낤�]";
			set QUE3_VER,QUE3_VER + 1;
		}
	}
	close2;
	initnpctimer;
	hideonnpc; //59039
	end;
OnTimer30000:
	stopnpctimer;
	hideoffnpc; //59039
	end;
}
verus03.gat,119,17,4	duplicate(???#EP15_1D_01)	???#EP15_1D_02	550	/* 59294 */
verus03.gat,163,33,4	duplicate(???#EP15_1D_01)	???#EP15_1D_03	550	/* 59295 */
verus03.gat,207,47,4	duplicate(???#EP15_1D_01)	???#EP15_1D_04	550	/* 59296 */
verus03.gat,225,245,4	duplicate(???#EP15_1D_01)	???#EP15_1D_05	550	/* 59297 */
verus03.gat,169,181,4	duplicate(???#EP15_1D_01)	???#EP15_1D_06	550	/* 59298 */
verus03.gat,122,139,4	duplicate(???#EP15_1D_01)	???#EP15_1D_07	550	/* 59299 */
verus03.gat,80,230,4	duplicate(???#EP15_1D_01)	???#EP15_1D_08	550	/* 59300 */
verus03.gat,42,105,4	duplicate(???#EP15_1D_01)	???#EP15_1D_09	550	/* 59301 */
verus03.gat,99,235,4	duplicate(???#EP15_1D_01)	???#EP15_1D_10	550	/* 59302 */
verus03.gat,81,207,4	duplicate(???#EP15_1D_01)	???#EP15_1D_11	550	/* 59303 */
verus03.gat,226,243,4	duplicate(???#EP15_1D_01)	???#EP15_1D_12	550	/* 59304 */
verus03.gat,148,144,4	duplicate(???#EP15_1D_01)	???#EP15_1D_13	550	/* 59305 */
verus03.gat,74,44,4		duplicate(???#EP15_1D_01)	???#EP15_1D_14	550	/* 59306 */
verus03.gat,20,54,4		duplicate(???#EP15_1D_01)	???#EP15_1D_15	550	/* 59307 */
verus03.gat,74,212,4	duplicate(???#EP15_1D_01)	???#EP15_1D_16	550	/* 59308 */
verus03.gat,42,47,4		duplicate(???#EP15_1D_01)	???#EP15_1D_17	550	/* 59309 */
verus03.gat,80,195,4	duplicate(???#EP15_1D_01)	???#EP15_1D_18	550	/* 59310 */
verus03.gat,134,72,4	duplicate(???#EP15_1D_01)	???#EP15_1D_19	550	/* 59311 */
verus03.gat,45,45,4		duplicate(???#EP15_1D_01)	???#EP15_1D_20	550	/* 59312 */
verus03.gat,115,235,4	duplicate(???#EP15_1D_01)	???#EP15_1D_21	550	/* 59313 */
verus03.gat,76,194,4	duplicate(???#EP15_1D_01)	???#EP15_1D_22	550	/* 59314 */
verus03.gat,166,32,4	duplicate(???#EP15_1D_01)	???#EP15_1D_23	550	/* 59315 */
verus03.gat,121,42,4	duplicate(???#EP15_1D_01)	???#EP15_1D_24	550	/* 59316 */
verus03.gat,141,36,4	duplicate(???#EP15_1D_01)	???#EP15_1D_25	550	/* 59317 */

verus04.gat,187,219,4	script	�΂�#EP15_1D_01	527,{/* 59318 */
	if(!checkquest(5317))
		end;
	if(QUE3_VER >= 10) {
		mes "�]�ǂ��ɂł����肻����";
		mes "�@�X�Ƃ����΂݂��]";
		close;
	}
	mes "�]�򑐂����肻���Ȗ΂݂��B";
	mes "�@�ǂ����悤���H�]";
	next;
	if(select("�̏W����","���̂܂܂ɂ��Ă���") == 2) {
		mes "�]���̏�𗧂��������]";
		close;
	}
	progressbar 2; //color=0xffff00
	if(rand(100) < 25) {
		if(checkitemblank() == 0){
			// �{�Ƃ̓`�F�b�N�Ȃ�
		}
		else {
			getitem 6754,1;
			mes "�]�򑐂̍̏W�ɐ��������]";
		}
		set QUE3_VER,QUE3_VER + 1;
	}
	else {
		mes "�]�򑐂͌�����Ȃ������]";
	}
	close2;
	initnpctimer;
	hideonnpc; //59064
	end;
OnTimer120000:
	stopnpctimer;
	hideoffnpc; //59064
	end;
}
verus04.gat,167,206,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_02	527	/* 59319 */
verus04.gat,198,198,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_03	527	/* 59320 */
verus04.gat,143,205,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_04	527	/* 59321 */
verus04.gat,125,265,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_05	527	/* 59322 */
verus04.gat,92,203,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_06	527	/* 59323 */
verus04.gat,97,204,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_07	527	/* 59324 */
verus04.gat,85,189,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_08	527	/* 59325 */
verus04.gat,64,191,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_09	527	/* 59326 */
verus04.gat,55,185,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_10	527	/* 59327 */
verus04.gat,42,185,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_11	527	/* 59328 */
verus04.gat,29,189,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_12	527	/* 59329 */
verus04.gat,40,223,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_13	527	/* 59330 */
verus04.gat,32,240,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_14	527	/* 59331 */
verus04.gat,27,243,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_15	527	/* 59332 */
verus04.gat,34,248,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_16	527	/* 59333 */
verus04.gat,52,251,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_17	527	/* 59334 */
verus04.gat,72,247,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_18	527	/* 59335 */
verus04.gat,75,243,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_19	527	/* 59336 */
verus04.gat,81,252,4	duplicate(�΂�#EP15_1D_01)	�΂�#EP15_1D_20	527	/* 59337 */

yuno_fild07.gat,211,179,5	script	���@�n�ē��l#atd07	868,{/* 60509 */
	mes "[���@�n�ē��l]";
	mes "�t�@���^�X�}�S���J�v���W�F�N�g��";
	mes "���@�n�܂ōs�����ł����H";
	next;
	mes "[���@�n�ē��l]";
	mes "�V�����������ꂽ��ՁA";
	mes "^4d4dff�E�F���X�V�e�B^000000��";
	mes "�W���s���X���̒ʘH����";
	mes "�s�����Ƃ��ł��܂��B";
	next;
	mes "[���@�n�ē��l]";
	mes "�W���s���X�̓�����";
	mes "���̌��̒��𔲂�����ɂ���܂���B";
	mes "�����X�^�[�������o�v���Ă��܂��̂ŁA";
	mes "�C�����Ă��������B";
	next;
	mes "[���@�n�ē��l]";
	mes "�܂��A���������ɍs�����Ƃ���ɂ�";
	mes "�E�F���X���@�n�ɒʂ���";
	mes "�G���x�[�^�[������܂���B";
	mes "���b�P���x���Ђŗ��p�ғo�^���s����";
	mes "���p���o���܂��B";
	close;
}

yuno_fild07.gat,216,157,5	script	�ē����G���V��#ep15_1bs	831,{/* 59884 */
	mes "[�G���V��]";
	mes "�͂�����";
	mes "���̃G���x�[�^�[�̗��p�ɂ�";
	mes "���p�ғo�^���K�v�Ł[���B";
	mes "������Ɠo�^�̊m�F������̂�";
	mes "���O�������Ă��炦�܂��H";
	emotion 3,"�ē����G���V��#ep15_1bs"; //59884
	next;
	switch(select("���O������","�m�F�葱���ɂ��ĕ���","�b���I����")) {
	case 1:
		if(VER2_QUE == 0) {
			mes "[�G���V��]";
			mes "���肪�Ƃ��������܁[���B";
			mes "�y���c�����A�����O�́c�c";
			mes strcharinfo(0)+ "�l�ł��ˁB";
			mes "�ł́A�m�F���Ă݂܂��B";
			next;
			mes "[�G���V��]";
			mes "����c�c�ǂ���烊�X�g��";
			mes "���O�͌�������Ȃ��悤�ł��˂��B";
			mes "���̃G���x�[�^�[���g�p����ɂ�";
			mes "�ʓr�A^FF0000�G���x�[�^�[�g�p���o�^^000000��";
			mes "�K�v�Ȃ̂ł��B";
			next;
			mes "[�G���V��]";
			mes "�����A���b�P���x���{�Ђ�";
			mes "^0000FF���C�g�i^000000�Ƃ���";
			mes "�����̓G�݂����Ȓj����";
			mes "������L�����Ȃ��̂ł���΁A";
			mes "�o�^�͂܂��̂͂��ł���B";
			emotion 19, "�ē����G���V��#ep15_1bs"; //60510
			next;
			menu "���b�P���x���{�Ђɍs���ƁH",-;
			break;
		}
		else if(VER2_QUE == 1) {
			mes "[�G���V��]";
			mes "���肪�Ƃ��������܁[���B";
			mes "�ł́A�m�F���Ă݂܂��˂��B";
			mes "�c�c�|�`���ƂȁB";
			mes "�ǂ����G���x�[�^�[�g�p���X�g��";
			mes strcharinfo(0)+ "�l��";
			mes "���O�͌�������Ȃ��悤�ł��˂��B";
			next;
			mes "[�G���V��]";
			mes "�����A���b�P���x���{�Ђ�";
			mes "^0000FF���C�g�i^000000�Ƃ���";
			mes "�����̓G�݂����Ȓj����";
			mes "������L�����Ȃ��̂ł���΁A";
			mes "�o�^�͂܂��̂͂��ł���B";
			emotion 19, "�ē����G���V��#ep15_1bs"; //60510
			next;
			menu "���b�P���x���{�Ђɍs���ƁH",-;
			break;
		}
		else if(VER2_QUE == 2) {
			mes "[�G���V��]";
			mes "�͂��͂��B";
			mes "�����O�́c�c";
			mes strcharinfo(0)+ "�l���Ɓc�c�B";
			emotion 3,"�ē����G���V��#ep15_1bs"; //59884
			next;
			mes "[�G���V��]";
			mes "���ꂶ�Ⴀ�A�m�F���Ă݂܂��ˁB";
			mes "�c�c�|�`���ƂȁB";
			mes "���[���Ɓc�c�͂��B";
			mes "�m���ɓo�^����Ă��܂��ˁB";
			mes "����ł�^0000FF�E�F���X�V�e�B�Ɉړ�^000000���܂����H";
			next;
			if(select("�ړ�����","�ړ����Ȃ�") == 2) {
				mes "[�G���V��]";
				mes "�킩��܂����B";
				mes "���������p�̍ۂ�";
				mes "���������������������B";
				mes "����ł͗ǂ�������I";
				emotion 3,"�ē����G���V��#ep15_1bs"; //59884
				close;
			}
			mes "[�G���V��]";
			mes "����ł͍������ɁA";
			mes "�����}�ŃE�F���X�V�e�B��";
			mes "�����肵�܂��B";
			next;
			mes "[�G���V��]";
			mes "�Ȃ��A�����ɂđ�������A";
			mes "�ӂ������肷��Ǝ��̂�";
			mes "�N����\��������܂��̂�";
			mes "�����Ӊ������B";
			next;
			mes "[�G���V��]";
			mes "�����ł��܂����H";
			mes "����ł͈��S�Ȗ`����";
			mes "�Ȃ鎖���F��܂��I";
			mes "�����Ă�c�c";
			emotion 3,"�ē����G���V��#ep15_1bs"; //59884
			next;
			mes "^FF0000�]�s�[�[�[�[�b!!�]";
			mes "�@";
			mes "�V�X�e���G���[�ł��B";
			mes "���̂��ߌ��݂��̃G���x�[�^�[��";
			mes "�g�p���邱�Ƃ͂ł��܂���]^000000";
			emotion 23,""; //self
			next;
			mes "[�G���V��]";
			mes "�c�c�B";
			mes "�c�c����H";
			mes "�҂��ĉ������H";
			emotion 19,"�ē����G���V��#ep15_1bs"; //59884
			next;
			mes "^FF0000�]�s�[�[�[�[�b!!�]";
			mes "�@";
			mes "�V�X�e���G���[�ł��B";
			mes "���̂��ߌ��݂��̃G���x�[�^�[��";
			mes "�g�p���邱�Ƃ͂ł��܂���]^000000";
			emotion 23,""; //self
			next;
			mes "[�G���V��]";
			mes "�������!?";
			mes "�ǁc�c�ǂ������񂾂낤�I";
			mes "������Ɓ[!?�@�@�������Ă�!?";
			emotion 19,"�ē����G���V��#ep15_1bs"; //59884
			next;
			mes "^FF0000�]�s�[�[�[�[�b!!�]";
			mes "�@";
			mes "�V�X�e���G���[�ł��B";
			mes "���̂��ߌ��݂��̃G���x�[�^�[��";
			mes "�g�p���邱�Ƃ͂ł��܂���]^000000";
			emotion 23,""; //self
			next;
			mes "[�G���V��]";
			mes "���₾�I�@�ǂ����悤�I";
			mes "��ꂽ�̂���!?";
			mes "�������A�d�ʒ��ߐ��O�̐l����";
			mes "�悹������������c�c�B";
			mes "�ǁA�ǂ�����c�c�B";
			emotion 23,"�ē����G���V��#ep15_1bs"; //59884
			next;
			mes "^FF0000�]�s�[�[�[�[�b!!�]";
			mes "�@";
			mes "�V�X�e���G���[�ł��B";
			mes "���̂��ߌ��݂��̃G���x�[�^�[��";
			mes "�g�p���邱�Ƃ͂ł��܂���]^000000";
			emotion 23,""; //self
			next;
			mes "[�G���V��]";
			mes "���݂܂���c�c";
			mes strcharinfo(0)+ "�l�I";
			mes "���������o�^���Ă����܂�";
			mes "���Ē������̂ɁA";
			mes "�}�ɋ@�B����ꂽ�悤�ł��B";
			mes "����Ȏ��A���߂āc�c�B";
			emotion 19,"�ē����G���V��#ep15_1bs"; //59884
			emotion 23,""; //self
			next;
			mes "[�G���V��]";
			mes "�G���x�[�^�[�����Ȃ��̂ŁA";
			mes "�����O�̏���Ŗ�肪�N���Ă�c�c�H";
			mes "�ǂ���ɂ���A���݂܂���B";
			mes "�C���H���Ă�ŏC�����܂��̂�";
			mes "�G���x�[�^�[���g�킸�A�k����";
			mes "�������Ă��������܂����H";
			next;
			mes "[�G���V��]";
			mes "�k���ōs�������ł���";
			mes "���̈ʒu�ɂ���^0000FF���@�n�ē��l^000000��";
			mes "���΂ɂ�����̒��ɓ�����";
			mes "���Ȃ�ɐi��Œ�����΁A�����͂��ł��B";
			mes "��������x����ɓ��𕷂���";
			mes "���Ă��������B";
			viewpoint 1,210,175,1,0xFF8000; //59884
			next;
			mes "[�G���V��]";
			mes "�Ȃ��A�W���s���X�p�ЊO���ɂ���";
			mes "���쑤�̓�������";
			mes "�쑤�Ɉړ�������A";
			mes "���A�𔲂����";
			mes "^0000FF�E�F���X�V�e�B^000000�ł��B";
			next;
			mes "[�G���V��]";
			mes "���Ȃ݂ɃE�F���X�V�e�B��";
			mes "4�̒n��ɕ�����Ă��܂��B";
			mes "���炭�����čŏ��ɒ����̂́A";
			mes "^0000FF�E�F���X���@�n^000000�ƌĂ΂��ꏊ�ŁA";
			mes "����A��肪�N�����G���x�[�^�[��";
			mes "�����ɏ��ꂪ�����ł��B";
			next;
			mes "[�G���V��]";
			mes "�����A�E�F���X���@�n�ɒ�������";
			mes "�k���ɂ��钆��������߂��ɍs��";
			mes "�����ɂ���A^0000FF�ē����X�J�[���b�g^000000��";
			mes "�ǂ�������g�p�ł��Ȃ��������A";
			mes "�m�F���Ă��������܂��񂩁H";
			mes "�{���ɂ��݂܂���c�c�B";
			emotion 28,"�ē����G���V��#ep15_1bs"; //59884
			delquest 11364;
			setquest 11365;
			set VER2_QUE,3;
			close;
		}
		else if(VER2_QUE == 3) {
			mes "[�G���V��]";
			mes "���A" +strcharinfo(0)+ "�l�I";
			mes "�����܂���A�܂��G���x�[�^�[��";
			mes "�C�����ς�ł��Ȃ���ł��c�c�B";
			mes "���������ł����A�k���ł��s���܂�����";
			mes "�E�F���X�V�e�B�ւ́A";
			mes "�k���Ō������Ē����܂����H";
			next;
			mes "[�G���V��]";
			mes "�k���ōs�������ł���";
			mes "���̈ʒu�ɂ���^0000FF���@�n�ē��l^000000��";
			mes "���΂ɂ�����̒��ɓ�����";
			mes "���Ȃ�ɐi��Œ�����΁A�����͂��ł��B";
			mes "��������x����ɓ��𕷂���";
			mes "���Ă��������B";
			viewpoint 1,210,175,1,0xFF8000; //59884
			next;
			mes "[�G���V��]";
			mes "�W���s���X�p�ЊO���ɂ���";
			mes "���쑤�̓�������";
			mes "�쑤�Ɉړ�������A";
			mes "���A�𔲂����";
			mes "�������A�E�F���X�V�e�B�ł��B";
			next;
			mes "[�G���V��]";
			mes "���Ȃ݂ɃE�F���X�V�e�B��";
			mes "4�̒n��ɕ�����Ă��܂��B";
			mes "���炭�����čŏ��ɒ����̂́A";
			mes "^0000FF�E�F���X���@�n^000000�ƌĂ΂��ꏊ�ŁA";
			mes "����A��肪�N�����G���x�[�^�[��";
			mes "�����ɏ��ꂪ�����ł��B";
			next;
			mes "[�G���V��]";
			mes "�����A�E�F���X���@�n�ɒ�������";
			mes "�k���ɂ��钆��������߂��ɍs��";
			mes "�����ɂ���A^0000FF�ē����X�J�[���b�g^000000��";
			mes "�ǂ�������g�p�ł��Ȃ��������A";
			mes "�m�F���Ă��������܂��񂩁H";
			mes "�{���ɂ��݂܂���c�c�B";
			emotion 28,"�ē����G���V��#ep15_1bs"; //59884
			close;
		}
		mes "[�G���V��]";
		mes strcharinfo(0)+ "�l�B";
		mes "�o�^���m�F�ł��܂����B";
		mes "�E�F���X�V�e�B�Ɉړ����܂����H";
		emotion 3,"�ē����G���V��#ep15_1bs"; //59884
		next;
		if(select("�ړ�����","�ړ����Ȃ�") == 2) {
			mes "[�G���V��]";
			mes "�킩��܂����B";
			mes "���������p�̍ۂ�";
			mes "���������������������B";
			mes "����ł͗ǂ�������I";
			close;
		}
		mes "[�G���V��]";
		mes "����ł͍������ɁA";
		mes "�E�F���X�V�e�B��";
		mes "�����肵�܁[���B";
		mes "�����ɂđ�������A�ӂ������肷���";
		mes "���̂��N����\��������܂��̂�";
		mes "�����Ӊ������B";
		close2;
		warp "verus04.gat",122,217;
		end;
	case 2:
		mes "[�G���V��]";
		if(VER2_QUE == 0) {
			mes "�ǂ����ď��F��Ƃ��K�v�Ȃ̂��A";
			mes "���������Ƃ������Ƃł��ˁB";
			mes "���������܂��B";
			mes "���̃G���x�[�^�[��";
			mes "^0000FF�E�F���X�V�e�B^000000��";
			mes "�ړ����邽�߂̋@�B�ŁA";
		}
		else if(VER2_QUE == 1) {
			mes "�ӂӂӁI";
			mes "���̃G���x�[�^�[��";
			mes "^0000FF�E�F���X�V�e�B^000000��";
			mes "�ȒP�Ɉړ����邽�߂̂��̂ŁA";
		}
		else {
			mes "�ӂӂӁI";
			mes "���̎{�݂�^0000FF�E�F���X�V�e�B^000000��";
			mes "�ړ����邽�߂̋@�B�ŁA";
		}
		next;
		mes "[�G���V��]";
		mes "�y���c�Ƌ��񂵂�";
		mes "�t�@���^�X�}�S���J���@�c��";
		mes "�����Ŏg�p�ł���悤��";
		mes "���b�P���x���Ђ���";
		mes "�x�����܂����B";
		next;
		mes "[�G���V��]";
		if(VER2_QUE == 0) {
			mes "���̂��߂������";
			mes "�G���x�[�^�[���g�p���邽�߂ɂ�";
			mes "���b�P���x���ЂɂāA";
			mes "�g�p�o�^���K�v�ł��B";
		}
		else if(VER2_QUE == 1) {
			mes "�Ȃ̂ŁA���̃G���x�[�^�[��";
			mes "�g�p���邽�߂ɂ�";
			mes "�y���c�������͔��@�c�ւ̓o�^�A";
			mes "�����āA���b�P���x���Ђ�";
			mes "�G���x�[�^�[�g�p�o�^��";
			mes "�K�v�ł��B";
		}
		else {
			mes "���̃G���x�[�^�[���g�p���邽�߂ɂ�";
			mes "�y���c�������͔��@�c�ւ̓o�^�A";
			mes "�����āA���b�P���x���Ђ�";
			mes "�G���x�[�^�[�g�p�o�^���K�v�ł��B";
		}
		next;
		mes "[�G���V��]";
		if(VER2_QUE == 0) {
			mes "�g�p�o�^��";
			mes "^0000FF���b�P���x���{��^000000�ɂĎ�t���ŁA";
			mes "�y���c�����̕��ł�����A";
			mes "�ȒP�Ȏ葱���ōςނ͂��ł��B";
		}
		else if(VER2_QUE == 1) {
			mes "�G���x�[�^�[�g�p�o�^��";
			mes "���b�P���x���{�ЂɂĎ�t���ŁA";
			mes "�g�p�o�^�ɂ͊ȒP�Ȋm�F��Ƃ�";
			mes "�\�ł���B";
		}
		else {
			mes "�G���x�[�^�[�g�p�o�^��";
			mes "^0000FF���b�P���x���{��^000000�ɂĎ�t���ŁA";
			mes "�y���c�������͔��@�c�ւ�";
			mes "�o�^�m�F�����ŉ\�ł��B";
			mes "����������܂����琥��A";
			mes "�o�^�����肢���܂���";
			close;
		}
		next;
		if(select("�ʒu�𕷂�","�b���I����") == 2) {
			mes "[�G���V��]";
			mes "����A������낵���ł����H";
			mes "����A�C����������";
			mes "���܂Ō��鎖�̏o���Ȃ�����";
			mes "�_��̈�ՁA�E�F���X�V�e�B��";
			mes "��x�͖K��Ă݂Ă��������ˁI";
			close;
		}
		mes "[�G���V��]";
		if(VER2_QUE == 0) {
			mes "�@�B�g�p�o�^�̓��q�^���[���ɂ���";
		}
		else {
			mes "�G���x�[�^�[�g�p�o�^��";
			mes "���q�^���[���ɂ���";
		}
		mes "���b�P���x���{�ЂP�K���������A";
		mes "���������ɂ���A�y�������Ȋ�̒j��";
		mes "^0000FF���C�g�i^000000�̂Ƃ����";
		mes "�\�ł���B";
		next;
		menu "���b�P���x���{�Ђɍs���ƁH",-;
		mes "[�G���V��]";
		mes "�͂��A���b�P���x���{�Ђł��B";
		mes "��������ł͏���������";
		mes "����܂������ς���";
		mes "����܂���ˁB";
		mes "�܂��A�����Ă������ς�";
		mes "�\���������ł����c�c�B";
		break;
	case 3:
		mes "[�G���V��]";
		mes "�����܂��A�����������Ƃ�";
		mes "����ꍇ�́A";
		mes "���C�y�ɂ�����������";
		mes "���������ˁ`�B";
		close;
	}
	next;
	mes "[�G���V��]";
	mes "������A�\������΂Ȃ�Ƃ��c�c�B";
	mes "�����܂���A�Ăяo���ł��c�c�B";
	mes "�@";
	mes "^0000FF�]�G���V���͖ʓ|������";
	mes "�@�C���J���^�}�C�N��";
	mes "�@�X�C�b�`����ꂽ�]^0000FF";
	emotion 23,"�ē����G���V��#ep15_1bs"; //59884
	next;
	mes "[�G���V��]";
	mes "�͂��A�G���V���ł��c�c�B";
	mes "�c�c���������Ă��ł����I";
	mes "�d�����ł���!?";
	mes "�����荡����o�^�̂��߂�";
	mes "������ɂ��q�l���s���܂�����A";
	mes "�����ƑΉ����Ă���������!?";
	next;
	mes "[�G���V��]";
	mes "����!?�@�����͒莞�ɂ����肽��!?";
	mes "40�b�ł��āA�����ɂ��܂��Ă�ł���!!";
	mes "�c�c���A����Ȃ�]�����u�ő���!?";
	mes "����A������c�c�I";
	mes "�E�����p�[��!!�@���Đ؂�ȁ[��!?";
	next;
	mes "^0000FF�]�G���V���͉�����������悤��";
	mes "�@�\��ŁA�������U��Ԃ����]^0000FF";
	emotion 9, "�ē����G���V��#ep15_1bs"; //60510
	next;
	mes "[�G���V��]";
	mes "�c�c�͂��c�c�{���A���̐l�́c�c�B";
	mes "�����܂���A�S���҂��ǂ����";
	mes "�厖�ȗp��������炵���A�{�Ђ܂�";
	mes "�Ȃ�ׂ���������悤�ɂƁc�c�B";
	mes "�����X������Γ]�����u�ł�������";
	mes "���b�P���x���{�Ђɂ����肵�܂��c�c�B";
	if(checkquest(11363) == 0)
		setquest 11363;
	set '@flag,VER2_QUE;
	if(VER2_QUE == 0)
		set VER2_QUE,1;
	next;
	if(select("�ړ�����","�ړ����Ȃ�") == 2) {
		mes "[�G���V��]";
		mes "������܂����B";
		mes "����������܂�����";
		mes "�]�����u���g��Ȃ�";
		mes "�ړ��͑�ς����ł����ǁA";
		mes "���C�����āB";
		close;
	}
	mes "[�G���V��]";
	if('@flag == 0) {
		mes "�͂��c�c�B";
		mes "�ł́A���b�P���x���{��";
		mes "�P�K�ւ܂���܂��B";
		mes "�����h��܂�����A";
		mes "����Ȃ��悤�ɂ��C�����āB";
	}
	else {
		mes "�{���A�Ȃ�ł���Ȓj��";
		mes "�厖�ȕ����̒S���Ȃ񂾂�c�c�B";
		mes "���A���炵�܂����B";
		mes "�ł́A�]�����u�Ń��b�P���x���{�Ђ�";
		mes "�����肢�����܂��B";
		mes "���ꂮ����ނɂ͂��C�����āc�c�B";
	}
	close2;
	warp "lhz_in01.gat",79,203;
	end;
OnInit:
	waitingroom "�n����ՃA�h�x���`���[",0; //59884
	end;
}

yuno_fild07.gat,218,154,3	script	�`����#ep15_1el01	937,{/* 60511 */
	mes "[�`����]";
	mes "�����c�c�B";
	mes "�����s���Ă݂���!!";
	mes "�ǂ����Ď��͓����";
	mes "����Ȃ��񂾂�`�I";
	close;
}

yuno_fild07.gat,218,159,5	script	�`����#ep15_1el02	907,{/* 60512 */
	mes "[�`����]";
	mes "���߂����I";
	mes "����̌���w�K�ۑ��";
	mes "�E�F���X�K��L�ɂ���I";
	next;
	mes "[�`����]";
	mes "����Ȃ炠�̌�����������";
	mes "A+�P�ʂ�����邾�낤�����I";
	close;
}

yuno_fild07.gat,221,157,3	script	�`����#ep15_1el03	819,{/* 60513 */
	mes "[�`����]";
	mes "�͂�������!!";
	mes "���N�ȓ��̂Ɍ��N�Ȑ��_�I";
	mes "�ƂĂ��C�C�c�c!!";
	mes "���������̓��̂͋P���Ă���!!";
	close;
}

yuno_fild07.gat,221,155,8	script	�`����#ep15_1el04	749,{/* 60514 */
	mes "[�`����]";
	mes "�E�F���X�ɍs���Ȃ�A";
	mes "�|�[�V�����͗]�T��������";
	mes "�p�ӂ��������ǂ���������ȁH";
	close;
}

yuno_fild07.gat,217,155,5	script	�`����#ep15_1el05	747,{/* 60515 */
	mes "[�`����]";
	mes "���b�P���x���ЂɂĂ����܂�";
	mes "�x�����Ă����Ƃ́c�c�B";
	mes "���̉�Ђ̎��Y�͒�Ȃ���!?";
	close;
}

yuno_fild07.gat,225,166,3	script	���l#ep15_1el06	553,{/* 60516 */
	mes "[���l]";
	mes "���ف[�I";
	mes "���̏ꏊ�A�����ɗǂ������Ɍ�����!!";
	mes "�����ŉ��̏��������悤���j�����B";
	close;
}

yuno_fild07.gat,225,144,1	script	�`����#ep15_1el07	59,{/* 60517 */
	mes "[�`����]";
	mes "�G���x�[�^�[�Ƃ́c�c�B";
	mes "�V���o���c�o���h�̉Ȋw�͂�";
	mes "�{���ɐ����ł��ˁI";
	close;
}

yuno_fild07.gat,217,149,3	script	�`����#ep15_1el08	726,{/* 60518 */
	mes "[�`����]";
	mes "�Ñ㕶���Ƃ����̂́A";
	mes "�{���ɐ����Ȃ��H ";
	next;
	mes "[�`����]";
	mes "��́A���ƌꊴ�������";
	mes "���o�C�Ƃ������c�c�B";
	mes "���q�͂Ȃ�ʃ��}���͂�";
	mes "��ꂩ�����Ă��˂��I";
	close;
}

yuno_fild07.gat,224,152,3	script	�`����#ep15_1el09	881,{/* 60519 */
	mes "[�`����]";
	mes "�ǂ����Ă���Ȃɐl��";
	mes "�����W�܂��Ă���񂾁H";
	mes "���Ă��邾���ŁA�l�ɐ����������B";
	close;
}

lhz_in01.gat,75,209,3	script	���C�g�i#ep15_1bs	865,{/* 60546 */
	if(VER2_QUE == 0) {
		mes "[���C�g�i]";
		mes "�͂��I�@����ɂ��́`�I";
		mes "�����q����񂩂��";
		mes "���肢�Ȃ炢����ł�";
		mes "�������Ⴄ���C�g�i";
		mes "���Z���񂾂�`�I";
		emotion 30,"���C�g�i#ep15_1bs"; //60546
		next;
		mes "[���C�g�i]";
		mes "���߂�˂��B";
		mes "���Z���񍡂�����ƁA";
		mes "�f�[�g�̏��Ԃ����߂�̂�";
		mes "�Z��������܂��A";
		mes "���x�A���Ăˁ`�I";
		close;
	}
	else if(VER2_QUE == 1) {
		mes "[���C�g�i]";
		mes "�͂��I�@����ɂ��́`�I";
		mes "�����q����񂩂��";
		mes "���肢�Ȃ炢����ł�";
		mes "�������Ⴄ���C�g�i";
		mes "���Z���񂾂�`�I";
		emotion 30,"���C�g�i#ep15_1bs"; //60546
		next;
		menu "�o�^�ɂ��ĕ���",-;
		mes "[���C�g�i]";
		mes "���`���������āA";
		mes "�G���V���̌����Ă��l�H";
		mes "�����́A�����I";
		mes "�E�F���X�ɍs�����߂�";
		mes "�G���x�[�^�[���g�p���邽�߂�";
		mes "���O��o�^����Ƃ��낳�I";
		emotion 9,"���C�g�i#ep15_1bs"; //60546
		next;
		mes "[���C�g�i]";
		mes "���̎d�����ŏ��ɗ��܂ꂽ���́A";
		mes "�l�p������Ǘ����₷���������ǁ`�B";
		next;
		mes "[���C�g�i]";
		mes "����������Ȃ�A";
		mes "�u�o�^����Ύg����悤��";
		mes "�K������肵������v�ƌ����A";
		mes "���Z����Ɉꌾ�����킸�A�o�^�����";
		mes "�N�ł�����悤�A�I�[�v���ȏ�Ԃ�";
		mes "���Ă��܂����񂾂�`�I";
		next;
		mes "[���C�g�i]";
		mes "�����A�����{���Ɂc�c";
		mes "�߂����肵�A���X�����������c�c�B";
		mes "�������ňȑO�̂悤�ɁA";
		mes "�d�����ɉ����q����񂽂���";
		mes "��ɍs�����Ԃ�������`�B";
		emotion 26,"���C�g�i#ep15_1bs"; //60546
		next;
		mes "[���C�g�i]";
		mes "�Ƃɂ������G�Ȏ菇�͂Ȃ����A";
		mes "�����I��点�悤�B";
		mes "�N�͊y���c�������Ċ炵�Ă邵";
		mes "�m�F���ʓ|������A�����ɖ��O��";
		mes "�����Ă���邾���ł�����`�B";
		mes "�ق�A�ȒP����`�H";
		next;
		mes "[���C�g�i]";
		mes "�ǂ����J��������肾�����Ȃ�";
		mes "�o�^�Ȃ�Ă��Ȃ��Ă������悤��";
		mes "����Ă����Ίy�������̂Ɂc�c�B";
		mes "�S���A���Z����̓s�����l����";
		mes "�ق�����ˁ`�H";
		mes "���ꂶ��A�o�^�����`�B";
		next;
		mes "^0000FF�]�s�b�c�c�s�b�c�c�B";
		mes "�@";
		mes "�@���̃G���x�[�^�[���g�p���邽�߂�";
		mes "�@�����o�[�o�^�����]^000000";
		delquest 11363;
		setquest 11364;
		set VER2_QUE,2;
		next;
		mes "[���C�g�i]";
		mes "�n�j�`�B";
		mes "�I������I";
		mes "�o�^�͏I��������炱���";
		mes "�G���x�[�^�[���g����͂�����`�B";
		mes "���������΁c�c";
		next;
		mes "[���C�g�i]";
		mes "�ǂ�����ƌN�A���Z�����";
		mes "�D�݂̃^�C�v����`�I";
		mes "�ǂ��H�@�ǂ������炨�Z�����";
		mes "�]�����u�A����Ă����Ȃ��H";
		mes "�G���x�[�^�[�O�܂ő�����";
		mes "���Ȃ݂�Zeny�͂���Ȃ�����ˁ`��";
		next;
		if(select("���p����","���p���Ȃ�") == 2) {
			mes "[���C�g�i]";
			mes "�����[��A�c�O�B";
			mes "���b�P���x���ɂ͗D����";
			mes "�������������Z���񂪂������";
			mes "��`���ė~���������̂ɂȂ��B";
			mes "���ꂶ��A�܂��ǂ�������";
			mes "��ɗ��Ăˁ`�B";
			close;
		}
		mes "[���C�g�i]";
		mes "�������Ȃ��Ƃˁ�";
		mes "���̂����ɁA";
		mes "�N�̂��F�B�̏��̎q��";
		mes "���b�P���x���ɗD��������������";
		mes "���Z���񂪂�����Đ�`���Ăˁ`�B";
		mes "���ꂶ��A�]�������`�B";
		close2;
		warp "yuno_fild07.gat",221,151;
		end;
	}
	else if(VER2_QUE == 2) {
		mes "[���C�g�i]";
		mes "�ǂ������J������肾�����Ȃ�";
		mes "�o�^�Ȃ�Ă��Ȃ��Ă������悤��";
		mes "����Ă���Ίy�������̂Ɂ`�B";
		mes "���Z����̎d���������";
		mes "���₳�Ȃ��łق����ˁ`�B";
		next;
		mes "[���C�g�i]";
		mes "����H�@�܂������́H";
		mes "�o�^�͏I��������炱���";
		mes "�G���x�[�^�[���g����͂�����`�B";
		next;
		mes "[���C�g�i]";
		mes "���A���������āc�c";
		mes "�]�����u�A����Ă����̂��ȁH";
		mes "�G���V���̑҂��Ă���";
		mes "�G���x�[�^�[�O�܂ő�����";
		mes "���Ȃ݂�Zeny�͂���Ȃ�����ˁ`��";
		next;
		if(select("���p����","���p���Ȃ�") == 2) {
			mes "[���C�g�i]";
			mes "�����[��A�c�O�B";
			mes "���b�P���x���ɂ͗D����";
			mes "�������������Z���񂪂������";
			mes "��`���ė~���������̂ɂȂ��B";
			mes "���ꂶ��A�܂��ǂ�������";
			mes "��ɗ��Ăˁ`�B";
			close;
		}
		mes "[���C�g�i]";
		mes "�������Ȃ��Ƃˁ�";
		mes "���̂����ɁA";
		mes "�N�̂��F�B�̏��̎q��";
		mes "���b�P���x���ɗD��������������";
		mes "���Z���񂪂�����Đ�`���Ăˁ`�B";
		mes "���ꂶ��A�]�������`�B";
		close2;
		warp "yuno_fild07.gat",221,151;
		end;
	}
	mes "[���C�g�i]";
	mes "�ŋ߁A�g�p�҂������Ȃ���";
	mes "�����̏�����Ă���݂������ˁ`�B";
	mes "���`���c�c�i���p�ɍs�������c�c�B";
	mes "���Z����A�₵���肾����";
	mes "�����q�����̏Ί�����Ȃ���";
	mes "���񂶂Ⴄ��`�B";
	emotion 26, "���C�g�i#ep15_1bs"; //60478
	close;
OnInit:
	waitingroom "�G���x�[�^�[�o�^",0; //60546
	end;
}
verus04.gat,119,220,3	script	�ē����X�J�[���b�g#ep15	125,{/* 59390 */
	if(VER2_QUE < 3) {
		mes "[�X�J�[���b�g]";
		mes "���̎{�݂̓E�F���X��";
		mes "�ړ����邽�߂̋@�B�ł��B";
		next;
		mes "[�X�J�[���b�g]";
		mes "�y���c�Ƌ��񂵂�";
		mes "�t�@���^�X�}�S���J���@�c��";
		mes "�����Ŏg�p�ł���悤��";
		mes "���b�P���x���Ђ���";
		mes "�x�����܂����B";
		next;
		mes "[�X�J�[���b�g]";
		mes "���̋@�B���g�p���邽�߂ɂ�";
		mes "�y���c���@�c�o�^��";
		mes "���b�P���x���Ђ�";
		mes "�@�B�g�p�o�^�m�F���K�v�ł��B";
		next;
		mes "[�X�J�[���b�g]";
		mes "�@�B�g�p�o�^��";
		mes "���b�P���x���{�ЂɂĎ�t���ł����A";
		mes "�y���c���@�c��";
		mes "�����m�F�����ŉ\�ł��B";
		next;
		mes "[�X�J�[���b�g]";
		mes "���ׂĂ̓o�^�����������ꍇ�́A";
		mes "�o�^�󋵂��m�F������A";
		mes "�g�p���Ē����悤��";
		mes "���肢���܂��B";
		close;
	}
	else if(VER2_QUE == 3) {
		mes "[�X�J�[���b�g]";
		mes "��Ȃ�����Ȃ��ł����I";
		mes "�G���x�[�^�[�̒���";
		mes "�ӂ����Ȃ��ł��������I";
		emotion 6,"�ē����X�J�[���b�g#ep15"; //59136
		next;
		mes "[�X�J�[���b�g]";
		mes "�m�����O�ɓ����ł�";
		mes "��΂ӂ����Ă͂Ȃ�Ȃ���";
		mes "�������͂��ł���!?";
		next;
		mes "[�X�J�[���b�g]";
		mes "����ȕ��ɔ����ւ��ނق�";
		mes "����������̂ł���!?";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�{���ɂ��݂܂���c�c�B";
		mes "���������O��";
		mes "�\��Ă��܂��āc�c�B";
		emotion 19,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark3",2;
		next;
		mes "[�e���[���A��]";
		mes "���̒��x�ŉ��Ă��܂�";
		mes "�@�B���ǂ������";
		mes "�M���ď��Ƃ�����!?";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���邳���I";
		mes "�ق�A�������̐l��";
		mes "���݂܂���ł����Ǝӂ�I";
		emotion 6,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark4",2;
		next;
		mes "[�e���[���A��]";
		mes "��̂�����������!!";
		mes "����ȑ�l��������ȓ��̂̂���Ȃ�";
		mes "�@�B�ɉ������߂�Ȃ��!!";
		mes "�������N�����ザ��A�x���񂾂�!?";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c�B";
		emotion 6,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark4",2;
		next;
		mes "[�^�}����]";
		mes "������ӂ����Ȃ��ł���������";
		mes "���̐l���������̂ł́c�c�B";
		emotion 23,"�^�}����#ep15_1elb"; //59140
		cutin "ep143_taang",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�Ƃ肠�������n�b�L�����Ă���̂�";
		mes "�����ݍ����Ă���ꍇ�ł͂Ȃ�";
		mes "�ƁA�������Ƃ��B";
		mes "���A�����ƂĂ��s����ȏ�Ԃ��B";
		mes "����ȏ�Ԃł͗���������";
		mes "�b�����Ƃ��܂܂Ȃ�Ȃ��B";
		emotion 19,"�A���v�I�J�[�g#ep15_1el"; //59141
		cutin "bu_alp2",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "�c�c�m���ɂ����ł��ˁB";
		mes "�܂��͍~��đ����C�������Ȃ���";
		mes "�����Ƒ�ςȂ��ƂɂȂ��Ă��炶��";
		mes "��x��ł����c�c�B";
		cutin "bu_alp2",255;
		next;
		mes "^FF0000�|�K�N���b�c�c�|^000000";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		emotion 23,"�}�[�N�C�V��#ep15_1elb"; //59139
		emotion 23,"�^�}����#ep15_1elb"; //59140
		emotion 23,"�A���v�I�J�[�g#ep15_1el"; //59141
		emotion 23,"�}�M�X�e�B��#ep15_1elb"; //59142
		next;
		mes "[�}�M�X�e�B��]";
		mes "���Ⴀ�����������I";
		emotion 23,"�}�M�X�e�B��#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		next;
		mes "[�e���[���A��]";
		mes "���킠��!?";
		mes "�ȁA�Ȃ񂾁c�c!?";
		mes "���A�����������C�����邤������!?";
		emotion 19,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "�܁A�҂��Ă�������!!";
		mes "�Ƃ肠�����N�������Ȃ���!!";
		mes "����ԈႦ��Α厖�̂�";
		mes "�Ȃ���\�����A����܂�!!";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "bu_du5",255;
		next;
		mes "[�X�J�[���b�g]";
		mes "�����B";
		mes "�����̕�!!";
		mes "�����O�������Ă��������I";
		mes "������Ə����Ăق�����ł��I";
		emotion 26,"�ē����X�J�[���b�g#ep15"; //59136
		next;
		menu "���O�𖼏��",-;
		mes "[�X�J�[���b�g]";
		mes strcharinfo(0)+ "�l�ł���!?";
		mes "���肪�Ƃ��������܂��I";
		mes "�ł͑����Ȃ̂ł����c�c";
		next;
		mes "[�X�J�[���b�g]";
		mes "���A�������̒�����";
		mes "�N�����������牽���N���邩";
		mes "������Ȃ��A�댯�ȏ�ԂȂ̂ŁA";
		mes "�����x����ꂻ���Ȃ��̂�";
		mes "���������ė��Ă���܂��񂩁H";
		next;
		mes "[�X�J�[���b�g]";
		mes "���̏�Ԃł͏C���H��";
		mes "����܂ő҂͖̂����ł��c�c�B";
		mes "^FF0000�Â��S��30��^000000�ق�";
		mes "�����ė��Ē�����΁A";
		mes "�Ȃ�Ƃ��Ȃ肻���ł��I";
		next;
		mes "[�X�J�[���b�g]";
		mes "�Ȃ�ׂ����������Ă��Ă��������B";
		mes "���肢���܂�!!";
		delquest 11365;
		setquest 11366;
		set VER2_QUE,4;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[�X�J�[���b�g]";
		mes "�C��t����!!";
		mes "�݂�ȁA�����Ȃ��ł�������!!";
		next;
		mes "[�e���[���A��]";
		mes "���킠��!!";
		mes "���̂܂ܗ�����̂��c�c!?";
		mes "���͍����Ƃ���͍D������";
		mes "���ꂪ�s����ȏꏊ�͋�肾�[���I";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�^�}����]";
		mes "�s�g�Ȏ�������Ȃ��ł��������I";
		mes "�����������Ȃ��̂����ł������!?";
		emotion 6,"�^�}����#ep15_1elb"; //59140
		cutin "ep143_taang",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "��l�Ƃ��Â��ɂ��Ă��������I";
		mes "�{���ɍ������ł���������";
		mes "��ςȎ��ɂȂ�܂���!?";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "ep143_taang",255;
		next;
		if(countitem(7319) < 30) {
			mes "[�X�J�[���b�g]";
			mes "���A�������̒�����";
			mes "�N������������A";
			mes "�����N���邩�킩��܂���c�c�B";
			mes "^0000FF�����x����ꂻ���Ȃ��̂�^000000";
			mes "���������ė��Ă���܂��񂩁H";
			next;
			mes "[�X�J�[���b�g]";
			mes "^FF0000�Â��S��30��^000000�ق�";
			mes "�����ė��Ē�����΂Ȃ�Ƃ�";
			mes "�Ȃ肻���ł��I";
			mes "�����܂���A���肢���܂�!!";
			close;
		}
		mes "[�X�J�[���b�g]";
		mes "�����c�c�I";
		mes "���A��Ȃ���!!";
		mes "�Â��S�͗p�ӂł��܂���!?";
		mes "����ł͂������ł����̂ŁA";
		mes "�ЂƂ��A������";
		mes "���ꍞ��ł�������!!";
		delitem 7319,30;
		delquest 11366;
		setquest 118330;
		set VER2_QUE,5;
		next;
		mes "[�X�J�[���b�g]";
		mes "��v�ł͂Ȃ����ǁA";
		mes "�����̊ԁA�ς��Ă����΁c�c�B";
		mes "�F����I";
		mes "�������}������}����";
		mes "�~��܂��傤�I";
		next;
		menu "�Â��S�����Ԃɓ��ꍞ��",-;
		mes "[�X�J�[���b�g]";
		mes "���肪�Ƃ��������܂��B";
		mes "����Ȃ�b���͑��v�����ł��I";
		mes "�����A�����~��ĉ������I";
		mes "�S�łǂ�ق�";
		mes "�x�����邩�킩��܂���I";
		next;
		mes "[�e���[���A��]";
		mes "�ӂ����A���������I";
		mes "�����A�}�M!";
		mes "�������̎��������";
		mes "�Q�Ă��ɉ����񂾁I";
		cutin "bu_du4",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "�݂�Ȗ����ɍ~����";
		mes "�{���ɗǂ������ł��c�c�B";
		mes "����͒N�����䂷�邱�ƂȂ��A";
		mes "��������������悢�ł����c�c";
		mes "������͐�΍����̂悤�Ȏ���";
		mes "���Ȃ��ł���������!?";
		cutin "bu_du4",255;
		next;
		mes "[�X�J�[���b�g]";
		mes "������" +strcharinfo(0)+ "�l�A";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�����l�ő傫�Ȏ��̂ɂȂ炸��";
		mes "���݂܂����c�c�B";
		emotion 15,"�ē����X�J�[���b�g#ep15"; //59136
		next;
		mes "[�X�J�[���b�g]";
		mes "���������ΐ�ق�";
		mes "�G���V������A�������܂����B";
		mes "�̏�̂����ł����܂�";
		mes "�����ė���ꂽ��ł���ˁH";
		next;
		mes "[�X�J�[���b�g]";
		mes "���s�ւȎv�����������_�Ɋւ��Ă�";
		mes "�S���炨�l�т������܂��c�c�B";
		mes "�Ȃ��A�̏�̂����ŕ܂��Ă���������";
		mes "�ēx�J�����̂ŁA�W���m�[�ɖ߂鎞��";
		mes "���ɐ��������ĉ������B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "���c�c�I";
		mes strcharinfo(0)+ "�l�A���v���Ԃ�ł��B";
		mes "�G�N���[�W���ł������b��";
		mes "�Ȃ����̂Ɂc�c�B";
		mes "�܂�����������f��";
		mes "�����Ă��܂��Ƃ́c�c�B";
		emotion 15,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark2",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�����c�c";
		mes "�c�c�q�b�N�B";
		mes "�|�������ł��c�c�B";
		mes "�O�X�b�c�c�B";
		emotion 28,"�}�M�X�e�B��#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		next;
		if(select("�}�M�X�e�B����������߂�","���ɂȂɂ����Ȃ�") == 1) {
			cutin "bu_maggi3",2;
			mes "[�}�M�X�e�B��]";
			mes "�����c�c�B";
			mes "�@";
			mes "^0000FF�]��u�˘f�����l�q��������";
			mes "�@�����Ƒ̂�a���Ă����B";
			mes "�@�����݂ɐk���Ă���̂�������]^000000";
			next;
			cutin "bu_du5",2;
			mes "[�e���[���A��]";
			mes "�Ȃ񂾂�A" +strcharinfo(0)+ "�I";
			mes "�������ĕ|���ڂ�";
			mes "���������Ă����̂Ɂc�c";
			mes "���ɂ͂Ȃ��̂�!?";
			next;
			cutin "bu_mark3",2;
			mes "[�}�[�N�C�V��]";
			mes "�c�c���O������������";
			mes "�ƍ߂ɂȂ邾��!!";
			mes "�Ƃɂ������O��";
			mes "�}�M�X�e�B���Ɏӂ�!!";
			next;
			cutin "bu_maggi2",2;
			mes "[�}�M�X�e�B��]";
			mes strcharinfo(0)+ "����B";
			mes "�������v�ł��B";
			mes "���������܂����B";
			next;
		}
		mes "[�e���[���A��]";
		mes "�}�M�A�{���ɂ��܂Ȃ��c�c�B";
		cutin "bu_du4",2;
		next;
		cutin "bu_maggi2",2;
		mes "[�}�M�X�e�B��]";
		mes "�e���[�A���͑��v�B";
		mes strcharinfo(0)+ "����B";
		mes "�e���[�������f��";
		mes "���������܂����B";
		mes "�����āA���v���Ԃ�ł��B";
		emotion 15,"�}�M�X�e�B��#ep15_1elb"; //59142
		next;
		cutin "bu_du5",2;
		mes "[�e���[���A��]";
		mes strcharinfo(0)+ "�c�c!?";
		mes "�ށA���_�����Ă邼�I";
		mes "�m���A�G�N���[�W����";
		mes "�A�����āA�R���������!!";
		mes "�ЁA�v���Ԃ肾��!!";
		mes "��͂͂͂͂͂͂͂�!!";
		next;
		mes "[�^�}����]";
		mes "�����o�����閼�O���ȂƎv������";
		mes "�{����" +strcharinfo(0)+ "�l";
		mes "�������Ƃ́c�c!";
		mes "�t���C�����@���[�ȗ��ł��ˁB";
		mes "���A�ŗF�B�Ƃ������ł��܂����B";
		mes "���肪�Ƃ��������܂��B";
		emotion 15,"�^�}����#ep15_1elb"; //59140
		cutin "ep143_tasmi",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c���܂Ȃ��A���f���������B";
		mes "�����ċv���Ԃ肾�ȁB";
		mes "���ꂩ��܂��I���o�[�q���x���g��";
		mes "�R���N�V�������������񂾁c�c�B";
		cutin "bu_alp4",2;
		emotion 15,"�A���v�I�J�[�g#ep15_1el"; //59141
		next;
		mes "[�^�}����]";
		mes "�����ǂ�����ƁA";
		mes "����������܂��񂩁H";
		mes "���@���͂��܂����΂���Ȃ̂�";
		mes "����ȋ@�B�܂ŏ�������Ă��āA";
		mes "�p�ӎ���������悤�ȁc�c�B";
		cutin "ep143_tasta",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���[��A�܂��c�c";
		mes "���b�P���x���ЂŌ㉇���Ă���Ƃ���";
		mes "�b�������c�c�B";
		mes "����ȋ@�B���炢�͂����Ă�";
		mes "���������Ȃ��񂶂�Ȃ����ȁH";
		cutin "bu_mark1",2;
		next;
		mes "[�e���[���A��]";
		mes "�ׂ������Ƃ͂ǂ��ł������I";
		mes "��������A���I";
		mes "�\�ɂ��Ƃ��̎���Ȃ̂�";
		mes "���ʂ��ɂ������ʂ�";
		mes "�ꏊ�炵����!!";
		mes "�����s���Č��悤���I";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c���������I";
		mes "������������ȕ��Ɍ�����";
		mes "�Q�Ăď�荞�񂾂����ŁA";
		mes "����Ȃ��ƂɂȂ����񂾂�!?";
		emotion 6,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark3",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "�܂����������I";
		mes "�܂����͕s����Ȃ�ł���!?";
		mes "�������A���ƂȂ�������Ă��������I";
		cutin "bu_mark3",255;
		close;
	}
	mes "[�X�J�[���b�g]";
	mes "����ɂ��́B";
	mes "�����o�^�̊m�F�����܂��̂ŁA";
	mes "���O�������Ē����܂����B";
	next;
	if(select("���O������","�b���I����") == 2) {
		mes "[�X�J�[���b�g]";
		mes "������܂����B";
		mes "��������܂����炨����";
		mes "���������������B";
		mes "����ł͗ǂ�������B";
		close;
	}
	mes "[�X�J�[���b�g]";
	mes strcharinfo(0)+ "�l�B";
	mes "�o�^���m�F�ł��܂����B";
	mes "�W���m�[�̃G�����X���J�ɂ���";
	mes "�G���x�[�^�[�܂�";
	mes "�ړ����܂����H";
	next;
	if(select("�ړ�����","�ړ����Ȃ�") == 2) {
		mes "[�X�J�[���b�g]";
		mes "�G�����X���J��";
		mes "�߂�ۂ͐���A";
		mes "������̃G���x�[�^�[��";
		mes "�����p���������ˁB";
		close;
	}
	mes "[�X�J�[���b�g]";
	mes "���͂ɂ̓����X�^�[��";
	mes "�p�j���Ă���\����";
	mes "����܂��̂ŁA���C�����āI";
	mes "�����^���I";
	close2;
	warp "yuno_fild07.gat",226,158;
	end;
}
verus04.gat,116,220,0	script	�G���x�[�^�[#ep15_1elb	10007,{/* 59391 */
	mes "^FF0000�]���ӎ����]^000000";
	mes "�@";
	mes "�]�����Ŕ�ђ��˂���";
	mes "�@�ӂ�����Ǝ��̂��N����";
	mes "�@�댯������܂��B";
	mes "�@�����ӂ��Ă��������]";
	close;
}
verus04.gat,115,220,5	script	�e���[���A��#ep15_1elb	628,{/* 59392 */
	if(VER2_QUE < 3) {
		mes "[�e���[���A��]";
		mes "�`����!!";
		mes "���m�̗̈��`���ł���Ȃ��";
		mes "�ő��ɂȂ������!!";
		mes "���������^����ɏ�荞�ނ�!!";
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[�e���[���A��]";
		mes "���킠������������������!?";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "������������Ƃ����Ă���!!";
		next;
		mes "[�X�J�[���b�g]";
		mes "��Ȃ�����Ȃ��ł���!!";
		mes "�G���x�[�^�[�̒���";
		mes "�ӂ����Ȃ��ł��������I";
		mes "�m�����O�ɓ����ł́A";
		mes "��΂ӂ����Ă͂Ȃ�Ȃ���";
		mes "�������͂��ł���!?";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[�e���[���A��]";
		mes "��������!!";
		mes "���̂܂ܗ�����̂��ȁc�c�B";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�^�}����]";
		mes "�s�g�Ȏ�������Ȃ��ł��������I";
		mes "�����������Ȃ��̂����ł�����!!";
		emotion 23,"�^�}����#ep15_1elb"; //59140
		cutin "ep143_tahuk",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "��l�Ƃ��Â��ɂ��Ă��������I";
		mes "�{���ɍ������ł���������A";
		mes "��ςȎ��ɂȂ�܂���!?";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "ep143_tahuk",255;
		close;
	}
	else if(VER2_QUE == 5) {
		mes "[�e���[���A��]";
		mes "���A����́c�c!!";
		mes "�c�c�B";
		mes "���A���[��H";
		mes "�v������蕁�ʁc�c���ȁB";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������ǂ�Ȃ��̂�";
		mes "�z�����Ă����񂾁c�c�B";
		emotion 9,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[�e���[���A��]";
		mes "�������邾�낤�I";
		mes "�����܂ő�K�͂Ȃ񂾂���I";
		mes "�����ȃ����X�^�[��";
		mes "���󂳂�Ă�Ƃ��c�c�B";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ȃ��������̂�����Ȃ�";
		mes "�N������Ɍ����邾��c�c�B";
		cutin "bu_mark3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�ς��ƌ��킩��ɂ������A";
		mes "���z�l����������A";
		mes "�g�p�������ނ̎�����";
		mes "���Ȃ��Ƃ��~�b�h�K���h�嗤�ł�";
		mes "�������Ƃ̂Ȃ������B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A";
		mes "�W���s���X�Ƃ������Ⴄ�B";
		next;
		mes "[�e���[���A��]";
		mes "������!?";
		mes "�݂�ȁ`�����̕���������Ă݂�!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[�e���[���A��]";
		mes "�����c�c�B";
		mes "�݂�ȁ`�������̕������";
		mes "���Ă݂�!! ";
		viewpoint 1,116,226,1,0xFF8000; //59138
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		end;
	}
	mes "[�e���[���A��]";
	mes "�`���ɂ̓`�������W���_���K�v�Ȃ񂾁I ";
	mes "���s�����炲�߂�Ȃ����̋C������";
	mes "�厖�����ǂȁI";
	cutin "bu_du2",2;
	close2;
	cutin "bu_du2",255;
	end;
}
verus04.gat,115,221,5	script	�}�[�N�C�V��#ep15_1elb	616,{/* 59393 */
	if(VER2_QUE < 3) {
		mes "[�}�[�N�C�V��]";
		mes "�E�F���X�V�e�B�c�c";
		mes "�ǂ�ȏꏊ�Ȃ̂��A";
		mes "�{���ɋC�ɂȂ�܂��ˁB";
		cutin "bu_mark1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�W���s���X�߂��Ŕ������ꂽ����";
		mes "�W���s���X�Ƃ͈Ⴄ������";
		mes "�����Ă����炵����";
		mes "�����܂����B";
		cutin "bu_mark2",2;
		close2;
		cutin "bu_du4",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[�}�[�N�C�V��]";
		mes "�C��t����!!";
		emotion 23,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark4",2;
		next;
		mes "[�e���[���A��]";
		mes "���킠����������!!";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "��Ȃ�����Ȃ��ł���!!";
		mes "�G���x�[�^�[�̒���";
		mes "�ӂ����Ȃ��ł��������I";
		mes "�m�����O�ɓ����ł͐�΂�";
		mes "�ӂ����Ă͂Ȃ�Ȃ���";
		mes "�������͂��ł���!?";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[�}�[�N�C�V��]";
		mes "�����I�@�e���[���A��!!";
		mes "���O�̂����Ŏ��̎�����";
		mes "�ǂ�ǂ����Ă����C����!!";
		emotion 6,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark3",2;
		close2;
		cutin "bu_mark3",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[�e���[���A��]";
		mes "���A����́c�c!!";
		mes "�c�c�B";
		mes "���A���[��H";
		mes "�v������蕁�ʁc�c���ȁB";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������ǂ�Ȃ��̂�";
		mes "�z�����Ă����񂾁c�c�B";
		emotion 9,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[�e���[���A��]";
		mes "�������邾�낤�I";
		mes "�����܂ő�K�͂Ȃ񂾂���I";
		mes "�����ȃ����X�^�[��";
		mes "���󂳂�Ă�Ƃ��c�c�B";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ȃ��������̂�����Ȃ�";
		mes "�N������Ɍ����邾��c�c�B";
		cutin "bu_mark3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�ς��ƌ��킩��ɂ������A";
		mes "���z�l����������A";
		mes "�g�p�������ނ̎�����";
		mes "���Ȃ��Ƃ��~�b�h�K���h�嗤�ł�";
		mes "�������Ƃ̂Ȃ������B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A";
		mes "�W���s���X�Ƃ������Ⴄ�B";
		next;
		mes "[�e���[���A��]";
		mes "������!?";
		mes "�݂�ȁ`�����̕���������Ă݂�!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[�}�[�N�C�V��]";
		mes "�Ȃ񂾁H";
		mes "���̕����䂪�ǂ������񂾁H";
		viewpoint 1,116,226,1,0xFF8000; //59139
		cutin "bu_mark1",2;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	mes "[�}�[�N�C�V��]";
	mes "�ӂ��c�c";
	mes strcharinfo(0)+ "�l�B";
	mes "�{���ɏ�����܂����B";
	mes "�����͂��ɂȂ�����";
	mes "��l�����Ȃ�̂��ȁc�c�B";
	cutin "bu_mark3",0;
	close2;
	cutin "bu_mark3",255;
	end;
}
verus04.gat,116,218,5	script	�^�}����#ep15_1elb	10027,{/* 59394 */
	if(VER2_QUE < 3) {
		mes "[�^�}����]";
		mes "����Ȑ������@��ƂȂ�";
		mes "��������̐l������";
		mes "�W�܂肻���ł��ˁB";
		cutin "ep143_tasta",2;
		next;
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "���͂Ƃ肠�����A";
		mes strcharinfo(0) + "�l��";
		mes "�O�݂����ɔ��@����Ȃ��悤";
		mes "�C�����܂��B";
		close2;
		cutin "ep143_tasmi",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[�^�}����]";
		mes "������ӂ����Ȃ��ł���������";
		mes "����������Ȃ��ł���!?";
		emotion 23,"�^�}����#ep15_1elb"; //59140
		cutin "ep143_tahuk",2;
		next;
		mes "[�e���[���A��]";
		mes "���킠��������!!";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "��Ȃ�����Ȃ��ł���!!";
		mes "�G���x�[�^�[�̒���";
		mes "�ӂ����Ȃ��ł��������I";
		mes "�m�����O�ɓ����ł͐��";
		mes "�ӂ����Ă͂Ȃ�Ȃ���";
		mes "�������͂��ł���!?";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[�^�}����]";
		mes "���킠�c�c";
		mes "�ň����c�c�B";
		emotion 28,"�^�}����#ep15_1elb"; //59140
		cutin "ep143_tahuk",2;
		close2;
		cutin "ep143_tahuk",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[�e���[���A��]";
		mes "���A����́c�c!!";
		mes "�c�c�B";
		mes "���A���[��H";
		mes "�v������蕁�ʁc�c���ȁB";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������ǂ�Ȃ��̂�";
		mes "�z�����Ă����񂾁c�c�B";
		emotion 9,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[�e���[���A��]";
		mes "�������邾�낤�I";
		mes "�����܂ő�K�͂Ȃ񂾂���I";
		mes "�����ȃ����X�^�[��";
		mes "���󂳂�Ă�Ƃ��c�c�B";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ȃ��������̂�����Ȃ�";
		mes "�N������Ɍ����邾��c�c�B";
		cutin "bu_mark3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�ς��ƌ��킩��ɂ������A";
		mes "���z�l����������A";
		mes "�g�p�������ނ̎�����";
		mes "���Ȃ��Ƃ��~�b�h�K���h�嗤�ł�";
		mes "�������Ƃ̂Ȃ������B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A";
		mes "�W���s���X�Ƃ������Ⴄ�B";
		next;
		mes "[�e���[���A��]";
		mes "������!?";
		mes "�݂�ȁ`�����̕���������Ă݂�!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[�^�}����]";
		mes "��c�c�H";
		mes "�e���[���A����������ɂ�";
		mes "�����𔭌������̂��ȁH";
		viewpoint 1,116,226,1,0xFF8000; //59140
		cutin "ep143_tasmi",2;
		close2;
		cutin "ep143_tasmi",255;
		end;
	}
	mes "[�^�}����]";
	mes "�ӂ��A�{����";
	mes strcharinfo(0)+ "�l��";
	mes "�ʂ肩�����Ă��Ȃ�������";
	mes "�ǂ��Ȃ��Ă������c�c�B";
	mes "�{���ɂ��肪�Ƃ��������܂��B";
	cutin "ep143_tasmi",2;
	close2;
	cutin "ep143_tasmi",255;
	end;
}
verus04.gat,117,219,0	script	�A���v�I�J�[�g#ep15_1el	615,{/* 59395 */
	if(VER2_QUE < 3) {
		mes "[�A���v�I�J�[�g]";
		mes "���@���c�c�����f�ނ��c�c�B";
		mes "���������΁A�I���o�[�q���x���g��";
		mes "�����ł����@�Ɋւ���b��";
		mes "�������悤�ȋC������c�c�B";
		cutin "bu_alp4",2;
		close2;
		cutin "bu_alp4",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�B";
		mes "���c�c�����ȁc�c�B";
		emotion 19,"�A���v�I�J�[�g#ep15_1el"; //59141
		cutin "bu_alp2",2;
		next;
		mes "[�e���[���A��]";
		mes "���킠����!!";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "��Ȃ�����Ȃ��ł����I";
		mes "�G���x�[�^�[�̒���";
		mes "�ӂ����Ȃ��ł��������I";
		mes "�m�����O�ɓ����ł͐��";
		mes "�ӂ����Ă͂Ȃ�Ȃ���";
		mes "�������͂��ł���!?";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[�A���v�I�J�[�g]";
		mes "�����ȁc�c�B";
		mes "���c�c�����c�c�B";
		emotion 19,"�A���v�I�J�[�g#ep15_1el"; //59141
		cutin "bu_alp2",2;
		close2;
		cutin "bu_alp2",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[�e���[���A��]";
		mes "���A����́c�c!!";
		mes "�c�c�B";
		mes "���A���[��H";
		mes "�v������蕁�ʁc�c���ȁB";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������ǂ�Ȃ��̂�";
		mes "�z�����Ă����񂾁c�c�B";
		emotion 9,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[�e���[���A��]";
		mes "�������邾�낤�I";
		mes "�����܂ő�K�͂Ȃ񂾂���I";
		mes "�����ȃ����X�^�[��";
		mes "���󂳂�Ă�Ƃ��c�c�B";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ȃ��������̂�����Ȃ�";
		mes "�N������Ɍ����邾��c�c�B";
		cutin "bu_mark3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�ς��ƌ��킩��ɂ������A";
		mes "���z�l����������A";
		mes "�g�p�������ނ̎�����";
		mes "���Ȃ��Ƃ��~�b�h�K���h�嗤�ł�";
		mes "�������Ƃ̂Ȃ������B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A";
		mes "�W���s���X�Ƃ������Ⴄ�B";
		next;
		mes "[�e���[���A��]";
		mes "������!?";
		mes "�݂�ȁ`�����̕���������Ă݂�!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[�A���v�I�J�[�g]";
		mes "�����䂪�ǂ������H";
		viewpoint 1,116,226,1,0xFF8000; //59141
		cutin "bu_alp1",2;
		close2;
		cutin "bu_alp1",255;
		end;
	}
	mes "[�A���v�I�J�[�g]";
	mes "�c�c���̎��͏��������B";
	mes "�F�A���ӂ��Ă���B";
	cutin "bu_alp1",2;
	close2;
	cutin "bu_alp1",255;
	end;
}
verus04.gat,117,220,3	script	�}�M�X�e�B��#ep15_1elb	612,{/* 59396 */
	if(VER2_QUE < 3) {
		mes "[�}�M�X�e�B��]";
		mes "�t�@���^�X�}�S���J�Ƃ������O�A";
		mes "�������ǂ����Y�킾�Ǝv���܂���H";
		mes "�ł��A�G�N���[�W����";
		mes "�������ǂ��āA���͍D���ł��B";
		cutin "bu_maggi2",2;
		close2;
		cutin "bu_maggi2",255;
		end;
	}
	else if(VER2_QUE == 3) {
		mes "[�}�M�X�e�B��]";
		mes "���Ⴀ��������!!";
		emotion 23,"�}�M�X�e�B��#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		next;
		mes "[�e���[���A��]";
		mes "���킠����������!!";
		emotion 23,"�e���[���A��#ep15_1elb"; //59138
		cutin "bu_du5",2;
		next;
		mes "[�X�J�[���b�g]";
		mes "��Ȃ�����Ȃ��ł���!!";
		mes "�G���x�[�^�[�̒���";
		mes "�ӂ����Ȃ��ł��������I";
		mes "�m�����O�ɓ����ł͐��";
		mes "�ӂ����Ă͂Ȃ�Ȃ���";
		mes "�������͂��ł���!?";
		emotion 23,"�ē����X�J�[���b�g#ep15"; //59136
		cutin "bu_du5",255;
		close;
	}
	else if(VER2_QUE == 4) {
		mes "[�}�M�X�e�B��]";
		mes "���Ⴀ����������!!";
		emotion 23,"�}�M�X�e�B��#ep15_1elb"; //59142
		cutin "bu_maggi4",2;
		close2;
		cutin "bu_maggi4",255;
		end;
	}
	else if(VER2_QUE == 5) {
		mes "[�e���[���A��]";
		mes "���A����́c�c!!";
		mes "�c�c�B";
		mes "���A���[��H";
		mes "�v������蕁�ʁc�c���ȁB";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������ǂ�Ȃ��̂�";
		mes "�z�����Ă����񂾁c�c�B";
		emotion 9,"�}�[�N�C�V��#ep15_1elb"; //59139
		cutin "bu_mark1",2;
		next;
		mes "[�e���[���A��]";
		mes "�������邾�낤�I";
		mes "�����܂ő�K�͂Ȃ񂾂���I";
		mes "�����ȃ����X�^�[��";
		mes "���󂳂�Ă�Ƃ��c�c�B";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����Ȃ��������̂�����Ȃ�";
		mes "�N������Ɍ����邾��c�c�B";
		cutin "bu_mark3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�ς��ƌ��킩��ɂ������A";
		mes "���z�l����������A";
		mes "�g�p�������ނ̎�����";
		mes "���Ȃ��Ƃ��~�b�h�K���h�嗤�ł�";
		mes "�������Ƃ̂Ȃ������B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������A";
		mes "�W���s���X�Ƃ������Ⴄ�B";
		next;
		mes "[�e���[���A��]";
		mes "������!?";
		mes "�݂�ȁ`�����̕���������Ă݂�!! ";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_du2",2;
		delquest 118330;
		setquest 11367;
		set VER2_QUE,6;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 6) {
		mes "[�}�M�X�e�B��]";
		mes "�e���[�����Ă����";
		mes "���C�����炦��C�����܂��B";
		mes "���C������̂��ʂɃL�Y";
		mes "�ł����ǁB";
		viewpoint 1,116,226,1,0xFF8000; //59142
		cutin "bu_maggi1",2;
		close2;
		cutin "bu_maggi1",255;
		end;
	}
	mes "[�}�M�X�e�B��]";
	mes "�e���[�������f�����������܂����B";
	mes "���̂ق��͂����A���v�ł��B";
	mes "�{���ɂ��肪�Ƃ��������܂����B";
	emotion 15,"�}�M�X�e�B��#ep15_1elb"; //59142
	cutin "bu_maggi2",2;
	close2;
	cutin "bu_maggi2",255;
	end;
}
verus04.gat,116,226,0	script	������ #ep15_1elb	10043,{/* 59397 */
	if(VER2_QUE == 6) {
		mes "[�e���[���A��]";
		mes "�ꌩ�A���̕ϓN���Ȃ����������A";
		mes "�����ƕ����Ɍ���������";
		mes "�ŏI����ɈႢ�Ȃ�!!";
		mes "�ǂ����ɂ����ƉB���ʘH��";
		mes "�������c�c�B";
		cutin "bu_du2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�l�̘b�������͕����c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�^�}����]";
		mes "����c�c������ƁI";
		mes "�]�v�Ȏ������Ȃ���";
		mes "����܂���!?";
		cutin "ep143_taang",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�ނ�!?";
		mes "����A�҂����c�c�B";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "������n�ʂ̐[���ꏊ��";
		mes "����������ƌ����Ă��A";
		mes "�Ñ�̈�ՂƂ��Ă�";
		mes "���܂�ɂ���Ԃ�";
		mes "�ǂ�������Ȃ����H ";
		cutin "bu_alp1",2;
		next;
		mes "[�^�}����]";
		mes "�����ł��ˁB";
		mes "�悭���Ă݂�Ƃق��肪";
		mes "�����ς����Ă��邾���ŁA";
		mes "���Ƃ͂��Ȃ��Y��ł��ˁB";
		cutin "ep143_tasta",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�ǂ�ǂ�c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�O���c�c�B";
		mes "���܂�ɂ��Y��ɕۑ�����Ă��āA";
		mes "������m�鎖��";
		mes "�ł��Ȃ��悤���c�c�B";
		cutin "bu_alp2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������܂��Ă����Ȃ�";
		mes "�����Ȃ��牽�������";
		mes "�Ղł��c���Ǝv���񂾂��A";
		mes "�Ȃ������̍��Ղ��Ȃ��B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�P���ɁA���Ȃ�̔N����";
		mes "�o���Ă��邩�炩��";
		mes "�m��Ȃ����ǂȁB";
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���ӂ����Ȃ���";
		mes "�Ⴄ���̂���������";
		mes "�T���Ă݂悤�c�c�B";
		next;
		mes "[�^�}����]";
		mes "����ł͍��ɎR�ς݂ɂ���Ă���";
		mes "�K���N�^�����ł��A";
		mes "������ƒ��ׂĂ݂܂����H";
		viewpoint 1,95,238,1,0xFF8000; //59143
		cutin "ep143_tasta",2;
		delquest 11367;
		setquest 11368;
		set VER2_QUE,7;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	else if(VER2_QUE == 7) {
		mes "[�A���v�I�J�[�g]";
		mes "���ӂ����Ȃ���";
		mes "�Ⴄ���̂�������������";
		mes "�T���Ă݂悤�c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�^�}����]";
		mes "����ł͍��ɎR�ς݂���Ă���";
		mes "�K���N�^�ł��A";
		mes "������ƒ��ׂĂ݂܂����H";
		viewpoint 1,95,238,1,0xFF8000; //59143
		cutin "ep143_tasta",2;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	mes "�]���}�ȕ�����ŉ����Ȃ��]";
	close;
}
verus04.gat,95,238,0	script	�K���N�^#ep15_1elb	10043,{/* 59398 */
	if(VER2_QUE == 7) {
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�B";
		mes "�����猩����Ă݂Ă�";
		mes "�r��ʂĂ��������Ȃ��c�c�B";
		mes "�������ԕ��u���ꂽ";
		mes "��Ղ��Ƃ���������";
		mes "�܂��������Ȃ��قǂɁB";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "��ꂽ�@�B���ς܂�Ă���ȊO�A";
		mes "����炵�����̂�";
		mes "��������Ȃ��ȁc�c�B";
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ɂ��́A�����ɂ���؂����Ă݂�B";
		mes "���̖؂������Ђ�������c�c�B";
		cutin "bu_alp3",2;
		viewpoint 1,79,249,1,0xFF8000; //59144
		delquest 11368;
		setquest 11369;
		set VER2_QUE,8;
		close2;
		cutin "bu_alp3",255;
		end;
	}
	else if(VER2_QUE == 8) {
		mes "[�A���v�I�J�[�g]";
		mes "���ɂ���؂����Ă݂�B ";
		mes "�c�c�����C�ɂȂ�_����B";
		cutin "bu_alp3",2;
		close2;
		cutin "bu_alp3",255;
		end;
	}
	mes "�]�K���N�^���΂�܂���Ă���]";
	close;
}
verus04.gat,79,249,0	script	��#ep15_1elb	10043,{/* 59399 */
	if(VER2_QUE == 8) {
		mes "[�e���[���A��]";
		mes "���������΁c�c�B";
		mes "��ɂ����ɓ����������ɁA";
		mes "�����ς��ȂƎv���Ă�������������񂾁B";
		mes "�؂́A�����l�������Ă����A";
		mes "����̂���Ȃ��̂��H";
		cutin "bu_du1",2;
		next;
		mes "[�^�}����]";
		mes "�Ȃ��c�c!?";
		mes "�e���[���A����������";
		mes "�܂Ƃ��Ȃ��Ƃ������܂����ˁB";
		cutin "ep143_tahuk",2;
		next;
		mes "[�e���[���A��]";
		mes "��!?";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�m���ɁA�����̌����Ƃ���B";
		mes "���̖؂͂ǂ�����Ă���Ȓn����";
		mes "�������ł��傤�ˁc�c�H";
		mes "�z������Ȃ��ꏊ�Ȃ̂Ɂc�c�B";
		cutin "bu_mark1",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�c�c���́B";
		mes "�������ׂĂ݂܂������A";
		mes "���ʂȖ��@�Ȃǂ�";
		mes "�������Ă͂��Ȃ��悤�ł��B";
		cutin "bu_maggi1",2;
		next;
		mes "[�e���[���A��]";
		mes "�����ĉ����A�C�̂��Ƃ��낪";
		mes "���΁A�}�M���ȁI";
		mes "�Ƃ���ł������猩����h�A�̑O��";
		mes "�ςȂ��̂����邼�I";
		mes "�C�ɂȂ邩�猩�ɂ�������!!";
		viewpoint 1,62,255,1,0xFF8000; //59145
		cutin "bu_du2",2;
		delquest 11369;
		setquest 11370;
		set VER2_QUE,9;
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 9) {
		mes "[�e���[���A��]";
		mes "�������猩����";
		mes "�h�A�̑O�ɕςȂ��̂����邼�I";
		mes "�C�ɂȂ邩�猩�ɂ�������!!";
		viewpoint 1,62,255,1,0xFF8000; //59145
		cutin "bu_du2",2;
		close2;
		cutin "bu_du2",255;
		end;
	}
	mes "�]�n���ň�������ɂ�";
	mes "�@���Ȃ茳�C�ɂ����܂���";
	mes "�@������؂̂悤���B";
	mes "�@�n���ň�����Ƃ����ȊO��";
	mes "�@���ʂȂ��Ƃ͂Ȃ��悤��";
	mes "�@�v����c�c�]";
	close;
}
verus04.gat,62,255,0	script	�\����#ep15_1elb	10043,{/* 59400 */
	if(VER2_QUE == 9) {
		mes "[�}�[�N�C�V��]";
		mes "�����A�e���[���A��!!";
		mes "�댯�����m��Ȃ�����A";
		mes "����ɕ������ȁI";
		cutin "bu_mark3",2;
		next;
		mes "[�e���[���A��]";
		mes "�`���҂Ƀ`�������W���_�́A";
		mes "�K�{�Ȃ񂾂��I";
		cutin "bu_du2",2;
		next;
		mes "[�e���[���A��]";
		mes "����ȂƂ���ł����������Ă��āA";
		mes "���̓z��ɑS���D��ꂽ��";
		mes "�ǂ������!!";
		cutin "bu_du1",2;
		next;
		mes "[�^�}����]";
		mes "�ȑO������Ȏ���������";
		mes "���ǂ͒����ǂ��납�A";
		mes "�ꃖ�����a�@�ɐ��b����";
		mes "�����������Ȃ��ł���!!";
		cutin "ep143_taang",2;
		next;
		mes "[�e���[���A��]";
		mes "���̎��Ƃ͈Ⴄ�I";
		mes "���̂��A���͒m��Ȃ����A";
		mes "�����̎��̂ŉ���Ȃ��";
		mes "���Ȃ��̂ɂȂ��Ă��܂������ȁI";
		mes "����͂��͂��͂��͂��I";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�������H�@����c�c�B";
		cutin "bu_mark4",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "������A���Ă݂�B";
		mes "���̌����̌��B";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�悭�݂�Ƃǂ����A";
		mes "��̕��ɓ��������Ă���悤���B";
		cutin "bu_alp3",2;
		next;
		mes "[�e���[���A��]";
		mes "�ނނ��A�m���Ɂc�c�B";
		mes "�����ɓ�������ȏ�A";
		mes "�`������̂��������A�`����!!";
		mes "�Ȃ��Ȃ炻���ɁA�������邩�炾!!";
		mes "��͂��͂��͂��͂��͂�!!";
		mes "���Ď��ŁA�ˌ�!!";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����!!�@�~�܂�!!";
		mes "�ŏ��Ɍ��������̘b��";
		mes "���O�A�����ĂȂ��̂�!?";
		cutin "bu_mark3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����A�����I";
		mes "�{���ɒ���Ȃ����!!";
		cutin "bu_mark4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�}�[�N����c�c";
		mes "�e���[�������������܂Łc�c�B";
		cutin "bu_maggi1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�O�ɂ��������Ƃ���������!?";
		mes "�������A�G�N���[�W����!!";
		mes "�c�c����́A�g���u�����[�J�[!!";
		cutin "bu_mark3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����Ɖ����Ȃ�O�ɑ����A";
		mes "�ǂ����Ȃ���΁I";
		mes "�}���܂��傤!!";
		cutin "bu_mark1",2;
		viewpoint 1,44,265,1,0xFF8000; //59146
		delquest 11370;
		setquest 11371;
		set VER2_QUE,10;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 10) {
		mes "[�A���v�I�J�[�g]";
		mes "�����̌��̕����������Ă݂�B";
		mes "��̕��ɓ����̂тĂ���悤���B";
		cutin "bu_alp3",2;
		next;
		mes "[�e���[���A��]";
		mes "�ނނ��A�m���Ɂc�c�B";
		mes "�����ɓ�������ȏ�A";
		mes "�`������̂��������A�`����!!";
		mes "�Ȃ��Ȃ炻���ɁA�������邩�炾!!";
		mes "��͂��͂��͂��͂��͂�!!";
		mes "���Ď��ŁA�ˌ�!!";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����!!�@�~�܂�!!";
		mes "�ŏ��Ɍ��������̘b��";
		mes "���O�A�����ĂȂ��̂�!?";
		cutin "bu_mark3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����A�����I";
		mes "�{���ɒ���Ȃ����!!";
		cutin "bu_mark4",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�}�[�N����c�c";
		mes "�e���[�������������܂Łc�c�B";
		cutin "bu_maggi1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�O�ɂ��������Ƃ���������!?";
		mes "�������A�G�N���[�W����!!";
		mes "�c�c����́A�g���u�����[�J�[!!";
		cutin "bu_mark3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����Ɖ����Ȃ�O�ɑ����A";
		mes "�ǂ����Ȃ���΁I";
		mes "�}���܂��傤!!";
		viewpoint 1,44,265,1,0xFF8000; //59146
		cutin "bu_mark1",2;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	mes "�]�h�A���ӂ�����Ă���]";
	close;
}
verus03.gat,46,23,3	script	�e���[���A��#ep15_1elb0	628,{/* 59401 */
	if(VER2_QUE == 10) {
		mes "[�e���[���A��]";
		mes "�ւ��B";
		mes "�������Ƒ債�ĕς��Ȃ��ꏊ����";
		mes "�v���Ă������c�c";
		mes "�ǂ��킩��Ȃ��@�B��";
		mes "�������ɂ͕�������Ă���ȁB";
		emotion 23,"�e���[���A��#ep15_1elb0"; //59147
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "�W���s���X�Ɍ����z���";
		mes "�ꏏ�̓z��Ȃ̂��c�c�H";
		mes "�����̓W���s���X�ƁA";
		mes "�ǂ������֌W���c�c�H";
		cutin "bu_du1",2;
		next;
		mes "[�e���[���A��]";
		mes "���������΂������̏�̕���";
		mes "����������������Ǝ����`�����Ă���";
		mes "�����䂪�܂�����悤���B";
		mes "�s���Č��邩���H";
		cutin "bu_du2",2;
		delquest 11371;
		setquest 11372;
		set VER2_QUE,11;
		viewpoint 1,44,65,1,0xFF8000; //59147
		close2;
		cutin "bu_du2",255;
		end;
	}
	else if(VER2_QUE == 11) {
		mes "[�e���[���A��]";
		mes "���������΂������̏�̕���";
		mes "����������������Ǝ����`�����Ă���";
		mes "�����䂪�܂�����悤���B";
		mes "�s���Č��邩���H";
		cutin "bu_du2",2;
		viewpoint 1,44,65,1,0xFFFF8000; //59147
		close2;
		cutin "bu_du2",255;
		end;
	}
	mes "[�e���[���A��]";
	mes "�Ȃ�ł�!?";
	mes "�Ȃ�ł݂�Ȃ����ɂǂ�����";
	mes "�s���񂾁I�H";
	mes "�Ƃ����������ǂ���!?";
	cutin "bu_du5",2;
	close2;
	cutin "bu_du5",255;
	end;
}
verus03.gat,44,65,0	script	������#ep15_1elb03	10043,{/* 59402 */
	if(VER2_QUE == 11) {
		mes "[�A���v�I�J�[�g]";
		mes "�ӂށc�c�B";
		mes "���ς�炸�s���R�Ȃقǂ�";
		mes "�Y�킾�ȁB";
		cutin "bu_alp1",2;
		next;
		mes "[�^�}����]";
		mes "�܂�ł������������~�܂����悤��";
		mes "�ۑ�����Ă��錚�����Q�ł��ˁc�c�B";
		mes "��̂����ɏZ��ł����l������";
		mes "�ǂ��ɍs�����̂ł��傤���H";
		cutin "ep143_tasta",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�݂�Ȏ��񂾂Ƃ����ɂ�";
		mes "�����̂悤�Ȃ��̂���������Ȃ��B";
		mes "�������獚�R��";
		mes "�p���������Ƃ������ق���";
		mes "�[���ł���悤�ȕ��i���ȁB";
		cutin "bu_alp3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���������ɖ��@�Ȃǂ�";
		mes "�������Ă��Ȃ��悤�ł��c�c�B";
		cutin "bu_maggi1",2;
		next;
		mes "[�e���[���A��]";
		mes "�������Ď����͖��{�Ɂc�c�B";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c�B";
		cutin "bu_mark3",2;
		next;
		mes "[�e���[���A��]";
		mes "�ǂ����ĉ���񂾂�!?";
		cutin "bu_du4",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���̃o�J�͕����Ă����āc�c";
		mes "���͐�ɖk���̓��ɉ�����";
		mes "�̂ڂ��Ă݂�̂ŁA";
		mes "���������ė��Ă��������B";
		cutin "bu_mark2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����A" +strcharinfo(0)+ "�l�B";
		mes "�����܂��񂪁A";
		mes "�e���[���A���̓z��";
		mes "�\�����Ȃ��悤��";
		mes "�悭�������Ă����ĉ������ˁc�c�B";
		cutin "bu_mark3",2;
		delquest 11372;
		setquest 11373;
		set VER2_QUE,12;
		viewpoint 1,88,237,1,0xFF8000; //59148
		close2;
		cutin "bu_mark4",255;
		end;
	}
	else if(VER2_QUE == 12) {
		mes "[�}�[�N�C�V��]";
		mes "����ł͎��͐�ɖk���̓��ɉ�����";
		mes "�̂ڂ��Ă݂�̂ŁA";
		mes "���������ė��Ă��������B";
		cutin "bu_mark2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����A" +strcharinfo(0)+ "�l�B";
		mes "�����܂��񂪁A";
		mes "�e���[���A���̓z��";
		mes "�\�����Ȃ��悤��";
		mes "�悭�������Ă����ĉ������ˁc�c�B";
		cutin "bu_mark3",2;
		viewpoint 1,88,237,1,0xFF8000; //59148
		close2;
		cutin "bu_mark4",255;
		end;
	}
	mes "�]���}�ȕ����䂾�B";
	mes "�@�����Ȃ��c�c�]";
	close;
}
verus03.gat,88,237,3	script	�}�[�N�C�V��#ep15_1elb0	616,{/* 59403 */
	if(VER2_QUE == 12) {
		mes "[�}�[�N�C�V��]";
		mes "���́A�O�ɂ��鋐��ȋ@�B��";
		mes "�����܂����H";
		mes "�ŏ��ɗ����ꏊ�Ƃ͈����";
		mes "�����ɂ͋���ȋ@�B������";
		mes "�������񌩂��܂��ˁB";
		cutin "bu_mark1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����⏰�ɉ�ꂽ�ӏ����������c�c�B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�������ɂ���������悤�ł����A";
		mes "�ӂ�����Ă��āA���鎖���ł��܂���B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����댯�Ȋ��������邯�ǁc�c";
		mes "�����A���̋C�̂����ł��傤�c�c�B";
		cutin "bu_mark4",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����I�@�^�}����!!";
		mes "�������̕��ɂ��܂�[���A";
		mes "����Ȃ��ŉ������I";
		cutin "bu_mark1",2;
		emotion 23,"�}�[�N�C�V��#ep15_1elb0"; //59149
		viewpoint 1,51,256,1,0xFF8000; //59149
		delquest 11373;
		setquest 11374;
		set VER2_QUE,13;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 13) {
		mes "[�}�[�N�C�V��]";
		mes "�����I�@�^�}����!!";
		mes "�������̕��ɂ��܂�[���A";
		mes "����Ȃ��ŉ������I";
		cutin "bu_mark1",2;
		emotion 23,"�}�[�N�C�V��#ep15_1elb0"; //59149
		viewpoint 1,51,256,1,0xFF8000; //59149
		close2;
		cutin "bu_mark1",255;
		end;
	}
	mes "[�}�[�N�C�V��]";
	mes "�܂������c�c�B";
	mes "�����͂܂��ǂ���";
	mes "�s������!?";
	mes "�T�����̐g�ɂ�";
	mes "�Ȃ��Ă���c�c�B";
	cutin "bu_mark3",0;
	close2;
	cutin "bu_mark3",255;
	end;
}
verus03.gat,51,256,3	script	�^�}����#ep15_1elb03	10027,{/* 59404 */
	if(VER2_QUE == 13) {
		mes "[�^�}����]";
		mes "�����������ĉ������B";
		mes "���̉ӏ��ɔ�ׂĂ��Ȃ���Ă��܂��B";
		cutin "ep143_tahuk",2;
		next;
		mes "[�^�}����]";
		mes "�}�M�X�e�B���B";
		mes "�������͂ǂ��ł����H";
		cutin "ep143_tasta",2;
		viewpoint 1,35,254,1,0xFF8000; //59150
		delquest 11374;
		setquest 11375;
		set VER2_QUE,14;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	else if(VER2_QUE == 14) {
		mes "[�^�}����]";
		mes "�����������ĉ������B";
		mes "���̉ӏ��ɔ�ׂĂ��Ȃ���Ă��܂��B";
		cutin "ep143_tahuk",2;
		next;
		mes "[�^�}����]";
		mes "�}�M�X�e�B���B";
		mes "�������͂ǂ��ł����H";
		cutin "ep143_tasta",2;
		viewpoint 1,35,254,1,0xFF8000; //59150
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	mes "[�^�}����]";
	mes "�������͑��Ɣ�ׂ�";
	mes "���Ȃ���Ă��܂��ˁc�c�B";
	mes "��̉����c�c�B";
	cutin "ep143_tahuk",2;
	close2;
	cutin "ep143_tahuk",255;
	end;
}
verus03.gat,35,254,3	script	�}�M�X�e�B��#ep15_1elb0	612,{/* 59405 */
	if(VER2_QUE == 14) {
		mes "[�}�M�X�e�B��]";
		mes "���c�c�B";
		mes "�������������A";
		mes "�ӂ�����Ă���悤�ł��B";
		cutin "bu_maggi1",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�^�}��������̑O�ɂ���A";
		mes "���[�v�|�[�^������";
		mes "�s�v�c�ȗ͂�";
		mes "��������̂ł����c�c";
		mes "�ڂ����͕�����܂���B";
		cutin "bu_maggi3",2;
		next;
		mes "[�e���[���A��]";
		mes "���c�c�B";
		mes "�������̃��[�v�|�[�^���A";
		mes "���̂��킩��Ȃ���";
		mes "���肽���Ȃ��������ȁc�c�B";
		cutin "bu_du5",2;
		next;
		mes "[�^�}����]";
		mes "!?";
		mes "�ːi�����m��Ȃ�����";
		mes "�Ԃ��C�m�V�V�Ƃ���";
		mes "�������܂ł���ꂽ";
		mes "�e���[���A�����s��������Ȃ��Ƃ́I";
		cutin "ep143_tahuk",0;
		next;
		mes "[�e���[���A��]";
		mes "�N���؂���!?";
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "���ꂶ��Ȃ���!!";
		mes "�����Ƃ����������̂������I";
		cutin "bu_du3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�e���[���A���B";
		mes "�؂��o�J�ɂ���ȁB";
		mes "�����瑫�܂Ŏ̂Ă���̂��Ȃ��A";
		mes "���΂炵���ƒ{���B";
		cutin "bu_alp1",0;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ɂ��܂��B";
		cutin "bu_alp4",0;
		next;
		mes "[�e���[���A��]";
		mes "���������͎̂���������!!";
		mes "���ꂪ�d�v�ł͂Ȃ�!!";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�e���[���A���͐��i�ɓ��ł����ǁA";
		mes "�쐶�̊������͂͂��炭����A";
		mes "���̃��[�v�|�[�^���̐��";
		mes "���ׂ�ۂ͍אS�̒��ӂ��K�v�ƁA";
		mes "���������悤�ł��B";
		mes "��������ȁA�C�m�V�V�e���[���A���H";
		cutin "bu_mark2",0;
		next;
		mes "[�e���[���A��]";
		mes "���������I";
		mes "���i�ɓ����ĂȂ�!?";
		mes "����ɂ��肰�Ȃ��A";
		mes "�C�m�V�V�e���[���A����";
		mes "�Ă񂾂��!?";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����Ȃɖڗ���Q����";
		mes "�ЂÂ��Ȃ��̂́A";
		mes "�t�@���^�X�}�S���J�v���W�F�N�g���ł�";
		mes "�܂��A���܂蒲���ł��Ă��Ȃ�";
		mes "�ꏊ�̂悤���ȁc�c�B";
		cutin "bu_alp1",0;
		next;
		mes "[�e���[���A��]";
		mes "����!!";
		mes "���𖳎������!?";
		cutin "bu_du5",2;
		next;
		mes "[�^�}����]";
		mes "���܂�C�͐i�݂܂���";
		mes "�T���ꏊ���Ȃ��Ȃ��Ă������A";
		mes "���̒����ꏊ�͂���";
		mes "���[�v�|�[�^�������Ȃ��ł��傤�ˁB";
		cutin "ep143_tasta",0;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�ł��A���̐�𒲂ׂ�ɂ�";
		mes "�������炤�K�v��";
		mes "����܂���ˁc�c�H";
		cutin "bu_maggi3",2;
		next;
		if(select("����","���H") == 2) {
			cutin "ep143_tasta",0;
			mes "[�^�}����]";
			mes "�������肽���@�c�݂̂�";
			mes "��������\���Ɠ������̕���";
			mes "�����Ă��܂�������A�ǂ�����";
			mes "���@�c�ɏ������ċ�����Ȃ��ƁA";
			mes "�ʖڂȂ悤�ł��ˁB";
			next;
			mes "[�^�}����]";
			mes "���������΁c�c";
			mes "���@�c�Ƃ����΃����N�ɂ���A";
			mes "^0000FF�y���c^000000�Ŕ��@�c�̎Q�������o�[��";
			mes "����Ă����C�����܂��B";
			mes "��x�A�₢���킹�Ă݂Ă�";
			mes "�������ł��傤�H";
			next;
		}
		mes "[�}�[�N�C�V��]";
		mes "�����c�c�ł́A";
		mes strcharinfo(0)+ "�l�B";
		mes "�������͈�U�A";
		mes "�������苖��Ⴂ�ɖ߂�܂�����";
		mes "��قǁA���[�v�|�[�^���̌�������";
		mes "�����������Ƃɂ��܂��񂩁H";
		cutin "bu_mark1",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�댯�ȏꏊ�̂悤�ł����A";
		mes "�݂�Ȉꏏ�ɍs�������ق���";
		mes "�������������c�c";
		mes "���ɂ������\�������Ƃ��́A";
		mes "�l���������ق����Ή��ł��܂����B";
		mes "�����܂��񂪁A�X�������肢���܂��B";
		viewpoint 2,35,254,1,0xFFFFFF; //59151
		cutin "bu_mark2",0;
		setquest 11363;
		delquest 11363;
		setquest 11364;
		delquest 11364;
		setquest 11365;
		delquest 11365;
		setquest 11366;
		delquest 11366;
		setquest 11367;
		delquest 11367;
		setquest 11368;
		delquest 11368;
		setquest 11369;
		delquest 11369;
		setquest 11370;
		delquest 11370;
		setquest 11371;
		delquest 11371;
		setquest 11372;
		delquest 11372;
		setquest 11373;
		delquest 11373;
		setquest 11374;
		delquest 11374;
		setquest 118330;
		delquest 118330;
		delquest 11375;
		setquest 11376;
		set VER2_QUE,15;
		getexp 1000000,0; //91278582
		getexp 1000000,0; //92278582
		getexp 1000000,0; //93278582
		getexp 1000000,0; //94278582
		getexp 1000000,0; //95278582
		getexp 0,500000; //5072610
		getexp 0,500000; //5572610
		getexp 0,500000; //6072610
		getexp 0,500000; //6572610
		getexp 0,500000; //7072610
		close2;
		cutin "bu_mark2",255;
		end;
	}
	else if(VER2_QUE == 15) {
		mes "[�^�}����]";
		mes "���܂�C�͐i�݂܂���";
		mes "�T���ꏊ���Ȃ��Ȃ��Ă������A";
		mes "���̒����ꏊ�͂���";
		mes "���[�v�|�[�^�������Ȃ��ł��傤�ˁB";
		mes "�����A���[�v�|�[�^���g�p�ɂ�";
		mes "�������苖���K�v�̂悤�ł����ǁB";
		cutin "ep143_tasta",0;
		next;
		if(select("����","���H") == 2) {
			mes "[�^�}����]";
			mes "�������肽���@�c�݂̂�";
			mes "��������\���Ɠ������̕���";
			mes "�����Ă��܂�������A�ǂ�����";
			mes "���@�c�ɏ������ċ�����Ȃ��ƁA";
			mes "�ʖڂȂ悤�ł��ˁB";
			next;
			mes "[�^�}����]";
			mes "���������΁c�c";
			mes "���@�c�Ƃ����΃����N�ɂ���A";
			mes "^0000FF�y���c^000000�Ŕ��@�c�̎Q�������o�[��";
			mes "����Ă����C�����܂��B";
			mes "��x�A�₢���킹�Ă݂Ă�";
			mes "�������ł��傤�H";
			next;
		}
		mes "[�}�[�N�C�V��]";
		mes strcharinfo(0)+ "�l�B";
		mes "�ł́A�������͈�U";
		mes "�������苖��Ⴂ�ɖ߂�܂�����";
		mes "��قǁA���[�v�|�[�^���̌�������";
		mes "�����������Ƃɂ��܂��񂩁H";
		cutin "bu_mark1",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�댯�ȏꏊ�̂悤�ł����A";
		mes "�݂�Ȉꏏ�ɍs�������ق���";
		mes "�������������c�c";
		mes "���ɂ������\�������Ƃ��́A";
		mes "�l���������ق����Ή��ł��܂����B";
		mes "�����܂��񂪁A�X�������肢���܂��B";
		cutin "bu_mark2",0;
		close2;
		cutin "bu_mark2",255;
		end;
	}
	mes "[�}�M�X�e�B��]";
	mes "�c�c�����͂킩��܂��񂪁A";
	mes "�댯�ȋC���������܂��c�c�B";
	cutin "bu_maggi3",2;
	close2;
	cutin "bu_maggi3",255;
	end;
}
verus04.gat,153,193,8	script	���l#ep15_1el10	879,{/* 59406 */
	mes "[���l]";
	mes "�قققققف�";
	mes "�����́A�����ۂ��L����Ԃ�`��";
	mes "���Y��������Ύ��������������A";
	mes "���q�l�ɂ�������x�����A";
	mes "���i�񋟂ł��邵�ˁ`��";
	close;
}
verus04.gat,155,197,5	script	�`����?#ep15_1el11	870,{/* 59407 */
	mes "[�`���ƁH]";
	mes "�����������`�c�c";
	mes "�@";
	mes "�����������`�c�c�B";
	next;
	mes "[�`���ƁH]";
	mes "�Q�ĂȂ����B";
	mes "����Ŏ����Ă�������";
	mes "�S���g���Ă��܂���";
	mes "�т�H�ׂ�Zeny���Ȃ��񂾁B";
	mes "�c�c�������͕̂��̉��ˁB";
	close;
}
verus04.gat,150,193,3	script	�`����#ep15_1el12	849,{/* 59408 */
	mes "[�`����]";
	mes "���̐l�̕��̉������邳���āc�c�B";
	mes "���������Q�Ă��₵�Ȃ��B";
	mes "�����ݗ����ł�";
	mes "�킯�Ă��ׂ����c�c�H";
	close;
}
verus04.gat,102,246,3	script	�`����#ep15_1el13	930,{/* 59409 */
	mes "[�`����]";
	mes "�L�m�R���΂��ђʂ��Ĉ�Ƃ́c�c";
	mes "���ꂪ�{���̐΃L�m�R���Ă�H";
	mes "��y���������т������B";
	close;
}
verus04.gat,16,157,3	script	�`����#ep15_1el14	928,{/* 59410 */
	mes "[�`����]";
	mes "�C���C������!!";
	mes "�ǂ����Ă��̓��͒ʂ�Ȃ��I";
	mes "�ʂ�Ȃ��̂ɓ��Ƃ�";
	mes "������������!!";
	close;
}
verus04.gat,96,192,5	script	�`���j����#ep15_1el15	554,{/* 59411 */
	mes "[�`���j����]";
	mes "�����ꏊ���j�����c�c�B";
	mes "�����ڂ����ɍœK���j�����B";
	mes "�j���j�����c�c��";
	close;
}
verus04.gat,96,193,5	script	�`���j����#ep15_1el16	554,{/* 59412 */
	mes "[�`���j����]";
	mes "�݂�ȂŖ`���ɗ����j�����B";
	mes "�ł����̏ꏊ�̋��S�n���ƂĂ�";
	mes "�ǂ����āA�����Ȃ��񂾃j�����B";
	close;
}
verus04.gat,96,194,5	script	�`���j����#ep15_1el17	554,{/* 59413 */
	mes "[�`���j����]";
	mes "�}�����L����C�c�c�}�����L���j�C�c�c";
	mes "���[�t�L���b�g����C�c�c��C�c�c";
	mes "���C���h���[�Y���c�c";
	mes "���[���c�c�B";
	close;
}
verus04.gat,96,195,5	script	�`���j����#ep15_1el18	554,{/* 59414 */
	mes "[�`���j����]";
	mes "���A�Ȋʋl���Q�b�g�����j����!!";
	mes "�j�����B�����Ă��Ƃ���";
	mes "���񂾃j�����c�c�B";
	mes "�ނɂ�ނɂ�c�c�B";
	close;
}
verus04.gat,104,120,3	script	��?#ep15_1el19	889,{/* 59415 */
	mes "[���H]";
	mes "���`���c�c�B";
	close;
}
verus04.gat,111,215,5	script	�`����#ep15_1el20	919,{/* 59416 */
	mes "[�`����]";
	mes "�͂��c�c�����͐����ȁc�c�B";
	mes "�Łc�c";
	mes "�ǂ����Ă���ȏꏊ�ɋ����c�c�B";
	mes "�܂����A���ƃE�V�Ȃ�ꂽ";
	mes "�����������Ă�̂�!?";
	mes "�c�c���܂�A�Y��Ă���B";
	close;
}
verus04.gat,111,211,3	script	�`����#ep15_1el21	906,{/* 59417 */
	mes "[�`����]";
	mes "����Ȑ��������������Ƃ́c�c�B";
	mes "���b�P���x���Ђ��~������̂��킩��B";
	mes "��Ⴂ�Ɋ����鋍��";
	mes "������������c�c";
	mes "�Ñ㕶���ɂ���č��ꂽ";
	mes "�������킾������c�c!?";
	close;
}
verus04.gat,113,235,5	script	�`����#ep15_1el22	875,{/* 59418 */
	mes "[�`����]";
	mes "���������������������̂��A";
	mes "�������Ȃ���!!";
	mes "�Ñ㕶���Ȃ炫���ƁA";
	mes "�I���̐S����������悤��";
	mes "�������݂���͂��c�c�B";
	close;
}
verus04.gat,124,220,8	script	�`����#ep15_1el23	900,{/* 59419 */
	mes "[�`����]";
	mes "�V��������͌N������";
	mes "����ɂȂ邾��ˁB";
	mes "�Ȃ�ƂȂ��N�����Ă�����";
	mes "�����v������B";
	close;
}
verus03.gat,129,21,5	script	���Q�o�[�h#ep15	51,{/* 59420 */
	if(checkquest(4295) & 0x8 == 0) {
		mes "[���Q�o�[�h]";
		mes "���͊e�n������Ȃ���";
		mes "�F�X�Ȑl�X����b�𕷂���";
		mes "���̘b�����ɂ��Ă��܂��B";
		mes "�����A���Ȃ����e�n�Ŗʔ��������";
		mes "�o������Ȃ玄�ɂ���������ĉ������B";
		setquest 4295;
		compquest 4295;
		close;
	}
	mes "[���Q�o�[�h]";
	mes "����ɂ��́B";
	mes "�b�𕷂����Ē�����̂ł����H";
	next;
	if(select("�b������","��߂�") == 2) {
		mes "[���Q�o�[�h]";
		mes "�����ł����c�c�B";
		mes "�ʔ����b������܂�����";
		mes "���Е������Ă��������B";
		close;
	}
	mes "[���Q�o�[�h]";
	mes "�ǂ�ȏo�����ɂ���";
	mes "�����Ă��������܂����H";
	set '@str1$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"���Q���V�������������@"+ (QUE1_TEST >= 13? "��V���\": "���B��") +"^000000";
	set '@str2$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"�哝�́@"+ (QUE1_TEST >= 13? "��V���\": "���B��") +"^000000";
	set '@str3$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"�W���s���X��Ւ����@"+ (QUE1_TEST >= 13? "��V���\": "���B��") +"^000000";
	set '@str4$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"�����W�Q�@"+ (QUE1_TEST >= 13? "��V���\": "���B��") +"^000000";
	set '@str5$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"��N�G�X�g��2���@"+ (QUE1_TEST >= 13? "��V���\": "���B��") +"^000000";
	set '@str6$,(QUE1_TEST >= 13? "^0000ff": "^ff0000") +"�I�[�f�B���_�a���@�c�@"+ (QUE1_TEST >= 13? "��V���\": "���B��") +"^000000";
	next;
	switch(select('@str1$,'@str2$,'@str3$,'@str4$,'@str5$,'@str6$,"��߂�")) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		//	������
	case 7:
		mes "[���Q�o�[�h]";
		mes "�����ł����c�c�B";
		mes "�ʔ����b������܂�����";
		mes "���Е������Ă��������B";
		close;
	}
OnInit:
	waitingroom "���Q�o�[�h",0; //59420
	end;
}
verus04.gat,194,165,5	script	���b�P���x���K�[�h#ver0	868,{/* 59421 */
	mes "[���b�P���x���K�[�h]";
	mes "���@�c�����̕��ł����H";
	mes "���@�c����ƂɏW���ł���悤��";
	mes "���͂���Ƃ����w����";
	mes "����󂯂Ă���܂��̂ŁA";
	mes "��X�͕ۈ��ɐs�͒v���܂��I";
	close;
}
verus04.gat,203,171,3	script	���b�P���x���K�[�h#ver0	868,{/* 59422 */
	mes "[���b�P���x���K�[�h]";
	mes "���b�P���x���̓E�F���X�V�e�B��";
	mes "���@��Ƃ��㉇���Ă��܂��B";
	mes "�s�ւȓ_������܂�����";
	mes "���ł������ĉ������B";
	close;
}
verus04.gat,171,267,3	script	���b�P���x���K�[�h#ver0	867,{/* 59423 */
	mes "[���b�P���x���K�[�h]";
	mes "���������c�c����́c�c���I";
	mes "���āA������I";
	mes "�낤���x��������������";
	mes "�򑐖��̂ɂ��𗎂Ƃ��Ƃ���";
	mes "����������Ȃ��ł����I";
	mes "�������Ȃ��ŉ�����!!";
	close;
}
verus04.gat,218,217,5	script	�n���w��#ver04	897,{/* 59424 */
	mes "[�n���w��]";
	mes "�ӂށA��������̕ǂɂ����";
	mes "���Ă��܂��ˁB";
	mes "���������Ă���̂͊m���ł���";
	mes "������ǂ̔j�Ђ͌�������Ȃ��B";
	next;
	mes "[����]";
	mes "�͂��B";
	next;
	mes "[�n���w��]";
	mes "�܂��A���̒n�w�Ƃ��̊�̕ǂ�";
	mes "�Ⴄ�����̕��̂悤�ł��ˁB";
	mes "�ڂ������͂�����������������";
	mes "�K�v�����肻���ł��B";
	next;
	mes "[����]";
	mes "�͂��B";
	next;
	mes "[�n���w��]";
	mes "�ǂ����Ă����ɂ���ȕ���";
	mes "���݂��Ă���̂��͕s���ł����A";
	mes "�l�דI�ɑ���ꂽ���ł�";
	mes "�Ȃ������ȋC�����܂��ˁc�c�B";
	mes "�N�̍l���͂ǂ��ł����H";
	next;
	mes "[����]";
	mes "�͂��B";
	next;
	mes "[�n���w��]";
	mes "�c�c�킩�����A������߂悤�B";
	mes "�H���ɂ��悤�B";
	next;
	mes "[����]";
	mes "�͂�����!!!!!!";
	close;
}
verus04.gat,217,216,5	script	����#ver05	898,{/* 59425 */
	mes "[����]";
	mes "�搶�̘b�͂��߂ɂȂ邯��";
	mes "������ƒ����̂��c�c�B";
	mes "�@";
	mes "���[���Ȃ��������B";
	close;
}
verus04.gat,50,193,3	script	�w��#ver06	900,{/* 59426 */
	mes "[�w��]";
	mes "�V���o���c�o���g�̓~�b�h�K���h�̒���";
	mes "�ł��Ȋw�͂����W���Ă��鍑���B";
	mes "����ł��A�����̐����ɂ͋y�΂Ȃ��B";
	next;
	mes "[�w��]";
	mes "�W���s���X���������B";
	mes "�����̉Ȋw�͂��V���o���c�o���g��";
	mes "�`����Ă�����c�c�B";
	mes "���݂͑����Ȑ����̉Ȋw�卑��";
	mes "�Ȃ��Ă������낤�ȁB";
	close;
}
verus04.gat,127,243,3	script	�s�G��#ver07	715,{/* 59427 */
	mes "[�s�G��]";
	mes "����ȕ��I�ȏꏊ��";
	mes "��Ƃ𑱂��Ă�����";
	mes "�������������Ȃ���";
	mes "���܂������m��Ȃ���I";
	next;
	mes "[�s�G��]";
	mes "�s�v�c�A�s�v�c�A";
	mes "�{���ɕs�v�c��";
	mes "<�W���O�����O�Ő肤�����̉^��>";
	mes "��x�A����Ă݂Ȃ��H";
	next;
	if(select("�肤","��߂Ă���") == 2) {
		mes "[�s�G��]";
		mes "�肢�ɖ��𔄂�悤��";
		mes "���Ԃ͂Ȃ����Ă��Ƃ����H";
		mes "�肢�����ɁB";
		close;
	}
	mes "[�s�G��]";
	mes "������A���ꂶ�Ⴀ";
	mes "���̃W���O�����O�̒�����";
	mes "�D���ȐF��I��łˁB";
	mes "<�����̉^��>��\�����̂�����";
	mes "�T�d�ɂˁI";
	next;
	switch(select("��","��","��","��")) {
	case 1:
	case 2:
	case 3:
	case 4:
		// ������
	}
	mes "[�s�G��]";
	mes "���Ⴖ�Ⴖ��`��I";
	mes "�����̉^���`�I";
	mes "�����A���Ă݂܂��傤���H";
	mes "�W���O�����O�̒��ɉB���ꂽ";
	mes "�^���̎��I";
	next;
	mes "[�s�G��]";
	mes "���Ȃ��̉^���́c�c�B";
	next;
	mes "[�s�G��]";
	mes "�����͌��C���o�Ȃ����c�c�B";
	mes "�ς��Ȃ����X�͂���������I";
	mes "�����Ǎm��I�ȗ͖͂����Ȃ͂��I";
	mes "�݂�ȂƖ��邭�ڂ��Ă���΁A";
	mes "���񂾂�^�C�͏オ�钛���B";
	mes "���b�L�[�A�C�e���́A�ŖS�̏؁B";
	next;
	mes "[�s�G��]";
	mes "�^���͋C�ɓ������H";
	mes "����Ƃ��C�ɓ���Ȃ��H";
	mes "����������T�A������ʂ����T�B";
	mes "���Ă��ƂŁA���܂�C�ɂ�����";
	mes "���@��ƁA�撣�낤���`�I";
	mes "�܂��ɂȎ��͗V�тɗ��Ăˁ[�I";
	close;
}
verus04.gat,180,209,3	script	���@�c��#tre01	898,{/* 59428 */
	mes "[���@�c��]";
	mes "�����ɏZ��ł����l��";
	mes "�E�F���X�V�e�B�ł͏d�v��";
	mes "���������������������悤�ł��B";
	next;
	mes "[���@�c��]";
	mes "���ς��ꂽ�����̏��ނ𕔉���";
	mes "�����܂�������B";
	next;
	mes "[���@�c��]";
	mes "�܂��A���ނ̓��e��";
	mes "��������אl�Ƃ̃g���u���Ȃ�";
	mes "�債�����e�́A����܂���ł����B";
	next;
	mes "[���@�c��]";
	mes "�����A�����̏��ނɓ��";
	mes "��������������Ă����̂ł��B";
	mes "���ꂪ�L�Ȃ̂��A�����X�^�[�Ȃ̂�";
	mes "�悭�킩��Ȃ��̂ł���c�c�B";
	mes "���炭�P�Ȃ闎�����ł��傤���A";
	mes "��̒N���������̂ł��傤�ˁB";
	close;
}
verus04.gat,202,181,3	script	#tre02	844,{/* 59429 */
	mes "�]�h�A�ɂ�<�r�����[�~��>";
	mes "�@�Ƃ���������������Ă���]";
	close;
}
verus04.gat,121,188,3	script	���@�c�� #tre04	898,{/* 59430 */
	mes "[���@�c��]";
	mes "�����ɂ͐����Ɏg������";
	mes "�����c����Ă��܂�����";
	mes "�l���Z��ł������Ղ�";
	mes "�܂�łȂ�������ł��B";
	next;
	mes "[���@�c��]";
	mes "���̏ꏊ�ɏZ��ł����̂ł��傤���H";
	mes "�Ⴆ�Εʑ��̂悤�ȁc�c�B";
	close;
}
verus04.gat,119,177,3	script	#tre05	844,{/* 59431 */
	mes "�]�h�A�ɂ�<�R�[���V��>�Ƃ���";
	mes "�@������������Ă���B";
	close;
}
verus04.gat,85,145,3	script	#tre06	844,{/* 59432 */
	mes "�]�h�A�ɂ�<�A���h���j�R�X>";
	mes "�@�Ƃ���������������Ă���]";
	close;
}
verus04.gat,83,131,3	script	���@�c�� #tre07	898,{/* 59433 */
	mes "[���@�c��]";
	mes "���j�ɑ���ꂽ���̑��݂�M��";
	mes "�����̏ؖ����o���Ȃ��܂�";
	mes "�w���Ǖ����ꂽ�j���A��ɓ��ꂽ";
	mes "�s�v�c�Ȑ΂�������l����T��";
	mes "�Ƃ������ꂪ�A�{�ɍڂ��Ă����B";
	mes "�ʔ����Ă��ǂ�ł��܂�����B";
	close;
}
verus04.gat,71,118,3	script	#tre08	844,{/* 59434 */
	mes "�]�h�A�ɂ�<�}�C�J>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,71,131,3	script	#tre09	844,{/* 59435 */
	mes "�]�h�A�ɂ�<�[�J����>��";
	mes "�@������������Ă���-";
	close;
}
verus04.gat,71,145,3	script	#tre10	844,{/* 59436 */
	mes "�]�h�A�ɂ�<�����J�[>�Ƃ���";
	mes "�@������������Ă���-";
	close;
}
verus04.gat,39,123,3	script	#tre11	844,{/* 59437 */
	mes "�]�h�A�ɂ�<�Z�C�^��>";
	mes "�@�Ƃ���������������Ă���]";
	close;
}
verus04.gat,17,145,3	script	#tre12	844,{/* 59438 */
	mes "�]�h�A�ɂ�<�T�[���[>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,16,166,5	script	���@�c�� #tre13	898,{/* 59439 */
	mes "[���@�c��]";
	mes "���̉Ƃŉ������ȃ`�P�b�g���E�����B";
	mes "�ł����̃`�P�b�g�c�c";
	mes "�s�g�Ƃ������A�Ȃ񂾂�";
	mes "���̍��肪����C������B";
	mes "�c�c���A�����I����";
	mes "���Ⴂ����ȁA����c�c�B";
	close;
}
verus04.gat,118,159,5	script	���@�c�� #tre14	898,{/* 59440 */
	mes "[���@�c��]";
	mes "���̉Ƃɂ͓�̃v������";
	mes "�����ꂽ����";
	mes "5���قǗ����Ă���B";
	mes "���ł��v����E��";
	mes "�Y��ǂ�����ĂԂ�";
	mes "�l�I�ɋC�ɂȂ�c�c�B";
	close;
}
verus04.gat,123,143,3	script	#tre15	844,{/* 59441 */
	mes "�]�h�A�ɂ�<�i�^��>�Ƃ���";
	mes "�@�v���[�g���͂܂��Ă���]";
	close;
}
verus04.gat,72,168,3	script	#tre16	844,{/* 59442 */
	mes "�]�h�A�ɂ�<�N���[�X�s�[�k�X>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,91,168,3	script	#tre17	844,{/* 59443 */
	mes "�]�h�A�ɂ�<�t�����S�[>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,50,197,3	script	���@�c�� #tre18	898,{/* 59444 */
	mes "[���@�c��]";
	mes "�c�c�B";
	mes "�c�c�n�b�I";
	mes "�����炻����!?";
	mes "�E�����{�ɖ����ŁA";
	mes "�C�Â��Ȃ������c�c�B";
	next;
	mes "[���@�c��]";
	mes "���̉Ƃł͂��܂̂ʂ�����݂�";
	mes "�`�������t�V�M�Ȑ�������";
	mes "������������񂾁B";
	mes "���܂ꂽ�ꏊ�͈���Ă�";
	mes "���ǂ����Ă�������Č��t��";
	mes "�ƂĂ��ǂ������c�c�I";
	close;
}
verus04.gat,34,197,3	script	#tre19	844,{/* 59445 */
	mes "�]�h�A�ɂ�<���[��>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,17,245,3	script	#tre20	844,{/* 59446 */
	mes "�]�h�A�ɂ�<�t�B���X>��";
	mes "�@������Ă���]";
	close;
}
verus04.gat,13,262,3	script	#tre21	844,{/* 59447 */
	mes "�]�h�A�ɂ�<�X�v���E�X>��";
	mes "�@������Ă���]";
	close;
}
verus04.gat,28,262,3	script	#tre22	844,{/* 59448 */
	mes "�]�h�A�ɂ�<�v���[���X>��";
	mes "�@������Ă���]";
	close;
}
verus04.gat,54,256,3	script	#tre23	844,{/* 59449 */
	mes "�]�h�A�ɂ�<�������_>��";
	mes "�@������Ă���-";
	close;
}
verus04.gat,31,236,3	script	���@�c�� #tre24	898,{/* 59450 */
	mes "[���@�c��]";
	mes "���̉Ƃ��猩������";
	mes "�G���ɋC�ɂȂ鉼�ʂ�";
	mes "���b���������񂾁B";
	next;
	mes "[���@�c��]";
	mes "����ɗ���������";
	mes "�u�E�C�v�����߂���";
	mes "���킢�炵�����ʂ�";
	mes "�ꎞ���A���s�����炵���B";
	mes "�ǂ�ȉ��ʂ������̂�";
	mes "�C�ɂȂ�Ȃ��c�c�B";
	close;
}
verus04.gat,62,230,3	script	#tre25	844,{/* 59451 */
	mes "�]�h�A�ɂ�<���e���[���V�X>��";
	mes "�@������Ă���]";
	close;
}
verus04.gat,80,230,3	script	#tre26	844,{/* 59452 */
	mes "�]�h�A�ɂ�<�O���b�N�X>��";
	mes "�@������Ă���]";
	close;
}
verus04.gat,79,265,3	script	#tre27	844,{/* 59453 */
	mes "�]�h�A�ɂ�<�I�[�E�B��>��";
	mes "�@������Ă���]";
	close;
}
verus04.gat,96,267,3	script	#tre28	844,{/* 59454 */
	mes "�]�h�A�ɂ�<�C��^f8f8f8�b^000000�v>��";
	mes "�@������Ă���]";
	close;
}
verus04.gat,133,267,3	script	���@�c�� #tre29	898,{/* 59455 */
	mes "[���@�c��]";
	mes "�����͌l���o�c����";
	mes "�J�t�F�������̂��Ȃ��B";
	mes "�n�[�g�E�I�����C�X�Ƃ�";
	mes "�Ղ���v�����Ƃ��A";
	mes "�C�ɂȂ閼�O�������ꂽ";
	mes "���j���[�������Ă���B";
	close;
}
verus04.gat,152,267,3	script	#tre30	844,{/* 59456 */
	mes "�]�h�A�ɂ�<�A�n�[��>��";
	mes "�@������Ă���-";
	close;
}
verus04.gat,168,267,3	script	#tre31	844,{/* 59457 */
	mes "�]�h�A�ɂ�<�N�[���A�[�e�B�E�X>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,190,265,3	script	#tre32	844,{/* 59458 */
	mes "�]�h�A�ɂ�<���e���[�k�X>�Ƃ���";
	mes "�@������������Ă���-";
	close;
}
verus04.gat,172,234,3	script	#tre33	844,{/* 59459 */
	mes "�]�h�A�ɂ�<�I���X�e�[�X>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,204,235,3	script	#tre34	844,{/* 59460 */
	mes "�]�h�A�ɂ�<�N��^f8f8f8�b�V^000000���[�}^ffffff�b�X^000000��>�Ƃ���";
	mes "�@������������Ă���]";
	close;
}
verus04.gat,121,243,4	script	�W�����_�E��	874,{/* 59461 */
	cutin "zonda_01",2;
	mes "[�W�����_�E��]";
	mes "��������Ⴂ�܂��B";
	mes "�i�L�j�W�����_�C�x���g�́A���";
	mes "�ō��̃T�[�r�X��񋟂��Ă���܂��B";
	mes "�ǂ̃T�[�r�X�������p�������܂����H";
	next;
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	if('@map$ == "rachel.gat" || '@map$ == "veins.gat")
		set '@word$,"��Ԉړ��T�[�r�X";
	if('@map$ == "verus04.gat")
		set '@zeny,50;
	else
		set '@zeny,40;
	switch(select("�ʒu�Z�[�u�T�[�r�X","�q�ɃT�[�r�X -> " +'@zeny+ "zeny",'@word$,"�J�[�g�T�[�r�X","�I��")) {
	case 1:
		if('@map$ == "lighthalzen.gat")
			savepoint "lighthalzen.gat",94,240;
		else if('@map$ == "hugel.gat")
			savepoint "hugel.gat",97,153;
		else if('@map$ == "rachel.gat")
			savepoint "rachel.gat",115,125;
		else if('@map$ == "veins.gat")
			savepoint "veins.gat",205,102;
		else if('@map$ == "verus04.gat")
			savepoint "verus04.gat",205,102;
		mes "[�W�����_�E��]";
		mes "�Z�[�u�������܂����B";
		mes "�����p�����܂��āA";
		mes "���ɂ��肪�Ƃ��������܂��B";
		break;
	case 2:
		if(basicskillcheck() && getskilllv(1) < 6) {
			mes "[�W�����_�E��]";
			mes "���ɐ\���󂲂����܂���A���q�l�B";
			mes "�q�ɂ́A��{�X�L�����x��6��";
			mes "�K�����Ă��痘�p�\�ƂȂ�܂��B";
			break;
		}
		if(Zeny < '@zeny) {
			mes "[�W�����_�E��]";
			mes "���q�l�A�q�ɗ��p����";
			mes '@zeny+ " Zeny�ƂȂ��Ă���܂��B";
			mes "��ϐ\���󂲂����܂��񂪁A";
			mes "�����������m���߂̏�A";
			mes "�ēx�b���|���Ă��������B";
			break;
		}
		set Zeny,Zeny-'@zeny;
		mes "[�W�����_�E��]";
		mes "�����p�����܂��āA";
		mes "���ɂ��肪�Ƃ��������܂��B";
		close2;
		openstorage;
		cutin "zonda_01",255;
		end;
	case 3:
		mes "[�W�����_�E��]";
		mes "�ړI�n��I��ł��������B";
		next;
		if('@map$ == "rachel.gat")
			set '@word$,"�x�C���X";
		else if('@map$ == "veins.gat")
			set '@word$,"���w��";
		if(select('@word$+ " -> 2200 z","�L�����Z��")==2) {
			mes "[�W�����_�E��]";
			mes "�܂������p���������܂��B";
			break;
		}
		if(Zeny < 2200) {
			mes "[�W�����_�E��]";
			mes "���q�l�A" +'@word$+ "�܂ł�";
			mes "��Ԉړ��T�[�r�X�̗�����";
			mes "2200 Zeny�ƂȂ��Ă���܂��B";
			mes "�����������m���߂̏�A";
			mes "�ēx�����p���������B";
			break;
		}
		cutin "zonda_01",255;
		set Zeny,Zeny-2200;
		if('@map$ == "rachel.gat")
			warp "veins.gat",205,102;
		else if('@map$ == "veins.gat")
			warp "rachel.gat",115,125;
		end;
	case 4:
		if(getbaseclass(Class) != CLASS_MC) {
			mes "[�W�����_�E��]";
			mes "���q�l�A��ϐ\���󂲂����܂��񂪁A";
			mes "�J�[�g�T�[�r�X�́A���l�Ƃ��̏�ʐE";
			mes "��p�̃T�[�r�X�ƂȂ��Ă���܂��B";
			break;
		}
		if(checkcart()) {
			mes "[�W�����_�E��]";
			mes "��ϐ\���󂲂����܂��񂪁A";
			mes "���q�l�͌��݃J�[�g��";
			mes "�����p����Ă���܂��B";
			break;
		}
		mes "[�W�����_�E��]";
		mes "�J�[�g���p������ 800 Zeny�ł��B";
		mes "�܂��A�J�[�g�𗘗p����ɂ�";
		mes "�u�v�b�V���J�[�g�v�X�L�����K�v�ł��B";
		mes "���̃X�L�����Ȃ��ƃJ�[�g�𗘗p";
		mes "�ł����ɂ������������Ă��܂��܂��B";
		mes "�����͂�낵���ł����H";
		next;
		if(select("���p����","������")==2) {
			mes "[�W�����_�E��]";
			mes "���肪�Ƃ��������܂����B";
			mes "�܂��̂����p�����҂����Ă���܂��B";
			break;
		}
		if(Zeny < 800) {
			mes "[�W�����_�E��]";
			mes "���q�l�A�J�[�g���p������";
			mes "800 Zeny�ł��B";
			mes "��ϐ\���󂲂����܂��񂪁A";
			mes "�����������m���߂̏�A";
			mes "�ēx�b���|���Ă��������B";
			break;
		}
		set Zeny,Zeny-800;
		setcart;
		break;
	case 5:
		mes "[�W�����_�E��]";
		mes "�i�L�j�W�����_�C�x���g�́A���q�l��";
		mes "��ɍō��̃T�[�r�X��";
		mes "�񋟂������Ă���܂��B";
		mes "���ӌ��E���v�]�Ȃǂ������܂�����A";
		mes "���ł�����������Ă��������B";
		next;
		mes "[�W�����_�E��]";
		mes "�����p�����܂��āA";
		mes "���ɂ��肪�Ƃ��������܂����B";
		break;
	}
	close2;
	cutin "zonda_01",255;
	end;
}
verus04.gat,144,239,3	shop	����l#verus	536,717:600,611:40,504:1200,525:500,610:4000,645:800,656:1500,657:3000,601:60,602:300,1065:100 //59462
verus04.gat,111,251,4	shop	�Ŕ̔���	49,6186:500,6146:300,14504:5000,6145:10,12383:11000,6147:100,18000:100,18001:200,18002:200,18003:200,18004:500,12392:220,12393:500,12394:1100,2807:200000,2139:20000,2800:100000,2801:100000,2802:500000,2803:100000,2804:100000,2805:100000,2806:150000,2808:250000 //59463
juperos_01.gat,245,87,0	warp	fr_ju_to_eju		1,1,ver_eju.gat,13,148	//59464
ver_eju.gat,10,148,0	warp	fr_eju_to_ju		1,1,juperos_01.gat,242,87	//59465
ver_eju.gat,107,36,0	warp	fr_eju_to_tun		2,2,ver_tunn.gat,84,82	//59466
ver_tunn.gat,84,86,0	warp	fr_tun_to_eju		1,1,ver_eju.gat,113,38	//59467
ver_tunn.gat,10,36,0	warp	fr_tun_to_ver04		1,1,verus04.gat,202,165	//59468
verus04.gat,204,163,0	warp	fr_ver04_to_tun		1,1,ver_tunn.gat,13,35	//59469
verus04.gat,121,267,0	warp	fr_ver04_to_ver03_1	1,1,verus03.gat,121,20	//59470
verus03.gat,122,17,0	warp	fr_ver03_to_ver04_1	1,1,verus04.gat,121,264	//59471
verus04.gat,44,267,0	warp	fr_ver04_to_ver03_2	1,1,verus03.gat,44,20	//59472
verus03.gat,44,17,0		warp	fr_ver03_to_ver04_2	1,1,verus04.gat,44,264	//59473
verus04.gat,187,169,5	script	�E�F���X�ē���#01	71,{
	mes "[�E�F���X�ē���]";
	mes "����ɂ��́A�`���҂̕��ł��ˁB";
	mes "����������ł�����";
	mes "�����E�F���X�����ē����܂���B";
	mes "�ǂ����s�������ꏊ�͂���܂����H";
	mes "^ff0000�|�]�����I�������^000000";
	mes "^ff0000�@�~�j�}�b�v�ɓ]���悪�\������܂��|^000000";
	set '@type,strnpcinfo(2);
	setarray '@str$,
		"�����t��",
		"�A�g�i�h���@�c�L�����v�t��",
		"�`���[���X�g���t��",
		"�k��",
		"�k����",
		"�~�jMAP��̈ʒu�\��������",
		"��߂�";
	set '@str$['@type-1],"";
	next;
	while(1) {
		switch(select(printarray('@str$))) {
		case 1:
			mes "[�E�F���X�ē���]";
			mes "�����t�߂ł��ˁB";
			mes "�����ł�낵���ł����H";
			viewpoint 1,184,161,1,0xFF0000;
			break;
		case 2:
			mes "[�E�F���X�ē���]";
			mes "�A�g�i�h���@�c�L�����v�t�߂ł��ˁB";
			mes "�����ł�낵���ł����H";
			set '@x,142;
			set '@y,188;
			viewpoint 1,142,188,2,0x00FF00;
			break;
		case 3:
			mes "[�E�F���X�ē���]";
			mes "�`���[���X�g���t�߂ł��ˁB";
			mes "�����ł�낵���ł����H";
			viewpoint 1,77,123,3,0x00FFFF;
			break;
		case 4:
			mes "[�E�F���X�ē���]";
			mes "�k���ł��ˁB";
			mes "�����ł�낵���ł����H";
			set '@x,121;
			set '@y,249;
			viewpoint 1,44,260,4,0xFF00FF;
			break;
		case 5:
			mes "[�E�F���X�ē���]";
			mes "�k�����ł��ˁB";
			mes "�����ł�낵���ł����H";
			viewpoint 1,44,260,5,0xFFFF00;
			break;
		case 6:
			viewpoint 2,184,161,1,0xFF0000;
			viewpoint 2,142,188,2,0x00FF00;
			viewpoint 2,77,123,3,0x00FFFF;
			viewpoint 2,121,249,4,0xFF00FF;
			viewpoint 2,44,260,5,0xFFFF00;
			continue;
		case 7:
			mes "[�E�F���X�ē���]";
			mes "�����ł����c�c�B";
			mes "�K�v�ɂȂ�����";
			mes "�܂����������Ă��������ˁB";
			close;
		}
		next;
		if(select("�͂�","������") == 2)
			continue;
		mes "[�E�F���X�ē���]";
		mes "����ł͂܂���܂��傤�B";
		close2;
		warp "verus04.gat",'@x,'@y;
		end;
	}
OnInit:
	waitingroom "�E�F���X�ē�",0;
	end;
}
verus04.gat,137,191,4	duplicate(�E�F���X�ē���#01)	�E�F���X�ē���#02	71
verus04.gat,81,118,3	duplicate(�E�F���X�ē���#01)	�E�F���X�ē���#03	71
verus04.gat,126,252,3	duplicate(�E�F���X�ē���#01)	�E�F���X�ē���#04	71
verus04.gat,48,264,4	duplicate(�E�F���X�ē���#01)	�E�F���X�ē���#05	71

verus04.gat,115,243,3	script	�f�C���[�N�G�X�g�ē���#	95,{/* 59479 */
	mes "[�f�C���[�N�G�X�g�ē���]";
	mes "����ɂ��́`�I";
	mes "�����ł͖`���҂���B��";
	mes "����`�������Ă��܂���`�I";
	mes "���A�E�F���X�ɂ͑�R�̐l�����邩��";
	mes "�������Ⴄ�l�����\����݂����Łc�c";
	next;
	mes "[�f�C���[�N�G�X�g�ē���]";
	mes "�����ŁI";
	mes "�ǂ̈˗���i�߂����̂������āA";
	mes "����]�ł���Έ˗���̌��܂�";
	mes "���������肵�Ă����ł��I";
	mes "�����ւ�I";
	next;
	mes "[�f�C���[�N�G�X�g�ē���]";
	mes "�e�˗��̕�V�ɂ��Ă�";
	mes "���ē������Ă��܂���`�I";
	mes "�����A�ǂ����܂��H";
	next;
	switch(select("��V�ɂ��ċ����Ăق���","�����Ăق���","���͗p�͂Ȃ�")) {
	case 1:
		mes "[�f�C���[�N�G�X�g�ē���]";
		mes "�́`���I";
		mes "�ł́A��������������������I";
		mes "��V�̈ꗗ�ł���`�B";
		mes "�@";
		mes "�]���������Ă����]";
		next;
		mes "^ff0000�]�O�s�g���l���̃����X�^�[�����]^000000";
		mes "�@^ff9900�Âт��S��3��^000000";
		mes "�@";
		mes "^ff0000�]�����L��̃����X�^�[�����]^000000";
		mes "�@^ff9900�Âт��S��5��^000000";
		mes "�@";
		mes "^ff0000�]�A�g�i�h�̈˗��]^000000";
		mes "�@^ff9900�Âт��S��5��^000000";
		mes "�@";
		mes "^ff0000�]�ÏW���ꂽ�G�l���M�[���W�]^000000";
		mes "�@^ff9900�Âт��R���^���N1��^000000";
		mes "�@";
		mes "^ff0000�]���ʕ񍐏��]^000000";
		mes "�@^ff9900�Âт��R���^���N2��^000000";
		mes "�@";
		mes "^ff0000�]�������̃������[���R�[�h�W�߁]^000000";
		mes "�@^ff9900�Âт��R���^���N1��^000000";
		mes "�@";
		mes "^ff0000�]�������̃������[���R�[�h�W�߁]^000000";
		mes "�@^ff9900�Âт��R���^���N1��^000000";
		mes "�@";
		mes "^ff0000�]�t�@���^�X�}�S���J�x�����]^000000";
		mes "�@���̈˗��͕����̈˗��ɂȂ��Ă���A";
		mes "�@�B�������˗��̐��ɂ��A";
		mes "�@��V���ω����܂��I";
		mes "�@�S�Ă̈˗���";
		mes "�@�I��点�Ă���񍐂������";
		mes "�@^FF00001,500,000BaseExp^000000";
		mes "�@^FF0000750,000JobExp^000000";
		mes "�@^ff9900�Âт��R���^���N1��^000000";
		mes "�@";
		mes "^ff0000�]�����u���K���@�����I�����m�F�I�]^000000";
		mes "�@^ff9900�Âт��S��1��^000000";
		mes "�@";
		mes "^ff0000�]�����I�X���b�O��|������I�]^000000";
		mes "�@^ff9900�Âт��S��8��^000000";
		mes "�@";
		mes "^ff0000�]�����I^000000";
		mes "^ff0000�@�C���^�E�F���X�M�A�U�Ɛ퓬����I�]^000000";
		mes "�@^ff9900�Âт��S��8��^000000";
		mes "�@";
		mes "^ff0000�]�����I�S�������W����I�]^000000";
		mes "�@^ff9900�Âт��R���^���N1��^000000";
		next;
		mes "[�f�C���[�N�G�X�g�ē���]";
		mes "�ǂ�ǂ�";
		mes "�`�������W���Ă��������ˁ�";
		close;
	case 2:
		mes "[�f�C���[�N�G�X�g�ē���]";
		mes "�́`���I";
		mes "�ǂ̈˗��ɂ��܂����H";
		mes "^0000FF�󒍕s��^000000�̈˗���";
		mes "������ł��܂���̂�";
		mes "�����ӂ��������ˁB";
		next;
		switch(select(
			"�O�s�g���l���̃����X�^�[�����@^9999CC���Ԑ�����^000000",
			"�����L��̃����X�^�[�����@^FF0000�󒍉\^000000",
			"�A�g�i�h�̈˗��@^FF0000�󒍉\^000000",
			"�ÏW���ꂽ�G�l���M�[���W�@^FF0000�󒍉\^000000",
			"���ʕ񍐏��@^0000FF�󒍕s��^000000",
			"�������̃������[���R�[�h�W�߁@^FF0000�󒍉\^000000",
			"�������̃������[���R�[�h�W�߁@^FF0000�󒍒�^000000",
			"�t�@���^�X�}�S���J�x�����@^9999CC���Ԑ�����^000000",
			"�����u���K���@�����I�����m�F�I�@^0000FF�󒍕s��^000000",
			"�����I�X���b�O��|������I�@^0000FF�󒍕s��^000000",
			"�����I�C���^��ٽ�ޱ�U�Ɛ퓬����I�@^0000FF�󒍕s��^000000",
			"�����I�S�������W����I�@^0000FF�󒍕s��^000000",
			"��߂�")
		) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			// ������
		case 13:
			mes "[�f�C���[�N�G�X�g�ē���]";
			mes "�́`���B";
			mes "���������͂܂����Ă��������ˁ`�B";
			close;
		}
	case 3:
		mes "[�f�C���[�N�G�X�g�ē���]";
		mes "�́`���B";
		mes "���������͂܂����Ă��������ˁ`�B";
		close;
	}
OnInit:
	waitingroom "�f�C���[�N�G�X�g�ē�",0; //59479
	end;
}

verus03.gat,55,245,3	script	���b�P���x���w��#e152a0	121,{/* 59486 */
	mes "[���b�P���x���w��]";
	mes "�ӂށc�c���̋@�B��";
	mes "������ǐՂ���p�r��";
	mes "�g�p����Ă����悤�Ɍ����邪�c�c�B";
	mes "�N�͂ǂ��l����H";
	next;
	mes "[���b�P���x���Z�p��]";
	mes "���̍l���������ł��B";
	mes "���̃X�N���[���͒ǐՂ�����A";
	mes "�Ď����鉽���̈ʒu���Ԃ�";
	mes "�m�F����ړI���������Ǝ��܂��B";
	next;
	mes "[���b�P���x���w��]";
	mes "���̕����ꂽ�n���";
	mes "�����󋵂̊m�F��L�^��";
	mes "�s���Ă����̂ł͂Ȃ����H";
	next;
	mes "[���b�P���x���Z�p��]";
	mes "���炭�������Ǝv���܂��B";
	mes "�����ő傫�Ȕ������������Ƃ����̂�";
	mes "���̏󋵂�����ΊȒP�ɐ����ł��܂��B";
	mes "�������Ƃ�����A�O���̐l������";
	mes "���������̏󋵂�m�肽���Ǝv���͂��B";
	next;
	mes "[���b�P���x���w��]";
	mes "�������ȁB";
	mes "����͂����̓����̏󋵂�";
	mes "�m�邽�߂̂��̂��낤�B";
	mes "�c�c����Ȕ����̌�A�����҂�";
	mes "�{�����邽�߂������̂��������B";
	next;
	mes "[���b�P���x���Z�p��]";
	mes "�c�c�ł͒����𑱂��܂��傤�B";
	mes "�����ŉ����N�����̂��A";
	mes "���̔閧�������Ă����̂�";
	mes "�������̖����ł�����ˁB";
	close;
}
verus03.gat,55,243,3	script	���b�P���x���Z�p��#e152	851,{/* 59487 */
	mes "[���b�P���x���w��]";
	mes "�ӂށc�c���̋@�B��";
	mes "������ǐՂ���p�r��";
	mes "�g�p����Ă����悤�Ɍ����邪�c�c�B";
	mes "�N�͂ǂ��l����H";
	next;
	mes "[���b�P���x���Z�p��]";
	mes "���̍l���������ł��B";
	mes "���̃X�N���[���͒ǐՂ�����A";
	mes "�Ď����鉽���̈ʒu���Ԃ�";
	mes "�m�F����ړI���������Ǝ��܂��B";
	next;
	mes "[���b�P���x���w��]";
	mes "���̕����ꂽ�n���";
	mes "�����󋵂̊m�F��L�^��";
	mes "�s���Ă����̂ł͂Ȃ����H";
	next;
	mes "[���b�P���x���Z�p��]";
	mes "���炭�������Ǝv���܂��B";
	mes "�����ő傫�Ȕ������������Ƃ����̂�";
	mes "���̏󋵂�����ΊȒP�ɐ����ł��܂��B";
	mes "�������Ƃ�����A�O���̐l������";
	mes "���������̏󋵂�m�肽���Ǝv���͂��B";
	next;
	mes "[���b�P���x���w��]";
	mes "�������ȁB";
	mes "����͂����̓����̏󋵂�";
	mes "�m�邽�߂̂��̂��낤�B";
	mes "�c�c����Ȕ����̌�A�����҂�";
	mes "�{�����邽�߂������̂��������B";
	next;
	mes "[���b�P���x���Z�p��]";
	mes "�c�c�ł͒����𑱂��܂��傤�B";
	mes "�����ŉ����N�����̂��A";
	mes "���̔閧�������Ă����̂�";
	mes "�������̖����ł�����ˁB";
	close;
}
verus03.gat,59,250,7	script	�R�������@�c�Z�V��#e152	742,{/* 59488 */
	mes "[�Z�V��]";
	mes "�˂��A�R�x���B";
	mes "���������D�ꂽ���@�c�Ƃ���";
	mes "�I�肳��邽�߂ɕK�v�Ȏ��́H";
	next;
	mes "[�R�x��]";
	mes "�I�肳��邽�߂ɕK�v�Ȏ��́c�c�H";
	next;
	mes "[�Z�V��]";
	mes "���̓��̂̒m��Ȃ��@�B������";
	mes "���̂𖾂��������A���@�͂Ȃ��I";
	next;
	mes "[�R�x��]";
	mes "�ǂ����Ă����Ȃ�񂾁H";
	mes "�������̐�U����Ȃ�����Ȃ��H";
	next;
	mes "[�Z�V��]";
	mes "�����ň�ԑ����̂͋@�B�Ȃ񂾁I";
	mes "����𕪐͂���ƁA";
	mes "�����������̃A�g�i�h���@�c�̂悤��";
	mes "�F�߂�����ă��P�I";
	next;
	mes "[�R�x��]";
	mes "���́I�@�Ȃ�قǁA�������ˁI";
	mes "�����ǁA���̃A�g�i�h���@�c�̒c����";
	mes "���̋߂��ɂ���݂��������ǁc�c";
	next;
	mes "[�Z�V��]";
	mes "�Ȃ�!?";
	mes "�������̖ڕW���΂�Ă͂����Ȃ��I";
	mes "����͎��ƌN�����̔閧������ȁI";
	next;
	mes "[�R�x��]";
	mes "�閧���ˁH�@�����`�I";
	close;
}
verus03.gat,61,250,7	script	�R�������@�c�R�x��#e152	750,{/* 59489 */
	mes "[�Z�V��]";
	mes "�˂��A�R�x���B";
	mes "���������D�ꂽ���@�c�Ƃ���";
	mes "�I�肳��邽�߂ɕK�v�Ȏ��́H";
	next;
	mes "[�R�x��]";
	mes "�I�肳��邽�߂ɕK�v�Ȏ��́c�c�H";
	next;
	mes "[�Z�V��]";
	mes "���̓��̂̒m��Ȃ��@�B������";
	mes "���̂𖾂��������A���@�͂Ȃ��I";
	next;
	mes "[�R�x��]";
	mes "�ǂ����Ă����Ȃ�񂾁H";
	mes "�������̐�U����Ȃ�����Ȃ��H";
	next;
	mes "[�Z�V��]";
	mes "�����ň�ԑ����̂͋@�B�Ȃ񂾁I";
	mes "����𕪐͂���ƁA";
	mes "�����������̃A�g�i�h���@�c�̂悤��";
	mes "�F�߂�����ă��P�I";
	next;
	mes "[�R�x��]";
	mes "���́I�@�Ȃ�قǁA�������ˁI";
	mes "�����ǁA���̃A�g�i�h���@�c�̒c����";
	mes "���̋߂��ɂ���݂��������ǁc�c";
	next;
	mes "[�Z�V��]";
	mes "�Ȃ�!?";
	mes "�������̖ڕW���΂�Ă͂����Ȃ��I";
	mes "����͎��ƌN�����̔閧������ȁI";
	next;
	mes "[�R�x��]";
	mes "�閧���ˁH�@�����`�I";
	close;
}

verus02.gat,79,31,4	script	�P���`�F��#1	893,{/* 59522 */
	mes "[�P���`�F��]";
	mes "���߂܂��āI�@�����u���K���̎�C�L��";
	mes "�P���`�F���Ƃ����܂��I";
	mes "��ʌ��J���ꂽ���̏ꏊ����";
	mes "�`���҂̋r���𗁂тĂ��邻���ł��B";
	next;
	mes "[�P���`�F��]";
	mes "�܂����J���Ă܂��Ȃ����߂�";
	mes "��񂪖`���҂ɂ�";
	mes "�`��肫���Ă��Ȃ������ł��B";
	mes "�����ŁI";
	mes "�����������ځA���@�c�������";
	mes "�������|�[�g���Ă��܂��I";
	next;
	mes "[�P���`�F��]";
	mes "�ł�����悢��񂾂�";
	mes "�v������̂�";
	mes "���Ђ��񋟂����肢���܂��ˁI";
	mes "���������Ɍ�������";
	mes "���Ԃ�͗p�ӂ��܂��B";
	next;
	mes "[�P���`�F��]";
	mes "���H�@�������ł����H";
	mes "�������́u�����u���K���v��";
	mes "�`����2�`�[�c�c";
	next;
	mes "[�P���`�F��]";
	mes "�c�c�H";
	next;
	mes "[�P���`�F��]";
	mes "����H�@�݂�Ȃǂ��H";
	mes "�c�c���̊Ԃɏ����Ă�c�c";
	mes "�͂��A�܂��ł����B";
	mes "�����ƁA�`����2�`�[���͋L��2���A";
	mes "�J�����}��1���A������";
	mes "�x�e�����Ȑ�y��1���ł��B";
	next;
	mes "[�P���`�F��]";
	mes "���̓C���^�r���[�ƋL���̐���";
	mes "�J�����}���̓����͎ʐ^";
	mes "�x�e������y�͎��O���������Ă��܂��B";
	mes "��͂�댯�n��ɍs�����Ƃ������̂�";
	mes "�Œ�ł����̍\���ł��ˁB";
	next;
	mes "[�P���`�F��]";
	mes "�����̐퓬�o���͂���܂���";
	mes "�݂�Ȗ{�Ƃ͋L�҂ł�����ˁI";
	mes "�������c�c�V����̎q�܂Ŋ܂߂�";
	mes "�݂�Ȃǂ��ɂ������̂��B";
	next;
	mes "[�P���`�F��]";
	mes "�`���҂���I";
	mes "������ƊF���񂪂ǂ��ɂ�������";
	mes "�T���Ă��Ă���܂��񂩁H";
	mes "�������̏�𗣂���";
	mes "�������߂��Ă����Ƃ���";
	mes "�����ł��Ȃ��̂Łc�c���肢���܂��I";
	next;
	if(select("��`��","��`��Ȃ�") == 2) {
		mes "[�P���`�F��]";
		mes "�����ł����c�c�B";
		mes "�C���ς������";
		mes "�܂����Ă��������B";
		close;
	}
	// ������

OnInit:
	waitingroom "�����u���K��",0; //59522
	end;
}
verus03.gat,159,207,4	script	�V�ċL��#1	896,{/* 59523 */
	mes "[�g���t]";
	mes "����ɂ��́I";
	mes "�g���t�ł��I";
	mes "�댯�ȏꏊ�ł�";
	mes "����΂��Ď�ނ��܂��I";
	close;
OnInit:
	waitingroom "�����I�X���b�O��|������I",0; //59523
	end;
}
verus02.gat,134,169,4	script	�J�����}��#1	702,{/* 59524 */
	// ������
OnInit:
	waitingroom "�����I�C���E�F���X�M�A�U�Ɛ퓬����I",0; //59524
	end;
}
verus01.gat,41,103,4	script	���������ȋL��#1	52,{/* 59525 */
	mes "[�O�����X]";
	mes "���̓O���Y���[�E�O�����X�I";
	mes "�`������D���ȋL�҂��I";
	close;
OnInit:
	waitingroom "�����I�S�������W����I",0; //59525
	end;
}

verus01.gat,231,66,5	script	�e���[���A��#�x���X	628,{/* 59697 */
	if(VER2_QUE == 15) {
		mes "[�e���[���A��]";
		mes "�܂������A����Ɠ��ꂽ���I";
		mes "����v���Z�X�Ȃ��";
		mes "�����Ă������̂ɂȁI";
		cutin "bu_du3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c���O�݂����ȓz�̂��߂�";
		mes "����񂾂Ǝv�����B";
		mes "���A" +strcharinfo(0)+ "�l��";
		mes "�����ɗ��ꂽ�悤�ł��ˁB";
		cutin "bu_mark1",0;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�����ɍ����ł����̂�";
		mes "�ǂ������̂ł����c�c";
		mes "���܂ł̏ꏊ�ƕ��͋C��";
		mes "���Ȃ����Ă��āA";
		mes "�Ȃ񂾂������|���ł��c�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�e���[���A��]";
		mes "�m���ɁA�����Ђǂ��B";
		mes "���S�Ƀ{���{������Ȃ����I";
		mes "����ς肱���ɂ͋�����";
		mes "�����X�^�[�����󂳂�Ă�񂶂�";
		mes "�Ȃ���!?";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c�l�̘b�𕷂���I";
		cutin "bu_mark3",0;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�B";
		mes "���ʂȎ��ő̗͂��g��Ȃ������ǂ��B";
		mes "�����������n�߂悤�B";
		cutin "bu_alp1",2;
		next;
		mes "[�^�}����]";
		mes "����͂����Ɓc�c";
		mes "���̂�����������Ă����̂�";
		mes "����Ɖ������C�����܂��B";
		cutin "ep143_tasta",2;
		next;
		mes "[�^�}����]";
		mes "�܂Ƃ��Ȍ����͂Ȃ����A";
		mes "�n�Ղ̋T������̒n��ɔ�ׂ�";
		mes "���ɍ����������c�c�B";
		next;
		mes "[�^�}����]";
		mes "����ɁA�����̃����X�^�[�c�c�B";
		cutin "ep143_tahuk",2;
		next;
		mes "[�^�}����]";
		mes "�����ł͌��Ȃ������X�^�[�ł���";
		mes "�����ň�̉����c�c�B";
		next;
		mes "[�e���[���A��]";
		mes "���`��c�c�H";
		mes "������͂킩��Ȃ�����";
		mes "�����𒲍�����̂����B�̎d������I";
		cutin "bu_du2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���������΁c�c";
		mes "�������������b�ł́A";
		mes "�����ɓ�̎{�݂������";
		mes "�����Ă����ȁc�c�B";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�m�����̕ӂ肾�����B";
		mes "�@";
		mes "^0000FF�]�A���v�I�J�[�g��";
		mes "�@�Y������ꏊ�Ɉ��";
		mes "�@���Ă��ꂽ�]^000000";
		cutin "bu_alp1",2;
		viewpoint 1,151,173,1,0xFF8000;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�ł́A�������璲�����n�߂悤�B";
		cutin "bu_mark1",0;
		setquest 11375;
		delquest 11375;
		delquest 11376;
		setquest 11381;
		set VER2_QUE,16;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 16) {
		mes "[�e���[���A��]";
		mes "���`��c�c�H";
		mes "������͂킩��Ȃ�����";
		mes "�����𒲍�����̂����B�̎d������I";
		cutin "bu_du2",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���������΁c�c";
		mes "���������������l���A";
		mes "�����ɂ͐������u�������";
		mes "�����Ă����ȁc�c�B";
		cutin "bu_alp3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�m�����̕ӂ肾�����B";
		mes "�@";
		mes "^0000FF�]�A���v�I�J�[�g��";
		mes "�@�Y������ꏊ�Ɉ��";
		mes "�@���Ă��ꂽ�]^000000";
		cutin "bu_alp1",2;
		viewpoint 1,151,173,1,0xFF8000;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�ł́A�������璲�����n�߂悤�B";
		cutin "bu_mark1",0;
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE >= 17) {
		mes "[�e���[���A��]";
		mes "�����A�݂�ȁI";
		mes "�������͂��߂悤���I";
		cutin "bu_du3",2;
		close2;
		cutin "bu_du3",255;
		end;
	}
	mes "[�e���[���A��]";
	mes "�������B";
	mes "�݂�ȂƂ͂���Ė����Ă���";
	mes "�ςȏꏊ�ɏo���ȁc�c�B";
	mes "��U�A��������߂邩�B";
	cutin "bu_du5",2;
	close2;
	cutin "bu_du5",255;
	end;
}
verus01.gat,151,173,3	script	�v���b�g#�x���X	10079,{/* 59698 */
	if(VER2_QUE == 16) {
		mes "[�v���b�g]";
		mes "�����������[�[��!!";
		mes "���ꂪ������H";
		mes "�����Ȃ̂�I�@����!!";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[�v���b�g]";
		mes "�Ȃ񂩂���";
		mes "�O���O�����ĂȂ肻������Ȃ��H";
		mes "�O���O���`�`����!!";
		mes "�͂��A�����Ƃ�c�c�B";
		next;
		mes "[�v���b�g]";
		mes "�ۂ��Ǝ��̎�������";
		mes "�����A�肽���̂Ɂc�c�B";
		mes "�����Ō���邱�Ƃ���";
		mes "�ł��Ȃ��Ȃ�āc�c�B";
		cutin "EP15_2_fru_3",2;
		next;
		mes "[�v���b�g]";
		mes "�����ł��Ȃ��ɑ��k�I";
		mes "���͂����𗣂���Ȃ���";
		mes "�܂��A�����̉��ɂ�����Č���";
		mes "�n���V�F���^�[�ɂ͍s���ĂȂ��́B";
		cutin "EP15_2_fru_1",2;
		next;
		mes "[�v���b�g]";
		mes "����������Ȃ玄�̑����";
		mes "�������Ă݂Ȃ��H";
		mes "�������A���������ˁH";
		mes "����ł���I";
		mes "����Ɍ��܂��Ă��ˁI";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[�v���b�g]";
		mes "����Ȑe�؂ɒ����|�C���g�܂�";
		mes "�w�肷��Ȃ�āA";
		mes "�ő��ɖ����񂾂���ˁI";
		next;
		mes "[�v���b�g]";
		mes "���ƁA���̓��b�P���x��������";
		mes "�w�҂�����A�����ŉ��𔄂��Ă�����";
		mes "���Ȃ��ɂƂ��Ă����Șb����";
		mes "�Ȃ��Ǝv���́B";
		mes "�Ƃ����킯�ŁI";
		cutin "EP15_2_fru_1",2;
		next;
		mes "[�v���b�g]";
		mes "����������ˁH";
		mes "���͂��Ă���Ă��肪�Ƃ��I";
		cutin "EP15_2_fru_2",2;
		next;
		if(select("���͂���","���͂��Ȃ�") == 2) {
			mes "[�v���b�g]";
			mes "���c�c����H";
			mes "�R�A���Ȃ��́H";
			mes "�c�c����ˁ[��B";
			cutin "EP15_2_fru_1",2;
			close2;
			cutin "EP15_2_fru_1",255;
			end;
		}
		mes "[�v���b�g]";
		mes "�₽��@���肪�ƁI";
		mes "��������^0000FF����т��ƍ��ɍs������^000000";
		mes "�����ē����Ă����l�������I";
		mes "�ł����̐l�A�����炠������";
		mes "����񂾂�[�[�H";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[�v���b�g]";
		mes "����ɂ��[�[���Ƃ��[�[�[����";
		mes "�������ɋ��邫������c�c�B";
		mes "���Ȃ������݂����Ƃ��Ȃ�";
		mes "�C������񂾂��ǁc�c�B";
		mes "�C�̂����Ȃ̂��ȁH";
		mes "�܂��A�������B";
		cutin "EP15_2_fru_1",2;
		next;
		cutin "EP15_2_fru_2",2;
		mes "[�v���b�g]";
		mes "���ꂶ��A�������낢�b";
		mes "�����ς������Ă��Ăˁ`�I";
		viewpoint 2,151,173,1,0xFF8000;
		delquest 11381;
		setquest 11382;
		set VER2_QUE,17;
		close2;
		cutin "EP15_2_fru_2",255;
		end;
	}
	else if(VER2_QUE == 17) {
		mes "[�v���b�g]";
		mes "�₽��@���肪�ƁI";
		mes "��������^0000FF����т��ƍ��ɍs������^000000";
		mes "�����ē����Ă����l�������I";
		mes "�ł����̐l�A�����炠������";
		mes "����񂾂�[�[�H";
		cutin "EP15_2_fru_2",2;
		next;
		mes "[�v���b�g]";
		mes "����ɂ��[�[���Ƃ��[�[�[����";
		mes "�������ɋ��邫������c�c�B";
		mes "���Ȃ������݂����Ƃ��Ȃ�";
		mes "�C������񂾂��ǁc�c�B";
		mes "�C�̂����Ȃ̂��ȁH";
		mes "�܂��A�������B";
		cutin "EP15_2_fru_1",2;
		next;
		cutin "EP15_2_fru_2",2;
		mes "[�v���b�g]";
		mes "���ꂶ��A�������낢�b";
		mes "�����ς������Ă��Ăˁ`�I";
		close2;
		cutin "EP15_2_fru_2",255;
		end;
	}
	else if(VER2_QUE >= 18 || VER2_QUE <= 38) {
		mes "[�v���b�g]";
		mes "�ǂ��H�@�����i���͂������H";
		mes "�n���V�F���^�[�ƈꌾ�Ō�������";
		mes "���\�傫���炵������ˁB";
		cutin "EP15_2_fru_3",2;
		next;
		mes "[�v���b�g]";
		mes "�K���Ɍ��Ă��猩�������Ⴄ������";
		close2;
		cutin "EP15_2_fru_3",255;
		end;
	}
	else if(VER2_QUE >= 39) {
		mes "[�v���b�g]";
		mes "�n���͂ǂ��������`�H";
		mes "�ւ��`!!�@�{����!?";
		mes "���킟�A���������ˁI";
		mes "�ŁH�@�ŁH�@���̎��́H";
		mes "�ǂ��Ȃ́H�@�˂����Ă΁`�I";
		cutin "EP15_2_fru_2",2;
		close2;
		cutin "EP15_2_fru_2",255;
		end;
	}
	mes "[�v���b�g]";
	mes "�����������[�[��!!";
	mes "���ꂪ������H";
	mes "����Ȃ񂾂�I�@����!!";
	cutin "EP15_2_fru_2",2;
	next;
	menu "�������̒n���{�݂ɂ��ĕ���",-;
	cutin "EP15_2_fru_1",2;
	mes "[�v���b�g]";
	mes "����A�������̒n���{�݁H";
	mes "�V�F���^�[�̂��ƁH";
	mes "����Ȃ炱������";
	mes "^0000FF����т��ƍ��ɍs������^000000";
	mes "������������B";
	next;
	cutin "EP15_2_fru_2",2;
	mes "[�v���b�g]";
	mes "���̓V�F���^�[��荡��";
	mes "�������厖������c�c";
	mes "�͂��A�����Ƃ�c�c�B";
	mes "������������";
	mes "�����A�肽���Ȃ��c�c�B";
	close2;
	cutin "EP15_2_fru_2",255;
	end;
}
verus01.gat,123,181,3	script	�x���e�B#Warper	10078,{/* 59699 */
	mes "[�x���e�B]";
	mes "����A��������Ⴂ�B";
	mes "�n���V�F���^�[�̒����ɗ����́H";
	cutin "EP15_2_brt_2",2;
	next;
	if(VER2_QUE >= 39 && countitem(6828))
		set '@str$,"�d�͈��S���u���g������";
	switch(select("�͂�","������",'@str$)) {
	case 1:
		if(VER2_QUE < 39) {
			mes "[�x���e�B]";
			mes "�n���͂��Ȃ�댯�炵����B";
			mes "�C�����čs���Ȃ����B";
			cutin "EP15_2_brt_1",2;
			next;
			mes "[�x���e�B]";
			mes "���̒n��ɂ͐������Ă��Ȃ�";
			mes "�����X�^�[���o���c�c�ˁB";
			mes "�@";
			mes "�c�c�����X�^�[�̂ق���";
			mes "�܂��A�}�V�����ˁc�c�B";
			cutin "EP15_2_brt_3",2;
			close2;
			cutin "EP15_2_brt_3",255;
			warp "un_bunker.gat",98,91;
			end;
		}
		else {
			mes "[�x���e�B]";
			mes "�����c�c�B";
			mes "�܂����ׂ�̂ˁB";
			cutin "EP15_2_brt_3",2;
			next;
			mes "[�x���e�B]";
			mes "�Ƃ肠�������������������Ă�";
			mes "���ɂ͌���Ȃ��Œ��ՁB";
			mes "���肢��c�c�B";
			cutin "EP15_2_brt_4",2;
			close2;
			cutin "EP15_2_brt_4",255;
			warp "un_bunker.gat",98,91;
			end;
		}
	case 2:
		mes "[�x���e�B]";
		mes "����A�����B";
		cutin "EP15_2_brt_1",2;
		close2;
		cutin "EP15_2_brt_1",255;
		end;
	case 3:
		mes "[�x���e�B]";
		mes "^0000FF�d�͈��S���u^000000���g����";
		mes "�Ő[���̕��������܂�";
		mes "�ȒP�ɍs���邯��";
		mes "�ǂ�����́H";
		cutin "EP15_2_brt_1",2;
		next;
		switch(select("�g�p����","��߂�","�d�͈��S���u�Ƃ́H")) {
		case 1:
			mes "[�x���e�B]";
			mes "�����B";
			mes "���Ⴀ�A�݂��Ē��ՁB";
			mes "�������삷�邩��B";
			close2;
			cutin "EP15_2_brt_1",255;
			warp "un_myst.gat",158,38;
			end;
		case 2:
			mes "[�x���e�B]";
			mes "����A�����B";
			close2;
			cutin "EP15_2_brt_1",255;
			end;
		case 3:
			mes "[�x���e�B]";
			mes "^0000FF�d�͈��S���u^000000��";
			mes "�n���V�F���^�[�̏d�͂����肳����";
			mes "�������o������Ȃ��悤��";
			mes "���Ă���鑕�u��B";
			next;
			mes "[�x���e�B]";
			mes "�d�͈��S���u�͉�ꂽ�肵�Ȃ����A";
			mes "�������Ԃ̒Z�k�ɂ��Ȃ邩��";
			mes "�֗��Ȃ̂�ˁc�c�B";
			mes "�����Ă�Ȃ玄�����삷�邩��";
			mes "������@��������Ȃ��Ă�";
			mes "���Ȃ����B";
			close2;
			cutin "EP15_2_brt_1",255;
			end;
		}
	}
}
un_bunker.gat,100,96,3	script	�}�[�N�C�V��#�V�F���^�[	616,{/* 59700 */
	if(VER_1QUE == 29) {
		cutin "bu_mark1",0;
		mes "[�}�[�N�C�V��]";
		mes "����A�������ȊO�ɂ�";
		mes "����ȂƂ���ɐl���c�c�B";
		mes "�悭������";
		mes strcharinfo(0)+ "�l�ł͂Ȃ��ł����B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�������A" +strcharinfo(0)+ "�l�B";
		mes "�����ł���Ȃ��̂�";
		mes "�������̂ł����c�c�B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "���ɂ͂��ꂪ�����킩��܂��񂪁A";
		mes strcharinfo(0)+ "�l�Ȃ�";
		mes "�����̖��ɗ���������܂���B";
		mes "���n�����Ă����܂��ˁB";
		next;
		if(checkitemblank() == 0) {
			mes "[�}�[�N�C�V��]";
			mes "����c�c�B";
			mes "�n�����Ƃ��܂������A";
			mes "�ו��������݂����ł��ˁB";
			mes "��ސ������炵�Ă���";
			mes "���������Ă��������B";
			close2;
			cutin "bu_mark1.bmp", 255;
			end;
		}
		getitem 6824,2;
		mes "�]�������̃������[���R�[�h��";
		mes "�@��ɓ��ꂽ�B";
		mes "�@�c���A���N�C�G���̌��֖߂낤�]";
		set VER_1QUE,30;
		delquest 118208;
		setquest 118209;
		close2;
		cutin "bu_mark1",255;
		end;
		
		cutin "bu_mark1.bmp", 0;
		mes "[�}�[�N�C�V��]";
		mes "����A�������ȊO�ɂ�";
		mes "����ȂƂ���ɐl���c�c�B";
		mes "���Ȃ��������̒����ɗ���";
		mes "�`���҂ł����H";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�������A������";
		mes "����Ȃ��̂��������̂ł����c�c�B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "���ɂ͂��ꂪ�����킩��܂��񂪁A";
		mes "���Ȃ��Ȃ�";
		mes "�����̖��ɗ���������܂���B";
		mes "���n�����Ă����܂��ˁB";
		next;
		if(checkitemblank() == 0) {
			mes "[�}�[�N�C�V��]";
			mes "����c�c�B";
			mes "�n�����Ƃ��܂������A";
			mes "�ו��������݂����ł��ˁB";
			mes "��ސ������炵�Ă���";
			mes "���������Ă��������B";
			close2;
			cutin "bu_mark1.bmp", 255;
			end;
		}
		getitem 6824, 2;
		mes "�]�������̃������[���R�[�h��";
		mes "�@��ɓ��ꂽ�B";
		mes "�@�c���A���N�C�G���̌��֖߂낤�]";
		set VER_1QUE,30;
		delquest 118208;
		setquest 118209;
		close2;
		cutin "bu_mark1.bmp", 255;
		end;
	}
	if(VER2_QUE == 17) {
		mes "[�}�[�N�C�V��]";
		mes "���A" +strcharinfo(0)+ "�l�B";
		mes "�����܂���B";
		mes "�����������̂悤��";
		mes "�\�������̂Ő�ɒ���";
		mes "�����Ă��܂����c�c�B";
		cutin "bu_mark3",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����ɂ��Ă��c�c";
		mes "��ɔ�ׂ�ƁA���Ȃ��Y�킾����";
		mes "�����낤�c�c";
		mes "���̓f���C������L���́c�c�B";
		cutin "bu_mark4",0;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "������̓������Ă������A";
		mes "���̒n��ɂ͋��Ȃ�����";
		mes "�A���f�b�h������݂������B";
		mes "�L���͂��̂�����������Ȃ��B";
		cutin "bu_alp1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������΂����ɗ���O��";
		mes "�������񂾂��ǁc�c";
		mes "�����͍\����A�l������ׂ�";
		mes "�V�F���^�[�Ƃ��Č������ꂽ�炵���B";
		cutin "bu_mark1",0;
		next;
		mes "[�^�}����]";
		mes "�Ƃ������Ƃ́c�c";
		mes "�����ɂ���A���f�b�h�́c�c�B";
		cutin "ep143_tahuk",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�}�[�N����B";
		mes "�c�c���A�|���ł��c�c�B";
		mes "�{���ɂ������A";
		mes "���ׂ�̂ł����c�c�H";
		cutin "bu_maggi4",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���߂񂲂߂�A���������āB";
		mes "���ɋC�ɂȂ�ꏊ��";
		mes "�m���Ɋ�����邯�ǁc�c";
		mes "�܂��͂��������܂Ȃ����ׂ悤�B";
		cutin "bu_mark1",0;
		next;
		mes "[�e���[���A��]";
		mes "���c�c���A�������ȁI";
		mes "�������A����Ȃ͉̂��Ƃ�������!!";
		mes "�n�n�n�I";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ł͊e���Œ������s��";
		mes "�����������獇�}�����悤�B";
		cutin "bu_alp1",2;
		next;
		mes "[�e���[���A��]";
		mes "����c�c������Ƒ҂Ă�!!";
		mes "�댯������ꏏ�ɓ���������";
		mes "�����񂶂�Ȃ����c�c�H";
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "�c�c�����[��!!";
		mes "������ꏏ�Ɂc�c";
		mes "�c�c���Ă��O��[!!";
		mes "�����̑���������!?";
		delquest 11382;
		setquest 11383;
		set VER2_QUE,18;
		close2;
		cutin "bu_du5",255;
		end;
	}
	else if(VER2_QUE == 18) {
		mes "[�}�[�N�C�V��]";
		mes "�܂��͂��������܂Ȃ����ׂ܂��傤�B";
		cutin "bu_mark1",0;
		next;
		mes "[�e���[���A��]";
		mes "���c�c���A�������ȁI";
		mes "�������A����Ȃ͉̂��Ƃ�������!!";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ł͊e���Œ������s��";
		mes "�����������獇�}�����悤�B";
		cutin "bu_alp1",2;
		next;
		mes "[�e���[���A��]";
		mes "����c�c������Ƒ҂Ă�!!";
		mes "�댯������ꏏ�ɓ���������";
		mes "�����񂶂�Ȃ����c�c�H";
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "�c�c�����[��!!";
		mes "������ꏏ�Ɂc�c";
		mes "�c�c���Ă��O��[!!";
		mes "�����̑���������!?";
		close2;
		cutin "bu_du5",255;
		end;
	}
	mes "[�}�[�N�C�V��]";
	mes "���̏ꏊ���������܂ł�";
	mes "�ǂ������̂ł����c�c";
	mes "�����낤�c�c";
	mes "���̓f���C������L���́c�c�B";
	cutin "bu_mark4",0;
	next;
	mes "[�}�[�N�C�V��]";
	mes "����ς肱�̏ꏊ�̒����ɂ�";
	mes "���������l�肪�����ق���";
	mes "�ǂ��������c�c�B";
	close2;
	cutin "bu_mark4",255;
	end;
}
un_bunker.gat,363,171,3	script	�A���v�I�J�[�g#����	615,{/* 59701 */
	if(VER2_QUE == 18) {
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�B";
		mes "�@";
		mes "^0000FF�]�A���v�I�J�[�g���M�S��";
		mes "�@�߂��̕ǂ𒲂ׂĂ���]^000000";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�������c�c�B";
		mes "�e���[���A�����ӊO�ɂ�";
		mes "�����Ǝv������c�c";
		mes "�����������Ƃ��B";
		cutin "bu_alp3",2;
		next;
		mes "[�e���[���A��]";
		mes "�ӊO�ɂ����ĂȂ�!?";
		mes "�Ƃ���ł����́A���̕ϓN���Ȃ�";
		mes "�ǂ��ǂ��������̂��H";
		cutin "bu_du5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���̕ǂ̌������ɂǂ���";
		mes "��Ԃ�����悤���B";
		mes "���������ΈȑO�c�c";
		cutin "bu_alp1",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����A�Ȃ�ł��Ȃ��B";
		mes "���̓z����Ă�Œ������n�߂悤�B";
		cutin "bu_alp3",2;
		next;
		if(select("��������","��߂Ă���") == 2) {
			mes "[�A���v�I�J�[�g]";
			mes "�������ړI���Ƃ�������";
			mes "�Y���ȁc�c�B";
			cutin "bu_alp1",2;
			close2;
			cutin "bu_alp1",255;
			end;
		}
		mes "[�A���v�I�J�[�g]";
		mes "���}�͂����o��������A";
		mes "�����ɑ��̓z������邾�낤�B";
		next;
		mes "[�}�M�X�e�B��]";
		mes "�e���[�͂܂������Ă邩����";
		mes "�S�z���Ă����̂ł����A";
		mes "������ɒ����Ă�����ł��ˁB";
		mes "�ǂ������c�c�B";
		cutin "bu_maggi2",2;
		next;
		mes "[�e���[���A��]";
		mes "�������}�M�I";
		mes "���̎��ɑ��������񂾂���B";
		mes "����Ȃ̂Ƀ}�h���h�́c�c";
		mes "�����x���Ƃ́B";
		mes "���O���܂��܂����ȁI";
		mes "���̏����A���̏�����!!";
		cutin "bu_du2",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�c�c�B";
		cutin "bu_mark3",0;
		next;
		mes "[�^�}����]";
		mes "�x���Ȃ�܂����B";
		mes "����c�c�B";
		mes "�����F����A�������ł������B";
		mes "�e���[���A���������";
		mes "�Ԃɍ������悤�ł��ˁB";
		cutin "ep143_tasta",2;
		next;
		mes "[�x���e�B]";
		mes "�Ӂ`��c�c�B";
		mes "�����ɉ�������́H";
		cutin "EP15_2_brt_3",2;
		next;
		mes "[�e���[���A��]";
		mes "�������I";
		mes "�����ɂ������o���񂶂�Ȃ����B";
		mes "���ŗ��Ă񂾂�I";
		mes "�����͊댯�����I";
		cutin "bu_du4",2;
		next;
		mes "[�x���e�B]";
		mes "���͂��Ȃ��̂��o�����";
		mes "�Ȃ��������͂Ȃ���B";
		mes "�c�c^0000FF�x���e�B^000000��B";
		mes "�Ƃ���ŁA�����ĂȂ��́H";
		mes "���́c�c�B";
		cutin "EP15_2_brt_5",2;
		next;
		mes "[�^�}����]";
		mes "���A����������";
		mes "�������̏��̎q�������Ă܂����ˁB";
		mes "�ē����Ă����l��������āB";
		cutin "ep143_tasmi",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�����c�c�B";
		cutin "bu_alp1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�ł́A�x���e�B����B";
		mes "���߂ċX�������肢���܂��B";
		mes "�Ƃ肠�����S���������񂾁B";
		mes "���ɓ����Ă݂悤�B";
		cutin "bu_mark1",0;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���ȗ\��������B";
		mes "�C��t���悤�B";
		cutin "bu_alp1",2;
		delquest 11383;
		setquest 11384;
		set VER2_QUE,19;
		close2;
		cutin "bu_alp1",255;
		warp "un_bunker.gat",385,83;
		end;
	}
	else if(VER2_QUE >= 19) {
		mes "[�A���v�I�J�[�g]";
		mes "�������𒲍����邼�B";
		cutin "bu_alp1",2;
		next;
		if(select("�͂�","������") == 2) {
			mes "[�A���v�I�J�[�g]";
			mes "�������ړI���Ƃ�������";
			mes "�Y���ȁc�c�B";
			close2;
			cutin "bu_alp1",255;
			end;
		}
		mes "[�A���v�I�J�[�g]";
		mes "���ȗ\��������B";
		mes "�C��t���悤�B";
		close2;
		cutin "bu_alp1",255;
		warp "un_bunker.gat",385,83;
		end;
	}
	mes "[�A���v�I�J�[�g]";
	mes "�c�c�B";
	mes "�����ɋ��Ă����Ԃ̖��ʂ���";
	mes "�v�����c�c�B";
	cutin "bu_alp3",2;
	close2;
	cutin "bu_alp3",255;
	end;
}
un_bunker.gat,387,79,0	warp	#room_out	1,1,un_bunker.gat,362,167	//59702
un_bunker.gat,388,84,3	script	�A���v�I�J�[�g#����2	615,{/* 59703 */
	if(VER2_QUE == 19) {
		mes "[�A���v�I�J�[�g]";
		mes "��͂�c�c";
		mes "�B����Ă�������������";
		mes "���̕����������̕����Ƃ�";
		mes "�\�����Ⴄ�ȁB";
		cutin "bu_alp3",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�m���Ɂc�c�B";
		mes "���Ȃ�s���R�Ȉʒu��";
		mes "�����t���Ă���B";
		cutin "bu_mark1",0;
		next;
		mes "[�^�}����]";
		mes "��͂蒼�ړ�����";
		mes "�������邵���Ȃ������ł��ˁB";
		cutin "ep143_taang",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�������ׂāA";
		mes "��������o�����ł��c�c�B";
		mes "�Ȃ񂾂������͋�C��";
		mes "����ł���C�����܂��c�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�e���[���A��]";
		mes "��`���I�@�ˌ���!!";
		mes "�}�M�A�݂�Ȃ����邩��";
		mes "���v��!!";
		mes "�|���Ȃ���!!";
		mes "�ӂ͂͂͂͂͂͂͂�!!";
		cutin "bu_du5",2;
		delquest 11384;
		setquest 11385;
		set VER2_QUE,20;
		close2;
		cutin "bu_du5",255;
		warp "un_bunker.gat",11,206;
		end;
	}
	else if(VER2_QUE >= 20) {
		mes "[�A���v�I�J�[�g]";
		mes "�s���R�ȕ����A";
		mes "�s���R�Ȕ��c�c";
		mes "�C�ɂȂ�ȁc�c�B";
		cutin "bu_alp1",2;
		next;
		if(select("����","���܂�") == 2) {
			mes "[�A���v�I�J�[�g]";
			mes "�c�c�B";
			mes "���܂ł���������肾�H";
			close2;
			cutin "bu_alp1",255;
			end;
		}
		mes "[�A���v�I�J�[�g]";
		mes "�s�����c�c�B";
		close2;
		cutin "bu_alp1",255;
		warp "un_bunker.gat",11,206;
		end;
	}
}
un_bunker.gat,12,207,5	script	�x���e�B#�~�X�g	10078,{/* 59704 */
	if(VER2_QUE == 20) {
		mes "[�x���e�B]";
		mes "�܂������c�c";
		mes "�����͑����l�܂��ˁc�c�B";
		mes "������A���ɂ��Ȃ肻���B";
		cutin "EP15_2_brt_3",2;
		next;
		mes "[�^�}����]";
		mes "���̋�Ԃ͂��������c�c�B";
		mes "�V�F���^�[�ɂ��Ă�";
		mes "�\�����G�Ȃ悤�ł����c�c�B";
		cutin "ep143_tasta",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���ȏL�����Z���Ȃ��Ă����ȁB";
		cutin "bu_alp5",2;
		next;
		mes "[�^�}����]";
		mes "�������ɂ���������݂����ł��ˁA";
		mes "�s���Č��܂��傤�I";
		cutin "ep143_tasta",2;
		delquest 11385;
		setquest 11386;
		set VER2_QUE,21;
		close2;
		cutin "ep143_tasta",255;
		end;
	}
	else if(VER2_QUE == 21) {
		mes "[�x���e�B]";
		mes "�܂������c�c";
		mes "�����͑����l�܂��ˁc�c�B";
		mes "������A���ɂ��Ȃ肻���B";
		cutin "EP15_2_brt_3",2;
		next;
		mes "[�^�}����]";
		mes "���̋�Ԃ͂��������c�c�B";
		mes "�V�F���^�[�ɂ��Ă�";
		mes "�\�����G�Ȃ悤�ł����c�c�B";
		cutin "ep143_tasta",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���ȏL�����Z���Ȃ��Ă����ȁB";
		cutin "bu_alp5",2;
		next;
		mes "[�^�}����]";
		mes "�I���ɉB����Ă��܂���";
		mes "�����̔��͐�قǂ̕����ɖ߂�";
		mes "���̂悤�ł��ˁc�c�B";
		mes "�������ɂ���������݂����ł����A";
		mes "��ɐi�݂܂����H";
		mes "����Ƃ���x�߂�܂����H";
		cutin "ep143_tasta",2;
		next;
		if(select("�����","�����J���čŏ��̕����ɖ߂�") == 1) {
			mes "�]���Ȃ��͔����痣�ꂽ�]";
			close2;
			cutin "ep143_tasta",255;
			end;
		}
		mes "[�^�}����]";
		mes "�����ł��ˁB";
		mes "�����N���邩������܂���";
		mes "�������[�̏�Ԃ�";
		mes "��������̂��������ł��傤�ˁB";
		mes "�ł͈�x�A�ŏ��̕�����";
		mes "�߂�܂��傤�B";
		cutin "ep143_tasta",2;
		close2;
		cutin "ep143_tasta",255;
		warp "un_bunker.gat",385,83;
		end;
	}
	else if(VER2_QUE >= 22) {
		mes "[�x���e�B]";
		mes "������A���ɂ��Ȃ肻���B";
		mes "���������΂��̔��͍ŏ���";
		mes "�����Ă��������ɖ߂邽�߂�";
		mes "���݂����ˁB";
		mes "�ǂ�����H�@�߂�́H";
		cutin "EP15_2_brt_3",2;
		next;
		if(select("�����","�����J���ĕ����ɖ߂�") == 1) {
			mes "[�x���e�B]";
			mes "���炻���B";
			mes "�Ȃ�A�����ɂƂǂ܂�";
			mes "���R�͂Ȃ���ˁB";
			mes "�����܂��傤�B";
			cutin "EP15_2_brt_4",2;
			close2;
			cutin "EP15_2_brt_4",255;
			end;
		}
		mes "[�x���e�B]";
		mes "�ق�A�����߂���B";
		mes "����ȂƂ����";
		mes "�����Ƃ��ĂĂ�����";
		mes "�ς��Ȃ��ł���B";
		cutin "EP15_2_brt_4",2;
		close2;
		cutin "EP15_2_brt_4",255;
		warp "un_bunker.gat",385,83;
		end;
	}
}
un_bunker.gat,56,206,0	script	#myst_1	45,1,1,{/* 59705 */
	if(VER2_QUE == 20) {
		mes "�]���͊J���Ă���悤����";
		mes "�@���̑O�ɑ�ʂ̑傫��";
		mes "�@�K���N�^���u���Ă���";
		mes "�@�ȒP�ɂ͒ʂꂻ���ɂȂ��]";
		next;
		cutin "bu_mark1",0;
		mes "[�}�[�N�C�V��]";
		mes "����́c�c";
		mes "�Ƃ肠�����܂��x���e�B����";
		mes "�ŏ��̔��t�߂ɋ��܂��ˁB";
		mes "�x���e�B����ɐ��������Ă���";
		mes "����܂��񂩁H";
		close2;
		cutin "bu_mark1",255;
		end;
	}
	else if(VER2_QUE == 21) {
		mes "�]���͊J���Ă���悤����";
		mes "�@���̑O�ɑ�ʂ̑傫��";
		mes "�@�K���N�^���u���Ă���";
		mes "�@�ȒP�ɂ͒ʂꂻ���ɂȂ��]";
		next;
		if(select("�K���N�^��P������","��������") == 2) {
			mes "[�e���[���A��]";
			mes "������A�������Ȃ��ŋA��̂��H";
			mes "�����܂ŗ�����A";
			mes "�`�������������";
			mes "���ׂ邼!!";
			mes "�c�c�}�h���h���B";
			cutin "bu_du1",2;
			close2;
			cutin "bu_du1",255;
			end;
		}
		mes "[�e���[���A��]";
		mes "�ӂ͂͂͂͂͂͂͂�!!";
		mes "�����͉��ɔC���āA";
		mes "�݂�ȉ�����񂾂�!!";
		mes "�C�O�j�b�V�����u���C�N�b!!";
		cutin "bu_du1",2;
		next;
		misceffect 722,"";
		cutin "bu_du1",255;
		mes "^0000FF�]�e���[���A���̕�����";
		mes "�@�C�O�j�b�V�����u���C�N�̂��A��";
		mes "�@�K���N�^�͐Ռ`���Ȃ�";
		mes "�@������񂾁c�c�]^000000";
		next;
		mes "[�^�}����]";
		mes "��Ȃ�����Ȃ��ł���!!";
		mes "���肵������܂�";
		mes "������ԂƂ���ł���!?";
		mes "����͂��܂�����������";
		mes "�ǂ��������̂́c�c�B";
		cutin "ep143_tahuk",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���ꂪ�e���[���A����";
		mes "�Ō�̊����";
		mes "�Ȃ�Ȃ���΂����ȁc�c�B";
		cutin "bu_alp3",2;
		next;
		mes "[�e���[���A��]";
		mes "�Ȃ񂾂悻���!?";
		mes "���̌���������";
		mes "�ǂ������Ă�����";
		mes "���b�t���O����!?";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�e���[���A���B";
		mes "����������Ȃ�";
		mes "���S�t���O���c�c�B";
		cutin "bu_mark3",0;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�����B";
		mes "�e���[�̂��A�ŁA";
		mes "�ʂ��悤�ɂȂ���";
		mes "�݂����ł��B";
		cutin "bu_maggi1",2;
		delquest 11386;
		setquest 11387;
		set VER2_QUE,22;
		close2;
		cutin "bu_maggi1",255;
		warp "un_myst.gat",81,190;
		end;
	}
	else if(VER2_QUE >= 22) {
		mes "�]��ʂ̃K���N�^��";
		mes "�@���c�ɐ�����΂��ꂽ�܂�";
		mes "�@���u����Ă���̂����ڂ�";
		mes "�@�����J�����]";
		close2;
		warp "un_myst.gat",81,190;
		end;
	}
}
un_myst.gat,100,190,3	script	�e���[���A��#�z�[��	628,{/* 59706 */
	if(VER2_QUE == 22) {
		mes "[�e���[���A��]";
		mes "���킟�I";
		mes "���������L���ȁI";
		cutin "bu_du1",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���Ȃ񂾂����́c�c";
		mes "�V�F���^�[������";
		mes "����ȋ�Ԃ�����Ȃ�āB";
		cutin "bu_mark1",0;
		next;
		mes "[�}�M�X�e�B��]";
		mes "���c�c���c�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�^�}����]";
		mes "����ɂ��Ă͍�肪�G�Ȃ悤�ȁc�c�B";
		cutin "ep143_tasta",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�Ɓc�c�Ɓc�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�m���Ɂc�c����ȁB";
		cutin "bu_alp3",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�Ɓc�c�Ƃсc�c�B";
		cutin "bu_maggi3",2;
		next;
		mes "[�e���[���A��]";
		mes "�}�M�A�ǂ������񂾂�B";
		mes "���������炨���������H";
		mes "�g�r�E�I�ł���������";
		mes "�Ȃ����̂��H";
		cutin "bu_du2",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�e���[�A��������Ȃ��āc�c";
		mes "�Ƃсc�c";
		mes "�����c�c�܂��Ă܂��I";
		cutin "bu_maggi4",2;
		next;
		mes "[�e���[���A��]";
		mes "�́H";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����!?";
		cutin "bu_mark4",0;
		next;
		mes "[�e���[���A��]";
		mes "�������I";
		mes "�ق�Ƃɕ܂��Ă�I";
		cutin "bu_du5",2;
		next;
		mes "[�e���[���A��]";
		mes "���������A������Ƒ҂Ă�I";
		mes "���B�����߂�ꂽ�̂���I";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�݂�ȁA�Q�ĂȂ��ŁI";
		mes "�܂��͗��������񂾁I";
		mes "���A����������������˂Ƃ�";
		mes "�����t�ŊJ���Ƃ��c�c";
		mes "�������ƁA�J���}�S�b�g�I";
		mes "�����c�c�ʖڂ��c�c�B";
		cutin "bu_mark4",0;
		next;
		mes "[�x���e�B]";
		mes "�܂������c�c";
		mes "���Ȃ��̕������������Ȃ����B";
		mes "�c�O�Ȃ�������˂ł��Ȃ����A";
		mes "�����t�ŊJ���悤�Ȕ��ł��Ȃ���B";
		mes "���āA�ǂ����܂��傤�ˁB";
		cutin "EP15_2_brt_5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�I���o�[�q���x���g�̏����ɂ�";
		mes "��l���������߂���";
		mes "�b���������C������c�c�B";
		mes "�������̎��͗F�l���A";
		mes "�����ɗ��Ă��ꂽ���ȁc�c�B";
		cutin "bu_alp2",2;
		next;
		mes "[�x���e�B]";
		mes "�c�O�Ȃ��炻�̏����̂悤��";
		mes "�����ɗ��Ă����l��";
		mes "���Ȃ��ł��傤�ˁB";
		mes "�Ƃ肠�����A�߂����";
		mes "��������Ēʂ�Ȃ����Ƃ�";
		mes "�m����B";
		cutin "EP15_2_brt_4",2;
		next;
		mes "[�e���[���A��]";
		mes "���������΂��o����I";
		mes "���o����͈ē��l�Ȃ񂾂�ȁH";
		mes "�o���Ƃ��m��Ȃ��̂��H";
		cutin "bu_du5",2;
		next;
		mes "[�x���e�B]";
		mes "�c�O�����ǁc�c";
		mes "���������ɗ���̂�";
		mes "���߂ĂȂ̂�B";
		mes "�Ƃɂ������͐�ɐi�ނ����A";
		mes "�Ȃ��ł��傤�ˁB";
		cutin "EP15_2_brt_6",2;
		delquest 11387;
		setquest 11388;
		set VER2_QUE,23;
		close2;
		cutin "EP15_2_brt_6",255;
		end;
	}
	else if(VER2_QUE >= 23) {
		mes "[�e���[���A��]";
		mes "���������A������Ƒ҂Ă�I";
		mes "���B�����߂�ꂽ�̂���I";
		cutin "bu_du5",2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�݂�ȁA�Q�ĂȂ��ŁI";
		mes "�܂��͗��������񂾁I";
		mes "�����������߂ɂ����́A";
		mes "������ǂ����I";
		mes "�����c�c�d�������";
		mes "�u���Ă����񂾁c�c�B";
		cutin "bu_mark4",0;
		next;
		mes "[�x���e�B]";
		mes "�ǂ����܂��傤�ˁB";
		cutin "EP15_2_brt_5",2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "���������ꍇ�c�c";
		mes "�I���o�[�q���x���g��";
		mes "��i�Ȃ�c�c�B";
		cutin "bu_alp2",2;
		next;
		mes "[�x���e�B]";
		mes "�c�O�Ȃ��炱��͌�����B";
		mes "���b�̂悤�Ɋ�Ղ�";
		mes "������Ȃ��ł��傤�ˁc�c�B";
		mes "�Ƃ肠�����A�߂����";
		mes "��������Ēʂ�Ȃ����Ƃ�����";
		mes "�m����B";
		cutin "EP15_2_brt_4",2;
		next;
		mes "[�e���[���A��]";
		mes "���������΂��o����I";
		mes "���o����͈ē��l�Ȃ񂾂�ȁH";
		mes "�o���Ƃ��m��Ȃ��̂��H";
		cutin "bu_du5",2;
		next;
		mes "[�x���e�B]";
		mes "�c�O�����ǁc�c";
		mes "���������ɗ���̂�";
		mes "���߂ĂȂ̂�B";
		mes "�Ƃɂ������͐�ɐi�ނ����A";
		mes "�Ȃ��ł��傤�ˁB";
		cutin "EP15_2_brt_6",2;
		close2;
		cutin "EP15_2_brt_6",255;
		end;
	}
}
un_myst.gat,124,189,0	script	#m101	45,1,1,{/* 59707 */
	if(VER2_QUE == 22) {
		mes "�]�����J���悤��";
		mes "�@���G�ꂽ�������u�ԁc�c�]";
		next;
		mes "[�e���[���A��]";
		mes "�����[���B";
		mes strcharinfo(0)+ "�`�I";
		mes "�悸�݂͂�Ȃł��̕�����";
		mes "���ׂ悤���I";
		cutin "bu_du1",2;
		next;
		cutin "bu_du1",255;
		mes "�]�e���[���A�����Ă�ł���B";
		mes "�@��U�A�������Ă���";
		mes "�@��ɐi�񂾂ق����ǂ����낤�]";
		close;
	}
	else if(VER2_QUE >= 23) {
		mes "�]�����J���悤��";
		mes "�@���G�ꂽ�u�ԁc�c�]";
		next;
		mes "�]���̂�����";
		mes "�@^0000FF�s���ȋC����^000000�ɂȂ����B";
		mes "�@����́c�c";
		mes "�@���̋C�����͈�́c�c�H�]";
		misceffect 334,"";
		next;
		mes "�]����ȋC�����Ɨ�����";
		mes "�@���͐Â��ɊJ�����c�c�]";
		close2;
		warp "un_myst.gat",157,197;
		end;
	}
}
un_myst.gat,171,183,0	script	#m102	45,1,1,{/* 59708 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",329,205;
	else if('@r < 60)
		warp "un_myst.gat",291,203;
	else
		warp "un_myst.gat",259,200;
	end;
}
un_myst.gat,258,208,0	script	#m103	45,1,1,{/* 59709 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",329,205;
	else if('@r < 60)
		warp "un_myst.gat",291,203;
	else
		warp "un_myst.gat",259,200;
	end;
}
un_myst.gat,295,208,0	script	#m104	45,1,1,{/* 59710 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",329,205;
	else if('@r < 60)
		warp "un_myst.gat",291,203;
	else
		warp "un_myst.gat",259,200;
	end;
}

un_myst.gat,333,206,3	script	�s�v�c�Ȍ���01#01	10082,{/* 59711 */
	switch(VER2_QUE) {
	case 23:
		mes "�]���������ڂȂ̂���������Ȃ��]";
		next;
		mes "�]�ʂĂ��Ȃ������ł�";
		mes "�@���Ԋ��o�������Ă����B";
		mes "�@���͂����ɓ��ɐ��サ�Ă���]";
		next;
		mes "�]�{���ɐ��������f�������̂��낤���]";
		next;
		mes "�]�����ǁA���łɖ߂铹�͎���ꂽ�B";
		mes "�@�����c�c����͒E�o�ł͂Ȃ������B";
		mes "�@�����邽�߂̓��S�������񂾁B�]";
		next;
		mes "�]�������͂��܂œ����鎖��";
		mes "�@�ł���񂾂낤�H�]";
		close2;
		delquest 11388;
		setquest 11389;
		set VER2_QUE,24;
		warp "un_myst.gat",260,204;
		end;
	case 24:
		mes "�]�o��͂��Ă�����";
		mes "�@�󋵂͈�������΂��肾�]";
		next;
		mes "�]���̏ꏊ�ɋ�����";
		mes "�@�������т鎖���o���Ȃ�������";
		mes "�@�v�����ގ������ł��Ȃ��]";
		next;
		mes "�]��]�c�c�]";
		next;
		mes "�]���łɑ����̐l������";
		mes "�@��]�����������Ƃ�";
		mes "�@�o���Ȃ��Ȃ��Ă��܂����c�c�]";
		close2;
		set VER2_QUE,25;
		warp "un_myst.gat",260,204;
		end;
	default:
		mes "�]�v�Z�ʂ�Ȃ�A�����O�ɏo��͂����B";
		mes "�@�͂��Ȋ�]�ɂ����鎄��";
		mes "�@���n������̓y���}�΂��Ă���]";
		next;
		mes "�]�v�Z���Ԉ�����̂��낤���c�c�B";
		mes "�@����Ȃ͂��͂Ȃ��B";
		mes "�@���N���������Ȃ���";
		mes "�@�����Ă�����Ԃ��]";
		next;
		mes "�]�����Ԉ�����񂾁B";
		mes "�@���x�����x�������ꏊ��";
		mes "�@��葱���Ă���悤��";
		mes "�@���̋C���́c�c�]";
		next;
		mes "�]�s�����c�c�]";
		next;
		mes "�]�c�c����A���̓��ȗ��A";
		mes "�@�s���łȂ��������Ȃǖ����]";
		close2;
		warp "un_myst.gat",347,138;
		end;
	}
}
un_myst.gat,393,139,0	script	#m201	45,1,1,{/* 59712 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",176,137;
	else if('@r < 60)
		warp "un_myst.gat",86,136;
	else
		warp "un_myst.gat",138,138;
	end;
}
un_myst.gat,104,136,0	script	#m202	45,1,1,{/* 59713 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",176,137;
	else if('@r < 60)
		warp "un_myst.gat",86,136;
	else
		warp "un_myst.gat",138,138;
	end;
}
un_myst.gat,138,140,0	script	#m203	45,1,1,{/* 59714 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",176,137;
	else if('@r < 60)
		warp "un_myst.gat",86,136;
	else
		warp "un_myst.gat",138,138;
	end;
}
un_myst.gat,182,137,3	script	�s�v�c�Ȍ���02#02	10082,{/* 59715 */
	switch(VER2_QUE) {
	case 25:
		mes "�]���Ɍ��E���}�����悤���B";
		mes "�@���ł͐g�̂����R�ɓ����Ȃ��]";
		next;
		mes "�]���łɐ����҂̐���";
		mes "�@���Ȃ茸���Ă��܂����]";
		next;
		mes "�]�Ō�������̂����̐ӔC����";
		mes "�@�l���Ă�������ǁc�c�B";
		mes "�@����͎��̗~�������B";
		mes "�@���ɂ���Ȏ��Ԃ�";
		mes "�@�c����Ă��Ȃ��悤���c�c�]";
		close2;
		set VER2_QUE,26;
		warp "un_myst.gat",86,136;
		end;
	case 26:
		mes "�]�����������Ƃ����܂܂Ȃ�Ȃ��]";
		next;
		mes "�]���M���X�ɂ݂�Ȃ����������";
		mes "�@�����Ă��������������c�c";
		mes "�@�𗧂ǂ��납�ו��ɂ܂�";
		mes "�@���艺��������������Ȃ��]";
		next;
		mes "�]�����̉ו��ƂȂ������ɏo���鎖��";
		mes "�@������鎖�����������B";
		mes "�@�����n�߂��S�Ă��A";
		mes "�@���̑S�Ă��c�c�]";
		close2;
		set VER2_QUE,27;
		warp "un_myst.gat",86,136;
		end;
	case 27:
		mes "�]�����̂ĂȂ����c�c�]";
		close2;
		set VER2_QUE,28;
		warp "un_myst.gat",86,136;
		end;
	default:
		mes "�]�ŋ߂͋N���Ă��鎞�Ԃ��A";
		mes "�@�����Ă��鎞�Ԃ̕���";
		mes "�@�����Ȃ��Ă���]";
		next;
		mes "�]����ɉ��̂��ӎ��̒���";
		mes "�@�ӂƔނ̊���v�������ׂ��]";
		next;
		mes "�]�^�e�B�I�c�c�]";
		next;
		mes "�]���������Ȃ��������ɂ�";
		mes "�@�D�������Ă��ꂽ�l�������]";
		next;
		mes "�]�l�c�c���B";
		mes "�@�ނ𐬌���Ƃ����v��Ȃ�����";
		mes "�@�ߋ��̎��ɒp����������";
		mes "�@������������������]";
		next;
		mes "�]���̂܂܎���ł�������";
		mes "�@�v���Ă�������ǁc�c";
		mes "�@�ނɎӂ邽�߂ɂ��A";
		mes "�@�����Ȃ��������t��`���邽�߂ɂ�";
		mes "�@�����Ȃ���΂Ȃ�Ȃ��ƍl�����]";
		next;
		mes "�]�c�c�\���낤���H�]";
		close2;
		if(VER2_QUE == 28) {
			delquest 11389;
			setquest 118225;
			set VER2_QUE,29;
		}
		warp "un_myst.gat",14,92;
		end;
	}
}
un_myst.gat,75,91,0	script	#m301	45,1,1,{/* 59716 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,121,82,0	script	#m302	45,1,1,{/* 59717 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,169,89,0	script	#m303	45,1,1,{/* 59718 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,219,88,0	script	#m304	45,1,1,{/* 59719 */
	set '@r,rand(100);
	if('@r < 20)
		warp "un_myst.gat",217,84;
	else if('@r < 60)
		warp "un_myst.gat",107,88;
	else
		warp "un_myst.gat",160,89;
	end;
}
un_myst.gat,214,86,3	script	�s�v�c�Ȍ���03#03	10082,{/* 59720 */
	switch(VER2_QUE) {
	case 29:
		mes "01001000�@01000101";
		mes "01001100�@01001100";
		mes "01001111�@01010111";
		mes "01001111�@01010010";
		mes "01001100�@01000100";
		close2;
		set VER2_QUE,30;
		warp "un_myst.gat",160,89;
		end;
	case 30:
		mes "01001001�@01000001";
		mes "01001101�@01000110";
		mes "01001001�@01001110";
		mes "01000101";
		close2;
		set VER2_QUE,31;
		warp "un_myst.gat",160,89;
		end;
	case 31:
		mes "debugging";
		close2;
		set VER2_QUE,32;
		warp "un_myst.gat",160,89;
		end;
	case 32:
		mes "�t�@�C���C��";
		mes "�ғ��͈̓`�F�b�N";
		mes "25%";
		mes "�c�c";
		mes "38%";
		close2;
		set VER2_QUE,33;
		warp "un_myst.gat",160,89;
		end;
	case 33:
		mes "45%";
		mes "�c�c";
		mes "50%";
		mes "����ғ���Ɉڍs";
		mes "�N���v���Z�X�J�n�B";
		close2;
		set VER2_QUE,34;
		warp "un_myst.gat",160,89;
		end;
	case 34:
		mes "60%";
		mes "�c�c";
		mes "�ړ����x�`�F�b�N����";
		mes "�g�̋@�\�`�F�b�N����B";
		close2;
		set VER2_QUE,35;
		warp "un_myst.gat",160,89;
		end;
	case 35:
		mes "70%";
		mes "�c�c";
		mes "����@�\��";
		mes "�튯�`�F�b�N";
		mes "�󎀑g�D���֑g�D�ɂďC���B";
		close2;
		set VER2_QUE,36;
		warp "un_myst.gat",160,89;
		end;
	case 36:
		mes "80%";
		mes "�c�c";
		mes "�܂Ƃ��ɏ������ł��Ȃ�������";
		mes "��p�͐����ƌ����邾�낤�B";
		mes "���̐��������ɂ���";
		mes "���̐����҂ɂ����Â��{���\�肾�B";
		close2;
		set VER2_QUE,37;
		warp "un_myst.gat",160,89;
		end;
	default:
		mes "98%�c�c�s�ǃZ�N�^�[�����B";
		mes "��ƌ������œK�����邽�߂�";
		mes "�������`�b�v���R�s�[����";
		mes "T_W_O_002b������Ă݂��B";
		mes "�R�s�[�̉ߒ��ňꕔ�̃f�[�^��";
		mes "�������ꂽ�悤�����c�c�B";
		close2;
		if(VER2_QUE == 37) {
			delquest 118225;
			setquest 118230;
			set VER2_QUE,38;
		}
		warp "un_myst.gat",209,37;
		end;
	}
}
un_myst.gat,209,42,3	script	�^�}����#�Ō�̕�������	10027,{/* 59721 */
	switch(VER2_QUE) {
	case 38:
		mes "[�^�}����]";
		mes "���낻�낱�̃V�F���^�[��";
		mes "���ׂ��镔�������Ȃ�";
		mes "�Ȃ��Ă��܂����ˁB";
		cutin "ep143_tasmi",2;
		next;
		mes "[�^�}����]";
		mes "���������Ύ��̌��̌�����";
		mes "�����������ł��B";
		mes "���炭�A��������O��";
		mes "�o�邱�Ƃ��\���Ǝv���܂��B";
		next;
		mes "[�^�}����]";
		mes "���Ȃ݂ɉ��̔��̐��";
		mes "�}�[�N�C�V�����񂪒��ׂ�";
		mes "����悤�ł��B";
		mes "�����A�s���܂��傤�I";
		next;
		menu "�����J��",-;
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "�����J���̂ł��ˁH";
		mes "������܂����B";
		mes "�c�c�B";
		next;
		if(checkitemblank() < 2) {
			mes "[�^�}����]";
			mes "�n���������̂�����܂������A";
			mes "�ו��������悤�ł��B";
			mes "��ސ������炵��";
			mes "�󂫂��o������܂��A";
			mes "���������Ă���܂����H";
			close2;
			cutin "ep143_taang",255;
			end;
		}
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "���ƁA�����";
		mes strcharinfo(0)+ "�l�̕��ł��B";
		mes "�x���e�B���񂪂����܂ł�";
		mes "�������L�^���Ă��ꂽ�����ŁA";
		mes "�ȈՈړ��p�̑��u�������ł��B";
		delquest 118230;
		setquest 201770;
		set VER2_QUE,39;
		getexp 1000000,0; //97773262
		getexp 1000000,0; //97773262
		getexp 1000000,0; //98773262
		getexp 1000000,0; //99773262
		getexp 1000000,0; //97773262
		getexp 0,500000; //8407119
		getexp 0,500000; //8407119
		getexp 0,500000; //8907119
		getexp 0,500000; //9407119
		getexp 0,500000; //9907119
		getitem 6828,1;
		getitem 6962,20;
		setquest 120260;
		compquest 120260;
		next;
		mes "[�^�}����]";
		mes "��x�O�֏o�Ă��܂�����ł�";
		mes "�O�ɋ���x���e�B����Ɍ������";
		mes "�����܂ň�u�ňړ����鎖��";
		mes "�ł��邻���ł���B";
		next;
		cutin "ep143_tasta",2;
		mes "[�^�}����]";
		mes "�c�c�����܂���B";
		mes "���̕s�v�c�Ȍ��ЂɎc���Ă���";
		mes "���b�Z�[�W�̓��e���l���Ă��܂����B";
		mes "�����ɐZ���Ă���ꍇ�ł�";
		mes "�Ȃ������ł��ˁB";
		mes "�����J���܂����A�����܂��傤�B";
		close2;
		cutin "ep143_taang",255;
		warp "un_myst.gat",111,37;
		end;
	default:
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "���̌��ЂɎc���Ă���";
		mes "���b�Z�[�W�������Ȃ�c�c�B";
		mes "�Ȃ�āA�����l�����Ƃ����";
		mes "�d���Ȃ��ł��ˁc�c�B";
		next;
		cutin "ep143_tasmi",2;
		mes "[�^�}����]";
		mes "���Ȃ݂ɉ��̔��̐��";
		mes "�}�[�N�C�V�����񂪒��ׂ�";
		mes "����悤�ł��B";
		mes "�����A�s���܂��傤�I";
		next;
		menu "�����J��",-;
		cutin "ep143_taang",2;
		mes "[�^�}����]";
		mes "���̂��c�c�؂Ȃ��C�����ɂȂ�܂��B";
		mes "�����ł��ǂ����Ă��A";
		mes "�킩��Ȃ��̂ł����c�c�B";
		close2;
		cutin "ep143_taang",255;
		warp "un_myst.gat",111,37;
		end;
	}
}
un_myst.gat,108,38,0	warp	#way	1,1,un_myst.gat,209,37	//59722
un_myst.gat,163,38,5	script	�}�[�N�C�V��	616,{/* 59723 */
	mes "[�}�[�N�C�V��]";
	mes "���̔��͍��܂łƈ����";
	mes "���炩�ɂ����瑤����";
	mes "�ǂ������Ղ�����܂��ˁc�c�B";
	cutin "bu_mark4",0;
	next;
	cutin "bu_mark1",0;
	mes "[�}�[�N�C�V��]";
	mes "�ǂ����܂��傤�B";
	mes "�����J���Ē��ɓ���܂����H";
	next;
	if(getonlinepartymember() < 1) {
		mes "[�}�[�N�C�V��]";
		mes "�p�[�e�B�[��g���";
		mes "���Ȃ��悤�ł��ˁB";
		mes "�c�c���ȗ\�������܂�����A";
		mes "�K���p�[�e�B�[��g��ł���";
		mes "���ɓ����Ă��������B";
		close2;
		cutin "bu_mark1",255;
		end;
	}
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	switch(select("�����J����","���ɓ���","��߂�","�O�ɏo����")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�p�[�e�B�[���F" +'@party$;
			mes "�p�[�e�B�[���[�_�[���F" +'@leader$;
			mes "^0000fflast_room ^000000-�\�񎸔s";
			close2;
			cutin "bu_mark1",255;
			end;
		}
		mdcreate "last_room";
		mes "[�}�[�N�C�V��]";
		mes "����ł͔����J���܂��B";
		mes "���S�ɊJ������";
		mes "���ɓ����Ă��������B";
		close2;
		cutin "bu_mark1",255;
		end;
	case 2:
		switch(mdenter("last_room")) {
		case 0:	// �G���[�Ȃ�
			setquest 11380;
			announce "�������A���_���W����[last_room] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			setquest 11379;
			cutin "bu_mark1",255;
			warp "1@uns.gat",144,36;
			end;
		case 1:	// �p�[�e�B�[������
			mes "[�}�[�N�C�V��]";
			mes "�p�[�e�B�[��g���";
			mes "���Ȃ��悤�ł��ˁB";
			mes "�c�c���ȗ\�������܂�����A";
			mes "�K���p�[�e�B�[��g��ł���";
			mes "���ɓ����Ă��������B";
			close2;
			cutin "bu_mark1",255;
			end;
		case 2:	// �_���W�������쐬
			mes "[�}�[�N�C�V��]";
			mes "�p�[�e�B�[���[�_�[��";
			mes "�����J���Ă��Ȃ��悤�ł��ˁB";
			mes "���[�_�[�̕����悸�A";
			mes "�����J���Ă��������B";
			close2;
			cutin "bu_mark1",255;
			end;
		default:	// ���̑��G���[
			close;
		}
	case 3:
		cutin "bu_mark4",0;
		mes "[�}�[�N�C�V��]";
		mes "�����ł��ˁB";
		mes "�����N���邩�킩��܂���";
		mes "�Ó��ȑI�����Ǝv���܂��B";
		mes "���������܂ɂ͂���ȕ��ɁA";
		mes "���[�_�[�炵���������l����";
		mes "�������ė~�������̂ł��c�c�B";
		close2;
		cutin "bu_mark4",255;
		end;
	case 4:
		cutin "bu_mark2",0;
		mes "[�}�[�N�C�V��]";
		mes "���������΃^�}������";
		mes "�N�����@���č�����Ǝv����";
		mes "�o������������ł��B";
		mes "��������O�ɏo����Ǝv���܂���";
		mes "���Ȃ�Â��̂ŋC������";
		mes "�i��ł��������ˁB";
		close2;
		cutin "bu_mark2",255;
		warp "verus01.gat",115,190;
		end;
	}
}
un_bunker.gat,98,85,0	warp	#bunker_out	1,1,verus01.gat,115,190	//59724
un_bunker.gat,97,100,0	script	#�U������1	139,2,2,{/* 59725 */
	if(VER2_QUE >= 18) {
		cutin "bu_du5",2;
		mes "[�e���[���A��]";
		mes "�Ȃ񂾂�݂�ȁI";
		mes "���������Ăǂ����ɍs���Ƃ�";
		mes "����������c�c!!";
		mes "�����I";
		mes strcharinfo(0)+ "�I";
		next;
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�ǂ�������ꏏ��";
		mes "�s������!!";
		mes "�ׁA�ʂɕ|���킯����";
		mes "�Ȃ���!!";
		mes "�݂�Ȃ���A��������������";
		mes "�������Ȃ��ƍ��邾��!?";
		next;
		cutin "bu_du2",2;
		mes "[�e���[���A��]";
		mes "�܂��c�c�B";
		mes "�������Ă����͏����";
		mes "���Ă������ǂ�!!";
		mes "��͂͂͂͂͂͂͂͂�!!";
		close2;
		cutin "bu_du2",255;
		end;
	}
}
un_bunker.gat,298,177,0	script	#�U������2	139,3,3,{/* 59726 */
	if(VER2_QUE >= 18) {
		cutin "bu_du2",2;
		mes "[�e���[���A��]";
		mes "���c�c�I";
		mes "�A���v����̘A�����B";
		mes "�ǂ���炱�̐�ɋ���";
		mes "�݂������I";
		next;
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�悵�A���������I";
		mes "���������݂�Ȃ��";
		mes "��ɓ������ċ������Ȃ��ƂȁI";
		mes "��͂͂͂͂͂͂͂͂�!!";
		close2;
		cutin "bu_du1",255;
		end;
	}
}
un_bunker.gat,41,275,0	warp	�@�B��#b_J-0	1,1,un_bunker.gat,21,276	//59727
un_bunker.gat,24,276,0	warp	J-0#b_�@�B��	1,1,un_bunker.gat,45,275	//59728
un_bunker.gat,24,256,0	warp	J-0#b_L-1		1,1,un_bunker.gat,26,190	//59729
un_bunker.gat,23,190,0	warp	L-1#b_J-0		1,1,un_bunker.gat,21,256	//59730
un_bunker.gat,31,196,0	warp	L-1#b_D-1		1,1,un_bunker.gat,22,378	//59731
un_bunker.gat,21,375,0	warp	D-1#b_L-1		1,1,un_bunker.gat,32,193	//59732
un_bunker.gat,51,196,0	warp	L-1#b_D-2		1,1,un_bunker.gat,68,378	//59733
un_bunker.gat,67,375,0	warp	D-2#b_L-1		1,1,un_bunker.gat,52,193	//59734
un_bunker.gat,60,183,0	warp	L-1#b_�ǐ���	1,1,un_bunker.gat,75,235	//59735
un_bunker.gat,71,236,0	warp	�ǐ���#b_L-1	1,1,un_bunker.gat,57,182	//59736
un_bunker.gat,60,169,0	warp	L-1#b_���j�^�����O��	1,1,un_bunker.gat,72,168	//59737
un_bunker.gat,69,167,0	warp	���j�^�����O��#b_L-1	1,1,un_bunker.gat,57,168	//59738
un_bunker.gat,47,135,0	warp	L-1#b_B-1				1,1,un_bunker.gat,37,134	//59739
un_bunker.gat,40,135,0	warp	B-1#b_L-1				1,1,un_bunker.gat,50,134	//59740
un_bunker.gat,57,118,0	warp	L-1#b_A-0				1,1,un_bunker.gat,72,117	//59741
un_bunker.gat,69,118,0	script	A-0#b_L-1				45,1,1,{	//59742
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",53,117;
	end;
}

un_bunker.gat,97,124,0	script	A-0#b_���j�^�����O��	45,1,1,{	//59743
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",100,144;
	end;
}
un_bunker.gat,97,141,0	warp	���j�^�����O��#b_A-0	1,1,un_bunker.gat,98,121	//59744
un_bunker.gat,128,118,0	script	A-0#b_L-2	45,1,1,{	//59745
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",144,117;
	end;
}
un_bunker.gat,140,118,0	warp	L-2#b_A-0				1,1,un_bunker.gat,125,117	//59746
un_bunker.gat,137,168,0	warp	L-2#b_���j�^�����O��	1,1,un_bunker.gat,122,167	//59747
un_bunker.gat,126,168,0	warp	���j�^�����O��#b_L-2	1,1,un_bunker.gat,140,167	//59748
un_bunker.gat,137,185,0	warp	L-2#b_�ǐ���	1,1,un_bunker.gat,120,235	//59749
un_bunker.gat,124,236,0	warp	�ǐ���#b_L-2	1,1,un_bunker.gat,140,184	//59750
un_bunker.gat,147,196,0	warp	L-2#b_E-1		1,1,un_bunker.gat,106,378	//59751
un_bunker.gat,105,375,0	warp	E-1#b_L-2		1,1,un_bunker.gat,148,193	//59752
un_bunker.gat,167,196,0	warp	L-2#b_E-2		1,1,un_bunker.gat,152,378	//59753
un_bunker.gat,151,375,0	warp	E-2#b_L-2		1,1,un_bunker.gat,168,193	//59754
un_bunker.gat,174,190,0	warp	L-2#b_K-0		1,1,un_bunker.gat,172,229	//59755
un_bunker.gat,169,230,0	warp	K-0#b_L-2		1,1,un_bunker.gat,171,189	//59756
un_bunker.gat,213,346,0	warp	�_��#b_C-0		1,1,un_bunker.gat,213,299	//59757
un_bunker.gat,216,300,0	warp	C-0#b_�_��		1,1,un_bunker.gat,216,345	//59758
un_bunker.gat,216,280,0	warp	C-0#b_G-1		1,1,un_bunker.gat,220,261	//59759
un_bunker.gat,217,262,0	warp	G-1#b_C-0		1,1,un_bunker.gat,213,279	//59760
un_bunker.gat,249,268,0	warp	G-1#b_M-0		1,1,un_bunker.gat,390,380	//59761
un_bunker.gat,389,377,0	warp	M-0#b_G-1		1,1,un_bunker.gat,250,265	//59762
un_bunker.gat,258,262,0	warp	G-1#b_�H��		1,1,un_bunker.gat,274,289	//59763
un_bunker.gat,271,290,0	warp	�H��#b_G-1		1,1,un_bunker.gat,255,261	//59764
un_bunker.gat,258,236,0	warp	G-1#b_���Î�	1,1,un_bunker.gat,272,235	//59765
un_bunker.gat,269,236,0	warp	���Î�#b_G-1	1,1,un_bunker.gat,255,235	//59766
un_bunker.gat,245,214,0	warp	G-1#b_F-1		1,1,un_bunker.gat,226,213	//59767
un_bunker.gat,230,214,0	warp	F-1#b_G-1		1,1,un_bunker.gat,248,213	//59768
un_bunker.gat,262,200,0	warp	G-1#b_H-0		1,1,un_bunker.gat,274,199	//59769
un_bunker.gat,271,200,0	script	H-0#b_G-1		45,1,1,{	//59770
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",258,199;
	end;
}
un_bunker.gat,75,128,0	warp	�EA-0#b_�EH-0	1,1,un_bunker.gat,276,196	//59771
un_bunker.gat,275,191,0	warp	�EH-0#b_�EA-0	1,1,un_bunker.gat,76,121	//59772
un_bunker.gat,119,128,0	script	��A-0#b_��H-0	45,1,1,{	//59773
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",319,196;
	end;
}
un_bunker.gat,320,191,0	script	��H-0#b_��A-0	45,1,1,{	//59774
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",120,121;
	end;
}
un_bunker.gat,297,206,0	script	H-0#b_���Î�	45,1,1,{	//59775
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",298,224;
	end;
}
un_bunker.gat,297,221,0	warp	���Î�#b_H-0	1,1,un_bunker.gat,298,203	//59776
un_bunker.gat,324,200,0	script	H-0#b_G-2		45,1,1,{	//59777
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",344,199;
	end;
}
un_bunker.gat,339,200,0	warp	G-2#b_H-0		1,1,un_bunker.gat,321,199	//59778
un_bunker.gat,350,214,0	warp	G-2#b_F-2		1,1,un_bunker.gat,368,213	//59779
un_bunker.gat,365,214,0	warp	F-2#b_G-2		1,1,un_bunker.gat,347,213	//59780
un_bunker.gat,337,236,0	warp	G-2#b_���Î�	1,1,un_bunker.gat,323,235	//59781
un_bunker.gat,326,236,0	warp	���Î�#b_G-2	1,1,un_bunker.gat,340,235	//59782
un_bunker.gat,281,266,0	warp	�E���Î�#b_�E�H��	1,1,un_bunker.gat,282,282	//59783
un_bunker.gat,281,279,0	warp	�E�H��#b_�E���Î�	1,1,un_bunker.gat,282,263	//59784
un_bunker.gat,313,266,0	warp	�����Î�#b_���H��	1,1,un_bunker.gat,314,282	//59785
un_bunker.gat,313,279,0	warp	���H��#b_�����Î�	1,1,un_bunker.gat,314,262	//59786
un_bunker.gat,324,290,0	warp	�H��#b_G-2	1,1,un_bunker.gat,340,261	//59787
un_bunker.gat,337,262,0	warp	G-2#b_�H��	1,1,un_bunker.gat,321,289	//59788
un_bunker.gat,343,270,0	warp	G-2#b_N-0	1,1,un_bunker.gat,382,328	//59789
un_bunker.gat,381,325,0	warp	N-0#b_G-2	1,1,un_bunker.gat,344,267	//59790
un_bunker.gat,370,264,0	warp	G-2#b_I-0	1,1,un_bunker.gat,388,263	//59791
un_bunker.gat,385,264,0	warp	I-0#b_G-2	1,1,un_bunker.gat,367,263	//59792
un_bunker.gat,297,192,0	warp	H-0#b_Z-0	1,1,un_bunker.gat,298,181	//59793
un_bunker.gat,297,186,0	warp	Z-0#b_H-0	1,1,un_bunker.gat,298,196	//59794
un_bunker.gat,229,163,0	script	Z-0#b_Z-1	45,1,1,{	//59795
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",159,52;
	end;
}
un_bunker.gat,164,51,0	warp	Z-1#b_Z-0	1,1,un_bunker.gat,233,164	//59796
un_bunker.gat,366,164,0	script	Z-0#b_Z-2	45,1,1,{		//59797
	if(VER2_QUE >= 18) {
		cutin "bu_du3",2;
		mes "[�e���[���A��]";
		mes "���̃��[�v�|�[�^������A";
		mes "������̋C�z�͊����Ȃ��ȁB";
		mes "�������̂܂ܐi��ł�";
		mes "�Ӗ��Ȃ��Ǝv�����B";
		mes "����ł��i�ނ̂��H";
		next;
		if(select("�i��","��߂�") == 2) {
			cutin "bu_du2",2;
			mes "[�e���[���A��]";
			mes "���΂��ȁI";
			mes "�}�h���h�Ƃ͑�Ⴂ���B";
			mes "���̓��𒲂ׂ悤���I";
			close2;
			cutin "bu_du2",255;
			end;
		}
		cutin "bu_du1",2;
		mes "[�e���[���A��]";
		mes "�����܂Ō����Ȃ�";
		mes "�d���Ȃ��ȁc�c�B";
		mes "�悵�A�s�������I";
		close2;
		cutin "bu_du1",255;
	}
	warp "un_bunker.gat",31,51;
	end;
}
un_bunker.gat,27,52,0	warp	Z-2#b_Z-0	1,1,un_bunker.gat,361,163	//59798

un_bunker.gat,382,335,3	script	��#e152p00	10043,{/* 59506 */}
un_bunker.gat,87,167,3	script	���̉�#e152p01	10043,{/* 59507 */
	mes "�]���ɕς�������̂͌�������Ȃ��]";
	close;
}
un_bunker.gat,316,243,3	script	���̉�#e152p02	10043,{/* 59508 */}
un_bunker.gat,103,175,3	script	���̉�#e152p03	10043,{/* 59509 */}
un_bunker.gat,50,292,3	script	�@�B�c�[#e152p04	10043,{/* 59510 */}
un_bunker.gat,57,314,3	script	�@�B�c�[#e152p05	10043,{/* 59511 */}
un_bunker.gat,128,314,3	script	�@�B�c�[#e152p06	10043,{/* 59512 */}
un_bunker.gat,143,308,3	script	�@�B�c�[#e152p07	10043,{/* 59513 */}
un_bunker.gat,147,287,3	script	�@�B�c�[#e152p08	10043,{/* 59514 */}
un_bunker.gat,245,360,3	script	�΂�#e152p09	10043,{/* 59515 */}
un_bunker.gat,286,348,3	script	�΂�#e152p10	10043,{/* 59516 */}
un_bunker.gat,331,375,3	script	�΂�#e152p11	10043,{/* 59517 */}
un_bunker.gat,321,305,3	script	�d�Ȃ����g���C#e152p12	10043,{/* 59518 */}
un_bunker.gat,287,304,3	script	�d�Ȃ����g���C#e152p13	10043,{/* 59519 */}
un_bunker.gat,288,263,3	script	���ނ̎R#e152p14	10043,{/* 59520 */}
un_bunker.gat,280,243,3	script	���ނ̎R#e152p15	10043,{/* 59521 */}

verus04.gat,161,222,4	script	�����ȘV�l	52,{/* 59827 */
	if(checkquest(12368) & 0x8 == 0) {
		mes "[�����ȘV�l]";
		mes "�͂��B�����͕ςȋ@�B��������";
		mes "�d�����͂��ǂ�˂����B";
		mes "�����ɂ���2�̓S������";
		mes "�s�J�s�J���邩�Ǝv������";
		mes "���̖��ɂ������˂����ȁB";
		next;
		mes "�]^ff0000�܂���MARS_01�ɘb������";
		mes "�@�Âт��R���^���N1��n��";
		mes "�@PLUTO_09���N�������悤^000000�]";
		close;
	}
	mes "[�����ȘV�l]";
	mes "�����A���񂽁B";
	mes "�Âт��S��������Ă��Ȃ����H";
	mes "��Ƃɂ悭�g���񂾁B";
	mes "^ff0000�Âт��S��5��^000000��";
	mes "^0000ff�Âт��R���^���N1��^000000��";
	mes "�������ė~�����񂾂��B";
	next;
	if(select("��������","��߂�") == 2) {
		mes "[�����ȘV�l]";
		mes "���������B";
		close;
	}
	if(countitem(6961) < 5) {
		mes "[�����ȘV�l]";
		mes "��H";
		mes "�Âт��S�򂪑���Ȃ��悤�����B";
		mes "�Âт��S��5��";
		mes "�Âт��R���^���N1��";
		mes "�����������Ă���B";
		close;
	}
	set '@max,countitem(6961) / 5;
	mes "[�����ȘV�l]";
	mes "�����A�����邺�B";
	mes "���O����͍�";
	mes "�Âт��S���" +countitem(6961)+ "��";
	mes "�����Ă���悤���ȁB";
	mes "�Âт��R���^���N" +'@max+ "��";
	mes "�����o����ȁB";
	next;
	switch(select("�Âт��R���^���N1����������","�S����������","��������߂�")) {
	case 1:
		set '@num,1;
		break;
	case 2:
		set '@num,'@max;
		break;
	case 3:
		mes "[�����ȘV�l]";
		mes "���������B";
		mes "���̋C�ɂȂ�����܂����ނ�B";
		close;
	}
	if(checkitemblank() == 0) {
		mes "[�����ȘV�l]";
		mes "��H�@�ו��̎�ނ������悤���ȁB";
		mes "�ו��̎�ނ����炵�Ă���";
		mes "������x���������Ă���B";
		close;
	}
	delitem 6961,'@num * 5;
	getitem 6962,'@num;
	mes "[�����ȘV�l]";
	mes "�ق�A�񑩂̌Âт��R���^���N���B";
	mes "���肪�Ƃ��ȁI";
	close;
OnTalk:
	unittalk "�Ȃ��!?";
	end;
OnInit:
	waitingroom "�Âт��R������",0;
	end;
}
verus04.gat,163,219,4	script	PLUTO_09#pa0829	10147,{
	if(checkquest(12368) & 0x8 == 0) {
		mes "�]^0000ff�����Ȃk�d�c�����v���_���Ă��邪";
		mes "�@����͂��Ȃ��悤���B";
		mes "�@";
		mes "�@�܂���MARS_01�ɘb������";
		mes "�@�Âт��R���^���N1��n��";
		mes "�@PLUTO_09���N�������悤^000000�]";
		close;
	}
	mes "[PLUTO_09]";
	mes strcharinfo(0)+ "�l";
	mes "���E�R�\�B";
	mes "���^�V�n�G�N�Z���I�������m���Y�g";
	mes "�G�N�Z���I�������j�g�p�f�L��";
	mes "�݌v�}�m���Y���s�b�e�C�}�X�B";
	mes "������`�C�}�X�J�H";
	next;
	switch(select("�G�N�Z���I���������Y","�݌v�}���Y","�G�N�Z���I�������̐��\�m�F","��߂�")) {
	case 1:
		mes "[PLUTO_09]";
		mes "�������Y�j�n";
		mes "^0000ff�Âт��S��10��^000000";
		mes "�K�v�f�X�B";
		next;
		switch(select("��߂�","�G�N�Z���I���E�B���O","�G�N�Z���I���X�[�c")) {
		case 1:
			mes "[PLUTO_09]";
			mes "�I���V�}�X�B";
			close;
		case 2:
			set '@gain,20773;
			break;
		case 3:
			set '@gain,15128;
			break;
		}
		if(countitem(6961) < 10) {
			mes "[PLUTO_09]";
			mes "�A�C�e���K�s���V�e�C�}�X�B";
			mes "^0000ff�Âт��S��10��^000000";
			mes "�K�v�f�X�B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[PLUTO_09]";
			mes "�G���[�G���[�B";
			mes "�A�C�e���K^ff0000���C^000000�f�X�B";
			mes "�������m�A�C�e������";
			mes "�����V�e�N�_�T�C�B";
			close;
		}
		misceffect 234;
		delitem 6961,10;
		getitem '@gain,1;
		mes "[PLUTO_09]";
		mes "�s�s�s�[�s�s�b�I";
		mes "����V�}�V�^�B";
		close;
	case 2:
		while(1) {
			mes "[PLUTO_09]";
			mes "�Âт��R���^���N5�f1��";
			mes "�݌v�}�m���Y�j����f�L�}�X�B";
			if(countitem(6828) < 5) {
				set '@str$,"^aaaaaa�R���s��^000000";
			}
			else {
				set '@str$,"�݌v�}���Y�]^ff0000" +(countitem(6828) / 5)+ "�񗘗p�\^000000";
			}
			next;
			if(select('@str$,"��߂�") == 2) {
				mes "[PLUTO_09]";
				mes "�������I���V�}�X�B";
				mes "�S���p�A���K�g�E�S�U�C�}�V�^�B";
				close;
			}
			if(countitem(6828) < 5) {
				mes "[PLUTO_09]";
				mes "�G���[�G���[�B";
				mes "�R���K�s���V�e�C�}�X�B";
				mes "�Âт��R���^���N��5�K�v�f�X�B";
				close;
			}
			if(checkitemblank() == 0) {
				mes "[PLUTO_09]";
				mes "�G���[�G���[�B";
				mes "�A�C�e���K^ff0000���C^000000�f�X�B";
				mes "�������m�A�C�e������";
				mes "�����V�e�N�_�T�C�B";
				close;
			}
			if(rand(100) < 60) {
				setarray '@table,998,998,999,1002,1002,7054,7054;
				misceffect 17;
				delitem 6828,5;
				getitem '@table[rand(getarraysize('@table))],1;
				mes "[PLUTO_09]";
				mes "���s���s�I";
				mes "�݌v�}�m�ハ���j";
				mes "�R���K�f�L�}�V�^�c�c�B";
			}
			else {
				setarray '@table,6973,6979,6980,6981,6982,1002,6984,6986;
				misceffect 76;
				delitem 6962,5;
				getitem '@table[rand(getarraysize('@table))],1;
				getitem 6979,1;
				mes "[PLUTO_09]";
				mes "���������B";
				mes "�݌v�}�K�����V�}�V�^�B";
			}
			next;
		}
	case 3:
		mes "[PLUTO_09]";
		mes "�J�V�R�}���}�V�^�B";
		mes "�h�`�����m�F�V�}�X�J�H";
		mes "�@";
		mes "�]^ff0000�ꕔ�A�m�F��";
		mes "�@��ʂ̃X�N���[�����K�v�ł�^000000�]";
		while(1) {
			next;
			switch(select("�G�N�Z���I���E�B���O","�G�N�Z���I���X�[�c","����̂���߂�")) {
			case 1:
				mes "[�G�N�Z���I���E�B���O]";
				mes "�@";
				mes "���S��� + 8";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "BaseLv130�ȏ�̎��A�ǉ���";
				mes "���S��� + 2 ";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�G�N�Z���I���E�B���O]��";
				mes "���B�l��1�オ��x�ɒǉ���";
				mes "Flee + 2";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�G�N�Z���I���X�[�c]��";
				mes "���ɑ������A�ǉ���";
				mes "�X�L���f�B���C - 10%";
				mes "BaseLv130�ȏ�̎��A�ǉ���";
				mes "�X�L���f�B���C - 10%";
				mes "���S��� + 6";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777���ɂ����镨^000000";
				mes "�h�� : ^77777740^000000";
				mes "�d�� : ^77777790^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^777777�S�Ă̐E��^000000";
				break;
			case 2:
				mes "[�G�N�Z���I���X�[�c]";
				mes "�@";
				mes "Vit + 6";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "BaseLv130�ȏ�̎��A�ǉ���";
				mes "Vit + 4";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�G�N�Z���I���X�[�c]��";
				mes "���B�l��3�オ��x�ɒǉ���";
				mes "MaxHP + 4%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�G�N�Z���I���E�B���O]��";
				mes "���ɑ������A�ǉ���";
				mes "�X�L���f�B���C - 10%";
				mes "BaseLv130�ȏ�̎��A�ǉ���";
				mes "�X�L���f�B���C - 10%";
				mes "���S��� + 6";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�Z^000000";
				mes "�h�� : ^777777100^000000";
				mes "�d�� : ^777777100^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^777777�S�Ă̐E��^000000";
				break;
			case 3:
				mes "[PLUTO_09]";
				mes "�I���V�}�X�B";
				close;
			}
		}
	case 4:
		mes "[PLUTO_09]";
		mes "�I���V�}�X�B";
		close;
	}
OnTalk:
	unittalk "�G�i�W�[�����m�F�B���퓮�삪�\�ɂȂ�܂����B";
	end;
OnInit:
	waitingroom "����/�݌v�}���Y",0;
	end;
}
verus04.gat,165,217,4	script	MARS_01#pa0829	10080,{
	if(!checkquest(12368)) {
		mes "�]�W������������t����ʂ�";
		mes "�@���������Ɨh��Ă���B";
		mes "�@�d�͂���������Ȃ��悤���]";
		next;
		if(select("��������","�{�^���������Ă݂�") == 1) {
			mes "�]���Ȃ��͂��̏���������]";
			close;
		}
		mes "[?????]";
		mes "��������Ⴂ�܂��B";
		mes "���͒T�����{�b�gMARS_01�ł��B";
		mes "���݁A�ߓd���[�h�ׁ̈A";
		mes "�@�\���j���[�������ł��B";
		next;
		if(select("�I��","�R���⋋") == 1) {
			mes "�]���{�b�g���疾���肪������";
			mes "�@�X���[�v���[�h�ɓ������悤���]";
			close;
		}
		mes "[MARS_01]";
		mes "�������͒��ߓd���{�b�g�ł��B";
		mes "�Âт��R���^���N1��";
		mes "���Ǝ��̓����ł���PLUTO_09��";
		mes "�G�l���M�[��90%�قǊm�ۏo���܂��B";
		next;
		mes "[MARS_01]";
		mes "�Âт��R���^���N�������Ă�����";
		mes "���j�^�[�̉��ɂ���R����������";
		mes "�������ĉ������B";
		mes "�ߓd���[�h���������鎖��";
		mes "�ł���͂��ł��B";
		setquest 12368;
		close;
	}
	if(checkquest(12368) & 0x8 == 0) {
		if(countitem(6962) < 1) {
			mes "[MARS_01]";
			mes "�Âт��R���^���N�������Ă�����";
			mes "���j�^�[�̉��ɂ���R����������";
			mes "�������ĉ������B";
			mes "�ߓd���[�h���������鎖��";
			mes "�ł���͂��ł��B";
			close;
		}
		mes "�]�d�͂������Ȃ��Ă��܂����̂�";
		mes "�@�����肪�����Ă��Ȃ��B";
		mes "�@�R���𒍓����܂����H�]";
		next;
		if(select("�R���𒍓�����","��߂�") == 2) {
			//mes "�]���S�ɓd�͂��؂ꂽ�Ă��܂����̂�";
			mes "�]���S�ɓd�͂��؂�Ă��܂����̂�";
			mes "�@�S���������Ȃ��B";
			close;
		}
		mes "�]�R���𒍓������";
		mes "�@�傫�ȉ��𗧂ĂȂ���";
		mes "�@��ʂ����邭����n�߂��]";
		donpcevent "�����ȘV�l::OnTalk";
		next;
		mes "[MARS_01]";
		mes "�V�X�e���ғ��B";
		mes "������ԃ`�F�b�N�B";
		next;
		mes "[MARS_01]";
		mes "���͌n10%�A����Ց����Ȃ�";
		mes "�{�f�B�[�t���[��13%";
		mes "�������s�\�͗ǍD";
		next;
		mes "[MARS_01]";
		mes "PLUTO_09�ւ̃G�i�W�[������";
		mes "�X�^�[�g���܂��B";
		donpcevent "PLUTO_09#pa0829::OnTalk";
		next;
		mes "[MARS_01]";
		mes "�R���𒍓����Ă�������";
		mes "���肪�Ƃ��������܂��B";
		mes "������Ǘ��ғo�^�����܂��̂�";
		mes "�����O����͂��Ă��������B";
		next;
		menu "���O����͂���",-;
		mes "[MARS_01]";
		mes strcharinfo(0)+ "�l�ł��ˁB";
		mes "���}���܂��B";
		mes "�R�����������S�ɏI�����܂����B";
		delitem 6962,1;
		compquest 12368;
		close;
	}
	mes "[MARS_01]";
	mes strcharinfo(0)+ "�l";
	mes "��������Ⴂ�܂��B";
	mes "�����ɗ��Ă�Ό��h�ł��B";
	mes "���p�������f���������܂��B";
	next;
	switch(select("�w���v���j���[","�G�N�Z���I���E�B���O����","�G�N�Z���I���X�[�c����","�G�N�Z���I�����b�O����","�G�N�Z���I���V�[���h����","�I������")) {
	case 1:
		mes "[MARS_01]";
		mes "��������";
		mes "�����̐��\����A������ړI�Ƃ���";
		mes "�쐬���ꂽ���{�b�g�ł��B";
		next;
		mes "[MARS_01]";
		mes "�G�N�Z���I���E�B���O�A";
		mes "�G�N�Z���I���X�[�c�A";
		mes "�G�N�Z���I�����b�O�A";
		mes "�G�N�Z���I���V�[���h��";
		mes "�����p�݌v�}�����Ɏ����ė��Ă��������B";
		mes "�}�ʂɉ������G���`�����g���{���܂��B";
		next;
		mes "[MARS_01]";
		mes "�����p�݌v�}��";
		mes "�ׂɂ���PLUTO_09����";
		mes "���肪�\�ł��B";
		mes "�@";
		mes "�����Ċm�F���܂����H";
		while(1) {
			next;
			switch(select("�G���`�����g�̒��ӎ���","�G���`�����g�̎��","�I������")) {
			case 1:
				mes "[MARS_01]";
				mes "�G���`�����g�̒��ӎ����ɂ���";
				mes "���`���������܂��B";
				next;
				mes "[MARS_01]";
				mes "�G���`�����g���s����";
				mes "�����̐��B�l��^ff0000���Z�b�g^000000����܂��B";
				mes "���B������ۂ�";
				mes "�S�ẴG���`�����g���ς܂�����Ԃ�";
				mes "�s�������������߂��܂��B";
				next;
				mes "[MARS_01]";
				mes "�G���`�����g�͊�]����h���";
				mes "^ff0000�����������^000000�ł����Ȃ��Ă��������B";
				next;
				mes "[MARS_01]";
				mes "�G���`�����g�͐݌v�}�����Ƃ�";
				mes "�����Ȃ��܂��̂�";
				mes "^ff0000100%�������܂�^000000�B";
				mes "�������A��x�s�����G���`�����g��";
				mes "^ff0000���Z�b�g�͏o���܂���B^000000";
				next;
				mes "[MARS_01]";
				mes "�S�ẴG���`�����g��";
				mes "^ff0000���C�I�b�g�`�b�v[1]��";
				mes "���ɑ�������^000000����";
				mes "���\���I�[�o�[�N���b�N��";
				mes "�B���ꂽ�\�͂��������܂��B";
				next;
				mes "[MARS_01]";
				mes "�������A^0000ff������ނ̃G���`�����g��";
				mes "�������Ă����Ƃ��Ă�";
				mes "�Z�b�g���ʂ�1�������������܂���^000000�B";
				mes "�Ⴆ�΁AA-Atk���Z��2�A����1��";
				mes "�G���`�����g�����Ă�";
				mes "��������Z�b�g���ʂ�1�񕪂݂̂ł��B";
				next;
				mes "[MARS_01]";
				mes "�Ō�ɁA�݌v�}�ɂ����";
				mes "�G���`�����g�\�ȕ��ʂ�";
				mes "�G���`�����g�\�ȉ񐔂�";
				mes "���߂��Ă��܂��B";
				mes "�ڂ����̓w���v���j���[";
				mes "�G���`�����g�̎�ނł��m�F���������B";
				continue;
			case 2:
				break;
			case 3:
				mes "[MARS_01]";
				mes "�I�����܂��B";
				mes "�����p���肪�Ƃ��������܂����B";
				close;
			}
			break;
		}
		mes "[MARS_01]";
		mes "�G���`�����g�͑傫��������";
		mes "�ȉ��A6�̃^�C�v������܂��B";
		next;
		mes "[MARS_01]";
		mes "Enchant���Type-E�i�����t�^�j";
		mes "Resist���Type-R�i�����ϐ��j";
		mes "Cure���Type-C�i�񕜁j";
		mes "Assist���Type-A�i�⏕�j";
		mes "Special���Type-S�i����1�j";
		mes "Zenith���Type-Z�i����2�j";
		next;
		mes "[MARS_01]";
		mes "�����͑S�ăG���`�����g�\�ȕ��ʂ�";
		mes "�G���`�����g�\�ȉ񐔂�";
		mes "���߂��Ă��܂��B";
		mes "�ǂ�ɂ��Ċm�F���܂����H";
		mes "�]^ff0000�ꕔ�A�m�F��";
		mes "�@��ʂ̃X�N���[�����K�v�ł�^000000�]";
		while(1) {
			next;
			switch(select(	"E-Fire �Z-1 ��-0 �C-0 ��-0","E-Water �Z-1 ��-0 �C-0 ��-0","E-Ground �Z-1 ��-0 �C-0 ��-0","E-Wind �Z-1 ��-0 �C-0 ��-0",
							"R-Fire �Z-0 ��-3 �C-0 ��-1","R-Water �Z-0 ��-3 �C-0 ��-1","R-Ground �Z-0 ��-3 �C-0 ��-1","R-Wind �Z-0 ��-3 �C-0 ��-1",
							"C-Life �Z-3 ��-3 �C-3 ��-3","C-Soul �Z-3 ��-3 �C-3 ��-3","C-HPR �Z-3 ��-3 �C-3 ��-3","C-SPR �Z-3 ��-3 �C-3 ��-3",
							"A-Str �Z-1 ��-0 �C-0 ��-0","A-Int �Z-1 ��-0 �C-0 ��-0","A-Def �Z-3 ��-3 �C-3 ��-0","A-Avoid �Z-1 ��-1 �C-0 ��-0",
							"A-Atk �Z-3 ��-3 �C-3 ��-3","A-Matk �Z-3 ��-3 �C-3 ��-3","A-MaxHP �Z-3 ��-3 �C-3 ��-3","A-MaxSP �Z-3 ��-3 �C-3 ��-3",
							"A-Frozen �Z-1 ��-0 �C-0 ��-0","A-ASPD �Z-1 ��-1 �C-1 ��-0","A-Tolerance �Z-1 ��-1 �C-1 ��-0","A-Hit �Z-0 ��-0 �C-1 ��-1",
							"A-Flee �Z-0 ��-0 �C-1 ��-1","A-Mdef �Z-1 ��-1 �C-1 ��-0",
							"S-Atk �Z-0 ��-0 �C-1 ��-0","S-Matk �Z-0 ��-0 �C-1 ��-0","S-Avoid �Z-0 ��-0 �C-1 ��-0",
							"S-MaxHP �Z-0 ��-0 �C-1 ��-0","S-Quick �Z-0 ��-0 �C-1 ��-0","S-Cri �Z-0 ��-0 �C-1 ��-0",
							"Z-Knockback �Z-1 ��-1 �C-1 ��-0","Z-Immortal �Z-1 ��-0 �C-0 ��-0","Z-Killgain �Z-1 ��-1 �C-1 ��-1","Z-Reincarnation �Z-0 ��-0 �C-1 ��-0",
							"Z-NoDispell �Z-1 ��-1 �C-1 ��-0","Z-Clairvoyance �Z-0 ��-0 �C-1 ��-0","Z-CastFixed �Z-1 ��-1 �C-1 ��-1",
							"����̂���߂�"
			)) {
			case 1:
				mes "[E-Fire]";
				mes "�Z�ɉΑ�����t�^����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�����U�����A";
				mes "�Α��������X�^�[��";
				mes "�^����_���[�W + 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-E�͓���̊Z��";
				mes "1�̂ݗ��p�\";
				break;
			case 2:
				mes "[E-WATER]";
				mes "�Z�ɐ�������t�^����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�����U�����A";
				mes "�����������X�^�[��";
				mes "�^����_���[�W + 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-E�͓���̊Z��";
				mes "1�̂ݗ��p�\";
				break;
			case 3:
				mes "[E-Ground]";
				mes "�Z�ɒn������t�^����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�����U�����A";
				mes "�n���������X�^�[��";
				mes "�^����_���[�W + 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-E�͓���̊Z��";
				mes "1�̂ݗ��p�\";
				break;
			case 4:
				mes "[E-Wind]";
				mes "�Z�ɕ�������t�^����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�����U�����A";
				mes "�����������X�^�[��";
				mes "�^����_���[�W + 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-E�͓���̊Z��";
				mes "1�̂ݗ��p�\";
				break;
			case 5:
				mes "[R-Fire]";
				mes "�Α����U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�������U����";
				mes "�󂯂�_���[�W + 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�Α����U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O��";
				mes "^ff00003��^000000���p�\";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00001��^000000���p�\";
				break;
			case 6:
				mes "[R-Water]";
				mes "�������U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�������U����";
				mes "�󂯂�_���[�W + 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�������U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O��";
				mes "^ff00003��^000000���p�\";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00001��^000000���p�\";
				break;
			case 7:
				mes "[R-Ground]";
				mes "�n�����U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�Α����U����";
				mes "�󂯂�_���[�W + 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�n�����U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O��";
				mes "^ff00003��^000000���p�\";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00001��^000000���p�\";
				break;
			case 8:
				mes "[R-Wind]";
				mes "�������U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�n�����U����";
				mes "�󂯂�_���[�W + 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�������U����";
				mes "�󂯂�_���[�W - 25%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O��";
				mes "^ff00003��^000000���p�\";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00001��^000000���p�\";
				break;
			case 9:
				mes "[C-Life]";
				mes "5�b����HP + 50";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "5�b����HP + 50";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "5�b����HP + 150";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "5�b����HP + 1500";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 10:
				mes "[C-Soul]";
				mes "5�b����SP + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "5�b����SP + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "5�b����SP + 3";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "5�b����SP + 25";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 11:
				mes "[C-HPR]";
				mes "HP���R�񕜗� + 20%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "HP���R�񕜗� + 30%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "HP���R�񕜗� + 100%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "HP���R�񕜗� + 350%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 12:
				mes "[C-SPR]";
				mes "SP���R�񕜗� + 2%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "SP���R�񕜗� + 3%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "SP���R�񕜗� + 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "SP���R�񕜗� + 50%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 13:
				mes "[A-Str]";
				mes "������Str��10�オ��x��";
				mes "�ǉ���Atk + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A";
				mes "������Str��10�オ��x��";
				mes "�ǉ���Atk + 2";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A";
				mes "������Str��10�オ��x��";
				mes "�ǉ���Atk + 4";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��9�ȏ�̎��A";
				mes "������Str��10�オ��x��";
				mes "�ǉ���Atk + 8";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "�����U����";
				mes "�^����_���[�W + 3%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���X�[�c��";
				mes "^ff00001��^000000���p�\";
				break;
			case 14:
				mes "[A-Int]";
				mes "������Int��10�オ��x��";
				mes "�ǉ���Matk + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A";
				mes "������Int��10�オ��x��";
				mes "�ǉ���Matk + 2";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A";
				mes "������Int��10�オ��x��";
				mes "�ǉ���Matk + 4";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��9�ȏ�̎��A";
				mes "������Int��10�オ��x��";
				mes "�ǉ���Matk + 8";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "���@�U����";
				mes "�^����_���[�W + 3%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���X�[�c��";
				mes "^ff00001��^000000���p�\";
				break;
			case 15:
				mes "[A-Def]";
				mes "Def + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "Def + 15";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "Def + 30";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "Def + 500";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O��";
				mes "^ff00003��^000000���p�\";
				break;
			case 16:
				mes "[A-Avoid]";
				mes "���S��� + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "���S��� + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "���S��� + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "���S��� + 2";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c��";
				mes "^ff00001��^000000���p�\";
				break;
			case 17:
				mes "[A-Atk]";
				mes "Atk + 3";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "Atk + 4";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "Atk + 8";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "Atk + 15";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 18:
				mes "[A-Matk]";
				mes "Matk + 3";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "Matk + 4";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "Matk + 8";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "Matk + 15";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 19:
				mes "[A-MaxHP]";
				mes "MaxHP + 200";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "MaxHP + 300";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "MaxHP + 1000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "MaxHP + 7500";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 20:
				mes "[A-MaxSP]";
				mes "MaxSP + 20";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "MaxSP + 30";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "MaxSP + 100";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "MaxSP + 150";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00003��^000000���p�\";
				break;
			case 21:
				mes "[A-Frozen]";
				mes "��΂ɓ�����ԂɂȂ�Ȃ�";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "MaxHP + 1000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���X�[�c��";
				mes "^ff00001��^000000���p�\";
				break;
			case 22:
				mes "[A-ASPD]";
				mes "Aspd + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "Aspd + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O��";
				mes "^ff00001��^000000���p�\";
				break;
			case 23:
				mes "[A-Tolerance]";
				mes "�l�ԁE���`�����X�^�[����";
				mes "�󂯂�_���[�W - 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��3�オ��x�ɒǉ���";
				mes "�l�ԁE���`�����X�^�[����";
				mes "�󂯂�_���[�W - 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��1�オ��x�ɒǉ���";
				mes "�l�ԁE���`�����X�^�[����";
				mes "�󂯂�_���[�W - 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O��";
				mes "^ff00001��^000000���p�\";
				break;
			case 24:
				mes "[A-Hit]";
				mes "Hit + 20";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "Hit + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "Hit + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��9�ȏ�̎��A�ǉ���";
				mes "Hit + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��3�オ��x�ɒǉ���";
				mes "Hit + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00001��^000000���p�\";
				break;
			case 25:
				mes "[A-Flee]";
				mes "Flee + 20";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "Flee + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "Flee + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��9�ȏ�̎��A�ǉ���";
				mes "Flee + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��3�オ��x�ɒǉ���";
				mes "Flee + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I�����b�O�A";
				mes "�G�N�Z���I���V�[���h��";
				mes "^ff00001��^000000���p�\";
				break;
			case 26:
				mes "[A-Mdef]";
				mes "Mdef + 2";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��6�ȏ�̎��A�ǉ���";
				mes "Mdef + 4";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "Mdef + 8";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A�ǉ���";
				mes "Mdef + 20";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�G�N�Z���I���E�B���O�A";
				mes "�G�N�Z���I���X�[�c�A";
				mes "�G�N�Z���I�����b�O��";
				mes "^ff00001��^000000���p�\";
				break;
			case 27:
				mes "[S-Atk]";
				mes "Atk + 50";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "�����U���������A";
				mes "���m����3�b�ԁA";
				mes "Atk + 150";
				mes "���B�l��8�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "���B�l��9�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "�U�����x + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-S�͓���̌C��";
				mes "1�̂ݗ��p�\";
				break;
			case 28:
				mes "[S-Matk]";
				mes "Matk + 100";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "���@�U���������A";
				mes "���m����3�b�ԁA";
				mes "Matk + 150";
				mes "���B�l��8�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "���B�l��9�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "�U�����x + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-S�͓���̌C��";
				mes "1�̂ݗ��p�\";
				break;
			case 29:
				mes "[S-Avoid]";
				mes "���S��� + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "�����U���������A";
				mes "���m����3�b�ԁA";
				mes "���S��� + 100";
				mes "���B�l��8�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "���B�l��9�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "�U�����x + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-S�͓���̌C��";
				mes "1�̂ݗ��p�\";
				break;
			case 30:
				mes "[S-MaxHP]";
				mes "MaxHP + 2500";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "�����U���������A";
				mes "���m����";
				mes "HP + 7500";
				mes "3�b�ԁAMaxHP + 7500";
				mes "���B�l��8�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "���B�l��9�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "�U�����x + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-S�͓���̌C��";
				mes "1�̂ݗ��p�\";
				break;
			case 31:
				mes "[S-Quick]";
				mes "�r������ - 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "���@�U���������A";
				mes "���m����3�b�ԁA";
				mes "�r������ - 100%";
				mes "�X�L���f�B���C - 100%";
				mes "���B�l��8�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "���B�l��9�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "�U�����x + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-S�͓���̌C��";
				mes "1�̂ݗ��p�\";
				break;
			case 32:
				mes "[S-Cri]";
				mes "Cri + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "�����U���������A";
				mes "���m����3�b�ԁA";
				mes "Cri + 100";
				mes "���B�l��8�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "���B�l��9�ȏ�̎��A";
				mes "���������㏸";
				mes "���ʎ��Ԃ�1�b����";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "�U�����x + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-S�͓���̌C��";
				mes "1�̂ݗ��p�\";
				break;
			case 33:
				mes "[Z-Knockback]";
				mes "��΂Ƀm�b�N�o�b�N���Ȃ�";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "MaxHP + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-Z�͓���̑�����";
				mes "1�̂ݗ��p�\";
				continue;
			case 34:
				mes "[Z-Immortal]";
				mes "��΂ɉ��Ȃ�";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "MaxHP + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-Z�͓���̑�����";
				mes "1�̂ݗ��p�\";
				continue;
			case 35:
				mes "[Z-Killgain]";
				mes "�����U���Ń����X�^�[��";
				mes "�|�������ASP + 2";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "�����U���Ń����X�^�[��";
				mes "�|�������ASP + 3";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��8�ȏ�̎��A�ǉ���";
				mes "�����U���Ń����X�^�[��";
				mes "�|�������ASP + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���B�l��9�ȏ�̎��A�ǉ���";
				mes "�����U���Ń����X�^�[��";
				mes "�|�������ASP + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "MaxHP + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-Z�͓���̑�����";
				mes "1�̂ݗ��p�\";
				continue;
			case 36:
				mes "[Z-Reincarnation]";
				mes "�퓬�s�\���畜�����A";
				mes "HP�ESP��100%�񕜂���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "MaxHP + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-Z�͓���̑�����";
				mes "1�̂ݗ��p�\";
				continue;
			case 37:
				mes "[Z-NoDispell]";
				mes "�r�������f����Ȃ�";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "MaxHP + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-Z�͓���̑�����";
				mes "1�̂ݗ��p�\";
				continue;
			case 38:
				mes "[Z-Clairvoyance]";
				mes "[�n�C�f�B���O]��";
				mes "[�N���[�L���O]�����Ă���";
				mes "�����X�^�[��������";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "MaxHP + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-Z�͓���̑�����";
				mes "1�̂ݗ��p�\";
				continue;
			case 39:
				mes "[Z-CastFixed]";
				mes "�Œ�r������ - 50%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���ɑ������A";
				mes "[���C�I�b�g�`�b�v]��";
				mes "���B�l��2�オ��x�ɒǉ���";
				mes "MaxHP + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "Type-Z�͓���̑�����";
				mes "1�̂ݗ��p�\";
				continue;
			case 40:
				mes "[MARS_01]";
				mes "�I�����܂��B";
				mes "�����p���肪�Ƃ��������܂����B";
				close;
			}
		}
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		mes "[MARS_01]";
		mes "�I�����܂��B";
		mes "�����p���肪�Ƃ��������܂����B";
		close;
	}
	mes "[MARS_01]";
	mes "�G���[�ł��B";
	mes "�������̖h�";
	mes "�Ώۑ����ł͂���܂���B";
	next;
	mes "[MARS_01]";
	mes "�G�N�Z���I���E�B���O";
	mes "�G�N�Z���I���X�[�c";
	mes "�G�N�Z���I�����b�O";
	mes "�����ꂩ�̂݋������\�ł��B";
	close;
OnInit:
	waitingroom "�G���`�����g",0;
	end;
}
verus04.gat,197,179,3	script	�C���^�`���[���X�g��#Me	10053,{/* 59818 (hide)*/}
verus04.gat,197,179,3	script	�C���^�`���[���X�g��#Me	10053,{/* 61465 */
	if(countitem(25785) < 1) {
		cutin "dalle01",2;
		mes "[�C���^�`���[���X�g��]";
		mes "�ǂ��Ŏ�ɓ��邩�͂킩��܂��񂪁c�c";
		next;
		mes "[�C���^�`���[���X�g��]";
		mes "�ł����L���}�̂���肵����";
		mes "�����Ă��Ă��������B";
		mes "�C������^ff0000��L�����u[1]^000000��";
		mes "�������܂���B";
		close2;
		cutin "dalle01",255;
		end;
	}
	cutin "dalle01",2;
	mes "[�C���^�`���[���X�g��]";
	mes "����͏ł����L���}�̂ł��ˁB";
	mes "������낵�����";
	mes "�C������^ff0000��L�����u[1]^000000��";
	mes "�������܂���B";
	next;
	mes "[�C���^�`���[���X�g��]";
	mes "��������������m�E�n�E��";
	mes "�W�񂵂Ċ���������";
	mes "�����p�[�c�ł��B";
	mes "�ƂĂ��悢�i�ł���B";
	while(1) {
		next;
		switch(select("�C������","��L�����u[1]�ɂ��ĕ���","��߂�")) {
		case 1:
			break;
		case 2:
			mes "[�C���^�`���[���X�g��]";
			mes "^ff0000��L�����u[1]^000000�̏ڍׂ�";
			mes "�ȉ��̒ʂ�ł��B";
			next;
			mes "[��L�����u[1]]";
			mes "Int + 3,Dex + 3";
			mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
			mes "[���F�X�p�[�w�b�h�M�A]��";
			mes "���ɑ������A�ǉ���";
			mes "�r������ - 20%";
			mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
			mes "^FF0000[��L�����u]��";
			mes "NPC���p�E�q�ɂւ̈ړ��̂�";
			mes "�\�ł�^000000";
			mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
			mes "�n�� : ^777777�A�N�Z�T���[^000000";
			mes "�ʒu : ^777777-^000000";
			mes "���� : ^777777-^000000 �X���b�g : ^7777771^000000";
			mes "Def : ^7777770^000000 Mdef : ^7777770^000000";
			mes "���B : ^777777�s��^000000 �j�� : ^777777���Ȃ�^000000";
			mes "�d�� : ^77777710^000000";
			mes "�v�����x�� : ^777777100^000000";
			mes "���� : ^777777�S�Ă̐E��^000000";
			next;
			mes "[�C���^�`���[���X�g��]";
			mes "���̋L�����u��";
			mes "���ʂȃG���`�����g��";
			mes "�{������Ԃō����グ�܂��B";
			next;
			mes "[�C���^�`���[���X�g��]";
			mes "�G���`�����g��";
			mes "3�i�K�I�Ԏ����o���܂��B";
			mes "���ʂ̕��ʂȕ����獂�����܂�";
			mes "�����̍D���Ȃ悤�ɑI��ł��������B";
			next;
			mes "[�C���^�`���[���X�g��]";
			mes "�������A�ǂ��G���`�����g��";
			mes "�Z�p�͂��K�v�Ȉ�";
			mes "�ǂ����ʂł���ق�";
			mes "�G���`�����g�̐�������������܂��B";
			next;
			mes "[�C���^�`���[���X�g��]";
			mes "���ǂ��L�����u���~�������";
			mes "�ł����L���}�̂��R�W�߂Ă��������ˁB";
			continue;
		case 3:
			mes "[�C���^�`���[���X�g��]";
			mes "�ł͂܂�������܂��傤�B";
			close2;
			cutin "dalle01",255;
			end;
		}
		break;
	}
	mes "[�C���^�`���[���X�g��]";
	mes "��1�G���`�����g�F���I��";
	mes "��2�G���`�����g�F���I��";
	mes "��3�G���`�����g�F���I��";
	mes "�@";
	mes "�܂��͑�1�G���`�����g��I��ł��������I";
	next;
	select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
	mes "[�C���^�`���[���X�g��]";
	mes "�ł͂܂�������܂��傤�B";
	close2;
	cutin "dalle01",255;
	end;
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�FMatk + 3%";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "�S�Ă���g���Ă��o���邩�ǂ����c�c";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "�ł͂܂�������܂��傤�B";
close;
cutin "dalle01",255;
cutin "dalle01",2;
mes "[�C���^�`���[���X�g��]";
mes "����͏ł����L���}�̂ł��ˁB";
mes "������낵�����";
mes "�C������^ff0000��L�����u[1]^000000��";
mes "�������܂���B";
next;
mes "[�C���^�`���[���X�g��]";
mes "��������������m�E�n�E��";
mes "�W�񂵂Ċ���������";
mes "�����p�[�c�ł��B";
mes "�ƂĂ��悢�i�ł���B";
next;
select("�C������:��L�����u[1]�ɂ��ĕ���:��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�F����";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "�S�Ă���g���Ă��o���邩�ǂ����c�c";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
mes "�";
cutin "dalle01",255;
cutin "dalle01",2;
mes "[�C���^�`���[���X�g��]";
mes "����͏ł����L���}�̂ł��ˁB";
mes "������낵�����";
mes "�C������^ff0000��L�����u[1]^000000��";
mes "�������܂���B";
next;
mes "[�C���^�`���[���X�g��]";
mes "��������������m�E�n�E��";
mes "�W�񂵂Ċ���������";
mes "�����p�[�c�ł��B";
mes "�ƂĂ��悢�i�ł���B";
next;
select("�C������:��L�����u[1]�ɂ��ĕ���:��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�F����";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "��Փx�͂��قǍ����Ȃ��ł��ˁB";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "�ł͂܂�������܂��傤�B";
close;
cutin "dalle01",255;
cutin "dalle01",2;
mes "[�C���^�`���[���X�g��]";
mes "����͏ł����L���}�̂ł��ˁB";
mes "������낵�����";
mes "�C������^ff0000��L�����u[1]^000000��";
mes "�������܂���B";
next;
mes "[�C���^�`���[���X�g��]";
mes "��������������m�E�n�E��";
mes "�W�񂵂Ċ���������";
mes "�����p�[�c�ł��B";
mes "�ƂĂ��悢�i�ł���B";
next;
select("�C������:��L�����u[1]�ɂ��ĕ���:��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�F����";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "��Փx���C���������ł��ˁB";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
close;
cutin "dalle01",2;
mes "[�C���^�`���[���X�g��]";
mes "����͏ł����L���}�̂ł��ˁB";
mes "������낵�����";
mes "�C������^ff0000��L�����u[1]^000000��";
mes "�������܂���B";
next;
mes "[�C���^�`���[���X�g��]";
mes "��������������m�E�n�E��";
mes "�W�񂵂Ċ���������";
mes "�����p�[�c�ł��B";
mes "�ƂĂ��悢�i�ł���B";
next;
select("�C������:��L�����u[1]�ɂ��ĕ���:��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�FAtk + 4%";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "��Փx�̍����ɍ��f���Ă��܂��I";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
close;
cutin "dalle01",2;
mes "[�C���^�`���[���X�g��]";
mes "����͏ł����L���}�̂ł��ˁB";
mes "������낵�����";
mes "�C������^ff0000��L�����u[1]^000000��";
mes "�������܂���B";
next;
mes "[�C���^�`���[���X�g��]";
mes "��������������m�E�n�E��";
mes "�W�񂵂Ċ���������";
mes "�����p�[�c�ł��B";
mes "�ƂĂ��悢�i�ł���B";
next;
select("�C������:��L�����u[1]�ɂ��ĕ���:��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����1";
mes "��3�G���`�����g�FMatk + 4%";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "��Փx�̍����ɍ��f���Ă��܂��I";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
close;
cutin "dalle01",2;
mes "[�C���^�`���[���X�g��]";
mes "����͏ł����L���}�̂ł��ˁB";
mes "������낵�����";
mes "�C������^ff0000��L�����u[1]^000000��";
mes "�������܂���B";
next;
mes "[�C���^�`���[���X�g��]";
mes "��������������m�E�n�E��";
mes "�W�񂵂Ċ���������";
mes "�����p�[�c�ł��B";
mes "�ƂĂ��悢�i�ł���B";
next;
select("�C������:��L�����u[1]�ɂ��ĕ���:��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�FMatk + 4%";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "��Փx�̍����ɍ��f���Ă��܂��I";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "����ȏ�A�C�e����";
mes "���ĂȂ��悤�ł��B";
mes "�A�C�e���̎�ސ���";
mes "���炵�Ă��Ă��������B";
close;
cutin "dalle01",255;
delitem 7034,1;
cutin "dalle01",2;
mes "[�C���^�`���[���X�g��]";
mes "����͏ł����L���}�̂ł��ˁB";
mes "������낵�����";
mes "�C������^ff0000��L�����u[1]^000000��";
mes "�������܂���B";
next;
mes "[�C���^�`���[���X�g��]";
mes "��������������m�E�n�E��";
mes "�W�񂵂Ċ���������";
mes "�����p�[�c�ł��B";
mes "�ƂĂ��悢�i�ł���B";
next;
select("�C������:��L�����u[1]�ɂ��ĕ���:��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F���I��";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�܂��͑�1�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:�吹��1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F���I��";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "���ɑ�2�G���`�����g��I��ł��������I";
next;
select("���u1:��s1:�s��1:����1:��i��1:���|1:�U�����x1:Mdef + 3:���u2:��s2:�s��2:����2:��i��2:���|2:�U�����x2:Mdef + 5:����1:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�F���I��";
mes "�@";
mes "�Ō�ɑ�3�G���`�����g��I��ł��������I";
next;
select("Atk1:Atk 2:Atk 3:Atk + 4%:Matk + 1%:Matk + 2%:Matk + 3%:Matk + 4%:�������Ȃ�:����ς��߂�")
mes "[�C���^�`���[���X�g��]";
mes "��1�G���`�����g�F����1";
mes "��2�G���`�����g�F����2";
mes "��3�G���`�����g�FMatk + 4%";
mes "�@";
mes "����͂����ł��ˁc�c";
mes "��Փx�̍����ɍ��f���Ă��܂��I";
next;
mes "[�C���^�`���[���X�g��]";
mes "�ł͂��̓��e�ŏC�����������܂��B";
mes "�����͂�낵���ł����H";
next;
select("�͂�:����ς��߂�")
delitem 25785,1;
misceffect 170,"";
mes "[�C���^�`���[���X�g��]";
mes "���s���܂����c�c";
mes "�\���󂠂�܂���ł����B";
mes "����������ɓ��ꂽ��܂�";
mes "���炵�Ă��������B";
close;
cutin "dalle01",255;
}

verus04.gat,133,237,3	script	�N���t�g#New_Cart	851,{/* 59581 */
	if(getbaseclass(Class) != CLASS_MC) {
		mes "[�N���t�g]";
		mes "�J���J���J�[���B";
		mes "�������������āc�c";
		mes "�����������āc�c�f���炵���I";
		mes "�@";
		mes "�]�J�[�g�̏���t����";
		mes "�@�����Ȓj��������]";
		next;
		mes "�]�}�[�`�����g�n�E�Ƃ̂�";
		mes "�@�i�s�\�ȃN�G�X�g�ł��]";
		close;
	}
	if(CARTDECO_1QUE == 0) {
		mes "[�N���t�g]";
		mes "�J���A�J���A�J�[��";
		mes "�@";
		mes "�c�c�_�����_�����I";
		mes "���ꂶ�Ⴀ�|������";
		mes "���炩�Ȋۂ݂��Č��o���ĂȂ�!!";
		next;
		mes "�]�M�S�ɃJ�[�g���������Ă���";
		mes "�@�N������]";
		next;
		mes "[�N���t�g]";
		mes "����A�����p�����H";
		mes "��!?�@�N�c�c���������āH";
		mes "�N�����i�J�[�g�𗘗p����̂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�N���t�g]";
			mes "�ł��J�[�g����肭��������";
			mes "�o���邾�낤�H";
			next;
		}
		mes "[�N���t�g]";
		mes "���͍��A�V�����J�[�g�̃f�U�C����";
		mes "�͍����Ă��鏊�Ȃ񂾁B";
		mes "3��ނقǍl���Ă��Ă��B";
		mes "�~�X�g�P�[�X�̂悤�ȁA";
		mes "���^�̃J�[�g�̃C���[�W��";
		mes "�o���Ă���񂾂�B";
		next;
		mes "[�N���t�g]";
		mes "���2�قǁA�|���������ɂ���";
		mes "�J�[�g���l���Ă��ĂˁB";
		mes "�\�z�͖w�Ǐo���オ���Ă���񂾂���";
		mes "�ǂ��ɂ����ߎ�ɂ����Ă��ĂˁB";
		mes "���ꂾ�I";
		mes "�Ƃ������̂��o���Ȃ��񂾁B";
		next;
		mes "[�N���t�g]";
		mes "�ꉞ�A�C���[�W��͂ވׂ�";
		mes "���@�͊��ɍl���Ă���񂾁B";
		next;
		mes "[�N���t�g]";
		mes "�Ƃ͂����l�̓J�[�g�̉��C�̕���";
		mes "�W������������ˁB";
		next;
		mes "[�N���t�g]";
		mes "�N���c�c�ɂ�������ˁc�c�H";
		mes "�悩������l�ׂ̈�";
		mes "�ЂƔ��E���ł���Ȃ����ȁB";
		next;
		mes "[�N���t�g]";
		mes "�ܘ_�A���܂����������������ɂ�";
		mes "�N�̃J�[�g���������Ă����邩�炳�B";
		mes "���ނ�I";
		next;
		if(select("��`��","��`��Ȃ�") == 2) {
			mes "[�N���t�g]";
			mes "�������B���������B";
			mes "�܂��A�C���ς������";
			mes "���ł����Ă����B";
			mes "�V�����J�[�g����ɓ��ꂽ��";
			mes "�����ƋC�����u�����Ǝv����I";
			close;
		}
		mes "[�N���t�g]";
		mes "�{������!?";
		mes "���肪�Ƃ�!!";
		mes "���ꂶ�Ⴀ�����猾�����̂���";
		mes "�ǂꂩ1��B������";
		mes "�l�ɕ񍐂��Ă���Ȃ����ȁB";
		setquest 96440;
		setquest 96442;
		setquest 118410;
		next;
		mes "�]^ff0000�G���W�F�����O��3�C�|��^000000�]";
		mes "�]^ff0000�|������3000�C�|��^000000�]";
		mes "�]^ff0000�ׂƂׂƂ���t�̂�3000�p�ӂ���^000000�]";
		next;
		mes "[�N���t�g]";
		mes "�����悩������";
		mes "���ꂼ��Ɋւ���";
		mes "�l�̍\�z�����������H";
		next;
		if(select("����","�����Ȃ�") == 2) {
			mes "[�N���t�g]";
			mes "���������B";
			mes "���ꂶ�Ⴀ�ǂ�ł������̂�";
			mes "�B�������痈�Ă����ȁI";
			close;
		}
		//TODO
	}
	else if(CARTDECO_1QUE == 1) {
		mes "[�N���t�g]";
		mes "�₟�A�N�����B";
		mes "�l�̂��肢��";
		mes "�B�����Ă��Ă��ꂽ�̂��ȁB";
		mes "����Ƃ������ʂ̗p�H";
		next;
		switch(select("�G���W�F�����O��3�C�|����","�|������3000�C�|����","�ׂƂׂƂ���t�̂�3000�����Ă���","�\�z�𕷂�����","�b����߂�")) {
		case 1:
			mes "[�N���t�g]";
			mes "^ff0000�G���W�F�����O^000000��^ff00003�C^000000";
			mes "�|���ė��ė~�����񂾁B";
			mes "�܂��I����ĂȂ��݂������ˁB";
			mes "�@";
			mes "�l����̈˗����ǂꂩ1�ł�";
			mes "�B��������񍐂ɗ��Ă���I";
			close;
		case 2:
			mes "[�N���t�g]";
			mes "^ff0000�|����^000000��^ff00003000�C^000000";
			mes "�|���ė��ė~�����񂾁B";
			mes "�܂��I����ĂȂ��݂������ˁB";
			mes "�@";
			mes "�l����̈˗����ǂꂩ1�ł�";
			mes "�B��������񍐂ɗ��Ă���I";
			close;
		case 3:
			mes "[�N���t�g]";
			mes "^ff0000�ׂƂׂƂ���t��^000000��^ff00003000��^000000";
			mes "�p�ӂ��ė��ė~�����񂾁B";
			mes "�܂��I����ĂȂ��݂������ˁB";
			mes "�@";
			mes "�l����̈˗����ǂꂩ1�ł�";
			mes "�B��������񍐂ɗ��Ă���I";
			close;
		case 4:
			break;
		case 5:
			mes "[�N���t�g]";
			mes "���������B";
			mes "���ꂶ�Ⴀ�ǂ�ł������̂�";
			mes "�B�������痈�Ă����ȁI";
			close;
		}
		mes "[�N���t�g]";
		mes "OK�킩�����B";
		mes "���ꂶ�Ⴀ�l�̍\�z�𕷂������B";
		while(1) {
			next;
			mes "[�N���t�g]";
			mes "�ǂ�ɂ��ĕ����񂾂��H";
			next;
			switch(select("�G���W�F�����O��3�C�|��","�|������3000�C�|��","�ׂƂׂƂ���t�̂�3000�p�ӂ���","��b����߂�")) {
			case 1:
				mes "[�N���t�g]";
				mes "^ff0000�G���W�F�����O^000000��^ff00003�C^000000";
				mes "�|���ė��ė~�����񂾁B";
				next;
				mes "[�N���t�g]";
				mes "�|�����ł���G���W�F���ł�����B";
				mes "���̔������Ȑ�����";
				mes "�V�g�̂悤�ȋC������";
				mes "�����ɍČ������J�[�g����肽���񂾁B";
				mes "3�C�قǓ|���ė�����";
				mes "�������ڂ����������Ă���邩�ȁB";
				continue;
			case 2:
				mes "[�N���t�g]";
				mes "^ff0000�|����^000000��^ff00003000�C^000000";
				mes "�|���ė��ė~�����񂾁B";
				next;
				mes "[�N���t�g]";
				mes "�ύډ\�ȏd�ʂ͂��̂܂܂�";
				mes "�J�[�g�ɐF�Ƃ�ǂ�̃|������";
				mes "�U��΂߂����񂾁I";
				mes "�@";
				mes "���̂��߂ɂ͂ǂ������炢�����H";
				next;
				mes "[�N���t�g]";
				mes "�����c�c���͂܂��킩��Ȃ��B";
				mes "�@";
				mes "�ł��c�c�I";
				mes "�N���|������3000�C�ق�";
				mes "�|���ė��Ă���������";
				mes "���̓������킩��C������񂾁B";
				continue;
			case 3:
				mes "[�N���t�g]";
				mes "^ff0000�ׂƂׂƂ���t��^000000��^ff00003000��^000000";
				mes "�p�ӂ��ė��ė~�����񂾁B";
				next;
				mes "[�N���t�g]";
				mes "�|�����ƌ����Ή������H";
				mes "�@";
				mes "�[���s�[�H�@�󂫕r�H";
				mes "������c�c";
				next;
				mes "[�N���t�g]";
				mes "�ׂƂׂƂ���t�̂��I";
				mes "�����ɂ����A";
				mes "���̂Ղ��Ղ��̎�����";
				mes "����������錍���l�܂��Ă����";
				mes "�l�͍l���Ă���񂾁B";
				next;
				mes "[�N���t�g]";
				mes "3000�͑�������H";
				mes "�Ȃ��ɌN��������Ƃ������l���낤�B";
				mes "���̈ʂ̐��A";
				mes "�r�̗����l�Ȃ炠���Ƃ����Ԃ���B";
				mes "�܂�����������邵�W�ߕ��͎��R���B";
				mes "���v�B�N�Ȃ�o����B";
				continue;
			case 4:
				mes "[�N���t�g]";
				mes "���ꂶ�Ⴀ���񂾂�I";
				close;
			}
		}
	}
OnInit:
	waitingroom "�J�[�g�f�R���[�V����",0;
	end;
}
verus04.gat,149,231,4	script	�E�F���X������#dayhunt	402,{/* 59582 */
	if(!checkquest(118451)) {
		mes "[�E�F���X������]";
		mes "�͂��c�c�B";
		mes "�ǂ��������̂��c�c�B";
		mes "�������Ȃ��B";
		next;
		menu "�ǂ������܂������H",-;
		mes "[�E�F���X������]";
		mes "���͍��������������Ăˁc�c�B";
		mes "���āA���������ČN��";
		mes "�`���҂ł͂Ȃ����ȁH";
		next;
		mes "[�E�F���X������]";
		mes "����Ȃ炿�傤�ǂ����I";
		mes "������`���ė~�����񂾂�";
		mes "���肢�ł��邩�ȁH";
		next;
		if(select("�����ł���","���f�肵�܂�") == 2) {
			mes "[�E�F���X������]";
			mes "�������c�c�������Ȃ��B";
			mes "����A�����񂾁B";
			mes "�������߂Ĉ��������B";
			mes "�͂��c�c�B";
			close;
		}
		mes "[�E�F���X������]";
		mes "�{������!?";
		mes "���₠�A�������I";
		next;
		mes "[�E�F���X������]";
		mes "���͂��̕ӂ�ɏo������";
		mes "�@�B�␶�����������Ă���";
		mes "�������Ȃ񂾁B";
		next;
		mes "[�E�F���X������]";
		mes "�������A���̕ӂ�͂ƂĂ��댯�łˁB";
		mes "���ł͓����邱�Ƃ����ł��Ȃ��񂾁B";
		next;
		mes "[�E�F���X������]";
		mes "�����ŁI";
		mes "�`���҂̌N�ɂ�";
		mes "���̑����";
		mes "�������s���ĖႢ�����B";
		next;
		mes "[�E�F���X������]";
		mes "�ȂɁA������͂Ȃ����B";
		mes "���������ΏۂƐ����";
		mes "���̎��̗l�q��";
		mes "�񍐂��Ă����΂����B";
		next;
		mes "[�E�F���X������]";
		mes "����ƁA��`���Ă���鎞�ɂ�";
		mes "���ɐ��������Ă���B";
		mes "��낵�����ނ��B";
		setquest 118451;
		compquest 118451;
		close;
	}
	mes "[�E�F���X������]";
	mes "�₠�B";
	mes "�����̎�`�������Ă����̂����H";
	next;
	if(select("�˗����󒍁E�񍐂���","��߂Ă���") == 2) {
		mes "[�E�F���X������]";
		mes "���A�������B";
		mes "��`���Ă���鎞�ɂ�";
		mes "���ɐ��������Ă���B";
		mes "��낵�����ނ��B";
		close;
	}
	mes "[�E�F���X������]";
	mes "�����A����͂��肪�����B";
	mes "���āc�c�B";
	mes "�N�̈˗��󋵂͂��̒ʂ肾���A";
	mes "�ǂ�����񂾂��H";
	set '@str1$,"^0000FF�󒍉\^000000";
	set '@str2$,"^0000FF�󒍉\^000000";
	set '@str3$,"^0000FF�󒍉\^000000";
	if(checkquest(96445)) {
		if(checkquest(96445) & 0x4)
			set '@str1$,"^FF0000��V�󂯎��\^000000";
		else
			set '@str1$,"^FF0000�󒍒�^000000";
	}
	if(checkquest(96447)) {
		if(checkquest(96447) & 0x4)
			set '@str2$,"^FF0000��V�󂯎��\^000000";
		else
			set '@str2$,"^FF0000�󒍒�^000000";
	}
	if(checkquest(96449)) {
		if(checkquest(96449) & 0x4)
			set '@str2$,"^FF0000��V�󂯎��\^000000";
		else
			set '@str2$,"^FF0000�󒍒�^000000";
	}
	next;
	switch(select("�C���^�E�F���X�M�A�����@^0000FF�󒍉\^000000","�T���^�E�F���X�M�A�U�����@^0000FF�󒍉\^000000","�C���^�E�F���X�M�A�U�����@^0000FF�󒍉\^000000")) {
	case 1:
		if(checkquest(96445)) {
			mes "[�E�F���X������]";
			mes "�ӂށc�c�B";
			mes "�C���^�E�F���X�M�A�ɂ���";
			mes "�������̂悤���ȁB";
			next;
			mes "[�E�F���X������]";
			mes "�����Ȃ�ƁA�N�ɂ́B";
			mes "^ff0000�C���^�E�F���X�M�A^000000��";
			mes "^ff0000300�C^000000�قǓ|���ė��ė~�����B";
			mes "�����������肢�ł��邩�H";
			next;
			if(select("�킩��܂���","�˗�����߂���") == 1) {
				mes "[�E�F���X������]";
				mes "���܂Ȃ��ȁB";
				mes "����������낵�����ނ��B";
				close;
			}
			mes "[�E�F���X������]";
			mes "�˗�����߂����H";
			mes "��߂����˗���";
			mes "^ff0000�C���^�E�F���X�M�A^000000��";
			mes "^ff0000300�C^000000�قǓ|��";
			mes "�˗��ŊԈႢ�Ȃ����H";
			next;
			if(select("�ԈႢ����܂���","����ς葱���܂�") == 2) {
				mes "[�E�F���X������]";
				mes "�����A�{�����H";
				mes "���܂Ȃ��ȁB";
				mes "����������낵�����ނ��B";
				close;
			}
			mes "[�E�F���X������]";
			mes "���A�������B";
			mes "�N�ɂ��s�������邩��ȁB";
			mes "�������A�܂����Ԃ������";
			mes "���ł���`���ɗ��Ăق����B";
			delquest 96445;
			close;
		}
		mes "[�E�F���X������]";
		mes "�Ȃ�قǁc�c�B";
		mes "�C���^�E�F���X�M�A�ɂ���";
		mes "���ׂė��Ă����񂾂ȁB";
		next;
		mes "[�E�F���X������]";
		mes "�����Ȃ�ƁA�N�ɂ́B";
		mes "^ff0000�C���^�E�F���X�M�A^000000��";
		mes "^ff0000300�C^000000�قǓ|���ė��ė~�����B";
		next;
		mes "[�E�F���X������]";
		mes "�B�����Ă��ꂽ���V�Ƃ���";
		mes "�Âт��R���^���N5����낤�B";
		mes "���肢�ł��邩�H";
		next;
		if(select("�˗����󂯂�","��߂Ă���") == 2) {
			mes "[�E�F���X������]";
			mes "���A�������B";
			mes "��`���Ă���鎞�ɂ�";
			mes "���ɐ��������Ă���B";
			mes "��낵�����ނ��B";
			close;
		}
		mes "[�E�F���X������]";
		mes "�����I�@�󂯂Ă���邩�I";
		mes "��낵�����ނ��B";
		setquest 96445;
		close;
	case 2:
		if(checkquest(96447)) {
			mes "[�E�F���X������]";
			mes "�ӂށc�c�B";
			mes "�T���^�E�F���X�M�A�U�ɂ���";
			mes "�������̂悤���ȁB";
			next;
			mes "[�E�F���X������]";
			mes "�����Ȃ�ƁA�N�ɂ́B";
			mes "^ff0000�T���^�E�F���X�M�A�U^000000��";
			mes "^ff0000200�C^000000�قǓ|���ė��ė~�����B";
			mes "�����������肢�ł��邩�H";
			next;
			if(select("�킩��܂���","�˗�����߂���") == 1) {
				mes "[�E�F���X������]";
				mes "���܂Ȃ��ȁB";
				mes "����������낵�����ނ��B";
				close;
			}
			mes "[�E�F���X������]";
			mes "�˗�����߂����H";
			mes "��߂����˗���";
			mes "^ff0000�T���^�E�F���X�M�A�U^000000��";
			mes "^ff0000200�C^000000�قǓ|��";
			mes "�˗��ŊԈႢ�Ȃ����H";
			next;
			if(select("�ԈႢ����܂���","����ς葱���܂�") == 2) {
				mes "[�E�F���X������]";
				mes "�����A�{�����H";
				mes "���܂Ȃ��ȁB";
				mes "����������낵�����ނ��B";
				close;
			}
			mes "[�E�F���X������]";
			mes "���A�������B";
			mes "�N�ɂ��s�������邩��ȁB";
			mes "�������A�܂����Ԃ������";
			mes "���ł���`���ɗ��Ăق����B";
			delquest 96447;
			close;
		}
		mes "[�E�F���X������]";
		mes "�Ȃ�قǁc�c�B";
		mes "�T���^�E�F���X�M�A�U�ɂ���";
		mes "���ׂė��Ă����񂾂ȁB";
		next;
		mes "[�E�F���X������]";
		mes "�����Ȃ�ƁA�N�ɂ́B";
		mes "^ff0000�T���^�E�F���X�M�A�U^000000��";
		mes "^ff0000200�C^000000�قǓ|���ė��ė~�����B";
		next;
		mes "[�E�F���X������]";
		mes "�B�����Ă��ꂽ���V�Ƃ���";
		mes "�Âт��R���^���N2���Âт��S��5��";
		mes "�ǂ��炩��낤�B";
		mes "���܂Ȃ����A�ǂ����n������";
		mes "���Ɍ��߂����Ă���B";
		mes "���肢�ł��邩�H";
		next;
		if(select("�˗����󂯂�","��߂Ă���") == 2) {
			mes "[�E�F���X������]";
			mes "���A�������B";
			mes "��`���Ă���鎞�ɂ�";
			mes "���ɐ��������Ă���B";
			mes "��낵�����ނ��B";
			close;
		}
		mes "[�E�F���X������]";
		mes "�����I�@�󂯂Ă���邩�I";
		mes "��낵�����ނ��B";
		setquest 96447;
		close;
	case 3:
		if(checkquest(96449)) {
			mes "[�E�F���X������]";
			mes "�ӂށc�c�B";
			mes "�C���^�E�F���X�M�A�U�ɂ���";
			mes "�������̂悤���ȁB";
			next;
			mes "[�E�F���X������]";
			mes "�����Ȃ�ƁA�N�ɂ́B";
			mes "^ff0000�C���^�E�F���X�M�A�U^000000��";
			mes "^ff0000200�C^000000�قǓ|���ė��ė~�����B";
			mes "�����������肢�ł��邩�H";
			next;
			if(select("�킩��܂���","�˗�����߂���") == 1) {
				mes "[�E�F���X������]";
				mes "���܂Ȃ��ȁB";
				mes "����������낵�����ނ��B";
				close;
			}
			mes "[�E�F���X������]";
			mes "�˗�����߂����H";
			mes "��߂����˗���";
			mes "^ff0000�C���^�E�F���X�M�A�U^000000��";
			mes "^ff0000200�C^000000�قǓ|��";
			mes "�˗��ŊԈႢ�Ȃ����H";
			next;
			if(select("�ԈႢ����܂���","����ς葱���܂�") == 2) {
				mes "[�E�F���X������]";
				mes "�����A�{�����H";
				mes "���܂Ȃ��ȁB";
				mes "����������낵�����ނ��B";
				close;
			}
			mes "[�E�F���X������]";
			mes "���A�������B";
			mes "�N�ɂ��s�������邩��ȁB";
			mes "�������A�܂����Ԃ������";
			mes "���ł���`���ɗ��Ăق����B";
			delquest 96449;
			close;
		}
		mes "[�E�F���X������]";
		mes "�Ȃ�قǁc�c�B";
		mes "�C���^�E�F���X�M�A�U�ɂ���";
		mes "���ׂė��Ă����񂾂ȁB";
		next;
		mes "[�E�F���X������]";
		mes "�����Ȃ�ƁA�N�ɂ́B";
		mes "^ff0000�C���^�E�F���X�M�A�U^000000��";
		mes "^ff0000200�C^000000�قǓ|���ė��ė~�����B";
		next;
		mes "[�E�F���X������]";
		mes "�B�����Ă��ꂽ���V�Ƃ���";
		mes "�Âт��R���^���N2���Âт��S��5��";
		mes "�ǂ��炩��낤�B";
		mes "���܂Ȃ����A�ǂ����n������";
		mes "���Ɍ��߂����Ă���B";
		mes "���肢�ł��邩�H";
		next;
		if(select("�˗����󂯂�","��߂Ă���") == 2) {
			mes "[�E�F���X������]";
			mes "���A�������B";
			mes "��`���Ă���鎞�ɂ�";
			mes "���ɐ��������Ă���B";
			mes "��낵�����ނ��B";
			close;
		}
		mes "[�E�F���X������]";
		mes "�����I�@�󂯂Ă���邩�I";
		mes "��낵�����ނ��B";
		setquest 96449;
		close;
	}
OnInit:
	waitingroom "�����N�G�X�g",0;
	end;
}

//====================================================================
// 2���ځ@�����𐶂��邽�߂̒���
//====================================================================
/* ���R�[�h2���� -> un_bk_q 98 143 */
un_bk_q.gat,103,147,4	script	���@�m�N�T�C�q��#EP15.2	750,{/* 61061 */
	switch(VER_6QUE) {
	case 0:
		emotion 46, "���@�m�N�T�C�q��#EP15.2";
		mes "[���@�m�N�T�C�q��]";
		mes "�ӂ����c�c�B";
		mes "�v���o�������ł������Ƃ���B";
		mes "���̃V�F���^�[�ɓ����";
		mes "�{���ɗǂ������c�c�B";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�����A���̏u�ԁA";
		mes "�O��������c�c";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�c�c�c�c�B";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�N�Ǝ��͉^���ǂ������B";
		mes "�����v��Ȃ������H";
		next;
		menu "�������Ǝv��",-;
		emotion 28, "���@�m�N�T�C�q��#EP15.2";
		mes "[���@�m�N�T�C�q��]";
		mes "�����𐶂��鎖���ł���̂�";
		mes "���ӂ��Ȃ��ƁA�ˁB";
		mes "�������c�c�݂�Ȃ�";
		mes "�N���������̐ӔC���A��l��";
		mes "���킹�悤�Ƃ��Ă���݂����Ȃ񂾁B";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�������܂�Ń��[�A";
		mes "�ޏ��̐ӔC���ƌ����悤��";
		mes "�ӂߗ��ĂĂ���񂾁B";
		next;
		menu "���[�H",-;
		emotion 1,"";
		mes "[���@�m�N�T�C�q��]";
		mes "�ޏ��A���[�E�x���[�j��";
		mes "���̔������N������������";
		mes "�w���������Ă����l�Ȃ񂾁B";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�m���Ɏ����͎��s���Ă��܂������ǁA";
		mes "�ޏ������̐ӔC����Ȃ��Ǝv���񂾁B";
		mes "����ɁA���̍Q���������󋵂�";
		mes "�����҂̐l����c�����悤�Ƃ��Ă���B";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "���̏󋵂������ł��Ȃ�Ƃ����悤�ƁA";
		mes "�K���ɍl���Ă���Ă���񂾂낤�B";
		mes "����������A";
		mes "�ǂ�����΂����̂�������Ȃ��Ȃ���";
		mes "�r���ɕ��Ă��邾�낤�ˁB";
		mes "�ޏ��͂�������B";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�ǂ����悤�A";
		mes "���Ȃ񂩂ł����͂ł��邱�Ƃ͂��邩�ȁB";
		mes "���������Ă݂悤�Ǝv���񂾂��ǁA";
		mes "�N���ꏏ�ɔޏ�����`��Ȃ������H";
		next;
		menu "��`��",-;
		emotion 15, "���@�m�N�T�C�q��#EP15.2";
		mes "[���@�m�N�T�C�q��]";
		mes "�{���H�@�悩�����I";
		mes "�ЂƂ�ŋ��͂��ɍs���̂�";
		mes "�Ȃ񂾂��|�����āB";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "���̕����̒�����";
		mes "�₽���������v���v�����킹�Ă���";
		mes "�������������ˁH";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�ޏ��������̑��ӔC�҂ł���";
		mes "���[�E�x���[�j���񂾁B";
		mes "�݂�Ȃ̓h�N�^�[�x���[�j�ƌĂ�ł���B";
		next;
		setquest 5341;
		setquest 5342;
		set VER_6QUE,1;
		mes "[���@�m�N�T�C�q��]";
		mes "�ޏ��̂Ƃ���ɍs���āA";
		mes "�������͂��鎖�͂Ȃ���";
		mes "�����Ă݂Ă���邩���H";
		close;
	case 1://
	case 2:
	case 3:
		mes "[���@�m�N�T�C�q��]";
		mes "���͗������ł���l�Ԃ����l����̂�";
		mes "���ׂق����Ƃ������݂��󂯂���B";
		next;
		mes "[���@�m�N�T�C�q��]";
		mes "�V�F���^�[�����͓������G�ōL������";
		mes "��ς����ǁA�撣��Ȃ��ƂˁI";
		close;
	}
}
un_bk_q.gat,93,168,4	script	�h�N�^�[�x���[�j#EP15.2	10078,{/* 61062 */
	switch(VER_6QUE) {
	case 0://
	case 1:
		emotion 17, "�h�N�^�[�x���[�j#EP15.2";
		mes "[���[�E�x���[�j]";
		mes "���݂܂���B���͖Z�����̂ŁA";
		mes "�b������̂ł�����";
		mes "��ɂ��Ă��炦�܂����H";
		next;
		menu "����`�����܂�",-;
		emotion 0, "�h�N�^�[�x���[�j#EP15.2";
		mes "[���[�E�x���[�j]";
		mes "�����H";
		mes "��`���Ă���������̂ł����H";
		next;
		mes "[���[�E�x���[�j]";
		mes "���肪�Ƃ��������܂��B";
		mes "�F�A�p�j�b�N�ŉE���������Ă���̂�";
		mes "�l�肪�Ȃ������Ă����̂ł��B";
		next;
		mes "[���[�E�x���[�j]";
		mes "����ȏ󋵂ŁA";
		mes "�܂Ƃ��ɓ�����l�Ԃ�";
		mes "���Ȃ��ł�����ˁc�c�B";
		next;
		mes "[���[�E�x���[�j]";
		mes "���ЁA���͂����肢���܂��B";
		mes "���������Ƃ��傤��";
		mes "�����Ă��������������̂ŁA";
		mes "�{���ɂ�������܂��B";
		next;
		menu "�����Ă������H",-;
		emotion 1,"";
		mes "[���[�E�x���[�j]";
		mes "���A�����҂̐l����c�����邽�߂�";
		mes "�������ݒ������s���Ă��܂��B";
		next;
		mes "[���[�E�x���[�j]";
		mes "�`���҂⒬�̏Z���̕������̐l����";
		mes "������x�c���ł����̂ł����A";
		mes "�����œ����Ă����E���B��";
		mes "�l���c�����܂��I����Ă��܂���B";
		next;
		mes "[���[�E�x���[�j]";
		mes "���炭�A�e���������Ă���`�[����";
		mes "��펖�ԃ}�j���A���ɉ�����";
		mes "�����Ă���͂��ŁA����������";
		mes "�U��΂��Ă���̂ł��傤�B";
		next;
		emotion 20, "�h�N�^�[�x���[�j#EP15.2";
		mes "[���[�E�x���[�j]";
		mes "���������E�������͂ǂ��ɂ���̂��c�c�B";
		mes "�V�F���^�[������";
		mes "���X�܂ŒT���Ȃ��Ƃ����Ȃ��̂ł����A";
		mes "�����ɂ�����";
		mes "�����𗣂�邱�Ƃ��ł��܂���B";
		next;
		mes "[���[�E�x���[�j]";
		mes "����łȂ�ł����ǁA";
		mes "���Ȃ��ɂ��̐l���c����";
		mes "���肢�������̂ł��B";
		next;
		menu "�킩��܂���",-;
		set VER_6QUE,2;
		setquest 5346;
		mes "[���[�E�x���[�j]";
		mes "���肪�Ƃ��������܂��B";
		mes "����ł́c�c";
		mes "^FF0000�Ȋw��^000000�����l����̂��A";
		mes "�m�F���ė��Ăق����ł��B";
		next;
		mes "[���[�E�x���[�j]";
		mes "���������ō�Ƃ����Ă���E����";
		mes "�������݂����Ă��Ă��������B";
		next;
		mes "[���[�E�x���[�j]";
		mes "�V�F���^�[���͓������G�ōL���̂�";
		mes "��ς��Ǝv���܂����A";
		mes "��낵�����肢���܂��B";
		close;
	case 2:
	case 3:
		emotion 0, "�h�N�^�[�x���[�j#EP15.2";
		mes "[���[�E�x���[�j]";
		mes "����A���Ȃ��ł������B";
		mes "�����l���̔c�����ł����̂ł����H";
		mes "���������ł��ˁI";
		next;
		mes "[���[�E�x���[�j]";
		mes "�����ƁA���肢���Ă����̂́c�c";
		next;
		mes "[���[�E�x���[�j]";
		mes "^FF0000�Ȋw��^000000�̐l���c���ł����ˁB";
		mes "����ŁA���l���܂������H";
		next;
		input '@num;
		if(VER_6QUE != 3 && '@num != 10) {
			mes "[���[�E�x���[�j]";
			mes '@num+ "���ł����H";
			next;
			emotion 20, "�h�N�^�[�x���[�j#EP15.2";
			mes "[���[�E�x���[�j]";
			mes "���������ł��ˁB";
			mes "�]�ƈ����X�g�ɋL�ڂ���Ă���l����";
			mes "�傫������Ă���悤�ł����c�c�B";
			next;
			mes "[���[�E�x���[�j]";
			mes "���݂܂���A";
			mes "������x�m�F���Ă��Ă��炦�܂����H";
			close;
		}
		mes "[���[�E�x���[�j]";
		mes "�Ȃ�قǁc�c�킩��܂����B";
		mes "���X�g�̐l���Ƒ�̓������炢�ł��ˁB";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[���[�E�x���[�j]";
		mes "����J�l�ł����B";
		mes "���ꂵ���Ǝv���܂����A";
		mes "�O�̏󋵂����肷��܂�";
		mes "�V�F���^�[���Ő������Ă��������B";
		close2;
		delquest 5342;
		delquest 5346;
		delquest 5350;
		setquest 5370;
		getitem 6961, 3;
		warp "un_bunker.gat",97,91;
		end;
	}
}
un_bk_q.gat,213,303,4	script	�����H�w�҃c�A�[����#EP	98,{/* 61063 */
	mes "[�����H�w�҃c�A�[����]";
	mes "�����������H�w�҂�";
	mes "�V�F���^�[�����̐l�����̂��߂�";
	mes "�H�����Y�ɑ��͂𒍂��ł��܂��B";
	close;
}
un_bk_q.gat,82,323,2	script	�@�B�H�w�҃A�[��#EP15.2	851,{/* 61064 */
	mes "[�@�B�H�w�҃A�[��]";
	mes "���̐l����";
	mes "�V�F���^�[���S�Ă̐ݔ���";
	mes "�_������̂͑�ς����Ǌ撣���B";
	close;
}
un_bk_q.gat,347,217,4	script	�ݔ��S���҃����f�����O#	855,{/* 61065 */
	mes "[�ݔ��S���҃����f�����O]";
	mes "���̃V�F���^�[�c�c�B";
	mes "�N����������͒m��Ȃ����ǁA";
	mes "�{���Ɋ��ɍ���Ă���܂��ˁB";
	close;
}
un_bk_q.gat,86,121,4	script	�Ȋw�҃J�[���X�e��#EP15	749,{/* 61066 */
	switch(VER_6QUE) {
	case 0://
	case 1://
	case 2:
		emotion 1, "�Ȋw�҃J�[���X�e��#EP15";
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "����A����ȏ��Ɂc�c�B";
		mes "�ǂȂ��ł����H";
		next;
		menu "���́c�c",-;
		emotion 0, "�Ȋw�҃J�[���X�e��#EP15";
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "���`�I�@�x���[�j����H";
		mes "�S�̉�c�̎��ɉ��x��";
		mes "���������������܂��B";
		next;
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "���̋L�����ԈႢ�Ȃ���΁A";
		mes "���������񎸔s����������";
		mes "���ӔC�҂ł�����ˁH";
		next;
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "��͂葍�ӔC�҂�";
		mes "�N�ł������킯�ł͂Ȃ������ł��ˁB";
		mes "���̍Q���������󋵂�";
		mes "�l���`�F�b�N�Ƃ͂��������B";
		next;
		emotion 19, "�Ȋw�҃J�[���X�e��#EP15";
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "�҂��ĉ������A";
		mes "��قǐl�����`�F�b�N����";
		mes "�ǂ����ɏ����Ă�������ł����c�c�B";
		next;
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "�����Ɓc�c���̐������������ȁH";
		mes "�Ⴄ�ȁB�������̐������������ȁH";
		mes "���I�@���̐������ȁI";
		next;
		setquest 5350;
		set VER_6QUE,3;
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "�Ȋw�҂͎����܂߂āA";
		mes "���l��^FF000010��^000000�ł��B";
		mes "�c�c�C�̓łɁA���\����܂����ˁB";
		next;
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "���I�@�߂�����x���[�j�����";
		mes "�������́A���}�j���A���ɏ]����";
		mes "�V�F���^�[�����Ɋ댯������������";
		mes "���������Ɠ`���ĉ������B";
		next;
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "����Ȕ�펖�Ԃ��A";
		mes "�����ɂł��邱�Ƃ�";
		mes "�ǂ�ǂ���Ȃ��ƁB";
		close;
	case 3:
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "�Ȋw�҂͎����܂߂āA";
		mes "���l��^FF000010��^000000�ł��B";
		next;
		mes "[�Ȋw�҃J�[���X�e��]";
		mes "�߂�����x���[�j�����";
		mes "�������́A���}�j���A���ɏ]����";
		mes "�V�F���^�[�����Ɋ댯������������";
		mes "���������Ɠ`���ĉ������B";
		close;
	}
}
un_bk_q.gat,56,286,4	script	�@�B�H�w�҃��K�V�[#EP15	851,{/* 61067 */
	mes "[�@�B�H�w�҃��K�V�[]";
	mes "�`���҂��H�@�����͋@�B�q�ɂ��B";
	next;
	mes "[�@�B�H�w�҃��K�V�[]";
	mes "���͑q�ɂ��������ǁA";
	mes "���͓����̋@�B�H�w�҂�����";
	mes "�V�F���^�[�ɕK�v�ȋ@�B��";
	mes "�쐬���Ă���񂾁B";
	next;
	emotion 6, "�@�B�H�w�҃��K�V�[#EP15";
	mes "[�@�B�H�w�҃��K�V�[]";
	mes "�@�B�H�w�҂����̑��l�����m�肽���H";
	mes "���������͕�����Ȃ��B";
	next;
	mes "[�@�B�H�w�҃��K�V�[]";
	mes "�������ȁc�c���̏�ɂ���";
	mes "�A�[������Ȃ�";
	mes "�m���Ă��邩���m��Ȃ��ȁB";
	mes "�����Ă݂�Ƃ����B";
	close;
}
un_bk_q.gat,212,294,6	script	C-0���ݔ��S����#EP15.	854,{/* 61068 */
	mes "[�ݔ��S����]";
	mes "��펖�ԃ}�j���A���ɏ]����";
	mes "�V�F���^�[�����̎{�݂�_�������B";
	close;
}
un_bk_q.gat,223,217,4	script	F-1���ݔ��S����#EP15.	854,{/* 61069 */
	mes "[�ݔ��S����]";
	mes "��펖�ԃ}�j���A���ɏ]����";
	mes "�V�F���^�[�����̎{�݂�_�����ł��B";
	close;
}
un_bk_q.gat,372,217,6	script	F-2���ݔ��S����#EP15.	854,{/* 61070 */
	mes "[�ݔ��S����]";
	mes "��펖�ԃ}�j���A���ɏ]����";
	mes "�V�F���^�[�����̎{�݂�_�����ł��B";
	close;
}
un_bk_q.gat,389,276,6	script	I-0���ݔ��S����#EP15.	854,{/* 61071 */
	mes "[�ݔ��S����]";
	mes "��펖�ԃ}�j���A���ɏ]����";
	mes "�V�F���^�[�����̎{�݂�_��������B";
	close;
}
un_bk_q.gat,291,158,4	script	Z-0���ݔ��S����#EP15.	854,{/* 61072 */
	mes "[�ݔ��S����]";
	mes "��펖�ԃ}�j���A���ɏ]����";
	mes "�V�F���^�[�����̎{�݂�_�������B";
	close;
}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,279,294,4	script	�^���ӔC�҃G���m��#EP15	869,{/* 61088 */
	mes "[�^���ӔC�҃G���m��]";
	mes "���̂̑O��";
	mes "�����ɐ����i�⌤������Ȃǂ�";
	mes "�[�i����d�������Ă����B";
	next;
	mes "[�^���ӔC�҃G���m��]";
	mes "�����̐E���ł͂��邯�ǁA";
	mes "������葼�̏ꏊ��";
	mes "�s���Ă��鎖�������B����Ȏd�����B";
	close;
}
un_bk_q.gat,72,53,4	script	�����S���҃A�u�����e�B#	778,{/* 61089 */
	emotion 54, "�����S���҃A�u�����e�B#"; //61089
	mes "[�����S���҃A�u�����e�B]";
	mes "�V�F���^�[���ɔ��ł���";
	mes "�Ȃ�Ƃ�������܂����B";
	next;
	mes "[�����S���҃A�u�����e�B]";
	mes "���������ł��x��Ă�����c�c�B";
	mes "�������ɂ�������";
	mes "�����Ă����Ȃ������ł��傤�B";
	close;
}
un_bk_q.gat,22,279,4	script	�@�B�q��	858,{/* 61090 */}
un_bk_q.gat,22,259,4	script	L-1���#J0	858,{/* 61091 */}
un_bk_q.gat,25,193,4	script	J-0���#L1	858,{/* 61092 */}
un_bk_q.gat,58,185,4	script	�ǐ���#����	858,{/* 61093 */}
un_bk_q.gat,58,171,4	script	���j�^�[���[��#L1����	858,{/* 61094 */}
un_bk_q.gat,49,137,4	script	B-1�q��	858,{/* 61095 */}
un_bk_q.gat,58,121,4	script	A-0���#L1	858,{/* 61096 */}
un_bk_q.gat,71,121,4	script	L-1���#A0	858,{/* 61097 */}
un_bk_q.gat,78,125,4	script	H-0���#��	858,{/* 61098 */}
un_bk_q.gat,101,122,4	script	���j�^�[���[��#A0����	858,{/* 61099 */}
un_bk_q.gat,122,125,4	script	H-0���#�E	858,{/* 61100 */}
un_bk_q.gat,126,121,4	script	L-2���#A0	858,{/* 61101 */}
un_bk_q.gat,141,115,4	script	A-0���#L2	858,{/* 61102 */}
un_bk_q.gat,139,171,4	script	���j�^�[���[��#L2�E��	858,{/* 61103 */}
un_bk_q.gat,139,187,4	script	�ǐ���#�E��	858,{/* 61104 */}
un_bk_q.gat,173,193,4	script	K-0���#L2	858,{/* 61105 */}
un_bk_q.gat,171,233,4	script	L-2���#K0	858,{/* 61106 */}
un_bk_q.gat,278,193,4	script	A-0���#H0��	858,{/* 61107 */}
un_bk_q.gat,300,194,4	script	Z-0���#H0	858,{/* 61108 */}
un_bk_q.gat,301,204,4	script	�Վ����Ï�#H0	858,{/* 61109 */}
un_bk_q.gat,317,193,4	script	A-0���#H0�E	858,{/* 61110 */}
un_bk_q.gat,322,203,4	script	G-2���#H0	858,{/* 61111 */}
un_bk_q.gat,340,203,4	script	H-0���#H0	858,{/* 61112 */}
un_bk_q.gat,349,217,4	script	F-2���#G2	858,{/* 61113 */}
un_bk_q.gat,339,239,4	script	�Վ����Ï�#G2	858,{/* 61114 */}
un_bk_q.gat,368,267,4	script	I-0���#G2	858,{/* 61115 */}
un_bk_q.gat,388,266,4	script	G-2���#I0	858,{/* 61116 */}
un_bk_q.gat,273,203,4	script	G-1���#H0	858,{/* 61117 */}
un_bk_q.gat,260,203,4	script	H-0���#G1	858,{/* 61118 */}
un_bk_q.gat,247,217,4	script	F-1���#G1	858,{/* 61119 */}
un_bk_q.gat,228,217,4	script	G-1���#F1	858,{/* 61120 */}
un_bk_q.gat,256,239,4	script	�Վ����Ï�#G1	858,{/* 61121 */}
un_bk_q.gat,219,265,4	script	C-0���#G1	858,{/* 61122 */}
un_bk_q.gat,214,283,4	script	G-1���#C0	858,{/* 61123 */}
un_bk_q.gat,215,303,4	script	�_��#C0	858,{/* 61124 */}
un_bk_q.gat,300,184,4	script	H-0���#Z0	858,{/* 61125 */}
un_bk_q.gat,365,167,4	script	Z-2���#Z0	858,{/* 61126 */}
un_bk_q.gat,27,55,4		script	Z-0���#Z2	858,{/* 61127 */}
un_bk_q.gat,230,167,4	script	Z-1���#Z0	858,{/* 61128 */}
un_bk_q.gat,164,55,4	script	Z-0���#Z1	858,{/* 61129 */}
un_bk_q.gat,255,264,4	script	�H��#G1	858,{/* 61130 */}
un_bk_q.gat,339,263,4	script	�H��#G2	858,{/* 61131 */}
un_bk_q.gat,41,275,0	warp	�@�B�q��#J-0	2,2,un_bk_q.gat,21,276 //61132 from_pos=(42, 275)
un_bk_q.gat,24,276,0	warp	J-0#�@�B�q��	2,2,un_bk_q.gat,45,275 //61133 from_pos=(23, 277)
un_bk_q.gat,24,256,0	warp	J-0#L-1	2,2,un_bk_q.gat,26,190 //61134 from_pos=(24, 257)
un_bk_q.gat,23,190,0	warp	L-1#J-0	2,2,un_bk_q.gat,21,256 //61135 from_pos=(23, 190)
un_bk_q.gat,31,196,0	warp	L-1#D-1	2,2,un_bk_q.gat,22,378 //61136 from_pos=(31, 196)
un_bk_q.gat,21,375,0	warp	D-1#L-1	2,2,un_bk_q.gat,32,193 //61137 from_pos=(21, 374)
un_bk_q.gat,51,196,0	warp	L-1#D-2	2,2,un_bk_q.gat,68,378 //61138 from_pos=(51, 195)
un_bk_q.gat,67,375,0	warp	D-2#L-1	2,2,un_bk_q.gat,52,193 //61139 from_pos=(67, 375)
un_bk_q.gat,60,183,0	warp	L-1#�ǐ���	2,2,un_bk_q.gat,75,235 //61140 from_pos=(60, 183)
un_bk_q.gat,71,236,0	warp	�ǐ���#L-1	2,2,un_bk_q.gat,57,182 //61141 from_pos=(72, 236)
un_bk_q.gat,60,169,0	warp	L-1#���j�^�[��	2,2,un_bk_q.gat,72,168 //61142 from_pos=(60, 169)
un_bk_q.gat,69,167,0	warp	���j�^�[��#L-1	2,2,un_bk_q.gat,57,168 //61143 from_pos=(69, 167)
un_bk_q.gat,47,135,0	warp	L-1#B-1	2,2,un_bk_q.gat,37,134 //61144 from_pos=(47, 136)
un_bk_q.gat,40,135,0	warp	B-1#L-1	2,2,un_bk_q.gat,50,134 //61145 from_pos=(40, 135)
un_bk_q.gat,57,118,0	warp	L-1#A-0	2,2,un_bk_q.gat,72,117 //61146 from_pos=(58, 118)
un_bk_q.gat,69,118,0	warp	A-0#L-1	2,2,un_bk_q.gat,53,117 //61147 from_pos=(70, 118)
un_bk_q.gat,97,124,0	warp	A-0#���j�^�[��	2,2,un_bk_q.gat,100,144 //61148 from_pos=(97, 124)
un_bk_q.gat,97,141,0	warp	���j�^�[��#A-0	2,2,un_bk_q.gat,98,121 //61149 from_pos=(98, 141)
un_bk_q.gat,128,118,0	warp	A-0#L-2	2,2,un_bk_q.gat,144,117 //61150 from_pos=(127, 118)
un_bk_q.gat,140,118,0	warp	L-2#A-0	2,2,un_bk_q.gat,125,117 //61151 from_pos=(141, 118)
un_bk_q.gat,137,168,0	warp	L-2#���j�^�[��	2,2,un_bk_q.gat,122,167 //61152 from_pos=(137, 168)
un_bk_q.gat,126,168,0	warp	���j�^�[��#L-2	2,2,un_bk_q.gat,140,167 //61153 from_pos=(126, 168)
un_bk_q.gat,137,185,0	warp	L-2#�ǐ���	2,2,un_bk_q.gat,120,235 //61154 from_pos=(137, 185)
un_bk_q.gat,124,236,0	warp	�ǐ���#L-2	2,2,un_bk_q.gat,140,184 //61155 from_pos=(124, 236)
un_bk_q.gat,147,196,0	warp	L-2#E-1	2,2,un_bk_q.gat,106,378 //61156 from_pos=(147, 196)
un_bk_q.gat,105,375,0	warp	E-1#L-2	2,2,un_bk_q.gat,148,193 //61157 from_pos=(105, 375)
un_bk_q.gat,167,196,0	warp	L-2#E-2	2,2,un_bk_q.gat,152,378 //61158 from_pos=(168, 196)
un_bk_q.gat,151,375,0	warp	E-2#L-2	2,2,un_bk_q.gat,168,193 //61159 from_pos=(150, 375)
un_bk_q.gat,174,190,0	warp	L-2#K-0	2,2,un_bk_q.gat,172,229 //61160 from_pos=(175, 190)
un_bk_q.gat,169,230,0	warp	K-0#L-2	2,2,un_bk_q.gat,171,189 //61161 from_pos=(170, 230)
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,216,300,0	script	C-0#�_��	45,1,1,{/* 61163 */
	mes "[�����H�w�҃c�A�[����]";
	mes "���݂܂���B";
	mes "���͔_��ɓ��鎖�͂ł��܂���B";
	close;
}
un_bk_q.gat,216,280,0	warp	C-0#G-1	2,2,un_bk_q.gat,220,261 //61164 from_pos=(216, 281)
un_bk_q.gat,217,262,0	warp	G-1#C-0	2,2,un_bk_q.gat,213,279 //61165 from_pos=(217, 262)
un_bk_q.gat,249,268,0	warp	G-1#M-0	2,2,un_bk_q.gat,390,380 //61166 from_pos=(250, 268)
un_bk_q.gat,389,377,0	warp	M-0#G-1	2,2,un_bk_q.gat,250,265 //61167 from_pos=(389, 377)
un_bk_q.gat,258,262,0	warp	G-1#�H��	2,2,un_bk_q.gat,274,289 //61168 from_pos=(258, 260)
un_bk_q.gat,271,290,0	warp	�H��#G-1	2,2,un_bk_q.gat,255,261 //61169 from_pos=(270, 291)
un_bk_q.gat,269,236,0	script	���Ï�#G-1	45,{/* 61170 */}
un_bk_q.gat,245,214,0	warp	G-1#F-1	2,2,un_bk_q.gat,226,213 //61171 from_pos=(245, 214)
un_bk_q.gat,230,214,0	warp	F-1#G-1	2,2,un_bk_q.gat,248,213 //61172 from_pos=(230, 214)
un_bk_q.gat,262,200,0	warp	G-1#H-0	2,2,un_bk_q.gat,274,199 //61173 from_pos=(261, 200)
un_bk_q.gat,271,200,0	warp	H-0#G-1	2,2,un_bk_q.gat,258,199 //61174 from_pos=(271, 200)
un_bk_q.gat,75,128,0	warp	��A-0#��H-0	2,2,un_bk_q.gat,276,196 //61175 from_pos=(75, 128)
un_bk_q.gat,275,191,0	warp	��H-0#��A-0	2,2,un_bk_q.gat,76,121 //61176 from_pos=(275, 191)
un_bk_q.gat,119,128,0	warp	�EA-0#�EH-0	2,2,un_bk_q.gat,319,196 //61177 from_pos=(119, 127)
un_bk_q.gat,320,191,0	warp	�EH-0#�EA-0	2,2,un_bk_q.gat,120,121 //61178 from_pos=(319, 192)
un_bk_q.gat,324,200,0	warp	H-0#G-2	2,2,un_bk_q.gat,344,199 //61179 from_pos=(324, 200)
un_bk_q.gat,339,200,0	warp	G-2#H-0	2,2,un_bk_q.gat,321,199 //61180 from_pos=(338, 200)
un_bk_q.gat,350,214,0	warp	G-2#F-2	2,2,un_bk_q.gat,368,213 //61181 from_pos=(350, 214)
un_bk_q.gat,365,214,0	warp	F-2#G-2	2,2,un_bk_q.gat,347,213 //61182 from_pos=(365, 214)
un_bk_q.gat,324,290,0	warp	�H��#G-2	2,2,un_bk_q.gat,340,261 //61183 from_pos=(324, 290)
un_bk_q.gat,337,262,0	warp	G-2#�H��	2,2,un_bk_q.gat,321,289 //61184 from_pos=(337, 261)
un_bk_q.gat,343,270,0	warp	G-2#N-0	2,2,un_bk_q.gat,382,328 //61185 from_pos=(343, 271)
un_bk_q.gat,381,325,0	warp	N-0#G-2	2,2,un_bk_q.gat,344,267 //61186 from_pos=(381, 324)
un_bk_q.gat,370,264,0	warp	G-2#I-0	2,2,un_bk_q.gat,388,263 //61187 from_pos=(370, 264)
un_bk_q.gat,385,264,0	warp	I-0#G-2	2,2,un_bk_q.gat,367,263 //61188 from_pos=(386, 264)
un_bk_q.gat,297,192,0	warp	H-0#Z-0	2,2,un_bk_q.gat,298,181 //61189 from_pos=(297, 193)
un_bk_q.gat,297,186,0	warp	Z-0#H-0	2,2,un_bk_q.gat,298,196 //61190 from_pos=(297, 186)
un_bk_q.gat,229,163,0	warp	Z-0#Z-1	2,2,un_bk_q.gat,159,52 //61191 from_pos=(228, 163)
un_bk_q.gat,164,51,0	warp	Z-1#Z-0	2,2,un_bk_q.gat,233,164 //61192 from_pos=(164, 51)
un_bk_q.gat,366,164,0	warp	Z-0#Z-2	2,2,un_bk_q.gat,31,51 //61193 from_pos=(367, 164)
un_bk_q.gat,27,52,0	warp	Z-2#Z-0	2,2,un_bk_q.gat,361,163 //61194 from_pos=(27, 52)
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,100,312,6	script	�@�B�H�w�҃u�J��#EP15.2	851,{/* 61196 */
	mes "[�@�B�H�w�҃u�J��]";
	mes "�@�B�H�w�҂̐l���ł����H";
	next;
	mes "[�@�B�H�w�҃u�J��]";
	mes "���͔c�����Ă��Ȃ��̂ŁA";
	mes "�������ɂ���A�[�������";
	mes "�����Ă݂ĉ������B";
	close;
}
un_bk_q.gat,76,175,4	script	�������O����#EP15.2MR	982,{/* 61197 */
	mes "[�������O����]";
	mes "���̏��͉����̂����Ɂc�c�B";
	mes "��������\�ɂł��Ȃ����C��";
	mes "�l���𐔂��Ă���񂾁H";
	next;
	mes "[�������O����]";
	mes "�ŏ����炠��Ȏ��������Ȃ���΁A";
	mes "�������Ȃ������񂶂�Ȃ����H";
	mes "��������H";
	close;
}
un_bk_q.gat,297,287,6	script	�`���ƃW����#EP15.2MR	896,{/* 61198 */
	mes "[�`���ƃW����]";
	mes "���I�@���Ȃ����`���҂Ȃ́H";
	next;
	mes "[�`���ƃW����]";
	mes "�������c�c�B";
	mes "�ڂ���͖{���ɉ^�������ˁc�c�B";
	close;
}
un_bk_q.gat,318,299,2	script	�H�����΂���#EP15.2MR	979,{/* 61199 */
	mes "[�H�����΂���]";
	mes "���݂܂���B";
	mes "�܂��������ł��B";
	close;
}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,313,280,8	script	�o���蓝���K�[�h#EP15.2	899,{/* 61203 */
	mes "[�o���蓝���K�[�h]";
	mes "�����͍H�����Ȃ̂�";
	mes "�������鎖���o���܂���B";
	next;
	mes "[�o���蓝���K�[�h]";
	mes "�ݔ��S���҂̘b���ƁA";
	mes "����͎��Ï��Ƃ���";
	mes "�g�p����邻���ł���B";
	close;
}
un_bk_q.gat,280,280,8	script	�o���蓝���K�[�h#EP15.2	899,{/* 61204 */
	mes "[�o���蓝���K�[�h]";
	mes "�����͍H�����Ȃ̂�";
	mes "�������鎖���o���܂���B";
	next;
	mes "[�o���蓝���K�[�h]";
	mes "�ݔ��S���҂̘b���ƁA";
	mes "����͎��Ï��Ƃ���";
	mes "�g�p����邻���ł���B";
	close;
}
un_bk_q.gat,255,236,2	script	�o���蓝���K�[�h#EP15.2	899,{/* 61205 */
	mes "[�o���蓝���K�[�h]";
	mes "�����͍H�����Ȃ̂�";
	mes "�������鎖���o���܂���B";
	next;
	mes "[�o���蓝���K�[�h]";
	mes "�ݔ��S���҂̘b���ƁA";
	mes "����͎��Ï��Ƃ���";
	mes "�g�p����邻���ł���B";
	close;
}
un_bk_q.gat,298,203,4	script	�o���蓝���K�[�h#EP15.2	899,{/* 61206 */
	mes "[�o���蓝���K�[�h]";
	mes "�����͍H�����Ȃ̂�";
	mes "�������鎖���o���܂���B";
	next;
	mes "[�o���蓝���K�[�h]";
	mes "�ݔ��S���҂̘b���ƁA";
	mes "����͎��Ï��Ƃ���";
	mes "�g�p����邻���ł���B";
	close;
}
un_bk_q.gat,340,235,6	script	�o���蓝���K�[�h#EP15.2	899,{/* 61207 */
	mes "[�o���蓝���K�[�h]";
	mes "�����͍H�����Ȃ̂�";
	mes "�������鎖���o���܂���B";
	next;
	mes "[�o���蓝���K�[�h]";
	mes "�ݔ��S���҂̘b���ƁA";
	mes "����͎��Ï��Ƃ���";
	mes "�g�p����邻���ł���B";
	close;
}
un_bk_q.gat,98,246,8	script	�ݔ��S���҃W�S#EP15.2MR	854,{/* 61208 */
	mes "[�ݔ��S���҃W�S]";
	mes "�����c�c�B";
	mes "�ǐ����͂��Ȃ��Q���傫���A";
	mes "���̒ʂ�A�Ђǂ����肳�܂ł��B";
	close;
}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,322,249,2	script	�Ō�t#EP15.2MR2	569,{/* 61210 */}
////////////////////////////////////////////////////////////////////////
un_bk_q.gat,103,393,4	script	�������[���R�[�h#EP15.2	10043,{/* 61221 */
	mes "�]�N�����^�������Ǝv����";
	mes "�@�������[���R�[�h�̓�����";
	mes "�@���R�[�h�v���C���[������]";
	next;
	if(select("�Đ�����","��߂�") == 2) {
		mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
		close;
	}
	while(1) {
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]���[���A���B";
		mes "�@���`�A�e�X�g�[�e�X�g�[�B�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�V�F���^�[���ł̓��t����";
		mes "�@���m�ɂ���ׁA";
		mes "�@�����̔����ȍ~��";
		mes "�@�u���������ځv�ƌĂԂ��Ƃɂ���B�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]����ł͋L�^���J�n����B";
		mes "�@�{���͔���1���ڂ��B�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�ŏ��̔�������A";
		mes "�@���j�^�[�ɉf���o���ꂽ";
		mes "�@�O�̏󋵂����āA";
		mes "�@�݂�ȃp�j�b�N�ɂȂ��Ă��܂����B�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�����ǎ����̐ӔC�҂�����";
		mes "�@�h�N�^�[�x���[�j��";
		mes "�@�݂�Ȃ𗎂��������āA";
		mes "�@�����҂̐l�����m�F���n�߂��B�]^000000";
		next;
		mes "[���R�[�h�v���C���[]";
		mes "^0000FF�]�����Đ�قǁA�����̗]�g��";
		mes "�@�O���f���Ă����J��������ꂽ�B";
		mes "�@��������ŊO�̏󋵂�";
		mes "�@�m�F���鎖�͂ł��Ȃ��B�]^000000";
		next;
		mes "�]����ȏ�^�����ꂽ���e�͂Ȃ��]";
		next;
		if(select("������x�Đ�����","��߂�") == 2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		continue;
	}
}
un_bk_q.gat,108,243,4	script	�̂Ă�ꂽ�@�B���u#EP15	10043,{/* 61222 */
	mes "�]���Ɏ̂Ă�ꂽ�@�B���u������B";
	mes "�@�������ǂ����͂킩��Ȃ��]";
	close;
}
un_bk_q.gat,34,138,4	script	�q�ɔԃs�b�N#EP15.2MR	99,{/* 61223 */
	mes "[�q�ɔԃs�b�N]";
	mes "���̗v���ł������������̂���";
	mes "������܂��񂪁A";
	mes "�q�ɂ̂��̂�";
	mes "����ɐG��Ȃ��ł��������B";
	next;
	mes "[�q�ɔԃs�b�N]";
	mes "�܂��݌ɔc�����I����Ă��Ȃ����A";
	mes "���̂��Ȃ��Ȃ����肷���";
	mes "��ςȂ̂ŁB";
	close;
}
un_bk_q.gat,91,283,2	script	�K�[�h#EP15.2MR	899,{/* 61224 */
	mes "[�K�[�h]";
	mes "�`���җl�A����ɂ��́B";
	next;
	mes "[�K�[�h]";
	mes "���R�͕�����܂��񂪁A";
	mes "���̓x���[�j�����";
	mes "�����ɔz�u����܂����B";
	close;
}

un_bk_q.gat,56,192,4	script	�Ȋw�҃R���[#EP15.2MR	749,{/* 61225 */
	mes "[�Ȋw�҃R���[]";
	mes "���󋵎��̃}�j���A���ɉ����āA";
	mes "�V�F���^�[����";
	mes "�댯���������邩�m�F���ł��B";
	next;
	mes "[�Ȋw�҃R���[]";
	mes "�Ȋw�҂����l�Ȃ̂�";
	mes "�m�肽���̂ł����H";
	mes "�ł�����J�[���X�e�������";
	mes "�T���Ă݂ĉ������B";
	mes "�ǂ����ɂ���Ǝv���܂��B";
	close;
}
un_bk_q.gat,161,193,6	script	�`���ƃo����#EP15.2MR	750,{/* 61226 */
	mes "[�`���ƃo��]";
	mes "�V�F���^�[���������Ă���";
	mes "�������񂾂��ǁA����͉����ȁH";
	mes "�ǖʂɂ���Ȃ��̂�";
	mes "�������񂠂����񂾁B";
	close;
}
un_bk_q.gat,248,258,2	script	�`���ƃ_�����[#EP15.2MR	882,{/* 61227 */
	mes "[�`���ƃ_�����[]";
	mes "�����I�@�����I";
	next;
	mes "[�`���ƃ_�����[]";
	mes "�o����[�I�@�����ā`�I";
	//4�� �ړ����x����
	close;
}



verus04.gat,170,216,3		duplicate(3rdRentalGear)	�����M�A�Ǘ���#ver		105	/* 50026 */


/*
announce "�x�������t�B�v�X : �����I�@�ŖS�j�����c�̏P�����I",0x1,0xffff00,0x190,12,0,0;
announce "�x�������P�X���[ : ���ׂĂ̌x�������͐퓬�z�u�ɂ��I�@�E�F���X�V�e�B�����炷��̂��I",0x1,0xffff00,0x190,12,0,0;
announce "�ŖS�j�����c���� : �ŖS�̎��ɔ�����I�@�j�󂱂��~�ς̓��A�j�󂷂�҂������~����I",0x1,0xffff00,0x190,12,0,0;
announce "�x�������T���O���� : �`�b�c�c�|���Ă��|���Ă������玟�ւƏo�Ă��₪��I",0x1,0xffff00,0x190,12,0,0;
announce "�x�������P�X���[ �F ���ނȁI�@�����������߂���N���E�F���X�V�e�B�����̂��I",0x1,0xffff00,0x190,12,0,0;
announce "�x�������Q���t �F �����c�c����Ȏ��Ɉ݂��c�c�B������킯�ɂ͂����Ȃ��̂ɁI",0x1,0xffff00,0x190,12,0,0;
announce "�x�������X�C�f�� �F �����A���ꂪ���̐킢�̌����Ȃ񂾂ˁc�c�ӂӁA�ӂӂӁB",0x1,0xffff00,0x190,12,0,0;
announce "�ŖS�j�����c���� : ���̂�c�c����͕��������c�c�S���P�ނ���I�@�ŖS�I�@�j���I",0x1,0xffff00,0x190,12,0,0;
announce "�x�������P�X���[ : �ŖS�j�����c���P�ނ��Ă����c�c���������c�c�̂��H",0x1,0xffff00,0x190,12,0,0;
*/