1@iwp.gat,0,0,0	script	FirstPatrolControl1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;

	hideonnpc getmdnpcname("�㓙����������#set01");
	hideonnpc getmdnpcname("�V���{����#set01");
	hideonnpc getmdnpcname("�񓙕�������#set01");
	hideonnpc getmdnpcname("�ꓙ���z������#set01");
	hideonnpc getmdnpcname("�㓙����������#set02");
	hideonnpc getmdnpcname("�V���|������#set02");
	hideonnpc getmdnpcname("�񓙕��g����#set02");
	hideonnpc getmdnpcname("�ꓙ���|������#set02");
	hideonnpc getmdnpcname("��̐N#dlunch");
	hideonnpc getmdnpcname("cp_4");
	hideonnpc getmdnpcname("cp_5");
	hideonnpc getmdnpcname("�p�g���[������#ediwp");
	donpcevent getmdnpcname("�p�g���[������#stiwp")+ "::OnStart";
	end;
}

1@iwp.gat,375,229,4	script	�p�g���[������#stiwp	21518,{/* 54584 */
	mes "[�p�g���[������]";
	mes "�N�͏��߂Ẵp�g���[���������ȁH";
	mes "�y���������邱�Ƃɂ��悤�B";
	next;
	mes "[�p�g���[������]";
	mes "�䂪��������";
	mes "�C�[�O���p�g���[�����������ƎU���c�c";
	mes "�������ق�I";
	mes "�p�g���[�������Ă���΂����B";
	next;
	mes "[�p�g���[������]";
	mes "�v���t�F�b�V���i���ȃp�g���[����";
	mes "�䂪�����������s����";
	mes "�ڂ��������񂠂�������S������ȁB";
	next;
	mes "[�p�g���[������]";
	mes "�ł͏o���I";
	donpcevent getmdnpcname("FirstPatrolControl2")+ "::OnStart";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 54584
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}

1@iwp.gat,1,1,0	script	FirstPatrolControl2	-1,{
OnStart:
	if(.walk_st == 0) {
		set .walk_st,1;
		initnpctimer;
		unittalk getnpcid(0,"�㓙���|������#set03"),"�|������: �c �c �c �c �c";	// 55622
		unittalk getnpcid(0,"�ꓙ���\����#set03"),"�\����: �n�n�c�p�g���[���ɍs���ĎQ��܂��A�����a";	// 55713
		unittalk getnpcid(0,"�p�g���[������#stiwp"),"�p�g���[������ : �p�g���[�����I��邮�炢�Ɍ}���ɗ���Ƃɂ��悤�B";	// 54584
	}
	end;
OnStop:
	stopnpctimer;
	if(.walk_st == 1) {
		set .walk_st,2;
		hideoffnpc getmdnpcname("��̐N#dlunch");	// 54746
		hideoffnpc getmdnpcname("cp_4");	// 54681
	}
	end;
}

1@iwp.gat,370,224,0	script	�㓙����������#set01	21517,{/* 54920 (hide)*/}
1@iwp.gat,370,227,0	script	�V���{����#set01	21514,{/* 54931 (hide)*/}
1@iwp.gat,370,230,0	script	�񓙕�������#set01	21515,{/* 55260 (hide)*/}
1@iwp.gat,370,233,0	script	�ꓙ���z������#set01	21516,{/* 55280 (hide)*/}

1@iwp.gat,370,224,0	script	�㓙����������#set02	21517,{/* 55378 (hide)*/}
1@iwp.gat,370,227,0	script	�V���|������#set02	21514,{/* 55453 (hide)*/}
1@iwp.gat,370,230,0	script	�񓙕��g����#set02	21515,{/* 55531 (hide)*/}
1@iwp.gat,370,233,0	script	�ꓙ���|������#set02	21516,{/* 55577 (hide)*/}

1@iwp.gat,370,224,0	script2	�㓙���|������#set03	21517,{/* 55622 */
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}

1@iwp.gat,370,227,0	script2	�V���z������#set03	21514,{/* 55650 */
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}

1@iwp.gat,370,230,0	script2	�񓙕��g������#set03	21515,{/* 55696 */
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}

1@iwp.gat,370,233,0	script2	�ꓙ���\����#set03	21516,{/* 55713 */
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}

1@iwp.gat,244,359,0	script	cp_4	139,10,10,{/* 54681 (hide)*/
	announce "�]�k���̋��ɂȂɂ�����悤���c�c�I�]", 0x9, 0x99cc00;
	unittalk getcharid(3),strcharinfo(0)+" : �|�������A�k���̋������ɉ�������悤�����ǁH",1;
	if(!sleep2(400)) end;
	unittalk getnpcid(0,getmdnpcname("�㓙���|������#set03")),"�|������: �c�H�c�c�c�H";	// 55622
	unittalk getnpcid(0,getmdnpcname("�ꓙ���\����#set03")),"�\����: �|�������㓙���a�͌��Ȃ������悤�ł����A�ǂ����Ă��C�ɂȂ�Ȃ璼�ڊm�F�����炢�����ł����H";	// 55713
	viewpoint 0, 260, 390, 1, 0x00FF00;	// 54681
	end;
}

1@iwp.gat,244,359,0	script	cp_5	139,10,10,{/* 54691 (hide)*/
	if(.walk_st == 2) {
		donpcevent getmdnpcname("FirstPatrolControl3")+ "::OnStart";
	}
	end;
}

1@iwp.gat,1,1,0	script	FirstPatrolControl3	-1,{
OnStart:
	if(.walk_st == 2) {
		set .walk_st,3;
		initnpctimer;
	}
	end;
OnStop:
	stopnpctimer;
	if(.walk_st == 3) {
		set .walk_st,4;
	}
	end;
}

1@iwp.gat,260,390,4	script	��̐N#dlunch	10453,{/* 54746 */
	cutin "ep19_lunch01.png", 2;
	mes "[��̐N]";
	mes "���������I";
	mes "����߂܂��ɗ����̂ł���!?";
	next;
	menu "����Ȃ���͂Ȃ��ł���H",-;
	mes "[��̐N]";
	mes "�悩�������I";
	mes "�����܂œ����Ă���̂�";
	mes "��J������ł���I";
	next;
	menu "����Ȋ������Ȋ��D�œ����Ă����́H",-;
	mes "[��̐N]";
	mes "�������H";
	mes "�����c�c�����c�c�B";
	next;
	mes "[��̐N]";
	mes "���I�@��p��Ԃ̂��Ƃł��ˁB";
	mes "����Ȃ���v�ł��B";
	mes "���̒��x�̋C���ł����Ă�";
	mes "�����ł���悤�ɐ��삳�ꂽ��ł��B";
	next;
	menu "���삳�ꂽ�H",-;
	cutin "ep19_lunch02.png", 2;
	mes "[��̐N]";
	mes "���̓C���V�I���̎����̂Ȃ�ł��B";
	mes "�Ȋw�҂����R�ɍ�肾���������̂�";
	mes "���ǂɉ��ǂ��d�˂��̂����ł��B";
	next;
	mes "[��̐N]";
	mes "���̎����̂ɔ�ׂ�";
	mes "210426�{���炢�D�ꂽ���݂ł��I";
	next;
	menu "�ǂ����Ă����ɂ���́H",-;
	cutin "ep19_lunch01.png", 2;
	mes "[��̐N]";
	mes "���I�@�s������ł��ˁB";
	mes "�����ɂ��闝�R�ł���";
	mes "����͎��ɂ��悭������܂���B";
	next;
	mes "[��̐N]";
	mes "�Ȋw�҂��������̎�����";
	mes "�����ɂȂ��Ă��錄��";
	mes "�����o�������̂ŁB";
	next;
	mes "[��̐N]";
	mes "�������A�������̒��ނ�";
	mes "�p�g���[�����Ă���̂�";
	mes "���������S�ł͂Ȃ������ł��B";
	next;
	mes "[��̐N]";
	mes "�u�����v�̕������S�����Ȃ̂�";
	mes "���͕����֌������܂��B";
	mes "���Ȃ��Ƃ��b���ł��Ă悩�����ł��B";
	mes "�@�����΁A�܂���܂��傤�I";
	next;
	mes "�]�N�͂��������Ƌ����Ă������B";
	mes "�@���ĕt�����؂̕����ɍs���悤���B";
	mes "�@�C���V�I���ɂ���";
	mes "�@�����m���Ă��邩������Ȃ��B";
	mes "�@���Ԃ��ł�����K�˂Ă݂悤�]";
	close2;
	cutin "ep19_lunch01.png", 255;
	stopnpctimer;
	hideonnpc;	// 54746
	hideonnpc getmdnpcname("cp_4");	// 54681
	hideoffnpc getmdnpcname("cp_5");	// 54691
	hideoffnpc getmdnpcname("�p�g���[������#ediwp");	// 54768
	announce "�㓙���|������#set03 : ���낻��o�����邼�B", 0x9, 0x99cc00;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 54746
	end;
OnInit:
	setnpctitle "<HU-210426>";	// NPC:��̐N#dlunch(54746)
	end;
}

1@iwp.gat,301,315,6	script	�p�g���[������#ediwp	21518,{/* 54768 */
	if(.walk_st < 4) {
		mes "[�p�g���[������]";
		mes "����J�l�B";
		mes "�����������p�g���[�����I����܂�";
		mes "�����҂��Ă��������邩�ȁH";
		close;
	}
	if(EP19_1QUE == 13) {
		delquest 130470;
		setquest 5983;	// state=1	showevent 0, 1, #to_jor_back1;	// 2457: 17, 123 showevent 0, 1, #to_jor_back2;	// 2458: 226, 387 showevent 0, 1, ��̐N#flunch;	// 2541: 250, 30
		set EP19_1QUE,14;
	}
	mes "[�p�g���[������]";
	mes "�p�g���[���A����J�l�B";
	mes "�A�[�E�B���Ɩ`���҂��J��";
	mes "����Ő[�܂������Ƃ��낤�I";
	next;
	mes "[�p�g���[������]";
	mes "���āA�X�̏�֖߂����Ȃ�";
	mes "�����A��čs���Ă����悤���H";
	next;
	if(select("�X�̏�֖߂肽���ł�","�܂��p�����c���Ă���") == 2) {
		mes "[�p�g���[������]";
		mes "�ł́A�����ŉ��U���I";
		mes "�܂�����I";
		close;
	}
	mes "[�p�g���[������]";
	mes "�ł͕X�̏�֍s�����I";
	close2;
	warp "icecastle.gat", 20, 123;
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	emotion 0;	// 54768
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
