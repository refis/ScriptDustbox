// EP19_1QUE
// �D�F�T�̑�(wolfvill.gat): 143 126

//============================================================
// ���b�̒n�N�G�X�gNPC
//- Registry -------------------------------------------------
// EP19_1QUE -> 0�`
//------------------------------------------------------------
wolfvill.gat,223,83,0	script	#ep19ev_wv	139,14,14,{/* 2496 */
OnTouch:
	if(BaseLevel >= 220 && EP18_1QUE >= 100)
		cloakoffnpc "�l�����肪�����Z��#ep19";
	end;
}

wolfvill.gat,223,83,3	script	�l�����肪�����Z��#ep19	10398,{/* 2497 */
	switch(EP19_1QUE) {
	case 0:
		if(BaseLevel < 220 || EP18_1QUE < 100) {
			// anti
			end;
		}
		mes "[�l�����肪�����Z��]";
		mes "���Ȃ��A������Ƒ҂��Ă����H";
		mes "�}�������T���Ă�����B";
		mes "�����A��Ă��邩��҂��ĂāB";
		next;
		mes "[�l�����肪�����Z��]";
		mes "���������΁A�}�������l�`��";
		mes "��b���Ă�������񂾂���";
		mes "���Ȃ����������Ƃ��ĂȂ������H";
		mes "�݂�Ȃ��������";
		mes "�X�g���X�������Ă�́H";
		next;
		cloakoffnpc "�}����#ep19maram01";
		unittalk getnpcid(0,"�}����#ep19maram01"),"�}���� : ���҂������܂����I";
		mes "[�l�����肪�����Z��]";
		mes "���A�}�����������݂����B";
		next;
		mes "[�}����]";
		mes "��Ă悩�����ł��B";
		mes "���������āA�҂����Ă��܂��܂������H";
		cutin "ep18_maram_01.png", 2;
		next;
		menu "�l�`�Ɖ�b���Ă����́H",-;
		mes "[�}����]";
		mes "���͂͂́A�����ł��ˁB";
		mes "�l�`�Ƃ��b���Ă��܂����B";
		mes "�ł��A���̐l�`��";
		mes "�u�X�}�[�g�G���[�v�ł���B";
		cutin "ep18_maram_02.png", 2;
		next;
		cloakoffnpc "�~���A��#ep19miriam01";
		cloakoffnpc "�X�A�h#ep19suad01";
		mes "[�~���A��]";
		mes "�{�N�������W�߂����R��";
		mes "�����ė~�����񂾂��ǁH";
		cutin "ep18_miriam_01.png", 0;
		next;
		mes "[�X�A�h]";
		mes "��Z�ɗ��ށB";
		mes "�j���G���l�ɂ��Ă΂�Ă���񂾁B";
		cutin "ep18_suad_01.png", 0;
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�S���������݂�����������������B";
		mes "�������l�`�̃X�}�[�g�G���[��";
		mes "�X�̎q�������Ɉē�������";
		mes "���w���̐_�a�ɗ�����ł��B";
		next;
		mes "[�}����]";
		mes "�X�}�[�g�G���[�́A���̎����̌�";
		mes "�o�S�b�g�����������Ǝv����";
		mes "�u�C�X�K���h�v�ɍs�����߂̕��@��";
		mes "�T���Ă��������ł���";
		mes "����ɂ��Đi�W�������������ł��B";
		next;
		mes "[�}����]";
		mes "���̂��Ƃ�`���җl�ɂ��`���ė~������";
		mes "����ꂽ�̂�";
		mes "�݂�ȂɏW�܂��Ă��炢�܂����B";
		next;
		mes "[�~���A��]";
		mes "�C�X�K���h�ɍs�����Ƃ��ł����";
		mes "�D��ꂽ���~���̐S���̌��Ђ�";
		mes "���߂���c�c�I";
		cutin "ep18_miriam_01.png", 0;
		next;
		mes "[�X�A�h]";
		cutin "ep18_suad_01.png", 0;
		mes "�C�X�K���h�ɍs�����߂ɂ�";
		mes "�ǂ�����Ηǂ��񂾁H";
		mes "�c�c�C���V�I���̓z��ɂ͎؂肪����B";
		next;
		mes "[�~���A��]";
		mes "�܂����A�X�A�h�B";
		mes "�C�X�K���h�ɏ�荞�ނ���H";
		mes "����́A�_������B";
		mes "�_�a�Ƃ̘b�������͒N�����́H";
		cutin "ep18_miriam_01.png", 0;
		next;
		mes "[�X�A�h]";
		mes "�c�c�c�c�B";
		cutin "ep18_suad_01.png", 0;
		next;
		mes "[�}����]";
		mes "�X�A�h�̋C�������킩�邯��";
		mes "���͍��A�X�A�h��M����";
		mes "��c�̒������s���Ă���B";
		mes "�����͎��ƃ~���A���A";
		mes "����ɖ`���җl�ɔC���ė~�����B";
		cutin "ep18_maram_01.png", 2;
		next;
		mes "[�X�A�h]";
		mes "�c�c�C�ɓ���Ȃ����A�d�����Ȃ��B";
		mes "���O�����ɔC����B";
		cutin "ep18_suad_01.png", 0;
		next;
		mes "[�~���A��]";
		mes "����ŁA�{�N�����͂ǂ�����Ηǂ��́H";
		cutin "ep18_miriam_01.png", 0;
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�X�}�[�g�G���[�����";
		mes "�o�������g�@�̖{�قɗ��ė~������";
		mes "�����Ă��܂��B";
		mes "�`���җl�A�\���󂠂�܂���";
		mes "�ē����Ă��������܂��񂩁H";
		next;
		cutin "ep18_miriam_01.png", 255;
		setquest 18119;, showevent 0, 1, �X�}�[�g�G���[#ep19_000;	// 5565: 26, 266
		set EP19_1QUE,1;
		mes "�]�o�������g�@�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�o�������g�@�֌��������]";
		close2;
		warp "ba_in01.gat", 26, 266;
		end;
	case 1:
		mes "[�l�����肪�����Z��]";
		mes "�}���������Ƃǂ�����";
		mes "�o������񂶂�Ȃ������́H";
		mes "�@";
		mes "�]�o�������g�@�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�o�������g�@�֌��������]";
		close2;
		warp "ba_in01.gat", 26, 266;
		end;
	default:
		mes "[�l�����肪�����Z��]";
		mes "���Ȃ��̂��Ƃ͗ǂ��m���Ă��B";
		mes "���̑��̂��߂�";
		mes "���낢�����Ă���Ă��肪�Ƃ��I";
		close;
	}
OnInit:
	cloakonnpc;
//	if(BaseLevel >= 220 && EP18_1QUE >= 100)
//		//showevent 0, 1, �l�����肪�����Z��#ep19;	// 2497: 223, 83
	end;
}

wolfvill.gat,220,85,3	script	�}����#ep19maram01	10376,{/* 2498 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,216,85,5	script	�~���A��#ep19miriam01	10377,{/* 2499 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	if(EP19_1QUE == 0) {
		mes "�}�����̘b�𕷂��܂��傤�B";
		mes "�����厖�ȗp������݂����ł��B";
	}
	else if(EP19_1QUE == 1) {
		mes "�{�N���ꏏ�ɍs���܂��B";
		mes "���~���̐S���̌��Ђ����߂��Ȃ��ƁB";
	}
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
wolfvill.gat,213,84,5	script	�X�A�h#ep19suad01	10378,{/* 2500 (cloaking)*/
	cutin "ep18_suad_01.png", 0;
	mes "[�X�A�h]";
	if(EP19_1QUE == 0) {
		mes "�܂��̓}�����̘b�𕷂����B";
	}
	else if(EP19_1QUE == 1) {
		mes "�C���V�I���̓z��ɂ͎؂肪���邪";
		mes "���ɂ͂��˂΂Ȃ�񂱂Ƃ�����B";
		mes "�c�O�����A�d�����Ȃ��ȁc�c�B";
	}
	close2;
	cutin "ep18_suad_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

//ba_in01.gat,26,266,3	script	�X�}�[�g�G���[#ep172_el	10354,{/* 5249 */}
//ba_in01.gat,26,266,3	script	�X�}�[�g�G���[#ep18ely0	10354,{/* 5553 (cloaking)*/}
ba_in01.gat,26,266,0	script	#ep18w11_147	139,14,14,{/* 5564 */
	switch(EP19_1QUE) {
	case 0:	// ������
		end;
	default:
		cloakonnpc "�X�}�[�g�G���[#ep172_el";
		cloakonnpc "�X�}�[�g�G���[#ep18ely0";
		cloakoffnpc "�X�}�[�g�G���[#ep19_000";
		cloakoffnpc "�W���W���[#ep19gg02";
		end;
	}
}

ba_in01.gat,26,266,3	script	�X�}�[�g�G���[#ep19_000	10354,{/* 5565 (cloaking)*/
	switch(EP19_1QUE) {
	case 1:
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "�ǂ��j���[�X�����`���ł��܂��B";
		mes "�Q�X�g�̊F�l�������łł��̂�";
		mes "�{�ق̉��ڎ��ɂ��ē��������܂��B";
		mes "�����Ɉē��������܂��傤���H";
		next;
		cutin "ep172_beta.bmp", 255;
		delquest 18119;
		setquest 130460;	//showevent 0, 1, #ep172_in01_in;	// 5331: 197, 279 showevent 0, 1, �X�}�[�g�G���[#ep19_000;	// 5565: 26, 266
		set EP19_1QUE,2;
		mes "�]���̖ړI�n�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̖ړI�n�֌��������]";
		close2;
		warp "ba_in01.gat", 375, 102;
		end;
	case 2:
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "�ǂ��j���[�X�����`���ł��܂��B";
		mes "�Q�X�g�̊F�l�������łł��̂�";
		mes "�{�ق̉��ڎ��ɂ��ē��������܂��B";
		mes "�����Ɉē��������܂��傤���H";
		mes "�@";
		mes "�]���̖ړI�n�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̖ړI�n�֌��������]";
		close2;
		warp "ba_in01.gat", 375, 102;
		end;
	default:
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "���ꂩ��̓W���W���[��";
		mes "�F��������ē��������܂��B";
		mes "�W���W���[�͗D�G�ȃi�r�Q�[�^�[�Ȃ̂�";
		mes "�F����̏����ɂȂ�͂��ł��B";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,375,102,0	script	#ep19evt01	139,14,14,{/* 5566 */
	switch(EP19_1QUE) {
	case 2:
	case 3:
		cloakoffnpc "�X�}�[�g�G���[#ep19elly";
		cloakoffnpc "���C�W�[#ep19lazy01";
		cloakoffnpc "�N���b�N�X#ep19crux01";
		cloakoffnpc "�~���A��#ep19miriam02";
		cloakoffnpc "�}����#ep19maram02";
		end;
	case 4:
		cloakoffnpc "�N���b�N�X#ep19crux01";
		end;
	case 5:
		end;
	}
	end;
}

ba_in01.gat,384,114,4	script	�X�}�[�g�G���[#ep19elly	10354,{/* 5567 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "�悭�����ł��������܂����B";
		mes "�Q�X�g�̕��X�ɂ�";
		mes "���̕�������������Ă��������܂����B";
		next;
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[�N���b�N�X]";
		mes "�����������Ă���܂��B";
		mes "���[���~�b�h�K�b�c�����̎҂Ƃ���";
		mes "����A���ɗ����܂�";
		mes "���b�𕷂����Ă��������܂����B";
		next;
		cutin "16lei_01.bmp", 0;
		mes "[���C�W�[]";
		mes "���w���ő�ςȎ����������񂾂��āH";
		mes strcharinfo(0)+"�̊����";
		mes "�������Ă��������B";
		mes "�����ɘA���W�ɂȂ��ėǂ������I";
		mes "���w������̂��q�l�Ƃ�";
		mes "���m�荇���ɂȂꂽ���I";
		next;
		mes "[���C�W�[]";
		mes "���w���̂������";
		mes "�W���m�[�ɂ͍s���܂������H";
		mes "��s�D�ɏ�芷����ۂ�";
		mes "����������H";
		mes "�Ȃ�A������x�s���Ȃ��ƁI";
		mes "���Ѝs���Ă������`���I";
		next;
		mes "[�}����]";
		mes "�͂͂͂��A���C�W�[�����";
		mes "�����ȕ��ł��ˁB";
		mes "���ɃW���m�[��K���ۂ�";
		mes "���Д����������X�������Ă��������B";
		cutin "ep18_maram_02.png", 2;
		next;
		mes "[�~���A��]";
		cutin "ep18_miriam_01.png", 0;
		mes "�c�c�����畷�����b�ɂ���";
		mes "�o�S�b�g�����ɂ�";
		mes "���Ԃ�����Ƃ̂��Ƃł����B";
		mes "���w�����瓦�S������";
		mes "���̒��Ԃƍ�������͂��ł��B";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[���C�W�[]";
		mes "�C���V�I���ƃn�[�g�n���^�[���s�l��";
		mes "�匫�҂̌䉮�~����D������s�D��";
		mes "�k�Ɂc�c�܂�u�C�X�K���h�v��";
		mes "�����������Ęb�������H";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "�����ł��B";
		mes "�ނ�́u���������K���h�v�ɂ�";
		mes "���y���Ă����Ƃ̂��Ƃł��B";
		mes "���������K���h�Ɋւ��n��";
		mes "�k�̑嗤�C�X�K���h�����ł��B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "�������A�C���V�I��������������";
		mes "����l�l�̃R���N�V����3���c�c";
		mes "�������u��s�D���C��1���v��";
		mes "�C�X�K���h�ւ̍q�s�L�^�̂���";
		mes "��s�D�ł����B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�o�S�b�g�����̓��w���ɗ���O����";
		mes "�C�X�K���h�ɍs�����Ƃ�";
		mes "�v�悵�Ă����̂��ȁH";
		next;
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "���̉\���������ł��A�V�������q�l�B";
		mes "�C���V�I���͔�s�D�ɕۑ�����Ă���";
		mes "�q�H�𔭌���";
		mes "�v��ɑg�ݍ��񂾂��̂Ɛ��肳��܂��B";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "����܂ł̍q�s�o�H�𒲂ׂ��Ƃ���";
		mes "�~�b�h�K���h�嗤�̂����������o�R��";
		mes "�ŏI�I�ɖk�Ɍ����������Ƃ�";
		mes "�m�F����Ă��܂��B";
		close2;
		cloakoffnpc "�W���W���[#ep19gg02";
		unittalk getnpcid(0,"�W���W���[#ep19gg02"),"�W���W���[ : �񍐂������܂��B���킾��I";
		if(!sleep2(1000)) end;
		mes "[�X�}�[�g�G���[]";
		mes "���傤�ǂ悢�^�C�~���O��";
		mes "�o�ꂵ�܂����ˁB";
		mes "�W���W���[���e�X�g��s�̌��ʂ�";
		mes "���`�����܂��B";
		cutin "ep172_beta.bmp", 2;
		next;
		mes "[�W���W���[]";
		cutin "ep172_beta.bmp", 0;
		mes "���A�ʐM�ŕ񍐂�������Ȃ��H";
		mes "�e�X�g��s�͐���I";
		mes "�C�X�K���h�𕢂���ǂ������Ċm�F�I";
		mes "�������A�N���͕s�I";
		next;
		mes "[�W���W���[]";
		mes "���A����ƁA��Ǖt�߂Ń��C��1����";
		mes "���Ղ��m�F�I";
		mes "����ɂ��Ă��A����l�l��";
		mes "�ǂ�����ăC�X�K���h�̏�ǂ𔲂���";
		mes "�~�b�h�K���h�嗤�Ɖ������Ă��񂾂�H";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[���C�W�[]";
		mes "�o�������g�l�͑匫�҂Ȃ񂾂���";
		mes "�������ʂȕ��@���g���Ă��񂶂�Ȃ��H";
		mes "�Ⴆ�΁A���~���̐S���̌��Ђ̗͂�";
		mes "�g���Ă����Ƃ��B";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[�N���b�N�X]";
		mes "���̌��ɂ��Ă�";
		mes "���[���~�b�h�K�b�c���Ƃ̕��X��";
		mes "���������߂�̂͂������ł��傤���H";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[���C�W�[]";
		mes "���[���~�b�h�K�b�c�̉��ƁH";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[�N���b�N�X]";
		mes "���[���~�b�h�K�b�c�̌����Ɋւ���";
		mes "���������K���h�Ƃ͈���������̂ł��B";
		next;
		mes "[�}����]";
		mes "�i��オ�����Ă���ꂽ";
		mes "�@�u���������K���h�̎􂢁v�̂��Ƃ��j";
		cutin "ep18_maram_01.png", 2;
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[�N���b�N�X]";
		mes "���́A�Q�I���O�Ƃ̕��X��";
		mes "���������K���h�̎􂢂��������邽��";
		mes "�k���̒n��K��Ă���ƕ����Ă��܂��B";
		mes "���̖k���̒n�Ƃ́A";
		mes "�C�X�K���h�̂��Ƃł͂Ȃ����ƁB";
		next;
		cutin "ep172_beta.bmp", 0;
		mes "[�X�}�[�g�G���[]";
		mes "���̘b���m���Ȃ�";
		mes "�Q�I���O�Ƃ̕��X��";
		mes "�C�X�K���h�̏�ǂ��z������@��";
		mes "�m���Ă���Ƃ������Ƃł��ˁH";
		next;
		mes "[�X�}�[�g�G���[]";
		mes "���B�́A�C�X�K���h�Ɍ��������߂�";
		mes "��s�D�̏����͂ł��Ă��܂��B";
		mes "�c����͏�ǂ��z������@�̂݁B";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[���C�W�[]";
		mes "�N���b�N�X�I";
		mes "���������b��";
		mes "�����Ƒ������Ă���Ȃ��Ɓ`�I";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[�N���b�N�X]";
		mes "�c�c���ƂɂƂ��Ă�";
		mes "�G��ɂ����b�Ȃ�ł��B";
		mes "�@���Ă��������܂��񂩁H";
		next;
		cutin "16lei_01.bmp", 1;
		mes "[���C�W�[]";
		mes "�ł́A�������悤�B";
		mes strcharinfo(0)+" ��";
		mes "�N���b�N�X�Ƌ��Ƀv�����e���֍s����";
		mes "��ǂ��z������@�𕷂��Ă���B";
		mes "���l�ƒ����ǂ��񂾂���B";
		next;
		mes "[���C�W�[]";
		mes "�X�}�[�g�G���[�ƃW���W���[�ɂ�";
		mes "��s�D�𐮔����Ă������";
		mes "���̓��w������̂��q�l�����ƈꏏ��";
		mes "���s�̏��������Ă������B";
		next;
		mes "[�}����]";
		mes "���ꂪ�ǂ������ł��B";
		mes "�A���i�x���c�̐l�Ԃ�";
		mes "���[���~�b�h�K�b�c�����ɓ���ɂ�";
		mes "�葱�����ώG�ł�����B";
		cutin "ep18_maram_01.png", 2;
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "����B";
		mes "�����̓{�N�����ɔC���āB";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[�N���b�N�X]";
		mes "���Ƃւ̎掟����";
		mes "���������Ă��������܂��B";
		mes "�v�����e���ɍs���������ł�����";
		mes "���ɐ����|���Ă��������B";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		set EP19_1QUE,3;
		delquest 130460;
		setquest 18120;	//showevent 9999, 0, �X�}�[�g�G���[#ep19elly;	// 5567: 384, 114 showevent 0, 1, �N���b�N�X#ep19crux01;	// 5569: 386, 110
		end;
	case 3:
		cutin "ep172_beta.bmp", 2;
		mes "[�X�}�[�g�G���[]";
		mes "����ł͊e���̎d����";
		mes "���|����܂��傤�B";
		mes "���ƃW���W���[�́A��s�D�̓_����";
		mes "�o�H�̊m�F���s���܂��B";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,386,113,3	script	���C�W�[#ep19lazy01	10179,{/* 5568 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "16lei_01.bmp", 2;
		mes "[���C�W�[]";
		mes "���w���͂ǂ��������H";
		mes "�����͖����Ǝv������";
		mes "����ς�A�W���m�[���ō�����ȁH";
		close2;
		cutin "16lei_01.bmp", 255;
		end;
	case 3:
		cutin "16lei_01.bmp", 2;
		mes "[���C�W�[]";
		mes "�������Ƃ���ɂ��ƃ��e�B�G����";
		mes "����ɖk�ɍs���炵���B";
		mes "������������������ȁH";
		next;
		mes "[���C�W�[]";
		mes "�v�����e���ɍs���Ă�����Ă�Ԃ�";
		mes "�����ł����Ă������B";
		mes "���w���̂��q�l�������ē�������ł�";
		mes "���q�^���[���̕S�ݓX�ɍs���Ȃ���B";
		close2;
		cutin "16lei_01.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,386,110,3	script	�N���b�N�X#ep19crux01	10118,{/* 5569 (cloaking)*/
	if(EP19_1QUE == 2) {
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[�N���b�N�X]";
		mes "���v���Ԃ�ł��B";
		mes "�X�s�[�J�l�A�X�L�A�l�����";
		mes "��낵���`���ė~������";
		mes "�`����a�����Ă���܂��B";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
	cutin "ep16_crux_findel02.bmp", 1;
	mes "[�N���b�N�X]";
	mes "�ł̓v�����e�����{��";
	mes "�Q��܂��傤���B";
	next;
	if(select("�������s���܂��傤�I","������Ƒ҂��Ă�������") == 2) {
		mes "[�N���b�N�X]";
		mes "�������ł��܂�����";
		mes "���Ă��������B";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
	mes "[�N���b�N�X]";
	mes "�������܂�܂����B";
	mes "�ł́A�Q��܂��傤�B";
	close2;
	cutin "ep16_crux_findel02.bmp", 255;
	warp "prt_cas.gat", 146, 337;
	end;
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,386,107,3	script	�~���A��#ep19miriam02	10377,{/* 5570 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���̓@��A�����ł��ˁB";
		mes "�o�������g�Ƃ����l��";
		mes "�ǂ�Ȑl�������񂾂낤�H";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 3:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���C�W�[����ɃA�h�o�C�X���������";
		mes "�K�v�Ȃ��̂�p�ӂ��Ă����܂��B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_maison.gat,197,279,0	warp	#ep172_in01_in	2,2,ba_in01.gat,271,269	// 5331 from: ba_maison.gat(197, 279)

ba_in01.gat,383,104,1	script	�}����#ep19maram02	10376,{/* 5571 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����Ȑ����ꏊ�ɗ���̂�";
		mes "���܂�ď��߂Ăł��B";
		mes "�o�������g�l�ɂ��Ă�";
		mes "�X�}�[�g�G���[���������Ă܂�����";
		mes "�֒����Ă͂Ȃ������̂ł��ˁB";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 3:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���̏����͎������ɔC���Ă��������B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,380,111,7	script	�W���W���[#ep19gg02	10354,{/* 5572 (cloaking)*/
	switch(EP19_1QUE) {
	case 2:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "��s�D�C�t����S�����Ă���";
		mes "�W���W���[����I";
		mes "��낵�����肢���܂��B";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	case 3:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�e�X�g��s�͏����ł�����";
		mes "����I�Ȍo�H������o�����߂�";
		mes "�C�X�K���h�̏�ǂɋ߂Â������̏󋵂�";
		mes "������x�A���͂��Ă����܂��B";
		next;
		mes "[�W���W���[]";
		mes "�W���W���[�͖Z��������`�I";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,147,337,0	script	#ep19_evt02	139,3,3,{/* 5609 */
OnTouch:
	cloakonnpc "�N���b�N�X#ep19_2";
	if(EP19_1QUE == 3) {
		cloakoffnpc "�N���b�N�X#ep19_2";
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[�N���b�N�X]";
		mes "�y���̐\���͍ς܂��Ă���܂��B";
		mes "���ւ����肭�������B";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
	else if(EP19_1QUE == 4) {
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		//showevent 9999, 0, �j�[�q���E�n�C�l��#ep17;	// 5573: 325, 263
		//showevent 9999, 0, �N���b�N�X#ep19crux02;	// 5612: 320, 270
		//showevent 0, 1, �j�[�q��#ep19nh01;	// 5616: 331, 343
		//showevent 9999, 0, ���n�[��#ep19lehar02;	// 5617: 334, 342
	}
}
prt_cas.gat,149,331,4	script	�N���b�N�X#ep19_2	10118,{/* 5610 (cloaking)*/
	if(EP19_1QUE == 3) {
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[�N���b�N�X]";
		mes "�y���̐\���͍ς܂��Ă���܂��B";
		mes "���ւ����肭�������B";
		close2;
		cutin "ep16_crux_findel02.bmp", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,309,287,0	script	#ep19_evt03	139,3,3,{/* 5611 */
	if(EP19_1QUE == 3) {
		cloakoffnpc "�N���b�N�X#ep19crux02";
		cloakoffnpc "�L���T����#ep19c01";
		//showevent 9999, 0, �j�[�q��#ep19nh01;	// 5616: 331, 343
		//showevent 9999, 0, ���n�[��#ep19lehar02;	// 5617: 334, 342
	}
	else if(EP19_1QUE == 4) {
		cloakoffnpc "���n�[��#ep19lehar01";
	}
}

prt_cas.gat,320,270,4	script	�N���b�N�X#ep19crux02	10118,{/* 5612 (cloaking)*/
	switch(EP19_1QUE) {
	case 3:
		cutin "ep16_crux_findel02.bmp", 1;
		mes "[�N���b�N�X]";
		mes strcharinfo(0)+"�l��";
		mes "���A�ꂢ�����܂����B";
		next;
		cutin "ep171_nihil01.bmp", 2;
		mes "[�j�[�q��]";
		mes "�b�͕����Ă��܂��B";
		mes "�M���̖��ɗ��Ă鎞��";
		mes "�悤�₭�����悤�ł��ˁB";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[�L���T����]";
		mes "���������K���h�����󂳂ꂽ�n�ɂ���";
		mes "���ׂĂ�����ƕ����Ă��܂��B";
		mes "�{���ɂ��̒n�ɕ������Ƃ�";
		mes "���]�݂ł����H";
		next;
		menu "�͂��I",-;
		mes "[�L���T����]";
		mes "�Q�I���O�Ƃƃ��������K���h�̈����c�c";
		mes "���������K���h�̎􂢂ɂ��Ă�";
		mes "�����ɂ�������Ȃ�";
		mes "�m���Ă����邱�Ƃł��傤�B";
		mes "���������K���h�Ɉ�ԋ߂��҂�����";
		mes "�Q�I���O�Ƃ̎҂Ȃ̂ł��B";
		next;
		mes "[�L���T����]";
		mes "���������K���h����J����";
		mes "���������K���h���c��";
		mes "�����������킯�ł͂���܂���B";
		mes "�ނ��A���ɂ͂���Ă��܂��񂪁B";
		next;
		mes "[�L���T����]";
		mes "�ނ�͊C�̌�������";
		mes "�X�̒n�ɕ����߂��";
		mes "���m�̗͂ɂ����";
		mes "���̒n�ɕ��󂳂�܂����B";
		next;
		mes "[�L���T����]";
		mes "�����Ă����ɂ�";
		mes "��������u���ҁv�̕��X��";
		mes "������̂ł��B";
		next;
		menu "���ҁH",-;
		cutin "ep171_nihil01.bmp", 2;
		mes "[�j�[�q��]";
		mes "�c�c���������܂����B";
		mes "���ɑ��ʂ�����ɏ��߂�";
		mes "���̎�����`����ꂽ�̂ł��B";
		next;
		mes "[�j�[�q��]";
		mes "����ɋ����ׂ����Ƃ�";
		mes "�Q�I���O�Ƃ̈ꕔ�̕��X��";
		mes "���������K���h�����󂳂ꂽ�n�c�c";
		mes "�܂�u�C�X�K���h�v��";
		mes "�s�������Ă����邻���Ȃ̂ł��B";
		next;
		mes "[�j�[�q��]";
		mes "���̏�ɁA�L���T�����扤�ܓa����";
		mes "���Ă����������̂�";
		mes "��������������̂��߂Ȃ̂ł��B";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[�L���T����]";
		mes "�g���X�^���O���ɂ�";
		mes "�O�l�̎o������������Ⴂ�܂��B";
		mes "���̂����̂���l��";
		mes "�C�X�K���h�ɂ�����̂ł��B";
		mes "���������K���h�̎􂢂��������@��";
		mes "�T���o�����߂ɁB";
		next;
		mes "[�L���T����]";
		mes "�����̗��s�s�Ȏ����o������̂�";
		mes "�߂������Ƃł��B";
		mes "�ޏ��������C�X�K���h�ɕ��������R��";
		mes "�������Ă���������ł��傤�B";
		next;
		mes "[�L���T����]";
		mes "���傤�Ǎ��A�������Ă��܂��B";
		mes "���ۂɃC�X�K���h��";
		mes "�s�������Ă���҂ł��B";
		next;
		cutin "ep171_nihil01.bmp", 2;
		mes "[�j�[�q��]";
		mes "�����ɂ�����ɗ���悤��";
		mes "�`���Ă��܂��B";
		mes "���낻�뗈��ł��傤�B";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[�L���T����]";
		mes "�c�c���̔��̂��Ƃ�";
		mes "�������������m�邱�Ƃ��ł����";
		mes "������������c�c�B";
		next;
		cloakoffnpc "���n�[��#ep19lehar01";
		mes "[�H�H�H]";
		mes "�������T���ł����āH";
		mes "�����A�f��l����������Ⴂ�܂��ˁB";
		mes "�N���b�N�X������̂��I";
		mes "���ꂽ���̎�`���ŏ����x��܂����B";
		cutin "ep19_lehar02.png", 1;
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[�N���b�N�X]";
		mes "���v���Ԃ�ł��A�u^0000FF���n�[��^000000�v�l�B";
		mes "���ς�炸�A�����C������";
		mes "���S�������܂����B";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "�����A�������Ɓc�c";
		mes "�j�[�q���Z�c�c�a���c�c";
		mes "���⍑���H";
		mes "�����`��A�܂�����Ȃ��Ȃ��B";
		mes "�����ƁA�������ĂтɂȂ������R�́H";
		next;
		cutin "ep171_nihil02.bmp", 2;
		mes "[�j�[�q��]";
		mes "���ꂩ��C�X�K���h�Ɍ������Ǝv����";
		mes strcharinfo(0)+"�l��";
		mes "�����Ԃ̕��X���C�X�K���h��";
		mes "�ē����ė~�����B";
		next;
		cutin "ep19_lehar05.png", 1;
		mes "[���n�[��]";
		mes "�����������`�`��!?";
		mes "�閧����Ȃ�������ł���??";
		mes "����������Ă�����ł���!?!?";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[�L���T����]";
		mes "���������Ȃ����A���n�[���B";
		mes "���̕��́A�킯������";
		mes "�C�X�K���h�ɕ����K�v������̂ł��B";
		mes "�䗗�̒ʂ荑���É���";
		mes "�����Ă����܂��B";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "���A�����Ȃ̂ł��ˁB";
		mes "�c�c�ł́A�u���҂̔��v���g���܂��B";
		mes "�������������܂����H";
		next;
		cutin "ep171_nihil01.bmp", 2;
		mes "[�j�[�q��]";
		mes "������񂾁B";
		mes strcharinfo(0)+"�l�A";
		mes "�ׂ̕����ɗ��Ă��������B";
		mes "�u���҂̔��v�́A�����ɂ���܂��B";
		next;
		cutin "ep16gao_1.bmp", 0;
		mes "[�L���T����]";
		mes "���́A�������ɂ������܂��ˁB";
		mes strcharinfo(0)+"�l��";
		mes "��]���������Ƃ����F�肵�܂��B";
		mes "���n�[���A������";
		mes "��낵���Ɠ`���Ă����Ă��������B";
		next;
		cutin "ep16_crux_findel02.bmp", 0;
		mes "[�N���b�N�X]";
		mes "�扤�ܓa���́A�������ē��������܂��B";
		mes "����ł͎��炢�����܂��B";
		next;
		cloakonnpc "�N���b�N�X#ep19crux02";
		cloakonnpc "�L���T����#ep19c01";
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "���������ړ�����Ƃ��܂��傤�I";
		close2;
		cutin "ep19_lehar01.png", 255;
		delquest 18120;
		setquest 18121;
		set EP19_1QUE,4;
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		//showevent 9999, 0, �j�[�q���E�n�C�l��#ep17;	// 5573: 325, 263
		//showevent 9999, 0, �N���b�N�X#ep19crux02;	// 5612: 320, 270
		//showevent 0, 1, �j�[�q��#ep19nh01;	// 5616: 331, 343
		//showevent 9999, 0, ���n�[��#ep19lehar02;	// 5617: 334, 342
		end;
	}
OnInit:
	cloakonnpc;
	end;
}
prt_cas.gat,323,266,4	script	�L���T����#ep19c01	10121,{/* 5613 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
prt_cas.gat,317,266,6	script	���n�[��#ep19lehar01	10469,{/* 5614 (cloaking)*/
	switch(EP19_1QUE) {
	case 4:
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "�j�[�q���Z�c�c";
		mes "���A����A�����É��̂�������";
		mes "�s���܂��傤�I";
		mes "^ff0000�L���ɏo�ĉE��̉�^000000�ł��B";
		next;
		cutin "ep171_nihil02.bmp", 2;
		mes "[�j�[�q��]";
		mes "�����������̎���";
		mes "�j�[�q���Z�ŗǂ���B";
		mes "���O�́A���{���̐g����";
		mes "�����Ă͂��Ȃ�������B";
		next;
		cutin "ep19_lehar07.png", 0;
		mes "[���n�[��]";
		mes "�������Ƃ��Ă��ꂳ��ɂ�����";
		mes "�ق��ĂĂ��������B";
		mes "��V��@���ǂ��̂����̂���";
		mes "�{���ɂ��邳����ł�!!";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,331,343,0	script	#ep19_evt04	139,11,11,{/* 5615 */
	switch(EP19_1QUE) {
	case 4:
	case 5:
		cloakoffnpc "�j�[�q��#ep19nh01";
		cloakoffnpc "���n�[��#ep19lehar02";
		end;
	default:
		cloakonnpc "�j�[�q��#ep19nh01";
		cloakonnpc "���n�[��#ep19lehar02";
		end;
	}
}
prt_cas.gat,331,343,4	script	�j�[�q��#ep19nh01	10304,{/* 5616 (cloaking)*/
	switch(EP19_1QUE) {
	case 4:
		cutin "ep171_nihil01.bmp", 0;
		mes "[�j�[�q��]";
		mes "���̉��̕ϓN���Ȃ��{�Ɍ�������̂�";
		mes "�u���҂̔��v�ƌĂ΂����̂ł��B";
		mes "�\����̊W���J�����";
		mes "����������ɂȂ��Ă��܂��B";
		next;
		mes "[�j�[�q��]";
		mes "�����Ƃ̒��n�݂̂��g�p�ł��܂���";
		mes "���ƃ��n�[��������̂�";
		mes "�g�p�ł���͂��ł��B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�C�X�K���h�ɓ���ׂɂ�";
		mes "�u^4d4dff���ҏ�^000000�v���K�v�Ȃ�ł��B";
		mes "�������Ɓc�c�`���җl�̑���";
		mes "�����̕���������\��ł����H";
		next;
		menu "�l����`����",-;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���\�A�����ł��ˁc�c";
		mes "���ꂾ�Ɓu�w�����b�N�v�ɉ^���";
		mes "���炤�͓̂�����ł��B";
		mes "�C���z����K�v������܂���";
		mes "�D�œn���܂����H";
		next;
		menu "��s�D���g���\��ł�",-;
		mes "[���n�[��]";
		mes "��s�D�I�@�C�C�ł��ˁI";
		mes "�ł͏o���������߂�莆��";
		mes "�p�ӂ��܂��B";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "�]�����̈󂪉����ꂽ��������";
		mes "�@���n�[���������������n�߂��B";
		mes "�@�j�[�q�����ׂŏ������e�ɂ���";
		mes "�@�A�h�o�C�X���Ă���]";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�o���܂����I";
		mes "�ł͈�͂������āA���ɓ���܂��ˁB";
		mes "���Ƃ͏����҂ĂΗǂ��ł��B";
		next;
		cutin "ep171_nihil01.bmp", 0;
		mes "[�j�[�q��]";
		mes "�u���ҁv�̕�������";
		mes "�����C�t���Ă�������Ɨǂ��̂ł����B";
		next;
		menu "���̔��́A�ǂ��������̂Ȃ̂ł����H",-;
		mes "[�j�[�q��]";
		mes "���̔��͏���g���X�^���E�Q�I���O��";
		mes "�c���ꂽ���̂ł��B";
		mes "���㍑���̈����i�Ƃ���";
		mes "�����ɓ`����Ă��܂��B";
		next;
		mes "[�j�[�q��]";
		mes "���㍑���͂�����g����";
		mes "�莆�̂��������Ă���ꂽ��";
		mes "�`���ɂ͋L����Ă����̂ł���";
		mes "�Ȃ��炭�g�����͕s���ł����B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���ɂ𐮗����Ă�������l��";
		mes "�L�^�𒲂ׂĂ��鎞��";
		mes "���̔��̑��݂�m��";
		mes "�����Ɏ莆�����Ă݂������ł��B";
		next;
		mes "[���n�[��]";
		mes "����ƃr�b�N���I";
		mes "�C�X�K���h�ɂĕ�������";
		mes "�u���ҁv�ƌ�������X�����";
		mes "�ԓ��������ė�����ł���B";
		next;
		mes "[���n�[��]";
		mes "�ނ���҂̉�����h����";
		mes "�u���ҏ�v�����炤���Ƃ�";
		mes "�f��l�B�͏�ǂ��z��";
		mes "�C�X�K���h�ɑ؍݂ł���悤��";
		mes "�Ȃ����Ƃ����킯�ł��B";
		next;
		misceffect 55,"�{�̌`�̔�#ep19box01";
		misceffect 72,"�{�̌`�̔�#ep19box01";
		cutin "ep171_nihil01.bmp", 0;
		mes "[�j�[�q��]";
		mes "�c�c�ԓ������܂����ˁB";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�u���҂̏��ҏ�v�ł���I";
		mes "����Ǝ莆�ɂ́A�`���җl�����}�����";
		mes "������Ă��܂��B";
		mes "�o�������g�̔�s�D�͋v���Ԃ�Ƃ�";
		mes "������Ă��܂��ˁB";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "��s�D�̉^�q���Ǘ�����҂�";
		mes "���̏��ҏ��n���Ă�����";
		mes "�`���җl�����łȂ������Ԃ̕���";
		mes "�C�X�K���h�ɓ���܂��B";
		next;
		cutin "ep171_nihil01.bmp", 0;
		mes "[�j�[�q��]";
		mes "��肭�������悤�ł��ˁB";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "������s�D�ɏ���ėǂ��ł����H";
		mes "���A�C���@��吹���Ɋ���Ă���";
		mes "�����������܂��B";
		next;
		cutin "ep171_nihil01.bmp", 0;
		mes "[�j�[�q��]";
		mes "���n�[���B";
		mes "�o�������g�@�Ɍ������Ȃ�";
		mes "�N���b�N�X�Ɉē����Ă��炤�Ɨǂ��B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 18121;
		setquest 18122;
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		set EP19_1QUE,5;
		getitem 1000607,1;
		mes "[�j�[�q��]";
		mes strcharinfo(0)+"�l��";
		mes "���n�[���ƈꏏ�ɍs���Ă��������B";
		mes "�C�X�K���h���ē����Ă����ł��傤�B";
		mes "���ɂ��x�����K�v�Ȏ���";
		mes "���������Ɍ����Ă��������B";
		close2;
		//showevent 9999, 0, #ep172_main_evt04;	// 5571: 138, 342
		//showevent 9999, 0, �j�[�q���E�n�C�l��#ep17;	// 5573: 325, 263
		//showevent 9999, 0, �N���b�N�X#ep19crux02;	// 5612: 320, 270
		//showevent 9999, 0, �j�[�q��#ep19nh01;	// 5616: 331, 343
		//showevent 0, 1, ���n�[��#ep19lehar02;	// 5617: 334, 342
		cutin "ep171_nihil01.bmp", 255;
		end;
	case 5:
		cutin "ep171_nihil01.bmp", 0;
		mes "[�j�[�q��]";
		mes "�ǂ������C�����āB";
		mes "���n�[���̂��Ɓc�c";
		mes "��낵�����݂܂��B";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,334,342,3	script	���n�[��#ep19lehar02	10469,{/* 5617 (cloaking)*/
	switch(EP19_1QUE) {
	case 5:
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�u���҂̏��ҏ�v�������";
		mes "�C�X�K���h�ɓ����͂��ł��B";
		mes "�����Ƀo�������g�@�ɖ߂��܂����H";
		next;
		if(select("�o�������g�@�֖߂�","�܂�����") == 2) {
			mes "[���n�[��]";
			mes "�o�������g�@�ɖ߂��鎞��";
			mes "�����|���Ă��������ˁB";
			close2;
			cutin "ep19_lehar01.png", 255;
			end;
		}
		mes "[���n�[��]";
		mes "���͗p�����ς܂��Ă���";
		mes "�o�������g�̓@��Ɍ������܂��B";
		mes "��s�D�ɏ���Ȃ�Ċy���݂��Ȃ��I";
		close2;
		cutin "ep19_lehar01.png", 255;
		warp "ba_maison.gat", 187, 248;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_cas.gat,332,342,3	script	�{�̌`�̔�#ep19box01	844,{/* 5618 */
	unittalk getcharid(3),strcharinfo(0)+" : �{�̂悤�Ɍ����邪�A�莆��ۊǂ��邽�߂̔��炵��",1;
	end;
}

prt_cas.gat,146,330,0	warp	king_office_in_king_office_out	1,1,prt_cas.gat,309,288
prt_cas.gat,309,291,0	warp	king_office_in_king_office_in	1,1,prt_cas.gat,146,334
prt_cas.gat,174,342,0	warp	king_room_in_king_room_	1,1,prt_cas.gat,322,336	// 5456 from: prt_cas.gat(173, 342)
prt_cas.gat,318,336,0	warp	king_room_out_king_room	1,1,prt_cas.gat,170,342	// 5457 from: prt_cas.gat(319, 336)

prt_cas.gat,325,263,3	script	�j�[�q���E�n�C�l��#ep17	10304,{/* 5573 */
	switch(EP19_1QUE) {
	case 3:
		cutin "ep171_nihil01.bmp", 1;
		mes "[�j�[�q��]";
		mes "�悤�₭�A";
		mes "���Ȃ��ɗ͂�݂����Ƃ��ł��܂��ˁB";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	case 4:
		cutin "ep171_nihil01.bmp", 1;
		mes "[�j�[�q��]";
		mes "�L���ɏo�ĉE��̉��ɂ���";
		mes "���̌��ֈړ����܂��傤�B";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	case 5:
		cutin "ep171_nihil01.bmp", 1;
		mes "[�j�[�q��]";
		mes "���n�[������낵�����肢���܂��B";
		close2;
		cutin "ep171_nihil01.bmp", 255;
		end;
	}
}

ba_maison.gat,187,248,0	script	#ep19_evt05	139,14,14,{/* 5573 */
	switch(EP19_1QUE) {
	//case 0~4: //������
	case 5:
		cloakoffnpc "�W���W���[#ep19gg01_";
		end;
	}
}
ba_maison.gat,191,248,4	script	�W���W���[#ep19gg01_	10354,{/* 5574 (cloaking)*/
	switch(EP19_1QUE) {
	case 5:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�����A���傤�Ǘǂ������I";
		mes "��s�D�̏o�q������";
		mes "�����قǏI���������I";
		mes "���́A���̂��q�l�������߂��Ă���̂�";
		mes "�҂��Ă�Ƃ���B";
		next;
		cloakoffnpc "���C�W�[#ep19_evt05";
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���A�߂��ė����B";
		mes "������͗��s�ɕK�v�Ȃ��̂�";
		mes "�΂����蔃�������ė������B";
		next;
		cutin "ep18_maram_01.png", 2;
		cloakoffnpc "�}����#ep19_evt05";
		mes "[�}����]";
		mes "���������łȂ�";
		mes "����X�A�h�ւ̘A����";
		mes "�ς܂��ė��܂����B";
		next;
		cutin "ep18_miriam_01.png", 0;
		cloakoffnpc "�~���A��#ep19_evt05";
		mes "[�~���A��]";
		mes "���ł��o���ł��܂��B";
		mes strcharinfo(0)+"�l��";
		mes "�����͂������ł��H";
		next;
		menu "�u���҂̏��ҏ�v��������",-;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���̎��؂ꂪ�ʍs�����Ă킯�H";
		mes "�Ӂ`��A�u���ҏ�v�˂��B";
		mes "�Ȃ�A����ŏo���ł���ȁB";
		next;
		menu "������l�A�����\��ł�",-;
		cutin "ep19_lehar01.png", 1;
		cloakoffnpc "���n�[��#ep19_evt05";
		mes "[���n�[��]";
		mes strcharinfo(0)+"�l�I";
		mes "�x��Ă����܂���B";
		mes "�c�c�������ƁA���̕�������";
		mes "�ꏏ�ɃC�X�K���h�Ɍ��������X�ł��ˁH";
		next;
		mes "[���n�[��]";
		mes "�͂��߂܂���";
		mes "�u���n�[���v�Ɛ\���܂��B";
		mes "�C�X�K���h�܂ŊF�l���ē�����悤";
		mes "�����Ă��܂��B";
		mes "��낵�����肢���܂��ˁB";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���́u���C�W�[�v���B";
		mes "�Ƃ���ŁA�W���m�[�ɂ͍s�����H";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�͂��H";
		mes "�W���m�[�ł����H";
		mes "�������ƁA�W���m�[�Ŕ�s�D��";
		mes "��芷���܂����I";
		next;
		mes "[���n�[��]";
		mes "�c�c�Ƃ���ŁA��������";
		mes "�ꏏ�ɗ�������X�̒��Ɂc�c";
		mes "�����I�@����ς�I";
		mes "�x�[�����܂Ƃ������̒������̐l�I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�c�c�{�N�̂��ƁH";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�͂��I";
		mes "�f��l����b�͕����Ă��܂��B";
		mes "����ŃC�X�K���h�Ɍ����������o�[��";
		mes "�����܂����ˁB";
		next;
		cutin "ep172_beta.bmp", 1;
		mes "[�W���W���[]";
		mes "�ł́A���q�l���B";
		mes "�u��s�D������v�Ɉړ����܂���B";
		mes "�W���W���[�ɕt���Ă��邾��`�I";
		next;
		cutin "ep172_beta.bmp", 255;
		delquest 18122;
		setquest 18123;	//showevent 0, 1, �W���W���[#ep19gg01_;	// 5574: 191, 248 showevent 0, 1, �W���W���[#ep19gg01;	// 5579: 30, 264
		set EP19_1QUE,6;
		mes "�]���̖ړI�n�֌������܂����H�]";
		next;
		//showevent 9999, 0, �@��Ǘ��҃A���t�@#172n;	// 5168: 74, 150
		//showevent 9999, 0, �N���b�N�X#ep172_clx02;	// 5260: 38, 219
		//showevent 0, 3, �^�}����#1�������O;	// 5263: 70, 145
		//showevent 9999, 0, #ep172_lab2_in;	// 5306: 78, 146
		//showevent 0, 1, #ep172_proom2_in;	// 5315: 33, 225
		//showevent 9999, 0, #ep172_sroom1_in;	// 5317: 103, 323
		//showevent 0, 1, #ep172_in01_in;	// 5331: 197, 279
		//showevent 0, 1, #ep172_pw03_in;	// 5350: 88, 272
		//showevent 9999, 0, �j�h#jh_ba;	// 5369: 169, 270
		//showevent 9999, 0, �B��Ă��鎩���l�`#he_a;	// 5384: 120, 321
		//showevent 0, 1, �B��Ă��鎩���l�`#he_a;	// 5385: 120, 321
		//showevent 9999, 0, #�X�^�[�g;	// 5393: 200, 264
		//showevent 9999, 0, ��ȑ�#�ړ��p���[�v;	// 5396: 206, 267
		//showevent 0, 1, �G�E���p#eorpa;	// 5552: 79, 278
		//showevent 0, 1, �W���W���[#ep19gg01_;	// 5574: 191, 248
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̖ړI�n�֌��������]";
		close2;
		warp "ba_in01.gat", 28, 262;
		end;
	case 6:
		cutin "ep172_beta.bmp", 1;
		mes "[�W���W���[]";
		mes "�ł́A���q�l���B";
		mes "�u��s�D������v�Ɉړ����܂���B";
		mes "�W���W���[�ɕt���Ă��邾��`�I";
		mes "�@";
		mes "�]���̖ړI�n�֌������܂����H�]";
		next;
		cutin "ep172_beta.bmp", 255;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̖ړI�n�֌��������]";
		close2;
		warp "ba_in01.gat", 28, 262;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,193,252,3	script	���C�W�[#ep19_evt05	10454,{/* 5575 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,193,248,3	script	�}����#ep19_evt05	10376,{/* 5576 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,195,250,3	script	�~���A��#ep19_evt05	10377,{/* 5577 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
ba_maison.gat,185,248,6	script	���n�[��#ep19_evt05	10469,{/* 5578 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

ba_in01.gat,30,264,4	script	�W���W���[#ep19gg01	10354,{/* 5579 */
	if(EP19_1QUE < 3) {
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "��s�D�C�t����S�����Ă���";
		mes "�u�W���W���[�v����I";
		mes "��낵�����肢���܂�!!";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
	if(EP19_1QUE >= 6 || EP19_1QUE <= 8) {
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�C�t���ŃC�X�K���h�ɍs������I";
		mes "����������ˁH";
		next;
		if(select("��s�D�̒���","������Ƒ҂��ė~����") == 2) {
			mes "[�W���W���[]";
			mes "��s�D�͂��ł��o�q�\����I";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		mes "[�W���W���[]";
		mes "���Ⴀ�A��s�D�ɏ�邾��I";
		if(EP19_1QUE == 6) {
			delquest 18123;
			setquest 130465;
			set EP19_1QUE,7;
		}
		close2;
		//showevent 9999, 0, �X�}�[�g�G���[#ep172_el;	// 5249: 26, 266
		//showevent 0, 1, �A�[�����h#ep172_amd01;	// 5381: 28, 255
		//showevent 9999, 0, �X�E�B�[�e�B#ep172_swty;	// 5382: 32, 250
		//showevent 9999, 0, �X�}�[�g�G���[#ep18ely0;	// 5553: 26, 266
		//showevent 9999, 0, �X�}�[�g�G���[#ep19_000;	// 5565: 26, 266
		//showevent 9999, 0, �X�}�[�g�G���[#ep19elly;	// 5567: 384, 114
		//showevent 9999, 0, �N���b�N�X#ep19crux01;	// 5569: 386, 110
		//showevent 0, 1, �W���W���[#ep19gg01;	// 5579: 30, 264
		cutin "ep172_beta.bmp", 255;
		warp "air_if.gat", 53, 71;	// from: ba_in01.gat(28, 262) port : 5121
		end;
	}
	cutin "ep172_beta.bmp", 2;
	mes "[�W���W���[]";
	if(EP19_1QUE >= 9) {
		mes "�C�t���ŃC�X�K���h�ɍs������I";
		mes "����������ˁH";
		setarray '@menu$,"��s�D�̒���","�C�X�K���h�ɍs��","�v�����e���ɍs��","�W���m�[�ɍs��","���w���ɍs��","������Ƒ҂��ė~����";
	}
	else {
		mes "�C�X�K���h�ւ̍q�H�v�Z�͊����I";
		mes "���́A�e�X�g��s��������";
		mes "���������āA�ǂ����s�������ꏊ��";
		mes "�������肷��H";
		setarray '@menu$,"","","�v�����e���ɍs��","�W���m�[�ɍs��","���w���ɍs��","���͕K�v�Ȃ��ł�";
	}
	next;
	switch(select(printarray('@menu$))) {
	case 1:
		mes "[�W���W���[]";
		mes "���Ⴀ�A��s�D�ɏ�邾��I";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "air_if.gat", 53, 71;
		end;
	case 2:
		mes "[�W���W���[]";
		mes "�ł́A���}�ōs������I";
		mes "�V���[�[���I";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "jor_tail.gat", 219, 53;
		end;
	case 3:
		mes "[�W���W���[]";
		mes "�ł́A�v�����e���ɏo�q�I";
		mes "�V���[�[���I";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "prontera.gat", 116, 72;
		end;
	case 4:
		mes "[�W���W���[]";
		mes "�ł́A�W���m�[�ɏo�q�I";
		mes "�V���[�[���I";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "yuno.gat", 158, 125;
		end;
	case 5:
		mes "[�W���W���[]";
		mes "�ł́A���w���ɏo�q�I";
		mes "�V���[�[���I";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "rachel.gat", 115, 125;
		end;
	case 6:
		mes "[�W���W���[]";
		if(EP19_1QUE >= 9) {
			mes "��s�D�͂��ł��o�q�\����I";
		}
		else {
			mes "�s�������ꏊ����������";
			mes "�e�X�g��s�ő����Ă����邾��I";
		}
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	}
}

ba_in01.gat,341,371,0	warp	#ep172_room02_in	1,1,ba_in01.gat,375,101	// 5341 from: ba_in01.gat(341, 370)
ba_in01.gat,375,98,0	warp	#ep172_room02_out	1,1,ba_in01.gat,341,368	// 5342 from: ba_in01.gat(375, 99)

air_if.gat,54,68,0	script	#ep19_evt06	139,7,7,{/* 2501 */
	switch(EP19_1QUE) {
	case 7:
	case 8:
		//showevent 9999, 0, �W���W���[#ep19gg03;	// 2505: 46, 71
		//showevent 0, 1, ���n�[��#ep19lehar03;	// 2509: 32, 63
		cloakoffnpc "���C�W�[#ep19lazy02";
		cloakoffnpc "�}����#ep19maram03";
		cloakoffnpc "�~���A��#ep19miriam03";
		cloakoffnpc "���n�[��#ep19lehar03";
		end;
	case 9:
	case 11:
		end;
	case 10:
		cloakoffnpc "���C�W�[#ep19lazyair";
		cloakoffnpc "�}����#ep19maramair";
		end;
	}
}
air_if.gat,35,60,0	script	#ep19_evt06_1	139,5,5,{/* 2502 */
	switch(EP19_1QUE) {
	case 7:
	case 8:
		cloakoffnpc "���C�W�[#ep19lazy02";
		cloakoffnpc "�}����#ep19maram03";
		cloakoffnpc "�~���A��#ep19miriam03";
		cloakoffnpc "���n�[��#ep19lehar03";
		end;
	case 9:
	case 11:
		end;
	case 10:
		cloakoffnpc "���C�W�[#ep19lazyair";
		cloakoffnpc "�}����#ep19maramair";
		end;
	}
}

air_if.gat,35,72,3	script	���C�W�[#ep19lazyair	10454,{/* 2503 (cloaking)*/
	cutin "ep19_leizi01.png", 2;
	mes "[���C�W�[]";
	mes "����񍐂̂��߂�����";
	mes "�嗤�Ԃ�����������Ȃ��";
	mes "�l�g�����r�������炠��Ⴕ�Ȃ��I";
	next;
	if(select("�����W���m�[�֍s��","�����Ă�����Ⴂ") == 2) {
		mes "[���C�W�[]";
		mes "�Ă�����A�ꏏ�ɃW���m�[��";
		mes "���Ă����Ǝv���Ă��̂ɂȁB";
		mes "���͂��Јꏏ�ɃW���m�[�ɍs�����B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	mes "[���C�W�[]";
	mes "����ς�A�W���m�[����Ԃ���ȁH";
	mes "�Ȃ�A�ꏏ�ɍs�����B";
	next;
	cutin "ep172_beta.bmp", 2;
	mes "[�W���W���[]";
	mes "�W���m�[�ɓ�����������I";
	mes "���q����A�~��č~���!!";
	close2;
	cutin "ep19_leizi01.png", 255;
	warp "yuno.gat", 157, 123;
	end;
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,30,70,5	script	�}����#ep19maramair	10376,{/* 2504 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�u�X�̏�v�ւ̕����̒��B��";
	mes "�����S�����邱�ƂɂȂ�����ł��B";
	mes "���ӕ���ł�����ˁB";
	mes "���̓��w���Ɍ������Ă��܂��B";
	next;
	if(select("�������w���֍s��","�����Ă�����Ⴂ") == 2) {
		mes "[�}����]";
		mes "�����̒��B�͔C���Ă��������B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	mes "[�}����]";
	mes "�ǂ��ł��ˁI";
	mes "�܊p�ł�����ꏏ�ɍs���܂��傤���B";
	next;
	cutin "ep172_beta.bmp", 2;
	mes "[�W���W���[]";
	mes "���w���ɓ�����������I";
	mes "���q����A�~��č~���!!";
	close2;
	cutin "ep18_maram_01.png", 255;
	warp "rachel.gat", 267, 126;
	end;
OnInit:
	cloakonnpc;
	end;
}
air_if.gat,46,71,4	script	�W���W���[#ep19gg03	10354,{/* 2505 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�e�X�g��s���J��Ԃ����̂�";
		mes "�q�H�ݒ�͊�������I";
		mes "�ŒZ�o�H�Ŕ��ł����\�肾����";
		mes "�C�X�K���h�̏�ǂ��z������@��";
		mes "�ǂ�����Ηǂ��H";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "�C�X�K���h�̎��҂̕�����";
		mes "�u���ҏ�v�����炢�܂�����ˁH";
		mes "������s�D�̊Ǘ��҂ɓn����";
		mes "��ǂ��z������͂��ł��B";
		next;
		menu "�W���W���[�Ɂu���ҏ�v��n��",-;
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "���ꂪ�u���ҏ�v�H";
		mes "����̔g���R�[�h�����m�I";
		mes "�ǂ�ǂ�c�c�B";
		next;
		mes "[�W���W���[]";
		mes "����A������������I";
		mes "���q�l�����͓�������܂�";
		mes "�x��ł��āB";
		close2;
		cutin "ep172_beta.bmp", 255;
		delquest 130465;
		setquest 18129;
		delitem 1000607,1;
		set EP19_1QUE,8;
		//showevent 9999, 0, �W���W���[#ep19gg03;	// 2505: 46, 71
		//showevent 0, 1, ���n�[��#ep19lehar03;	// 2509: 32, 63
		end;
	case 8:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�ŒZ�o�H�ŉ^�q���I";
		mes "���q�l�����͓�������܂�";
		mes "�x��ł��āB";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	case 9:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�W���W���[�̓C�t���̒S���҂�����";
		mes "�����őҋ@������B";
		next;
		if(select("��s�D����~���","����������Ƃ��Ă���~���") == 2) {
			mes "[�W���W���[]";
			mes "�킩�����B";
			mes "�~�肽�����́A�����āB";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		mes "[�W���W���[]";
		mes "�ł́A�����Ă������[���I";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "jor_tail.gat", 219, 53;
		end;
	default:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�W���W���[�̓C�t���̒S���҂�����";
		mes "�����őҋ@������B";
		mes "�o�������g�@�ɖ߂肽������";
		mes "���ł��v�����āB";
		next;
		switch(select("�o�������g�@�ɍs��","�C�X�K���h�ɍs��","�v�����e���ɍs��","�W���m�[�ɍs��","���w���ɍs��","������Ƒ҂��ė~����")) {
		case 1:
			mes "[�W���W���[]";
			mes "�ł́A�o�������g�@�ɏo�q�I";
			mes "�V���[�[���I";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "ba_in01.gat", 30, 262;
			end;
		case 2:
			mes "[�W���W���[]";
			mes "�ł́A�����Ă������[���I";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "jor_tail.gat", 219, 53;
			end;
		case 3:
			mes "[�W���W���[]";
			mes "�ł́A�v�����e���ɏo�q�I";
			mes "�V���[�[���I";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "prontera.gat", 116, 72;
			end;
		case 4:
			mes "[�W���W���[]";
			mes "�ł́A�W���m�[�ɏo�q�I";
			mes "�V���[�[���I";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "yuno.gat", 158, 125;
			end;
		case 5:
			mes "[�W���W���[]";
			mes "�ł́A���w���ɏo�q�I";
			mes "�V���[�[���I";
			close2;
			cutin "ep172_beta.bmp", 255;
			warp "rachel.gat", 115, 125;
			end;
		case 6:
			mes "[�W���W���[]";
			mes "�s�������ꏊ����������";
			mes "�����Ă����邾��I";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
	}
}
air_if.gat,31,58,1	script	���C�W�[#ep19lazy02	10454,{/* 2506 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "����Ӂ`�`�I";
		mes "���΂͑匫�҂̔�s�D�I";
		mes "�������Ⴄ�ȁB";
		mes "��ʓI�Ȕ�s�D�ɂ͉��x������Ă邪";
		mes "����قǂ���Ȃ�����B";
		close2;
		cutin "16lei_01.bmp", 255;
		end;
	case 8:
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "��`�t�@�b�V�������Ēm���Ă�H";
		mes "����A�����Ȃ񂾂��ǁA�ǂ��H";
		mes "�i�D�����H";
		next;
		mes "[���C�W�[]";
		mes "�������͊����炵������ȁB";
		mes "�h�����������肵�Ȃ���B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	case 9:
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����C�X�K���h�ɒ��������āH";
		mes "�鑠�̖h�����̐��\�������قǂ̂��̂�";
		mes "�����Ă݂悤����Ȃ����I";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,29,62,5	script	�}����#ep19maram03	10376,{/* 2507 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���p�̔�s�D�Ƃ�";
		mes "��ׂ��̂ɂ��Ȃ�܂���ˁB";
		mes "���ꂪ�l���L�̔�s�D���Ȃ��";
		mes "�����ł��B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 8:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���̔�s�D���g����";
		mes "�����̒��B���ł��Ȃ���";
		mes "�W���W���[����ɑ��k�������ł��B";
		mes "���u�n�Ŋ�������Ȃ�";
		mes "�����̕⋋���K�v�ɂȂ�ł��傤�B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 9:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���悢��C�X�K���h�ɓ����ł��ˁB";
		mes "�ǂ�ȏ��Ȃ̂ł��傤�H";
		mes "������Ƌْ����Ă��܂����B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,29,59,6	script	�~���A��#ep19miriam03	10377,{/* 2508 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "����Ȃɒ������w���𗣂��̂�";
		mes "���߂āc�c";
		mes "������ƃh�L�h�L���Ă����B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 8:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�C�X�K���h�ɍs���邱�Ƃ�";
		mes "�C���������g���Ă܂��B";
		mes "�c�c���_�C�{������Ȃ��̂��ȁH";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 9:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�����܂������H";
		mes "�O�͂���ς芦���̂ł��傤���c�c�B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

air_if.gat,32,63,3	script	���n�[��#ep19lehar03	10469,{/* 2509 */
	switch(EP19_1QUE) {
	case 7:
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���җl���炢���������u���ҏ�v��";
		mes "�W���W���[����ɓn���Ă��������B";
		mes "���̔�s�D�S�̂��i���������ꂽ���̂�";
		mes "�F������܂��B";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 8:
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����Ƃ������ȏЉ�܂��ł����B";
		mes "���J�s�g�[���i�C���@��";
		mes "�u���n�[���v�Ɛ\���܂��B";
		next;
		mes "[���n�[��]";
		mes "���������K���h�Ɋւ��錤����";
		mes "��`���Ă����̂ł���";
		mes "���̊Ԃɂ��C�X�K���h��";
		mes "�s�������邱�ƂɂȂ��Ă��܂��܂����B";
		mes "�C�X�K���h�̈ē��͂��C�����������B";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "��V�������N�͑�D������I";
		mes "���̂��Ƃ͋C�y��";
		mes "���C�W�[�ƌĂ�ł���I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�}�����ł��B";
		mes "�����̒��B�Ȃǂ�";
		mes "�����ɗ��Ă邩�Ǝv���܂��B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�c�c�~���A���ł��B";
		mes "�}�����ƈꏏ�ɎQ��܂����B";
		mes "��낵�����肢�������܂��B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�~���A���H";
		mes "�ӂށc�c�����Ƃ����킯�ł����B";
		mes "���΂͐_���`�I";
		mes "�B���������ӂƂ������Ƃł��ˁB";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�c�c�����H";
		mes "�_���`�H";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���̕������炷���";
		mes "���n�[���͈����P�������d���Ȃ̂����H";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���A�͂��A�����ł��B";
		mes "�c������A�J�s�g�[���i�C���@��";
		mes "�߂����܂����̂ŁB";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "�_�̂����ׂƂ����킯���I";
		mes "�Ƃ���ŁA�v�����e���̉��ƂƂ�";
		mes "�ǂ������֌W�H";
		mes "���������āA���q�l�������肷��H";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���`���Ƃł��ˁB";
		mes "���q�Ƃ��A���������̂ł͂Ȃ���ł��B";
		mes "���̕�A�t���X�q���f�͐扤�̖�";
		mes "�܂�A�Q�I���O�Ƃ̖����ł��B";
		next;
		mes "[���n�[��]";
		mes "�����B���K�v�͂Ȃ��Ǝv���܂����c�c";
		mes "��̓Q�I���O�Ƃɂ�����ꂽ";
		mes "�u���������K���h�̎􂢁v���C�ɂ���";
		mes "�����C���@�ɗa���邱�Ƃɂ�����ł��B";
		next;
		mes "[���n�[��]";
		mes "�C���@�ɂ́A�扤�̌Z���ł���";
		mes "��̎o�ɓ�����";
		mes "���H�[�N�����f�l��";
		mes "���F���O���f�l��������";
		mes "�􂢂ɂ��Č������Ă����܂����B";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[���n�[��]";
		mes "�����c�c";
		mes "���ǂ͐扤�̒��n�̌�q����";
		mes "�􂢂��������āc�c";
		mes "�f��l�����̓V���b�N�������悤�ł��B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�Q�I���O�Ƃɂ�����ꂽ";
		mes "���������K���h�̎􂢂�f���؂邱�Ƃ�";
		mes "���ӂ��ꂽ�f��l�B��";
		mes "�@��𓾂āA���������K���h�Ɖ��̂���";
		mes "�C�X�K���h�Ɍ�����ꂽ�̂ł��B";
		next;
		mes "[���n�[��]";
		mes "��������̃X�L�����g����";
		mes "�C�X�K���h�ŏf��l������";
		mes "��`�������Ă��܂��B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�C�X�K���h��";
		mes "�ǂ̂悤�ȏꏊ�Ȃ̂ł����H";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���Ă����ꏊ�ł��ˁB";
		mes "�ǂ������Ă���ƕX�΂���ł��B";
		mes "�����A�ł����S�z�Ȃ��B";
		mes "���B�����_�Ƃ��Ă���";
		mes "�u^0000FF�X�̏�^000000�v�͒g�����ꏊ�ł���B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "���`�`���ƁA�����������ȁH";
		mes "�u���I���v�l�������̗͂�";
		mes "�ǂ��ɂ����Ă���ƕ����Ă܂����c�c";
		mes "�͂͂͂́I";
		mes "�Y��Ă��܂��܂����I";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���ӂ��ׂ����Ƃ͂���H";
		mes "�C���V�I���̓z�炪����Ȃ�";
		mes "�p�S�ɉz�������Ƃ͖����B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�ŋ߁u���K���v�Ƃ������m������";
		mes "�����������ɂȂ��Ă��������ł��B";
		mes "���̃C���V�I���ƌ����҂�����";
		mes "�֌W������̂�������܂���B";
		next;
		cutin "ep172_beta.bmp", 1;
		mes "[�W���W���[]";
		mes "�A�e���V�����v���[�Y�I";
		mes "��s�D�C�t���͊Ԃ��Ȃ�";
		mes "�C�X�K���h�ɓ������邾��I";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����̂悤�ł��ˁB";
		mes "�܂��́u�X�̏�v�Ɉē����܂��B";
		mes "���B�����_�Ƃ��Ă���ꏊ�ł���B";
		close2;
		cutin "ep19_lehar01.png", 255;
		delquest 18129;
		setquest 18124;
		set EP19_1QUE,9;
		//showevent 0, 1, �W���W���[#ep19gg03;	// 2505: 46, 71
		//showevent 9999, 0, ���n�[��#ep19lehar03;	// 2509: 32, 63
		//showevent 6, 3, �W���W���[#ep19gg01;	// 5579: 30, 264
		end;
	case 9:
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�w�����b�N�̖��@�̃\������������";
		mes "��s�D���ǂ��ł��ˁB";
		mes "���āA�܂��͍~��܂��傤���B";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,216,51,5	script	�W���W���[#ep19gg04	10354,14,14,{/* 2510 */
	switch(EP19_1QUE) {
	case 9:
		cutin "ep172_beta.bmp", 2;
		mes "[�W���W���[]";
		mes "�W���W���[�̓C�t���̒S���҂�����";
		mes "�����őҋ@������B";
		close2;
		cutin "ep172_beta.bmp", 255;
		end;
	default:
		mes "[�W���W���[]";
		mes "���������āA��s�D�ɏ����";
		mes "�s�������Ƃ��낪����́H";
		next;
		if(select("�s�������ꏊ������","���͕K�v�Ȃ��ł�") == 2) {
			mes "[�W���W���[]";
			mes "�킩�����I";
			mes "�s�������ꏊ�������";
			mes "���ł��v�����āB";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		mes "[�W���W���[]";
		mes "�O�͊�������ˁB";
		mes "�s��͒��ŕ�������B";
		close2;
		cutin "ep172_beta.bmp", 255;
		warp "air_if.gat", 53, 71;
		end;
	}
OnTouch:
	switch(EP19_1QUE) {
	case 9:
		//showevent 0, 1, ���n�[��#ep19lehar04;	// 2514: 221, 53
		//showevent 9999, 0, �w�����b�N#ep19;	// 2910: 211, 63
		cloakoffnpc "���C�W�[#ep19lazyjt";
		cloakoffnpc "�}����#ep19maramjt";
		cloakoffnpc "�~���A��#ep19miriamjt";
		cloakoffnpc "���n�[��#ep19lehar04";
		end;
	case 10:
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		end;
	}
}

jor_tail.gat,216,54,5	script	���C�W�[#ep19lazyjt	10454,{/* 2511 (cloaking)*/
	unittalk "���C�W�[ : ��ӂ��`�`�I�@���Ă���I�@�Ɋ��̊C���I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,220,51,7	script	�}����#ep19maramjt	10376,{/* 2512 (cloaking)*/
	unittalk "�}���� : ����ȂɕX���������񂠂�ꏊ�́A���߂Ăł��I",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,223,50,7	script	�~���A��#ep19miriamjt	10377,{/* 2513 (cloaking)*/
	unittalk "�~���A�� : �����ƒ�����ł����΁A�ǂ����������c�c",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,221,53,3	script	���n�[��#ep19lehar04	10469,{/* 2514 (cloaking)*/
	switch(EP19_1QUE) {
	case 9:
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "���I�@�u�X�̏�v����߂��ʒu��";
		mes "���n���܂����ˁB";
		mes "�������i�͂�������X�̏��";
		mes "�������Ă��܂��B";
		next;
		mes "[���n�[��]";
		mes "�����A���傤�ǕX�̏邩��";
		mes "�N�������݂����ł��B";
		next;
		cutin "ep19_iwin11.png", 2;
		mes "[�A�[�E�B����]";
		mes "�Ȃ��񂾁B";
		mes "���n�[���������H";
		mes "�������Ƃ̖������̂����ŗ��邩��";
		mes "�l�q�����ɗ����񂾂��ǁB";
		next;
		mes "[�A�[�E�B����]";
		mes "������͒N�H";
		mes "���n�[���̗F�B�H";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "���������I�@�F�B����I";
		mes "�u���I���v�l�̋���������Ă���B";
		mes "���ꂩ��X�̏�Ɉē�����Ƃ���B";
		next;
		mes "[���n�[��]";
		mes "�����A���_�ƂȂ�";
		mes "�u�X�̏�v�֌������܂��傤�B";
		mes "�܂��͖k�Ɍ������Ă��������B";
		mes "�}�b�v�Ɉ�����Ă����܂��ˁB";
		close2;
		cutin "ep19_lehar01.png", 255;
		delquest 18124;
		setquest 18125;	
		set EP19_1QUE,10;
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		//showevent 0, 1, #to_jor_back1_3;	// 2454: 219, 294
		//showevent 9999, 0, ���n�[��#ep19lehar04;	// 2514: 221, 53
		//showevent 0, 1, #to_icecastle;	// 2456: 385, 229
		//showevent 0, 1, #to_icas_in;	// 2470: 213, 175
		//showevent 0, 1, ���n�[��#ep19lehar06;	// 2525: 141, 216
		end;
	case 10:
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "�����A���_�ƂȂ�";
		mes "�u�X�̏�v�֌������܂��傤�B";
		mes "�܂��͖k�Ɍ������Ă��������B";
		mes "�}�b�v�Ɉ�����Ă����܂��ˁB";
		close2;
		cutin "ep19_lehar01.png", 255;
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,215,291,0	script	#ep19_evt07	139,14,4,{/* 2515 */
	cloakonnpc "���n�[��#jor_tail_1";
	if(EP19_1QUE == 10) {
		cloakoffnpc "���n�[��#jor_tail_1";
		unittalk getnpcid(0,"���n�[��#jor_tail_1"),"���n�[�� : ������ł��I";
	}
	end;
}

jor_tail.gat,215,291,5	script	���n�[��#jor_tail_1	10469,{/* 2516 (cloaking)*/
	unittalk "���n�[�� : ������ł��I";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,221,57,3	script	�A�[�E�B����#ep19iwin01	21515,{/* 2517 */
	cutin "ep19_iwin11.png", 2;
	mes "[�A�[�E�B����]";
	if(EP19_1QUE == 10) {
		mes "�u�X�̏�v�ɑ�������";
		mes "���X�Ȃ��肭�˂��Ă�B";
		mes "�ق�A�n�}�ɕW����t���Ă����悤�B";
		close2;
		cutin "ep19_iwin11.png", 255;
		viewpoint 1, 219, 294, 1, 0xFFFF00;
		end;
	}
	mes "���̔�s�D�Ƃ���";
	mes "���B��������Ă��邩��";
	mes "�S�z���Ȃ��Ă������B";
	close2;
	cutin "ep19_iwin11.png", 255;
	end;
}

jor_tail.gat,223,54,3	script	�A�[�E�B����#ep19iwin02	21515,{/* 2518 */
	cutin "ep19_iwin04.png", 2;
	mes "[�A�[�E�B����]";
	mes "�H���̈ꖇ�������Ȃ�ā`�I";
	mes "����Ȋ��D�Ŋ����Ȃ��́H";
	close2;
	cutin "ep19_iwin04.png", 255;
	end;
}

jor_back1.gat,222,22,0	script	#ep19_evt_1	139,14,14,{/* 2519 */
	if(EP19_1QUE == 10)
		viewpoint 1, 385, 229, 1, 0xFFFF00;
	end;
}

jor_back1.gat,377,229,0	script	#ep19_evt_2	139,5,5,{/* 2520 */
	cloakonnpc "���n�[��#ep19lehar05";
	if(EP19_1QUE == 10)
		cloakoffnpc "���n�[��#ep19lehar05";
	end;
}

jor_back1.gat,381,232,3	script	���n�[��#ep19lehar05	10469,{/* 2521 (cloaking)*/
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "���̐悪���҂̊X�u�X�̏�v�ł��B";
	mes "�X�̉��ɋ��_������܂��B";
	mes "�����A�s���܂��傤�B";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,204,165,0	script	#ep19_evt_3	139,7,7,{/* 2522 */
	cloakonnpc "���n�[��#ep19lehar_1";
	if(EP19_1QUE == 10)
		cloakoffnpc "���n�[��#ep19lehar_1";
	end;
}

icecastle.gat,204,165,3	script	���n�[��#ep19lehar_1	10469,{/* 2523 (cloaking)*/
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�������������̋��_�ł��B";
	mes "�ǂ��������肭�������B";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,141,216,0	script	#ep19_cas_1	139,14,14,{/* 2524 */
	switch(EP19_1QUE) {
	case 10:
		cloakoffnpc "���n�[��#ep19lehar06";
		end;
	case 11:
		cloakoffnpc "���C�W�[#ep19lazy03";
		cloakoffnpc "�}����#ep19maram04";
		cloakoffnpc "�~���A��#ep19miriam04";
		cloakoffnpc "���I��#ep19leon01";
		cloakoffnpc "�I�[�����[#ep19arl01";
		end;
	case 12:
		cloakoffnpc "���I��#ep19leon01";
		end;
	case 13:	// ������
	case 14:
		end;
	}
	end;
}

icas_in.gat,141,216,3	script	���n�[��#ep19lehar06	10469,{/* 2525 (cloaking)*/
	switch(EP19_1QUE) {
	case 10:
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�ǂ��ł��H";
		mes "�v��������̒���";
		mes "�����Ȃ��ł��傤�H";
		cloakoffnpc "���C�W�[#ep19lazy03";
		cloakoffnpc "�}����#ep19maram04";
		cloakoffnpc "�~���A��#ep19miriam04";
		next;
		cloakoffnpc "���I��#ep19leon01";
		cloakoffnpc "�I�[�����[#ep19arl01";
		unittalk getnpcid(0,"���I��#ep19leon01"),"���I��: ���q�l���������������悤���B";
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�͂��߂܂��āB";
		mes "�v�e�B�Ƃ́u���I���v�Ɛ\���܂��B";
		mes "�̂����Ă����u�X�̏�v��";
		mes "���҂̔C�ɏA���Ă��܂��B";
		mes "���I���A�ƌĂю̂Ăɂ��Ă���������";
		mes "�\���܂���B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�������A�v�e�B�Ƃ́u�I�[�����[�v��B";
		mes "���̂��Ƃ��Ăю̂Ăɂ��Č��\�B";
		mes "���̕����C�y�����ˁB";
		mes "�ӂ���A�`���҂��c�c";
		mes "�`���҂�����̂��v���Ԃ�B";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "�M���B�̒T���Ă��镨��";
		mes "�ŋߊϑ�����Ă���";
		mes "�C�X�K���h�ٕ̈ςƂ̊Ԃɂ�";
		mes "�֌W�����邩������Ȃ���";
		mes "���n�[���̎莆�ɂ͏����Ă���܂����B";
		next;
		menu "���w���ł̏o�������������",-;
		cutin "ep19_aurelie03.png", 0;
		mes "[�I�[�����[]";
		mes "���~���̐S���̌��Ђ�";
		mes "�D�����҂��������Ă���̂��c�c�B";
		next;
		cutin "ep19_leon04.png", 2;
		mes "[���I��]";
		mes "���̎҂��������E�̈ꕔ��";
		mes "�����J�����ƍl������ȁB";
		next;
		cutin "ep19_aurelie03.png", 0;
		mes "[�I�[�����[]";
		mes "���������K���h�Ɋ֐S�������Ă���Ȃ�";
		mes "�u���K���v�ƌ������Ă���";
		mes "�\����������B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���E���ێ�����ׂɂ�";
		mes "���K�������̊Ď�����������";
		mes "�΍���������Ȃ��ƂˁB";
		next;
		cloakoffnpc "���F���O���f#ep19vell01";
		cloakoffnpc "���H�[�N�����f#ep19vog0";
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�Ȃɂ�瑛�������Ǝv���ė��Ă݂��";
		mes "���q���񂪂���Ȃ�������I";
		mes "���H�͂�΂�A�悭�����ˁB";
		mes "���}�����B";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "���I���l�A�I�[�����[�l�B";
		mes "���ȏЉ��";
		mes "�����ς܂��ꂽ�̂ł����H";
		mes "�c�c���̗l�q���ƁA�܂��̂悤�ł��ˁB";
		next;
		cutin "ep19_leon02.png", 2;
		mes "[���I��]";
		mes "�����A����͎��炵���B";
		mes "���E�Ɋւ��邱�ƂɂȂ��";
		mes "���̂��Ƃ��l�����Ȃ��Ȃ��Ă��܂��B";
		next;
		cutin "ep19_aurelie04.png", 0;
		mes "[�I�[�����[]";
		mes "���B�̈����Ȃˁc�c";
		mes "����ɘb��i�߂Ă��܂���";
		mes "���߂�Ȃ����B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���₢��A�C�ɂȂ��炸�B";
		mes "����l�����m��ɂȂ肽������";
		mes "���Ƃŏڂ����������܂��傤�B";
		mes "�V���o���c�o���h��";
		mes "���C�W�[�Ɛ\���܂��B";
		next;
		cutin "ep18_miriam_02.png", 0;
		mes "[�~���A��]";
		mes "�A���i�x���c�̃~���A���ł��B";
		mes "�����������������肪�Ƃ��������܂��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�������A���i�x���c�̃}�����ł��B";
		mes "�����b�ɂȂ�܂��B";
		next;
		cutin "ep19_voglinde04.png", 0;
		mes "[���H�[�N�����f]";
		mes "�i�ӂށc�c";
		mes "�@�V���o���c�o���h��";
		mes "�@�A���i�x���c�̐l�Ԃ��B";
		mes "�@�Ȃɂ�������Ȃ��Ƃ�";
		mes "�@�N���Ă���悤�ˁc�c�j";
		next;
		cutin "ep19_voglinde03.png", 0;
		mes "[���H�[�N�����f]";
		mes "���̓Q�I���O�Ƃ́u���H�[�N�����f�v�B";
		mes "�����ŁA���������K���h���c�̓z��c�c";
		mes "�u���K���v�Ɠ��肠���Ă���B";
		mes "�r���Ղ��̋������Ȏ�l�����Ă����";
		mes "�����������B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���₟�`���ȊO�͑S��";
		mes "�Ⴍ�ď�v�ł���`�B";
		mes "���n�[���̂���l�����Ⴂ�ł��ˁI";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "����A�����B�҂Ȃ��ƁI";
		mes "����Ɏ��́A���n�[���̏f���B";
		mes "�����͉ߍ��Ȋ�������";
		mes "���n�[���݂����Ȑ�˂ɂ�";
		mes "�ׂ��d������������";
		mes "���̗l�q�Ȃ�S�z�Ȃ���������B";
		next;
		mes "[���H�[�N�����f]";
		mes "�݂�ȁA���т͐H�ׂė����́H";
		mes "�܂��Ȃ��ňꏏ�ɐH�ׂ܂��傤�B";
		mes "���y����p�ӂ����Ă��炤��B";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "�i�o����A�Ⴂ�q�����";
		mes "�@�͂肫��������āc�c�j";
		next;
		mes "[���F���O���f]";
		mes "�Q�I���O�Ƃ́u���F���O���f�v��B";
		mes "���͎�ɁA���������K���h��";
		mes "���K���������g����p�ɂ��Ă�";
		mes "�������s���Ă����B";
		next;
		mes "[���F���O���f]";
		mes "���K�������̂��Ƃɂ��Ă�";
		mes "�����Ă�������Ǝv���B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���܂ł�������";
		mes "�����b������킯�ɂ������Ȃ���ˁB";
		mes "�ꏊ���ڂ��܂��傤���B";
		mes "�����ƁA���̃C���V�I���Ƃ�����";
		mes "�g�D�ɂ��ďڂ����̂́H";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�͂��́`�`���I";
		mes "����Ȃ��Ƃ����낤����";
		mes "�������������p�ӂ��Ă��܂����B";
		mes "���ł������Ă��������B";
		next;
		cutin "ep19_vellgunde01.png", 1;
		mes "[���F���O���f]";
		mes "�ł́A��������e���̎d���ɖ߂낤�B";
		mes "�����������ɖ߂邩��";
		mes "�b��������������";
		mes "��̗��ɂ��镺�ɂ̒���";
		mes "�������܂ŗ��Ă��傤�����B";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "������������A�����ł����݂܂��傤�B";
		mes "���n�[���́A����ł����������邩��";
		mes "��Ŏ��̂Ƃ���ɗ���悤�ɁB";
		mes "�񍐂𕷂����Ă��傤�����B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "���܂�Ă������Ƃ�";
		mes "�S�čς܂��Ă��܂�����H";
		mes "��ŕ񍐂����Ă��炢�܂��B";
		close2;
		cloakonnpc "���F���O���f#ep19vell01";
		cloakonnpc "���H�[�N�����f#ep19vog0";
		delquest 18125;
		setquest 18126;
		set EP19_1QUE,11;
		cutin "ep19_voglinde03.png", 255;
		//showevent 9999, 0, ���n�[��#ep19lehar06;	// 2525: 141, 216
		//showevent 0, 1, ���I��#ep19leon01;	// 2526: 138, 220
		//showevent 9999, 0, �I�[�����[#e19ms00;	// 2546: 34, 189
		//showevent 9999, 0, �z����#e19ms00;	// 2547: 32, 184
		//showevent 9999, 0, �`�F������#ep19re2;	// 2678: 245, 197
		//showevent 9999, 0, ���C�W�[#ep19re2;	// 2680: 245, 197
		//showevent 9999, 0, �~���A��#ep19re1;	// 2681: 249, 199
		//showevent 9999, 0, �z����#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ���F���O���f#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, ���C�W�[#i19ms00;	// 2688: 246, 119
		//showevent 9999, 0, �I�[�����[#i19ms00;	// 2693: 249, 113
		//showevent 9999, 0, �]������#ep19_dq_kitche;	// 2780: 241, 66
		//showevent 9999, 0, ���I��#ep19leon02;	// 2781: 42, 252
		//showevent 9999, 0, �~���A��#ep19_dq_victim;	// 2783: 48, 252
		//showevent 9999, 0, �~���A��#ep19miriam06;	// 2787: 260, 180
		//showevent 9999, 0, �}����#ep19maram05;	// 2788: 262, 179
		//showevent 9999, 0, ���H�[�N�����f#ep19;	// 2904: 163, 226
		//showevent 9999, 0, �}����#ep19;	// 2908: 130, 201
		//showevent 9999, 0, ���n�[��#ep19;	// 2909: 136, 197
		end;
	case 11:
		cloakoffnpc "���C�W�[#ep19lazy03";
		cloakoffnpc "�}����#ep19maram04";
		cloakoffnpc "�~���A��#ep19miriam04";
		cloakoffnpc "���I��#ep19leon01";
		cloakoffnpc "�I�[�����[#ep19arl01";
		unittalk "���n�[�� : ���I���l�̂��b�𕷂��܂��傤�B",1;
		end;
	case 12:
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���͂����Ŕ���l������";
		mes "��`�������Ă��܂��B";
		mes "������������Ă��܂�����";
		mes "�̂��ア���̂Łc�c�B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�G�p�������t�����Ă΂���ł�����";
		mes "�`���җl�����Ă�����������������";
		mes "�����͊y�ɂȂ邩������܂���I";
		mes "�ꏏ�Ɋ撣��܂��傤�ˁI";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,138,220,4	script	���I��#ep19leon01	10464,{/* 2526 (cloaking)*/
	switch(EP19_1QUE) {
	case 11:
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "���ʂ������đ�ςł��傤�B";
		mes "�ЂƂ��������܂��ˁB";
		mes "�܂��͂����u�C�X�K���h�v�ɂ��āB";
		next;
		mes "[���I��]";
		mes "���łɌ䗗�ɂȂ�ꂽ�ł��傤��";
		mes "�C�X�K���h�͕X�̑嗤�ł��B";
		mes "�������A�n���w�I�ȈӖ��ɂ����Ă�";
		mes "�嗤�ł͂���܂���B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�C�X�K���h�́A����ȃ��������K���h��";
		mes "����t�����̂łł��Ă���́B";
		mes "�����ɁA���������K���h����J����";
		mes "���K�������u���c�v�̍\������";
		mes "���܂��Ă���󋵂�B";
		next;
		menu "�ł͌��E�̖����́H",-;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�C�X�K���h����芪�����E��";
		mes "���������K���h�𕕈󂷂�̂ł͂Ȃ�";
		mes "���K���������O�ɏo�Ȃ��悤�ɂ��邽�߂�";
		mes "����ȘS���Ȃ̂ł��B";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "����������ȘS���ł���Ȃ�";
		mes "���ӂ���́A�Ŏ�H";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�Ԉ���Ă͂��܂���";
		mes "�u���ҁv�ƌĂ�ł��������܂����B";
		mes "�u�A�[�E�B���v������";
		mes "�u���ҁv�ƌĂ΂�邱�Ƃ�";
		mes "�ւ�������Ă��܂�����ˁB";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�u�A�[�E�B���v�Ƃ����̂�";
		mes "�����ɓ����������ɏo�}���Ă��ꂽ";
		mes "����ȁc�c���c�c�H";
		mes "�݂����ȕ������̂��Ƃł����H";
		next;
		cutin "ep19_aurelie04.png", 0;
		mes "[�I�[�����[]";
		mes "���͂́I";
		mes "�����̂������͂Ȃ����ȁB";
		mes "�ނ�͌��X�A����ȎR���Ԃ���������";
		mes "�n�蒹���������ǁA���R";
		mes "����̏�ɋ����킹�Ă��܂����́B";
		next;
		cutin "ep19_aurelie02.png", 0;
		mes "[�I�[�����[]";
		mes "�ȗ��A���B�ƈꏏ�Ɍ��E���Ď����Ȃ���";
		mes "���̒n������Ă���̂�B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���̒n�ŉ�����T���̂ł����";
		mes "�A�[�E�B����������b�𕷂�����";
		mes "�s�������ɂ���̂��ǂ��ł��傤�B";
		mes "�����C�X�K���h�̂���������";
		mes "�p�g���[�����Ă���͂��ł��B";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "�������A�����ŋx�܂��̂�";
		mes "�ǂ��ł��傤�B";
		mes "�o�������g�l���������Ă�������";
		mes "���p���Ă����q��������܂��̂ŁB";
		next;
		menu "�o�������g�����Ă����̂ł����H",-;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���̐l���A�����ɗ��Ȃ��Ȃ���";
		mes "���΂炭�o���ǁc�c";
		mes "���C�ɂ��Ă�̂�����H";
		mes "����A���͊֌W�Ȃ��b��������ˁB";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���ꂶ�Ⴀ�A�s���h��";
		mes strcharinfo(0)+"��";
		mes "�A�[�E�B�������ɉ���Ă��Ă����H";
		mes "���͂����Ŏ��҂̂���l��";
		mes "���낢��������Ă�������B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�{�N�́A���̂���̒���";
		mes "���~���̐S���̌��Ђɂ���";
		mes "�����ĉ���Ă݂�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�ł́A���͕K�v�ƂȂ肻����";
		mes "�⋋�����̐􂢏o����";
		mes "�A�����@���������Ă����܂��B";
		mes "�W���W���[����ɔ�s�D���g���Ȃ���";
		mes "���k���Ȃ���΁B";
		next;
		cutin "ep19_aurelie02.png", 0;
		mes "[�I�[�����[]";
		mes "��̒��͎����ē����悤�B";
		mes "�����A�������B";
		mes "���n�[���N�A�u��Ԃ̉Ԃт�v��";
		mes "�����Ă����āB";
		next;
		menu "��Ԃ̉Ԃт�H",-;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���ꂪ�u��Ԃ̉Ԃт�v�ł��B";
		mes "���͂���̂悤�Ɍ������������̂�";
		mes "�ʉ݂̑���Ɏg���Ă����ł��B";
		next;
		mes "[���n�[��]";
		mes "�A�[�E�B���B�̎�`���������";
		mes "���炦��͂��ł�����";
		mes "�W�߂Ă݂Ă��������ˁB";
		next;
	case 12:
		if(EP19_1QUE == 11) {
			delquest 18126;
			setquest 18127;
			setquest 18128;
			set EP19_1QUE,12;
			mes "[���n�[��]";
			mes "���āA�����d���ɏo�����܂����B";
			mes "��낵����΁A�ꏏ�ɍs���܂��񂩁H";
			next;
			//showevent 0, 1, ���I��#ep19leon01;	// 2526: 138, 220
			//showevent 0, 3, ���H�[�N�����f#ep19;	// 2904: 163, 226
			//showevent 0, 1, �p�g���[������#iws;	// 2533: 23, 115
			cutin "ep19_lehar01.png", 255;
		}
		else if(EP19_1QUE == 12) {
			cloakoffnpc "���I��#ep19leon01";
			cloakoffnpc "���C�W�[#ep19lazy03";
			cloakonnpc "�}����#ep19maram04";
			cloakonnpc "�~���A��#ep19miriam04";
			cloakonnpc "�I�[�����[#ep19arl01";
			cloakonnpc "���n�[��#ep19lehar06";
			cutin "ep19_leon03.png", 2;
			mes "[���I��]";
			mes "�ē����K�v�ł����H";
			next;
			cutin "ep19_leizi01.png", 2;
			mes "[���C�W�[]";
			mes strcharinfo(0)+"��";
			mes "�A�[�E�B�������ɉ���Ă��Ă����H";
			mes "���͂����Ŏ��҂̂���l��";
			mes "���낢��������Ă�������B";
			next;
			cutin "ep19_leizi01.png", 255;
		}
		mes "�]�ǂ���֌����������H�]";
		next;
		switch(select("�p�g���[�������̂Ƃ���(���C���X�g�[���[)","���H�[�N�����f�̂Ƃ���(�T�u�X�g�[���[)")) {
		case 1:
			mes "�]�p�g���[�������̂Ƃ���(���C���X�g�[���[)�֌������܂����H�]";
			next;
			if(select("������","��߂�") == 2) {
				mes "�]���̏�ɂƂǂ܂����]";
				close;
			}
			mes "�]�p�g���[�������̂Ƃ���(���C���X�g�[���[)�֌��������]";
			close2;
			warp "icecastle.gat", 23, 123;
			end;
		case 2:
			mes "�]���H�[�N�����f�̂Ƃ���(�T�u�X�g�[���[)�֌������܂����H�]";
			next;
			if(select("������","��߂�") == 2) {
				mes "�]���̏�ɂƂǂ܂����]";
				close;
			}
			mes "�]���H�[�N�����f�̂Ƃ���(�T�u�X�g�[���[)�֌��������]";
			close2;
			cloakonnpc "���C�W�[#ep19lazy03";
			cloakonnpc "�}����#ep19maram04";
			cloakonnpc "�~���A��#ep19miriam04";
			cloakonnpc "���I��#ep19leon01";
			cloakonnpc "�I�[�����[#ep19arl01";
			cloakonnpc "���n�[��#ep19lehar06";
			warp "icas_in.gat", 160, 223;
			end;
		}
	}
	end;
OnInit:
	setnpctitle "[����]";	// NPC:���I��#ep19leon01(2526)
	cloakonnpc;
	end;
}

icas_in.gat,141,220,3	script	�I�[�����[#ep19arl01	10465,{/* 2527 (cloaking)*/
	end;
OnInit:
	setnpctitle "[����]";	// NPC:�I�[�����[#ep19arl01(2527)
	cloakonnpc;
	end;
}

icas_in.gat,136,219,4	script	���F���O���f#ep19vell01	10468,{/* 2528 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,144,218,3	script	���H�[�N�����f#ep19vog0	10467,{/* 2529 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,137,211,7	script	���C�W�[#ep19lazy03	10454,{/* 2530 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,139,210,1	script	�}����#ep19maram04	10376,{/* 2531 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,141,210,1	script	�~���A��#ep19miriam04	10377,{/* 2532 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,23,115,8	script	�p�g���[������#iws	21518,{/* 2533 */
	if(EP19_1QUE < 12) {
		mes "[�p�g���[������]";
		mes "�C�X�K���h�ւ悤�����I";
		mes "��X�́u�C�[�O���p�g���[�����v�I";
		mes "�u���ĕt�����؁v�n���";
		mes "�p�g���[������ւ荂�������Ȃ̂ł��I";
		next;
		mes "[�p�g���[������]";
		mes "����A�M�������̂悤�Ȗ`���҂�";
		mes "���̒n��K���悤�ɂȂ��";
		mes "�e����[�߂邽�߂ɂ��Јꏏ��";
		mes "�p�g���[���ɏo�|�������ł��ˁB";
		mes "���̎�������̂����҂����Ă܂��I";
		close;
	}
	if(EP19_1QUE == 12) {
		mes "[�p�g���[������]";
		mes "�C�X�K���h�ւ悤�����I";
		mes "��X�́u�C�[�O���p�g���[�����v�I";
		mes "�u���ĕt�����؁v�n���";
		mes "�p�g���[������ւ荂�������Ȃ̂ł��I";
		next;
		mes "[�p�g���[������]";
		mes "����A�M�������̂悤�Ȗ`���҂�";
		mes "���̒n��K���悤�ɂȂ��";
		mes "�e����[�߂邽�߂ɂ��Јꏏ��";
		mes "�p�g���[���ɏo�|�������ł��ˁB";
		next;
		mes "[�p�g���[������]";
		mes "�����ƁA���A���܂��ł����I";
		mes "���͑����́A�}�[�V���E�W�W�E�n�b�s�[�E���[���E�C���E�A���X�E���C�h�E�u���[�h���}�C���f�B�h�E�e�X�E�{�A�e�b�N�X�Ɛ\���B";
		next;
		cloakoffnpc "�ꓙ���z������#exiwp";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"�ꓙ���z������#exiwp"),"�z������: �z�����������I�@�z�������ꓙ���A�񍐂������܂��I";
		if(!sleep2(700)) end;
		unittalk "�p�g���[������ : ����I�@���͂Ȃ����H";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"�ꓙ���z������#exiwp"),"�z������ : ��肠��܂���I�@�񍐏I���I";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"�ꓙ���z������#exiwp"),"�z������ : ����H�@���̐l�́A�V�����[�����ꂽ�Ƃ����`���҂ł���܂����H";
		if(!sleep2(700)) end;
		unittalk "�p�g���[������ : �������I�@�Ƃɂ�������J�B�x��ł悵�I";
		if(!sleep2(700)) end;
		unittalk getnpcid(0,"�ꓙ���z������#exiwp"),"�z������: �͂��I�@�z�������ꓙ���A�x�݂܂��I";
		if(!sleep2(700)) end;
		cloakonnpc "�ꓙ���z������#exiwp";
		mes "[�p�g���[������]";
		mes "�b�̓r���Ŏ��炵���B";
		mes "�����̕񍐂��󂯂�̂�";
		mes "�����̗��h�Ȗ�ڂȂ̂ŁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�z�������Ƃ�����ł��ˁH";
		next;
		unittalk "�p�g���[������ : (�����I�@���ꂾ����O���痈���z�́c�c)";
		mes "[�p�g���[������]";
		mes "�c�c���ق�I";
		mes "�܂��A�y�ȌĂѕ��ł��ǂ��ł��B";
		mes "�܊p�ł�����A�p�g���[������";
		mes "�������Ă݂܂��񂩁H";
		next;
		mes "[�p�g���[������]";
		mes "���̉��������ɕK�v������";
		mes "�L�ڂ���Ύ葱���͊����ł��B";
		mes "�p�g���[���̔C�����s��";
		mes "�Œ���̐g���̊m�F���K�v�Ȃ̂ŁB";
		next;
		mes "[�C�[�O���p�g���[�����̉�������]";
		mes "�E���K���ł͂���܂����ˁH";
		mes "�E�g�̂͌��N�ł����H";
		mes "�E�S�ɂ�Ƃ�͂���܂����H";
		mes "�E�p�g���[���ɂ͖����Q���\�H";
		mes "----";
		mes "��薳���Ȃ珐�����肢���܂��B";
		next;
		menu "��������",-;
		mes "[�p�g���[������]";
		mes "�ق��I�@�����������������ˁB";
		mes "�����Ƃ����K�����ɈႢ�Ȃ��B";
		mes "�ł́A�C�[�O���p�g���[������";
		mes "���_�����Ƃ��ēo�^�����Ă��炨���B";
		next;
		delquest 18127;
		setquest 130470;	//showevent 0, 1, �p�g���[������#iws;	// 2533: 23, 115
		set EP19_1QUE,13;
		mes "[�p�g���[������]";
		mes "���������p�g���[���ɏo�|���悤�B";
		mes "�܂��͈�l�̃p�[�e�B�[�����񂾁B";
		mes "�������o������A���ɐ����|���Ă���B";
		close;
	}
	if(EP19_1QUE == 14) {
		mes "[�p�g���[������]";
		mes "�͂��߂Ẵp�g���[��";
		mes "�����l�I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�p�g���[���̓r���ŏo�����";
		mes "�@�N�̂��Ƃ��C�ɂȂ�ȁc�c";
		mes "�@^ff0000�u���ĕt�����؂̕����v^000000��";
		mes "�@�N��T���Ă݂悤���j";
		close;
	}
	if(EP19_1QUE >= 15) {
		mes "[�p�g���[������]";
		mes "�C�X�K���h�ւ悤�����I";
		mes "��X�́u�C�[�O���p�g���[�����v�I";
		mes "�u���ĕt�����؁v�n���";
		mes "�p�g���[������ւ荂�������Ȃ̂ł��I";
		close;
	}
	mes "[�p�g���[������]";
	mes "���߂Ẵp�g���[�����ˁH";
	mes "�x�e�����̃p�g���[������������";
	mes "�ꏏ�����牽���S�z�͂���Ȃ��I";
	next;
	mes "^e6328c�������A���_���W����";
	mes "�u�͂��߂Ẵp�g���[���v��";
	mes "�����Ɠ��ꂪ�s���܂��B";
	next;
	if(mdopenstate("�͂��߂Ẵp�g���[��"))
		set '@menu$,"^0b0b33�������A���_���W�����֓���";
	else if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@menu$,"^0b0b33�������A���_���W�����̍쐬";
	else
		set '@menu$,"";
	switch(select("^191970��������",'@menu$,"^0b0b33���ӎ����̊m�F")) {
	case 1:
		mes "�]���̏�𗣂ꂽ�]";
		close;
	case 2:
		if(mdopenstate("�͂��߂Ẵp�g���[��")) {
			mes "[�p�g���[������]";
			mes "����ł́A�p�g���[���ɏo����!!";
			next;
			if(select("^191970�����l����","^e6328c�͂��߂Ẵp�g���[���֌�����") == 1) {
				mes "�]���̏�𗣂ꂽ�]";
				close;
			}
			mes "�]�]�����u�Ő�֐i�񂾁]";
			close2;
			if(getonlinepartymember() > 1) {
				mes "^8c32e6���̃������A���_���W�����́A";
				mes "1�l�p�ł��B";
				mes "�p�[�e�B�[�����o�[��";
				mes "2�l�ȏ�̏ꍇ�͓���ł��܂���B";
				mes "������x�m�F���Ă���";
				mes "��蒼���Ă��������B";
				close;
			}
			switch(mdenter("�͂��߂Ẵp�g���[��")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[�͂��߂Ẵp�g���[��] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("FirstPatrolControl1")+ "::OnStart";
				//warp "1@iwp.gat", 380, 229;
				end;
			case 1:	// �p�[�e�B�[������
				mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
				mes "����ł��܂���B";
				mes "������x�m�F���Ă���";
				mes "��蒼���Ă��������B";
				close;
			case 2:	// �_���W�������쐬
				mes "^8c32e6�p�[�e�B�[���[�_�[��";
				mes "�������A���_���W������";
				mes "�������Ă��Ȃ���Ԃł��B";
				close;
			default:	// ���̑��G���[
				close;
			}
		}
		else {
			if(getonlinepartymember() < 1) {
				mes "^8c32e6�󔒂̃p�[�e�B�[���ł́A";
				mes "�������A���_���W������";
				mes "�쐬���邱�Ƃ͏o���܂���B";
				close;
			}
			mes "�������A���_���W�������쐬���܂����H";
			next;
			if(select("^191970�����l����","^e6328c�쐬����") == 1) {
				mes "[�p�g���[������]";
				mes "�}���ł���킯�ł͂Ȃ���";
				mes "���Ԃ̓s����������A�܂����Ă���B";
				mes "�����������V����������";
				mes "�҂��Ă��邩��ˁI";
				close;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0))
				close;
			mdcreate "�͂��߂Ẵp�g���[��";
			mes "���p�[�e�B�[��";
			mes "^009eff"+strcharinfo(1)+"^000000";
			mes "���p�[�e�B�[���[�_�[";
			mes "^009eff"+strcharinfo(0)+"^000000";
			mes "�@";
			mes "^006400�͂��߂Ẵp�g���[����";
			mes "�쐬�\�����󂯕t���܂����B^000000";
			close;
		}
	case 3:
		mes "�ڂ����͂���������m�F���������B";
		mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�p�g���[������#iws(2533)
	end;
}

icecastle.gat,21,118,6	script	�ꓙ���z������#exiwp	21516,{/* 2534 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,25,113,4	script	����#iwp_1	857,{/* 2535 */
	mes "[����]";
	mes "�u�C�[�O���p�g���[�����v�ł�";
	mes "���Ƀp�g���[���̔C�ɓ�����";
	mes "�ӔC���̂���`���҂��W���܂��B";
	next;
	mes "[���i�v��]";
	mes "�E�g�̌��N�ňӎv�a�ʂ̂ł���";
	mes "�@���K���ȊO�̑S�Ă̎푰";
	next;
	mes "[�₢���킹��]";
	mes "<�C�[�O���p�g���[����>";
	mes "[�p�g���[������] �}�[�V���E�W�W�E�n�b�s�[�E���[���E�C���E�A���X�E���C�h�E�u���[�h���}�C���f�B�h�E�e�X�E�{�A�e�b�N�X";
	close;
}

icecastle.gat,178,229,4	script	����#iwp_2	857,{/* 2536 */
	mes "[����]";
	mes "�u�C�[�O���p�g���[�����v�ł�";
	mes "���Ƀp�g���[���̔C�ɓ�����";
	mes "�ӔC���̂���`���҂��W���܂��B";
	next;
	mes "[���i�v��]";
	mes "�E�g�̌��N�ňӎv�a�ʂ̂ł���";
	mes "�@���K���ȊO�̑S�Ă̎푰";
	next;
	mes "[�₢���킹��]";
	mes "<�C�[�O���p�g���[����>";
	mes "[�p�g���[������] �}�[�V���E�W�W�E�n�b�s�[�E���[���E�C���E�A���X�E���C�h�E�u���[�h���}�C���f�B�h�E�e�X�E�{�A�e�b�N�X";
	close;
}

jor_back2.gat,250,30,0	script	�}�q���o��p#flunch	139,14,14,{/* 2537 */
	if(EP19_1QUE == 14) {
		cloakoffnpc "��̐N#flunch";
		unittalk getcharid(3),strcharinfo(0)+" : ����H�I���̐N�́H",1;
	}
	else if(EP19_1QUE == 15) {
		cloakoffnpc "��̐N#flunch";
	}
	else if(EP19_1QUE == 16) {
		cloakonnpc "��̐N#flunch";
		cloakoffnpc "�}�q��#flunch";
	}
	end;
}

jor_back2.gat,231,34,0	script	jor_back2_lunch_sw1	139,{/* 2538 */}
jor_back2.gat,250,49,0	script	jor_back2_lunch_sw2	139,{/* 2539 */}
jor_back2.gat,269,46,0	script	jor_back2_lunch_sw3	139,{/* 2540 */}
jor_back2.gat,250,30,2	script	��̐N#flunch	10453,{/* 2541 (cloaking)*/
	switch(EP19_1QUE) {
	case 14:
		cutin "ep19_lunch01.png", 2;
		mes "[��̐N]";
		mes "�܂���܂����ˁI";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�C���V�I���̎����̂́c�c�I";
		next;
		mes "[��̐N]";
		mes "�o���Ă��Ă��ꂽ�̂ł����H";
		mes "����Ȑl�͂���܂ł��Ȃ������̂�";
		mes "�������ł��I";
		cutin "ep19_lunch02.png", 2;
		next;
		cutin "ep19_lunch01.png", 2;
		mes "[��̐N]";
		mes "���H�@���O�H�H";
		mes "����Ȃ�HU-210426�Ɛ\���܂��B";
		mes "���̃o�[�R�[�h��ǂݎ���";
		mes "������͂��ł����H";
		next;
		cutin "ep19_lunch02.png", 2;
		mes "[��̐N]";
		mes "�C���V�I���̉Ȋw�҂�������Ȃ��̂�";
		mes "����ȓ���͎����Ă��܂��񂩁B";
		mes "�����A�ނ���t�Ɉ��S���܂����B";
		mes "�������A�悩�����玄�ɖ��O��";
		mes "�t���Ă���܂��񂩁H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�}�q���c�c�Ƃ����̂́H";
		mes "���傤�ǐ^���̎��Ԃ���";
		mes "HU-210426�ƌĂԂ��";
		mes "�Ăт₷������B";
		next;
		mes "[��̐N]";
		mes "�}�q���c�}�q���c�c";
		mes "����A�ĂшՂ����O�ł��ˁB";
		mes "�ł͂��ꂩ���";
		mes "�}�q���ƌĂ�ł��������B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�C�ɓ����Ă��ꂽ�悤���B";
		mes "�@���āc�c�j";
		next;
		menu "�ǂ�����ē����ė����́H",-;
		cutin "ep19_lunch01.png", 2;
		mes "[�}�q��]";
		mes "�ǂ�����b������悢���̂��H";
		mes "����傫�ȓ@���";
		mes "�����̂悤�ɉȊw�҂�����";
		mes "�F��Ȏ���������Ă������̂��Ƃł��B";
		mes "�����Ȃ�Ȋw�҂�����";
		mes "�ב�����n�߂܂����B";
		next;
		mes "[�}�q��]";
		mes "���̍ہA���u���������̂����܂�����";
		mes "�}�q���͉Ȋw�҂ƈꏏ�ɔ�s�D��";
		mes "�悹���܂����B";
		mes "�܂��A�悭���邱�Ƃł��B";
		next;
		mes "[�}�q��]";
		mes "�����ɓ��������Ȋw�҂�����";
		mes "���̒����푰�c�c���K���ɏo�";
		mes "���K���Ɖ��������n�߂܂�����";
		mes "����ɁA���B�͕��u����܂����B";
		next;
		mes "[�}�q��]";
		mes "���u���ꂽ�����̂͐��サ��";
		mes "�₪�ē����Ȃ��Ȃ�܂����B";
		mes "���́A���̎����̂ƈ����";
		mes "���ɉ����������";
		mes "�G�l���M�[�����o����̂�";
		mes "��~�͂��܂���ł����B";
		next;
		mes "[�}�q��]";
		mes "���ǁA���ЂƂ�ɂȂ�܂�����";
		mes "�ދ��őދ��Łc�c";
		mes "�����Łu���K���v�ɕϐg����";
		mes "�B�̒�����E�o���Ă�����ł��B";
		next;
		menu "���K���ɕϐg!?",-;
		cutin "ep19_lunch02.png", 2;
		mes "[�}�q��]";
		mes "�����Ǝv���܂��񂩁H";
		mes "�����̂ɂ͂ł��Ȃ�����";
		mes "�ŗL�̔\�͂ł��B";
		mes "�������u�ϐg�X�N���[���v���g����";
		mes "���ȊO�̐l���ϐg�������܂��B";
		next;
		mes "[�}�q��]";
		mes "�Ȃ�ɂł��ϐg�ł���킯�ł�";
		mes "����܂��񂯂�";
		mes "���K���݂����Ȏ푰�Ȃ�";
		mes "�ϐg�\�ł���B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 5983;
		setquest 5984;
		set EP19_1QUE,15;
		//showevent 0, 1, ��̐N#flunch;	// 2541: 250, 30
		//showevent 0, 1, �z����#if19ms;	// 2544: 27, 126
		getitem 101162,1;
		mes "[�}�q��]";
		mes "���������ł�����";
		mes "�ϐg�p�̃X�N���[���������܂��B";
		mes "����͖����ŗǂ��ł���B";
		mes "���O�����ꂽ����ł��B";
		next;
		cutin "ep19_lunch02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i�������̂���ɓ���Ă��܂����B";
		mes "�@��x�A�X�̏�ɖ߂���";
		mes "�@�݂�ȂɌ��Ă��炨�����j";
		close2;
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icecastle.gat", 27, 121;
		end;
	case 15:
		cutin "ep19_lunch01.png", 2;
		mes "[�}�q��]";
		mes "���������ł�����";
		mes "�ϐg�p�̃X�N���[���������܂��B";
		mes "����͖����ŗǂ��ł���B";
		mes "���O�����ꂽ����ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�������̂���ɓ���Ă��܂����B";
		mes "�@��x�A�X�̏�ɖ߂���";
		mes "�@�݂�ȂɌ��Ă��炨�����j";
		next;
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icecastle.gat", 27, 121;
		end;
	}
OnInit:
	setnpctitle "<HU-210426>";	// NPC:��̐N#flunch(2541)
	cloakonnpc;
	end;
}
jor_back2.gat,250,30,2	script	�}�q��#flunch	10453,{/* 2542 (cloaking)*/
	cutin "ep19_lunch01.png", 2;
	mes "[�}�q��]";
	mes "�u�ϐg�X�N���[���v��";
	mes "���ɗ����Ă��܂����H";
	close2;
	cutin "ep19_lunch01.png", 255;
	end;
OnInit:
	setnpctitle "<HU-210426>";	// NPC:�}�q��#flunch(2542)
	cloakonnpc;
	end;
}

icecastle.gat,27,126,0	script	#e19ms00	139,9,9,{/* 2543 */
	if(EP19_1QUE == 10) {
		//showevent 0, 1, #to_icas_in;	// 2470: 213, 175
		viewpoint 1, 213, 175, 1, 0xFFFF00;
	}
	if(EP19_1QUE == 15 || EP19_1QUE == 58)
		cloakoffnpc "�z����#if19ms";
	else
		cloakonnpc "�z����#if19ms";
	if(EP19_2QUE == 18 || EP19_2QUE == 19) {
		cloakoffnpc "���n�[��#ep19_3";
	}
	else {
		cloakonnpc "���n�[��#ep19_3";
		cloakonnpc "�t���[�f���P#ep19����";
		cloakonnpc "�e���[���A��#ep19����";
		cloakonnpc "�}�[�N�C�V��#ep19����";
		cloakonnpc "�}�M�X�e�B��#ep19����";
		cloakonnpc "�A���v�I�J�[�g#ep19����";
	}
	if(EP19_1QUE >= 100)
		cloakoffnpc "�z����#ep19_dq_dowsing";
	else
		cloakonnpc "�z����#ep19_dq_dowsing";
	end;
}

icecastle.gat,27,126,3	script	�z����#if19ms	10461,{/* 2544 (cloaking)*/
	switch(EP19_1QUE) {
	case 15:
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "���҂��H";
		mes "���o���̖����z�c�c�B";
		emotion 1;
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�����I";
		mes "��ǂ��z���ė����Ƃ����`���҂��I";
		mes "��Ċ������B";
		emotion 0;
		next;
		cutin "ep19_iwin06.png", 255;
		menu "�ǂ���l�c�H",-;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�����Ƃ���Ꮈ��I";
		mes "�p�g���[������߂��Ă�����";
		mes "������Ȃ�����������������";
		mes "�C�����Ȃ������݂������B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���́A^0000cd�z����^000000�ƌ����B";
		mes "�A�[�E�B���ȊO�ɂ͐�������";
		mes "�������Â炢�炵������";
		mes "�P�Ƀz�����ƌĂ�ł���B";
		mes "�Ƃ���ŌN�͉������Ă����́H";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "��@�ɍs���Ă܂���",-;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�ق��A�N�̎��͂͊m�����Ă��Ƃ��B";
		mes "���ꂩ��u�X�̏�v�ɕ񍐂��ɍs���́H";
		mes "�Ȃ�A�ꏏ�ɍs�����B";
		mes "���傤�Ǎ���̂��Ƃőł����킹��";
		mes "�s�Ȃ���ƕ����ė����񂾂�B";
		next;
		cutin "ep19_iwin06.png", 255;
		cloakonnpc "�z����#if19ms";
		delquest 5984;
		setquest 17639; showevent 0, 1, �I�[�����[#e19ms00;	// 2546: 34, 189
		set EP19_1QUE,16;
		mes "�]�X�̏� �����֌������܂����H�]";
		next;
		//showevent 9999, 0, #to_jor_back1;	// 2457: 17, 123
		//showevent 9999, 0, #to_icas_in;	// 2470: 213, 175
		//showevent 9999, 0, #in_house5;	// 2494: 62, 137
		//showevent 9999, 0, �p�g���[������#iws;	// 2533: 23, 115
		//showevent 0, 1, �z����#if19ms;	// 2544: 27, 126
		//showevent 9999, 0, �z����#ep19_dq_dowsing;	// 2791: 27, 126
		//showevent 9999, 0, �V��������#ep19iwin06;	// 2822: 52, 124
		//showevent 9999, 0, ���n�[��#ep19_3;	// 2916: 27, 123
		//showevent 9999, 0, #in_house1;	// 2917: 59, 213
		if(select("������","��߂�") == 2) {
			// ������
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏� �����֌��������]";
		close2;
		warp "icas_in.gat", 35, 186;
		end;
	case 16:
		mes "[�z����]";
		mes "���ꂩ��u�X�̏�v�ɕ񍐂��ɍs���́H";
		mes "�Ȃ�A�ꏏ�ɍs�����B";
		mes "���傤�Ǎ���̂��Ƃőł����킹��";
		mes "�s�Ȃ���ƕ����ė����񂾂�B";
		mes "�@";
		mes "�]�X�̏� �����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏� �����֌��������]";
		close2;
		warp "icas_in.gat", 35, 186;
		end;
	case 58:
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "���႟�����`�`���I";
		mes "�Ȃ�̂��肾�I";
		mes "�ǂ����āA���K����A��ė�����!?";
		next;
		cutin "ep19_iwin07.png", 255;
		menu "���Â���K�v�������ł��I",-;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�c�c������肻�����ȁB";
		mes "���̉Ƃ��߂�����";
		mes "�������񂻂��ɉ^�ڂ��B";
		mes "�b�͂����ŕ�����B";
		delquest 16661;
		setquest 17640;
		set EP19_1QUE,59;
		close2;
		//showevent 0, 1, #in_house5;	// 2494: 62, 137
		//showevent 9999, 0, �z����#if19ms;	// 2544: 27, 126
		//showevent 0, 1, �z����#i19ms00;	// 2686: 247, 116
		cutin "ep19_iwin06.png", 255;
		cloakonnpc "�z����#if19ms";
		end;
	case 59:
		// ������
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,32,185,0	script	#ep19_cas_2	139,14,14,{/* 2545 */
	switch(EP19_1QUE) {
	case 16:
	case 17:
	case 34:
	case 68:
	case 100:
		cloakoffnpc "�I�[�����[#e19ms00";
		cloakoffnpc "�z����#e19ms00";
		cloakoffnpc "���C�W�[#e19ms00";
		cloakoffnpc "���H�[�N�����f#e19ms00";
		cloakoffnpc "���n�[��#e19ms00";
		cloakoffnpc "���F���O���f#e19ms00";
		cloakoffnpc "�~���A��#e19ms00";
		cloakoffnpc "���I��#e19ms00";
		cloakoffnpc "�}����#e19ms00";
		end;
	}
}

icas_in.gat,34,189,5	script	�I�[�����[#e19ms00	10465,{/* 2546 (cloaking)*/
	switch(EP19_1QUE) {
	case 16:
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�҂��Ă�����B";
		mes "���傤�Ǎ���̂��Ƃ����c���邽�߂�";
		mes "�W�܂邱�Ƃɂ����́B";
		mes "�A�[�E�B���̑�\�҂�";
		mes "�Q�����Ă�����B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�z�����ł��B";
		mes "�x��Ă��܂����悤�Ő\����Ȃ��B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "����A���傤�ǑS�����������Ƃ����B";
		mes "�ł́A�n�߂܂��傤�B";
		mes "�W�܂��Ă���������R�͑��ł��Ȃ���B";
		mes "���K�������̍ŋ߂̊����ɂ��Ă�B";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[���I��]";
		mes "�ŋ߁A���K�������̓�����";
		mes "���������Ă��܂��B";
		mes "^0000cd���������K���h^000000��";
		mes "�������钛���ł͂Ȃ�����";
		mes "���O���Ă���̂ł��B";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[���F���O���f]";
		mes "����܂œz��́A�\�������s���͂���";
		mes "�����Ђ��߂Ă����B";
		mes "���炭�A��ǂ��z���ĐN������";
		mes "^0000cd�C���V�I��^000000�Ɗ֌W�������";
		mes "�v���܂��B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�����A���������K���h��";
		mes "��������悤�Ȃ��Ƃ������";
		mes "�~�b�h�K���h�嗤�̋��ЂƂȂ�B";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[�~���A��]";
		mes "^0000cd���~���̐S���̌���^000000��";
		mes "�Ȃ�Ƃ��Ă����߂��Ȃ��Ɓc�c�B";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[���H�[�N�����f]";
		mes "�ł��Ă͑ʖڂ�B";
		mes "�r�Ɋo��������悤������";
		mes "����̂܂ܓz��̑��ɏ�荞�ނ̂�";
		mes "�댯�߂��邩��ˁB";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�Ȃ�΁A�܂��͏����W���B";
		mes "���K���̓z��̖{���n�Ɋւ�����́H";
		mes "�����Ȃ��́H";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[���H�[�N�����f]";
		mes "�ӂށc�c�A�[�E�B���̕��X��";
		mes "�����c�����Ă��܂��񂩁H";
		mes "�z��Ƃ̕t�������������ł��傤����";
		mes "�m���Ă��鎖������Ώ���";
		mes "�񋟂��Ă������������B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�����ԁA�������Ă��܂�����";
		mes "�z��̋��_�Ɋւ��Ă�";
		mes "���̑S�e��c���ł��Ă��܂���B";
		next;
		mes "[�z����]";
		mes "���_�ł��鑃���̓�����";
		mes "�ꂩ���݂̂ł���";
		mes "���̉��͑z�����ł��Ȃ��قǐ[����";
		mes "�Ԃ̖ڏ�̂悤�ɍL�����Ă��܂��B";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "�����Ɍ������Č����@��";
		mes "��������U�����d�|����Ƃ��H";
		mes "����ȊȒP�Șb�ł͂Ȃ����c�c�B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "��͂ɂ��ẮH";
		mes "�g�D�̍\���Ƃ�";
		mes "�퓬���̐��Ƃ��B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�z���^0000cd����^000000��";
		mes "����Ȃ����̂��B";
		mes "���đ����̗E�m�𑒂���";
		mes "���̎�p�𒲂ׂĂ͂��邯��";
		mes "�������S�ɉ𖾂ł��Ă��Ȃ���B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�킧�c�c�킩��Ȃ����Ƃ��炯���B";
		mes "�z��̂��Ƃ𒼐ڒ��ׂ邽�߂�";
		mes "�����ɐ����ł��Ȃ����Ǝv�����񂾂���";
		mes "�ق�A�����ڂ��炵�ĈႤ����H";
		mes "�������璭�߂邱�Ƃ����ł��Ȃ������B";
		next;
		mes "[���C�W�[]";
		mes "���܂����ƃ��K���ɕϑ��ł����";
		mes "�z��̑��ɐ������ĒT������邱�Ƃ�";
		mes "�o�������Ȃ񂾂��Ȃ��B";
		next;
		menu "���������΁c�c",-;
		cutin "ep19_leizi03.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�p�g���[�����Ɏ�ɓ��ꂽ�̂ł���";
		mes "�ʔ������������Ă��܂���B";
		mes "������Ǝ����Ă݂܂��傤�B";
		next;
		if(!sleep2(500)) end;
		misceffect 595,"";
		sc_start SC_MONSTER_TRANSFORM,180000,21529;
		if(!sleep2(1500)) end;
		cutin "ep19_iwin07.png", 1;
		mes "[�z����]";
		mes "���K���b!!";
		mes "���̎׈��Ȏ҂ǂ��߂�!!";
		next;
		cutin "ep19_iwin07.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�܁A�҂��Ă�������!!";
		mes "���́c�c�B";
		mes "�@";
		mes "^0000FF�]�C���V�I���̋��_���瓦���ė���^000000";
		mes "^0000FF�@�}�q������ϐg�X�N���[����^000000";
		mes "^0000FF�@��ɓ��ꂽ���Ƃ���������]^000000";
		next;
		misceffect 348,"";	// self
		sc_end SC_MONSTER_TRANSFORM;	// self
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���킟�`�܂��s�v�c���ˁ`�B";
		mes "�悵�A���̃X�N���[�����g����!!";
		mes "���K���ɕϐg�����";
		mes "�{���n�ɔE�э��߂邼�B";
		next;
		mes "[���C�W�[]";
		mes "�Ƃ����킯��";
		mes "���̃X�N���[�������ɂ���B";
		mes "����H";
		mes "�Ȃ�ł݂�Ȗق��Ă�́H";
		unittalk getnpcid(0,"���H�[�N�����f#e19ms00"),"�c�c";
		unittalk getnpcid(0,"���n�[��#e19ms00"),"�c�c";
		unittalk getnpcid(0,"���F���O���f#e19ms00"),"�c�c";
		unittalk getnpcid(0,"�~���A��#e19ms00"),"�c�c";
		unittalk getnpcid(0,"�z����#e19ms00"),"�c�c";
		unittalk getnpcid(0,"���I��#e19ms00"),"�c�c";
		unittalk getnpcid(0,"�I�[�����[#e19ms00"),"�c�c";
		next;
		mes "[���C�W�[]";
		mes "���̏�ɁA���K���̏���m���Ă�҂�";
		mes "���Ȃ���ȁH";
		mes "�����炳��̖{���n���͂ɂ���";
		mes "�m�肽���񂶂�Ȃ��́H";
		mes "�����đ厖������B";
		next;
		mes "[���C�W�[]";
		mes "���A���������ĖY��Ă�H";
		mes "���������͎��̏\���ԁB";
		mes "�����E�Ƃɂ��Ă�񂾂�B";
		mes "����蓾�ӂȐl�͂��Ȃ���ˁH";
		next;
		mes "[���C�W�[]";
		mes "������A�����s���񂾂�B";
		mes "�ϐg�X�N���[����������������";
		mes "�u�肵�Ă�킯����Ȃ����B";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[�~���A��]";
		mes "��l�ōs���̂͊댯�ł��B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���S�Ƃ͒������d����";
		mes "�������Ă�񂾂��ǂˁH";
		mes "�������";
		mes strcharinfo(0)+"�ɂ�";
		mes "���Ă��炤�B";
		mes "�����������Ă����Ȃ�����B";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[���H�[�N�����f]";
		mes strcharinfo(0)+"�̎��͂�";
		mes "�^���킯����Ȃ�����";
		mes "�G�̉��ɓ���̂�����";
		mes "�ǂ��������ĐS���ƂȂ���ˁB";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[���F���O���f]";
		mes "�Ƃ͂����A�吨�ōs���킯�ɂ�";
		mes "�����Ȃ��ł��傤�B";
		mes "�������s�����z�Ȃ̂�����";
		mes "�u�肷��҂����邩�ǂ����B";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[�~���A��]";
		mes "�����s���܂��B";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "��������`�����܂��B";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "�����s���B";
		mes "���҂ł���A�[�E�B������";
		mes "�擪�ɗ����Ȃ���΁B";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[���F���O���f]";
		mes "���܂�ˁB";
		mes "���K�������͂��݂��̖��͂�";
		mes "���m�ł���͂�������";
		mes "�����p�ӂ����u���΁v��";
		mes "�����čs���Ɨǂ���B";
		next;
		mes "[���F���O���f]";
		mes "�����̂��߂�";
		mes "���K���̊j������o�������̂�B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���������I�@�p�ӂ͎����ɁI";
		mes "���ɂ͂�������̖��΂����������B";
		mes "�ق�A�����Ă����ɂ�";
		mes "���͂��Ȃ�����������B";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[���I��]";
		mes "�F����A�����͂��Ȃ��ł��������B";
		mes "����ƁA���ꂮ����T�d�ɁB";
		mes "�G�̋��_�ɐN������̂ł�����ˁB";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���̏鉺����k���̕��p�ɂ���";
		mes "^ff0000���ĕt�����؂̕X��^000000��";
		mes "�z��̑��̓����������B";
		mes "��������N���ł���͂���B";
		next;
		cutin "ep19_aurelie01.png", 255;
		delquest 17639;
		setquest 17619;	//showevent 0, 1, #to_jor_back1;	// 2457: 17, 123�@showevent 0, 1, #to_jor_back2;	// 2458: 226, 387�@showevent 0, 1, #to_jor_back3;	// 2460: 13, 248�@showevent 0, 1, �z����#e19ms12;	// 2565: 99, 318
		set EP19_1QUE,17;
		mes "�]��̊O�֌������܂����H�]";
		next;
		//showevent 9999, 0, ���n�[��#ep19lehar06;	// 2525: 141, 216
		//showevent 9999, 0, ���I��#ep19leon01;	// 2526: 138, 220
		//showevent 0, 1, �I�[�����[#e19ms00;	// 2546: 34, 189
		//showevent 9999, 0, �z����#e19ms00;	// 2547: 32, 184
		//showevent 9999, 0, �`�F������#ep19re2;	// 2678: 245, 197
		//showevent 9999, 0, ���C�W�[#ep19re2;	// 2680: 245, 197
		//showevent 9999, 0, �~���A��#ep19re1;	// 2681: 249, 199
		//showevent 9999, 0, �z����#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ���F���O���f#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, ���C�W�[#i19ms00;	// 2688: 246, 119
		//showevent 9999, 0, �I�[�����[#i19ms00;	// 2693: 249, 113
		//showevent 9999, 0, �]������#ep19_dq_kitche;	// 2780: 241, 66
		//showevent 9999, 0, ���I��#ep19leon02;	// 2781: 42, 252
		//showevent 9999, 0, �~���A��#ep19_dq_victim;	// 2783: 48, 252
		//showevent 9999, 0, �~���A��#ep19miriam06;	// 2787: 260, 180
		//showevent 9999, 0, �}����#ep19maram05;	// 2788: 262, 179
		//showevent 0, 3, ���H�[�N�����f#ep19;	// 2904: 163, 226
		//showevent 9999, 0, �}����#ep19;	// 2908: 130, 201
		//showevent 9999, 0, ���n�[��#ep19;	// 2909: 136, 197
		//showevent 9999, 0, ���F���O���f#ep19vell02;	// 2955: 185, 63
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]��̊O�֌��������]";
		close2;
		warp "icecastle.gat", 22, 123;
		end;
	case 17:
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���̏鉺����k���̕��p�ɂ���";
		mes "^ff0000���ĕt�����؂̕X��^000000��";
		mes "�z��̑��̓����������B";
		mes "��������N���ł���͂���B";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "�]��̊O�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]��̊O�֌��������]";
		close2;
		warp "icecastle.gat", 22, 123;
		end;
	case 34:
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�݂�ȁA�����ŗǂ�������B";
		mes "�������������ǁA�z��̑��Œm�������Ƃ�";
		mes "�񍐂��Ă��傤�����B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�����\���𒲂ׂ���";
		mes "��͂�o������͈ꂩ�������B";
		mes "�����͋ɂ߂ĕ��G�������B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "��Ղ��d���̂�";
		mes "�閧���ɐV�����������@��";
		mes "��������U�ߓ���Ƃ������Ƃ�";
		mes "�s�\���Ǝv���܂��B";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "��͂ɂ��Ăł���";
		mes "�ނ�͐�������";
		mes "�ŏ㋉���牺���܂Ŏ�ނ��l�X�ł���";
		mes "����������͂�����Ă��܂��B";
		next;
		mes "[���n�[��]";
		mes "���̖��ׁ͂̈A�����ł����Ă�";
		mes "���ʂ̐l�Ԃł͎��������Ȃ��ł��傤�B";
		next;
		mes "[���n�[��]";
		mes "�g�D�\���ɂ��Ăł���";
		mes "���K�������̃g�b�v��";
		mes "^0000cd���X�K���h^000000�c�c";
		mes "���������K���h�Ƃ̍ŏI����ɂ����Ă�";
		mes "�������т��A���̎҂ł��B";
		next;
		mes "[���n�[��]";
		mes "���݂́A���X�K���h�𒆐S�Ƃ���";
		mes "���c���`�����Ă��܂��B";
		mes "��̎҂̖��߂͐�΂Ƃ���";
		mes "���S�ȊK���Љ�ł��B";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[���I��]";
		mes "���������Ă���ƌ����܂���";
		mes "���X�K���h�����|���Ă��܂���";
		mes "�Ȃ�Ƃ��Ȃ邩������Ȃ��c�c�B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���X�K���h��_���ɂ�";
		mes "���̒��ɍU�ߍ��ނ�";
		mes "�O�ɂ��т��o�������Ȃ����c�c";
		mes "�x�������d�ŋ߂Â��ǂ��납";
		mes "���鎖�����ł��Ȃ������B";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "���C�W�[����B";
		mes "�ŏ㋉���K���̗���𗘗p����";
		mes "���X�K���h���牽������";
		mes "�����o�����Ƃ͂ł��Ȃ��ł����H";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�l���Ȃ������킯����Ȃ���H";
		mes "�����A�ŏ㋉���K����";
		mes "���S�N�����Ă���z������Ă��B";
		mes "���܂ꂽ�Ă̐Ԃ����ł�";
		mes "������肪����񂾂�ˁB";
		next;
		mes "[���C�W�[]";
		mes "�܂��A���҂���Ă�Ȃ�";
		mes "�Ȃ�Ƃ�����Ă݂�B";
		mes "�����A���Ԃ͕K�v���낤�ˁB";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���X�K���h�̎���ɂ���̂�";
		mes "�킸���ȑ��߂�����";
		mes "�C���V�I���́u�o�S�b�g�v�����ł��B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�o�S�b�g�́A���X�K���h�ɋ��͂���";
		mes "���̌��Ԃ�Ɍ����̎x�����󂯂Ă���B";
		mes "���̋����֌W���Ă���ȁB";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�o�S�b�g�ȊO�ɂ��C���V�I���̐l�Ԃ�";
		mes "����Ǝv���̂����ǁH";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�C���V�I���̉Ȋw�҂̓o�S�b�g�̑���";
		mes "�u�����P�A�v�Ƃ����҂����܂��B";
		mes "����ƃn�[�g�n���^�[�����������B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����c�c�����P�A�ɂ��Ă�";
		mes "�ȑO�قǗD������Ă��Ȃ��悤�ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���K�������Ƌ��͊֌W��z�����̂�";
		mes "�����P�A�̂悤�ł���";
		mes "�o�S�b�g�����Ă����";
		mes "�󋵂��ς���Ă���悤�ł��B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���~���̐S���̌��Ђ�";
		mes "��͂胋�K���̑���";
		mes "�������܂ꂽ�̂ł��傤���H";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���邱�Ƃ͂ł��Ȃ���������";
		mes "�ԈႢ�Ȃ��o�S�b�g�������Ă���ȁB";
		mes "�o�S�b�g�����X�K���h��";
		mes "�C�ɓ���ꂽ�̂�";
		mes "���~���̐S���̌��Ђ��g����";
		mes "���������Ă��邩�炾�B";
		next;
		mes "[���C�W�[]";
		mes "���X�K���h���A���������̖�����";
		mes "�o�S�b�g�Ɋ|�����Ă���A�Ƃ�";
		mes "���Ẳh�������߂�����";
		mes "�����Ȃ��Ƃ�";
		mes "�����Ă���͕̂������ȁB";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "���Ẳh�������߂��A���c�c";
		mes "��͂�A���������K���h�̕�����";
		mes "�ژ_��ł���̂�����H";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "���ʂقǒm�肽�������񂾂���";
		mes "���X�K���h�͋����Ă���Ȃ�������B";
		mes "�Ԃ����͂����A�����Ⴀ�Ƌ��������B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�͂��c�c";
		mes "���ɂ͉�������H";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "�����Ă���l���������܂��B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "��s�D�ŉ^�΂�ė����l�Ԃ�����";
		mes "�����Ɏg��ꂽ��";
		mes "�������ŘJ���ɏ]���������Ă����B";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "�߂Ȃ��l�B������ȏ�";
		mes "�A��ė����Ȃ��悤��";
		mes "��s�D���������������悳�����ł��B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����ƁA�������I";
		mes ""+strcharinfo(0)+"��";
		mes "�z�����ɁA���̃�����n���Ă������B";
		next;
		menu "���̃����ł����H",-;
		mes "[���C�W�[]";
		mes "��s�D���ǂ��ɂ��������Ǝv���Ă��B";
		mes "�W���W���[�ɑ��k����";
		mes "���낢�땷���Ă������񂾁B";
		mes "�匫�җl�̔�s�D�Ɋւ���";
		mes "��`�̏��݂����Ȃ��̂��B";
		next;
		mes "[���C�W�[]";
		mes "�����Ǝg���������邾�낤�B";
		mes "��s�D�ɉ������鎞��";
		mes "��������Ă���B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "���ׂ����Ƃ�";
		mes "����ɂ킽��Ƃ����킯�ˁc�c";
		mes "���āA�ǂ�����Đ؂���������H";
		mes "�Ȃ�ł�������B";
		mes "�����Ă͂Ȃ�������B";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�����P�A�͂ǂ��H";
		mes "���B�ɂ͗F�D�I����������";
		mes "�ޏ�������������o���Ȃ����H";
		mes "����Ă݂鉿�l�͂���Ǝv���B";
		next;
		mes "[���C�W�[]";
		mes "����"+strcharinfo(0)+"��";
		mes "�ʓ|���Ă�����Ă���݂���������";
		mes "��肭���𕷂��o����񂶂�Ȃ��H";
		next;
		cutin "ep19_lehar01.png", 0;
		mes "[���n�[��]";
		mes "������̕��͂��C�����܂��B";
		mes "���́A�����Ă���l������";
		mes "�~�o������@�𒲂ׂĂ݂܂��B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�������Ă����Ə������B";
		mes "�\����Ȃ��̂�����";
		mes "���݂̍j�́A�L�~���������Ȃ́B";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "���҂����̂��Ĉ����C������Ȃ��B";
		mes "���ꂶ�Ⴀ�A���������ĊJ���ȁB";
		mes "���������s���Ƃ��悤���B";
		next;
		delquest 17636;
		setquest 17638;
		set EP19_1QUE,35;
		mes "�]�ւ̑��֌������܂����H�]";
		cutin "ep19_leizi01.png", 255;
		next;
		//showevent 0, 1, �I�[�����[#e19ms00;	// 2546: 34, 189
		//showevent 9999, 0, �z����#e19ms00;	// 2547: 32, 184
		//showevent 9999, 0, �]������#ep19_dq_kitche;	// 2780: 241, 66
		//showevent 9999, 0, �}����#ep19;	// 2908: 130, 201
		//showevent 9999, 0, ���n�[��#ep19;	// 2909: 136, 197
		//showevent 9999, 0, ���F���O���f#ep19vell02;	// 2955: 185, 63
		//showevent 0, 1, ���C�W�[#ep19re1;	// 2661: 127, 207
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�ւ̑��֌��������]";
		close2;
		warp "jor_nest.gat", 123, 203;
		end;
	case 35:
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���K���̑��ɐ�������";
		mes "�C���V�I���̃����P�A����";
		mes "���������o���Ȃ��������ė~�����B";
		next;
		mes "[�I�[�����[]";
		mes "�\����Ȃ��̂�����";
		mes "���݂̍j�́A�L�~���������Ȃ́B";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "�]�ւ̑��֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�ւ̑��֌��������]";
		close2;
		warp "jor_nest.gat", 123, 203;
		end;
	case 68:
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�z��̖{���n�ɏ�荞�񂾂̂�";
		mes "�܂������n�������Ƃ͂ˁB";
		mes "�����ɂ���c�c�B";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[���I��]";
		mes "���̉��ɕ��Ă����܂܂Ƃ�";
		mes "�l���ɂ����B";
		mes "�܂�������H�ׂĐ����Ă���킯�ł�";
		mes "�Ȃ����낤����ˁB";
		next;
		cutin "ep19_voglinde01.png", 2;
		mes "[���H�[�N�����f]";
		mes "���̉��ɔ閧�̏o�������";
		mes "����̂�������܂���ˁB";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���������Ȃ�";
		mes "�A�[�E�B���B�̃p�g���[����";
		mes "�������Ȃ��ƁI";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[���I��]";
		mes "������ɂ���A��s�D���g��Ȃ�����";
		mes "�C�X�K���h����͏o���Ȃ��B";
		next;
		mes "[�z����]";
		mes "��s�D���g�킹�Ȃ����߂�";
		mes "�H���������t�����Ă���B";
		mes "��΂ɊO�ɂ͏o���Ȃ��I";
		cutin "ep19_iwin08.png", 2;
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[���F���O���f]";
		mes "�c�c�ӂށB";
		mes "���낻��߂��Ă��鍠���B";
		next;
		menu "�N���ł��H",-;
		cutin "ep19_juncea03.png", 2;
		cloakoffnpc "�����P�A#e19ms00";
		mes "[�����P�A]";
		mes "�����́A�ǂ��ɍs���Ă�";
		mes "������ˁc�c�B";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[���F���O���f]";
		mes "�x��������ˁB";
		mes "�����킩�������Ƃ������";
		mes "�݂�Ȃɋ��L���Ă����H";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c���������Ă�����";
		mes "�x���Ȃ����̂�B";
		mes "�ł��A���̂��Ƃ��ǂ�����";
		mes "���l�ɋ��L���Ȃ��Ƃ����Ȃ��́H";
		unittalk getnpcid(0,"���C�W�[#e19ms00"),"���C�W�[ : �����P�A�T�}�@�I";
		unittalk getnpcid(0,"�����P�A#e19ms00"),"�����P�A : �Ђ����I�@�߂Â��ȁI";
		next;
		cutin "ep19_vellgunde02.png", 1;
		mes "[���F���O���f]";
		mes "�������ɋ��͂���Ɩ񑩂������ˁH";
		mes "������A���K���̑��ɖ߂���";
		mes "�����������o�����Ƃɋ����o������B";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�c�c�킩������A�񑩂͖񑩂�����B";
		mes "�܂����̌�������";
		mes "�o�S�b�g�̌������ɂ�����������";
		mes "�قƂ�ǎc���ĂȂ������B";
		mes "�o�S�b�g���^�яo������ł��傤�ˁB";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "�c�c���������Ύc���Ă����̂�";
		mes "�������ꂽ���K�����炢�������ȁB";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[���I��]";
		mes "�������A���B�𑫎~�߂�";
		mes "������܂ł̎��Ԃ��҂����߂̂���";
		mes "�������悤�Ɏv���܂��B";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "����������́A�㋉���K��������";
		mes "���͂𒍓��������Ƃ��C�ɂȂ�B";
		mes "�㋉�̃��K���ɑ΂��Ă�";
		mes "�����ޗ��Ɏg�����Ƃ͋ւ����Ă����B";
		mes "�Ȃ̂ɁA�ǂ����āc�c�B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "���i�K�ł��邱�Ƃ͌����Ă����B";
		mes "���������A���̔����J������@��";
		mes "�T�邵���Ȃ���ˁB";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�O�ɏo�Ă���\�����l������";
		mes "�p�g���[�����������܂��I";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "���ƃ��I���́A������ɔ�����";
		mes "���E���h�邪�Ȃ��悤������";
		mes "�i�߂Ă����Ƃ��悤�B";
		next;
		mes "[�I�[�����[]";
		mes "�L�~�́A��������������܂�";
		mes "�x��ł���Ɨǂ���B";
		mes "���������������";
		mes "�����ɘA�����邩��B";
		close2;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		setquest 202365;
		delquest 17649;
		set EP19_1QUE,100;
		getitem 1000608,50;
		for(set '@i,0; '@i < 80; set '@i,'@i+1) {
			getexp 2000000000,0,0;
			getexp 0,1400000000,0;
		}
		delitem 1000605,1;
		setquest 17637;
		setquest 16663;
		cutin "ep19_aurelie01.png", 255;
		//showevent 9999, 0, "�I�[�����[#e19ms00";	// 2532: 34, 189
		//showevent 0, 3, "�z����#e19ms00";	// 2533: 32, 184
		//@showevent 0, 3;	// 2766: 241, 66
		//@showevent 0, 1;	// 2767: 42, 252
		//@showevent 0, 3;	// 2890: 163, 226
		end;
	case 100:
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "���K��������ł��|�����";
		mes "�v���Ă����̂ɁA�c�O����B";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	end;
OnInit:
	setnpctitle "[����]";	// NPC:�I�[�����[#e19ms00(2546)
	cloakonnpc;
	end;
}

icas_in.gat,32,184,1	script	�z����#e19ms00	10461,{/* 2547 (cloaking)*/
	cutin "ep19_iwin06.png", 2;
	mes "[�z����]";
	if(EP19_1QUE == 16) {
		mes "��@�̕񍐂�Y�ꂸ�ɁI";
	}
	else if(EP19_1QUE == 17) {
		mes "���K���̑��ɐ�������Ȃ��";
		mes "�l�������Ȃ������ȁI";
	}
	else if(EP19_1QUE == 34) {
		mes "���K���̑��ł̏o������";
		mes "�񍐂��悤�I";
	}
	else if(EP19_1QUE == 35) {
		mes "���K���̑��֍s�����B";
		mes "���Ȃ��Ƃ����Ȃ����Ƃ͑������B";
	}
	else if(EP19_1QUE >= 68) {
		if(checkquest(17650)&8)
			mes "�������Ă���Ă��肪�Ƃ��I";
		else
			mes "����̑΍���������Ȃ��ẮB";
	}
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,34,183,3	script	���C�W�[#e19ms00	10454,{/* 2548 (cloaking)*/
	cutin "ep19_leizi01.png", 0;
	mes "[���C�W�[]";
	if(EP19_1QUE == 16) {
		mes "�����ʔ������̂ł��������H";
	}
	else if(EP19_1QUE == 17) {
		mes "���K���ɕϐg�ł���Ȃ�āI";
		mes "�����A�����o�����悤�I";
	}
	else if(EP19_1QUE == 34) {
		mes "�������̐��ʂ�";
		mes "�݂�Ȃɒm�点�悤�I";
	}
	else if(EP19_1QUE == 35) {
		mes "���x�́A�����Əڂ������ׂȂ��ƂȁB";
	}
	else if(EP19_1QUE == 68) {
		mes "�Ђ�`��ꂽ�B";
		mes "����̓n�[�h�ȔC���������ȁB";
	}
	else if(EP19_1QUE == 100) {
		mes "���Ƃ���������������肵�Ȃ��H";
		mes "�Ⴞ��܍���Ă��������I";
	}
	close2;
	cutin "ep19_leizi01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,32,182,1	script	���H�[�N�����f#e19ms00	10467,{/* 2549 (cloaking)*/
	cutin "ep19_voglinde01.png", 0;
	mes "[���H�[�N�����f]";
	if(EP19_1QUE == 16) {
		mes "�O��������Ă����̂����H";
		mes "�I�[�����[�l���C�ɂ��Ă���ꂽ��B";
	}
	else if(EP19_1QUE == 17) {
		mes "�{���ɑ��v�����H";
		mes "�ق�A���΂���������";
		mes "�����čs���Ƃ����B";
	}
	else if(EP19_1QUE == 34) {
		mes "�݂�ȁA�A�i�^�̘b��";
		mes "�����������Ă���݂����ˁB";
	}
	else if(EP19_1QUE == 35) {
		mes "�������K���̑���";
		mes "�������Ă݂�����B";
	}
	else if(EP19_1QUE == 68) {
		mes "����̑΍�����c���Ȃ��ƂˁB";
	}
	else if(EP19_1QUE == 100) {
		mes "�z��̓������킩��Ȃ��ȏ�";
		mes "�p�g���[���̋������K�v����ˁB";
	}
	close2;
	cutin "ep19_voglinde01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,30,188,5	script	���n�[��#e19ms00	10469,{/* 2550 (cloaking)*/
	cutin "ep19_lehar01.png", 0;
	mes "[���n�[��]";
	if(EP19_1QUE == 16) {
		mes "�O�̗l�q�͂ǂ��ł����H";
		mes "�����͕ςȐ������������ł��傤�B";
	}
	else if(EP19_1QUE == 17) {
		mes "�X�N���[�����g���ĕϐg����Ȃ��";
		mes "���߂Ăł�����";
		mes "�Ȃ񂾂��ْ����܂��ˁI";
	}
	else if(EP19_1QUE == 34) {
		mes "�������`���җl�̕���";
		mes "�񍐂ł��邱�Ƃ͑������ł��ˁB";
	}
	else if(EP19_1QUE == 35) {
		mes "�O��͌����ꂪ����܂���ł�������";
		mes "���͂����Ɗ撣��Ȃ��ƁI";
	}
	else if(EP19_1QUE == 68) {
		mes "������������";
		mes "�ǂ�����Ηǂ��̂ł��傤�H";
	}
	else if(EP19_1QUE == 100) {
		mes "�܂��܂���邱�Ƃ͑����ł��ˁB";
	}
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,30,183,1	script	���F���O���f#e19ms00	10468,{/* 2551 (cloaking)*/
	cutin "ep19_vellgunde01.png", 1;
	mes "[���F���O���f]";
	if(EP19_1QUE == 16) {
		mes "�O������ė����́H";
		mes "�����ʔ������̂͌�������������H";
	}
	else if(EP19_1QUE == 17) {
		mes "���̃X�N���[���̂��Ƃ�����";
		mes "�����[�������Ώۂ���B";
	}
	else if(EP19_1QUE == 34) {
		mes "���낢�땷������";
		mes "�����Ȃ��Ƃ����Ȃ���ˁB";
	}
	else if(EP19_1QUE == 35) {
		mes "���K���̑��𒼐ڒ��ׂ���Ȃ�āB";
		mes "����ȋ@��Ɍb�܂��";
		mes "�����܂�����B";
	}
	else if(EP19_1QUE == 68) {
		mes "����ꂽ�����J������@���c�c";
		mes "�����ǂ��Ă͂��邩����H";
	}
	else if(EP19_1QUE == 100) {
		mes "�����P�A�ƈꏏ�ɁA���Ɏc���ꂽ���̂�";
		mes "���ׂĂ���̂�B";
	}
	close2;
	cutin "ep19_vellgunde01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,30,185,7	script	�~���A��#e19ms00	10377,{/* 2552 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	if(EP19_1QUE == 16) {
		mes "�����킩�������Ƃ�����܂����H";
	}
	else if(EP19_1QUE == 17) {
		mes "���K���̑��֌��������B";
		mes "�C���V�I���������ɂ���͂��ł��B";
	}
	else if(EP19_1QUE == 34) {
		mes "�������̓{�N�����ׂĂ��܂����B";
		mes "�`���҂���͏㋉���Ɋւ���������B";
	}
	else if(EP19_1QUE == 35) {
		mes "���~���̐S���̌��Ђ�";
		mes "���������ǂ��Ɂc�c�B";
	}
	else if(EP19_1QUE == 68) {
		mes "�����ꂽ�����J������@�c�c";
		mes "�{�N�ɂ͎v�����Ȃ��ȁB";
	}
	else if(EP19_1QUE == 100) {
		mes "���~���̐S���̌��Ђ�";
		mes "���������Ă��܂����݂����ł��B";
	}
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,32,189,5	script	���I��#e19ms00	10464,{/* 2553 (cloaking)*/
	switch(EP19_1QUE) {
	case 16:
		cutin "ep19_leon01.png", 0;
		mes "[���I��]";
		mes "�O�̗l�q�͂������ł������H";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 17:
		mes "�ϐg�X�N���[���ł����c�c";
		mes "���`�`��c�c";
		mes "���͉��������Ă��������܂��B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 34:
		mes "���K���̑��ł̏o������";
		mes "�񍐂��Ă��������܂����H";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 35:
		mes "���K����؂�������@��";
		mes "�T���Ȃ��Ƃ����܂���B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 68:
		mes "���������́A�F�ő��k���܂��傤�B";
		mes "�ǂ��l�����o�邩������܂���B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 100:
		cloakoffnpc "�~���A��#e19ms00";
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����Ƃ���ɂ�������Ⴂ�܂����ˁB";
		mes "���I���l���l�肪�K�v�������ł��B";
		mes "�肪�󂢂Ă������Ȃ̂́c�c";
		mes "�`���җl�ƃ~���A���l���ȁH";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�������ˁB";
		mes "�}�����́A�������B��";
		mes "�A����S�����Ă��āA";
		mes "���i�͔�s�D�ŉ�����";
		mes "�ꐶ�����^�񂾂�A";
		mes "���F���O���f�l�̑��Ŏ�`���Ă����B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����ł����H";
		mes "�܂���l����Α���邩�ȁB";
		mes "�l�肪�K�v�炵���ł��B";
		mes "���͈Ⴄ�d��������܂��āc";
		next;
		mes "[���n�[��]";
		mes "���I���l�A���̂�����ő��v�ł����H";
		next;
		cutin "ep19_leon01.png", 0;
		mes "[���I��]";
		mes "�����A���Ȃ���B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "������܂����B";
		mes "����ł͖`���҂���A";
		mes "�ꏏ�ɍs�������H";
		close2;
		cutin "ep18_miriam_01.png", 255;
		// DQ����O�͖�����
		end;
	}
	end;
OnInit:
	setnpctitle "[����]";	// NPC:���I��#e19ms00(2553)
	cloakonnpc;
	end;
}

icas_in.gat,29,187,7	script	�}����#e19ms00	10376,{/* 2554 (cloaking)*/
	cutin "ep18_maram_01.png", 1;
	mes "[�}����]";
	if(EP19_1QUE == 16) {
		mes "�����ʔ������̂͂���܂������H";
	}
	else if(EP19_1QUE == 17) {
		mes "���͕⋋�����̒��B��";
		mes "��O�������Ǝv���܂��B";
	}
	else if(EP19_1QUE == 34) {
		mes "�������Ȃ悤�ň��S���܂����B";
		mes "�~���A�����������Ă��Ȃ���";
		mes "�S�z���Ă�����ł��B";
	}
	else if(EP19_1QUE == 35) {
		mes "�����l�ł��B";
		mes "���܂薳�����Ȃ��ł��������ˁB";
	}
	else if(EP19_1QUE >= 68) {
		mes "�����ȒP�ɖ��͉������܂���ˁB";
	}
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,35,180,1	script	�����P�A#e19ms00	10455,{/* 2555 (cloaking)*/
	cutin "ep19_juncea03.png", 2;
	mes "[�����P�A]";
	mes "�ӂ��c�c";
	mes "������Ɣ�ꂽ�B";
	close2;
	cutin "ep19_juncea03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,318,0	script	#e19ms11	139,14,14,{/* 2556 */
	if(EP19_1QUE == 17) {
		cloakoffnpc "�z����#e19ms11";
		cloakonnpc "���C�W�[#e19ms11";
		cloakonnpc "���n�[��#e19ms11";
		cloakonnpc "�~���A��#e19ms11";
		cloakonnpc "�z����#e19ms12";
		cloakonnpc "���C�W�[#e19ms12";
		cloakonnpc "���n�[��#e19ms12";
		cloakonnpc "�~���A��#e19ms12";
	}
	if(EP19_1QUE == 18) {
		cloakonnpc "�z����#e19ms11";
		cloakonnpc "���C�W�[#e19ms11";
		cloakonnpc "���n�[��#e19ms11";
		cloakonnpc "�~���A��#e19ms11";
		cloakoffnpc "�z����#e19ms12";
		cloakonnpc "���C�W�[#e19ms12";
		cloakonnpc "���n�[��#e19ms12";
		cloakonnpc "�~���A��#e19ms12";
	}
	end;
}

jor_back3.gat,77,311,0	script	jor_back3_sw_1	139,{/* 2557 */}
jor_back3.gat,85,296,0	script	jor_back3_sw_2	139,{/* 2558 */}
jor_back3.gat,114,296,0	script	jor_back3_sw_3	139,{/* 2559 */}
jor_back3.gat,121,311,0	script	jor_back3_sw_4	139,{/* 2560 */}

jor_back3.gat,99,318,3	script	�z����#e19ms11	10461,{/* 2561 (cloaking)*/
	if(EP19_1QUE == 17) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			cutin "ep19_iwin06.png", 2;
			cloakoffnpc "���n�[��#e19ms11";
			cloakoffnpc "�~���A��#e19ms11";
			cloakoffnpc "���C�W�[#e19ms11";
			cloakonnpc "�z����#e19ms12";
			cloakonnpc "���C�W�[#e19ms12";
			cloakonnpc "���n�[��#e19ms12";
			cloakonnpc "�~���A��#e19ms12";
			mes "[�z����]";
			mes "�����A�u�ϐg�X�N���[���v���g����";
			mes "���K���ɕϐg���܂��傤�I";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		}
		cutin "ep19_iwin06.png", 2;
		cloakoffnpc "���n�[��#e19ms11";
		cloakoffnpc "�~���A��#e19ms11";
		cloakoffnpc "���C�W�[#e19ms11";
		cloakonnpc "�z����#e19ms12";
		cloakonnpc "���C�W�[#e19ms12";
		cloakonnpc "���n�[��#e19ms12";
		cloakonnpc "�~���A��#e19ms12";
		mes "[�z����]";
		mes "���K���ɕϐg���܂����ˁB";
		mes "���낻��z��̑������߂��̂�";
		mes "���̕ӂ�ŁA��X���ϐg���܂��傤�B";
		next;
		cutin "ep19_iwin06.png", 255;
		misceffect 594,"�z����#e19ms11";
		cloakonnpc "�z����#e19ms11";
		cloakoffnpc "�z����#e19ms12";
		if(!sleep2(1000)) end;
		misceffect 594,"���n�[��#e19ms11";
		cloakonnpc "���n�[��#e19ms11";
		cloakoffnpc "���n�[��#e19ms12";
		if(!sleep2(500)) end;
		misceffect 594,"�~���A��#e19ms11";
		cloakonnpc "�~���A��#e19ms11";
		cloakoffnpc "�~���A��#e19ms12";
		mes "[�~���A��]";
		mes "���ꂪ���K���̎p�c�c";
		mes "���K���炵�������ɂ͗��K���K�v�����B";
		next;
		mes "[���C�W�[]";
		mes "�ӂށB�݂�Ȗ����ɕϐg�����ȁB";
		mes "����p��������������";
		mes "���S���ĕϐg�ł����B";
		unittalk getnpcid(0,"���n�[��#e19ms11"),"���n�[�� : �������Ŏ�������!?";
		misceffect 598,"���C�W�[#e19ms11";
		cloakonnpc "���C�W�[#e19ms11";
		cloakoffnpc "���C�W�[#e19ms12";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,97,318,5	script	���C�W�[#e19ms11	10454,{/* 2562 (cloaking)*/
	if(EP19_1QUE == 17) {
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���̐�ɁA���K���̑���";
		mes "����������炵���B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,315,1	script	���n�[��#e19ms11	10469,{/* 2563 (cloaking)*/
	if(EP19_1QUE == 17) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���K���̑����߂��̂�";
		mes "���̕ӂ�ŕϐg���܂��傤�B";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,96,316,7	script	�~���A��#e19ms11	10377,{/* 2564 (cloaking)*/
	if(EP19_1QUE == 17) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�z�������񂪌����ɂ�";
		mes "���̐�Ƀ��K���̑������邻���ł��B";
		mes "�����ŏ��������܂��傤���B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,318,3	script	�z����#e19ms12	21529,{/* 2565 (cloaking)*/
	if(EP19_1QUE == 17) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			cloakonnpc "���n�[��#e19ms11";
			cloakonnpc "�~���A��#e19ms11";
			cloakonnpc "���C�W�[#e19ms11";
			cloakoffnpc "�z����#e19ms12";
			cloakoffnpc "���C�W�[#e19ms12";
			cloakoffnpc "���n�[��#e19ms12";
			cloakoffnpc "�~���A��#e19ms12";
			mes "[�z����]";
			mes "�����A�u�ϐg�X�N���[���v���g����";
			mes "���K���ɕϐg���܂��傤�I";
			close;
		}
		cloakonnpc "���n�[��#e19ms11";
		cloakonnpc "�~���A��#e19ms11";
		cloakonnpc "���C�W�[#e19ms11";
		cloakoffnpc "�z����#e19ms12";
		cloakoffnpc "���C�W�[#e19ms12";
		cloakoffnpc "���n�[��#e19ms12";
		cloakoffnpc "�~���A��#e19ms12";
		mes "[�z����]";
		mes "�S���A���K���ɕϐg�ł������H";
		mes "���I";
		next;
		mes "[�~���A��]";
		mes "�������ł��H";
		next;
		mes "[�z����]";
		mes "�`���҂ƍŌ�ɕϐg�����l�ԁI";
		next;
		mes "[���C�W�[]";
		mes "���H";
		mes "��肭�ϐg�ł��Ă�Ǝv�����ǁH";
		next;
		mes "[�z����]";
		mes "�c�c�u�����v�̖�肾�B";
		mes "���K���͖��͂ɂ���ĊO�����قȂ�B";
		mes "���𑽂͂������Đ��܂��ق�";
		mes "�l�Ԃ̎p�ɋ߂��Ȃ�B";
		next;
		menu "���C�W�[����͐l�Ԃ��ۂ��ł���",-;
		mes "[���n�[��]";
		mes "�z��������̌����ʂ�ł��B";
		mes "���B�̓����́u�����v�ł���";
		mes "�`���җl�́u�㋉�v�B";
		mes "���C�W�[����́u�ŏ㋉�v�ł���I";
		next;
		mes "[���n�[��]";
		mes "�c�c���A���������āc�c";
		mes "���F���O���f�f��l����������";
		mes "���΂̐����e�����Ă�̂����H";
		mes "���������ǂꂾ���̖��΂�";
		mes "������ė�����ł���!!??";
		next;
		mes "[�z����]";
		mes "�d���Ȃ��B��l�́A�����Ɏc���Ă���B";
		mes "�㋉�ƍŏ㋉�͐������Ȃ�����";
		mes "���݂��Ɋ���悭�m���Ă���B";
		mes "�m��Ȃ���̏㋉�ƍŏ㋉��������";
		mes "�����܂�Ă��܂����B";
		next;
		mes "[���C�W�[]";
		mes "����͂ł��Ȃ����k���ȁB";
		mes "�����ǂ����Ă����ɗ����Ǝv���Ă�H";
		mes "�ǂ�Ȏ���g���Ăł�";
		mes "���K���̑��ɐN�����Ȃ�����Ȃ��B";
		next;
		mes "[���C�W�[]";
		mes "���Ⴀ�A�������悤�I";
		mes "���Ɩ`���҂�";
		mes "���܂ꂽ�Ẵ��K���̂ӂ������I";
		mes "�z��́u������z��v�ƕ�������";
		mes "�������߂Ă�킯����Ȃ��񂾂�H";
		next;
		mes "[�z����]";
		mes "�c�c�����Ȃ���킾�B";
		mes "�ł́A�N�����ɓ�l��";
		mes "���܂ꂽ�Ẵ��K���̂ӂ�����Ă���B";
		mes "���ꂪ�ʗp���Ȃ��Ȃ�";
		mes "���B�����Ő�������B";
		next;
		mes "[���C�W�[]";
		mes "�͂͂��I";
		mes "���̍΂ɂȂ��ĐԎq�̐^������Ƃ́B";
		mes "������`���҂������A�[���Ύ����I";
		next;
		mes "[�z����]";
		mes "���ꂶ�Ⴀ�A�l�q�����Ȃ���";
		mes "��l�����̐�̓�������";
		mes "�z��̑��ɐ������Ă���B";
		mes "�����́A���A��ɂȂ��Ă��邩��B";
		cloakonnpc "���n�[��#e19ms12";
		if(!sleep2(1000)) end;
		cloakonnpc "�~���A��#e19ms12";
		if(!sleep2(1000)) end;
		cloakonnpc "���C�W�[#e19ms12";
		delquest 17619;
		setquest 17620; //showevent 0, 1, #to_jor_dun02;	// 2464: 10, 238 showevent 0, 1,�~���A��#e19ms20;	// 2572: 263, 170
		set EP19_1QUE,18;
		close;
		//showevent 0, 1, #to_jor_dun01;	// 2462: 63, 326
		//showevent 9999, 0, �z����#e19ms12;	// 2565: 99, 318
	}
	if(EP19_1QUE == 18) {
		mes "[�z����]";
		mes "���ꂶ�Ⴀ�A�l�q�����Ȃ���";
		mes "��l�����̐�̓�������";
		mes "�z��̑��ɐ������Ă���B";
		mes "�����́A���A��ɂȂ��Ă��邩��B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,97,318,5	script	���C�W�[#e19ms12	10475,{/* 2566 (cloaking)*/
	if(EP19_1QUE == 17) {
		mes "[���C�W�[]";
		mes "���̐�ɁA���K���̑���";
		mes "����������炵���B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,99,315,1	script	���n�[��#e19ms12	21529,{/* 2567 (cloaking)*/
	if(EP19_1QUE == 17) {
		mes "[���n�[��]";
		mes "���K���̑����߂��̂�";
		mes "���̕ӂ�ŕϐg���܂��傤�B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3.gat,96,316,7	script	�~���A��#e19ms12	21529,{/* 2568 (cloaking)*/
	if(EP19_1QUE == 17) {
		mes "[�~���A��]";
		mes "�z�������񂪌����ɂ�";
		mes "���̐�Ƀ��K���̑������邻���ł��B";
		mes "�����ŏ��������܂��傤���B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,263,170,0	script	#e19ms20	139,10,10,{/* 2569 */
	if(EP19_1QUE == 18) {
		cloakoffnpc "�~���A��#e19ms20";
		cloakoffnpc "�z����#e19ms21";
		cloakoffnpc "���n�[��#e19ms21";
		cloakoffnpc "���C�W�[#e19ms21";
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[�~���A��]";
			mes strcharinfo(0)+"����B";
			mes "�����ł̓��K���ɕϐg��������";
			mes "�ǂ������ł��B";
			close;
		}
	}
	if(EP19_1QUE == 19) {
		cloakoffnpc "�~���A��#e19ms20";
	}
	//20,21������
	if(EP19_1QUE == 22) {
		cloakonnpc "�~���A��#e19ms20";
		cloakonnpc "���C�W�[#e19ms21";
		cloakonnpc "�z����#e19ms21";
		cloakonnpc "���n�[��#e19ms21";
	}
	//23,24������
	if(EP19_1QUE == 25 || EP19_1QUE == 26) {
		cloakoffnpc "�~���A��#e19ms20";
	}
	end;
}

jor_dun02.gat,245,173,0	script	jor_dun02_sw_1	139,{/* 2570 */}
jor_dun02.gat,260,152,0	script	jor_dun02_sw_2	139,5,5,{/* 2571 */}

jor_dun02.gat,263,170,3	script	�~���A��#e19ms20	21529,{/* 2572 (cloaking)*/
	switch(EP19_1QUE) {
	case 18:
		cloakoffnpc "�z����#e19ms21";
		cloakoffnpc "���n�[��#e19ms21";
		cloakoffnpc "���C�W�[#e19ms21";
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[�~���A��]";
			mes strcharinfo(0)+"����B";
			mes "�����ł̓��K���ɕϐg��������";
			mes "�ǂ������ł��B";
			close;
		}
		mes "[�~���A��]";
		mes "�ǂ��ɂ����ꂽ����ǁc�c";
		mes "���̂Ƃ����";
		mes "�N�ɂ��C�Â���ĂȂ��݂����B";
		next;
		mes "[���n�[��]";
		mes "������ł�����";
		mes "���K�����āA�ǂ̂悤�ɉ�b���܂����H";
		mes "�l�Ԃ̌��t�𒝂��Ă�";
		mes "���v�Ȃ�ł��傤���H";
		next;
		mes "[�z����]";
		mes "����͖�薳���B";
		mes "��X�Ɠ������x���ŉ�b���ł���B";
		mes "�����A���܂ꂽ�Ă̂ӂ������Ȃ�";
		mes "���ӂ��Ă���B";
		next;
		mes "[�z����]";
		mes "�����m��Ȃ��Ԏq�̂悤��";
		mes "�U�������Ƃ��B";
		mes "�K���㋉�ƍŏ㋉�ɑ΂��Ă�";
		mes "���ʑҋ��̂͂�������";
		mes "�ςȂ��Ƃ�������Ȃ���Ηǂ��B";
		next;
		mes "[���C�W�[]";
		mes "������`������`�I";
		unittalk getcharid(3),strcharinfo(0)+" : �c�c�ςȕ��ł��H�ׂ܂����H",1;
		next;
		mes "[�z����]";
		mes "��������͕ʂ�čs�����悤�B";
		mes "���͂������񐼑��֍s���Ă݂�B";
		next;
		mes "[���C�W�[]";
		mes "����A���Ɩ`���҂�";
		mes "�����֍s���Ă݂悤���B";
		next;
		mes "[�~���A��]";
		mes "�{�N�́A���̕t�߂𒲂ׂĂ݂�B";
		next;
		mes "[�z����]";
		mes "�悵�A���ꂶ��c�c�B";
		next;
		cloakoffnpc "���K��#e19ms21";
		emotion 23,"�~���A��#e19ms20";
		emotion 23,"�z����#e19ms21";
		emotion 23,"���C�W�[#e19ms21";
		emotion 23,"���n�[��#e19ms21";
		mes "[���K���i��]";
		mes "���O�����A�W�܂��ĉ����c�c��H";
		next;
		mes "[���K���i��]";
		mes "����A�勳�l�I�H";
		mes "���̂悤�ȏꏊ�ł�����������??";
		next;
		emotion 23,"�z����#e19ms21";
		cloakoffnpc "���K��#e19ms22";
		mes "[���K���i��]";
		mes "�c�c���������ȁB";
		mes "����͉��̑������H";
		next;
		emotion 23,"���K��#e19ms22";
		mes "[�z����]";
		mes "�����I";
		mes "����قǁA���̕�������";
		mes "������z�������̂����܂����I";
		next;
		mes "[���K���i��]";
		mes "�Ȃ񂾂��āH";
		mes "�����͏㋉�z����ł͂Ȃ��̂ɁI";
		next;
		mes "[���K���i��]";
		mes "����ȂƂ���ŁA�i�Ջ���";
		mes "�勳�l���̎҂����܂��Ƃ́I";
		mes "���������A���Ԃ�̂��Ƃ��낤!!";
		next;
		mes "[���K���i��]";
		mes "�������Ă���ꍇ�ł͂Ȃ��B";
		mes "���̓�l���A�㋉���ɘA��čs�����B";
		next;
		mes "[���K���i��]";
		mes "�����A���̕��֍s���܂��傤�B";
		next;
		mes "[���K���i��]";
		mes "�ŉ����̎҂�����";
		mes "�G�����̔��f���ł�����";
		mes "�P���|�����Ă��邩������܂���";
		mes "�ǂ������������������B";
		delquest 17620;
		setquest 17621;
		set EP19_1QUE,19;
		viewpoint 1, 18, 31, 2, 0xFFFF00;
		close2;
		//showevent 9999, 0, �~���A��#e19ms20;	// 2572: 263, 170
		cloakonnpc "���C�W�[#e19ms21";
		cloakonnpc "���K��#e19ms21";
		cloakonnpc "���K��#e19ms22";
		end;
	case 19:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			// �������H
			mes "[�~���A��]";
			mes strcharinfo(0)+"����B";
			mes "�����ł̓��K���ɕϐg��������";
			mes "�ǂ������ł��B";
			close;
		}
		mes "[�~���A��]";
		mes "����̓`�����X�ł��B";
		mes "���̃��K�������ƈꏏ��";
		mes "���Ɍ������Ă��������B";
		viewpoint 1, 18, 31, 2, 0xFFFF00;
		close;
	case 25:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[�~���A��]";
			mes strcharinfo(0)+"����B";
			mes "�����ł̓��K���ɕϐg��������";
			mes "�ǂ������ł��B";
			close;
		}
		mes "[�~���A��]";
		mes "�c�c"+strcharinfo(0)+"����B";
		mes "�{�N�ł��A�~���A���ł��B";
		next;
		menu "�悭�C�Â��܂�����",-;
		mes "[�~���A��]";
		mes "�ǂ��������t�߂ɂ�";
		mes "�㋉�ȏ�̃��K���͗��Ȃ��悤�ł��B";
		mes "�Ȃ̂ɁA�㋉�̃��K����";
		mes "����Ȃ����^�тœ����Ă��邩��";
		mes "�`���҂��񂾂Ƃ킩��܂����B";
		next;
		mes "[�~���A��]";
		mes "����ɂ��Ă��A�ǂ�������ł��H";
		mes "���C�W�[����ƈꏏ��";
		mes "���ɍs�����͂��ł́c�c�B";
		next;
		mes "^0000FF�]�~���A���ɏ㋉���K���̗��̊k��^000000";
		mes "^0000FF�@�T���Ă��邱�Ƃ���������]^000000";
		next;
		mes "[�~���A��]";
		mes "�{�N�͂��̕t�߂𒲂ׂĂ�������";
		mes "�����́A�����̗��̛z����݂����B";
		mes "^0000cd�㋉�̗�^000000�͕ʂ̏ꏊ��";
		mes "�u����Ă���݂����B";
		next;
		mes "[�~���A��]";
		mes "�z��������ƃ��n�[������";
		mes "�㋉���Ɍ�����ꂽ�̂�";
		mes "����l�̂Ƃ���ɍs���Ă݂Ă��������B";
		mes "���݂��Ă����͂��ł��B";
		delquest 17627;
		setquest 17628;
		set EP19_1QUE,26;
		next;
		//showevent 9999, 0, �~���A��#e19ms20;	// 2572: 263, 170
		//showevent 9999, 0, �x�����K��#e19ms95;	// 2618: 153, 239
		//showevent 9999, 0, �~���A��#e19ms91;	// 2621: 150, 269
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 0, 1, ���K���i��#e19ms81;	// 2600: 23, 58
		cutin "ep19_juncea01.png", 255;
		mes "�]�㋉�z����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�㋉�z����֌��������]";
		close2;
		warp "jor_nest.gat", 28, 61;
		end;
	case 26:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "[�~���A��]";
			mes strcharinfo(0)+"����B";
			mes "�����ł̓��K���ɕϐg��������";
			mes "�ǂ������ł��B";
			close;
		}
		mes "[�~���A��]";
		mes "�z��������ƃ��n�[������";
		mes "�㋉���Ɍ�����ꂽ�̂�";
		mes "����l�̂Ƃ���ɍs���Ă݂Ă��������B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "�]�㋉�z����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�㋉�z����֌��������]";
		close2;
		warp "jor_nest.gat", 28, 61;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,261,166,7	script	�z����#e19ms21	21529,{/* 2573 (cloaking)*/
	mes "[�z����]";
	mes "���K���̑��A�ɓ������̂�";
	mes "�͂��߂Ă���B";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,263,167,1	script	���C�W�[#e19ms21	10475,{/* 2574 (cloaking)*/
	if(EP19_1QUE == 18) {
		mes "[���C�W�[]";
		mes "�������������܂ꂽ�ꏊ�H";
		mes "���܂�ς��Ƃ��Ȃ��Ȃ��B";
		close;
	}
	if(EP19_1QUE == 19) {
		// ������
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,263,165,1	script	���n�[��#e19ms21	21529,{/* 2575 (cloaking)*/
	mes "[���n�[��]";
	mes "�o�����ɐ����ł����̂ł��傤���B";
	mes "�]�N�]�N���Ă��܂��܂��ˁB";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,256,169,5	script	���K��#e19ms21	10470,{/* 2576 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,254,168,5	script	���K��#e19ms22	10472,{/* 2577 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,185,49,3	script	���K���i��#e19ms31	10470,5,5,{/* 2578 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K���i��]";
		mes "�N���l�Ԃ������ɓ��ꂽ�I";
		mes "�����ǂ��o��!!";
		close;
	}
	switch(EP19_1QUE) {
	case 19:
		mes "[���K���i��]";
		mes "�݂�ȁI";
		mes "�����A��ė������X�����Ă���I";
		mes "�V�����勳�l�������܂�ɂȂ����̂��I";
		next;
		mes "[���K���i��]";
		mes "�c�c�v���Ԃ肶��Ȃ����B";
		mes "^0000cd�ŋ߂͖ő��ɂȂ�����^000000�̂ɁB";
		next;
		mes "[���K���i��]";
		mes "���z�͂��ꂾ�����H";
		mes "���̂���l�͂Ȃ��";
		mes "������悩�琶�܂ꂽ�̂���I";
		next;
		mes "[���K���i��]";
		mes "�Ȃ񂾂��āH";
		mes "������悩��??";
		next;
		mes "[���K���i��]";
		mes "^0000cd���^000000���I";
		mes "���������K���h�l��";
		mes "�����̒����ɈႢ�Ȃ�!!";
		next;
		cloakoffnpc "���K���勳#e19ms31";
		mes "[���K���勳]";
		mes "���������ȁB";
		mes "���������A�������܂ꂽ�ƁH";
		next;
		mes "[���K���i��]";
		mes "�勳�l�I";
		unittalk "���K���i�� : �勳�l�I";
		unittalk getnpcid(0,"���K���i��#e19ms32"),"���K���i�� : �j�����I";
		unittalk getnpcid(0,"���K���i��#e19ms33"),"���K���i�� : �j�����I";
		next;
		mes "[���K���i��]";
		mes "������悩��V�����勳�l��";
		mes "�a�����ꂽ�̂ł��B";
		next;
		mes "[���K���勳]";
		mes "�ق��c�c������悩��B";
		mes "�ӂށA�ׂ̌�����Ȃ��i�Ղ́H";
		next;
		mes "[���K���i��]";
		mes "��������A��������";
		mes "�ꏏ�ɐ��܂ꂽ�悤�ł��B";
		next;
		mes "[���K���勳]";
		mes "�������B";
		mes "�ł́A^0000cd�T���N�K���h^000000�Ɍ�����";
		mes "���X�K���h�l�̂Ƃ���֘A��čs�����B";
		mes "�����̏j�������肢���Ȃ��ẮB";
		mes "�T���N�K���h�́A�ǂ��ɂ���H";
		next;
		mes "[���K���i��]";
		mes "���X�K���h�l�̖����󂯂�";
		mes "^0000cd�C���V�I�����^000000��";
		mes "�o���肵�Ă�����悤�ł��B";
		next;
		mes "[���K���勳]";
		mes "�ł͎����T���N�K���h��";
		mes "���̓�l�̂��Ƃ����肢����Ƃ��悤�B";
		mes "�N������l�͏j���̐�����󂯂�O��";
		mes "���̏ꏊ�ɂ��Ēm���Ă��炨�����B";
		next;
		mes "[���K���勳]";
		mes "�����͍L�ꂾ�B";
		mes "���i�́A�i�Ջ��ȏ�̃��K��������B";
		mes "���̏ꏊ�́A�����Ȃ���������悤�B";
		next;
		mes "[���C�W�[]";
		mes "���邷��ƁH";
		mes "����Ȋ����ŕ����΂����H";
		next;
		mes "[���K���勳]";
		mes "���������A�����ƁB";
		mes "�ق��c�c��B�������ȁB";
		mes "�܂�œ񑫕��s�̌o��������݂������B";
		mes "�����A�ē����邩����ė��Ȃ����B";
		next;
		mes "[���K���i��]";
		mes "���������K���h�l�Ƌ��ɁI";
		next;
		mes "[���K���i��]";
		mes "���������K���h�l�̏j�����I";
		unittalk "���K���i�� : ���������K���h�l�Ƌ��ɁI";
		unittalk getnpcid(0,"���K���i��#e19ms32"),"���K���i�� : ���������K���h�l�̏j�����I";
		delquest 17621;
		setquest 17622;
		set EP19_1QUE,20;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 0, 1, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		cloakonnpc "���K���勳#e19ms31";
		cloakonnpc "���C�W�[#e19ms31";
		end;
	case 20:
		mes "[���K���i��]";
		mes "�勳�l�ɂ��čs���񂾁B";
		mes "���̏ꏊ�ɂ���";
		mes "�����Ă��������邾�낤�B";
		close;
	case 21:	// ������
	case 22:
		mes "[���K���i��]";
		mes "�����ɂ͊���Ă������H";
		close;
	case 68:	// ������
	case 100:
		mes "[���K���i��]";
		mes "�͂��c�c���̑O�A�呛���ɂȂ��Ă��B";
		mes "�N�͑��v�������̂��H";
		close;
	}
OnTouch:
	if(EP19_1QUE == 19)
		cloakoffnpc "���C�W�[#e19ms31";
	else if(EP19_1QUE >= 68) {
		cloakonnpc "���K���i��#e19ms32";
		cloakonnpc "���K���i��#e19ms33";
	}
	end;
}

jor_nest.gat,182,45,7	script	���K���i��#e19ms32	10471,{/* 2579 */
	mes "[���K���i��]";
	mes "���΂炭����΁A�����Ɋ����B";
	mes "�킩��Ȃ����Ƃ������";
	mes "�N���ɕ����΂����B";
	close;
}

jor_nest.gat,186,46,1	script	���K���i��#e19ms33	10472,{/* 2580 */
	mes "[���K���i��]";
	mes "�����C�ɂȂ邱�Ƃ�����̂��H";
	close;
}

jor_nest.gat,182,50,5	script	���C�W�[#e19ms31	10475,{/* 2581 (cloaking)*/
	mes "[���C�W�[]";
	mes "�݂�ȁA�v�����ȏ�ɐe�؂���Ȃ��H";
	mes "�߂����ኽ�}���Ă����ˁB";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,180,48,5	script	���K���勳#e19ms31	10474,{/* 2582 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,196,202,0	script	#e19ms41	139,5,5,{/* 2583 */
	cloakonnpc "���K���勳#e19ms41";
	if(EP19_1QUE == 20 || EP19_1QUE == 21)
		cloakoffnpc "���K���勳#e19ms41";
	end;
}
jor_nest.gat,196,202,5	script	���K���勳#e19ms41	10474,{/* 2584 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K���勳]";
		mes "�N���l�Ԃ������ɓ��ꂽ�I";
		mes "�����ǂ��o��!!";
		close;
	}
	if(EP19_1QUE == 20) {
		cloakoffnpc "���C�W�[#e19ms41";
		mes "[���K���勳]";
		mes "���������Ȃ����B";
		mes "�����͎i�Ջ���勳���p�̛z���ꂾ�B";
		mes "�傫������I�ʂ�";
		mes "�z������܂ŊǗ����Ă���B";
		next;
		mes "[���K���勳]";
		mes "�������A�N���������܂ꂽ�ꏊ��";
		mes "�㋉�ȊO�̗���u���Ă��Ȃ��ꏊ���B";
		mes "�N�����͓��ʂȂ̂���B";
		mes "���������K���h�l�̊�ՂɈႢ�Ȃ��B";
		next;
		mes "[���K���勳]";
		mes "�z����́A���̂��������ɂ��邪";
		mes "�܂����Ԃ�����Ό��ĉ��Ƃ����B";
		next;
		mes "[���C�W�[]";
		mes "����́A�ȂɁH";
		next;
		mes "[���K���勳]";
		mes "����́A�l�Ԃ��ݒu�������̂��B";
		mes "���ɂ�葽���̖��͂�";
		mes "�������邽�߂̂��̂��B";
		next;
		mes "[���C�W�[]";
		mes "�j���Q���H";
		next;
		mes "[���K���勳]";
		mes "�����Ƃ͈Ⴄ�A���E�̌��������痈��";
		mes "�҂����̂��Ƃ��B";
		mes "���X�K���h�l�̔z���ɂ����";
		mes "�����ɑ؍݂��Ă���B";
		mes "�������Ƃ͌����ڂ��قȂ邩��";
		mes "����΂킩�邾�낤�B";
		next;
		mes "[���K���勳]";
		mes "�������A�C���V�I�����ɂ���";
		mes "�l�Ԃ����𑊎������悤�ɁB";
		mes "���͉���킵���҂������B";
		mes "�ł́A���̏ꏊ�ɍs�����B";
		delquest 17622;
		setquest 17623;
		set EP19_1QUE,21;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 0, 1, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		// ������
		cloakonnpc "���K���勳#e19ms41";
		cloakonnpc "���C�W�[#e19ms41";
		end;
	}
	if(EP19_1QUE == 21) {
		mes "[���K���勳]";
		mes "�ł́A���̏ꏊ�ɍs�����B";
		mes "���X�K���h�l�̂Ƃ����";
		mes "�A��čs���˂΁B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,193,200,5	script	���C�W�[#e19ms41	10475,{/* 2585 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,115,187,0	script	#e19ms51	139,5,5,{/* 2586 */
	cloakonnpc "���K���勳#e19ms51";
	if(EP19_1QUE == 21 || EP19_1QUE == 22)
		cloakoffnpc "���K���勳#e19ms51";
	end;
}

jor_nest.gat,115,187,3	script	���K���勳#e19ms51	10474,{/* 2587 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K���勳]";
		mes "�N���l�Ԃ������ɓ��ꂽ�I";
		mes "�����ǂ��o��!!";
		close;
	}
	if(EP19_1QUE == 21) {
		cloakoffnpc "���C�W�[#e19ms51";
		mes "[���K���勳]";
		mes "���̉�����قǘb����";
		mes "�l�Ԃ������؍݂��Ă����悾�B";
		next;
		mes "[���C�W�[]";
		mes "����B";
		next;
		mes "[���K���勳]";
		mes "����Ȃ����������B";
		mes "�댯�Ȃ��̂��������񂠂邩��ȁB";
		next;
		mes "[���K���勳]";
		mes "���X�K���h�l�̂��z���ɂ��";
		mes "�؍݂̋����o�Ă��邪";
		mes "�����A�ǂ��C���ł͂Ȃ��B";
		next;
		mes "[���K���勳]";
		mes "�����A���X�K���h�l�ɂ�";
		mes "���l��������̂��낤�B";
		mes "���̕��́A���B�̂悤�Ȏ҂Ƃ͈Ⴄ";
		mes "�̑�ȕ��Ȃ̂�����ȁB";
		next;
		mes "[���K���勳]";
		mes "�Ƃɂ����A���Âɗ�������Ȃ��悤�ɁB";
		mes "�l�Ԃ����Ƃ͋ɗ͊ւ���Ă͂����Ȃ��B";
		mes "�c�c�����A�������̏ꏊ�ɍs�����B";
		delquest 17623;
		setquest 17624;
		set EP19_1QUE,22;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 0, 1, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 0, 3, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		cloakonnpc "���C�W�[#e19ms51";
		cloakonnpc "���K���勳#e19ms51";
		end;
	}
	if(EP19_1QUE == 22) {
		mes "[���K���勳]";
		mes "���w�͂��ꂮ�炢�ŗǂ����낤�B";
		mes "�c�c�����A�������̏ꏊ�ɍs�����B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,118,187,3	script	���C�W�[#e19ms51	10475,{/* 2588 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,53,244,0	script	#e19ms61	139,5,5,{/* 2589 */
	if(EP19_1QUE == 22 || EP19_1QUE == 23)
		cloakoffnpc "���K���勳#e19ms61";
	end;
}

jor_nest.gat,53,244,1	script	���K���勳#e19ms61	10474,{/* 2590 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K���勳]";
		mes "�N���l�Ԃ������ɓ��ꂽ�I";
		mes "�����ǂ��o��!!";
		close;
	}
	if(EP19_1QUE == 22) {
		cloakoffnpc "���C�W�[#e19ms61";
		mes "[���K���勳]";
		mes "�����܂ł̓��͊o�������H";
		mes "������^0000cd�������̐������Ղł���";
		mes "^0000cd���������K���h�l����j�����ꂽ";
		mes "^0000cd���n^000000���B";
		next;
		menu "���n�ł����H",-;
		mes "[���K���勳]";
		mes "�������B";
		mes "���������K���h�l�̖��͂��N���ꏊ�B";
		mes "�N�����́A���̖��͂̏j�����󂯂�";
		mes "���܂ꂽ�񂾁B";
		next;
		mes "[���K���勳]";
		mes "�������́u���v��";
		mes "���������K���h�l����̂����������́B";
		mes "�������̖����s�����ۂɂ�";
		mes "���͂����Ԃ���";
		mes "���̐��ɒ����ł������Əؖ�����̂��B";
		next;
		mes "[���K���勳]";
		mes "���������i�Ղ����ƕ��M�k�����𓱂�";
		mes "�嗤�ɍĂсA���������K���h�l��";
		mes "�Ќ���m�炵�߂邽��";
		mes "���������K���h�l�̕�����";
		mes "簐i���˂΂Ȃ�Ȃ��B";
		next;
		mes "[���K���勳]";
		mes "���������K���h�l��";
		mes "�������Ƌ��ɂ�����B";
		mes "�^���Ă������������Ɋ��ӂ���̂��B";
		next;
		mes "[���K���勳]";
		mes "�ē��͂����܂ł��B";
		mes "�ł́A�勳���̌N�͎��Ƌ��ɗ���̂��B";
		mes "���X�K���h�l�ɉ��˂΂Ȃ�Ȃ��B";
		next;
		menu "���X�K���h�H",-;
		mes "[���K���勳]";
		mes "���X�K���h�u�l�v�ƌ����B";
		mes "�������̋���ł���";
		mes "�͂邩�Â�胈�������K���h�l�Ɏd��";
		mes "���̒n����蔲�����A�������̎��ҁB";
		next;
		mes "[���K���勳]";
		mes "�ł�������";
		mes "�ǓƂ𐶂�����";
		mes "�������������܂Ŕɉh������������B";
		next;
		mes "[���C�W�[]";
		mes "�͂͂��I";
		mes "���̕��Ƃ́A�ǂ��ŉ��H";
		mes "�ǂ��ɂ���́H";
		next;
		mes "[���K���勳]";
		cloakoffnpc "�T���N�K���h#e19ms61";
		mes "���X�K���h�l��������ꏊ�ɁB";
		mes "�������䂦��";
		mes "�N�ł�����ł���킯�ł͂Ȃ��B";
		mes "�������A�勳�������܂ꂽ�̂Ȃ�";
		mes "�j�����Ă������邾�낤�B";
		next;
		unittalk getnpcid(0,"�T���N�K���h#e19ms61"),"�T���N�K���h : ���̎����l�Ԃ��ē�����Ȃ�āI",1;
		mes "[���K���勳]";
		mes "�����A�T���N�K���h�B";
		mes "�N��T���Ă����̂��B";
		mes "������ɗ��Ă���B";
		next;
		mes "[�T���N�K���h]";
		mes "���������Â��ɂł��Ȃ��̂��H";
		mes "�����̃��K���ł�����܂��ɁB";
		next;
		mes "[���K���勳]";
		mes "���i�Ȃ�A�N�̂��̌���������";
		mes "�C�����Q����Ƃ��낾��";
		mes "�����́A���ʂȓ��Ȃ̂�����";
		mes "�䖝�ł���Ƃ������̂��B";
		next;
		mes "[���K���勳]";
		mes "�ނ������B";
		mes "�勳���Ǝi�Ջ������܂ꂽ�̂��I";
		mes "���X�K���h�l�ɏj�������肽���B";
		mes "����ŌN��T���Ă����̂��B";
		next;
		mes "[�T���N�K���h]";
		mes "�����I";
		mes "���X�K���h�l������тɂȂ邾�낤�B";
		mes "�ŋ߁A�����b�΂����";
		mes "�œ����Ă���ꂽ����ȁB";
		cloakoffnpc "�o�S�b�g#e19ms61";
		unittalk getnpcid(0,"�o�S�b�g#e19ms61"),"�o�S�b�g : ������Ƃ��A���邳����ł����ǂ��H",1;
		next;
		mes "[�T���N�K���h]";
		mes "^0000cd�l��^000000���I";
		mes "���O���Ăтɍs���Ƃ��낾�����B";
		mes "���X�K���h�l�����Ăт��B";
		emotion 0,"";	// self
		emotion 0,"���C�W�[#e19ms61";
		unittalk getcharid(3),strcharinfo(0)+" : �����́c�I",1;
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "���A�����B";
		mes "������������ǁH";
		mes "�炷����ǂ��l�͂����̏ꏊ�H";
		next;
		emotion 36,"�T���N�K���h#e19ms61";
		cutin "ep18_bagot_01.png", 255;
		mes "[�T���N�K���h]";
		mes "�M�l�c�c�I";
		mes "���X�K���h�l�̑��߂ł���";
		mes "���𕎐J���邩�I";
		next;
		mes "[�T���N�K���h]";
		mes "�勳�����K�������܂ꂽ�����ƌ�������";
		mes "���ӂ��邱�Ƃ��I";
		mes "���͖����Ǝv���I";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "�͂��́`�`���B";
		mes "��`�`�`���ꂪ�勳�����H";
		mes "���̎����ɐ��܂ꂽ���ā`�H";
		mes "�����[���˂��`�B";
		mes "������`�ƁA�悭�����Ă���Ȃ��H";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "[�T���N�K���h]";
		mes "����ȏ�A�߂Â��ȁI";
		mes "�ŏ㋉���K���͎����Ώۂɂ͂ł��Ȃ��I";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "���A�����B";
		mes "�i�Ջ��̕��͂��c�c";
		mes "��������^0000cd�����P�A�ɐf��^000000���炦��";
		mes "���`�񂶂�Ȃ��H";
		mes "�C���V�I�����ɂ���ł���H";
		mes "��ŁA�o�S�b�g���s�����炟�`�B";
		next;
		menu "�����P�A�H",-;
		cutin "ep18_bagot_01.png", 255;
		mes "[�T���N�K���h]";
		mes "�ӂ�c�c";
		mes "�����A�勳�̎q��B";
		mes "�s���Ƃ��悤�B";
		next;
		mes "[���K���勳]";
		mes "���������K���h�l�Ƌ��ɁI";
		next;
		mes "[�T���N�K���h]";
		mes "���������K���h�l�̏j�����I";
		next;
		cloakonnpc "�o�S�b�g#e19ms61";
		cloakonnpc "�T���N�K���h#e19ms61";
		cloakonnpc "���C�W�[#e19ms61";
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c�C���V�I������";
		mes "�@�f�Ă��炦�c�c���B";
		mes "�@�T��ɍs���̂��ǂ��������j";
		delquest 17624;
		setquest 17625;
		set EP19_1QUE,23;
		close;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
	}
	if(EP19_1QUE == 23) {
		mes "[���K���勳]";
		mes "�N�́u�����P�A�v�Ƃ�����";
		mes "�l�Ԃɐf�Ă��炤�̂��낤�H";
		mes "�C���V�I�����ɂ���͂����B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,56,246,3	script	�o�S�b�g#e19ms61	10386,{/* 2591 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		cutin "ep18_bagot_02.png", 2;
		mes "[�o�S�b�g]";
		mes "���m��ʐl�ԁH";
		mes "�o�S�b�g�̌������̋߂���";
		mes "������Ȃ��ł����`�H";
		close2;
		cutin "ep18_bagot_02.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,51,246,5	script	�T���N�K���h#e19ms61	10473,{/* 2592 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�T���N�K���h]";
		mes "�Ȃ��l�Ԃ������ɂ���!?";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,55,244,1	script	���C�W�[#e19ms61	10475,{/* 2593 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,22,141,0	script	#e19ms71	139,14,14,{/* 2594 */
	if(EP19_1QUE >= 23 && EP19_1QUE <= 27)
		cloakoffnpc "�����P�A#e19ms71";
	else if(EP19_1QUE == 28) {
		cloakoffnpc "�����P�A#e19ms71";
		cloakoffnpc "���C�W�[#e19ms72";
		cloakoffnpc "�o�S�b�g#e19ms71";
		cloakoffnpc "�T���N�K���h#e19ms71";
	}
	else if(EP19_1QUE == 29 || EP19_1QUE == 30)
		cloakoffnpc "�����P�A#e19ms71";
	else if(EP19_1QUE >= 36 && EP19_1QUE <= 40) {
		cloakonnpc "�����P�A#e19ms71";
		cloakoffnpc "���ނ̎R#ep19re1";
	}
	else if(EP19_1QUE >= 43 && EP19_1QUE <= 50) {
		cloakonnpc "�����P�A#e19ms71";
		cloakoffnpc "�����P�A#ep19re1";
	}
	else if(EP19_1QUE == 51) {
		// ������
	}
	else if(EP19_1QUE == 52 || EP19_1QUE == 53) {
		cloakonnpc "�����P�A#e19ms71";
		cloakonnpc "�����P�A#ep19re1";
		mes "^0000FF�]�����P�A����������Ȃ��B";
		mes "^0000FF�@�ʂ̏ꏊ��T���Ă݂悤�]";
		if(EP19_1QUE == 52) {
			delquest 16655;
			setquest 130475;
			set EP19_1QUE,53;
			//showevent 0, 1, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		}
		close;
	}
	else
		cloakonnpc "�����P�A#e19ms71";
	end;
}

jor_nest.gat,22,141,5	script	�����P�A#e19ms71	10455,{/* 2595 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�����P�A]";
		mes "�N�̋��𓾂āA�����ɓ������́H";
		mes "�����͊֌W�҈ȊO�����֎~��B";
		mes "�����o�čs���āB";
		close;
	}
	switch(EP19_1QUE) {
	case 23:
		cutin "ep19_juncea04.png", 2;
		mes "[�H�H�H]";
		mes "�N�̋��𓾂āA�����ɓ������́H";
		mes "�����A�ʓ|�������B";
		mes "���������A�g���b�v�ł�";
		mes "�ݒu���Ă�낤���c�c�B";
		next;
		menu "�����P�A�H",-;
		mes "[�����P�A]";
		mes "�����Ȃ�Ăю̂ĂȂ��";
		mes "����@�ɂ��قǂ�����ˁH";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�������܂ꂽ�B";
		mes "�����Ń����P�A�ɐf�Ă��炦����";
		mes "����ꂽ���痈���B";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "�������܂ꂽ���āH";
		mes "�㋉���K���̛z����ɂ�";
		mes "����Ȓ���͂Ȃ������͂������ǁc�c�B";
		next;
		cutin "ep19_juncea02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���͉����̛z����Ő��܂ꂽ�B";
		mes "�ŏ㋉�̂����܂ꂽ����";
		mes "���X�K���h�l�̏j�����󂯂邽�߂�";
		mes "�ǂ����ɍs����������B";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "������悩��㋉�ƍŏ㋉��";
		mes "���܂�邾�Ȃ�āB";
		mes "�������ɂ́A�����܂ł̖��͂�";
		mes "���������͂��Ȃ̂Ɂc�c�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c�������K�v�ˁB";
		mes "�������邩��A�������ɗ��āB";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���ꉽ�H";
		mes "���̏ꏊ�Ƃ͈Ⴄ�B";
		mes "������ƕ|���B";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�ʓ|����������";
		mes "���������̂͑��̐l�ɕ����āB";
		next;
		menu "�c�c",-;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�c�c�������Ă����邩��";
		mes "���������Ă�B";
		mes "�����́A�����Ȏ���������ꏊ�B";
		mes "���́A���K�������̌��������Ă�B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���Ȃ��́A���Ǝp���Ⴄ�B";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "���͐l�Ԃ�";
		mes "���O�̓��K���������B";
		mes "���́A���̓��A�̊O�B";
		mes "�����������ꏊ���痈���́B";
		mes "�c�c����J���āH";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�ǂ�����ė����́H";
		mes "��������������Ȃ�āB";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�u��s�D�v�ɏ���ė����́B";
		mes "���~���̐S���̌��Ђ𓮗͂Ƃ���c�c";
		mes "����ԏ�蕨�B";
		mes "�����ɒ┑���Ă邩��";
		mes "�@�����Ό��邱�Ƃ�����ł���B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����Ƃ��납�痈���l�ԁc�c";
		mes "�������A���Ȃ��Ɏ����l�Ԃ������B";
		mes "�΁c�΂��E�c�c�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�o�S�b�g�A�ˁB";
		mes "�����̓C���V�I���̒��ԁB";
		mes "�Ƃ͌����A���������̂�";
		mes "���ŋ߂����ǁB";
		mes "���[�ƁA�����J���āc�c�B";
		next;
		announce "�������A���_���W����[�V�~�����[�V�����퓬] �ɓ��ꂵ�܂����@�F�@dryukuyjfujh (Fornese-��)", 0x9, 0x00ff99;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����`�`�`���I";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "������Ɛ[���}�����񂶂�������B";
		mes "�����x�e���Ă���ĊJ���悤�B";
		delquest 17625;
		setquest 17626;
		set EP19_1QUE,24;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		cutin "ep19_juncea03.png", 255;
		end;
	case 24:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�x�e�͂����ǂ��́H";
		mes "���ꂶ�Ⴀ�A�ĊJ�����B";
		next;
		menu "�����ŉ������Ă���H",-;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c�����B";
		mes "�C�ɂȂ邱�Ƃ𒲂ׂ�";
		mes "�������鎖�B";
		mes "���������A�����ق��ĂĂ���Ȃ��H";
		mes "�����A����o���āB";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�c�c�肾���āB����o���́B";
		unittalk getcharid(3),strcharinfo(0)+" : �c�c�c�c",1;
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�͂��c�c";
		mes "�킩�������A�����ėǂ�����B";
		mes "�������������́H";
		next;
		menu "�����������Ă�́H",-;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���O�������K����";
		mes "�������瓾���閂�͂ɂ��āB";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c���������̑ΏہH";
		mes "���̑̂����ׂ���";
		mes "�����Ɏg�����肷��H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "����͂ł��Ȃ��B�񑩂��Ă邩��B";
		mes "�㋉�ȏ�̃��K����";
		mes "�����̑Ώۂɂ͂ł��Ȃ��́B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�����͐��܂ꂽ���̖��̗͂ʂɂ����";
		mes "�g�������܂�B";
		mes "���O�����̌��������Əj���������H";
		mes "�ォ��A�ŏ㋉�̎勳�B";
		mes "�㋉�̎i�ՁA�����̕��M�k�B";
		next;
		mes "[�����P�A]";
		mes "�㋉�������̂Ƃ��Ďg����";
		mes "�s��������B";
		mes "�����ȏ�̃��K���ɂ�";
		mes "�v�l�\�͂����邩��B";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���͏j�����ꂽ�㋉�Ȃ񂾁I";
		mes "�������ċ^��͉������́H";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�܂������̓r���c�c";
		mes "���O�����ƁA�����̖��͂ɂ�";
		mes "���֊֌W�����邯��";
		mes "����������Ɣ��W������ɂ́c�c�B";
		next;
		mes "[�����P�A]";
		mes "���A�҂Ă�c�c";
		mes "�ŋ߂͏㋉�ȏ�̃��K����";
		mes "�w�ǐ��܂�Ă��Ȃ��͂��Ȃ̂�";
		mes "���͂��c���Ă��Ȃ��ꏊ����c�c";
		mes "����������Ɓc�c�B";
		next;
		mes "[�����P�A]";
		mes "���O�������Ώۂɂ͂ł��Ȃ�����";
		mes "���O���u���܂ꂽ���v�Ȃ�g����B";
		mes "���̗��ƁA�����Ɏc���Ă閂�͂�";
		mes "���ׂĂ݂Ȃ��ƁB";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���͂����ő҂��Ă邩��";
		mes "���̊k�������Ă��āB";
		mes "���O�����܂ꂽ�ꏊ";
		mes "�u�֐_�̉�����v�ɂ���͂�������B";
		delquest 17626;
		setquest 17627;
		set EP19_1QUE,25;
		next;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		//showevent 0, 1, �~���A��#e19ms20;	// 2572: 263, 170
		cutin "ep19_juncea01.png", 255;
		mes "�]��x�~���A�������̌��֖߂낤�]";
		mes "�@";
		mes "�]�~���A�������̌��֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�~���A�������̌��֌��������]";
		close2;
		warp "jor_dun02.gat", 259, 167;
		end;
	case 25:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���͂����ő҂��Ă邩��";
		mes "���̊k�������Ă��āB";
		mes "�u�֐_�̉�����v�ɂ���͂�������B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "�]��x�~���A�������̌��֖߂낤�]";
		mes "�@";
		mes "�]�~���A�������̌��֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�~���A�������̌��֌��������]";
		close2;
		warp "jor_dun02.gat", 259, 167;
		end;
	case 26:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���͂����ő҂��Ă邩��";
		mes "���̊k�������Ă��āB";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "�]�㋉�z����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�㋉�z����֌��������]";
		close2;
		warp "jor_nest.gat", 28, 61;
		end;
	case 27:
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���́c�c���͂��q����}�̂́c�c";
		mes "�N!!";
		mes "����ɓ����ė����̂́I";
		next;
		menu "���̊k�����Ă���",-;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�Ȃ񂾁A���O���c�c";
		mes "���ꂪ���O�̗��̊k�H";
		next;
		cutin "ep19_juncea02.png", 2;
		misceffect 779,"�����P�A#e19ms71";
		mes "[�����P�A]";
		mes "�c�c���͂̎c���ʂ������B";
		mes "���������z�������΂���݂����H";
		mes "�`�́c�c���̗��̊k�Ƃ�";
		mes "������ƈقȂ��Ă�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�������ɒu����Ă�������H";
		mes "�c�����̖̂��͎͂c���Ă��Ȃ��̂�";
		mes "�ǂ�����Ă�������㋉�����܂ꂽ�H";
		next;
		menu "�c�����́H�@���́H",-;
		mes "[�����P�A]";
		mes "�c�c��������͖̂ʓ|������";
		mes "���̃��K���ɂł������Ă݂�΁H";
		next;
		menu "�c�c",-;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�܂��A����Ȋ������c�c";
		mes "�킩�������B";
		mes "�͂��c�c�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���̑��́A����������Ȗ��͂̉�Ȃ́B";
		mes "�����̂��߂ɖ��͂��K�v�ȃ��K����";
		mes "�{�\�ɓ�����Ė��͂��z����";
		mes "�����Ő��܂�Ă���B";
		next;
		mes "[�����P�A]";
		mes "����𒷂��ԁc�c";
		mes "�������̂������Ă�񂾂���";
		mes "���͂��ǂ�ǂ񖳂��Ȃ��Ă���";
		mes "���ł́A�قƂ�ǎc���Ă��Ȃ��B";
		next;
		menu "��ς��I",-;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�����A��ρB";
		mes "�Ȃ̂ɁA���O�̂悤�ȏ㋉��";
		mes "�ŏ㋉�����܂�Ă���Ȃ�āB";
		next;
		mes "[�����P�A]";
		mes "�{���́A�����T�����K���̓����ɂ����";
		mes "���̓��������܂�B";
		mes "�H�ɁA���̎��ɖ��𑽂͂��z������";
		mes "�㋉�ȏオ���܂�邱�Ƃ����邯��";
		mes "�����܂ŗ�O������B";
		next;
		mes "[�����P�A]";
		mes "���̐�啪���";
		mes "���͂Ɩ�����̊��p������ˁB";
		mes "�̂̒��ɖ��͂��i�v��";
		mes "���߂���@��T���Ă�B";
		mes "�l�Ԃɂ͂ł��Ȃ�����";
		mes "���K���ɂ͂��ꂪ�ł���B";
		next;
		mes "[�����P�A]";
		mes "���ƃ��K���̗��Q����v�����́B";
		mes "���̓��K������������B";
		mes "���K���́A���̌����̐��ʂ��g����";
		mes "�c��͂��Ȗ��͂𑝕�������";
		mes "���ɖ��͂𒍓�������.�c�c�B";
		next;
		menu "�㋉���K���͋����H",-;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�����c�c���ȁB";
		mes "���͂��g������p��";
		mes "�l�ԂƈقȂ銴�o�튯�B";
		mes "�����̂ɐl�Ԃ�������킵����";
		mes "�����Ă邯�ǁA�R����Ȃ��Ǝv���B";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "�����A������ׂ�͏I���B";
		mes "���́A���͂̔g�������Ȃ��ƁB";
		mes "��c�c�N�������݂����B";
		next;
		cutin "ep19_juncea01.png", 255;
		cloakoffnpc "���C�W�[#e19ms72";
		mes "[���C�W�[]";
		mes "���Ⴖ��`�`��I";
		cloakoffnpc "�o�S�b�g#e19ms71";
		cloakoffnpc "�T���N�K���h#e19ms71";
		unittalk getnpcid(0,"�o�S�b�g#e19ms71"),"�o�S�b�g : �o�S�b�g�����܂�����`�B";
		cutin "ep19_juncea04.png", 2;
		delquest 17629;
		setquest 17630;
		delitem 1000608,1;
		set EP19_1QUE,28;
		cutin "ep19_juncea04.png", 255;
		close;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 0, 1, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
	case 28:
		cutin "ep19_juncea01.png", 2;
		cloakoffnpc "���C�W�[#e19ms72";
		cloakoffnpc "�o�S�b�g#e19ms71";
		cloakoffnpc "�T���N�K���h#e19ms71";
		mes "[�����P�A]";
		mes "�o�S�b�g���ǂ�����";
		mes "���K����A��Ă���H";
		close2;
		cutin "ep19_juncea01.png", 255;
		end;
	case 29:
		cutin "ep19_juncea03.png", 2;
		cloakoffnpc "���C�W�[#e19ms72";
		mes "[�����P�A]";
		mes "�c�c������ɗ����̂ɁI";
		mes "�c�c���̂���������d�������̂�!!";
		mes "�c�c���͂ɂ��đS���������̂�!!!";
		mes "�c�c���̂��ً}���������̂ɂ�!!!!";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "[���C�W�[]";
		mes "�R�C�c�́A���������Ă�́H";
		mes "�l�q������������H";
		mes "�o�S�b�g�ƈႤ�I";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�R�C�c�A���ƁH";
		mes "�����P�A�I";
		mes "����c�c�����P�A�l�ƌĂׁI";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[���C�W�[]";
		mes "�����P�A�T�}�@�H";
		mes "�o�S�b�g�����������������I";
		mes "�����ł͕����������Ȃ�����";
		mes "�̂����ċ����Ă�������I";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���́c�c!!";
		mes "�o�S�b�g�������̕���";
		mes "��ɂ����ɗ���";
		mes "���K���ɋ��͂��Ă��̂ɁI";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[���C�W�[]";
		mes "�̂�ɂ��ꂽ�������";
		mes "���ɔ������肷��́H";
		mes "����Ȃ񂾂���";
		mes "�D�揇�ʂ�������ꂽ�񂶂�Ȃ��H";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�����c�c";
		mes "�������܂ꂽ�΂�����̂����ɁI";
		mes "�������ɗ����I";
		mes "���̓��̒����璲�ׂĂ��I";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[���C�W�[]";
		mes "���e���������݂����B";
		mes "���Ɛl�Ԃ͌Â��͔��ڂ�����������";
		mes "���͎�𒴉z���Đl�Ԃł���";
		mes "���Ȃ����󂯓����̂ɁB";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���΂�����c�c�I";
		mes "���𒲂ׂ�O��";
		mes "���̌����ǂ��ł����I";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����P�A�̌�����";
		mes "�������̐l�Ԃ̌����Ƃ͈Ⴄ�́H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�Ⴄ�I";
		mes "�����Ƃ͈Ⴄ�������Ŏ������Ă�B";
		mes "�������Ă邩�͒m��Ȃ����ǁB";
		mes "�c�c�͂��A�������I";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�ŏ㋉�̂��񂽂́c�c";
		mes "��������A�������ɗ���!!";
		mes "�f�[�^���o�����Č����Ă�񂾂���";
		mes "�������ɍ����āA����𒅂��āI";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "[���C�W�[]";
		mes "����`�H";
		mes "�Ȃ񂾂��񂾌�����";
		mes "�o�S�b�g�̖��߂ɏ]���́H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���邳��!!";
		mes "���񂽁A�o�S�b�g�ƈꏏ��";
		mes "���X�K���h�ɉ���ė����́H";
		mes "�Ȃ�A�o�S�b�g���������Ă邩";
		mes "�����ĂȂ��H";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "[���C�W�[]";
		mes "�����ĂȂ��B";
		mes "�������ނ݂����Ȃ̂������Ȃ���";
		mes "�����̎��u�傢�Ȃ�́v���g����";
		mes "���X�K���h�l�̊肢��������";
		mes "�����̌�������������Ƃ������Ă��B";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�傢�Ȃ�́c�c�H";
		mes "���~���̐S���̌��Ђ̂��Ƃ��B";
		mes "������g���ĉ����������H";
		mes "���X�K���h�̋��������������c�c�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c�����A����ŏI���B";
		mes "���O������l�́A��ł܂��ĂԂ����B";
		mes "���O�������āB";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "[���C�W�[]";
		mes "���̓X�x�O�K���h�B";
		mes "���X�K���h�l���t���Ă����������B";
		next;
		menu "���́A���O�Ȃ�",-;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "���O���������āH";
		mes "���ʂ́A���܂�Ă����ɏ�ʂ̃��K����";
		mes "�t����͂��Ȃ̂Ɂc�c";
		mes "�Y��Ă��̂����ˁH";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c���O�́A�Z�l�L�I�K���h�ɂ��悤�B";
		mes "�����̃��[�����������͂�������";
		mes "�����A�������������Ă邵";
		mes "��薳���񂶂�Ȃ��H";
		next;
		menu "�ǂ������Ӗ��H",-;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���̌������ɒu���Ă����ϗt�c�c";
		mes "����A�C�ɓ������̂Ȃ�";
		mes "�Ӗ��Ȃ�ċC�ɂ��Ȃ��Ă����B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c�����A�����͂���ŏI���B";
		mes "���́A�����������ʂ��o�S�b�g��";
		mes "�n���Ȃ��Ƃ����Ȃ��B";
		mes "�܂��A��łˁc�c�B";
		delquest 17631;
		setquest 17632;
		set EP19_1QUE,30;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 0, 1, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		cloakonnpc "���C�W�[#e19ms72";
		cutin "ep19_juncea04.png", 255;
		end;
	case 30:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�Ȃ��܂������ɂ���H";
		mes "���͌����Ɏז�������B";
		mes "�܂��A��łˁc�c�B";
		close2;
		cutin "ep19_juncea01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,26,142,3	script	�o�S�b�g#e19ms71	10386,{/* 2596 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		cutin "ep18_bagot_02.png", 1;
		mes "[�o�S�b�g]";
		mes "�ȂɁH�@�����́H";
		mes "�ז�������o�čs���ā`�B";
		close2;
		cutin "ep18_bagot_02.png", 255;
		end;
	}
	if(EP19_1QUE == 28) {
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�v���U��`�B";
		mes "�Ƃ���Ń����P�A������";
		mes "�΂�����Y�ꂿ��������H";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[�����P�A]";
		mes "�c�c���������ɂ͗��Ȃ���";
		mes "�v���Ă����̂����ǁB";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�o�S�b�g��������_�����H";
		mes "�����͋��p�������ł���`�H";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[�����P�A]";
		mes "���́A�ʂ̎��������������";
		mes "��l�Ō������Ă邶��Ȃ��c�c�B";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�����A�㋉�ƍŏ㋉�̃��K����";
		mes "���܂ꂽ�̂͒m���Ă�`�H";
		mes "�㋉�̌������I����Ă�Ȃ�";
		mes "���́A���̍ŏ㋉����������";
		mes "���ʂ��o�S�b�g�ɋ��L���ā`�B";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "�c�c���A�ʂ̍�Ƃ����Ă邩��";
		mes "���ꂪ�I�������ˁB";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�����`�`�߂��I";
		mes "�o�S�b�g�̂��ŗD��ł��`���I";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[�����P�A]";
		mes "�͂��H";
		mes "�Ȃ�Ŏ��̍�Ƃ�肠�Ȃ��̂�";
		mes "�D�悵�Ȃ��Ƃ����Ȃ��́H";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�����قǗD�揇�ʂ��ς��܂����`�`�B";
		mes "������o�S�b�g�̌������ŗD��ł��`���B";
		mes "��ԑ厖��!!";
		next;
		mes "[�o�S�b�g]";
		mes "�����̎w���҂�";
		mes "�o�S�b�g�̌������C�ɓ�����";
		mes "�D�揇�ʂ��ς�����ł��悧�`�B";
		mes "�S�������H�@�����P�A�݂̂����ǁ`";
		mes "�o�S�b�g�̌�����S�ʓI��";
		mes "�T�|�[�g���Ȃ�����Ȃ�Ȃ��́`�B";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[�����P�A]";
		mes "����Ȃ��Ƃ��āc�c!?";
		mes "���̕�����ɁA�����Ō������Ă��̂ɁI";
		mes "���K���ƌ����āA�x���𓾂�ꂽ�̂�";
		mes "�����c�c�I";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "[�T���N�K���h]";
		mes "�D�揇�ʂ��ς�����B";
		mes "���X�K���h�l�̔��f���B";
		mes "�����A�����Ɋւ��郊�\�[�X���܂߂�";
		mes "���̐l�Ԃ̌������ŗD��ƂȂ�B";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "�͂��A�����܂������H";
		mes "�����P�A����񂪌l�I�ɂ�邱�Ƃɂ�";
		mes "�����Ȃ����ǂ��`";
		mes "�o�S�b�g���~�������Č�������";
		mes "������ɂ��Ȃ��ƃ_���`�B";
		mes "���Ⴀ�A���b�͂����܂��I";
		delquest 17630;
		setquest 17631;
		set EP19_1QUE,29;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		cloakonnpc "�o�S�b�g#e19ms71";
		cloakonnpc "�T���N�K���h#e19ms71";
		cutin "ep18_bagot_03.png", 255;
		end;
	}
	if(EP19_1QUE == 29) {
		// ������
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,24,142,3	script	���C�W�[#e19ms72	10475,{/* 2597 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,25,140,1	script	�T���N�K���h#e19ms71	10473,{/* 2598 (cloaking)*/
	unittalk "�T���N�K���h : �����b��������O�ɁA�b��������ȁB";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,23,58,0	script	#e19ms81	139,5,5,{/* 2599 */
	if(EP19_1QUE == 26) {
		cloakoffnpc "���K���i��#e19ms81";
		cloakoffnpc "���K���i��#e19ms82";
		cloakoffnpc "�z����#e19ms81";
		cloakoffnpc "���n�[��#e19ms81";
		cloakoffnpc "���K���勳#e19ms81";
	}
	end;
}
jor_nest.gat,23,58,5	script	���K���i��#e19ms81	10470,{/* 2600 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���i��]";
		mes "����킵���l�Ԃ߁I";
		mes "�o�Ă����I";
		close;
	}
	if(EP19_1QUE == 26) {
		mes "[���K���i��]";
		mes "����H";
		mes "�������܂ꂽ�q�ł͂Ȃ����H";
		mes "���ɖ������̂��H";
		mes "���܂肱���ɂ͗��Ă͑ʖڂ����B";
		next;
		mes "[�z����]";
		mes "�����I�@�����񂾁I";
		next;
		mes "[�z����]";
		mes "�킴�Ɨ����������񂶂�Ȃ��I";
		mes "�s�R�͂��I";
		next;
		mes "[���K���勳]";
		mes "�s�R�͂��ƁH";
		mes "����ŋ������Ǝv���Ă���̂��H";
		mes "�����ɒu����Ă���̂�";
		mes "�㋉�ȏ�̃��K���Ƃ��Đ��܂��͂���";
		mes "���Ȃ̂����I";
		next;
		mes "[���n�[��]";
		mes "�䋖�����������I";
		mes "�ǂ��������߂��I";
		mes "���̎҂́A�������ӂ��Ă����܂�����I";
		next;
		mes "[���K���i��]";
		mes "�c�c�������������܂����H";
		next;
		mes "[���K���勳]";
		mes "�����́A�勳���Ǝi�Ջ������܂ꂽ";
		mes "�߂ł�����������ȁc�c���O�����I";
		mes "���O�͉��Ƃ������H";
		next;
		mes "[�z����]";
		mes "�z�A�z���������K���h�I";
		next;
		mes "[���n�[��]";
		mes "��A�킽����";
		mes "���n���X�S�C�K���h�ł��I";
		next;
		mes "[���K���勳]";
		mes "��l���������ɍs������I";
		mes "�ĂьĂԂ܂ŁA�����œ�������̂��B";
		mes "���n���X�S�C�K���h�I";
		mes "���O���ӔC��������";
		mes "�z���������K���h����������B";
		next;
		mes "[���K���勳]";
		mes "���ꂪ�ł��Ȃ���������";
		mes "�ߐl�Ƃ��ē�l�Ƃ���������B";
		mes "�i���A�A��čs���I";
		emotion 1,"�z����#e19ms81";
		emotion 1,"���n�[��#e19ms81";
		emotion 1,"";	// self
		next;
		cloakonnpc "���K���i��#e19ms82";
		cloakonnpc "�z����#e19ms81";
		cloakonnpc "���n�[��#e19ms81";
		cloakonnpc "���K���勳#e19ms81";
		menu "���̗��̊k���c�c",-;
		mes "[���K���i��]";
		mes "�Ȃɂ�!?";
		mes "�N�̗��̊k�͂����ɂ͂Ȃ����B";
		mes "�ʂ̂Ƃ���Ő��܂ꂽ�񂾂낤�H";
		next;
		mes "[���K���i��]";
		mes "����ɂ��Ă��c�c";
		mes "����ꂽ���͂ǂ����悤�B";
		mes "���Ɋ���ꂽ���͂Ȃ����낤�ȁH";
		mes "���ׂĂ������B";
		unittalk getcharid(3),strcharinfo(0)+" : ���̌��ɁA��������k�𓐂����B",1;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		set EP19_1QUE,27;
		delquest 17628;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		setquest 17629;
		getitem 1000606,1;	//unexpected error
		close;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 0, 1, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
	}
	if(EP19_1QUE == 27) {
		mes "[���K���i��]";
		mes "�Ȃ�ł��l�Ԃ̋��Z�n��";
		mes "�o���肵�Ă���炵���ȁH";
		mes "�q�h�C���Ƃ�����Ă��Ȃ����H";
		close;
	}
	if(EP19_1QUE >= 28) {
		mes "[���K���i��]";
		mes "����H";
		mes "���ɖ������̂��H";
		mes "���܂肱���ɂ͗��Ă͑ʖڂ����B";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,21,55,7	script	�z����#e19ms81	21529,{/* 2601 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,22,54,7	script	���n�[��#e19ms81	21529,{/* 2602 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,25,57,3	script	���K���勳#e19ms81	10473,{/* 2603 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���勳]";
		mes "����킵���l�Ԃ�";
		mes "�Ȃ������ɂ���!?";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,26,55,3	script	���K���i��#e19ms82	10471,{/* 2604 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���i��]";
		mes "�����瓦���o���Ă����̂��H";
		mes "�d���ɖ߂�I";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,82,163,14	script	�`���C��#e19ms71	10080,14,5,{/* 2605 */
	unittalk "�f�B���h����";
	end;
OnTouch:
	if(EP19_1QUE == 30) {
		cloakonnpc "�����P�A#e19ms71";
		cloakoffnpc "���C�W�[#e19ms71";
	}
	end;
}
jor_nest.gat,87,164,3	script	���C�W�[#e19ms71	10475,{/* 2606 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���C�W�[]";
		mes "���������A�����̓��K���ɕϐg���Ȃ��ƁB";
		mes "�����o�������H";
		close;
	}
	if(EP19_1QUE == 30) {
		cloakonnpc "�����P�A#e19ms71";
		cloakoffnpc "���C�W�[#e19ms71";
		mes "[���C�W�[]";
		mes "���[���I";
		mes strcharinfo(0)+"!!";
		mes "���������A������!!";
		next;
		menu "���C�W�[����H",-;
		mes "[���C�W�[]";
		mes "�Ђ�`�`�I";
		mes "�����{���ْ͋�����ȁI";
		mes "���o���邩�ƃq���q�������ςȂ����I";
		mes strcharinfo(0)+"��";
		mes "���������ŗǂ�������B";
		next;
		mes "[���C�W�[]";
		mes "�������͓����H";
		mes "�C���V�I���̓����́H";
		mes "�������̓��X�K���h�̕�����";
		mes "�҂�����Ă�����";
		mes "�S�R�����ł��ĂȂ��ĂˁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�܂��킩��Ȃ����Ƃ������ł��B";
		mes "��s�D�������ɒ┑���Ă���Ƃ���";
		mes "���͓��܂����B";
		next;
		mes "[���C�W�[]";
		mes "�C���V�I��������ė�������ȁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ƁA�z��������ƃ��n�[������";
		mes "���K���̗����������߂�";
		mes "�������ɘA��čs����܂����B";
		mes "�J���������Ă��܂��B";
		next;
		mes "[���C�W�[]";
		mes "���������I";
		mes "����Șb�́A�����Ɍ���Ȃ���I";
		mes "�}���ŏ����ɍs���ׂ�������";
		mes "�܂��A���n�[�����ꏏ�Ȃ��";
		mes "���ʂ͑��v���낤�B";
		next;
		mes "[���C�W�[]";
		mes "�܂��́A��s�D�̈ʒu���m�F���悤�B";
		mes "��s�D��}���Ȃ���";
		mes "�����C���V�I����߂܂��悤�Ƃ��Ă�";
		mes "�܂��������Ă��܂���������Ȃ��B";
		mes "�������͍ǂ��ł����Ȃ��ƂˁB";
		delquest 17632;
		setquest 17633;
		set EP19_1QUE,31;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 0, 1, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		cloakonnpc "���C�W�[#e19ms71";
		end;
	}
	if(EP19_1QUE == 31) {
		cloakonnpc "�����P�A#e19ms71";
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,24,252,0	script	#e19ms91	139,6,6,{/* 2607 */
	if(EP19_1QUE >= 68) {
		cloakonnpc "�x�����K��#e19ms91";
		cloakonnpc "�x�����K��#e19ms92";
		cloakonnpc "�x�����K��#e19ms93";
		cloakonnpc "�x�����K��#e19ms94";
	}
	else if(EP19_1QUE == 31) {
		cloakoffnpc "���C�W�[#e19ms91";
	}
	end;
}
jor_nest.gat,24,252,1	script	���C�W�[#e19ms91	10475,{/* 2608 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���C�W�[]";
		mes "���������A�����̓��K���ɕϐg���Ȃ��ƁB";
		mes "�����o�������H";
		close;
	}
	if(EP19_1QUE == 31) {
		mes "[���C�W�[]";
		mes "�ӂ���B";
		mes "��������s�D�̒┑�n���B";
		mes "���΂Ɍx�������d�������ȁB";
		mes "�����ɏo�q����݂����ȗl�q��";
		mes "�����Ȃ��ȁB";
		next;
		mes "[���C�W�[]";
		mes "�Ƃ͂����A�����͉��Ƃ����Ȃ��ƁB";
		mes "�����Ă�������A�܂�������g����";
		mes "�C���V�I���̓z�炪";
		mes "�����o����������Ȃ�����Ȃ��H";
		mes "���Ƃ��j��ł��Ȃ����H";
		next;
		menu "��l�����ł͖����ł���",-;
		mes "[���C�W�[]";
		mes "�d���Ȃ��B";
		mes "�ʒu�͔c����������";
		mes "�������ɍs�������B";
		mes "�z�����ƃ��n�[�������ɍs�����B";
		next;
		delquest 17633;
		setquest 17634;
		set EP19_1QUE,32;
		mes "�]�������֌������܂����H�]";
		next;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		//showevent 0, 1, �x�����K��#e19ms95;	// 2618: 153, 239
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�������֌��������]";
		close2;
		warp "jor_dun02.gat", 153, 234;
		end;
	}
	if(EP19_1QUE == 32) {
		mes "[���C�W�[]";
		mes "�d���Ȃ��B";
		mes "�ʒu�͔c����������";
		mes "�������ɍs�������B";
		mes "�z�����ƃ��n�[�������ɍs�����B";
		next;
		mes "�]�������֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�������֌��������]";
		close2;
		warp "jor_dun02.gat", 153, 234;
		end;
	}
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,29,251,5	script	�x�����K��#e19ms91	10470,{/* 2609 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�x�����K��]";
		mes "�ߊ��ȁI�@�l�Ԃ߁I";
		close;
	}
	unittalk "�c�c";
	end;
}

jor_nest.gat,23,247,5	script	�x�����K��#e19ms92	10471,{/* 2610 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�x�����K��]";
		mes "�l�Ԃ��Ȃ������ɂ���I";
		close;
	}
	unittalk "�c�c";
	end;
}

jor_nest.gat,41,270,3	script	�x�����K��#e19ms93	10473,{/* 2611 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�x�����K��]";
		mes "����킵���l�Ԃ��A�������Ă���I";
		close;
	}
	unittalk "�c�c";
	end;
}

jor_nest.gat,35,270,5	script	�x�����K��#e19ms94	10474,{/* 2612 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�x�����K��]";
		mes "�����͗����֎~���I";
		close;
	}
	unittalk "�c�c";
	end;
}

jor_dun02.gat,151,236,0	script	#e19ms93	139,{/* 2613 */}
jor_dun02.gat,140,225,0	script	jor_dun02_sw_3	139,{/* 2614 */}
jor_dun02.gat,151,225,0	script	jor_dun02_sw_4	139,{/* 2615 */}
jor_dun02.gat,161,229,0	script	jor_dun02_sw_5	139,{/* 2616 */}
jor_dun02.gat,152,253,0	script	jor_dun02_sw_6	139,{/* 2617 */}

jor_dun02.gat,153,239,3	script	�x�����K��#e19ms95	10470,{/* 2618 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�x�����K��]";
		mes "�ߊ��ȁI�@�l�Ԃ߁I";
		close;
	}
	if(EP19_1QUE == 32) {
		mes "[�x�����K��]";
		mes "�͂��c�c�������̎��Ԃ�";
		mes "�Ȃ��Ă���Ȃ����낤���B";
		emotion 45;
		next;
		cloakoffnpc "���C�W�[#e19ms92";
		mes "[���C�W�[]";
		mes "����J�I";
		mes "�ُ�͂Ȃ����H";
		next;
		mes "[�x�����K��]";
		mes "�����I";
		mes "���̂��p�́A�勳�l�I";
		mes "���A����Ɏi���l���I";
		mes "������p�ł��傤���I";
		next;
		mes "[�x�����K��]";
		mes "�������܍߂ׂ̈�";
		mes "�J���҂��J���ɏ]������ꏊ�ł��B";
		mes "����l�������ɗ����闝�R��";
		mes "�������Ǝv���܂����c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A�������󂯂��҂����邾�낤�H";
		mes "�z���������K���h��";
		mes "���n���X�S�C�K���h�B";
		mes "���̎҂�A��čs�����߂ɗ����B";
		next;
		mes "[�x�����K��]";
		mes "����������������������I";
		mes "�ǁA�ǂ��������肭�������I";
		delquest 17634;
		setquest 17635;
		set EP19_1QUE,33;
		close2;
		//showevent 9999, 0, �~���A��#e19ms20;	// 2572: 263, 170
		//showevent 9999, 0, �x�����K��#e19ms95;	// 2618: 153, 239
		//showevent 0, 1, �~���A��#e19ms91;	// 2621: 150, 269
		cloakonnpc "���C�W�[#e19ms92";
		cloakoffnpc "�~���A��#e19ms91";
		cloakoffnpc "���n�[��#e19ms91";
		cloakoffnpc "�z����#e19ms91";
		cloakoffnpc "���C�W�[#e19ms93";
		end;
	}
	if(EP19_1QUE == 33 || EP19_1QUE == 34) {
		mes "[�x�����K��]";
		mes "�p���͂��ςɂȂ�܂������H";
		close;
	}
	if(EP19_1QUE >= 35) {
		mes "[�x�����K��]";
		mes "�����ɂ͗��Ȃ������ǂ��ł���B";
		close;
	}
	mes "[�x�����K��]";
	mes "���̎��Ԃ��c�c�H";
	mes "�Ⴄ�̂��c�c�B";
	close;
}
jor_dun02.gat,150,237,7	script	���C�W�[#e19ms92	10475,{/* 2619 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,150,269,0	script	#e19ms94	139,5,5,{/* 2620 */
	if(EP19_1QUE == 33 || EP19_1QUE == 34) {
		cloakoffnpc "�~���A��#e19ms91";
		cloakoffnpc "���n�[��#e19ms91";
		cloakoffnpc "�z����#e19ms91";
		cloakoffnpc "���C�W�[#e19ms93";
	}
	end;
}

jor_dun02.gat,150,269,3	script	�~���A��#e19ms91	21529,{/* 2621 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "["+strcharinfo(0)+"]";
		mes "�i�����Ɓc�c���K���ɕϐg���Ȃ�����j";
		close;
	}
	if(EP19_1QUE == 33) {
		cloakoffnpc "���C�W�[#e19ms93";
		mes "[���K��]";
		mes "<FONT SIZE = 9>�勳�l�Ǝi�՗l�B</FONT>";
		mes "<FONT SIZE = 9>������ł��I</FONT>";
		next;
		mes "[���C�W�[]";
		mes "���āc�c���������ĂԂ̂�";
		mes "���������N���H";
		mes "�����p�����猩���������Ȃ����B";
		next;
		mes "[�~���A��]";
		mes "�~���A���ł��B";
		mes "������̓��n�[������B";
		mes "�z����������ꏏ�ł��B";
		next;
		menu "�݂�Ȗ����ł������I",-;
		mes "[���C�W�[]";
		mes "�A��Ă����ꂽ�ƕ�����";
		mes "�S�z���Ă��񂾂���";
		mes "���v�����ŗǂ�������B";
		mes "�Ȃɂ�狰�낵���ڂ�";
		mes "�����Ă�񂶂�Ȃ������ĂˁB";
		next;
		mes "[�~���A��]";
		mes "���낵�����Ƃɂ͈Ⴂ����܂���B";
		mes "���Ă��������B";
		mes "�����ɂ͉������K���ȊO�ɂ�";
		mes "�l�Ԃ������ł��B";
		next;
		menu "�ǂ�����Ă����ɁH",-;
		mes "[�~���A��]";
		mes "��s�D�ŝf�v���Ă���";
		mes "�l�����݂����ł��B";
		next;
		mes "[���n�[��]";
		mes "���̏󋵂́A�J���@�ᔽ��";
		mes "���ł��w�E�ł������ł��c�c";
		mes "�C���V�I���̎����Ɏg��ꂽ��";
		mes "�����ŘJ���ɏ]���������Ă�����B";
		next;
		mes "[���C�W�[]";
		mes "�ނ�������o���Ȃ��Ƃ�����";
		mes "�܂��͌N��������������o���Ȃ��ƁB";
		next;
		mes "[���n�[��]";
		mes "�o�čs���Ă���薳���̂ł����H";
		next;
		mes "[���C�W�[]";
		mes "�x���̃��K���ɂ������Ă������B";
		mes "�勳���A��čs���̂�����";
		mes "�����������͂��Ȃ����낤�H";
		next;
		mes "[���C�W�[]";
		mes "��������A�X�̏�ɖ߂낤���B";
		mes "�W�߂���������";
		mes "���𗧂ĂȂ��ƂȁB";
		mes "��邱�Ƃ͑������B";
		delquest 17635;
		setquest 17636;
		set EP19_1QUE,34;
		next;
		//showevent 9999, 0, �~���A��#e19ms20;	// 2572: 263, 170
		//showevent 9999, 0, �x�����K��#e19ms95;	// 2618: 153, 239
		//showevent 0, 1, �~���A��#e19ms91;	// 2621: 150, 269
		//showevent 0, 1, �I�[�����[#e19ms00;	// 2546: 34, 189
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
	}
	if(EP19_1QUE == 34) {
		mes "[���C�W�[]";
		mes "��������A�X�̏�ɖ߂낤���B";
		mes "�W�߂���������";
		mes "���𗧂ĂȂ��ƂȁB";
		mes "��邱�Ƃ͑������B";
		next;
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
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,145,271,5	script	���n�[��#e19ms91	21529,{/* 2622 (cloaking)*/
	unittalk "���n�[�� : �����ɗ��Ă��ꂽ�̂ł��ˁI";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,141,267,5	script	�z����#e19ms91	21529,{/* 2623 (cloaking)*/
	unittalk "�z���� : �����A�Ђǂ��ڂɑ�������B";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,145,267,7	script	���C�W�[#e19ms93	10475,{/* 2624 (cloaking)*/
	unittalk "���C�W�[ : �ف`��A��l�Ƃ�������������H";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun02.gat,141,258,5	script	���K��#e19ms91	21528,{/* 2625 */
	unittalk "���K�� : �߂��c",1;
	end;
}

jor_dun02.gat,146,255,1	script	���K��#e19ms92	21528,{/* 2626 */
	unittalk "���K�� : �ˁc��c",1;
	end;
}

jor_dun02.gat,147,258,3	script	���K��#e19ms93	21528,{/* 2627 */
	unittalk "���K�� : ���c���c",1;
	end;
}

jor_dun02.gat,134,257,3	script	�l��#e19ms91	93,{/* 2628 */
	unittalk "�J���� : �K����������E�o���Ă��c�c",1;
	end;
}

jor_dun02.gat,136,254,3	script	�l��#e19ms92	870,{/* 2629 */
	unittalk "�J���� : �������ė����󂶂�Ȃ��̂Ɂc�c",1;
	end;
}

jor_dun02.gat,140,253,3	script	�l��#e19ms93	84,{/* 2630 */
	unittalk "�J���� : �����̎d���͕K���I��点�܂��I",1;
	end;
}

jor_dun02.gat,148,264,7	script	�l��#e19ms94	89,{/* 2631 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,108,79,0	script	#e19ms100	139,5,5,{/* 2632 */
	if(EP19_1QUE >= 68)
		cloakonnpc "���K���i��#e19ms100";
	end;
}
jor_nest.gat,108,79,5	script	���K���i��#e19ms100	10471,{/* 2633 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���i��]";
		mes "�l�Ԃ��Ȃ������ɁH";
		mes "�����ɏo�Ă����I";
		close;
	}
	unittalk "���K���i�� : ��������肭�s���܂��悤�Ɂc�������c";
	end;
}

jor_nest.gat,115,212,0	script	#e19ms101	139,5,5,{/* 2634 */
	if(EP19_1QUE >= 68)
		cloakonnpc "���K���i��#e19ms101";
	end;
}
jor_nest.gat,115,212,3	script	���K���i��#e19ms101	10470,{/* 2635 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���i��]";
		mes "�l�Ԃ̂����I";
		mes "�ǂ�����Ă����ɓ�����!?";
		close;
	}
	if(EP19_1QUE >= 41)	//�؂�ւ��^�C�~���O������
		unittalk "���K���i�� : ���������ɂ͊��ꂽ�H";
	else
		unittalk "���K���i�� : �������܂ꂽ�q����ˁH";
	end;
}

jor_nest.gat,76,22,0	script	#e19ms102	139,5,5,{/* 2636 */
	if(EP19_1QUE >= 68)	{
		cloakonnpc "���K���勳#e19ms100";
		cloakonnpc "���K���勳#e19ms101";
	}
	end;
}
jor_nest.gat,76,22,3	script	���K���勳#e19ms100	10473,{/* 2637 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���勳]";
		mes "�l�Ԃ̂����I";
		mes "�ǂ�����Ă����ɓ�����!?";
		close;
	}
	if(EP19_1QUE >= 41)	{	// ������؂�ւ�肩������
		unittalk "���K���勳 : �H�ו����~�����̂��H";
		end;
	}
	unittalk getnpcid(0,"���K���勳#e19ms100"),"���K���勳 : �V�������܂ꂽ�q���H";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"���K���勳#e19ms101"),"���K���勳 : �i�H�͌��߂��H";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"���K���勳#e19ms100"),"���K���勳 : ���܂ꂽ�΂���̎q�ɂ������Ƃ���Ȃ�����I";
	end;
}
jor_nest.gat,73,17,7	script	���K���勳#e19ms101	10474,{/* 2638 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���勳]";
		mes "�l�Ԃ̂����I";
		mes "�ǂ�����Ă����ɓ�����!?";
		close;
	}
	if(EP19_1QUE >= 41)	{	// ������؂�ւ�肩������
		unittalk "���K���勳 : ���͌����ĂȂ����H";
		end;
	}
	unittalk getnpcid(0,"���K���勳#e19ms101"),"���K���勳 : �������́A�����q�����������}����B";
	unittalk getnpcid(0,"���K���勳#e19ms100"),"���K���勳 : �C�ɂȂ邱�Ƃ�����΁A���ł������񂾂�H";
	end;
}

jor_nest.gat,186,173,0	script	#e19ms103	139,5,5,{/* 2639 */
	if(EP19_1QUE >= 68)
		cloakonnpc "���K���i��#e19ms102";
	end;
}
jor_nest.gat,186,173,3	script	���K���i��#e19ms102	10472,{/* 2640 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���i��]";
		mes "�������ɂ���͂��̐l�Ԃ�";
		mes "�ǂ�����Ă����ɗ����H";
		close;
	}
	if(EP19_1QUE >= 41)	// ������؂�ւ�肩������
		unittalk "���K���i�� : ���������K���h�l�͎�������������Ă���������B";
	else
		unittalk "���K���i�� : ��ŖK�˂Ă��Ă���B�����Ɋւ��ċ����悤�B";
	end;
}

jor_nest.gat,179,144,0	script	#e19ms104	139,5,5,{/* 2641 */
	if(EP19_1QUE >= 68)	// ���m�F
		cloakonnpc "���K���勳#e19ms102";
	end;
}
jor_nest.gat,179,144,3	script	���K���勳#e19ms102	10474,{/* 2642 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���勳]";
		mes "�l�Ԃ��Ȃ������ɁH";
		mes "�����ɏo�Ă����I";
		close;
	}
	if(EP19_1QUE >= 41)	// ������؂�ւ�肩������
		unittalk "���K���勳 : �V�������܂ꂽ�q���I";
	else
		unittalk "���K���勳 : �m��Ȃ��炾�ȁH�@�V�����q���H";
	end;
}

jor_nest.gat,123,132,0	script	#e19ms105	139,5,5,{/* 2643 */
	if(EP19_1QUE >= 68)
		cloakonnpc "���K���i��#e19ms103";
	end;
}
jor_nest.gat,123,132,5	script	���K���i��#e19ms103	10470,{/* 2644 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���i��]";
		mes "�������ɂ���͂��̐l�Ԃ�";
		mes "�ǂ�����Ă����ɗ����H";
		close;
	}
	if(EP19_1QUE >= 41)	// ������؂�ւ�肩������
		unittalk "���K���i�� : �����ɂ͊��ꂽ���ȁH";
	else
		unittalk "���K���i�� : �V�������܂ꂽ�q�H�@�������ƈꏏ�ɓ����ė~�����B";
	end;
}

jor_nest.gat,219,38,0	script	#e19ms106	139,5,5,{/* 2645 */
	if(EP19_1QUE >= 68)
		cloakonnpc "���K���i��#e19ms104";
	end;
}
jor_nest.gat,219,38,5	script	���K���i��#e19ms104	10472,{/* 2646 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K���i��]";
		mes "�������ɂ���͂��̐l�Ԃ�";
		mes "�ǂ�����Ă����ɗ����H";
		close;
	}
	if(EP19_1QUE >= 41)	{	// ������؂�ւ�肩������
		unittalk "���K���i�� : �����߂�҂�������A���ɋ����Ă����B";
		end;
	}
	unittalk "���K���i�� : ����H�@�����A�V�������܂ꂽ�H";
	end;
}

jor_nest.gat,224,207,3	script	�n�[�g�n���^�[#e19ms100	21536,{/* 2647 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�J�𒆂̐l�Ԃ��A�����ɗ���ȁI";
		mes "�d���ɖ߂�I";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "�n�[�g�n���^�[ : �����Ŏ{�݂�����Ă���B";
	else
		unittalk "�n�[�g�n���^�[ : �����A���܂�ߕt���ȁB";
	end;
}

jor_nest.gat,231,253,5	script	�n�[�g�n���^�[#e19ms101	21536,{/* 2648 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�J�𒆂̐l�Ԃ��A�����ɗ���ȁI";
		mes "�d���ɖ߂�I";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "�n�[�g�n���^�[ : �����͂�����ƕs�C�������B";
	else
		unittalk "�n�[�g�n���^�[ : �߂Â��������B��������B";
	end;
}

jor_nest.gat,231,186,5	script	�n�[�g�n���^�[#e19ms102	21536,{/* 2649 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�J�𒆂̐l�Ԃ��A�����ɗ���ȁI";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "�n�[�g�n���^�[ : �x���̎d���͉ɂ����B";
	else
		unittalk "�n�[�g�n���^�[ : �����A���K������B";
	end;
}

jor_nest.gat,232,161,3	script	�n�[�g�n���^�[#e19ms103	21536,{/* 2650 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�������Ă���H";
		mes "�d���ɖ߂�I";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "�n�[�g�n���^�[ : �N�����Ȃ��̂ɁA���������Ă����񂾁H";
	else
		unittalk "�n�[�g�n���^�[ : �����H�@�����p���H";
	end;
}

jor_nest.gat,217,144,5	script	�n�[�g�n���^�[#e19ms104	21536,{/* 2651 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�J�𒆂̐l�Ԃ��A�����ɗ���ȁI";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "�n�[�g�n���^�[ : �N����サ�Ă���˂����Ȃ��B";
	else
		unittalk "�n�[�g�n���^�[ : �����ɋ߂Â��ȁB�����ĂȂ��̂��H";
	end;
}

jor_nest.gat,239,143,3	script	�n�[�g�n���^�[#e19ms105	21536,{/* 2652 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�����ɋ߂Â��ȁI";
		mes "�d���ɖ߂�I";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "�n�[�g�n���^�[ : ���S����肱�����ǂ��c�c�񂾂�ȁH";
	else
		unittalk "�n�[�g�n���^�[ : �ߕt���ƒɂ��ڂ��݂邼�H";
	end;
}

jor_nest.gat,190,203,5	script	�n�[�g�n���^�[#e19ms106	21536,{/* 2653 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "���O�A�ǂ�����Ă����ɓ�����!?";
		close;
	}
	if(EP19_1QUE >= 68)	//?
		unittalk "�n�[�g�n���^�[ : ���ꂪ�����܂ő厖�Ȃ̂��H";
	else
		unittalk "�n�[�g�n���^�[ : �ߕt���Ȃ�B�@�󂵂����ςȂ��ƂɂȂ�B";
	end;
}

jor_nest.gat,109,184,0	script	#e19ms107	139,5,5,{/* 2654 */
	if(EP19_1QUE >= 68)	// ���m�F
		cloakonnpc "�n�[�g�n���^�[#e19ms107";
	end;
}
jor_nest.gat,109,184,5	script	�n�[�g�n���^�[#e19ms107	21536,{/* 2655 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "���ɖ������̂��H";
		mes "�����ɖ߂�I";
		close;
	}
	unittalk "�n�[�g�n���^�[ : ���낤�낷��ȁB���O������ꏊ����Ȃ��B";
	end;
}

jor_nest.gat,80,150,0	script	#e19ms108	139,5,5,{/* 2656 */
	if(EP19_1QUE >= 68)	// ���m�F
		cloakonnpc "�n�[�g�n���^�[#e19ms108";
	end;
}
jor_nest.gat,80,150,1	script	�n�[�g�n���^�[#e19ms108	21536,{/* 2657 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�J�𒆂̐l�Ԃ��A�����ɗ���ȁI";
		mes "�d���ɖ߂�I";
		close;
	}
	unittalk "�n�[�g�n���^�[ : ���ꂪ�ǂ߂邩�H�@180�x�Ȃ����Ė߂�Ȃ����A�Ə�����Ă�B";
	end;
}

jor_nest.gat,24,169,0	script	#e19ms109	139,5,5,{/* 2658 */
	if(EP19_1QUE >= 68)	// ���m�F
		cloakonnpc "�n�[�g�n���^�[#e19ms109";
	end;
}
jor_nest.gat,24,169,5	script	�n�[�g�n���^�[#e19ms109	21536,{/* 2659 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�[�g�n���^�[]";
		mes "�J�𒆂̐l�Ԃ��A�����ɗ���ȁI";
		mes "�d���ɖ߂�I";
		close;
	}
	unittalk "�n�[�g�n���^�[ : ����A�֌W�҂��H";
	end;
}

jor_nest.gat,124,204,0	script	#hw_ep19re1	139,5,5,{/* 2660 */
	//36~40��, 43������
	if(EP19_1QUE >= 35 && EP19_1QUE <= 43)
		cloakoffnpc "���C�W�[#ep19re1";
	end;
}

jor_nest.gat,127,207,3	script	���C�W�[#ep19re1	10475,{/* 2661 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���C�W�[]";
		mes "���������A�����̓��K���ɕϐg���Ȃ��ƁB";
		mes "�����o�������H";
		close;
	}
	switch(EP19_1QUE) {
	case 35:
		mes "[���C�W�[]";
		mes "��ɂ��̕t�߂̗l�q�����Ă�����";
		mes "�C���V�I���̐l�Ԃ�����";
		mes "���ʂ̃��K���̎p�������Ȃ��B";
		mes "�ǂ����ꎞ�I�ɐȂ��O���Ă�悤���B";
		next;
		mes "[���C�W�[]";
		mes "���傤�ǂ����@��B";
		mes "���̂����ɏ����W�߂悤�B";
		mes "�ŏ㋉���K���ł�������Ȃ��ꏊ��";
		mes "�������ׂ邩��";
		mes strcharinfo(0)+"��";
		mes "���̕t�߂𒲂ׂĂ݂Ă���B";
		next;
		mes "[���C�W�[]";
		mes "���`��A�������ȁB";
		mes "�C���V�I���̎�������T���Ă݂ẮH";
		mes "�������́A�x���W�̃��K���Ƃ��H";
		next;
		menu "�������܂��傤",-;
		mes "[���C�W�[]";
		mes "�������I�������A�����ɏW�����悤�B";
		mes "�����܂Ő��܂ꂽ�Ẵ��K���Ƃ���";
		mes "�U�������Ƃ�Y���Ȃ�B";
		mes "������`�΂Ԃ��`!!";
		delquest 17638;
		setquest 16639;
		set EP19_1QUE,36;
		close2;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 0, 1, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 0, 3, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		cloakonnpc "���C�W�[#ep19re1";
		end;
	case 36:
	case 37:
	case 38:
	case 39:
	case 40:
	case 41:
		mes "[���C�W�[]";
		mes "�b�����Ă����ꏊ�͑S��������H";
		mes "�C���V�I���̎������Ƃ�";
		mes "�x���W�̃��K���Ƃ��H";
		next;
		menu "�܂�����Ă��Ȃ�",-;
		mes "[���C�W�[]";
		mes "�݂�ȐȂ��O���Ă���悤������";
		mes "���̂����ɒ��ׂĂ݂Ă����B";
		close2;
		cloakonnpc "���C�W�[#ep19re1";
		end;
	case 42:
		mes "[���C�W�[]";
		mes "�b�����Ă����ꏊ�͑S��������H";
		mes "�C���V�I���̎������Ƃ�";
		mes "�x���W�̃��K���Ƃ��H";
		next;
		menu "����ė��܂���",-;
		mes "[���C�W�[]";
		mes "�悵�B";
		mes "���݂��ɏW�߂���������";
		mes "�ǂ����邩�������悤�B";
		mes "�܂��́A�C���V�I���̎�������";
		mes "�킩�������Ƃ������Ă���B";
		next;
		switch(select("��l�̃C���V�I���̊֌W�ɂ���","�C���V�I�������̂���Ă�������ɂ���")) {
		case 1:
			mes "[���C�W�[]";
			mes "�����ƁI";
			mes "�����P�A���o�S�b�g�ɔ�ׂ�";
			mes "�y������Ă���āH";
			mes "���������X�K���h�̖��߂�";
			mes "�o�S�b�g�̌�����D�悷��悤��";
			mes "�ʒB����Ă�����ȁB";
			next;
			mes "[���C�W�[]";
			mes "�����̔z���ɂ��ď����ꂽ";
			mes "��v�������ɓ��ꂽ�H";
			mes "�L�\�`�I";
			mes "�ǂ�ǂ�c�c";
			mes "������ƁI�@�����܂ō��������!?";
			next;
			mes "[���C�W�[]";
			mes "�����Ȃ�ƁA��l�̌������e��";
			mes "�C�ɂȂ�ȁB";
			mes "�o�S�b�g�̌�����D�悷�闝�R�B";
			mes "���فI�@����������ς��I";
			mes "�����������Ă���B";
			next;
			mes "[���C�W�[]";
			mes "�c�c�Ȃ�قǁB";
			mes "�����悤�ȓ��e����";
			mes "�o�S�b�g�̕����댯�Ȋ���������ȁB";
			mes "���w���Ō����u�U��̐_�v��";
			mes "���Ă���Ȃ��";
			mes "�C���ȗ\��������B";
			break;
		case 2:
			mes "[���C�W�[]";
			mes "��l�̌������e���C�ɂȂ�ȁB";
			mes "�o�S�b�g�̌�����D�悷�闝�R��";
			mes "�֌W������񂶂�Ȃ��H";
			mes "�������ς�ł���Ƃ����Ȃ�";
			mes "�����������Ă���B";
			next;
			mes "[���C�W�[]";
			mes "�c�c�Ȃ�قǁB";
			mes "�����悤�ȓ��e����";
			mes "�o�S�b�g�̕����댯�Ȋ���������ȁB";
			mes "���w���Ō����u�U��̐_�v��";
			mes "���Ă���Ȃ��";
			mes "�C���ȗ\��������B";
			next;
			mes "[���C�W�[]";
			mes "�����̔z���ɂ��ď����ꂽ";
			mes "��v�������ɓ��ꂽ�H";
			mes "�L�\�`�I";
			mes "�ǂ�ǂ�c�c";
			mes "������ƁI�@�����܂ō��������!?";
			next;
			mes "[���C�W�[]";
			mes "���X�K���h���o�S�b�g�̌�����";
			mes "�ŗD�悷��悤��";
			mes "�����P�A�ɒʍ����Ă�����";
			mes "�����P�A�̗���͈����Ȃ�΂��肾�ȁB";
			break;
		}
		next;
		mes "[���C�W�[]";
		mes "�������A�v�����ȏ��";
		mes "�����P�A�ƃo�S�b�g�̊֌W��";
		mes "�����Ȃ��Ă���񂶂�Ȃ����H";
		mes "����͗��p�ł��邼�B";
		next;
		mes "[���C�W�[]";
		mes "�C���V�I���̃����o�[�̊֌W��";
		mes "����Ɉ����������";
		mes "���낢�듮���₷���Ȃ�B";
		mes "�����v��Ȃ��H";
		next;
		if(select("�����l���ł�","�܂��܂��ł���") == 2) {
			mes "[���C�W�[]";
			mes "���C����Ȃ��������ȁH";
			mes "�Ƃ͌����A��Ă��������낤�H";
			mes "��i�͑I��ł��Ȃ��񂾂���";
			mes "�Ƃɂ�������Ă݂悤���B";
			next;
		}
		mes "[���C�W�[]";
		mes strcharinfo(0)+"��";
		mes "�����P�A��S�����Ă���B";
		mes "�e���x���グ��";
		mes "�o�S�b�g�ւ̕s�M�������񂾁B";
		mes "���́A�������Ƃ��o�S�b�g�ɂ���B";
		next;
		mes "[���C�W�[]";
		mes "���݂��ɐi�W����������";
		mes "�X�̏�ɖ߂��ĕ񍐂��悤�B";
		mes "���ꂶ�Ⴀ�A���J�n���I";
		delquest 16645;
		setquest 16646;
		set EP19_1QUE,43;
		close;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
	case 43:
		mes "[���C�W�[]";
		mes strcharinfo(0)+"��";
		mes "�����P�A��S�����Ă���B";
		mes "�e���x���グ��";
		mes "�o�S�b�g�ւ̕s�M�������񂾁B";
		mes "���́A�������Ƃ��o�S�b�g�ɂ���B";
		next;
		mes "[���C�W�[]";
		mes "���݂��ɐi�W����������";
		mes "�X�̏�ɖ߂��ĕ񍐂��悤�B";
		mes "���ꂶ�Ⴀ�A���J�n���I";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,19,142,3	script	���ނ̎R#ep19re1	10391,{/* 2662 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : �ϐg���Ȃ��Ɓc�c",1;
	}
	if(EP19_1QUE == 36) {
		mes "�]��������Ă��Ȃ����ނ̎R��";
		mes "�@���������ςݏグ���Ă���B";
		mes "�@��ʂ�ڂ�ʂ��̂�";
		mes "�@�����܂ꂻ�����c�c�]";
		next;
		mes "�c";
		next;
		mes "�c";
		mes "�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�񍐏�]";
		mes "�c�l�H���͂�l�דI�ɗ������݁c";
		mes "�c�c�Y���̕��@���g�����ƂŁc�c";
		mes "�c�z������O�̗��̓������c�c�c";
		mes "�c���߂��邱�Ƃ����炩�ɂȂ����c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c���ł������́A���ꂮ�炢���B";
		mes "���̏ꏊ�����ׂĂ݂悤�B";
		delquest 16639;
		setquest 16640;
		set EP19_1QUE,37;
		close;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 0, 1, ���ނ̎R#ep19re2;	// 2664: 21, 195
	}
	if(EP19_1QUE >= 37) {
		mes "["+strcharinfo(0)+"]";
		mes "���̏��ނ̎R�́A�����ς��B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,21,195,0	script	#hw_ep19re2-1	139,14,14,{/* 2663 */
	if(EP19_1QUE == 37) {
		cloakoffnpc "���ނ̎R#ep19re2";
		cloakonnpc "���O���K���h#ep19re2";
	}
	else if(EP19_1QUE == 38/* || EP19_1QUE == 39*/)	// 39�A������
		cloakoffnpc "���ނ̎R#ep19re2";
	else
		cloakoffnpc "���m��ʔ�#ep19re1";
	end;
}

jor_nest.gat,21,195,3	script	���ނ̎R#ep19re2	10391,{/* 2664 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : �ϐg���Ȃ��Ɓc�c",1;
	}
	if(EP19_1QUE == 37) {
		mes "�]��������Ă��Ȃ����ނ̎R��";
		mes "�@���������ςݏグ���Ă���B";
		mes "�@��ʂ�ڂ�ʂ��͍̂����܂ꂻ�����]";
		next;
		mes "�c";
		next;
		mes "�c";
		mes "�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�񍐏�]";
		mes "�c�����łȂ��A���łɐ��܂ꂽ�̂�";
		mes "�c�c�������@��p���邱�ƂŁc";
		mes "�c�D�G�Ȍ̂ɕω��ł��鎖�����c�c�B";
		next;
		cloakoffnpc "���O���K���h#ep19re2";
		unittalk getnpcid(0,"���O���K���h#ep19re2"),"���O���K���h : �����̂��O�I",1;
		mes "[���O���K���h]";
		mes "�����̐l�Ԃ�����";
		mes "�Ȃ��O���Ă���͂������H";
		mes "�����ɂ���̂͒N���H";
		next;
		mes "[���O���K���h]";
		mes "�i�Ջ��Ȃ̂ɒm��Ȃ��炾�ȁB";
		mes "�����A�V�������܂ꂽ�Ƃ����q���B";
		mes "���O�͉��ƌ����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Z�l�L�I�K���h�ł��B";
		next;
		mes "[���O���K���h]";
		mes "�Z�l�L�I�K���h���B";
		mes "���̓��O���K���h�Ƃ����B";
		mes "�C���V�I�����̌x���ӔC�҂��B";
		mes "�l�Ԃ������x�삵�Ă��邪";
		mes "�����ɊĎ������Ă���B";
		next;
		mes "[���O���K���h]";
		mes "�l�Ԃ����̂��Ƃ�";
		mes "���S�ɐM�p���邱�Ƃ͂ł��Ȃ��B";
		mes "�ӂ��c�c�܂��A�l�ԓ��m�ł�";
		mes "���݂��ɐM�p���Ă��Ȃ��悤�����B";
		next;
		mes "[���O���K���h]";
		mes "���ŋ߁A�����P�A�Ƃ����l�Ԃ�";
		mes "�o�S�b�g�Ƃ����l�Ԃ�";
		mes "�����������Ă���̂𕷂����B";
		mes "�o�S�b�g�Ɏd���̐��ʂ�D����";
		mes "���Ȃ�{���Ă���悤�������ȁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�d���̐��ʂ�D��ꂽ�H";
		next;
		mes "[���O���K���h]";
		mes "�ŏ��ɂ����ɗ��Č������n�߂��̂�";
		mes "�����P�A��������";
		mes "�ォ�獇�������o�S�b�g�̌������e��";
		mes "���X�K���h�l�̂��C�ɏ������̂��B";
		next;
		mes "[���O���K���h]";
		mes "�����P�A�́A�����̐��ʂ��o����";
		mes "�󋵂����P���悤�Ƃ��Ă���悤����";
		mes "��肭�����Ă͂��Ȃ��B";
		mes "�����ƁA�q���ɂ͓���b�������ȁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�����ł��Ă��Ȃ��ӂ�����悤�j";
		mes "���v�ł��A�ʔ��������ł��B";
		next;
		mes "[���O���K���h]";
		mes "�͂́A�����I";
		mes "�킩��Ȃ����Ƃ͂킩��Ȃ���";
		mes "�����ėǂ��񂾂��B";
		next;
		mes "[���O���K���h]";
		mes "�ł́A���͎d���ɖ߂邩��";
		mes "���O���������痣���񂾁B";
		mes "���̕ӂ�ɂ́A��Ȃ����̂�";
		mes "�u����Ă���悤������ȁB";
		next;
		cloakonnpc "���O���K���h#ep19re2";
		mes "["+strcharinfo(0)+"]";
		mes "�i�����P�A�̌�������";
		mes "�@����ȂƂ��납�ȁc�c";
		mes "�@���́A�o�S�b�g�̌������ɂł�";
		mes "�@�s���Ă݂悤���j";
		delquest 16640;
		setquest 16641;
		set EP19_1QUE,38;
		close;
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 0, 1, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		//
	}
	if(EP19_1QUE == 38) {
		mes "["+strcharinfo(0)+"]";
		mes "�i�����P�A�̌�������";
		mes "�@����ȂƂ��납�ȁc�c";
		mes "�@���́A�o�S�b�g�̌������ɂł�";
		mes "�@�s���Ă݂悤���j";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,22,192,3	script	���O���K���h#ep19re2	10473,{/* 2665 (cloaking)*/
	//������
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,66,260,3	script	�o�S�b�g�̌�����#warp_e	10046,{/* 2666 */
	if(EP19_1QUE >= 38 && EP19_1QUE <= 49) {	// ����������^�C�~���O������
		mes "�]���̐悪�o�S�b�g�̌������̂悤���]";
		next;
		if(select("���֓���","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ɓ������]";
		close2;
		warp "jor_dun03.gat", 58, 52;
		end;
	}
	if(EP19_1QUE == 57) {
		if(mdopenstate("�o�S�b�g�̌�����") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�]�l�q���m�F�������";
			mes "�@��肪�����悤�ł����";
			mes "�@�������ɓ��邱�Ƃɂ��悤�]";
			set '@menu$,"�u�o�S�b�g�̌������v����";
		}
		else {
			mes "�]�o�S�b�g�̌����������";
			mes "�@�����̉��������Ă���B";
			mes "�@�l�q���m�F�������";
			mes "�@�������ɓ��邱�Ƃɂ��悤�]";
			set '@menu$,"�u�o�S�b�g�̌������v(�o�S�b�g�̌�����)�̍쐬";
		}
		next;
		if(select("��߂�",'@menu$) == 1) {
			mes "�]���̏ꂩ�痧���������]";
			close;
		}
		if(mdopenstate("�o�S�b�g�̌�����")) {
			mes "�]�O����ł͌��������̗l�q��";
			mes "�@�m�F���邱�Ƃ��ł��Ȃ��B";
			mes "�@���ɓ����Ċm�F���邵���Ȃ��悤���]";
			close2;
			if(getonlinepartymember() > 2) { // ������
				mes "[�C���t�H���[�V����]";
				mes "���̃������A���_���W������";
				mes "2�l�ȉ��̃p�[�e�B�[��";
				mes "���ꂷ�邱�Ƃ��ł��܂��B";
				close;
			}
			switch(mdenter("�o�S�b�g�̌�����")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[�o�S�b�g�̌�����] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("BagotLabControl1")+ "::OnStart";
				//warp "1@jorlab.gat", 57, 45;
				end;
			case 1:	// �p�[�e�B�[������
				mes "[�C���t�H���[�V����]";
				mes "���̃������A���_���W������";
				mes "2�l�ȉ��̃p�[�e�B�[��";
				mes "���ꂷ�邱�Ƃ��ł��܂��B";
				close;
			case 2:	// �_���W�������쐬
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
			mdcreate "�o�S�b�g�̌�����";
			mes "���p�[�e�B�[��";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "���p�[�e�B�[���[�_�[";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "�@";
			mes "^006400�o�S�b�g�̌�����^000000�̍쐬�\�����󂯕t���܂��B";
			close;
		}
	}
	if(EP19_1QUE >= 58) {
		if(mdopenstate("�o�S�b�g�̌�����")) {
			mes "[�C���t�H���[�V����]";
			mes "���Ɂu�o�S�b�g�̌������v��";
			mes "�N���A���Ă���L�����N�^�[�́A";
			mes "�p�[�e�B�����o�[�Ƃ���";
			mes "�u�o�S�b�g�̌������v��";
			mes "����ł��܂��B";
			next;
			mes "[�C���t�H���[�V����]";
			mes "�p�[�e�B�����o�[�Ƃ���";
			mes "�u�o�S�b�g�̌������v��";
			mes "���ꂵ�܂����H";
			next;
			if(select("��߂�","�u�o�S�b�g�̌������v����") == 1) {
				mes "�]��߂��]";
				close;
			}
			mes "[�C���t�H���[�V����]";
			mes "�u�o�S�b�g�̌������v�֓��ꂵ�܂��B";
			close2;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				mes "[�C���t�H���[�V����]";
				mes "���Ɂu�o�S�b�g�̌������v��";
				mes "�N���A���Ă���L�����N�^�[�́A";
				mes "�p�[�e�B���[�_�[�Ƃ���";
				mes "����ł��܂���B";
				close;
			}
			if(getonlinepartymember() > 2) { // ������
				mes "[�C���t�H���[�V����]";
				mes "���̃������A���_���W������";
				mes "2�l�ȉ��̃p�[�e�B�[��";
				mes "���ꂷ�邱�Ƃ��ł��܂��B";
				close;
			}
			switch(mdenter("�o�S�b�g�̌�����")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[�o�S�b�g�̌�����] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("BagotLabControl1")+ "::OnStart";
				//warp "1@jorlab.gat", 57, 45;
				end;
			case 1:	// �p�[�e�B�[������
				mes "[�C���t�H���[�V����]";
				mes "���̃������A���_���W������";
				mes "2�l�ȉ��̃p�[�e�B�[��";
				mes "���ꂷ�邱�Ƃ��ł��܂��B";
				close;
			case 2:	// �_���W�������쐬
				mes "[�C���t�H���[�V����]";
				mes "�Ώۂ̃������A���_���W������";
				mes "�쐬����Ă��Ȃ�����";
				mes "����ł��܂���B";
				close;
			default:	// ���̑��G���[
				close;
			}
		}
	}
	unittalk getcharid(3),strcharinfo(0)+" : ��Ɍ����������Ă���",1;
	end;
}

jor_dun03.gat,58,48,0	warp	#hw_ep19re3	2,2,jor_nest.gat,62,255	// 2667 from: jor_dun03.gat(58, 50)

jor_dun03.gat,58,54,0	script	#hw_ep19re3	139,5,5,{/* 2668 */
	if(EP19_1QUE == 38)
		cloakoffnpc "���ނ̎R#ep19re3";
	else if(EP19_1QUE == 39)
		cloakoffnpc "���ނ̎R#ep19re4";
	end;
}

jor_dun03.gat,74,71,3	script	���ނ̎R#ep19re3	10391,{/* 2669 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : �ϐg���Ȃ��Ɓc�c",1;
	}
	if(EP19_1QUE == 38) {
		mes "�]�V���[�v�ȕM�Ղŏ����ꂽ���ނ�";
		mes "�@�Y��ɐςݏグ���Ă���B";
		mes "�@��ʂ�ڂ�ʂ��͍̂����܂ꂻ�����]";
		next;
		mes "�c";
		next;
		mes "�c";
		mes "�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�񍐏�]";
		mes "�c�����k�̖��͂��g�p���āc�c";
		mes "�c�c���łɐ��܂ꂽ�̂ɂ��c";
		mes "�c���D�ꂽ�����̂��c�c";
		mes "�c�c���邱�Ƃ��ł��c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�����P�A�̎������œǂ�";
		mes "�@�񍐏��̓��e�Ǝ��Ă���B";
		mes "�@��l�͎����悤��";
		mes "�@���������Ă���̂��낤���H�j";
		next;
		mes "�]�������������n���Ă݂��";
		mes "�@�����̎����̂Ɋ��������o�����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������c�c";
		mes "���w���Ō����u�U��̐_�v�c�c�I";
		mes "����Ɏ��Ă���C������c�c";
		mes "�����������ƒ��ׂĂ݂悤�B";
		delquest 16641;
		setquest 16642;
		set EP19_1QUE,39;
		cloakoffnpc "���ނ̎R#ep19re4";
		close;
		//showevent 9999, 0, ���ނ̎R#ep19re3;	// 2669: 74, 71
		//showevent 0, 1, ���ނ̎R#ep19re4;	// 2670: 49, 80
	}
	if(EP19_1QUE == 39) {
		mes "["+strcharinfo(0)+"]";
		mes "���̏��ނ̎R�́A�����ς��B";
		cloakoffnpc "���ނ̎R#ep19re4";
		close;
	}
	if(EP19_1QUE == 40) {
		mes "["+strcharinfo(0)+"]";
		mes "���̏��ނ̎R�́A�����ς��B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_dun03.gat,49,80,3	script	���ނ̎R#ep19re4	10391,{/* 2670 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : �ϐg���Ȃ��Ɓc�c",1;
	}
	if(EP19_1QUE == 39) {
		mes "�]�V���[�v�ȕM�Ղŏ����ꂽ���ނ�";
		mes "�@���R�Ɛςݏグ���Ă���B";
		mes "�@�g�b�v�V�[�N���b�g�Ə����ꂽ���ނ�";
		mes "�@�����鎖���o�����]";
		next;
		mes "[�g�b�v�V�[�N���b�g]";
		mes "�c���w���ł̎����̂Ɠ�����";
		mes "�c�c�ψق��n�߂������̂́c�c";
		mes "�c�זE�P�ʂł́c�c���s����c";
		mes "�c�c�����ψّO�̏�Ԃɖ߂��̂́c�c";
		mes "�c��{�I�ɕs�\�ł���c�c�B";
		next;
		mes "[�g�b�v�V�[�N���b�g]";
		mes "�c�������A���͂̔g���������ꍇ�́c�c";
		mes "�c�c�����܂ŉ����̈���o�Ȃ����c�c";
		mes "�c�c�͂��Ȃ���\��������c�c";
		mes "�c�g���̍����ޗ��Ɓc�c";
		mes "�c�c�K�؂ȏp�m���K�v�ƂȂ�c�c�B";
		next;
		mes "[�g�b�v�V�[�N���b�g]";
		mes "�c�c���ݗ��p���Ă��郋�K�����c";
		mes "�c�ψّO�̎p�ɖ߂��K�v�͂Ȃ����߁c";
		mes "�c�c���̌����̏d�v�x�͒Ⴂ�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�����P�A�͏㋉���K��������";
		mes "�@�����̑Ώۂɂ͂��Ȃ���";
		mes "�@�������͂������ǁc�c�j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ψق����p��߂����@���c�c";
		mes "�@���̏�񂪗~�����B";
		mes "�@���K���������W�܂��Ă���ꏊ��";
		mes "�@�s���Ă݂悤�j";
		delquest 16642;
		setquest 16643;
		set EP19_1QUE,40;
		close;
		//showevent 9999, 0, ���ނ̎R#ep19re3;	// 2669: 74, 71
		//showevent 9999, 0, ���ނ̎R#ep19re4;	// 2670: 49, 80
	}
	if(EP19_1QUE == 40) {
		mes "["+strcharinfo(0)+"]";
		mes "�i���̏�񂪗~�����B";
		mes "�@���K���������W�܂��Ă���ꏊ��";
		mes "�@�s���Ă݂悤�j";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,177,176,0	script	#hw_ep19re4	139,14,14,{/* 2671 */
	if(EP19_1QUE == 40) {
		cloakoffnpc "���K���x����#ep19re1";
		cloakoffnpc "���K���x����#ep19re2";
	}
	else if(EP19_1QUE == 41) {
		cloakonnpc "���K���x����#ep19re1";
		cloakonnpc "���K���x����#ep19re2";
		cloakoffnpc "���ނ̎R#ep19re5";
	}
	else if(EP19_1QUE == 42) {
		cloakoffnpc "���ނ̎R#ep19re5";
	}
	else {
		cloakonnpc "���K���x����#ep19re1";
		cloakonnpc "���K���x����#ep19re2";
		cloakonnpc "���ނ̎R#ep19re5";
	}
}

jor_nest.gat,173,177,3	script	���K���x����#ep19re1	10471,{/* 2672 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : �ϐg���Ȃ��Ɓc�c�B",1;
	}
	if(EP19_1QUE == 40) {
		mes "["+strcharinfo(0)+"]";
		mes "�i�x�����炵�����K��������";
		mes "�@��b���������ė����B";
		mes "�@������ɂ͋C�Â��Ă��Ȃ��悤���j";
		next;
		mes "[���K���x������]";
		mes "�܂��A���O���K���h�l�Ɏ���ꂽ�B";
		mes "���X�K���h�l�̂������̌x����";
		mes "�蔖�Ȃ̂ł͂Ȃ����ƁB";
		next;
		mes "[���K���x������]";
		mes "�x���̐l�������炵���킯�ł͂Ȃ��̂�";
		mes "����͂��������ł���܂��B";
		next;
		mes "[���K���x������]";
		mes "�ŋ߂́A���̍������̐l�Ԃ�";
		mes "���X�K���h�l�̂�������";
		mes "�p�ɂɏo���肵�Ă��邾��H";
		mes "���̐l�Ԃ̂��Ƃ�M�p����ȂƁB";
		next;
		mes "[���K���x������]";
		mes "���X�K���h�l�́A���̐l�Ԃ�";
		mes "�C�ɓ����Ă�����悤����";
		mes "�ǂ���烆�O���K���h�l��";
		mes "�����ł͂Ȃ��炵���B";
		next;
		mes "[���K���x������]";
		mes "�c�c����������ł���܂����H";
		next;
		mes "[���K���x������]";
		mes "�l���̔z�u���čl������肾�B";
		mes "����ƁA����܂ňȏ�ɒ��ӂ���";
		mes "���X�K���h�l�̂��������x������B";
		mes "�����ƁA�����̎��Ԃ��B";
		mes "�s�����B";
		next;
		mes "[���K���x������]";
		mes "�����ł���܂��I";
		next;
		cloakonnpc "���K���x����#ep19re1";
		cloakonnpc "���K���x����#ep19re2";
		cloakoffnpc "���ނ̎R#ep19re5";
		mes "["+strcharinfo(0)+"]";
		mes "�i����ȏ�͓���";
		mes "�@���𓾂�ꂻ���ɂȂ��ȁc�c";
		mes "�@��H�@�������ނ��u����Ă���j";
		delquest 16643;
		setquest 16644;
		set EP19_1QUE,41;
		close;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 0, 1, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,168,177,5	script	���K���x����#ep19re2	10472,{/* 2673 (cloaking)*/
	unittalk getcharid(3),strcharinfo(0)+" : ������ɋC�t���Ă��Ȃ��݂�����",1;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,181,173,3	script	���ނ̎R#ep19re5	10391,{/* 2674 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		unittalk getcharid(3),strcharinfo(0)+" : �ϐg���Ȃ��Ɓc�c",1;
	}
	if(EP19_1QUE == 41) {
		mes "�]�����̏��ނ��u����Ă���B";
		mes "�@�c�c�ǂ����";
		mes "�@�����Ȃǂ̔z����Ɋւ���";
		mes "�@������Ă���悤���]";
		next;
		mes "�c";
		next;
		mes "�c";
		mes "�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		next;
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		mes "�c�c�c�c";
		next;
		mes "�]��v����ɂ�";
		mes "�@�o�S�b�g�Ɏx������镨����";
		mes "�@�����P�A�Ɏx������镨���̗ʂ�";
		mes "�@�ڍׂɋL�ڂ���Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�����P�A�Ɏx������镨����";
		mes "�@�����Ă�������";
		mes "�@�o�S�b�g�Ɏx������镨����";
		mes "�@���炩�ɑ����Ă���j";
		next;
		if(checkitemblank() == 0) {
			mes "["+strcharinfo(0)+"]";
			mes "�i�c�c���ނ����ĂȂ��j";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c�g���邩������Ȃ��B";
		mes "�@���̏��ނ͂�����Ă������j";
		delquest 16644;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		setquest 16645;
		getitem 1000845,1;
		set EP19_1QUE,42;
		next;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 0, 1, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		mes "["+strcharinfo(0)+"]";
		mes "�i��v�������ɓ��ꂽ�B";
		mes "�@���C�W�[�ƍ������悤�j";
		close;
	}
	if(EP19_1QUE == 42) {
		mes "["+strcharinfo(0)+"]";
		mes "�i��v�������ɓ��ꂽ�B";
		mes "�@���C�W�[�ƍ������悤�j";
		close;
	}
	if(EP19_1QUE == 43) {
		// ������
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,31,140,5	script	�����P�A#ep19re1	10455,{/* 2675 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�����P�A]";
		mes "�N�H";
		mes "�����͊֌W�҈ȊO�����֎~��B";
		mes "�����o�čs���āB";
		close;
	}
	switch(EP19_1QUE) {
	case 43:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�����͊֌W�҈ȊO";
		mes "�����֎~��B";
		mes "�c�c�����A�Z�l�L�I�K���h�B";
		mes "���O���B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�Ȃɂ��Ă܂����H";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���Ă킩��Ȃ��H";
		mes "�������Ă���́B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����̑̂ɒ��˂��h���̂�";
		mes "�����ł����H";
		mes "�����̑̂������ޗ��H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�d���Ȃ��ł���c�c";
		mes "���O�����������̑Ώۂɂ͂��Ȃ���";
		mes "�񑩂��Ă邩��B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����ɂ��Ă����Ȃ�";
		mes "���̑̂��g���Ă������B";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "����́c�c���͓I�Ȓ�Ă�����";
		mes "�񍐏��ɂ͎����̉ߒ���";
		mes "�B���������Ȃ��Ƃ����Ȃ�����p���B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���͕s����s�����������Ȃ��B";
		mes "�����A�����ŖZ��������";
		mes "�����o�čs���āB";
		mes "�͂��c�c�q���̑���͔���B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����P�A�͔��Ă�݂����H";
		mes "�����̑̂Ŏ�����������H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�c�c�������ȁB";
		mes "���Ă���̂́A�������؂ꂽ����B";
		mes "�͂��c�c�Â�����H�ׂ����ȁc�c";
		mes "�g�̂����������߂Ă�c�c�B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i����ȏ�A�b�𑱂���͖̂������B";
		mes "�@�������A�Â����������ė����";
		mes "�@���ǂ��Ȃ�邩������Ȃ��j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�Ƃ͂����A�����ŊÂ�����";
		mes "�@��ɓ���Ƃ͎v���Ȃ��B";
		mes "�@��x�A�X�̏�ɖ߂��ĊÂ������Ȃ���";
		mes "�@�T���Ă݂悤�j";
		delquest 16646;
		setquest 16647;
		set EP19_1QUE,44;
		next;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 9999, 0, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 6, 3, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		//showevent 0, 1, �`�F������#ep19re2;	// 2678: 245, 197
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	case 44:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���Ă���̂́A�������؂ꂽ����B";
		mes "�͂��c�c�Â�����H�ׂ����ȁc�c";
		mes "�g�̂����������߂Ă�c�c�B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i����ȏ�A�b�𑱂���͖̂������B";
		mes "�@�������A�Â����������ė����";
		mes "�@���ǂ��Ȃ�邩������Ȃ��j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�Ƃ͂����A�����ŊÂ�����";
		mes "�@��ɓ���Ƃ͎v���Ȃ��B";
		mes "�@��x�A�X�̏�ɖ߂��ĊÂ������Ȃ���";
		mes "�@�T���Ă݂悤�j";
		next;
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	case 45:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c�Z�l�L�I�K���h�B";
		mes "���͔��Ă���́B";
		mes "���O�̑��������C�͂�������B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����P�A�̂��߂�";
		mes "�Â����������Ă��܂����B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���A�{���H";
		mes "�c�c����A�ǂ�����Ď�ɓ��ꂽ�H";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�O�ɂ���ۂ��ă��t���t�ȓz���";
		mes "�Ƃ����߂���u���Ă����܂����B";
		mes "�Â����َq���ƌ����Ă܂����B";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "�ۂ��ă��t���t�c�c�H";
		mes "�����A�A�[�E�B���̂��Ƃ��B";
		mes "���O�͋@�]�������ˁB";
		mes "���΂͏㋉�̃��K���B";
		next;
		mes "[�����P�A]";
		mes "�c�c����B";
		mes "�Â��Ĕ��������c�c";
		mes "�������g�̂ɟ��݂邱�̊����c�c�B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����P�A�́A�Â������D���H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���A�D���ƌ�����";
		mes "�K�v������ێ悵�Ă邾��!!";
		mes "�����ł́A�Â����͋M�d������";
		mes "�Ȃ��Ȃ��ێ�ł��Ȃ������́B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�̑�ȃ��X�K���h�l��";
		mes "���炤���Ƃ͂ł��܂��񂩁H";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�������ނȂ�Ƃ�����";
		mes "���َq����������";
		mes "���V���Ă͂��Ă���Ȃ���B";
		mes "�Ƃ͌����A���͌������ނ�";
		mes "�\���Ƃ͌����Ȃ����ǁc�c�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c�ȑO�͂����Ə����";
		mes "���ނ��񂵂Ă���Ă��̂Ɂc�c";
		mes "�͂��A�q������ɋ�s���Ă�";
		mes "�d���Ȃ��̂ɁB";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���َq�������Ă��Ă����";
		mes "���肪�Ƃ��B";
		mes "�ł��A���O�ɂ��܂ł�";
		mes "�t�������Ă���قǉɂ���Ȃ��B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����Ƃ��b���������ł��B";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���̂˂��c�c";
		mes "�c�c���O�A�ɂ��Ă�Ȃ�";
		mes "�������̂��َq�������Ă��邩";
		mes "�����Ɏg��<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
		mes "1�����Ă��Ă���Ȃ��H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�����P�A�̎�`���������";
		mes "�@�����Ƙb�𕷂��邩������Ȃ��j";
		delquest 16648;
		setquest 16649;
		set EP19_1QUE,46;
		delitem 1000846,1;
		close2;
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 46:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c���O�A�ɂ��Ă�Ȃ�";
		mes "�������̂��َq�������Ă��邩";
		mes "�����Ɏg��<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
		mes "1�����Ă��Ă���Ȃ��H";
		next;
		set '@delid,1000846;
		if(countitem(1000846) < 1) {	// �X�َq
			if(countitem(1000707) > 0) {	// ���K���̒ዉ���͊j
				mes "[�����P�A]";
				mes "����H";
				mes "���K���̒ዉ���͊j��";
				mes "�����Ă��Ă��ꂽ�́H";
				next;
				if(select("�n��","�n���Ȃ�") == 2) {
					mes "[�����P�A]";
					mes "�c�c�o�J�ɂ��Ă�́H";
					mes "���O�ƗV��ł���ɂ͖�������";
					mes "�����Ă�ł���B";
					close2;
					cutin "ep19_juncea01.png", 255;
					end;
				}
				//�ȉ��A������
				set '@delid,1000707;
			}
			else {	// �ǂ���������ĂȂ�
				mes "[�����P�A]";
				mes "���́A���O�ƗV��ł���ɂ͖����́B";
				mes "�p�������Ȃ�A�o�čs���āB";
				next;
				cutin "ep19_juncea01.png", 255;
				mes "["+strcharinfo(0)+"]";
				mes "�i�Â����َq�Ȃ�A�X�̏�ɂ���";
				mes "�@�`�F����������Ⴆ��͂����j";
				next;
				mes "�]�X�̏�֌������܂����H�]";
				next;
				if(select("������","��߂�") == 2) {
					mes "�]���̏�ɂƂǂ܂����]";
					close;
				}
				mes "�]�X�̏�֌��������]";
				close2;
				warp "icas_in.gat", 251, 197;
				end;
			}
		}
		else {
			mes "[�����P�A]";
			mes "�����A�X�َq�������Ă��Ă��ꂽ�̂ˁB";
			mes "�킩���Ă邶��Ȃ��H";
		}
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "���肢�������������Ă��Ă����Ȃ��";
		mes "�Ȃ��Ȃ����ˁB";
		mes "�{���ɐ��܂ꂽ�΂���̃��K���Ȃ́H";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "(�c�M�N�b�I)";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�����Ȃ��l���݂̒m�\��������";
		mes "���K�������܂�ė����ƂȂ��";
		mes "�������鉿�l������񂾂��ǁB";
		next;
		mes "[�����P�A]";
		mes "�����I";
		mes "������������Ȃ��I";
		mes "���Ԃ������p�̎��ނ��I";
		mes "�o�S�b�g�͂����Ɛ��";
		mes "�i��ł�����Č����̂ɁI";
		next;
		mes "[�����P�A]";
		mes "���̊k��������_�����c�c";
		mes "���ڃ��K���̑̂��g�����������ł�����";
		mes "�������ؖ��ł��邩������Ȃ��̂ɁB";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�ǂ�ȉ����H";
		mes "�����ؖ��ł���́H";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "�z��������̃��K����";
		mes "�l�H�̖��͂𒍓����邱�Ƃ�";
		mes "��苭�����K���ɂȂ�Ƃ��������B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�킟�I�@���͂����Ƌ����Ȃ肽���B";
		mes "���Ɏ������Ă�������H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�댯�����A�񑩂����Ă���B";
		mes "���O�������ɂ͎g���Ȃ��B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���������āA�����";
		mes "�����̑̂��g���Ď������Ă�́H";
		mes "�댯����Ȃ��́H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�c�c�ςȂ��Ƃ��C�ɂ���ˁB";
		mes "���v��B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�����A�x�e���Ԃ͏I���I";
		mes "���͎d���ɖ߂邩��B";
		next;
		mes "[�����P�A]";
		mes "�c�c�����܂����̂��Ƃ�";
		mes "��`���Ă����̂Ȃ�";
		mes "�X�َq1��";
		mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM> 1��";
		mes "�����Ă��Ă����ƁA���肪���������B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i�������M���𓾂��Ă��邩���H";
		mes "�@����������`���Ă����悤���j";
		delquest 16649;
		setquest 16650;
		set EP19_1QUE,47;
		delitem '@delid,1;
		close2;
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 47:
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�c�c�����܂����̂��Ƃ�";
		mes "��`���Ă����̂Ȃ�";
		mes "�X�َq1��";
		mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM> 1��";
		mes "�����Ă��Ă����ƁA���肪���������B";
		next;
		set '@delid,1000846;
		if(countitem(1000846) < 1) {	// �X�َq
			// ������
			if(countitem(1000707) > 0) {	// ���K���̒ዉ���͊j
				mes "[�����P�A]";
				mes "����H";
				mes "���K���̒ዉ���͊j��";
				mes "�����Ă��Ă��ꂽ�́H";
				next;
				if(select("�n��","�n���Ȃ�") == 2) {
					mes "[�����P�A]";
					mes "�c�c�o�J�ɂ��Ă�́H";
					mes "���O�ƗV��ł���ɂ͖�������";
					mes "�����Ă�ł���B";
					close2;
					cutin "ep19_juncea01.png", 255;
					end;
				}
				set '@delid,1000707;
			}
			else {	// �ǂ���������ĂȂ�
				mes "[�����P�A]";
				mes "���́A���O�ƗV��ł���ɂ͖����́B";
				mes "�p�������Ȃ�A�o�čs���āB";
				next;
				cutin "ep19_juncea01.png", 255;
				mes "["+strcharinfo(0)+"]";
				mes "�i�Â����َq�Ȃ�A�X�̏�ɂ���";
				mes "�@�`�F����������Ⴆ��͂����j";
				next;
				mes "�]�X�̏�֌������܂����H�]";
				next;
				if(select("������","��߂�") == 2) {
					mes "�]���̏�ɂƂǂ܂����]";
					close;
				}
				mes "�]�X�̏�֌��������]";
				close2;
				warp "icas_in.gat", 251, 197;
				end;
			}
		}
		else {
			mes "[�����P�A]";
			mes "�����A�X�َq�������Ă��Ă��ꂽ�̂ˁB";
			mes "����A���ꂱ��B";
			mes "�ȂɂȂ�Â݂Ȃ̂�ˁc�c�B";
		}
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���肪�ƁB";
		mes "�����Ȃ�����������B";
		mes "����ɂ��Ă��A�悭���̂Ƃ����";
		mes "���Ă���邯�ǁc�c";
		mes "���̌��������C�ɓ������H";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����P�A�̂���Ă������";
		mes "�o�S�b�g�̎������C�ɂȂ�܂��B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�O�ɂ����������ǁA�����o�S�b�g��";
		mes "�����悤�Ȏ��������Ă�B";
		mes "�z����̃��K���ɖ��͂𒍓�����";
		mes "������������B";
		next;
		mes "[�����P�A]";
		mes "�ł��A�v���悤�ɐi��łȂ��B";
		mes "���������Ȃ��̂�B";
		mes "�����Ɏc����Ă��閂�͂�";
		mes "�������s������������B";
		mes "�o�S�b�g�����ċ�J���Ă�͂��B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�o�S�b�g�͎������������񂽂�����";
		mes "������Ă�ƕ�������B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���̌��������o�S�b�g�̕���";
		mes "�D�揇�ʂ��������Ęb�ł���H";
		mes "����U���Ă��鎑���ɂ��Ă�";
		mes "����Ȃɕς��Ȃ��͂��c�c�B";
		next;
		cutin "ep19_juncea01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "(�c�c����������";
		mes "�@��v����������Ă�ȁB";
		mes "�@�����P�A�Ɍ����Ă݂悤���j";
		delquest 16650;
		setquest 16651;
		set EP19_1QUE,48;
		delitem '@delid,1;
		close2;
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 48:
		mes "["+strcharinfo(0)+"]";
		mes "�����P�A�̖��O��������Ă����̂�";
		mes "�������Ȃ��Ď����Ă������ނ�";
		mes "����񂾂��ǁc�c�B";
		next;
		cutin "ep19_juncea02.png", 2;
		mes "[�����P�A]";
		mes "�ȂɁA����H";
		mes "�c�c��v����??";
		mes "�����A�������Ɏ��̖��O������ˁB";
		mes "�o�S�b�g������c�c���H";
		mes "�R�ł���c�c!?";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���蓾�Ȃ�!!";
		mes "�ǂ����āA�o�S�b�g�ɂ���";
		mes "���ꂾ���̎��ނ�n���Ă�́H";
		mes "�����ׂ̈̎��ނ��s�����Ă������";
		mes "���܂ŕ����Ă��̂�!!";
		next;
		mes "[�����P�A]";
		mes "�x����Ă����c�c�H";
		mes "����Ȃ��Ɓc�c�ǂ����āH";
		mes "������ɂ����ɗ���";
		mes "���K���Ƃ̊֌W��z�����̂�??";
		mes "���������K���h�̖��͂ɂ��Ă�";
		mes "�������ʂ�S�������Ă����̂�!?";
		next;
		mes "[�����P�A]";
		mes "����Ȃ̂��āc�c";
		mes "���蓾�Ȃ��c�c";
		mes "���蓾�Ȃ���!!";
		delquest 16651;
		setquest 16652;
		set EP19_1QUE,49;
		delitem 1000845,1;
		close2;
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		cutin "ep19_juncea01.png", 255;
		end;
	case 49:
		cloakoffnpc "�o�S�b�g#ep19re1";
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�����Ƃ��`�H";
		mes "�����P�A�����͉��𑛂��ł�`�H";
		mes "�܁`���������؂�܂��������H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�o�S�b�g�A���O�c�c�I";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "��`�`�H";
		mes "�����̂��O�́A�ŏ㋉�̃��K����";
		mes "�ꏏ�ɐ��܂ꂽ���K�����������H";
		next;
		mes "[�o�S�b�g]";
		mes "���̍ŏ㋉�͖ʔ�����˂��`�B";
		mes "�l��2��ڂ��炢����Ȃ��H";
		mes "���́`�͂͂́`�I";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "����Ȃ��Ƃ��I";
		mes "�m�F���������Ƃ�����񂾂��ǁI";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "�o�S�b�g�������P�A�ɗp��������";
		mes "���܂������`�B";
		mes "�o�S�b�g�̌������ɗ��Ă����H";
		mes "���A���ی��͂˂�����`�B";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i��l�̓o�S�b�g�̌�������";
		mes "�@�ړ�����悤���B";
		mes "�@����ɂ��Ă��c�c�o�S�b�g��";
		mes "�@�����������ڂ͕��ʂ���Ȃ������B";
		mes "�@�X�̏�ɖ߂��ă��C�W�[��";
		mes "�@�񍐂��������ǂ��������j";
		cloakonnpc "�o�S�b�g#ep19re1";
		delquest 16652;
		setquest 16653;
		set EP19_1QUE,50;
		next;
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 0, 1, ���C�W�[#ep19re2;	// 2680: 245, 197
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	case 50:
		cloakoffnpc "�o�S�b�g#ep19re1";
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "�o�S�b�g�������P�A�ɗp��������";
		mes "���܂������`�B";
		mes "�o�S�b�g�̌������ɗ��Ă����H";
		mes "���A���ی��͂˂�����`�B";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i��l�̓o�S�b�g�̌�������";
		mes "�@�ړ�����悤���B";
		mes "�@����ɂ��Ă��c�c�o�S�b�g��";
		mes "�@�����������ڂ͕��ʂ���Ȃ������B";
		mes "�@�X�̏�ɖ߂��ă��C�W�[��";
		mes "�@�񍐂��������ǂ��������j";
		cloakonnpc "�o�S�b�g#ep19re1";
		next;
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icas_in.gat", 251, 197;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,34,139,3	script	�o�S�b�g#ep19re1	10386,{/* 2676 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�m��Ȃ��l�ԁ`�H";
		mes "����Ȑl�Ԃ�����͂��Ȃ��̂ɂ��`�H";
		close2;
		cutin "ep18_bagot_01.png", 255;
		end;
	}
	cutin "ep18_bagot_01.png", 2;
	mes "[�o�S�b�g]";
	mes "�o�S�b�g�́`�q���ɂ́`";
	mes "��������܂����`��B";
	close2;
	cutin "ep18_bagot_01.png", 255;
	cloakonnpc;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,245,197,0	script	#hw_ep19re5	139,14,7,{/* 2677 */
	if(EP19_1QUE >= 44 && EP19_1QUE <= 47) {
		cloakonnpc "���C�W�[#ep19re2";
		cloakonnpc "�~���A��#ep19re1";
		cloakoffnpc "�`�F������#ep19re2";
		cloakoffnpc "�E�B������#ep19re1";
	}
	if(EP19_1QUE >= 50 && EP19_1QUE <= 52) {
		cloakonnpc "�`�F������#ep19re2";
		cloakonnpc "�E�B������#ep19re1";
		cloakoffnpc "���C�W�[#ep19re2";
		cloakoffnpc "�~���A��#ep19re1";
	}
	end;
}

icas_in.gat,245,197,7	script	�`�F������#ep19re2	10461,{/* 2678 (cloaking)*/
	if(EP19_1QUE == 44) {
		cutin "ep19_iwin01.png", 2;
		mes "[�`�F������]";
		mes "�ۂ�ۂ�A�V���N�V���N�I";
		mes "���`���������B";
		mes "�����L�`�����ĂȂ邯�ǔ��������I";
		next;
		mes "[�`�F������]";
		mes "����H�ׂĂ�̂����āH";
		mes "�X�َq!!";
		mes "�ЂƂ����悤���H";
		next;
		cutin "ep19_iwin01.png", 255;
		if(select("�ЂƂ��������I","��������") == 2) {
			cutin "ep19_iwin01.png", 2;
			mes "[�`�F������]";
			mes "���ɂ��݂���āH";
			mes "�������Ă���H";
			mes "���������Ȃ��Ȃ��B";
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		cutin "ep19_iwin01.png", 2;
		mes "[�`�F������]";
		mes "�����������A�[�E�B���p�e�B�V�G��";
		mes "�r�͑f���炵���I";
		mes "���������ɐH�ׂĂ݂Ăˁ`�B";
		next;
		cutin "ep19_iwin01.png", 255;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 16647;
		setquest 16648;
		set EP19_1QUE,45;
		getitem 1000846,1;
		mes "["+strcharinfo(0)+"]";
		mes "�i�Â����Ȃ��َq����ɓ��ꂽ�B";
		mes "�@�����P�A�Ɏ����čs���Ă����悤���j";
		next;
		//showevent 0, 1, �`�F������#ep19re2;	// 2678: 245, 197
		//showevent 0, 1, �����P�A#ep19re1;	// 2675: 31, 140
		mes "�]�����P�A�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����P�A�̂��Ƃ֌��������]";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	if(EP19_1QUE >= 45 && EP19_1QUE <= 47) {
		cutin "ep19_iwin01.png", 2;
		if(countitem(1000846) > 0) {
			mes "[�`�F������]";
			mes "�X�َq���~�����́H";
			mes "�܂��H�ׂĂȂ�����Ȃ��I";
			mes "���ꂪ�Ȃ��Ȃ��Ă��痈�Ă�ˁB";
			next;
			cutin "ep19_iwin01.png", 255;
		}
		else {
			mes "[�`�F������]";
			mes "�ۂ�ۂ�A�V���N�V���N�I";
			mes "���`���������B";
			mes "�����L�`�����ĂȂ邯�ǔ��������I";
			next;
			mes "[�`�F������]";
			mes "�X�َq���܂��H�ׂ����H";
			mes "�������Ȃ��ėǂ���H";
			next;
			cutin "ep19_iwin01.png", 255;
			if(select("�����Ɨ~�����Ƃ���","��������") == 2) {
				cutin "ep19_iwin01.png", 2;
				mes "[�`�F������]";
				mes "���ɂ��݂���āH";
				mes "�������Ă���H";
				mes "���������Ȃ��Ȃ��B";
				close2;
				cutin "ep19_iwin01.png", 255;
				end;
			}
			cutin "ep19_iwin01.png", 2;
			mes "[�`�F������]";
			mes "���������������B";
			mes "��؂ɐH�ׂĂ�ˁI";
			next;
			cutin "ep19_iwin01.png", 255;
			if(checkitemblank() == 0) {
				mes "^009eff�y�C���t�H���[�V�����z";
				mes "����ȏ㑽���̎�ނ�";
				mes "�ו��������Ƃ��o���܂���B";
				mes "1�ȏ�̋󂫂�����Ă��������B^000000";
				close2;
				cutin "ep172_beta.bmp", 255;
				end;
			}
			getitem 1000846,1;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�i���������Ղ�̂��َq���B";
		mes "�@�����P�A�ɐH�ׂ����Ă����悤�j";
		next;
		mes "�]�����P�A�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����P�A�̂��Ƃ֌��������]";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,248,197,3	script	�E�B������#ep19re1	10461,{/* 2679 (cloaking)*/
	cutin "ep19_iwin01.png", 2;
	mes "[�E�B������]";
	mes "���̕X�َq���ق����̂��H";
	mes "����Ȃ�`�F�������Ɍ����Ă���B";
	mes "���͂�����H���̂ɖZ�����񂾁B";
	close2;
	cutin "ep19_iwin01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,245,197,7	script	���C�W�[#ep19re2	10454,{/* 2680 (cloaking)*/
	if(EP19_1QUE == 50) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�d���̕��͂ǂ��A��肭�s���Ă�H";
		mes "�������̓o�S�b�g���������Ă�������B";
		mes "�����P�A�Ƃ̊֌W����";
		mes "�������Ȃ��Ƃ����Ȃ�����ˁB";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���������P�A�Ɛe�����Ȃ�܂����B";
		mes "�o�S�b�g�̕����ǂ��ҋ���";
		mes "�󂯂Ă��邱�Ƃ��`���Ă��܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��v����������܂�����";
		mes "�o�S�b�g�Ƃ̊i����";
		mes "�V���b�N���󂯂Ă���悤�ł����B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�ǂ��˂��I";
		mes "�����P�A�������瑤�Ɉ������߂��";
		mes "�����Ɨǂ��񂾂��c�c�B";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "��肭�����΁A���~���̐S���̌��Ђ�";
		mes "�ǂ��ɂ���̂�";
		mes "���𕷂��o���邩������܂���ˁB";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���������΁A�o�S�b�g������";
		mes "�b�����邩���";
		mes "�����P�A�������̎�������";
		mes "�A��čs���Ă��܂��܂����B";
		next;
		mes "�]���̎��̃o�S�b�g��";
		mes "�@�����������ڂ����ʂłȂ���������";
		mes "�@���C�W�[�ɓ`�����]";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�Ȃ񂾂��āc�c";
		mes "����͂Ȃ񂾂��C���ȗ\��������ȁB";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�����ɖ߂���";
		mes "�m�F���������ǂ��Ȃ��ł����H";
		delquest 16653;
		setquest 16654;
		set EP19_1QUE,51;
		close2;
		//showevent 9999, 0, ���C�W�[#ep19re2;	// 2680: 245, 197
		//showevent 0, 1, �~���A��#ep19re1;	// 2681: 249, 199
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP19_1QUE >= 51) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����A��ꂽ�B";
		mes "�����̂�т肵�����ˁB";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,249,199,3	script	�~���A��#ep19re1	10377,{/* 2681 (cloaking)*/
	if(EP19_1QUE == 50) {
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�����̕��͏����ł����H";
		mes "����������̂Ƃ����";
		mes "�傫�Ȗ��͋N���Ă��Ȃ���B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	if(EP19_1QUE == 51) {
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "��l�����ɂ���";
		mes "�ǂ������̂ł��傤���H";
		mes "�Ȃ񂾂��S�z�ł��B";
		mes "�C�ɂ������ł��傤���c�c�B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�ӂ���ŉ��̘b�������̂�����肾�B";
		mes "�o�S�b�g�������P�A�̂Ƃ����";
		mes "�킴�킴�����^�񂾂̂��������B";
		next;
		mes "[���C�W�[]";
		mes "������������A���Ɩ`���҂�";
		mes "���œ����Ă��邱�Ƃ�";
		mes "�o�����\��������B";
		mes "�����������Ă�ɂ͖����������B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����P�A�����K���̑�����A��o�����B";
		mes "�ޏ����������";
		mes "���K�������̏��𕷂��o���B";
		next;
		mes "[���C�W�[]";
		mes "�A��o����i�͉��ł��ǂ��B";
		mes "�����������Ă��ǂ���";
		mes "�͂Â��ł��ǂ��B";
		mes "�`���҂ɔC�����B";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�ϐg�X�N���[������肭";
		mes "�g����Ɨǂ��̂ł����c�c�B";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "���ꂶ�Ⴀ�A���K���̑��ɍs�����B";
		mes "����܂�̂�т肵�Ă��Ȃ����B";
		delquest 16654;
		setquest 16655;
		next;
		//showevent 9999, 0, ���C�W�[#ep19re2;	// 2680: 245, 197
		//showevent 0, 1, �~���A��#ep19re1;	// 2681: 249, 199
		cutin "ep19_leizi02.png", 255;
		mes "�]�����P�A�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����P�A�̂��Ƃ֌��������]";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	if(EP19_1QUE == 52) {
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�ϐg�X�N���[������肭�g����";
		mes "�����P�A�����A��o�����Ƃ�";
		mes "�ł���񂶂�Ȃ��ł��傤���H";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "�]�����P�A�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����P�A�̂��Ƃ֌��������]";
		close2;
		warp "jor_nest.gat", 33, 136;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,19,190,3	script	���m��ʔ�#ep19re1	10250,{/* 2682 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "["+strcharinfo(0)+"]";
		mes "�i����H";
		mes "�@�ϐg�X�N���[�����g��Ȃ��ƁI�j";
		close;
	}
	if(EP19_1QUE == 53) {
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c�N�����Ȃ��H";
		mes "�@�����P�A�͂܂��o�S�b�g�̕�������";
		mes "�@�߂��Ă��Ă��Ȃ��̂��H�j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i����c�c�H";
		mes "�@���̒�����t�̂��R��Ă���B";
		mes "�@���ݕ����낤���H�j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�C�ɂȂ邩��Ɏ����čs�����B";
		mes "�@�����e��͂Ȃ����낤���H";
		mes "�@�܂��𒲂ׂĂ݂悤�j";
		delquest 130475;
		setquest 16656;
		set EP19_1QUE,54;
		close2;
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 0, 1, ��̎�����#ep19re1;	// 2683: 20, 194
		cloakoffnpc "��̎�����#ep19re1";
		end;
	}
	if(EP19_1QUE == 54) {
		mes "["+strcharinfo(0)+"]";
		mes "�i����c�c�H";
		mes "�@���̒�����t�̂��R��Ă���B";
		mes "�@���ݕ����낤���H�j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�C�ɂȂ邩��Ɏ����čs�����j";
		mes "�@�����e��͂Ȃ����낤���H";
		mes "�@�܂��𒲂ׂĂ݂悤�j";
		close2;
		cloakoffnpc "��̎�����#ep19re1";
		end;
	}
	if(EP19_1QUE == 55) {
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 16657;
		setquest 16658;
		set EP19_1QUE,56;
		getitem 1000605,1;
		delitem 1000604,1;
		mes "�]�������t�̂������ǂɈڂ����]";
		next;
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 0, 1, ���K��#ep19re1;	// 2684: 24, 185
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c�N���̋C�z��������B";
		mes "�@�m��Ȃ��ӂ�����Č떂������)";
		close2;
		cloakoffnpc "���K��#ep19re1";
		unittalk getnpcid(0,"���K��#ep19re1"),"���K�� : ���O�ɓ`���������Ƃ�����I";
		end;
	}
	if(EP19_1QUE == 56) {
		cloakoffnpc "���K��#ep19re1";
		unittalk getnpcid(0,"���K��#ep19re1"),"���K�� : ���O�ɓ`���������Ƃ�����I";
		end;
	}
	if(EP19_1QUE == 57) {
		end;
	}
	mes "["+strcharinfo(0)+"]";
	mes "�i�����̔����u����Ă���j";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_nest.gat,20,194,3	script	��̎�����#ep19re1	10429,{/* 2683 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "["+strcharinfo(0)+"]";
		mes "�i����H";
		mes "�@�ϐg�X�N���[�����g��Ȃ��ƁI�j";
		close;
	}
	if(EP19_1QUE == 54) {
		mes "["+strcharinfo(0)+"]";
		mes "�i��̎����ǂ�����ł���B";
		mes "�@������g�킹�Ă��炨���j";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		delquest 16656;
		setquest 16657;
		set EP19_1QUE,55;
		getitem 1000604,1;
		mes "�]�Y��Ȏ����ǂ����ɓ��ꂽ�B";
		mes "�@����Ŕ��̒��̉t�̂�";
		mes "�@�����čs�����Ƃ��ł��邾�낤�]";
		close;
		//showevent 0, 1, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
	}
	if(EP19_1QUE == 55) {
		mes "�]�Y��Ȏ����ǂ����ɓ��ꂽ�B";
		mes "�@����Ŕ��̒��̉t�̂�";
		mes "�@�����čs�����Ƃ��ł��邾�낤�]";
		close;
	}
	mes "["+strcharinfo(0)+"]";
	mes "�i��̎����ǂ�����ł���j";
	close;
OnInit:
	cloakonnpc;
	end;
}
jor_nest.gat,24,185,1	script	���K��#ep19re1	10474,{/* 2684 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���K��]";
		mes "���҂��I";
		mes "�����ŉ������Ă���I";
		close;
	}
	if(EP19_1QUE == 56) {
		mes "["+strcharinfo(0)+"]";
		mes "���ɉ����p�ł����H";
		next;
		mes "[���K��]";
		mes "�N���Z�l�L�I�K���h����H";
		mes "�����P�A�Ƃ����l�Ԃ���̓`�����B";
		mes "�o�S�b�g�̌������ő҂��Ă��邩��";
		mes "�����ɗ��ė~�����Ƃ̂��Ƃ��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c�����P�A���H";
		mes "�@�ǂ����Ď��ɓ`�����H�j";
		next;
		mes "[���K��]";
		mes "�l�Ԃ̏��Ԏg���ɂ����̂�";
		mes "���������c�c";
		mes "���X�K���h�l���炠�̐l�Ԃ�����";
		mes "�v�]�������Ă��悤�ɂ�";
		mes "���B�������Ă��邩��ȁB";
		mes "�ق�A�����o�S�b�g�̌������ɍs���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c����ꂽ�ʂ�";
		mes "�@�o�S�b�g�̌������ɍs���Ă݂悤�j";
		delquest 16658;
		setquest 16659;
		set EP19_1QUE,57;
		close2;
		//showevent 0, 1, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		cloakonnpc "���K��#ep19re1";
		end;
	}
	if(EP19_1QUE == 57) {
		// ������
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,248,112,0	script	#i19ms00	139,5,5,{/* 2685 */
	switch(EP19_1QUE) {
	case 59:
		cloakoffnpc "�z����#i19ms00";
		cloakoffnpc "�����P�A#i19ms00";
		cloakoffnpc "���C�W�[#i19ms00";
		cloakoffnpc "���n�[��#i19ms00";
		cloakoffnpc "�~���A��#i19ms00";
		end;
	case 60:
		cloakoffnpc "�z����#i19ms00";
		cloakoffnpc "�����P�A#i19ms01";
		cloakoffnpc "���C�W�[#i19ms00";
		cloakoffnpc "���n�[��#i19ms00";
		cloakoffnpc "�~���A��#i19ms00";
		cloakoffnpc "���F���O���f#i19ms00";
		end;
	case 61:
		cloakoffnpc "�z����#i19ms00";
		cloakoffnpc "�����P�A#i19ms02";
		cloakoffnpc "���C�W�[#i19ms00";
		cloakoffnpc "���n�[��#i19ms00";
		cloakoffnpc "�~���A��#i19ms00";
		cloakoffnpc "���F���O���f#i19ms00";
		end;
	case 62: // ������
	case 63:
	case 64:
		cloakoffnpc "�z����#i19ms00";
		cloakoffnpc "�����P�A#i19ms02";
		cloakoffnpc "���C�W�[#i19ms00";
		cloakoffnpc "���n�[��#i19ms00";
		cloakoffnpc "�~���A��#i19ms00";
		cloakoffnpc "���F���O���f#i19ms00";
		cloakoffnpc "�I�[�����[#i19ms00";
		cloakoffnpc "�A�[�E�B��#i19ms00";
		end;
	default:
		cloakonnpc "�z����#i19ms00";
		cloakonnpc "���F���O���f#i19ms00";
		cloakonnpc "�����P�A#i19ms00";
		cloakonnpc "�����P�A#i19ms01";
		cloakonnpc "�����P�A#i19ms02";
		cloakonnpc "�I�[�����[#i19ms00";
		cloakonnpc "���C�W�[#i19ms00";
		cloakonnpc "���n�[��#i19ms00";
		cloakonnpc "�~���A��#i19ms00";
		cloakonnpc "�A�[�E�B��#i19ms00";
		end;
	}
}

icas_in.gat,247,116,1	script	�z����#i19ms00	10461,{/* 2686 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cloakoffnpc "�����P�A#i19ms00";
		cloakoffnpc "���C�W�[#i19ms00";
		cloakoffnpc "���n�[��#i19ms00";
		cloakoffnpc "�~���A��#i19ms00";
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "����Ȃ����K����A��ė����Ƃ�";
		mes "�v��Ȃ����c�c";
		mes "��̂ǂ��������Ƃ��������Ă���B";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "�܂����A�A��Ă����������";
		mes "�����P�A�Ȃ̂��H";
		mes "�ǂ����Ă���ȃ{���{���Ȃ񂾁H";
		mes "�Ȃ�Ń��K���̎p�ɂȂ��Ă�H";
		mes "�Ȃɂ��ǂ��Ȃ��Ă�??";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "���Â����܂�����";
		mes "�܂��͕ϐg���������Ă��������B";
		next;
		misceffect 594,"�����P�A#i19ms00";
		misceffect 273,"�����P�A#i19ms00";
		cutin "ep19_leizi03.png", 255;
		if(!sleep2(1000)) end;
		cloakonnpc "�����P�A#i19ms00";
		cloakoffnpc "�����P�A#i19ms01";
		if(!sleep2(1000)) end;
		cutin "ep18_miriam_01.png", 1;
		mes "[�~���A��]";
		mes "�g�̂Ɂc�c���c�c!?";
		next;
		unittalk getnpcid(0,"���n�[��#i19ms00"),"���n�[�� : ���Â��J�n���܂��B";
		if(!sleep2(1000)) end;
		misceffect 325,"�����P�A#i19ms01";
		if(!sleep2(500)) end;
		misceffect 66,"�����P�A#i19ms01";
		if(!sleep2(500)) end;
		misceffect 78,"�����P�A#i19ms01";
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "��́A�����������̂�";
		mes "�����������Ă���B";
		next;
		menu "�������̐������o�����悤�ł�",-;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "���Ԃ̖�肾�Ƃ͎v���Ă�������";
		mes "�v������葁�������ȁB";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[�~���A��]";
		mes "����ɂ��Ă��A�ǂ����Ĕޏ����H";
		mes "�ޏ����ז��҂�";
		mes "���Ȃ��ꂽ�Ƃ������ƁH";
		next;
		cutin "ep19_lehar05.png", 1;
		mes "[���n�[��]";
		mes "���̐g�́c�c�ǂ��Ȃ��Ă����ł��H";
		mes "�����ǂ�������";
		mes "����ȑ̂ɂȂ�̂��c�c�B";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���w���Ō���";
		mes "�u�U��̐_�v�Ɏ��Ă��܂��B";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[�~���A��]";
		mes "�c�c!!";
		mes "�o�S�b�g���A�ޏ��̐g�̂�";
		mes "���̂悤�ɂ����̂ł����I";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�Ƃɂ����A�����P�A�T�}����";
		mes "�������������b�𕷂��Ȃ��ƁB";
		mes "�����P�A�`�I�@�����P�A�T�}�`�I";
		next;
		cutin "ep19_leizi03.png", 255;
		mes "[�����P�A]";
		mes "�c�c�c�c�B";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "�c�c�����Ȃ��B";
		mes "���͂��Ă���悤�����B";
		mes "���̂܂܂���}�Y���Ȃ����H";
		mes "������͖����́H";
		next;
		cutin "ep19_iwin06.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����P�A�̎��������玝���o�������̂�";
		mes "���ɗ���������܂���B";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���ւ��c�c����ǂ߂�l����H";
		mes "���I�߂���";
		mes "���ɂ͂����ς肾�I";
		next;
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "���̖�܂́c�c";
		mes "�z��������A����ł݂܂��H";
		next;
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "����Ȗ�̂킩��Ȃ����̂�";
		mes "���߂邩�I";
		mes "�����Ɏg���\�[�X����Ȃ��񂾂��I";
		next;
		cutin "ep19_lehar02.png", 1;
		mes "[���n�[��]";
		mes "���F���O���f�f��l��";
		mes "�Ă�ł��܂��B";
		mes "�����������Ƃ����";
		mes "�������Ă����܂�����ˁI";
		next;
		cloakonnpc "���n�[��#i19ms00";
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "����ȏ�A�z��̑��ɐ�������";
		mes "���𓾂�͓̂�������B";
		next;
		mes "[���C�W�[]";
		mes "�����ȉ��̃��K���Ȃ�";
		mes "�ϐg���ď��𕷂��o���邩������";
		mes "���̐��x�������邾�낤�B";
		mes "�ǂ��ɂ������P�A���N������";
		mes "�b�𕷂��o�������Ƃ��낾�B";
		next;
		cloakoffnpc "���F���O���f#i19ms00";
		cloakoffnpc "���n�[��#i19ms00";
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�����K�v�����āH";
		mes "������������f��΁c�c�ق��c�c";
		mes "�C���V�I���ɂ����";
		mes "����ȑ̂ɂ���Ă��܂����ƁH";
		next;
		cutin "ep19_vellgunde01.png", 255;
		mes "�]���F���O���f�Ɏ���������";
		mes "�@���������玝���o�������̂�";
		mes "�@��n�����]";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "�ق��c���ށc�c�ӂށc�c";
		mes "�ǂ������ʂȖ��͂𒍓������";
		mes "�g�̂ɕω����N�����悤�ˁB";
		mes "�����Ƃ͌����A���ɖ߂���\����";
		mes "������Ă����B";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "���̖�܂��g����Ǝv���B";
		mes "����ɋC�t���Ď����ė���Ȃ��";
		mes "���蕿�ˁB";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "�����A�܂�����Ȃ����̂�����B";
		mes "^0000cd���K���̒ዉ���͊j^0000003��";
		mes "���B���Ă��ė~�����B";
		mes "���肢�ł���H";
		delquest 17640;
		setquest 17641;
		set EP19_1QUE,60;
		close2;
		//showevent 9999, 0, �z����#i19ms00;	// 2686: 247, 116
		//showevent 0, 1, ���F���O���f#i19ms00;	// 2687: 244, 117
		cutin "ep19_vellgunde02.png", 255;
		end;
	case 60:
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "^0000cd���K���̒ዉ���͊j^000000��";
		mes "3�K�v�炵���B";
		mes "�����s�������Ƃ��낾����";
		mes "���A�������󂯂��ɂ������Ȃ��B";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	case 61:
	case 62:
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�����̘b�𕷂�������Ȃ����B";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	case 63:
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���K���̑��œ������������炵���B";
		mes "�����s���Ă݂Ȃ���΁I";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	case 64:
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���܂�Ƃ̒���";
		mes "�W���W�����Ȃ��ł����H";
		close2;
		cutin "ep19_iwin06.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,244,117,1	script	���F���O���f#i19ms00	10468,{/* 2687 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		mes "[���F���O���f]";
		mes "�������������A�����Ă����H";
		close;
	case 60:
		cutin "ep19_vellgunde02.png", 2;
		cloakonnpc "�����P�A#i19ms00";
		cloakoffnpc "�����P�A#i19ms01";
		cloakoffnpc "���C�W�[#i19ms00";
		cloakoffnpc "���n�[��#i19ms00";
		cloakoffnpc "�~���A��#i19ms00";
		cloakoffnpc "���F���O���f#i19ms00";
		if(countitem(1000707) < 3) {
			//showevent 0, 2, ���F���O���f#i19ms00;	// 2687: 244, 117
			mes "[���F���O���f]";
			mes "^0000cd���K���̒ዉ���͊j^0000003��";
			mes "���B���Ă��ė~�����B";
			mes "�W�߂���A�����Ɏ����Ă��āB";
			close2;
			cutin "ep19_vellgunde02.png", 255;
			end;
		}
		//showevent 0, 1, ���F���O���f#i19ms00;	// 2687: 244, 117
		mes "[���F���O���f]";
		mes "�W�߂ė��Ă��ꂽ�̂ˁB";
		mes "�����A��͎��ɔC���āB";
		mes "�����ɒ������邩��B";
		next;
		misceffect 882,"�����P�A#i19ms01";
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�c�c�����A�ł�����B";
		mes "������g����";
		mes "�ޏ������ɖ߂���͂��B";
		mes "�����Ă݂܂��傤�B";
		next;
		cutin "ep19_vellgunde02.png", 255;
		mes "[�����P�A]";
		mes "�c�c���c�c�����c�c�B";
		next;
		misceffect 887,"�����P�A#i19ms01";
		cutin "ep19_vellgunde01.png", 255;
		unittalk getnpcid(0,"�����P�A#i19ms01"),"�����P�A : �����c�c�c�c";
		unittalk getnpcid(0,"�z����#i19ms00"),"�z���� : ���̎p�ɖ߂��čs���I";
		unittalk getnpcid(0,"���C�W�[#i19ms00"),"���C�W�[ : �������I�@���ゾ�ȁB";
		unittalk getnpcid(0,"���n�[��#i19ms00"),"���n�[�� : �Ȋw�҂ł����Ă΁B";
		if(!sleep2(1500)) end;
		misceffect 887,"�����P�A#i19ms01";
		misceffect 273,"�����P�A#i19ms01";
		if(!sleep2(1000)) end;
		cloakonnpc "�����P�A#i19ms01";
		cloakoffnpc "�����P�A#i19ms02";
		cutin "ep19_juncea04.png", 0;
		mes "[�����P�A]";
		mes "���c�c���́c�c";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�c�c�C���t�����݂����ˁB";
		mes "���v�H";
		mes "�����̂��ƁA�킩��H";
		next;
		cutin "ep19_vellgunde01.png", 255;
		misceffect 563,"�����P�A#i19ms02";
		mes "[�����P�A]";
		mes "<FONT SIZE = 18><B><I>�o�S�b�g�H�H!!</I></B></FONT>";
		next;
		misceffect 563,"�����P�A#i19ms02";
		mes "[�����P�A]";
		mes "�������A���̐g�̂���!!";
		mes "�����̑ΏۂɎg����!!!";
		mes "�����́A�ǂ���!!!";
		mes "�͂��c�͂��c�c��!!";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "���������āB";
		mes "�����̓��K�������̑�����Ȃ���B";
		next;
		cutin "ep19_juncea02.png", 0;
		mes "[�����P�A]";
		mes "�c�c�H";
		mes "���K���̑�����c�Ȃ��H";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�����͕X�̏邾�I";
		mes strcharinfo(0)+"��";
		mes "���O�����K���̑�����^��ŗ����B";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�����A����������";
		mes "���̎p�ŉ�̂͏��߂Ă������ȁI";
		mes "���́A�X�x�O�K���h����I";
		next;
		menu "���́c�Z�l�L�I�K���h�B",-;
		cutin "ep19_juncea02.png", 0;
		mes "[�����P�A]";
		mes "����ȁc�c";
		mes "���̃��K���́A�l�Ԃ������́H";
		mes "�ǂ�����āA����ȁc�c�H";
		mes "���͔g�����̂̍\����";
		mes "�m���Ƀ��K���������͂��Ȃ̂ɁI";
		next;
		cutin "ep19_juncea02.png", 0;
		mes "[�����P�A]";
		mes "�c�c�����ǂ��������!?";
		mes "���̂��߂Ɏ���A��o������!!";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���B�́A���K���̑��ɍU�ߓ��邽�߂�";
		mes "�������ď���T���Ă��񂾁B";
		next;
		mes "[���C�W�[]";
		mes "�����ŁA����񋟂��Ă��ꂻ����";
		mes "�l�Ԃ���������";
		mes "���낢��A�v���[�`���|�����킯�B";
		mes "�ق�A���񂽂ƃo�S�b�g��";
		mes "����������������H";
		next;
		mes "[���C�W�[]";
		mes "��J���ĘA��o�����񂾂���";
		mes "���낢�닳���Ă��炢�����Ȃ��H";
		next;
		cutin "ep19_juncea04.png", 0;
		mes "[�����P�A]";
		mes "�c�c��������𕷂��o�������Ă��ƁH";
		mes "���̓C���V�I����B";
		mes "����Ȃ��Ƃ���킯�c�c�����c�c�B";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�ψق����̂����Â����΂���Ȃ񂾂���";
		mes "������������_����B";
		mes "����ɁA���̐g�̂ɖ߂ꂽ�̂�";
		mes "�^���ǂ����������B";
		next;
		mes "[���F���O���f]";
		mes strcharinfo(0)+"��";
		mes "�K�v�Ȃ��̂��W�߂ĂȂ����";
		mes "�M���̐g�̂͌��ɖ߂��Ă��Ȃ��B";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���񂽂̖��̉��l�Ƃ����킯�B";
		mes "�o�S�b�g�Ȃ񂩂���";
		mes "����ۂǂ܂Ƃ��ȑҋ�����H";
		mes "�Â����َq�����ėp�ӂł���B";
		unittalk getnpcid(0,"�����P�A#i19ms02"),"�����P�A : �c�c";
		next;
		mes "[���C�W�[]";
		mes "�����܂ł́A���肢���B";
		mes "�f���ɋ��͂��Ă����Ȃ�";
		mes "���ޗʂ̗]�n������B";
		mes "�����A�������͂��Ă���Ȃ��ꍇ��";
		mes "�ǂ��Ȃ�Ǝv���H";
		unittalk getnpcid(0,"�����P�A#i19ms02"),"�����P�A : �c�c�c";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "�����Ă������A�C���V�I����";
		mes "���[���~�b�h�K�b�c�����B";
		mes "�V���o���c�o���h���a���B";
		mes "�A���i�x���c�����̎O������";
		mes "�w����z�����B������͂Ȃ����B";
		unittalk getnpcid(0,"�����P�A#i19ms02"),"�����P�A : �c�c�c�c";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "���K���̑��ɖ߂邩�H";
		mes "�o�S�b�g�����𗘂�����";
		mes "���K���̑��ɁH";
		mes "���܂�I�X�X���͂��Ȃ��ȁB";
		next;
		cutin "ep19_juncea02.png", 0;
		mes "[�����P�A]";
		mes "�c�c�c�c�B";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "�����̐g�̂ɉ����N�����̂�";
		mes "�C�ɂȂ�Ȃ��H";
		mes "���Ȃ�������Ă�������B";
		mes "�������A���B�ɋ��͂��Ă���邱�Ƃ�";
		mes "�O�񂾂��ǁB";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "�c�c�����l�������āB";
		delquest 17641;
		setquest 17642;
		set EP19_1QUE,61;
		delitem 1000707,3;
		close2;
		//showevent 9999, 0, �z����#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ���F���O���f#i19ms00;	// 2687: 244, 117
		//showevent 0, 1, ���C�W�[#i19ms00;	// 2688: 246, 119
		//showevent 0, 1, #in_house5;	// 2494: 62, 137
		cutin "ep19_juncea03.png", 255;
		end;
	case 61:
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�ޏ�������ł���Ηǂ��̂����ǁB";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	case 62:
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "���͂������������P�A�̗l�q��";
		mes "���邱�Ƃɂ����B";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�����ƕK�v�Ȃ��̂�";
		mes "�����Ă���Ηǂ������ȁB";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,246,119,3	script	���C�W�[#i19ms00	10454,{/* 2688 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "�������������������񂾁H";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	case 60:
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes strcharinfo(0)+"�Ȃ�";
		mes "�ዉ���͊j3���炢";
		mes "�����ɏW�߂����ȁH";
		mes "���͊��̒��ɓ����Ă���񂶂�Ȃ��H";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	case 61:
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "��Ă��󂯓����C�ɂȂ����H";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "�c�c�킩�����B";
		mes "��Ă��󂯓����B";
		mes "���̑���A���̐g�̈��S��";
		mes "�ۏ؂��Ă����̂��O��B";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�������B";
		mes "���̓V���o���c�o���h���{����";
		mes "�S����C����Ă邩��ˁB";
		mes "���̍��̑�g�������Ă邩��";
		mes "�M�p���Ă���B";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "�c�c���K���ɉ�����";
		mes "�����x���Ă��������ɁB";
		mes "�ł��A���ɕ��@���������c�c";
		mes "�͂��c�c����ŉ���m�肽���H";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�܂��̓��������K���h���c��";
		mes "���͂�m�肽���B";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "���K���Ƃ����푰��";
		mes "���K���̌��Ǝ��Ԃ��������";
		mes "���K���𐶂ݏo�����Ƃ��ł���B";
		mes "�������A�z������ɂ�";
		mes "���������K���h�̖��͂��K�v�B";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "���K�������̓��������K���h�̑̂�";
		mes "���_�Ƃ��āA�̂Ɏc�������͂�";
		mes "���p���Ă����B";
		mes "���[�Ƃ͂����A���̎c�����͂�";
		mes "�����Ȃ��̂������݂����B";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "�ł��A���ł͂��̖��͂��͊���";
		mes "�V�������K�������܂�Ȃ��󋵂�B";
		next;
		menu "��͂͂ǂ��ł����H",-;
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "�㋉�ȏ�̃��K����";
		mes "���͂��L�x���������ɐ��܂ꂽ����";
		mes "���ꂼ�ꂪ���Ȃ苭���B";
		mes "�����A���͂���قǑ����Ȃ��B";
		mes "���Ȃ̂́A���X�K���h�B";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "�_�b�̎��ォ�琶���Ă���";
		mes "���̌��ōŏ㋉�̃��K��������";
		mes "���ݏo�����炵���B";
		mes "�ڂ����͒��ׂ��ĂȂ�����";
		mes "���܂������͂��h���Ă���B";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "���X�K���h�c�c";
		mes "�ŌÂ̐����ҁc�c";
		mes "^0000cd���ƂɎ􂢂����������{�l^000000�c�c";
		mes "�z�̖ړI�͉��H";
		mes "�C���V�I���Ǝ�����񂾖ړI�́H";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "�ŏ��Ƀ��K���ƐڐG��������";
		mes "�����������Ă������͂𗯂߂���@��";
		mes "���͂𑝕���������@��";
		mes "�����������Ă����B";
		mes "���炭�A���K���̐��𑝂₷�̂�";
		mes "�ړI�������Ǝv���B";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "�����A�r���Ńo�S�b�g�̌�����";
		mes "�ŗD��ɂ���悤�ɕ����]�������B";
		mes "�o�S�b�g�́A�����Ă����񂾁H";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "�c�c���������K���h�̕����B";
		unittalk getnpcid(0,"���C�W�[#i19ms00"),"���C�W�[ : �c�c�c";
		unittalk getnpcid(0,"���n�[��#i19ms00"),"���n�[�� : ������Ė{���ł���!?";
		unittalk getnpcid(0,"���F���O���f#i19ms00"),"���F���O���f : ��͂肩�c�c";
		unittalk getnpcid(0,"�z����#i19ms00"),"�z���� : �c�c!?!?";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "�D���ė������~���̐S���̌��ЂƎg����";
		mes "���������K���h�𕜊�������B";
		mes "���邢�́c�c";
		mes "^0000cd���������K���h�̐_�i�̍Č�^000000�B";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "���w���Ő_�̐_�����Č��ł�����";
		mes "�����Ă�������";
		mes "�A�C�c�̌����͊����ɋ߂Â��Ă���B";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "���������K���h�̕����c�c";
		mes "�z�����������Ȃ��ȁB";
		next;
		cutin "ep18_miriam_01.png", 1;
		mes "[�~���A��]";
		mes "���X�K���h�͂Ƃ�����";
		mes "�o�S�b�g�̖ړI�́H";
		mes "���̐l�̓��������K���h�𕜊�������";
		mes "�����������H";
		next;
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "�A�C�c�́A�����̋����̂��邱�Ƃ�";
		mes "�������邱�Ƃ������ړI�B";
		mes "�����A�����̂�肽���悤�ɂ��B";
		mes "���ꂪ�ł��������ɓ����";
		mes "�Ȃ�ł��ǂ��Ǝv���Ă�B";
		next;
		cutin "ep19_leizi02.png", 1;
		mes "[���C�W�[]";
		mes "�o�S�b�g��������悤�Ƃ�������";
		mes "�ł��Ȃ������̂�";
		mes "�����������R���c�c";
		mes "���āA�}���ő΍���������āc�c�B";
		next;
		cloakoffnpc "�I�[�����[#i19ms00";
		cloakoffnpc "�A�[�E�B��#i19ms00";
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "�݂�ȁA�����ɂ����̂ˁB";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�I�[�����[�l�H";
		mes "�����������̂ł����H";
		delquest 17642;
		setquest 17643;
		set EP19_1QUE,62;
		close2;
		//showevent 9999, 0, �z����#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ���F���O���f#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, ���C�W�[#i19ms00;	// 2688: 246, 119
		//showevent 0, 1, �I�[�����[#i19ms00;	// 2693: 249, 113
		cutin "ep19_vellgunde01.png", 255;
		end;
	case 62:
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�C���V�I���̉Ȋw�҂�����";
		mes "�݂�Ȏ��Ă�C������B";
		mes "�G�����~�i�Ƃ����B";
		mes "�����ɉ����Ă���ď�����B";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���K���ϐg�X�N���[�����g����";
		mes "�����[�̃��K�����x����������Ȃ��H";
		mes "��肢���Ǝg���čs�������I";
		close2;
		cutin "ep19_leizi03.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,246,119,3	script	���C�W�[#i19ms01	10475,{/* 2689 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,243,120,5	script	�����P�A#i19ms00	10470,{/* 2690 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,243,120,3	script	�����P�A#i19ms01	10457,{/* 2691 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,243,120,5	script	�����P�A#i19ms02	10455,{/* 2692 (cloaking)*/
	switch(EP19_1QUE) {
	case 60:
	case 64:
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "���͉����ł����Ԃ���Ȃ��B";
		mes "���΂炭�x�܂��āB";
		close2;
		cutin "ep19_juncea03.png", 255;
		end;
	case 61:
		cutin "ep19_juncea03.png", 0;
		mes "[�����P�A]";
		mes "�c�c�l����������B";
		close2;
		cutin "ep19_juncea04.png", 255;
		end;
	case 62:
		cutin "ep19_juncea04.png", 0;
		mes "[�����P�A]";
		mes "�c�c������Ɛl���������Ȃ��H";
		mes "�Ȃ�ł���Ȃɐl���W�܂��Ă���́B";
		close2;
		cutin "ep19_juncea04.png", 255;
		end;
	case 63:
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "���K���̑��ɍs���Ȃ�";
		mes "�ϐg���������ǂ��B";
		mes "�����ȉ��̃��K���ɂ̓o���Ȃ��͂��B";
		close2;
		cutin "ep19_juncea01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,249,113,3	script	�I�[�����[#i19ms00	10465,{/* 2693 (cloaking)*/
	switch(EP19_1QUE) {
	case 62:
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "���K�������̓���������������";
		mes "�p�g���[��������A������������B";
		mes "�O�ɏo�Ă����㋉���K��������";
		mes "���ɌĂі߂���Ă���݂����B";
		next;
		cutin "ep19_iwin02.png", 2;
		mes "[�A�[�E�B��]";
		mes "���܂�ɋ}�Ȃ��Ƃ�����";
		mes "���K���������������Ă���";
		mes "���̒����Q���������l�q�ł��B";
		next;
		cutin "ep19_leizi03.png", 1;
		mes "[���C�W�[]";
		mes "�������N���悤�Ƃ��Ă�݂������ȁB";
		mes "�������Ă���̂Ȃ�";
		mes "�U�ߍ��ރ`�����X��������Ȃ��B";
		next;
		cutin "ep19_iwin08.png", 2;
		mes "[�z����]";
		mes "�悵�I";
		mes "�}���Ő�͂ƂȂ�҂����W���悤�I";
		next;
		cutin "ep19_juncea01.png", 0;
		mes "[�����P�A]";
		mes "���K���̑��ɍs���Ȃ�";
		mes "�ϐg���������ǂ��B";
		mes "�����ȉ��̃��K���ɂ̓o���Ȃ��͂��B";
		next;
		delquest 17643;
		setquest 17644;
		set EP19_1QUE,63;
		cutin "ep19_juncea04.png", 255;
		mes "�]���K�������̏Z���֌������܂����H�]";
		next;
		//showevent 9999, 0, �z����#i19ms00;	// 2686: 247, 116
		//showevent 9999, 0, ���F���O���f#i19ms00;	// 2687: 244, 117
		//showevent 9999, 0, ���C�W�[#i19ms00;	// 2688: 246, 119
		//showevent 0, 1, �I�[�����[#i19ms00;	// 2693: 249, 113
		//showevent 0, 1, #in_house5;	// 2494: 62, 137
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���K�������̏Z���֌��������]";
		close2;
		warp "jor_que.gat", 281, 87;
		end;
	case 63:
	case 64:
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "���K�������̓���������������";
		mes "�p�g���[��������A������������B";
		mes "�O�ɏo�Ă����㋉���K��������";
		mes "���ɌĂі߂���Ă���݂����B";
		next;
		cutin "ep19_aurelie03.png", 255;
		mes "�]���K�������̏Z���֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���K�������̏Z���֌��������]";
		close2;
		warp "jor_que.gat", 281, 87;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,248,118,3	script	���n�[��#i19ms00	10469,{/* 2694 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "�������z��������̉Ƃ����B";
		mes "���A����ȗI���Ȃ��Ƃ������Ă�ꍇ����";
		mes "�Ȃ��ł���ˁI";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 60:
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "�n���Ă���������ނł���";
		mes "���������߂���";
		mes "�ǂ߂܂���ł�����c�c�B";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 61:
	case 62:
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "���΂̓��F���O���f�f��l�I";
		mes "�N�G���Ⴂ�܂��ˁI";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "�������z��������̉Ƃ����B";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,245,115,1	script	�~���A��#i19ms00	10377,{/* 2695 (cloaking)*/
	switch(EP19_1QUE) {
	case 59:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "����́A�C���V�I���̃����o�[�H";
		mes "�ǂ��������Ƃ��������ė~�����ł��B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 60:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�ዉ���͊j�c�c";
		mes "�u�֐_�̉�����v�Ō������Ƃ���܂��B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 61:
	case 62:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�o�S�b�g��߂܂����";
		mes "���~���̐S���̌��Ђ�";
		mes "���߂���ł��傤���H";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	case 63:
	case 64:
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�l�̏Z�ޏꏊ�Ƃ����̂�";
		mes "�݂�Ȃǂ������Ă��܂��ˁB";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icas_in.gat,247,113,1	script	�A�[�E�B��#i19ms00	10461,{/* 2696 (cloaking)*/
	if(EP19_1QUE == 62) {
		cutin "ep19_iwin02.png", 2;
		mes "[�A�[�E�B��]";
		mes "���K���̑��̕���";
		mes "�����ٕς��N�����悤�ł��I";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	}
	cutin "ep19_iwin02.png", 2;
	mes "[�A�[�E�B��]";
	mes "��͂ƂȂ�҂����W������";
	mes "���K���̑��ɓ˓����܂��I";
	close2;
	cutin "ep19_iwin02.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,281,87,0	script	#i19ms11	139,5,5,{/* 2697 */
	if(EP19_1QUE == 63) {
		//showevent 0, 1, �A�[�E�B����@#i19ms11;	// 2698: 271, 88
		cloakoffnpc "�z����#i19ms11";
		cloakoffnpc "�~���A��#i19ms11";
		cloakoffnpc "���n�[��#i19ms11";
		cloakoffnpc "���C�W�[#i19ms11";
		cloakoffnpc "�A�[�E�B����@#i19ms12";
		cloakoffnpc "�A�[�E�B����@#i19ms13";
		cloakoffnpc "�A�[�E�B����@#i19ms14";
		end;
	}
	end;
}

jor_que.gat,271,88,5	script	�A�[�E�B����@#i19ms11	21529,{/* 2698 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�A�[�E�B����@]";
		mes "���K���ɕϐg���Ă���";
		mes "�����ł���܂��I";
		close;
	}
	if(EP19_1QUE == 63) {
		cloakoffnpc "�z����#i19ms11";
		cloakoffnpc "�~���A��#i19ms11";
		cloakoffnpc "���n�[��#i19ms11";
		cloakoffnpc "���C�W�[#i19ms11";
		cloakoffnpc "�A�[�E�B����@#i19ms12";
		cloakoffnpc "�A�[�E�B����@#i19ms13";
		cloakoffnpc "�A�[�E�B����@#i19ms14";
		mes "[�A�[�E�B����@]";
		mes "���҂����Ă���܂����I";
		next;
		mes "[�z����]";
		mes "�󋵂́H";
		next;
		mes "[�A�[�E�B����@]";
		mes "�㋉�ȏ�̃��K����";
		mes "�S���ǂ����Ɉړ����܂����I";
		mes "���̕ӂ�ɂ͒����ȉ��̃��K���݂̂�";
		mes "�c���Ă���܂��I";
		next;
		mes "[�A�[�E�B����@]";
		mes "����Ȃ��Ƃ͂���܂�";
		mes "��x�����������悤��";
		mes "�����ȉ��̃��K���͍������Ă���";
		mes "���̒��͍Q���������󋵂ł��B";
		next;
		cloakoffnpc "�A�[�E�B����@#i19ms15";
		cloakoffnpc "�l��#i19ms91";
		cloakoffnpc "�l��#i19ms92";
		cloakoffnpc "�l��#i19ms93";
		mes "[�E�o���悤�Ƃ���l��]";
		mes "�����I�@�������Ă΁I";
		mes "�����o�����Ƃ��Ă��񂶂�Ȃ���";
		mes "�g�C���I";
		mes "�g�C���ɍs�����Ƃ��Ă��́I";
		next;
		mes "[�z����]";
		mes "���̐l�����͉����H";
		next;
		mes "[�A�[�E�B����@]";
		mes "�߂炦���Ă����l�Ԃ����ł��I";
		mes "���K���������������Ă���";
		mes "���̂܂܂ł͊댯���Ɣ��f����";
		mes "�A��o���ė��܂����I";
		next;
		mes "[�E�o���悤�Ƃ���l��]";
		mes "���A�����Ă����̂��H";
		mes "���ɂ��߂܂��Ă��钇�Ԃ�����񂾁I";
		mes "������������Ă���Ă���I";
		next;
		mes "[�z����]";
		mes "���̐l�Ԃ����͊O�ɗU������B";
		unittalk getnpcid(0,"�A�[�E�B����@#i19ms15"),"�A�[�E�B����@ : �͂��I�@�����ł���܂��I";
		unittalk getnpcid(0,"�l��#i19ms91"),"�l�� : ���A������̂��H";
		next;
		mes "[�z����]";
		mes "�܂��c���Ă���l�Ԃ�����悤������";
		mes "���̉��ɐi�ޑO�ɋ~�o���悤�I";
		cloakonnpc "�A�[�E�B����@#i19ms15";
		cloakonnpc "�l��#i19ms91";
		cloakonnpc "�l��#i19ms92";
		cloakonnpc "�l��#i19ms93";
		next;
		mes "[���n�[��]";
		mes "���������ȑO�ɘA��Ă������";
		mes "�d����������ꂽ�ꏊ�ɍs���܂��傤�B";
		mes "�����ɑ��̐l������";
		mes "�c���Ă邩������܂���B";
		next;
		mes "[�z����]";
		mes "�悵�I";
		mes "��l�͂����Ɏc���Ă���B";
		mes "���̎҂͉��ɐi�ނ��B";
		mes "���͂̌x����ӂ�Ȃ�B";
		unittalk getnpcid(0,"�A�[�E�B����@#i19ms11"),"�A�[�E�B�� : �͂��I";
		unittalk getnpcid(0,"�A�[�E�B����@#i19ms12"),"�A�[�E�B�� : �͂��I";
		unittalk getnpcid(0,"�A�[�E�B����@#i19ms13"),"�A�[�E�B�� : �͂��I";
		unittalk getnpcid(0,"�A�[�E�B����@#i19ms14"),"�A�[�E�B�� : �����I";
		next;
		cloakonnpc "�z����#i19ms11";
		cloakonnpc "�A�[�E�B����@#i19ms12";
		cloakonnpc "�A�[�E�B����@#i19ms13";
		cloakonnpc "�A�[�E�B����@#i19ms14";
		delquest 17644;
		setquest 17645;
		set EP19_1QUE,64;
		close2;
		//showevent 9999, 0, �A�[�E�B����@#i19ms11;	// 2698: 271, 88
		//showevent 0, 1, �~���A��#i19ms12;	// 2711: 144, 253
		//showevent 9999, 0, �������K��#i19ms21;	// 2718: 131, 148
		//showevent 9999, 0, ���n�[��#i19ms21;	// 2724: 32, 37
		//showevent 9999, 0, �����̎ւ̑�#i19ms21;	// 2725: 28, 33
		cloakonnpc "�~���A��#i19ms11";
		cloakonnpc "���n�[��#i19ms11";
		cloakonnpc "���C�W�[#i19ms11";
		end;
	}
	if(EP19_1QUE == 64) {
		mes "[�A�[�E�B����@]";
		mes "�󋵂𒲂ׂ�K�v������悤�ł��I";
		close;
	}
	//67�ȑO�A������
	mes "[�A�[�E�B����@]";
	mes "���܂ŁA����Ȏ��͂���܂���ł����B";
	mes "�������������N���Ă���̂ł��傤�H";
	close;
}

jor_que.gat,273,85,1	script	�z����#i19ms11	21529,{/* 2699 (cloaking)*/
	unittalk "�z���� : �܂��͏󋵂̊m�F���B";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,273,89,3	script	�~���A��#i19ms11	21529,{/* 2700 (cloaking)*/
	unittalk "�~���A�� : �����̃��K���������c����Ă���悤�ł��B";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,274,86,1	script	���n�[��#i19ms11	21529,{/* 2701 (cloaking)*/
	unittalk "���n�[�� : ���̏ꏊ�́A���܂��Ɋ���܂���B";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,270,86,7	script	���C�W�[#i19ms11	10475,{/* 2702 (cloaking)*/
	unittalk "���C�W�[ : ���������������Ă����H�@�Ԃ����Ȃ񂾂���B";
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,270,83,7	script	�l��#i19ms91	478,{/* 2703 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,269,83,7	script	�l��#i19ms92	908,{/* 2704 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,268,84,7	script	�l��#i19ms93	879,{/* 2705 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,268,87,5	script	�A�[�E�B����@#i19ms12	21529,{/* 2706 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,276,90,3	script	�A�[�E�B����@#i19ms13	21529,{/* 2707 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,277,86,1	script	�A�[�E�B����@#i19ms14	21529,{/* 2708 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,271,84,7	script	�A�[�E�B����@#i19ms15	21529,{/* 2709 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,144,253,0	script	#i19ms21	139,5,5,{/* 2710 */
	if(EP19_1QUE == 64) {
		cloakoffnpc "���C�W�[#i19ms12";
		cloakoffnpc "�~���A��#i19ms12";
		cloakoffnpc "�l��#i19ms94";
		cloakoffnpc "�l��#i19ms95";
		cloakoffnpc "�l��#i19ms96";
		end;
	}
}

jor_que.gat,144,253,3	script	�~���A��#i19ms12	21529,{/* 2711 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�~���A��]";
		mes "�����ł̓��K���ɕϐg����";
		mes "�����������ǂ���B";
		close;
	}
	if(EP19_1QUE == 64) {
		mes "[�~���A��]";
		mes "�������������Ă���";
		mes "�㋉���K������������Ȃ��B";
		mes "���ɂ͝f�v����Ă����l����������";
		mes "�c���Ă����Ԃł��B";
		next;
		cloakoffnpc "���n�[��#i19ms12";
		mes "[���n�[��]";
		mes "���̕����������ł����B";
		mes "���̐l�������c���Ă����Ȃ��";
		mes "��قǗ]�T���Ȃ������̂ł��傤���H";
		next;
		mes "[���C�W�[]";
		mes "������Ƃ��Ă͍D�s�����B";
		mes "���`���A�݂Ȃ���I";
		mes "�O�ɏo�Ă������`���I";
		mes "�������d�������Ȃ��Ă�";
		mes "�ǂ��ł���`�B";
		next;
		emotion 53,"�l��#i19ms94";
		mes "[�J�𒆂̐l��]";
		mes "������I�@�勳�l���I";
		mes "��A���B�͑�l����������";
		mes "�d�������Ă��������ł��I";
		next;
		mes "[���n�[��]";
		mes "���B�͊F����������ɗ�����ł��B";
		mes "�F����Ɋ�Q���������肵�Ȃ��̂�";
		mes "���S���Ă��������B";
		misceffect 594,"���n�[��#i19ms12";
		cloakonnpc "���n�[��#i19ms12";
		cloakoffnpc "���n�[��#i19ms13";
		next;
		mes "[�J�𒆂̐l��]";
		mes "����H�@�l�Ԃ�!?";
		mes "�{���ɏ����Ă�����!?";
		next;
		mes "[�~���A��]";
		mes "�{�N�����̐l������";
		mes "�o���܂ŘA��čs����B";
		next;
		mes "[���C�W�[]";
		mes "���A�����܂�����ˁH";
		mes "���̐l�ɕt���čs���Α��v�B";
		mes "�Ƃ���ŁA�����ɂ������K��������";
		mes "�ǂ��ɍs�������m���Ă�H";
		next;
		mes "[�J�𒆂̐l��]";
		mes "�킩��܂���B";
		mes "�}�ɑ��������Ȃ����Ǝv������";
		mes "�ǂ����ɍs���Ă��܂�����ł��B";
		next;
		mes "[�J�𒆂̐l��]";
		mes "���߂邩�킩��Ȃ������̂�";
		mes "�����Ƃ����ɗ��܂��Ă邵��";
		mes "�Ȃ�������ł��B";
		next;
		mes "[���C�W�[]";
		mes "�ӂ��`��B";
		mes "�㋉�ȏ�̃��K��������";
		mes "�������C�ɂȂ�ȁB";
		mes "�����������̕ӂ��";
		mes "���ׂĂ݂�K�v�����肻�������B";
		next;
		mes "[�~���A��]";
		mes strcharinfo(0)+"�l��";
		mes "���̏ꏊ�𒲂ׂĂ݂āB";
		mes "�{�N�͂��̐l����������Ă���";
		mes "�������邩��B";
		mes "�����A�s���܂��傤�B";
		delquest 17645;
		setquest 17646;
		set EP19_1QUE,65;
		close;
		//showevent 9999, 0, "�A�[�E�B����@#i19ms11";	// 2698: 271, 88
		//showevent 9999, 0, "�~���A��#i19ms12";	// 2711: 144, 253
		//showevent 0, 1, "�������K��#i19ms21";	// 2718: 131, 148
		//showevent 9999, 0, "���n�[��#i19ms21";	// 2724: 32, 37
		//showevent 9999, 0, "�����̎ւ̑�#i19ms21";	// 2725: 28, 33
	}
	if(EP19_1QUE == 65) {
		mes "[�~���A��]";
		mes strcharinfo(0)+"�l��";
		mes "���̏ꏊ�𒲂ׂĂ݂āB";
		mes "�{�N�͂��̐l����������Ă���";
		mes "�������邩��B";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,134,257,5	script	�l��#i19ms94	93,{/* 2712 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,136,254,5	script	�l��#i19ms95	870,{/* 2713 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,140,253,5	script	�l��#i19ms96	84,{/* 2714 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,139,257,5	script	���C�W�[#i19ms12	10475,{/* 2715 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,146,252,3	script	���n�[��#i19ms12	21529,{/* 2716 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,146,252,3	script	���n�[��#i19ms13	10469,{/* 2717 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,131,148,3	script	�������K��#i19ms21	21529,5,5,{/* 2718 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�������K��]";
		mes "����킵���l�ԁc�c�B";
		close;
	}
	if(EP19_1QUE == 65) {
		cloakoffnpc "�z����#i19ms31";
		cloakoffnpc "�A�[�E�B��#i19ms31";
		cloakoffnpc "�A�[�E�B��#i19ms32";
		cloakoffnpc "�A�[�E�B��#i19ms33";
		mes "[�������K��]";
		mes "�c�c�����Ȃ���B";
		next;
		mes "[�z����]";
		mes "�݂�Ȃǂ��֍s�����񂾁H";
		mes "�㋉���K�������̂��Ƃ���I";
		next;
		mes "[�������K��]";
		mes "�������͓����Ȃ���B";
		mes "�c�c���O�����������Ȃ���B";
		next;
		mes "[�z����]";
		mes "�㋉���K��������";
		mes "�ǂ��ɍs�����������Ă�����Ă΁I";
		next;
		mes "[�������K��]";
		mes "�c�c�V��ł�ɂ͂Ȃ��B";
		mes "�����Ȃ�����B";
		next;
		mes "[�z����]";
		mes "�_�����I";
		mes "�S�R�b���ʂ��Ȃ��I";
		next;
		menu "�ǂ����܂������H",-;
		mes "[�������K��]";
		mes "�����I�@�i�՗l�I";
		mes "�����A�������c�B";
		next;
		mes "[�z����]";
		mes "�����I�@�������ς�������I";
		mes strcharinfo(0)+"��";
		mes "�b�������������ǂ��ȁI";
		next;
		menu "�㋉���K�������͂ǂ��֍s�����H",-;
		mes "[�������K��]";
		mes "�����������́c�c";
		mes "�S���A�W�܂�悤�ɂƁc�c�B";
		next;
		menu "�N�̖��߂ŁH",-;
		mes "[�������K��]";
		mes "����l�́c�c";
		mes "���X�K���h�l�̖��߂Łc�c";
		mes "�㋉���ɏW�܂�悤�ɂƁc�c�B";
		next;
		mes "[�z����]";
		mes "�㋉��悩�I";
		mes "�悵�A2�l�͎��Ƌ��ɗ����I";
		mes "1�l�͎c���āA��������";
		mes "�߂܂��Ă���l�Ԃ����̋~���ɓ�����B";
		unittalk getnpcid(0,"�A�[�E�B��#i19ms31"),"�A�[�E�B�� : �͂��I";
		unittalk getnpcid(0,"�A�[�E�B��#i19ms32"),"�A�[�E�B�� : �͂��I";
		unittalk getnpcid(0,"�A�[�E�B��#i19ms33"),"�A�[�E�B�� : �����I";
		delquest 17646;
		setquest 17647;
		set EP19_1QUE,66;
		close2;
		//showevent 9999, 0, "�A�[�E�B����@#i19ms11";	// 2698: 271, 88
		//showevent 9999, 0, "�~���A��#i19ms12";	// 2711: 144, 253
		//showevent 9999, 0, "�������K��#i19ms21";	// 2718: 131, 148
		//showevent 0, 1, "���n�[��#i19ms21";	// 2724: 32, 37
		//showevent 9999, 0, "�����̎ւ̑�#i19ms21";	// 2725: 28, 33
		cloakonnpc "�z����#i19ms31";
		cloakonnpc "�A�[�E�B��#i19ms31";
		cloakonnpc "�A�[�E�B��#i19ms32";
		cloakonnpc "�A�[�E�B��#i19ms33";
		end;
	}
	if(EP19_1QUE == 66) {
		mes "[�������K��]";
		mes "�����������́c�c";
		mes "����l�́c�c";
		mes "���X�K���h�l�̖��߂Łc�c";
		mes "�㋉���ɏW�܂�悤�ɂƁc�c�B";
		close;
	}
	mes "[�������K��]";
	mes "�c�c�����Ȃ���B";
	close;
OnTouch:
	if(EP19_1QUE == 65) {
		cloakoffnpc "�z����#i19ms31";
		cloakoffnpc "�A�[�E�B��#i19ms31";
		cloakoffnpc "�A�[�E�B��#i19ms32";
		cloakoffnpc "�A�[�E�B��#i19ms33";
	}
	end;
}

jor_que.gat,128,146,7	script	�z����#i19ms31	21529,{/* 2719 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,134,146,1	script	�A�[�E�B��#i19ms31	21529,{/* 2720 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,127,151,5	script	�A�[�E�B��#i19ms32	21529,{/* 2721 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,134,151,3	script	�A�[�E�B��#i19ms33	21529,{/* 2722 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,36,38,3	script	���K��#i19ms20	21529,14,14,{/* 2723 */
	unittalk "���K�� : ���A�E���Ȃ��Łc�c�B";
	end;
OnTouch:
	if(EP19_1QUE == 66 || EP19_1QUE == 67) {
		cloakoffnpc "���n�[��#i19ms21";
		cloakoffnpc "���C�W�[#i19ms21";
		cloakoffnpc "�����̎ւ̑�#i19ms21";
	}
	end;
}

jor_que.gat,32,37,5	script	���n�[��#i19ms21	21529,{/* 2724 (cloaking)*/
	if(EP19_1QUE == 66) {
		mes "[���n�[��]";
		mes "���傤�Ǘǂ��Ƃ���ɁB";
		mes "���҂����Ă܂�����I";
		cloakoffnpc "�I�[�����[#i19ms21";
		unittalk getnpcid(0,"�I�[�����[#i19ms21"),"�I�[�����[ : �ӂށA�ǂ��t�����ȁB";
		next;
		mes "[���K��]";
		mes "�E���Ȃ��Łc���������c���肢�ł��c�B";
		next;
		mes "[���C�W�[]";
		mes "�����ǂ��Ȃ��Ă���񂾁H";
		mes "�Ȃ�ŁA���̃��K���͂���Ȃ�";
		mes "�����Ă���H";
		next;
		mes "[�I�[�����[]";
		mes "���̐�ɐi�ވׂ̓���";
		mes "�ǂ����Ă�݂��������ǁH";
		next;
		mes "[���n�[��]";
		mes "���ꂪ�c�c";
		mes "���̐悪�㋉���Ȃ�ł���";
		mes "�㋉�ȏ�̃��K�������͑S��";
		mes "�����ɏW�߂�ꂽ�݂����Ȃ�ł��B";
		next;
		mes "[���n�[��]";
		mes "�Ƃ��낪�A���̌��";
		mes "�㋉��悩�瓾�̂̒m��Ȃ�";
		mes "���������������";
		mes "�����ɂ������K��������";
		mes "�P���|�������悤�Ȃ�ł��B";
		next;
		mes "[�I�[�����[]";
		mes "���̂̒m��Ȃ������H";
		next;
		mes "[���n�[��]";
		mes "���̉����́A�㋉���K����";
		mes "���Ă��������Ȃ̂ł���";
		mes "�g�̂��ψق��Ă����悤�Łc�c�B";
		next;
		mes "[���n�[��]";
		mes "�������ǂ���Ă���̂�";
		mes "�ψق������K���������A�����瑤��";
		mes "�o�Ă���Ȃ��悤�ɂ���ׂł��B";
		next;
		mes "[�I�[�����[]";
		mes "�c�c���X�K���h��";
		mes "�㋉���K��������";
		mes "���̐�ɏW�܂��Ă���̂�ˁH";
		next;
		mes "[�I�[�����[]";
		mes "���ʓI�ɂ�����";
		mes "�z��������ɒǂ����߂��킯���B";
		mes "��C�ɍU�ߍ��߂�";
		mes "�z���r�łł��邩������Ȃ���B";
		next;
		cloakoffnpc "�z����#i19ms21";
		mes "[�z����]";
		mes "�x�����������������悤���I";
		next;
		cloakoffnpc "���H�[�N�����f#i19ms21";
		cloakoffnpc "���I��#i19ms21";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"���H�[�N�����f#i19ms21"),"���H�[�N�����f : �󋵂́H";
		unittalk getnpcid(0,"���I��#i19ms21"),"���I�� : �����N���Ă��܂����H";
		if(!sleep2(500)) end;
		cloakoffnpc "�~���A��#i19ms21";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�~���A��#i19ms21"),"�~���A�� : �x���Ȃ�܂����B";
		if(!sleep2(1500)) end;
		cloakoffnpc "�A�[�E�B��#i19ms21";
		cloakoffnpc "�A�[�E�B��#i19ms22";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�A�[�E�B��#i19ms21"),"�A�[�E�B�� : �����������܂��I";
		unittalk getnpcid(0,"�A�[�E�B��#i19ms22"),"�A�[�E�B�� : �x���������܂��I";
		if(!sleep2(2000)) end;
		mes "[���C�W�[]";
		mes "�F�l�䑵���ŁI";
		mes "���������A�󋵂𐮗����܂��傤�I";
		next;
		mes "[���C�W�[]";
		mes "���X�K���h�Ə㋉�ȏ�̃��K���A";
		mes "�����ċ��炭�o�S�b�g��";
		mes "���̐�̏㋉���ɏW�܂��Ă��܂��B";
		next;
		mes "[���C�W�[]";
		mes "�������A���̐�ɂ�";
		mes "���̂̒m��Ȃ��������c�c";
		mes "�܂��\������A�o�S�b�g�����K��������";
		mes "�������������ʂ��Ǝv�����ǁB";
		mes "���A�p�j���Ă���悤�ł��B";
		next;
		mes "[���H�[�N�����f]";
		mes "���K���̓z���";
		mes "�w���̐w���ĂƂ��납����B";
		mes "�댯�����ǁA���X�K���h�ɉ�ɂ�";
		mes "������i�ނ����Ȃ����Ă킯�ˁB";
		next;
		mes "[�z����]";
		mes "�ǂ���Ă��銢�I���ǂ���";
		mes "��������邩��";
		mes "���Ԃɓ˓����悤�B";
		mes "��X�A�[�E�B������w��؂�I";
		next;
		cloakonnpc "�z����#i19ms21";
		cloakonnpc "�A�[�E�B��#i19ms21";
		cloakonnpc "�A�[�E�B��#i19ms22";
		mes "[�I�[�����[]";
		mes "���B���s����B";
		mes "���I���A�s�����B";
		next;
		cloakonnpc "���I��#i19ms21";
		cloakonnpc "�I�[�����[#i19ms21";
		mes "[���H�[�N�����f]";
		mes "���n�[���͂����Ɏc����";
		mes "����x�����B";
		mes "�~���A���́A���ƈꏏ�ɍs���܂��傤�B";
		next;
		unittalk getnpcid(0,"���C�W�[#i19ms21"),"���C�W�[ : ��������őҋ@���ȁI";
		cloakonnpc "���H�[�N�����f#i19ms21";
		cloakonnpc "�~���A��#i19ms21";
		mes "[���C�W�[]";
		mes strcharinfo(0)+"��";
		mes "�������ł�����˓����Ă���I";
		delquest 17647;
		setquest 17648;
		set EP19_1QUE,67;
		close;
		//showevent 9999, 0, "�A�[�E�B����@#i19ms11";	// 2698: 271, 88
		//showevent 9999, 0, "�~���A��#i19ms12";	// 2711: 144, 253
		//showevent 9999, 0, "�������K��#i19ms21";	// 2718: 131, 148
		//showevent 9999, 0, "���n�[��#i19ms21";	// 2724: 32, 37
		//showevent 0, 1, "�����̎ւ̑�#i19ms21";	// 2725: 28, 33
	}
	if(EP19_1QUE == 67) {
		mes "[���n�[��]";
		mes "�˓��̏����͂ł��܂������H";
		mes "�����҂��\���Ă��邩";
		mes "�킩��܂��񂩂�";
		mes "�����͑ӂ�Ȃ��ł��������ˁB";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,28,33,5	script	�����̎ւ̑�#i19ms21	10046,{/* 2725 (cloaking)*/
	if(EP19_1QUE == 67) {
		if(mdopenstate("�����̎ւ̑�") || getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[���n�[��]";
			mes "�������ł�����";
			mes "�˓����Ă��������B";
			set '@menu$,"�u�����̎ւ̑��v����";
		}
		else {
			mes "[���n�[��]";
			mes "�˓����鏀���͂ł��܂������H";
			mes "���Ȃ��悤�ł�����";
			mes "��s�����l�����ɍ��}�̐M����";
			mes "����܂��B";
			set '@menu$,"�u�����̎ւ̑��v(�����̎ւ̑�)�̍쐬";
		}
		next;
		if(select("��߂�",'@menu$) == 1) {
			mes "[���n�[��]";
			mes "�������ł���܂�";
			mes "�ҋ@���Ă��܂��ˁB";
			close;
		}
		if(mdopenstate("�����̎ւ̑�")) {
			mes "[���n�[��]";
			mes "�ł́A�˓����Ă��������B";
			close2;
			if(getonlinepartymember() > 2) { // ������
				mes "[�C���t�H���[�V����]";
				mes "���̃������A���_���W������";
				mes "2�l�ȉ��̃p�[�e�B�[��";
				mes "���ꂷ�邱�Ƃ��ł��܂��B";
				close;
			}
			switch(mdenter("�����̎ւ̑�")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[�����̎ւ̑�] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("ConfusedNestControl1")+ "::OnStart";
				//warp "1@jorchs.gat", 278, 18;
				end;
			case 1:	// �p�[�e�B�[������
				mes "[�C���t�H���[�V����]";
				mes "���̃������A���_���W������";
				mes "2�l�ȉ��̃p�[�e�B�[��";
				mes "���ꂷ�邱�Ƃ��ł��܂��B";
				close;
			case 2:	// �_���W�������쐬
				mes "[���n�[��]";
				mes "�p�[�e�B�[���[�_�[�̕���";
				mes "�������ł����̂�";
				mes "�m�F���Ă��������B";
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
			mdcreate "�����̎ւ̑�";
			mes "���p�[�e�B�[��";
			mes "^0000ff"+strcharinfo(1)+"^000000";
			mes "���p�[�e�B�[���[�_�[";
			mes "^0000ff"+strcharinfo(0)+"^000000";
			mes "�@";
			mes "^006400�����̎ւ̑�^000000�̍쐬�\�����󂯕t���܂��B";
			close;
		}
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,34,38,5	script	���C�W�[#i19ms21	10475,{/* 2726 (cloaking)*/
	mes "[���C�W�[]";
	mes "���͂�����";
	mes "�󋵂̔c���ɓw�߂��B";
	mes "�r���͓��ӂ���Ȃ����炳�B";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,37,36,1	script	�z����#i19ms21	21529,{/* 2727 (cloaking)*/
	mes "[�z����]";
	mes "���̓���҂��Ă����I";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,34,32,7	script	�~���A��#i19ms21	21529,{/* 2728 (cloaking)*/
	mes "[�~���A��]";
	mes "���~���̐S���̌��Ђ�";
	mes "�����o���Ȃ��Ɓc�c�I";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,36,35,1	script	�I�[�����[#i19ms21	10465,{/* 2729 (cloaking)*/
	cutin "ep19_aurelie01.png", 0;
	mes "[�I�[�����[]";
	mes "���̒��͍������Ă���悤����������";
	mes "�ϐg���Ȃ��Ă������Ă��ꂽ��B";
	close2;
	cutin "ep19_aurelie01.png", 255;
	end;
OnInit:
	setnpctitle "[����]";	// NPC:�I�[�����[#i19ms21(2729)
	cloakonnpc;
	end;
}

jor_que.gat,35,34,1	script	���I��#i19ms21	10464,{/* 2730 (cloaking)*/
	cutin "ep19_leon01.png", 0;
	mes "[���I��]";
	mes "�Ȃ��㋉�ȏ�̃��K����";
	mes "�W�߂��̂ł��傤���H";
	mes "�c�c�C���ȗ\�������܂��B";
	close2;
	cutin "ep19_leon01.png", 255;
	end;
OnInit:
	setnpctitle "[����]";	// NPC:���I��#i19ms21(2730)
	cloakonnpc;
	end;
}

jor_que.gat,40,34,1	script	���H�[�N�����f#i19ms21	21529,{/* 2731 (cloaking)*/
	mes "[���H�[�N�����f]";
	mes "�����͂ł��������H";
	mes "�O��̏󋵂́A���ɓ����Ă���";
	mes "�������Ă�����B";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,38,33,1	script	�A�[�E�B��#i19ms21	21529,{/* 2732 (cloaking)*/
	mes "[�A�[�E�B��]";
	mes "���ׁI�@�j��I�@�Ђ�����j��I�I";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,37,31,1	script	�A�[�E�B��#i19ms22	21529,{/* 2733 (cloaking)*/
	mes "[�A�[�E�B��]";
	mes "�����ł����ł���݂����I�I";
	mes "�c�c�㊚�񂶂�����B";
	close;
OnInit:
	cloakonnpc;
	end;
}

jor_que.gat,277,34,3	script	�l��#i19ms100	851,{/* 2734 */}
jor_que.gat,276,33,7	script	�l��#i19ms101	851,{/* 2735 */}
jor_que.gat,271,34,5	script	�A�[�E�B��#i19ms100	21529,{/* 2736 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,271,34,0	script	#i19ms100	139,5,5,{/* 2737 */
	cloakoffnpc "�l��#i19ms100";
	cloakoffnpc "�l��#i19ms101";
	unittalk getnpcid(0,"�l��#i19ms100"),"�J���� �F �Ď����������H�@���̎��Ԃ��H";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�l��#i19ms101"),"�J���� �F �����ɖ߂��Ă����c�c�B";
	if(!sleep2(500)) end;
	unittalk getnpcid(0,"�l��#i19ms100"),"�J���� �F �����o���`�����X����Ȃ����H";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�l��#i19ms101"),"�J���� �F ����́A�댯�߂���c�c�B";
	cloakoffnpc "�A�[�E�B��#i19ms100";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms100"),"�A�[�E�B�� : �݂Ȃ���A�����ɂ��܂����I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms100"),"�J���� �F �ȁA�Ȃ񂾁H";
	unittalk getnpcid(0,"�l��#i19ms101"),"�J���� �F �ցA�ςȃ��K����!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms100"),"�A�[�E�B�� : �݂Ȃ���́A�������R�ł��B�����o�āI";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms100"),"�J���� �F ���͓����邼�I";
	if(!sleep2(500)) end;
	cloakonnpc "�l��#i19ms100";
	if(!sleep2(500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms100"),"�A�[�E�B�� : ���Ȃ��������I";
	unittalk getnpcid(0,"�l��#i19ms101"),"�J���� �F �������A�킩������I";
	if(!sleep2(500)) end;
	cloakonnpc "�l��#i19ms101";
	if(!sleep2(500)) end;
	cloakonnpc "�A�[�E�B��#i19ms100";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,252,244,7	script	�l��#i19ms102	748,{/* 2738 */}
jor_que.gat,255,240,1	script	�A�[�E�B��#i19ms101	21529,{/* 2739 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,255,240,0	script	#i19ms101	139,5,5,{/* 2740 */
	cloakoffnpc "�l��#i19ms102";
	unittalk getnpcid(0,"�l��#i19ms102"),"�J���� �F �Ď������Ȃ��Ȃ����H";
	if(!sleep2(1500)) end;
	cloakoffnpc "�A�[�E�B��#i19ms101";
	unittalk getnpcid(0,"�A�[�E�B��#i19ms101"),"�A�[�E�B�� : �����́A���Ȃ��Ƃ�H";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms102"),"�J���� �F �킟�A�����܂���I�@�E�o���悤�Ȃ�Ďv���ĂȂ��ł��I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms101"),"�A�[�E�B�� : �Ď������Ȃ����Ȃ瓦�����܂��I�@�ꏏ�ɍs���܂��傤�I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms102"),"�J���� �F ���c�c�H�@�����Ȃ�!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms101"),"�A�[�E�B�� : �߂܂��Ă���l�������~�o���Ă��ł��B�����A�����I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms102"),"�J���� �F ������I�@��������o����!!";
	if(!sleep2(500)) end;
	cloakonnpc "�A�[�E�B��#i19ms101";
	cloakonnpc "�l��#i19ms102";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,227,277,3	script	�l��#i19ms103	125,{/* 2741 */}
jor_que.gat,223,277,3	script	�l��#i19ms104	89,{/* 2742 */}
jor_que.gat,222,275,7	script	�A�[�E�B��#i19ms102	21529,{/* 2743 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,222,275,0	script	#i19ms102	139,5,5,{/* 2744 */
	cloakoffnpc "�l��#i19ms103";
	cloakoffnpc "�l��#i19ms104";
	unittalk getnpcid(0,"�l��#i19ms104"),"�J���� �F �{���ɊĎ��͂��Ȃ��H";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�l��#i19ms103"),"�J���� �F �l�q�����Ă���B";
	unittalk getnpcid(0,"�l��#i19ms104"),"�J���� �F �C��t�����c�c�B";
	if(!sleep2(1000)) end;
	cloakoffnpc "�A�[�E�B��#i19ms102";
	unittalk getnpcid(0,"�A�[�E�B��#i19ms102"),"�A�[�E�B�� : ���������I�@���Ȃ瓦�����܂���I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms104"),"�J���� �F ��������������������!!!";
	unittalk getnpcid(0,"�l��#i19ms103"),"�J���� �F �Â��ɂ���!!�@�r�b�N�����邾��!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms103"),"�J���� �F �����Ɓc�c�O�ɏo����̂��H";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms102"),"�A�[�E�B�� : �͂��A�t���Ă��Ă��������B���S�ȏꏊ�Ɉē����܂��B";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms103"),"�J���� �F �s�����I�@�����`�����X��!!";
	if(!sleep2(500)) end;
	cloakonnpc "�l��#i19ms103";
	unittalk getnpcid(0,"�l��#i19ms104"),"�J���� �F �فA�{���ɑ��v�Ȃ́c�c�H";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms102"),"�A�[�E�B�� : ���v�ł��I�@�M���Ă��������I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms104"),"�J���� �F �����܂Ō����Ȃ�c�c�s����I";
	if(!sleep2(500)) end;
	cloakonnpc "�l��#i19ms104";
	cloakonnpc "�A�[�E�B��#i19ms102";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,183,272,5	script	�l��#i19ms105	881,{/* 2745 */}
jor_que.gat,187,269,1	script	�A�[�E�B��#i19ms103	21529,{/* 2746 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,187,269,0	script	#i19ms103	139,{/* 2747 */
	cloakoffnpc "�l��#i19ms105";
	unittalk getnpcid(0,"�l��#i19ms105"),"�J���� �F �Â��ɂȂ�����A�������蓦���o���āc�c�B";
	cloakoffnpc "�A�[�E�B��#i19ms103";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms103"),"�A�[�E�B�� : �l�Ԃ𔭌��I�@�����������Ă��������B";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms105"),"�J���� �F �ȁA�Ȃ񂾁H�@�������K��!?";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms103"),"�A�[�E�B�� : ���̓��K���ł͂���܂���B����͌�Ő������܂��I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms103"),"�A�[�E�B�� : ���S�ȏꏊ�܂ł��A�ꂢ�����܂��B�����I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms105"),"�J���� �F �فA�{�����H�@�����x������Ȃ狖���Ȃ�����ȁI";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms103"),"�A�[�E�B�� : �͂��A�͂��B�ו��͑S�������܂�����ˁB�s���܂���B";
	if(!sleep2(500)) end;
	cloakonnpc "�A�[�E�B��#i19ms103";
	cloakonnpc "�l��#i19ms105";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,125,41,5	script	�l��#i19ms106	880,{/* 2748 */}
jor_que.gat,121,39,7	script	�A�[�E�B��#i19ms104	21529,{/* 2749 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_que.gat,121,39,0	script	#i19ms104	139,5,5,{/* 2750 */
	cloakoffnpc "�l��#i19ms106";
	unittalk getnpcid(0,"�l��#i19ms106"),"�J���� �F ���A�������������܂œ����Ă����̂ɁI";
	if(!sleep2(1000)) end;
	cloakoffnpc "�A�[�E�B��#i19ms104";
	unittalk getnpcid(0,"�A�[�E�B��#i19ms104"),"�A�[�E�B�� : �����ɉB��Ă����̂ł����H";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms106"),"�J���� �F ���A���������������B�ǂ������������I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms104"),"�A�[�E�B�� : ���̓��K���ł͂���܂���B���K���ɕϑ����Ă邾���ł��B";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms104"),"�A�[�E�B�� : �ꏏ�ɊO�֍s���܂��傤�B���S�ȏꏊ������܂��B";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms106"),"�J���� �F ���A���̘b��M����ƁH";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms104"),"�A�[�E�B�� : �����`�����X�Ȃ�ł��B�O�ɏo�����Ȃ��̂ł����H";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�l��#i19ms106"),"�J���� �F �O�ɏo�����I�@��������o���Ă���I";
	if(!sleep2(1500)) end;
	unittalk getnpcid(0,"�A�[�E�B��#i19ms104"),"�A�[�E�B�� : �悵�A�ꏏ�ɍs���܂��傤�B";
	if(!sleep2(500)) end;
	cloakonnpc "�A�[�E�B��#i19ms104";
	cloakonnpc "�l��#i19ms106";
	if(!sleep2(500)) end;
	end;
}

jor_que.gat,67,168,5	script	���K��#i19ms100	21529,{/* 2751 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�l�Ԃ́c�o�Ă����I";
		close;
	}
	unittalk "���K�� : �d���̕񍐂������̂Ɂc�c�݂�Ȃǂ��֍s�����񂾁H";
	end;
}

jor_que.gat,156,191,3	script	���K��#i19ms101	21529,{/* 2752 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "����킵���l�Ԃ߂��I";
		close;
	}
	unittalk "���K�� : �Ȃ�����ȂɍQ���������񂾁H";
	end;
}

jor_que.gat,204,237,3	script	���K��#i19ms102	21529,{/* 2753 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�l�Ԃ͗����֎~���I";
		close;
	}
	unittalk "���K�� : ���������́c�c���������ǂ��ɁH";
	end;
}

jor_que.gat,81,77,5	script	���K��#i19ms103	21529,{/* 2754 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�l�Ԃ͏o�Ă����I";
		close;
	}
	unittalk "���K�� : ���̐�͊댯�ł��B�����ɋ��Ă��������B";
	end;
}

jor_que.gat,208,140,1	script	���K��#i19ms104	21529,{/* 2755 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�l�ԁH�@���̂�������!?";
		close;
	}
	unittalk "���K�� : �����͔т���Ȃ��H";
	end;
}

jor_que.gat,184,184,7	script	���K��#i19ms105	21529,{/* 2756 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "����킵���l�Ԃ߁c�c�B";
		close;
	}
	unittalk "���K�� : �Ȃ�ŐÂ��H�@�Ȃ�ŁH�@ �Ȃ�ŁH";
	end;
}

jor_que.gat,128,81,7	script	���K��#i19ms106	21529,{/* 2757 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�l�ԁc�c�����B";
		close;
	}
	unittalk "���K�� : ���A��Ă�B";
	end;
}

jor_que.gat,173,195,3	script	���K��#i19ms107	21529,{/* 2758 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "����킵���l�Ԃ߁c�c�B";
		close;
	}
	unittalk "���K�� : �ɂ��c�ɂ���c�O�֏o�����B";
	end;
}

jor_que.gat,162,58,1	script	���K��#i19ms108	21529,{/* 2759 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�l�ԁc�ߊ��ȁc�c�B";
		close;
	}
	unittalk "���K�� : �V��ł܂���c�c�{���ł��B�{���ł��B";
	end;
}

jor_que.gat,159,105,3	script	���K��#i19ms109	21529,{/* 2760 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "����킵���l�ԁc�c�B";
		close;
	}
	unittalk "���K�� : ���������`�����āI";
	end;
}

icecastle.gat,195,170,3	script	�x��#e19c00	21517,{/* 2761 */
	unittalk "�x�� : �x�����B";
	end;
}

icecastle.gat,209,156,3	script	�x��#e19c01	21517,{/* 2762 */
	unittalk "�x�� : �ُ�Ȃ��I";
	end;
}

icecastle.gat,71,255,5	script	�A����#e19c00	10461,{/* 2763 */
	unittalk "�A���� : �~�܂��āI�@�����Ȃ��悤�ɋC��t����B�_���ȑ��Ղ�����B";
	end;
}

icecastle.gat,118,270,3	script	�z����#e19c00	10461,{/* 2764 */
	unittalk "�z���� : ���̑�ɂ͓`��������B�������N�����̓`����m��Ȃ��B";
	end;
}

icecastle.gat,118,245,5	script	�M������#e19c00	21514,{/* 2765 */
	unittalk "�M������ : �҂��ĂāB�����̂����A�S���߂܂��邩��B";
	end;
}

icecastle.gat,133,165,5	script	�n����#e19c00	10461,{/* 2766 */
	unittalk "�n���� : �Y�킾��H�@�ꐶ�����W�߂��񂾂�B";
	end;
}

icecastle.gat,116,147,5	script	�X�j����#e19c00	21514,{/* 2767 */
	unittalk "�X�j���� : ��ɂ����Œނ������Ȃ�Ĕn�����ȁB�����͑S�������ɂ���̂ɁI";
	end;
}

icecastle.gat,99,119,3	script	�S�q����#e19c00	10461,{/* 2768 */
	unittalk "�S�q���� : �΂����I",1;
	end;
}

icecastle.gat,84,129,3	script	�o���W��#e19c00	10461,{/* 2769 */
	unittalk "�o���W�� : �Y��ł��傤�H�@�݂�ȂɌ����邽�߂Ɏ����Ă����񂾂�B";
	end;
}

icecastle.gat,82,111,3	script	�V���V���V��#e19c00	10461,{/* 2770 */
	unittalk "�V���V���V�� : ���̑��𔲂��҂́A�V������ɓ����!!�@�������񂪌����Ă܂����B",1;
	end;
}

jor_tail.gat,209,72,5	script	�x��#e19c02	21517,{/* 2771 */
	unittalk "�x�� : �C�X�K���h�ւ悤�����I",1;
	end;
}

jor_tail.gat,216,79,3	script	���t�z#e19c00	10461,{/* 2772 */
	unittalk "���t�z : ���ނ����Ƃǂ��Ȃ�H�@�܂��Ⴊ�~��I�@��͂͂͂͂͂�!!!",1;
	end;
}

jor_tail.gat,291,91,5	script	�n����#e19c00	10461,{/* 2773 */
	unittalk "�n���� : �������C�̉ʂĂ���ˁH",1;
	end;
}

jor_tail.gat,153,76,3	script	�m�h��#e19c00	10461,{/* 2774 */
	unittalk "�m�h�� : ���̃o�X�P�b�g�𖞃^���ɂł���̂��ȁB";
	end;
}

jor_tail.gat,150,81,5	script	�o�U����#e19c00	10461,{/* 2775 */
	unittalk "�o�U���� : �\���x�񂾂�A�d�������悤���H";
	end;
}

jor_tail.gat,250,273,7	script	�]������#e19c00	10461,{/* 2776 */
	unittalk "�]������ : �X�̒��������̌`�̕��𓪂ɕt���Ă���񂾁B�s�v�c���ȁB";
	end;
}

jor_tail.gat,216,269,5	script	�n��������#e19c00	10461,{/* 2777 */
	unittalk "�n�������� : ������������C��t���āI�@�����Ƌ~���ɂ����Ԃ��|����񂾁B";
	end;
}

jor_tail.gat,181,158,5	script	�z�t�z#e19c00	10461,{/* 2778 */
	unittalk "�z�t�z : ���̑��Ղ�������H�@���Ȃ鑫�Ղ���B���������������邩��A�{���Ă݂āB";
	end;
}

jor_tail.gat,168,86,3	script	�S����#e19c00	10461,{/* 2779 */
	unittalk "�S���� : �����J�������H�ъǗ��܂̖h���E�h���e�X�g���Ȃ̂��B";
	end;
}

icas_in.gat,241,66,3	script	�]������#ep19_dq_kitche	10451,{/* 2780 */
	if(EP19_1QUE < 100) {
		mes "[�]������]";
		mes "�l�Ԃ��K�˂Ă����Ƃ����b��";
		mes "�����Ă������ǁc�c";
		mes "�O�o���͎�����̂��H";
		mes "���͂�����펞��Ԃ�����A";
		mes "���̖����P�ƍs���͊댯���B";
		mes "�������̑��֖߂��Ă���B";
		next;
		mes "^e6328c�]���̃N�G�X�g��i�s����ɂ�";
		mes "^e6328c�@�ȉ��̏����𖞂����K�v������܂��]";
		mes "^e6328c�@�EBaseLv220�ȏ�";
		mes "^e6328c�@�E�N�G�X�g�u���b�̒n�v�̃N���A";
		mes "�@^000000";
		mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
	if(checkquest(8787)) {
		mes "[�]������]";
		mes "�H���̒��B����`���Ă����̂��H";
		mes "���񂽂ɂ͊֌W�Ȃ��̂ɁA���ɒ���B";
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̋u)") == 2) {
			mes "[�]������]";
			mes "�������n�Ɍ��������H";
			close2;
			cutin "kafra_01.bmp", 255;
			warp "jor_back1.gat", 131, 16;	// from: icas_in.gat(242, 58)
			end;
		}
		mes "�N�G�X�g�̎󒍂�񍐁A";
		mes "���������\�ł��B";
		next;
		switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[�󒍉�] �]�������̊y���������`�^�C��","�S�Ĕj������")) {
		case 3:
			if(checkquest(8788)) {
				if(countitem(1000830) < 10) {
					mes "[�]������]";
					mes "���͎q�������̐��b�����Ă��邩��A";
					mes "<ITEM>[�����ď�v�Ȕ�]<INFO>1000830</INFO></ITEM>��";
					mes "10�̂��Ă��Ă���邩�H";
					mes "<URL>�A�C�X�X�g���[<INFO>https://rotool.gungho.jp/monster/EP19_ICE_STRAW</INFO></URL>�����Ǝ�ɓ���͂����B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�]�������̊y���������`�^�C��^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 8788;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�]�������̊y���������`�^�C��^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�]�������̊y���������`�^�C��^000000�v";
				mes "<���e>";
				mes "�A�C�e���F<ITEM>[�����ď�v�Ȕ�]<INFO>1000830</INFO></ITEM>�@10��";
				mes "��[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				mes "JobExp 4.5G ( 4500000000 )";
				mes "��225000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�]�������̊y���������`�^�C��^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 1000830,10;
				delquest 8788;
				setquest 8789;
				getitem 1000608,2;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 300000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,225000000,0;
				mes "[�]������]";
				mes "���肪�Ƃ��A�l�ԁI";
				next;
				mes "[�]������]";
				mes "���������c�ׂ����؂��Ă����邩��A";
				mes "��������Ă��ĂˁB";
				mes "�X�̌��Ђ���ԂƊ�Ȃ���B";
				mes "�l�ԁA����Ȃ炿����ƌ��ɉ������āB";
				mes "�����A�ł͕�����Ă݂悤���ȁc�c�B";
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
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
				mes "���l�����܂����B";
				close2;
				unittalk getnpcid(0,"�]������#ep19_dq_kitche"),"�]������ : �K�E�I�A�[�E�B�����҉䗬�A���⌕�I";
				unittalk getnpcid(0,"�z������#ep19in"),"�z������ : �]�������A�i�D�����I";
				unittalk getnpcid(0,"�g������#ep19in"),"�g������ : �]�������A�i�D�����I";
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(8789)) {
				if(!(checkquest(8789)&2)) {
					mes "[�]������]";
					mes "�q�����������ł���B";
					mes "����ň���S���ȁB";
					mes "�܂����A";
					mes "���푰�������̈玙�Ɋ������ނƂ́c�c";
					mes "�܂������B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�]�������̊y���������`�^�C��^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			mes "[�]������]";
			mes "���͎q�������̐��b�����Ă��邩��A";
			mes "<ITEM>[�����ď�v�Ȕ�]<INFO>1000830</INFO></ITEM>��";
			mes "10�̂��Ă��Ă���邩�H";
			mes "<URL>�A�C�X�X�g���[<INFO>https://rotool.gungho.jp/monster/EP19_ICE_STRAW</INFO></URL>�����Ǝ�ɓ���͂����B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�]�������̊y���������`�^�C��^000000�v";
			mes "<���e>";
			mes "�A�C�e���F<ITEM>[�����ď�v�Ȕ�]<INFO>1000830</INFO></ITEM>�@10��";
			mes "�̔[�i���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�]������]";
				mes "���͖Z�����̂��H";
				mes "�킩�����B";
				mes "�܂����Ԃ��ł����痊�ނ�B";
				next;
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 8788;
			delquest 8789;
			mes "[�]������]";
			mes "�l�ԁA���񂽂͂����̎q������";
			mes "���̊֌W���Ȃ��͂��Ȃ̂Ɂc�c";
			mes "�D�����z�Ȃ񂾂ȁB";
			mes "���肪�Ƃ��I";
			next;
			//showevent 0, 2, "�]������#ep19_dq_kitche";	// 2766: 241, 66
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�]�������̊y���������`�^�C��^000000�v";
			mes "���󒍂��܂����B";
			close2;
			unittalk getnpcid(0,"�z������#ep19in"),"�z������ : �]�������͎��ł��Ȃ��I";
			unittalk getnpcid(0,"�g������#ep19in"),"�g������ : �n���g���͏�肢�I";
			unittalk getnpcid(0,"�]������#ep19_dq_kitche"),"�]������ : ������c�c";
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	mes "[�]������]";
	mes "���񂽂�";
	mes "������ƑO�ɃC�X�K���h�ɗ����Ƃ���";
	mes "�l�Ԃ��H��Ċ������B";
	next;
	mes "[�]������]";
	mes "���̓]�c�c����A";
	mes "�G�����B���E�A���N�T���h���A�E";
	mes "�A�[�f���E�_���B�b�h�E�J�V�A�E";
	mes "�w���[�E�A�|�����B";
	mes "�C�y�ɌĂ�ł���B";
	next;
	mes "[�z������]";
	mes "���̂́A�����̈�ԏ�̌Z�A";
	mes "���O�̓]����������I";
	mes "���̓z�������ł��B";
	next;
	mes "[�]������]";
	mes "�c�c�z�������I";
	mes "�����̏��肪�����������ȁB";
	next;
	mes "[�]������]";
	mes "���Ă̒ʂ�A�����͐~�[���H�����B";
	mes "�~�[�݂͂�ȂɊJ������Ă��邪�A";
	mes "�H�ފǗ��͉����S�����Ă���B";
	mes "�����Ƃ����ɂ̓A�������c�c";
	mes "�؂�����A�؂荏�񂾂肷��̂́A";
	mes "�K�v�Ȃ牴�����B";
	next;
	mes "[�]������]";
	mes "�����̎��ɉ΂��g���ƌ��ʁA";
	mes "�{�����[���������Ă��܂����肷�邩��A";
	mes "���܂�΂͎g��Ȃ��ȁB";
	next;
	mes "[�]������]";
	mes "�H�ފǗ���C����Ă邩��";
	mes "���܂ɑ�ʂɐH�ނ��K�v�Ȏ���������";
	mes "�����������́A��������Ă����B";
	mes "�ǂ����S�������Ă��āc�c";
	mes "�ɂސS�z�������̂������K�����B";
	next;
	mes "[�]������]";
	mes "���܂�c�c";
	mes "����l�łڂ��ڂ���s���Ă��܂����ȁB";
	mes "�����������ނ�ɏo��ƁA";
	mes "�z�������̖ʓ|��";
	mes "�������Ȃ���Ȃ�Ȃ�����c�c";
	unittalk getnpcid(0,"�z������#ep19in"),"�z������ : �������Z�����̖ʓ|�����Ă�񂾂�I";
	next;
	mes "[�]������]";
	mes "�����̗��e�̓p�g���[�����o�g������ˁB";
	mes "�z�������́A";
	mes "�قƂ�ǉ��Ɠ�Ԗڂ̃���������";
	mes "�ʓ|�݂Ĉ�Ă���B";
	unittalk getnpcid(0,"�z������#ep19in"),"�z������ : �������Z�����̖ʓ|�����Ă��񂾂�I";
	next;
	mes "[�]������]";
	mes "����A���q����Ƙb��������Ȃ����B";
	unittalk getnpcid(0,"�z������#ep19in"),"�z������ : �͂����I";
	next;
	mes "[�]������]";
	mes "�������Ă���B";
	unittalk getnpcid(0,"�z������#ep19in"),"�z������ : �A�C�X�X�g���[�H�ׂ����I";
	next;
	mes "[�]������]";
	mes "�c�c�B";
	next;
	mes "[�]������]";
	mes "�A�C�X�X�g���[���c�c�A";
	mes "��������Ƃ��<ITEM>[�����ď�v�Ȕ�]<INFO>1000830</INFO></ITEM>���A";
	mes "�z�������̍D���Ȃ񂾂��A";
	mes "���̍݌ɂ��؂�Ă�񂾁B";
	mes "10�قǂ���΂ǂ��ɂ��Ȃ�񂾂��c�c�B";
	unittalk getnpcid(0,"�g������#ep19in"),"�g������ : �����I";
	next;
	mes "[�]������]";
	mes "�������u���ĊO�ɏo���ɂ��c�c�B";
	next;
	mes "�]�܂�ő������̗l���]";
	next;
	if(select("����Ɏ��ɏo��","�G�߂�") == 2) {
		mes "[�]������]";
		mes "�����̂��Ƃł͂���c�c";
		mes "�����A�����̂��Ƃ���c�c�B";
		unittalk getnpcid(0,"�g������#ep19in"),"�g������ : �]�������A�V��ŁI";
		close;
	}
	mes "[�]������]";
	mes "����Ȃɂ��肪�������Ƃ��I";
	mes "���e��`���邩��A";
	mes "������x�b�������Ă���I";
	mes "�q�������͉������b���Ă邩��c�c";
	mes "�������A���񂽂͂����̎q������";
	mes "���̊֌W���Ȃ��񂾂��c�c���܂�B";
	close2;
	setquest 8787;
	compquest 8787;
	unittalk getnpcid(0,"�z������#ep19in"),"�z������ : ���肪�Ƃ��A�l�ԁI";
	unittalk getnpcid(0,"�g������#ep19in"),"�g������ : ���肪�Ƃ��A�l�ԁI";
	//showevent 0, 3, "�]������#ep19_dq_kitche";	// 2766: 241, 66
	end;
}

icas_in.gat,42,252,5	script	���I��#ep19leon02	10464,{/* 2781 */
	if(EP19_1QUE < 100) {
		mes "[���I��]";
		mes "�����K�v�ȗp���ł��H";
		mes "���̕������͏h�ɂ�H����";
		mes "����������͂��ł��B";
		close;
	}
	if(checkquest(18133)) {
		if(checkquest(18133)&8) {
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "���؈�{�����Ȃ��ጴ�ɒg�F�Ƃ�";
			mes "�΂����ł��傤���H";
			mes "���܂ɔ�������閂�͂̌����̂ł���";
			mes "��Ԃ̉Ԃт��A";
			mes "���K���������̓��ɒ~�ς���";
			mes "���͊j��R���Ƃ��Ďg�p���Ă��܂��B";
			next;
			mes "[���I��]";
			mes "�����A������ւǂ����B";
			mes "�g�̂����߂Ă��������B";
			close2;
			cutin "ep19_leon01.png", 255;
			end;
		}
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "��ɐl�肪�����Ċ������ł��B";
		mes "����܂ł̓��n�[����1�l��";
		mes "�撣���Ă��܂�������ˁB";
		mes "����ł́A�ڍׂȘb��";
		mes "�~���A���l�Ƃ��肢���܂��B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	cutin "ep19_leon04.png", 2;
	mes "[���I��]";
	mes "���Ăт��Ă��Đ\���󂠂�܂���B";
	mes "���݂������Ƃ��������̂ł��B";
	mes "���̑O���K���̏Z����{���������A";
	mes "�J���҂������~�o�����ł��傤�H";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�͂��B";
	mes "���̎��~�������l������";
	mes "�}�����ƃ��C�W�[����";
	mes "�������ċA�҂��܂������c�c�H";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "���͂��̎��~�����ꂽ�҂����Ƃ͕ʂɁA";
	mes "���K���̏Z������O�֒E�o�����҂�����";
	mes "����悤�ł��B";
	next;
	mes "[���I��]";
	mes "�p�g���[�������Ă����A�[�E�B����";
	mes "���Ă����؂̕X�͂�";
	mes "���Ă����؂̕����̒n�悩��";
	mes "����҂Ƃ��Ĕ����������Ƃ�";
	mes "���o���܂����B";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�Ȃ�قǁc�c";
	mes "����҂������̉\��������܂��ˁB";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "�A�[�E�B�����������ӂ�";
	mes "�p�g���[�����Ă��܂����A";
	mes "�S�n����G�Ȃ��{�����邱�Ƃ�";
	mes "����悤�ł��B";
	next;
	cutin "ep19_leon05.png", 2;
	mes "[���I��]";
	mes "�����ŁA";
	mes "�݂Ȃ���ɏ��������߂����̂ł����c�c�B";
	next;
	menu "�����C�ɂȂ���̂ł��H",-;
	mes "[���I��]";
	mes "�C�X�K���h�𕢂����E��";
	mes "�~�b�h�K���h�ƃC�X�K���h�����S��";
	mes "�������邽�߂ɍ��ꂽ���̂ł���";
	mes "���m�ɂ́A���K�����~�b�h�K���h����";
	mes "�u�����邽�߂̂��̂Ȃ�ł��c�c�B";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "���ҏ�Ȃ��ōs�������Ă���҂�����";
	mes "����Ƃ������Ƃ́A";
	mes "���炩�Ɍ��E����܂��Ă���؋��B";
	next;
	mes "[���I��]";
	mes "���S�N�̔N����";
	mes "���ʂ��Ƃ��Ȃ��g�̂Ŋ����Ă���";
	mes "�������̑��݂́A";
	mes "���̓��̂��߂ɂ������̂��ƁA";
	mes "�����v���܂����B";
	next;
	menu "���S�N�c�c",-;
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "���ƃI�[�����[�́A";
	mes "���������K���h�̈ӎu�������p���ŁA";
	mes "����������Ă���܂��B";
	mes "�݂Ȃ���������m��������܂��񂪁A";
	mes "���������K���h��";
	mes "�{���͎א_�ł͂���܂���B";
	next;
	cutin "ep19_leon04.png", 2;
	mes "[���I��]";
	mes "���������K���h���א_�Ǝv�킹���̂́A";
	mes "���������K���h���c�����̂�";
	mes "�嗤�����Ɋׂꂽ";
	mes "���K�������̏��ׂł��B";
	next;
	menu "���������K���h�̎􂢂́H",-;
	cutin "ep19_leon05.png", 2;
	mes "[���I��]";
	mes "���������K���h���c�̎񒷂��A";
	mes "�Ō�̂�������";
	mes "���̎􂢂��|�������̂ł��B";
	mes "�ނ�͏�Ɋ���Ƃ���";
	mes "���������K���h���f���Ă������߁A";
	mes "�㐢�ɂ͂����`������悤�ł��B";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "�Ƃ������A���������K���h��";
	mes "����̐g�̂��̂ĂĂ܂ő嗤���~�����Ƃ�";
	mes "�v���������_�ł��B";
	mes "���������K���h�̈ӎu���p�����߂ɂ��A";
	mes "���K���͂��̒n����";
	mes "�������킯�ɂ͂����܂���B";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�d���b�ł��ˁc�c";
	mes "�w�L�^���ꂽ���j��";
	mes "�^���ł͂Ȃ����Ƃ����蓾��x";
	mes "�Ƃ������Ƃ͗����ł��܂����c�c�B";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "���̎����A�����A";
	mes "�������͎������ɂł���őP��";
	mes "�s�����΂����̂ł��傤�B";
	mes "���E�͎��ƃI�[�����[���ێ����܂��B";
	next;
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "�݂Ȃ���ɂ́A";
	mes "����҂̋~���̌���";
	mes "��C���Ă���낵���ł����H";
	next;
	cutin "ep19_leon03.png", 2;
	mes "[���I��]";
	mes "�������x���͐ɂ��܂Ȃ�����ł��B";
	mes "����Ƃ̎v���ŋ~����";
	mes "�~�b�h�K���h�嗤�ł��B";
	mes "���̎q������������Ă݂��Ȃ��ƁB";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "���I���l�̈ӎv�A�悭����܂����B";
	mes "����ł͖`���҂���A";
	mes "�ꏏ�ɋ�̓I�Ȍv�����낤�H";
	setquest 18133;
	close2;
	//showevent 0, 3, "�~���A��#ep19_dq_victim";	// 2769: 48, 252
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	setnpctitle "[����]";	// NPC:���I��#ep19leon02(2781)
	end;
}
icas_in.gat,37,253,0	script	ep19_sw_cas_kr	139,14,14,{/* 2782 */
	if(EP19_1QUE >= 100)
		cloakoffnpc "�~���A��#ep19_dq_victim";
	end;
}
icas_in.gat,48,252,3	script	�~���A��#ep19_dq_victim	10377,{/* 2783 (cloaking)*/
	if(checkquest(18133)) {
		if(checkquest(18133)&8) {
			cutin "ep18_miriam_01.png", 0;
			mes "[�~���A��]";
			mes "�`���҂���A";
			mes "����������҂̋~���ɂ����H";
			next;
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̕X��)") == 2) {
				mes "[�~���A��]";
				cutin "ep18_miriam_01.png", 2;
				mes "���ꂶ��A���n�܂ő���ˁB";
				mes "�{�N���ʂ̏ꏊ�����ĉ�邩��A";
				mes "�`���҂�����撣���ĂˁB";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_back3_.gat", 363, 245;	// from: icas_in.gat(49, 254) port : 5122
				end;
			}
			mes "�N�G�X�g�̎󒍂�񍐁A";
			mes "���������\�ł��B";
			next;
//switch(select("�S�ĕ񍐂���","[^ff0000���풆^000000] ����ґ{��","�S�Ď󒍂���","�S�Ĕj������")) {
			switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[�󒍉�] ����ґ{��","�S�Ĕj������")) {
//switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[^ff0000�񍐉�^000000] ����ґ{��","�S�Ĕj������")) {
//switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[^888888���Ԑ�����^000000] ����ґ{��","�S�Ĕj������")) {
			case 3:
				if(checkquest(18134) || checkquest(18135)) {
					mes "[�~���A��]";
					cutin "ep18_miriam_01.png", 2;
					mes "<URL>���ĕt�����؂̕X��<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>�Ɍ������A";
					mes "����҂̑{�������肢�B";
					next;
					mes "[�~���A��]";
					cutin "ep18_miriam_01.png", 2;
					mes "����҂𔭌�������A";
					mes "���̏��1�K�̉E��̕����ɂ���";
					mes "�g�F�̑O�ɂ����ɘA��čs���āB";
					mes "�}�����ɂ��b��ʂ��Ă���������A";
					mes "�ʓ|�����Ă����͂�����B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����ґ{��^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
					}
					delquest 18134;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����ґ{��^000000�v";
					mes "��j�����܂����B";
					close;
				}
				if(checkquest(18136)) {
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����ґ{��^000000�v";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 4.5G ( 4500000000 )";
					mes "��225000000��20��󂯎��܂��B";
					mes "JobExp 3.5G ( 3500000000 )";
					mes "��175000000��20��󂯎��܂��B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����ґ{��^000000�v";
					mes "��񍐂��܂����H";
					next;
					if(select("�񍐂���","��߂�") == 2) {
					}
					delquest 18134;
					delquest 18136;
					setquest 18137;
					getitem 1000608,2;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 225000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,175000000,0;
					cutin "ep18_miriam_01.png", 2;
					mes "[�~���A��]";
					mes "���肪�Ƃ��B�`���҂���B";
					mes "�����͂����x��ŁA";
					mes "�����ɂȂ�����A�܂��{�����悤�B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 4.5G";
					mes "( 4500000000 )";
					mes "��225000000 BaseExp��";
					mes "�@20��󂯎��܂����B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "JobExp 3.5G";
					mes "( 3500000000 )";
					mes "��175000000 JobExp��";
					mes "�@20��󂯎��܂����B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
					mes "���l�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(18137)) {
					cutin "ep18_miriam_01.png", 2;
					mes "[�~���A��]";
					mes "�ጴ�Œ����Ԋ�������̂�";
					mes "�댯����B";
					mes "�\���ɋx�����Ƃ��Ă���A";
					mes "�Ăё{���Ɍ��������H";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����ґ{��^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				cutin "ep18_miriam_01.png", 2;
				mes "[�~���A��]";
				mes "<URL>���ĕt�����؂̕X��<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>�Ɍ������A";
				mes "����҂̑{�������肢�B";
				next;
				cutin "ep18_miriam_01.png", 2;
				mes "[�~���A��]";
				mes "����҂𔭌�������A";
				mes "���̏��1�K�̉E��̕����ɂ���";
				mes "�g�F�̑O�ɂ����ɘA��čs���āB";
				mes "�}�����ɂ��b��ʂ��Ă���������A";
				mes "�ʓ|�����Ă����͂�����B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000����ґ{��^000000�v";
				mes "���󒍂��܂����H";
				next;
				if(select("�󒍂���","��߂�") == 2) {
					mes "[�~���A��]";
					cutin "ep18_miriam_01.png", 2;
					mes "����������B";
					mes "���Ԃ��ł�����A�܂���낵���ˁB";
					next;
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 18134;
				mes "[�~���A��]";
				cutin "ep18_miriam_01.png", 2;
				mes "��낵���ˁB";
				mes "�{�N�͕����̕������Ă����B";
				next;
				//showevent 0, 2, "�~���A��#ep19_dq_victim";	// 2769: 48, 252
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000����ґ{��^000000�v";
				mes "���󒍂��܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���ꂶ�Ⴀ�A";
		mes "����҂̋~���ɂ��Ęb���l�߂悤�B";
		next;
		mes "[�~���A��]";
		mes "�܂��A�{�����ׂ��n���";
		mes "���ĕt�����؂̕X�͂ƁA";
		mes "���ĕt�����؂̕�����2�̒n��ł��B";
		mes "�n�悲�ƂɒS���҂𕪂��āA";
		mes "�{�����悤�B";
		next;
		mes "[�~���A��]";
		mes "�`���҂���́A";
		mes "���ĕt�����؂̕X�͂̕��𗊂ނ�B";
		next;
		menu "�~�o��������҂́H",-;
		mes "[�~���A��]";
		mes "�悸�͕X�̏�̏h�ɂɘA��Ă��悤�B";
		mes "�g������Ă�����āA�̗͂��񕜂�����A";
		mes "�}�����ƃ��C�W�[�����";
		mes "�ʂ��đ嗤�֑���͂��悤�B";
		next;
		mes "[�~���A��]";
		mes "�`���҂���";
		mes "�Е��̒n���S�����Ă����΁A";
		mes "��������̓{�N���T���Ă݂��B";
		mes "���K���̏Z���́A";
		mes "�A�[�E�B���ƃ��n�[���l��";
		mes "�{����v�����悤�B";
		next;
		mes "[�~���A��]";
		mes "�Z���̒��Ȃ�A";
		mes "����Ȃ�ɔ͈͂���������Ă邩��A";
		mes "�{�����鎞�Ԃ͒Z�����낤���B";
		next;
		mes "[�~���A��]";
		mes "����҂̑{�����̂��̂���������A";
		mes "�{�N�Ɩ`���҂���ł�낤�B";
		mes "���ꂶ�Ⴀ�A";
		mes "�������ł�����b�������āB";
		compquest 18133;
		close2;
		//showevent 0, 3, "�~���A��#ep19_dq_victim";	// 2769: 48, 252
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "���I���l��";
	mes "����`�����Ăق�����������B";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back3_.gat,344,296,3	script	���ڂ�#ep19_3_1	550,{/* 6040 */
	if(checkquest(18134)) {
		mes "�]��̊Ԃɂ��ڂ݂�����]";
		next;
		if(select("�@��Ԃ�","��������") == 2) {
			mes "�]���������ɗ����������]";
			close;
		}
		progressbar 1;	//color=0x4d4dff
		next;
		mes "�]�Ȃ�ƁI";
		mes "�@����҂���Ɍ����@��A";
		mes "�@�������܂��Ă���B";
		mes "�@�X�̏�֘A��čs���āA";
		mes "�@�g�߂Ă����悤�I�]";
		setquest 18135;	showevent 0, 3, "�}����#ep19maram05";	// 2774: 262, 179
		close;
	}
	mes "�]�ς���������@��Ԃ������Ղ�����B";
	mes "�@���͂Ɉُ�͌�����Ȃ��]";
	close;
}
jor_back3_.gat,320,208,3	duplicate(���ڂ�#ep19_3_1)	���ڂ�#ep19_3_2	550	/* 6041 */
jor_back3_.gat,182,305,3	duplicate(���ڂ�#ep19_3_1)	���ڂ�#ep19_3_3	550	/* 6042 */

icas_in.gat,262,179,0	script	#ep19_evt07	139,14,10,{/* 2784 */
	if(checkquest(18135) || checkquest(18136)) {
		cloakoffnpc "�}����#ep19maram05";
		cloakoffnpc "�~�����������#ep19_01";
		cloakoffnpc "�~�����������#ep19_02";
		cloakoffnpc "�~���A��#ep19miriam06";
	}
	end;
}
icas_in.gat,261,186,7	script	�~�����������#ep19_01	881,{/* 2785 (cloaking)*/
	unittalk "�c�c���c�c���ꂪ�����������񂾁B�g����������c�c�I";
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,262,184,7	script	�~�����������#ep19_02	882,{/* 2786 (cloaking)*/
	unittalk "���c�c�����Ă����������肪�Ƃ��������܂����B�ӂ��c�c�������ʂ��Ǝv�����B";
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,260,180,5	script	�~���A��#ep19miriam06	10377,{/* 2787 (cloaking)*/
	if(checkquest(18136)) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�{�������l�B";
		mes "�g�͉̂��܂����H";
		mes "��V�̏����͂ł��Ă��B";
		mes "�{�N�ƈꏏ�ɏ�̕����ɂ��āB";
		close2;
		cutin "ep18_miriam_01.png", 255;
		warp "icas_in.gat", 50, 248;	// from: icas_in.gat(258, 182)
		end;
	}
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�{�������l�B";
	mes "�g�͉̂��܂����H";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,262,179,3	script	�}����#ep19maram05	10376,{/* 2788 (cloaking)*/
	if(checkquest(18135)) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�~�����ꂽ�������́A";
		mes "�̂����߂Ă��������B";
		mes "�F����́A";
		mes "������s�D�Ō������ꏊ��";
		mes "�A��ċA��\��ł��B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�厖�ɂȂ�O�Ɍ������Ă悩������B";
		mes "�����ɋ����āA";
		mes "���������K���h���c��";
		mes "�V�����@�����Ǝv����";
		mes "���ė����l����������݂����B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�Ȃ�قǁB";
		mes "�ǂ���ɂ��Ă��A���̕������ɂ��ẮA";
		mes "���ƃ��C�W�[���񂪗����������Ă���A";
		mes "�Ƃɑ���͂����B";
		mes "�`���җl������J�l�ł����B";
		mes "�����x��ł��������B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�������ˁB";
		mes "�����͂����x��ŁA�����܂��{�����悤�B";
		mes "�`���҂���ɂ͕�V��n���Ȃ��Ƃ�����A";
		mes "�{�N�ƈꏏ�ɏ�̕����ɍs�����H";
		setquest 18136;
		delquest 18135;
		close2;
		//showevent 0, 3, "�~���A��#ep19_dq_victim";	// 2769: 48, 252
		//showevent 0, 3, "�~���A��#ep19miriam06";	// 2773: 260, 180
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "����ꂽ���X�́A";
	mes "������x�A���Âɂ��Ă���";
	mes "��s�D�ő���͂���\��ł��B";
	mes "�K�v�ȕi������΁A�����ĎQ��܂���B";
	close2;
	cutin "ep18_maram_01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,25,126,5	script	���C�W�[#if19msdq	10454,{/* 2789 (cloaking)*/
	unittalk "�����͉���Ă݂��H";
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,29,125,3	script	�����P�A#if19msdq	10455,{/* 2790 (cloaking)*/
	unittalk "�������ǁA��C���V�N���Y��ˁB";
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,27,126,3	script	�z����#ep19_dq_dowsing	10461,{/* 2791 (cloaking)*/
	function EXP_SEPFIX;

	if(EP19_1QUE < 100)
		end;
	if(checkquest(17650)) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�`���ҁA������Ǝ��Ԃ�����Ă���邩�H";
		next;
		menu "�ǂ������܂������H",-;
		mes "[�z����]";
		mes "�ւ̑��̉��ɗ��Ă����������K���������A";
		mes "�ʂ̏o��������@����";
		mes "�E�o���邩������Ȃ��B";
		mes "����ɔ����āA";
		mes "�ւ̑��Ǝ��͂ɐV��������";
		mes "����Ă��Ȃ����A�Ď�����K�v������B";
		next;
		menu "�����ł���",-;
		mes "[�z����]";
		mes "�������`���ė~�����B";
		next;
		if(select("��`��","���͖Z����") == 2) {
			mes "[�z����]";
			mes "�m���ɁA�������������ׂ����Ƃ�";
			mes "���ɂ��������񂠂�B";
			mes "�����̊Ԃ͊F�Z�������낤���A";
			mes "�����Ă����B";
			next;
			mes "[�z����]";
			mes "�Ď��ɂ��ẮA";
			mes "�������񎄂����̕��ł�邩��A";
			mes "�肪�󂢂Ă���ł���������";
			mes "��`���Ă��ꂽ�珕����B";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		}
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���ŏ������Ă���Ă��肪�Ƃ��B";
		mes "�ł́A���Ԃ��ɂ�������";
		mes "�����ɊĎ����@���c�_���悤�B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�ЂƂ܂��A�ւ̑��̓����̊Ď���";
		mes "��X�A�[�E�B�������n�ōs���Ƃ��āA";
		mes "���Ɍ��n�ɒS����z�u���Ă���B";
		mes "���ɁA�ւ̑��̎��͂̒n���";
		mes "�V������������Ă��Ȃ�����";
		mes "�Ď������肾���c�c�B";
		next;
		mes "[�z����]";
		mes "���ɉ�X��";
		mes "�ւ̑�����n��܂ł̒n�Ղ��ア�ꏊ��";
		mes "���J�����􂢏グ�Đ������Ă���B";
		mes "�E�o�����@��Ȃ狰�炭";
		mes "�����Ɍ@�邾�낤�Ƃ����ꏊ���B";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "�����ł����B�������ł��ˁB",-;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "����قǂł��Ȃ��B";
		next;
		mes "[�z����]";
		mes "����ł��B";
		mes "�������Ď����Ȃ�����Ȃ�Ȃ��񂾂��A";
		mes "���̍�Ƃ������Đl������Ȃ��āA";
		mes "�����Ă����񂾁B";
		mes "����ŁA�`���҂�";
		mes "��`���Ăق������Ă킯���B";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "��������x����Ă���΂����ł����H",-;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�ہA������^0000cd�풓^000000����K�v������B";
		next;
		cutin "ep19_iwin06.png", 255;
		emotion 23,"";	// self
		menu "�풓�ł����c�c",-;
		cutin "ep19_iwin08.png", 2;
		mes "[�z����]";
		mes "���K�����������E�o�����@����";
		mes "�����o���Ă��邩������Ȃ��B";
		mes "�Ď����풓�����Ȃ���ɂ�";
		mes "�����Ȃ����낤�H";
		cloakoffnpc "���C�W�[#if19msdq";
		cloakoffnpc "�����P�A#if19msdq";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes strcharinfo(0)+"�I�I";
		mes "�����ɂ������B";
		mes "�Ď��C���ɏo��ƕ�����";
		mes "���ɗ����ߗ�����I";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�˂��A���A";
		mes "�E�o�����@����\��������ꏊ��";
		mes "�풓���Ȃ���Ď�������Č������H";
		mes "���̊����̒��ŁH";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "�������͊����ɋ���������v���B";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�����ɏZ��ł�l������";
		mes "�݂�Ȃ��������B";
		mes "���ꂪ�����Ȃ����Ă����́H";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "�����P�A�T�}�����A";
		mes "����Ȕ����ŉ��������Ă�́H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���͓��R�A";
		mes "���M���u������đ��������񂾂�B";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "�Ђ�`�I";
		mes "�����̃����P�A�T�}��";
		mes "�Ƃ��Ă��L�\�����B";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�����������O�́H";
		mes "�܊p�������Ă�����";
		mes "�ǂ����đO�͊J���Ă�́H";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "�����A����H";
		mes "�����đ̉���������ƍ�����ɁA";
		mes "���ꂵ���̂͋�肾����ˁB";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "���͂��ꂮ�炢�̓V�C����";
		mes "����Ȃ̒��Ȃ��Ă����v�����ǁA";
		mes "����l�̕������������邩��";
		mes "�����񂾂񂾂�B";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "��������ȓV�C�ɂ��̏ꏊ��";
		mes "���i�̊ό��q�̎p�ł�����";
		mes "����l�����̋C���������Ȃ�Ȃ��H";
		next;
		menu "������ƍ���܂���ˁB",-;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "����H";
		mes "���͑��l�̊ዅ�̉��x�܂Ŕz������";
		mes "���ꂵ���̂��䖝���Ă܂ł�";
		mes "������ł��񂾂�B";
		mes "���͂��ꂭ�炢�C�����Ɉ���l���B";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "��A�킩��������A����ȏ㒝��ȁB";
		mes "�b�𕷂������Ŕ��邩��c�c�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�Ƃ���ŁA���O�͕K�v���Ȃ��̂�";
		mes "�ǂ����Ď��ɕt���ė����񂾁H";
		mes "�����͂��Ȃ����āB";
		mes "�ǂ������̌��E��ʂ�₵�Ȃ��񂾂���B";
		mes "�����o���Ƃ��Ă�������Ȃ��B";
		mes "�Ď��͂��Ȃ��Ă�����B";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "�ȂɌ����Ă�́A";
		mes "���R�������ɗ����񂾂��B";
		mes "�������������P�A�T�}�������ŗ����́H";
		mes "�����n�����Č����������H";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "�c�c�����𗁂тɁB";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "�Z�l�L�I�K���h�c�c";
		mes "�w���₩�Ȑ����x�Ȃ��";
		mes "�Ԍ��t�̖��O�܂ł��Ă��񂾁B";
		mes strcharinfo(0)+"�̂��Ƃ��A";
		mes "�C�ɂȂ��Č��ɗ����񂶂�Ȃ��́H";
		next;
		mes "[���C�W�[]";
		mes "����Ƃ��A�Ԍ��t��";
		mes "������̕��̈Ӗ��������H";
		next;
		cutin "ep19_juncea02.png", 2;
		emotion 6,"�����P�A#if19msdq";
		mes "[�����P�A]";
		mes "���E���E���E���E�сE�ɁI";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "�����A�������B";
		mes "�����P�A�T�}�͗z�����K�v�������ˁB";
		mes "���̌��̒��łǂ�قǒ��������́H";
		mes "�N�����̕��ɗz������܂��񂩁H";
		next;
		cutin "ep19_juncea03.png", 2;
		emotion 7,"�����P�A#if19msdq";
		mes "[�����P�A]";
		mes "�c�c�B";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "�Ƃ���ŁA�ǂ�����";
		mes "�݂�Ȃ����ɏW�܂��ė����񂾁H";
		mes "�Ď�����`���ɗ����̂��H";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "�����A�������B";
		mes "�����̃����P�A�T�}��";
		mes "�Ď��̖��ɗ��������ȕ���";
		mes "������񂾁B";
		mes "�����n���ɂ������Ă킯�B";
		mes "�����A��������͐��Ƃ��������āB";
		next;
		mes "[���C�W�[]";
		mes "�������ɂ���l������";
		mes "�S���Ȋw�Ȃǒm��Ȃ��l����������ȁA";
		mes "�������܂ꂽ�V�����ɂ�������悤��";
		mes "�₳���������𗊂ނ�B";
		mes "������[�B";
		next;
		cutin "ep19_juncea03.png", 2;
		emotion 7,"�����P�A#if19msdq";
		mes "[�����P�A]";
		mes "�����c�c�ق�Ƃ��ɂ₾�c�c";
		mes "�����c�c�B";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "���K�������̑���";
		mes "���͂����܂�c���Ă��Ȃ��������āA";
		mes "���Ȃ��ɋ��������Ƃ͊o���Ă�H";
		mes "������t�ɗ��p���鑕�u���������B";
		next;
		mes "[�����P�A]";
		mes "���K���̎��ŗL�̖��͔g��������";
		mes "���m������̂Ȃ񂾂��ǁA";
		mes "�����������ӂɖ��߂Ă����́B";
		mes "���K�������u�̋߂��Ɍ��ꂽ��";
		mes "���̖��͔g����⑫����";
		mes "������֐M���𑗂��Ă����B";
		next;
		mes "[�����P�A]";
		mes "���߂��ꏊ�̍��W�������邩��A";
		mes "�߂��őҋ@���Ă����l������";
		mes "�����ɑΉ��ł���͂���B";
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "��������K�������ꂻ���ȏꏊ��";
		mes "���߂��炢���Ƃ������ƁH";
		next;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�����B���������_������B";
		mes "�������ׂȂ��Ƃ����H";
		mes "�o�b�e���[�̗L�����Ԃ����������Ȃ��B";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���̊����ł����܂ł��̂́A";
		mes "�������Z�p�炵����B";
		mes "�����P�A�T�}�������������B";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�c�c�B";
		next;
		switch(select("�������I","�����������K�v�Ƃ������Ƃł��ˁH")) {
		case 1:
			cutin "ep19_juncea02.png", 2;
			mes "[�����P�A]";
			mes "�c�c�I";
			mes "���肪�Ƃ��c�c�B";
			break;
		case 2:
			cutin "ep19_juncea01.png", 2;
			mes "[�����P�A]";
			mes "�����������ƁB";
			break;
		}
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "24���ԓ����ꏊ�ɑҋ@����";
		mes "�Ď����邱�Ƃɔ�ׂ�΁A";
		mes "�����������邱�ƂȂ�č��ׂȎ����B";
		mes "���肪�Ƃ��B���̂������������B";
		mes "���A�ŊĎ��Ɏg���\�肾�����l���́A";
		mes "���̂Ƃ���֓����ł������B";
		next;
		menu "�܂�ŊL�k�݂����Ȍ`�ł���",-;
		cutin "ep19_juncea01.png", 2;
		mes "[�����P�A]";
		mes "�������Ȃ��Ƌ߂��̐���������";
		mes "�����������Ă��܂�����ȁB";
		mes "�������l�������B";
		mes "���݂ɖ��O�͎����t�����񂶂�Ȃ����B";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���O�͎����t���܂����I";
		mes "^0000cd�����͐G�p^000000�I";
		mes "�{���ɂ����������I����Ȃ��H";
		mes "�N�ł������΂����킩��悤��";
		mes "�������l���Ă���ɂ����񂾁B";
		next;
		switch(select("�Z���X�������c�c","�f���炵��")) {
		case 1:
			cutin "ep19_juncea01.png", 2;
			mes "[�����P�A]";
			mes "�C��������ˁA"+strcharinfo(0)+"�B";
			mes "������B";
			next;
			cutin "ep19_iwin06.png", 1;
			mes "[�z����]";
			mes "���񂽂͖��t���e�ɂ͂Ȃ�Ȃ��ق���";
			mes "�悳�������ȁB";
			next;
			cutin "ep19_leizi01.png", 0;
			mes "[���C�W�[]";
			mes "�ӂ�I";
			mes "�����P�A�T�}�Ȃ�HSF-001�݂�����";
			mes "���O��t��������I�I";
			break;
		case 2:
			cutin "ep19_juncea01.png", 2;
			mes "[�����P�A]";
			mes strcharinfo(0)+"�c�c�I�H";
			break;
		}
		next;
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "�Ƃɂ����A";
		mes "�����Ă���Ė{���ɂ��肪�Ƃ��B";
		mes "���������Ŏ蕪�����đ������߂悤�B";
		mes "�`���҂�^0000cd6�J��^000000�𗊂ށB";
		next;
		cutin "ep19_iwin06.png", 255;
		menu "������܂���",-;
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "�ł́A<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>��";
		mes "<URL>���ĕt�����؂̕X��<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>��";
		mes "�n�}�Ƀ��������Ă���������A";
		mes "���̏ꏊ�ɂ���𖄂߂Ă��Ă���B";
		mes "�������K���������p�ɂɌ����ꏊ���B";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "�����Ă�����Ⴂ�I�I";
		next;
		cutin "ep19_juncea03.png", 2;
		mes "[�����P�A]";
		mes "���A�C��t���Ă����Ȃ����B";
		setquest 17650;
		compquest 17650;
		close2;
		showevent 0, 3, "�z����#ep19_dq_dowsing";	// 2777: 27, 126
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(checkitemblank() < 2) {
		cutin "ep19_leizi01.png", 255;
		mes "�]�ו�������ȏ㎝�Ă܂���";
		mes "�@�ו���2�ȏ�̋󂫂�";
		mes "�@����Ă��������]";
		close2;
		cutin "kafra_01.bmp", 255;
		end;
	}
	if(checkquest(17650)&8) {
		cutin "ep19_iwin06.png", 1;
		mes "[�z����]";
		mes "���ꂶ�Ⴀ�A";
		mes "�����͐G�p���������Ă��Ă���邩�H";
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̕���)") == 2) {
			mes "[�~�~���K���h]";
			mes "���n�܂ő����Ă�낤�B";
			mes "�Ⴋ�i�Ղ�A";
			mes "��������Ǝd�������Ȃ��񂾂��B";
			close2;
			//cutin "kafra_01.bmp", 255;
			warp '@map$, 113, 12;
			end;
		}
		mes "�N�G�X�g�̎󒍂�񍐁A";
		mes "���������\�ł��B";
		next;
		set '@str$," �n�ォ��̉B�ꏈ�T��";
		set '@flag,( (countitem(1000707) >= 5)? 1: 0) + ( (checkquest(18139)&4)? 2: 0);
		if('@flag < 3) {
			if('@flag) {
				set '@str$,
					"[^ff0000�[�i"+( ('@flag&1)? "��": "�~")+
					"�E����"+( ('@flag&2)? "��": "�~")+
					"^000000]" +'@str$;
			}
			else
				set '@str$,"[^ff0000���풆^000000]" +'@str$;
			set '@menu,select("�S�ĕ񍐂���",'@str$,"�S�Ď󒍂���","�S�Ĕj������");
			// menu�̓���ւ�
			setarray '@selecter[1],2,3,1,4;
			set '@menu,'@selecter['@menu];
		}
		else {
			if('@flag == 3)
				set '@str$,"[^ff0000�񍐉�^000000]" +'@str$;
			else if(!checkquest(18140) || checkquest(18140)&2)
				set '@str$,"[�󒍉�]" +'@str$;
			else if(checkquest(18140))
				set '@str$,"[^888888���Ԑ�����^000000]" +'@str$;
			set '@menu,select("�S�Ď󒍂���","�S�ĕ񍐂���",'@str$,"�S�Ĕj������");
		}
		switch('@menu) {
		case 1:
			mes "^ff0000[�C���t�H���[�V����]";
			mes "���݁A�󒍉\�ȕ\���̃N�G�X�g��";
			mes "�S�Ĉꊇ�Ŏ󒍂��邱�Ƃ��o���܂��B";
			mes "�N�G�X�g�̈ꊇ�󒍂��s���܂����H^000000";
			next;
			if(select("�ꊇ�󒍂��s��","��߂�") == 2) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			setarray '@q_name$,"�n�ォ��̉B�ꏈ�T��";
			setarray '@questlist,17651;
			setarray '@coollist,17662;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: �N�G�X�g���󂯂Ă��Ȃ��A���N�[���^�C�������ĂȂ����N�[���^�C�������Ȃ��
				if( checkquest('@questlist['@i]) == 0 && (checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@setquest[getarraysize('@setquest)],'@i;
			}
			if(getarraysize('@setquest) == 0) {
				mes "[�C���t�H���[�V����]";
				mes "�󒍉\�ȃN�G�X�g�����݂��܂���B";
				close;
			}
			mes "<<B>�N�G�X�g</B>>";
			for(set '@i,0; '@i < getarraysize('@setquest); set '@i,'@i+1) {
				setquest '@questlist['@setquest['@i]];
				mes "�u^ff0000" +'@q_name$['@setquest['@i]]+ "^000000�v";
			}
			mes "���󒍂��܂����B";
			close;
		case 2:
			mes "^ff0000[�C���t�H���[�V����]";
			mes "�N�G�X�g�B���̏�����";
			mes "�����X�^�[�����E�A�C�e���[�i��";
			mes "�����ꂩ1�̏ꍇ�A";
			mes "�ǂ���̏������������Ă���ꍇ��";
			mes "�����X�^�[������D�悵�ĕ񍐂��܂��B";
			mes "���̏ꍇ�A�A�C�e���͔[�i����܂���B";
			next;
			mes "[�C���t�H���[�V����]";
			mes "�񍐉\�ȃN�G�X�g��S�Ĉꊇ��";
			mes "�񍐂��邱�Ƃ��o���܂��B";
			mes "�N�G�X�g�̈ꊇ�񍐂��s���܂����H";
			next;
			if(select("�ꊇ�񍐂��s��","��߂�") == 2) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			setarray '@q_name$,"���ʂȐ�������";
			setarray '@questlist,17651;
			setarray '@coollist,17662;
			setarray '@gainlist,1000608,2;
			setarray '@explist,375000000,275000000;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: �N�G�X�g���󂯂Ă��ē����ς݁A���A�C�e�����X�g�ݒ肪����Ȃ玝���Ă���Ε�
				if( checkquest('@questlist['@i]) && (checkquest('@questlist['@i])&4) && ('@itemlist['@i*2] == 0 || countitem('@itemlist['@i*2]) >= '@itemlist['@i*2+1]) ) {
					set '@repoquest[getarraysize('@repoquest)],'@i;
					set '@count,'@count + '@itemlist['@i*2+1];
				}
			}
			if(getarraysize('@repoquest) == 0) {
				mes "[�C���t�H���[�V����]";
				mes "�񍐉\�ȃN�G�X�g�����݂��܂���B";
				close;
			}
			mes "^ff0000[�C���t�H���[�V����]";
			mes "�N�G�X�g�B���̏�����";
			mes "�����X�^�[�����E�A�C�e���[�i��";
			mes "�����ꂩ1�̏ꍇ�A";
			mes "�ǂ���̏������������Ă���ꍇ��";
			mes "�����X�^�[������D�悵�ĕ񍐂��܂��B";
			mes "���̏ꍇ�A�A�C�e���͔[�i����܂���B";
			next;
			if('@count) {
				mes "<<B>�[�i�A�C�e��</B>>";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
					mes "�A�C�e���F<ITEM>" +getitemname('@itemlist['@repoquest['@i]*2])+ "<INFO>" +'@itemlist['@repoquest['@i]*2]+ "</INFO></ITEM>�@" +'@itemlist['@repoquest['@i]*2+1]+ "��";
				}
				mes "������̃A�C�e����[�i���Ă�";
				mes "��낵���ł����H";
				next;
				if(select("��߂�","�ꊇ�񍐂ɐi��") == 1) {
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close;
				}
			}
			mes "[�C���t�H���[�V����]";
			mes "�񍐉\�ȃN�G�X�g��S�Ĉꊇ��";
			mes "�񍐂��邱�Ƃ��o���܂��B";
			mes "�N�G�X�g�̈ꊇ�񍐂��s���܂����H";
			next;
			if(select("�ꊇ�񍐂��s��","��߂�") == 2) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			mes "<<B>�N�G�X�g</B>>";
			for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
				delitem '@itemlist['@repoquest['@i]*2],'@itemlist['@repoquest['@i]*2+1];
				delquest '@questlist['@repoquest['@i]];
				setquest '@coollist['@repoquest['@i]];
				getitem '@gainlist['@repoquest['@i]*2],'@gainlist['@repoquest['@i]*2+1];
				set '@count2,'@count2 + '@gainlist['@repoquest['@i]*2+1];
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp '@explist['@repoquest['@i]*2],0,0;
					set '@baseexp,'@baseexp + '@explist['@repoquest['@i]*2];
				}
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp 0,'@explist['@repoquest['@i]*2+1],0;
					set '@jobexp,'@jobexp + '@explist['@repoquest['@i]*2+1];
				}
				mes "�u^ff0000" +'@q_name$['@repoquest['@i]]+ "^000000�v";
			}
			mes "�̕񍐂��������܂����B";
			// TODO:EXP���\�L
			if('@baseexp) {
				next;
				set '@exp$,EXP_SEPFIX('@baseexp);
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp " +'@exp$;
				mes "( " +'@baseexp+" )";
				mes "��BaseExp���󂯎��܂����B";
			}
			if('@jobexp) {
				next;
				set '@exp$,EXP_SEPFIX('@jobexp);
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp " +'@exp$;
				mes "( " +'@jobexp+" )";
				mes "��JobExp���󂯎��܂����B";
			}
			if('@count2) {
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1)
					mes "�A�C�e���F<ITEM>" +getitemname('@gainlist['@repoquest['@i]*2])+ "<INFO>" +'@gainlist['@repoquest['@i]*2]+ "</INFO></ITEM>�@" +'@gainlist['@repoquest['@i]*2+1]+ "��";
				mes "���l�����܂����B";
			}
			close;
		case 3:
			if(checkquest(18139)) {
				if('@flag < 3) {
					mes "[�~�~���K���h]";
					mes "����킵��<URL>���n���K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>��";
					mes "<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>����";
					mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
					mes "5������Ă��Ȃ����B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���ʂȐ�������^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 2) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close;
					}
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�n�ォ��̉B�ꏈ�T��^000000�v";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 7.5G ( 7500000000 )";
				mes "��375000000��20��󂯎��܂��B";
				mes "JobExp 5.5G ( 5500000000 )";
				mes "��275000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�n�ォ��̉B�ꏈ�T��^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close;
				}
				delquest 17651;
				delquest 17661;
				setquest 17662;
				getitem 1000608,2;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 375000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,275000000,0;
				cutin "ep19_iwin06.png", 2;
				mes "[�z����]";
				mes "�`���ҁA�������B";
				mes "����J�l�B��Ƃ͏������������H";
				mes "�����͂����x��ł���B";
				mes "�����܂���Ƃ𗊂ށB";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 7.5G";
				mes "( 7500000000 )";
				mes "��375000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 5.5G";
				mes "( 5500000000 )";
				mes "��275000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(17662)) {
				if(!(checkquest(17662)&2)) {
					cutin "ep19_iwin06.png", 2;
					mes "[�z����]";
					mes "�`���ҁA�x�߂����H";
					mes "�����͐G�p�𖄂߂��Ƃ́A";
					mes "�S�z���Ȃ��Ă������B";
					mes "�܂��o�b�e���[�����d�����܂�";
					mes "���Ԃ����邩������Ƌx��ł���B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�n�ォ��̉B�ꏈ�T��^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			cutin "ep19_iwin06.png", 2;
			mes "[�z����]";
			mes "�����͐G�p�̃o�b�e���[��";
			mes "���d�����O�Ɍ�ւ������B";
			next;
			mes "[�z����]";
			mes "<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2_</INFO></URL>��";
			mes "<URL>���ĕt�����؂̕X��<INFO>https://rotool.gungho.jp/map/jor_back3_</INFO></URL>��";
			mes "���ꂼ��3�J�����ɁA";
			mes "<ITEM>[�����͐G�p]<INFO>1000842</INFO></ITEM>�𖄂߂Ă��Ăق����B";
			mes "��`���Ă���邩�H";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�n�ォ��̉B�ꏈ�T��^000000�v";
			mes "���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				cutin "ep19_iwin06.png", 2;
				mes "[�z����]";
				mes "��`���̒��f���H";
				mes "�킩�����B";
				mes "���Ԃ��ł�����A��낵�����ށB";
				next;
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 17651;
			getitem 1000842,6;
			if(checkquest(17662)&2)
				delquest 17662;
			cutin "ep19_iwin06.png", 2;
			mes "[�z����]";
			mes "��낵���A���ށB";
			next;
			//showevent 0, 2, "�z����#ep19_dq_dowsing";	// 2777: 27, 126
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�n�ォ��̉B�ꏈ�T��^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 4:
			mes "^ff0000[�C���t�H���[�V����]";
			mes "���݁A���풆�\���̃N�G�X�g��";
			mes "�S�Ĉꊇ�Ŕj�����邱�Ƃ��o���܂��B";
			mes "�񍐉A���Ԑ������̃N�G�X�g��";
			mes "�j���̏������s���܂���B";
			mes "�N�G�X�g�̈ꊇ�j�����s���܂����H^000000";
			next;
			if(select("��߂�","�S�Ĕj������") == 1) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			setarray '@q_name$,"�n�ォ��̉B�ꏈ�T��";
			setarray '@questlist,17651;
			setarray '@coollist,17662;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: �N�G�X�g���󂯂Ă��ē����������Ă��Ȃ��A���N�[���^�C�������ĂȂ����N�[���^�C�������Ȃ�j��
				if( checkquest('@questlist['@i]) && !(checkquest('@questlist['@i]&4)) &&
					(checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@delquest[getarraysize('@delquest)],'@i;
			}
			if(getarraysize('@delquest) == 0) {
				mes "[�C���t�H���[�V����]";
				mes "�j���o����N�G�X�g�����݂��܂���B";
				close;
			}
			mes "<<B>�N�G�X�g</B>>";
			for(set '@i,0; '@i < getarraysize('@delquest); set '@i,'@i+1) {
				delquest '@questlist['@delquest['@i]];
				mes "�u^ff0000" +'@q_name$['@delquest['@i]]+ "^000000�v";
			}
			mes "��j�����܂����B";
			close;
		}
	}
	function EXP_SEPFIX {
		set '@num$,getarg(0);
		set '@len,getstrlen('@num$);
		set '@type,('@len >= 10)? 0: (('@len >= 7)? 1: (('@len >= 4)? 2: 3) );
		setarray '@sep,9,6,3,0;
		setarray '@c$,"G","M","K","";
		for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
			if(substr('@num$,-1) == "0") {
				set '@num$,substr('@num$,0,-1);
			}
			else
				break;
		}
		return substr('@num$,0,('@len - '@sep['@type])) +"."+ substr('@num$,('@len - '@sep['@type])) +'@c$['@type];
	}

OnInit:
	cloakonnpc;
	end;
}

jor_back2_.gat,222,123,7	script	�w�����ꂽ�ꏊ#e19ms00	10432,{/* 6043 */
	for(set '@i,0; '@i < 6; set '@i,'@i+1) {
		if(checkquest(17652+'@i))
			'@j++;
	}
	if(checkquest(17661)) {
		mes "�]6�J�����ׂĂɒ����͐G�o�𖄂߂��B";
		mes "�@�z�����̌��ւ��ǂ낤�]";
		close;
	}
	set '@num,substr(strnpcinfo(0),-1);
	set '@quest,17652+'@num;
	if(checkquest('@quest)) {
		mes "�]�����͐G�o�𖄂ߏI�����B";
		mes "�@���̏ꏊ�ɍs�����]";
		close;
	}
	mes "�]�w�����ꂽ�ꏊ�͂����̂悤���B";
	mes "�@�����͐G�o�𖄂߂悤�]";
	next;
	misceffect 101;
	progressbar 1;	//color=0xffff00
	misceffect 18;
	next;
	setquest '@quest;
	compquest '@quest;
	delitem 1000842,1;
	//showevent 9999, 0, "�w�����ꂽ�ꏊ#e19ms01";	// 6043: 222, 123
	if('@j == 5) {
		//showevent 9999, 0, "�w�����ꂽ�ꏊ#e19ms02";	// 6044: 49, 175
		//@showevent 0, 3;	// 6045: 308, 99
		setquest 17661;
		setquest 17652;
		delquest 17652;
		setquest 17653;
		delquest 17653;
		setquest 17654;
		delquest 17654;
		setquest 17655;
		delquest 17655;
		setquest 17656;
		delquest 17656;
		setquest 17657;
		delquest 17657;
		mes "�]6�J�����ׂĂɒ����͐G�o�𖄂߂��B";
		mes "�@�z�����̌��ւ��ǂ낤�]";
		close;
	}
	mes "�]�����͐G�o�𖄂ߏI�����B";
	mes "�@���̏ꏊ�ɍs�����]";
	close;
}

jor_back2_.gat,49,175,7		duplicate(�w�����ꂽ�ꏊ#e19ms00)	�w�����ꂽ�ꏊ#e19ms01	10432	/* 6044 */
jor_back2_.gat,308,99,7		duplicate(�w�����ꂽ�ꏊ#e19ms00)	�w�����ꂽ�ꏊ#e19ms02	10432	/* 6045 */
jor_back3_.gat,152,359,7	duplicate(�w�����ꂽ�ꏊ#e19ms00)	�w�����ꂽ�ꏊ#e19ms03	10432	/* 6046 */
jor_back3_.gat,328,277,7	duplicate(�w�����ꂽ�ꏊ#e19ms00)	�w�����ꂽ�ꏊ#e19ms04	10432	/* 6047 */
jor_back3_.gat,128,138,7	duplicate(�w�����ꂽ�ꏊ#e19ms00)	�w�����ꂽ�ꏊ#e19ms05	10432	/* 6048 */

jor_nest.gat,34,79,5	script	�~�~���K���h#ep19r	10473,{/* 2792 */
	function EXP_SEPFIX;

	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�~�~���K���h]";
		mes "���̐��ӋC�Ȑl�Ԃ͉����H";
		mes "�߂��ē����I";
		close2;
		misceffect 1,"";	// self
		end;
	}
	if(EP19_1QUE < 22) {
		mes "[�~�~���K���h]";
		mes "�ӂށB";
		mes "�s�M�҂����͒m��Ȃ����낤�H";
		mes "���������K���h�l�̉��b���c�c�B";
		next;
		mes "^e6328c�]���̃N�G�X�g��i�s����ɂ�";
		mes "^e6328c�@�ȉ��̏����𖞂����K�v������܂��]";
		mes "^e6328c�@�EBaseLv220�ȏ�";
		mes "^e6328c�@�E�N�G�X�g�u���b�̒n�v��r���܂ŃN���A";
		mes "�@^000000";
		mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
	if(checkquest(18138)&8) {
		mes "[�~�~���K���h]";
		mes "�Ⴋ�i�Ղ�B";
		mes "���������c�̂��߂ɐs�����Ă݂Ȃ����H";
		mes "�_���Ȃ�J���̋`����";
		mes "�ʂ����Ƃ����Ӗ����B";
		set '@str$,"�_���W�����Ɉړ�����(�֐_�̉����� 01" +((EP19_1QUE < 68)? "(�N�G�X�g)": "")+ ")";
		set '@map$,"jor_dun01" +((EP19_1QUE < 68)? "": "_")+ ".gat";
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��",'@str$) == 2) {
			mes "[�~�~���K���h]";
			mes "���n�܂ő����Ă�낤�B";
			mes "�Ⴋ�i�Ղ�A";
			mes "��������Ǝd�������Ȃ��񂾂��B";
			close2;
			//cutin "kafra_01.bmp", 255;
			warp '@map$, 113, 12;
			end;
		}
		mes "�N�G�X�g�̎󒍂�񍐁A";
		mes "���������\�ł��B";
		next;
		set '@str$," ���ʂȐ�������";
		set '@flag,( (countitem(1000707) >= 5)? 1: 0) + ( (checkquest(18139)&4)? 2: 0);
		if('@flag < 3) {
			if('@flag) {
				set '@str$,
					"[^ff0000�[�i"+( ('@flag&1)? "��": "�~")+
					"�E����"+( ('@flag&2)? "��": "�~")+
					"^000000]" +'@str$;
			}
			else
				set '@str$,"[^ff0000���풆^000000]" +'@str$;
			set '@menu,select("�S�ĕ񍐂���",'@str$,"�S�Ď󒍂���","�S�Ĕj������");
			// menu�̓���ւ�
			setarray '@selecter[1],2,3,1,4;
			set '@menu,'@selecter['@menu];
		}
		else {
			if('@flag == 3)
				set '@str$,"[^ff0000�񍐉�^000000]" +'@str$;
			else if(!checkquest(18140) || checkquest(18140)&2)
				set '@str$,"[�󒍉�]" +'@str$;
			else if(checkquest(18140))
				set '@str$,"[^888888���Ԑ�����^000000]" +'@str$;
			set '@menu,select("�S�Ď󒍂���","�S�ĕ񍐂���",'@str$,"�S�Ĕj������");
		}
		switch('@menu) {
		case 1:
			mes "^ff0000[�C���t�H���[�V����]";
			mes "���݁A�󒍉\�ȕ\���̃N�G�X�g��";
			mes "�S�Ĉꊇ�Ŏ󒍂��邱�Ƃ��o���܂��B";
			mes "�N�G�X�g�̈ꊇ�󒍂��s���܂����H^000000";
			next;
			if(select("�ꊇ�󒍂��s��","��߂�") == 2) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			setarray '@q_name$,"���ʂȐ�������";
			setarray '@questlist,18139;
			setarray '@coollist,18140;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: �N�G�X�g���󂯂Ă��Ȃ��A���N�[���^�C�������ĂȂ����N�[���^�C�������Ȃ��
				if( checkquest('@questlist['@i]) == 0 && (checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@setquest[getarraysize('@setquest)],'@i;
			}
			if(getarraysize('@setquest) == 0) {
				mes "[�C���t�H���[�V����]";
				mes "�󒍉\�ȃN�G�X�g�����݂��܂���B";
				close;
			}
			mes "<<B>�N�G�X�g</B>>";
			for(set '@i,0; '@i < getarraysize('@setquest); set '@i,'@i+1) {
				setquest '@questlist['@setquest['@i]];
				mes "�u^ff0000" +'@q_name$['@setquest['@i]]+ "^000000�v";
			}
			mes "���󒍂��܂����B";
			close;
		case 2:
			mes "^ff0000[�C���t�H���[�V����]";
			mes "�N�G�X�g�B���̏�����";
			mes "�����X�^�[�����E�A�C�e���[�i��";
			mes "�����ꂩ1�̏ꍇ�A";
			mes "�ǂ���̏������������Ă���ꍇ��";
			mes "�����X�^�[������D�悵�ĕ񍐂��܂��B";
			mes "���̏ꍇ�A�A�C�e���͔[�i����܂���B";
			next;
			mes "[�C���t�H���[�V����]";
			mes "�񍐉\�ȃN�G�X�g��S�Ĉꊇ��";
			mes "�񍐂��邱�Ƃ��o���܂��B";
			mes "�N�G�X�g�̈ꊇ�񍐂��s���܂����H";
			next;
			if(select("�ꊇ�񍐂��s��","��߂�") == 2) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			setarray '@q_name$,"���ʂȐ�������";
			setarray '@questlist,18139;
			setarray '@coollist,18140;
			setarray '@itemlist,1000707,5;
			setarray '@gainlist,1000608,3;
			setarray '@explist,410000000,310000000;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: �N�G�X�g���󂯂Ă��ē����ς݁A���A�C�e�����X�g�ݒ肪����Ȃ玝���Ă���Ε�
				if( checkquest('@questlist['@i]) && (checkquest('@questlist['@i])&4) && ('@itemlist['@i*2] == 0 || countitem('@itemlist['@i*2]) >= '@itemlist['@i*2+1]) ) {
					set '@repoquest[getarraysize('@repoquest)],'@i;
					set '@count,'@count + '@itemlist['@i*2+1];
				}
			}
			if(getarraysize('@repoquest) == 0) {
				mes "[�C���t�H���[�V����]";
				mes "�񍐉\�ȃN�G�X�g�����݂��܂���B";
				close;
			}
			mes "^ff0000[�C���t�H���[�V����]";
			mes "�N�G�X�g�B���̏�����";
			mes "�����X�^�[�����E�A�C�e���[�i��";
			mes "�����ꂩ1�̏ꍇ�A";
			mes "�ǂ���̏������������Ă���ꍇ��";
			mes "�����X�^�[������D�悵�ĕ񍐂��܂��B";
			mes "���̏ꍇ�A�A�C�e���͔[�i����܂���B";
			next;
			if('@count) {
				mes "<<B>�[�i�A�C�e��</B>>";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
					mes "�A�C�e���F<ITEM>" +getitemname('@itemlist['@repoquest['@i]*2])+ "<INFO>" +'@itemlist['@repoquest['@i]*2]+ "</INFO></ITEM>�@" +'@itemlist['@repoquest['@i]*2+1]+ "��";
				}
				mes "������̃A�C�e����[�i���Ă�";
				mes "��낵���ł����H";
				next;
				if(select("��߂�","�ꊇ�񍐂ɐi��") == 1) {
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close;
				}
			}
			mes "[�C���t�H���[�V����]";
			mes "�񍐉\�ȃN�G�X�g��S�Ĉꊇ��";
			mes "�񍐂��邱�Ƃ��o���܂��B";
			mes "�N�G�X�g�̈ꊇ�񍐂��s���܂����H";
			next;
			if(select("�ꊇ�񍐂��s��","��߂�") == 2) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			mes "<<B>�N�G�X�g</B>>";
			for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1) {
				delitem '@itemlist['@repoquest['@i]*2],'@itemlist['@repoquest['@i]*2+1];
				delquest '@questlist['@repoquest['@i]];
				setquest '@coollist['@repoquest['@i]];
				getitem '@gainlist['@repoquest['@i]*2],'@gainlist['@repoquest['@i]*2+1];
				set '@count2,'@count2 + '@gainlist['@repoquest['@i]*2+1];
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp '@explist['@repoquest['@i]*2],0,0;
					set '@baseexp,'@baseexp + '@explist['@repoquest['@i]*2];
				}
				for(set '@j,0; '@j < 20; set '@j,'@j+1) {
					getexp 0,'@explist['@repoquest['@i]*2+1],0;
					set '@jobexp,'@jobexp + '@explist['@repoquest['@i]*2+1];
				}
				mes "�u^ff0000" +'@q_name$['@repoquest['@i]]+ "^000000�v";
			}
			mes "�̕񍐂��������܂����B";
			// TODO:EXP���\�L
			if('@baseexp) {
				next;
				set '@exp$,EXP_SEPFIX('@baseexp);
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp " +'@exp$;
				mes "( " +'@baseexp+" )";
				mes "��BaseExp���󂯎��܂����B";
			}
			if('@jobexp) {
				next;
				set '@exp$,EXP_SEPFIX('@jobexp);
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp " +'@exp$;
				mes "( " +'@jobexp+" )";
				mes "��JobExp���󂯎��܂����B";
			}
			if('@count2) {
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1)
					mes "�A�C�e���F<ITEM>" +getitemname('@gainlist['@repoquest['@i]*2])+ "<INFO>" +'@gainlist['@repoquest['@i]*2]+ "</INFO></ITEM>�@" +'@gainlist['@repoquest['@i]*2+1]+ "��";
				mes "���l�����܂����B";
			}
			close;
		case 3:
			if(checkquest(18139)) {
				if('@flag < 3) {
					mes "[�~�~���K���h]";
					mes "����킵��<URL>���n���K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>��";
					mes "<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>����";
					mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
					mes "5������Ă��Ȃ����B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���ʂȐ�������^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 2) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close;
					}
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���ʂȐ�������^000000�v";
				mes "<���e1>";
				mes "�ΏہF<URL>���n���K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>�@10��";
				mes "�ΏہF<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>�@10��";
				mes "�̓�����";
				next;
				mes "<���e2>";
				mes "�A�C�e���F<ITEM>���K���̒ዉ���͊j<INFO>1000707</INFO></ITEM>�@5��";
				mes "�̔[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8.2G ( 8200000000 )";
				mes "��410000000��20��󂯎��܂��B";
				mes "JobExp 6.2G ( 6200000000 )";
				mes "��310000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���ʂȐ�������^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					// ������
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close;
				}
				delitem 1000707,5;
				delquest 18139;
				setquest 18140;
				getitem 1000608,3;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 410000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,310000000,0;
				mes "[�~�~���K���h]";
				mes "�����Ɏd������萋�����݂������ȁB";
				mes "�������ɓn���Ȃ����B";
				mes "���͊j�͏z�����Ȃ��Ⴂ���Ȃ��B";
				next;
				//showevent 9999, 0, "�~�~���K���h#ep19r";	// 2778: 34, 79
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8.2G";
				mes "( 8200000000 )";
				mes "��410000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6.2G";
				mes "( 6200000000 )";
				mes "��310000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
				mes "���l�����܂����B";
				close;
			}
			if(checkquest(18140)) {
				if(!(checkquest(18140)&2)) {
					mes "[�~�~���K���h]";
					mes "�Ⴋ�i�Ղ�B���O�ɂ�";
					mes "���̐M�k�����𗦂���`��������B";
					mes "���̒������������Ȃ���A";
					mes "���ׂ����Ƃ����猩�t���Ȃ����B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���ʂȐ�������^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close;
				}
			}
			mes "[�~�~���K���h]";
			mes "����킵��<URL>���n���K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>��";
			mes "<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>����";
			mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
			mes "5������Ă��Ȃ����B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���ʂȐ�������^000000�v";
			mes "<���e1>";
			// �~�X�X�y��
			mes "�ΏہF<URL>���n���K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>�@10��";
			mes "�ΏہF<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>�@10��";
			mes "�̓�����";
			next;
			mes "<���e2>";
			mes "�A�C�e���F<ITEM>���K���̒ዉ���͊j<INFO>1000707</INFO></ITEM>�@5��";
			mes "�̔[�i��";
			mes "�����̒B���ŕ񍐂��\�ł��B";
			mes "�N�G�X�g���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�~�~���K���h]";
				mes "���O�̎d�������d�����Ȃ��ȁB";
				next;
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			setquest 18139;
			delquest 18140;
			//showevent 0, 2, �~�~���K���h#ep19r;	// 2792: 34, 79
			mes "[�~�~���K���h]";
			mes "�����A���O�̎d�����ʂ����Ă���̂��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���ʂȐ�������^000000�v";
			mes "���󒍂��܂����B";
			close;
		case 4:
			mes "^ff0000[�C���t�H���[�V����]";
			mes "���݁A���풆�\���̃N�G�X�g��";
			mes "�S�Ĉꊇ�Ŕj�����邱�Ƃ��o���܂��B";
			mes "�񍐉A���Ԑ������̃N�G�X�g��";
			mes "�j���̏������s���܂���B";
			mes "�N�G�X�g�̈ꊇ�j�����s���܂����H^000000";
			next;
			if(select("��߂�","�S�Ĕj������") == 1) {
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close;
			}
			setarray '@q_name$,"���ʂȐ�������";
			setarray '@questlist,18139;
			setarray '@coollist,18140;
			for(set '@i,0; '@i < getarraysize('@questlist); set '@i,'@i+1) {
				//TODO: �N�G�X�g���󂯂Ă��ē����������Ă��Ȃ��A���N�[���^�C�������ĂȂ����N�[���^�C�������Ȃ�j��
				if( checkquest('@questlist['@i]) && !(checkquest('@questlist['@i]&4)) &&
					(checkquest('@coollist['@i]) == 0 || (checkquest('@coollist['@i])&2)) )
					set '@delquest[getarraysize('@delquest)],'@i;
			}
			if(getarraysize('@delquest) == 0) {
				mes "[�C���t�H���[�V����]";
				mes "�j���o����N�G�X�g�����݂��܂���B";
				close;
			}
			mes "<<B>�N�G�X�g</B>>";
			for(set '@i,0; '@i < getarraysize('@delquest); set '@i,'@i+1) {
				delquest '@questlist['@delquest['@i]];
				mes "�u^ff0000" +'@q_name$['@delquest['@i]]+ "^000000�v";
			}
			mes "��j�����܂����B";
			close;
		}
	}
	if(checkquest(18139)) {
		if(!(checkquest(18139) & 4)) {
			mes "[�~�~���K���h]";
			mes "�߈����ǂ��ɂ���̂����āH";
			mes "�Ⴋ�i�Ղ�A";
			mes "�����z����Ő��܂ꂽ�ƌ�������ȁH";
			next;
			mes "[�~�~���K���h]";
			mes "�����𖄂ߐs�����Ă���";
			mes "����킵���҂����̂��Ƃ�";
			mes "�����Ă�񂾂�B";
			mes "<URL>���n���K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>�A<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>������";
			mes "�ߐl�ł���A�S�~���ł���B";
			next;
			mes "[�~�~���K���h]";
			mes "�z����������āA";
			mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
			mes "5������邱�Ƃ��A���O�̎d�����B";
			close;
		}
		if(countitem(1000707) < 5) {
			//showevent 0, 2, �~�~���K���h#ep19r;	// 2792: 34, 79
			mes "[�~�~���K���h]";
			mes "�߈��ƃS�~���������͂�";
			mes "������邱�Ƃ��A�������̎d���Ȃ񂾁B";
			mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
			mes "5������Ă��Ȃ����B";
			close;
		}
		//showevent 0, 3, �~�~���K���h#ep19r;	// 2792: 34, 79
		mes "[�~�~���K���h]";
		mes "�����Ɏd������萋�����݂������ȁB";
		mes "�������ɓn���Ȃ����B";
		mes "���͊j�͏z�����Ȃ��Ⴂ���Ȃ��B";
		next;
		mes "[�~�~���K���h]";
		mes "���͊j���z������΁A";
		mes "�����Ƌ����Ȃ��񂶂�Ȃ������āH";
		mes "�����������Ƃ����蓾��B";
		mes "���ۂɂ������ɑ��݂��Ă��邾�낤�H";
		next;
		menu "�������K���̂��Ƃł����H",-;
		mes "[�~�~���K���h]";
		mes "�����A���܂ɒm�\������������������B";
		mes "�z��͘J�������Ȃ���A";
		mes "�߂����Ă���񂾂�B";
		next;
		mes "[�~�~���K���h]";
		mes "���Ƃ��Ă�������������H�ׂāA";
		mes "�����ɂȂ��ł͂Ȃ��B";
		mes "�e���A���܂���̉��b�ɂ��";
		mes "��̑傫�����قȂ�̂��B";
		next;
		mes "[�~�~���K���h]";
		mes "�C�ɐΈ�𓊂���Ƃ��āA";
		mes "�����ς��Ǝv�������H";
		mes "�������A�������΂ɎR������ē��ꂽ��A";
		mes "�Ⴄ���ʂɂȂ邾�낤�B";
		next;
		mes "[�~�~���K���h]";
		mes "���͂��Â�{�\�����c��A";
		mes "���݂���H���r�炵������";
		mes "��𖞂������҂����܂Ɍ����B";
		next;
		mes "[�~�~���K���h]";
		mes "�������A";
		mes "��̑傫�����ς�邱�Ƃ͂Ȃ��񂾁B";
		mes "������܂��A";
		mes "���܂���̉��b�̍��ł��낤�B";
		next;
		mes "[�~�~���K���h]";
		mes "�������A���X�K���h�l�́A";
		mes "����ȉ���킵���҂����܂�";
		mes "�~�ς�����@��";
		mes "�u���Ă���������̂�������Ȃ��B";
		mes "��V�I�ɉ��b�̑傫������Ă邱�Ƃ�";
		mes "�ł�����A����ȏ�ɖ]�ނ��Ƃ͂Ȃ��B";
		next;
		menu "���͊j�͉��Ɏg���܂����H",-;
		mes "[�~�~���K���h]";
		mes "���������҂���������ɂ́A";
		mes "�����K�v�Ȃ񂾁H";
		mes "�����A�H�����K�v�ɂȂ�B";
		next;
		mes "[�~�~���K���h]";
		mes "�������́A�����H���ɂ��Ă���񂾁B";
		mes "�ꕔ�̓��X�K���h�l�̌����Ɏg���A";
		mes "�ꕔ�͏�������͂��񕜂���̂�";
		mes "�g����B";
		next;
		mes "[�~�~���K���h]";
		mes "���O�����͂�������Ɗ�������A";
		mes "���͊j���z�����Ȃ����B";
		mes "�y�ɂȂ�B";
		next;
		if(checkitemblank() == 0) {
			// ������
			close;
		}
		if(countitem(1000707) < 5) {
			// �ă`�F�b�N�H������
			close;
		}
		delitem 1000707,5;
		setquest 18140;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		delquest 18139;
		setquest 18138;
		compquest 18138;
		getitem 1000608,3;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		for(set '@i,0; '@i < 20; set '@i,'@i+1) {
			getexp 410000000,0,0;
			getexp 0,310000000,0;
		}
		mes "[�~�~���K���h]";
		mes "�Ƃɂ����A";
		mes "���̎d������`���Ă���Ă��肪�Ƃ��B";
		mes "������܂�";
		mes "�i�Ղł��邨�O�̂�邱�Ƃł���B";
		mes "����J���܁B";
		close;
		//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
		//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
		//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
		//showevent 0, 1, ���K���勳#e19ms61;	// 2590: 53, 244
		//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
		//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
		//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
		//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
		//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
		//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
		//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
		//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
		//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
		//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
		//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
		//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
		//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
		//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
		//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
		//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
		//showevent 9999, 0, �~�~���K���h#ep19r;	// 2792: 34, 79
		//showevent 9999, 0, �V��������#ep19iwin07;	// 2824: 273, 23
		//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
		//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
		end;
	}
	mes "[�~�~���K���h]";
	mes "�ق��A";
	mes "���O������V�������܂ꂽ�i�Ջ����H";
	mes "������ɗ��č���Ȃ����B";
	mes "�b�𕷂����Ă����悤�B";
	next;
	mes "[�~�~���K���h]";
	mes "�ߍ��Ȋ��ł́A";
	mes "���ʂȐ���������������̂Ȃ񂾁B";
	mes "��������";
	mes "�̑�ȃ��������K���h�l�̖��͂��p���ҁB";
	next;
	mes "[�~�~���K���h]";
	mes "���������K���h�l�̖��́A";
	mes "���ꂪ�����Ӗ�����̂��m���Ă��邩�H";
	next;
	menu "�������̐����̌��I",-;
	mes "[�~�~���K���h]";
	mes "�悭�����Ȃ����B";
	mes "���đc�悽����";
	mes "���������K���h�l�̖��͂������Ă��āA";
	mes "���̃~�b�h�K���h�嗤���x�z�����B";
	next;
	mes "[�~�~���K���h]";
	mes "�������A�ׂȐl�Ԃ����̂������ɂ��A";
	mes "���������K���h�l�͕��󂳂�Ă��܂����B";
	mes "�����A���̏u�Ԃł������������K���h�l��";
	mes "�������ׂ̈ɁA";
	mes "����̑̂��c���Ă����������̂��B";
	next;
	mes "[�~�~���K���h]";
	mes "�����B���ꂱ�����C�X�K���h�ł���B";
	mes "�������̓��������K���h�l���ی삵��";
	mes "�Ō�̃��K���ł���";
	mes "���X�K���h�l�̌��ō������낵�A";
	mes "���������K���h�l�̎c�����̖̂��͂�";
	mes "��������B";
	next;
	mes "[�~�~���K���h]";
	mes "�������A���������K���h�l��";
	mes "�̂������o���Ă܂ł������������b��";
	mes "�������󂯎~�߂Ȃ�";
	mes "�S�~���݂����Ȏ҂������A";
	mes "���܂�Ă��܂����B";
	mes "���ꂪ�������邩�H";
	next;
	menu "�������K�������H",-;
	mes "[�~�~���K���h]";
	mes "���A���΂͎i�Ջ��ł���B";
	mes "�������������Ă��邶��Ȃ����B";
	mes "�����A";
	mes "���͂̉��b��";
	mes "�������󂯎~�߂Ȃ��҂����́A";
	mes "�S�~���ł���A�ߐl�ł���B";
	next;
	mes "[�~�~���K���h]";
	mes "�z��͏X���ɂ��A";
	mes "���݂��̖��͂��Â�A";
	mes "���㋉�Ȗ��͂𓾂悤�Ƃ���B";
	mes "�{���A���͂ւ̊��]��";
	mes "�S�Ẵ��K���������Ă�����̂����A";
	mes "�z��ɂ͌����������̂���B";
	next;
	mes "[�~�~���K���h]";
	mes "����Ȓዉ�ȓz�炪�A";
	mes "��؂Ȗ��͂��Â邱�Ƃ�";
	mes "����ȏ㌩�Ă͂����Ȃ��B";
	mes "�����ł��O�ɑ厖�ȔC������C���悤�B";
	next;
	mes "[�~�~���K���h]";
	mes "�ߐl�ƃS�~��������";
	mes "���������K���h�l�̖��͂�";
	mes "�������d�����B";
	next;
	mes "[�~�~���K���h]";
	mes "���������K���h�l�̎c�������͂�";
	mes "�����Ă���B";
	mes "����ȓz�炪�����Ă��Ă������͂ł�";
	mes "�Ȃ��񂾂�B";
	next;
	mes "[�~�~���K���h]";
	mes "���͂͌����Ă���A";
	mes "�����������i���A";
	mes "���������K���h�l�̈ӎv�A";
	mes "���X�K���h�l�̈ӎu���L�߂�ɂ́A";
	mes "��H�̖��͂��Q��ł��Ȃ��B";
	next;
	mes "[�~�~���K���h]";
	mes "�ߐl�������čs�������͂�������āA";
	mes "���K���̖����ׂ̈Ɏg�����ƁB";
	mes "���ꂪ���̎�������";
	mes "���ׂ����ƂȂ񂾂�B";
	next;
	mes "[�~�~���K���h]";
	mes "�����āA";
	mes "���O�̂悤�ɉ��b���󂯂Đ��܂ꂽ";
	mes "�q�������̂��߂ɂ��A";
	mes "���͂�������Ȃ���΂Ȃ�Ȃ��B";
	next;
	menu "�����E���ł͂Ȃ��H",-;
	mes "[�~�~���K���h]";
	mes "����ȃS�~���݂����Ȏ҂������A";
	mes "�����ƌ��􂷂��Ƃ͂Ȃ��B";
	mes "�z��͍߈����B";
	mes "�z��͂܂����т��B";
	mes "���b���󂯂Ă��Ȃ��߈��l����A";
	mes "���͂�������邱�Ƃ͓�����O�Ȃ��ƁB";
	next;
	mes "[�~�~���K���h]";
	mes "���ꂪ�X�̒n�Ɏ���ꂽ";
	mes "�������̐��������ł���B";
	mes "������Ⴋ�i�Ղ�B";
	mes "�s���čߐl���������f���A";
	mes "�z��̖��͂������ė����B";
	setquest 18139;
	close2;
	//showevent 9999, 0, ���K���i��#e19ms31;	// 2578: 185, 49
	//showevent 9999, 0, ���K���勳#e19ms41;	// 2584: 196, 202
	//showevent 9999, 0, ���K���勳#e19ms51;	// 2587: 115, 187
	//showevent 0, 1, ���K���勳#e19ms61;	// 2590: 53, 244
	//showevent 9999, 0, #e19ms71;	// 2594: 22, 141
	//showevent 9999, 0, �����P�A#e19ms71;	// 2595: 22, 141
	//showevent 9999, 0, �o�S�b�g#e19ms71;	// 2596: 26, 142
	//showevent 9999, 0, ���K���i��#e19ms81;	// 2600: 23, 58
	//showevent 9999, 0, ���C�W�[#e19ms71;	// 2606: 87, 164
	//showevent 9999, 0, ���C�W�[#e19ms91;	// 2608: 24, 252
	//showevent 9999, 0, ���C�W�[#ep19re1;	// 2661: 127, 207
	//showevent 9999, 0, ���ނ̎R#ep19re1;	// 2662: 19, 142
	//showevent 9999, 0, ���ނ̎R#ep19re2;	// 2664: 21, 195
	//showevent 9999, 0, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260
	//showevent 9999, 0, ���K���x����#ep19re1;	// 2672: 173, 177
	//showevent 9999, 0, ���ނ̎R#ep19re5;	// 2674: 181, 173
	//showevent 9999, 0, �����P�A#ep19re1;	// 2675: 31, 140
	//showevent 9999, 0, ���m��ʔ�#ep19re1;	// 2682: 19, 190
	//showevent 9999, 0, ��̎�����#ep19re1;	// 2683: 20, 194
	//showevent 9999, 0, ���K��#ep19re1;	// 2684: 24, 185
	//showevent 0, 2, �~�~���K���h#ep19r;	// 2792: 34, 79
	//showevent 9999, 0, �V��������#ep19iwin07;	// 2824: 273, 23
	//showevent 9999, 0, ���[�v#whl;	// 2958: 22, 255
	//showevent 9999, 0, �A������#ep19re2;	// 2960: 63, 257
	cutin "ep18_miriam_01.png", 255;
	end;

	function EXP_SEPFIX {
		set '@num$,getarg(0);
		set '@len,getstrlen('@num$);
		set '@type,('@len >= 10)? 0: (('@len >= 7)? 1: (('@len >= 4)? 2: 3) );
		setarray '@sep,9,6,3,0;
		setarray '@c$,"G","M","K","";
		for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
			if(substr('@num$,-1) == "0") {
				set '@num$,substr('@num$,0,-1);
			}
			else
				break;
		}
		return substr('@num$,0,('@len - '@sep['@type])) +"."+ substr('@num$,('@len - '@sep['@type])) +'@c$['@type];
	}
}

jor_nest.gat,37,75,1	script	�x���x���K���h#ep19r	10470,{/* 2793 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�x���x���K���h]";
		mes "���̐l�Ԃ��ĂȂɁH";
		mes "���̕s�M�҂������߂܂��Ă����҂��H";
		mes "�����͌N�̎d����ł͂Ȃ��B";
		mes "�o�Ă��I";
		close;
	}
	if(EP19_1QUE >= 68)	{
		mes "[�x���x���K���h]";
		mes "����H�����Q�����������āH";
		mes "����A�܂��B���܂ɂ��邱�Ƃ���B";
		mes "�������������̖��͂̎c���Ă�ꏊ��";
		mes "�ړ�����񂾂�B";
		mes "����͂ǂ��ł������B";
		next;
	}
	mes "[�x���x���K���h]";
	mes "���́A��|����Ȃ񂾁B";
	mes "�s�M�҂����������Ă����̂��������ǁA";
	mes "���͂�͂�`���I�Ȃ�����";
	mes "������̂������ȁB";
	next;
	mes "[�x���x���K���h]";
	mes "�~�~���K���h�l�̑����i��";
	mes "����������񂾁B";
	mes "���������K���h�l�̗؂̕������������A";
	mes "�X��̑�����t�����";
	mes "�����Ɖؗ�ɂȂ�񂾂�ˁB";
	next;
	mes "[�x���x���K���h]";
	mes "�ӂށB������낤���H";
	mes "�x���g�H�C�H�����i�H";
	mes "�����A���񂴂��������ȁB";
	mes "�i�D�ǂ����ꂽ��A";
	mes "���X�K���h�l�ɐi�サ�Ȃ���B";
	mes "�����A�Z�����Z�����B";
	close;
}

jor_nest.gat,257,26,5	script	�}�^�J�C�i�K���h#ep19r	21529,{/* 2794 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�}�^�J�C�i�K���h]";
		mes "���₟�������I�I�I";
		mes "�l�ԁI�I�d����I�I�����Ⴄ�I�I";
		close;
	}
	if(EP19_1QUE >= 68) {	//69? ������
		mes "[�}�^�J�C�i�K���h]";
		mes "�݂�ȑ����ړ��c�c�����I";
		mes "�������A";
		mes "���͂����ł����ƕX���@��Ȃ���B";
		next;
	}
	mes "[�}�^�J�C�i�K���h]";
	mes "���A�̓����O�̃��}�L�i���|���B";
	mes "�J���}�������|���B";
	mes "�X���@�낤�Ƃ��āA";
	mes "1�l���񂾁c�c2�l���񂾁B";
	mes "�}�^�J�C�i�͕X���@�肽���ł��c�c�B";
	close;
}

jor_nest.gat,235,57,3	script	�p�u���T�r�K���h#1	21529,{/* 2795 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		// �������A�N�G�X�g�i�s�O
		mes "[�p�u���T�r�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(checkquest(8790)) {
		mes "[�p�u���T�r�K���h]";
		mes "�ŋ߁c�c�������̔C�����������񂾂�B";
		mes "���K������Ȃ��l�Ԃ��A";
		mes "�������̓������ɏo���肷�鏊�ׂŁA";
		mes "��W�߂��������Ȃ����񂾂�B";
		next;
		mes "[�K�k���U�~�K���h]";
		mes "�͂��c�c�B";
		close;
	}
	mes "[�p�u���T�r�K���h]";
	mes "�c�c�c�c�c�c�c�H";
	mes "���߂Č���i�՗l�B";
	mes "���̓p�u���T�r�K���h�B";
	mes "���X�K���h�l�̒����̕����B";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�����H";
	next;
	mes "[�p�u���T�r�K���h]";
	mes "��x����𐒂߂����Ƃ͂Ȃ��񂾂��ǁA";
	mes "���Ɓc�c������̃K�k���U�~�K���h�B";
	mes "�����āA";
	mes "�����ɍs�����X���v���k�K���h�Ɓc�c";
	mes "�����������������A��B";
	next;
	mes "[�p�u���T�r�K���h]";
	mes "���X�K���h�l�ɔ���W�߂āA";
	mes "������d�������Ă���񂾁A��B";
	next;
	mes "[�K�k���U�~�K���h]";
	mes "�������B";
	mes "�������͑傢�ɖ��ɗ��d����";
	mes "����Ă���񂾁A��B";
	mes "���Ƃ��������Ƃ��Ă��c�c�B";
	next;
	mes "�]��l�̃��K���͋}��";
	mes "�@���񂾕��͋C�ɂȂ����]";
	next;
	mes "[�p�u���T�r�K���h]";
	mes "�ŋ߁c�c�������̔C�����������񂾂�B";
	mes "���K������Ȃ��l�Ԃ��A";
	mes "�������̓������ɏo���肷�鏊�ׂŁA";
	mes "��W�߂��������Ȃ����񂾂�B";
	next;
	mes "[�K�k���U�~�K���h]";
	mes "�������̎d���́A";
	mes "���X�K���h�l�ɕ�����ߐl�����̔���A";
	mes "�֐_�̉����肩�玝���Ă��邱�ƂȂ񂾁B";
	next;
	mes "[�K�k���U�~�K���h]";
	mes "�ł��A�ŋ߂ɂȂ��āA";
	mes "�l�Ԃ������o���肷��悤�ɂȂ����B";
	mes "���������������������Ɏg���āc�c";
	mes "�����ǁA���Ă̒ʂ莄�����͕��M�k����B";
	mes "�h�����@�͖����񂾁c�c���ƌ����āA";
	mes "�V�����������͂��Ȃ��񂾂�B";
	next;
	mes "[�K�k���U�~�K���h]";
	mes "�͂��c�c�B";
	close2;
	setquest 8790;
	compquest 8790;
	//showevent 9999, 0, �V��������#ep19iwin07;	// 2824: 273, 23
	end;
}

jor_nest.gat,232,55,7	script	�K�k���U�~�K���h#1	21529,{/* 2796 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�K�k���U�~�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[�K�k���U�~�K���h]";
	mes "�����ɉ���������";
	mes "�悭������Ȃ��c�c����B";
	close;
}

jor_nest.gat,239,239,3	script	�f�p�i�K���h#1	10473,{/* 2797 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�f�p�i�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 68) {	// ? �N�G�X�g���򖢒���
		mes "[�f�p�i�K���h]";
		mes "�Ȃ񂾂�����������������ǁA";
		mes "����ł��������͎������̎d����";
		mes "�ꐶ�����ɂ��Ȃ��Ɓc�c�B";
		next;
		mes "[�f�p�i�K���h]";
		mes "��葽���̓��������𗦂��邽�߂ɁA";
		mes "���X�K���h�l�͖߂��Ă��邾�낤�H";
		mes "���̎��܂ŗ��̐��b�����Ȃ�����c�c�B";
		close;
	}
	if(EP19_1QUE >= 41) {	//�؂�ւ��^�C�~���O������
		if(checkquest(8793)&8) {
			mes "[�f�p�i�K���h]";
			mes "�ǂ��������H";
			mes "���O�̂悤�Ɂc�c";
			mes "�����ɋ^������q�����������H";
			mes "�����C�t�����񂾂�B";
			mes "�e�����邱�Ƃ�����Ă���񂾂�B";
			next;
			mes "[�f�p�i�K���h]";
			mes "���O�͈����p���^������������A";
			mes "���c�̂��߂ɗ͂��g���Ȃ����B";
			close;
		}
		mes "[�f�p�i�K���h]";
		mes "����A�܂����B";
		mes "����ȂƂ����";
		mes "���߂Ă݂�i�Ղɉ�Ƃ́c�c�B";
		mes "�ǂ�����o�ė����́H";
		mes "�ǂ����Ă����ɁH";
		next;
		mes "[�f�p�i�K���h]";
		mes "�S���͒N�H";
		mes "���̎q����u���ď㋉�z���ꂩ��";
		mes "�O�ɏo���Ă��܂��Ȃ�āc�c�B";
		next;
		mes "[�f�p�i�K���h]";
		mes "�c�c����H";
		mes "�����A�㋉�z����̏o�g����";
		mes "�Ȃ������񂾂ˁH";
		mes "�����A";
		mes "�ǂ����Ă����";
		mes "���ɋ����Ă���Ȃ������񂾁c�c�B";
		next;
		mes "�]�ŏ㋉���K���͈�l�Œ���͂��߂��]";
		next;
		mes "[�f�p�i�K���h]";
		mes "���́A�f�p�i�K���h�l�ł���B";
		mes "��b�ł��郋�K���́A";
		mes "�S�����̊��m���Ă���B";
		next;
		mes "[�f�p�i�K���h]";
		mes "�C�ɂȂ邱�Ƃ́H";
		while(1) {
			next;
			// ����܂��� -> ����܂�
			// �t�񓚖�����
			if(select("����܂�","����܂���") == 2) {
				mes "[�f�p�i�K���h]";
				mes "�f���Ȏq���ȁB";
				mes "�������A�����ɐ��܂ꂽ����ɂ́A";
				mes "���̘b�𕷂��Ă݂Ăق����B";
				next;
				mes "[�f�p�i�K���h]";
				mes "�ӂށc�c�B";
				mes "���i�͉��l���W�߂Ĉ�x�ɋ����Ă邩��";
				mes "�Ƃ肾���ɐ�������̂�";
				mes "������ƕs�v�c�Ȋ���������ˁB";
				next;
				mes "[�f�p�i�K���h]";
				mes "�������͋���ȎցA";
				mes "���������K���h�̉���̉���";
				mes "���̒n�����푰�B";
				mes "�����琶�܂�邪�e�͖����A";
				mes "������Ă�̂͂��̒n�̖��́B";
				next;
				mes "[�f�p�i�K���h]";
				mes "���̒��̑S�Ă̐������e�����悤�ɁA";
				mes "�������͐������т����X�K���h�l�̈ӎv��";
				mes "���܂�āA";
				mes "����Ȏփ��������K���h�̗͂Ō`�𓾂��B";
				next;
				mes "[�f�p�i�K���h]";
				mes "�J�ߏ̂����܂��A";
				mes "����ȎցA���������K���h�B";
				mes "�]�����܂��A";
				mes "�������т��ҁA���X�K���h�B";
				next;
				mes "[�f�p�i�K���h]";
				mes "���������";
				mes "�m���������ė�����ڊo�߂邱�Ƃ��܂��A";
				mes "���X�K���h�l�̉��b�ł���B";
				mes "�����҂̌����A�����������B";
				next;
				mes "[�f�p�i�K���h]";
				mes "���̎��������K���́A";
				mes "�S�ă��X�K���h�l�̗͂�";
				mes "�q�������̂����ł���B";
				mes "�e�q�̊T�O�͂Ȃ����A";
				mes "���̈ӎu��S�Ĉ����p�����̂�";
				mes "���X�K���h�l���B";
				next;
				mes "[�f�p�i�K���h]";
				mes "���̃��X�K���h�l���T���������A";
				mes "�������݂�Ȃ����������";
				mes "���͂̌����̂ō��グ�Ă���̂́A";
				mes "���O�Ǝ����m���Ă���ʂ肾�B";
				next;
				mes "[�f�p�i�K���h]";
				mes "�B��A�ō��̃��K���̓��X�K���h�l�A";
				mes "�Ƃ肾���ł���B";
				mes "���̈���̈ʂɂ���A";
				mes "���̂悤�ɗD�ꂽ�ŏ㋉���K����";
				mes "�勳�ƌĂԂ悤�ɁB";
				next;
				mes "[�f�p�i�K���h]";
				mes "���O�͐_�̑I���̉���";
				mes "�i�ՂƂ��Đ��܂ꂽ�B";
				mes "�������ŗ��̐��b������҂����́A";
				mes "���M�k�ł���B";
				next;
				mes "[�f�p�i�K���h]";
				mes "���M�k�ɂ������ꂸ�A";
				mes "�^����ꂽ�_�̖��͂���";
				mes "�z���ł��ʂ܂܂ɐ��܂ꂽ�҂����́A";
				mes "�d�����ł����Ȃ�g���Ȃ����Ȃ����c�c";
				mes "�����łȂ���Ύ����ɉ߂��Ȃ��B";
				next;
				mes "[�f�p�i�K���h]";
				mes "���O�̂��̒m�b�Ń��X�K���h�l����`��";
				mes "���������K���h���c��";
				mes "�嗤�ɐ��͂��L������悤��";
				mes "�撣��Ȃ����B";
				next;
				mes "[�f�p�i�K���h]";
				mes "�����C�ɂȂ邱�Ƃ́H";
				continue;
			}
			mes "["+strcharinfo(0)+"]";
			mes "�c�c�B";
			next;
			mes "�]�f�p�i�K���h�̘b�𑍍�����΁A";
			mes "�@���ȏ�̒m�\�������K�������́A";
			mes "�@��b����\�͂Ȃǂ̒m�����A";
			mes "�@��������Ԃŗ�����Y�܂��悤���B";
			mes "�@������x�̌����ԈႢ�́A";
			mes "�@����ނ�ɂł��������]";
			next;
			mes "[�f�p�i�K���h]";
			mes "�����ȁB�����Ă݂Ȃ����B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "��������";
			mes "�w���t�͊w�񂾂܂ܐ��܂�ė���x�̂ɁA";
			mes "�ǂ����Đ�قǂ̗l�Ȃ��Ƃ́A";
			mes "��X�w�΂Ȃ��Ă͂Ȃ�Ȃ��̂ł����H";
			next;
			mes "[�f�p�i�K���h]";
			mes "�����A�Ȃ�Ƃ������Ƃ��A";
			mes "����Ȃɓ�����������Ƃ́I";
			mes "�������኱�̌��������悤���ȁB";
			mes "�������͌��t���w�񂾂܂�";
			mes "���܂���ł͂Ȃ��̂���B";
			next;
			mes "[�f�p�i�K���h]";
			mes "�������͊e�X���X�K���h�l�Ƃ�";
			mes "�قȂ�̂����A";
			mes "���X�K���h�l�̗͂�";
			mes "�R�����郋�K���Ƃ������ʓ_������B";
			next;
			mes "[�f�p�i�K���h]";
			mes "���̂��߁A�m���Ă��邱�Ƃ́A";
			mes "���K���Ƃ��ē��R�̂��Ƃ��B";
			mes "�m���Ă��邱�Ƃ������Ă݂�B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c�B";
			next;
			menu "���K���̓��K����H�ׂ�",-;
			mes "[�f�p�i�K���h]";
			mes "�����A�w�΂Ȃ��Ă��m���Ă��邱�Ƃ��ˁB";
			mes "�������̓��X�K���h�l�ɂƂ���";
			mes "������O�̂��Ƃ́A";
			mes "�S�Ēm�����܂ܐ��܂��B";
			next;
			mes "[�f�p�i�K���h]";
			mes "�������A���c�̋����́A";
			mes "�������̐��͂��傫���Ȃ�A";
			mes "�̐���������Ες����̂Ȃ񂾂�B";
			next;
			mes "[�f�p�i�K���h]";
			mes "�����̛z����������Ȃ���A";
			mes "�z�������镽�M�k������";
			mes "�b�����Ă݂Ȃ����B";
			mes "�������i�Ղł���Ƃ������Ƃ̈Ӗ���";
			mes "�����ł��邾�낤�B";
			next;
			mes "[�f�p�i�K���h]";
			mes "���@�������ƕ��������Ȃ�";
			mes "^ff0000�x���i�K���h^000000��K�˂Ȃ����B";
			mes "�ނȂ烉�X�K���h�l�̋�����";
			mes "�����Ə�肭�������Ă����͂����B";
			close2;
			setquest 8793;
			compquest 8793;
			end;
		}	// end while
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,277,257,1	script	�������X�j�K���h#1	21529,{/* 2798 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�������X�j�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 41) {	//�؂�ւ��^�C�~���O������
		if(checkquest(8793)&8) {
			mes "[�������X�j�K���h]";
			mes "�f�p�i�K���h�l���H";
			mes "����m���Ă���̂������Ă݂���āH";
			next;
			mes "[�������X�j�K���h]";
			mes "�c������Ȃ��A�ł��B";
			next;
			menu "�D���ȕ�",-;
			mes "[�������X�j�K���h]";
			mes "�D���ȕ��H";
			mes "�g�����ꏊ�c";
			mes "�O�͂��₾�A�ł��B";
			next;
			menu "�����ȕ�",-;
			mes "[�������X�j�K���h]";
			mes "�����ȕ��H";
			mes "�����ꏊ�c";
			mes "�O�͂��₾�A�ł��B";
			next;
			mes "�]����b�͂ł��Ȃ��������]";
			close;
		}
		mes "[�������X�j�K���h]";
		mes "���A�����ƁB";
		close;
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,220,279,1	script	�^�M�~���f�K���h#1	21529,{/* 2799 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�^�M�~���f�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 41) {	//�؂�ւ��^�C�~���O������
		if(checkquest(8793)&8) {
			mes "[�^�M�~���f�K���h]";
			mes "�f�p�i�K���h�l���H";
			mes "����m���Ă���̂������Ă݂���āH";
			next;
			mes "[�^�M�~���f�K���h]";
			mes "���������Ȃ��c�c�ł��B";
			next;
			menu "��肽������",-;
			mes "[�^�M�~���f�K���h]";
			mes "��肽�����ƁH";
			mes "���ɂȂ��āc�c";
			mes "���͂��z�J�z�J����ꏊ�Łc�c";
			mes "�Q�Ă������A�ł��B";
			next;
			mes "[�^�M�~���f�K���h]";
			mes "�ł��A";
			mes "���������K���h���c�̕����̂��߂Ȃ�A";
			mes "�����ł��B";
			next;
			mes "�]�[���l���͂Ȃ��悤���]";
			close;
		}
		//������
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,274,199,5	script	�M�x�f�E�T�K���h#1	21529,{/* 2800 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�M�x�f�E�T�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 41) {
		if(checkquest(8793)&8) {
			mes "[�M�x�f�E�T�K���h]";
			mes "�������I";
			mes "�����c�c���A�ł��B";
			mes "�m��Ȃ��i�Ղ��܂��B";
			mes "�ł��B";
			mes "�V��łȂ������A�ł��B";
			next;
			mes "[�M�x�f�E�T�K���h]";
			mes "�c�c���A���b���Ă����A�ł��B";
			next;
			menu "�s�������͂Ȃ��H",-;
			mes "[�M�x�f�E�T�K���h]";
			mes "�s�������H";
			mes "�c�c���܂łǂ̎i�՗l��";
			mes "����Ȃ̘b�������ƂȂ������ł��B";
			next;
			mes "[�M�x�f�E�T�K���h]";
			mes "�������́c�c�_�ɏ]���M�k�������A�ł��B";
			mes "�c�c";
			mes "�d���͓��R�̂��Ƃ��ł��H";
			mes "�V�т������ǁc�c";
			mes "�d���͂��Ȃ���Ȃ�Ȃ��ł��B";
			next;
			mes "�]����b�͂ł��Ȃ��������]";
			close;
		}
		mes "[�M�x�f�E�T�K���h]";
		mes "���B�����ƁB";
		close;
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,74,100,5	script	�A���C�K���h#1	10475,{/* 2801 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�A���C�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 41) {	// ������؂�ւ�肩������
		if(checkquest(8794)&8) {
			mes "[�A���C�K���h]";
			mes "�n�n�I�w�^���I";
			close;
		}
		mes "[�A���C�K���h]";
		mes "�c�c�H";
		mes "�N�A�N�c�c���߂Č���B";
		mes "������Ƃ������ɗ��Ă݂āB";
		next;
		mes "�]�b���I���O�ɁA";
		mes "�@�ŏ㋉���K���͘r�������";
		mes "�@�����߂Â��Ă����I�]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ɂ��I";
		next;
		mes "[�A���C�K���h]";
		mes "�����A�ɂ����āB";
		mes "����łȂ��A����łȂ��B";
		mes "�H�ׂĂȂ��B";
		next;
		mes "[�A���C�K���h]";
		mes "����������Ƒ傰��������ȁH";
		mes "�w�^���Ȃ̂��H";
		mes "�N�A���̃A���C�K���h���|�����H";
		next;
		menu "�|��",-,"�|���Ȃ�",-;
		mes "[�A���C�K���h]";
		mes "�������Ƃ́c�c";
		mes "�܊p�H�ׂȂ������̂ɁB";
		next;
		if(select("���ł���ȍs��������̂��𕷂�","������") == 2) {
			mes "[�A���C�K���h]";
			mes "�n�n�I�w�^���I";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "���ł���ȍs��������c�ł��H";
		next;
		mes "[�A���C�K���h]";
		mes "���܂�ĊԂ��Ȃ��̂��ȁH";
		mes "�����ڂ͂�������Ȃ��̂ɁA";
		mes "���M�k�݂����ɒ���₪��B";
		mes "�ł��A���M�k����";
		mes "����ȍl���������Ȃ����낤����A";
		mes "�������Ƃ͌����ȁB";
		next;
		mes "[�A���C�K���h]";
		mes "�݂�ȓ��������Ő��܂�Ă���̂�";
		mes "���́A���i���l�����Ⴄ�̂��낤�H";
		mes "�{���ɖʔ����Ǝv��Ȃ����I";
		next;
		menu "�H�H�H",-;
		mes "[�A���C�K���h]";
		mes "�����A������Ƃ��炩������������B";
		mes "�����܂Ŗ��׋C���Ƃ́B";
		mes "�}�W�ŒN�����r��H�ׂ�����Ă�";
		mes "�m��Ȃ����H";
		mes "���Ƃ��Ȃ��I";
		next;
		mes "[�A���C�K���h]";
		mes "�O���~�K���h�����Ȃƌ���������";
		mes "���Ȃ��񂾂��ǁB";
		mes "�O���~�K���h�m���Ă�H��������Ƃ���H";
		mes "�m��Ȃ��H�d�����Ȃ��ȁB";
		next;
		mes "[�A���C�K���h]";
		mes "�Ƃɂ����A�������n���K����";
		mes "�ǂ��H�ׂ邩�Y��ł�����A";
		mes "�z��������������B";
		mes "�������Ă��ς�邱�Ƃ͂Ȃ��̂ɁA";
		mes "���ł�����C�W����̂����āB";
		mes "�܂������A���ꂽ��B";
		next;
		menu "�c�c",-;
		mes "[�A���C�K���h]";
		mes "�����玄�������_�̖��͂̏h�����n�Łc�c";
		mes "�c�悽���̌��ō���āA";
		mes "���̂悤�ɖ��͐����̂Ƃ��Ė��𓾂āA";
		mes "���̐���������";
		mes "������ƈقȂ�Ƃ��Ă����B";
		next;
		mes "[�A���C�K���h]";
		mes "���͊j�ɂ��Ȃ��Ă��A";
		mes "���̂܂܋z�����Ă݂Ă�";
		mes "�����̂ł͂Ȃ����H";
		next;
		mes "[�A���C�K���h]";
		mes "�l�Ԃ����͉����H�ׂ鎞�ɁA";
		mes "�����Ƃ����̂����񂾂��āH";
		mes "���͂������肽�������̂��`�I�I";
		mes "�������܂Ő����Ă���";
		mes "����ĂȂ��������Ƃ́c�c�B";
		next;
		mes "[�A���C�K���h]";
		mes "����ŃO���~�K���h���c�c";
		mes "�c�c���āc�c���ꂪ�c�c�B";
		next;
		mes "�]�������낵���b�𕷂����B";
		mes "�@�������A�b�ɏo�Ă���O���~�K���h���A";
		mes "�@���K���Ƃ��Ă̏펯�I�Ȏv�l��";
		mes "�@������Ȃ�A";
		mes "�@���K�������́A�����I�ɂ͌��n���K����";
		mes "�@���ڐH�ׂ邱�Ƃ͖����������]";
		next;
		mes "[�A���C�K���h]";
		mes "�����I�����Ă���̂��H";
		setquest 8794;
		compquest 8794;
		close;
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,17,97,5	script	�x���i�K���h#1	10474,{/* 2802 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�x���i�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 41) {	//�؂�ւ��^�C�~���O������
		if(checkquest(8795)&8) {
			mes "[�x���i�K���h]";
			mes "�����̐��@�͏I���܂����B";
			mes "��ł܂���܂��傤�A�V�����i�Ղ�B";
			close;
		}
		mes "�]�ŏ㋉���K����";
		mes "�@�������������͋C��";
		mes "�@����������Ă��邱�Ƃ��A";
		mes "�@���l���͂�ŕ����Ă���]";
		next;
		if(select("�ꏏ�ɕ����Ă݂�","�ʂ�߂���") == 2) {
			mes "�]�悸�͑��̏ꏊ������Ă݂悤�]";
			close;
		}
		mes "[�x���i�K���h]";
		mes "������ɂ���������M�k������";
		mes "�݂�Ȃ������̒ʂ�A";
		mes "�������̐_�͂������ꒌ�A";
		mes "���������K���h�l�ł���܂��B";
		next;
		mes "[�x���i�K���h]";
		mes "�݂�Ȃ��_�̏j���ɂ��A";
		mes "���̏�ɂ���̂ł��B";
		mes "�������͑��̎푰��";
		mes "�قȂ��Ă��܂��B";
		next;
		mes "[�x���i�K���h]";
		mes "�e���Ȃ��A�q�����Ȃ����A";
		mes "��������Đ_�̈ӂɂ��";
		mes "�����̂𐬂��Ă��܂��B";
		unittalk getnpcid(0,"�n�f�}���K���h#1"),"�n�f�}���K���h : �V�������܂ꂽ�������ȁH���͐��@�̓r��������Â��ɕ����āB";
		next;
		mes "�]�ŏ㋉���K���́A";
		mes "�@�������������������]";
		next;
		mes "[�x���i�K���h]";
		mes "�V�����M�k�̕���1�l�����܂����ˁB";
		mes "���}�������܂��傤�B";
		unittalk getnpcid(0,"�n�f�}���K���h#1"),"�n�f�}���K���h : �悤�����I";
		unittalk getnpcid(0,"�����~�K���h#1"),"�����~�K���h : �K���ɍ����āB";
		unittalk getnpcid(0,"�E�i�O�X�_�K���h#1"),"�E�i�O�X�_�K���h : �c�c�B";
		next;
		mes "[�x���i�K���h]";
		mes "�����A�����A������x�Â��ɁB";
		mes "�����̐��@�͂��낻��I���ɂ��悤����";
		mes "�v���܂������A";
		mes "�i�՗l���}��������";
		mes "���������b���Ă݂܂��傤�B";
		next;
		mes "[�x���i�K���h]";
		mes "�v���Ԃ�Ɂc�c";
		mes "���X�K���h�l�̘b�����Ă݂܂����H";
		next;
		mes "[�x���i�K���h]";
		mes "���͖Z���������Ŏp��";
		mes "���������Ă��������܂��񂪁A";
		mes "�䂪���������K���h���c��";
		mes "�ĕ����̂��߂ɁA���X�K���h�l��";
		mes "���̊�����n�̗l�X�ȏ������܂����B";
		next;
		mes "[�x���i�K���h]";
		mes "�����ł��_�̉��b�̎c���Ă�ꏊ�ɂ́A";
		mes "�ɂ��܂������T����";
		mes "�V�������������܂����B";
		next;
		mes "[�x���i�K���h]";
		mes "�������̐�c�̍Ō�̎q�A";
		mes "���X�K���h�l�̌��ɏh�������͂ƁA";
		mes "�_�̉��b�����邱�̒n�̖��͂�������";
		mes "�V�����������h��n�߂܂����B";
		mes "�������A�S�Ă��ӂ̂܂܂Ƃ����킯�ɂ�";
		mes "�����܂���ł����B";
		next;
		mes "[�x���i�K���h]";
		mes "���߂ė�����";
		mes "���܂ꂽ���̂����������c�c";
		mes "�_�̑I�����󂯂��Ȃ�����";
		mes "���n���K�������ł�������ˁB";
		unittalk getnpcid(0,"�E�i�O�X�_�K���h#1"),"�E�i�O�X�_�K���h : �܍߂��܂��c�c�B";
		next;
		mes "[�x���i�K���h]";
		mes "���X�K���h�l�͐؂Ȃ��C������";
		mes "�ނ���ЂƂЂƂA";
		mes "���͊j�ɕς��܂����B";
		mes "���̌�������T���āA";
		mes "�V���������𑝂₷���Ƃ�";
		mes "�J��Ԃ��܂����B";
		next;
		mes "[�x���i�K���h]";
		mes "�����Ē����N��������c�c";
		mes "���̊ԁA�������X�K���h�l��";
		mes "���ɂȂ�悤�ɂȂ�܂������c�c�B";
		next;
		mes "[�x���i�K���h]";
		mes "���̎��������K���́A";
		mes "�K���Ɋ֌W�Ȃ��A";
		mes "�݂�ȃ��X�K���h�l�̈ꕔ�ł���";
		mes "�q���ł��B";
		mes "�e���q�����܂��񂯂ǁB";
		next;
		mes "[�x���i�K���h]";
		mes "�������A�ǂ����Ă���Ȃɂ�";
		mes "�e�����Ⴄ���ʕ��Ƃ���";
		mes "���܂��̂ł��傤���H";
		next;
		mes "[�x���i�K���h]";
		mes "����́c�c�e����";
		mes "�w�~�������̂ɂǂ�قǐG��悤��";
		mes "���Ă���̂��H�x��";
		mes "���̂ł͂Ȃ����ƁA���͎v���܂��B";
		next;
		mes "[�x���i�K���h]";
		mes "���X�K���h�l�̖��������ɂ��A";
		mes "�������͒m�邱�Ƃ��ł��܂���B";
		mes "�����Ď����o�������ߋ��̏o������";
		mes "�Ⴆ�΍��������΂���̎i�՗l��";
		mes "�m��Ȃ��ł��傤�B";
		next;
		mes "[�x���i�K���h]";
		mes "���X�K���h�l�́A";
		mes "�l�Ԃ����Ɋւ��􂢂ɂ����";
		mes "�s���g�ɂȂ�܂������c�c�B";
		next;
		mes "[�x���i�K���h]";
		mes "�l�Ԃ����ɑ΂��镜�Q���I����O�ɁA";
		mes "���X�K���h�l�̋C�͂��s�����肵����";
		mes "���̂܂܉䂪�푰��";
		mes "�j�ł֌������Ă��܂��ł��傤�B";
		next;
		mes "[�x���i�K���h]";
		mes "������A���X�K���h�l�̐S��";
		mes "����グ�Ă������߂ɂ��A";
		mes "���������l�Ԃ����ɑ΂��镜�Q�S��";
		mes "�Y��Ă͂����܂���B";
		next;
		mes "[�x���i�K���h]";
		mes "�c�c�l�Ԃ����ɑ΂��镜�Q�I";
		unittalk getnpcid(0,"�n�f�}���K���h#1"),"�n�f�}���K���h : ���������K���h���΁I";
		unittalk getnpcid(0,"�E�i�O�X�_�K���h#1"),"�E�i�O�X�_�K���h : ���������K���h���΁I";
		next;
		mes "[�x���i�K���h]";
		mes "�c�悽���̍��݁I";
		unittalk getnpcid(0,"�n�f�}���K���h#1"),"�n�f�}���K���h : ���X�K���h���΁I";
		unittalk getnpcid(0,"�E�i�O�X�_�K���h#1"),"�E�i�O�X�_�K���h : ���X�K���h���΁I";
		next;
		mes "[�x���i�K���h]";
		mes "������ł��A�͂�~����K�v��";
		mes "����̂ł͂Ȃ��ł��傤���H";
		mes "����ȏ��x��ɂȂ�O�Ɂc�c";
		mes "�݂�Ȃŏ����������܂��傤�B";
		next;
		mes "[�x���i�K���h]";
		mes "�����̐��@�͂��̂��炢�ŏI���܂��B";
		mes "�݂�Ȃ��悢���Ԃ��������܂��悤�ɁB";
		unittalk getnpcid(0,"�E�i�O�X�_�K���h#1"),"�E�i�O�X�_�K���h : �����ɍs���Ȃ���c�c�B";
		unittalk getnpcid(0,"�����~�K���h#1"),"�����~�K���h : �c�c�B";
		next;
		mes "[�����~�K���h]";
		mes "�N�A������Ƙb�������B";
		unittalk getnpcid(0,"�����~�K���h#1"),"���[���A�������͌��Ȃ��ŁB";
		setquest 8795;
		compquest 8795;
		close;
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,24,97,3	script	�n�f�}���K���h#1	10470,{/* 2803 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�f�}���K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[�n�f�}���K���h]";
	mes "���ɂ����Ɠ����Ă���";
	mes "�e�؂Ȑ��@�Ȃ񂾁B";
	close;
}

jor_nest.gat,21,99,3	script	���J�m���K���h#1	10471,{/* 2804 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���J�m���K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[���J�m���K���h]";
	mes "�_�̋����ɏ]���Ȃ����c";
	close;
}

jor_nest.gat,23,91,1	script	�E�i�O�X�_�K���h#1	21529,{/* 2805 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�E�i�O�X�_�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[�E�i�O�X�_�K���h]";
	mes "�c";
	mes "���B�����ƁB";
	mes "�������ƁB�܍߁B";
	close;
}

jor_nest.gat,18,92,7	script	�����~�K���h#1	10473,{/* 2806 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�����~�K���h]";
		mes "�l�Ԃ��I�@�ǂ����Ă����ɁI";
		close;
	}
	if(EP19_1QUE >= 41) {	//�؂�ւ��^�C�~���O������
		if(checkquest(8795)&8) {
			if(checkquest(130515)&8) {
				mes "[�����~�K���h]";
				mes "�����z�ɖڂ�t�����Ȃ��悤�ɁA";
				mes "�C��t���āB";
				close;
			}
			mes "[�����~�K���h]";
			mes "�N�A������Ƙb�������B";
			next;
			menu "�͂��H",-,"�ǂ��������p�ł����H",-;
			mes "[�����~�K���h]";
			mes "���[���A�������͌��Ȃ��ŁB";
			mes "�c�c";
			mes "���܂�ĊԂ��Ȃ��̂ɁA";
			mes "����Ȃ��Ƃ𕷂�������";
			mes "�h���������͕̂����邪�A";
			mes "�S�Ă̘b��ۂݍ��ޕK�v�͂Ȃ��B";
			next;
			mes "[�����~�K���h]";
			mes "�x���i�K���h�̕��񒆂͕�����Ȃ�����B";
			mes "���ł͂�����������ǁA";
			mes "�{���Ƀ��X�K���h�l�ׂ̈�";
			mes "�s�����Ă���̂����肩����Ȃ��B";
			next;
			mes "[�����~�K���h]";
			mes "�����������H";
			next;
			menu "�͂�",-,"������܂���",-;
			mes "[�����~�K���h]";
			mes "�c�c���Ԃ����炩�ɂ��Ă���邾�낤��";
			mes "�x���i�K���h�Ƃ́A";
			mes "����܂�e�������Ȃ��ق��������B";
			mes "���X�K���h�l�������v��Ȃ����낤�B";
			next;
			menu "�{���ł����H",-,"�͂�",-;
			mes "[�����~�K���h]";
			mes "�c�c�B";
			next;
			mes "[�����~�K���h]";
			mes "�x���i�K���h�́A";
			mes "���X�K���h�l�ɑ΂��钉���S��";
			mes "�{�������A";
			mes "���X�K���h�l�̈ӎv�𐳂���";
			mes "���ݎ��Ă���킯�ł͂Ȃ��B";
			next;
			mes "[�����~�K���h]";
			mes "�c�c���̂ȁA";
			mes "�x���i�K���h�̌����ʂ��";
			mes "�݂�Ȃ����X�K���h�l�̗͂�";
			mes "���܂ꂽ�Ȃ�A";
			mes "�ǂ����Ă����܂ňႤ�񂾁H";
			close2;
			setquest 130515;
			compquest 130515;
			end;
		}
		mes "[�����~�K���h]";
		mes "�c�c�B";
		close;
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,239,244,5	script	�V�h���K���h#1	10475,{/* 2807 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�V�h���K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 41) {	//�؂�ւ��^�C�~���O������
		if(checkquest(8796)&8) {
			mes "[�V�h���K���h]";
			mes "���Ă��ꂽ�񂾁I";
			mes "���Ⴀ�A������������肵������";
			mes "�����ɂ��Ęb���܂��傤�H";
			mes "������ƁA";
			mes "�����܂ŘI���Ɍ��Ȋ炵�Ȃ��ł�I";
			mes "�c�c���A������ƕt�������Ă�I";
			close;
		}
		mes "[�V�h���K���h]";
		mes "���炠��I";
		mes "���߂Ă݂�q�ˁI";
		mes "����`�،��āB�L���L�������Ă�`�B";
		mes "����Ȃ��Y��Ȏq�́A";
		mes "����܂茩�����Ɩ����̂Ɂ`�B";
		next;
		mes "[�V�h���K���h]";
		mes "���񂽋C�ɓ�������B";
		mes "���̕ӂ̛z����o�g����Ȃ���ˁH";
		mes "���̊ԊO�ɏo�����ɂ́A";
		mes "�ǂ������ȗ������Ȃ��������́`�B";
		next;
		mes "[�V�h���K���h]";
		mes "�ዉ�z���ꂩ��";
		mes "����Ȃɂ҂��҂��Ȏq��";
		mes "�}�ɏo�Ă���Ƃ͂ˁ`�B";
		mes "���̌���ڂ��܂��܂��Ȃ񂾂���`";
		mes "���̓V�h���K���h����`�B";
		next;
		menu "�Z�l�L�I�K���h�c�c�ł�",-;
		mes "[�V�h���K���h]";
		mes "�؂����炦�Ȃ����ȁH";
		next;
		menu "�͂��H",-;
		mes "[�V�h���K���h]";
		mes "�S�z���Ȃ��ŁA�i�՗l�`�B";
		mes "���͊K�������������ǁ`�A";
		mes "���񂽂̂��Ɓ`�A";
		mes "�������ǂ��ɂ��������킯����";
		mes "�Ȃ��́`�B";
		mes "���A���͂ǂ��H";
		next;
		menu "�͂��H",-;
		mes "[�V�h���K���h]";
		mes "�_�������c�c�Ȃ�d���Ȃ���`�B";
		mes "�ǂ����E�炵����c�c���邶��Ȃ��`�H";
		mes "���̎��Ɂ`�A";
		mes "��͂ǂ��H";
		next;
		mes "[�V�h���K���h]";
		mes "������`�B";
		mes "�����܂ŘI���I�Ɍ��Ȋ炵�Ȃ��Ł`�B";
		mes "�����̂�";
		mes "���Ԃɂ��킪�ł����Ⴄ����Ȃ��`�B";
		next;
		mes "[�V�h���K���h]";
		mes "���`��B";
		mes "�Ȃ��Ȃ����Ȃ��ˁ`�B";
		next;
		menu "�؂����ꂽ�����c�c���܂������H",-;
		mes "[�V�h���K���h]";
		mes "���Ȃ��I";
		mes "����܂��A����𕷂��Ăǂ�����́H";
		mes "���̗؂ƌ������Ă��Č����Ă��A";
		mes "���Ȃ񂾂��āI";
		next;
		menu "�c�c",-;
		mes "[�V�h���K���h]";
		mes "�������܂�Ă���";
		mes "����܂�o���Ă��Ȃ����ǂ��B";
		mes "�䂪�푰�������s���ȗ����";
		mes "�u����Ă���͎̂�������Ȃ��H";
		next;
		mes "[�V�h���K���h]";
		mes "���������܂�ĊԂ��Ȃ����񂽂�";
		mes "����Șb������̂��΂����Ⴄ���ǂ��B";
		mes "�V�����V�����c�c�B";
		next;
		mes "�]�ނ̌�����ւ������悤�ȉ�������B";
		mes "�@����Ȃ�ɏ΂��Ă���悤���]";
		next;
		mes "[�V�h���K���h]";
		mes "���񂽂��O�֏o�Ă݂�ƕ����邯�ǁA";
		mes "������I";
		mes "����Ȃ₹���ꏊ��";
		mes "���Q�����悤���Ȃ�āA";
		mes "�{���ɐ����Ǝv��Ȃ��H";
		next;
		mes "[�V�h���K���h]";
		mes "�Ȃ炻��Ȃ�ɂł��邱�Ƃ�";
		mes "�S������Ă݂Ȃ��ƁI";
		mes "���̐��͂����₵�āc�c�A";
		mes "�����҂����₵�āc�c�A";
		mes "���񂽁I���񂽂̂��Ƃ���B";
		mes "���̎P���ɓ���Ȃ��H";
		next;
		mes "[�V�h���K���h]";
		mes "�N��肽���͉������悤�ɂ�";
		mes "�҂��Ă���΂��茾�����A";
		mes "�؂���������Ȃ����c�c�B";
		mes "���ꂶ�ᎄ������";
		mes "���̔��W���ł���Ƃ����́I";
		next;
		mes "[�V�h���K���h]";
		mes "����ŁA�b�͖߂邯�ǁA";
		mes "�������؂��Ȃ��H";
		next;
		menu "����܂���",-;
		mes "[�V�h���K���h]";
		mes "�؂΂���L���L�����ĂāA";
		mes "���ɗ����Ȃ��ˁB";
		next;
		mes "�]�����ɓ��ꐫ���Ȃ��A";
		mes "�@�b�̓������ǂ������������B";
		mes "�@�����悤���Ȃ����|��";
		mes "�@�댯����������]";
		next;
		mes "[�V�h���K���h]";
		mes "���������΁A���R�E�ɂ́A";
		mes "�����瓯�����E�������������Ƃ����b���A";
		mes "�N���̒N������";
		mes "����ꂽ���Ƃ����������ǁB";
		next;
		mes "[�V�h���K���h]";
		mes "�����N�����A";
		mes "���̊����嗤�̊O�֏o�����Ƃ��Ȃ�����";
		mes "�悭����Ȃ��ȁB";
		next;
		mes "[�V�h���K���h]";
		mes "�����l�Ԃ��������Ƃ��������B";
		mes "�Ȃ�ƂȂ������Ȃ񂶂�Ȃ����ȁH";
		mes "�����͐ߖ񂵂Ȃ���Ȃ�Ȃ�����B";
		mes "���������A���n���K���͓|���Ă݂��H";
		mes "�����Ƃ��������͂����H";
		next;
		menu "����܂肵�Ȃ�����",-;
		mes "[�V�h���K���h]";
		mes "���낤�H���������������B";
		mes "�����āA��������c��̂�";
		mes "�����������͊j�����Ƃ́A";
		mes "�������͂ǂ����Đ��܂�Ă���̂��낤�H";
		next;
		mes "[�V�h���K���h]";
		mes "�������ŋ�������@�����Ă���";
		mes "�x���i�K���h�Ƃ����N���ɕ�������A";
		mes "�����Ă����̂��ȁH";
		next;
		mes "[�V�h���K���h]";
		mes "�܂�������A";
		mes "�����͂�����ꂿ���������A";
		mes "�����܂�����I";
		close2;
		setquest 8796;
		compquest 8796;
		end;
	}
	mes "�]���ÂɃ��K���ɘb�������āA";
	mes "�@���̂��o������܂����B";
	mes "�@���܂͂�߂Ă������]";
	close;
}

jor_nest.gat,272,196,5	script	�~���f���~�K���h#1	21529,{/* 2808 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�~���f���~�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[�~���f���~�K���h]";
	mes "�����B���͑f���炵�������肾�B";
	close;
}

jor_nest.gat,278,219,5	script	�����i�S�X�K���h#1	21529,{/* 2809 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�����i�S�X�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	//�؂�ւ��O�A������
	mes "[�����i�S�X�K���h]";
	mes "�����B���͊i�D���������肾�B";
	mes "�i�D�����Ɖ��������̂�������񂪁A";
	mes "�����Ȃ񂾁B";
	close;
}

jor_nest.gat,251,279,7	script	�P�X�r���~�K���h#1	21529,{/* 2810 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�P�X�r���~�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[�P�X�r���~�K���h]";
	mes "�����B�ǂ��֍s���Ă���肢�ƌ�����B";
	close;
}

jor_nest.gat,272,257,7	script	�n�k�R���}�K���h#1	21529,{/* 2811 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�n�k�R���}�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[�n�k�R���}�K���h]";
	mes "�����B���͑f���炵�������҂��B";
	close;
}

jor_nest.gat,241,223,5	script	�h�M�h�M�K���h#1	10470,{/* 2812 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�h�M�h�M�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[�h�M�h�M�K���h]";
	mes "�V��ł�q������悤�����ǁA";
	mes "��ʂ��t���Ȃ��B";
	close;
}

jor_nest.gat,243,223,3	script	���N���X�K���h#1	10472,{/* 2813 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[���N���X�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	mes "[���N���X�K���h]";
	mes "������ƃT�{���Ă���������Ȃ��B";
	close;
}

jor_nest.gat,258,236,3	script	�C�K�m�E�K���h#1	10472,{/* 2814 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�C�K�m�E�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 68) {	// ? ������
		mes "[�C�K�m�E�K���h]";
		mes "���X�K���h�l�̈ӂ��A";
		mes "���������ǂ�����Ēm�邩�ȁB";
		close;
	}
	mes "[�C�K�m�E�K���h]";
	mes "���߂Ă݂�i�՗l�H";
	mes "���ꂩ��_�̉��b�����ɂ���񂱂Ƃ��B";
	close;
}

jor_nest.gat,261,233,3	script	�����~�i�K���h#1	10471,{/* 2815 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�����~�i�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 68) {	// ? ������
		mes "[�����~�i�K���h]";
		mes "���͐����A�ς���Ă��Ȃ��C������B";
		close;
	}
	mes "[�����~�i�K���h]";
	mes "�n�@�A�������Z���������B������Ƌx�e�B";
	close;
}

jor_nest.gat,152,108,5	script	�r���j�}�K���h#1	10470,{/* 2816 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�r���j�}�K���h]";
		mes "�l�Ԃ��I�l�Ԃ����ꂽ�I";
		close;
	}
	if(EP19_1QUE >= 68) {
		mes "[�r���j�}�K���h]";
		mes "�����p�H";
		mes "����T���ĂȂ��Ȃ�A�x�܂��Ă���B";
		close;
	}
	mes "[�r���j�}�K���h]";
	mes "�������ꐶ������";
	mes "���X�K���h�l�̂��߂ɓ������B";
	mes "�ӂӁB";
	close;
}

jor_nest.gat,253,75,7	script	�~�����V�~�K���h#1	21529,{/* 2817 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21529) {
		mes "[�~�����V�~�K���h]";
		mes "�c�c���₷��B";
		close;
	}
	mes "[�~�����V�~�K���h]";
	mes "�c�c����B";
	mes "�������ꐶ�����ɓ������B";
	mes "������Ƌx�ށc�c";
	mes "���������K���h�l�������Ă���邾��B";
	mes "���₷��c�c�B";
	next;
	mes "�]���K���łȂ��Ă������邮�炢";
	mes "�@��ꂽ���";
	mes "�@�ǂɊ�肩�����ĐQ�Ă���]";
	close;
}

icecastle.gat,190,217,3	script	�A�[�E�B���̕��m#ep19iw	21515,{/* 2818 */
	cutin "ep19_iwin04.png", 2;
	mes "[�A�[�E�B���̕��m]";
	mes "���ɂɉ����p�H";
	mes "���ɂ̍��̕����̓p�g���[�����ŁA";
	mes "���F���O���f�l�͉E�̕�������B";
	close2;
	cutin "ep19_iwin04.png", 255;
	end;
}

icecastle.gat,180,206,3	script	�A�[�E�B���̕��m#ep19iw	21515,{/* 2819 */
	cutin "ep19_iwin09.png", 2;
	mes "[�A�[�E�B���̕��m]";
	mes "������Ƃ��c�c";
	mes "�����������牉���ꂾ�Ƃ��Ă����c�c";
	mes "�Ⴉ������́A�Ӗ����邩�ȁH���ȁH";
	next;
	cutin "ep19_iwin10.png", 2;
	mes "[�A�[�E�B���̕��m]";
	mes "���c�c�ς���O�ɂ�������A";
	mes "�悤�₭���̒��x�Ŏ��܂��Ă���āH";
	mes "���₟�c�c�ł��c�c�B";
	close2;
	cutin "ep19_iwin10.png", 255;
	end;
}

icas_in.gat,109,242,5	script	�M������#ep19iwin05	21513,{/* 2820 */
	cutin "ep19_iwin04.png", 2;
	mes "[�M������]";
	mes "�ߍ��A�l�Ԃ����������K�˂Ă��Ă����ˁB";
	mes "�N����������O�͎��Ԃ��߂���̂�";
	mes "������Ȃ������񂾂�ȁB";
	mes "���I���l�ƃI�[�����[�l�́A";
	mes "�قƂ�ǖ����Ă��������������c�c�B";
	next;
	menu "���葱���Ă����āH",-;
	mes "[�M������]";
	mes "�ł��������Ƃɉ�������ƋN�����B";
	mes "���őS������񂾂��āB";
	mes "�s�v�c����ˁH";
	close2;
	cutin "ep19_iwin04.png", 255;
	end;
}

icas_in.gat,142,201,3	script	�g����#ep19iwin05	21513,{/* 2821 */
	cutin "ep19_iwin03.png", 2;
	mes "[�g����]";
	mes "�O�ɂ͂ȁB";
	mes "�o�������g�l���悭�V�тɂ��Ă��񂾁B";
	mes "��������Ă�����";
	mes "�l�Ԑ�p�h�ɂ�H��������B";
	next;
	mes "[�g����]";
	mes "�H���͍����A�h�ɂ͉E���B";
	mes "���������H";
	close2;
	cutin "ep19_iwin03.png", 255;
	end;
}

icecastle.gat,52,124,3	script	�V��������#ep19iwin06	21515,{/* 2822 */
	if(EP19_1QUE < 23) {
		mes "[�V��������]";
		mes "�X���ɋC��t���āH";
		mes "������������񂾂�`�H";
		close2;
		cutin "ep19_iwin04.png", 255;
		end;
	}
	//showevent 6, 3, �V��������#ep19iwin06;	// 2822: 52, 124
	cutin "ep19_iwin04.png", 2;
	mes "[�V��������]";
	mes "���K���̑��ɐ�������d���A����J�l�B";
	mes "�������������ɍs���́H";
	mes "�X���ŕ����h�����낤����A";
	mes "������Ǝ�`�������H";
	next;
	if(EP19_1QUE >= 19) {	// ������
		set '@str1$,"�t���[�f���P�̑؍ݏ�";
		set '@str2$,"�w�����b�N�̏�";
	}
	switch(select("�K�v�Ȃ�","�ւ̑�","�X�̏�","���F���O���f�̌�����","�]�������̃L�b�`��",'@str1$,'@str2$)) {
	case 1:
		mes "[�V��������]";
		mes "�������A���œ]�т�����������";
		mes "�����Ă���B";
		mes "�����X�̏�̐_���z�B�A�[�E�B������B";
		mes "�l�Ԉ�l��΂��̂́A";
		mes "�����̎q�������������B";
		close2;
		cutin "ep19_iwin04.png", 255;
		end;
	case 2:
		if(EP19_1QUE >= 63 && EP19_1QUE <= 67) {
			mes "[�V��������]";
			mes "^0000ff�ւ̑�^000000���H";
			mes "���́A���ڌ������킯�ɂ͂����Ȃ�����A";
			mes "�t�߂܂Ŕ�΂����I";
			close2;
			cutin "ep19_iwin04.png", 255;
			warp "jor_que.gat", 281, 87;
			end;
		}
		mes "[�V��������]";
		mes "^0000ff�ւ̑�^000000���ȁH";
		mes "�O�̓��K���ɕϐg���čs��������H";
		mes "���������y����������B";
		mes "���̎��ɓ����o��������ȁB";
		mes "���ꂶ�Ⴀ�A";
		mes "���̓����ɔ�΂����I";
		close2;
		cutin "ep19_iwin04.png", 255;
		warp "jor_nest.gat", 275, 19;
		end;
	case 3:
		set '@name$,"�X�̏�";
		set '@map$,"icas_in.gat";
		setarray '@xy,138,187;
		break;
	case 4:
		set '@name$,"���F���O���f�̌�����";
		set '@map$,"icas_in.gat";
		setarray '@xy,190,61;
		break;
	case 5:
		set '@name$,"�]�������̃L�b�`��";
		set '@map$,"icas_in.gat";
		setarray '@xy,237,62;
		break;
	case 6:
		set '@name$,"�t���[�f���P�̑؍ݏ�";
		set '@map$,"icas_in.gat";
		setarray '@xy,33,112;
		break;
	case 7:
		set '@name$,"�w�����b�N�̏�";
		set '@map$,"jor_tail.gat";
		setarray '@xy,214,60;
		break;
	}
	mes "[�V��������]";
	mes "^0000ff" +'@name$+ "^000000���ȁH";
	mes "�l�Ԉ�l��΂��̂́A";
	mes "�����̎q�������������B";
	close2;
	cutin "ep19_iwin04.png", 255;
	warp '@map$, '@xy[0], '@xy[1];
	end;
}

jor_nest.gat,273,23,0	script	#e19sw_tele_1	139,7,7,{/* 2823 */
	if(EP19_1QUE >= 23)
		cloakoffnpc "�V��������#ep19iwin07";
	end;
}

jor_nest.gat,273,23,3	script	�V��������#ep19iwin07	21529,{/* 2824 (cloaking)*/
	mes "[�V��������]";
	mes "������ƁI";
	mes "������A�ق�I�V���������I";
	mes "�X�̏�֖߂�H";
	mes "�ꏏ�ɍs�������H";
	next;
	if(select("�܂���邱�Ƃ�����","�X�̏�֋A�낤�I") == 2) {
		mes "[�V��������]";
		mes "���������B";
		mes "�ł͌�ňꏏ�ɋA�낤�B";
		mes "���͂����ɂ����Ƃ��邩��B";
		close;
	}
	mes "[�V��������]";
	mes "���͕X�̏�̃A�[�E�B���̒��ł��A";
	mes "�����������A�[�E�B���Ȃ񂾁B";
	mes "�X���Ŋ���Ȃ��悤�Ɏ�`������A";
	mes "�����s�����I";
	close2;
	warp "icecastle.gat", 55, 120;
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,59,122,6	script	�R������#icecastle	21513,{/* 2825 */
	mes "[�R������]";
	mes "����������A�������͕X�A";
	mes "�l����������ƕX�����ň���X�̏��";
	mes "�悤������������Ⴂ�A�ٖM�l�I";
	mes "����^B47096�V���L�[�E�E�F�����o�����X�h�E�g�[�}�X�E�W���C^000000�l��";
	mes "�ē��S��������A�C�ɂȂ邱�Ƃ𕷂��Ă݂�悤�ɁB";
	mes "�����̑q�ɂ��Ǘ����Ă邩��A���Ўg���Ă���I";
	messize 180,364;
	while(1) {
		next;
		switch(select("�X�̏�","����","���F���O���f�̌�����","�]�������̃L�b�`��","�H���̖��h","�~�j�}�b�v�\��������","��߂Ă���")) {
		case 1:
			mes "[�R������]";
			mes "�X�̏�͂������I";
			mes "�~�j�}�b�v�ɂ��������Ă����悤�I";
			mes "���̏ꏊ�̈ē����K�v���H";
			viewpoint 1, 213, 174, 0, 0x0A82FF;
			break;
		case 2:
			mes "[�R������]";
			mes "���ɂ͂������I";
			mes "�~�j�}�b�v�ɂ��������Ă����悤�I";
			mes "���̏ꏊ�̈ē����K�v���H";
			viewpoint 1, 186, 222, 1, 0xAAFF00;
			break;
		case 3:
			mes "[�R������]";
			mes "���F���O���f�l�̌������͂������I";
			mes "�~�j�}�b�v�ɂ��������Ă����悤�I";
			mes "���̏ꏊ�̈ē����K�v���H";
			viewpoint 1, 186, 222, 2, 0x008080;
			break;
		case 4:
			mes "[�R������]";
			mes "�]�������̃L�b�`���͂������I";
			mes "�~�j�}�b�v�ɂ��������Ă����悤�I";
			next;
			mes "[�R������]";
			mes "�H���œ����A�[�E�B�������̂��߁A";
			mes "���������ꏏ�ɉ^�c���Ă����B";
			mes "�q�������������������";
			mes "�A��čs������_�������I�I";
			mes "���̏ꏊ�̈ē����K�v���H";
			viewpoint 1, 124, 171, 3, 0xFF1493;
			break;
		case 5:
			mes "[�R������]";
			mes "�H���̖��h�͂������I";
			mes "�~�j�}�b�v�ɂ��������Ă����悤�I";
			mes "��Ӕ��܂�ɂ́A^ff0000�����̏�^000000�̎��";
			mes "�h���ł��邩�����Ă݂�Ƃ����I";
			mes "���̏ꏊ�̈ē����K�v���H";
			viewpoint 1, 64, 224, 4, 0x8B4513;
			break;
		case 6:
			mes "[�R������]";
			mes "��������������I";
			mes "���ɋC�ɂȂ邱�Ƃ͂��邩�H";
			viewpoint 2, 1, 1, 0, 0xFFFFFF;
			viewpoint 2, 1, 1, 1, 0xFFFFFF;
			viewpoint 2, 1, 1, 2, 0xFFFFFF;
			viewpoint 2, 1, 1, 3, 0xFFFFFF;
			viewpoint 2, 1, 1, 4, 0xFFFFFF;
			break;
		case 7:
			mes "[�R������]";
			mes "�ٖM�l�����͉H�т��Ȃ��Ċ������낤����A";
			mes "��������������������Ă�ƕ��ׂ�������B";
			mes "�g���������̒��ɂ��āB";
			close;
		}
	}
OnInit:
	setnpctitle "<�X�̏�K�C�h>";	// NPC:�R������#icecastle(2825)
	end;
}

icecastle.gat,177,221,4	script	����#��	111,{/* 2836 */}
icecastle.gat,194,221,4	script	����#�E	111,{/* 2837 */}
icecastle.gat,199,148,4	script	�X��#��	111,{/* 2838 */}
icecastle.gat,213,148,4	script	�X��#�E	111,{/* 2839 */}
icecastle.gat,123,173,4	script	�]�������̃L�b�`��#�H��	111,{/* 2840 */
	end;
OnInit:
	setnpctitle "<16��̎���̖�>";	// NPC:�]�������̃L�b�`��#�H��(2840)
	end;
}

icas_in.gat,245,53,5	script	�`������#ep19in	10461,{/* 2841 */
	mes "[�`������]";
	mes "�����͉������ėV�ڂ��H";
	mes "�]�������̖тÂ��낢���悤���H";
	close;
}

icas_in.gat,236,45,5	script	�S������#ep19in	10461,{/* 2842 */
	mes "[�S������]";
	mes "���J���A���������H�ׂ����ȁB";
	close;
}

icas_in.gat,241,49,3	script	�`������#ep19in	10461,{/* 2843 */
	mes "[�`������]";
	mes "���ѐH�ׂ��疰���c";
	close;
}

icas_in.gat,251,60,3	script	�z����#ep19in	10461,{/* 2844 */
	mes "[�z����]";
	mes "�ꂳ��̓p�g���[��";
	mes "��肭����Ă�̂��ȁH";
	close;
}

icas_in.gat,251,59,7	script	�g����#ep19in	10461,{/* 2845 */
	mes "[�g����]";
	mes "����������݂����ɗ��h�ȑ�l�ɂȂ�B";
	close;
}

icas_in.gat,244,63,1	script	�`������#ep19in	10461,{/* 2846 */
	mes "[�`������]";
	mes "���͑傫���Ȃ�����`";
	mes "�]����������`���I";
	unittalk getnpcid(0,"�]������#ep19_dq_kitche"),"�]������ : ����`���Ă��������ǁc";
	close;
}

icas_in.gat,252,50,5	script	�R����#ep19in	10461,{/* 2847 */
	mes "[�R����]";
	mes "���͑傫���Ȃ�����A";
	mes "�p�g���[�����ɂȂ��I";
	mes "�p�g���[�����̖X�q���邶��Ȃ��A";
	mes "���͗ΐF���D���B�ΐF����B";
	unittalk getnpcid(0,"�\������#ep19in"),"�\������ : ���F�������Ɗi�D�����I";
	unittalk getnpcid(0,"�R����#ep19in"),"�R���� : �ΐF�������Ɗi�D�����I";
	close;
}

icas_in.gat,251,46,7	script	�\������#ep19in	10461,{/* 2848 */
	mes "[�\������]";
	mes "�傫���Ȃ�����p�g���[�����ɂȂ�I";
	mes "�p�g���[�����̖X�q�H";
	mes "���͉��F���D���B�ԐF�͂������B";
	unittalk getnpcid(0,"�R����#ep19in"),"�R���� : ���������A�ԐF���������͖̂{���B";
	close;
}

icas_in.gat,235,57,3	script	�z������#ep19in	10461,{/* 2849 */
	mes "[�z������]";
	mes "���̓z���������I";
	mes "�����͈̑�Ȏ��҂ɂȂ邩��I";
	close;
}

icas_in.gat,232,59,5	script	�g������#ep19in	10461,{/* 2850 */
	mes "[�g������]";
	mes "���̓g���������I";
	mes "�����́c�c";
	mes "���́c�c�̑�Ȏ��҂ɂȂ�I";
	mes "���������΂����́H";
	unittalk getnpcid(0,"�z������#ep19in"),"�z������ : ����I";
	unittalk getnpcid(0,"�g������#ep19in"),"�g������ : �Ђィ�B";
	close;
}

icas_in.gat,248,47,3	script	�\����#ep19in	10461,{/* 2851 */
	mes "[�\����]";
	mes "������Ƃ����҂��ĂĂ�A";
	mes "�ѐH������V��ł����c�c";
	mes "����A�q������Ȃ������ȁB";
	next;
	mes "[�\����]";
	mes "���Ԃ�����΂����̎q������";
	mes "�V��ł���Ȃ����H";
	mes "�O���痈���l�Ԃ̘b�Ȃ�A";
	mes "�����ƋC�ɓ��邾��B";
	close;
}

icas_in.gat,234,49,3	script	�t����#ep19in	10461,{/* 2852 */
	unittalk getcharid(3),strcharinfo(0)+" : �]�H������̂ɖZ���������]",1;
	end;
}

icas_in.gat,237,66,7	script	����#1	111,{/* 2853 */
	unittalk getnpcid(0,"�]������#ep19_dq_kitche"),"�]������ : ����͐�N�O���瑱���Ă�����`�̃^������B�݂���ɐG��Ȃ��ŗ~�����B";
	end;
}

icas_in.gat,235,65,7	script	����#2	111,{/* 2854 */
	unittalk getnpcid(0,"�]������#ep19_dq_kitche"),"�]������ : �l�ԁA����͐�N�̔�@�ő���ꂽ�J���}�������h�����A�l�Ԃ͐H�ׂ��Ȃ��炵���B�{���ɂ��������Ȃ��B";
	end;
}

icecastle.gat,170,142,3	script	�`��������#ep19in	10461,{/* 2855 */
	mes "[�`��������]";
	mes "���܂ɉH�тɉ����ꂽ�Ղ�����";
	mes "�F�B�����邯�ǁA";
	mes "�܂�ő��̓�����";
	mes "�������ɂ��Ă����݂����Ȃ񂾂�ˁB";
	next;
	mes "[�`��������]";
	mes "�������A����ȑ傫����";
	mes "������������Ȃ�������";
	mes "�������Ƃ��Ȃ��񂾂�H";
	mes "�\�ɂ������L�⌢���ǂ����ɂ���̂��ȁH";
	close;
}

icecastle.gat,261,179,7	script	�S��������#ep19in	10461,{/* 2856 */
	mes "[�S��������]";
	mes "�Ӂc�c�B";
	mes "�����Ȃ������ȓ����A";
	mes "�ǂꂾ�����肪���������m���Ă��邩�H";
	mes "����Ȏ��́A";
	mes "���̗₽���C�������g�����������Ⴄ�B";
	close;
}

icecastle.gat,105,227,3	script	�g����#ep19in	10461,{/* 2857 */
	mes "[�g����]";
	mes "����H�ׂ�������Ȃ��āA";
	mes "�Ⴄ�����H�ׂ����ȁc�c�B";
	close;
}

icecastle.gat,103,227,5	script	�`������#ep19in	10461,{/* 2858 */
	mes "[�`������]";
	mes "�[�т͉���H�ׂ悤�c�c�B";
	close;
}

icecastle.gat,149,216,3	script	�{����#ep19in	21516,{/* 2859 */
	mes "[�{����]";
	mes "�Ζ����A�ُ킠��܂�������B";
	close;
}

icecastle.gat,241,115,5	script	�{������#ep19in	21515,{/* 2860 */
	mes "[�{������]";
	mes "�Ζ����A�ُ킠��܂�������B�ւ������I";
	close;
}

icecastle.gat,35,224,7	script	�{����#ep19in	21516,{/* 2861 */
	mes "[�{����]";
	mes "�Ζ����A�ُ킠��܂�������B";
	close;
}

jor_back1.gat,376,247,5	script	�{����#ep19in	21515,{/* 2862 */
	mes "[�{����]";
	mes "�Ζ����A�ُ킠��܂�������B";
	close;
}

jor_tail.gat,239,40,5	script	�S����#ep19in	21515,{/* 2863 */
	mes "[�S����]";
	mes "�Ζ����A�ُ킠��܂���I";
	close;
}

jor_tail.gat,285,94,5	script	�h����#ep19in	21515,{/* 2864 */
	mes "[�h����]";
	mes "�Ζ����c�c����H�m��Ȃ��l�Ԃ��ȁB";
	mes "���ׂЂ��Ȃ��悤�ɋC��t���ĂˁB";
	mes "�H�т��S���Ȃ����c�������ɁB";
	close;
}

jor_tail.gat,56,196,3	script	�|��������#ep19in	21515,{/* 2865 */
	mes "[�|��������]";
	mes "���[���c�c�Â��ɁB";
	mes "�ނ���ז����Ȃ��ł���B";
	mes "���̒ނ��֍s���Ă݂āB";
	close;
}

jor_back1.gat,95,256,5	script	�g����#ep19in	21515,{/* 2866 */
	mes "[�g����]";
	mes "�l�ԁA���̕X�̌����̏�ɂ͏オ��ȁB";
	mes "����ł��܂��B�C��t���Ȃ��ƁB";
	close;
}

jor_back1.gat,81,266,5	script	�R����#ep19in	21516,{/* 2867 */
	mes "[�R����]";
	mes "�Ζ����A�ُ킠��܂�������B�ւ������I";
	close;
}

icecastle.gat,101,216,5	script	�S������#ep19in	10461,{/* 2868 */
	mes "[�S������]";
	mes "������H";
	mes "���O�������悤�Ȏq�����΂�����āH";
	mes "�S�R�Ⴄ��H";
	mes "���O�������������Ȃ������Ȃ񂾁B";
	close;
}

icecastle.gat,103,216,3	script	�S����#ep19in	10461,{/* 2869 */
	mes "�]�Â��ɖтÂ��낢�����Ă���]";
	close;
}

icecastle.gat,241,146,7	script	�`������#ep19in	10461,{/* 2870 */
	mes "[�`������]";
	mes "���̕ӂɂ�";
	mes "����Ȍ����ڂ̐����͂��Ȃ����ǁA";
	mes "����c�l�������{���́A";
	mes "����Ƃ�������Ȃ̂��ȁH";
	close;
}

icecastle.gat,243,147,7	script	�X�̒�����#1	111,{/* 2871 */
	mes "��i��:";
	mes "���@�@�@��";
	mes "�X�̏�̒n������@��o������Ԍ����X�ŁA";
	mes "�W�F�t�@�[�\���E�G�C�~�[�E�G�g�E�\�������E�A���X�^�[�E";
	mes "�N���[�t�E�G�f�B�X�E���j�J�[�E�A���X�E�j�[�}��������B";
	mes "�@";
	mes "�]�x���F���ɏ��Ȃ��ł��������]";
	messize 180,364;
	close;
}

icecastle.gat,248,211,1	script	�h����#ep19in	10461,{/* 2872 */
	mes "[�h����]";
	mes "���̍�i�ɂ͓����̖��O��";
	mes "������Ă��Ȃ��B";
	mes "�������̑c���";
	mes "����Ȍ����ڂ������Ƃ������Ƃ��ȁH";
	close;
}

icecastle.gat,244,213,7	script	�X�̒�����#2	111,{/* 2873 */
	mes "��i��:";
	mes "���E�҂Ȑ�c�̍���";
	mes "�X�̏�̒n������@��o������Ԍ����X�ŁA";
	mes "�W�F�t�@�[�\���E�G�C�~�[�E�G�g�E�\�������E�A���X�^�[�E";
	mes "�N���[�t�E�G�f�B�X�E���j�J�[�E�A���X�E�j�[�}��������B";
	mes "�@";
	mes "�]�x���F���ɏ��Ȃ��ł��������]";
	messize 180,364;
	close;
}

icecastle.gat,172,153,3	script	�m����#ep19in	10461,{/* 2874 */
	unittalk getcharid(3),strcharinfo(0)+" : �]���������ꏊ��؂Ȃ��ڍ����Ō��߂Ă���悤���B���ɉ����̎������킯�ł͖����������]",1;
	end;
}

icecastle.gat,129,121,3	script	�z��������#1	10461,{/* 2875 */
	unittalk getcharid(3),strcharinfo(0)+" : �]�A�[�E�B���̎q���������A�C�̒���ڂ��L���L�������Ȃ���`������ł���B�������Ă���悤���B�]",1;
	end;
}

icecastle.gat,131,121,3	script	�h��������#ep19in	10461,{/* 2876 */
	unittalk getcharid(3),strcharinfo(0)+" : �]�A�[�E�B���̎q���������A�C�̒���ڂ��L���L�������Ȃ���`������ł���B�������Ă���悤���B�]",1;
	end;
}

icecastle.gat,130,136,5	script	�\������#ep19in	21514,{/* 2877 */
	mes "[�\������]";
	mes "�ӂ��c�c�I";
	mes "�͂��I�͂����I";
	mes "�������I";
	close;
}

icecastle.gat,49,98,5	script	�]����#1	10461,{/* 2878 */
	mes "[�]����]";
	mes "�l�Ԃ͑�l����ˁH";
	mes "��l�͖{���̃p�g���[���������邩��A";
	mes "�������̃p�g���[�����������V�тɂ�";
	mes "����Ă����Ȃ���B";
	close2;
	if('flag == 0) {
		set 'flag,rand(1,5);
		sleep 1000;
		set '@timer,'flag==1? 500: 1000;
		setarray '@name$,"�]����#1","�m����#1","�h������#1","�`����������#1";
		setarray '@mes$,	"���㒍�ӁI","���㒍�ӁI","���㒍�ӁI","���ӁI",
							"���I","���I","���I","�ӁI",
							"(�Ђ��Ђ�)","(�ԂԂ�)","�Ȃ�Č����Ă�́H","��������ā`",
							"���O�����Ɏ��]�����I","���������I","�ٖ����I","���������I",
							"�ɁI","�ɁI","����I","���I";
		for(set '@i,0; '@i < 4; set '@i,'@i+1) {
			unittalk getnpcid(0,'@name$['@i]),substr('@name$['@i],0,-2)+ " : " +'@mes$[('flag-1)*4+'@i];
			sleep '@timer;
		}
		set 'flag,0;
	}
	end;
}

icecastle.gat,47,100,5	script	�m����#1	10461,{/* 2879 */
	mes "[�m����]";
	mes "�l�Ԃ͑�l����ˁH";
	mes "��l�͖{���̃p�g���[����������āB";
	mes "�������͂��̕ӂ̒S������B";
	close;
}

icecastle.gat,45,102,5	script	�h������#1	10461,{/* 2880 */
	mes "[�h������]";
	mes "�l�Ԃ͑�l����ˁH";
	mes "��l�͖{���̃p�g���[����������āB";
	mes "�������̌P�����ז����Ȃ��ŁB";
	close;
}

icecastle.gat,43,104,5	script	�`����������#1	10461,{/* 2881 */
	mes "[�`����������]";
	mes "�l�Ԃ͑�l����ˁH";
	mes "��l�͖{���̃p�g���[����������āB";
	mes "�������̂�邱�Ƃ�`�����ɁB";
	close;
}

icecastle.gat,77,106,3	script	��������#ep19in	10461,{/* 2882 */
	mes "[��������]";
	mes "�V�N����Ȃ����͂ȁA";
	mes "�������炦���̐S����B";
	mes "��c��X�`���Z������B";
	mes "�����Ă����悤���H";
	next;
	if(select("����","�K�v�Ȃ�") == 2) {
		mes "[��������]";
		mes "�c�O���ȁB";
		close;
	}
	mes "[��������]";
	mes "�悵�A�����悸���҂������΂��Łc";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�c�c�B";
	next;
	mes "[��������]";
	mes "�c�c�B";
	next;
	mes "[��������]";
	mes "�l�Ԃɂ͂����΂����Ȃ��B";
	mes "�����Ƃ��Ă��B";
	close;
}

icecastle.gat,73,101,7	script	�`��������#ep19in	10461,{/* 2883 */
	mes "�]���������̋Z���A";
	mes "�@�^���ɖڂɏĂ��t���Ă���悤���]";
	close2;
	unittalk getnpcid(0,"��������#ep19in"),"�������� : �`���������A�N�������Ƒ傫���Ȃ����狳���Ă����悤�B";
	unittalk getnpcid(0,"�`��������#ep19in"),"�`�������� : ����I";
	end;
}

icecastle.gat,90,100,3	script	�m��������#ep19in	10461,{/* 2884 */
	mes "[�m��������]";
	mes "�l�Ԃ��A��t�ǂ����H";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "����͂ȂɁH";
	next;
	mes "[�m��������]";
	mes "�A�h�J������B�̂��M���Ȃ�B";
	next;
	mes "�]�����������A���R�[���̓���������";
	mes "�@�H�тɉB��Č����Ȃ�";
	mes "�@�A�[�E�B���̊炪�A";
	mes "�@�^���Ԃɐ��܂��Ă������Ȋ������]";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "���\�ł��B";
	next;
	mes "[�m��������]";
	mes "���������̂ɁB";
	close;
}

icecastle.gat,86,100,5	script	�|����#ep19in	10461,{/* 2885 */
	mes "[�|����]";
	mes "�l�ԁA���͍D�������H";
	mes "��������ނƉ��܂��B";
	mes "�s���J���Ŏd���񂾎������ǁA";
	mes "�����Ȃ��B";
	next;
	mes "�]�����������A���R�[���̓����ƁA";
	mes "�@�[�����J���̍��肪������A";
	mes "�@��肭���a���Ă���]";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�c�c���\�ł��B";
	next;
	mes "[�|����]";
	mes "���̃��J�����������ĐH�ׂĂ�";
	mes "���������̂Ɂc�c�c�O���ȁB";
	close;
}
icecastle.gat,85,95,5	script	�g����#ep19in	10461,{/* 2886 */
	mes "[�g����]";
	mes "����͂����Ȃ���I";
	mes "�l�Ԃ��H�ׂ����Ȃ�A";
	mes "�������ŕX���ӂ��Ă����B";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "����͂ȂɁH";
	next;
	mes "[�g����]";
	mes "�X�m�[�X���b�V���I";
	mes "�����΂��ŕX���ӂ��āA";
	mes "�J���}������؂荏�񂾂��̂�";
	mes "�܂Ԃ��Ƃł��邯�ǁc�c�B";
	next;
	mes "[�g����]";
	mes "�l�Ԃ͂����΂����Ȃ���ˁB";
	mes "�s�ւ����B";
	close2;
	unittalk getnpcid(0,"�|����#ep19in"),"�|���� : ����ȁc�c�����΂��������Ƃ́c�c";
	unittalk getnpcid(0,"�I����#ep19in"),"�I���� : ����ȁc�c";
	unittalk getnpcid(0,"�m��������#ep19in"),"�m�������� : �Ђ����B";
	end;
}

icecastle.gat,89,94,3	script	�I����#ep19in	10461,{/* 2887 */
	mes "[�I����]";
	mes "��l�Ȃ��������ł������B";
	mes "���͊O�ł͈��߂Ȃ���B";
	mes "�����ŕX��n�����Ĉ���ŁB";
	close;
}

icas_in.gat,95,57,0	script	�C�[�O���p�g���[����#iw	139,{/* 2889 */}
icas_in.gat,95,62,6	script	�C�[�O���p�g���[����#iw	858,{/* 2890 */}

icas_in.gat,33,53,8	script	�ꓙ���z������#in_iwp	21513,{/* 2891 */
	cutin "ep19_iwin08.png", 2;
	emotion 56,"�ꓙ���z������#in_iwp";
	unittalk "�ꓙ���z������ : �ꓙ���z������!",1;
	if(!sleep2(1000)) end;
	cutin "ep19_iwin09.png", 2;
	mes "[�ꓙ���z������]";
	mes "�����I";
	mes "�Ȃ񂾁A��C�A�[�E�B������Ȃ��ȁB";
	mes "�������c�c�����đ������c�c�B";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�ꓙ���z������#in_iwp(2891)
	end;
}

icas_in.gat,42,53,8	script	�V���|������#s_iw	21513,{/* 2892 */
	unittalk "Z.....z....z...";
	unittalk getcharid(3),strcharinfo(0)+" : �[�������Ă���B",1;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�V���|������#s_iw(2892)
	end;
}

icas_in.gat,51,53,8	script	�V���z������#s_iw	21513,{/* 2893 */
	unittalk "z Z z Z z";
	unittalk getcharid(3),strcharinfo(0)+" : �[�������Ă���B",1;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�V���z������#s_iw(2893)
	end;
}

icas_in.gat,33,68,4	script	�H�H�H�S����#s_iw	21513,{/* 2894 */
	unittalk "zzzz..ZZ..zzz",1;
	unittalk getcharid(3),strcharinfo(0)+" : �[�������Ă���B",1;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�H�H�H�S����#s_iw(2894)
	end;
}

icas_in.gat,42,68,4	script	�񓙕��g����#s_iw	21513,{/* 2895 */
	unittalk "zz zZz zz zZz";
	unittalk getcharid(3),strcharinfo(0)+" : �[�������Ă���B",1;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�񓙕��g����#s_iw(2895)
	end;
}

icas_in.gat,51,68,4	script	�񓙕��g������#s_iw	21513,{/* 2896 */
	unittalk "�cz�c�cZ�cZ�cz";
	unittalk getcharid(3),strcharinfo(0)+" : �[�������Ă���B",1;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�񓙕��g������#s_iw(2896)
	end;
}

icas_in.gat,56,60,2	script	�V�������I������#c_iw	21518,{/* 2897 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,42,57,6	script	�V���|������#m_iw	21514,{/* 2898 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,52,57,6	script	�V���z������#m_iw	21514,{/* 2899 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,33,65,4	script	�H�H�H�S����#m_iw	21517,{/* 2900 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,42,65,6	script	�񓙕��g����#m_iw	21515,{/* 2901 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,49,65,6	script	�񓙕��g������#m_iw	21515,{/* 2902 (hide)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

// �򉻂̐���
icas_in.gat,163,226,0	script	#ep19_healrock_sw_1	139,4,4,{/* 2903 */
	switch(EP19_2QUE) {
	case 4:
		cloakoffnpc "���H�[�N�����f#ep19";
		cloakoffnpc "���n�[��#ep19_2";
		cloakonnpc "�}����#ep19";
		cloakonnpc "�~���A��#ep19";
		cloakonnpc "���n�[��#ep19";
		end;
	case 5:
		cloakoffnpc "���H�[�N�����f#ep19";
		cloakoffnpc "���n�[��#ep19_2";
		end;
	case 6:
	case 7:
		end;
	default:
		if(EP19_1QUE >= 12)
			cloakoffnpc "���H�[�N�����f#ep19";
		end;
	}
	end;
}
icas_in.gat,163,226,3	script	���H�[�N�����f#ep19	10467,{/* 2904 (cloaking)*/
	switch(EP19_2QUE) {
	case 0:
		if(EP19_1QUE < 12)
			end;
		mes "[���H�[�N�����f]";
		mes "�悭�����ˁI";
		mes "���n�[���͂ǂ������񂾂��H";
		cloakoffnpc "���H�[�N�����f#ep19";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "���n�[���͑��̗p�������邩��A";
		mes "��ɍs���ƌ���ꂽ���āH";
		mes "���̎q�͂��������΂��肪";
		mes "�Z�����񂾂���B";
		mes "�����c�c�B";
		next;
		mes "[���H�[�N�����f]";
		mes "�����邩������Ȃ��q��";
		mes "�҂ɂ͂Ȃ��ȁB";
		mes "���΂���A";
		mes "�����������Ƃ�����񂾂��ǁA";
		mes "���Ԃ͑��v�����H";
		next;
		if(select("���v�ł�","�Z�����ł�") == 2) {
			mes "[���H�[�N�����f]";
			mes "���������B";
			mes "����Ȃ�d�����Ȃ����ˁB";
			mes "�Z�������낤����A";
			mes "�����d���ɖ߂�Ƃ������B";
			cutin "ep19_voglinde02.png", 0;
			close2;
			cutin "ep19_voglinde02.png", 255;
			end;
		}
		mes "[���H�[�N�����f]";
		mes "���������I";
		mes "���肪�Ƃ��ˁI";
		mes "���ꂶ�Ⴀ�A�悸��";
		mes "�������痈�Ă������󂢂Ă邾�낤����A";
		mes "���������H�ׁB";
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep19_friederike04.png", 255;
			end;
		}
		setquest 130500;
		delquest 18128;
		set EP19_2QUE,1;
		getitem 12322,1;
		cutin "ep19_voglinde04.png", 0;
		close2;
		//showevent 0, 3, "���H�[�N�����f#ep19";	// 2890: 163, 226
		cutin "ep19_voglinde04.png", 255;
		end;
	case 1:
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�債�����Ƃ���Ȃ��񂾂��A";
		mes "��s�D�ɏ���ė������̂��Ƃ�";
		mes "�v���o���Ă�����B";
		next;
		mes "[���H�[�N�����f]";
		mes "�ꏏ�ɏ���Ă����l�����̒��ɁA";
		mes "^e5555e���̖т�����ȂɁc�c";
		mes "^e5555e����A����Ȃ��񂾂������ˁH";
		mes "^e5555e�w���e�R�Ȋ����������J�[�f�B�i��^000000�́A";
		mes "���Ȃ����������H";
		next;
		mes "[���H�[�N�����f]";
		mes "����������ӂ�ŁA���܂Ȃ��ˁB";
		mes "���������֗��Ă����";
		mes "�莆�̌�������������A";
		mes "���Ɍ��Ă��Ȃ��āA";
		mes "�m�M�����ĂȂ��񂾁B";
		next;
		menu "���Ă܂���",-;
		mes "[���H�[�N�����f]";
		mes "���������c�c�B";
		mes "��J���Ďx�����������񂾂��ˁc�c";
		mes "�͂��c�c�{���ɓ����ɂ��B";
		mes "���n�[���ɂ�^e5555e�v�����e��^000000����";
		mes "�A��Ă���悤�Ɍ����Ă������񂾂��ˁB";
		next;
		mes "[���H�[�N�����f]";
		mes "���̎q�͂��̎q��";
		mes "���I�������Ƃ̊獇�킹��";
		mes "�I������r�[�ɏ����āA";
		mes "�ǂ��֍s�����̂���������Ȃ����c�c�B";
		mes "����Ȃ��Ƃ��Ă�ꍇ����Ȃ��񂾂��ˁB";
		mes "���[��c�c�ǂ��������񂩁B";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "���܂Ȃ����A";
		mes "����݂𕷂��Ă���Ȃ������H";
		mes "���A���΂���͖Z���߂��āA";
		mes "�����𗣂���Ȃ��񂾁B";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "^e5555e��s�D�Ɉꏏ�ɏ���Ă����q����^000000�ɁA";
		mes "^e5555e�F�̕��ŁA���̒����A";
		mes "^e5555e�x�[���������J�[�f�B�i��^000000��";
		mes "���Ȃ��������m�F���Ă��Ă���邩���H";
		mes "��������č��͏ڂ����b���Ȃ����A";
		mes "�{���ɏd�v�Ȏq�Ȃ񂾁B";
		close2;
		cloakoffnpc "�}����#ep19";
		cutin "ep19_voglinde01.png", 255;
		setquest 11794;
		delquest 130500;
		set EP19_2QUE,2;
		mes "�]�}�����̂��Ƃ֌������܂����H�]";
		next;
		//showevent 0, 3, "�}����#ep19";	// 2894: 130, 201
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�}�����̂��Ƃ֌��������]";
		close2;
		warp "icas_in.gat", 132, 199;	// from: icas_in.gat(161, 226)
		end;
	case 2:
	case 3:
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "^e5555e��s�D�Ɉꏏ�ɏ���Ă����q����^000000�ɁA";
		mes "^e5555e�F�̕��ŁA���̒����A";
		mes "^e5555e�x�[���������J�[�f�B�i��^000000��";
		mes "���Ȃ��������m�F���Ă��Ă���邩���H";
		mes "��������č��͏ڂ����b���Ȃ����A";
		mes "�{���ɏd�v�Ȏq�Ȃ񂾁B";
		next;
		cloakoffnpc "�}����#ep19";
		cutin "ep19_voglinde01.png", 255;
		mes "�]�}�����̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�}�����̂��Ƃ֌��������]";
		close2;
		warp "icas_in.gat", 132, 199;	// from: icas_in.gat(161, 226)
		end;
	case 4:
		mes "[���H�[�N�����f]";
		mes "����A�߂��Ă����񂾂ˁB";
		mes "�O�͊����ċ�J�������낤�H";
		mes "����ŁA���̎q�͌������������H";
		cutin "ep19_voglinde01.png", 0;
		next;
		menu "�����Ɍ���",-;
		mes "[���H�[�N�����f]";
		mes "<FONT SIZE = 16><B>�܂��I�I</FONT></B>";
		mes "<FONT SIZE = 16><B>���ꂽ�c�c�{���ɁI</FONT></B>";
		mes "<FONT SIZE = 16><B>�{���ɕ��ꂽ��I���̎q�́I</FONT></B>";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[���n�[��]";
		mes "�Ⴂ�܂��I";
		mes "���ꂳ��I���������āI";
		mes "���ꂳ��A��������Ȃ���ł��I";
		cutin "ep19_lehar05.png", 2;
		cloakoffnpc "���n�[��#ep19_2";
		next;
		mes "[���H�[�N�����f]";
		mes "<FONT SIZE = 16><B>��������Ȃ��Ȃ�A�����Ƃ����񂾁I</FONT></B>";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "������A�Y��Ȃ��悤�ɂ�";
		mes "����Ȃɒ��ӂ�������Ȃ����I";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�͂��c�c�d���Ȃ��ˁB";
		mes "�������̎q�A";
		mes "�����񂾂�������A";
		mes "���΂���̗��݂𕷂��Ă���邩���H";
		next;
		mes "[���H�[�N�����f]";
		mes "�����܂ŋ�J���Ă��Ă�������̂�";
		mes "�\����Ȃ��񂾂��A";
		mes "�܂�^e5555e�~�b�h�K���h^000000�֖߂��āA";
		mes "�J�[�f�B�i���̎q��";
		mes "���t���Ă��Ă���Ȃ������H";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�~�b�h�K���h�ɖ߂�ۂɂ́A";
		mes "�w�����b�N�Ƃ����g�i�J�C�݂����Ȏq��";
		mes "���ɂȂ��Ă����B";
		mes "�N��������s�D�Œ��������ꏊ�̋߂���";
		mes "���邩��A�܂��͂����֌������Ă�����B";
		mes "�b�͂��΂��񂩂�ʂ��Ă����B";
		next;
		mes "[���H�[�N�����f]";
		mes "�w�����b�N�N��";
		mes "�A���f�o�����܂ł�";
		mes "�A��čs���Ă����͂�������A";
		mes "���̌��^0000ff�v�����e���̑吹��^000000�Ɍ������A";
		mes "^0000ff�A���X^000000�Ƃ���";
		mes "�A�R���C�g�S�����ɉ���Ă�����B";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�A���X�ɉ���Ȃ�A";
		mes "���H�[�N�����f����";
		mes "<B>^0000ff����^000000</B>�̌��ň˗����󂯂�";
		mes "�Ɠ`����Θb�͒ʂ���͂����B";
		next;
		mes "[���H�[�N�����f]";
		mes "�����āA���A���̂��Ƃɂ��Ă�";
		mes "�N�ɂ��b�����Ⴂ���Ȃ���B";
		mes "�������H";
		mes "���ꂶ��A��낵�����ނ�B";
		cutin "ep19_voglinde04.png", 0;
		next;
		cutin "ep19_voglinde02.png", 255;
		setquest 11797;
		delquest 11796;
		set EP19_2QUE,5;
		//showevent 0, 3, "���H�[�N�����f#ep19";	// 2890: 163, 226
		//showevent 0, 3, "�w�����b�N#ep19";	// 2896: 211, 63
		unittalk getnpcid(0,"���n�[��#ep19_2"),"���n�[�� : ���ꂳ��I���̌��͎���������x�����Ă��܂�����I";
		unittalk getnpcid(0,"���H�[�N�����f#ep19"),"���H�[�N�����f : ���񂽂͂�����Ƙb�����邩��A�ق��ė�q���܂ŕt���Ă��Ȃ����B";
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"���n�[��#ep19_2"),"���n�[�� : ������O���m��Ȃ��̂ɁA�ǂ�����Ċm�F�����ł����I���ꂳ��I�I���͖����ł���I�N�Ȃ̂����O�������Ă���Ȃ���������Ȃ��ł����I�I";
		unittalk getnpcid(0,"���H�[�N�����f#ep19"),"���H�[�N�����f : �ǂ����ĕ�����Ȃ��񂾂��I�I�̂���������Ȃ����I�I";
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"���n�[��#ep19_2"),"���n�[�� : ���N�O�̘b�ł����I�I���������ɉ�����؂肶��Ȃ��ł����I���ꂳ��I�I�����I�I�҂��Ă��������I�I�I"+strcharinfo(0)+"�l�I�����āI���A���̂܂܂���c�c�I�I�I�I";
		unittalk getnpcid(0,"���H�[�N�����f#ep19"),"���H�[�N�����f : �N������ĐH���Ƃł������񂾂��H�������ȁI";
		if(!sleep2(3000)) end;
		mes "�]�w�����b�N�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�w�����b�N�̂��Ƃ֌��������]";
		close2;
		warp "jor_tail.gat", 214, 61;	// from: icas_in.gat(157, 229)
		end;
	case 5:
		cloakoffnpc "���H�[�N�����f#ep19";
		mes "[���H�[�N�����f]";
		mes "�w�����b�N�N��";
		mes "�A���f�o�����܂ł�";
		mes "�A��čs���Ă����͂�������A";
		mes "���̌��^0000ff�v�����e���̑吹��^000000�Ɍ������A";
		mes "^0000ff�A���X^000000�Ƃ���";
		mes "�A�R���C�g�S�����ɉ���Ă�����B";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�A���X�ɉ���Ȃ�A";
		mes "���H�[�N�����f����";
		mes "<B>^0000ff����^000000</B>�̌��ň˗����󂯂�";
		mes "�Ɠ`����Θb�͒ʂ���͂����B";
		cutin "ep19_voglinde02.png", 255;
		mes "�]�w�����b�N�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�w�����b�N�̂��Ƃ֌��������]";
		close2;
		warp "jor_tail.gat", 214, 61;	// from: icas_in.gat(159, 224)
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,162,228,5	script	���n�[��#ep19_2	10469,{/* 2905 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,130,201,0	script	#ep19_healrock_sw_2	139,4,4,{/* 2906 */
	switch(EP19_2QUE) {
	case 2:
		cloakoffnpc "�}����#ep19";
		end;
	case 3:
		cloakoffnpc "�}����#ep19";
		cloakoffnpc "���n�[��#ep19";
		end;
	case 4:
		cloakoffnpc "�}����#ep19";
		cloakoffnpc "�~���A��#ep19";
		cloakoffnpc "���n�[��#ep19";
		end;
	}
	end;
}
icas_in.gat,132,201,3	script	�~���A��#ep19	10377,{/* 2907 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,130,201,5	script	�}����#ep19	10376,{/* 2908 (cloaking)*/
	switch(EP19_2QUE) {
	case 2:
		cloakoffnpc "�}����#ep19";
		mes "[�}����]";
		mes "�����͊D�F�T�̑��Ƃ�";
		mes "��ׂ��Ȃ��قǊ����ł��ˁB";
		mes "���w���c�c����~�b�h�K���h�嗤��";
		mes "����Ă���ȏꏊ�܂ł���Ƃ́A";
		mes "���G�ȋC�����ł��B";
		cutin "ep18_maram_03.png", 2;
		next;
		mes "[�}����]";
		mes "�X�����Ȃ��ꏊ������s�v�c�ł�����A";
		mes "�i�X�����ӔC�������̂������Ă���";
		mes "�s���ł�����c�c�B";
		next;
		mes "[�}����]";
		mes "���c�c�g�̏�b�������������킯�ł�";
		mes "�Ȃ���ł��B";
		mes "�P�ɖ��ȋC���ɂȂ��������Ȃ̂ŁA";
		mes "�C�ɂ��Ȃ��ł��������B";
		cutin "ep18_maram_02.png", 2;
		next;
		mes "[�}����]";
		mes "�����艽���p����������";
		mes "�l�̏��ɗ�����ł���ˁH";
		mes "�ǂ��������p���ł����H";
		cutin "ep18_maram_01.png", 2;
		next;
		menu "�J�[�f�B�i���ɂ��ĕ���",-;
		mes "[�}����]";
		mes "�J�[�f�B�i���̕��ł����c�c�B";
		mes "����ȕ��͂��Ȃ������Ƃ������܂����c�c";
		mes "�������A��s�D�Ɉꏏ�ɏ���Ă����Ȃ�";
		mes "�C�Â��Ȃ��͂��͂Ȃ��ł��ˁB";
		mes "�l���������Ȃ������ł����B";
		next;
		mes "[�}����]";
		mes "�����A��񂪏��Ȃ����܂��ˁB";
		mes "^e5555e���n�[��^000000�l�ɒ��ڕ����Ă݂������A";
		mes "��������Ȃ��ł��傤���H";
		cutin "ep18_maram_03.png", 2;
		next;
		menu "���n�[���ɕt���ĕ���",-;
		mes "[�}����]";
		mes "���n�[���l�Ȃ�A";
		mes "�����O�ɊO�֏o�������݂����ł����c�c�B";
		next;
		mes "[�}����]";
		mes "�����A���傤�ǖ߂��Ă����݂����ł��ˁB";
		mes "���n�[���l�I�I";
		cutin "ep18_maram_02.png", 2;
		cloakoffnpc "���n�[��#ep19";
		setquest 11795;
		delquest 11794;
		set EP19_2QUE,3;
		close2;
		//showevent 9999, 0, "�}����#ep19";	// 2894: 130, 201
		//showevent 0, 3, "���n�[��#ep19";	// 2895: 136, 197
		cutin "ep18_maram_02.png", 255;
		end;
	case 3:
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���傤�ǃ��n�[���l��";
		mes "�߂��Ă����݂����ł���B";
		close2;
		cutin "ep18_maram_01.png", 255;
		cloakoffnpc "���n�[��#ep19";
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,136,197,3	script	���n�[��#ep19	10469,{/* 2909 (cloaking)*/
	switch(EP19_2QUE) {
	case 3:
		mes "[���n�[��]";
		mes "���ł����H";
		mes "���͖Z��������A";
		mes "�}�p����Ȃ���Ό�ɂ���";
		mes "�ق����̂ł����c�c�B";
		cutin "ep19_lehar01.png", 2;
		next;
		menu "�J�[�f�B�i���ɂ��ĕ���",-;
		mes "[���n�[��]";
		mes "^e5555e���������Đ�����";
		mes "^e5555e�x�[���������J�[�f�B�i��^000000�ł����H";
		mes "��s�D�ň��A���������Ⴀ��܂��񂩁B";
		mes strcharinfo(0)+"������ꏏ�ɂ�������Ȃ��ł����B";
		cutin "ep19_lehar02.png", 2;
		next;
		mes "[�}����]";
		mes "�ꏏ�ɂ����ł����āH";
		cutin "ep18_maram_03.png", 2;
		hideoffnpc "�}����#ep19";
		next;
		mes "[���n�[��]";
		mes "�͂��B";
		mes "�}�����l���悭���������Ⴀ��܂��񂩁H";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�}����]";
		mes "�H�H�H";
		cutin "ep18_maram_03.png", 2;
		next;
		mes "[�~���A��]";
		mes "�}����!";
		mes "�����ŉ�����Ă�́I";
		mes "�̂�т肵�Ă�ꍇ����Ȃ���I�I";
		cutin "ep18_miriam_01.png", 0;
		cloakoffnpc "�~���A��#ep19";
		next;
		mes "[�~���A��]";
		mes "�������̗\������߂悤�B";
		mes "���������H�[�N�����f�l��";
		mes "�����b���������������B";
		next;
		mes "[�}����]";
		mes "���������āA�~���A���B";
		mes "�悸�͑��̕�������";
		mes "�c�_�����Ȃ��Ƃ����Ȃ�����B";
		cutin "ep18_maram_01.png", 2;
		next;
		mes "[���n�[��]";
		mes "���傤�ǂ�������Ⴂ�܂����ˁB";
		mes "^e5555e���������āA�����ɁA";
		mes "^e5555e�x�[���������J�[�f�B�i���I�I^000000";
		cutin "ep19_lehar02.png", 2;
		next;
		mes "[�}����]";
		mes "�����c�c�H";
		cutin "ep18_maram_01.png", 2;
		next;
		mes "[�~���A��]";
		mes "����c�c�H";
		mes "�{�N�̓J�[�f�B�i������Ȃ���H";
		cutin "ep18_miriam_03.png", 0;
		next;
		mes "[���n�[��]";
		mes "�c�c�����H";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "�]���n�[���̊z����A";
		mes "�@��⊾����̂悤�ɗ���n�߂��]";
		next;
		mes "[�~���A��]";
		mes "���n�[���l�A�}�ɂǂ�����܂������H";
		mes "��F�������ł����A��ł������̂ł����H";
		cutin "ep18_miriam_03.png", 0;
		unittalk getnpcid(0,"�~���A��#ep19"),"�~���A�� : �⊾���I�I�I";
		next;
		mes "[���n�[��]";
		mes "����c�c������ƃ~���A���l�A";
		mes "�v�����e�������̂��́c�c";
		mes "�A���X�l�̏Љ�ŁA���́c�c";
		mes "�ɔ�́c�c�B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�~���A��]";
		mes "�{�N�̓}�����ƈꏏ��";
		mes "���w�����痈����H";
		cutin "ep18_miriam_03.png", 0;
		next;
		mes "[���n�[��]";
		mes "�����c�c�B";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[���n�[��]";
		mes "����́c�c�������Ⴂ���Ă����c�c�H";
		mes "���A���S�ɏI��c�c�B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�}����]";
		mes "���`��c�c";
		mes "�����悭������܂��񂪁A";
		mes "���n�[���l��";
		mes "�������Q�ĂĂ���Ƃ�����݂�ƁA";
		mes "��U�A^e5555e���H�[�N�����f^000000�l��";
		mes "�b�����������悳�����ł��ˁB";
		cutin "ep18_maram_03.png", 2;
		next;
		menu "�������悤",-;
		mes "[���n�[��]";
		mes "<FONT SIZE = 16><B>������Ƒ҂��Ă��������I�I</FONT></B>";
		mes "<FONT SIZE = 16><B>�_���ł��I�I���ꂾ���́I</FONT></B>";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[���n�[��]";
		mes "<FONT SIZE = 16><B>���A�E���ꂿ�Ⴂ�܂���I</FONT></B>";
		mes strcharinfo(0)+"�l�I�I�I";
		cutin "ep19_lehar04.png", 2;
		setquest 11796;
		delquest 11795;
		set EP19_2QUE,4;
		close2;
		//showevent 0, 3, "���H�[�N�����f#ep19";	// 2890: 163, 226
		//showevent 9999, 0, "�}����#ep19";	// 2894: 130, 201
		//showevent 9999, 0, "���n�[��#ep19";	// 2895: 136, 197
		cutin "ep19_lehar04.png", 255;
		end;
	case 4:
		cloakoffnpc "�}����#ep19";
		cloakoffnpc "�~���A��#ep19";
		cloakoffnpc "���n�[��#ep19";
		mes "[���n�[��]";
		mes "<FONT SIZE = 16><B>���肢���܂��I</FONT></B>";
		mes "<FONT SIZE = 16><B>�f��ɂ͓����ɂ��Ă��������I</FONT></B>";
		mes "<FONT SIZE = 16><B>���A�E���ꂿ�Ⴂ�܂���I</FONT></B>";
		mes strcharinfo(0)+"�l�I�I�I";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�}����]";
		mes "��U�A^e5555e���H�[�N�����f^000000�l��";
		mes "�b���ɍs���܂��傤�B";
		cutin "ep18_maram_03.png", 2;
		close2;
		cutin "ep19_lehar04.png", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_tail.gat,211,63,5	script	�w�����b�N#ep19	10460,{/* 2910 */
	switch(EP19_2QUE) {
	case 5:
		mes "[�w�����b�N]";
		mes "�����B";
		mes "<FONT SIZE = 16><B>����ɂ��́B</FONT></B>";
		mes strcharinfo(0)+"����I";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[�w�����b�N]";
		mes "���H�[�N�����f�l����b�͕����Ă��܂��B";
		mes "^e5555e�~�b�h�i�C�g^000000��";
		mes "�s������ł�����ˁH";
		cutin "ep19_healrock01.png", 2;
		next;
		switch(select("�~�b�h�i�C�g�H","�~�b�h�K���h�嗤�̂��ƁH")) {
		case 1:
			mes "[�w�����b�N]";
			mes "�A���f�o����������A";
			mes "���������̑嗤�̂��Ƃł���I";
			break;
		case 2:
			mes "[�w�����b�N]";
			mes "����ł��I";
			break;
		}
		next;
		mes "[�w�����b�N]";
		mes strcharinfo(0)+"���񂾂��A";
		mes "�����������ł���ˁH";
		mes "������ƌy�����邯�ǁc�c";
		mes "���܂ł������悹��ׂ����ȁc�c�H";
		mes "���̂܂ܑ�������A�ؓ��������Ă��܂��B";
		next;
		menu "�ؓ��c�c�H",-;
		mes "[�w�����b�N]";
		mes "�����ƁA����B";
		mes "�Ƃɂ��������o�����܂��傤�I";
		next;
		mes "[�w�����b�N]";
		mes "^e5555e�A���f�o����^000000�ɂ́A";
		mes "�������ڃ\���������Ĉړ����܂�����A";
		mes "�S�z���Ȃ��ł��������B";
		mes "���̍L���w����";
		mes "��������ƌŒ肵�܂�����I";
		next;
		mes "[�w�����b�N]";
		mes "�^���ɂ��Ȃ邵�I";
		mes "���Ɉ�Γ񒹂ł͂���܂��񂩁I";
		mes "�͂͂͂��I�I�I";
		next;
		if(select("�o��","�ҋ@") == 2) {
			mes "[�w�����b�N]";
			mes "�����ł����H";
			mes "�ł͏����ł�����b�������Ă��������ˁB";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
		mes "[�w�����b�N]";
		mes "�ł͏o�����܂���B";
		mes "��������͂܂��Ă��������I";
		setquest 11798;
		delquest 11797;
		set EP19_2QUE,6;
		close2;
		//showevent 0, 3, "�w�����b�N#ep19";	// 2896: 211, 63
		//showevent 0, 3, "�w�����b�N#ep19_a";	// 5716: 102, 103
		cutin "ep19_healrock01.png", 255;
		warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(222, 64) port : 5122
		end;
	case 6:
		mes "[�w�����b�N]";
		//mes "�Ƃɂ��������o�����Ă݂܂悤�I";
		mes "�Ƃɂ��������o�����Ă݂܂��傤�I";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[�w�����b�N]";
		mes "^e5555e�A���f�o����^000000�ɂ́A";
		mes "�������ڃ\���������Ĉړ����܂�����A";
		mes "�S�z���Ȃ��ł��������B";
		mes "���̍L���w����";
		mes "��������ƌŒ肵�܂�����I";
		next;
		mes "[�w�����b�N]";
		mes "�ł͏o�����܂���B";
		mes "��������͂܂��Ă��������I";
		close2;
		cutin "ep19_healrock01.png", 255;
		warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(216, 58) port : 5122
		end;
	case 17:
	case 18:
		mes "[�w�����b�N]";
		mes "�������c�c";
		mes "���c�c�������c�c�I�I";
		cutin "ep19_healrock03.png", 2;
		next;
		mes "[�w�����b�N]";
		mes "�������E�ł��c�c�I";
		mes "�\����Ȃ��ł����A�X�̏�܂ł́A";
		mes "�������ňړ������肢���܂��c�c�I";
		cutin "ep19_healrock03.png", 255;
		if(EP19_2QUE == 17) {
			setquest 130501;	showevent 0, 3, "���n�[��#ep19_3";	// 2902: 27, 123
			delquest 11809;
			set EP19_2QUE,18;
		}
		next;
		//showevent 0, 3, "�w�����b�N#ep19";	// 2896: 211, 63
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icecastle.gat", 23, 123;	// from: jor_tail.gat(214, 60)
		end;
	}
	if(EP19_2QUE >= 19) {
		mes "[�w�����b�N]";
		mes "����ɂ��́I�I�I";
		mes "�������A���f�o�����֍s����܂����H";
		mes "����Ƃ��A�X�̏�֖߂�܂����H";
		cutin "ep19_healrock01.png", 2;
		next;
		switch(select("�A���f�o������","�X�̏��","�ҋ@")) {
		case 1:
			mes "[�w�����b�N]";
			mes "�ł͏o�����܂���B";
			mes "��������߂܂��āI";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(214, 60) port : 5122
			end;
		case 2:
			mes "[�w�����b�N]";
			mes "�ł͏o�����܂���B";
			mes "��������߂܂��āI";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "icecastle.gat", 55, 120;	// from: jor_tail.gat(213, 62)
			end;
		case 3:
			mes "[�w�����b�N]";
			mes "�����ł����H";
			mes "�ł́A�����ł��܂�����";
			mes "�b�������Ă��������ˁB";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
	}
	else if(EP19_2QUE >= 7) {
		mes "[�w�����b�N]";
		mes "����ɂ��́I�I�I";
		mes "�������A���f�o�����֍s����܂����H";
		mes "����Ƃ��A�X�̏�֖߂�܂����H";
		cutin "ep19_healrock01.png", 2;
		next;
		switch(select("�A���f�o������","�X�̏��","�ҋ@")) {
		case 1:
			mes "[�w�����b�N]";
			mes "�ł͏o�����܂���B";
			mes "��������߂܂��āI";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "aldebaran.gat", 104, 105;	// from: jor_tail.gat(218, 67) port : 5122
			end;
		case 2:
			mes "[�w�����b�N]";
			mes "�ł͏o�����܂���B";
			mes "��������߂܂��āI";
			close2;
			cutin "ep19_healrock01.png", 255;
			warp "icecastle.gat", 55, 120;	// from: jor_tail.gat(219, 53)
			end;
		case 3:
			mes "[�w�����b�N]";
			mes "�����ł����H";
			mes "�ł́A�����ł��܂�����";
			mes "�b�������Ă��������ˁB";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
	}
	mes "[�w�����b�N]";
	mes "�ނ͂͂͂͂��I�I";
	mes "�ł́A�������ꐶ����";
	mes "�O�p�؂����g���Ă݂悤���I";
	cutin "ep19_healrock01.png", 2;
	close2;
	cutin "ep19_healrock01.png", 255;
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[�]��]";
	end;
}

aldebaran.gat,102,103,5	script	�w�����b�N#ep19_a	10460,{/* 5730 */
	switch(EP19_2QUE) {
	case 6:
	case 7:
		mes "[�w�����b�N]";
		mes "���I"+strcharinfo(0)+"�l�B";
		mes "����ƋC���t���܂������I";
		mes "�A���f�o�����ł��B";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[�w�����b�N]";
		mes "���͗l�X�ȋ���̏��ׂ�";
		mes "�v�����e���܂ōs���܂��񂩂�A";
		mes "�����ő҂��Ă܂��ˁB";
		mes "�p�����I�������";
		mes "^e5555e�A���f�o����^000000��";
		mes "���Ă��������B";
		if(EP19_2QUE == 6) {
			setquest 11799;
			delquest 11798;
			set EP19_2QUE,7;
		}
		next;
		//showevent 9999, 0, "�w�����b�N#ep19_a";	// 5716: 102, 103
		unittalk "�w�����b�N : ���͐܊p�~�b�h�K���h�ɗ����̂ŁA�V�������ꂽ�哤�^���p�N���p�E�_�[�𔃂�Ȃ���I",1;
		cutin "ep19_healrock01.png", 255;
		mes "�]�v�����e���֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�v�����e���֌��������]";
		close2;
		warp "prontera.gat", 254, 305;	// from: aldebaran.gat(108, 103) port : 5121
		end;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
		mes "[�w�����b�N]";
		mes "�v�����e���ł̗p����";
		mes "�S���I���܂������H";
		mes "�I�������^e5555e�A���f�o����^000000�ɗ��Ă��������B";
		cutin "ep19_healrock01.png", 2;
		close2;
		cutin "ep19_healrock01.png", 255;
		end;
	case 16:
	case 17:
	case 18:
		mes "[�w�����b�N]";
		mes "��������Ⴂ�܂������B";
		mes "�ł͂����Ɂc�c�҂��āc�c";
		mes "�l�������H�[�N�����f�l�̋��Ă������";
		mes "�����Ԃ�Ƒ����Ȃ��Ă��܂��񂩁c�c�H";
		mes "�J�[�f�B�i����1�l�̂͂�����c�c�B";
		cutin "ep19_healrock01.png", 2;
		next;
		mes "[�w�����b�N]";
		mes "����ɁA�F���񂪎�Ɏ����Ă��镨��";
		mes "�Ȃ�ł����H";
		mes "�ו�����������܂����āH";
		mes "������A��A�c�c������Ƒ҂��Ă��������I";
		next;
		mes "[�w�����b�N]";
		mes "���₢��A�_���Ƃ����󂶂�Ȃ���";
		mes "�ł��ˁc�c���́c�c";
		mes "�ו����c�c������Ɓc�c�B";
		cutin "ep19_healrock02.png", 2;
		next;
		if(select("�o��","�ҋ@") == 2) {
			mes "[�w�����b�N]";
			mes "�����ł����H";
			mes "�ł͏����ł��܂�����A";
			mes "�b�������Ă��������ˁB";
			close2;
			cutin "ep19_healrock02.png", 255;
			end;
		}
		mes "[�e���[���A��]";
		mes "����H�H";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[�w�����b�N]";
		mes "�ł͍s���܂��c�c";
		mes "�������������I�I�I";
		cutin "ep19_healrock02.png", 2;
		next;
		mes "[�w�����b�N]";
		mes "�������c�c�I";
		mes "�����Ă����c�c�I";
		mes "���c�c���̍��c�c�I";
		cutin "ep19_healrock03.png", 2;
		if(EP19_2QUE == 16) {
			setquest 11809;
			delquest 11808;
			set EP19_2QUE,17;
		}
		close2;
		//showevent 0, 3, "�w�����b�N#ep19_a";	// 5716: 102, 103
		cutin "ep19_healrock03.png", 255;
		warp "jor_tail.gat", 214, 60;	// from: aldebaran.gat(104, 105) port : 5121
		end;
	}
	if(EP19_2QUE >= 19) {
		mes "[�w�����b�N]";
		mes "����ɂ��́I�I�I";
		mes "������^e5555e�C�X�K���h^000000�֍s����܂����H";
		cutin "ep19_healrock01.png", 2;
		next;
		if(select("�o��","�ҋ@") == 2) {
			mes "[�w�����b�N]";
			mes "�����ł����H";
			mes "�ł͏����ł��܂�����A";
			mes "�b�������Ă��������ˁB";
			close2;
			cutin "ep19_healrock01.png", 255;
			end;
		}
		mes "[�w�����b�N]";
		mes "�ł͏o�����܂���B";
		mes "��������߂܂��āI";
		close2;
		cutin "ep19_healrock01.png", 255;
		warp "jor_tail.gat", 214, 60;	// from: aldebaran.gat(108, 103) port : 5121
		end;
	}
	mes "[�w�����b�N]";
	mes "����ɂ��́B";
	mes "�`���җl�A�������V�C�ł���ˁH";
	cutin "ep19_healrock01.png", 2;
	close;
	cutin "ep19_healrock01.png", 255;
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[�]��]";
	end;
}

prontera.gat,254,309,3	script	�A���X#ep19	641,{/* 1305 */
	if(EP19_2QUE == 7) {
		//showevent 0, 3, "�A���X#ep19";	// 1305: 254, 309
		cutin "acact_01.bmp", 2;
		mes "[�A���X]";
		mes "����I����ɂ��́B";
		mes "���̓A�R���C�g�S�����̃A���X�ł��B";
		mes "�ǂ��������p���ł����H";
		mes "�A�R���C�g�ɂȂ肽���󂶂�";
		mes "�Ȃ������ł�����ǁc�c�B";
		cutin "acact_01.bmp", 2;
		next;
		menu "���H�[�N�����f�ɗ��܂ꂽ",-;
		mes "[�A���X]";
		mes "���H�[�N�����f�l�ł����c�c�H";
		mes "�c�c�B";
		cutin "acact_03.bmp", 2;
		next;
		menu "����",-;
		mes "[�A���X]";
		mes "�����܂ł������Ȃ�A";
		mes "�B���K�v�͖��������ł��ˁB";
		cutin "acact_01.bmp", 2;
		next;
		mes "[�A���X]";
		mes "���̖��Ȃ烌�n�[���l��";
		mes "���T���ł����̂ŁA";
		mes "�񑩂̏ꏊ�֌����킹�܂����B";
		mes "�܂�������������ł����H";
		cutin "acact_03.bmp", 2;
		next;
		menu "�����܂���",-;
		mes "[�A���X]";
		mes "<FONT SIZE = 16><B>�͂��H�I</FONT></B>";
		mes "������Ɓc�c�I�I";
		mes "�����������ŏI�����̂ł�";
		mes "�Ȃ���ł����ǁI�I";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�A���X]";
		mes "�����c�c�H";
		mes "���̖���A��Ăǂ����֍s���ۂ́A";
		mes "��������܂�";
		mes "�ڂ𗣂�����_���Ȃ̂Ɂc�c�B";
		mes "������Ɓc�c���n�[���l�A";
		mes "���������c�c�B";
		next;
		menu "���v�H",-;
		mes "[�A���X]";
		mes "����A��藐���܂����B";
		mes "�ЂƐ悸�A���̖���^e5555e����^000000��";
		mes "�s���܂��傤�B";
		mes "�ǂ����֕�����閺����Ȃ�����A";
		mes "�߂��ė��Ă��邩������܂���B";
		mes "���Ȃ��Ȃ�A�{���Ɂc�c�厖�ł��c�c�B";
		setquest 11800;
		delquest 11799;
		setquest 130505;
		delquest 130505;
		set EP19_2QUE,8;
		next;
		//showevent 9999, 0, "�A���X#ep19";	// 1305: 254, 309
		cutin "acact_04.bmp", 255;
		mes "�]���̖��̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̖��̕����֌��������]";
		close2;
		warp "prt_cas.gat", 178, 152;	// from: prontera.gat(246, 307) port : 5125
		end;
	}
	if(EP19_2QUE == 8) {
		cutin "acact_01.bmp", 2;
		mes "[�A���X]";
		mes "����A��藐���܂����B";
		mes "�ЂƐ悸�A���̖���^e5555e����^000000��";
		mes "�s���܂��傤�B";
		mes "�ǂ����֕�����閺����Ȃ�����A";
		mes "�߂��ė��Ă��邩������܂���B";
		mes "���Ȃ��Ȃ�A�{���Ɂc�c�厖�ł��c�c�B";
		cutin "acact_04.bmp", 2;
		next;
		cutin "acact_04.bmp", 255;
		mes "�]���̖��̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̖��̕����֌��������]";
		close2;
		warp "prt_cas.gat", 178, 152;	// from: prontera.gat(246, 307) port : 5125
		end;
	}
	if(EP19_2QUE >= 9 && EP19_2QUE <= 17) {
		cutin "acact_01.bmp", 2;
		mes "[�A���X]";
		mes "�����ł�����肵�Ă���ꍇ�ł�";
		mes "�Ȃ��ł���B";
		mes "������������^e5555e�C�X�K���h^000000��";
		mes "�o�����Ȃ��Ƃ����܂���ł��傤�H";
		cutin "acact_01.bmp", 2;
		close2;
		cutin "acact_01.bmp", 255;
		end;
	}
	cutin "acact_01.bmp", 2;
	mes "[�A���X]";
	mes "����I";
	mes "�v�����e���吹����";
	mes "�悤������������Ⴂ�܂��B";
	mes "�I�[�f�B���l��";
	mes "���ł�������L����";
	mes "���}���Ă�������Ⴂ�܂��B";
	cutin "acact_02.bmp", 2;
	close2;
	cutin "acact_02.bmp", 255;
	end;
OnInit:
	setnpctitle "[�A�R���C�g�S����]";	// NPC:�A���X#ep19(1305)
	end;
}

prt_cas.gat,178,148,0	script	guestroom_l2_in_guestro	45,1,1,{/* 5424 */
	mes "�]���q�p�̕�������������B";
	mes "�@�ǂ���֌����������H�]";
	next;
	switch(select("[�q�� 01] �`���Ҋ��}��","[�q�� 02] �t���[�f���P�̕���","")) {
	case 1:
		warp "prt_cas.gat",27,43;	// 5424 from: prt_cas.gat(178, 149)
		end;
	case 2:
		warp "p_cas_gr_2.gat",27,43;	// 5424 from: prt_cas.gat(178, 149)
		end;
	}
}

p_cas_gr_2.gat,27,47,0	warp	gr_2_out	1,1,prt_cas.gat,178,152	// 5427 from: p_cas_gr_2.gat(27, 46)
p_cas_gr_2.gat,20,32,0	script	p_cas_gr_2_sw	139,9,9,{/* 5605 */
	switch(EP19_2QUE) {
	case 8:
		//showevent 0, 3, "���s�p��#ep19_1";	// 5606: 20, 32
		cloakoffnpc "���s�p��#ep19_1";
		cloakoffnpc "�A���X#ep19";
		end;
	case 9:
		cloakoffnpc "���s�p��#ep19_1";
		cloakoffnpc "����#ep19";
		cloakoffnpc "�A���X#ep19";
		end;
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
		cloakoffnpc "���s�p��#ep19_1";
		cloakoffnpc "�}�[�N�C�V��#ep19_cas";
		cloakoffnpc "�A���X#ep19";
		cloakoffnpc "����#ep19";
		cloakoffnpc "���s�p��#ep19_2";
		cloakoffnpc "���s�p��#ep19_3";
		cloakoffnpc "���s�p��#ep19_4";
		cloakoffnpc "���s�p��#ep19_5";
		cloakoffnpc "���s�p��#ep19_6";
		end;
	default:
		cloakonnpc "���s�p��#ep19_1";
		cloakonnpc "�}�[�N�C�V��#ep19_cas";
		cloakonnpc "�A���X#ep19";
		cloakonnpc "����#ep19";
		cloakonnpc "���s�p��#ep19_2";
		cloakonnpc "���s�p��#ep19_3";
		cloakonnpc "���s�p��#ep19_4";
		cloakonnpc "���s�p��#ep19_5";
		cloakonnpc "���s�p��#ep19_6";
		end;
	}
	end;
}
p_cas_gr_2.gat,20,32,3	script	���s�p��#ep19_1	10459,{/* 5606 (cloaking)*/
	switch(EP19_2QUE) {
	case 8:
		mes "[�A���X]";
		mes "����I";
		mes "��������̂��݂�ƁA";
		mes "�����ɖ߂��Ă��Ă���݂����ł��ˁH";
		mes "�㎀�Ɉꐶ�𓾂��C���ł��B";
		cloakoffnpc "�A���X#ep19";
		cutin "acact_03.bmp", 2;
		next;
		cloakoffnpc "����#ep19";
		mes "[����]";
		mes "�A���X�o�H���Ă��́H";
		mes "�悩�����I";
		mes "�������̔����R�[�g�ƃs���N�F�}���g�A";
		mes "�ǂ����������H";
		mes "���������đI�ׂȂ���B";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[�A���X]";
		mes "�ǂ����Ă����ɂ���́H";
		mes "���n�[���l���}���ɗ����񂶂�Ȃ��́H";
		cutin "acact_04.bmp", 2;
		next;
		mes "[����]";
		mes "���n�[���H";
		mes "���c�c�񑩂����ꏊ�ɍs������A";
		mes "���n�[���͂��Ȃ���";
		mes "�N���Ɏ莆��n���ꂽ��H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A���X]";
		mes "��c�c���c�c�H";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�o�������g�@�֗������ď�����Ă���B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes "���Ⴀ�A���ł����ɂ���́H";
		mes "�o�������g�@�ɂ͍s���Ȃ������́H";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�A���X]";
		mes "����A��������A";
		mes "�o�������g�@�͂�����������ˁB";
		mes "�������܂ŋM���ЂƂ�ŗ�����";
		mes "����ꂽ�́H";
		next;
		mes "[����]";
		mes "����c�c�s���Ă݂����ǁc�c";
		mes "�N�����Ȃ��đދ��œ@���������āc�c";
		mes "��������҂��Ă����ǁA";
		mes "�N�����Ȃ�����A���Ă�����B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�A���X]";
		mes "�l���Ăт��Ă�����";
		mes "���ł��Ȃ��񂾂�I";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�A���X]";
		mes "�c�c�B";
		mes "�c�c�c�B";
		mes "�c�c�c�c�B";
		next;
		mes "[�A���X]";
		mes "�����A����Ȃ��ƍl���Ă���ɂ͂Ȃ���B";
		mes strcharinfo(0)+"�l��";
		mes "�}���ɂ��炵���񂾂���A";
		mes "�M���A���Ă����Ȃ����B";
		mes "���H�[�N�����f�l��";
		mes "�҂��Ă���炵����B";
		cutin "acact_01.bmp", 2;
		next;
		mes "[����]";
		mes "���H�[�N�����f�l���H";
		mes "���A���H�[�N�����f�l�̂Ƃ����";
		mes "�s���́H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[����]";
		mes "���ᑁ���ב��肵�Ȃ��ƁI";
		next;
		mes "[�A���X]";
		mes "�ב���H�H�H";
		mes "�܂��A�m���Ɂc�c�H";
		mes "���Ⴀ�A���΂炭�͉ב��肵�Ă��āB";
		mes "���͉ו��^�їv����A��ė��邩��B";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�A���X]";
		mes strcharinfo(0)+"�l�A";
		mes "�\���󂠂�܂��񂪁A";
		mes "���̖��̉ב����";
		mes "������Ă��������܂����H";
		mes "�ڂ𗣂��̂͐S�z�Łc�c";
		mes "�����߂�܂�����B";
		cutin "acact_01.bmp", 2;
		setquest 11801;
		delquest 11800;
		set EP19_2QUE,9;
		close2;
		//showevent 9999, 0, "���s�p��#ep19_1";	// 5606: 20, 32
		//showevent 0, 3, "����#ep19";	// 5611: 18, 32
		cutin "acact_01.bmp", 255;
		cloakonnpc "�A���X#ep19";
		end;
	case 9:
		mes "�]�A���X��҂ԁA�����Ƙb���Ă݂悤�]";
		hideoffnpc "����#ep19";
		close;
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
		mes "[�A���X]";
		mes "������ƁA�Ȃ�Ŋ��������Ă�̂�c�c";
		mes "�܂��������ɂ�����́A";
		mes "�S�������čs�����肶��Ȃ����ˁH";
		cloakoffnpc "�}�[�N�C�V��#ep19_cas";
		cloakoffnpc "�A���X#ep19";
		cloakoffnpc "���s�p��#ep19_2";
		cloakoffnpc "���s�p��#ep19_3";
		cloakoffnpc "���s�p��#ep19_4";
		cloakoffnpc "���s�p��#ep19_5";
		cloakoffnpc "���s�p��#ep19_6";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���߁H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes "���R�_����I";
		mes "�K�v�ȕ����������Ă��Ȃ����I";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�S���K�v�ȕ��Ȃ񂾂���B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes strcharinfo(0)+"�l�A";
		mes "����ȖڂŌ��Ȃ��ł��������B";
		mes "���������Ă��A���E�҂Ƃ��Ă̘r������";
		mes "�{���ɗD��Ă��܂�����c�c";
		mes "�r�����́c�c�{���Ɂc�c�}�W�Łc�c�B";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�A���X]";
		mes "���̂܂܂���_���ł��ˁB";
		mes "�J���Ċm�F���Đ������Ȃ��ƁA";
		mes "�{���ɂ����S��������";
		mes "�C�X�K���h�ɍs���H�ڂɂȂ�܂��B";
		next;
		mes "[�A���X]";
		mes "���ɉ��������Ă���̂����āA";
		mes "���点�镨�͍ő���Ɍ��炵�܂��傤���B";
		cutin "acact_01.bmp", 2;
		close2;
		cutin "acact_01.bmp", 255;
		end;
	case 15:
		mes "[�A���X]";
		mes "�ӂ��A�ב���͂���ȂƂ���ł��傤���H";
		cutin "acact_01.bmp", 2;
		cloakoffnpc "�}�[�N�C�V��#ep19_cas";
		cloakoffnpc "�A���X#ep19";
		cloakoffnpc "����#ep19";
		cloakoffnpc "���s�p��#ep19_2";
		cloakoffnpc "���s�p��#ep19_3";
		cloakoffnpc "���s�p��#ep19_4";
		cloakoffnpc "���s�p��#ep19_5";
		cloakoffnpc "���s�p��#ep19_6";
		close2;
		cutin "acact_01.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,22,33,3	script	�}�[�N�C�V��#ep19_cas	10383,{/* 5607 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,23,32,3	script	�e���[���A��#ep19_cas	10382,{/* 5608 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,24,31,3	script	�}�M�X�e�B��#ep19_cas	10365,{/* 5609 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,25,31,5	script	�A���v�I�J�[�g#ep19_cas	10384,{/* 5610 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,18,32,5	script	����#ep19	10458,{/* 5611 (cloaking)*/
	switch(EP19_2QUE) {
	case 9:
		mes "[�t���[�f���P]";
		mes "���߂܂���";
		mes strcharinfo(0)+"�l�B";
		mes "���̓t���[�f���P�Ɛ\���܂��B";
		mes "��Ċ������ł��B";
		cutin "ep19_friederike03.png", 2;
		cloakoffnpc "���s�p��#ep19_2";
		next;
		mes "[�t���[�f���P]";
		mes "�Ƃ���ŁA"+strcharinfo(0)+"�l��";
		mes "���H�[�N�����f�l��";
		mes "���g���ł��炵����ł���ˁH";
		mes "�C�X�K���h�͌��\�����ł����H";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "���s�p��#ep19_3";
		next;
		menu "����",-;
		mes "[�t���[�f���P]";
		mes "�����̂͌������ǁB";
		mes "�����͉Ƃ��X�ŏo���Ă�́H";
		mes "�H�т̕z�c�������čs���Ȃ��ƁI";
		cloakoffnpc "���s�p��#ep19_4";
		next;
		menu "�X�łł����������",-;
		mes "[�t���[�f���P]";
		mes "�킟�I�Y�킻���I";
		mes "�Ȃ炱�̐��F�̃h���X�Ɣ����h���X�A";
		mes "�ǂ��炪�X�̏�ƍ����܂����H";
		cutin "ep19_friederike03.png", 2;
		cloakoffnpc "���s�p��#ep19_5";
		next;
		mes "[�t���[�f���P]";
		mes "���I";
		mes "�h���X�ɕ������C�������Ă��Ȃ�����I";
		cutin "ep19_friederike01.png", 2;
		cloakoffnpc "���s�p��#ep19_6";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�ו��𑝂₵�Ăǂ�����񂾂�I";
		cloakoffnpc "�}�[�N�C�V��#ep19_cas";
		cutin "ep18_mark_03.png", 0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����I";
		mes strcharinfo(0)+"�l�A";
		mes "����ɂ��́B";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�A���X]";
		mes "������ƁA�Ȃ�Ŋ��������Ă�̂�c�c";
		mes "�܂��������ɂ�����́A";
		mes "�S�������čs�����肶��Ȃ����ˁH";
		cloakoffnpc "�A���X#ep19";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���߁H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes "���R�_����I";
		mes "�K�v�ȕ����������Ă��Ȃ����I";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�S���K�v�ȕ��Ȃ񂾂���B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes strcharinfo(0)+"�l�A";
		mes "����ȖڂŌ��Ȃ��ł��������B";
		mes "���������Ă��A���E�҂Ƃ��Ă̘r������";
		mes "�{���ɗD��Ă��܂�����c�c";
		mes "�r�����́c�c�{���Ɂc�c�}�W�Łc�c�B";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�A���X]";
		mes "���̂܂܂���_���ł��ˁB";
		mes "�J���Ċm�F���Đ������Ȃ��ƁA";
		mes "�{���ɂ����S��������";
		mes "�C�X�K���h�ɍs���H�ڂɂȂ�܂��B";
		next;
		mes "[�A���X]";
		mes "���ɉ��������Ă���̂����āA";
		mes "���点�镨�͍ő���Ɍ��炵�܂��傤���B";
		cutin "acact_01.bmp", 2;
		setquest 11802;
		delquest 11801;
		set EP19_2QUE,10;
		close2;
		//showevent 0, 3, "���s�p��#ep19_2";	// 5612: 15, 31
		cutin "acact_01.bmp", 255;
		end;
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
		mes "[�A���X]";
		mes "������ƁA�Ȃ�Ŋ��������Ă�̂�c�c";
		mes "�܂��������ɂ�����́A";
		mes "�S�������čs�����肶��Ȃ����ˁH";
		cloakoffnpc "�}�[�N�C�V��#ep19_cas";
		cloakoffnpc "�A���X#ep19";
		cloakoffnpc "���s�p��#ep19_2";
		cloakoffnpc "���s�p��#ep19_3";
		cloakoffnpc "���s�p��#ep19_4";
		cloakoffnpc "���s�p��#ep19_5";
		cloakoffnpc "���s�p��#ep19_6";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���߁H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes "���R�_����I";
		mes "�K�v�ȕ����������Ă��Ȃ����I";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�S���K�v�ȕ��Ȃ񂾂���B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes strcharinfo(0)+"�l�A";
		mes "����ȖڂŌ��Ȃ��ł��������B";
		mes "���������Ă��A���E�҂Ƃ��Ă̘r������";
		mes "�{���ɗD��Ă��܂�����c�c";
		mes "�r�����́c�c�{���Ɂc�c�}�W�Łc�c�B";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�A���X]";
		mes "���̂܂܂���_���ł��ˁB";
		mes "�J���Ċm�F���Đ������Ȃ��ƁA";
		mes "�{���ɂ����S��������";
		mes "�C�X�K���h�ɍs���H�ڂɂȂ�܂��B";
		next;
		mes "[�A���X]";
		mes "���ɉ��������Ă���̂����āA";
		mes "���点�镨�͍ő���Ɍ��炵�܂��傤���B";
		cutin "acact_01.bmp", 2;
		close2;
		cutin "acact_01.bmp", 255;
		end;
	}
	end;
}
p_cas_gr_2.gat,15,31,5	script	���s�p��#ep19_2	10459,{/* 5612 (cloaking)*/
	if(EP19_2QUE == 10) {
		mes "�]���̒��ɂ͕������R�[�g��";
		mes "�@��R�����Ă���]";
		next;
		mes "[�t���[�f���P]";
		mes "�C�X�K���h�͊�������A";
		mes "�~�p�R�[�g���Ȃ��ƂˁB";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A���X]";
		mes "����Ⴛ���ˁB";
		mes "�ł͎��I";
		cutin "acact_01.bmp", 2;
		setquest 11803;
		delquest 11802;
		set EP19_2QUE,11;
		close2;
		showevent 0, 3, "���s�p��#ep19_3";	// 5613: 16, 27
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "�]���s�p��������]";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,16,27,3	script	���s�p��#ep19_3	10459,{/* 5613 (cloaking)*/
	if(EP19_2QUE == 11) {
		mes "�]���̒��ɂ͕������R�[�g��";
		mes "�@��R�����Ă���]";
		next;
		mes "[�A���X]";
		mes "�c�c�B";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�C�X�K���h�͊�������c�c�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A���X]";
		mes "���̊��ɂ�";
		mes "�R�[�g�������Ă�������Ȃ��c�c�B";
		cutin "acact_03.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ł��c�c�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�A���X]";
		mes "�ǂ�������������āA";
		mes "�O�ɂ͏o�Ȃ�����Ȃ��B";
		mes "�������̂��̊������ɂ��āI";
		mes "�ł͎��I";
		cutin "acact_01.bmp", 2;
		setquest 11804;
		delquest 11803;
		set EP19_2QUE,12;
		close2;
		//showevent 0, 3, "���s�p��#ep19_4";	// 5614: 26, 27
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "�]���s�p��������]";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,26,27,3	script	���s�p��#ep19_4	10459,{/* 5614 (cloaking)*/
	if(EP19_2QUE == 12) {
		mes "�]���̒��ɂ�";
		mes "�@�N�}�̂ʂ�����݂������Ă���]";
		next;
		mes "[�A���X]";
		mes "�c�c�B";
		cutin "acact_02.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���߁`�`�I";
		mes "�A���W�F���J�Ȃ����ᖰ��Ȃ��񂾂���I";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�A���X]";
		mes "���Ⴀ�A";
		mes "�ʂ�����݂͂���������c�c�B";
		cutin "acact_01.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "����B";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[�A���X]";
		mes "�ł͎��I";
		cutin "acact_01.bmp", 2;
		setquest 11805;
		delquest 11804;
		set EP19_2QUE,13;
		close2;
		//showevent 0, 3, "���s�p��#ep19_5";	// 5615: 21, 27
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "�]���s�p��������]";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,21,27,3	script	���s�p��#ep19_5	10459,{/* 5615 (cloaking)*/
	if(EP19_2QUE == 13) {
		mes "�]���̒��ɂ͂��َq�������Ă���]";
		next;
		mes "[�A���X]";
		mes "�C�X�K���h�ł�";
		mes "���肵���������Ȃ�����A";
		mes "����͎����Ă����Ă悵�B";
		mes "�ł͎��I";
		cutin "acact_01.bmp", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�i�c�c�o����A";
		mes "�@�H�ו��ɂ͊Â��񂾂�Ȃ��c�c�j";
		cutin "ep18_mark_01.png", 0;
		setquest 11806;
		delquest 11805;
		set EP19_2QUE,14;
		close2;
		showevent 0, 3, "���s�p��#ep19_6";	// 5616: 22, 30
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "�]���s�p��������]";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,22,30,5	script	���s�p��#ep19_6	10459,{/* 5616 (cloaking)*/
	if(EP19_2QUE == 14) {
		mes "�]���̒��ɂ̓o�������g��";
		mes "�@���g��l�`�������Ă���]";
		next;
		mes "[�A���X]";
		mes "����Ȃ́A���������ǂ��Ŏ�ɓ��ꂽ�́H";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���̑O�o�������g�@�ɍs�������ɁA";
		mes "�A���t�@���񂪃v���[���g�ł��ꂽ��B";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[�A���X]";
		mes "�Ƃɂ����A";
		mes "����̓C�X�K���h����߂��Ă�����";
		mes "�ӏ܂��Ȃ����B";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�Ё[��c�c�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�A���X]";
		mes "�ו��͂��ꂮ�炢�Ō��\�I";
		cutin "acact_01.bmp", 2;
		setquest 11807;
		delquest 11806;
		set EP19_2QUE,15;
		close2;
		showevent 0, 3, "�A���X#ep19";	// 5617: 21, 31
		cutin "acact_01.bmp", 255;
		end;
	}
	mes "�]���s�p��������]";
	close;
OnInit:
	cloakonnpc;
	end;
}
p_cas_gr_2.gat,21,31,3	script	�A���X#ep19	641,{/* 5617 (cloaking)*/
	if(EP19_2QUE == 15) {
		mes "[�A���X]";
		mes "�Ӂ[�I";
		mes "���炵�Ɍ��炵���񂾂��ǁA";
		mes "����Ȃɂ���Ȃ�āB";
		mes "�|�[�^�[������Ȃ���ˁc�c�B";
		cutin "acact_04.bmp", 2;
		next;
		mes "[�e���[���A��]";
		mes "���`���I";
		mes "�}�[�N�C�V���A�����ɂ��邩�H";
		mes "���I"+strcharinfo(0)+"��";
		mes "���邶���I";
		mes "���X�X�ɐV�����ł���";
		mes "�|�����u�߂̓X�֍s���Ȃ��H";
		cloakoffnpc "�e���[���A��#ep19_cas";
		cloakoffnpc "�}�M�X�e�B��#ep19_cas";
		cloakoffnpc "�A���v�I�J�[�g#ep19_cas";
		cutin "ep18_dew_01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����H�ׂ�I";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A���X]";
		mes "����`�`�I";
		mes "�e���[���A���I";
		mes "�}�M�X�e�B���I";
		mes "�A���v�I�J�[�g����I";
		cutin "acact_03.bmp", 2;
		next;
		mes "[�A���X]";
		mes "���傤�ǂ悩�����I";
		mes "�A���X���o���񂪃|�����u�ߚ��邩��A";
		mes "���̉ו��^�ю�`���Ă���Ȃ��H";
		cutin "acact_02.bmp", 2;
		next;
		mes "[�e���[���A��]";
		mes "���I�{���H";
		mes "�o�M�������Ă����H";
		cutin "ep18_dew_05.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�o����I";
		mes "����́c�c�I";
		mes "�������c�c�I";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[�A���X]";
		mes "�ق��ĂȂ����c�c�B";
		cutin "acact_02.bmp", 2;
		next;
		mes "[�A���X]";
		mes "�������I";
		mes "�H�ׂ������Ȃ�A������ł�������I";
		next;
		mes "[�e���[���A��]";
		mes "�悵�I";
		mes "���̂悤�ȑ����ōs���Ă��邩��A";
		mes "�o�M�͍��z�̗p�ӂ𗊂񂾂��I";
		cutin "ep18_dew_01.png", 2;
		next;
		mes "[�A���X]";
		mes "����"+strcharinfo(0)+"�l�A";
		mes "�����A���f�o�����܂ł����肢�����܂��B";
		mes "�ǂ����C��t���Ă����Ă�����Ⴂ�B";
		mes "����ƃt���[�f���P�̂��ƁA";
		mes "��낵�����肢���܂��B";
		cutin "acact_01.bmp", 2;
		next;
		if(select("�ړ�����","��߂Ă���") == 2) {
			mes "[�A���X]";
			mes "�ł͏������ł�����A";
			mes "�b�������Ă��������ˁB";
			close2;
			cutin "acact_03.bmp", 255;
			end;
		}
		mes "[�t���[�f���P]";
		mes "�A���X�o�A���s���Ă����`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�e���[���A��]";
		mes "����H�A���f�o�����H�H�H";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[�A���X]";
		mes "�C��t���Ă����̂�`�B";
		mes "���H�[�N�����f�l�̘b���A";
		mes "�悭�����ĂˁB";
		cutin "acact_03.bmp", 2;
		setquest 11808;
		delquest 11807;
		set EP19_2QUE,16;
		close2;
		showevent 0, 3, "�A���X#ep19";	// 5617: 21, 31
		cutin "acact_03.bmp", 255;
		warp "aldebaran.gat", 104, 105;	// from: p_cas_gr_2.gat(24, 33) port : 5122
		showevent 0, 3, "�w�����b�N#ep19_a";	// 5716: 102, 103
		end;
	}
	if(EP19_2QUE == 16) {
		mes "[�A���X]";
		mes "����"+strcharinfo(0)+"�l�A";
		mes "�����A���f�o�����܂ł����肢�����܂��B";
		mes "�ǂ����C��t���Ă����Ă�����Ⴂ�B";
		mes "����ƃt���[�f���P�̂��ƁA";
		mes "��낵�����肢���܂��B";
		cutin "acact_01.bmp", 2;
		next;
		cutin "acact_03.bmp", 255;
		mes "�]�A���f�o�����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�A���f�o�����֌��������]";
		close2;
		warp "aldebaran.gat", 104, 105;	// from: p_cas_gr_2.gat(24, 30) port : 5122
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

icecastle.gat,25,121,5	script	�t���[�f���P#ep19����	10458,{/* 2911 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,20,126,5	script	�e���[���A��#ep19����	10382,{/* 2912 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,21,127,5	script	�}�[�N�C�V��#ep19����	10383,{/* 2913 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,21,128,5	script	�}�M�X�e�B��#ep19����	10365,{/* 2914 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,22,129,5	script	�A���v�I�J�[�g#ep19����	10384,{/* 2915 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,27,123,3	script	���n�[��#ep19_3	10469,{/* 2916 (cloaking)*/
	if(EP19_2QUE == 18) {
		mes "[���n�[��]";
		mes "���I";
		mes strcharinfo(0)+"�l�A";
		mes "����Ƃ�������Ⴂ�܂����ˁI";
		mes "�����l�́c�c�B";
		cutin "ep19_lehar01.png", 2;
		cloakoffnpc "���n�[��#ep19_3";
		cloakoffnpc "�t���[�f���P#ep19����";
		cloakoffnpc "�e���[���A��#ep19����";
		cloakoffnpc "�}�[�N�C�V��#ep19����";
		cloakoffnpc "�}�M�X�e�B��#ep19����";
		cloakoffnpc "�A���v�I�J�[�g#ep19����";
		next;
		mes "[�t���[�f���P]";
		mes "�t���[�f���P����B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[���n�[��]";
		mes "����ɂ��́A";
		mes "�t���[�f���P�l�B";
		mes "���̕��������c�c";
		mes "�X�̏�܂ł̓����A�����l�ł����B";
		cutin "ep19_lehar07.png", 2;
		next;
		mes "[���n�[��]";
		mes "�o�������g�@�ɒu���Ă��Ă��܂������ƁA";
		mes "�{���ɐ\���󂠂�܂���B";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���v����B";
		mes "���H�[�N�����f�l�ɂ͂����ς�����ꂽ�H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[���n�[��]";
		mes "�����c�c�B";
		mes "�L�����c�c�B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�e���[���A��]";
		mes "����H�H";
		mes "�����͂ǂ��I�I";
		mes "�����I�I";
		mes "���̃|�����u�߂́I�H";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�v�������������Ɗ����ꏊ�ł��ˁB";
		mes "�����ړ��������������ł��傤�B";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[���n�[��]";
		mes "���I�I�����ł��ˁB";
		mes "�����܂���A�l�͊���Ă��邹�����A";
		mes "�z���Ɍ����܂����B";
		mes "�悸�͂����̉Ƃɓ���܂��傤�B";
		mes "�O�ɒ�������ƕ��ׂ��Ђ��Ă��܂��܂��B";
		cutin "ep19_lehar05.png", 2;
		setquest 11810;	showevent 0, 3, "#in_house1";	// 2903: 59, 213
		delquest 130501;
		//setquest 130502;
		//delquest 130502;
		set EP19_2QUE,19;
		close2;
		//showevent 9999, 0, "���n�[��#ep19_3";	// 2902: 27, 123
		//showevent 0, 3, "#in_house1";	// 2903: 59, 213
		//showevent 0, 3, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		cutin "ep19_lehar05.png", 255;
		unittalk "���n�[�� : ������q���̓R���S�����c�c";
		viewpoint 1, 59, 213, 1, 0xFFFF00;
		end;
	}
	if(EP19_2QUE == 19) {
		mes "[���n�[��]";
		mes "�悸�͂����̉Ƃɓ���܂��傤�B";
		mes "�O�ɒ�������ƕ��ׂ��Ђ��Ă��܂��܂��B";
		hideoffnpc "���n�[��#ep19_3";
		cutin "ep19_lehar05.png", 2;
		close2;
		cutin "ep19_lehar05.png", 255;
		unittalk "���n�[�� : ������q���̓R���S�����c�c";
		viewpoint 1, 59, 213, 1, 0xFFFF00;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icecastle.gat,59,213,0	script	#in_house1	45,1,1,{/* 2917 */
	if(EP19_2QUE < 19) {
		mes "�]�����������Ă�悤���B-";
		close;
	}
	warp "icas_in.gat",33,112;
	end;
}

icas_in.gat,33,109,0	warp	#out_house1	1,1,icecastle.gat,60,211	// 2918 from: icas_in.gat(34, 110)
icas_in.gat,32,122,0	script	#seizyo_sw	139,10,10,{/* 2919 */
	switch(EP19_2QUE) {
	case 0:
		end;
	case 19:
	case 20:
		cloakoffnpc "�t���[�f���P#ep19_seizy";
		cloakoffnpc "���n�[��#ep19_room";
		end;
	case 21:
		cloakoffnpc "�t���[�f���P#ep19_seizy";
		cloakoffnpc "�V������#ep19_dq_jorab";
		end;
	default:
		cloakoffnpc "�t���[�f���P#ep19_seizy";
		cloakoffnpc "�V������#ep19_dq_jorab";
		cloakoffnpc "�^�}����#ep19_refrigera";
		end;
	}
	end;
}
icas_in.gat,34,121,3	script	���H�[�N�����f#ep19_roo	10467,{/* 2920 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,27,119,5	script	�e���[���A��#ep19_room	10382,{/* 2921 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,30,121,5	script	�}�[�N�C�V��#ep19_room	10383,{/* 2922 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,29,120,5	script	�}�M�X�e�B��#ep19_room	10365,{/* 2923 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,26,119,5	script	�A���v�I�J�[�g#ep19_roo	10384,{/* 2924 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,32,123,5	script	�t���[�f���P#ep19_seizy	10458,{/* 2925 (cloaking)*/
	switch(EP19_2QUE) {
	case 19:
		mes "[�t���[�f���P]";
		mes "���������̕����Ȃ́H";
		mes "�J���C�C�I";
		cutin "ep19_friederike03.png", 2;
		cloakoffnpc "���n�[��#ep19_room";
		cloakoffnpc "�e���[���A��#ep19_room";
		cloakoffnpc "�}�[�N�C�V��#ep19_room";
		cloakoffnpc "�}�M�X�e�B��#ep19_room";
		cloakoffnpc "�A���v�I�J�[�g#ep19_roo";
		next;
		mes "[���H�[�N�����f]";
		mes "�Ⴂ�q�����A�悭�����ˁB";
		mes "�����܂ł���J�l�B";
		cutin "ep19_voglinde01.png", 0;
		cloakoffnpc "���H�[�N�����f#ep19_roo";
		next;
		mes "[�t���[�f���P]";
		mes "�����I�I";
		mes "���H�[�N�����f�l�A�����܂����`�B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���c�c����ɂ��́I";
		mes "�����a���I�I";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�e���[���A��]";
		mes "<FONT SIZE = 16><B>���c�c�����a���H�I</FONT></B>";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "���₨��I";
		mes "�A���X�̒킾�ˁB";
		mes "����ȂɌ��ꂵ�����Ȃ��Ă�����B";
		mes "���H�[�N�����f���΂���ƌĂ�ł�����B";
		mes "�ׂɂ���̂͗F�B�����H";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�͂��B";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�悭�����ˁI";
		mes "�����ł����A�l��s���łˁB";
		mes "<FONT SIZE = 16><B>�ققفI</FONT></B>";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�ł́A���̓t���[�f���P�������̂�";
		mes "�m�F��������A�����߂��B";
		mes "���ׂ����Ƃ����߂���B";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[�t���[�f���P]";
		mes "�����`�B";
		mes "�����s�����̂ł����c�c�H";
		mes "��������΂���Ȃ̂Ɂc�c�I";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "�����]�T���ł�����ĂԂ�B";
		mes "��������������";
		mes "���َq���������Ă���������B";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[�t���[�f���P]";
		mes "�{���H";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "�������I";
		mes "���O�����邩��";
		mes "���ʂȕ���p�ӂ��Ă�������B";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[�t���[�f���P]";
		mes "���Ηl��D���I";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "�����I";
		mes "��������Ȏ��ԂɁI";
		mes "�{���ɍs���Ȃ��ƁB";
		mes "^e5555e���n�[��^000000�A��͗��ނ��B";
		mes "�M���Ă邩��ˁB";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���n�[��]";
		mes "�͂��c�H�͂��I";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "�������̓�l�͎��ɕt���Ă����ŁB";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[�e���[���A��]";
		mes "�͂��I�H";
		cutin "ep18_dew_02.png", 1;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�͂��I";
		cutin "4job_maggi_04.png", 2;
		unittalk getnpcid(0,"�e���[���A��#ep19_room"),"�e���[���A�� : �͂��I�H";
		unittalk getnpcid(0,"�}�M�X�e�B��#ep19_room"),"�}�M�X�e�B�� : �͂��I";
		cloakonnpc "�e���[���A��#ep19_room";
		cloakonnpc "�}�M�X�e�B��#ep19_room";
		cloakonnpc "���H�[�N�����f#ep19_roo";
		setquest 11811;
		delquest 11810;
		set EP19_2QUE,20;
		close2;
		showevent 9999, 0, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		showevent 0, 3, "���n�[��#ep19_room";	// 2912: 35, 118
		cutin "ep19_lehar05.png", 255;
		end;
	case 20:
		mes "[�t���[�f���P]";
		mes "���n�[���B";
		mes "���H�[�N�����f�l��";
		mes "���ċ����́H";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "���n�[��#ep19_room";
		close2;
		cutin "ep19_friederike02.png", 255;
		end;
	case 27:
		mes "[�t���[�f���P]";
		mes "���炵�Ă���ł��ˁB";
		mes "�O�͖{���Ɋ����ł���ˁH";
		mes "�݂�Ȃ��������ɂ����ł�B";
		mes "�����͉H�т��~����Ă邩��A";
		mes "�����g������B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�x�݂����C�����͎R�X�����ǁA";
		mes "���͂���Ȏ�����Ȃ�����B";
		cloakoffnpc "�}�[�N�C�V��#ep19_room";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�t���[�f���P�A�㒅�𒅂āB";
		mes "�s���ꏊ������B";
		next;
		mes "[�t���[�f���P]";
		mes "�ǂ��ցH";
		mes "�O�ɏo��񂾂�ˁH";
		mes "����ȂɊ����̂ɁH";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "^e5555e�ł̈��錊^000000�����t�����񂾁B";
		mes "�^�}�����������֗�����";
		mes "�����Ȃ����݂����B";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�^�}����]";
		mes "�������A���ʂ��I�I";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "������A�򉻂��Ă����Ȃ��ƁA";
		mes "�܂���Q�҂��o�邾��H";
		mes "�V����������̖��͊j��";
		mes "����Ă��܂������Ęb�����B";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�t���[�f���P]";
		mes "���͊j������邮�炢�Ȃ�A";
		mes "���g�ŗ������";
		mes "���񂶂Ⴄ��������Ȃ���B";
		mes "�N�����h���v��������̂͌�������c�c";
		mes "�������ˁB";
		cutin "ep19_friederike02.png", 2;
		setquest 11821;
		delquest 11820;
		set EP19_2QUE,28;
		cloakonnpc "�}�[�N�C�V��#ep19_room";
		next;
		//showevent 0, 3, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		//showevent 0, 3, "�V������#ep19_1";	// 2923: 255, 312
		cutin "ep19_friederike01.png", 255;
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: icas_in.gat(32, 120)
		end;
	case 28:
		mes "[�t���[�f���P]";
		mes "���͊j������邮�炢�Ȃ�A";
		mes "���g�ŗ������";
		mes "���񂶂Ⴄ��������Ȃ���B";
		mes "�N�����h���v��������̂͌�������c�c";
		mes "�������ˁB";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike01.png", 255;
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: icas_in.gat(32, 120)
		end;
	case 35:
		mes "[�t���[�f���P]";
		mes "��������Ȃ����B";
		mes "����͂��ĂȂ��ł����H";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "�}�[�N�C�V��#ep19_room";
		cloakoffnpc "�A���v�I�J�[�g#ep19_roo";
		next;
		mes "[���n�[��]";
		mes "�������ŉ����ł��B";
		mes "�}�M�X�e�B���l����b�𕷂���";
		mes "�ǂ�قǋ��������B";
		cutin "ep19_lehar01.png", 2;
		cloakoffnpc "���n�[��#ep19_room";
		next;
		mes "[���n�[��]";
		mes "����ŁA���̒��͂ǂ��ł������H";
		mes "�댯�x�ɂ���ẮA";
		mes "���ꂳ��ɑ����񍐂��Ȃ��Ɓc�c�B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "���̕K�v�͂Ȃ���B";
		cutin "ep19_voglinde01.png", 0;
		cloakoffnpc "���H�[�N�����f#ep19_roo";
		cloakoffnpc "�e���[���A��#ep19_room";
		cloakoffnpc "�}�M�X�e�B��#ep19_room";
		next;
		mes "[���n�[��]";
		mes "<FONT SIZE = 16>���ꂳ��I</FONT>";
		mes "�ǂ�����āc�c�B";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "�t���[�f���P�����āA";
		mes "^e5555e������������^000000�����ƁA";
		mes "�������Ă���ĂˁB";
		mes "����łǂ��������Ȃ̂���";
		mes "�m�F���ɗ����킯�B";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�݂�Ȗ����ɖ߂��ė����悤���ˁB";
		mes "���䂪�����āA�{���ɂ悩�����B";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "����Ȃ��̂܂Ō��t���āA";
		mes "���̎q�����́c�c";
		mes "���΂���̊��҂𗠐؂�Ȃ��񂾂���I";
		mes "�����ō���I";
		next;
		mes "[���H�[�N�����f]";
		mes "����Ȍ������邱�Ǝ��̂́A";
		mes "�悢�񂹂ł͂Ȃ����A";
		mes "���̂ɂȂ�O�Ɍ������񂾂���";
		mes "�ƂĂ���΂������Ƃ��I";
		cutin "ep19_voglinde04.png", 0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�i����c�c�H�^�}�����́c�c�H�j";
		cutin "ep18_mark_02.png", 0;
		next;
		mes "[�V������]";
		mes "<FONT SIZE = 14><B>���H�[�N�����f�a�I</FONT></B>";
		mes "<FONT SIZE = 14><B>���́A���������\�L�������ł������A</FONT></B>";
		mes "<FONT SIZE = 14><B>���̏ꏊ�Ɍq�����Ă͂��Ȃ������ł����B</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�V������]";
		mes "<FONT SIZE = 14><B>�������A�ٗl�Ȏp���������K����</FONT></B>";
		mes "<FONT SIZE = 14><B>�����X�^�[������</FONT></B>";
		mes "<FONT SIZE = 14><B>�E���E�����Ă���A</FONT></B>";
		mes "<FONT SIZE = 14><B>���̂܂܂ɂ��Ă����̂͊댯����</FONT></B>";
		mes "<FONT SIZE = 14><B>���f����܂��I</FONT></B>";
		next;
		mes "[���H�[�N�����f]";
		mes "�ٗl�Ȏp���������K���H";
		mes "�{�����H";
		mes "���ʂ̃��K���Ƃ͂ǂ��������ɈႤ�񂾁H";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[�V������]";
		mes "<FONT SIZE = 14><B>�ٗl�Ȏp���������K�������́A</FONT></B>";
		mes "<FONT SIZE = 14><B>�ǂ����������s���R�ŁA</FONT></B>";
		mes "<FONT SIZE = 14><B>����ɔP���Ȃ����Ă��܂����B</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�V������]";
		mes "<FONT SIZE = 14><B>�����X�^�[�����́A�F�����������āc�c�B</FONT></B>";
		mes "<FONT SIZE = 14><B>�O�ł͌������Ƃ��������̂܂ł��܂����I</FONT></B>";
		next;
		mes "[���H�[�N�����f]";
		mes "����ɂ˂��Ȃ��������K���Ƃ́c�c";
		mes "���̌���";
		mes "���R�����������̂�������Ȃ����A";
		mes "^e5555e���K�������̔p����^000000�ł���\����";
		mes "�r���ł��Ȃ��ˁB";
		cutin "ep19_voglinde02.png", 0;
		next;
		menu "�p����H",-;
		mes "[���H�[�N�����f]";
		mes "���K�������͎��������̒���";
		mes "�\�͂���ɒB���Ă��Ȃ��҂������A";
		mes "�����푰���Ƃ͎v���Ȃ��قǂ�";
		mes "�c�E�ȍ��ʂ�����񂾁B";
		mes "�����āA���̊O�֎̂Ă���񂾂�B";
		cutin "ep19_voglinde04.png", 0;
		next;
		mes "[�V������]";
		mes "<FONT SIZE = 14><B>�����Ă����炪�A</FONT></B>";
		mes "<FONT SIZE = 14><B>�����X�^�[��������</FONT></B>";
		mes "<FONT SIZE = 14><B>�̎悵�Ă������Ђł��B</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "���c�c���������H";
		mes "�Ɂc�c�L���������܂����ˁB";
		cutin "ep19_voglinde03.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�t���[�f���P�A�򉻂��Ă���邩���H";
		mes "�@���Ȃ��肻�����B";
		cutin "ep19_voglinde02.png", 0;
		next;
		mes "[�t���[�f���P]";
		mes "�͂��B";
		mes "�򉻂��܂����B";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[�V������]";
		mes "���ށB";
		mes "�򉻂�����L��������";
		mes "�����͏_�炩���Ĕ��������ł��ˁB";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�e���[���A��]";
		mes "�H�ׂ��H�I";
		cutin "ep18_dew_02.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "�܂��A�������̊����";
		mes "��������������������Ȃ����A";
		mes "���̎q�����ɂƂ��āA";
		mes "���K���͂�����^e5555e��^000000�A";
		mes "����ȏ������ȉ��ł��Ȃ�����ˁB";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[�V������]";
		mes "�����󂵂���A";
		mes "�t���[�f���P�a���򉻂��Ă�������ƁA";
		mes "�ł��M���Ă��܂��B";
		mes "�ӂӁB";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�V������]";
		mes "�ł͎��͎��ɖ߂�܂��ˁB";
		next;
		mes "[���n�[��]";
		mes "�V�������A�����������ł͂���܂��񂩁H";
		mes "�����x�񂾕��������̂ł́H";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[�V������]";
		mes "�^�}�������|�ꂽ����A";
		mes "�������������Ȃ���";
		mes "^e5555e�H�Ƃ��؂�^000000�Ă��܂���B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[���n�[��]";
		mes "���̋C�����͕����邯�ǁc�c�B";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[�^�}����]";
		mes "�����̒����񕜂����炷����`������A";
		mes "���͏����ł��x��ǂ��āB";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[�V������]";
		mes "�������c�c�����܂Ō����Ȃ�";
		mes "�킩�����B�x�����B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[���H�[�N�����f]";
		mes "�������ˁB";
		mes "�H�ƒ��B�͑��̎q��������`������A";
		mes "���͋x��ł����ȁB";
		mes "�܂����ׂ����Ƃ͑�R���邩��ˁB";
		cutin "ep19_voglinde01.png", 0;
		next;
		mes "[���H�[�N�����f]";
		mes "�ł́A�����܂���邱�Ƃ����邩��A";
		mes "�������x��ł����Ă�����B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep19_friederike04.png", 255;
			end;
		}
		setquest 202370;
		delquest 11828;
		setquest 130502;
		delquest 130502;
		setquest 130505;
		delquest 130505;
		set EP19_2QUE,36;
		getitem 1000608,25;
		for(set '@i,0; '@i < 40; set '@i,'@i+1) {
			getexp 2000000000,0,0;
			getexp 0,1400000000,0;
		}
		mes "[���n�[��]";
		mes "�������̂��Ƃ΂���S�z���Ă��Ȃ��ŁA";
		mes "���ꂳ��������x�񂾂炢���̂Ɂc�c";
		mes "���������S�z�ł��B";
		cutin "ep19_lehar04.png", 2;
		cloakonnpc "���H�[�N�����f#ep19_roo";
		cloakonnpc "�}�M�X�e�B��#ep19_room";
		cloakonnpc "�e���[���A��#ep19_room";
		close2;
		showevent 0, 3, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		showevent 9999, 0, "���n�[��#ep19_room";	// 2912: 35, 118
		showevent 0, 3, "�V������#ep19_dq_jorab";	// 2913: 27, 116
		showevent 0, 3, "�^�}����#ep19_refrigera";	// 2914: 27, 122
		//showevent 0, 3;	// 2941: 185, 63
		cutin "ep19_lehar01.png", 255;
		cloakonnpc "�A���v�I�J�[�g#ep19_roo";
		cloakonnpc "�}�[�N�C�V��#ep19_room";
		cloakonnpc "���n�[��#ep19_room";
		end;
	case 36:
		if(checkquest(11812)&8) {
			mes "[�t���[�f���P]";
			mes "�����͂ǂ�������ł����H";
			cutin "ep19_friederike01.png", 2;
			next;
			switch(select("�t���[�f���P����`��","�򉻂��ꂽ���͊j�̍쐬","�G�k������","�܂����x")) {
			case 1:
				break;
			case 2:
				mes "[�t���[�f���P]";
				mes "�͂��B";
				mes "�򉻂��ꂽ���͊j�̍쐬�ł��ˁH";
				cutin "ep19_friederike05.png", 2;
				next;
				mes "[�t���[�f���P]";
				mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>���򉻂��ď�肭�ł߂�ƁI�I";
				mes "�����L�p��<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>�ɂȂ�܂��I";
				mes "^e5555e���F���O���f^000000�l�Ɏ����čs���΁A��т܂���`�I";
				mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��5����΁A";
				mes "<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>1�͍��܂���`�I";
				messize 180,364;
				next;
				if(select("�쐬����","��߂�") == 2) {
					mes "[�t���[�f���P]";
					mes "�����ł����`�H";
					mes "�����ڂ�ł��B";
					close2;
					cutin "ep19_friederike01.png", 255;
					end;
				}
				mes "[�t���[�f���P]";
				mes "�����ł��ˁI";
				mes "�ł͎��͂𔭊������Ⴂ�܂���`�I";
				next;
				if(countitem(1000707) < 5) {
					mes "[�t���[�f���P]";
					mes "�����`�H";
					mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��^e5555e5��^000000�͂Ȃ��ƁA";
					mes "<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>�͍��܂����`�H";
					mes "���܂�ɂ�����Ȗ��͂����Ȃ��ł�����`�B";
					cutin "ep19_friederike02.png", 2;
					close2;
					cutin "ep19_friederike01.png", 255;
					end;
				}
				mes "[�t���[�f���P]";
				mes "���`��`�I";
				next;
				if(checkitemblank() == 0) {
					mes "^009eff�y�C���t�H���[�V�����z";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B^000000";
					close2;
					cutin "ep19_friederike04.png", 255;
					end;
				}
				delitem 1000707,5;
				getitem 1000706,1;
				mes "[�t���[�f���P]";
				mes "�ł��܂������`�I";
				mes "^e5555e���F���O���f^000000�l�Ɏ����čs���΁A��т܂���`�I";
				cutin "ep19_friederike03.png", 2;
				close2;
				cutin "ep19_friederike01.png", 255;
				end;
			case 3:
				mes "[�t���[�f���P]";
				mes "�C�X�K���h�̒����͏�肭�s���Ă܂����H";
				mes "�O�͐��������ł���ˁB";
				mes "�����I����āA";
				mes "�����ŋx�߂��炢���̂Ɂc�c�B";
				cutin "ep19_friederike04.png", 2;
				close2;
				cutin "ep19_friederike04.png", 255;
				end;
			case 4:
				mes "[�t���[�f���P]";
				mes "�͂��B";
				mes "�܂����炵�Ă��������ˁ`�B";
				cutin "ep19_friederike03.png", 2;
				close2;
				cutin "ep19_friederike03.png", 255;
				end;
			}
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̕X��(�N�G�X�g))") == 2) {
				mes "[�t���[�f���P]";
				cutin "ep19_friederike03.png", 2;
				mes "�́`���B";
				mes "����ł́A���n�ɑ���܂��ˁ`�B";
				mes "�撣���Ă��������`�B";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_back3.gat", 65, 321;	// from: icas_in.gat(31, 116)
				end;
			}
			mes "�N�G�X�g�̎󒍂�񍐁A";
			mes "���������\�ł��B";
			next;
			switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[�󒍉�] �t���[�f���P�̈��","�S�Ĕj������")) {
			case 3:
				if(checkquest(11813)) {
					if(!(checkquest(11813)&4) || countitem(1000705) < 5) {
						mes "[�t���[�f���P]";
						cutin "ep19_friederike01.png", 2;
						mes "<URL>���n���K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>��<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>��";
						mes "�e5�C���|���āA";
						mes "<ITEM>[���K���̖��͊j]<INFO>1000705</INFO></ITEM>��5�W�߂Ă��Ă��������`�B";
						next;
						mes "<<B>�N�G�X�g</B>>";
						mes "�u^ff0000�t���[�f���P�̈��^000000�v";
						mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
						mes "������̃N�G�X�g��j�����܂����H";
						next;
						if(select("��߂�","�j������") == 2) {
							mes "^ff0000[�C���t�H���[�V����]";
							mes "�����𒆒f���܂����B^000000";
							close2;
							cutin "kafra_01.bmp", 255;
							end;
						}
					}
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�t���[�f���P�̈��^000000�v";
					mes "<���e1>";
					mes "�ΏہF<URL>���n���K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>�@5��";
					mes "�ΏہF<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>�@5��";
					mes "�̓�����";
					next;
					mes "<���e2>";
					mes "�A�C�e���F<ITEM>���K���̖��͊j<INFO>1000705</INFO></ITEM>�@5��";
					mes "�̔[�i";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 8.2G ( 8200000000 )";
					mes "��410000000��20��󂯎��܂��B";
					mes "JobExp 6.2G ( 6200000000 )";
					mes "��310000000��20��󂯎��܂��B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�t���[�f���P�̈��^000000�v";
					mes "��񍐂��܂����H";
					next;
					if(select("�񍐂���","��߂�") == 2) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close;
					}
					delitem 1000705,5;
					delquest 11813;
					setquest 11814;
					getitem 1000608,3;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 410000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,310000000,0;
					mes "[�t���[�f���P]";
					cutin "ep19_friederike05.png", 2;
					mes "�킟�`�I����قǖ����̖��͊j�Ȃ�A";
					mes "�����Ƒf���炵�����̂����܂���`�I";
					mes "�������F���O���f�l��";
					cutin "ep19_friederike03.png", 2;
					mes "�����̐��ʂ�`���Ȃ��Ɓ`�I";
					next;
					mes "[�t���[�f���P]";
					mes strcharinfo(0)+"�l���A�������x��ł��������ˁB";
					mes "��`���Ă��������āA";
					mes "�{���ɂ��肪�Ƃ��������܂����B";
					mes "���������ƋF���Ă܂�����B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 8.2G";
					mes "( 8200000000 )";
					mes "��410000000 BaseExp��";
					mes "�@20��󂯎��܂����B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "JobExp 6.2G";
					mes "( 6200000000 )";
					mes "��310000000 JobExp��";
					mes "�@20��󂯎��܂����B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
					mes "���l�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "[�t���[�f���P]";
				cutin "ep19_friederike03.png", 2;
				mes "�킟�`�I����`�����Ă��������ł����H";
				mes "�܂��́A<URL>���n���K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_A</INFO></URL>��<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/monster/EP19_RGAN_B</INFO></URL>��";
				mes "�e5�C���|���Ă��������B";
				next;
				mes "[�t���[�f���P]";
				cutin "ep19_friederike05.png", 2;
				mes "���Ƃ́A�o���O�Ɏ���"+strcharinfo(0)+"����ɏj�����|���܂��I";
				mes "���̗\�z���m���Ȃ�A�j���̌��ʂ�";
				mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>������Ԃ̗ǂ�";
				mes "<ITEM>[���K���̖��͊j]<INFO>1000705</INFO></ITEM>����ɓ���͂��ł��`�B";
				mes "�ł��̂ŁA�������5�W�߂Ă��Ă��������B";
				next;
				mes "[�t���[�f���P]";
				cutin "ep19_friederike04.png", 2;
				mes "�������A����܂薳���͂����ɁA�����ɖ߂��Ă��Ă��������ˁI";
				mes strcharinfo(0)+"�l����������ꂽ�p������̂͐h���ł��I";
				mes "�����ł����`�H";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�t���[�f���P�̈��^000000�v";
				mes "<���e1>";
				mes "�ΏہF<URL>���n���K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_A</INFO></URL>�@5��";
				mes "�ΏہF<URL>�ŉ������K��<INFO>https://rotool.gungho.jp/map/EP19_RGAN_B</INFO></URL>�@5��";
				mes "�̓�����";
				next;
				mes "<���e2>";
				mes "�A�C�e���F<ITEM>���K���̖��͊j<INFO>1000705</INFO></ITEM>�@5��";
				mes "�̔[�i��";
				mes "�����̒B���ŕ񍐂��\�ł��B";
				mes "�N�G�X�g���󒍂��܂����H";
				next;
				if(select("�󒍂���","��߂�") == 2) {
					mes "[�t���[�f���P]";
					cutin "ep19_friederike01.png", 2;
					mes "��߂�̂ł����`�H";
					mes "�킩��܂����B";
					mes "�܂��A�����Ԃ��ł��܂�����A��낵�����肢���܂��ˁB";
					next;
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 11813;
				mes "[�t���[�f���P]";
				cutin "ep19_friederike03.png", 2;
				mes "����ł́A��낵�����肢���܂��ˁ`�B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�t���[�f���P�̈��^000000�v";
				mes "���󒍂��܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		mes "[�t���[�f���P]";
		mes "���������΁A";
		mes "���������H�[�N�����f�l����";
		mes "�����܂������B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���I���l��I�[�����[�l��";
		mes "�����⃋�K���̖��͊j���򉻂ł��邪�A";
		mes "���͂̏����������";
		mes "���܂ŋ�J���₦�Ȃ������݂����ł��ˁB";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���͊j���򉻂���΁A";
		mes "�����^e5555e���F���O���f^000000�l���c�c�B";
		mes "���`��c�c�����͕��������ǁA";
		mes "������悭������Ȃ�����̘b�Łc�c";
		mes "��������������Ă�������āc�c�B";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�Ƃɂ����I";
		mes "���͊j���򉻂��āA";
		mes "�򉻂��ꂽ���͊j���疂�͂�";
		mes "���o���ėl�X�Ȗ��͂̌����̂�";
		mes "��邱�Ƃ��ł���炵���ł��B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����F��ȗp�r�Ɏg�p���Ă����ł��B";
		mes "�������ꂢ�ɂ���Ƃ��A";
		mes "�H�ו������Ƃ��A";
		mes "�����𖾂邭����Ƃ��c�c";
		mes "�V����������݂�����";
		mes "�������ɕt������c�c�B";
		next;
		mes "[�t���[�f���P]";
		mes "��J���ď򉻂������͊j���A";
		mes "����Ȃ��ƂɎg���̂�";
		mes "�ܑ̂Ȃ��ƌ�������A";
		mes "���H�[�N�����f�l�Ɏ����܂����B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���H�[�N�����f�l�́A";
		mes "�����̖L�x��";
		mes "���[���~�b�h�K�b�c�̂悤�ȂƂ���ł�";
		mes "�����ɖ��������ݐ��́A";
		mes "������O�̂悤�Ɏ�ɓ��邯��ǁA";
		mes "�C�X�K���h�ł́A";
		mes "�Ⴄ�Ƃ������Ƃ������Ă��������܂����B";
		next;
		mes "[�t���[�f���P]";
		mes "�����ł́A�؂��炽�Ȃ����߁A";
		mes "�����ɖ�����𓔂����߂��Ƃ�����A";
		mes "�����򉻂��Ȃ���";
		mes "���ݐ��������Ȃ������ł��B";
		next;
		mes "[�t���[�f���P]";
		mes "������A���ׂȂ��ƈ����A";
		mes "�����Ă����ɂ͌��������Ȃ�";
		mes "�K�v�Ȃ��ƂȂ�ł����āB";
		next;
		mes "[�t���[�f���P]";
		mes "����ŁA���ꂩ��̓��I���l��";
		mes "�I�[�����[�l�̑���ɁA";
		mes "�򉻂����ӂȎ����I";
		mes "���͊j�̏򉻂����āA";
		mes "���Ηl��������`�����ƂɂȂ�܂����I";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "������"+strcharinfo(0)+"�l��";
		mes "���K������^e5555e���͊j^000000�𓾂���A";
		mes "���Ɏ����Ă��Ă��������B";
		mes "�����Y��ɏ򉻂��Ă��Ԃ����܂�����B";
		next;
		cutin "ep19_friederike01.png", 2;
		mes "[�t���[�f���P]";
		mes "���I����ƁA������I";
		mes "���ꂩ��̎��̉ۑ�炵���̂ł����A";
		mes "��������܂łɁA";
		mes "�򉻂ł��Ȃ��܂ܗ��߂��܂ꂽ";
		mes "�������ʂ̖��͊j�̂���q�ɂ�";
		mes "����񂾂����ł��B";
		next;
		mes "[�t���[�f���P]";
		mes "������򉻂����ł����c�c";
		mes "���̘b�𕷂��āA";
		mes "1�M�������Ƃ�����̂ł��B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���ʂ̖��͊j��";
		mes "^e5555e�����̒Ⴂ���K��^000000����";
		mes "�������������̂ŁA";
		mes "�������A���H������̂ł��B";
		mes "�L����Ɏ��͂̒n��";
		mes "��������Ă��܂��āc�c�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����ŁA";
		mes "���̏򉻂̏j�����󂯂���Ԃ�";
		mes "^e5555e���K���̒ዉ�̖��͊j^000000�𓾂�ƁA";
		mes "���͊j���򉻂��ꂽ��Ԃ�";
		mes "��ɓ���񂶂�Ȃ�����";
		mes "�v�����̂ł��B";
		mes "����𒲂ׂ悤�Ǝv���܂��āI";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���ꂾ���ł��A";
		mes "�ƂĂ���Ƃ��͂��ǂ肻���ł��I";
		mes strcharinfo(0)+"�l����������܂�����A";
		mes "�Q�����Ă݂܂��񂩁H";
		cutin "ep19_friederike05.png", 2;
		setquest 11812;
		compquest 11812;
		close2;
		cutin "ep19_friederike05.png", 255;
		end;
	}
	mes "[�t���[�f���P]";
	mes "����ɂ���`�B";
	mes "�����͂ǂ�����܂������`�H";
	cutin "ep19_friederike03.png", 2;
	next;
	menu "�G�k������",-;
	mes "[�t���[�f���P]";
	mes "�킟�I";
	mes "�����͂ǂ�Ȗʔ����b��";
	mes "�������Ă��������܂����H";
	close2;
	cutin "ep19_friederike01.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,35,118,3	script	���n�[��#ep19_room	10469,{/* 2926 (cloaking)*/
	switch(EP19_2QUE) {
	case 20:
		mes "[���n�[��]";
		mes "�ł́A�t���[�f���P�l��";
		mes "���̕����ł��߂������������ˁB";
		mes "�K�v�ȕ����������玄���Ă�ł��������B";
		mes "�ꏏ�ɂ��炵����������";
		mes "�����ňꏏ�ɋ���̂͑��v�ł��ˁH";
		mes "�t���[�f���P�l�H";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "����B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[���n�[��]";
		mes "��Ŏ����c�c�B";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�H�H�H]";
		mes "<FONT SIZE = 16><B>���n�[���a�I</FONT></B>";
		mes "<FONT SIZE = 16><B>�����ɂ���H</FONT></B>";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "�V������#ep19_dq_jorab";
		next;
		mes "[�H�H�H]";
		mes "���I";
		mes "�~�b�h�K���h���痈�����q�l�������ȁH";
		mes "�}�ɓ����Ă��܂�B";
		mes "�}���ł������̂Łc�c�B";
		next;
		mes "[���n�[��]";
		mes "�V�������A�ǂ�������ł����H";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�V������]";
		mes "���I���ꂪ�c�c";
		mes "�������������Ă�����";
		mes "�F�B��^e5555e��^000000�ɗ������񂾁B";
		mes "���ɐ������������炩�A";
		mes "�т������G��Ă��܂��A";
		mes "�ڂ��o�܂��Ȃ��񂾁B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�V������]";
		mes "�������ɉH�т�����Ȃ��z������A";
		mes "���̓z�炪�H�т��W�߂Ē������񂾂���";
		mes "�̂��₽���񂾁B";
		next;
		mes "[�V������]";
		mes "����ŁA^e5555e�򉻂��ꂽ���͊j^000000��";
		mes "�]���ĂȂ��������ɗ����񂾁B";
		mes "^e5555e�򉻂��ꂽ���͊j^000000���g���΁A";
		mes "�����񕜂ł��邾�낤����B";
		next;
		mes "[�V������]";
		mes "^e5555e���K���̒ዉ���͊j^000000�Ȃ�";
		mes "�����͎����Ă���񂾂��c�c";
		mes "�򉻂��Ȃ��Ƒ��̎g���Ȃ��΂����";
		mes "�߂��Ȃ�����ȁc�c�B";
		next;
		mes "[���n�[��]";
		mes "����ȁI";
		mes "�F�l�̕����������Ȃ炢���̂ł����c�c";
		mes "��ςł��ˁI";
		cutin "ep19_lehar05.png", 2;
		next;
		mes "[���n�[��]";
		mes "�򉻂��ꂽ���͊j�Ȃ�";
		mes "�ǂ��ɂ��Ȃ肻���ł�����A";
		mes "��U���̐l��";
		mes "������ɘA��ė��Ă��������B";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�V������]";
		mes "���v�H";
		mes "^e5555e���I���l^000000��^e5555e�I�[�����[�l^000000���A";
		mes "���͗]�͂�������������������ǁc�c�B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[���n�[��]";
		mes "���v�I�S�z���Ȃ��ŁI";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�V������]";
		mes "<FONT SIZE = 16><B>���肪�Ƃ��I</FONT></B>";
		mes "�����A��ė��邩��I";
		cutin "ep19_iwin03.png", 2;
		cloakonnpc "�V������#ep19_dq_jorab";
		next;
		mes "[���n�[��]";
		mes "�ł́A�t���[�f���P�l�B";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "����H";
		mes "�ȂɁH";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[���n�[��]";
		mes "�����I";
		mes "���̖��͊j���򉻂��Ă��������B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���̉������͂ȂɁH";
		mes "������򉻂��Ȃ���Ȃ�Ȃ��́H";
		mes "�G�肽���Ȃ��̂Ɂc�c�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[���n�[��]";
		mes "���ꂳ�񂪗��񂾂��̂ł��B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�Ё[��c�c�B";
		mes "�򉻂�������΂�����ˁH";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[���n�[��]";
		mes "�t���[�f���P�l��";
		mes "�ǂ�������Ȃ����Ⴀ��܂��񂩁B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ł��A�G�鎞�͋C�����������́c�c�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���Ⴀ�A�͂��B";
		mes "����ł����H";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[���n�[��]";
		mes "�͂��c�c�B";
		mes "�\�z�͂��Ă��܂������A";
		mes "����ȏ�ɕ��C�Ȃ�";
		mes "�򉻂��Ă��܂��܂��ˁB";
		cutin "ep19_lehar04.png", 2;
		next;
		mes "[���n�[��]";
		mes "���͊j�̏򉻂̓��I���l��";
		mes "�I�[�����[�l���ł��܂����A";
		mes "�򉻂ɓ������ꂽ�������ł͂Ȃ�����A";
		mes "�{���ɕK�v�Ȏ��ɂ����A";
		mes "�������򉻂���Ă��܂����B";
		next;
		mes "[���n�[��]";
		mes "�����ʂ̖��͂łł���";
		mes "���̎d�����l����΁A";
		mes "�����͈��߂��܂�������ˁB";
		next;
		mes "[���n�[��]";
		mes "���ꂳ�񂪂���ȂɕK���ɂȂ���";
		mes "�t���[�f���P�l��T���Ă������Ƃɂ�";
		mes "�[���������܂��B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�{���H";
		mes "���H�[�N�����f�l��";
		mes "��������ȂɒT���Ă����́H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[���n�[��]";
		mes "���������A";
		mes "���͊j�̏򉻂����Ă�����������A";
		mes "���ꂳ��������Ɗ�Ԃł��傤�B";
		cutin "ep19_lehar01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���ւցc�c�B";
		cutin "ep19_friederike03.png", 2;
		next;
		cutin "ep19_friederike01.png", 255;
		cloakoffnpc "�V������#ep19_dq_jorab";
		mes "[�V������]";
		mes "�A��Ă�����I";
		close2;
		setquest 130503;
		delquest 11811;
		set EP19_2QUE,21;
		showevent 9999, 0, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		showevent 9999, 0, "���n�[��#ep19_room";	// 2912: 35, 118
		showevent 0, 3, "�V������#ep19_dq_jorab";	// 2913: 27, 116
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,27,116,5	script	�V������#ep19_dq_jorab	10461,{/* 2927 (cloaking)*/
	switch(EP19_2QUE) {
	case 21:
		mes "[�V������]";
		mes "���n�[���l�I�I";
		mes "�A��ė��܂����I";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "�^�}����#ep19_refrigera";
		next;
		mes "[���n�[��]";
		mes "�����c�c�Ȃ�ł����B";
		mes "���̂������ȏL���́c�c�B";
		cutin "ep19_lehar03.png", 2;
		cloakoffnpc "���n�[��#ep19_room";
		next;
		mes "[�V������]";
		mes "�ڂ������Ƃ͎���������Ȃ��B";
		mes "�ڂ��o�߂���b��������񂶂�Ȃ����ȁH";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[���n�[��]";
		mes "�t���[�f���P�l�A";
		mes "��U���̕����򉻂��c�c�B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����c�c";
		mes "���x���ςȂ��Ƃ΂����点�āc�c";
		mes "�L���悤�c�c�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�H�H�H]";
		mes "�����c�c�B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�H�H�H]";
		mes "<FONT SIZE = 16><B>������I�I</FONT></B>";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�V������]";
		mes "�^�}�����A�C���t�������H";
		mes "���v�I�H";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�V������]";
		mes "���肪�Ƃ��������܂��B";
		mes "���n�[���l�I";
		mes "�t���[�c�f���P�l�c�c�H";
		next;
		mes "[�^�}����]";
		mes "���͂͂͂��c�c";
		mes "���ʂ��Ǝv�����c�c�B";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�e���[���A��]";
		mes "�����I�I";
		mes "�^�}�����I�I";
		mes "�����ŉ�����Ă�񂾁I�H";
		cutin "ep18_dew_02.png", 2;
		cloakoffnpc "�e���[���A��#ep19_room";
		next;
		mes "[�^�}����]";
		mes "�͂��I�I";
		mes "�e���[���A���I";
		mes "�����ɂ͂ǂ�����Ă�����ł��I�H";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�e���[���A��]";
		mes "�����m���I�I";
		cutin "ep18_dew_01.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�{���ɂǂ��Ȃ��Ă��ł����H";
		cloakoffnpc "�}�[�N�C�V��#ep19_room";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�^�}����]";
		mes "�}�[�N�C�V���܂ŁH";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[���n�[��]";
		mes "���m�荇���ł����H";
		mes "�C�X�K���h��^e5555e���ҏ�^000000�Ȃ��ł�";
		mes "����Ȃ��͂��Ȃ̂ɁA";
		mes "�ǂ�����Ă����܂ŗ�����ł����H";
		cutin "ep19_lehar04.png", 2;
		setquest 11815;
		delquest 130503;
		set EP19_2QUE,22;
		close2;
		showevent 9999, 0, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		showevent 9999, 0, "���n�[��#ep19_room";	// 2912: 35, 118
		showevent 9999, 0, "�V������#ep19_dq_jorab";	// 2913: 27, 116
		showevent 0, 3, "�^�}����#ep19_refrigera";	// 2914: 27, 122
		cutin "ep19_lehar01.png", 255;
		end;
	case 22:
		mes "[�V������]";
		mes "���肪�Ƃ��������܂��B";
		mes "���n�[���l�I";
		mes "�t���[�c�f���P�l�c�c�H";
		cutin "ep19_iwin03.png", 2;
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	case 24:
	case 26:
	case 27:
	case 35:
		mes "[�V������]";
		mes "�H�т��G���Ƒ̂��d���A";
		mes "���ׂ��Ђ��₷���Ȃ�܂��B";
		mes "���ł�������";
		mes "�悭���������Ƃ��厖�ł��B";
		cutin "ep19_iwin03.png", 2;
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	case 36:
		mes "[�V������]";
		mes "����ɂ���B";
		mes "���Ԃ���������";
		mes "�̂Ă�ꂽ���̒�����";
		mes "��`���Ă��������܂����H";
		cutin "ep19_iwin01.png", 2;
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̕���(�N�G�X�g))") == 2) {
			mes "[�V������]";
			cutin "ep19_iwin03.png", 2;
			mes "������܂����B";
			mes "����ł́A���n�ɑ���܂��B";
			close2;
			cutin "kafra_01.bmp", 255;
			warp "jor_back2.gat", 258, 310;	// from: icas_in.gat(30, 116)
			end;
		}
		mes "�N�G�X�g�̎󒍂�񍐁A";
		mes "���������\�ł��B";
		next;
		switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[�󒍉�] �̂Ă���قǂ̏ꏊ�@","[^888888BaseLv230����󒍉\^000000] �̂Ă���قǂ̏ꏊ�A","[�󒍉�] �@���āA�܂��@����","�S�Ĕj������")) {
		case 3:
			if(checkquest(11831)) {
				if(!(checkquest(11831)&4)) {
					mes "[�V������]";
					cutin "ep19_iwin03.png", 2;
					mes "<URL>�p�����ꂽ���n���K��<INFO>https://rotool.gungho.jp/monster/EP19_WASTED_RGAN_A</INFO></URL>��<URL>���A�J���}����<INFO>https://rotool.gungho.jp/monster/EP19_CAVE_CALMARING</INFO></URL>���e10�C���|���āA";
					mes "<ITEM>[����t������]<INFO>1000708</INFO></ITEM>��10�قǎ����Ă��Ă��������B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�̂Ă���قǂ̏ꏊ�@^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�̂Ă���قǂ̏ꏊ�@^000000�v";
				mes "<���e1>";
				mes "�ΏہF<URL>�p�����ꂽ���n���K��<INFO>https://rotool.gungho.jp/map/EP19_WASTED_RGAN_A</INFO></URL>�@10��";
				mes "�ΏہF<URL>���A�J���}����<INFO>https://rotool.gungho.jp/map/EP19_CAVE_CALMARING</INFO></URL>�@10��";
				mes "�̓�����";
				next;
				mes "<���e2>";
				mes "�A�C�e���F<ITEM>����t������<INFO>1000708</INFO></ITEM>�@10��";
				mes "�̔[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 12G ( 12000000000 )";
				mes "��600000000��20��󂯎��܂��B";
				mes "JobExp 13.125G ( 13125000000 )";
				mes "��656250000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@4��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�̂Ă���قǂ̏ꏊ�@^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 23228,10;
				delquest 11831;
				setquest 11832;
				getitem 1000608,4;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 600000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,656250000,0;
				mes "[�V������]";
				cutin "ep19_iwin03.png", 2;
				mes "��������Ȃ����B";
				mes "�������ŉ����ł��B";
				next;
				mes "[�V������]";
				mes "����Ȃɑ�R�̓������������x��";
				mes "���̌������̂܂܈ێ����ꂽ�炢���ȁA";
				mes "�Ƃ����S�ƁA����ȋC������������";
				mes "�����ɂł����߂Ă��܂������Ƃ���";
				mes "�C���������߂������܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 12G";
				mes "( 12000000000 )";
				mes "��600000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 13.125G";
				mes "( 13125000000 )";
				mes "��656250000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@4��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(11832)) {
				if(!(checkquest(11832)&2)) {
					mes "[�V������]";
					cutin "ep19_iwin03.png", 2;
					mes "���肪�Ƃ��������܂����I";
					mes "�����͂����܂łɂ��܂��傤�I";
					mes "�������x��ŉ������B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�̂Ă���قǂ̏ꏊ�@^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			mes "[�V������]";
			cutin "ep19_iwin03.png", 2;
			mes "��`���Ă�����ł����H";
			mes "����ł́A^e5555e�p�����ꂽ���n���K��^000000��^e5555e���A�J���}����^000000���e10�C���|���āA";
			mes "^e5555e����t������^000000��10�قǎ����Ă��Ă��������B";
			next;
			mes "[�V������]";
			mes "���ꂮ����C��t���Ă��������ˁB";
			mes "�������厖�Ȃ��̂͂���܂��񂩂�B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�̂Ă���قǂ̏ꏊ�@^000000�v";
			mes "<���e1>";
			mes "�ΏہF<URL>�p�����ꂽ���n���K��<INFO>https://rotool.gungho.jp/map/EP19_WASTED_RGAN_A</INFO></URL>�@10��";
			mes "�ΏہF<URL>���A�J���}����<INFO>https://rotool.gungho.jp/map/EP19_CAVE_CALMARING</INFO></URL>�@10��";
			mes "�̓�����";
			next;
			mes "<���e2>";
			mes "�A�C�e���F<ITEM>����t������<INFO>1000708</INFO></ITEM>�@10��";
			mes "�̔[�i��";
			mes "�����̒B���ŕ񍐂��\�ł��B";
			mes "�N�G�X�g���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�V������]";
				cutin "ep19_iwin03.png", 2;
				mes "��߂�̂ł����H";
				mes "���v�ł���B";
				mes "�����厖�Ȃ��̂͂���܂��񂩂�ˁB";
				next;
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11831;
			mes "[�V������]";
			cutin "ep19_iwin03.png", 2;
			mes "����ł́A��낵�����肢���܂��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�̂Ă���قǂ̏ꏊ�@^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 4:
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�̂Ă���قǂ̏ꏊ�A^000000�v��";
			mes "BaseLv230����󒍂ł���N�G�X�g�ł��B";
			close;
		case 5:
			if(checkquest(11849)) {
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�@���āA�܂��@����^000000�v";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 4.5G ( 4500000000 )";
				mes "��225000000��20��󂯎��܂��B";
				mes "JobExp 3.5G ( 3500000000 )";
				mes "��175000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�@���āA�܂��@����^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 11835;
				delquest 11849;
				setquest 11850;
				getitem 1000608,2;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 225000000,0,0;
				for(set '@i,0; '@i < 20; set '@i,'@i+1)
					getexp 0,175000000,0;
				mes "[�V������]";
				cutin "ep19_iwin03.png", 2;
				mes "��������Ȃ����B";
				mes "�������ŉ����ł��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 4.5G";
				mes "( 4500000000 )";
				mes "��225000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 3.5G";
				mes "( 3500000000 )";
				mes "��175000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			if(checkquest(11835)) {
			}
			if(checkquest(11850)) {
				mes "[�V������]";
				cutin "ep19_iwin03.png", 2;
				mes "���肪�Ƃ��������܂����I";
				mes "�����͂����܂łɂ��܂��傤�I";
				mes "�������x��ŉ������B";
				next;
				mes "[�C���t�H���[�V����]";
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�@���āA�܂��@����^000000�v";
				mes "�͎��Ԑ������ł��B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[�V������]";
			cutin "ep19_iwin03.png", 2;
			mes "�̂Ă�ꂽ���͂܂��傫�Ȗ�肪���t�����Ă��܂��񂪁A";
			mes "�������N���邩������܂���B";
			mes "�Ȃ̂ŁA^e5555e����������^000000��������";
			mes "��ɌG�Ȃ��������Ă��܂��B";
			next;
			mes "[�V������]";
			mes "������^e5555e�A���v�I�J�[�g^000000�l�ɒ������˗����Ă��܂����A";
			mes "�Ƃ�Œ�������ɂ́A���Ԃ������|�����Ċ댯�ł��B";
			mes "�ł�����A"+strcharinfo(0)+"�����^e5555e�����̍���^000000���������A";
			mes "��������`���Ă��������܂��񂩁H";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�@���āA�܂��@����^000000�v";
			mes "���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�V������]";
				cutin "ep19_iwin03.png", 2;
				mes "��߂�̂ł����H";
				mes "���v�ł���B";
				mes "�����厖�Ȃ��̂͂���܂��񂩂�ˁB";
				next;
				mes "^ff0000[�C���t�H���[�V����]";
				mes "�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11835;
			mes "[�V������]";
			cutin "ep19_iwin03.png", 2;
			mes "�܂��́A^e5555e�A���v�I�J�[�g^000000�l�̂Ƃ����";
			mes "�������āA�w�����󂯂Ă��������B";
			mes "����ł́A��낵�����肢���܂��B";
			next;
			//showevent 0, 2, "�V������#ep19_dq_jorab";	// 2913: 27, 116
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�@���āA�܂��@����^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
		mes "[�V������]";
		mes "�ӂ��c�c";
		mes "�{���ɋ��낵�����ł����B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�V������]";
		mes "����Ȃ��̂����t���������Ƃ�";
		mes "���ɂ̎�ł����A";
		mes "����ł��K���Ȃ̂�^e5555e�㋉���K��^000000��";
		mes "���Ȃ������Ȃ��Ƃ��炢�ł��ˁB";
		next;
		mes "[�V������]";
		mes "���K���͓����g����z�����Ȃ��ƁA";
		mes "�P�Ȃ�G���̏O�ɉ߂��܂��񂩂�ˁB";
		next;
		mes "[�V������]";
		mes "�������A";
		mes "�㋉���K�������Ȃ��Ƃ������Ƃ́A";
		mes "���K�����������̌��ɂ��ẮA";
		mes "�d�v�����Ă��Ȃ��Ƃ������Ƃł��B";
		next;
		mes "[�V������]";
		mes "�����瑤�����肭�ǂ��΁A";
		mes "�󋵂��������邱�Ƃ͂Ȃ��ł��傤�B";
		mes "��肭�����Ȃ���΁A";
		mes "�t���[�f���P�l�̗͂�";
		mes "�؂�邵���Ȃ��ł��傤����ǁB";
		next;
		mes "[�V������]";
		mes "�����Ȃ�����";
		mes "�H�Ƃ��̏W�ł���ꏊ�������āA";
		mes "�������Ƃ΂��肶�Ⴀ��܂���B";
		next;
		mes "[�V������]";
		mes "���������������𒲍����Ă݂܂����A";
		mes "���͎肪����Ă��܂���B";
		mes "�݂Ȃ�������Ԃ���������";
		mes "��`���Ă�����������K���ł��B";
		setquest 11830;
		compquest 11830;
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	}
	mes "[�V������]";
	mes "�A�[�E�B���͉H�т��L�x�Ȃق�";
	mes "�i�D�������̂Ȃ�ł��B";
	cutin "ep19_iwin03.png", 2;
	close2;
	cutin "ep19_iwin03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}
icas_in.gat,27,122,5	script	�^�}����#ep19_refrigera	10463,{/* 2928 (cloaking)*/
	switch(EP19_2QUE) {
	case 22:
		cloakoffnpc "���n�[��#ep19_room";
		mes "[�^�}����]";
		mes "�b������ƒ����̂ł����c�c�B";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[�^�}����]";
		mes "�����Ɓc�c";
		mes "�����o�������g�@��";
		mes "�����Ă������̂��Ƃł��B";
		mes "�n�����H���܂���ꂽ�Ƃ̕񍐂𕷂��āA";
		mes "�C�������ɍs������ł��B";
		next;
		mes "[�^�}����]";
		mes "����������A";
		mes "�����Ȃ�^e5555e�C���V�I��^000000�����������";
		mes "����f�v������ł��B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "^e5555e��s�D^000000�݂����ȕ���";
		mes "�悹��ꂽ�悤�ł������c�c";
		mes "�C���t�������́A";
		mes "^e5555e�������L�����[���������A^000000�݂�����";
		mes "�ꏊ�ł����B";
		next;
		mes "[�^�}����]";
		mes "���͂ɂ͎��Ɠ����悤��";
		mes "^e5555e�f�v���ꂽ�l����^000000������������ł����A";
		mes "���l�͂Ȃ�Ƃ������o������ł��B";
		mes "�������̈�l�ł��B";
		mes "���̕������������Ȃ̂���";
		mes "������܂���B";
		next;
		mes "[�^�}����]";
		mes "���A��E�o����";
		mes "�����铹���œ|��Ă����̂��A";
		mes "������ɂ���V��������";
		mes "���t���ď����Ă���܂����B";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[�V������]";
		mes "�����I!";
		mes "�^�}�����A���O�A";
		mes "�A�[�E�B������Ȃ������񂾁H";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "����A���̂ǂ���������A";
		mes "�A�[�E�B���Ȃ�ł����B";
		mes "�����ŁA";
		mes "���ƂȂ����z���Ƃ����āA";
		mes "�H�т�������ł��c�c�B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�V������]";
		mes "�����Ȃ̂��I";
		mes "�܂��A���ׂȂ��Ƃ͒u���Ă������B";
		mes "�������͂ǂ������񂾂�H";
		mes "�}�ɓ|��Ă邩��";
		mes "��������������B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "����A���ׂȂ��Ƃ��āc�c�B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�V������]";
		mes "�܂��܂��I";
		mes "��������A";
		mes "�ڂ͊o�߂��A�̂͒i�X�₽���Ȃ邵�A";
		mes "���̂܂܎��񂶂Ⴄ���Ǝv������I";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "�����A�����݂�����";
		mes "���}�L�i������Ă��������Ȃ̂ɁA";
		mes "�}�ɑ���������āA";
		mes "���ɗ����Ă��܂��܂����B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "�ŏ��́A�P�ɕX������Đ��ɗ�������";
		mes "�v������ł��B";
		mes "�����ǁA�����ɐ��̐F�������������Ƃ�";
		mes "�C�Â��āA�}���Ŕ����オ��܂����B";
		mes "�����āA��������̋L��������܂���B";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[���n�[��]";
		mes "���`��B";
		mes "�V�������ɘb�ɂ��ƁA";
		mes "�������̂͌������Č����Ă܂����ˁB";
		mes "���Ȃ�댯�Ȍ��Ȃ̂ł͂Ȃ��ł��傤���H";
		mes "�C���������������A";
		mes "��̉������ł͂Ȃ��ł��傤�B";
		cutin "ep19_lehar03.png", 2;
		next;
		mes "[�^�}����]";
		mes "�����ł��ˁB";
		mes "���������΁A���ɗ�����O�ɒ��ׂĂ���";
		mes "^e5555e�^000000�����Ă����݂����ł��B";
		mes "���A��㩂Ɋ|�����Ă������}�L�i��";
		mes "�}�ɉ������ĂЂǂ��ڂɂ����܂����B";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�V������]";
		mes "㩂����邱�Ƃ�";
		mes "�悭���邱�Ƃ���Ȃ����B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "��������Ȃ��āc�c";
		mes "�N�����킴�Ɖ󂵂��悤�ȍ��Ղ�";
		mes "��������ł��B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�V������]";
		mes "���̌����^�������Ȃ��ȁc�c�B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "��͂�A�������������悳�����ł��B";
		mes "�܂��N�������䂷��ƍ���܂�����B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�V������]";
		mes "��������ȁI";
		mes "���O�͋x��ł���B";
		mes "�����s���Ē������Ă݂邩��B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "����������`���܂��B";
		mes "��l�Œ����ł�����";
		mes "�������������ςł�����ˁB";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�V������]";
		mes "���肪�Ƃ��������܂��B";
		mes "�ł́A�݂Ȃ���́A<URL>���ĕt�����؂̋u<INFO>https://rotool.gungho.jp/map/jor_back1</INFO></URL>��";
		mes "<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>��";
		mes "�ݒu���Ă���㩂𒲍����Ă��������B";
		mes "���̓^�}�������������ꏊ�̋߂���";
		mes "��ɒ������Ă��܂�����B";
		cutin "ep19_iwin03.png", 2;
		next;
		menu "�댯�ł�",-;
		mes "[�V������]";
		mes "�S�z���Ȃ��ł��������B";
		mes "^e5555e�򉻂��ꂽ���͊j�ŋ������ꂽ�_�C�r���O����^000000��";
		mes "���Ă����܂��̂ŁA";
		mes "������x�͑ς����܂���B";
		next;
		mes "[�V������]";
		mes "�ł́A";
		mes "<URL>���ĕt�����؂̋u<INFO>https://rotool.gungho.jp/map/jor_back1</INFO></URL>��";
		mes "<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>�ŁA";
		mes "^e5555e㩂𒲍�^000000����";
		mes "�����𔭌�������A";
		mes "<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>�̖k������";
		mes "���Ă��������B";
		setquest 11816;	showevent 0, 3, "����#ep19_1";	// 2915: 300, 272
		delquest 11815;
		set EP19_2QUE,23;
		cutin "ep19_iwin03.png", 255;
		cloakonnpc "���n�[��#ep19_room";
		cloakonnpc "�e���[���A��#ep19_room";
		cloakonnpc "�}�[�N�C�V��#ep19_room";
		next;
		//showevent 9999, 0, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		//showevent 9999, 0, "���n�[��#ep19_room";	// 2912: 35, 118
		//showevent 9999, 0, "�V������#ep19_dq_jorab";	// 2913: 27, 116
		//showevent 0, 3, "�^�}����#ep19_refrigera";	// 2914: 27, 122
		mes "�]���ĕt�����؂̋u�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̋u�֌��������]";
		close2;
		warp "jor_back1.gat", 300, 267;	// from: icas_in.gat(32, 116)
		end;
	case 23:
	case 24:
	case 25:
	case 26:
		mes "[�^�}����]";
		mes "���������Ό��ɗ�����O�ɒ��ׂ�";
		mes "^e5555e㩂����Ă���^000000�悤�ł����B";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�^�}����]";
		mes "�N�����킴�Ɖ󂵂Ă悤��";
		mes "���Ղ�����܂����B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "��͂蒲�����������ǂ������ł��B";
		mes "�܂��N�����䂵���獢��܂�����ˁB";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "�܂��́A";
		mes "<URL>���ĕt�����؂̋u<INFO>https://rotool.gungho.jp/map/jor_back1</INFO></URL>��";
		mes "<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>�ŁA";
		mes "^e5555e㩂𒲍�^000000���Ă��������B";
		next;
		mes "[�^�}����]";
		mes "�����𔭌�������A";
		mes "<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>�̖k�����ɂ���";
		mes "�_�C�o�[�X�[�c�̃V����������̏���";
		mes "�������Ă��������B";
		cutin "ep19_tamarin03.png", 255;
		next;
		set '@num,EP19_2QUE - 23;
		setarray '@str$,"���ĕt�����؂̋u","���ĕt�����؂̕���","���ĕt�����؂̕���","���ĕt�����؂̕���";
		setarray '@map$,"jor_back1.gat","jor_back2.gat","jor_back2.gat","jor_back2.gat";
		setarray '@x,300,346,264,259;
		setarray '@y,267,197,290,309;
		mes "�]" +'@str$['@num]+ "�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̋u�֌��������]";
		close2;
		warp '@map$['@num], '@x['@num], '@y['@num];	// from: icas_in.gat(32, 116)
		end;
	case 36:
		if(checkquest(11851)&8) {
			cutin "ep19_tamarin01.png", 2;
			mes "[�^�}����]";
			mes strcharinfo(0)+"�l�I";
			mes "���������ɍs���āA";
			mes "�H�����B��";
			mes "����`�������Ă����������ł����H";
			next;
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̋u)") == 2) {
				mes "[�^�}����]";
				cutin "ep19_tamarin04.png", 2;
				mes "������܂����B";
				mes "����ł́A���n�Ɍ������Ă��������B";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_back1.gat", 226, 382;	// from: icas_in.gat(29, 119)
				end;
			}
			mes "�N�G�X�g�̎󒍂�񍐁A";
			mes "���������\�ł��B";
			next;
			switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[�󒍉�] �①�ɂ��K�v���H","[�󒍉�] �p���p���ȓ���","�S�Ĕj������")) {
			case 3:
				if(checkquest(11852)) {
					if(countitem(1000708) < 30) {
						mes "[�^�}����]";
						cutin "ep19_tamarin04.png", 2;
						mes "<URL>���ĕt�����؂̕����ɏo�����郂���X�^�[<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>��|���āA";
						mes "<ITEM>[����t������]<INFO>1000708</INFO></ITEM>��^e5555e30^000000�W�߂Ă��Ă��������B";
						mes "�①�ɂɑ����Ă����Ȃ��ƁA";
						mes "�������x�߂����ɂȂ���ł��B";
						next;
						mes "<<B>�N�G�X�g</B>>";
						mes "�u^ff0000�①�ɂ��K�v���H^000000�v";
						mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
						mes "������̃N�G�X�g��j�����܂����H";
						next;
						if(select("��߂�","�j������") == 1) {
							mes "^ff0000[�C���t�H���[�V����]";
							mes "�����𒆒f���܂����B^000000";
							close2;
							cutin "kafra_01.bmp", 255;
							end;
						}
					}
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�①�ɂ��K�v���H^000000�v";
					mes "<���e>";
					mes "�A�C�e���F<ITEM>[����t������]<INFO>1000708</INFO></ITEM>�@30��";
					mes "��[�i";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 6G ( 6000000000 )";
					mes "��300000000��20��󂯎��܂��B";
					mes "JobExp 4.5G ( 4500000000 )";
					mes "��225000000��20��󂯎��܂��B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�①�ɂ��K�v���H^000000�v";
					mes "��񍐂��܂����H";
					next;
					if(select("�񍐂���","��߂�") == 2) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close;
					}
					delitem 1000708,30;
					delquest 11852;
					setquest 11853;
					getitem 1000608,3;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 300000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,225000000,0;
					mes "[�^�}����]";
					cutin "ep19_tamarin02.png", 2;
					mes "�͂��c�c�B";
					mes strcharinfo(0)+"�l�A��������Ⴂ�܂��B";
					mes "���A�����Ă��܂��Ă��܂����B";
					next;
					mes "[�^�}����]";
					cutin "ep19_tamarin04.png", 2;
					mes "�{���ɂ����l�ł��B";
					mes "���������񕜂��č������܂��B";
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
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
					mes "���l�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(11853)) {
					if(!(checkquest(11853)&2)) {
						mes "[�^�}����]";
						cutin "ep19_tamarin04.png", 2;
						mes "�����̕K�v�ȕ��͏\���ł�����B";
						mes "���������ɂ������x��ł��������B";
						mes "�܂���������낵�����肢���܂��B";
						next;
						mes "[�C���t�H���[�V����]";
						mes "<<B>�N�G�X�g</B>>";
						mes "�u^ff0000�①�ɂ��K�v���H^000000�v";
						mes "�͎��Ԑ������ł��B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "[�^�}����]";
				cutin "ep19_tamarin04.png", 2;
				mes "����ł́A<URL>���ĕt�����؂̕����ɏo�����郂���X�^�[<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>��|���āA^e5555e����t������^000000��^e5555e30^000000�W�߂Ă��Ă��������B";
				mes "�①�ɂɑ����Ă����Ȃ��ƁA�������x�߂����ɂȂ���ł��B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�①�ɂ��K�v���H^000000�v";
				mes "<���e>";
				mes "�A�C�e���F<ITEM>[����t������]<INFO>1000708</INFO></ITEM>�@30��";
				mes "�̔[�i���󒍂��܂����H";
				next;
				if(select("�󒍂���","��߂�") == 2) {
					mes "[�^�}����]";
					cutin "ep19_tamarin04.png", 2;
					mes "��߂܂����H";
					mes "������܂����B";
					mes "�ɂȎ��ɂ��肢���܂��B";
					next;
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 11852;
				mes "[�^�}����]";
				cutin "ep19_tamarin04.png", 2;
				mes "����ł́A��낵�����肢���܂��B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�①�ɂ��K�v���H^000000�v";
				mes "���󒍂��܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			case 4:
				if(checkquest(11858)) {
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�p���p���ȓ���^000000�v";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 4.5G ( 4500000000 )";
					mes "��225000000��20��󂯎��܂��B";
					mes "JobExp 3.5G ( 3500000000 )";
					mes "��175000000��20��󂯎��܂��B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�p���p���ȓ���^000000�v";
					mes "��񍐂��܂����H";
					next;
					if(select("�񍐂���","��߂�") == 2) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close;
					}
					delquest 11854;
					delquest 11858;
					setquest 11859;
					getitem 1000608,2;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 225000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,175000000,0;
					mes "[�^�}����]";
					cutin "ep19_tamarin02.png", 2;
					mes "�͂��c�c�B";
					mes strcharinfo(0)+"�l�A��������Ⴂ�܂��B";
					mes "���A�����Ă��܂��Ă��܂����B";
					next;
					mes "[�^�}����]";
					cutin "ep19_tamarin04.png", 2;
					mes "�{���ɂ����l�ł��B";
					mes "���������񕜂��č������܂��B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 4.5G";
					mes "( 4500000000 )";
					mes "��225000000 BaseExp��";
					mes "�@20��󂯎��܂����B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "JobExp 3.5G";
					mes "( 3500000000 )";
					mes "��175000000 JobExp��";
					mes "�@20��󂯎��܂����B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@2��";
					mes "���l�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(11854)) {
					mes "[�^�}����]";
					cutin "ep19_tamarin04.png", 2;
					mes "<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>�ɍs���A";
					mes "�ݒu���Ă���^e5555e�^000000�𒲂ׂĂ��Ă��������B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�p���p���ȓ���^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				if(checkquest(11859)) {
					if(!(checkquest(11859)&2)) {
						mes "[�^�}����]";
						cutin "ep19_tamarin04.png", 2;
						mes "�����̕K�v�ȕ��͏\���ł�����B";
						mes "���������ɂ������x��ł��������B";
						mes "�܂���������낵�����肢���܂��B";
						next;
						mes "[�C���t�H���[�V����]";
						mes "<<B>�N�G�X�g</B>>";
						mes "�u^ff0000�p���p���ȓ���^000000�v";
						mes "�͎��Ԑ������ł��B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "[�^�}����]";
				cutin "ep19_tamarin04.png", 2;
				mes "�ȑO�A�������u���ꂽ㩂��C�����悤�ƐG������A���X�ɂȂ��ĕ��ɔ��ł����Ă��܂��܂����B";
				next;
				mes "[�^�}����]";
				cutin "ep19_tamarin04.png", 2;
				mes "�����Ȃ�O�ɁA<URL>���ĕt�����؂̕���<INFO>https://rotool.gungho.jp/map/jor_back2</INFO></URL>�ɍs���A�ݒu���Ă���^e5555e�^000000�𒲂ׂĂ��Ă��������B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�p���p���ȓ���^000000�v";
				mes "���󒍂��܂����H";
				next;
				if(select("�󒍂���","��߂�") == 2) {
					mes "[�^�}����]";
					cutin "ep19_tamarin04.png", 2;
					mes "��߂܂����H";
					mes "������܂����B";
					mes "�ɂȎ��ɂ��肢���܂��B";
					next;
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 11854;
				mes "[�^�}����]";
				cutin "ep19_tamarin04.png", 2;
				mes "����ł́A��낵�����肢���܂��B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�p���p���ȓ���^000000�v";
				mes "���󒍂��܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		mes "[�^�}����]";
		mes "���������c�c";
		mes "�݂��ނ��ނ����āc�c";
		mes "�r���Y�L�Y�L����c�c�B";
		cutin "ep19_tamarin03.png", 2;
		next;
		mes "[�^�}����]";
		mes "�g�̂��v�������񕜂��܂���ˁB";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[�^�}����]";
		mes "�������ɏo�����Ȃ��ƁA";
		mes "�①�ɂ�������ɂȂ��Ă��܂��̂ɁB";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�^�}����]";
		mes "�t���[�f���P�l�͎��ȂȂ����������ł�";
		mes "�K�����Ƌ��Ă܂������ǁc�c�B";
		cutin "ep19_tamarin04.png", 2;
		next;
		mes "[�^�}����]";
		mes "���̓V�����������̒����̏��ׂ�";
		mes "���ɎQ���ł��Ȃ��ł�����A";
		mes "���̗��������ڂ����ق�";
		mes "�Z���������Ă���悤�ł��ˁB";
		next;
		mes "[�^�}����]";
		mes "��������������A";
		mes "���̓����㩂�";
		mes "�����ɗ򉻂��Ă��܂����c�c�B";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[�^�}����]";
		mes "��낵����΁A";
		mes ""+strcharinfo(0)+"�l��";
		mes "�H���̒��B��";
		mes "��`���Ă��������܂��񂩁H";
		mes "�������A��������܂��B";
		next;
		if(select("��`��","���͖Z����") == 2) {
			mes "[�^�}����]";
			mes "�����ł����c�c";
			mes "�܂����Ԃ��ł�����";
			mes "��낵�����肢���܂��B";
			close;
		}
		mes "[�^�}����]";
		mes "���肪�Ƃ��������܂��I";
		mes "�ł́A�①�ɂ��m�F���āA";
		mes "�K�v�ȗʂ��������܂��̂�";
		mes "����������A";
		mes "������x�b�������Ă��������B";
		cutin "ep19_tamarin04.png", 2;
		close2;
		cutin "ep19_tamarin04.png", 255;
		setquest 11851;
		compquest 11851;
		end;
	}
	mes "[�^�}����]";
	mes "���c�c�������c�c���ʂ��B";
	cutin "ep19_tamarin03.png", 2;
	close2;
	cutin "ep19_tamarin03.png", 255;
	end;
OnInit:
	cloakonnpc;
	end;
}

jor_back1.gat,300,272,3	script	����#ep19_1	10024,{/* 2929 */
	if(EP19_2QUE == 23) {
		mes "�]�₽������t�������㩂�����B";
		mes "�@�Â����ƈȊO�͓��ɖ��͖����������]";
		next;
		mes "[�A�[�E�B���̗�]";
		mes "�N���I";
		mes "���ł��Ȃ��݂��������A";
		mes "������㩂����ŐG���Ă���񂾁H";
		mes "�G���H�I";
		cutin "ep19_iwin09.png", 2;
		next;
		menu "�����b��",-;
		mes "[�A�[�E�B���̗�]";
		mes "�����ł������B";
		mes "���炢�����܂����B";
		next;
		mes "[�A�[�E�B���̗�]";
		mes "���̎��ӂ͓��ɖ�肠��܂���B";
		mes "�l�������������������͂��܂����c�c�B";
		next;
		mes "[�A�[�E�B���̗�]";
		mes "������ӂ��͏����k����";
		mes "�����������������Ǝv���܂��B";
		mes "�m���ɋߍ������X�^�[������";
		mes "��若�\�ɂȂ����C�����܂�����c�c�B";
		next;
		mes "�]�����Ɩk���𒲍����������ǂ��������]";
		setquest 11817;
		delquest 11816;
		set EP19_2QUE,24;
		cutin "ep18_dew_09.png", 255;
		viewpoint 1, 226, 387, 1, 0xFFFF00;
		next;
		//showevent 0, 3, "�^�}����#ep19_refrigera";	// 2914: 27, 122
		//showevent 0, 3, "����#ep19_1";	// 2915: 300, 272
		//showevent 0, 3, "����#ep19_2";	// 2916: 346, 203
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 346, 198;	// from: jor_back1.gat(300, 279)
		end;
	}
	if(EP19_2QUE == 24) {
		mes "�]�₽������t�������㩂�����B";
		mes "�@�Â����ƈȊO�͓��ɖ��͖����������]";
		next;
		mes "�]�����Ɩk���𒲍����������ǂ����낤�]";
		viewpoint 1, 226, 387, 1, 0xFFFF00;
		next;
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 346, 198;	// from: jor_back1.gat(300, 279)
		end;
	}
	end;
}
jor_back2.gat,346,203,3	script	����#ep19_2	10024,{/* 2930 */
	if(EP19_2QUE == 24) {
		mes "�]�₽������t�������㩂�����B";
		mes "�@�Â����ƈȊO�͓��ɖ��͖����������]";
		next;
		mes "�]��������Ƃ����ꏊ�̎��͂�";
		mes "�@�������������悳�������]";
		setquest 11818;
		delquest 11817;
		set EP19_2QUE,25;
		viewpoint 1, 260, 294, 1, 0xFFFF00;
		next;
		//showevent 0, 3, "�^�}����#ep19_refrigera";	// 2914: 27, 122
		//showevent 0, 3, "����#ep19_2";	// 2916: 346, 203
		//showevent 0, 3, "����#ep19_3";	// 2919: 260, 294
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 264, 290;	// from: jor_back2.gat(340, 205)
		end;
	}
	if(EP19_2QUE == 25) {
		mes "�]�₽������t�������㩂�����B";
		mes "�@�Â����ƈȊO�͓��ɖ��͖����������]";
		next;
		mes "�]��������Ƃ����ꏊ�̎��͂�";
		mes "�@�������������悳�������]";
		viewpoint 1, 260, 294, 1, 0xFFFF00;
		next;
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 264, 290;	// from: jor_back2.gat(340, 205)
		end;
	}
	end;
}
jor_back2.gat,260,296,5	script	�A���v�I�J�[�g#ep19_jor	10384,{/* 2931 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,258,295,3	script	�}�[�N�C�V��#ep19_jor2	10383,{/* 2932 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,260,294,3	script	����#ep19_3	10024,{/* 2933 */
	if(EP19_2QUE == 25) {
		mes "�]�₽������t�������㩂�����B";
		mes "�@��ɕ��s�������Ղ�����]";
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c�ł��H";
		mes "�^�}�����ɕt���Ă����̂ƁA";
		mes "�����悤�Ȑ����݂������ȁc�c�B";
		cutin "ep18_alf_01.png", 2;
		cloakoffnpc "�A���v�I�J�[�g#ep19_jor";
		cloakoffnpc "�}�[�N�C�V��#ep19_jor2";
		next;
		mes "[�}�[�N�C�V��]";
		mes "��͂艽����������ł����ˁH";
		mes "���̌��ɗ����������X�^�[��";
		mes "㩂Ɋ|�������Ƃ��c�c�B";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "����ɂ��ẮA�����̘A�������c�c";
		mes "�����ɏW���I�ɓł��t���Ă���̂������B";
		mes "�N����^e5555e�킴�Ɖ󂻂��Ƃ���^000000�悤�Ɍ�����B";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�c�c��U�A��������^e5555e�k���ɂ���V������^000000��";
		mes "�񍐂��悤�B";
		mes "�N�̏��ׂ�";
		mes "㩂���ꂽ�̂��͒m��Ȃ����A";
		mes "�ǂ���猊�Ɗ֘A����";
		mes "���肻��������ȁB";
		setquest 11819;
		delquest 11818;
		set EP19_2QUE,26;
		cutin "ep18_alf_01.png", 255;
		cloakonnpc "�A���v�I�J�[�g#ep19_jor";
		cloakonnpc "�}�[�N�C�V��#ep19_jor2";
		viewpoint 1, 251, 310, 1, 0xFFFF00;
		next;
		//showevent 0, 3, "����#ep19_3";	// 2919: 260, 294
		//showevent 0, 3, "�V������#ep19_1";	// 2923: 255, 312
		//showevent 0, 3, "�^�}����#ep19_refrigera";	// 2914: 27, 122
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: jor_back2.gat(256, 302)
		end;
	}
	if(EP19_2QUE == 26) {
		mes "�]�₽������t�������㩂�����B";
		mes "�@��ɕ��s�������Ղ�����]";
		next;
		mes "�]^e5555e�k���ɂ���V������^000000�ɕ񍐂��悤�]";
		viewpoint 1, 251, 310, 1, 0xFFFF00;
		next;
		mes "�]���ĕt�����؂̕����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2.gat", 259, 309;	// from: jor_back2.gat(256, 302)
		end;
	}
	end;
}
jor_back2.gat,267,279,0	script	jor_back2_sw_1	139,{/* 2934 */}
jor_back2.gat,242,303,0	script	jor_back2_sw_2	139,{/* 2935 */}
jor_back2.gat,273,307,0	script	jor_back2_sw_3	139,{/* 2936 */}
jor_back2.gat,255,312,5	script	�V������#ep19_1	10462,{/* 2937 */
	if(EP19_2QUE == 26) {
		mes "[�V������]";
		mes "��������Ⴂ�܂������B";
		mes "���̓ł͎v���������A";
		mes "�����ƍ������̂ł����B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�V������]";
		mes "���͊j�𑕒������������Ȃ�";
		mes "������x�ς�����Ǝv���܂������A";
		mes "���ɓ������r�[�ɐ������ɑ������ꂽ";
		mes "^e5555e���͊j^000000������Ă��܂��܂����B";
		next;
		mes "[�}�[�N�C�V��]";
		mes "���`��c�c�B";
		mes "����ȏ�̒����͓�����ł��ˁB";
		mes "��x�߂���^e5555e�t���[�f���P^000000��";
		mes "�A��ė��܂��傤�B";
		cutin "ep18_mark_01.png", 0;
		cloakoffnpc "�}�[�N�C�V��#ep19_ab";
		next;
		mes "[�}�[�N�C�V��]";
		mes "�������^�}�����̓ł��򉻂ł�������A";
		mes "���̌����򉻂ł���ł��傤�B";
		cutin "ep18_mark_01.png", 0;
		setquest 11820;
		delquest 11819;
		set EP19_2QUE,27;
		next;
		//showevent 0, 3, "�V������#ep19_1";	// 2923: 255, 312
		//showevent 0, 3, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		cutin "ep18_mark_01.png", 255;
		cloakonnpc "�}�[�N�C�V��#ep19_ab";
		mes "�]�t���[�f���P�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�t���[�f���P�̂��Ƃ֌��������]";
		close2;
		warp "icas_in.gat", 33, 113;	// from: jor_back2.gat(258, 312)
		end;
	}
	if(EP19_2QUE == 27) {
		mes "[�V������]";
		mes "���͕X�̏�֍s��^e5555e�t���[�f���P^000000�l��";
		mes "�A��Ă���̂��őP�̂悤�ł��B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		cutin "ep19_iwin_diver01.png", 255;
		mes "�]�t���[�f���P�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�t���[�f���P�̂��Ƃ֌��������]";
		close2;
		warp "icas_in.gat", 33, 113;	// from: jor_back2.gat(258, 312)
		end;
	}
	if(EP19_2QUE == 28) {
		mes "[�V������]";
		mes "�t���[�f���P�l��";
		mes "�A��Ă��Ă��������܂������H";
		mes "����^e5555e��^000000���򉻂��܂��傤�I";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		cutin "ep19_iwin_diver01.png", 255;
		mes "[�t���[�f���P]";
		mes "�����c�c�B";
		cutin "ep19_friederike02.png", 2;
		cloakoffnpc "�A���v�I�J�[�g#ep19_ab";
		cloakoffnpc "�}�[�N�C�V��#ep19_ab";
		cloakoffnpc "�t���[�f���P#ep19_ab";
		next;
		mes "[�t���[�f���P]";
		mes "�����C����������c�c�B";
		mes "���̎��͂�S���򉻂����Ƃ��Ă��A";
		mes "�܂��ŋC���オ���Ă���Ǝv���B";
		mes "���̐[���Ƃ���ŁA";
		mes "�ł�f�������Ă�";
		mes "����������̂��������B";
		next;
		mes "[�V������]";
		mes "���̎��͂�S���򉻂���͖̂����ł��B";
		mes "��悸�͓ł����܂��Ă�";
		mes "���̌��̕��������ł��򉻂��āA";
		mes "�������邱�Ƃɂ��܂��傤�B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���͂��łɏ򉻂��c�c�������I";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�����I";
		mes "�g�̂��₦�Ă��܂������ȁH";
		mes "��͎��������������邩��A";
		mes "�t���[�f���P�͂����X�̏�֖߂낤�B";
		mes "���ׂł�����������A";
		mes "�����S���ɓ�����邩���c�c�B";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[�t���[�f���P]";
		mes "���Ⴀ�A���̓e���|�[�g�Ŗ߂��B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���A�������B";
		mes "����͂������򉻂������͊j����A";
		mes "�݂�Ȃ̕��Ɉ���t���Ă����܂��B";
		mes "���䂵�Ȃ��Ŗ߂��ė��ĂˁB";
		cutin "ep19_friederike03.png", 2;
		next;
		cloakonnpc "�t���[�f���P#ep19_ab";
		mes "[�V������]";
		mes "�t���[�f���P�l�̂悤�ȕ���";
		mes "���̕X�̏�ɗ��Ă������������Ƃ́A";
		mes "�ǂ�قǍK�^�Ȃ��Ƃ��c�c�B";
		mes "���̂悤�ɖ��͊j��";
		mes "�p�ӂ��Ă��������āc�c�B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�V������]";
		mes "���������܂ŃQ���̂悤�����������A";
		mes "����Ȃ��Y��Ȑ��ɕς��Ƃ́c�c�B";
		next;
		mes "[�V������]";
		mes "�c�c�������I";
		mes "�������Ă���ɂ͂���܂���B";
		mes "�ŋC���܂��オ���Ă���O��";
		mes "�������ɓ����Ă݂܂��B";
		next;
		mes "[�V������]";
		mes "���̕������͈��S�̂��߂ɁA";
		mes "^e5555e���͂̃����X�^�[�̑ގ�^000000��";
		mes "���肢���܂��B";
		mes "�����āA^e5555e����t��������1��^000000";
		mes "�̏W���Ă��������܂����H";
		next;
		mes "[�V������]";
		mes "���̌��ɉe�����󂯂�";
		mes "�����X�^�[������̂��A";
		mes "�������Ă݂�K�v������܂��B";
		setquest 11822;
		delquest 11821;
		set EP19_2QUE,29;
		close2;
		//showevent 0, 2, "�V������#ep19_1";	// 2923: 255, 312
		cutin "ep19_iwin_diver01.png", 255;
		cloakonnpc "�A���v�I�J�[�g#ep19_ab";
		cloakonnpc "�}�[�N�C�V��#ep19_ab";
		end;
	}
	if(EP19_2QUE == 29) {
		if(checkquest(11822)&4 && countitem(1000708) > 0) {
			mes "[�V������]";
			mes "�����X�^�[�̑ގ��Ɠ��̍̏W";
			mes "���肪�Ƃ��������܂��B";
			cutin "ep19_iwin_diver01.png", 2;
			next;
			mes "[�V������]";
			mes "�͂��c�c";
			mes "�������͂���������";
			mes "���������̂�������܂���c�c�B";
			next;
			mes "[�V������]";
			mes "���ɐ������Ă݂���A";
			mes "�l����l�ʂ��̂�����Ƃ��炢��";
			mes "�����ʘH�������Ă��āA";
			mes "�Ō�͊�ōǂ����Ă܂����B";
			mes "���ނ�������A";
			mes "���������L����Ԃ��o�܂����ˁB";
			next;
			mes "[�V������]";
			mes "^e5555e���K��^000000�݂����Ȃ��̂������悤�ł����A";
			mes "�Ƃ�Œ�������ɂ͊댯�߂���Ǝv���A";
			mes "�����グ�Ă��܂����B";
			next;
			mes "[�V������]";
			mes "�F�ł�����x�~���";
			mes "���������������ǂ������ł��B";
			mes "���̌����{���Ɋ댯���ǂ����m�F���āA";
			mes "�������H�[�N�����f�l��";
			mes "���m�点���Ȃ��ƁB";
			close2;
			cutin "ep19_iwin_diver01.png", 255;
			delitem 1000708,1;
			setquest 11823;
			delquest 11822;
			set EP19_2QUE,30;
			viewpoint 1, 258, 314, 1, 0xFFFF00;
			//showevent 9999, 0, "�V������#ep19_1";	// 2923: 255, 312
			//showevent 0, 3, "#to_jor_ab01";	// 2927: 258, 315
			end;
		}
		mes "[�V������]";
		mes "���̕������͈��S�̂��߂ɁA";
		mes "^e5555e���͂̃����X�^�[�̑ގ�^000000��";
		mes "���肢���܂��B";
		mes "�����āA^e5555e����t��������1��^000000";
		mes "�̏W���Ă��������܂����H";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�V������]";
		mes "���̌��ɉe�����󂯂�";
		mes "�����X�^�[������̂��A";
		mes "�������Ă݂�K�v������܂��B";
		close2;
		cutin "ep19_iwin_diver01.png", 255;
		end;
	}
	if(EP19_2QUE == 30) {
		mes "[�V������]";
		mes "�F�ł�����x�~���";
		mes "���������������ǂ������ł��B";
		mes "���̌����{���Ɋ댯���ǂ����m�F���āA";
		mes "�������H�[�N�����f�l��";
		mes "���m�点���Ȃ��ƁB";
		close;
	}
	cutin "ep19_iwin_diver01.png", 2;
	mes "[�V������]";
	mes "���݂܂���B���͖Z�����̂ł��B";
	close2;
	cutin "ep19_iwin_diver01.png", 255;
	end;
}
jor_back2.gat,263,311,5	script	�A���v�I�J�[�g#ep19_ab	10384,{/* 2938 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,261,312,3	script	�}�[�N�C�V��#ep19_ab	10383,{/* 2939 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,260,312,5	script	�t���[�f���P#ep19_ab	10458,{/* 2940 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_back2.gat,258,315,0	script	#to_jor_ab01	45,1,1,{/* 2941 */
	if(EP19_2QUE < 30) {
		unittalk getcharid(3),strcharinfo(0)+" : �]�����Ă˂��Ƃ�Ƃ����t�̂ōǂ����Ă���A���邱�Ƃ��ł��Ȃ��]",1;
		end;
	}
	if(EP19_2QUE < 36) {
		if(EP19_2QUE == 30) {
			setquest 11824;
			delquest 11823;
			//showevent 0, 3, "�A���v�I�J�[�g#ep19_1_a";	// 2932: 115, 14
			set EP19_2QUE,31;
		}
		warp "jor_ab01.gat",113,10;	// 2927 from: jor_back2.gat(259, 315)
		end;
	}
	mes "�]�ǂ���֌����������H�]";
	next;
	switch(select("�̂Ă�ꂽ�� 01","�̂Ă�ꂽ�� 01(�N�G�X�g)") == 2) {
	case 1:
		mes "�]�̂Ă�ꂽ�� 01�֌��������]";
		close2;
		warp "jor_ab01_.gat", 113, 10;
		end;
	case 2:
		mes "�]�̂Ă�ꂽ�� 01(�N�G�X�g)�֌��������]";
		close2;
		warp "jor_ab01.gat", 113, 10;
		end;
	}
}
jor_back2_.gat,258,315,0	script	#to_jor_ab01_	45,1,1,{/* 6049 */
	unittalk getcharid(3),strcharinfo(0)+" : �]���͓��邱�Ƃ��ł��Ȃ��]",1;
	end;
}

jor_ab01.gat,113,7,0	script	#to_jor_back2	45,1,1,{/* 2942 */
	mes "�]�ǂ���֌����������H�]";
	next;
	switch(select("���ĕt�����؂̕���","���ĕt�����؂̕���(�N�G�X�g)")) {
	case 1:
		mes "�]���ĕt�����؂̕����֌��������]";
		close2;
		warp "jor_back2_.gat",261,313;
		end;
	case 2:
		mes "�]���ĕt�����؂̕���(�N�G�X�g)�֌��������]";
		close2;
		warp "jor_back2.gat",261,313;
		end;
	}
}
jor_ab01_.gat,113,7,0	duplicate(#to_jor_back2)	#to_jor_back2_	45,1,1

jor_ab01.gat,113,14,0	script	jor_ab01_sw_1	139,5,5,{/* 2943 */
	if(EP19_2QUE == 31 || EP19_2QUE == 32) {
		cloakonnpc "�V������#ep19_ab";
		cloakoffnpc "�A���v�I�J�[�g#ep19_1_a";
	}
	if(EP19_2QUE == 33) {
		cloakonnpc "�V������#ep19_ab";
		cloakonnpc "�A���v�I�J�[�g#ep19_1_a";
	}
	end;
}
jor_ab01.gat,113,34,0	script	jor_ab01_sw_2	139,{/* 2944 */}
jor_ab01.gat,116,11,3	script	�V������#ep19_ab	10462,{/* 2945 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_ab01.gat,115,14,3	script	�A���v�I�J�[�g#ep19_1_a	10384,{/* 2946 (cloaking)*/
	if(EP19_2QUE == 31 || EP19_2QUE == 32) {
		mes "[�A���v�I�J�[�g]";
		mes "����͑S���Ȃ񂾂�H";
		mes "�ւ��ȁH";
		mes "�~�~�Y�H�H";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[�V������]";
		mes "���K���Ƃ����푰�ł��B";
		mes "���������K���h�Ɏd������҂Ȃ�ł��B";
		cloakoffnpc "�V������#ep19_ab";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�V������]";
		mes "�ւ̑��͂����Ɠ����ɂ��锤�Ȃ̂ɁA";
		mes "����ȏꏊ��";
		mes "���K���������W�܂��Ă���̂�";
		mes "���t����Ƃ́B";
		mes "�����������܂Œ������Ă݂܂��傤�B";
		next;
		mes "[�V������]";
		mes "���K�����ł��邾���h�����Ȃ�����";
		mes "�����ł��ˁB";
		mes "�ړ����Ȃ���Â���";
		mes "�ώ@���Ă݂邭�炢�ɂ��܂��傤�B";
		cutin "ep19_iwin_diver02.png", 2;
		if(EP19_2QUE == 31) {
			setquest 11825;
			delquest 11824;
			set EP19_2QUE,32;
		}
		next;
		//showevent 0, 3, "�A���v�I�J�[�g#ep19_1_a";	// 2932: 115, 14
		//showevent 0, 3, "����������#ep19_1_ab1";	// 2933: 223, 107
		cloakonnpc "�V������#ep19_ab";
		cutin "ep19_iwin_diver01.png", 255;
		viewpoint 1, 222, 107, 1, 0xFFFF00;
		mes "�]�����̒����֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
	}
	if(EP19_2QUE == 33) {
		// ������
	}
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_ab01.gat,223,107,3	script	����������#ep19_1_ab1	10045,{/* 2947 */
	if(EP19_2QUE == 32) {
		mes "[�}�[�N�C�V��]";
		mes "��������ŋC��";
		mes "�R��o���Ă��ł��傤���H";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�A���v�I�J�[�g]";
		mes "�ӂށc�c";
		mes "���s�ł̈��̂悤���ȁc�c";
		mes "���R�I�ɔ��������̂��A";
		mes "�l�דI�ɍ��ꂽ�̂��܂ł�";
		mes "�悭����Ȃ����c�c�B";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[�V������]";
		mes "�m���Ƀ����X�^�[�����̎p��";
		mes "�������������ł��B";
		mes "���������ړ����Ă݂܂��傤�B";
		cutin "ep19_iwin_diver01.png", 2;
		setquest 11826;
		delquest 11825;
		set EP19_2QUE,33;
		next;
		//showevent 9999, 0, "�A���v�I�J�[�g#ep19_1_a";	// 2932: 115, 14
		//showevent 0, 3, "����������#ep19_1_ab1";	// 2933: 223, 107
		//showevent 0, 3, "����������#ep19_1_ab2";	// 2934: 104, 270
		cutin "ep19_iwin_diver01.png", 255;
		viewpoint 1, 104, 270, 1, 0xFFFF00;
		mes "�]���̏ꏊ�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̏ꏊ�֌��������]";
		close2;
		warp "jor_ab01.gat", 104, 265;	// from: jor_ab01.gat(214, 105)
		end;
	}
	if(EP19_2QUE == 33) {
		mes "[�V������]";
		mes "�m���Ƀ����X�^�[�����̎p��";
		mes "�������������ł��B";
		mes "���������ړ����Ă݂܂��傤�B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		cutin "ep19_iwin_diver01.png", 255;
		viewpoint 1, 104, 270, 1, 0xFFFF00;
		mes "�]���̏ꏊ�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̏ꏊ�֌��������]";
		close2;
		warp "jor_ab01.gat", 104, 265;	// from: jor_ab01.gat(214, 105)
		end;
	}
	end;
}

jor_ab01.gat,104,270,3	script	����������#ep19_1_ab2	10045,{/* 2948 */
	if(EP19_2QUE == 33) {
		mes "[�A���v�I�J�[�g]";
		mes "�������������c�c";
		mes "�ŋC���R��o���Ă���B";
		cutin "ep18_alf_01.png", 2;
		next;
		mes "[�V������]";
		mes "�������A�����A�v�������L���ł��ˁB";
		mes "���̋K�͂ɂȂ�ƁA";
		mes "�ȒP�ɏ����ł�����ł͂Ȃ������ł��B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�n�@�n�@�c�c��ςł��B";
		mes "�F����B";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[�V������]";
		mes "��������܂����H";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���̌���������";
		mes "�Ⴄ�ꏊ�Ɍq�����Ă���悤��";
		mes "�ʘH������܂��B";
		cutin "ep18_mark_04.png", 0;
		next;
		mes "[�V������]";
		mes "�������I���ł͂Ȃ��ƁH�I";
		mes "�����s���܂��傤�B";
		mes "�ٗl�Ȏp�̃����X�^�[�ɕt���Ă�";
		mes "�m�点�����������ł��傤�B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���̕��������ł��ˁB";
		mes "�������ɕt���ė��Ă��������B";
		cutin "ep18_mark_04.png", 0;
		setquest 11827;
		delquest 11826;
		set EP19_2QUE,34;
		close2;
		//showevent 9999, 0, "�A���v�I�J�[�g#ep19_1_a";	// 2932: 115, 14
		//showevent 9999, 0, "����������#ep19_1_ab1";	// 2933: 223, 107
		//showevent 0, 3, "����������#ep19_1_ab2";	// 2934: 104, 270
		//showevent 0, 3, "#to_jor_ab02";	// 2936: 8, 238
		cutin "ep18_mark_01.png", 255;
		viewpoint 1, 16, 235, 1, 0xFFFF00;
		mes "�]�}�[�N�C�V��������֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�}�[�N�C�V��������֌��������]";
		close2;
		warp "jor_ab01.gat", 13, 238;	// from: jor_ab01.gat(102, 267)
		end;
	}
	if(EP19_2QUE == 34) {
		viewpoint 1, 16, 235, 1, 0xFFFF00;
		mes "�]�}�[�N�C�V��������֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�}�[�N�C�V��������֌��������]";
		close2;
		warp "jor_ab01.gat", 13, 238;	// from: jor_ab01.gat(102, 267)
		end;
	}
	end;
}

jor_ab01.gat,24,238,0	script	jor_ab01_sw_3	139,{/* 2949 */}
jor_ab01.gat,8,238,0	script	#to_jor_ab02	45,{/* 2950 */
	if(EP19_2QUE < 34) {
		//������
		end;
	}
	if(EP19_2QUE == 34) {
		mes "[�}�[�N�C�V��]";
		mes "�������ł��B";
		mes "�����܂����H";
		mes "���̒ʘH�c�c�B";
		cutin "ep18_mark_01.png", 0;
		next;
		mes "[�V������]";
		mes "�͂��c�c�B";
		mes "�����ɗ��܂��Ă����قǂł�";
		mes "����܂��񂪁A";
		mes "�������ŋC���ς����Ă�悤�ł��B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�V������]";
		mes "�t���[�f���P�l�ɕt���Ē�����";
		mes "���͊j�����E�̂悤�ł����A";
		mes "����ȏ�͊댯�ł�����A";
		mes "��x�����͐؂�グ�āA";
		mes "�t���[�f���P�l�̏��֖߂�܂��傤�B";
		close2;
		cutin "ep19_iwin_diver01.png", 255;
		setquest 11828;
		delquest 11827;
		set EP19_2QUE,35;
		mes "�]�t���[�f���P�̂��Ƃ֌������܂����H�]";
		next;
		//showevent 9999, 0, "�A���v�I�J�[�g#ep19_1_a";	// 2932: 115, 14
		//showevent 9999, 0, "����������#ep19_1_ab1";	// 2933: 223, 107
		//showevent 9999, 0, "����������#ep19_1_ab2";	// 2934: 104, 270
		//showevent 0, 3, "#to_jor_ab02";	// 2936: 8, 238
		//showevent 0, 3, "�t���[�f���P#ep19_seizy";	// 2911: 32, 123
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�t���[�f���P�̂��Ƃ֌��������]";
		close2;
		warp "icas_in.gat",33,112;	// 2936 from: jor_ab01.gat(9, 239)
		end;
	}
	if(EP19_2QUE == 35) {
		mes "[�V������]";
		mes "�͂��c�c�B";
		mes "�����ɗ��܂��Ă����قǂł�";
		mes "����܂��񂪁A";
		mes "�������ŋC���ς����Ă�悤�ł��B";
		cutin "ep19_iwin_diver01.png", 2;
		next;
		mes "[�V������]";
		mes "�t���[�f���P�l�ɕt���Ē�����";
		mes "���͊j�����E�̂悤�ł����A";
		mes "����ȏ�͊댯�ł�����A";
		mes "��x�����͐؂�グ�āA";
		mes "�t���[�f���P�l�̏��֖߂�܂��傤�B";
		next;
		cutin "ep19_iwin_diver01.png", 255;
		mes "�]�t���[�f���P�̂��Ƃ֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�t���[�f���P�̂��Ƃ֌��������]";
		close2;
		warp "icas_in.gat",33,112;	// 2936 from: jor_ab01.gat(9, 239)
		end;
	}
	mes "^e6328c�]�u�̂Ă�ꂽ�� 02�v�ɓ��ꂷ��ɂ́A";
	mes "^e6328c�@�ȉ��̏����𖞂����K�v������܂��]";
	mes "^e6328c�@�EBaseLv230�ȏ�";
	mes "^e6328c�@�E�N�G�X�g�u���b�̒n�v�̃N���A";
	mes "^e6328c�@�E�N�G�X�g�u�򉻂̐����v�̃N���A";
	mes "^e6328c�@^000000";
	mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	close;
}

jor_ab01_.gat,115,14,3	script	�A���v�I�J�[�g#ep19_1_a	10384,{/* 5825 */
	if(checkquest(11836)) {
		mes "[�A���v�I�J�[�g]";
		mes "�������c�c";
		mes "���͎c��𒲍�����B";
		mes "�������I�������A";
		mes "^e5555e�V������^000000�ɒ��ڕ񍐂𗊂ށB";
		cutin "ep18_alf_01.png", 2;
		close2;
		cutin "ep18_alf_01.png", 255;
		end;
	}
	mes "[�A���v�I�J�[�g]";
	mes "�������c�c";
	mes "������^e5555e�����̍���^000000���Ȃ���";
	mes "�����Ɍ��������B";
	cutin "ep18_alf_01.png", 2;
	next;
	mes "[�A���v�I�J�[�g]";
	mes "�N��^e5555e�̂Ă�ꂽ��^000000�̒��ŁA";
	mes "^e5555e�����̍���^000000���������A";
	mes "3�����قǒ��ׂĂ��Ă���邩�H";
	mes "���͎c��𒲍�����B";
	mes "�������I�������A";
	mes "^e5555e�V������^000000�ɒ��ڕ񍐂𗊂ށB";
	setquest 11836;
	close2;
	//showevent 9999, 0, "�A���v�I�J�[�g#ep19_1_a";	// 5825: 115, 14
	//@showevent 0, 3;	// 5828: 163, 253
	//@showevent 0, 3;	// 5829: 117, 141
	//@showevent 0, 3;	// 5830: 222, 125
	//@showevent 0, 3;	// 5831: 196, 260
	//@showevent 0, 3;	// 5832: 112, 62
	//@showevent 0, 3;	// 5833: 25, 265
	cutin "ep18_alf_01.png", 255;
	end;
}
jor_ab01_.gat,163,253,3	script	�����̍���#ep19_1	10045,{/* 5828 */
jor_ab01_.gat,117,141,3	script	�����̍���#ep19_2	10045,{/* 5829 */
	unittalk getcharid(3),""+strcharinfo(0)+" : �]�����̍��Ղ�����B���ׂĂ݂悤�]",1;
	progressbar 1;	//color=0xb04a23
	setquest 11838;
	delquest 11838;
	unittalk getcharid(3),""+strcharinfo(0)+" : �]����1�������ׂ悤�]",1;
}
jor_ab01_.gat,222,125,3	script	�����̍���#ep19_3	10045,{/* 5830 */}
jor_ab01_.gat,196,260,3	script	�����̍���#ep19_4	10045,{/* 5831 */}
jor_ab01_.gat,112,62,3	script	�����̍���#ep19_5	10045,{/* 5832 */
	if(checkquest(11841)) {
		unittalk getcharid(3),strcharinfo(0)+" : �]����2�������ׂ悤�]",1;
		end;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �]�����̍��Ղ�����B���ׂĂ݂悤�]",1;
	progressbar 1;	//color=0xb04a23
	setquest 11841;
	compquest 11841;
	unittalk getcharid(3),strcharinfo(0)+" : �]����2�������ׂ悤�]",1;
	end;
}
jor_ab01_.gat,25,265,3	script	�����̍���#ep19_6	10045,{/* 5833 */}

jor_back2_.gat,367,36,3	script	����t�����#ep19_0	10024,{/* 6050 */
	for(set '@i,0; '@i < 3; set '@i,'@i+1) {
		if(checkquest(11855+'@i))
			'@j++;
	}
	if(checkquest(11858)) {
		mes "�]���ׂĂ�㩂̐��������������B";
		mes "�@�^�}�����̌��ւ��ǂ낤�]";
		close;
	}
	set '@num,substr(strnpcinfo(0),-1);
	set '@quest,11855+'@num;
	if(checkquest('@quest)) {
		mes "�]���������������B";
		mes "�@����㩂𒲂ׂĂ݂悤�]";
		close;
	}
	mes "�]�₽������t�������㩂�����B";
	mes "�@�^�}�����������Ă���㩂͂��ꂾ�낤�B";
	mes "�@�������悤�]";
	next;
	misceffect 101;
	progressbar 1;	//color=0xffff00
	misceffect 18;
	next;
	setquest '@quest;
	compquest '@quest;
	if('@j == 2) {
		setquest 11858;
		setquest 11855;
		delquest 11855;
		setquest 11856;
		delquest 11856;
		setquest 11857;
		delquest 11857;
		mes "�]���ׂĂ�㩂̐��������������B";
		mes "�@�^�}�����̌��ւ��ǂ낤�]";
		close;
	}
	mes "�]���������������B";
	mes "�@����㩂𒲂ׂĂ݂悤�]";
	close;
}

jor_back2_.gat,84,88,3		duplicate(����t�����#ep19_0)	����t�����#ep19_1	10024	/* 6051 */
jor_back2_.gat,158,320,3	duplicate(����t�����#ep19_0)	����t�����#ep19_3	10024	/* 6052 */

icas_in.gat,119,62,3	script	���F���O���f�̌�����	858,{/* 2951 */
	unittalk "���F���O���f�̌�����",1;
	end;
}

-	shop	icas_in#callshop1	-1,611:40,602:300,601:60,645:800,656:1500,657:3000,501:50,502:200,503:550,504:1200,506:40,610:4000,717:600,1771:50
-	shop	icas_in#callshop2	-1,1100006:1200
//-	barter	icas_in#callbarter1	-1,450206:-1:0 { 1000608:-1:100 },450207:-1:0 { 1000608:-1:100 },480159:-1:0 { 1000608:-1:100 },480160:-1:0 { 1000608:-1:100 },470115:-1:0 { 1000608:-1:100 },470116:-1:0 { 1000608:-1:100 },490177:-1:0 { 1000608:-1:100 },490176:-1:0 { 1000608:-1:100 },490179:-1:0 { 1000608:-1:100 },490178:-1:0 { 1000608:-1:100 },101187:-1:0 { 1000608:-1:100 }
//-	barter	icas_in#callbarter2	-1,610037:-1:0 { 1000608:-1:100 },700052:-1:0 { 1000608:-1:100 },500049:-1:0 { 1000608:-1:100 },510061:-1:0 { 1000608:-1:100 },520017:-1:0 { 1000608:-1:100 },530025:-1:0 { 1000608:-1:100 },540049:-1:0 { 1000608:-1:100 },550069:-1:0 { 1000608:-1:100 },560032:-1:0 { 1000608:-1:100 },570029:-1:0 { 1000608:-1:100 },580030:-1:0 { 1000608:-1:100 },590038:-1:0 { 1000608:-1:100 }

icas_in.gat,180,61,5	script	�}����#ep19trader	10376,{/* 2952 */
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�����K�v�ȕ��͂���܂����H";
	mes "�`���҂̕����������i�悭�g�p���镨��";
	mes "��A���Ă��܂����B";
	next;
	switch(select("����ƎG�݂�����","��ԃV���[�Y","�O���C�V�A����V���[�Y","�����i����������","������Ăǂ��������ƁH")) {
	case 1:
		mes "[�}����]";
		mes "���͏\���ɗp�ӂ��ė��܂�������A";
		mes "���񂲗����������B";
		close2;
		callshop "icas_in#callshop1",1;
		cutin "ep18_maram_01.png", 255;
		end;
	case 2:
		mes "[�}����]";
		mes "���F���O���f�l�����삵���h��ł��B";
		mes "��Ԃ̖��͂ō�������̂�����A";
		mes "��Ԃ̉Ԃт�ƌ������Ă��܂��B";
		close2;
		//callshop "icas_in#callbarter1",1;
		cutin "ep18_maram_01.png", 255;
		end;
	case 3:
		mes "[�}����]";
		mes "������{�ޗ�����A���āA";
		mes "���F���O���f�l��������������ł��B";
		mes "��Ԃ̉Ԃт�ƌ������Ă��܂��B";
		close2;
		//callshop "icas_in#callbarter2",1;
		cutin "ep18_maram_01.png", 255;
		end;
	case 4:
		mes "[�}����]";
		mes "�s�K�v�ȕ�������΁A";
		mes "��������ɔ��悵�܂���B";
		close2;
		callshop "icas_in#callshop1",2;
		cutin "ep18_maram_01.png", 255;
		end;
	case 5:
		mes "[�}����]";
		mes "�����Ŏ��ɂł��邱�Ƃ͉������邩��";
		mes "�l���Ă݂܂����B";
		mes "�ǂ��ɂ����͕������B�֘A�̎d���΂���";
		mes "����Ă��܂����̂ŁA";
		mes "������̕����ŁA";
		mes "�F������x�����錋�_�ɂ�����܂����B";
		next;
		mes "[�}����]";
		mes "�����͊����������s�����Ă��邩��A";
		mes "�W���W���[����Ƒ��k����";
		mes "����I�ɔ�s�D��";
		mes "�����̔z�B�����邱�Ƃɂ��܂����B";
		next;
		cutin "ep18_maram_02.png", 2;
		mes "[�}����]";
		mes "���łɃ��F���O���f�l����`���āA";
		mes "���X���J���Ă݂܂�����B";
		mes "�ǂ����Ă����������邽�߁A";
		mes "������x��";
		mes "�����Ⴄ�K�v�͂����ł����c�c�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�K�v�ȕ������s�����Ȃ��悤�ɁA";
		mes "��ɕ�����p�ӂ��Ă����܂�����A";
		mes "�S�z���Ȃ��Ŏd���ɏW�����Ă��������ˁI";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1070;	// NPC:�}����#ep19trader(2952)
	setnpctitle "[�A�C�e������]";	// NPC:�}����#ep19trader(2952)
	end;
}
icas_in.gat,175,63,3	script	�z����#ep19trader	10461,{/* 2953 */
	cutin "ep19_iwin02.png", 2;
	cutin "ep19_iwin02.png", 2;
	mes "[�z����]";
	mes "���F���O���f�l�Ƌ���";
	mes "���������K���h�l�̖��͂��������ł��B";
	mes "�A�[�E�B���E�Řb���";
	mes "�X�[�p�[�t�[�h�𒴂���";
	mes "�E���g���t�[�h<ITEM>�����A�C�X�t�i���V<INFO>1100006</INFO></ITEM>��";
	mes "�̔����Ў�Ԃɍs���Ă��܂��B";
	next;
	switch(select("�����A�C�X�t�i���V�𔃂�","�����A�C�X�t�i���V���āH","���Ȃ��̖��O�́H","��߂�")) {
	case 1:
		mes "[�z����]";
		mes "�h�{���_��";
		mes "�����A�C�X�t�i���V�ł��B";
		mes "���Ђ��ܖ����������B";
		close2;
		callshop "icas_in#callshop2",1;
		cutin "ep19_iwin02.png", 255;
		end;
	case 2:
		mes "[�z����]";
		mes "���������āA";
		mes "�E���g���t�[�h<ITEM>�����A�C�X�t�i���V<INFO>1100006</INFO></ITEM>��";
		mes "�������Ȃ��H";
		next;
		mes "[�z����]";
		mes "�A�C�X�t�i���V�́A";
		mes "���̔�����������A";
		mes "�A�[�E�B��������";
		mes "�\�E���t�[�h�ƌĂ΂�Ă���Ɠ����ɁA";
		mes "���ɉh�{���L�x��";
		mes "�X�[�p�[�t�[�h�ł�����܂��B";
		next;
		mes "[�z����]";
		mes "���̃A�C�X�t�i���V��";
		mes "���������邱�Ƃɂ��A";
		mes "�����^�т܂ł��₷���Ȃ����A";
		mes "<ITEM>�����A�C�X�t�i���V<INFO>1100006</INFO></ITEM>�́A";
		mes "�܂���^FF0000�E���g���t�[�h^000000�ƌĂԂ�";
		mes "�ӂ��킵���H�ו��ł��B";
		next;
		mes "[�z����]";
		mes "���ꂳ������΁A";
		mes "���̐H���͂���Ȃ��񂶂�Ȃ����Ƃ���";
		mes "�v���Ă���قǂł���B";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 3:
		mes "[�z����]";
		mes "���̖{���̖��O��";
		mes "�z�����E�z�����E�z�����B";
		mes "(���C�����E�V�O�j�`���[�E�x���K���b�g)";
		next;
		menu "�z�����H",-;
		mes "[�z����]";
		mes "�����ł��ˁB";
		mes "�i�D�������O��t���Ă��A";
		mes "�l�Ԃ̎��ɂ�";
		mes "�z�����ɕ�������悤�ł��B";
		mes "�C�ɂ����Ƀz�����ƌĂ�ł��������B";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 4:
		mes "[�z����]";
		mes "�����ł����B";
		mes "�p��������΁A";
		mes "�܂����������Ă��������B";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1071;	// NPC:�z����#ep19trader(2953)
	setnpctitle "[�����A�C�X�t�i���V]";	// NPC:�z����#ep19trader(2953)
	end;
}
icas_in.gat,185,63,3	script	���F���O���f#ep19vell02	10468,{/* 2955 */
	cutin "ep19_vellgunde01.png", 2;
	mes "[���F���O���f]";
	mes "���ɉ����p���H";
	mes "���i���������K���h�ƃ��K�������̖��͂�";
	mes "�������Ă���񂾂��ǁA";
	mes "���݂��������邱�Ƃ���������";
	mes "�����������B";
	messize 180,280;
	next;
	switch(select("^888888���F���O���f�̌����ޗ����B^000000","��ԃG���`�����g","�O���C�V�A����G���`�����g","�b����߂�")) {
	case 1:
		if(EP19_1QUE < 100 || EP19_2QUE < 36) {
			cutin "ep19_vellgunde01.png", 2;
			mes "[���F���O���f]";
			mes "�����ޗ����B�𗊂ނɂ́A";
			mes "���͏����o�^�o�^���Ă���ˁB";
			mes "�܂��������������ɗ��ނ�B";
			next;
			cutin "ep19_vellgunde01.png", 255;
			mes "^e6328c�]���̃N�G�X�g��i�s����ɂ�";
			mes "^e6328c�@�ȉ��̏����𖞂����K�v������܂��]";
			mes "^e6328c�@�EBaseLv220�ȏ�";
			mes "^e6328c�@�E�N�G�X�g�u���b�̒n�v�̃N���A";
			mes "^e6328c�@�E�N�G�X�g�u�򉻂̐����v�̃N���A";
			mes "^e6328c�@^000000";
			mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
			messize 180,364;
			close;
		}
		if(checkquest(130510)&8) {
			mes "[���F���O���f]";
			mes "�����ޗ����B����`���Ă����̂��H";
			next;
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�֐_�̉����� 01)") == 2) {
				mes "[���F���O���f]";
				cutin "ep19_vellgunde01.png", 2;
				mes "���������B";
				mes "���ꂶ�Ⴀ�A�C��t���ĂȁB";
				close2;
				cutin "kafra_01.bmp", 255;
				warp "jor_dun01_.gat", 113, 12;	// from: icas_in.gat(190, 61) port : 5127
				end;
			}
			mes "�N�G�X�g�̎󒍂�񍐁A";
			mes "���������\�ł��B";
			next;
			switch(select("�S�Ď󒍂���","�S�ĕ񍐂���","[�󒍉�] ���F���O���f�̌����ޗ����B","�S�Ĕj������")) {
			case 3:
				if(checkquest(18130)) {
					if(countitem(1000706) < 3) {
						mes "[���F���O���f]";
						cutin "ep19_vellgunde01.png", 2;
						mes "���ꂶ�Ⴀ�A<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>��";
						mes "3�����Ă��Ă����H";
						next;
						mes "[���F���O���f]";
						cutin "ep19_vellgunde01.png", 2;
						mes "<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>�́A";
						mes "�t���[�f���P�̏��ɍs���āA";
						mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��5���炢";
						mes "�򉻂��ĖႦ�Ύ�ɓ���͂�������B";
						next;
						mes "<<B>�N�G�X�g</B>>";
						mes "�u^ff0000���F���O���f�̌����ޗ����B^000000�v";
						mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
						mes "������̃N�G�X�g��j�����܂����H";
						next;
						if(select("��߂�","�j������") == 1) {
							mes "^ff0000[�C���t�H���[�V����]";
							mes "�����𒆒f���܂����B^000000";
							close2;
							cutin "kafra_01.bmp", 255;
							end;
						}
					}
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���F���O���f�̌����ޗ����B^000000�v";
					mes "<���e>";
					mes "�A�C�e���F<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>�@3��";
					mes "��[�i";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "BaseExp 6G ( 6000000000 )";
					mes "��300000000��20��󂯎��܂��B";
					mes "JobExp 4.5G ( 4500000000 )";
					mes "��225000000��20��󂯎��܂��B";
					next;
					mes "^0000ff<<B>��V</B>>^000000";
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���F���O���f�̌����ޗ����B^000000�v";
					mes "��񍐂��܂����H";
					next;
					if(select("�񍐂���","��߂�") == 2) {
						mes "^ff0000[�C���t�H���[�V����]";
						mes "�����𒆒f���܂����B^000000";
						close;
					}
					if(checkitemblank() == 0) {
						mes "[�C���t�H���[�V����]";
						mes "����ȏ㑽���̎�ނ�";
						mes "�ו��������Ƃ��o���܂���B";
						mes "1�ȏ�̋󂫂�����Ă��������B";
						close;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delitem 1000706,3;
					delquest 18130;
					setquest 18131;
					getitem 1000608,3;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 300000000,0,0;
					for(set '@i,0; '@i < 20; set '@i,'@i+1)
						getexp 0,225000000,0;
					mes "[���F���O���f]";
					cutin "ep19_vellgunde01.png", 2;
					mes "�ǂ��������H";
					mes "���A�򉻂��ꂽ���͊j��";
					mes "�����Ă��Ă��ꂽ���I";
					mes "���x���肪�Ƃ��B";
					mes "��͂�l�肪������̗ǂ����Ƃ��ȁB";
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
					mes "�A�C�e���F<ITEM>��Ԃ̉Ԃт�<INFO>1000608</INFO></ITEM>�@3��";
					mes "���l�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkquest(18131)) {
					if(!(checkquest(18131)&2)) {
						mes "[���F���O���f]";
						cutin "ep19_vellgunde02.png", 2;
						mes "���͑��v���B";
						mes "�N�������Ă������͊j���A";
						mes "�܂��\���c���Ă��邩��B";
						mes "��ŕK�v�ɂȂ�����A";
						mes "�܂��v�������B";
						next;
						mes "[�C���t�H���[�V����]";
						mes "<<B>�N�G�X�g</B>>";
						mes "�u^ff0000���F���O���f�̌����ޗ����B^000000�v";
						mes "�͎��Ԑ������ł��B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
				}
				mes "[���F���O���f]";
				cutin "ep19_vellgunde01.png", 2;
				mes "���ꂶ�Ⴀ�A<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>��";
				mes "3�����Ă��Ă����H";
				next;
				mes "[���F���O���f]";
				cutin "ep19_vellgunde01.png", 2;
				mes "<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>�́A";
				mes "�t���[�f���P�̏��ɍs���āA";
				mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��5���炢";
				mes "�򉻂��ĖႦ�Ύ�ɓ���͂�������B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���F���O���f�̌����ޗ����B^000000�v";
				mes "<���e>";
				mes "�A�C�e���F<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>�@3��";
				mes "�̔[�i���󒍂��܂����H";
				next;
				if(select("�󒍂���","��߂�") == 2) {
					mes "[���F���O���f]";
					cutin "ep19_vellgunde01.png", 2;
					mes "�킩�����B";
					mes "�C�ɂ��邱�Ƃ͂Ȃ��B";
					mes "���n�[���ɂ�点��΂�������B";
					next;
					mes "^ff0000[�C���t�H���[�V����]";
					mes "�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				setquest 18130;
				mes "[���F���O���f]";
				cutin "ep19_vellgunde01.png", 2;
				mes "���肪�Ƃ��B";
				mes "���҂��Ă����B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���F���O���f�̌����ޗ����B^000000�v";
				mes "���󒍂��܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
		}
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�����K�v�Ƃ��Ă���̂́A";
		mes "���K���̖��͊j���򉻂������B";
		mes "<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>���B";
		next;
		mes "[���F���O���f]";
		mes "���K��������ގ����Ă�ƁA";
		mes "<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>����ɓ��邾�낤�H";
		mes "��������������K���h�̎c�]���͂�";
		mes "�z�����������̂Ȃ񂾁B";
		next;
		mes "[���F���O���f]";
		mes "������A��肭�򉻂���΁A";
		mes "��Ԃ̉Ԃт�̂悤��";
		mes "�g�p���\�Ƃ������Ƃ��B";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "������񖂗͂̎��������邩��A";
		mes "�g���̂Ă݂����Ȃ��̂��ˁB";
		mes "���̓��K���ƃ��������K���h�̖��͐�����";
		mes "������������A���ꂪ�K�v�Ȃ񂾁B";
		next;
		mes "[���F���O���f]";
		mes "�܂��́A<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
		mes "�K���ɏW�߂Ă���B";
		mes "���̌�A^4d4dff�t���[�f���P^000000���������ȁA";
		mes "�������痈�����̏��ւ����Ă���B";
		mes "���̖���<ITEM>[���K���̒ዉ���͊j]<INFO>1000707</INFO></ITEM>��";
		mes "�򉻂ł���B";
		next;
		mes "[���F���O���f]";
		mes "�򉻂��I�������A";
		mes "���̏��֎����Ă��Ăق����B";
		mes "�Ƃ肠�����A<ITEM>[�򉻂��ꂽ���͊j]<INFO>1000706</INFO></ITEM>��";
		mes "^4d4dff3^000000����΁A�\���������B";
		close2;
		setquest 130510;
		compquest 130510;
		cutin "ep19_vellgunde02.png", 255;
		end;
	case 2:
		switch(select("�O���[�v1(�Z�E���E�C)","�O���[�v2(�A�N�Z�T���[1�E2)","��������")) {
		case 1:
			mes "[���F���O���f]";
			mes "�܂��͑������m�F�����āB";
			mes "�ǂ�ɃG���`�����g���{���́H";
			messize 180,280;
			next;
			mes "^ff0000�G���`�����g�Ώۂ̃A�C�e����";
			mes "�������Ă��܂���B";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 2:
			mes "[���F���O���f]";
			mes "�܂��͑������m�F�����āB";
			mes "�ǂ�ɃG���`�����g���{���́H";
			messize 180,280;
			next;
			mes "^ff0000�G���`�����g�Ώۂ̃A�C�e����";
			mes "�������Ă��܂���B";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 3:
			cutin "ep19_vellgunde01.png", 2;
			mes "[���F���O���f]";
			mes "�����B";
			mes "�܂�����Ƃ�����B";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		}
	case 3:
		switch(select("�O���[�v1(�����ȕX�؂̖���)","�O���[�v2(�X�؂̖���)","��������")) {
		case 1:
			mes "[���F���O���f]";
			mes "�܂��͑������m�F�����āB";
			mes "�ǂ�ɃG���`�����g���{���́H";
			messize 180,280;
			next;
			mes "^ff0000�G���`�����g�Ώۂ̃A�C�e����";
			mes "�������Ă��܂���B";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 2:
			mes "[���F���O���f]";
			mes "�܂��͑������m�F�����āB";
			mes "�ǂ�ɃG���`�����g���{���́H";
			messize 180,280;
			next;
			mes "^ff0000�G���`�����g�Ώۂ̃A�C�e����";
			mes "�������Ă��܂���B";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		case 3:
			cutin "ep19_vellgunde01.png", 2;
			mes "[���F���O���f]";
			mes "�����B";
			mes "�܂�����Ƃ�����B";
			messize 180,280;
			close2;
			cutin "ep19_vellgunde01.png", 255;
			end;
		}
	case 4:
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�����B";
		mes "�܂�����Ƃ�����B";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	}
}

jor_tail.gat,98,287,0	warp	#to_jor_back1_1	1,1,jor_back1.gat,98,13	// 2450 from: jor_tail.gat(98, 287)
jor_back1.gat,98,10,0	warp	#to_tail_1		1,1,jor_tail.gat,98,284	// 2451 from: jor_back1.gat(98, 11)
jor_tail.gat,134,281,0	warp	#to_jor_back1_2	1,1,jor_back1.gat,131,13	// 2452 from: jor_tail.gat(135, 282)
jor_back1.gat,131,10,0	warp	#to_tail_2		1,1,jor_tail.gat,139,280	// 2453 from: jor_back1.gat(131, 11)
jor_tail.gat,219,294,0	warp	#to_jor_back1_3	1,1,jor_back1.gat,222,22	// 2454 from: jor_tail.gat(220, 294)
jor_back1.gat,222,19,0	warp	#to_tail_3		1,1,jor_tail.gat,219,291	// 2455 from: jor_back1.gat(221, 20)
jor_back1.gat,385,229,0	warp	#to_icecastle	1,1,icecastle.gat,20,123	// 2456 from: jor_back1.gat(384, 229)
icecastle.gat,17,123,0	warp	#to_jor_back1	1,1,jor_back1.gat,380,229	// 2457 from: icecastle.gat(18, 123)
jor_back1.gat,226,387,0	script	#to_jor_back2	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "�]�ǂ���֌����������H�]";
		next;
		switch(select("���ĕt�����؂̕���","���ĕt�����؂̕���(�N�G�X�g)")) {
		case 1:
			mes "�]���ĕt�����؂̕����֌��������]";
			close2;
			warp "jor_back2_.gat",229,17;
			end;
		case 2:
			mes "�]���ĕt�����؂̕���(�N�G�X�g)�֌��������]";
			close2;
			warp "jor_back2.gat",229,17;
			end;
		}
	}
	warp "jor_back2.gat",229,17;
	end;
}
jor_back2.gat,229,12,0	warp	#to_jor_back1	1,1,jor_back1.gat,226,384	// 2459 from: jor_back2.gat(229, 13)
jor_back2.gat,13,248,0	script	#to_jor_back3	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "�]�ǂ���֌����������H�]";
		next;
		switch(select("���ĕt�����؂̕X��","���ĕt�����؂̕X��(�N�G�X�g)")) {
		case 1:
			mes "�]���ĕt�����؂̕X�͂֌��������]";
			close2;
			warp "jor_back3_.gat",364,245;
			end;
		case 2:
			mes "�]���ĕt�����؂̕X��(�N�G�X�g)�֌��������]";
			close2;
			warp "jor_back3.gat",364,245;
			end;
		}
	}
	warp "jor_back3.gat",364,245;
	end;
}
jor_back2_.gat,13,248,0	duplicate(#to_jor_back3)	#to_jor_back3_	45,1,1

jor_back3.gat,368,245,0	script	#to_jor_back2	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "�]�ǂ���֌����������H�]";
		next;
		switch(select("���ĕt�����؂̕���","���ĕt�����؂̕���(�N�G�X�g)")) {
		case 1:
			mes "�]���ĕt�����؂̕����֌��������]";
			close2;
			warp "jor_back2_.gat",17,248;
			end;
		case 2:
			mes "�]���ĕt�����؂̕���(�N�G�X�g)�֌��������]";
			close2;
			warp "jor_back2.gat",17,248;
			end;
		}
	}
	warp "jor_back2.gat",17,248;
	end;
}
jor_back3_.gat,368,245,0	duplicate(#to_jor_back3)	#to_jor_back2_	45,1,1

jor_back3.gat,63,326,0	script	#to_jor_dun01	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "�]�ǂ���֌����������H�]";
		next;
		switch(select("�֐_�̉����� 01","�֐_�̉����� 01(�N�G�X�g)")) {
		case 1:
			mes "�]�֐_�̉����� 01�֌��������]";
			close2;
			warp "jor_dun01_.gat",113,10;
			end;
		case 2:
			mes "�]�֐_�̉����� 01(�N�G�X�g)�֌��������]";
			close2;
			warp "jor_dun01.gat",113,10;
			end;
		}
	}
	if(EP19_1QUE < 18) {
		mes "�]���͑��ɂ�邱�Ƃ�����]";
		close;
	}
	warp "jor_dun01.gat",113,10;
	end;
}
jor_back3_.gat,63,326,0	duplicate(#to_jor_dun01)	#to_jor_dun01_	45,1,1

jor_dun01.gat,113,7,0	script	#to_jor_back3	45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "�]�ǂ���֌����������H�]";
		next;
		switch(select("���ĕt�����؂̕X��","���ĕt�����؂̕X��(�N�G�X�g)")) {
		case 1:
			mes "�]���ĕt�����؂̕X�͂֌��������]";
			close2;
			warp "jor_back3_.gat",65,321;
			end;
		case 2:
			mes "�]���ĕt�����؂̕X��(�N�G�X�g)�֌��������]";
			close2;
			warp "jor_back3.gat",65,321;
			end;
		}
	}
	warp "jor_back3.gat",65,321;
	end;
}
jor_dun01_.gat,113,7,0	duplicate(#to_jor_back3)	#to_jor_back3_	45,1,1

jor_dun01.gat,10,238,0	script	#to_jor_dun02	45,1,1,{/* 2464 */
	if(EP19_1QUE >= 68) {
		warp "jor_dun02.gat",282,87;
		end;
	}
	if(EP19_1QUE >= 63 && EP19_1QUE <= 67) {
		cloakoffnpc "�A�[�E�B���{����#epm00";
		mes "[�A�[�E�B���{����]";
		mes "�`���җl�I���i������܂����H";
		mes "���{�����ɓ˓�����ƁA���͂�s�����Ȃ��Ă͂Ȃ�܂���B���������͑����������Ă���܂��B";
		next;
		if(select("���A�i������B","�������鎞�Ԃ��K�v���B") == 2) {
			mes "[�A�[�E�B���{����]";
			mes "�͂��B�ł͏������������肵�Ă���i�����Ă��������I";
			close2;
			cloakonnpc "�A�[�E�B���{����#epm00";
			end;
		}
		mes "[�A�[�E�B���{����]";
		mes "���^�����F�肵�܂��I";
		close2;
		cloakonnpc "�A�[�E�B���{����#epm00";
		warp "jor_que.gat",282,87;
		end;
	}
	warp "jor_dun02.gat",282,87;
	end;
}
jor_dun01_.gat,10,238,0	duplicate(#to_jor_dun02)	#to_jor_dun02_	45,1,1

jor_dun01.gat,12,240,3	script	�A�[�E�B���{����#epm00	21529,{/* 2465 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
jor_dun02.gat,286,87,0	warp	#to_jor_dun01		1,1,jor_dun01.gat,12,238	// 2466 from: jor_dun02.gat(285, 87)
jor_dun02_.gat,286,87,0	warp	#to_jor_dun01_		1,1,jor_dun01_.gat,12,238
jor_dun02.gat,18,31,0	warp	#to_jor_nest		1,1,jor_nest.gat,278,18	// 2467 from: jor_dun02.gat(19, 32)
jor_dun02_.gat,18,31,0	warp	#to_jor_nest_		1,1,jor_nest.gat,278,18
jor_nest.gat,282,18,0	script	#to_jor_dun02		45,1,1,{
	if(EP19_1QUE >= 68) {
		mes "�]�ǂ���֌����������H�]";
		next;
		switch(select("�֐_�̉����� 02","�֐_�̉����� 02(�N�G�X�g)")) {
		case 1:
			mes "�]�֐_�̉����� 02�֌��������]";
			close2;
			warp "jor_dun02_.gat",21,32;
			end;
		case 2:
			mes "�]�֐_�̉����� 02(�N�G�X�g)�֌��������]";
			close2;
			warp "jor_dun02.gat",21,32;
			end;
		}
	}
	warp "jor_dun02.gat",21,32;
	end;
}
jor_que.gat,286,87,0	warp	#jor_que_jor_dun01_1	1,1,jor_dun01.gat,12,238	// 2469 from: jor_que.gat(285, 88)
icecastle.gat,213,175,0	warp	#to_icas_in			1,1,icas_in.gat,138,187	// 2470 from: icecastle.gat(213, 174)
icas_in.gat,138,183,0	warp	#out_icas			1,1,icecastle.gat,208,168	// 2471 from: icas_in.gat(138, 184)
icas_in.gat,85,257,0	warp	#in_icas_room_L		1,1,icas_in.gat,49,258	// 2472 from: icas_in.gat(86, 257)
icas_in.gat,53,258,0	warp	#out_icas_romm_L	1,1,icas_in.gat,89,257	// 2473 from: icas_in.gat(52, 258)
icas_in.gat,193,257,0	warp	#in_icas_room_R		1,1,icas_in.gat,226,258	// 2474 from: icas_in.gat(192, 257)
icas_in.gat,222,258,0	warp	#out_icas_romm_R	1,1,icas_in.gat,189,257	// 2475 from: icas_in.gat(223, 258)
icas_in.gat,83,233,0	warp	#in_dining		1,1,icas_in.gat,25,169	// 2476 from: icas_in.gat(83, 232)
icas_in.gat,25,166,0	warp	#out_dining		1,1,icas_in.gat,83,229	// 2477 from: icas_in.gat(25, 167)
icas_in.gat,193,233,0	warp	#in_bedroom		1,1,icas_in.gat,253,169	// 2478 from: icas_in.gat(193, 232)
icas_in.gat,253,166,0	warp	#ep19_in_hotel	1,1,icas_in.gat,193,229	// 2479 from: icas_in.gat(253, 167)
icecastle.gat,186,222,0	script	#in_barracks	45,1,1,{/* 2480 */
	if(EP19_1QUE < 12) {
		unittalk getcharid(3),strcharinfo(0)+" : �܂��́A�X�̏�֌��������B",1;
		viewpoint 1, 213, 175, 99, 0xFFFF00;
		end;
	}
	warp "icas_in.gat",108,32;
	end;
}
icas_in.gat,108,29,0	warp	#out_barracks	1,1,icecastle.gat,186,218	// 2481 from: icas_in.gat(108, 30)
icas_in.gat,92,60,0		warp	#in_barracks_L	1,1,icas_in.gat,56,60	// 2482 from: icas_in.gat(93, 60)
icas_in.gat,59,60,0		warp	#out_barracks_L	1,1,icas_in.gat,95,60	// 2483 from: icas_in.gat(58, 60)
icas_in.gat,125,60,0	warp	#in_barracks_R	1,1,icas_in.gat,161,60	// 2484 from: icas_in.gat(124, 60)
icas_in.gat,158,60,0	warp	#out_barracks_R	1,1,icas_in.gat,122,60	// 2485 from: icas_in.gat(159, 60)
icecastle.gat,124,171,0	warp	#in_restaurant	1,1,icas_in.gat,243,36	// 2486 from: icecastle.gat(123, 171)
icas_in.gat,243,33,0	warp	#out_restaurant	1,1,icecastle.gat,123,168	// 2487 from: icas_in.gat(243, 34)
icecastle.gat,64,225,0	warp	#in_house2		1,1,icas_in.gat,85,112	// 2488 from: icecastle.gat(64, 224)
icas_in.gat,85,109,0	warp	#out_house2		1,1,icecastle.gat,67,222	// 2489 from: icas_in.gat(85, 110)
icecastle.gat,88,241,0	warp	#in_house3		1,1,icas_in.gat,138,112	// 2490 from: icecastle.gat(87, 241)
icas_in.gat,138,109,0	warp	#out_house3		1,1,icecastle.gat,88,238	// 2491 from: icas_in.gat(138, 110)
icecastle.gat,159,243,0	warp	#in_house4		1,1,icas_in.gat,191,112	// 2492 from: icecastle.gat(158, 243)
icas_in.gat,191,109,0	warp	#out_house4		1,1,icecastle.gat,159,241	// 2493 from: icas_in.gat(191, 110)
icecastle.gat,62,137,0	warp	#in_house5		1,1,icas_in.gat,249,112	// 2494 from: icecastle.gat(62, 137)
icas_in.gat,249,109,0	warp	#out_house5		1,1,icecastle.gat,62,134	// 2495 from: icas_in.gat(249, 110)

icecastle.gat,61,112,5	script	���C���q��#icecastle	464,{/* 2826 */}
icecastle.gat,63,112,4	script	�T�u�q��1#icecastle	464,{/* 2827 */}
icecastle.gat,65,112,4	script	�T�u�q��2#icecastle	464,{/* 2828 */}
icecastle.gat,67,112,4	script	�T�u�q��3#icecastle	464,{/* 2829 */}
icecastle.gat,62,229,6	script	�I������#icecastle	21513,{/* 2830 */
	mes "[�I������]";
	mes "��������Ⴂ��B�H���̖��h�ł���B";
	mes "�ٖM�l�����Zeny�Ƃ����������炦��";
	mes "�����Ă��I";
	mes "�h����5000Zeny�I�I";
	next;
	if(select("�h������ - 5000z","��߂�") == 2) {
		emotion 32;
		mes "[�I������]";
		mes "�ӂ�A���Ȃ��߂��Ⴆ��I";
		close;
	}
	if(Zeny < 5000) {
		// ������
		mes "[�I������]";
		mes "�ӂ�A����������Ȃ�����I";
		close;
	}
	mes "[�I������]";
	mes "�g����������薰���Ă�`�B";
	close2;
	set Zeny, Zeny -5000;
	percentheal 100,100;
	warp "icas_in.gat", 87, 114;
	end;
OnInit:
	setnpctitle "<�H���̖��h>";	// NPC:�I������#icecastle(2830)
	end;
}

icecastle.gat,69,231,5	script	���C���q��#icecastle_h	464,{/* 2831 */}
icecastle.gat,71,231,4	script	�T�u�q��1#icecastle_h	464,{/* 2832 */}
icecastle.gat,73,231,4	script	�T�u�q��2#icecastle_h	464,{/* 2833 */}
icecastle.gat,75,231,4	script	�T�u�q��3#icecastle_h	464,{/* 2834 */}
icas_in.gat,81,121,4	script	��������#�q��	10046,{/* 2835 */
	unittalk getcharid(3),strcharinfo(0)+" : ���������H",1;
	mes "�]�ςȖ��O�̃J�`�J�`�ɓ������₾�B";
	mes "�@�ςݏグ��ꂽ���K�ƁA";
	mes "�@���h�̎�̃������\���Ă���]";
	mes "�@";
	mes "�w�q�ɂ�^389DD4 40Zeny^000000����B";
	mes "�@���ɒu���Ēu���ƁA��Ŏ����čs����`�x";
	mes "^0000ff�`�@�H���̖��h�̎�@�I�������@�`^000000";
	next;
	switch(select("^0000FF���C���q��^000000���J��","^FF0000�T�u�q��1^000000���J��","^FF0000�T�u�q��2^000000���J��","^FF0000�T�u�q��3^000000���J��","��������")) {
	case 1:
	case 2:
	case 3:
	case 4:
		if(Zeny < 40) {
			// ������
			mes "�]����������Ȃ��悤���]";
			close;
		}
		mes "^0000FF�]���C���q�ɂ��J�����]^000000";
		close2;
		set Zeny, Zeny -40;
		openstorage;
		end;
	case 5:
		mes "^0000FF�]���̏ꂩ�痧���������]^000000";
		close;
	}
}

icecastle.gat,97,177,4	script	�⋋��#iws	21518,{/* 2888 */
	emotion 1;
	mes "[�⋋���S����]";
	mes "�ǂ����Ă���Ȋ����ꏊ�܂ŗ����H";
	mes "�����͊�����";
	mes "���Ă��ɂȂ鋰�ꂪ���邩��A";
	mes "�ǂ����g�����ꏊ�֓����ĂȂ����B";
	close;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";	// NPC:�⋋��#iws(2888)
	end;
}

jor_nest.gat,21,258,1	script	#whl_effect	844,{/* 2957 (hide)*/
OnTouch:
	delmisceffect 581, "#whl_effect";
	misceffect 581,"#whl_effect";
	end;
OnInit:
	hideonnpc;
	end;
}
jor_nest.gat,22,255,6	script	���[�v#whl	10024,3,3,{/* 2958 */
	if(EP19_1QUE < 100 || BaseLevel < 230) {
		mes "^e6328c�]���̃N�G�X�g��i�s����ɂ�";
		mes "�@�ȉ��̏����𖞂����K�v������܂��]";
		mes "�@�EBaseLv230�ȏ�";
		mes "�@�E�N�G�X�g�u���b�̒n�v�̃N���A";
		close;
	}
	if(checkquest(17637)) {
		mes "�]���[�v�̋߂��Ń��C�W�[�ɓn���ꂽ";
		mes "�@�������L���Ă݂��B";
		mes "�@�������G�ȗ�������";
		mes "�@������p�̂悤�Ȃ��̂�";
		mes "�@�������񏑂���Ă���]";
		next;
		mes "�]�����̗��ʂ��ڂ������Ă݂�ƁA";
		mes "�@���ʂɌ����邪�c�c�̂Ă�ɂ�";
		mes "�@���X�ߑR�Ƃ��Ȃ��ӏ�������";
		mes "�@�悭����ƁA";
		mes "�@�Í��ɂȂ��Ă���悤���]";
		next;
		mes "�]���Ȃ��͈Í�����ǂ����]";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�ǂ����A";
		mes "�d�v�ȍ\����������ꂽ�悤���ȁH";
		mes "���΂͖`���҂��B";
		mes "���Ԃ��Ȃ��ďڍׂ͏Ȃ����A";
		mes "�������Ăق����B�������͐e�F���낤�H";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�{�_����n�߂悤�B";
		mes "�C���V�I�����䂪����Ŏg���Ă���";
		mes "���̔�s�D�̂��Ƃ����ǁA";
		mes "�󂹂Ȃ���B";
		mes "���ꂪ�W���W���[���畷�������e���B";
		next;
		menu "�������̒��̑��̕��͂�����g�ݍ��킹�Ă݂�B",-;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "���̔�s�D�𓮂����Ă���҂́A";
		mes "�l�Ԃ���Ȃ��炵���B";
		next;
		menu "�����ϐF�����ʂ̕����̕��͂�ǂ�ł݂�",-;
		mes "[���C�W�[]";
		mes "�ǂ�ǂ�A";
		mes "�W���W���[�̕��͕񍐏��ɂ��ƁA";
		mes "�����Ɏ��ȏC�����\��";
		mes "�G�l���M�[�R�A�`�Ԃ̐l�H�m�\�̂悤���B";
		mes "���S�Ȓm�\�����A";
		mes "�G�l���M�[�̂Ƃ������Ƃ��ˁB";
		next;
		menu "���H�オ�v�Z���ꂽ�����̉���ǂ�ł݂�",-;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�����ł��邩�H";
		mes "���̔�s�D�𓮂����z�́A";
		mes "�����ɃG�l���M�[�������\��";
		mes "���e�̂悤�ȑ��݂��B";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�����͂Â��Ŗ������j�󂷂�ꍇ�c�c";
		mes "�Ȃ�Ă������I";
		mes "�Œ�ł����a10km���炢�͐Ռ`���c����";
		mes "�X�n�ɂȂ�炵����I";
		next;
		menu "����ɑ����̕�����ǂ�ł݂�",-;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "��背�x���ȏ��";
		mes "�_���[�W���~�ς����";
		mes "�ꎟ�I�ɃR�A����~����B";
		next;
		mes "[���C�W�[]";
		mes "���̏�ԂŃ_���[�W��";
		mes "����ɒ~�ς����";
		mes "�唚�����������邪";
		mes "����͌��ׂ̂悤���B";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�����炭�A�o�������g��";
		mes "�l�H�m�\�Ő��䂵�Ă���";
		mes "��s�D���\���I�Ȕ��e�ɂȂ邱�Ƃ�";
		mes "�C�Â����񂾂낤�B";
		next;
		mes "[���C�W�[]";
		mes "�����瓯�����f����";
		mes "�ǉ����Y����Ă��Ȃ��̂ł͂Ȃ�����";
		mes "���������B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�W���W���[��";
		mes "^0000ff�u���ꂪ��l�́w�ɂ��w�x�炵����B";
		mes "^0000ff���ꂪ���ĈӖ��Ȃ̂���";
		mes "^0000ff�悭������Ȃ����ǁv";
		mes "^000000�ƌ����Ă����B";
		next;
		mes "[���C�W�[]";
		mes "���S�ɉ󂷂Ɣ������邵�A";
		mes "�����󂵂Ă���������̂�";
		mes "�ڂɌ����Ă���B";
		next;
		mes "[���C�W�[]";
		mes "�Ȃ瓚���͈�����Ȃ��B";
		mes "�܂��A�K���ɉ^�s�ł��Ȃ����x��";
		mes "��s�D�̓������󂵂Ƃ��āA";
		mes "�Ƃ񂸂炷��񂾂�B";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�����A";
		mes "�\��������ƂɂȂ��Ă��������ˁB";
		mes "�Ƃɂ����A";
		mes "�{�C�Ŕ�s�D���󂵂�������������A";
		mes "�V�k�S�ŏ��������񂾂�B";
		mes "���肪�����Ǝv���Ă���I";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���Ⴀ�A�K�^���F���I";
		mes "�����Ă܂�����I";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "�]�����̓��e�͂����܂ł̂悤���B";
		mes "�@�������ł�����A";
		mes "�@�ēx���[�v�𒲂ׂ�";
		mes "�@��s�D�ɓ˓����悤�]";
		close2;
		delquest 17637;
		end;
	}
	mes "�]��s�D�𗯂߂邽�߂̃��[�v������]";
	next;
	mes "^e6328c�������A���_���W����";
	mes "�u��s�D�j����v��";
	mes "�����Ɠ��ꂪ�s���܂��B";
	mes "�@";
	mes "^8c32e6�_���W���������F^191970�����\";
	mes "^8c32e6�_���W��������F^191970����\";
	mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	messize 180,364;
	next;
	switch(select("^191970��������","^0b0b33�������A���_���W�����֓���","^0b0b33���ӎ����̊m�F")) {
	case 1:
		mes "�]���Ȃ��͂��̏���������]";
		close;
	case 2:
		break;
	case 3:
		mes "�ڂ����͂���������m�F���������B";
		mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 180,364;
		close;
	}
	if(mdopenstate("��s�D�j����")) {
		mes "�]��s�D�j����Ɍ������܂����H�]";
		next;
		if(select("^191970�����l����","^e6328c��s�D�j����֌�����") == 1) {
			mes "�]���Ȃ��͏����l���邱�Ƃɂ����]";
			close;
		}
		mes "�]���Ȃ��͔�s�D�j����Ɍ��������]";
		close2;
		switch(mdenter("��s�D�j����")) {
		case 0:	// �G���[�Ȃ�
			setquest 130605;	// state=1
			setquest 130610;	// state=1
			announce "�������A���_���W����[��s�D�j����] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			//warp "1@whl.gat", 32, 53;
			end;
		case 1:	// �p�[�e�B�[������
			mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
			mes "����ł��܂���B";
			mes "������x�m�F���Ă���";
			mes "��蒼���Ă��������B";
			close;
		case 2:	// �_���W�������쐬
			mes "^8c32e6�p�[�e�B�[���[�_�[��";
			mes "�������A���_���W������";
			mes "�������Ă��Ȃ���Ԃł��B";
			close;
		default:	// ���̑��G���[
			end;
		}
	}
	else {
	}
}
OnTouch:
	delmisceffect 581, "#whl_effect";
	misceffect 581,"#whl_effect";
	end;
OnInit:
	setnpcgroup 1013;	// NPC:���[�v#whl(2958)
	setnpctitle "[MD�̐����Ɠ���]";	// NPC:���[�v#whl(2958)
	end;
}
jor_nest.gat,63,257,0	script	#hw_ep19re6	139,8,8,{/* 2959 */
	if(EP19_1QUE >= 68)
		cloakoffnpc "�A������#ep19re2";
	else
		cloakonnpc "�A������#ep19re2";
	end;
}
jor_nest.gat,63,257,3	script	�A������#ep19re2	10461,{/* 2960 (cloaking)*/
	if(EP19_1QUE < 68)	// ? ������
		end;
	if(!(checkquest(16663)&8)) {
		cutin "ep19_iwin01.png", 2;
		mes "[�A������]";
		mes "�����P�A�Ƃ̐퓬�A";
		mes "�r�����Ƃ��܂���ł������H";
		mes "�܂��킢�����ƁA�v���܂��񂩁H";
		next;
		cutin "ep19_iwin01.png", 255;
		if(select("�v��","�v��Ȃ�") == 2) {
			cutin "ep19_iwin01.png", 2;
			mes "[�A������]";
			mes "�����ł����H";
			mes "�܂�Ȃ����ł��ˁB";
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		cutin "ep19_iwin01.png", 2;
		mes "[�A������]";
		mes "����Ȗ`���җl�̂��߂�";
		mes "�����������܂����B";
		mes "�V�~�����[�V�����f�[�^�̃����P�A�Ƃ�";
		mes "�r���r������͋[�퓬�B";
		next;
		mes "[�A������]";
		mes "�X�̏�̕��X�Ə����������̂ł�����";
		mes "���S�A���S�I";
		mes "�V�~�����[�V�����퓬��";
		mes "�T��2��܂ŉ\�ł��B";
		mes "���킵�Ă݂܂����H";
		next;
		if(select("����","���Ȃ�") == 2) {
			cutin "ep19_iwin01.png", 2;
			mes "[�A������]";
			mes "����A�܂�Ȃ����ł��ˁB";
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		compquest 16663;
		mes "[�A������]";
		mes "����ł́A�������ł��܂�����A";
		mes "������x�b�������Ă��������܂��B";
		close2;
		//showevent 0, 1, "�o�S�b�g�̌�����#warp_e";	// 2652: 66, 260
		//showevent 9999, 0, "�A������#ep19re2";	// 2946: 63, 257
		cutin "ep19_iwin01.png", 255;
		end;
	}
	cutin "ep19_iwin01.png", 2;
	mes "[�A������]";
	mes "�V�~�����[�V��������";
	mes "�������J�n���Ă���낵���ł����H";
	next;
	mes "^e6328c�������A���_���W����";
	mes "�u�V�~�����[�V�����퓬�v��";
	mes "�����Ɠ��ꂪ�s���܂��B";
	mes "�@";
	mes "^8c32e6�_���W���������F^191970�����\";
	mes "^8c32e6�_���W���������F^191970�����s��";
	mes "�@";
	mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	messize 180,364;
	next;
	if(mdopenstate("�V�~�����[�V�����퓬"))
		set '@menu$,"^0b0b33�_���W�����֓���";
	else if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@menu$,"^0b0b33�_���W�����̍쐬";
	else
		set '@menu$,"";
	if(select("^191970��������",'@menu$) == 1) {
		mes "[�A������]";
		mes "�c�O�ł��ˁB";
		messize 180,280;
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	if(mdopenstate("�V�~�����[�V�����퓬")) {
		mes "[�A������]";
		mes "�V�~�����[�V��������";
		mes "�������ł��܂����B";
		messize 180,280;
		close2;
		cutin "ep19_iwin01.png", 255;
		switch(mdenter("�͂��߂Ẵp�g���[��")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[�V�~�����[�V�����퓬] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x9, 0x00ff99;
			donpcevent getmdnpcname("FirstPatrolControl1")+ "::OnStart";
			//warp "1@jca_1.gat", 57, 45;
			end;
		case 1:	// �p�[�e�B�[������
			mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
			mes "����ł��܂���B";
			mes "������x�m�F���Ă���";
			mes "��蒼���Ă��������B";
			close;
		case 2:	// �_���W�������쐬
			mes "^8c32e6�p�[�e�B�[���[�_�[��";
			mes "�������A���_���W������";
			mes "�������Ă��Ȃ���Ԃł��B";
			close;
		default:	// ���̑��G���[
			end;
		}
	}
	else {
		if(getonlinepartymember() < 1) {
			mes "^8c32e6�󔒂̃p�[�e�B�[���ł́A";
			mes "�������A���_���W������";
			mes "�쐬���邱�Ƃ͏o���܂���B";
			messize 180,280;
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		mes "^000000�V�~�����[�V�����퓬�𐶐����܂��B";
		mes "^000000��낵���ł����H";
		mes "^0000ff�T�Ԑ�����( 0 / 2 )";
		mes "�@";
		mes "^e6328c�����ӎ���";
		mes "^000000�E�u�V�~�����[�V�����퓬�v�͖�1�T�Ԃł̐����񐔂���߂��Ă��܂��B";
		mes "^000000�@�ő�2��܂Ő������\�ł��B";
		mes "^000000�@�����񐔂͎��̉Ηj���̐��߈ȍ~��";
		mes "^000000�@���߂āu�V�~�����[�V�����퓬�v�𐶐�����ۂɃ��Z�b�g����܂��B";
		mes "�@";
		mes "^ff0000�E�쐬���܂��͍쐬�ς݂̃������A���_���W���������݂���ꍇ�A";
		mes "^ff0000�@�_���W�����̍쐬�Ɏ��s����ꍇ������܂��B";
		mes "^ff0000�@�܂��A�쐬�Ɏ��s�����ꍇ�ł��A�����񐔂̓J�E���g����܂��B";
		mes "�@";
		mes "^000000���̂ق��̒��ӎ����́A";
		mes "�����T�C�g�ɂ���u�V�~�����[�V�����퓬�̃��[���v���������������B";
		mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
		messize 364,448;
		next;
		if(select("^191970�����l����","^e6328c�쐬����") == 1) {
			mes "�]���̏�𗣂ꂽ�]";
			messize 180,280;
			close2;
			cutin "ep19_iwin01.png", 255;
			end;
		}
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			close;
mes "�u"+strcharinfo(0)+"�v�́A";
mes "�Đ����ҋ@���Ԓ��̂��߁A";
mes "�������A���_���W�����͐����o���܂���B";
mes "�ȉ��̏�����S�Ė������Ɛ������\�ł��B";
mes "�@";
mes "^e6328c�E���̉Ηj���̐��߈ȍ~";
messize 180,364;
close;
cutin "ep19_iwin01.png", 255;
		setquest 130630;
		setquest 130631;
		mdcreate "�V�~�����[�V�����퓬";
		mes "���p�[�e�B�[��";
		mes "^009eff#�ӂ��ӂ�^000000";
		mes "���p�[�e�B�[���[�_�[";
		mes "^009eff"+strcharinfo(0)+"^000000";
		mes "�@";
		mes "^006400�V�~�����[�V�����퓬��";
		mes "�쐬�\�����󂯕t���܂����B^000000";
		messize 180,280;
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1013;	// NPC:�A������#ep19re2(2946)
	setnpctitle "[MD�̐����Ɠ���]";	// NPC:�A������#ep19re2(2946)
	cloakonnpc;
	end;
}

//------------------------------------------------------------
// jor_tail.gat
jor_tail.gat,0,0,0,0	monster	���郏�J��	21524,80,5000,0,0	// aid: 249-328
jor_tail.gat,0,0,0,0	monster	�A�C�X�t�i���V	21525,90,5000,0,0	// aid: 329-418
//------------------------------------------------------------
// jor_back1.gat
jor_back1.gat,0,0,0,0	monster	���郏�J��	21524,60,5000,0,0	// aid: 419-478
jor_back1.gat,0,0,0,0	monster	�A�C�X�t�i���V	21525,60,5000,0,0	// aid: 479-538
jor_back1.gat,0,0,0,0	monster	�A�C�X�X�g���[	21523,80,5000,0,0	// aid: 540-618
//------------------------------------------------------------
// jor_back2.gat
jor_back2.gat,0,0,0,0	monster	�s����	21521,10,5000,0,0	// aid: 619-628
jor_back2.gat,0,0,0,0	monster	�A�C�X�t�i���V	21525,40,5000,0,0	// aid: 629-668
jor_back2.gat,0,0,0,0	monster	�A�C�X�X�g���[	21523,40,5000,0,0	// aid: 669-708
jor_back2.gat,0,0,0,0	monster	���}�L�i	21520,10,5000,0,0	// aid: 709-718
//------------------------------------------------------------
// jor_back3.gat
jor_back3.gat,0,0,0,0	monster	���n���K��	21526,1,5000,0,0	// aid: 719
jor_back3.gat,0,0,0,0	monster	�ŉ������K��	21527,1,5000,0,0	// aid: 720
jor_back3.gat,0,0,0,0	monster	�A�C�X�t�i���V	21525,40,5000,0,0	// aid: 721-760
jor_back3.gat,0,0,0,0	monster	�s����	21521,3,5000,0,0	// aid: 762-763
jor_back3.gat,0,0,0,0	monster	�J���}����	21522,10,5000,0,0	// aid: 764-773
jor_back3.gat,0,0,0,0	monster	���}�L�i	21520,10,5000,0,0	// aid: 774-783
//------------------------------------------------------------
// jor_dun01.gat
jor_dun01.gat,0,0,0,0	monster	���n���K��	21526,6,5000,0,0	// aid: 784-789
jor_dun01.gat,0,0,0,0	monster	�ŉ������K��	21527,6,5000,0,0	// aid: 790-795
jor_dun01.gat,0,0,0,0	monster	�������K��	21528,6,5000,0,0	// aid: 796-801
jor_dun01.gat,0,0,0,0	monster	�n�[�g�n���^�[AT	21599,3,5000,0,0	// aid: 802-804
//------------------------------------------------------------
// jor_dun02.gat
jor_dun02.gat,0,0,0,0	monster	�ŉ������K��	21527,6,5000,0,0	// aid: 805-810
jor_dun02.gat,0,0,0,0	monster	�������K��	21528,6,5000,0,0	// aid: 811-816
jor_dun02.gat,0,0,0,0	monster	�������K��	21529,6,5000,0,0	// aid: 817-822
jor_dun02.gat,0,0,0,0	monster	�n�[�g�n���^�[AT	21599,3,5000,0,0	// aid: 823-825
//------------------------------------------------------------
// gw_fild01.gat
//gw_fild01.gat,0,0,0,0	monster	�A�b�V���z�b�p�[	21302,16,0,0,0	// aid: 4670-4716
//gw_fild01.gat,0,0,0,0	monster	�A�b�V������	21303,19,5371,0,0	// aid: 4721-4828
//gw_fild01.gat,0,0,0,0	monster	�O���C�E���t	21304,13,172832,0,0	// aid: 4834-4864
//------------------------------------------------------------
// gw_fild02.gat
//gw_fild02.gat,0,0,0,0	monster	�V�Q����	21305,6,38593,0,0	// aid: 4871-4906
//gw_fild02.gat,0,0,0,0	monster	�O���C�E���t	21304,2,0,0,0	// aid: 4944-4946
//gw_fild02.gat,0,0,0,0	monster	�A�b�V������	21303,3,0,0,0	// aid: 4950-4957
//gw_fild02.gat,0,0,0,0	monster	�t�@�C�A�E�B���h�J�C�g	21306,18,0,0,0	// aid: 4967-5069
//gw_fild02.gat,0,0,0,0	monster	�t�@���g���E���t	21307,14,0,0,0	// aid: 5077-5180

/*
21305,�V�Q�������|�C�Y���A�^�b�N,attack,188,1,2000,0,0,no,target,always,0,,,,,,
21305,�V�Q�������A�[�X�X�p�C�N,chase,90,5,2000,0,0,no,target,always,0,,,,,,
21306,�t�@�C�A�E�B���h�J�C�g���{�E�����O�o�b�V��,attack,62,1,2000,0,32,no,target,always,0,,,,,,
21306,�t�@�C�A�E�B���h�J�C�g���\�j�b�N�u���[,attack,136,8,2000,0,49885,no,target,always,0,,,,,,
21307,�t�@���g���E���t���K�C�f�b�h�A�^�b�N,chase,172,1,2000,0,17178,no,target,always,0,,,,,,
21307,�t�@���g���E���t���e���L�l�V�X�A�^�b�N,attack,191,1,2000,0,31396,no,target,always,0,,,,,,
21307,�t�@���g���E���t���O���E���h�A�^�b�N,attack,185,1,2000,0,0,no,target,always,0,,,,,,
21307,�t�@���g���E���t���N���[�L���O,attack,135,1,2000,300,3227,no,self,always,0,,,,,,
21307,�t�@���g���E���t���O�����g�D�[�X,chase,137,1,2000,0,39,no,target,always,0,,,,,,
21307,�t�@���g���E���t���o�b�V��,attack,5,1,2000,0,3092,no,target,always,0,,,,,,
21520,���}�L�i���z�[���[�A�^�b�N,attack,189,1,2000,0,1154,no,target,always,0,,,,,,
21520,���}�L�i���_�u���X�g���C�t�B���O,attack,46,2,2000,0,237279,no,target,always,0,,,,,,
21520,���}�L�i���E�H�[�^�[�A�^�b�N,attack,184,1,2000,0,269293,no,target,always,0,,,,,,
21520,���}�L�i���V���[�v�V���[�e�B���O,attack,382,1,2000,0,48,no,target,always,0,,,,,,
21520,���}�L�i���u���C���h�A�^�b�N,attack,177,1,2000,0,325618,no,target,always,0,,,,,,
21521,�s���ԁ��x�i���t�H�O,chase,706,0,2000,0,31,no,self,always,0,,,,,,
21521,�s���ԁ��q�[��,chase,28,115940,2000,0,9589775,no,friend,always,0,,,,,,
21521,�s���ԁ�M���C�I�u�W�F�l�V�X,attack,737,7,2000,200,30,no,friend,always,0,,,,,,
21521,�s���ԁ��z�[���[�A�^�b�N,chase,189,1,2000,0,1952540,no,target,always,0,,,,,,
21521,�s���ԁ��X�s�A�u�[������,chase,59,1,2000,0,0,no,target,always,0,,,,,,
21521,�s���ԁ��E�H�[�^�[�A�^�b�N,chase,184,1,2000,0,0,no,target,always,0,,,,,,
21522,�J���}�������x�i���t�H�O,chase,706,0,2000,0,46,no,self,always,0,,,,,,
21522,�J���}�������q�[��,chase,28,110300,2000,0,0,no,friend,always,0,,,,,,
21522,�J���}�������z�[���[�A�^�b�N,chase,189,1,2000,0,86260,no,target,always,0,,,,,,
21523,�A�C�X�X�g���[���R�[���h�{���g,chase,14,5,2000,0,127988,no,target,always,0,,,,,,
21523,�A�C�X�X�g���[���E�H�[�^�[�A�^�b�N,attack,184,1,2000,0,0,no,target,always,0,,,,,,
21525,�A�C�X�t�i���V���E�H�[�^�[�A�^�b�N,attack,184,1,2000,0,0,no,target,always,0,,,,,,
21525,�A�C�X�t�i���V���t���X�g�_�C�o�[,chase,15,1,2000,0,307347,no,target,always,0,,,,,,
21526,���n���K�����x�i���t�H�O,chase,706,10,2000,0,20,no,self,always,0,,,,,,
21526,���n���K�����x�i���t�H�O,attack,706,10,2000,0,20,no,self,always,0,,,,,,
21526,���n���K�����|�C�Y���A�^�b�N,chase,188,1,2000,0,12532,no,target,always,0,,,,,,
21526,���n���K�����J�[�X�A�^�b�N,chase,181,1,2000,0,116215,no,target,always,0,,,,,,
21526,���n���K�����e���L�l�V�X�A�^�b�N,chase,191,1,2000,0,71501,no,target,always,0,,,,,,
21526,���n���K�����q�[��,chase,28,127870,2000,0,452,no,friend,always,0,,,,,,
21527,�ŉ������K�����X���[�v�A�^�b�N,chase,182,1,2000,0,11763,no,target,always,0,,,,,,
21527,�ŉ������K�����|�C�Y���A�^�b�N,chase,188,1,2000,0,9685,no,target,always,0,,,,,,
21527,�ŉ������K�����x�i���t�H�O,chase,706,0,2000,0,24,no,self,always,0,,,,,,
21527,�ŉ������K�����e���L�l�V�X�A�^�b�N,chase,191,1,2000,0,34372,no,target,always,0,,,,,,
21527,�ŉ������K�����O���E���h�A�^�b�N,attack,185,1,2000,0,0,no,target,always,0,,,,,,
21528,�������K�����x�i���t�H�O,chase,706,0,2000,0,19,no,self,always,0,,,,,,
21528,�������K�����|�C�Y���A�^�b�N,chase,188,1,2000,0,1078996,no,target,always,0,,,,,,
21528,�������K�����|�C�Y���A�^�b�N,attack,188,1,2000,0,1078996,no,target,always,0,,,,,,
21528,�������K�����e���L�l�V�X�A�^�b�N,chase,191,1,2000,0,907,no,target,always,0,,,,,,
21528,�������K�����_�[�N�X�g���C�N,chase,340,3,2000,0,395689,no,target,always,0,,,,,,
21528,�������K�����u���C���h�A�^�b�N,chase,177,1,2000,0,25975,no,target,always,0,,,,,,
21528,�������K�����u���b�h�h���C��,chase,199,1,2000,0,0,no,target,always,0,,,,,,
21528,�������K�����q�[��,chase,28,126800,2000,0,942,no,friend,always,0,,,,,,
21529,�������K�����x�i���t�H�O,chase,706,0,2000,0,22,no,self,always,0,,,,,,
21529,�������K�����|�C�Y���A�^�b�N,chase,188,1,2000,0,77721,no,target,always,0,,,,,,
21529,�������K�����e���L�l�V�X�A�^�b�N,chase,191,1,2000,0,46904,no,target,always,0,,,,,,
21529,�������K�����\�E���X�g���C�N,chase,13,5,2000,0,0,no,target,always,0,,,,,,
21529,�������K�����}�O�i���u���C�N,attack,7,1,2000,0,26,no,target,always,0,,,,,,
21529,�������K�����R�[���h�{���g,chase,14,3,2000,0,8100079,no,target,always,0,,,,,,
21599,�n�[�g�n���^�[AT���e���L�l�V�X�A�^�b�N,chase,191,1,2000,0,2556023,no,target,always,0,,,,,,
21599,�n�[�g�n���^�[AT��M�T�C�L�b�N�E�F�[�u,attack,736,4,2000,0,19,no,around,always,0,,,,,,
*/

//���K���ϐg�X�N���[��
/*
{
	if(!getmapxy('@map$,'@x,'@y,0))
		misceffect 53,"";
	else if('@map$ == "jor_back3.gat" || '@map$ == "jor_dun01.gat" || '@map$ == "jor_dun02.gat" || '@map$ == "jor_nest.gat") {
		misceffect 595,"";
		sc_start SC_MONSTER_TRANSFORM,180000,21530;
	}
	else {
		misceffect 53,"";
	}
	end;
}
*/