//= Auriga Script ==============================================================
// Ragnarok Online Central Laboratory Script	by refis
//==============================================================================
verus01.gat,149,155,5	script	�����T����#pa0829_01	865,{/* 59695 */
	if(!checkquest(12346)) {
		mes "[�����T����]";
		mes "�����̌Ñ㕶����";
		mes "���낢��ƕs�v�c�ȓ_�������̂ł��B";
		next;
		mes "[�����T����]";
		mes "�ϑw�̔N�ォ��@�����";
		mes "�Œ�ł�500�`600�N�͌o���Ă����";
		mes "���肳��܂����A";
		mes "�����Ŕ��@���ꂽ���̂�";
		mes "���݂̎������̉Ȋw�Z�p���";
		mes "�D��Ă���悤�Ȃ̂ł��B";
		next;
		mes "[�����T����]";
		mes "�������ꂽ�Â��L�^�����";
		mes "���̐��̂�������Ȃ��P���";
		mes "�����������Ă��܂��B";
		next;
		menu "���̂�������Ȃ��P��H",-;
		mes "[�����T����]";
		mes "�����ł��B�Ⴆ�΁c�c";
		mes "^0000ff�}�U�[�R���s���[�^�[^000000��";
		mes "^0000ffLSI�`�b�v^000000�B";
		mes "���Ƃ͂����ł��ˁA";
		mes "^0000ff����t���Ă���^000000�Ȃ�ĒP���";
		mes "������܂����B";
		next;
		mes "[�����T����]";
		mes "����t���Ă����͂Ƃ������A";
		mes "���̑��̂��̂�";
		mes "���������ǂ�ȋZ�p�̌����̂Ȃ̂�";
		mes "�v��m��܂���B";
		next;
		mes "[�����T����]";
		mes "�����̉Ȋw�Z�p�̍��Ղ�";
		mes "�֘A����҂����̋L�^�ɁA";
		mes "���ʂ��Č��y����Ă��܂����B";
		next;
		if(select("�����[���ł���","���܂苻��������܂���") == 2) {
			mes "[�����T����]";
			mes "����͎c�O�ł��ˁB";
			mes "����ł͂܂��B";
			close;
		}
		mes "[�����T����]";
		mes "���͉Ȋw�Z�p�̎g�������A";
		mes "�����̎��㑜�ƘA�g����";
		mes "�T�����邱�Ƃ��d���Ƃ��Ă��܂��B";
		mes "�܂������������̂�";
		mes "���X������̂ł����B";
		next;
		mes "[�����T����]";
		mes "�{���Ȃ炱���ɂ��鎟���ړ��@��";
		mes "���ڌ������ɍs�������̂ł����A";
		mes "���̗D��Ɩ����l�܂��Ă܂��āc�c�B";
		mes "����Ɏ��͋����Ȃ��ł����ˁB";
		next;
		mes "[�����T����]";
		mes "�����łł����A";
		mes "���Ȃ��͂�������^ff0000�ߋ�^000000��";
		mes "�����Ă݂�C�͂���܂��񂩁H";
		next;
		mes "[�����T����]";
		mes "���������[�����̂𔭌�������";
		mes "�����Ă���������Ɗ������ł��B";
		next;
		if(select("�ߋ��ɍs���܂�","��������܂���") == 2) {
			mes "[�����T����]";
			mes "�����ł����A";
			mes "��������������܂����Ă��������B";
			close;
		}
		mes "[�����T����]";
		mes "�{���ł����I";
		mes "�����͂Ɋ��ӂ��܂�!!";
		setquest 12346;
		next;
		compquest 12346;
		if(getonlinepartymember() < 1) {
			mes "[�����T����]";
			mes "^ff0000�p�[�e�B�[���������Ă��Ȃ���";
			mes "���̐�ɂ͐i�߂܂���B^000000";
			mes "1�l�ȏ�̃p�[�e�B�[����邩�A";
			mes "���̃p�[�e�B�[�ɉ������Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		if(select("���Ԃ̘c�݂𐶐�","��b����߂�") == 2) {
			mes "�]���Ȃ��͂��̏����ɂ����]";
			close;
		}
		mdcreate "rose";
		mes "[�����T����]";
		mes "���Ԃ̘c���J�������";
		mes "������x�b�������Ă��������B";
		close;
	}
	if(checkquest(118320)) {
		mes "[�����T����]";
		mes "���A��Ȃ����B";
		mes "���������[�����̂�";
		mes "������܂������H";
		next;
		mes "�]�����������̓�����";
		mes "�@�ڌ��������e��`�����]";
		next;
		mes "[�����T����]";
		mes "�ȁA�Ȃ�ƁI";
		mes "�����ɂ�����������";
		mes "�����̎��s��";
		mes "�ł񂾂Ɓc�c�B";
		next;
		mes "[�����T����]";
		mes "�ɂ킩�ɂ͐M�����܂���";
		mes "�Ȃ�قǁc�c";
		mes "��ϋ����[�����e�ł��ˁB";
		next;
		mes "[�����T����]";
		mes "�����͂��肪�Ƃ��������܂����B";
		mes "����ƌ����قǂł͂���܂���";
		mes "����������󂯎�肭�������B";
		next;
		mes "[�����T����]";
		mes "�܂��A�����ɂ����͒����鎞��";
		mes "���ɐ��������Ă��������ˁB";
		mes "���҂����Ă��܂��B";
		if(checkitemblank() == 0) {
			next;
			mes "[�����T����]";
			mes "����A�ו��̐���������";
			mes "�����Ƃ��ł��Ȃ��悤�ł��ˁB";
			mes "�ו������炵�Ă���";
			mes "�܂��A���Ă��������B";
			close;
		}
		delquest 118320;
		if(checkquest(118325) & 0x8 == 0) {
			setquest 118325;
			compquest 118325;
			getitem 6962,10;
		}
		else {
			getitem 6962,1;
		}
		close;
	}
	mes "[�����T����]";
	mes "����͂ǂ����܂����H";
	next;
	if(getonlinepartymember() < 1) {
		mes "[�����T����]";
		mes "^ff0000�p�[�e�B�[���������Ă��Ȃ���";
		mes "���̐�ɂ͐i�߂܂���B^000000";
		mes "1�l�ȏ�̃p�[�e�B�[����邩�A";
		mes "���̃p�[�e�B�[�ɉ������Ă���";
		mes "������x�b�������Ă��������B";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�����T����]";
		mes "���Ȃ��̓p�[�e�B�[�̃��[�_�[�ł�";
		mes "����܂���ˁB���[�_�[�̕����";
		mes "����̐\�����Ă��������܂�����A";
		mes "�����̘c�݂��J���܂��B";
		close;
	}
	if(checkquest(12347)) {
		if(checkquest(12347) & 0x2 == 0) {
			mes "[�����T����]";
			mes "����H";
			mes "�����ړ��̍��Ղ��c���Ă��܂��ˁB";
			mes "���Ղ����S�ɏ����Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		mes "^0000ff�]�����������̍��Ղ������܂����B";
		mes "�@�Đ������\�ł��]^000000";
		delquest 12347;
		close;
	}
	if(select("���Ԃ̘c�݂𐶐�","��b����߂�") == 2) {
		mes "�]���Ȃ��͂��̏����ɂ����]";
		close;
	}
	mdcreate "rose";
	mes "[�����T����]";
	mes "���Ԃ̘c���J�������";
	mes "������x�b�������Ă��������B";
	close;
}

verus01.gat,153,155,5	script	�Վ������ړ��@#pa0829_0	10007,{/* 59696 */
	if(!checkquest(12346)) {
		mes "[�����T����]";
		mes "����ł����A";
		mes "�`���҂̕��ł���ˁH";
		mes "���͂��̋@�B���g����";
		mes "�������s���Ă���̂ł����A";
		mes "�����A��낵��������";
		mes "���̘b�𕷂��Ē����܂��񂩁H";
		next;
		mes "�]�܂��͕����T������";
		mes "�@�b�𕷂��Ă݂悤�]";
		close;
	}
	if(select("���ꂷ��","��߂�") == 2) {
		mes "�]���Ȃ��͂��̏����ɂ����]";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[�Վ������ړ��@]";
		mes "^ff0000�p�[�e�B�[���������Ă��Ȃ���";
		mes "���̐�ɂ͐i�߂܂���B^000000";
		mes "1�l�ȏ�̃p�[�e�B�[����邩�A";
		mes "���̃p�[�e�B�[�ɉ������Ă���";
		mes "������x�b�������Ă��������B";
		close;
	}
	if(checkquest(12347)) {
		if(checkquest(12347) & 0x2 == 0) {
			mes "[�Վ������ړ��@]";
			mes "^0000ff�����ړ����s�������Ղ��c���Ă��܂��B";
			mes "���Ԃ̘c�̐��������";
			mes "�����������ւ̓��ꂪ���ۂ���܂����B^000000";
			close;
		}
		mes "[�Վ������ړ��@]";
		mes "^0000ff�����������̍��Ղ������܂����B";
		mes "�@�ē��ꂪ�\�ł��B^000000";
		delquest 12347;
		close;
	}
	switch(mdenter("rose")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[rose] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		setquest 12347;
		//warp "1@lab.gat",120,30;
		close;
	case 1:	// �p�[�e�B�[������
		mes "[�Վ������ړ��@]";
		mes "^ff0000�p�[�e�B�[���[�_�[�Ɠ����p�[�e�B�[��";
		mes "�����o�[�������A";
		mes "���Ԃ̘c�𗘗p�ł��܂��B^000000";
		close;
	case 2:	// �_���W�������쐬
		mes "[�Վ������ړ��@]";
		mes "^ff0000�p�[�e�B�[���[�_�[��";
		mes "���Ԃ̘c�𐶐����Ă��܂���B^000000";
		close;
	default:	// ���̑��G���[
		close;
	}
}

1@lab.gat,1,1,0	script	CentralLabControl1	139,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("centrallab_warp#1");
	hideonnpc getmdnpcname("centrallab_warp#2");
	hideonnpc getmdnpcname("centrallab_warp#3");
	hideonnpc getmdnpcname("centrallab_warp#4");
	hideonnpc getmdnpcname("centrallab_warp#5");
	hideonnpc getmdnpcname("centrallab_warp#end");
	for(set '@i,0; '@i<=14; set '@i,'@i+1) {
		if('@i<10)
			hideonnpc getmdnpcname("#centrallab_gen_0"+ '@i);
		else
			hideonnpc getmdnpcname("#centrallab_gen_"+ '@i);
	}
}

1@lab.gat,102,28,0	warp	centrallab_warp#1	1,1,1@lab.gat,97,28
1@lab.gat,80,28,0	warp	centrallab_warp#2	1,1,1@lab.gat,75,28
1@lab.gat,58,28,0	warp	centrallab_warp#3	1,1,1@lab.gat,53,28

1@lab.gat,104,34,4	script	���C������#pa0829	865,{
	if('flag) {
		mes "[���C������]";
		mes "���ɓ�����͊J���Ă��܂���B";
		close;
	}
	mes "[���C������]";
	mes "�����i���o�[32001��";
	mes "�����⏕�҂Ƃ���";
	mes "�Q��������ł����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[���C������]";
		mes "���������ԈႦ���悤�ł��ˁB";
		mes "�C���t�H���[�V������";
		mes "�ēx�₢���킹���������B";
		close;
	}
	mes "[���C������]";
	mes "�������苖�R�[�h�̊m�F�����܂��B";
	mes "���X���҂����������B";
	initnpctimer;
	close;
OnTimer4000:
	unittalk "���C������ : ���R�[�h�̈�v���m�F�B�������J���܂��B";
	end;
OnTimer8000:
	stopnpctimer;
	unittalk "���C������ : �ǂ����A�����肭�������B�����炱����ւ̈ړ��͂ł��܂���̂Œ��ӂ��Ă��������B";
	hideoffnpc getmdnpcname("centrallab_warp#1");
	set 'flag,1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`128#rose"),1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`64#rose"),1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`32#rose"),1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`16#rose"),1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`8#rose"),1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`4#rose"),1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`2#rose"),1;
	set getvariableofnpc('flag,getmdnpcname("�X�C�b�`1#rose"),1;
	end;
}
//1@lab.gat,104,34,4	script	���C������#pa0829_2	865,{/* 61643 (hide)*/}

1@lab.gat,37,37,3	script	�X�C�b�`128#rose	844,{/* 61652 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,39,37,3	script	�X�C�b�`64#rose	844,{/* 61653 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,41,37,3	script	�X�C�b�`32#rose	844,{/* 61654 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,43,37,3	script	�X�C�b�`16#rose	844,{/* 61655 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,46,37,3	script	�X�C�b�`8#rose	844,{/* 61656 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,48,37,3	script	�X�C�b�`4#rose	844,{/* 61657 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,50,37,3	script	�X�C�b�`2#rose	844,{/* 61658 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,52,37,3	script	�X�C�b�`1#rose	844,{/* 61659 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18;
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,45,32,3	script	��C������#pa0829	865,{/* 61660 */
	mes "[��C������]";
	mes "�����܂ł����łɂȂ����Ƃ������Ƃ�";
	mes "^ff0000���q��������^000000�̎Q���҂ł��ˁB";
	next;
	mes "[��C������]";
	mes "�{���̗������苖�R�[�h��";
	mes "^0000ff" +getvariableofnpc('code,getmdnpcname("���C���X�C�b�`#rose"))+ "^000000�ł��B";
	mes "���R�[�h��2�i���ɕϊ����āA";
	mes "���̌��ɂ���X�C�b�`��";
	mes "���͂��Ă��������B";
	next;
	mes "[��C������]";
	mes "���̃R�[�h�͓��ւ��ł��B";
	mes "���͒��ɓ��t���ς��ƁA";
	mes "�R�[�h���ύX����܂��̂�";
	mes "�����ӂ��������B";
	next;
	mes "[��C������]";
	mes "�X�C�b�`�����킹�����";
	mes "������ׂ̃��C���X�C�b�`��";
	mes "�����Ă��������B";
	donpcevent getmdnpcname("��C������#pa0829")+ "::OnStart";
	close;
OnStart:
	initnpctimer;
	misceffect 18,getmdnpcname("�X�C�b�`128#rose");
	misceffect 18,getmdnpcname("�X�C�b�`64#rose");
	misceffect 18,getmdnpcname("�X�C�b�`32#rose");
	misceffect 18,getmdnpcname("�X�C�b�`16#rose");
	misceffect 18,getmdnpcname("�X�C�b�`8#rose");
	misceffect 18,getmdnpcname("�X�C�b�`4#rose");
	misceffect 18,getmdnpcname("�X�C�b�`2#rose");
	misceffect 18,getmdnpcname("�X�C�b�`1#rose");
	end;
OnTimer5000:
	initnpctimer;
	misceffect 203,getmdnpcname("���C���X�C�b�`#rose");
	misceffect 204,getmdnpcname("�X�C�b�`128#rose");
	misceffect 205,getmdnpcname("�X�C�b�`64#rose");
	misceffect 206,getmdnpcname("�X�C�b�`32#rose");
	misceffect 207,getmdnpcname("�X�C�b�`16#rose");
	misceffect 208,getmdnpcname("�X�C�b�`8#rose");
	misceffect 209,getmdnpcname("�X�C�b�`4#rose");
	misceffect 210,getmdnpcname("�X�C�b�`2#rose");
	misceffect 211,getmdnpcname("�X�C�b�`1#rose");
	end;
OnStop:
	stopnpctimer;
	end;
}
1@lab.gat,34,37,3	script	���C���X�C�b�`#rose	844,{
	if(!'flag && !getnpctimer(1,getmdnpcname("���C���X�C�b�`#rose"))) {
		initnpctimer;
		unittalk "�{���̗������苖�R�[�h[" +'code+ "]";
		set 'input,	(getvariableofnpc('flag,getmdnpcname("�X�C�b�`128#rose") * 128) +
					(getvariableofnpc('flag,getmdnpcname("�X�C�b�`64#rose") * 64) +
					(getvariableofnpc('flag,getmdnpcname("�X�C�b�`32#rose") * 32) +
					(getvariableofnpc('flag,getmdnpcname("�X�C�b�`16#rose") * 16) +
					(getvariableofnpc('flag,getmdnpcname("�X�C�b�`8#rose") * 8) +
					(getvariableofnpc('flag,getmdnpcname("�X�C�b�`4#rose") * 4) +
					(getvariableofnpc('flag,getmdnpcname("�X�C�b�`2#rose") * 2) +
					(getvariableofnpc('flag,getmdnpcname("�X�C�b�`1#rose") * 1));
	}
	end;
OnTimer3000:
	unittalk "���͂��ꂽ2�i���ϊ��R�[�h[" +'input+ "]";
	end;
OnTimer6000:
	stopnpctimer;
	if('code != 'input) {
		unittalk "�R�[�h�̈�v���m�F�ł��܂���B�������R�[�h����͂��Ă��������B";
	}
	else {
		set 'flag,1;
		unittalk "�R�[�h�̈�v���m�F���܂����B�������J���܂��B";
		donpcevent getmdnpcname("��C������#pa0829")+ "::OnStop";
		hideoffnpc getmdnpcname("centrallab_warp#4");
		hideonnpc getmdnpcname("�X�C�b�`128#rose");
		hideonnpc getmdnpcname("�X�C�b�`64#rose");
		hideonnpc getmdnpcname("�X�C�b�`32#rose");
		hideonnpc getmdnpcname("�X�C�b�`16#rose");
		hideonnpc getmdnpcname("�X�C�b�`8#rose");
		hideonnpc getmdnpcname("�X�C�b�`4#rose");
		hideonnpc getmdnpcname("�X�C�b�`2#rose");
		hideonnpc getmdnpcname("�X�C�b�`1#rose");
	}
	end;
OnInit:
OnHour00:
	set 'code,rand(1,255);
	end;
}

1@lab.gat,29,38,0	warp	centrallab_warp#4	1,1,1@lab.gat,29,43	//61664
1@lab.gat,48,82,0	warp	centrallab_warp#5	1,1,1@lab.gat,58,82	//61665
1@lab.gat,91,80,5	script	#centrallab_gen_01	844,{/* 61666 (hide)*/}
1@lab.gat,96,81,5	script	#centrallab_gen_02	844,{/* 61667 (hide)*/}
1@lab.gat,99,85,5	script	#centrallab_gen_03	844,{/* 61668 (hide)*/}
1@lab.gat,99,91,5	script	#centrallab_gen_04	844,{/* 61669 (hide)*/}
1@lab.gat,96,95,5	script	#centrallab_gen_05	844,{/* 61670 (hide)*/}
1@lab.gat,91,97,5	script	#centrallab_gen_06	844,{/* 61671 (hide)*/}
1@lab.gat,85,96,5	script	#centrallab_gen_07	844,{/* 61672 (hide)*/}
1@lab.gat,82,91,5	script	#centrallab_gen_08	844,{/* 61673 (hide)*/}
1@lab.gat,82,86,5	script	#centrallab_gen_09	844,{/* 61674 (hide)*/}
1@lab.gat,85,81,5	script	#centrallab_gen_10	844,{/* 61675 (hide)*/}
1@lab.gat,90,97,5	script	#centrallab_gen_11	844,{/* 61676 (hide)*/}
1@lab.gat,82,89,5	script	#centrallab_gen_12	844,{/* 61677 (hide)*/}
1@lab.gat,91,80,5	script	#centrallab_gen_13	844,{/* 61678 (hide)*/}
1@lab.gat,99,88,5	script	#centrallab_gen_14	844,{/* 61679 (hide)*/}
1@lab.gat,80,87,7	script	Dr.�t�F�f���R#pa0829	865,{/* 61680 */}
1@lab.gat,81,84,7	script	Dr.�V���r�A#pa0829	982,{/* 61681 */}
1@lab.gat,80,90,6	script	Dr.�A���e�~�A#pa0829	982,{/* 61682 */}
1@lab.gat,81,93,6	script	Dr.���B���Z���g#pa0829	865,{/* 61683 */}

1@lab.gat,1,1,0	script	#eff_event1	139,{
OnEff1:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	end;
OnEff2:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	end;
OnEff3:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	end;
OnEff4:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	end;
OnEff5:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	misceffect 182,getmdnpcname("#centrallab_gen_06");
	end;
OnEff6:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	misceffect 182,getmdnpcname("#centrallab_gen_06");
	misceffect 182,getmdnpcname("#centrallab_gen_02");
	end;
OnEff7:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	misceffect 182,getmdnpcname("#centrallab_gen_06");
	misceffect 182,getmdnpcname("#centrallab_gen_02");
	misceffect 182,getmdnpcname("#centrallab_gen_07");
	end;
OnEff8:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	misceffect 182,getmdnpcname("#centrallab_gen_06");
	misceffect 182,getmdnpcname("#centrallab_gen_02");
	misceffect 182,getmdnpcname("#centrallab_gen_07");
	misceffect 182,getmdnpcname("#centrallab_gen_09");
	end;
OnEff9:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	misceffect 182,getmdnpcname("#centrallab_gen_06");
	misceffect 182,getmdnpcname("#centrallab_gen_02");
	misceffect 182,getmdnpcname("#centrallab_gen_07");
	misceffect 182,getmdnpcname("#centrallab_gen_09");
	misceffect 182,getmdnpcname("#centrallab_gen_05");
	end;
OnStop:
	stopnpctimer;
	end;
OnStart:
OnTimer1000:
	initnpctimer;
OnEff10:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_02");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	misceffect 182,getmdnpcname("#centrallab_gen_05");
	misceffect 182,getmdnpcname("#centrallab_gen_06");
	misceffect 182,getmdnpcname("#centrallab_gen_07");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_09");
	misceffect 182,getmdnpcname("#centrallab_gen_10");
	end;
}

1@lab.gat,1,1,0	script	#eff_event2	139,{
OnEff1:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	end;
OnEff2:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	end;
OnEff3:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	end;
OnEff4:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	misceffect 106,getmdnpcname("#centrallab_gen_04");
	end;
OnEff5:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	misceffect 106,getmdnpcname("#centrallab_gen_04");
	misceffect 106,getmdnpcname("#centrallab_gen_06");
	end;
OnEff6:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	misceffect 106,getmdnpcname("#centrallab_gen_04");
	misceffect 106,getmdnpcname("#centrallab_gen_06");
	misceffect 106,getmdnpcname("#centrallab_gen_02");
	end;
OnEff7:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	misceffect 106,getmdnpcname("#centrallab_gen_04");
	misceffect 106,getmdnpcname("#centrallab_gen_06");
	misceffect 106,getmdnpcname("#centrallab_gen_02");
	misceffect 106,getmdnpcname("#centrallab_gen_07");
	end;
OnEff8:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	misceffect 106,getmdnpcname("#centrallab_gen_04");
	misceffect 106,getmdnpcname("#centrallab_gen_06");
	misceffect 106,getmdnpcname("#centrallab_gen_02");
	misceffect 106,getmdnpcname("#centrallab_gen_07");
	misceffect 106,getmdnpcname("#centrallab_gen_09");
	end;
OnEff9:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	misceffect 106,getmdnpcname("#centrallab_gen_04");
	misceffect 106,getmdnpcname("#centrallab_gen_06");
	misceffect 106,getmdnpcname("#centrallab_gen_02");
	misceffect 106,getmdnpcname("#centrallab_gen_07");
	misceffect 106,getmdnpcname("#centrallab_gen_09");
	misceffect 106,getmdnpcname("#centrallab_gen_05");
	end;
OnStop:
	stopnpctimer;
	end;
OnStart:
OnTimer2000:
	initnpctimer;
OnEff10:
	misceffect 106,getmdnpcname("#centrallab_gen_01");
	misceffect 106,getmdnpcname("#centrallab_gen_02");
	misceffect 106,getmdnpcname("#centrallab_gen_03");
	misceffect 106,getmdnpcname("#centrallab_gen_04");
	misceffect 106,getmdnpcname("#centrallab_gen_05");
	misceffect 106,getmdnpcname("#centrallab_gen_06");
	misceffect 106,getmdnpcname("#centrallab_gen_07");
	misceffect 106,getmdnpcname("#centrallab_gen_08");
	misceffect 106,getmdnpcname("#centrallab_gen_09");
	misceffect 106,getmdnpcname("#centrallab_gen_10");
	end;
}

1@lab.gat,1,1,0	script	#eff_event3	139,{
OnStop:
	stopnpctimer;
	end;
OnStart:
OnTimer1000:
	initnpctimer;
OnEff10:
	misceffect 182,getmdnpcname("#centrallab_gen_01");
	misceffect 182,getmdnpcname("#centrallab_gen_02");
	misceffect 182,getmdnpcname("#centrallab_gen_03");
	misceffect 182,getmdnpcname("#centrallab_gen_04");
	misceffect 182,getmdnpcname("#centrallab_gen_05");
	misceffect 182,getmdnpcname("#centrallab_gen_06");
	misceffect 182,getmdnpcname("#centrallab_gen_07");
	misceffect 182,getmdnpcname("#centrallab_gen_08");
	misceffect 182,getmdnpcname("#centrallab_gen_09");
	misceffect 182,getmdnpcname("#centrallab_gen_10");
	end;
}

1@lab.gat,80,89,0	script	#CentralLabEVENT01	139,5,5,{
	initnpctimer;
	hideonnpc getmdnpcname("#CentralLabEVENT01");
	end;
OnTimer1000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : ���āA���ꂶ�Ⴛ�낻��n�߂܂����ˁH�@Dr.�x���[�j�͂܂��ł����H";
	end;
OnTimer5000:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �����炭�ŏI�`�F�b�N�̓r�����Ǝv���܂��B�Ȃɂ��K�͂̑傫�Ȏ����ł�����B";
	end;
OnTimer9000:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : ������A���ғ����܂߂����߂Ă̎����ł�����ˁA�T�d�ɂ��Ȃ�܂��B";
	end;
OnTimer13000:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : ���`�I�@�Ƃ��ƂƏI��点�ăL���L���ɗ₦���}�X�e���������݂����I";
	end;
OnTimer16000:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : ���[�����I�@���ꏏ�����Ă��������I";
	end;
OnTimer22000:
	announce "??? : �c�c�A�`�c�c�A�c�c�e�X�c�c�}�C�N�e�X�g�ł��B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer24000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : ���炵���悤���B";
	end;
OnTimer26500:
	announce "??? : �v���W�F�N�g���A���q������ғ������B���ӔC�ҁA���[�E�x���[�j�B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer31500:
	announce "���[�E�x���[�j : ���ݎ���1��3���ߑO10��25���c�c",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer36500:
	announce "���[�E�x���[�j : �J�����ꂽ��Ԃł̗��q�������������͂ɗ^����e���ɂ��āB�e�X�g�J�n���܂��B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer41500:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �͂��c�c����ς�Ȃ񂾂��C���ȗ\��������c�c";
	end;
OnTimer44500:
	announce "���[�E�x���[�j : ������C��Dr.�t�F�f���R�A�A���e�~�A�A�V���r�A�A���B���Z���g����ѕ⏕�������͎������J�n���Ă��������B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer49500:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �l�ی샊�A�N�^�[�ғ����m�F�c�c�����J�n���܂��B";
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff1";
	end;
OnTimer51500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff2";
	end;
OnTimer52500:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �W�F�l���[�^�[�ғ��A�J�n�B";
	end;
OnTimer53500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff3";
	end;
OnTimer55000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff4";
	end;
OnTimer55500:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : �W�F�l���[�^�[��]����10,000RPM�ɌŒ�B";
	end;
OnTimer56500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff5";
	end;
OnTimer57500:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �T�C�N���g�������d���A���e�͈͓��Ɏ��܂��Ă��܂��B";
	end;
OnTimer58000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff6";
	end;
OnTimer59500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff7";
	end;
OnTimer60500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff8";
	end;
OnTimer61000:
	announce "���[�E�x���[�j : ���̎����͍��܂ő��݂��Ȃ������V�����̐����̂��߂ɍs���܂��B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer62000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff9";
	end;
OnTimer63000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStart";
	end;
OnTimer65500:
	announce "���[�E�x���[�j : �L�^�S���͉�����ɑ������ꂽ�G�}�̔����ɂ��Ăł��邾���ڂ����L�ڂ���悤�ɁB",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer71500:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �c�c��1�G�}���u�A�ڑ����J�n�B";
	end;
OnTimer80500:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �W�F�l���[�^�[�d���A�s����ł����܂����e�͈͂ł��B";
	end;
OnTimer83500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff1";
	end;
OnTimer85500:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : !?�@�҂��Ă�������!!�@������ƐG�}���u�ԂŔM�������m���܂����I�@�c�c�ł����A���e�͈͓��ł��B";
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff2";
	end;
OnTimer87500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff3";
	end;
OnTimer89500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff4";
	end;
OnTimer90500:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : ��������̉��x�㏸���B";
	end;
OnTimer91000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff5";
	end;
OnTimer92500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff6";
	end;
OnTimer94500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff7";
	end;
OnTimer95500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff8";
	end;
OnTimer96000:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �c�c320�x";
	end;
OnTimer96500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff9";
	end;
OnTimer98000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff10";
	end;
OnTimer99500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnStart";
	end;
OnTimer101000:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �c�c670�x�A���M���x���z��O�̑����ł��I";
	end;
OnTimer103500:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : 1000�x���z���܂����I�@Dr.�x���[�j!!���u�̒�~���Ă��܂��I";
	end;
OnTimer106300:
	announce "���[�E�x���[�j : �������A��肠��܂���B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer111000:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : ���������Ă��܂��I�@���ɗ\�z�͈͓����y���I�[�o�[���Ă����ł��I";
	end;
OnTimer114000:
	announce "���[�E�x���[�j : �z����ł��A����ێ����B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer116750:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �i�����Ă�c�c�j";
	end;
OnTimer122000:
	announce "MA-4885 : ���C���T�[�o�[�̕ϓ��󋵂��m�F�B���q�����킨��ѐG�}���u�Ԃ̎����p�Ȕ��������m�B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer124500:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : Dr.�x���[�j�I�@�}�U�[�R���s���[�^�[�̊댯�󋵂Ɣ��f���܂��I�@��d���𗎂Ƃ��Ă��������I";
	end;
OnTimer130000:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �������������N���Ă�񂾁I�@�N�ł��������炠�̃|���R�c�̓d���𗎂Ƃ��I";
	end;
OnTimer133000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStop";
	donpcevent getmdnpcname("#eff_event2")+ "::OnStop";
	announce "MA-4885 : �c�c���C�����u�̒�~���m�F�B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer135500:
	announce "MA-4885 : �c�c�B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer138500:
	announce "MA-4885 : ���C�����u�̍ĉғ����J�n���܂��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer147500:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : MA-4885�I�@����ɍĉғ��Ȃ�āI�@�N���I�[�_�[�͏o���ĂȂ����I";
	end;
OnTimer150500:
	announce "MA-4885 : �I�[�_�[�ADr.�A���e�~�A�Ɗm�F�B���F�s�\�Ȗ��߂ł��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer156500:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �����I�@�c�cDr.�x���[�j�I�@�������Ɏ�������߂�ׂ��ł��I";
	end;
OnTimer159500:
	announce "���[�E�x���[�j : �c�c�B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer162500:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �����I�@���Ԃ��Ȃ��񂾁I�@�}�U�[�R���s���[�^�[�̓d���𗎂Ɓc�c";
	end;
OnTimer165500:
	announce "MA-4885 : ���q������̍ĉғ����1�i�K���ēx�J�n�B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer168500:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �c�c�x���[�j�I�@���f���āI";
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff1";
	end;
OnTimer170500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff2";
	end;
OnTimer171500:
	announce "���[�E�x���[�j : �c�c�b�I",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer172500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff3";
	end;
OnTimer174000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff4";
	end;
OnTimer175500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff5";
	end;
OnTimer177000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff6";
	end;
OnTimer177500:
	announce "���[�E�x���[�j : ������11��20���������āc�c�v���W�F�N�g���A���q������ғ��������ꎞ���f�B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer178500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff7";
	end;
OnTimer179700:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff8";
	end;
OnTimer180900:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff9";
	end;
OnTimer182000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStart";
	end;
OnTimer183500:
	announce "MA-4885 : �I�[�_�[�ADr.�x���[�j�Ɗm�F�B���F�s�\�Ȗ��߂ł��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer186500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff1";
	end;
OnTimer188500:
	announce "���[�E�x���[�j : MA-4885�A���͊Ǘ��ӔC�ҁADr.���[�E�x���[�j�B�����Ɍ��ݎ��s���̎������~���Ȃ����I",0x9,0x00ff77,0x190,12,0,0;
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff2";
	end;
OnTimer190500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff3";
	end;
OnTimer192000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff4";
	end;
OnTimer193500:
	announce "MA-4885 : ���F�s�\�Ȗ��߂ł��B",0x9,0xffff00,0x190,13,0,0;
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff5";
	end;
OnTimer195500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff6";
	end;
OnTimer196500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff7";
	end;
OnTimer198500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff8";
	end;
OnTimer199000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : �_�����c�I�@�����I�@�܂��������邼�I";
	end;
OnTimer199500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff9";
	end;
OnTimer200500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnStart";
	end;
OnTimer201000:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : ���`�`������ŐV�^��A.I.CPU�Ȃ�ĕt����񂶂�Ȃ������񂾂�I";
	end;
OnTimer204000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : �̂��c�c�������c�c�Ȃ��c�c";
	end;
OnTimer208000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStop";
	donpcevent getmdnpcname("#eff_event2")+ "::OnStop";
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �c�c�������Ɠ����ˁA��̉����N���Ă���́H";
	end;
OnTimer212000:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �ǂ��ł�������A����Ȃ́I�@���̂����ɂ��̃|���R�c���~�߂邼�I";
	end;
OnTimer217000:
	announce "MA-4885 : Dr.�V���r�A�̎�����m�F�B���݂��̋�Ԃ͔P���ꂽ�ʑ������荬�����Ă��܂��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer222000:
	announce "MA-4885 : �ʑ��̋ύt���ۂ����Έَ����̐����̂Ƃ̒��ړI�Ȍ𗬂��\�ɂȂ�Ɣ��f���܂��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer227000:
	announce "MA-4885 : �P���ꂽ�ʑ��̑Ώۂ��m�F���B�v�Z���J�n���܂��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer232000:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : ���̃|���R�c�̉�A�����l���Ă��!?�@�َ����̐����ƌ𗬂ł�����!?";
	end;
OnTimer236000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : ���܂�Ďn�߂Đ_�ɋF����������悤�c�c�B�_��I�@�|���R�c���~�߂Ă��������I";
	end;
OnTimer242000:
	announce "���[�E�x���[�j : �c�cMA-4885�B���Ȃ��͍��A���̐��E�Ƃ͈Ⴄ�����Ƃ̓����������݂Ă���̂ˁB",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer248000:
	announce "MA-4885 : Dr.�x���[�j�B���̒ʂ�ł��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer254000:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : Dr.�x���[�j�I�@���̎����͎��������ݒ肵�����̂Ƃ͑S���Ⴂ�܂��I";
	end;
OnTimer260000:
	announce "���[�E�x���[�j : �킩���Ă��܂��B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer266000:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : ��d�͂͗��Ƃ��Ȃ���!?";
	end;
OnTimer272000:
	announce "MA-4885 : ���q�������m�F�A1���ڑ����J�n�B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer277000:
	announce "���[�E�x���[�j : 1��3���ߑO11��38���B�������������ăv���W�F�N�g���A���q������ғ��������b��p���B",0x9,0x00ff77,0x190,12,0,0;
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff1";
	end;
OnTimer279000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff2";
	end;
OnTimer281000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff3";
	end;
OnTimer283000:
	announce "���[�E�x���[�j : ���R�̓}�U�[�R���s���[�^�[�ُ̈�쓮����щ������u�ُ̈�ߔM�B�L�^�I���B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer283500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff4";
	end;
OnTimer284000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff5";
	end;
OnTimer285500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff6";
	end;
OnTimer287000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff7";
	end;
OnTimer288000:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : ����ŁI�@���Ƃ͎�d�͂���������΁c�c�I";
	end;
OnTimer288500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff8";
	end;
OnTimer290000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff9";
	end;
OnTimer291000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStart";
	end;
OnTimer294000:
	announce "���[�E�x���[�j : �}�U�[�R���s���[�^�[MA-4885�ւ̓d�͋������~�B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer300000:
	announce "MA-4885 : �I�[�_�[�A���Ǘ��҃��[�E�x���[�j�Ɗm�F�B�L�^�I������ѓd�͋������~�B�I�[�_�[�����s���܂��B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer305000:
	announce "MA-4885 : �I�[�_�[�����s�c�c�I�[�_�[�����c�c�s�c�c�I�[�c�c�_�[���c�c���c�c",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer310000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStop";
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �ӂ��c�c�I������̂ł��傤���H";
	end;
OnTimer316000:
	announce "���[�E�x���[�j : �}�U�[�R���s���[�^�[MA-4885�ւ̓d�͋������~�����B���u��~���m�F�B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer321000:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �c�c�{���ɏI������݂����ł��ˁB";
	end;
OnTimer325000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : ���̃|���R�c�ACPU���ƂԂ������Ă��c�c�I";
	end;
OnTimer329000:
	announce "���[�E�x���[�j : �������܂ł̎������L�^���A����ŏI�����܂��B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer334000:
	announce "���[�E�x���[�j : �����̎��s������˂��~�߁A���̎����ɖ𗧂Ă܂��傤�B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer339000:
	announce "���[�E�x���[�j : �F����A�����l�ł����B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer344000:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �I���ł��ˁB";
	end;
OnTimer349000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : �x���[�j�̓ƒf�ōs��ꂽ�������Ǝv���Ă����AMA-4885�̕��ɖ�肪�������悤�ł��ˁB";
	end;
OnTimer354500:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �܂��͌�Еt�������āc�c������������o�܂��傤�I";
	end;
OnTimer359500:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �Ƃ���ł����c�c���O��́A�������H";
	end;
OnTimer364500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff1";
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer366500:
	announce "MA-4885 : CODE NAME - DESCENT",0x9,0xff0000,0x190,16,0,0;
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff2";
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer368500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff3";
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer370500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff4";
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer371500:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : �����I�@�ǂ��Ȃ��Ă��!!�@�I������񂶂�Ȃ������̂�!?";
	end;
OnTimer372000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff5";
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer373500:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff6";
	end;
OnTimer374500:
	announce "MA-4885 : �ŏI�ʑ��ω��̊J�n�B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer375000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff7";
	end;
OnTimer376000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff8";
	end;
OnTimer376500:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer377000:
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : ����ȁc�c���̃}�X�e�����c�c�I�@����t���Ă����c�c�I";
	donpcevent getmdnpcname("#eff_event1")+ "::OnEff9";
	end;
OnTimer378000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStart";
	end;
OnTimer378600:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer380700:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer382700:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff1";
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer384800:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff2";
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer386800:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff3";
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer390300:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff4";
	end;
OnTimer391000:
	announce "MA-4885 : ���݁A�P���ꂽ�ʑ��𐥐����邽�߂̍Čv�Z���B",0x9,0xffff00,0x190,13,0,0;
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer392000:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff5";
	end;
OnTimer393000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer393500:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff6";
	end;
OnTimer395000:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff7";
	end;
OnTimer396000:
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : MA-4885�͉��B���z�肵�Ă����ȏ�̎��������悤�Ƃ��Ă�c�c�B";
	end;
OnTimer396500:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff8";
	end;
OnTimer397000:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer397500:
	donpcevent getmdnpcname("#eff_event3")+ "::OnEff9";
	end;
OnTimer398000:
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �͂͂��A�@�B�̂����ɐl�ԗl���o���������Ƃ͂ȁc�c�BDr.�x���[�j�I�@�������邩�H�@���x����쓮���Ă���I";
	end;
OnTimer398500:
	donpcevent getmdnpcname("#eff_event3")+ "::OnStart";
	end;
OnTimer399000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer401000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer403500:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : �c�c��������H�@�݂�ȁB���Ȃ��Ƃ����̎������܂Ŋ������ނ킯�ɂ͍s���Ȃ��B";
	end;
OnTimer405000:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer407000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer408000:
	announce "���[�E�x���[�j : �ł��c�c���ꂶ�Ⴀ�Ȃ��B�́c�c!!",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer409000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer411000:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer413000:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �܂��A�ǂ��Ȃ邩�Ȃ�Ă܂�������Ȃ��ł���H�@����Ɏ����ړ��𒼐ڌo���Ȃ�āI�@���[���I�@�y���݁I";
	end;
OnTimer415000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer417000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer418000:
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : �c�c�V���������������ړ��Ȃ�Ăˁc�c���x�����Ⴄ���������ǂˁA�ӂӁB";
	end;
OnTimer419000:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer421000:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer423000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	announce "���[�E�x���[�j : �c�c�킩������B�c�c�t�F�f���R�A���B���Z���g�A�V���r�A�A�A���e�~�A�B���Ȃ��B�̔z���Ɋ��ӂ��܂��B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer425000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer427000:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer428000:
	announce "���[�E�x���[�j : �c�c���߂�Ȃ����c�c���肪�Ƃ��c�c�B",0x9,0x00ff77,0x190,12,0,0;
	end;
OnTimer429000:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer431000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer433000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	announce "�Ǘ��V�X�e�� : �x��!!�@�x��!!�@���q�������ɂđ�1���x�񂪔��߂���܂����B�S�������͑��₩�ɍŊ�̃V�F���^�[�֑ޔ����Ă��������B",0x9,0xff0000,0x190,13,0,0;
	end;
OnTimer435000:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer437000:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer438000:
	announce "�Ǘ��V�X�e�� : �J��Ԃ��܂��I�@���q�������ɂđ�1���x�񂪔��߂���܂����B�S�������͑��₩�ɍŊ�̃V�F���^�[�c�c",0x9,0xff0000,0x190,13,0,0;
	unittalk getmdnpcname("Dr.�t�F�f���R#pa0829"),"�t�F�f���R : �c�c�ւ��A���ꂪ�����ړ����c�c�B����A�m���ɏ��߂Ă��ȁB���̊����B";
	end;
OnTimer439000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer441000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer442000:
	misceffect 183,getmdnpcname("Dr.�t�F�f���R#pa0829");
	hideonnpc getmdnpcname("Dr.�t�F�f���R#pa0829");
	announce "MA-4885 : �����ړ��v���Z�X�c�c20%�B�ꕔ�̐����̂ɂ͎��������N����Ɨ\������܂��B",0x9,0xffff00,0x190,13,0,0;
	unittalk getmdnpcname("Dr.���B���Z���g#pa0829"),"���B���Z���g : ���̌������͂����Ɠ��������ȁc�c";
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff1";
	end;
OnTimer443000:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer444000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff2";
	end;
OnTimer445000:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer446000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff3";
	end;
OnTimer447000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	misceffect 183,getmdnpcname("Dr.���B���Z���g#pa0829");
	hideonnpc getmdnpcname("Dr.���B���Z���g#pa0829");
	unittalk getmdnpcname("Dr.�A���e�~�A#pa0829"),"�A���e�~�A : ��x�����������Ƃ������̂͂�����Ɖ��������ȁc�c�B";
	end;
OnTimer448000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff4";
	end;
OnTimer449000:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff5";
	end;
OnTimer451000:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff6";
	end;
OnTimer452000:
	misceffect 183,getmdnpcname("Dr.�A���e�~�A#pa0829");
	hideonnpc getmdnpcname("Dr.�A���e�~�A#pa0829");
	announce "MA-4885 : �����ړ��v���Z�X�i�s���c�c78%�BDemi-Plane�ɂ�鎟���N�H���s���Ă��܂��B",0x9,0xffff00,0x190,13,0,0;
	unittalk getmdnpcname("Dr.�V���r�A#pa0829"),"�V���r�A : �c�c�����`�B����Ȃ����o���ɂ͗₽���}�X�e�����Ƃ���t���Ă������~���������ȁB";
	end;
OnTimer452500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff7";
	end;
OnTimer453500:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer454500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff8";
	end;
OnTimer456000:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff9";
	end;
OnTimer457000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnStart";
	end;
OnTimer458500:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	misceffect 183,getmdnpcname("Dr.�V���r�A#pa0829");
	hideonnpc getmdnpcname("Dr.�V���r�A#pa0829");
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	end;
OnTimer461500:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer464000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnStop";
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff10";
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer464500:
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer465000:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff10";
	end;
OnTimer466500:
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	misceffect 90,getmdnpcname("#centrallab_gen_14");
OnTimer467500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff10";
	end;
OnTimer468500:
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	misceffect 90,getmdnpcname("#centrallab_gen_11");
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff10";
	end;
OnTimer469500:
	donpcevent getmdnpcname("#eff_event2")+ "::OnEff10";
	end;
OnTimer471000:
	donpcevent getmdnpcname("#eff_event1")+ "::OnStop";
	donpcevent getmdnpcname("#eff_event3")+ "::OnStop";
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer471200:
	announce "MA-4885 : �����ړ��v���Z�X�i�s���c�c100%�c�c�����BDemi-Plane�̎����Ɉʑ��Œ肵�܂����B",0x9,0xffff00,0x190,13,0,0;
	misceffect 90,getmdnpcname("#centrallab_gen_12");
	end;
OnTimer471400:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	misceffect 90,getmdnpcname("#centrallab_gen_13");
	end;
OnTimer471500:
	misceffect 90,getmdnpcname("#centrallab_gen_14");
	end;
OnTimer472500:
	announce "MA-4885 : ����������3��������Demi-Plane�ƐڐG���\�ȏo����������m����܂����B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer477500:
	announce "MA-4885 : �o������̈���͊m�F����Ă��܂���B����ł͂ǂ̎����ɂȂ����Ă���̂����f�ޗ�������܂���B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer482500:
	announce "MA-4885 : �܂������Ă��鐶���̂ɓ`���܂��B�����^���B�����Ă܂���܂��傤�B",0x9,0xffff00,0x190,13,0,0;
	end;
OnTimer487500:
	stopnpctimer;
	hideoffnpc getmdnpcname("centrallab_warp#end");
	announce "�]�����Ƀ��[�v�����N���o�����܂����B�ړ����Ă��������]",0x9,0xffff00,0x190,13,0,0;
	end;
}

1@lab.gat,123,88,0	script	centrallab_warp#end	45,1,1,{
	setquest 118320;
	warp "verus01.gat",152,150;
	end;
}
