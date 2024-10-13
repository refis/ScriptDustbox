//==============================================================================
// Isolated Sanctuary Memorial Dungeon Script
//==============================================================================
1@twas.gat,0,0,0	script	Twas_Control	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	initnpctimer getmdnpcname("�I�[�����[#aurelie01");
	end;
}

1@twas.gat,99,76,4	script	�I�[�����[#aurelie01	10465,{
	if(.scean == 0) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�����̓j�����l��";
		mes "���X�K���h���u����������B";
		mes "�M���������̖��q�ɂȂ�Ȃ��悤";
		mes "���͌������̖�ڂ����Ă���B";
		mes "�ڂ̑O�̎��͌��e�̗l�Ȃ��̂�B";
		unittalk "�I�[�����[ : �����̓j�����l�����X�K���h���u����������B���͌������̖�ڂ����Ă���B";
		next;
		mes "[�I�[�����[]";
		mes "�����ł͎��͎���o���Ȃ��B";
		mes "�M�������������B";
		mes "�����A���X�K���h��";
		mes "���~���̐S���̌��ЂƊ��S��";
		mes "�Z������O�ɁA�ނ̖��͂�D��Ȃ��ƁB";
		unittalk "�I�[�����[ : ���X�K���h�����~���̐S���̌��ЂƊ��S�ɗZ������O�ɁA�ނ̖��͂�D��Ȃ��ƁB";
		next;
		mes "[�I�[�����[]";
		mes "���X�K���h��|����Ηǂ��̂�����";
		mes "��������ł��傤�B";
		mes "���͂Ƃɂ������͂�D����������";
		mes "��O���Ă��傤�����B";
		unittalk "�I�[�����[ : ���X�K���h��|����Ηǂ��̂����Ǒ�������ł��傤�B���͂�D���������ɐ�O���Ă��傤�����B";
		close2;
		cutin "ep19_aurelie01.png", 255;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			hideonnpc;
			stopnpctimer;
			initnpctimer getmdnpcname("���X�K���h#lasgand01");
			set .scean,1;
		}
		end;
	}
	if(.scean == 2) {
		if(EP20_1QUE == 78) {
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "���v�H";
			next;
			menu "���X�K���h��|������ł��傤���H",-;
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "�c�O�Ȃ���A����͖����B";
			mes "�ł����X�K���h�̗͂�";
			mes "��点�邱�Ƃ��ł�������";
			mes "�j�����l�̕��g������";
			mes "���X�K���h��}������ł����B";
			next;
			cutin "ep20_nyar04.png", 1;
			mes "[�j�����̕��g]";
			mes "�E�~���@�B";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "����H�@���������Ă�������";
			mes "������āc�c";
			mes "���~���̐S���̌��Ђ���Ȃ�!?";
			next;
			cutin "ep20_nyar03.png", 1;
			mes "[�j�����̕��g]";
			mes "�E�j���I���B";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "���~���̐S���̌��Ђ�";
			mes "���S�ɗZ������O��";
			mes "�`���҂̍U�����ʂ����̂ˁI";
			mes "�����ǁc�c�B";
			next;
			cutin "ep20_nyar01.png", 1;
			mes "[�j�����̕��g]";
			mes "�~���I���c�~���I���c";
			next;
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "����ς�c�c";
			mes "�Q�I���O�����݂������";
			mes "�^�������ɂ���Ƃ����􂢂�";
			mes "���X�K���h��s���g�ɂ����Ă���B";
			next;
			mes "[�I�[�����[]";
			mes "���͂ǂ��ɂ������������Ă��邯��";
			mes "���X�K���h�̗͂͋��傾��c�c�B";
			next;
			mes "[�I�[�����[]";
			mes "�M���́A�X�v�[����@���Ēm���Ă�H";
			mes "�Ⴆ�X�v�[��1�{�����ł�";
			mes "���߂��ɌJ��Ԃ��y���@���";
			mes "�R����������Ƃ�����@��B";
			next;
			mes "[�I�[�����[]";
			mes "�v����ɁA���X�K���h�̗͂�";
			mes "�������킮���Ƃŏ��@�𓾂�B";
			mes "�c�c�����͂�������P�ނ��܂��傤�B";
			mes "���X�K���h���͂��񕜂�����O��";
			mes "������������𐮂��Ȃ��ẮB";
			next;
			cutin "ep19_aurelie01.png", 255;
			if(checkitemblank() == 0) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			chgquest 18232,18233;
			set EP20_1QUE,79
			getitem 1001254,1;
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
			warp "jor_twig.gat", 145, 156;
			end;
		}
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���~���̐S���̌��Ђ�";
		mes "���S�ɗZ������O��";
		mes "���X�K���h���~�߂��ėǂ������B";
		mes "�ł��A�����͂�������P�ނ��܂��傤�B";
		next;
		mes "[�I�[�����[]";
		mes "���߂������~���̐S���̌��Ђ�";
		mes "���̏ꏊ�ɖ߂��Ȃ��Ƃ����Ȃ�����ˁB";
		next;
		cutin "ep19_aurelie01.png", 255;
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
		warp "jor_twig.gat", 145, 156;
		end;
	}
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twas.gat,94,84,3	script	���X�K���h#lasgand01	21979,{
	if(.scean == 1) {
		cutin "ep20_lasgand_god01.png", 1;
		mes "[���X�K���h]";
		mes "���A���̐g�ɂ͐_�̗͂����Ă��邪";
		mes "���X�����ɍ����Ă����Ƃ��낾�B";
		unittalk "���X�K���h : ���̐g�ɂ͐_�̗͂����Ă��邪�A���X�����ɍ����Ă����Ƃ��낾�B";
		next;
		mes "[���X�K���h]";
		mes "���O�����́A�����u�����邱�Ƃ�";
		mes "���������Ǝv���Ă���悤����";
		mes "����Ȃ�΁A�����ƐT�d��";
		mes "�s�����ׂ��������̂ł͂Ȃ����H";
		unittalk "���X�K���h : ���O�����́A�����ƐT�d�ɍs�����ׂ��������̂ł͂Ȃ����H";
		misceffect 897;
		misceffect 380;
		cutin "ep20_lasgand_god02.png", 1;
		next;
		mes "[���X�K���h]";
		mes "�����m��ʋ����҂߁c�c";
		mes "�킴�킴���������̕�����";
		mes "����J���邽�߂ɗ��Ă����Ƃ́I";
		unittalk "���X�K���h : �킴�킴���������̕�����A����J���邽�߂ɗ��Ă����Ƃ́I";
		close2;
		cutin "ep20_lasgand_god02.png", 255;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			donpcevent getmdnpcname("Twas_MobSpawn")+ "::OnStart";
		end;
	}
	if(.scean == 2) {
		cutin "ep20_lasgand02.png", 1;
		mes "[���X�K���h]";
		mes "����킵���l�ԕ���߁c�c";
		mes "�����A����ŏI���Ǝv���Ȃ�B";
		mes "�M�l�炪���Ƃ��ď̂���";
		mes "�Q�I���O�̌��؂��₦�ʌ���";
		mes "���͎��ʂ��Ƃ͖����B";
		next;
		cutin "ep20_lasgand03.png", 1;
		mes "[���X�K���h]";
		mes "�C�X�K���h�̌��E����";
		mes "���S�N��ς��ė����g�Ȃ̂��B";
		mes "���������K���h�̗͂��s����̂��悩";
		mes "�������̏�̖��͂��z�����s������";
		mes "������j��̂��悩�c�c";
		mes "�����Ă݂悤�ł͂Ȃ����H";
		close2;
		cutin "ep20_lasgand03.png", 255;
		end;
	}
	unittalk "���X�K���h : �T�������z�炪�W�܂��Ă����ȁc�c";
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;
	end;
}

1@twas.gat,94,81,0	script(HIDDEN)	�j�����̕��g#nyar01	10537,{
	unittalk "�j�����������c�B";
	end;
}

1@twas.gat,91,83,6	script(HIDDEN)	�j�����̕��g#nyar02	10537,{
	unittalk "�j�����������c�B";
	end;
}

1@twas.gat,97,83,1	script(HIDDEN)	�j�����̕��g#nyar03	10537,{
	unittalk "�j�����������c�B";
	end;
}

1@twas.gat,0,0,0	script	Twas_MobSpawn	-1,{
OnStart:
	sleep 1000;
	misceffect 898,getmdnpcname("���X�K���h#lasgand01");
	unittalk getnpcid(0,getmdnpcname("���X�K���h#lasgand01")),"���X�K���h : ����J����!!";
	sleep 1000;
	misceffect 380,getmdnpcname("���X�K���h#lasgand01");
	stopnpctimer getmdnpcname("���X�K���h#lasgand01");
	hideonnpc getmdnpcname("���X�K���h#lasgand01");
	monster getmdmapname("1@twas.gat"),96,80,"���ɂ̃��X�K���h",21979,1,getmdnpcname("Twas_MobSpawn")+"::OnKilled";
	end;
OnKilled:
	sleep 2000;
	mapwarp getmdmapname("1@twas.gat"), getmdmapname("1@twas.gat"), 94, 77;
	sleep 2000;
	hideoffnpc getmdnpcname("�I�[�����[#aurelie01");
	hideoffnpc getmdnpcname("���X�K���h#lasgand01");
	setnpcdisplay getmdnpcname("���X�K���h#lasgand01"),10536;
	hideoffnpc getmdnpcname("�j�����̕��g#nyar01");
	hideoffnpc getmdnpcname("�j�����̕��g#nyar02");
	hideoffnpc getmdnpcname("�j�����̕��g#nyar03");
	initnpctimer getmdnpcname("�I�[�����[#aurelie01");
	set .scean,2;
	end;
}







/*
//150,1200,288,576
21979,���ɂ̃��X�K���h���|�C�Y���A�^�b�N,attack,188,5,2000,0,5000,no,target,always,0,,,,,,
21979,���ɂ̃��X�K���h���v���I�ȏ�,attack,673,2,2000,0,30000,no,target,always,0,,,,,,
21979,���ɂ̃��X�K���h���_���[�W�q�[��,attack,753,1,500,1500,5000,no,self,always,0,,,,,,
21979,���ɂ̃��X�K���h�����C�h�\�E���h���C��,attack,680,7,1000,500,20000,no,self,always,0,,,,,,
21979,���ɂ̃��X�K���h���O�����g�D�[�X,chase,137,5,2000,0,5000,no,target,always,0,,,,,,
21979,���ɂ̃��X�K���h���C���f���A,chase,8,1,2000,0,20000,no,self,always,0,,,,,,
21979,���ɂ̃��X�K���h���q�[��,idle,28,10,10000,500,5000,no,self,always,0,,,,,,

21989,���������K���h���c��q���X�^���A�^�b�N,attack,179,1,2000,0,17,no,target,always,0,,,,,,
21989,���������K���h���c��q���z�[���[�A�^�b�N,chase,189,1,2000,0,9,no,target,always,0,,,,,,
21989,���������K���h���c��q��M���C�I�u�W�F�l�V�X,chase,737,7,2000,0,6,no,around,always,0,,,,,,
21989,���������K���h���c��q���X�p�C�����s�A�[�X,attack,397,5,2000,0,0,no,target,always,0,,,,,,
21985,�㋉���K����p�t��M�N���E�h�L��,chase,739,1,2000,0,7,no,around,always,0,,,,,,
21985,�㋉���K����p�t���|�C�Y���A�^�b�N,chase,188,1,2000,0,300620,no,target,always,0,,,,,,
21985,�㋉���K����p�t���J�[�X�A�^�b�N,attack,181,1,2000,0,0,no,target,always,0,,,,,,
21985,�㋉���K����p�t���T�C�g���b�V���[,chase,81,10,2000,0,5,no,target,always,0,,,,,,
21986,�㋉���K�����Ît���z�[���[�A�^�b�N,chase,189,1,2000,0,0,no,target,always,0,,,,,,
21973,J�K�[�f�B�A��-Y���|�C�Y���A�^�b�N,chase,188,1,2000,0,1054,no,target,always,0,,,,,,
21973,J�K�[�f�B�A��-Y���v���{�b�N,chase,6,5,2000,0,1620141,no,target,always,0,,,,,,
21972,J�K�[�f�B�A��-P���z�[���[�A�^�b�N,attack,189,1,2000,0,3937,no,target,always,0,,,,,,
21972,J�K�[�f�B�A��-P���v���{�b�N,chase,6,5,2000,0,5657583,no,target,always,0,,,,,,
*/
