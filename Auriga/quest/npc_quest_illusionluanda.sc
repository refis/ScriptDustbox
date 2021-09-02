//= Auriga Script ==============================================================
// Ragnarok Online Illusion of Luanda Quest Script	by refis
//= Registry ===================================================================
// IL_LUANDA_QUE -> 0�`23
//==============================================================================

/*
com_d02_i.gat,0,0,0,0	monster	�ẪE�[�^���t�@�C�^�[	20276,45,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Ẫt���C���V���[�^�[	20274,45,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�ẪE�[�^���V���[�^�[	20275,15,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Ẫ��K���X			20272,6,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Â�S�S�[����			20271,6,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Â̎O�t�				20270,6,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�ẪE�[�^���V���[�^�[	20275,13,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Ẫ��K���X			20272,6,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Â�S�S�[����			20271,6,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Â̎O�t�				20270,6,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Ẫ��K���X			20272,25,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Â�S�S�[����			20271,25,5000,0,0
com_d02_i.gat,0,0,0,0	monster	�Â̎O�t�				20270,15,5000,0,0
*/

beach_dun2.gat,248,254,4	script	�g�[�e��#ILU_001	10043,{
	mes "�]�����̃V���{�����낤���H";
	mes "�@�����ɐ������Ă���]";
	next;
	if(select("�G���Ă݂�","���̂܂܂ɂ��Ă���") == 2) {
		mes "�]���̏���������]";
		close;
	}
	if(BaseLevel < 170) {
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u�������_�ɓ`����b�v��";
		mes "BaseLv170�ȏ�Ői�s�\�ł��B^000000";
		close;
	}
	if(IL_LUANDA_QUE == 0) {
		setquest 5847;
		set IL_LUANDA_QUE,1;
	}
	mes "�]�����ɋz�����܂��悤���]";
	close2;
	if(IL_LUANDA_QUE < 23)
		warp "com_d02_i_q.gat", 246, 248;
	else
		warp "com_d02_i.gat", 246, 248;
	end;
}

com_d02_i_q.gat,254,243,0	warp	ILU_Luanda#ILU_003	1,1,beach_dun2.gat,249,243
com_d02_i_q.gat,241,255,4	script	���҃������_#ILU_005	843,13,13,{
	switch(IL_LUANDA_QUE) {
	case 1:
		emotion 1;
		mes "[�������_]";
		mes "���Ȃ��́H";
		next;
		menu "�����",-;
		mes "[�������_]";
		mes "���A���������΁B";
		mes "�����X�^�[�̐N����h������";
		mes "���Ŗ`���҂��ق���";
		mes "�ƕ����Ă��܂��B";
		mes "���ꂪ���Ȃ��ł��ˁH";
		next;
		mes "[�������_]";
		mes "����ɂ��Ă��A";
		mes "�ǂ����ł�������悤�ȁc�c�H";
		mes "���o��������悤��";
		mes "������͉̂��̂ł��傤�B";
		next;
		mes "[�������_]";
		mes "����A�������l�̊�̂��Ƃ�������";
		mes "����ł͂���܂���c�c�B";
		mes "�Ȃɂ��O�q�ł��̂ŁA�n�n�B";
		mes "�����ƁA���Ⴂ�ł��傤�B";
		next;
		mes "[�������_]";
		mes "�c�c���߂Ă����A���B";
		mes "���̓������_�B";
		mes "���̓��A�ɗ��܂�A�߂��̑���";
		mes "�x������Ă���҂ł��B";
		next;
		mes "[�������_]";
		mes "���̈˗��͂����ɐݒu���Ă���";
		mes "�f���ŊǗ����Ă��܂��B";
		next;
		mes "[�������_]";
		mes "�����A�˗����c�c";
		mes "�ƌ��������Ƃ���ł����A";
		mes "���̓����X�^�[��";
		mes "��������l�����A�K��";
		mes "��͑���Ă���̂ł��B";
		next;
		mes "[�������_]";
		mes "�Ȃ̂ŁA�`���҂��܂ɂ�";
		mes "�x��̈�Ƃ������Ƃ�";
		mes "���A�̌�����";
		mes "���Ă��������Ȃ��ł��傤���H";
		next;
		emotion 29;
		mes "[�������_]";
		mes "�ω��̖���";
		mes "�ދ��ȓ��A�ł����A";
		mes "�H��ł���������";
		mes "�m�点�Ă��������B";
		set IL_LUANDA_QUE,2;
		viewpoint 1, 153, 33, 1, 0xFF0000;
		viewpoint 1, 118, 100, 2, 0xFF0000;
		viewpoint 1, 193, 267, 3, 0xFF0000;
		viewpoint 1, 228, 91, 4, 0xFF0000;
		viewpoint 1, 208, 130, 5, 0xFF0000;
		viewpoint 1, 42, 215, 6, 0xFF0000;
		viewpoint 1, 263, 72, 7, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 193, 265;
		end;
	case 3:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]�ڌ��������ۂɂ��āA";
		mes "�@�������_�ɘb�����]";
		next;
		emotion 20;
		mes "[�������_]";
		mes "�m���Ɋ���Ȍ��ۂł��B";
		next;
		mes "[�������_]";
		mes "���Œ����߂����Ă������ł���";
		mes "���߂ĕ����܂��B";
		mes "�N�����ڌ������̂Ȃ�";
		mes "���ŉ\�ł�����Ă������Ȃ��̂ł��B";
		next;
		mes "[�������_]";
		mes "����͎��̐����ɉ߂��܂��񂪁A";
		mes "�ŋߔ������n�߂����̂Ȃ̂ł�";
		mes "�Ȃ��ł��傤���B";
		next;
		mes "[�������_]";
		mes "�댯�Ȍ��ۂ�������܂���̂�";
		mes "���ꂩ�猩���Ŕ������Ă�";
		mes "�`���҂��܂�";
		mes "��΂ɋ߂Â��Ȃ��ł��������ˁB";
		set IL_LUANDA_QUE,4;
		viewpoint 1, 153, 33, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 153, 35;
		end;
	case 6:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]�������_�ɂ悭�����N�B��";
		mes "�@�o������b�������]";
		next;
		emotion 0;
		mes "[�������_]";
		mes "�c�c�����I�H";
		mes "���̌Z��ɉ�����̂ł����I�H";
		next;
		mes "[�������_]";
		mes "�ł����A�܂�ł��̏��";
		mes "���܂ł������̂悤�Șb�ł��B";
		mes "���͂��΂炭�����ɋ��܂������A";
		mes "���z�̏o������";
		mes "���Ă������̂悤�Șb�ł��c�c�B";
		next;
		mes "[�������_]";
		mes "���z�c�c�H����A";
		mes "���������ꂽ�Ƃ͂����A";
		mes "���̕��ɉ���Ƃ͋H�ł��B";
		mes "��������";
		mes "�v���o���Ă��܂����B";
		next;
		mes "[�������_]";
		mes "�L���̗͂ǂ���̃}�I�ƈ����";
		mes "���͋L������̂͋��ł����A";
		mes "�m���ɈȑO�A";
		mes "���ɏo������O�A";
		mes "�o��������̕���";
		mes "���������L��������܂��B";
		next;
		mes "[�������_]";
		mes "���߂ďo��������A";
		mes "�`���҂��܂�";
		mes "���o��������ƌ����܂������A";
		mes "����͂�͂�";
		mes "�C�̂����ł͂Ȃ������̂��c�c�B";
		next;
		mes "[�������_]";
		mes "�������A�s�v�c�ł��ˁB";
		mes "���̗��̕���";
		mes "�`���҂��܂��Ƃ����̂Ȃ�A";
		mes "�ߋ��̎��Ƙb�����Ă���";
		mes "�Ƃ������ƂɂȂ�܂��B";
		next;
		mes "[�������_]";
		mes "���ꂩ���";
		mes "�����悤�Ȍ��ۂ��N���蓾��A";
		mes "�Ƃ������Ƃł��傤���H";
		next;
		emotion 17;
		mes "[�������_]";
		mes "���߂�Ȃ����B";
		mes "���̎��͋}���ł����̂�";
		mes "��������̂�����t�ł����B";
		mes "�ˑR�����ĐM�����Ȃ��Ă�";
		mes "�����͂���܂���B";
		next;
		mes "[�������_]";
		mes "���ǁA�����X�^�[��";
		mes "�P���Ă���ǂ��납";
		mes "�����t���قǑ�l�����ł��B";
		mes "���̂܂܉����N����Ȃ����";
		mes "�ǂ��̂ł����B";
		next;
		mes "�]�������_�͂���������";
		mes "�@�s�������Ȋ�����Ă���B";
		mes "�@�����𑱂����";
		mes "�@�V���Ȍ��ۂ�";
		mes "�@�������邩������Ȃ��]";
		set IL_LUANDA_QUE,7;
		viewpoint 1, 118, 100, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 118, 102;
		end;
	case 8:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]�J���ƃA�X�f���̘b�������]";
		next;
		emotion 18;
		mes "[�������_]";
		mes "�����͂́I";
		mes "�f�[�g����";
		mes "�J���Z�Ƌ`�o�����";
		mes "�o���킵���悤�ł��ˁB";
		next;
		emotion 18;
		mes "[�������_]";
		mes "�������A";
		mes "�N���m��Ȃ��f�[�g�X�|�b�g";
		mes "���Ȃ�āI���͂͂͂́I";
		mes "�����ɂ��c�c�B";
		next;
		mes "[�������_]";
		mes "�J���Z��";
		mes "�f�[�g�ɂ����Ă���";
		mes "�ꏊ���������I";
		mes "�Ƃ������āA���������m��Ȃ�";
		mes "�閧�̏ꏊ����";
		mes "�v���Ă����悤�ł����c�c�A";
		next;
		mes "[�������_]";
		mes "�����ȑ��ł��B";
		mes "���l�B�̊Ԃł́A";
		mes "�L���ȏꏊ�Ȃ�ł���B";
		mes "�ӂӁc�c";
		mes "�΂̈������ȃJ���Z�̎p��";
		mes "�ڂɕ����Ԃ悤�ł��B";
		next;
		mes "[�������_]";
		mes "�ŋ߁A�S�z����������";
		mes "�S����΂���@�";
		mes "����܂���ł������A";
		mes "�����l�ő�΂��ł��܂����B";
		next;
		mes "[�������_]";
		mes "���̘b���҂��������ł����c�c";
		mes "�`���҂��܁A�����X�^�[�͈����";
		mes "����Ȃ����A�����͂������v�ł��B";
		mes "���낻�낱�̒n�𗣂�A";
		mes "���H�ɖ߂�ꂽ�����ǂ��ł��傤�B";
		mes "��V��p�ӂ��Ă����܂��ˁB";
		next;
		mes "�]�������_�͂���������";
		mes "�@�S�z���Ƃ����̂��C�ɂ�����B";
		mes "�@�����𑱂����";
		mes "�@�����������邩������Ȃ��]";
		set IL_LUANDA_QUE,9;
		viewpoint 1, 193, 267, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 193, 265;
		end;
	case 10:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]���A�ŕǉ��`���Ă���";
		mes "�@�������_�ɂ��Ęb�����]";
		next;
		mes "[�������_]";
		mes "�����ǉ��`���Ă��鎞�A";
		mes "�`���҂��܂ɏo��������Ƃ�";
		mes "���������͂��ł��B";
		mes "���[��c�c�B";
		next;
		mes "[�������_]";
		mes "�ŋߕ`���n�߂��̂�";
		mes "����Ă����獡�x��";
		mes "�m���Ɋo���Ă���͂��ł��B";
		mes "�����A�Ȃ��ǉ��`���Ă���̂���������";
		mes "���b�o���܂���B";
		next;
		mes "[�������_]";
		mes "���ł͌��R�̔閧�ł����A";
		mes "�������Z��̖ڂɂ�";
		mes "�_��̗͂��h���Ă��܂��B";
		next;
		mes "[�������_]";
		mes "�J���Z��";
		mes "�y�������܂�";
		mes "�����Ȃ��̂ł����m�Ɍ��ʂ���";
		mes "���̎��́B";
		next;
		mes "[�������_]";
		mes "�����q�̃}�I�́A";
		mes "��x�������̂�Y��Ȃ�";
		mes "�u�ԋL���\�́B����ɁA";
		mes "�ڂ����킹������̎v�l��";
		mes "����Ă���悤��";
		mes "�ǂݎ���ǐS�p�B";
		next;
		mes "[�������_]";
		mes "�����Ď��ɂ͗\�m�\�͂�����܂��B";
		mes "�c�c�ƌ����Ă��A";
		mes "����͂ł����A�s���S�ł��B";
		mes "�l���̓����������\���ł�����A";
		mes "�������������ɂȂ�����B";
		next;
		mes "[�������_]";
		mes "���I�\�͂ƌ����΂�����A";
		mes "�P���̋C�����������ł��B";
		next;
		mes "[�������_]";
		mes "�`���҂��܂����";
		mes "�P�̋C�����������Ȃ������̂�";
		mes "���Ζʂł��x����������";
		mes "�b�������邱�Ƃ��o���܂����B";
		mes "�x��ɂ͌����Ă���\�͂ł���H";
		next;
		mes "[�������_]";
		mes "�c�c�b��߂��܂��B";
		mes "�����ǉ��`�����R�ł����A";
		mes "������A���͑����R���鈫����";
		mes "���܂����B";
		next;
		mes "[�������_]";
		mes "�����̃����X�^�[�������P���A";
		mes "�ߖ��グ�鑺�݂̂�Ȃ̎p�c�c�B";
		mes "�����āA���̍��c�炸���͉�ŁB";
		next;
		mes "[�������_]";
		mes "�n���̂悤�Ȗ���������A";
		mes "���̏o�������������A�ŕǉ�Ƃ���";
		mes "�L�^���Ă��閲�����܂����B";
		next;
		mes "[�������_]";
		mes "���̂���Ȗ��������̂��H";
		mes "�������ĐM�����܂���B";
		mes "�ł����A���̔\�͂́c�c";
		mes "���������ɂȂ�܂��B";
		next;
		mes "[�������_]";
		mes "����Ȃ�A�����P����O��";
		mes "�����̓��e��";
		mes "�����ʂ̌����ɂ��邱�Ƃ�";
		mes "�����P���関����";
		mes "���Ȃ��Ȃ邩������Ȃ���";
		mes "�l������ł��B";
		next;
		mes "[�������_]";
		mes "�c�c�o�J�Șb�ł���ˁH";
		mes "�����ł��������Ă��܂��B";
		next;
		mes "[�������_]";
		mes "�����A�ł��S�z���Ȃ��ł��������B";
		mes "���̂Ƃ��눫���Ō����o������";
		mes "�N���Ă��܂���B";
		next;
		mes "[�������_]";
		mes "����ɂ��Ă��A";
		mes "�ǉ�͊������Ă����̂ł����H";
		mes "���ꂾ�ƁA";
		mes "���x�͂܂�Ŗ����̏o������";
		mes "���Ă������̂悤�ł��B";
		next;
		mes "[�������_]";
		mes "���܂Ŗ`���҂��܂�";
		mes "�\�m�ɏo�Ă������Ƃ͂���܂��񂪁A";
		mes "���̖`���҂��܂�";
		mes "���A���������Ă��邱�Ƃ��l����΁A";
		mes "�����N�����Ă�";
		mes "�s�v�c�ł͂Ȃ��̂����c�c�B";
		next;
		mes "�]�������_�͍l������ł��܂����B";
		mes "�@�����𑱂����";
		mes "�@�V���Ȍ��ۂ�";
		mes "�@�������邩������Ȃ��]";
		set IL_LUANDA_QUE,11;
		viewpoint 1, 228, 91, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 228, 89;
		end;
	case 12:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]��l�ŏC�s�����Ă���";
		mes "�@�}�I�ɂ��Ęb�����]";
		next;
		mes "[�������_]";
		mes "�}�I�̂�c�c�B";
		mes "�F�X�ƋC���g���Ă����悤�ł��B";
		next;
		mes "[�������_]";
		mes "�J���Z�͋`�o�����";
		mes "��炵�Ă��邩��A";
		mes "�C�t���Ȃ��̂������͂���܂���B";
		mes "�ł����A���͈ꏏ�ɏZ��ł���̂�";
		mes "�}�I�̗l�q��";
		mes "�S���C�t���܂���ł����B";
		next;
		mes "[�������_]";
		mes "�������������";
		mes "���̕s���Ȋ����";
		mes "�}�I�ɂ�������";
		mes "����������Ă����悤�ł��B";
		next;
		mes "[�������_]";
		mes "�}�I�̕������A";
		mes "���l�̊���ɐU��񂳂��";
		mes "��J���₦�Ȃ��͂��Ȃ̂Ɂc�c�B";
		next;
		mes "[�������_]";
		mes "����ɁA�}�I�͐̂���w�͉ƂŁA";
		mes "�퓬������";
		mes "�\�͂ɗ��炸�Ƃ��\�������̂ł��B";
		mes "����Ȃ̂ɁA";
		mes "�X�ɋ����Ȃ邽�߂ɏC�s���Ȃ�āB";
		next;
		emotion 15;
		mes "[�������_]";
		mes "�}�I�͐l�m�ꂸ";
		mes "������ς���w�͂�";
		mes "�����Ă����̂ł��ˁB";
		mes "�������K��Ȃ���΁B";
		next;
		mes "�]�����𑱂����";
		mes "�@�V���Ȍ��ۂ�";
		mes "�@�������邩������Ȃ��]";
		set IL_LUANDA_QUE,13;
		viewpoint 1, 208, 130, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 206, 130;
		end;
	case 14:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]���A�ŉ�������������";
		mes "�@�������_�ɂ��Ęb�����]";
		next;
		mes "[�������_]";
		mes "�����P�����ꂽ�����l���A";
		mes "�����Ɍ����ē��A�ɑޔ��o����";
		mes "��͂��𐮂��܂����B";
		next;
		mes "[�������_]";
		mes "���A�̐�������";
		mes "���p�i�̏�����";
		mes "���Ă���Ƃ����";
		mes "�o������悤�ł��ˁB";
		next;
		mes "[�������_]";
		mes "�}�I�Ɍ��K����";
		mes "���ɂ�����";
		mes "�o���邱�Ƃ����悤��";
		mes "�v���܂��āB";
		next;
		mes "[�������_]";
		mes "�������A�g���Ȃ��̂�";
		mes "��ԗǂ��̂ł����c�c�B";
		mes "���݂܂���B";
		mes "�Ȃ񂾂���������";
		mes "�`���҂��܂����������";
		mes "���܂��Ă��܂��ˁB";
		next;
		mes "�]�����𑱂����";
		mes "�@�V���Ȍ��ۂ�";
		mes "�@�������邩������Ȃ��]";
		set IL_LUANDA_QUE,15;
		viewpoint 1, 153, 33, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 153, 35;
		end;
	case 16:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]���̏Z���Ƒ����ɉ�����b�������]";
		next;
		mes "[�������_]";
		mes "�c�c�B";
		mes "�P������鑺�̗l�q��";
		mes "�ڌ������悤�ł��ˁB";
		mes "�������ł͂Ȃ��ɂ���A";
		mes "�����Ȕ�Q�Łc�c�B";
		next;
		mes "[�������_]";
		mes "�������v���o�����сA";
		mes "�����ɂ݂܂��B";
		mes "���ɂ����";
		mes "���B�A�Z�킪����Ă��錄�Ɂc�c�B";
		next;
		mes "[�������_]";
		mes "�l���Ă݂�ƁA�������͔�Q��";
		mes "���Ȃ����Ƃ��s�v�c�ł��B";
		mes "����������������";
		mes "�����Ă������߂ł��傤���B";
		mes "���̗\�m�͕s���S�Ƃ͂����c�c�B";
		next;
		mes "�]�����𑱂����";
		mes "�@�V���Ȍ��ۂ�";
		mes "�@�������邩������Ȃ��]";
		set IL_LUANDA_QUE,17;
		viewpoint 1, 42, 215, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 42, 217;
		end;
	case 18:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]�A�H���}��3�l�̘b�������]";
		next;
		mes "[�������_]";
		mes "�����ƁA�����P�����ꂽ��A";
		mes "���B����肩��A��l�q��";
		mes "�ڌ������Ƃ�������";
		mes "�ł��傤�ˁc�c�B";
		next;
		mes "[�������_]";
		mes "�}���ŋA��������";
		mes "���͏P�����ꂽ��B";
		mes "�`�o���񂾂��ă����X�^�[��";
		mes "�A�ꋎ����";
		mes "���邱�Ƃł��傤�c�c�B";
		next;
		mes "[�������_]";
		mes "�c�c���B�����𗣂�Ă���";
		mes "���Ȃ�������A";
		mes "�A��čs����͂��Ȃ�����";
		mes "�͂��Ȃ̂ɁI�I��̉��́I�H";
		next;
		menu "�C����������",-;
		mes "[�������_]";
		mes "�����Ă܂��B";
		mes "�����Ă܂��Ƃ��c�c�B";
		next;
		mes "[�������_]";
		mes "�ł��A�Ȃ��H";
		mes "���B�Z�킪";
		mes "����Ă��鎞��";
		mes "�_��ꂳ�����Ȃ����";
		mes "�����ƌ��ނł���͂��Ȃ̂Ɂc�c�B";
		next;
		mes "[�������_]";
		mes "�^������͓�����Ȃ��B";
		mes "�Ƃ������Ƃł��傤���H";
		next;
		menu "�܂��A���������������悳�����ł�",-;
		mes "[�������_]";
		mes "�c�c�`���҂��܂̑O��";
		mes "��藐���Ă��܂��܂����B";
		mes "�����A�o�������b��";
		mes "�`���Ă���������";
		mes "�����Ȃ̂Ɂc�c�B";
		next;
		mes "�]�����𑱂����";
		mes "�@�V���Ȍ��ۂ�";
		mes "�@�������邩������Ȃ��]";
		set IL_LUANDA_QUE,19;
		viewpoint 1, 118, 100, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 118, 102;
		end;
	case 20:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]�J���ƃA�X�f���̘b�������]";
		next;
		mes "[�������_]";
		mes "�J�c�c";
		next;
		mes "[�������_]";
		mes "�J���Z�c�c�B";
		mes "�J���Z�̐S�̒���";
		mes "�`�o���񂪑S�Ăł��B";
		next;
		mes "[�������_]";
		mes "������A�`�o����";
		mes "�􂢂��󂯂�����";
		mes "�J���Z�̔߂��݂́A";
		mes "���ł͑z���ł������ɂ�";
		mes "����܂���c�c�B";
		next;
		mes "[�������_]";
		mes "���ł��炱��Ȃɔ߂����̂ɁA";
		mes "�\�͂����}�I���m������";
		mes "�ǂ��ɂ��Ȃ��Ă��܂��ł��傤�B";
		next;
		mes "[�������_]";
		mes "�\�m�����o���Ă��A";
		mes "���ǁA�������Ȃ��̂ł́c�c�B";
		mes "��������������";
		mes "�d������܂���c�c�B";
		next;
		mes "�]�����𑱂����";
		mes "�@�V���Ȍ��ۂ�";
		mes "�@�������邩������Ȃ��]";
		set IL_LUANDA_QUE,21;
		viewpoint 1, 263, 72, 1, 0xFF0000;
		next;
		mes "�]�}���Ō����ɍs���܂����H�]";
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", 261, 72;
		end;
	case 22:
		mes "[�������_]";
		mes "�`���҂��܁A";
		mes "�ǂ��Ȃ����܂������H";
		next;
		mes "�]���҂��̕s���ȉ�b��`�����]";
		next;
		mes "[�������_]";
		mes "�󋵂��炵��";
		mes "����_���E�[�^������";
		mes "���Α��̉�b��";
		mes "���������悤�ł��ˁB";
		next;
		mes "[�������_]";
		mes "����ɁA�p�Y�𓾂��ƁH";
		mes "�ŋ߁A�z�炪����";
		mes "��l�����������R��";
		mes "�����ɂ���̂�������܂���B";
		next;
		mes "[�������_]";
		mes "�܂�A�z��̒���";
		mes "�����͂̂���p�Y�����ꂽ�ƁB";
		mes "�����āA�͂�~��";
		mes "�U�ߓ��錄���f���Ă����c�c�H";
		next;
		mes "[�������_]";
		mes "�����A�����Ȃ�A";
		mes "���B�����ɏo������";
		mes "����_�����Ƃ�����";
		mes "�\�ł��傤�ˁB";
		next;
		mes "[�������_]";
		mes "�ł��A����܂����B";
		mes "���B�����ɍs���Ȃ����";
		mes "���̕�炵�����藧���܂���B";
		mes "�������A�����퓬�ƂȂ��";
		mes "�h���̂�����Ƃ̏�ԁB";
		mes "�������Ƃ��ďP��ꂽ���͂�c�c�B";
		next;
		mes "[�������_]";
		mes "�c�c�ߊς��Ă���ꍇ�ł�";
		mes "����܂���ˁB";
		mes "�h��{�݂𑝂₵�A";
		mes "�O��I�ɑ΍􂵂Ȃ��ẮB";
		next;
		mes "[�������_]";
		mes "����ɁA����ȗ́A";
		mes "�Ƃ����̂������ł��B";
		next;
		mes "[�������_]";
		mes "�����X�^�[��";
		mes "�����P������ړI�ł��傤���H";
		mes "�Ƃ������A�����ɓ`����";
		mes "�������܂��傤�B";
		next;
		mes "[�������_]";
		mes "���܂�";
		mes "���肪�Ƃ��������܂����B";
		mes "�`���҂��܁B";
		mes "��V�����n�����Ȃ���΁B";
		next;
		mes "[�������_]";
		mes "����܂œ`���Ă����������b��";
		mes "�����̌��z��";
		mes "�߂��Ȃ��̂�������܂���B";
		mes "�����͌��肵�Ă���";
		mes "�̂�������܂���B";
		next;
		mes "[�������_]";
		mes "�ł����A������߂�";
		mes "�����������Ȃ����A";
		mes "���̎��o�������̂��Ƃ�";
		mes "���������A";
		mes "�����͏��������ǂ�����";
		mes "�ς�邩������܂���B";
		next;
		mes "[�������_]";
		mes "�c�c�ς��Ȃ��A";
		mes "�̂�������܂���B";
		mes "�c�c���Ƃ��Ă��c�c";
		next;
		emotion 15;
		mes "[�������_]";
		mes "��]�I�Ȗ������҂��Ă��Ă��A";
		mes "�킸���ł��\����";
		mes "�c���Ă���̂Ȃ�A";
		mes "���͂����M����";
		mes "�S�g�S��ő�����삷�邱�Ƃ�";
		mes "���߂܂����B";
		next;
		if(checkitemblank() == 0) {
			mes "^ff0000�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		set IL_LUANDA_QUE,23;
		setquest 202115;
		delquest 5847;
		getitem 25271,10;
		getexp 300000000,0,1;
		getexp 0,60000000,0;
		mes "[�������_]";
		mes "�`���҂��܂�";
		mes "���ɂ�邬�Ȃ�";
		mes "��]��^���Ă���܂����B";
		mes "���̊�]��";
		mes "�����Č��z�ł͂���܂���B";
		next;
		mes "�]�������_�̘b���I����";
		mes "�@�ӂ肪�����ɕ�܂ꂽ�]";
		close2;
		warp "beach_dun2.gat", 249, 243;
		end;
	case 23:
		warp "beach_dun2.gat", 249, 243;
		end;
	}
	mes "[�������_]";
	mes "�`���҂��܁A";
	mes "�ǂ��Ȃ����܂������H";
	next;
	switch(select("���ӂ������","�f���Ƃ́H","���̓��A�͈�̂Ȃ�ł����H","�����X�^�[���N�����闝�R�Ƃ́H","���̏������")) {
	case 1:
		mes "�]�}���Ō����ɍs���܂����H�]";
		switch(IL_LUANDA_QUE) {
		case 2:
			viewpoint 1, 153, 33, 1, 0xFF0000;
			viewpoint 1, 118, 100, 2, 0xFF0000;
			viewpoint 1, 193, 267, 3, 0xFF0000;
			viewpoint 1, 228, 91, 4, 0xFF0000;
			viewpoint 1, 208, 130, 5, 0xFF0000;
			viewpoint 1, 42, 215, 6, 0xFF0000;
			viewpoint 1, 263, 72, 7, 0xFF0000;
			set '@x,193; set '@y,265;
			break;
		case 4: case 5: case 15:
			viewpoint 1, 153, 33, 1, 0xFF0000;
			set '@x,153; set '@y,35;
			break;
		case 7: case 19:
			viewpoint 1, 118, 100, 1, 0xFF0000;
			set '@x,118; set '@y,102;
			break;
		case 9:
			viewpoint 1, 193, 267, 1, 0xFF0000;
			set '@x,193; set '@y,265;
			break;
		case 11:
			viewpoint 1, 228, 91, 1, 0xFF0000;
			set '@x,228; set '@y,89;
			break;
		case 13:
			viewpoint 1, 208, 130, 1, 0xFF0000;
			set '@x,206; set '@y,130;
			break;
		case 17:
			viewpoint 1, 42, 215, 1, 0xFF0000;
			set '@x,42; set '@y,217;
			break;
		case 21:
			viewpoint 1, 263, 72, 1, 0xFF0000;
			set '@x,261; set '@y,72;
			break;
		}
		next;
		if(select("�}���Ō����(�V���[�g�J�b�g)","�����Č����") == 2) {
			mes "�]�����Č���邱�Ƃɂ����]";
			close;
		}
		warp "com_d02_i_q.gat", '@x, '@y;
		end;
	case 2:
		mes "[�������_]";
		mes "���ŕ�W���̈˗���";
		mes "�f����";
		mes "���肢���邱�ƂɂȂ�܂��B";
		next;
		mes "[�������_]";
		mes "���̓����X�^�[����l�����̂�";
		mes "�˗��͂���܂���B";
		mes "�ł����A���\��邩";
		mes "������Ȃ��̂�";
		mes "���������肢���܂��B";
		next;
		mes "[�������_]";
		mes "���I�Y��Ă��܂����B";
		mes "�����͐��̐^�񒆂ɂȂ�̂ŁA";
		mes "���S�̖��Ōf����";
		mes "�������ɐݒu����Ă܂��B";
		close;
	case 3:
		mes "[�������_]";
		mes "���̃������_���A��";
		mes "�헪�I�ɂ݂�ƁA";
		mes "���̖k���ɒʂ���B��̓��ł��B";
		next;
		mes "[�������_]";
		mes "�����炱���A";
		mes "���B�͂�����";
		mes "�����X�^�[�̐N����";
		mes "�h���ł���̂ł��B";
		next;
		menu "�������_���A�H�������_�H",-;
		mes "[�������_]";
		mes "���A�C�t���܂����ˁH";
		mes "�����ł��B";
		mes "���̖��O���������_�ł��B";
		next;
		mes "[�������_]";
		mes "���̂������ܒB�̘b�ɂ��Ɓc�c";
		mes "�Z��̖��O��";
		mes "���̓��A�̖��ɂ��Ȃ�ŁA";
		mes "�J���A�}�I�Ɩ��t���������ł��B";
		next;
		mes "[�������_]";
		mes "�c�����A���̗c�����";
		mes "���X���炩���܂������A";
		mes "���O�ɕs���͂���܂���ł����B";
		next;
		mes "[�������_]";
		mes "���ɓ`�����_�B�̖���";
		mes "�R���ƕ����܂�����A";
		mes "�ނ���ւ炵���ł��B";
		close;
	case 4:
		mes "[�������_]";
		mes "��������������";
		mes "�悭������܂���B";
		mes "���R��������ΑΏ��̂��悤��";
		mes "����Ǝv���̂ł����B";
		next;
		mes "[�������_]";
		mes "�����͐H�Ƃ��L�x�ȑ��ł��Ȃ����A";
		mes "�����X�^�[���_�����R�Ȃ�";
		mes "�Ȃ��͂��Ȃ̂ł��B";
		next;
		mes "[�������_]";
		mes "�󋵂��ς��Ȃ��Ƃ��Ă�";
		mes "���B�͂�����";
		mes "�Z�ݑ��������ł��B";
		close;
	case 5:
		mes "[�������_]";
		mes "�ł͂���J���܂ł��B";
		mes "�`���҂��܁B";
		close;
	}
OnTouch:
	if(IL_LUANDA_QUE == 1) {
		unittalk "�������_ : ���̓������_�B�����ɋ���̂͂ǂȂ��ł����H";
		mes "[�������_]";
		mes "���̓������_�B";
		mes "�����ɋ���̂͂ǂȂ��ł����H";
		next;
		mes "�]�������_�Ɩ����j��";
		mes "�@����������ꂽ�B";
		mes "�@��b���Ă݂悤�]";
		close;
	}
	end;
}
com_d02_i_q.gat,249,250,4	script	�f����#ILU_007	857,{
	mes "�]�߂��̑������Ă��f���̂悤���]";
	close;
}
com_d02_i_q.gat,153,33,1	script	��炬#ILU_008	723,1,1,{
	misceffect 589;
	set '@id,substr(strnpcinfo(2),4);
	switch(IL_LUANDA_QUE) {
	case 2:
		mes "�]�z�����܂ꂻ���ȁA";
		mes "�@����Ȍ��ۂ��]";
		next;
		mes "�]���߂����Ȃ����ۂƎv����B";
		mes "�@�������_�ɓ`���悤�]";
		set IL_LUANDA_QUE,3;
		viewpoint 2, 153, 33, 1, 0xFF0000;
		viewpoint 2, 118, 100, 2, 0xFF0000;
		viewpoint 2, 193, 267, 3, 0xFF0000;
		viewpoint 2, 228, 91, 4, 0xFF0000;
		viewpoint 2, 208, 130, 5, 0xFF0000;
		viewpoint 2, 42, 215, 6, 0xFF0000;
		viewpoint 2, 263, 72, 7, 0xFF0000;
		next;
		mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
		next;
		if(select("�߂�","�܂������ɋ���") == 2) {
			mes "�]���Ȃ��͂��̏�ɗ��܂����]";
			close;
		}
		warp "com_d02_i_q.gat", 241, 248;
		end;
	case 4:
		if('@id == 8) {
			cloakoffnpc "�]�T�Ȋ���̐N#ILU_015";
			cloakoffnpc "�������_�ƌĂ΂ꂽ�N#ILU_016";
			cloakoffnpc "���񂾖ڂ̐N#ILU_017";
			unittalk getnpcid(0,"�]�T�Ȋ���̐N#ILU_015"),"�]�T�Ȋ���̐N : ���͑ދ����ȁB�������_�B";
			unittalk getnpcid(0,"���񂾖ڂ̐N#ILU_017"),"���񂾖ڂ̐N : �����ł�����B�������_�Z�B";
			end;
		}
		break;
	case 5:
		if('@id == 8) {
			cloakoffnpc "�������_�ƌĂ΂ꂽ�N#ILU_016";
			end;
		}
		break;
	case 7:
		if('@id == 9) {
			cloakoffnpc "�J��#ILU_018";
			cloakoffnpc "�A�X�f��#ILU_019";
			end;
		}
		break;
	case 9:
		if('@id == 10) {
			cloakoffnpc "�ǉ��`���������_#ILU_020";
			end;
		}
		break;
	case 11:
		if('@id == 11) {
			cloakoffnpc "�}�I#ILU_021";
			end;
		}
		break;
	case 13;
		if('@id == 12) {
			cloakoffnpc "���������郋�����_#ILU_022";
			end;
		}
		break;
	case 15:
		if('@id == 8) {
			cloakoffnpc "����#ILU_023";
			cloakoffnpc "���l#ILU_024";
			cloakoffnpc "���l#ILU_025";
			cloakoffnpc "���l#ILU_026";
			unittalk getnpcid(0,"����#ILU_023"),"���� : �F�A���������I";
			unittalk getnpcid(0,"���l#ILU_024"),"���l : �ǂ�����΁c�c�B";
			unittalk getnpcid(0,"���l#ILU_025"),"���l : �O�q�͂܂����I";
			unittalk getnpcid(0,"���l#ILU_026"),"���l : ���������Ȃ��ƁI";
			end;
		}
		break;
	case 17:
		if('@id == 13) {
			cloakoffnpc "�J��#ILU_027";
			cloakoffnpc "��R�Ƃ��郋�����_#ILU_";
			cloakoffnpc "�}�I#ILU_029";
			unittalk getnpcid(0,"�J��#ILU_027"),"�J�� : �悤�₭�A�ꂻ�����ȁB�}�I�B";
			end;
		}
		break;
	case 19:
		if('@id == 9) {
			cloakoffnpc "�J��#ILU_030";
			cloakoffnpc "�A�X�f��#ILU_031";
			cloakonnpc "�A�X�f��#ILU_032";
			end;
		}
		break;
	case 21:
		if('@id == 14) {
			cloakoffnpc "�V���G�b�g#ILU_033";
			cloakoffnpc "�V���G�b�g#ILU_034";
			end;
		}
		break;
	default:
		mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
		next;
		if(select("�߂�","�܂������ɋ���") == 2) {
			mes "�]���Ȃ��͂��̏�ɗ��܂����]";
			close;
		}
		warp "com_d02_i_q.gat", 241, 248;
		end;
	}
	mes "�]���ɉ����N����Ȃ��B";
	mes "�@���̏ꏊ��T���ɍs���܂����H�]";
	next;
	if(select("�͂�","������") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	switch(IL_LUANDA_QUE) {
	case 4: case 5: case 15:
		set '@x,153; set '@y,35;
		break;
	case 7: case 19:
		set '@x,118; set '@y,102;
		break;
	case 9:
		set '@x,193; set '@y,265;
		break;
	case 11:
		set '@x,228; set '@y,89;
		break;
	case 13:
		set '@x,206; set '@y,130;
		break;
	case 17:
		set '@x,42; set '@y,217;
		break;
	case 21:
		set '@x,261; set '@y,72;
		break;
	}
	warp "com_d02_i_q.gat", '@x, '@y;
	end;
OnTouch:
	misceffect 589;
	set '@id,substr(strnpcinfo(2),4);
	switch(IL_LUANDA_QUE) {
	case 4:
		if('@id == 8) {
			cloakoffnpc "�]�T�Ȋ���̐N#ILU_015";
			cloakoffnpc "�������_�ƌĂ΂ꂽ�N#ILU_016";
			cloakoffnpc "���񂾖ڂ̐N#ILU_017";
			unittalk getnpcid(0,"�]�T�Ȋ���̐N#ILU_015"),"�]�T�Ȋ���̐N : ���͑ދ����ȁB�������_�B";
			unittalk getnpcid(0,"���񂾖ڂ̐N#ILU_017"),"���񂾖ڂ̐N : �����ł�����B�������_�Z�B";
		}
		break;
	case 5:
		if('@id == 8) {
			cloakoffnpc "�������_�ƌĂ΂ꂽ�N#ILU_016";
		}
		break;
	case 7:
		if('@id == 9) {
			cloakoffnpc "�J��#ILU_018";
			cloakoffnpc "�A�X�f��#ILU_019";
		}
		break;
	case 9:
		if('@id == 10) {
			cloakoffnpc "�ǉ��`���������_#ILU_020";
		}
		break;
	case 11:
		if('@id == 11) {
			cloakoffnpc "�}�I#ILU_021";
		}
		break;
	case 13;
		if('@id == 12) {
			cloakoffnpc "���������郋�����_#ILU_022";
		}
		break;
	case 15:
		if('@id == 8) {
			cloakoffnpc "����#ILU_023";
			cloakoffnpc "���l#ILU_024";
			cloakoffnpc "���l#ILU_025";
			cloakoffnpc "���l#ILU_026";
			unittalk getnpcid(0,"����#ILU_023"),"���� : �F�A���������I";
			unittalk getnpcid(0,"���l#ILU_024"),"���l : �ǂ�����΁c�c�B";
			unittalk getnpcid(0,"���l#ILU_025"),"���l : �O�q�͂܂����I";
			unittalk getnpcid(0,"���l#ILU_026"),"���l : ���������Ȃ��ƁI";
		}
		break;
	case 17:
		if('@id == 13) {
			cloakoffnpc "�J��#ILU_027";
			cloakoffnpc "��R�Ƃ��郋�����_#ILU_";
			cloakoffnpc "�}�I#ILU_029";
			unittalk getnpcid(0,"�J��#ILU_027"),"�J�� : �悤�₭�A�ꂻ�����ȁB�}�I�B";
		}
		break;
	case 19:
		if('@id == 9) {
			cloakoffnpc "�J��#ILU_030";
			cloakoffnpc "�A�X�f��#ILU_031";
			cloakonnpc "�A�X�f��#ILU_032";
		}
		break;
	case 21:
		if('@id == 14) {
			cloakoffnpc "�V���G�b�g#ILU_033";
			cloakoffnpc "�V���G�b�g#ILU_034";
		}
		break;
	}
	end;
}
com_d02_i_q.gat,118,100,1	duplicate(��炬#ILU_008)	��炬#ILU_009	723,1,1
com_d02_i_q.gat,193,267,1	duplicate(��炬#ILU_008)	��炬#ILU_010	723,1,1
com_d02_i_q.gat,228,91,1	duplicate(��炬#ILU_008)	��炬#ILU_011	723,1,1
com_d02_i_q.gat,208,130,1	duplicate(��炬#ILU_008)	��炬#ILU_012	723,1,1
com_d02_i_q.gat,42,215,1	duplicate(��炬#ILU_008)	��炬#ILU_013	723,1,1
com_d02_i_q.gat,263,72,1	duplicate(��炬#ILU_008)	��炬#ILU_014	723,1,1
com_d02_i_q.gat,154,41,4	script	�]�T�Ȋ���̐N#ILU_015	843,{
	unittalk "�]�T�Ȋ���̐N : ���͑ދ����ȁB�������_�B";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,152,40,6	script	�������_�ƌĂ΂ꂽ�N#ILU_016	843,{
	switch(IL_LUANDA_QUE) {
	case 4:
		cloakoffnpc "�]�T�Ȋ���̐N#ILU_015";
		cloakoffnpc "���񂾖ڂ̐N#ILU_017";
		unittalk "�������_�ƌĂ΂ꂽ�N : �J���Z�A�����͍ς݂܂������H���낻��o�����܂��傤�B�啪���Ԃ��o���܂����B";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�J���Z�A�����͍ς݂܂������H";
		mes "���낻��o�����܂��傤�B";
		mes "�啪���Ԃ��o���܂����B";
		next;
		unittalk getnpcid(0,"�]�T�Ȋ���̐N#ILU_015"),"�J�� : �������ȁB�������_�̌����ʂ�A�����ɏo�����悤���B���ȋC�z��������c�c�B�ǂ��v���H�@�}�I�B";
		mes "[�J��]";
		mes "�������ȁB�������_�̌����ʂ�A";
		mes "�����ɏo�����悤���B";
		mes "���ȋC�z��������c�c�B";
		mes "�ǂ��v���H�}�I�B";
		next;
		unittalk getnpcid(0,"���񂾖ڂ̐N#ILU_017"),"�}�I : �͂��I�@�A�j�L�B���傰���ȁB�������̈���A��ςȂ��Ƃ��N�����Ȃ��B�c�c��H";
		mes "[�}�I]";
		mes "�͂��I�A�j�L�B���傰���ȁB";
		mes "�������̈���A";
		mes "��ςȂ��Ƃ��N�����Ȃ��B";
		mes "�c�c��H";
		next;
		unittalk getnpcid(0,"���񂾖ڂ̐N#ILU_017"),"�}�I : �A�j�L�B�A�������ɒN������B�ٖM�l�H";
		mes "[�}�I]";
		mes "�A�j�L�B�A";
		mes "�������ɒN������B";
		mes "�ٖM�l�H";
		next;
		unittalk getnpcid(0,"���񂾖ڂ̐N#ILU_017"),"�}�I : �c�c�ٖM�l�݂������B�I���̋L������������΁A���̕ӂ��ጩ�����Ȃ��炾�ȁB";
		mes "[�}�I]";
		mes "�c�c�ٖM�l�݂������B";
		mes "�I���̋L������������΁A";
		mes "���̕ӂ��ጩ�����Ȃ��炾�ȁB";
		next;
		unittalk getnpcid(0,"�]�T�Ȋ���̐N#ILU_015"),"�J�� : �}�I�̋L���͂Ȃ�ԈႢ�Ȃ��B�ٖM�l�Ȃ�Ē������ȁB";
		mes "[�J��]";
		mes "�}�I�̋L���͂Ȃ�";
		mes "�ԈႢ�Ȃ��B";
		mes "�ٖM�l�Ȃ�Ē������ȁB";
		next;
		unittalk "�������_�ƌĂ΂ꂽ�N : �J���Z�A���̗l�q�Ȃ�댯�ȓz�ł͂���܂���B�ł����A�����������Ă������܂��񂵁A�C�ɂ����o�����܂��傤�B";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�J���Z�A���̗l�q�Ȃ�";
		mes "�댯�ȓz�ł͂���܂���B";
		mes "�ł����A";
		mes "�����������Ă������܂��񂵁A";
		mes "�C�ɂ����o�����܂��傤�B";
		next;
		unittalk getnpcid(0,"���񂾖ڂ̐N#ILU_017"),"�}�I : �I���������s����B";
		mes "[�}�I]";
		mes "�I���������s����B";
		next;
		unittalk getnpcid(0,"�]�T�Ȋ���̐N#ILU_015"),"�J�� : �ӂށc�c�B�����A�������_�B���O�̊�A���ٖ̈M�l�ɉ��������������ȁH�@�}�I�A�{�N�B������ɏo�����悤���B";
		mes "[�J��]";
		mes "�ӂށc�c�B";
		mes "�����A�������_�B";
		mes "���O�̊�A���ٖ̈M�l��";
		mes "���������������ȁH";
		mes "�}�I�A�{�N�B������ɏo�����悤���B";
		next;
		unittalk getnpcid(0,"�]�T�Ȋ���̐N#ILU_015"),"�J�� : �������_�I�@�I������痈���B���܂�x��Ȃ��悤�ɂȁ[�B";
		mes "[�J��]";
		mes "�������_�I�I������痈���B";
		mes "���܂�x��Ȃ��悤�ɂȁ[�B";
		next;
		unittalk "�������_�ƌĂ΂ꂽ�N : �͂��A�J���Z�B";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�͂��A�J���Z�B";
		if(!sleep2(2000)) end;
		set IL_LUANDA_QUE,5;
		cloakonnpc "�]�T�Ȋ���̐N#ILU_015";
		cloakoffnpc;
		cloakonnpc "���񂾖ڂ̐N#ILU_017";
		next;
		unittalk "�������_�ƌĂ΂ꂽ�N : �c�c���̕��B������Ƙb������܂��B";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�c�c���̕��B";
		mes "������Ƙb������܂��B";
		close;
	case 5:
		unittalk "�������_�ƌĂ΂ꂽ�N : �c�c���Ȃ�����͑P�̋C�����������Ȃ��B�����������҂ł��H";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�c�c���Ȃ������";
		mes "�P�̋C�����������Ȃ��B";
		mes "�����������҂ł��H";
		next;
		menu "�������_�H",-;
		unittalk "�������_�ƌĂ΂ꂽ�N : �Ȍ��ɘb���܂��B���ɂ͓��ʂȗ͂������ł��B�ł��c�c�����s���悭��������킯�ł͂���܂���B";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�Ȍ��ɘb���܂��B";
		mes "���ɂ͓��ʂȗ͂������ł��B";
		mes "�ł��c�c�����s���悭";
		mes "��������킯�ł͂���܂���B";
		next;
		unittalk "�������_�ƌĂ΂ꂽ�N : �����l�ł͂Ȃ��悤�����璉�����܂��B���������̒n���痣��āB";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�����l�ł͂Ȃ��悤������";
		mes "�������܂��B";
		mes "���������̒n���痣��āB";
		next;
		unittalk "�������_�ƌĂ΂ꂽ�N : ����Șb�A�M���Ȃ����낤���A�M���������Ȃ����獡�܂ŒN�ɂ��b�������Ƃ͂Ȃ��������ǁc�c�B";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "����Șb�A";
		mes "�M���Ȃ����낤���A";
		mes "�M���������Ȃ�����";
		mes "���܂ŒN�ɂ��b�������Ƃ�";
		mes "�Ȃ��������ǁc�c�B";
		next;
		unittalk "�������_�ƌĂ΂ꂽ�N : �����ꂱ�̑��͐����̃����X�^�[�ɏP������܂��B���ʎ��ɂ������Ȃ��Ȃ炱�̒n���瑁������Ă��������B";
		mes "[�������_�ƌĂ΂ꂽ�N]";
		mes "�����ꂱ�̑���";
		mes "�����̃����X�^�[��";
		mes "�P������܂��B";
		mes "���ʎ��ɂ������Ȃ��Ȃ�";
		mes "���̒n���瑁������Ă��������B";
		if(!sleep2(2000)) end;
		set IL_LUANDA_QUE,6;
		cloakonnpc "�]�T�Ȋ���̐N#ILU_015";
		cloakonnpc;
		cloakonnpc "���񂾖ڂ̐N#ILU_017";
		next;
		mes "�]���������ƁA�N��2�l��ǂ��ď������B";
		mes "�@�������_�Ƃ������肾���A";
		mes "�@���Ζʂ̂悤�Ȍ����������B";
		mes "�@�������_������͂��̏ꏊ�ɖ߂�A";
		mes "�@���o���������Ƃ��A";
		mes "�@�������_�ɓ`���悤�]";
		next;
		mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
		next;
		if(select("�߂�","�܂������ɋ���") == 2) {
			mes "�]���Ȃ��͂��̏�ɗ��܂����]";
			close;
		}
		warp "com_d02_i_q.gat", 241, 248;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,156,39,4	script	���񂾖ڂ̐N#ILU_017	843,{
	unittalk "���񂾖ڂ̐N : �����ł�����B�������_�Z�B";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,121,95,4	script	�J��#ILU_018	843,{
	unittalk getnpcid(0,"�A�X�f��#ILU_019"),"�A�X�f�� : �J���c�c�����̎��͂������ł����H";
	mes "[�A�X�f��]";
	mes "�J���c�c";
	mes "�����̎��͂������ł����H";
	next;
	unittalk "�J�� : �n�n�b�A�A�X�f���B�{�N�̘r��M�����Ȃ��̂����H�@�����������ʂ�A�{�N�̐�ʂ���Ԃ��������I";
	mes "[�J��]";
	mes "�n�n�b�A�A�X�f���B";
	mes "�{�N�̘r��M�����Ȃ��̂����H";
	mes "�����������ʂ�A";
	mes "�{�N�̐�ʂ���Ԃ��������I";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_019"),"�A�X�f�� : �����I�@�c�c�R���B�}�I����񂩂炳�����S�������Ă��܂��B";
	mes "[�A�X�f��]";
	mes "�����I�c�c�R���B";
	mes "�}�I����񂩂�";
	mes "�������S�������Ă��܂��B";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_019"),"�A�X�f�� : �������������_�N�ƃ}�I����񂾂����A���������Ď���������ł����āH�@���Ȃ��͖؂̏�ɐQ���ׂ��Đ������Ŏd�������āB";
	mes "[�A�X�f��]";
	mes "�������������_�N��";
	mes "�}�I����񂾂����A";
	mes "����������";
	mes "����������ł����āH";
	mes "���Ȃ��͖؂̏�ɐQ���ׂ���";
	mes "�������Ŏd�������āB";
	next;
	unittalk "�J�� : �����c�c������]�v�Ȃ��ƌ����₪�������c�c�B";
	mes "[�J��]";
	mes "�����c�c";
	mes "������]�v�Ȃ���";
	mes "�����₪�������c�c�B";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_019"),"�A�X�f�� : �{���c�c���ꂽ�I�@�Z���1�Ԃ̘r�O�Ȃ̂ɁA1�Ԃ��C���Ȃ��̂�ˁB";
	mes "[�A�X�f��]";
	mes "�{���c�c���ꂽ�I";
	mes "�Z���1�Ԃ̘r�O�Ȃ̂ɁA";
	mes "1�Ԃ��C���Ȃ��̂�ˁB";
	next;
	unittalk "�J�� : �Ȃ��ɁA�{�N�̖ڂ͖{���ɕK�v�Ȏ��ɂ������ɗ��Ă΂����B��͒�B�ɔC���āA�T�{���Ă��ėǂ��̂��B";
	mes "[�J��]";
	mes "�Ȃ��ɁA�{�N�̖ڂ�";
	mes "�{���ɕK�v�Ȏ��ɂ���";
	mes "���ɗ��Ă΂����B";
	mes "��͒�B�ɔC���āA";
	mes "�T�{���Ă��ėǂ��̂��B";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_019"),"�A�X�f�� : �܂�����Ȃ��ƌ����āc�c�B����H�@�������ɒN���c�c�B���̕�������H";
	mes "[�A�X�f��]";
	mes "�܂�����Ȃ��ƌ����āc�c�B";
	mes "����H�������ɒN���c�c�B";
	mes "���̕�������H";
	next;
	unittalk "�J�� : �Ȃ񂾂��āI�H�@����ȁA�B�ꂽ�f�[�g�X�|�b�g�ɒN������Ȃ�āc�c�B�����c�c�{���Ƀc���Ă��Ȃ��B��D�̃f�[�g���a�������̂ɁB�����[�B";
	mes "[�J��]";
	mes "�Ȃ񂾂��āI�H����ȁA";
	mes "�B�ꂽ�f�[�g�X�|�b�g��";
	mes "�N������Ȃ�āc�c�B";
	mes "�����c�c�{���Ƀc���Ă��Ȃ��B";
	mes "��D�̃f�[�g���a�������̂ɁB";
	mes "�����[�B";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_019"),"�A�X�f�� : ���������B�킽���͕ʂɂǂ��Řb���������Ă��܂�Ȃ���H";
	mes "[�A�X�f��]";
	mes "���������B�킽���͕ʂ�";
	mes "�ǂ��Řb����������";
	mes "���܂�Ȃ���H";
	next;
	unittalk "�J�� : ����A���ꂶ�Ⴀ���[�h�������Ȃ��B�c�c�����A�܂����I�@�A�X�f���B���̃f�[�g�X�|�b�g�փG�X�R�[�g���悤�B�����̐l�A�{�N�B�̕��܂ł�����肵�Ă�����ȁ[�I";
	mes "[�J��]";
	mes "����A���ꂶ�Ⴀ���[�h�������Ȃ��B";
	mes "�c�c�����A�܂����I�A�X�f���B";
	mes "���̃f�[�g�X�|�b�g��";
	mes "�G�X�R�[�g���悤�B";
	mes "�����̐l�A�{�N�B�̕��܂�";
	mes "������肵�Ă�����ȁ[�I";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,8;
	cloakonnpc;
	cloakonnpc "�A�X�f��#ILU_019";
	next;
	mes "�]�f�[�g�̎ז��������悤��";
	mes "�@�\����Ȃ��Ȃ����B";
	mes "�@�o�������b��";
	mes "�@�������_�ɓ`���悤�]";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,120,95,6	script	�A�X�f��#ILU_019	90,{
	unittalk "�A�X�f�� : �f�G�ȂƂ����ˁc�c�B";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,191,271,8	script	�ǉ��`���������_#ILU_020	843,{
	unittalk "�ǉ��`���������_ : ����c�c�����o�������ǁc�c���̘r�ɂ��Ă͗��h�ȕǉ悾��ȁB";
	mes "[�ǉ��`���������_]";
	mes "����c�c�����o�������ǁc�c";
	mes "���̘r�ɂ��Ă�";
	mes "���h�ȕǉ悾��ȁB";
	next;
	unittalk "�ǉ��`���������_ : �����Ō����ʂ�ɏo�������ǁA�ǂ��������͕ς��Ȃ��B";
	mes "[�ǉ��`���������_]";
	mes "�����Ō����ʂ�ɏo�������ǁA";
	mes "�ǂ��������͕ς��Ȃ��B";
	next;
	unittalk "�ǉ��`���������_ : �����͕ǉ�̒��̌��i�B�����̋󖲁B�c�c�����ł����ė~�������ǁA���Ǒ��́c�c�B";
	mes "[�ǉ��`���������_]";
	mes "�����͕ǉ�̒��̌��i�B";
	mes "�����̋󖲁B";
	mes "�c�c�����ł����ė~�������ǁA";
	mes "���Ǒ��́c�c�B";
	next;
	unittalk "�ǉ��`���������_ : �����͕ς��Ȃ��B�������Ă���͂��Ȃ̂ɂȂ��A���͂���Ȃ��Ƃ����Ă���񂾂낤�c�c�B";
	mes "[�ǉ��`���������_]";
	mes "�����͕ς��Ȃ��B";
	mes "�������Ă���͂��Ȃ̂ɂȂ��A";
	mes "���͂���Ȃ��Ƃ�";
	mes "���Ă���񂾂낤�c�c�B";
	next;
	unittalk "�ǉ��`���������_ : ����H�@���Ȃ��́c�c";
	mes "[�ǉ��`���������_]";
	mes "����H";
	mes "���Ȃ��́c�c";
	next;
	menu "�����",-;
	unittalk "�ǉ��`���������_ : ���I�@���Ȃ��́I�@�`���҂��܁I�I�@�Ȃ��A�܂����̒n�ɂ���������̂ł����I�H�@�������H�ɖ߂����Ɓc�c";
	mes "[�ǉ��`���������_]";
	mes "���I���Ȃ��́I";
	mes "�`���҂��܁I�I";
	mes "�Ȃ��A�܂����̒n��";
	mes "����������̂ł����I�H";
	mes "�������H�ɖ߂����Ɓc�c";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,10;
	cloakonnpc;
	next;
	mes "�]�ǉ��`���������_��";
	mes "�@��b�̓r���ŏ����������B";
	mes "�@�o�������b��";
	mes "�@�������_�ɓ`���悤�]";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,228,95,4	script	�}�I#ILU_021	843,{
	unittalk "�}�I : �`�N�V���E�I�@���ŃI���͂���ȂɎア�񂾁I�@�A�j�L�B�ƈ���Đ퓬�Ŗ𗧂����̔\�͂Ȃ�āc�c�B";
	mes "[�}�I]";
	mes "�`�N�V���E�I";
	mes "���ŃI���͂���ȂɎア�񂾁I";
	mes "�A�j�L�B�ƈ����";
	mes "�퓬�Ŗ𗧂�����";
	mes "�\�͂Ȃ�āc�c�B";
	next;
	unittalk "�}�I : ��H�@�I�A�I�}�G�́I�@���Ɍ��������A�������_�Z���璉�����󂯂��ٖM�l�I";
	mes "[�}�I]";
	mes "��H�I�A�I�}�G�́I";
	mes "���Ɍ��������A";
	mes "�������_�Z����";
	mes "�������󂯂�";
	mes "�ٖM�l�I";
	next;
	unittalk "�}�I : ���������΂��̎��������ȁB�������_�Z���������������Ēm�����̂́B�Ӂ[��c�c�A�������B�I�}�G�A�������߉�݂������ȁH";
	mes "[�}�I]";
	mes "���������΂��̎��������ȁB";
	mes "�������_�Z��";
	mes "�������������Ēm�����̂́B";
	mes "�Ӂ[��c�c�A�������B";
	mes "�I�}�G�A";
	mes "�������߉�݂������ȁH";
	next;
	unittalk "�}�I : �܂��A����������̉����B���ȏЉ�悤�B�I���̓}�I�B�������_�Z�̒�B";
	mes "[�}�I]";
	mes "�܂��A����������̉����B";
	mes "���ȏЉ�悤�B";
	mes "�I���̓}�I�B";
	mes "�������_�Z�̒�B";
	next;
	menu "�����",-;
	unittalk "�}�I : �͂͂́A��Ċ��������B�C�t������������Ȃ����ǁA�I���B�Z��͎O�q���B";
	mes "[�}�I]";
	mes "�͂͂́A��Ċ��������B";
	mes "�C�t������������Ȃ����ǁA";
	mes "�I���B�Z��͎O�q���B";
	next;
	unittalk "�}�I : �Ԃ�V�̍��A���̒����Ŏ̂Ă��Ă����Ƃ�����݂�Ȃ��E���Ĉ�ĂĂ��ꂽ�B";
	mes "[�}�I]";
	mes "�Ԃ�V�̍��A";
	mes "���̒����Ŏ̂Ă��Ă����Ƃ����";
	mes "�݂�Ȃ��E����";
	mes "��ĂĂ��ꂽ�B";
	next;
	unittalk "�}�I : ���̎��ӂ̓��A�̖��ɂ��Ȃ�ŁA�J���A�������_�A�}�I�Ɩ��t���Ă���Ă��B�I���͖����q�̃}�I���B";
	mes "[�}�I]";
	mes "���̎��ӂ̓��A�̖��ɂ��Ȃ�ŁA";
	mes "�J���A�������_�A�}�I��";
	mes "���t���Ă���Ă��B";
	mes "�I���͖����q�̃}�I���B";
	next;
	unittalk "�}�I : �́A����������Ƃ�������_�B�̖��O�Ȃ񂾂��B";
	mes "[�}�I]";
	mes "�́A����������Ƃ�����";
	mes "���_�B�̖��O�Ȃ񂾂��B";
	next;
	unittalk "�}�I : ���͂��A�A�j�L�B�ɏ����ł��S�z�����Ȃ��悤�ɏC�s�����Ăāc�c�B";
	mes "[�}�I]";
	mes "���͂��A";
	mes "�A�j�L�B�ɏ����ł�";
	mes "�S�z�����Ȃ��悤��";
	mes "�C�s�����Ăāc�c�B";
	next;
	unittalk "�}�I : �́c�c�I�I�@�I�����ǂ����Ă���Șb���I�H";
	mes "[�}�I]";
	mes "�́c�c�I�I";
	mes "�I�����ǂ����Ă���Șb���I�H";
	next;
	unittalk "�}�I : �͂��c�c�B�C�Ƃ���肭�s���Ȃ��ċC���ɂ񂾂��ȁB�����I�H�@�I�}�G�A�܂����A�j�L�B�ɗ��܁c�c�B";
	mes "[�}�I]";
	mes "�͂��c�c�B";
	mes "�C�Ƃ���肭�s���Ȃ���";
	mes "�C���ɂ񂾂��ȁB";
	mes "�����I�H";
	mes "�I�}�G�A�܂����A�j�L�B�ɗ��܁c�c�B";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,12;
	cloakonnpc;
	next;
	mes "�]��b���Ƀ}�I��";
	mes "�@���������Ă��܂����B";
	mes "�@�o�������b��";
	mes "�@�������_�ɓ`���悤�]";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,210,134,6	script	���������郋�����_#ILU_022	843,{
	unittalk "���������郋�����_ : ���ݐ��͂��ꂮ�炢�ő��v���ȁc�c�B";
	mes "[���������郋�����_]";
	mes "���ݐ��͂��ꂮ�炢��";
	mes "���v���ȁc�c�B";
	next;
	unittalk "���������郋�����_ : �������g��Ȃ��ōςނ̂Ȃ炻��ɉz�������Ƃ͂Ȃ��̂����ǁc�c�B";
	mes "[���������郋�����_]";
	mes "�������g��Ȃ���";
	mes "�ςނ̂Ȃ�";
	mes "����ɉz�������Ƃ�";
	mes "�Ȃ��̂����ǁc�c�B";
	next;
	unittalk "���������郋�����_ : ����I�H�@�`���҂��܁A����ȂƂ���ŉ�܂����ˁB���̑O�͘b���Ă���Œ��Ɂc�c";
	mes "[���������郋�����_]";
	mes "����I�H";
	mes "�`���҂��܁A";
	mes "����ȂƂ���ŉ�܂����ˁB";
	mes "���̑O�͘b���Ă���Œ��Ɂc�c";
	next;
	unittalk "���������郋�����_ : �����Ȃ苎���Ă��܂�����c�c�b���c�c�B";
	mes "[���������郋�����_]";
	mes "�����Ȃ苎���Ă��܂�����c�c";
	mes "�b���c�c�B";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,14;
	cloakonnpc;
	next;
	mes "�]���������郋�����_��";
	mes "�@�����Ă��܂����B";
	mes "�@�o�������b��";
	mes "�@�������_�ɓ`���悤�]";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,157,28,4	script	����#ILU_023	765,{
	unittalk getnpcid(0,"���l#ILU_024"),"���l : �Ȃ�Đ����I�I�@�����X�^�[�������񂹂Ă���I�I";
	mes "[���l]";
	mes "�Ȃ�Đ����I�I";
	mes "�����X�^�[��";
	mes "�����񂹂Ă���I�I";
	next;
	unittalk getnpcid(0,"���l#ILU_025"),"���l : �݁c�c�O�q�͂܂��߂�Ȃ��̂��H�@��́A�Ȃ�ŏP���ė���񂾁I�@�����炪���Ȃ����Ɍ����āc�c�B";
	mes "[���l]";
	mes "�݁c�c�O�q��";
	mes "�܂��߂�Ȃ��̂��H";
	mes "��́A�Ȃ�ŏP���ė���񂾁I";
	mes "�����炪���Ȃ�����";
	mes "�����āc�c�B";
	next;
	unittalk "���� : �M���悤�B�O�q�B�͂����Ɩ߂��Ă���c�c�B";
	mes "[����]";
	mes "�M���悤�B";
	mes "�O�q�B�͂�����";
	mes "�߂��Ă���c�c�B";
	next;
	unittalk getnpcid(0,"���l#ILU_026"),"���l : �ł����A�����A���Ƀ����X�^�[�����ɘA��čs���ꂽ�҂����܂��I�@�ނ�͂����c�c�B";
	mes "[���l]";
	mes "�ł����A�����A";
	mes "���Ƀ����X�^�[������";
	mes "�A��čs���ꂽ";
	mes "�҂����܂��I";
	mes "�ނ�͂����c�c�B";
	next;
	unittalk "���� : �s�g�Ȃ��Ƃ������ȁB�M����񂾁B�����Ă���͂����B�����Ă���Ƃ��c�c�B";
	mes "[����]";
	mes "�s�g�Ȃ��Ƃ������ȁB";
	mes "�M����񂾁B";
	mes "�����Ă���͂����B";
	mes "�����Ă���Ƃ��c�c�B";
	next;
	unittalk getnpcid(0,"���l#ILU_026"),"���l : ���c�c�������A�����c�c�B";
	mes "[���l]";
	mes "���c�c�������A";
	mes "�����c�c�B";
	next;
	unittalk "���� : ���ށc�c�B�������_�̒����ʂ�A���ł���҂͔����c�c�B�����A�o���邾���̂��Ƃ͂�����B��́A�O�q�B�̋A�����߂��ɑ҂Ƃ��B";
	mes "[����]";
	mes "���ށc�c�B";
	mes "�������_�̒����ʂ�A";
	mes "���ł���҂͔����c�c�B";
	mes "�����A�o���邾���̂��Ƃ͂�����B";
	mes "��́A�O�q�B�̋A���";
	mes "���߂��ɑ҂Ƃ��B";
	next;
	unittalk "���� : ����H�@�N�͒m��ʊ炾�ȁH�@���H�@�������_�́H�@����͂���́A�O�q�B���o�����Ă���Ƃ���ɉ^�����������́c�c�B";
	mes "[����]";
	mes "����H�N�͒m��ʊ炾�ȁH";
	mes "���H�������_�́H";
	mes "����͂���́A�O�q�B��";
	mes "�o�����Ă���Ƃ����";
	mes "�^�����������́c�c�B";
	next;
	unittalk "���� : ���������̂͂�܂�܂����A���͒N�����������闧��ɂȂ��Ăȁc�c�B���܂�́B��X�͎O�q�B��M���đ҂ȊO�c�c�B";
	mes "[����]";
	mes "���������̂͂�܂�܂����A";
	mes "���͒N������������";
	mes "����ɂȂ��Ăȁc�c�B";
	mes "���܂�́B";
	mes "��X�͎O�q�B��";
	mes "�M���đ҂ȊO�c�c�B";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,16;
	cloakonnpc;
	cloakonnpc "���l#ILU_024";
	cloakonnpc "���l#ILU_025";
	cloakonnpc "���l#ILU_026";
	next;
	mes "�]�S�z���鑺����";
	mes "�@�����������B";
	mes "�@�o�������b��";
	mes "�@�������_�ɓ`���悤�]";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,155,29,6	script	���l#ILU_024	748,{
	unittalk "���l : �ǂ�����΁c�c�B";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,153,28,6	script	���l#ILU_025	85,{
	unittalk "���l : �O�q�͂܂����I";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,154,26,6	script	���l#ILU_026	84,{
	unittalk "���l : ���������Ȃ��ƁI";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,39,219,6	script	�J��#ILU_027	843,{
	unittalk "�J�� : �悤�₭�A�ꂻ�����ȁB�}�I�B";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,41,220,4	script	��R�Ƃ��郋�����_#ILU_028	843,{
	unittalk "��R�Ƃ��郋�����_ : �c�c�B";
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,43,219,4	script	�}�I#ILU_029	843,{
	unittalk "�}�I : ����̎��̌��ʂ������Ȃ������Ǝv���B";
	mes "[�}�I]";
	mes "����̎��̌��ʂ�";
	mes "�����Ȃ������Ǝv���B";
	next;
	unittalk getnpcid(0,"�J��#ILU_027"),"�J�� : �������ȁB������ƕs�g�ȏo�����͂��������ǁA������ǂ����ɂȂ肻�������B�ȁH�@�������_�B";
	mes "[�J��]";
	mes "�������ȁB";
	mes "������ƕs�g�ȏo������";
	mes "���������ǁA";
	mes "������ǂ����ɂȂ肻�������B";
	mes "�ȁH�������_�B";
	next;
	unittalk "�}�I : ����H�������_�Z�A�������c�c���̑O���������ٖM�l�ł��B";
	mes "[�}�I]";
	mes "����H�������_�Z�A";
	mes "�������c�c";
	mes "���̑O���������ٖM�l�ł��B";
	next;
	unittalk getnpcid(0,"�J��#ILU_027"),"�J�� : ����H�@�������ˁB�{�N���o���Ă����B";
	mes "[�J��]";
	mes "����H�������ˁB";
	mes "�{�N���o���Ă����B";
	next;
	unittalk getnpcid(0,"�J��#ILU_027"),"�J�� : �n�n�b�B���ʂ̃������_�����������Ƃ����̂ɁA�|�����̒m�炸���ȁB";
	mes "[�J��]";
	mes "�n�n�b�B";
	mes "���ʂ̃������_��";
	mes "���������Ƃ����̂ɁA";
	mes "�|�����̒m�炸���ȁB";
	next;
	unittalk "�}�I : �I���B�A�݂�ȓ����炾���Ắc�c�B�܂������A�������_�Z�����������Ă����B";
	mes "[�}�I]";
	mes "�I���B�A";
	mes "�݂�ȓ����炾���Ắc�c�B";
	mes "�܂������A";
	mes "�������_�Z�����������Ă����B";
	next;
	unittalk getnpcid(0,"��R�Ƃ��郋�����_#ILU_028"),"��R�Ƃ��郋�����_ : �c�c�J���Z�I�@��ς��I�@���̕�����җ�Ȉ��̋C��������I�@����Ȃɗ���Ă��Ă��͂����蕪����I�I";
	mes "[��R�Ƃ��郋�����_]";
	mes "�c�c�J���Z�I��ς��I";
	mes "���̕�����";
	mes "�җ�Ȉ��̋C��������I";
	mes "����Ȃɗ���Ă��Ă�";
	mes "�͂����蕪����I�I";
	next;
	unittalk getnpcid(0,"�J��#ILU_027"),"�J�� : �ӂށH�@���ӁH�@���̕����ƁH�@�܂����c�c�H�@��l�Ƃ��}�����I�@���ŉ����N�����Ă���H";
	mes "[�J��]";
	mes "�ӂށH���ӁH";
	mes "���̕����ƁH�܂����c�c�H";
	mes "��l�Ƃ��}�����I";
	mes "���ŉ����N�����Ă���H";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,18;
	cloakonnpc "�J��#ILU_027";
	cloakonnpc "��R�Ƃ��郋�����_#ILU_028";
	cloakonnpc;
	next;
	mes "�]3�l�͋}���ŋ����čs�����B";
	mes "�@���o���������Ƃ�";
	mes "�@�������_�ɓ`���悤�]";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,116,94,6	script	�J��#ILU_030	843,{
	unittalk "�J�� : �A�X�f���I�@�ǂ����āH�@�Ȃ��N������Ȗڂɉ��Ȃ���΂Ȃ�Ȃ��H�@�{�c�c�{�N���N���ǂ�ȑz���ŒT�������c�c�B";
	mes "[�J��]";
	mes "�A�X�f���I�ǂ����āH";
	mes "�Ȃ��N������Ȗڂ�";
	mes "���Ȃ���΂Ȃ�Ȃ��H";
	mes "�{�c�c�{�N���N��";
	mes "�ǂ�ȑz���ŒT�������c�c�B";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_031"),"�A�X�f�� : �J�c�c�J���c�c�B";
	mes "[�A�X�f��]";
	mes "�J�c�c�J���c�c�B";
	next;
	unittalk "�J�� : �����c�c�A�X�f���c�c�B�{�N�̓��ʂȗ͂����ڂ́A�{���ɗ͂𔭊����ׂ����A���̖��ɂ������Ȃ������c�c�I";
	mes "[�J��]";
	mes "�����c�c";
	mes "�A�X�f���c�c�B";
	mes "�{�N�̓��ʂȗ͂����ڂ́A";
	mes "�{���ɗ͂𔭊����ׂ����A";
	mes "���̖��ɂ������Ȃ������c�c�I";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_031"),"�A�X�f�� : �J���A�߂��܂Ȃ��Łc�c�B�J���͍��A���̖ڂŎ����ǂ��ɂ������o���Ă��ꂽ�́c�c�B";
	mes "[�A�X�f��]";
	mes "�J���A�߂��܂Ȃ��Łc�c�B";
	mes "�J���͍��A";
	mes "���̖ڂŎ����ǂ��ɂ�";
	mes "�����o���Ă��ꂽ�́c�c�B";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_031"),"�A�X�f�� : �킽���́c�c��������B";
	mes "[�A�X�f��]";
	mes "�킽���́c�c��������B";
	next;
	misceffect 244,"�A�X�f��#ILU_031";
	if(!sleep2(1000)) end;
	unittalk "�J�� : ���c�c����́c�c�H�@���������낵�����Α��̎􂢁c�c���H�@�A�X�f���Ɂc�c�I�H";
	mes "[�J��]";
	mes "���c�c����́c�c�H";
	mes "���������낵��";
	mes "���Α��̎􂢁c�c���H";
	mes "�A�X�f���Ɂc�c�I�H";
	next;
	unittalk "�J�� : �A�c�c�A�X�f���I�@�{�N�͂��ǂ��ɋ������ČN�����̖ڂŌ����o���I�@������c�c�A������c�c�I�I";
	mes "[�J��]";
	mes "�A�c�c�A�X�f���I";
	mes "�{�N�͂��ǂ��ɋ�������";
	mes "�N�����̖ڂŌ����o���I";
	mes "������c�c�A������c�c�I�I";
	next;
	unittalk getnpcid(0,"�A�X�f��#ILU_031"),"�A�X�f�� : ���c�c�J���c�c�B���̓��ʂȐl�c�c�I�����c�c�āc�c";
	mes "[�A�X�f��]";
	mes "���c�c�J���c�c�B";
	mes "���̓��ʂȐl�c�c�I";
	mes "�����c�c�āc�c";
	if(!sleep2(1000)) end;
	misceffect 244,"�A�X�f��#ILU_031";
	if(!sleep2(1000)) end;
	misceffect 181,"�A�X�f��#ILU_031";
	if(!sleep2(1000)) end;
	misceffect 924,"�A�X�f��#ILU_031";
	cloakonnpc "�A�X�f��#ILU_031";
	cloakoffnpc "�A�X�f��#ILU_032";
	if(!sleep2(2000)) end;
	misceffect 34,"�A�X�f��#ILU_032";
	cloakonnpc "�A�X�f��#ILU_032";
	next;
	unittalk "�J�� : �u���čs���Ȃ��ł���c�c�I�I�@�A�X�f���I�I�I�I";
	mes "[�J��]";
	mes "�u���čs���Ȃ��ł���c�c�I�I";
	mes "�A�X�f���I�I�I�I";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,20;
	cloakonnpc;
	cloakonnpc "�A�X�f��#ILU_031";
	cloakonnpc "�A�X�f��#ILU_032";
	next;
	mes "�]�A�X�f����ǂ���";
	mes "�@�J���͏������B";
	mes "�@���o���������Ƃ�";
	mes "�@�������_�ɓ`���悤�]";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,117,94,4	script	�A�X�f��#ILU_031	90,{
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,117,94,4	script	�A�X�f��#ILU_032	1148,{
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,268,75,4	script	�V���G�b�g#ILU_033	10029,{
	unittalk "�H�H�H�H : �N�N�N�A�j���Q���h�����I�C�_�V�A�J�m�`���e�j�X���m�_�B";
	mes "[�H�H�H�H]";
	mes "�N�N�N�A";
	mes "�j���Q���h����";
	mes "�I�C�_�V�A";
	mes "�J�m�`���e�j�X���m�_�B";
	next;
	close;
	unittalk "�H�H�H�H : �N�N�N�A�j���Q���h�����I�C�_�V�A�J�m�`���e�j�X���m�_�B";
	mes "[�H�H�H�H]";
	mes "�N�N�N�A";
	mes "�j���Q���h����";
	mes "�I�C�_�V�A";
	mes "�J�m�`���e�j�X���m�_�B";
	next;
	unittalk getnpcid(0,"�V���G�b�g#ILU_034"),"�H�H�H�H : �t�V�V�A�G�C���E���G�^�������n�A�C�}�}�f�g�n�`�K�E�B";
	mes "[�H�H�H�H]";
	mes "�t�V�V�A";
	mes "�G�C���E���G�^";
	mes "�������n�A";
	mes "�C�}�}�f�g�n";
	mes "�`�K�E�B";
	next;
	unittalk "�H�H�H�H : �g�E�\�c���G�^�m�_�J���i�A�N�N�N�B";
	mes "[�H�H�H�H]";
	mes "�g�E�\�c��";
	mes "�G�^�m�_�J���i�A";
	mes "�N�N�N�B";
	next;
	unittalk getnpcid(0,"�V���G�b�g#ILU_034"),"�H�H�H�H : �`�J�����^�N���G�A�X�L���c�L�A�J�m�`���G���o�A�L���E�_�C�i�`�J���n�������K���m�B";
	mes "[�H�H�H�H]";
	mes "�`�J����";
	mes "�^�N���G�A";
	mes "�X�L���c�L�A";
	mes "�J�m�`���G���o�A";
	mes "�L���E�_�C�i�`�J���n";
	mes "�������K���m�B";
	next;
	unittalk "�H�H�H�H : �c�c�N���N���B�i�j���m�_�I�H�@�n�i�V���L�J���^�J���j�n�A�j���Q���h���j�L�d�J�����}�G�j�E�S�N�J�B";
	mes "[�H�H�H�H]";
	mes "�c�c�N���N���B";
	mes "�i�j���m�_�I�H";
	mes "�n�i�V���L�J���^�J���j�n�A";
	mes "�j���Q���h���j";
	mes "�L�d�J�����}�G�j";
	mes "�E�S�N�J�B";
	next;
	unittalk getnpcid(0,"�V���G�b�g#ILU_034"),"�H�H�H�H : �}�A�A���N���~�K�o���^�g�e�A�Z���C���R�g�j�J�����i�C�B�J�N�S�V�e�C���A�j���Q���B";
	mes "[�H�H�H�H]";
	mes "�}�A�A���N���~�K";
	mes "�o���^�g�e�A";
	mes "�Z���C���R�g�j";
	mes "�J�����i�C�B";
	mes "�J�N�S�V�e�C���A�j���Q���B";
	if(!sleep2(2000)) end;
	set IL_LUANDA_QUE,22;
	cloakonnpc;
	cloakonnpc "�V���G�b�g#ILU_034";
	next;
	mes "�]�������_�̂Ƃ���֖߂�܂����H�]";
	next;
	if(select("�߂�","�܂������ɋ���") == 2) {
		mes "�]���Ȃ��͂��̏�ɗ��܂����]";
		close;
	}
	warp "com_d02_i_q.gat", 241, 248;
	end;
OnInit:
	cloakonnpc;
	end;
}
com_d02_i_q.gat,266,76,6	script	�V���G�b�g#ILU_034	10029,{
	end;
OnInit:
	cloakonnpc;
	end;
}

com_d02_i.gat,254,243,0	warp	ILU_Luanda#ILU_002	1,1,beach_dun2.gat,249,243
com_d02_i.gat,241,255,4	script	���҃������_#ILU_004	843,{
	switch(rand(5)) {
	case 0:
		unittalk "���҃������_ : �`���҂��܁I�@�˗��͂����̌f�����������������I";
		break;
	case 1:
		unittalk "���҃������_ : ���Α��߁I�@�Ȃ��P���Ă���񂾁I";
		break;
	case 2:
		unittalk "���҃������_ : �E�[�^�����߁I�@�Ȃ��P���Ă���񂾁I";
		break;
	case 3:
		unittalk "���҃������_ : �J���Z�͂����Ƒ��v���c�c�I";
		break;
	case 4:
		unittalk "���҃������_ : �}�I�����Ă����Ɩ������c�c�I";
		break;
	}
}
com_d02_i.gat,249,250,4	script	�f����#ILU_006	857,{
	mes "�]���̌f�����B";
	mes "�@�˗��̏󋵂��L������Ă���]";
	mes "�@";
	mes "[�f����]";
	mes "�y^ff0000�������_�̈˗� ��^000000�z";
	mes "^888888����^000000";
	//mes "^0000ff���풆^000000";
	next;
	switch(select("�˗�����/�񍐂���","�˗��̐���","�����Ώۂ̕ύX","�������Ȃ�")) {
	case 1:
		mes "[�f����]";
		mes "�����X�^�[�̐N����j�~���Ă��������I";
		mes "^ff0000�ǂ��炩^000000�̓��������肢���܂��I";
		mes "�E^0000ff�Ẫ��K���X�@20��^000000";
		mes "�E^0000ff�Ẫt���C���V���[�^�[�@20��^000000";
		mes "�@�������Ώۂ͎󒍌�ł��ύX�ł��܂��B";
		mes "�@�@��V : ���A�Ō�����^0000ff���z�̐�^000000 2��";
		next;
		switch(select("�Ẫ��K���X�����@��","�Ẫt���C���V���[�^�[�����@��","�˗����󂯂Ȃ�")) {
		case 1:
			setquest 5852;
			setquest 5848;
			mes "�]^0000ff�Ẫ��K���X�@20��^000000�������󒍂�";
			mes "�@�˗��̏󋵂��f���ɋL�������]";
			mes "�@";
			mes "[�f����]";
			mes "�y^ff0000�������_�̈˗� ��^000000�z";
			mes "^0000ff���풆^000000";
			close;
		case 2:
		case 3:
			mes "�]���̏���������]";
			close;
		}
	case 2:
		mes "[�f����]";
		mes "�����X�^�[�̐N����j�~���Ă��������I";
		mes "^ff0000�ǂ��炩^000000�̓��������肢���܂��I";
		mes "�E^0000ff�Ẫ��K���X�@20��^000000";
		mes "�E^0000ff�Ẫt���C���V���[�^�[�@20��^000000";
		mes "�@�������Ώۂ͎󒍌�ł��ύX�ł��܂��B";
		mes "�@�@��V : ���A�Ō�����^0000ff���z�̐�^000000 2��";
		next;
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�����N�G�X�g�͕񍐌�A";
		mes "���̌ߑO5���܂�";
		mes "�ēx�񍐂��邱�Ƃ��ł��܂���B";
		mes "�܂��A�N�G�X�g�̎󒍂�";
		mes "�񍐎��Ɏ����I�ɍs���܂��B^000000";
		close;
	case 3:
		mes "�]���͈˗����󂯂Ă��Ȃ��]";
		close;
	case 4:
		mes "�]���̏���������]";
		close;
	}
}
