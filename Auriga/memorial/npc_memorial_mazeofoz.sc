1@iwp.gat,0,0,0	script	MazeOfOzControl1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;

	end;
}

1@oz.gat,284,164,3	script	���[�v#outoz_201	10024,{/* 70486 */
	mes "�]���[�v���g���ΊO�ɏo��ꂻ�����]";
	next;
	if(select("�O�ɏo��","�����ɗ��܂�") == 2) {
		mes "�]���̏�ɗ��܂邱�Ƃɂ����]";
		close;
	}
	warp "ra_fild10.gat", 173, 176;
	end;
}
1@oz.gat,28,190,3	script	���[�v#outoz_2012	10024,{/* 89864 */
	if(EP18_1QUE < 31) {
		mes "�]���[�v���n��ɐL�тĂ���]";
		close;
	}
	mes "�]���[�v���g���ΊO�ɏo��ꂻ�����]";
	next;
	if(select("�O�ɏo��","�����ɗ��܂�") == 2) {
		mes "�]���̏�ɗ��܂邱�Ƃɂ����]";
		close;
	}
	warp "gw_fild01.gat", 275, 337;
	end;
OnQuestInfo:
	if(EP18_1QUE == 31)
		showevent 6, 1, "���[�v#outoz_2012";
	else
		showevent 9999,0,"���[�v#outoz_2012";
	end;
}

1@oz.gat,282,175,3	script	�~���A��#ozmd1_202	10377,{/* 70718 */
	cutin "ep18_miriam_01.png", 1;
	mes "[�~���A��]";
	mes "�ӂ��I";
	mes "�����́u�I�Y�̖��H�v�B";
	mes "�l�ڂɂ��Ȃ��J��ɂ��邩��";
	mes "�����ϑ��̕K�v�͂Ȃ���B";
	next;
	cloakoffnpc "�}�M�X�e�B��#ozmd1_203";	// 48734
	cloakoffnpc "�}�[�N�C�V��#ozmd1_204";	// 50921
	cloakoffnpc "�^�}����#ozmd1_205";	// 51729
	cutin "4job_maggi_03.PNG", 2;
	mes "[�}�M�X�e�B��]";
	mes "���ق��I";
	mes "�ق�����ۂ��ł��c�c�B";
	next;
	cutin "ep18_mark_01.png", 0;
	mes "[�}�[�N�C�V��]";
	mes "����ɍ������������c�c�B";
	next;
	cutin "ep18_miriam_03.png", 1;
	mes "[�~���A��]";
	mes "�J��ɂ͗n�₪����Ă���";
	mes "��ɉΎR�D�������Ă�񂾁B";
	mes "���܂�D���z�����܂Ȃ��悤�ɒ��ӂ��āB";
	next;
	mes "[�~���A��]";
	mes "�܂��͖k�ɐi�����B";
	mes "���̕ӂ�̓����X�^�[�͂��Ȃ�����";
	mes "�T�d�ɂˁB";
	close2;
	cutin "ep18_miriam_03.png", 255;
	hideonnpc "�~���A��#ozmd1_202";	// 48109
	cloakonnpc "�}�M�X�e�B��#ozmd1_203";	// 48734
	cloakonnpc "�}�[�N�C�V��#ozmd1_204";	// 50921
	cloakonnpc "�^�}����#ozmd1_205";	// 51729
	hideoffnpc "�~���A��#ozmd2_206";	// 55457
	end;
}
1@oz.gat,279,175,5	script	�}�M�X�e�B��#ozmd1_203	10365,{/* 72499 (cloaking)*/}
1@oz.gat,280,175,3	script	�}�[�N�C�V��#ozmd1_204	10383,{/* 97184 (cloaking)*/}
1@oz.gat,279,177,3	script	�^�}����#ozmd1_205	10381,{/* 99264 (cloaking)*/}

1@oz.gat,271,272,3	script	�~���A��#ozmd2_206	10377,{/* 13687 (hide)*/
	cutin "ep18_miriam_03.png", 1;
	mes "[�~���A��]";
	mes "�ړI�n�͂��̐悾��B";
	mes "�������Ɍ����鋴��n��Ȃ��Ⴂ���Ȃ��B";
	mes "�܂����̑O�܂ōs�����B";
	close2;
	cutin "ep18_miriam_03.png", 255;
	hideonnpc "�~���A��#ozmd2_206";	// 55457
	hideoffnpc "�~���A��#ozmd3_210";	// 57361
	end;
}
1@oz.gat,245,272,3	script	�}�M�X�e�B��#ozmd3_207	10365,{/* 30605 (cloaking)*/}
1@oz.gat,244,273,3	script	�}�[�N�C�V��#ozmd3_208	10383,{/* 31183 (cloaking)*/}
1@oz.gat,244,270,3	script	�^�}����#ozmd3_209	10381,{/* 32230 (cloaking)*/}
1@oz.gat,241,272,3	script2	�~���A��#ozmd3_210	21321,{/* 32541 (hide)*/
	cutin "ep18_miriam_03.png", 1;
	mes "[�~���A��]";
	mes "���̋���S���œn���";
	mes "�d���ɑς����Ȃ���������Ȃ��B";
	mes "���Ԃɓn�낤�B";
	next;
	mes "[�~���A��]";
	mes "���Ⴀ�A�{�N���ŏ��ɓn��ˁB";
	mes "������������Ă��āc�c";
	mes "�����A���͌��Ȃ������ǂ���B";
	next;
	cloakoffnpc "�}�M�X�e�B��#ozmd3_207";	// 56751
	cloakoffnpc "�}�[�N�C�V��#ozmd3_208";	// 56847
	cloakoffnpc "�^�}����#ozmd3_209";	// 56894
	mes "[�^�}����]";
	mes "����[�c�c";
	mes "�J�ꂪ�S�������܂���ˁB";
	cutin "ep18_tamarin_01.png", 1;
	next;
	mes "[�}�M�X�e�B��]";
	mes "���̋��c�c���ɂ����ꂻ���c�c�B";
	cutin "4job_maggi_02.png", 2;
	next;
	mes "[�}�[�N�C�V��]";
	mes "�݂�ȋC�����āB";
	cutin "ep18_mark_01.png", 0;
	close2;
	cutin "ep18_mark_01.png", 255;
	cloakonnpc "�}�M�X�e�B��#ozmd3_207";	// 56751
	cloakonnpc "�}�[�N�C�V��#ozmd3_208";	// 56847
	cloakonnpc "�^�}����#ozmd3_209";	// 56894
	donpcevent "�~���A��#ozmd3_210" + "::OnStart";
	end;
OnStart:
	setnpcspeed 200;
	npcwalkto 231,272,"�~���A��#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 150;
	npcwalkto 221,272,"�~���A��#ozmd3_210";	// 57361: speed:150
	npcwalkwait;
	setnpcspeed 200;
	npcwalkto 211,272,"�~���A��#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 150;
	npcwalkto 201,272,"�~���A��#ozmd3_210";	// 57361: speed:150
	npcwalkwait;
	setnpcspeed 300;
	npcwalkto 191,272,"�~���A��#ozmd3_210";	// 57361: speed:300
	npcwalkwait;
	setnpcspeed 200;
	npcwalkto 181,272,"�~���A��#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 300;
	npcwalkto 171,272,"�~���A��#ozmd3_210";	// 57361: speed:300
	npcwalkwait;
	setnpcspeed 200;
	npcwalkto 161,272,"�~���A��#ozmd3_210";	// 57361: speed:200
	npcwalkwait;
	setnpcspeed 70;
	npcwalkto 157,272,"�~���A��#ozmd3_210";	// 57361: speed:70
	npcwalkwait;
	hideoffnpc "�A�b�V���g�[�h#ozmd1_215";	// 59335
	hideoffnpc "�~���A��#ozmd4_214";	// 59123
	hideonnpc "�~���A��#ozmd3_210";	// 57361
	sleep 1000;
	announce "�~���A�� : �����X�^�[!?", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�~���A�� : �J�G���N�c�c�L�~�Ƒ҂����킹�Ȃ�Ă��Ă��Ȃ���I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 3000;
	hideoffnpc "�^�}����#ozmd4_213";	// 58918
	sleep 1000;
	hideoffnpc "�A�b�V���g�[�h#ozmd2_216";	// 59382
	sleep 1000;
	announce "�^�}���� : ���ɂ�����܂�����I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 3000;
	hideoffnpc "�A�b�V���g�[�h#ozmd3_217";	// 59657
	donpcevent "OzMobEvent01::OnStart";
	sleep 1000;
	hideoffnpc "�}�M�X�e�B��#ozmd4_211";	// 58399
	hideoffnpc "�}�[�N�C�V��#ozmd4_212";	// 58498
	unittalk getnpcid(0,"�A�b�V���g�[�h#ozmd1_215"),"�A�b�V���g�[�h : �Q���Q���B";	// 59335
	sleep 1000;
	announce "�}�M�X�e�B�� : ���႟�[�I�I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	unittalk getnpcid(0,"�A�b�V���g�[�h#ozmd3_217"),"�A�b�V���g�[�h : �O�@�b�O�@�b�O�@�B";	// 59657
	sleep 2500;
	unittalk getnpcid(0,"�A�b�V���g�[�h#ozmd2_216"),"�A�b�V���g�[�h : �Q���Q���B";	// 59382
	sleep 1500;
	announce "�}�[�N�C�V�� : �`���җl�́A�i�s�����̓G��r�����Ă��������I�@����́A�������őΏ����܂��I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	end;
OnInit:
	setnpcspeed 150,"�~���A��#ozmd3_210";	// 32541
	end;
}

1@oz.gat,155,275,3	script	�}�M�X�e�B��#ozmd4_211	10365,{/* 32977 (hide)*/}
1@oz.gat,156,274,3	script	�}�[�N�C�V��#ozmd4_212	10383,{/* 33288 (hide)*/}
1@oz.gat,161,272,5	script	�^�}����#ozmd4_213	10381,{/* 34547 (hide)*/}
1@oz.gat,157,272,3	script	�~���A��#ozmd4_214	10377,{/* 34582 (hide)*/}
1@oz.gat,156,272,5	script	�A�b�V���g�[�h#ozmd1_215	21295,{/* 34777 (hide)*/}
1@oz.gat,164,272,3	script	�A�b�V���g�[�h#ozmd2_216	21295,{/* 34944 (hide)*/}
1@oz.gat,153,275,5	script	�A�b�V���g�[�h#ozmd3_217	21295,{/* 37923 (hide)*/}
1@oz.gat,162,275,3	script	�}����#ozmd4_218	10376,{/* 38005 (hide)*/}
1@oz.gat,1,1,0	script	OzMobEvent01	139,{
OnStart:
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("OzMobEvent01")+ "::OnKilled";
	monster '@mdmap$,145,274,"�A�b�V���g�[�h#1",21295,1,'@label$;
	monster '@mdmap$,143,278,"�A�b�V���g�[�h#2",21295,1,'@label$;
	end;
OnKilled:
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("OzMobEvent01")+ "::OnKilled";
	if(getmapmobs('@mdmap$,'@label$) > 0)
		end;
	announce "�^�}���� : �ӂ��I�@�I���܂����I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	hideonnpc "�A�b�V���g�[�h#ozmd2_216";	// 59382
	sleep 2000;
	announce "�}�M�X�e�B�� : ���������A�|���܂����c�c�I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	hideonnpc "�A�b�V���g�[�h#ozmd3_217";	// 59657
	sleep 2000;
	hideonnpc "�A�b�V���g�[�h#ozmd1_215";	// 59335
	announce "�}���� : �F����I�@�������ł����I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	hideoffnpc "�}����#ozmd4_218";	// 59766
	sleep 2000;
	announce "�~���A�� : �x����I�@���ł������Ă��́H", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : �������̃J�G�������������Ζׂ��邩���ˁB", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�~���A�� : �₾��I�@����Ȃ��́A�N�������̂��c�c�B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : ��k�͂��ꂮ�炢�ɂ��āc�c�����̒ʂ�A�����X�^�[�̂����ŕ����̗A��������Ȃ��Ă��܂��B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : �������̂����ʂ̏��l���������Ȃ������ł��傤�B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�^�}���� : ���̓��ȊO�Ɍo�H�͖����̂ł����H", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : ���Ă͋��J�ɂ������ʂ������Ƃ͕ʂ̋����˂����Ă��܂������A�˂������킯�ɂ͂����Ȃ���ł��B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : �����˂������΁A��Ɍ��Z�����Z��ł��邱�Ƃ��o���Ă��܂��܂�����B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : �댯�ł����Ă��A���̖��{��ʂ邵������܂���B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : �����������炱���ɐl���B��Z��ł��邱�Ƃ�m�点�Ă��܂��悤�Ȃ��̂ł��B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : �����A��ɐi�݂܂��傤�B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	announce "�}���� : ����́A�`���җl�������ꏏ�����烂���X�^�[���|���Ȃ��ł��ˁB", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 2000;
	hideonnpc "�}����#ozmd4_218";	// 59766
	hideonnpc "�}�M�X�e�B��#ozmd4_211";	// 58399
	hideonnpc "�}�[�N�C�V��#ozmd4_212";	// 58498
	hideonnpc "�^�}����#ozmd4_213";	// 58918
	hideonnpc "�~���A��#ozmd4_214";	// 59123
	hideonnpc "�}����#ozmd4_218";	// 59766
	hideoffnpc "�}����#ozmd5_219";	// 59835
	end;
}
1@oz.gat,98,172,3	script2	�}����#ozmd5_219	21320,{/* 40966 (hide)*/
	hideoffnpc "�}�M�X�e�B��#ozmd5_221";	// 93078
	hideoffnpc "�}�[�N�C�V��#ozmd5_222";	// 93325
	hideoffnpc "�^�}����#ozmd5_223";	// 93646
	hideoffnpc "�~���A��#ozmd5_220";	// 93044
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "�O�́A�����܂Ŋ댯�ł͂Ȃ�������ł��B";
	mes "�g�[���ΎR�̉e���Ȃ̂��c�c";
	mes "�n��̗��ꂪ���������Ă���";
	mes "�����X�^�[����������ł��B";
	next;
	mes "[�}����]";
	mes "�����X�^�[�͖��ł���";
	mes "�n��ɂ����ӂ��Ă��������B";
	mes "�n��ɐG��đ傯���𕉂�����";
	mes "���𗎂Ƃ����l�����܂��B";
	next;
	cutin "ep18_maram_01.png", 255;
	announce "�H�H�H : ���킟���[�I�I�I�I�I�I�I", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	cutin "ep18_miriam_03.png", 0;
	mes "[�~���A��]";
	mes "���̐��́A�C���������I";
	mes "�}�����I";
	next;
	cutin "ep18_maram_03.png", 2;
	mes "[�}����]";
	mes "������ɍs���܂��I";
	mes "�ォ����ė��Ă��������I";
	close2;
	cutin "ep18_maram_03.png", 255;
	hideonnpc "�}�M�X�e�B��#ozmd5_221";	// 93078
	hideonnpc "�}�[�N�C�V��#ozmd5_222";	// 93325
	hideonnpc "�^�}����#ozmd5_223";	// 93646
	setnpcspeed 120,"�}����#ozmd5_219";	// 40966
	npcwalkto 88,168,"�}����#ozmd5_219";	// 92662: speed:120
	setnpcspeed 100,"�~���A��#ozmd5_220";	// 41125
	npcwalkto 83,167,"�~���A��#ozmd5_220";	// 93044: speed:100
	sleep 1200;
	hideonnpc "�}����#ozmd5_219";	// 92662
	hideoffnpc "�}����#ozmd7_224";	// 46991
	hideoffnpc "�C������#ozmd6_226";	// 48021
	end;
OnInit:
	setnpcspeed 150,"�}����#ozmd5_219";	// 40966
	end;
}
1@oz.gat,97,167,3	script2	�~���A��#ozmd5_220	21321,{/* 41125 (hide)*/
	end;
OnInit:
	setnpcspeed 150,"�~���A��#ozmd5_220";	// 41125
	end;
}
1@oz.gat,92,170,3	script	�}�M�X�e�B��#ozmd5_221	10365,{/* 44964 (hide)*/}
1@oz.gat,91,169,3	script	�}�[�N�C�V��#ozmd5_222	10383,{/* 45653 (hide)*/}
1@oz.gat,89,170,5	script	�^�}����#ozmd5_223	10381,{/* 45677 (hide)*/}
1@oz.gat,68,165,3	script	�}����#ozmd7_224	10376,{/* 46991 (hide)*/
	mes "[�}����]";
	mes "�C�������I";
	mes "���v��!!";
	close2;
	hideonnpc "�}����#ozmd7_224";	// 93672
	donpcevent "�C������#ozmd6_226::OnStart";
	end;
}
1@oz.gat,68,165,3	script	�}����#ozmd8_225	10376,{/* 47956 (hide)*/}
1@oz.gat,61,163,5	script	�C������#ozmd6_226	10379,{/* 48021 (hide)*/
	unittalk "�C������ : ���Ă��Ȃ��ŏ����Ă���[!!";	// 94059
	end;
OnStart:
	unittalk "�C������ : ���Ă��Ȃ��ŏ����Ă���[!!";	// 94059
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("�C������#ozmd6_226")+ "::OnKilled";
	monster '@mdmap$,64,164,"�A�b�V���g�[�h#3",21295,1,'@label$;
	monster '@mdmap$,62,161,"���P�\��#3",21296,1,'@label$;
	end;
OnKilled:
	set '@mdmap$,getmdmapname("1@oz.gat");
	set '@label$,getmdnpcname("�C������#ozmd6_226")+ "::OnKilled";
	if(getmapmobs('@mdmap$,'@label$) > 0)
		end;
	hideoffnpc "�}����#ozmd8_225";	// 5496
	announce "�C������ : ���������c�c�l�q�����ɗ��������Ȃ̂ɍ����ڂɂ������B", 0x9, 0x00b7ee, 0x0190, 16, 0, 0;
	sleep 4000;
	unittalk getnpcid(0,"�C������#ozmd6_226"),"�C������ : �Ƃ���Ń}�����A���̐l�͒N�H";	// 5607
	hideoffnpc "�}�M�X�e�B��#ozmd6_227";	// 25959
	hideoffnpc "�}�[�N�C�V��#ozmd6_228";	// 36720
	hideoffnpc "�^�}����#ozmd6_229";	// 81810
	sleep 2000;
	unittalk getnpcid(0,"�}����#ozmd8_225"),"�}���� : �������ɋ��͂��Ă�������`���җl���B�ƂĂ��M�p�ł���������B";	// 5496
	sleep 2000;
	unittalk getnpcid(0,"�C������#ozmd6_226"),"�C������ : �����Ă�������񂾂���x���������Ȃ����ǂ��c�c";	// 5607
	sleep 2000;
	unittalk getnpcid(0,"�C������#ozmd6_226"),"�C������ : ���O���Ė{���ɂ��l�D���Ƃ������c�c�l���������Ƃ������c�c";	// 5607
	sleep 2000;
	unittalk getnpcid(0,"�~���A��#ozmd5_220"),"�~���A�� : �ق�ƁB�̎����Ă����݂������B";	// 98988
	sleep 2000;
	unittalk getnpcid(0,"�}����#ozmd8_225"),"�}���� : �c�c�J�߂Ă��炦�Ă�̂��ȁH�@�܂��A������B";	// 5496
	sleep 2000;
	unittalk getnpcid(0,"�C������#ozmd6_226"),"�C������ : �������炾�Ɩk�̕����ɐi��ł���B���̐悪�A���H�̏o������B";	// 5607
	sleep 2000;
	unittalk getnpcid(0,"�^�}����#ozmd6_229"),"�^�}���� : �������̓��ł��ˁB�ł́A�i�݂܂��傤�B";	// 81810
	emotion 5,"�^�}����#ozmd6_229";	// 81810
	sleep 2000;
	hideonnpc "�}�M�X�e�B��#ozmd6_227";	// 25959
	hideonnpc "�}�[�N�C�V��#ozmd6_228";	// 36720
	hideonnpc "�^�}����#ozmd6_229";	// 81810
	hideonnpc "�C������#ozmd6_226";	// 5607
	hideonnpc "�}����#ozmd8_225";	// 5496
	hideonnpc "�~���A��#ozmd5_220";	// 98988
	hideonnpc "�}����#ozmd6_230";	// 66914
	hideonnpc "�}����#ozmd9_232";	// 69633
	end;
}
1@oz.gat,61,168,3	script	�}�M�X�e�B��#ozmd6_227	10365,{/* 49295 (hide)*/}
1@oz.gat,65,167,3	script	�}�[�N�C�V��#ozmd6_228	10383,{/* 49596 (hide)*/}
1@oz.gat,59,171,3	script	�^�}����#ozmd6_229	10381,{/* 50011 (hide)*/}
1@oz.gat,44,255,5	script	�}����#ozmd6_230	10376,7,7,{/* 66914 (hide)*/
	unittalk "�}���� : ���̓���H���Ă��������I";	// 99245
	end;
OnTouch:
	unittalk "�}���� : �������ł��I�I";	// 99245
	end;
}
1@oz.gat,58,256,0	script	#oz_way_231	139,{/* 69034 */}
1@oz.gat,21,189,5	script	�}����#ozmd9_232	10376,{/* 69633 (cloaking)*/
	cloakoffnpc "�~���A��#ozmd7_233";	// 22888
	cloakoffnpc "�C������#ozmd7_234";	// 71750
	cutin "ep18_maram_02.png", 1;
	mes "[�}����]";
	mes "�����l�ł��A�������o���ł��B";
	mes "���̃��[�v���o���";
	mes "�O�ɏo���܂���B";
	next;
	cutin "ep18_imril_03.png", 2;
	mes "[�C������]";
	mes "�ӂ��c�c������́A���H���ɉB����������";
	mes "������Ă���߂��B";
	mes "��ɍs���ĂĂ���B";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�݂�Ȕ��Ă��ˁH";
	mes "�����O�ɏo�悤�B";
	if(EP18_1QUE == 30) {
		set EP18_1QUE,31;
		delquest 11719;
		setquest 11720;	// state=1
	}
	close2;
	cutin "ep18_miriam_01.png", 255;
	cloakonnpc "�~���A��#ozmd7_233";	// 22888
	cloakonnpc "�C������#ozmd7_234";	// 71750
	end;
}
1@oz.gat,22,187,5	script	�~���A��#ozmd7_233	10377,{/* 69819 (cloaking)*/}
1@oz.gat,16,185,3	script	�C������#ozmd7_234	10379,{/* 77288 (cloaking)*/}

1@oz.gat,22,207,5	script	#oz01_236	723,4,4,{/* 90767 */
	monster getmdmapname("1@oz.gat"),21,207,"�A�b�V���g�[�h#4",21295,1;
	monster getmdmapname("1@oz.gat"),23,207,"���P�\��#4",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,30,237,5	script	#oz02_237	723,4,4,{/* 6591 */
	monster getmdmapname("1@oz.gat"),29,237,"�A�b�V���g�[�h#5",21295,1;
	monster getmdmapname("1@oz.gat"),31,237,"���P�\��#5",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,44,264,5	script	#oz03_238	723,4,4,{/* 6755 */
	monster getmdmapname("1@oz.gat"),43,264,"�A�b�V���g�[�h#6",21295,1;
	monster getmdmapname("1@oz.gat"),45,264,"���P�\��#6",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,62,247,5	script	#oz04_239	723,4,4,{/* 11357 */
	monster getmdmapname("1@oz.gat"),61,247,"�A�b�V���g�[�h#7",21295,1;
	monster getmdmapname("1@oz.gat"),63,247,"���P�\��#7",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,72,222,5	script	#oz05_240	723,4,4,{/* 71010 */
	monster getmdmapname("1@oz.gat"),71,222,"�A�b�V���g�[�h#8",21295,1;
	monster getmdmapname("1@oz.gat"),73,222,"���P�\��#8",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,79,203,5	script	#oz06_241	723,4,4,{/* 72303 */
	monster getmdmapname("1@oz.gat"),78,203,"�A�b�V���g�[�h#9",21295,1;
	monster getmdmapname("1@oz.gat"),80,203,"���P�\��#9",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,124,261,5	script	#oz07_242	723,4,4,{/* 72342 */
	monster getmdmapname("1@oz.gat"),123,261,"�A�b�V���g�[�h#10",21295,1;
	monster getmdmapname("1@oz.gat"),125,261,"���P�\��#10",21296,1;
	hideonnpc;
	end;
}
1@oz.gat,139,279,5	script	#oz08_243	723,4,4,{/* 72620 */
	monster getmdmapname("1@oz.gat"),138,279,"�A�b�V���g�[�h#11",21295,1;
	monster getmdmapname("1@oz.gat"),140,279,"���P�\��#11",21296,1;
	hideonnpc;
	end;
}
