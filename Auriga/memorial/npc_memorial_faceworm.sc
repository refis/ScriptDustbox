//= Auriga Script ==============================================================
// Ragnarok Online Nest of Faceworm Script	by refis
//==============================================================================

//============================================================
// NPC
//------------------------------------------------------------
payon.gat,157,54,5	script	�N�z�̏���	103,{
	if(checkquest(114655)) {
		mes "�]�N�z�̏�����������";
		mes "�@�����̏ꏊ�Ɉ�l";
		mes "�@��������ł���c�c�]";
		next;
		if(countitem(6650) < 1) {
			mes "�]�w�ւ���ɓ��ꂽ�����̕v��";
			mes "�@�t�F�C�X���[���ɏP��ꂽ�̂���";
			mes "�@����Ȃ��B";
			close;
		}
		if(select("���������Ȃ�","����������") == 1) {
			mes "�]���͂����Ƃ��Ă������]";
			close;
		}
		mes "�]�N�z�̏����Ɏw�ւ�";
		mes "�@�����ƍ����o�����]";
		next;
		mes "�]�Âڂ��Ă͂�����̂�";
		mes "�@�h��ł͂Ȃ��T���߂ȑ�����";
		mes "�@�Ȃɂ��Ɋ�Ԃ悤��";
		mes "�@��������u�P�����]";
		next;
		if(checkquest(114655)&8) {
			mes "[�N�z�̏���]";
			mes "���̐l�̎w�ւˁc�c�B";
			mes "���̎w�ւ��߂�Ƃ܂��";
			mes "���̐l���������܂���";
			mes "�����Ă���Ă���C������̂�B";
			mes "�������肪�Ƃ��B";
		}
		else {
			mes "^0000ff�]�w�ւɂ͏����ȕ�����������Ă���B";
			mes "[��؂ȌN��]�]^000000";
			next;
			mes "[�N�z�̏���]";
			mes "����́c�c�I";
			mes "���̐l�����ɑ��낤�Ƃ��Ă��ꂽ";
			mes "�w�ցc�c�B";
			mes "���O�͏����Ă��Ȃ������";
			mes "�����D����������΂΂���";
			mes "����΂߂��Ă����B";
			next;
			mes "[�N�z�̏���]";
			mes "���̐l�A���Ȃ��Ȃ�O��";
			mes "���̒a���΂⎄���D���ȕ�΂�����Ⴀ";
			mes "���񂴂肷��قǕ����Ă����́B";
			mes "������A���̎w�ւ�";
			mes "���̐l�����̂��߂ɂƗp�ӂ��Ă��ꂽ";
			mes "�w�ւɊԈႢ�Ȃ���c�c�B";
			next;
			mes "[�N�z�̏���]";
			mes "�ł��悭����������ˁc�c�H";
			mes "�قڒ��߂����Ă������炢��";
			mes "�����͌o�߂��Ă����͂���B";
			next;
			mes "�]���Ȃ��͖ق����������]";
			next;
			mes "[�N�z�̏���]";
			mes "����c�c�������ʂ�";
			mes "�������̂�����B";
			mes "������B";
			mes "���Ȃ��͎w�ւ������Ă��Ă��ꂽ�B";
			mes "���ꂾ���ŏ[������B";
			mes "�{���ɁA���肪�Ƃ��B";
			next;
			mes "[�N�z�̏���]";
			mes "���ꂩ��͎��c�c";
			mes "���̐l�Ƃ̎v���o���؂ɂ���";
			mes "�y���������鎖�ɂ����B";
			next;
			mes "�]^0000ff�ǂ����炩�������C����������^000000�]";
			misceffect 72;
		}
		next;
		mes "[�N�z�̏���]";
		mes "���Ȃ��ɂ������Ƃ���";
		mes "������������̂�����ǁA";
		mes "���͂��ꂵ�������āc�c�B";
		mes "�ǂ�������H�ׂĒ��ՁB";
		delitem 6650,1;
		getitem RAND_FOOD,3;
		compquest 114655;
		close;
	}
	mes "[�N�z�̏���]";
	mes "���Ȃ��A�`���҂̕��ˁB";
	mes "�������̘̐b�ɕt��������";
	mes "���������āA����������B";
	next;
	mes "[�N�z�̏���]";
	mes "�����c������B";
	mes "14��15�΂��炢������������B";
	mes "���̎����ɂ�";
	mes "�S����D���������j�̎q�������́B";
	mes "�ł��ˁc�c�B";
	next;
	mes "[�N�z�̏���]";
	mes "���̎��͎��̋C������";
	mes "�ǂ�����ĕ\������΂����̂�";
	mes "������Ȃ������́B";
	next;
	mes "[�N�z�̏���]";
	mes "�ɂ��������";
	mes "���̐l�̃y�R�y�R�ɂ�����������o����";
	mes "�Ȃ�Ƃ��C���������Ƃ����̂����ǁc�c";
	mes "��肭�������ɑ化�܂�������B";
	next;
	mes "[�N�z�̏���]";
	mes "�����A���݂��ǂ�����Ă�������";
	mes "�C���������̂�����ˁB";
	mes "���ǁA������Ƃ��Ȃ�";
	mes "�t�������n�߂鎖�ɂȂ����̂�B";
	mes "������������c�c�B";
	mes "�₾�B�p���������Ȃ��ˁB";
	next;
	mes "[�N�z�̏���]";
	mes "������x�̍΂ɂȂ��Č�����������B";
	mes "�܂��A���������납��";
	mes "���[���ƈꏏ���������A";
	mes "������������������";
	mes "�������������킯�ł͂Ȃ����ǁB";
	next;
	mes "[�N�z�̏���]";
	mes "����łˁB";
	mes "�N������Ă����l�͂��̎���������";
	mes "�C�ɂ���悤�ɂȂ��Ă����́B";
	mes "�w�ւЂƂ����Ă������Ȃ��܂܂�";
	mes "�{���ɐ\����Ȃ��A���āB";
	next;
	mes "[�N�z�̏���]";
	mes "�ꏏ�ɂ��邾���ŏ[���������̂ɁB";
	mes "����Ɂc�c�������ĉ��N���o���Ă���";
	mes "�}�Ɍ���Ȃ��Ă������̂ɁB�˂��B";
	mes "�ӂӂӁB";
	mes "�΂����Ⴄ�ł���B";
	next;
	mes "[�N�z�̏���]";
	mes "�c�c�B";
	next;
	mes "[�N�z�̏���]";
	mes "�c�c";
	mes "�c�c�c�c�B";
	next;
	mes "[�N�z�̏���]";
	mes "�c�c";
	mes "�c�c�c�c";
	mes "�c�c�c�c�c�c�B";
	next;
	mes "[�N�z�̏���]";
	mes "���������O�ɓˑR�A";
	mes "^0000ff�w��^000000����ɂ���Ă������";
	mes "�o�čs���Ă��܂����́B";
	next;
	mes "[�N�z�̏���]";
	mes "����Ȃ�������";
	mes "���x���`�����񂾂��ǁc�c�B";
	next;
	mes "[�N�z�̏���]";
	mes "���������A��l�͋A����";
	mes "���Ȃ�������B";
	mes "�`���҂̘b�����l�ɂ悭�����j�̐l��";
	mes "�傫�Ȏւɒǂ��Ă���̂�";
	mes "�����񂾂Ƃ��c�c�B";
	next;
	mes "[�N�z�̏���]";
	mes "�����A���̎��~�߂Ă���΁B";
	mes "���Ȃ��c�c�B�����c�c�B";
	next;
	menu "�c�c",-;
	mes "[�N�z�̏���]";
	mes "���߂Ďw�ւ�����΁A";
	mes "���̐l�������̂Ɂc�c�B";
	next;
	mes "�]�����w�ւ��E������";
	mes "�@���̔N�z�̏����̎w�ւ�";
	mes "�@�m�F���Ă��炤���߂�";
	mes "�@�b�������悤�]";
	setquest 114655;
	close;
}

payon.gat,161,54,3	script	�ٍ��I�ȏ��l	99,{
	if(checkquest(114660)) {
		mes "�]�Ƒ��̎肪�����T��";
		mes "�@���̒j����������";
		mes "�@���̏ꏊ�ɂ���̂�������]";
		next;
		if(countitem(6652) < 1) {
			mes "�]�t�F�C�X���[���̑���";
			mes "�@�����v���o�̕i���c���Ă���";
			mes "�@��������Ȃ��]";
			close;
		}
		if(select("���������Ȃ�","����������") == 1) {
			mes "�]���ɍ��͗p���Ȃ��̂Ł]";
			mes "�@����������̂���߂��]";
			close;
		}
		if(checkquest(114660)&8) {
			mes "�]�Z���W�I�ɂ܂��n���Ă��Ȃ�";
			mes "�@�V�������������A���o����";
			mes "�@��n�����]";
			next;
			mes "�]�A���o���͏����F�����Ă��邪";
			mes "�@�����Ɏʂ��Ă���l�̏Ί��";
			mes "�@�F�����邱�ƂȂ��ʂ��Ă���]";
			next;
			mes "[�Z���W�I]";
			mes "���Ȃ��̂��A�ł܂�";
			mes "�e���Ƃ̎v���o��";
			mes "���߂����Ƃ��ł��܂����B";
			mes "���肪�Ƃ��������܂��B";
			next;
			mes "�]�D�����C�����Ȃ��ɗ͂�";
			mes "�@��������ł��ꂽ�]";
		}
		else {
			mes "[�Z���W�I]";
			mes "���̃A���o���́c�c";
			mes "�܂����e���́H";
			next;
			mes "[�Z���W�I]";
			mes "�����A�v���o���܂����B";
			mes "����͐e���ƈꏏ��";
			mes "�d�������Ă������ł��B";
			next;
			mes "[�Z���W�I]";
			mes "�����A���̐l���������o��������B";
			mes "���肪�Ƃ��������܂��B";
			mes "�厖�ɂ����Ă��������܂��c�c�B";
			next;
			mes "[�Z���W�I]";
			mes "�ł����c�c�B";
			mes "�e���͌𗬂��L�������̂�";
			mes "�ق��ɂ��܂����̃A���o����";
			mes "�ڂ��Ă��Ȃ��l�����邩��";
			mes "����܂���B";
			next;
			mes "[�Z���W�I]";
			mes "�����܂��A���o�����E������";
			mes "�����Ă��Ă���܂��񂩁B";
			mes "�e���̂��Ƃł��B";
			mes "���̐l���B�e���Ă����";
			mes "�Ⴂ�Ȃ��ł����B";
			next;
			mes "�]^0000ff�A���o���𒭂߂Ă����Z���W�I�̊��";
			mes "�@�₵���Ɗ���������������";
			mes "�@���΂݂��L������^000000�]";
			next;
			mes "�]^0000ff�D�����C��������^000000�]";
			misceffect 72;
		}
		next;
		mes "[�Z���W�I]";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		mes "�A���o���̂���ɂ�����ǂ����B";
		mes "�C�ɓ����Ē�����Ɨǂ��̂ł����c�c�B";
		delitem 6652,1;
		getitem RAND_FOOD,3;
		compquest 114660;
		close;
	}
	mes "[�Z���W�I]";
	mes "�c�����A�e���̎d����";
	mes "���čs�������̋L����";
	mes "�����Ɏc���Ă����ł��B";
	next;
	mes "[�Z���W�I]";
	mes "���m�ɂ͕�����Ȃ���ł����A";
	mes "���̋߂���ʂ��Ă���r����";
	mes "����Ȏւ̂悤�Ȑ����ɏP����";
	mes "���ꗣ��ɂȂ��Ă��܂��܂����B";
	next;
	mes "[�Z���W�I]";
	mes "���̎��A�Ƒ��������܂����B";
	mes "���ƂȂ��Ă͉Ƒ��Ƃ̎v���o��";
	mes "���܂��v���o���Ȃ���Ԃł��B";
	next;
	mes "[�Z���W�I]";
	mes "���̎��͏��������Ă���̂�";
	mes "�����ɗ]�T���o���܂����B";
	mes "�����A���ς�炸���̎��̋L����";
	mes "�����ꂵ�߂Ă��܂��B";
	next;
	mes "[�Z���W�I]";
	mes "���̏ꏊ��K���΂�����������";
	mes "���̉Ƒ��Ɋւ���肪���肪";
	mes "�������邩�ȂƎv�����̂ł���";
	mes "�Ȃ��Ȃ�����ł��ˁB";
	mes "��͂莞�Ԃ��o���߂��Ă��̂��A";
	mes "����������܂���ł����B";
	next;
	mes "�]���̒j���̉Ƒ���";
	mes "�@�肪����ɂȂ肻����";
	mes "�@�ʐ^�̂悤�Ȃ��̂��E������";
	mes "�@�ēx�܂��b�������悤�]";
	setquest 114660;
	close;
}

payon.gat,161,50,1	script	�������Ɍ�����j	88,{
	if(checkquest(114665)) {
		mes "�]�傫�Ȏւ�T��";
		mes "�@�������Ɍ�����j��";
		mes "�@�ӂ�����񂵂Ă���]";
		next;
		if(countitem(6653) < 1) {
			mes "�]�͂����Ȃ��������";
			mes "�@�t�F�C�X���[���̑���";
			mes "�@���邩������Ȃ��B";
			mes "�@�T���Ă݂悤�]";
			close;
		}
		if(select("���������Ȃ�","����������") == 1) {
			mes "�]����������̂���߂��]";
			close;
		}
		if(checkquest(114665)&8) {
			mes "�]�������Ɍ�����j��";
			mes "�@�V�������肵����܂�";
			mes "�@��n�����]";
			next;
			mes "[�������Ɍ�����j]";
			mes "���肪�Ƃ��������܂��B";
			mes "����ł��̎ւ̐����܂�";
			mes "�������Ǝv����";
			mes "���̐S�������A�~���܂��B";
			next;
			mes "[�������Ɍ�����j]";
			mes "���̖�͂������߂܂���";
			mes "�͂��Ă�����������܂̑��݂�";
			mes "���ɂƂ��đO�ɐi�ނ��߂�";
			mes "������ɂȂ肻���ł��B";
		}
		else {
			mes "�]�����܂������тꂽ";
			mes "�@��܂��������Ɍ�����j��";
			mes "�@���܂����ڂ�Ȃ��悤��";
			mes "�@�C�����Ȃ���n�����]";
			next;
			mes "[�������Ɍ�����j]";
			mes "����͂܂����c�c!?";
			mes "�ԈႢ�Ȃ��B";
			mes "��܂Ɍ��o���̂��鎚��";
			mes "������������Ă���c�c�B";
			mes "������ǂ������";
			mes "���肵���̂ł����H";
			next;
			mes "�]���Ȃ��͎����`�����]";
			next;
			mes "[�������Ɍ�����j]";
			mes "���̖�c�c���̖򂳂���������c�c�B";
			next;
			mes "�]^0000ff��܂��������܂ܔ߂���ł���B";
			mes "�@��]�̊֌W�𒴂���������";
			mes "�@�ނ��犴�������^000000�]";
			next;
			mes "[�������Ɍ�����j]";
			mes "�����A�܂���܂���ɓ��ꂽ��";
			mes "���̌��Ɏ����Ă��Ă��������B";
			mes "��܂��͂��΁A���̎ւ̐���";
			mes "�����ł��������؂ɂȂ�܂��B";
			next;
			mes "[�������Ɍ�����j]";
			mes "���񂾂��̕��͂����߂�܂���B";
			mes "�ł����ւ�����΁A���Ɠ���";
			mes "�C�����̕������邩������Ȃ��B";
			mes "�����Ƃ��ꂪ���̕��ւ�";
			mes "���{�ɂ��Ȃ�Ǝv���̂ł��B";
			next;
			mes "[�������Ɍ�����j]";
			mes "�c�c�����l�����班��";
			mes "�C�������y�ɂȂ�܂����B";
			mes "�{���ɁA���̖�܂��킴�킴";
			mes "�͂��Ă��������A";
			mes "���肪�Ƃ��������܂����B";
			next;
			mes "�]^0000ff���₩�ȋC����������^000000�]";
			misceffect 72;
		}
		next;
		mes "[�������Ɍ�����j]";
		mes "����Ɓc�c����Ȃ��̂�������܂���";
		mes "���ЁA�����ւ�|���ׂ�";
		mes "���𗧂Ă��������B";
		delitem 6653,1;
		getitem RAND_FOOD,3;
		compquest 114665;
		close;
	}
	mes "[�������Ɍ�����j]";
	mes "���ɂ͎d���Ă���l�����܂����B";
	mes "���̕��͑̂��キ��ɊP�����Ă����̂�";
	mes "�����������ł�����ł��B";
	mes "���̖�͖����A���߂�ꂽ����";
	mes "�͂����Ă��܂����B";
	next;
	mes "[�������Ɍ�����j]";
	mes "�Ƃ��낪������A��������\��̖�";
	mes "���Ȃ�������ł��B";
	mes "�������b�ł͖���^��ł����l��";
	mes "�傫�ȎւɏP�����ꂽ�����Łc�c�B";
	next;
	mes "[�������Ɍ�����j]";
	mes "���̌��ʁA�����d���Ă������";
	mes "�S���Ȃ�܂����B";
	mes "�c�c";
	mes "���͂��̎ւ������ĎE�����߂�";
	mes "���N���T������Ă��܂��B";
	next;
	menu "���Q�ł��������ł����H",-;
	mes "[�������Ɍ�����j]";
	mes "���A����́c�c�B";
	next;
	mes "[�������Ɍ�����j]";
	mes "�����A�ǂ������̎ւ�";
	mes "���Ɗ֌W���Ȃ��B";
	mes "���͂��̕��̂����̕������c�c�B";
	next;
	mes "�]^0000ff�ނ̊炩���";
	mes "�@���G�Ȏv��������ꂽ^000000�]";
	next;
	mes "�]���̒j�̋C�����������ł�";
	mes "�@�~������̂̎肪�����";
	mes "�@�t�F�C�X���[���̑��ɂ��肻�����]";
	setquest 114665;
	close;
}

payon.gat,139,68,4	script	���Â��j	795,{
	if(checkquest(114670)) {
		mes "�]�r�ւ�T�����߂Ă���";
		mes "�@�Ќ��̗H���";
		mes "�@�L�b�g��������������]";
		next;
		if(countitem(6651) < 1) {
			mes "�]�L�b�g���͘r�ւ�T���Ă���悤���B";
			mes "�@�t�F�C�X���[���̑���";
			mes "�@�肪���肪���肻�����]";
			close;
		}
		if(select("���������Ȃ�","����������") == 1) {
			mes "�]�H��ł���l�ł��������͂���͂����]";
			mes "�]�@���͂����Ƃ��Ă������]";
			close;
		}
		if(checkquest(114670)&8) {
			mes "�]�L�b�g���ɏE����";
			mes "�@�Âڂ����r�ւ�";
			mes "�@��n�����]";
			next;
			mes "^999999[�L�b�g��]";
			mes "�V�����r�ցB";
			mes "�F�B�v���o���B";
			mes "�F�B�������B�C������B";
			mes "�������B^000000";
		}
		else {
			mes "�]�����ȃC�j�V����������ꂽ";
			mes "�@�����Âڂ����r�ւ�";
			mes "�@�L�b�g���Ɍ����Ă݂�";
			next;
			mes "^999999[�L�b�g��]";
			mes "�L�b�g���̘r�ցI^000000";
			next;
			mes "^999999[�L�b�g��]";
			mes "�������B�r�֖߂����I";
			mes "������!!^000000";
			next;
			mes "^999999[�L�b�g��]";
			mes "�ł��F�B�B�̌������B";
			mes "�L�b�g���D���ȑ����B";
			mes "�킩��Ȃ��B";
			mes "�����炢���ς�������B";
			mes "�r�ւ����ς��B^000000";
			next;
			mes "^999999[�L�b�g��]";
			mes "����������B";
			mes "�r�ցB�V�����́B";
			mes "���Ȃ��������B";
			mes "�L�b�g���ɓ͂���B";
			mes "�L�b�g���r�֑�����B�������B";
			mes "���肢�B^000000";
			next;
			mes "^0000ff�]�L�b�g���̍����܂Ԃ�������]^000000";
			misceffect 247;
		}
		next;
		mes "^999999[�L�b�g��]";
		mes "�L�b�g���������B";
		mes "�����炱�ꂠ����B";
		mes "���Ȃ����������H";
		mes "���Ȃ�����������";
		mes "�L�b�g�������Ɗ������B^000000";
		delitem 6651,1;
		compquest 114670;
		getitem RAND_FOOD,3;
		close;
	}
	mes "�]^0000ff���łɎ��񂾐l�̍����A";
	mes "�@������`���悤�Ƃ��Ă���^000000�]";
	next;
	mes "^999999[�L�b�g��]";
	mes "���c�c�L�b�g���B";
	mes "�b�A���܂��Ȃ��B^000000";
	next;
	mes "^999999[�L�b�g��]";
	mes "�L�b�g���A�̎��񂾁B";
	mes "�ł��A���݂Ȃ��B";
	mes "�L�b�g���������݂ł͂Ȃ��B^000000";
	next;
	mes "^999999[�L�b�g��]";
	mes "�L�b�g���c�c�r�ւ��K�v�B";
	mes "�ƂĂ��B�ƂĂ��厖�ȕ��B";
	mes "�F�B�����ꂽ��؂Șr�ցB^000000";
	next;
	mes "^999999[�L�b�g��]";
	mes "�L�b�g�����̘r�ւ�T���B";
	mes "�����֓|���B";
	mes "�����փL�b�g�����E�����B^000000";
	next;
	mes "�]���̗H�삪���S�ł���悤";
	mes "�@�t�F�C�X���[���̑���";
	mes "�@�r�ւ���������";
	mes "�@���������Ă݂悤�]";
	setquest 114670;
	close;
}

dali.gat,83,67,5	script	�Â����ĎD	857,{
	if($FacewormParty$ == "") {
		mes "�]�����ԁA�V�����L�^���o�Ȃ�������";
		mes "�@�f�����Â��Ȃ�܂����]";
		close;
	}
	mes "�]�t�F�C�X���[���̑��@�L�^�[�]";
	mes "���p�[�e�B�[��";
	mes "^ff0044" +$FacewormParty$+ "^000000";
	mes "���U���^�C��";
	mes "^0000ff" + $FacewormTime/60 + "�� " + $FacewormTime%60 + "�b^000000";
	close;
}

dali.gat,80,60,4	script	���@�w��	755,{
	if(checkquest(12325)&2 && checkquest(118921)&2) {
		mes "�]^0000ff�����ړ��̍��Ղ������܂����B";
		mes "�@�����ړ��@���Ăї��p���邱�Ƃ�";
		mes "�@�\�ɂȂ�܂����B^000000�]";
		delquest 12325;
		delquest 118921;
		close;
	}
	mes "[���@�w��]";
	mes "����ɂ��́B";
	mes "���̗p���ł��傤���H";
	next;
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	switch(select("�����ړ���������","�����ŉ������Ă��邩����","�����X�^�[�̑��ɂ��ĕ���","�p���͖���")) {
	case 1:
		if(BaseLevel < 140) {
			mes "[���@�w��]";
			mes "�����ɓ��ꂷ��̂͂܂������ł��B";
			mes "BaseLv��140�ȏ�ɂȂ�����";
			mes "�܂����Ă��������B";
			close;
		}
		if(checkquest(12325) || checkquest(118921)) {
			mes "[���@�w��]";
			mes "�����ړ��͂ǂ��ł������B";
			mes "�����ړ��͑̂ւ̕��S��";
			mes "�傫�������邻���ł��B";
			next;
			mes "[���@�w��]";
			mes "������x�����ړ����������̂ł�����";
			mes "���΂炭���Ԃ��󂯂Ă���";
			mes "���Ă��������B";
			close;
		}
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[���@�w��]";
			mes "�����ړ�������]�̏ꍇ��";
			mes "�p�[�e�B�[���[�_�[�̕���";
			mes "�葱�������Ă��������B";
			close;
		}
		mdcreate "Faceworm";
		mes "[���@�w��]";
		mes "�p�[�e�B�[����";
		mes '@party$+ "��";
		mes "�p�[�e�B�[���[�_�[��";
		mes '@leader$;
		mes "�ł��ˁB";
		next;
		mes "[���@�w��]";
		mes "�ړ��@���쓮�����܂����B";
		mes "����������������A";
		mes "���̎����ړ��@����A";
		mes "�ړ����Ă��������B";
		close;
	case 2:
		mes "[���@�w��]";
		mes "���͎����̋T����������Ă��܂��B";
		mes "�����ɂ��鎟���ړ��@����";
		mes "���R�ɉߋ��Ɉړ����鎖��";
		mes "�o�����ł���B";
		mes "�������ł��傤�B";
		next;
		mes "[���@�w��]";
		mes "�Ƃ����Ă��c�c";
		mes "���̐��ʂł͂Ȃ���ł����ǂˁB";
		next;
		mes "[���@�w��]";
		mes "�����Ɏ��R�������������̋T���";
		mes "�Ӑ}�ʂ�ɑ���ł���܂łɂ�";
		mes "�����̎��s���낪����܂����B";
		next;
		mes "[���@�w��]";
		mes "�T�􂩂甭������͂�";
		mes "���܂����䂷�鎖���ł���";
		mes "�����ԁA�����͒�؂��Ă����̂ł��B";
		next;
		mes "[���@�w��]";
		mes "�������ŋ߂ɂȂ��āA";
		mes "����1�l�̌����҂�";
		mes "����1�l�̗��j�w�҂�";
		mes "�傫�ȍv���ɂ����";
		mes "���͂ňӐ}�I�ɐ��䂷�鎖��";
		mes "�\�ɂȂ����̂ł��B";
		next;
		mes "[���@�w��]";
		mes "���[���~�b�h�K�b�c����K�ꂽ";
		mes "�`���҂̕��̗͓Y����";
		mes "���Ȃ肠�����悤�ł��B";
		next;
		mes "[���@�w��]";
		mes "�����S�����Ă��邱�̏ꏊ��";
		mes "�߂����Ȃ��������Ȃ��ߋ���";
		mes "�q�����Ă���悤�ł��B";
		mes "�t�F�C�����t�߂ɐ�������";
		mes "�����X�^�[�̑����Ƃ��B";
		mes "�����c�c";
		next;
		mes "[���@�w��]";
		mes "������ʂ����`���҂ɕ����Ă�";
		mes "���ŉ����������̂�";
		mes "�����Ă����l�͂��܂���ł����B";
		next;
		mes "[���@�w��]";
		mes "����Ɍ������ɍs���ė����l������";
		mes "�������ɂ��闧�ĎD��";
		mes "�����̎��Ԃ��L�^���Ă��܂����ˁB";
		mes "����͉��Ȃ̂ł��傤�c�c�B";
		next;
		mes "[���@�w��]";
		mes "�����ƁB���݂܂���B";
		mes "��l�Œ��肷���܂����B";
		mes "���Ȃ��������ړ�����]�ł����H";
		next;
		mes "[���@�w��]";
		mes "���ɂ��郂���X�^�[�͋��͂Ȃ悤�ł��B";
		mes "�r�Ɏ��M�������Ă���]�̂悤�Ȃ�";
		mes "���������ړ��@���쓮�����܂��B";
		mes "���ł������ĉ������B";
		mes "�@";
		mes "�]^ff0000BaseLv140�ȏ�̖`���҂̂�^000000�]";
		close;
	case 3:
		mes "[���@�w��]";
		mes "�ȑO�A�t�F�C�����t�߂�";
		mes "�ʍs�l�������X�^�[�ɏP����";
		mes "��Q���������Ă��܂����B";
		mes "���̐�͂��̃����X�^�[�̑���";
		mes "�q�����Ă���悤�ł��B";
		next;
		mes "[���@�w��]";
		mes "���̃����X�^�[�̔�Q�ɂ������l��";
		mes "�֌W�҂��t�F�C�����ɂ��܂��B";
		mes "�������̒��Ŕ�Q�҂Ɋ֌W�̂��镨��";
		mes "����������A�ނ�ɓn���Ă������";
		mes "�ǂ��ł��傤�B";
		next;
		mes "[���@�w��]";
		mes "�ǂ�������ނ�̂���t�F�C�����܂�";
		mes "����܂��傤���H";
		next;
		if(select("���肢����","��߂Ă���") == 2) {
			mes "[���@�w��]";
			mes "�����ł����B";
			mes "�܂����l�����˂����ނ��Ƃł�";
			mes "�Ȃ��̂�������Ȃ��ł��ˁB";
			close;
		}
		mes "[���@�w��]";
		mes "����ł͂����܂���B";
		close2;
		warp "payon.gat",150,58;
		end;
	case 4:
		mes "[���@�w��]";
		mes "�����ł����B";
		mes "������p�̍ۂ͂����������������B";
		close;
	}
OnInit:
	waitingroom "�t�F�C�X���[��",0;
	end;
}

dali.gat,77,58,4	script	�����ړ��@	10007,{
	if(checkquest(12325)&2 && checkquest(118921)&2) {
		mes "�]^0000ff�����ړ��̍��Ղ������܂����B";
		mes "�@�����ړ��@���Ăї��p���邱�Ƃ�";
		mes "�@�\�ɂȂ�܂����B^000000�]";
		delquest 12325;
		delquest 118921;
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[�����ړ��@]";
		mes "�����ړ��@�́A";
		mes "�p�[�e�B�[��g�񂾏�Ԃ�";
		mes "���p���Ă��������B";
		close;
	}
	mes "[�����ړ��@]";
	mes "�m�F��";
	mes "�c�c";
	next;
	if(BaseLevel < 140) {
		mes "[�����ړ��@]";
		mes "�����ړ��s�\�ł��B";
		mes "�\�͂��s�����Ă��܂��B";
		mes "BaseLv140�ȏ�̔\�͂��K�v�ł��B";
		close;
	}
	if(checkquest(12325) || checkquest(118921)) {
		mes "[�����ړ��@]";
		mes "�ړ��s�A�ړ��s�B";
		mes "�����ړ��̍��Ղ��c���Ă��܂��B";
		mes "���Ԃ��󂯂Ă��痈�Ă��������B";
		close;
	}
	mes "�]�����ړ��@�͐���ɓ��삵�Ă���]";
	next;
	if(select("����","��߂Ă���") == 2) {
		mes "�]���Ȃ��͎����ړ��@���痣�ꂽ�]";
		close;
	}
	switch(mdenter("Faceworm")) {
	case 0:
		announce "[" +strcharinfo(1)+ "]�p�[�e�B�[��[" +strcharinfo(0)+ "]��[Faceworm]�ɓ��ꂵ�܂��B",0x9,0x00ff99;
		setquest 12325;
		setquest 118921;
		donpcevent getmdnpcname("#FacewarmManager")+ "::OnStart";
		//warp "1@face.gat",112,353;
		close;
	default:
		mes "[�����ړ��@]";
		mes "�܂��A�ʘH������������Ă��܂���B";
		mes "���΂炭���҂����������B";
		close;
	}
}

1@face.gat,110,348,6	script	#FacewarmManager	139,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("�P�C�I�X#01");
	hideonnpc getmdnpcname("#��1����");
	hideonnpc getmdnpcname("#��2����");
	hideonnpc getmdnpcname("#��3����");
	hideonnpc getmdnpcname("#��4����");
	hideonnpc getmdnpcname("�P�C�I�X#5");
	hideonnpc getmdnpcname("#�P�C_�k");
	hideonnpc getmdnpcname("#�P�C_��");
	hideonnpc getmdnpcname("#�P�C_��");
	hideonnpc getmdnpcname("#�P�C_��");
	hideonnpc getmdnpcname("�P�C�I�X#�k");
	hideonnpc getmdnpcname("�P�C�I�X#��");
	hideonnpc getmdnpcname("�P�C�I�X#��");
	hideonnpc getmdnpcname("�P�C�I�X#��");
	hideonnpc getmdnpcname("#�P�Con3");
	hideonnpc getmdnpcname("�P�C�I�X#6");
	hideonnpc getmdnpcname("�A�C���X#6");
	hideonnpc getmdnpcname("�����ړ��@#6");
	hideonnpc getmdnpcname("#��1�J��");
	hideonnpc getmdnpcname("#��2�J��");
	hideonnpc getmdnpcname("#��3�J��");
	hideonnpc getmdnpcname("#��4�J��");
	hideonnpc getmdnpcname("#��5�J��");
	hideonnpc getmdnpcname("�古�l�̔�#1");

	areamonster getmdmapname("1@face.gat"),0,0,0,0,"�T�x�[�W",1166,40;
	areamonster getmdmapname("1@face.gat"),0,0,0,0,"�V���叫�R",1277,70;
	areamonster getmdmapname("1@face.gat"),0,0,0,0,"�r�[�g��",1494,40;
	end;
}

1@face.gat,110,348,6	script	�P�C�I�X#0	683,{
	cutin "H_CHAOS01.bmp", 2;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�P�C�I�X]";
		mes "���͂��O��̑�\�҂�";
		mes "�b���Ă�r��������";
		mes "�҂��ĂĂ���邩�H";
		close2;
		cutin "H_CHAOS01.bmp", 255;
		end;
	}
	mes "[�P�C�I�X]";
	mes "��H�@���̌��܋��n���^�[��";
	mes "�����ɗ���Ȃ�Ęb��";
	mes "�����ĂȂ����H";
	unittalk "�P�C�I�X : ��H�@���̌��܋��n���^�[�������ɗ���Ȃ�Ęb�͕����ĂȂ����H";
	next;
	menu "���܋��n���^�[�ł͂���܂���",-;
	mes "["+strcharinfo(0)+"]";
	mes "�Ⴂ�܂��A";
	mes "�������͌��܋��n���^�[�ł�";
	mes "����܂���B";
	unittalk getcharid(3),strcharinfo(0)+" : �Ⴂ�܂��A�������͌��܋��n���^�[�ł͂���܂���B";
	next;
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�Ⴄ�Ȃ炢���񂾁B";
	mes "�ǂ����t�F�C�X���[����";
	mes "�N�̃��m�ł��Ȃ����ȁB";
	unittalk "�P�C�I�X : �Ⴄ�Ȃ炢���񂾁B�ǂ����t�F�C�X���[���͒N�̃��m�ł��Ȃ����ȁB";
	next;
	if(select("�ڂ��������K�v�͂Ȃ�","�t�F�C�X���[���H") == 2) {
		mes "["+strcharinfo(0)+"]";
		mes "�t�F�C�X���[���Ƃ������O��";
		mes "���߂ĕ����܂����B";
		unittalk getcharid(3),strcharinfo(0)+" : �t�F�C�X���[���Ƃ������O�͏��߂ĕ����܂����B";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�{���ɒm��Ȃ��݂������ȁB";
		mes "�܁A����ɉB���ăP�K�ł����ꂽ��";
		mes "���������C�����������ȁB";
		mes "�ȒP�ɐ������Ă���B";
		unittalk "�P�C�I�X : �{���ɒm��Ȃ��݂������ȁB�܁A����ɉB���ăP�K�ł����ꂽ�炱�������C�����������ȁB�ȒP�ɐ������Ă���B";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�t�F�C�X���[�����Ă̂�";
		mes "������ӂɏo�v����A峂݂�����";
		mes "�����X�^�[�̖��O���B";
		mes "�t�F�C�X���[���͓꒣��ӎ���";
		mes "���Ȃ苭���A�N���҂ɂ͗e�͂��Ȃ��B";
		unittalk "�P�C�I�X : �t�F�C�X���[�����Ă̂͂�����ӂɏo�v����A峂݂����ȃ����X�^�[�̖��O���B�t�F�C�X���[���͓꒣��ӎ������Ȃ苭���A�N���҂ɂ͗e�͂��Ȃ��B";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�ڂ������Ԃ͕������Ă��Ȃ���";
		mes "�����ƌĂ΂��i�i�ɋ���";
		mes "�t�F�C�X���[�������鑃��";
		mes "���݂��m�F����Ă���B";
		mes "�����̂��鑃�܂ł̓��̂��";
		mes "�|�т�4�قǔ�������炵���B";
		unittalk "�P�C�I�X : �ڂ������Ԃ͕������Ă��Ȃ��������ƌĂ΂��i�i�ɋ����t�F�C�X���[�������鑃�̑��݂��m�F����Ă���B�����̂��鑃�܂ł̓��̂�͒|�т�4�قǔ�������炵���B";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "���ƁA��d�v�Ȃ��Ƃ������Ă����B";
		mes "������͂��Ȃ�̐����A�ɐB�\�͂�";
		mes "���˔����������X�^�[���B";
		mes "������A��������ۂɏd�v�Ȃ̂�";
		mes "�U���͂ƁA�f�����ɂȂ�B";
		unittalk "�P�C�I�X : ���ƁA��d�v�Ȃ��Ƃ������Ă����B������͂��Ȃ�̐����A�ɐB�\�͂����˔����������X�^�[���B������A��������ۂɏd�v�Ȃ͍̂U���͂ƁA�f�����ɂȂ�B";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "���̂��߂��������̕ӂ���";
		mes "�����t�F�C�X���[�����ǂꂾ������";
		mes "�����ł��邩���A������";
		mes "�r�̂悳�̏ؖ��݂�����";
		mes "�����ɂȂ��Ă�񂾁B";
		unittalk "�P�C�I�X : ���̂��߂��������̕ӂ��Ꮧ���t�F�C�X���[�����ǂꂾ�����������ł��邩���A�����̘r�̂悳�̏ؖ��݂����ȕ����ɂȂ��Ă�񂾁B";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "���Ƃ͂܂��A����ł���f�ނ�";
		mes "��ԂƎ��Ԃ�������΂�����ق�";
		mes "���l��������X���łȁB";
		mes "�ǎ��ȑf�ނ��ق������l�ǂ���";
		mes "��y�Ƒf�ޖړI�Ńt�F�C�X���[��";
		mes "�����^�C���A�^�b�N�Ȃ�Ċ���";
		unittalk "�P�C�I�X : �Ƃ����̂��A����ł���f�ނ͎�ԂƎ��Ԃ�������΂�����قǉ��l��������X���łȁB�ǎ��ȑf�ނ��ق������l�ǂ�����y�Ƒf�ޖړI�Ńt�F�C�X���[�������^�C���A�^�b�N�Ȃ�Ċ���";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "���̏ꏊ�ɂ���Ă����Q���҂�";
		mes "�����I�ɎQ�������Ă�񂾁B";
		mes "����������A���̐�ɐi�ނȂ�";
		mes "�����̈ӎv�Ɋւ�炸�A";
		mes "�^�C���A�^�b�N�Q���Ƃ݂Ȃ���邩��";
		mes "�����Ă����Ƃ��������ȁB";
		unittalk "�P�C�I�X : ���̏ꏊ�ɂ���Ă����Q���҂ɋ����I�ɎQ�������Ă�񂾁B����������A���̐�ɐi�ނȂ玩���̈ӎv�Ɋւ�炸�A�^�C���A�^�b�N�Q���Ƃ݂Ȃ���邩�牯���Ă����Ƃ��������ȁB";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�܁A�����I�ɎQ��������ꂽ�������";
		mes "�����������Ȃ��Ⴂ���Ȃ��Ƃ�";
		mes "�ςɋC�ɂ���K�v�͂Ȃ����H";
		mes "������������Αf�ނ�J�܂�";
		mes "�����̖��Ɗ�]�����Ă����";
		mes "�P�������Șb������ȁB";
		unittalk "�P�C�I�X : �܁A�����I�ɎQ��������ꂽ������đ����������Ȃ��Ⴂ���Ȃ��Ƃ��ςɋC�ɂ���K�v�͂Ȃ����H�@������������Αf�ނ�J�܂ɑ����̖��Ɗ�]�����Ă���ĒP�������Șb������ȁB";
		next;
		cutin "H_CHAOS01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�Ƃ肠�����A�����i�ނȂ�";
		mes "�����܂ŃA�C���X�̃��c��";
		mes "���̎��X�̏󋵂ɂ��āA";
		mes "����������悤�ɂ��Ă������B";
		mes "���邳���Ǝv�����A���΂炭";
		mes "�䖝���Ă���B";
		unittalk "�P�C�I�X : �Ƃ肠�����A�����i�ނȂ犵���܂ŃA�C���X�̃��c�ɂ��̎��X�̏󋵂ɂ��āA����������悤�ɂ��Ă������B���邳���Ǝv�����A���΂炭�䖝���Ă���B";
	}
	close2;
	cutin "H_CHAOS01.bmp", 255;
	donpcevent getmdnpcname("�P�C�I�X#0")+ "::OnStart";
	end;
OnStart:
	hideoffnpc getmdnpcname("�P�C�I�X#01");
	hideonnpc getmdnpcname("�P�C�I�X#0");
	initnpctimer;
	end;
OnTimer5000:
	donpcevent getmdnpcname("�P�C�I�X#01")+"::OnTalk1";
	end;
OnTimer10000:
	donpcevent getmdnpcname("�P�C�I�X#01")+"::OnTalk2";
	end;
OnTimer15000:
	donpcevent getmdnpcname("�A�C���X#0")+"::OnTalk1";
	end;
OnTimer20000:
	donpcevent getmdnpcname("�A�C���X#0")+"::OnTalk2";
	end;
OnTimer25000:
	donpcevent getmdnpcname("�A�C���X#0")+"::OnTalk3";
	end;
OnTimer30000:
	donpcevent getmdnpcname("�P�C�I�X#01")+"::OnTalk3";
	end;
OnTimer35000:
	donpcevent getmdnpcname("�P�C�I�X#01")+"::OnTalk4";
	end;
OnTimer40000:
	donpcevent getmdnpcname("�P�C�I�X#01")+"::OnTalk5";
	end;
OnTimer45000:
	donpcevent getmdnpcname("�A�C���X#0")+"::OnTalk4";
	end;
OnTimer50000:
	donpcevent getmdnpcname("�P�C�I�X#01")+"::OnTalk6";
	end;
OnTimer55000:
	hideonnpc getmdnpcname("�P�C�I�X#01");
	hideonnpc getmdnpcname("�A�C���X#0");
	end;
OnTimer60000:
	stopnpctimer;
	donpcevent getmdnpcname("#��0_mobdead")+"::OnStart";
	donpcevent getmdnpcname("#��0_timer")+"::OnStart";
	announce "�]�^�C���A�^�b�N�J�n�]",0x9,0xffffff,0x190,36;
	end;
}

1@face.gat,110,348,6	script	�P�C�I�X#01	683,{
	end;
OnTalk1:
	unittalk "�P�C�I�X : �������܂����A�I���B�ȊO�ɂ��l������Ƃ͂ȁc�c�B";
	end;
OnTalk2:
	unittalk "�P�C�I�X : �܂��A�������B�ז��������Ȃ��Ȃ�A���B��������f�͂����Ȃ��B";
	end;
OnTalk3:
	unittalk "�P�C�I�X : ��������Ԃ�A���������B";
	end;
OnTalk4:
	unittalk "�P�C�I�X : �������������n�߂Ă���B���̕��̊����́c�c�B";
	end;
OnTalk5:
	unittalk "�P�C�I�X : �A�C���X�I�@�t�F�C�X���[���̋C�z��������B���Ԃ񏗉��̑��͂��̉����I";
	end;
OnTalk6:
	unittalk "�P�C�I�X : �������A�����Еt���ċA�낤�B���ƁA�����̂��O�B�i�ނ���Ȃ�A�t�F�C�X���[���������W�܂��ė��Ă��邩��C��t�����B";
	end;
}

1@face.gat,116,346,3	script	�A�C���X#0	666,{
	cutin "H_IRIS02.bmp", 2;
	mes "[�A�C���X]";
	mes "���߂�ˁ`�B";
	mes "���A���������Ă���r��������";
	mes "��ɂ��Ă����H";
	close2;
	cutin "H_IRIS02.bmp", 255;
	end;
OnTalk1:
	unittalk "�A�C���X : ���[�C�����̂������[��";
	end;
OnTalk2:
	unittalk "�A�C���X : �ււ��A���̍��A�V�C���������ǂ��ăA�C���X���喞����";
	end;
OnTalk3:
	unittalk "�A�C���X : �ǂ��������H�@�P�C�I�X�B�������|���炵�Ă邯�ǁB";
	end;
OnTalk4:
	unittalk "�A�C���X : �����ʂ�ɂ��΂����񂾂�ˁH";
	end;
}

1@face.gat,1,1,0	script	#��0_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("1@face.gat");
	set '@label$,getmdnpcname("#��0_mobdead")+"::OnKilled";
	set '@user,getmapusers('@map$);
	areamonster '@map$,85,325,95,335,"�t�F�C�X���[��",2528,2+'@user,'@label$;
	areamonster '@map$,65,285,75,295,"�t�F�C�X���[��",2528,1+'@user,'@label$;
	areamonster '@map$,65,220,75,230,"�t�F�C�X���[��",2528,1+'@user,'@label$;
	areamonster '@map$,70,156,80,166,"�t�F�C�X���[��",2528,2+'@user,'@label$;
	areamonster '@map$,77,81,87,91,"�t�F�C�X���[��",2528,2+'@user*2,'@label$;
	areamonster '@map$,138,64,148,74,"�t�F�C�X���[��",2528,2+'@user*2,'@label$;
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer1000:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@face.gat"),getmdnpcname("#��0_mobdead")+"::OnKilled");
	if('@count <= 0) {
		donpcevent getmdnpcname("#�{�X��0")+"::OnStart";
		donpcevent getmdnpcname("#�{�X��0_bc")+"::OnStart";
	}
	else
		announce "�]����" +'@count+ "�C�]",0x9,0xffffff,0x190,36;
	end;
}

1@face.gat,1,2,0	script	#��0_timer	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3600000:
	end;
OnStop:
	stopnpctimer;
	end;
}

1@face.gat,1,3,0	script	#�{�X��0	139,{
OnStart:
	if('mob) end;
	announce "�A�C���X : �t�F�C�X���[���������n�߂��I�@���āA�Ȃɂ�����ȉe���������Ɍ������Ă��Ă��I", 0x9, 0x00ffff, 0x190, 20, 0, 0;
	set 'mob,callmonster(getmdmapname("1@face.gat"),145,74,"�_�[�N�t�F�C�X���[��#1",2530,getmdnpcname("#�{�X��0")+"::OnKilled");
	setmobhp 'mob,2600000+getmapusers(getmdmapname("1@face.gat"))*200000;
	set 'mobmax,getmobhp('mob);
	end;
OnKilled:
	set 'mob,0;
	donpcevent getmdnpcname("#�{�X��0_bc")+"::OnStop";
	announce "�A�C���X : �_�[�N�t�F�C�X���[�����o�Ă�������������ˁB���̌����玟�̏ꏊ�ɍs����������B", 0x9, 0xffffff, 0x190, 18, 0, 0;
	hideoffnpc getmdnpcname("#��1�J��");
	hideoffnpc getmdnpcname("#��1����");
	end;
}

1@face.gat,1,4,0	script	#�{�X��0_bc	139,{
OnStart:
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
OnTimer1000:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#�{�X��0"));
	set '@maxhp,getvariableofnpc('mobmax,getmdnpcname("#�{�X��0"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		set '@rate,getmobhp('@boss) / '@maxhp * 100;
		if('@rate > 80) {
			set 'mob[0],callmonster(getmdmapname("1@face.gat"),'@x-4,'@y,"�t�F�C�X���[���̗�",2540,getmdnpcname("#�{�X��0_bc")+"::OnKilled");
			set 'mob[1],callmonster(getmdmapname("1@face.gat"),'@x+4,'@y,"�t�F�C�X���[���̗�",2540,getmdnpcname("#�{�X��0_bc")+"::OnKilled");
		}
		else {
			set 'mob[0],callmonster(getmdmapname("1@face.gat"),'@x-4,'@y,"�t�F�C�X���[���̗�",2540,getmdnpcname("#�{�X��0_bc")+"::OnKilled");
			set 'mob[1],callmonster(getmdmapname("1@face.gat"),'@x+4,'@y,"�t�F�C�X���[���̗�",2540,getmdnpcname("#�{�X��0_bc")+"::OnKilled");
			set 'mob[2],callmonster(getmdmapname("1@face.gat"),'@x,'@y-4,"�t�F�C�X���[���̗�",2540,getmdnpcname("#�{�X��0_bc")+"::OnKilled");
			set 'mob[3],callmonster(getmdmapname("1@face.gat"),'@x,'@y+4,"�t�F�C�X���[���̗�",2540,getmdnpcname("#�{�X��0_bc")+"::OnKilled");
		}
	}
	end;
OnTimer12000:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#�{�X��0"));
	if('@boss) {
		for(set '@i,0;'@i<3;set '@i,'@i+1) {
			if('mob['@i]) {
				set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob['@i]);
				if('@dummy == -1)
					break;
				monster '@map$,'@x,'@y,"�t�F�C�X���[���̗c��",2541,1;
				set '@num,'@num+1;
				set '@dummy,removemonster('mob['@i]);
				set 'mob['@i],0;
			}
		}
		if('@num > 0) {
			announce "�A�C���X : �_�[�N�t�F�C�X���[��������" +'@num+ "�H�ׂāA���C�����߂����݂����c�c�B��������ˁc�c�B", 0x9, 0xff00ee, 0x190, 18, 0, 0;
			setmobhp '@boss,getmobhp('@boss)+50000*'@num;	// ������
		}
	}
	end;
OnTimer13000:
	initnpctimer;
	end;
OnKilled:
	end;
}

1@face.gat,149,92,0	script	#��1����	45,2,2,{
	if(BaseLevel < 160)
		getexp 10000000,0;
	else
		getexp 20000000,0;
	warp getmdmapname("1@face.gat"),127,95;
	end;
}

1@face.gat,120,97,6	script	�P�C�I�X#1	683,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		// ������
		mes "[�P�C�I�X]";
		mes "���͂��O��̑�\�҂�";
		mes "�b���Ă�r��������";
		mes "�҂��ĂĂ���邩�H";
		close2;
		cutin "H_CHAOS01.bmp", 255;
		end;
	}
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�����ǂ������̂��B";
	mes "�Ȃ��Ȃ���邶��Ȃ����B";
	unittalk "�P�C�I�X : �����ǂ������̂��B�Ȃ��Ȃ���邶��Ȃ����B";
	next;
	menu "�������́c�c",-;
	mes "["+strcharinfo(0)+"]";
	mes "�������̃����X�^�[��";
	mes "�����̎�Ȃ�ł����H";
	unittalk getcharid(3),strcharinfo(0)+" : �������̃����X�^�[�������̎�Ȃ�ł����H";
	next;
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "����A�����t�F�C�X���[����";
	mes "����Ȃ��񂶂�Ȃ��B";
	unittalk "�P�C�I�X : ����A�����t�F�C�X���[���͂���Ȃ��񂶂�Ȃ��B";
	next;
	mes "[�P�C�I�X]";
	mes "�������̓z�̓t�F�C�X���[���̈��킾�B";
	mes "����Ƃ͌����Ă��A�����܂�";
	mes "���낵���z����Ȃ����ǂȁB";
	unittalk "�P�C�I�X : �������̓z�̓t�F�C�X���[���̈��킾�B����Ƃ͌����Ă��A�����܂ŋ��낵���z����Ȃ����ǂȁB";
	next;
	mes "[�P�C�I�X]";
	mes "�������B�t�F�C�X���[������";
	mes "��ɓ����Ȃ񂾂��A";
	mes "�ӊO�Ǝg���邩������Ȃ����B";
	unittalk "�P�C�I�X : �������B�t�F�C�X���[�������ɓ����Ȃ񂾂��A�ӊO�Ǝg���邩������Ȃ����B";
	next;
	cutin "H_IRIS01.bmp", 2;
	mes "[�A�C���X]";
	mes "�����ǐ퓬�����т���";
	mes "��ɃL�Y���t���̂�ˁ`�B";
	mes "�ꌾ�ł����Ύg�����ɂȂ�Ȃ�";
	mes "�Ȃ����Ⴄ�́B";
	donpcevent getmdnpcname("�A�C���X#1")+"::OnTalk1";
	next;
	cutin "H_IRIS02.bmp", 2;
	mes "[�A�C���X]";
	mes "�芵�ꂽ�n���^�[������";
	mes "�f�������m�ɏ㓙�Ȕ��";
	mes "��鎖���ł���炵����B";
	donpcevent getmdnpcname("�A�C���X#1")+"::OnTalk2";
	next;
	mes "[�A�C���X]";
	mes "�P�C�I�X�����M�����ˁH";
	donpcevent getmdnpcname("�A�C���X#1")+"::OnTalk3";
	next;
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "���������ȁI";
	mes "���̓}�O�i���u���C�N����";
	mes "�g���Ȃ��񂾂�I";
	mes "�S���R���ĂȂ��Ȃ����܂���I";
	unittalk "�P�C�I�X : ���������ȁI�@���̓}�O�i���u���C�N�����g���Ȃ��񂾂�I�@�S���R���ĂȂ��Ȃ����܂���I";
	next;
	cutin "H_IRIS01.bmp", 2;
	mes "[�A�C���X]";
	mes "�܂������c�c�I�@�g���Ȃ��P�C�I�X�B";
	donpcevent getmdnpcname("�A�C���X#1")+"::OnTalk4";
	next;
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�Ƃɂ������������_���Ă���z��";
	mes "�����ɂ����Ȃ������悤���B";
	mes "�������͐�ɍs�����炨�O��";
	mes "�C�������B";
	unittalk "�P�C�I�X : �Ƃɂ������������_���Ă���z�͂����ɂ����Ȃ������悤���B�������͐�ɍs�����炨�O���C�������B";
	next;
	hideonnpc getmdnpcname("�P�C�I�X#1");
	cutin "H_IRIS01.bmp", 2;
	mes "[�A�C���X]";
	mes "�P�C�I�X!?";
	mes "�܂���������Ĉ�l�Ő摖���āc�c";
	mes "�҂��Ȃ����I";
	donpcevent getmdnpcname("�A�C���X#1")+"::OnTalk5";
	close2;
	cutin "H_IRIS02.bmp", 255;
	hideonnpc getmdnpcname("�A�C���X#1");
	initnpctimer;
	viewpoint 1, 116, 292, 1, 0xFF8000;
	viewpoint 1, 163, 239, 2, 0xFF8000;
	viewpoint 1, 203, 286, 3, 0xFF8000;
	viewpoint 1, 99, 206, 4, 0xFF8000;
	donpcevent getmdnpcname("#��1_mobdead")+"::OnStart";
	donpcevent getmdnpcname("#��1_timer")+"::OnStart";
	announce "�A�C���X : ���̕ӂ�̃t�F�C�X���[���͎���ɗc�����������񂢂�݂����B", 0x9, 0x00ffff, 0x190, 18, 0, 0;
	end;
OnTimer3000:
	announce "�A�C���X : ���ڂ݂��Ƃɗc���̐��͈Ⴄ�݂��������ǁc�c�ł��邾���ߊ��Ȃ��悤�ɂˁI", 0x9, 0x00ffff, 0x190, 18, 0, 0;
	end;
}
1@face.gat,129,97,3	script	�A�C���X#1	666,{
	cutin "H_IRIS02.bmp", 2;
	mes "[�A�C���X]";
	mes "�P�C�I�X�͐M�����钇�Ԃ�B";
	mes "�܂��A�}�O�i���u���C�N����";
	mes "�g���Ȃ��񂾂��ǁc�c�B";
	close2;
	cutin "H_IRIS02.bmp", 255;
	end;
OnTalk1:
	unittalk "�A�C���X : �����ǐ퓬�����т��Ɣ�ɃL�Y���t���̂�ˁ`�B�ꌾ�ł����Ύg�����ɂȂ�Ȃ��Ȃ����Ⴄ�́B";
	end;
OnTalk2:
	unittalk "�A�C���X : �芵�ꂽ�n���^�[�����͑f�������m�ɏ㓙�Ȕ����鎖���ł���炵����B";
	end;
OnTalk3:
	unittalk "�A�C���X : �P�C�I�X�����M�����ˁH";
	end;
OnTalk4:
	unittalk "�A�C���X : �܂������c�c�I�@�g���Ȃ��P�C�I�X�B";
	end;
OnTalk5:
	unittalk "�A�C���X : �P�C�I�X!?�@�܂���������Ĉ�l�Ő摖���āc�c�҂��Ȃ����I";
	end;
}

1@face.gat,1,1,0	script	#��1_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("1@face.gat");
	set '@label$,getmdnpcname("#��1_mobdead")+"::OnKilled";
	set '@user,getmapusers('@map$);
	areamonster '@map$,111,287,121,297,"�t�F�C�X���[��",2528,3+'@user,'@label$;
	areamonster '@map$,158,234,168,244,"�t�F�C�X���[��",2528,2+'@user*2,'@label$;
	areamonster '@map$,198,281,208,291,"�t�F�C�X���[��",2528,2+'@user*2,'@label$;
	areamonster '@map$,94,201,104,211,"�t�F�C�X���[��",2528,3+'@user,'@label$;
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer1000:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@face.gat"),getmdnpcname("#��1_mobdead")+"::OnKilled");
	if('@count <= 0) {
		donpcevent getmdnpcname("#�{�X��1")+"::OnStart";
	}
	else
		announce "�]����" +'@count+ "�C�]",0x9,0xffffff,0x190,36;
	end;
}

1@face.gat,1,2,0	script	#��1_timer	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3600000:
	end;
OnStop:
	stopnpctimer;
	end;
}

1@face.gat,1,3,0	script	#�{�X��1	139,{
OnStart:
	if('mob) end;
	announce "�A�C���X : �t�F�C�X���[���������n�߂��I�@���āA�Ȃɂ�����ȉe���������Ɍ������Ă��Ă��I", 0x9, 0x00ffff, 0x190, 20, 0, 0;
	set 'mob,callmonster(getmdmapname("1@face.gat"),165,270,"�_�[�N�t�F�C�X���[��#2",2530,getmdnpcname("#�{�X��1")+"::OnKilled");
	setmobhp 'mob,2600000+getmapusers(getmdmapname("1@face.gat"))*200000;
	end;
OnKilled:
	set 'mob,0;
	announce "�A�C���X : ��̕�����傫�ȉ�������������B��ɂ����Ύ��̏ꏊ�̎肪���肪���邩���I", 0x9, 0xffffff, 0x190, 18, 0, 0;
	hideoffnpc getmdnpcname("#��2�J��");
	hideoffnpc getmdnpcname("#��2����");
	end;
}

1@face.gat,139,100,0	script	#��2����	45,2,2,{
	if(BaseLevel < 160)
		getexp 10000000,0;
	else
		getexp 20000000,0;
	warp getmdmapname("1@face.gat"),155,113;
	end;
}

1@face.gat,153,113,7	script	�P�C�I�X#2	683,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		// ������
		mes "[�P�C�I�X]";
		mes "���͂��O��̑�\�҂�";
		mes "�b���Ă�r��������";
		mes "�҂��ĂĂ���邩�H";
		close2;
		cutin "H_CHAOS01.bmp", 255;
		end;
	}
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "���O��A�����Ǝ芵��Ă���ȁB";
	mes "�����A���f����Ȃ�B";
	mes "���̋��J�́A����܂ňȏ�Ɋ댯���B";
	unittalk "�P�C�I�X : ���O��A�����Ǝ芵��Ă���ȁB�����A���f����Ȃ�B���̋��J�́A����܂ňȏ�Ɋ댯���B";
	next;
	cutin "H_IRIS01.bmp", 2;
	mes "[�A�C���X]";
	mes "�����A���������ȁc�c�B";
	mes "�˂��A�����s������P�C�I�X�B";
	donpcevent getmdnpcname("�A�C���X#2")+"::OnTalk1";
	next;
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�܂��A����������������";
	mes "�������͐�ɍs�����B";
	mes "���Ă���Ȃ�C�������B";
	unittalk "�P�C�I�X : �܂��A���������������牴�����͐�ɍs�����B���Ă���Ȃ�C�������B";
	close2;
	cutin "H_CHAOS01.bmp", 255;
	hideonnpc getmdnpcname("�P�C�I�X#2");
	hideonnpc getmdnpcname("�A�C���X#2");
	viewpoint 1, 182, 127, 1, 0xFF8000;
	viewpoint 1, 166, 210, 2, 0xFF8000;
	viewpoint 1, 315, 335, 3, 0xFF8000;
	viewpoint 1, 221, 317, 4, 0xFF8000;
	donpcevent getmdnpcname("#��2_mobdead")+"::OnStart";
	donpcevent getmdnpcname("#��2_timer")+"::OnStart";
	donpcevent getmdnpcname("#�ғœD_timer")+"::OnStart";
	end;
}
1@face.gat,160,113,1	script	�A�C���X#2	666,{
	end;
OnTalk1:
	unittalk "�A�C���X : �����A���������ȁc�c�B�˂��A�����s������P�C�I�X�B";
	end;
}

1@face.gat,1,1,0	script	#��2_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("1@face.gat");
	set '@label$,getmdnpcname("#��2_mobdead")+"::OnKilled";
	set '@user,getmapusers('@map$);
	areamonster '@map$,177,122,187,132,"�t�F�C�X���[��",2528,3+'@user,'@label$;
	areamonster '@map$,161,205,171,215,"�t�F�C�X���[��",2528,3+'@user,'@label$;
	areamonster '@map$,310,330,320,340,"�t�F�C�X���[��",2528,2+'@user*2,'@label$;
	areamonster '@map$,216,312,226,322,"�t�F�C�X���[��",2528,2+'@user*2,'@label$;
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer1000:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@face.gat"),getmdnpcname("#��2_mobdead")+"::OnKilled");
	if('@count <= 0) {
		donpcevent getmdnpcname("#�{�X��2")+"::OnStart";
		donpcevent getmdnpcname("#�{�X��2_bc")+"::OnStart";
	}
	else
		announce "�]����" +'@count+ "�C�]",0x9,0xffffff,0x190,36;
	end;
}

1@face.gat,1,2,0	script	#��2_timer	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3600000:
	end;
OnStop:
	stopnpctimer;
	end;
}

1@face.gat,1,3,0	script	#�{�X��2	139,{
OnStart:
	if('mob) end;
	announce "�A�C���X : �t�F�C�X���[���������n�߂��I�@���āA�Ȃɂ�����ȉe���������Ɍ������Ă��Ă��I", 0x9, 0x00ffff, 0x190, 20, 0, 0;
	set 'mob,callmonster(getmdmapname("1@face.gat"),277,305,"�_�[�N�t�F�C�X���[��#3",2530,getmdnpcname("#�{�X��2")+"::OnKilled");
	setmobhp 'mob,2600000+getmapusers(getmdmapname("1@face.gat"))*200000;
	set 'mobmax,getmobhp('mob);
	end;
OnKilled:
	set 'mob,0;
	donpcevent getmdnpcname("#�{�X��2_bc")+"::OnStop";
	announce "�A�C���X : ��̕�����΂����ꗎ���鉹�����������I�@�����Ă݂悤�I", 0x9, 0xffffff, 0x190, 18, 0, 0;
	hideoffnpc getmdnpcname("#��3�J��");
	hideoffnpc getmdnpcname("#��3����");
	end;
}

1@face.gat,1,4,0	script	#�{�X��2_bc	139,{
OnStart:
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
OnTimer8000:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#�{�X��2"));
	set '@maxhp,getvariableofnpc('mobmax,getmdnpcname("#�{�X��2"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		set '@rate,getmobhp('@boss) / '@maxhp * 100;
		if('@rate > 80) {
			setarray '@xr,3,3,3,3,1,1,1,1,-1,-1,-1,-1,-3,-3,-3,-3;
			setarray '@yr,3,1,-1,-3,3,1,-1,-3,3,1,-1,-3,3,1,-1,-3;
			for(set '@i,0;'@i<getarraysize('@xr);set '@i,'@i+1) {
				monster getmdmapname("1@face.gat"),'@x+'@xr['@i],'@y+'@yr['@i],"�ғő�",2531,1,getmdnpcname("#�{�X��2_bc")+"::OnKilled";
			}
		}
		else {
			setarray '@xr,5,5,5,5,5,5,3,3,3,3,3,3,1,1,1,1,1,1,-1,-1,-1,-1,-1,-1,-3,-3,-3,-3,-3,-3,-5,-5,-5,-5,-5,-5;
			setarray '@yr,5,3,1,-1,-3,-5,5,3,1,-1,-3,-5,5,3,1,-1,-3,-5,5,3,1,-1,-3,-5,5,3,1,-1,-3,-5,5,3,1,-1,-3,-5;
			for(set '@i,0;'@i<getarraysize('@xr);set '@i,'@i+1) {
				monster getmdmapname("1@face.gat"),'@x+'@xr['@i],'@y+'@yr['@i],"�ғő�",2531,1,getmdnpcname("#�{�X��2_bc")+"::OnKilled";
			}
		}
	}
	end;
OnTimer16000:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#�{�X��2"));
	if('@boss) {
		set '@count,getmapmobs(getmdmapname("1@face.gat"),getmdnpcname("#�{�X��2_bc")+"::OnKilled");
		if('@count > 0) {
			announce "�A�C���X : ����A������ƁI�@�_�[�N�t�F�C�X���[�����ғő܂������ɂӂ肩���đ̗͉񕜂����݂���!?", 0x9, 0x66ff00, 0x190, 18, 0, 0;
			setmobhp '@boss,getmobhp('@boss)+120000;
		}
	}
	initnpctimer;
	end;
OnKilled:
	end;
}

1@face.gat,248,185,0	script	#��3����	45,2,2,{
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 2, 1, 1, 2, 0xFFFFFF;
	viewpoint 2, 1, 1, 3, 0xFFFFFF;
	viewpoint 2, 1, 1, 4, 0xFFFFFF;
	viewpoint 2, 1, 1, 5, 0xFFFFFF;
	viewpoint 2, 1, 1, 6, 0xFFFFFF;
	if(BaseLevel < 160)
		getexp 10000000,0;
	else
		getexp 20000000,0;
	warp getmdmapname("1@face.gat"),261,170;
	end;
}

1@face.gat,261,169,0	script	#�P�Con	139,3,3,{
OnTouch:
	hideonnpc;
	initnpctimer;
	donpcevent getmdnpcname("#��3_timer")+"::OnStart";
	donpcevent getmdnpcname("#��3_mobdead")+"::OnStart";
	donpcevent getmdnpcname("#��3_�ғŒn��")+"::OnStart";
	viewpoint 1, 268, 126, 1, 0xFF8000;
	end;
OnTimer3000:
	announce "�P�C�I�X : �����A���̕ӂ�͖ғŒn�т�����C��t���Đi�߁B�łɐG��Ȃ��悤�ɂ����B", 0x9, 0xffff00, 0x190, 18, 0, 0;
	end;
OnTimer6000:
	announce "�P�C�I�X : �������͑��̑���T���Ă��邩��Ȃ񂩂̍��Ղ���������m�点�Ă���B", 0x9, 0xffff00, 0x190, 18, 0, 0;
	end;
OnTimer9000:
	announce "�P�C�I�X : ����́c�c�ғŒn�т͈̔͂��ω����Ă���̂��H", 0x9, 0xffff00, 0x190, 18, 0, 0;
	end;
OnTimer11000:
	stopnpctimer;
	announce "�P�C�I�X : �C������I�@�ғŒn�т̉e�����󂯂Ȃ��ꏊ��T���Đ킦�I", 0x9, 0xffff00, 0x190, 18, 0, 0;
	end;
}

1@face.gat,1,1,0	script	#��3_�ғŒn��	139,{
OnStart:
OnTimer30000:
	initnpctimer;
	for(set '@i,0;'@i<40;set '@i,'@i+5) {
		for(set '@j,0;'@j<40;set '@j,'@j+5) {
			monster getmdmapname("1@face.gat"),249+'@i,106+'@j,"�ғő�",2536,1,getmdnpcname("#��3_�ғŒn��")+"::OnKilled";
		}
	}
	end;
OnKilled:
	end;
}

1@face.gat,1,1,0	script	#��3_mobdead	139,{
OnStart:
	set '@map$,getmdmapname("1@face.gat");
	set '@label$,getmdnpcname("#��3_mobdead")+"::OnKilled";
	set '@user,getmapusers('@map$);
	areamonster '@map$,258,116,278,136,"�t�F�C�X���[��",2528,9+'@user,'@label$;
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer1000:
	stopnpctimer;
	set '@count,getmapmobs(getmdmapname("1@face.gat"),getmdnpcname("#��3_mobdead")+"::OnKilled");
	if('@count <= 0) {
		donpcevent getmdnpcname("#�{�X��3")+"::OnStart";
		donpcevent getmdnpcname("#�{�X��3_bc")+"::OnStart";
	}
	else
		announce "�]����" +'@count+ "�C�]",0x9,0xffffff,0x190,36;
	end;
}

1@face.gat,1,2,0	script	#��3_timer	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3600000:
	end;
OnStop:
	stopnpctimer;
	end;
}

1@face.gat,1,3,0	script	#�{�X��3	139,{
OnStart:
	if('mob) end;
	announce "�A�C���X : ���̕����牽���̋��ѐ�����������c�c�B���ɍs���Ă݂悤�B", 0x9, 0xffffff, 0x190, 20, 0, 0;
	set 'mob,callmonster(getmdmapname("1@face.gat"),213,110,"�_�[�N�t�F�C�X���[��#4",2530,getmdnpcname("#�{�X��3")+"::OnKilled");
	setmobhp 'mob,2600000+getmapusers(getmdmapname("1@face.gat"))*200000;
	set 'mobmax,getmobhp('mob);
	end;
OnKilled:
	set 'mob,0;
	donpcevent getmdnpcname("#�{�X��3_bc")+"::OnStop";
	announce "�A�C���X : �΂����ꗎ���鉹�����������c�c�B���̒ʘH���݂������݂����B", 0x9, 0xffffff, 0x190, 18, 0, 0;
	hideoffnpc getmdnpcname("#��4�J��");
	hideoffnpc getmdnpcname("#��4����");
	end;
}

1@face.gat,1,4,0	script	#�{�X��3_bc	139,{
OnStart:
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
OnTimer15000:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#�{�X��3"));
	set '@maxhp,getvariableofnpc('mobmax,getmdnpcname("#�{�X��3"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		set '@rate,getmobhp('@boss) / '@maxhp * 100;
		if('@rate > 80) {
			setarray '@xr,5,5,5,0,0,0,-5,-5,-5;
			setarray '@yr,5,0,-5,5,0,-5,5,0,-5;
			for(set '@i,0;'@i<getarraysize('@xr);set '@i,'@i+1) {
				monster getmdmapname("1@face.gat"),'@x+'@xr['@i],'@y+'@yr['@i],"#�ŗ��܂�",2536,1,getmdnpcname("#�{�X��3_bc")+"::OnKilled";
			}
		}
		else {
			setarray '@xr,5,5,5,0,0,0,-5,-5,-5;
			setarray '@yr,5,0,-5,5,0,-5,5,0,-5;
			for(set '@i,0;'@i<getarraysize('@xr);set '@i,'@i+1) {
				monster getmdmapname("1@face.gat"),'@x+'@xr['@i],'@y+'@yr['@i],"#�ŗ��܂�",2536,1,getmdnpcname("#�{�X��3_bc")+"::OnKilled";
			}
		}
	}
	initnpctimer;
	end;
OnKilled:
	end;
}

1@face.gat,204,122,0	script	#��4����	45,2,2,{
	if(BaseLevel < 160)
		getexp 10000000,0;
	else
		getexp 20000000,0;
	warp getmdmapname("1@face.gat"),210,145;
	end;
}

1@face.gat,213,147,0	script	#�P�Con2	139,3,3,{
OnTouch:
	hideonnpc;
	initnpctimer;
	end;
OnTimer1000:
	donpcevent getmdnpcname("�P�C�I�X#4")+"::OnTalk1";
	end;
OnTimer4000:
	donpcevent getmdnpcname("�A�C���X#4")+"::OnTalk1";
	end;
OnTimer6000:
	donpcevent getmdnpcname("�P�C�I�X#4")+"::OnTalk2";
	end;
OnTimer9000:
	donpcevent getmdnpcname("�A�C���X#4")+"::OnTalk2";
	end;
OnTimer12000:
	donpcevent getmdnpcname("�P�C�I�X#4")+"::OnTalk3";
	end;
OnTimer17000:
	hideonnpc getmdnpcname("�P�C�I�X#4");
	end;
OnTimer20000:
	donpcevent getmdnpcname("�A�C���X#4")+"::OnTalk3";
	end;
OnTimer27000:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk1";
	end;
OnTimer29000:
	donpcevent getmdnpcname("�A�C���X#4")+"::OnTalk4";
	end;
OnTimer31000:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk2";
	end;
OnTimer31200:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk3";
	end;
OnTimer31400:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk4";
	end;
OnTimer31600:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk5";
	end;
OnTimer31800:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk6";
	end;
OnTimer32000:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk7";
	end;
OnTimer32200:
	donpcevent getmdnpcname("�P�C�I�X#5")+"::OnTalk8";
	end;
OnTimer37000:
	hideoffnpc getmdnpcname("�P�C�I�X#4");
	end;
OnTimer40000:
	donpcevent getmdnpcname("�P�C�I�X#4")+"::OnTalk4";
	end;
OnTimer43000:
	donpcevent getmdnpcname("�A�C���X#4")+"::OnTalk5";
	end;
OnTimer46000:
	donpcevent getmdnpcname("�P�C�I�X#4")+"::OnTalk5";
	end;
OnTimer52000:
	hideonnpc getmdnpcname("�P�C�I�X#4");
	end;
OnTimer53000:
	donpcevent getmdnpcname("�A�C���X#4")+"::OnTalk6";
	misceffect 1021, getmdnpcname("�P�C�I�X#5");
	misceffect 247, getmdnpcname("�P�C�I�X#5");
	end;
OnTimer58000:
	hideonnpc getmdnpcname("�A�C���X#4");
	end;
OnTimer67000:
	donpcevent getmdnpcname("#������4")+"::OnStart";
	donpcevent getmdnpcname("#������4_timer")+"::OnStart";
	end;
OnTimer77000:
	stopnpctimer;
	donpcevent getmdnpcname("#������4_bc")+"::OnStart";
	end;
}

1@face.gat,213,153,6	script	�P�C�I�X#5	683,{
	end;
OnTalk1:
	unittalk "�P�C�I�X : ���킠���I�@��������I";
	end;
OnTalk2:
	unittalk "�P�C�I�X : ��";
	end;
OnTalk3:
	unittalk "�P�C�I�X : ����";
	end;
OnTalk4:
	unittalk "�P�C�I�X : ���킠";
	end;
OnTalk5:
	unittalk "�P�C�I�X : ���킠��";
	end;
OnTalk6:
	unittalk "�P�C�I�X : ���킠����";
	end;
OnTalk7:
	unittalk "�P�C�I�X : ���킠������";
	end;
OnTalk8:
	unittalk "�P�C�I�X : ���킠��������!!";
	end;
}

1@face.gat,208,149,7	script	�P�C�I�X#4	683,{
	cutin "H_CHAOS01.bmp", 2;
	mes "[�P�C�I�X]";
	mes "�����͖{���ɕςȌ����ȁB";
	close2;
	cutin "H_CHAOS01.bmp", 255;
	end;
OnTalk1:
	unittalk "�P�C�I�X : �A�C���X�A���̌��������킩�邩�H";
	end;
OnTalk2:
	unittalk "�P�C�I�X : �d���Ȃ��A�������܂ō~��Ă݂�B";
	end;
OnTalk3:
	unittalk "�P�C�I�X : ���v�A�����ɖ߂��Ă���B";
	end;
OnTalk4:
	unittalk "�P�C�I�X : ���Ԃ˂��A����������ƂŃG�T�ɂȂ�Ƃ��낾�����B";
	end;
OnTalk5:
	unittalk "�P�C�I�X : �����A�{�苶���Ă��鏗���t�F�C�X���[�����o���ė��Ă�񂾁B���Ȃ�{���Ă���݂����������U�B��悤�B";
	end;
}

1@face.gat,220,149,1	script	�A�C���X#4	666,{
	cutin "H_IRIS01.bmp", 2;
	mes "[�A�C���X]";
	mes "�������C�z������c�c�B";
	mes "�����͊�Ȃ���I";
	close2;
	cutin "H_IRIS01.bmp", 255;
	end;
OnTalk1:
	unittalk "�A�C���X : ���`��A�t�F�C�X���[���̑��Ƃ��Ă͑傫�����邵�c�c�B";
	end;
OnTalk2:
	unittalk "�A�C���X : �P�C�I�X!?�@��Ȃ���I";
	end;
OnTalk3:
	unittalk "�A�C���X : �����A���̃o�J�P�C�I�X�c�c�B";
	end;
OnTalk4:
	unittalk "�A�C���X : �P�C�I�X�I�@�ǂ�������!?";
	end;
OnTalk5:
	unittalk "�A�C���X : ������������!?";
	end;
OnTalk6:
	unittalk "�A�C���X : ���́c�c�o�J�P�C�I�X�I";
	end;
}

1@face.gat,1,2,0	script	#������4_timer	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3600000:
	end;
OnStop:
	stopnpctimer;
	end;
}

1@face.gat,1,3,0	script	#������4	139,{
OnStart:
	if('mob) end;
	set 'users,getmapusers(getmdmapname("1@face.gat"));
	set 'mob,callmonster(getmdmapname("1@face.gat"),213,153,"�����t�F�C�X���[��",2529,getmdnpcname("#������4")+"::OnKilled");
	setmobhp 'mob,26000000+'users*2000000;
	set 'mobmax,getmobhp('mob);
	set 'oldhp,'mobmax;
	end;
OnSpawn:
	if('mob) {
		set 'hp,getmobhp('mob);
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'mob);
		if('oldhp - 'hp > ('users + 7) * 400000) {
			announce "�A�C���X : �����������t�F�C�X���[�������\������!!�@�������ȏ�ɍU���͂������Ă邩��C�����āI", 0x9, 0xff3333, 0x190, 15, 0, 0;
			set '@mobid,2532;
		}
		else if( (('@x < 190) || ('@x > 230)) || (('@y < 135) || ('@y > 175)) ) {
			announce "�A�C���X : �����痣�ꂷ������I�@�����痣�ꂷ����ƁA�����t�F�C�X���[�������������܂ł͋��\�ɂȂ邩��C�����āI", 0x9, 0xff3333, 0x190, 15, 0, 0;
			set '@mobid,2532;
		}
		else {
			switch(rand(5)) {
			case 0:
				announce "�A�C���X : �܂����c�c�B�����t�F�C�X���[�����n�����ɒE�炵���݂����c�c�B", 0x9, 0x55ff00, 0x190, 18, 0, 0;
				set '@mobid,2533;
				break;
			case 1:
				announce "�A�C���X : �܂����c�c�B�����t�F�C�X���[�����������ɒE�炵���݂����c�c�B", 0x9, 0x9999ff, 0x190, 18, 0, 0;
				set '@mobid,2534;
				break;
			case 2:
				announce "�A�C���X : �܂����c�c�B�����t�F�C�X���[�����������ɒE�炵���݂����c�c�B", 0x9, 0xffff00, 0x190, 18, 0, 0;
				set '@mobid,2535;
				break;
			case 3:
			default:
				announce "�A�C���X : �����t�F�C�X���[���̎p�����ɖ߂�����I", 0x9, 0xffffff, 0x190, 18, 0, 0;
				set '@mobid,2529;
				break;
			}
		}
		set 'oldhp,'hp;
		set '@dummy,removemonster(getvariableofnpc('mob,getmdnpcname("#������4")));
		set 'mob,callmonster(getmdmapname("1@face.gat"),'@x,'@y,"�����t�F�C�X���[��",'@mobid,getmdnpcname("#������4")+"::OnKilled");
		setmobhp 'mob,'hp;
	}
	end;
OnDamage:
	if('mob) {
		set 'hp,getmobhp('mob);
		set '@users,getmapusers(getmdmapname("1@face.gat"));
		set '@damage,10000 * rand(20,('@users+7)*25);
		set '@facehp,'hp - '@damage;
		if('facehp < 5000000)
			set '@facehp,5000000;
		setmobhp 'mob,'@facehp;
		announce "�A�C���X : �������P�C�I�X�I�@�U���́A�����t�F�C�X���[���Ɍ����Ă�݂����I", 0x9, 0xffffff, 0x190, 18, 0, 0;
	}
	end;
OnKilled:
	set 'mob,0;
	donpcevent getmdnpcname("#������4_bc")+"::OnStop";
	hideonnpc getmdnpcname("#�P�Con3");
	hideoffnpc getmdnpcname("�P�C�I�X#6");
	hideoffnpc getmdnpcname("�A�C���X#6");
	hideoffnpc getmdnpcname("�古�l�̔�#1");
	end;
}

1@face.gat,1,4,0	script	#������4_bc	139,{
OnStop:
	stopnpctimer;
	end;
OnStart:
	initnpctimer;
	set '@boss,getvariableofnpc('mob,getmdnpcname("#������4"));
	set '@maxhp,getvariableofnpc('mobmax,getmdnpcname("#������4"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		switch(rand(1,3)) {
		case 1:
			set '@rate,getmobhp('@boss) / '@maxhp * 100;
			if('@rate > 70) {
				setarray '@xr,-3,-3,3,3;
				setarray '@yr,-3,3,-3,3;
				for(set '@i,0;'@i<getarraysize('@xr);set '@i,'@i+1) {
					monster getmdmapname("1@face.gat"),'@x+'@xr['@i],'@y+'@yr['@i],"#�ŗ��܂�",2536,1,getmdnpcname("#������4_bc")+"::OnKilled";
				}
			}
			else {
				setarray '@xr,5,5,5,0,0,0,-5,-5,-5;
				setarray '@yr,5,0,-5,5,0,-5,5,0,-5;
				for(set '@i,0;'@i<getarraysize('@xr);set '@i,'@i+1) {
					monster getmdmapname("1@face.gat"),'@x+'@xr['@i],'@y+'@yr['@i],"#�ŗ��܂�",2536,1,getmdnpcname("#������4_bc")+"::OnKilled";
				}
			}
		case 2:
		case 3:
		}
	}
	end;
OnTimer5000:
	donpcevent getmdnpcname("#������4")+"::OnSpawn";
	end;
OnTimer6000:
	set 'chaos,rand(6);
	switch('chaos) {
	case 0:
		announce "�P�C�I�X : �����I�@�k�̕��ɓz��U���I�@���̈ꌂ�������Ă��I", 0x9, 0xff44aa, 0x190, 18, 0, 0;
		donpcevent getmdnpcname("�P�C�I�X#�k")+"::OnStart";
		hideoffnpc getmdnpcname("#�P�C_�k");
		hideoffnpc getmdnpcname("�P�C�I�X#�k");
		end;
	case 1:
		announce "�P�C�I�X : �����I�@��̕��ɓz��U���I�@���̈ꌂ�������Ă��I", 0x9, 0xff44aa, 0x190, 18, 0, 0;
		donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStart";
		hideoffnpc getmdnpcname("#�P�C_��");
		hideoffnpc getmdnpcname("�P�C�I�X#��");
		end;
	case 2:
		announce "�P�C�I�X : �����I�@���̕��ɓz��U���I�@���̈ꌂ�������Ă��I", 0x9, 0xff44aa, 0x190, 18, 0, 0;
		donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStart";
		hideoffnpc getmdnpcname("#�P�C_��");
		hideoffnpc getmdnpcname("�P�C�I�X#��");81
		end;
	case 3:
		announce "�P�C�I�X : �����I�@���̕��ɓz��U���I�@���̈ꌂ�������Ă��I", 0x9, 0xff44aa, 0x190, 18, 0, 0;
		donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStart";
		hideoffnpc getmdnpcname("#�P�C_��");
		hideoffnpc getmdnpcname("�P�C�I�X#��");
		end;
	case 4: case 5:
		// dummy
	}
	end;
OnTimer21000:
	switch('chaos) {
	case 0:
		donpcevent getmdnpcname("�P�C�I�X#�k")+"::OnStop";
		hideonnpc getmdnpcname("#�P�C_�k");
		hideonnpc getmdnpcname("�P�C�I�X#�k");
		end;
	case 1:
		donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStop";
		hideonnpc getmdnpcname("#�P�C_��");
		hideonnpc getmdnpcname("�P�C�I�X#��");
		end;
	case 2:
		donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStop";
		hideonnpc getmdnpcname("#�P�C_��");
		hideonnpc getmdnpcname("�P�C�I�X#��");
		end;
	case 3:
		donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStop";
		hideonnpc getmdnpcname("#�P�C_��");
		hideonnpc getmdnpcname("�P�C�I�X#��");
		end;
	case 4: case 5:
		// dummy
	}
	end;
OnTimer23000:
	killmonster getmdmapname("1@face.gat"),getmdnpcname("#������4_bc")+"::OnKilled";
	end;
OnTimer25000:
	donpcevent getmdnpcname("#������4_bc")+"::OnStart";
	end;
OnKilled:
	// dummy
	end;
}

1@face.gat,214,172,0	script	#�P�C_�k	139,2,2,{
OnTouch:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#������4"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		if( (('@x > 205) && ('@x < 223)) && (('@y > 163) && ('@y < 181)) ) {
			misceffect 17,getmdnpcname("#�P�C_�k");
			misceffect 90,getmdnpcname("#�P�C_�k");
			donpcevent getmdnpcname("#������4")+"::OnDamage";
		}
		else {
			// �Z���t�K��
			unittalk getnpcid(getmdnpcname("�P�C�I�X#�k")),"�P�C�I�X : �����Ƌ߂��܂ŏ����t�F�C�X���[����A��Ă���񂾁I";
		}
	}
	donpcevent getmdnpcname("�P�C�I�X#�k")+"::OnStop";
	hideonnpc getmdnpcname("#�P�C_�k");
	hideonnpc getmdnpcname("�P�C�I�X#�k");
	end;
}
1@face.gat,214,143,0	script	#�P�C_��	139,2,2,{
OnTouch:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#������4"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		if( (('@x > 205) && ('@x < 223)) && (('@y > 134) && ('@y < 152)) ) {
			misceffect 17,getmdnpcname("#�P�C_��");
			misceffect 90,getmdnpcname("#�P�C_��");
			donpcevent getmdnpcname("#������4")+"::OnDamage";
		}
		else {
			// �Z���t�K��
			unittalk getnpcid(getmdnpcname("�P�C�I�X#��")),"�P�C�I�X : �����Ƌ߂��܂ŏ����t�F�C�X���[����A��Ă���񂾁I";
		}
	}
	donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStop";
	hideonnpc getmdnpcname("#�P�C_��");
	hideonnpc getmdnpcname("�P�C�I�X#��");
	end;
}
1@face.gat,226,158,0	script	#�P�C_��	139,2,2,{
OnTouch:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#������4"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		if( (('@x > 217) && ('@x < 235)) && (('@y > 149) && ('@y < 167)) ) {
			misceffect 17,getmdnpcname("#�P�C_��");
			misceffect 90,getmdnpcname("#�P�C_��");
			donpcevent getmdnpcname("#������4")+"::OnDamage";
		}
		else {
			// �Z���t�K��
			unittalk getnpcid(getmdnpcname("�P�C�I�X#��")),"�P�C�I�X : �����Ƌ߂��܂ŏ����t�F�C�X���[����A��Ă���񂾁I";
		}
	}
	donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStop";
	hideonnpc getmdnpcname("#�P�C_��");
	hideonnpc getmdnpcname("�P�C�I�X#��");
	end;
}
1@face.gat,200,158,0	script	#�P�C_��	139,{
OnTouch:
	set '@boss,getvariableofnpc('mob,getmdnpcname("#������4"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@x,'@y,3,'@boss);
		if( (('@x > 191) && ('@x < 209)) && (('@y > 149) && ('@y < 167)) ) {
			misceffect 17,getmdnpcname("#�P�C_��");
			misceffect 90,getmdnpcname("#�P�C_��");
			donpcevent getmdnpcname("#������4")+"::OnDamage";
		}
		else {
			// �Z���t�K��
			unittalk getnpcid(getmdnpcname("�P�C�I�X#��")),"�P�C�I�X : �����Ƌ߂��܂ŏ����t�F�C�X���[����A��Ă���񂾁I";
		}
	}
	donpcevent getmdnpcname("�P�C�I�X#��")+"::OnStop";
	hideonnpc getmdnpcname("#�P�C_��");
	hideonnpc getmdnpcname("�P�C�I�X#��");
	end;
}
1@face.gat,214,172,5	script	�P�C�I�X#�k	683,{
	end;
OnStart:
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
OnTimer1000:
	initnpctimer;
	set '@boss,getvariableofnpc('mob,getmdnpcname("#������4"));
	if('@boss) {
		set '@dummy,getmapxy('@map$,'@bx,'@by,3,'@boss);
		set '@dummy,getmapxy('@map$,'@nx,'@ny,1);
		if('@nx-10 < '@bx && '@nx+10 > '@bx && '@ny-10 < '@by && '@ny+10 > '@by) {
			emotion 27;
		}
	}
	end;
}
1@face.gat,214,143,8	duplicate(�P�C�I�X#�k)	�P�C�I�X#��	683
1@face.gat,226,158,3	duplicate(�P�C�I�X#�k)	�P�C�I�X#��	683
1@face.gat,200,158,6	duplicate(�P�C�I�X#�k)	�P�C�I�X#��	683

1@face.gat,212,156,0	script	#�P�Con3	139,5,5,{
	end;
OnTouch:
	initnpctimer;
	end;
OnTimer3000:
	donpcevent getmdnpcname("�P�C�I�X#6")+"::OnTalk1";
	end;
OnTimer6000:
	donpcevent getmdnpcname("�A�C���X#6")+"::OnTalk1";
	end;
OnTimer9000:
	donpcevent getmdnpcname("�P�C�I�X#6")+"::OnTalk2";
	end;
OnTimer12000:
	donpcevent getmdnpcname("�A�C���X#6")+"::OnTalk2";
	end;
OnTimer15000:
	donpcevent getmdnpcname("�P�C�I�X#6")+"::OnTalk3";
	end;
OnTimer18000:
	donpcevent getmdnpcname("�P�C�I�X#6")+"::OnTalk4";
	end;
OnTimer21000:
	donpcevent getmdnpcname("�A�C���X#6")+"::OnTalk3";
	end;
OnTimer24000:
	donpcevent getmdnpcname("�P�C�I�X#6")+"::OnTalk5";
	end;
OnTimer26000:
	stopnpctimer;
	hideonnpc getmdnpcname("�A�C���X#6");
	hideonnpc getmdnpcname("�P�C�I�X#6");
	hideoffnpc getmdnpcname("�����ړ��@#6");
	end;
}

1@face.gat,209,159,6	script	�P�C�I�X#6	683,{
	end;
OnTalk1:
	unittalk "�P�C�I�X : �ӂ��c�c���������������ȁB";
	end;
OnTalk2:
	unittalk "�P�C�I�X : ���傤���Ȃ��B�����͂��̕ӂœP�����悤�B";
	end;
OnTalk3:
	unittalk "�P�C�I�X : ����ɂ��Ă��A���O��̎��͂͐��������ȁB";
	end;
OnTalk4:
	unittalk "�P�C�I�X : �����̎�肪���������̂͂��O�B�̂������B";
	end;
OnTalk5:
	unittalk "�P�C�I�X : �����A���������B�߂邩�B���ꂶ��ȁI";
	end;
}

1@face.gat,220,159,4	script	�A�C���X#6	666,{
	end;
OnTalk1:
	unittalk "�A�C���X : �����ǎ��B���T���Ă���z����Ȃ������݂����B";
	end;
OnTalk2:
	unittalk "�A�C���X : �����ˁA���ړ��Ẵt�F�C�X���[���ɉ�Ȃ������͎̂c�O�����ǁA�݂�Ȗ����ł悩�����B";
	end;
OnTalk3:
	unittalk "�A�C���X : �P�C�I�X�A����ꂿ�������B���낻�뒬�ɖ߂�Ȃ��H";
	end;
}

1@face.gat,215,159,4	script	�����ړ��@#6	10007,{
	mes "[�����ړ��@]";
	mes "�����ł̎��Ԃ͏I���ɂȂ�܂��B";
	mes "�O�ɏo�邩������������鎖��";
	mes "�ł��܂���";
	mes "�ǂ����܂����H";
	next;
	if(select("��߂�","�O�ɏo��") == 1)
		close;
	if(BaseLevel < 160)
		getexp 20000000,0;
	else
		getexp 40000000,0;
	warp "dali.gat",85,62;
	end;
}

1@face.gat,155,82,3	script	#��1�J��	10005,15,15,{
	donpcevent getmdnpcname("#��0_timer")+"::OnStop";
	set '@time,getnpctimer(0,getmdnpcname("#��0_timer"))/1000;
	announce "����̐퓬�ɏ��v���ꂽ���Ԃ�" +'@time/60+ "��" +'@time%60+ "�b�ł��B", 0x9, 0xffff33, 0x190, 12, 0, 0;
	misceffect 10;
	hideonnpc;
	setarray '@card,4700,4710,4720,4730,4740,4750,4701,4711,4721,4731,4741,4751,4702,4712,4722,4732,4742,4752,4703,4713,4723,4733,4743,4753,4704,4714,4724,4734,4744,4754;
	if('@time <= 121){
		if(rand(1,100) <= 70)
			dropitem2 getmdmapname("1@face.gat"),155+rand(-2,2),82+rand(-2,2),20717,1,0,0,rand(2,5),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
		else
			dropitem2 getmdmapname("1@face.gat"),155+rand(-2,2),82+rand(-2,2),rand(20717,20718),1,0,0,rand(4,6),0,0,rand(4853,4858),'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	else {
		if(rand(1,100) <= 70) dropitem2 getmdmapname("1@face.gat"),155+rand(-2,2),82+rand(-2,2),20717,1,0,0,rand(0,3),0,0,0,0,'@card[rand(getarraysize('@card))];
		else dropitem2 getmdmapname("1@face.gat"),155+rand(-2,2),82+rand(-2,2),rand(20717,20718),1,0,0,rand(2,4),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	end;
OnTouch:
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 1, 127, 95, 2, 0x32CD32;
	end;
}
1@face.gat,162,271,3	script	#��2�J��	10005,15,15,{
	set '@time,getnpctimer(0,getmdnpcname("#��1_timer"))/1000;
	donpcevent getmdnpcname("#��1_timer")+"::OnStop";
	announce "����̐퓬�ɏ��v���ꂽ���Ԃ�" +'@time/60+ "��" +'@time%60+ "�b�ł��B", 0x9, 0xffff33, 0x190, 12, 0, 0;
	misceffect 10;
	hideonnpc;
	setarray '@card,4700,4710,4720,4730,4740,4750,4701,4711,4721,4731,4741,4751,4702,4712,4722,4732,4742,4752,4703,4713,4723,4733,4743,4753,4704,4714,4724,4734,4744,4754;
	if('@time <= 121){
		if(rand(1,100) <= 70)
			dropitem2 getmdmapname("1@face.gat"),162+rand(-2,2),271+rand(-2,2),20717,1,0,0,rand(2,5),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
		else
			dropitem2 getmdmapname("1@face.gat"),162+rand(-2,2),271+rand(-2,2),rand(20717,20718),1,0,0,rand(4,6),0,0,rand(4853,4858),'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	else {
		if(rand(1,100) <= 70) dropitem2 getmdmapname("1@face.gat"),162+rand(-2,2),271+rand(-2,2),20717,1,0,0,rand(0,3),0,0,0,0,'@card[rand(getarraysize('@card))];
		else dropitem2 getmdmapname("1@face.gat"),162+rand(-2,2),271+rand(-2,2),rand(20717,20718),1,0,0,rand(2,4),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	dropitem getmdmapname("1@face.gat"),162+rand(-2,2),271+rand(-2,2),7228,getmapusers(getmdmapname("1@face.gat")),0;
	end;
OnTouch:
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 2, 1, 1, 2, 0xFFFFFF;
	viewpoint 2, 1, 1, 3, 0xFFFFFF;
	viewpoint 2, 1, 1, 4, 0xFFFFFF;
	viewpoint 2, 1, 1, 5, 0xFFFFFF;
	viewpoint 1, 139, 100, 6, 0x32CD32;
	end;
}
1@face.gat,278,308,3	script	#��3�J��	10005,15,15,{
	donpcevent getmdnpcname("#��2_timer")+"::OnStop";
	set '@time,getnpctimer(0,getmdnpcname("#��2_timer"))/1000;
	announce "����̐퓬�ɏ��v���ꂽ���Ԃ�" +'@time/60+ "��" +'@time%60+ "�b�ł��B", 0x9, 0xffff33, 0x190, 12, 0, 0;
	misceffect 10;
	hideonnpc;
	setarray '@card,4700,4710,4720,4730,4740,4750,4701,4711,4721,4731,4741,4751,4702,4712,4722,4732,4742,4752,4703,4713,4723,4733,4743,4753,4704,4714,4724,4734,4744,4754;
	if('@time <= 121){
		if(rand(1,100) <= 70)
			dropitem2 getmdmapname("1@face.gat"),278+rand(-2,2),308+rand(-2,2),20717,1,0,0,rand(2,5),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
		else
			dropitem2 getmdmapname("1@face.gat"),278+rand(-2,2),308+rand(-2,2),rand(20717,20718),1,0,0,rand(4,6),0,0,rand(4853,4858),'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	else {
		if(rand(1,100) <= 70) dropitem2 getmdmapname("1@face.gat"),278+rand(-2,2),308+rand(-2,2),20717,1,0,0,rand(0,3),0,0,0,0,'@card[rand(getarraysize('@card))];
		else dropitem2 getmdmapname("1@face.gat"),278+rand(-2,2),308+rand(-2,2),rand(20717,20718),1,0,0,rand(2,4),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	end;
OnTouch:
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 2, 1, 1, 2, 0xFFFFFF;
	viewpoint 2, 1, 1, 3, 0xFFFFFF;
	viewpoint 2, 1, 1, 4, 0xFFFFFF;
	viewpoint 2, 1, 1, 5, 0xFFFFFF;
	viewpoint 1, 248, 185, 6, 0x32CD32;
	end;
}
1@face.gat,214,108,3	script	#��4�J��	10005,{
	donpcevent getmdnpcname("#��3_timer")+"::OnStop";
	set '@time,getnpctimer(0,getmdnpcname("#��3_timer"))/1000;
	announce "����̐퓬�ɏ��v���ꂽ���Ԃ�" +'@time/60+ "��" +'@time%60+ "�b�ł��B", 0x9, 0xffff33, 0x190, 12, 0, 0;
	misceffect 10;
	hideonnpc;
	setarray '@card,4700,4710,4720,4730,4740,4750,4701,4711,4721,4731,4741,4751,4702,4712,4722,4732,4742,4752,4703,4713,4723,4733,4743,4753,4704,4714,4724,4734,4744,4754;
	if('@time <= 111){
		if(rand(1,100) <= 70)
			dropitem2 getmdmapname("1@face.gat"),214+rand(-2,2),108+rand(-2,2),20717,1,0,0,rand(2,5),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
		else
			dropitem2 getmdmapname("1@face.gat"),214+rand(-2,2),108+rand(-2,2),rand(20717,20718),1,0,0,rand(4,6),0,0,rand(4853,4858),'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	else {
		if(rand(1,100) <= 70) dropitem2 getmdmapname("1@face.gat"),214+rand(-2,2),108+rand(-2,2),20717,1,0,0,rand(0,3),0,0,0,0,'@card[rand(getarraysize('@card))];
		else dropitem2 getmdmapname("1@face.gat"),214+rand(-2,2),108+rand(-2,2),rand(20717,20718),1,0,0,rand(2,4),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
	}
	dropitem getmdmapname("1@face.gat"),214+rand(-2,2),108+rand(-2,2),7444,getmapusers(getmdmapname("1@face.gat")),0;
	end;
OnTouch:
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 2, 1, 1, 2, 0xFFFFFF;
	viewpoint 1, 204, 122, 3, 0x32CD32;
	end;
}
1@face.gat,61,132,5		script	�_�炩�����ڂ�#1	557,5,5,{
	set '@num,rand(1,3);
	set '@dummy,getmapxy('@map$,'@x,'@y,1);
	misceffect 124;
	hideonnpc;
	monster '@map$,'@x,'@y,"�t�F�C�X���[���̗c��",2541,'@num,getmdnpcname(strnpcinfo(0))+"::OnKilled";
	end;
}
1@face.gat,62,195,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#2	557,5,5
1@face.gat,66,94,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#3	557,5,5
1@face.gat,68,265,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#4	557,5,5
1@face.gat,68,108,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#5	557,5,5
1@face.gat,72,202,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#6	557,5,5
1@face.gat,75,73,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#7	557,5,5
1@face.gat,76,241,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#8	557,5,5
1@face.gat,79,274,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#9	557,5,5
1@face.gat,79,119,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#10	557,5,5
1@face.gat,97,59,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#11	557,5,5
1@face.gat,108,74,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#16	557,5,5
1@face.gat,171,62,5		duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#38	557,5,5

1@face.gat,114,282,5	script	�_�炩�����ڂ�#ex1	557,5,5,{
	set '@num,rand(3,9);
	set '@dummy,getmapxy('@map$,'@x,'@y,1);
	misceffect 124;
	hideonnpc;
	monster '@map$,'@x,'@y,"�t�F�C�X���[���̗c��",2541,'@num,getmdnpcname(strnpcinfo(0))+"::OnKilled";
	end;
}

1@face.gat,131,285,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex2	557,5,5
1@face.gat,107,264,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex3	557,5,5
1@face.gat,114,269,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex4	557,5,5
1@face.gat,146,245,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex5	557,5,5
1@face.gat,147,235,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex6	557,5,5
1@face.gat,150,227,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex7	557,5,5
1@face.gat,154,248,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex8	557,5,5
1@face.gat,161,248,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex9	557,5,5
1@face.gat,172,252,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex10	557,5,5
1@face.gat,179,255,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex11	557,5,5

1@face.gat,189,274,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex16	557,5,5
1@face.gat,189,276,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex17	557,5,5
1@face.gat,186,279,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex18	557,5,5
1@face.gat,190,282,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex19	557,5,5
1@face.gat,195,285,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex20	557,5,5

1@face.gat,206,275,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex26	557,5,5

1@face.gat,106,193,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex28	557,5,5
1@face.gat,110,200,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex29	557,5,5
1@face.gat,110,210,5	duplicate(�_�炩�����ڂ�#ex1)	�_�炩�����ڂ�#ex30	557,5,5
1@face.gat,158,138,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#33	557,5,5
1@face.gat,158,163,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#34	557,5,5
1@face.gat,171,149,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#39	557,5,5
1@face.gat,172,173,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#40	557,5,5
1@face.gat,168,194,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#36	557,5,5
1@face.gat,183,185,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#43	557,5,5
1@face.gat,194,192,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#45	557,5,5
1@face.gat,196,207,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#46	557,5,5
1@face.gat,229,200,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#50	557,5,5
1@face.gat,232,271,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#51	557,5,5
1@face.gat,250,223,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#52	557,5,5
1@face.gat,254,324,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#53	557,5,5
1@face.gat,255,263,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#54	557,5,5
1@face.gat,255,320,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#55	557,5,5
1@face.gat,250,326,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#56	557,5,5
1@face.gat,229,304,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#57	557,5,5
1@face.gat,172,127,3	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#58	557,5,5
1@face.gat,186,130,3	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#59	557,5,5
1@face.gat,232,340,5	duplicate(�_�炩�����ڂ�#1)	�_�炩�����ڂ�#60	557,5,5

1@face.gat,163,130,0	script	#�ғœD1	139,7,7,{
	set '@map$,getmdmapname("1@face.gat");
	set '@event$,getmdnpcname(strnpcinfo(0))+ "::OnKilled";
	initnpctimer;
	misceffect 124;
	hideonnpc;
	killmonster '@map$,'@event$;
	set '@val,substr(strnpcinfo(2),6,1);
	switch('@val) {
	case 1: setarray .@xy[0],167,142,15; set '@num,25; break;
	case 2: setarray .@xy[0],163,161,15; set '@num,30; break;
	case 3: setarray .@xy[0],167,185,20; set '@num,50; break;
	case 4: setarray .@xy[0],197,203,15; set '@num,30; break;
	case 5: setarray .@xy[0],227,203,20; set '@num,50; break;
	case 6: setarray .@xy[0],244,232,15; set '@num,30; break;
	case 7: setarray .@xy[0],243,259,15; set '@num,40; break;
	case 8: setarray .@xy[0],292,277,50; set '@num,50; break;
	case 9: setarray .@xy[0],248,322,50; set '@num,50; break;
	}
	areamonster '@map$,'@xy[0]-'@xy[2],'@xy[1]-'@xy[2],'@xy[0]+'@xy[2],'@xy[1]+'@xy[2],"�ғő�",2531,'@num,'@event$;
	end;
OnTimer15000:
	stopnpctimer;
	hideoffnpc;
	end;
OnKilled:
	end;
}
1@face.gat,165,147,0	duplicate(#�ғœD1)	#�ғœD2	139,7,7
1@face.gat,163,166,0	duplicate(#�ғœD1)	#�ғœD3	139,10,10
1@face.gat,183,197,0	duplicate(#�ғœD1)	#�ғœD4	139,10,10
1@face.gat,202,204,0	duplicate(#�ғœD1)	#�ғœD5	139,5,5
1@face.gat,237,220,0	duplicate(#�ғœD1)	#�ғœD6	139,5,5
1@face.gat,240,258,0	duplicate(#�ғœD1)	#�ғœD7	139,5,5
1@face.gat,292,277,0	duplicate(#�ғœD1)	#�ғœD8	139,5,5
1@face.gat,248,322,0	duplicate(#�ғœD1)	#�ғœD9	139,5,5

1@face.gat,158,120,0	script	#�ғœDa	139,3,3,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	monster '@map$,152,113,"�ғő�",2531,1;
	monster '@map$,154,113,"�ғő�",2531,1;
	monster '@map$,156,113,"�ғő�",2531,1;
	monster '@map$,158,113,"�ғő�",2531,1;
	monster '@map$,160,113,"�ғő�",2531,1;
	monster '@map$,162,113,"�ғő�",2531,1;
	monster '@map$,152,115,"�ғő�",2531,1;
	monster '@map$,154,115,"�ғő�",2531,1;
	monster '@map$,156,115,"�ғő�",2531,1;
	monster '@map$,158,115,"�ғő�",2531,1;
	monster '@map$,160,115,"�ғő�",2531,1;
	monster '@map$,162,115,"�ғő�",2531,1;
	monster '@map$,152,117,"�ғő�",2531,1;
	monster '@map$,154,117,"�ғő�",2531,1;
	monster '@map$,156,117,"�ғő�",2531,1;
	monster '@map$,158,117,"�ғő�",2531,1;
	monster '@map$,160,117,"�ғő�",2531,1;
	monster '@map$,162,117,"�ғő�",2531,1;
	end;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,248,186,0	script	#�ғœDb	139,10,10,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	monster '@map$,238,196,"�ғő�",2531,1;
	monster '@map$,238,197,"�ғő�",2531,1;
	monster '@map$,239,196,"�ғő�",2531,1;
	monster '@map$,239,197,"�ғő�",2531,1;
	monster '@map$,240,196,"�ғő�",2531,1;
	monster '@map$,240,197,"�ғő�",2531,1;
	monster '@map$,241,196,"�ғő�",2531,1;
	monster '@map$,241,197,"�ғő�",2531,1;

	monster '@map$,247,191,"�ғő�",2531,1;
	monster '@map$,248,191,"�ғő�",2531,1;
	monster '@map$,249,191,"�ғő�",2531,1;
	monster '@map$,247,192,"�ғő�",2531,1;
	monster '@map$,248,192,"�ғő�",2531,1;
	monster '@map$,249,192,"�ғő�",2531,1;
	end;
OnTimer15000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,277,343,0	script	#�ғœDc	139,5,5,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	areamonster '@map$,263,330,291,357,"�ғő�",2531,20;
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,174,133,0	script	#�ғœDd1	139,5,5,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	monster '@map$,174,131,"�ғő�",2531,1;
	monster '@map$,174,132,"�ғő�",2531,1;
	monster '@map$,175,131,"�ғő�",2531,1;
	monster '@map$,175,132,"�ғő�",2531,1;
	monster '@map$,176,131,"�ғő�",2531,1;
	monster '@map$,176,132,"�ғő�",2531,1;
	monster '@map$,184,137,"�ғő�",2531,1;
	monster '@map$,184,138,"�ғő�",2531,1;
	monster '@map$,185,137,"�ғő�",2531,1;
	monster '@map$,185,138,"�ғő�",2531,1;
	monster '@map$,186,137,"�ғő�",2531,1;
	monster '@map$,186,138,"�ғő�",2531,1;
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,182,123,0	script	#�ғœDd2	139,3,3,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	monster '@map$,177,121,"�ғő�",2531,1;
	monster '@map$,177,122,"�ғő�",2531,1;
	monster '@map$,178,121,"�ғő�",2531,1;
	monster '@map$,178,122,"�ғő�",2531,1;
	monster '@map$,179,121,"�ғő�",2531,1;
	monster '@map$,179,122,"�ғő�",2531,1;
	monster '@map$,184,121,"�ғő�",2531,1;
	monster '@map$,184,122,"�ғő�",2531,1;
	monster '@map$,185,121,"�ғő�",2531,1;
	monster '@map$,185,122,"�ғő�",2531,1;
	monster '@map$,186,121,"�ғő�",2531,1;
	monster '@map$,186,122,"�ғő�",2531,1;
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,237,299,0	script	#�ғœDe	139,5,5,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	areamonster '@map$,228,290,246,308,"�ғő�",2531,25;
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,245,230,0	script	#�ғœDf	139,10,10,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	monster '@map$,236,236,"�ғő�",2531,1;
	monster '@map$,238,236,"�ғő�",2531,1;
	monster '@map$,240,236,"�ғő�",2531,1;
	monster '@map$,242,236,"�ғő�",2531,1;
	monster '@map$,244,236,"�ғő�",2531,1;
	monster '@map$,246,236,"�ғő�",2531,1;
	monster '@map$,248,236,"�ғő�",2531,1;
	monster '@map$,250,236,"�ғő�",2531,1;
	monster '@map$,236,239,"�ғő�",2531,1;
	monster '@map$,238,239,"�ғő�",2531,1;
	monster '@map$,240,239,"�ғő�",2531,1;
	monster '@map$,242,239,"�ғő�",2531,1;
	monster '@map$,244,239,"�ғő�",2531,1;
	monster '@map$,246,239,"�ғő�",2531,1;
	monster '@map$,248,239,"�ғő�",2531,1;
	monster '@map$,250,239,"�ғő�",2531,1;
	monster '@map$,236,242,"�ғő�",2531,1;
	monster '@map$,238,242,"�ғő�",2531,1;
	monster '@map$,240,242,"�ғő�",2531,1;
	monster '@map$,242,242,"�ғő�",2531,1;
	monster '@map$,244,242,"�ғő�",2531,1;
	monster '@map$,246,242,"�ғő�",2531,1;
	monster '@map$,248,242,"�ғő�",2531,1;
	monster '@map$,250,242,"�ғő�",2531,1;
	monster '@map$,236,245,"�ғő�",2531,1;
	monster '@map$,238,245,"�ғő�",2531,1;
	monster '@map$,240,245,"�ғő�",2531,1;
	monster '@map$,242,245,"�ғő�",2531,1;
	monster '@map$,244,245,"�ғő�",2531,1;
	monster '@map$,246,245,"�ғő�",2531,1;
	monster '@map$,248,245,"�ғő�",2531,1;
	monster '@map$,250,245,"�ғő�",2531,1;
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,249,337,0	script	#�ғœDg	139,10,10,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	areamonster '@map$,240,325,268,348,"�ғő�",2531,20;
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,159,194,0	script	#�ғœDh	139,5,5,{
	set '@map$,getmdmapname("1@face.gat");
	initnpctimer;
	misceffect 124;
	hideonnpc;
	areamonster '@map$,156,201,162,207,"�ғő�",2531,16;
	end;
OnTimer30000:
	stopnpctimer;
	hideoffnpc;
	end;
}
1@face.gat,1,1,0	script	#�ғœD_timer	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	set '@map$,getmdmapname("1@face.gat");
	monster '@map$,238,196,"�ғő�",2531,1;
	monster '@map$,238,197,"�ғő�",2531,1;
	monster '@map$,239,196,"�ғő�",2531,1;
	monster '@map$,239,197,"�ғő�",2531,1;
	monster '@map$,240,196,"�ғő�",2531,1;
	monster '@map$,240,197,"�ғő�",2531,1;
	monster '@map$,241,196,"�ғő�",2531,1;
	monster '@map$,241,197,"�ғő�",2531,1;
	end;
OnTimer8000:
	set '@map$,getmdmapname("1@face.gat");
	monster '@map$,247,191,"�ғő�",2531,1;
	monster '@map$,247,192,"�ғő�",2531,1;
	monster '@map$,248,191,"�ғő�",2531,1;
	monster '@map$,248,192,"�ғő�",2531,1;
	monster '@map$,249,191,"�ғő�",2531,1;
	monster '@map$,249,192,"�ғő�",2531,1;
	end;
OnTimer18000:
	initnpctimer;
	end;
}

@spawn(type: BL_MOB, ID: 78941, speed: 2000, option: 0x0, class: 2531, pos: ("0q81@face.gat",247,191), dir: 0, name"�ғő�")
@spawn(type: BL_MOB, ID: 81507, speed: 2000, option: 0x0, class: 2531, pos: ("0q81@face.gat",247,192), dir: 0, name"�ғő�")
@spawn(type: BL_MOB, ID: 78689, speed: 2000, option: 0x0, class: 2531, pos: ("0q81@face.gat",248,191), dir: 0, name"�ғő�")
@spawn(type: BL_MOB, ID: 78836, speed: 2000, option: 0x0, class: 2531, pos: ("0q81@face.gat",248,192), dir: 0, name"�ғő�")
@spawn(type: BL_MOB, ID: 79696, speed: 2000, option: 0x0, class: 2531, pos: ("0q81@face.gat",249,191), dir: 0, name"�ғő�")
@spawn(type: BL_MOB, ID: 79872, speed: 2000, option: 0x0, class: 2531, pos: ("0q81@face.gat",249,192), dir: 0, name"�ғő�")
1@face.gat,213,155,3	script	�古�l�̔�#1	10005,{
	initnpctimer;
	set 'flag,'flag+1;
	misceffect 10;
	hideonnpc;
	switch('flag) {
	case 1:
		donpcevent getmdnpcname("#������4_timer")+"::OnStop";
		set '@time,getnpctimer(0,getmdnpcname("#������4_timer"))/1000;
		set '@time,'@time + getnpctimer(0,getmdnpcname("#��0_timer"))/1000;
		set '@time,'@time + getnpctimer(0,getmdnpcname("#��1_timer"))/1000;
		set '@time,'@time + getnpctimer(0,getmdnpcname("#��2_timer"))/1000;
		set '@time,'@time + getnpctimer(0,getmdnpcname("#��3_timer"))/1000;
		if($FacewormTime == 0 || $FacewormTime > '@time) {
			set $FacewormParty$,getpartyname(getcharid(1));
			set $FacewormTime,'@time;
			announce "�p�[�e�B�[��" +getpartyname(getcharid(1))+ "���t�F�C�X���[���̑��̍U���ŒZ�L�^���X�V���܂����I(" +'@time/60+ "��" +'@time%60+ "�b)", 0;
		}
		else
			announce '@time/60+ "��" +'@time%60+ "�b���L�^���܂������ŒZ�L�^���X�V���鎖�͂ł��܂���ł����B", 0x9, 0xffff33, 0x190, 12, 0, 0;
		setarray '@card,4700,4710,4720,4730,4740,4750,4701,4711,4721,4731,4741,4751,4702,4712,4722,4732,4742,4752,4703,4713,4723,4733,4743,4753,4704,4714,4724,4734,4744,4754,4705,4715,4725,4735,4745,4755,4706,4716,4726,4736,4746,4756;
		if('@time<271){
			if(rand(100)<10)
				set '@itemid,20718;
			else
				set '@itemid,20717;
			set '@rate,rand(1,100);
			set '@amount,rand(1,100)<=20?2:1;
			if('@rate <= 20){
				for(set '@i,0; '@i<'@amount; set '@i,'@i+1) dropitem2 getmdmapname("1@face.gat"),213+rand(-2,2),155+rand(-2,2),'@itemid,1,0,0,rand(9,10),0,0,rand(4853,4858),'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
			} else if('@rate <= 50){
				for(set '@i,0; '@i<'@amount; set '@i,'@i+1) dropitem2 getmdmapname("1@face.gat"),213+rand(-2,2),155+rand(-2,2),'@itemid,1,0,0,rand(5,9),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
			} else {
				for(set '@i,0; '@i<'@amount; set '@i,'@i+1) dropitem2 getmdmapname("1@face.gat"),213+rand(-2,2),155+rand(-2,2),'@itemid,1,0,0,rand(3,7),0,0,0,0,'@card[rand(getarraysize('@card))];
			}
		} else {
			if(rand(100)<5)
				set '@itemid,20718;
			else
				set '@itemid,20717;
			set '@rate,rand(1,100);
			if('@rate <= 5)	dropitem2 getmdmapname("1@face.gat"),213+rand(-2,2),155+rand(-2,2),'@itemid,1,0,0,rand(9,10),0,0,rand(4853,4858),'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
			 else if('@rate <= 25) dropitem2 getmdmapname("1@face.gat"),213+rand(-2,2),155+rand(-2,2),'@itemid,1,0,0,rand(5,9),0,0,0,'@card[rand(getarraysize('@card))],'@card[rand(getarraysize('@card))];
			 else if('@rate <= 60) dropitem2 getmdmapname("1@face.gat"),213+rand(-2,2),155+rand(-2,2),'@itemid,1,0,0,rand(3,7),0,0,0,0,'@card[rand(getarraysize('@card))];
			 else dropitem2 getmdmapname("1@face.gat"),213+rand(-2,2),155+rand(-2,2),'@itemid,1,0,0,rand(3,9),0,0,0,0,0;
		}
		break;
		end;
	case 2:
		// �K�[�l�b�g�A�����������w�ցA�t�F�C�����ړ��X�N���[��
		setarray '@gain,718,718,718,718,718,718,6650,22507;
		setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
		for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
			set '@x,rand(208,218);
			set '@y,rand(150,160);
			if(rand(1000) < '@rate['@i])
				dropitem getmdmapname("1@face.gat"),'@x,'@y,'@gain['@i],1,0;
		}
		end;
	case 3:
		// �A���W�X�g�A�����������r�ցA�t�F�C�����ړ��X�N���[��
		setarray '@gain,719,719,719,719,719,719,6651,22507;
		setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
		for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
			set '@x,rand(208,218);
			set '@y,rand(150,160);
			if(rand(1000) < '@rate['@i])
				dropitem getmdmapname("1@face.gat"),'@x,'@y,'@gain['@i],1,0;
		}
		end;
	case 4:
		// �A�N�A�}�����A���A�����������A���o���A�t�F�C�����ړ��X�N���[��
		setarray '@gain,720,720,720,720,720,720,7229,6652,22507;
		setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
		for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
			set '@x,rand(208,218);
			set '@y,rand(150,160);
			if(rand(1000) < '@rate['@i])
				dropitem getmdmapname("1@face.gat"),'@x,'@y,'@gain['@i],1,0;
		}
		end;
	case 5:
		// �I�p�[���A�������������܁A�t�F�C�����ړ��X�N���[��
		setarray '@gain,727,727,727,727,727,727,6653,22507;
		setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
		for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
			set '@x,rand(208,218);
			set '@y,rand(150,160);
			if(rand(1000) < '@rate['@i])
				dropitem getmdmapname("1@face.gat"),'@x,'@y,'@gain['@i],1,0;
		}
		end;
	case 6:
		// �T�[�h�I�j�L�X�A���A�����̉����A�t�F�C�����ړ��X�N���[��
		setarray '@gain,725,725,725,725,725,725,7229,6648,22507;
		setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
		for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
			set '@x,rand(208,218);
			set '@y,rand(150,160);
			if(rand(1000) < '@rate['@i])
				dropitem getmdmapname("1@face.gat"),'@x,'@y,'@gain['@i],1,0;
		}
		end;
	case 7:
		// �^��A�v���[���g�{�b�N�X�A�t�F�C�����ړ��X�N���[��
		setarray '@gain,722,722,722,722,722,722,644,644,644,22507;
		setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
		for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
			set '@x,rand(208,218);
			set '@y,rand(150,160);
			if(rand(1000) < '@rate['@i])
				dropitem getmdmapname("1@face.gat"),'@x,'@y,'@gain['@i],1,0;
		}
		end;
	case 8:
		// �G�������h�A���A�Â������A�t�F�C�����ړ��X�N���[��
		setarray '@gain,721,721,721,721,721,721,7229,603,603,603,22507;
		setarray '@rate,300,300,300,300,300,300,1000, 200,  50;
		for(set '@i,0; '@i<getarraysize('@gain); set '@i,'@i+1) {
			set '@x,rand(208,218);
			set '@y,rand(150,160);
			if(rand(1000) < '@rate['@i])
				dropitem getmdmapname("1@face.gat"),'@x,'@y,'@gain['@i],1,0;
		}
		end;
	}
OnTimer2000:
	if('flag < 8 && rand(100) < 85)
		hideoffnpc;
	end;
}
