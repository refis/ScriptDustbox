prt_church.gat,184,101,3	script	�i�ՃC�F���S�X#yergus	60,{/* 2520 */
	if(Job == Job_Cardinal) {
		mes "[�i�ՃC�F���S�X]";
		mes "�S�Ă̎������I��点���̂ł��ˁB";
		next;
		mes "[�i�ՃC�F���S�X]";
		mes "�ł́A���ꂩ������܂ł̂悤��";
		mes "�P�Ȃ�e����^����";
		mes "�J�[�f�B�i���ł��Ă��������B";
		close;
	}
	if(checkquest(3421) || checkquest(3422) || checkquest(3423) || checkquest(3424) || checkquest(3425)) {
		mes "[�i�ՃC�F���S�X]";
		mes "���Ȃ��Ȃ�X�ɐ����ł��܂��B";
		next;
		mes "[�i�ՃC�F���S�X]";
		mes "������]�ނȂ�";
		mes "^4D4DFF�t�F�C�����n�����AB1F^000000��";
		mes "�������Ɨǂ��ł��傤�B";
		close;
	}
	mes "<FONT SIZE = 16><B>^00a049�y4���E�ɂ��āz^000000</B></FONT>";
	mes "4���E��3���E����]�E�ł����ʐE�Ƃ̑��̂ł��B";
	mes "BaseLv�̏�����㏸����ȂǁA�L�����N�^�[���X�ɐ����ł���悤�ɂȂ�܂��B";
	mes "����ł���R���e���c���ύX�ɂȂ�ȂǁA���p�ł��Ȃ��Ȃ�v�f�����邽�߁A���e�����m�F�̏�A�]�E���s���Ă��������B";
	mes "^ff0000��2022�N11��29�����_�̓��e�ł��B�ŐV���͌����T�C�g�����m�F���������B^000000";
	mes "�@";
	mes "<FONT SIZE = 14><B>^00a049��BaseLv�̏���l�̕ύX^000000</B></FONT>";
	mes "BaseLv�̏����200����220�ɏ㏸���܂��B";
	mes "BaseLv201�ȍ~��Str��Int�Ȃǂ̊�{�X�e�[�^�X���㏸�\�ȃ|�C���g�͕t�^���ꂸ�A";
	mes "Pow��Con�Ȃǂ̓����X�e�[�^�X���㏸�\�ȃ|�C���g���t�^����܂��B";
	mes "�����X�e�[�^�X�̊m�F�Ə㏸�̓X�e�[�^�X�E�B���h�E���s���܂��B";
	mes "�@";
	mes "<FONT SIZE = 14><B>^00a049������\�ȃR���e���c�̕ύX^000000</B></FONT>";
	mes "�E4���E�p�̃R���e���c�ɎQ�����ł���悤�ɂȂ�܂��B";
	mes "�@����̃G�s�\�[�h�A�b�v�f�[�g�Ȃǂ�4���E�p�Ƃ��Ē񋟗\��ł��B";
	mes "�E�ꕔ�R���e���c�ɎQ�����ł��Ȃ��Ȃ�܂��B���̃R���e���c�͈�������3���E�̃L�����N�^�[�ł��y���݂��������B";
	mes "�@���ꂽ�����A�^�i�g�X�̋L���A�����̖��{(���e�̖��{������)�A�[���̉�L(��)";
	mes "�@������A4���E�p�R���e���c���A�b�v�f�[�g�\��ł��B�ǉ����ꂽ4���E�p�R���e���c�͎Q�����\�ł��B";
	mes "�@";
	mes "<FONT SIZE = 14><B>^00a049�����̑����ӎ���^000000</B></FONT>";
	mes "�E�]�E��A3���E�ɖ߂邱�Ƃ͂ł��܂���B";
	mes "�E4���E�ɂ̓Z�J���h�R�X�`���[���͂���܂���B�]�E�O�̃R�X�`���[���̏�Ԃɂ���ăO���t�B�b�N�͕ς��܂���B";
	mes "�E���^��G�N�X�g���J���[��PATTERN�͈����p����܂��B";
	mes "�E�{�q3���E��4���E�ɓ]�E�ł��܂���B";
	mes "�E���̊Ǘ��҂ł�3���E��BaseLv200�AJob70�Ƃ��č��܂�܂��BYggdrasill���[���h�͌���̃A�b�v�f�[�g��4���E�ɑΉ��\��ł��B";
	messize 510,740;
	next;
	mes "<FONT SIZE = 14><B>^ff0000���Ԍ��胊�Z�b�g�C�x���g����^000000</B></FONT>";
	mes "2023�N2��28����������e�i���X�J�n�܂ł̊�";
	mes "4���E�ɂȂ��Ă���L�����N�^�[��";
	mes "�V���o���c�o���h���a���̎�s�W���m�[(���W : 141,187)��";
	mes "�X�e�[�^�X���Z�b�g�ƃX�L�����Z�b�g��";
	mes "���ꂼ��1�x�����s�����Ƃ��ł��܂��B";
	messize 260,420;
	next;
	mes "�]�E��i�߂Ă���낵���ł����H";
	messize 180,280;
	next;
	while(1) {
		switch(select("�����l����","������","�͂�")) {
		case 1:
			continue;
		case 2:
			mes "�]�E���s���ꍇ��";
			mes "�ēxNPC�ɘb�������Ă��������B";
			close;
		case 3:
			break;
		}
		break;
	}
	mes "[�i�ՃC�F���S�X]";
	mes "�M�S�����̗̈�֒B�����҂�B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���̂悤�Ȏ҂ɂ̂�";
	mes "�^�����鎎��������܂��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���Ȃ��̐M�S�������܂����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�i�ՃC�F���S�X]";
		mes "���Ȃ��͌��݂̈ʒu��";
		mes "�������Ă�������̂ł��ˁB";
		next;
		mes "[�i�ՃC�F���S�X]";
		mes "������܂��A�����͂Ȃ��Ǝv���܂��B";
		mes "����ł́A";
		mes "�I�[�f�B���̂����삪����񂱂Ƃ��c�c�B";
		close;
	}
	mes "[�i�ՃC�F���S�X]";
	mes "�A�[�N�r�V���b�v�̋��͂ȗ͂�";
	mes "�M�S����R��������̂ł��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���̐_���͂�";
	mes "�Ⓒ�ɒB���Ă���Ƃ����Ă܂����A";
	mes "���͂�荂�߂邱�Ƃ��\�ł��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "�A�[�N�r�V���b�v�̐M�S�ɂ́A";
	mes "�܂��[�߂�]�n���c���Ă邩��ł��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "������m���߂���w�W��";
	mes "�͂߂�̂ɓK�؂ȏꏊ���A";
	mes "���̑O�A";
	mes "�Ƃ���A�[�N�r�V���b�v�̎��";
	mes "��������܂����B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "�t�F�C�����n�����A�Ŕ������ꂽ";
	mes "^4D4DFF���e�̏�^000000�B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���̌��e�̏��́A";
	mes "�A�[�N�r�V���b�v��";
	mes "�M�I�ɕ��ނׂ�����";
	mes "�����Ă����悤�ł��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���̒m�点���`������Ȍ�A";
	mes "�����̎i�Ղ�����";
	mes "�t�F�C�����n�����A�֌������܂������A";
	mes "�N�����e�̏���";
	mes "�������Ȃ������悤�ł��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "�����A���̏���";
	mes "���ȏ�̐M�S������Ă��Ȃ���΁A";
	mes "�ڂɉf��Ȃ����݂ł����";
	mes "��������Ă��܂��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���A���̑O�ɂ���A�[�N�r�V���b�v��A";
	mes "���Ȃ��̐M�S��";
	mes "���Ɍ��̋��n�֒B������";
	mes "�����؂�܂����H";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���Ɍ��̋��n�֒B�������̂ł���΁A";
	mes "���Ȃ����t�F�C�����n�����A�֌�����";
	mes "���e�̏���";
	mes "�T���Ă݂Ă͂������ł����B";
	next;
	if(select("���̋��n�֒B���邽�߁A���e�̏���T��","�S�̏������o���Ă��Ȃ�") == 2) {
		mes "[�i�ՃC�F���S�X]";
		mes "��������������";
		mes "�ēx�K��Ă��������B";
		close;
	}
	mes "[�i�ՃC�F���S�X]";
	mes "^4D4DFF�t�F�C�����n�����AB1F^000000�֌������Ă��������B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���̏ꏊ��";
	mes "���e�̏����������ꂽ�悤�ł��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "���Ȃ������e�̏��������o���A";
	mes "�X�Ȃ鐬���𓾂��邱�Ƃ�";
	mes "���F�肵�Ă��܂��B";
	next;
	mes "[�i�ՃC�F���S�X]";
	mes "�S�\�Ȃ�I�[�f�B����";
	mes "�����삪����񂱂Ƃ��c�c�B";
	close2;
	setquest 3421;	// state=1
	//showevent 9999, 0, �i�ՃC�F���S�X#yergus;	// 2520: 184, 101
	end;
//showevent 9, 1, �i�ՃC�F���S�X#yergus;	// 2520: 184, 101
}

pay_dun00.gat,15,31,0	script	#yergus1	139,5,5,{/* 13518 */
	if(checkquest(3422)) {
		mes "[���e�̏��E��ꊪ]";
		mes "���e�̏��E��񊪂�";
		mes "^4D4DFF�I�[�N�n�����A1�K^000000��";
		mes "�ǂ����ɂ��锤���B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "���͌h�i�ȐM��";
		mes "��ȂɎ���Ă���Ƃ��Ă��A";
		mes "��ɑa���ɂȂ�Ȃ��悤";
		mes "�C��t���邱�Ƃ���؂ł���B";
		mes "�Y��Ȃ��悤�ɁB";
		close;
	}
	if(checkquest(3421)) {
		mes "�]���e�̏��Ɏ�������L�ׂĂ݂����A";
		mes "�@�G��邱�Ƃ͂ł��Ȃ��]";
		next;
		mes "�]���e�̏��̑O�ɗ���";
		mes "�@�y�[�W�������ŊJ�����]";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�{����������Ȃ�A";
		mes "���Ȃ��̐M�S��";
		mes "������x�̋��n�ɒB�������Ƃ��Ӗ�����B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "���̈ʒu�ɕs������������̂�B";
		mes "���̐S�A�X�ɍ��݂֏��낤�Ƃ���ӎu��";
		mes "�~�ł͂Ȃ�";
		mes "�M�A�_�̌䌾�t�ɋ߂Â����Ƃ���";
		mes "�h�i���Ȃ�c�c�B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "���݁A���Ȃ��̈ʒu���m���߂�@���";
		mes "�p�ӂ��Ă����悤�B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "����̓I�[�f�B�����`����3�̒�����A";
		mes "��Ԗڂ̌䌾�t�ł���B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "^4D4DFF���a�̑O�ł̂݌h�i�Ȏ҂́A";
		mes "�^�̐M�҂ɂ��炸�B^000000";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�����̐M�҂����́A";
		mes "���a�ŏW��̍s����";
		mes "���̎��̂ݐ����ł��낤�Ɠw�͂���B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�����ǐ��a���痣���ƁA";
		mes "�����a���ɂȂ�M�҂�����";
		mes "�������Ƃ������B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�I�[�f�B���͎�������";
		mes "���A�ǂ��ŁA�����s���̂��A";
		mes "�S�Ă�������Ă��邱�Ƃ�";
		mes "�����Ƃ��Ă���̂�";
		mes "���ۂ��ƌ����悤�B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�{����ǂ�ł���A�[�N�r�V���b�v��B";
		mes "�{���e�ɑ΂���";
		mes "�Ȃ̎p��U��Ԃ������Ƃ͂��邩�H";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "���Ȃ��͐��a�̊O�ł�";
		mes "�h�i�Ȏp����葱���Ă��邩�H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���e�̏��E��ꊪ]";
			mes "���������łȂ��̂ł���΁A";
			mes "���a�̊O�ł�";
			mes "�h�i�ł��邽�߂̐M�������Ȃ����B";
			next;
			mes "[���e�̏��E��ꊪ]";
			mes "������Ă��Ȃ��Ƃ����̂́A";
			mes "���ꂩ�琬���ł��邱�Ƃ��Ӗ�����B";
			mes "������܂����ӂ��ׂ����̂ł��낤�c�c�B";
			close;
		}
		mes "[���e�̏��E��ꊪ]";
		mes "�v��������������Ƃ��A";
		mes "���Ȃ��͍s���Ă���̂��B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�Ȃ��Ȃ�A�M�����ɂ����āA";
		mes "�I�[�f�B���ł͂Ȃ�";
		mes "�n��̑��l�̎������ӎ����Ȃ���";
		mes "�i�ނ��̂��������߂��邩�炾�B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�����炱��";
		mes "���a���痣��{�l�̏ꏊ�֖߂������A";
		mes "�ӎ�����Ώۂ������Ă��܂�";
		mes "����Ōh�i���������Ă��܂��̂��B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�ɂ߂đ�؂�";
		mes "��Ԗڂ̌䌾�t������Ă���Ƃ������Ƃ́A";
		mes "�f���炵�����Ƃł���B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "���ꂩ�玟�̌��e�̏����ڂɉf�邾�낤�B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "���̌��e�̏������߁A";
		mes "��Ԗڂ̌䌾�t�ɐG��Ȃ����B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "���e�̏��E��񊪂�";
		mes "^4D4DFF�I�[�N�n�����A1�K^000000��";
		mes "�ǂ����ɂ��锤�B";
		next;
		mes "[���e�̏��E��ꊪ]";
		mes "�����̌䌾�t������Ă���Ƃ��Ă��A";
		mes "�C�𔲂��Ƒa���ɂȂ��Ă��܂����́c�c�B";
		mes "��ɋC��t���A�S�|����悤�ɂ��Ȃ����B";
		close2;
		delquest 3421;
		setquest 3422;	// state=1
		end;
	}
	end;
OnTouch:
	if(checkquest(3421))
		cloakoffnpc "���e�̏��E��ꊪ#phanto";	// 13519
	end;
}

pay_dun00.gat,15,31,4	script	���e�̏��E��ꊪ#phanto	10372,{/* 13519 (cloaking)*/
	end;
OnInit:
	cloakonnpc;	// 13519
	end;
}

orcsdun01.gat,91,170,0	script	#yergus2	139,5,5,{/* 13520 */
	if(checkquest(3423)) {
		mes "[���e�̏��E���]";
		mes "���e�̏��E�Ō�̊���";
		mes "^4D4DFF�O���X�g�w�C���C���@^000000";
		mes "�ɂ���B";
		next;
		mes "[���e�̏��E���]";
		mes "���I�[�f�B���̌䌾�t��";
		mes "����Ă���Ƃ��Ă��A";
		mes "�C�𔲂��Ƒa���ɂȂ��Ă��܂����́c�c�B";
		mes "��ɋC��t���A�S�|����悤�ɂ��Ȃ����B";
		close;
	}
	if(checkquest(3422)) {
		mes "[���e�̏��E���]";
		mes "�I�[�f�B���̌䌾�t��";
		mes "�����X����҂�c�c";
		next;
		mes "[���e�̏��E���]";
		mes "�I�[�f�B���̌䌾�t�ʂ��";
		mes "������҂�c�c";
		next;
		mes "[���e�̏��E���]";
		mes "���Ȃ��̓I�[�f�B���̋����ɏ]��";
		mes "�s��������̂ł���c�c";
		next;
		mes "[���e�̏��E���]";
		mes "���Ȃ����s���S�Ăɂ����āA";
		mes "�I�[�f�B���̌䌾�t��";
		mes "���f���ꂽ�Ɗm�M�ł��邩�H";
		next;
		mes "[���e�̏��E���]";
		mes "��ԋ��낵�����Ƃ́A";
		mes "�{�l�̍s���ɊԈႢ�������Ă��A";
		mes "�������s�����ƐM����";
		mes "�ԈႢ�ɋC�t���Ȃ����Ƃł���B";
		next;
		mes "[���e�̏��E���]";
		mes "^4D4DFF�I�[�f�B���̌䌾�t��";
		mes "��������w�΂Ȃ��҂́A";
		mes "�䌾�t�ɔ�����s������������";
		mes "���ꂪ�ԈႢ�ł��邩";
		mes "���画�f�ł��Ȃ��Ȃ�B^000000";
		next;
		mes "[���e�̏��E���]";
		mes "�l���̗��H���I��";
		mes "�Ō�̐R�����}�������A";
		mes "�Ȃ̔Ƃ����߂ɋC�t����";
		mes "�R�����������̂Ȃ�A";
		mes "����قǎS�߂Ȃ��Ƃ��Ȃ��낤�c�c�B";
		next;
		mes "[���e�̏��E���]";
		mes "�ł́A���Ȃ��ɖ₤�B";
		next;
		mes "[���e�̏��E���]";
		mes "���Ȃ���";
		mes "�I�[�f�B������̌䌾�t��S�Ċw��";
		mes "����ɏ[���ł��邩�H";
		next;
		mes "[���e�̏��E���]";
		mes "���Ȃ��̍s�����S�Ă̍s����";
		mes "�I�[�f�B���̒ǋ���������ł���A";
		mes "�I�[�f�B���̊�ԍs���ł��邩�H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���e�̏��E���]";
			mes "�I�[�f�B���̌䌾�t��";
			mes "�o���؂�Ȃ����Ƃ́A";
			mes "�p�����������Ƃł͂Ȃ��B";
			next;
			mes "[���e�̏��E���]";
			mes "�F�A����Ȃ��̂�";
			mes "�I�[�f�B���̌䌾�t���o����";
			mes "�M�S����Ă���̂Ȃ̂��B";
			next;
			mes "[���e�̏��E���]";
			mes "�X�ɐ��i���Ă���A";
			mes "�{����ǂ݂ɗ��Ȃ����B";
			close;
		}
		mes "[���e�̏��E���]";
		mes "���ꂪ��ʐM�҂�";
		mes "��i�Ղ̓�����ގ҂Ƃ�";
		mes "���ł��邩������Ȃ��B";
		next;
		mes "[���e�̏��E���]";
		mes "�S�Ă̐M�̂�����̂�";
		mes "�_�̌䌾�t��S���o����";
		mes "�Ï����s���̂́A";
		mes "��������ē��R�̂��Ƃ��낤�B";
		next;
		mes "[���e�̏��E���]";
		mes "�����^�Ɍ��̓��֎��肽���̂Ȃ�A";
		mes "���̑S�Ă�m��s�����Ȃ��Ă͂Ȃ�Ȃ����A";
		mes "�����̋������Ȃ��s�����K�v�ł���B";
		next;
		mes "[���e�̏��E���]";
		mes "���Ȃ������܂ł��Ă����s����";
		mes "�ԈႢ�����������Ƃ��Ă��A";
		mes "���ꂩ�����ł�������";
		mes "�C�𔲂��Ă͂����Ȃ��B";
		next;
		mes "[���e�̏��E���]";
		mes "�����ɂ��Ȃ��̒m��Ȃ��䌾�t�ƁA";
		mes "�s���Ă��Ȃ�";
		mes "�s�������邩������Ȃ��c�c�B";
		next;
		mes "[���e�̏��E���]";
		mes "�܂��I�[�f�B�������";
		mes "�䌾�t���c���Ă���B";
		next;
		mes "[���e�̏��E���]";
		mes "���e�̏��E�Ō�̊���";
		mes "^4D4DFF�O���X�g�w�C���C���@^000000��";
		mes "�ǂ����ɂ��锤���B";
		next;
		mes "[���e�̏��E���]";
		mes "�Ō�̌䌾�t�ɂ́A";
		mes "�I�[�f�B�����牺���ꂽ";
		mes "���������邾�낤�c�c�B";
		mes "�������K�v�ɂȂ锤���B";
		close2;
		delquest 3422;
		setquest 3423;	// state=1
		end;
	}
	end;
OnTouch:
	if(checkquest(3422))
		cloakoffnpc "���e�̏��E���#phanto";	// 13521
	end;
}

orcsdun01.gat,91,170,4	script	���e�̏��E���#phanto	10373,{/* 13521 (cloaking)*/
	end;
OnInit:
	cloakonnpc;	// 13521
	end;
}

gl_church.gat,299,292,0	script	#yergus3	139,15,15,{/* 8936 */
	if(checkquest(3425)) {
		mes "[���e�̏��E��O��]";
		mes "�����A����ł�";
		mes "�Ō�̎������J�n����B";
		mes "�ڂ���ĐÂ��ɉ�����҂��A";
		mes "������ǂ݉����Ȃ����B";
		next;
		switch(select("�Ō�̎����쐬","�Ō�̎�������","��߂�")) {
		case 1:
			if(getonlinepartymember() != 1) {
				cutin "laperm01.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "1�l�p�[�e�B�[���������Ă���";
				mes "�p�[�e�B�[���[�_�[�̂�";
				mes "�쐬���邱�Ƃ��o���܂��B";
				close;
			}
			mdcreate "Last exam book";
			cutin "laperm01.bmp", 255;
			mes "[�C���t�H���[�V����]";
			mes "�������A���_���W����";
			mes "�Ō�̎����̍쐬��A";
			mes "�����I������";
			mes "�i�s���邱�Ƃ��o���܂��B";
			close;
		case 2:
			if(getonlinepartymember() != 1) {
				cutin "laperm01.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "1�l�p�[�e�B�[���������Ă���";
				mes "�p�[�e�B�[���[�_�[�̂�";
				mes "�i�s���邱�Ƃ��o���܂��B";
				close;
			}
			switch(mdenter("Last exam book")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[Last exam book] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				close;
				//warp "1@4cdn.gat", 115, 146;	// from: gl_church.gat(300, 298) port : 5125
				end;
			default:	// ���̑��G���[
				cutin "laperm01.bmp", 255;
				mes "[�C���t�H���[�V����]";
				mes "�Ώۂ̃������A���_���W������";
				mes "�쐬����Ă��܂���B";
				close;
			}
		case 3:
			cutin "laperm01.bmp", 255;
			mes "�]���̏�𗣂ꂽ�]";
			close;
		}
	}
	if(checkquest(3424)) {
		if(!(checkquest(3424) & 0x4)) {
			mes "[���e�̏��E��O��]";
			mes "�_������ׂ��ꏊ��";
			mes "���������Ă���B";
			next;
			mes "[���e�̏��E��O��]";
			mes "���Ȃ��̐_���ȗ͂ŁA";
			mes "�z�����߂Ă��炫�Ȃ����B";
			next;
			mes "[���e�̏��E��O��]";
			mes "���̋�Ԃɑ��݂��閂���̒�����";
			mes "��ނɊ֌W�Ȃ�30�̓|������ɁA";
			mes "�߂��Ă��Ȃ����B";
			close;
		}
		mes "[���e�̏��E��O��]";
		mes "�I�[�f�B���̌䌾�t��";
		mes "�M������̂�c�c";
		next;
		mes "[���e�̏��E��O��]";
		mes "�I�[�f�B���̌䌾�t��";
		mes "�]�����̂�c�c";
		next;
		mes "[���e�̏��E��O��]";
		mes "���Ȃ����M�̒�����";
		mes "����ꂽ���͉̂��Ȃ̂��H";
		next;
		mes "[���e�̏��E��O��]";
		mes "�{�l�̗��v�̂��߂�";
		mes "�I�[�f�B����M����l�����������B";
		next;
		mes "[���e�̏��E��O��]";
		mes "���R�͋ɂ߂ĒP���ł���B";
		mes "�I�[�f�B���̌䌾�t�ɏ]���A";
		mes "�s������Ɖ��b����������B";
		next;
		mes "[���e�̏��E��O��]";
		mes "�M�̈�ԍ��{���镔���ɂ���";
		mes "�l�������Ƃ͂��邩�H";
		next;
		mes "[���e�̏��E��O��]";
		mes "���Ȃ��̓I�[�f�B���̌䌾�t������";
		mes "�S��߂��ł͂Ȃ��낤���H";
		next;
		mes "[���e�̏��E��O��]";
		mes "^4D4DFF�䌾�t�Ƌ�����M���ď]���O�ɁA";
		mes "�I�[�f�B���̑��݂��̂��̂�";
		mes "�M���邱�Ƃ������厖�ł���c�c";
		mes "^000000";
		next;
		mes "[���e�̏��E��O��]";
		mes "�I�[�f�B���̌䌾�t�ɏ]����";
		mes "�s���������ɓ����鉶�b�́A";
		mes "���ɕ�����Ղ����́B";
		next;
		mes "[���e�̏��E��O��]";
		mes "�������A";
		mes "�I�[�f�B���𒼐ڌ������Ƃ������̂ɁA";
		mes "�I�[�f�B���̑��ݎ��̂��^���M�҂�����";
		mes "�����̂������B";
		next;
		mes "[���e�̏��E��O��]";
		mes "�����Ȃ��A�����Ȃ����݂�";
		mes "�M���邱�Ƃ͗e�Ղ����Ƃł͂Ȃ��B";
		next;
		mes "[���e�̏��E��O��]";
		mes "�����A";
		mes "�^�ɃI�[�f�B���̌䌾�t��";
		mes "�G��邽�߂ɂ�";
		mes "�I�[�f�B���̑��݂��̂��̂ւ�";
		mes "�M�Ɗm�M���K�v�ł���B";
		next;
		mes "[���e�̏��E��O��]";
		mes "��������̂ƁA";
		mes "�����Ȃ����́c�c";
		next;
		mes "[���e�̏��E��O��]";
		mes "���Ȃ��͂�����";
		mes "��ʂ��邱�Ƃ��ł��邩�H";
		next;
		mes "[���e�̏��E��O��]";
		mes "�_�͖ڂɌ����ʂ��A�����͌�����B";
		mes "�����̑��݁c�c";
		mes "����͐_�ւ̐M��";
		mes "�ז�������̂ł���c�c";
		next;
		mes "[���e�̏��E��O��]";
		mes "�����̌`���������e��";
		mes "���݂���Ƃ�����A";
		mes "���Ȃ��͂������疳��������邩�H";
		next;
		if(select("�͂��A�ł��܂��B","�ł��܂���B") == 2) {
			mes "[���e�̏��E��O��]";
			mes "��������������A�Ăї��Ȃ����B";
			close;
		}
		mes "[���e�̏��E��O��]";
		mes "���Ȃ��͂��ꂩ�爫���̎p������";
		mes "�ł̑��݂ɑ�������ł��낤�B";
		next;
		mes "[���e�̏��E��O��]";
		mes "���̌��e�ɂ͂����Ȃ�U�����ʂ��Ȃ��B";
		next;
		mes "[���e�̏��E��O��]";
		mes "�M�̗͂ő�����";
		mes "�������@��T�邱�Ƃ��B";
		next;
		mes "[���e�̏��E��O��]";
		mes "�^�ɂ����֓��邱�Ƃ�]�ނ̂ł���΁A";
		mes "�Ăі{����ǂ݂Ȃ����B";
		delquest 3424;
		setquest 3425;	// state=1
		close;
	}
	if(checkquest(3423)) {
		mes "[���e�̏��E��O��]";
		mes "�I�[�f�B���̌䌾�t��";
		mes "�M������̂�c�c";
		next;
		mes "[���e�̏��E��O��]";
		mes "�I�[�f�B���̌䌾�t��";
		mes "�]�����̂�c�c";
		next;
		mes "[���e�̏��E��O��]";
		mes "�{����ǂޑO�ɁA";
		mes "�悸���ӂɖڂ�z���ė~�����B";
		next;
		mes "[���e�̏��E��O��]";
		mes "�_������ׂ��ꏊ��";
		mes "���������Ă���B";
		next;
		mes "[���e�̏��E��O��]";
		mes "���Ȃ��̐_���ȗ͂ŁA";
		mes "�z�����߂Ă��炫�Ȃ����B";
		next;
		mes "[���e�̏��E��O��]";
		mes "���̋�Ԃɑ��݂��閂���̒�����";
		mes "��ނɊ֌W�Ȃ�30�̓|������ɁA";
		mes "�߂��Ă��Ȃ����B";
		delquest 3423;
		setquest 3424;	// state=1
		close;
	}
OnTouch:
	if(checkquest(3423))
		cloakoffnpc "���e�̏��E��O��#phanto";	// 8937
	end;
}

gl_church.gat,299,292,4	script	���e�̏��E��O��#phanto	10374,{/* 8937 */
	end;
OnInit:
	cloakonnpc;	// 8937
	end;
}

1@4cdn.gat,134,141,4	script	�����̏�#phantom4	10372,{/* 27968 */
	if(Job == Job_Cardinal) {
		// ������
		mes "[�����̏�]";
		mes "�O�֏o����A";
		mes "�J�[�f�B�i���ɑ��������s����";
		mes "�S�|���Ȃ����B";
		next;
		mes "[�����̏�]";
		mes "�����A�M��[�߂铹��";
		mes "�I���ȂǂȂ��B";
		mes "���ɍ��݂Ȃ����B";
		next;
		mes "[�����̏�]";
		mes "���ꂩ����ނׂ����Ȃ��̓���";
		mes "�I�[�f�B���̉��삪����񂱂Ƃ��B";
		close2;
		warp "gl_church.gat", 299, 293;	// from: 1@4cdn.gat(131, 142) port : 5124
		end;
	}
	if('flag) {
		mes "[�����̏�]";
		mes "���Ȃ��ɂ�";
		mes "�ȒP�Ȏ�����������������Ȃ��B";
		next;
		mes "[�����̏�]";
		mes "�����A���̎����B";
		mes "�N���ɂƂ��Ă�";
		mes "�������Ƃ����ł��Ȃ�";
		mes "�̋Ƃł���̂��c�c�B";
		next;
		mes "[�����̏�]";
		mes "����ł��Ȃ���";
		mes "�A�[�N�r�V���b�v�𒴂���";
		mes "�_���͂�g�ɒ������B";
		mes "�J�[�f�B�i����";
		mes "�]�E�\�Ȏ��i���������̂��B";
		next;
		mes "[�����̏�]";
		mes "���܁A������";
		mes "�J�[�f�B�i���ɓ]�E����̂��H";
		next;
		if(select("�]�E����","�]�E���Ȃ�") == 2) {
			mes "[�����̏�]";
			mes "���i�𓾂����A";
			mes "�����Ď~�܂邱�Ƃ�]�ނ̂��H";
			next;
			mes "[�����̏�]";
			mes "���Ԃ�^����B�čl���Ȃ����B";
			close;
		}
		if(SkillPoint) {
			mes "�]�X�L���|�C���g���]���Ă��邽��";
			mes "�@�i�s�ł��܂���]";
			close2;
			cutin "laperm01.bmp", 255;
			end;
		}
		if(sc_ison(SC_ALL_RIDING)) {
			// ������
			mes "�]�R�搶���ɏ������Ԃł�";
			mes "�@�i�s�ł��܂���]";
			close2;
			cutin "laperm01.bmp", 255;
			end;
		}
		mes "<FONT SIZE = 16><B>^00a049�y4���E�ɂ��āz^000000</B></FONT>";
		mes "4���E��3���E����]�E�ł����ʐE�Ƃ̑��̂ł��B";
		mes "BaseLv�̏�����㏸����ȂǁA�L�����N�^�[���X�ɐ����ł���悤�ɂȂ�܂��B";
		mes "����ł���R���e���c���ύX�ɂȂ�ȂǁA���p�ł��Ȃ��Ȃ�v�f�����邽�߁A���e�����m�F�̏�A�]�E���s���Ă��������B";
		mes "^ff0000��2022�N11��29�����_�̓��e�ł��B�ŐV���͌����T�C�g�����m�F���������B^000000";
		mes "�@";
		mes "<FONT SIZE = 14><B>^00a049��BaseLv�̏���l�̕ύX^000000</B></FONT>";
		mes "BaseLv�̏����200����220�ɏ㏸���܂��B";
		mes "BaseLv201�ȍ~��Str��Int�Ȃǂ̊�{�X�e�[�^�X���㏸�\�ȃ|�C���g�͕t�^���ꂸ�A";
		mes "Pow��Con�Ȃǂ̓����X�e�[�^�X���㏸�\�ȃ|�C���g���t�^����܂��B";
		mes "�����X�e�[�^�X�̊m�F�Ə㏸�̓X�e�[�^�X�E�B���h�E���s���܂��B";
		mes "�@";
		mes "<FONT SIZE = 14><B>^00a049������\�ȃR���e���c�̕ύX^000000</B></FONT>";
		mes "�E4���E�p�̃R���e���c�ɎQ�����ł���悤�ɂȂ�܂��B";
		mes "�@����̃G�s�\�[�h�A�b�v�f�[�g�Ȃǂ�4���E�p�Ƃ��Ē񋟗\��ł��B";
		mes "�E�ꕔ�R���e���c�ɎQ�����ł��Ȃ��Ȃ�܂��B���̃R���e���c�͈�������3���E�̃L�����N�^�[�ł��y���݂��������B";
		mes "�@���ꂽ�����A�^�i�g�X�̋L���A�����̖��{(���e�̖��{������)�A�[���̉�L(��)";
		mes "�@������A4���E�p�R���e���c���A�b�v�f�[�g�\��ł��B�ǉ����ꂽ4���E�p�R���e���c�͎Q�����\�ł��B";
		mes "�@";
		mes "<FONT SIZE = 14><B>^00a049�����̑����ӎ���^000000</B></FONT>";
		mes "�E�]�E��A3���E�ɖ߂邱�Ƃ͂ł��܂���B";
		mes "�E4���E�ɂ̓Z�J���h�R�X�`���[���͂���܂���B�]�E�O�̃R�X�`���[���̏�Ԃɂ���ăO���t�B�b�N�͕ς��܂���B";
		mes "�E���^��G�N�X�g���J���[��PATTERN�͈����p����܂��B";
		mes "�E�{�q3���E��4���E�ɓ]�E�ł��܂���B";
		mes "�E���̊Ǘ��҂ł�3���E��BaseLv200�AJob70�Ƃ��č��܂�܂��BYggdrasill���[���h�͌���̃A�b�v�f�[�g��4���E�ɑΉ��\��ł��B";
		messize 510,740;
		next;
		mes "<FONT SIZE = 14><B>^ff0000���Ԍ��胊�Z�b�g�C�x���g����^000000</B></FONT>";
		mes "2023�N2��28����������e�i���X�J�n�܂ł̊�";
		mes "4���E�ɂȂ��Ă���L�����N�^�[��";
		mes "�V���o���c�o���h���a���̎�s�W���m�[(���W : 141,187)��";
		mes "�X�e�[�^�X���Z�b�g�ƃX�L�����Z�b�g��";
		mes "���ꂼ��1�x�����s�����Ƃ��ł��܂��B";
		messize 260,420;
		next;
		mes "�]�E��i�߂Ă���낵���ł����H";
		messize 180,280;
		next;
		while(1) {
			switch(select("�����l����","������","�͂�")) {
			case 1:
				continue;
			case 2:
				mes "�]�E���s���ꍇ��";
				mes "�ēxNPC�ɘb�������Ă��������B";
				close;
			case 3:
				break;
			}
			break;
		}
		unequip;
		jobchange Job_Cardinal;
		setquest 3421;	// state=1
		delquest 3421;
		delquest 3422;
		delquest 3423;
		delquest 3424;
		delquest 3425;
		setquest 202255;	// state=1
		getitem 490087,1;
		mes "[�����̏�]";
		mes "����̐������������邾�낤�B";
		next;
		mes "[�����̏�]";
		mes "�O�֏o����A";
		mes "�J�[�f�B�i���ɑ��������s����";
		mes "�S�|���Ȃ����B";
		next;
		mes "[�����̏�]";
		mes "�����A�M��[�߂铹��";
		mes "�I���ȂǂȂ��B";
		mes "���ɍ��݂Ȃ����B";
		next;
		mes "[�����̏�]";
		mes "���ꂩ����ނׂ����Ȃ��̓���";
		mes "�I�[�f�B���̉��삪����񂱂Ƃ��B";
		close2;
		warp "gl_church.gat", 299, 293;	// from: 1@4cdn.gat(131, 142) port : 5124
		end;
	}
	if(getmapmobs(getmdmapname("1@4cdn.gat"),getmdnpcname("�����̏�#phantom4")+ "::OnKilled");){
		mes "[�����̏�]";
		mes "�ł̑��݂��P�����@��";
		mes "�����Ɍ�������Ȃ����Ƃ�";
		mes "���邾�낤�B";
		mes "���ɂ͑ނ����Ƃ��������Ȃ����B";
		mes "�M�S�͐�₳���ɁB";
		close;
	}
	mes "[�����̏�]";
	mes "���悤�Ƃ�����̂ɂ͌������A";
	mes "���Ȃ��悤�ɂ��Ă�����̂̑O�ɂ�";
	mes "����鑶�݂�����B";
	next;
	mes "[�����̏�]";
	mes "�^�ɐ_�����߂悤�Ƃ��鎞�A";
	mes "������ז�����v�f��";
	mes "��Ɍ���Ă��܂����̂��B";
	next;
	mes "[�����̏�]";
	mes "�����ɒH�蒅�������Ȃ���";
	mes "�Ō�̎������󂯂鎑�i������B";
	next;
	mes "[�����̏�]";
	mes "������]�ނ��̂�A���߂Ė₤�B";
	mes "���Ȃ��͐M�̖ڂ̎�����Ȃ̂��H";
	next;
	mes "[�����̏�]";
	mes "�^�ɑ��݂�M����S��";
	mes "���ꂪ�ڂɌ����Ȃ����݂ł����Ă��A";
	mes "�h�邪�Ȃ����̂ł���B";
	next;
	mes "[�����̏�]";
	mes "�؂�Ƌ��|�c�c";
	mes "������";
	mes "�M����点�悤�Ƃ��鑶�݂�";
	mes "���グ�����̂ɉ߂����A";
	mes "�I�[�f�B������";
	mes "������ꂽ�S�ł͂Ȃ��B";
	next;
	mes "[�����̏�]";
	mes "�����͍s���Ŏ������B";
	mes "�����A���������z���Ȃ����B";
	next;
	initnpctimer;
	set 'mob,callmonster(getmdmapname("1@4cdn.gat"),128,143,"�ł̌��e",20822,strnpcinfo(0)+"::OnKilled");
	mes "[�����̏�]";
	mes "�ł̑��݂ɂ��";
	mes "���Ȃ��̐M�������Ȃ����Ƃ�";
	mes "�؂Ɋ肤�B";
	close;
OnTimer60000:
	stopnpctimer;
	setmobhp 'mob,1;
	announce "�����̏� : ���̗h�邬�Ȃ��M������΁A�ł͗e�Ղ��P�����Ƃ��ł��邾�낤�B", 0x9, 0xccff00;
	end;
OnKilled:
	set 'flag,1;
	end;
}
