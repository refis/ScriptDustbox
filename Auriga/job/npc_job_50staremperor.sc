//====================================================================
//Ragnarok Online - StarEmperor Jobchange Script	by refis
//
//�@�� CHANGE_SE -> 0�`14
//====================================================================

payon.gat,171,171,4	script	����̕����������j#JQ_S	4239,{/* 10730 */
	if(Job == Job_StarEmperor) {
		mes "[�i���\��]";
		mes "�����c�c";
		mes "���l���Ԃ��Ȃ�����ɂȂ���肾���ǁH";
		mes "��΂����Ƃ��S�R�S���A�܂����Ȃ�����ȁH�I";
		emotion 57,"����̕����������j#JQ_S";	// 10730
		close;
	}
	if(Job != Job_StarGladiator || BaseLevel < 99 || JobLevel < 50) {
		mes "[����̕����������j]";
		mes "�X���̐��A";
		mes "�˔\����҂͉B���؂�Ȃ��Ƃ������c�c";
		mes "�O�Ō`�����̏C�Ƃ����邾���ŁA";
		mes "�݂�ȁA�����ĉ߂����ȁB";
		close;
	}
	if(CHANGE_SE == 0) {
		cloakonnpc "�����Z�C#JQ_SEch1";	// 10731
		cloakonnpc "�����Z�C#JQ_SEch2";	// 10732
		cloakonnpc "�����Z�C#JQ_SEch3";	// 10733
		cloakonnpc "�����Z�C#JQ_SEch4";	// 10734
		mes "[����̕����������j]";
		mes "�͂����������I";
		mes "�c";
		mes "�c�c";
		next;
		mes "[����̕����������j]";
		mes "���c�c";
		mes "���l���ēz�́c�c";
		mes "�Ȃ�Ő�����Ƃ��Ă��A";
		mes "�����܂Ŋ����Ȃ̂��c�c�B";
		emotion 38,"����̕����������j#JQ_S";	// 10730
		next;
		mes "[�����Z�C]";
		mes "�ō��ł��A�i���\�����V����܁I�I";
		mes "�����������`�����D�����ł��ȁI";
		cloakoffnpc "�����Z�C#JQ_SEch1";	// 10731
		unittalk getnpcid(0,"�����Z�C#JQ_SEch1"),"�p�V���I�p�V���I";	// 10731
		misceffect 250,"�����Z�C#JQ_SEch1";	// 10731
		if(!sleep2(100)) end;
		misceffect 250,"�����Z�C#JQ_SEch1";	// 10731
		if(!sleep2(1000)) end;
		cloakonnpc "�����Z�C#JQ_SEch1";	// 10731
		cloakoffnpc "�����Z�C#JQ_SEch2";	// 10732
		unittalk getnpcid(0,"�����Z�C#JQ_SEch2"),"�p�V���I�p�V���I";	// 10732
		misceffect 250,"�����Z�C#JQ_SEch2";	// 10732
		if(!sleep2(100)) end;
		misceffect 250,"�����Z�C#JQ_SEch2";	// 10732
		if(!sleep2(1000)) end;
		cloakonnpc "�����Z�C#JQ_SEch2";	// 10732
		cloakoffnpc "�����Z�C#JQ_SEch3";	// 10733
		unittalk getnpcid(0,"�����Z�C#JQ_SEch3"),"�p�V���I�p�V���I";	// 10733
		misceffect 250,"�����Z�C#JQ_SEch3";	// 10733
		if(!sleep2(100)) end;
		misceffect 250,"�����Z�C#JQ_SEch3";	// 10733
		if(!sleep2(1000)) end;
		cloakonnpc "�����Z�C#JQ_SEch3";	// 10733
		cloakoffnpc "�����Z�C#JQ_SEch4";	// 10734
		unittalk getnpcid(0,"�����Z�C#JQ_SEch4"),"�p�V���I�p�V���I";	// 10734
		misceffect 250,"�����Z�C#JQ_SEch4";	// 10734
		if(!sleep2(100)) end;
		misceffect 250,"�����Z�C#JQ_SEch4";	// 10734
		next;
		mes "[�i���\��]";
		mes "�ӂ��c�c";
		mes "�����B";
		mes "�m���Ă�B";
		emotion 40,"����̕����������j#JQ_S";	// 10730
		next;
		mes "[�i���\��]";
		mes "�Ƃ���Ńh�D���\�����ꂿ����";
		mes "���A���ė���񂾁H";
		mes "^ff0000������^000000�֍s���ƌ�����";
		mes "�����͌o�����񂾂��c�c�B";
		next;
		mes "[�����Z�C]";
		mes "���������ꏊ�ł͂Ȃ��̂ŁA";
		mes "�����ɂ��߂�ɂȂ�ł��傤�B";
		next;
		mes "[�i���\��]";
		mes "�����͂Ȃ���";
		mes "�������R���̃h�c�ɂ���Ȃ����B";
		mes "�`���E�W�t�͂́A�Ȃ�ł���ȂƂ����";
		mes "������J���Ă���񂾁H";
		emotion 54,"����̕����������j#JQ_S";	// 10730
		next;
		mes "[�i���\��]";
		mes "�b���Ă�������΁A���̂�������";
		mes "��������ĂĂ���������̂ɁI";
		mes "��������΁A���̉��{���̋K�͂�";
		mes "�����҂��Đl�C�������邾�낤�ɁI";
		next;
		mes "[�����Z�C]";
		mes "�����I";
		mes "���������炸�[���Ƃ��V����܂�";
		mes "���Ă���҂�����܂��B";
		emotion 22,"�����Z�C#JQ_SEch4";	// 10734
		next;
		mes "[�i���\��]";
		mes "�ʂɂ�܂������Ƃ�";
		mes "�b���Ă���킯����Ȃ��񂾂���A";
		mes "���l�ɕ�����Ă��\��Ȃ�����H";
		next;
		mes "[�i���\��]";
		mes "�����̂��O�I";
		mes "���l�ɉ����p������̂��H";
		next;
		unittalk getnpcid(0,"�����Z�C#JQ_SEch4"),"����ł͎��炢�����܂��B";	// 10734
		cloakonnpc "�����Z�C#JQ_SEch4";	// 10734
		while(1) {
			switch(select("�����тɂ��ĕ���","�����ɂ��ĕ���","��߂�")) {
			case 1:
				break;
			case 2:
				mes "[�i���\��]";
				mes "���̉��l�́A�Ԃ��Ȃ�";
				mes "^ff0000�F����m��s�����ҁc�c�܂萯��^000000�ɂȂ�";
				mes "�i���\���l�ł���I";
				emotion 52,"����̕����������j#JQ_S";	// 10730
				next;
				mes "[�i���\��]";
				mes "���̕����A���̓��̂��߂�";
				mes "���O�ɗp�ӂ��Ă��������̂��I";
				next;
				mes "[�i���\��]";
				mes "�W���C�A���g�X�p�C�_�[�̂����̎�����";
				mes "�o�����ō����̌��ɁA";
				mes "�o�t�H���b�g�̖тō������������";
				mes "�h�J��������i�I";
				mes "�����т̔z���i�Ƃ̓��x�����Ⴄ�񂾂�I";
				next;
				mes "[�i���\��]";
				mes "���ʂɎʐ^�B��̂������悤�B";
				mes "�ӂӁc�c�B";
				next;
				continue;
			case 3:
				mes "[�i���\��]";
				mes "�����������Ƃ��ĂȂ��������H";
				mes "�p����������Ȃ�`�B";
				emotion 40,"����̕����������j#JQ_S";	// 10730
				close;
			}
			break;
		}	// end while
		mes "[�i���\��]";
		mes "�����сH";
		mes "�`���E�W�t�͂��J���ꂽ";
		mes "����ɂȂ�ׂ̓���̂��Ƃ����A";
		mes "���O������ɂȂ肽���̂��H";
		emotion 1,"����̕����������j#JQ_S";	// 10730
		next;
		mes "[�i���\��]";
		mes "�����т�^ff0000�~�����j�[���R���̖k^000000�ɂ���";
		mes "�����R����o���čs���΂��邼�B";
		mes "���܂�ɂ��������R��������A";
		mes "�Ў�ȓz�͒H������Ƃ���������ǂȁB";
		next;
		mes "[�i���\��]";
		mes "�������l�͗D��������A";
		mes "�����̎����ɗ����т̋߂��܂�";
		mes "�ē������Ă���Ă��������B";
		mes "�ǂ������H";
		setquest 11573;	// state=1
		set CHANGE_SE,1;
		next;
		if(select("�����тɈē����Ă��炤","�����ōs��") == 2) {
			mes "[�i���\��]";
			mes "���O�Ȃ�A�H������Ƃ��Ă�";
			mes "�o�邾����5���͂����邾�낤��";
			mes "�撣���B";
			mes "�ē����Ăق����Ȃ�����";
			mes "�����Ȃ�������H�@���l�͗D��������ȁB";
			close;
		}
		// ������
		mes "[�i���\��]";
		mes "���l����ɐ���ɂ͂Ȃ�Ȃ��Ǝv����";
		mes "�撣���B";
		close2;
		warp "mjolnir_03.gat", 227, 176;
		end;
	}
	else if(CHANGE_SE >= 1) {
		mes "[�i���\��]";
		mes "�Ȃ񂾁H";
		mes "�܂������тɒH����ĂȂ��̂��H";
		mes "���l�͗D��������A";
		mes "�����̎����ɗ����т̋߂��܂�";
		mes "�ē������Ă���Ă��������B";
		mes "�ǂ������H";
		next;
		if(select("�����тɈē����Ă��炤","�����ōs��") == 2) {
			mes "[�i���\��]";
			mes "���O�Ȃ�A�H������Ƃ��Ă�";
			mes "�o�邾����5���͂����邾�낤��";
			mes "�撣���B";
			mes "�ē����Ăق����Ȃ�����";
			mes "�����Ȃ�������H�@���l�͗D��������ȁB";
			close;
		}
		mes "[�i���\��]";
		mes "���l����ɐ���ɂ͂Ȃ�Ȃ��Ǝv����";
		mes "�撣���B";
		close2;
		warp "mjolnir_03.gat", 227, 176;
		end;
	}
}
payon.gat,170,169,7	script	�����Z�C#JQ_SEch1	88,{/* 10731 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
payon.gat,168,173,5	script	�����Z�C#JQ_SEch2	88,{/* 10732 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
payon.gat,173,173,3	script	�����Z�C#JQ_SEch3	88,{/* 10733 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
payon.gat,173,169,1	script	�����Z�C#JQ_SEch4	88,{/* 10734 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

mjolnir_03.gat,236,185,4	script	�R���#JQ_SE	59,{/* 12867 */
	mes "[�R���]";
	mes "����ɂ��́`";
	mes "�����V�C�ł���ˁH";
	emotion 18;	// 12867
	if(CHANGE_SE == 12) set '@str$,"�₢�l�߂�";
	next;
	switch(select('@str$,"�����т֍s�����𕷂�","�V�C�ɂ��Ęb��","��߂�")) {
	case 1:
		mes "[�`���E�W�t��]";
		mes "������`�΂ꂿ�Ⴂ�܂������B";
		mes "���܂Ńj�b�R�E�����C�Â��Ȃ������̂ɁA";
		mes "���������ł��ˁI";
		emotion 18,"�R���#JQ_SE";	// 12867
		next;
		menu "�B��Ă������R�ɂ���",-;
		mes "[�`���E�W�E�N�E]";
		mes "���I";
		mes "�t�͂Ƃ����ď̂͂��������ł��B";
		mes "�K���Ɂu����v���炢�Ō��\�ł��B";
		mes "���́A���̎q������";
		mes "�t�͂̍����������Ȃ̂ŁI";
		next;
		mes "[�`���E�W�E�N�E]";
		mes "�������i�͏\������̂�";
		mes "�����ƒ�q�Ƃ��Ďc��ƌ��������Ă��̂ŁA";
		mes "��U�B��ėl�q�����Ă��܂����B";
		next;
		mes "[�`���E�W�E�N�E]";
		mes "���_�A���͂܂�����ʓ_����������ǁA";
		mes "�₦���w��Ő������čs���܂�����B";
		next;
		mes "[�`���E�W�E�N�E]";
		mes "�~�J�͎��͂��D��Ă��Đ^�ʖڂ����ǁA";
		mes "�^�ʖډ߂���̂����܂ɏ��ł����c�c";
		next;
		mes "[�`���E�W�E�N�E]";
		mes "�M���K�͍˔\�����Δ����Ă��邹���ŁA";
		mes "���l�̋�J�ɓ݊��Łc�c";
		next;
		mes "[�`���E�W�E�N�E]";
		mes "�j�b�R�E�͎����̏C�Ƃɂ���";
		mes "�������Ȃ��c�c";
		next;
		mes "[�`���E�W�E�N�E]";
		mes "�����O�l�S���Ő�����������΁A";
		mes "���𒴂���������������Ȃ��ł��傤�B";
		emotion 18,"�R���#JQ_SE";	// 12867
		next;
		mes "[�`���E�W�E�N�E]";
		mes "���̎q�����́A�悢�t�͂ɂȂ��ł��傤�ˁB";
		mes strcharinfo(0)+ "�����";
		mes "�l���͂������ł����H";
		mes "�N�Ƌ��ɐ����������ł����H";
		mes "�t�͂ւ̑����Ƃ���";
		mes "���Ȃ��𐯒�֓����Ă����ł��傤�B";
		delquest 11584;
		setquest 11585;	// state=1
		set CHANGE_SE,13;
		close2;
		warp "star_frst.gat", 89, 32;	// from: mjolnir_03.gat(229, 180)
		end;
	case 2:
		mes "[�R���]";
		mes "�����тɂ́A������̎R����";
		mes "�i��ł��������B";
		mes "�R�������X�������ł����c�c";
		mes "�����H�����ł��傤�B";
		close2;
		warp "star_frst.gat", 89, 32;	// from: mjolnir_03.gat(234, 181)
		end;
	case 3:
		mes "[�R���]";
		mes "�R�̓V�C�͂��}�ς��邩������܂���B";
		mes "��ɂ��C�������������B";
		mes "�����Â��Ȃ邾���ŁA";
		mes "�����S�������Ȃ��Ȃ�܂�����B";
		close;
	case 4:
		mes "[�R���]";
		mes "�ł́A���C�����ā`�B";
		close;
	}
}
star_frst.gat,88,36,5	script	�`���E�W�̒�q#JQ_SE	914,{/* 12868 */
	if(Job == Job_StarEmperor) {
		mes "[�����V�X]";
		mes "���킟�c�c���̕��A�悭�������Ă܂��ˁI";
		mes "�ł��A����ɂȂ����������";
		mes "�I������킯����Ȃ��ł���H";
		mes "���ꂩ��n���̏C�Ƃ̎n�܂�ł��c�c";
		mes "�n�c�c�n�n�c�c�B";
		emotion 28,"�`���E�W�̒�q#JQ_SE";	// 12868
		close;
	}
	if(CHANGE_SE == 2) {
		mes "[�`���E�W�̒�q]";
		mes "�ł́A����͂�p�ӂ��܂�����";
		mes "�����ɍs���܂��傤�B";
		mes "������֒����Ă��Ă��������B";
		emotion 44,"�`���E�W�̒�q#JQ_SE";	// 12868
		cloakoffnpc "�`���E�W�̒�q#JQ_SEin";	// 12870
		viewpoint 1, 57, 123, 0, 0xFFFF00;	// 0x144
		close;
	}
	else if(CHANGE_SE >= 3) {
		mes "[�����V�X]";
		mes "�C�Ƃ͏�肭�s���Ă�H";
		mes "�����r���ŕ�����Ȃ����Ƃ���������";
		mes "�N�G�X�g�E�B���h�E(Alt+U)���J���A";
		mes "�������Ă������m�F���Ă݂āB";
		next;
		mes "[�����V�X]";
		mes "��x�t�F�C�����ɋA�肽�����";
		mes "�����Ă��������B";
		next;
		if(select("�A��Ȃ�","�A��") == 1) {
			mes "[�����V�X]";
			mes "���������撣���Ă��������I";
			close;
		}
		mes "[�����V�X]";
		mes "����ł́A";
		mes "�t�F�C�����ɑ���܂��B";
		close2;
		warp "payon.gat", 166, 166;	// from: star_frst.gat(89, 48) port : 5121
		end;
	}
	mes "[�`���E�W�̒�q]";
	mes "����ɂ��́B";
	mes "������Ȃ���ł��ˁH";
	mes "�����̐l�ł͂Ȃ������ł����c�c";
	mes "�ǂ���������p�ł��傤�H";
	if(CHANGE_SE >= 1) set '@str$,"����ɂȂ肽������";
	next;
	switch(select('@str$,"���s","���ƂȂ�")) {
	case 1:
		mes "[�`���E�W�̒�q]";
		mes "���́I";
		mes "����ɂȂ肽����ł����H";
		mes "���[��c�c�B";
		next;
		mes "[�`���E�W�̒�q]";
		mes "�ŋ߁A����ɂȂ肽������";
		mes "���ɑ����Ȃ�܂����B";
		mes "�ǂ����Řb��ɂł�";
		mes "�Ȃ��Ă���̂ł��傤���H";
		emotion 4,"�`���E�W�̒�q#JQ_SE";	// 12868
		next;
		mes "[�`���E�W�̒�q]";
		mes "����ɂȂ�ɂ́A����^ff0000�����тɓ���^000000���A";
		mes "�C�Ƃ���邱�Ƃ������߂��܂��B";
		mes "�l�ɂƂ��č��͂���܂����A";
		mes "���͂�ς݃`���E�W�t�͂ɔF�߂����";
		mes "����ɂȂ邱�Ƃ��ł��܂��B";
		next;
		if(select("���傷��","��߂Ă���") == 2) {
			mes "[�`���E�W�̒�q]";
			mes "�͂��B";
			mes "�������l���Ă��������B";
			close;
		}
		mes "[�`���E�W�̒�q]";
		mes "�ł́A����͂�p�ӂ��܂�����";
		mes "�����ɍs���܂��傤�B";
		mes "������֒����Ă��Ă��������B";
		emotion 44,"�`���E�W�̒�q#JQ_SE";	// 12868
		delquest 11573;
		setquest 11574;	// state=1
		set CHANGE_SE,2;
		cloakoffnpc "�`���E�W�̒�q#JQ_SEin";	// 12870
		viewpoint 1, 57, 123, 0, 0xFFFF00;	// 0x144
		close;
	case 2:
		mes "[�`���E�W�̒�q]";
		mes "�n�n�n�I";
		mes "���s�ł������H";
		mes "����Ȑ[���R���܂ł���������Ƃ́A";
		mes "�ς�������ł��ˁB";
		emotion 18;	// 12868
		next;
		mes "[�`���E�W�̒�q]";
		mes "�����͏C�Ƃ̂��߂̏�ł���A";
		mes "���s�ɗ��������y���߂�悤�Ȃ��̂�";
		mes "�Ȃɂ�����܂���B";
		mes "�������A���܂ɂ͑呛�����ėV�Ԃ��A";
		mes "�Â��Ȏ��Ԃ��߂����̂�";
		mes "�ǂ���������܂���ˁB";
		close;
	case 3:
		mes "[�`���E�W�̒�q]";
		mes "�����ɂ����R���K�v�Ƃ͌���܂����ˁB";
		mes "�A�n�n�n�n�I";
		emotion 18;	// 12868
		close;
	}
}

star_in.gat,182,77,0	script	#JQ_SE_hide_in	139,14,14,{/* 12869 */
	if(CHANGE_SE == 2) {
		cloakoffnpc "�`���E�W�̒�q#JQ_SEin";	// 12870
		end;
	}
	end;
}
star_in.gat,177,84,3	script	�`���E�W�̒�q#JQ_SEin	914,{/* 12870 (cloaking)*/
	cloakonnpc "�~�J#JQ_SE_mcff";	// 12873
	mes "[�`���E�W�̒�q]";
	mes "�����A������œ���͂������Ă��������B";
	mes "�Q���A���̕��ɂ������B";
	next;
	mes "[�Q��]";
	mes "�͂��I";
	emotion 21,"�Q��#JQ_SE";	// 12871
	next;
	mes "[�����Ȃ���荞�񂾂��ꂳ��]";
	mes "�����I�@�������!!";
	mes "�킵�̕�����ɗ����̂ɁA";
	mes "���ł�������Ȃ񂾂�I";
	cloakoffnpc "�h�D���\��#JQ_SE";	// 12872
	emotion 6,"�h�D���\��#JQ_SE";	// 12872
	next;
	mes "[�`���E�W�̒�q]";
	mes "�h�D���\���̂��V�́A";
	mes "���̌��̓_�����Ɠ`�����ł͂���܂��񂩁H";
	emotion 19,"�`���E�W�̒�q#JQ_SEin";	// 12870
	next;
	mes "[�h�D���\��]";
	mes "����A����̓~�J�a�̂��l���ł���A";
	mes "�`���E�W�a�̕Ԏ��ł͂Ȃ����Ⴀ��܂��񂩁I";
	next;
	mes "[�`���E�W�̒�q]";
	mes "�`���E�W�t�͂͌��݊O�o���ł��B";
	mes "������t�͑�̌��t���A�t�͂̌��t�ł��B";
	mes "�ǂ����Ă��`���E�W�t�͂�";
	mes "�`���������Ƃ�����܂�����A";
	mes "���Ȃ��c���Ă��������B";
	next;
	mes "[�h�D���\��]";
	mes "�킵�����̌��t�����񕷂����Ǝv���Ă�񂾁I";
	mes "���x�K�˂Ă��O�o���c�c";
	mes "���Ȃ��c���Ă���Ƃ�������Ȃ����B";
	mes "���܂ł킵���c�������Ȃ��܂Ƃ߂��";
	mes "�������̖{�ɂȂ邾��I";
	next;
	mes "[�`���E�W�̒�q]";
	mes "�������܂��Ă��c�c�B";
	emotion 19,"�`���E�W�̒�q#JQ_SEin";	// 12870
	next;
	mes "[�����̐���]";
	mes "�����ł����H�@�����V�X�B";
	cloakoffnpc "�~�J#JQ_SE_mcff";	// 12873
	cutin "se_moon01.bmp", 2;
	next;
	mes "[�`���E�W�̒�q�@�����V�X]";
	mes "���I�@�~�J�t�͑�I";
	mes "���傤�ǂ����Ƃ���ɂ�������Ⴂ�܂����B";
	mes "�h�D���\���̂��V�̂��܂��c�c�B";
	cutin "se_moon01.bmp", 255;
	emotion 26,"�`���E�W�̒�q#JQ_SEin";	// 12870
	next;
	mes "[�~�J]";
	mes "���V�́B";
	mes "�����͏C�Ǝ҂̂��߂̏ꏊ�ł��B";
	mes "�t�͂��A���Ă�����";
	mes "�l�𑗂��Ă��m�点���܂�����A";
	mes "���͂�������肭�������B";
	cutin "se_moon01.bmp", 2;
	next;
	mes "[�h�D���\��]";
	mes "�������~�J�a�I";
	mes "������΂���ŁA�������N�ڂł����I";
	mes "�`���E�W�a�͂��ɂȂ�����";
	mes "�A���Ă���̂ł����H";
	cutin "se_moon01.bmp", 255;
	next;
	mes "[�~�J]";
	mes "�t�͂����A���ė��邩�́A";
	mes "�t�݂͂̂��m�邱�Ƃł��B";
	cutin "se_moon01.bmp", 2;
	next;
	mes "[�h�D���\��]";
	mes "���Ƃ��Ă��A�����҂��������ɂ�";
	mes "������̂ł���B";
	mes "�킵�̑����A����ɂȂ�����";
	mes "��𒷂����đ҂��Ă����ł���`�B";
	cutin "se_moon01.bmp", 255;
	emotion 19,"�h�D���\��#JQ_SE";	// 12872
	next;
	mes "[�h�D���\��]";
	mes "�`���E�W�a�̑��q�ł���A";
	mes "�t�͑�ł�����~�J�a��";
	mes "�u���O�����ꂩ�琯��Ƃ��ĔF�߂悤�v��";
	mes "�ꌾ��������΍ςނ̂�";
	mes "�_���o���΂���Łc�c�B";
	next;
	mes "[�~�J]";
	mes "���͂��m�F�������Ƃ��Ȃ��҂��A";
	mes "����ł���ƔF�߂��ɂ͂����܂���B";
	mes "�ǂ�����������肭�������B";
	mes "���ɂ��K��̍ۂ́A�i���\���a��";
	mes "���ɂ��������邱�Ƃ��肢�܂��B";
	mes "�ł́A����B";
	cutin "se_moon01.bmp", 2;
	next;
	cloakonnpc "�~�J#JQ_SE_mcff";	// 12873
	mes "[�h�D���\��]";
	mes "������ƁA�~�J�a!!";
	mes "�҂��Ă�������!!";
	cutin "se_moon01.bmp", 255;
	next;
	cloakonnpc "�h�D���\��#JQ_SE";	// 12872
	mes "[�����V�X]";
	mes "�����I�@�~�J�t�͑�!!";
	mes "�҂��Ă���������!!";
	delquest 11574;
	setquest 11575;	// state=1
	set CHANGE_SE,3;
	close2;
	cloakonnpc "�`���E�W�̒�q#JQ_SEin";	// 12870
	warp "star_frst.gat", 62, 116;	// from: star_in.gat(181, 80)
	end;
OnInit:
	cloakonnpc;
	end;
}
star_in.gat,180,86,3	script	�Q��#JQ_SE	778,{/* 12871 */
	mes "[�Q��]";
	mes "��������Ⴂ�B";
	mes "���D���ȐȂɍ����Ă��������B";
	close;
}
star_in.gat,173,82,7	script	�h�D���\��#JQ_SE	866,{/* 12872 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
star_in.gat,176,80,3	script	�~�J#JQ_SE_mcff	10297,{/* 12873 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
star_in.gat,180,91,3	script	���q#JQ_SE_1	68,{/* 12874 */
	mes "[���q]";
	mes "�C�Ƃ̍��ԂɈ��ށA��t�̂����I";
	mes "���ꂪ�܂��ʊi�̖��Ȃ񂾁I";
	close;
}
star_in.gat,182,91,3	script	���q#JQ_SE_2	787,{/* 12875 */
	mes "[���q]";
	mes "�c�c�B";
	close;
}
star_in.gat,184,91,3	script	���q#JQ_SE_3	814,{/* 12876 */
	mes "[���q]";
	mes "��҂��C�Ƃ��Ȃ��Ⴂ���Ȃ��̂��ȁH";
	close;
}
star_in.gat,172,91,5	script	���q#JQ_SE_4	881,{/* 12877 */
	mes "[���q]";
	mes "�ӂ��A��ꂽ�c�c";
	mes "���ʂ�����!!";
	close;
}
star_in.gat,172,75,5	script	���q#JQ_SE_5	931,{/* 12878 */
	mes "[���q]";
	mes "�����͉���H�ׂ悤���`�B";
	close;
}

star_frst.gat,72,158,0	script	�C�Ǝ�#JQ_SE1	4239,{/* 12879 */
	mes "[�C�Ǝ�]";
	mes "�͂����I�I�I�I�I�I�I";
	close;
}
star_frst.gat,70,158,0	script	�C�Ǝ�#JQ_SE2	4239,{/* 12880 */
	mes "[�C�Ǝ�]";
	mes "���悧�����I�I";
	close;
}
star_frst.gat,68,158,0	script	�C�Ǝ�#JQ_SE3	4239,{/* 12881 */
	mes "[�C�Ǝ�]";
	mes "�ق����I�I";
	close;
}
star_frst.gat,66,158,0	script	�C�Ǝ�#JQ_SE4	4239,{/* 12882 */
	mes "[�C�Ǝ�]";
	mes "�ӂ��I�I�I";
	close;
}
star_frst.gat,64,158,0	script	�C�Ǝ�#JQ_SE5	4239,{/* 12883 */
	mes "[�C�Ǝ�]";
	mes "�Ƃ��[���I�I�I";
	close;
}
star_frst.gat,72,156,0	script	�C�Ǝ�#JQ_SE6	4239,{/* 12884 */
	mes "[�C�Ǝ�]";
	mes "�͂����������������I�I";
	close;
}
star_frst.gat,70,156,0	script	�C�Ǝ�#JQ_SE7	4239,{/* 12885 */
	mes "[�C�Ǝ�]";
	mes "�₠���I�I";
	close;
}
star_frst.gat,68,156,0	script	�C�Ǝ�#JQ_SE8	4239,{/* 12886 */
	mes "[�C�Ǝ�]";
	mes "�����������I";
	close;
}
star_frst.gat,66,156,0	script	�C�Ǝ�#JQ_SE9	4239,{/* 12887 */
	mes "[�C�Ǝ�]";
	mes "�������I";
	close;
}
star_frst.gat,64,156,0	script	�C�Ǝ�#JQ_SE10	4239,{/* 12888 */
	mes "[�C�Ǝ�]";
	mes "�Ƃ���I�I�I";
	close;
}
star_frst.gat,72,154,0	script	�C�Ǝ�#JQ_SE11	4239,{/* 12889 */
	mes "[�C�Ǝ�]";
	mes "�Ђ您���I�I";
	close;
}
star_frst.gat,70,154,0	script	�C�Ǝ�#JQ_SE12	4239,{/* 12890 */
	mes "[�C�Ǝ�]";
	mes "�͂����I�I";
	close;
}
star_frst.gat,68,154,0	script	�C�Ǝ�#JQ_SE13	4239,{/* 12891 */
	mes "[�C�Ǝ�]";
	mes "�g���b�I�I";
	close;
}
star_frst.gat,66,154,0	script	�C�Ǝ�#JQ_SE14	4239,{/* 12892 */
	mes "[�C�Ǝ�]";
	mes "�����傧�`�`";
	close;
}
star_frst.gat,64,154,0	script	�C�Ǝ�#JQ_SE15	4239,{/* 12893 */
	mes "[�C�Ǝ�]";
	mes "�������[�[�[�[�[�����I";
	close;
}
star_frst.gat,72,152,0	script	�C�Ǝ�#JQ_SE16	4239,{/* 12894 */
	mes "[�C�Ǝ�]";
	mes "�����I�I�I�I";
	close;
}
star_frst.gat,70,152,0	script	�C�Ǝ�#JQ_SE17	4239,{/* 12895 */
	mes "[�C�Ǝ�]";
	mes "�^�A�b�I�I�I";
	close;
}
star_frst.gat,68,152,0	script	�C�Ǝ�#JQ_SE18	4239,{/* 12896 */
	mes "[�C�Ǝ�]";
	mes "�L���I�H�H�H�I�I";
	close;
}
star_frst.gat,66,152,0	script	�C�Ǝ�#JQ_SE19	4239,{/* 12897 */
	mes "[�C�Ǝ�]";
	mes "�ق����I";
	close;
}
star_frst.gat,64,152,0	script	�C�Ǝ�#JQ_SE20	4239,{/* 12898 */
	mes "[�C�Ǝ�]";
	mes "����I";
	close;
}
star_frst.gat,117,156,5	script	�C�Ǝ�#JQ_SE21	4239,{/* 12899 */
	mes "[�C�Ǝ�]";
	mes "�����Y��ɖ����̂��C�Ƃ̈ꕔ�ł��B";
	close;
}
star_frst.gat,104,150,6	script	�C�Ǝ�#JQ_SE22	4047,{/* 12900 */
	mes "[�C�Ǝ�]";
	mes "���_�C�ƒ�������A�ז����Ȃ��ł��������B";
	close;
}
star_frst.gat,106,150,6	script	�C�Ǝ�#JQ_SE23	4047,{/* 12901 */}
star_frst.gat,108,150,6	script	�C�Ǝ�#JQ_SE24	4047,{/* 12902 */}
star_frst.gat,110,150,6	script	�C�Ǝ�#JQ_SE25	4047,{/* 12903 */}
star_frst.gat,112,150,6	script	�C�Ǝ�#JQ_SE26	4047,{/* 12904 */}
star_frst.gat,114,150,6	script	�C�Ǝ�#JQ_SE27	4047,{/* 12905 */}
star_frst.gat,86,126,5	script	�C�Ǝ�#JQ_SE28	4047,{/* 12906 */
	mes "[�C�Ǝ�]";
	mes "�����Y�킾�ƁA�S���Y��ɂȂ�C�����܂��B";
	close;
}
star_frst.gat,113,99,5	script	�C�Ǝ�#JQ_SE29	4239,{/* 12907 */
	mes "[�C�Ǝ�]";
	mes "���̐΂́A�������債��������";
	mes "�����Ă������̂ł��B";
	mes "�h�����X�Ɩ��t���܂����B";
	close;
}
star_frst.gat,152,158,7	script	�C�Ǝ�#JQ_SE30	819,{/* 12908 */
	mes "[�C�Ǝ�]";
	mes "�����I�I";
	close;
}
star_frst.gat,152,156,5	script	�C�Ǝ�#JQ_SE31	929,{/* 12909 */
	mes "[�C�Ǝ�]";
	mes "�����I�I";
	close;
}
star_frst.gat,152,154,5	script	�C�Ǝ�#JQ_SE32	841,{/* 12910 */
	mes "[�C�Ǝ�]";
	mes "�����I�I";
	close;
}
star_frst.gat,152,152,5	script	�C�Ǝ�#JQ_SE33	843,{/* 12911 */
	mes "[�C�Ǝ�]";
	mes "�����I�I";
	close;
}
star_frst.gat,154,158,3	script	�C�Ǝ�#JQ_SE34	934,{/* 12912 */
	mes "[�C�Ǝ�]";
	mes "�ɁI�I";
	close;
}
star_frst.gat,154,156,3	script	�C�Ǝ�#JQ_SE35	964,{/* 12913 */
	mes "[�C�Ǝ�]";
	mes "�ɁI�I";
	close;
}
star_frst.gat,154,154,3	script	�C�Ǝ�#JQ_SE36	979,{/* 12914 */
	mes "[�C�Ǝ�]";
	mes "�ɁI�I";
	close;
}
star_frst.gat,154,152,3	script	�C�Ǝ�#JQ_SE37	644,{/* 12915 */
	mes "[�C�Ǝ�]";
	mes "�ɁI�I";
	close;
}

star_frst.gat,69,118,0	script	#JQ_SE_hide	139,14,14,{/* 12916 */
	if(CHANGE_SE == 3) {
		cloakoffnpc "�����V�X#JQ_SEcff";	// 12918
		cloakoffnpc "�~�J#JQ_SE";	// 12917
	}
	else if(CHANGE_SE == 4) {
		cloakoffnpc "�����V�X#JQ_SEcff";	// 12918
	}
	end;
}
star_frst.gat,69,118,5	script	�~�J#JQ_SE	10297,{/* 12917 (cloaking)*/
	if(CHANGE_SE == 3) {
		mes "[�����V�X]";
		mes "�~�J�t�͑�I";
		mes "������Ƒ҂��Ă��������B";
		next;
		mes "[�~�J]";
		mes "��������܂������H�@�����V�X�B";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�����V�X]";
		mes "���́c�c�����炪���債���΂����";
		mes ""+strcharinfo(0)+"�a�ł��B";
		mes "����Ƃ��~�J�t�͑��";
		mes "�ʓ|�����Ă������������āc�c�B";
		cutin "se_moon01.bmp", 255;
		next;
		mes "[�~�J]";
		mes "�����A��قǗׂɂ��炵�����ł���ˁB";
		mes "���Ζʂ̕��ɒp���������p��";
		mes "���������Ă��܂��܂����ˁB";
		mes "�͂͂́c�c�B";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�ӂށc�c";
		mes "�ق��c�c";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�Ȃ�قǁc�c�f���炵���C���B";
		mes "�ӂށc�c�B";
		next;
		mes "[�����V�X]";
		mes "���́c�c�~�J�t�͑�c�c�H";
		cutin "se_moon02.bmp", 255;
		next;
		mes "[�~�J]";
		mes "�����c�c";
		mes "�\���󂠂�܂���B";
		mes "���ȏЉ��Y��Ă��܂����ˁB";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�~�J�Ɛ\���܂��B";
		mes "�`���E�W�t�͂ɑ�����";
		mes "�����т̊Ǘ���C����Ă���܂��B";
		mes "��������܂�����A���ɕ����Ă��������B";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�C�Ƃɂ��Ă�";
		mes "�ڂ������������Ƃ���ł����A";
		mes "���͋}���̗p��������̂ł���Ŏ��炵�܂��B";
		mes "����Ƀj�b�R�c�c";
		mes "����c�c�����ށc�c�B";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�c�c�����V�X�A";
		mes ""+strcharinfo(0)+"�a��";
		mes "�����т̈ē������肢���܂��B";
		mes "���͗p�����I�������A�����߂�܂��B";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�����V�X]";
		mes "�́c�c�͂��I";
		mes "����܂����B";
		mes "�~�J�t�͑�I";
		cutin "se_moon01.bmp", 255;
		delquest 11575;
		setquest 11576;	// state=1
		set CHANGE_SE,4;
		close2;
		cloakonnpc "�~�J#JQ_SE";	// 12917
		end;
	}
	else if(CHANGE_SE == 4) {
		// ������
	}
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,66,118,5	script	�����V�X#JQ_SEcff	914,{/* 12918 (cloaking)*/
	if(CHANGE_SE == 3) {
		mes "[�����V�X]";
		mes "����ƒǂ����܂����B";
		mes "�~�J�t�͑�ɘb�������Ă��������B";
		close;
	}
	else if(CHANGE_SE == 4) {
		mes "[�����V�X]";
		mes "�ӂӁc�c";
		mes "����œ����t�͑�̉��ŁA";
		mes "�������̔т�H�ׂ钇�ɂȂ����ˁI";
		next;
		mes "[�����V�X]";
		mes "���̓����V�X�B";
		mes "�V�l�̎�t�S����I";
		mes "�~�J�t�͑�قǂł͂Ȃ�����ǁA";
		mes "�l������ڂ͂�����ł��B";
		mes "�����Ȏ��͂̎�����łȂ���΁A";
		mes "���傳�������Ȃ��񂾂�I";
		next;
		mes "[�����V�X]";
		mes "���ꂶ��{�i�I�ȌP���ɓ���O�ɁA";
		mes "�����т̈ē������悤�B";
		next;
		mes "[�����V�X]";
		mes "���A�������̂���ꏊ�������ŁA";
		mes "�����̓���H���Ėk�֍s���ƁA";
		mes "�`���E�W�t�͂Ǝt�͑�̏h������B";
		next;
		mes "[�����V�X]";
		mes "�ЂƂ܂��C�Ƃ̊Ԃɂ��񂽂����܂�h��";
		mes "�Љ���B";
		mes "�������֗��āB";
		delquest 11576;
		setquest 11577;	// state=1
		set CHANGE_SE,5;
		viewpoint 1, 129, 86, 0, 0xFFFF00;	// 0x144
		cloakoffnpc "�����V�X#JQ_SEen";	// 12920
		close;
	}
	else if(CHANGE_SE == 5) {
		mes "[�����V�X]";
		mes "���A�������̂���ꏊ�������ŁA";
		mes "�����̓���H���Ėk�֍s���ƁA";
		mes "�`���E�W�t�͂Ǝt�͑�̏h������B";
		next;
		mes "[�����V�X]";
		mes "�ЂƂ܂��C�Ƃ̊Ԃɂ��񂽂����܂�h��";
		mes "�Љ���B";
		mes "�������֗��āB";
		viewpoint 1, 129, 86, 0, 0xFFFF00;	// 0x144
		cloakoffnpc "�����V�X#JQ_SEen";	// 12920
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,129,86,0	script	#JQ_SE_hide2	139,14,14,{/* 12919 */
	if(CHANGE_SE == 5) {
		cloakoffnpc "�����V�X#JQ_SEen";	// 12920
	}
	end;
}
star_frst.gat,129,86,5	script	�����V�X#JQ_SEen	914,{/* 12920 (cloaking)*/
	if(CHANGE_SE == 5) {
		cloakonnpc "�����V�X#JQ_SEcff";	// 12918
		mes "[�����V�X]";
		mes "�������h��B";
		mes "�L���͂Ȃ����ǁA";
		mes "���ʂɉ߂������ɂ͈����͂Ȃ���B";
		mes "�����Ă��̋u������΁c�c";
		if(!sleep2(1000)) end;
		mes "������!!";
		next;
		mes "[�����V�X]";
		mes "�M���K�t�͑�I";
		mes "����ȂƂ���ł܂��T�{���āc�c";
		mes "���ӂ�����łɏЉ�邩��A";
		mes "�ꏏ�ɂ��ė��āB";
		mes "�����̊R�̉�������Ă����̂ŁA";
		mes "�k���炮����Ɖ�荞��ł������B";
		emotion 7,"�����V�X#JQ_SEen";	// 12920
		cloakoffnpc "�����V�X#JQ_SEha";	// 12922
		delquest 11577;
		setquest 11578;	// state=1
		set CHANGE_SE,6;
		viewpoint 1, 153, 46, 0, 0xFFFF00;	// 0x144
		close;
	}
	else if(CHANGE_SE == 6) {
		mes "[�����V�X]";
		mes "�M���K�t�͑�I";
		mes "����ȂƂ���ł܂��T�{���āc�c";
		mes "���ӂ�����łɏЉ�邩��A";
		mes "�ꏏ�ɂ��ė��āB";
		mes "�����̊R�̉�������Ă����̂ŁA";
		mes "�k���炮����Ɖ�荞��ł������B";
		emotion 7,"�����V�X#JQ_SEen";	// 12920
		cloakoffnpc "�����V�X#JQ_SEha";	// 12922
		viewpoint 1, 153, 46, 0, 0xFFFF00;	// 0x144
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,148,47,0	script	#JQ_SE_hide2	139,14,14,{/* 12921 */
	if(CHANGE_SE == 6) {
		cloakoffnpc "�����V�X#JQ_SEha";	// 12922
	}
	else if(CHANGE_SE == 7) {
		if(checkquest(11579) & 0x4 == 0) {
			cloakoffnpc "�����V�X#JQ_SEha";	// 12922
		}
	}
	end;
}
star_frst.gat,148,47,5	script	�����V�X#JQ_SEha	914,{/* 12922 (cloaking)*/
	cloakonnpc "�����V�X#JQ_SEen";	// 12920
	mes "[�����V�X]";
	mes "�M���K�t�͑�I�I";
	mes "����ȏꏊ�ŃT�{���Ă���_���ł��傤�I";
	close;
OnInit:
	cloakonnpc;
	end;
}
star_frst.gat,153,46,3	script	�M���K#JQ_SE	10298,{/* 12923 */
	if(CHANGE_SE == 6) {
		cloakonnpc "�����V�X#JQ_SEen";	// 12920
		mes "[�����V�X]";
		mes "�M���K�t�͑�I�I";
		mes "����ȏꏊ�ŃT�{���Ă���_���ł��傤�I";
		mes "�~�J�t�͑オ�Ƃ��";
		mes "�ǂ�قǋ�J�Ȃ����Ă��邩�I";
		mes "�~�J�t�͑�ɁA�S���������Ă��܂�����ˁI";
		emotion 7,"�����V�X#JQ_SEha";	// 12922
		next;
		mes "[�M���K]";
		mes "�������`";
		mes "����Ȃɓ{��Ȃ��Ă���������ȁ`���B";
		emotion 20,"�M���K#JQ_SE";	// 12923
		cutin "se_star02_2.bmp", 2;
		next;
		mes "[�����V�X]";
		mes "�`���E�W�t�͂̐Ղ��p�����Ƃ�";
		mes "�Ȃ邩������Ȃ��̂ɁA";
		mes "�C�Ƃ��S�����������V�т܂����";
		mes "�ǂ������ł����I";
		cutin "se_star02_2.bmp", 255;
		next;
		mes "[�M���K]";
		mes "�����t�͂ɁH";
		mes "�͂͂́A�����߁`�B";
		mes "����Ȗʓ|���Ƃ͂��߂񂾂��`�B";
		emotion 18,"�M���K#JQ_SE";	// 12923
		cutin "se_star02_2.bmp", 2;
		next;
		mes "[�����V�X]";
		mes "�ʓ|�ł����H";
		mes "�����܂Ő��܂����˔\�������Ă�̂ɁB";
		mes "�g��Ȃ��̂Ȃ�A���ɂ���������I";
		emotion 32,"�����V�X#JQ_SEha";	// 12922
		cutin "se_star02_2.bmp", 255;
		next;
		mes "[�M���K]";
		mes "�͂��͂��`�킩������`�B";
		mes "�ŋ߂��O�������������āA";
		mes "�~�J�t�͑�Ɏ��Ă����񂶂�Ȃ��H";
		emotion 54,"�M���K#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[�M���K]";
		mes "����v���Ԃ�Ɏt�͑�炵�����Ƃł����悤���H";
		mes "�����̂��킢�q�����`�B";
		emotion 52,"�M���K#JQ_SE";	// 12923
		cutin "se_star02_1.bmp", 2;
		next;
		mes "[�����V�X]";
		mes "���c�c���킢�q�����I";
		mes "�J�߂Ă������o�܂��񂩂�ˁI";
		emotion 23,"�����V�X#JQ_SEha";	// 12922
		cutin "se_star02_1.bmp", 255;
		next;
		mes "[�M���K]";
		mes "����c�c���O����Ȃ���";
		mes "�����ɂ���V�l�̂��Ƃ���B";
		mes "�����ɂ��񂽂̎��͂������Ă��炨���B";
		emotion 32,"�M���K#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�V���o���c�o���h�ɃA�C���x�t�Ƃ�����������B";
		mes "���̎��ӂɂ���^ff0000�~�l����^000000";
		mes "�Ƃ��������X�^�[��^ff00001��^000000�|���Ă��Ă���B";
		cutin "se_star01.bmp", 2;
		next;
		mes "[�����V�X]";
		mes "�t�͑�I";
		mes "�A�C���x�t�͉������܂���I";
		emotion 23,"�����V�X#JQ_SEha";	// 12922
		cutin "se_star01.bmp", 255;
		next;
		mes "[�M���K]";
		mes "���傤���˂��`�ȁB";
		mes "�߂��܂ő����Ă�邩��A";
		mes "������Ȃ��Ă������ŒT���񂾂��B";
		mes "������܂߂Ă̏C�Ƃ�����ȁB";
		emotion 2,"�M���K#JQ_SE";	// 12923
		cutin "se_star01.bmp", 2;
		delquest 11578;
		setquest 11579;	// state=1
		set CHANGE_SE,7;
		next;
		if(select("�����Ă��炤","�����ōs��") == 2) {
			mes "[�M���K]";
			mes "�������`�B";
			mes "�ʓ|�Ȃ̂Ɋ撣��Ȃ��`�B";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		// ������
		mes "[�M���K]";
		mes "�����Ă͂�邪�A";
		mes "�A��͎����łȂ�Ƃ�����񂾂��`�B";
		mes "����������";
		mes "�����ŃZ�[�u�͂��Ƃ��Ă���B";
		mes "�����͂������`�H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�M���K]";
			mes "�������I�������";
			mes "�����Ă���B";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		mes "[�M���K]";
		mes "����ł͂������`�B";
		close2;
		cutin "se_star01.bmp", 255;
		savepoint "star_frst.gat",144,49;
		warp "ein_fild05.gat", 80, 294;	// from: star_frst.gat(146, 51) port : 5129
		end;
	}
	else if(CHANGE_SE == 7) {
		if(checkquest(11579) & 0x4) {
			cloakonnpc "�����V�X#JQ_SEha";	// 12922
			mes "[�M���K]";
			mes "�ւ��c�c";
			mes "�����Ɠ|���Ă����悤���ȁB";
			emotion 23,"�M���K#JQ_SE";	// 12923
			cutin "se_star03.bmp", 2;
			next;
			mes "[�M���K]";
			mes "�c�c���ꂾ������������Ȃ�A";
			mes "�����C�ƃo�J�̃j�b�R�E�t�͑�̕���";
			mes "���������ȁB";
			mes "��������k�̕��ɂ��錚���ɂ��邺�B";
			emotion 19,"�M���K#JQ_SE";	// 12923
			cutin "se_star01.bmp", 2;
			next;
			mes "[�M���K]";
			mes "�C�Ƃƌ����΁A������傾���炳�B";
			mes "���͂���Ȃ̐��ɍ���Ȃ�����ˁ`�B";
			cutin "se_star02_2.bmp", 2;
			delquest 11579;
			setquest 11580;	// state=1
			set CHANGE_SE,8;
			viewpoint 1, 150, 176, 0, 0xFFFF00;	// 0x144
			close2;
			cutin "se_star02_2.bmp", 255;
			end;
		}
		mes "[�M���K]";
		mes "�V���o���c�o���h�ɃA�C���x�t�Ƃ�����������B";
		mes "���̎��ӂɂ���^ff0000�~�l����^000000";
		mes "�Ƃ��������X�^�[��^ff00001��^000000�|���Ă��Ă���B";
		cutin "se_star01.bmp", 2;
		next;
		mes "[�����V�X]";
		mes "�t�͑�I";
		mes "�A�C���x�t�͉������܂���I";
		emotion 23,"�����V�X#JQ_SEha";	// 12922
		cutin "se_star01.bmp", 255;
		next;
		mes "[�M���K]";
		mes "���傤���˂��`�ȁB";
		mes "�߂��܂ő����Ă�邩��A";
		mes "������Ȃ��Ă������ŒT���񂾂��B";
		mes "������܂߂Ă̏C�Ƃ�����ȁB";
		emotion 2,"�M���K#JQ_SE";	// 12923
		cutin "se_star01.bmp", 2;
		next;
		if(select("�����Ă��炤","�����ōs��") == 2) {
			mes "[�M���K]";
			mes "�������`�B";
			mes "�ʓ|�Ȃ̂Ɋ撣��Ȃ��`�B";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		mes "[�M���K]";
		mes "�����Ă͂�邪�A";
		mes "�A��͎����łȂ�Ƃ�����񂾂��`�B";
		mes "����������";
		mes "�����ŃZ�[�u�͂��Ƃ��Ă���B";
		mes "�����͂������`�H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�M���K]";
			mes "�������I�������";
			mes "�����Ă���B";
			close2;
			cutin "se_star01.bmp", 255;
			end;
		}
		mes "[�M���K]";
		mes "����ł͂������`�B";
		close2;
		cutin "se_star01.bmp", 255;
		savepoint "star_frst.gat",144,49;
		warp "ein_fild05.gat", 80, 294;	// from: star_frst.gat(146, 51) port : 5129
		end;
	}
	else if(CHANGE_SE == 8) {
		mes "[�M���K]";
		mes "�c�c���ꂾ������������Ȃ�A";
		mes "�����C�ƃo�J�̃j�b�R�E�t�͑�̕���";
		mes "���������ȁB";
		mes "��������k�̕��ɂ��錚���ɂ��邺�B";
		emotion 19,"�M���K#JQ_SE";	// 12923
		cutin "se_star01.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�C�Ƃƌ����΁A������傾���炳�B";
		mes "���͂���Ȃ̐��ɍ���Ȃ�����ˁ`�B";
		cutin "se_star02_2.bmp", 2;
		viewpoint 1, 150, 176, 0, 0xFFFF00;	// 0x144
		close2;
		cutin "se_star02_2.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 9) {
		// ������
	}
	else if(CHANGE_SE == 10 || CHANGE_SE == 11) {
		mes "[�M���K]";
		mes "���H";
		mes "�����V�X�̓z�A";
		mes "�}�W�Ō������₪�����̂��H";
		mes "�������I";
		emotion 19,"�M���K#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�Ȃɂځ[���Ƃ��Ă�񂾁H";
		mes "�j�b�R�E�̕����ɍs�����B";
		mes "�͂�`���ė����B";
		emotion 27,"�M���K#JQ_SE";	// 12923
		if(CHANGE_SE == 10) {
			delquest 11582;
			setquest 11583;	// state=1
			set CHANGE_SE,11;
		}
		close2;
		cutin "se_star03.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 13) {
		// ������
		mes "[�M���K]";
		mes "�������c�c";
		mes "�t�͂ɂ����܂Ō���ꂽ�Ȃ�d���Ȃ��B";
		emotion 32,"�M���K#JQ_SE";	// 12923
		cutin "se_star03.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�V�����X�L�����w�ԑO�ɁA";
		mes "���̃X�L���|�C���g��";
		mes "�S������U���Ă���B";
		close2;
		cutin "se_star03.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 14) {
		mes "[�M���K]";
		mes "�ŋߏC�Ƃ͂ǂ��H";
		mes "�悭�킩��Ȃ����́A��Ԋ�b�I�ȕ�������";
		mes "��������U��Ԃ��Ă݂�̂��A";
		mes "�C�Ƃ̖��ɗ��C������B";
		cutin "se_star02_2.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�t�F�C�����ɑ��낤���H";
		next;
		if(select("�A��Ȃ�","�A��") == 1) {
			mes "[�M���K]";
			mes "�������B";
			close2;
			cutin "se_star02_2.bmp", 255;
			end;
		}
		mes "[�M���K]";
		mes "�����A���邼�B";
		close2;
		cutin "se_star02_2.bmp", 255;
		warp "payon.gat", 166, 166;	// from: star_frst.gat(146, 51) port : 5121
		end;
	}
	mes "[�M���K]";
	mes "�Ђ�`�����V�C���`�B";
	mes "�ދ�������A";
	mes "�t�F�C�����֗V�тɍs�������ȁ`�B";
	cutin "se_star02_2.bmp", 2;
	close2;
	cutin "se_star02_2.bmp", 255;
	end;
}
star_in.gat,98,67,3	script	�j�b�R�E#JQ_SE	10296,{/* 12924 */
	if(CHANGE_SE == 8) {
		mes "[�j�b�R�E]";
		mes "�O������S���\��A�O������S���\�O�A";
		mes "�O������S���\�l�A�O������S���\�܁A";
		mes "�O������S���\�Z�A";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�O������S���\���A�O������S���\���A";
		mes "�O������S���\��c�c";
		next;
		menu "�b�������Ă݂�",-;
		mes "[�j�b�R�E]";
		mes "�O������S��\�c�c�ǂ������H";
		mes "�O������S��\��A�O������S��\�O�A";
		next;
		menu "�C�Ƃɂ��ĕ���",-;
		mes "[�j�b�R�E]";
		mes "�O������S��\�l�A�O������S��\�܁A";
		mes "�O������S��\�Z�A�O������S��\���A";
		mes "�O������S��\���A�O������S��\��A";
		mes "�l���B";
		next;
		mes "[�j�b�R�E]";
		mes "�ӂ��c�c";
		mes "�C�Ƃ��B";
		mes "�����͂���ɂ��悭�킩��Ȃ��̂���B";
		next;
		mes "[�j�b�R�E]";
		mes "���̍g���r�́A";
		mes "���킪�����ɗ�������";
		mes "�`���E�W�������܂������Ă��ꂽ���̂���B";
		mes "�����āA���̓������g���r�Ɏ���܂ŁA";
		mes "�₦���g���r�̗��K�����Ă���B";
		next;
		mes "[�j�b�R�E]";
		mes "����ȊO�̂��ƂȂ�c�c";
		mes "�ӂށc�c��������I";
		mes "����ς����Ƃ�^ff0000�ς̐K����1��^000000";
		mes "�����čs����^ff0000�~�J^000000����Ԃ��B";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "������s���������A";
		mes "�g���r�̏C�Ƃ��Z��������ȁB";
		mes "����ɂ���̏R��p���[��";
		mes "�߂��܂Ŕ�΂��Ă�����̂���B";
		mes "�߂��ɋ���ς����Ȃ��Ă�";
		mes "�����ŒT���̂��Ⴜ�B";
		delquest 11580;
		setquest 11581;	// state=1
		set CHANGE_SE,9;
		next;
		if(select("��΂��Ă��炤","�����ōs��") == 2) {
			mes "[�j�b�R�E]";
			mes "��������ȁB";
			mes "������C�Ƃ���ȁB";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		// ������
		mes "[�j�b�R�E]";
		mes "����ł͔�΂����`�B";
		mes "�A��͎����łȂ�Ƃ�����̂���B";
		mes "��΂�����";
		mes "�����ŃZ�[�u�͂��Ƃ��Ă�����̂���B";
		mes "�����͂������́H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�j�b�R�E]";
			mes "�������I�������";
			mes "�����Ă���Ȃ̂���B";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[�j�b�R�E]";
		mes "����ł͂����̂���B";
		close2;
		cutin "se_sun01.bmp", 255;
		savepoint "star_frst.gat", 152, 170;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	else if(CHANGE_SE == 9) {
		if(countitem(1022) > 0) {
			mes "[�j�b�R�E]";
			mes "����Ɍς̐K���͕K�v�Ȃ��̂���B";
			mes "^ff0000�~�J^000000�̂Ƃ���Ɏ����čs���̂���B";
			mes "�����̓���k�ɂ�����";
			mes "���̌����ɂ���̂���B";
			mes "�����O�ɂ͏C�Ǝ҂������ς����邩��";
			mes "�����킩��Ǝv�����B";
			cutin "se_sun01.bmp", 2;
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[�j�b�R�E]";
		mes "����ȊO�̂��ƂȂ�c�c";
		mes "�ӂށc�c��������I";
		mes "����ς����Ƃ�^ff0000�ς̐K����1��^000000";
		mes "�����čs����^ff0000�~�J^000000����Ԃ��B";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "������s���������A";
		mes "�g���r�̏C�Ƃ��Z��������ȁB";
		mes "����ɂ���̏R��p���[��";
		mes "�߂��܂Ŕ�΂��Ă�����̂���B";
		mes "�߂��ɋ���ς����Ȃ��Ă�";
		mes "�����ŒT���̂��Ⴜ�B";
		next;
		if(select("��΂��Ă��炤","�����ōs��") == 2) {
			mes "[�j�b�R�E]";
			mes "��������ȁB";
			mes "������C�Ƃ���ȁB";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[�j�b�R�E]";
		mes "����ł͔�΂����`�B";
		mes "�A��͎����łȂ�Ƃ�����̂���B";
		mes "��΂�����";
		mes "�����ŃZ�[�u�͂��Ƃ��Ă�����̂���B";
		mes "�����͂������́H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�j�b�R�E]";
			mes "�������I�������";
			mes "�����Ă���Ȃ̂���B";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[�j�b�R�E]";
		mes "����ł͂����̂���B";
		close2;
		cutin "se_sun01.bmp", 255;
		savepoint "star_frst.gat", 152, 170;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	else if(CHANGE_SE == 13) {
		// ������
		mes "[�j�b�R�E]";
		mes "�ق��c�c";
		mes "�����������Ƃ������̂��B";
		mes "�ǂ������������Ƃ͎v���Ă����ǁA";
		mes "�[���l���ĂȂ������̂���B";
		cutin "se_sun02.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�������܁c�c����A";
		mes "�`���E�W�t�͂̍l���������ł���̂Ȃ�A";
		mes "����͒p���������Ȃ��悤";
		mes "�������Ă݂���̂���B";
		cutin "se_sun01.bmp", 2;
		next;
		if(SkillPoint) {
			mes "[�j�b�R�E]";
			mes "�V�����X�L�����w�ԏ�����";
			mes "�o���Ă����́B";
			mes "�X�L���|�C���g��S������U���Ă���";
			mes "�o�����̂���B";
			cutin "se_sun03.bmp", 2;
			close2;
			cutin "se_sun03.bmp", 255;
			end;
		}
		if(Weight) {
			mes "[�j�b�R�E]";
			mes "����炢�낢�뎝���Ă���̂��B";
			mes "�ז�������A�����̑q�ɂɗa����̂���B";
			cutin "se_sun03.bmp", 2;
			close2;
			cutin "se_sun03.bmp", 255;
			end;
		}
		mes "[�j�b�R�E]";
		mes "�����A�󂯎��B";
		mes "�V����������B";
		mes "�����炨��͐���̓�����ނ��ƂɂȂ�B";
		cutin "se_sun01.bmp", 2;
		@changeoptionend opt1: 0, opt2: 0	// self
		@changeoptionend opt1: 0, opt2: 0	// self
		delquest 11585;
		setquest 202185;	// state=1
		set CHANGE_SE,14;
		next;
		mes "[�j�b�R�E]";
		mes "�������������ɂȂ炸�Ƃ��A";
		mes "�����n���ɏC�Ƃ��d�˂Ă����΁A";
		mes "�F���̕����炨��ɋߕt���Ă��邶���B";
		mes "�S�苭���A���i����̂��Ⴜ�B";
		cutin "se_sun02.bmp", 2;
		close2;
		cutin "se_sun02.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 14) {
		mes "[�j�b�R�E]";
		mes "�C�Ƃ͂ǂ������̂���H";
		mes "���Ɏv�������Ԃ��̂�������΁A";
		mes "���ɍg���r������Ă݂�̂������̂���B";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�t�F�C�����ɑ��낤���́H";
		next;
		if(select("�A��Ȃ�","�A��") == 1) {
			mes "[�j�b�R�E]";
			mes "�������B";
			close2;
			cutin "se_sun01.bmp", 255;
			end;
		}
		mes "[�j�b�R�E]";
		mes "���ꂶ�Ⴀ�A����̂���B";
		close2;
		cutin "se_sun01.bmp", 255;
		warp "payon.gat", 166, 166;	// from: star_in.gat(102, 72) port : 5121
		end;
	}
	mes "[�j�b�R�E]";
	mes "�g���r�̏C�Ƃɗ�ނ̂���B";
	cutin "se_sun01.bmp", 2;
	close2;
	cutin "se_sun01.bmp", 255;
	end;
}
star_frst.gat,152,170,0	script	#JQ_SE_hide3	139,3,3,{/* 12925 */
	if(CHANGE_SE == 9 && countitem(1022) > 0) {
		viewpoint 1, 68, 173, 0, 0xFFFF00;	// 0x144
	}
	end;
}
star_in.gat,146,48,3	script	�~�J#JQ_SEin	10297,{/* 12926 */
	if(CHANGE_SE == 9 && countitem(1022) > 0) {
		mes "[�~�J]";
		mes "�ǂ�����܂������H";
		emotion 1,"�~�J#JQ_SEin";	// 12926
		cutin "se_moon02.bmp", 2;
		next;
		menu "�j�b�R�E�t�͑ォ�痊�܂ꂽ",-;
		mes "[�~�J]";
		mes "�����c�c";
		mes "�����l�ł����B";
		mes "����ς͎g�����������̂ł��B";
		emotion 15,"�~�J#JQ_SEin";	// 12926
		cutin "se_moon03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�j�b�R�E�a�͂��܂ɕ�������";
		mes "�o�ė����Ǝv������A";
		mes "����ς��ł�����C�Ŏ��s��������A";
		mes "���X�S�z�ɂȂ�܂��c�c�B";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�Ƃ���ŁA�����V�X�ɕ������b����";
		mes "^ff0000�M���K^000000�ɂ�������悤�ł��ˁH";
		next;
		mes "[�~�J]";
		mes "��q�����̖ʓ|�����Ă���";
		mes "�����Ă������̂ɁA";
		mes "�j�b�R�E�a�̂Ƃ���։������Ƃ���";
		mes "���𔄂��Ă���Ƃ́c�c�����c�c�B";
		emotion 54,"�~�J#JQ_SEin";	// 12926
		cutin "se_moon02.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�����A�܂��M���K�ɉ�܂�����A";
		mes "�j�b�R�E�a�̕����֍s���悤��";
		mes "�`���Ă��������܂����H";
		mes "���肢���܂��B";
		cutin "se_moon01.bmp", 2;
		delitem 1022,1;
		delquest 11581;
		setquest 11582;	// state=1
		set CHANGE_SE,10;
		close2;
		cutin "se_moon01.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 10) {
		mes "[�~�J]";
		mes "�Ƃ���ŁA�����V�X�ɕ������b����";
		mes "^ff0000�M���K^000000�ɂ�������悤�ł��ˁH";
		next;
		mes "[�~�J]";
		mes "��q�����̖ʓ|�����Ă���";
		mes "�����Ă������̂ɁA";
		mes "�j�b�R�E�a�̂Ƃ���։������Ƃ���";
		mes "���𔄂��Ă���Ƃ́c�c�����c�c�B";
		emotion 54,"�~�J#JQ_SEin";	// 12926
		cutin "se_moon02.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�����A�܂��M���K�ɉ�܂�����A";
		mes "�j�b�R�E�a�̕����֍s���悤��";
		mes "�`���Ă��������܂����H";
		mes "���肢���܂��B";
		cutin "se_moon01.bmp", 2;
		close2;
		cutin "se_moon01.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 13) {
		// ������
		mes "[�~�J]";
		mes "����Ȃɋ߂��ɂ���������̂ɁA";
		mes "�C�t���Ȃ������Ƃ́B";
		mes "�܂��܂��C�Ƃ�����Ȃ��悤�ł��B";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "������" +strcharinfo(0)+ "�a�ɂ�";
		mes "�ŏ�����p�����������Ă�����ł���ˁB";
		mes "�t�͂͂���" +strcharinfo(0)+ "�a�̂��Ƃ�";
		mes "�F�߂Ă���������ƌ��Ă����ł��傤�B";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�X�L���|�C���g���c���Ă��Ă͂����܂���B";
		mes "�V�����X�L���ɂ́A�V�����X�L���|�C���g�I";
		mes "�F���̖@���݂����Ȃ��̂ł��B";
		cutin "se_moon01.bmp", 2;
		close2;
		cutin "se_moon01.bmp", 255;
		end;
	}
	else if(CHANGE_SE == 14) {
		mes "[�~�J]";
		mes "�C�Ƃ͏����ł����H";
		mes "�ǂ����l�܂�����A";
		mes "�����l�����x��ł݂�̂������ł��B";
		cutin "se_moon03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�t�F�C�����ɂ����肵�܂��傤���H";
		next;
		if(select("�A��Ȃ�","�A��") == 1) {
			mes "[�~�J]";
			mes "�����ł����B";
			close2;
			cutin "se_moon03.bmp", 255;
			end;
		}
		mes "[�~�J]";
		mes "����ł͂����肵�܂��B";
		close2;
		cutin "se_moon03.bmp", 255;
		warp "payon.gat", 166, 166;	// from: star_in.gat(143, 61) port : 5121
		end;
	}
	mes "[�~�J]";
	mes "��邱�Ƃ��I��肻���ɂ��Ȃ��B";
	mes "���ɁA���̋���ς̔炪�c�c�B";
	emotion 16;	// 12926
	cutin "se_moon02.bmp", 2;
	close2;
	cutin "se_moon02.bmp", 255;
	end;
}

star_frst.gat,89,25,0	warp	#JQ_SEin	3,3,mjolnir_03.gat,233,181 //star_frst.gat from_pos=(89, 25)
star_frst.gat,57,123,0	warp	#JQ_SE_cffin	2,2,star_in.gat,182,77 //star_frst.gat from_pos=(57, 121)
star_in.gat,180,72,0	warp	#JQ_SE_cffout	2,2,star_frst.gat,57,118 //star_in.gat from_pos=(180, 74)
star_frst.gat,150,176,0	script	#JQ_SE_sunin	45,2,2,{/* 12930 */
	if(CHANGE_SE == 11) {
		mes "�]������傫�Ȑ����������Ă���]";
		next;
		mes "[�~�J]";
		mes "�^�ʖڂɏC�Ƃ����Ȃ��ŁI";
		mes "��q�����ɂ͖ڂ����ꂸ�I";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�`���E�W�t�͂������Ȃ��󂯂Ă��鍡�����A";
		mes "�������O�l���������s�����Ȃ��ƁA";
		mes "�t�͂��A�������ɖʖڂ�";
		mes "�����Ȃ����Ⴀ��܂��񂩁I";
		next;
		mes "[�M���K]";
		mes "�t�͂͂����A���ė��Ȃ��񂶂�Ȃ��H";
		mes "���N���߂����̂ɕւ���Ȃ�����Ȃ����B";
		cutin "se_star03.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�l���Z��O�S���\�܁A�l���Z��O�S���\�Z�c�c";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�����炱���A���ӔC����������";
		mes "�s�����ė~�����̂ł���I";
		mes "�N�����D�ꂽ�˔\�������Ă��Ȃ���A";
		mes "�Ȃ�����𕅂点��̂ł����I";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�����`�A���ɓw�͂��Ȃ��Ă�";
		mes "�\����������Ȃ��B";
		mes "�ǂ����w�͂��Ă��A����܂荷�͂Ȃ��ł��傤�B";
		cutin "se_star01.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�l���Z��O�S��\�O�A�l���Z��O�S��\�l�c�c";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�t�͑�̒��̃g�b�v�ł���҂��A";
		mes "����ȂɗV��ł΂��肶��A";
		mes "���̒�q�������ǂ��v���܂����H";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�~�J�t�͑�͋C�ɂ������Ȃ񂾂�B";
		cutin "se_star02_1.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�l���Z��l�S�I";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�j�b�R�E�a���A���������Ă��������c�c�B";
		cutin "se_moon02.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�c�c";
		mes "�������H";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�Ȃɂ��H";
		cutin "se_star01.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "����Ɓc�c";
		mes "����Ɗ����ȍg���r�����������̂���I";
		mes "�}���ł������܂ɒm�点�Ȃ��ẮI";
		cutin "se_sun01.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�c�c�������܂Ƃ́H";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "�`���E�W�̂������܂Ɍ��܂��Ă�̂���I";
		cutin "se_sun02.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�j�b�R�E�a�́A�`���E�W�t�͂�";
		mes "���ǂ��ɂ����邩�������ł������H";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "����H";
		mes "�������܂Ȃ�A";
		mes "���̎R�̉��̕��ɂ��邶��Ȃ����B";
		cutin "se_sun03.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�͂��H";
		cutin "se_moon01.bmp", 2;
		next;
		mes "[�M���K]";
		mes "�ȂɁH�I";
		cutin "se_star03.bmp", 2;
		next;
		mes "[�j�b�R�E]";
		mes "���̉��N�������тɂ͂���������Ȃ��ŁA";
		mes "�R�̉��ɂ���������̂���B";
		mes "���킪�t�F�C�����Ɋ��x�A";
		mes "���y�Y�ł������������グ���̂���B";
		cutin "se_sun02.bmp", 2;
		next;
		mes "[�~�J]";
		mes "�Ȃ�Łc�c�ǂ����āc�c";
		mes "�j�b�R�E�a�A";
		mes "���������ǂ��������ƂȂ̂�";
		mes "�b���Ă��������B";
		cutin "se_moon02.bmp", 2;
		next;
		cutin "se_moon02.bmp", 255;
		mes "�]����ȏ㕷���K�v�͂Ȃ��������B";
		mes "^ff0000�`���E�W�t�͂��A�R�̉�^000000�ɂ���炵���̂�";
		mes "�R������Ă݂悤�]";
		delquest 11583;
		setquest 11584;	// state=1
		set CHANGE_SE,12;
		close;
	}
	else if(CHANGE_SE == 12) {
		mes "�]����ȏ㕷���K�v�͂Ȃ��������B";
		mes "^ff0000�`���E�W�t�͂��A�R�̉�^000000�ɂ���炵���̂�";
		mes "�R������Ă݂悤�]";
		close;
	}
	warp "star_in.gat",102,72;
	end;
}
star_in.gat,106,72,0	warp	#JQ_SE_sunout	2,2,star_frst.gat,152,170 //star_in.gat from_pos=(104, 72)
star_frst.gat,68,173,0	warp	#JQ_SE_mnin	2,2,star_in.gat,143,61 //star_frst.gat from_pos=(70, 173)
star_in.gat,147,61,0	warp	#JQ_SE_mnout	2,2,star_frst.gat,71,173 //star_in.gat from_pos=(145, 61)
star_frst.gat,111,173,0	warp	#JQ_SE_enin	2,2,star_in.gat,133,12 //star_frst.gat from_pos=(110, 172)
star_in.gat,130,12,0	warp	#JQ_SE_enout	2,2,star_frst.gat,107,173 //star_in.gat from_pos=(132, 12)
star_frst.gat,29,176,0	warp	#JQ_SE_w1_i	2,2,star_in.gat,7,83 //star_frst.gat from_pos=(29, 174)
star_in.gat,10,80,0	warp	#JQ_SE_w1_o	2,2,star_frst.gat,29,169 //star_in.gat from_pos=(10, 82)
star_frst.gat,30,131,0	warp	#JQ_SE_w2_i	2,2,star_in.gat,12,51 //star_frst.gat from_pos=(32, 131)
star_in.gat,17,51,0	warp	#JQ_SE_w2_o	2,2,star_frst.gat,35,133 //star_in.gat from_pos=(15, 52)
star_frst.gat,33,106,0	warp	#JQ_SE_w3_i	2,2,star_in.gat,13,133 //star_frst.gat from_pos=(35, 106)
star_in.gat,13,139,0	warp	#JQ_SE_w3_o	2,2,star_frst.gat,34,112 //star_in.gat from_pos=(13, 137)
star_frst.gat,60,107,0	warp	#JQ_SE_w4_i	2,2,star_in.gat,11,12 //star_frst.gat from_pos=(60, 109)
star_in.gat,10,17,0	warp	#JQ_SE_w4_o	2,2,star_frst.gat,60,111 //star_in.gat from_pos=(10, 15)
star_frst.gat,111,119,0	warp	#JQ_SE_w5_i	2,2,star_in.gat,176,11 //star_frst.gat from_pos=(110, 119)
star_in.gat,172,10,0	warp	#JQ_SE_w5_o	2,2,star_frst.gat,111,115 //star_in.gat from_pos=(174, 10)
star_frst.gat,131,80,0	warp	#JQ_SE_w6_i	2,2,star_in.gat,46,10 //star_frst.gat from_pos=(129, 80)
star_in.gat,42,10,0	warp	#JQ_SE_w6_o	2,2,star_frst.gat,127,80 //star_in.gat from_pos=(44, 10)
star_frst.gat,90,166,0	warp	#JQ_SE_w7_i	2,2,star_in.gat,56,54 //star_frst.gat from_pos=(89, 166)
star_in.gat,56,50,0	warp	#JQ_SE_w7_o	2,2,star_frst.gat,90,163 //star_in.gat from_pos=(56, 52)
star_frst.gat,172,133,0	warp	#JQ_SE_w8_i	2,2,star_in.gat,92,9 //star_frst.gat from_pos=(170, 133)
star_in.gat,86,8,0	warp	#JQ_SE_w8_o	2,2,star_frst.gat,167,133 //star_in.gat from_pos=(88, 8)

star_in.gat,144,46,5	script	�q��#JQ_SE1	464,{/* 12952 */
	mes "�]�ǂ̑q�ɂ��J���܂����H";
	mes "�@���p������0Zeny�ł��]";
	next;
	switch(select("^0000FF���C���q��^000000���J��","^FF0000�T�u�q��1^000000���J��","^FF0000�T�u�q��2^000000���J��","^FF0000�T�u�q��3^000000���J��","�q�ɂ��J���Ȃ�")) {
	case 1:
		mes "�]���C���q�ɂ��J���܂��]";
		close2;
		openstorage;
		end;
	default:
		mes "�]�q�ɂ��J���̂���߂��]";
		close;
	}
}
star_frst.gat,151,44,5	script	�q��#JQ_SE2	464,{/* 12953 */
	mes "�]�ǂ̑q�ɂ��J���܂����H";
	mes "�@���p������0Zeny�ł��]";
	next;
	switch(select("^0000FF���C���q��^000000���J��","^FF0000�T�u�q��1^000000���J��","^FF0000�T�u�q��2^000000���J��","^FF0000�T�u�q��3^000000���J��","�q�ɂ��J���Ȃ�")) {
	case 1:
		mes "�]���C���q�ɂ��J���܂��]";
		close2;
		openstorage;
		end;
	default:
		mes "�]�q�ɂ��J���̂���߂��]";
		close;
	}
}
star_in.gat,96,65,5	script	�q��#JQ_SE3	464,{/* 12954 */
	mes "�]�ǂ̑q�ɂ��J���܂����H";
	mes "�@���p������0Zeny�ł��]";
	next;
	switch(select("^0000FF���C���q��^000000���J��","^FF0000�T�u�q��1^000000���J��","^FF0000�T�u�q��2^000000���J��","^FF0000�T�u�q��3^000000���J��","�q�ɂ��J���Ȃ�")) {
	case 1:
		mes "�]���C���q�ɂ��J���܂��]";
		close2;
		openstorage;
		end;
	default:
		mes "�]�q�ɂ��J���̂���߂��]";
		close;
	}
}
