//==============================================================================
// Where the Small Branches Memorial Dungeon Script
//==============================================================================
1@twig.gat,0,0,0	script	Twig_Control	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@map$,getmdmapname("1@twsd.gat");
	monster '@map$,219,152,"�i���s��#219_152",3982,1;
	monster '@map$,221,152,"�i���s��#221_152",3982,1;
	areasetcell '@map$,218,151,222,153,1;
	initnpctimer getmdnpcname("���n�[��#ep20twig_1");
	end;
}

1@twig.gat,220,150,3	script	����Ǘ�#twig	10046,{
	if(distance(getcharid(3)) > 5) {
		unittalk getcharid(3),strcharinfo(0)+" : ��������͐G��Ȃ��B",1;
		end;
	}
	set '@accept,2;
	mes "^FF0000[�C���t�H���[�V����]^000000";
	mes "^FF0000���̐�ւ�^000000";
	mes "^FF0000�������A���_���W������^000000";
	mes "^FF0000��������𖞂�����^000000";
	mes "^FF0000�قȂ�Q�[���A�J�E���g��^000000";
	mes "^FF0000�L�����N�^�[��"+'@accept+"�l�܂ŁA^000000";
	mes "^FF0000�ꏏ�ɐi�ނ��Ƃ��ł��܂��B^000000";
	next;
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
	warp getmdmapname("1@twig.gat"), 220, 157;
	end;
}

1@twig.gat,207,178,5	script2(HIDDEN)	���n�[��#ep20twig_move	21519,{
	end;
OnStart:
	setarray '@walkpos,197,188,187,198,177,208,167,211,157,216,147,216,137,217,124,215,114,213,104,210,94,204,84,194,74,184;
	for('@i=0;'@i<getarraysize('@walkpos); set '@i,'@i+2) {
		if('@i == 5)
			unittalk "���n�[�� : �����A�s�v�c�Ȓn�`�ł��ˁI";
		npcwalkto '@walkpos['@i],'@walkpos['@i+1];
		npcwalkwait;
	}
	initnpctimer getmdnpcname("���n�[��#ep20twig_2");
	hideonnpc getmdnpcname("���n�[��#ep20twig_move");
	hideoffnpc getmdnpcname("���n�[��#ep20twig_2");
	unittalk "���n�[�� : ����A�����������ǂ��ł��܂��ˁH";
	set .scean,1;
	end;
OnStart2:
	setarray '@walkpos,64,174,57,164,56,154,56,144,56,134,60,124,61,114,68,104,78,94,88,84,98,74,108,67,118,65,128,65;
	for('@i=0;'@i<getarraysize('@walkpos); set '@i,'@i+2) {
		if('@i == 7)
			unittalk "���n�[�� : �Ȃ��c�c����Ȃɒ����̂��H";
		npcwalkto '@walkpos['@i],'@walkpos['@i+1];
		npcwalkwait;
	}
	initnpctimer getmdnpcname("���n�[��#ep20twig_3");
	hideonnpc getmdnpcname("���n�[��#ep20twig_move");
	hideoffnpc getmdnpcname("���n�[��#ep20twig_3");
	unittalk "���n�[�� : �܂�����܂����I";
	set .scean,3;
	end;
OnStart3:
	setarray '@walkpos,138,65,148,72,158,78,166,88,173,98,178,108,179,118,176,128,168,138,158,148,148,154,138,155,128,158;
	for('@i=0;'@i<getarraysize('@walkpos); set '@i,'@i+2) {
		if('@i == 4)
			unittalk "���n�[�� : ���������A�ǂ��܂Ői�߂΁c�c";
		if('@i == 13)
			unittalk "���n�[�� : �����܂����I";
		npcwalkto '@walkpos['@i],'@walkpos['@i+1];
		npcwalkwait;
	}
	initnpctimer getmdnpcname("���I��#e20pn06");
	hideonnpc getmdnpcname("���n�[��#ep20twig_move");
	hideoffnpc getmdnpcname("���n�[��#ep20twig_4");
	set .scean,5;
	end;
OnInit:
	setnpcspeed 150;
	end;
}

1@twig.gat,207,178,5	script	���n�[��#ep20twig_1	21519,{
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "���킟�A������ĂȂɁH";
	mes "����Ȓn�`�͏��߂Č��܂��I";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�������ɑ��Ղ������܂��ˁB";
	mes "���I���l�ƃI�[�����[�l��";
	mes "���̓���ʂ�ꂽ�悤�ł��B";
	mes "���������s���܂��傤�I";
	misceffect 211,"";
	next;
	mes "[���n�[��]";
	mes "�����A�}���܂��傤�I";
	close2;
	hideonnpc getmdnpcname("���n�[��#ep20twig_1");
	hideoffnpc getmdnpcname("���n�[��#ep20twig_move");
	cutin "ep19_lehar01.png", 255;
	donpcevent getmdnpcname("���n�[��#ep20twig_move")+"::OnStart";
	stopnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twig.gat,74,184,3	script(HIDDEN)	���n�[��#ep20twig_2	21519,{
	if(.scean == 1) {
		if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled")) {
			unittalk "���n�[�� : �܂��G���c���Ă��܂���I";
			end;
		}
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "����̓K�[�f�B�A���c�c�H";
		mes "�܂�Ŏ��������ז�����悤��";
		mes "�����Ă܂��ˁB";
		close2;
		hideonnpc getmdnpcname("J�K�[�f�B�A��#twig_jg01");
		hideonnpc getmdnpcname("J�K�[�f�B�A��#twig_jg02");
		hideonnpc getmdnpcname("J�K�[�f�B�A��#twig_jg03");
		unittalk "���n�[�� : �����H�@�������H";
		cutin "ep19_lehar01.png", 255;
		stopnpctimer;
		donpcevent getmdnpcname("Twig_MobSpawn")+ "::OnStart";
		end;
	}
	if(.scean == 2) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����Ȃ�U�����Ă���Ƃ�";
		mes "�v���܂���ł����I";
		mes "���ӂ��Ȃ���i�񂾕����ǂ������ł��B";
		close2;
		misceffect 211,"";
		cutin "ep19_lehar01.png", 255;
		hideonnpc getmdnpcname("���n�[��#ep20twig_2");
		hideoffnpc getmdnpcname("���n�[��#ep20twig_move");
		cutin "ep19_lehar01.png", 255;
		donpcevent getmdnpcname("���n�[��#ep20twig_move")+"::OnStart2";
		stopnpctimer;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twig.gat,66,181,3	script	J�K�[�f�B�A��#twig_jg01	21972,{}
1@twig.gat,62,182,3	script	J�K�[�f�B�A��#twig_jg02	21973,{}
1@twig.gat,67,177,3	script	J�K�[�f�B�A��#twig_jg03	21973,{}

1@twig.gat,128,65,5	script(HIDDEN)	���n�[��#ep20twig_3	21519,{
	if(.scean == 3) {
		if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled2")) {
			unittalk "���n�[�� : �܂��G���c���Ă��܂���I";
			end;
		}
		cutin "ep19_lehar04.png", 2;
		mes "[���n�[��]";
		mes "���c�c�܂��A������ł��B";
		mes "�|���Ȃ��Ɛ�ɐi�߂����ɂȂ��ł��ˁB";
		close2;
		hideonnpc getmdnpcname("J�K�[�f�B�A��#twig_jg04");
		hideonnpc getmdnpcname("J�K�[�f�B�A��#twig_jg05");
		hideonnpc getmdnpcname("J�K�[�f�B�A��#twig_jg06");
		cutin "ep19_lehar01.png", 255;
		stopnpctimer;
		donpcevent getmdnpcname("Twig_MobSpawn")+ "::OnStart2";
		end;
	}
	if(.scean == 4) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���I���l�ƃI�[�����[�l��";
		mes "�ǂ�����Ă�����ʂ����̂ł��傤���H";
		close2;
		misceffect 211,"";
		cutin "ep19_lehar01.png", 255;
		hideonnpc getmdnpcname("���n�[��#ep20twig_3");
		hideoffnpc getmdnpcname("���n�[��#ep20twig_move");
		cutin "ep19_lehar01.png", 255;
		donpcevent getmdnpcname("���n�[��#ep20twig_move")+"::OnStart3";
		stopnpctimer;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}
1@twig.gat,135,65,3	script	J�K�[�f�B�A��#twig_jg04	21973,{}
1@twig.gat,135,61,3	script	J�K�[�f�B�A��#twig_jg05	21972,{}
1@twig.gat,135,69,3	script	J�K�[�f�B�A��#twig_jg06	21973,{}

1@twig.gat,128,158,3	script(HIDDEN)	���n�[��#ep20twig_4	21519,{
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�l�ԂƁc�c�_���ӎv�����L����̂�";
	mes "�e�ՂȂ��Ƃł͂Ȃ��悤�ł��c�c";
	mes "�����v���܂��񂩁H";
	next;
	cutin "ep19_lehar06.png", 2;
	mes "[���n�[��]";
	mes "���H";
	mes "����Ȃ̓�����O�ł����āH";
	mes "���A�����ł����A�Y��Ă��������I";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
}

1@twig.gat,119,149,3	script	���I��#e20pn06	10464,{
	if(.scean == 5) {
		if(EP20_1QUE == 56) {
			cutin "ep19_lehar05.png", 2;
			mes "[���n�[��]";
			mes "�������A���I���l�A�I�[�����[�l�I";
			mes "����ƒǂ��t�����I";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "�₠�A���n�[���B";
			mes "���̊F����͂ǂ����܂������H";
			mes "�p�������Ȃ��悤�ł����B";
			next;
			cutin "ep19_lehar05.png", 2;
			mes "[���n�[��]";
			mes "���₢��I�@���I���l������";
			mes "���̃X�S�C�����ňړ�����邩��";
			mes "�K���ɒǂ������ė�����ł��I";
			mes "���݂̂�Ȃ́A�����Ă��ڂ�ł��I";
			next;
			mes "[���n�[��]";
			mes "�r���ŃK�[�f�B�A���ɂ�";
			mes "�ז�����܂������I";
			mes "����l�͑��v�݂�����";
			mes "���S���܂������ǁB";
			next;
			cutin "ep19_leon04.png", 2;
			mes "[���I��]";
			mes "����H�@�K�[�f�B�A���Ɏז����ꂽ�H";
			mes "�����̓��������K���h�����";
			mes "���݂ł͂���܂��񂩁B";
			mes "���������P���킯�c�c�B";
			next;
			cutin "ep19_leon05.png", 2;
			mes "[���I��]";
			mes "�c�c���A���܂����B";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "���������K���h�̈ӎv��";
			mes "���܂�ɂ�����Ɋ�����ꂽ�̂�";
			mes "�F����ɂ��Ă�����";
			mes "�`����Ă�����̂��Ƃ΂���c�c�B";
			next;
			cutin "ep19_lehar01.png", 2;
			mes "[���n�[��]";
			mes "�������ƁA�ǂ��������ƂȂ̂�";
			mes "�������Ă��������܂����H";
			mes "�ł���΁A�Ȍ��ɁI";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "�������͂��̏ꏊ��";
			mes "�����ɂ��鐢�E����";
			mes "���Ȃ���΂Ȃ�܂���B";
			next;
			cutin "ep19_lehar05.png", 2;
			mes "[���n�[��]";
			mes "�c�c�����܂���B";
			mes "�Ȍ������āA�܂����������ł��܂���B";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "�������Ɓc�c";
			mes "�����������鎞�Ԃ����������B";
			mes "���B�������ŕ��������Ƃ�";
			mes "�F����ɗ����ł���悤�ɓ`���Ȃ��ƁB";
			mes "�I�[�����[����`���Ă����H";
			next;
			cutin "ep19_lehar01.png", 2;
			mes "[���n�[��]";
			mes "�i�_�̖��͂𕪂��^����ꂽ";
			mes "�@���҂ɂȂ�Ƃ����̂�";
			mes "�@��ςȂ񂾂낤�Ȃ��c�c�j";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "����ǂ��Ęb�������B";
			mes "���I���Ǝ��̓C�X�K���h�̎��҂�B";
			mes "�C�X�K���h����삷������";
			mes "���������K���h�̏j�����󂯂�";
			mes "�i�����ێ����Ă���B";
			next;
			mes "[�I�[�����[]";
			mes "�������A���������K���h�̖��͂�";
			mes "�m��Ȃ��󂪂Ȃ��B";
			mes "�����A���������K���h���������̑O��";
			mes "�p�����������Ƃ͂Ȃ���B";
			next;
			mes "[�I�[�����[]";
			mes "���ꂪ���A���B�̑O�Ɏp��������";
			mes "�Ƃ������Ƃ́c�c";
			mes "�󋵂����������Ă���Ƃ������ƁB";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "���������K���h�̖��͂���������̂�";
			mes "�����������ł͂���܂���B";
			mes "���������K���h�̖��͂��琶�܂ꂽ";
			mes "���������K���h���c�̃��K��������";
			mes "������邱�Ƃ��ł��܂��B";
			next;
			mes "[���I��]";
			mes "�`���җl�́A���̕t�߂�";
			mes "���K�������ɑ������ꂽ�̂ł���ˁH";
			mes "���炭���������K���h�̖��͂𗊂��";
			mes "���̐����T���Ă����̂ł��傤�B";
			unittalk getnpcid(0,getmdnpcname("�����L#e20pn06")),"�����L: �~���A�A�[";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "�����̓C�X�K���h���E�̒��S�n��";
			mes "���E���̎}������B";
			mes "���͌��E�ŉB����Ă��邯��";
			mes "���������K���h���c�Ɍ������";
			mes "�����ɉ����񂹂Ă���͂���B";
			next;
			mes "[�I�[�����[]";
			mes "���̐��悪�j�󂳂���";
			mes "�C�X�K���h�̌��E�͔j���";
			mes "���������K���h���c�ɂ��";
			mes "�~�b�h�K���h�嗤�N�U�������Ă��܂��B";
			next;
			mes "[�I�[�����[]";
			mes "������A���������Ȃ��Ƃ����Ȃ��B";
			mes "�c�c����ŗ����ł������ȁH";
			next;
			cutin "ep19_lehar05.png", 2;
			mes "[���n�[��]";
			mes "�����Ɓc�c";
			mes "�ǂ�����Č��Ηǂ��̂ł��傤���H";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "���̌��E�ɗ͓Y���ł����";
			mes "�ǂ��̂ł���";
			mes "���͂��ǂ�����";
			mes "���蓖�Ă�̂������ł��B";
			mes "�܂��͂�����l���Ȃ��ƁB";
			next;
			cutin "ep19_lehar01.png", 2;
			mes "[���n�[��]";
			mes "���ԉ҂����K�v�����Ȃ�";
			mes "���ɍl��������܂��B";
			next;
			cutin "ep19_lehar02.png", 2;
			mes "[���n�[��]";
			mes "���K�������̒�����";
			mes "�W�Q����̂͂ǂ��ł����H";
			mes "���̕t�߂ɂ��郋�K������������";
			mes "�Ԃ񉣂��Ă������I";
			unittalk getcharid(3),strcharinfo(0)+" : �ߌ����Ȃ��c�c";
			next;
			cutin "ep19_leon01.png", 2;
			mes "[���I��]";
			mes "�c�c�Ȃ�قǁB";
			mes "���K�������̒������ז�����";
			mes "���Ԃ��҂��ł���Ԃ�";
			mes "����������i���l���܂��B";
			unittalk getcharid(3),strcharinfo(0)+" : ���A�{���ɂ���??";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "���������K���h�̓��K��������";
			mes "���E����������";
			mes "���̒n�̖��͂��̏W�����肷�邱�Ƃ�";
			mes "�]��ł��Ȃ��B";
			next;
			mes "[�I�[�����[]";
			mes "�悵�A���܂�ˁB";
			mes "�O�ɂ��鑼�̃����o�[�ƍ�������";
			mes "���݂��Ă��炢�܂��傤�B";
			next;
			cutin "ep19_aurelie01.png", 255;
			chgquest 23106,23108;
			set EP20_1QUE,57;
			mes "�]�O��";
			mes "�@�������܂����H�]";
			next;
			if(select("������","��߂�") == 2) {
				mes "�]���̏�ɂƂǂ܂����]";
				close;
			}
			//
			mes "�]�O��";
			mes "�@���������]";
			close2;
			warp "jor_twice.gat", 53, 323;
			end;
		}
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "��������O�ɂł܂��傤�B";
		mes "���̊F����ɂ�";
		mes "��������K�v������܂�����B";
		next;
		cutin "ep19_leon01.png", 255;
		mes "�]�O��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�O��";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 53, 323;
		end;
	}
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "�`���җl�A��������Ⴂ�܂������B";
	next;
	cutin "ep19_leon03.png", 2;
	mes "[���I��]";
	mes "���n�[�����ꏏ�ł��ˁB";
	mes "�ނ���������܂ő҂Ƃ��܂��傤�B";
	close2;
	cutin "ep19_leon01.png", 255;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twig.gat,117,151,3	script	�I�[�����[#e20pn06	10465,{
	cutin "ep19_aurelie01.png", 2;
	mes "[�I�[�����[]";
	mes "�ǂ���ō��܂ŒN��������";
	mes "�������Ȃ������킯���c�c";
	mes "���̌��E�̍\���́c�c�B";
	mes "�@";
	mes "�]�I�[�����[�͍l�����ɖv�����Ă���]";
	close2;
	cutin "ep19_aurelie01.png", 255;
	end;
}

1@twig.gat,116,145,7	script	�����L#e20pn06	10537,{
	cutin "ep20_nyar0" +rand(2,4)+ ".png", 2;
	mes "[�����L]";
	mes "�~���A�I���B";
	close2;
	cutin "ep20_nyar01.png", 255;
	end;
}

1@twig.gat,0,0,0	script	Twig_MobSpawn	-1,{
OnStart:
	monster getmdmapname("1@twig.gat"),66,181,"J�K�[�f�B�A��-P#jor_gar",21991,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled";
	monster getmdmapname("1@twig.gat"),62,182,"J�K�[�f�B�A��-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled";
	monster getmdmapname("1@twig.gat"),67,177,"J�K�[�f�B�A��-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled";
	end;
OnKilled:
	if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled"))
		end;
	sleep 500;
	unittalk getnpcid(0,"���n�[��#ep20twig_2"),"���n�[�� : �����l�ł����I";
	initnpctimer getmdnpcname("���n�[��#ep20twig_2");
	set .scean,2;
	end;
OnStart2:
	monster getmdmapname("1@twig.gat"),135,61,"J�K�[�f�B�A��-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled2";
	monster getmdmapname("1@twig.gat"),135,69,"J�K�[�f�B�A��-P#jor_gar",21991,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled2";
	monster getmdmapname("1@twig.gat"),135,65,"J�K�[�f�B�A��-Y#jor_gar",21992,1,getmdnpcname("Twig_MobSpawn")+"::OnKilled2";
	end;
OnKilled2:
	if(getmapmobs(getmdmapname("1@twig.gat"),getmdnpcname("Twig_MobSpawn")+"::OnKilled2"))
		end;
	sleep 500;
	unittalk getnpcid(0,"���n�[��#ep20twig_3"),"���n�[�� : �����l�ł����I";
	initnpctimer getmdnpcname("���n�[��#ep20twig_3");
	set .scean,4;
	end;
}
