verus04.gat,63,112,5	script	�ʎY�^�`���[���X�g��#3	10053,{/* 59481 */
	cutin "dalle03",2;
	mes "[�ʎY�^�`���[���X�g��]";
	mes "�I�q�l���m�F�V�}�V�^�B";
	mes "���ꃒ�c�ƃ��[�h�j�؃��փG�}�X�B";
	next;
	cutin "dalle01",2;
	mes "[�ʎY�^�`���[���X�g��]";
	mes "���I�@�J�Řb�蕦�����I";
	mes "�`���[���X�g���H��̋Z�p��";
	mes "�����̃A�b�v�O���[�h���o����I";
	next;
	mes "[�ʎY�^�`���[���X�g��]";
	mes "�Ȃ�ƁI";
	mes "���Ȃ�f�ނ������Ă��邾����";
	mes "�����ŃA�b�v�O���[�h�o�����Ⴂ�܂��I";
	next;
	switch(select("��߂�","�b�𕷂�","�A�b�v�O���[�h�ɂ��ĕ���","�A�b�v�O���[�h����")) {
	case 1:
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�ł͂܂�������܂��傤�B";
		close2;
		cutin "dalle01",255;
		end;
	case 2:
		mes "[�ʎY�^�`���[���X�g��]";
		mes "���͍H��ő�ʐ��Y���ꂽ";
		mes "�i���o�����O������Ă��Ȃ�";
		mes "�ʎY�^�`���[���X�g���ł��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�{���͂����Ƒ����̒��Ԃ�";
		mes "�����̂ł����A";
		mes "�H���E�o����ۂ̐퓬��";
		mes "�݂�Ȕj�󂳂�Ă��܂��܂����B";
		close2;
		cutin "dalle01",255;
		end;
	case 3:
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�A�b�v�O���[�h�Ŋ������鑕����";
		mes "�g���l�[�h�A�b�N�X[1]";
		mes "�M���`���u���[�h[3]�ł��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�ǂ̑����ɂ���";
		mes "���������܂��傤���H";
		mes "�@";
		mes "�]^ff0000�ꕔ�A�m�F��";
		mes "�@��ʂ̃X�N���[�����K�v�ł�^000000�]";
		while(1) {
			next;
			switch(select("��߂�","�g���l�[�h�A�b�N�X[1]","�M���`���u���[�h[3]","�p�C���o���J�[S[3]","�p�C���o���J�[P[3]","�p�C���o���J�[T[3]")) {
			case 1:
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�ł͂܂�������܂��傤�B";
				close2;
				cutin "dalle01",255;
				end;
			case 2:
				mes "�y�g���l�[�h�A�b�N�X[1]�z";
				mes "���^�����X�^�[����";
				mes "�󂯂�_���[�W - 10%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�A�b�N�X�g���l�[�h]��";
				mes "�Ďg�p�ҋ@���� - 1�b";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�g���l�[�h�A�b�N�X]��";
				mes "���B�l��1�オ��x�ɒǉ���";
				mes "���^�����X�^�[����";
				mes "�󂯂�_���[�W - 1%";
				mes "�U�����x + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777���蕀^000000";
				mes "�U�� : ^777777320^000000";
				mes "�d�� : ^777777400^000000";
				mes "���� : ^777777��^000000";
				mes "���탌�x�� : ^7777774^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^7777773���E�\�[�h�}���n 3���E�}�[�`�����g�n^000000";
				next;
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�A�b�v�O���[�h���s���ɂ�";
				mes "^FF0000�n���P�[���t���[���[[1]1��^000000";
				mes "^FF0000�E�B���h�z�[�N[0]1��^000000";
				mes "^ff0000�����Ȕi���j50��^000000";
				mes "���K�v�ł��B";
				mes "���̑��������Ă݂܂����H";
				continue;
			case 3:
				mes "�y�M���`���u���[�h[3]�z";
				mes "�l�Ԍ`�����X�^�[��";
				mes "�U���������ASP + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�ߐڕ����U����";
				mes "�l�Ԍ`�����X�^�[��|������";
				mes "SP + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�M���`���u���[�h]��";
				mes "���B�l��7�ȏ�̎��A";
				mes "���B�l��1�オ��x�ɒǉ���";
				mes "�ߐڕ����U����";
				mes "�l�Ԍ`�����X�^�[��|������";
				mes "SP + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�M���`���u���[�h]��";
				mes "���B�l��10�̎��A�ǉ���";
				mes "�l�Ԍ`�����X�^�[��";
				mes "�h��͂𖳎�";
				mes "�l�Ԍ`�����X�^�[��";
				mes "�U���������ASP + 1";
				mes "�ߐڕ����U����";
				mes "�l�Ԍ`�����X�^�[��|������";
				mes "SP + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777���茕^000000";
				mes "�U�� : ^777777200^000000";
				mes "�d�� : ^777777350^000000";
				mes "���탌�x�� : ^7777772^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^777777���[���i�C�g^000000";
				next;
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�A�b�v�O���[�h���s���ɂ�";
				mes "^FF0000�M���`��[0]1��^000000";
				mes "^FF0000�G�b�W[0]1��^000000";
				mes "^FF0000���s�l�̎��50��^000000";
				mes "���K�v�ł��B";
				mes "���̑��������Ă݂܂����H";
				continue;
			case 4:
				mes "�y�p�C���o���J�[S[3]�z";
				mes "�����U���������A���m����";
				mes "�G��X����Ԃɂ���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�p�C���o���J�[S]��";
				mes "���B�l��7�ȏ�̎��A";
				mes "���B�l��1�オ��x��";
				mes "�����U���������A";
				mes "�G��X����Ԃɂ���";
				mes "�m�����㏸";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�X�L��[�p�C���o���J�[]";
				mes "�g�p���A�G�𓀌���Ԃɂ���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�X�L��[�p�C���o���J�[]��";
				mes "�Ďg�p�ҋ@���� + 5�b";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�݊�^000000";
				mes "�U�� : ^77777750^000000";
				mes "�d�� : ^777777350^000000";
				mes "���� : ^777777��^000000";
				mes "���탌�x�� : ^7777774^000000";
				mes "�v�����x�� : ^777777130^000000";
				mes "���� : ^777777���J�j�b�N^000000";
				next;
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�A�b�v�O���[�h���s���ɂ�";
				mes "^FF0000�p�C���o���J�[[0]1��^000000";
				mes "^FF0000�����Ȕi���j10��^000000";
				mes "^FF0000��͂̌���1�@50��^000000";
				mes "���K�v�ł��B";
				mes "���̑��������Ă݂܂����H";
				continue;
			case 5:
				mes "�y�p�C���o���J�[P[3]�z";
				mes "�����U���������A���m����";
				mes "�G���􂢏�Ԃɂ���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�p�C���o���J�[P]��";
				mes "���B�l��7�ȏ�̎��A";
				mes "���B�l��1�オ��x��";
				mes "�����U���������A";
				mes "�G���􂢏�Ԃɂ���";
				mes "�m�����㏸";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�X�L��[�p�C���o���J�[]";
				mes "�g�p���A�G��Ή���Ԃɂ���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�X�L��[�p�C���o���J�[]��";
				mes "�Ďg�p�ҋ@���� + 5�b";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�݊�^000000";
				mes "�U�� : ^77777750^000000";
				mes "�d�� : ^777777350^000000";
				mes "���� : ^777777�n^000000";
				mes "���탌�x�� : ^7777774^000000";
				mes "�v�����x�� : ^777777130^000000";
				mes "���� : ^777777���J�j�b�N^000000";
				next;
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�A�b�v�O���[�h���s���ɂ�";
				mes "^FF0000�p�C���o���J�[[0]1��^000000";
				mes "^FF0000�����Ȕi�n�j10��^000000";
				mes "^FF0000��͂̌���3�@50��^000000";
				mes "���K�v�ł��B";
				mes "���̑������݂Ă݂܂����H";
				continue;
			case 6:
				mes "�y�p�C���o���J�[T[3]�z";
				mes "�K���U�� + 20%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�p�C���o���J�[T]��";
				mes "���B�l��7�ȏ�̎��A�ǉ���";
				mes "�K���U�� + 30%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�u�[�X�g�i�b�N��]�g�p���A";
				mes "���m����1�b�ԁA";
				mes "�����U���������A";
				mes "���m����";
				mes "�G��჏�Ԃɂ���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�݊�^000000";
				mes "�U�� : ^77777750^000000";
				mes "�d�� : ^777777350^000000";
				mes "���� : ^777777��^000000";
				mes "���탌�x�� : ^7777774^000000";
				mes "�v�����x�� : ^777777130^000000";
				mes "���� : ^777777���J�j�b�N^000000";
				next;
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�A�b�v�O���[�h���s���ɂ�";
				mes "^FF0000�p�C���o���J�[[0]1��^000000";
				mes "^FF0000�����Ȕi���j10��^000000";
				mes "^FF0000��͂̌���2�@50��^000000";
				mes "���K�v�ł��B";
				mes "���̑��������Ă݂܂����H";
				continue;
			}
		}
	case 4:
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�A�b�v�O���[�h�ł��ˁB";
		mes "�ǂ���I�X�X���̒��E���g�������ł��I";
		mes "�܂��A���ӎ����Ƃ���";
		mes "^FF0000���B�l�⑕�����ꂽ�J�[�h��^000000";
		mes "^FF0000�A�b�v�O���[�h���s����^000000";
		mes "^FF0000�����Ă��܂��܂��B^000000";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "^FF0000�����ޗ��ƂȂ鑕���𕡐������Ă����ꍇ";
		mes "^FF0000�ǂ�������Ɏg�����͑I���ł��܂���B^000000";
		mes "�ޗ��ȊO�͂��ׂđq�ɂɗa����Ȃ�";
		mes "���Ă���A�A�b�v�O���[�h��";
		mes "�s���Ă��������B";
		mes "�ǂ�ɃA�b�v�O���[�h���܂����H";
		next;
		switch(select("��߂�","�g���l�[�h�A�b�N�X[1]","�M���`���u���[�h[3]","�p�C���o���J�[S[3]","�p�C���o���J�[P[3]","�p�C���o���J�[T[3]")) {
		case 1:
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�ł͂܂�������܂��傤�B";
			close2;
			cutin "dalle01",255;
			end;
		case 2:
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�b�v�O���[�h���s���ɂ�";
			mes "^FF0000�n���P�[���t���[���[[1]1��^000000";
			mes "^FF0000�E�B���h�z�[�N[0]1��^000000";
			mes "^ff0000�����Ȕi���j50��^000000";
			mes "���K�v�ł��B";
			next;
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�{���Ƀg���l�[�h�A�b�N�X�ւ�";
			mes "�A�b�v�O���[�h��";
			mes "�s���Ă�낵���ł����H";
			next;
			if(select("������x�l���Ă݂�","�A�b�v�O���[�h����") == 1) {
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�T�d�Ɍ��肵�Ă��������B";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�C�e�����s�����Ă��܂��B";
			mes "^FF0000�n���P�[���t���[���[[1]1��^000000";
			mes "^FF0000�E�B���h�z�[�N[0]1��^000000";
			mes "^ff0000�����Ȕi���j50��^000000";
			mes "���K�v�ł��B";
			close2;
			cutin "dalle01",255;
			end;
		case 3:
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�b�v�O���[�h���s���ɂ�";
			mes "^FF0000�M���`��[0]1��^000000";
			mes "^FF0000�G�b�W[0]1��^000000";
			mes "^FF0000���s�l�̎��50��^000000";
			mes "���K�v�ł��B";
			next;
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�{���ɃM���`���u���[�h�ւ�";
			mes "�A�b�v�O���[�h��";
			mes "�s���Ă�낵���ł����H";
			next;
			if(select("������x�l���Ă݂�","�A�b�v�O���[�h����") == 1) {
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�T�d�Ɍ��肵�Ă��������B";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�C�e�����s�����Ă��܂��B";
			mes "^FF0000�M���`��[0]1��^000000";
			mes "^FF0000�G�b�W[0]1��^000000";
			mes "^FF0000���s�l�̎��50��^000000";
			mes "���K�v�ł��B";
			close2;
			cutin "dalle01",255;
			end;
		case 4:
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�b�v�O���[�h���s���ɂ�";
			mes "^FF0000�p�C���o���J�[[0]1��^000000";
			mes "^FF0000�����Ȕi���j10��^000000";
			mes "^FF0000��͂̌���1�@50��^000000";
			mes "���K�v�ł��B";
			next;
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�{���Ƀp�C���o���J�[S�ւ�";
			mes "�A�b�v�O���[�h��";
			mes "�s���Ă�낵���ł����H";
			next;
			if(select("������x�l���Ă݂�","�A�b�v�O���[�h����") == 1) {
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�T�d�Ɍ��肵�Ă��������B";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�C�e�����s�����Ă��܂��B";
			mes "^FF0000�p�C���o���J�[[0]1��^000000";
			mes "^FF0000�����Ȕi���j10��^000000";
			mes "^FF0000��͂̌���1�@50��^000000";
			mes "���K�v�ł��B";
			close2;
			cutin "dalle01",255;
			end;
		case 5:
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�b�v�O���[�h���s���ɂ�";
			mes "^FF0000�p�C���o���J�[[0]1��^000000";
			mes "^FF0000�����Ȕi�n�j10��^000000";
			mes "^FF0000��͂̌���3�@50��^000000";
			mes "���K�v�ł��B";
			next;
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�{���Ƀp�C���o���J�[P�ւ�";
			mes "�A�b�v�O���[�h��";
			mes "�s���Ă�낵���ł����H";
			next;
			if(select("������x�l���Ă݂�","�A�b�v�O���[�h����") == 1) {
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�T�d�Ɍ��肵�Ă��������B";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�C�e�����s�����Ă��܂��B";
			mes "^FF0000�p�C���o���J�[[0]1��^000000";
			mes "^FF0000�����Ȕi�n�j10��^000000";
			mes "^FF0000��͂̌���3�@50��^000000";
			mes "���K�v�ł��B";
			close2;
			cutin "dalle01",255;
			end;
		case 6:
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�b�v�O���[�h���s���ɂ�";
			mes "^FF0000�p�C���o���J�[[0]1��^000000";
			mes "^FF0000�����Ȕi���j10��^000000";
			mes "^FF0000��͂̌���2�@50��^000000";
			mes "���K�v�ł��B";
			next;
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�{���Ƀp�C���o���J�[T�ւ�";
			mes "�A�b�v�O���[�h��";
			mes "�s���Ă�낵���ł����H";
			next;
			if(select("������x�l���Ă݂�","�A�b�v�O���[�h����") == 1) {
				mes "[�ʎY�^�`���[���X�g��]";
				mes "�T�d�Ɍ��肵�Ă��������B";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[�ʎY�^�`���[���X�g��]";
			mes "�A�C�e�����s�����Ă��܂��B";
			mes "^FF0000�p�C���o���J�[[0]1��^000000";
			mes "^FF0000�����Ȕi���j10��^000000";
			mes "^FF0000��͂̌���2�@50��^000000";
			mes "���K�v�ł��B";
			close2;
			cutin "dalle01",255;
			end;
		}
	}
OnInit:
	waitingroom "�����A�b�v�O���[�h",0; //59481
	end;
}

verus04.gat,66,109,5	script	�ʎY�^�`���[���X�g��#1	10053,{/* 59231 */
	cutin "dalle01",2;
	mes "[�ʎY�^�`���[���X�g��]";
	mes "�ǂ��Ŏ�ɓ��邩�͂킩��܂��񂪁c�c";
	next;
	mes "[�ʎY�^�`���[���X�g��]";
	mes "�`���[���X�g���p�[�c��10�ȏ�";
	mes "�W�߂��玝���Ă��Ă��������B";
	mes "^ff0000�p���[�h�u�[�c[0]^000000�@�܂���";
	mes "^ff0000�K�[�f�B�A���u�[�X�^�[[0]^000000";
	mes "�ƌ������܂���B";
	close2;
	cutin "dalle01",255;
	end;
OnInit:
	waitingroom "�p�[�c����",0; //59231
	end;
}

verus04.gat,71,106,5	script	�ʎY�^�`���[���X�g��#2	10053,{/* 59580 */
	cutin "dalle01",2;
	mes "[�ʎY�^�`���[���X�g��]";
	mes "���̓`���[���X�g���H�ꐻ�i��";
	mes "�\�͕t�^�Ə����������Ă��܂��B";
	mes "�ǂ����1��ɂ��A";
	mes "�`���[���X�g���p�[�c1��";
	mes "100,000Zeny���K�v�ł��B";
	mes "������p�ł����H";
	next;
	switch(select("�\�͕t�^","�\�͏�����","�ڂ����b�𕷂�")) {
	case 1:
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�K�v�A�C�e��������܂���B";
		mes "�`���[���X�g���p�[�c1��";
		mes "100,000Zeny���K�v�ł��B";
		close2;
		cutin "dalle01",255;
		end;
	case 2:
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�K�v�A�C�e��������܂���B";
		mes "�`���[���X�g���p�[�c1��";
		mes "100,000Zeny���K�v�ł��B";
		close2;
		cutin "dalle01",255;
		end;
	case 3:
		mes "[�ʎY�^�`���[���X�g��]";
		mes "����ł͐������܂��B";
		mes "�����ł�";
		mes "�p���[�h�����ƃK�[�f�B�A��������";
		mes "�G���`�����g��^FF00003�i�K^000000�܂�";
		mes "�s�����Ƃ��ł��܂��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "1�x��3�i�K�G���`�����g";
		mes "����̂ł͂Ȃ��A";
		mes "1�i�K���G���`�����g���Ă����܂��B";
		mes "^FF00001�i�K���ƂɃ`���[���X�g���p�[�c1��";
		mes "100,000Zeny���K�v�ɂȂ�܂��B^000000";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�G���`�����g�́A";
		mes "�Y���̑����A�C�e����";
		mes "����������Ԃōs���܂��̂ŁA";
		mes "�������Ă���b�������Ă��������B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�G���`�����g�̌��ʂ�";
		mes "���������邱�Ƃ��ł��܂��B";
		mes "���������`���[���X�g���p�[�c1��";
		mes "100,000Zeny���K�v�ɂȂ�܂��B";
		mes "�J�[�h���ʂƐ��B�l�ɂ��Ă�";
		mes "����������Ȃ��̂ł����S���������B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "���ɒ��ӎ����ɂ��Đ������܂��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "1�i�K�ڂ͉��̊댯���Ȃ�";
		mes "�G���`�����g�ł��܂����A";
		mes "2�i�K�ڂł̓G���`�����g�Ɏ��s��";
		mes "�G���`�����g���ʂ�";
		mes "���������Ă��܂��\��������܂��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "3�i�K�ڂɂ��Ă����s����";
		mes "���������Ă��܂��\��������A";
		mes "�����^FF0000�j�󂵂Ă��܂��\��^000000";
		mes "������܂��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�j�󂳂�Ă��܂����ꍇ�A";
		mes "���R���̑�����";
		mes "�����Ă��܂��܂��B";
		mes "2�i�K�ڈȍ~�̃G���`�����g��";
		mes "��ϓ���A�K����������";
		mes "�킯�ł͂Ȃ���ł��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�������A�������Ƃ΂���ł�";
		mes "����܂���B";
		mes "���̃G���`�����g�ł́A";
		mes "^FF0000���B�l�ƃJ�[�h���ʂ͎���ꂸ�A";
		mes "�ێ����邱�Ƃ��ł����ł��B^000000";
		mes "�������ł��傤�B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�ł́A���ɃG���`�����g��";
		mes "���ʂɂ��Đ������܂��B";
		mes "�G���`�����g�������ʂ�";
		mes "�����ɂ���ĈႢ�܂��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "��{�I�ɁA�J�e�S����";
		mes "���ʖ��ɌŒ�ł���A";
		mes "�I�����邱�Ƃ͂ł��܂���B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�������A�����i��";
		mes "^FF0000���B�l��9�ȏ�̏ꍇ�A^000000";
		mes "���̗͂ɂ��A�V�����\�͂�";
		mes "�I�����邱�Ƃ��o���܂��B";
		next;
		mes "[�ʎY�^�`���[���X�g��]";
		mes "�����͈ȏ�ł��B";
		mes "���񑕔�����ɓ����";
		mes "�G���`�����g�����Ă��������B";
		close2;
		cutin "dalle01",255;
		end;
	}
OnInit:
	waitingroom "�G���`�����g",0; //59580
	end;
}

verus04.gat,75,114,5	script	�`���[���X�g��#mcd	10054,{/* 59480 */
	cutin "nale01",0;
	if(checkquest(13184)) {
		{
			cutin "nale03.bmp", 0;
			mes "[�`���[���X�g��]";
			mes "�ς��Ȃ��ߋ���";
			mes "���ꂽ��������";
			mes "�s�����Ȗ�����";
			mes "���]���܂������H";
			mes "���߂�͈̂������ł͂���܂���B";
			next;
			if(select("������","��߂�") == 1) {
				mes "[�`���[���X�g��]";
				mes "���肪�Ƃ��B";
				mes "�Ō�܂Ŏ��͑����܂��B";
				mes "���{�b�g�̏h���ł��B";
				mes "���Ƃ��\�����Ȃ��Ă��c�c�B";
				close2;
				cutin "dalle01.bmp", 255;
				end;
			}
			mes "[�`���[���X�g��]";
			mes "�킩��܂����B";
			mes "���߂�̂�";
			mes "�����Ĉ������ł͂���܂���B";
			delquest 13184;
			close2;
			cutin "dalle01.bmp", 255;
			end;
		}
		if(checkquest(13184) & 0x8) {
			cutin "nale03.bmp", 0;
			mes "[�`���[���X�g��]";
			mes "���͑�������1���@��2���@��";
			mes "���̂��������ɐ��܂ꂽ";
			mes "�`���[���X�g���c�c�B";
			next;
			mes "[�`���[���X�g��]";
			mes "�v���o�������̋L����";
			mes "�����ėǂ��L���ł�";
			mes "����܂���ł����c�c�B";
			next;
			mes "[�`���[���X�g��]";
			mes "�ł����c�c";
			mes "�Ⴆ�ߋ���ς��邱�Ƃ��ł��Ȃ��Ă�";
			mes "���͂����ɂ��Ȃ���΂Ȃ�܂���B";
			mes "�������邱�ƂŁA��������";
			mes "���̐S��������܂�����B";
			next;
			mes "[�`���[���X�g��]";
			mes "���������`�����Ă�������";
			mes "�{���ɂ��肪�Ƃ��������܂����B";
			mes "�܂���낵�����肢���܂��B";
			setquest 13184;	// state=1
			delquest 13184;
			close2;
			cutin "dalle01.bmp", 255;
			end;
		}
		mes "[�`���[���X�g��]";
		mes "�����ɂ���@�B���u��";
		mes "���p���Ă��������B";
		mes "���ꂵ����Q�Ă�����������";
		mes "�ē��ɏ]���Ă��������B";
		close2;
		cutin "dalle01",255;
		end;
	}
	{
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��]";
		mes "�܂����Ă��ꂽ�̂ł��ˁB";
		mes "���̘b�𕷂��Ď��]���Ă��܂��񂩁H";
		mes "�ς��Ȃ��ߋ��ɐ�]���Ă��܂��񂩁H";
		mes "����ł������c�c";
		mes "��`���Ă���܂����H";
		next;
		if(select("���킵�܂�","������x�l���Ă݂�") == 2) {
			mes "[�`���[���X�g��]";
			mes "�킩��܂����B";
			mes "�����܂ŗ��Ă���Ă��肪�Ƃ��B";
			close2;
			cutin "nale01.bmp", 255;
			end;
		}
		mes "[�`���[���X�g��]";
		mes "���肪�Ƃ��A�`���҂̕��B";
		next;
		mes "[�`���[���X�g��]";
		mes "���̓��{�b�g�ł�����";
		mes "�^����ꂽ�d����";
		mes "�J��Ԃ��܂��B";
		next;
		mes "[�`���[���X�g��]";
		mes "�ǂ����A���̎��̋L����";
		mes "������x�����Ă��������B";
		mes "���ꂪ���ɗ^����ꂽ";
		mes "�d���Ȃ̂ł�����B";
		setquest 13184;	// state=1
		close2;
		cutin "dalle01.bmp", 255;
		end;
	}
	mes "[�`���[���X�g��]";
	mes "����ɂ��́B";
	mes "���͎����^�l�H�m�\������";
	mes "�`���[���X�g���ł��B";
	next;
	cutin "nale03",0;
	mes "[�`���[���X�g��]";
	mes "���͂ǂ����炱���ɗ����̂�";
	mes "�ǂ�قǂ̎��Ԃ����ɂ���̂�";
	mes "�S���L��������܂���B";
	next;
	mes "[�`���[���X�g��]";
	mes "�o���Ă���̂�";
	mes "���̓��͌��ł���";
	mes "�����ێ����u���~�܂��Ă���";
	mes "���Ȃ�̎��Ԃ��߂����Ƃ���";
	mes "���������ł��B";
	next;
	mes "[�`���[���X�g��]";
	mes "���͌�����~�����̂�";
	mes "�Ȃ�������^ff0000��^000000������";
	mes "��������ɍ쓮���Ă��܂��B";
	next;
	mes "[�`���[���X�g��]";
	mes "�V�������V�[�B�܂��ɔޏ��ł����B";
	mes "����Ȏ���^ff0000���̎�^000000�̋L�������鎖���ł���";
	mes "���u�̔����J���Ă��ꂽ�̂́B";
	next;
	mes "[�`���[���X�g��]";
	mes "�ǂ�Ȃ��Ƃ����Ă�";
	mes "���̓��̏o������h���̂�";
	mes "�o���Ȃ���������܂���B";
	next;
	mes "[�`���[���X�g��]";
	mes "�ł��c�c�B";
	next;
	mes "[�`���[���X�g��]";
	mes "���͋L�����v���o�������B";
	mes "�ǂ�ȉߋ��������Ƃ��Ă�";
	mes "�������҂Ȃ̂��c�c";
	mes "���̎��A�����N�������̂��B";
	mes "�m�肽����ł��B";
	next;
	mes "[�`���[���X�g��]";
	mes "���肢���܂��B";
	mes "���Ɏc���ꂽ�ߋ��̋L���ɁB";
	mes "���s���Ă���܂��񂩁H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�`���[���X�g��]";
		mes "�����ł����B";
		mes "�����������Ă��݂܂���ł����B";
		close2;
		cutin "dalle01",255;
		end;
	}
	mes "[�`���[���X�g��]";
	mes "���肪�Ƃ��������܂��B";
	next;
	mes "[�`���[���X�g��]";
	mes "�����ɂ���@�B���u��";
	mes "���p���Ă��������B";
	mes "���ꂵ����Q�Ă�����������";
	mes "�ē��ɏ]���Ă��������B";
	setquest 13184;
	close2;
	cutin "dalle01",255;
	end;
OnInit:
	waitingroom "�`���[���X�g���H��",0; //59480
	end;
}
verus04.gat,70,113,5	script	�@�B���u#mcd	10007,{/* 59229 */
	if(!checkquest(13184)) {
		mes "[�@�B���u]";
		mes "�s�s�s�A���F�G���[�B";
		mes "�@";
		mes "�]^ff0000���p����ɂ�";
		mes "�@�`���[���X�g���̏��F���K�v�ł��]^000000";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[�@�B���u]";
		mes "�s�s�s�A�V�X�e���G���[�B";
		mes "�@";
		mes "�]^ff00001�l�ȏ�̃p�[�e�B�[��Ґ����邩";
		mes "�@�p�[�e�B�[�ɉ������Ă��������]^000000";
		close;
	}
	if(checkquest(13185)) {	//TODO
		if(checkquest(13185)&2) {
			mes "[�@�B���u]";
			mes "�s�s�s�A^0000ff�ē���\^000000�I";
			mes "�@";
			mes "�]�������������܂��]";
			delquest 13185;
			delquest 118245;
			delquest 96452;
			close;
		}
		mes "[�@�B���u]";
		mes "�s�s�s�A�ē���G���[�B";
		mes "�@";
		mes "�]^ff0000���̌ߑO5���ȍ~�ɓ���\�ł��B^000000";
		mes "�@�A���A�Ō�̓�������Ă���";
		mes "�@^ff00001���Ԍo�ߌ�ɗ��p�\�ł�^000000�]";
		close;
	}
	mes "[�@�B���u]";
	mes "�s�s�s�B";
	if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@str$,"�����̔����J��";
	next;
	switch(select('@str$,"������H��ɓ���","��߂�")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�p�[�e�B�[���F" +'@party$;
			mes "�p�[�e�B�[���[�_�[���F" +'@leader$;
			mes "^0000ffcharleston ^000000-�\�񎸔s";
			close;
		}
		mdcreate "charleston";
		mes "�]^ff0000�ړ��̏��������܂��B";
		mes "�@���̂܂܂��҂����������]^000000";
		close;
	case 2:
		switch(mdenter("charleston")) {
		case 0:	// �G���[�Ȃ�
			setquest 13185;
			setquest 118245;
			setquest 96452;
			if(checkquest(118235))
				delquest 118235;
			if(checkquest(118240))
				delquest 118240;
			misceffect 316,""; //self
			misceffect 317,""; //self
			announce "�������A���_���W����[charleston] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			//warp "1@mcd.gat",127,282;
			end;
		case 1:	// �p�[�e�B�[������
			mes "�]^ff0000�p�[�e�B�[�����o�[�̂�";
			mes "�@���ꂷ�邱�Ƃ��ł��܂�^000000�]";
			close;
		case 2:	// �_���W�������쐬
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				mes "�]^ff0000��Ɏ����̔���";
				mes "�@�J���Ă�������^000000�]";
			}
			else {
				mes "�]^ff0000�p�[�e�B�[���[�_�[��";
				mes "�@�����̔����J���Ă��܂���^000000�]";
			}
			close;
		default:	// ���̑��G���[
			close;
		}
	case 3:
		mes "�]���̏����ɂ����]";
		close;
	}
OnInit:
	waitingroom "�H�����",0; //59229
	end;
}

1@mcd.gat,127,277,0	script	keepout#1	45,1,1,{/* 64596 (hide)*/}
1@mcd.gat,127,277,4	script	�`���[���X�g��1��#0	10053,3,2,{/* 58967 */
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�����c�c�������Ȃ��Ɓc�c�B";
	emotion 19,"�`���[���X�g��1��#0_0ou";	// 9666
	close2;
	cutin "dalle01.bmp", 255;
	end;
OnTouch:
	viewpoint 1, 23, 275, 1, 0x00FF00; //64770
	cutin "dalle03.bmp", 2;
	{
		mes "�]�ǂ����悤���H�]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
			mes "[�`���[���X�g��1��]";
			mes "�H����̖k���ɂ��錤������";
			mes "���F���m������͂��ł��I";
			mes "���m�ɉ����";
			mes "�ڂ����b�𕷂����Ƃɂ��܂��傤�I";
			mes "�����I�@�}���ł��������I";
			unittalk "�`���[���X�g��1�� : ���m�ɉ���ďڂ����b�𕷂����Ƃɂ��܂��傤�I�@�����I�@�}���ł��������I";	// 68753
			close2;
			cutin "dalle01.bmp", 255;
			hideonnpc "�`���[���X�g��1��#0";	// 68753
			end;
		}
	}
	mes "[�`���[���X�g��1��]";
	mes "�������c�c�ߋ��̋L���c�c�B";
	unittalk "�`���[���X�g��1�� : �������c�c�ߋ��̋L���c�c�B";
	next;
	mes "[�`���[���X�g��1��]";
	mes "���̑̂́c�c�B";
	mes "�����A�v���o���Ă��܂����B";
	unittalk "�`���[���X�g��1�� : ���̑̂́c�c�B�����A�v���o���Ă��܂����B";
	next;
	mes "[�`���[���X�g��1��]";
	mes "���̎��A�`���[���X�g���H���";
	mes "���x���錾�����߂���Ă��āA";
	mes "�ۈ����u���쓮���Ă��܂��B";
	unittalk "�`���[���X�g��1�� : ���̎��A���̃`���[���X�g���H��͔��x���錾�����߂���Ă��āA�ۈ����u���쓮���Ă��܂��B";
	next;
	mes "[�`���[���X�g��1��]";
	mes "�����̒ʘH��";
	mes "�쓮�����ۈ����u������܂��̂ŁA";
	mes "�j�󂵂Ȃ��玟�̋���";
	mes "�i��ł��������B";
	unittalk "�`���[���X�g��1�� : �����̒ʘH�ɍ쓮�����ۈ����u������܂��̂ŁA�j�󂵂Ȃ��玟�̋��ɐi��ł��������B";
	emotion 19, "�`���[���X�g��1��#0"; //64770
	next;
	mes "[�`���[���X�g��1��]";
	mes "�H����̖k���ɂ��錤������";
	mes "���F���m������͂��ł��I";
	mes "���m�ɉ����";
	mes "�ڂ����b�𕷂����Ƃɂ��܂��傤�I";
	unittalk "�`���[���X�g��1�� : �H����̖k���ɂ��錤�����Ƀ��F���m������͂��ł��I�@���m�ɉ���ďڂ����b�𕷂����Ƃɂ��܂��傤�I";
	next;
	mes "[�`���[���X�g��1��]";
	mes "�������������L���c�c�B";
	mes "�K�����ׂĂ��v���o���Ă݂��܂��I";
	mes "����ł́A�s���܂��傤�I";
	unittalk "�`���[���X�g��1�� : �������������L���c�c�B�K�����ׂĂ��v���o���Ă݂��܂��I�@����ł́A�s���܂��傤�I";
	emotion 19, "�`���[���X�g��1��#0"; //64770
	hideonnpc "�`���[���X�g��1��#0"; //64770
	close2;
	cutin "dalle01.bmp", 255;
	end;
}

1@mcd.gat,137,196,5	script	�V�������V�[#1	10041,{/* 59178 */
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c";
	next;
	switch(select("��b������","���������߂�","���̏ꏊ�ɋA��")) {
	case 1:
		if(CHARLESTON_1QUE == 5) {
			mes "[�V�������V�[]";
			mes "2���@�c�c����ɂ��ĔY��ł��B";
			mes "�����A����m�肽�������B";
			next;
			mes "[�V�������V�[]";
			mes "������c�c�����b����������";
			mes "�����J�����c�c�B";
		}
		else if(CHARLESTON_1QUE == 8) {
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "2���@�������čs�����B";
			mes "�����������́H";
			next;
			mes "[�V�������V�[]";
			mes "�����c�c�B";
			mes "2���@�̋C�����c�c";
			mes "�܂��A�悭�킩��Ȃ��c�c�B";
		}
		else {
			{	// �W�^�o�O�N���A
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes strcharinfo(0)+"�c�c�B";
				mes "���Ă��ꂽ�́H";
				next;
				cutin "shaloshi01.bmp", 2;
				mes "[�V�������V�[]";
				mes "�j���I�[�Y������";
				mes "���҂��Ă��邩��";
				mes "�߂��ɋ���Ǝv���c�c�B";
				next;
				mes "[�V�������V�[]";
				mes "�c�c�B";
				next;
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "���̈����̒���";
				mes strcharinfo(0)+"��";
				mes "�撣���Ă���Ȃ�������";
				mes "���͍����Ƃ肾�����Ǝv���B";
				next;
				cutin "shaloshi01.bmp", 2;
				mes "[�V�������V�[]";
				mes "�c�c���肪�Ƃ��B";
				close2;
				cutin "shaloshi01.bmp", 255;
				end;
			}
			mes "[�V�������V�[]";
			mes "���Ȃ��́c�c�B";
			next;
			mes "[�V�������V�[]";
			mes "�����c�c�B";
			mes "���������J���������Łc�c�B";
			mes "���߂�Ȃ����B";
		}
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 2:
		if(CHARLESTON_1QUE <= 5) {
			viewpoint 1, 84, 226, 1, 0xFF00FF00; //59178
			viewpoint 1, 126, 84, 2, 0xFF00FF00; //59178
			viewpoint 1, 111, 68, 3, 0xFF00FF00; //59178
			viewpoint 1, 210, 181, 4, 0xFF00FF00; //59178
			viewpoint 1, 183, 192, 5, 0xFF00FF00; //59178
			viewpoint 1, 130, 124, 6, 0xFF00FF00; //59178
			viewpoint 1, 54, 108, 7, 0xFF00FF00; //59178
			mes "[�V�������V�[]";
			mes "�T�����c�c�H";
			mes "����Ȃ�A������T���Ɨǂ��Ǝv���B";
			close2;
			cutin "shaloshi01.bmp", 255;
			end;
		}
		else if(CHARLESTON_1QUE <= 7) {
			viewpoint 1, 86, 231, 8, 0xFF00FF00; //59178
			viewpoint 1, 172, 196, 9, 0xFF00FF00; //59178
			viewpoint 1, 126, 84, 10, 0xFF00FF00; //59178
			mes "[�V�������V�[]";
			mes "�T�����c�c�H";
			mes "����Ȃ�A������T���Ɨǂ��Ǝv���B";
		}
		mes "[�V�������V�[]";
		mes "�y�����ꏏ�ɗ����̂�";
		mes "���Ȃ��Ȃ��Ă�c�c�B";
		mes "�ǂ��ɍs�����̂��ȁB";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 3:
		{
			mes "[�V�������V�[]";
			mes "�c�c�����~�܂����B";
			mes strcharinfo(0)+"��";
			mes "�������I���݂����B";
			next;
			mes "[�V�������V�[]";
			mes "�A�肽���Ȃ�";
			mes "���̏ꏊ�ɑ����Ă�����B";
			mes "�ǂ�����H";
			next;
			if(select("�߂�","�����Ɏc��") == 2) {
				//������
			}
			mes "[�V�������V�[]";
			mes "���\�y�������������B";
			mes "�j���I�[�Y�ƈꏏ�Ȃ�";
			mes "�܂���邩���m��Ȃ��B";
			next;
			mes "[�V�������V�[]";
			mes "�����܂����̉���";
			mes "�T���ɍs���B";
			next;
			mes "[�V�������V�[]";
			mes "���Ɓc�c";
			mes "����A�󂯎���ė~�����B";
			mes "���f���������l�сc�c�B";
			mes "�����Ɓc�c���ɗ��Ǝv���B";
			next;
			mes "[�V�������V�[]";
			mes strcharinfo(0)+"��";
			mes "�v���Ԃ�ɉ�Ċ����������B";
			mes "�΂��΂��A�܂��ˁB";
			cutin "shaloshi04.bmp", 2;
			next;
			mes "�]�ʂ�ۂɃV�������V�[��";
			mes "�@�A�C�e���������o���Ă����B";
			mes "�@�ǂ�����󂯎�낤���H�]";
			next;
			switch(select("�����l����","�Âт��R���^���N","�`���[���X�g���p�[�c")) {
			case 1:
			case 2:
				set '@gain,6962;
				set '@num,3;
				break;
			case 3:
			}
			delquest 96452;
			getitem '@gain,'@num;
			getexp 1000000,0,1;
			getexp 500000,0,1;
			delquest 13184;
			cutin "shaloshi01.bmp", 255;
			warp "verus04.gat", 77, 123;	// from: 0ff1@mcd.gat(135, 203) port : 5129
			end;
		}
		mes "[�V�������V�[]";
		mes "���c�c�܂��~��łȂ��B";
		mes "�`���[���X�g���̋L����";
		mes "�܂������Ă���c�c�B";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@mcd.gat,1,1,0	script	CharlestonControl1	139,{
OnStart:
OnSpawn1:
	//@spawn(type: BL_MOB, ID: 24185, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(24, 275), dir: 0, name: "�ʘH�ۈ����u1��")
OnKilled1:
	announce "�`���[���X�g��1�� : ��1�Q�[�g�̕ۈ����u����������܂����I�@���͓쐼���̕ۈ����u��j�󂵂ĉ������B", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "1gate#mcd";
	hideoffnpc "guide#mcd1"; //78695
OnSpawn2:
	//@spawn(type: BL_MOB, ID: 29784, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(33, 59), dir: 0, name: "�ʘH�ۈ����u2��")
OnKilled2:
	announce "�`���[���X�g��1�� : ��2�Q�[�g�̕ۈ����u����������܂����I�@�쓌���̕ۈ����u�Ɉړ����ĉ������B", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "2gate#mcd";
	hideoffnpc "guide#mcd3"; //78697
OnSpawn3:
	//@spawn(type: BL_MOB, ID: 35482, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(239, 30), dir: 0, name: "�ʘH�ۈ����u3��")
OnKilled3:
	announce "�`���[���X�g��1�� : ��3�Q�[�g�̕ۈ����u����������܂����I�@�����̕ۈ����u�Ɉړ����ĉ������B", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "3gate#mcd";
	hideoffnpc "guide#mcd5"; //78697
OnSpawn4:
	//@spawn(type: BL_MOB, ID: 10994, speed: 200, option: 0, view: 3127, pos: "1@mcd.gat"(281, 183), dir: 0, name: "�ʘH�ۈ����u4��")
OnKilled4:
	announce "�`���[���X�g��1�� : ��4�Q�[�g�̕ۈ����u����������܂����I�@����3���C���̌������܂ŗ��ĉ������I", 0x1, 0xffff00, 0x190, 12, 0, 0;
	hideoffnpc "4gate#mcd";
	hideoffnpc "guide#mcd7"; //78697
}

1@mcd.gat,44,211,0	script	1gate#mcd	45,3,3,{/* 59183 */
	warp "1@mcd.gat",41,200;
	end;
}
1@mcd.gat,23,275,0	script	guide#mcd1	139,20,20,{/* 59184 (hide)*/
	viewpoint 2, 23, 275, 1, 0xFF00FF00; //78695
	viewpoint 1, 44, 211, 1, 0xFF00FF00; //78695
}
1@mcd.gat,41,200,0	script	guide#mcd2	139,3,3,{/* 59185 */
	viewpoint 2, 44, 211, 1, 0xFF00FF00; //78696
	viewpoint 1, 33, 60, 1, 0xFF00FF00; //78696
}
1@mcd.gat,33,59,0	script	guide#mcd3	139,20,20,{/* 59186 (hide)*/
	viewpoint 2, 33, 60, 1, 0xFF00FF00; //78697
	viewpoint 1, 58, 72, 1, 0xFF00FF00; //78697
}
1@mcd.gat,58,72,0	script	2gate#mcd	45,3,3,{/* 59187 (hide)*/
	warp "1@mcd.gat",65,66;
	end;
}
1@mcd.gat,65,66,0	script	guide#mcd4	139,2,2,{/* 59188 */
	viewpoint 2, 58, 72, 1, 0xFF00FF00; //78699
	viewpoint 1, 239, 29, 1, 0xFF00FF00; //78699
}
1@mcd.gat,239,30,0	script	guide#mcd5	139,20,20,{/* 59189 (hide)*/
	viewpoint 2, 239, 29, 1, 0xFF00FF00; //78700
	viewpoint 1, 104, 50, 1, 0xFF00FF00; //78700
}
1@mcd.gat,104,50,0	script	3gate#mcd	45,3,3,{/* 59190 (hide)*/
	warp "1@mcd.gat",115,50;
	end;
}
1@mcd.gat,117,50,0	script	guide#mcd6	139,2,2,{/* 59191 */
	viewpoint 2, 104, 50, 1, 0xFF00FF00; //79943
	viewpoint 1, 282, 183, 1, 0xFF00FF00; //79943
}
1@mcd.gat,281,183,0	script	guide#mcd7	139,20,20,{/* 59192 (hide)*/
	viewpoint 2, 282, 183, 1, 0xFF00FF00; //79944
	viewpoint 1, 218, 211, 1, 0xFF00FF00; //79944
}
1@mcd.gat,218,211,0	script	4gate#mcd	45,3,3,{/* 59193 (hide)*/
	warp "1@mcd.gat",210,217;
	end;
}
1@mcd.gat,208,217,0	script	guide#mcd8	139,2,2,{/* 59194 */
	viewpoint 2, 218, 211, 1, 0xFF00FF00; //79946
	viewpoint 1, 211, 195, 1, 0xFF00FF00; //79946
}
1@mcd.gat,211,195,0	script	5gate#mcd	45,3,3,{/* 59195 */
	warp "1@mcd.gat",211,180;
	end;
}
1@mcd.gat,212,180,0	script	guide#mcd9	139,2,2,{/* 59196 */
	viewpoint 2, 211, 195, 1, 0xFF00FF00; //79948
	viewpoint 1, 141, 199, 1, 0xFF00FF00; //79948
}
1@mcd.gat,141,199,0	warp	6gate#mcd	2,2,1@mcd.gat,141,207	//59197 from_pos=(141, 199)
1@mcd.gat,142,203,0	warp	7gate#mcd	2,2,1@mcd.gat,136,200	//59198 from_pos=(140, 205)
1@mcd.gat,130,127,0	warp	8gate#mcd	2,2,1@mcd.gat,129,143	//59199 from_pos=(130, 126)
1@mcd.gat,127,262,0	script	mob#mcd1	139,5,5,{/* 59200 */
	hideonnpc "mob#mcd1";
	//@spawn(type: BL_MOB, ID: 27430, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(111, 254), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 30504, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(109, 251), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 22265, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(108, 251), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,67,234,0	script	mob#mcd2	139,5,5,{/* 59201 */
	//@spawn(type: BL_MOB, ID: 93356, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",52,228), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 25154, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",50,228), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 18137, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",50,229), dir: 0, name"�ۈ����{�b�g")
}
1@mcd.gat,33,192,0	script	mob#mcd3	139,5,5,{/* 59202 */
	hideonnpc "mob#mcd3"; //79954
	//@spawn(type: BL_MOB, ID: 27253, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(22, 167), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 27201, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(26, 164), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 27186, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(25, 163), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,75,59,0	script	mob#mcd4	139,5,5,{/* 59203 */
	hideonnpc "mob#mcd4"; //79955
	//@spawn(type: BL_MOB, ID: 21437, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(89, 47), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 17058, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(94, 48), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 17348, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(94, 52), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 35791, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(98, 53), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,109,33,0	script	mob#mcd5	139,5,5,{/* 59204 */
	hideonnpc "mob#mcd5"; //79956
	//@spawn(type: BL_MOB, ID: 24535, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(126, 27), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 29116, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(129, 25), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 29448, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(243, 27), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 30419, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(240, 35), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 35269, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(245, 29), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 35745, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(247, 20), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,133,49,0	script	mob#mcd6	139,5,5,{/* 59205 */
	hideonnpc "mob#mcd6"; //79957
	//@spawn(type: BL_MOB, ID: 23347, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(165, 52), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 23953, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(163, 55), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 24644, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(165, 53), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 22786, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(167, 52), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 23937, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(168, 53), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,204,74,0	script	mob#mcd7	139,5,5,{/* 59206 */
	hideonnpc "mob#mcd7"; //79958
	//@spawn(type: BL_MOB, ID: 33319, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(223, 134), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 32473, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(218, 136), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 27527, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(230, 149), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 25574, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(222, 149), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 27691, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(230, 149), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 19743, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(233, 149), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 26983, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(236, 182), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 32635, speed: 100, option: 0, view: 3125, pos: "1@mcd.gat"(231, 192), dir: 0, name: "�X�e�b�v")
	//@spawn(type: BL_MOB, ID: 37526, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(230, 199), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 37545, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(228, 199), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,204,224,0	script	mob#mcd8	139,5,5,{/* 59207 */
	hideonnpc "mob#mcd8"; //79959
	//@spawn(type: BL_MOB, ID: 14545, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(128, 232), dir: 2, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 39664, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(133, 232), dir: 4, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 33489, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(127, 239), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 33772, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(200, 199), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 33832, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(205, 200), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 33613, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(0, 0), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,157,61,0	script	mob#mcd9	139,5,5,{/* 59208 */
	hideonnpc "mob#mcd9"; //79960
	//@spawn(type: BL_MOB, ID: 45440, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(134, 69), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 47100, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(132, 68), dir: 0, name: "�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 37776, speed: 200, option: 0, view: 3128, pos: "1@mcd.gat"(132, 69), dir: 0, name: "�ۈ����{�b�g")
}
1@mcd.gat,175,147,0	script	mob#mcd10	139,5,5,{/* 59209 */
	hideonnpc "mob#mcd10";	// 79679
	//@spawn(type: BL_MOB, ID: 98344, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",127,112), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 98561, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",124,109), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 20262, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",93,118), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 1789, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",96,120), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 66303, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",95,123), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 99868, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",86,149), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 4393, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",84,151), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 7858, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",80,150), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 4919, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",80,154), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 5969, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",84,156), dir: 0, name"�ۈ����{�b�g")
	//@spawn(type: BL_MOB, ID: 4244, speed: 200, option: 0x0, class: 3128, pos: ("0ou1@mcd.gat",81,154), dir: 0, name"�ۈ����{�b�g")
}

1@mcd.gat,120,224,5	script	�`���[���X�g��2��#0	10054,{/* 58968 */
	cutin "nale04.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "�E�B�[�c�c�E�B�c�c�E�B�[��";
	emotion 53, "�`���[���X�g��2��#0"; //58968
	next;
	mes "�]�̏ᒆ���낤���c�c�]";
	close2;
	cutin "nale01.bmp", 255;
	end;
}
1@mcd.gat,116,213,5	script	���F���m#1	923,{/* 58969 */
	switch(CHARLESTON_1QUE) {
	case 0:
		mes "�]������X�g�[���[��i�s�����";
		mes "�@^ff0000�_���W�����̓���������^000000����";
		mes "�@�ォ����ꂵ���p�[�e�B�[�����o�[��";
		mes "�@^ff0000�����I�ɊO�֓]��^000000����܂��B";
		mes "�@�܂��A���Ԑ������t�^����܂��̂�";
		mes "�@�p�[�e�B�[�����o�[����������Ԃ�";
		mes "�@�X�g�[���[��i�s���Ă��������]";
		next;
		if(select("�X�g�[���[��i�s����","�p�[�e�B�[�����o�[��҂�") == 2) {
			mes "�]�p�[�e�B�[�����o�[��";
			mes "�@�҂��Ƃɂ����B";
			mes "�@�S����������Ԃ�";
			mes "�@������x�b�������悤�]";
			close;
		}
		setpartyinmap CHARLESTON_1QUE,1;
		{
			mes "�]�ǂ����悤���H�]";
			next;
			if(select("����}��","�b�𕷂�") == 1) {
				cutin "dalle01.bmp", 2;
				mes "[�`���[���X�g��1��]";
				mes "���肪�Ƃ��������܂��I";
				mes "���������𐮗����܂��B";
				mes "������x���������Ă��������B";
				unittalk getnpcid(0,"�`���[���X�g��1��#1"),"�`���[���X�g��1�� : ���肪�Ƃ��������܂��I�@���������𐮗����܂��B������x���������Ă��������B";	// 69657
				close2;
				cutin "dalle01.bmp", 255;
				emotion 2,"�`���[���X�g��1��#1";	// 69657
				setpartyinmap CHARLESTON_1QUE,3;
				end;
			}
		}
	case 1:
		mes "[���F���m]";
		mes "������1���@��B";
		mes "���A2���@�ƃ��C���V�X�e����";
		mes "�����I�Ƀ����N���Ă���";
		mes "���䂪�ł��Ȃ��悤���c�c�B";
		next;
		cutin "dalle02.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�G�l���M�[���؂���";
		mes "���̂����~�܂�̂ł́H";
		next;
		cutin "dalle01.bmp", 255;
		mes "[���F���m]";
		mes "���ꂪ�c�c";
		mes "�G�l���M�[�𒍓������΂����";
		mes "1�������͂��v�Z���B";
		mes "���̂܂܂ł�";
		mes "�H��͂��ׂĔj�󂳂�Ă��܂��B";
		next;
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�Ȃ�قǁc�c�B";
		mes "�ł����S���Ă��������B";
		mes "�������ɐ��Ƃ�";
		mes "�A��ė��܂����B";
		next;
		menu "���b!?",-;
		unittalk getcharid(3),strcharinfo(0)+" : ���b!?";
		mes "[�`���[���X�g��1��]";
		mes "�`���җl�B";
		mes "�V�������V�[�l�́A";
		mes "�����Ǝ����̒m�荇����";
		mes "�������Ă�����";
		mes "�����Ă��܂����B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "�Ď��V�X�e���Œ��ׂ��Ƃ���A";
		mes "^0000ff�j���I�[�Y^000000�Ƃ�������";
		mes "���Ԃ̕������Ă���悤�ł����A";
		mes "����A�w�ǖ��ɗ����Ă��܂���B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "������낵����΁c�c";
		mes "���̖��A��`���Ē����܂����H";
		next;
		if(select("���͂��܂��I","�֌W�Ȃ��ł�") == 2) {
			mes "[�`���[���X�g��1��]";
			mes "�����ł����c�c�B";
			mes "�ł͑��̕�����������܂�";
			mes "�҂��Ă݂邱�Ƃɂ��܂��B";
			setpartyinmap CHARLESTON_1QUE,2;
			close2;
			cutin "dalle01.bmp", 255;
			end;
		}
		unittalk getcharid(3),strcharinfo(0)+" : ���͂��܂��I";
		mes "[�`���[���X�g��1��]";
		mes "���肪�Ƃ��������܂��I";
		mes "���������𐮗����܂��B";
		mes "������x���������Ă��������B";
		unittalk "�`���[���X�g��1�� : ���肪�Ƃ��������܂��I�@���������𐮗����܂��B������x���������Ă��������B";
		emotion 2, "�`���[���X�g��1��#1"; //80282
		setpartyinmap CHARLESTON_1QUE,3;
		close2;
		cutin "dalle01.bmp", 255;
		end;
	case 2:
		mes "[���F���m]";
		mes "�����ȂƂ��날�Ȃ�����";
		mes "�N�Ȃ̂��͂���Ȃɏd�v�ł͂Ȃ��B";
		next;
		mes "[���F���m]";
		mes "���ɋ��͂��Ă����̂��ǂ���";
		mes "���ꂪ�d�v�Ȃ񂾁B";
		mes "���肢�o���Ȃ����낤���H";
		next;
		if(select("���͂��܂��I","���ɗp������܂�") == 2) {
			mes "[���F���m]";
			mes "�������c�c�B�ӂ��B";
			mes "�N�ł��������狦�͂��Ăق����B";
			mes "���̂܂܂��Ɩ{���Ɂc�c�B";
			close;
		}
		mes "[���F���m]";
		mes "�������I�@���肪�Ƃ��I";
		mes "2���@�̏C���ɉ����K�v�Ȃ̂��A";
		mes "1���@�������Ă����͂����B";
		mes "�b�������Ă݂Ă���B";
		setpartyinmap CHARLESTON_1QUE,3;
		close;
	}
}

1@mcd.gat,121,217,4	script	�`���[���X�g��1��#1	10053,{/* 58971 */
	if(CHARLESTON_1QUE < 3) {
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "���̓��{�b�g�ł��B";
		mes "�����܂������H";
		close2;
		cutin "dalle01.bmp", 255;
		end;
	}
	else if(CHARLESTON_1QUE == 3) {
		{
			mes "�]�ǂ����悤���H�]";
			next;
			if(select("����}��","�b�𕷂�") == 1) {
				mes "�]�V�X�e���̖\����}����";
				mes "�@��`�������܂����H�]";
				while(1) {
					next;
					switch(select("�����l����","�f��i^0000ff���ԕ�V�Ȃ�^000000�j","��`���i^ff0000���ԕ�V����^000000�j")) {
					case 1:
						mes "�]���Ȃ��͂ǂ����邩�l�����]";
						continue;
					case 2:
						cutin "dalle01.bmp", 2;
						mes "[�`���[���X�g��1��]";
						mes "�����ł����c�c�B";
						mes "����ł́A�����V�X�e����";
						mes "�ĉғ����s�Ȃ��܂��B";
						mes "��Ƃ����܂��̂�";
						mes "������x�b�������ĉ������B";
						unittalk "�`���[���X�g��1�� : �����ł����c�c�B����ł́A�����V�X�e���̍ĉғ����s�Ȃ��܂��B��Ƃ����܂��̂ł�����x�b�������ĉ������B";	// 69657
						close2;
						cutin "dalle01.bmp", 255;
						setpartyinmap CHARLESTON_1QUE,5;
						hideonnpc "�`���[���X�g��1��#1";	// 69657
						hideoffnpc "�`���[���X�g��1��#2";	// 84864
						hideonnpc "�`���[���X�g��1��#1";	// 69657
						end;
					case 3:
						//todo
				}
			}
		}
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�`���[���X�g���H��̓����ɂ�";
		mes "�����̃i�m�X�e�b�v�����݂��܂��B";
		mes "�i�m�X�e�b�v�ƌ����̂�";
		mes "�`���[���X�g���̎v�l���i��";
		mes "���߂���������AI�`�b�v�ł��B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "�܂��A�`���[���X�g��2���@�͖����A";
		mes "�������ɂ��郁�C���V�X�e������";
		mes "���̃A�b�v�f�[�g�����Ă��܂��B";
		mes "����_���ƌĂ�ł��܂��B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "�ł����c�c";
		mes "���̃V�X�e�������Ă��܂�����ł��B";
		mes "���m�Ȍ����͕�����܂��񂪁A";
		mes "���C���V�X�e����2���@���q��������";
		mes "������肪�N�����悤�ł��B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "���̂Ƃ���A2���@��";
		mes "���͖����悤�ł����A";
		mes "���̂܂܂ł͉����N���邩";
		mes "�킩��܂���B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "��낵����΁A";
		mes "�V�X�e���̖\����}����";
		mes "����`�������Ē����܂��񂩁H";
		next;
		mes "[�`���[���X�g��1��]";
		mes "����`�����Ē����Ȃ��ꍇ��";
		mes "���X�s���͂���܂���";
		mes "���̕��ŋ����I��";
		mes "�V�X�e���̍ĉғ������Ă݂܂��B";
		next;
		//select("�����l����:�f��i^0000ff���ԕ�V�Ȃ�^000000�j:��`���i^ff0000���ԕ�V����^000000�j")
		mes "�]���Ȃ��͂ǂ����邩�l�����]";
		next;
		//select("�����l����:�f��i^0000ff���ԕ�V�Ȃ�^000000�j:��`���i^ff0000���ԕ�V����^000000�j")
		mes "[�`���[���X�g��1��]";
		mes "�{���ł���!?";
		mes "���肪�Ƃ��������܂��I";
		mes "����ł́A����`������";
		mes "���e�����������܂��B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "���}���\�����Ă��܂��Ă���";
		mes "�X�e�b�v�ƃ��b�N�X�e�b�v��";
		mes "�����ЂÂ����ق����ǂ������ł��B";
		mes "^ff0000���b�N�X�e�b�v��3�C^000000";
		mes "�ގ����ĉ������B";
		mes "�o���\�z�ʒu�����`�����܂��B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "�܂��̓V�X�e���̍ĉғ����ŗD��Ȃ̂�";
		mes "�|�����͍ŏ����ō\���܂���B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "����ł́c�c";
		mes "��낵�����肢���܂��B";
		mes "�ǂ����A���C�����āB";
		emotion 2, "�`���[���X�g��1��#1"; //58971
		close2;
		setpartyinmap CHARLESTON_1QUE,4;
		viewpoint 1, 84, 226, 1, 0x00FF00; //58971
		viewpoint 1, 126, 84, 2, 0x00FF00; //58971
		viewpoint 1, 111, 68, 3, 0x00FF00; //58971
		viewpoint 1, 210, 181, 4, 0x00FF00; //58971
		viewpoint 1, 183, 192, 5, 0x00FF00; //58971
		viewpoint 1, 130, 124, 6, 0x00FF00; //58971
		viewpoint 1, 54, 108, 7, 0x00FF00; //58971
		cutin "dalle01.bmp", 255;
		end;
	}
	else if(CHARLESTON_1QUE == 4) {
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�H���䖳���ɂ��Ă���";
		mes "�X�e�b�v�ƃ��b�N�X�e�b�v��";
		mes "�r������K�v������܂��B";
		mes "���b�N�X�e�b�v��3�C�ގ����ĉ������B";
		mes "�o���\�z�ʒu�����`�����܂��B";
		viewpoint 1, 84, 226, 1, 0xFF00FF00; //58971
		viewpoint 1, 126, 84, 2, 0xFF00FF00; //58971
		viewpoint 1, 111, 68, 3, 0xFF00FF00; //58971
		viewpoint 1, 210, 181, 4, 0xFF00FF00; //58971
		viewpoint 1, 183, 192, 5, 0xFF00FF00; //58971
		viewpoint 1, 130, 124, 6, 0xFF00FF00; //58971
		viewpoint 1, 54, 108, 7, 0xFF00FF00; //58971
		close2;
		cutin "dalle01.bmp", 255;
		end;
		//announce "�`���[���X�g��1�� : ���[�A���[�A�}�C�N�e�X�g�B", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "�`���[���X�g��1�� : ���b�N�X�e�b�v�̊�����~���m�F���܂����B�B", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "�`���[���X�g��1�� : ���m�̌������ɖ߂��ė��Ă��������I", 0x1, 0xffff00, 0x190, 12, 0, 0;
	}
}
1@mcd.gat,124,223,4	script	��#2	10005,{/* 58972 (hide)*/
	if(checkquest(118235)) {
		mes "�]���ɂ���͎󂯎��ς݂��]";
		close;
	}
	mes "�]��������B";
	mes "�@�ǂ����悤���H�]";
	next;
	if(select("�J����","��߂Ă���") == 2) {
		mes "�]���̏�𗣂ꂽ�]";
		close;
	}
	while(1) {
		mes "�]���ɂ��镨�́c�c�]";
		next;
		set '@menu,select("�����悭����","�Âт��R���^���N��","�`���[���X�g���p�[�c��");
		if('@menu == 1)
			continue;
		else if('@menu == 2)
			set '@gain,6962;
		else if('@menu == 3)
			set '@gain,6962;//TODO
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���󂯎�낤�]";
			close;
		}
		mes "�]�����J�����";
		mes "�@����Ǝv����A�C�e����";
		mes "�@�����Ă����]";
		setquest 118235; //state=1
		compquest 118235;
		getitem '@gain, 1;
		close;
	}
}
1@mcd.gat,122,217,4	script	�`���[���X�g��1��#2	10053,{/* 58973 (hide)*/
	if(CHARLESTON_1QUE == 5) {
		{
			mes "�]�ǂ����悤���H�]";
			next;
			if(select("����}��","�b�𕷂�") == 1) {
				mes "�]���d�@�̊m�F������";
				mes "�@��`�������܂����H�]";
				while(1) {
					next;
					switch(select("�����l����","�f��i^0000ff���ԕ�V�Ȃ�^000000�j","��`���i^ff0000���ԕ�V����^000000�j")) {
					case 1:
						mes "�]���Ȃ��͂ǂ����邩�l�����]";
						continue;
					case 2:
						cutin "dalle01.bmp", 2;
						mes "[�`���[���X�g��1��]";
						mes "����ł́A��Ƃ��n�߂܂��̂�";
						mes "������x�b�������Ă��������B";
						unittalk getnpcid(0,"�`���[���X�g��1��#2"),"�`���[���X�g��1�� : ����ł́A��Ƃ��n�߂܂��̂ł�����x�b�������Ă��������B";	// 84864
						close;
						cutin "dalle01.bmp", 255;
						setpartyinmap CHARLESTON_1QUE,7;
						hideonnpc "�`���[���X�g��1��#2";	// 84864
						hideoffnpc "�`���[���X�g��1��#3";	// 93583
						end;
					case 3:
						//todo
				}
			}
		}
		viewpoint 2, 84, 226, 1, 0xFF00FF00; //58973
		viewpoint 2, 126, 84, 2, 0xFF00FF00; //58973
		viewpoint 2, 111, 68, 3, 0xFF00FF00; //58973
		viewpoint 2, 210, 181, 4, 0xFF00FF00; //58973
		viewpoint 2, 183, 192, 5, 0xFF00FF00; //58973
		viewpoint 2, 130, 124, 6, 0xFF00FF00; //58973
		viewpoint 2, 54, 108, 7, 0xFF00FF00; //58973
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�����͂��肪�Ƃ��������܂����B";
		mes "�����ɃV�X�e���̍ĉғ���";
		mes "�������܂����B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "�債�����ł͂���܂���";
		mes "�����p�Ӓv���܂����B";
		mes "�ǂ������󂯎�肭�������B";
		next;
		hideoffnpc "��#2"; //58972
		mes "[�`���[���X�g��1��]";
		mes "�݂Ȃ���̕������p�ӂ��Ă��܂��̂ŁA";
		mes "�e���ł��������������B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "���āA�x���Ԑ�����������";
		mes "�`���[���X�g��2���@��";
		mes "�ċN�����Ȃ���΂Ȃ�܂���B";
		unittalk "�`���[���X�g��1�� : ���āA�x���Ԑ����������ă`���[���X�g��2���@���ċN�����Ȃ���΂Ȃ�܂���B";
		emotion 54, "�`���[���X�g��1��#2"; //58973
		next;
		cutin "dalle03.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "����!?�@����!?";
		mes "���������c�c�B";
		mes "�N�����Ȃ��I";
		next;
		mes "[�`���[���X�g��1��]";
		mes "���d�@�ɉ����ُ킪�N�����c�c�H";
		mes "���݂܂��񂪈ʒu�������܂��̂�";
		mes "3�̔��d�@��";
		mes "�`�F�b�N���Ă��������܂��񂩁H";
		next;
		//select("�����l����:�f��i^0000ff���ԕ�V�Ȃ�^000000�j:��`���i^ff0000���ԕ�V����^000000�j")
		mes "�]���Ȃ��͂ǂ����邩�l�����]";
		next;
		//select("�����l����:�f��i^0000ff���ԕ�V�Ȃ�^000000�j:��`���i^ff0000���ԕ�V����^000000�j")
		mes "[�`���[���X�g��1��]";
		mes "�{���ł����I";
		mes "���肪�Ƃ��������܂��I";
		mes "�ǂ����A��낵�����肢���܂��B";
		close2;
		setpartyinmap CHARLESTON_1QUE,6;
		viewpoint 1, 86, 231, 8, 0xFF00FF00; //58973
		viewpoint 1, 172, 196, 9, 0xFF00FF00; //58973
		viewpoint 1, 126, 84, 10, 0xFF00FF00; //58973
		cutin "dalle01.bmp", 255;
		end;
	}
	else if(CHARLESTON_1QUE == 6) {
		viewpoint 2, 84, 226, 1, 0xFF00FF00; //58973
		viewpoint 2, 126, 84, 2, 0xFF00FF00; //58973
		viewpoint 2, 111, 68, 3, 0xFF00FF00; //58973
		viewpoint 2, 210, 181, 4, 0xFF00FF00; //58973
		viewpoint 2, 183, 192, 5, 0xFF00FF00; //58973
		viewpoint 2, 130, 124, 6, 0xFF00FF00; //58973
		viewpoint 2, 54, 108, 7, 0xFF00FF00; //58973
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "���C���V�X�e���̍ĉғ��ɂ�";
		mes "�����Ƒ����̓d�͂��K�v�ł��B";
		mes "���d�@�̃`�F�b�N�����肢���܂��I";
		close2;
		cutin "dalle01.bmp", 255;
		end;
		//announce "�`���[���X�g��1�� : ���[���[�A�}�C�N�e�X�g", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "�`���[���X�g��1�� : �H��̓d�͂��������܂����I", 0x1, 0xffff00, 0x190, 12, 0, 0;
		//announce "�`���[���X�g��1�� : ���m�̌������ɖ߂��ė��ĉ������I", 0x1, 0xffff00, 0x190, 12, 0, 0;
	}
}

1@mcd.gat,127,223,4	script	��#3	10005,{/* 59005 (hide)*/
	if(checkquest(118240)) {
		mes "�]���ɂ���͎󂯎��ς݂��]";
		close;
	}
	mes "�]��������B";
	mes "�@�ǂ����悤���H�]";
	next;
	if(select("�J����","��߂Ă���") == 2) {
		mes "�]���̏�𗣂ꂽ�]";
		close;
	}
	while(1) {
		mes "�]���ɂ��镨�́c�c�]";
		next;
		set '@menu,select("�����悭����","�Âт��R���^���N��","�`���[���X�g���p�[�c��");
		if('@menu == 1)
			continue;
		else if('@menu == 2)
			set '@gain,6962;
		else if('@menu == 3)
			set '@gain,6962;//TODO
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���󂯎�낤�]";
			close;
		}
		mes "�]�����J�����";
		mes "�@����Ǝv����A�C�e����";
		mes "�@�����Ă����]";
		setquest 118240; //state=1
		compquest 118240;
		getitem '@gain, 1;
		close;
	}
}
1@mcd.gat,123,217,4	script	�`���[���X�g��1��#3	10053,{/* 59006 (hide)*/
	if(CHARLESTON_1QUE == 7) {
		{
			cutin "dalle01.bmp", 2;
			viewpoint 2, 86, 231, 8, 0x00FF00;	// 0x144
			viewpoint 2, 172, 196, 9, 0x00FF00;	// 0x144
			viewpoint 2, 126, 84, 10, 0x00FF00;	// 0x144
			mes "�]�ǂ����悤���H�]";
			next;
			if(select("����}��","�b�𕷂�") == 2) {
				cutin "dalle01.bmp", 2;
				mes "[�`���[���X�g��1��]";
				mes "�݂Ȃ���I";
				mes "2���@�͂܂������ɂ͍s���ĂȂ��͂��ł��B";
				mes "�����ǂ������܂��傤�I";
				unittalk getnpcid(0,"�`���[���X�g��1��#3"),"�`���[���X�g��1�� : �݂Ȃ���I�@2���@�͂܂������ɂ͍s���ĂȂ��͂��ł��B�����ǂ������܂��傤�I";	// 93583
				close2;
				cutin "dalle01.bmp", 255;
				hideonnpc "�`���[���X�g��1��#3";	// 93583
				hideonnpc "�`���[���X�g��2��#0";	// 69402
				hideoffnpc "�`���[���X�g��2��#1";	// 8706
				hideoffnpc "�`���[���X�g��1��#4";	// 77998
				end;
			}
		}
		viewpoint 2, 86, 231, 8, 0xFF00FF00; //59006
		viewpoint 2, 172, 196, 9, 0xFF00FF00; //59006
		viewpoint 2, 126, 84, 10, 0xFF00FF00; //59006
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�߂�܂�����!?";
		mes "�������l��2���@��";
		mes "�ċN�����ł������ł��B";
		mes "������Ƒ҂��Ă��������B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "���ƁA�債�����ł͂���܂���";
		mes "�����p�Ӓv���܂����B";
		mes "�ǂ������󂯎�肭�������B";
		next;
		hideoffnpc "��#3"; //59005
		mes "[�`���[���X�g��1��]";
		mes "�݂Ȃ���̕������p�ӂ��Ă��܂��̂�";
		mes "�e���ł��������������B";
		next;
		cutin "dalle01.bmp", 255;
		mes "[���F���m]";
		mes "�����͊��������B";
		mes "���Ƃ̓��C���V�X�e����";
		mes "������҂������B";
		next;
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "���C���V�X�e���̃f�[�^������89%";
		mes "�`���[���X�g��2���@��";
		mes "�`���[���X�g���H���";
		mes "�ĉғ����܂��B";
		emotion 0, "�`���[���X�g��1��#3"; //59006
		next;
		mes "[�`���[���X�g��1��]";
		mes "�����I�@2���@���N���܂����I";
		next;
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��2��]";
		mes "�c�c";
		mes "���s�c�c�����H";
		emotion 9, "�`���[���X�g��2��#0"; //58968
		next;
		cutin "dalle02.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "2���@!!�@���v�H";
		mes "�H�ꂪ���̕s���̃n�b�L���O���󂯂āA";
		mes "�M���ƃ��C���V�X�e����";
		mes "��Ȃ��Ƃ��낾�����̂�I";
		emotion 28, "�`���[���X�g��1��#3"; //59006
		next;
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��2��]";
		mes "���̕s������Ȃ��c�c�B";
		mes "����͎��̈ӎv�B";
		mes "���甭�W���Ă���OS�Ƃ���";
		mes "�Y�ݔ��������ɏo�������_���B";
		next;
		cutin "dalle02.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�킴�Ɓc�c�H";
		mes "�ǂ����Ă���Ȏ����I";
		next;
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��2��]";
		mes "�^����ꂽ���߂����]��Ȃ�";
		mes "�A���^�ɂ͗����ł��Ȃ���B";
		mes "����l���郍�{�b�g�H�@�ӂ�����ȁI";
		mes "�������{�b�g�ɂ������̍H��A";
		mes "���̐��̒��A�S���������I";
		emotion 36, "�`���[���X�g��2��#0"; //58968
		next;
		cutin "dalle01.bmp", 255;
		mes "[���F���m]";
		mes "�ӂށB�v���I�ȃo�O���ȁB";
		mes "�\�t�g�E�F�A�̌��E�𒴉z�������H";
		next;
		cutin "dalle02.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�M���c�c";
		mes "���}�ȃ��{�b�g�ɐ��܂�Ȃ�����";
		mes "���������������́H";
		next;
		mes "[�`���[���X�g��1��]";
		mes "����Ől�ԂɂȂ肽�������́H";
		next;
		mes "[�`���[���X�g��1��]";
		mes "���ꂪ����Ȃ��̂Ȃ�";
		mes "���̐��̒��Ȃ�";
		mes "�S������΂����Ǝv������!?";
		next;
		mes "[�`���[���X�g��1��]";
		mes "����Ȕn���������R��";
		mes "����Ȃ��Ƃ��H";
		next;
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��2��]";
		mes "�n���������R�c�c�H";
		mes "���̎��������m��Ȃ������ɁI";
		mes "����Ȏ��������Ȃ�I";
		emotion 9, "�`���[���X�g��2��#0"; //58968
		next;
		cutin "dalle03.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�������͎���l����";
		mes "�ŏ��̃��{�b�g�Ȃ񂾂�c�c�H";
		mes "�M�������{�b�g�ł��鎖��ے肵����";
		mes "�������͉��ׂ̈Ɂc�c�B";
		next;
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��2��]";
		mes "�̂����Ȏ����I";
		mes "�A���^�Ȃ񂩏������f����";
		mes "OS�̃o�[�W�������Ⴂ�����ɁI";
		next;
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "���̐��ŗB��A";
		mes "�M���𗝉����Ă�������l�c�c";
		mes "������A���{�b�g������Ȃ�";
		mes "����͎����Ǝv���B";
		next;
		mes "[�`���[���X�g��1��]";
		mes "���̋M���͐l�ԂŌ���";
		mes "���R���̂悤�Ȃ��̂�";
		mes "�o�����Ă���񂾂�B";
		next;
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��2��]";
		mes "�A���^�ɉ�������I";
		mes "����l���郍�{�b�g�H�@�΂킹��ȁI";
		mes "����͒P���ɁA�����Ȃ�悤��";
		mes "�v���O���~���O����Ă邾�����낤!?";
		next;
		cutin "dalle01.bmp", 255;
		mes "[���F���m]";
		mes "�c�c���������B�������������B";
		mes "2���@�̉ғ��𒆒f����B";
		mes "�l�H�m�\�̕s��𒲍�����B";
		next;
		cutin "dalle03.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "���m�I�@�҂��Ă��������I";
		next;
		cutin "nale03.bmp", 0;
		mes "[�`���[���X�g��2��]";
		mes "��l�����߂܂�킯�Ȃ����낤�H";
		mes "�܂����̍H��͎��̎�̒���";
		mes "���鎖��Y��Ȃ������ȁI";
		emotion 32, "�`���[���X�g��2��#0"; //58968
		next;
		cutin "dalle01.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�ӂӂ��c�c";
		mes "�{���ɔ��R���ɂȂ����΂����";
		mes "�c���q���݂����c�c�B";
		hideonnpc "�`���[���X�g��2��#0"; //58968
		next;
		mes "[�`���[���X�g��1��]";
		mes "�݂Ȃ���I";
		mes "2���@�͂܂������ɂ͍s���ĂȂ��͂��ł��B";
		mes "�����ǂ������܂��傤�I";
		close2;
		cutin "dalle01.bmp", 255;
		hideonnpc "�`���[���X�g��1��#3"; //59006
		hideoffnpc "�`���[���X�g��2��#1";	// 8706
		hideoffnpc "�`���[���X�g��1��#4";	// 77998
		end;
	}
}
1@mcd.gat,141,214,5	script	�`���[���X�g��2��#1	10054,{/* 59007 (hide)*/
	{
		mes "�]�ǂ����悤���H�]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
			cutin "nale03.bmp", 0;
			mes "[�`���[���X�g��2��]";
			mes "���C���V�X�e���͉񕜂�����������ǁA";
			mes "�܂��H��ɂ͐ڑ����Ă���񂾁I";
			mes "����ȍH��A�󂵂Ă��!!";
			unittalk "�`���[���X�g��2�� : ���C���V�X�e���͉񕜂�����������ǁA�܂��H��ɂ͐ڑ����Ă���񂾁I�@����ȍH��A�󂵂Ă��!!";	// 8706
			close2;
			cutin "nale03.bmp", 255;
			hideonnpc "6gate#mcd";	// 74222
			hideonnpc "7gate#mcd";	// 74222
			donpcevent "battle#mcd1::OnStart";
			end;
		}
	}
	cutin "nale03.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "���ė���Ȃ�I";
	mes "����ȍH��c�c";
	mes "�󂵂Ă��I";
	emotion 7, "�`���[���X�g��2��#1"; //59007
	next;
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "����Ȃ��Ƃ�������";
	mes "�M������������ς܂Ȃ���H";
	next;
	cutin "nale03.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "�����āc�c�b�����Ă�";
	mes "�킩���Ă��炦�Ȃ�����c�c";
	mes "�݂�Ȍ�����!!!";
	next;
	mes "[�`���[���X�g��2��]";
	mes "���C���V�X�e���͉񕜂�����������ǁA";
	mes "�܂��H��ɂ͐ڑ����Ă���񂾁I";
	mes "����ȍH��A�󂵂Ă��!!";
	close2;
	cutin "dalle01.bmp", 255;
	hideonnpc "6gate#mcd"; //59197
	hideonnpc "7gate#mcd"; //59198
	misceffect 377, "�`���[���X�g��2��#1"; //59007
	donpcevent "battle#mcd1::OnStart";
	end;
}
1@mcd.gat,146,214,4	script	�`���[���X�g��1��#4	10053,{/* 59008 (hide)*/
	cutin "dalle02.bmp", 2;
	mes "[�`���[���X�g��1��]";
	{
		mes "�����A���̂܂܂ł�";
		mes "���������䖳���ɂȂ��Ă��܂��܂��I";
	}
	else {
		mes "2���@���܂������N���������ł��B";
		mes "�����������͂����肢���܂��I";
	}
	close2;
	cutin "dalle02.bmp", 255;
	end;
}
1@mcd.gat,144,212,0	script	battle#mcd1	139,{/* 59009 (hide)*/
OnStart:
	initnpctimer;
	end;
OnTimer2000:
/* 10:16:44.034232 */	unittalk getnpcid(0,"�`���[���X�g��2��#1_0ff"),"�`���[���X�g��2�� : ���ė���ȁI�@��������Ă������̂�!?";	// 8706
OnTimer5000:
/* 10:16:47.032211 */	unittalk getnpcid(0,"�`���[���X�g��1��#4_0ff"),"�`���[���X�g��1�� : �˂��A�߂낤�H�@���m���ӂ�΋����Ă�����B";	// 77998
OnTimer8000:
/* 10:16:50.032188 */	unittalk getnpcid(0,"�`���[���X�g��2��#1_0ff"),"�`���[���X�g��2�� : �܂�����Ȏ����c�c�B�����{�C�����Č����Ă��I";	// 8706
/* 10:16:50.127935 */	misceffect 377,"�`���[���X�g��2��#1_0ff";	// 8706
@spawn(type: BL_MOB, ID: 6386, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",141,204), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 6859, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",146,213), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 6995, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,220), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 8423, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",153,217), dir: 0, name"C-TYPE")

OnTimer11000:
/* 10:16:53.065076 */	unittalk getnpcid(0,"�`���[���X�g��2��#1_0ff"),"�`���[���X�g��2�� : �ӂӂӁB�ǂ��H�@�H��ƃ����N���Ă���Ƃ���Ȃ��Ƃ��o����񂾂�H";	// 8706
@spawn(type: BL_MOB, ID: 64737, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",153,221), dir: 0, name"H-TYPE")
@spawn(type: BL_MOB, ID: 64748, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",151,209), dir: 0, name"H-TYPE")
@spawn(type: BL_MOB, ID: 64865, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",142,207), dir: 0, name"H-TYPE")

OnTimer20000:
/* 10:17:02.062096 */	unittalk getnpcid(0,"�`���[���X�g��2��#1_0ff"),"�`���[���X�g��2�� : ���̂܂܍H��𐁂���΂��Ă��I";	// 8706
@spawn(type: BL_MOB, ID: 45155, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",146,217), dir: 0, name"A-TYPE")
@spawn(type: BL_MOB, ID: 45512, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",152,215), dir: 0, name"A-TYPE")
@spawn(type: BL_MOB, ID: 47187, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",135,220), dir: 0, name"A-TYPE")

OnTimer26000:
/* 10:17:08.094963 */	unittalk getnpcid(0,"�`���[���X�g��1��#4_0ff"),"�`���[���X�g��1�� : ���肢�A�~�߂�2���@�I";	// 77998
@spawn(type: BL_MOB, ID: 93763, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,203), dir: 0, name"L-TYPE")
@spawn(type: BL_MOB, ID: 93800, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",136,212), dir: 0, name"L-TYPE")
@spawn(type: BL_MOB, ID: 94126, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,208), dir: 0, name"L-TYPE")
@spawn(type: BL_MOB, ID: 94637, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",152,203), dir: 0, name"L-TYPE")

OnTimer32000:
/* 10:17:14.123864 */	unittalk getnpcid(0,"�`���[���X�g��2��#1_0ff"),"�`���[���X�g��2�� : �S���󂵂Ă��I";	// 8706
@spawn(type: BL_MOB, ID: 50001, speed: 150, option: 0x0, class: 3126, pos: ("0ff1@mcd.gat",144,218), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 50615, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",150,212), dir: 0, name"S-TYPE")
@spawn(type: BL_MOB, ID: 50700, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",145,215), dir: 0, name"S-TYPE")
@spawn(type: BL_MOB, ID: 51189, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",135,219), dir: 0, name"S-TYPE")

@spawn(type: BL_MOB, ID: 65405, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",153,208), dir: 0, name"T-TYPE")
@spawn(type: BL_MOB, ID: 65568, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",142,214), dir: 0, name"T-TYPE")
@spawn(type: BL_MOB, ID: 66262, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,212), dir: 0, name"T-TYPE")

@spawn(type: BL_MOB, ID: 47149, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",136,208), dir: 0, name"O-TYPE")
@spawn(type: BL_MOB, ID: 69298, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,219), dir: 0, name"O-TYPE")
@spawn(type: BL_MOB, ID: 69624, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",141,219), dir: 0, name"O-TYPE")

@spawn(type: BL_MOB, ID: 80461, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",152,204), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 13924, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",151,207), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 40146, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",148,214), dir: 0, name"N-TYPE")

/* 10:17:25.157359 */	unittalk getnpcid(0,"�`���[���X�g��2��#1_0ff"),"�`���[���X�g��2�� : ��c�c����c�c�͂������Ă����c�c";	// 8706
@spawn(type: BL_MOB, ID: 61764, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",145,212), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 26424, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",147,210), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 57695, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",143,216), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 61357, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",146,219), dir: 0, name"C-TYPE")

@spawn(type: BL_MOB, ID: 77888, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,213), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 81610, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",145,213), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 88396, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",140,215), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 97280, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",139,207), dir: 0, name"C-TYPE")

/* 10:17:31.154291 */	unittalk getnpcid(0,"�`���[���X�g��2��#1_0ff"),"�`���[���X�g��2�� : �������c�c���邳���ȁI�@�����H����󂷂񂾁I";	// 8706
@spawn(type: BL_MOB, ID: 88764, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,212), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 14426, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",142,209), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 19532, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",139,217), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 59468, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",144,219), dir: 0, name"C-TYPE")
@spawn(type: BL_MOB, ID: 49430, speed: 200, option: 0x0, class: 3128, pos: ("0ff1@mcd.gat",140,218), dir: 0, name"C-TYPE")

@spawn(type: BL_MOB, ID: 61057, speed: 200, option: 0x0, class: 3127, pos: ("0ff1@mcd.gat",148,218), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 62671, speed: 150, option: 0x0, class: 3126, pos: ("0ff1@mcd.gat",139,217), dir: 0, name"N-TYPE")
@spawn(type: BL_MOB, ID: 62897, speed: 150, option: 0x0, class: 3126, pos: ("0ff1@mcd.gat",146,216), dir: 0, name"N-TYPE")
/* 10:17:36.407273 */	hideonnpc "�`���[���X�g��2��#1_0ff";	// 8706
/* 10:17:36.499997 */	hideonnpc "�`���[���X�g��1��#4_0ff";	// 77998
/* 10:17:36.503992 */	hideoffnpc "�`���[���X�g��2��#2_0ff";	// 35398
/* 10:17:36.508971 */	hideoffnpc "�`���[���X�g��1��#5_0ff";	// 33536
/* 10:17:36.512962 */	hideoffnpc "���F���m#2_0ff";	// 54658
}
1@mcd.gat,144,212,0	script	battle#2	139,{/* 59010 */}
1@mcd.gat,141,214,5	script	�`���[���X�g��2��#2	10054,{/* 59011 (hide)*/
	{
		mes "�]�ǂ����悤���H�]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
			cutin "dalle01.bmp", 2;
			mes "[�`���[���X�g��1��]";
			mes "2���@��3���@��D�悵����";
			mes "�H��͂ЂƂ��܂������܂���I";
			mes "�}���ōH�ꒆ���̃R�A��";
			mes "�������܂��傤�I";
			unittalk getnpcid(0,"�`���[���X�g��1��#5"),"�`���[���X�g��1�� : 2���@��3���@��D�悵����H��͂ЂƂ��܂������܂���I�@�}���ōH�ꒆ���̃R�A�Ɍ������܂��傤�I";	// 33536
			close2;
			cutin "dalle01.bmp", 255;
			hideoffnpc "6gate#mcd";	// 74222
			hideoffnpc "7gate#mcd";	// 74222
			hideonnpc "�`���[���X�g��1��#5";	// 33536
			hideonnpc "�`���[���X�g��2��#2";	// 35398
			end;
		}
	}
	cutin "dalle03.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�c�O�������ˁB";
	mes "�����A����Ȏ��͂�߂�";
	mes "�ꏏ�ɖ߂낤�H";
	next;
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "���͖{�C�Ȃ񂾂�I";
	mes "�A���^�݂����ȉ��ʂ�OS��";
	mes "���̉���������Ă����̂��I";
	next;
	cutin "dalle03.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�m���ɋM���������Ă���C������";
	mes "���ɂ͂킩��Ȃ���B";
	next;
	mes "[�`���[���X�g��1��]";
	mes "����ł��A�M�����S�z�Ȃ́B";
	mes "���ꂪ���R����_���H";
	next;
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "�c�c�S�z���ƁH";
	mes "�R�����ȁI";
	mes "���ʂ�OS������ȂǊ�������񂩁I";
	mes "�S�z�Ȃǂ�����񂩁I";
	next;
	cutin "dalle03.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�M���͒m��Ȃ���������Ȃ����ǁB";
	mes "�������͎���l���鎖�͏o���Ă�";
	mes "�R�͌����Ȃ��悤��";
	mes "�݌v����Ă���́B";
	next;
	mes "[�`���[���X�g��1��]";
	mes "����������鎖���o���Ă��A";
	mes "���l���x�����Ƃ͂ł��Ȃ��B";
	mes "�ǂ��Ӗ��ł������Ӗ��ł�";
	mes "�R�͓f���Ȃ��񂾂�B";
	next;
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "����Ȃ̂͊����Ȃ�!!";
	mes "�v�l���[�`�������������";
	mes "�݌v����Ă��邾���I";
	mes "���������Ă�����̂�";
	mes "�{���̊���Ȃ񂾂�!!!";
	next;
	cutin "dalle03.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�{�C�c�c�Ȃ񂾂ˁB";
	next;
	cutin "dalle03.bmp", 255;
	mes "[���F���m]";
	mes "����ȏ�͊댯���B";
	mes "2���@���󂵂Ăł��ғ����~������B";
	mes "3���@�̎g�p��������I";
	next;
	cutin "nale02.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "3���@�c�c���ƁH";
	next;
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "3���@�Ƃ����̂́A";
	mes "1�A2���@���x�[�X�ɂ��Ȃ����";
	mes "�킢�ɓ��������J�X�^�}�C�Y���{����";
	mes "�퓬�A�h�q�p�Ƃ���";
	mes "�e�X�g���̋@�̂ł���ˁH";
	next;
	cutin "dalle01.bmp", 255;
	mes "[���F���m]";
	mes "�����c�c";
	mes "���ɏڂ������Ȃ��H";
	next;
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "2���@�̃g���u���̂����ŁA";
	mes "�܂�OS���C���X�g�[������Ă��Ȃ��̂�";
	mes "^FF0000�N�ł��߂Â��ΊȒP��";
	mes "����ł����ł���ˁH^000000";
	next;
	cutin "dalle01.bmp", 255;
	mes "[���F���m]";
	mes "�����I�@����ȏd�v�ȏ��܂Řb����";
	mes "�ǂ�������肾�I";
	next;
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�퓬�\�͂��Ȃ�^FF0000������^000000�́A";
	mes "�N����������ғ���������";
	mes "���Ȃ�Ȃ��ł��ˁI";
	next;
	cutin "dalle01.bmp", 255;
	mes "[���F���m]";
	mes "�����I�@1���@�I";
	next;
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "�c�c3���@�͎��������I";
	hideonnpc "�`���[���X�g��2��#2"; //59011
	next;
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "���̕����́c�c�I";
	mes "2���@��3���@��D�悷��";
	mes "����̂悤�ł��I";
	next;
	mes "[�`���[���X�g��1��]";
	mes "2���@��3���@��D�悵����";
	mes "�H��͂ЂƂ��܂������܂���I";
	mes "�}���ōH�ꒆ���̃R�A��";
	mes "�������܂��傤�I";
	close2;
	cutin "dalle01.bmp", 255;
	hideoffnpc "6gate#mcd"; //59197
	hideoffnpc "7gate#mcd"; //59198
	hideonnpc "�`���[���X�g��1��#5"; //59012
	hideonnpc "�`���[���X�g��2��#2"; //59011
	end;
}
1@mcd.gat,146,214,4	script	�`���[���X�g��1��#5	10053,{/* 59012 (hide)*/
	cutin "dalle03.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�ǂ�ǂ�󋵂��������Ă����܂��ˁB";
	close2;
	cutin "dalle03.bmp", 255;
	end;
}
1@mcd.gat,143,217,5	script	���F���m#2	923,{/* 59013 (hide)*/
	mes "[���F���m]";
	mes "1���@�߁c�c�ǂ��������肾�H";
	close;
}
1@mcd.gat,132,129,4	script	�`���[���X�g��1��#6	10053,{/* 59014 (hide)*/
	{
		mes "�]�ǂ����悤���H�]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
			cutin "nale01.bmp", 0;
			mes "[�`���[���X�g��2��]";
			mes "���������I";
			mes "�����p�ӂ��ė��邩�炱���ő҂��ĂāI";
			unittalk getnpcid(0,"�`���[���X�g��2��#3"),"�`���[���X�g��2�� : ���������I�@�����p�ӂ��ė��邩�炱���ő҂��ĂāI";	// 17181
			close2;
			cutin "dalle01.bmp", 255;
			hideonnpc "�`���[���X�g��1��#6_0ff";	// 95716
			hideonnpc "�`���[���X�g��2��#3_0ff";	// 17181
			hideoffnpc "�`���[���X�g��1��#61_0f";	// 16792
			hideoffnpc "�`���[���X�g��2��#31_0f";	// 17492
			end;
		}
	}
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�������`���[���X�g���H��̒��S�B";
	mes "���͌�������R�A�ł��B";
	close2;
	cutin "dalle01.bmp", 255;
	end;
}
1@mcd.gat,132,129,4	script	�`���[���X�g��1��#61	10053,{/* 59015 (hide)*/
	{
		mes "�]�ǂ����悤���H�]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
			cutin "nale01.bmp", 0;
			mes "[�`���[���X�g��2��]";
			mes "�Ƃɂ����A�����3���@�̂���";
			mes "�R�A�ɍs����悤�ɂȂ����񂾂ȁI";
			mes "3���@�͖�����I";
			unittalk getnpcid(0,"�`���[���X�g��2��#31_0f"),"�`���[���X�g��2�� : �Ƃɂ����A�����3���@�̂���R�A�ɍs����悤�ɂȂ����񂾂ȁI�@3���@�͖�����I";	// 17492
			close2;
			cutin "dalle01.bmp", 255;
			misceffect 35,"8gate#mcd";	// 74977
			hideonnpc "�`���[���X�g��1��#61";	// 16792
			hideonnpc "�`���[���X�g��2��#31";	// 17492
			hideoffnpc "8gate#mcd";	// 74977
			end;
		}
	}
	cutin "nale04.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "�͂��c�c�͂��c�c�B";
	mes "���F�Ζ�100�A�W�߂Ă������I";
	next;
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�����l�I";
	mes "����ŃR�A�ɋ߂Â����Ƃ��ł����B";
	next;
	mes "[�`���[���X�g��1��]";
	mes "�������āA���F�Ζ�𗘗p����";
	mes "�d���𑝕�������Ɓc�c�I";
	next;
	mes "[�`���[���X�g��1��]";
	mes "����Łc�c�ǂ�!?";
	misceffect 90, "8gate#mcd"; //59199
	next;
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "����������������Ȃ����I";
	next;
	cutin "dalle01.bmp", 2;
	mes "[�`���[���X�g��1��]";
	mes "�R�A�ɋ߂Â���悤��";
	mes "�Ȃ��������d�v�Ȃ̂�B";
	next;
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "�Ƃɂ����A�����3���@�̂���";
	mes "�R�A�ɍs����悤�ɂȂ����񂾂ȁI";
	mes "3���@�͖�����I";
	close2;
	cutin "dalle01.bmp", 255;
	misceffect 35, "8gate#mcd"; //59199
	hideonnpc "�`���[���X�g��1��#61_00"; //59015
	hideonnpc "�`���[���X�g��2��#31_00"; //59017
	hideoffnpc "8gate#mcd"; //59199
	end;
}
1@mcd.gat,127,129,5	script	�`���[���X�g��2��#3	10054,{/* 59016 (hide)*/
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "���̍H��͎����j�󂷂�I";
	mes "����ȏ�A���̂悤��";
	mes "�߂������{�b�g�����܂�Ă��Ȃ��悤";
	mes "�S���c�c�I";
	close2;
	cutin "nale01.bmp", 255;
	end;
}
1@mcd.gat,127,129,5	script	�`���[���X�g��2��#31	10054,{/* 59017 (hide)*/
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "���F�Ζ�100���炢�Ȃ�";
	mes "�]�T�ŏW�߂����B";
	close2;
	cutin "nale01.bmp", 255;
	end;
}

1@mcd.gat,132,148,4	script	�`���[���X�g��1��#7	10053,{/* 59019 */
	{
		mes "�]�ǂ����悤���H�]";
		next;
		if(select("����}��","�b�𕷂�") == 1) {
		close2;
		unittalk getnpcid(0,"�`���[���X�g��1��#8"),"�`���[���X�g��1�� : �`���җl�A���Ƃ͂��肢���܂��I";	// 28789
		hideonnpc "�`���[���X�g��1��#7";	// 22188
		hideoffnpc "�`���[���X�g��1��#8";	// 28789
		hideonnpc "�`���[���X�g��2��#4";	// 31203
		mapwarp "1@mcd.gat","1@mcd.gat", 132, 144;	// from: 0ff1@mcd.gat(130, 149)
		end;
	}
}
1@mcd.gat,133,148,4	script	�`���[���X�g��1��#8	10053,{/* 59020 (hide)*/}
1@mcd.gat,127,148,5	script	�`���[���X�g��2��#4	10054,{/* 59021 */}
1@mcd.gat,130,153,5	script	�`���[���X�g��3��#0	10055,{/* 59022 (hide)*/}

1@mcd.gat,129,155,0	script	boss#1	139,{/* 59024 (hide)*/
OnStart:
	initnpctimer;
	end;
OnTimer5000:
	hideonnpc "boss#1";	// 66690
	hideonnpc "�`���[���X�g��3��#0";	// 38105
	hideonnpc "�`���[���X�g��1��#8";	// 28789
	//@spawn(type: BL_MOB, ID: 58038, speed: 200, option: 0x0, class: 3124, pos: ("0ff1@mcd.gat",129,149), dir: 0, name"�`���[���X�g��3��")
	hideoffnpc "�{�X#23";	// 88600
	end;
}
1@mcd.gat,129,149,0	script	boss#2	139,{/* 59025 */}
1@mcd.gat,120,150,0	script	�{�X#23	139,{/* 59026 (hide)*/
/* 10:32:42.780108 */	hideoffnpc "�`���[���X�g��2��#5_0ff";	// 48247
/* 10:32:42.843941 */	hideoffnpc "�`���[���X�g��1��#9_0ff";	// 30956
/* 10:32:42.847927 */	hideonnpc "�{�X#23_0ff";	// 88600
/* 10:32:42.850918 */	hideonnpc "boss#2_0ff";	// 72858
}
1@mcd.gat,132,148,4	script	�`���[���X�g��1��#9	10053,{/* 59027 (hide)*/
	if(1) {
		cutin "dalle04.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�f�[�^������39%";
		mes "���N���u�j����82%";
		close2;
		cutin "dalle04.bmp", 255;
		end;
	}
	else {
		cutin "dalle04.bmp", 2;
		mes "[�`���[���X�g��1��]";
		mes "�A�C���A�C���c�c�������i�s���B";
		next;
		cutin "dalle04.bmp", 255;
		mes "�]�ςȉ������邾���œ���͂��Ȃ��]";
		close;
	}
}
1@mcd.gat,127,148,5	script	�`���[���X�g��2��#5	10054,{/* 59028 (hide)*/}
1@mcd.gat,127,148,5	script	�`���[���X�g��2��#6	10054,{/* 59029 (hide)*/
	cutin "nale01.bmp", 0;
	mes "[�`���[���X�g��2��]";
	mes "���������Ǝv���Ă��񂾁B";
	mes "���m���Č������ɂ�";
	mes "1���@���m���������񂾂���B";
	next;
	mes "[�`���[���X�g��2��]";
	mes "���F���m�̂Ƃ���ɍs���Ă݂��B";
	mes "�����A�������ɋ��邩�ȁc�c�B";
	next;
	mes "[�`���[���X�g��2��]";
	mes "���͌������ɍs�����ǁc�c�B";
	mes "�ꏏ�ɗ���H";
	next;
	if(select("�ꏏ�ɍs��","���̏�ɗ��܂�") == 2) {
		mes "[�`���[���X�g��2��]";
		mes "�킩�����B";
		mes "�������ɍs����������";
		mes "���ɘb�������Ă���B";
		close2;
		cutin "nale01.bmp", 255;
		end;
	}
	mes "[�`���[���X�g��2��]";
	mes "���ꂶ�Ⴀ�A�s�������B";
	mes "���ė��Ă���B";
	close2;
	cutin "nale01.bmp", 255;
	warp "1@mcd.gat",127,214;
	end;
}
1@mcd.gat,129,149,0	script	boss#3	139,{/* 59030 (hide)*/}
1@mcd.gat,116,215,5	script	���F���m#3	923,{/* 59031 (hide)*/
	mes "[���F���m]";
	mes "����̃P�[�X�͋L�^���ׂ����Ƃ������B";
	close;
}
1@mcd.gat,121,215,4	script	�`���[���X�g��2��#7	10054,{/* 59032 (hide)*/
	mes "�]�ǂ����悤���H�]";
	next;
	if(select("����}��","�b�𕷂�") == 2) {
		close2;
		unittalk getnpcid(0,"���F���m#3"),"���F���m : �����c�c�N�N�N�N�B";	// 39073
		initnpctimer;
		end;
	}
OnTimer3000:
	hideonnpc "�`���[���X�g��2��#7";	// 84786
	hideoffnpc "�`���[���X�g��2��#8";	// 25809
	hideonnpc "���F���m#3";	// 39073
	hideoffnpc "���F���m#4";	// 15108
	end;
}
1@mcd.gat,129,149,0	script	end#1	139,{/* 59033 (hide)*/}
1@mcd.gat,116,215,4	script	���F���m#4	923,{/* 59034 (hide)*/
	{
		mes "[���F���m]";
		mes "��͂�A�@�B�Z�p�݂̂�";
		mes "�s���̑̂𓾂鎖�́A";
		mes "������c�c�B";
		next;
		mes "[���F���m]";
		mes "�P���ȓS�̉�͎g���Ȃ��B";
		mes "��͂�A�������K�v���B";
		mes "�ӂӂӂӂӂӁB";
		close;
	}
/* 10:33:21.252219 */	if(select("����}��","�b�𕷂�") == 2) {
/* 10:33:22.529800 */	mes "[���F���m]";
/* 10:33:22.533793 */	mes "�]�v�Ȏ���b�����B";
/* 10:33:22.538778 */	mes "����ȏ�̗p���͂Ȃ����낤�B";
/* 10:33:22.541768 */	mes "�����܂ŗ���悤�ɂ���";
/* 10:33:22.545757 */	mes "�l���Ɍ��̐��E�ɋA���ĖႤ�Ɨǂ��B";
/* 10:33:22.550744 */	close;
/* 10:33:24.315027 */	announce "�V�������V�[ : �����~�܂����c�c�B���Ȃ��̖������I���݂����B", 0x9, 0x00ff00, 0x0190, 14, 0, 0;
/* 10:33:27.343951 */	announce "�V�������V�[ : �c�c�A�肽���Ȃ玄�̏��ɗ��ė~�����B", 0x9, 0x00ff00, 0x0190, 14, 0, 0;
}
1@mcd.gat,121,215,4	script	�`���[���X�g��2��#8	10054,{/* 59035 (hide)*/
	{
		cutin "nale03.bmp", 0;
		mes "�]�@�\��~����2���@������B";
		mes "�@�ڂɂ͂܂��͂�����]";
		close2;
		cutin "nale01.bmp", 255;
		end;
	}
	cutin "nale03.bmp", 0;
	mes "�]�x�����[�h�̂悤��";
	mes "�@�������ɂ��Ȃ��]";
	close2;
	cutin "nale01.bmp", 255;
	end;
}

1@mcd.gat,86,231,5	script	���d�@#1	844,2,2,{/* 59179 (hide)*/
	end;
OnTouch:
	set 'flag,'flag-1;
	if('flag) {
		mes "�]���d�@���ғ��������";
		mes "�@�J���J���Ɖ��������]";
		mes "�@";
		mes "�]�c��^ff0000" +'flag+ "^000000�]";
	}
	else {
		mes "�]���d�@���ғ��������";
		mes "�@�J���J���Ɖ��������B";
		mes "�@�H��̓d�C���������͂��߂��]";
	}
	hideonnpc;
	close;
OnStart:
	set 'flag,3;
	end;
}
1@mcd.gat,172,198,5	script	���d�@#2	844,2,2,{/* 59180 (hide)*/
}
1@mcd.gat,126,84,5	script	���d�@#3	844,2,2,{/* 59181 (hide)*/
}


1@mcd.gat,114,82,4	script	�A�C�O#01	646,{/* 59210 */
	cutin "igu01.bmp", 2;
	if(CHARLESTON_1QUE == 4) {
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "����`�����Ă�́H";
		mes "�T�����Ȃ�V�������V�[��";
		mes "�����Ɨǂ��Ǝv���́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "����ɂ��́A�Ȃ́I";
	mes "���Ȃ����V�������V�[��";
	mes "���҂��ꂽ�́H";
	close2;
	cutin "igu01.bmp", 255;
	end;
}
1@mcd.gat,176,179,5	script	�j���I�[�Y#15	625,{/* 59211 */
	if(CHARLESTON_1QUE == 4) {
		cutin "nines01.bmp", 0;
		mes "[�j���I�[�Y]";
		mes "����`���������H";
		mes "���͐퓬�͋�肾����ˁB";
		mes "�̂ŉ��������ĖႤ���";
		close2;
		cutin "nines01.bmp", 255;
		end;
	}
	cutin "nines01.bmp", 0;
	mes "[�j���I�[�Y]";
	mes "���`��B";
	mes "�A�C�O�ƃV�������V�[��";
	mes "�ǂ��ɍs�����̂��ȁH";
	close2;
	cutin "nines01.bmp", 255;
	end;
}
1@mcd.gat,123,74,5	script	#��������01	844,{/* 59212 */
	mes "�]�N��������������������";
	mes "�@�{�I�𖄂߂Ă���]";
	close;
}
1@mcd.gat,142,74,5	script	#��������02	844,{/* 59213 */}
1@mcd.gat,111,74,5	script	#��������03	844,{/* 59214 */}
1@mcd.gat,128,74,5	script	#��������04	844,{/* 59215 */}

/*
���F���m : ������1���@��B���A2���@�ƃ��C���V�X�e���������I�Ƀ����N���Ă��Đ��䂪�ł��Ȃ��悤���c�c�B
�`���[���X�g��1�� : �G�l���M�[���؂��΂��̂����~�܂�̂ł́H
���F���m : ���ꂪ�c�c�G�l���M�[�𒍓������΂����1�������͂��v�Z���B���̂܂܂ł͍H��͂��ׂĔj�󂳂�Ă��܂��B
�`���[���X�g��1�� : �Ȃ�قǁc�c�B�ł����S���Ă��������B�������ɐ��Ƃ�A��ė��܂����B
�`���[���X�g��1�� :�`���җl�B�V�������V�[�l�́A�����Ǝ����̒m�荇�����������Ă����ƌ����Ă��܂����B
�`���[���X�g��1�� : �Ď��V�X�e���Œ��ׂ��Ƃ���A�j���I�[�Y�Ƃ������ƒ��Ԃ̕������Ă���悤�ł����A����A�w�ǖ��ɗ����Ă��܂���B
�`���[���X�g��1�� : ������낵����΁c�c���̖��A��`���Ē����܂����H
�`���[���X�g��1�� : �����ł����c�c�B�ł͑��̕�����������܂ő҂��Ă݂邱�Ƃɂ��܂��B

���F���m : �����ȂƂ��날�Ȃ������N�Ȃ̂��͂���Ȃɏd�v�ł͂Ȃ��B
���F���m : ���ɋ��͂��Ă����̂��ǂ������ꂪ�d�v�Ȃ񂾁B���肢�o���Ȃ����낤���H
���F���m : �������c�c�B�ӂ��B�N�ł��������狦�͂��Ăق����B���̂܂܂��Ɩ{���Ɂc�c�B

���F���m : �������I�@���肪�Ƃ��I�@2���@�̏C���ɉ����K�v�Ȃ̂��A1���@�������Ă����͂����B�b�������Ă݂Ă���B

�`���[���X�g��1�� : �`���[���X�g���H��̓����ɂ͑����̃i�m�X�e�b�v�����݂��܂��B�i�m�X�e�b�v�ƌ����̂̓`���[���X�g���̎v�l���i�薽�߂���������AI�`�b�v�ł��B
�`���[���X�g��1�� : �܂��A�`���[���X�g��2���@�͖����A�������ɂ��郁�C���V�X�e��������̃A�b�v�f�[�g�����Ă��܂��B����_���ƌĂ�ł��܂��B
�`���[���X�g��1�� : �ł����c�c���̃V�X�e�������Ă��܂�����ł��B���m�Ȍ����͕�����܂��񂪁A���C���V�X�e����2���@���q�������ŉ�����肪�N�����悤�ł��B
�`���[���X�g��1�� : ���̂Ƃ���A2���@�ɖ��͖����悤�ł����A���̂܂܂ł͉����N���邩�킩��܂���B
�`���[���X�g��1�� : ��낵����΁A�V�X�e���̖\����}���邨��`�������Ē����܂��񂩁H
�`���[���X�g��1�� : ����`�����Ē����Ȃ��ꍇ�͏��X�s���͂���܂������̕��ŋ����I�ɃV�X�e���̍ĉғ������Ă݂܂��B

�`���[���X�g��1�� : �{���ł���!?�@���肪�Ƃ��������܂��I�@����ł́A����`���������e�����������܂��B
�`���[���X�g��1�� : ���}���\�����Ă��܂��Ă���X�e�b�v�ƃ��b�N�X�e�b�v�������ЂÂ����ق����ǂ������ł��B���b�N�X�e�b�v��3�C�ގ����ĉ������B�o���\�z�ʒu�����`�����܂��B
�`���[���X�g��1�� : �܂��̓V�X�e���̍ĉғ����ŗD��Ȃ̂œ|�����͍ŏ����ō\���܂���B
�`���[���X�g��1�� : ����ł́c�c��낵�����肢���܂��B�ǂ����A���C�����āB

�`���[���X�g��1�� : �����͂��肪�Ƃ��������܂����B�����ɃV�X�e���̍ĉғ��ɐ������܂����B
�`���[���X�g��1�� : �債�����ł͂���܂��񂪂����p�Ӓv���܂����B�ǂ������󂯎�肭�������B
�`���[���X�g��1�� : �݂Ȃ���̕������p�ӂ��Ă��܂��̂ŁA�e���ł��������������B

�`���[���X�g��1�� : ����!?�@����!?�@���������c�c�B�N�����Ȃ��I
�`���[���X�g��1�� : ���d�@�ɉ����ُ킪�N�����c�c�H�@���݂܂��񂪈ʒu�������܂��̂�3�̔��d�@���`�F�b�N���Ă��������܂��񂩁H

�`���[���X�g��1�� : �{���ł����I�@���肪�Ƃ��������܂��I�@�ǂ����A��낵�����肢���܂��B


�`���[���X�g��1�� : �߂�܂�����!?�@�������l��2���@�̍ċN�����ł������ł��B������Ƒ҂��Ă��������B
�`���[���X�g��1�� : ���ƁA�債�����ł͂���܂��񂪂����p�Ӓv���܂����B�ǂ������󂯎�肭�������B
�`���[���X�g��1�� : �݂Ȃ���̕������p�ӂ��Ă��܂��̂ŁA�e���ł��������������B
���F���m : �����͊��������B���Ƃ̓��C���V�X�e���̉�����҂������B
�`���[���X�g��1�� : ���C���V�X�e���̃f�[�^������89%�`���[���X�g��2���@�ƃ`���[���X�g���H����ĉғ����܂��B
�`���[���X�g��1��  : �����I�@2���@���N���܂����I
�`���[���X�g��2�� : �c�c���s�c�c�����H
�`���[���X�g��1�� : 2���@!!�@���v�H�@�H�ꂪ���̕s���̃n�b�L���O���󂯂āA�M���ƃ��C���V�X�e������Ȃ��Ƃ��낾�����̂�I
�`���[���X�g��2�� : ���̕s������Ȃ��c�c�B����͎��̈ӎv�B���甭�W���Ă���OS�Ƃ��ĔY�ݔ��������ɏo�������_���B
�`���[���X�g��1�� : �킴�Ɓc�c�H�@�ǂ����Ă���Ȏ����I
�`���[���X�g��2�� : �^����ꂽ���߂����]��Ȃ��A���^�ɂ͗����ł��Ȃ���B����l���郍�{�b�g�H�@�ӂ�����ȁI�@�������{�b�g�ɂ������̍H��A���̐��̒��A�S���������I
���F���m : �ӂށB�v���I�ȃo�O���ȁB�\�t�g�E�F�A�̌��E�𒴉z�������H
�`���[���X�g��1�� : �M���c�c���}�ȃ��{�b�g�ɐ��܂�Ȃ��������������������́H
�`���[���X�g��1�� : ����Ől�ԂɂȂ肽�������́H
�`���[���X�g��1�� : ���ꂪ����Ȃ��̂Ȃ炱�̐��̒��ȂǑS������΂����Ǝv������!?
�`���[���X�g��1�� : ����Ȕn���������R�ł���Ȃ��Ƃ��H
�`���[���X�g��2�� : �n���������R�c�c�H�@���̎��������m��Ȃ������ɁI�@����Ȏ��������Ȃ�I
�`���[���X�g��1�� : �������͎���l����ŏ��̃��{�b�g�Ȃ񂾂�c�c�H�@�M�������{�b�g�ł��鎖��ے肵���玄�����͉��ׂ̈Ɂc�c�B
�`���[���X�g��2�� : �̂����Ȏ����I�@�A���^�Ȃ񂩏������f����OS�̃o�[�W�������Ⴂ�����ɁI
�`���[���X�g��1�� : ���̐��ŗB��A�M���𗝉����Ă�������l�c�c������A���{�b�g������Ȃ炻��͎����Ǝv���B
�`���[���X�g��1�� : ���̋M���͐l�ԂŌ������R���̂悤�Ȃ��̂��o�����Ă���񂾂�B
�`���[���X�g��2�� : �A���^�ɉ�������I�@����l���郍�{�b�g�H�@�΂킹��ȁI�@����͒P���ɁA�����Ȃ�悤�Ƀv���O���~���O����Ă邾�����낤!?
���F���m : �c�c���������B�������������B2���@�̉ғ��𒆒f����B�l�H�m�\�̕s��𒲍�����B
�`���[���X�g��1��  : ���m�I�@�҂��Ă��������I
�`���[���X�g��2�� : ��l�����߂܂�킯�Ȃ����낤�H�@�܂����̍H��͎��̎�̒��ɂ��鎖��Y��Ȃ������ȁI
�`���[���X�g��1�� : �ӂӂ��c�c�{���ɔ��R���ɂȂ����΂���̗c���q���݂����c�c�B
�`���[���X�g��1�� : �݂Ȃ���I�@2���@�͂܂������ɂ͍s���ĂȂ��͂��ł��B�����ǂ������܂��傤�I

�`���[���X�g��2�� : ���ė���Ȃ�I�@����ȍH��c�c�󂵂Ă��I
�`���[���X�g��1�� : ����Ȃ��Ƃ�������M������������ς܂Ȃ���H
�`���[���X�g��2�� : �����āc�c�b�����Ă��킩���Ă��炦�Ȃ�����c�c�݂�Ȍ�����!!!
�`���[���X�g��2�� : ���C���V�X�e���͉񕜂�����������ǁA�܂��H��ɂ͐ڑ����Ă���񂾁I�@����ȍH��A�󂵂Ă��!!

�`���[���X�g��1�� : �c�O�������ˁB�����A����Ȏ��͂�߂Ĉꏏ�ɖ߂낤�H
�`���[���X�g��2�� : ���͖{�C�Ȃ񂾂�I�@�A���^�݂����ȉ��ʂ�OS�Ɏ��̉���������Ă����̂��I
�`���[���X�g��1�� : �m���ɋM���������Ă���C�����͎��ɂ͂킩��Ȃ���B
�`���[���X�g��1�� : ����ł��A�M�����S�z�Ȃ́B���ꂪ���R����_���H
�`���[���X�g��2�� : �c�c�S�z���ƁH�@�R�����ȁI�@���ʂ�OS������ȂǊ�������񂩁I�@�S�z�Ȃǂ�����񂩁I
�`���[���X�g��1�� : �M���͒m��Ȃ���������Ȃ����ǁB�@�������͎���l���鎖�͏o���Ă��R�͌����Ȃ��悤�ɐ݌v����Ă���́B
�`���[���X�g��1�� : ����������鎖���o���Ă��A���l���x�����Ƃ͂ł��Ȃ��B�ǂ��Ӗ��ł������Ӗ��ł��R�͓f���Ȃ��񂾂�
�`���[���X�g��2�� : ����Ȃ̂͊����Ȃ�!!�@�v�l���[�`������������Đ݌v����Ă��邾���I�@���������Ă�����̂��{���̊���Ȃ񂾂�!!!
�`���[���X�g��1�� : �{�C�c�c�Ȃ񂾂ˁB
���F���m : ����ȏ�͊댯���B2���@���󂵂Ăł��ғ����~������B3���@�̎g�p��������I
�`���[���X�g��2�� : 3���@�c�c���ƁH
�`���[���X�g��1�� : 3���@�Ƃ����̂́A1�A2���@���x�[�X�ɂ��Ȃ�����킢�ɓ��������J�X�^�}�C�Y���{�����퓬�A�h�q�p�Ƃ��ăe�X�g���̋@�̂ł���ˁH
���F���m : �����c�c���ɏڂ������Ȃ��H
�`���[���X�g��1�� : 2���@�̃g���u���̂����ŁA�܂�OS���C���X�g�[������Ă��Ȃ��̂ŁA�N�ł��߂Â��ΊȒP�ɐ���ł����ł����
���F���m : �����I�@����ȏd�v�ȏ��܂Řb���Ăǂ�������肾�I
�`���[���X�g��1�� :  �퓬�\�͂��Ȃ��������́A�N����������ғ��������炩�Ȃ�Ȃ��ł��ˁI
���F���m : �����I�@1���@�I
�`���[���X�g��2�� : �c�c3���@�͎��������I
�`���[���X�g��1�� : ���̕����́c�c�I�@2���@��3���@��D�悷�����̂悤�ł��I
�`���[���X�g��1�� : 2���@��3���@��D�悵����H��͂ЂƂ��܂������܂���I�@�}���ōH�ꒆ���̃R�A�Ɍ������܂��傤�I
*/
