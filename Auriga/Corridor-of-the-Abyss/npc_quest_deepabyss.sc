prontera.gat,111,83,6	script	����s���q�m#prontera	419,{/* 51218 */
	if(checkquest(123701)) {
		mes "[����s���q�m]";
		mes "�����Ȃ�`���ғa�B";
		mes "�u�v�����e���[���v�Ɍ�������̂Ȃ�";
		mes "�ē����悤�B";
		mes "���������Ɍ����Ă���B";
		next;
		if(select("�u�v�����e���[���v�ɍs��","�����ɗ��܂�") == 2) {
			mes "[����s���q�m]";
			mes "���m�����B";
			mes "�u�v�����e���[���v�Ɍ�������ۂ�";
			mes "���ɐ����|���Ă���B";
			mes "��낵�����ށB";
			close;
		}
		mes "[����s���q�m]";
		mes "���m�����B";
		mes "�ł́u�v�����e���[���v�ւ�";
		mes "�ē����悤�B";
		close2;
		warp "pab_camp.gat",33,190;
		end;
	}
	if(checkquest(123700)) {
		mes "[����s���q�m]";
		mes "���Ԃ̓v�����e���̒n��";
		mes "�u�v�����e���[���v�ɂĐi�s���Ă���B";
		mes "�܂��́A�v�����e���̖k���ɂ���";
		mes "�u�v�����e���吹���v��";
		mes "�������Ă��炢�����B";
		next;
		mes "[����s���q�m]";
		mes "�������ɓ�������^�������i��";
		mes "^0000FF��ԍ����̕���^000000�ɓ���̂��B";
		next;
		mes "[����s���q�m]";
		mes "���i�͓���Ȃ���������";
		mes "���̕����ɂ���";
		mes "^0000FF�b�h�́u���v�Ɏ��������^000000���Ƃ�";
		mes "�u�v�����e���[���v�ɐi�߂�B";
		next;
		mes "[����s���q�m]";
		mes "�u�v�����e���[���v�ɓ���������";
		mes "���̃��[�_�[�ł���";
		mes "�u^0000FF�V�L�i^000000�v�l�ɉ";
		mes "�ڂ����b�𕷂��ė~�����B";
		next;
		if(select("�u�吹���v�ɍs��","�����ɗ��܂�") == 2) {
			mes "[����s���q�m]";
			mes "���m�����B";
			mes "�u�v�����e���吹���v�Ɍ�������ۂ�";
			mes "���ɐ����|���Ă���B";
			mes "��낵�����ށB";
			close;
		}
		mes "[����s���q�m]";
		mes "�ł́A�v�����e���吹���O��";
		mes "�ē����悤�B";
		mes "��낵�����ށB";
		close2;
		warp "prontera.gat",232,312;
		end;
	}
	setquest 123600;
	compquest 123600;
	mes "[����s���q�m]";
	mes "�c�c�M�a�𐦘r�̖`���҂�";
	mes "������Řb������B";
	mes "���A���̐��E�͖ŖS�̊�@�ɂ���B";
	next;
	mes "[����s���q�m]";
	mes "�u���f�̉��v�ƌĂ΂��҂�";
	mes "�v�����e���吹���̒n������";
	mes "�h�낤�Ƃ��Ă���̂��B";
	mes "�ނ̎҂��h��΂��̐���";
	mes "�n���Ɖ������낤�B";
	next;
	mes "[����s���q�m]";
	mes "��X�́A���f�̉��̕�����";
	mes "�j�~���ׂ������Ă邪";
	mes "�����񂹂�l�肪����Ȃ��B";
	mes "�����ŋM�a�̂悤�ȋ����Ȗ`���҂�";
	mes "���͂����߂邱�Ƃɂ����̂��B";
	next;
	mes "[����s���q�m]";
	mes "���E���~�����߂ɂ�";
	mes "�M�a�̗͂��K�v�Ȃ̂��B";
	mes "�ǂ����A��X�ɗ͂�݂��ė~�����B";
	next;
	if(select("���͂�\���o��","�l�������ė~����") == 2) {
		mes "[����s���q�m]";
		mes "�c�c�������B";
		mes "�O�����Ɍ������Ă��炦��Ə�����B";
		mes "���̋C�ɂȂ�����";
		mes "�܂����ɐ��������Ă���B";
		mes "��낵�����ށB";
		close;
	}
	mes "[����s���q�m]";
	mes "�����c�c�I";
	mes "�Ȃ�ƐS�����፷�����I";
	mes "�M�a�̗͂������";
	mes "�K������f�̉��̕�����";
	mes "�j�~�ł���ɈႢ�Ȃ��I";
	next;
	mes "[����s���q�m]";
	mes "�c�c���Ԃ̓v�����e���̒n��";
	mes "�u�v�����e���[���v�ɂĐi�s���Ă���B";
	mes "�܂��́A�v�����e���̖k���ɂ���";
	mes "�u�v�����e���吹���v��";
	mes "�������Ă��炢�����B";
	next;
	mes "[����s���q�m]";
	mes "�������ɓ�������^�������i��";
	mes "^0000ff��ԍ����̕���^000000�ɓ���̂��B";
	next;
	mes "[����s���q�m]";
	mes "���i�͓���Ȃ���������";
	mes "���̕����ɂ���";
	mes "^0000ff�b�h�́u���v�Ɏ��������^000000���Ƃ�";
	mes "�u�v�����e���[���v�ɐi�߂�B";
	next;
	mes "[����s���q�m]";
	mes "�u�v�����e���[���v�ɓ���������";
	mes "���̃��[�_�[�ł���";
	mes "�u^0000ff�V�L�i^000000�v�l�ɉ";
	mes "�ڂ����b�𕷂��ė~�����B";
	next;
	mes "[����s���q�m]";
	mes "�ł́A�v�����e���吹���O��";
	mes "�ē����悤�B";
	mes "��낵�����ށB";
	close2;
	setquest 123700;
	warp "prontera.gat",232,312;
	end;
OnInit:
	waitingroom "�[���̉�L��",0; //51218
	//setnpcgroup 1015;
	//setnpctitle "[�C�x���g�ē�]";
	end;
}

prt_church.gat,102,61,2	script	�����_�炩�ȉq�m#pab_ch	418,{/* 51220 */
	mes "[�����_�炩�ȉq�m]";
	mes "�Ȃ�Ƌ������Ȑl�Ԃ��c�c";
	mes "���ЋM���̂悤�ȕ���";
	mes "���݂��Ă��炢�����B";
	mes "���A���̐����̉��ő�ςȂ��Ƃ�";
	mes "�N���悤�Ƃ��Ă���̂ł��B";
	next;
	switch(select("�b�𕷂�","�u�v�����e���[���v�ɂ��ĕ���","��������")) {
	case 1:
		mes "[�����_�炩�ȉq�m]";
		mes "���f�̉��ƌĂ΂��";
		mes "���낵�����݂�";
		mes "���̑吹���̒n����";
		mes "�h�낤�Ƃ��Ă���̂ł��B";
		next;
		mes "[�����_�炩�ȉq�m]";
		mes "���f�̉����h���";
		mes "���E�͈łɕ�����ł��傤�B";
		mes "�����j�~���ׂ�";
		mes "�����̒n���A�u�v�����e���[���v��";
		mes "�Ă΂��ꏊ��";
		mes "���m���������Ă���܂��B";
		next;
		mes "[�����_�炩�ȉq�m]";
		mes "������`���Ă���������̂ł����";
		mes "������^�������i��";
		mes "��ԉ��̍���̔��ɂ����肭�������B";
		mes "�������u�v�����e���[���v�ւ�";
		mes "�����ƂȂ��Ă��܂��B";
		close;
	case 2:
		mes "[�����_�炩�ȉq�m]";
		mes "�u�v�����e���[���v��";
		mes "��������̂ł����";
		mes "������^�������i��";
		mes "��ԉ��̍���̔��ɂ����肭�������B";
		next;
		mes "[�����_�炩�ȉq�m]";
		mes "�������u�v�����e���[���v�ւ�";
		mes "�����ƂȂ��Ă��܂��B";
		close;
	case 3:
		mes "^0000FF�]�q�m�̑O���痧���������]^000000";
		close;
	}
OnInit:
	waitingroom "�[���̉�L��",0; //51220
	end;
}

prt_church.gat,83,122,0	warp	#warp_prt_church	3,3,pab_church.gat,73,79	//51219
pab_church.gat,73,75,0	warp	#warp_pab_church	3,3,prt_church.gat,90,122	//60674

prt_church.gat,83,122,4	script	waitingroom#pab_church	844,{/* 51221 */
	end;
OnInit:
	waitingroom "�[���̉�L��",0; //51221
	end;
}

pab_church.gat,73,90,2	script	���Ȃ�b�h#prt_church	844,{/* 51149 */
	mes "^0000FF�]�ÂтĂ��Ė�������";
	mes "�@�s�v�c�ƌ������Ă��܂��Z���c�c";
	mes "�@�ق�̋͂�����";
	mes "�@���Ȃ�͂���������]^000000";
	next;
	if(select("^0000FF���Ɏ��������^000000","��߂�") == 2) {
		mes "^0000FF�]�n���[����";
		mes "�@�z�����܂�Ă��܂�������";
		mes "�@�C������c�c";
		mes "�@��߂Ă������]^000000";
		close;
	}
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "[�n���Ǘ��l]";
		mes "�u�v�����e���[���v��";
		mes "��������̂ł����H";
		mes "�ł�����A�b�h�ɋ߂Â���";
		mes "����������Ă��������B";
		mes "��������΁A���Ȃ�͂̉��b��";
		mes "������ł��傤�B";
		next;
		mes "^0000FF�]�b�h�ɏh��";
		mes "�@���Ȃ�͂̉��b�𓾂�ɂ�";
		mes "�@�b�h�ɋ߂Â��K�v������悤���]";
		mes "�@";
		mes "�@�b�h�ɋ߂Â�";
		mes "�@����������Ă݂悤�]^000000";
		close;
	}
	misceffect 6,""; //self
	mes "^0000FF�]���Ɏ����������";
	mes "�@�܂΂䂢���ɑ̂���܂�";
	mes "�@�₪�Đg�̂������オ��悤��";
	mes "�@�َ��Ȋ��o�ɂƂ��ꂽ�]^000000";
	close2;
	warp "pab_camp.gat",41,186;
	end;
OnInit:
	initnpctimer;
	//setnpcgroup 1015;
	//setnpctitle "[�v�����e���[���̓���]";
	end;
OnTimer5000:
	misceffect 310, "���Ȃ�b�h#DeepAbyss01"; //60640
	misceffect 367, "���Ȃ�b�h#DeepAbyss01"; //60640
	misceffect 546, "���Ȃ�b�h#DeepAbyss01"; //60640
	initnpctimer;
	end;
}

pab_church.gat,75,86,4	script	�n���Ǘ��l#prt_church	60,{/* 51150 */
	mes "[�n���Ǘ��l]";
	mes "���̍b�h��";
	mes "���̒n���J�������O�A";
	mes "��̂ɍ��ꂽ���̂���";
	mes "�����Ă��܂��B";
	next;
	mes "[�n���Ǘ��l]";
	mes "�����u�v�����e���[���v��";
	mes "��������̂ł����";
	mes "^FF0000�b�h�ɋ߂Â���^000000";
	mes "������ɂ������Ă��������B";
	mes "���Ȃ�͂��M���𓱂��ł��傤�B";
	close;
}

pab_church.gat,77,79,4	script	�C���m#prt_church	79,{/* 51151 */
	mes "[�C���m]";
	mes "���̕����̈�ʊJ����";
	mes "�ő��ɍs���܂���̂ŁA";
	mes "���̋@��ɂ�����茩��";
	mes "�s���Ă��������ˁB";
	close;
}

pab_church.gat,81,77,2	script	�Δ�#prt_church	844,{/* 51152 */
	mes "^0000FF�]�Δ�ɍ��܂ꂽ������";
	mes "�@������Ă���A";
	mes "�@�ǂނ��Ƃ��ł��Ȃ��]^000000";
	close;
//OnInit:
//	setnpcgroup 1015;
//	end;
}

pab_camp.gat,36,193,6	script	�V�L�i#pab_camp	859,{/* 51177 */
	if(checkquest(123700)) {
		mes "[�H�H�H�H]";
		mes "���Ȃ��́c�c�`���҂��H";
		mes "��X�̒��Ԃ̘b�𕷂���";
		mes "���Ă��ꂽ�̂��ȁB";
		mes "�܂��͂����ɗ��Ă��ꂽ����";
		mes "���ӂ���B";
		next;
		mes "[�V�L�i]";
		mes "���̖��́u^0000ff�V�L�i^000000�v�ƌ����B";
		mes "���Ȃ��̖��́c�c";
		mes "^0000ff" +strcharinfo(0)+ "^000000�c�c���B";
		mes "�ǂ��c�c�����ȁB";
		mes "���Ȃ��ɑ������������B";
		next;
		mes "[�V�L�i]";
		mes "�c�c�����ȁB";
		mes "���Ȃ��Ƃ͏��Ζʂ̂͂��Ȃ̂�";
		mes "���̖��O�ɕ����o��������B";
		mes "���������āA���Ȃ��Ǝ���";
		mes "���łɒm�����ԕ��Ȃ̂ł͂Ȃ����H";
		next;
		if(select("�ȑO�A��������Ƃ�����","���Ζʂł�") == 1) {
			mes "[�V�L�i]";
			mes "�c�c��͂�A���B";
			mes "�u���ʂ̗ցv�ƌĂ΂��";
			mes "���Ԃ��z����􂢂ɂ��";
			mes "���̒n�͊O�̐��E�Ƃ�";
			mes "���Ԃ̐i�ݕ����قȂ��Ă���̂��B";
			next;
			mes "[�V�L�i]";
			mes "����䂦�A���Ȃ��̌o���������Ԃ�";
			mes "���̌o���������ԂƂ̊Ԃ�";
			mes "�ꗂ��������Ă���̂��낤�B";
			mes "�Ȃ�Ƃ���V�Ȃ��Ƃ��B";
			next;
			mes "[�V�L�i]";
			mes "�u���ʂ̗ցv�ɂ��e����";
			mes "�l��������Řb��i�߂����̂����c�c";
			mes "���Ȃ�������m���Ă���Ƃ������Ƃ�";
			mes "���A�����ŉ����N���Ă���̂��B";
			next;
			mes "[�V�L�i]";
			mes "�����āA���E�̔j�ł�������邽�߂�";
			mes "�������ׂ��Ȃ̂��c�c�B";
			mes "�S���Ă���ƍl���ėǂ��̂��ȁH";
			mes "^0000ff�]�u�S���Ă���v��I�������";
			mes "�@��������ƃ������A���_���W�����ł�";
			mes "�@�{�X�̓o�ꉉ�o���X�L�b�v�ł��܂��]^000000";
			next;
			if(select("^0000ff�S���Ă���^000000","���߂Ęb�𕷂�����") == 1) {
				setquest 123625; //state=1
				delquest 123625;
				setquest 123626; //state=1
				delquest 123626;
				setquest 123627; //state=1
				delquest 123627;
				setquest 123628; //state=1
				delquest 123628;
				setquest 123629; //state=1
				delquest 123629;
				setquest 123630; //state=1
				delquest 123630;
				setquest 122958; //state=1
				delquest 122958;
				setquest 122959; //state=1
				delquest 122959;
				mes "[�V�L�i]";
				mes "����͍D�s���B";
				mes "�ł͖{��ɓ��낤�B";
				next;
				mes "[�V�L�i]";
				mes "���Ȃ��ɂ́u�����X�^�[�����v��";
				mes "���肢�������B";
				mes "���̒n�ɑ��H�������X�^�[��";
				mes "��������􂢂̗͂��h���Ă���B";
				mes "�����𓢔����邱�Ƃ�";
				mes "���f�̉��̕����j�~�Ɍq����̂��B";
				next;
				mes "[�V�L�i]";
				mes "������k�̎l�̒n���";
				mes "�˗��̑Ώۃ����X�^�[��";
				mes "���萔�|���ė��Ă��炢�����B";
				next;
				delquest 123700;
				setquest 123701; //state=1
				setquest 97720; //state=1
				setquest 97721; //state=1
				setquest 97722; //state=1
				setquest 97723; //state=1
				mes "[�V�L�i]";
				mes "�����͈ȏゾ�B";
				mes "�������ςݎ���A";
				mes "�����X�^�[�����Ɍ������Ă���B";
				mes "���̒n�ɑ��H�������X�^�[��";
				mes "��������苭�����c�c";
				mes "��낵�����ށB";
				close;
			}
		}
		mes "[�V�L�i]";
		mes "�c�c�������B";
		mes "���̊��Ⴂ�������悤���ȁB";
		mes "���܂Ȃ��A�C�ɂ��Ȃ��ł���B";
		next;
		mes "[�V�L�i]";
		mes "�u���ʂ̗ցv�ƌĂ΂��";
		mes "���Ԃ��z����􂢂ɂ��";
		mes "���̒n�͊O�̐��E�Ƃ�";
		mes "���Ԃ̐i�ݕ����قȂ��Ă���̂łȁB";
		mes "�O�̂��߁A�m�F�����Ă�������B";
		next;
		mes "[�V�L�i]";
		mes "�����Ő\����Ȃ���";
		mes "���݋N���Ă��鎖�Ԃɂ���";
		mes "���������Ă��炨���B";
		mes "�Ȃɂ��}��v���鎖�ԂȂ̂��B";
		next;
		mes "[�V�L�i]";
		mes "�܂��A���̒n�Ɋւ��Đ������悤�B";
		mes "�֋X�ケ�̒n��";
		mes "�u^0000ff�v�����e���[��^000000�v�ƌĂ΂�Ă���B";
		mes "�֋X��ƌ����̂́A�����͐��m�ɂ�";
		mes "�v�����e���̒n���ł͖������炾�B";
		next;
		mes "[�V�L�i]";
		mes "�����͂��Ȃ��̏Z�ސ��E�Ƃ�";
		mes "�ʂ̎����ɑ��݂��Ă���B";
		mes "���ꂪ���R�A�v�����e���̒n����";
		mes "�q�����Ă���Ǝv���Ă���B";
		next;
		mes "[�V�L�i]";
		mes "���̒n���َ����ɂ��闝�R��";
		mes "���̒n���u����v����Ă��邩���";
		mes "���Ȃ�Ȃ��B";
		next;
		mes "[�V�L�i]";
		mes "�u����v�ƌ����Ε������͗ǂ���";
		mes "�u����āv����ƌ���������";
		mes "�^���ɋ߂��B";
		mes "���̒n�́A���E���狑�₳�ꂽ";
		mes "�u���ꂽ���m�v������";
		mes "���݂������ꂽ�ꏊ������ȁB";
		next;
		mes "[�V�L�i]";
		mes "�c�c�{��ɓ��낤�B";
		mes "���̒n�ɂ́u^ff0000���f�i�Ƃ����j�̉�^000000�v��";
		mes "���󂳂�Ă���B";
		mes "�Â̎���ɁA�_�̔@���͂�U�邢";
		mes "���E���x�z���悤�Ƃ������݂��B";
		next;
		mes "[�V�L�i]";
		mes "�������f�̉��̖\����";
		mes "������|�����҂�����";
		mes "�����ɓn���̖�";
		mes "���f�̉��͑ł��|����";
		mes "�ނ̎���͏I�����}�����B";
		next;
		mes "[�V�L�i]";
		mes "�����A�b�͂����ŏI���ł͂Ȃ��B";
		mes "���f�̉��̋��傷�����͂�";
		mes "�킪�I���������l�X�̊Ԃ�";
		mes "���|�̋L���ƂȂ��Ďc�葱�����B";
		next;
		mes "[�V�L�i]";
		mes "�V���Ȏ�����}���ĂȂ�";
		mes "�l�X�̐S�ɉe�𗎂Ƃ�������";
		mes "���̑��݂ɑ΂��l�X��";
		mes "���̑��݂������Ղ�";
		mes "�O��I�ɔj�󂷂邱�Ƃɂ����̂��B";
		next;
		mes "[�V�L�i]";
		mes "���f�̉��Ɋւ���";
		mes "����Ƃ�������́c�c";
		mes "�╨�A�����A�{�a�A������";
		mes "���̖�������j��̑ΏۂƂȂ����B";
		next;
		mes "[�V�L�i]";
		mes "�����I�Ȕj��͌����ɋy�΂�";
		mes "��p�c�c";
		mes "���Ȃ킿�u�􂢁v�ɂ��j����܂߂�";
		mes "�u����v�ɂ��";
		mes "�悤�₭�l�X�̒�����";
		mes "���f�̉��Ƃ������݂͏������̂��B";
		next;
		mes "[�V�L�i]";
		mes "���Ȃ������̐��E��";
		mes "���f�̉��Ɋւ���L�^��";
		mes "���������c���Ă��Ȃ��̂�";
		mes "���̂悤�ȗ��R�̂��߂��B";
		next;
		mes "[�V�L�i]";
		mes "�c�c�������A���̖��������";
		mes "�u���f�̉��v�Ƃ����ĂׂȂ����m��";
		mes "�����j��A�h�낤�Ƃ��Ă���I";
		next;
		mes "[�V�L�i]";
		mes "���f�̉��́A����𕕈󂵂Ă���";
		mes "�u�􂢂̗́v�������Ď󂯓���邱�Ƃ�";
		mes "�����̗͂ɕς��Ă���B";
		mes "�c�c�􂢂̗͂��󂯓����Ȃ�";
		mes "�����܂������Ƃ��c�c�B";
		next;
		mes "[�V�L�i]";
		mes "�����A���f�̉����h��";
		mes "�����ւ̋A�҂��ʂ�����";
		mes "���̖\�Ђɂ����";
		mes "���E�͒n���Ɖ������낤�B";
		mes "����Ȏ��Ԃ͂Ȃ�Ƃ��Ă�";
		mes "�����Ȃ���΂Ȃ�Ȃ��B";
		next;
		mes "[�V�L�i]";
		mes "��X�������ׂ����Ƃ�";
		mes "���̒n�ɖ�����u�􂢂̗́v��";
		mes "�����ł���߂邱�Ƃ��B";
		mes "�����ɕK�v�ƂȂ�͂̌���f�Ă�";
		mes "���̕�����j�~�ł���͂��B";
		next;
		mes "[�V�L�i]";
		mes "���Ȃ��ɂ́u�����X�^�[�����v��";
		mes "���肢�������B";
		mes "���̒n�ɑ��H�������X�^�[��";
		mes "��������􂢂̗͂��h���Ă���B";
		mes "�����𓢔����邱�Ƃ�";
		mes "���f�̉��̕����j�~�Ɍq����̂��B";
		next;
		mes "[�V�L�i]";
		mes "������k�̎l�̒n���";
		mes "�˗��̑Ώۃ����X�^�[��";
		mes "���萔�|���ė��Ă��炢�����B";
		next;
		delquest 123700;
		setquest 123701;
		setquest 97720;
		setquest 97721;
		setquest 97722;
		setquest 97723;
		mes "[�V�L�i]";
		mes "�����͈ȏゾ�B";
		mes "�������ςݎ���A";
		mes "�����X�^�[�����Ɍ������Ă���B";
		mes "���̒n�ɑ��H�������X�^�[��";
		mes "��������苭�����c�c";
		mes "��낵�����ށB";
		close;
	}
	if(checkquest(123701)) {
		if(checkquest(97720)&4 == 0 || checkquest(97721)&4 == 0 || checkquest(97722)&4 == 0 || checkquest(97723)&4 == 0) {
			mes "[�V�L�i]";
			mes "�c�c�܂��������Ă��Ȃ��悤���B";
			mes "���������A�˗��B���̂��߂�";
			mes "�撣���Ă���B";
			close;
		}
		mes "[�V�L�i]";
		mes "���������ł����̂��ȁB�������B";
		mes "���Ȃ��̂�������";
		mes "�􂢂̗͂���߂邱�Ƃ��ł����B";
		mes "�������A���̕�����j�~����ɂ�";
		mes "�����X�^�[�𓢔����邾���ł�";
		mes "�\���ł͂Ȃ��B";
		next;
		mes "[�V�L�i]";
		mes "���͎��f�̉��̐b���ł���";
		mes "�u^ff0000�l����^000000�v��";
		mes "���̕����̂��߂ɍs�����Ă���B";
		next;
		mes "[�V�L�i]";
		mes "���łɖڌ����Ă��邩������Ȃ���";
		mes "�l�����͎��f�̉��𕜊������邽��";
		mes "�ϋɓI�Ɏ􂢂̗͂��W�߂Ă���B";
		mes "�����X�^�[�������瓢�����Ă�";
		mes "�ނ������Ă����Ă�";
		mes "�����q���Ȃ��Ƃ����킯���B";
		next;
		mes "[�V�L�i]";
		mes "�����ŁA���Ȃ��ɂ�";
		mes "�l�����̗l�q��T���Ă��炢�����B";
		mes "���Ȃ��̎��͂Ȃ��";
		mes "���ꂪ�ł���͂����B";
		next;
		delquest 123701;
		setquest 123702; //state=1
		delquest 97720;
		delquest 97721;
		delquest 97722;
		delquest 97723;
	}
	if(checkquest(123702)) {
		if(checkquest(123703) && checkquest(123704) && checkquest(123705) && checkquest(123706)) {
			mes "[�V�L�i]";
			mes "�댯�Ȓ����A��V�ł������B";
			mes "�l�����̖{�̂�";
			mes "�ʂ̏ꏊ�ɂ���̂��ȁB";
			next;
			mes "[�V�L�i]";
			mes "���̏ꏊ�ɂ͓��Ă�����B";
			mes "���炭�u^0000ff���f�̉�^000000�v������";
			mes "�u^0000ff�[���̉���^000000�v���낤�B";
			next;
			mes "[�V�L�i]";
			mes "�����܂ŗ͂�݂��Ă��ꂽ";
			mes "���Ȃ��ɂ́A�{���Ɋ��ӂ��Ă���B";
			mes "�����c�c��킭�΁c�c�B";
			next;
			mes "[�V�L�i]";
			mes "�c�c����B";
			mes "��肭�ǂ��������́A��߂悤�B";
			mes "�S�ĂɌ��������邽��";
			mes "���Ȃ��Ɏ��f�̉��Ƃ��̔z����";
			mes "�����Ă��炢�����I";
			next;
			mes "[�V�L�i]";
			mes "�����Ɍ�����u���l�̖�v�̐��";
			mes "���f�̉������󂳂�Ă���B";
			mes "���������A���f�̉���|���̂��B";
			mes "�􂢂̗͂̔��܂���������";
			mes "���̋���ȉ��𑒂��ڈ���̎��I";
			next;
			mes "[�V�L�i]";
			mes "�c�c�����A�����Ă��鎞�ł���";
			mes "�_�̔@���Ƌ����ꂽ�͂�";
			mes "�􂢂����̐g�ɏh�����Ƃ�";
			mes "�ǂ�قǂ̂��̂ɂȂ��Ă��邩";
			mes "�z�������Ȃ��c�c�B";
			next;
			mes "[�V�L�i]";
			mes "���ł͐����������Ȃ����Ƃ�";
			mes "���l�ɗ���Ȃ�";
			mes "�r���g����Ȃ͕̂S�����m�B";
			mes "������킭�΁c�c";
			mes "�����c�c�B";
			next;
			mes "[�V�L�i]";
			mes "�u^0000ff�O���[�U^000000�v�l�Ɂc�c";
			mes "���J�������炵�ė~�����c�c�B";
			next;
			mes "[�V�L�i]";
			mes "�c�c���Ȃ���";
			mes "���l�̖���J���邽�߂̌�������B";
			mes "���ꂪ����΁A^0000ff1����1�x����";
			mes "����J���邱�Ƃ��ł���B^000000";
			next;
			mes "[�V�L�i]";
			mes "�������\���ɐ����Ă���";
			mes "�u���l�̖�v�𒲂ׂ�";
			mes "����J����̂��ǂ����낤�B";
			next;
			delquest 123702;
			setquest 123707; //state=1
			delquest 123703;
			delquest 123704;
			delquest 123705;
			delquest 123706;
			mes "^0000ff�]�u���l�̖�v�̌�������ꂽ�B";
			mes "�@���f�̉��Ƃ̌��������邽��";
			mes "�@�u�[���̉���v�Ɍ��������]^000000";
			close;
		}
		mes "[�V�L�i]";
		mes "�l�����͓�����k�ɂ���";
		mes "���݂̕��ɂ���Ƃ̕񍐂��������B";
		mes "���̑��܂ł͎������낤�B";
		mes "�@";
		mes "�����͗ǂ����H";
		if(!checkquest(123703))
			set '@str1$,"�뉀�֌�����";
		if(!checkquest(123704))
			set '@str2$,"���J��֌�����";
		if(!checkquest(123705))
			set '@str3$,"��L�֌�����";
		if(!checkquest(123706))
			set '@str4$,"���s�X�n�֌�����";
		next;
		switch(select("��߂�",'@str1$,'@str2$,'@str3$,'@str4$)) {
		case 1:
			mes "[�V�L�i]";
			mes "�K�v�ɂȂ�����";
			mes "���ɐ����|���Ă���B";
			mes "��낵�����ށB";
			close;
		case 2:
			mes "[�V�L�i]";
			mes "���m�����B";
			mes "�ł́A��낵�����ށB";
			close2;
			warp "pab_dun01.gat",78,52;
			end;
		case 3:
			mes "[�V�L�i]";
			mes "���m�����B";
			mes "�ł́A��낵�����ށB";
			close2;
			warp "pab_dun02.gat",124,96;
			end;
		case 4:
			mes "[�V�L�i]";
			mes "���m�����B";
			mes "�ł́A��낵�����ށB";
			close2;
			warp "pab_dun03.gat",118,107;
			end;
		case 5:
			mes "[�V�L�i]";
			mes "���m�����B";
			mes "�ł́A��낵�����ށB";
			close2;
			warp "pab_dun04.gat",93,122;
			end;
		}
	}
	if(checkquest(123707)) {
		mes "[�V�L�i]";
		mes "�����Ɍ�����u���l�̖�v�̐��";
		mes "���f�̉������󂳂�Ă���B";
		mes "���������A���f�̉���|���̂��B";
		mes "���Ȃ����������肾�B";
		mes "��낵�����ށB";
		close;
	}
//OnInit:
//	setnpcgroup 1011;
//	setnpctitle "[�N�G�X�g��t]";
//	end;
}
pab_dun01.gat,77,58,0	script	spiral#pab_dun01	139,15,15,{/* 1955 */
	cloakoffnpc "�q�m#pab_dun01"; //1956
	cloakoffnpc "���݂̕�#pab_dun01"; //1957
	end;
}
pab_dun01.gat,75,60,4	script	�q�m#pab_dun01	419,9,9,{/* 1956 (cloaking)*/
	mes "[�q�m]";
	mes "�u���݂̕��v��";
	mes "�􂢂̗͂ɂ���Ď������c��ł��܂��B";
	mes "�����̐�ɐi�߂�";
	mes "�ߋ��̐��E�֍s�����Ƃ��\�ł��傤�B";
	close;
OnTouch:
	unittalk "�q�m : �`���җl�A���݂̕��̓�����͂�����ł��B";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun01.gat,77,58,4	script	���݂̕�#pab_dun01	723,2,2,{/* 1957 (cloaking)*/
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	if(select("���݂̕��ɔ�э���","��������") == 2) {
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnTouch:
	warp "pab_dun01q.gat",77,50;
	end;
OnInit:
	cloakonnpc;
	//[�N�G�X�g��p�]��]
	end;
}

pab_dun01q.gat,77,58,4	script	���݂̕�#pab_dun01q	723,2,2,{/* 1197 (cloaking)*/
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	switch(select("�V�L�i�̌��ɋA��","���݂̕��ɔ�э���","��������")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun01.gat",77,50;
		end;
	case 3:
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun01q.gat,77,58,4	script	�H�H�H�H#pab_dun01q	10045,3,3,{/* 1198 */
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "^0000ff�]�s�v�c�ȗ͂���������B";
		mes "�@�����Ƌ߂��Ŕ`������ł݂悤�]^000000";
		close;
	}
	misceffect 546, "�l�����W�I�C�A#pab_dun0"; //1199
	misceffect 135, "�l�����W�I�C�A#pab_dun0"; //1199
	cloakoffnpc "�l�����W�I�C�A#pab_dun0"; //1199
	misceffect 546, "���f�̉�#pab_dun01q"; //1200
	misceffect 135, "���f�̉�#pab_dun01q"; //1200
	cloakoffnpc "���f�̉�#pab_dun01q"; //1200
	unittalk getnpcid(0,"�l�����W�I�C�A#pab_dun0"),"�l�����W�I�C�A : �S���C���C���c�c�}�X�^�[�c�c";
	unittalk getnpcid(0,"���f�̉�#pab_dun01q"),"���f�̉� : �]�̒����Ȃ�l�c�c�W�I�C�A�c�c���ɖ��߂�^����c�c";
	unittalk getnpcid(0,"���f�̉�#pab_dun01q"),"���f�̉� : �]�͂��̐��E�̑S�Ă������c�c����āA���̐��̂���Ƃ����郂�m��j�󂷂邱�ƂɌ��߂��c�c";
	unittalk getnpcid(0,"���f�̉�#pab_dun01q"),"���f�̉� : ���̖ڂɉf��S�Ẵ��m��j�󂹂�B���s���Ԃ́c�c�����i�����B";
	unittalk getnpcid(0,"���f�̉�#pab_dun01q"),"���f�̉� : �����āA���̖��߂͑��̂����Ȃ閽�߂����D�悷��B���̖��߂��]�̗^����Ō�̖��߂ƂȂ낤�B";
	unittalk getnpcid(0,"���f�̉�#pab_dun01q"),"���f�̉� : �s���c�c���̐��E��n���ɕς��Ă����c�c�c�I";
	unittalk getnpcid(0,"�l�����W�I�C�A#pab_dun0"),"�l�����W�I�C�A : �����E�J�C�@�V�}�V�^�c�c�R�������c�c���C���C���@�W�b�R�E�V�}�X�c�c";
	unittalk getnpcid(0,"�l�����W�I�C�A#pab_dun0"),"�l�����W�I�C�A : ���N�q���E�c�c�z�\�N�c�c�R�������c�c�n�J�C���@�J�C�V�X���c�c�c";
	misceffect 546, "�l�����W�I�C�A#pab_dun0"; //1199
	misceffect 135, "�l�����W�I�C�A#pab_dun0"; //1199
	cloakonnpc "�l�����W�I�C�A#pab_dun0"; //1199
	misceffect 546, "���f�̉�#pab_dun01q"; //1200
	misceffect 135, "���f�̉�#pab_dun01q"; //1200
	cloakonnpc "���f�̉�#pab_dun01q"; //1200
	setquest 123703; //state=1
	mes "^0000ff�]�l�����Ɖ��̎c���v�O�������Ă��܂���";
	mes "�@�{�͕̂ʂ̏ꏊ�ɂ���悤��";
	mes "�@���̍��݂̕��𒲍����悤�]^000000";
	cloakoffnpc "���݂̕�#pab_dun01q"; //1197
	cloakonnpc "�H�H�H�H#pab_dun01q"; //1198
	close;
//1009
//[�N�G�X�g�i�s]
}
pab_dun01q.gat,74,61,4	script	�l�����W�I�C�A#pab_dun0	10276,{/* 1199 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun01q.gat,79,61,4	script	���f�̉�#pab_dun01q	10172,{/* 1200 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun02.gat,119,101,0	script	spiral#pab_dun02	139,15,15,{/* 1952 */
	cloakoffnpc "�q�m#pab_dun02"; //1953
	cloakoffnpc "���݂̕�#pab_dun02"; //1954
	end;
}
pab_dun02.gat,117,103,4	script	�q�m#pab_dun02	419,9,9,{/* 1953 (cloaking)*/
	mes "[�q�m]";
	mes "�u���݂̕��v��";
	mes "�􂢂̗͂ɂ���Ď������c��ł��܂��B";
	mes "�����̐�ɐi�߂�";
	mes "�ߋ��̐��E�֍s�����Ƃ��\�ł��傤�B";
	close;
OnTouch:
	unittalk "�q�m : �`���җl�A���݂̕��̓�����͂�����ł��B";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun02.gat,119,101,4	script	���݂̕�#pab_dun02	723,2,2,{/* 1954 (cloaking)*/
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	if(select("���݂̕��ɔ�э���","��������") == 2) {
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnTouch:
	warp "pab_dun02q.gat",119,93;
	end;
OnInit:
	cloakonnpc;
	//[�N�G�X�g��p�]��]
	end;
}
pab_dun02q.gat,119,101,4	script	���݂̕�#pab_dun02q	723,2,2,{/* 1193 (cloaking)*/
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	switch(select("�V�L�i�̌��ɋA��","���݂̕��ɔ�э���","��������")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun02.gat",119,93;
		end;
	case 3:
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun02q.gat,119,101,4	script	�H�H�H�H#pab_dun02q	10045,3,3,{/* 1194 */
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "^0000ff�]�s�v�c�ȗ͂���������B";
		mes "�@�����Ƌ߂��Ŕ`������ł݂悤�]^000000";
		close;
	}
	misceffect 546, "�l�����J�f�X#pab_dun02q"; //1195
	misceffect 135, "�l�����J�f�X#pab_dun02q"; //1195
	cloakoffnpc "�l�����J�f�X#pab_dun02q"; //1195
	misceffect 546, "���f�̉�#pab_dun02q"; //1196
	misceffect 135, "���f�̉�#pab_dun02q"; //1196
	cloakoffnpc "���f�̉�#pab_dun02q"; //1196
	unittalk getnpcid(0,"�l�����J�f�X#pab_dun02q"),"�l�����J�f�X : ����c�c�ǂ����������΂炭���҂����������c�c�􂢂̗͂��c�c�܂��\���ł͂���܂���B";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : �]�̑����Ȃ�t��c�c���܂ő҂Ă΁c�c�]�̂��̓{����c�c";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : ���̕��{���c�c���E�Ɏ�����̂��c�c�I";
	unittalk getnpcid(0,"�l�����J�f�X#pab_dun02q"),"�l�����J�f�X : �����΂��̐h���ł��B���l�����������ɂł��􂢂̗͂��W�߁A����������������܂��傤�B";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : �����c�c��������̂��c�c�����Ȃ���΁c�c�������c�c���̗͂�}������ʁc�c�I";
	unittalk getnpcid(0,"�l�����J�f�X#pab_dun02q"),"�l�����J�f�X : ���m���܂����A�䂪����B�ז��҂�r�����c�c�����ɉ��������č����グ�܂��傤�B";
	misceffect 546, "�l�����J�f�X#pab_dun02q"; //1195
	misceffect 135, "�l�����J�f�X#pab_dun02q"; //1195
	cloakonnpc "�l�����J�f�X#pab_dun02q"; //1195
	misceffect 546, "���f�̉�#pab_dun02q"; //1196
	misceffect 135, "���f�̉�#pab_dun02q"; //1196
	cloakonnpc "���f�̉�#pab_dun02q"; //1196
	setquest 123704; //state=1
	mes "^0000ff�]�l�����Ɖ��̎c���v�O�������Ă��܂���";
	mes "�@�{�͕̂ʂ̏ꏊ�ɂ���悤��";
	mes "�@���̍��݂̕��𒲍����悤�]^000000";
	cloakoffnpc "���݂̕�#pab_dun02q"; //1193
	cloakonnpc "�H�H�H�H#pab_dun02q"; //1194
	close;
}
pab_dun02q.gat,116,103,4	script	�l�����J�f�X#pab_dun02q	10277,{/* 1195 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun02q.gat,122,103,4	script	���f�̉�#pab_dun02q	10172,{/* 1196 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun03.gat,118,111,0	script	spiral#pab_dun03	139,15,15,{/* 886 */
	cloakoffnpc "�q�m#pab_dun03"; //887
	cloakoffnpc "���݂̕�#pab_dun03"; //888
	end;
}
pab_dun03.gat,115,113,4	script	�q�m#pab_dun03	419,9,9,{/* 887 */
	mes "[�q�m]";
	mes "�u���݂̕��v��";
	mes "�􂢂̗͂ɂ���Ď������c��ł��܂��B";
	mes "�����̐�ɐi�߂�";
	mes "�ߋ��̐��E�֍s�����Ƃ��\�ł��傤�B";
	close;
OnTouch:
	unittalk "�q�m : �`���җl�A���݂̕��̓�����͂�����ł��B";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun03.gat,118,111,4	script	���݂̕�#pab_dun03	723,2,2,{/* 888 */
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	if(select("���݂̕��ɔ�э���","��������") == 2) {
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnTouch:
	warp "pab_dun03q.gat",118,103;
	end;
OnInit:
	cloakonnpc;
	//[�N�G�X�g��p�]��]
	end;
}
pab_dun03q.gat,118,111,4	script	���݂̕�#pab_dun03q	723,2,2,{/* 1189 (cloaking)*/
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	switch(select("�V�L�i�̌��ɋA��","���݂̕��ɔ�э���","��������")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun03.gat",118,103;
		end;
	case 3:
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun03q.gat,118,111,4	script	�H�H�H�H#pab_dun03q	10045,3,3,{/* 1190 */
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "^0000ff�]�s�v�c�ȗ͂���������B";
		mes "�@�����Ƌ߂��Ŕ`������ł݂悤�]^000000";
		close;
	}
	misceffect 546, "�l�����f�q����#pab_dun0"; //1191
	misceffect 135, "�l�����f�q����#pab_dun0"; //1191
	cloakoffnpc "�l�����f�q����#pab_dun0"; //1191
	misceffect 546, "���f�̉�#pab_dun03q"; //1192
	misceffect 135, "���f�̉�#pab_dun03q"; //1192
	cloakoffnpc "���f�̉�#pab_dun03q"; //1192
	unittalk getnpcid(0,"�l�����J�f�X#pab_dun02q"),"�l�����f�q���� : �䂪����c�c�䂪���ɐ����A���ɋw�Ȃ��҂�j���ĎQ��܂��傤�c�c";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : �]�̉s���Ȃ铁���c�c�f�q������c�c�]�̓G�́c�c���̐��E�S�Ă��c�c";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : �Y�ꂽ�킯�ł͂���܂��c�c���̐��̂���Ƃ����郂�m���]�ɏ|�˂����̂��c�c";
	unittalk getnpcid(0,"�l�����J�f�X#pab_dun02q"),"�l�����f�q���� : �Ȃ�΂��̃f�q�����c�c���̌��Ɛ���A���̐��E�̑S�Ă��a�荏��ŎQ��܂��傤�B";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : �s���c�c���̌��ł��̐��E�Ɂc�c���|������ł����c�c�I";
	unittalk getnpcid(0,"�l�����J�f�X#pab_dun02q"),"�l�����f�q���� : ��Ӂc�c�I";
	misceffect 546, "�l�����f�q����#pab_dun0"; //1191
	misceffect 135, "�l�����f�q����#pab_dun0"; //1191
	cloakonnpc "�l�����f�q����#pab_dun0"; //1191
	misceffect 546, "���f�̉�#pab_dun03q"; //1192
	misceffect 135, "���f�̉�#pab_dun03q"; //1192
	cloakonnpc "���f�̉�#pab_dun03q"; //1192
	setquest 123705; //state=1
	mes "^0000ff�]�l�����Ɖ��̎c���v�O�������Ă��܂���";
	mes "�@�{�͕̂ʂ̏ꏊ�ɂ���悤��";
	mes "�@���̍��݂̕��𒲍����悤�]^000000";
	cloakoffnpc "���݂̕�#pab_dun03q"; //1189
	cloakonnpc "�H�H�H�H#pab_dun03q"; //1190
	close;
}
pab_dun03q.gat,115,113,4	script	�l�����f�q����#pab_dun0	10278,{/* 1191 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun03q.gat,121,113,4	script	���f�̉�#pab_dun03q	10172,{/* 1192 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun04.gat,93,127,0	script	spiral#pab_dun04	139,15,15,{/* 883 */
	cloakoffnpc "�q�m#pab_dun04"; //884
	cloakoffnpc "���݂̕�#pab_dun04"; //885
	end;
}
pab_dun04.gat,90,129,4	script	�q�m#pab_dun04	419,9,9,{/* 884 (cloaking)*/
	mes "[�q�m]";
	mes "�u���݂̕��v��";
	mes "�􂢂̗͂ɂ���Ď������c��ł��܂��B";
	mes "�����̐�ɐi�߂�";
	mes "�ߋ��̐��E�֍s�����Ƃ��\�ł��傤�B";
	close;
OnTouch:
	unittalk "�q�m : �`���җl�A���݂̕��̓�����͂�����ł��B";
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun04.gat,93,127,4	script	���݂̕�#pab_dun04	723,2,2,{/* 885 (cloaking)*/
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	if(select("���݂̕��ɔ�э���","��������") == 2) {
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnTouch:
	warp "pab_dun04q.gat",93,119;
	end;
OnInit:
	cloakonnpc;
	//[�N�G�X�g��p�]��]
	end;
}
pab_dun04q.gat,93,127,4	script	���݂̕�#pab_dun04q	723,2,2,{/* 1185 (cloaking)*/
	mes "^0000ff�]�������h�炢�ł���B";
	mes "�@��э��߂΁A�ʎ�����";
	mes "�@�s�����Ƃ��ł���悤���]^000000";
	next;
	switch(select("�V�L�i�̌��ɋA��","���݂̕��ɔ�э���","��������")) {
	case 1:
		warp "pab_camp.gat",36,189;
		end;
	case 2:
		warp "pab_dun04.gat",93,119;
		end;
	case 3:
		mes "^0000ff�]���̏ꂩ�痧���������]^000000";
		close;
	}
OnInit:
	cloakonnpc;
	end;
}
pab_dun04q.gat,93,127,4	script	�H�H�H�H#pab_dun04q	10045,3,3,{/* 1186 */
	misceffect 546, "�l�����q�����G��#pab_du"; //1187
	misceffect 135, "�l�����q�����G��#pab_du"; //1187
	cloakoffnpc "�l�����q�����G��#pab_du"; //1187
	misceffect 546, "���f�̉�#pab_dun04q"; //1188
	misceffect 135, "���f�̉�#pab_dun04q"; //1188
	cloakoffnpc "���f�̉�#pab_dun04q"; //1188
	unittalk getnpcid(0,"�l�����q�����G��#pab_du"),"�l�����q�����G�� : �܂��c�c�݂��Ƃ��Ȃ����p�ɂȂ������̂˂��c�c���l�c�c�B";
	unittalk getnpcid(0,"�l�����q�����G��#pab_du"),"�l�����q�����G�� : ���̂��񂽂́c�c���������̉�������c�c���͂͂́I";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : ���������Ɓc�c���������c�c���ꂱ���]�̖{�]�c�c�S�Ă��������]�ɑ��������^�����c�c";
	unittalk getnpcid(0,"�l�����q�����G��#pab_du"),"�l�����q�����G�� : �ӂ���c�c������ʂ��Ȃ��Ȃ�Ȃ�āc�c�����ǂ܂��A�����Ȃ��킟�c�c";
	unittalk getnpcid(0,"�l�����q�����G��#pab_du"),"�l�����q�����G�� : ���񂽂ƈꏏ�Ȃ�c�c���̂�����Ȃ����E���A�����͊y���߂��������˂��c�c�I";
	unittalk getnpcid(0,"���f�̉�#pab_dun02q"),"���f�̉� : �]�̋����Ȃ铹���t��c�c�s���c�c�]���y���܂��Ă݂���c�c";
	unittalk getnpcid(0,"�l�����q�����G��#pab_du"),"�l�����q�����G�� : ���͍D���Ȃ悤�ɂ�邾����c�c���񂽂̏o�ԂȂ񂩍���Ă����Ȃ���I�@���`�͂͂͂́I";
	misceffect 546, "�l�����q�����G��#pab_du"; //1187
	misceffect 135, "�l�����q�����G��#pab_du"; //1187
	cloakonnpc "�l�����q�����G��#pab_du"; //1187
	misceffect 546, "���f�̉�#pab_dun04q"; //1188
	misceffect 135, "���f�̉�#pab_dun04q"; //1188
	cloakonnpc "���f�̉�#pab_dun04q"; //1188
	setquest 123706; //state=1
	mes "^0000ff�]�S�Ă̍��݂̕���";
	mes "�@���������������B";
	mes "�@�߂��ăV�L�i�ɕ񍐂��悤�]^000000";
	cloakoffnpc "���݂̕�#pab_dun04q"; //1185
	cloakonnpc "�H�H�H�H#pab_dun04q"; //1186
	close;
}
pab_dun04q.gat,90,129,4	script	�l�����q�����G��#pab_du	10279,{/* 1187 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
pab_dun04q.gat,96,129,4	script	���f�̉�#pab_dun04q	10172,{/* 1188 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}
