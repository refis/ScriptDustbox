ra_fild10.gat,0,0,0,0	monster	�O���C�S�[�g	21323,5,60000,0,0
ra_fild10.gat,0,0,0,0	monster	�q�O���C�E���t	21324,5,60000,0,0
ra_fild10.gat,0,0,0,0	monster	�}�O�}����	1836,75,5000,0,0
ra_fild10.gat,0,0,0,0	monster	�h���Z��	1781,75,5000,0,0
ra_fild10.gat,0,0,0,0	monster	���P�\��	21296,5,60000,0,0

ra_fild11.gat,0,0,0,0	monster	�O���C�S�[�g	21323,5,60000,0,0
ra_fild11.gat,0,0,0,0	monster	�q�O���C�E���t	21324,5,60000,0,0
ra_fild11.gat,0,0,0,0	monster	���P�\��	21296,5,60000,0,0
ra_fild11.gat,0,0,0,0	monster	�h���Z��	1781,75,5000,0,0

// gw_fild01.gat
gw_fild01.gat,0,0,0,0	monster	�A�b�V���z�b�p�[	21302,50,5000,0,0	// aid: 8898-8947
gw_fild01.gat,0,0,0,0	monster	�A�b�V������	21303,110,5000,0,0	// aid: 8948-9057
gw_fild01.gat,0,0,0,0	monster	�O���C�E���t	21304,35,5000,0,0	// aid: 9058-9092


// EP18_1QUE

ba_in01.gat,26,266,0	script	#ep18w11_147	139,15,15,{
OnTouch:
	if(EP172_1QUE == 100) {
		cloakonnpc "�X�}�[�g�G���[#ep172_ely01";
		cloakoffnpc "�X�}�[�g�G���[#ep18ely0_001";
	} else {
		cloakoffnpc "�X�}�[�g�G���[#ep172_ely01";
		cloakonnpc "�X�}�[�g�G���[#ep18ely0_001";
	}
	end;
}

// �X�}�[�g�G���[#ep172_ely01��15�Z���ȓ��ɓ����cloakoff
ba_in01.gat,26,266,3	script	�X�}�[�g�G���[#ep18ely0_001	10354,{/* 10652 (cloaking)*/
	if(EP172_1QUE != 100 && checkquest(202235) == 0)
		end;
	if(EP18_1QUE == 0) {
		if(checkitemblank() < 1) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "���݁A���ِM���̓��e��";
		mes "�o�������g�l�̃R���N�V����3���̍s����";
		mes "��͂��Ă���܂��B";
		mes "���݁A��͗���99���܂ŒB���Ă��܂��B";
		mes "�����������҂����������B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�B";
		mes "�c�c�c�c�B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�B";
		mes "�c�c�c�c�B";
		mes "�c�c�c�c�c�c�B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�Í��̉�͂��������܂����B";
		mes "���Ԃ��|�����Ă��܂��\���󂠂�܂���B";
		next;
		cloakoffnpc "���b�L�[#ep181_rk01_003";
		cloakoffnpc "�G�X�g�E���u���C#ep181_002";
		cutin "ep162_est01.bmp", 1;
		mes "[�G�X�g]";
		mes "���ِM���̉�͂��ς񂾂������ȁB";
		mes "���ʂ�񍐂���B";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "��͂̌��ʁA���ِM����";
		mes "�A���i�x���c�����́u���w���v����";
		mes "���M����Ă��܂����B";
		mes "�M���̓��e��";
		mes "�u���̎w����҂v�Ƃ̂��Ƃł��B";
		next;
		cutin "ep162_est03.bmp", 1;
		mes "[�G�X�g]";
		mes "���w���ɂ���z��́A�܂���������";
		mes "���Ԃ������o�������Ƃ�m��Ȃ��񂾂ȁH";
		mes "����͓s�����ǂ��B";
		mes "�c�c���A�������͓�����B";
		next;
		cutin "16loo_01.bmp", 0;
		mes "[���b�L�[]";
		mes "�c�c���H";
		mes "���������̃`�����X�𓦂���ł����H";
		next;
		cutin "ep162_est03.bmp", 1;
		mes "[�G�X�g]";
		mes "�������݂����Ȕ񍇖@�̕����W�c��";
		mes "�����Ȃ荑�����z����";
		mes "�����Ɉړ�������ǂ��Ȃ�Ǝv���H";
		mes "���}���Ă��炦��Ƃł��v���Ă�̂��H";
		next;
		mes "[�G�X�g]";
		mes "�푈�ł������ς��߂����Ȃ�";
		mes "����ł��\��񂪁B";
		mes "���O�́A���������l���Ă��甭������B";
		next;
		cutin "16loo_03.bmp", 0;
		mes "[���b�L�[]";
		mes "�Ȃ�قǁA�������Ɂc�c";
		mes "���炵�܂����B";
		next;
		cutin "ep162_est01.bmp", 1;
		mes "[�G�X�g]";
		mes "���b�P���x���Ƃ̖���";
		mes "���S�ɉ��������킯����Ȃ��B";
		mes "�z����������邽�߂�";
		mes "�������������𗣂��킯�ɂ͂�����B";
		next;
		cutin "16loo_02.bmp", 0;
		mes "[���b�L�[]";
		mes "�ł́A�ǂ����܂����H";
		mes "�ƌ��������̂́A�l���Ă��邱�Ƃ�";
		mes "�������Ǝv���܂����B";
		next;
		cutin "16loo_03.bmp", 255;
		mes "�]�G�X�g�ƃ��b�L�[��";
		mes "�@�����ɂ�����Ɋ���������]";
		next;
		cutin "ep162_est01.bmp", 1;
		mes "[�G�X�g]";
		mes "���w�������B";
		mes "�u"+strcharinfo(0)+"�v�B";
		mes "�P�Ƃœ����邨�O�Ȃ�";
		mes "�z��̓�����T���Ă���̂�";
		mes "�����Ă��Ɖ]���킯���B";
		next;
		menu "�C���Ă�������",-,"�c�c�d���Ȃ�",-;
		cutin "ep162_est02.bmp", 1;
		mes "[�G�X�g]";
		mes "����ɂ��Ă��`���҂��Ă̂�";
		mes "�{���ɕ֗��ȓz�炾�ȁB";
		mes "���������܂܍������z���Ă�";
		mes "�����܂��̂͂��O�������炢�Ȃ��̂��B";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "���҂����������B";
		mes "�P�ƍs���͊댯�ł��B";
		mes "�����ł̊����ɉ�����";
		mes "����̐�͂��n�b�L�����Ȃ��ȏ�";
		mes "�T�|�[�g���K�v�Ǝv���܂��B";
		next;
		cutin "ep162_est01.bmp", 1;
		mes "[�G�X�g]";
		mes "�����炩��l���͏o���񂼁H";
		mes "�u"+strcharinfo(0)+"�v��";
		mes "�w�}�����ۂɁA���x���I���̂��Ƃ�";
		mes "�\�����ɂȂ�͍̂���B";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "���c�c�u�G���[�v���T�|�[�g�������܂��B";
		mes "�Ǘ��҃A���t�@��������F�𓾂܂����B";
		mes "�Ƃ͂����A�����������痣���킯�ɂ�";
		mes "�����܂���̂Łc�c";
		mes "����������󂯎�肭�������B";
		next;
		cutin "ep162_est01.bmp", 255;
		mes "^0000FF�]�X�}�[�g�G���[����";
		mes "�@�ޏ��ɂ悭�����l�`����n���ꂽ�B";
		mes "�@���̐l�`�͂ǂ��ƂȂ�";
		mes "�@�u����Ă���v�悤�Ɍ�����]^000000";
		next;
		cutin "16loo_03.bmp", 0;
		mes "[���b�L�[]";
		mes "����́c�c";
		mes "�u����X�}�[�g�G���[�v�H";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "�O�b�h�ł��B";
		mes "���̖��O���̗p�������܂��傤�B";
		mes "����͎��̃��\�[�X�𗘗p����";
		mes "���g�̂̂悤�Ȃ��̂ł��B";
		mes "���o�A���o�Ȃǂ����Ƌ��L���Ă���";
		mes "�ʐM���\�ł��B";
		next;
		cutin "ep162_est02.bmp", 1;
		mes "[�G�X�g]";
		mes "�����������c�c�����������_����Ȃ����B";
		mes "�����𓪂ɏ悹�Ă����";
		mes "�C���V�I���̓z������f���邼�H";
		next;
		cutin "16loo_01.bmp", 0;
		mes "[���b�L�[]";
		mes "�������Ɓc�c";
		mes "�l���𑗂邱�Ƃ͂ł��܂���";
		mes "��������ΘA�����������B";
		mes "��������ł��邱�Ƃ������";
		mes "���͂������܂�����B";
		next;
		set EP18_1QUE,1;
		setquest 8681;
		getitem 400127,1;
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "�ł́A�u���w���v�Ɍ������܂��傤�B";
		mes "�������܂�����A�u��v���o���܂��B";
		mes "�������邩�킩��܂���̂�";
		mes "������ӂ�Ȃ��ł��������B";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	} else if(EP18_1QUE == 1) {
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "�ł́A�u���w���v�Ɍ������܂��傤�B";
		mes "�������܂�����A�u��v���o���܂��B";
		mes "�������邩�킩��܂���̂�";
		mes "������ӂ�Ȃ��ł��������B";
		next;
		cutin "ep172_beta.bmp", 255;
		mes "�]�u���w���v�֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		warp "rachel.gat", 182, 168;
		close;
	} else {
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "���͂̓X�}�[�g�G���[��";
		mes "�A���t�@�ɂ��C�����������B";
		mes "���q�l�́A���g�̖�ڂ��ʂ����Ă��������B";
		mes "���q�l��҂��Ă������";
		mes "���E���ɂ���݂����ł�����B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�ĂсA����̐M����҂�������󋵂�";
		mes "�Ȃ��Ă��܂��܂�����";
		mes "���S�z�ɂ͋y�т܂���B";
		mes "���Ԃ́A�������̖����ł��B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�Ⴆ�A�ܒ��܉��N���炢";
		mes "���[���Ƃ���Ă��O���邱�Ƃ������̂�";
		mes "�������̗��_�ł��B";
		mes "���A�����͏΂��Ƃ���ł���H";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP172_1QUE == 100 && EP18_1QUE == 0 && checkquest(202235))
		showevent 1,1,"�X�}�[�g�G���[#ep18ely0_001";
	else
		showevent 9999,0,"�X�}�[�g�G���[#ep18ely0_001";
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_in01.gat,22,262,6	script	�G�X�g�E���u���C#ep181_002	10183,{/* 10653 (cloaking)*/
	cutin "ep162_est01.bmp", 1;
	mes "[�G�X�g]";
	mes "��͂��I������炵���ȁH";
	close2;
	cutin "ep162_est01.bmp", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_in01.gat,24,262,7	script	���b�L�[#ep181_rk01_003	10181,{/* 10654 (cloaking)*/
	cutin "16loo_01.bmp", 0;
	mes "[���b�L�[]";
	mes "��͂����������ƕ����܂����B";
	mes "���ʂ𕷂��܂��傤�B";
	close2;
	cutin "16loo_01.bmp", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

rachel.gat,182,176,0	script	#ep18w02_138	139,19,19,{/* 15824 */
OnTouch:
	if(EP18_1QUE >= 1 && EP18_1QUE <= 3) {
		cloakoffnpc "�ϏO#ep18c01_005";
		cloakoffnpc "�ϏO#ep18c02_006";
		cloakoffnpc "�ϏO#ep18c03_007";
		cloakoffnpc "�ϏO#ep18c04_008";
		cloakoffnpc "�ϏO#ep18c05_009";
		cloakoffnpc "�ϏO#ep18c06_010";
	}
	if(EP18_1QUE >= 1 && EP18_1QUE <= 4)
		cloakoffnpc "�ł�_��#e18a_011";
	end;
}
rachel.gat,182,176,3	script	�}�X�N�������l#004	917,{/* 15825 */
	if(EP18_1QUE == 1) {
		mes "[������]";
		mes "�c�c�t���C���͈��Ȃ̂ł��I";
		mes "�@";
		mes "�]�L��ɏW�܂��Ă���l�X�Ɍ�������";
		mes "�@���������Ă���l������]";
		next;
		mes "[����X�}�[�g�G���[]";
		mes "�c�c�s�s!!";
		mes "�w���̕ӂ肪�M���̔��M���ł��B";
		mes "�@���ӂ̗l�q���m�F���Ă��������x";
		unittalk getcharid(3),strcharinfo(0)+" : ���̒����琺������!?",1;
		next;
		mes "[����X�}�[�g�G���[]";
		mes "�w���̐l�ɂ͕������Ȃ�";
		mes "�@����ȉ��g���g����";
		mes "�@���q�l�ɒ��ڌ��|���Ă��܂��B";
		mes "�@���̂悤�Ȍ`�ŃT�|�[�g���܂��̂�";
		mes "�@����Ă��������x";
		next;
		mes "[����X�}�[�g�G���[]";
		mes "�w�ł́A���߂�";
		mes "�@���ӂ̗l�q���m�F���Ă��������x";
		next;
		mes "^0000FF�]���͂̏󋵂��f�����A";
		mes "�@�����҂̐�������ɔM��ттĂ����]^000000";
		next;
		mes "[������]";
		mes "�������ɕK�v�Ȃ̂́A���ǂ������ł��B";
		mes "�c�c�������������Ȃ����";
		mes "�䂪�A���i�x���c�̋P���関����";
		mes "���ꋎ���Ă��܂��̂ł��I";
		cloakoffnpc "�ϏO#ep18c01_005";
		cloakoffnpc "�ϏO#ep18c04_008";
		unittalk getnpcid(0,"�ϏO#ep18c01_005"),"�ϏO : �Ȃɂ������Ă�񂾁H",1;
		next;
		mes "[������]";
		mes "�����ߌ��ƌ����Ȃ��Ȃ�";
		mes "����ߌ��ƌ�����̂ł��傤���H";
		mes "�N�̖ڂɂ��������􂷂钛����";
		mes "�f���Ă���̂�";
		mes "���̂܂ܖ������邨����ł����H";
		cloakoffnpc "�ϏO#ep18c05_009";
		next;
		mes "[������]";
		mes "�ǂ����Ă���Ȏ��ɂȂ����̂ł��傤���H";
		mes "�ǂ����đ���𑸏d���Ȃ��̂ł����H";
		mes "�e�X�l�����قȂ�ƌ�����������܂���";
		mes "���͂��������܂��B";
		cloakoffnpc "�ϏO#ep18c02_006";
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : �����͈�̒N���H",1;
		next;
		mes "[������]";
		mes "�o���A�����ɌȂ̉��l���ϑ����A";
		mes "�\�͂��s�g���邱�Ƃ�";
		mes "���̈���Ƃ��āA�ǂ�ȈӖ�������̂��H";
		mes "���g�ɂƂ��āA�ǂ�ȈӖ�������̂��H";
		cloakoffnpc "�ł�_��#e18a_011";
		cloakoffnpc "�ϏO#ep18c03_007";
		unittalk getnpcid(0,"�ϏO#ep18c01_005"),"�ϏO : ���������N�Ȃ񂾁H",1;
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : ������ق点��I",1;
		unittalk getnpcid(0,"�ϏO#ep18c03_007"),"�ϏO : �����������l�̂��肾�H",1;
		next;
		mes "[������]";
		mes "���̘b�𕷂��ē{��o�����Ǝ��̂�";
		mes "���������Ƃ͎v���܂��񂩁H";
		unittalk getnpcid(0,"�ϏO#ep18c04_008"),"�ϏO : �������������I",1;
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : �����A���Z������H",1;
		unittalk getnpcid(0,"�ϏO#ep18c03_007"),"�ϏO : ���O�̕�������ʂ��Ă邾��I",1;
		next;
		mes "[������]";
		mes "���͊F���񂪂��݂���";
		mes "�������Ƃ�]��ł���܂���B";
		mes "�F���񂪋��Ɏ���g���Ȃ�����";
		mes "�������ɖ����͂Ȃ��̂ł�����B";
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : ���񂽁A���҂��H",1;
		unittalk getnpcid(0,"�ϏO#ep18c04_008"),"�ϏO : �͂��c�c�b�ɂȂ���",1;
		next;
		mes "^0000FF�]�����𕷂��Ă����l�X�̐���";
		mes "�@����ɑ傫���Ȃ��Ă����]^000000";
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : �P�K�l���₦���a�@�ɉ^�΂�Ă�̂ɁA���t�����łǂ��ɂ��Ȃ邩�H",1;
		unittalk getnpcid(0,"�ϏO#ep18c05_009"),"�ϏO : �ŁA���ǒN�̂����Ȃ񂾂�H",1;
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : �ڏZ�̖������_�����\�s�����������������H",1;
		next;
		mes "[�ł�_��]";
		mes "������c�c�ǁA�ǂ����悤�c�c";
		mes "�~�߂Ȃ���c�c�B";
		unittalk getnpcid(0,"�ϏO#ep18c05_009"),"�ϏO : ���l�ɖ\�͂�U�邤�̂���������Ȃ����I",1;
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : ����ꂽ���ɂ��������������񂾂낤�H",1;
		unittalk getnpcid(0,"�ϏO#ep18c04_008"),"�ϏO : ��Q�ґ��Ɍ�����������āH�@����Șb�͒����������Ȃ��I",1;
		next;
		unittalk getnpcid(0,"�ł�_��#e18a_011"),"�ł�_�� : �ǂ��ɂ����Ȃ��Ɓc�c",1;
		mes "^0000FF�]�����o���l�X�̌������";
		mes "�@�l�q�����Ă����_���ɋC�t���B";
		mes "�@�_���́A�������~�߂悤�Ƃ��Ă���悤���B";
		mes "�@�ޏ��ɘb�������Ă݂悤�]^000000";
		set EP18_1QUE,2;
		delquest 8681;
		setquest 8682;
		close;
	} else if(EP18_1QUE == 2 || EP18_1QUE == 3) {
		mes "^0000FF�]���͂≉���Ƃ̉����Ƃ͊֌W�Ȃ���";
		mes "�@�l�X�͂̂̂��荇�����n�߂Ă���]^000000";
		close;
	} else if(EP18_1QUE >= 4) {
		mes "[�}�X�N�������l]";
		mes "�ǂ������܂������H";
		mes "���H�@���͉����Ȃ�Ă��Ă��܂����B";
		mes "�����A�M���͊O���̐l�ł��ˁH";
		mes "���ꂶ�Ⴀ�A�����������Ȃ��̂�";
		mes "�����͂Ȃ��B";
		next;
		mes "[�}�X�N�������l]";
		mes "�������́A�}�X�N�����Ă��Ă�";
		mes "�ڏZ�̖��Ȃ̂����Z���Ȃ̂�";
		mes "��ʂ��ł��܂�����ˁB";
		close;
	}
	mes "[������]";
	mes "�c�c�t���C���͈��Ȃ̂ł��I";
	close;
OnQuestInfo:
	if(EP18_1QUE == 1)
		showevent 1,1,"�}�X�N�������l#004";
	else
		showevent 9999,0,"�}�X�N�������l#004";
	end;
}
rachel.gat,179,175,7	script	�ϏO#ep18c01_005	917,{/* 15826 (cloaking)*/
	mes "^0000FF�]����瑛���ł���悤���]^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,177,178,5	script	�ϏO#ep18c02_006	931,{/* 15827 (cloaking)*/
	mes "^0000FF�]����瑛���ł���悤���]^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,179,171,7	script	�ϏO#ep18c03_007	930,{/* 15828 (cloaking)*/
	mes "^0000FF�]����瑛���ł���悤���]^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,181,170,0	script	�ϏO#ep18c04_008	929,{/* 15829 (cloaking)*/
	mes "^0000FF�]����瑛���ł���悤���]^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,186,173,1	script	�ϏO#ep18c05_009	917,{/* 15830 (cloaking)*/
	mes "^0000FF�]����瑛���ł���悤���]^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,184,171,1	script	�ϏO#ep18c06_010	917,{/* 15831 (cloaking)*/
	mes "^0000FF�]����瑛���ł���悤���]^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,183,170,3	script	�ł�_��#e18a_011	935,{/* 15832 (cloaking)*/
	if(EP18_1QUE == 1) {
		mes "^0000FF�]�_���͉����Ƃ̘b��";
		mes "�@���͂̐l�X�̘b��";
		mes "�@���Ӑ[�������Ă���悤���]^000000";
		close;
	} else if(EP18_1QUE == 2) {
		mes "[�ł�_��]";
		mes "�c�c�O���̕��c�c�H";
		mes "�����A�`���҂̕��ł��ˁB";
		mes "�ǁA�ǂ��ɂ��ŋ߁A�X����";
		mes "����ȑ��������т��ыN���Ă����ł��B";
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : �ǂ�����Ĕ��f������āH�@�Ƃ񂾃o�J������ȁI",1;
		unittalk getnpcid(0,"�ϏO#ep18c04_008"),"�ϏO : ���̖�Y�A�N���o�J������!?",1;
		next;
		mes "[�ł�_��]";
		mes "���p���������b�Ȃ̂ł���";
		mes "�A���i�x���c�ł͏Z���̏o�g�ɂ��";
		mes "�������̂��炠��̂ł��B";
		next;
		mes "[�ł�_��]";
		mes "���̒n�ɈڏZ���Ă����l������";
		mes "���Z����ǂ��o��";
		mes "�A���i�x���c���������܂�����";
		mes "����ȗ��A�ڏZ�̖��ƌ��Z���̊Ԃ�";
		mes "�u���肪�c�c�B";
		unittalk getnpcid(0,"�ϏO#ep18c01_005"),"�ϏO : �Ȃ�ŁA�������܂ő����Ă�񂾁H",1;
		unittalk getnpcid(0,"�ϏO#ep18c03_007"),"�ϏO : �o�J���������Ă�񂾂낤",1;
		next;
		mes "[�ł�_��]";
		mes "���̌����ς�������";
		mes "�X���ŉ�������l������̂ł���";
		mes "���X�u���肪���邽��";
		mes "���R�W�Q����l������āc�c�B";
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : �����������I�@���̖�Y�����I",1;
		unittalk getnpcid(0,"�ϏO#ep18c03_007"),"�ϏO : �Ȃ񂾁A���炟�I�@��������Ȃ牣���Ă݂��I",1;
		next;
		mes "[�ł�_��]";
		mes "���܂łƈႤ�l���������Ă���ƋC�Â���";
		mes "�l�q�����Ă����̂ł����c�c";
		mes "������c�c";
		mes "�ƁA�~�߂Ȃ��Ɓc�c�ł��ǂ�������!?";
		next;
		mes "^0000FF�]���ɂ�����g�ݍ����̌��܂�";
		mes "�@�n�܂肻���ȕ��͋C���B";
		mes "�@���̐_���Ƌ���";
		mes "�@�����r���Ă���l�ɐ����|���Ă݂悤�]^000000";
		set EP18_1QUE,3;
		delquest 8682;
		setquest 8683;
		close;
	} else if(EP18_1QUE == 3) {
		mes "^0000FF�]�_���ƈꏏ�ɐ����|���邱�Ƃɂ���]^000000";
		next;
		menu "�����̂������o���l�I",-;
		mes "[�������o���ϏO]";
		mes "����ȁI";
		mes "�N����!!�@���O�́I";
		unittalk getnpcid(0,"�ϏO#ep18c02_006"),"�ϏO : ���I�@�܂��V�����̂��o�Ă������I",1;
		unittalk getnpcid(0,"�ł�_��#e18a_011"),"�ł�_�� : �����c�c�΂ɖ��𒍂��Ȃ��ł�!!",1;
		next;
		menu "�����ċ����A�`���҂��I",-;
		mes "[�������o���ϏO]";
		mes "�`���҂����H";
		mes "�����Ⴂ���́A���񂴂�`���������I";
		mes "�����Ă��������͂��̃g�[���ΎR��";
		mes "����܂ōs�������Ƃ̂���񂾂��H";
		mes "���Ȍ��Z���ƈ���ĂȂ��I";
		unittalk getnpcid(0,"�ϏO#ep18c03_007"),"�ϏO : ����ό��c�A�[�ł���H",1;
		unittalk getnpcid(0,"�ϏO#ep18c05_009"),"�ϏO : �����b�ɂ��Ȃ��ĂȂ������c�c",1;
		next;
		menu "���̓t���C����_�a�Łc�c",-;
		mes "["+strcharinfo(0)+"]";
		mes "���̓t���C����_�a�Łc�c";
		next;
		cloakoffnpc "����#ep18c07_012";
		cloakoffnpc "���������K�[��#ep18c08_013";
		cloakoffnpc "���������C�Y#ep18c09_014";
		mes "[����]";
		mes "�������݂̂Ȃ���I";
		mes "�������ł�!!";
		next;
		mes "[�������o���ϏO]";
		mes "��������[�A�N���Ă񂾂񂾁H";
		unittalk getnpcid(0,"�ϏO#ep18c04_008"),"�ϏO : �ʓ|���ɂȂ�O�ɑގU�I",1;
		unittalk getnpcid(0,"�ϏO#ep18c05_009"),"�ϏO : �������I�@�ʔ����Ȃ�Ƃ��낾�����̂ɁI",1;
		unittalk getnpcid(0,"�ϏO#ep18c06_010"),"�ϏO : �ƂɋA�낤�c�c",1;
		cloakonnpc "�ϏO#ep18c01_005";
		cloakonnpc "�ϏO#ep18c02_006";
		cloakonnpc "�ϏO#ep18c03_007";
		cloakonnpc "�ϏO#ep18c04_008";
		cloakonnpc "�ϏO#ep18c05_009";
		cloakonnpc "�ϏO#ep18c06_010";
		next;
		mes "[���������K�[��]";
		mes "�s�R�҂��������N�����Ă���ƕ�����";
		mes "���Ă݂����c�c���O���H";
		mes "���̐g�Ȃ�͖`���҂��ȁH";
		next;
		mes "[�ł�_��]";
		mes "���̕��́A�s�R�҂ł͂���܂���I";
		mes "���������߂悤�Ƃ��鎄��";
		mes "��`���Ă����������̂ł��I";
		next;
		mes "[�W���m�[�N]";
		mes "���͐_���u^0000FF�W���m�[�N^000000�v�Ɛ\���܂��B";
		mes "���΂炭�O�V���Ă���܂�����";
		mes "����A�Z�X�����j���ɋA�҂������܂����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes ""+strcharinfo(0)+"�c�c";
		mes "�`���҂ł��B";
		next;
		mes "[���������K�[��]";
		mes "�����ł������B";
		mes "�ǂ��ɂ��ŋ߁A�X�����y�����₦���c�c";
		mes "���������ꂽ���Ƃł��傤�B";
		next;
		menu "�������������N���Ă���̂ł����H",-;
		mes "^0000FF�]���������ƃW���m�[�N��";
		mes "�@���΂炭���ӂ����񂵂���A";
		mes "�@���������킵���������]^000000";
		next;
		mes "[�W���m�[�N]";
		mes "�X���ł͐������Â炢�̂�";
		mes "�u�t���C����_�a�v�̕���";
		mes "���Ă��������܂��񂩁H";
		mes "�����Ő��������Ă��������܂��B";
		set EP18_1QUE,4;
		delquest 8683;
		setquest 8684;
		close;
	} else if(EP18_1QUE == 4) {
		mes "[�W���m�[�N]";
		mes "���������ɍs���܂��̂�";
		mes "�u�t���C����_�a�v�̕���";
		mes "������܂��傤�B";
		next;
		mes "�]�u�t���C����_�a�v��";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��́u�t���C����_�a�v��";
		mes "�@���������]";
		close2;
		warp "ra_temple.gat", 72, 49;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 2 && EP18_1QUE <= 4)
		showevent 1,1,"�ł�_��#e18a_011";
	else
		showevent 9999,0,"�ł�_��#e18a_011";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,187,170,3	script	����#ep18c07_012	941,{/* 15833 (cloaking)*/
	mes "[����]";
	mes "�݂�ȓ����o����������I";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,187,173,3	script	���������K�[��#ep18c08_013	934,{/* 15834 (cloaking)*/
	mes "[���������K�[��]";
	mes "�����Ő�������̂��Ȃ�ł��̂�";
	mes "��_�a�̕��ɗ��Ă��������܂����H";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,187,174,3	script	���������C�Y#ep18c09_014	934,{/* 15835 (cloaking)*/
	mes "[���������C�Y]";
	mes "�n�@�c�c";
	mes "�ŋ߁A����ȑ����΂�����ł��B";
	close;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,75,54,0	script	#ep18w01_015	139,14,14,{/* 15836 */
OnTouch:
	if(EP18_1QUE == 4) {
		cloakoffnpc "�ł�_���W���m�[�N#e18b_016";
		cloakoffnpc "���������K�[��#ep18c10_017";
		unittalk getnpcid(0,"�ł�_���W���m�[�N#e18b_016"),"�ł�_���W���m�[�N : �`���ғa�I",1;
	} else if(EP18_1QUE == 5) {
		cloakoffnpc "�ł�_���W���m�[�N#e18b_016";
	}
	end;
}
ra_temple.gat,72,54,5	script	�ł�_���W���m�[�N#e18b_016	935,{/* 15837 (cloaking)*/
	if(EP18_1QUE == 4) {
		mes "[����X�}�[�g�G���[]";
		mes "�c�c�s�s!!";
		mes "�w���q�l�B������낵���ł����H";
		mes "�@�����ɗ���܂ł̊Ԃ�";
		mes "�@���������������m���܂����x";
		next;
		switch(select("�����O���l�����炩���H","�C���V�I���̓z�炩���H")) {
		case 1:
			mes "[����X�}�[�g�G���[]";
			mes "�w���̊X�̐l������";
			mes "�@�O�����痈���l�ɑ΂���";
			mes "�@���I�Ƃ����킯�ł����H�x";
			break;
		case 2:
			mes "[����X�}�[�g�G���[]";
			mes "�w��قǂ̑����ŏ����΂���";
			mes "�@�ڗ����Ă��܂����̂�������܂���x";
			break;
		}
		next;
		mes "[����X�}�[�g�G���[]";
		mes "�w�����_�ł͏�񂪏��Ȃ��̂�";
		mes "�@���f�͂ł��܂���";
		mes "�@����͒��ӂ���";
		mes "�@�s������悤�ɂ��܂��傤�x";
		next;
		mes "[�W���m�[�N]";
		mes "�`���ғa�B";
		mes "�킴�킴�_�a�܂ŗ��Ă�������";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�W���m�[�N]";
		mes "�����A���΂炭�O�ɏo�Ă����̂�";
		mes "���w���͋v���Ԃ�Ȃ̂ł���";
		mes "�ȑO�ɔ�ׂāA�ْ����Ƃ�����";
		mes "����������C�������Ă��܂��B";
		next;
		mes "[�W���m�[�N]";
		mes "���ɈڏZ�̖��ƌ��Z���̊Ԃ��y����";
		mes "��������ߌ��Ȕ���������l��";
		mes "�������悤�Ɏv���܂��B";
		mes "���́A�ڏZ�̖��ƌ��Z���̊Ԃ̍a��";
		mes "���߂����Ǝv���Ă���̂ł����c�c�B";
		next;
		mes "[���������K�[��]";
		mes "����ɉ����ĉ��҂���";
		mes "��_�a�ɉ��x���N�������݂Ă��܂��B";
		mes "���܂̂Ƃ���A�N���s�ׂ�";
		mes "��肭�����Ă��܂���";
		mes "�������邱�Ƃ��ł��Ȃ��󋵂ł��B";
		next;
		mes "[���������K�[��]";
		mes "���݁A��_�a�̌x�����������Ă��܂��B";
		mes "�������̕��A�X�̕��̌���肪";
		mes "�\���ł��Ă���Ƃ͌����܂���B";
		mes "�ǂ����l��s���ŁA�l���𑝂₷���Ƃ�";
		mes "�����ɂ͂ł��Ȃ��󋵂Łc�c";
		mes "����H";
		cloakoffnpc "�V����̎�������#ep18c11_018";
		unittalk getnpcid(0,"�V����̎�������#ep18c11_018"),"�V����̎������� : �_�a�̐����ɐN���҂���I",1;
		next;
		mes "[���������K�[��]";
		mes "�����Ă邻�΂���c�c�I";
		next;
		mes "[����X�}�[�g�G���[]";
		mes "�w�_�a�ւ̐N���ҁc�c�C�ɂȂ���ł��B";
		mes "�@�m�F���ɍs���܂��傤�B";
		mes "�@�_�a�̐����������ł��x";
		set EP18_1QUE,5;
		delquest 8684;
		setquest 8685;
		cloakonnpc "���������K�[��#ep18c10_017";
		cloakonnpc "�V����̎�������#ep18c11_018";
		close;
	} else if(EP18_1QUE == 5) {
		mes "[�W���m�[�N]";
		mes "�N�������҂�����";
		mes "�_�a�̐����������ł��B";
		next;
		mes "�]�_�a�̐����֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͐_�a�̐����֌��������]";
		close2;
		warp "ra_temple.gat", 35, 145;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 4 || EP18_1QUE == 5)
		showevent 1,1,"�ł�_���W���m�[�N#e18b_016";
	else
		showevent 9999,0,"�ł�_���W���m�[�N#e18b_016";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,75,54,3	script	���������K�[��#ep18c10_017	934,{/* 15838 (cloaking)*/
	unittalk getnpcid(0,"���������K�[��#ep18c10_017"),"���������K�[�� : �c�c",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,78,56,3	script	�V����̎�������#ep18c11_018	934,{/* 15839 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,25,147,0	script	#ep18w02_020	139,10,10,{/* 15840 */
OnTouch:
	if(EP18_1QUE == 5) {
		unittalk getnpcid(0,"���������K�[��#ep18c12_023"),"���������K�[�� : �e�^�҂��h�����Ȃ��ł��������I",1;
	}
	end;
}
ra_temple.gat,31,142,0	script	#ep18w02_021	139,14,14,{/* 15841 */
OnTouch:
	if(EP18_1QUE == 5 || EP18_1QUE == 6) {
		cloakoffnpc "�ł�_���W���m�[�N#e18c_022";
		cloakoffnpc "���������K�[��#ep18c12_023";
		cloakoffnpc "���������C�Y#ep18c13_024";
		cloakoffnpc "���������J���\�b�c#c14_025";
		cloakoffnpc "�n�[�g�n���^�[#ep18c15_026";
		cloakoffnpc "�n�[�g�n���^�[#ep18c16_027";
	} else if(EP18_1QUE == 7) {
		cloakoffnpc "�ł�_���W���m�[�N#e18c_022";
		cloakonnpc "���������K�[��#ep18c12_023";
		cloakonnpc "���������C�Y#ep18c13_024";
		cloakonnpc "���������J���\�b�c#c14_025";
		cloakonnpc "�n�[�g�n���^�[#ep18c15_026";
		cloakonnpc "�n�[�g�n���^�[#ep18c16_027";
		cloakonnpc "���������`���C�u#c17_028";
		cloakonnpc "�n�[�g�n���^�[#ep18c18_029";
		cloakonnpc "�n�[�g�n���^�[#ep18c19_030";
	}
	end;
}
ra_temple.gat,30,142,1	script	�ł�_���W���m�[�N#e18c_022	935,{/* 15842 */
	if(EP18_1QUE == 5) {
		mes "[����X�}�[�g�G���[]";
		mes "�c�c�s�s�I";
		mes "�w�v������葁��������܂����B";
		mes "�@���̕����́A�o�������g�l�̓@���";
		mes "�@�N�������҂����Ɠ����ł��x";
		next;
		mes "[���������C�Y]";
		mes "���O��͕�͂���Ă�I�@���~����I";
		next;
		mes "[�n�[�g�n���^�[]";
		mes "�͂��A��͂��������āH";
		mes "���߂ł����z�炾���B";
		mes "�����͕ʓ������_�a���Ɂc�c�B";
		next;
		mes "[���������`���C�u]";
		mes "�ʓ����Ƃ́A������̂��Ƃ��H";
		cloakoffnpc "���������`���C�u#c17_028";
		cloakoffnpc "�n�[�g�n���^�[#ep18c18_029";
		cloakoffnpc "�n�[�g�n���^�[#ep18c19_030";
		unittalk getnpcid(0,"�n�[�g�n���^�[#ep18c19_030"),"�n�[�g�n���^�[ : �����c�c",1;	// 15850
		unittalk getnpcid(0,"�n�[�g�n���^�[#ep18c18_029"),"�n�[�g�n���^�[ : �������傤�c�c",1;	// 15849
		next;
		mes "[�n�[�g�n���^�[]";
		mes "�c�c�A���͕K�����������Ă݂���I";
		next;
		mes "^0000FF�]�N���҂ɂ��ĐS�����肪���邱�Ƃ�";
		mes "�@���������ɓ`���悤�]^000000";
		close2;
		set EP18_1QUE,6;
		delquest 8685;
		setquest 8686;
		cloakonnpc "�n�[�g�n���^�[#ep18c15_026";
		cloakonnpc "�n�[�g�n���^�[#ep18c16_027";
		cloakonnpc "�ł�_���W���m�[�N#e18b_016";
		end;
	} else if(EP18_1QUE == 6) {
		cloakoffnpc "���������`���C�u#c17_028";
		cloakoffnpc "�n�[�g�n���^�[#ep18c18_029";
		cloakoffnpc "�n�[�g�n���^�[#ep18c19_030";
		mes "[���������K�[��]";
		mes "�c�c";
		mes "�����ɋꂵ�݂܂��B";
		mes "������G�����A���炩�ɖڗ����Ă���B";
		mes "�z���Ƃ����̂Ƃ��Ⴄ�C�����邵�c�c";
		mes "�����ړI�ŁA�ǂ����痈���̂��c�c�B";
		next;
		menu "�S�����肪���邱�Ƃ�`����",-;
		mes "^0000FF�]��������ׂĐ��������ɂ͂����Ȃ���";
		mes "�@�ނ��ǂ��ė������Ƃ�`�����]^000000";
		next;
		mes "[���������K�[��]";
		mes "�ӂށc�c";
		mes "��_���́u�j���G���v�l��";
		mes "���`�����������ǂ������ł��ˁB";
		next;
		mes "[�W���m�[�N]";
		mes "�������ꂪ�ǂ��Ǝv���܂��B";
		mes "�j���G����_���l�Ȃ�";
		mes "�����Ǝ��݂��Ă�������ł��傤�B";
		unittalk getnpcid(0,"���������K�[��#ep18c12_023"),"���������K�[�� : �܂��A��������S�ւ���B�V����̂悤�����ȁB",1;
		unittalk getnpcid(0,"���������`���C�u#c17_028"),"���������`���C�u : �������܂����B",1;
		next;
		mes "[���������K�[��]";
		mes "�_�a���ɓ�������";
		mes "�u^0000FF���������̃f���g^000000�v�ɕ����Ă��������B";
		mes "�_�a�����ē����Ă����͂��ł��B";
		set EP18_1QUE,7;
		delquest 8686;
		setquest 8687;
		close;
	} else if(EP18_1QUE == 7) {
		mes "[�W���m�[�N]";
		mes "�u�j���G����_���v�l��";
		mes "��������`�����������B";
		mes "�����Ǝ��݂��Ă�������ł��傤�B";
		mes "�_�a���́u^0000FF���������̃f���g^000000�v��";
		mes "��莟���ł�����Ă��������B";
		next;
		mes "�]�_�a�̓����֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͐_�a�̓����֌��������]";
		close2;
		warp "ra_temple.gat", 119, 173;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 5 && EP18_1QUE <= 7)
		showevent 1,1,"�ł�_���W���m�[�N#e18c_022";
	else
		showevent 9999,0,"�ł�_���W���m�[�N#e18c_022";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,25,147,5	script	���������K�[��#ep18c12_023	934,{/* 15843 */
	unittalk getnpcid(0,"���������K�[��#ep18c12_023"),"���������K�[�� : �f���ɓ��~����I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,29,143,1	script	���������C�Y#ep18c13_024	934,{/* 15844 */
	unittalk getnpcid(0,"���������C�Y#ep18c13_024"),"���������C�Y : �_���a�A�O�ɏo�Ȃ��ł��������I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,26,145,7	script	���������J���\�b�c#c14_025	934,{/* 15845 */
	unittalk getnpcid(0,"���������J���\�b�c#c14_025"),"���������J���\�b�c : ��������낹�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,31,147,4	script	�n�[�g�n���^�[#ep18c15_026	20681,{/* 15846 */
	unittalk getnpcid(0,"�n�[�g�n���^�[#ep18c15_026"),"�n�[�g�n���^�[ : �����������`�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,29,146,4	script	�n�[�g�n���^�[#ep18c16_027	20681,{/* 15847 */
	unittalk getnpcid(0,"�n�[�g�n���^�[#ep18c16_027"),"�n�[�g�n���^�[ : �Ȃ�Ă������`�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,35,141,1	script	���������`���C�u#c17_028	934,{/* 15848 (cloaking)*/
	unittalk getnpcid(0,"���������`���C�u#c17_028"),"���������`���C�u : �߂Â��Ȃ��ł��������A�댯�ł��I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,36,140,4	script	�n�[�g�n���^�[#ep18c18_029	20681,{/* 15849 (cloaking)*/
	unittalk getnpcid(0,"�n�[�g�n���^�[#ep18c18_029"),"�n�[�g�n���^�[ : ���܂����܂����`�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temple.gat,37,140,4	script	�n�[�g�n���^�[#ep18c19_030	20681,{/* 15850 (cloaking)*/
	unittalk getnpcid(0,"�n�[�g�n���^�[#ep18c19_030"),"�n�[�g�n���^�[ : ���ڂ��Ƃ���`�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,173,38,0	script	#ep18w03_139	139,15,15,{/* 15851 */
OnTouch:
	if(EP18_1QUE >= 7) {
		cloakoffnpc "���������f���g#ep18_032";
		cloakoffnpc "���������j�[��#ep18_033";
		cloakoffnpc "�t���C���̎i��#ep18_034";
		cloakoffnpc "���w���̏Z��#ep18_in1_036";
		cloakoffnpc "���w���̏Z��#ep18_in2_037";
		cloakoffnpc "���w���̏Z��#ep18_in3_038";
		cloakoffnpc "���w���̏Z��#ep18_in4_039";
		cloakoffnpc "���w���̏Z��#ep18_in5_040";
		cloakoffnpc "���w���̏Z��#ep18_in6_041";
		cloakoffnpc "���w���̏Z��#ep18_in7_042";
	}
	else {
		cloakonnpc "���������f���g#ep18_032";
		cloakonnpc "���������j�[��#ep18_033";
		cloakonnpc "�t���C���̎i��#ep18_034";
		cloakonnpc "���w���̏Z��#ep18_in1_036";
		cloakonnpc "���w���̏Z��#ep18_in2_037";
		cloakonnpc "���w���̏Z��#ep18_in3_038";
		cloakonnpc "���w���̏Z��#ep18_in4_039";
		cloakonnpc "���w���̏Z��#ep18_in5_040";
		cloakonnpc "���w���̏Z��#ep18_in6_041";
		cloakonnpc "���w���̏Z��#ep18_in7_042";
	}
	end;
}
ra_temin.gat,173,40,3	script	���������f���g#ep18_032	934,{/* 15852 */
	if(EP18_1QUE == 7) {
		mes "[���������f���g]";
		mes "�����I";
		mes "�݂�ȕ���ł�̂������Ȃ��̂��H";
		mes "�j���G���l�ɗp��������̂Ȃ�";
		mes "���Ԃ�����Ă����I";
		next;
		mes "[���������f���g]";
		mes "�͂��c�c�Ȃ�ł���ȂɖZ�����񂾁H";
		mes "�X�̑������~�߂�ׂɏo�������̂�";
		mes "���������ł����񂩒m���Ă邩!?";
		next;
		mes "[���������f���g]";
		mes "�O����ڏZ�̖��ƌ��Z����";
		mes "�����Ȃ��߂��Ƃ͂�������";
		mes "�ŋ߂͓x���߂���I";
		mes "���`�v���o�������œ����ɂ��Ȃ��Ă����B";
		next;
		mes "[���������f���g]";
		mes "��[���I";
		mes "���O�͍ŋ߂ǂ����H";
		set EP18_1QUE,8;
		delquest 8687;
		setquest 11696;
		close;
	} else if(EP18_1QUE == 8) {
		mes "[���������f���g]";
		mes "��[���I";
		mes "���O�͍ŋ߂ǂ����H";
		close;
	}
	mes "[���������f���g]";
	mes "�͂��c�c";
	mes "�����X�����������ė~�������B";
	close;
OnQuestInfo:
	if(EP18_1QUE == 7)
		showevent 1,0,"���������f���g#ep18_032";
	else
		showevent 9999,0,"���������f���g#ep18_032";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,174,38,3	script	���������j�[��#ep18_033	939,{/* 15853 */
	if(EP18_1QUE == 8) {
		mes "[���������j�[��]";
		mes "�L�~�͂܂��}�V�ȕ�����I";
		mes "���Ă̒ʂ�A�{�N���Č��Z���o�g����H";
		mes "�{�N�������u�ԁA���O����Ȃ���";
		mes "�ڏZ�̖��̎����������Ă�ŗ�������";
		mes "������n���Ȃ񂾂���I";
		next;
		mes "[���������j�[��]";
		mes "�ǂ���������";
		mes "���Z���̂����Ɂ`���Z���̂����Ɂ`����";
		mes "���Ƀ^�R���ł�����I";
		next;
		mes "[���������j�[��]";
		mes "�c�c�����Ɍ�����";
		mes "�{���ɂ��������C������B";
		mes "�ŋ߂͍��ׂȌ����܂ł�";
		mes "�傫�Ȍ��܂ɂȂ����Ⴄ�񂾂���B";
		next;
		mes "[���������j�[��]";
		mes "�{�N�̘b���C�ɂȂ�̂����H";
		mes "����Ȃ�A�����̐_���l�ɂ�";
		mes "�����Ă݂���H";
		mes "�����̐_���l�����ߎ���";
		mes "�������܂�Ă��݂��������炳�B";
		set EP18_1QUE,9;
		delquest 11696;
		setquest 11697;
		close;
	} else if(EP18_1QUE == 11) {
		cloakoffnpc "�j���G��#ep18_in1_035";
		cutin "ra_gwoman.bmp", 0;
		mes "[�j���G����_��]";
		mes "�j�[���B";
		mes "�u�}�����v���ǂ��ɂ��邩�m��܂��񂩁H";
		mes "�X�ɏo�Ă���Ǝv���̂ł����B";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "[���������j�[��]";
		mes "�}�����l�ł����H";
		mes "�_�a���o����̍L��ł�����܂�����I";
		next;
		mes "[���������j�[��]";
		mes "�܂��L��ɂ����邩�͂킩��܂���";
		mes "�u�L��ɂ���l�����v�ɕ����ĉ���";
		mes "������񂶂�Ȃ��ł����ˁB";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[�j���G����_��]";
		mes "���肪�Ƃ��B";
		mes "�c�c"+strcharinfo(0)+"�l�B";
		mes "����Ă������������l���Ƃ����̂�";
		mes "���̑��q�́u�}�����v�ł��B";
		next;
		menu "���q�c�c!?",-;
		cutin "ra_gwoman2.bmp", 0;
		mes "[�j���G����_��]";
		mes "����H�@����Ȃɋ������Ƃ�";
		mes "�����S�O�ł��ˁB";
		mes "�{���̎q�ł͂���܂���B";
		mes "�}�����́u�{�q�v�Ȃ̂ł��B";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[�j���G����_��]";
		mes "���ځA�Љ�����Ƃ���ł���";
		mes "���͐_�a���痣����܂���B";
		mes "�X�̍L��Ń}������T���Ă��������B";
		mes "������̏Љ�ƌ�����";
		mes "�b�𕷂��Ă����ł��傤�B";
		set EP18_1QUE,12;
		delquest 11699;
		setquest 11700;
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	} else if(EP18_1QUE == 12) {
		mes "[���������j�[��]";
		mes "�}�����l�ł�����";
		mes "�_�a���o����̍L��ł�����܂�����B";
		mes "�܂��L��ɂ����邩�͂킩��܂���";
		mes "�u�L��ɂ���l�����v�ɕ����ĉ���";
		mes "������񂶂�Ȃ��ł����ˁB";
		next;
		mes "�]���w���̍L��֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��̓��w���̍L��֌��������]";
		close2;
		warp "rachel.gat", 142, 140;
		end;
	}
	mes "[���������j�[��]";
	mes "�j���G���l�����Z���������Ȃ��`�B";
	close;
OnQuestInfo:
	if(EP18_1QUE == 8 || EP18_1QUE == 11 || EP18_1QUE == 12)
		showevent 1,1,"���������j�[��#ep18_033";
	else
		showevent 9999,0,"���������j�[��#ep18_033";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,172,36,7	script	�t���C���̎i��#ep18_034	916,{/* 15854 (cloaking)*/
	if(EP18_1QUE == 9) {
		mes "[�t���C���̎i��]";
		mes "�������͐M�k������";
		mes "�^���̐M�ƐS�̕����̂��߂�";
		mes "��ɋF�������Ă���܂��B";
		mes "�������c�c�B";
		next;
		mes "[�t���C���̎i��]";
		mes "�ߍ��A�_�a���ł������N�����l������";
		mes "�����Ă��܂��B";
		mes "�����ő�������吺���グ���肷��";
		mes "���x�Ȃ̂ł����c�c�B";
		next;
		mes "[�t���C���̎i��]";
		mes "�ȑO�ɔ�ׂ��";
		mes "���܂ɂ܂Ŕ��W����P�[�X��";
		mes "�������悤�Ɏv���܂��B";
		next;
		cloakoffnpc "�j���G��#ep18_in1_035";
		cutin "ra_gwoman.bmp", 0;
		mes "[�j���G����_��]";
		mes "�_���Ȑ_�a�Ō��܂Ƃ́c�c";
		mes "���̐l�����̕s����b��������";
		mes "����������@�͂���܂��񂩁H";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "[�t���C���̎i��]";
		mes "�j���G���l!!";
		mes "���܂̒��قɓ����Ă�";
		mes "���݂��Ɉْ[�҂��ƌ���������";
		mes "�b�𕷂����Ƃ����Ȃ��̂ł��I";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[�j���G����_��]";
		mes "�͂��c�c";
		mes "�ْ[�Ȃǂƌy�X�������ɂ���";
		mes "�ǂ����t�ł͂Ȃ��̂Ɂc�c";
		mes "�܂�Łu�}�i�h�v�̂悤�ȕ������ł��ˁB";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "[�t���C���̎i��]";
		mes "�u�r���h��_���v���͂��߂Ƃ���";
		mes "�u�}�i�h�v�̌���X�͎��r���܂�����";
		mes "�ނ�̎x���҂�����l�����ɂ�";
		mes "�����ɉe���͂�����܂��B";
		next;
		cutin "ra_gwoman.bmp", 0;
		mes "[�j���G����_��]";
		mes "����܂Ŏ�������";
		mes "�ڏZ�̖��ƌ��Z���Ƃ̍a�𖄂߂邽�߂�";
		mes "�S���ӂ��Ă��܂�����";
		mes "���̓w�͖͂��ʂ������̂ł��傤���c�c�B";
		next;
		mes "[�j���G����_��]";
		mes "����c�c�I";
		mes strcharinfo(0)+"�l!?";
		mes "�\���󂠂�܂���B";
		mes "�܂������C�Â��܂���ł����B";
		next;
		mes "[�j���G����_��]";
		mes "�c�c���p���������b�ł���";
		mes "���̃��w���͉��₩�ȂƂ�";
		mes "������󋵂Ȃ̂ł��B";
		mes "�c�c�Ƃ���ŁA�������R��������";
		mes "�����ɗ���ꂽ�̂ł͂Ȃ��ł����H";
		next;
		menu "�N���҂ɂ��Ă��b���c�c",-;
		mes "[�j���G����_��]";
		mes "�c�c�ӂށB";
		mes "�ꏊ���ڂ��܂��傤���B";
		mes "����^ff0000�K�i^000000�̏��ɗ��Ă��������B";
		mes "�b�͂����Ŏf���܂��B";
		viewpoint 1, 217, 83, 18, 0x00FF00;
		set EP18_1QUE,10;
		delquest 11697;
		setquest 11698;
		close2;
		cloakonnpc "�j���G��#ep18_in1_035";
		cutin "ra_gwoman.bmp", 255;
		end;
	} else if(EP18_1QUE == 10) {
		cloakonnpc "�j���G��#ep18_in1_035";
		mes "[�t���C���̎i��]";
		mes "�j���G���l�Ƃ��b������̂ł́H";
		mes "�j���G���l�́A���̊K�i�̏���";
		mes "�s����܂�����H";
		next;
		mes "�]���̊K�i�̏��֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͉��̊K�i�̏��֌��������]";
		close2;
		warp "ra_temin.gat", 212, 82;
		end;
	}
	mes "[�t���C���̎i��]";
	mes "�������͐M�k������";
	mes "�^���̐M�ƐS�̕����̂��߂�";
	mes "��ɋF�������Ă���܂��B";
	close;
OnQuestInfo:
	if(EP18_1QUE == 9 || EP18_1QUE == 10)
		showevent 1,1,"�t���C���̎i��#ep18_034";
	else
		showevent 9999,0,"�t���C���̎i��#ep18_034";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,170,38,5	script	�j���G��#ep18_in1_035	915,{/* 15855 (cloaking)*/
	mes "[�j���G����_��]";
	mes "���������܂������H";
	close;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,171,42,5	script	���w���̏Z��#ep18_in1_036	919,{/* 15856 */
	unittalk getnpcid(0,"���w���̏Z��#ep18_in1_036"),"���w���̏Z�� : �Ȃ�Ƃ����ā[�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,173,43,3	script	���w���̏Z��#ep18_in2_037	930,{/* 15857 */
	unittalk getnpcid(0,"���w���̏Z��#ep18_in2_037"),"���w���̏Z�� : �ǁ[�Ȃ��Ă�́H",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,175,36,8	script	���w���̏Z��#ep18_in3_038	940,{/* 15858 (cloaking)*/
	unittalk getnpcid(0,"���w���̏Z��#ep18_in3_038"),"���w���̏Z�� : ���s�s����I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,170,35,1	script	���w���̏Z��#ep18_in4_039	945,{/* 15859 (cloaking)*/
	unittalk getnpcid(0,"���w���̏Z��#ep18_in4_039"),"���w���̏Z�� : �͂��c�c�B",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,174,34,3	script	���w���̏Z��#ep18_in5_040	929,{/* 15860 (cloaking)*/
	unittalk getnpcid(0,"���w���̏Z��#ep18_in5_040"),"���w���̏Z�� : ����ȂɋF���Ă���̂ɁI",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,177,33,5	script	���w���̏Z��#ep18_in6_041	921,{/* 15861 (cloaking)*/
	unittalk getnpcid(0,"���w���̏Z��#ep18_in6_041"),"���w���̏Z�� : �t���C���l�I�@�t���C���l�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,173,32,8	script	���w���̏Z��#ep18_in7_042	917,{/* 15862 (cloaking)*/
	unittalk getnpcid(0,"���w���̏Z��#ep18_in7_042"),"���w���̏Z�� : �ǂ��ɂ����Ă�I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,213,87,3	script	�j���G��#ep18_in2_043	915,{/* 15863 */
	if(EP18_1QUE == 10) {
		cutin "ra_gwoman.bmp", 1;
		mes "[�j���G����_��]";
		mes "�����Ȃ瓐�ݕ�������l�����Ȃ��ł��傤�B";
		mes "���Ƀf���P�[�g�Ȗ��̂悤�ł����B";
		next;
		menu "�����ɗ������R���������",-;
		mes "[�j���G����_��]";
		mes "�c�c���̘b�͖{���ł����H";
		mes "�u�C���V�I���v�Ɂu�n�[�g�n���^�[�v�c�c";
		mes "�ނ炪�u���~���̐S���̌��Ёv��";
		mes "�u�o�������g�̈�Y�v��_���Ă����Ƃ́B";
		next;
		mes "[�j���G����_��]";
		mes "�����Ă��܁A�_�a�ւ̐N����";
		mes "�J��Ԃ��Ă���̂�";
		mes "�u�n�[�g�n���^�[�v�������Ƃ����̂Ȃ�";
		mes "���̖ړI�͋��炭�_�a���́c�c�B";
		next;
		mes "[�j���G����_��]";
		mes "���̋��L�A���肪�Ƃ��������܂��B";
		mes "�����ɐ_�a���̌x����������܂��傤�B";
		next;
		mes "[�j���G����_��]";
		mes "����ɂ��Ă��c�c�ڏZ�̖���";
		mes "���Z���Ƃ��a瀂�����܂łɂȂ�";
		mes "�傫���Ȃ��Ă���Œ����Ƃ����̂�";
		mes "�l�肪����邩�ǂ����c�c�B";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "^0000FF�]���ߑ���f���j���G����������";
		mes "�@�����v�������̂�";
		mes "�@�^���Ȃ܂Ȃ����ł�����̊��";
		mes "�@�����ƌ��߂Ă����]^000000";
		next;
		cutin "ra_gwoman.bmp", 1;
		mes "[�j���G����_��]";
		mes strcharinfo(0)+"�l��";
		mes "�ЂƂ��肢������܂��B";
		mes "���̎����ɂ��Ȃ������w���ɗ����̂�";
		mes "�t���C���l�̎v�������Ȃ̂ł��傤�B";
		next;
		mes "[�j���G����_��]";
		mes "���łɂ��������Ǝv���܂���";
		mes "���̃��w���́A�ڏZ�̖��ƌ��Z���Ƃ̊Ԃ�";
		mes "�p�ɂɂ��ߎ����������Ă��܂��B";
		next;
		mes "[�j���G����_��]";
		mes "����܂ł��A���Z���ɍ��ʓI��";
		mes "�u�}�i�h�v�̉e����������";
		mes "���҂��G�΂��邱�Ƃ͂���܂����B";
		next;
		mes "[�j���G����_��]";
		mes "�������u�}�i�h�v�����r�����ɂ��ւ�炸";
		mes "���̂͐i�W����ǂ��납";
		mes "�������Ă���悤�Ɏv���̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�꒩�ɂ��ė��҂��a�����邱�ƂȂ�";
		mes "���肦�Ȃ��̂͂킩���Ă�������ł��B";
		mes "�ł����c�c�ǂ����č�";
		mes "���̂悤�ȏ󋵂Ɋׂ����̂�";
		mes "�����A���ɂ͗����ł��܂���B";
		next;
		mes "[�j���G����_��]";
		mes "���́A�ڏZ�̖��ƌ��Z����";
		mes "�����a���ł���ƐM���Ă��܂��B";
		mes "�ł�����A���̏󋵂ɂȂ���������";
		mes "�a���̂��߂̂��������ƂȂ���̂�";
		mes "�����o�������̂ł��B";
		next;
		menu "���͕��O�҂ł����c�c",-;
		cutin "ra_gwoman2.bmp", 1;
		mes "[�j���G����_��]";
		mes "�����炱���A���肢���Ă���̂ł��B";
		mes "�ڏZ�̖��ł��Ȃ��A���Z���ł��Ȃ�";
		mes "���Ȃ������炱���A���̉�����";
		mes "�K�v�Ȃ̂ł͂Ȃ����ƁB";
		next;
		cutin "ra_gwoman.bmp", 1;
		mes "[�j���G����_��]";
		mes "�c�c���Ȃ��ɏЉ�����l�������܂��B";
		mes "�ڏZ�̖��ƌ��Z���̒�����莝��";
		mes "�u�������v�ƂȂ�҂ł��B";
		mes "���́A�X�ɏo�����Ă��܂����B";
		next;
		mes "[�j���G����_��]";
		mes "��������_�a�̓����ɖ߂�܂��傤�B";
		mes "�����ɂ��鎡�����ɕ�����";
		mes "�ނ̋��ꏊ�������Ă����ł��傤�B";
		set EP18_1QUE,11;
		delquest 11698;
		setquest 11699;
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	} else if(EP18_1QUE == 11) {
		cutin "ra_gwoman.bmp", 1;
		mes "[�j���G����_��]";
		mes "��������_�a�̓����ɖ߂�܂��傤�B";
		mes "�����ɂ��鎡�����ɕ�����";
		mes "�ނ̋��ꏊ�������Ă����ł��傤�B";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "�]�����ɂ��鎡�����̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͓����ɂ��鎡�����̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "ra_temin.gat", 170, 39;
		end;
	}
	mes "[�j���G����_��]";
	mes "���͏����Z������";
	mes "�肪�����Ȃ��̂ł��B";
	mes "�܂�����c�c�B";
	cutin "ra_gwoman.bmp", 1;
	close2;
	cutin "ra_gwoman.bmp", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 10 || EP18_1QUE == 11)
		showevent 1,1,"�j���G��#ep18_in2_043";
	else
		showevent 9999,0,"�j���G��#ep18_in2_043";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,137,135,7	script	���l#ep18_���w��1_044	929,{/* 15864 */
	if(EP18_1QUE == 12) {
		mes "^0000FF�]���̕ӂ肪�A�X�̍L��̂悤���B";
		mes "�@�}���������Ă��Ȃ���";
		mes "�@�l�X�ɐ����|���Ă݂悤�]^000000";
		next;
		menu "�}���������ĂȂ��ł����H",-;
		mes "[���l]";
		mes "�Ȃɂ��`�}���������āH";
		mes "�m�邩�I";
		mes "�A�C�c�̋��ꏊ�Ȃ��";
		mes "�m������������Ȃ��I";
		next;
		mes "[���l]";
		mes "���������΁A���񂽁B";
		mes "�����炶�ጩ�Ȃ��炾�ȁc�c";
		mes "�O�̍��̐l�Ԃ��H";
		next;
		mes "[���l]";
		mes "���������ŒT���Ă�H";
		mes "�������ł�񂶂�˂���Ȃ��H";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�s�s�I";
		mes "�w�G�ΓI�Ȋ�����m�F���܂����B";
		mes "�@���ݓI�ȉ�b�͖]�߂Ȃ��悤�ł��B";
		mes "�@^ff0000���̐l��^000000�ɕ������Ƃ��Ă������܂��x";
		set EP18_1QUE,13;
		delquest 11700;
		setquest 11701;
		viewpoint 1, 136, 120, 18, 0x00FF00;
		close;
	}
	else if(EP18_1QUE == 13) {
		mes "[���l]";
		mes "���������ŒT���Ă�H";
		mes "�������ł�񂶂�˂���Ȃ��H";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�s�s�I";
		mes "�w�G�ΓI�Ȋ�����m�F���܂����B";
		mes "�@���ݓI�ȉ�b�͖]�߂Ȃ��悤�ł��B";
		mes "�@^ff0000���̐l��^000000�ɕ������Ƃ��Ă������܂��x";
		close2;
		viewpoint 1, 136, 120, 18, 0x00FF00;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	mes "[���l]";
	mes "���������΁A���񂽁B";
	mes "�����炶�ጩ�Ȃ��炾�ȁc�c";
	mes "�O�̍��̐l�Ԃ��H";
	close;
OnQuestInfo:
	if(EP18_1QUE == 12)
		showevent 1,1,"���l#ep18_���w��1_044";
	else
		showevent 9999,0,"���l#ep18_���w��1_044";
	end;
}
rachel.gat,136,120,3	script	���l#ep18_���w��2_045	931,{/* 15865 */
	if(EP18_1QUE == 13) {
		mes "^0000FF�]���̕ӂ肪�A�X�̍L��̂悤���B";
		mes "�@�}���������Ă��Ȃ���";
		mes "�@�l�X�ɐ����|���Ă݂悤�]^000000";
		next;
		menu "�}������T���Ă���̂ł���",-;
		mes "[���l]";
		mes "�c�c";
		mes "�悭������܂���B";
		mes "�Ƃ���ŁA�ǂȂ��ł����H";
		mes "�ǂ����ă}������T���Ă��ł����H";
		mes "�}�����Ƃ͂ǂ̂悤�Ȓ��ł����H";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�s�s�I";
		mes "�w�G�ΓI�Ȋ�����m�F���܂����B";
		mes "�@���ݓI�ȉ�b�͖]�߂Ȃ��悤�ł��B";
		mes "�@^ff0000�����L�ꂩ��O��Ă݂�^000000���Ƃ�";
		mes "�@��Ă������܂��x";
		viewpoint 1, 69, 117, 18, 0x00FF00;
		set EP18_1QUE,14;
		delquest 11701;
		setquest 11702;
		close;
	}
	else if(EP18_1QUE == 14) {
		mes "[���l]";
		mes "�c�c";
		mes "�悭������܂���B";
		mes "�Ƃ���ŁA�ǂȂ��ł����H";
		mes "�ǂ����ă}������T���Ă��ł����H";
		mes "�}�����Ƃ͂ǂ̂悤�Ȓ��ł����H";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�s�s�I";
		mes "�w�G�ΓI�Ȋ�����m�F���܂����B";
		mes "�@���ݓI�ȉ�b�͖]�߂Ȃ��悤�ł��B";
		mes "�@^ff0000�����L�ꂩ��O��Ă݂�^000000���Ƃ�";
		mes "�@��Ă������܂��x";
		viewpoint 1, 69, 117, 18, 0x00FF00;
		close;
	}
	mes "[���l]";
	mes "�c�c";
	close;
OnQuestInfo:
	if(EP18_1QUE == 13)
		showevent 1,1,"���l#ep18_���w��2_045";
	else
		showevent 9999,0,"���l#ep18_���w��2_045";
	end;
}
rachel.gat,69,117,7	script	���l#ep18_���w��3_046	919,{/* 15866 */
	if(EP18_1QUE == 14) {
		mes "^0000FF�]���̕ӂ肪�A�X�̍L��̂悤���B";
		mes "�@�}���������Ă��Ȃ���";
		mes "�@�l�X�ɐ����|���Ă݂悤�]^000000";
		next;
		menu "�}�������������܂���ł������H",-;
		mes "[���l]";
		mes "�}�����l��T���Ă�̂����H";
		mes "�l�ɉ�񑩂�����ƌ����Ă����ȁc�c";
		mes "���̑O��ʂ�߂����̂�";
		mes "^ff0000�k^000000�ɍs���Ή��񂶂�Ȃ��B";
		viewpoint 1, 70, 147, 18, 0x00FF00;
		set EP18_1QUE,15;
		delquest 11702;
		setquest 11703;
		close;
	}
	else if(EP18_1QUE == 15) {
		mes "[���l]";
		mes "�}�����l��T���Ă�̂����H";
		mes "�l�ɉ�񑩂�����ƌ����Ă����ȁc�c";
		mes "���̑O��ʂ�߂����̂�";
		mes "^ff0000�k^000000�ɍs���Ή��񂶂�Ȃ��B";
		viewpoint 1, 70, 147, 18, 0x00FF00;
		close;
	}
	mes "[���l]";
	mes "�ŋ߂̃��w���́A";
	mes "�s���ȋ�C���Y���Ă�ˁB";
	mes "�����N���Ȃ���Ηǂ����ǁB";
	close;
OnQuestInfo:
	if(EP18_1QUE == 14)
		showevent 1,1,"���l#ep18_���w��3_046";
	else
		showevent 9999,0,"���l#ep18_���w��3_046";
	end;
}
rachel.gat,70,147,3	script	�}����#ep18_���w��_047	10376,{/* 15867 */
	switch(EP18_1QUE) {
	case 15:
		viewpoint 2, 70, 147, 18, 0x00FF00;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�~���A���́A������̂��ȁ`�B";
		mes "����H";
		mes "����ɂ��́A���̂����B";
		mes "���́u^0000FF�}����^000000�v�ƌ����܂��B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���w���͏����Ȃ��ł����H";
		mes "���̒��������炯�ɂȂ���";
		mes "��J���Ă��܂��񂩁H";
		mes "����������̂��Ƃ������";
		mes "�����Ȃ����ɑ��k���Ă��������ˁB";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�s�s�I";
		mes "�w���̍ŏ�����e���x��MAX��";
		mes "�@�����ς�����l�Ԃ�";
		mes "�@�u�}�����v����ŊԈႢ�Ȃ��悤�ł��x";
		next;
		menu "�j���G������̗��܂ꂲ�Ƃ�`����",-;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "��ォ��ڏZ�̖��ƌ��Z���̒��ق�";
		mes "���肢���ꂽ�̂ł����I";
		mes "����ȏd�v�Ȃ��Ƃ����肢�����Ȃ��";
		mes "���͂�قǂ��Ȃ��̂��Ƃ�";
		mes "�M�p���Ă���̂ł��傤�ˁB";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���߂Ď��ȏЉ���Ă��������B";
		mes "���́u�}�����v�Ɛ\���܂��B";
		mes strcharinfo(0)+"�l�̂悤��";
		mes "�f���炵�����ɋ��͂��Ă��炦��Ȃ��";
		mes "�����͍ō��̈���ɂȂ肻���ł��I";
		next;
		mes "[�}����]";
		mes "���āc�c�܂��͉�����n�߂܂��傤���B";
		mes "���ׂ����Ƃ͑����̂ł���";
		mes "����������A���Z��������";
		mes "�������u�D�F�̎q���B�v�̌���ɂ���";
		mes "�����������܂��傤���B";
		next;
		menu "�D�F�̎q���B�H",-;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�A���i�x���c�����̗��j��";
		mes "�������ł����H";
		mes "���̒n�͌��X�V�q�����Z��";
		mes "�r��ʂĂ��y�n�ł����B";
		next;
		mes "[�}����]";
		mes "�����ɖ��N�O�ɐl�X���ڏZ��";
		mes "�r��ʂĂ��y�n�����Ԃ�������";
		mes "�L���ȓy�n�ƊX��";
		mes "���グ�Ă������̂ł��B";
		next;
		mes "[�}����]";
		mes "���̔��������w���̊X�������ł���";
		mes "���͌��Z���̓y�n�ł��B";
		mes "�ڏZ���Ă����l�X��";
		mes "���X�Z��ł����l�X�𔗊Q��";
		mes "�ނ�̓y�n��D���܂����B";
		next;
		mes "[�}����]";
		mes "���Z���̒��ɂ͈ڏZ�̖��̊X��";
		mes "�Z�����Ƃ���l�����܂�����";
		mes "�S�����ڏZ�ł����킯�ł͂���܂���B";
		mes "�X�ɏZ��ł��A�ڏZ�̖��ɂƂ��Ă�";
		mes "���Q�̑Ώۂł����B";
		next;
		mes "[�}����]";
		mes "����炪�S�ĉߋ��̏o�����ł����";
		mes "�ǂ������̂ł����c�c";
		mes "���ł����ꂪ�����Ă���̂ł��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���̌��ʂƂ��āA���ꏊ�������q��������";
		mes "���݂��Ă��܂��B";
		mes "�c�c�������������q���̈�l�ł��B";
		mes "����ȏ󋵂�J��������";
		mes "����{�q�ɂ��Ă���܂����B";
		next;
		mes "[�}����]";
		mes "����ɑ�_���ƂȂ��Ă����";
		mes "���ꏊ���������q������";
		mes "�T���ȉƒ낪�ϋɓI��";
		mes "�}������鐭���";
		mes "�i�߂Ă��ꂽ�̂ł��B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�ł����c�c������C�ɓ���Ȃ��l������";
		mes "�������̂��Ƃ��u�D�F�̎q���B�v�ƌĂ�";
		mes "���ʂ��n�߂܂����B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���́A���������ڏZ�̖��ƌ��Z����";
		mes "�������ƂȂ邱�Ƃ����҂��Ă��܂�����";
		mes "�ڏZ�̖��ɂ��A���Z���ɂ��Ȃ��߂Ȃ�";
		mes "���r���[�ȑ��݂ɂ����Ȃ�܂���ł����B";
		mes "�����͌������ł��ˁB";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[�H�H�H]";
		mes "�������Ƃ������Ă邯��";
		mes "�{���͂���Ȃ���";
		mes "���o���v���Ă��Ȃ�����H";
		mes "���O�͂����y�ϓI������ȁB";
		next;
		cloakoffnpc "�~���A��#ep18_���w��_04";
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�����I�@�~���A���I";
		mes "�����炻���ɂ����񂾂�H";
		mes "�x�����Ă���Ȃ�ăq�h�C��I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�c�c";
		mes "�����̂��Ƃ���B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes strcharinfo(0)+"�l�B";
		mes "������́A�F�l�́u^0000FF�~���A��^000000�v�ł��B";
		mes "������ƕs���z�ł������C�ɂȂ��炸";
		mes "�Ƃ�Ă邾���ł�����B";
		mes "�c�c���Ă��I";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "^0000FF�]�~���A���̓}������e�͂Ȃ�";
		mes "�@�R����΂����]^000000";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "����ƁA���X���]�k�ł��c�c";
		mes "�C�^�b�I�@�ɂ����āA�~���A���I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�b�͕����Ă�����B";
		mes "�`���҂����";
		mes "�j���G���l�̈˗��ŗ�����ł���H";
		mes "��������A�{�N�����̂���";
		mes "��`���Ă����񂾂�ˁB";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����͂������Ǝv�����ǁc�c";
		mes "����H";
		mes "�~���A���c�c����ł������̂́H";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "������c�c";
		mes "��`���ė~�����񂾁B";
		mes "�{�N�̘b�𕷂��Ă����H";
		set EP18_1QUE,16;
		delquest 11703;
		setquest 11704;
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	case 16:
		cloakoffnpc "�~���A��#ep18_���w��_048";
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes strcharinfo(0)+"�l�B";
		mes "������́A�F�l�́u^0000FF�~���A��^000000�v�ł��B";
		mes "������ƕs���z�ł������C�ɂȂ��炸";
		mes "�Ƃ�Ă邾���ł�����B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 17:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���X�������������̂ł����A";
		mes "��������^ff0000�쓌^000000�ɂ��鏤�l�̂Ƃ���܂�";
		mes "�ꏏ�ɗ��Ă��炢�����̂ł��B";
		mes "��������΁u�D�F�̎q���B�v��";
		mes "�u����Ă���󋵂�";
		mes "�������Ă���������Ǝv���܂����B";
		close2;
		viewpoint 1, 87, 122, 18, 0x00FF00;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�~���A��#ep18_���w��_048";
		end;
	//18-20 ������
	case 21:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����c�c";
		mes "�������ȒP�ł͂���܂���ˁB";
		mes "�ȑO�́A�����ƃ��N�������̂ł����ǁB";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	//22 ������
	case 23:
	case 24:
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "������̏����͏����ł���B";
		mes "���������A��낵�����肢���܂��ˁB";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 25:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����l�ł�";
		mes strcharinfo(0)+"�l�B";
		mes "�K�v�Ȑl���͏W�܂肻���ł����H";
		mes "����H";
		next;
		mes "[�^�}����]";
		mes "���̑O�́A�ǂ����B";
		mes "�j���G����_���̂��q���l�B";
		cloakoffnpc "�^�}����#ep18_�}����_04";
		cutin "ep18_tamarin_02.png", 1;
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "����A����K�˂Ă��炵�����X�ł��ˁI";
		mes strcharinfo(0)+"�l��";
		mes "���m�荇���ł������B";
		next;
		cloakoffnpc "�~���A��#ep18_���w��_04";
		cutin "ep18_miriam_02.png", 0;
		mes "[�~���A��]";
		mes "�c�c�}�����B";
		mes "����ꂽ�ʂ�";
		mes "������ۂ��������U���ė�����B";
		mes "����ő���邩�ȁH";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�͂͂́I�@�f���炵���`�I";
		mes "���������~���A���I";
		mes "����A����Ȃ��薳���������B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�c�c����ł͏������������̂�";
		mes "���ꂩ���邱�Ƃ�������܂��ˁB";
		next;
		mes "[�}����]";
		mes "�������̓~���A���������Ă�������";
		mes "�ٍ��̃L�����o�������ɕϑ�����";
		mes "�w�������i��������܂��B";
		next;
		mes "[�}����]";
		mes "�i�����󂯎������";
		mes "�L�����o���𑕂����܂܊X���o��";
		mes "�Ƃ���ꏊ�܂ŉו����^��ł��������B";
		mes "�ړI�n�͔閧�Ȃ̂ŋ������܂��񂩂�";
		mes "���̌�����ė��Ă��������B";
		next;
		mes "[�}����]";
		mes ""+strcharinfo(0)+"�l��";
		mes "^ff0000��قǔ����������X^000000�ɍs����";
		mes "���������o������Ɠ`���Ă��������B";
		mes "���Ƒ��̃����o�[�͒��ւ���";
		mes "�u^0000FF���̖�^000000�v�őҋ@���Ă��܂�����ˁB";
		viewpoint 1, 137, 85, 18, 0x00FF00;
		set EP18_1QUE,26;
		delquest 11713;
		setquest 11714;
		close2;
		showevent 0, 1, "���l#ep18_���w��_0643_0";	// 2295: 137, 85
		cloakonnpc "�~���A��#ep18_���w��_04";
		cloakonnpc "�^�}����#ep18_�}����_04";
		cutin "ep18_maram_01.png", 255;
		end;
	case 26:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes strcharinfo(0)+"�l��";
		mes "^ff0000��قǔ����������X^000000�ɍs����";
		mes "���������o������Ɠ`���Ă��������B";
		mes "���Ƒ��̃����o�[�͒��ւ���";
		mes "�u^0000FF���̖�^000000�v�őҋ@���Ă��܂�����ˁB";
		close2;
		viewpoint 1, 137, 85, 18, 0x00FF00;
		cutin "ep18_maram_01.png", 255;
		end;
	case 27:
	case 28:
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes strcharinfo(0)+"�l��";
		mes "��`���Ă��������������";
		mes "�S�Ă������ɂ��������ł��B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�~���A���́A������̂��ȁ`�B";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 15 || EP18_1QUE == 25)
		showevent 0,1,"�}����#ep18_���w��_047";
	else
		showevent 9999,0,"�}����#ep18_���w��_047";
	end;
}
rachel.gat,62,144,0	script	#ep18w05_141	139,14,14,{/* 15868 */
	if(EP18_1QUE == 16 || EP18_1QUE == 17) {
		cloakoffnpc "�~���A��#ep18_���w��_048";
	}
	end;
}
rachel.gat,62,144,5	script	�~���A��#ep18_���w��_048	10377,{/* 15869 (cloaking)*/
	if(EP18_1QUE == 16) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�ӂ��c�c���́c�c";
		mes "��Ċ������ł�";
		mes strcharinfo(0)+"�l�B";
		mes "�}�����̗F�l�Łu�~���A���v�Ɛ\���܂��B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�o�����c�c�~���A���̔L���Ԃ胂�[�h�B";
		mes "�ǂ�������炻��ȋ}��";
		mes "�����炵���Ȃ��̂��c�c�B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�]�v�Ȃ��Ƃ͌���Ȃ��ėǂ�����I";
		mes "�ق�A����A�Ԃ���B";
		mes "�}��������a�����Ă������؎�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "������!?";
		mes "�ȂɁH";
		mes "���������āA�����Ȃ��������Ă��ƁH";
		next;
		mes "[�}����]";
		mes "�˂��c�c���������āA�������̍ۂ�";
		mes "����Ȃ��Ƃ��ĂȂ���ˁH";
		mes "�~���A�����Ă����Ȃ胀�b�Ƃ���";
		mes "����Ȃ��ƌ��������邩�炳�B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "����Ȃ��Ɩ������I";
		mes "�{�N�̂��Ƃ������Ǝv���Ă�́H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�{���Ɂ`�H";
		mes "���`��c�c�ł��������ȁB";
		mes "����ς�A�������ɏo�Ȃ��ƃ_�������B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�킩�����A�����s����B";
		mes strcharinfo(0)+"�l";
		mes "�\����Ȃ��̂ł���";
		mes "���ƈꏏ�ɗ��Ă���܂��񂩁B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���X�������������̂ł����A";
		mes "��������^ff0000�쓌^000000�ɂ��鏤�l�̂Ƃ���܂�";
		mes "�ꏏ�ɗ��Ă��炢�����̂ł��B";
		mes "��������΁u�D�F�̎q���B�v��";
		mes "�u����Ă���󋵂�";
		mes "�������Ă���������Ǝv���܂����B";
		set EP18_1QUE,17;
		delquest 11704;
		setquest 11705;
		viewpoint 1, 87, 122, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�~���A��#ep18_���w��_048";
		end;
	}
	else if(EP18_1QUE == 17) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�ӂ��c�c���́c�c";
		mes "��Ċ������ł�";
		mes strcharinfo(0)+"�l�B";
		mes "�}�����̗F�l�Łu�~���A���v�Ɛ\���܂��B";
		close2;
		cutin "ep18_miriam_03.png", 255;
		cloakonnpc "�~���A��#ep18_���w��_048";
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 16)
		showevent 0,1,"�~���A��#ep18_���w��_048";
	else
		showevent 9999,0,"�~���A��#ep18_���w��_048";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,68,146,5	script	�^�}����#ep18_�}����_049	10381,{/* 15870 (cloaking)*/
	//fallthrough
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,87,122,7	script	���l#ep18_���w��_0641_01	942,{/* 15871 */
	if(EP18_1QUE == 17) {
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "����ɂ��́`�X�����В��B";
		mes "����̂��肢�ɗ����̂ł����c�c�B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[���l�X����]";
		mes "�}�����I";
		mes "�M�l��u�D�F�̎q���B�v��";
		mes "����i�͖����I";
		mes "�����ɍs���I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����Ȃ��Ƌ炸�Ɂc�c";
		mes "�ȑO�́A����ɉ����Ă����������ł�";
		mes "����܂��񂩁B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[���l�X����]";
		mes "���邳���I";
		mes "�j���G���l�̖��O���Ȃ�������";
		mes "�@���o���Ă�Ƃ��낾�I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "����������B";
		mes "�A�낤�A�}�����B";
		mes "���炵�܂����A�X�����В��c�c�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�c�c�����������Ƃ�����܂��B";
		mes "�C����蒼����";
		mes "��������^ff0000�쓌^000000�ɂ���";
		mes "���̓X�ɍs���܂��傤���B";
		set EP18_1QUE,18;
		delquest 11705;
		setquest 11706;
		viewpoint 1, 107, 102, 18, 0x00FF00;
		close2;
		showevent 0, 1, "���l#ep18_���w��_0642_02";	// 2290: 107, 102
		cutin "ep18_maram_02.png", 255;
		end;
	}
	else if(EP18_1QUE == 18) {
		mes "[���l�X����]";
		mes "�u�D�F�̎q���B�v��";
		mes "����i�͖����I";
		mes "�����ɍs���I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�c�c�����������Ƃ�����܂��B";
		mes "�C����蒼����";
		mes "��������^ff0000�쓌^000000�ɂ���";
		mes "���̓X�ɍs���܂��傤���B";
		viewpoint 1, 107, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_02.png", 255;
		end;
	}
	//19 ������
	mes "[���l�X����]";
	mes "�ӂށc�c";
	mes "�O�����痈��ꂽ���ł����H";
	mes "��낵����΁A�����̏��i��";
	mes "���Ă����Ă��������B";
	close;
OnQuestInfo:
	if(EP18_1QUE == 17)
		showevent 0, 1, "���l#ep18_���w��_0641_01";
	else
		showevent 9999,0,"���l#ep18_���w��_0641_01";
	end;
}
rachel.gat,107,102,7	script	���l#ep18_���w��_0642_02	943,{/* 15872 */
	if(EP18_1QUE == 18) {
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "����ɂ��́A";
		mes "�T���i�b�g�̂�������B";
		mes "���΂���������C�ł����H";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�T���i�b�g]";
		mes "���c�c";
		mes "�����c�c";
		mes "���̗p���H";
		mes "�}�����B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "������ɏ�����Ă���i��";
		mes "���������ł����H";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[���l�T���i�b�g]";
		mes "���c�c���ށc�c";
		mes "����́c�c";
		mes "���܂Ȃ����A���݌ɂ�؂炵�Ă��āB";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�݌ɂ̂���i�����ł�";
		mes "�\���܂���B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[���l�T���i�b�g]";
		mes "���ށc�c���܂Ȃ����c�c";
		mes "�ǂ���݌ɕs���łˁc�c�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�c�c������Ƒ���Ȃ��Ă������̂ł����B";
		next;
		set EP18_1QUE,19;
		delquest 11706;
		setquest 11707;
		cloakoffnpc "�~���A��#ep18_���l2_052";
		cloakoffnpc "�}����#ep18_���l2_053";
		cutin "ep18_maram_01.png", 255;
		mes "[���l�T���i�b�g]";
		mes "�c�c�c�c�B";
		next;
		showevent 0, 1, "�~���A��#ep18_���l2_052";	// 2292: 117, 104
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�ł́A�����ʂ��";
		mes "�p���Ƃ������c�c�B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�T���i�b�g]";
		mes "���c�c";
		mes "��������łɗ\�񂪁c�c�B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�͂��c�c�킩��܂����B";
		mes "���ז����܂����c�c�B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[���l�T���i�b�g]";
		mes "���܂�ȁc�c�B";
		close2;
		viewpoint 1, 117, 104, 18, 0x00FF00;
		end;
	}
	else if(EP18_1QUE == 19 || EP18_1QUE == 20) {
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�ł́A�����ʂ��";
		mes "�p���Ƃ������c�c�B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�T���i�b�g]";
		mes "���c�c";
		mes "��������łɗ\�񂪁c�c�B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�͂��c�c�킩��܂����B";
		mes "���ז����܂����c�c�B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[���l�T���i�b�g]";
		mes "���܂�ȁc�c�B";
		close2;
		viewpoint 1, 117, 104, 18, 0x00FF00;
		end;
	}
	else if(EP18_1QUE == 21) {
		mes "[���l�T���i�b�g]";
		mes "�����܂���";
		mes "���݂ǂ���݌ɂ�؂炵�Ă܂��āc�c";
		mes "���̓X�ɍs����Ă͂������ł��H";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "��������X��^ff0000�쓌^000000�ɂ���";
		mes "�ʂ̓X�ɍs���܂��傤�B";
		viewpoint 1, 137, 85, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_02.png", 255;
		end;
	}
	mes "[���l�T���i�b�g]";
	mes "�����܂���";
	mes "���݂ǂ���݌ɂ�؂炵�Ă܂��āc�c";
	mes "���̓X�ɍs����Ă͂������ł��H";
	close;
OnQuestInfo:
	if(EP18_1QUE == 18)
		showevent 0, 1, "���l#ep18_���w��_0642_02";
	else
		showevent 9999,0,"���l#ep18_���w��_0642_02";
	end;
}
rachel.gat,117,104,0	script	#ep18w10_148	139,15,15,{/* 15873 */
OnTouch:
	if(EP18_1QUE == 19 || EP18_1QUE == 20) {
		cloakoffnpc "�~���A��#ep18_���l2_052";
		cloakoffnpc "�}����#ep18_���l2_053";
	}
	else {
		cloakonnpc "�~���A��#ep18_���l2_052";
		cloakonnpc "�}����#ep18_���l2_053";
	}
	end;
}
rachel.gat,117,104,5	script	�~���A��#ep18_���l2_052	10377,{/* 15874 (cloaking)*/
	if(EP18_1QUE == 19) {
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�͂������c�c";
		mes "�����I";
		mes "�Ȃ񂾂��Ă̂��I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�͂��͂��A�~���A���B";
		mes "���������āB";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�`���҂�����A����ł킩�����ł���H";
		mes "���ꂪ�{�N��u�D�F�̎q���B�v��";
		mes "�u����Ă���󋵂Ȃ񂾁I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�c�c�܂��A�����������Ƃł��B";
		mes "�X�����В����A�T���i�b�g���������";
		mes "���̑O�܂ł͕i�𔄂��Ă��ꂽ����";
		mes "���͂��������Ă͂���܂���B";
		next;
		mes "[�}����]";
		mes "���̃��w������芪����C��";
		mes "�ς���Ă��܂�����ł��B";
		mes "���̐l���������̂͊ȒP������";
		mes "����Ŗ�肪��������Ƃ�";
		mes "�v���Ă͂��܂���B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�~���A�����킩���Ă邩��";
		mes "��������Ė\��Ă��ł��B";
		mes "�c�c�ɂ�!!";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�}�����͂����ꌾ�����I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�C�^�^�^�c�c";
		mes "���`��A�ł����ۍ������Ȃ��B";
		mes "�������@���l���Ȃ��Ɓc�c�B";
		mes "���`�`��c�c�B";
		set EP18_1QUE,20;
		delquest 11707;
		setquest 11708;
		viewpoint 1, 119, 103, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	else if(EP18_1QUE == 20) {
		mes "[�~���A��]";
		mes "�}�������l�������Ă�B";
		mes "�����ǂ��Ă͂Ȃ����ȁH";
		cutin "ep18_miriam_03.png", 2;
		viewpoint 1, 119, 103, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	//21 ������
	end;
OnQuestInfo:
	if(EP18_1QUE == 19)
		showevent 0, 1, "�~���A��#ep18_���l2_052";
	else
		showevent 9999,0,"�~���A��#ep18_���l2_052";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,119,103,3	script	�}����#ep18_���l2_053	10376,{/* 15875 (cloaking)*/
	if(EP18_1QUE == 20) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���`��c�c���������ł��Ȃ��Ȃ��";
		mes "�������Ȃ��B";
		mes "�ʂ̊X�ɍs���Ďd����邩�H";
		mes "�����ǁA���w�����痣���̂�";
		mes "�}�Y�C�c�c�󋵂��󋵂����Ȃ��c�c�B";
		next;
		mes "[�}����]";
		mes "����Ȏ��ɁA�����̃L�����o���ł�";
		mes "�ʂ肩�����Ă���Ȃ����Ȃ��B";
		mes "�����c�c�����́c�c";
		mes "����!!";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���O���痈��ꂽ";
		mes strcharinfo(0)+"�l��";
		mes "�ꏏ�Ȃ炢���邩������܂���I";
		next;
		menu "���𔃂����Ƃ��Ă�̂�����",-;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���c�c";
		mes "�������Ƃ��c�c";
		mes "����́c�c�ł��˂��c�c�B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "���܂ŉB�����肾��H";
		mes "���𔃂��̂��킩��Ȃ��񂶂�";
		mes "�x�������̂����R����B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���͂͂́c�c";
		mes "����������ł��ˁB";
		mes "���A���́c�c";
		mes "���ɂ͓����ł��肢���܂��ˁH";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���͎��ƃ~���A����";
		mes "�X�̊O�ŕ�炷���Z�������������邽�߂�";
		mes "���������Ă����ł��B";
		mes "�����ɕK�v�ȕ����𒲒B����̂�";
		mes "���̈�ł��B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�ނ�̒u���ꂽ�����́A���Ȃ�ߎS�ł��B";
		mes "���_�t���C���l��򂶂Ȃ����Z���ɑ΂�";
		mes "�u�}�i�h�v���n�߂Ƃ���M���I�ȐM�҂�";
		mes "�ނ��O��I�ɔ��Q���܂����B";
		next;
		mes "[�}����]";
		mes "�ނ炪�����c�邽�߂ɑI�񂾓���";
		mes "�B��邱�Ƃł����B";
		mes "�����A�B���Ƃ������Ƃ�";
		mes "�����������ꍇ�ɁA�O����̉�����";
		mes "�����Ȃ��Ƃ������Ƃł��B";
		next;
		mes "[�}����]";
		mes "�����č��A�O����̉������Ȃ���";
		mes "����Ă����Ȃ��󋵂Ɋׂ��Ă��܂��B";
		mes "�ǂ����A�ނ�ׂ̈ɂ�";
		mes "���݂��Ă��炦�Ȃ��ł��傤���B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�{�N��������肢���܂��B";
		mes "�삦�ŋꂵ�ގq������";
		mes "�{�N�����Ɠ��������c�c";
		mes "������ɂ𖡂키���Ƃ�����";
		mes "�h��������ł��B";
		next;
		menu "������",-;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�{���ł����I";
		mes "���肪�Ƃ��������܂��I";
		mes "�������͕��̌����񂾂����I";
		next;
		mes "[�}����]";
		mes "����ł́A��������X��^ff0000�쓌^000000�ɂ���";
		mes "�ʂ̓X�ɍs���܂��傤�B";
		mes "�ȂɁA�S�z�͂���܂���B";
		mes "������肭���܂�����";
		mes strcharinfo(0)+"�l��";
		mes "�˂������Ă邾���ő��v�ł���I";
		set EP18_1QUE,21;
		delquest 11708;
		setquest 11709;
		viewpoint 1, 137, 85, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_02.png", 255;
		cloakonnpc "�~���A��#ep18_���l2_052";
		cloakonnpc "�}����#ep18_���l2_053";
		end;
	}
	//21 ������
	end;
OnQuestInfo:
	if(EP18_1QUE == 20)
		showevent 0, 1, "�}����#ep18_���l2_053";
	else
		showevent 9999,0,"�}����#ep18_���l2_053";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,137,85,0	script	#ep18w10_149	139,14,14,{/* 15876 */
OnTouch:
	if(EP18_1QUE == 22)
		cloakoffnpc "�~���A��#ep18_���l3_055";
	else if(EP18_1QUE == 23) {
		cloakoffnpc "�~���A��#ep18_���l3_055";
		cloakoffnpc "�G��o�[�K�[#ep18_���w���\";
	}
	else
		cloakonnpc "�~���A��#ep18_���l3_055";
	end;
}
rachel.gat,137,85,5	script	���l#ep18_���w��_0643_054	928,{/* 15877 */
	if(EP18_1QUE == 21) {
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "����ɂ��́`";
		mes "�����V�A�В��`��";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�����V�A]";
		mes "�Ȃ񂾂��c�c�}�������B";
		mes "���O�ɂ͔���Ȃ��ƌ������͂����B";
		mes "�A��B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���������A���ł͂Ȃ�";
		mes "������̏��l�l���i���w���������ƁB";
		mes "���͂����̗ǂ��i����ɓ��邨�X��";
		mes "�ē����Ă��邾���ł���B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����ق�I";
		mes "������̓}�����ŃL�����o����";
		mes "�����Ă�����";
		mes "�J�E"+strcharinfo(0)+"�E���l^000000�I";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�܂����A�����V�A�В��قǂ̂�����";
		mes "�J�E"+strcharinfo(0)+"�E���l^000000��";
		mes "�������Ȃ��Ȃ�Ă���";
		mes "����܂����˂��H";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�����V�A]";
		mes "�J�E"+strcharinfo(0)+"�E���l!?";
		mes "�c�c�����A���A���������Ƃ��邼�B";
		mes "���̗L���ȁc�c�}�����́c�c�B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�����I";
		mes "�����炪�w���������i�̖ژ^�ł��B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�����V�A]";
		mes "��������!?";
		mes "����Ȗc��ȗʂ̕i��";
		mes "�������グ��������̂ł���!!";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���R�ł���I";
		mes "�J�E"+strcharinfo(0)+"�E���l��";
		mes "�L�����o���ŉ^�Ԃ̂ł�����ˁB";
		mes "���A�x�����͂���ŁB";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�����V�A]";
		mes "���؎�ł̈ꊇ��������!?";
		mes "��������";
		mes "�J�E"+strcharinfo(0)+"�E���l!!";
		mes "���A�����Ɏ�z�������܂����I";
		next;
		mes "[���l�����V�A]";
		mes "���o���Ȃ���̂�����";
		mes "�����Ă��������܂����H";
		mes "�����Ă����������";
		mes "�M���l�̃L�����o���܂�";
		mes "�i�����^�т������܂���I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���c�c���₟�����܂ł��Ȃ��Ă����c�c�B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�����V�A]";
		mes "����H";
		mes "�������������A�}�����H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�܂��o�����鎞�Ԃ͌��߂ĂȂ����c�c";
		mes "���̂��A�L�����o�����܂�";
		mes "�������ĂȂ����c�c";
		mes "���������c�c�B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[���l�����V�A]";
		mes "�������グ���肪�Ƃ��������܂��B";
		mes "�J�E"+strcharinfo(0)+"�E���l�I";
		mes "����ł͂����Ԃ������m�点���������I";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���c�c���͂͂́c�c�B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "������ƁA�ʂ̏ꏊ�Řb�����悤�B";
		mes "��������^ff0000�쐼^000000�ɂ��鉮�䂪�������ȁB";
		set EP18_1QUE,22;
		delquest 11709;
		setquest 11710;
		viewpoint 1, 105, 72, 18, 0x00FF00;
		cloakoffnpc "�~���A��#ep18_���l3_055";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
	else if(EP18_1QUE == 22) {
		mes "[���l�����V�A]";
		mes "�������グ���肪�Ƃ��������܂��B";
		mes "�J�E"+strcharinfo(0)+"�E���l�I";
		mes "����ł͂����Ԃ������m�点���������I";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���c�c���͂͂́c�c�B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "������ƁA�ʂ̏ꏊ�Řb�����悤�B";
		mes "��������^ff0000�쐼^000000�ɂ��鉮�䂪�������ȁB";
		viewpoint 1, 105, 72, 18, 0x00FF00;
		cloakoffnpc "�~���A��#ep18_���l3_055";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
	else if(EP18_1QUE == 26) {
		mes "[���l�����V�A]";
		mes "���I";
		mes "�J�E"+strcharinfo(0)+"�E���l�I";
		mes "�������Ȃ����܂������H";
		mes "�����̕i�͗p�ӂł��Ă���܂���I";
		next;
		menu "�o���̏������ł���",-;
		mes "[���l�����V�A]";
		mes "���l�ł������܂����I";
		mes "����ł́A";
		mes "�u^0000FF�����̓���^000000�v�ŕi���󂯎���Ă��������B";
		mes "�������グ���肪�Ƃ��������܂����I";
		mes "�܂����ۛ��Ɂ`�`�`�I";
		set EP18_1QUE,27;
		delquest 11714;
		setquest 11715;
		viewpoint 1, 41, 132, 18, 0x00FF00;
		close;
	}
	else if(EP18_1QUE == 27) {
		mes "[���l�����V�A]";
		mes "����ł́A";
		mes "�u^0000FF�����̓���^000000�v�ŕi���󂯎���Ă��������B";
		mes "�������グ���肪�Ƃ��������܂����I";
		mes "�܂����ۛ��Ɂ`�`�`�I";
		viewpoint 1, 41, 132, 18, 0x00FF00;
		close;
	}
	mes "[���l�����V�A]";
	mes "�������グ���肪�Ƃ��������܂����I";
	mes "�܂����ۛ��Ɂ`�`�`�I";
	close;
OnQuestInfo:
	if(EP18_1QUE == 21 || EP18_1QUE == 26)
		showevent 0, 1, "���l#ep18_���w��_0643_054";
	else
		showevent 9999,0,"���l#ep18_���w��_0643_054";
	end;
}
rachel.gat,105,72,5	script	�~���A��#ep18_���l3_055	10377,{/* 15878 */
	if(EP18_1QUE == 22) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�}�����̍��\�t�X�L����";
		mes "�債�����̂���ˁB";
		mes "������������܂�";
		mes "���l���炢�x���Ă����́H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�l�����������Ȃ��c�c�����";
		mes strcharinfo(0)+"�l��";
		mes "�����ɂ��X�S�C�l���ăI�[����";
		mes "�����Ă������琬�������񂾂�B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�ł��A�܂��i����ɓ������킯����Ȃ��B";
		mes "�L�����o���̌��͂ǂ��������H";
		mes "�ו���͂��Ă��炤����";
		mes "�L�����o�������Ȃ����";
		mes "���i��n���Ă��炦�Ȃ���������Ȃ���B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�������Ȃ��c�c";
		mes "�킴�킴���i���^��ł������Ă��Ƃ�";
		mes "���ځA�L�����o���̗l�q������";
		mes "�m�F���������Ă��Ƃ��낤����ˁB";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�悵�I";
		mes "�U�̃L�����o�����ł��������悤�I";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "����Ȃ��Ƃł���̂��H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���@���Ȃ��킯����Ȃ���B";
		mes "�܂��́A�L�����o���̑����Ƃ���";
		mes "�X�̊O���痈���`���҂������ق��B";
		mes "�X�̐l�������g������E�\������";
		mes "�o�����Ⴄ����ˁB";
		next;
		mes "[�}����]";
		mes "�L�����o�������ɕϑ�����ׂɂ�";
		mes "������ۂ��ߑ����K�v���ȁB";
		mes "�ߑ��̓~���A�����T���Ă��Ă���Ȃ��H";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�ȒP�Ɍ����Ă����ȁc�c";
		mes "�܂��A�킩�����B";
		mes "�ߑ��̓{�N�̕��ŁA�Ȃ�Ƃ������B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes strcharinfo(0)+"�l��";
		mes "�L�����o�������ɋU�����Ă��ꂻ����";
		mes "�m�荇���̕��������";
		mes "�����������������܂��񂩁H";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���ƁA���̑O�ɕ������炦���܂��傤�B";
		mes "�����̂��X�́u�G��o�[�K�[�v��";
		mes "�Ƃ��Ă�����������ł��B";
		mes "���w���̂a���O�������Ă�ł��B";
		next;
		mes "[�}����]";
		mes "���͂��łɒ������Ă���܂��̂�";
		mes "���Ђ��ܖ����������B";
		mes "�H�׏I�������A�ŏ��ɂ�������ꏊ��";
		mes "�W�����邱�Ƃɂ��܂��傤�B";
		set EP18_1QUE,23;
		delquest 11710;
		setquest 11711;
		viewpoint 1, 108, 73, 18, 0x00FF00;
		close2;
		cloakonnpc "�~���A��#ep18_���l3_055";
		cloakoffnpc "�G��o�[�K�[#ep18_���w";
		cutin "ep172_beta.bmp", 255;
		end;
	}
	else if(EP18_1QUE == 23) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes strcharinfo(0)+"�l��";
		mes "�L�����o�������ɋU�����Ă��ꂻ����";
		mes "�m�荇���̕��������";
		mes "�����������������܂��񂩁H";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���ƁA���̑O�ɕ������炦���܂��傤�B";
		mes "�����̂��X�́u�G��o�[�K�[�v��";
		mes "�Ƃ��Ă�����������ł��B";
		mes "���w���̂a���O�������Ă�ł��B";
		next;
		mes "[�}����]";
		mes "���͂��łɒ������Ă���܂��̂�";
		mes "���Ђ��ܖ����������B";
		mes "�H�׏I�������A�ŏ��ɂ�������ꏊ��";
		mes "�W�����邱�Ƃɂ��܂��傤�B";
		viewpoint 1, 108, 73, 18, 0x00FF00;
		close2;
		cloakonnpc "�~���A��#ep18_���l3_055";
		cloakoffnpc "�G��o�[�K�[#ep18_���w���\";
		cutin "ep172_beta.bmp", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 22)
		showevent 0, 1, "�~���A��#ep18_���l3_055";
	else
		showevent 9999,0,"�~���A��#ep18_���l3_055";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,108,74,0	script	#ep18w09_145	139,14,14,{/* 15879 */
	if(EP18_1QUE == 24) {
		cloakoffnpc "�G��o�[�K�[#ep18_���w���\";
	}
	end;
}
rachel.gat,105,73,5	script	�^�}����#ep18_���w���\	10381,{/* 15880 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,108,74,3	script	�G��o�[�K�[#ep18_���w���\	10428,{/* 15881 (cloaking)*/
	if(EP18_1QUE == 23) {
		cloakonnpc "�~���A��#ep18_���l3_055";
		mes "^0000FF�]����̐Ȃɍ������낵�}������";
		mes "�@���������u�G��o�[�K�[�v��j����B";
		mes "�@�X�p�C�X���������ٍ�����ӂ��";
		mes "�@�����Ƃ肵�����܂�̂悤�Ȗ����]^000000";
		next;
		cloakoffnpc "�^�}����#ep18_���w���\";
		cutin "ep18_tamarin_02.png", 1;
		mes "[�H�H�H]";
		mes strcharinfo(0)+"�l�I";
		mes "����ȂƂ���ŉ��Ȃ��";
		mes "����ł��ˁI";
		next;
		menu "�ǂ���l�ł����H",-;
		cutin "ep18_tamarin_01.png", 1;
		mes "[�^�}����]";
		mes "���A����Ȋi�D���Ă�����";
		mes "�N�����킩��Ȃ��ł���ˁB";
		mes "���ł��A�u�^�}�����v�ł��B";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF�]�^�}�����ׂ͗̐Ȃɍ����";
		mes "�@�G��o�[�K�[�𒍕������]^000000";
		next;
		cutin "ep18_tamarin_02.png", 1;
		mes "[�^�}����]";
		mes "�����̔G��o�[�K�[�A���������ł���ˁI";
		mes "�ȑO�A���w���ɗ������ɐH�ׂ܂�����";
		mes "���̔��������Ɋ������Ă��܂��܂����B";
		mes "�ȗ��A���w���ɗ���x�ɐH�ׂĂ܂��B";
		next;
		menu "���w���ɗ������R�𕷂�",-;
		cutin "ep18_tamarin_01.png", 1;
		mes "[�^�}����]";
		mes "�����Ɓc�c�ڂ����͘b���Ȃ��̂ł���";
		mes "�j���G����_���l����_�a��";
		mes "�x��ɂ�����l�����~�����ƌ����";
		mes "�e���[���A���ƃA���v�I�J�[�g�̓�l��";
		mes "�A��ė�����ł��B";
		next;
		mes "[�^�}����]";
		mes "�}�[�N�ƃ}�M�X�e�B�����ꏏ�ɗ��܂�����";
		mes "�������͌x��l���ł͂Ȃ��̂�";
		mes "�������ĊX���U�����ł��B";
		mes "�v����ɁA�ɂ��Ă���킯�ł��ˁB";
		next;
		menu "�L�����o�������ɕϑ����ė~�����Ɠ`����",-;
		cutin "ep18_tamarin_02.png", 1;
		mes "[�^�}����]";
		mes "�͂͂͂́I";
		mes "����͖ʔ������ł��ˁB";
		mes "���Ђ���`�������Ă��������I";
		mes "�}�[�N�ƃ}�M�X�e�B���ɂ�";
		mes "��`���Ă��炢�܂��傤���B";
		next;
		cutin "ep18_tamarin_01.png", 1;
		mes "[�^�}����]";
		mes "��l�͂�������k�ɂ���";
		mes "^ff0000�L��^000000�̕t�߂ɂ���͂��ł��B";
		mes "�ł́A�G��o�[�K�[��H�׏I�������";
		mes "�T���ɍs���܂��傤�B";
		set EP18_1QUE,24;
		delquest 11711;
		setquest 11712;
		viewpoint 1, 122, 120, 18, 0x00FF00;
		close2;
		showevent 0, 1, "�}�[�N�C�V��#ep18_���w";	// 2300: 122, 120
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	else if(EP18_1QUE == 24) {
		cloakoffnpc "�^�}����#ep18_���w���\";
		cutin "ep18_tamarin_02.png", 2;
		mes "[�^�}����]";
		mes "���Ђ���`�������Ă��������I";
		mes "�}�[�N�ƃ}�M�X�e�B���ɂ�";
		mes "��`���Ă��炢�܂��傤���B";
		next;
		mes "[�^�}����]";
		mes "��l��^ff0000�L��^000000�̕t�߂ɂ���͂��ł��B";
		mes "�ł́A�G��o�[�K�[��H�׏I�������";
		mes "�T���ɍs���܂��傤�B";
		viewpoint 1, 122, 120, 18, 0x00FF00;
		close2;
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 23)
		showevent 0, 1, "�G��o�[�K�[#ep18_���w���\";
	else
		showevent 9999,0,"�G��o�[�K�[#ep18_���w���\";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,122,120,5	script	�}�[�N�C�V��#ep18_���w���\	10383,{/* 15882 */
	if(EP18_1QUE == 24) {
		cloakonnpc "�^�}����#ep18_���w���\";
		cloakonnpc "�G��o�[�K�[#ep18_���w���\";
		cutin "ep18_mark_02.png", 0;
		mes "[�}�[�N�C�V��]";
		mes "����ɂ���";
		mes strcharinfo(0)+"�l�B";
		mes "�d���ŗ���ꂽ�̂ł����H";
		mes "����Ƃ��ό��ł����H";
		next;
		cutin "ep18_mark_01.png", 0;
		mes "[�}�[�N�C�V��]";
		mes "����H�@�^�}�������ꏏ�ł������B";
		next;
		cutin "ep18_tamarin_02.png", 1;
		mes "[�^�}����]";
		mes "�}�[�N�ƃ}�M�X�e�B���̗p����";
		mes "�ς�ł��܂����H";
		mes strcharinfo(0)+"�l����";
		mes "���d���̈˗������Ă����ł��B";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF�]�}�[�N�C�V���ƃ}�M�X�e�B����";
		mes "�@�����������A�L�����o���̑�����";
		mes "�@�ϑ����ė~�����Ɠ`�����]^000000";
		next;
		cutin "4job_maggi_04.PNG", 2;
		mes "[�}�M�X�e�B��]";
		mes "�A���v�I�J�[�g���񂩂痊�܂�Ă���";
		mes "�{�͎�ɓ���܂����c�c";
		mes "�e���[���痊�܂�Ă������َq��";
		mes "������܂���ł������ǁc�c�B";
		next;
		cutin "ep18_mark_02.png", 0;
		mes "[�}�[�N�C�V��]";
		mes "���̃o�J�̂��Ƃ͕����Ă������B";
		mes "������͂��傤�ǎ肪�󂢂Ă܂��̂�";
		mes "����`�������Ă��炢�܂���B";
		mes "�l��͑��������ǂ������ł����ˁB";
		next;
		cutin "ep18_tamarin_01.png", 1;
		mes "[�^�}����]";
		mes "�ł́A"+strcharinfo(0)+"�l�B";
		mes "�˗���̂Ƃ���Ɉē����Ă��炦�܂����H";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF�]�}�����́A�ŏ��ɉ�����ꏊ��";
		mes "�@�W�����悤�ƌ����Ă����B";
		mes "�@�ŏ��ɉ�����ꏊ�ɍs���Ă݂悤�]^000000";
		set EP18_1QUE,25;
		delquest 11712;
		setquest 11713;
		viewpoint 1, 70, 147, 18, 0x00FF00;
		close2;
		showevent 0, 1, "�}����#ep18_���w��_047";	// 2285: 70, 147
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	else if(EP18_1QUE == 25) {
		cutin "ep18_mark_02.png", 0;
		mes "[�}�[�N�C�V��]";
		mes "������͂��傤�ǎ肪�󂢂Ă܂��̂�";
		mes "����`�������Ă��炢�܂���B";
		mes "�l��͑��������ǂ������ł����ˁB";
		next;
		cutin "ep18_tamarin_01.png", 1;
		mes "[�^�}����]";
		mes "�ł́A"+strcharinfo(0)+"�l�B";
		mes "�˗���̂Ƃ���Ɉē����Ă��炦�܂����H";
		next;
		cutin "ep18_tamarin_01.png", 255;
		mes "^0000FF�]�}�����́A�ŏ��ɉ�����ꏊ��";
		mes "�@�W�����悤�ƌ����Ă����B";
		mes "�@�ŏ��ɉ�����ꏊ�ɍs���Ă݂悤�]^000000";
		viewpoint 1, 70, 147, 18, 0x00FF00;
		close2;
		cutin "ep18_tamarin_02.png", 255;
		end;
	}
	mes "[�}�[�N�C�V��]";
	mes "����ɂ���";
	mes strcharinfo(0)+"�l�B";
	mes "�d���ŗ���ꂽ�̂ł����H";
	mes "����Ƃ��ό��ł����H";
	cutin "ep18_mark_01.png", 2;
	close2;
	cutin "ep18_mark_01.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 24)
		showevent 0, 1, "�}�[�N�C�V��#ep18_���w���\";
	else
		showevent 9999,0,"�}�[�N�C�V��#ep18_���w���\";
	end;
}
rachel.gat,124,120,4	script	�}�M�X�e�B��#ep18_���w���\	10365,{/* 15883 */
	mes "[�}�M�X�e�B��]";
	mes "���c�c����ɂ��́c�c";
	mes "���w���͏����ł��ˁc�c";
	mes "�����͂��܂߂ɁA����Ă��������ˁc�c�B";
	cutin "4job_maggi_01.PNG", 2;
	close2;
	cutin "4job_maggi_01.PNG", 255;
	end;
}
rachel.gat,41,132,0	script	#ep18w07_143	139,16,14,{/* 15884 */
	if(EP18_1QUE == 27) {
		cloakoffnpc "���l#ep18_���w��_0643j_";
		cloakoffnpc "��#ep18_���B�i1_060";
		cloakoffnpc "��#ep18_���B�i2_061";
		cloakoffnpc "��#ep18_���B�i3_062";
		cloakoffnpc "��#ep18_���B�i4_063";
	}
	else if(EP18_1QUE == 28) {
		cloakoffnpc "���l#ep18_���w��_0643j_";
		cloakoffnpc "�}����#ep18_���l3j_142";
		cloakoffnpc "��#ep18_���B�i1_060";
		cloakoffnpc "��#ep18_���B�i2_061";
		cloakoffnpc "��#ep18_���B�i3_062";
		cloakoffnpc "��#ep18_���B�i4_063";
	}
	end;
}
rachel.gat,43,132,5	script	���l#ep18_���w��_0643j_	928,{/* 15885 (cloaking)*/
	mes "[���l�����V�A]";
	mes "�����炪�������̕i�ł��I";
	mes "���m�F���������I";
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,40,135,4	script	�}����#ep18_���l3j_142	10376,{/* 15886 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�ł͂ł́`";
	mes "�J�E"+strcharinfo(0)+"�E���l�B";
	mes "^ff0000�����̖�^000000���o���Ƃ���ŉ��߂�";
	mes "�o�H�̊m�F���������܂��傤�I";
	close2;
	viewpoint 1, 25, 125, 18, 0x00FF00;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,42,133,3	script	��#ep18_���B�i1_060	10250,{/* 15887 */
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,40,133,3	script	��#ep18_���B�i2_061	10250,{/* 15888 */
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,39,132,3	script	��#ep18_���B�i3_062	10250,{/* 15889 */
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,41,132,3	script	��#ep18_���B�i4_063	10250,{/* 15890 */
	if(EP18_1QUE == 27) {
		cloakoffnpc "�}����#ep18_���l3j_142";
		mes "[���l�����V�A]";
		mes "�J�E"+strcharinfo(0)+"�E���l�I";
		mes "�������̕i�ɊԈႢ�Ȃ���";
		mes "�ǂ����A���m�F���������I";
		next;
		menu "���v�����ł�",-;
		mes "[���l�����V�A]";
		mes "�ǂ����A���肪�Ƃ��������܂��I";
		mes "�܂��̂����p�����҂����Ă���܂��I";
		next;
		cloakonnpc "���l#ep18_���w��_0643j_";
		mes "[�}����]";
		mes "�ł͂ł́`";
		mes "�J�E"+strcharinfo(0)+"�E���l�B";
		mes "^ff0000�����̖�^000000���o���Ƃ���ŉ��߂�";
		mes "�o�H�̊m�F���������܂��傤�I";
		cutin "ep18_maram_01.png", 2;
		set EP18_1QUE,28;
		delquest 11715;
		setquest 11716;
		viewpoint 1, 25, 125, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		showevent 0, 1, "��#ep18_���B�i4_063";	// 2308: 41, 132
		end;
	}
	else if(EP18_1QUE == 28) {
		cloakoffnpc "�}����#ep18_���l3j_142";
		cloakonnpc "���l#ep18_���w��_0643j_";
		mes "[�}����]";
		mes "�ł͂ł́`";
		mes "�J�E"+strcharinfo(0)+"�E���l�B";
		mes "^ff0000�����̖�^000000���o���Ƃ���ŉ��߂�";
		mes "�o�H�̊m�F���������܂��傤�I";
		cutin "ep18_maram_01.png", 2;
		viewpoint 1, 25, 125, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 27 || EP18_1QUE == 28)
		showevent 0, 1, "��#ep18_���B�i4_063";
	else
		showevent 9999,0,"��#ep18_���B�i4_063";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,354,235,3	script	���l#ep18_���w��_064	10380,{/* 15891 */
	if(EP18_1QUE == 28) {
		cloakoffnpc "���l#ep18_���w��_065";
		cloakoffnpc "���l#ep18_���w��_066";
		cloakoffnpc "���l#ep18_���w��_067";
		cloakoffnpc "���l#ep18_���w��_068";
		cutin "ep18_merchant.png", 2;
		mes "[�ϑ������}����]";
		mes "�]�݂̕i����肭��ɓ���܂����B";
		mes strcharinfo(0)+"�l��";
		mes "�������ł��B";
		next;
		mes "[�ϑ������}����]";
		mes "���������Ő\���󂠂�܂���";
		mes "�ו����^�Ԃ̂���`���Ă��炦�܂��񂩁B";
		mes "������c�c���Z��������";
		mes "�B��Z�ޑ��ɉ^�т܂��B";
		next;
		cutin "ep18_merchant.png", 0;
		mes "[�ϑ������~���A��]";
		mes "�݂�ȕϑ������܂܉^�Ԃ񂾂�ˁH";
		mes "���̊i�D�A�����Â炢�Ȃ��B";
		next;
		cutin "ep18_merchant.png", 2;
		mes "[�ϑ������}����]";
		mes "��������āA�r���ŒE������_������B";
		mes "���߂Ė��H�̒��܂ł�";
		mes "�䖝���ė~�����ȁB";
		next;
		cutin "ep18_merchant.png", 0;
		mes "[�ϑ������~���A��]";
		mes "�킩���Ă��c�c";
		mes "������A���̎q�����ׂ̈�����ˁB";
		next;
		cutin "ep18_merchant.png", 2;
		mes "[�ϑ������}����]";
		mes "�ڂ����ꏊ�́A�����ł͌����܂��񂪁c�c";
		mes "�܂���^ff0000��^000000�ɂ���u^0000FF�I�Y���J^000000�v��";
		mes "�ړ����܂��傤�B";
		viewpoint 1, 28, 290, 18, 0x00FF00;
		set EP18_1QUE,29;
		delquest 11716;
		setquest 11717;
		close2;
		cloakonnpc "���l#ep18_���w��_065";
		cloakonnpc "���l#ep18_���w��_066";
		cloakonnpc "���l#ep18_���w��_067";
		cloakonnpc "���l#ep18_���w��_068";
		cutin "ep18_merchant.png", 255;
		end;
	}
	else if(EP18_1QUE == 29) {
		cloakoffnpc "���l#ep18_���w��_065";
		cloakoffnpc "���l#ep18_���w��_066";
		cloakoffnpc "���l#ep18_���w��_067";
		cloakoffnpc "���l#ep18_���w��_068";
		cutin "ep18_merchant.png", 2;
		mes "[�ϑ������}����]";
		mes "���������Ő\���󂠂�܂���";
		mes "�ו����^�Ԃ̂���`���Ă��炦�܂��񂩁B";
		mes "������c�c���Z��������";
		mes "�B��Z�ޑ��ɉ^�т܂��B";
		next;
		mes "[�ϑ������}����]";
		mes "�ڂ����ꏊ�́A�����ł͌����܂��񂪁c�c";
		mes "�܂���^ff0000��^000000�ɂ���u^0000FF�I�Y���J^000000�v��";
		mes "�ړ����܂��傤�B";
		close2;
		viewpoint 1, 28, 290, 18, 0x00FF00;
		cloakonnpc "���l#ep18_���w��_065";
		cloakonnpc "���l#ep18_���w��_066";
		cloakonnpc "���l#ep18_���w��_067";
		cloakonnpc "���l#ep18_���w��_068";
		cutin "ep18_merchant.png", 255;
		end;
	}
	mes "[���l]";
	mes "�����͕��������ȁc�c�B";
	close;
OnQuestInfo:
	if(EP18_1QUE == 28 || EP18_1QUE == 29)
		showevent 0, 1, "���l#ep18_���w��_064";
	else
		showevent 9999,0,"���l#ep18_���w��_064";
	end;
}
ra_fild11.gat,352,233,3	script	���l#ep18_���w��_065	10380,{/* 15892 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,356,233,3	script	���l#ep18_���w��_066	10380,{/* 15893 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,352,237,3	script	���l#ep18_���w��_067	10380,{/* 15894 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,356,237,3	script	���l#ep18_���w��_068	10380,{/* 15895 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_fild10.gat,379,283,0	script	#ep180_ra_fild10_1	139,2,2,{/* 15896 */
	if(EP18_1QUE == 29)
		viewpoint 1, 179, 176, 18, 0x00FF00;
	end;
}
ra_fild10.gat,179,176,5	script	���l#ep18_���J_065	10380,{/* 15897 */
	if(EP18_1QUE == 29) {
		cutin "ep18_merchant.png", 2;
		mes "[�ϑ������~���A��]";
		mes "�ӂ��c�c";
		mes "�����܂ł͏����ł��ˁB";
		mes "��������u^0000FF�I�Y�̖��H^000000�v�ɓ���܂��B";
		mes "���X����������܂��̂ŁA";
		mes "���������琺�������Ă��������܂����H";
		set EP18_1QUE,30;
		delquest 11717;
		setquest 11719;
		close2;
		cutin "ep18_merchant.png", 255;
		end;
	}
	else if(EP18_1QUE == 30) {
		cutin "ep18_merchant.png", 2;
		mes "[�ϑ������~���A��]";
		mes "��������u^0000FF�I�Y�̖��H^000000�v�ɓ���܂��B";
		mes "��̂̏����͏I���܂����B";
		mes "�����烍�[�v�������̂ŁA";
		mes "�������X�����Ԃ����������܂��B";
		if(mdopenstate("maze of oz") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			set '@menu$,"�u�I�Y�̖��H�v����";
		}
		else {
			next;
			cutin "ep18_merchant.png", 2;
			mes "[�ϑ������~���A��]";
			mes "^ff0000�p�[�e�B�[���[�_�[^000000�̕���";
			mes "���������肢���Ă��������B";
			set '@menu$,"�u�I�Y�̖��H�v(maze of oz)�쐬";
		}
		next;
		if(select("��߂�",'@menu$) == 1) {
			cutin "ep18_merchant.png", 2;
			mes "[�ϑ������~���A��]";
			mes "�������o������";
			mes "���ɍ~��܂�����";
			mes "���ɘb�������Ă��������B";
			close2;
			cutin "ep18_merchant.png", 255;
			end;
		}
		if(mdopenstate("maze of oz")) {
			cutin "ep18_merchant.png", 2;
			mes "[�ϑ������~���A��]";
			mes "�ł́u^0000FF�I�Y�̖��H^000000�v��";
			mes "�o���������܂��B";
			close2;
			cutin "ep18_merchant.png", 255;
			switch(mdenter("maze of oz")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[maze of oz] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("MazeOfOzControl1")+ "::OnStart";
				//warp "1@oz.gat", 284, 167;
				end;
			case 1:	// �p�[�e�B�[������
				mes "[�ϑ������~���A��]";
				mes "�O�̂��߂�^ff0000�p�[�e�B�[���쐬^000000����";
				mes "�����������ǂ������ł��B";
				next;
				cutin "ep18_merchant.png", 255;
				mes "[�C���t�H���[�V����]";
				mes "�p�[�e�B�[�ɉ������Ă��Ȃ�����";
				mes "����ł��܂���B";
				close;
			case 2:	// �_���W�������쐬
				mes "[�ϑ������~���A��]";
				mes "�����҂��Ă���A��蒼���Ă݂܂��傤�B";
				next;
				cutin "ep18_merchant.png", 255;
				mes "[�C���t�H���[�V����]";
				mes "�Ώۂ̃������A���_���W������";
				mes "�쐬����Ă��Ȃ�����";
				mes "����ł��܂���B";
				close;
			default:	// ���̑��G���[
				close;
			}
		}
		else {
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				cutin "ep18_merchant.png", 255;
				mes "[�C���t�H���[�V����]";
				mes "�p�[�e�B�[���[�_�[�̂�";
				mes "�������A���_���W������";
				mes "�쐬���邱�Ƃ��ł��܂��B";
				close;
			}
			cutin "ep18_merchant.png", 255;
			mdcreate "maze of oz";
			mes "���p�[�e�B�[��";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "���p�[�e�B�[���[�_�[";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "�@";
			mes "^006400maze of oz^000000�̍쐬�\�����󂯕t���܂��B";
			next;
			cutin "ep18_merchant.png", 2;
			mes "[�ϑ������~���A��]";
			mes "�����҂��Ă���";
			mes "�����������ǂ������ł��B";
			close2;
			cutin "ep18_merchant.png", 255;
			end;
		}
	}
	else if(EP18_1QUE >= 31) {
		mes "[�C���t�H���[�V����]";
		mes "���Ɂu�I�Y�̖��H�v��";
		mes "�N���A���Ă���L�����N�^�[�́A";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u�I�Y�̖��H�v��";
		mes "����ł��܂��B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u�I�Y�̖��H�v��";
		mes "���ꂵ�܂����H";
		next;
		if(select("��߂�","�u�I�Y�̖��H�v����") == 1) {
			mes "�]��߂��]";
			close;
		}
		mes "[�C���t�H���[�V����]";
		mes "�u�I�Y�̖��H�v�֓��ꂵ�܂��B";
		close2;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[�C���t�H���[�V����]";
			mes "���Ɂu�I�Y�̖��H�v��";
			mes "�N���A���Ă���L�����N�^�[�́A";
			mes "�p�[�e�B���[�_�[�Ƃ���";
			mes "����ł��܂���B";
			close;
		}
		mes "[�C���t�H���[�V����]";
		mes "�Ώۂ̃������A���_���W������";
		mes "�쐬����Ă��Ȃ�����";
		mes "����ł��܂���B";
		close;
	}
	cutin "ep18_merchant.png", 2;
	mes "[���l]";
	mes "�l�e���������Ǝv�����񂾂�";
	mes "�N�����Ȃ��ȁB";
	mes "�܂��A����ȂƂ���ɐl������Ƃ�";
	mes "�v���Ȃ����B";
	close2;
	cutin "ep18_merchant.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 29 || EP18_1QUE == 30)
		showevent 0, 1, "���l#ep18_���J_065";
	else
		showevent 9999,0,"���l#ep18_���J_065";
	end;
}

gw_fild01.gat,276,339,3	script	�}����#ep18_�I�Y�̏o��_066	10376,{/* 15898 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "��������^ff0000��^000000�ɐi�߂�";
	mes "���Z���������B��Z�ޑ���";
	mes "�����ɓ������܂��B";
	viewpoint 1, 35, 102, 18, 0x00FF00;
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,273,339,3	script	#ep18_�I�Y�̏o���O_067	10428,7,7,{/* 15899 */
	if(EP18_1QUE >= 31 && EP18_1QUE <= 32) {	//������
		cloakoffnpc "�}����#ep18_�I�Y�̏o��_066";
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "��������^ff0000��^000000�ɐi�߂�";
		mes "���Z���������B��Z�ޑ���";
		mes "�����ɓ������܂��B";
		mes "�����A�s���܂��傤�B";
		viewpoint 1, 35, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�}����#ep18_�I�Y�̏o��_066";
	}
	end;
OnTouch:
	if(EP18_1QUE == 31) {
		cloakoffnpc "�}����#ep18_�I�Y�̏o��_066";
		cutin "ep18_maram_01.png", 2;
		set EP18_1QUE,32;
		delquest 11720;
		setquest 11721;
		mes "[�}����]";
		mes "�ӂ��c�c";
		mes "�����ɔ������܂����ˁB";
		mes "�����܂ŗ���΁A���������ł��B";
		next;
		//@showevent 0, 1;	// 6822: 35, 102
		mes "[�}����]";
		mes "��������^ff0000��^000000�ɐi�߂�";
		mes "���Z���������B��Z�ޑ���";
		mes "�����ɓ������܂��B";
		mes "�����A�s���܂��傤�B";
		viewpoint 1, 35, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�}����#ep18_�I�Y�̏o��_066";
		end;
	}
	else if(EP18_1QUE == 32) {
		cloakoffnpc "�}����#ep18_�I�Y�̏o��_066";
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "��������^ff0000��^000000�ɐi�߂�";
		mes "���Z���������B��Z�ޑ���";
		mes "�����ɓ������܂��B";
		mes "�����A�s���܂��傤�B";
		viewpoint 1, 35, 102, 18, 0x00FF00;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�}����#ep18_�I�Y�̏o��_066";
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 31)
		showevent 0, 1, "#ep18_�I�Y�̏o���O_067";
	else
		showevent 9999,0,"#ep18_�I�Y�̏o���O_067";
	end;
}
gw_fild01.gat,35,102,5	script	�}����#ep18_gw_068	10376,{/* 15900 */
	if(EP18_1QUE == 32) {
		mes "[�L�����p�[]";
		mes "�ӂ��킟�����`�`�B";
		mes "���܂ɂ́A����ȃL�����s���O��";
		mes "�����Ȃ��ˁ`�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���`�`���I";
		mes "�c�c���ꂥ�H";
		mes "�����Ɣ������Ⴄ�ȁc�c�B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "������A���I";
		mes "�ق�A�M���̒m�荇���́I";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�L�����p�[]";
		mes "��`�`�`�V��̍��\�t���ȁH";
		next;
		cloakoffnpc "�~���A��#ep18_gw_069";
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "���\�t���ۂ��͂���ˁB";
		mes "���ǁA��k�ɕt�������Ă�ق�";
		mes "�{�N�����Ɏ��ԓI�ȗ]�T�͖����͂�����B";
		mes "�m���Ă�ł���H";
		next;
		cutin "ep18_miriam_03.png", 255;
		mes "[�L�����p�[]";
		mes "�����c�c���̂��Ƃ��H";
		next;
		cloakoffnpc "�C������#ep18_gw_071";
		cutin "ep18_imril_02.png", 0;
		mes "[�C������]";
		mes "�L�~������ʂ�����͖������Ă��B";
		mes "���Ⴀ�A������͐�ɍs����B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����!!";
		mes "���������āA�m��Ȃ��l������";
		mes "�ꏏ��������Ă��ƁH";
		mes "�C�������I�@������Ƒ҂��Ă����!!";
		set EP18_1QUE,33;
		delquest 11721;
		setquest 11722;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 33) {
		cutin "ep18_maram_01.png", 2;
		cloakoffnpc "�C������#ep18_gw_071";
		mes "[�}����]";
		mes "����!!";
		mes "���������āA�m��Ȃ��l������";
		mes "�ꏏ��������Ă��ƁH";
		mes "�C�������I�@������Ƒ҂��Ă����!!";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 34) {
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�X�A�h�A�x���Ȃ��B";
		mes "�C�������́A�����ƕ����̌���";
		mes "�`���Ă��ꂽ�̂��Ȃ��B";
		next;
		cutin "ep18_miriam_03.png", 0;
		cloakoffnpc "�~���A��#ep18_gw_069";
		mes "[�~���A��]";
		mes "�c�c�����_����������";
		mes "���w���ɋA�邵���Ȃ���B";
		mes "�ň��̏ꍇ�A������x�ƃ{�N������";
		mes "���ɓ���Ȃ��\�������Ă���B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "����Ȗ����ȁI";
		mes "�܂Ƃ܂��������𒲒B�ł���̂�";
		mes "�������������I";
		mes "�K�v�Ȃ�A�O���痈���l�Ԃ�";
		mes "�󂯓���Ȃ��ƁI";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�}�����́c�c���ς�炸����ˁB";
		mes "�����Ă邱�Ƃ͂킩�邯��";
		mes "�ނ炪�ǂ�Ȗڂɑ����Ă������c�c";
		mes "�L�~�́c�c�݂�Ȃƈ����";
		mes "�K���߂����񂾁B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "���́c�c���Z���݂̂�Ȃ̂��Ƃ�";
		mes "�������������c�c";
		mes "������������Ǝv���Ă���B";
		mes "���z�_���y�ϓI���ƌ����Ă�";
		mes "�c�c���͒��߂Ȃ��B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�c�c�S�����B";
		mes "����Ȃ���͂Ȃ������񂾁B";
		mes "�{�N�����āA�݂�Ȃ̂��Ƃ��c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		cloakoffnpc "�X�A�h#ep18_gw_070";
		mes "[�X�A�h]";
		mes "�Ȃ��y�ϓI�Ȑ��i���ƒm���Ă�̂Ȃ�";
		mes "���������T�d�ɍs��������ǂ����H";
		mes "����������l�ɂȂ�A�}�����B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�����`�X�A�h�I";
		mes "���Ă���Ȃ��񂶂�Ȃ�������";
		mes "�S�z���Ă��񂾁I";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[�X�A�h]";
		mes "�c�c���Ⴂ����Ȃ�B";
		mes "���܂ł̕t�����������邩��";
		mes "�ʂ�̈��A�����ɗ����������B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�X�A�h�ɑ��k����";
		mes "�悻�҂�A��ė������Ƃ͎ӂ��I";
		mes "�����y���������I";
		mes "�{���ɂ��߂�I";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�ł��A���̖`���җl��";
		mes "��オ�厖�Ȏd����C����ق�";
		mes "�M���̂�������Ȃ񂾁B";
		mes "�����牽���S�z�͂���Ȃ��I";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�j���G����_�����M�p���Ă��邩��";
		mes "�������������悤�ɐM�p����Ƃł�";
		mes "�v���Ă���̂��H";
		mes "���ꂾ����y�ώ�`�҂́c�c�B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�ނ��c�c�B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�X�A�h�̕��������������Ȃ�I";
		next;
		cutin "ep18_suad_04.png", 1;
		mes "[�X�A�h]";
		mes "�ȂɁc�c�H";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "���w���̍��̏󋵂�m���Ă邾��H";
		mes "���Z���ɑ΂��銴�";
		mes "���܂łɂȂ��������Ă���";
		mes "���ɑ��镨�����W�߂�̂�����";
		mes "�ȒP����Ȃ��񂾁B";
		next;
		mes "[�~���A��]";
		mes "�I�Y�̖��H������";
		mes "�ȑO�قǈ��S����Ȃ��Ȃ��Ă�B";
		mes "�������ł��Ȃ���";
		mes "���ɕK�v�ȕ������͂��Ȃ���";
		mes "�݂�ȋQ�����Ⴄ�񂶂�Ȃ��́H";
		next;
		mes "[�~���A��]";
		mes "�|����邱�Ƃ������I�����Č����Ȃ�";
		mes "���݂̂�Ȃ͉쎀���邵���Ȃ���B";
		mes "�c�c�X�A�h�́A����ŗǂ����Č����́I";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�~���A���c�c�B";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�Ȃ畷����";
		mes "�����􂪂���̂��H";
		mes "��̓I�Ō����I�ȉ����􂾁B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���̍l���Ă�����";
		mes "�ڏZ�̖��ƌ��Z���̊֌W���C��������";
		mes "�I�Y�̋��J�ɋ������čČ��ł���B";
		next;
		mes "[�}����]";
		mes "��������΁A�������ȒP��";
		mes "�K�v�ȕ����𑺂ɉ^�э��߂��B";
		mes "�H�ו������Ė򂾂���";
		mes "�s�����邱�Ƃ͂Ȃ��Ȃ�͂����B";
		next;
		mes "[�}����]";
		mes "�����āA������̖`���җl�͕��̈˗���";
		mes "�ڏZ�̖��ƌ��Z���Ƃ̊֌W��";
		mes "�C�����邽�߂ɓ����Ă�����B";
		next;
		mes "[�}����]";
		mes strcharinfo(0)+"�l��";
		mes "�����ɂ��A�ꂵ���̂�";
		mes "���Z���̒u����Ă���󋵂�";
		mes "�m���Ă��炤�ׂȂ񂾁B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "������c�c";
		mes "������x�Ƒ��ɓ���Ȃ��Ȃ��Ă��ǂ�����";
		mes strcharinfo(0)+"�l��";
		mes "�ו��𑺂ɓ���鋖���~�����I";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�c�c";
		mes "�c�c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�c�c����̂ǂ�����̓I��";
		mes "�����I�ȉ�����Ȃ񂾁H";
		mes "���O�͑��ς�炸���c�c�}�����B";
		next;
		mes "[�X�A�h]";
		mes "�c�c�c�c�`���ҁB";
		mes "�������^��ł��Ă��ꂽ���Ɗ��ӂ���B";
		mes "��͗p�ӂł��Ȃ��������";
		mes "���ɓ��邱�Ƃ������悤�B";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "�j���G����_������������";
		mes "�@���^�����悤�Ɂc�c";
		mes "���O�ɉ����ł���Ƃ����Ȃ�";
		mes "������������ɏؖ����Ă݂���B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�}�����A�~���A���B";
		mes "���O�������������ƒ��ɓ���B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "���c�c�{���H";
		mes "�{���ɑ��ɓ����ėǂ��́H";
		mes "�R�c�c����Ȃ���ˁH";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "������[�[�[�I";
		mes "���������X�A�h���ɂ������I";
		mes "���ɂ�������D���[�[�I";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[�X�A�h]";
		mes "�c�c����ς肱���͒ʂ��ȁB";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�͂��c�c";
		mes "�}�����̂��Ƃ́A�����Ă�����";
		mes "���ɓ��낤�A�`���҂���B";
		mes "�X�A�h�̋C���ς��Ȃ������ɂˁB";
		set EP18_1QUE,35;
		delquest 11723;
		setquest 11724;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�~���A��#ep18_gw_069";
		cloakonnpc "�X�A�h#ep18_gw_070";
		warp "wolfvill.gat", 152, 113;
		end;
	}
	if(EP18_1QUE == 35) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�X�A�h�̋C���ς��Ȃ�������";
		mes "���ɓ���܂��傤�I";
		close2;
		cutin "ep18_maram_01.png", 255;
		warp "wolfvill.gat", 152, 113;
		end;
	}
	if(EP18_1QUE >= 36) {
		mes "[�}����]";
		mes "�ӂ��`�B";
		mes "�����΂ł����Ă݂悤���Ȃ��B";
		cutin "ep18_maram_01.png", 2;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 32 || EP18_1QUE == 34 || EP18_1QUE == 35)
		showevent 0, 1, "�}����#ep18_gw_068";
	else
		showevent 9999,0,"�}����#ep18_gw_068";
	end;
}
gw_fild01.gat,36,103,5	script	�~���A��#ep18_gw_069	10377,{/* 15901 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,41,103,5	script	�X�A�h#ep18_gw_070	10378,{/* 15902 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,37,105,0	script	#ep180_gw_fild01_1	139,{/* 15903 */}
gw_fild01.gat,37,105,5	script	�C������#ep18_gw_071	10379,{/* 15904 (cloaking)*/
	if(EP18_1QUE == 33) {
		cutin "ep18_imril_02.png", 0;
		mes "[�C������]";
		mes "�u�悻�҂�����ׂ��炸�v";
		mes "���ꂪ�A���̑��̝|�ł���H";
		mes "�悻�҂�A��ė����}����������";
		mes "���ɓ����킯�ɂ͂����Ȃ����āB";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�|�̂��Ƃ͒m���Ă��B";
		mes "�ł�����͂��낢�뎖������āB";
		mes "�������u^0000FF�X�A�h^000000�v���Ă�ł��Ă���B";
		mes "���ꂮ�炢�ǂ�����I";
		next;
		cutin "ep18_imril_01.png", 0;
		mes "[�C������]";
		mes "�c�c���A����������";
		mes "�u�X�A�h�v�ɂ��A�����ĂȂ������́H";
		mes "������`�`�`�B";
		mes "���ꂶ�Ⴀ�A�Ȃ����疳������B";
		next;
		cutin "ep18_imril_03.png", 0;
		mes "[�C������]";
		mes "�c�c�����������Ă����������";
		mes "�X�A�h�ɐ��͊|���Ă݂��B";
		mes "�ł��A���҂��Ȃ��ł���B";
		mes "���̝|�Ɍ������X�A�h�̂��Ƃ����炳�B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "���w���Ŏd���ꂽ�������^��ł�����";
		mes "�`���Ă����Ζ]�݂͂���B";
		mes "�c�c���A���Ԃ�B";
		next;
		cutin "ep18_miriam_03.png", 1;
		mes "[�~���A��]";
		mes "�l�߂��Â������ȁB";
		mes "�܂����A���̓����܂ŗ���";
		mes "���ꂳ���Ă��炦�Ȃ��Ȃ��";
		mes "�v���ĂȂ������B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�����܂���ł���";
		mes strcharinfo(0)+"�l�B";
		mes "���Z�����B��ĕ�炵�Ă���ׁA";
		mes "�悻���痈���l�Ԃɑ΂���";
		mes "���ɕq���Ȃ�ł��B";
		next;
		mes "[�}����]";
		mes "�Ƃɂ����u�X�A�h�v�c�c";
		mes "���Ń��[�_�[�I�ȗ���̐l�Ԃł���";
		mes "�ނ��Ȃ�Ƃ����Đ������Ȃ��ƁB";
		mes "�c�c���Ă����Ɨǂ��̂ł����B";
		set EP18_1QUE,34;
		delquest 11722;
		setquest 11723;
		close2;
		cloakonnpc "�C������#ep18_gw_071";
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 34) {
		//������
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 33)
		showevent 0, 1, "�C������#ep18_gw_071";
	else
		showevent 9999,0,"�C������#ep18_gw_071";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,39,100,5	script	�ٍ��̏��l#ep18_gw2_072	10380,{/* 15905 */}
gw_fild01.gat,34,96,3	script	�ٍ��̏��l#ep18_gw3_073	10380,{/* 15906 */}

wolfvill.gat,143,114,5	script	�}����#ep18_wv_074	10376,{/* 15907 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,145,114,5	script	�~���A��#ep18_wv_075	10377,{/* 15908 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,113,5	script	�C������#ep18_wv_076	10379,{/* 15909 */
	if(EP18_1QUE == 35) {
		cutin "ep18_imril_03.png", 0;
		mes "[�C������]";
		mes "���킟�`�`�`�I";
		mes "���H�@�}�W!?";
		mes "�}�W�ő��ɓ��ꂽ�́H";
		mes "���̃J�^�u�c���悻�҂�";
		mes "���ɏ��������Ȃ�āI";
		next;
		cloakoffnpc "�~���A��#ep18_wv_075";
		cloakoffnpc "�}����#ep18_wv_074";
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�q�h�C���������ˁB";
		mes "�������͂��Ȃ������ǂ������H";
		next;
		cutin "ep18_imril_04.png", 0;
		mes "[�C������]";
		mes "���A���߂�āI";
		mes "����Ȃ킯�͂Ȃ���I";
		mes "���}�����E�F���J�[���I";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "���q���ǂ��ȁc�c";
		mes "�܂��A���ꂾ�����̏󋵂�";
		mes "�؉H�l�܂��Ă���񂾂낤���ǁB";
		next;
		cutin "ep18_imril_01.png", 0;
		mes "[�C������]";
		mes "�����������B";
		mes "�X�A�h�����ɂ͏o���ĂȂ����낤����";
		mes "����ɂ͓�������Ă���͂����B";
		mes "�N�����ӔC����������B";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[�X�}�[�g�G���[]";
		mes "�c�c�s�s�I";
		mes "�w���͂̏󋵂��m�F�B";
		mes "�@���؂��΂̂悤�Ɍł��͗l�c�c";
		mes "�@�����A����͎��؂ł͂Ȃ��΂ł��B";
		mes "�@���̊��Ŏ��������͕s�\�ł��x";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����̉ו��̉^�ѓ����";
		mes "�����ł��]�T���ł���Ɨǂ��񂾂��ǁc�c";
		mes "���āA����ł͖`���җl�B";
		mes "�������ĉ��܂��傤�B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�����ɕ�炷���Z�������̘b�𕷂���";
		mes "�M���֌W��z�����Ƃ��ł����";
		mes "�������̂��������ɂȂ邩��";
		mes "����܂��񂩂�ˁB";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "�]�u�D�F�̎q���B�v�̋��͂�����";
		mes "�@�D�F�T�̑��̏Z����";
		mes "�@�Θb����@�����ꂽ�B";
		mes "�@�j���G���̗��݂��������邽�߂ɂ�";
		mes "�@�Z���̘b�𕷂��Ď���";
		mes "�@�M���֌W��z�����]";
		set EP18_1QUE,36;
		delquest 11724;
		setquest 11718;
		setquest 130101;
		setquest 130102;
		setquest 130103;
		setquest 130104;
		setquest 130105;
		setquest 130106;
		setquest 130107;
		setquest 130108;
		setquest 130109;
		setquest 130110;
		setquest 130111;
		setquest 130112;
		setquest 130113;
		setquest 130114;
		cloakonnpc "�~���A��#ep18_wv_075";
		cloakonnpc "�}����#ep18_wv_074";
		close;
	}
	if(EP18_1QUE >= 36) {
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�悤�I";
		mes strcharinfo(0);
		mes "���݂̂�ȂƂ͓���߂Ă邩���H";
		next;
		switch(select("��`���邱�Ƃ͂Ȃ��H","�D�F�T�̑��̐l�B�͂ǂ��v���Ă���H","�p�͂Ȃ�")) {
		case 1:
			if(checkquest(11735)) {
				cutin "ep18_imril_02.png", 2;
				mes "[�C������]";
				mes "�������c�c";
				mes "�����`�N�`�N����B";
				mes "���Ă������݂������B";
				next;
				cutin "ep18_suad_03.png", 0;
				mes "[�X�A�h]";
				mes "���������A�C�������B";
				mes "���H�̉��܂ōs�����������ȁH";
				mes "�悭�����ɖ߂��Ă��ꂽ���̂��B";
				next;
				cutin "ep18_imril_01.png", 2;
				mes "[�C������]";
				mes "�͂�I�@������̖`���҂����";
				mes "�ꏏ�ɗ��Ă�������񂾁B";
				mes "�N�����H�̉��𒲂ׂ悤�Ƃ��Ȃ����炳�B";
				next;
				cutin "ep18_suad_01.png", 0;
				mes "[�X�A�h]";
				mes "�܂������c�c����������ȁB";
				next;
				cutin "ep18_imril_04.png", 2;
				mes "[�C������]";
				mes "�S�z���Ă���āA���肪�Ƃ���B";
				mes "�Ă��A����ς�󋵂͗ǂ��Ȃ������B";
				mes "�n��n�悪���X�ɍL�����Ă�B";
				mes "���̂܂܂��Ⴂ������H�͎g���Ȃ��Ȃ�B";
				next;
				cutin "ep18_suad_01.png", 0;
				mes "[�X�A�h]";
				mes "�{�����H";
				mes "�c�c��������΍􂪕K�v���ȁB";
				mes "�܂��̓����X�^�[���쏜����";
				mes "���S���m�ۂ������Ƃ��낾�ȁB";
				next;
				cutin "ep18_imril_04.png", 2;
				mes "[�C������]";
				mes "���I";
				mes "�X�A�h���悤�₭���Ԃ̐[������";
				mes "�C�t���Ă��ꂽ�݂������B";
				mes "���������b�オ���������ȁB";
				next;
				cutin "ep18_imril_02.png", 2;
				mes "[�C������]";
				mes "������`���҂���̂���������B";
				mes "���肪�Ƃ��B";
				mes "�܂��܂����͎R�ς݂��Ȃ��B";
				next;
				mes "[�C������]";
				mes "�i���^�Ԃɂ��A�n��̑Ώ�������ɂ�";
				mes "�l�b�N�ƂȂ�̂̓����X�^�[���ȁB";
				mes "��C�c�炸�쒀�ł����炢�����ǁA";
				mes "�ǂ�����΂����񂾂낤�H";
				cutin "ep18_imril_01.png", 2;
				next;
				cutin "ep18_imril_03.png", 2;
				mes "[�C������]";
				mes "�c�c�`���҂���B";
				mes "���ꂩ�����`���Ă���Ȃ��H";
				mes "���x�͕�V���p�ӂ��邩�炳�B";
				next;
				menu "�����󂯂�",-,"�d���Ȃ�",-;
				cutin "ep18_imril_04.png", 2;
				mes "[�C������]";
				mes "�{���I�H�@���x��";
				mes "^e5555e�u�z�b�g�����v���u15�v��^000000";
				mes "�ގ����ė~�����B";
				mes "�I�Y�̖��H�̒��ł�";
				mes "�s���l�����ɂƂ���";
				mes "���f�ȃ����X�^�[�Ȃ񂾁I���ނ�I";
				delquest 11735;
				setquest 11738;
				close2;
				cutin "ep18_imril_04.png", 255;
				end;
			}
			if(checkquest(11725)) {
				//������
				close;
			}
			if(checkquest(130114)) {
				cutin "ep18_imril_03.png", 2;
				mes "[�C������]";
				mes "���������΁A�u�I�Y�̖��H�v�ł�";
				mes "������������Ă���Ă��肪�Ƃ��B";
				mes "�����Ƃ��炵�ĂȂ��������炳�B";
				next;
				cutin "ep18_imril_02.png", 2;
				mes "[�C������]";
				mes "�ȑO�Ȃ�A��l�ł��ʂꂽ�̂�";
				mes "�i�X�ƈ�l�Œʂ�̂�����Ȃ��Ă�B";
				mes "�n��ƃ����X�^�[�������Ă������Ƃ�";
				mes "�������Ǝv���B";
				mes "���R�͂����ς�킩��Ȃ����ǂˁB";
				next;
				mes "[�C������]";
				mes "���́A���H�̉��𒲍����悤�Ǝv���Ă�B";
				mes "���ǈ�l����댯����";
				mes "������ƌ����āA���͐l��s����";
				mes "�N����`���Ă���Ȃ��B";
				next;
				mes "[�C������]";
				mes "�c�c�`���҂���͋�����ˁB";
				mes "���������`���Ă���Ȃ��H";
				mes "�ɂȎ��ł������炳�B";
				mes "���ׂ̈��Ǝv���Ă��B";
				next;
				if(select("�������o�����悤","���͉ɂ���Ȃ�") == 2) {
					cutin "ep18_imril_02.png", 2;
					mes "[�C������]";
					mes "�ł���ˁ[�c�c";
					mes "�͂��A�N�����݂��Ă���Ȃ����Ȃ��B";
					close2;
					cutin "ep18_imril_02.png", 255;
					end;
				}
				cutin "ep18_imril_03.png", 2;
				mes "[�C������]";
				mes "���H�@�}�W!?";
				mes "�������ŗǂ��́H";
				mes "����Ȃɂ�����������󂯂Ă����Ȃ��";
				mes "������Ɗ��������B";
				next;
				mes "[�C������]";
				mes "���Ⴀ�A�u^0000FF�I�Y�̖��H^000000�v�̓�����";
				mes "�������������B";
				mes "�ꏊ�́A�o���Ă��ˁH";
				mes "��낵���I";
				delquest 130114;
				setquest 11725;
				close2;
				cutin "ep18_imril_03.png", 255;
				end;
			}
			mes "[�C������]";
			mes "�i���^�Ԃɂ��A�n��̑Ώ�������ɂ�";
			mes "�l�b�N�ƂȂ�̂̓����X�^�[���ȁB";
			mes "��C�c�炸�쒀�ł�����";
			mes "�����񂾂��ǁB";
			cutin "ep18_imril_01.png", 2;
			next;
			cutin "ep18_imril_03.png", 2;
			mes "[�C������]";
			mes "�ǂ��A�`���҂���B";
			mes "�����X�^�[�̐������炵�����񂾂���";
			mes "��`���Ă���Ȃ��H";
			mes "��V���p�ӂ��邩�炳�B";
			next;
			if(select("�����󂯂�","��߂Ă���") == 2) {
				mes "[�C������]";
				mes "�ȂɁA�Z�����́H";
				mes "����Ȃ�A�d���Ȃ������B";
				cutin "ep18_imril_02.png", 2;
				close2;
				cutin "ep18_imril_02.png", 255;
				end;
			}
			if(checkquest(11739)) {
				mes "[�C������]";
				mes "�����́A�����l�B";
				mes "���͐l�肪���Ȃ����炳�B";
				mes "��������`���Ă����Ə������B";
				cutin "ep18_imril_04.png", 2;
				close2;
				cutin "ep18_imril_04.png", 255;
				end;
			}
			if(checkquest(11738)&4) {
				delquest 11738;
				setquest 11739;
				getitem 1000405,4;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				getexp 487500000,0,0;
				getexp 0,500000000,0;
				setquest 130134;
				compquest 130134;
				mes "[�C������]";
				mes "�����I�������!?";
				mes "�������A���r�`���҂���I";
				mes "�ق�Ƃ��ɏ������B";
				mes "�����A��V���󂯎���āB";
				cutin "ep18_imril_04.png", 2;
				close2;
				cutin "ep18_imril_04.png", 255;
				end;
			}
			mes "[�C������]";
			mes "^e5555e�u�z�b�g�����v���u15�v��^000000";
			mes "�ގ����ė~�����B";
			mes "�����ł������X�^�[�̐��������";
			mes "���H��ʂ�s���l������";
			mes "���S�ɍs�����ł���悤�ɂȂ邩��B";
			close2;
			cutin "ep18_imril_03.png", 255;
			end;
		case 2:
			mes "[�C������]";
			mes "�����炩�猩��";
			mes "���̐l�X����̐M���x�́c�c";
			mes "����ȂƂ����ȁI";
			mes "";
			mes "�y�D�F�T�̑��M���x�z";
			mes "����������������������������";
			next;
			if(EP18_1QUE >= 37) {
				mes "[�C������]";
				mes "�����������葺�݂̂��";
				mes strcharinfo(0)+"�̂���";
				mes "�������̏Z�����Ǝv���Ă��I";
				if(EP18_1QUE == 37) {
					next;
					unittalk getnpcid(0,"���̏��N#���_077"),"���̏��N : �`���҂���A���c���͂��܂��I�`���҂���̐Ȃ�����񂾂��āI";
					emotion 12,"���̏��N#���_077";
					mes "[�C������]";
					mes "�ق�A^ff0000���c^000000�̐Ȃ܂�";
					mes "�p�ӂ��ꂽ���Ă��B";
					mes "�������������A";
					mes "�����̏��N�ɏڂ��������Ă����Ă�B";
				}
				close2;
				cutin "ep18_imril_01.png", 255;
				end;
			}
			mes "[�C������]";
			mes "���݂̂�Ȃ̔Y�݂���������΁A";
			mes "�M���𓾂���񂶂�Ȃ����ȁH";
			mes "����^ff0000���c^000000��";
			mes "���҂���邭�炢�ɂȂ�΁A";
			mes "���̃����o�[�Ƃ���";
			mes "�\���F�߂�ꂽ�؂��B";
			next;
			cutin "ep18_imril_01.png", 255;
			mes "�]�Z���̘b�𕷂��Ď���";
			mes "�@�M���֌W��z�����]";
			close2;
			cutin "ep18_imril_01.png", 255;
			end;
		case 3:
			mes "[�C������]";
			mes "�ȂɁA�Z�����́H";
			mes "����Ȃ�A�d���Ȃ������B";
			cutin "ep18_imril_02.png", 2;
			close2;
			cutin "ep18_imril_02.png", 255;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 35)
		showevent 0, 1, "�C������#ep18_wv_076";
	else if(checkquest(130114))
		showevent 0, 3, "�C������#ep18_wv_076";
	else
		showevent 9999,0,"�C������#ep18_wv_076";
	end;
}
wolfvill.gat,141,123,3	script	���̏��N#���_077	944,{/* 15910 */
	if(EP18_1QUE == 37) {
		mes "[���N]";
		mes "�Ԃ��Ȃ�^ff0000���c^000000���n�܂��I";
		mes "���̃����o�[���S���Q�������c����I";
		next;
		mes "[���N]";
		mes "�����I�@�`���҂̐l�I";
		mes "�`���҂̐Ȃ�����񂾂��āI";
		mes "���̃����o�[�Ƃ���";
		mes "�F�߂�ꂽ���Ă��Ƃł��ˁI";
		next;
		mes "[���N]";
		mes "�����A�`���҂̐l�I";
		mes "��������^ff0000�k^000000�ɊF���W�܂��Ă�̂ŁA";
		mes "�����������Ă��������I";
		set EP18_1QUE,38;
		delquest 18082;
		setquest 16567;
		close2;
		cloakoffnpc "�X�A�h#1_079";
		cloakoffnpc "�~���A��#1_080";
		cloakoffnpc "�}����#1_082";
		cloakoffnpc "�M���N#�ߌ��h1_083";
		cloakoffnpc "�ߌ��h�̎��#�ߌ��h2_08";
		cloakoffnpc "�����ȐN#�ߌ��h3_085";
		cloakoffnpc "���̋C�̑����N#�ߌ��h";
		cloakoffnpc "�{�����N#�ߌ��h5_087";
		cloakoffnpc "�n�����̘V�l#�V�N�w1_08";
		cloakoffnpc "�Q�Ă�s�N#�V�N�w2_089";
		cloakoffnpc "���C�ȑs�N#�V�N�w3_090";
		cloakoffnpc "���a�ȘV�l#�V�N�w4_091";
		cloakoffnpc "�M���s�N#���폊����1_09";
		cloakoffnpc "��C�ȐN#�����h1_093";
		cloakoffnpc "�����ȐN#�����h2_094";
		cloakoffnpc "�����h�̐N#�����h3_09";
		cloakoffnpc "�ߌ��h�̐N#�ߌ��h2_09";
		end;
	}
	if(EP18_1QUE == 38) {
		mes "[���N]";
		mes "�����A�`���҂̐l�I";
		mes "��������^ff0000�k^000000�ɊF���W�܂��Ă�̂ŁA";
		mes "�����������Ă��������I";
		mes "���c���n�܂�܂���I";
		close2;
		cloakoffnpc "�X�A�h#1_079";
		cloakoffnpc "�~���A��#1_080";
		cloakoffnpc "�}����#1_082";
		cloakoffnpc "�M���N#�ߌ��h1_083";
		cloakoffnpc "�ߌ��h�̎��#�ߌ��h2_08";
		cloakoffnpc "�����ȐN#�ߌ��h3_085";
		cloakoffnpc "���̋C�̑����N#�ߌ��h";
		cloakoffnpc "�{�����N#�ߌ��h5_087";
		cloakoffnpc "�n�����̘V�l#�V�N�w1_08";
		cloakoffnpc "�Q�Ă�s�N#�V�N�w2_089";
		cloakoffnpc "���C�ȑs�N#�V�N�w3_090";
		cloakoffnpc "���a�ȘV�l#�V�N�w4_091";
		cloakoffnpc "�M���s�N#���폊����1_09";
		cloakoffnpc "��C�ȐN#�����h1_093";
		cloakoffnpc "�����ȐN#�����h2_094";
		cloakoffnpc "�����h�̐N#�����h3_09";
		cloakoffnpc "�ߌ��h�̐N#�ߌ��h2_09";
		end;
	}
	mes "[���N]";
	mes "���̌��ߎ��́u^ff0000���c^000000�v��";
	mes "���߂Ă����ł��B";
	next;
	mes "[���N]";
	mes "���̃����o�[���S���Q������";
	mes "�Ƃ��Ă���؂ȉ�c�Ȃ�ł���I";
	mes "���̃����o�[�Ƃ��ĔF�߂��Ȃ��l��";
	mes "�Q�����邱�Ƃ��ł��܂��񂯂ǂˁB";
	next;
	mes "[���N]";
	mes "�����Q�����������Č����Ȃ�";
	mes "�撣���đ��̐l��������";
	mes "�M���𓾂Ă��������I";
	close;
OnQuestInfo:
	if(EP18_1QUE == 37)
		showevent 0, 1, "���̏��N#���_077";
	else
		showevent 9999,0,"���̏��N#���_077";
	end;
}
wolfvill.gat,146,148,0	script	#���c1_078	139,14,14,{/* 15911 */
	if(EP18_1QUE >= 38 && EP18_1QUE <= 40) {
		cloakoffnpc "�X�A�h#1_079";
		cloakoffnpc "�~���A��#1_080";
		cloakoffnpc "�}����#1_082";
		cloakoffnpc "�M���N#�ߌ��h1_083";
		cloakoffnpc "�ߌ��h�̎��#�ߌ��h2_08";
		cloakoffnpc "�����ȐN#�ߌ��h3_085";
		cloakoffnpc "���̋C�̑����N#�ߌ��h";
		cloakoffnpc "�{�����N#�ߌ��h5_087";
		cloakoffnpc "�n�����̘V�l#�V�N�w1_08";
		cloakoffnpc "�Q�Ă�s�N#�V�N�w2_089";
		cloakoffnpc "���C�ȑs�N#�V�N�w3_090";
		cloakoffnpc "���a�ȘV�l#�V�N�w4_091";
		cloakoffnpc "�M���s�N#���폊����1_09";
		cloakoffnpc "��C�ȐN#�����h1_093";
		cloakoffnpc "�����ȐN#�����h2_094";
		cloakoffnpc "�����h�̐N#�����h3_09";
		cloakoffnpc "�ߌ��h�̐N#�ߌ��h2_09";
	}
	else if(EP18_1QUE == 41) {
		cloakoffnpc "�X�A�h#1_079";
		cloakoffnpc "�~���A��#1_080";
		cloakoffnpc "�}����#1_082";
		cloakonnpc "�M���N#�ߌ��h1_083";
		cloakonnpc "�ߌ��h�̎��#�ߌ��h2_08";
		cloakoffnpc "�����ȐN#�ߌ��h3_085";
		cloakonnpc "���̋C�̑����N#�ߌ��h";
		cloakonnpc "�{�����N#�ߌ��h5_087";
		cloakonnpc "�n�����̘V�l#�V�N�w1_08";
		cloakonnpc "�Q�Ă�s�N#�V�N�w2_089";
		cloakonnpc "���C�ȑs�N#�V�N�w3_090";
		cloakonnpc "���a�ȘV�l#�V�N�w4_091";
		cloakonnpc "�M���s�N#���폊����1_09";
		cloakonnpc "��C�ȐN#�����h1_093";
		cloakonnpc "�����ȐN#�����h2_094";
		cloakonnpc "�����h�̐N#�����h3_09";
		cloakoffnpc "�ߌ��h�̐N#�ߌ��h2_09";
	}
	else if(EP18_1QUE == 42) {
		cloakonnpc "�X�A�h#1_079";
		cloakonnpc "�~���A��#1_080";
		cloakonnpc "�}����#1_082";
		cloakonnpc "�M���N#�ߌ��h1_083";
		cloakonnpc "�ߌ��h�̎��#�ߌ��h2_08";
		cloakoffnpc "�����ȐN#�ߌ��h3_085";
		cloakonnpc "���̋C�̑����N#�ߌ��h";
		cloakonnpc "�{�����N#�ߌ��h5_087";
		cloakonnpc "�n�����̘V�l#�V�N�w1_08";
		cloakonnpc "�Q�Ă�s�N#�V�N�w2_089";
		cloakonnpc "���C�ȑs�N#�V�N�w3_090";
		cloakonnpc "���a�ȘV�l#�V�N�w4_091";
		cloakonnpc "�M���s�N#���폊����1_09";
		cloakonnpc "��C�ȐN#�����h1_093";
		cloakonnpc "�����ȐN#�����h2_094";
		cloakonnpc "�����h�̐N#�����h3_09";
		cloakoffnpc "�ߌ��h�̐N#�ߌ��h2_09";
	}
	else {
		cloakonnpc "�X�A�h#1_079";
		cloakonnpc "�~���A��#1_080";
		cloakonnpc "�}����#1_082";
		cloakonnpc "�M���N#�ߌ��h1_083";
		cloakonnpc "�ߌ��h�̎��#�ߌ��h2_08";
		cloakonnpc "�����ȐN#�ߌ��h3_085";
		cloakonnpc "���̋C�̑����N#�ߌ��h";
		cloakonnpc "�{�����N#�ߌ��h5_087";
		cloakonnpc "�n�����̘V�l#�V�N�w1_08";
		cloakonnpc "�Q�Ă�s�N#�V�N�w2_089";
		cloakonnpc "���C�ȑs�N#�V�N�w3_090";
		cloakonnpc "���a�ȘV�l#�V�N�w4_091";
		cloakonnpc "�M���s�N#���폊����1_09";
		cloakonnpc "��C�ȐN#�����h1_093";
		cloakonnpc "�����ȐN#�����h2_094";
		cloakonnpc "�����h�̐N#�����h3_09";
		cloakonnpc "�ߌ��h�̐N#�ߌ��h2_09";
		cloakonnpc "�}����#1_081";
	}
	end;
}
wolfvill.gat,144,151,5	script	�X�A�h#1_079	10378,{/* 15912 (cloaking)*/
	if(EP18_1QUE == 38) {
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "������u���c�v���J�����B";
		mes "�c�c�`���ҁA���O�̐Ȃ��p�ӂ��Ă������B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���������`���җl�I";
		mes "�݂�ȁA�M���Ɋ��҂��Ă��ł���B";
		mes "����I�@��]�̐��I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�}�����́A������߂��c�c";
		mes "��قǖ`���җl��";
		mes "�u���c�v�ɐȂ�p�ӂ��ꂽ�̂�";
		mes "�������̂��ȁB";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�J�n�܂łɂ́A�܂����Ԃ�����B";
		mes "����܂ŏW�܂������l�����̘b��";
		mes "�����Ă�������ǂ����H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����͗ǂ��l���ł��B";
		mes "�����ĉ���Ă���Ԃ�";
		mes "��c���n�܂�ł��傤����ˁB";
		set EP18_1QUE,39;
		delquest 16567;
		setquest 16568;
		setquest 16569;
		setquest 16570;
		setquest 16571;
		close2;
		showevent 0, 1, "�M���N#�ߌ��h1_083";	// 2318: 145, 146
		showevent 0, 1, "�n�����̘V�l#�V�N�w1_08";	// 2323: 139, 148
		showevent 0, 1, "�M���s�N#���폊����1_09";	// 2327: 150, 147
		showevent 0, 1, "��C�ȐN#�����h1_093";	// 2328: 152, 145
		cutin "ep18_suad_01.png", 255;
		end;
	}
	if(EP18_1QUE == 39) {
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�J�n�܂łɂ́A�܂����Ԃ�����B";
		mes "����܂ŏW�܂������l�����̘b��";
		mes "�����Ă�������ǂ����H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����͗ǂ��l���ł��B";
		mes "�����ĉ���Ă���Ԃ�";
		mes "��c���n�܂�ł��傤����ˁB";
		close2;
		cutin "ep18_suad_01.png", 255;
		end;
	}
	if(EP18_1QUE == 40) {
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�������������悤���ȁc�c";
		mes "�ł́A���ꂩ��u���c�v���n�߂�B";
		mes "����̋c��́A���̑��̍���ɂ��Ă��B";
		next;
		mes "[�X�A�h]";
		mes "�����͕s�v���낤��";
		mes "�����Č��킹�Ă��炤�B";
		mes "�c�c���̑��̏󋵂͋ɂ߂Č������B";
		next;
		mes "[�X�A�h]";
		mes "�X��ǂ��A���̑��ɂ��ǂ蒅���҂�";
		mes "������������";
		mes "�H�����Ƃ����������ɕK�v�ȕ�����";
		mes "�\���ɑ���Ă���Ƃ͌����Ȃ��B";
		next;
		mes "[�X�A�h]";
		mes "������ӂ�";
		mes "����ǂ����Ă����ׂ����c�c";
		mes "�����肾���A�����炱��";
		mes "�����ɏW�܂����F�̒m�b��݂��ė~�����B";
		mes "�ӌ�������Ύ��R�ɔ������Ă���B";
		next;
		cutin "ep18_suad_01.png", 255;
		emotion 7,"�M���N#�ߌ��h1_083";
		mes "[�M���N]";
		mes "���w���̈ڏZ�̖�������";
		mes "�v���m�点�Ă�낤�I";
		mes "�z��̐_�a��j�󂷂�񂾁I";
		unittalk getnpcid(0,"�ߌ��h�̎��#�ߌ��h2_08"),"�ߌ��h�̎�� : �������I�������I";
		unittalk getnpcid(0,"���̋C�̑����N#�ߌ��h"),"���̋C�̑����N : �S���󂵂Ă��܂��I�I";
		next;
		mes "[�n�����̘V�l]";
		mes "���͕n�����Ƃ͌���";
		mes "���܂ł��̑��ŕ��a�ɂ���ė����B";
		mes "�����Ȃ�_�a��j�󂷂�ȂǂƂ����̂�";
		mes "���܂�ɖ\�͓I������B";
		unittalk getnpcid(0,"���a�ȘV�l#�V�N�w4_091"),"���a�ȘV�l : ��������B�Z���I������킢�B";
		next;
		emotion 7,"�M���N#�ߌ��h1_083";
		mes "[�M���N]";
		mes "���܂ł���ȔL�̊z�݂����ȏꏊ��";
		mes "�B��Ă������Ȃ񂾁I";
		mes "�H�������������������";
		mes "����Ă��Ȃ��̂ɁI";
		next;
		mes "[�M���N]";
		mes "���̒n�͌��X���Z���̂��̂��I";
		mes "��������߂����������񂾂�I";
		unittalk getnpcid(0,"�ߌ��h�̎��#�ߌ��h2_08"),"�ߌ��h�̎�� : �D���񂶂�Ȃ��I�@���߂��񂾁I";
		unittalk getnpcid(0,"���̋C�̑����N#�ߌ��h"),"���̋C�̑����N : �������A����͐����ȓ������I";
		next;
		mes "[�n�����̘V�l]";
		mes "���Ō����̂͊ȒP���Ⴊ";
		mes "�����Ό�������A�吨�̒��Ԃ����ʁB";
		mes "������������ŉ��𓾂悤�Ƃ����̂��H";
		unittalk getnpcid(0,"���C�ȑs�N#�V�N�w3_090"),"���C�ȑs�N : ��̌o�����Ȃ����c�́c�c�킩���ĂȂ��B";
		next;
		mes "[�ߌ��h�̎��]";
		mes "���܂ŉ����������𗬂��ĂȂ��ƁH";
		mes "�����ė������I�@��������̌��Ɨ܂��ȁI";
		mes "�X�łǂ�Ȗڂɑ����Ă�����";
		mes "�v���Ă�񂾁I";
		unittalk getnpcid(0,"�ߌ��h�̐N#�ߌ��h2_09"),"�ߌ��h�̐N : ���a�҂����߁I";
		unittalk getnpcid(0,"�{�����N#�ߌ��h5_087"),"�{�����N : ���O��݂͂�ȁA���Q���鑤�Ɠ������I";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�����ƃq�[�g�A�b�v���Ă����ȁB";
		mes "�X�A�h�c�c�H";
		next;
		cutin "ep18_suad_03.png", 1;
		emotion 9,"�X�A�h#1_079";
		mes "[�X�A�h]";
		mes "�c�c�c�c";
		mes "�c�c�B";
		next;
		cutin "ep18_suad_03.png", 255;
		mes "[�ߌ��h�̎��]";
		mes "�������͂����\���ɑς����I";
		mes "�U��̏��_��ϐM����z��ɂ�";
		mes "���������V��������Ă��I";
		next;
		mes "[�Q�Ă�s�N]";
		mes "���P�ɂȂ邱�Ƃ����ł��Ȃ���˂߁I";
		mes "��X���B��Ă��闝�R���l����I";
		mes "�S���ŐS��������肩!?";
		next;
		mes "[�M���N]";
		mes "�B��鎖�ł���";
		mes "���̈����ۂ�����";
		mes "���Ȃ������񂾂�I";
		mes "�������͈Ⴄ���I";
		mes "���������Đ키�o�傪�ł��Ă�񂾁I";
		next;
		cutin "ep18_suad_01.png", 1;
		emotion 1,"�X�A�h#1_079";
		mes "[�X�A�h]";
		mes "�����܂ł��I";
		mes "�����́A���݂��̓{����Ԃ��������߂�";
		mes "�p�ӂ�����ł͂Ȃ��B";
		mes "�݂��Ɍ������ł�";
		mes "���ǂ�������z�����߂̏ꂾ�B";
		next;
		cutin "ep18_suad_01.png", 255;
		emotion 7,"�M���N#�ߌ��h1_083";
		mes "[�M���N]";
		mes "���ǂ�������z�����߂�";
		mes "�ז��҂�œ|������Č����Ă��ł��I";
		mes "�܂����X�A�h�����";
		mes "����Ȕs�k��`�҂̖����Ȃ�ł����H";
		next;
		mes "[�Q�Ă�s�N]";
		mes "�m�����o��������Ȃ���˂�";
		mes "�������ĂĂ��邾���ł��I";
		mes "�����r���Ă邾���r���Ă�";
		mes "��X��j�ł����悤�Ƃ��Ă���񂾁I";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "�c�c���������ɂ���B";
		mes "���́A�ǂ���ɂ����S���Ȃ��B";
		mes "�����̗���ƍ����𕷂��B";
		unittalk getnpcid(0,"�Q�Ă�s�N#�V�N�w2_089"),"�Q�Ă�s�N : �c�c�B";
		unittalk getnpcid(0,"�ߌ��h�̎��#�ߌ��h2_08"),"�ߌ��h�̎�� : �c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "���̏�ŁA�F���K���ɂȂ��";
		mes "��̓I�Ō����I�ȕ��@��͍�����B";
		mes "���Ԃ͏��Ȃ��c�c";
		mes "�����}���Ō��߂��邱�Ƃ���Ȃ��B";
		next;
		cutin "ep18_suad_03.png", 255;
		mes "[�M���N]";
		mes "��̓I�Ȏ�i�Ȃ�A�����ɂ���I";
		mes "���̕��킪�������I";
		mes "�@";
		mes "^0000FF�]�N�̎�ɂ͌R�������悤��";
		mes "�@���킪�����Ă���]^000000";
		next;
		cutin "ep18_maram_03.png", 2;
		emotion 1,"�}����#1_082";
		mes "[�}����]";
		mes "���̕���́c�c";
		mes "���������������񂾂��̂Ƃ�";
		mes "�Ⴄ��ˁc�c�B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�c�c���c�c�H";
		mes "���̕���́c�c�B";
		next;
		cutin "ep18_suad_03.png", 255;
		mes "[�M���N]";
		mes "������������";
		mes "������������I�ɔ��Q���Ă����z���";
		mes "�ڂ��o�߂邾�낤��I";
		mes "�z��́A����������̖����T��";
		mes "�v���Ă�񂾂���ȁI";
		next;
		mes "^0000FF�]��c�ɎQ�����Ă����ґS����";
		mes "�@�N�̎�����Ɏ������������B";
		mes "�@�����f����ꂽ���킩��";
		mes "�@�N���������O�����Ƃ��ł��Ȃ��]^000000";
		next;
		mes "^0000FF�]���̗l�q�͂܂�ŕ�����c�c";
		mes "�@���̋��n���~���u�́v�̏ے��Ƃ���";
		mes "�@�����̔@���򂶂Ă���l�Ɍ������̂�";
		mes "�@�C�̂����������̂��낤���c�c�]^000000";
		next;
		mes "[���C�ȑs�N]";
		mes "�ԁA���͂��s�g����͔̂��΂��c�c";
		mes "�����c�c�������ɕs�������邱�Ƃ�";
		mes "�z��ɒm�炵�߂��i������΁c�c�B";
		next;
		mes "[��C�ȐN]";
		mes "�c�c������g��Ȃ��Ă�";
		mes "���̕���������ĉ��΁c�c";
		mes "�������̌��ӂ�������̂ł́c�c�H";
		next;
		mes "[�n�����̘V�l]";
		mes "���͍s�g�ɂ́A�����܂Ŕ��΂���B";
		mes "�c�c���Ⴊ�c�c�Ⴆ�΁c�c";
		mes "���Љ^���c�c�f���Ɂc�c";
		mes "�Q�����邾���Ȃ�c�c�B";
		next;
		mes "[�M���s�N]";
		mes "�������I�@���Ђ̔���Ȃ��f���ɂ�";
		mes "�Ȃ�̈Ӗ��������I";
		mes "�h��ɂ��Ȃ���";
		mes "�z��͖ڂ͊o�܂��Ȃ��񂾁I";
		next;
		mes "[�Q�Ă�s�N]";
		mes "���O�������킯�ł͂Ȃ����c�c";
		mes "�����ށc�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		emotion 0,"�X�A�h#1_079";
		mes "[�X�A�h]";
		mes "������x�ӌ����o��������ȁB";
		mes "�������̈ӎu�������ׂ�";
		mes "���w���Ńf�����s���Ƃ����̂��ȁH";
		next;
		cutin "ep18_suad_01.png", 255;
		mes "[�M���N]";
		mes "�����[�[�I";
		next;
		mes "[�n�����̘V�l]";
		mes "�c�c���@�͋l�߂˂΂Ȃ��";
		mes "���̂ł���΁A�Q���͂��邼�B";
		next;
		mes "[�����h�̐N]";
		mes "�l�����ɂł��邩�ȁc�c";
		mes "�ł��A���c�Ō��肳�ꂽ�ȏ��";
		mes "�ł�����苦�͂���B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�ł́A����̌v��Ɋւ��Ă�";
		mes "�ǂ��ĉ�c���s���B";
		mes "����ɂč���̑��c�͕�B";
		next;
		cloakonnpc "�M���N#�ߌ��h1_083";
		cloakonnpc "�����ȐN#�����h2_094";
		cloakonnpc "���C�ȑs�N#�V�N�w3_090";
		cloakonnpc "�{�����N#�ߌ��h5_087";
		cloakonnpc "�n�����̘V�l#�V�N�w1_08";
		cloakonnpc "�Q�Ă�s�N#�V�N�w2_089";
		cloakonnpc "���̋C�̑����N#�ߌ��h";
		cloakonnpc "��C�ȐN#�����h1_093";
		cloakonnpc "�M���s�N#���폊����1_09";
		cloakonnpc "�ߌ��h�̎��#�ߌ��h2_08";
		cloakonnpc "�����h�̐N#�����h3_09";
		cloakonnpc "���a�ȘV�l#�V�N�w4_091";
		cutin "ep18_suad_01.png", 255;
		mes "^0000FF�]��c�̎Q���҂�";
		mes "�@�e�X���������Ƃ����Ȃ���";
		mes "�@���c��ޏo���Ă������]^000000";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�ӂ��c�c";
		mes "�ꎞ�͂ǂ��Ȃ邩�Ǝv��������";
		mes "�c�c�f���c�c�f�������B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�}�����A�X�A�h�B";
		mes "�������̉�c�ŋC�ɂȂ邱�Ƃ�����B";
		mes "�`���҂�����{�N�̘b�𕷂��ė~�����B";
		set EP18_1QUE,41;
		delquest 16572;
		setquest 16573;
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 41) {
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�~���A�����Ă�ł���ȁB";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 42) {
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�c�c����̌���";
		mes "���O�����ɔC����B";
		mes "�����́c�c����ȁB";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 38 || EP18_1QUE == 40)
		showevent 0, 1, "�X�A�h#1_079";
	else
		showevent 9999,0,"�X�A�h#1_079";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,148,153,3	script	�~���A��#1_080	10377,{/* 15913 (cloaking)*/
	if(EP18_1QUE == 39) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���c�̑O��";
		mes "�����Ȑl�̘b�𕷂��Ă݂���ǂ��H";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 40) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���c�̑O��";
		mes "�����Ȑl�̘b�𕷂��Ă݂���ǂ��H";
		next;
		mes "[�~���A��]";
		mes "�����B";
		mes "���낻��n�܂肻�����ˁB";
		mes "�X�A�h�ɐ����|���Ă݂āB";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 41) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�������̉�c�ŋC�ɂȂ邱�Ƃ�����B";
		mes "�}�����ƃX�A�h��";
		mes "�����C�t���Ȃ������H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���`�`�H";
		mes "�c�c���A����������";
		mes "�u���̕���v�̂��ƁH";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "���Ő������Ă��镨�ł͂Ȃ��ȁB";
		mes "���O�������������񂾂񂶂�Ȃ��̂��H";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "����ȕ����ȕ����������񂾂�͂��Ȃ��B";
		mes "����ɁA����ȌR�������悤�ȕ����";
		mes "��ʂɗ��ʂ��Ă��Ȃ���B";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "����Ȃ��̂��A�Ȃ����ɂ���H";
		mes "�~���A�����C�ɂ��Ă�̂�";
		mes "���̂��Ƃ��H";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "����B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�����Ɍ����΁A��������͗~�����B";
		mes "�����܂ŗ}�~�͂Ƃ��Ă���";
		mes "����������T�ł���K�v�͂���B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���̂������Ȃ�����ɂ݂����";
		mes "�\���ɗ}�~�͂ɂȂ肻���ȁc�c�B";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�����H";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "��k�����������Ă�ɂ͂Ȃ��񂾁B";
		mes "�X�A�h���c�����Ă��Ȃ����@�ő���";
		mes "�R�p�̕��킪����Ă��Ă���̂�";
		mes "�}�Y���Ǝv��Ȃ��H";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�f��������ɂ���";
		mes "����ȕ��킪��ʂɂ�������";
		mes "�����N���邩�킩��Ȃ���c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�c�c";
		mes "�c�c�~���A���̌����������Ƃ͗��������B";
		mes "��������Ȃ��Ƃ͖]��ł��Ȃ��B";
		mes "�ł́A�ǂ�����H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�X�A�h�����̌��œ����̂�";
		mes "���������������B";
		mes "�X�A�h�́A�f����؂�Ȃ��i�߂邽�߂�";
		mes "�v��Ə����ɐ�O���ׂ����B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�Ƃ����킯�ŁA���̌���";
		mes "���ƃ~���A���ɔC���ė~�����B";
		mes "�������A�`���җl�����݂���";
		mes "���������܂���ˁH";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�{�N�͕ʍs������点�Ă��炤��B";
		mes "�m�F���Ȃ��Ƃ����Ȃ����Ƃ����邩��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�~���A�������������Ȃ�A�d���Ȃ��B";
		mes "�ł́A�`���җl�B";
		mes "��قǕ���������Ă����l��";
		mes "�b�𕷂��ɂ����܂��傤�B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�ǂ����畐�����ɓ��ꂽ�̂�";
		mes "�m���߂��ł��B";
		mes "�S�z�͂���܂���B";
		mes "�����Ȃ�A���̏o�Ԃł���I";
		set EP18_1QUE,42;
		delquest 16573;
		setquest 16574;
		close2;
		cutin "ep18_suad_03.png", 255;
		cloakonnpc "�~���A��#1_080";
		cloakonnpc "�}����#1_082";
		end;
	}
	if(EP18_1QUE == 42) {//������
	}
	cutin "ep18_miriam_02.png", 0;
	mes "[�~���A��]";
	mes "�X�A�h���A�`���҂����";
	mes "���c�ɎQ�����Ă��ǂ�����";
	mes "�����Ă��ꂽ�񂾁B";
	next;
	mes "[�~���A��]";
	mes "���̃X�A�h���A�O�̐l�Ԃ���c��";
	mes "�Q��������Ȃ�āA�r�b�N�����B";
	mes "�c�c�X�A�h�������`���҂����";
	mes "��������̂�����̂��ȁB";
	close2;
	cutin "ep18_suad_03.png", 255;
	end;
OnQuestInfo:
	if(EP18_1QUE == 41)
		showevent 0, 1, "�~���A��#1_080";
	else
		showevent 9999,0,"�~���A��#1_080";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,148,145,3	script	�}����#1_081	10376,{/* 15914 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,149,152,3	script	�}����#1_082	10376,{/* 15915 (cloaking)*/
	if(EP18_1QUE == 39) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����ƁA�~���A���ƃX�A�h���{��̂�";
		mes "���͐Â��ɂ��Ă��܂���B";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 40) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����ƁA�~���A���ƃX�A�h���{��̂�";
		mes "���͐Â��ɂ��Ă��܂���B";
		next;
		mes "[�}����]";
		mes "���I";
		mes "��c���n�܂肻���ł��B";
		mes "�X�A�h�ɐ����|�����������B";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 41) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�~���A�����Ă�ł܂��ˁB";
		mes "�C�ɂȂ邱�Ƃ��ĉ��ł��傤���H";
		close2;
		cutin "ep18_suad_03.png", 255;
		end;
	}
	if(EP18_1QUE == 42) {//������
	}
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�ӂӂӁB";
	mes "�������`���җl�B";
	mes "�O�̐l�Ȃ̂ɑ��c�ɎQ���ł���Ȃ��";
	mes "����ς蕁�ʂ���Ȃ��ł��ˁB";
	next;
	mes "[�}����]";
	mes "�X�A�h�����ł�";
	mes "�Ȃ񂾂��񂾂ƌ����Ă܂���";
	mes "�`���җl�Ɋ��҂��Ă�ɈႢ����܂���B";
	close2;
	cutin "ep18_suad_03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,145,146,5	script	�M���N#�ߌ��h1_083	10397,{/* 15916 (cloaking)*/
	if(checkquest(16568)) {
		mes "[�M���N]";
		mes "�t���C���̐_�a��j�󂵂Ă��I";
		mes "���̒n���N�̕��Ȃ̂�";
		mes "�n�b�L�������Ă��񂾁I";
		next;
		mes "[�M���N]";
		mes "�����A���ׂ̈ɂ́u�́v���K�v���I";
		mes "�������ɂ͕��킪�K�v�Ȃ񂾁I";
		next;
		mes "[�M���N����]";
		mes "�����[���I";
		mes "�������͕����Ȃ��I";
		mes "�K�����I";
		unittalk getnpcid(0,"�ߌ��h�̎��#�ߌ��h2_082"),"�ߌ��h�̎�� : �撣��I";
		unittalk getnpcid(0,"�ߌ��h�̐N#�ߌ��h2_096"),"�ߌ��h�̐N : �����I�����I";
		unittalk getnpcid(0,"�����ȐN#�ߌ��h3_085"),"�����ȐN : ��΂ɕ����Ȃ��I";
		unittalk getnpcid(0,"���̋C�̑����N#�ߌ��h4_086"),"���̋C�̑����N : �撣��`�`�I";
		unittalk getnpcid(0,"�{�����N#�ߌ��h5_087"),"�{�����N : �ڂɂ��݂̂��Ă��I";
		next;
		mes "[�M���N]";
		mes "���������g�̋��ꏊ�����߂����߁I";
		mes "�����������ׂ��͖������I";
		delquest 16568;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : �b�𕷂��ĉ�����B���낻���c���n�܂邾�낤",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	mes "[�M���N]";
	mes "���̒n���N�̕��Ȃ̂�";
	mes "�n�b�L�������Ă��񂾁I";
	close;
OnQuestInfo:
	if(checkquest(16568))
		showevent 0, 1, "�M���N#�ߌ��h1_083";
	else
		showevent 9999,0,"�M���N#�ߌ��h1_083";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,147,148,3	script	�ߌ��h�̎��#�ߌ��h2_082	939,{/* 15917 (cloaking)*/
	unittalk "�ߌ��h�̎�� : �����I�@�����Ȃ���Ȃ��I";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,145,144,7	script	�����ȐN#�ߌ��h3_085	10398,{/* 15918 (cloaking)*/
	if(EP18_1QUE != 42)
		unittalk "�����ȐN : ���͉̂��������I";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,148,144,1	script	���̋C�̑����N#�ߌ��h4_086	10399,{/* 15919 (cloaking)*/
	unittalk "���̋C�̑����N : �z��̐_�a��j�󂵂悤�I";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,148,5	script	�{�����N#�ߌ��h5_087	10398,{/* 15920 (cloaking)*/
	unittalk "�{�����N : �z����쒀���Ă��I";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,139,148,5	script	�n�����̘V�l#�V�N�w1_088	10393,{/* 15921 (cloaking)*/
	if(checkquest(16569)) {
		mes "[�n�����̘V�l]";
		mes "���V�͐��܂�Ă����x��";
		mes "���𗣂ꂽ���Ƃ��Ȃ��B";
		mes "���̑��Ő��܂�A�炿�A�V�����B";
		next;
		mes "[�n�����̘V�l]";
		mes "��������Đ����Ă�����";
		mes "�������͖��������B";
		mes "�����牽�����悤�Ƃ����̂��H";
		next;
		mes "[�n�����̘V�l]";
		mes "�����ɂ���Ⴂ�O�̍l����";
		mes "�킩���ł��Ȃ���";
		mes "���l�����ɍs�����悤�Ƃ���̂Ȃ�";
		mes "���V��N��肪�|�߂˂΂Ȃ��B";
		delquest 16569;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : �b�𕷂��ĉ�����B���낻���c���n�܂邾�낤",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(16569))
		showevent 0, 1, "�n�����̘V�l#�V�N�w1_088";
	else
		showevent 9999,0,"�n�����̘V�l#�V�N�w1_088";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,140,150,5	script	�Q�Ă�s�N#�V�N�w2_089	10395,{/* 15922 (cloaking)*/
	unittalk "�Q�Ă�s�N : �ŋ߂̎�҂Ƃ�����c�c";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,138,145,7	script	���C�ȑs�N#�V�N�w3_090	10396,{/* 15923 (cloaking)*/
	unittalk "���C�ȑs�N : �l�����Z���I������B";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,141,146,7	script	���a�ȘV�l#�V�N�w4_091	945,{/* 15924 (cloaking)*/
	unittalk "���a�ȘV�l : �������̈ӌ��������Ă����˂΁c�c";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,150,147,1	script	�M���s�N#���폊����1_092	929,{/* 15925 (cloaking)*/
	if(checkquest(16570)) {
		mes "[�M���s�N]";
		mes "�您�I�@�悻�ҁI";
		mes "�����ْ�����Ȃ�I";
		mes "�ق�A�ꏏ�Ɉ�t��낤���I";
		next;
		switch(select("�������܂�","���������܂�")) {
		case 1:
			mes "[�M���s�N]";
			mes "���^�ʖڂ��Ȃ��A�����I";
			mes "����Ȃ�Ől���y���������H";
			mes "�܂��A������I";
			break;
		case 2:
			mes "[�M���s�N]";
			mes "���͂͂́I";
			mes "�悵�悵�A�������݂��Ղ肾�B";
			mes "�C�ɓ��������A�悻�ҁI";
			break;
		}
		next;
		mes "[�M���s�N]";
		mes "���c�ł́A�݂�Ȍ����������Ƃ������I";
		mes "����������񉓗��Ȃ��������I";
		mes "���O�������Ɖ��̈ӌ���";
		mes "�^�����Ă����͂����I";
		next;
		mes "[�M���s�N]";
		mes "�푈���I�@�ڏZ�̖����������I";
		mes "���͂͂́I";
		mes "�ق�A���Ă݂�A���̕�����I";
		mes "���������ăo�b�`���悧�I";
		next;
		mes "[�M���s�N]";
		mes "��̓��w���ɍs����";
		mes "�X���_�a���j�󂵂Ă��I";
		mes "���͂͂́I";
		delquest 16570;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : �b�𕷂��ĉ�����B���낻���c���n�܂邾�낤",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	mes "[�M���s�N]";
	mes "���c���Ă̂͂��Ղ�݂����Ȃ��񂾁I";
	mes "�����炢���ς����܂Ȃ���ȁI";
	mes "�����A���񂾈��񂾁`�I";
	close;
OnQuestInfo:
	if(checkquest(16570))
		showevent 0, 1, "�M���s�N#���폊����1_092";
	else
		showevent 9999,0,"�M���s�N#���폊����1_092";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,152,145,1	script	��C�ȐN#�����h1_093	931,{/* 15926 (cloaking)*/
	if(checkquest(16571)) {
		mes "[��C�ȐN]";
		mes "�������ő吺�グ�Ă�z���";
		mes "�ꏏ�ɂ��Ȃ��ł��������B";
		mes "������͂������������l����";
		mes "�����ł�̂��A�悭������܂���c�c�B";
		next;
		mes "[��C�ȐN]";
		mes "�{�C�ňڏZ�̖�������";
		mes "�|����Ǝv���Ă�񂶂�Ȃ��ł��傤�ˁH";
		mes "�����̐����A����̎���";
		mes "�������肷���܂���B";
		next;
		mes "[��C�ȐN]";
		mes "�ǂ����āA���������C�Ȕ������ł���̂�";
		mes "�c�c�����B";
		mes "�ŋ߁A������������l�Ԃ������Ă܂���";
		mes "�Ղ̈Ђ��؂�ς��Ă���c�c�B";
		delquest 16571;
		if(!checkquest(16568) && !checkquest(16569) && !checkquest(16570) && !checkquest(16571)) {
			unittalk getcharid(3),strcharinfo(0)+" : �b�𕷂��ĉ�����B���낻���c���n�܂邾�낤",1;
			set EP18_1QUE,40;
			setquest 16572;
		}
		close;
	}
	mes "[��C�ȐN]";
	mes "�������ő吺�グ�Ă�z���";
	mes "�ꏏ�ɂ��Ȃ��ł��������B";
	close;
OnQuestInfo:
	if(checkquest(16571))
		showevent 0, 1, "��C�ȐN#�����h1_093";
	else
		showevent 9999,0,"��C�ȐN#�����h1_093";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,154,146,1	script	�����ȐN#�����h2_094	10398,{/* 15927 (cloaking)*/
	unittalk "�����ȐN : �c�c�B";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,151,150,1	script	�����h�̐N#�����h3_095	10397,{/* 15928 (cloaking)*/
	unittalk "�����h�̐N : ���͒N�̈ӌ��ɂ��^�����܂���B�F�A�v��������ĂȂ��B";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,145,7	script	�ߌ��h�̐N#�ߌ��h2_096	934,{/* 15929 (cloaking)*/
	if(EP18_1QUE == 42) {
		cloakonnpc "�X�A�h#1_079";
		cloakonnpc "�~���A��#1_080";
		cloakonnpc "�}����#1_082";
		cloakoffnpc "�}����#1_081";
		mes "[�ߌ��h�̐N]";
		mes "�������̌������H";
		mes "���c�ł��̕������������";
		mes "�S�������܂�������";
		mes "���̂��Ƃ����Ă����񂾂��I";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�����I";
		mes "�܂��ɂ���ł��I";
		mes "���傤�ǂ��̃J�b�R�C�C����ɂ���";
		mes "�������������Ǝv����";
		mes "�����|�������Ă��炢�܂����B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[�ߌ��h�̐N]";
		mes "�J�b�R�C�C���āH";
		mes "�ււ��A�������낻������I";
		mes "�����̐g�����邵�I";
		mes "���l�ɂ������ł������ȁI";
		next;
		mes "[�����ȐN]";
		mes "������I";
		mes "���̕�����������";
		mes "�_�a�̓z����r�r����";
		mes "�������Ɏ�o���ł��˂���I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "��������ȕ��킪�~������ł�����";
		mes "�ǂ���������ɓ���邱�Ƃ�";
		mes "�ł����ł��傤�B";
		mes "���Ћ����Ă��炦�܂��񂩁H";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[�ߌ��h�̐N]";
		mes "�ӂ��`�`��A�ǂ����悤���Ȃ��`�B";
		mes "����������J���Ď�ɓ��ꂽ�񂾁B";
		mes "�ȒP�ɂ͋������˂���Ȃ��H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�ӂށc�c���ł���Έ�x��";
		mes "�������񕐊�𑺂Ɏ����ė���܂��B";
		mes "�f�����s���O�ɂ������񕐊��";
		mes "�~�����ł���ˁH";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[�ߌ��h�̐N]";
		mes "����Ⴛ�����B";
		mes "����΂��邾���ǂ�����ȁI";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�M���̂������ő��ɂ�������";
		mes "���킪�������ꂽ�ƂȂ�΁c�c";
		mes "�M���͂܂��ɑ��̋~����ƂȂ�ł��傤�I";
		mes "���́A���̂���`�����������̂ł��B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[�ߌ��h�̐N]";
		mes "�������̑��̋~���傩���I";
		mes "�łւււց`�I";
		mes "����Ⴀ�����I";
		mes "�悵�悵�A����Ȃ狳���Ă���I";
		next;
		mes "[�ߌ��h�̐N]";
		mes "���w���̊X�ŏ������Ă���";
		mes "�u^0000FF�q�Q�V�W���b�N^000000�v���Ă̂����邩��";
		mes "�u^FF0000�L���^���|�|^000000�v�𔃂��ɂ�������";
		mes "�`����񂾁B";
		next;
		mes "[�����ȐN]";
		mes "�u^FF0000�L���^���|�|^000000�v�����I";
		mes "�ւ��ւ��ցI";
		mes "�ԈႦ��񂶂�˂����B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���肪�Ƃ��������܂��I";
		mes "�@";
		mes "�ӂށB�ǂ�����x�A";
		mes "���w���ɖ߂�K�v������܂��ˁB";
		set EP18_1QUE,43;
		delquest 16574;
		setquest 16575;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP18_1QUE == 43) {
		mes "[�ߌ��h�̐N]";
		mes "���w���̊X�ŏ������Ă���";
		mes "�u^0000FF�q�Q�V�W���b�N^000000�v���Ă̂����邩��";
		mes "�u^FF0000�L���^���|�|^000000�v�𔃂��ɂ�������";
		mes "�`����񂾁B";
		next;
		mes "[�����ȐN]";
		mes "�u^FF0000�L���^���|�|^000000�v�����I";
		mes "�ւ��ւ��ցI";
		mes "�ԈႦ��񂶂�˂����B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���肪�Ƃ��������܂��I";
		mes "�@";
		mes "�ӂށB�ǂ�����x�A";
		mes "���w���ɖ߂�K�v������܂��ˁB";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "�]���w���֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��̓��w���֌��������]";
		close2;
		warp "rachel.gat", 75, 39;
		end;
	}
	mes "[�ߌ��h�̐N]";
	mes "���ꂮ�炢�̕��킪�Ȃ���";
	mes "���S�Ƃ͌����Ȃ�����ȁB";
	mes "���_�a�ɂ��������ڏZ�̖���";
	mes "�������ɂ͎���o���Ȃ����I";
	close;
OnQuestInfo:
	if(EP18_1QUE == 42 || EP18_1QUE == 43)
		showevent 0, 1, "�ߌ��h�̐N#�ߌ��h2_096";
	else
		showevent 9999,0,"�ߌ��h�̐N#�ߌ��h2_096";
	end;
OnInit:
	cloakonnpc;
	end;
}

rachel.gat,72,42,3	script	�}����#1_082_2	10376,{/* 15930 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,75,44,3	script	�q�Q�V�W���b�N#���폤�l	928,{/* 15931 */
	if(EP18_1QUE == 43) {
		mes "[�q�Q�V�W���b�N]";
		mes "���w���ŕ�������T���Ȃ�";
		mes "�u�q�Q�V�W���b�N�v�̓X����Ԃ��I";
		mes "���̓X�������A�I���̂��ׂāI";
		mes "�����A������茩�Ă����Ă���I";
		next;
		cloakoffnpc "�}����#1_082_2";
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���̕����u�q�Q�V�W���b�N�v�����";
		mes "�悤�ł��ˁc�c";
		mes "���āc�c�Ȃ񂾂������ȁH";
		mes "�`����ׂ����t���������Ǝv���܂����B";
		next;
		switch(select("�L���C��","�L���^���|�|","�ǂ�����̌C��","�ǂ�����̃^���|�|")) {
		case 1:
			cutin "ep18_maram_01.png", 255;
			mes "[�q�Q�V�W���b�N]";
			mes "���̌C�����~�����̂����H";
			mes "���傤���˂����Ȃ��c�c";
			mes "�����I";
			mes "����Ⴀ�A�Ȃ��Ȃ��c�c�B";
			next;
			cutin "ep18_maram_03.png", 2;
			mes "[�}����]";
			mes "�ŁA�o�����܂��傤�I";
			close2;
			cutin "ep18_maram_01.png", 255;
			cloakonnpc "�}����#1_082_2";
			end;
		case 2:
			cutin "ep18_maram_01.png", 255;
			mes "[�q�Q�V�W���b�N]";
			mes "�Ȃ��`�񂾁B";
			mes "�u�L���^���|�|�v�������]���Ă킯���B";
			mes "���Ⴀ�A���ꂪ�炢�Ă���ꏊ��";
			mes "�����Ă�낤�B";
			next;
			mes "[�q�Q�V�W���b�N]";
			mes "�u�x�C���X�v�̊X�̖k����";
			mes "���폤�l������B";
			mes "�����ɉ������";
			mes "������̏Љ�ŗ����ƌ����񂾁B";
			next;
			mes "[�q�Q�V�W���b�N]";
			mes "�s���Ȃ�A�}�����ق����������B";
			mes "�݌ɂ��J�����瑫��􂤂���";
			mes "�����Ă�����ȁB";
			mes "���Ⴀ�ȁI";
			set EP18_1QUE,44;
			delquest 16575;
			setquest 16576;
			close2;
			cutin "ep18_maram_01.png", 255;
			cloakonnpc "�}����#1_082_2";
			end;
		case 3:
			cutin "ep18_maram_01.png", 255;
			mes "[�q�Q�V�W���b�N]";
			mes "�����̓X�ł͌C���͔����ĂȂ����H";
			mes "�������Ȃ񂾂��B";
			close2;
			cloakonnpc "�}����#1_082_2";
			end;
		case 4:
			cutin "ep18_maram_01.png", 255;
			mes "[�q�Q�V�W���b�N]";
			mes "���������͉̂ԉ��ɍs����";
			mes "�T���Ă���Ȃ����H";
			close2;
			cloakonnpc "�}����#1_082_2";
			end;
		}
	}
	if(EP18_1QUE == 44) {
		mes "[�q�Q�V�W���b�N]";
		mes "�u�x�C���X�v�̊X�̖k����";
		mes "���폤�l������B";
		mes "�����ɉ������";
		mes "������̏Љ�ŗ����ƌ����񂾁B";
		next;
		mes "�]�x�C���X�֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��̓x�C���X�֌��������]";
		close2;
		warp "veins.gat", 288, 277;
		end;
	}
	mes "[�q�Q�V�W���b�N]";
	mes "���w���ŕ�������T���Ȃ�";
	mes "�u�q�Q�V�W���b�N�v�̓X����Ԃ��I";
	mes "���̓X�������A�I���̂��ׂāI";
	mes "�����A������茩�Ă����Ă���I";
	close;
OnQuestInfo:
	if(EP18_1QUE == 43 || EP18_1QUE == 44)
		showevent 0, 1, "�q�Q�V�W���b�N#���폤�l";
	else
		showevent 9999,0,"�q�Q�V�W���b�N#���폤�l";
	end;
}

veins.gat,289,281,7	script	�}����#1_082_3	10376,{/* 16054 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
veins.gat,293,282,3	script	�_���f����#���폤_�x�C���X	943,{/* 16055 */
	if(EP18_1QUE == 44) {
		cloakoffnpc "�}����#1_082_3";
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����ɂ��́B";
		mes "����𔄂��ė~������ł����ǁ`�B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�_���f����]";
		mes "�c�c�A��B";
		mes "�����X���B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�W���b�N����̏Љ��";
		mes "�����ɗ�����ł����ǂˁB";
		mes "���A���������āu�L���^���|�|�v����";
		mes "�����̂́c�c�B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�_���f����]";
		mes "�N���L�����ƁI";
		mes "�W���b�N�̖�Y�A�ӂ����������t��";
		mes "�l���₪���āI";
		mes "�������A���ɉ��̗p���I";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�������������܂�����ˁH";
		mes "����𔃂��ɗ�����ł��B";
		mes "�������A��ʂɂ͏o����Ă��Ȃ�";
		mes "����ł��B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�_���f����]";
		mes "�c�c��~�����񂾁H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����΂��邾���B";
		mes "�����c�c�ꍑ�̌R���Ɛ킦�邮�炢��";
		mes "�ʂ��~�����ł��ˁB";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�_���f����]";
		mes "������c�c";
		mes "�푈�ł��n�߂���肩�H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����Ă��ǂ��ł����c�c";
		mes "���̏�������܂��܂�����";
		mes "�􂦂Ȃ��Ȃ�܂���H";
		next;
		mes "[�}����]";
		mes "�m���Ă܂���H";
		mes "�݌ɂ��J������";
		mes "����􂤂���Ȃ�ł���ˁH";
		mes "�܂��A�B��ăR�\�R�\����Ă�";
		mes "���o�`�C�����ł�����ˁB";
		next;
		mes "[�}����]";
		mes "���I";
		mes "���������΂��������炱�̕ӂ��";
		mes "�x���̐l������";
		mes "�������񂤂���Ă܂�����H";
		mes "���������āc�c�C�t���ꂽ�񂶂�H";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�_���f����]";
		mes "�c�c���A�������҂��̂��肾�����񂾁I";
		mes "�����ɑ���􂤂��肾�����I";
		mes "�ŁA�ł����������Ȃ�";
		mes "���O�̑���ɂȂ郄�c��";
		mes "�A��ė������Č����Ă�񂾁I";
		next;
		mes "[�_���f����]";
		mes "���ꂪ�ł��Ȃ��Ȃ�";
		mes "����𑱂�����āc�c";
		mes "�ŁA�ł��A���̒m�荇����";
		mes "����ȃ��o�������������p���ł����";
		mes "���c�͈�l�����Ȃ��āc�c";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�������̎���������p��";
		mes "�Ƃ����̂͂ǂ��ł����H";
		mes "�Ȃ�Ȃ�A�萔�������x�������܂���B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�_���f����]";
		mes "�فA�{����!?";
		mes "�������炦�đ����􂦂�Ȃ�";
		mes "������芐�����肾�I";
		next;
		mes "[�_���f����]";
		mes "�g�[���ΎR���I";
		mes "�����ɔ閧��n��������";
		mes "�������畐�킪����������Ă�B";
		mes "�ق�A���̃��������������čs���I";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���肪�Ƃ��������܂��B";
		mes "�ł́A���̏��؎���ǂ����B";
		mes "���݂����̂����͔閧�ɂ��܂��傤�B";
		mes "��낵���ł��ˁH";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�ӂށB";
		mes "�g�[���ΎR�̔閧��n�c�c";
		mes "����̏o���𒲂ׂɗ��܂�����";
		mes "�������{���ł����ˁB";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "��l�ňꏏ�ɍs������Ɩڗ����܂�����";
		mes "��������o���o���ɍs������";
		mes "�g�[���ΎR�ŗ��������܂��傤���B";
		set EP18_1QUE,45;
		delquest 16576;
		setquest 16577;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�}����#1_082_3";
		end;
	}
	//47�܂œ]���H
	if(EP18_1QUE >= 45 && EP18_1QUE <= 47) {
		cloakoffnpc "�}����#1_082_3";
		mes "[�_���f����]";
		mes "���͂������������񂾁B";
		mes "�����m���I";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�ӂށB";
		mes "�g�[���ΎR�̔閧��n�c�c";
		mes "����̏o���𒲂ׂɗ��܂�����";
		mes "�������I���_�ł��傤���B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "��l�ňꏏ�ɍs������Ɩڗ����܂�����";
		mes "��������o���o���ɍs������";
		mes "�g�[���ΎR�ŗ��������܂��傤���B";
		next;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�}����#1_082_3";
		mes "�]�g�[���ΎR�֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��̓g�[���ΎR�֌��������]";
		close2;
		warp "thor_v01.gat", 164, 164;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 44 && EP18_1QUE <= 47)
		showevent 0, 1, "�_���f����#���폤_�x�C���X";
	else
		showevent 9999,0,"�_���f����#���폤_�x�C���X";
	end;
}

thor_v01.gat,169,169,0	script	#ep180_maram	139,14,14,{/* 16183 */
	if(EP18_1QUE >= 45)
		cloakoffnpc "�}����#�R����n-�閧�ʘH";
	end;
}
thor_v01.gat,169,169,3	script	�}����#�R����n-�閧�ʘH	10376,{/* 16184 (cloaking)*/
	if(EP18_1QUE >= 45 && EP18_1QUE <= 47) {
		cutin "ep18_maram_02.png", 0;
		mes "[�}����]";
		mes strcharinfo(0)+"�l�I";
		mes "�������ł��A�������I";
		mes "�ΎR�ɂ����n�ɒʂ���";
		mes "�������������ł��B";
		close2;
		cutin "ep18_maram_02.png", 255;
		warp "que_thr.gat", 181, 53;
		end;
	}
	if(EP18_1QUE == 48) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���ƃ~���A���̓��w���ɖ߂�܂��B";
		mes "�`���җl�́A���̊�n����s���ȕ��킪";
		mes "���o���Ă������Ƃ�";
		mes "�X�A�h�ɓ`���Ă��炦�܂����B";
		close2;
		cutin "ep18_maram_01.png", 255;
		warp "wolfvill.gat", 145, 109;
		end;
	}
	if(EP18_1QUE >= 48) {
		cutin "ep18_maram_02.png", 0;
		mes "[�}����]";
		mes "�����C�ɂȂ邱�Ƃ�������";
		mes "�����𑱂��Ă��ł��B";
		mes "���������āA"+strcharinfo(0)+"�l���A";
		mes "��n�ɂ��c�������Ƃ�����܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�}����]";
			mes "�����ł����B";
			mes "���͂������������𑱂��܂��ˁB";
			close2;
			cutin "ep18_maram_02.png", 255;
			end;
		}
		mes "[�}����]";
		mes "�����ł������B";
		mes "��n�ɒʂ��锲�����͂�����ł��B";
		close2;
		cutin "ep18_maram_02.png", 255;
		warp "que_thr.gat", 181, 53;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 45)
		showevent 0, 1, "�}����#�R����n-�閧�ʘH";
	else
		showevent 9999,0,"�}����#�R����n-�閧�ʘH";
	end;
OnInit:
	cloakonnpc;
	end;
}
que_thr.gat,186,58,0	warp	#�閧�ʘH-�R����n	2,2,thor_v01.gat,164,167

que_thr.gat,133,53,5	script	�}����#�R����n1_101	10376,{/* 15932 */
	if(EP18_1QUE == 45) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�`���җl�I";
		mes "������ł��I";
		mes "�閧��n��l�q���f���Ă��܂�����";
		mes "�������{���ŊԈႢ�Ȃ������ł��B";
		next;
		mes "[�}����]";
		mes "���ɓ����āA�����������Ƃ���ł���";
		mes "���Ȃ�x�������d�ł��B";
		mes "�T�d�ɍs�����Ȃ��Ƃ����܂���B";
		next;
		mes "[�}����]";
		mes "�N�����鏀���͂ł��Ă��܂����H";
		mes "�����A��肭�����Ȃ��Ă�";
		mes "���������蒼���Α��v�ł��B";
		set EP18_1QUE,46;
		delquest 16577;
		setquest 16578;
	}
	else if(EP18_1QUE <= 47) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�N�����鏀���͂ł��Ă��܂����H";
		mes "�����A��肭�����Ȃ��Ă�";
		mes "���������蒼���Α��v�ł��B";
	}
	else {
		mes "[�C���t�H���[�V����]";
		mes "���Ɂu�g�[���R����n�v��";
		mes "�N���A���Ă���L�����N�^�[�́A";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u�g�[���R����n�v��";
		mes "����ł��܂��B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u�g�[���R����n�v��";
		mes "���ꂵ�܂����H";
	}
	next;
	if(mdopenstate("Thor military base") || getpartyleader(getcharid(1)) != strcharinfo(0) || EP18_1QUE >= 49) {
		set '@menu$,"�u�g�[���R����n�v����";
	}
	else {
		set '@menu$,"�u�g�[���R����n�v(Thor military base)�̍쐬";
	}
	next;
	if(select("��߂�",'@menu$) == 1) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�������o�����琺�������Ă��������ˁB";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(mdopenstate("Thor military base")) {
		if(EP18_1QUE >= 49) {
			mes "[�C���t�H���[�V����]";
			mes "�u�g�[���R����n�v�֓��ꂵ�܂��B";
			close2;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				mes "[�C���t�H���[�V����]";
				mes "���Ɂu�g�[���R����n�v��";
				mes "�N���A���Ă���L�����N�^�[�́A";
				mes "�p�[�e�B���[�_�[�Ƃ���";
				mes "����ł��܂���B";
				close;
			}
		}
		switch(mdenter("Thor military base")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[Thor military base] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			donpcevent getmdnpcname("ThorMilitaryBaseControl1")+ "::OnStart";
			//warp "1@tcamp.gat", 103, 237;
			close;
		case 1:	// �p�[�e�B�[������
			cutin "ep18_maram_01.png", 2;
			mes "[�}����]";
			mes "����H";
			mes "�p�[�e�B�[���������Ă��܂���ˁB";
			mes "^FF0000�p�[�e�B�[������A^000000";
			mes "^FF0000�܂���b���Ă��������B^000000";
			next;
			cutin "ep18_maram_01.png", 255;
			mes "[�C���t�H���[�V����]";
			mes "�p�[�e�B�[�ɉ������Ă��Ȃ�����";
			mes "����ł��܂���B";
			close;
		case 2:	// �_���W�������쐬
			cutin "ep18_maram_01.png", 2;
			mes "[�}����]";
			mes "�܂��p�[�e�B�[�̃��[�_�[��";
			mes "�_���W�����𐶐����Ă��Ȃ��悤�ł��B";
			mes "���΂炭���Ă���A�m�F���Ă��������B";
			next;
			cutin "ep18_maram_01.png", 255;
			mes "[�C���t�H���[�V����]";
			mes "�Ώۂ̃������A���_���W������";
			mes "�쐬����Ă��Ȃ�����";
			mes "����ł��܂���B";
			close;
		default:	// ���̑��G���[
			close;
		}
	}
	else {
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			cutin "ep18_maram_01.png", 255;
			mes "[�C���t�H���[�V����]";
			mes "�p�[�e�B�[���[�_�[�̂�";
			mes "�������A���_���W������";
			mes "�쐬���邱�Ƃ��ł��܂��B";
			close;
		}
		mdcreate "Thor military base";
		cutin "ep18_maram_01.png", 255;
		mes "���p�[�e�B�[��";
		mes "^0000ff"+strcharinfo(1)+"^000000";
		mes "���p�[�e�B�[���[�_�[";
		mes "^0000ff"+strcharinfo(0)+"^000000";
		mes "�@";
		mes "^006400Thor military base^000000�̍쐬�\�����󂯕t���܂��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�\��������������";
		mes "���ɘb��������";
		mes "^0000CD�g�[���R����n�֓���^000000��";
		mes "�I�����Ă��������B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnQuestInfo:
	if(EP18_1QUE >= 45 && EP18_1QUE <= 47)
		showevent 0, 1, "�}����#�R����n1_101";
	else
		showevent 9999,0,"�}����#�R����n1_101";
	end;
}
wolfvill.gat,140,112,0	script	#sms01_102	139,14,14,{/* 15933 */
	if(EP18_1QUE == 48 || EP18_1QUE == 49) {
		cloakoffnpc "�X�A�h#sms01_103";
		unittalk getnpcid(0,"�X�A�h#sms01_103"),"�X�A�h : �c�c�B";
	}
	end;
}
wolfvill.gat,140,112,5	script	�X�A�h#sms01_103	10378,{/* 15934 (cloaking)*/
	if(EP18_1QUE == 48) {
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�`���҂��c�c";
		mes "�}�����͂ǂ������H";
		mes "�ꏏ�ł͂Ȃ������̂��H";
		next;
		menu "����̉������ɂ��ē`����",-;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "���������킾�Ǝv���Ă�����";
		mes "�g�p�����؂�̕��킾�������c�c";
		mes "����Ȋ댯�Ȃ��̂��g����ɂ͂����Ȃ��B";
		next;
		mes "[�X�A�h]";
		mes "����ɂ��Ă�";
		mes "�R������ł����Ƃ͂ȁB";
		mes "���ꂪ�������̑��ɉ^�΂�āc�c";
		mes "�c�c�������ӓI�Ȃ��̂�������B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�܂��A�[���l���Ă��d�����Ȃ��B";
		mes "����������̗��������܂��";
		mes "���C����ȓz���";
		mes "�����͑�l�����Ȃ邾�낤�B";
		next;
		cloakoffnpc "�~���A��#sms01_104";
		cloakoffnpc "�}����#sms01_105";
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�X�A�h�H�`�`�I�@�X�A�h�A�X�A�h�b!!";
		mes "�����`�����ɂ����̂��I";
		mes "��ςȂ��Ƃ��N���āc�c";
		mes "����ő�ςȂ��Ƃ��N�����񂾁I";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "���������z���c�c";
		mes "�����N�����H";
		mes "���������Ęb���B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�{�N�����������B";
		mes "�c�c���w���̑������P��ꂽ�B";
		mes "�Ɛl�́A���̑��̏Z�����B";
		next;
		cutin "ep18_suad_04.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�Ȃ񂾂ƁH";
		mes "�؋��͂���̂��H";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "���������ꂽ���킪�g���Ă����B";
		mes "����ɁA��������D�����ו���";
		mes "���̑��ɉ^�э��񂾂炵���B";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "���̂Ƃ���ɂ�";
		mes "�����񍐂����Ă��Ȃ��B";
		mes "�������c�c�}�Y�C�ȁB";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�c�c���w���̊X�̓�����";
		mes "�ǂ��Ȃ��Ă���H";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�ǂ��Ȃ��B";
		mes "�X�̑��������Z���ɏP��ꂽ���Ęb��";
		mes "���łɒm��n���Ă�B";
		mes "���X���Z���ւ̊���������Ă�����";
		mes "���̊�����B���Ȃ��l�����炩�ɑ������B";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "���}�Ɋm�F���K�v���B";
		mes "�P�����̂́c�c";
		mes "���̕���������Ă��z�炩�c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�b���m���Ȃ�A�D�����ו���������";
		mes "���ɖ߂��Ă��Ă���͂��B";
		mes "�T���o���āA�b�𕷂��B";
		set EP18_1QUE,49;
		delquest 16580;
		setquest 17517;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�}����#sms01_105";
		cloakonnpc "�~���A��#sms01_104";
		end;
	}
	if(EP18_1QUE == 49) {
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "��������D�����ו���������";
		mes "�z��͑��ɖ߂��Ă��Ă���͂��B";
		mes "�T���o���āA�b�𕷂��B";
		next;
		cutin "ep18_suad_01.png", 255;
		mes "�]�Ɛl��{���Ɍ������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��͔Ɛl��{���Ɍ��������]";
		close2;
		warp "wolfvill.gat", 123, 250;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 48 || EP18_1QUE == 49)
		showevent 0, 1, "�X�A�h#sms01_103";
	else
		showevent 9999,0,"�X�A�h#sms01_103";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,142,109,1	script	�~���A��#sms01_104	10377,{/* 15935 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,143,110,1	script	�}����#sms01_105	10376,{/* 15936 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,132,256,1	script	���D�i#sms01_106	10250,{/* 15937 */}
wolfvill.gat,131,258,1	script	���D�i#sms02_107	10250,{/* 15938 */}
wolfvill.gat,132,258,1	script	���D�i#sms03_108	10250,{/* 15939 */}
wolfvill.gat,131,257,1	script	���D�i#sms04_109	10250,20,20,{/* 15940 */
	if(EP18_1QUE == 49) {
		cloakoffnpc "�X�A�h#sms02_113";
		cloakoffnpc "�}����#sms02_115";
		cloakoffnpc "�~���A��#sms02_114";
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�������c�c";
		mes "��������D��ꂽ�ו����B";
		next;
		cutin "ep18_maram_03.png", 255;
		cloakoffnpc "���}�N�X#sms01_110";
		cloakoffnpc "�N�[��#sms01_111";
		cloakoffnpc "���s#sms01_112";
		emotion 1,"���}�N�X#sms01_110";
		mes "[���}�N�X]";
		mes "�������̐험�i�����ɗ����̂��H";
		mes "���I";
		mes "�X�A�h�����Ă����I";
		mes "�������`����I";
		next;
		mes "[�N�[��]";
		mes "�ւ��ւ��ցI�@���킪�����";
		mes "����ȕ��ɊX�̓z�炩��";
		mes "�ו���D�����Ƃ��ł���񂾁I";
		next;
		mes "[���s]";
		mes "�J�߂Ă���Ă�������`�H";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[�X�A�h]";
		mes "�ӂ�����ȁB";
		mes "���O�����c�c���������������̂�";
		mes "�������Ă�̂��H";
		next;
		mes "[�X�A�h]";
		mes "���O�����̏���ȍs���ɂ����";
		mes "�������̗��ꂪ";
		mes "����܂łɂȂ��������Ă���B";
		mes "�ڏZ�̖���";
		mes "�ǂ�����Ęa��������肾�H";
		next;
		cutin "ep18_suad_01.png", 255;
		mes "[���}�N�X]";
		mes "�z��͂���܂ŉ���������";
		mes "���񂴂�D���Ă����񂾁B";
		mes "������Ƃ��Ԃ���������";
		mes "�����������؍����͂Ȃ��ˁI";
		next;
		mes "[�N�[��]";
		mes "����Ɂ`�X�A�h�������Ɗ�ԂƎv����H";
		mes "�Ȃɂ��u�A�[�}�b�h����v�̓z�炩��";
		mes "�ו���D���ė����񂾂��炳�`�B";
		emotion 0,"�X�A�h#sms02_113";
		emotion 23,"�~���A��#sms02_114";
		emotion 23,"�}����#sms02_115";
		next;
		cutin "ep18_suad_04.png", 1;
		mes "[�X�A�h]";
		mes "�ȂɁc�c!?";
		next;
		cutin "ep18_suad_04.png", 255;
		mes "[�N�[��]";
		mes "�������Ȃ������H";
		mes "�u�A�[�}�b�h����v����I";
		mes "�X�A�h��{�q�ɂ���������";
		mes "�S�~�̂悤�Ɉ������A�[�}�b�h����I";
		next;
		mes "[���s]";
		mes "���̑��ɗ����̂�";
		mes "���e���瓦����ׂ�������ł���H";
		mes "���̑�������ɕ��Q�ł����񂾂���";
		mes "�����Ɗ��ł����I";
		next;
		mes "[���}�N�X]";
		mes "�{���̓X�A�h���A�[�}�b�h�̓z���";
		mes "���Q�������Ǝv���Ă��񂾂�H";
		mes "���̕��킳������΁`";
		mes "�u�́v���������";
		mes "�S�ĉ����ł���񂾁[�I";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�c�c�B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�X�A�h�c�c�H";
		set EP18_1QUE,50;
		delquest 17517;
		setquest 17518;
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	if(EP18_1QUE == 50) {
		cloakoffnpc "�X�A�h#sms02_113";
		cloakoffnpc "�}����#sms02_115";
		cloakoffnpc "�~���A��#sms02_114";
		cloakoffnpc "���}�N�X#sms01_110";
		cloakoffnpc "�N�[��#sms01_111";
		cloakoffnpc "���s#sms01_112";
		cloakonnpc "�Z��#sms01_116";
		cloakonnpc "�Z��#sms02_117";
		cloakonnpc "�Z��#sms03_118";
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 49)
		showevent 0, 1, "���D�i#sms04_109";
	else
		showevent 9999,0,"���D�i#sms04_109";
	end;
OnTouch:
	if(EP18_1QUE == 49) {
		cloakoffnpc "�X�A�h#sms02_113";
		cloakoffnpc "�}����#sms02_115";
		cloakoffnpc "�~���A��#sms02_114";
		cloakonnpc "���}�N�X#sms01_110";
		cloakonnpc "�N�[��#sms01_111";
		cloakonnpc "���s#sms01_112";
		cloakonnpc "�Z��#sms01_116";
		cloakonnpc "�Z��#sms02_117";
		cloakonnpc "�Z��#sms03_118";
	}
	else if(EP18_1QUE == 50) {//	������
		cloakoffnpc "�X�A�h#sms02_113";
		cloakoffnpc "�}����#sms02_115";
		cloakoffnpc "�~���A��#sms02_114";
		cloakoffnpc "���}�N�X#sms01_110";
		cloakoffnpc "�N�[��#sms01_111";
		cloakoffnpc "���s#sms01_112";
		cloakonnpc "�Z��#sms01_116";
		cloakonnpc "�Z��#sms02_117";
		cloakonnpc "�Z��#sms03_118";
	}
	else if(EP18_1QUE == 51) {
		cloakonnpc "�X�A�h#sms02_113";
		cloakonnpc "�}����#sms02_115";
		cloakonnpc "�~���A��#sms02_114";
		cloakoffnpc "���}�N�X#sms01_110";
		cloakonnpc "�N�[��#sms01_111";
		cloakonnpc "���s#sms01_112";
		cloakonnpc "�Z��#sms01_116";
		cloakonnpc "�Z��#sms02_117";
		cloakonnpc "�Z��#sms03_118";
	}
	end;
}
wolfvill.gat,131,252,3	script	���}�N�X#sms01_110	21292,{/* 15941 (cloaking)*/
	if(EP18_1QUE == 50) {
		cloakoffnpc "�X�A�h#sms02_113";
		cloakoffnpc "�}����#sms02_115";
		cloakoffnpc "�~���A��#sms02_114";
		cloakoffnpc "�N�[��#sms01_111";
		cloakoffnpc "���s#sms01_112";
		cloakonnpc "�Z��#sms01_116";
		cloakonnpc "�Z��#sms02_117";
		cloakonnpc "�Z��#sms03_118";
		mes "[���}�N�X]";
		mes "���̕��킳������΁`";
		mes "���Q�����Đ�����������I";
		mes "�X�A�h�����Ė{����";
		mes "���́u�́v���~�����񂾂�H";
		mes "�������̂��ƔF�߂Ă����`�H";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�c�c�B";
		next;
		cutin "ep18_suad_02.png", 255;
		mes "^0000FF�]�X�A�h���ق荞��ł���Ԃ�";
		mes "�@�����𕷂����Z��������";
		mes "�@���X�ƏW�܂��ė����]^000000";
		cloakoffnpc "�Z��#sms01_116";
		cloakoffnpc "�Z��#sms02_117";
		cloakoffnpc "�Z��#sms03_118";
		next;
		mes "[�Z��]";
		mes "�X�̑������P���������ĕ��������I";
		mes "�ǂ�������I";
		next;
		mes "[�Z��]";
		mes "���킳�������";
		mes "�����������Ă�����Ă��Ƃ��I";
		next;
		mes "[���}�N�X]";
		mes "�����������ƁI";
		mes "���ہA�����̓z�����������";
		mes "�ȒP���������I";
		next;
		mes "[�Z��]";
		mes "�]���Ă镐��͖����̂��H";
		mes "����������`�����I";
		mes "���������A������ςȂ��̐����ɂ�";
		mes "���񂴂肵�Ă�������ȁI";
		unittalk getnpcid(0,"�Z��#sms02_117"),"�Z�� : �������I�������I";
		unittalk getnpcid(0,"�Z��#sms01_116"),"�Z�� : �������ɂ��ł���I";
		unittalk getnpcid(0,"���}�N�X#sms01_110"),"���}�N�X : ���낤�H�@�I�������Ɏ��������I";
		unittalk getnpcid(0,"�N�[��#sms01_111"),"�N�[�� : ���܂ł���Ȑ����𑗂���肾�H";
		unittalk getnpcid(0,"���s#sms01_112"),"���s : �������I";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�}�Y�C�ȁB";
		mes "������������̗�����";
		mes "�~�߂悤�Ƃ����̂�";
		mes "���̂܂܂���ނ炪�\�k�����Ă��܂��B";
		mes "�X�A�h�I";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�}�����H";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "���̎��Ԃ����E�ł���̂�";
		mes "���̑��̃��[�_�[�ł���X�A�h�A";
		mes "�L�~�������B";
		next;
		mes "[�}����]";
		mes "�X�A�h���ǂ�ȂɃc���C�ڂɑ������̂�";
		mes "�����m���Ă���B";
		mes "�A�[�}�b�h��������ނ̂������͂Ȃ��B";
		mes "�����ǁc�c�B";
		next;
		mes "[�}����]";
		mes "���A�u�́v�ɗ��邱�Ƃ����ۂ���";
		mes "�ނ�̑����𗯂߂Ȃ����";
		mes "�ڏZ�̖��̋T���";
		mes "����I�ɂȂ��Ă��܂��B";
		next;
		mes "[�}����]";
		mes "�X�A�h�c�c���ނ�B";
		mes "�u�́v�ɗ���Ȃ��ł���c�c";
		mes "����ɗ����Ă��܂�����";
		mes "����܂ł���Ă����w�͂��S��";
		mes "�\�͂Ƒ����ŉ���������Ă��܂��B";
		next;
		mes "[�}����]";
		mes "���ށc�c�X�A�h�B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�c�c�X�A�h�B";
		mes "�{�N��������肢�����B";
		mes "�L�~�̐S��͗����ł���c�c���ǁc�c";
		mes "�݂�Ȃ̖����ׂ̈ɂ�";
		mes "�ꎞ�I�Ȋ���ɗ�����Ȃ��Łc�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c�B";
		next;
		cutin "ep18_suad_03.png", 1;
		mes "[�X�A�h]";
		mes "���O��ɐS�z�����Ȃ��";
		mes "�v���Ă��Ȃ������ȁB";
		mes "�����Ă�����������̂��B";
		mes "�ӂ�c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�F�A�������I";
		mes "��������D���ė����ׂ͕Ԃ��I";
		mes "���̏�ŕ��͂ɗ���Ȃ�";
		mes "�񕐑��̃f�����s���I";
		next;
		mes "[�X�A�h]";
		mes "�����ɂ��镐��͌��X��";
		mes "�ڏZ�̖����푈�ׂ̈ɗp�ӂ������킾�I";
		mes "��c�����́A���̉��ꂽ����ɂ����";
		mes "�y�n��D��ꂽ�I";
		mes "���������A����𗊂�킯�ɂ͂����Ȃ��I";
		next;
		mes "[�X�A�h]";
		mes "����ȂǕK�v�Ȃ��I";
		mes "�������ЂƂ�ЂƂ�̋C����";
		mes "�ւ荂���ӎu�ƍ�������";
		mes "��ƂȂ邩�炾�I";
		next;
		mes "[�X�A�h]";
		mes "�f���̏����͂��łɂł��Ă���B";
		mes "���܂����������̑z��������";
		mes "��c�⓯�u�����̖��_�����߂����I";
		next;
		cutin "ep18_suad_02.png", 255;
		mes "[���}�N�X]";
		mes "����c�c������Ƒ҂Ă�I";
		mes "���킪�K�v�Ȃ�������!?";
		mes "����A�����čs����������΂ɗǂ����āI";
		next;
		cutin "ep18_suad_02.png", 1;
		mes "[�X�A�h]";
		mes "����ɗ���A���Q�����ɂ���̂�";
		mes "���a�҂̂��邱�Ƃ��B";
		mes "���̑��ɉ��a�Ȏ҂́A�ЂƂ�����Ȃ��I";
		next;
		mes "^0000FF�]�X�A�h�����g�̖�����";
		mes "�@�f���؂�悤�ɔ�����";
		mes "�@���̗͋����錾��";
		mes "�@�W�܂������l������";
		mes "�@�E�C�Â���ꂽ�悤���]^000000";
		next;
		cutin "ep18_suad_02.png", 255;
		mes "[�Z��]";
		mes "�c�c�X�A�h�̌����ʂ肾�I";
		unittalk getnpcid(0,"�Z��#sms03_118"),"�Z�� : ����ɗ���K�v�͖����I";
		unittalk getnpcid(0,"�Z��#sms01_116"),"�Z�� : �������̌ւ�������Ă��I";
		unittalk getnpcid(0,"�Z��#sms02_117"),"�Z�� : ���a�҂͂��Ȃ��I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�X�A�h�c�c";
		mes "��A�悩�����c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�ڂ����Ƃ���ȁA�}�����B";
		mes "���O�ɂ͒D���ė����ׂ�";
		mes "�Ԃ��ɍs���Ă��炢�����B";
		mes "�c�c�ł��邩�H";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�͂́c�c";
		mes "�����������Ă����Ȃ��c�c";
		mes "�ł��Ȃ����Č����Ă�";
		mes "��点�����Ȃ񂾂�H";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�{�N���f���ɎQ������B";
		mes "�{�N�����āu�D�F�̎q���B�v�Ȃ񂾁B";
		mes "���݂̂�Ȃƈꏏ�̓�����݂����B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�`���җl�A���肢������܂��B";
		mes "�X�A�h�����̃f����";
		mes "���͂��Ă��炦�܂��񂩁H";
		mes "�ނ�Ɓc�c�X�A�h�����̑z����";
		mes "���ė~������ł��B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�ڏZ�̖��ł����Z���ł��Ȃ��`���҂�";
		mes "�f���̐��������ؖ����Ă����";
		mes "�Ƃ����킯���B";
		mes "�c�c�ǂ����낤�B";
		next;
		mes "[�X�A�h]";
		mes "�f���́A���w���̑�_�a�ōs���\�肾�B";
		mes "�������ł����烉�w���̐_�a�O�ɗ����B";
		mes "�~���A����������ӂ�ȁB";
		cloakonnpc "�Z��#sms01_116";
		cloakonnpc "�Z��#sms02_117";
		cloakonnpc "�Z��#sms03_118";
		set EP18_1QUE,51;
		delquest 17518;
		setquest 17519;
		close2;
		cutin "ep18_suad_01.png", 255;
		cloakonnpc "�X�A�h#sms02_113";
		cloakonnpc "�}����#sms02_115";
		cloakonnpc "�~���A��#sms02_114";
		cloakonnpc "�N�[��#sms01_111";
		cloakonnpc "���s#sms01_112";
		end;
	}
	if(EP18_1QUE == 51) {
		mes "[���}�N�X]";
		mes "�f���̓��w���̑�_�a�ōs���񂾂�B";
		mes "�������ƃ��w���ɍs�������`�B";
		next;
		mes "�]���w���̑�_�a�֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��̓��w���̑�_�a�֌��������]";
		close2;
		warp "rachel.gat", 169, 240;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 50 || EP18_1QUE == 51)
		showevent 0, 1, "���}�N�X#sms01_110";
	else
		showevent 9999,0,"���}�N�X#sms01_110";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,129,256,3	script	�N�[��#sms01_111	21293,{/* 15942 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,126,255,5	script	���s#sms01_112	21294,{/* 15943 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,126,252,7	script	�X�A�h#sms02_113	10378,{/* 15944 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,124,253,5	script	�~���A��#sms02_114	10377,{/* 15945 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,127,250,7	script	�}����#sms02_115	10376,{/* 15946 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,129,251,1	script	�Z��#sms01_116	931,{/* 15947 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,129,248,7	script	�Z��#sms02_117	928,{/* 15948 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,132,250,1	script	�Z��#sms03_118	10397,{/* 15949 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

rachel.gat,169,245,3	script	���}�Ȑl#sms04_119	10399,{/* 15950 */
	if(EP18_1QUE < 51) {
		mes "[���}�Ȑl]";
		mes "�����ɂ͉����Ȃ��ł���`�B";
		mes "�C����ƒ���";
		mes "�֌W�҈ȊO�͋ߊ��Ȃ��ł��������`�B";
		close;
	}
	if(EP18_1QUE >= 53) {//53���m�F
		mes "[���}�Ȑl]";
		mes "�����̍L��̋߂��ɂ���";
		mes "^ff0000�h���̒���^000000��";
		mes "����̌��ɂ���";
		mes "���k����݂����ł���H";
		viewpoint 1, 116, 200, 18, 0x00FF00;
		next;
		mes "�]^ff0000�h���̒���^000000�֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ���^ff0000�h���̒���^000000�֌��������]";
		close2;
		warp "rachel.gat", 116, 200;
		end;
	}
	if(EP18_1QUE == 51) {
		mes "[���}�Ȑl]";
		mes "�����ɂ͉����Ȃ��ł���`�B";
		mes "�C����ƒ���";
		mes "�֌W�҈ȊO�͋ߊ��Ȃ��ł��������`�B";
		next;
		cutin "ep18_suad_01.png", 2;
		cloakoffnpc "�X�A�h#sms03_120";
		mes "[�X�A�h]";
		mes "�x�����Ȃ��Ă����B";
		mes "�����͉������̃f���ɂ��Ă���";
		mes "�`���҂��B";
		mes "�������̐��������ؖ����Ă����B";
		next;
		cutin "ep18_miriam_01.png", 0;
		cloakoffnpc "�~���A��#sms03_121";
		mes "[�~���A��]";
		mes "����őS���������ˁB";
		set EP18_1QUE,52;
		delquest 17519;
		setquest 17520;
		next;
	}
	else if(EP18_1QUE == 52) {
		cloakoffnpc "�X�A�h#sms03_120";
		cloakoffnpc "�~���A��#sms03_121";
	}
	cutin "ep18_suad_01.png", 2;
	mes "[�X�A�h]";
	mes "��������_�a�̗����ɓ����B";
	mes "�u�f���J�n�̍��}�v���s�������";
	mes "�_�a�ɓ��邼�B";
	if(mdopenstate("wolf in sheep's clothing") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
		set '@menu$,"�u�r�̒��̘T�v����";
	}
	else {
		set '@menu$,"�u�r�̒��̘T�v(wolf in sheep's clothing)�̍쐬";
	}
	next;
	if(select("�������K�v�ł�",'@menu$) == 1) {
		mes "[�X�A�h]";
		mes "�������ł�����";
		mes "������x�b�������Ă���B";
		close2;
		cutin "ep18_suad_01.png", 255;
		end;
	}
	if(mdopenstate("wolf in sheep's clothing")) {
		cutin "ep18_suad_01.png", 2;
		mes "[�X�A�h]";
		mes "�f���̏��������������悤���B";
		mes "�ł́A�s�����B";
		close2;
		cutin "ep18_suad_01.png", 255;
		switch(mdenter("wolf in sheep's clothing")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[wolf in sheep's clothing] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			donpcevent getmdnpcname("WolfInSheepsClothingControl1")+ "::OnStart";
			//warp "1@tcamp.gat", 103, 237;
			close;
		case 1:	// �p�[�e�B�[������
			cutin "ep18_suad_01.png", 255;
			mes "[�C���t�H���[�V����]";
			mes "�p�[�e�B�[�ɉ������Ă��Ȃ�����";
			mes "����ł��܂���B";
			close;
		case 2:	// �_���W�������쐬
			cutin "ep18_suad_01.png", 2;
			mes "[�X�A�h]";
			mes "�p�[�e�B�[���[�_�[�̏�����҂āB";
			next;
			cutin "ep18_suad_01.png", 255;
			mes "[�C���t�H���[�V����]";
			mes "�Ώۂ̃������A���_���W������";
			mes "�쐬����Ă��Ȃ�����";
			mes "����ł��܂���B";
			close;
		default:	// ���̑��G���[
			close;
		}
	}
	else {
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			cutin "ep18_maram_01.png", 255;
			mes "[�C���t�H���[�V����]";
			mes "�p�[�e�B�[���[�_�[�̂�";
			mes "�������A���_���W������";
			mes "�쐬���邱�Ƃ��ł��܂��B";
			close;
		}
		mdcreate "wolf in sheep's clothing";
		cutin "ep18_suad_01.png", 255;
		mes "���p�[�e�B�[��";
		mes "^0000ff"+strcharinfo(1)+"^000000";
		mes "���p�[�e�B�[���[�_�[";
		mes "^0000ff"+strcharinfo(0)+"^000000";
		mes "�@";
		mes "^006400wolf in sheep's clothing^000000�̍쐬�\�����󂯕t���܂��B";
		next;
		cutin "ep18_suad_01.png", 2;
		mes "[�X�A�h]";
		mes "�c�c�s�[�b!!";
		next;
		mes "[�X�A�h]";
		mes "���}�𑗂����B";
		mes "���������������";
		mes "�_�a�ɓ����悤�ɂȂ邾�낤�B";
		close2;
		cutin "ep18_suad_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 51 || EP18_1QUE <= 53)
		showevent 0, 1, "���}�Ȑl#sms04_119";
	else
		showevent 9999,0,"���}�Ȑl#sms04_119";
	end;
}
rachel.gat,167,244,5	script	�X�A�h#sms03_120	10378,{/* 15951 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,167,242,7	script	�~���A��#sms03_121	10377,{/* 15952 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,116,200,0	script	#ep18w14_150	139,14,14,{/* 15953 */
	if(EP18_1QUE == 53) {
		cloakoffnpc "�j���G��#sms01_122";
		cloakoffnpc "�W�F�h#sms01_123";
		cloakoffnpc "�~���A��#sms04_125";
		cloakoffnpc "�X�A�h#sms04_124";
	}
	if(EP18_1QUE == 54) {
		cloakoffnpc "�j���G��#sms01_122";
		cloakoffnpc "�W�F�h#sms01_123";
	}
	if(EP18_1QUE == 55) {
		cloakoffnpc "�j���G��#sms01_122";
	}
	end;
}
rachel.gat,116,200,5	script	�j���G��#sms01_122	915,{/* 15954 (cloaking)*/
	if(EP18_1QUE == 53) {
		cloakoffnpc "�W�F�h#sms01_123";
		cloakoffnpc "�X�A�h#sms04_124";
		cloakoffnpc "�~���A��#sms04_125";
		cutin "ra_gwoman.bmp", 2;
		mes "[�j���G����_��]";
		mes "�悤�₭�ꑧ���܂����B";
		mes "���ꂼ��̏󋵂��m�F���܂��傤���B";
		next;
		cutin "ra_gman.bmp", 2;
		mes "[�W�F�h��_��]";
		mes "�_�a���̕����҂�";
		mes "�F�A�傫�ȉ���͕����Ă��Ȃ��B";
		mes "�`���җl�̂��������ȁB";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "��������K���A�d���҂͂��܂���B";
		mes "�����A�V���b�N���傫�������悤��";
		mes "���_�I�ɎQ���Ă���l�����܂��B";
		next;
		cutin "ra_gwoman.bmp", 2;
		mes "[�j���G����_��]";
		mes "����̑������P��ꂽ����";
		mes "����̌������đ����ɑ��������Ƃ�";
		mes "���w���̊X�̐l�X���s����";
		mes "�v����������܂���B";
		next;
		cutin "ra_gman2.bmp", 2;
		mes "[�W�F�h��_��]";
		mes "�����͉�X�����Ƃ����邵���Ȃ��B";
		mes "�������d�g�܂�Ă������Ƃ����ɂ���";
		mes "�݂��ɕs�������������Ƃ�������悤�B";
		next;
		cutin "ra_gwoman.bmp", 2;
		mes "[�j���G����_��]";
		mes "�܂����_�a�̕��m�������c�c";
		mes "�����c�c���X�E�A�}�[���c�c";
		mes "���u�r���h��_���v���C���V�I���Ƌ���";
		mes "�����ɍЂ��������炵�Ă����Ȃ�āB";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "����͎��r��A���C�͂ȓ��X��";
		mes "�߂����Ă��܂����B";
		mes "�Ƃ��낪�A�����������";
		mes "�ȑO�̂悤�Ɋ����ɂȂ��āc�c�B";
		next;
		mes "[�~���A��]";
		mes "�{�N�́A�����Ɋ����������̂ł���";
		mes "���v���Ԃ��΁A���̎�����ł��B";
		mes "���w���̊X�ŁA���Z���ƈڏZ�̖��Ƃ̊Ԃ�";
		mes "�a瀂��傫���Ȃ�n�߂��̂́B";
		next;
		cutin "ep18_suad_02.png", 0;
		mes "[�X�A�h]";
		mes "���̃C���V�I���Ƃ����������c���";
		mes "���X�E�A�}�[�������������񂾂ȁH";
		mes "�������c�c�B";
		next;
		mes "[�X�A�h]";
		mes "�������́c�c���p����Ă����̂��I";
		mes "�z��̖ړI��B������ׂ�";
		mes "��ɉ߂��Ȃ������Ƃ����킯���I";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�{�N�̂������c�c";
		mes "�{�N������̕ω���";
		mes "�����Ƒ����C�Â��Ă���΁c�c�B";
		next;
		cutin "ra_gwoman.bmp", 2;
		mes "[�j���G����_��]";
		mes "�s���͂�����ɂ������邱�Ƃł��B";
		mes "�X�ŋN���Ă��������ɐ^���ɑΉ�����";
		mes "�_�a���̕��m�����܂�";
		mes "���_����Ă����̂ł�����B";
		next;
		cutin "ra_gman.bmp", 2;
		mes "[�W�F�h��_��]";
		mes "����̂��Ƃ͕s�K�������B";
		mes "�����A�܂��I������킯�ł͂Ȃ��B";
		mes "�������낤�H";
		next;
		menu "���~���̐S���̌��Ђ����߂��Ȃ���",-;
		mes "[�W�F�h��_��]";
		mes "�����������Ƃ��B";
		mes "������������������A�̍����̎��E��";
		mes "��X�ɔC���ė~�����B";
		mes "�L�~�ɂ̓��~���̐S���̌��Ђ�";
		mes "�D�҂�������S���ė~�����B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "���������ǁc�c";
		mes "�u���~���̐S���̌��Ёv��";
		mes "����̕ʑ��ɂ���͂��ł��B";
		mes "�ŋ߁A�×{�̂��߂ƌ����ĕp�ɂ�";
		mes "�ʂ��Ă��܂����B";
		next;
		mes "[�~���A��]";
		mes "�ʑ��̎g�p�l������";
		mes "����̋q�l���吨�����Ă����";
		mes "�����Ă��܂��B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�ʑ��ɓ���ɂ͓��ʂȌ����K�v�ł���";
		mes "�ړr�͂��Ă��܂��B";
		mes "�{�N���ē��ł��܂�����";
		mes "�`���҂�����ꏏ�ɗ��Ă��������B";
		next;
		mes "[�~���A��]";
		mes "�u^0000FF�I�Y�̖��H^000000�v�ŗ��������܂��傤�B";
		mes "�������ł����痈�Ă��������B";
		set EP18_1QUE,54;
		delquest 17521;
		setquest 17525;
		close2;
		cutin "ep18_miriam_01.png", 255;
		cloakonnpc "�~���A��#sms04_125";
		cloakonnpc "�X�A�h#sms04_124";
		end;
	}
	if(EP18_1QUE >= 54 && EP18_1QUE <= 55) {
		cutin "ra_gwoman.bmp", 0;
		mes "[�j���G��]";
		mes "�~���A���Ƃ́u^0000FF�I�Y�̖��H^000000�v��";
		mes "�����������ƂɂȂ��Ă����Ǝv���܂����H";
		next;
		cutin "ra_gwoman.bmp", 255;
		mes "�]�u^0000FF�I�Y�̖��H^000000�v�֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��́u^0000FF�I�Y�̖��H^000000�v�֌��������]";
		close2;
		warp "oz_dun01.gat", 218, 116;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE >= 53 && EP18_1QUE <= 55)
		showevent 0, 1, "�j���G��#sms01_122";
	else
		showevent 9999,0,"�j���G��#sms01_122";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,115,198,5	script	�W�F�h#sms01_123	932,{/* 15955 (cloaking)*/
	cutin "ra_gman2.bmp", 0;
	mes "[�W�F�h��_��]";
	mes "�ǂ����N��������";
	mes "���Ԃ��傫�������Ă��܂��悤���B";
	close2;
	cutin "ra_gman2.bmp", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,119,199,3	script	�X�A�h#sms04_124	10378,{/* 15956 (cloaking)*/
	cutin "ep18_suad_02.png", 0;
	mes "[�X�A�h]";
	mes "�������́c�c���p����Ă����̂��B";
	mes "�z��̖ړI��B������ׂ�";
	mes "��ɉ߂��Ȃ������Ƃ����킯���I";
	close2;
	cutin "ep18_suad_02.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,118,197,1	script	�~���A��#sms04_125	10377,{/* 15957 (cloaking)*/
	cutin "ep18_miriam_03.png", 0;
	mes "[�~���A��]";
	mes "����c�c";
	mes "�ǂ����Ă���ȁc�c�B";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,223,114,0	script	#ep180_oz_c12	139,{/* 15958 */
	if(EP18_1QUE == 54) {
		cloakonnpc "�}����#c12_01_128";
		cloakonnpc "�X�A�h#c12_01_129";
		cloakonnpc "�~���A��#c12_01_130";
		cloakonnpc "�A�C��#c12_01_131";
	}
	if(EP18_1QUE == 55) {
		cloakoffnpc "�}����#c12_01_128";
		cloakoffnpc "�X�A�h#c12_01_129";
		cloakoffnpc "�~���A��#c12_01_130";
		cloakoffnpc "�A�C��#c12_01_131";
	}
	end;
}
oz_dun01.gat,223,114,3	script	�񑩂̏ꏊ#c12_evt01_127	10043,{/* 15959 */
	if(EP18_1QUE == 54) {
		mes "^0000FF�]�~���A���Ɏw�肳�ꂽ�ꏊ�ɂ�";
		mes "�@�}�����ƃX�A�h���҂��Ă����]^000000";
		cloakoffnpc "�}����#c12_01_128";
		cloakoffnpc "�X�A�h#c12_01_129";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "��_�a�ł̈ꌏ��";
		mes "���ƃX�A�h���畷���܂����B";
		mes "��ςł����ˁB";
		mes "���̏�ɂ��Ȃ������̂�";
		mes "����܂�܂��c�c�B";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "���O�́A���̈˗��ʂ�";
		mes "�����ɑ����ɉׂ�Ԃ��Ă��ꂽ�B";
		mes "���ׂ�����������񂾁B";
		mes "�c�c����ŏ\�����B";
		next;
		cloakoffnpc "�~���A��#c12_01_130";
		cloakoffnpc "�A�C��#c12_01_131";
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�����݂�ȏW�܂��Ă�̂��B";
		mes "�`���҂���A�ޏ��́u�A�C���v�B";
		mes "����̐��b�����Ă���҂ł��B";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[�A�C��]";
		mes "�͂��߂܂��āI";
		mes "�}�����Z���܂����v���Ԃ�ł��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�A�C���H";
		mes "�ޏ��͍���̌��Ɗ֌W����́H";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[�A�C��]";
		mes "�A�}�[���l�̕ʑ��ɍs����ł���ˁH";
		mes "���̓A�}�[���l�̎Ԃ�����������";
		mes "�����ȏꏊ�ɏo���肵�܂�����";
		mes "�ʑ��́u���v�������Ă���ł���B";
		next;
		mes "[�A�C��]";
		mes "���b�́A�~���A���o���܂��畷���܂����B";
		mes "�����ʑ��ɉ�������Ǝv���Ă��܂��B";
		next;
		mes "[�A�C��]";
		mes "���΂炭�O����A�A�}�[���l���ʑ���";
		mes "�i�Ռ��K�������ɑ݂��Ă�����ł��B";
		mes "�֌W�҂ɕʑ���݂��̂�";
		mes "�ȑO���炠��܂�������";
		mes "����͗l�q�����������āc�c�B";
		next;
		mes "[�A�C��]";
		mes "�ʑ��ɔ����Ă���l������";
		mes "�i�ՂƂ����͉̂R�ł��ˁB";
		mes "���Ƃ������c�c�������c�̂Ƃ�����";
		mes "���ʂ���Ȃ���ł��B";
		next;
		mes "[�A�C��]";
		mes "���Ɂc�c�O���Ŗڂ��B��Ă���";
		mes "���̏����c�c";
		mes "�ӎv�̑a�ʂ��܂�łł��Ȃ��āc�c";
		mes "�o�P���m�Ɖ�b���Ă���݂����ȁc�c�B";
		next;
		mes "[�A�C��]";
		mes "�A�}�[���l�����r���Ă���";
		mes "�푈�̘b�͕����Ȃ��Ȃ�܂�������";
		mes "�܂��푈����ĂĂ�����̂��Ǝv����";
		mes "���낵���ċ��낵���āI";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�S�z�͂���Ȃ��B";
		mes "����Ȃ��ƂɂȂ�Ȃ��悤";
		mes "�������Ɩ`���җl�������Ă���񂾁B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�A�C���̘b�𕷂����肾��";
		mes "�ʑ��ɂ���̂͐_�a�ŏo������z���";
		mes "�ԈႢ�Ȃ��Ǝv���B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�ʑ��ɂ̓{�N�Ɩ`���җl�Ƃ�";
		mes "�s�����Ǝv���B";
		mes "�}�����ƃX�A�h��";
		mes "��邱�Ƃ������ˁH";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "����͂��������ǁc�c";
		mes "�X�A�h�H";
		next;
		cutin "ep18_suad_01.png", 1;
		mes "[�X�A�h]";
		mes "�����Ȋ댯�𔺂����낤���c�c";
		mes "���ƃ}�������s�����Ƃ����";
		mes "����܂Ƃ��ɂȂ邾�����낤�B";
		next;
		mes "[�X�A�h]";
		mes "�`���ҁA���O���~���A�������B";
		mes "���O�Ȃ�A�ł��邾�낤�B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�Ȃ�قǁB";
		mes "�`���җl�ɂȂ�~���A���̂���";
		mes "���S���Ă��C���ł��܂��B";
		mes "��낵�����肢���܂��I";
		next;
		cutin "ep18_miriam_02.png", 0;
		mes "[�~���A��]";
		mes "���܂肾�ˁB";
		mes "����ɂ��Ă��A�`���҂���B";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "[�A�C��]";
		mes "�ʑ��́u���v���g����";
		mes "�ʑ��̓������o�������܂��B";
		mes "�����͂�낵���ł����H";
		set EP18_1QUE,55;
		delquest 17525;
		setquest 18083;
		close2;
		end;
	}
	if(EP18_1QUE == 55) {
		unittalk getnpcid(0,"�A�C��#c12_01_131"),"�A�C�� : �����ł��܂������H",1;
		end;
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 54 || EP18_1QUE == 55)
		showevent 0, 1, "�񑩂̏ꏊ#c12_evt01_127";
	else
		showevent 9999,0,"�񑩂̏ꏊ#c12_evt01_127";
	end;
}
oz_dun01.gat,225,119,3	script	�}����#c12_01_128	10376,{/* 15960 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,223,120,5	script	�X�A�h#c12_01_129	10378,{/* 15961 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,220,118,5	script	�~���A��#c12_01_130	10377,{/* 15962 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,219,117,5	script	�A�C��#c12_01_131	475,{/* 15963 (cloaking)*/
	if(EP18_1QUE == 55) {
		if(mdopenstate("High Priest's villa") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[�A�C��]";
			mes "�������ł��܂�����";
			mes "�ʑ��ֈē����܂��傤�B";
			set '@menu$,"�u��_���̕ʑ��v����";
		}
		else {
			mes "[�A�C��]";
			mes "�A�}�[���l�̕ʑ���";
			mes "�u���v���g�����Ƃł�������Ȃ���ł��B";
			mes "���@�H�@�݂����Ȃ��̂�";
			mes "���ʂ͓���Ȃ������ł��B";
			next;
			mes "[�A�C��]";
			mes "�������ł��܂�����";
			mes "�u���v���g���āA�������q���܂��ˁB";
			set '@menu$,"�u��_���̕ʑ��v(High Priest's villa)�̍쐬";
		}
		next;
		if(select("��߂�",'@menu$) == 1) {
			mes "[�A�C��]";
			mes "�����������܂ő҂��Ă��܂��ˁB";
			close;
		}
		if(mdopenstate("High Priest's villa")) {
			mes "[�A�C��]";
			mes "�ł́A�ʑ��ֈē����܂��B";
			close2;
			switch(mdenter("wolf in sheep's clothing")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[High Priest's villa] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("HighPriestsVillaControl1")+ "::OnStart";
				//warp "1@adv.gat", 123, 17;
				close;
			case 1:	// �p�[�e�B�[������
				mes "[�C���t�H���[�V����]";
				mes "�p�[�e�B�[�ɉ������Ă��Ȃ�����";
				mes "����ł��܂���B";
				close;
			case 2:	// �_���W�������쐬
				mes "[�A�C��]";
				mes "�p�[�e�B�[���[�_�[��";
				mes "�������ł����̂�";
				mes "�m�F���Ă��������܂����H";
				next;
				mes "[�C���t�H���[�V����]";
				mes "�Ώۂ̃������A���_���W������";
				mes "�쐬����Ă��Ȃ�����";
				mes "����ł��܂���B";
				close;
			default:	// ���̑��G���[
				close;
			}
		}
		else {
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[�C���t�H���[�V����]";
				mes "�p�[�e�B�[���[�_�[�̂�";
				mes "�������A���_���W������";
				mes "�쐬���邱�Ƃ��ł��܂��B";
				close;
			}
			mdcreate "High Priest's villa";
			mes "���p�[�e�B�[��";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "���p�[�e�B�[���[�_�[";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "�@";
			mes "^006400High Priest's villa^000000�̍쐬�\�����󂯕t���܂��B";
			close;
		}
	}
	end;
OnQuestInfo:
	if(EP18_1QUE == 55)
		showevent 0, 1, "�A�C��#c12_01_131";
	else
		showevent 9999,0,"�A�C��#c12_01_131";
	end;
OnInit:
	cloakonnpc;
	end;
}

ra_temin.gat,261,121,0	script	#ep18w04_140	139,{/* 15964 */}
ra_temin.gat,256,130,0	script	#ep18w10_146	139,{/* 15965 */}
ra_temin.gat,256,130,1	script	�_�a�R�m#c12_02_132	934,3,3,{/* 15966 */
	mes "[�_�a�R�m]";
	mes "������֌W�҈ȊO�͗����֎~�ł��B";
	mes "��������肭�������B";
	close;
OnTouch:
	unittalk getnpcid(0,"�_�a�R�m#c12_02_132"),"�_�a�R�m : �֌W�҈ȊO��������֎~�ł�",1;
	warp "ra_temin.gat",255,138;
	end;
}
ra_temin.gat,259,111,1	script	�}����#c12last_133	10376,{/* 15967 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,254,114,7	script	�X�A�h#c12last_134	10378,{/* 15968 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,258,114,3	script	�j���G��#c12last_135	915,{/* 15969 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,254,117,5	script	�~���A��#c12_02_136	10377,{/* 15970 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
ra_temin.gat,258,117,3	script	�X�}�[�g�G���[�̌`��#c1	10354,{/* 15971 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,27,184,0	script	#ep18w10_152	139,14,14,{/* 15972 */
	if(checkquest(11725) || checkquest(11726))
		cloakoffnpc "�C������#ep18_sb1";
	end;
}
oz_dun01.gat,27,184,5	script	�C������#ep18_sb1	10379,{/* 15973 (cloaking)*/
	if(checkquest(11725)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "�ӂ��`�`�A�������I";
		mes "�O�͗��������A�������̂�";
		mes "���̓W�b�Ƃ��ĂĂ�";
		mes "������̂悤�ɗ�����B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "��������ƃt���t���ɂȂ邩��";
		mes "�������Ɖ���Ē������悤�B";
		mes "�܂����̓���^e5555e��{��^000000������";
		mes "���̂܂ܕ����Đi�߂΂����B";
		delquest 11725;
		setquest 11726;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11726)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "�ӂ��`�`�A�������I";
		mes "�O�͗��������A�������̂�";
		mes "���̓W�b�Ƃ��ĂĂ�";
		mes "������̂悤�ɗ�����B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "��������ƃt���t���ɂȂ邩��";
		mes "�������Ɖ���Ē������悤�B";
		mes "�܂����̓���^e5555e��{��^000000������";
		mes "���̂܂ܕ����Đi�߂΂����B";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11725))
		showevent 0, 3, "�C������#ep18_sb1";
	else
		showevent 9999,0,"�C������#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,68,284,5	script	��#ep18_sb1	10250,{/* 15974 */
	if(checkquest(11726)) {
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�����ƁA����́c�c";
		mes "�N�����ו���u���čs�����񂾁B";
		mes "�����X�^�[�Ɣ����킹������";
		mes "���ē����Ȃ��Ȃ�������";
		mes "��������ĉו����B�����肷��B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�ו��^�т͑厖������";
		mes "���͂ЂƂ����Ȃ�����ˁB";
		next;
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "���̉ו��͌�ŉ������Ƃ���";
		mes "��ɐi�����B";
		delquest 11726;
		setquest 11727;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11727)) {
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�����ƁA����́c�c";
		mes "�N�����ו���u���čs�����񂾁B";
		mes "�����X�^�[�Ɣ����킹������";
		mes "���ē����Ȃ��Ȃ�������";
		mes "��������ĉו����B�����肷��B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�ו��^�т͑厖������";
		mes "���͂ЂƂ����Ȃ�����ˁB";
		next;
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "���̉ו��͌�ŉ������Ƃ���";
		mes "��ɐi�����B";
		delquest 11726;
		setquest 11727;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �]�������u����Ă���]",1;
	end;
OnQuestInfo:
	if(checkquest(11726))
		showevent 0, 3, "��#ep18_sb1";
	else
		showevent 9999,0,"��#ep18_sb1";
	end;
}
oz_dun01.gat,65,189,0	script	#ep18w10_153	139,{/* 15975 */
	if(checkquest(11727))
		cloakoffnpc "��������#ep18_sb1";
	end;
}
oz_dun01.gat,65,189,5	script	��������#ep18_sb1	10428,{/* 15976 (cloaking)*/
	if(checkquest(11727)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "�����͌���������C��t���Ă���B";
		mes "�������芊������";
		mes "����̍����������Ⴄ���炳�B";
		mes "�ӂ��I";
		next;
		mes "[�C������]";
		mes "��������͂����Ɖ��肾�B";
		mes "^e5555e��̕�^000000�ɐi�����B";
		delquest 11727;
		setquest 11728;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11728)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "�����͌���������C��t���Ă���B";
		mes "�������芊������";
		mes "����̍����������Ⴄ���炳�B";
		mes "�ӂ��I";
		next;
		mes "[�C������]";
		mes "��������͂����Ɖ��肾�B";
		mes "^e5555e��̕�^000000�ɐi�����B";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11727))
		showevent 0, 3, "��������#ep18_sb1";
	else
		showevent 9999,0,"��������#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,111,96,0	script	#ep18w10_154	139,14,14,{/* 8413 */
	if(checkquest(11728))
		cloakoffnpc "���C�̏o�錊#ep18_sb1";
	end;
}
oz_dun01.gat,111,96,5	script	���C�̏o�錊#ep18_sb1	10428,{/* 8414 (cloaking)*/
	if(checkquest(11728)) {
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�����I�@������!!!";
		mes "�T��̌��Ԃ���";
		mes "���C���R��Ă�I";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "�����̉��x�������Ȃ��Ă��Ă�񂾁B";
		mes "�n�₪�߂��ɗ��Ă�̂����ˁB";
		mes "���̂܂܂��Ƃ�����";
		mes "���̓����g���Ȃ��Ȃ邩���Ȃ��B";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[�H�H�H]";
		mes "<FONT SIZE = 16><B>�C������!!</FONT></B>";
		next;
		mes "�]�߂��ŃC���������ĂԐ������������B";
		mes "�@���̎��T���Ă݂悤�]";
		delquest 11728;
		setquest 11729;
		cloakoffnpc "�x��ł���j��#ep18_sb1";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(11728))
		showevent 0, 3, "���C�̏o�錊#ep18_sb1";
	else
		showevent 9999,0,"���C�̏o�錊#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,100,92,0	script	#ep18w10_155	139,14,14,{/* 8415 */
	if(checkquest(11729) || checkquest(11730) || checkquest(11731))
		cloakoffnpc "�x��ł���j��#ep18_sb1";
	end;
}
oz_dun01.gat,100,92,3	script	�x��ł���j��#ep18_sb1	10396,{/* 8416 (cloaking)*/
	if(checkquest(11729)) {
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "�|�[���Y����B";
		mes "���v�H";
		next;
		cutin "ep18_imril_02.png", 255;
		mes "[�|�[���Y]";
		mes "�����X�^�[���瓦������Ă���";
		mes "���C�ɓ��������܂����c�c";
		mes "���ꂽ��������Ɩ��f������B";
		next;
		mes "[�|�[���Y]";
		mes "�ו����ǂ��ɗ��Ƃ����̂�";
		mes "�悭������Ȃ��B";
		mes "�ň����ȁc�c�B";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�ו���薽�̕����厖����B";
		mes "����ȂɋC�𗎂Ƃ����Ƃ͂Ȃ����B";
		next;
		cutin "ep18_imril_02.png", 255;
		mes "[�|�[���Y]";
		mes "�n�n�n�B";
		mes "�������ȁB";
		mes "���肪�Ƃ��B";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "��������ė��Ă邩��";
		mes "��ɑ��ɋA���ĂāB";
		mes "�ו��͌�ŒT�����炳�B";
		next;
		cutin "ep18_imril_02.png", 255;
		mes "[�|�[���Y]";
		mes "���̋M�d�Ȏ�����";
		mes "�Q���킯�ɂ͂������B";
		mes "�����x�߂Γ�����悤�ɂȂ�B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "����Ȃ��B";
		mes "���Ⴀ�A";
		mes "�����炪�����̉񕜍܂�";
		mes "�{�[���Y����̎蓖�Ă����邩��";
		mes "�`���҂���";
		mes "������Ƃ����҂��ĂĂ�B";
		next;
		mes "[�|�[���Y]";
		mes "�c�c�����������O��";
		mes "�������ȁB";
		mes "�c�c���܂Ȃ����A";
		mes "���t�ɊÂ���Ƃ��悤�B";
		delquest 11729;
		setquest 11730;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11730)) {
		mes "�]�C�����������ꂽ�����";
		mes "�@�|�[���Y�����";
		mes "�@�蓖�Ă����Ă���]";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�c�c�c�c";
		mes "�c�c�c�c";
		mes "�c�c�c�c����ł悵���ƁB";
		next;
		cutin "ep18_imril_04.png", 255;
		mes "[�|�[���Y]";
		mes "�悢������ƁB";
		mes "�������œ�����܂ł͉񕜂�����B";
		mes "��l�Ƃ����肪�Ƃ��B";
		mes "���ꂶ�Ⴀ�A���ɏo�������B";
		next;
		mes "[�|�[���Y]";
		mes "�C�������A�����𑱂���Ȃ�";
		mes "�C��t����񂾂��B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�킩���Ă���āB";
		mes "�|�[���Y����������X�^�[��";
		mes "�ǂ��|�����Ȃ��悤��";
		mes "�C��t���āB";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "���`�`��B";
		mes "�����X�^�[��������Ȃ���";
		mes "�����o�����C����肾�ȁB";
		next;
		mes "[�C������]";
		mes "���̐l�������܂ŗ��邱�Ƃ�";
		mes "�ő��ɂȂ����ǁA";
		mes "�����X�^�[�ɒǂ���";
		mes "�����ԈႦ���肷�邩��Ȃ��B";
		next;
		mes "[�C������]";
		mes "�������������������Ă������B";
		delquest 11730;
		setquest 11731;
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	mes "[�|�[���Y]";
	mes "�������ɖ߂���āB";
	mes "�S�z���Ȃ���ȁB";
	close;
OnQuestInfo:
	if(checkquest(11729) || checkquest(11730))
		showevent 0, 3, "�x��ł���j��#ep18_sb1";
	else
		showevent 9999,0,"�x��ł���j��#ep18_sb1";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun01.gat,134,56,5	script	��#ep18_sb2	10250,{/* 8417 */
	if(checkquest(11731)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "�����ɂ��ו�������ȁB";
		mes "�|�[���Y����̉ו����ȁH";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "����͌�񂵂ɂ��悤�B";
		mes "��ɉ��̕���";
		mes "�������ɍs�����B";
		delquest 11731;
		setquest 11732;
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	if(checkquest(11732)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "�����ɂ��ו�������ȁB";
		mes "�|�[���Y����̉ו����ȁH";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "����͌�񂵂ɂ��悤�B";
		mes "��ɉ��̕���";
		mes "�������ɍs�����B";
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �]�������u����Ă���]",1;
	end;
OnQuestInfo:
	if(checkquest(11731))
		showevent 0, 3, "��#ep18_sb2";
	else
		showevent 9999,0,"��#ep18_sb2";
	end;
}

oz_dun01.gat,110,37,0	script	#ep18w10_156	139,{/* 8418 */
	if(checkquest(11732) || checkquest(11733))
		cloakoffnpc "�M�C#ep18_sb2";
	end;
}
oz_dun01.gat,110,37,5	script	�M�C#ep18_sb2	10428,{/* 8419 (cloaking)*/
	if(checkquest(11732)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "���ւ��c�c";
		mes "�����������M�C���B";
		mes "���̉��͂������댯������";
		mes "����܂ňȏ�ɒ��ӂ��āB";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�`���҂��񂪂��邩��";
		mes "������������܂ŗ��ꂽ�񂾁B";
		mes "�ЂƂ肶���Ȃ��Đi�߂Ȃ�����ˁB";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "���āc�c���ꂶ��ӂ�������";
		mes "���ɍ~���Ƃ��邩�B";
		delquest 11732;
		setquest 11733;
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	if(checkquest(11733)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "���ւ��c�c";
		mes "�����������M�C���B";
		mes "���̉��͂������댯������";
		mes "����܂ňȏ�ɒ��ӂ��āB";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�`���҂��񂪂��邩��";
		mes "������������܂ŗ��ꂽ�񂾁B";
		mes "�ЂƂ肶���Ȃ��Đi�߂Ȃ�����ˁB";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "���āc�c���ꂶ��ӂ�������";
		mes "���ɍ~���Ƃ��邩�B";
		close2;
		cutin "ep18_imril_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11732))
		showevent 0, 3, "�M�C#ep18_sb2";
	else
		showevent 9999,0,"�M�C#ep18_sb2";
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun02.gat,152,276,0	script	#ep18w10_157	139,14,14,{/* 8420 */
	if(checkquest(11733) || checkquest(11734))
		cloakoffnpc "�C������#ep18_sb3";
	end;
}
oz_dun02.gat,152,276,5	script	�C������#ep18_sb3	10379,{/* 8421 (cloaking)*/
	if(checkquest(11733)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "��������́A�������Ă郂���X�^�[��";
		mes "����Ă�B";
		mes "�`���҂�����C��t���āB";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�����͊댯������";
		mes "����������瑺�ɋA�������������ȁB";
		delquest 11733;
		setquest 11734;
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11734)) {
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "��������́A�������Ă郂���X�^�[��";
		mes "����Ă�B";
		mes "�`���҂�����C��t���āB";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�����͊댯������";
		mes "����������瑺�ɋA�������������ȁB";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11733))
		showevent 0, 3, "�C������#ep18_sb3";
	else
		showevent 9999,0,"�C������#ep18_sb3";
	end;
OnInit:
	cloakonnpc;
	end;
}

oz_dun02.gat,143,231,3	script	�V�l#ep18_sb1	10393,{/* 8422 */
	if(checkquest(11734)) {
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "�����I";
		mes "�I�W�C�I";
		mes "�Ȃ�ł���ȂƂ����!?";
		next;
		cutin "ep18_imril_03.png", 255;
		mes "[���H�Ԃ̃I�W�C]";
		mes "�ŋ߃����X�^�[��������������";
		mes "�N�����ɖ����Ƃ�񂩂�";
		mes "������Ă���񂶂�B";
		mes "���O�����A�������Ƃ�H";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "���H�̒����ɗ����񂾂�B";
		mes "�����X�^�[�̕��z��������";
		mes "���C�̈ʒu�𒲂ׂ���B";
		next;
		cutin "ep18_imril_03.png", 255;
		mes "[���H�Ԃ̃I�W�C]";
		mes "�������B�Ȃ��";
		mes "�n�₪�����܂ŏオ���Ă�����";
		mes "�X�A�h�̓z�ɓ`���Ă���B";
		next;
		mes "[���H�Ԃ̃I�W�C]";
		mes "����ƁA����������";
		mes "�n�ʂ��n���n�߂Ă��邩��";
		mes "�����֎~�ɂ��������ǂ����B";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�킩������B";
		mes "���ꂶ�Ⴀ�A�ق�A";
		mes "�I�W�C���ꏏ�ɑ��ɋA�낤�B";
		next;
		cutin "ep18_imril_03.png", 255;
		mes "[���H�Ԃ̃I�W�C]";
		mes "�N�͋A���B";
		mes "���H�Ԃ������悤�ɂȂ�����";
		mes "���̓���N���Ǘ�����񂶂�H";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "�����c�c";
		mes "���ς�炸��łȂ񂾂���B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�悵�A�����͂��ꂮ�炢�ɂ���";
		mes "�����グ�悤�B";
		mes "����ȏ�A�����ɂ�����";
		mes "������т��Ⴄ��B";
		delquest 11734;
		setquest 11735;
		cloakonnpc "�C������#ep18_sb3";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	if(checkquest(11735)) {
		mes "[���H�Ԃ̃I�W�C]";
		mes "�N�͋A���B";
		mes "���H�Ԃ������悤�ɂȂ�����";
		mes "���̓���N���Ǘ�����񂶂�H";
		next;
		cutin "ep18_imril_03.png", 2;
		mes "[�C������]";
		mes "�����c�c";
		mes "���ς�炸��łȂ񂾂���B";
		next;
		cutin "ep18_imril_04.png", 2;
		mes "[�C������]";
		mes "�悵�A�����͂��ꂮ�炢�ɂ���";
		mes "�����グ�悤�B";
		mes "����ȏ�A�����ɂ�����";
		mes "������т��Ⴄ��B";
		close2;
		cutin "ep18_imril_02.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(11734))
		showevent 0, 3, "�V�l#ep18_sb1";
	else
		showevent 9999,0,"�V�l#ep18_sb1";
	end;
}


oz_dun01.gat,112,30,0	script	#to_oz_dun02	45,1,1,{/* 8431 */
	warp "oz_dun02.gat",142,279;
	end;
}
oz_dun02.gat,142,284,0	warp	#to_oz_dun01	1,1,oz_dun01.gat,112,34	// 8432 from: oz_dun02.gat(142, 283)

rachel.gat,176,80,0	script	#�D�F�X�ԃX�^�[�g	139,5,5,{/* 15987 */
	if(checkquest(130111)) {
		cloakoffnpc "�×~�Ȓj��#E18_1";
		cloakoffnpc "�s�҂����q��#E18_2";
		mes "�]�×~�����Ȓj��";
		mes "�@�q����������Ă���]";
		next;
		if(select("�l�q�����Ă݂�","��������") == 2) {
			mes "�]���̏���������]";
			close;
		}
		mes "[�×~�Ȓj��]";
		mes "�s����̂Ȃ����Z���̂��O��";
		mes "�d��������Ă�����̂�";
		mes "���q�l�̍��z�Ɏ���o���Ƃ́I";
		mes "���`���A���O�̓N�r���I";
		mes "�����Ɏ�����I";
		next;
		misceffect 0,"�s�҂����q��#E18_2";
		mes "[�q��]";
		mes "�В��A���݂܂���ł����B";
		mes "�ǂ����N�r�����́c�c";
		mes "������̖�オ�v���ł��I";
		mes "���߂č��܂ł̋��������ł��c�c�B";
		next;
		emotion 28,"�s�҂����q��#E18_2";
		misceffect 0,"�s�҂����q��#E18_2";
		cloakonnpc "�s�҂����q��#E18_2";
		cloakoffnpc "�s�҂����q��#E18_4";
		emotion 6,"�×~�Ȓj��#E18_1";
		unittalk getnpcid(0,"�×~�Ȓj��#E18_1"),"�×~�Ȓj�� : �������A�ނ����B";
		mes "[�×~�Ȓj��]";
		mes "�͂��H�@���������I�H";
		mes "���z�𓐂�ł����ċ��^���ƁH";
		mes "�����𐿋��������̂́A���������I";
		mes "�������Ǝ�����I";
		next;
		delquest 130111;
		setquest 5932;
		cloakonnpc "�×~�Ȓj��#E18_1";
		close;
	}
	else if(checkquest(5932)) {
		cloakonnpc "�s�҂����q��#E18_2";
		cloakoffnpc "�s�҂����q��#E18_4";
	}
	else {
		cloakonnpc "�×~�Ȓj��#E18_1";
		cloakonnpc "�s�҂����q��#E18_2";
		cloakonnpc "�s�҂����q��#E18_4";
	}
	end;
OnQuestInfo:
	if(checkquest(130111))
		showevent 0, 3, "#�D�F�X�ԃX�^�[�g";
	else
		showevent 9999,0,"#�D�F�X�ԃX�^�[�g";
	end;
}
rachel.gat,169,79,0	script	#���o�p���[�v	45,{/* 15988 */}
rachel.gat,170,80,6	script	�×~�Ȓj��#E18_1	934,{/* 15989 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,172,80,4	script	�s�҂����q��#E18_2	944,{/* 15990 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,180,80,4	script	�s�҂����q��#E18_4	944,{/* 15991 (cloaking)*/
	if(checkquest(5932)) {
		mes "[�q��]";
		mes "�c�c���`���B";
		mes "�y�Ȏd������������";
		mes "���\�C�ɓ����Ă��񂾂���";
		mes "���݂��o�����Ⴕ�傤���˂���B";
		next;
		menu "���v�H",-;
		mes "[�q��]";
		mes "����H";
		mes "�Ȃ񂾁A�悻�҂��B";
		mes "����Ȃ�Ă���Ȃ����B";
		mes "�������炶�ጴ�Z���ւ̍��ʂ�";
		mes "���풃�ю�������ȁB";
		next;
		mes "�]�ڂ̑O�̎q���͂���������";
		mes "�@�����珬�K��������o�����]";
		next;
		mes "[�q��]";
		mes "�В����A�z����Ȃ��B";
		mes "�������񂾂͎̂В��̍��z�Ȃ̂ɁB";
		mes "���`�`�āA�������Ă邩�Ȃ��B";
		next;
		mes "[�q��]";
		mes "�����A�ɁA����A���A���A�낭�c�c";
		mes "���I";
		mes "���������В�����B";
		mes "����܂莝���Ă�˂��B";
		next;
		menu "�Ԃ��������ǂ��񂶂�Ȃ��H",-;
		mes "[�q��]";
		mes "�΂������O�I";
		mes "���͂������狋��������ĂȂ��́B";
		mes "����͐����ȕ�V���Ă킯�B";
		mes "���`���āA���Ǝ��������܂�����";
		mes "��������ň���g����Ƃ��邩�I";
		next;
		menu "���Ǝ����H",-;
		mes "[�q��]";
		mes "���O�A�ڂ��Ƃ��Ȃ��c�c";
		mes "�͂́`��A���Ă͉��̂������傢��";
		mes "���Ƃ̃A�C�f�A��m�肽���񂾂ȁH";
		next;
		mes "[�q��]";
		mes "���̎��Ƃ���`���C������Ȃ�";
		mes "�����Ă���Ă��������B";
		mes "���̋C������Ȃ�A���̂Ƃ���ɗ��ȁB";
		mes "�����ƁA���̖��O�������Ă�����";
		mes "���˂��ƂȁB";
		next;
		delquest 5932;
		setquest 5933;
	}
	mes "[���U�C]";
	mes "���̖��O�́u^0000FF���U�C^000000�v���B";
	mes "�Y���Ȃ�H";
	mes "���񂶂�ȁI";
	cloakonnpc "�s�҂����q��#E18_4";
	next;
	mes "-���U�C�̌��Ɍ������܂����H-";
	next;
	if(select("���U�C�̌��Ɍ�����","��߂Ă���") == 2) {
		mes "-���̏ꂩ�痣�ꂽ-";
		close;
	}
	mes "-���U�C�̌��Ɍ��������ɂ���-";
	close2;
	warp "rachel.gat", 70, 129;
	end;
OnQuestInfo:
	if(checkquest(5932))
		showevent 0, 3, "�s�҂����q��#E18_4";
	else
		showevent 9999,0,"�s�҂����q��#E18_4";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,66,135,0	script	#�t�����[���[���{�X	139,14,14,{/* 15992 */
OnTouch:
	if(checkquest(5933) || checkquest(5934)) {
		cloakoffnpc "���U�C#E18_5";
		cloakonnpc "���U�C#E18_7";
	}
	else if(checkquest(5935)) {
		cloakoffnpc "���U�C#E18_5";
		cloakoffnpc "�n�[�t�t�����[#E18_6";
		cloakonnpc "���U�C#E18_7";
	}
	else if(checkquest(5936)) {
		if(checkquest(5936)&8) {
			cloakonnpc "���U�C#E18_5";
			cloakonnpc "�n�[�t�t�����[#E18_6";
			cloakoffnpc "���U�C#E18_7";
		}
		else {
			cloakoffnpc "���U�C#E18_5";
			cloakonnpc "�n�[�t�t�����[#E18_6";
			cloakonnpc "���U�C#E18_7";
		}
	}
	else {
		cloakonnpc "���U�C#E18_5";
		cloakonnpc "�n�[�t�t�����[#E18_6";
		cloakonnpc "���U�C#E18_7";
	}
	end;
}
rachel.gat,70,135,4	script	���U�C#E18_5	944,{/* 15993 (cloaking)*/
	if(checkquest(5933)) {
		mes "[���U�C]";
		mes "�����������[�c�c";
		mes "���āA�Ȃ񂾁A�������̖`���҂��B";
		mes "�����ɗ������Ă��Ƃ́c�c";
		mes "���̎��Ƃ���`���Ă����񂾂ȁH";
		next;
		if(select("�b�𕷂�����","�����Ȃ�") == 2) {
			mes "[���U�C]";
			mes "�Ȃ񂾁A��₩������B";
			mes "�A��A��I";
			close;
		}
		mes "[���U�C]";
		mes "��[���A���̌��������ۂ�����";
		mes "��[��������I";
		mes "���̎��Ƃ��Ă̂́A���̊X��";
		mes "�Ԃ𔄂邱�Ƃ��I";
		next;
		menu "���ꂾ���H",-;
		mes "[���U�C]";
		mes "�͂��`���ꂾ����悻�҂́I";
		mes "�����̊X�ŉԂ𔄂���Ă̂�";
		mes "�ǂꂾ���v�V�I�Ȃ��Ƃ�";
		mes "�킩���Ă˂�����H";
		next;
		mes "[���U�C]";
		mes "���̊X�Ŕ����Ă�Ԃ�";
		mes "���`�`��ԑ��ԂȂ񂾁B";
		mes "�܂�A�U���I";
		mes "�����ǁA�������낤�Ƃ��Ă�̂�";
		mes "�{���̐��ԂȂ񂾂�I";
		next;
		menu "���Ԃ��ǂ�����Ď�ɓ����H",-;
		mes "[���U�C]";
		mes "�Ӂ`��A�s���ȁA�悻�ҁB";
		mes "�C�ɂ��������B";
		mes "���������A�������̂��Ă킯���B";
		next;
		mes "[���U�C]";
		mes "�u�n�[�t�t�����[�v���Ēm���Ă邩�H";
		mes "�����Ƃ��A���Z���łȂ���";
		mes "���������Ƃ��Ȃ����낤���ǂȁB";
		next;
		mes "[���U�C]";
		mes "�n�[�t�t�����[���Ă̂�";
		mes "�D�F�T�̐X�ɂ̂ݍ炭�Ԃ��B";
		mes "���̃I�g�����I�J����";
		mes "�v���|�[�Y���鎞�ɑ������񂾁B";
		next;
		mes "[���U�C]";
		mes "�I�J���͂Ƃ����Ɏ��񂶂܂���";
		mes "�I�g�������񂾂���ɂȂ��Ă邯��";
		mes "���̓I�g������";
		mes "�n�[�t�t�����[�ɂ���";
		mes "���낢�땷������Ă����̂��B";
		next;
		mes "[���U�C]";
		mes "�n�[�t�t�����[���炭�ꏊ��";
		mes "�؂̍����Ȃ牽�����񂾁c�c";
		mes "�΂̉��Ȃ炠���̂����́c�c";
		mes "���̑��Ȃ�c�c���Ăȕ��ɁB";
		next;
		mes "[���U�C]";
		mes "�܁A���������킯��";
		mes "�n�[�t�t�����[���d�����";
		mes "�X�Ŕ�����Ď��Ƃ��v�������̂��B";
		mes "���Ⴀ�A�������炪�{�肾�B";
		next;
		mes "[���U�C]";
		mes "�`���҂̃A���^�ɂ�";
		mes "�u�n�[�t�t�����[�v���d����Ă���";
		mes "�~�����񂾁B";
		mes "�܂��͈���I�ɏ��i�ƂȂ���̂�";
		mes "�d�����̂��厖������ȁB";
		next;
		if(select("��`��","���͖�����") == 2) {
			mes "[���U�C]";
			mes "�������I";
			mes "���������r�b�O�ɂȂ��";
			mes "�`�����X�Ȃ̂ɂȁI";
			close;
		}
		mes "[���U�C]";
		mes "�ւ��ւ��ցI";
		mes "���ꂶ��A���ƌ_�񂵂悤�B";
		mes "���ꂩ�牴�̂��Ƃ�";
		mes "�u�V���`���[����v�ƌĂԂ悤�ɁB";
		next;
		delquest 5933;
		setquest 5934;
		mes "[���U�C]";
		mes "����ɁA�Ј������";
		mes "�o�b�`�����Ă�邩��ȁB";
		mes "�܂��A�n�[�t�t�����[�̍̎���@����";
		mes "�����Ă�邩��";
		mes "�������ł�����A�b�������Ă���B";
		close;
	}
	if(checkquest(5934)) {
		mes "[���U�C]";
		mes "�����ق�I�@";
		mes "�n�[�t�t�����[�̍̏W�ɂ���";
		mes "�u�`���͂��߂�B";
		mes "�����͂������H";
		next;
		if(select("�n�߂Ă��������V���b�`���[����","������Ƒ҂���") == 2) {
			mes "[���U�C]";
			mes "�������Ə������Ă����`�B";
			close;
		}
		mes "[���U�C]";
		mes "�ł́A�n�߂邼�I";
		mes "�n�[�t�t�����[�̍̏W��";
		mes "�傫��������4�̍H���ɕ�������B";
		mes "�悸�n�߂Ɂu�s�v��؂�񂾁B";
		next;
		mes "[���U�C]";
		mes "��Ԗڂ́A�؂����s����";
		mes "�t���ς��������āc�c";
		next;
		mes "[���U�C]";
		mes "�O�Ԗڂɂ��Ԃ�}���������r��";
		mes "���Ɣ�`�̕������āc�c";
		mes "�悭������I";
		next;
		mes "[���U�C]";
		mes "�Ō�́A�������r�Ɍs�̐�[��Z����";
		mes "�Ԃ��ɂ܂Ȃ��悤�ɒ��J�ɕ�I";
		mes "�ق��A�����I";
		next;
		mes "[���U�C]";
		mes "�ȒP����H�@�܂����ۂɂ�";
		mes "�Ԃ��炢�Ă�ꏊ�ɂ����";
		mes "�s��؂�p�x�⏜������t���ς̐���";
		mes "���ɓ���镲�̗ʂ��Ⴄ����";
		mes "���ƂŃ}�j���A����n����B";
		next;
		mes "[���U�C]";
		mes "���āA���ځ`�B";
		mes "�����ɗ��K�p�̃n�[�t�t�����[������B";
		mes "�����ŗ��K���Ă��炤�B";
		next;
		delquest 5934;
		setquest 5935;
		cloakoffnpc "�n�[�t�t�����[#E18_6";
		mes "[���U�C]";
		mes "����́A�؂̉��ɍ炭�^�C�v��";
		mes "���Ƃ��邩�[�B";
		mes "�������ł�����Ԃ𒲂ׂĂ����B";
		close;
	}
	if(checkquest(5935)) {
		mes "[���U�C]";
		mes "���āA���ځ`�B";
		mes "�����ɗ��K�p�̃n�[�t�t�����[������B";
		mes "�����ŗ��K���Ă��炤�B";
		next;
		mes "[���U�C]";
		mes "����́A�؂̉��ɍ炭�^�C�v��";
		mes "���Ƃ��邩�[�B";
		mes "�������ł�����Ԃ𒲂ׂĂ����B";
		close;
	}
	if(checkquest(5936)) {
		if(countitem(1000407) == 0) {
			cloakoffnpc "�n�[�t�t�����[#E18_6";
			setquest 5935;
			delquest 5936;
			mes "[���U�C]";
			mes "�Ȃ񂾂��H";
			mes "���K�p�̃n�[�t�t�����[���͂�Ă�ȁB";
			mes "���ꂶ�ᔄ�蕨�ɂȂ�˂���B";
			mes "�������A���K���Ȃ���_�����B";
			close;
		}
		mes "[���U�C]";
		mes "����ꂡ�I";
		mes "�Ȃ��Ȃ���邶���B";
		mes "���o���������ď����邺�B";
		mes "���̗v�̂ŉԂ��d����Ă���񂾁B";
		next;
		mes "[���U�C]";
		mes "���Ȃ݂ɁA�Ԃ͑N�x�������I";
		mes "��ɓ��ꂽ�Ԃ�";
		mes "�ł��邾�����������ė��Ă����B";
		next;
		mes "[���U�C]";
		mes "�̎���@����肭���΂��̕�";
		mes "���������邩��ȁB";
		next;
		delitem 1000407,1;
		compquest 5936;
		cloakonnpc "���U�C#E18_5";
		cloakoffnpc "���U�C#E18_7";
		mes "[���U�C]";
		mes "���āA�{�i�I�Ȏd����";
		mes "���ꂩ�炾�I";
		mes "�܂����Ă����B";
		mes "���񂶂�ȁI";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(5933) || checkquest(5934) || (checkquest(5936) && !(checkquest(5936)&8)))
		showevent 0, 3, "���U�C#E18_5";
	else
		showevent 9999,0,"���U�C#E18_5";
	end;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,72,133,4	script	�n�[�t�t�����[#E18_6	10392,{/* 15994 (cloaking)*/
	if(checkquest(5935)) {
		mes "^0000FF�]���K�p�̃n�[�t�t�����[���]^000000";
		next;
		mes "[���U�C]";
		mes "����́A�؂̉��Ƀn�[�t�t�����[��";
		mes "�炢�Ă���Ƒz�肵���p�^�[����";
		mes "���K���邩��ȁB";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�N�G�X�g�E�B���h�E��";
		mes "�u�D�F�T�̐X�̉ԁv��";
		mes "�m�F���Đi�߂Ă݂܂��傤�B^000000";
		next;
		mes "[���U�C]";
		mes "�܂��́A�n�[�t�t�����[�̌s��؂�I";
		next;
		switch(select("10�x�̊p�x�Ő؂�","20�x�̊p�x�Ő؂�","30�x�̊p�x�Ő؂�","40�x�̊p�x�Ő؂�")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[���U�C]";
		mes "���͗t�𗎂Ƃ��B";
		mes "�c�������t���ψȊO��";
		mes "�S����������񂾂��B";
		next;
		switch(select("2�����c��","4�����c��","6�����c��","8�����c��")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[���U�C]";
		mes "���́A�r�ɐ�������񂾁B";
		next;
		switch(select("20ml������","30ml������","40ml������","50ml������")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[���U�C]";
		mes "������ꂽ��";
		mes "�����������`�̕���";
		mes "�r�ɓ���Đ��ƍ�����I";
		next;
		switch(select("2�O���������","4�O���������","6�O���������","8�O���������")) {
		}
		progressbar 1;	//color=0xffff00
		mes "[���U�C]";
		mes "�Ō�́A�؂����Ԃ�";
		mes "�r�ɓ���ĕ����΁I";
		mes "�ł���������[�[�I";
		next;
		// �̎���@�̈�v�Ő������ԉ���
		getitem2 1000407,1,1,0,0,0,0,0,0,1800;
		delquest 5935;
		setquest 5936;
		cloakonnpc "�n�[�t�t�����[#E18_6";
		mes "[���U�C]";
		mes "���Ⴀ�A���̎悵���n�[�t�t�����[��";
		mes "���ɓn���Ă���I";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(5935))
		showevent 0, 3, "�n�[�t�t�����[#E18_6";
	else
		showevent 9999,0,"�n�[�t�t�����[#E18_6";
	end;
OnInit:
	setnpctitle "���K�p";
	cloakonnpc;
	end;
}
rachel.gat,70,135,4	script	���U�C#E18_7	944,{/* 15995 (cloaking)*/
	if(checkquest(5942) && !checkquest(5943)) {
		cloakoffnpc "���q#E18_8";
		unittalk getnpcid(0,"���q#E18_8"),"���q : �ӂނӂށc�c";
		if(!sleep2(1000)) end;
		mes "[���U�C�В�]";
		mes "�����������[�I";
		mes "���q�l�I";
		mes "�����͉��������]�ł����H";
		next;
		mes "[���q]";
		mes "�ӂށc�c�����̃��c�����肢�����B";
		mes "�Ƃ���ŁA���k�Ȃ񂾂�";
		mes "�������Ĕz�B�T�[�r�X�͂���ĂȂ��́H";
		next;
		mes "[���q]";
		mes "���񔃂��ɗ���̂��ʓ|�łȁB";
		mes "�z�B�T�[�r�X������Ȃ�";
		mes "����ŗ��݂����񂾂��B";
		next;
		mes "[���U�C�В�]";
		mes "�͂��͂��`�I";
		mes "�z�B�T�[�r�X���������\�ł��I";
		mes "�Ȃɂ��A������n�߂��Ⴂ�܂�����I";
		next;
		mes "[���q]";
		mes "�قف`�����悩�����B";
		mes "�ł͍�������z�B���Ă���B";
		mes "�N�ɑ����ė~�����̂������邩��B";
		next;
		cloakonnpc "���q#E18_8";
		setquest 5943;
		compquest 5943;
		mes "[���U�C�В�]";
		mes "�c�c�Ƃ����킯���I";
		mes "�������炱�́w�t�����[���[���x��";
		mes "�z�B�T�[�r�X���J�n���邼�I";
		mes "�������A��`���Ă����ȁI";
		mes "�����V�N�I";
		close;
	}
	if(checkquest(5936) && checkquest(5936)&8) {
		mes "[���U�C�В�]";
		mes "�悵�I";
		mes "���Ⴀ�����牴�̓X";
		mes "�w�t�����[���[���x�̊J�Ǝ�����낤��";
		mes "�v���I";
		mes "���񂽂��Q�����Ă���B";
		next;
		mes "[���U�C�В�]";
		mes "�܂��̓V���`���[�̈��A���B";
		mes "�������ق�I";
		next;
		mes "[���U�C�В�]";
		mes "���̓��w���̐��ԃL���O�ɂȂ�!!";
		mes "���r�b�O�ɂȂ��Ă�邩��";
		mes "������Ƃ��A�����V�N�I";
		next;
		delquest 5936;
		setquest 5942;
		compquest 5942;
		mes "[���U�C�В�]";
		mes "�ȏ�I";
		mes "�J�Ǝ��I���I";
		mes "�����A�������[�[�I";
		next;
	}
	if(checkquest(5943)) {
		unittalk "���U�C�В� : �������A�͂肫���Ă����[�I";
		unittalk "���U�C�В� : �����͖ؗj���H�@�܂��܂��������[�[�I";
	}
	mes "[���U�C�В�]";
	mes "�����������V�N�ȁI";
	next;
	switch(select("���͎�`���Ȃ�","�n�[�t�t�����[�̍̏W","�n�[�t�t�����[�̔z��")) {
	case 1:
		mes "[���U�C�В�]";
		mes "���������I";
		mes "����Ȃ񂶂�r�b�O�ɂȂ�˂����I";
		close;
	case 2:
		if(checkquest(5947)) {
			mes "[���U�C�В�]";
			mes "�z�B�ɍs���񂾂�H";
			mes "�����͔z�B�ɐ�O���Ă����ȁI";
			close;
		}
		mes "[���U�C�В�]";
		mes "���I�@�n�[�t�t�����[�̍̏W��";
		mes "�s���Ă����̂��H";
		next;
		if(select("�̏W���Ă��܂�","����ς��߂܂�") == 2) {
			mes "[���U�C�В�]";
			mes "���������I";
			mes "����Ȃ񂶂�r�b�O�ɂȂ�˂����I";
			close;
		}
	case 3:
		if(checkquest(5947)) {
			mes "[���U�C�В�]";
			mes "�n���������ɏ����ꂽ";
			mes "����ɓ͂��Ă���B";
			mes "�ԈႦ��Ȃ�`�H";
			close;
		}
		if(checkquest(5949)) {
			delquest 5947;
			delquest 5949;
			setquest 5937;
			getitem 1000405,5;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			getexp 325000000,0,0;
			getexp 0,250000000,0;
			mes "[���U�C�В�]";
			mes "�Ԉ���������";
			mes "�Ԃ�͂��Ă˂����H";
			mes "�܁A�������I";
			mes "����͐�ɂ�����Ă邵�ȁI";
			mes "�o���˂��o���˂��I";
			next;
			mes "[���U�C�В�]";
			mes "���͋C��t���悤���I";
			mes "����ꂡ�I";
			close;
		}
		mes "[���U�C�В�]";
		mes "���I";
		mes "�z�B�ɏo�Ă����̂��B";
		mes "�ււ������邺�I";
		next;
		if(select("�z�B���������","����ς��߂�") == 2) {
			mes "[���U�C�В�]";
			mes "���������I";
			mes "����Ȃ񂶂�r�b�O�ɂȂ�˂����I";
			close;
		}
		getitem 1000407,1;	//���O����
		setquest 5947;
		mes "[���U�C�В�]";
		mes "������I";
		mes "������n������A�����ɏ����ꂽ";
		mes "����ɓ͂��Ă���B";
		mes "�ԈႦ��Ȃ�`�H";
		next;
		mes "[���U�C�В�]";
		mes "�Ԃɂ͂��񂽂̖��O�������Ă邪";
		mes "�m�F�葱���p������";
		mes "����܂�C�ɂ��Ȃ��ėǂ����B";
		mes "�񂶂�A�����V�N�ȁI";
		close;
	}
OnQuestInfo:
	if((checkquest(5936) && checkquest(5936)&8) || checkquest(5942))
		showevent 0, 3, "���U�C#E18_7";
	else
		showevent 9999,0,"���U�C#E18_7";
	end;
OnInit:
	setnpctitle "�t�����[���[��";
	cloakonnpc;
	end;
}
rachel.gat,67,134,8	script	���q#E18_8	10057,{/* 15996 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,114,66,2	script	�ԉ��̂��΂���#E18_9	701,{/* 15997 */
	end;
}
gw_fild01.gat,325,376,1	script	�n�[�t�t�����[#EP18_R01	10392,{/* 15998 */}
gw_fild01.gat,280,106,1	script	�n�[�t�t�����[#EP18_R02	10392,{/* 15999 */}

gw_fild01.gat,297,310,1	script	�n�[�t�t�����[#EP18_L01	10392,{/* 16001 */}
gw_fild01.gat,219,211,1	script	�n�[�t�t�����[#EP18_L02	10392,{/* 16002 */}
gw_fild01.gat,316,150,1	script	�n�[�t�t�����[#EP18_L03	10392,{/* 16003 */}
gw_fild01.gat,157,92,1	script	�n�[�t�t�����[#EP18_T01	10392,{/* 16004 */}
gw_fild01.gat,189,183,1	script	�n�[�t�t�����[#EP18_T02	10392,{/* 16005 */}
gw_fild01.gat,202,358,1	script	�n�[�t�t�����[#EP18_T03	10392,{/* 16006 */}
gw_fild01.gat,279,64,1	script	�n�[�t�t�����[#EP18_T04	10392,{/* 16007 */}
gw_fild01.gat,159,206,1	script	�n�[�t�t�����[#EP18_T05	10392,{/* 16008 */}
gw_fild01.gat,48,83,1	script	�n�[�t�t�����[#EP18_W01	10392,{/* 16009 */}

wolfvill.gat,78,222,1	script	�n�[�t�t�����[#EP18_W04	10392,{/* 16022 */}
wolfvill.gat,193,238,1	script	�n�[�t�t�����[#EP18_W05	10392,{/* 16023 */}
wolfvill.gat,208,245,1	script	�n�[�t�t�����[#EP18_W06	10392,{/* 16024 */}
wolfvill.gat,258,226,1	script	�n�[�t�t�����[#EP18_T09	10392,{/* 16025 */}
wolfvill.gat,130,203,1	script	�n�[�t�t�����[#EP18_T10	10392,{/* 16026 */}
wolfvill.gat,212,86,1	script	�n�[�t�t�����[#EP18_L08	10392,{/* 16027 */}

rachel.gat,135,208,6	script	���\�[#E18_D1	917,{/* 16030 */
	mes "[���\�[]";
	mes "�M���Ƀt���C���̌b�݂�";
	mes "����܂��悤�Ɂc�c�B";
	close;
}
rachel.gat,163,196,4	script	�����[#E18_D2	916,{/* 16031 */
	mes "[�����[]";
	mes "�M���Ƀt���C���̌b�݂�";
	mes "����܂��悤�Ɂc�c�B";
	close;
}
veins.gat,231,335,4	script	�A�[�V��#E18_D3	815,{/* 7609 */
	if(checkquest(5947)) {
		if(checkquest(5948)) {
			mes "[�A�[�V��]";
			mes "�n�[�t�t�����[�����ꂽ������";
			mes "�x�C���X�܂ŗ����b�オ����܂����B";
			close;
		}
		mes "[�A�[�V��]";
		mes "�������Ă�����";
		mes "���낻��͂����ȁH";
		mes "�����I";
		next;
		if(select("���Ԃ̂��͂��ɎQ��܂���","�l�Ⴂ�̂悤�ł�") == 2) {
			mes "[�A�[�V��]";
			mes "����́A�����l�ł��B";
			close;
		}
		delitem 1000407,1;
		setquest 5948;
		mes "[�A�[�V��]";
		mes "�҂��Ă܂����B";
		mes "�n�[�t�t�����[�Ƃ����̂ł����H";
		mes "�x�C���X�܂ŗ����b�オ����܂����B";
		close;
	}
}
veins.gat,192,345,6	script	�}�[�V��#E18_D4	817,{/* 7610 */
	if(checkquest(5947)) {
		if(checkquest(5948)) {
		}
		mes "[�}�[�V��]";
		mes "�m�荇�������Ԃ𑗂��Ă�����";
		mes "�����Ă��܂����B";
		mes "����A�Y��Ȃ��ԁc�c�B";
		mes "�ł����̍D�݂Ƃ͂�����ƈႢ�܂��ˁB";
		next;
		if(select("���Ԃ̂��͂��ɎQ��܂���","�l�Ⴂ�̂悤�ł�") == 2) {
			mes "[�}�[�V��]";
			mes "�����ł����B";
			mes "����́A�c�O�ł��B";
			close;
		}
	}
	mes "[�}�[�V��]";
	mes "�m���Ă܂����H";
	mes "�킽���̒��Ă���ߑ���";
	mes "�C�̌������̂ǂ����ɂ���";
	mes "���V��Ƃ����X�̓`���ߑ��Ȃ�ł��B";
	close;
}
rachel.gat,31,89,6	script	�e�B�[�����O#E18_D5	91,{/* 16032 */
	mes "[�e�B�[�����O]";
	mes "��������Ⴂ�܂��`�B";
	mes "�I�v�ȓ`�����ւ郉�w�����폤�X�ł��B";
	mes "���A�������I";
	mes "������x�e�ɓ���񂾂����I";
	close;
}
rachel.gat,55,106,6	script	�f�B�[�����O#E18_D6	724,{/* 16033 */
	mes "[�f�B�[�����O]";
	mes "�����ŏ������͓��A�֍s���I";
	mes "�Ƃ�����������܂��B";
	mes "�c�c�R�ł��B";
	mes "���ɈӖ��͂���܂���B";
	close;
}
wolfvill.gat,90,261,6	script	�[�C��#E18_D7	959,{/* 16034 */
	if(checkquest(5947)) {
		mes "[�[�C��]";
		mes "�c�c�悻�ҁH";
		mes "�܂����A�Ԃ�z�B���Ă�́H";
		mes "�������肢���������ԉ�����Ƃ�";
		mes "�Ⴄ�悤�����ǁc�c�B";
		next;
		if(select("���Ԃ̂��͂��ɎQ��܂���","�l�Ⴂ�̂悤�ł�") == 2) {
			mes "[�[�C��]";
			mes "�����c�c";
			mes "������̂Ȃ炲�߂�Ȃ����B";
			close;
		}
		delitem 1000407,1;
		setquest 5949;
		mes "[�[�C��]";
		mes "���`�`��H";
		mes "�����̖��O�ɐS�������";
		mes "�����̂�����ǁc�c";
		mes "�܂��A�������B";
		close;
	}
	if(checkquest(5949)) {
		mes "[�[�C��]";
		mes "���`�`��H";
		mes "�����̖��O�ɐS�������";
		mes "�����̂�����ǁc�c";
		close;
	}
	mes "[�[�C��]";
	mes "�l�����Ȃ��ꏊ��T����";
	mes "�����ɗ����̂������";
	mes "�ǂ��ɂł��l�͂�����̂ˁB";
	close;
}
wolfvill.gat,269,68,4	script	�Z�C��#E18_D8	960,{/* 16035 */
	if(checkquest(5947)) {
		mes "[�Z�C��]";
		mes "���ԁc�c�˂��B";
		mes "�����܂Ŗ{���ɓ͂��̂�����H";
		next;
		if(select("���Ԃ̂��͂��ɎQ��܂���","�l�Ⴂ�̂悤�ł�") == 2) {
			mes "[�Z�C��]";
			mes "�ӁA�ӂ�I";
			mes "���҂Ȃ�Ă��ĂȂ��񂾂���I";
			close;
		}
	}
	if(checkquest(5949)) {
		mes "[�Z�C��]";
		mes "����ς肱��ȏꏊ����";
		mes "���ԂȂ�ē͂��Ȃ��̂ˁc�c";
		mes "������B";
		close;
	}
	mes "[�Z�C��]";
	mes "�D�F�T�̑��ւ悤�����`�I";
	close;
}
wolfvill.gat,171,253,5	script	�G�[�L�G��#hms01	930,5,5,{/* 16036 */
	if(EP18_1QUE < 36) {
		mes "[�G�[�L�G��]";
		mes "�����ɗ������Ƃ�";
		mes "�ԈႢ�ł͂Ȃ������c�c�B";
		next;
		mes "^ff0000�]�N�G�X�g�u�킽���̂����͂ǂ��v��";
		mes "�@���L�̏����𖞂����Ɛi�s�\�ł��B";
		mes "�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(17504)) {
		mes "[�G�[�L�G��]";
		mes "���N��肽���̐��������肢���܂��B";
		mes "�f�Ï��͂��̑���";
		mes "�K�v�Ȏ{�݂Ȃ�ł��B";
		close;
	}
	if(checkquest(17505)) {
		cloakoffnpc "�}����#hms01";
		mes "[�G�[�L�G��]";
		mes "���N��肽���͂ǂ��������H";
		mes "�܂��A���̕\��������";
		mes "�����悻�@���������ǁB";
		next;
		mes "^0000FF�]�V�l�����Ƙb�������e��";
		mes "�@�G�[�L�G���ɓ`�����]^000000";
		next;
		mes "[�G�[�L�G��]";
		mes "�����ł������B";
		mes "�ł��A���͒��߂܂����B";
		mes "�����Ȃ�΁A�Ӓn�ł��f�Ï���";
		mes "���ĂĂ݂��܂�����I";
		next;
		mes "[�G�[�L�G��]";
		mes "�^�����Ă����l�����܂�����ˁB";
		mes "�ނ�������������Ă���邻���ł�����";
		mes "��C�ɂȂ��Ă���_�����Ă��Ƃł��B";
		next;
		mes "[�G�[�L�G��]";
		mes "�����Ŗ`���җl�ɂ��肢������̂ł���";
		mes "�u^ff0000�x���[�J�^�C����^000000�v���u^ff000010��^000000�v";
		mes "���B���ė��Ă��炦�܂��񂩁H";
		mes "���z���ނƂ��ĕK�v�Ȃ̂ł���";
		mes "���ł͎�ɓ�����Ȃ��āc�c�B";
		next;
		menu "�����Ă��܂�",-;
		mes "[�G�[�L�G��]";
		mes "���肪�Ƃ��������܂��I";
		mes "�u�x���[�J�^�C�����v��";
		mes "�O���C�E���t��|���Ǝ�ɓ���܂��B";
		mes "�ł́A�H���̏����Ɏ��|���낤�B";
		mes "�}��������`���Ă���B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�����A�͎d���͋��Ȃ񂾂��ǁc�c�B";
		delquest 17505;
		setquest 17506;
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�}����#hms01";
		end;
	}
	if(checkquest(17506)) {
		if(countitem(1000406) < 10) {
			mes "[�G�[�L�G��]";
			mes "�`���җl�ɂ��肢������̂ł���";
			mes "�u�x���[�J�^�C�����v���u10�v��";
			mes "���B���ė��Ă��炦�܂��񂩁H";
			mes "���z���ނƂ��ĕK�v�Ȃ̂ł���";
			mes "���ł͎�ɓ�����Ȃ��āc�c�B";
			next;
			mes "[�G�[�L�G��]";
			mes "�u�x���[�J�^�C�����v��";
			mes "�O���C�E���t��|���Ǝ�ɓ���܂��B";
			mes "��낵�����肢���܂��B";
			close;
		}
		mes "[�G�[�L�G��]";
		mes "�ޗ��������ė��Ă����������̂ł��ˁI";
		mes "���肪�Ƃ��������܂��I";
		mes "�f�Ï�������������";
		mes "�u"+strcharinfo(0)+"�f�Ï��v��";
		mes "���Â������Ă��������܂���I";
		next;
		cloakoffnpc "�}����#hms01";
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "����I�@����͂����l�����B";
		mes "�����i���A�`���җl�̖��O��";
		mes "�����Ɏc��܂���B";
		next;
		cutin "ep18_maram_02.png", 255;
		cloakoffnpc "�V�l#hms01";
		cloakoffnpc "�V�l#hms02";
		cloakoffnpc "�V�l#hms03";
		mes "[�V�l]";
		mes "�����I";
		mes "�������Ă���񂶂�I";
		mes "�܂����A�f�Ï������Ă���肩�H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����c�c";
		mes "�݂Ȃ���A���������Ă��������B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[�V�l]";
		mes "�N��͗��������Ă��邼�H";
		mes "�O�ɂ��������͂����Ⴊ";
		mes "���ɐf�Ï������Ă邱�Ƃ͋�����B";
		next;
		mes "[�G�[�L�G��]";
		mes "�f�Ï����o�����";
		mes "����܂Ŏ����Ȃ������a�C������";
		mes "�������Ƃ��ł����ł��I";
		mes "�֗��ȕ�炵�����󂷂邱�Ƃ�";
		mes "�ǂ����Ĕ��΂���̂ł����H";
		next;
		mes "[�V�l]";
		mes "�ڏZ�̖��֗̕��ȋZ�p��";
		mes "�N��̕������_���ɂ���B";
		mes "��x�A�󂯓��ꂽ��";
		mes "�̂̕����ɖ߂��悤�ɂȂ邼�B";
		next;
		mes "[�V�l]";
		mes "�����ɈڏZ���āA���ɕ�炷�Ƃ����Ȃ�";
		mes "�N��̕����ɂȂ���ł����˂΁B";
		mes "���ꂪ�o����ƌ����Ȃ�";
		mes "�󂯓����킯�ɂ͂�����I";
		next;
		mes "[�G�[�L�G��]";
		mes "�b�ɂȂ�Ȃ��I";
		mes "�@";
		mes "[�V�l]";
		mes "����͂�����̑䎌����I";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "���`�`��B";
		mes "�܂荇�����������ɂȂ��ł��ˁB";
		mes "�������Ȃ��c�c����H";
		next;
		cutin "ep18_maram_02.png", 255;
		cloakoffnpc "���l#hms01";
		cloakoffnpc "������#hms01";
		mes "[���G��]";
		mes "�ɂ����I";
		mes "�ɂ��悧�[�[�[�I";
		next;
		mes "[�V�l]";
		mes "���G��!?";
		mes "�ǂ������񂶂�I";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�ו��^�т̓r���Ŏ��̂������Ă��B";
		mes "�����ɗ���Ύ蓖�Ă��ł��邩�Ǝv����";
		mes "�A��ė����񂾁B";
		next;
		cutin "ep18_imril_01.png", 255;
		emotion 28,"������#hms01";
		mes "[���G��]";
		mes "�{�N�͂����_�������I";
		mes "�{�N�����񂾂�A�撣���ďW�߂�";
		mes "�S���Y�Ƌ��ɑ����Ă���I";
		mes "����ł��A�W�߂����Y��";
		mes "�N�ɂ�����I";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "���������B";
		mes "���ꂮ�炢���ᎀ�ɂ₵�Ȃ��B";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[�V�l]";
		mes "�ǂ�ǂ�c�c";
		mes "����Ⴀ�A�Б������S�Ƀ_���ɂȂ��Ƃ�B";
		mes "�؂藎�Ƃ��ɂ�Ȃ��B";
		next;
		mes "[���G��]";
		mes "������!?";
		next;
		mes "[�V�l]";
		mes "���̌�A��p��h���Ă�����";
		mes "����񂶂�낤�B";
		next;
		mes "[���G��]";
		mes "�h�����i�M�̂��ꂳ��݂�����";
		mes "�r��؂藎�Ƃ��ꂿ�Ⴄ��ł����`!?";
		mes "����̓_���I";
		mes "���̑O�ɔ��������[�N�u�[�c��";
		mes "�����Ȃ��Ȃ����Ⴄ�`�`�I";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "�S�z����́A�����Ȃ́H";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[�G�[�L�G��]";
		mes "�r�͐؂藎�Ƃ��Ȃ���B";
		mes "�������Â��邩��B";
		next;
		mes "[�V�l]";
		mes "�ȂɁH";
		mes "����Ȃɍ����L��l�Ȃ̂ɂ�!?";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���v�ł���B";
		mes "�G�[�L�G���͂���������";
		mes "���r�Ȃ�ł�����B";
		next;
		cutin "ep18_maram_02.png", 255;
		misceffect 14,"������#hms01";
		mes "[�G�[�L�G��]";
		mes "���������āA�Ƃ͂Ȃ񂾁H";
		mes "�ӂ��c�c�ݔ����������Ă����";
		mes "�����Ə�肭�ł���̂Ɂc�c�B";
		mes "�܂��A�d�����Ȃ��B";
		mes "����႟���`�`�`�I";
		next;
		misceffect 101,"������#hms01";
		mes "[���G��]";
		mes "���Ⴀ�[�[�[�I";
		mes "���ʁ[�[�[��!!!";
		unittalk getnpcid(0,"�V�l#hms01"),"����Ȃ�!!";
		unittalk getnpcid(0,"�V�l#hms02"),"����ŎE���Ă��܂��񂶂�Ȃ��̂��H";
		unittalk getnpcid(0,"�V�l#hms03"),"�����~�߂�񂶂�`�`�I";
		delitem 1000406,10;
		delquest 17506;
		setquest 17507;
		close;
	}
	if(checkquest(17507)) {
		misceffect 305,"������#hms01";
		misceffect 14,"������#hms01";
		mes "[�G�[�L�G��]";
		mes "�c�c�͂��A�I���܂����B";
		mes "���΂炭�͖�������";
		mes "�h�{�̂�����̂�H�ׂ��";
		mes "�����ɃW���M���O���炢��";
		mes "�ł���悤�ɂȂ�܂���B";
		next;
		mes "[���G��]";
		mes "�������I�@�S�R�ɂ��Ȃ�!!";
		mes "�r��؂藎�Ƃ��ꂸ�ɍς񂾁I";
		mes "�搶�̓{�N�̃u�[�c��";
		mes "����Ă��ꂽ��ł��ˁI";
		next;
		cutin "ep18_imril_01.png", 2;
		mes "[�C������]";
		mes "����ȂɃu�[�c���厖�������́H";
		next;
		cutin "ep18_imril_01.png", 255;
		mes "[�V�l]";
		mes "�ȁA�Ȃ�Ɓc�c";
		mes "�ŋ߂̈�ÂƂ����̂�";
		mes "����ȂЂǂ������������̂��H";
		next;
		mes "[�G�[�L�G��]";
		mes "�������ł��B";
		mes "�X�ɂ�����Ƃ����{�݂Ɠ�������";
		mes "��芮���Ȏ��Â��{���܂��B";
		next;
		mes "[�V�l]";
		mes "�Ӂ`�`�ށI";
		mes "�����̖`���҂̕��I";
		mes "�{���Ȃ̂��ˁH";
		next;
		menu "�{���ł���",-;
		mes "[�V�l]";
		mes "�������I";
		mes "�N�͊����������I";
		mes "�N�͐f�Ï������Ă邱�ƂɎ^������I";
		next;
		mes "[�G�[�L�G��]";
		mes "���H";
		next;
		mes "[�V�l]";
		mes "�N������I";
		mes "����Ȑ������̂�������ꂽ��";
		mes "���΂���C�ɂ��Ȃ��I";
		next;
		mes "[�V�l]";
		mes "���オ�ς�����C�����邼�I";
		mes "���˂΂Ȃ�ʁI";
		mes "���̑傫�Ȕg�Ɂ`!!";
		next;
		cloakonnpc "�V�l#hms01";
		cloakonnpc "�V�l#hms02";
		cloakonnpc "�V�l#hms03";
		mes "[�G�[�L�G��]";
		mes "�����Ɓc�c";
		mes "�f�Ï������ĂĂ��ǂ����Ă��ƁH";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�c�c��̂Ђ�Ԃ����X�S�C����";
		mes "�Ƃ肠��������S���ˁB";
		next;
		cutin "ep18_imril_02.png", 2;
		mes "[�C������]";
		mes "�܂������b�ɂ��Ă����ĂȂ��񂾂���";
		mes "���ǂȂ񂾂����̂�???";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�͂͂́I";
		mes "��������܂ňȏ��";
		mes "�ǂ��Ȃ���Ă��Ƃ���B";
		mes "�`���җl�����͓Y��";
		mes "���肪�Ƃ��������܂����B";
		next;
		cutin "ep18_maram_02.png", 255;
		mes "[�G�[�L�G��]";
		mes "��������󂯎�肭�������B";
		mes "���������Ă��Ă��d���Ȃ��ł�����B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		delquest 17507;
		setquest 17509;
		getitem 1000405,2;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		setquest 130127;
		compquest 130127;
		mes "[�G�[�L�G��]";
		mes "�܂��������肢���邱�Ƃ�";
		mes "���邩������܂���";
		mes "���̎��́A��낵�����肢�������܂��I";
		cloakonnpc "�}����#hms01";
		cloakonnpc "���l#hms01";
		cloakonnpc "������#hms01";
		close;
	}
	if(checkquest(17509)) {
		mes "[�G�[�L�G��]";
		mes "���ނ̒��B�A���肪�Ƃ��������܂��B";
		mes "���i�K�ł͏\���ɑ���Ă��܂���";
		mes "�ʂ̓��ɂȂ�����";
		mes "�V���ɂ��肢���邩������܂���B";
		mes "���̎��́A�܂���낵�����肢���܂��I";
		close;
	}
	mes "[�G�[�L�G��]";
	mes "�G�[�L�G���A���O�͕x�M�h�؂�";
	mes "�ɂ߂�ׂ�";
	mes "�����ɗ����Ƃł������̂��H";
	next;
	mes "[�G�[�L�G��]";
	mes "����A�Ⴄ�B";
	mes "�����Ő����邱�Ƃ�";
	mes "���̖{���̓����B";
	mes "�X�ɋ������A���͂�����";
	mes "�ٖM�l�̂܂܂��낤�B";
	next;
	mes "[�G�[�L�G��]";
	mes "�����ł��ٖM�l��������Ă���̂ɁH";
	mes "�X�����̑����ς��Ȃ��̂Ȃ�";
	mes "�y�ȕ�炵���ł���X��";
	mes "�߂�ׂ�����Ȃ��̂��H";
	next;
	mes "[�G�[�L�G��]";
	mes "���ӂł��Ȃ��B";
	mes "���̖ڕW�́A���̃��[�c��";
	mes "�T�����ƂȂ̂�����B";
	next;
	menu "���̐l�́c�c�H",-;
	cloakoffnpc "�}����#hms01";
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "���ς�炸���Ȃ��c�c";
	mes "�G�[�L�G���I";
	mes "���C�ɂ��Ă�H";
	mes "�����ԂԂƂ茾�������Ă�񂾂��H";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�G�[�L�G��]";
	mes "�����A�}�����I";
	mes "�����ɂ͒m�荇�������Ȃ�����";
	mes "�Y�݂𕷂��Ă����̂�";
	mes "�}�����������Ȃ������񂾁I";
	mes "���̔Y�݂𕷂��Ă���I";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "�킩�����킩�����B";
	mes "�Y�݂𕷂�����A�������������āB";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�G�[�L�G��]";
	mes "���͌N�̗U�����󂯂�";
	mes "�q�����̈������̑���";
	mes "�f�Ï������Ă邽�߂ɗ����񂾁B";
	mes "�Ƃ��낪�A�f�Ï������Ă悤�Ƃ����";
	mes "���̔N��肽�����ז�������񂾂�B";
	next;
	mes "[�G�[�L�G��]";
	mes "�ŐV�̈�ËZ�p�𑵂���";
	mes "�f�Ï��Ȃ񂾂�I�@�Ȃ̂�";
	mes "���̑��ɈڏZ�̖��̋Z�p���������ނȁI";
	mes "���Z���̕�����j�󂷂�C���I����";
	mes "����[����[�����o���񂾁I";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�X�A�h�ɂ͑��k�����́H";
	mes "������`�̉�݂����ȃX�A�h�Ȃ�";
	mes "�f�Ï������Ă邱�Ƃ�";
	mes "���΂͂��Ȃ��͂������ǁB";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�G�[�L�G��]";
	mes "�������A���k�������B";
	mes "�����A���̘V�l�����̈ӌ���";
	mes "��������킯�ɂ͂����Ȃ�����";
	mes "�������邽�߂̎��Ԃ�����ƌ�����";
	mes "���������i�W�������񂾁B";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "���`�`��B";
	mes "�X�A�h���Z��������";
	mes "��񂵂ɂ���Ă�̂����Ȃ��B";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�G�[�L�G��]";
	mes "���̂܂ܐf�Ï������Ă��Ȃ��Ȃ�";
	mes "���w���ɖ߂낤���ƍl���Ă�񂾁B";
	mes "�����͕s�ւ����A�ړI���ʂ����Ȃ��Ȃ�";
	mes "�y�ȕ�炵���ł���X��";
	mes "�߂낤���Ȃ��āB";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "���`�`��c�c";
	mes "�N�ɖ����������ė��Ă�������̂�";
	mes "���ɐf�Ï����������Ȃ���";
	mes "�v��������Ȃ񂾂��ǁc�c";
	mes "�悵�A�킩�����I";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "���Ɩ`���җl�Ƃ�";
	mes "���N����������Ă݂��B";
	mes "�c�c���̊�łȐl������";
	mes "��������͍̂����܂�邾�낤����";
	mes "���̂܂ܕ����Ă͂����Ȃ��B";
	next;
	mes "[�}����]";
	mes "�`���җl�A�ǂ�����`���Ă��������B";
	mes "���̑��ɂ͐f�Ï����K�v�ł��B";
	mes "�̂Ȃ���̖��ԗÖ@�ł͕a�C��";
	mes "����������̂ɂ����E������܂��B";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�G�[�L�G��]";
	mes "����������肢���܂��B";
	mes "�c�c�������Z���̏o�g�Ȃ̂�";
	mes "�����̐l�X�̖��ɗ��������̂ł��B";
	mes "�ǂ������肢�������܂��B";
	delquest 130107;
	setquest 17504;
	close2;
	cloakonnpc "�}����#hms01";
	end;
OnTouch:
	if(checkquest(130107))
		unittalk "�G�[�L�G�� : �G�[�L�G���A���O�͕x�M�h�؂��ɂ߂�ׂɁA�����ɗ����Ƃł������̂��H";
	end;
OnQuestInfo:
	if(checkquest(17506) && countitem(1000406) < 10)
		showevent 0, 2, "�G�[�L�G��#hms01";
	else if(checkquest(130107) || checkquest(17505) || checkquest(17506) || checkquest(17507))
		showevent 0, 3, "�G�[�L�G��#hms01";
	else
		showevent 9999,0,"�G�[�L�G��#hms01";
	end;
}
wolfvill.gat,174,252,3	script	�}����#hms01	10376,{/* 16037 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,175,249,1	script	�V�l#hms01	10393,{/* 16038 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,173,247,1	script	�V�l#hms02	10394,{/* 16039 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,170,248,7	script	�V�l#hms03	10395,{/* 16040 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,170,251,5	script	���l#hms01	931,{/* 16041 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,172,250,1	script	������#hms01	849,{/* 16042 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,167,253,1	script	���ݎ���#hms01	10250,{/* 16043 */}
wolfvill.gat,166,252,1	script	���ݎ���#hms02	10250,{/* 16044 */}
wolfvill.gat,165,254,1	script	���ݎ���#hms03	10024,{/* 16045 */}
wolfvill.gat,165,250,1	script	���ݎ���#hms04	10026,{/* 16046 */}
wolfvill.gat,164,251,1	script	���ݎ���#hms05	10025,{/* 16047 */}
wolfvill.gat,176,111,3	script	�V�l#hms04	10393,{/* 16048 */
	if(checkquest(17504)) {
		mes "[�V�l]";
		mes "���̑O�A���ɗ����l������";
		mes "��肭�Ȃ���ł��ꂽ�炵���̂��B";
		next;
		mes "[�V�l]";
		mes "������x�A��ɍs���Ƃ��悤���B";
		next;
		mes "[�V�l]";
		mes "����܂萢�b���Ă��߂���ȁB";
		mes "��������������񂶂�Ȃ����B";
		mes "�N��̎���Ƃ͈Ⴄ����̂��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����ɂ��́B";
		mes "���A�����Ԃ�낵���ł��傤���B";
		next;
		cutin "ep18_maram_01.png", 255;
		menu "����ɂ���",-;
		mes "[�V�l]";
		mes "���������I";
		mes "�}�����Ɓc�c";
		mes "�O���炫���`���҂̐l���ȁH";
		next;
		mes "[�V�l]";
		mes "���ԂȂ���ł����邼�B";
		mes "�N��͎Ⴂ�O�ƈ����";
		mes "������d���͂��Ƃ�񂩂�̂��B";
		next;
		mes "[�V�l]";
		mes "�Ȃ񂼁A�����Ă邱�Ƃł�";
		mes "����̂��ˁH";
		next;
		menu "�f�Ï��̌��ŗ��܂���",-;
		mes "[�V�l]";
		mes "�Ȃɂ��`�H";
		mes "�f�Ï�����Ɓ`�H";
		next;
		mes "[�V�l]";
		mes "����ɂ́A�����b���������H";
		mes "���̑��ɐV�����f�Ï��͕K�v�Ȃ����āB";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "��Î{�݂͑厖�Ȃ�ł���H";
		mes "�ŐV�̈�Â��󂯂�����������";
		mes "�a�C�ɂȂ��Ă�";
		mes "�����Ɏ��Âł����ł��B";
		mes "���䂾���āc�c�B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�V�l]";
		mes "���܂ł̂����Ŗ��Ȃ������񂶂�B";
		mes "�a�C��������B";
		mes "�ڏZ�̖��̋Z�p�╶����";
		mes "���̑��Ɏ������܂�ł���B";
		next;
		mes "[�V�l]";
		mes "�֗��Ƃ����������b����Ȃ��B";
		mes "�N�炪�V�����Z�p���󂯓���Ă��܂���";
		mes "����͈ڏZ�̖��̕�����";
		mes "�󂯓���Ă��܂��Ƃ������Ƃ���B";
		next;
		mes "[�V�l]";
		mes "���O������ɂ͐��b�ɂȂ��Ă��邪";
		mes "�f�Ï��̌��͕ʂ���B";
		mes "���̃G�[�L�G���Ƃ����z�ɂ�";
		mes "�N�炪���߂Č����Ă�������";
		mes "���̌��ɂ͂����ւ���ł���B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�Ӂ`�ށB";
		mes "�Ȃ��Ȃ��苭���ł��ˁB";
		mes "�������ł͂Ȃ��Ɓc�c";
		mes "�X�A�h������Ă��킯�ł��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "��������A�G�[�L�G���̂Ƃ����";
		mes "�߂�܂��傤���B";
		mes "�ǂ����邩�l���Ȃ��ƁB";
		delquest 17504;
		setquest 17505;
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(checkquest(17505)) {
		mes "[�V�l]";
		mes "���O������ɂ͐��b�ɂȂ��Ă��邪";
		mes "�f�Ï��̌��͕ʂ���B";
		mes "���̃G�[�L�G���Ƃ����z�ɂ�";
		mes "�N�炪���߂Č����Ă�������";
		mes "���̌��ɂ͂����ւ���ł���B";
		close;
	}
	mes "[�V�l]";
	mes "�V�������ɗ����҂�����";
	mes "�K�˂Ă݂�Ƃ��悤���̂��B";
	close;
OnQuestInfo:
	if(checkquest(17504))
		showevent 0, 3, "�V�l#hms04";
	else
		showevent 9999,0,"�V�l#hms04";
	end;
}
wolfvill.gat,174,111,5	script	�V�l#hms05	10394,{/* 16049 */
	mes "[�V�l]";
	mes "�������������Ƃ������";
	mes "���k�ɏ��܂����H";
	close;
}
wolfvill.gat,178,110,3	script	�V�l#hms06	10395,{/* 16050 */
	mes "[�V�l]";
	mes "�N��ɕ����������Ƃł�";
	mes "����̂��ˁH";
	close;
}
wolfvill.gat,154,217,3	script	�T���i#cmm01	10399,{/* 16051 */
	mes "[�T���i]";
	mes "���ɂ͎�Ƀg�E�����R�V�ⓤ��A����B";
	mes "����ȏꏊ�ł��ǂ������ˁB";
	next;
	mes "[�T���i]";
	mes "�W���K�C���̈炿�������B";
	mes "�ł��A����ȊO�́c�c";
	mes "�͂��A���������g�����H�ו���";
	mes "�������ς��H�ׂ����Ȃ��B";
	close;
}
wolfvill.gat,146,131,1	script	���̎q��#cmm01	10402,{/* 16052 */
	mes "[���̎q��]";
	mes "���̕��΂̒���";
	mes "�W���K�C�����B�����񂾁`�B";
	mes "�_���ȉ�������߂Â��Ȃ���";
	mes "��l�����͌�������";
	mes "�m������������Ȃ��ˁB�ււ��I";
	next;
	mes "[���̎q��]";
	mes "�Ă��|�e�g�c�c";
	mes "�������񂾁B";
	mes "�����Ă��Ȃ����ȁ`�I";
	close;
}
wolfvill.gat,192,146,3	script	�I�n#cmm01	10395,{/* 16053 */
	mes "[�I�n]";
	mes "����őS�����H";
	mes "��������Ă��ʂ�����Ȃ�����";
	mes "�܂��A�K���ł������B";
	close;
}
wolfvill.gat,123,162,7	script	�[��#cmm01	10394,{/* 2413 */
	mes "[�[��]";
	mes "���Ẩ���";
	mes "���̑��ƐX�����ݍ��܂Ȃ��悤��";
	mes "������苋���c�c�B";
	close;
}
wolfvill.gat,147,97,5	script	�A�q�[��#ep18	944,3,3,{/* 16054 */
	if(EP18_1QUE < 36) {
		mes "[�A�q�[��]";
		mes "�����A�悻�ҁc�c�B";
		next;
		mes "^ff0000�]�N�G�X�g�u����܂���v��^000000";
		mes "^ff0000�@���L�̏����𖞂����Ɛi�s�\�ł��B^000000";
		mes "^ff0000�@�EBaseLv210�ȏ�^000000";
		mes "^ff0000�@�E4���E�A�g��4���E^000000";
		mes "^ff0000�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(16548)) {
		if(!(checkquest(16548)&4)) {
			//������
		}
		mes "[�A�q�[��]";
		mes "���肪�Ƃ��������܂��I";
		mes "���������܂ō���͂�������";
		mes "���ꂻ���ł��B";
		next;
		mes "[�A�q�[��]";
		mes "�����ɂȂ�ƁA�܂��߂��Ă������Ȃ̂�";
		mes "�����ς������܂�������";
		mes "�s���Ă���������Ƃ��肪�����ł��B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		delquest 16548;
		setquest 16550;
		getitem 1000405,4;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		getexp 487500000,0,0;
		getexp 0,500000000,0;
		setquest 130133;
		compquest 130133;
		mes "[�A�q�[��]";
		mes "������́A���ӈ����ł��邱�Ƃւ�";
		mes "���ӂ̈�ł��B";
		mes "�ǂ����󂯎���Ă��������I";
		close;
	}
	if(checkquest(16550)) {
		mes "[�A�q�[��]";
		mes "�����ɂȂ�ƁA�܂��߂��Ă������Ȃ̂�";
		mes "�����ς������܂�������";
		mes "�s���Ă���������Ƃ��肪�����ł��B";
		close;
	}
	mes "[�A�q�[��]";
	mes "����H�@���o���̂Ȃ��l�B";
	mes "���������āA���̐V�����Z�l�ł����H";
	mes "�ӂ��������c�c�B";
	next;
	menu "���������ł��ˁH",-;
	mes "[�A�q�[��]";
	mes "�c�c����B";
	mes "��̊D�F�T�̐X��";
	mes "�Ƃ��Ă����������񂾁B";
	next;
	mes "[�A�q�[��]";
	mes "�R�I���M�̖�����";
	mes "��l�����̎G�k�B";
	mes "����ɏb�̜p�j���鉹�c�c";
	mes "���ǈ�Ԃ��邳���̂�";
	mes "�����X�^�[�̖����ł��B";
	next;
	mes "[�A�q�[��]";
	mes "�ӂ����c�c�A���̒��ł�";
	mes "��Ԃ��邳���̂�";
	mes "�u�t�@�C�A�E�B���h�J�C�g�v��";
	mes "�����c�c�B";
	next;
	mes "[�A�q�[��]";
	mes "�����΂��ŉΎ���܂񂾂܂�";
	mes "�s�����Ŗ��p��";
	mes "�{���ɋ��낵���ł��c�c�B";
	next;
	menu "�ގ����Ă��܂��傤���H",-;
	mes "[�A�q�[��]";
	mes "�{��!?";
	mes "��������u15�v�̓|���ė��āI";
	mes "��Q�����΁A���̌Q���";
	mes "��l�����Ȃ邩������܂���B";
	next;
	if(select("�C����","����ς��߂悤") == 2) {
		mes "[�A�q�[��]";
		mes "���`�`��c�c";
		mes "������Q�s���ɂȂ肻���c�c�B";
		close;
	}
	mes "[�A�q�[��]";
	mes "�S�΂���ł�����";
	mes "������p�ӂ��܂��̂�";
	mes "��낵�����肢���܂��ˁI";
	delquest 130113;
	setquest 16548;
	close;
OnTouch:
	unittalk "�A�q�[�� : �����c�c�����тꂽ�悧�B";
	end;
OnQuestInfo:
	if(checkquest(16548) && !(checkquest(16548)&4))
		showevent 0, 2, "�A�q�[��#ep18";
	else if(checkquest(130113) || checkquest(16548))
		showevent 0, 3, "�A�q�[��#ep18";
	else
		showevent 9999,0,"�A�q�[��#ep18";
	end;
}
wolfvill.gat,61,170,5	script	�����w�҃O�h��#ep18	919,{/* 16056 */
	if(EP18_1QUE < 36) {
		mes "[�����w�҃O�h��]";
		mes "���߂Ă��������ł��ˁB";
		mes "�ǂ���l�ł��傤���H";
		next;
		mes "^ff0000�]�N�G�X�g�u������W�߂Ă��������v��^000000";
		mes "^ff0000�@���L�̏����𖞂����Ɛi�s�\�ł��B^000000";
		mes "^ff0000�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(16554)) {
		mes "[�����w�҃O�h��]";
		mes "3�l���炨�b�𕷂����Ƃ�";
		mes "�ł����݂����ł��ˁB";
		mes "���āA�ǂ�ȕ���Ȃ̂ł��傤�B";
		next;
		switch(rand(3)) {
		case 0:
			mes "[�����w�҃O�h��]";
			mes "����́c�c";
			mes "���������Ƃ��Ȃ�����ł��B";
			mes "�������c�c�������������B";
			mes "�N���畷�����b�ł����H";
			next;
			mes "[�����w�҃O�h��]";
			mes "�f�B�i�����c�c";
			mes "�����ō��������Ȃ�ł���!?";
			mes "�����m�肽���̂�";
			mes "�̘b�̗ނȂ̂ł����c�c�B";
			next;
			mes "[�����w�҃O�h��]";
			mes "�������c�c";
			mes "�ӂށA����́c�c��������܂���B";
			mes "�e���ł���";
			mes "�Ƒn�I�őf�G�Ȃ��b�ł��B";
			next;
			mes "[�����w�҃O�h��]";
			mes "�{���̖ړI�Ƃ͈قȂ�܂���";
			mes "���̕���̑����𕷂������ł��ˁB";
			mes "��낵����΂܂��f�B�i������";
			mes "���b�𕷂��ė��Ă��������B";
			break;
		case 1:
			mes "[�����w�҃O�h��]";
			mes "����̓A�~�����������Ă��ꂽ";
			mes "����ł����H";
			mes "���ʂőf�G�Șb�ł��I";
			mes "�����c�����A���̐_�����Ɋւ���̘b��";
			mes "�������o��������܂��B";
			next;
			mes "[�����w�҃O�h��]";
			mes "�ł����̕���ɏo�Ă���";
			mes "�����_�̖��O��";
			mes "�����q���̍��ɕ��������O�Ƃ�";
			mes "�����Ⴂ�܂��ˁB";
			mes "���̈Ⴂ�͉��Ȃ̂��c�c�����[���B";
			next;
			mes "[�����w�҃O�h��]";
			mes "�D��S���h�����Ă����";
			mes "�f���炵������ł��I";
			mes "���ꂩ����A�A�~���̘b�𕷂���";
			mes "�L�^���Ă���������Ƃ��肪�����ł��I";
			break;
		case 2:
			mes "[�����w�҃O�h��]";
			mes "�ӂ���A�ق��c�c";
			mes "����͍��̎q�������ɂ�";
			mes "���������Ȃ����b�ł��ˁB";
			mes "���̊�ł͎󂯓���";
			mes "���ʓI�ȌŒ�ϔO�����ݕt���Ă��܂��B";
			next;
			mes "[�����w�҃O�h��]";
			mes "���A������Ȃ��ł��������B";
			mes "�q�������ɕ��������Ȃ�������";
			mes "�ƂĂ��M�d�ȏ��Ȃ�ł��B";
			mes "�ǂȂ����畷�������b�Ȃ̂ł����H";
			next;
			mes "[�����w�҃O�h��]";
			mes "�V���[�j�i���k����";
			mes "�������Ă������������̂ł����B";
			mes "����͐̂̐l�̍l������m����";
			mes "�M�d�ȋL�^�ƂȂ�ł��傤�B";
			next;
			mes "[�����w�҃O�h��]";
			mes "�ł�����A�@�����΂���";
			mes "�V���[�j�i���k���񂩂�";
			mes "���b�𕷂��ė��Ă��������ˁB";
			break;
		}
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		delitem 1000408,1;
		delquest 16554;
		setquest 16559;
		getitem 1000405,1;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		getexp 225000000,0,0;
		getexp 0,200000000,0;
		setquest 130129;
		compquest 130129;
		mes "[�����w�҃O�h��]";
		mes "�����͂����܂łɂ��܂��傤�B";
		mes "�����炪�{���̎蓖�ĂƂȂ�܂��B";
		mes "�܂��A�����ȍ~����`�������������";
		mes "������܂��B";
		close;
	}
	if(checkquest(16551) || checkquest(16552) || checkquest(16553)) {
		mes "[�����w�҃O�h��]";
		mes "�u�f�B�i���v�Ƃ������̎q��";
		mes "�u�A�~���v�Ƃ��������B";
		mes "����Ɓu�V���[�j�i�v���k���񂩂�";
		mes "�b�𕷂��Ă��Ă��������B";
		mes "��낵�����肢���܂��ˁB";
		close;
	}
	if(checkquest(16559)){
		if(checkquest(16559) & 0x02 == 0){
			mes "[�����w�҃O�h��]";
			mes "�����͂����܂łɂ��܂��傤�B";
			mes "�������b���W�߂����͎̂R�X�Ȃ̂ł���";
			mes "���̐l���b���Ă��܂��܂�����B";
			next;
			mes "[�����w�҃O�h��]";
			mes "�`���҂���������͋x��ł��������B";
			mes "�����W�߂Ă���������b��";
			mes "�����������ł�����ˁB";
			close;
		}
		delquest 16559;
		mes "[�����w�҃O�h��]";
		mes "�O��͂��肪�Ƃ��������܂����B";
		mes "�{�������̐l��������";
		mes "���b�𕷂��Ă��Ă��炦�܂����H";
		next;
		mes "[�����w�҃O�h��]";
		mes "�u�f�B�i���v�Ƃ������̎q��";
		mes "�u�A�~���v�Ƃ��������B";
		mes "����Ɓu�V���[�j�i�v���k���񂩂�";
		mes "�b�𕷂��Ă��Ă��������B";
		mes "����ł́A�L�^�p�̎蒠���ǂ����B";
		next;
		if(select("�s���Ă��܂��I","���͎��Ԃ��Ȃ��ł�") == 2) {
			mes "[�����w�҃O�h��]";
			mes "����͎d������܂���ˁB";
			mes "�܂������Ԃ��ł�����ŗǂ��̂�";
			mes "���Ђ��肢�������܂��B";
			mes "�p���͗͂ł�����";
			mes "���݂��~�߂�킯�ɂ͂����܂���B";
			close;
		}
		setquest 16555;
		setquest 16556;
		setquest 16557;
		getitem 1000408,1;
		mes "[�����w�҃O�h��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���̉��́A���h�Ȗ{�����グ��";
		mes "���Ԃ��������Ǝv���܂��B";
		mes "���A��������V�͗p�ӂ��Ă܂��̂�";
		mes "���S�z�Ȃ��B";
		close;
	}
	if(checkquest(16555) || checkquest(16556) || checkquest(16557)) {
		mes "[�����w�҃O�h��]";
		mes "�u�f�B�i���v�Ƃ������̎q��";
		mes "�u�A�~���v�Ƃ��������B";
		mes "����Ɓu�V���[�j�i�v���k���񂩂�";
		mes "�b�𕷂��Ă��Ă��������B";
		mes "��낵�����肢���܂��ˁB";
		close;
	}
	if(checkquest(16558)){
		switch(rand(3)) {
			case 0:
				mes "[�����w�҃O�h��]";
				mes "�������f�B�i����";
				mes "�n��_�b�𕷂����Ă��ꂽ�̂ł��ˁH";
				mes "���͑������C�ɂȂ��Ă���ł��B";
				mes "�ǂ�ǂ�c�c�B";
				next;
				mes "[�����w�҃O�h��]";
				mes "�ف`�`����͑f���炵���ł��B";
				mes "�f�B�i���ɂ͏����Ƃ̍˔\������܂��B";
				mes "���̎d�����Ђƒi��������";
				mes "�f�B�i�����狖���������";
				mes "���̕�����o�ł������ł��ˁB";
				next;
				mes "[�����w�҃O�h��]";
				mes "���̖{���̖ړI�Ƃ͈قȂ�܂���";
				mes "���̍˔\�𖄂��ꂽ�܂܂ɂ��Ă����̂�";
				mes "�ɂ����ł�����B";
				mes "��낵����΂܂��f�B�i������";
				mes "���b�𕷂��ė��Ă��������ˁB";
				next;
				break;
			case 1:
				mes "[�����w�҃O�h��]";
				mes "�A�~���̕���̒��ɂ�";
				mes "�����m���Ă���_�b����������܂��B";
				mes "�����炭���Z�������̊Ԃ�";
				mes "�Â�������p����Ă���";
				mes "���ʂ̐_�b�Ȃ̂ł��傤�B";
				next;
				mes "[�����w�҃O�h��]";
				mes "�Ƃ��낪�A���̒m���Ă���_�b�Ƃ�";
				mes "�قȂ镔�������݂��܂��B";
				mes "���̈Ⴂ�͉��Ȃ̂��H";
				mes "���������ƂȂ��ĈႢ���������̂��H";
				next;
				mes "[�����w�҃O�h��]";
				mes "���̍��ق��������邱�Ƃ���";
				mes "���Ɏ��̎�v�Ȍ����e�[�}�Ȃ̂ł��B";
				mes "���ӂӂӁc�c�f���炵���I";
				next;
				mes "[�����w�҃O�h��]";
				mes "���ꂩ����A�A�~���̘b�𕷂���";
				mes "�L�^���Ă���������Ƃ��肪�����ł��I";
				mes "���ӂӂӂӂӁI";
				next;
				break;
			case 2:
				mes "[�����w�҃O�h��]";
				mes "�ӂ���A�ق��c�c";
				mes "����͍��̎q�������ɂ�";
				mes "���������Ȃ����b�ł��ˁB";
				mes "���̊�ł͎󂯓���";
				mes "���ʓI�ȌŒ�ϔO�����ݕt���Ă��܂��B";
				next;
				mes "[�����w�҃O�h��]";
				mes "�����̑��l����";
				mes "�l�����̑��l���Ɍq����܂��B";
				next;
				mes "[�����w�҃O�h��]";
				mes "�ł�����A�@�����΂���";
				mes "�V���[�j�i���k���񂩂�";
				mes "���b�𕷂��ė��Ă��������ˁB";
				mes "�΋��ȍl����������邽�߂ɂ�";
				mes "���̕���́A������ƋL�^�Ɏc���܂��B";
				next;
				break;
		}
		delitem 1000408,1;
		getitem 1000405,1;
		setquest 16555;
		delquest 16555;
		setquest 16556;
		delquest 16556;
		setquest 16557;
		delquest 16557;
		delquest 16558;
		setquest 16559;
		for(set '@i,0; '@i< 20 ; set '@i,'@i+1){
			getexp 150000000,0,0;
			getexp 0,100000000,0;
		}
		mes "[�����w�҃O�h��]";
		mes "�����͂����܂łɂ��܂��傤�B";
		mes "�����炪�{���̎蓖�ĂƂȂ�܂��B";
		mes "�܂��A�����ȍ~����`�������������";
		mes "������܂��B";
		close;
	}
	mes "[�����w�҃O�h��]";
	mes "���߂Ă��������ł��ˁB";
	mes "�ǂ���l�ł��傤���H";
	next;
	menu "�w�҂���ł����H",-;
	mes "[�����w�҃O�h��]";
	mes "���A�����c�c�I";
	mes "�c�c�����w�҂Ɍ����܂����H";
	mes "�O���炢�炵��������ڂŎ���";
	mes "�w�҂��ƌ������Ȃ��";
	mes "�����ł��ˁB";
	next;
	mes "[�����w�҃O�h��]";
	mes "���͖����w���������Ă��܂��B";
	mes "��X�`����Ă���_�b��";
	mes "�������w���W�߂�d���ł��B";
	mes "���������Z���̑�؂ȕ��������";
	mes "��肪���̂���d���ł��B";
	next;
	mes "[�����w�҃O�h��]";
	mes "�����Z���������畷�����b��";
	mes "�������Ă��܂����B";
	mes "���Z���̕������㐢�Ɏc���ׂ�";
	mes "������{�ɂ܂Ƃ߂�";
	mes "�o�ł���\��Ȃ�ł���B";
	next;
	mes "[�����w�҃O�h��]";
	mes "�Ƃ���Łc�c";
	mes "�`���҂�������̎d����";
	mes "�����͂���܂����H";
	next;
	if(select("���������","�����Ȃ���") == 2) {
		mes "[�����w�҃O�h��]";
		mes "����c�c�����Ȃ���ł����H";
		mes "���肻���Ɍ������̂ł���";
		mes "���Ⴂ�������悤�ł��ˁB";
		close;
	}
	mes "[�����w�҃O�h��]";
	mes "�{���ł����I";
	mes "���̓A�V�X�^���g��T���Ă�����ł��B";
	mes "���̑���ɁA�l���畷�������b��";
	mes "�L�^���Ă��ė~������ł��B";
	next;
	mes "[�����w�҃O�h��]";
	mes "���̏Z����������";
	mes "���b�𕷂����Ă��炤�\��Ȃ�ł��B";
	mes "������������b�Ȃ̂�";
	mes "1���ł͏I���Ȃ���������܂���B";
	mes "�ł́A�L�^�p�̎蒠�����n�����܂��B";
	next;
	if(checkitemblank() == 0) {
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "����ȏ㑽���̎�ނ�";
		mes "�ו��������Ƃ��o���܂���B";
		mes "1�ȏ�̋󂫂�����Ă��������B^000000";
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	}
	delquest 130109;
	setquest 16551;
	setquest 16552;
	setquest 16553;
	getitem 1000408,1;
	mes "[�����w�҃O�h��]";
	mes "�u�f�B�i���v�Ƃ������̎q��";
	mes "�u�A�~���v�Ƃ��������B";
	mes "����Ɓu�V���[�j�i�v���k���񂩂�";
	mes "�b�𕷂��Ă��Ă��������B";
	mes "��낵�����肢���܂��ˁB";
	close;
OnQuestInfo:
	if(checkquest(130109) || checkquest(16554))
		showevent 0, 3, "�����w�҃O�h��#ep18";
	else
		showevent 9999,0,"�����w�҃O�h��#ep18";
	end;
}
wolfvill.gat,106,224,3	script	�f�B�i��#ep18	941,{/* 16057 */
	if(checkquest(16551)) {
		mes "[�f�B�i��]";
		mes "���̂��b�𕷂��ɂ����̂ˁI";
		mes "������`�I";
		mes "�O�h�����΂���Ɩ񑩂��Ă�����ˁI";
		next;
		mes "[�f�B�i��]";
		mes "��񂵂�����Ȃ�����";
		mes "�����ƋL�^���ĂˁH";
		mes "����͎����o���������Ȃ񂾂��ǁc�c�B";
		next;
		menu "���`����Ă镨�ꂶ��Ȃ��H",-;
		mes "[�f�B�i��]";
		mes "���`���ĂȂ�ł����H";
		mes "�Ƃɂ����W�����ĕ����Ă��������I";
		mes "�ނ��`���ނ����A";
		mes "�����܂��c�����̏o�����ł��B";
		next;
		menu "�����c���悤�ȁc�c",-;
		mes "[�f�B�i��]";
		mes "���o�����Ȃ��ŁI�@�c�c���ق�I";
		mes "�D�F�T�̐X�ŏo�����";
		mes "�D�F�T�̒���";
		mes "�{�X�炵���ƂĂ��傫�ȘT�����܂����B";
		delquest 16551;
		if(!checkquest(16551) && !checkquest(16552) && !checkquest(16553)) {
			unittalk getcharid(3),strcharinfo(0)+" : 3�l�̕�����������߂��B�O�h���̂Ƃ���֖߂낤�I",1;
			setquest 16554;
		}
		close;
	}
	if(checkquest(16555)){
		mes "[�f�B�i��]";
		mes "���������̂��b�𕷂��ɂ����̂ˁI";
		mes "�O�h�����΂��񂪎��̘b��";
		mes "�{�ɂ��Ă������Č����Ă��́B";
		mes "���ꂵ���ȁ`�I";
		next;
		switch(rand(3)) {
			case 0:
				mes "[�f�B�i��]";
				mes "�����Ɓc�c";
				mes "�O��ɂǂ��܂Řb�����������H";
				mes "�d���̋��F�̓���";
				mes "�������Y�킾�����Ƃ���܂ŁH";
				mes "�o���Ă���ł��ˁI";
				next;
				mes "[�f�B�i��]";
				mes "����ŗ��Ɨd����";
				mes "�i���̗F�B�ɂȂ�܂����B";
				mes "�����c�c�u�e�F�v�Ə�����";
				mes "�u���C�o���v�Ɠǂޒ��ł��B";
				break;
			case 1:
				mes "[�f�B�i��]";
				mes "�����Ɓc�c";
				mes "�O��ɂǂ��܂Řb�����������H";
				mes "���Ɨd�����Ō�̏���������";
				mes "�Ƃ���ł��������H";
				next;
				mes "[�f�B�i��]";
				mes "�����Ō��";
				mes "����ȋ����̓����Ăяo����";
				mes "�d���͋���ȉ΂̐�����Ă��";
				mes "�΍R���܂����c�c�B";
				break;
			case 2:
				mes "[�f�B�i��]";
				mes "���������̂��b�𕷂��ɂ����̂ˁI";
				mes "�O�h�����΂��񂪎��̘b��";
				mes "�{�ɂ��Ă������Č����Ă��́B";
				mes "���ꂵ���ȁ`�I";
				next;
				mes "[�f�B�i��]";
				mes "�����Ɓc�c";
				mes "�O��ɂǂ��܂Řb�����������H";
				mes "�T�t�@�C�A�̓���������";
				mes "���F�̗d���Əo������ʂł�����ˁH";
				next;
				mes "[�f�B�i��]";
				mes "���F�̗d���́A�d�������̒��ł�";
				mes "��ԗD�ꂽ1�l�ł����B";
				mes "������ǂ�����ďؖ������̂��c�c�B";
				break;
		}
		delquest 16555;
		if(!checkquest(16555) && !checkquest(16556) && !checkquest(16557)) {
				unittalk getcharid(3),""+strcharinfo(0)+" : 3�l�̕�����������߂��B�O�h���̂Ƃ���֖߂낤�I",1;	// self:hidden
				setquest 16558;
			}
		close;
	}
	mes "[�f�B�i��]";
	mes "�ʔ������b��ǂނ̂�";
	mes "�Ƃ��Ă��y�����ł��I";
	mes "���̑�����z������̂�";
	mes "�����Ɗy�����ł��I";
	next;
	mes "[�f�B�i��]";
	mes "���b�̒��̐l��������";
	mes "���̐S�̒��Ő����Ă��܂��B";
	mes "���͉������ς�悤��";
	mes "���̐l�������������̂𒭂߂�́c�c";
	mes "�ق��`�`��B";
	close;
OnQuestInfo:
	if(checkquest(16551))
		showevent 0, 3, "�f�B�i��#ep18";
	else
		showevent 9999,0,"�f�B�i��#ep18";
	end;
}
wolfvill.gat,180,204,3	script	�A�~��#ep18	940,{/* 16058 */
	if(checkquest(16552)) {
		mes "[�A�~��]";
		mes "���Ȃ����O�h���̃A�V�X�^���g�H";
		mes "���̐l����ςȂ��Ƃ𗊂܂ꂽ�̂�ˁB";
		mes "�m���Ă邾���ŗǂ�����";
		mes "�̘b���������񋳂��ė~�������āB";
		next;
		mes "[�A�~��]";
		mes "�܂��A�����m���Ă�b�Ȃ��";
		mes "�����ɗ���O�ɖS���Ȃ���";
		mes "���ꂿ��񂩂畷�����b�����Ȃ񂾂��ǁB";
		mes "����ł��ǂ��H";
		next;
		mes "[�A�~��]";
		mes "����ŗǂ��Ȃ�A�������Ă�����B";
		mes "�c�c���̒��ɂ͎��B���m���Ă������";
		mes "�y���ɑ����_�X�����邯�ǁc�c�B";
		delquest 16552;
		if(!checkquest(16551) && !checkquest(16552) && !checkquest(16553)) {
			unittalk getcharid(3),strcharinfo(0)+" : 3�l�̕�����������߂��B�O�h���̂Ƃ���֖߂낤�I",1;
			setquest 16554;
		}
		close;
	}
	if(checkquest(16552)) {
		mes "[�A�~��]";
		mes "�������O�h���̂���`���H";
		mes "���̘b���ĉ��̖��ɗ��̂�����H";
		mes "�܂��A����Ȃ��Ƃ͗ǂ����B";
		next;
		mes "[�A�~��]";
		mes "���̂��b�𕷂����Ă�����B";
		mes "��������̂��ꂿ��񂩂�";
		mes "�������b�����ǁc�c";
		mes "�Ƃ���_�����͖����c�c�B";
		next;
		mes "[�A�~��]";
		mes "�c�c����ŁA����H";
		mes "�����Ǝv���o���Ȃ�����";
		mes "�Ƃɂ����厖�Ȃ��Ƃ́c�c�B";
		delquest 16556;
		if(!checkquest(16555) && !checkquest(16556) && !checkquest(16557)) {
				unittalk getcharid(3),""+strcharinfo(0)+" : 3�l�̕�����������߂��B�O�h���̂Ƃ���֖߂낤�I",1;	// self:hidden
				setquest 16558;
			}
		close;
	}
	mes "[�A�~��]";
	mes "���ꂿ��񂪌����Ă��́B";
	mes "���������_�X��Y��Ȃ����Ƃ�";
	mes "��؂Ȃ񂾂��āB";
	next;
	mes "[�A�~��]";
	mes "�����Șb�𕷂���������";
	mes "�����Y�ꂿ������̂������񂾁B";
	mes "���ǁA�O�h�����{�ɂ��Ă�����";
	mes "�����Y��邱�Ƃ͖�����ˁB";
	close;
OnQuestInfo:
	if(checkquest(16552))
		showevent 0, 3, "�A�~��#ep18";
	else
		showevent 9999,0,"�A�~��#ep18";
	end;
}
wolfvill.gat,154,184,5	script	�V���[�j�i#ep18	942,{/* 16059 */
	if(checkquest(16553)) {
		mes "[�V���[�j�i]";
		mes "�����A�O�h���̂���`�������H";
		mes "�̘b�𕷂��ɗ����񂾂����H";
		mes "���f����Ȃ������āH";
		mes "�ȁ`�ɁA�\��Ȃ���B";
		mes "�ɂԂ��ɂȂ��Ċy��������ˁB";
		next;
		mes "[�V���[�j�i]";
		mes "���ꂶ�Ⴀ�A�n�߂悤���ˁB";
		mes "����͎��̂��k���񂩂畷����";
		mes "�Â��̘b���B";
		mes "�́X�A�Ƃ���Ƃ����";
		mes "��l�̒b�艮������܂����c�c�B";
		delquest 16553;
		if(!checkquest(16551) && !checkquest(16552) && !checkquest(16553)) {
			unittalk getcharid(3),strcharinfo(0)+" : 3�l�̕�����������߂��B�O�h���̂Ƃ���֖߂낤�I",1;
			setquest 16554;
		}
		close;
	}
	if(checkquest(16557)) {
		mes "[�V���[�j�i]";
		mes "�������b�𕷂��ɂ����̂����H";
		mes "���x���x�A�������˂��B";
		mes "�Ӂ`��A���̘b�͋M�d�����āH";
		mes "�����������������B";
		next;
		mes "[�V���[�j�i]";
		mes "���āc�c�����͂ǂ����悤���ˁB";
		mes "���̕�������鏇�Ԃ������H";
		next;
		mes "[�V���[�j�i]";
		mes "����Ƃ��O��̘b��";
		mes "�܂��I����ĂȂ��������ˁH";
		mes "�b�艮���󂩂猻�ꂽ";
		mes "�~�~�Y�N�ɏ����";
		mes "��֏��Ƃ���܂ŕ������̂����H";
		next;
		mes "[�V���[�j�i]";
		mes "�L���͂��ǂ��̂��B";
		mes "�ł͂��̑������n�߂悤���B";
		mes "�������ȓV���͎v�킸�c�c�B";
		delquest 16557;
		if(!checkquest(16555) && !checkquest(16556) && !checkquest(16557)) {
				unittalk getcharid(3),""+strcharinfo(0)+" : 3�l�̕�����������߂��B�O�h���̂Ƃ���֖߂낤�I",1;	// self:hidden
				setquest 16558;
			}
		close;
	}
	mes "[�V���[�j�i]";
	mes "���͂���������y���݂�";
	mes "�����Ďv���Ă�������";
	mes "�������ĎႢ����ɐ̘b������̂�";
	mes "�y�������̂���B";
	next;
	mes "[�V���[�j�i]";
	mes "���̘b�𕷂��Ă����";
	mes "���肪�Ƃ��ˁB";
	mes "�܂����Ă��傤�����ˁB";
	close;
OnQuestInfo:
	if(checkquest(16553))
		showevent 0, 3, "�V���[�j�i#ep18";
	else
		showevent 9999,0,"�V���[�j�i#ep18";
	end;
}
wolfvill.gat,85,111,3	script	�Y����#ep18	931,{/* 16060 */
	if(EP18_1QUE < 36) {
		mes "^ff0000�]�N�G�X�g�u�����͌������ł͂Ȃ��v��^000000";
		mes "^ff0000�@���L�̏����𖞂����Ɛi�s�\�ł��B^000000";
		mes "^ff0000�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(130105)) {
		mes "[�Y����]";
		mes "�����c���������̉�c��";
		mes "�ςȂ��Ƃ΂���q�ׂĂ���A";
		mes "���̂�������B";
		mes "���w���ł͈̂��l�������݂���������";
		mes "���ꂪ�������ች�ɂȂ���Ă񂾂�!?";
		next;
		mes "[�Y����]";
		mes "�A�n�u���A�n�n���Ƃ���";
		mes "���̂���������Ă΁I";
		mes "�u���w���ł͂����������ɂ��Ȃ��`�v�Ƃ�";
		mes "�u���w���ƈႤ��`�v�Ƃ�";
		mes "����Ȃ��ƌ������炢�Ȃ�";
		mes "���w���ɋA��΂��������I";
		next;
		mes "[�J����]";
		mes "�������������w���ɂ����";
		mes "�v���Ă�񂶂�Ȃ��H";
		mes "���ԕ�������e���g�ŐQ�Ă�̂�";
		mes "�����ɖ�����o�߂Ȃ��̂��ȁH";
		next;
		mes "[�Y����]";
		mes "���̒��ɂ���Ȃ炻��ł��������B";
		mes "�Ȃ����l�ɖ��f������񂾂�H";
		mes "�c�c�Ƃ���ŁA����������";
		mes "�������̘b�𗧂��������Ă�";
		mes "�A���^�͒N?";
		delquest 130105;
		setquest 16560;
		close;
	}
	if(checkquest(16566)) {
		mes "[�Y����]";
		mes "�A���Ă����B";
		mes "����ŁA�A�n�n�`���������";
		mes "�Ȃ񂾂��āH";
		next;
		mes "[�Y����]";
		mes "�Ȃ�!?";
		mes "���ꂩ��͐l�̘b��f���ɕ������āH";
		mes "����ς荡�܂ł�����";
		mes "�����ĂȂ������񂾂�!!";
		next;
		mes "[�J����]";
		mes "�����������āA�Y�����B";
		mes "�f���ɂȂ���Č��߂��̂�";
		mes "�d�v�Ȃ��Ƃ���Ȃ����B";
		next;
		mes "[���b�h�Z��]";
		mes "�ނ���r�b�N�����I";
		mes "���̃A�n�u��������";
		mes "����Ȃ��ƌ����Ȃ�āI";
		mes "�`���҂���A���������񂾂��H";
		next;
		mes "[�Y����]";
		mes "�c�c�l���Ă݂�ቴ��";
		mes "�ǂ��o���Ȃ�Č�����";
		mes "��l���Ȃ������ȁB";
		mes "���肪�Ƃ��A�`���҂���B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		delquest 16566;
		setquest 202335;
		getitem 1000405,10;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		setquest 130125;
		compquest 130125;
		mes "[�Y����]";
		mes "���񂽂݂����Ȑ��b�Ă�������";
		mes "����������B";
		mes "��������������l�ɂȂ�Ȃ��ƂȁB";
		close;
	}
	if(checkquest(202335)) {
		mes "[�Y����]";
		mes "�A�n�u�����������������";
		mes "�����������悤�ɂȂ��Ă����";
		mes "�����܂Ń_���Ȑl�ł��Ȃ��c�c";
		mes "�C������B���Ԃ�B";
		next;
		mes "[�Y����]";
		mes "�܂��A������l�C�Ȃ�������";
		mes "����܂�l�̂��Ƃ͌����Ȃ����B";
		mes "����`�A�ǂ��o���Ȃ��ėǂ������B";
		mes "���ꂱ������l�̂�������ȁB";
		close;
	}
	mes "[�Y����]";
	mes "���̋K�������Ȃ��Ȃ�";
	mes "�o�čs���ė~������B";
	mes "�K���͎�邽�߂ɂ���񂾂��炳�B";
	next;
	mes "[�Y����]";
	mes "��V�����ē�������B";
	mes "�݂�Ȃ��݂��ɑ��d�������Ă���";
	mes "���n�����Љ�ƌ�����񂾁B";
	mes "�����������Ƃ��������������Ȃ��";
	mes "�����ƕς��Ȃ����B";
	close;
OnQuestInfo:
	if(checkquest(130105))
		showevent 0, 3, "�Y����#ep18";
	else
		showevent 9999,0,"�Y����#ep18";
	end;
}
wolfvill.gat,83,109,5	script	�J����#ep18	99,{/* 16061 */
	if(EP18_1QUE >= 36) {
		if(checkquest(16560)) {
			mes "[�J����]";
			mes "�ŋ߁A���̒���������Ă�";
			mes "�`���҂��ȁH";
			mes "�X�A�h����Ƃ����������炵���B";
			next;
			mes "[���b�h�Z��]";
			mes "�X�A�h����̗F�l�Ȃ�";
			mes "�l�����̘b�𕷂��āI";
			mes "�A�n�u�Ƃ������������";
			mes "�ǂ��ɂ����Ă���Ȃ��H";
			next;
			mes "[�Y����]";
			mes "�{���ǂ����悤���Ȃ�";
			mes "��������Ȃ񂾁I";
			mes "�l�̘b�͕����Ȃ�������";
			mes "�����̂��Ƃ΂��茾���o���񂾁I";
			mes "���������ꂪ���ɗ����e����Ȃ��I";
			next;
			mes "[�Y����]";
			mes "���w���ɂ������́A";
			mes "�ڏZ�̖��ɋ��͂���";
			mes "��肭����Ă��炵������";
			mes "�����悤�ȃm���ł����ɗ����Ă�";
			mes "�������f�Ȃ񂾂�ȁI";
			next;
			mes "[�J����]";
			mes "���̑�����ǂ��o����Ȃ�";
			mes "�ǂ��o���Ă�肽����B";
			next;
			mes "[���b�h�Z��]";
			mes "�C�����͕����邯��";
			mes "�����́A�����s���ꏊ�̂Ȃ��l������";
			mes "�W�܂�ꏊ�Ȃ񂾁B";
			mes "��������ǂ��o������";
			mes "���̂�������͂����s���ꏊ���������B";
			next;
			mes "[�Y����]";
			mes "���Ƃ��Ă��A������������";
			mes "����ȏ�͉䖝�ł��Ȃ��I";
			mes "�����A�n�u��������݂�����";
			mes "�D�����肵�Ă������Ă����̂��H";
			next;
			mes "[�J����]";
			mes "�c�c����́A�ς����Ȃ��ȁB";
			next;
			mes "[���b�h�Z��]";
			mes "�Ƃ����킯�ŁA�`���҂����";
			mes "���肢���Ă���Ă킯�ł��B";
			delquest 16560;
			setquest 16561;
			close;
		}
		if(checkquest(16566)) {
			mes "[�J����]";
			mes "�ȂɁA�A�n�u����";
			mes "���ꂩ��͂����Ƃ���ƌ������́H";
			mes "�l���ĊȒP�ɂ͕ς��Ȃ���";
			mes "�v���񂾂��ǁc�c�B";
			next;
			mes "[�J����]";
			mes "������B";
			mes "������x�M���Ă݂悤���ȁB";
			mes "�ȒP�ɂ͕ς��Ȃ�����������";
			mes "�m����0����Ȃ�����ȁB";
			close;
		}
		if(checkquest(202335)) {
			mes "[�J����]";
			mes "�l���ĊȒP�ɂ͕ς��Ȃ���";
			mes "�v���񂾂��ǁA�m����0����Ȃ��B";
			mes "�����Ǝ��Ԃ��K�v��������Ȃ�����";
			mes "���ꂩ��A�n�u����Ƃ�";
			mes "�����֌W�ɂȂ肻���ȋC�������B";
			close;
		}
		mes "[�J����]";
		mes "�l�����̑��ł�";
		mes "�厖�Ȃ��Ƃ͑��c�Ō��߂�B";
		mes "�����ɂ͈̂��l���̂��Ȃ��l�������B";
		mes "�S����������ŎQ�����Ă�B";
		next;
		mes "[�J����]";
		mes "�ł��A���̃A�n�u���������";
		mes "���c�ł��̂����Ȃ񂾂�ȁB";
		mes "���������ԓx�͗ǂ��Ȃ���B";
		close;
	}
	mes "[�J����]";
	mes "�Y�܂����A�Y�܂����I";
	mes "�l�Ԋ֌W�̖����Ă̂�";
	mes "�ǂ����Ă����Y�܂����񂾁I";
	close;
OnQuestInfo:
	if(checkquest(16560))
		showevent 0, 3, "�J����#ep18";
	else
		showevent 9999,0,"�J����#ep18";
	end;
}
wolfvill.gat,87,109,3	script	���b�h�Z��#ep18	943,{/* 16062 */
	if(checkquest(16561)) {
		mes "[���b�h�Z��]";
		mes "�l�����������猾���Ă�";
		mes "�A�n�u��������ɂ͘b���ʂ��Ȃ��B";
		mes "���������ɘb���Ă݂Ă���Ȃ��H";
		next;
		mes "[���b�h�Z��]";
		mes "���̂܂܂���A�A�n�u���������";
		mes "������ǂ��o�����ƂɂȂ�I";
		mes "�܂��A�{���A�ꐶ�̂��肢���B";
		next;
		mes "[�Y����]";
		mes "�����ƁI";
		mes "�����̈ꐶ�̂��肢������ȁI";
		mes "���̂��肢����Ȃ�����ȁI";
		mes "���̂͑厖�Ɏ���Ă�����";
		mes "���l���ł�����g���񂾂��c�c�B";
		next;
		mes "[���b�h�Z��]";
		mes "�Ă߂��`�`�I";
		mes "�܂��A�Ƃɂ����Ȃ�ł�������I";
		mes "�A�n�u������������Ƃ����ā`�I";
		delquest 16561;
		setquest 16562;
		close;
	}
	if(checkquest(16562)) {
		mes "[���b�h�Z��]";
		mes "�l�����������猾���Ă�";
		mes "�A�n�u��������ɂ͘b���ʂ��Ȃ��B";
		mes "���������ɘb���Ă݂Ă���Ȃ��H";
		next;
		mes "[���b�h�Z��]";
		mes "�N���v���Ă�ȏ��";
		mes "��ς��Ǝv�����ǁc�c";
		mes "��낵�����ނ�I";
		close;
	}
	if(checkquest(16566)) {
		mes "[���b�h�Z��]";
		mes "�A�n�u���������";
		mes "�b���ʂ������Ă���!?";
		mes "����ł����ĂȂ񂾂���";
		mes "�}�W�Ńr�b�N�����I";
		close;
	}
	if(checkquest(202335)) {
		mes "[���b�h�Z��]";
		mes "�A�n�u��������A";
		mes "�����̓}�V�ɂȂ��Ă�����B";
		mes "�܂��܂��l�q�͌��Ȃ��Ƃ�����";
		mes "�O�ɔ�ׂ�Ⴗ�����}�V����I";
		next;
		mes "[���b�h�Z��]";
		mes "�Ȃ񂾂��l���l�����������B";
		mes "������ς��悤�Ɠw�͂��Ă�l����";
		mes "�����������񂾂ȁB";
		close;
	}
	mes "[���b�h�Z��]";
	mes "�������������Ȃ��l�I";
	mes "�������Ƃ����x�������l�I";
	mes "�����Ɋ���I�ɂȂ�l�I";
	mes "�����̎d���ɐӔC�𕉂�Ȃ��l�I";
	mes "�݂�Ȃ��񂴂肾�I";
	next;
	mes "[���b�h�Z��]";
	mes "�����Ȑl���������āH";
	mes "�Ⴄ�Ⴄ�I";
	mes "�l�������Ȑl�́A�ЂƂ肾������I";
	close;
OnQuestInfo:
	if(checkquest(16561))
		showevent 0, 3, "���b�h�Z��#ep18";
	else
		showevent 9999,0,"���b�h�Z��#ep18";
	end;
}
wolfvill.gat,127,155,3	script	�A�n�u#ep18	928,{/* 16063 */
	if(checkquest(16562)) {
		mes "[�A�n�u]";
		mes "���[���A�����̂��O�I";
		mes "���O�͊o���ĂȂ���";
		mes "�����̏Z�l����H";
		next;
		mes "[�A�n�u]";
		mes "��̗���̐l�Ԃ�";
		mes "�����������̐l�Ԃ̖��O�Ȃ��";
		mes "�o���Ă��Ȃ����񂾁B";
		mes "���ɂ��̃A�n�u�l��";
		mes "�Ƃ��Ă��̂�����̐l�Ԃ�����ȁI";
		next;
		mes "[�A�n�u]";
		mes "����Ȉ̂��A�n�u�l��";
		mes "�N�Ɏd����^���悤�B";
		mes "�ȂɁA�ȒP�Ȏd�����B";
		mes "������ւ�̌{�ɂ����Ăł���B";
		next;
		// ����`���`�@���m�F
		if(select("����`�������Ă��������܂�","�{���Ɏ���Ȑl���ȁI") == 2) {
			mes "[�A�n�u]";
			mes "�͂��A���ꂾ����Ⴂ����́c�c";
			mes "�g����ŁA�܂�ŗ�V��m��Ȃ��B";
			mes "�S�������ł��Ȃ����c��";
			mes "�V�������邼�I�@�V�����ȁI";
			next;
		}
		mes "[�A�n�u]";
		mes "���̃A�n�u�l���H��������ۂ�";
		mes "�������Ȃ��\�[�X������񂾁B";
		mes "���̃\�[�X�������Ȃ���";
		mes "�����H�ׂ��C�ɂȂ�Ȃ��I";
		mes "�������d�v�Ȃ��̂Ȃ񂾁B";
		next;
		mes "[�A�n�u]";
		mes "���̃\�[�X�𔃂��ė��Ă���B";
		mes "���w���́u�}�m�}�[�g�v�Ŕ����Ă�";
		mes "�u�L���E�O���g�\�[�X�v���I";
		mes "�}���ōs���Ă���I";
		delquest 16562;
		setquest 16563;
		close;
	}
	if(checkquest(16563)) {
		mes "[�A�n�u]";
		mes "���w���́u�}�m�}�[�g�v�Ŕ����Ă�";
		mes "�u�L���E�O���g�\�[�X�v���I";
		mes "���ꂪ�����H����";
		mes "�H���Ƃ͌����Ȃ�����ȁB";
		mes "�����A�����s���I";
		close;
	}
	if(checkquest(16564)) {
		mes "[�A�n�u]";
		mes "�����I";
		mes "�L���E�O���g�\�[�X�I";
		mes "�ǂ�ǂ�c�E�E�E";
		mes "���ށA�ԈႢ�Ȃ��I";
		next;
		mes "[�A�n�u]";
		mes "���ꂶ�Ⴀ�A�H���Ƃ��邩�B";
		mes "���̑��ɗ��Ă���悤�₭�܂Ƃ���";
		mes "�H���炵���H��������B";
		next;
		menu "���̑O�ɂ�����Ƙb���c�c",-;
		mes "[�A�n�u]";
		mes "�������A���̕s�͂��҂߁I";
		mes "���̙N���H��������̂ɁI";
		mes "�I���܂Ő������đ҂��Ă���I";
		next;
		menu "�A�n�u����̑ԓx�ɂ��Ă̘b�ł�",-;
		mes "[�A�n�u]";
		mes "�����������������c�c";
		mes "�A�n�u����̑ԓx���Ƃ��H";
		mes "������Ǝ�`�����������炢��";
		mes "���q�ɏ���Ă�ȁH";
		next;
		mes "[�A�n�u]";
		mes "��`���I";
		mes "�䍂�������낤����Ȃ����I";
		mes "�c�c�H�ׂȂ��畷���Ă�邼�I";
		delquest 16564;
		setquest 16565;
		close;
	}
	if(checkquest(16565)) {
		mes "[�A�n�u]";
		mes "���������c�c�B";
		mes "�悵�A���̃A�n�u�l�̑ԓx�Ɋւ���";
		mes "�b�����Ă݂�I";
		mes "�I�O��Ȃ��Ƃ������Ȃ狖���񂼁I";
		next;
		menu "�݂�Ȃ��M���������Ă��邱�ƁA�����m�ł����H",-;
		mes "[�A�n�u]";
		mes "�u�t�[�[�[�b�I";
		mes "�c�c���A�m���Ă邼�I";
		mes "���A���ꂪ�ǂ������Ƃ����񂾁H";
		mes "�Ⴂ�z�炪�A�N�̂��Ƃ�V�l��������";
		mes "�����҂ɂ��Ă邾������Ȃ��̂��H";
		next;
		menu "����Ȗ��ł͂���܂���",-,"�A�n�u���񎩐g�̖��Ȃ�ł�",-;
		mes "[�A�n�u]";
		mes "�N�ɉ��̖�肪������āH";
		mes "��A�N�͊Ԉ���ĂȂ��I";
		mes "�N�͈����Ȃ����I";
		mes "�����������������c�c�B";
		next;
		menu "��������ǂ��o���b�܂ł��Ă��ł���H",-;
		mes "[�A�n�u]";
		mes "�u�n�[�[�[�[�b�I";
		mes "�S�z�b�I�@�S�z�b!!";
		mes "�ȁA�Ȃ񂾂ƁH�@���A����̓_���b�I";
		mes "�N�ɂ͂��������ȊO��";
		mes "�s�����Ă͖����񂾁I";
		next;
		mes "[�A�n�u]";
		mes "���w���ł́A�S�ď�肭�����Ă��񂾁B";
		mes "���Z���̒��řN�قǐ��������҂�";
		mes "���Ȃ������I";
		mes "�Ȃ̂ɂ��̊Ԃɂ��ڏZ�̖��̎В���";
		mes "���܂�Ă��܂��āc�c�B";
		next;
		mes "[�A�n�u]";
		mes "�Ƃ����Y���S���v�������";
		mes "�����ɗ��邵���Ȃ������񂾁B";
		mes "���c�c�����c�c�B";
		next;
		mes "[�A�n�u]";
		mes "�ˁA�˂��B";
		mes "�ǂ�����΁A��������ǂ��o���ꂸ��";
		mes "�ςނƎv���H";
		next;
		mes "[�A�n�u]";
		mes "�{���́A�킩���Ă�񂾁c�c";
		mes "�N�ɂ͂������̗͂��������Ƃ��炢�B";
		mes "���͂��������";
		mes "�����������񂾂���I";
		next;
		menu "���͂Ƃ����͕K�v����܂���",-,"�l�X�ɗ�V�������ڂ��Ă�������",-;
		mes "[�A�n�u]";
		mes "�N�͍őP��s�����Ă�񂾁I";
		mes "��҂����ɏ�����������";
		mes "���̉�c�Ɍ��������Q������";
		mes "�ӌ����q�ׂ���c�c�B";
		next;
		menu "�����̕������ꂪ�ゾ�Ǝv���Ă͂����܂���",-;
		mes "[�A�n�u]";
		mes "�����A�N�̕����N�ゾ�I";
		mes "����܂ł̌o��������I";
		next;
		menu "�Ȃ�ǂ��o����邵���c�c",-;
		mes "[�A�n�u]";
		mes "�ʂ��[�[�[���I";
		mes "�������牽���ǂ�����΂����񂾁[�[�I";
		next;
		menu "�悸�͑吺���o���Ȃ���",-,"�󋵂𐳊m�ɗ������Ă�������",-,"�܂��͐l�̘b�Ɏ����X���܂��傤",-;
		mes "[�A�n�u]";
		mes "��c�c���������B";
		mes "������������A�N��ǂ��o���Ȃ��ł���B";
		mes "�ق�A�N�̘b�Ɏ����X��������Ȃ����H";
		mes "�吺���o�����ɁB";
		mes "�ˁH�@�ˁH";
		next;
		mes "[�A�n�u]";
		mes "�N�͂����A�Ⴂ�҂�����";
		mes "���ǂ������������񂾁B";
		mes "�̂����ɂ��Ă��ƌ����̂Ȃ�";
		mes "�����̂����ɂ͂��Ȃ��I";
		next;
		mes "[�A�n�u]";
		mes "�݂�ȂɔF�߂Ă��炦��悤��";
		mes "������ς��Ă݂���I";
		mes "�ƁA�A�n�u�������Ă�������";
		mes "�݂�Ȃɓ`���Ă�����B";
		next;
		mes "[�A�n�u]";
		mes "�c�c�N���N�ׂ̈ɗ��Ă��ꂽ�񂾂�H";
		mes "�N�̉�Ԃɕt�������Ă����";
		mes "���肪�Ƃ��c�c���ӂ��Ă��B";
		delquest 16565;
		setquest 16566;
		close;
	}
	if(checkquest(16566)) {
		mes "[�A�n�u]";
		mes "�݂�ȂɔF�߂Ă��炦��悤��";
		mes "������ς��Ă݂���I";
		mes "�ƁA�A�n�u�������Ă�������";
		mes "�݂�Ȃɓ`���Ă�����B";
		next;
		mes "[�A�n�u]";
		mes "�c�c�N���N�ׂ̈ɗ��Ă��ꂽ�񂾂�H";
		mes "�N�̉�Ԃɕt�������Ă����";
		mes "���肪�Ƃ��c�c���ӂ��Ă��B";
		close;
	}
	mes "[�A�n�u]";
	mes "���[���A�����̂��O�I";
	mes "���O�͊o���ĂȂ���";
	mes "�����̏Z�l����H";
	next;
	mes "[�A�n�u]";
	mes "��̗���̐l�Ԃ�";
	mes "�����������̐l�Ԃ̖��O�Ȃ��";
	mes "�o���Ă��Ȃ����񂾁B";
	mes "���ɂ��̃A�n�u�l��";
	mes "�Ƃ��Ă��̂�����̐l�Ԃ�����ȁI";
	close;
OnQuestInfo:
	if(checkquest(16562) || checkquest(16564) || checkquest(16565))
		showevent 0, 3, "�A�n�u#ep18";
	else
		showevent 9999,0,"�A�n�u#ep18";
	end;
}
rachel.gat,135,64,3	script	�X��#ep18	930,{/* 16064 */
	if(checkquest(16563)) {
		mes "[�X��]";
		mes "������Ⴂ�I";
		mes "�H�ސ��X�u�}�m�}�[�g�v����I";
		mes "���w���ō��̐H�ސ��X�Ȃ�ł��I";
		mes "���āA�������T���ŁH";
		next;
		if(select("�L���C�O�����\�[�X","�L���C�O���g�\�[�X","�L���E�O���g�\�[�X","�L���E�O���l�\�[�X") != 3) {
			mes "[�X��]";
			mes "����Ȗ��O�̃\�[�X��";
			mes "�����ɂ͖����ł��ˁ`�H";
			mes "�����ƊԈ���Ă܂���H";
			close;
		}
		mes "[�X��]";
		mes "�L���E�O���g�\�[�X�ˁI";
		mes "���������q����A���ڂ������I";
		mes "���̃\�[�X�ɂ̓L���E����";
		mes "���[�O���g�������Ă���";
		mes "�p���ɏ悹�ĐH�ׂ�Ɣ��������ł���I";
		next;
		mes "[�X��]";
		mes "�������ꏊ�ɕۊǂ���";
		mes "�����J�����瑁���H�ׂĂ��������ˁB";
		mes "�͂��A�ǂ����I";
		delquest 16563;
		setquest 16564;
		close;
	}
	mes "[�X��]";
	mes "������Ⴂ�I";
	mes "�H�ސ��X�u�}�m�}�[�g�v����I";
	mes "���w���ō��̐H�ސ��X�Ȃ�ł��I";
	next;
	mes "[�X��]";
	mes "���w�����̃��X�g������";
	mes "�����̐H�ނ��g���Ă܂��I";
	mes "���߂āA�g���邾����";
	mes "���������������g���g���g����";
	close;
OnQuestInfo:
	if(checkquest(16563))
		showevent 0, 3, "�X��#ep18";
	else
		showevent 9999,0,"�X��#ep18";
	end;
}
rachel.gat,38,44,3	script	�T�}���A��#ep18	921,{/* 16065 */
	if(EP18_1QUE < 36) {
		mes "^ff0000�]�N�G�X�g�u�q���������m���Ă���v��";
		mes "�@���L�̏����𖞂����Ɛi�s�\�ł��B";
		mes "�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(130102)) {
		mes "[�T�}���A��]";
		mes "�i�C�}���A�I���A�������I";
		mes "���������ė��Ă����I";
		mes "�������炨�O�񂿂�";
		mes "��ԋ߂�����`�H";
		next;
		mes "[�J���D]";
		mes "�h���C�t���[�c�������ė��āB";
		mes "�Ƃɖ�����Δ����Ă��āB";
		next;
		mes "[�i�C�}��]";
		mes "�H�ו��́c�c������B";
		mes "����Ƀ{�N�A�����������ĂȂ����c�c�B";
		next;
		mes "[���N�V�[]";
		mes "���`�`�R���`�H";
		mes "�{���́A�������ɐ����h���C�t���[�c��";
		mes "���������Ȃ��񂾂�H";
		next;
		mes "[�T�}���A��]";
		mes "�������肾�ȁ`�i�C�}���B";
		mes "�S�̗F���Ǝv���Ă��̂ɁI";
		next;
		mes "[�i�C�}��]";
		mes "�݁A���͂��邩��";
		mes "�����Ă����I";
		next;
		mes "[�T�}���A��]";
		mes "���𔃂��ɂ����͕K�v����H";
		mes "���O�񂿂ɋ�������̂���`�H";
		delquest 130102;
		setquest 16581;
		close;
	}
	mes "[�T�}���A��]";
	mes "�V�т����ĕ��������I";
	mes "�A�����������I";
	mes "�ǂ����������Ƃ����";
	mes "�₽�������ƃh���C�t���[�c��";
	mes "�H�ׂ����Ȃ��I";
	close;
OnQuestInfo:
	if(checkquest(130102))
		showevent 0, 3, "�T�}���A��#ep18";
	else
		showevent 9999,0,"�T�}���A��#ep18";
	end;
}
rachel.gat,37,42,7	script	�J���D#ep18	931,{/* 16066 */
	if(checkquest(16581)) {
		mes "[�J���D]";
		mes "�����Ȃ��́H";
		mes "�i�C�}���̕�������";
		mes "���N�V�[�̂Ƃ���̔�������";
		mes "�����Ă��ł���H";
		next;
		mes "[���N�V�[]";
		mes "�ꂿ���́A�i�C�}���̕�������";
		mes "�����Ƌ��͕����Ă�I";
		mes "�Ȃ̂ɁA�i�C�}���͉�������";
		mes "�h���C�t���[�c�̂ЂƂ�";
		mes "����Ȃ��񂾂ȁ`�H";
		next;
		mes "[�T�}���A��]";
		mes "�����A���O��`������߂��B";
		mes "�i�C�}���̂Ƃ���͂����������񂾂���I";
		mes "����������`�H";
		next;
		mes "[�i�C�}��]";
		mes "�Ⴄ�I";
		mes "����������Ȃ��c�c";
		mes "����������Ȃ���!!";
		next;
		mes "[�T�}���A��]";
		mes "��k�����āI";
		mes "�������L�ɂȂ�Ȃ�ȁI";
		mes "����ς茴�Z���͓{����ۂ�����";
		mes "�{���������񂾂ȁ`�B";
		next;
		mes "[�J���D]";
		mes "����Ȃ�ł��ꏏ�ɗV��ł����Ă�";
		mes "�������Ɋ��ӂ��Ă����ȁH";
		delquest 16581;
		setquest 16582;
		close;
	}
	mes "[�J���D]";
	mes "�Â������ɗ₽���X�������";
	mes "���Ԃ��Ԉ��݂����ȁ`�B";
	close;
OnQuestInfo:
	if(checkquest(16581))
		showevent 0, 3, "�J���D#ep18";
	else
		showevent 9999,0,"�J���D#ep18";
	end;
}
rachel.gat,40,45,3	script	���N�V�[#ep18	944,{/* 16067 */
	if(checkquest(16582)) {
		mes "[���N�V�[]";
		mes "�������������I";
		mes "�������Ɋ��ӂ���`�I";
		next;
		menu "���Ă��Ȃ���",-,"���������ɂ���",-;
		mes "[���N�V�[]";
		mes "����H";
		mes "�Ȃ񂩂悻�҂������Ă邼�H";
		next;
		menu "����̂ǂ����V�тȂ񂾁H",-,"�����߂Ă邾������",-;
		mes "[�T�}���A��]";
		mes "�悻�҂�����m��Ȃ���ł���H";
		mes "�i�C�}���͌��Z���B";
		mes "�������͈ڏZ�̖��Ȃ񂾁B";
		next;
		mes "[�T�}���A��]";
		mes "���Z���́A�ڏZ�̖��ɔ�ׂ�";
		mes "���낢��u����Ȃ��v�񂾁B";
		mes "���N�V�[�̕ꂿ���������Ă�B";
		mes "���Z���͎d�����o����̂��x����";
		mes "�{����ۂ����āI";
		next;
		mes "[�T�}���A��]";
		mes "����Ȃ̂ɁA�ꏏ�ɗV��ł���Ă�";
		mes "�������Ɍ��o��������ẮH";
		delquest 16582;
		setquest 16583;
		close;
	}
	mes "[���N�V�[]";
	mes "�i�C�}���̉Ƃ���ԋ߂���ˁH";
	mes "�����Ƃ��َq�������ė���Ȃ��́H";
	close;
OnQuestInfo:
	if(checkquest(16582))
		showevent 0, 3, "���N�V�[#ep18";
	else
		showevent 9999,0,"���N�V�[#ep18";
	end;
}
rachel.gat,36,45,5	script	�i�C�}��#ep18	941,{/* 16068 */
	if(checkquest(16583)) {
		mes "[�i�C�}��]";
		mes "�c�c�B";
		next;
		menu "�ǂ����Ă��̎q�����ƗV��ł�́H",-;
		mes "[�i�C�}��]";
		mes "����́c�c�F�B�ł�����B";
		mes "���̎q��������Ȃ���";
		mes "���ƗV��ł����q�����Ȃ����B";
		next;
		mes "[�i�C�}��]";
		mes "�c�c�Ƃ��琅�������Ă����B";
		mes "����Ɓc�c�{���Ă��߂�B";
		next;
		cloakonnpc "�i�C�}��#ep18";
		mes "[�T�}���A��]";
		mes "�܂��A�V��ł�Ƃ���Ȃ��Ƃ������ȁH";
		mes "����܂�C�ɂ���Ȃ�I";
		next;
		cloakonnpc "�T�}���A��#ep18";
		mes "[���N�V�[]";
		mes "���̏ꏊ�ŗV�ڂ����B";
		mes "�ٖM�l�Ɏז�����Ȃ��悤�ɁI";
		next;
		delquest 16583;
		setquest 202340;
		getitem 1000405,10;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		setquest 130122;
		compquest 130122;
		mes "[�J���D]";
		mes "�ق�ٖM�l�I";
		mes "������̂��ʒ��I";
		mes "�����ז����Ȃ��ł����ȁ[�B";
		mes "����A�s�������[�I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c���Z���ƈڏZ�̖����B";
		mes "�@�q�������̊Ԃɂ�";
		mes "�@���������ӎ����Z�����Ă�̂��j";
		cloakonnpc "���N�V�[#ep18";
		cloakonnpc "�J���D#ep18";
		close;
	}
	mes "[�i�C�}��]";
	mes "�����c�c�ƂɋA�肽���B";
	mes "���ǁA�܂��܂��V�т������c�c�B";
	close;
OnQuestInfo:
	if(checkquest(16583))
		showevent 0, 3, "�i�C�}��#ep18";
	else
		showevent 9999,0,"�i�C�}��#ep18";
	end;
}
rachel.gat,181,51,3	script	�A���f�B�s��#ep18	929,{/* 16069 */
	if(EP18_1QUE < 36) {
		mes "^ff0000�]�N�G�X�g�u�J���̑Ή��v��";
		mes "�@���L�̏����𖞂����Ɛi�s�\�ł��B";
		mes "�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(130101)) {
		mes "[�A���f�B�s��]";
		mes "���������������炦�Ȃ��Ȃ�āI";
		mes "�����O�����ڂȂ񂾂��c�c";
		mes "����ȓX�A�����Ɏ��߂�������";
		mes "���������疢�����̋��^�����炦�Ȃ��B";
		next;
		mes "[�A���f�B�s��]";
		mes "���Ɏd�������߂Ă�";
		mes "���݂����Ȍ��Z����";
		mes "�����Ɏd����������Ȃ���";
		mes "�����A�ǂ������炢���񂾁I";
		next;
		mes "[�A���f�B�s��]";
		mes "�͂��I";
		mes "�M���A�`���҂ł��ˁI";
		mes "�����܂����Ƃ͎v���܂���";
		mes "���肢���������܂��I";
		next;
		mes "[�A���f�B�s��]";
		mes "�����̎В��ɖ������̋�����";
		mes "���Ɏx�����悤�Ñ����Ă��炦�܂���H";
		next;
		mes "[�A���f�B�s��]";
		mes "���́A�В��́u�`���ҁv��";
		mes "����Ă��ł��B";
		mes "���̘b�͕����Ă���܂���";
		mes "�M���̘b�Ȃ畷���Ă�����";
		mes "�Ⴂ����܂����B";
		next;
		if(select("����Ă݂܂��傤","���͎��Ԃ��Ȃ��ł�") == 2) {
			mes "[�A���f�B�s��]";
			mes "����ȎE���ȁ`�`�I";
			close;
		}
		mes "[�A���f�B�s��]";
		mes "���肪�Ƃ��������܂��I";
		mes "���肪�Ƃ��������܂��I";
		mes "�В��̖��O�́u�_�q���v�ł��B";
		mes "��낵�����肵�܂��I";
		delquest 130101;
		setquest 16584;
		close;
	}
	if(checkquest(16585)) {
		mes "[�A���f�B�s��]";
		mes "���A��Ȃ����I";
		mes "�ŁA�������ł������H";
		mes "��肭����Ă��������܂����H";
		next;
		mes "[�A���f�B�s��]";
		mes "�������x�����Ă����ƁI";
		mes "�����A���������܂Ŏq��������";
		mes "�������ς��̐H����";
		mes "���𔃂��Ă��܂��I";
		mes "���肪�Ƃ��������܂��I";
		next;
		mes "[�A���f�B�s��]";
		mes "�́`�`�ł��A��������܂�";
		mes "������������񂾂낤�Ȃ��B";
		mes "�܂��A�������炦�邩��";
		mes "�䖝�䖝�B";
		next;
		mes "[�A���f�B�s��]";
		mes "�����`���͗����܂�����";
		mes "���Z�����X�ŕ�炵�Ă����ȏ��";
		mes "���ꂮ�炢�̂��Ƃ͉䖝���Ȃ���";
		mes "����Ă����Ȃ���ł���B";
		next;
		mes "[�A���f�B�s��]";
		mes "�X���瓦���o�������Z���̑���";
		mes "������ĉ\�����������Ƃ���܂���";
		mes "�q�������܂�����ˁB";
		mes "����ȂƂ���ɍs���E�C�͂Ȃ��ł��B";
		next;
		delquest 16585;
		setquest 202345;
		getitem 1000405,10;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		setquest 130121;
		compquest 130121;
		mes "[�A���f�B�s��]";
		mes "�Ƃɂ����A�M���͎��̉��l�ł��B";
		mes "���Z�����Ƃ���";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		mes "���̌䖳�����F���Ă܂���B";
		close;
	}
	mes "[�A���f�B�s��]";
	mes "���������A���̓��̐H�ו���";
	mes "�q�������̂��Ƃ��S�z�Łc�c";
	mes "�Y�ݎ��̂Ȃ����͂���܂���B";
	mes "���Z���Ƃ��Đ��܂ꂽ������";
	mes "�ǂ����Ă���Ȃɋ�J������̂��c�c�B";
	close;
OnQuestInfo:
	if(checkquest(130101) || checkquest(16585))
		showevent 0, 3, "�A���f�B�s��#ep18";
	else
		showevent 9999,0,"�A���f�B�s��#ep18";
	end;
}
rachel.gat,136,95,3	script	�_�q��#ep18	930,{/* 16070 */
	mes "[�_�q��]";
	mes "��������Ⴂ�I";
	mes "�_�q������ł���܂���I";
	mes "�������T���Łc�c����H";
	mes "�M���͖`���җl�ł��ˁI";
	next;
	mes "[�_�q��]";
	mes "�����B�����������Ă�";
	mes "�`���҂��u���Ă�����ł��B";
	mes "�������A���ɉ���𕉂��Ă��܂�";
	mes "�`���҂ƂȂ铹��f�O�����̂ł��B";
	mes "����`����͒ɂ������ȁ`�I";
	if(checkquest(16584)) {
		next;
		mes "[�_�q��]";
		mes "��낵����΁A�`���җl�̂������";
		mes "�������Ă��������܂��񂩁H";
		mes "���́A�`���җl�̂��b�𕷂��̂�";
		mes "��D���Ȃ�ł���B";
		next;
		menu "�Ⴄ�b�����ɗ��܂���",-;
		mes "[�_�q��]";
		mes "�A���f�B�s���̋����ł����H";
		mes "�A���f�B�s�����痊�܂ꂽ��ł����H";
		mes "�����A��C�ɕ����ƌ����Ă����̂�";
		mes "�`���җl�𗘗p����Ƃ�";
		mes "�@���ɂ����Z���炵����ᛂȎ���I";
		next;
		menu "�ǂ��������Ƃł����H",-;
		mes "[�_�q��]";
		mes "���Z���͎��B�ڏZ�̖��ƈ����";
		mes "�l�̌��ɉB��邱�Ƃ��D�݂܂��B";
		mes "�܂��������������̂��I";
		next;
		menu "�����̖������͊Ԉ���Ă�",-,"����͍��ʂł́H",-;
		mes "[�_�q��]";
		mes "���₢��A�킩���Ă܂����āI";
		mes "���̓L���b�V�����������킹��";
		mes "���Ȃ������ł��I";
		next;
		mes "[�_�q��]";
		mes "�܂��A�m���Ɂ`�A���f�B�s���ւ�";
		mes "�x��������ԍŌ�ɂȂ�܂������`�B";
		mes "�����܂ŏ��Ԃ̖��ł��B�͂��B";
		next;
		mes "[�_�q��]";
		mes "�������I";
		mes "�����ɂ͋��^���x������";
		mes "����̂��Ƃ�����Ȃ���";
		mes "�A���f�B�s���ɂ��`�����������I";
		mes "���A���߂��Ă�����܂�����ˁI";
		delquest 16584;
		setquest 16585;
	}
	close;
OnQuestInfo:
	if(checkquest(16584))
		showevent 0, 3, "�_�q��#ep18";
	else
		showevent 9999,0,"�_�q��#ep18";
	end;
}
wolfvill.gat,188,140,7	script	�J�X��#���̏Z��	10401,{/* 16071 */
	mes "[�J�X��]";
	mes "���`�`��A���܂����ȓ����I";
	mes "�o���オ��܂ł�����";
	mes "�҂��Ă�`���ƁB";
	next;
	mes "[�J�X��]";
	mes "�����ő҂��Ă����";
	mes "��ԍŏ��ɐH�ׂ������ˁI";
	close;
}
wolfvill.gat,202,130,7	script	�q�����X#���̏Z��	10400,{/* 16072 */
	mes "[�q�����X]";
	mes "�悻�҂́A���ꂪ�C�ɂȂ�́H";
	mes "�ۑ��H�i�̒M����B";
	mes "�܂����y��������A�G������_���B";
	next;
	mes "[�q�����X]";
	mes "���ꂿ���̂��ꂿ��񂩂�`���";
	mes "�y��Ŕ��y�����Ă�́B";
	mes "�����������ǁA����������H";
	close;
}
wolfvill.gat,224,230,3	script	�j�j�V#���̏Z��	10402,{/* 16073 */
	mes "[�j�j�V]";
	mes "���ɓ�������_���Ȃ񂾂��āB";
	mes "�ǂ����Ă��ȁH";
	mes "�������ċC�����悳�����Ȃ̂Ɂc�c�B";
	next;
	mes "[�j�j�V]";
	mes "�����͂����ɊD�܂݂�ɂȂ邩��";
	mes "���V�т������̂ɂȁ`�B";
	close;
}
wolfvill.gat,53,234,0	script	#ep18_wp01	139,14,14,{/* 16074 */
	if(checkquest(130104)) {
		cloakoffnpc "�n�U�[��#ep18_1";
		cloakoffnpc "�J�~��#ep18_1";
		cloakoffnpc "�A���p�׎�#ep18_1";
	}
	else if(checkquest(12532)) {
		cloakoffnpc "�n�U�[��#ep18_1";
		cloakoffnpc "�A���p�׎�#ep18_1";
	}
	else if(checkquest(12533)) {
		//Non
	}
	else {
		cloakonnpc "�n�U�[��#ep18_1";
		cloakonnpc "�J�~��#ep18_1";
		cloakonnpc "�A���p�׎�#ep18_1";
	}
	end;
}
wolfvill.gat,50,234,6	script	�n�U�[��#ep18_1	10389,{/* 16075 (cloaking)*/
	if(checkquest(12532)) {
		if(!(checkquest(12532)&8)) {
			mes "[�n�U�[��]";
			mes "�ӂށA���O���񂪖{����";
			mes "�׎Ԃ̎ԗւ𒼂��邩�������";
			mes "�����͐M���Ă݂悤����Ȃ����B";
			close;
		}
		mes "^0000ff�]�n�U�[�����F�D�I�Ȋ፷�������Ă����]^000000";
		next;
		mes "[�n�U�[��]";
		mes "�ق��c�c";
		mes "���O����A��p����̂��B";
		mes "�`���҂Ƃ����݂̂͂��";
		mes "���O����݂����Ɋ�p�Ȃ̂��ˁH";
		next;
		cloakoffnpc "�J�~��#ep18_1";
		cloakoffnpc "�A���p�׎�#ep18_1";
		mes "[�J�~��]";
		mes "�e���I";
		mes "�ژ^���m�F���܂����B";
		mes "�K�v�Ȃ��̂͑S�������Ă��܂��B";
		mes "���Ƃ͎ԗւ�����Ώo���ł��܂��B";
		next;
		mes "[�n�U�[��]";
		mes "�ԗւȂ�A������̖`���җl��";
		mes "�C�����Ă������������B";
		mes "�����Ɨ�����Ȃ����B";
		next;
		mes "[�J�~��]";
		mes "���ɂ��肪�Ƃ��������܂�";
		mes "�`���җl�B";
		mes "�߂�����K��������������܂��̂�";
		mes "���O�������Ă��������Ȃ��ł��傤���H";
		next;
		mes "[�J�~��]";
		mes strcharinfo(0)+"�l�ł��ˁB";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�ł͐e���A�s���ĎQ��܂��I";
		next;
		cloakonnpc "�J�~��#ep18_1";
		cloakonnpc "�A���p�׎�#ep18_1";
		mes "[�n�U�[��]";
		mes "�����c�c";
		mes "�����т͒�q�������Ă�������";
		mes "���肪�Ƃ��������܂��B";
		mes "�������A�����Ƀ��w���܂�";
		mes "���ǂ蒅���邩�ǂ����c�c�B";
		next;
		mes "[�n�U�[��]";
		mes strcharinfo(0)+"����B";
		mes "�����ЂƂA���̘V���ڂ�̊肢��";
		mes "�����Ă��炦�񂾂낤���H";
		next;
		mes "[�n�U�[��]";
		mes "�J�~���̓z�������𗦂���";
		mes "���w���܂ŉׂ�͂����邩";
		mes "���͂��Ă��炦�񂶂�낤���B";
		mes "�J�~���������𗦂���̂�";
		mes "���񂪏��߂ĂłȁB";
		next;
		mes "[�n�U�[��]";
		mes "���w���ɖ񑩂̕i���͂����";
		mes "���̑��̎������₦�邱�ƂɂȂ�B";
		mes "�J�~�������s���ʂ悤��";
		mes "�����Ă��炢�����̂���B";
		next;
		menu "��������",-;
		mes "[�n�U�[��]";
		mes "���肪�Ƃ��A";
		mes strcharinfo(0)+"����B";
		mes "��낵�����݂܂����B";
		delquest 12532;
		setquest 12533;
		close;
	}
	if(checkquest(12533)) {
		mes "^0000ff�]�n�U�[�����F�D�I�Ȋ፷�������Ă����]^000000";
		next;
		mes "[�n�U�[��]";
		mes "���肪�Ƃ��A";
		mes strcharinfo(0)+"����B";
		mes "��낵�����݂܂����B";
		close2;
		cloakonnpc "�n�U�[��#ep18_1";
		end;
	}
	if(checkquest(130104)) {
		mes "^0000FF�]�V�l���N�������Ă���̂��������]^000000";
		next;
		mes "[�n�U�[��]";
		mes "���������w���ɉׂ��^�ԓ�����";
		mes "�`���Ă����͂����Ⴊ";
		mes "���̉׎Ԃ͂Ȃ񂶂�H";
		mes "�ԗւɃq�r�������Ƃ�B";
		next;
		mes "[�J�~��]";
		mes "�\���󂲂����܂���I";
		mes "�V�����ԗւ�T������ł���";
		mes "�\�����Ȃ��āc�c�B";
		next;
		mes "[�n�U�[��]";
		mes "�v��30��ݕK�v���Ⴊ";
		mes "�ǂ��ɂ���H";
		mes "����ɉ׎Ԃ��������n��";
		mes "��������񂼁H";
		next;
		mes "[�J�~��]";
		mes "�\���󂲂����܂���A";
		mes "������������͂��ł��I";
		next;
		mes "[�n�U�[��]";
		mes "�c�c��q�̎҂́A�ǂ������H";
		mes "�Ȃ������ɂ��Ȃ��̂��H";
		mes "�܂����A���O��l��";
		mes "���w���܂ŉׂ��^�Ԃ��肩�H";
		next;
		mes "[�J�~��]";
		mes "���ꂪ�c�c";
		mes "��q���W�����̂ł���";
		mes "�u�肵�Ă����l�����Ȃ��āc�c�B";
		next;
		mes "[�n�U�[��]";
		mes "�͂��c�c";
		mes "�����s���Ɋւ��Ă�";
		mes "��ŉ��߂Ė₢��������";
		mes "����ɒx���킯�ɂ͂�����B";
		mes "�܂��͖����������˂΁B";
		next;
		mes "[�J�~��]";
		mes "�c�c�܂��͊v�𒲒B���܂��B";
		mes "���͎�z�ςȂ̂�";
		mes "���ꂩ�瓞������͂��ł��B";
		next;
		mes "[�n�U�[��]";
		mes "�׎Ԃ̎ԗւ͂ǂ�����H";
		mes "�����������������ŉ�ꂻ������B";
		mes "����ł̓��w���܂Ŏ����񂼁H";
		next;
		if(select("�ԗւ̏C������`��","�ʂ�߂���") == 2) {
			mes "^0000FF�]�ւ��̂́A��߂Ă������]^000000";
			close;
		}
		mes "[�n�U�[��]";
		mes "�Ȃ񂶂�ƁH";
		mes "�ӂނӂށc�c��v�Ȗ��Ŏԗւ�";
		mes "�⋭����ƁH";
		next;
		mes "[�n�U�[��]";
		mes "�ӂށA���O���񂪖{����";
		mes "�׎Ԃ̎ԗւ𒼂��邩�������";
		mes "�����͐M���Ă݂悤����Ȃ����B";
		next;
		mes "[�J�~��]";
		mes "�`���җl�I";
		mes "����̃��w���ւ̉׉^�т�";
		mes "�l���ӔC�҂�C����Ă��܂��B";
		next;
		mes "[�J�~��]";
		mes "�׎Ԃ̎ԗւ��C�����Ă����������";
		mes "������p�ӂ������܂��̂�";
		mes "������낵�����肢�������܂��B";
		mes "�ł́A�l�͉ו��̊m�F�̂��߂�";
		mes "�Ȃ��O���܂��B";
		delquest 130104;
		setquest 12532;
		close2;
		cloakonnpc "�J�~��#ep18_1";
		end;
	}
OnQuestInfo:
	if(checkquest(130104))
		showevent 0, 3, "�n�U�[��#ep18_1";
	else
		showevent 9999,0,"�n�U�[��#ep18_1";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,53,234,4	script	�A���p�׎�#ep18_1	10390,{/* 16076 (cloaking)*/
	if(checkquest(12532)) {
		mes "�]�{���{���ɂȂ����׎Ԃ̎ԗւ�����B";
		mes "�@<ITEM>[��v�Ȗ�]<INFO>7197</INFO></ITEM>�������";
		mes "�@�⋭�ł��邩������Ȃ��]";
		next;
		if(select("�⋭������","��߂Ă���") == 2) {
			mes "^0000FF�]�o�������Ƃɂ����]^000000";
			close;
		}
		progressbar 2,"�A���p�׎�#ep18_1";	//color=0xffff00
		if(countitem(7197) < 1) {
			mes "�]�ԗւ�⋭���邽�߂�";
			mes "�@<ITEM>[��v�Ȗ�]<INFO>7197</INFO></ITEM>��";
			mes "�@�����Ă��Ȃ������]";
			close;
		}
		if(rand(100) < 50) {
			misceffect 154,"�A���p�׎�#ep18_1";
			mes "^0000FF�]��肭�⋭�ł����I�]^000000";
			delitem 7197,1;
			delmisceffect 1090, "�A���p�׎�#ep18_1";
			compquest 12532;
			close;
		}
		else {
			//������
			misceffect 155,"�A���p�׎�#ep18_1";
			mes "^0000FF�]�⋭�Ɏ��s���Ă��܂����I�]^000000";
			delitem 7197,1;
			close;
		}
	}
	mes "�]�{���{���ɂȂ����׎Ԃ̎ԗւ�����B";
	close;
OnQuestInfo:
	if(checkquest(12532) && !(checkquest(12532)&8) && countitem(7197) < 1)
		showevent 0, 2, "�A���p�׎�#ep18_1";
	else if(!(checkquest(12532)&8))
		showevent 0, 3, "�A���p�׎�#ep18_1";
	else
		showevent 9999,0,"�A���p�׎�#ep18_1";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,56,234,4	script	�J�~��#ep18_1	10388,{/* 16077 (cloaking)*/
	mes "^0000FF�]�V�l�Ɏ����Ă���N���������]^000000";
	close;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,115,130,0	script	#ep18_wp02	139,5,5,{/* 16078 */
	if(checkquest(12533)) {
		cloakoffnpc "�A���p�׎�#ep18_2";
	}
	end;
}
gw_fild01.gat,115,130,4	script	�A���p�׎�#ep18_2	10390,{/* 16079 (cloaking)*/
	if(checkquest(12533)) {
		mes "^0000FF�]�J�~���������Ă����׎Ԃ��B";
		mes "�@�ωׂ����͂ɎU�����Ă���B";
		mes "�@�����ǂ��Ȃ����Ƃ��N�����ɈႢ�Ȃ��B";
		mes "�@�J�~����T���������ǂ����낤�]^000000";
		delquest 12533;
		setquest 12534;
		close;
	}
	if(checkquest(12534)) {
		mes "^0000FF�]�J�~���������Ă����׎Ԃ��B";
		mes "�@�ωׂ����͂ɎU�����Ă���]^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(12533))
		showevent 0, 3, "�A���p�׎�#ep18_2";
	else
		showevent 9999,0,"�A���p�׎�#ep18_2";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,202,102,0	script	#ep18_wp03	139,4,4,{/* 16080 */
	if(checkquest(12534)) {
		if(!(checkquest(12534)&8))
			cloakoffnpc "#ep18_2_mon";
		cloakoffnpc "�J�~��#ep18_2";
	}
	else {
		cloakonnpc "�J�~��#ep18_2";
		cloakonnpc "#ep18_2_mon";
	}
	end;
}
gw_fild01.gat,205,102,4	script	#ep18_2_mon	21304,{/* 16081 (cloaking)*/
	if(checkquest(12534)) {
		unittalk getnpcid(0,"#ep18_2_mon"),"������c";
		unittalk getnpcid(0,"�J�~��#ep18_2"),"�������傤";
		mes "^0000FF�]�J�~���������X�^�[�ƑΛ����Ă���B";
		mes "�@�󋵂͂��܂�ǂ��Ȃ��������B";
		mes "�@�J�~�����x�����������ǂ����낤�]^000000";
		while(1) {
			next;
			switch(select("�퓬�̏������s��","�����X�^�[�𒼐ړ|��","�m���Ղ肵�Ēʂ�߂���")) {
			case 1:
				mes "^0000ff�J�~���ɘT�ւ̍U�����@���w�����悤^000000";
				set '@kamir_hp,1000;
				set '@mon_hp,1000;
				break;
			case 2:
				mes "["+strcharinfo(0)+"]";
				mes "�i����c�c";
				mes "�@�ނ̐����̂��߂ɂ�������";
				mes "�@�������Ă���������������낤)";
				continue;
			case 3:
				mes "^0000FF�]��������o�������Ƃɂ��悤�]^000000";
				close;
			}
			break;
		}
		do {
			mes "�T�̐����� - ^ff0000" +'@mon_hp+ "^000000";
			mes "�J�~���̐����� - ^0000ff" +'@kamir_hp+ "^000000";
			next;
			switch(select("��U��(�����m��)","���U��(���ʂ̊m��)","���U��(�Ⴂ�m��)","��S�̈ꌂ(��ՓI�Ȋm��)","��������ދp����")) {
			case 1:
				set '@rate,90;
				set '@damage,10;
				break;
			case 2:
				set '@rate,60;
				set '@damage,30;
				break;
			case 3:
				set '@rate,30;
				set '@damage,70;
				break;
			case 4:
				set '@rate,10;
				set '@damage,200;
				break;
			case 5:
				mes "^0000FF�]��������o�������Ƃɂ��悤�]^000000";
				close;
			}
			if('@rate < rand(100)) {
				misceffect 537,"#ep18_2_mon";
				misceffect 567,"#ep18_2_mon";
				unittalk getnpcid(0,"#ep18_2_mon"),"-"+ '@damage;
				unittalk getnpcid(0,"�J�~��#ep18_2")," ";
			}
			else {
				misceffect 537,"�J�~��#ep18_2";
				misceffect 567,"�J�~��#ep18_2";
				unittalk getnpcid(0,"#ep18_2_mon")," ";
				unittalk getnpcid(0,"�J�~��#ep18_2"),"-"+ '@damage;
			}
		} while('@mon_hp <= 0 || '@kamir_hp <= 0);
		if('@mon_hp <= 0) {
			mes "^0000ff�T��|�����I^000000";
			compquest 12534;
			cloakonnpc "#ep18_2_mon";
			close;
		}
		else {
			mes "^0000ff��x�P�ނ��悤�I^000000";
			close;
		}
	}
OnQuestInfo:
	if(checkquest(12534) && !(checkquest(12534)&8))
		showevent 0, 3, "#ep18_2_mon";
	else
		showevent 9999,0,"#ep18_2_mon";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,201,102,6	script	�J�~��#ep18_2	10388,{/* 16082 (cloaking)*/
	if(checkquest(12534) && checkquest(12534)&8) {
		mes "[�J�~��]";
		mes "�͂��c�c�͂��c�c";
		mes "���肪�Ƃ��������܂��A�`���җl�B";
		mes "���������������Ȃ����";
		mes "�����l�́A�����X�^�[�̕��̒��ł����B";
		next;
		mes "[�J�~��]";
		mes "�הn�Ԃ������ɂȂ�ꂽ�Ǝv���܂���";
		mes "�z��ɐωׂ�D���Ă��܂��āc�c";
		mes "�S�������Ԃ��͖̂����ł�����";
		mes "�Ȃ�Ƃ��ꕔ�����߂��܂����B";
		next;
		mes "[�J�~��]";
		mes "�l�͎��߂������̐ωׂ�������";
		mes "���ɖ߂�A����̎��s�̔���";
		mes "�󂯂����ł��B";
		next;
		menu "����͎��̂ł͂Ȃ��ł����H",-;
		mes "[�J�~��]";
		mes "�c�c���������̐H���␶���K���i��";
		mes "��������\��̐ωׂ�������ł��B";
		mes "�����Čy���߂ł͂���܂���B";
		next;
		mes "[�J�~��]";
		mes "���X�A�e���͖l���ו����^�Ԃ��Ƃ�";
		mes "���΂��Ă���ꂽ��ł��B";
		mes "�ɂ��ւ�炸������ʂ����͖̂l�ł��B";
		mes "���ׂĖl�̐ӔC�ł��B";
		next;
		mes "[�J�~��]";
		mes "�����l���������肵����";
		mes "�e���������";
		mes "�ӔC�𕉂����ƂɂȂ�܂��B";
		mes "���ꂾ���͂����Ă͂����܂���B";
		next;
		mes "[�J�~��]";
		mes "�c�c�����͂Ɋ��ӂ������܂��B";
		mes "�l�͑��ɖ߂�܂��B";
		mes "�^���������Ă�����";
		mes "�܂����Ǝv���܂��c�c�B";
		delquest 12534;
		setquest 12535;
		close2;
		cloakonnpc "�J�~��#ep18_2";
		end;
	}
	if(checkquest(12535)) {
		// ������
	}
	mes "^0000FF�]���͘b�𕷂��Ȃ���Ԃ̂悤���]^000000";
	close;
OnQuestInfo:
	if(checkquest(12534) && checkquest(12534)&8)
		showevent 0, 3, "�J�~��#ep18_2";
	else
		showevent 9999,0,"�J�~��#ep18_2";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,76,210,0	script	#ep18_wp03	139,4,4,{/* 16083 */
	if(checkquest(12535) || checkquest(12531)) {
		cloakoffnpc "�n�U�[��#ep18_3";
		cloakoffnpc "�J�~��#ep18_3";
		cloakoffnpc "����l#ep18_31";
		cloakoffnpc "����l#ep18_32";
		cloakoffnpc "����l#ep18_33";
	}
	else {
		cloakonnpc "�n�U�[��#ep18_3";
		cloakonnpc "�J�~��#ep18_3";
		cloakonnpc "����l#ep18_31";
		cloakonnpc "����l#ep18_32";
		cloakonnpc "����l#ep18_33";
	}
	end;
}
wolfvill.gat,75,214,4	script	�n�U�[��#ep18_3	10389,{/* 16084 (cloaking)*/
	if(checkquest(12535)) {
		mes "^0000FF�]���̑����傽���ɂ���c��";
		mes "�@�s���Ă���]^000000";
		next;
		mes "[�n�U�[��]";
		mes "�F�ɂ͂܂��Ƃɐ\����Ȃ��c�c";
		mes "�厖�Ȑωׂ������Ƃ�";
		mes "�N�̕s���̒v���Ƃ���B";
		next;
		mes "[����l]";
		mes "�n�U�[���A���O�̂����ł͂Ȃ��B";
		mes "�����������𗦂��悤�Ƃ���";
		mes "�J�~���̐ӔC���낤�H";
		next;
		mes "[�n�U�[��]";
		mes "����B��q�Ɍo����ς܂��邽�߂�";
		mes "�����𗦂���悤�Ɍ������̂�";
		mes "�N�Ȃ̂���B";
		next;
		mes "[�J�~��]";
		mes "�Ⴂ�܂��I";
		mes "�l���킪�܂܂�������";
		mes "�t���ɖ��������Ă����������̂ł��I";
		mes "�S�Ă̐ӔC�͖l�ɂ���܂��I";
		next;
		mes "[�n�U�[��]";
		mes "�J�~���I";
		mes "���O�͖ق��Ă���I";
		unittalk getnpcid(0,"����l#ep18_31"),"�͂��c�c";
		unittalk getnpcid(0,"����l#ep18_32"),"�ӂ��ށc�c";
		unittalk getnpcid(0,"����l#ep18_33"),"�����c�c";
		next;
		mes "[����l]";
		mes "���������J�~����c��������";
		mes "������Ă������ꂾ�B";
		mes "����͕�����Ȃ����Ȃ��B";
		next;
		mes "[����l]";
		mes "����͕����邪";
		mes "�����ɂ͑����̝|������B";
		next;
		mes "[����l]";
		mes "�����̝|�ɏ]����";
		mes "�J�~���̎�������o���˂΂Ȃ��B";
		next;
		mes "[�J�~��]";
		mes "�|�ɏ]���܂��B";
		mes "�l�̐ӔC�Ȃ̂ł�����";
		mes "�P�W�����������Ă��������B";
		next;
		mes "[�n�U�[��]";
		mes "����T�߁A�J�~���I";
		next;
		mes "[����l]";
		mes "�������_���}���ȁc�c";
		mes "�܂��͔�Q�̏󋵂��m�F���悤�B";
		next;
		mes "[����l]";
		mes "�v�����������Ƃɂ����";
		mes "�{���w���ł���͂��������H�ƂȂǂ�";
		mes "�\��ʂ�ɍw���ł��Ȃ������B";
		mes "�����܂ł͊ԈႢ�Ȃ��ȁH";
		next;
		mes "[����l]";
		mes "���ށc�c";
		mes "����Ȃ�A�������ɑ���������";
		mes "�{������g�D��";
		mes "�����X�^�[�ɒD��ꂽ�ׂ�";
		mes "�T���Ηǂ��̂ł͂Ȃ����H";
		next;
		mes "[����l]";
		mes "����͂�������";
		mes "��炪�{������g�D�����";
		mes "����̌��A�����ɒm��n�邾�낤�B";
		next;
		mes "[����l]";
		mes "�c�c�����Ȃ�΁A�J�~����";
		mes "�������Ȃ���΂Ȃ�Ȃ��Ȃ�ȁB";
		next;
		menu "���݂��܂��傤���H",-;
		mes "[�n�U�[��]";
		mes strcharinfo(0)+"����H";
		mes "�������c�c";
		mes "���O�҂̎���؂��킯�ɂ́c�c�B";
		next;
		mes "[����l]";
		mes "����B";
		mes "���O�҂ł��邱�Ƃ̕����s�����ǂ��B";
		mes "���O�҂��ו���T���o���Ă�����";
		mes "����̌��͑�����������";
		mes "�����������Ƃɂł���B";
		next;
		mes "[�n�U�[��]";
		mes strcharinfo(0)+"����c�c";
		mes "�{���Ɏ��݂��Ă�������̂��H";
		mes "��X�̑����";
		mes "�ωׂ�T���Ă��Ă����ƁH";
		next;
		menu "���C�����������I",-;
		mes "[����l]";
		mes "�J�~���̂��߂ɓ����Ă����Ƃ�";
		mes "�c�c���ӂ������܂��B";
		next;
		mes "[����l]";
		mes "����������ӂ������܂��B";
		mes "�J�~���͂܂��܂����n�ł���";
		mes "�����ɂ͐ɂ����l���ł�����ȁB";
		next;
		mes "[�n�U�[��]";
		mes "�{���ɁA�Ȃ�Ɨ�������Ηǂ����c�c";
		mes "�J�~���A�`���җl�ɐωׂ�";
		mes "���������ꏊ�����`�����Ȃ����B";
		next;
		mes "[�J�~��]";
		mes "�́A�͂��I";
		mes "�킩��܂����I";
		mes "�@";
		mes "^0000FF�]�J�~������ςׂ݉����������ꏊ��";
		mes "�@�����Ă�������]^000000";
		delquest 12535;
		setquest 12536;
		setquest 12537;
		setquest 12538;
		setquest 12539;
		next;
		mes "[�n�U�[��]";
		mes "������낵�����肢�������܂��B";
		close2;
		cloakonnpc "�n�U�[��#ep18_3";
		cloakonnpc "�J�~��#ep18_3";
		cloakonnpc "����l#ep18_31";
		cloakonnpc "����l#ep18_32";
		cloakonnpc "����l#ep18_33";
		end;
	}
	if(checkquest(12531)) {
		mes "^0000FF�]���̑����傽���ɂ���c��";
		mes "�@�s���Ă���B";
		mes "�@�ނ�Ɍ������ωׂ�n�����]^000000";
		next;
		mes "[����l]";
		mes "�����c�c����Ȃɂ�����!?";
		next;
		mes "[����l]";
		mes "�ǂ�ǂ�c�c�H";
		mes "���ށc�c��������Ȃ��悤����";
		mes "���ꂮ�炢�̗ʂ́A�s�Ǖi�Ƃ���";
		mes "����ΏۂɂȂ�Ȃ��������̂Ƃ���";
		mes "�����ł��܂��ȁB";
		next;
		mes "[����l]";
		mes "���e�͈͓��ł����";
		mes "����̉�c�̈Č���";
		mes "�ύX����ׂ��ł��傤�ȁB";
		next;
		mes "[����l]";
		mes "���Օi�̈⎸�Ɋւ��Ăł͂Ȃ�";
		mes "�����̏o�����x�����Ă��錏��";
		mes "�ύX����Ƃ������Ƃ�";
		mes "�\���܂���ȁH";
		next;
		mes "[�n�U�[��]";
		mes "�o�����\�������x��Ă���B";
		mes "���̌��ɂ��Č��_���o���Ă�������B";
		next;
		mes "[����l]";
		mes "�ł́A�x���̐ӔC�������";
		mes "�J�~���ɂ�3�����Ԃ�";
		mes "�G���ɓ����邱�Ƃ���������B";
		mes "������Ƃ��s����";
		mes "����̌��𔽏Ȃ��Ă��炨���B";
		next;
		mes "[����l]";
		mes "�ًc�Ȃ��I";
		mes "�@";
		mes "[����l]";
		mes "�����ًc����܂���B";
		next;
		mes "[�n�U�[��]";
		mes "�悩�����́A�J�~���B";
		mes "�ł���͖Ƃꂽ�킢�B";
		next;
		mes "[�J�~��]";
		mes "���肪�Ƃ��������܂��A�e���B";
		mes "������̊F�l�ɂ����ӂ������܂��B";
		next;
		delquest 12531;
		setquest 202330;
		getitem 1000405,20;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		getexp 1800000000,0,0;
		getexp 0,1500000000,0;
		setquest 130124;
		compquest 130124;
		mes "[�J�~��]";
		mes strcharinfo(0)+"�l��";
		mes "�{���ɂ��肪�Ƃ��������܂����I";
		mes "�M���͎��̖��̉��l�ł��B";
		mes "�c�c�����₩�ł�������̕i��";
		mes "�p�ӂ��܂����B���󂯎�肭�������B";
		emotion 28,"����l#ep18_31";
		close2;
		cloakonnpc "�n�U�[��#ep18_3";
		cloakonnpc "�J�~��#ep18_3";
		cloakonnpc "����l#ep18_31";
		cloakonnpc "����l#ep18_32";
		cloakonnpc "����l#ep18_33";
	}
	end;
OnQuestInfo:
	if(checkquest(12535) || checkquest(12531))
		showevent 0, 3, "�n�U�[��#ep18_3";
	else
		showevent 9999,0,"�n�U�[��#ep18_3";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,79,213,3	script	�J�~��#ep18_3	10388,{/* 16085 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,72,209,8	script	����l#ep18_31	929,{/* 16086 (cloaking)*/
	mes "[����l]";
	mes "��c���̎G�k�͋֎~����Ă���B";
	close;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,74,208,8	script	����l#ep18_32	928,{/* 16087 (cloaking)*/
	mes "[����l]";
	mes "�G�k���Ă���ɂ͖������B";
	close;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,77,207,8	script	����l#ep18_33	931,{/* 16088 (cloaking)*/
	mes "[����l]";
	mes "���܂Ȃ���";
	mes "��ɂ��Ă���Ȃ����H";
	mes "���͉�c���Ȃ񂾁B";
	close;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,242,325,4	script	#ep18_12536	10428,{/* 16089 (cloaking)*/
	if(checkquest(12536)) {
		misceffect 561,"#ep18_12536";
		progressbar 2,"#ep18_12536";	//color=0xffff00
		delmisceffect 561, "#ep18_12536";
		misceffect 135,"#ep18_12536";
		delquest 12536;
		if(checkquest(12536) || checkquest(12537) || checkquest(12538) || checkquest(12539))
			unittalk getcharid(3),strcharinfo(0)+" : �]�ו����������I�]",1;
		else {
			unittalk getcharid(3),strcharinfo(0)+" : �]�ו����������I�����[������ł����悤���]",1;
			setquest 12531;
		}
		cloakonnpc "#ep18_12536";
	}
	end;
OnQuestInfo:
	if(checkquest(12536))
		showevent 0, 3, "#ep18_12536";
	else
		showevent 9999,0,"#ep18_12536";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,242,325,0	script	#wp12536	139,{/* 16090 */}
gw_fild01.gat,89,211,4	script	#ep18_12537	10428,{/* 16091 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,89,211,0	script	#wp12537	139,{/* 16092 */}
gw_fild01.gat,347,194,4	script	#ep18_12538	10428,{/* 16093 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,347,194,0	script	#wp12538	139,{/* 16094 */}
gw_fild01.gat,230,52,4	script	#ep18_12539	10428,{/* 16095 (cloaking)*/
	if(checkquest(12539)) {
		misceffect 561,"#ep18_12539";
		progressbar 2,"#ep18_12539";	//color=0xffff00
		delmisceffect 561, "#ep18_12539";
		misceffect 135,"#ep18_12539";
		delquest 12539;
		if(checkquest(12536) || checkquest(12537) || checkquest(12538) || checkquest(12539))
			unittalk getcharid(3),strcharinfo(0)+" : �]�ו����������I�]",1;
		else {
			unittalk getcharid(3),strcharinfo(0)+" : �]�ו����������I�����[������ł����悤���]",1;
			setquest 12531;
		}
		cloakonnpc "#ep18_12539";
	}
	end;
OnQuestInfo:
	if(checkquest(12539))
		showevent 0, 3, "#ep18_12539";
	else
		showevent 9999,0,"#ep18_12539";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,230,52,0	script	#wp12539	139,5,5,{/* 16096 */
	if(checkquest(12539))
		cloakoffnpc "#ep18_12539";
	end;
}
rachel.gat,155,236,0	script	#ep18w12_148	139,14,14,{/* 16097 */
	if(EP18_1QUE >= 36)
		cloakoffnpc "���ÂȐ_���W���m�[�N#atm0";
	else
		cloakonnpc "���ÂȐ_���W���m�[�N#atm0";
	end;
}
rachel.gat,155,236,3	script	���ÂȐ_���W���m�[�N#atm0	935,{/* 16098 (cloaking)*/
	// ���񖢒���
	mes "[�W���m�[�N]";
	mes "���ς�肠��܂��񂩁H";
	mes "��낵����΍�����";
	mes "���Z�������ƈڏZ�̖������̗l�q��";
	mes "�������Ă��Ă��炦�܂��񂩁H";
	next;
	if(select("��`���܂��傤","���͎��Ԃ�����") == 2) {
		mes "[�W���m�[�N]";
		mes "����͎c�O�ł��B";
		mes "�ƂĂ��߂����c�c�B";
		close;
	}
	mes "[�W���m�[�N]";
	mes "�ł́A�����炪�w�肷��";
	mes "���Z���ƈڏZ�̖���3�l������";
	mes "���b�𕷂��Ă��Ă��������B";
	mes "��낵�����肢�������܂��B";
	delquest 3504;
	setquest 3503;
	setquest 3495;
	setquest 3496;
	setquest 3497;
	setquest 3498;
	setquest 3499;
	setquest 3501;
	close;
OnInit:
	cloakonnpc;
	end;
}
rachel.gat,69,234,3	script	�W�����h#atm1	921,{/* 16099 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
		}
	}
	mes "[�W�����h]";
	mes "����ɂ��́B";
	mes "�ŋ߁A�X�̕��͋C���������C�����܂��B";
	mes "�܂��A�����Ƃ͂����܂�";
	mes "�֌W�Ȃ��ł����ǂˁB";
	close;
}
rachel.gat,100,72,3	script	���q#atm2	919,{/* 16100 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
			mes "[���q]";
			mes "���������邢�C������";
			mes "�d���Ɍ������܂��B";
			close;
		}
		mes "[���q]";
		mes "����ɂ��́A�����C�ł����B";
		mes "�悤�₭�W�[�i�l����K�؂ȋ�����";
		mes "���炦��悤�ɂȂ�܂����B";
		next;
		mes "[���q]";
		mes "������}�����l��_��������";
		mes "�s���ȏ󋵂����P���悤��";
		mes "�����Ă����������������ł��B";
		mes "�{���Ɋ��ӂ��Ă��܂��B";
		next;
		mes "[���q]";
		mes "����A���̌��Z�������̏�����";
		mes "���P�����Ă������Ƃł��傤�B";
		mes "�Y�ݎ������������̂�";
		mes "������薰�ꂻ���ł��B";
		next;
		compquest 3494;
		mes "[���q]";
		mes "����ł́A";
		mes "�������ǂ����ɂȂ�܂��悤�ɁB";
		mes "�@";
		mes "^0000FF�]���q����b�𕷂����B";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[���q]";
	mes "����ɂ��́A���q�ł��B";
	mes "�悤�₭�V�����d���������܂�����";
	mes "�V�����Y�݂��o�ė��܂����c�c�B";
	close;
}
rachel.gat,258,207,3	script	�W���W��#atm3	918,{/* 16101 */
	if(checkquest(3495)) {
		if(checkquest(3495)&8) {
			mes "[�W���W��]";
			mes "����܂ł炢�������߂����Ă�������";
			mes "���͏����Ɋ��҂��邱�Ƃ�";
			mes "�ł���悤�ɂȂ�����B";
			close;
		}
		mes "[�W���W��]";
		mes "�����C�H�@�l�̓W���W���Ɛ\���܂��B";
		next;
		mes "[�W���W��]";
		mes "�ȑO�ɁA�����𔄋p���邩�ǂ���";
		mes "�Y��ł�����Č����Ă�����";
		mes "���p�����ɍς݂�������B";
		next;
		mes "[�W���W��]";
		mes "�_�a�̐_��������";
		mes "���Z���ɑ΂��āA�ڏZ�̖��Ɠ�����";
		mes "������F�߂Ă��ꂽ�񂾁B";
		next;
		mes "[�W���W��]";
		mes "�����Ȃ�΁A�l�̎��Ƃ����肷�邵";
		mes "�����𔄂炸�ɍςނ���ˁB";
		mes "�ǂ��m�点��`�����āA�l���������B";
		next;
		compquest 3495;
		mes "[�W���W��]";
		mes "�ł͂ł́A�悢������B";
		mes "�@";
		mes "^0000FF�]�W���W������b�𕷂����B";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[�W���W��]";
	mes "�����C�H�@�l�̓W���W���Ɛ\���܂��B";
	next;
	mes "[�W���W��]";
	mes "�l�̓��w�����ɕ����̌�����";
	mes "���L���Ă܂���";
	mes "�ێ��Ǘ�������󋵂ł��B";
	mes "�����𔄋p���邵�����@���Ȃ��̂����H";
	close;
}
rachel.gat,159,173,3	script	�X�N�A�C��#atm4	870,{/* 16102 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
			mes "[�X�N�A�C��]";
			mes "��������肪���̂�������";
			mes "�n�܂邼���I";
			close;
		}
		mes "[�X�N�A�C��]";
		mes "���̊X�ň�ԕn�R������";
		mes "�X�N�A�C���Ɛ\���܂��B";
		mes "���肪�������Ƃ�";
		mes "���d�������炦����ł��B";
		next;
		mes "[�X�N�A�C��]";
		mes "����ő��l�ɗ����Ă΂���̐����Ƃ�";
		mes "������΂ł��B";
		next;
		mes "[�X�N�A�C��]";
		mes "���܂ő����̐l�̂����b�ɂȂ����̂�";
		mes "���ꂩ��́A�������l��������悤��";
		mes "�l�ɂȂ낤�Ǝv���Ă܂��B";
		next;
		compquest 3496;
		mes "[�X�N�A�C��]";
		mes "�ł́A���C�����āB";
		mes "�@";
		mes "^0000FF�]�X�N�A�C������b�𕷂����B";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[�X�N�A�C��]";
	mes "����ɂ��́B";
	mes "���̊X�ň�ԕn�R��";
	mes "�X�N�A�C���Ɛ\���܂��B";
	mes "��������������ɉ߂��������ł��B";
	close;
}
rachel.gat,190,30,5	script	�Z�i�h#atm5	746,{/* 16103 */
	if(checkquest(3497)) {
		if(checkquest(3497)&8) {
			mes "[�Z�i�h]";
			mes "�����ŕ��������Ƃ�";
			mes "���̂��Ƃ������̂�";
			mes "�����v���o���܂���B";
			close;
		}
		mes "[�Z�i�h]";
		mes "����ɂ��́B";
		mes "�����Ƃ̃Z�i�h�ƌ����܂��B";
		next;
		mes "[�Z�i�h]";
		mes "���Ɏ�����\������ł����̂�";
		mes "�ڏZ�̖��ł�����";
		mes "�����g�́A���Z���̑�\�Ƃ���";
		mes "�������Ȃ��I�@�Ƃ����v����";
		mes "�����Ă��܂���ł����B";
		next;
		mes "[�Z�i�h]";
		mes "��������A���R�ɋ��G�Ɠ�����";
		mes "�����������ꂽ���Ƃ̕���";
		mes "���ɂ͏d�v�ł�������ˁB";
		next;
		mes "[�Z�i�h]";
		mes "�����̌��ʂł����H";
		mes "�������A���̏����ł��B";
		mes "���͂��ЁA�M���Ƃ��킢�������̂ł��B";
		next;
		compquest 3497;
		mes "[�Z�i�h]";
		mes "����ł́A�܂�������܂��傤�B";
		mes "�@";
		mes "^0000FF�]�Z�i�h����b�𕷂����B";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[�Z�i�h]";
	mes "����ɂ��́B";
	mes "�����Ƃ̃Z�i�h�ƌ����܂��B";
	mes "�ӂށc�c�����Ƃ���";
	mes "���Ȃ������Ȃ�̎g����ł��ˁB";
	mes "�����荇�킹���������̂ł��B";
	close;
}
rachel.gat,210,52,5	script	�W�F�C�p�[#atm6	46,{/* 16104 */
	if(checkquest(3498)) {
		if(checkquest(3498)&8) {
			mes "[�W�F�C�p�[]";
			mes "�܂��A���̏��l������";
			mes "���������₷���Ȃ���Ă��Ƃ�";
			mes "�������ꏏ���Ă��Ƃ�����ȁB";
			mes "������x�A�撣���Ă݂邳�I";
			close;
		}
		mes "[�W�F�C�p�[]";
		mes "���C���ˁB";
		mes "���l�g��������Ă���W�F�C�p�[���B";
		mes "����A�X�ŋN���������������̂�������";
		mes "���낢��v�����Ƃ���������B";
		next;
		mes "[�W�F�C�p�[]";
		mes "�����̏������猴�Z���̏��l��";
		mes "�ǂ��o������";
		mes "���Z������������������";
		mes "�ق��Ă�����c�c";
		mes "���ꂪ�ł��Ȃ��Ȃ������ˁB";
		next;
		mes "[�W�F�C�p�[]";
		mes "�{����������";
		mes "�[���ł��Ȃ����Ƃ������񂾂�";
		mes "�����ڂŌ���΁A���������W����";
		mes "�@��𓾂��Ǝv����";
		mes "���������b�ł��Ȃ���ȁB";
		next;
		compquest 3498;
		mes "[�W�F�C�p�[]";
		mes "�ł́A�܂��ˁB";
		mes "�@";
		mes "^0000FF�]�W�F�C�p�[����b�𕷂����B";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[�W�F�C�p�[]";
	mes "���C���ˁB";
	mes "���l�g��������Ă���W�F�C�p�[���B";
	mes "�悻�ł͐^���̂ł��Ȃ�";
	mes "���i���̕i���������񈵂��Ă��B";
	close;
}
rachel.gat,40,73,7	script	�V���A��#atm7	67,{/* 16105 */
	if(checkquest(3499)) {
		if(checkquest(3499)&8) {
			mes "[�V���A��]";
			mes "���ʓI�ɁA������Ƃ����";
			mes "�������悤�ŗǂ������ł��B";
			close;
		}
		mes "[�V���A��]";
		mes "�W�F�C�p�[����̔鏑�����Ă���";
		mes "�V���A���Ɛ\���܂��B";
		next;
		mes "[�V���A��]";
		mes "�W�F�C�p�[���񂪐_�������̖@�߂�";
		mes "�󂯓��ꂽ�͈̂ӊO�ł����B";
		mes "�Ă�����A�@�߂𖳎����邩��";
		mes "�v���Ă��܂�������B";
		next;
		mes "[�V���A��]";
		mes "������񍇗��I�Ȑl�ł�����";
		mes "�l�������ɂ��ꂪ�����ł���Ƃ�";
		mes "���f�Ȃ̂ł��傤���B";
		next;
		mes "[�V���A��]";
		mes "���Z�������ւ̂����������₵�܂�����";
		mes "�������Ō��Z�������Ƃ̖��C��";
		mes "���Ȃ��Ȃ�܂����B";
		mes "�{���ɂ悩�����ł��B";
		next;
		compquest 3499;
		mes "[�V���A��]";
		mes "�ł́A�����Ȉ���ɂȂ�܂��悤�ɁB";
		mes "�@";
		mes "^0000FF�]�V���A������b�𕷂���";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[�V���A��]";
	mes "����ɂ��́B";
	mes "�W�F�C�p�[����̔鏑�����Ă���";
	mes "�V���A���Ɛ\���܂��B";
	mes "�ŋ߂͊X�����������ł��ˁB";
	mes "�ǂ������C�������������B";
	close;
}
rachel.gat,88,151,3	script	�C�V��#atm8	68,{/* 16106 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
		}
	}
	mes "[�C�V��]";
	mes "����ɂ��́A�C�V���Ɛ\���܂��B";
	mes "�ߍ��A���s�S�̂����������ł��ˁB";
	mes "�ǂ����C��t���Ă��������B";
	close;
}
rachel.gat,240,182,5	script	�W�[�i#atm9	69,{/* 16107 */
	if(checkquest(3501)) {
		if(checkquest(3501)&8) {
			mes "[�W�[�i]";
			mes "���͏����΂���";
			mes "���ȓI�������̂ł��傤���H";
			close;
		}
		mes "[�W�[�i]";
		mes "����ɂ��́B";
		mes "�ڏZ�̖��̃W�[�i�Ɛ\���܂��B";
		next;
		mes "[�W�[�i]";
		mes "���Z�������Ƃ̊֌W�̒���";
		mes "�������ނ��Ƃ����������̂ł���";
		mes "�悤�₭�O�����ɍl������悤��";
		mes "�Ȃ��Ă��܂����B";
		next;
		mes "[�W�[�i]";
		mes "�ނ�̋]���̏�Ő��藧��";
		mes "���Ƃ��N�����Ă�";
		mes "�������͂��Ȃ��������Ƃł��傤�B";
		mes "����̌��ŁA���낢���";
		mes "�C�t������܂����B";
		next;
		compquest 3501;
		mes "[�W�[�i]";
		mes "�ł́A�ǂ�������B";
		mes "�@";
		mes "^0000FF�]�W�[�i����b�𕷂����B";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[�W�[�i]";
	mes "����ɂ��́B";
	mes "�ڏZ�̖��̃W�[�i�Ɛ\���܂��B";
	close;
}
rachel.gat,212,52,3	script	�n��#atm10	74,{/* 16108 */
	if(checkquest(3496)) {
		if(checkquest(3496)&8) {
			mes "[�n��]";
			mes "�������ǂ������";
			mes "���߂������������܂��B";
			close;
		}
		mes "[�n��]";
		mes "����ɂ��́A���́u�n���v�B";
		mes "�Ӓn������̃W�F�C�p�[�Ǝ���";
		mes "�v�w�Ȃ�ł���B";
		next;
		mes "[�n��]";
		mes "���Z�������Ƃ̋��^����";
		mes "�܂荇�������邱�Ƃ��ł���";
		mes "�ق��Ƃ��Ă��܂��B";
		mes "�W�F�C�p�[�́A���^�𑝂₷�C��";
		mes "�Ȃ������݂����ł����ǁB";
		next;
		mes "[�n��]";
		mes "���݂��ɃM�N�V���N�����܂�";
		mes "�d���Ȃ�Ăł��Ȃ��ł�����ˁB";
		mes "����͉�����܂���";
		mes "���͔[�����Ă��܂���B";
		next;
		compquest 3502;
		mes "[�n��]";
		mes "�ł́A���C�����Ă��A�艺�����B";
		mes "�@";
		mes "^0000FF�]�n������b�𕷂����B";
		for(set '@i,3493; '@i < 3502; set '@i,'@i+1) {
			if(checkquest('@i) & 8)
				set '@cnt,'@cnt+1;
		}
		if('@cnt >= 6) {
			mes "�@6�l�S������b�𕷂����Ƃ��ł����B";
			mes "�@�W���m�[�N�ɕ񍐂��悤�]^000000";
			setquest 3505;
		}
		else
			mes "�@���̉�b�����T���Ă݂悤�]^000000";
		close;
	}
	mes "[�n��]";
	mes "����ɂ��́A���́u�n���v�B";
	mes "�Ӓn������̃W�F�C�p�[�Ǝ���";
	mes "�v�w�Ȃ�ł���B";
	close;
}
ra_in01.gat,388,59,0	script	#ep18w01	139,14,14,{/* 16109 */
	if(checkquest(8718)) {
		cloakoffnpc "�]�ƈ�#ep1800";
		cloakonnpc "�x�z�l#ep18";
	}
	end;
}
ra_in01.gat,388,59,5	script	�]�ƈ�#ep1800	930,{/* 16110 (cloaking)*/
	if(checkquest(8718)) {
		mes "[�]�ƈ�]";
		mes "��������Ⴂ�܁c�c�I";
		mes "�`���҂��܁A�ΎR�D�̓��������܂��ˁB";
		mes "�g�[���ΎR�c�c����A�Ⴄ�B";
		next;
		mes "^0000FF�]�]�ƈ��͎�����x�����Ă���";
		mes "�@�Ⴂ���Řb���o�����]^000000";
		next;
		mes "[�]�ƈ�]";
		mes "���������āA�D�F�T�̑��֍s������";
		mes "�m���Ă�������̂ł́H";
		next;
		if(select("�m���Ă܂�","�m��Ȃ��Ȃ�") == 2) {
			mes "[�]�ƈ�]";
			mes "�c�c�Ƃڂ��Ă����ʂł���B";
			next;
		}
		mes "[�]�ƈ�]";
		mes "�c�c���������Ɉē�����";
		mes "���炦�܂��񂩁H";
		mes "�{���Ɂc�c";
		mes "�{���ɂ����֍s��������ł��I";
		next;
		menu "�M���͒N�Ȃ�ł����H",-;
		mes "[�z����]";
		mes "���A�����܂���B";
		mes "�����Ȃ�Ńr�b�N�����ꂽ�ł��傤�B";
		mes "���́u�z�����v�Ɛ\���܂��B";
		mes "�c�c���Z���ł��B";
		next;
		mes "[�z����]";
		mes "���̉Ƒ���F�l������";
		mes "�F�A���w����������";
		mes "�B�ꑺ�ɍs���܂����B";
		mes "�ł��A���������w���Ɏc������ł��B";
		mes "�|��������ł��A�X�̊O�ɏo��̂��B";
		next;
		mes "[�z����]";
		mes "�������ŁA���͂ЂƂ�ڂ����ł��B";
		mes "���w���ł̌��Z���ɑ΂��鈵����";
		mes "���P�̒����������܂���";
		mes "���������Ă��N�ɂ����k�ł��܂���B";
		mes "�����A�c���C�ł��B";
		next;
		mes "[�z����]";
		mes "������A������ł�����";
		mes "���w�����o�āA�݂�Ȃƈꏏ��";
		mes "��炵������ł��B";
		next;
		mes "[�z����]";
		mes "�댯�ȓ��ł���̂����m���Ă���܂���";
		mes "�`���҂��܂Ɉē����Ă��炦��";
		mes "���邢�́c�c�B";
		next;
		menu "����`�����܂��傤",-;
		mes "[�z����]";
		mes "���肪�Ƃ��������܂��I";
		next;
		cloakoffnpc "�x�z�l#ep18";
		unittalk getnpcid(0,"�x�z�l#ep18"),"�x�z�l  :  �肪�󂢂Ă�X�^�b�t�́A������Ɨ��Ă���I";
		mes "[�z����]";
		mes "���݂܂���B";
		mes "���͎d�����Ȃ̂�";
		mes "�����s���Ȃ��ƁB";
		next;
		cloakonnpc "�x�z�l#ep18";
		mes "[�z����]";
		mes "���w���̐���̊O�ł�����܂��傤�B";
		mes "��낵�����肢���܂��ˁB";
		delquest 8718;
		setquest 8698;
		close2;
		cloakonnpc "�]�ƈ�#ep1800";
		end;
	}
	if(checkquest(8698)) {
		// ���m�F
	}
	end;
OnQuestInfo:
	if(checkquest(8718))
		showevent 0, 3, "�]�ƈ�#ep1800";
	else
		showevent 9999,0,"�]�ƈ�#ep1800";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_in01.gat,388,63,5	script	�]�ƈ�#ep1801	85,{/* 16111 */
	mes "[�]�ƈ�]";
	mes "�͂��`�B";
	mes "�l������Ȃɓ������Ăǂ����񂾂�H";
	next;
	mes "[�]�ƈ�]";
	mes "�����ƂƁA��������Ⴂ�܂��I";
	mes "�t���C���l�̏j����";
	mes "���ɂ���񂱂Ƃ��`�I";
	close;
}
ra_in01.gat,381,63,5	script	�x�z�l#ep18	928,{/* 16112 (cloaking)*/
	// ���m�F
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_fild11.gat,350,236,0	script	#ep18w02	139,14,14,{/* 16113 */
	if(checkquest(8698))
		cloakoffnpc "�z����#ep1810";
	end;
}
ra_fild11.gat,350,236,3	script	�z����#ep1810	930,{/* 16114 (cloaking)*/
	if(checkquest(8698)) {
		mes "[�z����]";
		mes "�c�c�����A�`���҂��܁B";
		mes "���̓��w������";
		mes "���ꂽ���Ƃ��Ȃ��āc�c";
		mes "�����A�����ƂȂ�ƐS�ׂ��ł��B";
		next;
		mes "[�z����]";
		mes "�ł��A���w���̂ǂ��ɂ��Ă�";
		mes "���炮���Ƃ��ł��Ȃ��̂Ȃ�";
		mes "��͂苎��ׂ��Ȃ̂ł��傤�B";
		next;
		mes "[�z����]";
		mes "�c�c�b�������Ȃ�܂����ˁB";
		mes "��������A�ǂ̕����Ɍ������̂ł����H";
		mes "�`���җl�̌��������";
		mes "�����ړ����܂��B";
		delquest 8698;
		setquest 8699;
		cloakonnpc "�z����#ep1810";
		next;
		mes "^0000FF�]�D�F�T�̑��֌��������]^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8698))
		showevent 0, 3, "�z����#ep1810";
	else
		showevent 9999,0,"�z����#ep1810";
	end;
OnInit:
	cloakonnpc;
	end;
}
ra_fild10.gat,375,293,0	script	#horim02	139,14,14,{/* 16115 */
	if(checkquest(8699))
		cloakoffnpc "�z����#ep1811";
	end;
}
ra_fild10.gat,375,293,5	script	�z����#ep1811	930,{/* 16116 (cloaking)*/
	if(checkquest(8699)) {
		mes "[�z����]";
		mes "�U������Ă݂�΃��w�����c";
		mes "���̏�ǂ��ƂĂ������Ɍ����܂����B";
		mes "�c�c�c�c";
		mes "�܂����̂�̔��������Ă��Ȃ��ł����H";
		next;
		mes "[�z����]";
		mes "�Ƒ������͌��C�ł��傤���H";
		mes "�F�B�݂�ȁA���C�ł��傤���H";
		mes "���͖����ɒH�����ł��傤���H";
		mes "���낢��l���Ă��܂��܂��B";
		delquest 8699;
		setquest 8700;
		cloakonnpc "�z����#ep1811";
		next;
		mes "^0000FF�]�D�F�T�̑��֌��������]^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8699))
		showevent 0, 3, "�z����#ep1811";
	else
		showevent 9999,0,"�z����#ep1811";
	end;
OnInit:
	cloakonnpc;
	end;
}
oz_dun01.gat,285,170,0	script	#ep18w04	139,14,14,{/* 16117 */
	if(checkquest(8700))
		cloakoffnpc "�z����#ep1812";
	end;
}
oz_dun01.gat,285,170,5	script	�z����#ep1812	930,{/* 16118 (cloaking)*/
	if(checkquest(8700)) {
		mes "[�z����]";
		mes "����Ȍi�F�́A���߂Č��܂��B";
		mes "���̓��́c�c�ǂ��ł��ˁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����ȓ����H";
		next;
		mes "[�z����]";
		mes "�`���҂��܂͌�����Ă����邩��";
		mes "����܂���";
		mes "���ɂƂ��Ă͂Ȃ񂾂�";
		mes "���������C�����ɂȂ�̂ł��B";
		next;
		mes "[�z����]";
		mes "�c�c���ł̕�炵��";
		mes "�y�ł͂Ȃ��ƕ����Ă��܂���";
		mes "���v�ł��B";
		mes "�͎d���ɂ͎��M������܂��B";
		mes "�����A�s���܂��傤�B";
		delquest 8700;
		setquest 8701;
		cloakonnpc "�z����#ep1812";
		next;
		mes "^0000FF�]�D�F�T�̑��֌��������]^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8700))
		showevent 0, 3, "�z����#ep1812";
	else
		showevent 9999,0,"�z����#ep1812";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,272,342,0	script	#ep18w04	139,{/* 16119 */
	if(checkquest(8701))
		cloakoffnpc "�z����#ep1813";
	end;
}
gw_fild01.gat,272,342,5	script	�z����#ep1813	930,{/* 16120 (cloaking)*/
	if(checkquest(8701)) {
		mes "[�z����]";
		mes "�c�c�������ς��܂����ˁB";
		mes "�g�[���ΎR�̉ΎR�D�Ƃ͈Ⴄ�����B";
		next;
		mes "[�z����]";
		mes "���̓��E��";
		mes "���̓�����Z���Ă��܂����B";
		mes "������A�`���҂��܂̂��Ƃ�";
		mes "�C�t������ł��B";
		next;
		mes "[�z����]";
		mes "�����A���̓���������悤��";
		mes "�Ȃ�̂ł��傤���H";
		next;
		mes "[�z����]";
		mes "�c�c�s���܂��傤�B";
		delquest 8701;
		setquest 8702;
		cloakonnpc "�z����#ep1813";
		next;
		mes "^0000FF�]�D�F�T�̑��֌��������]^000000";
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(8701))
		showevent 0, 3, "�z����#ep1813";
	else
		showevent 9999,0,"�z����#ep1813";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,36,99,0	script	#horimF	139,14,14,{/* 16121 */
	if(checkquest(8702))
		cloakoffnpc "�z����#ep1814";
	end;
}
gw_fild01.gat,36,99,5	script	�z����#ep1814	930,{/* 16122 (cloaking)*/
	if(checkquest(8702)) {
		mes "[�z����]";
		mes "������Ƌx��ōs���܂��傤�B";
		mes "���傤�Ǎ��ꂻ����";
		mes "�ۑ�������܂����B";
		next;
		menu "�܂������Ă܂����H",-;
		mes "[�z����]";
		mes "�����ł��ˁB";
		mes "�����A���͂���Ȃɂ�";
		mes "���w�����痣��Ă��܂����̂ɁB";
		next;
		mes "[�z����]";
		mes "�c�c�B";
		next;
		mes "[�z����]";
		mes "�`���҂��܂ɂ�";
		mes "�A��ꏊ�͂���܂����H";
		mes "���w���ɂ�������̎��ɂ�";
		mes "����܂���ł����B";
		next;
		mes "[�z����]";
		mes "�Ƃ������Ƃ�";
		mes "���������b�ł͂���܂���B";
		mes "�Ƒ��ƈꏏ�ɐH��������";
		mes "�΂������āA���₷�݂ƈ��A����";
		mes "����ɂ��c�c";
		mes "����ȏꏊ�ł��B";
		next;
		mes "[�z����]";
		mes "�c�c�s���܂��傤���B";
		mes "����ŁA���ǂǂ��܂ōs����";
		mes "�ǂ���ł����H";
		mes "���낻�닳���Ă���Ă��c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����������ł��B";
		next;
		mes "[�z����]";
		mes "�c�c���H";
		next;
		mes "[���]";
		mes "�ʂ��ėǂ���B";
		mes "�`���҂��񂪘A��ė����Ȃ�";
		mes "���v���낤����";
		mes "�X�A�h�������Ă�����ˁB";
		close2;
		delquest 8702;
		setquest 8703;
		warp "wolfvill.gat", 270, 26;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(8702))
		showevent 0, 3, "�z����#ep1814";
	else
		showevent 9999,0,"�z����#ep1814";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,266,26,0	script	#horimG	139,14,14,{/* 16123 */
	if(checkquest(8703))
		cloakoffnpc "�z����#ep1815";
	end;
}
wolfvill.gat,266,26,5	script	�z����#ep1815	930,{/* 16124 (cloaking)*/
	if(checkquest(8703)) {
		mes "["+strcharinfo(0)+"]";
		mes "�������܂����B";
		mes "�������D�F�T�̑��ł��B";
		next;
		mes "[�z����]";
		mes "�c�c�c�c�������B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���]���܂����H";
		next;
		mes "[�z����]";
		mes "�������B";
		mes "�c�c�Ƒ���T���Ă݂܂��B";
		mes "����ɗF�l������";
		mes "�����ɂ���͂��ł�����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����Ƃ݂��";
		mes "���}���Ă���܂���B";
		next;
		mes "[�z����]";
		mes "���c�c";
		mes "�ӂӂ��A���肪�Ƃ��c�c";
		mes "�{���ɁA���肪�Ƃ��������܂��I";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		delquest 8703;
		setquest 202325;
		getitem 1000405,10;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		getexp 1350000000,0,0;
		getexp 0,1200000000,0;
		setquest 130123;
		compquest 130123;
		mes "[�z����]";
		mes "�`���҂��܂̗��H��";
		mes "�j��������񂱂Ƃ��c�c�B";
		close2;
		cloakonnpc "�z����#ep1815";
		end;
	}
	if(checkquest(202325)) {
		//������
	}
	end;
OnQuestInfo:
	if(checkquest(8703))
		showevent 0, 3, "�z����#ep1815";
	else
		showevent 9999,0,"�z����#ep1815";
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,182,82,5	script	�A���x��#ep18	931,{/* 16125 */
	if(EP18_1QUE < 36) {
		mes "[�A���x��]";
		mes "�c�c�c�c�B";
		next;
		mes "^ff0000�]�N�G�X�g�u��x��ȈڏZ�v��^000000";
		mes "^ff0000�@���L�̏����𖞂����Ɛi�s�\�ł��B^000000";
		mes "^ff0000�@�E4���E�A�g��4���E^000000";
		mes "^ff0000�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(202325)) {
		mes "[�A���x��]";
		mes "�����ɉ�������āH";
		mes "�����A�������ȁB";
		mes "�ʂ�̍ۂɌ����Ȃ��������Ƃ�";
		mes "�S����������B";
		mes "�������ł�����₪�S��������񂾁B";
		next;
		mes "[�A���x��]";
		mes "�D�F�̐X���P���Č����邺�c�c";
		mes "�͂��A����Ȗ�Ȃ��̂ɂȁB";
		mes "�`���ҁc�c���񂽂̂��A���B";
		mes "���肪�Ƃ���B";
		close;
	}
	if(checkquest(8718)) {
		mes "[�A���x��]";
		mes "���ɂ��������񍐂��Ȃ��Ă����B";
		mes "�����z���������C�ɂ���Ă邩";
		mes "�m�F���Ă����΂����B";
		close;
	}
	if(checkquest(8698) || checkquest(8699) || checkquest(8700) || checkquest(8701) || checkquest(8702) || checkquest(8703)){
		mes "[�A���x��]";
		mes "�z�����������ɗ�����āH";
		mes "���A�������c�c";
		mes "�悩�����A�悩������c�c�B";
		close;
	}
	mes "[�A���x��]";
	mes "�`���҂���B";
	mes "���w���ɖ߂�񂾂�����";
	mes "�ЂƂ��̗��݂𕷂��Ă���Ȃ����H";
	next;
	mes "[�A���x��]";
	mes "���w���̃z�e���œ����Ă���";
	mes "�u�z�����v���ă��c�̗l�q��";
	mes "���ė��ė~�����񂾁B";
	next;
	mes "[�A���x��]";
	mes "�z�����́A���̗c����Ȃ񂾁B";
	mes "���݂����w���ɏZ��ł��񂾂�";
	mes "���̉Ƒ��ƃz�����̉Ƒ���";
	mes "�����ɗ��鎞��";
	mes "�A�C�c���������w���Ɏc�����񂾁B";
	next;
	mes "[�A���x��]";
	mes "���w���͑�s�s����";
	mes "�A�C�c�͂ЂƂ�ڂ�����������Ȃ��B";
	mes "�����v���ƁA�C�ɂȂ��ĂȁB";
	next;
	if(select("�����ł���","���͎��Ԃ��Ȃ�") == 2) {
		mes "[�A���x��]";
		mes "�c�c�������B";
		mes "����A�������߂Ĉ��������ȁB";
		mes "�C�ɂ��Ȃ��ł���B";
		close;
	}
	mes "[�A���x��]";
	mes "���ɒ���B";
	mes "�����z���������C�ɂ���Ă邩";
	mes "�m�F���Ă����΂����B";
	mes "���ɂ��񍐂��Ȃ��Ă�������ȁB";
	delquest 130103;
	setquest 8718;
	close;
OnQuestInfo:
	if(checkquest(130103))
		showevent 0, 3, "�A���x��#ep18";
	else
		showevent 9999,0,"�A���x��#ep18";
	end;
}

wolfvill.gat,117,119,5	script	�X�J�j�A#wms01	10398,5,5,{/* 16126 */
	if(EP18_1QUE < 36) {
		mes "[�X�J�j�A]";
		mes "���̑��̐l�ł͂Ȃ��ˁB";
		mes "�����͊댯������A���������ǂ���H";
		next;
		mes "^ff0000�]�N�G�X�g�u���̐��Ɉ����b�͂��Ȃ��v��^000000";
		mes "^ff0000�@���L�̏����𖞂����Ɛi�s�\�ł��B^000000";
		mes "^ff0000�@�E4���E�A�g��4���E^000000";
		mes "^ff0000�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(17510) || checkquest(17511)) {
		mes "[�X�J�j�A]";
		mes "�A�C�V���̂Ƃ����";
		mes "�s���񂶂�Ȃ������́H";
		close;
	}
	if(checkquest(17512)) {
		mes "[�X�J�j�A]";
		mes "���������A�����̎U���͂����܂ł��B";
		next;
		mes "[��������]";
		mes "���G�F�F�F�F�[�I";
		next;
		mes "[�X�J�j�A]";
		mes "���̊O�ɂ͍s���Ȃ��񂾂�B";
		mes "����Ȋ댯�ȏꏊ��";
		mes "�Ƃ�ōs������Ȃ�Ăł��Ȃ��B";
		next;
		setnpcdisplay "���G���G#wms01",21324;
		cloakoffnpc "�A�C�V��#wms01";
		cloakoffnpc "���G���G#wms01";
		cloakoffnpc "�}����#wms01";
		mes "[�A�C�V��]";
		mes "�X�J�j�A�I";
		next;
		mes "[�X�J�j�A]";
		mes "�A�C�V���H";
		mes "���̗p���H";
		mes "���̘T�͌Q��ɕԂ����̂���H";
		next;
		unittalk getnpcid(0,"���G���G#wms01"),"���I�I";
		mes "[�X�J�j�A]";
		mes "����������c�c";
		mes "���A�T��r�̑O�ɘA��Ă���Ȃ��";
		mes "���C�̍�������Ȃ��I";
		mes "�`���ҁI�@���O�A���؂����̂��I";
		next;
		mes "[�A�C�V��]";
		mes "���͂͂́A�������I";
		mes "���O�̂��̐�]����炪";
		mes "�����������̂��I";
		mes "�`���҂́A���łɎ��̖������I";
		next;
		mes "[�X�J�j�A]";
		mes "�X�̓��A�̂悤�ɗ₽���z�߁I";
		next;
		mes "[�A�C�V��]";
		mes "�⌌�Ȃ̂͂������ł���I";
		mes "���̐e��S���������������G���G��";
		mes "���R�ɕԂ���킯�Ȃ�����Ȃ��I";
		next;
		setnpcdisplay "���G���G#wms01",21324;
		mes "[�X�J�j�A]";
		mes "�e���������c�c�H";
		mes "���A�����Ȃ́H";
		next;
		mes "[�A�C�V��]";
		mes "100��͐�����������Ȃ��I";
		mes "�����̓s���̂������Ƃ�������";
		mes "�o���ĂȂ��񂾂���I";
		next;
		mes "[�X�J�j�A]";
		mes "�ł��A���̘T���傫���Ȃ��";
		mes "�r�������c�c�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�������K�v�݂����ł��ˁB";
		next;
		mes "^0000FF�]�}�����͘T���P������";
		mes "�@�r�����ƈꏏ�Ɉ�Ă邱�Ƃ�";
		mes "�@�r�������P�����Ƃ͂Ȃ��Ȃ�";
		mes "�@�ނ������Ă���邾�낤��";
		mes "�@�X�J�j�A�ɐ��������]^000000";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�A�C�V��]";
		mes "�؋��������Ă�����B";
		mes "���G���G�I�@������I�@����I";
		next;
		emotion 12,"�A�C�V��#wms01";
		unittalk getnpcid(0,"���G���G#wms01"),"���I�I";
		emotion 11,"���G���G#wms01";
		unittalk getnpcid(0,"�A�C�V��#wms01"),"�悭�ł��܂����I�@�����̃��G���G�͒������I";
		mes "[�X�J�j�A]";
		mes "�c�c�{�����B";
		mes "�������A�N���ǂ�����ČP������̂��H";
		mes "�A�C�V���́A����ȍ��C�͂Ȃ�����H";
		next;
		mes "[�A�C�V��]";
		mes "�͂��H";
		mes "���O�A��ŋ��������c�c�H";
		next;
		mes "[�A�C�V��]";
		mes "�c�c�����ق�I";
		mes "�X�J�j�A�̓���������";
		mes "�U�����Ă����l��T���Ă���ˁH";
		mes "�댯�ȑ��̊O�܂ŎU�����Ă����l���B";
		next;
		mes "[�A�C�V��]";
		mes "���̖`���҂Ȃ�";
		mes "���G���G�ƃ���������A���";
		mes "���̊O�܂ł��U�����Ă�����I";
		mes "�ǂ���I";
		next;
		mes "[�X�J�j�A]";
		mes "�}�W����I�@��������I";
		mes "�r�����̑�s�Ɩ����Ă��Ƃ��I";
		mes "���Ђ���Ă����I";
		next;
		mes "[�A�C�V��]";
		mes "�߂�����H�����ȁc�c";
		mes "�Ƃɂ����A���G���G�͂��ꂩ��";
		mes "�r�����ԘT�Ƃ��đ��ɒu������";
		mes "�݂�Ȃɐ������Ă��Ȃ�����B";
		next;
		mes "[�A�C�V��]";
		mes "�}���������ė��Ă�ˁB";
		mes "�������͒B�҂ł���H";
		mes "��l������������Ă����Ȃ��ƁI";
		next;
		unittalk getnpcid(0,"���G���G#wms01"),"���I";
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�͂͂́c�c";
		mes "�ł́A���̓A�C�V���ƍs���܂�����";
		mes "�`���җl�͗r������s�Ƃ�";
		mes "���肢���܂��ˁB";
		next;
		cutin "ep18_maram_01.png", 255;
		cloakonnpc "�A�C�V��#wms01";
		cloakonnpc "���G���G#wms01";
		cloakonnpc "�}����#wms01";
		mes "[�X�J�j�A]";
		mes "���ꂩ���낵���ȁI";
		mes "���҂��Ă邺�I";
		delquest 17512;
		setquest 17513;
		close;
	}
	if(checkquest(17513)) {
		mes "[�X�J�j�A]";
		mes "�`���җl�͗r������s�Ƃ𗊂ށB";
		mes "�D�F�T�̐X�Ń�������������";
		mes "�U���̃T�|�[�g�����Ă���Ă���B";
		next;
		mes "[�X�J�j�A]";
		mes "�܂��́A�D�F�T�̐X�ɂ���A";
		mes "���������̂��C�ɓ���́u���v��";
		mes "����Ƃ���Ɍ������Ă���B";
		next;
		mes "[�X�J�j�A]";
		mes "���̌�́A����������";
		mes "����H�ׂ�̂��ז����Ă���";
		mes "�u�A�b�V�������v���u15�v��";
		mes "�|���Ăق����B";
		mes "���Ⴀ�A��낵���I";
		close;
	}
	if(checkquest(17514)) {//������
	}
	if(checkquest(17515)) {
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		delquest 17515;
		setquest 17516;
		getitem 1000405,3;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		getexp 225000000,0,0;
		getexp 0,175000000,0;
		setquest 130130;
		compquest 130130;
		hideoffnpc "��������#wms01";
		mes "[�X�J�j�A]";
		mes "����ꂳ�܁I";
		mes "���������������������ȁI";
		mes "���񂽁A�r�����̍˔\�����B";
		close;
	}
	if(checkquest(17516)) {
		mes "[�X�J�j�A]";
		mes "�����͂����U���̕K�v�͂Ȃ���B";
		mes "�H�ׂĕ����������鎞�Ԃ��K�v����";
		mes "�܂������ɂȂ����痈�Ă����I";
		close;
	}
	mes "[�X�J�j�A]";
	mes "���������I";
	mes "���O�����낻��O�̌��t��";
	mes "�׋����Ȃ����Ⴂ���Ȃ��B";
	mes "�����z�����݁A�f���o���I";
	mes "�������I�@���O�͓V�˂��ȁI";
	unittalk getnpcid(0,"��������#wms01"),"���F�H";
	next;
	cloakoffnpc "�}����#wms01";
	cutin "ep18_maram_02.png", 2;
	mes "[�}����]";
	mes "����ɂ��́A�X�J�j�A�I";
	mes "�������������C�����H";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�X�J�j�A]";
	mes "�}�����I";
	mes "�������񂾁H";
	mes "����H�@�������͐V�������̏Z�l�H";
	next;
	mes "[�X�J�j�A]";
	mes "����A�悻�҂��ȁH";
	mes "�܂����A�X�p�C�������肵�āc�c";
	mes "�l�����̑��̂��Ƃ�";
	mes "�ڏZ�̖��Ƀo�������肶��Ȃ��H";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "���̐l�́A����Ȃ��Ƃ͂��Ȃ���B";
	mes "���ɉו��������Ă���̂�";
	mes "��`���Ă�������񂾂���B";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�X�J�j�A]";
	mes "�����A�}�����͑��ς�炸���ȁB";
	mes "�A�C�V���̓z�́A�T���E���ė��邵";
	mes "���x�́A�}�������l�Ԃ��E���ė����B";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "���߂�Ȃ����A���̎q��";
	mes "���������āc�c";
	mes "��H";
	mes "�T���E���ė������Č������H";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�X�J�j�A]";
	mes "��������A�A�C�V�����D�F�T�̎q��";
	mes "�E���ė����񂾁B";
	mes "���͎̂Ăė������Č������̂�";
	mes "�����͑S�R�������������Ȃ��񂾁B";
	next;
	mes "[�X�J�j�A]";
	mes "���͏���������";
	mes "���̂����傫���Ȃ���";
	mes "���̗r��{���P���Ɍ��܂��Ă�I";
	next;
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�ӂ��`��A����̓}�Y�C�Ȃ��B";
	mes "���̑��ň�Ă���̂�";
	mes "�r�ƌ{���炢�Ȃ��̂ł�����";
	mes "���ꂪ�P��ꂽ�肵����";
	mes "��厖���Ă��Ƃł��B";
	next;
	mes "[�}����]";
	mes "�킩������A�X�J�j�A�B";
	mes "���Ɩ`���җl�Ƃ�";
	mes "�A�C�V����������Ă݂悤�B";
	mes "�T�̎q�𑺂Ŏ������Ƃ�";
	mes "�ł��Ȃ����ĂˁB";
	next;
	cutin "ep18_maram_01.png", 255;
	mes "[�X�J�j�A]";
	mes "�A�C�V�����f���Ɍ�������";
	mes "�����Ƃ͎v���Ȃ����ǂˁB";
	mes "�܂��A�撣���Ă�ˁB";
	delquest 130110;
	setquest 17510;
	close2;
	cloakonnpc "�}����#wms01";
	end;
OnTouch:
	if(!checkquest(17510))
		unittalk "���������A�U�����������낤���ǁA���������䖝���Ă���";
	end;
OnQuestInfo:
	if(checkquest(130110) || checkquest(17512))
		showevent 0, 3, "�X�J�j�A#wms01";
	else
		showevent 9999,0,"�X�J�j�A#wms01";
	end;
}
wolfvill.gat,120,121,3	script	�}����#wms01	10376,{/* 16127 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,121,119,3	script	��������#wms01	21323,{/* 16128 */
	emotion 2,"��������#wms01";
	unittalk getnpcid(0,"��������#wms01"),"���G�F�F�F�F�[�[�I";
	end;
}
wolfvill.gat,120,117,1	script	�A�C�V��#wms01	919,{/* 16129 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,119,117,1	script	���G���G#wms01	21324,{/* 16130 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,124,116,3	script	���M���M#wms01	890,{/* 16131 */
	unittalk "�����c";
	end;
}
wolfvill.gat,121,113,1	script	�f�J�R�b�R#wms01	428,{/* 16132 */
	unittalk "�R�P�R�b�R�[";
	end;
}
wolfvill.gat,117,113,7	script	�`�r�R�b�R#wms01	10285,{/* 16133 */
	unittalk "�R�b�R�R�R�R�`";
	end;
}
wolfvill.gat,123,110,5	script	�I�L���N�T�}#wms01	10285,{/* 16134 */
	unittalk "�c�c�R�H";
	end;
}
wolfvill.gat,125,111,3	script	�J���C�C#wms01	10285,{/* 16135 */
	unittalk "�R�b�I�I�R�b�R�I�I";
	end;
}
wolfvill.gat,99,178,5	script	�A�C�V��#wms02	919,{/* 16136 */
	if(checkquest(17510)) {
		mes "[�A�C�V��]";
		mes "���G���G�́A���o����ƈꏏ�ɐ����悤�B";
		mes "�N���Q����l�������";
		mes "���o���񂪂�����";
		mes "�I�Y�̖��H�ɖ��߂Ă����邩��ˁ`�B";
		next;
		mes "[���G���G]";
		mes "�O�����[���I";
		next;
		mes "[�A�C�V��]";
		mes "�͂͂��H";
		mes "�Ƃ�̎��Ԃ��~�����̂ˁH";
		mes "���͎��������B";
		mes "�ǂ������̐��݂͂�ȓƂ肾��B";
		mes "�������A��肭��ꂻ������Ȃ��H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�ǂ����A�{���ɘT�̎q��";
		mes "�E���ė��Ă��܂����݂������ˁB";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�A�C�V��]";
		mes "�������z�I�@���G���G�ɋ߂Â��ȁI";
		mes "�|�����Ă邶��Ȃ��I";
		mes "�������ɁA����Ōx�����Ă��̂ˁI";
		next;
		mes "[�A�C�V��]";
		mes "���܂���������̂Ă�";
		mes "�����������I";
		mes "���ɐU�������";
		mes "���̂܂܋���I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�A�C�V���A�b�𕷂��ė~�����񂾁B";
		mes "�ق�A�L�����f�B�����邩��B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�A�C�V��]";
		mes "�}���������������񂶂�";
		mes "�d���Ȃ��B";
		mes "�b�����͕����Ă��B";
		next;
		mes "^0000FF�]�}�����͎q�T�̂��Ƃ�";
		mes "�@�X�J�j�A���畷����";
		mes "�@�����ɗ������Ƃ�`�����]^000000";
		next;
		mes "[�A�C�V��]";
		mes "����ς�A�������Ǝv�����I";
		mes "�X�J�j�A������Ȃ����Ƃ�";
		mes "�M���B�ɐ������񂾂񂾁I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "������L�����f�B�����邩��";
		mes "���������āc�c";
		mes "�Q�ꂩ��͂��ꂽ";
		mes "�q���̘T�𑺂ɂ͒u���Ă����Ȃ���B";
		mes "�e���T���ɂ��邩������Ȃ����B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�A�C�V��]";
		mes "�Q�ꂩ��͂��ꂽ�񂶂�Ȃ��I";
		mes "���񂾐e�T�̑���";
		mes "���サ�Ă����̂�A��Ă����񂾂���B";
		next;
		mes "[�A�C�V��]";
		mes "���G���G�����R�ɕԂ��Ă�";
		mes "�ЂƂ肶�ᐶ���Ă����Ȃ���I";
		mes "����ł��̂Ăė������Č����́H";
		mes "�l�łȂ��I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "������������������̂��B";
		mes "�ł��A�ǂ����܂��傤�ˁB";
		next;
		menu "�P������̂͂ǂ��ł��傤�H",-;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�Ȃ�قǁB";
		mes "�����������炫����ƌP�������";
		mes "���̉ƒ{���P�����Ƃ͂Ȃ���";
		mes "�ނ���A�����X�^�[����ƒ{��";
		mes "����Ă���邩������Ȃ��ł��ˁB";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�A�C�V��]";
		mes "�킩�����I";
		mes "���G���G�́A�J�߂�ƐL�т�q������";
		mes "�J�߂����ɂ��J���Ƃ��Ă�����";
		mes "�u�ɂ��v���u1�v�p�ӂ��Ă�ˁI";
		delquest 17510;
		setquest 17511;
		close;
	}
	if(checkquest(17511)) {
		mes "[�A�C�V��]";
		mes "���G���G���P�����Ȃ�����I";
		mes "���G���G�́A�J�߂�ƐL�т�q������";
		mes "�J�߂����ɂ��J���Ƃ��Ă�����";
		mes "�u�ɂ��v���u1�v�p�ӂ��Ă�ˁI";
		close;
	}
	if(checkquest(17512)) {
		mes "[�A�C�V��]";
		mes "�X�J�j�A�ɁA���̃��G���G��";
		mes "�����ɂł���q�Ȃ̂�";
		mes "�����Ă��˂΁B";
		close;
	}
	mes "[�A�C�V��]";
	mes "���G���G�̂��K����o�Ă���";
	mes "�A��������H";
	mes "�}�W�ŉ����񂾂��āI";
	mes "���A�G������_��������ˁI";
	close;
OnQuestInfo:
	if(checkquest(17510))
		showevent 0, 3, "�X�J�j�A#wms01";
	else
		showevent 9999,0,"�X�J�j�A#wms01";
	end;
}
wolfvill.gat,100,177,1	script	���G���G#wms02	21324,{/* 16137 */
	if(checkquest(17511)) {
		if(countitem(517) < 1) {
			mes "[�A�C�V��]";
			mes "���G���G�́A�J�߂�ƐL�т�q������";
			mes "�J�߂����ɂ��J���Ƃ��Ă�����";
			mes "�u�ɂ��v���u1�v�p�ӂ��Ă�ˁI";
			close;
		}
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�悵�A�����΂�����";
		mes "�P�����Ă݂��܂��傤�B";
		mes "���Ă��Ă��������B";
		mes "�c�c����ɂ��́A���G���G�B";
		mes "��Ċ������Ȃ��B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[���G���G]";
		mes "�c�c�v�C�I";
		mes "�@";
		mes "^0000FF�]���G���G�̓}�����𖳎������]^000000";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "����ȁc�c";
		mes "���ł͑���ɂ���Ȃ��悤�ł��B";
		mes "�����͖`���җl�ɂ��肢���܂��B";
		next;
		cutin "ep18_maram_01.png", 255;
		menu "���G���G�̖ڂ������ƌ��߂�",-;
		emotion 1,"���G���G#wms02";
		mes "[���G���G]";
		mes "���H";
		next;
		mes "[�A�C�V��]";
		mes "�����I";
		mes "���������I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ă����A��������B";
		mes "���G���G�͂����D���H";
		mes "�Ă������́H�@�����́H�@���������́H";
		mes "�������𕷂��Ă��ꂽ��";
		mes "�����������邩��ˁ`�B";
		next;
		emotion 3,"���G���G#wms02";
		mes "[���G���G]";
		mes "���I�@���I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����Ă݂悤���B";
		mes "���G���G�A������I";
		mes "�҂āI";
		mes "�悭�ł��܂����B�����A��������B";
		next;
		emotion 3,"���G���G#wms02";
		mes "[�A�C�V��]";
		mes "����`�A���炠��I";
		mes "���̌���!?";
		mes "�����̎q���ă}�W�V�˂���Ȃ�!!";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "�������`���җl�I";
		mes "�Ȃ�Ƃ�����ۂ̗ǂ��I";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�A�C�V��]";
		mes "�������I";
		mes "���G���G�A������I";
		mes "����I";
		mes "����`�}�W�����I";
		mes "�����̎q�A��������!!";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���΂炭�P���͕K�v�ł��傤��";
		mes "����Ȃ�T�𑺂ɒu�����Ƃ�";
		mes "�����Ă��炦��ł��傤�B";
		next;
		cutin "ep18_maram_01.png", 255;
		mes "[�A�C�V��]";
		mes "�悵�I";
		mes "�܂��̓X�J�j�A�Ɍ����Ă��B";
		mes "�����̎q�������Ɍ�����";
		mes "�����ɂ킩�点�Ă��񂾁I";
		delitem 517,1;
		delquest 17511;
		setquest 17512;
		close;
	}
	if(checkquest(17512)) {
		mes "[�A�C�V��]";
		mes "�X�J�j�A�̂Ƃ���ɍs�����I";
		mes "�����̎q�������Ɍ�����";
		mes "�����ɂ킩�点�Ă��񂾁I";
		close;
	}
	if(checkquest(17513)) {//������
	}
	if(checkquest(17514)) {//������
	}
	if(checkquest(17515)) {
		emotion 1;
		mes "[���G���G]";
		mes "���H";
		close;
	}
	emotion 1;
	unittalk "���H";
	mes "[�A�C�V��]";
	mes "�����̃��G���G�ɐG��Ȃ��ŁI";
	mes "���G���G���������Ă邶���I";
	close;
OnQuestInfo:
	if(checkquest(17511) && countitem(517) < 1)
		showevent 0, 2, "���G���G#wms02";
	else if(checkquest(17511))
		showevent 0, 3, "���G���G#wms02";
	else
		showevent 9999,0,"���G���G#wms02";
	end;
}
gw_fild01.gat,26,101,0	script	#wms01	139,3,3,{/* 16138 */
	if(checkquest(17513)) {
		cloakoffnpc "��������#wms02";
		cloakoffnpc "���G���G#wms03";
	}
	end;
}
gw_fild01.gat,138,106,5	script	��#wms01	10430,{/* 16139 */
	if(checkquest(17513)) {
		delquest 17513;
		setquest 17514;
		setnpcdisplay "��������#wms02",21323;
		setnpcdisplay "���G���G#wms03",21324;
		cloakoffnpc "��������#wms02";
		cloakoffnpc "���G���G#wms03";
		unittalk getcharid(3),strcharinfo(0)+" : �������Ă��́H�@���������C�ɓ���Ȃ̂��ȁH�@���ɍs�������ꏊ�͂���H",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"��������#wms02"),"���F�F�F�F�I";
		if(!sleep2(1000)) end;
		cloakonnpc "��������#wms02";
		cloakonnpc "���G���G#wms03";
		setnpcdisplay "��������#wms02",844;
		setnpcdisplay "���G���G#wms03",844;
		unittalk getcharid(3),strcharinfo(0)+" : ���G���G�A���������̂��Ƃ���낵���ˁI",1;
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ���������̗U���̓��G���G�ɔC���āA�������������������đ���H�ׂ���悤�u�A�b�V�������v��15�̂��炢�������āA������x�����ɖ߂��Ă��悤�B",1;
		end;
	}
	if(checkquest(17514)) {
		if(!(checkquest(17514)&4)) {
			unittalk getcharid(3),strcharinfo(0)+" : �������������������đ���H�ׂ���悤�u�A�b�V�������v��15�̓������āA������x�����ɖ߂��Ă��悤�B",1;
			end;
		}
		delquest 17514;
		setquest 17515;
		setnpcdisplay "��������#wms02",21323;
		setnpcdisplay "���G���G#wms03",21324;
		cloakoffnpc "��������#wms02";
		cloakoffnpc "���G���G#wms03";
		cloakonnpc "��������#wms03";
		cloakonnpc "���G���G#wms04";
		unittalk getcharid(3),strcharinfo(0)+" : ���������ς��ɂȂ����H",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"��������#wms02"),"���F�F�F�F�I";
		if(!sleep2(1000)) end;
		unittalk getcharid(3),""+strcharinfo(0)+" : ���G���G�̓�������������Ă��ꂽ�񂾂�ˁH",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"���G���G#wms03"),"���I�I�I";
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �悭�ł��܂����B���낻�남�ƂɋA�낤���B",1;
		cloakonnpc "��������#wms02";
		cloakonnpc "���G���G#wms03";
		cloakonnpc "��������#wms03";
		cloakonnpc "���G���G#wms04";
		setnpcdisplay "��������#wms02",844;
		setnpcdisplay "���G���G#wms03",844;
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �D�F�T�̑��ɂ���u�X�J�j�A�v�̏��ɖ߂낤�B",1;
		end;
	}
	if(checkquest(17515)) {
		cloakonnpc "��������#wms02";
		cloakonnpc "���G���G#wms03";
		cloakonnpc "��������#wms03";
		cloakonnpc "���G���G#wms04";
		setnpcdisplay "��������#wms02",844;
		setnpcdisplay "���G���G#wms03",844;
		unittalk getcharid(3),strcharinfo(0)+" : �D�F�T�̑��ɂ���u�X�J�j�A�v�̏��ɖ߂낤�B",1;
	}
	end;
OnQuestInfo:
	if(checkquest(17514) && !(checkquest(17514)&4))
		showevent 0, 2, "��#wms01";
	else if(checkquest(17513) || checkquest(17514))
		showevent 0, 3, "��#wms01";
	else
		showevent 9999,0,"��#wms01";
	end;
}
gw_fild01.gat,140,103,3	script	��������#wms02	844,{/* 16140 (cloaking)*/
	unittalk "���F�F�F�F�H";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,136,103,7	script	���G���G#wms03	844,{/* 16141 (cloaking)*/
	unittalk "���I�I";
	end;
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,160,104,3	script	��������#wms03	844,{/* 16142 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,159,104,7	script	���G���G#wms04	844,{/* 16143 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
gw_fild01.gat,160,104,0	script	����������#wms11	139,{/* 16144 */}
wolfvill.gat,197,170,5	script	�����}#ep18	943,{/* 16145 */
	mes "^0000FF�]�����ɂȂ��Đn���������ł���B";
	mes "�@�b�������Ă��Ԏ������������]^000000";
	close;
}
wolfvill.gat,202,166,3	script	�G���C��#ep18	919,{/* 16146 */
	if(EP18_1QUE < 36) {
		mes "[�G���C��]";
		mes "�c�c�悻�҂�";
		mes "���̐X�Ń����X�^�[�łȂ�";
		mes "���ʂ̓��������̂�";
		mes "�ւ����Ă���́B";
		mes "�E�T�M1�H�ł��l������_���B";
		next;
		mes "^ff0000�]�N�G�X�g�u�����Ƃ̗Ƃ��������v��^000000";
		mes "^ff0000�@���L�̏����𖞂����Ɛi�s�\�ł��B^000000";
		mes "^ff0000�@�EBaseLv210�ȏ�^000000";
		mes "^ff0000�@�E4���E�A�g��4���E^000000";
		mes "^ff0000�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(8688)) {
		if( checkquest(130151) || checkquest(130152) ||
			checkquest(130153) || checkquest(130154) || checkquest(130155)
		) {
			mes "[�G���C��]";
			mes "�D�F�̐X��5������";
			mes "㩂��d�|���Ă��邩��";
			mes "�l�����|�����Ă�����5�ق�";
			mes "������Ă��āB";
			next;
			mes "[�G���C��]";
			mes "�|�����ĂȂ��Ă�";
			mes "㩂����̂܂܂ɂ��Ă�����";
			mes "���΂炭������|���邩���B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		if(countitem(1000412)) delitem 1000412,countitem(1000412);
		if(countitem(1000413)) delitem 1000413,countitem(1000413);
		setquest 8689;
		setquest 130151;
		delquest 130151;
		setquest 130152;
		delquest 130152;
		setquest 130153;
		delquest 130153;
		setquest 130154;
		delquest 130154;
		setquest 130155;
		delquest 130155;
		delquest 8688;
		getitem 1000405,3;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		setquest 130132;
		compquest 130132;
		if(checkquest(130132)) {
			set EP18_1QUE,37;
			delquest 11718;
			setquest 18082;
		}
		mes "[�G���C��]";
		mes "�c�悵�A�����l�B";
		mes "���������ȍ~���ɂ��Ă�Ȃ�";
		mes "�܂����肢���Ă������H";
		next;
		if(select("�����ł���","�����͖Z��������") == 1) {
			mes "[�G���C��]";
			mes "���́A�����Ă�҂͐e�ł��g��";
			mes "��`������ˁB�������B";
			mes "���肪�Ƃ��B";
			close;
		}
	}
	if(checkquest(8689)) {
		mes "[�G���C��]";
		mes "�����͂����A���ċx��ŁB";
		mes "�d���͖����܂�";
		mes "���肢���邩��B";
		close;
	}
	mes "[�G���C��]";
	mes "�c�c�O����`���҂�������";
	mes "�����Ă邯�ǁA�M���������Ȃ́H";
	mes "����������Ă�݂���������";
	mes "�d����T���Ă��肷��H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�G���C��]";
		mes "��邱�Ƃ��Ȃ��Ȃ�ז����Ȃ��ŁB";
		mes "�������̕��΂ł����Ă�����H";
		close;
	}
	mes "[�G���C��]";
	mes "���̓����}�ƁA���̉Ƒ��Ƌ���";
	mes "�ƒ{��쐶�����̌������";
	mes "�S�����Ă���́B";
	mes "�n���Ȃ񂩂̓���̐�����";
	mes "���̎d����B";
	next;
	mes "[�G���C��]";
	mes "�M���ɂ��肢�ł������Ȏd����";
	mes "�X�ɐݒu����㩂̊m�F���ȁH";
	mes "�ł������H";
	next;
	menu "���ꂮ�炢������Ȃ����Ƃł��B",-;
	mes "[�G���C��]";
	mes "�D�F�̐X��5������";
	mes "㩂��d�|���Ă��邩��";
	mes "�l�����|�����Ă�����5�ق�";
	mes "������Ă��āB";
	next;
	mes "[�G���C��]";
	mes "�|�����ĂȂ��Ă�";
	mes "㩂����̂܂܂ɂ��Ă�����";
	mes "���΂炭������|���邩���B";
	next;
	mes "[�G���C��]";
	mes "���Ⴀ�A���肢�����ˁB";
	delquest 130112;
	setquest 130151;
	setquest 130152;
	setquest 130153;
	setquest 130154;
	setquest 130155;
	setquest 8688;
	close;
OnQuestInfo:
	if(checkquest(130112) || 
		(checkquest(8688) && !checkquest(130151) && !checkquest(130152) &&
			!checkquest(130153) && !checkquest(130154) && !checkquest(130155))
	)
		showevent 0, 3, "�G���C��#ep18";
	else
		showevent 9999,0,"�G���C��#ep18";
	end;
}

gw_fild01.gat,24,122,0	script	�ݒu�����#001	844,{/* 6875 */}
gw_fild01.gat,93,113,0	script	�ݒu�����#002	844,{/* 6876 */}
gw_fild01.gat,229,205,0	script	�ݒu�����#003	844,{/* 6877 */}
gw_fild01.gat,153,212,0	script	�ݒu�����#004	844,{/* 6878 */}
gw_fild01.gat,335,241,0	script	�ݒu�����#005	844,{/* 6879 */
	if(checkquest(8688)) {
		if(!checkquest(130155)) {
			unittalk getcharid(3),strcharinfo(0)+" : �]����㩂�T���Ă݂悤�]",1;
			end;
		}
		misceffect 101,"�ݒu�����#005";
		progressbar 1;	//color=0xffff00
		misceffect 18,"�ݒu�����#005";
		if(checkitemblank() == 0) {
			unittalk getcharid(3),strcharinfo(0)+" : �]�������������悤���]",1;
			end;
		}
		if(rand(100) < 20) {
			unittalk getcharid(3),strcharinfo(0)+" : �]�����|�����Ă��Ȃ������]",1;
			end;
		}
		getitem rand(1000412,1000413),1;
		delquest 130155;
		end;
	}
	//������
	end;
OnQuestInfo:
	if(checkquest(130155))
		showevent 0, 3, "�ݒu�����#005";
	else
		showevent 9999,0,"�ݒu�����#005";
	end;
}
rachel.gat,103,141,5	script	�����̔���#ep18	943,{/* 16167 */
	if(checkquest(8691)) {
		mes "[�����̔���]";
		mes "�u�򐅗p�����v�̔̔��ɎQ��܂����I";
		mes "1�l1�����ł���A";
		mes "���������`�����߂ɂ��w���������`���I";
		next;
		menu "�򐅗p�����H",-;
		mes "[�����̔���]";
		mes "�����`�ٍ��̕��ł������`�B";
		mes "�ȒP�ɐ������܂���";
		mes "�������ꂽ������C�ɏ򉻂��Ă����";
		mes "���ʂ��ꂽ����̂��Ƃł���`�B";
		next;
		mes "[�����̔���]";
		mes "�_�a�ō���Ă���̂ł����`";
		mes "�����ᐅ�H����������Ă܂�����";
		mes "�̂قǎ��v������킯�ł͂Ȃ���ł��B";
		mes "�ł��A���ʂ�������Ă����ł��B";
		next;
		mes "[�����̔���]";
		mes "�����A�������Ɏg���K�v��������";
		mes "��ʂɍ݌ɂ�u���܂���B";
		mes "�����̊F����Ȃǂ�";
		mes "���ݐ����؂ꂽ���ً̋}�p��";
		mes "�����Ă�����邱�Ƃ�����܂���`�B";
		next;
		mes "[�����̔���]";
		mes "�򉻂��ꂽ���͕������Ă���";
		mes "���񂾕����ǂ��ł���`�B";
		mes "���������Ɉ��񂾐l����";
		mes "�ςȏL��������ƃN���[����";
		mes "���������Ƃ�����̂Ł`�B";
		next;
		mes "[�����̔���]";
		mes "�Ƃ����킯�ŁA���ЂƂ�";
		mes "550Zeny�ɂȂ�܂��`�I";
		next;
		if(select("����","����Ȃ�") == 2) {
			mes "[�����̔���]";
			mes "�M���ɂ͕K�v�Ȃ������悤�ł��ˁB";
			mes "�����K�v�ɂȂ�����";
			mes "�����ɗ��Ă��������ˁ`�B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		if(Zeny < 550) {//������
			mes "[�����̔���]";
			mes "����������܂���˂��H";
			close;
		}
		set Zeny, Zeny -550;
		delquest 8691;
		setquest 8692;
		getitem 1000410,1;
		mes "[�����̔���]";
		mes "���w�����肪�Ƃ��������܁`���I";
		mes "�t���C���l�̂����삪����񂱂Ƃ��`�I";
		close;
	}
	if(checkquest(8692) || checkquest(8696)) {
		mes "[�����̔���]";
		mes "���w�����肪�Ƃ��������܁`���I";
		mes "�t���C���l�̂����삪����񂱂Ƃ��`�I";
		close;
	}
	if(checkquest(8695)){
		mes "[�����̔���]";
		mes "�u�򐅗p�����v�̔̔��ɎQ��܂����I";
		mes "1�l1�����ł���A";
		mes "���������`�����߂ɂ��w���������`���I";
		next;
		switch(select("�����𔃂�","�����𕷂�","��߂�")) {
			case 1:
				mes "[�����̔���]";
				mes "550Zeny�ɂȂ�܂��`";
				next;
				if(select("����","����Ȃ�") == 2) {
					mes "[�����̔���]";
					mes "�M���ɂ͕K�v�Ȃ������悤�ł��ˁB";
					mes "�����K�v�ɂȂ�����";
					mes "�����ɗ��Ă��������ˁ`�B";
					close;
				}
				if(checkitemblank() == 0) {//������
					mes "^009eff�y�C���t�H���[�V�����z";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B^000000";
					close2;
					cutin "ra_gwoman.bmp", 255;
					end;
				}
				if(Zeny < 550) {//������
					mes "[�����̔���]";
					mes "����������܂���˂��H";
					close;
				}
				set Zeny, Zeny -550;
				delquest 8695;
				setquest 8696;
				getitem 1000410,1;
				mes "[�����̔���]";
				mes "���w�����肪�Ƃ��������܁`���I";
				mes "�t���C���l�̂����삪����񂱂Ƃ��`�I";
				close;
			case 2:
				mes "[�����̔���]";
				mes "�����`�ٍ��̕��ł������`�B";
				mes "�ȒP�ɐ������܂���";
				mes "�������ꂽ������C�ɏ򉻂��Ă����";
				mes "���ʂ��ꂽ����̂��Ƃł���`�B";
				next;
				mes "[�����̔���]";
				mes "�_�a�ō���Ă���̂ł����`";
				mes "�����ᐅ�H����������Ă܂�����";
				mes "�̂قǎ��v������킯�ł͂Ȃ���ł��B";
				mes "�ł��A���ʂ�������Ă����ł��B";
				next;
				mes "[�����̔���]";
				mes "�����A�������Ɏg���K�v��������";
				mes "��ʂɍ݌ɂ�u���܂���B";
				mes "�����̊F����Ȃǂ�";
				mes "���ݐ����؂ꂽ���ً̋}�p��";
				mes "�����Ă�����邱�Ƃ�����܂���`�B";
				next;
				mes "[�����̔���]";
				mes "�򉻂��ꂽ���͕������Ă���";
				mes "���񂾕����ǂ��ł���`�B";
				mes "���������Ɉ��񂾐l����";
				mes "�ςȏL��������ƃN���[����";
				mes "���������Ƃ�����̂Ł`�B";
				next;
				mes "[�����̔���]";
				mes "���ЂƂ�";
				mes "550Zeny�ɂȂ�܂��B";
				mes "��낵����Δ����čs���Ă��������ˁI";
				close;
			case 3:
				mes "[�����̔���]";
				mes "�M���ɂ͕K�v�Ȃ������悤�ł��ˁB";
				mes "�����K�v�ɂȂ�����";
				mes "�����ɗ��Ă��������ˁ`�B";
				close;
		}
	}
	mes "[�����̔���]";
	mes "�u�򐅗p�����v�̔̔��ɎQ��܂����I";
	mes "1�l1�����ł���A";
	mes "���������`�����߂ɂ��w���������`���I";
	close;
OnQuestInfo:
	if(checkquest(8691))
		showevent 0, 3, "�����̔���#ep18";
	else
		showevent 9999,0,"�����̔���#ep18";
	end;
}
wolfvill.gat,103,230,3	script	�u�_��#ep18	931,{/* 16168 */
	if(EP18_1QUE < 36) {
		mes "[�u�_��]";
		mes "�悻�҂��A���ɏo���肷��Ƃ́B";
		mes "�D��S�����Ŕ`���̂�";
		mes "�������Ă��炦�邩�B";
		next;
		mes "^ff0000�]�N�G�X�g�u�Y��Ȑ����B�v��";
		mes "�@���L�̏����𖞂����Ɛi�s�\�ł��B";
		mes "�@�E�N�G�X�g�u�F��̕����v��r���܂Ői�s�]^000000";
		close;
	}
	if(checkquest(8691) || checkquest(8695)) {
		mes "[�u�_��]";
		mes "���w���ɍs����";
		mes "�u�����̔����v������͂����B";
		mes "�K���ȗ��R�����āu�򐅗p�����v��";
		mes "�����Ă��Ă���B���񂾂�B";
		close;
	}
	if(checkquest(8692) || checkquest(8696)) {
		mes "[�u�_��]";
		mes "�u�򐅗p�����v��";
		mes "�����ɍw���ł����悤���ȁB";
		mes "���Ⴀ�A����𑺂ɐݒu����Ă���";
		mes "���r�ɓ����";
		mes "�Y��Ȑ����m�ۂ��Ă���B";
		close;
	}
	if(checkquest(8693)) {
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		delitem 1000411,1;
		delquest 8693;
		setquest 8694;
		getitem 1000405,2;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		getexp 337500000,0,0;
		getexp 0,350000000,0;
		setquest 130126;
		compquest 130126;
		mes "[�u�_��]";
		mes "���肪�Ƃ��I�@����������B";
		mes "�������Ŏq�������Ɉ��S�Ȑ���";
		mes "���܂��Ă�邱�Ƃ��ł���B";
		next;
		mes "[�u�_��]";
		mes "�����ǂ�������A�����ȍ~��";
		mes "��`���Ă����Ə�����B";
		mes "�q�������ׂ̈ɂ�";
		mes "��낵�����ނ�B";
		close;
	}
	if(checkquest(8697)){
		if(checkitemblank() == 0) {//������
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		delitem 1000411,1;
		setquest 8695;
		delquest 8695;
		setquest 8696;
		delquest 8696;
		delquest 8697;
		setquest 8694;
		getitem 1000405,2;
		for(set '@i,0; '@i< 20 ; set '@i,'@i+1){
			getexp 225000000,0,0;
			getexp 0,175000000,0;
		}
		mes "[�u�_��]";
		mes "���肪�Ƃ��I�@����������B";
		mes "�������Ŏq�������Ɉ��S�Ȑ���";
		mes "���܂��Ă�邱�Ƃ��ł���B";
		next;
		mes "[�u�_��]";
		mes "�����ǂ�������A�����ȍ~��";
		mes "��`���Ă����Ə�����B";
		mes "�q�������ׂ̈ɂ�";
		mes "��낵�����ނ�B";
		close;
	}
	if(checkquest(8694)) {
		if(checkquest(8694) & 0x02 == 0){
			mes "[�u�_��]";
			mes "���ꂾ���Y��Ȑ��������";
			mes "�����̕��͑��v���낤�B";
			mes "�����A�悯��Ζ����ȍ~��";
			mes "��`���Ă����Ə�����B";
			close;
		}
		delquest 8694;
		mes "[�u�_��]";
		mes "�₠�A���Ă��ꂽ�񂾂ȁB";
		mes "�O�Ɠ����悤��";
		mes "�Y��Ȑ��̊m�ۂ���`���Ă���Ȃ����H";
		next;
		if(select("���܂��傤","���͎��Ԃ��Ȃ�") == 2) {
			mes "[�u�_��]";
			mes "�������c�c�d�����Ȃ��B";
			mes "�܂��ʂ̐l�ɂ��肢����Ƃ��悤�B";
			close;
		}
		mes "[�u�_��]";
		mes "�������B";
		mes "���w���ɍs����";
		mes "�u�����̔����v������͂����B";
		mes "�K���ȗ��R�����āu�򐅗p�����v��";
		mes "�����Ă��Ă���B���񂾂�B";
		setquest 8695;
		close;
	}
	mes "[�u�_��]";
	mes "�悻�҂̖`���҂��B";
	mes "���݂̂�Ȃׂ̈ɂ��낢���";
	mes "���݂��Ă���炵���ȁH";
	mes "���̂��Ƃ���`���Ă��炦�Ȃ����H";
	next;
	mes "[�u�_��]";
	mes "�m���Ă���Ǝv����";
	mes "��X�̓��w���ɂ͗e�Ղɓ���Ȃ��B";
	mes "������A���Ƀ��w����";
	mes "�Z�X�����j����_�a�ō���Ă���";
	mes "�u�򐅗p�����v�𔃂��ė��ė~�����B";
	next;
	mes "[�u�_��]";
	mes "���X���̒n���Y��Ȑ���";
	mes "�m�ۂ���̂�����y�n�������B";
	mes "�����͂������A�ΎR�D�����邵�ȁB";
	mes "�����Łu�򐅗p�����v��";
	mes "�J�����ꂽ�񂾁B";
	next;
	mes "[�u�_��]";
	mes "�����͂悭�킩��񂪁c�c";
	mes "�B���p��疂�@�I�ȋZ�p��";
	mes "�������򉻂��Ă����B";
	mes "���̐X�̗����̉��򐅂�";
	mes "���߂�悤�ɂȂ�񂾁B";
	next;
	mes "[�u�_��]";
	mes "�֗��ȕi�Ȃ񂾂��g�p������������";
	mes "�X�g�b�N���Ă����Ȃ�����";
	mes "���̓s�x�A��ɓ���Ȃ��Ƃ����Ȃ��B";
	mes "�Ƃ����킯�ŁA���񂽂̏o�Ԃ��B";
	next;
	mes "[�u�_��]";
	mes "���w���ɍs���āu�򐅗p�����v��";
	mes "�����ė��āA���ɐݒu����Ă���";
	mes "�u���r�v�ɓ���ė~�����B";
	mes "��������΁A�Y��Ȑ����m�ۂł���B";
	mes "����Ă��炦�邩�H";
	next;
	if(select("����Ă݂܂��傤","��������c�c") == 2) {
		mes "[�u�_��]";
		mes "�������c�c�d�����Ȃ��B";
		mes "�܂��ʂ̐l�ɂ��肢����Ƃ��悤�B";
		close;
	}
	mes "[�u�_��]";
	mes "�������B";
	mes "���w���ɍs����";
	mes "�u�����̔����v������͂����B";
	mes "�K���ȗ��R�����āu�򐅗p�����v��";
	mes "�����Ă��Ă���B���񂾂�B";
	delquest 130106;
	setquest 8691;
	close;
OnQuestInfo:
	if(checkquest(130106) || checkquest(8693))
		showevent 0, 3, "�u�_��#ep18";
	else
		showevent 9999,0,"�u�_��#ep18";
	end;
}
wolfvill.gat,104,235,0	script	���p���̐��r#ep1801	844,{/* 16169 */
	if(checkquest(8692)) {
		mes "^0000FF�]���S�̂Ŏg����";
		mes "�@���p���̐��r���B";
		mes "�@�Е��ɂ��Y��Ȑ��������Ă��邪";
		mes "�@�����Е��ɓ����Ă��鐅�͑����Ă���";
		mes "�@���̂܂܂ł͈��߂����ɂȂ��]^000000";
		next;
		misceffect 441,"���p���̐��r#ep1801";
		misceffect 444,"���p���̐��r#ep1801";
		misceffect 14,"���p���̐��r#ep1801";
		misceffect 44,"���p���̐��r#ep1801";
		mes "^0000FF�]�����Ă�����̐��r��";
		mes "�@�u�򐅗p�����v�������";
		mes "�@�s�v�c�Ȍ���������B";
		mes "�@�u���Ԃɐ����Y��ɂȂ��Ă����]^000000";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		delitem 1000410,1;
		delquest 8692;
		setquest 8693;
		getitem 1000411,1;
		mes "^0000FF�]�Y��ɂȂ����������񂾁B";
		mes "�@�u�_���̂Ƃ���Ɏ����čs�����]^000000";
		close;
	}
	if(checkquest(8696)) {
		mes "^0000FF�]���S�̂Ŏg����";
		mes "�@���p���̐��r���B";
		mes "�@�Е��ɂ��Y��Ȑ��������Ă��邪";
		mes "�@�����Е��ɓ����Ă��鐅�͑����Ă���";
		mes "�@���̂܂܂ł͈��߂����ɂȂ��]^000000";
		next;
		misceffect 441,"���p���̐��r#ep1801";
		misceffect 444,"���p���̐��r#ep1801";
		misceffect 14,"���p���̐��r#ep1801";
		misceffect 44,"���p���̐��r#ep1801";
		mes "^0000FF�]�����Ă�����̐��r��";
		mes "�@�u�򐅗p�����v�������";
		mes "�@�s�v�c�Ȍ���������B";
		mes "�@�u���Ԃɐ����Y��ɂȂ��Ă����]^000000";
		next;
		delitem 1000410,1;
		getitem 1000411,1;
		delquest 8696;
		setquest 8697;
		mes "^0000FF�]�Y��ɂȂ����������񂾁B";
		mes "�@�u�_���̂Ƃ���Ɏ����čs�����]^000000";
		close;
	}
	if(checkquest(8693) || checkquest(8697)) {
		mes "^0000FF�]�Y��ɂȂ����������񂾁B";
		mes "�@�u�_���̂Ƃ���Ɏ����čs�����]^000000";
		close;
	}
	mes "^0000FF�]���S�̂Ŏg����";
	mes "�@���p���̐��r���B";
	mes "�@�Е��ɂ��Y��Ȑ��������Ă��邪";
	mes "�@�����Е��ɓ����Ă��鐅�͑����Ă���";
	mes "�@���̂܂܂ł͈��߂����ɂȂ��]^000000";
	close;
OnQuestInfo:
	if(checkquest(8692))
		showevent 0, 3, "���p���̐��r#ep1801";
	else
		showevent 9999,0,"���p���̐��r#ep1801";
	end;
}
ra_fild10.gat,175,179,3	script	���[�v#ra_to_oz_dun01	10024,{/* 16170 */
	if(EP18_1QUE < 31) {
		unittalk getcharid(3),strcharinfo(0)+" : �]����ȂƂ���Ƀ��[�v������]",1;
		emotion 1,"";
		end;
	}
	mes "^0000FF�]��̗􂯖ڂ���";
	mes "�@���A�̓����������Ă���B";
	mes "�@���[�v���g���Γ��A�ɓ��ꂻ�����]^000000";
	next;
	if(select("���[�v���g���ĉ���","�g��Ȃ�") == 2) {
		mes "�]���[�v���g��Ȃ������]";
		close2;
		emotion 9,"";
		end;
	}
	mes "�]���[�v���g���ĉ������]";
	close2;
	warp "oz_dun01.gat", 284, 167;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)
		showevent 6, 1, "���[�v#ra_to_oz_dun01";
	else
		showevent 9999,0,"���[�v#ra_to_oz_dun01";
	end;
}
oz_dun01.gat,284,164,3	script	���[�v#to_ra_fild10	10024,{/* 16171 */
	mes "^0000FF�]���[�v���g���Ώオ�ꂻ�����]^000000";
	next;
	if(select("���[�v���g���ď��","�g��Ȃ�") == 2) {
		mes "�]���[�v���g��Ȃ������]";
		close2;
		emotion 9,"";
		end;
	}
	mes "�]���[�v���g���ď�����]";
	close2;
	warp "ra_fild10.gat", 173, 176;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)	//32����
		showevent 6, 1, "���[�v#to_ra_fild10";
	else
		showevent 9999,0,"���[�v#to_ra_fild10";
	end;
}

oz_dun01.gat,28,190,3	script	���[�v#to_gw_fild01	10024,{/* 16174 */
	mes "^0000FF�]���[�v���g���Ώオ�ꂻ�����]^000000";
	next;
	if(select("���[�v���g���ď��","�g��Ȃ�") == 2) {
		mes "�]���[�v���g��Ȃ������]";
		close2;
		emotion 9,"";
		end;
	}
	mes "�]���[�v���g���ď�����]";
	close2;
	warp "gw_fild01.gat", 275, 337;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)
		showevent 6, 1, "���[�v#to_gw_fild01";
	else
		showevent 9999,0,"���[�v#to_gw_fild01";
	end;
}
gw_fild01.gat,279,335,3	script	���[�v#to_oz_dun01	10024,{/* 16175 */
	mes "^0000FF�]��̗􂯖ڂ���";
	mes "�@���A�̓����������Ă���B";
	mes "�@���[�v���g���Γ��A�ɓ��ꂻ�����]^000000";
	next;
	if(select("���[�v���g���ĉ���","�g��Ȃ�") == 2) {
		mes "�]���[�v���g��Ȃ������]";
		close2;
		emotion 9,"";
		end;
	}
	mes "�]���[�v���g���ĉ������]";
	close2;
	warp "oz_dun01.gat", 27, 188;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 31)
		showevent 6, 1, "���[�v#to_oz_dun01";
	else
		showevent 9999,0,"���[�v#to_oz_dun01";
	end;
}
gw_fild01.gat,396,269,3	script	�Â��������#ep18	836,{/* 16176 */}
gw_fild01.gat,135,9,0	script	#to_gw_fild02	45,{/* 16177 */}

gw_fild01.gat,32,101,3	script	�L�����p�[#to_wolfvill	881,{/* 16179 */
	if(EP18_1QUE < 35) {
		mes "[�L�����p�[]";
		mes "�����ɂ͗�����B";
		mes "�E��������Ȃ��B";
		mes "����ȉ����ł��邱�Ƃ�";
		mes "�����I�@�L�����v���I";
		next;
		mes "[�L�����p�[]";
		mes "���A�Ƃ�ǂ��o���ꂽ�킯����Ȃ��B";
		mes "�{�������H";
		close;
	}
	mes "[���]";
	mes "�₠�A���񂽂��B";
	mes "�b�͕����Ă��B";
	mes "���ɓ���̂����H";
	next;
	switch(select("�D�F�T�̑��֍s��","�I�Y�̖��H�֍s��","���͓���Ȃ�","�M���̐��̂́H")) {
	case 1:
		mes "[���]";
		mes "���Ⴀ�A���ė��Ă���B";
		mes "������̖؂̌��Ԃ���";
		mes "��������ē����Ă����񂾁B";
		close2;
		warp "wolfvill.gat", 270, 26;
		end;
	case 2:
		mes "[���]";
		mes "�I�Y�̖��H�֍s���̂��H";
		mes "�I�Y�̖��H�͂������̕��p�����B";
		viewpoint 1, 275, 337, 18, 0x00FF00;
		next;
		mes "�]�I�Y�̖��H�֌������܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���Ȃ��̓I�Y�̖��H�֌��������]";
		close2;
		warp "gw_fild01.gat", 275, 337;
		end;
	case 3:
		mes "[���]";
		mes "�����H";
		mes "�������������܂ŗ����񂾂�����";
		mes "���傢�Ǝ���̃����X�^�[��";
		mes "�ق点�Ă����B";
		mes "�������L�����v���ł��Ȃ����B";
		close;
	case 4:
		mes "[���]";
		mes "�����A���͑��̖�Ԃ���B";
		mes "�֌W�Ȃ��z��������";
		mes "�L�����v���Ă�悤�Ɍ�����";
		mes "�U�����Ă���Ă킯���B";
		close;
	}
	if(EP18_1QUE >= 36)
		showevent 6, 1, "�L�����p�[#to_wolfvill";
	else
		showevent 9999,0,"�L�����p�[#to_wolfvill";
	end;
}
rachel.gat,106,144,5	script	�s���l#ep18_0_1	10380,{/* 16180 */
	if(EP18_1QUE < 35) {
		mes "[�s���l]";
		mes "���܂�ȁB���͖Z�����񂾁B";
		next;
		mes "^0000ff�]�N�G�X�g�u�F��̕����v���A";
		mes "�@���ȏ�i�s�����";
		mes "�@���p���\�ɂȂ�܂��]^000000";
		close;
	}
	mes "[�s���l]";
	mes "�ށA���O��";
	mes "���Ō������Ƃ���炾�ȁB";
	mes "�����瑺�ɍs�����A";
	mes "���łɑ����Ă�낤���H";
	mes "���_�A����͂Ƃ�B";
	mes "�����^ff00005000Zeny^000000���ĂƂ��낾�ȁB";
	next;
	if(select("�D�F�T�̑��֍s��","��߂Ă���") == 2) {
		mes "[�s���l]";
		mes "�������B";
		mes "���ɍs�����͐����|���ȁB";
		mes "�ꏏ�ɑ����Ă��B";
		close;
	}
	if(Zeny < 5000) {	// ������
		mes "[�s���l]";
		mes "�������Ȃ��Ȃ瑗��Ȃ���";
		close;
	}
	misceffect 58,"�s���l#ep18_0_1";
	misceffect 35,"";
	mes "[�s���l]";
	mes "���x����I";
	mes "���ꂶ��B�o�����B";
	close2;
	set Zeny, Zeny -5000;
	warp "wolfvill.gat", 143, 126;	// from: rachel.gat(117, 139)
	end;
OnQuestInfo:
	if(EP18_1QUE >= 35)
		showevent 6, 3, "�s���l#ep18_0_1";
	else
		showevent 9999,0,"�s���l#ep18_0_1";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[�]��]";
	end;
}
wolfvill.gat,136,113,5	script	�s���l#ep18_0_2	10380,{/* 16181 */
	mes "[�s���l]";
	mes "�ށA���O��";
	mes "���w���Ō������Ƃ���炾�ȁB";
	mes "�����烉�w���ɍs�����A";
	mes "���łɑ����Ă�낤���H";
	mes "���_�A����͂Ƃ�B";
	mes "�����^ff00005000Zeny^000000���ĂƂ��낾�ȁB";
	next;
	if(select("���w���֍s��","��߂Ă���") == 2) {
		mes "[�s���l]";
		mes "�������B";
		mes "���w���ɍs�����͐����|���ȁB";
		mes "�ꏏ�ɑ����Ă��B";
		close;
	}
	if(Zeny < 5000) {	// ������
		mes "[�s���l]";
		mes "�������Ȃ��Ȃ瑗��Ȃ���";
		close;
	}
	misceffect 58,"�s���l#ep18_0_2";
	misceffect 35,"";
	mes "[�s���l]";
	mes "���x����I";
	mes "���ꂶ��B�o�����B";
	close2;
	set Zeny, Zeny -5000;
	warp "rachel.gat", 115, 142;
	end;
OnQuestInfo:
	if(EP18_1QUE >= 35)
		showevent 6, 3, "�s���l#ep18_0_2";
	else
		showevent 9999,0,"�s���l#ep18_0_2";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[�]��]";
	end;
}
wolfvill.gat,276,25,0	warp	#to_gw_fild01	2,2,gw_fild01.gat,25,101	//16182 from: wolfvill.gat(275, 24)
ra_fild10.gat,384,287,0	warp	raF10E_raF11W	1,1,ra_fild11.gat,28,290	// 16186
ra_fild11.gat,21,290,0	warp	raF11W_raF10E	1,1,ra_fild10.gat,379,283	// 16187
ra_fild11.gat,360,226,0	warp	raF11E_raWGate	1,1,rachel.gat,30,125	// 16188
rachel.gat,25,125,0	warp	raWGate_raF11E	1,1,ra_fild11.gat,353,226	// 16189
rachel.gat,167,244,0	script	#ep18w13_301	139,{/* 16190 */}
rachel.gat,167,244,5	script	�_��#sms01	920,{/* 16191 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,79,260,0	script	cinematic#vod	139,{/* 16192 */}
wolfvill.gat,79,260,4	script	�A�C��#vod	475,{/* 16193 (cloaking)*/
OnInit:
	cloakonnpc;
	end;
}

wolfvill.gat,167,135,3	script	�A�T�h#wolfvill	10397,{
	mes "[�A�T�h]";
	mes "�u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��";
	mes "�����Ă����番���Ă���܂���H";
	mes "�������A����͂��܂��̂ŁB";
	next;
	if(select("��������","��߂�") == 2) {
		mes "[�A�T�h]";
		mes "�����ł����B����͎c�O�ł��B";
		mes "�����������Ă��ǂ��Ǝv������";
		mes "�܂����Ă��������B";
		close;
	}
	mes "^0000ff�ޗ��ƂȂ�A�C�e���̐��B�l�A";
	mes "��������Ă���J�[�h��";
	mes "�G���`�����g�Ȃǂ͈����p����܂���B";
	mes "�܂��A�ΏۃA�C�e����";
	mes "�����������Ă���ꍇ��";
	mes "���ꂩ�̃A�C�e�����g�p����܂��B";
//	callbarterlist "�A�T�h#wolfvill";
	close;
OnInit:
//	barterlist "�A�T�h#wolfvill",100626,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",450177,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",450178,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",480091,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",480090,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",470087,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",470088,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",490107,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",490108,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",490106,0,1000405,100,0;
//	barterlist "�A�T�h#wolfvill",490109,0,1000405,100,0;
	setnpcgroup 1065;
	setnpctitle "[�A�C�e������]";
	end;
}
wolfvill.gat,164,137,3	script	�G���b�g#wolfvill	10399,{
	mes "[�G���b�g]";
	mes "����ɂ��́B��������";
	mes "�u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��";
	mes "�W�߂Ă��܂��B";
	mes "�������Ȃ����������ł�����";
	mes "�����Ă��������Ȃ��ł��傤���H";
	next;
	mes "[�G���b�g]";
	mes "��������������̂Ȃ炨���";
	mes "�O���C�E���t�V���[�Y��";
	mes "�G���`�����g���{���܂���B";
	//mes "�@";
	//mes "<URL>�O���C�E���t�V���[�Y�̏ڍׂ�����<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/graywolf.html</INFO></URL>";
	next;
	switch(select("�G���`�����g(���E�Z�E���E�C)","�G���`�����g(�A�N�Z�T���[1�E2)","��������")) {
	case 1:
		setarray '@itemid,400409,450177,450178,480090,480091,470087,470088;
		mes "[�G���b�g]";
		mes "�܂��͂��Ȃ��̑�����";
		mes "�m�F�����Ă��������B";
		mes "�ǂ�ɃG���`�����g���{���܂����H";
		next;
		for('@i = 0; '@i < getarraysize('@itemid); '@i++) {
			if(getequipid(1) == '@itemid['@i])
				set '@id[0],'@itemid['@i];
			if(getequipid(2) == '@itemid['@i])
				set '@id[1],'@itemid['@i];
			if(getequipid(5) == '@itemid['@i])
				set '@id[2],'@itemid['@i];
			if(getequipid(6) == '@itemid['@i])
				set '@id[3],'@itemid['@i];
		}
		if('@id[0] == 0 && '@id[1] == 0 && '@id[2] == 0 && '@id[3] == 0) {
			mes "^ff0000�G���`�����g�Ώۂ̃A�C�e����";
			mes "�������Ă��܂���B";
			close;
		}
		if('@id[0] > 0)
			set '@menu$[0],getitemname('@id[0]);
		if('@id[1] > 0)
			set '@menu$[1],getitemname('@id[1]);
		if('@id[2] > 0)
			set '@menu$[2],getitemname('@id[2]);
		if('@id[3] > 0)
			set '@menu$[3],getitemname('@id[3]);
		set '@pos,select('@menu$[0],'@menu$[1],'@menu$[2],'@menu$[3]);
		if('@pos == 1 || '@pos == 2)
			set '@pos,'@pos;
		else
			set '@pos,'@pos+2;
		set '@ref,1;
		break;
	case 2:
		setarray '@itemid,490106,490107,490108,490109;
		mes "[�G���b�g]";
		mes "�܂��͂��Ȃ��̑�����";
		mes "�m�F�����Ă��������B";
		mes "�ǂ�ɃG���`�����g���{���܂����H";
		next;
		for('@i = 0; '@i < getarraysize('@itemid); '@i++) {
			if(getequipid(7) == '@itemid['@i])
				set '@id[0],'@itemid['@i];
			if(getequipid(8) == '@itemid['@i])
				set '@id[1],'@itemid['@i];
		}
		if('@id[0] == 0 && '@id[1] == 0) {
			mes "^ff0000�G���`�����g�Ώۂ̃A�C�e����";
			mes "�������Ă��܂���B";
			close;
		}
		if('@id[0] > 0)
			set '@menu$[0],getitemname('@id[0]);
		if('@id[1] > 0)
			set '@menu$[1],getitemname('@id[1]);
		set '@pos,select('@menu$[0],'@menu$[1]) + 6;
		break;
	case 3:	// ��������
		mes "[�G���b�g]";
		mes "�����u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��";
		mes "��ɓ���āA�O���C�E���t�V���[�Y��";
		mes "�G���`�����g���{�������Ȃ�����";
		mes "�܂����̏��܂ŗ��Ă��������B";
		close;
	}
	set '@refine,getequiprefinerycnt('@pos,20);
	set '@nameid,getequipid('@pos);
	set '@card[0],getequipcardid('@pos,0);
	set '@card[1],getequipcardid('@pos,1);
	set '@card[2],getequipcardid('@pos,2);
	set '@card[3],getequipcardid('@pos,3);
	mes "[�G���b�g]";
	mes "�u^0000ff<ITEM>"+ getitemname('@nameid) +"["+ getiteminfo('@nameid,10) +"]<INFO>"+ '@nameid +"</INFO></ITEM>^000000�v�ł��ˁB";
	mes "�ǂ̃X���b�g�ɍs���܂����H";
	mes "�@";
	mes "^0000ff<���݂̃G���`�����g>^000000";
	if('@card[1] > 0)
		mes "��2�X���b�g : <ITEM>"+ getitemname('@card[1]) +"<INFO>"+ '@card[1] +"</INFO></ITEM>";
	else
		mes "��2�X���b�g : �G���`�����g����";
	if('@card[2] > 0)
		mes "��3�X���b�g : <ITEM>"+ getitemname('@card[2]) +"<INFO>"+ '@card[2] +"</INFO></ITEM>";
	else
		mes "��3�X���b�g : �G���`�����g����";
	if('@card[3] > 0)
		mes "��4�X���b�g : <ITEM>"+ getitemname('@card[3]) +"<INFO>"+ '@card[3] +"</INFO></ITEM>";
	else
		mes "��4�X���b�g : �G���`�����g����";
	next;
	set '@slot,select("��2�X���b�g","��3�X���b�g","��4�X���b�g");
	if('@ref > 0)
		set '@ref,10 - '@slot;
	if('@refine < '@ref) {
		mes "^ff0000�G���`�����g�ɕK�v��";
		mes "���B�l���s�����Ă��܂��B";
		close;
	}
	set '@view_slot,'@slot+1;
	switch('@pos) {
	case 1:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310600,310572;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310506,310507,310567,310568,310600,310572;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310506,310507,310515,310568,310600,310572;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 2:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310597,310598;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310496,310497,310600;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515,310568,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 5:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310597,310598;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310571,310600;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515,310568,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 6:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310597,310598;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310572,310600;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515,310568,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	case 7:
	case 8:
		if('@slot == 1) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310506,310507;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 2) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310567;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5;
		} else if('@slot == 3) {
			setarray '@ench,310478,310479,310480,310481,310482,310483,310484,310485,310486,310487,310488,310489,310515;
			setarray '@list,   500,   500,   500,   500,   500,   500,     5,     5,     5,     5,     5,     5,     5;
		}
		break;
	default:
		mes "�s���ȃG���[";
		close;
	}
	for('@j=0; '@j < getarraysize('@list); '@j++) {
		set '@m_rate,'@m_rate + '@list['@j];
		if('@j > 0)
			set '@rate['@j],'@list['@j] + '@rate['@j-1];
		else
			set '@rate['@j],'@list['@j];
	}
	mes "[�G���b�g]";
	mes "�m�F���܂����B������̓��e��";
	mes "�G���`�����g���ėǂ��ł����H";
	mes "�@";
	mes "^0000ff<�G���`�����g�ɕK�v�ȃA�C�e��>^000000";
	mes "<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM> 1��";
	mes "�@";
	mes "^0000ff<�G���`�����g�Ώ�>^000000";
	mes "<ITEM>"+ getitemname('@nameid) +"["+ getiteminfo('@nameid,10) +"]<INFO>"+ '@nameid +"</INFO></ITEM>";
	mes "�@";
	mes "^0000ff<���݂̃G���`�����g>^000000";
	if('@card['@slot] > 0)
		mes "��"+ '@view_slot +"�X���b�g : <ITEM>"+ getitemname('@card['@slot]) +"<INFO>"+ '@card['@slot] +"</INFO></ITEM>";
	else
		mes "��"+ '@view_slot +"�X���b�g : �G���`�����g����";
	next;
	while(1) {
		switch(select("�����l����","������","�͂�","�w�肵���G���`�����g���t���܂Ŏ��s")) {
		case 1:
			continue;
		case 2:
			mes "[�G���b�g]";
			mes "�����u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��";
			mes "��ɓ���āA�O���C�E���t�V���[�Y��";
			mes "�G���`�����g���{�������Ȃ�����";
			mes "�܂����̏��܂ŗ��Ă��������B";
			close;
		case 3:
			if(countitem(1000405) < 1) {
				mes "^ff0000�G���`�����g�ɕK�v�ȃA�C�e����";
				mes "�s�����Ă��܂��B";
				close;
			}
			delitem 1000405,1;
			set '@r,rand('@m_rate);
			for('@j=0; '@j < getarraysize('@list); '@j++) {
				if('@r < '@rate['@j])
					break;
			}
			setequipcardid '@pos,'@slot,'@ench['@j],2;
			misceffect 589,"";
			misceffect 729,"";
			misceffect 847,"";
			mes "[�G���b�g]";
			mes "�c�c�ӂ��A�����ł��B";
			mes "�܂������p�̍ۂ�";
			mes "�u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��������";
			mes "���̏��܂ŗ��Ă��������B";
			close;
		case 4:
			if(countitem(1000405) < 1) {
				mes "^ff0000�G���`�����g�ɕK�v�ȃA�C�e����";
				mes "�s�����Ă��܂��B";
				close;
			}
			mes "�t�^����G���`�����g��";
			mes "�I�����Ă��������B";
			mes "�@";
			mes "^0000ff<���݂̃G���`�����g>^000000";
			if('@card['@slot] > 0)
				mes "��"+ '@view_slot +"�X���b�g : <ITEM>"+ getitemname('@card['@slot]) +"<INFO>"+ '@card['@slot] +"</INFO></ITEM>";
			else
				mes "��"+ '@view_slot +"�X���b�g : �G���`�����g����";
			next;
			set '@menu_max,getarraysize('@ench);
			for('@j=0; '@j < getarraysize('@ench); '@j++) {
				if('@j < 9)
					set '@emenu1$['@j],getitemname('@ench['@j]);
				else
					set '@emenu2$['@j-9],getitemname('@ench['@j]);
			}
			set '@emenu1$[9],"���̃y�[�W";
			set '@emenu2$['@menu_max-9],"��߂�";
			set '@need,select(printarray('@emenu1$)) - 1;
			if('@need == 9) {
				mes "�t�^����G���`�����g��";
				mes "�I�����Ă��������B";
				mes "�@";
				mes "^0000ff<���݂̃G���`�����g>^000000";
				if('@card['@slot] > 0)
					mes "��"+ '@view_slot +"�X���b�g : <ITEM>"+ getitemname('@card['@slot]) +"<INFO>"+ '@card['@slot] +"</INFO></ITEM>";
				else
					mes "��"+ '@view_slot +"�X���b�g : �G���`�����g����";
				next;
				set '@need,select(printarray('@emenu2$)) + 8;
				if('@need == '@menu_max) {
					mes "[�G���b�g]";
					mes "�����u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��";
					mes "��ɓ���āA�O���C�E���t�V���[�Y��";
					mes "�G���`�����g���{�������Ȃ�����";
					mes "�܂����̏��܂ŗ��Ă��������B";
					close;
				}
			}
			set '@tryid,'@ench['@need];
			mes "�G���`�����g���ʂ�";
			mes "�u^0000ff<ITEM>"+ getitemname('@tryid) +"<INFO>"+ '@tryid +"</INFO></ITEM>^000000�v�ɂȂ�܂�";
			mes "�A�����Ď��s���܂��B";
			mes "��낵���ł����H";
			mes "�@";
			mes "^ff0000���K�v�ȃA�C�e����S�ėa����A";
			mes "�w�肵���G���`�����g���t�^���ꂽ���_��";
			mes "�c��̃A�C�e�������Ԃ��������܂��B";
			mes "�@";
			mes "���K�v�A�C�e���������Ȃ�܂�";
			mes "�A�����Ď��s���܂��B";
			mes "�@";
			mes "���K�v�A�C�e����S�ď���Ă�";
			mes "�I�񂾃G���`�����g��";
			mes "�t�^����Ȃ������ꍇ��";
			mes "�Ō�ɍs�����G���`�����g��";
			mes "���e�������ɕt�^����܂��B";
			mes "�@";
			mes "�������e�i���X��A�T�[�o�[�Ƃ̐ڑ���";
			mes "�ؒf�����Ȃǂ̃g���u����";
			mes "���������ꍇ�A�c��̃A�C�e����";
			mes "���Ԃ��ł��Ȃ��ꍇ������܂��B";
			mes "�\�߂������������B";
			next;
			while(1) {
				switch(select("�����l����","������","�͂�")) {
				case 1:
					continue;
				case 2:
					mes "[�G���b�g]";
					mes "�����u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��";
					mes "��ɓ���āA�O���C�E���t�V���[�Y��";
					mes "�G���`�����g���{�������Ȃ�����";
					mes "�܂����̏��܂ŗ��Ă��������B";
					close;
				case 3:
					set '@max,countitem(1000405);
					if('@max > 2000)
						set '@max,2000;
					delitem 1000405,'@max;
					for('@t = 1; '@t < '@max; '@t++) {
						set '@r,rand('@m_rate);
						for('@j=0; '@j < getarraysize('@list); '@j++) {
							if('@r < '@rate['@j])
								break;
						}
						if('@ench['@j] == '@tryid)
							break;
					}
					if('@t < '@max) {
						set '@amount,'@max - '@t;
						if('@amount > 0)
							getitem 1000405,'@amount;
					}
					setequipcardid '@pos,'@slot,'@ench['@j],2;
					misceffect 589,"";
					misceffect 729,"";
					misceffect 847,"";
					mes "<�G���`�����g����>";
					mes "���{���� : <ITEM>"+ getitemname('@ench['@j]) +"<INFO>"+ '@ench['@j] +"</INFO></ITEM>";
					mes "���{�� :"+ '@t +"";
					next;
					mes "[�G���b�g]";
					mes "�c�c�ӂ��A�����ł��B";
					mes "�܂������p�̍ۂ�";
					mes "�u<ITEM>�A���W�X�g�̌���<INFO>1000405</INFO></ITEM>�v��������";
					mes "���̏��܂ŗ��Ă��������B";
					close;
				}
			}
			close;
		}
	}
	close;
OnInit:
	setnpcgroup 1016;
	setnpctitle "[�O���C�E���t����]";
	end;
}
wolfvill.gat,170,131,3	script	�o���_�b�h#wolfvill	10394,{
	end;
OnInit:
	setnpcgroup 1016;
	setnpctitle "[�t�B�f�X�쐬�E����]";
	end;
}
