//==============================================================================
// Drift Ice Area Memorial Dungeon Script
//==============================================================================
1@twsd.gat,0,0,0	script	Twsd_Control	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@map$,getmdmapname("1@twsd.gat");
	monster '@map$,317,78,"�i���s��#317_78",3982,1;
	monster '@map$,316,65,"�i���s��#317_78",3982,1;
	monster '@map$,313,65,"�i���s��#317_78",3982,1;
	monster '@map$,321,78,"�i���s��#317_78",3982,1;
	areasetcell '@map$,312,64,317,66,1;
	areasetcell '@map$,316,77,322,79,1;
	end;
}

1@twsd.gat,319,77,3	script	����Ǘ�#jorchs	10046,{
	set '@accept,2;
	mes "^FF0000[�C���t�H���[�V����]^000000";
	mes "^FF0000���̐�ւ�^000000";
	mes "^FF0000�������A���_���W������^000000";
	mes "^FF0000��������𖞂�����^000000";
	mes "^FF0000�قȂ�Q�[���A�J�E���g��^000000";
	mes "^FF0000�L�����N�^�[��"+'@accept+"�l�܂ŁA^000000";
	mes "^FF0000�ꏏ�ɐi�ނ��Ƃ��ł��܂��B^000000";
	next;
	set '@user,getarraysize(.user_id);
	mes "[�C���t�H���[�V����]";
	mes "�i�����܂����H";
	mes "�@";
	mes "^4A0084�]�i���L�����N�^�[���F "+'@user+" / "+'@accept+"�]^000000";
	next;
	if(select("^0000ff�͂�^000000","������") == 2) {
		mes "�]��߂��]";
		close;
	}
	mes "[�C���t�H���[�V����]";
	mes "�i�����܂��B";
	close2;
	for('@i=0; '@i<'@user; '@i++) {
		if(.user_id['@i] == 0)
			break;
		if(.user_id['@i] == getcharid(3)) {	// ����ς݃A�J�E���g
			if(.char_id['@i] != getcharid(0)) {	// �ʃL������NG
				// ������
				mes "[�C���t�H���[�V����]";
				mes "�����A�J�E���g�ɓ���ς݃L�����N�^�[�����݂��܂��B";
				close;
			}
			break;
		}
	}
	if('@i == '@accept) {	// ������
		// ������
		mes "[�C���t�H���[�V����]";
		mes "����ȏ���ꂷ�邱�Ƃ͂ł��܂���B";
		close;
	}
	else if('@i == '@user) {	// ���o�^
		set .user_id['@i],getcharid(3);
		set .char_id['@i],getcharid(0);
	}
	warp getmdmapname("1@twsd.gat"), 321, 83;
	end;
}

1@twsd.gat,321,84,0	script	#20msn00	139,5,5,{
	unittalk getnpcid(0,"���K���勳#20msd00"),"���K���勳 : �ށc�c�I�@�l�Ԃ̋C�z�����Ȃ����H",1;
	unittalk getcharid(3),strcharinfo(0)+" : �܂����A���K���ɕϐg���Ȃ��Ɓc�c�I",1;
	misceffect 595,"";
	sc_end EFST_MONSTER_TRANSFORM;
	sc_start3 EFST_MONSTER_TRANSFORM,21530,0,0,0,180000,1;
	end;
}

1@twsd.gat,314,94,5	script	���K���勳#20msd00	10474,{
	misceffect 595,"";
	sc_end SC_MONSTER_TRANSFORM;
	sc_start3 SC_MONSTER_TRANSFORM,21530,0,0,0,180000,1;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : �p�[�e�B�[���[�_�[�ɔC���悤",1;
		end;
	}
	set '@r00,getnpcid(0,getmdnpcname("���K���勳#20msd00"));
	set '@r01,getnpcid(0,getmdnpcname("���K���勳#20msd01"));
	set '@r02,getnpcid(0,getmdnpcname("���K���勳#20msd02"));
	set '@hh00,getnpcid(0,getmdnpcname("�n�[�g�n���^�[#20msd00"));
	set '@hh01,getnpcid(0,getmdnpcname("�n�[�g�n���^�[#20msd01"));
	misceffect 453,getmdnpcname("J�K�[�f�B�A��#ms00");
	misceffect 453,getmdnpcname("J�K�[�f�B�A��#ms01");
	misceffect 453,getmdnpcname("J�K�[�f�B�A��#ms02");
	mes "[���K���勳]";
	mes "�n�@�c�c";
	mes "�����玟�ւƗN���Ă���B";
	mes "�L�����Ȃ��ȁB";
	unittalk '@r00,"���K���勳 : �����玟�ւƗN���Ă���B";
	unittalk '@r01,"���K���勳 : �����Еt����I";
	next;
	menu "����`�����܂�",-;
	mes "[���K���勳]";
	mes "�Ȃ��i�Ղ������ɂ���H";
	mes "���߂Č���炾�ȁB";
	unittalk getcharid(3),strcharinfo(0)+" : ����`�����܂�";
	unittalk '@r02,"���K���勳 : �Ȃ��i�Ղ������ɂ���H";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "��������߂��Ă����҂ł��B";
	mes "�T���N�K���h�l����";
	mes "�|������`���悤�Ɍ����ė��܂����B";
	unittalk getcharid(3),strcharinfo(0)+" : �T���N�K���h�l�Ɍ����ė��܂���";
	next;
	mes "[���K���勳]";
	mes "����Șb�͕����Ă��Ȃ����B";
	unittalk '@r01,"���K���勳 : ����Șb�͕����Ă��Ȃ����B";
	next;
	mes "[���K���勳]";
	mes "��������A��B";
	mes "�b�͌�ŕ����B";
	unittalk '@r00,"���K���勳 : ��������A��B";
	next;
	mes "[���K���勳]";
	mes "�����͋��̂���҂���";
	mes "�����Ă͂����Ȃ��ꏊ���B";
	unittalk '@r01,"���K���勳 : �����͋��̂���҂�������Ȃ��B";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "���͓��ɖ����āc�c";
	mes "�ЂƂ�ŋA��鎩�M������܂���B";
	mes "����`�����܂�����";
	mes "���΂炭�����Ɂc�c�B";
	unittalk getcharid(3),strcharinfo(0)+" : ����`������̂ŁA���΂炭�����Ɂc�c�B";
	next;
	hideoffnpc getmdnpcname("�n�[�g�n���^�[#20msd00");
	hideoffnpc getmdnpcname("�n�[�g�n���^�[#20msd01");
	mes "[�n�[�g�n���^�[]";
	mes "���̑������H";
	unittalk '@hh00,"�n�[�g�n���^�[ : ���̑������H";
	next;
	mes "[���K���勳]";
	mes "�����Ƃ���ɗ����B";
	mes "���̎i�Ղ����ɖ������炵���B";
	mes "�ꏏ�ɖ߂��Ă���Ă���B";
	unittalk '@r00,"���K���勳 : �i�Ղ����ɖ������炵���B�ꏏ�ɖ߂��Ă���Ă���B";
	next;
	mes "[�n�[�g�n���^�[]";
	mes "�c�c�����Ȃ��ƃ_�����H";
	unittalk '@hh00,"�n�[�g�n���^�[ : �c�c�����Ȃ��ƃ_�����H";
	unittalk '@hh01,"�n�[�g�n���^�[ : �ʓ|�����c�c�B";
	next;
	mes "[���K���勳]";
	mes "�������B";
	mes "������Ă���B";
	unittalk '@r00,"���K���勳 : �������B������Ă���B";
	unittalk '@r01,"���K���勳 : ���ς�炸�ɔ��R�I���ȁc�c�B";
	unittalk '@r02,"���K���勳 : �t�炤���肩�H";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�l��!?";
	mes "����킵���l�Ԃ�";
	mes "�ǂ����Ă����ɂ����ł����H";
	mes "�܂����勳�l������";
	mes "���̐l�Ԃɋ�����Ă�̂ł���!?";
	unittalk getcharid(3),strcharinfo(0)+" : �l�Ԃ��ǂ����Ă����ɂ����ł����H";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "������Ă�̂Ȃ�";
	mes "�K����U���Ă��������I";
	mes "���������Ă��������܂��I";
	unittalk getcharid(3),strcharinfo(0)+" : �K����U���Ă��������B���������Ă��������܂��B";
	next;
	mes "[���K���勳]";
	mes "�Ȃɂ������Ă���񂾁A���O�́I";
	mes "������m��Ȃ�������";
	mes "�]�v�Ȃ��Ƃ������񂶂�Ȃ��I";
	unittalk '@r02,"���K���勳 : �]�v�Ȃ��Ƃ������񂶂�Ȃ��I";
	next;
	mes "[���K���勳]";
	mes "���̕����Ԃ��Ȃ�����������̂Ɂc�c";
	mes "�����A��B";
	mes "�܂������ŋ߂̎i�ՂƂ�����c�c�B";
	unittalk '@r01,"���K���勳 : �܂������ŋ߂̎i�ՂƂ�����c�c�B";
	next;
	mes "[�n�[�g�n���^�[]";
	mes "�����A�������ȁc�c";
	mes "�i�Ղ̂����ɒm��Ȃ������邵";
	mes "���ɖ����������āH";
	unittalk '@hh00,"�n�[�g�n���^�[ : �����A�������ȁc�c�B";
	next;
	mes "[�n�[�g�n���^�[]";
	mes "���̑O�A�������N�������l�Ԃ�";
	mes "�܂����K���ɉ����Ă���̂����ȁB";
	mes "�c�c������܂����H";
	unittalk '@hh01,"�n�[�g�n���^�[ : �c�c������܂����H";
	next;
	mes "[���K���勳]";
	mes "�����A���������ŕ����Ȃ��Ƃ������ȁI";
	mes "�T���N�K���h���ۏ؂����i�Ղ��B";
	mes "���ꂪ�{����������ǂ�����I";
	unittalk '@r01,"���K���勳 : �����A���������ŕ����Ȃ��Ƃ������ȁI";
	next;
	mes "[�n�[�g�n���^�[]";
	mes "�T���N�K���h��";
	mes "�����̏�ɂ��Ȃ��̂ɁH";
	mes "���������ɐM����񂾁H";
	unittalk '@hh01,"�n�[�g�n���^�[ : ���������ɐM����񂾁H";
	next;
	mes "[�n�[�g�n���^�[]";
	mes "�i�Ղ̈�l���炢�Еt���Ă�";
	mes "�N���C�ɂ��܂����B";
	mes "���X�K���h�l������������O��";
	mes "���Ⴟ����Ƃ�����Ⴂ�܂��傤�I";
	unittalk '@hh00,"�n�[�g�n���^�[ : �i�Ո�l���炢�Еt���Ă��A�N���C�ɂ��܂����B";
	next;
	mes "[�n�[�g�n���^�[]";
	mes "���߂炢������̂Ȃ�";
	mes "�������ł��܂���B";
	mes "�O�̂��߂Ɏ�p�t���Ă��";
	mes "���������K�[�f�B�A�����g�����B";
	unittalk '@hh01,"�n�[�g�n���^�[ : ���߂炢������Ȃ�A�������ł��܂��B";
	next;
	mes "[���K���勳]";
	mes "�c�c�Ȃ�A�����͔C����B";
	unittalk '@r00,"���K���勳 : �c�c�Ȃ�A�����͔C����B";
	unittalk '@r01,"���K���勳 : ������A��̂��ʓ|�Ȃ������낤�c�c�B";
	unittalk '@r02,"���K���勳 : �������ɂ͊֌W�Ȃ��B��ɍs�����B";
	hideonnpc getmdnpcname("#20msn00");
	hideonnpc getmdnpcname("���K���勳#20msd00");
	hideonnpc getmdnpcname("���K���勳#20msd01");
	hideonnpc getmdnpcname("���K���勳#20msd02");
	hideonnpc getmdnpcname("�n�[�g�n���^�[#20msd00");
	hideonnpc getmdnpcname("�n�[�g�n���^�[#20msd01");
	donpcevent getmdnpcname("Twsd_MobSpawn1")+ "::OnStart";
	stopnpctimer;
	startnpctimer getmdnpcname("���K����p�t#20msd00");
	close;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,311,93,3	script	���K���勳#20msd01	10475,{}
1@twsd.gat,309,96,5	script	���K���勳#20msd02	10473,{}
1@twsd.gat,307,95,5	script	J�K�[�f�B�A��#ms00	21972,{}
1@twsd.gat,308,94,5	script	J�K�[�f�B�A��#ms01	21973,{}
1@twsd.gat,306,93,5	script	J�K�[�f�B�A��#ms02	21972,{}
1@twsd.gat,317,98,3	script(HIDDEN)	�n�[�g�n���^�[#20msd00	21994,{}
1@twsd.gat,319,95,3	script(HIDDEN)	�n�[�g�n���^�[#20msd01	21994,{}

1@twsd.gat,319,100,3	script(HIDDEN)	���K����p�t#20msd00	21987,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : �p�[�e�B�[���[�_�[�ɔC���悤",1;
		end;
	}
	set '@c00,getnpcid(0,getmdnpcname("���K����p�t#20msd00"));
	set '@c01,getnpcid(0,getmdnpcname("���K����p�t#20msd01"));
	unittalk '@c00,"���K����p�t : ���̑������H";
	if(!sleep2(1500)) end;
	unittalk '@c01,"���K����p�t : �勳�ɌĂ΂�ė������A�����N���Ă���񂾁H";
	if(!sleep2(1500)) end;
	unittalk '@c00,"���K����p�t : �^�킵�����K�������ꂽ�悤�����c�c���O���H";
	if(!sleep2(1500)) end;
	unittalk '@c01,"���K����p�t : �l�Ԃ�������Ȃ��c�c�m�F����I";
	if(!sleep2(1500)) end;
	misceffect 425,"";
	if(!sleep2(500)) end;
	misceffect 432,"";
	if(!sleep2(500)) end;
	misceffect 441,"";
	sc_end EFST_MONSTER_TRANSFORM;
	if(!sleep2(1500)) end;
	unittalk '@c00,"���K����p�t : ��͂�l�Ԃ��I�@�ǂ�����Ă����܂ŗ���!!";
	if(!sleep2(1500)) end;
	unittalk '@c01,"���K����p�t : �߂܂���̂��悾�I";
	hideonnpc getmdnpcname("���K����p�t#20msd00");
	hideonnpc getmdnpcname("���K����p�t#20msd01");
	donpcevent getmdnpcname("Twsd_MobSpawn1")+ "::OnStart2";
	stopnpctimer;
	startnpctimer getmdnpcname("���K���勳#20msd10");
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}
1@twsd.gat,312,100,5	script(HIDDEN)	���K����p�t#20msd01	21987,{}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn1	-1,{
OnStart:
	monster getmdmapname("1@twsd.gat"),317,98,"�n�[�g�n���^�[#1",21994,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),319,95,"�n�[�g�n���^�[#2",21994,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn1")+"::OnKilled"))
		end;
	delmisceffect 453, getmdnpcname("J�K�[�f�B�A��#ms00");
	delmisceffect 453, getmdnpcname("J�K�[�f�B�A��#ms01");
	delmisceffect 453, getmdnpcname("J�K�[�f�B�A��#ms02");
	hideonnpc getmdnpcname("J�K�[�f�B�A��#ms00");
	hideonnpc getmdnpcname("J�K�[�f�B�A��#ms01");
	hideonnpc getmdnpcname("J�K�[�f�B�A��#ms02");
	monster getmdmapname("1@twsd.gat"),307,95,"J�K�[�f�B�A��-P#1",21991,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),308,94,"J�K�[�f�B�A��-Y#2",21992,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),306,93,"J�K�[�f�B�A��-P#3",21991,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn1")+"::OnKilled2"))
		end;
	sleep 500;
	hideoffnpc getmdnpcname("���K����p�t#20msd00");
	hideoffnpc getmdnpcname("���K����p�t#20msd01");
	unittalk getnpcid(0,getmdnpcname("���K����p�t#20msd00")),"���K����p�t : ���������ȁc�c�B";
	end;
OnStart2:
	monster getmdmapname("1@twsd.gat"),319,100,"���K����p�t#1",21993,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled3";
	monster getmdmapname("1@twsd.gat"),312,100,"���K����p�t#2",21993,1,getmdnpcname("Twsd_MobSpawn1")+"::OnKilled3";
	end;
OnKilled3:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn1")+"::OnKilled3"))
		end;
	hideoffnpc getmdnpcname("#20msn01");
	hideoffnpc getmdnpcname("#20w00");
	misceffect 247,getmdnpcname("#20w00");
	donpcevent getmdnpcname("Twsd_MobSpawn2")+ "::OnStart";
	announce "�H�H�H : ���X�c�c���͂����c�c", 0x9, 0x00ffcc;
	sleep 4000;
	announce "�]�k�����畷���o���̂��鐺�����������]", 0x9, 0x00ffcc;
	end;
}

1@twsd.gat,320,94,0	script(HIDDEN)	#20msn01	139,14,14,{
	unittalk getcharid(3),strcharinfo(0)+" : �k�����畷���o���̂��鐺�����������B",1;
	viewpoint 1, 294, 115, 1, 0xFF0000;
	end;
}

1@twsd.gat,294,115,0	script(HIDDEN)	#20w00	45,2,2,{
	warp getmdmapname("1@twsd.gat"),261,119;
	end;
}

1@twsd.gat,260,119,0	script	#20msd00	139,5,5,{
	unittalk getcharid(3),strcharinfo(0)+" : ���������ȁH",1;
	viewpoint 1, 257, 149, 1, 0xFF0000;
	viewpoint 1, 268, 145, 2, 0xFF0000;
	viewpoint 1, 258, 131, 3, 0xFF0000;
	viewpoint 1, 262, 146, 5, 0xFF0000;
	viewpoint 1, 220, 154, 6, 0xFF0000;
	end;
}

1@twsd.gat,1,1,0	script	Twsd_MobSpawn2	139,{
OnStart:
	monster getmdmapname("1@twsd.gat"),257,149,"���K����p�t#1",21993,1,getmdnpcname("Twsd_MobSpawn2")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),268,145,"���K����p�t#2",21993,1,getmdnpcname("Twsd_MobSpawn2")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),258,131,"���K����p�t#3",21993,1,getmdnpcname("Twsd_MobSpawn2")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn2")+"::OnKilled"))
		end;
	sleep 500;
	hideoffnpc getmdnpcname("#20msn02");
	hideoffnpc getmdnpcname("#20w10");
	misceffect 247,getmdnpcname("#20w10");
	announce "�H�H�H : �������c�c�����c�c", 0x9, 0x00ffcc;
	sleep 4000;
	announce "�]�����畷���o���̂��鐺�����������]", 0x9, 0x00ffcc;
	end;
}

1@twsd.gat,258,131,0	script(HIDDEN)	#20msn02	139,14,14,{
	unittalk getcharid(3),strcharinfo(0)+" : �����畷���o���̂��鐺�����������B",1;
	end;
}

1@twsd.gat,220,154,0	script(HIDDEN)	#20w10	45,2,2,{
	warp getmdmapname("1@twsd.gat"),196,208;
	end;
}

1@twsd.gat,196,209,0	script	#20msn03	139,5,5,{
	viewpoint 1, 163, 190, 1, 0xFF0000;
	end;
}

1@twsd.gat,163,190,10	script	���K���勳#20msd10	10474,10,5,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : �p�[�e�B�[���[�_�[�ɔC���悤",1;
		end;
	}
	set '@r10,getnpcid(0,getmdnpcname("���K���勳#20msd10"));
	set '@r11,getnpcid(0,getmdnpcname("���K���勳#20msd11"));
	set '@r12,getnpcid(0,getmdnpcname("���K���勳#20msd12"));
	mes "[���K���勳]";
	mes "�c�c�l�q�����������B";
	mes "���ׂ�悤�Ɍ�������p�t��";
	mes "�߂��Ă��Ȃ��悤�����B";
	unittalk '@r10,"���K���勳 : �c�c�l�q�����������B";
	next;
	mes "[���K����p�t]";
	mes "����ɘA��ċA�����̂ł́H";
	mes "�c�c�Ȃ��I�@�ɁA�l�Ԃ����I";
	unittalk getnpcid(0,getmdnpcname("���K����p�t#20msd10")),"���K���勳 : �c�c�Ȃ��I�@�ɁA�l�Ԃ����I";
	next;
	mes "[���K���勳]";
	mes "�ɁA�l�Ԃ��Ƃ�!?";
	mes "���������痈���Ƃ������Ƃ�";
	mes "��͂��قǂ̎i�Ղ�";
	mes "�l�Ԃ������Ă����񂾂ȁI";
	unittalk '@r00,"���K���勳 : ��͂�l�Ԃ������Ă����񂾂ȁI";
	unittalk '@r12,"���K���勳 : ��p�t�����ꂽ�̂��I";
	next;
	mes "[���K���勳]";
	mes "���̐�ɂ�";
	mes "^0000cd���X�K���h�l������������I^000000";
	mes "���₩�ɔr������I";
	unittalk '@r11,"���K���勳 : ���̐�ɂ̓��X�K���h�l������������I�@���₩�ɔr������I";
	next;
	menu "���̐�Ƀ��X�K���h������̂�",-;
	mes "[���K���勳]";
	mes "�c�c�H";
	mes "�m�炸�ɁA�����܂ŗ����c�c!?";
	unittalk getcharid(3),strcharinfo(0)+" : ���̐�Ƀ��X�K���h������̂��B";
	unittalk '@r12,"���K���勳 : �m�炸�ɁA�����܂ŗ����c�c!?";
	next;
	mes "[���K���勳]";
	mes "���������B";
	mes "�z�͂����ŉ�X���������Ă���̂�";
	mes "�m��Ȃ��悤���B";
	mes "�����ŁA�z���~�߂�Ηǂ��B";
	unittalk '@r00,"���K���勳 : ���������B�����ŁA�z���~�߂�Ηǂ��B";
	next;
	mes "[���K���勳]";
	mes "^0000cd���̊O���痈���l��^000000��";
	mes "�N���ʂ��Ȃƌ����Ă����̂Ɂc�c";
	mes "���̂܂܂ł͉�X�̖ʖڂ��c�c�B";
	unittalk '@r11,"���K���勳 : ���̊O���痈���l�Ԃ��N���ʂ��Ȃƌ����Ă����̂Ɂc�c";
	unittalk '@r12,"���K���勳 : ��X�̖ʎq���c�c";
	next;
	menu "�o�S�b�g���ꏏ���c�c",-;
	emotion 6,getmdnpcname("���K���勳#20msd10");
	mes "[���K���勳]";
	mes "�c�c�S���A������������ȁB";
	mes "^0000cd���X�K���h�l�̐_���Ȃ�V��^000000��";
	mes "�ז��͂�����I";
	unittalk getcharid(3),strcharinfo(0)+" : �o�S�b�g���ꏏ���c�c";
	unittalk '@r00,"���K���勳 : �S���A������������ȁB���X�K���h�l�̐_���Ȃ�V���̎ז��͂�����I";
	next;
	menu "�_���ȋV�����s���Ă���̂��c�c",-;
	emotion 6,getmdnpcname("���K���勳#20msd11");
	mes "[���K���勳]";
	mes "�c�c�c�c�����B";
	unittalk getcharid(3),strcharinfo(0)+" : �_���ȋV�����s���Ă���̂��c�c";
	unittalk '@r11,"���K���勳 : �c�c�c�c�����B";
	next;
	mes "[���K���勳]";
	mes "�����𐶂��ĕԂ��ȁI";
	unittalk '@r12,"���K���勳 : �����𐶂��ĕԂ��ȁI";
	unittalk '@r10,"���K���勳 : �i���ɂ��̌����ǂ��ł��I";
	next;
	mes "[���K����p�t]";
	mes "�����́A�����������I";
	mes "���O�����́A�K�[�f�B�A������z����";
	mes "�󋵂�񍐂���I";
	unittalk getnpcid(0,getmdnpcname("���K����p�t#20msd11")),"���K����p�t : �����́A�����������I";
	next;
	mes "[���K���勳]";
	mes "���A�������悤�I";
	unittalk '@r00,"���K���勳 : ���A�������悤�I";
	close2;
	stopnpctimer;
	donpcevent getmdnpcname("Twsd_MobSpawn3")+ "::OnStart";
	end;
OnTouch:
	misceffect 453,getmdnpcname("J�K�[�f�B�A��#ms10");
	misceffect 453,getmdnpcname("J�K�[�f�B�A��#ms11");
	unittalk "���K���勳 : �l�q���ς��ȁc�c�B";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,166,193,3	script	���K���勳#20msd11	10473,{}
1@twsd.gat,168,197,3	script	���K���勳#20msd12	10475,{}
1@twsd.gat,161,198,5	script	���K����p�t#20msd10	21987,{}
1@twsd.gat,166,200,5	script	���K����p�t#20msd11	21987,{}
1@twsd.gat,164,197,3	script	J�K�[�f�B�A��#ms10	21972,{}
1@twsd.gat,160,196,3	script	J�K�[�f�B�A��#ms11	21973,{}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn3	-1,{
OnStart:
	hideonnpc getmdnpcname("���K���勳#20msd12");
	unittalk getnpcid(0,getmdnpcname("���K���勳#20msd10")),"���K���勳 : ����������������ׂ����H";
	unittalk getnpcid(0,getmdnpcname("���K���勳#20msd11")),"���K���勳 : �ǂ��ɂ��Ȃ�Ȃ�������A�K�[�f�B�A������I";
	sleep 1000;
	hideonnpc getmdnpcname("���K����p�t#20msd10");
	hideonnpc getmdnpcname("���K����p�t#20msd11");
	monster getmdmapname("1@twsd.gat"),161,198,"���K����p�t#1",21993,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),166,200,"���K����p�t#2",21993,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn3")+"::OnKilled"))
		end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("���K���勳#20msd10")),"���K���勳 : �����I�@�ދp����I";
	unittalk getnpcid(0,getmdnpcname("���K���勳#20msd11")),"���K���勳 : �s���I�@�K�[�f�B�A���ǂ��I�I";
	sleep 1000;
	hideonnpc getmdnpcname("J�K�[�f�B�A��#ms10");
	hideonnpc getmdnpcname("J�K�[�f�B�A��#ms11");
	hideonnpc getmdnpcname("���K���勳#20msd10");
	hideonnpc getmdnpcname("���K���勳#20msd11");
	delmisceffect 453, getmdnpcname("J�K�[�f�B�A��#ms10");
	delmisceffect 453, getmdnpcname("J�K�[�f�B�A��#ms11");
	monster getmdmapname("1@twsd.gat"),164,197,"J�K�[�f�B�A��-P#1",21991,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),160,196,"J�K�[�f�B�A��-Y#2",21992,1,getmdnpcname("Twsd_MobSpawn3")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn3")+"::OnKilled2"))
		end;
	sleep 500;
	hideoffnpc getmdmapname("#20msn04");
	announce "�H�H�H : ��C�ɏI��点�c�c", 0x9, 0x00ffcc;
	hideoffnpc getmdmapname("���n�[��#20msd10");
	announce "���n�[�� : �`���җl�I�@�`���җl�`�B�ǂ��ɂ�������Ⴂ�܂����`�I", 0x9, 0x00ffcc;
	initnpctimer getmdmapname("���n�[��#20msd10");
	end;
}

1@twsd.gat,163,190,0	script(HIDDEN)	#20msn04	139,28,28,{
	viewpoint 1, 162, 245, 1, 0xFF0000;
	end;
}

1@twsd.gat,162,245,3	script(HIDDEN)	���n�[��#20msd10	10469,9,9,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : �p�[�e�B�[���[�_�[�ɔC���悤",1;
		end;
	}
	cutin "ep19_lehar01.png", 0;
	mes "[���n�[��]";
	mes "�`���җl�I";
	mes "�悩�����A����ƒǂ��t���܂����I";
	unittalk "���n�[�� : �悩�����A����ƒǂ��t���܂����I";
	next;
	menu "���n�[���H",-;
	cutin "ep19_lehar02.png", 0;
	mes "[���n�[��]";
	mes "���C�W�[���񂩂�`�߂ł��B";
	mes "�X�̏�ɖ߂��āA�W�߂�����";
	mes "�������悤�A�Ƃ̂��Ƃł��B";
	unittalk getcharid(3),strcharinfo(0)+" : ���n�[���l�H�ǂ�����āH",;
	unittalk "���n�[�� : �X�̏�ɖ߂��āA�W�߂����𐮗����܂��傤�B";
	next;
	cutin "ep19_lehar03.png", 0;
	mes "[���n�[��]";
	mes "���C�W�[����ƃ~���A�������";
	mes "��ɖ߂�܂����B";
	mes "�����`���җl�ɓ`���邽�߂�";
	mes "�����܂Œǂ������ė�����ł��B";
	unittalk "���n�[�� : ���C�W�[����ƃ~���A������͐�ɖ߂�܂����B";
	next;
	cutin "ep19_lehar03.png", 255;
	mes "["+strcharinfo(0)+"]";
	mes "�u���̏ꏊ�v�ɂ��Ă�";
	mes "�܂��킩���Ă��Ȃ��̂ł����c�c";
	mes "�ǂ���烉�X�K���h�ƃo�S�b�g��";
	mes "���̐�ɂ���悤�ł��B";
	unittalk getcharid(3),strcharinfo(0)+" : �ǂ���烉�X�K���h�ƃo�S�b�g���A���̐�ɂ���悤�ł��B";
	next;
	cutin "ep19_lehar01.png", 0;
	mes "[���n�[��]";
	mes "�فA�{���ł���!?";
	unittalk "���n�[�� : �فA�{���ł���!?";
	next;
	cutin "ep19_lehar03.png", 255;
	mes "["+strcharinfo(0)+"]";
	mes "���X�K���h���������̐��";
	mes "�������Ă���̂��m�F���܂��傤�B";
	mes "���A�����ň����Ԃ��Ă�";
	mes "���������̋@��𓦂��Ă��܂��܂��B";
	unittalk getcharid(3),strcharinfo(0)+" : ���X�K���h���������̐�ŉ������Ă���̂��m�F���܂��傤�B";
	next;
	cutin "ep19_lehar01.png", 0;
	mes "[���n�[��]";
	mes "�킩��܂����I";
	mes "�ڗ��ƃ}�Y�C�̂�";
	mes "������čs�����܂��傤�B";
	unittalk "���n�[�� : �킩��܂����I�@�ڗ��ƃ}�Y�C�̂ŕ�����čs�����܂��傤�B";
	close2;
	stopnpctimer;
	hideoffnpc getmdmapname("#20w11");
	hideonnpc getmdmapname("���n�[��#20msd10");
	donpcevent getmdnpcname("Twsd_MobSpawn4")+ "::OnStart";
	viewpoint 1, 164, 260, 1, 0xFF0000;
	cutin "ep19_lehar03.png", 255;
	end;
OnTouch:
	unittalk "���n�[�� : �`���җl�I�I";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,164,260,0	script(HIDDEN)	#20w11	45,2,2,{
	warp getmdmapname("1@twsd.gat"),154,299;
	end;
}

1@twsd.gat,154,300,0	script	#20msd10	139,5,5,{
	viewpoint 1, 148, 310, 1, 0xFF0000;
	viewpoint 1, 113, 326, 2, 0xFF0000;
	viewpoint 1, 85, 336, 3, 0xFF0000;
	viewpoint 1, 48, 326, 4, 0xFF0000;
	end;
}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn4	-1,{
OnStart:
	monster getmdmapname("1@twsd.gat"),148,310,"���K����p�t#1",21993,1,getmdnpcname("Twsd_MobSpawn4")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),113,326,"���K����p�t#2",21993,1,getmdnpcname("Twsd_MobSpawn4")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),85,336,"���K����p�t#3",21993,1,getmdnpcname("Twsd_MobSpawn4")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn4")+"::OnKilled"))
		end;
	sleep 500;
	hideoffnpc getmdnpcname("�T���N�K���h#20msd20");
	hideoffnpc getmdnpcname("�o�S�b�g#20msd20");
	hideoffnpc getmdnpcname("���X�K���h#20msd20");
	hideoffnpc getmdnpcname("���K���勳#20msd20");
	hideoffnpc getmdnpcname("���K���勳#20msd21");
	hideoffnpc getmdnpcname("���K���勳#20msd22");
	hideoffnpc getmdnpcname("�n�[�g�n���^�[#20msd20");
	hideoffnpc getmdnpcname("�n�[�g�n���^�[#20msd21");
	hideoffnpc getmdnpcname("�n�[�g�n���^�[#20msd22");
	hideoffnpc getmdnpcname("�n�[�g�n���^�[#20msd23");
	hideoffnpc getmdnpcname("�n�[�g�n���^�[#20msd24");
	initnpctimer getmdnpcname("�T���N�K���h#20msd20");
	announce "�]���̕����琺����������]", 0x9, 0x00ffcc;
	sleep 4000;
	announce "�H�H�H : ������x�A����Ă݂܂��傤�c�c", 0x9, 0x00ffcc;
	end;
}

1@twsd.gat,48,326,5	script(HIDDEN)	�T���N�K���h#20msd20	10473,5,5,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : �p�[�e�B�[���[�_�[�ɔC���悤",1;
		end;
	}
	set '@s20,getnpcid(0,getmdnpcname("�T���N�K���h#20msd20"));
	set '@b20,getnpcid(0,getmdnpcname("�o�S�b�g#20msd20"));
	set '@l20,getnpcid(0,getmdnpcname("���n�[��#20msd20"));
	set '@r20,getnpcid(0,getmdnpcname("���X�K���h#20msd20"));
	if(.scean == 0) {
		set '@s20,getnpcid(0,getmdnpcname("�T���N�K���h#20msd20"));
		set '@b20,getnpcid(0,getmdnpcname("�o�S�b�g#20msd20"));
		mes "[�T���N�K���h]";
		mes "�����A�O���痈���l�ԁB";
		mes "���ʂ������ł͂Ȃ����I";
		mes "��𔲂��Ă���̂ł͂Ȃ����낤�ȁH";
		unittalk '@s20,"�T���N�K���h : �����A�O���痈���l�ԁB��𔲂��Ă���̂ł͂Ȃ����낤�ȁH";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�c�c����̓��X�K���h�l�ɑ΂���";
		mes "�\���ƌ��Ȃ��܂����H";
		unittalk '@b20,"�o�S�b�g : ����̓��X�K���h�l�ɑ΂���\���ƌ��Ȃ��܂����H";
		next;
		cutin "ep18_bagot_01.png", 255;
		mes "[�T���N�K���h]";
		mes "���O�������@�����̂��낤�B";
		mes "���̏�ǂ����j��Ηǂ��ƁI";
		unittalk '@s20,"�T���N�K���h : ���O�������@�����̂��낤�B";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[�o�S�b�g]";
		mes "�䗗�̒ʂ�A���X�K���h�l��";
		mes "�撣���Ă���Ă���ł��傤���H";
		mes "���Ă��邾���̂�����";
		mes "�������͏o���c�c�B";
		unittalk '@b20,"�o�S�b�g : ���Ă��邾���̂����Ɍ������͏o���c�c�B";
		next;
		cutin "ep18_bagot_01.png", 255;
		menu "�������c�c���̏ꏊ�H",-;
		unittalk getcharid(3),strcharinfo(0)+" : �������c�c���̏ꏊ�H";
		mes "[�T���N�K���h]";
		mes "�l��!?�@�ǂ����Đl�Ԃ�������!!";
		mes "��������q�̓z�͂ǂ������I";
		mes "�S���������Ă�����I";
		unittalk '@s20,"�T���N�K���h : �l��!?�@�ǂ����Đl�Ԃ�������!!";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[�o�S�b�g]";
		mes "�o�S�b�g�������Ă����܂���B";
		mes "��q������S���|���āA�����܂ŗ����B";
		mes "�ł��傤�H";
		mes "���̖`���ҁA������������B";
		unittalk '@b20,"�o�S�b�g : �o�S�b�g�������Ă����܂���B��q������S���|���āA�����܂ŗ����B�ł��傤�H";
		unittalk '@s20,"�T���N�K���h : �����c�c�I";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�z��͂��Ă܂�����`�B";
		mes "���X�K���h�l���A���̖���J���Ă�����";
		mes "�����Ă܂�������˂��B";
		mes "�R�C�c���ނ�ׂɁc�c�I";
		unittalk '@b20,"�o�S�b�g : �z��͂��Ă܂�����`�B";
		next;
		menu "�i��͂�A�킴�ƊJ���Ă����̂��c�c�j",-;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "�����܂ŗ���Ƃ�";
		mes "�v���Ă܂���ł������ǁ`�B";
		mes "�͂��`�`�B";
		mes "��q�������܂ŕs�b��Ȃ��Ƃ́`�B";
		unittalk getcharid(3),strcharinfo(0)+" : �i��͂�A�킴�ƊJ���Ă����̂��c�c�j";
		unittalk '@b20,"�o�S�b�g : �����܂ŗ���Ƃ͎v���Ă܂���ł������ǁ`�B";
		next;
		menu "�������u���̏ꏊ�v���ȁH",-;
		cutin "ep18_bagot_01.png", 255;
		mes "[�T���N�K���h]";
		mes "���O�c�c�ǂ��ł����m����?!";
		unittalk getcharid(3),strcharinfo(0)+" : �������u���̏ꏊ�v���ȁH";
		unittalk '@s20,"�T���N�K���h : ���O�c�c�ǂ��ł����m����?!";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[�o�S�b�g]";
		mes "�o�S�b�g�����̘b��";
		mes "���ݕ���������ł��傤�H";
		mes "�o�S�b�g�͂��������Ƒ��Ȏ��";
		mes "�D�����Ⴀ��܂����B";
		unittalk '@b20,"�o�S�b�g : �o�S�b�g�����̘b�𓐂ݕ���������ł��傤�H";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[���X�K���h]";
		mes "���̎҂��c�c";
		mes "��̖`���҂��B";
		unittalk '@r20,"���X�K���h : ���̎҂��c�c��̖`���҂��B";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[���X�K���h]";
		mes "�c�c�����A^0000cd�u���̗́v^000000��";
		mes "�������Ȃ��ȁB";
		unittalk '@r20,"���X�K���h : �����A�u���̗́v�͊������Ȃ��ȁB";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "���̖`���҂ł͂���܂���B";
		mes "�o�S�b�g���������܂�������B";
		mes "�u���̗́v�̎������";
		mes "�������Ă��Ȃ��A�����̐l�Ԃ�";
		mes "�\��������܂��B";
		unittalk '@b20,"�o�S�b�g : ���̖`���҂ł͂���܂���B�o�S�b�g���������܂�������B";
		next;
		menu "���̗́H",-;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�S������E�o�������Ɏg�����ł���H";
		mes "����ŁA���̎����̐l�Ԃ͂ǂ��H";
		unittalk getcharid(3),strcharinfo(0)+" : ���̗́H";
		unittalk '@b20,"�o�S�b�g : ���̎����̐l�Ԃ͂ǂ��H";
		next;
		cutin "ep18_bagot_03.png", 2;
		mes "[�o�S�b�g]";
		mes "�c�c�܂��A�����B";
		mes "���̖`���҂����͂ȗ͂������Ă܂��B";
		mes "�߂炦��΂����Ɩ��ɗ��ł���B";
		mes "�ق�A�n�[�g�n���^�[�̏o�Ԃł���B";
		unittalk '@b20,"�o�S�b�g : �߂炦��΂����Ɩ��ɗ��ł���B�ق�A�n�[�g�n���^�[�̏o�Ԃł���B";
		close2;
		cutin "ep18_bagot_01.png", 255;
		donpcevent getmdnpcname("Twsd_MobSpawn5")+ "::OnStart";
		end;
	}
	if(.scean == 1) {
		mes "[�T���N�K���h]";
		mes "�����c�c�����I";
		mes "�����Ȃ�΁A�����c�c�I";
		unittalk '@s20,"�T���N�K���h : �����c�c�����I";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[���X�K���h]";
		mes "����o���ȁB";
		mes "���̋����A�債�����̂��B";
		mes "�������c�c�������߂Ă���͂ł͂Ȃ��B";
		unittalk '@r20,"���X�K���h : �������c�c�������߂Ă���͂ł͂Ȃ��B";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�����A�����ł��傤�Ƃ��c�c";
		mes "���Ƃ��Ă��A�ꏏ�ɂ���";
		mes "�����̐l�Ԃ������āc�c�B";
		unittalk '@b20,"�o�S�b�g : ���Ƃ��Ă��A�ꏏ�ɂ��������̐l�Ԃ������āc�c�B";
		next;
		hideoffnpc getmdnpcname("���n�[��#20msd20");
		cutin "ep19_lehar05.png", 2;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�`���җl�I";
		mes "������I�@���A���̉Ȋw�҂́I";
		mes "����ɁA�T���N�K���h���I";
		mes "���A���̌��ɂ���̂́c�c�H";
		unittalk '@l20,"���n�[�� : ���A���̌��ɂ���̂́c�c�H";
		next;
		menu "���X�K���h�ł�",-;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "��������Ċ�����킹��̂�";
		mes "���߂Ăł��ˁc�c�͂͂��I";
		mes "�̘b�ɏo�Ă��鑶�݂ɉ��Ƃ́B";
		unittalk getcharid(3),strcharinfo(0)+" : ���X�K���h�ł��B";
		unittalk '@l20,"���n�[�� : �͂͂��I�@�̘b�ɏo�Ă��鑶�݂ɉ��Ƃ́B";
		unittalk '@s20,"�T���N�K���h : ���̖���Ȍ�������I";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[�o�S�b�g]";
		mes "�������������Ă���Ȃ�āI";
		mes "�������ł����A���X�K���h�l�H";
		mes "���̗͂́c�c�B";
		unittalk '@b20,"�o�S�b�g : �������ł����A���X�K���h�l�H�@���̗͂́c�c�B";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[���X�K���h]";
		mes "�c�c�Ⴄ�ȁB";
		mes "^0000cd���̗�^000000�������Ȃ��B";
		unittalk '@r20,"���X�K���h : �c�c�Ⴄ�ȁB���̗͂������Ȃ��B";
		next;
		cutin "ep20_lasgand04.png", 0;
		mes "[���X�K���h]";
		mes "�����A^0000cd����e���񂾗�^000000��������B";
		mes "�Â��c�c���������O�́c�c�B";
		unittalk '@r20,"���X�K���h : �����A����e���񂾗͂�������B�Â��c�c���������O�́c�c�B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�c�c���̂��Ƃ������Ă��ł��H";
		mes "���̗́H";
		unittalk '@l20,"���n�[�� : �c�c���̂��Ƃ������Ă��ł��H";
		next;
		cutin "ep18_bagot_03.png", 1;
		mes "[�o�S�b�g]";
		mes "�{���ɒm��Ȃ��H";
		mes "���������H";
		mes "���̗͂͊ԈႢ�Ȃ�";
		mes "���̓�l�̍��Ղ��猟�o���ꂽ�̂ɁH";
		unittalk '@b20,"�o�S�b�g : ���̗͂͊ԈႢ�Ȃ��A���̓�l�̍��Ղ��猟�o���ꂽ�̂ɁH";
		next;
		cutin "ep18_bagot_02.png", 1;
		mes "[�o�S�b�g]";
		mes "�ʂ̉����H";
		mes "���������ă����P�A���H";
		mes "�����̑��u�Łc�c�H";
		unittalk '@b20,"�o�S�b�g : ���������ă����P�A���H�@�����̑��u�Łc�c�H";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�����P�A�����";
		mes "�����C�X�K���h�ɂ͂��܂����B";
		mes "�ޏ��͂�����ׂ��ꏊ��";
		mes "�ڑ�����܂�������ˁB";
		unittalk '@l20,"���n�[�� : �����P�A����́A�����C�X�K���h�ɂ͂��܂����B";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[�o�S�b�g]";
		mes "���ɋ��͎҂�������Ă��ƁH";
		mes "�f���Ɍ����Ȃ����B";
		mes "���̃o�S�b�g�����̋��͎҂�";
		mes "��肭���p���Ă����܂�����B";
		unittalk '@b20,"�o�S�b�g : ���ɋ��͎҂�������Ă��ƁH";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���������炸����";
		mes "��̂킩��Ȃ����Ƃ��c�c�B";
		unittalk '@l20,"���n�[�� : ���������炸���Ɩ�̂킩��Ȃ����Ƃ��c�c�B";
		next;
		menu "�����c�c",-;
		cutin "ep18_bagot_03.png", 1;
		mes "[�o�S�b�g]";
		mes "�c�c�����ł����B";
		mes "���������ł��B";
		mes "�߂܂�����ł�������";
		mes "����ׂ��Ă��炢�܂�����B";
		unittalk getcharid(3),strcharinfo(0)+" : �����c";
		unittalk '@b20,"�o�S�b�g : �߂܂�����ł������ƁA����ׂ��Ă��炢�܂�����B";
		next;
		cutin "ep18_bagot_03.png", 255;
		mes "[�T���N�K���h]";
		mes "��p�t������I";
		mes "���̐l�Ԃ�����ߔ�����I";
		unittalk '@s20,"�T���N�K���h : ��p�t������I";
		hideoffnpc getmdnpcname("���K����p�t#20msd20");
		hideoffnpc getmdnpcname("���K����p�t#20msd21");
		hideoffnpc getmdnpcname("���K����p�t#20msd22");
		unittalk '@s20,"�T���N�K���h : ���̐l�Ԃ�����ߔ�����I";
		stopnpctimer;
		close2;
		cutin "ep18_bagot_01.png", 255;
		initnpctimer getmdnpcname("�o�S�b�g#20msd20");
		donpcevent getmdnpcname("Twsd_MobSpawn5")+ "::OnStart2";
		end;
	}
	if(.scean == 2) {
		mes "[�T���N�K���h]";
		mes "�l�ԂȂǂƋ��͂����̂͊ԈႢ�������I";
		mes "���������Ƌ������΂��Ă����";
		mes "����Ȃ��Ƃɂ́I";
		close;
	}
	end;
OnTouch:
	if(.scean == 0)
		unittalk "�T���N�K���h : �������ȗ\�����c�c�B";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,43,326,5	script(HIDDEN)	���X�K���h#20msd20	10536,{
	unittalk "���X�K���h : �c�c�c�B";
	end;
}

1@twsd.gat,46,328,5	script(HIDDEN)	�o�S�b�g#20msd20	10386,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : �p�[�e�B�[���[�_�[�ɔC���悤",1;
		end;
	}
	if(.scean == 2) {
		set '@s20,getnpcid(0,getmdnpcname("�T���N�K���h#20msd20"));
		set '@b20,getnpcid(0,getmdnpcname("�o�S�b�g#20msd20"));
		set '@l20,getnpcid(0,getmdnpcname("���n�[��#20msd20"));
		cutin "ep18_bagot_03.png", 1;
		mes "[�o�S�b�g]";
		mes "�͂��`�`�`�B";
		mes "�܂��܂������Ȃ��Ă�B";
		mes "�o�S�b�g�͋������N���Ă��܂�����B";
		unittalk '@b20,"�o�S�b�g : �܂��܂������Ȃ��Ă�B�o�S�b�g�͋������N���Ă��܂�����B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���S���Ă����̂͗ǂ�����";
		mes "�������C���������ł��ˁc�c�B";
		unittalk '@l20,"���n�[�� : �������C���������ł��ˁc�c�B";
		next;
		menu "�c�c���āA�ǂ����܂��H",-;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���̂܂܁A���B�����Ő키���c�c";
		mes "����Ƃ���������ނ��܂����H";
		mes "�u���̏ꏊ�v�𒲂ׂ�ƌ����ړI��";
		mes "�B�������͂��ł�����B";
		unittalk getcharid(3),strcharinfo(0)+" : �c�c���āA�ǂ����܂��H";
		unittalk '@l20,"���n�[�� : ���̂܂܁A���B�����Ő키���c�c����Ƃ���������ނ��܂����H";
		next;
		cutin "ep18_bagot_02.png", 1;
		mes "[�o�S�b�g]";
		mes "�c�c���̏ꏊ��m��ꂽ�̂�";
		mes "������Ɩʓ|�ł��˂��B";
		mes "����������ꂽ�肵����";
		mes "�v��Ɏx�Ⴊ�ł܂���B";
		unittalk '@b20,"�o�S�b�g : �c�c���̏ꏊ��m��ꂽ�̂́A������Ɩʓ|�ł��˂��B";
		next;
		cutin "ep18_bagot_03.png", 1;
		mes "[�o�S�b�g]";
		mes "�c�c���X�K���h�l�H";
		mes "���͂��g���Ă��������܂��񂩁H";
		unittalk '@b20,"�o�S�b�g : �c�c���X�K���h�l�H�@���͂��g���Ă��������܂��񂩁H";
		next;
		cutin "ep20_lasgand01.png", 255;
		mes "[�T���N�K���h]";
		mes "���X�K���h�l�A��A�����I";
		mes "���̂��͂��g����܂ł��ȁc�c�I";
		unittalk '@s20,"�T���N�K���h : ���̂��͂��g����܂ł��ȁc�c�I";
		next;
		cutin "ep20_lasgand01.png", 0;
		mes "[���X�K���h]";
		mes "�c�c�悩�낤�B";
		mes "���̐g�̒��m�炸����";
		mes "���̗͂������Ă�낤�B";
		unittalk getnpcid(0,getmdnpcname("���X�K���h#20msd20")),"���X�K���h : �c�c�悩�낤�B";
		next;
		misceffect 805,getmdnpcname("���X�K���h#20msd20");
		misceffect 827,"";
		misceffect 827,getmdnpcname("���n�[��#20msd20");
		cutin "ep19_lehar03.png", 2;
		cutin "ep18_bagot_01.png", 1;
		mes "[�o�S�b�g]";
		mes "���߂đ������͂��Ă����Ԃ�";
		mes "���肢���܂���`�B";
		mes "�����Y�ɂ��Ă��܂��Ă�";
		mes "�����ޗ��ɂł��Ȃ��Ȃ�̂Ł`�B";
		unittalk '@b20,"�o�S�b�g : ���߂đ������͂��Ă����Ԃł��肢���܂���`�B";
		next;
		misceffect 389,getmdnpcname("���X�K���h#20msd20");
		misceffect 424,getmdnpcname("���X�K���h#20msd20");
		misceffect 926,"";
		misceffect 926,getmdnpcname("���n�[��#20msd20");
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "����c�c";
		mes "���̗́c�c��΂��c�c�H";
		mes "��A�������c�c���̂܂܂���";
		mes "���o���񂶂�c�c!?!?";
		unittalk '@l20,"���n�[�� : ���̗́c�c��΂��c�c�H";
		next;
		cutin "ep19_lehar03.png", 255;
		mes "[�T���N�K���h]";
		mes "�����c�c�������I";
		mes "�������̓��X�K���h�l�c�c�I";
		mes "����ȉ���킵���l�Ԃ����Ɏg���ɂ�";
		mes "���̂��͂͗]��ɂ������c�c�B";
		unittalk '@s20,"�T���N�K���h : �����c�c�������I�@�������̓��X�K���h�l�c�c�I";
		next;
		hideoffnpc getmdnpcname("�����L#20ms20");
		cutin "ep20_nyar02.png", 1;
		mes "[�����L]";
		mes "���F���F�[";
		unittalk getnpcid(0,getmdnpcname("�����L#20ms20")),"�����L : ���F���F�[";
		next;
		mes "[�T���N�K���h]";
		mes "�ȁA�����H�@�����!?";
		unittalk '@s20,"�T���N�K���h : �ȁA�����H�@�����!?";
		next;
		cutin "ep18_bagot_02.png", 0;
		mes "[�o�S�b�g]";
		mes "�c�c�L���`�H";
		unittalk '@b20,"�o�S�b�g : �c�c�L���`�H";
		unittalk '@l20,"���n�[�� : ���̔L�́I";
		emotion 0,getmdnpcname("���X�K���h#20msd20");
		next;
		cutin "ep20_lasgand02.png", 0;
		mes "[���X�K���h]";
		mes "�c�c���ꂾ�B";
		mes "�����߂炦��B";
		unittalk getnpcid(0,getmdnpcname("���X�K���h#20msd20")),"���X�K���h : �c�c���ꂾ�B�����߂炦��B";
		unittalk '@s20,"�T���N�K���h : �͂����I�I";
		unittalk getnpcid(0,getmdnpcname("���K���勳#20msd20")),"���K���勳 : �͂��I�I";
		unittalk getnpcid(0,getmdnpcname("���K���勳#20msd21")),"���K���勳 : �͂����I�I";
		unittalk getnpcid(0,getmdnpcname("���K���勳#20msd22")),"���K���勳 : �͂����I�I";
		next;
		misceffect 485,getmdnpcname("���X�K���h#20msd20");
		misceffect 454,getmdnpcname("���X�K���h#20msd20");
		misceffect 514,getmdnpcname("���X�K���h#20msd20");
		misceffect 729,"";
		misceffect 729,getmdnpcname("���n�[��#20msd20");
		cutin "ep20_lasgand02.png", 255;
		mes "[�T���N�K���h]";
		mes "�S���A��������͂߁I";
		mes "�����߂炦��̂�!!";
		unittalk '@s20,"�T���N�K���h : �S���A��������͂߁I�@�����߂炦��̂�!!";
		next;
		misceffect 581,getmdnpcname("�����L#20ms20");
		misceffect 342,getmdnpcname("�����L#20ms20");
		misceffect 348,getmdnpcname("�����L#20ms20");
		cutin "ep20_nyar03.png", 1;
		mes "[�����L]";
		mes "�j���A�A�@�@�b�I�I";
		unittalk getnpcid(0,getmdnpcname("�����L#20ms20")),"�����L : �j���A�A�@�@�b�I�I";
		next;
		delmisceffect 926, getmdnpcname("���n�[��#20msd20");
		delmisceffect 827, getmdnpcname("���n�[��#20msd20");
		delmisceffect 729, getmdnpcname("���n�[��#20msd20");
		cutin "ep18_bagot_01.png", 0;
		mes "[�o�S�b�g]";
		mes "���c�c�H�@����͂��������c�c???";
		unittalk '@b20,"�o�S�b�g : ���c�c�H�@����͂��������c�c???";
		misceffect 562,getmdnpcname("�T���N�K���h#20msd20");
		misceffect 562,getmdnpcname("�o�S�b�g#20msd20");
		misceffect 562,getmdnpcname("���X�K���h#20msd20");
		misceffect 562,getmdnpcname("���K���勳#20msd20");
		misceffect 562,getmdnpcname("���K���勳#20msd21");
		misceffect 562,getmdnpcname("���K���勳#20msd22");
		next;
		mes "[�o�S�b�g]";
		mes "������Ɓ`�`���I�@���́c�c!?";
		unittalk '@b20,"�o�S�b�g : ������Ɓ`�`���I�@���́c�c!?";
		close2;
		cutin "ep19_lehar03.png", 255;
		delmisceffect 562, getmdnpcname("�T���N�K���h#20msd20");
		delmisceffect 562, getmdnpcname("�o�S�b�g#20msd20");
		delmisceffect 562, getmdnpcname("���X�K���h#20msd20");
		delmisceffect 562, getmdnpcname("���K���勳#20msd20");
		delmisceffect 562, getmdnpcname("���K���勳#20msd21");
		delmisceffect 562, getmdnpcname("���K���勳#20msd22");
		hideonnpc getmdnpcname("�T���N�K���h#20msd20");
		hideonnpc getmdnpcname("�o�S�b�g#20msd20");
		hideonnpc getmdnpcname("���X�K���h#20msd20");
		hideonnpc getmdnpcname("���K���勳#20msd20");
		hideonnpc getmdnpcname("���K���勳#20msd21");
		hideonnpc getmdnpcname("���K���勳#20msd22");
		stopnpctimer;
		initnpctimer getmdnpcname("���n�[��#20msd20");
		set .scean,3;
		end;
	}
	cutin "ep18_bagot_01.png", 2;
	mes "[�o�S�b�g]";
	mes "�ǂ�����āA�����܂ŗ��܂������H";
	close2;
	cutin "ep19_lehar03.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,58,327,3	script(HIDDEN)	���n�[��#20msd20	10469,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		unittalk getcharid(3),strcharinfo(0)+" : �p�[�e�B�[���[�_�[�ɔC���悤",1;
		end;
	}
	if(.scean == 2) {
		cutin "ep19_lehar01.png", 1;
		mes "[���n�[��]";
		mes "�������͕����܂���I";
		mes "�����ł��傤�B";
		close2;
		cutin "ep19_lehar05.png", 255;
		end;
	}
	if(.scean == 3) {
		set '@n20,getnpcid(0,getmdnpcname("�����L#20ms20"));
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���X�K���h�����������āc�c�H";
		mes "���B�A���������̂ł��傤���H";
		mes "���c�c�j�����R�H";
		unittalk "���n�[�� : ���X�K���h�����������āc�c�H�@���B�A���������̂ł��傤���H";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[�����L]";
		mes "�c�c";
		unittalk '@n20,"�����L : �c�c";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�c�c�L�l�H";
		unittalk "���n�[�� : �c�c�L�l�H";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[�����L]";
		mes "�j���A�A�[";
		unittalk '@n20,"�����L : �j���A�A�[";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�L�l!!";
		mes "�܂������Ă��ꂽ��ł��ˁI";
		unittalk "���n�[�� : �L�l!!�@�܂������Ă��ꂽ��ł��ˁI";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[�����L]";
		mes "�j���J�A�J�A�J�b�[";
		unittalk '@n20,"�����L : �j���J�A�J�A�J�b�[";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "����ς�I";
		mes "���肪�Ƃ��������܂��I";
		unittalk "���n�[�� : ����ς�I�@���肪�Ƃ��������܂��I";
		next;
		emotion 1,"";
		menu "�����Ă邱�Ƃ��킩��́H",-;
		cutin "ep19_lehar06.png", 2;
		mes "[���n�[��]";
		mes "�������I";
		mes "�P�ɂ���ȋC�����������ł��I";
		unittalk getcharid(3),strcharinfo(0)+" : �����Ă邱�Ƃ��킩��́H",1;
		unittalk "���n�[�� : �P�ɂ���ȋC�����������ł��I";
		next;
		emotion 4,"";
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�Ƃ���Łc�c";
		mes "���̎҂����͂ǂ��֔�΂��܂������H";
		unittalk "���n�[�� : ���̎҂����͂ǂ��֔�΂��܂������H";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[�����L]";
		mes "���F�G�J�G�J�b�`";
		unittalk '@n20,"�����L : ���F�G�J�G�J�b�`";
		next;
		menu "�Ȃ�ƌ����Ă܂��H",-;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�����܂���B";
		mes "����ς艽�������Ă邩";
		mes "�킩��܂���c�c�B";
		unittalk getcharid(3),strcharinfo(0)+" : �Ȃ�ƌ����Ă܂��H";
		unittalk "���n�[�� : ����ς艽�������Ă邩�킩��܂���c�c�B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�L�l�A�������ƈꏏ��";
		mes "���Ă��炦�܂��񂩁H";
		mes "���ЂƂ��A������������̂ł����B";
		unittalk "���n�[�� : �L�l�A�������ƈꏏ�ɗ��Ă��炦�܂��񂩁H";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[�����L]";
		mes "�j���J�A�J�A�J�b�I�I";
		unittalk '@n20,"�����L : �j���J�A�J�A�J�b�I�I";
		next;
		misceffect 562;
		emotion 0;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���`�`��c�c�_�����ۂ��ł��ˁB";
		mes "���A����H";
		unittalk "���n�[�� : ���`�`��c�c�_�����ۂ��ł��ˁB";
		next;
		delmisceffect 562;
		cutin "ep20_nyar05.png", 1;
		mes "[�����L]";
		mes "�j���A�A�A�[�[�[";
		unittalk '@n20,"�����L : �j���A�A�A�[�[�[";
		next;
		menu "���n�[���I",-;
		cutin "ep20_nyar04.png", 1;
		mes "[�����L]";
		mes "�I�J�I�J�b�[";
		unittalk '@n20,"�����L : �I�J�I�J�b�[";
		next;
		cutin "ep20_nyar01.png", 255;
		mes "�]�����L�́A������̗l�q��";
		mes "�@���΂炭���߂���";
		mes "�@�������ƕ����������B";
		mes "�@�t���ė����ƌ����Ă���悤���]";
		unittalk getcharid(3),strcharinfo(0)+" : �]�����L�́A�t���ė����ƌ����Ă���悤���]";
		setnpcspeed 200,getmdnpcname("�����L#20ms20");
		npcwalkto 57,317,getmdnpcname("�����L#20ms20");
		close2;
		misceffect 247,getmdnpcname("#20w21");
		hideoffnpc getmdnpcname("#20w21");
		set .scean,4;
		end;
	}
	if(.scean == 4) {
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�킟�A������ĉ��Ȃ�ł��傤�H";
		close2;
		cutin "ep19_lehar05.png", 255;
		end;
	}
	cutin "ep19_lehar01.png", 1;
	mes "[���n�[��]";
	mes "�����ł��܂����ˁB";
	mes "���āA�����ɋA���ł��傤���c�c�B";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twsd.gat,49,330,5	script(HIDDEN)	�n�[�g�n���^�[#20msd20	21994,{}
1@twsd.gat,55,333,5	script(HIDDEN)	�n�[�g�n���^�[#20msd21	21994,{}
1@twsd.gat,62,334,5	script(HIDDEN)	�n�[�g�n���^�[#20msd22	21994,{}
1@twsd.gat,45,322,3	script(HIDDEN)	�n�[�g�n���^�[#20msd23	21994,{}
1@twsd.gat,54,321,5	script(HIDDEN)	�n�[�g�n���^�[#20msd24	21994,{}
1@twsd.gat,51,327,5	script(HIDDEN)	���K����p�t#20msd20	21993,{}
1@twsd.gat,56,332,3	script(HIDDEN)	���K����p�t#20msd21	21987,{}
1@twsd.gat,61,324,1	script(HIDDEN)	���K����p�t#20msd22	21987,{}
1@twsd.gat,50,323,1	script(HIDDEN)	���K���勳#20msd20	10473,{}
1@twsd.gat,53,330,3	script(HIDDEN)	���K���勳#20msd21	10474,{}
1@twsd.gat,57,323,1	script(HIDDEN)	���K���勳#20msd22	10475,{}

1@twsd.gat,53,327,3	script2(HIDDEN)	�����L#20ms20	10537,{
	unittalk "�����L : �E�J�F�G�J�G�J�b�`";
	end;
}

1@twsd.gat,56,315,0	script(HIDDEN)	#20w21	45,2,2,{
	if(EP20_1QUE == 46) {
		chgquest 17707,17708;
		set EP20_1QUE,47;
	}
	warp "jor_back1.gat",363,222;
	end;
}

1@twsd.gat,0,0,0	script	Twsd_MobSpawn5	-1,{
OnStart:
	hideonnpc getmdnpcname("�n�[�g�n���^�[#20msd20");
	hideonnpc getmdnpcname("�n�[�g�n���^�[#20msd21");
	hideonnpc getmdnpcname("�n�[�g�n���^�[#20msd22");
	hideonnpc getmdnpcname("�n�[�g�n���^�[#20msd23");
	hideonnpc getmdnpcname("�n�[�g�n���^�[#20msd24");
	monster getmdmapname("1@twsd.gat"),49,330,"�n�[�g�n���^�[#1",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),55,333,"�n�[�g�n���^�[#2",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),62,334,"�n�[�g�n���^�[#3",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),45,322,"�n�[�g�n���^�[#4",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	monster getmdmapname("1@twsd.gat"),54,321,"�n�[�g�n���^�[#5",21994,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn5")+"::OnKilled"))
		end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("�T���N�K���h#20msd20")),"�T���N�K���h : ������̎���؂�邱�ƂɂȂ�Ƃ́I";
	set .scean,1;
	end;
OnStart2:
	hideonnpc getmdnpcname("���K����p�t#20msd20");
	hideonnpc getmdnpcname("���K����p�t#20msd21");
	hideonnpc getmdnpcname("���K����p�t#20msd22");
	monster getmdmapname("1@twsd.gat"),51,327,"���K����p�t#1",21993,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),56,332,"���K����p�t#2",21993,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2";
	monster getmdmapname("1@twsd.gat"),61,324,"���K����p�t#3",21993,1,getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twsd.gat"),getmdnpcname("Twsd_MobSpawn5")+"::OnKilled2"))
		end;
	sleep 500;
	unittalk getnpcid(0,getmdnpcname("�o�S�b�g#20msd20")),"�o�S�b�g : �ق��c�c�B";
	set .scean,2;
	end;
}





/*
21972,J�K�[�f�B�A��-P���z�[���[�A�^�b�N,chase,189,1,2000,0,0,no,target,always,0,,,,,,
21994,�n�[�g�n���^�[#1���o�b�V��,attack,5,1,2000,0,2334021,no,target,always,0,,,,,,
21994,�n�[�g�n���^�[#1���R���{�A�^�b�N,attack,171,4,2000,0,132,no,target,always,0,,,,,,
21994,�n�[�g�n���^�[#1�������^���u���C�J�[,attack,159,0,2000,0,1882,no,target,always,0,,,,,,
21994,�n�[�g�n���^�[#3���\�E���u���C�J�[,chase,379,0,2000,500,0,no,target,always,0,,,,,,
21994,�n�[�g�n���^�[#1���N���e�B�J���X���b�V��,attack,170,1,2000,0,0,no,target,always,0,,,,,,
21991,J�K�[�f�B�A��-P#3���z�[���[�A�^�b�N,chase,189,1,2000,0,0,no,target,always,0,,,,,,
21992,J�K�[�f�B�A��-Y#2���|�C�Y���A�^�b�N,chase,188,1,2000,0,10365,no,target,always,0,,,,,,
21992,J�K�[�f�B�A��-Y#2���v���{�b�N,chase,6,5,2000,0,0,no,target,always,0,,,,,,
21993,���K����p�t#2���|�C�Y���A�^�b�N,attack,188,1,2000,0,2497482,no,target,always,0,,,,,,
21993,���K����p�t#2���u���b�h�h���C��,attack,199,1,2000,0,87,no,target,always,0,,,,,,
21993,���K����p�t#1���R�[���h�{���g,chase,14,0,2000,500,1180,no,target,always,0,,,,,,
21993,���K����p�t#2���_�[�N�T���_�[,attack,341,6,2000,700,34,no,target,always,0,,,,,,
21993,���K����p�t#1���T�C�g���b�V���[,chase,81,10,2000,0,5,no,target,always,0,,,,,,
21993,���K����p�t#1���t�@�C�A�[�{���g,chase,19,0,2000,500,2529,no,target,always,0,,,,,,
21993,���K����p�t#2���T���_�[�X�g�[��,attack,21,0,2000,700,29,no,target,always,0,,,,,,
21993,���K����p�t#3�����C�g�j���O�{���g,chase,20,0,2000,500,569,no,target,always,0,,,,,,
21993,���K����p�t#1���X�v���b�V���A�^�b�N,attack,174,1,2000,0,7,no,target,always,0,,,,,,
21993,���K����p�t#2���J�[�X�A�^�b�N,attack,181,0,2000,500,0,no,target,always,0,,,,,,
*/