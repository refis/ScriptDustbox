un_myst.gat,163,38,5	script	�}�[�N�C�V��	616,{/* 59723 */
	mes "[�}�[�N�C�V��]";
	mes "���̔��͍��܂łƈ����";
	mes "���炩�ɂ����瑤����";
	mes "�ǂ������Ղ�����܂��ˁc�c�B";
	cutin "bu_mark4",0;
	next;
	cutin "bu_mark1",0;
	mes "[�}�[�N�C�V��]";
	mes "�ǂ����܂��傤�B";
	mes "�����J���Ē��ɓ���܂����H";
	next;
	if(checkquest(11380) || checkquest(11379)) {
		mes "[�}�[�N�C�V��]";
		mes "�܂����Ă���悤�ł��ˁB";
		mes "�����Ƌx��Ō��C�ɂȂ�����";
		mes "���𒲂ׂɂ����܂��傤�B";
		cutin "bu_mark1.bmp", 0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "���������΃^�}������";
		mes "�N�����@���č�����Ǝv����";
		mes "�o���������܂����B";
		mes "������ʂ�ΊO�ɏo��ꂻ���ł���B";
		next;
		if(select("�O�ɏo����","�~�߂Ă���") == 2) {
			cutin "bu_mark2.bmp", 0;
			mes "[�}�[�N�C�V��]";
			mes "�����ł����B";
			mes "�O�ɏo��������";
			mes "���ł����������ĉ������ˁB";
			close2;
			cutin "bu_mark2.bmp", 255;
			end;
		}
		cutin "bu_mark2.bmp", 0;
		mes "[�}�[�N�C�V��]";
		mes "���Ȃ�Â��̂ŋC������";
		mes "�i��ł��������ˁB";
		close2;
		cutin "bu_mark2.bmp", 255;
		warp "verus01.gat",115,190;
		end;
	}
	if(getonlinepartymember() < 1) {
		mes "[�}�[�N�C�V��]";
		mes "�p�[�e�B�[��g���";
		mes "���Ȃ��悤�ł��ˁB";
		mes "�c�c���ȗ\�������܂�����A";
		mes "�K���p�[�e�B�[��g��ł���";
		mes "���ɓ����Ă��������B";
		close2;
		cutin "bu_mark1",255;
		end;
	}
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	switch(select("�����J����","���ɓ���","��߂�","�O�ɏo����")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�p�[�e�B�[���F" +'@party$;
			mes "�p�[�e�B�[���[�_�[���F" +'@leader$;
			mes "^0000fflast_room ^000000-�\�񎸔s";
			close2;
			cutin "bu_mark1",255;
			end;
		}
		mdcreate "last_room";
		mes "[�}�[�N�C�V��]";
		mes "����ł͔����J���܂��B";
		mes "���S�ɊJ������";
		mes "���ɓ����Ă��������B";
		close2;
		cutin "bu_mark1",255;
		end;
	case 2:
		switch(mdenter("last_room")) {
		case 0:	// �G���[�Ȃ�
			//setquest 11380;
			announce "�������A���_���W����[last_room] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			setquest 11379;
			donpcevent getmdnpcname("LastRoomManager1")+ "::OnStart";
			cutin "bu_mark1",255;
			//warp "1@uns.gat",144,36;
			end;
		case 1:	// �p�[�e�B�[������
			mes "[�}�[�N�C�V��]";
			mes "�p�[�e�B�[��g���";
			mes "���Ȃ��悤�ł��ˁB";
			mes "�c�c���ȗ\�������܂�����A";
			mes "�K���p�[�e�B�[��g��ł���";
			mes "���ɓ����Ă��������B";
			close2;
			cutin "bu_mark1",255;
			end;
		case 2:	// �_���W�������쐬
			mes "[�}�[�N�C�V��]";
			mes "�p�[�e�B�[���[�_�[��";
			mes "�����J���Ă��Ȃ��悤�ł��ˁB";
			mes "���[�_�[�̕����悸�A";
			mes "�����J���Ă��������B";
			close2;
			cutin "bu_mark1",255;
			end;
		default:	// ���̑��G���[
			close;
		}
	case 3:
		cutin "bu_mark4",0;
		mes "[�}�[�N�C�V��]";
		mes "�����ł��ˁB";
		mes "�����N���邩�킩��܂���";
		mes "�Ó��ȑI�����Ǝv���܂��B";
		mes "���������܂ɂ͂���ȕ��ɁA";
		mes "���[�_�[�炵���������l����";
		mes "�������ė~�������̂ł��c�c�B";
		close2;
		cutin "bu_mark4",255;
		end;
	case 4:
		cutin "bu_mark2",0;
		mes "[�}�[�N�C�V��]";
		mes "���������΃^�}������";
		mes "�N�����@���č�����Ǝv����";
		mes "�o������������ł��B";
		mes "��������O�ɏo����Ǝv���܂���";
		mes "���Ȃ�Â��̂ŋC������";
		mes "�i��ł��������ˁB";
		close2;
		cutin "bu_mark2",255;
		warp "verus01.gat",115,190;
		end;
	}
}

1@uns.gat,1,1,0	script	LastRoomManager1	139,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("#lrdoor4");
	hideonnpc getmdnpcname("�^�}����#room2");

	hideonnpc getmdnpcname("�x���e�B#room4");	// 62749
	hideonnpc getmdnpcname("�^�}����#room4");	// 54343
	hideonnpc getmdnpcname("�e���[���A��#room4");	// 80038
	hideonnpc getmdnpcname("�}�[�N�C�V��#room4");	// 50139
	hideonnpc getmdnpcname("�}�M�X�e�B��#room4");	// 68880
	hideonnpc getmdnpcname("�A���v�I�J�[�g#room4");	// 82489

	hideonnpc getmdnpcname("�V�X�e�����b�Z�[�W#batt");	// 62749
	hideonnpc getmdnpcname("�x���e�B#battle1");	// 62749
	end;
}

1@uns.gat,143,36,3	script	�x���e�B#room1	10078,{/* 60061 (hide)*/
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		close;
	}
	mes "[�x���e�B]";
	mes "�����c�c";
	mes "�}�ɋC�����������c�c�B";
	cutin "EP15_2_brt_6.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room1")),"�x���e�B : �����c�c�}�ɋC�����������c�c�B";	// 33403
	next;
	mes "[�x���e�B]";
	mes "�����c�c";
	mes "�����c�c�����I";
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room1")),"�x���e�B : �����c�c�����c�c�����I";	// 33403
	next;
	mes "[�x���e�B]";
	mes "�������c�c�B";
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room1")),"�x���e�B : �������c�c�B";	// 33403
	next;
	mes "[�e���[���A��]";
	mes "������Ƃ��o����I";
	mes "���v��!?";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�e���[���A��#room1")),"�e���[���A�� : ������Ƃ��o����I�@���v��!?";	// 40672
	next;
	mes "[�x���e�B]";
	mes "�c�c�J�G�c�c��Ȃ���B";
	cutin "EP15_2_brt_7.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room1")),"�x���e�B : �c�c�J�G�c�c��Ȃ���B";	// 33403
	next;
	mes "[�^�}����]";
	mes "�x���e�B����I";
	mes "���v�ł���!?";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�^�}����#room1")),"�^�}���� : �x���e�B����I�@���v�ł���!?";	// 21872
	next;
	mes "[�x���e�B]";
	mes "�����c�c�x�܂��Ă����H";
	cutin "EP15_2_brt_6.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room1")),"�x���e�B : �����c�c�x�܂��Ă����H";	// 33403
	next;
	mes "[�e���[���A��]";
	mes "�ǂ���炨�o�����";
	mes "�߂����ق����ǂ��������ȁB";
	cutin "bu_du1.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�e���[���A��#room1")),"�e���[���A�� : �ǂ���炨�o����͖߂����ق����ǂ��������ȁB";	// 40672
	next;
	mes "[�x���e�B]";
	mes "�����c�c";
	mes "���������ɒǂ��������B";
	mes "�C�ɂ�����ɐi��Œ��ՁB";
	cutin "EP15_2_brt_4.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room1")),"�x���e�B : �����c�c���������ɒǂ��������B�C�ɂ�����ɐi��Œ��ՁB";	// 33403
	next;
	mes "[�^�}����]";
	mes "����ł͎����t���Y���܂��B";
	mes "�e���[���A���B�͋C�ɂ���";
	mes "��ɐi��ł��������B";
	cutin "ep143_taang.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�^�}����#room1")),"�^�}���� : ����ł͎����t���Y���܂��B�e���[���A���B�͋C�ɂ�����ɐi��ł��������B";	// 21872
	donpcevent getmdnpcname("#lrdoor2")+"::OnStart";
	close2;
	cutin "ep143_taang.bmp", 255;
	end;
}
1@uns.gat,142,38,5	script	�e���[���A��#room1	628,{/* 60062 (hide)*/
	mes "[�e���[���A��]";
	mes "�������c�c";
	mes "�Ȃ񂾂�����!?";
	mes "���̔閧���Ђ��g���Ă���";
	mes "�n���̃A�W�g�Ȃ̂�!?";
	cutin "bu_du5.bmp", 2;
	close2;
	cutin "bu_du5.bmp", 255;
	end;
}
1@uns.gat,145,37,3	script	�^�}����#room1	10027,{/* 60063 (hide)*/
	mes "[�^�}����]";
	mes "�x���e�B����A���v�ł����H";
	mes "�ޏ��͎������Ă��܂�����A";
	mes "�F����́A��ɐi��ł��������B";
	cutin "ep143_taang.bmp", 2;
	close2;
	cutin "ep143_taang.bmp", 255;
	end;
}
1@uns.gat,139,41,3	script	�}�[�N�C�V��#room1	616,{/* 60064 */
	mes "[�}�[�N�C�V��]";
	mes "�����́c�c���Ȋ���������B";
	mes "�݂�ȁI�@�C��t���Đi�����I";
	cutin "bu_mark4.bmp", 0;
	close2;
	cutin "bu_mark4.bmp", 255;
	end;
}
1@uns.gat,142,39,5	script	�}�M�X�e�B��#room1	612,{/* 60065 */
	mes "[�}�M�X�e�B��]";
	mes "�Ȃ��ł��傤�c�c�B";
	mes "�����������ɂ���ƁA";
	mes "���������̐��E�ɓƂ�̂悤��";
	mes "�C���ɂȂ�܂��c�c�B";
	cutin "bu_maggi4.bmp", 2;
	close2;
	cutin "bu_maggi4.bmp", 255;
	end;
}
1@uns.gat,145,32,5	script	�A���v�I�J�[�g#room1	615,{/* 60066 (hide)*/
	mes "[�A���v�I�J�[�g]";
	mes "�����炱����ɉ��������Ղ�����B";
	mes "�����d���@�B���ʂ����悤�ȁc�c�B";
	cutin "bu_alp1.bmp", 2;
	close2;
	cutin "bu_alp1.bmp", 255;
	end;
}
1@uns.gat,141,49,0	script	#lrdoor1	139,5,5,{/* 60067 */
	misceffect 52,""; //self
	pushpc 0, 2;
	end;
}
1@uns.gat,140,45,0	script	#lrdoor2	139,{/* 60068 (hide)*/
OnStart:
	initnpctimer;
	announce "�V�X�e�����b�Z�[�W : �x���A�x���B", 0x9, 0xff0000;
	hideonnpc getmdnpcname("�x���e�B#room1");	// 33403
	hideonnpc getmdnpcname("�e���[���A��#room1");	// 40672
	hideonnpc getmdnpcname("�^�}����#room1");	// 21872
	hideonnpc getmdnpcname("�}�[�N�C�V��#room1");	// 60021
	hideonnpc getmdnpcname("�}�M�X�e�B��#room1");	// 83656
	hideonnpc getmdnpcname("�A���v�I�J�[�g#room1");	// 59533
	hideonnpc;
	end;
OnTimer2000:
	announce "�V�X�e�����b�Z�[�W : ��1���ɐN���҂��m�F�B�����ɑދ����Ă��������B", 0x9, 0xff0000;
	end;
OnTimer4000:
	announce "�V�X�e�����b�Z�[�W : �x���̖������m�F�B�N���҂͓G�����݂Ɣ��f�B", 0x9, 0xff0000;
	end;
OnTimer6000:
	announce "�V�X�e�����b�Z�[�W : �����h�q�V�X�e���N���B", 0x9, 0xff0000;
	end;
OnTimer8000:
	announce "�V�X�e�����b�Z�[�W : �V�X�e���N�������A�I�[���O���[���B", 0x9, 0xff0000;
	end;
OnTimer10000:
	announce "�V�X�e�����b�Z�[�W : ���������A�N���҂̔r�����J�n�B", 0x9, 0xff0000;
	areamonster getmdmapname("1@uns.gat"),30,33,70,73,"�V�X�e�����b�Z�[�W1",3253,1,getmdnpcname("#lrdoor2")+"::OnKilled";
	callsub L_MobCall;
	hideonnpc getmdnpcname("#lrdoor1");	// 48900
	end;
OnTimer310000:
	announce "�V�X�e�����b�Z�[�W : �N���҂�r�����܂��B", 0x9, 0xff0000;
	callsub L_MobCall;
	end;
OnTimer610000:
	stopnpctimer;
	announce "�V�X�e�����b�Z�[�W : �N���҂�r�����܂��B", 0x9, 0xff0000;
	callsub L_MobCall;
	end;
L_MobCall:
	set '@map$,getmdmapname("1@uns.gat");
	set '@label$,getmdnpcname("#lrdoor2")+"::OnKilled";
	areamonster '@map$,125,44,145, 64,"�@�B���i",3251,3,'@label$;
	areamonster '@map$,117,50,137, 70,"�@�B���i",3251,3,'@label$;
	areamonster '@map$, 77,59, 97, 79,"�@�B���i",3251,3,'@label$;
	areamonster '@map$, 53,86, 73,106,"�@�B���i",3251,3,'@label$;
	areamonster '@map$,125,44,145, 64,"�@�B���i",3252,3,'@label$;
	areamonster '@map$,117,50,137, 70,"�@�B���i",3252,3,'@label$;
	areamonster '@map$, 77,59, 97, 79,"�@�B���i",3252,3,'@label$;
	areamonster '@map$, 53,86, 73,106,"�@�B���i",3252,3,'@label$;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@uns.gat"),getmdnpcname("#lrdoor2")+ "::OnKilled");
	if('@count <= 0) {
		stopnpctimer;
		announce "�V�X�e�����b�Z�[�W : �����h�q�V�X�e���ɏ�Q�����B�z�b�g�X�^���o�C�ɂ��ҋ@�V�X�e���ɏ������ڍs���܂��B", 0x9, 0xff0000;
		hideoffnpc getmdnpcname("�^�}����#room2");	// 21872
	}
	end;
}
1@uns.gat,87,129,3	script	�^�}����#room2	10027,{/* 90150 (hide)*/
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		close;
	}
	mes "[�^�}����]";
	mes "�͂��c�c�͂��c�c�B";
	mes "�x���e�B���񂪁c�c";
	mes "�����Ȃ�c�c";
	mes "�����Ƃ��o���Ȃ�����";
	mes "�͂��Ȃ̂Ɂc�c�B";
	cutin "ep143_tahuk.bmp", 2;
	unittalk "�^�}���� : �͂��c�c�͂��c�c�B�x���e�B���񂪁c�c�����Ȃ�c�c�����Ƃ��o���Ȃ������͂��Ȃ̂Ɂc�c�B";	// 21390
	next;
	mes "[�^�}����]";
	mes "�ǂ��������Ȃ����炢�c�c";
	mes "�����āc�c�͂��͂��c�c�B";
	unittalk "�^�}���� : �ǂ��������Ȃ����炢�����āc�c�͂��͂��c�c�B";	// 21390
	next;
	announce "�V�X�e�����b�Z�[�W : ���̕s���̕��̂���1������2���Ɉړ����B", 0x9, 0xff0000;
	mes "[�^�}����]";
	mes "�܂����x���e�B����";
	mes "�����������܂Łc�c�B";
	unittalk "�^�}���� : �܂����x���e�B���񂪂����������܂Łc�c�B";	// 21390
	next;
	announce "�V�X�e�����b�Z�[�W : �ً}�v���g�R�������s���܂��B", 0x9, 0xff0000;
	mes "[�^�}����]";
	mes "�����x���e�B�����";
	mes "�T���ɍs���Ȃ��Ɓc�c�I";
	unittalk "�^�}���� : �����x���e�B�����T���ɍs���Ȃ��Ɓc�c�I";	// 21390
	next;
	mes "[�^�}����]";
	mes "���͈�{���ł�����";
	mes "�����s���Ă݂܂��傤�I";
	unittalk "�^�}���� : ���͈�{���ł����瑁���s���Ă݂܂��傤�I";	// 21390
	close2;
	if('flag == 0) {
		set 'flag,1;
		misceffect 35,getmdnpcname("#lrdoor4");	// 22338
		hideoffnpc getmdnpcname("#lrdoor4");	// 22338
	}
	cutin "ep143_tahuk.bmp", 255;
	end;
}
1@uns.gat,100,121,0	warp	#lrdoor4	2,2,1@uns.gat,145,107

1@uns.gat,157,94,0	script	#lrboom1	550,2,2,{/* 45212 */
	end;
OnTouch:
	set '@num,substr(strnpcinfo(2),6);
	areamonster getmdmapname("1@uns.gat"),178,34,198,54,"�@�B���i",(3251 + (('@num-1) % 2)), 3;
	announce "�V�X�e�����b�Z�[�W : ��2���ŐN���҂��m�F�B�r�����܂��B", 0x9, 0xff0000;
	hideonnpc;
	end;
}
1@uns.gat,164,97,0	duplicate(#lrboom1)	#lrboom2	550,2,2
1@uns.gat,166,92,0	duplicate(#lrboom1)	#lrboom3	550,2,2
1@uns.gat,170,96,0	duplicate(#lrboom1)	#lrboom4	550,2,2
1@uns.gat,175,93,0	duplicate(#lrboom1)	#lrboom5	550,2,2
1@uns.gat,190,97,0	duplicate(#lrboom1)	#lrboom6	550,2,2
1@uns.gat,194,94,0	duplicate(#lrboom1)	#lrboom7	550,2,2
1@uns.gat,199,96,0	duplicate(#lrboom1)	#lrboom8	550,2,2
1@uns.gat,206,93,0	duplicate(#lrboom1)	#lrboom9	550,2,2
1@uns.gat,217,91,0	duplicate(#lrboom1)	#lrboom10	550,2,2
1@uns.gat,224,79,0	duplicate(#lrboom1)	#lrboom11	550,2,2
1@uns.gat,227,73,0	duplicate(#lrboom1)	#lrboom12	550,2,2
1@uns.gat,227,69,0	duplicate(#lrboom1)	#lrboom13	550,2,2
1@uns.gat,220,63,0	duplicate(#lrboom1)	#lrboom14	550,2,2
1@uns.gat,201,60,0	duplicate(#lrboom1)	#lrboom15	550,2,2

1@uns.gat,224,29,3	script	�x���e�B#room2	10078,{/* 62636 */
	mes "[�x���e�B]";
	mes "���c�c�����́c�c";
	mes "�Ȃ��c�c���������ɁH";
	cutin "EP15_2_brt_6.bmp", 2;
	next;
	mes "[�x���e�B]";
	mes "�����c�c�����c�c";
	mes "���ꂻ���Ɂc�c";
	mes "���̔��̉�����c�c";
	mes "�����c�c�����c�c�B";
	next;
	if(select("��������","���ɐi��") == 1) {
		mes "[�x���e�B]";
		mes "�J�G�c�c�J�G��Ȃ��Ɓc�c�B";
		cutin "EP15_2_brt_7.bmp", 2;
		close2;
		cutin "EP15_2_brt_7.bmp", 255;
		end;
	}
	mes "[�x���e�B]";
	mes "�����c�c�J�G��Ȃ��Ɓc�c�B";
	cutin "EP15_2_brt_7.bmp", 2;
	close2;
	cutin "EP15_2_brt_7.bmp", 255;
	warp getmdmapname("1@uns.gat"),240,255;
	end;
}

1@uns.gat,242,253,3	script	�x���e�B#room3	10078,{/* 77388 */
	mes "[�x���e�B]";
	mes "����Ɓc�c�A���Ă����c�c�B";
	mes "�{���ɂ���Ɓc�c�B";
	cutin "EP15_2_brt_7.bmp", 2;
	close2;
	hideonnpc getmdnpcname("�x���e�B#room3");	// 77388
	donpcevent getmdnpcname("#bosslr")+"::OnStart";	// 77388
	cutin "EP15_2_brt_7.bmp", 255;
	end;
}

1@uns.gat,1,1,0	script	#bosslr	139,{
	end;
OnStart:
	sleep 2000;
	announce "�V�X�e�����b�Z�[�W : �}�U�[���[���ŐN���҂��m�F�B", 0x9, 0xff0000;
	sleep 2000;
	announce "�V�X�e�����b�Z�[�W : �S�V�X�e���̃v���C�I���e�B�������ύX�B", 0x9, 0xff0000;
	sleep 2000;
	announce "�V�X�e�����b�Z�[�W : �N���҂̔r�����ŗD�掖���ɐݒ�B�S�V�X�e���퓬���[�h�Ɉڍs���܂��B", 0x9, 0xff0000;
	hideoffnpc getmdnpcname(getmdnpcname("�x���e�B#battle1"));	// 47199
	areamonster getmdmapname("1@uns.gat"),225,250,265,280,"�V�X�e�����b�Z�[�W2",3493,5,getmdnpcname("#bosslr")+"::OnKilled";
	sleep 2000;
	announce "�V�X�e�����b�Z�[�W : �c�c����邽�߂̃v���Z�X�����s�B��֌W�҂͑��₩�ɑޔ����Ă��������B", 0x9, 0xff0000;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@uns.gat"),getmdnpcname("#bosslr")+ "::OnKilled") + 1;
	if(rand('@count) == 0) {
		initnpctimer;
		killmonster getmdmapname("1@uns.gat"),getmdnpcname("#bosslr")+"::OnKilled";
		hideoffnpc getmdnpcname("�V�X�e�����b�Z�[�W#batt");	// 98902
	}
	end;
OnKilled2:
	end;
OnTimer1000:
	announce "�V�X�e�����b�Z�[�W : �h�q�V�X�e���ɃG���[�����B", 0x9, 0xff0000;
	unittalk getnpcid(0,getmdnpcname("�V�X�e�����b�Z�[�W#batt")),"�V�X�e�����b�Z�[�W : �h�q�V�X�e���ɃG���[�����B";	// 98902
	end;
OnTimer6000:
	unittalk getnpcid(0,getmdnpcname("�x���e�B#battle1")),"�x���e�B : �c�c�B";	// 47199
	end;
OnTimer8000:
	unittalk getnpcid(0,getmdnpcname("�x���e�B#battle1")),"�x���e�B : �r���c�c�B����c�c�ύX�B";	// 47199
	misceffect 432,getmdnpcname("�x���e�B#battle1");	// 47199
	end;
OnTimer9000:
	misceffect 452,getmdnpcname("�x���e�B#battle1");	// 47199
	end;
OnTimer10000:
	misceffect 257,getmdnpcname("�x���e�B#battle1");	// 47199
	end;
OnTimer10500:
	misceffect 30,getmdnpcname("�x���e�B#battle1");	// 47199
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�x���e�B#battle1")),"�x���e�B : �c�c����c�c�m�F�B";	// 47199
	end;
OnTimer18000:
	unittalk getnpcid(0,getmdnpcname("�x���e�B#battle1")),"�x���e�B : �V�X�e�����b�Z�[�W1�ɂ��⏕�V�X�e���\���c�c�\�z�����B";	// 47199
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�x���e�B#battle1")),"�x���e�B : ��ړI���o�͕⏕�ɐݒ�c�c�N���m�F�B";	// 47199
	end;
OnTimer28000:
	announce "�V�X�e�����b�Z�[�W : T_W_O_002b�ɂ�鐧����m�F�B�N���҂̔r�����ĊJ�B", 0x9, 0xff0000;
	misceffect 514,getmdnpcname("�x���e�B#battle1");	// 47199
	misceffect 94,getmdnpcname("�x���e�B#battle1");	// 47199
	end;
OnTimer31000:
	misceffect 8,getmdnpcname("�x���e�B#battle1");	// 47199
	misceffect 263,getmdnpcname("�x���e�B#battle1");	// 47199
	end;
OnTimer32000:
	misceffect 220,getmdnpcname("�x���e�B#battle1");	// 47199
	end;
OnTimer33000:
	hideonnpc getmdnpcname("�x���e�B#battle1");	// 47199
	hideonnpc getmdnpcname("�V�X�e�����b�Z�[�W#batt");	// 98902
	monster getmdmapname("1@uns.gat"),245,265,"T_W_O#002b",3254,1,getmdnpcname("#bosslr")+"::OnBossKilled";
	areamonster getmdmapname("1@uns.gat"),225,250,265,280,"�V�X�e�����b�Z�[�W1#2",3253,4,getmdnpcname("#bosslr")+"::OnKilled2";
	end;
OnTimer35000:
	announce "�e���[���A�� : �}�ɂǂ������܂����񂾂您�o����I�@�������c�c�����͂��I", 0x9, 0x00ff00;
	end;
OnTimer40000:
	announce "�^�}���� : ���̃V�X�e�����b�Z�[�W1�ƌĂ�ł������́c�c���ꂪ�G�l���M�[���������Ă���悤�ł��ˁB", 0x9, 0x00ff00;
	end;
OnTimer45000:
	stopnpctimer;
	announce "�^�}���� : �V�X�e�����b�Z�[�W1��|���΁A�͂𗎂Ƃ��邩���m��܂���I", 0x9, 0x00ff00;
	end;
OnBossKilled:
	stopnpctimer;
	killmonster getmdmapname("1@uns.gat"),getmdnpcname("#bosslr")+"::OnKilled2";
	announce "�V�X�e�����b�Z�[�W : �N���҂̔r���Ɏ��s�B�n������s���܂��B", 0x9, 0xff0000;
	hideoffnpc getmdnpcname("�x���e�B#room4");	// 62749
	hideoffnpc getmdnpcname("�^�}����#room4");	// 54343
	hideoffnpc getmdnpcname("�e���[���A��#room4");	// 80038
	hideoffnpc getmdnpcname("�}�[�N�C�V��#room4");	// 50139
	hideoffnpc getmdnpcname("�}�M�X�e�B��#room4");	// 68880
	hideoffnpc getmdnpcname("�A���v�I�J�[�g#room4");	// 82489
	end;
}

1@uns.gat,246,266,3	script	�V�X�e�����b�Z�[�W#batt	3253,{/* 98902 (hide)*/}
1@uns.gat,245,265,3	script	�x���e�B#battle1	10078,{/* 47199 (hide)*/
	emotion 9;
	end;
}

1@uns.gat,242,253,3	script	�x���e�B#room4	10078,{/* 62749 (hide)*/
	mes "[�e���[���A��]";
	mes "�o����I";
	mes "�}�ɂǂ������񂾁I";
	mes "���v��!?";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�e���[���A��#room4")),"�e���[���A�� :  �o����I�@�}�ɂǂ������񂾁I�@���v��!?";	// 80038
	next;
	mes "[�^�}����]";
	mes "�x���e�B����I";
	mes "�������肵�ĉ������I";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�^�}����#room4")),"�^�}���� : �x���e�B����I�@�������肵�ĉ������I";	// 54343
	next;
	mes "[�}�[�N�C�V��]";
	mes "�݂�Ȃǂ��āI";
	mes "�����ЂƂ܂��q�[�����I";
	cutin "bu_mark4.bmp", 0;
	unittalk getnpcid(0,getmdnpcname("�}�[�N�C�V��#room4")),"�}�[�N�C�V�� : �݂�Ȃǂ��āI�@�����ЂƂ܂��q�[�����I";	// 50139
	next;
	mes "[�x���e�B]";
	mes "��A������ˁc�c�B";
	cutin "EP15_2_brt_4.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room4")),"�x���e�B : ��A������ˁc�c�B";	// 62749
	next;
	mes "[�x���e�B]";
	mes "���āc�c����c�c";
	mes "���Ȃ��B�A�ǂ��������́H";
	mes "�[���Ȋ�����āB";
	cutin "EP15_2_brt_5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room4")),"�x���e�B : ���āc�c����c�c���Ȃ��B�A�ǂ��������́H�@�[���Ȋ�����āB";	// 62749
	next;
	mes "[�e���[���A��]";
	mes "�Ȃɂ����Ă�񂾁A�o����I";
	mes "�ǂ�������!?�́A";
	mes "�������̑䎌����!?";
	cutin "bu_du3.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�e���[���A��#room4")),"�e���[���A�� : �Ȃɂ����Ă�񂾁A�o����I�@�ǂ�������!?�́A�������̑䎌����!?";	// 80038
	next;
	mes "[�x���e�B]";
	mes "�c�c�ǂ��������ƁH";
	cutin "EP15_2_brt_5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room4")),"�x���e�B : �c�c�ǂ��������ƁH";	// 62749
	next;
	mes "[�x���e�B]";
	mes "���������΁c�c";
	mes "�����͂ǂ��Ȃ́H ";
	cutin "EP15_2_brt_3.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room4")),"�x���e�B : ���������΁c�c�����͂ǂ��Ȃ́H";	// 62749
	next;
	mes "[�^�}����]";
	mes "�x���e�B����A�{���ɉ���";
	mes "�o���Ă��܂��񂩁H";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�^�}����#room4")),"�^�}���� : �x���e�B����A�{���ɉ����o���Ă��܂��񂩁H";	// 54343
	next;
	mes "[�x���e�B]";
	mes "�����ˁc�c�B";
	mes "�n���ɍ~��Ă���";
	mes "�����j�􂵂����Ȃ��炢";
	mes "�ɂ��������ǁc�c�B";
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room4")),"�x���e�B : �����ˁc�c�B�n���ɍ~��Ă��瓪���j�􂵂����Ȃ��炢�ɂ��������ǁc�c�B";	// 62749
	cutin "EP15_2_brt_3.bmp", 2;
	next;
	mes "[�x���e�B]";
	mes "����ȍ~�͊o���ĂȂ���ˁc�c�B";
	unittalk getnpcid(0,getmdnpcname("�x���e�B#room4")),"�x���e�B : ����ȍ~�͊o���ĂȂ���ˁc�c�B";	// 62749
	cutin "EP15_2_brt_5.bmp", 2;
	next;
	mes "[�e���[���A��]";
	mes "���ꂶ�Ⴀ������";
	mes "���������P���Ă����̂́c�c�H";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�e���[���A��#room4")),"�e���[���A�� : ���ꂶ�Ⴀ���������������P���Ă����̂́c�c�H";	// 80038
	next;
	mes "[�A���v�I�J�[�g]";
	mes "�����A���͗I���ɘb�����Ă���";
	mes "���Ԃ͂Ȃ����������B";
	cutin "bu_alp3.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�A���v�I�J�[�g#room4")),"�A���v�I�J�[�g : �����A���͗I���ɘb�����Ă��鎞�Ԃ͂Ȃ����������B";	// 82489
	next;
	mes "[�e���[���A��]";
	mes "���������ȁI";
	mes "�������̂͐�΁c�c�B";
	cutin "bu_du5.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�e���[���A��#room4")),"�e���[���A�� : ���������ȁI�@�������̂͐�΁c�c�B";	// 80038
	next;
	mes "[�A���v�I�J�[�g]";
	mes "�c�c���̉����������Ȃ����H";
	mes "�����������Ɍ������Ă���B";
	cutin "bu_alp1.bmp", 2;
	soundeffect "lava_golem_attack.wav", 0, 0;	// 62749
	unittalk getnpcid(0,getmdnpcname("�A���v�I�J�[�g#room4")),"�A���v�I�J�[�g : �c�c���̉����������Ȃ����H�@�����������Ɍ������Ă���B";	// 82489
	next;
	mes "[�^�}����]";
	mes "���������Βn�ʂ�����";
	mes "�h��Ă��銴�������܂��񂩁H";
	cutin "ep143_tahuk.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�^�}����#room4")),"�^�}���� : ���������Βn�ʂ������h��Ă��銴�������܂��񂩁H";	// 54343
	next;
	mes "[�}�M�X�e�B��]";
	mes "�ǂ�ǂ�h�ꂪ����";
	mes "�Ȃ��Ă��܂��c�c�I";
	misceffect 522,"";	// self
	cutin "bu_maggi4.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�}�M�X�e�B��#room4")),"�}�M�X�e�B�� : �ǂ�ǂ�h�ꂪ�����Ȃ��Ă��܂��c�c�I";	// 68880
	next;
	mes "[�A���v�I�J�[�g]";
	mes "�����͊댯���B";
	mes "�����ɒE�o���������ǂ��B";
	mes "�������炵�����̂͌����Ă������B";
	cutin "bu_alp2.bmp", 2;
	unittalk getnpcid(0,getmdnpcname("�A���v�I�J�[�g#room4")),"�A���v�I�J�[�g : �����͊댯���B�����ɒE�o���������ǂ��B�������炵�����̂͌����Ă������B";	// 82489
	next;
	mes "[�}�[�N�C�V��]";
	mes "��A�킩�����I";
	mes "���B�͌ォ��s���܂�����A�x���e�B�����";
	mes "��Ɉꏏ�ɒE�o���Ă��������I";
	cutin "bu_mark4.bmp", 0;
	unittalk getnpcid(0,getmdnpcname("�}�[�N�C�V��#room4")),"�}�[�N�C�V�� : ��A�킩�����I�@���B�͌ォ��s���܂�����A�x���e�B����Ɛ�Ɉꏏ�ɒE�o���Ă��������I";	// 50139
	next;
	menu "��������o��",-;
	cutin "bu_mark4.bmp", 255;
	warp "verus01.gat",122,187;
	close;
}
1@uns.gat,236,258,1	script	�A���v�I�J�[�g#room4	615,{/* 82489 (hide)*/
	mes "[�A���v�I�J�[�g]";
	mes "���S����ɂ͂܂������c�c�B";
	mes "���͔O�̂��߁A�E�o���𒲂ׂĂ����B";
	cutin "bu_alp1.bmp", 2;
	close2;
	cutin "bu_alp1.bmp", 255;
	end;
}
1@uns.gat,244,257,3	script	�^�}����#room4	10027,{/* 54343 (hide)*/
	mes "[�^�}����]";
	mes "�x���e�B����I";
	mes "�������肵�ĉ������I";
	cutin "ep143_tahuk.bmp", 2;
	close2;
	cutin "ep143_tahuk.bmp", 255;
	end;
}
1@uns.gat,245,254,3	script	�}�M�X�e�B��#room4	612,{/* 68880 (hide)*/
	mes "[�}�M�X�e�B��]";
	mes "�x���e�B����c�c";
	mes "���v�ł����H";
	cutin "bu_maggi4.bmp", 2;
	close2;
	cutin "bu_maggi4.bmp", 255;
	end;
}
1@uns.gat,244,254,3	script	�e���[���A��#room4	628,{/* 80038 (hide)*/
	mes "[�e���[���A��]";
	mes "�o����I";
	mes "�}�ɂǂ������񂾁I";
	mes "���v��!?";
	cutin "bu_du5.bmp", 2;
	close2;
	cutin "bu_du5.bmp", 255;
	end;
}
1@uns.gat,242,255,5	script	�}�[�N�C�V��#room4	616,{/* 50139 (hide)*/
	mes "[�}�[�N�C�V��]";
	mes "�݂�Ȃǂ��āI";
	mes "�����ЂƂ܂��q�[�����I";
	cutin "bu_mark4.bmp", 0;
	close2;
	cutin "bu_mark4.bmp", 255;
	end;
}
