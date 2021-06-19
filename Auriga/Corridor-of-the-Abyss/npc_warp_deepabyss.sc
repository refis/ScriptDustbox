//= Auriga Script ==============================================================
// Ragnarok Online Deep Abyss Warp Method Script	by refis
//==============================================================================

//============================================================
// �v�����e���[���i�뉀�j
//------------------------------------------------------------
// ����NPC
pab_camp.gat,40,211,6	script	�Ђ��ނ��ȉq�m#pab_camp	417,{
	mes "[�Ђ��ނ��ȉq�m]";
	mes "�����l�ł��A�`���җl�I";
	mes "�u^0000ff�v�����e���[���i�뉀�j^000000�v��";
	mes "�u^0000ff�v�����e���[���\�w�i�뉀�j^000000�v��";
	mes "�ē��������܂��B";
	set '@str$,(BaseLevel > 130? "^888888�\�w�뉀�Ɍ�����^000000": "�\�w�뉀�Ɍ�����");
	next;
	switch(select("�뉀�Ɍ�����",'@str$,"����߂�")) {
	case 1:
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����I";
		mes "�ǂ���ɍs����܂����H";
		next;
		switch(select("�뉀(�k��)","�뉀(��)","����߂�")) {
		case 1:
			warp "pab_dun01.gat",43,232;
			end;
		case 2:
			warp "pab_dun01.gat",254,104;
			end;
		case 3:
			mes "[�Ђ��ނ��ȉq�m]";
			mes "�������܂�܂����B";
			mes "�u�v�����e���[���i�뉀�j�v��";
			mes "��������ۂ�";
			mes "���ɂ��\���t�����������I";
			close;
		}
	case 2:
		if(BaseLevel > 130) {
			mes "[�Ђ��ނ��ȉq�m]";
			mes "�`���җl�ł����";
			mes "�\�w�ɍs���K�v�͖����͂��ł��B";
			mes "�\�w�ȊO�̏ꏊ�Ɍ������Ă��������B";
			mes "�@";
			mes "^0000ff�]BaseLv130�ȉ��Ȃ�\�w��";
			mes "�@���邱�Ƃ��ł��܂��]^000000";
			close;
		}
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����I";
		mes "�ǂ���ɍs����܂����H";
		next;
		switch(select("�\�w�뉀(�k��)","�\�w�뉀(��)","����߂�")) {
		case 1:
			warp "pab_dun05.gat",43,232;
			end;
		case 2:
			warp "pab_dun05.gat",254,104;
			end;
		case 3:
			mes "[�Ђ��ނ��ȉq�m]";
			mes "�������܂�܂����B";
			mes "�u�v�����e���[���\�w�i�뉀�j�v��";
			mes "��������ۂ�";
			mes "���ɂ��\���t�����������I";
			close;
		}
	default:
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����B";
		mes "�u�v�����e���[���i�뉀�j�v��";
		mes "��������ۂ�";
		mes "���ɂ��\���t�����������I";
		close;
	}
}

// �v�����e���[���i�뉀�j�A��NPC
pab_dun01.gat,30,232,0	warp	#warp_pab_dun01_01	2,2,pab_camp.gat,40,203
pab_dun01.gat,263,109,0	warp	#warp_pab_dun01_02	2,2,pab_camp.gat,40,203

// �v�����e���[���\�w�i�뉀�j�A��NPC
pab_dun05.gat,30,232,0	warp	#warp_pab_dun05_01	2,2,pab_camp.gat,40,203
pab_dun05.gat,263,109,0	warp	#warp_pab_dun05_02	2,2,pab_camp.gat,40,203

//============================================================
// �v�����e���[���i���J��j
//------------------------------------------------------------
// ����NPC
pab_camp.gat,19,190,6	script	�Ђ��ނ��ȉq�m#pab_camp	417,{
	mes "[�Ђ��ނ��ȉq�m]";
	mes "�����l�ł��A�`���җl�I";
	mes "�u^0000ff�v�����e���[���i���J��j^000000�v��";
	mes "�ē��������܂��B";
	next;
	switch(select("���J��Ɍ�����","����߂�")) {
	case 1:
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����I";
		mes "�ǂ���ɍs����܂����H";
		next;
		switch(select("���J��(�k��)","���J��(�쐼)","����߂�")) {
		case 1:
			warp "pab_dun02.gat",216,185;
			end;
		case 2:
			warp "pab_dun02.gat",49,52;
			end;
		case 3:
			mes "[�Ђ��ނ��ȉq�m]";
			mes "�������܂�܂����B";
			mes "�u�v�����e���[���i���J��j�v��";
			mes "��������ۂ�";
			mes "���ɂ��\���t�����������I";
			close;
		}
	default:
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����B";
		mes "�u�v�����e���[���i���J��j�v��";
		mes "��������ۂ�";
		mes "���ɂ��\���t�����������I";
		close;
	}
}

// �v�����e���[���i���J��j�A��NPC
pab_dun02.gat,54,58,0	warp	#warp_pab_dun02_01	2,2,pab_camp.gat,28,191
pab_dun02.gat,222,197,0	warp	#warp_pab_dun02_02	2,2,pab_camp.gat,28,191

// �v�����e���[���i���J��j=> �v�����e���[���i�X�сj
pab_dun02.gat,219,46,0	warp	#warp_pab_dun02_03	2,2,pab_dun09.gat,34,139

//============================================================
// �v�����e���[���i��L�j
//------------------------------------------------------------
// ����NPC
pab_camp.gat,64,189,4	script	�Ђ��ނ��ȉq�m#pab_camp	417,{
	mes "[�Ђ��ނ��ȉq�m]";
	mes "�����l�ł��A�`���җl�I";
	mes "�u^0000ff�v�����e���[���i��L�j^000000�v��";
	mes "�u^0000ff�v�����e���[���\�w�i��L�j^000000�v��";
	mes "�ē��������܂��B";
	set '@str$,(BaseLevel > 130? "^888888�\�w��L�Ɍ�����^000000": "�\�w��L�Ɍ�����");
	next;
	switch(select("��L�Ɍ�����",'@str$,"����߂�")) {
	case 1:
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����I";
		mes "�ǂ���ɍs����܂����H";
		next;
		switch(select("��L(��)","��L(��)","����߂�")) {
		case 1:
			warp "pab_dun03.gat",13,132;
			end;
		case 2:
			warp "pab_dun03.gat",224,130;
			end;
		case 3:
			break;
		}
		break;
	case 2:
		if(BaseLevel > 130) {
			mes "[�Ђ��ނ��ȉq�m]";
			mes "�`���җl�ł����";
			mes "�\�w�ɍs���K�v�͖����͂��ł��B";
			mes "�\�w�ȊO�̏ꏊ�Ɍ������Ă��������B";
			mes "�@";
			mes "^0000ff�]BaseLv130�ȉ��Ȃ�\�w��";
			mes "�@���邱�Ƃ��ł��܂��]^000000";
			close;
		}
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����I";
		mes "�ǂ���ɍs����܂����H";
		next;
		switch(select("�\�w��L(��)","�\�w��L(��)","����߂�")) {
		case 1:
			warp "pab_dun07.gat",13,132);
			end;
		case 2:
			warp "pab_dun07.gat",224,130;
			end;
		case 3:
			break;
		}
		break;
	default:
		break;
	}
	mes "[�Ђ��ނ��ȉq�m]";
	mes "�������܂�܂����B";
	mes "�u�v�����e���[���i��L�j�v��";
	mes "��������ۂ�";
	mes "���ɂ��\���t�����������I";
	close;
}

// �v�����e���[���i��L�j�A��NPC
pab_dun03.gat,6,130,0	warp	#warp_pab_dun03_01	2,2,pab_camp.gat,57,189
pab_dun03.gat,232,130,0	warp	#warp_pab_dun03_02	2,2,pab_camp.gat,57,189

// �v�����e���[���\�w�i��L�j�A��NPC
pab_dun07.gat,6,130,0	warp	#warp_pab_dun07_01	2,2,pab_camp.gat,57,189
pab_dun07.gat,232,130,0	warp	#warp_pab_dun07_02	2,2,pab_camp.gat,57,189

//============================================================
// �v�����e���[���i���s�X�n�j
//------------------------------------------------------------
// ����NPC
pab_camp.gat,40,168,7	script	�Ђ��ނ��ȉq�m#pab_camp	417,{
	mes "[�Ђ��ނ��ȉq�m]";
	mes "�����l�ł��A�`���җl�I";
	mes "�u^0000ff�v�����e���[���i���s�X�n�j^000000�v��";
	mes "�ē��������܂��B";
	next;
	switch(select("���s�X�n�Ɍ�����","����߂�")) {
	case 1:
		mes "[�Ђ��ނ��ȉq�m]";
		mes "�������܂�܂����I";
		mes "�ǂ���ɍs����܂����H";
		next;
		switch(select("���s�X�n(��)","���s�X�n(��)","����߂�")) {
		case 1:
			warp "pab_dun04.gat",25,132;
			end;
		case 2:
			warp "pab_dun04.gat",259,131;
			end;
		case 3:
			break;
		}
	default:
		break;
	}
	mes "[�Ђ��ނ��ȉq�m]";
	mes "�������܂�܂����B";
	mes "�u�v�����e���[���i���s�X�n�j�v��";
	mes "��������ۂ�";
	mes "���ɂ��\���t�����������I";
	close;
}

// �v�����e���[���i���s�X�n�j�A��NPC
pab_dun04.gat,14,132,0	warp	#warp_pab_dun04_01	2,2,pab_camp.gat,41,176
pab_dun04.gat,267,131,0	warp	#warp_pab_dun04_02	2,2,pab_camp.gat,41,176

// �v�����e���[���i���s�X�n�j=> �v�����e���[���i�k�J�j
pab_dun04.gat,96,10,0	warp	#warp_pab_dun04_03	2,2,pab_dun10.gat,96,169

//============================================================
// �v�����e���[���i�X�сj
//------------------------------------------------------------
// ����NPC
pab_castle.gat,268,222,6	script	�d���Ȃ�߉q��#pab_cast	734,{
	if(BaseLevel < 150) {
		mes "[�d���Ȃ�߉q��]";
		mes "�҂����I";
		mes "���̐�͋��\�ȉ������ǂ���";
		mes "������绂����]�̕��B";
		mes "���̎҂łȂ���ΐi�ނ��Ƃ��\���";
		mes "���E�𒣂��Ă���B";
		next;
		mes "[�d���Ȃ�߉q��]";
		mes "^ff0000BaseLv��150�ȏ�^000000�ɂȂ��";
		mes "���E��ʂ邱�Ƃ��ł��悤�B";
		mes "�܂��͒b�B��ς�ŎQ����B";
		close;
	}
	mes "[�d���Ȃ�߉q��]";
	mes "�M�a�قǂ̍��̎҂ł����";
	mes "���̏����錋�E��";
	mes "���Ȃ��ʂ邱�Ƃ��ł��悤�B";
	mes "�u^0000ff�v�����e���[���i�X�сj^000000�v�֐i�ނȂ�";
	mes "�G�z�Ȃ���َ҂��ē��������B";
	next;
	switch(select("�X�тɌ�����","���̏�ɗ��܂�")) {
	case 1:
		mes "[�d���Ȃ�߉q��]";
		mes "�ł́A�Q��܂��傤���B";
		mes "���̗́A�����ɐU�����B";
		close2;
		warp "pab_dun09.gat",219,225;
		end;
	default:
		mes "[�d���Ȃ�߉q��]";
		mes "���m�B";
		mes "�M�a���]�܂��Ȃ�";
		mes "���ł��ē��������܂��傤�B";
		close;
	}
}

// �v�����e���[���i�X�сj=> �v�����e���[���i�I�v�̋u�j
pab_dun09.gat,222,230,0	warp	#warp_pab_dun09_01	2,2,pab_castle.gat,268,229

// �v�����e���[���i�X�сj=> �v�����e���[���i���J��j
pab_dun09.gat,31,135,0	warp	#warp_pab_dun09_02	2,2,pab_dun02.gat,213,47

//============================================================
// �v�����e���[���i�k�J�j
//------------------------------------------------------------
// ����NPC
pab_castle.gat,290,247,4	script	�]���Ȃ�߉q��#pab_cast	413,{
	if(BaseLevel < 150) {
		mes "[�]���Ȃ�߉q��]";
		mes "�\���󂠂�܂���A�`���җl�B";
		mes "���̐�͑�ϊ댯�ł��̂�";
		mes "�n���̖`���җl�łȂ����";
		mes "����Ȃ����E�������Ă���܂��B";
		next;
		mes "[�]���Ȃ�߉q��]";
		mes "�����ł��ˁc�c";
		mes "^ff0000BaseLv��150�ȏ�^000000�ł����";
		mes "���E����Ȃ��ʂ��͂��ł��B";
		mes "���̎�������Ή��߂�";
		mes "���z�����������B";
		close;
	}
	mes "[�]���Ȃ�߉q��]";
	mes "���҂����Ă���܂����B";
	mes "�M���l�̂悤�ȏn���̖`���҂ł����";
	mes "���S���Ĉē��ł��܂��B";
	mes "���̐�ɂ���u^0000ff�v�����e���[���i�k�J�j^000000�v��";
	mes "�������܂����H";
	next;
	switch(select("�k�J�Ɍ�����","���̏�ɗ��܂�")) {
	case 1:
		mes "[�]���Ȃ�߉q��]";
		mes "���m�������܂����B";
		mes "�������ē��������܂��B";
		mes "�����A�Q��܂��傤�B";
		close2;
		warp "pab_dun10.gat",95,25;
		end;
	default:
		mes "[�]���Ȃ�߉q��]";
		mes "���m�������܂����B";
		mes "�������̐�ɐi�܂��̂ł����";
		mes "�������ē��������܂��傤�B";
		close;
	}
}

// �v�����e���[���i�k�J�j=> �v�����e���[���i�I�v�̋u�j
pab_dun10.gat,96,17,0	warp	#warp_pab_dun10_01	2,2,pab_castle.gat,290,239

// �v�����e���[���i�k�J�j=> �v�����e���[���i���s�X�n�j
pab_dun10.gat,96,176,0	warp	#warp_pab_dun10_02	2,2,pab_dun04.gat,96,16

//============================================================
// �v�����e���[���i�����j
//------------------------------------------------------------
// ����NPC
pab_castle.gat,271,251,5	script	�Е����X����߉q��#pab_	470,{
	if(BaseLevel < 170) {
		mes "[�Е����X����߉q��]";
		mes "���̐�͖����̑��A�Ɖ�����";
		mes "����ւƑ������ł���B";
		mes "�����ǂ��̐i����h������";
		mes "�P�l�̂��͂Ō��E�𒣂��Ă���B";
		next;
		mes "[�Е����X����߉q��]";
		mes "����ւ̓��͌�����";
		mes "�����Ȗ����ǂ����҂��\���Ă���B";
		mes "����ł����A���̓��ɒ��ނƉ]���Ȃ�";
		mes "^ff0000BaseLv��170�ȏ�^000000�ɂ��Ă���̂��B";
		mes "���r��ς񂾂�A�܂����邪�ǂ��B";
		close;
	}
	mes "[�Е����X����߉q��]";
	mes "���̐�͖����̑��A�Ɖ�����";
	mes "����ւƑ������ł���B";
	mes "���͌������A�����Ȗ����ǂ���";
	mes "�҂��\���Ă���B";
	next;
	mes "[�Е����X����߉q��]";
	mes "�������̗E�m������";
	mes "�U���čs������̓��ł���B";
	mes "����ł����A���̓��ɒ��ނƉ]���Ȃ�";
	mes "�����ӔC�������Ĉē����悤�B";
	next;
	switch(select("�����Ɍ�����","���̏�ɗ��܂�")) {
	case 1:
		mes "[�Е����X����߉q��]";
		mes "���̊�c�c";
		mes "���łɊo��͌��܂��Ă������B";
		mes "�Ȃ�Ή����������Ƃ͂Ȃ��B";
		mes "�ł́A�Q�낤�B";
		close2;
		warp "pab_dun11.gat",307,44;
		end;
	default:
		mes "[�Е����X����߉q��]";
		mes "���̓���ʂ�A����Ɍ�������";
		mes "�݂��݂������̂Ă�悤�Ȃ��́B";
		mes "�ނ����A�܂��E�C�ł��낤�B";
		close;
	}
}

// �v�����e���[���i�����j=> �v�����e���[���i���A�j
pab_dun11.gat,233,334,0	warp	#warp_pab_dun11_01	2,2,pab_dun12.gat,294,257

// �v�����e���[���i�����j=> �v�����e���[���i�I�v�̋u�j
pab_dun11.gat,307,39,0	warp	#warp_pab_dun11_02	2,2,pab_castle.gat,276,247

//============================================================
// �v�����e���[���i���A�j
//------------------------------------------------------------
// ����NPC
pab_base01.gat,344,64,1	script	�􂯖�#pab_base01	550,{
	mes "�]�傫�ȋT�􂩂�";
	mes "�@���яL������������";
	mes "�@����Ă���]";
	next;
	if(select("�����l����","�􂯖ڂɔ�э���") == ) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	if(BaseLevel < 170) {
		mes "[�H�H�H�H]";
		mes "���E�ɂāA�͂Ȃ��҂̐N�����ւ���B";
		mes "�@";
		mes "^FF0000BaseLv��170�ȏ�^000000�c�c";
		mes "���̋�������ɓ��ꂽ�Ȃ�";
		mes "����W������͖̂����Ȃ�ł��낤�B";
		close;
	}
	warp "pab_dun12.gat",33,384;
	end;
OnInit:
	initnpctimer;
	end;
OnTimer5000:
	initnpctimer;
	misceffect 6;
	end;
}

// �v�����e���[���i���A�j�A��NPC
pab_dun12.gat,29,387,0	warp	#warp_pab_dun12_01	2,2,pab_base01.gat,338,75

// �v�����e���[���i���A�j���[�v�����N

// �v�����e���[���i���A�j=> �v�����e���[���i�����j
pab_dun12.gat,278,257,0	warp	#warp_pab_dun12_02	3,3,pab_dun11.gat,233,329

// �v�����e���[���i���A�j=> �[���̎�����
pab_dun12.gat,181,45,0	warp	#warp_pab_dun12_03	3,3,pab_alter.gat,66,16

pab_dun12.gat,311,257,0	warp	#warp_pab_dun12_001	3,3,pab_dun12.gat,170,257

// �v�����e���[���i���A�j=> �U����n
pab_dun12.gat,164,257,0	warp	#warp_pab_dun12_002	3,3,pab_base01.gat,337,76

pab_dun12.gat,197,257,0	warp	#warp_pab_dun12_003	3,3,pab_dun12.gat,360,181
pab_dun12.gat,354,181,0	warp	#warp_pab_dun12_004	3,3,pab_dun12.gat,191,257
pab_dun12.gat,387,181,0	warp	#warp_pab_dun12_005	3,3,pab_dun12.gat,131,333
pab_dun12.gat,126,333,0	warp	#warp_pab_dun12_006	3,3,pab_dun12.gat,381,181
pab_dun12.gat,159,333,0	warp	#warp_pab_dun12_007	3,3,pab_dun12.gat,360,143
pab_dun12.gat,354,143,0	warp	#warp_pab_dun12_008	3,3,pab_dun12.gat,154,333
pab_dun12.gat,387,143,0	warp	#warp_pab_dun12_009	3,3,pab_dun12.gat,94,181
pab_dun12.gat,88,181,0	warp	#warp_pab_dun12_010	3,3,pab_dun12.gat,381,143
pab_dun12.gat,121,181,0	warp	#warp_pab_dun12_011	3,3,pab_dun12.gat,284,295
pab_dun12.gat,278,295,0	warp	#warp_pab_dun12_012	3,3,pab_dun12.gat,115,181
pab_dun12.gat,311,295,0	warp	#warp_pab_dun12_013	3,3,pab_dun12.gat,132,67
pab_dun12.gat,126,67,0	warp	#warp_pab_dun12_014	3,3,pab_dun12.gat,305,295
pab_dun12.gat,159,67,0	warp	#warp_pab_dun12_015	3,3,pab_dun12.gat,94,143
pab_dun12.gat,88,143,0	warp	#warp_pab_dun12_016	3,3,pab_dun12.gat,154,67
pab_dun12.gat,121,143,0	warp	#warp_pab_dun12_017	3,3,pab_dun12.gat,284,372
pab_dun12.gat,278,372,0	warp	#warp_pab_dun12_018	3,3,pab_dun12.gat,115,143
pab_dun12.gat,311,372,0	warp	#warp_pab_dun12_019	3,3,pab_dun12.gat,246,219
pab_dun12.gat,240,219,0	warp	#warp_pab_dun12_020	3,3,pab_dun12.gat,305,372
pab_dun12.gat,273,219,0	warp	#warp_pab_dun12_021	3,3,pab_dun12.gat,55,219
pab_dun12.gat,50,219,0	warp	#warp_pab_dun12_022	3,3,pab_dun12.gat,267,219
pab_dun12.gat,83,219,0	warp	#warp_pab_dun12_023	3,3,pab_dun12.gat,56,295
pab_dun12.gat,50,295,0	warp	#warp_pab_dun12_024	3,3,pab_dun12.gat,78,219
pab_dun12.gat,66,282,0	warp	#warp_pab_dun12_025	3,3,pab_dun12.gat,65,191
pab_dun12.gat,66,197,0	warp	#warp_pab_dun12_026	3,3,pab_dun12.gat,66,287
pab_dun12.gat,66,168,0	warp	#warp_pab_dun12_027	3,3,pab_dun12.gat,66,381
pab_dun12.gat,66,387,0	warp	#warp_pab_dun12_028	3,3,pab_dun12.gat,66,172
pab_dun12.gat,66,358,0	warp	#warp_pab_dun12_029	3,3,pab_dun12.gat,218,153
pab_dun12.gat,218,159,0	warp	#warp_pab_dun12_030	3,3,pab_dun12.gat,66,362
pab_dun12.gat,218,130,0	warp	#warp_pab_dun12_031	3,3,pab_dun12.gat,370,117
pab_dun12.gat,370,121,0	warp	#warp_pab_dun12_032	3,3,pab_dun12.gat,218,134
pab_dun12.gat,370,92,0	warp	#warp_pab_dun12_033	3,3,pab_dun12.gat,332,267
pab_dun12.gat,332,273,0	warp	#warp_pab_dun12_034	3,3,pab_dun12.gat,370,96
pab_dun12.gat,332,244,0	warp	#warp_pab_dun12_035	3,3,pab_dun12.gat,294,154
pab_dun12.gat,294,159,0	warp	#warp_pab_dun12_036	3,3,pab_dun12.gat,332,248
pab_dun12.gat,294,130,0	warp	#warp_pab_dun12_037	3,3,pab_dun12.gat,332,306
pab_dun12.gat,332,311,0	warp	#warp_pab_dun12_038	3,3,pab_dun12.gat,294,134
pab_dun12.gat,332,282,0	warp	#warp_pab_dun12_039	3,3,pab_dun12.gat,294,191
pab_dun12.gat,294,197,0	warp	#warp_pab_dun12_040	3,3,pab_dun12.gat,332,286
pab_dun12.gat,294,168,0	warp	#warp_pab_dun12_041	3,3,pab_dun12.gat,66,343
pab_dun12.gat,66,349,0	warp	#warp_pab_dun12_042	3,3,pab_dun12.gat,294,172
pab_dun12.gat,66,320,0	warp	#warp_pab_dun12_043	3,3,pab_dun12.gat,104,381
pab_dun12.gat,104,387,0	warp	#warp_pab_dun12_044	3,3,pab_dun12.gat,66,324
pab_dun12.gat,294,16,0	warp	#warp_pab_dun12_045	3,3,pab_dun12.gat,351,77
pab_dun12.gat,351,83,0	warp	#warp_pab_dun12_046	3,3,pab_dun12.gat,294,20
pab_dun12.gat,351,16,0	warp	#warp_pab_dun12_047	3,3,pab_dun12.gat,142,229
pab_dun12.gat,142,235,0	warp	#warp_pab_dun12_048	3,3,pab_dun12.gat,351,20
pab_dun12.gat,142,320,0	warp	#warp_pab_dun12_049	3,3,pab_dun12.gat,104,77
pab_dun12.gat,104,83,0	warp	#warp_pab_dun12_050	3,3,pab_dun12.gat,142,324
pab_dun12.gat,104,54,0	warp	#warp_pab_dun12_051	3,3,pab_dun12.gat,142,191
pab_dun12.gat,142,197,0	warp	#warp_pab_dun12_052	3,3,pab_dun12.gat,104,58
pab_dun12.gat,142,168,0	warp	#warp_pab_dun12_053	3,3,pab_dun12.gat,180,305
pab_dun12.gat,180,311,0	warp	#warp_pab_dun12_054	3,3,pab_dun12.gat,142,172
pab_dun12.gat,180,282,0	warp	#warp_pab_dun12_055	3,3,pab_dun12.gat,294,229
pab_dun12.gat,294,235,0	warp	#warp_pab_dun12_056	3,3,pab_dun12.gat,180,286
pab_dun12.gat,104,168,0	warp	#warp_pab_dun12_057	3,3,pab_dun12.gat,28,343
pab_dun12.gat,28,349,0	warp	#warp_pab_dun12_058	3,3,pab_dun12.gat,104,172
pab_dun12.gat,28,320,0	warp	#warp_pab_dun12_059	3,3,pab_dun12.gat,180,229
pab_dun12.gat,180,235,0	warp	#warp_pab_dun12_060	3,3,pab_dun12.gat,28,324
pab_dun12.gat,197,219,0	warp	#warp_pab_dun12_061	3,3,pab_dun12.gat,170,143
pab_dun12.gat,164,143,0	warp	#warp_pab_dun12_062	3,3,pab_dun12.gat,193,219
pab_dun12.gat,197,143,0	warp	#warp_pab_dun12_063	3,3,pab_dun12.gat,170,29
pab_dun12.gat,164,29,0	warp	#warp_pab_dun12_064	3,3,pab_dun12.gat,191,143
pab_dun12.gat,197,29,0	warp	#warp_pab_dun12_065	3,3,pab_dun12.gat,132,105
pab_dun12.gat,126,105,0	warp	#warp_pab_dun12_066	3,3,pab_dun12.gat,191,29
pab_dun12.gat,159,105,0	warp	#warp_pab_dun12_067	3,3,pab_dun12.gat,18,295
pab_dun12.gat,12,295,0	warp	#warp_pab_dun12_068	3,3,pab_dun12.gat,151,105
pab_dun12.gat,45,295,0	warp	#warp_pab_dun12_069	3,3,pab_dun12.gat,283,67
pab_dun12.gat,278,67,0	warp	#warp_pab_dun12_070	3,3,pab_dun12.gat,39,295
pab_dun12.gat,256,206,0	warp	#warp_pab_dun12_071	3,3,pab_dun12.gat,332,115
pab_dun12.gat,332,121,0	warp	#warp_pab_dun12_072	3,3,pab_dun12.gat,256,210
pab_dun12.gat,332,92,0	warp	#warp_pab_dun12_073	3,3,pab_dun12.gat,294,78
pab_dun12.gat,294,83,0	warp	#warp_pab_dun12_074	3,3,pab_dun12.gat,332,96
pab_dun12.gat,294,54,0	warp	#warp_pab_dun12_075	3,3,pab_dun12.gat,256,191
pab_dun12.gat,256,197,0	warp	#warp_pab_dun12_076	3,3,pab_dun12.gat,294,58
pab_dun12.gat,256,168,0	warp	#warp_pab_dun12_077	3,3,pab_dun12.gat,180,382
pab_dun12.gat,180,387,0	warp	#warp_pab_dun12_078	3,3,pab_dun12.gat,256,172
pab_dun12.gat,142,206,0	warp	#warp_pab_dun12_079	3,3,pab_dun12.gat,142,305
pab_dun12.gat,142,311,0	warp	#warp_pab_dun12_080	3,3,pab_dun12.gat,142,210
pab_dun12.gat,159,295,0	warp	#warp_pab_dun12_081	3,3,pab_dun12.gat,170,181
pab_dun12.gat,164,181,0	warp	#warp_pab_dun12_082	3,3,pab_dun12.gat,153,295
pab_dun12.gat,197,181,0	warp	#warp_pab_dun12_083	3,3,pab_dun12.gat,284,219
pab_dun12.gat,278,219,0	warp	#warp_pab_dun12_084	3,3,pab_dun12.gat,192,181
pab_dun12.gat,311,219,0	warp	#warp_pab_dun12_085	3,3,pab_dun12.gat,322,143
pab_dun12.gat,316,143,0	warp	#warp_pab_dun12_086	3,3,pab_dun12.gat,305,219
pab_dun12.gat,349,143,0	warp	#warp_pab_dun12_087	3,3,pab_dun12.gat,132,29
pab_dun12.gat,126,29,0	warp	#warp_pab_dun12_088	3,3,pab_dun12.gat,343,143
pab_dun12.gat,159,29,0	warp	#warp_pab_dun12_089	3,3,pab_dun12.gat,170,333
pab_dun12.gat,164,333,0	warp	#warp_pab_dun12_090	3,3,pab_dun12.gat,153,29
pab_dun12.gat,197,333,0	warp	#warp_pab_dun12_091	3,3,pab_dun12.gat,18,29
pab_dun12.gat,12,29,0	warp	#warp_pab_dun12_092	3,3,pab_dun12.gat,191,333
pab_dun12.gat,45,29,0	warp	#warp_pab_dun12_093	3,3,pab_dun12.gat,18,219
pab_dun12.gat,12,219,0	warp	#warp_pab_dun12_094	3,3,pab_dun12.gat,39,29
pab_dun12.gat,45,219,0	warp	#warp_pab_dun12_095	3,3,pab_dun12.gat,208,67
pab_dun12.gat,202,67,0	warp	#warp_pab_dun12_096	3,3,pab_dun12.gat,39,219
pab_dun12.gat,235,67,0	warp	#warp_pab_dun12_097	3,3,pab_dun12.gat,170,372
pab_dun12.gat,164,372,0	warp	#warp_pab_dun12_098	3,3,pab_dun12.gat,229,67
pab_dun12.gat,180,168,0	warp	#warp_pab_dun12_099	3,3,pab_dun12.gat,370,305
pab_dun12.gat,370,311,0	warp	#warp_pab_dun12_100	3,3,pab_dun12.gat,180,173
pab_dun12.gat,370,282,0	warp	#warp_pab_dun12_101	3,3,pab_dun12.gat,28,115
pab_dun12.gat,28,121,0	warp	#warp_pab_dun12_102	3,3,pab_dun12.gat,370,286
pab_dun12.gat,218,54,0	warp	#warp_pab_dun12_103	3,3,pab_dun12.gat,142,153
pab_dun12.gat,142,159,0	warp	#warp_pab_dun12_104	3,3,pab_dun12.gat,218,58
pab_dun12.gat,142,130,0	warp	#warp_pab_dun12_105	3,3,pab_dun12.gat,218,39
pab_dun12.gat,218,45,0	warp	#warp_pab_dun12_106	3,3,pab_dun12.gat,142,134
pab_dun12.gat,45,105,0	warp	#warp_pab_dun12_107	3,3,pab_dun12.gat,322,181
pab_dun12.gat,316,181,0	warp	#warp_pab_dun12_108	3,3,pab_dun12.gat,39,105
pab_dun12.gat,349,181,0	warp	#warp_pab_dun12_109	3,3,pab_dun12.gat,94,29	139
pab_dun12.gat,88,29,0	warp	#warp_pab_dun12_110	3,3,pab_dun12.gat,344,181
pab_dun12.gat,121,29,0	warp	#warp_pab_dun12_111	3,3,pab_dun12.gat,360,333
pab_dun12.gat,354,333,0	warp	#warp_pab_dun12_112	3,3,pab_dun12.gat,115,29
pab_dun12.gat,387,333,0	warp	#warp_pab_dun12_113	3,3,pab_dun12.gat,246,67
pab_dun12.gat,240,67,0	warp	#warp_pab_dun12_114	3,3,pab_dun12.gat,381,333
pab_dun12.gat,273,67,0	warp	#warp_pab_dun12_115	3,3,pab_dun12.gat,56,257
pab_dun12.gat,50,257,0	warp	#warp_pab_dun12_116	3,3,pab_dun12.gat,267,67
pab_dun12.gat,83,257,0	warp	#warp_pab_dun12_117	3,3,pab_dun12.gat,94,105
pab_dun12.gat,88,105,0	warp	#warp_pab_dun12_118	3,3,pab_dun12.gat,77,257
pab_dun12.gat,121,105,0	warp	#warp_pab_dun12_119	3,3,pab_dun12.gat,208,29
pab_dun12.gat,202,29,0	warp	#warp_pab_dun12_120	3,3,pab_dun12.gat,115,105
pab_dun12.gat,235,29,0	warp	#warp_pab_dun12_121	3,3,pab_dun12.gat,94,295
pab_dun12.gat,88,295,0	warp	#warp_pab_dun12_122	3,3,pab_dun12.gat,229,29
pab_dun12.gat,104,92,0	warp	#warp_pab_dun12_123	3,3,pab_dun12.gat,218,343
pab_dun12.gat,218,349,0	warp	#warp_pab_dun12_124	3,3,pab_dun12.gat,104,96
pab_dun12.gat,218,320,0	warp	#warp_pab_dun12_125	3,3,pab_dun12.gat,256,39
pab_dun12.gat,256,45,0	warp	#warp_pab_dun12_126	3,3,pab_dun12.gat,218,324
pab_dun12.gat,255,16,0	warp	#warp_pab_dun12_127	3,3,pab_dun12.gat,332,381
pab_dun12.gat,332,387,0	warp	#warp_pab_dun12_128	3,3,pab_dun12.gat,256,20
pab_dun12.gat,104,282,0	warp	#warp_pab_dun12_129	3,3,pab_dun12.gat,66,153
pab_dun12.gat,66,159,0	warp	#warp_pab_dun12_130	3,3,pab_dun12.gat,104,286
pab_dun12.gat,66,130,0	warp	#warp_pab_dun12_131	3,3,pab_dun12.gat,218,115
pab_dun12.gat,218,121,0	warp	#warp_pab_dun12_132	3,3,pab_dun12.gat,66,134
pab_dun12.gat,218,92,0	warp	#warp_pab_dun12_133	3,3,pab_dun12.gat,104,229
pab_dun12.gat,104,235,0	warp	#warp_pab_dun12_134	3,3,pab_dun12.gat,218,96
pab_dun12.gat,387,257,0	warp	#warp_pab_dun12_135	3,3,pab_dun12.gat,322,219
pab_dun12.gat,316,219,0	warp	#warp_pab_dun12_136	3,3,pab_dun12.gat,382,257
pab_dun12.gat,349,219,0	warp	#warp_pab_dun12_137	3,3,pab_dun12.gat,56,67	167
pab_dun12.gat,50,67,0	warp	#warp_pab_dun12_138	3,3,pab_dun12.gat,343,219
pab_dun12.gat,83,67,0	warp	#warp_pab_dun12_139	3,3,pab_dun12.gat,208,257
pab_dun12.gat,202,257,0	warp	#warp_pab_dun12_140	3,3,pab_dun12.gat,77,67	170
pab_dun12.gat,235,257,0	warp	#warp_pab_dun12_141	3,3,pab_dun12.gat,246,105
pab_dun12.gat,240,105,0	warp	#warp_pab_dun12_142	3,3,pab_dun12.gat,229,257
pab_dun12.gat,273,105,0	warp	#warp_pab_dun12_143	3,3,pab_dun12.gat,208,181
pab_dun12.gat,202,181,0	warp	#warp_pab_dun12_144	3,3,pab_dun12.gat,267,105
pab_dun12.gat,235,181,0	warp	#warp_pab_dun12_145	3,3,pab_dun12.gat,246,29
pab_dun12.gat,240,29,0	warp	#warp_pab_dun12_146	3,3,pab_dun12.gat,229,181
pab_dun12.gat,349,372,0	warp	#warp_pab_dun12_147	3,3,pab_dun12.gat,246,295
pab_dun12.gat,240,295,0	warp	#warp_pab_dun12_148	3,3,pab_dun12.gat,345,372
pab_dun12.gat,273,295,0	warp	#warp_pab_dun12_149	3,3,pab_dun12.gat,94,219
pab_dun12.gat,88,219,0	warp	#warp_pab_dun12_150	3,3,pab_dun12.gat,267,295
pab_dun12.gat,121,219,0	warp	#warp_pab_dun12_151	3,3,pab_dun12.gat,246,257
pab_dun12.gat,240,257,0	warp	#warp_pab_dun12_152	3,3,pab_dun12.gat,115,219
pab_dun12.gat,273,257,0	warp	#warp_pab_dun12_153	3,3,pab_dun12.gat,56,333
pab_dun12.gat,50,333,0	warp	#warp_pab_dun12_154	3,3,pab_dun12.gat,267,257
pab_dun12.gat,370,244,0	warp	#warp_pab_dun12_155	3,3,pab_dun12.gat,104,267
pab_dun12.gat,104,273,0	warp	#warp_pab_dun12_156	3,3,pab_dun12.gat,370,248
pab_dun12.gat,104,244,0	warp	#warp_pab_dun12_157	3,3,pab_dun12.gat,256,343
pab_dun12.gat,256,349,0	warp	#warp_pab_dun12_158	3,3,pab_dun12.gat,104,248
pab_dun12.gat,256,319,0	warp	#warp_pab_dun12_159	3,3,pab_dun12.gat,66,115
pab_dun12.gat,66,121,0	warp	#warp_pab_dun12_160	3,3,pab_dun12.gat,256,325
pab_dun12.gat,66,92,0	warp	#warp_pab_dun12_161	3,3,pab_dun12.gat,256,382
pab_dun12.gat,256,387,0	warp	#warp_pab_dun12_162	3,3,pab_dun12.gat,66,96	192
pab_dun12.gat,256,358,0	warp	#warp_pab_dun12_163	3,3,pab_dun12.gat,142,267
pab_dun12.gat,142,273,0	warp	#warp_pab_dun12_164	3,3,pab_dun12.gat,256,362
pab_dun12.gat,142,244,0	warp	#warp_pab_dun12_165	3,3,pab_dun12.gat,370,229
pab_dun12.gat,370,235,0	warp	#warp_pab_dun12_166	3,3,pab_dun12.gat,142,248
pab_dun12.gat,370,206,0	warp	#warp_pab_dun12_167	3,3,pab_dun12.gat,218,381
pab_dun12.gat,218,387,0	warp	#warp_pab_dun12_168	3,3,pab_dun12.gat,370,210
pab_dun12.gat,256,281,0	warp	#warp_pab_dun12_169	3,3,pab_dun12.gat,218,229
pab_dun12.gat,218,235,0	warp	#warp_pab_dun12_170	3,3,pab_dun12.gat,256,285
pab_dun12.gat,218,206,0	warp	#warp_pab_dun12_171	3,3,pab_dun12.gat,66,40	201
pab_dun12.gat,66,45,0	warp	#warp_pab_dun12_172	3,3,pab_dun12.gat,218,210
pab_dun12.gat,66,16,0	warp	#warp_pab_dun12_173	3,3,pab_dun12.gat,142,381
pab_dun12.gat,142,387,0	warp	#warp_pab_dun12_174	3,3,pab_dun12.gat,66,20	204
pab_dun12.gat,294,320,0	warp	#warp_pab_dun12_175	3,3,pab_dun12.gat,218,305
pab_dun12.gat,218,311,0	warp	#warp_pab_dun12_176	3,3,pab_dun12.gat,294,324
pab_dun12.gat,218,282,0	warp	#warp_pab_dun12_177	3,3,pab_dun12.gat,180,78
pab_dun12.gat,180,83,0	warp	#warp_pab_dun12_178	3,3,pab_dun12.gat,218,286
pab_dun12.gat,273,372,0	warp	#warp_pab_dun12_179	3,3,pab_dun12.gat,284,105
pab_dun12.gat,278,105,0	warp	#warp_pab_dun12_180	3,3,pab_dun12.gat,267,372
pab_dun12.gat,311,105,0	warp	#warp_pab_dun12_181	3,3,pab_dun12.gat,360,372
pab_dun12.gat,354,372,0	warp	#warp_pab_dun12_182	3,3,pab_dun12.gat,305,105
pab_dun12.gat,387,372,0	warp	#warp_pab_dun12_183	3,3,pab_dun12.gat,18,143
pab_dun12.gat,12,143,0	warp	#warp_pab_dun12_184	3,3,pab_dun12.gat,381,372
pab_dun12.gat,45,143,0	warp	#warp_pab_dun12_185	3,3,pab_dun12.gat,18,181
pab_dun12.gat,12,181,0	warp	#warp_pab_dun12_186	3,3,pab_dun12.gat,39,143
pab_dun12.gat,45,181,0	warp	#warp_pab_dun12_187	3,3,pab_dun12.gat,169,67
pab_dun12.gat,164,67,0	warp	#warp_pab_dun12_188	3,3,pab_dun12.gat,39,181
pab_dun12.gat,197,67,0	warp	#warp_pab_dun12_189	3,3,pab_dun12.gat,170,105
pab_dun12.gat,164,105,0	warp	#warp_pab_dun12_190	3,3,pab_dun12.gat,185,67
pab_dun12.gat,197,105,0	warp	#warp_pab_dun12_191	3,3,pab_dun12.gat,18,257
pab_dun12.gat,12,257,0	warp	#warp_pab_dun12_192	3,3,pab_dun12.gat,191,105
pab_dun12.gat,45,257,0	warp	#warp_pab_dun12_193	3,3,pab_dun12.gat,132,372
pab_dun12.gat,126,372,0	warp	#warp_pab_dun12_194	3,3,pab_dun12.gat,39,257
pab_dun12.gat,387,48,0	warp	#warp_pab_dun12_195	3,3,pab_dun12.gat,94,333
pab_dun12.gat,88,333,0	warp	#warp_pab_dun12_196	3,3,pab_dun12.gat,381,48
pab_dun12.gat,121,333,0	warp	#warp_pab_dun12_197	3,3,pab_dun12.gat,322,333
pab_dun12.gat,316,333,0	warp	#warp_pab_dun12_198	3,3,pab_dun12.gat,115,333
pab_dun12.gat,349,333,0	warp	#warp_pab_dun12_199	3,3,pab_dun12.gat,284,333
pab_dun12.gat,278,333,0	warp	#warp_pab_dun12_200	3,3,pab_dun12.gat,343,333
pab_dun12.gat,235,372,0	warp	#warp_pab_dun12_201	3,3,pab_dun12.gat,246,143
pab_dun12.gat,240,143,0	warp	#warp_pab_dun12_202	3,3,pab_dun12.gat,229,372
pab_dun12.gat,273,143,0	warp	#warp_pab_dun12_203	3,3,pab_dun12.gat,18,372
pab_dun12.gat,12,372,0	warp	#warp_pab_dun12_204	3,3,pab_dun12.gat,267,143
pab_dun12.gat,104,358,0	warp	#warp_pab_dun12_205	3,3,pab_dun12.gat,294,39
pab_dun12.gat,294,45,0	warp	#warp_pab_dun12_206	3,3,pab_dun12.gat,104,364
