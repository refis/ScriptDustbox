anthell02.gat,177,190,3	script	�~���R#2F_1	754,{/* 11167 */
	if(BaseLevel < 180) {
		mes "[�~���R]";
		mes "�u���A�Z���͂܂�������Ȃ��H";
		emotion 19,"�~���R#2F_1";	// 11167
		unittalk getnpcid(0,"�~���R#2F_1"),"�~���R : �u���A�Z���͂܂�������Ȃ��H";	// 11167
		next;
		mes "[�������_]";
		mes "�����A�������Ă��Ȃ��B";
		mes "��͂�A�������ɉ�������̂�";
		mes "�m�F���Ȃ���Ȃ�Ȃ��̂��c�c�B";
		emotion 19,"�������_#2F_1";	// 11168
		unittalk getnpcid(0,"�������_#2F_1"),"�������_ : �����A�������Ă��Ȃ��B��͂�A�������ɉ�������̂��m�F���Ȃ���Ȃ�Ȃ��̂��c�c�B";	// 11168
		next;
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u�a�n���̐V�̈�v��";
		mes "BaseLv180�ȏ�Ői�s�\�ł��B^000000";
		close;
	}
	if(checkitemblank() == 0) {
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "����ȏ㑽���̎�ނ�";
		mes "�ו��������Ƃ��o���܂���B";
		mes "1�ȏ�̋󂫂�����Ă��������B^000000";
		close;
	}
	mes "�]���Ȃ��͎��͂̊댯����菜�����]";
	close2;
	warp "anthell02_q.gat",172,185;
	end;
}
anthell02.gat,172,189,5	script	�������_#2F_1	12,{/* 11168 */
	if(BaseLevel < 180) {
		mes "[�������_]";
		mes "���܂ł��������Ă���킯�ɂ́c�c�B";
		mes "�ł��A�������ɓ��ꂻ���ȋ����`���҂�";
		mes "����܂ł͓����悤���c�c�B";
		next;
		mes "^ff0000�y�C���t�H���[�V�����z";
		mes "�N�G�X�g�u�a�n���̐V�̈�v��";
		mes "BaseLv180�ȏ�Ői�s�\�ł��B^000000";
		close;
	}
	switch(IL_ANT_QUE) {
	case 0:
		emotion 19,"�������_#2F_1";	// 11168
		unittalk getnpcid(0,"�������_#2F_1"),"�������_ : �ԈႢ�Ȃ��{���ɓ�������ȁH",1;	// 11168
		emotion 19,"�~���R#2F_1";	// 11167
		unittalk getnpcid(0,"�~���R#2F_1"),"�~���R : �����Ȃ񂾂�B�ڌ��҂����l����B���r�����䂵�������W���[�炵������A�ޏ����������Ƃ����ޏ��̗F�l�ł���͂����Ȃ��B",1;	// 11167
		mes "�]����獞�ݓ������b�����Ă���悤���]";
		close;
	case 1:
		mes "[�������_]";
		mes "���`��c�c�B";
		close;
	case 2:
		mes "[�������_]";
		mes "�}�ɂ��܂Ȃ��ȁc�c�B";
		close;
	case 3:
		mes "[�������_]";
		mes "�����ǂ��Ȃ��Ă�񂾁c�c�B";
		close;
	case 4:
		mes "[�������_]";
		mes "����������������������c�c�B";
		close;
	case 5:
		mes "[�������_]";
		mes "�u���A�Z���������H";
		mes "�����Ă���H�悩�����c�c�B";
		mes "�ŁA�ǂ����ĘA��Ă��Ȃ������񂾁H";
		close;
	case 6:
	case 7:
	case 8:
	case 9:
		mes "[�������_]";
		mes "���������s�����炢���񂾂��ǁc�c�B";
		mes "�u���A�Z���𗊂ށB";
		close;
	case 10://
	case 11:
		mes "[�������_]";
		mes "������A�������I";
		mes "�ǂ�����o�Ă����񂾂�H�I";
		close;
	case 12:
		mes "[�������_]";
		mes "���񂾂��A"+strcharinfo(0)+"�c�c�B";
		close;
	case 13:
		mes "[�������_]";
		mes "�c�c�B";
		close;
	case 14:
		mes "[�������_]";
		mes "�����̊Ԃ́A���̌����𑱂��邵���Ȃ��ȁB";
		mes "�d�����Ȃ��B���ɂȂ�d���͌�񂵂��B";
		close;
	}
	end;
OnInit:
	// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
	setnpcdisplay "�������_#2F_1",12,0,0,9,4,0,1501,0,0,0;	// 11168
	end;
}
anthell02.gat,170,185,0	script	#il_ant002	139,14,14,{/* 11169 */
	if(IL_ANT_QUE == 11 || IL_ANT_QUE == 12)
		cloakoffnpc "�t���I#ant2";	// 11171
	else if(IL_ANT_QUE == 13 || IL_ANT_QUE == 14) {
		cloakoffnpc "�t���I#ant2";	// 11171
		cloakoffnpc "�u���A�Z��#ant2";	// 11170
	}
}
anthell02.gat,167,186,6	script	�u���A�Z��#ant2	4056,{/* 11170 (cloaking)*/
	end;
OnInit:
	// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
	setnpcdisplay "�u���A�Z��#ant2",4056,0,1,13,7,0,1523,0,0,0;	// 11170
	end;
}
anthell02.gat,174,177,5	script	�t���I#ant2	4070,{/* 11171 (cloaking)*/
	mes "[�t���I]";
	mes "�b��������ȁc�c�B";
	mes "�w�����@���񂶂�Ȃ��c�c�B";
	mes "������ƁA�������ɍs���Ă���c�c�B";
	close;
OnInit:
	setnpcdisplay "�t���I#ant2",4070,1,0,12,3,65,0,0,0,0;	// 11171
	end;
}
anthell02.gat,177,181,3	script	�S�[�i#ant2	4068,{/* 11172 */
	if(IL_ANT_QUE == 13) {
		mes "[�S�[�i]";
		mes "�厖�ɂȂ�Ƃ��낾�����ȁc�c�B";
		close;
	}
	if(IL_ANT_QUE == 8 || IL_ANT_QUE == 11) {
		mes "[�S�[�i]";
		mes "�{���ɂ������͐��C�œ����悤��";
		mes "�ꏊ����Ȃ���c�c�B";
		mes "���񂽂͂悭����Ȃɏo����ł���ȁc�c�B";
		close;
	}
	if(IL_ANT_QUE >= 7) {
		mes "[�S�[�i]";
		mes "���������c�c�B";
		close;
	}
	if(IL_ANT_QUE >= 6) {
		mes "[�S�[�i]";
		mes "��́A���������ŉ����N���Ă�񂾁H";
		close;
	}
	if(IL_ANT_QUE >= 5) {
		mes "�]���X�Q��������������B";
		mes "�@�b�������Ă͂����Ȃ����͋C���]";
		close;
	}
	if(IL_ANT_QUE >= 4) {
		mes "�]�����n�ʂɂ��āA";
		mes "�@�ǂɌ������Ă������ɂȂ��Ă���B";
		mes "�@�b�������Ă͂����Ȃ����͋C���]";
		close;
	}
	mes "[�S�[�i]";
	mes "�͂��c�c�B";
	mes "���낢��Ɩ��͂��邪�A�~���R�̓z�A";
	mes "�x���������͊m���Ȃ񂾂�B";
	mes "�˗���Ƃ��ẮA������Ȃ񂾁B";
	close;
OnInit:
	// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
	setnpcdisplay "�S�[�i#ant2",4068,1,0,13,5,0,0,0,0,0;	// 11172
	end;
}

anthell02_q.gat,177,190,3	script	�~���R#1F	754,{/* 6405 */
	if(checkitemblank() == 0) {
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "����ȏ㑽���̎�ނ�";
		mes "�ו��������Ƃ��o���܂���B";
		mes "1�ȏ�̋󂫂�����Ă��������B^000000";
		close;
	}
	switch(IL_ANT_QUE) {
	case 0:
		mes "[�������_]";
		mes "�ԈႢ�Ȃ��{���ɓ�������ȁH";
		emotion 19,"�������_#1F";	// 6406
		unittalk getnpcid(0,"�������_#1F"),"�������_ : �ԈႢ�Ȃ��{���ɓ�������ȁH",1;	// 6406
		next;
		mes "[�~���R]";
		mes "�����Ȃ񂾂�B�ڌ��҂����l����B";
		mes "���r�����䂵�������W���[�炵������A";
		mes "�ޏ����������Ƃ���";
		mes "�ޏ��̗F�l�ł���͂����Ȃ��B";
		emotion 19,"�~���R#1F";	// 6405
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �����Ȃ񂾂�B�ڌ��҂����l����B���r�����䂵�������W���[�炵������A�ޏ����������Ƃ����ޏ��̗F�l�ł���͂����Ȃ��B",1;	// 6405
		next;
		mes "[�������_]";
		mes "�ǂ�����H";
		mes "�����܂ŕ��������񂶂�";
		mes "�{������ǂ��낶��c�c�B";
		unittalk getnpcid(0,"�������_#1F"),"�������_ : �ǂ�����H�����܂ŕ��������񂶂�{������Ƃ��낶��c�c�B",1;	// 6406
		next;
		mes "[�~���R]";
		mes "���A������ƁI";
		mes "�����̖`���ҁI�҂��đ҂��āI";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : ���A������ƁI�����̖`���ҁI�҂��đ҂��āI",1;	// 6405
		next;
		menu "���H",-;
		unittalk getcharid(3),strcharinfo(0)+" : ���H",1;	// self:hidden
		mes "[�~���R]";
		mes "�����I�L�~���L�~�B";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �����I�L�~���L�~�B",1;	// 6405
		next;
		mes "[�~���R]";
		mes "�����ɗ���̂͋v���U�肩���H";
		mes "���x�ǂ������A�ʔ����b������B";
		mes "�l�����͂��̕ӂ�";
		mes "�a�̌��������Ă����񂾂��A";
		mes "�ŋ߁A�a�n���̐V�����̈�֒ʂ��铹��";
		mes "���������񂾁B";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �����ɗ���̂͋v���U�肩���H���x�ǂ������A�ʔ����b������B�l�����͂��̕ӂŋa�̌��������Ă����񂾂��A�ŋ߁A�a�n���̐V�����̈�֒ʂ��铹�𔭌������񂾁B",1;	// 6405
		next;
		mes "[�������_]";
		mes "�����A������Șb�����Ăǂ�����񂾂�I";
		mes "�������A�u�l�����v�̌�������Ȃ��āA";
		mes "�u���O�v�̌������낤�I";
		emotion 19,"�������_#1F";	// 6406
		unittalk getnpcid(0,"�������_#1F"),"�������_ : �����A������Șb�����Ăǂ�����񂾂�I�������A�u�l�����v�̌�������Ȃ��āA�u���O�v�̌������낤�I",1;	// 6406
		next;
		menu "�}�ɂǂ�������ł����H",-;
		mes "[�������_]";
		mes "�ق�݂�A�`���҂̒U�߂�";
		mes "�˘f���Ă��邾�낤�H";
		mes "���܂Ȃ��A�`���҂̒U�߁B";
		mes "������Ƒ҂��ĂĂ���B";
		next;
		mes "�]�������_�ƃ~���R�����k���n�߂��]";
		next;
		mes "[�������_]";
		mes "���O���A�����łł��邱�Ƃ���";
		mes "�{���ɂ���̂��H";
		mes "���܂ɂ͎����Ŗ������������B";
		unittalk getnpcid(0,"�������_#1F"),"�������_ : ���O���A�����łł��邱�Ƃ��Ė{���ɂ���̂��H���܂ɂ͎����Ŗ������������B",1;	// 6406
		next;
		mes "[�~���R]";
		mes "���������A�l���s���Ăǁ[���񂾂�B";
		mes "���x�����Ƃ���Ɍ��ꂽ�`���҂̕���";
		mes "�K�C����H";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : ���������A�l���s���Ăǁ[���񂾂�B���x�����Ƃ���Ɍ��ꂽ�`���҂̕����K�C����H",1;	// 6405
		next;
		mes "[�������_]";
		mes "���̂Ȃ��c�c�B";
		unittalk getnpcid(0,"�������_#1F"),"�������_ : ���̂Ȃ��c�c�B",1;	// 6406
		next;
		mes "[�~���R]";
		mes "�܂��A��������Ȃ����B";
		mes "�ǂ���ɂ��Ă��A�l�͍��A�����Ɛl��";
		mes "�ق�Ȃ���Ȃ�Ȃ��񂾂�B";
		mes "��Ղł��Ȃ��񂾂���A";
		mes "������Ɩ\��邮�炢���������B";
		emotion 19,"�~���R#1F";	// 6405
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �܂��A��������Ȃ����B�ǂ���ɂ��Ă��A�l�͍��A�����Ɛl���ق�Ȃ���Ȃ�Ȃ��񂾂�B��Ղł��Ȃ��񂾂���A������Ɩ\��邮�炢���������B",1;	// 6405
		next;
		emotion 19,"�������_#1F";	// 6406
		mes "[�������_]";
		mes "���O�����A�������N������";
		mes "��n���������ɉ񂷂̂͂�߂Ă���B";
		mes "�͂��c�c�B";
		unittalk getnpcid(0,"�������_#1F"),"�������_ : ���O�����A�������N�����Č�n���������ɉ񂷂̂͂�߂Ă���B�͂��c�c�B",1;	// 6406
		next;
		emotion 19,"�~���R#1F";	// 6405
		mes "[�~���R]";
		mes "�ق�A�`���҂�҂����Ă��邶��Ȃ����B";
		mes "�G�k�͌�񂵂ɂ��悤�B";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �ق�A�`���҂�҂����Ă��邶��Ȃ����B�G�k�͌�񂵂ɂ��悤�B",1;	// 6405
		next;
		mes "[�~���R]";
		mes "�҂������ˁB�b���ĊJ���悤�B";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �҂������ˁB�b���ĊJ���悤�B",1;	// 6405
		close2;
		unittalk getcharid(3),strcharinfo(0)+" : �]�~���R�ɂ�����x�b�����悤�]",1;	// self:hidden
		setquest 8719;	// state=1
		set IL_ANT_QUE,1;
		end;
	case 1:
		mes "[�~���R]";
		mes "�܂��́A�`���҂̒U�߁B";
		mes "���O�͂Ȃ�Ă����񂾁H";
		next;
		menu strcharinfo(0),-;
		mes "[�~���R]";
		mes "�������A"+strcharinfo(0)+"���B";
		mes "�l�̓~���R�A�������̓������_�B";
		next;
		mes "[�~���R]";
		mes "�������������ǁA�{�肩������B";
		mes "���񗊂݂����̂͒����ł͂Ȃ��āA";
		mes "�������b�����V�����a�̑��ɍs����";
		mes "���Ԃ��~�o���Ăق����B";
		next;
		menu "�~�o�H",-;
		mes "[�~���R]";
		mes "�����B�~�o���B";
		mes "���O�́A�u���A�Z���ƃJ�t���X�Ƃ����B";
		mes "�u���A�Z���͖l�����̒��ԂŁA";
		mes "�E�Ƃ̓����W���[���B";
		next;
		mes "[�~���R]";
		mes "�J�t���X�́A�l�����͎��ۂɂ�";
		mes "��������Ƃ��Ȃ��B";
		mes "�u���A�Z�����a�̑��̒��Ō������Ƃ���";
		mes "���Ԃ��B";
		mes "�u���A�Z���H���A�u���A�Z���ƉZ���";
		mes "������Ă���炵���B";
		next;
		mes "[�~���R]";
		mes "���̃u���A�Z�����A������A�����𕉂���";
		mes "�a�̑�����o�Ă����񂾁B";
		mes "�u���A�Z���́A";
		mes "�u�܂��J�t���X�����Ɏc���Ă��邩��";
		mes "�����ɍs���Ȃ��Ɓc�c�v�ƌ����������񂾁B";
		next;
		mes "[�~���R]";
		mes "����𕷂��āA�l�����͈��Â�}��悤��";
		mes "�������񂾁B";
		mes "�u����ȏ�Ԃŋ~���Ȃ�Ė������낤�v�ƁB";
		mes "�����ǁA�l�������ڂ𗣂������ɁA";
		mes "�u���A�Z���͑����̂܂܋a�̑���";
		mes "�����Ă��܂����悤�Ȃ񂾁B";
		next;
		mes "[�~���R]";
		mes "���ށI";
		mes "2�l�̓��A�ǂ��炩�ł����t������";
		mes "��U�A��߂��ė~�����B";
		next;
		menu "�ڂ����b�𕷂����ĖႦ�܂����H",-;
		mes "[�~���R]";
		mes "���������B";
		mes "�ڂ����b���ƒ����Ȃ邩��A";
		mes "�������ł�����A������x�b�����Ă���B";
		close2;
		delquest 8719;
		setquest 129755;	// state=1
		set IL_ANT_QUE,2;
		end;
	case 2:
		mes "[�~���R]";
		mes "�Ƃ肠�����A�ǂ�����b�������B";
		next;
		menu "�a�̑��̐V�������ɂ���",-;
		mes "[�~���R]";
		mes "�a�̑��̐V�������ˁB";
		mes "������������͖̂{���ɋ��R�������B";
		mes "�{���A���R�A���R�ǂ��󂵂Ă���c�c�B";
		mes "�l�����݂����Ȏ҂ł�����������قǂ�";
		mes "�����͂��I���Ⴖ��[��ƁI";
		mes "�ǂ̌���������`����Ă������B";
		next;
		mes "[�~���R]";
		mes "�`���҂̗���Ȃ�ǂ�����H";
		mes "�����͈�Ղł��Ȃ����A";
		mes "�l�̍��Ղ��Ȃ��c�c�B";
		mes "����Ȃ璲�ׂ邵���Ȃ������I";
		next;
		mes "[�~���R]";
		mes "������A����ȕ��Ɂc�c���ꂽ�ǂ�";
		mes "���������Ɏ��L�΂���";
		mes "�`�����񂾂킯�B";
		next;
		menu "�E���ł���",-;
		mes "[�������_]";
		mes "�����c�c�{���ɂ����́A";
		mes "���̎��E����������c�c�B";
		mes "���Ȃ��ɍς�ł悩�����ȁB";
		next;
		mes "[�~���R]";
		mes "�����Ă��邩�炢���񂾁I";
		mes "�Ƃɂ����A���ꂽ�ǂ̌���������";
		mes "�`�����񂾂킯�B";
		mes "����ŁA�ǂ��ɑ����Ă���̂�";
		mes "�m�F�����񂾁B";
		next;
		mes "[�~���R]";
		mes "�����͋a�n���̒n��2�K�ł���H";
		mes "�a�n���̒n��1�K�ɏオ�铹��";
		mes "���������ɂ��邶���H";
		mes "������������A�n��1�K�ƒn��2�K���q��";
		mes "�V�������̔������Ȃ��Ďv�����񂾂�ˁB";
		mes "�Ȃ̂Ɂc�c��������Ȃ������񂾂�I";
		next;
		mes "[�~���R]";
		mes "�n��1�K�Ƃ͌q�����Ă��Ȃ��������A";
		mes "���������A����������Ă��񂾁B";
		mes "���͋C���Ă����̂��ȁH";
		mes "�ǂ����O���Łc�c�A";
		mes "���̒�������Ă�悤�ȁc�c����Ȋ����H";
		next;
		mes "[�������_]";
		mes "���C���e�������g�������Ƃ݂����Ȋ����B";
		next;
		mes "[�~���R]";
		mes "������ƁI";
		mes "����Ȑ�������S�R�킩��Ȃ�����I";
		next;
		menu "�Ȃ�ƂȂ��킩��܂���",-;
		mes "[�������_]";
		mes "�j�R�b";
		next;
		mes "[�~���R]";
		mes "�l�������c�c�H������Ȃ��̂́c�c�B";
		mes "�܂��A�{��ɖ߂낤�B�������Â��̒���";
		mes "�����������Ă���ꏊ���������炸�ɁA";
		mes "�F�������̂��甍�������悤�ȁc�c�B";
		mes "���̂Ȃ񂾁c�c�B";
		next;
		mes "[�������_]";
		mes "�y��������Ԃ��ȁB";
		mes "�S�z�Ȃ��B�[���Ȃ��̂ł͂Ȃ��A";
		mes "�����ɂ�����҂茶��������悤��";
		mes "���̂�������B�m�肶��Ȃ��̂́A";
		mes "���������������Ƃ������������炾�B";
		mes "�l�ɂ���Ă͂�����ƈႤ�炵���B";
		next;
		mes "[�������_]";
		mes "�����瑤�ɏo��ƁA";
		mes "�ǂ̌��������Ō������͌�������";
		mes "�Ƃ킩�邯�ǁA";
		mes "�ǂ̌��������ɂ���Ԃ͌����ƌ��̋�ʂ�";
		mes "�t���Ȃ��Ȃ��Ă����񂾁B";
		next;
		mes "[�~���R]";
		mes "���������I";
		mes "�ǂ������E�����z�����C����������B";
		mes "�������A�a�̋����������ɂ���z��ƈ����";
		mes "���͂��������I";
		next;
		mes "[�~���R]";
		mes "���͂Ƃ�����A";
		mes "�A���ė��ꂽ����悩������B";
		mes "�K���A�ǂ̌��������ɂ���a�����́A";
		mes "�ǂ̌������������";
		mes "�ǂ��ė��Ȃ��l�q���������B";
		next;
		mes "[�~���R]";
		mes "���̌�A�l�͂�����̒n�������͒��~���A";
		mes "�V��������������낤�Ƃ����񂾁B";
		next;
		mes "[�������_]";
		mes "�ł��A���̕ӂɗ���`���҂���A";
		mes "�������ɑ������������ɂ͖����Ȃ������B";
		mes "�d���Ȃ��A�������̒���";
		mes "��ԋ����u���A�Z�����P�ƂŁA";
		mes "���ƃ~���R����l�g�p�[�e�B��";
		mes "�������������Ă����񂾁B";
		next;
		mes "[�������_]";
		mes "�Ƃ��낪�A������A";
		mes "�u���A�Z�����A�����ɂ�������Ȑl��������";
		mes "�����o�����񂾁B";
		mes "���ꂪ�A�J�t���X���Ă킯���B";
		next;
		mes "[�������_]";
		mes "�������́A�ŏ��́A";
		mes "�J�t���X�̓u���A�Z��������������Ȃ�����";
		mes "�v�����񂾁B";
		next;
		mes "[�������_]";
		mes "�����A�������b�����ʂ�A";
		mes "�ǂ̌��������ł́A�l�͌���";
		mes "���邱�Ƃ����邯��ǁA�o����ɂ�";
		mes "���ꂪ�����ƋC�t�����̂Ȃ񂾁B";
		mes "�������A�u���A�Z���͂����瑤�ɏo������A";
		mes "�����b�𑱂��Ă����񂾁B";
		next;
		mes "[�������_]";
		mes "������A�{���̉\�����������񂾁B";
		mes "�������͈�x���J�t���X���������Ƃ�";
		mes "�Ȃ��񂾂��c�c�B";
		next;
		mes "[�������_]";
		mes "����Ȃ��Ƃ���������A";
		mes "�u���A�Z���͒P�Ƃł̒����ɂ��Ă�";
		mes "���\�Ȑ��ʂ��o���Ă�������A";
		mes "�������܂Œ���������K�v�͂Ȃ��A";
		mes "�O�őҋ@���邱�Ƃ������Ȃ����B";
		next;
		mes "[�������_]";
		mes "���ꂩ�琔����������̏o��������B";
		mes "�����𕉂��Ė߂��ė����������A";
		mes "�܂����Ɏ����̒��Ԃ��c���Ă������";
		mes "�����o�����񂾁B";
		mes "�J�t���X���a�ɒǂ��Ă�����āc�c�B";
		next;
		mes "[�������_]";
		mes "�����A�u���A�Z���̉���͂��Ȃ荓���A";
		mes "�N���̋~���Ɍ������Ȃ�ē��ꖳ����";
		mes "��Ԃ������B������A�����̊Ԃ�";
		mes "���Â�}��悤�Ɍ������񂾂��c�c�A";
		mes "��l�ŕǂ̌���������";
		mes "�s���Ă��܂����悤�Ȃ񂾁c�c�B";
		next;
		mes "[�������_]";
		mes "����ȑ��������Ă���̂ɁA";
		mes "�ǂ̌��������ŒP�Ƃōs������Ȃ�āA";
		mes "���ɌW��鎖�Ԃ��c�c�B";
		next;
		mes "[�~���R]";
		mes "�����ǁA�l������l��������A";
		mes "���ɓ����Ă��~���͖������B";
		mes "���̒��Ԃ��A�~���Ɍ�������ق�";
		mes "�r�̗��z�͂��Ȃ��B";
		next;
		mes "[�~���R]";
		mes "���ށB�u���A�Z���ƁA";
		mes "�ޏ��ƉZ��Ƃ����J�t���X��T���Ă���B";
		mes "2�l�̓��A�ǂ��炩�ł����t������A";
		mes "��U�A�A��Ė߂��Ă��ė~�����B";
		next;
		mes "[�������_]";
		mes "�`���҂̒U�߁A";
		mes "�ǂ����u���A�Z���������Ă���B";
		mes "���肢���B";
		next;
		menu "�킩����",-;
		mes "[�~���R]";
		mes "���肪�Ƃ��I";
		mes "�~���Ɍ������������ł�����A";
		mes "���������Ă���B";
		mes "�ǂ̌��������ֈē�����B";
		close2;
		delquest 129755;
		setquest 8720;	// state=1
		set IL_ANT_QUE,3;
		end;
	case 3:
		mes "[�~���R]";
		mes "���ށB�u���A�Z���ƁA";
		mes "�ޏ��ƉZ��Ƃ����J�t���X��T���Ă���B";
		mes "2�l�̓��A�ǂ��炩�ł����t������A";
		mes "��U�A�A��Ė߂��Ă��ė~�����B";
		mes "�ǂ̌��������Ɍ����������͂��������H";
		next;
		if(select("���Ȃ�","������Ƒ҂���") == 2) {
			mes "[�~���R]";
			mes "�}�Ȉ˗��ł��܂Ȃ��B";
			mes "�ǂ̌��������́A�܂�������";
			mes "�I����Ă��Ȃ��ꏊ�Ȃ񂾁B";
			mes "�}���Ȃ��Ǝ��Ԃ��̂��Ȃ����ƂɂȂ�B";
			mes "�������ł�����A�b�������Ă���B";
			close;
		}
		mes "[�~���R]";
		mes "���Ⴀ�A�������ցc�c�B";
		close2;
		delquest 8720;
		setquest 8721;	// state=1
		set IL_ANT_QUE,4;
		warp "ant_d02_i_q.gat", 172, 185;	// from: anthell02_q.gat(175, 186)
		end;
	case 4:
		mes "[�~���R]";
		mes "�Ăуu���A�Z����T���ɍs�������H";
		next;
		if(select("�͂�","���") == 2) {
			mes "[�~���R]";
			mes "�}�Ȉ˗��ł��܂Ȃ��B";
			mes "���̒��͂܂��������I����Ă��Ȃ�";
			mes "�ꏊ������A�ǂ����Ă��s����";
			mes "�@���؂�Ȃ��āc�c�B";
			close;
		}
		mes "[�~���R]";
		mes "���Ⴀ�A�������ցc�c�B";
		close2;
		warp "ant_d02_i_q.gat", 172, 185;	// from: anthell02_q.gat(172, 185)
		end;
	case 5:
		mes "[�~���R]";
		mes "�u���A�Z���������������āH";
		mes "�����Ă���H�H";
		mes "�悩�����c�c�B";
		next;
		mes "[�������_]";
		mes "�������A���̈ꏏ�ɗ��Ȃ������񂾁H";
		next;
		mes "�]�u���A�Z������������Ă���Ƃ�";
		mes "�@�v���Ȃ��قǌ��C�ŁA";
		mes "�@�������Ƃ𕷂������ɂȂ��l�q��";
		mes "�@���������Ƃ��A���������B�]";
		next;
		mes "[�~���R]";
		mes "���C�������H";
		mes "����Ȃ͂��͂Ȃ��Ƃ͎v�����ǁA";
		mes "�N���R�������Ă���悤�ɂ�";
		mes "�����Ȃ��c�c�B";
		next;
		mes "[�~���R]";
		mes "�c�c�d���Ȃ��B���������A";
		mes "�ȒP�Ɍ������Ƃ𕷂��悤��������A";
		mes "�`���҂̌N�ɗ��ނ��Ƃ�";
		mes "�Ȃ��������낤���c�c�B";
		mes "���̘b��M�����B";
		next;
		delquest 8722;
		setquest 8723;	// state=1
		set IL_ANT_QUE,6;
		mes "[�~���R]";
		mes "�Ƃ͂����A�u���A�Z�����S�z���B";
		mes "�\����Ȃ�����ǁA";
		mes "�u���A�Z�������̗F�l��T���̂�";
		mes "��`���Ă���Ă���Ȃ����H";
		next;
		if(select("�͂�","���") == 2) {
			mes "[�~���R]";
			mes "�������c�c�d���Ȃ��ȁB";
			mes "�l�������T����";
			mes "�s����΂����񂾂��ǁc�c�B";
			close;
		}
		// todo
		mes "[�~���R]";
		mes "���肪�Ƃ��B";
		mes "���ꂶ��������ɑ����B";
		close2;
		warp "ant_d02_i_q.gat", 172, 185;	// from: anthell02_q.gat(170, 187)
		end;
	case 6:
	case 7:
	case 8:
	case 9:
	case 10://
		mes "[�~���R]";
		mes "�u���A�Z�������̗F�l��T���̂�";
		mes "��`���Ă���Ă���Ȃ����H";
		next;
		if(select("�͂�","���") == 2) {
			mes "[�~���R]";
			mes "�������c�c�d���Ȃ��ȁB";
			mes "�l�������T����";
			mes "�s����΂����񂾂��ǁc�c�B";
			close;
		}
		mes "[�~���R]";
		mes "���肪�Ƃ��B";
		mes "���ꂶ��������ɑ����B";
		close2;
		warp "ant_d02_i_q.gat", 172, 185;	// from: anthell02_q.gat(170, 187)
		end;
	case 11:
		mes "[�~���R]";
		mes "������A�������I";
		mes "�}�ɏo�Ă���ƐS���Ɉ����ȁc�c�B";
		next;
		mes "[�������_]";
		mes "�ǂ��������H";
		next;
		mes "�]�V�����̈�ŋN���������e��";
		mes "�@�~���R�����ɓ`�����]";
		next;
		mes "[�������_]";
		mes "�u���A�Z�����}�ɉ��䂵�����̂悤��";
		mes "���̏�ɂ������܂����H";
		mes "�����āA�u���A�Z���̗F�l��";
		mes "�J�t���X�炵���l����3�l���������āH";
		next;
		mes "[�~���R]";
		mes "3�l�Ƃ���b�̍Œ��ɏ����Ă��܂����A�ƁB";
		mes "�����āA�Ō�ɉ�����̂́A";
		mes "�r�^�^�������Ɓc�c�H";
		next;
		mes "[�������_]";
		mes "�������A���̌�A";
		mes "�u���A�Z���̂Ƃ���ɖ߂�����A";
		mes "�u���A�Z���͂��Ȃ��Ȃ��Ă������āH";
		next;
		mes "[�~���R]";
		mes "�ɂ킩�ɂ͐M�����Ȃ��b���ȁc�c�B";
		next;
		mes "[�������_]";
		mes "���������āc�c�����������炳�B";
		mes strcharinfo(0)+"�����������ł������l���́A";
		mes "���ׂāA�r�^�^�������񂶂�Ȃ����H";
		mes "���߂ɉ�����Ƃ����A�}�ɑ̒��������Ȃ���";
		mes "�u���A�Z�����܂߂āc�c�B";
		next;
		mes "[�~���R]";
		mes "�ȂɁH�ǂ��������ƁH";
		mes "�����Ńu���A�Z�������������̂�";
		mes strcharinfo(0)+"����������A";
		mes "���o�̉\��������񂶂�Ȃ��H";
		next;
		mes "[�������_]";
		mes "�����A���ꂾ��B";
		mes "�������ɍs�������A";
		mes "���l�Ǝ����Ƃ̋��E������ӂ�ɂȂ�";
		mes "�悤�Ȋ��o�����������낤�H";
		mes "����̏��ׂŁA�r�^�^��";
		mes "�l�ԂɌ����Ă��񂶂�Ȃ����H";
		next;
		mes "[�������_]";
		mes "�{���̃u���A�Z����";
		mes "�����Ă�������Ȃ����B";
		mes "�J�t���X�Ƌ��ɂ��鎞�́A";
		mes "�S���a�ɏP���Ȃ������ƁB";
		mes "������A�J�t���X���r�^�^�ł���؋����B";
		next;
		mes "[�~���R]";
		mes "�Ȃ�قǁc�c�H";
		next;
		mes "�]���Ȃ��́A�U���炵���u���A�Z����";
		mes "�@�J�t���X�����͑��̋a�����ƈ���āA";
		mes "�@�����ɏP���Ă��Ȃ��������Ƃ�`�����]";
		next;
		mes "[�������_]";
		mes "�ǂ������o�܂��͂킩��Ȃ����A";
		mes "�u���A�Z�����A�r�^�^�̈�C��";
		mes "���ǂ��Ȃ����̂��������Ǝv���B";
		next;
		mes "[�~���R]";
		mes "���ꂪ�ǂ����āA�����̌̂�";
		mes "�u���A�Z���̎p�����錋�ʂɁH";
		next;
		mes "[�������_]";
		mes "�������̋a�����͏W�c�ňӎ���";
		mes "���L���Ă���񂾂Ǝv���B";
		mes "���l�Ǝ����Ƃ̋��E������ӂ�ɂȂ�";
		mes "�悤�Ȋ��o����������H";
		mes "���ꂪ�A�a�������ӎ������L���邽�߂�";
		mes "�d�g�݂Ȃ񂶂�Ȃ����ȁB";
		next;
		mes "[�~���R]";
		mes "�u���A�Z���̎p�������r�^�^�������A";
		mes "�}�ɍ������o�����̂́H";
		next;
		mes "[�������_]";
		mes "�܂��A���̂��͂킩��Ȃ����A";
		mes "�u���A�Z���ƒ��ǂ��Ȃ���";
		mes "�r�^�^�̃J�t���X�ƁA";
		mes "�l�Ԃł���u���A�Z���̈ӎ���";
		mes "���L���ꂽ�B";
		next;
		mes "[�������_]";
		mes "�X�ɁA��������A�J�t���X�̈ӎ����A";
		mes "���̃r�^�^���������L���Ă����ۂɁA";
		mes "�G���[�����������񂶂�Ȃ����H";
		next;
		mes "[�~���R]";
		mes "���L���ꂽ�ӎ��ɂ���āA";
		mes "�G���[�����������r�^�^�́A";
		mes "���g�ƃJ�t���X�ƃu���A�Z���̋�ʂ�";
		mes "���Ȃ��Ȃ����ƁH";
		next;
		mes "[�������_]";
		mes "�����������ƁB";
		mes strcharinfo(0)+"��";
		mes "�����ɏP���Ă��Ȃ������̂�";
		mes "���̏��ׂ��Ǝv���B";
		next;
		menu "�Ȃ�ق�",-;
		mes "[�������_]";
		mes "�a�͌Q������Љ��������H";
		mes "�����ɁA�l�Ԃł���u���A�Z���̈ӎ���";
		mes "���L���ꂽ���Ƃɂ���āA";
		mes "�X�̋a�����̈ӎ��ɁA";
		mes "�G���[���N���������񂶂�Ȃ����H";
		mes "�����܂ŉ��������ǁB";
		next;
		mes "[�~���R]";
		mes "���[��c�c�B";
		mes "����H�ł��҂Ă�H";
		next;
		mes "[�~���R]";
		mes "�u���A�Z���́A�}���[�ɏP�������";
		mes "�����𕉂��Ă���񂾁B";
		mes "�u���A�Z�����A�a�����ɒ��ԂƂ���";
		mes "�F������Ă���̂Ȃ�A";
		mes "�}���[������U������Ȃ��񂶂�Ȃ����H";
		next;
		mes "[�������_]";
		mes "���̏P���ɖ󂪂������Ƃ�����H";
		mes "���̋a�����͉����[���������Ƃ������āA";
		mes "�J�t���X�c�c�܂�A�r�^�^�ƈꏏ��";
		mes "��������A�u���A�Z���̂��Ƃ�";
		mes "���ɋC�ɂ��Ă��Ȃ������񂾂Ǝv���B";
		mes "�ł��A�}���[�̓_���W�����̎x�z�҂��낤�H";
		next;
		mes "[�~���R]";
		mes "�����B";
		next;
		mes "[�������_]";
		mes "�}���[�́A�a�����̏������B";
		mes "�܂�A�a�����̎Љ�̒�����ۂ�����";
		mes "�����Ă���͂����B���Ƃ�����A";
		mes "�G���[���N�������r�^�^�������A";
		mes "�Q�̂��鑶�݂Ƃ݂Ȃ��񂶂�Ȃ����H";
		mes "�����Ȃ�Γ��R�c�c�B";
		next;
		mes "[�~���R]";
		mes "�G���[�����������̂�";
		mes "�U��������Ă��Ɓc�c�H";
		mes "�����I�I";
		mes "���ꂶ�፡�A�{���Ɋ�Ȃ��̂́c�c�I";
		next;
		delquest 8728;
		setquest 8729;	// state=1
		set IL_ANT_QUE,12;
		mes "[�~���R]";
		mes strcharinfo(0)+"�I�I";
		mes "���͉̂����ɂ����Ȃ����A";
		mes "�����{���Ȃ�u���A�Z���̐g����Ȃ��I";
		mes "�u���A�Z���������ɍs���Ă���Ȃ����H";
		next;
		if(select("��������","�������鎞�Ԃ��K�v�ł�") == 2) {
			mes "[�~���R]";
			mes "�}��v���鎖�ԂȂ񂾁B�}���ł���I";
			close;
		}
		//todo
		mes "[�~���R]";
		mes "���񂾂��I";
		close2;
		warp "ant_d02_i_q.gat", 172, 185;	// from: anthell02_q.gat(172, 185)
		end;
	case 12:
		mes "[�~���R]";
		mes strcharinfo(0)+"�I�I";
		mes "���͉̂����ɂ����Ȃ����A";
		mes "�����{���Ȃ�u���A�Z���̐g����Ȃ��I";
		mes "�u���A�Z���������ɍs���Ă���Ȃ����H";
		next;
		if(select("��������","�������鎞�Ԃ��K�v�ł�") == 2) {
			mes "[�~���R]";
			mes "�}��v���鎖�ԂȂ񂾁B�}���ł���I";
			close;
		}
		mes "[�~���R]";
		mes "���񂾂��I";
		close2;
		warp "ant_d02_i_q.gat", 172, 185;	// from: anthell02_q.gat(172, 185)
		end;
	case 13:
		mes "[�~���R]";
		mes "�c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�B";
		next;
		mes "[�u���A�Z��]";
		mes "���͂������v�B";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : ����Ɛ��C�ɂ��ǂ����c�c�B";	// 6405
		unittalk getnpcid(0,"�������_#1F"),"�������_ : �悩�����c�c";	// 6406
		next;
		mes "[�~���R]";
		mes "�c�c�B";
		mes "����͐����̈悾���A";
		mes "���o���u���A�Z���Ƌ���";
		mes "�`�������Ƃ������A";
		mes "�u���A�Z�������̖`���҂������";
		mes "�����������o�������̂ł͂Ȃ����ȁH";
		next;
		mes "[�~���R]";
		mes "�������ɂ���S�[�i�̂悤�ɁB";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : ���ɓ����Ă͑ς����Ȃ��Ȃ��ďo�Ă���̂��J��Ԃ��Ă�������ǁA�����������������񂾁H";	// 6405
		unittalk getnpcid(0,"�S�[�i#ant2q"),"�S�[�i : �����A�����Ԃ��񂶂�ˁ[�I";	// 6428
		next;
		mes "[�~���R]";
		mes "���Ȃ��Ȃ��������S�z���āA";
		mes "�߂��ė��Ȃ��Ȃ邮�炢��";
		mes "�����e�����c�c�B";
		mes "�N�̂������肳�񂾂�����ȁH";
		next;
		mes "[�u���A�Z��]";
		mes "�v���o���Ȃ��c�c�B";
		next;
		mes "[�~���R]";
		mes "�Ȃ񂾂��āH";
		next;
		mes "[�u���A�Z��]";
		mes "�J�t���X���ǂ�Ȋ炾�����̂��A";
		mes "�v���o���Ȃ���c�c�B";
		next;
		mes "[�S�[�i]";
		mes "���܂Ō������ł���ԏǏ󂪍����ȁB";
		next;
		mes "[�~���R]";
		mes ""+strcharinfo(0)+"�́A�J�t���X�̊�������H";
		next;
		menu "����",-;
		mes "[�~���R]";
		mes "�ǂ������炾�����񂾁H";
		mes "�u���A�Z���̌������ʂ肾�����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�B";
		next;
		mes "�]�u���A�Z�������Ă����J�t���X�́A";
		mes "�@�a�ɂ��������Ȃ��������c�c�]";
		next;
		mes "[�������_]";
		mes "����Ƃ��Ⴄ��H";
		next;
		menu "�u���A�Z���Ƃ�������ł����B",-;
		mes "["+strcharinfo(0)+"]";
		mes "�u���A�Z���Ƃ�������ł����B";
		mes "�{���ɉZ��B";
		mes "�܂�őo�q�݂����ɁB";
		next;
		mes "[�u���A�Z��]";
		mes "�{���H";
		next;
		mes "[�~���R]";
		mes "�����L���͊��S�ɏo�Ă��Ȃ��悤���ȁB";
		mes "�Ƃɂ������������񂾂�A�������́B";
		mes "�����𑱂��Ă����v���ȁH";
		next;
		mes "[�S�[�i]";
		mes "����͐S�z���Ȃ��Ă������B";
		mes "�`���҂̊����c�c�����������I";
		next;
		mes "[�~���R]";
		mes "���������A�����x�񂾕���������c�c�B";
		next;
		mes "[�u���A�Z��]";
		mes "�c�c�B";
		mes ""+strcharinfo(0)+"�B";
		mes "���������Ă���āA���肪�Ƃ��B";
		next;
		mes "[�u���A�Z��]";
		mes "���͂���ȏ�A";
		mes "�������ɂ͓���Ȃ��悤�ɂ��邯��ǁA";
		mes "���񂽂������Ă��ꂽ�J�t���X�̂��Ƃ́A";
		mes "�Y��Ȃ���B";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : ����H�u���A�Z�����s���Ȃ��ƂȂ�ƁA�l�̒����͂ǂ��Ȃ�́H";	// 6405
		unittalk getnpcid(0,"�u���A�Z��#ant2q"),"�u���A�Z�� : �S�[�i�ł��A��čs���΁H";	// 6426
		unittalk getnpcid(0,"�S�[�i#ant2q"),"�S�[�i : �~���R�Ƃ͌����ˁB�s���Ȃ���B";	// 6428
		next;
		delquest 8730;
		setquest 202310;	// state=1
		set IL_ANT_QUE,14;
		getitem 25271,10;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		getexp 1500000000,0,1;
		getexp 0,0,0;
		mes "[�u���A�Z��]";
		mes "�J�t���X���c�c�B";
		mes "�o���Ă��Ă���Ă��肪�Ƃ��B";
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �����A�`���ҁI�Ȃ�N���˗����󂯂Ă����I���������H";	// 6405
		close;
	case 14:
		mes "[�~���R]";
		mes "���������ɍs���Ă݂�H";
		mes "���łɁA�˗����󂯂Ă���Ȃ����ȁH";
		next;
		switch(select("���������ɓ���","�~���R�̎�`��������","���������ɂ���","�b����߂�")) {
		case 1:
			mes "[�~���R]";
			mes "�C��t���čs���Ă�����Ⴂ�B";
			close2;
			warp "ant_d02_i.gat", 172, 185;	// from: anthell02_q.gat(172, 185)
			end;
		case 2:
			if(checkquest(8736)) {
				if(checkquest(8736) & 0x2 == 0) {
					mes "[�~���R]";
					mes "���A�����������̖`���҂�";
					mes "�߂��Ă����Ƃ��ɁA῝�̂悤�Ȋ��o��";
					mes "������܂������ċ����Ă��ꂽ��B";
					mes "�l�Ԃ̍D��S�͂ǂ����悤���Ȃ��ˁB";
					mes "�l�����������ǁc�c�B";
					mes "���Ⴀ�A�܂�������낵���B";
					close;
				}
				delquest 8736;
				mes "[�~���R]";
				mes "���A���傤�ǂ����Ƃ���ɁA���ɂ��ȁH";
				mes "�����X�^�[�ގ�����`���Ăق����񂾁B";
				next;
			}
			if(checkquest(8735)) {
				if(checkquest(8735) & 0x4 == 0) {
					mes "[�~���R]";
					mes "�L���ƔF�����c�߂���";
					mes "�������Ă��܂����ۂ̊ɘa�̂��߂ɁA";
					mes "^0000cd�^�ʖڂȃA���h���A";
					mes "�^�ʖڂȃf�j�[���A�^�ʖڂȃs�G�[��^000000��";
					mes "���ꂼ��5�̂��|���Ă��Ă���B";
					close;
				}
				setquest 8736;	// state=1
				delquest 8735;
				getitem 25271,2;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				getexp 1000000000,0,1;
				getexp 0,0,0;
				mes "[�~���R]";
				mes "�����I";
				mes "����ŏ����͗��������Ē������o���������B";
				mes "����Ɍ������z�΂��������B";
				close;
			}
			mes "[�~���R]";
			mes "^0000cd�^�ʖڂȃA���h���A";
			mes "�^�ʖڂȃf�j�[���A�^�ʖڂȃs�G�[��^000000��";
			mes "���ꂼ��5�̂��|���Ă��Ă��ꂽ��A";
			mes "���������񂾂��ǁB";
			next;
			if(select("�����󂯂�","�Z����") == 2) {
				mes "[�~���R]";
				mes "�������B���Ⴀ�d�����Ȃ��ȁB";
				mes "�����͑��̖`���҂Ɏd����";
				mes "�˗����邵���Ȃ��ȁB";
				close;
			}
			setquest 8735;	// state=1
			mes "[�~���R]";
			mes "���肪�Ƃ��B";
			mes "���ꂶ�Ⴀ�A";
			mes "^0000cd�^�ʖڂȃA���h���A";
			mes "�^�ʖڂȃf�j�[���A�^�ʖڂȃs�G�[��^000000��";
			mes "���ꂼ��5�̂��|���Ă��Ă���B";
			close;
		case 3:
			mes "[�~���R]";
			mes "�C�Â��Ă��邩������Ȃ����ǁA";
			mes "���̒��ł͋L���ƔF�����c�߂���";
			mes "�������Ă��܂��݂����Ȃ񂾁B";
			mes "�N�͂قƂ�Ǖ��C�������悤�����ǁB";
			next;
			mes "[�~���R]";
			mes "�ǂ����A���̌����̈ꕔ�́A";
			mes "�������ɏo�����郂���X�^�[�݂����B";
			mes "������A�����X�^�[�̌̂����炷�ƁA";
			mes "���̌��ۂ������ɘa�����݂����B";
			close;
		case 4:
			mes "[�~���R]";
			mes "�������B�܂��ȁB";
			close;
		}
	}
}
anthell02_q.gat,172,189,5	script	�������_#1F	12,{/* 6406 */
	switch(IL_ANT_QUE) {
	case 0:
		emotion 19,"�������_#1F";	// 6406
		unittalk getnpcid(0,"�������_#1F"),"�������_ : �ԈႢ�Ȃ��{���ɓ�������ȁH",1;	// 6406
		emotion 19,"�~���R#1F";	// 6405
		unittalk getnpcid(0,"�~���R#1F"),"�~���R : �����Ȃ񂾂�B�ڌ��҂����l����B���r�����䂵�������W���[�炵������A�ޏ����������Ƃ����ޏ��̗F�l�ł���͂����Ȃ��B",1;	// 6405
		mes "�]����獞�ݓ������b�����Ă���悤���]";
		close;
	case 1:
		mes "[�������_]";
		mes "���`��c�c�B";
		close;
	case 2:
		mes "[�������_]";
		mes "�}�ɂ��܂Ȃ��ȁc�c�B";
		close;
	case 3:
		mes "[�������_]";
		mes "�����ǂ��Ȃ��Ă�񂾁c�c�B";
		close;
	case 4:
		mes "[�������_]";
		mes "����������������������c�c�B";
		close;
	case 5:
		mes "[�������_]";
		mes "�u���A�Z���������H";
		mes "�����Ă���H�悩�����c�c�B";
		mes "�ŁA�ǂ����ĘA��Ă��Ȃ������񂾁H";
		close;
	case 6:
	case 7:
	case 8:
	case 9:
		mes "[�������_]";
		mes "���������s�����炢���񂾂��ǁc�c�B";
		mes "�u���A�Z���𗊂ށB";
		close;
	case 10://
	case 11:
		mes "[�������_]";
		mes "������A�������I";
		mes "�ǂ�����o�Ă����񂾂�H�I";
		close;
	case 12:
		mes "[�������_]";
		mes "���񂾂��A"+strcharinfo(0)+"�c�c�B";
		close;
	case 13:
		mes "[�������_]";
		mes "�c�c�B";
		close;
	case 14:
		mes "[�������_]";
		mes "�����̊Ԃ́A���̌����𑱂��邵���Ȃ��ȁB";
		mes "�d�����Ȃ��B���ɂȂ�d���͌�񂵂��B";
		close;
	}
OnInit:
	// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
	setnpcdisplay "�������_#1F",12,0,0,9,4,0,1501,0,0,0;	// 6406
	end;
}
anthell02_q.gat,170,185,0	script	#il_ant002q	139,14,14,{/* 6425 */
	if(IL_ANT_QUE == 11 || IL_ANT_QUE == 12)
		cloakoffnpc "�t���I#ant2q";	// 6427
	else if(IL_ANT_QUE == 13 || IL_ANT_QUE == 14) {
		cloakoffnpc "�t���I#ant2q";	// 6427
		cloakoffnpc "�u���A�Z��#ant2q";	// 6426
	}
}
anthell02_q.gat,167,186,6	script	�u���A�Z��#ant2q	4056,{/* 6426 (cloaking)*/
	mes "[�u���A�Z��]";
	mes "�c�c���肪�Ƃ��B";
	close;
OnInit:
	setnpcdisplay "�u���A�Z��#ant2q",4056,0,1,13,7,0,1523,0,0,0;	// 6426
	end;
}
anthell02_q.gat,174,177,5	script	�t���I#ant2q	4070,{/* 6427 (cloaking)*/
	mes "[�t���I]";
	mes "�b��������ȁc�c�B";
	mes "�w�����@���񂶂�Ȃ��c�c�B";
	mes "������ƁA�������ɍs���Ă���c�c�B";
	close;
OnInit:
	setnpcdisplay "�t���I#ant2q",4070,1,0,12,3,65,0,0,0,0;	// 6427
	end;
}
anthell02_q.gat,177,181,3	script	�S�[�i#ant2q	4068,{/* 6428 */
	if(IL_ANT_QUE == 14) {
		mes "[�S�[�i]";
		mes "�͂��c�c�B";
		mes "���낢��Ɩ��͂��邪�A�~���R�̓z�A";
		mes "�x���������͊m���Ȃ񂾂�B";
		mes "�˗���Ƃ��ẮA������Ȃ񂾁B";
		close;
	}
	if(IL_ANT_QUE == 13) {
		mes "[�S�[�i]";
		mes "�厖�ɂȂ�Ƃ��낾�����ȁc�c�B";
		close;
	}
	if(IL_ANT_QUE == 8 || IL_ANT_QUE == 11) {
		mes "[�S�[�i]";
		mes "�{���ɂ������͐��C�œ����悤��";
		mes "�ꏊ����Ȃ���c�c�B";
		mes "���񂽂͂悭����Ȃɏo����ł���ȁc�c�B";
		close;
	}
	if(IL_ANT_QUE >= 7) {
		mes "[�S�[�i]";
		mes "���������c�c�B";
		close;
	}
	if(IL_ANT_QUE >= 6) {
		mes "[�S�[�i]";
		mes "��́A���������ŉ����N���Ă�񂾁H";
		close;
	}
	if(IL_ANT_QUE >= 5) {
		mes "�]���X�Q��������������B";
		mes "�@�b�������Ă͂����Ȃ����͋C���]";
		close;
	}
	if(IL_ANT_QUE >= 4) {
		mes "�]�����n�ʂɂ��āA";
		mes "�@�ǂɌ������Ă������ɂȂ��Ă���B";
		mes "�@�b�������Ă͂����Ȃ����͋C���]";
		close;
	}
	mes "[�S�[�i]";
	mes "�͂��c�c�B";
	mes "���낢��Ɩ��͂��邪�A�~���R�̓z�A";
	mes "�x���������͊m���Ȃ񂾂�B";
	mes "�˗���Ƃ��ẮA������Ȃ񂾁B";
	close;
OnInit:
	// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
	setnpcdisplay "�S�[�i#ant2q",4068,1,0,13,5,0,0,0,0,0;	// 6428
	end;
}
anthell02_q.gat,166,178,0	script	ah02_q_ah02	45,1,1,{/* 6437 */
	mes "�]���ʂ̋a�ގ��ɖ߂�܂����H�]";
	next;
	if(select("�͂�","������") == 2) {
		mes "�]���̏�Ɏc�����]";
		close;
	}
	mes "�]���ʂ̋a�ގ��ɖ߂낤�]";
	close2;
	warp "anthell02.gat",166,178;
	end;
}
anthell02_q.gat,161,173,4	script	#stop_ah_1	10248,{/* 6438 */
	159,172,163,183
	164,172,170,174
}
anthell02_q.gat,165,173,4	script	#stop_ah_2	10248,{/* 6439 */}
anthell02_q.gat,169,173,4	script	#stop_ah_3	10248,{/* 6440 */}
anthell02_q.gat,161,175,4	script	#stop_ah_4	10248,{/* 6441 */}
anthell02_q.gat,161,180,4	script	#stop_ah_5	10248,{/* 6442 */}
anthell02_q.gat,161,183,4	script	#stop_ah_5	10248,{/* 6443 */}

ant_d02_i_q.gat,170,185,0	script	switch#part0	139,14,14,{/* 6407 */
	if(IL_ANT_QUE == 4) {
		mes "�]�ǂ�����ău���A�Z����T�������c�c�H�]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]�������u���A�Z����T�����]";
			close;
		}
		mes "�]�}���Ńu���A�Z����T�����]";
		close2;
		warp "ant_d02_i_q.gat", 48, 258;	// from: ant_d02_i_q.gat(169, 172)
		end;
	}
	if(IL_ANT_QUE == 6) {
		mes "�]�u���A�Z���̂��ƂɌ��������]";
		next;
		if(select("�}���Ō�����","������������") == 2) {
			mes "�]�������u���A�Z���̂��ƂɌ��������]";
			close;
		}
		mes "�]�}���Ńu���A�Z���̂��ƂɌ��������]";
		close2;
		warp "ant_d02_i_q.gat", 48, 258;	// from: ant_d02_i_q.gat(163, 173)
		end;
	}
	if(IL_ANT_QUE == 12) {
		mes "�]�u���A�Z����T�����]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]��������u���A�Z����T�����]";
			close;
		}
		mes "�]�}���Ńu���A�Z����T�����]";
		close2;
		warp "ant_d02_i_q.gat", 135, 71;	// from: ant_d02_i_q.gat(172, 185)
		end;
	}
}
ant_d02_i_q.gat,175,186,3	script	�t����#iltwq	4058,{/* 6429 */
	mes "[�t����]";
	mes "���_���������Ă邩�̂悤���B";
	mes "�ł��C�̂�������B";
	mes "���͐l�ŊԈႢ�Ȃ��B";
	close;
OnInit:
	setnpcdisplay "�t����#iltwq",4058,1,1,11,6,0,0,0,0,0;	// 6429
	end;
}
ant_d02_i_q.gat,177,181,5	script	�S�[�i#iltwq	4068,{/* 6430 */
	switch(rand(3)) {
	case 0:
		mes "[�S�[�i]";
		mes "���̖��̓S�[�i�A�����N�̋�V���l�B";
		mes "�Ƃ���Łc�c�B�����N�͂ǂ����c�c�H";
		close;
	case 1:
		mes "[�S�[�i]";
		mes "���������c�c�B";
		mes "�Q�t�F���c�c�ɒʂ��铹�͂ǂ����H";
		mes "�Ⴄ�c�c�v�����e���������c�c�H";
		mes "�ǂ����������ȁc�c�H";
		mes "�ŋߍs�����ꏊ�́c�c�B";
		mes "�����͂ǂ����c�c�H";
		close;
	case 2:
		mes "[�S�[�i]";
		mes "�����͉��������������B";
		mes "�c�c����A���������Ȃ��̂��H";
		mes "�N�͂ǂ��H���������Ǝv���c�c�H";
		mes "�����A�ƂɋA�肽���c�c�B";
		mes "�Ƃ͂ǂ����c�c�H";
		close;
	}
OnInit:
	setnpcdisplay "�S�[�i#iltwq",4068,1,0,13,5,0,0,0,0,0;	// 6430
	end;
}
ant_d02_i_q.gat,171,179,3	script	�~�b�N#iltwq	4055,{/* 6431 */
	switch(rand(3)) {
	case 0:
		mes "[�~�b�N]";
		mes "���Ȃ��́c�c�l�ԂȂ̂��H";
		close;
	case 1:
		mes "[�~�b�N]";
		mes "�킽���́c�c�l�ԂȂ̂��H";
		mes "�a����Ȃ��̂��H";
		mes "�Ⴄ���H";
		mes "�l�ԂȂ̂��c�c�H";
		close;
	case 2:
		mes "[�~�b�N]";
		mes "���������ȁB";
		mes "���ł͎����͊ԈႢ�Ȃ��l�Ԃ���";
		mes "�������Ă���̂ɁA";
		mes "������ʂ�߂���a������ƁA";
		mes "�킽�����a����Ȃ����Ǝv���Ă��܂��B";
		mes "���������ǂ��Ȃ��Ă�񂾁c�c�H";
		close;
	}
OnInit:
	setnpcdisplay "�~�b�N#iltwq",4055,0,0,28,2,0,0,0,0,0;	// 6431
	end;
}
ant_d02_i_q.gat,44,258,0	script	switch#part1	139,14,14,{/* 6408 */
	cloakonnpc "�u���A�Z��#part1";	// 6409
	if(IL_ANT_QUE == 4 || IL_ANT_QUE == 6 || IL_ANT_QUE == 7 || IL_ANT_QUE == 8 || IL_ANT_QUE == 9) {
		cloakoffnpc "�u���A�Z��#part1";	// 6409
	}
	if(IL_ANT_QUE == 10) {
		delquest 8727;
		setquest 8728;	// state=1
		set IL_ANT_QUE,11;
		mes "�]�u���A�Z�������Ȃ��Ȃ��Ă���c�c�B";
		mes "�@�ʂ����Ă��̃u���A�Z����";
		mes "�@�{���������̂��낤���H�]";
		next;
		mes "�]���߂́A�ƂĂ����������Ă���Ƃ�";
		mes "�@�v���Ȃ��l�q�������c�c�B";
		mes "�@����Ȃ̂ɁA��b�̓r���ŁA";
		mes "�@�}�ɑ������������̂悤��";
		mes "�@���̏�ɂւ��荞�񂾁B";
		mes "�@�������A���ꂪ���͂��Ȃ��Ȃ��Ă���]";
		next;
		mes "�]����ɁA�J�t���X�Ƃ����l����";
		mes "�@�{���ɂ���̂��낤���H";
		mes "�@�����瑤�ŏo������҂́A";
		mes "�@���Ȃ��Ƃ��A�l�Ԃł͂Ȃ��悤�������]";
		next;
		mes "�]��x�A�~���R�̂Ƃ���ɖ߂���";
		mes "�@�b�𐮗����悤�]";
		close2;
		warp "anthell02_q.gat", 172, 185;	// from: ant_d02_i_q.gat(48, 258)
		end;
	}
}
ant_d02_i_q.gat,44,258,6	script	�u���A�Z��#part1	4056,{/* 6409 (cloaking)*/
	if(IL_ANT_QUE == 4) {
		mes "[���䂵�Ă��Ȃ������W���[]";
		mes "���A����ɂ��́B";
		mes "���䂵�������W���[�����Ȃ����������āH";
		next;
		mes "[���䂵�Ă��Ȃ������W���[]";
		mes "���񂽂��J�t���X��T���ɂ����́H";
		next;
		if(select("�u���A�Z���Ƃ����l��T���Ă��܂�","������") == 2) {
			mes "[���䂵�Ă��Ȃ������W���[]";
			mes "�����H";
			mes "�J�t���X�͂��������ǂ��ɂ���񂾂�c�c�B";
			mes "���Ԗ�ɂ������Ȃ����B";
			close;
		}
		mes "[���䂵�Ă��Ȃ������W���[]";
		mes "���H";
		next;
		mes "[���䂵�Ă��Ȃ������W���[]";
		mes "���͉���Ȃǂ��Ă��Ȃ���I";
		mes "�N���u���A�Z���������������";
		mes "�����Ă��́H";
		next;
		menu "�~���R�ƃ������_",-;
		mes "�]�~���R�ƃ������_����A";
		mes "�@����������܂܈�l��";
		mes "�@�����ɓ����Ă��܂���";
		mes "�@�u���A�Z����A��Ă���悤��";
		mes "�@���܂ꂽ���Ƃ���������]";
		next;
		mes "[�u���A�Z��]";
		mes "�����u���A�Z���ŊԈႢ�Ȃ�����ǁc�c�B";
		mes "����������c�c�H";
		mes "���c�c�H";
		next;
		mes "�]�R��t���Ă�悤�ɂ͌����Ȃ��B";
		mes "�@�����ڂ͕��ʂ����ǁc�c�܂������ꂪ";
		mes "�@�b�ɕ����Ă������ۂ�";
		mes "�@�e���Ȃ̂��c�c�H�]";
		next;
		mes "[�u���A�Z��]";
		mes "���������ȁB";
		mes "�����̒ʂ莄�͑��v������B";
		mes "�����ŕ����ꂽ�F�l��T���Ă���́B";
		mes "���̓J�t���X�Ƃ����񂾂��ǁc�c";
		mes "�炪���ɂ�������Ȃ́B";
		next;
		mes "[�u���A�Z��]";
		mes "������T���܂ł́A�߂�Ȃ��B";
		mes "�~���R�ɂ͂����`���āB���Ⴀ�A�܂��B";
		delquest 8721;
		setquest 8722;	// state=1
		set IL_ANT_QUE,5;
		cloakonnpc "�u���A�Z��#part1";	// 6409
		mes "�]�u���A�Z���͍s���Ă��܂���";
		mes "�@��x�A�~���R�̂��Ƃɖ߂낤�]";
		close2;
		warp "anthell02_q.gat", 170, 185;	// from: ant_d02_i_q.gat(49, 258)
		end;
	}
	if(IL_ANT_QUE == 6) {
		mes "[�u���A�Z��]";
		mes "���A�܂��������ˁB";
		mes "�~���R�Ƃ͘b���Ă݂��H";
		mes "��������ꂽ�H";
		next;
		menu "���Ȃ�����`���āA�Ɓc�c",-;
		mes "[�u���A�Z��]";
		mes "�ւ��`�A�~���R�����������������Ă��Ƃ́A";
		mes "���񂽂��Č��\�����݂����ˁB�悩�����B";
		mes "�����������̂��~���R��������A";
		mes "�����𒲍����ɂ���ɂ͎�߂��āA";
		mes "����Z��������ˁB";
		next;
		mes "[�u���A�Z��]";
		mes "����͂���Ƃ��āB";
		mes "���̎��͋}���ł�́I";
		mes "�J�t���X����@�Ɋׂ��Ă�̂�B";
		next;
		mes "[�u���A�Z��]";
		mes "���񂽂��b�𕷂��Ă���ˁH";
		mes "����ŁA������`���Ă����悤��";
		mes "�~���R�ɗ��܂ꂽ��ł��傤�H";
		next;
		menu "�����ł�",-;
		mes "[�u���A�Z��]";
		mes "�������B";
		mes "���ꂶ��J�t���X��T���ɍs���܂��傤�I";
		next;
		mes "�]�u���A�Z�������Ă��āA";
		mes "�@���̂��͂킩��Ȃ����A";
		mes "�@�ӂƁA��a�����������c�c�]";
		next;
		menu "�c�c",-;
		mes "[�u���A�Z��]";
		mes "�ǂ������́H";
		next;
		mes "�]�ǂ����A�u���A�Z���̌���";
		mes "�@�J�t���X�Ƃ����l�����A";
		mes "�@�u���A�Z�����g���w���Ă���C������B";
		mes "�@�J�t���X�͖{���ɂ���̂��낤���H�]";
		next;
		menu "�J�t���X�Ƃ����l���͖{���ɂ����̂ł����c�c�H",-;
		mes "[�u���A�Z��]";
		mes "�J�t���X���{���ɂ����̂����āH";
		mes "���񂽂��������Ƃ������񂾁H�{����I";
		mes "���x�������ŉ���āA�ꏏ�ɋa���c�c�B";
		mes "�c��������ȁH";
		next;
		menu "�H",-;
		mes "[�u���A�Z��]";
		mes "�Ƃɂ����A�����ŉ�����̂�B";
		mes "���݂��Ɏ����ɂ�������Ȃ��Ƃ�";
		mes "�s�v�c�����Ă������B";
		mes "�ł��A�������O�Ȃ񂾂��ǁA";
		mes "�J�t���X�ƈꏏ�ɂ��鎞�ɁA";
		mes "�����Ȃ�傫�ȃ}���[������āc�c�B";
		next;
		mes "[�u���A�Z��]";
		mes "����������ƍ���������c�c�B";
		mes "����c�c�H";
		mes "���̎��A�N������������񂾂�H";
		mes "���������c�c�H";
		next;
		mes "�]�}�ɁA�u���A�Z���̊�F�������Ȃ����B";
		mes "�@�~���R���������Ă����悤�ɁA";
		mes "�@�܂�ő��������Ă���悤���B";
		mes "�@��͂薳�������Ă����̂��낤���H";
		mes "�@����ɂ��ẮA��a����������]";
		next;
		menu "��͂��������Ă����̂ł���",-;
		mes "[�u���A�Z��]";
		mes "�Ⴄ�I���͉��䂵�Ă��Ȃ��I";
		mes "���䂵���͎̂��ł͂Ȃ��J�t���X��c�c�I";
		mes "�J�t���X�������c�c�҂��Ă��邩��c�c�B";
		mes "�T���Ȃ���c�c�B";
		mes "�J�t���X�c�c�B";
		next;
		mes "�]�u���A�Z���͂ւ��荞��ł��܂����]";
		next;
		menu "��x�O�ɏo�܂��傤",-;
		mes "[�u���A�Z��]";
		mes "�_����c�c�B";
		mes "���́c�c�~���R�ƈꏏ�ɂ������ȊO�ɂ́A";
		mes "�����Łc�c�a�ɏo���킵�����Ƃ́c�c";
		mes "��x���Ȃ���c�c�B";
		mes "������c�c���v�c�c�B";
		next;
		mes "[�u���A�Z��]";
		mes "�J�t���X�Ƃ������́c�c";
		mes "�Ō�Ƀ}���[�����ꂽ���������āA";
		mes "��x���a�ɉ���ĂȂ��̂�c�c�B";
		mes "����ŁA�ꏏ�Ɏ����c�c�H";
		mes "����c�c�H";
		mes "�J�t���X�́c�c���Ɖ��������񂾂�H";
		next;
		mes "�]�u���A�Z���̘b���Ă��邱�Ƃ�";
		mes "�@�x���ŗ�ɂȂ��Ă����B";
		mes "�@���Ȃ荬�����Ă���悤���]";
		next;
		mes "[�u���A�Z��]";
		mes "�Ƃɂ����A���̂��Ƃ͂�������A";
		mes "�F�l�̃J�t���X�������āc�c�B";
		mes "��������Ȃ���΁A";
		mes "��΂ɊO�ɂ͖߂�Ȃ��c�c��c�c�B";
		next;
		delquest 8723;
		setquest 8724;	// state=1
		set IL_ANT_QUE,7;
		mes "�]�������Ă���u���A�Z���́A";
		mes "�@�J�t���X�������Ȃ����Ƃɂ�";
		mes "�@�������Ƃ𕷂������ɂȂ��B";
		mes "�@�S�z�����A�J�t���X��T�����]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]��������T�����]";
			close;
		}
		//todo
		mes "�]�}���ŒT�����]";
		close2;
		warp "ant_d02_i_q.gat", 82, 189;	// from: ant_d02_i_q.gat(52, 250)
		end;
	}
	if(IL_ANT_QUE == 7) {
		mes "[�u���A�Z��]";
		mes "�Ƃɂ����A���̂��Ƃ͂�������A";
		mes "�F�l�̃J�t���X�������āc�c�B";
		mes "��������Ȃ���΁A";
		mes "��΂ɊO�ɂ͖߂�Ȃ��c�c��c�c�B";
		next;
		mes "�]�������Ă���u���A�Z���́A";
		mes "�@�J�t���X�������Ȃ����Ƃɂ�";
		mes "�@�������Ƃ𕷂������ɂȂ��B";
		mes "�@�S�z�����A�J�t���X��T�����]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]��������T�����]";
			close;
		}
		mes "�]�}���ŒT�����]";
		close2;
		warp "ant_d02_i_q.gat", 82, 189;	// from: ant_d02_i_q.gat(52, 250)
		end;
	}
	if(IL_ANT_QUE == 8 || IL_ANT_QUE == 9) {
		mes "�]�������Ă���u���A�Z���́A";
		mes "�@�J�t���X�������Ȃ����Ƃɂ�";
		mes "�@�������Ƃ𕷂������ɂȂ��B";
		mes "�@�S�z�����A�J�t���X��T�����]";
		close;
	}
	end;
OnInit:
	cloakonnpc;
	setnpcdisplay "�u���A�Z��#part1",4056,0,1,13,7,0,1523,0,0,0;	// 6409
	end;
}

ant_d02_i_q.gat,86,189,0	script	switch#part2	139,14,14,{/* 6410 */
	if(IL_ANT_QUE == 7 || IL_ANT_QUE == 8 || IL_ANT_QUE == 9)
		cloakoffnpc "�J�t���X�H#part2";	// 6412
}
ant_d02_i_q.gat,86,189,2	script	���G��#p2_vitata1	21394,{/* 6411 (cloaking)*/}
ant_d02_i_q.gat,86,189,2	script	�J�t���X�H#part2	4056,{/* 6412 (cloaking)*/
	if(IL_ANT_QUE == 7) {
		mes "[�J�t���X�H]";
		mes "�ȂɁc�c�H���O���ǂ��������āH";
		mes "�܂��́A�N���疼���ׂ�����Ȃ��H";
		next;
		menu strcharinfo(0),-;
		mes "[�J�t���X�H]";
		mes "�ւ��A"+strcharinfo(0)+"���Ă����񂾁B";
		mes "���̓��G�����B";
		next;
		mes "[���G��]";
		mes "������ƁA���̕ӂ��";
		mes "�u���A�Z���Ƃ����l�����|���Ȃ������H";
		next;
		mes "�]�u���A�Z������J�t���X��������悤��";
		mes "�@���܂ꂽ���Ƃ�b�����]";
		next;
		mes "[���G��]";
		mes "�J�t���X�c�c�H";
		next;
		mes "[���G��]";
		mes "�c�c�B";
		next;
		menu "���G���c�c�H",-;
		mes "�]�����҂��Ă݂����ǁA";
		mes "�@���G���͉��̔������Ȃ������]";
		next;
		menu "���G���c�c�H",-;
		mes "[���G��]";
		mes "����͎��̖��O����Ȃ��C������c�c�B";
		next;
		mes "[���G��]";
		mes "�����ǁA�J�t���X�ł��Ȃ��C������c�c�B";
		mes "�u���A�Z���ɉ�Ε�����C������c�c�B";
		mes "�u���A�Z���͂ǂ��c�c�H";
		next;
		mes "[���G��]";
		mes "�u���A�Z���c�c�B";
		next;
		delquest 8724;
		setquest 8725;	// state=1
		set IL_ANT_QUE,8;
		misceffect 222,"�J�t���X�H#part2";	// 6412
		//todo
		set '@dummy,sleep2(3000);
		cloakonnpc "�J�t���X�H#part2";	// 6412
		mes "�]���G�����}�ɍ��������������Ǝv���΁A";
		mes "�@�ڂ̑O��������Ă��܂����B";
		mes "�@���e�������̂��낤���c�c�H";
		mes "�@�{���̃J�t���X�́A";
		mes "�@�ǂ��ɂ���񂾂낤�c�c�H�]";
		next;
		mes "�]���̏ꏊ���T���Ă݂悤�]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]��������T�����]";
			close;
		}
		//todo
		mes "�]�}���ŒT�����]";
		close2;
		warp "ant_d02_i_q.gat", 255, 39;	// from: ant_d02_i_q.ga(78, 189)
		end;
	}
	if(IL_ANT_QUE == 8) {
		misceffect 222,"�J�t���X�H#part2";	// 6412
		set '@dummy,sleep2(3000);
		cloakonnpc "�J�t���X�H#part2";	// 6412
		mes "�]���G�����}�ɍ��������������Ǝv���΁A";
		mes "�@�ڂ̑O��������Ă��܂����B";
		mes "�@���e�������̂��낤���c�c�H";
		mes "�@�{���̃J�t���X�́A";
		mes "�@�ǂ��ɂ���񂾂낤�c�c�H�]";
		next;
		mes "�]���̏ꏊ���T���Ă݂悤�]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]��������T�����]";
			close;
		}
		mes "�]�}���ŒT�����]";
		close2;
		warp "ant_d02_i_q.gat", 255, 39;	// from: ant_d02_i_q.ga(78, 189)
		end;
	}
	end;
OnInit:
	setnpcdisplay "�J�t���X�H#part2",4056,0,1,13,7,0,1523,0,0,0;	// 6412
	end;
}
ant_d02_i_q.gat,258,42,0	script	switch#part3	139,14,14,{/* 6413 */
	if(IL_ANT_QUE == 8 || IL_ANT_QUE == 9)
		cloakoffnpc "�J�t���X�H#part3";	// 6415
}
ant_d02_i_q.gat,258,42,3	script	�J�t���X�H#p3_vitata1	21394,{/* 6414 (cloaking)*/}
ant_d02_i_q.gat,258,42,3	script	�J�t���X�H#part3	4056,{/* 6415 (cloaking)*/
	if(IL_ANT_QUE == 8) {
		mes "[�J�t���X�H]";
		mes "�ȂɁc�c�H���O���ǂ��������āH";
		mes "�܂��́A�N�������ׂ��Ȃ񂶂�Ȃ����H";
		next;
		menu ""+strcharinfo(0)+"",-;
		mes "[�J�t���X�H]";
		mes "�Ӂ`��B"+strcharinfo(0)+"�B";
		mes "���̓J�t���X���B";
		next;
		mes "[�J�t���X�H]";
		mes "���̕ӂŃu���A�Z���Ƃ��������W���[��";
		mes "���|���Ȃ��������H";
		next;
		mes "�]�u���A�Z�����J�t���X��T���Ă������Ƃ�";
		mes "�@�`�����]";
		next;
		mes "[�J�t���X�H]";
		mes "�{�����I�悩�����I�ǂ��ɂ���񂾁H";
		mes "�u���A�Z����T�����߂ɁA";
		mes "�����ɂ܂��������񂾂��ǁc�c";
		mes "�}���[�ɏP�����󂯂�";
		mes "�u���A�Z�����A��Ă����ꂽ�񂾁B";
		next;
		mes "�]�����Ă����b�Ɗ��ݍ���Ȃ��B";
		mes "�@�ǂ��ɂ��������c�c�]";
		next;
		mes "[�J�t���X�H]";
		mes "�ǂ������H�u���A�Z���͂ǂ��ɂ���񂾁H";
		next;
		mes "�]�~���R���畷�����b�ł́A";
		mes "�@�~���R�͈�x���J�t���X��";
		mes "�@��������Ƃ��Ȃ��͂����c�c�]";
		next;
		menu "�~���R�Ƃ����l���������ł����H",-;
		mes "[�J�t���X�H]";
		mes "�ǂ������H�}�Ɂc�c�B";
		mes "�������A�m���Ă���B���̌ق��傾�B";
		mes "�����\����Ȃ����Ƃ����Ă��܂������B";
		next;
		mes "�]��͂�A���̐l����";
		mes "�@�J�t���X�ł͂Ȃ��悤���]";
		next;
		menu "���Ȃ��͒N�H",-;
		mes "[�J�t���X�H]";
		mes "���̘b���H";
		next;
		mes "�]�b�̐H���Ⴂ���w�E������A";
		mes "�@�J�t���X�͖ق荞��ł��܂����B";
		mes "�@���΂炭�҂��Ă݂Ă��������Ȃ��c�c�]";
		next;
		menu "�J�t���X�c�c�H",-;
		mes "[�J�t���X�H]";
		mes "���́c�c�J�t���X�Ȃ񂾂낤���c�c�H";
		mes "�u���A�Z���ɉ�Ε�����C������B";
		mes "�u���A�Z���͂ǂ��ɂ���c�c�H";
		mes "�u���A�Z���c�c�B";
		next;
		delquest 8725;
		setquest 8726;	// state=1
		set IL_ANT_QUE,9;
		misceffect 222,"�J�t���X�H#part3";	// 6415
		//todo
		set '@dummy,sleep2(3000);
		cloakonnpc "�J�t���X�H#part3";	// 6415
		mes "�]�������������J�t���X�́A";
		mes "�@�ڂ̑O��������Ă��܂����B";
		mes "�@���e�������̂��낤���c�c�H";
		mes "�@�{���̃J�t���X�́A";
		mes "�@�ǂ��ɂ���񂾂낤�c�c�H�]";
		next;
		mes "�]���̏ꏊ���T���Ă݂悤�]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]��������T�����]";
			close;
		}
		//todo
		mes "�]�}���ŒT�����]";
		close2;
		warp "ant_d02_i_q.gat", 262, 151;	// from: ant_d02_i_q.gat(252, 51)
		end;
	}
	if(IL_ANT_QUE == 9) {
		misceffect 222,"�J�t���X�H#part3";	// 6415
		set '@dummy,sleep2(3000);
		cloakonnpc "�J�t���X�H#part3";	// 6415
		mes "�]�������������J�t���X�́A";
		mes "�@�ڂ̑O��������Ă��܂����B";
		mes "�@���e�������̂��낤���c�c�H";
		mes "�@�{���̃J�t���X�́A";
		mes "�@�ǂ��ɂ���񂾂낤�c�c�H�]";
		next;
		mes "�]���̏ꏊ���T���Ă݂悤�]";
		next;
		if(select("�}���ŒT��","��������T��") == 2) {
			mes "�]��������T�����]";
			close;
		}
		mes "�]�}���ŒT�����]";
		close2;
		warp "ant_d02_i_q.gat", 262, 151;	// from: ant_d02_i_q.gat(252, 51)
		end;
	}
	end;
OnInit:
	setnpcdisplay "�J�t���X�H#part3",4056,0,1,13,7,0,1523,0,0,0;	// 6415
	end;
}
ant_d02_i_q.gat,259,147,0	script	switch#part4	139,14,14,{/* 6416 */
	if(IL_ANT_QUE == 9)
		cloakoffnpc "�J�t���X�H#part4";	// 6418
}
ant_d02_i_q.gat,259,147,7	script	�J�t���X�H#p4_vitata1	21394,{/* 6417 (cloaking)*/}
ant_d02_i_q.gat,259,147,7	script	�J�t���X�H#part4	24,{/* 6418 (cloaking)*/
	if(IL_ANT_QUE == 9) {
		mes "[�J�t���X�H]";
		mes "�ȂɁc�c�H���O���ǂ��������āc�c�H";
		mes "�܂��͌N���疼���ׂ�����Ȃ����ȁH";
		mes "�ւ��A"+strcharinfo(0)+"�B";
		mes "���̓J�t���X�B";
		next;
		mes "�]�u���A�Z�����T���Ă����J�t���X�́A";
		mes "�@�K���X�����K�[�ł͂Ȃ��A";
		mes "�@�����W���[���ƕ����Ă��邪�c�c�]";
		next;
		mes "[�J�t���X�H]";
		mes "�����Ȃ�A�l�ɖ��O��q�˂�Ȃ�āA";
		mes "���Ȃ������x�������Ă����ˁH";
		mes "��́A���̗p�H";
		next;
		mes "�]�u���A�Z������A�J�t���X��T���悤��";
		mes "�@���܂ꂽ���Ƃ�`�����]";
		next;
		mes "[�J�t���X�H]";
		mes "���c�c�H�u���A�Z���ɗ��܂ꂽ�́c�c�H";
		mes "�u���A�Z���͖����H";
		mes "�����u���A�Z���ƈꏏ�ɂ����񂾂���ǁA";
		mes "�u���A�Z�����}���[��";
		mes "�A��Ă�����Ă��܂��āA";
		mes "�T���Ă����̂�I";
		next;
		menu "���Ȃ��͒N�H",-;
		mes "[�J�t���X�H]";
		mes "���H���������Ă�́c�c�H";
		mes "���͖`���҂̃J�t���X��B";
		mes "������������������Ȃ��B";
		next;
		mes "�]�J�t���X�̘b���A";
		mes "�@�u���A�Z�����畷�������e�ƈႤ���Ƃ�";
		mes "�@�`�����]";
		next;
		mes "[�J�t���X�H]";
		mes "�c�c";
		next;
		mes "�]���΂炭�Ԏ���҂��Ă݂����A";
		mes "�@�J�t���X�̔����͂Ȃ��]";
		next;
		menu "�J�t���X�H",-;
		mes "[�J�t���X�H]";
		mes "���́c�c�J�t���X�Ȃ̂��ȁc�c�H";
		next;
		mes "[�J�t���X�H]";
		mes "�u���A�Z���ɉ�Ε�����C������c�c�B";
		mes "�u���A�Z���͂ǂ��ɂ���́c�c�H";
		next;
		mes "�]�J�t���X�͋����͂Řr�����肵�߂Ă����B";
		mes "�@���̒ɂ݂́A";
		mes "�@�v�킸�����o��قǂ������]";
		next;
		mes "[�J�t���X�H]";
		mes "�u���A�Z���̏��ɘA��Ă����Ă���I";
		next;
		mes "�]���܂�̌����ɐg�̊댯�������āA";
		mes "�@�v�킸�r��U��قǂ����]";
		next;
		mes "[�J�t���X�H]";
		mes "���́c�c�N���c�c�u���A�Z���c�c�H";
		mes "���͒N�Ȃ񂾁c�c�H";
		mes "�c�c���́c�c���́c�c�I";
		mes "�����c�c���Ǝv�����̂Ɂc�c�B";
		next;
		delquest 8726;
		setquest 8727;	// state=1
		set IL_ANT_QUE,10;
		misceffect 222,"�J�t���X�H#part4";	// 6418
		//todo
		cloakonnpc "�J�t���X�H#part4";	// 6418
		cloakonnpc "�J�t���X�H#part4";	// 6418
		cloakoffnpc "�J�t���X�H#p4_vitata1";	// 6417
		unittalk getnpcid(0,"�J�t���X�H#p4_vitata1"),"�J�t���X�H : �c�c�I�I";	// 6417
		misceffect 222,"�J�t���X�H#p4_vitata1";	// 6417
		cloakonnpc "�J�t���X�H#p4_vitata1";	// 6417
		cloakonnpc "�u���A�Z��#part1";	// 6409
		mes "�]�u���A�Z���Ƃ�������Ȑl�������́A";
		mes "�@���Ȃ��Ƃ��l�Ԃł͂Ȃ��������B";
		mes "�@��x�A�u���A�Z���̏��ɖ߂낤�]";
		close2;
		warp "ant_d02_i_q.gat", 48, 258;	// from: ant_d02_i_q.gat(261, 150)
		end;
	}
	end;
OnInit:
	setnpcdisplay "�J�t���X�H#part4",24,0,3,13,7,0,1523,0,0,0;	// 6418
}
ant_d02_i_q.gat,130,73,0	script	switch#part8	139,14,14,{/* 6419 */
	if(IL_ANT_QUE == 12) {
		cloakoffnpc "�u���A�Z��#part8";	// 6424
		cloakoffnpc "�J�t���X#p8_vitata2";	// 6421
	}
}
ant_d02_i_q.gat,130,73,2	script	�J�t���X#p8_vitata1	21394,{/* 6420 (cloaking)*/}
ant_d02_i_q.gat,125,73,6	script	�J�t���X#p8_vitata2	21394,{/* 6421 (cloaking)*/
	if(IL_ANT_QUE == 12)
		unittalk getnpcid(0,"�J�t���X#p8_vitata2"),"�J�t���X : �c�c";	// 6421
}
ant_d02_i_q.gat,128,73,6	script	�Â��ȃ}���[#p8_maya1	21395,{/* 6422 (cloaking)*/}
ant_d02_i_q.gat,129,73,2	script	�J�t���X#p8_vitata3	21394,{/* 6423 (cloaking)*/}
ant_d02_i_q.gat,130,73,2	script	�u���A�Z��#part8	4056,{/* 6424 (cloaking)*/
	if(IL_ANT_QUE == 12) {
		cloakoffnpc "�J�t���X#p8_vitata2";	// 6421
		cloakonnpc "�Â��ȃ}���[#p8_maya1";	// 6422
		cloakonnpc "�J�t���X#p8_vitata3";	// 6423
		mes "�]�u���A�Z�����������]";
		mes "�@���̃u���A�Z���͖{�����낤���c�c�H�]";
		unittalk getcharid(3),strcharinfo(0)+" : �I",1;	// self:hidden
		next;
		mes "�]�������̃r�^�^�͖{���̃J�t���X���B";
		mes "�@�����ǁA�ǂ����Ď����ɖ{����";
		mes "�@�J�t���X���Ƃ킩�����̂��낤���c�c�H�]";
		unittalk getcharid(3),strcharinfo(0)+" : �c�c",1;	// self:hidden
		next;
		menu "�J�t���X�I",-;
		mes "�]�r�^�^���������U��������]";
		next;
		mes "[�u���A�Z��]";
		mes "�c�c�B";
		mes strcharinfo(0)+"�c�c�B";
		mes "���A�J�t���X�̊炪�v���o���Ȃ��c�c�B";
		next;
		menu "��Ȃ��I",-;
		mes "[�u���A�Z��]";
		mes "�������I";
		cloakonnpc "�J�t���X#p8_vitata2";	// 6421
		cloakoffnpc "�Â��ȃ}���[#p8_maya1";	// 6422
		cloakoffnpc "�J�t���X#p8_vitata3";	// 6423
		misceffect 133,"�Â��ȃ}���[#p8_maya1";	// 6422
		next;
		mes "[�u���A�Z��]";
		mes "�J�t���X�c�c�I�H";
		next;
		mes "[�J�t���X]";
		mes "�c�c�A�c�c�B";
		unittalk getnpcid(0,"�J�t���X#p8_vitata3"),"�J�t���X : �u���A�Z���A���܂�B����ȏ�́A�ꏏ�ɖ`���ł������ɂ��Ȃ��B";	// 6423
		next;
		mes "[�u���A�Z��]";
		mes "�ǂ����āH����Ȃ̌�����I";
		mes "�J�t���X�c�c�I�I";
		next;
		mes "�]�J�t���X�̌��t�́A";
		mes "�@�܂�Ő��̒��ɂ��邩�̂悤��";
		mes "�@�s�N���ɕ�������c�c�]";
		next;
		mes "[�J�t���X]";
		mes "�c�c�A�c�c�B";
		unittalk getnpcid(0,"�J�t���X#p8_vitata3"),"�J�t���X : ���͂����ꏏ�ɋ����Ȃ��B�����Ȃ�A�N�̐S�̈ꕔ�ɂȂ�Ă悩�����B�����y����������B";	// 6423
		next;
		mes "[�u���A�Z��]";
		mes "�J�t���X�c�c�H";
		next;
		mes "[�J�t���X]";
		mes "�c�c�A�c�c�B";
		unittalk getnpcid(0,"�J�t���X#p8_vitata3"),"�J�t���X : �����̖`���ҁA���̓u���A�Z���������ɓ��������ɍ\�z���ꂽ�F���G���[�̈ꕔ�ɉ߂��Ȃ��B";	// 6423
		next;
		mes "[�u���A�Z��]";
		mes "�����������̘b�c�c�H";
		next;
		mes "[�J�t���X]";
		mes "�c�A�c�c�c�B";
		unittalk getnpcid(0,"�J�t���X#p8_vitata3"),"�J�t���X : �ǂ����u���A�Z�����T���ɗ��Ȃ���������������߂������񂾁c�c����Ȏ���T���ɗ��Ă���Ă��肪�Ƃ��B";	// 6423
		next;
		mes "�]�J�t���X�́A���x�̓}���[�Ƙb���������B";
		mes "�@����ƁA���������̃J�t���X�̌��t�́A";
		mes "�@�������Ȃ��Ȃ��Ă��܂��Ă����]";
		next;
		mes "[�J�t���X]";
		mes "�c�A�c�A�c�c�B";
		unittalk getnpcid(0,"�J�t���X#p8_vitata3"),"�J�t���X : �c�A�c�A�c�c�B";	// 6423
		next;
		mes "�]�}���[�͐G�p�𓮂����Ęb�𕷂��Ă���]";
		unittalk getnpcid(0,"�J�t���X#p8_vitata3"),"�J�t���X : �c�A�c�A�c�c�B";	// 6423
		unittalk getnpcid(0,"�Â��ȃ}���[#p8_maya1"),"�Â��ȃ}���[ : �c�c�A�c�A�c�B";	// 6422
		next;
		mes "[�u���A�Z��]";
		mes "�J�t���X�I";
		next;
		misceffect 515,"�J�t���X#p8_vitata3";	// 6423
		cloakonnpc "�J�t���X#p8_vitata3";	// 6423
		cloakonnpc "�Â��ȃ}���[#p8_maya1";	// 6422
		mes "�]�}���[�ƃJ�t���X�́A�łɗn����";
		mes "�@���������Ă��܂����]";
		next;
		mes "[�u���A�Z��]";
		mes "�c�c�B";
		next;
		mes "[�u���A�Z��]";
		mes "�c�c�B";
		mes "�c�c�B";
		next;
		mes "[�u���A�Z��]";
		mes "�c�c�B";
		mes "�c�c�B";
		mes "�c�c�B";
		next;
		delquest 8729;
		setquest 8730;	// state=1
		set IL_ANT_QUE,13;
		mes "[�u���A�Z��]";
		mes "�c�c�O�ɏo�悤�B";
		mes "�~���R�ƃ������_���҂��Ă���B";
		close2;
		warp "anthell02_q.gat", 172, 185;	// from: ant_d02_i_q.gat(129, 70)
		end;
	}
	end;
OnInit:
	setnpcdisplay "�u���A�Z��#part8",4056,0,1,13,7,0,1523,0,0,0;	// 6424
}
ant_d02_i_q.gat,170,190,0	warp	ad02iq_ah02_q	1,1,anthell02_q.gat,172,185	//ant_d02_i_q.gat from_pos=(170, 189)

ant_d02_i.gat,175,186,3	script	�t����#iltw	4058,{/* 6432 */}
// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
OnInit:
	setnpcdisplay "�t����#iltw",4058,1,1,11,6,0,0,0,0,0;	// 6432
ant_d02_i.gat,177,181,5	script	�S�[�i#iltw	4068,{/* 6433 */}
// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
OnInit:
	setnpcdisplay "�S�[�i#iltw",4068,1,0,13,5,0,0,0,0,0;	// 6433
ant_d02_i.gat,171,179,3	script	�~�b�N#iltw	4055,{/* 6434 */}
// Name Class Sex ClothColor HairStyle HairColor Helm1 Helm2 Helm3 robe style.
OnInit:
	setnpcdisplay "�~�b�N#iltw",4055,0,0,28,2,0,0,0,0,0;	// 6434
ant_d02_i.gat,170,190,0	warp	ad02i_ah02_q	1,1,anthell02_q.gat,172,185 //ant_d02_i.gat from_pos=(170, 189)

// ant_d02_i_q.gat
ant_d02_i_q.gat,0,0,0,0	monster	�^�ʖڂȃA���h��	21386,3,5000,0,0
ant_d02_i_q.gat,0,0,0,0	monster	�^�ʖڂȃA���h���̗c��	21388,1,5000,0,0
ant_d02_i_q.gat,0,0,0,0	monster	���ɂႮ�ɂႵ���a�̗�	21391,1,5000,0,0
ant_d02_i_q.gat,0,0,0,0	monster	�^�ʖڂȃf�j�[��	21389,3,5000,0,0
ant_d02_i_q.gat,0,0,0,0	monster	�x���̂���t�@�~���A�[	21393,1,5000,0,0
ant_d02_i_q.gat,0,0,0,0	monster	�x���̂���K�C�A�X	21392,1,5000,0,0
ant_d02_i_q.gat,0,0,0,0	monster	�^�ʖڂȃs�G�[��	21390,3,5000,0,0
ant_d02_i_q.gat,0,0,0,0	monster	�^�ʖڂȕ����A���h��	21387,3,5000,0,0

// ant_d02_i.gat
ant_d02_i.gat,0,0,0,0	monster	�^�ʖڂȃA���h��	21386,70,5000,0,0
ant_d02_i.gat,0,0,0,0	monster	�^�ʖڂȃA���h���̗c��	21388,10,5000,0,0
ant_d02_i.gat,0,0,0,0	monster	���ɂႮ�ɂႵ���a�̗�	21391,10,5000,0,0
ant_d02_i.gat,0,0,0,0	monster	�^�ʖڂȃf�j�[��	21389,70,5000,0,0
ant_d02_i.gat,0,0,0,0	monster	�x���̂���t�@�~���A�[	21393,10,5000,0,0
ant_d02_i.gat,0,0,0,0	monster	�x���̂���K�C�A�X	21392,20,5000,0,0
ant_d02_i.gat,0,0,0,0	monster	�^�ʖڂȃs�G�[��	21390,70,5000,0,0
ant_d02_i.gat,0,0,0,0	monster	�^�ʖڂȕ����A���h��	21387,40,5000,0,0
