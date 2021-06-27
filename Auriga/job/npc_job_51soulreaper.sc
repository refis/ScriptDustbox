//====================================================================
//Ragnarok Online - SoulReaper Jobchange Script	by refis
//
//�@�� CHANGE_SR -> 0�`10
//====================================================================

pay_fild08.gat,51,82,0	script	#s_wp001	139,6,6,{/* 10723 */
	if(Job == Job_Linker && BaseLevel >= 99 && JobLevel >= 50) {
		if(CHANGE_SR == 0) {
			cloakoffnpc "�n���j��#s0001";	// 10728
			cloakoffnpc "��U��#s0001";	// 10724
			cloakoffnpc "������#s0001";	// 10725
			cloakoffnpc "�x�z�l#s0001";	// 10726
			cloakoffnpc "�ԓ�#s0001";	// 10727
			unittalk getnpcid(0,"�n���j��#s0001"),"�n���j�� : �����悤�Ƃ��Ă��񂶂Ⴀ��܂���I�@�D�_��߂܂��Ȃ��ƁI�@���̕�݂��c�c�B";	// 10728
			setquest 12442;	// state=1
			set CHANGE_SR,1;
		}
		else if(CHANGE_SR == 1) {
			cloakoffnpc "�n���j��#s0001";	// 10728
			cloakoffnpc "��U��#s0001";	// 10724
			cloakoffnpc "������#s0001";	// 10725
			cloakoffnpc "�x�z�l#s0001";	// 10726
			cloakoffnpc "�ԓ�#s0001";	// 10727
			unittalk getnpcid(0,"�n���j��#s0001"),"�n���j�� : �����悤�Ƃ��Ă��񂶂Ⴀ��܂���I�@�D�_��߂܂��Ȃ��ƁI�@���̕�݂��c�c�B";	// 10728
		}
		else if(CHANGE_SR == 2) {
			mes "�]�n���j�����A��Ă����ꂽ�B";
			mes "���čs�����]";
			close2;
			warp "payon.gat", 190, 94;
		}
		else {
			cloakonnpc "�n���j��#s0001";	// 10728
			cloakonnpc "��U��#s0001";	// 10724
			cloakonnpc "������#s0001";	// 10725
			cloakonnpc "�x�z�l#s0001";	// 10726
			cloakonnpc "�ԓ�#s0001";	// 10727
		}
	}
	end;
}

pay_fild08.gat,49,84,5	script	��U��#s0001	88,{/* 10724 (cloaking)*/
	mes "[��U��]";
	mes "�������͎R������Ȃ��B";
	mes "���̃n���j�����Ă��";
	mes "�����̗��قɗ��܂����c�P���x���킸";
	mes "�����o�����Ƃ�������߂܂�����������B";
	mes "�֌W�Ȃ��Ȃ�\��Ȃ��ł���B";
	close2;
	unittalk "��U�� : �����A�������܂����c�P�𕥂��ȁB";	// 10724
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,49,80,7	script	������#s0001	88,{/* 10725 (cloaking)*/
	mes "[������]";
	mes "�Ȃ񂾁H�@�n���j���̈ꖡ���H";
	mes "���񂽂������";
	mes "Zeny�𕥂��Ă����̂����H";
	mes "��������Ȃ��Ȃ炳�����Ǝ����ȁI";
	close2;
	unittalk "������ : ���a�I�ɉ������܂��傤��A���񂿂��B";	// 10725
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,53,80,1	script	�x�z�l#s0001	88,{/* 10726 (cloaking)*/
	mes "[�x�z�l]";
	mes "�����������̓X�ň��ݐH������������";
	mes "10��Zeny�𒴂��Ă�񂾁B";
	mes "�c�P�Ƃ��̂��قǂقǂɂ��Ȃ���I";
	close2;
	unittalk "�x�z�l : Zeny�͂����Ǝ����Ă�H�@������Γ����Ă����Ȃ��ƂȁB";	// 10726
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,53,84,3	script	�ԓ�#s0001	88,{/* 10727 (cloaking)*/
	mes "[�ԓ�]";
	mes "���񂽂�����Ƀc�P�𕥂�����H";
	mes "�S���x�������猩�����Ă������B";
	close2;
	unittalk "�ԓ� : �c�P�͕���Ȃ�����ȁ`";	// 10727
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,51,82,7	script	�n���j��#s0001	10295,{/* 10728 (cloaking)*/
	if(CHANGE_SR == 1) {
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "�Ȃ�ł����H�@���Ȃ����؋����ł����H";
		mes "���قł��Ȃ��̂悤�Ȑl��";
		mes "�������܂���ł������B";
		next;
		menu "�؋��H",-;
		mes "[�n���j��]";
		mes "�֌W�Ȃ��Ȃ��ɂ��Ă���܂��񂩁H";
		mes "�����̒ʂ�A���͂������";
		mes "���č���ł��܂��āc�c�B";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[�ԓ�]";
		mes "�����Ƃ���`���҂݂������ȁB";
		mes "�ʂɂ�܂������Ƃ����Ă���킯����Ȃ��B";
		mes "�����̗��܂����c�P��";
		mes "��藧�ĂĂ邾���Ȃ�ŁA";
		mes "���݂��p�𗧂Ă��ɍς܂��܂��傤��B";
		next;
		if(select("�ڂ�������𒮂�","��������") == 2) {
			mes "[������]";
			mes "���������A����ł����I";
			mes "����Ȃ�����Ɋւ����";
			mes "�������ƂȂ�Ė�������ˁB";
			close;
		}
		mes "[�x�z�l]";
		mes "����Ƃ����قǂ̂��Ƃł��Ȃ��B";
		mes "������^0000ff�n���j��^000000�Ƃ����񂾂��A";
		mes "�\���ȏイ���̗��قɔ��܂���";
		mes "���ݐH�����������ɁA";
		mes "�����������葋���瓦���o�����Ƃ����B";
		mes "���������������߂܂����񂾁B";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "�����o�����Ȃ�āc�c�B";
		mes "���̕�݂𓐂񂾓D�_��";
		mes "�ǂ������悤�Ƃ��������ł�!!";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[������]";
		mes "�͂��͂��A�킩�����킩�����B";
		mes "��Ԃ̌�����ł��ˁ`�B";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "�{���Ȃ�ł��I";
		mes "�c�P�𓥂ݓ|�����ƂȂ�Ă��Ă܂���I";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[�x�z�l]";
		mes "�Ƃ肠�������قɖ߂��āA";
		mes "���ꂩ��̂��Ƃ��������b���܂��傤��B";
		mes "�����œ����͎̂v������舫���Ȃ���B";
		next;
		mes "[�ԓ�]";
		mes "�����ɂ��鉺���Ԃ��A";
		mes "�̗��قŐH���������ĕ߂܂����񂾂��A";
		mes "���͂���Ȃɂ��^�l�ԂɂȂ��Ă��B";
		next;
		mes "[������]";
		mes "������ƁA�̘b�͂�߂܂��傤��A�Z�M�B";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "�D�_��߂܂����炷�������܂��I";
		mes "�܂����������ɂ͍s���Ă��Ȃ��͂��ł��I";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[�x�z�l]";
		mes "���邳���Ȃ��`�B";
		mes "�����悤���č��_�����������Ȃ񂾂�B";
		mes "�����̗��ق܂ő�l�������ė��ȁB";
		next;
		delquest 12442;
		setquest 12443;	// state=1
		set CHANGE_SR,2;
		cloakonnpc "�n���j��#s0001";	// 10728
		cloakonnpc "��U��#s0001";	// 10724
		cloakonnpc "������#s0001";	// 10725
		cloakonnpc "�x�z�l#s0001";	// 10726
		cloakonnpc "�ԓ�#s0001";	// 10727
		mes "�]�ǂ����l�q���C�ɂȂ�B";
		mes "�@�ނ炪������������A";
		mes "�@���Ȃ��̓t�F�C�����̗��قɌ��������]";
		close2;
		warp "payon.gat", 190, 94;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,192,90,0	script	#s_wp002	139,14,14,{/* 10729 */
	if(CHANGE_SR == 2) {
		cloakoffnpc "�n���j��#s0002";	// 10732
		cloakonnpc "�~���I�R#s0002";	// 10735
		cloakonnpc "�����т����#s0002";	// 10734
		cloakonnpc "��U��#s0002";	// 10730
		cloakonnpc "�����т����#s00022";	// 10733
		cloakonnpc "��U��#s00022";	// 10731
	}
	else if(CHANGE_SR == 3) {
		cloakonnpc "�n���j��#s0002";	// 10732
		cloakoffnpc "�~���I�R#s0002";	// 10735
		cloakonnpc "�����т����#s0002";	// 10734
		cloakonnpc "��U��#s0002";	// 10730
		cloakonnpc "�����т����#s00022";	// 10733
		cloakonnpc "��U��#s00022";	// 10731
	}
	else if(CHANGE_SR == 4) {
		cloakoffnpc "�n���j��#s0002";	// 10732
		cloakonnpc "�~���I�R#s0002";	// 10735
		cloakonnpc "�����т����#s0002";	// 10734
		cloakonnpc "��U��#s0002";	// 10730
		cloakonnpc "�����т����#s00022";	// 10733
		cloakonnpc "��U��#s00022";	// 10731
	}
	else if(CHANGE_SR == 5) {
		cloakoffnpc "�n���j��#s0002";	// 10732
		cloakonnpc "�~���I�R#s0002";	// 10735
		cloakoffnpc "�����т����#s0002";	// 10734
		cloakoffnpc "��U��#s0002";	// 10730
		cloakonnpc "�����т����#s00022";	// 10733
		cloakonnpc "��U��#s00022";	// 10731
	}
	else if(CHANGE_SR == 6) {
		cloakoffnpc "�n���j��#s0002";	// 10732
		cloakonnpc "�~���I�R#s0002";	// 10735
		cloakonnpc "�����т����#s0002";	// 10734
		cloakonnpc "��U��#s0002";	// 10730
		cloakonnpc "�����т����#s00022";	// 10733
		cloakonnpc "��U��#s00022";	// 10731
	}
	end;
}

payon.gat,190,95,5	script	��U��#s0002	88,{/* 10730 (cloaking)*/
	mes "[��U��]";
	mes "�Ȃ񂾁H�@���񂽂Ƃ͘b�����Ƃ˂���B";
	close;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,190,95,4	script	��U��#s00022	88,{/* 10731 (cloaking)*/
	mes "[��U��]";
	mes "�Ȃ񂾁H�@���񂽂Ƃ͘b�����Ƃ˂���B";
	close;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,192,90,1	script	�n���j��#s0002	10295,{/* 10732 (cloaking)*/
	if(CHANGE_SR == 2) {
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "��������Ⴂ�܁c�c";
		next;
		menu "���A����",-;
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "�͂́c�c�B";
		mes "���̎��̕��ł������B";
		mes "�c�c���̕�݂����܂ꂽ�����ŁA";
		mes "�����œ������ƂɂȂ��Ă��܂��܂����B";
		next;
		menu "�D�_�́H",-;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "�����Ǝ��̔��܂��������̏󋵂�";
		mes "�悭�c�������҂̎d�Ƃł��B";
		mes "���₵���C�z�������A�ڂ��o�߂�����";
		mes "���ɒN�������̕�݂����";
		mes "�����瓦���o���Ă��܂����B";
		next;
		menu "��݂̒��g�́H",-;
		mes "[�n���j��]";
		mes "���s�̂��߂̂����ƁA";
		mes "���̐E�ƂɊւ���M�d�ȕ󕨂������Ă܂��B";
		mes "�������厖�ł����A���̕󕨂�";
		mes "���l�̎�ɓn��Ɩ{���ɍ���܂��c�c�B";
		next;
		cutin "soul_van03.bmp", 255;
		cloakoffnpc "��U��#s0002";	// 10730
		mes "[��U��]";
		mes "�悧�A�n���j���B�Ȃɖ��𔄂��Ă���I";
		mes "�����ɗ��܂��Ă�̂�";
		mes "�Y��ɂ��Ƃ��ƌ���������B";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "�Ƃɂ������͎d�������Ȃ��Ă͂����܂���B";
		mes "���炵�܂��B";
		close2;
		cutin "soul_van02.bmp", 255;
		cloakonnpc "��U��#s0002";	// 10730
		cloakonnpc "�n���j��#s0002";	// 10732
		cloakoffnpc "�����т����#s0002";	// 10734
		unittalk getnpcid(0,"�����т����#s0002"),"�����т���� : �E�`�A���񂾓z��m���Ă�́c�c�B";	// 10734
		end;
	}
	else if(CHANGE_SR == 4) {
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "��������Ⴂ�܁c�c";
		next;
		menu "��݂�������",-;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "�����I�@����́c�c";
		mes "��@�p��܂Ə�����I";
		mes "���̕�݂ɊԈႢ����܂���c�c�B";
		mes "������ǂ��ŁH";
		next;
		menu "�����蓐�񂾔Ɛl�̕����C�ɂȂ�܂��񂩁H",-;
		mes "[�n���j��]";
		mes "�������C�ɂȂ�܂��B";
		mes "���������N������Ȃ��Ƃ��I";
		next;
		cutin "soul_van03.bmp", 255;
		hideoffnpc "��U��#s0002";	// 10730
		mes "[��U��]";
		mes "�n���j���A�܂����𔄂��Ă���ȁH";
		mes "�d���͂����Ƃ���B";
		next;
		menu "���傤�ǔƐl������܂�����",-;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "��U�߂��D�_�ł����āH";
		next;
		cutin "soul_van03.bmp", 255;
		mes "[��U��]";
		mes "���������A�����̌��������t�ɂ�";
		mes "�����ƐӔC������H";
		mes "���̏؋����Ȃ��D�_����������A";
		mes "�ǂ��Ȃ邩�킩���Ă邾�낤�ȁH";
		close2;
		cloakoffnpc "�����т����#s0002";	// 10734
		cloakonnpc "�~���I�R#s0002";	// 10735
		unittalk getnpcid(0,"�����т����#s0002"),"�~���I�R : �E�`�A�����́I�@���̐l�Ɖ����Ԃ���݂𖄂߂Ă��́I";	// 10734
		delquest 12445;
		setquest 12446;	// state=1
		set CHANGE_SR,5;
		end;
	}
	else if(CHANGE_SR == 5) {
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "�����̂��삳��̘b�𕷂��Ă݂܂��傤�B";
		mes "�B��̏ؐl�ł�����B";
		close2;
		hideoffnpc "�����т����#s0002";	// 10734
		cloakonnpc "�����т����#s00022";	// 10733
		cutin "soul_van01.bmp", 255;
		end;
	}
	else if(CHANGE_SR == 6) {
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "���̂����A";
		mes "���Ȃ��Ƃ͂܂��b���������Ƃ��������܂��B";
		mes "���̒��̖k���֒ʂ���o�����܂�";
		mes "���ė��Ă��������Ȃ��ł��傤���H";
		next;
		cutin "soul_van01.bmp", 255;
		cloakonnpc "�n���j��#s0002";	// 10732
		mes "�]���Ȃ��̓n���j���̌��";
		mes "�@���čs�����Ƃɂ����]";
		close2;
		warp "payon.gat", 238, 291;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,187,94,7	script	�����т����#s00022	96,{/* 10733 (cloaking)*/
	cloakoffnpc "�����т����#s0002";	// 10734
	cloakonnpc "�����т����#s00022";	// 10733
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,187,94,5	script	�����т����#s0002	96,{/* 10734 (cloaking)*/
	if(CHANGE_SR == 2) {
		mes "[�����т����]";
		mes "�E�`�A���񂾓z��m���Ă�́c�c";
		mes "�������҂Ȃ́c�c�B";
		next;
		menu "�����т����A���Ȃ�ƌ������́H",-;
		mes "[�~���I�R]";
		mes "�E�`�A�����т���񂶂�Ȃ��́B";
		mes "�~���I�R���Ă����́B";
		mes "���̂��o����̕�݁A";
		mes "���񂾓z��m���Ă�́c�c�B";
		next;
		if(select("�N�����񂾂������H","���o����H") == 2) {
			mes "[�~���I�R]";
			mes "���o����́A";
			mes "�������̃\�E�����[�p�[�̂��o����Ȃ́B";
			next;
		}
		mes "[�~���I�R]";
		mes "���̂��o���񂪐Q�Ă�ԂɁA";
		mes "��U�߂Ɖ����Ԃ���݂𓐂�Ŗ��߂��́B";
		mes "�O���������H���ɍ����āA";
		mes "�ԓ��͌������Ă��́c�c�B";
		next;
		menu "��݂͂ǂ��Ȃ����H",-;
		mes "[�~���I�R]";
		mes "�E�`�A��݂̏ꏊ�킩��́c�c�B";
		mes "�ē����Ă�����́c�c�B";
		close2;
		cloakonnpc "�����т����#s0002";	// 10734
		cloakoffnpc "�~���I�R#s0002";	// 10735
		end;
	}
	else if(CHANGE_SR == 5) {
		cloakonnpc "�����т����#s0002";	// 10734
		cloakoffnpc "�����т����#s00022";	// 10733
		mes "[�~���I�R]";
		mes "�E�`�͂����茩���́I�@���̐l�����񂾂́I";
		next;
		cloakonnpc "��U��#s0002";	// 10730
		cloakoffnpc "��U��#s00022";	// 10731
		mes "[��U��]";
		mes "�����A���т��q�B";
		mes "�����̌��t�ɐӔC����̂����H";
		next;
		cloakoffnpc "�����т����#s0002";	// 10734
		cloakonnpc "�����т����#s00022";	// 10733
		mes "[�~���I�R]";
		mes "�E�`�A���т��q����Ȃ�����I";
		mes "�R�����Ȃ��́I�@�͂����茩���́I";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "���肪�Ƃ��A���삳��B";
		mes "���v����B";
		mes "���̏������";
		mes "���ڕ����Ă݂悤����Ȃ����B";
		next;
		cutin "soul_van03.bmp", 255;
		cloakoffnpc "��U��#s0002";	// 10730
		cloakonnpc "��U��#s00022";	// 10731
		mes "[��U��]";
		mes "�ȁc�c�Ȃ񂾁B�������Ă���!?";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[�n���j��]";
		mes "^ff00ff������̎傪���̍��ɕ����B";
		mes "�����ɓ�����̂ł���΁A";
		mes "�����������͂��Ȃ��B^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[��U��]";
		mes "���c�c�������c�c���A���ɉ��������I";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[�n���j��]";
		mes "^ff00ff���̕�݂𓐂����Ƃ������Ƃ͂���̂��H^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[��U��]";
		mes "���c�c���������I�@��߂�I";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "���̏�����́A��R����҂̍���";
		mes "�������H���Ԃ��B";
		mes "�M�l�̖���";
		mes "�������X�ɍ���Ă���̂��B";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[�n���j��]";
		mes "^ff00ff�����肽���Ȃ瓚���Ȃ����l�ԁI^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[��U��]";
		mes "���c�c���������I�@���c�c���́c�c";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "���������Ȃ��̂ł����";
		mes "���������͂��Ȃ��B";
		mes "�����A���̂܂܂���";
		mes "�������󂷂邾�낤�B";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[��U��]";
		mes "���킠���I�@����������݂𓐂݂܂����I";
		mes "�厖�ȕ󂪓����Ă�Ǝv���āA���c�c�B";
		mes "�S�����󂵂܂�����A";
		mes "�ǂ������������������I";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[�n���j��]";
		mes "^ff00ff�ǂ����Ď��������œ������悤�Ƃ����̂��H^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[��U��]";
		mes "���񂾕�݂��J���Ă݂���A";
		mes "�������͂̏h���������o�Ă���";
		mes "�|���Ȃ�܂����B";
		mes "�}���Ŗ��߂��Ƃ���A";
		mes "�\�E�����[�p�[�l�̎p���������̂ŁA";
		mes "�ǂ��ɂ����~�߂��悤�Ƃ��������ł��B";
		next;
		cutin "soul_van04.bmp", 2;
		mes "[�n���j��]";
		mes "^ff00ff�����̏]�ƈ��������A";
		mes "㩂ɛƂ߂ē��������̂��H^000000";
		next;
		cutin "soul_van04.bmp", 255;
		mes "[��U��]";
		mes "�Ⴂ�܂��I";
		mes "���̓z��́A�{���ɍs�����Ă��Ȃ���";
		mes "�����œ����n�߂���ł��B";
		mes "�������͏����Ă��������B";
		mes "���ł����ł������グ�܂��B";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "��낵���B";
		mes "���K�I�ȕ����͌�Řb��������Ȃ����c�c�B";
		next;
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "���삳��Ɨ��̂����̂��A�ŁA";
		mes "�{���ɏ�����܂����B";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�n���j��]";
		mes "���̂����A";
		mes "���Ȃ��Ƃ͂܂��b���������Ƃ��������܂��B";
		mes "���̒��̖k���֒ʂ���o�����܂�";
		mes "���ė��Ă��������Ȃ��ł��傤���H";
		next;
		delquest 12446;
		setquest 12447;	// state=1
		set CHANGE_SR,6;
		cutin "soul_van04.bmp", 255;
		cloakonnpc "�n���j��#s0002";	// 10732
		cloakonnpc "�~���I�R#s0002";	// 10735
		cloakonnpc "�����т����#s0002";	// 10734
		cloakonnpc "��U��#s0002";	// 10730
		cloakonnpc "�����т����#s00022";	// 10733
		cloakonnpc "��U��#s00022";	// 10731
		mes "�]���Ȃ��̓n���j���̌��";
		mes "�@���čs�����Ƃɂ����]";
		close2;
		warp "payon.gat", 238, 291;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,187,94,5	script	�~���I�R#s0002	876,{/* 10735 (cloaking)*/
	if(CHANGE_SR == 2) {
		mes "[�~���I�R]";
		mes "�E�`�̌�ɂ��ė���΂����́c�c�B";
		next;
		menu "�L�ɕς����!!",-;
		mes "[�~���I�R]";
		mes "�������ƂȂ��́c�c";
		mes "�������ė���΂����́c�c�B";
		next;
		delquest 12443;
		setquest 12444;	// state=1
		set CHANGE_SR,3;
		cloakonnpc "�~���I�R#s0002";	// 10735
		mes "�]�~���I�R�̌�ɂ��čs�����]";
		close2;
		warp "pay_fild08.gat", 55, 121;
		end;
	}
	else if(CHANGE_SR == 3) {
		mes "[�~���I�R]";
		mes "�E�`�̌�ɂ��ė���΂����́c�c�B";
		next;
		menu "�L�ɕς����!!",-;
		mes "[�~���I�R]";
		mes "�������ƂȂ��́c�c";
		mes "�������ė���΂����́c�c�B";
		next;
		cloakonnpc "�~���I�R#s0002";	// 10735
		mes "�]�~���I�R�̌�ɂ��čs�����]";
		close2;
		warp "pay_fild08.gat", 55, 121;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,56,126,0	script	#s_wp003	139,14,14,{/* 10736 */
	if(CHANGE_SR == 3 || CHANGE_SR == 4) {
		cloakoffnpc "�~���I�R#s0003";	// 10737
	}
	end;
}
pay_fild08.gat,56,126,1	script	�~���I�R#s0003	876,{/* 10737 (cloaking)*/
	if(CHANGE_SR == 3) {
		mes "[�~���I�R]";
		mes "�����Ȃ́A�����c�c";
		mes "�������@��΂����́c�c�B";
		next;
		misceffect 14,"���y#s0003";	// 10738
		mes "�]�@��Ȃ���b�𕷂����Ƃɂ����]";
		next;
		menu "�n���j���Ƃ����j�Ƃ͒m�荇���H",-;
		mes "[�~���I�R]";
		mes "����H�@�j�Ȃ́c�c�H";
		mes "����ς菗���Ǝv���́B";
		mes "�E�`�����ɂ������������A";
		mes "�����Ă��ꂽ�ǂ����o����Ȃ́c�c";
		mes "�����牶��Ԃ����Ƃ��������Ȃ́B";
		next;
		menu "���ق̏]�ƈ��������{���ɓD�_�H",-;
		mes "[�~���I�R]";
		mes "���̐l�Ԃ������A";
		mes "�n���j���̂��o�����㩂ɛƂ߂��́B";
		mes "�E�`�ɂ͂���ȏ㕪����Ȃ����c�c";
		mes "�ǂ����Ă�������́A���ڕ��������Ȃ��́B";
		next;
		mes "�]��݂��������B";
		mes "�@���ɂ͗�͂̏h�������l�����肻����";
		mes "�@������Ă���悤���B";
		mes "�@�n���j���Ɋm�F���ɍs�����]";
		delquest 12444;
		setquest 12445;	// state=1
		set CHANGE_SR,4;
		close2;
		warp "payon.gat", 190, 94;
		end;
	}
	else if(CHANGE_SR == 4) {
		mes "[�~���I�R]";
		mes "��݂����o�����";
		mes "�͂��悤�Ȃ́c�c�B";
		close2;
		warp "payon.gat", 190, 94;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_fild08.gat,53,128,0	script	���y#s0003	844,{/* 10738 (cloaking)*/
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,241,294,0	script	#s_wp004	139,14,14,{/* 10739 */
	if(CHANGE_SR == 6) {
		cloakonnpc "�n���j��#s0004";	// 10741
		cloakonnpc "�n���j��#s0005";	// 10742
		cloakonnpc "�~���I�R#s0004";	// 10740
		cloakoffnpc "�n���j��#s0004";	// 10741
	}
	else if(CHANGE_SR == 7) {
		cloakonnpc "�n���j��#s0004";	// 10741
		cloakonnpc "�n���j��#s0005";	// 10742
		cloakonnpc "�~���I�R#s0004";	// 10740
		cloakoffnpc "�n���j��#s0004";	// 10741
		cloakoffnpc "�~���I�R#s0004";	// 10740
	}
	else if(CHANGE_SR == 8 || CHANGE_SR == 9 || CHANGE_SR == 10) {
		cloakonnpc "�n���j��#s0004";	// 10741
		cloakonnpc "�n���j��#s0005";	// 10742
		cloakonnpc "�~���I�R#s0004";	// 10740
		cloakoffnpc "�n���j��#s0005";	// 10742
	}
	end;
}

payon.gat,242,292,4	script	�~���I�R#s0004	876,{/* 10740 (cloaking)*/
	mes "[�~���I�R]";
	mes "�E�`���ē�����́c�c�B";
	mes "�m���Ă�ꏊ�����ē��ł��Ȃ�����A";
	mes "������Ȃ�������";
	mes "�撣���ĒT���Ăق����́c�c�B";
	mes "����`�������X�^�[�����邯��";
	mes "�����͂����H";
	next;
	if(select("������","�����ōs��") == 2) {
		mes "[�~���I�R]";
		mes "�݂�`���c�c�B";
		mes "�E�`����`�������́c�c�B";
		close;
	}
	mes "[�~���I�R]";
	mes "�E�`�̐K������������͂ނ́c�c�B";
	mes "�o���Ȃ́c�c�B";
	close2;
	warp "pay_dun03.gat", 123, 62;
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,241,294,3	script	�n���j��#s0004	10295,{/* 10741 (cloaking)*/
	if(CHANGE_SR == 6) {
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "�����܂ł��炵�Ă�������Ƃ́A";
		mes "���΂͌����񂾒ʂ�̂����ł��B";
		next;
		menu "�ǂ������Ӗ��ł����H",-;
		mes "[�n���j��]";
		mes "�����̎p�ɕϐg����";
		mes "����ׂ�L�������ɂȂ�܂�����ˁH";
		mes "����͎��ɕt���܂Ƃ��Ȃ���";
		mes "�y����ł����b�ł��B";
		mes "�L�̎p�̎��͕��ʂ̐l�Ԃɂ�";
		mes "�����Ȃ��͂��ł����A���Ȃ��ɂ͌������B";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "��������������݂̒���";
		mes "�󕨂����Ă������Ȃ��B";
		mes "�������N�T�����߂������ł��B";
		mes "�������_�͂̎�����ŁA";
		mes "�~�ɓM��Ȃ������c�c�B";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "�ˑR����Ȃ��Ƃ����肢����Ȃ��";
		mes "�}�X������������܂��񂪁A";
		mes "���̒����h�肾����������@�̎�`����";
		mes "���Ă��������Ȃ��ł��傤���H";
		next;
		menu "���͏�����@��m��܂��񂪁H",-;
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "���񂾍����������̃\�E�������J�[�ł���";
		mes "���Ȃ��ł���Ζ�肠��܂���B";
		mes "���̋�������i�K��ɏ���";
		mes "�悢�o���ɂ��Ȃ�Ǝv���܂��B";
		mes "�����Ă��������܂����H";
		next;
		menu "�Ō�܂ł��t���������܂��傤",-;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "���肪�Ƃ��������܂��B";
		mes "������@�̋V��������ɂ�";
		mes "����ς���^ff0000�ς̐K��^000000��";
		mes "�W�߂Ȃ���΂Ȃ�܂���B";
		mes "����^ff00004��^000000�K�v�ɂȂ�܂��B";
		next;
		cutin "soul_van01.bmp", 255;
		cloakoffnpc "�~���I�R#s0004";	// 10740
		mes "[�~���I�R]";
		mes "�l�ԁc�c";
		mes "�������͐M���Ă��ė��Ă����";
		mes "���肪�Ƃ��Ȃ́c�c�B";
		mes "�E�`����`�������́B";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "����͂��삳��A��낵�����肢���܂��B";
		mes "���͂����ŏ�����@�̏����ɂ�����܂��B";
		mes "�ē��͂��삳��ɔC���܂��B";
		delquest 12447;
		setquest 12448;	// state=1
		set CHANGE_SR,7;
		next;
		cutin "soul_van02.bmp", 255;
		mes "[�~���I�R]";
		mes "�E�`���ē�����́c�c�B";
		mes "�m���Ă�ꏊ�����ē��ł��Ȃ�����A";
		mes "������Ȃ�������";
		mes "�撣���ĒT���Ăق����́c�c�B";
		mes "����`�������X�^�[�����邯��";
		mes "�����͂����H";
		next;
		if(select("������","�����ōs��") == 2) {
			mes "[�~���I�R]";
			mes "�݂�`���c�c�B";
			mes "�E�`����`�������́c�c�B";
			close;
		}
		mes "[�~���I�R]";
		mes "�E�`�̐K������������͂ނ́c�c�B";
		mes "�o���Ȃ́c�c�B";
		close2;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	else if(CHANGE_SR == 7) {
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "���͂����ŏ�����@�̏����ɂ�����܂��̂�";
		mes "^0000ff�ς̐K����4��^000000���肢���܂��B";
		mes "�ē��͂��삳��ɔC���܂��B";
		next;
		cutin "soul_van02.bmp", 255;
		mes "[�~���I�R]";
		mes "�E�`���ē�����́c�c�B";
		mes "�m���Ă�ꏊ�����ē��ł��Ȃ�����A";
		mes "������Ȃ�������";
		mes "�撣���ĒT���Ăق����́c�c�B";
		mes "����`�������X�^�[�����邯��";
		mes "�����͂����H";
		next;
		if(select("������","�����ōs��") == 2) {
			mes "[�~���I�R]";
			mes "�݂�`���c�c�B";
			mes "�E�`����`�������́c�c�B";
			close;
		}
		mes "[�~���I�R]";
		mes "�E�`�̐K������������͂ނ́c�c�B";
		mes "�o���Ȃ́c�c�B";
		close2;
		warp "pay_dun03.gat", 123, 62;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

payon.gat,241,294,3	script	�n���j��#s0005	10295,{/* 10742 (cloaking)*/
	if(CHANGE_SR == 8) {
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "�ς̐K���̓~���I�R����󂯎��܂����B";
		mes "������@���n�߂����Ǝv���܂��B";
		next;
		menu "�ǂ̂悤�ȋV���ł����H",-;
		mes "[�n���j��]";
		mes "���̒i�K�����̂�����";
		mes "���������߂����ł����B";
		mes "�����ɘb���܂��B";
		next;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "�c�����A^ff0088�\�E�����[�p�[^000000�ւ̋��n�Ɏ���";
		mes "�Õ������������ƒ�́A";
		mes "���܂Ŏ��������Ƃ��Ȃ�������@�ɒ��݂܂����B";
		next;
		mes "[�n���j��]";
		mes "�����̎��͂��ߐM���Ă���";
		mes "�������͑厸�s���Ă��܂��A";
		mes "��̐��_�Ǝ��̑̂�";
		mes "�傫�Ȗ�肪�������܂����B";
		next;
		mes "[�n���j��]";
		mes "����Řc�񂾋C�̗���";
		mes "���̓��̂𕲁X�ɂ��A��΂��ꂽ����";
		mes "��̐g�̂ɏh��܂����B";
		mes "�������ɂ�����̂́A���̒�̂��̂ł��B";
		mes "�����Ē�̍��͐��_���E�̂ǂ�����";
		mes "���󂳂�Ă��܂��܂����B";
		cutin "soul_van02.bmp", 2;
		next;
		menu "����Ȃ��Ƃ��c�c",-;
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "���̂����A���͂��̓��̂̐��_���E�ɂ�";
		mes "���邱�Ƃ��ł��܂���B";
		mes "�����Ǎ����ȍ��̎�����̂��Ȃ��Ȃ�A";
		mes "������@���g���ē����͂��ł��B";
		mes "���_���E�̒���f�r���Ă����̍����A";
		mes "�ǂ����c�c���߂��Ă��������B";
		next;
		menu "���܂�",-;
		mes "[�n���j��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�S�̏����������܂�����A";
		mes "������@���n�߂܂��̂�";
		mes "���ɘb�������Ă��������B";
		delquest 12449;
		setquest 12450;	// state=1
		set CHANGE_SR,9;
		close2;
		cutin "soul_van03.bmp", 255;
		end;
	}
	else if(CHANGE_SR == 9) {
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "���̓������ɍ쐬������A";
		mes "������@���J�n���Ă��������B";
		next;
		switch(select("���̓����@�쐬","������@�̊J�n","��߂�")) {
		case 1:
			if(getonlinepartymember() != 1 || getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[�n���j��]";
				mes "1�l�p�[�e�B�[���������A";
				mes "�p�[�e�B�[���[�_�[�ɂȂ���";
				mes "������@��i�s���Ă��������B";
				close2;
				cutin "soul_van03.bmp", 255;
				end;
			}
			mdcreate "Spiritualism";
			mes "[�n���j��]";
			mes "���̓������J�ʂ�����";
			mes "������@���J�n���Ă��������B";
			close2;
			cutin "soul_van03.bmp", 255;
			end;
		case 2:
			switch(mdenter("Spiritualism")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[Spiritualism] �ɓ��ꂵ�܂����@ : �@" +strcharinfo(1)+ "(" +strcharinfo(0)+ ")",0x9,0x00FF99;
				//warp "1@soul.gat", 80, 72;
				end;
			case 1:	// �p�[�e�B�[������
				mes "[�n���j��]";
				mes "1�l�p�[�e�B�[���������A";
				mes "�p�[�e�B�[���[�_�[�ɂȂ���";
				mes "������@��i�s���Ă��������B";
				close2;
				cutin "soul_van03.bmp", 255;
				end;
			case 2:	// �_���W�������쐬
				cutin "soul_van03.bmp", 255;
				mes "^ff0000�܂����̓�������������Ă܂���B^000000";
				close;
			default:	// ���̑��G���[
				mes "[�n���j��]";
				mes "�����҂��Ă��������B";
				close;
			}
		case 3:
			mes "[�n���j��]";
			mes "�S�̏������I���܂�����A";
			mes "������@���n�߂܂��̂�";
			mes "���ɘb�������Ă��������B";
			close2;
			cutin "soul_van03.bmp", 255;
			end;
		}
	}
	else if(CHANGE_SR == 10) {
		cutin "soul_van04.bmp", 2;
		mes "[�n���j��]";
		mes "��̍��́c�c�B";
		next;
		menu "���ł̏o�������������",-;
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "�����ł������B";
		mes "�\�n�炵�����_�ł��ˁB";
		next;
		menu "���ꂩ��ǂ������ł����H",-;
		mes "[�n���j��]";
		mes "��̕��܂ŁA�撣���Đ����Ă����܂��B";
		mes "���ׂ��C�s�̓��͂܂������ł����c�c�B";
		next;
		cutin "soul_van02.bmp", 2;
		mes "[�n���j��]";
		mes "���������Η��̂����̐g�̂�";
		mes "�傫�ȗ�͂��h�����̂������܂��ˁB";
		mes "���Ȃ��̍��ɉۂ���ꂽ";
		mes "�֐����������Ƃ��A";
		mes "���̉��Ԃ����Ǝv���܂��B";
		next;
		menu "�֐��Ƃ́H",-;
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "�����C�s�͌��E�ɒB���Ă�̂ł�";
		mes "����܂��񂩁H";
		mes "������@���o���������Ȃ��́A";
		mes "���̒i�K�֍s����قǂ�";
		mes "��I�Ȑ����𐋂��܂����B";
		next;
		mes "[�n���j��]";
		mes "�����q����\�E�������J�[����";
		mes "���z����ҁc�c";
		mes "^ff0000�\�E�����[�p�[^000000�֒ʂ��铹��";
		mes "�����J���č����グ�܂��B";
		next;
		mes "[�n���j��]";
		mes "�ڂ���āA���΂炭���ɐg���ς˂Ă��������B";
		next;
		if(SkillPoint) {
			cutin "soul_van03.bmp", 2;
			mes "[�n���j��]";
			mes "�X�L���|�C���g�ɖ���������悤�ł��B";
			mes "�c�����A�g���؂��Ă��������ˁB";
			close2;
			cutin "soul_van03.bmp", 255;
			end;
		}
		if(Weight) {
			mes "[�n���j��]";
			mes "���낢�뎝���Ă��܂��ˁB";
			mes "�����d�ʂ�0�ɂ��Ă��Ă��������B";
			mes "���e�����y�ڂ��Ă��܂��܂��B";
			close2;
			cutin "soul_van01.bmp", 255;
			end;
		}
		cutin "soul_van04.bmp", 2;
		mes "[�n���j��]";
		mes "^0000ff(�悭������Ȃ�������������n���j��)^000000";
		mes "�c";
		mes "�c�c";
		mes "�c�c�c";
		mes "�֐��̕ǂ�B�����ŕ���Ȃ����B";
		misceffect 90,"";	// self
		jobchange Job_SoulReaper;
		resetstatus;
		resetskill;
		delquest 12451;
		setquest 202190;	// state=1
		set CHANGE_SR,0;
		next;
		cutin "soul_van01.bmp", 2;
		mes "[�n���j��]";
		mes "���܂ŏ����Ă������������Ƃɑ΂���";
		mes "���Ԃ��Ƃ��Ă͍��ׂȂ��̂ł����A";
		mes "���ɂł��邹�߂Ă��̂���ł��B";
		mes "�ł́A���Ȃ��̍s����ɁA";
		mes "�����̉��삪�h��񂱂Ƃ��F��܂��B";
		close2;
		cutin "soul_van01.bmp", 255;
		end;
	}
	if(Job == Job_SoulReaper) {
		cutin "soul_van03.bmp", 2;
		mes "[�n���j��]";
		mes "����ł͏C�s�̗��ɏo�����܂��B";
		mes "���̌q����͂���܂��̂ŁA";
		mes "�܂��ǂ����ŉ���Ƃł��傤�B";
		close2;
		cloakonnpc "�n���j��#s0005";	// 10742
		cutin "soul_van03.bmp", 255;
		end;
	}
	end;
OnInit:
	cloakonnpc;
	end;
}

pay_dun03.gat,119,65,0	script	#s_wp005	139,14,14,{/* 14120 */
	if(CHANGE_SR == 7 || CHANGE_SR == 8) {
		cloakoffnpc "�~���I�R#s0005";	// 14121
	}
	end;
}

pay_dun03.gat,119,65,4	script	�~���I�R#s0005	876,{/* 14121 (cloaking)*/
	if(CHANGE_SR == 7) {
		if(countitem(19719) < 4) {
			mes "[�~���I�R]";
			mes "�ς̐K��4�K�v�Ȃ́c�c�B";
			close;
		}
		mes "[�~���I�R]";
		mes "����ŏ\���Ȃ́c�c�B";
		mes "�����O�֏o��΂����́c�c�B";
		mes "�E�`�̐K������������͂ނ́B";
		delitem 19719,4;
		delquest 12448;
		setquest 12449;	// state=1
		set CHANGE_SR,8;
		close2;
		warp "payon.gat", 238, 291;
		end;
	}
	mes "[�~���I�R]";
	mes "����ŏ\���Ȃ́c�c�B";
	mes "�����O�֏o��΂����́c�c�B";
	mes "�E�`�̐K������������͂ނ́B";
	close2;
	warp "payon.gat", 238, 291;
	end;
OnInit:
	cloakonnpc;
	end;
}

//============================================================
// �������A���_���W����NPC
//------------------------------------------------------------
1@soul.gat,80,72,0	script	#start_sw	139,1,1,{/* 47757 */
OnTouch:
	initnpctimer;
	hideonnpc getmdnpcname("#start_sw");	// 47757
	end;
OnTimer2000:
	announce "�n���j�� : ���܂���̐��_���E�֓��ꂽ�悤�ł��ˁB", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer5000:
	announce "�n���j�� : ��������L���A�����������������悤�ɂ������܂����B", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer8000:
	announce "�H�H : �N�ł����H�@�N�������Ă�����ł����H", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer11000:
	announce "�n���j�� : ���̐��́I�@�\�n!?�@�\�n�Ȃ̂ˁH", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer14000:
	announce "�H�H : �����������c�c���������Ďo��ł����H", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer17000:
	announce "�n���j�� : �\�n�I�@���̘b���悭�����āB���A���̒ʘH�ɓ��������̂��������Ȃ����~���o���Ă���܂���B", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer22000:
	announce "�\�n : ������@�����s�������ɐ����؂�Ȃ��p�j��Ɖ�S�������A���̐��_���E�ɓ��荞�݂܂����B", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer27000:
	announce "�\�n : �ނ炪���̒ʘH���򂢐s�����̂�h�����߂ɁA�l�͂킴�Ƃ����Ɏ����铹��I�т܂����B", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer32000:
	announce "�\�n : �l��������Ȃ��ł��������B���̒ʘH����S��p�j��ɋ���Ă��܂��΁A�o��̖����낤���̂ł��B", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer37000:
	announce "�n���j�� : ����ȁc�c���łɏ�����@�͎n�܂��Ă��܂����̂�B", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer40000:
	announce "�\�n : �����c�c�l�̌��E�̊O�։�S�Ɯp�j�삽���������o���͂��߂܂����B������@���~�߂Ă��������A�o��I", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	end;
OnTimer45000:
	announce "�n���j�� : ��x�n�܂���������@�������I�Ɏ~�߂�ƁA�����鍰�̒ʘH��������Ă��܂���B", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer51000:
	stopnpctimer;
	announce "�\�n : �ʘH�ɓ����Ă��闷�̂����I�@�C�����Ă��������B�p�j�삽�����������֌������Ă��܂��I", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	donpcevent getmdnpcname("#MobCtrl_sw")+"::OnStart";
	end;
}

1@soul.gat,1,1,0	script	#MobCtrl_sw	139,{
OnStart:
	monster getmdmapname("1@soul.gat"),79,90,"�p�j��#1",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled1";
	monster getmdmapname("1@soul.gat"),82,90,"�p�j��#2",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled1";
	end;
OnKilled1:
	set '@count,getmapmobs(getmdmapname("1@soul.gat"),getmdnpcname("#MobCtrl_sw")+ "::OnKilled1");
	if('@count > 0)
		end;
	announce "�n���j�� : ���̂����I�@�������ł����H", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	sleep 3000;
	announce "�\�n : ���������������Ȃ�ł��ˁB�p�j�삽���̈ꕔ�����ł������A�ŁA�l�̍����������R�ɂȂ�܂����B", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	sleep 3000;
	announce "�\�n : �������A�܂������̜p�j��Ɖ�S�������������h��Ă��܂��B", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	sleep 3000;
	announce "�\�n : ���x�͂�苭���z�炪���̒ʘH�Ɍ������Ă܂��B�C�����Ă��������B", 0x9, 0xff5555, 0x0190, 18, 0, 0;
	monster getmdmapname("1@soul.gat"),82,90,"�p�j��#1",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	monster getmdmapname("1@soul.gat"),85,90,"�p�j��#2",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	monster getmdmapname("1@soul.gat"),81,90,"�p�j��#3",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	monster getmdmapname("1@soul.gat"),76,90,"�p�j��#4",1472,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled2";
	end;
OnKilled2:
	set '@count,getmapmobs(getmdmapname("1@soul.gat"),getmdnpcname("#MobCtrl_sw")+ "::OnKilled2");
	if('@count > 0)
		end;
	hideoffnpc getmdnpcname("#soul04");	// 74332
	sleep 100;
	unittalk getnpcid(0,getmdnpcname("#soul04"),"�\�n : �l�̍��̈ꕔ���A���̒ʘH�Ɍ���͂��߂܂����B";	// 74332
	sleep 3000;
	announce "�n���j�� : ���������ŉ�������̂ˁA�\�n�I", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("#soul04"),"�\�n : ��Ȃ��Ȃ�����l�̖T�ɗ��Ă��������B�����͖��ɗ��ł��傤�B";	// 74332
	sleep 3000;
	unittalk getnpcid(0,getmdnpcname("#soul04"),"�\�n : ���ꂩ��c�����S�Ẳ�S�Ɯp�j�삪�W�܂�ł��傤�B�o������߂Ă��������B";	// 74332
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"�p�j��#1",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"��S#2",1564,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"�p�j��#3",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"��S#4",1564,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"��S#5",1564,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	areamonster getmdmapname("1@soul.gat"),75,90,83,91,"�p�j��#6",1423,1,getmdnpcname("#MobCtrl_sw")+"::OnKilled3";
	end;
OnKilled3:
	set '@count,getmapmobs(getmdmapname("1@soul.gat"),getmdnpcname("#MobCtrl_sw")+ "::OnKilled3");
	if('@count > 0)
		end;
	donpcevent getmdnpcname("�\�n#soul05")+"::OnStart";
	end
}

1@soul.gat,81,80,5	script	#soul04	10043,3,3,{/* 74332 (hide)*/
	end;
OnTouch:
	npcskillsupport 28,9999;
	heal 9999,0;
	end;
}

1@soul.gat,81,80,5	script	�\�n#soul05	10295,{/* 9668 (hide)*/
	if('flag == 0) {
		cutin "soul_van02.bmp", 2;
		mes "[�\�n]";
		mes "�c�c�B";
		close2;
		cutin "soul_van02.bmp", 255;
		end;
	}
	if(CHANGE_SR == 9) {
		cutin "soul_van02.bmp", 2;
		mes "[�\�n]";
		mes "�l�̎o��������Ă�������A";
		mes "���肪�Ƃ��������܂��B";
		mes "���l�̍��̒ʘH�ɓ���邮�炢������A";
		mes "�{�����Y��ȍ����������Ȃ�ł��ˁB";
		next;
		menu "���ꂩ��ǂ��Ȃ�܂����H",-;
		cutin "soul_van01.bmp", 2;
		mes "[�\�n]";
		mes "�o��́A�l��g�̂ɖ߂���";
		mes "�������肾������ł��傤���c�c";
		mes "�l�͂������ė~��������܂���B";
		next;
		mes "[�\�n]";
		mes "�O�̐��E�ɋ����������Ȃ��Ă���A";
		mes "���N���o���܂����B";
		mes "��������V�E�֏���A";
		mes "�V������̐��E��T���������ł��B";
		next;
		announce "�n���j�� : �\�n�c�c�ςȋC�͋N�������A���̍��Ɠ���ւ��܂��傤�B", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
		set '@dummy,sleep2(3000);
		cutin "soul_van02.bmp", 2;
		mes "[�\�n]";
		mes "�͂��c�c���̈Ӓn������Ȑ��i�́A";
		mes "�q���̍�����ς���ĂȂ���B";
		mes "�����獰�����ւ��Ă��A";
		mes "���Ɛ��N�������Ȃ����Ƃ�";
		mes "�������̂͂��Ȃ̂ɁB";
		next;
		menu "���z���D�����S�̎�����Ȃ̂ł��傤",-;
		cutin "soul_van01.bmp", 2;
		mes "[�\�n]";
		mes "�l�͎o��ɂ͍��܂Œʂ�ɁA";
		mes "�C�s�𑱂��ė~�����ł��B";
		mes "�l�͖l�Ȃ�ɂ��ׂ����Ƃ�����܂��̂ŁB";
		next;
		mes "[�\�n]";
		mes "���������Η��̂����́A";
		mes "�傫�ȕǂ�����z���܂����ˁB";
		mes "�߂�܂�����A�o���ʂ��Č���";
		mes "�J���Ă�������΍K���ł��B";
		next;
		menu "���ꂩ��A�ǂ��֌������܂����H",-;
		cutin "soul_van02.bmp", 2;
		mes "[�\�n]";
		mes "�n��̋Ƃ��I������������";
		mes "�W�܂�Ƃ���֍s���܂��B";
		mes "�����Ǝo��Ƃ�";
		mes "�܂�������������ł��傤�ˁB";
		mes "�����`���Ă��������B";
		delquest 12450;
		setquest 12451;	// state=1
		set CHANGE_SR,10;
		next;
		mes "[�\�n]";
		mes "���낻�돵����@�̌��͂�";
		mes "�؂ꂻ���ł��ˁB";
		mes "�ł͎��炵�܂��c�c�B";
		close2;
		cutin "soul_van02.bmp", 255;
		warp "payon.gat", 238, 291;
		end;
	}
	cutin "soul_van02.bmp", 2;
	mes "[�\�n]";
	mes "�n��̋Ƃ��I������������";
	mes "�W�܂�Ƃ���֍s���܂��B";
	mes "�����Ǝo��Ƃ�";
	mes "�܂�������������ł��傤�ˁB";
	mes "�����`���Ă��������B";
	next;
	mes "[�\�n]";
	mes "���낻�돵����@�̌��͂�";
	mes "�؂ꂻ���ł��ˁB";
	mes "�ł͎��炵�܂��c�c�B";
	close2;
	cutin "soul_van02.bmp", 255;
	warp "payon.gat", 238, 291;
	end;
OnStart:
	initnpctimer;
	hideonnpc getmdnpcname("#soul04");	// 74332
	hideoffnpc getmdnpcname("�\�n#soul05");	// 9668
	unittalk getnpcid(0,getmdnpcname("�\�n#soul05")),"�\�n : �����c�c���̒ʘH�Ɋ��S�Ȏp�ł�����̂́A���񂪏��߂Ăł��B";	// 9668
	end;
OnTimer3000:
	announce "�n���j�� : �\�n�A�{���Ƀ\�n����ˁH", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer6000:
	unittalk getnpcid(0,"�\�n#soul05"),"�\�n : �͂��A�o��B�����׈��ȋC�z�͎c���ĂȂ��悤�ł��B����ň��S���Đ����ł��܂��B";	// 9668
	end;
OnTimer9000:
	announce "�n���j�� : ���������Ă�́H�@�\�n!!", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer12000:
	unittalk getnpcid(0,"�\�n#soul05"),"�\�n : �o��͂������̂͂��ł��B���ł�10�N�ȏ���o��̍��Ɠ��������g�̂Ȃ�ł���B������߂����Ƃ���Œ����͐������܂���B";	// 9668
	end;
OnTimer15000:
	announce "�n���j�� : �\�n�I�@����Ȃ��ƌ���Ȃ��ŁI�@�c�c�˂��H�@�����Ă�H", 0x9, 0xffcc00, 0x0190, 18, 0, 0;
	end;
OnTimer18000:
	set 'flag,1;
	stopnpctimer;
	unittalk getnpcid(0,"�\�n#soul05"),"�\�n : �o��ɂ͂�����̐����������Ȃ��Ȃ��Ă����悤�ł��ˁB���̂����A�l�Ə����b���܂��傤�B";	// 9668
	end;
OnInit:
	hideonnpc;
	end;
}
