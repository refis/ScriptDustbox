//= Auriga Script ==============================================================
// Ragnarok Online Illusion of Labyrinth Quest Script	by refis
//= Registry ===================================================================
// IL_MAZE_QUE -> 0�`8
//==============================================================================

//------------------------------------------------------------
// prt_mz03_i.gat
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃o�t�H���b�g.Jr	20525,25,5000,0,0
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃n���^�[�t���C	20527,15,5000,0,0
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃L���[�}���e�B�X	20530,30,30000,0,0
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃}���e�B�X		20528,10,5000,0,0
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃|�|����			20531,25,5000,0,0
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃T�C�h���C���_�[	20526,25,5000,0,0
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃X�e�����[��		20532,25,5000,0,0
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃S�[�X�g�����O	20529,1,3600000,1800000,1
prt_mz03_i.gat,0,0,0,0	monster	���ׂ̃o�t�H���b�g		20520,1,3600000,7200000,1

prt_maze01.gat,91,22,4	script	����������#ILU_001	10042,{
	mes "�]���������͋C�̕Y������������]";
	mes "�@�����ɐԂ������Ă���]";
	next;
	if(select("�����֓���","��������") == 2) {
		mes "�]���̏���������]";
		close;
	}
	mes "�]���������͋C�̕Y��������i�񂾁]";
	if(IL_MAZE_QUE == 0) {
		setquest 12481;
		set IL_MAZE_QUE,1;
	}
	close2;
	if(IL_MAZE_QUE == 8)
		warp "prt_mz01_i.gat",102,21;
	else
		warp "prt_mz01_q.gat",102,21;
	end;
}

prt_mz01_q.gat,103,22,0	script	#iol000	139,10,10,{
	switch(IL_MAZE_QUE) {
	case 1:
	case 2:
		cloakoffnpc "�c�񂾗􂯖�#1";
		misceffect 513,"�c�񂾗􂯖�#1";
		misceffect 74,"�c�񂾗􂯖�#1";
		cloakoffnpc "�C���[�l#1";
		cloakonnpc "�G�X�������_#1";
		cloakonnpc "�A���h���A#1";
		cloakonnpc "�A�l�X#1";
		cloakonnpc "�V���o�m#1";
		cloakonnpc "�Z���V�A#1";
		end;
	case 3:
		cloakoffnpc "�c�񂾗􂯖�#1";
		misceffect 513,"�c�񂾗􂯖�#1";
		misceffect 74,"�c�񂾗􂯖�#1";
		cloakoffnpc "�C���[�l#1";
		cloakoffnpc "�G�X�������_#1";
		cloakonnpc "�A���h���A#1";
		cloakonnpc "�A�l�X#1";
		cloakonnpc "�V���o�m#1";
		cloakonnpc "�Z���V�A#1";
		end;
	case 4:
	case 5:
		cloakoffnpc "�c�񂾗􂯖�#1";
		misceffect 513,"�c�񂾗􂯖�#1";
		misceffect 74,"�c�񂾗􂯖�#1";
		cloakonnpc "�C���[�l#1";
		cloakoffnpc "�G�X�������_#1";
		cloakonnpc "�A���h���A#1";
		cloakonnpc "�A�l�X#1";
		cloakonnpc "�V���o�m#1";
		cloakonnpc "�Z���V�A#1";
		end;
	case 6:
	case 7:
		cloakoffnpc "�c�񂾗􂯖�#1";
		misceffect 513,"�c�񂾗􂯖�#1";
		misceffect 74,"�c�񂾗􂯖�#1";
		cloakonnpc "�C���[�l#1";
		cloakonnpc "�G�X�������_#1";
		cloakoffnpc "�A���h���A#1";
		cloakoffnpc "�A�l�X#1";
		cloakoffnpc "�V���o�m#1";
		cloakoffnpc "�Z���V�A#1";
		end;
	}
}

prt_mz01_q.gat,108,22,5	script	�c�񂾗􂯖�#1	844,{
	switch(IL_MAZE_QUE) {
	case 3:
	case 5:
		mes "-�G�X�������_�ɘb�������悤-";
		close;
	case 4:
		mes "�]�c�񂾗􂯖ڂ̌������ɁA";
		mes "�@������Ă���悤��";
		mes "�@����݂̖������{�̎p���L�����Ă���]";
		next;
		if(select("�􂯖ڂ̌������֍s��","���Ȃ��������Ƃɂ���") == 2) {
			mes "^0000ff�]�D��S�͔L�����E���Ƃ����B";
			mes "�@�Â��Ɉ����Ԃ����]^000000";
			close;
		}
		mes "-�􂯖ڂ̌������֐i��-";
		close2;
		warp "prt_mz03_q.gat",107,102;
		end;
	case 6:
		mes "�]�A���h���A�ɘb�������悤�]";
		close;
	case 7:
		mes "�]���{�̊O�ŃG�X�������_��T�����]";
		close;
	}
	mes "�]�c�񂾗􂯖ڂ̌������ɁA";
	mes "�@������Ă���悤��";
	mes "�@����݂̖������{�̎p���L�����Ă���]";
	close;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_q.gat,99,24,5	script	�C���[�l#1	10337,10,10,{
	switch(IL_MAZE_QUE) {
	case 1:
		mes "[�C���[�l]";
		mes "���Ⴀ�I";
		mes "���݂܂���B�킽�����H�삶�Ⴀ��܂���B";
		mes "�����X�^�[�ł��Ȃ��ł�!!";
		mes "����������肶��Ȃ�������ł��I";
		next;
		mes "[�C���[�l]";
		mes "�ǂ������̕�������߂āA";
		mes "�b�𕷂��Ă��������B���肢���܂��I";
		next;
		menu "�킩��܂����B",-;
		mes "[�C���[�l]";
		mes "���肪�Ƃ��������܂��B";
		mes "�킽�����̓v�����e����";
		mes "�i�ՃM���h�ɏ������Ă���";
		mes "�C���[�l�Ɛ\���܂��B";
		mes "���c�c���̂��̎p�ɂ�";
		mes "������Ǝ������܂��āc�c�B";
		next;
		menu "����H",-;
		mes "[�C���[�l]";
		mes "�͂��c�c�B";
		mes "���͎��̓r����";
		mes "����Ă��܂��܂��āc�c�B";
		next;
		mes "[�C���[�l]";
		mes "4�l�̐V�l�̃M���h���ƈꏏ��";
		mes "�C�s����ꏊ��T���Ă���r���A";
		mes "�����̉������􂯖ڂ𔭌������̂ł����A";
		mes "�V�l�����������̂܂ܓ����Ă��܂��A";
		mes "�����ǂ��čs������S���c�c�B";
		next;
		mes "[�C���[�l]";
		mes "���肢���܂��B";
		mes "���̂��Ƃ��M���h���ɓ`���Ă��������B";
		mes "�v�����e���吹���̋߂���";
		mes "�M���h���̕�W������";
		mes "���Ă���^ff0000�G�X�������_^000000�Ƃ��������ł��B";
		next;
		mes "[�C���[�l]";
		mes "�킽�����͂�����";
		mes "�V�l�̒N�����^�悭�����c����";
		mes "�߂��ė��Ȃ����A";
		mes "�҂��Ȃ���΂����܂���̂Łc�c�B";
		next;
		if(select("�킩��܂���","�f��") == 2) {
			mes "[�C���[�l]";
			mes "��͂�A�����Ȃ��肢�������̂ł��ˁc�c�B";
			close;
		}
		mes "[�C���[�l]";
		mes "���肪�Ƃ��������܂��I";
		mes "�M���h���̈ʒu�̃����͂��n���܂��I";
		mes "�ǂ������肢���܂��I";
		next;
		if(select("�v�����e���֌�����","�Ƃǂ܂�") == 2) {
			mes "�]�v�����e���ɖ߂�O��";
			mes "�@���������ӂ���m�F���悤�]";
			chgquest 12481,12482;
			set IL_MAZE_QUE,2;
			close;
		}
		mes "�]���Ȃ��̓v�����e���Ɍ��������]";
		chgquest 12481,12482;
		set IL_MAZE_QUE,2;
		close2;
		warp "prontera.gat",212,318;
		end;
	case 2:
		mes "[�C���[�l]";
		mes "���肢���܂��B";
		mes "���̂��Ƃ��M���h���ɓ`���Ă��������B";
		mes "�v�����e���吹���̋߂���";
		mes "�M���h���̕�W������";
		mes "���Ă���^ff0000�G�X�������_^000000�Ƃ��������ł��B";
		next;
		if(select("�v�����e���֌�����","�Ƃǂ܂�") == 2) {
			mes "�]�v�����e���ɖ߂�O��";
			mes "�@���������ӂ���m�F���悤�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e���Ɍ��������]";
		close2;
		warp "prontera.gat",212,318;
		end;
	case 3:
		mes "[�C���[�l]";
		mes "�����A�킽�����̖S�[��";
		mes "�������Ղ��c���Ă��Ȃ��݂����ł��c�c�B";
		next;
		mes "[�G�X�������_]";
		mes "�܂��A�K����쐹���̓M���h��";
		mes "�ۊǂ��Ă��邩��A";
		mes "�����͂Ȃ�Ƃ��Ȃ�ł��傤�B";
		mes "������Ƃ����͂����邯�ǂˁB";
		next;
		mes "[�C���[�l]";
		mes "���߂�Ȃ��������c�c�B";
		close;
	case 4:
		mes "[�C���[�l]";
		mes "�킽�����͂��낻��M���h�֖߂�܂��ˁB";
		mes "�H��̂܂܂ł��Ȃ�p���������ł����c�c�B";
		close2;
		cloakonnpc "�C���[�l#1";
		end;
	}
	end;
OnTouch:
	if(IL_MAZE_QUE == 1)
		unittalk "�C���[�l : ���Ⴀ�I�@���݂܂���B�킽�����H�삶�Ⴀ��܂���B�����X�^�[�ł��Ȃ��ł�!!";
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_q.gat,105,24,3	script	�G�X�������_#1	677,{
	switch(IL_MAZE_QUE) {
	case 3:
		mes "[�G�X�������_]";
		mes "�C���[�l�I";
		mes "�����Ă΂��肢�Ȃ��ŁA";
		mes "�������肵�Ȃ����I";
		next;
		mes "[�G�X�������_]";
		mes "�K����쐹���̓M���h��";
		mes "�ۊǂ��Ă��邩��A";
		mes "�����͂Ȃ�Ƃ��Ȃ�ł��傤�B";
		mes "������Ƃ����͂����邯�ǂˁB";
		next;
		mes "[�C���[�l]";
		mes "���߂�Ȃ��������c�c�B";
		next;
		mes "[�G�X�������_]";
		mes "���̖�莙��";
		mes "�}���ŕ���������K�v������̂ŁA";
		mes "��U�M���h�֋A�点�܂��B";
		next;
		mes "[�G�X�������_]";
		mes "�{���Ɋ��ӂ������܂��B";
		mes "�����܂����Ƃ͎v���܂����A";
		mes "��������肢�����Ă�";
		mes "��낵���ł��傤���H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�G�X�������_]";
			mes "���A�����ł���ˁc�c�B";
			mes "�\���󂠂�܂���ł����c�c�B";
			mes "��͎������łǂ��ɂ����܂��B";
			close;
		}
		mes "[�G�X�������_]";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�G�X�������_]";
		mes "�C���[�l�͐́A";
		mes "��쐹���ƍ��̌_��������̂ŁA";
		mes "�����ɖ��͂Ȃ������ł����A";
		mes "�s���s���̐V�l4�l��";
		mes "�����ł͂���܂���B";
		next;
		mes "[�G�X�������_]";
		mes "�ނ�͂܂���쐹���Ƃ̌_���";
		mes "���Ă��Ȃ������̂ŁA";
		mes "�H��̎p�ɂ��Ȃ�Ȃ��̂ł��B";
		mes "�͂��c�c����܂����ˁc�c�B";
		next;
		menu "��쐹���Ƃ̌_��H",-;
		mes "[�G�X�������_]";
		mes "��쐹���Ƃ̌_��Ƃ�";
		mes "�ی��̂悤�Ȃ��̂ł��B";
		mes "�_��̋V�����s���ƁA";
		mes "���S���Ă����Ɠ��̂����S��";
		mes "�������邱�Ƃ��ł���̂ł��B";
		next;
		mes "[�G�X�������_]";
		mes "�������̃M���h��";
		mes "���E�҂݂̂ō\�����ꂽ�M���h�Ȃ̂ŁA";
		mes "���S���̂����Ȃ��Ǝv����ł��傤���A";
		mes "�ӊO�ɂ��p�ɂɋN���Ă��܂��B";
		next;
		mes "[�G�X�������_]";
		mes "�_��̋V���̓M���h���c�Ɠ�����";
		mes "�s���悤�ɂ��Ă����̂ł����A";
		mes "�����4�l�͂��̌_�񂪂܂��������̂ŁA";
		mes "���̂܂܂ł͕����ł��܂���B";
		next;
		mes "[�G�X�������_]";
		mes "�����Ȉꕔ�����ł����̂ŁA";
		mes "��̂��K�v�Ȃ̂ł��B";
		mes "�܂邲�Ƃ���Δ�p�͈����Ȃ�܂����A";
		mes "���͕���������̂��D��ł�����B";
		next;
		mes "[�G�X�������_]";
		mes "4�l�͂��̘c�񂾗􂯖ڂ�";
		mes "���������ɂ���͂��ł��B";
		mes "�����4�l�̏����܂Ƃ߂����̂ł��B";
		mes "��̂̈ꕔ�⍭�Ղ���������A";
		mes "���̏��Əƍ����Ă��������B";
		close2;
		delquest 12483;
		setquest 12479;
		setquest 12484;
		setquest 12485;
		setquest 12486;
		setquest 12487;
		set IL_MAZE_QUE,4;
		end;
	case 4:
		mes "[�G�X�������_]";
		mes "4�l�͂��̘c�񂾗􂯖ڂ�";
		mes "���������ɂ���͂��ł��B";
		mes "�����4�l�̏����܂Ƃ߂����̂ł��B";
		mes "��̂̈ꕔ�⍭�Ղ���������A";
		mes "���̏��Əƍ����Ă��������B";
		close;
	case 5:
		mes "[�G�X�������_]";
		mes "�����c�c";
		mes "���߂����Ă����̂ɁA";
		mes "�{���ɑS���������ė���";
		mes "���������܂����ˁB";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		next;
		mes "[�G�X�������_]";
		mes "��U�A�ނ�̍����Ăяo���Ă݂܂��B";
		mes "�������̕����ł�����A�v�����e������";
		mes "�����ō����Ăяo��������";
		mes "�ǂ��ł��傤�B";
		mes "�����ɗH�삪���ꂽ�肵����A";
		mes "�����������ł�����ˁB";
		next;
		mes "[�G�X�������_]";
		mes "���ꂩ��A�\���󂠂�܂���B";
		mes "���̕����̓M���h���ȊO�ɂ�";
		mes "�������ł��Ȃ��̂ł��B";
		mes "���΂炭�̊ԁA�O�ł��҂����������܂����H";
		next;
		menu "�͂�",-;
		mes "[�G�X�������_]";
		mes "���z�����肪�Ƃ��������܂��B";
		mes "����������A";
		mes "�܂�������ɂ��炵�Ă��������B";
		mes "�ł͊O�܂ł����肢�����܂��B";
		chgquest 12488,12489;
		set IL_MAZE_QUE,6;
		close2;
		warp "prt_fild01.gat",136,365;
		end;
	case 6:
		mes "[�G�X�������_]";
		mes "���z�����肪�Ƃ��������܂��B";
		mes "����������A";
		mes "�܂�������ɂ��炵�Ă��������B";
		mes "�ł͊O�܂ł����肢�����܂��B";
		close2;
		warp "prt_fild01.gat",136,365;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_q.gat,111,20,1	script	�Z���V�A#1	10316,{
	if(IL_MAZE_QUE == 7) {
		mes "[�Z���V�A]";
		mes "���ɂł��邱�Ƃ͂���܂����H";
		next;
		if(select("���ɂȂ�","�O�֑����Ă��炤") == 1) {
			mes "[�Z���V�A]";
			mes "���͂ɂȂꂸ�A�\���󂠂�܂���B";
			close;
		}
		mes "[�Z���V�A]";
		mes "�킩��܂����B";
		close2;
		warp "prt_fild01.gat",136,365;
		end;
	}
	mes "[�Z���V�A]";
	mes "�������݂͂�� ";
	mes strcharinfo(0)+"�l��";
	mes "���ӂ��Ă���܂��B";
	mes "�܂��M���h����";
	mes "^0000ff�A���h���A^000000��";
	mes "�`�����c���Ă��܂��B";
	close;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_q.gat,105,24,5	script	�A���h���A#1	10310,{
	if(IL_MAZE_QUE < 6)
		end;
	if(IL_MAZE_QUE == 7) {
		mes "[�A���h���A]";
		mes "�M���h�����߂��Ă����悤�ł��ˁB";
		mes "���{�̓���������ė��Ă��炦�܂����H";
		next;
		mes "�]���{�̓�����Ɍ��������]";
		close2;
		warp "prt_fild01.gat",141,365;
		end;
	}
	mes "[�A���h���A]";
	mes "�M���h���̃G�X�������_����";
	mes "�b�͎f���܂����B";
	mes "�l�������~���Ă������������ł���ˁB";
	next;
	menu "��U���ł��B",-;
	mes "[�A���h���A]";
	mes "�܂��܂��A����Ȃ��������B";
	mes strcharinfo(0)+"�l��";
	mes "�����Ă�������Ȃ���΁A";
	mes "���̂܂܋A���Ă���Ȃ��Ƃ���ł����B";
	mes "�{���ɂ��肪�Ƃ��������܂��B";
	next;
	menu "�G�X�������_����͂ǂ��ɁH",-;
	mes "[�A���h���A]";
	mes "���A�M���h���́A";
	mes "����������������̂������āA";
	mes "��U�M���h���Ԓn�ɖ߂�܂����B";
	mes "�܂������̖��{�̓�����";
	mes "�����ɖ߂�炵���ł��B";
	next;
	mes "[�A���h���A]";
	mes "������"+strcharinfo(0)+"�l��";
	mes "�l�����̃M���h�̋q���Ƃ���";
	mes "���������Ă��������Ȃ����A";
	mes "���������ƌ����Ă��܂��B";
	next;
	mes "[�A���h���A]";
	mes "���ۂɊ������闧��̖l�������A";
	mes "����ȗL��l�ŁA";
	mes "�����̂��߂̎�����p�ӂ���l�肪";
	mes "����Ȃ��󋵂Ȃ̂ł��B";
	next;
	mes "[�A���h���A]";
	mes "�V�����������ꂽ���̘c�񂾖��{��";
	mes "�U���ł���΁A�l�����̃M���h��";
	mes "���Ē������������ɂȂ�ł��傤�B";
	mes "�����Ă����M���ė��߂�`���҂�";
	mes strcharinfo(0)+"�l�����ł��B";
	next;
	mes "[�A���h���A]";
	mes "�l�����͍��̏�Ԃł͂�����̂́A";
	mes "���̘c�񂾖��{�̒���f�r���Ȃ���";
	mes "�l�X�ȑ̌������Ă��܂��B";
	next;
	mes "[�A���h���A]";
	mes "�l�����͂��̖��{�̃����X�^�[��";
	mes "����񋟂��܂��B";
	mes strcharinfo(0)+"�l�ɂ�";
	mes "����^ff0000�����X�^�[�B��";
	mes "�ގ����ė��ė~����^000000�̂ł��B";
	next;
	mes "[�A���h���A]";
	mes strcharinfo(0)+"�l�A";
	mes "�ǂ����l�����̃M���h�̋q���Ƃ���";
	mes "�͂�݂��Ă��������܂��񂩁H";
	next;
	if(select("�͂�݂�","��߂�") == 2) {
		mes "[�A���h���A]";
		mes "�m���Ɂc�c�����ł��ˁB";
		mes "������Ɩ����Ȃ��肢�������悤�ł��B";
		close;
	}
	mes "[�A���h���A]";
	mes "�{���ł����I";
	mes "���肪�Ƃ��������܂��B";
	mes "�l���M���h���\���āA";
	mes strcharinfo(0)+"�l��";
	mes "���̘c�񂾖��{�Ɋւ���";
	mes "�˗����o���܂��B";
	next;
	mes "[�A���h���A]";
	mes "�񍐂ƕ�V�Ɋւ��ẮA";
	mes "^0000FF�V���o�m^000000���S���������܂��B";
	mes "�˗�������������A";
	mes "�ނɕ񍐂��Ă��������B";
	next;
	mes "[�A���h���A]";
	mes "��H�@�ǂ����";
	mes "�M���h�����߂��Ă����悤�ł��ˁB";
	mes "���{�̓���������ė��Ă��炦�܂����H";
	next;
	mes "�]���{�̓�����Ɍ��������]";
	delquest 12489;
	setquest 12492;
	set IL_MAZE_QUE,7;
	close2;
	warp "prt_fild01.gat",141,365;
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_q.gat,105,20,7	script	�A�l�X#1	10312,{
	mes "[�A�l�X]";
	mes "�����������݂͂��";
	mes strcharinfo(0)+"�l��";
	mes "���ӂ��Ă��܂��B";
	if(IL_MAZE_QUE == 6) {
		mes "�����ăM���h����";
		mes "^0000ff�A���h���A^000000��";
		mes "�`�����c���Ă��܂��B";
	}
	close;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_q.gat,111,24,3	script	�V���o�m#1	10314,{
	mes "[�V���o�m]";
	mes "�������݂͂��";
	mes strcharinfo(0)+"�l��";
	mes "���ӂ��Ă��܂��B";
	if(IL_MAZE_QUE == 6) {
		mes "�����ăM���h����";
		mes "^0000ff�A���h���A^000000�ɓ`�����c���Ă��܂��B";
		mes "�ڂ����͔ނ��畷���Ă��������B";
	}
	close;
OnInit:
	cloakonnpc;
	end;
}

prontera.gat,212,320,0	script	#iol002	139,10,10,{
	if(IL_MAZE_QUE == 2) {
		cloakoffnpc "�G�X�������_#2";
		end;
	}
	cloakonnpc "�G�X�������_#2";
	end;
}

prontera.gat,212,320,3	script	�G�X�������_#2	677,6,6,{
	switch(IL_MAZE_QUE) {
	case 2:
		mes "[�G�X�������_]";
		mes "����H";
		mes "�ǂ����Ȃ����܂������H";
		mes "�������̃M���h�ɋ���������̂ł����H";
		next;
		menu "�C���[�l�̂��Ƃ�`����",-;
		mes "[�G�X�������_]";
		mes "�V�l�������s���s���ł����H";
		mes "�͂��c�c";
		mes "�M���h�̓`���Ȃ̂ł��傤���c�c�B";
		mes "���N�P��̎����ł��ˁB";
		next;
		mes "[�G�X�������_]";
		mes "�����Ă�������A���肪�Ƃ��������܂��B";
		mes "���͂��ꂩ��ނ�������ɍs���܂��B";
		mes "���Ȃ��ɐ_�̂����삪����񂱂Ƃ��B";
		next;
		mes "�]�G�X�������_�̌��ǂ��܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			chgquest 12482,12483;
			set IL_MAZE_QUE,3;
			close;
		}
		mes "�]�G�X�������_�̌��ǂ����]";
		chgquest 12482,12483;
		set IL_MAZE_QUE,3;
		close2;
		warp "prt_mz01_q.gat",102,21;
		end;
	case 3:
		mes "�]�G�X�������_�̌��ǂ��܂����H�]";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�G�X�������_�̌��ǂ����]";
		close2;
		warp "prt_mz01_q.gat",102,21;
		end;
	}
	end;
OnTouch:
	if(IL_MAZE_QUE == 2)
		unittalk "�G�X�������_ : ���̓������󂯂�A�������v�����e���i�ՃM���h�́A�V�����M���h�����W���ł��B";
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz03_q.gat,107,104,0	script	#iold01	139,15,15,{
	if(IL_MAZE_QUE == 4) {
		cloakoffnpc "�A���h���A�̍���#D";
		misceffect 561,"�A���h���A�̍���#D";
		end;
	}
	cloakonnpc "�A���h���A�̍���#D";
	end;
}

prt_mz03_q.gat,107,104,3	script	�A���h���A�̍���#D	10311,{
	if(checkquest(12484) == 0) {
		mes "-���̍��Ղ�T���Ɍ������܂����H-";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "-���̍��Ղ�T���Ɍ�������-";
		close2;
		warp "prt_mz03_q.gat",10,16;
		end;
	}
	mes "^0000ff�]�A���h���A�̍��Ղ������܂����B";
	mes "�@���Ղ�������܂����H�]^000000";
	next;
	if(select("�������","��߂�") == 2) {
		mes "�]^0000ff�����Ƃ𒆒f����^000000�]";
		close;
	}
	progressbar 5;
	misceffect 568,"�A���h���A�̍���#D";
	delquest 12484;
	if(checkquest(12484) == 0 && checkquest(12485) == 0 && checkquest(12486) == 0 && checkquest(12487) == 0) {
		delquest 12479;
		setquest 12488;
		set IL_MAZE_QUE,5;
		cloakonnpc "�A���h���A�̍���#D";
		cloakonnpc "�A�l�X�̍���#D";
		cloakonnpc "�V���o�m�̍���#D";
		cloakonnpc "�Z���V�A�̍���#D";
		mes "^0000ff�]�i�ՃM���h�̐V�l�̍��Ղ�";
		mes "�@���ׂČ��������Ȃ���";
		mes "�@�G�X�������_�̌��֌��������]^000000";
		close2;
		warp "prt_mz01_q.gat",102,21;
		end;
	}
	mes "-���̍��Ղ�T���Ɍ�������-";
	close2;
	warp "prt_mz03_q.gat",10,16;
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz03_q.gat,10,18,0	script	#iold02	139,15,15,{
	if(IL_MAZE_QUE == 4) {
		cloakoffnpc "�A�l�X�̍���#D";
		misceffect 561,"�A�l�X�̍���#D";
		end;
	}
	cloakonnpc "�A�l�X�̍���#D";
	end;
}

prt_mz03_q.gat,10,18,3	script	�A�l�X�̍���#D	10313,{
	if(checkquest(12485) == 0) {
		mes "-���̍��Ղ�T���Ɍ������܂����H-";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "-���̍��Ղ�T���Ɍ�������-";
		close2;
		warp "prt_mz03_q.gat",135,66;
		end;
	}
	mes "^0000ff�]�A�l�X�̍��Ղ������܂����B";
	mes "�@���Ղ�������܂����H�]^000000";
	next;
	if(select("�������","��߂�") == 2) {
		mes "�]^0000ff�����Ƃ𒆒f����^000000�]";
		close;
	}
	progressbar 5;
	misceffect 568,"�A�l�X�̍���#D";
	delquest 12485;
	if(checkquest(12484) == 0 && checkquest(12485) == 0 && checkquest(12486) == 0 && checkquest(12487) == 0) {
		delquest 12479;
		setquest 12488;
		set IL_MAZE_QUE,5;
		cloakonnpc "�A���h���A�̍���#D";
		cloakonnpc "�A�l�X�̍���#D";
		cloakonnpc "�V���o�m�̍���#D";
		cloakonnpc "�Z���V�A�̍���#D";
		mes "^0000ff�]�i�ՃM���h�̐V�l�̍��Ղ�";
		mes "�@���ׂČ��������Ȃ���";
		mes "�@�G�X�������_�̌��֌��������]^000000";
		close2;
		warp "prt_mz01_q.gat",102,21;
		end;
	}
	mes "-���̍��Ղ�T���Ɍ�������-";
	close2;
	warp "prt_mz03_q.gat",135,66;
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz03_q.gat,135,68,0	script	#iold03	139,15,15,{
	if(IL_MAZE_QUE == 4) {
		cloakoffnpc "�V���o�m�̍���#D";
		misceffect 561,"�V���o�m�̍���#D";
		end;
	}
	cloakonnpc "�V���o�m�̍���#D";
	end;
}

prt_mz03_q.gat,135,68,3	script	�V���o�m�̍���#D	10315,{
	if(checkquest(12486) == 0) {
		mes "-���̍��Ղ�T���Ɍ������܂����H-";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "-���̍��Ղ�T���Ɍ�������-";
		close2;
		warp "prt_mz03_q.gat",183,24;
		end;
	}
	mes "^0000ff�]�V���o�m�̍��Ղ������܂����B";
	mes "�@���Ղ�������܂����H�]^000000";
	next;
	if(select("�������","��߂�") == 2) {
		mes "�]^0000ff�����Ƃ𒆒f����^000000�]";
		close;
	}
	progressbar 5;
	misceffect 568,"�V���o�m�̍���#D";
	delquest 12486;
	if(checkquest(12484) == 0 && checkquest(12485) == 0 && checkquest(12486) == 0 && checkquest(12487) == 0) {
		delquest 12479;
		setquest 12488;
		set IL_MAZE_QUE,5;
		cloakonnpc "�A���h���A�̍���#D";
		cloakonnpc "�A�l�X�̍���#D";
		cloakonnpc "�V���o�m�̍���#D";
		cloakonnpc "�Z���V�A�̍���#D";
		mes "^0000ff�]�i�ՃM���h�̐V�l�̍��Ղ�";
		mes "�@���ׂČ��������Ȃ���";
		mes "�@�G�X�������_�̌��֌��������]^000000";
		close2;
		warp "prt_mz01_q.gat",102,21;
		end;
	}
	mes "-���̍��Ղ�T���Ɍ�������-";
	close2;
	warp "prt_mz03_q.gat",183,24;
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz03_q.gat,183,26,0	script	#iold04	139,15,15,{
	if(IL_MAZE_QUE == 4) {
		cloakoffnpc "�Z���V�A�̍���#D";
		misceffect 561,"�Z���V�A�̍���#D";
		end;
	}
	cloakonnpc "�Z���V�A�̍���#D";
	end;
}

prt_mz03_q.gat,183,26,3	script	�Z���V�A�̍���#D	10317,{
	if(checkquest(12487) == 0) {
		mes "-���̍��Ղ�T���Ɍ������܂����H-";
		next;
		if(select("�͂�","������") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "-���̍��Ղ�T���Ɍ�������-";
		close2;
		warp "prt_mz03_q.gat",107,102;
		end;
	}
	mes "^0000ff�]�Z���V�A�̍��Ղ������܂����B";
	mes "�@���Ղ�������܂����H�]^000000";
	next;
	if(select("�������","��߂�") == 2) {
		mes "�]^0000ff�����Ƃ𒆒f����^000000�]";
		close;
	}
	progressbar 5;
	misceffect 568,"�Z���V�A�̍���#D";
	delquest 12487;
	if(checkquest(12484) == 0 && checkquest(12485) == 0 && checkquest(12486) == 0 && checkquest(12487) == 0) {
		delquest 12479;
		setquest 12488;
		set IL_MAZE_QUE,5;
		cloakonnpc "�A���h���A�̍���#D";
		cloakonnpc "�A�l�X�̍���#D";
		cloakonnpc "�V���o�m�̍���#D";
		cloakonnpc "�Z���V�A�̍���#D";
		mes "^0000ff�]�i�ՃM���h�̐V�l�̍��Ղ�";
		mes "�@���ׂČ��������Ȃ���";
		mes "�@�G�X�������_�̌��֌��������]^000000";
		close2;
		warp "prt_mz01_q.gat",102,21;
		end;
	}
	mes "-���̍��Ղ�T���Ɍ�������-";
	close2;
	warp "prt_mz03_q.gat",107,102;
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_fild01.gat,137,365,0	script	#iol005	139,10,10,{
	if(IL_MAZE_QUE == 6) {
		cloakonnpc "�G�X�������_#5";
		mes "�c�c";
		next;
		mes "�]���낻��V�����I��������낤���H";
		mes "�@������x���{�̒��֓��낤�]";
		close2;
		warp "prt_mz01_q.gat",102,21;
		end;
	}
	if(IL_MAZE_QUE >= 7) {
		cloakoffnpc "�G�X�������_#5";
		end;
	}
	cloakonnpc "�G�X�������_#5";
	end;
}

prt_fild01.gat,141,367,3	script	�G�X�������_#5	677,5,5,{
	if(IL_MAZE_QUE == 8) {
		mes "[�G�X�������_]";
		mes "�������肪�Ƃ��������܂��B";
		mes "��낵����΁A";
		mes "�v�����e���܂ł����肵�܂��傤���H";
		next;
		if(select("������","�͂�") == 1) {
			mes "[�G�X�������_]";
			mes "�����ł����B";
			mes "�_�̂����삪����܂��悤�ɁB";
			close;
		}
		mes "[�G�X�������_]";
		mes "����ł́A�_�̂����삪����܂��悤�ɁB";
		close2;
		warp "prontera.gat",118,80;
		end;
	}
	if(IL_MAZE_QUE == 7) {
		mes "[�G�X�������_]";
		mes "�����c�c";
		mes "���A���ł��Ȃ��܂�";
		mes "���ʂꂩ�Ǝv������A";
		mes "�q���Ƃ��Ċ������Ă������邻���ł��ˁB";
		next;
		mes "[�G�X�������_]";
		mes "�Ȃ�Ƒf���炵���S��";
		mes "�������Ȃ̂ł��傤���B";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�_�̂�����������ɈႢ����܂���B";
		next;
		menu "�Ȃ��M���h�������𒬂ɖ߂��Ȃ��̂ł����H",-;
		mes "[�G�X�������_]";
		mes "����ɂ͖󂪂���̂ł��B";
		mes "���̎q�����́A";
		mes "��쐹���ƌ_������Ă��炸�A";
		mes "���̕ی����Ȃ���ԂȂ̂ł��B";
		mes "���Ō�����Ԉ�����P���ł����ꂽ��A";
		mes "���S���ł��Ă��܂��܂��B";
		next;
		mes "[�G�X�������_]";
		mes "�����炵�΂炭�͂����ɗ��܂�������";
		mes "���S�Ɣ��f���܂����B";
		mes "���i�͎p���B���Ă�����";
		mes "���Ȃ��̑O�ɂ̂݌����悤��";
		mes "�w�����Ă����܂����B";
		next;
		mes "[�G�X�������_]";
		mes "���݁A�M���h�̎������s���Ă��܂��Ă���A";
		mes "���̂��܂߂����S�ȕ����܂ł�";
		mes "���΂炭���Ԃ������肻���ł��B";
		mes "�Ȃ̂ŁA���΂炭�M���h�̊������k�����A";
		mes "�����Ń_���W������K���";
		mes "�`���҂̎x�������Ď������҂�����ł��B";
		next;
		mes "[�G�X�������_]";
		mes "���̖��{�ɂ͍����Ȍ��z�̐΂����߂�";
		mes "�T���ɒʂ������x���̖`���҂�";
		mes "���l�����邻���ł�����A";
		mes "����Ȃ�̊��Ԃ�";
		mes "�M���h�������̕��������͏W�܂�͂��ł��B";
		next;
		mes "[�G�X�������_]";
		mes "���ꂪ�A���ł���őP���Ǝv���܂��B";
		mes "�������A�M���h�̂���`�������Ă�������";
		mes strcharinfo(0)+"�l�ɂ́A";
		mes "�ړ��𖳗��Ŏx�������Ă��������܂��B";
		next;
		mes "[�G�X�������_]";
		mes "���������킯�ŁA";
		mes "���ꂩ����ǂ�������`����";
		mes "��낵�����肢���܂��B";
		next;
		delquest 12492;
		setquest 202155;
		getitem 25271,10;
		set IL_MAZE_QUE,8;
		getexp 300000000,0,1;
		getexp 0,60000000,0;
		mes "[�G�X�������_]";
		mes "���āA�M���h�̈˗��ɂ��ẮA";
		mes "�A���h���A���܂Ƃ߂Ă��܂��̂ŁA";
		mes "��x�A���h���A�̌��֑���܂��ˁB";
		close2;
		warp "prt_mz01_i.gat",102,21;
		end;
	}
OnTouch:
	if(IL_MAZE_QUE == 7)
		unittalk "�G�X�������_ : ���̎q���������S�ɕ���������̂͂��ɂȂ邱�Ƃ��c�c�B";
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_i.gat,103,22,0	script	#iol001	139,10,10,{
	if(IL_MAZE_QUE == 8) {
		cloakoffnpc "�c�񂾗􂯖�#2";
		misceffect 513,"�c�񂾗􂯖�#2";
		misceffect 74,"�c�񂾗􂯖�#2";
		cloakoffnpc "�A���h���A#2";
		cloakoffnpc "�A�l�X#2";
		cloakoffnpc "�V���o�m#2";
		cloakoffnpc "�Z���V�A#2";
	}
	end;
}

prt_mz01_i.gat,108,22,5	script	�c�񂾗􂯖�#2	844,{
	mes "�]�c�񂾗􂯖ڂ̌������ɁA";
	mes "�@������Ă���悤��";
	mes "�@����݂̖������{�̎p���L�����Ă���B";
	mes "�@��x��������A";
	mes "�@��x�Ɣ����o���Ȃ��Ȃ�";
	mes "�@��������Ȃ��]";
	next;
	if(select("�􂯖ڂ̌������֍s��","���Ȃ��������Ƃɂ���") == 2) {
		mes "^0000ff�]�D��S�͔L�����E���Ƃ����B";
		mes "�@�Â��Ɉ����Ԃ����]^000000";
		close;
	}
	mes "-�􂯖ڂ̌������֐i��-";
	close2;
	warp "prt_mz03_i.gat",102,21;
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_i.gat,111,20,1	script	�Z���V�A#2	10316,{
	mes "[�Z���V�A]";
	mes "�������݂͂�� ";
	mes strcharinfo(0)+"�l��";
	mes "���ӂ��Ă���܂��B";
	mes "���ɂ��ł��邱�Ƃ͂���܂����H";
	next;
	if(select("���ɂȂ�","�O�֑����Ă��炤") == 1) {
		mes "[�Z���V�A]";
		mes "���͂ɂȂꂸ�A�\���󂠂�܂���B";
		close;
	}
	mes "[�Z���V�A]";
	mes "�킩��܂����B";
	close2;
	warp "prt_fild01.gat",136,365;
	end;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_i.gat,105,24,5	script	�A���h���A#2	10310,{
	if(checkquest(12490)) {
		if(checkquest(12490)&0x2 == 0) {
			mes "[�A���h���A]";
			mes "�{���̈˗��͂��łɊ����ς݂ł��B";
			mes "���̌ߑO5���ȍ~�ɂ��炵�Ă��������B";
			close;
		}
		delquest 12490;
		mes "[�A���h���A]";
		mes "����͂��肪�Ƃ��������܂����B";
		mes strcharinfo(0)+"�l�̂������ŁA";
		mes "�������M���h�������ł��Ă��܂����A";
		mes "��͒������ł��āc�c�B";
		next;
	}
	if(checkquest(12478)) {
		mes "[�A���h���A]";
		mes "���݂̈˗��̐i�s�󋵂͂�����ł��B";
		next;
		mes "�y�i�s�󋵁z";
		mes "���ׂ̃o�t�H���b�g.Jr�̓����@" + (checkquest(12470)&0x4? "^FF0000����^000000": "^0000FF������^000000");
		mes "���ׂ̃n���^�[�t���C�̓����@" + (checkquest(12472)&0x4? "^FF0000����^000000": "^0000FF������^000000");
		mes "���ׂ̃L���[�}���e�B�X�̓����@" + (checkquest(12473)&0x4? "^FF0000����^000000": "^0000FF������^000000");
		mes "���ׂ̃}���e�B�X�̓����@" + (checkquest(12474)&0x4? "^FF0000����^000000": "^0000FF������^000000");
		mes "���ׂ̃|�|�����̓����@" + (checkquest(12475)&0x4? "^FF0000����^000000": "^0000FF������^000000");
		mes "���ׂ̃T�C�h���C���_�[�̓����@" + (checkquest(12476)&0x4? "^FF0000����^000000": "^0000FF������^000000");
		mes "���ׂ̃X�e�����[���̓����@" + (checkquest(12477)&0x4? "^FF0000����^000000": "^0000FF������^000000");
		next;
		mes "[�A���h���A]";
		mes "�񍐂ƕ�V�Ɋւ��ẮA";
		mes "^0000FF�V���o�m^000000���S���������܂��B";
		mes "�˗������ׂĊ���������A";
		mes "^0000FF�V���o�m^000000�ɕ񍐂��Ă��������B";
		close;
	}
	mes "[�A���h���A]";
	mes "���߂܂��āA"+strcharinfo(0)+"�l��";
	mes "���肢�������˗����������񂠂�܂��B";
	mes "�󂯂Ă��������܂����H";
	next;
	if(select("�󂯂�","�󂯂Ȃ�") == 2) {
		mes "[�A���h���A]";
		mes "�˗����󂯂鏀�����o������A";
		mes "�܂����炵�Ă��������B";
		close;
	}
	setquest 12470;
	setquest 12472;
	setquest 12473;
	setquest 12474;
	setquest 12475;
	setquest 12476;
	setquest 12477;
	setquest 12478;
	mes "[�A���h���A]";
	mes "�������肪�Ƃ��������܂��B";
	mes "��������낵�����肢�������܂��B";
	close;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_i.gat,105,20,7	script	�A�l�X#2	10312,{
	mes "[�A�l�X]";
	mes strcharinfo(0)+"�l�A";
	mes "�c�񂾗􂯖ڂ̒��ŁA";
	mes "�����������̎p�������҂ɏo�������A";
	mes "�G���Ǝv���Ă��������B";
	next;
	mes "[�A�l�X]";
	mes "�����́A";
	mes "�{���̂����������Ƃ͑S���̕ʕ��ł��B";
	mes "�H��̎p�ŕ�������ߒ���";
	mes "���̊���R��o���A";
	mes "�Ïk����Ēa�������הO�̉�ł��B";
	close;
OnInit:
	cloakonnpc;
	end;
}

prt_mz01_i.gat,111,24,3	script	�V���o�m#2	10314,{
	if(checkquest(12490)) {
		if(checkquest(12490)&0x2) {
			mes "[�V���o�m]";
			mes "�������肪�Ƃ��������܂��B";
			mes "�A���h���A����";
			mes "�V�����˗����󒍂��Ă��������B";
			close;
		}
		mes "[�V���o�m]";
		mes "�{���̈˗��̒B�����肪�Ƃ��������܂����B";
		mes "���ׂĂ̈˗��͊������Ă���܂��B";
		mes "���̌ߑO5���ȍ~�ɁA�A���h���A����";
		mes "�V�����˗����󒍂��Ă��������B";
		close;
	}
	mes "[�V���o�m]";
	mes "�������肪�Ƃ��������܂��B";
	mes "���ׂĂ̈˗�������������A";
	mes "��V�����n�����܂��B";
	mes "�������󂯎��܂����H";
	next;
	if(select("������Ƒ҂���","��V���󂯎��") == 1) {
		mes "[�V���o�m]";
		mes "������ł����҂��������܂���I";
		close;
	}
	mes "�y�i�s�󋵁z";
	mes "���ׂ̃o�t�H���b�g.Jr�̓����@" + (checkquest(12470)&0x4? "^FF0000����^000000": "^0000FF������^000000");
	mes "���ׂ̃n���^�[�t���C�̓����@" + (checkquest(12472)&0x4? "^FF0000����^000000": "^0000FF������^000000");
	mes "���ׂ̃L���[�}���e�B�X�̓����@" + (checkquest(12473)&0x4? "^FF0000����^000000": "^0000FF������^000000");
	mes "���ׂ̃}���e�B�X�̓����@" + (checkquest(12474)&0x4? "^FF0000����^000000": "^0000FF������^000000");
	mes "���ׂ̃|�|�����̓����@" + (checkquest(12475)&0x4? "^FF0000����^000000": "^0000FF������^000000");
	mes "���ׂ̃T�C�h���C���_�[�̓����@" + (checkquest(12476)&0x4? "^FF0000����^000000": "^0000FF������^000000");
	mes "���ׂ̃X�e�����[���̓����@" + (checkquest(12477)&0x4? "^FF0000����^000000": "^0000FF������^000000");
	next;
	if(checkquest(12470)&0x4 && checkquest(12472)&0x4 && checkquest(12473)&0x4 && checkquest(12474)&0x4 && checkquest(12475)&0x4 && checkquest(12476)&0x4 && checkquest(12477)&0x4) {
		setquest 12490;
		delquest 12470;
		delquest 12472;
		delquest 12473;
		delquest 12474;
		delquest 12475;
		delquest 12476;
		delquest 12477;
		delquest 12478;
		getitem 25271,2;
		getexp 100000000,0,1;
		getexp 0,20000000,0;
		mes "[�V���o�m]";
		mes "���ׂĂ̈˗�����������Ă��܂��ˁB";
		mes "��V�����󂯎�肭�������B";
		mes "���肪�Ƃ��������܂����B";
		close;
	}
	mes "[�V���o�m]";
	mes "�������Ă��Ȃ��˗�������܂��B";
	mes "���ׂĂ̈˗����������Ă���";
	mes "�܂����Ă��������B";
	close;
OnInit:
	cloakonnpc;
	end;
}

// Quest Floor No.01 -------------------------------------------------------------
prt_mz03_q.gat,5,186,0		warp	ilmazewarp5001		1,1,prt_mz03_q.gat,151,134	/*To No.3-9*/
prt_mz03_q.gat,22,194,0		warp	ilmazewarp5002		1,1,prt_mz03_q.gat,175,48	/*To No.3-20*/
// Quest Floor No.02
prt_mz03_q.gat,58,194,0		script	#ilmazewarp5003		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_q.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_q.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_q.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_q.gat",54,8;    end;	/*To No.3-22*/
	}
}
// Quest Floor No.03
prt_mz03_q.gat,85,174,0		warp	ilmazewarp5004		1,1,prt_mz03_q.gat,14,48	/*To No.3-16*/
prt_mz03_q.gat,102,165,0	warp	ilmazewarp5005		1,1,prt_mz03_q.gat,137,71	/*To No.3-19*/
// Quest Floor No.04
prt_mz03_q.gat,125,171,0	warp	ilmazewarp5006		1,1,prt_mz03_q.gat,105,111	/*To No.3-13*/
prt_mz03_q.gat,154,181,0	warp	ilmazewarp5007		1,1,prt_mz03_q.gat,139,48	/*To No.3-19*/
// Quest Floor No.05
prt_mz03_q.gat,175,165,0	warp	ilmazewarp5008		1,1,prt_mz03_q.gat,71,12	/*To No.3-22*/
prt_mz03_q.gat,194,175,0	warp	ilmazewarp5009		1,1,prt_mz03_q.gat,191,139	/*To No.3-10*/
// Quest Floor No.06
prt_mz03_q.gat,5,140,0		warp	ilmazewarp5010		1,1,prt_mz03_q.gat,111,56	/*To No.3-18*/
prt_mz03_q.gat,18,154,0		warp	ilmazewarp5011		1,1,prt_mz03_q.gat,48,21	/*To No.3-22*/
prt_mz03_q.gat,23,125,0		warp	ilmazewarp5012		1,1,prt_mz03_q.gat,177,71	/*To No.3-20*/
// Quest Floor No.07
prt_mz03_q.gat,54,154,0		warp	ilmazewarp5013		1,1,prt_mz03_q.gat,142,111	/*To No.3-14*/
prt_mz03_q.gat,63,125,0		warp	ilmazewarp5014		1,1,prt_mz03_q.gat,88,97	/*To No.3-13*/
// Quest Floor No.08
prt_mz03_q.gat,85,146,0		warp	ilmazewarp5015		1,1,prt_mz03_q.gat,22,88	/*To No.3-11*/
prt_mz03_q.gat,98,154,0		warp	ilmazewarp5016		1,1,prt_mz03_q.gat,99,31	/*To No.3-23*/
prt_mz03_q.gat,114,145,0	warp	ilmazewarp5017		1,1,prt_mz03_q.gat,168,22	/*To No.3-25*/
// Quest Floor No.09
prt_mz03_q.gat,137,125,0	warp	ilmazewarp5018		1,1,prt_mz03_q.gat,71,71	/*To No.3-17*/
prt_mz03_q.gat,154,134,0	warp	ilmazewarp5019		1,1,prt_mz03_q.gat,8,186	/*To No.3-1*/
// Quest Floor No.10
prt_mz03_q.gat,166,139,0	warp	ilmazewarp5020		1,1,prt_mz03_q.gat,63,88	/*To No.3-12*/
prt_mz03_q.gat,194,139,0	warp	ilmazewarp5021		1,1,prt_mz03_q.gat,191,175	/*To No.3-5*/
// Quest Floor No.11
prt_mz03_q.gat,17,114,0		warp	ilmazewarp5022		1,1,prt_mz03_q.gat,128,102	/*To No.3-14*/
prt_mz03_q.gat,22,85,0		warp	ilmazewarp5023		1,1,prt_mz03_q.gat,88,146	/*To No.3-8*/
// Quest Floor No.12
prt_mz03_q.gat,45,104,0		warp	ilmazewarp5024		1,1,prt_mz03_q.gat,96,48	/*To No.3-18*/
prt_mz03_q.gat,63,114,0		warp	ilmazewarp5025		1,1,prt_mz03_q.gat,14,71	/*To No.3-16*/
prt_mz03_q.gat,74,97,0		warp	ilmazewarp5026		1,1,prt_mz03_q.gat,57,8		/*To No.3-22*/
prt_mz03_q.gat,63,85,0		warp	ilmazewarp5027		1,1,prt_mz03_q.gat,169,139	/*To No.3-10*/
// Quest Floor No.13
prt_mz03_q.gat,85,97,0		warp	ilmazewarp5028		1,1,prt_mz03_q.gat,63,128	/*To No.3-7*/
prt_mz03_q.gat,105,114,0	warp	ilmazewarp5029		1,1,prt_mz03_q.gat,128,174	/*To No.3-4*/
prt_mz03_q.gat,114,95,0		warp	ilmazewarp5030		1,1,prt_mz03_q.gat,176,8	/*To No.3-25*/
// Quest Floor No.14
prt_mz03_q.gat,125,105,0	warp	ilmazewarp5031		1,1,prt_mz03_q.gat,58,191	/*To No.3-2*/
prt_mz03_q.gat,142,114,0	warp	ilmazewarp5032		1,1,prt_mz03_q.gat,54,151	/*To No.3-7*/
// Quest Floor No.15
prt_mz03_q.gat,168,94,0		warp	ilmazewarp5033		1,1,prt_mz03_q.gat,191,54	/*To No.3-20*/
prt_mz03_q.gat,182,85,0		warp	ilmazewarp5034		1,1,prt_mz01_q.gat,99,30
prt_mz03_q.gat,194,94,0		warp	ilmazewarp5035		1,1,prt_mz03_q.gat,151,22	/*To No.3-24*/
// Quest Floor No.16
prt_mz03_q.gat,5,58,0		warp	ilmazewarp5036		1,1,prt_mz03_q.gat,191,15	/*To No.3-25*/
prt_mz03_q.gat,14,74,0		warp	ilmazewarp5037		1,1,prt_mz03_q.gat,63,111	/*To No.3-12*/
prt_mz03_q.gat,14,45,0		warp	ilmazewarp5038		1,1,prt_mz03_q.gat,88,174	/*To No.3-3*/
// Quest Floor No.17
prt_mz03_q.gat,52,45,0		warp	ilmazewarp5039		1,1,prt_mz03_q.gat,16,31	/*To No.3-21*/
prt_mz03_q.gat,74,74,0		script	#ilmazewarp5040		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_q.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_q.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_q.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_q.gat",54,8;    end;	/*To No.3-22*/
	}
}
// Quest Floor No.18
prt_mz03_q.gat,85,56,0		warp	ilmazewarp5041		1,1,prt_mz03_q.gat,176,31	/*To No.3-25*/
prt_mz03_q.gat,104,74,0		warp	ilmazewarp5042		1,1,prt_mz03_q.gat,111,22	/*To No.3-23*/
prt_mz03_q.gat,96,45,0		warp	ilmazewarp5043		1,1,prt_mz03_q.gat,48,104	/*To No.3-12*/
prt_mz03_q.gat,114,56,0		warp	ilmazewarp5044		1,1,prt_mz03_q.gat,8,140	/*To No.3-6*/
// Quest Floor No.19
prt_mz03_q.gat,139,45,0		script	#ilmazewarp5045		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_q.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_q.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_q.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_q.gat",54,8;    end;	/*To No.3-22*/
	}
}
prt_mz03_q.gat,137,74,0		warp	ilmazewarp5046		1,1,prt_mz03_q.gat,102,168	/*To No.3-3*/
// Quest Floor No.20
prt_mz03_q.gat,175,45,0		warp	ilmazewarp5047		1,1,prt_mz03_q.gat,22,191	/*To No.3-1*/
prt_mz03_q.gat,177,74,0		warp	ilmazewarp5048		1,1,prt_mz03_q.gat,23,128	/*To No.3-6*/
prt_mz03_q.gat,194,54,0		warp	ilmazewarp5049		1,1,prt_mz03_q.gat,171,94	/*To No.3-15*/
// Quest Floor No.21
prt_mz03_q.gat,23,5,0		warp	ilmazewarp5050		1,1,prt_mz03_q.gat,88,13	/*To No.3-23*/
prt_mz03_q.gat,16,34,0		warp	ilmazewarp5051		1,1,prt_mz03_q.gat,52,48	/*To No.3-17*/
// Quest Floor No.22
prt_mz03_q.gat,45,21,0		warp	ilmazewarp5052		1,1,prt_mz03_q.gat,18,151	/*To No.3-6*/
prt_mz03_q.gat,54,5,0		warp	ilmazewarp5053		1,1,prt_mz03_q.gat,71,97	/*To No.3-12*/
prt_mz03_q.gat,74,12,0		warp	ilmazewarp5054		1,1,prt_mz03_q.gat,175,168	/*To No.3-5*/
// Quest Floor No.23
prt_mz03_q.gat,85,13,0		warp	ilmazewarp5055		1,1,prt_mz03_q.gat,23,8		/*To No.3-21*/
prt_mz03_q.gat,99,34,0		warp	ilmazewarp5056		1,1,prt_mz03_q.gat,98,151	/*To No.3-8*/
prt_mz03_q.gat,114,22,0		warp	ilmazewarp5057		1,1,prt_mz03_q.gat,104,71	/*To No.3-18*/
// Quest Floor No.24
prt_mz03_q.gat,154,22,0		script	#ilmazewarp5058		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_q.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_q.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_q.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_q.gat",54,8;    end;	/*To No.3-22*/
	}
}
// Quest Floor No.25
prt_mz03_q.gat,165,22,0		warp	ilmazewarp5059		1,1,prt_mz03_q.gat,111,145	/*To No.3-8*/
prt_mz03_q.gat,176,5,0		warp	ilmazewarp5060		1,1,prt_mz03_q.gat,111,95	/*To No.3-13*/
prt_mz03_q.gat,176,34,0		warp	ilmazewarp5061		1,1,prt_mz03_q.gat,88,56	/*To No.3-18*/
prt_mz03_q.gat,194,15,0		warp	ilmazewarp5062		1,1,prt_mz03_q.gat,8,58		/*To No.3-16*/


// Floor No.01 -------------------------------------------------------------
prt_mz03_i.gat,5,186,0		warp	ilmazewarp5101		1,1,prt_mz03_i.gat,151,134	/*To No.3-9*/
prt_mz03_i.gat,22,194,0		warp	ilmazewarp5102		1,1,prt_mz03_i.gat,175,48	/*To No.3-20*/
// Floor No.02
prt_mz03_i.gat,58,194,0		script	#ilmazewarp5103		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_i.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_i.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_i.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_i.gat",54,8;    end;	/*To No.3-22*/
	}
}
// Floor No.03
prt_mz03_i.gat,85,174,0		warp	ilmazewarp5104		1,1,prt_mz03_i.gat,14,48	/*To No.3-16*/
prt_mz03_i.gat,102,165,0	warp	ilmazewarp5105		1,1,prt_mz03_i.gat,137,71	/*To No.3-19*/
// Floor No.04
prt_mz03_i.gat,125,171,0	warp	ilmazewarp5106		1,1,prt_mz03_i.gat,105,111	/*To No.3-13*/
prt_mz03_i.gat,154,181,0	warp	ilmazewarp5107		1,1,prt_mz03_i.gat,139,48	/*To No.3-19*/
// Floor No.05
prt_mz03_i.gat,175,165,0	warp	ilmazewarp5108		1,1,prt_mz03_i.gat,71,12	/*To No.3-22*/
prt_mz03_i.gat,194,175,0	warp	ilmazewarp5109		1,1,prt_mz03_i.gat,191,139	/*To No.3-10*/
// Floor No.06
prt_mz03_i.gat,5,140,0		warp	ilmazewarp5110		1,1,prt_mz03_i.gat,111,56	/*To No.3-18*/
prt_mz03_i.gat,18,154,0		warp	ilmazewarp5111		1,1,prt_mz03_i.gat,48,21	/*To No.3-22*/
prt_mz03_i.gat,23,125,0		warp	ilmazewarp5112		1,1,prt_mz03_i.gat,177,71	/*To No.3-20*/
// Floor No.07
prt_mz03_i.gat,54,154,0		warp	ilmazewarp5113		1,1,prt_mz03_i.gat,142,111	/*To No.3-14*/
prt_mz03_i.gat,63,125,0		warp	ilmazewarp5114		1,1,prt_mz03_i.gat,88,97	/*To No.3-13*/
// Floor No.08
prt_mz03_i.gat,85,146,0		warp	ilmazewarp5115		1,1,prt_mz03_i.gat,22,88	/*To No.3-11*/
prt_mz03_i.gat,98,154,0		warp	ilmazewarp5116		1,1,prt_mz03_i.gat,99,31	/*To No.3-23*/
prt_mz03_i.gat,114,145,0	warp	ilmazewarp5117		1,1,prt_mz03_i.gat,168,22	/*To No.3-25*/
// Floor No.09
prt_mz03_i.gat,137,125,0	warp	ilmazewarp5118		1,1,prt_mz03_i.gat,71,71	/*To No.3-17*/
prt_mz03_i.gat,154,134,0	warp	ilmazewarp5119		1,1,prt_mz03_i.gat,8,186	/*To No.3-1*/
// Floor No.10
prt_mz03_i.gat,166,139,0	warp	ilmazewarp5120		1,1,prt_mz03_i.gat,63,88	/*To No.3-12*/
prt_mz03_i.gat,194,139,0	warp	ilmazewarp5121		1,1,prt_mz03_i.gat,191,175	/*To No.3-5*/
// Floor No.11
prt_mz03_i.gat,17,114,0		warp	ilmazewarp5122		1,1,prt_mz03_i.gat,128,102	/*To No.3-14*/
prt_mz03_i.gat,22,85,0		warp	ilmazewarp5123		1,1,prt_mz03_i.gat,88,146	/*To No.3-8*/
// Floor No.12
prt_mz03_i.gat,45,104,0		warp	ilmazewarp5124		1,1,prt_mz03_i.gat,96,48	/*To No.3-18*/
prt_mz03_i.gat,63,114,0		warp	ilmazewarp5125		1,1,prt_mz03_i.gat,14,71	/*To No.3-16*/
prt_mz03_i.gat,74,97,0		warp	ilmazewarp5126		1,1,prt_mz03_i.gat,57,8		/*To No.3-22*/
prt_mz03_i.gat,63,85,0		warp	ilmazewarp5127		1,1,prt_mz03_i.gat,169,139	/*To No.3-10*/
// Floor No.13
prt_mz03_i.gat,85,97,0		warp	ilmazewarp5128		1,1,prt_mz03_i.gat,63,128	/*To No.3-7*/
prt_mz03_i.gat,105,114,0	warp	ilmazewarp5129		1,1,prt_mz03_i.gat,128,174	/*To No.3-4*/
prt_mz03_i.gat,114,95,0		warp	ilmazewarp5130		1,1,prt_mz03_i.gat,176,8	/*To No.3-25*/
// Floor No.14
prt_mz03_i.gat,125,105,0	warp	ilmazewarp5131		1,1,prt_mz03_i.gat,58,191	/*To No.3-2*/
prt_mz03_i.gat,142,114,0	warp	ilmazewarp5132		1,1,prt_mz03_i.gat,54,151	/*To No.3-7*/
// Floor No.15
prt_mz03_i.gat,168,94,0		warp	ilmazewarp5133		1,1,prt_mz03_i.gat,191,54	/*To No.3-20*/
prt_mz03_i.gat,182,85,0		warp	ilmazewarp5134		1,1,prt_mz01_i.gat,99,30
prt_mz03_i.gat,194,94,0		warp	ilmazewarp5135		1,1,prt_mz03_i.gat,151,22	/*To No.3-24*/
// Floor No.16
prt_mz03_i.gat,5,58,0		warp	ilmazewarp5136		1,1,prt_mz03_i.gat,191,15	/*To No.3-25*/
prt_mz03_i.gat,14,74,0		warp	ilmazewarp5137		1,1,prt_mz03_i.gat,63,111	/*To No.3-12*/
prt_mz03_i.gat,14,45,0		warp	ilmazewarp5138		1,1,prt_mz03_i.gat,88,174	/*To No.3-3*/
// Floor No.17
prt_mz03_i.gat,52,45,0		warp	ilmazewarp5139		1,1,prt_mz03_i.gat,16,31	/*To No.3-21*/
prt_mz03_i.gat,74,74,0		script	#ilmazewarp5140		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_i.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_i.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_i.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_i.gat",54,8;    end;	/*To No.3-22*/
	}
}
// Floor No.18
prt_mz03_i.gat,85,56,0		warp	ilmazewarp5141		1,1,prt_mz03_i.gat,176,31	/*To No.3-25*/
prt_mz03_i.gat,104,74,0		warp	ilmazewarp5142		1,1,prt_mz03_i.gat,111,22	/*To No.3-23*/
prt_mz03_i.gat,96,45,0		warp	ilmazewarp5143		1,1,prt_mz03_i.gat,48,104	/*To No.3-12*/
prt_mz03_i.gat,114,56,0		warp	ilmazewarp5144		1,1,prt_mz03_i.gat,8,140	/*To No.3-6*/
// Floor No.19
prt_mz03_i.gat,139,45,0		script	#ilmazewarp5145		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_i.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_i.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_i.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_i.gat",54,8;    end;	/*To No.3-22*/
	}
}
prt_mz03_i.gat,137,74,0		warp	ilmazewarp5146		1,1,prt_mz03_i.gat,102,168	/*To No.3-3*/
// Floor No.20
prt_mz03_i.gat,175,45,0		warp	ilmazewarp5147		1,1,prt_mz03_i.gat,22,191	/*To No.3-1*/
prt_mz03_i.gat,177,74,0		warp	ilmazewarp5148		1,1,prt_mz03_i.gat,23,128	/*To No.3-6*/
prt_mz03_i.gat,194,54,0		warp	ilmazewarp5149		1,1,prt_mz03_i.gat,171,94	/*To No.3-15*/
// Floor No.21
prt_mz03_i.gat,23,5,0		warp	ilmazewarp5150		1,1,prt_mz03_i.gat,88,13	/*To No.3-23*/
prt_mz03_i.gat,16,34,0		warp	ilmazewarp5151		1,1,prt_mz03_i.gat,52,48	/*To No.3-17*/
// Floor No.22
prt_mz03_i.gat,45,21,0		warp	ilmazewarp5152		1,1,prt_mz03_i.gat,18,151	/*To No.3-6*/
prt_mz03_i.gat,54,5,0		warp	ilmazewarp5153		1,1,prt_mz03_i.gat,71,97	/*To No.3-12*/
prt_mz03_i.gat,74,12,0		warp	ilmazewarp5154		1,1,prt_mz03_i.gat,175,168	/*To No.3-5*/
// Floor No.23
prt_mz03_i.gat,85,13,0		warp	ilmazewarp5155		1,1,prt_mz03_i.gat,23,8		/*To No.3-21*/
prt_mz03_i.gat,99,34,0		warp	ilmazewarp5156		1,1,prt_mz03_i.gat,98,151	/*To No.3-8*/
prt_mz03_i.gat,114,22,0		warp	ilmazewarp5157		1,1,prt_mz03_i.gat,104,71	/*To No.3-18*/
// Floor No.24
prt_mz03_i.gat,154,22,0		script	#ilmazewarp5158		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_mz03_i.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_mz03_i.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_mz03_i.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_mz03_i.gat",54,8;    end;	/*To No.3-22*/
	}
}
// Floor No.25
prt_mz03_i.gat,165,22,0		warp	ilmazewarp5159		1,1,prt_mz03_i.gat,111,145	/*To No.3-8*/
prt_mz03_i.gat,176,5,0		warp	ilmazewarp5160		1,1,prt_mz03_i.gat,111,95	/*To No.3-13*/
prt_mz03_i.gat,176,34,0		warp	ilmazewarp5161		1,1,prt_mz03_i.gat,88,56	/*To No.3-18*/
prt_mz03_i.gat,194,15,0		warp	ilmazewarp5162		1,1,prt_mz03_i.gat,8,58		/*To No.3-16*/
