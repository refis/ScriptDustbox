1@jorlab.gat,0,0,0	script	BagotLabControl1	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@temp_mob[0],callmonster(getmdmapname("1@jorlab.gat"),55,53,"�i���s��#55_53",3982,getmdnpcname("BagotLabControl1")+"::OnKilled");
	set '@temp_mob[1],callmonster(getmdmapname("1@jorlab.gat"),60,53,"�i���s��#60_53",3982,getmdnpcname("BagotLabControl1")+"::OnKilled");
	for(set '@i,0; '@i < getarraysize('@temp_mob); set '@i,'@i+1)
		setunitgroup 1002,'@temp_mob['@i];
	areasetcell getmdmapname("1@jorlab.gat"),54,52,61,55,1;
	end;
}

1@jorlab.gat,58,49,3	script	����Ǘ�#ep19re3	10046,{/* 72971 */
	mes "^FF0000[�C���t�H���[�V����]";
	mes "���̐�ւ�";
	mes "�������A���_���W������";
	mes "��������𖞂�����";
	mes "�قȂ�Q�[���A�J�E���g��";
	mes "�L�����N�^�[��2�l�܂ŁA";
	mes "�ꏏ�ɐi�ނ��Ƃ��ł��܂��B^000000";
	next;
	mes "[�C���t�H���[�V����]";
	mes "�i�����܂����H";
	mes "�@";
	mes "^4A0084�]�i���L�����N�^�[���F " +.char_cnt+ " / 2�]^000000";
	next;
	if(select("^0000ff�͂�^000000","������") == 2) {
		mes "�]��߂��]";
		close;
	}
	mes "[�C���t�H���[�V����]";
	mes "�i�����܂��B";
	close2;
	if(.char_cnt >= 2) {
		// ������
		mes "[�C���t�H���[�V����]";
		mes "����ȏ�i���ł��܂���B";
		close;
	}
	set .char_cnt,.char_cnt+1;
	donpcevent getmdnpcname("BagotLabControl2")+ "::OnStart";
	warp getmdmapname("2@jorlab.gat"), 58, 62;
	end;
}

2@jorlab.gat,0,0,0	script	BagotLabControl2	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	set '@temp_mob[0],callmonster(getmdmapname("2@jorlab.gat"),55,53,"�i���s��#55_53",3982,getmdnpcname("BagotLabControl2")+"::OnKilled");
	set '@temp_mob[1],callmonster(getmdmapname("2@jorlab.gat"),60,53,"�i���s��#60_53",3982,getmdnpcname("BagotLabControl2")+"::OnKilled");
	for(set '@i,0; '@i < getarraysize('@temp_mob); set '@i,'@i+1)
		setunitgroup 1002,'@temp_mob['@i];
	areasetcell getmdmapname("2@jorlab.gat"),54,52,61,55,1;
	donpcevent getmdnpcname("�����P�A#ep19re3")+ "::OnStart";
	end;
}

2@jorlab.gat,58,67,3	script	�����P�A#ep19re3	10455,{/* 66345 */
	switch(.scean) {
	case 0:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			// ������
			end;
		}
		if(EP19_1QUE != 57) {
			// ������
			end;
		}
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			misceffect 595,"";	// self
			sc_start EFST_MONSTER_TRANSFORM,180000,21530;
		}
		set '@juncea$,getmdnpcname("�����P�A#ep19re3");
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�c�c�����ˁB";
		mes "�Z�l�L�I�K���h�B";
		mes "�҂��Ă���B";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�Ă΂�ė�������";
		mes "���̂��b�ł����H";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�q���̂ӂ���������";
		mes "�����ˁH";
		mes "��J�����񂶂�Ȃ��H";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "���̘b�ł��H";
		mes "�ǂ������́H";
		mes "�Ȃ񂾂��|���I";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�����|���́H";
		mes "���܂Œ��ǂ����Ă�����Ȃ��B";
		mes "�Ȃ̂ɋ}�ɕ|�C�Â��Ȃ�āB";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "���ƒ��ǂ��Ȃ肽��������ł���H";
		mes "�o�S�b�g�̈����������Ă����̂�";
		mes "���ɋ߂Â��ׂ̕��@�������B";
		next;
		mes "[�����P�A]";
		mes "�ł��c�c������ԈႦ����B";
		mes "�����Ȃ��ƂɂˁB";
		next;
		mes "[�����P�A]";
		mes "�̑�Ȃ��c�c�o�S�b�g�l����";
		mes "����Ȕ����؂�Ȃ����ɂ�";
		mes "�x�����Ǝv�����̂��H";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�̑�ȁc�c�o�S�b�g�l�H";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�����c�c";
		mes "���łɂ��O�̊�݂͂��c�c";
		mes "�S�Ĕc�����Ă���c�c��c�c�B";
		next;
		mes "[�����P�A]";
		mes "���O���c�c�����P�A���c";
		mes "���p���悤�Ƃ������Ƃ����c�c";
		mes "�܂��c�������Łc�c�B";
		next;
		mes "[�����P�A]";
		mes "����Ŏ��́c�c���c�c�H";
		next;
		mes "[�����P�A]";
		mes "���c�c";
		mes "���́c�c�N���H";
		mes "���A�����́c�c�B";
		next;
		cutin "ep19_juncea04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i�����P�A�̗l�q����������!!";
		mes "�@�o�S�b�g�ɉ������ꂽ�̂�!?�j";
		next;
		cutin "ep19_juncea04.png", 2;
		mes "[�����P�A]";
		mes "�������ł��悤�Ɓc�c";
		mes "���O�����͂��ł�";
		mes "�o�S�b�g�l�̏��̏�c�c�I";
		next;
		cutin "ep19_juncea00.png", 1;
		setnpcdisplay '@juncea$,10456;	// 66345
		mes "[�����P�A]";
		mes "�����Łc�c����������c�c�I";
		next;
		cutin "ep19_juncea04.png", 2;
		setnpcdisplay '@juncea$,10455;	// 66345
		mes "[�����P�A]";
		mes "�����c�c�����������������I";
		next;
		cutin "ep19_juncea00.png", 1;
		setnpcdisplay '@juncea$,10456;	// 66345
		mes "[�����P�A]";
		mes "�S�Ắc�o�S�b�g�l�́c�c�c�I";
		next;
		cutin "ep19_juncea04.png", 2;
		setnpcdisplay '@juncea$,10455;	// 66345
		mes "[�����P�A]";
		mes "�����������[�[�[���I";
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10456;	// 66345
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10455;	// 66345
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10456;	// 66345
		if(sleep2(100)) end;
		setnpcdisplay '@juncea$,10455;	// 66345
		next;
		cutin "ep19_juncea00.png", 1;
		setnpcdisplay '@juncea$,10456;	// 66345
		mes "[�����P�A]";
		mes "�o�S�b�g�l�́c�c��ӎu��!!";
		close2;
		cutin "ep19_juncea04.png", 255;
		hideonnpc;	// 66345
		stopnpctimer;
		donpcevent getmdnpcname("BagotLabControl3")+ "::OnStart";
		end;
	case 2:
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			misceffect 595,"";	// self
			sc_start EFST_MONSTER_TRANSFORM,180000,21530;
		}
		if(EP19_1QUE == 57) {
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				// ������
				end;
			}
			mes "["+strcharinfo(0)+"]";
			mes "�i�ǂ��ɂ������ł����悤���B";
			mes "�@�����P�A�͋C�������Ă���c�c)";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i���S�Ƀ����X�^�[�����Ă����B";
			mes "�@�o�S�b�g���c�c";
			mes "�@�����P�A�ɉ��������̂��H)";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�����P�A���������";
			mes "�@�A��o�����肾��������";
			mes "�@�����Ȃ����ȏ�́c�c�j";
			announce "�o�S�b�g : �����P�A����ł́A��͂�͕s����������ł��傤�����H", 0x9, 0x00ffff;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i���K���̕ϐg�X�N���[�����g��";
			mes "�@�p��ς��ĘA��o�����j";
			announce "�o�S�b�g : �o�S�b�g�̌v�Z���Ԉ���Ă��܂����˂��B", 0x9, 0x00ffff;
			next;
			setnpcdisplay getmdnpcname("�����P�A#ep19re3"),10470;	// 66345
			mes "["+strcharinfo(0)+"]";
			mes "�i�}���ŁA�X�̏�ɖ߂낤�j";
			announce "�o�S�b�g : ���̃X�N���[���c�c�o�S�b�g���x�����Ƃ��Ă���͕̂������Ă����ǂ��A����͋����[�����B", 0x9, 0x00ffff;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�c�c�����������������悤�ȁH";
			mes "�@�C�̂������c�c�j";
			announce "�o�S�b�g : �c�c�ӂӂ��B", 0x9, 0x00ffff;
			close2;
			delquest 16659;
			setquest 16661;	// state=1	showevent 0, 1, �o�S�b�g�̌�����#warp_e;	// 2666: 66, 260 showevent 0, 1, �z����#if19ms;	// 2544: 27, 126
			set EP19_1QUE,58;
		}
		mes "�]�X�̏�֌������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏�֌��������]";
		close2;
		warp "icecastle.gat", 27, 123;
		end;
	}
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 66345
	end;
}

2@jorlab.gat,0,0,0	script	BagotLabControl3	-1,{
OnStart:
	set .scean,1;
	set '@map$,getmdmapname("2@jorlab.gat");
	set '@label$,getmdnpcname("BagotLabControl3")+"::OnKilled";
	monster '@map$,58,67,"�������ꂽ�����P�A#boss",21532,1,'@label$;
	end;
OnKilled:
	set .scean,2;
	setnpcdisplay getmdnpcname("�����P�A#ep19re3"),10457;	// 66345
	hideoffnpc getmdnpcname("�����P�A#ep19re3");	// 66345
	donpcevent getmdnpcname("�����P�A#ep19re3")+ "::OnStart";
	end;
}

//@spawn(type: BL_MOB, ID: 35516, speed: 300, option: 0x0, class: 3982, pos: ("2@jorlab.gat",60,53), dir: 0, name"�i���s��#60_53")
//@spawn(type: BL_MOB, ID: 53802, speed: 150, option: 0x0, class: 21532, pos: ("2@jorlab.gat",58,67), dir: 0, name"�������ꂽ�����P�A#boss")

/*
150,2016,2016,576
//21532,�������ꂽ�����P�A���J�E���^�[�q�[��,idle,687,1,3000,0,10000,no,self,rudeattacked,,,,,,,
//21532,�������ꂽ�����P�A���J�E���^�[�q�[��,walk,687,1,3000,0,10000,no,self,rudeattacked,,,,,,,
21532,�������ꂽ�����P�A���_�[�N�X�g���C�N,chase,340,2,2000,200,5000,no,target,always,0,,,,,,
21532,�������ꂽ�����P�A���_�[�N�X�g���C�N,attack,340,2,2000,0,5000,no,target,always,0,,,,,,
//21532,�������ꂽ�����P�A���O�����h�_�[�N�l�X,attack,339,2,2000,0,30000,yes,self,always,0,,,,,,
//21532,�������ꂽ�����P�A���O�����h�_�[�N�l�X,chase,339,2,2000,0,30000,yes,self,always,0,,,,,,
21532,�������ꂽ�����P�A���_�[�N�l�X�A�^�b�N,attack,190,3,2000,0,5000,no,target,always,0,,,,,,
21532,�������ꂽ�����P�A���u���b�h�h���C��,attack,199,1,2000,0,5000,no,target,always,0,,,,,,
*/
