//==============================================================================
// Canyon Exploration Memorial Dungeon Script
//==============================================================================
1@20cn1.gat,91,80,5	script	���n�[��#ep20MD_re01_09	10469,5,5,{
	if(.scene == 0) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���J�ɓ������܂����ˁB";
		mes "�ł́A���݂��ʁX�̊Ď��ꏊ��";
		mes "�ړ����܂��傤�B";
		mes "��������3���̕����ɂ��鑕�u��";
		mes strcharinfo(0)+"�l�̒S���ł��B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�Ñ�A�C�X�E�B���h��";
		mes "���K���Ɍ�����Ȃ��悤";
		mes "���݂��T�d�ɍs�����܂��傤�I";
		emotion 21;
		next;
		cutin "ep19_lehar02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�悵�B";
		mes "�S�����Ă���Ď��ꏊ�Ɍ��������B";
		mes "�T�d�ɁA�p�S�[���c�c�B";
		viewpoint 1, 171, 105, 1, 0xFF0000;
		initnpctimer getmdnpcname("���m��ʃA�[�E�B��#ep20_01");
		set .scene,1;
		close;
	}
	if(.scene == 1) {
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "��������3���̕����ɂ��鑕�u��";
		mes strcharinfo(0)+"�l�̒S���ł��B";
		mes "���݂��T�d�ɍs�����܂��傤�I";
		viewpoint 1, 171, 105, 1, 0xFF0000;
		close2;
		cutin "ep19_lehar02.png", 255;
		end;
	}
	end;
OnTouch:
	if(.scene == 0)
		unittalk "���n�[�� : �������ł��A�`���җl�I";
	end;
}

1@20cn1.gat,171,105,5	script(HIDDEN)	���m��ʃA�[�E�B��#ep20_01	21976,9,9,{
	mes "[���m��ʃA�[�E�B��]";
	mes "�����ɂ���̂͒N���I";
	mes "�B��悤�Ƃ��Ă����ʂ����I";
	mes "�S���A�����Ă��邩��ȁI";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�c�c����H";
	mes "�A�[�E�B���H";
	mes "�����̑��u��������S�����낤���H";
	next;
	mes "[���m��ʃA�[�E�B��]";
	mes "�S���H�@�����S���ł͂��邯��ǁc�c";
	mes "�������I�@���O��!?";
	next;
	mes "[���̌��m��ʃA�[�E�B��]";
	mes "�X�̏�Ō��������c�c�I";
	mes "���A����c�c�ӂށI";
	mes "�����ɂ́A�ǂ̂悤�Ȍ�p�ŁH";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�A���̍s���Ⴂ���낤���H";
	mes "�������Ď�����̂�";
	mes "���̖�ڂ��Ǝv���Ă�����";
	mes "���ӂ��肪�S�����Ă�����̂ł��ˁH";
	mes "�ł��c�c�������Ƃ̂Ȃ���̂悤��??";
	next;
	emotion 23,getmdnpcname("���m��ʃA�[�E�B��#ep20_01");
	emotion 23,getmdnpcname("���m��ʃA�[�E�B��#ep20_02");
	mes "[���m��ʃA�[�E�B��]";
	mes "�r�N�b�I";
	next;
	mes "[���̌��m��ʃA�[�E�B��]";
	mes "���A����͂ł��˂������I";
	mes "�������͕��m�ɂȂ���";
	mes "�܂��Ԃ�������ł��悧���I";
	next;
	emotion 4,getmdnpcname("���m��ʃA�[�E�B��#ep20_01");
	mes "[���m��ʃA�[�E�B��]";
	mes "�����ł��I�@�����ł��I";
	mes "���m�ɂȂ�̂́`�������̖��ł����`�B";
	mes "���m�ɂȂ��ā`�݂�Ȃ����`�I";
	next;
	emotion 4,getmdnpcname("���m��ʃA�[�E�B��#ep20_02");
	mes "[���̌��m��ʃA�[�E�B��]";
	mes "�����ł��A�����Ȃ�ł��I";
	mes "�������̊��l�Ԃ̕�������";
	mes "��肭��ʂł��Ȃ��݂����ł����`�`�I";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�i�c�c������Ɖ���������";
	mes "�@�A�[�E�B�������c�c�C�̂������낤�j";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "���΂߂���J�l�ł��B";
	mes "�ł́A�ꏏ�ɂ��̕t�߂�";
	mes "�����܂��傤���H";
	next;
	mes "[���m��ʃA�[�E�B������]";
	mes "����͗ǂ��ł��˂��I";
	mes "�ǂ����擪�ɗ����Ă��������I";
	mes "���B�͌�납����Ă����܂�����I";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�c�c����H";
	next;
	misceffect 962,"";
	mes "[���m��ʃA�[�E�B������]";
	mes "�w�������������I";
	mes "���܂��I�@�������!!";
	close2;
	stopnpctimer;
	initnpctimer getmdnpcname("���n�[��#ep20MD_re02_09");
	warp getmdmapname("1@20cn2.gat"), 271, 138;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "���m��ʃA�[�E�B�� : �N���I";
	unittalk getnpcid(0,getmdnpcname("���m��ʃA�[�E�B��#ep20_02")),"���m��ʃA�[�E�B�� : �����A�~�܂�!!";
	end;
}

1@20cn1.gat,173,103,3	script(HIDDEN)	���m��ʃA�[�E�B��#ep20_02	21978,{
	emotion 19;
	mes "[���m��ʃA�[�E�B��]";
	mes "���A�����͎������̒S�������ǁH";
	mes "���c�c���O�́c�c!?";
	close;
}

1@20cn2.gat,271,134,3	script	���n�[��#ep20MD_re02_09	10469,2,2,{
	if(.scene == 1) {
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�B";
		next;
		emotion 9,"";
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�c�c�c�c�B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�c�c�c�Ă��������c�c�I";
		next;
		mes "[���n�[��]";
		mes "�N���Ă��������I";
		mes strcharinfo(0)+"�l!!";
		next;
		cutin "ep19_lehar01.png", 255;
		emotion 16,"";
		mes "["+strcharinfo(0)+"]";
		mes "���c�c�㓪�����Y�L�Y�L����c�c�B";
		mes "�܂����Ǝv�����ǁc�c";
		mes "���̃A�[�E�B�������ɍU�������!?";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���A���������āc�c";
		mes "���n�[������������ڂ�!?";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "���̂܂����A�ł��B";
		mes "���f���Ă���Ƃ��������܂����B";
		mes "�ڂ��o�߂���A���̟B�̒��ł��B";
		mes "�A�[�E�B���̒��ɗ��؎҂�����Ȃ�āI";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�������f���Ă��܂����c�c";
		mes "�������A�܂��͂�������";
		mes "�E�o������@��T���Ȃ��Ɓc�c�B";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "���̒ʂ�ł��B";
		mes "�Ƃɂ������@��T���Ȃ��ƁI";
		next;
		cutin "ep19_lehar05.png", 2;
		announce "�o�S�b�g : �c�c�ȑO��Ă������A���l�����������܂������H", 0x9, 0xffff99;
		mes "[���n�[��]";
		mes "�c�c�O���牽���������܂���B";
		mes "����b���Ă���񂾁H";
		next;
		cutin "ep19_lehar01.png", 255;
		announce "�o�S�b�g : �c���Ă��郈�������K���h�̐g�̂Łu�����v���������ꍇ�c�c", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : �c�����閂�͂܂ŏ����Ă��܂��A�Ɛ������܂����ł��傤�H", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�H�H�H : ���̘b���c�c���Ƀ^�R���ł���قǕ������B", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�H�H�H : ���łɋ���ۂ̐g�̂�����A�ƌ����Ă����ȁH", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : �����A���̒ʂ�I�@�������������Ɉ����I", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�H�H�H : �����A�M�l�̌������@�͖��d�ł͂Ȃ����H", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�H�H�H : �����炪�A���̖��͂𒼐ڎg�p����Ƃ́B", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : ���̂Ƃ���I�@�����Ď���_�ɂȂ���̂ł��I", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : �����Ȃ�΁A���E��j���ăC�X�K���h����o���܂��傤�I", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : �~�b�h�K���h�嗤�ɐV���Ȑ_�Ƃ��č~�Ղ��c�c", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : �嗤���c�c���E���x�z����I", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�H�H�H : �c�c�c�c�B", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�H�H�H : �c�c�l�̋C�������p��S���Ă���Ƃ͂ȁB", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : �M���ɂƂ��ĉ��l�̂����Ă������܂łł���B", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�H�H�H : �c�c�M�l�̈Ăɏ���Ă�낤�B�؂�Ȃ�������i�߂�B", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : ���̏�Ȃ����߂Ɖ��b�ɁA�[�����ӂ������܂��B", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "�o�S�b�g : ���X�K���h�l�ɉh��������񂱂Ƃ��I", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		announce "���X�K���h : �c�c���𗎒_������Ȃ�B", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		emotion 9;
		announce "�o�S�b�g : �c�c�s���܂������H", 0x9, 0xffff99;
		if(!sleep2(2000)) end;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�����I�@";
		mes "�����ɓ����ė���݂����ł��I";
		next;
		hideoffnpc getmdnpcname("�o�S�b�g#ep20MD_re01_09");
		cutin "ep18_bagot_02.png", 2;
		emotion 20,getmdnpcname("�o�S�b�g#ep20MD_re01_09");
		mes "[�o�S�b�g]";
		mes "�{���͐_�̗͂��A����肪�o��ق�";
		mes "�~���������ɂ��I";
		mes "���������Ȃ�ł��悧�`�I";
		mes "�͂��`�`�`�I�@�C�ʂ̍��������̎ւ����I";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�Ӂc�c�ӂӂӁI";
		mes "�ł��A���̑Ή��Ƃ���";
		mes "�o�S�b�g�̗~�������̂𓾂�ꂽ����";
		mes "����͉䖝���Ă����܂��悧�`�`�I";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "�o�S�b�g�́u�_�v��n������";
		mes "���z�҂ɂȂ���c�c�I";
		mes "�^�Ɋ�Ղ��N�����Ă݂���̂ł��I";
		next;
		emotion 9;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���킟�I";
		mes "�������ƌ������Ⴂ�߂����!!";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "���`�`�`�H";
		mes "�N���Ă��܂��������H";
		mes "��тȂ����A�F����͂��ꂩ��`";
		mes "���̎����̍ޗ��ɂȂ��Ă��炢�܁[���I";
		mes "�ȒP�Ɍ����Ɓ`���т��H";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "���A���т�����!?";
		mes "����Ȃ��ƌ�����!!";
		mes "��������o���I";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�͂��H";
		mes "����Ȃ��Ƃ���킯�Ȃ��ł���`�H";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "���܂܂ł��񂴂�";
		mes "�o�S�b�g�̎ז��������񂾂���Ȃ��`�B";
		mes "���̍ߖłڂ��Ƃ��Ă��`";
		mes "�o�S�b�g�̖��ɗ����Ă����Ȃ��Ƃ��I";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "����������l�������Ă���Ǝv���̂��H";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�ނ���f���Ɋ�Ԃׂ��ł́`�H";
		mes "�_��n�����邽�߂�";
		mes "�̂Đ΂ɂȂ���ł����炟�I";
		mes "�ف`�`��A���h�ł���`�`�H";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�����c�c�_�����c�c";
		mes "�S�R�b���ʂ��Ȃ��c�c�B";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "��l�����҂��ĂȂ��`�`���B";
		mes "�\��Ă����ʂ����ʂ��`�B";
		mes "�܂Ȕ̏�̃R�C�Ȃ񂾂��炟�`�I";
		close2;
		unittalk "���n�[�� : �������c�c�s�����Ⴂ�܂����ˁB";
		cutin "ep18_bagot_03.png", 255;
		hideonnpc getmdnpcname("�o�S�b�g#ep20MD_re01_09");
		set .scene,2;
		end;
	}
	if(.scene == 2) {
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�͂��c�c�ǂ����܂��傤�B";
		mes "�}���ł�������o����@��T���Ȃ��ƁB";
		next;
		misceffect 901;
		mes "[���n�[��]";
		mes "�����₟���I";
		mes "�͂����[�[��!!";
		mes "�͂����I�@�͂���!!";
		mes "�����c�c�����󂷂͖̂������c�c";
		mes "�{���Ɂc�c�d����!!";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���������Ă��������B";
		mes "�����󂹂Ȃ��Ă���͂���͂��ł��B";
		mes "�N�����H���������Ă���ۂ�";
		mes "����_���Ƃ��c�c�B";
		next;
		hideoffnpc getmdnpcname("�L#ep20MD_re01_09");
		cutin "ep20_nyar02.png", 1;
		mes "[�����L]";
		mes "�c�c�B";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[���n�[��]";
		mes "����Ȍ�������Ηǂ��ł����ǁc�c";
		mes "�H��������O��";
		mes "������ɂ���邩������܂���B";
		mes "���̑O�ɂȂ�Ƃ��c�c�B";
		next;
		cutin "ep20_nyar03.png", 1;
		emotion 33,getmdnpcname("�L#ep20MD_re01_09");
		mes "[�����L]";
		mes "�c�c�B";
		next;
		cutin "ep19_lehar05.png", 2;
		emotion 23;
		mes "[���n�[��]";
		mes "���킟�����`�`�`���I";
		mes "���A���A���������I";
		mes "���̑��ɂ܂Ƃ�����!!";
		mes "�Ȃ񂾂������c�c�����ӂ���!?!?";
		next;
		cutin "ep19_lehar04.png", 255;
		menu "������ĂȂ񂾁H",-,"�ˁA�L�H",-;
		cutin "ep20_nyar02.png", 1;
		mes "[�����L]";
		mes "�j���[�I�B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�L���ۂ��ł���";
		mes "�ɂႨ�A�Ɩ��Ă܂����ǁI";
		mes "�L���Ă���Ȃɓ������������ł���!?";
		mes "����ɂǂ���������ė����񂾂낤??";
		next;
		cutin "ep20_nyar01.png", 1;
		mes "[�����L]";
		mes "�~���E���B";
		close2;
		cutin "ep20_nyar01.png", 255;
		stopnpctimer;
		emotion 0,getmdnpcname("�L#ep20MD_re01_1_09");
		npcwalkto 269,136,getmdnpcname("�L#ep20MD_re01_09");
		npcwalkwait;
		hideonnpc getmdnpcname("�L#ep20MD_re01_09");
		hideoffnpc getmdnpcname("�L#ep20MD_re01_1_09");
		initnpctimer getmdnpcname("�L#ep20MD_re01_1_09");
		unittalk getnpcid(0,getmdnpcname("�L#ep20MD_re01_1_09")),"�L : �����j�����B";
		set .scene,3;
		end;
	}
	if(.scene == 3) {
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�ǂ����܂��傤�B";
		mes "�Ȃ�Ƃ��o������@��T���Ȃ��ƁB";
		close2;
		cutin "ep19_lehar04.png", 255;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "���n�[�� : �`���җl�I �`���җl!!";
	end;
}

1@20cn2.gat,264,135,5	script(HIDDEN)	�o�S�b�g#ep20MD_re01_09	10386,{
	unittalk "�o�S�b�g : �ӂӂ��B";
	end;
}

1@20cn2.gat,273,136,3	script2(HIDDEN)	�L#ep20MD_re01_09	22006,{
	unittalk "�L : �E�G�I�b�B";
	end;
OnInit:
	setnpcspeed 150;
	end;
}

1@20cn2.gat,269,136,3	script(HIDDEN)	�L#ep20MD_re01_1_09	22006,{
	if(.scene == 3) {
		cutin "ep20_nyar01.png", 1;
		mes "[�����L]";
		mes "���~���B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "������I";
		mes "�����ƍX�ɒ����Ȃ����݂�����!?";
		mes "����H�@���̕��ɍs���݂����ł��B";
		next;
		cutin "ep19_lehar03.png", 255;
		menu "�ςȖ����c�c",-;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���H�@�L�͖{����������Ȃ��ł����H";
		mes "�c�c����H";
		mes "�����A�������I";
		mes strcharinfo(0)+"�l�A���Ă��������I";
		next;
		cutin "ep19_lehar01.png", 255;
		misceffect 1044,getmdnpcname("�L#ep20MD_re01_1_09");
		mes "�]�L���Ђ��������т�";
		mes "�@�拭�ȏ��O���{���{������Ă����]";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "����Ȃ��Ƃ����蓾���!?";
		mes "�L�A�ǂ�����Ă���Ȃ��Ƃ��o����́H";
		mes "������Ɛ������Ă���Ȃ�??";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "������A���O�����S�ɉ�ꂿ����Ă�I";
		mes "��������������!!";
		next;
		cutin "ep20_nyar05.png", 1;
		mes "�]�t���ė����Ƃł������悤��";
		mes "�@���̔L�͐K����U��Ȃ���";
		mes "�@�B�̊O�ɏo�Ă������]";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�B����o���܂���I";
		mes "�����N�����̂��킩��܂���";
		mes "���̔L�ɂ��čs���܂��傤�I";
		close2;
		cutin "ep19_lehar03.png", 255;
		stopnpctimer;
		initnpctimer getmdnpcname("���n�[��#ep20MD_re03_09");
		warp getmdmapname("1@20cn2.gat"), 59, 257;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,62,258,3	script	���n�[��#ep20MD_re03_09	10469,9,9,{
	cutin "ep20_nyar02.png", 1;
	mes "[�����L]";
	mes "�E�F�b�I�I���B";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "�����Ŏ~�܂�A��";
	mes "�����Ă���̂ł��傤���H";
	mes "�����x�����Ă���悤�ȁc�c";
	mes "���A�������Ƀo�S�b�g�������܂��I";
	mes "�B��܂��傤�I";
	next;
	cutin "ep18_bagot_01.png", 2;
	mes "[�o�S�b�g]";
	mes "�c�c�v��͏����ł���";
	mes "���X�K���h�l�B";
	mes "�c����́u���̏ꏊ�v�����Łc�c�B";
	next;
	cutin "ep18_bagot_01.png", 255;
	emotion 1,"";
	menu "���̏ꏊ�H",-;
	cutin "ep19_lehar03.png", 2;
	mes "[���n�[��]";
	mes "�������ɂ���̂��c�c";
	mes "���X�K���h�c�c�I";
	next;
	cutin "ep20_lasgand01.png", 1;
	mes "[���X�K���h]";
	mes "�}���Ōv���i�߂�B";
	mes "�c�c�悤�₭�������肪���肾�B";
	mes "���܂ł�����ȂƂ����";
	mes "�����������Ă������͂Ȃ��B";
	next;
	cutin "ep18_bagot_03.png", 2;
	mes "[�o�S�b�g]";
	mes "�c�c�u���̏ꏊ�v�̑��݂�";
	mes "�C�t���������ł�";
	mes "�傫�Ȑi�W���Ǝv���܂����H";
	next;
	cutin "ep20_nyar05.png", 1;
	mes "�]�����L�����남�낵���l�q��";
	mes "�@���̏�ŃN���N������Ă���]";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "�ǂ������́A�L�H";
	mes "�����ɔ������Ă���H";
	next;
	cutin "ep20_nyar04.png", 1;
	mes "[�����L]";
	mes "�G�I���c�c�B";
	next;
	cutin "ep20_lasgand01.png", 1;
	mes "[���X�K���h]";
	mes "�c�c���̏ꏊ�ɓ��邽�߂�";
	mes "���@��������B";
	next;
	cutin "ep18_bagot_03.png", 2;
	mes "[�o�S�b�g]";
	mes "������񏳒m���Ă���܂��B";
	mes "�ł́A���X�K���h�l";
	mes "���̓����ł����c�c�B";
	next;
	cutin "ep19_lehar05.png", 2;
	hideonnpc getmdnpcname("���X�K���h#ep20MD_re02_09");
	hideonnpc getmdnpcname("�o�S�b�g#ep20MD_re02_09");
	mes "[���n�[��]";
	mes "�c�c�s�����悤�ł��B";
	next;
	cutin "ep20_nyar02.png", 1;
	mes "[�����L]";
	mes "�j���A�A���B";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "���A�L���܂������n�߂܂����I";
	mes "���̔L�ɂ��čs����";
	mes "�ǂ���ł��傤���H";
	next;
	cutin "ep20_nyar01.png", 1;
	mes "[�����L]";
	mes "�E���j�����I";
	next;
	cutin "ep19_lehar02.png", 2;
	mes "[���n�[��]";
	mes "���₨��I";
	mes "������̌����Ă��邱�Ƃ�";
	mes "�킩���Ă���݂����Ȕ����ł��I";
	mes "���Ⴀ�A���ē������肢�ˁB";
	close2;
	cutin "ep19_lehar01.png", 255;
	stopnpctimer;
	initnpctimer getmdnpcname("���n�[��#ep20MD_re04_09");
	hideonnpc getmdnpcname("���n�[��#ep20MD_re03_09");
	hideonnpc getmdnpcname("�L#ep20MD_re02_09");
	hideoffnpc getmdnpcname("���n�[��#ep20MD_re04_09");
	hideoffnpc getmdnpcname("�L#ep20MD_re03_09");
	hideoffnpc getmdnpcname("�A�[�E�B��#ep20MD_re01_09");
	hideoffnpc getmdnpcname("���K��#ep20MD_re01_09");
	hideoffnpc getmdnpcname("���K��#ep20MD_re02_09");
	hideoffnpc getmdnpcname("���K��#ep20MD_re03_09");
	hideoffnpc getmdnpcname("���K��#ep20MD_re04_09");
	viewpoint 1, 64, 224, 1, 0xFF0000;
	end;
OnTouch:
	unittalk "���n�[�� : �������ł��I";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,69,266,3	script	���X�K���h#ep20MD_re02_09	22007,{
	unittalk "���X�K���h : �c�c�󋵂�񍐂���B";
	end;
}

1@20cn2.gat,71,264,1	script	�o�S�b�g#ep20MD_re02_09	10386,{
	unittalk "�o�S�b�g : �c�c���̏ꏊ�Ɋւ��Ăł����c�c�B";
	end;
}

1@20cn2.gat,63,257,3	script	�L#ep20MD_re02_09	22006,{
	cutin "ep20_nyar03.png", 1;
	mes "[�����L]";
	mes "���F�I�H���B";
	close2;
	cutin "ep20_nyar01.png", 255;
	end;
}

1@20cn2.gat,64,224,3	script(HIDDEN)	���n�[��#ep20MD_re04_09	10469,2,2,{
	cutin "ep20_nyar03.png", 1;
	mes "[�����L]";
	mes "�E���~�����~���I";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "����H�@�L���܂��~�܂�܂����ˁB";
	mes "����A���K���������W�܂��Ă��܂��B";
	mes "����ȏ�i�ނ̂͊댯�ł��B";
	next;
	cutin "ep19_lehar04.png", 2;
	mes "[���n�[��]";
	mes "����!!�@���̃��K��������";
	mes "���͂�ł���̂��āc�c!!";
	next;
	cutin "ep19_lehar02.png", 255;
	menu "�A�[�E�B���ł�",-;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "�܂����A���K���ɕ߂܂���!?";
	mes "�͂₭�����Ȃ��ƁI";
	next;
	cutin "ep20_nyar02.png", 1;
	mes "[�����L]";
	mes "�E�b�j�����A�~�����B";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "����c�c������������Ȃ��ŁI";
	mes "�c�c���������āA�����������Ă��ƁH";
	mes "�m���ɁA����œ˂����ނ̂�";
	mes "����ł͂Ȃ��̂ł��傤���c�c�B";
	next;
	cutin "ep19_lehar04.png", 2;
	mes "[���n�[��]";
	mes "�d���Ȃ��c�c�l�q���f���܂��傤�B";
	mes "�ǂ����Ɍ�������͂��B";
	next;
	cutin "ep19_lehar04.png", 255;
	mes "[���K��]";
	mes "���̊��X�����l�ԕ���߂��I";
	mes "�������ɖʓ|���Ƃ�";
	mes "�����t���₪���āI";
	next;
	mes "[���K��]";
	mes "�d���Ȃ��B";
	mes "�̑�Ȃ郉�X�K���h�l�ɏ]���悤��";
	mes "���̐l�Ԃɂ��]����";
	mes "���X�K���h�l����ꂽ�̂��B";
	next;
	mes "[�A�[�E�B��]";
	mes "�������A�Ȃ񂾂��̎p�́H";
	mes "�s�׍H�Ȃ����łȂ�";
	mes "�����ɂ����Ă��܂��B";
	mes "���̃f�J�C�́A�ǂ�����ē������񂾁H";
	next;
	cutin "ep19_lehar03.png", 2;
	mes "[���n�[��]";
	mes "���̕߂܂��Ă���A�[�E�B������";
	mes "�Ȃ񂾂��l�q���ςł���H";
	next;
	cutin "ep19_lehar04.png", 255;
	mes "[���K��]";
	mes "�����C�ɓ���Ȃ����c�c";
	mes "�A�C�c����������Ɏp��ς���";
	mes "�D���������Ă��ꂽ����Ȃ����B";
	mes "���x�́A�����炪���Ԃ��Ԃ��I";
	next;
	hideonnpc getmdnpcname("���K��#ep20MD_re04_09");
	hideoffnpc getmdnpcname("���K��#ep20MD_re04_1_09");
	mes "[���K��]";
	mes "�{���ɏ��������z�炾�I";
	mes "�����A�z��̐��̂����j��p�͂���I";
	mes "����������͒ʂ��Ȃ����Ă킯���B";
	mes "�L�b�L�L!!";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "�c�c!?!?";
	next;
	mes "[���n�[��]";
	mes "���K�����A�[�E�B���ɂȂ�܂����I";
	mes "�܂����A���B�����K���ɉ������݂�����";
	mes "���K�����A�[�E�B���ɉ�������@��";
	mes "��������ł��傤��!?";
	next;
	mes "[���n�[��]";
	mes "�������A���B�̐��̂����j��p��";
	mes "������Č����Ă܂���!!";
	mes "���킟�A��ς��I";
	mes "���̂��Ƃ𑁂��݂�Ȃɓ`���Ȃ��ƁI";
	next;
	cutin "ep19_lehar03.png", 2;
	mes "[���n�[��]";
	mes "�����ɂ�������E�o�������̂Ɂc�c";
	mes "�����A�v���悤�ɂ����Ȃ��̂�";
	mes "�C���C�����܂��B";
	close2;
	cutin "ep19_lehar04.png", 255;
	stopnpctimer;
	initnpctimer getmdnpcname("�L#ep20MD_re04_09");
	hideonnpc getmdnpcname("���n�[��#ep20MD_re04_09");
	hideonnpc getmdnpcname("�L#ep20MD_re03_09");
	hideonnpc getmdnpcname("�A�[�E�B��#ep20MD_re01_09");
	hideonnpc getmdnpcname("���K��#ep20MD_re01_09");
	hideonnpc getmdnpcname("���K��#ep20MD_re02_09");
	hideonnpc getmdnpcname("���K��#ep20MD_re03_09");
	hideonnpc getmdnpcname("���K��#ep20MD_re04_1_09");
	warp getmdmapname("1@20cn2.gat"), 110, 66;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "���n�[�� : �L���܂��~�܂�܂����ˁB";
	end;
}

1@20cn2.gat,63,227,3	script(HIDDEN)	�L#ep20MD_re03_09	22006,{
	unittalk "�L : �~�j���A�B";
	end;
}

1@20cn2.gat,57,223,3	script(HIDDEN)	���K��#ep20MD_re01_09	10475,{
	unittalk "���K�� : �����c�c���������Ȃ��B�A���ĉ��ɂȂ肽���B";
	end;
}

1@20cn2.gat,54,222,5	script(HIDDEN)	�A�[�E�B��#ep20MD_re01_09	21978,{
	unittalk "�A�[�E�B�� : �P�z�P�z�I�@�H�������ɓ������݂����B";
	end;
}

1@20cn2.gat,52,221,7	script(HIDDEN)	���K��#ep20MD_re04_09	10475,{
	unittalk "���K�� : �c�c�悭����ȑ̂œ�����ȁH";
	end;
}

1@20cn2.gat,57,220,1	script(HIDDEN)	���K��#ep20MD_re02_09	10473,{
	unittalk "���K�� : �P�z�P�z�I�@���ÂɉH�����΂��񂶂�Ȃ��I";
	end;
}

1@20cn2.gat,53,219,7	script(HIDDEN)	���K��#ep20MD_re03_09	10474,{
	unittalk "���K�� : ���X�������A���̊O���痈���l�Ԃ̖��߂͐�΂��B";
	end;
}

1@20cn2.gat,52,221,7	script(HIDDEN)	���K��#ep20MD_re04_1_09	21978,{
	unittalk "���K�� : �O�G�b�A����ς蓮���Â炢�I";
	end;
}

1@20cn2.gat,107,65,3	script2	�L#ep20MD_re04_09	22006,2,2,{
	cutin "ep20_nyar02.png", 1;
	mes "[�����L]";
	mes "�j���A�A�@�@�I�H�B";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "������Ȃ��悤��";
	mes "�������������܂��傤�c�c�B";
	next;
	cutin "ep19_lehar05.png", 255;
	announce "�x�� : �c�c��펖�Ԕ����I�@��펖�Ԕ����I", 0x9, 0xffff99;
	if(!sleep2(3000)) end;
	announce "�x�� : �X�̏�̓z�炪�E�������I", 0x9, 0xffff99;
	if(!sleep2(3000)) end;
	announce "�x�� : �e���A������֖߂�I�@�x������������I", 0x9, 0xffff99;
	if(!sleep2(3000)) end;
	mes "[���K��]";
	mes "�����N�����H";
	mes "�N�������o�����񂾂��āH";
	next;
	mes "[���K��]";
	mes "�ߊl�����l�Ԃǂ��������o�����I";
	mes "�����̎�����ɖ߂�I";
	mes "�m��Ȃ���̓z��������ʕ񂵂�I";
	mes "�z��͎��B�Ɠ����p�ɕϐg�ł���I";
	next;
	cutin "ep19_lehar03.png", 2;
	mes "[���n�[��]";
	mes "���B�����K���ɕϐg���Ă������Ƃ�";
	mes "�o��������Ă�悤�ł��ˁc�c�B";
	next;
	cutin "ep20_nyar03.png", 1;
	mes "[�����L]";
	mes "�j�����j�����j���A�b�I";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "����A�L�������n�߂܂����I";
	mes "�ǁA�ǂ��ɍs���񂾂낤�c�c";
	mes "���čs�������Ȃ������ł���!?!?";
	close2;
	cutin "ep19_lehar03.png", 255;
	stopnpctimer;
	hideonnpc getmdnpcname("���n�[��#ep20MD_re05_09");
	viewpoint 1, 96, 65, 1, 0xFF0000;
	npcwalkto 96,65,getmdnpcname("�L#ep20MD_re04_09");
	npcwalkwait;
	initnpctimer getmdnpcname("�L#ep20MD_re04_1_09");
	hideonnpc getmdnpcname("�L#ep20MD_re04_09");
	hideoffnpc getmdnpcname("�L#ep20MD_re04_1_09");
	hideoffnpc getmdnpcname("���n�[��#ep20MD_re05_1_09");
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
OnTouch:
	unittalk "�L : �~���A�@�@�@�@���B";
	end;
OnInit:
	setnpcspeed 150;
	end;
}
1@20cn2.gat,96,65,3	script(HIDDEN)	�L#ep20MD_re04_1_09	22006,{
	hideoffnpc getmdnpcname("���K��#ep20MD_re05_09");
	hideoffnpc getmdnpcname("���K��#ep20MD_re06_09");
	hideoffnpc getmdnpcname("���K��#ep20MD_re07_09");
	menu "���K�����߂Â��ė��܂��I",-;
	unittalk getnpcid(0,getmdnpcname("���K��#ep20MD_re05_09")),"���K�� : �����o�����z��́A�ǂ��ɂ���񂾁I";
	unittalk getnpcid(0,getmdnpcname("���K��#ep20MD_re06_09")),"���K�� : �܂����߂��ɉB��Ă���񂶂�c�c�����Ƃ���ȁB";
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "���̂܂܂��ᔫ���킹�ł��I";
	mes "���`���A�L�I�@�L�l�I";
	mes "�s������_���I�@�_�������Ă����I";
	next;
	unittalk getnpcid(0,getmdnpcname("���K��#ep20MD_re05_09")),"���K�� : ��������A�����ڂɑ��킹�Ă��I";
	misceffect 562,getmdnpcname("���K��#ep20MD_re05_09");
	misceffect 562,getmdnpcname("���K��#ep20MD_re06_09");
	unittalk getnpcid(0,getmdnpcname("���K��#ep20MD_re07_09")),"���K�� : �z��𔭌�����΁A���X�K���h�l�ɖJ�߂Ă��炦�邩������Ȃ��I";
	misceffect 562,getmdnpcname("���K��#ep20MD_re07_09");
	cutin "ep19_lehar04.png", 2;
	mes "[���n�[��]";
	mes "�i�_�������I�@������!!�j";
	next;
	unittalk getnpcid(0,getmdnpcname("���K��#ep20MD_re07_09")),"���K�� : �Ƃɂ������f����ȁI�@�z����΂ɓ������ȁI";
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "����H";
	mes "�c�c����H";
	mes "��A�������ɋC�t���Ă��Ȃ��H";
	mes "�ǁA�ǂ��Ȃ��Ă��??";
	mes "���c�c���������āI";
	next;
	hideonnpc getmdnpcname("���K��#ep20MD_re05_09");
	delmisceffect 562, getmdnpcname("���K��#ep20MD_re05_09");
	hideonnpc getmdnpcname("���K��#ep20MD_re06_09");
	delmisceffect 562, getmdnpcname("���K��#ep20MD_re06_09");
	hideonnpc getmdnpcname("���K��#ep20MD_re07_09");
	delmisceffect 562, getmdnpcname("���K��#ep20MD_re07_09");
	cutin "ep19_lehar06.png", 2;
	mes "[���n�[��]";
	mes "���A������L�̔\�͂ł��傤���H";
	mes "���������O���󂵂�����";
	mes "�Ȃɂ��s�v�c�ȗ͂������܂������c�c�B";
	next;
	cutin "ep19_lehar03.png", 255;
	menu "���������ƌ����Ă�݂����ł�",-;
	cutin "ep19_lehar06.png", 2;
	mes "[���n�[��]";
	mes "�L���`�I�@����ȏ��������Ȃ��ŁI";
	mes "�ӁA�����j����!!";
	mes "�͂��͂��c�c�ǂ����p���B����̂�";
	mes "�Z���Ԃ����݂����ł��ˁB";
	next;
	cutin "ep19_lehar02.png", 2;
	mes "[���n�[��]";
	mes "�ł��A�������ŏ�����܂����B";
	mes "�N���Ė{���ɐ����ˁI";
	mes "����ɂƂ��Ă������I";
	next;
	cutin "ep20_nyar01.png", 1;
	mes "�]�����L�͓��ӂ��Ɋ{���グ";
	mes "�@�K�����s���Ɨ��Ă��";
	mes "�@�Ăѕ����n�߂��]";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "���čs���܂��傤�I";
	close2;
	cutin "ep19_lehar05.png", 255;
	stopnpctimer;
	initnpctimer getmdnpcname("���n�[��#ep20MD_re06_09");
	hideonnpc getmdnpcname("�L#ep20MD_re04_1_09");
	hideonnpc getmdnpcname("���n�[��#ep20MD_re05_1_09");
	hideoffnpc getmdnpcname("���n�[��#ep20MD_re06_09");
	hideoffnpc getmdnpcname("�L#ep20MD_re05_09");
	viewpoint 1, 33, 14, 1, 0xFF0000;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,109,63,3	script2	���n�[��#ep20MD_re05_09	10469,{
	unittalk "���n�[�� : �}���܂��傤�I";
	end;
OnInit:
	setnpcspeed 200;
	end;
}

1@20cn2.gat,98,63,3	script(HIDDEN)	���n�[��#ep20MD_re05_1_09	10469,{
	unittalk "���n�[�� : ���`���A�L�I�@�L�l���I";
	end;
}

1@20cn2.gat,92,62,7	script(HIDDEN)	���K��#ep20MD_re05_09	10474,{
	unittalk "���K�� : �E�������z��A���̕ӂɉB��Ă���񂶂�Ȃ����H";
	end;
}
1@20cn2.gat,95,60,5	script(HIDDEN)	���K��#ep20MD_re06_09	10475,{
	unittalk "���K�� : ���̋߂��ɂ�����Ă����̂��H";
	end;
}

1@20cn2.gat,94,64,1	script(HIDDEN)	���K��#ep20MD_re07_09	10473,{
	unittalk "���K�� : ����ȋC�z�͂��Ȃ����c�c�B";
	end;
}

1@20cn2.gat,32,22,5	script(HIDDEN)	���n�[��#ep20MD_re06_09	10469,{
	if(.scene == 3) {
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���Ă��������I";
		mes "���̔��A���o��������܂��񂩁H";
		next;
		cutin "ep19_lehar05.png", 255;
		menu "�ւ̑��̈�ԉ��Ō����c�c",-;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�ł���ˁI";
		mes "�����͂��̔��̓������Ă��Ƃł��I";
		mes "�����J����΁A�O�ɏo��܂���B";
		mes "�ǂ�ǂ�c�c�悵�I";
		mes "��������Ȃ�J����ꂻ���ł��I";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[�����L]";
		mes "�j���A�I�`";
		next;
		cutin "ep20_nyar04.png", 255;
		menu "�{���ɂ��肪�Ƃ�",-;
		emotion 3,getmdnpcname("���n�[��#ep20MD_re06_09");
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "���肪�Ƃ��A�L�����B";
		mes "�����܂ŗ��ꂽ�̂̓L�~�̂���������B";
		next;
		emotion 14,getmdnpcname("���n�[��#ep20MD_re06_09");
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�˂��A�ꏏ�ɗ���H";
		mes "�X�̂���ɂ��Ƃ�p�ӂ��Ă������B";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[�����L]";
		mes "�~���A���B";
		next;
		cutin "ep19_lehar07.png", 2;
		mes "[���n�[��]";
		mes "���̎q�A������ɐU��܂����ˁB";
		mes "����ς�A���B�̌��t��";
		mes "�������Ă���悤�Ɍ����܂��B";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "����A���R�ł͖��������c�c�B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����J���܂����I";
		mes "�����A�O�ɏo�܂��傤�I";
		mes "�ւ̑��ɂ͂܂��������̒��Ԃ����܂��B";
		mes "���݂��Ă����͂��ł���I";
		close2;
		cutin "ep19_lehar05.png", 255;
		viewpoint 1, 33, 14, 1, 0xFF0000;
		stopnpctimer;
		initnpctimer getmdnpcname("#ep20MD_re02_09");
		set .scene,4;
		end;
	}
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�����J���܂����I";
	mes "�����A�O�ɏo�܂��傤�I";
	mes "�ւ̑��ɂ͂܂��������̒��Ԃ����܂��B";
	mes "���݂��Ă����͂��ł���I";
	close2;
	viewpoint 1, 33, 14, 1, 0xFF0000;
	cutin "ep19_lehar05.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@20cn2.gat,34,20,5	script(HIDDEN)	�L#ep20MD_re05_09	22006,{
	unittalk "�L : �~���A���B";
	end;
}

1@20cn2.gat,31,19,5	script(HIDDEN)	���X�K���h#ep20MD_re03_09	22007,{}
1@20cn2.gat,30,21,5	script(HIDDEN)	�o�S�b�g#ep20MD_re03_09	10386,{}

1@20cn2.gat,33,15,0	script	#ep20MD_re02_09	45,2,2,{
OnTouch:
	if(.scene < 4) {
		unittalk getcharid(3),strcharinfo(0)+" : ���ɂ͌����������Ă���悤���B",1;
		end;
	}
	unittalk getnpcid(0,getmdnpcname("���n�[��#ep20MD_re06_09")),"���n�[�� : �������A��������Ă��������I";
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�O�ɏo�܂��傤�I";
	mes "�}���ŁI";
	next;
	cutin "ep19_lehar01.png", 255;
	menu "������O�ɏo��",-;
	hideonnpc getmdnpcname("�L#ep20MD_re05_09");
	hideonnpc getmdnpcname("���n�[��#ep20MD_re06_09");
	misceffect 809,"";
	mes "�c�c�B";
	next;
	mes "�c�c�c�c�B";
	next;
	mes "�c�c�c�c�c�c�B";
	next;
	hideoffnpc getmdnpcname("���X�K���h#ep20MD_re03_09");
	hideoffnpc getmdnpcname("�o�S�b�g#ep20MD_re03_09");
	unittalk getnpcid(0,getmdnpcname("�o�S�b�g#ep20MD_re03_09")),"�o�S�b�g : �c�c�����܂�����A���X�K���h�l�B";
	emotion 9,getmdnpcname("�o�S�b�g#ep20MD_re03_09");
	cutin "ep18_bagot_02.png", 2;
	mes "[�o�S�b�g]";
	mes "�c�c�����܂Łu���͍��v��";
	mes "�����Ă��܂��B";
	mes "�ӂ���c�c";
	mes "����͎ւ̑��֌q������ł��������H";
	next;
	mes "[�o�S�b�g]";
	mes "�J���Ă��܂��ˁB";
	mes "�`���҂�����";
	mes "��������O�ɏo���悤�ł��B";
	next;
	cutin "ep20_lasgand02.png", 1;
	mes "[���X�K���h]";
	mes "�c�c���ꂾ���̌x���Ԃ�~��������";
	mes "�����ɒH�蒅�����Ƃ����̂��H";
	mes "���ꂪ�z��̗͂��ƁH";
	next;
	cutin "ep18_bagot_02.png", 2;
	mes "[�o�S�b�g]";
	mes "���̋͂��Ɏc�閂�͍��c�c";
	mes "�`���҂̂��̂ł͂���܂���B";
	mes "���̎����̐��E�҂̂��́c�c";
	mes "����Ƃ��c�c�B";
	next;
	cutin "ep20_lasgand02.png", 1;
	mes "[���X�K���h]";
	mes "�ʂ̋��͎҂��������c�c";
	mes "�l�Ԃ�������p�̔��e�𗽉킵�Ă���B";
	mes "�܂����c�c�B";
	next;
	cutin "ep18_bagot_02.png", 2;
	mes "[�o�S�b�g]";
	mes "�c�c�c�c";
	mes "���̔��͂ǂ��������܂��H";
	mes "�Ăѕ����܂����H";
	next;
	cutin "ep20_lasgand04.png", 1;
	mes "[���X�K���h]";
	mes "���̂܂܂ɂ��Ă��������";
	mes "�x������������B";
	mes "�c�c�z���͕K�������ɖ߂��ė���B";
	next;
	cutin "ep20_lasgand03.png", 1;
	mes "[���X�K���h]";
	mes "�ւ̑��ɑ��𓥂ݓ���邱�Ƃ�";
	mes "�ǂ��������Ƃ��c�c";
	mes "�킩�点�Ă�낤�B";
	next;
	cutin "ep20_lasgand02.png", 255;
	stopnpctimer;
	chgquest 16701,16702;
	set EP20_1QUE,13;
	mes "�]�C�X�K���h �X�̏��";
	mes "�@�������܂����H�]";
	next;
	if(select("������","��߂�") == 2) {
		mes "�]���̏�ɂƂǂ܂����]";
		close;
	}
	//miss
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}
