1_tiamat_00.gat,0,0,0	script	#tiamat_start	139,{
OnInit:
	initnpctimer;
	set $@tiamat_main,-1;
	end;
OnStart:
OnTimer2000:
//OnClock1500:
//OnClock2230:
//	initnpctimer;
	set $@tiamat_main,0;
	set $@tiamat_milka,0;
	set $@tiamat_hound,0;
	set $@tiamat_lowen,0;
	donpcevent "#tiamat_inital::OnStart";
	donpcevent "#tiamat_setwall::OnStart";
	donpcevent "tiamat_mob#all::OnStart";
	stopnpctimer "�������A#pab_base01";
	hideonnpc "�������A#pab_base01";
	hideonnpc "�l�R�m�~���J#pab_base01";
	hideonnpc "�l�R�m�n�E���h#pab_base";
	hideonnpc "�l�R�m���[�E�F��#pab_ba";
	hideonnpc "�Е����X����߉q��#pab_";
	hideonnpc "���Â��ȋ߉q��#pab_base";
	hideonnpc "�d���Ȃ�߉q��#pab_base";
	hideonnpc "�]���Ȃ�߉q��#pab_base";
	hideonnpc "�E�܂����߉q��#pab_base";
	hideonnpc "�s��Ȃ�߉q��#pab_base";
	hideonnpc "�s�������ȋ߉q��#pab_ba";
	hideonnpc "�C���Ɉ���߉q��#pab_";
	hideonnpc "���C����ȋ߉q��#pab_ba";
	hideonnpc "���^�ʖڂȋ߉q��#pab_ba";
	hideonnpc "���z�̗ǂ��߉q��#pab_ba";
	hideonnpc "�킵���߉q��#pab_base01";
	donpcevent "�����Ǘ���#pab_base01::OnStart";
	announce "�e�B�A�}�g�U��킪�J�n����܂����B�Q���������́u�v�����e���[��(��n[1]�`[5])�v�ɂ��W�܂肭�������B", 0;
	end;
OnTimer10000:
	announce "50�b��ɉ���̒��S���ւ̓����J����܂�", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer20000:
	announce "40�b��ɉ���̒��S���ւ̓����J����܂�", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer30000:
	announce "30�b��ɉ���̒��S���ւ̓����J����܂�", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer35000:
	announce "�������A : �����͂�낵���ł����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer40000:
	announce "�������A : ���̗͂��g���ĉ���ɒ����Ă��錋�E�̈ꕔ�������������q���܂��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer45000:
	announce "�������A : �������牤��֌������܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer50000:
	announce "10�b��ɉ������A������̒��S���ւ̓����J���܂�", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer55000:
	announce "5�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer56000:
	announce "4�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	hideonnpc "area00#r01"; //54
	misceffect 58, "�������A#1_tiamat_00"; //55
	end;
OnTimer57000:
	announce "3�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 222, "area00#r01"; //54
	end;
OnTimer58000:
	announce "2�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer59000:
	announce "1�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 488, "area00#r01"; //54
	end;
OnTimer60000:
	stopnpctimer;
	announce "����ւ̓����J���ꂽ", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	set $@tiamat_main,1;
	donpcevent "tiamat_mob#r14::OnStart";
	hideonnpc "�������#0B"; //64
	hideonnpc "�������#0C"; //65
	hideonnpc "�������#0D"; //66
	hideoffnpc "�������#0A"; //63
	misceffect 321, "area00#r01"; //54
	hideoffnpc "area00#r01"; //54
	end;
OnMilka:
	announce "�l�R�m�~���J�����̕����ɐi�݂܂���", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnHound:
	announce "�l�R�m�n�E���h�����̕����ɐi�݂܂���", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnLowen:
	announce "�l�R�m���[�E�F�������̕����ɐi�݂܂���", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
}

3_tiamat_00.gat,0,0,0	script	#tiamat_finish	139,{
OnStart:
//	if($@tiamat_user <= 0)
//		end;
	sleep 15000;
	announce "�������A : �����͂��肪�Ƃ��������܂����B����ł͐��ʂ��m�F���܂��傤�B", 0x9, 0x00ff00, 0x0190, 26, 0, 0;
	sleep 3000;
	announce "=========== ����e�B�A�}�g �T������ ===========", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "------------------ ����n�� ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "���̑� 100% �i13 / 13�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��1F 100% �i12 / 12�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��2F 100% �i19 / 19�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��3F 100% �i17 / 17�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��B1F 100% �i7 / 7�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�č� 100% �i10 / 10�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "����1F 83% �i5 / 6�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "����2F 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�g�p�l���Z�� 100% �i6 / 6�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�������A : ����n�� ���S���j�B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ �O�ǒn�� ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "���E��@ 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E��A 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�쓌 100% �i5 / 5�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�쐼 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�� 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�� 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�k�� 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�k�� 100% �i5 / 5�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�k�@ 100% �i5 / 5�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���E�k�A 100% �i5 / 5�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��� 100% �i20 / 20�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�������A : �O�ǒn�� ���S���j�B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ ����n�� ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "����1F 100% �i6 / 6�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "����2F 100% �i6 / 6�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "���O 100% �i6 / 6�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�J�^�R���x 100% �i11 / 11�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�������A : ����n�� ���S���j�B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ �_�a�n�� ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "�_�a1F 100% �i8 / 8�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�_�aB1F 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�_�aB2F 100% �i2 / 2�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�������A : �_�a�n�� ���S���j�B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ ����̕� ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "��l�� ����̕� 100% �i108 / 108�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��O�� ����̕� 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��� ����̕� 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "��ꋉ ����̕� 100% �i4 / 4�j", 0x9, 0xffffff, 0x0190, 26, 0, 0;
	sleep 1000;
	announce "�������A : ����̕󔠂�S�ĉ�����܂����B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0;	// 0
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "------------------ ����̎��V�g ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<0))
		announce "��22�̎��V�g ���҂̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r15") > 0)
		announce "��22�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��22�̎��V�g ���҂̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<1))
		announce "��21�̎��V�g ���E�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r179") > 0)
		announce "��21�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��21�̎��V�g ���E�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<2))
		announce "��20�̎��V�g �R���̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0)
		announce "��20�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��20�̎��V�g �R���̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<3))
		announce "��19�̎��V�g ���z�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r174") > 0)
		announce "��19�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��19�̎��V�g ���z�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<4))
		announce "��18�̎��V�g ���̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r111") > 0)
		announce "��18�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��18�̎��V�g ���̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<5))
		announce "��17�̎��V�g ���̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r10") > 0)
		announce "��17�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��17�̎��V�g ���̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<6))
		announce "��16�̎��V�g ���̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r43") > 0)
		announce "��16�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��16�̎��V�g ���̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<7))
		announce "��15�̎��V�g �����̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r128") > 0)
		announce "��15�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��15�̎��V�g �����̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<8))
		announce "��14�̎��V�g �ߐ��̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r156") > 0)
		announce "��14�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��14�̎��V�g �ߐ��̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<9))
		announce "��13�̎��V�g ���_�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r149") > 0)
		announce "��13�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��13�̎��V�g ���_�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<10))
		announce "��12�̎��V�g �݂邳�ꂽ�j�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r140") > 0)
		announce "��12�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��12�̎��V�g �݂邳�ꂽ�j�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<11))
		announce "��11�̎��V�g ���`�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r178") > 0)
		announce "��11�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��11�̎��V�g ���`�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<12))
		announce "��10�̎��V�g �^���̗ւ̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r95") > 0)
		announce "��10�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��10�̎��V�g �^���̗ւ̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<13))
		announce "��9�̎��V�g �B�҂̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r110") > 0)
		announce "��9�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��9�̎��V�g �B�҂̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<14))
		announce "��8�̎��V�g �͂̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r8") > 0)
		announce "��8�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��8�̎��V�g �͂̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<15))
		announce "��7�̎��V�g ��Ԃ̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r176") > 0)
		announce "��7�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��7�̎��V�g ��Ԃ̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<16))
		announce "��6�̎��V�g ���l�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r166") > 0)
		announce "��6�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��6�̎��V�g ���l�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<17))
		announce "��5�̎��V�g �@���̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r108") > 0)
		announce "��5�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��5�̎��V�g �@���̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<18))
		announce "��4�̎��V�g �c��̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r193") > 0)
		announce "��4�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��4�̎��V�g �c��̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<19))
		announce "��3�̎��V�g ����̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r113") > 0)
		announce "��3�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��3�̎��V�g ����̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<20))
		announce "��2�̎��V�g �����c�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r84") > 0)
		announce "��2�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��2�̎��V�g �����c�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel & (1<<21))
		announce "��1�̎��V�g ���p�t�̉��g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else if(getvariableofnpc('flag,"tiamat_mob#r185") > 0)
		announce "��1�̎��V�g �H�H�H�H ������", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	else
		announce "��1�̎��V�g ���p�t�̉��g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_angel) {
		announce "�������A : �S�Ă̎��V�g�𓢖ł��܂����B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
		areasoundeffect "3_tiamat_00.gat",0,0,100,100,"levelup.wav", 0, 0;	// 0
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	}
	sleep 1000;
	announce "------------------ ����ɐ��܂��� ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	if($@tiamat_main >= 3)
		announce "�[���̏��� �����W�����g ���Ő��� !!", 0x9, 0x7fffd4, 0x0190, 26, 0, 0;
	else
		announce "�[���̏��� �����W�����g ���Ŏ��s�c", 0x9, 0xff0000, 0x190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_main == 4)
		announce "�[���̏��� �×��W�����g ���Ő��� !!", 0x9, 0x7fffd4, 0x190, 26, 0, 0;
	else
		announce "�[���̏��� �×��W�����g ���Ŏ��s�c", 0x9, 0xff0000, 0x0190, 26, 0, 0;
	sleep 1000;
	if($@tiamat_main == 4) {
		announce "�������A : �M�����������A�^�̉p�Y�ł��B", 0x9, 0x00ff00, 0x190, 30, 0, 0;
		emotion 14, "�������A#3_tiamat_00"; //1537
		areasoundeffect "3_tiamat_00.gat",0,0,100,100,"effect\lg_piety.wav", 0, 0; //0
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 704,"EF_0"+'@i+"#3_tiamat00";	// 1654
		for(set '@i,1; '@i<=8; set '@i,'@i+1)
			misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	}
	sleep 1000;
	announce "------------------ �����]�� ------------------", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	if('@point == 1000) {
		set '@rank$,"SSS";
		set '@effect,410;
	}
	else if('@point >= 950) {
		set '@rank$,"SS";
		set '@effect,83;
	}
	else if('@point >= 900) {
		set '@rank$,"S";
		set '@effect,83;
	}
	else if('@point >= 800) {
		set '@rank$,"A";
		set '@effect,75;
	}
	else if('@point >= 600) {
		set '@rank$,"B";
		set '@effect,440;
	}
	announce "�c�c "+'@point+"�_ !!     �����N : "+'@rank$, 0x9, 0xffffff, 0x190, 26, 0, 0;
	areasoundeffect "3_tiamat_00.gat",0,0,100,100,"complete.wav", 0, 0;	// 0
	emotion 46,"�������A#3_tiamat00";	// 1662
	misceffect '@effect,"EF_09#3_tiamat00";	// 1661
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 894,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 899,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 709,"EF_0"+'@i+"#3_tiamat00";	// 1654
	for(set '@i,1; '@i<=8; set '@i,'@i+1)
		misceffect 338,"EF_0"+'@i+"#3_tiamat00";	// 1654
	sleep 1000;
	announce "===============================================", 0x9, 0xffff00, 0x0190, 40, 0, 0;
	sleep 1000;
	announce "�������A : �ȏ�ł��B�@�����͊��ӂ������܂��B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	sleep 3000;
	announce "�������A : ��V�͊�n�ɂ���u�����Ǘ����v��肨�󂯎�肭�������B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	sleep 7000;
	announce "�������A : ����ł́A����̊O�܂ł����肢�����܂��B�����̏o���������玄�ɂ����|�����������B", 0x9, 0x00ff00, 0x0190, 30, 0, 0;
	emotion 12,"�������A#3_tiamat00";	// 1662
	end;
}

3_tiamat_00.gat,154,123,0	script	EF_01#3_tiamat00	139,{/* 1653 (hide)*/}
3_tiamat_00.gat,148,117,0	script	EF_02#3_tiamat00	139,{/* 1654 (hide)*/}
3_tiamat_00.gat,160,117,0	script	EF_03#3_tiamat00	139,{/* 1655 (hide)*/}
3_tiamat_00.gat,142,111,0	script	EF_04#3_tiamat00	139,{/* 1656 (hide)*/}
3_tiamat_00.gat,166,111,0	script	EF_05#3_tiamat00	139,{/* 1657 (hide)*/}
3_tiamat_00.gat,148,105,0	script	EF_06#3_tiamat00	139,{/* 1658 (hide)*/}
3_tiamat_00.gat,160,105,0	script	EF_07#3_tiamat00	139,{/* 1659 (hide)*/}
3_tiamat_00.gat,154,99,0	script	EF_08#3_tiamat00	139,{/* 1660 (hide)*/}
3_tiamat_00.gat,154,111,0	script	EF_09#3_tiamat00	139,{/* 1661 (hide)*/}

3_tiamat_00.gat,157,109,4	script	�������A#3_tiamat00	10361,{/* 1662 */
	cutin "pab_meer01.bmp", 2;
	mes "[�������A]";
	mes "�����͂��肪�Ƃ��������܂����B";
	mes "����̊O�ɏo���܂����H";
	next;
	if(select("�b����߂�","�O�ɏo����") == 1) {
		mes "[�������A]";
		mes "�킩��܂����B";
		mes "�O�ɏo��ۂ͉��߂�";
		mes "���ɂ����|�����������B";
		close2;
		cutin "pab_meer01.bmp", 255;
		end;
	}
	mes "[�������A]";
	mes "�킩��܂����B";
	mes "����ł͂����肢�����܂��B";
	close2;
	misceffect 316,"";	// self
	misceffect 317,"";	// self
	cutin "pab_meer01.bmp", 255;
	warp "pab_base04.gat",338,75;
	end;
}

1_tiamat_00.gat,195,172,3	script	�������A#1_tiamat_00	10361,{/* 55 */
	if($@tiamat_main == 0) {
		mes "[�������A]";
		mes "���҂����Ă���܂����B";
		mes "����������֑������ł��B";
	}
	else if($@tiamat_main == 1) {
		mes "[�������A]";
		mes "����ւ̓��͊J����Ă��܂��B";
		mes "�C���������߂ĎQ��܂��傤�B";
	}
	else if($@tiamat_main == 2) {
		mes "[�������A]";
		mes "���悢�斂���Ƃ̌���ł��B";
		mes "�ǂ����A�䕐�^���c�c�B";
	}
	else if($@tiamat_main == 3) {
		mes "[�������A]";
		mes "�c�c���ꂪ�Ō�̐킢�ƂȂ�ł��傤�B";
		mes "�S�Ă��c�c�M���ɑ����܂��B";
	}
	else if($@tiamat_main == 4) {
		unittalk "�������A : �����͂��肪�Ƃ��������܂����B�T���̐��ʂ�閧�̕����ɂĊm�F���܂��傤�B",1;
		end;
	}
	while(1) {
		next;
		if(select("�T���̊�{�ɂ��ĕ���","��߂�") == 2) {
			mes "[�������A]";
			mes "�������܂�܂����B";
			mes "������p������܂�����";
			mes "���ł������|�����������B";
			close;
		}
		mes "[�������A]";
		mes "�T���̊�{�ɂ��Ăł��ˁB";
		next;
		mes "[�������A]";
		mes "�T���̍ŏI�ڕW��";
		mes "����̉������ɂ���";
		mes "^009eff�����W�����g^000000�������o���A";
		mes "^009eff���S�ɖłڂ�^000000���Ƃł��B";
		next;
		mes "[�������A]";
		mes "������̊e������";
		mes "�����ɂ���Đ��ݏo���ꂽ";
		mes "�����X�^�[�ɂ����";
		mes "���E�������Ă��܂��B";
		next;
		mes "[�������A]";
		mes "���̂��߁A���ւƐi�ނɂ�";
		mes "^009eff�e�����ɂ���S�Ẵ����X�^�[��^000000";
		mes "^009eff�|���K�v������ł��傤�B^000000";
		next;
		mes "[�������A]";
		mes "�܂��A���E�ȊO�ɂ����̗͂ɂ����";
		mes "����������Ă���ꍇ������܂��B";
		next;
		mes "[�������A]";
		mes "����Ȏ��́A�ʂ̓����s����";
		mes "�����J�����߂̎d�|����";
		mes "�T���Ă݂�̂��ǂ���������܂���B";
		next;
		mes "[�������A]";
		mes "���ɉ�����������";
		mes "�Ȃ肽�����Ƃ͂������܂����H";
		continue;
	}
}
1_tiamat_00.gat,197,170,3	script	���{���Ïp�m#1_tiamat_0	641,{/* 56 */
	mes "[���{���Ïp�m]";
	mes "�̗́A�C�͂̉񕜁A";
	mes "��Ԉُ�̉����A";
	mes "��ꂽ�A�C�e���̏C����";
	mes "�����Ē����܂����B";
	mes "�q�ɂ͂����p�ɂȂ��܂����H";
	npcskillsupport 28,9999,"���{���Ïp�m#1_tiamat_0";//�q�[��
	misceffect 7,"";
	misceffect 14,"";
	misceffect 492,"";
	percentheal 100,100;
	next;
	switch(select("��������","�q��")) {
	case 1:
		mes "[���{���Ïp�m]";
		mes "���A�l�̂��Ƃ𗊂݂܂��B";
		mes "�����ċA���Ă��Ă��������ˁc�c�B";
		close;
	case 2:
		mes "[���{���Ïp�m]";
		mes "�q�ɂł���";
		mes "�@";
		mes "���A�l�̂��Ƃ𗊂݂܂��B";
		mes "�����ċA���Ă��Ă��������ˁc�c�B";
		close2;
		openstorage;
		end;
	}
}
1_tiamat_00.gat,194,151,3	script	�X���B�G#1_tiamat_00	10274,{/* 57 */
	unittalk "�X���B�G : �K�����c�c�B",1;
	end;
}
1_tiamat_00.gat,190,153,3	script	���s�߉q��#1_tiamat_00	418,{/* 58 */
	mes "[���s�߉q��]";
	mes "���A�l�͖k�ɂ���";
	mes "����̖�̑O�ł��҂��ł��B";
	next;
	if(select("�b����߂�","��n�֋A��") == 1) {
		mes "[���s�߉q��]";
		mes "�킩��܂����B";
		mes "�܂������������������B";
		close;
	}
	mes "[���s�߉q��]";
	mes "�������܂�܂����B";
	mes "�ł́A��n�ɖ߂�܂��傤�B";
	close2;
	misceffect 316,"";
	misceffect 317,"";
	warp "pab_base01.gat",338,75;
	end;
}
1_tiamat_00.gat,198,173,3	script	�ٌ`�̖��l#1_tiamat_00	661,{/* 59 */
	if(TIAMAT_WARP <= 0) {
		mes "[�ٌ`�̖��l]";
		mes "�M���̓]���񐔂�^0000ff�O�x^000000��";
		mes "�Ȃ�܂����B";
		mes "����ȏ�肢�������邱�Ƃ͂ł��܂���B";
		close;
	}
	mes "[�ٌ`�̖��l]";
	mes "�M�����]�܂��̂Ȃ�";
	mes "^0000ff�O�x�܂�^000000����ō�풆�̑���";
	mes "�]�����Ă����グ�܂��傤�B";
	mes "^0000ff�c��]���� : " +TIAMAT_WARP+ "^000000";
	next;
	switch(select("��߂�","�~���J��","�n�E���h��","���[�E�F����")) {
	default:
		mes "[�ٌ`�̖��l]";
		mes "���l�ł����B";
		mes "�C���ς������܂����z�����������B";
		mes "���̗͈͓͂̔��ł����";
		mes "�肢�������܂��傤�B";
		close;
	case 2:
		set '@num,1000 + $@tiamat_milka;
		set '@name$,"�l�R�m�~���J#" + '@num + "_1";
		break;
	case 3:
		set '@num,2000 + $@tiamat_milka;
		set '@name$,"�l�R�m�n�E���h#" + '@num + "_1";
		break;
	case 4:
		set '@num,3000 + $@tiamat_milka;
		set '@name$,"�l�R�m���[�E�F��#" + '@num + "_1";
		break;
	}
	set '@dummy,getmapxy('@map$,'@x,'@y,1,'@name$);
	if('@dummy == -1 || '@map$ == "-") {
		mes "[�ٌ`�̖��l]";
		mes "�l�q�����������ł��ˁc�c�B";
		mes "���S�̂��߁A���������o���Ă���";
		mes "�����Ă݂܂��傤�B";
		close;
	}
	set TIAMAT_WARP,TIAMAT_WARP-1;
	misceffect 316,""; //self
	misceffect 317,""; //self
	misceffect 34,""; //self
	warp '@map$,'@x,'@y;
	end;
}
1_tiamat_00.gat,188,171,4	script	�l�R�m�~���J#ex001	728,{/* 60 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�˓��̏����͗ǂ��H";
	mes "���̐i�s���[�g��";
	mes "^0000ff���͂ȃ����X�^�[^000000�Ƃ�";
	mes "�������킢�ɂȂ�Ǝv����B";
	mes "�r�Ɏ��M������̂Ȃ�A���ɂ��ė��āB";
	close;
}
1_tiamat_00.gat,189,173,4	script	�l�R�m�n�E���h#ex001	420,{/* 61 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�����ɗ���̂��v���Ԃ肾�ȁB";
	mes "���l�̐i�s���[�g��";
	mes "^0000ff�����U���������ɂ��������X�^�[^000000�Ƃ�";
	mes "�o�g�����҂��Ă邺�B";
	mes "���@�U���Ɏ��M������z���A";
	mes "���l�̕����ɓ����Ă���B";
	close;
}
1_tiamat_00.gat,186,172,4	script	�l�R�m���[�E�F��#ex001	416,{/* 62 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����͊��ӂ������܂��A�`���ғa�B";
	mes "���̐i�s���[�g��";
	mes "^0000ff���@�U���������ɂ��������X�^�[^000000�Ƃ�";
	mes "�A��ɂȂ���̂Ƒz�肳��܂��B";
	mes "�����U���Ɏ��M��������ł�����";
	mes "���̑��ɂ��͂����݂����������B";
	close;
}
1_tiamat_01.gat,101,209,1	script	����@�J���u#k73CG08	10046,{/* 70 (hide)*/
	unittalk "�����������Ă���c�c",1;
	end;
OnStart:
	initnpctimer;
	set 'flag,1;
	unittalk "�n�����H�̐����}���Ɉ����n�߂��c�c";
	hideoffnpc "����@�J���u#r73CG08"; //71
	hideonnpc "����@�J���u#k73CG08"; //70
	announce "[���E�k�@�V����] �̐��傪����ꂽ", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_26.gat","[���E�k�@�V����] �̐��傪����ꂽ", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	areasoundeffect "this",81,169,121,219,"se_water_fall02.wav", 0, 0; //0
	end;
OnTimer3000:
	mapannounce "1_tiamat_26.gat","[��B1F ���H02] �̐��������n�߂܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	// ��s���Ă邩�`�F�b�N
	if(getvariableofnpc('flag,"tiamat_mob#r126") == 0) {	// ������A�����|���Ă��琅�H 02���
		killmonster "1_tiamat_63.gat","tiamat_mob#r126::OnKilled3";
		misceffect 234, "area#r1264";
		misceffect 406, "area#r1264";
		hideonnpc "area#k1264"; //�����->���H02
		hideoffnpc "area#r1264"; //�����->���H02
	}
	end;
OnTimer6000:
	stopnpctimer;
	if(getvariableofnpc('flag,"����A�J���u#k74AG08") == 0)
		mapannounce "1_tiamat_26.gat","[��B1F ���H01] �͔������̐��ʂɌ���܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	else {
		mapannounce "1_tiamat_26.gat","[��B1F ���H01] �̐����͂�n�߂܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {	// ���˂̒�A�|���Ă�����
			killmonster "1_tiamat_05.gat","tiamat_mob#r13::OnKilled3";
			misceffect 234, "area#r132";
			misceffect 406, "area#r132";
			hideonnpc "area#k132"; //���˂̒�->���H01
			hideoffnpc "area#r132"; //���˂̒�->���H01
		}
		if(getvariableofnpc('flag,"tiamat_mob#r126") == 0) {	// ������A�|���Ă�����
			killmonster "1_tiamat_63.gat","tiamat_mob#r126::OnKilled2";
			misceffect 234, "area#r1263";
			misceffect 406, "area#r1263";
			hideonnpc "area#k1263"; //�����->���H01
			hideoffnpc "area#r1263"; //�����->���H01
		}
	}
	end;
}
1_tiamat_01.gat,101,209,1	script	����@�J���u#r73CG08	10046,{/* 71 */
	unittalk "����@�͕܂��Ă���c�c�B",1;
	end;
}
1_tiamat_02.gat,207,201,4	script	���o�[#007_1	10042,{/* 97 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[���A2F] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#204_1")+getvariableofnpc('flag,"���o�[#007_1") < 2)	// �ҋ@��2F�A���A2F ���o�[
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r202") == 0)	{	// �o���R�j�[�B
		misceffect 234, "area#r2023";
		misceffect 406, "area#k2023";
		killmonster "1_tiamat_58.gat","tiamat_mob#r202::OnKilled3";
		hideonnpc "area#k2023";
		hideoffnpc "area#r2023";
	}
	mapannounce "1_tiamat_02.gat","�u�o���R�j�[�B�v�́u�y���̊ԁv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_58.gat","�u�o���R�j�[�B�v�́u�y���̊ԁv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,281,217,4	script	���o�[#106_1	10042,{/* 98 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����1F �����] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#k32";
	misceffect 234, "area#k34";
	misceffect 234, "area#k35";
	misceffect 234, "area#r1421";
	if(getvariableofnpc('flag,"tiamat_mob#r152") == 0)
		misceffect 234, "area#r1521";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	misceffect 406, "area#k32";
	misceffect 406, "area#k34";
	misceffect 406, "area#k35";
	misceffect 406, "area#k1421";
	killmonster "1_tiamat_29.gat","tiamat_mob#r3::OnKilled3";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled2";
	hideonnpc "area#k32";
	hideonnpc "area#k34";
	hideonnpc "area#k35";
	hideonnpc "area#k1421";
	hideoffnpc "area#r32";
	hideoffnpc "area#r34";
	hideoffnpc "area#r35";
	hideoffnpc "area#r1421";
	if(getvariableofnpc('flag,"tiamat_mob#r152") == 0) {
		misceffect 406, "area#k1521";
		killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled2";
		hideonnpc "area#k1521";
		hideoffnpc "area#r1521";
	}
	announce "�u����(��)�v�́u�y�R�Ɂv�u����1F�ʘH�v�u�g�p�l���Z��E�L���v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,113,215,4	script	���o�[#204_1	10042,{/* 99 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�ҋ@��2F] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#204_1")+getvariableofnpc('flag,"���o�[#007_1") < 2)	// �ҋ@��2F�A���A2F ���o�[
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r202") == 0)	{	// �o���R�j�[�B
		misceffect 234, "area#r2023";
		misceffect 406, "area#k2023";
		killmonster "1_tiamat_58.gat","tiamat_mob#r202::OnKilled3";
		hideonnpc "area#k2023";
		hideoffnpc "area#r2023";
	}
	mapannounce "1_tiamat_02.gat","�u�o���R�j�[�B�v�́u�y���̊ԁv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_58.gat","�u�o���R�j�[�B�v�́u�y���̊ԁv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,271,129,4	script	���o�[#206_1	10042,{/* 100 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[���E�k�� 2F] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set getvariableofnpc('flag,"#�]��19_01"),1;
	set getvariableofnpc('flag,"#�]��21_01"),1;
	set getvariableofnpc('flag,"#�20_04"),1;
	set getvariableofnpc('flag,"#�21_08"),1;
	announce "�u���2F01�`03�v�̑S�Ẵg���b�v����������܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_02.gat,0,0,0	script	tiamattrap#r84	139,{
OnStart:
	initnpctimer;
	announce "��1F�̊e�z�[���ɏ����c�̎g�k���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamonster "1_tiamat_02.gat",108,10,191,105,"�����c�̎g�k",20502,40,strnpcinfo(0)+ "::OnKilled";
	areamonster "1_tiamat_02.gat",236,6,293,61,"�����c�̎g�k",20502,20,strnpcinfo(0)+ "::OnKilled";
	areamonster "1_tiamat_02.gat",78,256,103,282,"�����c�̎g�k",20502,20,strnpcinfo(0)+ "::OnKilled";
	areamonster "1_tiamat_20.gat",160,264,185,285,"�����c�̎g�k",20502,20,strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer10000:
	initnpctimer;
	donpcevent "���V�g�̖S�[#r84::OnHeal";
	end;
OnKilled:
	set '@count,getmapmobs("1_tiamat_02.gat","tiamattrap#r84::OnKilled") + getmapmobs("1_tiamat_20.gat","tiamattrap#r84::OnKilled");
	if('@count <= 0) {
		stopnpctimer;
	}
	end;
}
1_tiamat_02.gat,149,104,4	script	�t���[���e�B#r84	844,{/* 103 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<1);
	announce "��2�̎��V�g �����c�̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	killmonster "1_tiamat_02.gat","tiamattrap#r84::OnKilled";
	killmonster "1_tiamat_20.gat","tiamattrap#r84::OnKilled";
	misceffect 234, "area#r841"; //80
	if(getmapmobs("1_tiamat_50.gat","tiamat_mob#r2::OnKilled") == 0) {	//����(����)�����ς�
		misceffect 234, "area#r22"; //80
		misceffect 234, "area#r24"; //80
	}
	end;
OnTimer3000:
	misceffect 406, "area#r841"; //80
	hideonnpc "area#k841";
	hideoffnpc "area#r841";
	killmonster "1_tiamat_02.gat","tiamat_mob#r84::OnKilled2";
	if(getmapmobs("1_tiamat_50.gat","tiamat_mob#r2::OnKilled") == 0) {	//����(����)�����ς�
		misceffect 406, "area#r22"; //80
		misceffect 406, "area#r24"; //80
		hideonnpc "area#k22";
		hideonnpc "area#k24";
		hideoffnpc "area#r22";
		hideoffnpc "area#r24";
		killmonster "1_tiamat_50.gat","tiamat_mob#r2::OnKilled2";
	}
	announce "�u��z�[���v�́u�ҍ����B�v�A�u����(����)�v�́u����(�k)�v�u����(��)�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_02.gat,149,104,4	script	���V�g�̖S�[#r84	802,{/* 104 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r84"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r84"; //496
	misceffect 668, "���V�g�̖S�[#r84"; //496
	announce "�H�H�H�H : ����҂߁B�����̓W�����g�l�̋��邼�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�t���[���e�B#r84",20471;
	hideoffnpc "�t���[���e�B#r84"; //495
	misceffect 1065, "�t���[���e�B#r84"; //495
	misceffect 1019, "�t���[���e�B#r84"; //495
	announce "���҂��̐����������ɋ����A[��1F ��z�[��] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_02.gat",134,89,164,119,"123";
	end;
OnTimer9000:
	misceffect 903, "�t���[���e�B#r84"; //495
	announce "�t���[���e�B : �����̂킩��ʎ҂͈łɒ��߂Ă���悤�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�t���[���e�B#r84"; //495
	setnpcdisplay "�t���[���e�B#r84",844;
	donpcevent "tiamattrap#r84::OnStart";
	set 'mob,callmonster("this",149,104,"�����c�̉��g",20471,"tiamat_mob#r84::OnKilled3");
	set 'mobmaxhp,getmobhp('mob);
	end;
OnHeal:
	set '@count,getmapmobs("1_tiamat_02.gat","tiamattrap#r84::OnKilled") + getmapmobs("1_tiamat_20.gat","tiamattrap#r84::OnKilled");
	if('@count > 0 && 'mob) {
		announce "�u�����c�̎g�k�v�̋F��ɂ��u�����c�̉��g�v��HP���񕜂���", 0x9, 0x00ebff, 0x190, 20, 0, 0;
		set '@heal,'mobmaxhp / 100 * '@count;
		set '@mobhp,getmobhp('mob) + '@heal;
		if('@mobhp > 'mobmaxhp)
			set '@mobhp,'mobmaxhp;
		setmobhp 'mob,'@mobhp;
	}
	end;
OnKilled:
	set 'mob,0;
	end;
}
1_tiamat_02.gat,128,136,4	script	��1�̋R�m��#96	10046,{/* 105 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�1�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
//123656#�e�B�A�}�g�U���@�ؓ���J#HT_CLAYMORETRAP#JP_Q_TIME#
//�u�~��̊ԁv�ɂ��钤���̓�����͂����ς���������#
//�����̑��삩��5���o�ƍēx���삪�\�ɂȂ�B#

//announce "[��2F �~��̊�] �̑�1�̋R�m����`���ҁu�v���k���Ɍ����܂���", 0x1, 0x00ebff, 0x190, 30, 0, 0;
//announce "[��2F �~��̊�] �̑�1�̋R�m����������������A�����������Ȃ��Ȃ���", 0x1, 0xffff00, 0x190, 30, 0, 0;
//announce "[��2F �~��̊�] �̑S�Ă̋R�m������������A[��2F �y���̊�]�̎��V�g�̖S�[�̕��󂪉�����܂���", 0x1, 0xffff00, 0x190, 30, 0, 0;
}
1_tiamat_02.gat,134,136,4	script	��2�̋R�m��#96	10046,{/* 106 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�2�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,140,136,4	script	��3�̋R�m��#96	10046,{/* 107 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�3�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,146,136,4	script	��4�̋R�m��#96	10046,{/* 108 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�4�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,152,136,4	script	��5�̋R�m��#96	10046,{/* 109 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�5�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,158,136,4	script	��6�̋R�m��#96	10046,{/* 110 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�6�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
}
1_tiamat_02.gat,164,136,4	script	��7�̋R�m��#96	10046,{/* 111 (hide)*/
	//TODO
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�7�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
	//announce "[��2F �~��̊�] �̑�7�̋R�m����������������A�����������Ȃ��Ȃ���", 0x9, 0xffff00, 0x0190, 30, 0, 0;
}
1_tiamat_02.gat,170,136,4	script	��8�̋R�m��#96	10046,{/* 112 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���h�ȋR�m�̒������B�@�������A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�]���ɂ������o��������";
		mes "�@�R�m�̒������]";
		while(1) {
			next;
			if(!(checkquest(123656) & 0x2)) {
				mes "�]�����̓�����͈�t�񂵂�";
				mes "�@�󂯂��_���[�W���񕜂��Ă��Ȃ��]";
				mes "�@^ff0000���p�\�ɂȂ鎞�Ԃ�";
				mes "�@�N�G�X�g�E�B���h�E�Ŋm�F�ł��܂�^000000";
				close;
			}
			mes "�]�ǂ���璤����";
			mes "�@�����������������]";
			mes "�@";
			mes "�@^ff0000����x�����̌����𓮂����ƁA";
			mes "�@�@���������L�����N�^�[�ł�";
			mes "�@�@5���o�܂ł͒�����";
			mes "�@�@���������Ƃ��ł��܂���^000000";
			next;
			switch(select("�����l����","�k���Ɍ�����","�k�Ɍ�����","�k���Ɍ�����","�쐼�Ɍ�����","��Ɍ�����","�쓌�Ɍ�����")) {
			case 1:
				continue;
			}
		}
		setquest 123656;	// state=1
		announce "[��2F �~��̊�] �̑�8�̋R�m����`���ҁu"+strcharinfo(0)+"�v���k���Ɍ����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		unittalk "�����N����Ȃ������c�c",1;	// 1297
		close;
	}
}
1_tiamat_03.gat,113,248,5	script	�]�ڂ̐Δ�#k421	406,{/* 132 */
	mes "^0000ff�]�F�؃G���[";
	mes "�@�o�^�̂Ȃ��҂͓]�ڋ@�\��";
	mes "�@���p�ł��܂���]^000000";
	close;
OnStart:
	initnpctimer;
	unittalk "�F�؃G���[�@�o�^�̂Ȃ��҂͓]�ڋ@�\�𗘗p�ł��܂���";
	end;
OnTimer1000:
	emotion 9, "�l�R�m�n�E���h#207_1"; //1802
	end;
OnTimer2000:
	emotion 9, "�l�R�m�n�E���h#207_1"; //1802
	end;
OnTimer3000:
	emotion 9, "�l�R�m�n�E���h#207_1"; //1802
	end;
OnTimer4000:
	emotion 6, "�l�R�m�n�E���h#207_1"; //1802
	end;
OnTimer5000:
	emotion 6, "�l�R�m�n�E���h#207_1"; //1802
	end;
OnTimer6000:
	emotion 6, "�l�R�m�n�E���h#207_1"; //1802
	end;
OnTimer8000:
	announce "�l�R�m�n�E���h : �����͉��l�ɔC����I�@���炟�������I", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 328, "�l�R�m�n�E���h#207_1"; //1794
	end;
OnTimer12000:
	misceffect 722, "�]�ڂ̐Δ�#k421"; //474
	end;
OnTimer14000:
	misceffect 234, "�]�ڂ̐Δ�#r421"; //474
	misceffect 94, "�]�ڂ̐Δ�#r421"; //474
	hideonnpc "�]�ڂ̐Δ�#k421"; //132
	hideoffnpc "�]�ڂ̐Δ�#r421"; //133
	announce "���E��G���A�̑S�Ă̓]�ڂ̐Δ�̑S�Ă̋@�\���g�p�\�ɂȂ�܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	killmonster "this","tiamat_mob#r42::OnKilled2";
	end;
OnTimer18000:
	announce "�l�R�m�n�E���h : �ւ��I�@�@�B�͕����ŉ���Ɍ���B�悵�A�i�ނ��I", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer21000:
	stopnpctimer;
	hideonnpc "�l�R�m�n�E���h#207_1"; //1802
	hideoffnpc "�l�R�m�n�E���h#2010_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,10;
	end;
}
1_tiamat_03.gat,113,248,5	script	�]�ڂ̐Δ�#r421	406,{/* 133 (hide)*/
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	next;
	mes "�]�]�ڐ��I��ł��������]";
	mes "�@";
	mes "���ݒn : ���E��A����";
	next;
	switch(select("��߂�","���E�쓌B1F","���E�쓌1F","���E�쓌2F","���E�쓌3F","���E�쓌����")) {
	case 1:
		close;
	case 2:
		warp "1_tiamat_19.gat",27,24;	//���E�쓌B1F
		end;
	case 3:
		warp "1_tiamat_16.gat",60,47;	//���E�쓌1F
		end;
	case 4:
		warp "1_tiamat_17.gat",60,38;	//���E�쓌2F
		end;
	case 5:
		warp "1_tiamat_18.gat",49,41;	//���E�쓌3F
		end;
	case 6:
		warp "1_tiamat_03.gat",200,346;	//���E�쓌����
		end;
	}
}
1_tiamat_03.gat,199,350,5	script	�]�ڂ̐Δ�#k471	406,{/* 134 (hide)*/
	mes "^0000ff�]�F�؃G���[";
	mes "�@�o�^�̂Ȃ��҂͓]�ڋ@�\��";
	mes "�@���p�ł��܂���]^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�F�؃G���[�@�o�^�̂Ȃ��҂͓]�ڋ@�\�𗘗p�ł��܂���";
	end;
OnTimer4000:
	announce "�l�R�m�n�E���h : ������������ȁc�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : �l���Ă��d���˂����A�������N�����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "�l�R�m�n�E���h#206_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "�]�ڂ̐Δ�#k471"; //474
	end;
OnTimer12000:
	misceffect 794, "�]�ڂ̐Δ�#k471"; //474
	announce "[���E�쓌 ����]�̌x�񑕒u���쓮���܂����@�N���҂�r�����܂�", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "�]�ڂ̐Δ�#e471"; //475
	hideonnpc "�]�ڂ̐Δ�#k471"; //474
	donpcevent "�]�ڂ̐Δ�#e471::OnStart";
	announce "�l�R�m�n�E���h : ���A�葁���ς܂��悤���B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r47::OnKilled2";
	end;
}
1_tiamat_03.gat,199,350,5	script	�]�ڂ̐Δ�#e471	406,{/* 135 (hide)*/
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	mes "�@";
	mes "�@^0000ff�G�l���M�[�[�U�� : " +'energy+ "%^000000";
	next;
	if(select("^0000ff�S�g�S���^000000�G�l���M�[�𒍂�","��������") == 2) {
		mes "�]���Ȃ��͐Δ肩��";
		mes "�@���������]";
		close;
	}
	mes "�]�]�ڂ̐Δ�ɃG�l���M�[��";
	mes "�@�������Ă��܂��]";
	mes "�@";
	mes "�@^0000ff���U�����󂯂���A�ړ������݂��";
	mes "�@�@���삪��~���܂��B^000000";
	set '@time,80 - (readparam(bStr)/5) - (readparam(bInt)/5) - (readparam(bDex)/5);
	if('@time < 1) set '@time,1;
	misceffect 178,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "�]�ڂ̐Δ�#e471"; //475
		percentheal -10,-10;
		announce "[���E�쓌 ����] �̓]�ڂ̐Δ�ɖ`���ҁu" +strcharinfo(0)+ "�v���G�l���M�[�𒍂��܂����@���[�U��" +'energy+ "%��", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "�]�ڂ̐Δ�#r471"; //476
	hideonnpc "�]�ڂ̐Δ�#e471"; //475
	misceffect 234, "�]�ڂ̐Δ�#r471"; //476
	misceffect 94, "�]�ڂ̐Δ�#r471"; //476
	announce "[���E�쓌 ����]�̓]�ڂ̐Δ肪�I�[�o�[���[�h���A�ꕔ�@�\���g�p�\�ɂȂ�܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : �悵�A��ɐi�ނ��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "�l�R�m�n�E���h#206_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "�l�R�m�n�E���h#2009_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,9;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",185,326,214,343,"�����̂�����",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",185,326,214,343,"�����̂�����",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_03.gat,199,350,5	script	�]�ڂ̐Δ�#r471	406,{/* 136 */
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	next;
	mes "�]�]�ڐ��I��ł��������]";
	mes "�@";
	mes "���ݒn : ���E�쓌����";
	next;
	if($@tiamat_hound < 10) {
		switch(select("��߂�","^888888���E�쓌B1F^000000","^888888���E�쓌1F^000000","^888888���E�쓌3F^000000","^888888���E�쓌3F^000000","���E��A����")) {
		default:
		case 1:
			close;
		case 6:
			warp "1_tiamat_03.gat",108,248;
			end;
		}
	}
	else {
		switch(select("��߂�","���E�쓌B1F","���E�쓌1F","���E�쓌2F","���E�쓌3F","���E��A����")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//���E�쓌B1F
			end;
		case 3:
			warp "1_tiamat_16.gat",60,47;	//���E�쓌1F
			end;
		case 4:
			warp "1_tiamat_17.gat",60,38;	//���E�쓌2F
			end;
		case 5:
			warp "1_tiamat_18.gat",49,41;	//���E�쓌3F
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//���E��A����
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "�]�ڂ̐Δ�#r471"; //476
	end;
}
1_tiamat_03.gat,104,263,4	script	���o�[#108_1	10042,{/* 137 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[���E�쓌 ����] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled3";
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled4";
	misceffect 234, "area#r461";
	misceffect 234, "area#r462";
	misceffect 406, "area#r461";
	misceffect 406, "area#r462";
	hideonnpc "area#k461"; //1258
	hideonnpc "area#k462"; //1258
	hideoffnpc "area#r461"; //1258
	hideoffnpc "area#r462"; //1258
	announce "�u���E�쓌3F�v�́u��ǒʘH02�v�u��ǒʘH04�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}

1_tiamat_04.gat,21,51,4	script	���o�[#205_1	10042,{/* 155 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�_�a�ʘH1F02] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getmapmobs("1_tiamat_04.gat","tiamat_mob#r183::OnKilled") == 0) {	//�_�a�ʘH1F02�����ς�
		killmonster "1_tiamat_04.gat","tiamat_mob#r183::OnKilled2";
		misceffect 234, "area#r1831";
		misceffect 406, "area#r1831";
		hideonnpc "area#k1831"; //1258
		hideoffnpc "area#r1831"; //1258
	}
	if(getmapmobs("1_tiamat_54.gat","tiamat_mob#r162::OnKilled") == 0) {	//����1F�ʘH01�����ς�
		killmonster "1_tiamat_54.gat","tiamat_mob#r162::OnKilled3";
		misceffect 234, "area#r1624";
		misceffect 406, "area#r1624";
		hideonnpc "area#k1624"; //1258
		hideoffnpc "area#r1624"; //1258
	}
	announce "�u�_�a�ʘH1F02�v�́u����1F�ʘH01�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}

1_tiamat_04.gat,142,194,4	script	�T���K�^�i�X#r181	844,{/* 157 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<19);
	announce "��20�̎��V�g �R���̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_04.gat,142,194,4	script	���V�g�̖S�[#r181	802,{/* 158 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r181"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r181"; //496
	misceffect 668, "���V�g�̖S�[#r181"; //496
	announce "�H�H�H�H : ���̍߂͎��ɂ�����܂���ł��낤�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�T���K�^�i�X#r181",20477;
	hideoffnpc "�T���K�^�i�X#r181"; //495
	misceffect 1065, "�T���K�^�i�X#r181"; //495
	misceffect 1019, "�T���K�^�i�X#r181"; //495
	announce "���҂��̐����������ɋ����A[�_�a1F ���̕�] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_04.gat",132,184,152,204,"123";
	end;
OnTimer9000:
	misceffect 903, "�T���K�^�i�X#r181"; //495
	announce "�T���K�^�i�X : �����͂��łɉ����ꂽ�B������Y�����s����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�T���K�^�i�X#r181"; //495
	setnpcdisplay "�T���K�^�i�X#r181",844;
	monster "this",142,194,"�R���̉��g",20477,1,"tiamat_mob#r181::OnKilled3";
	end;
}
1_tiamat_04.gat,139,200,4	script	�������A#1_tiamat_04	10361,{/* 159 (hide)*/
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer3000:
	if($@tiamat_milka >= 34 && $@tiamat_hound >= 51 && $@tiamat_lowen >= 33) {
		stopnpctimer;
		announce "�l�R�m���[�E�F�� : �P�l�A���E���������������܂����B���ɂ��C�����������B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		sleep 3000;
		announce "�l�R�m�n�E���h : ��Ȏd�|���΂����ŁA�ق�Ƌ�J�������B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		sleep 3000;
		announce "�l�R�m�~���J : �W�����g�𓢂��|���`�����X�ł��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		sleep 3000;
		announce "���Ƃ̎��A�������ɐ��𒍂��Ƃ݂�݂邤���ɐ������A�Ԃ��炢��", 0x9, 0xffffff, 0x190, 20, 0, 0;
		sleep 3000;
		announce "[�_�a1F ���̕�] �Ɂu�l�R�m�v���u���Ƃ̉ԁv������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		misceffect 58, "�l�R�m�~���J#1036_1"; //1862
		misceffect 58, "�l�R�m�n�E���h#2051_1"; //1926
		misceffect 58, "�l�R�m���[�E�F��#3033_1"; //1981
		sleep 1000;
		misceffect 40, "�l�R�m�~���J#1036_1"; //1862
		misceffect 40, "�l�R�m�n�E���h#2051_1"; //1926
		misceffect 40, "�l�R�m���[�E�F��#3033_1"; //1981
		sleep 1000;
		misceffect 83, "area#r1812"; //145
		sleep 2000;
		misceffect 90, "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled4";
		hideonnpc "area#k1812"; //154
		hideonnpc "�������A#1_tiamat_04"; //159
		hideoffnpc "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled2";
		announce "�u�_�a1F ���̕�v�́u����1F�ʘH01�v�̌��E�������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		sleep 3000;
		announce "�c�莞�Ԃ͌�͂��ł��B�����̂��ƂɌ������܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		end;
	}
	switch('flag) {
	case 0:
		announce "�������A : �n���ɑ����K�i�ɋ��͂ȕ��󂪎{����Ă���悤�ł��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		initnpctimer;
		break;
	case 1:
		announce "�������A : ����̉������s���܂����A���ꂾ���̌��E�c���Ȃ�̎��Ԃ������邩������܂���c�c�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		initnpctimer;
		break;
	case 2:
		misceffect 58, "�������A#1_tiamat_04"; //159
		announce "[�_�a1F ���̕�] �̌��E�����܂Ō�30���c�c", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 62:
		misceffect 58, "�������A#1_tiamat_04"; //159
		announce "[�_�a1F ���̕�] �̌��E�����܂Ō�20���c�c", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 122:
		misceffect 58, "�������A#1_tiamat_04"; //159
		announce "[�_�a1F ���̕�] �̌��E�����܂Ō�10���c�c", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 176:
		misceffect 58, "�������A#1_tiamat_04"; //159
		announce "[�_�a1F ���̕�] �̌��E�����܂Ō�1���c�c", 0x9, 0xee82ee, 0x190, 20, 0, 0;
		break;
	case 182:
		stopnpctimer;
		misceffect 83, "area#r1812"; //145
		sleep 2000;
		misceffect 90, "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled4";
		hideonnpc "area#k1812"; //154
		hideonnpc "�������A#1_tiamat_04"; //159
		hideoffnpc "area#r1812"; //145
		killmonster "1_tiamat_04.gat","tiamat_mob#r181::OnKilled2";
		announce "�u�_�a1F ���̕�v�́u����1F�ʘH01�v�̌��E�������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		sleep 3000;
		announce "�c�莞�Ԃ͌�͂��ł��B�����̂��ƂɌ������܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
		end;
	default:
		misceffect 58, "�������A#1_tiamat_04"; //159
		break;
	}
	set 'flag,'flag+1;
	end;
OnTimer5000:
	misceffect 234, "area#r1812"; //145
	end;
OnTimer7000:
	misceffect 782, "area#r1812"; //145
	end;
OnTimer10000:
	initnpctimer;
	end;
}
1_tiamat_06.gat,187,48,4	script	�l�r���X#r140	844,{/* 191 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<11);
	announce "��12�̎��V�g �݂邳�ꂽ�j�̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	stopnpctimer;
	announce "[�č� �Ŏ畔��] �̃��o�[�̌����J����", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	killmonster "1_tiamat_25.gat","tiamat_mob#r132::OnKilled2";
	end;
}
1_tiamat_06.gat,187,48,4	script	���V�g�̖S�[#r140	802,{/* 192 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r140"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r140"; //496
	misceffect 668, "���V�g�̖S�[#r140"; //496
	announce "�H�H�H�H : �����c�c�ʓ|���c�c�ʓ|���c�c", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�l�r���X#r140",20474;
	hideoffnpc "�l�r���X#r140"; //495
	misceffect 1065, "�l�r���X#r140"; //495
	misceffect 1019, "�l�r���X#r140"; //495
	announce "���҂��̐����������ɋ����A[�č� ���╔��] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_06.gat",172,33,202,63,"123";
	end;
OnTimer9000:
	misceffect 903, "�l�r���X#r140"; //495
	announce "�l�r���X : �N���҂����Ղ�ɂ�����͖̂ʓ|�Ȃ񂾁c�c�m���Ă邩�H", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�l�r���X#r140"; //495
	setnpcdisplay "�l�r���X#r140",844;
	monster "this",187,48,"�݂邳�ꂽ�j�̉��g",20474,1,"tiamat_mob#r140::OnKilled2";
	end;
}
1_tiamat_07.gat,15,128,4	script	���V�t�F��#r185	844,{/* 200 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<0);
	announce "��1�̎��V�g ���p�t�̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_07.gat,15,128,4	script	���V�g�̖S�[#r185	802,{/* 201 (hide)*/
	if(getmapmobs("this","tiamat_mob#r185::OnKilled2")) {
		unittalk getcharid(3),"�S�[�ɕ��󂪎{����Ă���c�c �ǂ����ɉ�������d�|��������悤��",1;
		end;
	}
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r185"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r185"; //496
	misceffect 668, "���V�g�̖S�[#r185"; //496
	announce "�H�H�H�H : �W�����g�l�̐��Ȃ鋏��ɓ��ݓ���Ƃ͋����ȁc�c", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "���V�t�F��#r185",20470;
	hideoffnpc "���V�t�F��#r185"; //495
	misceffect 1065, "���V�t�F��#r185"; //495
	misceffect 1019, "���V�t�F��#r185"; //495
	announce "���҂��̐����������ɋ����A[�_�aB1F �n���󕨌�] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_07.gat",5,118,25,138,"123";
	end;
OnTimer9000:
	misceffect 903, "���V�t�F��#r185"; //495
	announce "���V�t�F�� : ���҂̍��Ŏ���̌y���ȍs���������邪�ǂ��I", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "���V�t�F��#r185"; //495
	setnpcdisplay "���V�t�F��#r185",844;
	monster "this",15,128,"���p�t�̉��g",20470,1,"tiamat_mob#r185::OnKilled3";
	end;
}
1_tiamat_08.gat,208,301,1	script	�f�q������#k37CG03	10278,{/* 272 (hide)*/
	unittalk "�������Ȃ��c�����̒����̂悤���c�c";
	end;
}
1_tiamat_08.gat,208,301,1	script	�f�q������#r37CG03	10278,{/* 273 (hide)*/
	setarray '@str$[1],"���p�t","�����c","����","�c��","�@��","���l","���","��","�B��";
	unittalk "��ꂪ�i��́u�\�[�h�v�A�����́u" +'@str$['flag]+ "�v";
	end;
OnStart:
	unittalk "�u�f�q�������v�����p�\�ɂȂ�܂���";
	set 'flag,getvariableofnpc('CG03,"�O���[�U��#r16CG02");
	end;
}
1_tiamat_08.gat,180,179,5	script	�q�����G����#k50CG04	10279,{/* 274 (hide)*/
	unittalk "�������Ȃ��c�����̒����̂悤���c�c";
	end;
}
1_tiamat_08.gat,180,179,5	script	�q�����G����#r50CG04	10279,{/* 275 */
	setarray '@str$[1],"���p�t","�����c","����","�c��","�@��","���l","���","��","�B��";
	unittalk "��ꂪ�i��́u�����h�v�A�����́u" +'@str$['flag]+ "�v";
	end;
OnStart:
	unittalk "�u�q�����G�����v�����p�\�ɂȂ�܂���";
	set 'flag,getvariableofnpc('CG04,"�O���[�U��#r16CG02");
	end;
}
1_tiamat_08.gat,207,385,2	script	�J�f�X��#k71CG06	10277,{/* 276 (hide)*/
	unittalk "�������Ȃ��c�����̒����̂悤���c�c";
	end;
}
1_tiamat_08.gat,207,385,2	script	�J�f�X��#r71CG06	10277,{/* 277 */
	setarray '@str$[1],"���p�t","�����c","����","�c��","�@��","���l","���","��","�B��";
	unittalk "��ꂪ�i��́u�J�b�v�v�A�����́u" +'@str$['flag]+ "�v";
	end;
OnStart:
	unittalk "�u�J�f�X���v�����p�\�ɂȂ�܂���";
	set 'flag,getvariableofnpc('CG06,"�O���[�U��#r16CG02");
	end;
}
1_tiamat_09.gat,79,40,4	script	���o�[#006_1	10042,{/* 337 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		if(getvariableofnpc('flag,"���o�[#006_2")+getvariableofnpc('flag,"���o�[#006_3") == 2)
			initnpctimer;
		announce "[�ҍ����@] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r80::OnKilled2";
	misceffect 234, "area#r803";
	misceffect 406, "area#r803";
	hideonnpc "area#k803"; //1258
	hideoffnpc "area#r803"; //1258
	mapannounce "1_tiamat_42.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_09.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_43.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_09.gat,219,55,4	script	���o�[#006_2	10042,{/* 338 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		if(getvariableofnpc('flag,"���o�[#006_1")+getvariableofnpc('flag,"���o�[#006_3") == 2)
			initnpctimer;
		announce "[�ҍ����A] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r80::OnKilled2";
	misceffect 234, "area#r803";
	misceffect 406, "area#r803";
	hideonnpc "area#k803"; //1258
	hideoffnpc "area#r803"; //1258
	mapannounce "1_tiamat_42.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_09.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_43.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_10.gat,106,109,1	script	��#r174CG09	10044,{/* 348 */
	if('flag == 0) {
		unittalk getcharid(3),strcharinfo(0)+" : �ޏ��͊������Ă���B",1;
		end;
	}
	if(countitem(25362) <= 0) {
		unittalk getcharid(3),"�ޏ����ݒu�ł������ȏ��O������c�c",1;
		end;
	}
	mes "�]�u�ޏ��̕��i�v��";
	mes "�@���O�ɐݒu���܂����H�]";
	mes "�@";
	mes "�@^ff0000�ޏ��̊����܂Ō�" +'flag+ "��^000000";
	next;
	if(select("�����l����","�ݒu����") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	delitem 25362,1;
	if('flag > 0) {
		unittalk getcharid(3),strcharinfo(0)+" : ���O�Ɂu�ޏ��̕��i�v��ݒu����",1;
		set 'flag,'flag - 1;
		misceffect 154,"��#r174CG09";
		if('flag <= 0) {
			initnpctimer;
		}
	}
	close;
OnTimer10000:
	announce "�����3�̖̂��b�̋C�z������", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
OnTimer13000:
	announce "����̖��b�i�}�W�b�N�r�[�X�g�j��[��ǒʘH03] �ɏo�����܂���", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
OnTimer14000:
	announce "����̖��b�i�V���[�^�[�f�[�����j��[��1F ���z�[���A] �ɏo�����܂���", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
OnTimer15000:
	stopnpctimer;
	announce "����̖��b�i�u���[���z�[�X�j��[����1F ��q��] �ɏo�����܂���", 0x9, 0xff1493, 0x190, 20, 0, 0;
	end;
announce "����̖��b���S�ē|����A[�_�aB1F �_�aB1�ʘH] �� [�_�aB1F �n���󕨌�] �̔��̕��󂪉�����܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
OnStart:
	set 'flag,20;
	end;
}
1_tiamat_10.gat,106,109,1	script	��#k174CG09	10044,{/* 349 (hide)*/
	unittalk getcharid(3),strcharinfo(0)+" : ���ɕ��󂪎{����Ă���c�c�@�ǂ����ɉ�������d�|��������悤��";
	end;
}
1_tiamat_10.gat,83,98,4	script	�A�C�j#r174	844,{/* 350 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<18);
	announce "��19�̎��V�g ���z�̉��g�g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	misceffect 234, "��#r174CG09"; //348
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	stopnpctimer;
	misceffect 406, "��#r174CG09"; //348
	hideoffnpc "��#r174CG09"; //348
	hideonnpc "��#k174CG09"; //349
	donpcevent "��#r174CG09::OnStart";
	announce "�u���v�̕��󂪉����A�u�ޏ��̕��i�v�̐ݒu���ł���悤�ɂȂ�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_10.gat,83,98,4	script	���V�g�̖S�[#r174	802,{/* 351 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r174"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r174"; //496
	misceffect 668, "���V�g�̖S�[#r174"; //496
	announce "�H�H�H�H : �����܂ŗ���Ƃ́A�l�Ԃ̂����ɂ��ł͂Ȃ����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�A�C�j#r174",20476;
	hideoffnpc "�A�C�j#r174"; //495
	misceffect 1065, "�A�C�j#r174"; //495
	misceffect 1019, "�A�C�j#r174"; //495
	announce "���҂��̐����������ɋ����A[���O ����] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_10.gat",63,78,103,118,"123";
	end;
OnTimer9000:
	misceffect 903, "�A�C�j#r174"; //495
	announce "�A�C�j : �����͊y���߂������B�ȒP�ɂ����΂��Ă����Ȃ�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�A�C�j#r174"; //495
	setnpcdisplay "�A�C�j#r174",844;
	monster "this",83,98,"���z�̉��g",20476,1,"tiamat_mob#r174::OnKilled2";
	end;
}
1_tiamat_11.gat,225,64,1	script	�[���̏��_��#200	10046,{/* 357 */
	mes "�]�����ꂽ���_��������c�c�]";
	if(checkquest(123655))
		close;
	next;
	if(select("�F��������","��������") == 2) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
//	if(!checksit())
//		setsit 1;
	progressbar 5; //color=0x00ff00
	misceffect 91,""; //self
	setquest 123655; //state=1
	mes "�]�M���͋F���������c�c";
	mes "�@�F����I���A���グ���";
	mes "�@���_��������";
	mes "�@���΂�ł���悤�Ɍ������c�c�]";
	close;
}
1_tiamat_12.gat,11,235,1	script	�􂯖�#r133CG09	550,{/* 384 */
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : �􂯖ڂ������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		mes "�N�����@�����̂ł��낤";
		mes "���Ƃ��l���ʂꂻ����";
		mes "���̐Ղ��t�����􂯖ڂ�����B";
		mes "�􂯖ڂ͏�̊O�ւ�";
		mes "�����Ă��������c�c�c";
		next;
		if(select("�����l����","��̊O�ւƏo��") == 1) {
			mes "�]���Ȃ��͗����������]";
			close;
		}
		mes "�􂯖ڂɑ̂��˂�����";
		mes "�i��ōs�����c�c�c";
		close2;
		misceffect 334,""; //self
		misceffect 34,""; //self
		warp "1_tiamat_00.gat",225,159;
	}
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "�􂯖�#r133CG09"; //384
	end;
}
1_tiamat_12.gat,125,66,4	script	���o�[#202_1	10042,{/* 385 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[���2F04] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	killmonster "1_tiamat_08.gat","tiamat_mob#r53::OnKilled3";
	misceffect 234, "area#r533";
	misceffect 406, "area#r533";
	hideonnpc "area#k533"; //1258
	hideoffnpc "area#r533"; //1258
	announce "�u���E��2F�v�́u���2F03�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_12.gat,172,38,0	script	#�]��19_01	139,1,1,{/* 387 (hide)*/
	showmessage "�E�A�A�A�A�A�A�A�A�A�A�b!!!!","";
	misceffect 729,""; //self
	misceffect 34,""; //self
	if(!sleep2(2000)) end;
	warp "1_tiamat_12.gat",8,228;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 36; //393
	misceffect 34; //393
	end;
}
1_tiamat_12.gat,168,42,0	duplicate(#�]��19_01)	#�]��19_02	139,1,1	/* 388 (hide)*/
1_tiamat_12.gat,160,29,0	duplicate(#�]��19_01)	#�]��19_03	139,1,1	/* 389 (hide)*/
1_tiamat_12.gat,142,34,0	duplicate(#�]��19_01)	#�]��19_04	139,1,1	/* 390 (hide)*/
1_tiamat_12.gat,124,29,0	duplicate(#�]��19_01)	#�]��19_05	139,1,1	/* 391 (hide)*/
1_tiamat_12.gat,103,31,0	duplicate(#�]��19_01)	#�]��19_06	139,1,1	/* 392 (hide)*/
1_tiamat_12.gat,234,58,0	duplicate(#�]��19_01)	#�]��20_01	139,1,1	/* 393 (hide)*/
1_tiamat_12.gat,223,69,0	duplicate(#�]��19_01)	#�]��20_02	139,1,1	/* 394 (hide)*/
1_tiamat_12.gat,222,84,0	duplicate(#�]��19_01)	#�]��20_03	139,1,1	/* 395 (hide)*/
1_tiamat_12.gat,234,50,0	script	#�20_04	139,1,1,{/* 396 (hide)*/
	if(strnpcinfo(0) != "#�20_05")
		pushpc 4,7;
	else
		pushpc 6,10;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 17; //393
	misceffect 69; //393
	end;
}
1_tiamat_12.gat,234,70,0	duplicate(#�20_04)	#�20_05	139,1,1	/* 397 (hide)*/
1_tiamat_12.gat,222,78,0	duplicate(#�20_04)	#�20_06	139,1,1	/* 398 (hide)*/
1_tiamat_12.gat,19,229,1	script	���̍Ւd#r133	10045,{/* 399 (hide)*/
	if(distance(getcharid(3)) > 5) {
		unittalk getcharid(3),strcharinfo(0)+" : �Ւd�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	}
	misceffect 9,""; //self
	mes "�]�Ւd�Ɏ����������";
	mes "�@���̒��ɐ����������]";
	next;
	mes "[�H�H�H�H]";
	mes "����̌��������c�c";
	next;
	if(select("�����l����","���������") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	set '@num,substr(strnpcinfo(2),3,1);
	set '@num,'@num-3;
	setarray '@str$,"�@","�A","�B","�C","�D","�E","�F";
	initnpctimer;
	hideonnpc; //404
	set 'flag,'flag | (1 << '@num);
	misceffect 179; //404
	misceffect 407; //404
	misceffect 372,""; //self
	misceffect 378,""; //self
	//sc_start EFST_ABYSS_001,300000,1;	//���̎� : 3�b����10k�_���[�W�A�_���[�W�p�P���AHP0�Ŏ��S���Ȃ�
	soundeffect "banshee_die.wav", 0, 0; //0
	announce "[�č� �n���S" +'@str$['@num]+ "] �̌��̍Ւd�ɖ`���ҁu" +strcharinfo(0)+ "�v�𐶂����Ŗ������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	close;
OnTimer5000:
	if('flag == 0x7F) {
		set 'flag,0xFF;
		announce "�S�Ă̍Ւd�Ɍ����������A[�č� ���╔��] �̎��V�g�̖S�[�̕��󂪉�����܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		hideoffnpc "���V�g�̖S�[#r140";
	}
	end;
OnTimer40000:
	stopnpctimer;
	if('flag == 0xFF)
		end;
	set '@num,substr(strnpcinfo(2),3,1);
	set '@num,'@num-3;
	setarray '@str$,"�@","�A","�B","�C","�D","�E","�F";
	set 'flag,'flag&~(1 << '@num);
	announce "[�č� �n���S" +'@str$['@num]+ "] �̌��̍Ւd�̌��������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	hideoffnpc; //404
	end;
OnStart:
	set 'flag,0;
	hideoffnpc;
	end;
}
1_tiamat_12.gat,42,235,4	duplicate(���̍Ւd#r133)	���̍Ւd#r134	10045	/* 400 (hide)*/
1_tiamat_12.gat,87,235,4	duplicate(���̍Ւd#r133)	���̍Ւd#r135	10045	/* 401 (hide)*/
1_tiamat_12.gat,113,235,4	duplicate(���̍Ւd#r133)	���̍Ւd#r136	10045	/* 402 (hide)*/
1_tiamat_12.gat,163,231,4	duplicate(���̍Ւd#r133)	���̍Ւd#r137	10045	/* 403 (hide)*/
1_tiamat_12.gat,184,230,4	duplicate(���̍Ւd#r133)	���̍Ւd#r138	10045	/* 404 (hide)*/
1_tiamat_12.gat,228,235,4	duplicate(���̍Ւd#r133)	���̍Ւd#r139	10045	/* 405 (hide)*/

1_tiamat_15.gat,137,47,4	script	���o�[#009_1	10042,{/* 460 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[��2F �㖱��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	misceffect 234, "area#r1059";
	misceffect 406, "area#k1059";
	killmonster "1_tiamat_42.gat","tiamat_mob#r105::OnKilled5";
	hideonnpc "area#k1059";
	hideoffnpc "area#r1059";
	mapannounce "1_tiamat_15.gat","�u����ʘH2F01�v�́u����ʘH2F02�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_42.gat","�u����ʘH2F01�v�́u����ʘH2F02�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_16.gat,60,53,5	script	�]�ڂ̐Δ�#k441	406,{/* 465 (hide)*/
	mes "^0000ff�]�F�؃G���[";
	mes "�@�o�^�̂Ȃ��҂͓]�ڋ@�\��";
	mes "�@���p�ł��܂���]^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�F�؃G���[�@�o�^�̂Ȃ��҂͓]�ڋ@�\�𗘗p�ł��܂���";
	end;
OnTimer4000:
	announce "�l�R�m�n�E���h : �c�c�c�܂����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : �l���Ă��d���˂��I�@�������N�����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "�l�R�m�n�E���h#205_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "�]�ڂ̐Δ�#k441"; //474
	end;
OnTimer12000:
	misceffect 794, "�]�ڂ̐Δ�#k441"; //474
	announce "[���E�쓌 1F]�̌x�񑕒u���쓮���܂����@�N���҂�r�����܂�", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "�]�ڂ̐Δ�#e441"; //475
	hideonnpc "�]�ڂ̐Δ�#k441"; //474
	donpcevent "�]�ڂ̐Δ�#e441::OnStart";
	announce "�l�R�m�n�E���h : �葁���ς܂���Ƃ��悤���B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r44::OnKilled2";
	end;
}
1_tiamat_16.gat,60,53,5	script	�]�ڂ̐Δ�#e441	406,{/* 466 (hide)*/
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	mes "�@";
	mes "�@^0000ff�G�l���M�[�[�U�� : " +'energy+ "%^000000";
	next;
	if(select("^0000ff��������^000000�G�l���M�[�𒍂�","��������") == 2) {
		mes "�]���Ȃ��͐Δ肩��";
		mes "�@���������]";
		close;
	}
	mes "�]�]�ڂ̐Δ�ɃG�l���M�[��";
	mes "�@�������Ă��܂��]";
	mes "�@";
	mes "�@^0000ff���U�����󂯂���A�ړ������݂��";
	mes "�@�@���삪��~���܂��B^000000";
	set '@time,80 - readparam(bInt)/3;
	if('@time < 1) set '@time,1;
	misceffect 174,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "�]�ڂ̐Δ�#e441"; //475
		percentheal -10,-10;
		announce "[���E�쓌 1F] �̓]�ڂ̐Δ�ɖ`���ҁu" +strcharinfo(0)+ "�v���G�l���M�[�𒍂��܂����@���[�U��" +'energy+ "%��", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "�]�ڂ̐Δ�#r441"; //476
	hideonnpc "�]�ڂ̐Δ�#e441"; //475
	misceffect 234, "�]�ڂ̐Δ�#r441"; //476
	misceffect 94, "�]�ڂ̐Δ�#r441"; //476
	announce "[���E�쓌 1F]�̓]�ڂ̐Δ肪�I�[�o�[���[�h���A�ꕔ�@�\���g�p�\�ɂȂ�܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : �悵�A��ɐi�ނ��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "�l�R�m�n�E���h#205_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "�l�R�m�n�E���h#2008_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,8;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",45,35,75,60,"�����̂�����",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",45,35,75,60,"�����̂�����",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_16.gat,60,53,5	script	�]�ڂ̐Δ�#r441	406,{/* 467 */
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	next;
	mes "�]�]�ڐ��I��ł��������]";
	mes "�@";
	mes "���ݒn : ���E�쓌1F";
	next;
	if($@tiamat_hound < 10) {
		switch(select("��߂�","^888888���E�쓌B1F^000000","^888888���E�쓌1F^000000","^888888���E�쓌3F^000000","���E�쓌����","^888888���E��A����^000000")) {
		default:
		case 1:
			close;
		case 5:
			warp "1_tiamat_03.gat",200,346;
			end;
		}
	}
	else {
		switch(select("��߂�","���E�쓌B1F","���E�쓌2F","���E�쓌3F","���E�쓌����","���E��A����")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//���E�쓌B1F
			end;
		case 3:
			warp "1_tiamat_17.gat",60,38;	//���E�쓌2F
			end;
		case 4:
			warp "1_tiamat_18.gat",49,41;	//���E�쓌3F
			end;
		case 5:
			warp "1_tiamat_03.gat",200,346;	//���E�쓌����
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//���E��A����
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "�]�ڂ̐Δ�#r441"; //476
	end;
}
1_tiamat_17.gat,61,44,5	script	�]�ڂ̐Δ�#k451	406,{/* 474 (hide)*/
	mes "^0000ff�]�F�؃G���[";
	mes "�@�o�^�̂Ȃ��҂͓]�ڋ@�\��";
	mes "�@���p�ł��܂���]^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�F�؃G���[�@�o�^�̂Ȃ��҂͓]�ڋ@�\�𗘗p�ł��܂���";
	end;
OnTimer4000:
	announce "�l�R�m�n�E���h : �]�����u�̂悤�����A�����Ă˂��ȁc�c�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : �l���Ă��d���˂��I�@������蓮�������B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "�l�R�m�n�E���h#203_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "�]�ڂ̐Δ�#k451"; //474
	end;
OnTimer12000:
	misceffect 794, "�]�ڂ̐Δ�#k451"; //474
	announce "[���E�쓌 2F]�̌x�񑕒u���쓮���܂����@�N���҂�r�����܂�", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "�]�ڂ̐Δ�#e451"; //475
	hideonnpc "�]�ڂ̐Δ�#k451"; //474
	donpcevent "�]�ڂ̐Δ�#e451::OnStart";
	announce "�l�R�m�n�E���h : �����A�����Ȃ�����Α��ɃG�l���M�[�𒍓����Ĕj�󂷂邼�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r45::OnKilled2";
	end;
}
1_tiamat_17.gat,61,44,5	script	�]�ڂ̐Δ�#e451	406,{/* 475 (hide)*/
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	mes "�@";
	mes "�@^0000ff�G�l���M�[�[�U�� : " +'energy+ "%^000000";
	next;
	if(select("^0000ff��p��^000000�G�l���M�[�𒍂�","��������") == 2) {
		mes "�]���Ȃ��͐Δ肩��";
		mes "�@���������]";
		close;
	}
	mes "�]�]�ڂ̐Δ�ɃG�l���M�[��";
	mes "�@�������Ă��܂��]";
	mes "�@";
	mes "�@^0000ff���U�����󂯂���A�ړ������݂��";
	mes "�@�@���삪��~���܂��B^000000";
	set '@time,80 - readparam(bDex)/3;
	if('@time < 1) set '@time,1;
	misceffect 175,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "�]�ڂ̐Δ�#e451"; //475
		percentheal -10,-10;
		announce "[���E�쓌 2F] �̓]�ڂ̐Δ�ɖ`���ҁu" +strcharinfo(0)+ "�v���G�l���M�[�𒍂��܂����@���[�U��" +'energy+ "%��", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "�]�ڂ̐Δ�#r451"; //476
	hideonnpc "�]�ڂ̐Δ�#e451"; //475
	misceffect 234, "�]�ڂ̐Δ�#r451"; //476
	misceffect 94, "�]�ڂ̐Δ�#r451"; //476
	announce "[���E�쓌 2F]�̓]�ڂ̐Δ肪�I�[�o�[���[�h���A�ꕔ�@�\���g�p�\�ɂȂ�܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : �ꕔ�̋@�\���g����悤�ɂȂ����悤���ȁB��ɐi�ނ��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "�l�R�m�n�E���h#203_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "�l�R�m�n�E���h#2006_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,6;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",46,30,76,50,"�����̂�����",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",46,30,76,50,"�����̂�����",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_17.gat,61,44,5	script	�]�ڂ̐Δ�#r451	406,{/* 476 */
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	next;
	mes "�]�]�ڐ��I��ł��������]";
	mes "�@";
	mes "���ݒn : ���E�쓌2F";
	next;
	if($@tiamat_hound < 10) {
		switch(select("��߂�","^888888���E�쓌B1F^000000","^888888���E�쓌1F^000000","���E�쓌3F","^888888���E�쓌����^000000","^888888���E��A����^000000")) {
		default:
		case 1:
			close;
		case 4:
			warp "1_tiamat_18.gat",49,41;
			end;
		}
	}
	else {
		switch(select("��߂�","���E�쓌B1F","���E�쓌1F","���E�쓌3F","���E�쓌����","���E��A����")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//���E�쓌B1F
			end;
		case 3:
			warp "1_tiamat_16.gat",60,47;	//���E�쓌1F
			end;
		case 4:
			warp "1_tiamat_18.gat",49,41;	//���E�쓌3F
			end;
		case 5:
			warp "1_tiamat_03.gat",200,346;	//���E�쓌����
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//���E��A����
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "�]�ڂ̐Δ�#r451"; //476
	end;
}
1_tiamat_18.gat,49,47,5	script	�]�ڂ̐Δ�#k461	406,{/* 486 (hide)*/
	mes "^0000ff�]�F�؃G���[";
	mes "�@�o�^�̂Ȃ��҂͓]�ڋ@�\��";
	mes "�@���p�ł��܂���]^000000";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�F�؃G���[�@�o�^�̂Ȃ��҂͓]�ڋ@�\�𗘗p�ł��܂���";
	end;
OnTimer4000:
	announce "�l�R�m�n�E���h : �c�c�܂��������u����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : �l���Ă��d���˂��I�@������蓮�������B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	misceffect 58, "�l�R�m�n�E���h#204_1"; //1794
	end;
OnTimer11000:
	misceffect 111, "�]�ڂ̐Δ�#k461"; //474
	end;
OnTimer12000:
	misceffect 794, "�]�ڂ̐Δ�#k461"; //474
	announce "[���E�쓌 3F]�̌x�񑕒u���쓮���܂����@�N���҂�r�����܂�", 0x9, 0xff1493, 0x190, 30, 0, 0;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc "�]�ڂ̐Δ�#e461"; //475
	hideonnpc "�]�ڂ̐Δ�#k461"; //474
	donpcevent "�]�ڂ̐Δ�#e461::OnStart";
	announce "�l�R�m�n�E���h : �ʓ|�����A�������G�l���M�[�𒍓����Ĕj�󂾁B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	killmonster "this","tiamat_mob#r46::OnKilled2";
	end;
}
1_tiamat_18.gat,49,47,5	script	�]�ڂ̐Δ�#e461	406,{/* 487 (hide)*/
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	mes "�@";
	mes "�@^0000ff�G�l���M�[�[�U�� : " +'energy+ "%^000000";
	next;
	if(select("^0000ff�͋Z��^000000�G�l���M�[�𒍂�","��������") == 2) {
		mes "�]���Ȃ��͐Δ肩��";
		mes "�@���������]";
		close;
	}
	mes "�]�]�ڂ̐Δ�ɃG�l���M�[��";
	mes "�@�������Ă��܂��]";
	mes "�@";
	mes "�@^0000ff���U�����󂯂���A�ړ������݂��";
	mes "�@�@���삪��~���܂��B^000000";
	set '@time,80 - readparam(bStr)/3;
	if('@time < 1) set '@time,1;
	misceffect 173,""; //self
	progressbar '@time; //color=0x00ff00
	if('energy < 120) {
		set 'energy,'energy + 20;
		misceffect 383,""; //self
		misceffect 407, "�]�ڂ̐Δ�#e461"; //475
		percentheal -10,-10;
		announce "[���E�쓌 3F] �̓]�ڂ̐Δ�ɖ`���ҁu" +strcharinfo(0)+ "�v���G�l���M�[�𒍂��܂����@���[�U��" +'energy+ "%��", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if('energy >= 120)
			initnpctimer;
	}
	close;
OnTimer3000:
	killmonster "this",strnpcinfo(0)+ "::OnKilled";
	end;
OnTimer4000:
	hideoffnpc "�]�ڂ̐Δ�#r461"; //476
	hideonnpc "�]�ڂ̐Δ�#e461"; //475
	misceffect 234, "�]�ڂ̐Δ�#r461"; //476
	misceffect 94, "�]�ڂ̐Δ�#r461"; //476
	announce "[���E�쓌 3F]�̓]�ڂ̐Δ肪�I�[�o�[���[�h���A�ꕔ�@�\���g�p�\�ɂȂ�܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m�n�E���h : ����ƏI��������c�c�悵�A�i�ނ��I", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	hideonnpc "�l�R�m�n�E���h#204_1"; //1794
	end;
OnTimer11000:
	hideoffnpc "�l�R�m�n�E���h#2007_1"; //1873
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,7;
	end;
OnStart:
	set 'energy,20;
	set 'max,getarraysize(getvariableofnpc('mob[12][0],"tiamat_mob#all"));
	copyarray 'mob,getvariableofnpc('mob[12][0],"tiamat_mob#all"),'max;
	for(set '@i,0; '@i < 'max/2; set '@i,'@i+1) {
		areamonster "this",32,30,66,53,"�����̂�����",'mob['@i*2],'mob['@i*2+1],strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnKilled:
	areamonster "this",32,30,66,53,"�����̂�����",'mob[rand('max/2)*2],1,strnpcinfo(0)+ "::OnKilled";
	end;
}
1_tiamat_18.gat,49,47,5	script	�]�ڂ̐Δ�#r461	406,{/* 488 */
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	next;
	mes "�]�]�ڐ��I��ł��������]";
	mes "�@";
	mes "���ݒn : ���E�쓌3F";
	next;
	if($@tiamat_hound < 10) {
		switch(select("��߂�","^888888���E�쓌B1F^000000","���E�쓌1F","^888888���E�쓌2F^000000","^888888���E�쓌����^000000","^888888���E��A����^000000")) {
		default:
		case 1:
			close;
		case 3:
			warp "1_tiamat_16.gat",60,47;
			end;
		}
	}
	else {
		switch(select("��߂�","���E�쓌B1F","���E�쓌1F","���E�쓌2F","���E�쓌����","���E��A����")) {
		case 1:
			close;
		case 2:
			warp "1_tiamat_19.gat",27,24;	//���E�쓌B1F
			end;
		case 3:
			warp "1_tiamat_16.gat",60,47;	//���E�쓌1F
			end;
		case 4:
			warp "1_tiamat_17.gat",60,38;	//���E�쓌2F
			end;
		case 5:
			warp "1_tiamat_03.gat",200,346;	//���E�쓌����
			end;
		case 6:
			warp "1_tiamat_03.gat",108,248;	//���E��A����
			end;
		}
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "�]�ڂ̐Δ�#r461"; //476
	end;
}
1_tiamat_19.gat,23,29,5	script	�]�ڂ̐Δ�#r431	406,{/* 493 */
	misceffect 9,""; //self
	mes "�]�Δ�Ɏ����������";
	mes "�@�s�v�c�ȗ͂���������]";
	next;
	mes "�]�]�ڐ��I��ł��������]";
	mes "�@";
	mes "���ݒn : ���E�쓌B1F";
	next;
	switch(select("��߂�","���E�쓌1F","���E�쓌2F","���E�쓌3F","���E�쓌����","���E��A����")) {
	case 1:
		close;
	case 2:
		warp "1_tiamat_16.gat",60,47;	//���E�쓌1F
		end;
	case 3:
		warp "1_tiamat_17.gat",60,38;	//���E�쓌2F
		end;
	case 4:
		warp "1_tiamat_18.gat",49,41;	//���E�쓌3F
		end;
	case 5:
		warp "1_tiamat_03.gat",200,346;	//���E�쓌����
		end;
	case 6:
		warp "1_tiamat_03.gat",108,248;	//���E��A����
		end;
	}
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 6, "�]�ڂ̐Δ�#r431"; //476
	end;
}
1_tiamat_19.gat,18,36,4	script	�T�^�i�L�A#r43	844,{/* 495 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<15);
	announce "��16�̎��V�g ���̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_19.gat,18,36,4	script	���V�g�̖S�[#r43	802,{/* 496 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r43"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r43"; //496
	misceffect 668, "���V�g�̖S�[#r43"; //496
	announce "�H�H�H�H : ���߂�^���鎞�Ԃ́A���͂�߂��������B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�T�^�i�L�A#r43",20475;
	hideoffnpc "�T�^�i�L�A#r43"; //495
	misceffect 1065, "�T�^�i�L�A#r43"; //495
	misceffect 1019, "�T�^�i�L�A#r43"; //495
	announce "���҂��̐����������ɋ����A[���E�쓌B1F] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_19.gat",16,16,43,39,"123";
	end;
OnTimer9000:
	misceffect 903, "�T�^�i�L�A#r43"; //495
	announce "�T�^�i�L�A : �䂪�{��ꌂ�ŁA���̐g�𕲁X�ɑł��ӂ��Ă�낤�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�T�^�i�L�A#r43"; //495
	setnpcdisplay "�T�^�i�L�A#r43",844;
	monster "this",18,36,"���̉��g",20475,1,"tiamat_mob#r43::OnKilled3";
	end;
}

1_tiamat_23.gat,151,160,1	script	������K#r194	10045,{/* 553 (hide)*/
	set '@dist,distance(getcharid(3));
	if('@dist > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else if('@dist > 2)
		unittalk getcharid(3),strcharinfo(0)+" : �K�̒��ɏ����Ȑ΂������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		misceffect 9,"";	// self
		mes "�]�K�̒��ɂ���΂Ɏ��G����";
		mes "�@���̒��ɐ����������]";
		next;
		unittalk "���̗͂�S�ĕ�����c�c";	// 88627
		mes "[�H�H�H�H]";
		mes "���̗͂�S�ĕ�����c�c";
		next;
		if(select("�����l����","�͂������") == 1) {
			mes "�]���Ȃ��͗����������]";
			close;
		}
		if('flag) close;
		set 'flag,1;
		misceffect 59,"������K#r194";	// 88627
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		soundeffect "wraith_die.wav", 0, 0;	// 0
		hideonnpc "area#r1941";	// 92925
		hideoffnpc "area#k1941";	// 92925
		monster "this",165,159,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
		announce "[�J�^�R���x ��@] �̔������A�����X�^�[�������ꂽ", 0x9, 0xee82ee, 0x0190, 30, 0, 0;
		donpcevent "������K#r194::OnSpawn";
		close;
	}
	end;
OnSpawn:
	areamonster "this",150,151,164,165,"�����̂�����",3977,10,strnpcinfo(0)+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count < 5 && 'flag < 5) {
		set 'flag,'flag+1;
		areamonster "this",150,151,164,165,"�����̂�����",3977,10,strnpcinfo(0)+ "::OnKilled";
	}
	else if('@count == 0 && 'flag >= 5) {
		misceffect 459,"������K#r194";	// 88627
		hideonnpc "������K#r194";	// 88627
		misceffect 406,"area#r1941";	// 92925
		hideonnpc "area#k1941";	// 92925
		hideoffnpc "area#r1941";	// 92925
		announce "[�J�^�R���x ��@] �̕�����K�͕��ꋎ��A[�J�^�R���x �ʘH] �ւ̔����ĂъJ���ꂽ", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "this",strnpcinfo(0)+ "::OnKilled2";
		if(getvariableofnpc('flag,"������K#r195") >= 5 && getvariableofnpc('flag,"������K#r196") >= 5) {
			sleep 3000;
			announce "[�J�^�R���x �Ւd] �Ɉ��u����Ă�����V�g�̕��󂪉����ꂽ", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			killmonster "1_tiamat_36.gat","tiamat_mob#r193::OnKilled2";
		}
	}
	end;
OnKilled2:
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 589,"������K#r194";
	end;
}
1_tiamat_23.gat,162,138,1	script	������K#r195	10045,{/* 554 (hide)*/
	set '@dist,distance(getcharid(3));
	if('@dist > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else if('@dist > 2)
		unittalk getcharid(3),strcharinfo(0)+" : �K�̒��ɏ����Ȑ΂������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		misceffect 9,"";	// self
		mes "�]�K�̒��ɂ���΂Ɏ��G����";
		mes "�@���̒��ɐ����������]";
		next;
		unittalk "���̗͂�S�ĕ�����c�c";	// 88627
		mes "[�H�H�H�H]";
		mes "���̗͂�S�ĕ�����c�c";
		next;
		if(select("�����l����","�͂������") == 1) {
			mes "�]���Ȃ��͗����������]";
			close;
		}
		if('flag) close;
		set 'flag,1;
		misceffect 59,"������K#r195";	// 88627
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		soundeffect "wraith_die.wav", 0, 0;	// 0
		hideonnpc "area#r1951";	// 92925
		hideoffnpc "area#k1951";	// 92925
		monster "this",155,130,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
		announce "[�J�^�R���x ��A] �̔������A�����X�^�[�������ꂽ", 0x9, 0xee82ee, 0x0190, 30, 0, 0;
		donpcevent "������K#r195::OnSpawn";
		close;
	}
	end;
OnSpawn:
	areamonster "this",150,131,166,146,"�����̂�����",3977,10,strnpcinfo(0)+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count < 5 && 'flag < 5) {
		set 'flag,'flag+1;
		areamonster "this",150,131,166,146,"�����̂�����",3977,10,strnpcinfo(0)+ "::OnKilled";
	}
	else if('@count == 0 && 'flag >= 5) {
		misceffect 459,"������K#r195";	// 88627
		hideonnpc "������K#r195";	// 88627
		misceffect 406,"area#r1951";	// 92925
		hideonnpc "area#k1951";	// 92925
		hideoffnpc "area#r1951";	// 92925
		announce "[�J�^�R���x ��A] �̕�����K�͕��ꋎ��A[�J�^�R���x �ʘH] �ւ̔����ĂъJ���ꂽ", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "this",strnpcinfo(0)+ "::OnKilled2";
		if(getvariableofnpc('flag,"������K#r194") >= 5 && getvariableofnpc('flag,"������K#r196") >= 5) {
			sleep 3000;
			announce "[�J�^�R���x �Ւd] �Ɉ��u����Ă�����V�g�̕��󂪉����ꂽ", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			killmonster "1_tiamat_36.gat","tiamat_mob#r193::OnKilled2";
		}
	}
	end;
OnKilled2:
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 589,"������K#r195";
	end;
}
1_tiamat_23.gat,134,145,1	script	������K#r196	10045,{/* 555 (hide)*/
	set '@dist,distance(getcharid(3));
	if('@dist > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else if('@dist > 2)
		unittalk getcharid(3),strcharinfo(0)+" : �K�̒��ɏ����Ȑ΂������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		misceffect 9,"";	// self
		mes "�]�K�̒��ɂ���΂Ɏ��G����";
		mes "�@���̒��ɐ����������]";
		next;
		unittalk "���̗͂�S�ĕ�����c�c";	// 88627
		mes "[�H�H�H�H]";
		mes "���̗͂�S�ĕ�����c�c";
		next;
		if(select("�����l����","�͂������") == 1) {
			mes "�]���Ȃ��͗����������]";
			close;
		}
		if('flag) close;
		set 'flag,1;
		misceffect 59,"������K#r196";	// 88627
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		soundeffect "wraith_die.wav", 0, 0;	// 0
		hideonnpc "area#r1961";	// 92925
		hideoffnpc "area#k1961";	// 92925
		monster "this",131,133,"#EF_001",3869,1,strnpcinfo(0)+ "::OnKilled2";
		announce "[�J�^�R���x ��B] �̔������A�����X�^�[�������ꂽ", 0x9, 0xee82ee, 0x0190, 30, 0, 0;
		donpcevent "������K#r196::OnSpawn";
		close;
	}
	end;
OnSpawn:
	areamonster "this",131,129,143,144,"�����̂�����",3977,10,strnpcinfo(0)+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count < 5 && 'flag < 5) {
		set 'flag,'flag+1;
		areamonster "this",131,129,143,144,"�����̂�����",3977,10,strnpcinfo(0)+ "::OnKilled";
	}
	else if('@count == 0 && 'flag >= 5) {
		misceffect 459,"������K#r196";	// 88627
		hideonnpc "������K#r196";	// 88627
		misceffect 406,"area#r1961";	// 92925
		hideonnpc "area#k1961";	// 92925
		hideoffnpc "area#r1961";	// 92925
		announce "[�J�^�R���x ��B] �̕�����K�͕��ꋎ��A[�J�^�R���x �ʘH] �ւ̔����ĂъJ���ꂽ", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "this",strnpcinfo(0)+ "::OnKilled2";
		if(getvariableofnpc('flag,"������K#r194") >= 5 && getvariableofnpc('flag,"������K#r195") >= 5) {
			sleep 3000;
			announce "[�J�^�R���x �Ւd] �Ɉ��u����Ă�����V�g�̕��󂪉����ꂽ", 0x9, 0xffff00, 0x0190, 30, 0, 0;
			killmonster "1_tiamat_36.gat","tiamat_mob#r193::OnKilled2";
		}
	}
	end;
OnKilled2:
	end;
OnStart:
	set 'flag,0;
	initnpctimer;
	end;
OnTimer2000:
	initnpctimer;
	misceffect 589,"������K#r196";
	end;
}
1_tiamat_23.gat,151,160,1	script	������K#k194	10045,{/* 556 (hide)*/}
1_tiamat_23.gat,162,138,1	script	������K#k195	10045,{/* 557 (hide)*/}
1_tiamat_23.gat,134,145,1	script	������K#k196	10045,{/* 558 (hide)*/}
1_tiamat_23.gat,158,158,0	script	gate08_001#1_tiamat_23	139,15,15,{/* 559 (hide)*/
	sc_start EFST_ABYSS_006,1000,100;	//�c��ւ̌��g : DEX-100
	end;
}
1_tiamat_23.gat,159,137,0	script	gate09_001#1_tiamat_23	139,15,15,{/* 560 (hide)*/
	sc_start EFST_ABYSS_006,1000,100;	//�c��ւ̌��g : DEX-100
	end;
}
1_tiamat_23.gat,137,137,0	script	gate10_001#1_tiamat_23	139,15,15,{/* 561 (hide)*/
	sc_start EFST_ABYSS_006,1000,100;	//�c��ւ̌��g : DEX-100
	end;
}
1_tiamat_25.gat,186,14,4	script	���o�[#315_1	10042,{/* 580 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		set '@count,getmapmobs("this","tiamat_mob#r132::OnKilled2");
		if('@count) {
			unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1;
			end;
		}
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�č� �Ŏ畔��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r61") == 0) {	// ���E�k�� 2F�A�|���Ă�����
		misceffect 234, "area#r612";
		misceffect 406, "area#k612";
		killmonster "1_tiamat_02.gat","tiamat_mob#r61::OnKilled2";
		hideonnpc "area#k612"; //1258
		hideoffnpc "area#r612"; //1258
	}
	announce "�u���E�k��1F�v�́u���E�k��2F�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_26.gat,232,175,1	script	�����̐Δ�#r199	406,{/* 607 (hide)*/
	misceffect 9,"";	// self
	mes "�]�Δ�Ɏ��G����";
	mes "�@���̒��ɐ����������]";
	next;
	mes "[�����̐Δ�]";
	mes "��������Ɉ�₤�B";
	mes "���������";
	mes "�u�F��̊ԁv�ւ̓����J�����B";
	mes "�A���A�ԈႦ���ꍇ��";
	mes "�u��������v�ւƓ]������B";
	next;
	mes "[�����̐Δ�]";
	mes "���A�����͂�낵�����H";
	next;
	if(select("�����l����","�����ɒ��킷��") == 1) {
		mes "[�����̐Δ�]";
		mes "�Y�ނ̂��ǂ����낤�B";
		mes "�܂����邪�ǂ��B";
		close;
	}
	unittalk "�u"+strcharinfo(0)+"�v���������J�n���܂�";	// 28771
	initnpctimer;
	if('quiz == 0)
		set 'quiz,rand(1,4);
	switch('@r) {
	case 1:
		mes "���3F�O���[�g�z�[���ɑ��݂���";
		mes "�M�̖����͉������B";
		next;
		input '@num;
		//TODO
		if('@num <= 0) {
			mes "[�����̐Δ�]";
			mes "�Y�ނ̂��ǂ����낤�B";
			mes "�܂����邪�ǂ��B";
			close;
		}
		unittalk getcharid(3),strcharinfo(0)+" : " +'@num+ "�� !!";
		set '@true,1;
		break;
	case 2:
		mes "�����_�ŉ�����ꂽ���V�g��";
		mes "���̂��B";
		next;
		input '@num;
		//TODO
		if('@num <= 0) {
			mes "[�����̐Δ�]";
			mes "�Y�ނ̂��ǂ����낤�B";
			mes "�܂����邪�ǂ��B";
			close;
		}
		unittalk getcharid(3),strcharinfo(0)+" : " +'@num+ "�� !!";
		set '@true,1;
		break;
	case 3:
		unittalk "�����̐Δ� : ������(" +gettime(3)+ "��" +gettime(2)+ "��" +gettime(1)+ "�b)�Łu����@�v�͊J���Ă��邩�A�܂��Ă��邩�H";	// 28771
		mes "[�����̐Δ�]";
		mes "������(" +gettime(3)+ "��" +gettime(2)+ "��" +gettime(1)+ "�b)��";
		mes "�u����@�v��";
		mes "�J���Ă��邩�A�܂��Ă��邩�H";
		set '@gate1,getvariableofnpc('flag,"����@�J���u#k73CG08");
		next;
		switch(select("�J���Ă���","�܂��Ă���")) {
		case 1:
			unittalk getcharid(3),strcharinfo(0)+" : �J���Ă��� !!";
			if('@gate1 == 0)
				set '@true,1;
			end;
		case 2:
			unittalk getcharid(3),strcharinfo(0)+" : �܂��Ă��� !!";
			if('@gate1 == 1)
				set '@true,1;
			end;
		}
		break;
	case 4:
		unittalk "�����̐Δ� : ������(" +gettime(3)+ "��" +gettime(2)+ "��" +gettime(1)+ "�b)�Łu����A�v�͊J���Ă��邩�A�܂��Ă��邩�H";	// 28771
		mes "[�����̐Δ�]";
		mes "������(" +gettime(3)+ "��" +gettime(2)+ "��" +gettime(1)+ "�b)��";
		mes "�u����A�v��";
		mes "�J���Ă��邩�A�܂��Ă��邩�H";
		set '@gate2,getvariableofnpc('flag,"����A�J���u#k74AG08");
		next;
		switch(select("�J���Ă���","�܂��Ă���")) {
		case 1:
			unittalk getcharid(3),strcharinfo(0)+" : �J���Ă��� !!";
			if('@gate2 == 0)
				set '@true,1;
			end;
		case 2:
			unittalk getcharid(3),strcharinfo(0)+" : �܂��Ă��� !!";
			if('@gate2 == 1)
				set '@true,1;
			end;
		}
		break;
	case 5:
		//mes "[�����̐Δ�]";
		//mes "�l�R�m���[�E�F���͍��ǂ��ɋ���H";
		//mes "�@";
		//mes "^ff0000�񓚂�I�����";
		//mes "�����`�F�b�N���s���܂�^000000";
		//next;
		//switch(select("���̑��G���A","��ǃG���A","���E��@�G���A","���E��A�G���A","���E�쓌�G���A","���E�쐼�G���A","���E���G���A","���E���G���A","���E�k���G���A","���E�k���G���A","���E�k�@�G���A","���E�k�A�G���A","��1F�G���A","��2F�G���A","��3F�G���A","��B1F�G���A","�č��G���A","����1F�G���A","����2F�G���A","�g�p�l���Z��G���A","����1F�G���A","����2F�G���A","���O�G���A","�_�a1F�G���A","�_�aB1F�G���A","�_�aB2F�G���A","�J�^�R���x�G���A")) {

	}
	unittalk "�c�c";	// 28771
	mes "[�����̐Δ�]";
	mes "�c�c";
	close2;
	if('@true) {
		//areasoundeffect "complete.wav", 0, 0;	// 0
		unittalk "������!!�@�ʂ邪�ǂ��B";	// 28771
		sleep 2000;
		misceffect 234,"area#r1992";	// 27360
		announce "�u"+strcharinfo(0)+"�v�������u����̃��h���v���N���A���܂���", 0x9, 0xffff00, 0x0190, 30, 0, 0;
		misceffect 459,"�����̐Δ�#r199";	// 28771
		hideonnpc "�����̐Δ�#r199";	// 28771
		sleep 2000;
		misceffect 406,"area#r1992";	// 27360
		hideoffnpc "area#r1992";	// 27360
		hideonnpc "area#k1992";	// 27360
		announce "[�J�^�R���x ������] �� [�J�^�R���x �F��̊�]�̔����J����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
		killmonster "1_tiamat_26.gat","tiamat_mob#r199::OnKilled2";
//		soundeffect "complete.wav", 0, 0;	// 0
//		unittalk getnpcid(0,"�����̐Δ�#r199_0qf"),"������!!�@�ʂ邪�ǂ��B";	// 28771
//		announce "�u"+strcharinfo(0)+"�v�������u����̃��h���v���N���A���܂���", 0x9, 0xffff00, 0x0190, 30, 0, 0;
//		misceffect 222,"area#r1992";	// 27360
//		sleep 2000;
//		misceffect 488,"area#r1992";	// 27360
//		announce "[�J�^�R���x ������] �� [�J�^�R���x �F��̊�]�̔����J����܂���", 0x9, 0x00ebff, 0x0190, 30, 0, 0;
//		sleep 2000;
//		misceffect 321,"area#r1992";	// 27360
//		hideoffnpc "area#r1992";	// 27360
//		killmonster "1_tiamat_26.gat","tiamat_mob#r199::OnKilled2";
//		misceffect 459,"�����̐Δ�#r199";	// 28771
//		hideonnpc "�����̐Δ�#r199";	// 28771
	}
	else {
		//TODO
		unittalk "�s����!!�@���邪�ǂ��B";	// 28771
		sleep 2000;
		warp "1_tiamat_00.gat",182,150;
	}
	end;
OnTimer60000:
	stopnpctimer;
	set 'quiz,rand(1,4);
	end;
}
1_tiamat_26.gat,57,49,0	script	area#r128_01	139,{/* 608 (hide)*/}
1_tiamat_26.gat,85,49,0	script	area#r128_02	139,{/* 609 (hide)*/}
1_tiamat_26.gat,113,49,0	script	area#r128_03	139,{/* 610 (hide)*/}
1_tiamat_26.gat,141,49,0	script	area#r128_04	139,{/* 611 (hide)*/}
1_tiamat_26.gat,96,32,0	script	area#r128_05	139,{/* 612 (hide)*/}
1_tiamat_26.gat,71,26,0	script	area#r128_06	139,{/* 613 (hide)*/}
1_tiamat_26.gat,66,213,0	script	area#r129_01	139,{/* 614 (hide)*/}
1_tiamat_26.gat,66,183,0	script	area#r129_02	139,{/* 615 (hide)*/}
1_tiamat_26.gat,66,155,0	script	area#r129_03	139,{/* 616 (hide)*/}
1_tiamat_26.gat,134,103,0	script	area#r130_01	139,{/* 617 (hide)*/}
1_tiamat_26.gat,120,83,0	script	area#r130_02	139,{/* 618 (hide)*/}
1_tiamat_26.gat,92,83,0	script	area#r130_03	139,{/* 619 (hide)*/}
1_tiamat_26.gat,64,83,0	script	area#r130_04	139,{/* 620 (hide)*/}
1_tiamat_26.gat,45,97,0	script	area#r130_05	139,{/* 621 (hide)*/}
1_tiamat_26.gat,88,91,0	script	area#r130_06	139,{/* 622 (hide)*/}
1_tiamat_26.gat,184,176,3	script	�ٌ`�̈ē��l#r199A	451,{/* 623 */
	mes "^0000FF�]���H�ɂ͕������|�����Ă���B";
	mes "�@���������ɓn��ɂ�";
	mes "�@�����𗘗p���邵���Ȃ��悤���]^000000";
	next;
	mes "[�ٌ`�̈ē��l]";
	mes "����ȏ��Ől�Ɖ�Ƃ́c�c";
	mes "�܂���������|���ɗ����̂��H";
	mes "����Ȃ���݂��Ă�낤�B";
	mes "�����ɂ́A����Ȏp�ɕς���ꂽ";
	mes "���݂������łȂ��c�c�������B";
	next;
	mes "[�ٌ`�̈ē��l]";
	mes "���̕����́A���̗ʂɂ����";
	mes "���p�ł��鎞�������";
	mes "�ł��Ȃ���������B";
	set '@gate1,getvariableofnpc('flag,"����@�J���u#k73CG08");
	set '@gate2,getvariableofnpc('flag,"����A�J���u#k74AG08");
	switch('@gate1 + '@gate2) {
	case 0:
		mes "���́A���傪�����J���Ă���ȁB";
		mes "^FF0000���̗��ꂪ��������^000000����";
		mes "�����͗��p�ł��Ȃ����B";
		close;
	case 1:
		mes "���́A^FF0000���傤�ǂ�������^000000���B";
		mes "���������p�ł��邩��";
		mes "�����擱���Ă�낤�B";
		next;
		if(select("�����l����","�擱���Ă��炤") == 1) {
			mes "[�ٌ`�̈ē��l]";
			mes "�Ȃ񂾂��A�|�C�Â������H";
			mes "����Ȃ�Ŗ{����";
			mes "������|����̂��H";
			close;
		}
		mes "[�ٌ`�̈ē��l]";
		mes "�悵�悵�B";
		mes "���ꂶ�Ⴀ���̌�ɂ��ė����B";
		mes "�ق�A���������B";
		close2;
		soundeffect "complete.wav", 0, 0; //0
		warp "1_tiamat_26.gat",230,175;
		end;
	case 2:
		mes "���́A���傪�������Ă���ȁB";
		mes "^FF0000���ʂ�����Ȃ�^000000����";
		mes "�����͗��p�ł��Ȃ����B";
		next;
		mes "[�ٌ`�̈ē��l]";
		mes "�ӂ�c�c���͈����Ă邩��";
		mes "������邱�Ƃ͂Ȃ��Ǝv����";
		mes "^ff0000�z�o�[�����O���^000000��";
		mes "^ff0000�j�����W�����v^000000�ł��o���Ă����";
		mes "�n��邩���ȁB";
		if(getskilllv(2263) > 0)	//�z�o�[�����O
			set '@skill$,"�z�o�[�����O";
		else if(getskilllv(5023) > 0)	//�j�����W�����v
			set '@skill$,"�j�����W�����v";
		else
			close;
		next;
		mes "[�ٌ`�̈ē��l]";
		mes "�ǂ����c�c";
		mes "^ff0000" +'@skill$+ "^000000��";
		mes "�����Ă݂邩�H";
		next;
		if(select("�����l����","�����Ă݂�") ==1) {
			mes "[�ٌ`�̈ē��l]";
			mes "�Ȃ񂾂��A�|�C�Â������H";
			mes "����Ȃ�Ŗ{����";
			mes "������|����̂��H";
			close;
		}
		mes "[�ٌ`�̈ē��l]";
		mes "�悵�悵�B";
		mes "���ꂶ�Ⴀ�C������Ă�����B";
		mes "����A�����I";
		close2;
		showmessage '@skill$+ "!!";
		progressbar 1; //color=0x00ff00
		misceffect 411,""; //self
		warp "1_tiamat_26.gat",230,175;
		end;
	}
}
1_tiamat_26.gat,228,176,3	script	�ٌ`�̈ē��l#r199B	451,{/* 624 */
	mes "[�ٌ`�̈ē��l]";
	mes "�]�݂̕��͌��������̂��H";
	mes "�@";
	set '@gate1,getvariableofnpc('flag,"����@�J���u#k73CG08");
	set '@gate2,getvariableofnpc('flag,"����A�J���u#k74AG08");
	switch('@gate1 + '@gate2) {
	case 0:
		mes "���́A���傪�����J���Ă���ȁB";
		mes "^FF0000���̗��ꂪ��������^000000����";
		mes "�����͗��p�ł��Ȃ����B";
		close;
	case 1:
		mes "���́A^FF0000���傤�ǂ�������^000000���B";
		mes "���������p�ł��邩��";
		mes "�����擱���Ă�낤�B";
		next;
		if(select("�����l����","�擱���Ă��炤") == 1) {
			mes "[�ٌ`�̈ē��l]";
			mes "�Ȃ񂾂��A�|�C�Â������H";
			mes "����Ȃ�Ŗ{����";
			mes "������|����̂��H";
			close;
		}
		mes "[�ٌ`�̈ē��l]";
		mes "�悵�悵�B";
		mes "���ꂶ�Ⴀ���̌�ɂ��ė����B";
		mes "�ق�A���������B";
		close2;
		soundeffect "complete.wav", 0, 0; //0
		warp "1_tiamat_26.gat",181,175;
		end;
	case 2:
		mes "���́A���傪�������Ă���ȁB";
		mes "^FF0000���ʂ�����Ȃ�^000000����";
		mes "�����͗��p�ł��Ȃ����B";
		next;
		mes "[�ٌ`�̈ē��l]";
		mes "�ӂ�c�c���͈����Ă邩��";
		mes "������邱�Ƃ͂Ȃ��Ǝv����";
		mes "^ff0000�z�o�[�����O���^000000��";
		mes "^ff0000�j�����W�����v^000000�ł��o���Ă����";
		mes "�n��邩���ȁB";
		if(getskilllv(2263) > 0)	//�z�o�[�����O
			set '@skill$,"�z�o�[�����O";
		else if(getskilllv(5023) > 0)	//�j�����W�����v
			set '@skill$,"�j�����W�����v";
		else
			close;
		next;
		mes "[�ٌ`�̈ē��l]";
		mes "�ǂ����c�c";
		mes "^ff0000" +'@skill$+ "^000000��";
		mes "�����Ă݂邩�H";
		next;
		if(select("�����l����","�����Ă݂�") ==1) {
			mes "[�ٌ`�̈ē��l]";
			mes "�Ȃ񂾂��A�|�C�Â������H";
			mes "����Ȃ�Ŗ{����";
			mes "������|����̂��H";
			close;
		}
		mes "[�ٌ`�̈ē��l]";
		mes "�悵�悵�B";
		mes "���ꂶ�Ⴀ�C������Ă�����B";
		mes "����A�����I";
		close2;
		showmessage '@skill$+ "!!";
		progressbar 1; //color=0x00ff00
		misceffect 411,""; //self
		warp "1_tiamat_26.gat",181,175;
		end;
	}
}
1_tiamat_26.gat,100,23,4	script	�n�i�G��#r128	844,{/* 625 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<14);
	announce "��15�̎��V�g �����̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_26.gat,100,23,4	script	���V�g�̖S�[#r128	802,{/* 626 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r168"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r168"; //496
	misceffect 668, "���V�g�̖S�[#r168"; //496
	announce "�H�H�H�H : �䂪�O�Ɍ����Ƃ́A���O�͂ƂĂ��^���ǂ��B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�n�i�G��#r128",20466;
	hideoffnpc "�n�i�G��#r128"; //495
	misceffect 1065, "�n�i�G��#r128"; //495
	misceffect 1019, "�n�i�G��#r128"; //495
	announce "���҂��̐����������ɋ����A[��B1F ���H01] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",85,45,110,10,"123";
	end;
OnTimer9000:
	misceffect 903, "�n�i�G��#r128"; //495
	announce "�n�i�G�� : �䂪��ɂ�����Έ����̎��𓾂���̂�����ȁB", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�n�i�G��#r128"; //495
	setnpcdisplay "�n�i�G��#r128",844;
	monster "this",100,23,"�����̉��g",20466,1,"tiamat_mob#r168::OnKilled2";
	end;
}
1_tiamat_29.gat,262,246,4	script	�K���r�G��#r10	844,{/* 651 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<16);
	announce "��17�̎��V�g ���̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_29.gat,262,246,4	script	���V�g�̖S�[#r10	802,{/* 652 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r10"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r10"; //496
	misceffect 668, "���V�g�̖S�[#r10"; //496
	announce "�H�H�H�H : ��]��������΁c�c�l�͐����Ă����Ȃ��炵���ȁH", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�K���r�G��#r10",20467;
	hideoffnpc "�K���r�G��#r10"; //495
	misceffect 1065, "�K���r�G��#r10"; //495
	misceffect 1019, "�K���r�G��#r10"; //495
	announce "���҂��̐����������ɋ����A[���̑� ��n] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",85,45,110,10,"123";
	end;
OnTimer9000:
	misceffect 903, "�K���r�G��#r10"; //495
	announce "�K���r�G�� : �ł́A��]���ӂ��Đ�]������Ă�낤�c�c�����ʂĂ�I", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�K���r�G��#r10"; //495
	setnpcdisplay "�K���r�G��#r10",844;
	monster "this",262,246,"���̉��g",20467,1,"tiamat_mob#r10::OnKilled2";
	end;
}
1_tiamat_31.gat,79,287,4	script	���o�[#104_1	10042,{/* 691 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����2F ������] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	misceffect 234, "area#r1481";
	misceffect 234, "area#r1482";
	misceffect 406, "area#k1481";
	misceffect 406, "area#k1482";
	killmonster "1_tiamat_31.gat","tiamat_mob#r148::OnKilled2";
	killmonster "1_tiamat_31.gat","tiamat_mob#r148::OnKilled3";
	hideonnpc "area#k1481";
	hideonnpc "area#k1482";
	hideoffnpc "area#r1481";
	hideoffnpc "area#r1482";
	announce "�u����2F�ʘH�v�́u����2F�啔���v�u����1F�ʘH�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,204,287,4	script	���o�[#311_1	10042,{/* 692 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����1F �����@] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#311_1")+getvariableofnpc('flag,"���o�[#311_2")+getvariableofnpc('flag,"���o�[#311_3")+getvariableofnpc('flag,"���o�[#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "�u����1F�ʘH�v�́u����1F����Ɂv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,142,188,4	script	���o�[#311_2	10042,{/* 693 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����1F �����A] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#311_1")+getvariableofnpc('flag,"���o�[#311_2")+getvariableofnpc('flag,"���o�[#311_3")+getvariableofnpc('flag,"���o�[#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "�u����1F�ʘH�v�́u����1F����Ɂv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,211,185,4	script	���o�[#311_3	10042,{/* 694 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����1F �����B] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#311_1")+getvariableofnpc('flag,"���o�[#311_2")+getvariableofnpc('flag,"���o�[#311_3")+getvariableofnpc('flag,"���o�[#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "�u����1F�ʘH�v�́u����1F����Ɂv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,266,188,4	script	���o�[#311_4	10042,{/* 695 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����1F �����C] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	misceffect 234, "area#r1427";
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#311_1")+getvariableofnpc('flag,"���o�[#311_2")+getvariableofnpc('flag,"���o�[#311_3")+getvariableofnpc('flag,"���o�[#311_4") < 4)
		end;
	misceffect 406, "area#k1427";
	killmonster "1_tiamat_31.gat","tiamat_mob#r142::OnKilled3";
	hideonnpc "area#k1427";
	hideoffnpc "area#r1427";
	announce "�u����1F�ʘH�v�́u����1F����Ɂv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_31.gat,17,18,4	script	�o���r�G��#r149	844,{/* 698 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<12);
	announce "��13�̎��V�g ���_�̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_31.gat,17,18,4	script	���V�g�̖S�[#r149	802,{/* 699 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r149"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r149"; //496
	misceffect 668, "���V�g�̖S�[#r149"; //496
	announce "�H�H�H�H : ���傤�Ǒ��肪�~���������񂾁B���̃_���X��x���Ă���鑊������B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�o���r�G��#r149",20464;
	hideoffnpc "�o���r�G��#r149"; //495
	misceffect 1065, "�o���r�G��#r149"; //495
	misceffect 1019, "�o���r�G��#r149"; //495
	announce "���҂��̐����������ɋ����A[����2F �啔��] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",14,14,27,28,"123";
	end;
OnTimer9000:
	misceffect 903, "�o���r�G��#r149"; //495
	announce "�o���r�G�� : �����A���ʂ܂ŗx�낤�B���R�A���肵�Ă���邾��H", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�o���r�G��#r149"; //495
	setnpcdisplay "�o���r�G��#r149",844;
	monster "this",17,18,"���_�̉��g",20464,1,"tiamat_mob#r149::OnKilled2";
	end;
}
1_tiamat_32.gat,15,183,4	script	���o�[#109_1	10042,{/* 725 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�g�p�l���Z�� ������] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	if(getvariableofnpc('flag,"tiamat_mob#r157") == 0) {
		misceffect 234, "area#r1571";
		misceffect 234, "area#r1573";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r6") == 0) {
		misceffect 234, "area#r62";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r89") == 0) {
		misceffect 234, "area#r892";
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r157") == 0) {	//������
		misceffect 406, "area#k1571";
		misceffect 406, "area#k1573";
		killmonster "1_tiamat_32.gat","tiamat_mob#r157::OnKilled2";
		hideonnpc "area#k1571";
		hideonnpc "area#k1573";
		hideoffnpc "area#r1571";
		hideoffnpc "area#r1573";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r89") == 0) {	//����ʘH1F02
		misceffect 406, "area#k892";
		killmonster "1_tiamat_42.gat","tiamat_mob#r89::OnKilled2";
		hideonnpc "area#k892";
		hideoffnpc "area#r892";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r6") == 0) {	//����
		misceffect 406, "area#k62";
		killmonster "1_tiamat_38.gat","tiamat_mob#r6::OnKilled2";
		hideonnpc "area#k62";
		hideoffnpc "area#r62";
	}
	announce "�u������v�́u����ʘH1F02�v�u����v�A�u���E�k�A2F�v�́u����ʘH2F03�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_32.gat,29,119,4	script	�Α�#r98_001	10070,{/* 726 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,32,119,4	script	�Α�#r98_002	10070,{/* 727 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,35,119,4	script	�Α�#r98_003	10070,{/* 728 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,38,119,4	script	�Α�#r98_004	10070,{/* 729 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,29,112,8	script	�Α�#r98_005	10070,{/* 730 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,32,112,8	script	�Α�#r98_006	10070,{/* 731 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,35,112,8	script	�Α�#r98_007	10070,{/* 732 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,38,112,8	script	�Α�#r98_008	10070,{/* 733 */
	mes "�]�Α��ɂ́u" +'flag+ "�v�̐�����";
	mes "�@���܂�Ă���]";
	close;
}
1_tiamat_32.gat,26,115,4	script	���܂����Ă���#r98_001	10131,{/* 734 (hide)*/}
1_tiamat_32.gat,29,115,4	script	���܂����Ă���#r98_002	10131,{/* 735 (hide)*/}
1_tiamat_32.gat,32,115,4	script	���܂����Ă���#r98_003	10131,{/* 736 (hide)*/}
1_tiamat_32.gat,35,115,4	script	���܂����Ă���#r98_004	10131,{/* 737 (hide)*/}
1_tiamat_32.gat,38,115,4	script	���܂����Ă���#r98_005	10131,{/* 738 (hide)*/}
1_tiamat_32.gat,41,115,4	script	���܂����Ă���#r98_006	10131,{/* 739 (hide)*/}
1_tiamat_33.gat,281,278,1	script	����A�J���u#k74AG08	10046,{/* 748 (hide)*/
	unittalk "�����������Ă���c�c",1;
	end;
OnStart:
	initnpctimer;
	set 'flag,1;
	unittalk "�n�����H�̐����}���Ɉ����n�߂��c�c";
	hideoffnpc "����A�J���u#r74AG08"; //749
	hideonnpc "����A�J���u#k74AG08"; //748
	announce "[���E�k�A B1F] �̐��傪����ꂽ", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_26.gat","[���E�k�A B1F] �̐��傪����ꂽ", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	areasoundeffect "this",254,264,277,293,"se_water_fall02.wav", 0, 0; //0
	end;
OnTimer3000:
	mapannounce "1_tiamat_26.gat","[��B1F ���H03] �̐��������n�߂܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	// ��s���Ă邩�`�F�b�N
	if(getvariableofnpc('flag,"tiamat_mob#r125") == 0) {	// ����ʘH B1F�A�����|���Ă��琅�H 03���
		killmonster "1_tiamat_26.gat","tiamat_mob#r125::OnKilled2";
		misceffect 234, "area#r1251";
		misceffect 406, "area#r1251";
		hideonnpc "area#k1251"; //1258
		hideoffnpc "area#r1251"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r12") == 0) {	// �k��˂̒�A�����|���Ă��琅�H 03���
		killmonster "1_tiamat_05.gat","tiamat_mob#r12::OnKilled2";
		misceffect 234, "area#r122";
		misceffect 406, "area#r122";
		hideonnpc "area#k122"; //1258
		hideoffnpc "area#r122"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r130") == 0) {	// ���H 03�A�|���Ă�����
		killmonster "1_tiamat_26.gat","tiamat_mob#r130::OnKilled2";
		misceffect 234, "area#r1301";
		misceffect 234, "area#r1302";
		misceffect 234, "area#r1303";
		misceffect 406, "area#r1301";
		misceffect 406, "area#r1302";
		misceffect 406, "area#r1303";
		hideonnpc "area#k1301"; //1258
		hideoffnpc "area#r1301"; //1258
		hideonnpc "area#k1302"; //1258
		hideoffnpc "area#r1302"; //1258
		hideonnpc "area#k1303"; //1258
		hideoffnpc "area#r1303"; //1258
	}
	end;
OnTimer6000:
	stopnpctimer;
	if(getvariableofnpc('flag,"����@�J���u#k73CG08") == 0)
		mapannounce "1_tiamat_26.gat","[��B1F ���H01] �͔������̐��ʂɌ���܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	else {
		mapannounce "1_tiamat_26.gat","[��B1F ���H01] �̐����͂�n�߂܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
		if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {	// ���˂̒�A�|���Ă�����
			killmonster "1_tiamat_05.gat","tiamat_mob#r13::OnKilled3";
			misceffect 234, "area#r132";
			misceffect 406, "area#r132";
			hideonnpc "area#k132"; //���˂̒�->���H01
			hideoffnpc "area#r132"; //���˂̒�->���H01
		}
		if(getvariableofnpc('flag,"tiamat_mob#r126") == 0) {	// ������A�|���Ă�����
			killmonster "1_tiamat_26.gat","tiamat_mob#r126::OnKilled2";
			misceffect 234, "area#r1263";
			misceffect 406, "area#r1263";
			hideonnpc "area#k1263"; //�����->���H01
			hideoffnpc "area#r1263"; //�����->���H01
		}
	}
	end;
}
1_tiamat_33.gat,281,278,1	script	����A�J���u#r74AG08	10046,{/* 749 */
	unittalk "����A�͕܂��Ă���c�c�B",1;
	end;
}
1_tiamat_34.gat,200,217,4	script	���o�[#107_1	10042,{/* 767 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�g�p�l���Z�� �g�p�l�����@] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#107_1")+getvariableofnpc('flag,"���o�[#107_2")+getvariableofnpc('flag,"���o�[#107_3") < 3)
		end;
	misceffect 234, "area#r1525";
	misceffect 406, "area#k1525";
	killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled3";
	hideonnpc "area#k1525";
	hideoffnpc "area#r1525";
	if(getvariableofnpc('flag,"tiamat_mob#r156") == 0) {	// ���g�������A�|���Ă�����
		misceffect 234, "area#r1561";
		misceffect 406, "area#k1561";
		killmonster "1_tiamat_51.gat","tiamat_mob#r156::OnKilled3";
		hideonnpc "area#k1561";
		hideoffnpc "area#r1561";
	}
	announce "�u�g�p�l���Z��E�L���v�́u���g�������v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,212,172,4	script	���o�[#107_2	10042,{/* 768 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�g�p�l���Z�� �g�p�l�����A] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#107_1")+getvariableofnpc('flag,"���o�[#107_2")+getvariableofnpc('flag,"���o�[#107_3") < 3)
		end;
	misceffect 234, "area#r1525";
	misceffect 406, "area#k1525";
	killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled3";
	hideonnpc "area#k1525";
	hideoffnpc "area#r1525";
	if(getvariableofnpc('flag,"tiamat_mob#r156") == 0) {	// ���g�������A�|���Ă�����
		misceffect 234, "area#r1561";
		misceffect 406, "area#k1561";
		killmonster "1_tiamat_51.gat","tiamat_mob#r156::OnKilled3";
		hideonnpc "area#k1561";
		hideoffnpc "area#r1561";
	}
	announce "�u�g�p�l���Z��E�L���v�́u���g�������v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,223,153,4	script	���o�[#107_3	10042,{/* 769 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�g�p�l���Z�� �g�p�l�����B] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"���o�[#107_1")+getvariableofnpc('flag,"���o�[#107_2")+getvariableofnpc('flag,"���o�[#107_3") < 3)
		end;
	misceffect 234, "area#r1525";
	misceffect 406, "area#k1525";
	killmonster "1_tiamat_34.gat","tiamat_mob#r152::OnKilled3";
	hideonnpc "area#k1525";
	hideoffnpc "area#r1525";
	if(getvariableofnpc('flag,"tiamat_mob#r156") == 0) {	// ���g�������A�|���Ă�����
		misceffect 234, "area#r1561";
		misceffect 406, "area#k1561";
		killmonster "1_tiamat_51.gat","tiamat_mob#r156::OnKilled3";
		hideonnpc "area#k1561";
		hideoffnpc "area#r1561";
	}
	announce "�u�g�p�l���Z��E�L���v�́u���g�������v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,89,41,4	script	���o�[#203_1	10042,{/* 770 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[��2F �����_�[�J���}�[] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r201") == 0) {	// �o���R�j�[�A�A�|���Ă�����
		misceffect 234, "area#r2012";
		misceffect 234, "area#r2013";
		misceffect 406, "area#k2012";
		misceffect 406, "area#k2013";
		killmonster "1_tiamat_58.gat","tiamat_mob#r201::OnKilled2";
		hideonnpc "area#k2012";
		hideonnpc "area#k2013";
		hideoffnpc "area#r2012";
		hideoffnpc "area#r2013";
	}
	mapannounce "1_tiamat_34.gat","�u�o���R�j�[�A�v�́u�ҋ@��2F�v�u���A2F�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_58.gat","�u�o���R�j�[�A�v�́u�ҋ@��2F�v�u���A2F�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_34.gat,278,220,4	script	�A�X�^���g#r113	844,{/* 772 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<2);
	announce "��3�̎��V�g ����̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_34.gat,278,220,4	script	���V�g�̖S�[#r113	802,{/* 773 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r113"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r113"; //496
	misceffect 668, "���V�g�̖S�[#r113"; //496
	announce "�H�H�H�H : �M�����A�䂪��ɋw�Ȃ��s�͂��҂ł����c�c�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�A�X�^���g#r113",20472;
	hideoffnpc "�A�X�^���g#r113"; //495
	misceffect 1065, "�A�X�^���g#r113"; //495
	misceffect 1019, "�A�X�^���g#r113"; //495
	announce "���҂��̐����������ɋ����A[��3F ���܂̐Q��] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_34.gat",268,210,288,230,"123";
	end;
OnTimer9000:
	misceffect 903, "�A�X�^���g#r113"; //495
	announce "�A�X�^���g : �ł͎�Ƃ̖���ɏ]���A���S��ł��ċM�����n���������܂��傤�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�A�X�^���g#r113"; //495
	setnpcdisplay "�A�X�^���g#r113",844;
	monster "this",278,220,"����̉��g",20472,1,"tiamat_mob#r113::OnKilled2";
	end;
}
1_tiamat_35.gat,90,178,4	script	�������A#1_tiamat_35	10361,{/* 800 (hide)*/
}
1_tiamat_36.gat,99,70,4	script	�}���L�_�G��#r193	844,{/* 818 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<3);
	announce "��4�̎��V�g �c��̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_36.gat,99,70,4	script	���V�g�̖S�[#r193	802,{/* 819 (hide)*/
	if(getmapmobs("1_tiamat_36.gat","tiamat_mob#r193::OnKilled2") > 0) {
		unittalk getcharid(3),"�S�[�ɕ��󂪎{����Ă���c�c �ǂ����ɉ�������d�|��������悤��",1;
		end;
	}
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r193"; //836
	initnpctimer;
	close;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r193"; //836
	misceffect 668, "���V�g�̖S�[#r193"; //836
	announce "�H�H�H�H : ����̗����S���ʁA���˂Ȃ�҂�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�}���L�_�G��#r193",20457;
	hideoffnpc "�}���L�_�G��#r193"; //835
	misceffect 1065, "�}���L�_�G��#r193"; //835
	misceffect 1019, "�}���L�_�G��#r193"; //835
	announce "���҂��̐����������ɋ����A[�J�^�R���x �J�^�R���x�Ւd] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",89,60,109,80,"123";
	end;
OnTimer9000:
	misceffect 903, "�}���L�_�G��#r193"; //835
	announce "�}���L�_�G�� : ���̎����ȂĎ͂���^����B�䂪���߂Ɋ��ӂ���B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�}���L�_�G��#r193"; //835
	setnpcdisplay "�}���L�_�G��#r193",844;
	monster "this",99,70,"�c��̉��g",20457,1,"tiamat_mob#r193::OnKilled3";
	end;
}
1_tiamat_37.gat,131,92,4	script	�A�K���A���v�g#r95	844,{/* 835 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<9);
	announce "��10�̎��V�g �^���̗ւ̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	misceffect 234, "area#r953";
	misceffect 406, "area#r953";
	misceffect 234, "area#r2022";
	misceffect 406, "area#r2022";
	hideonnpc "area#k953";
	hideonnpc "area#k2022";
	hideoffnpc "area#r953";
	hideoffnpc "area#r2022";
	killmonster "1_tiamat_37.gat","tiamat_mob#r95::OnKilled3";
	killmonster "1_tiamat_58.gat","tiamat_mob#r202::OnKilled2";
	if(getvariableofnpc('flag,"tiamat_mob#r105") == 0) {
		misceffect 234, "area#r1051";
		misceffect 406, "area#r1051";
		hideonnpc "area#k1051";
		hideoffnpc "area#r1051";
		killmonster "1_tiamat_42.gat","tiamat_mob#r105::OnKilled3";
	}
	announce "�u�y���̊ԁv�́u�������v�A�u�o���R�j�[�B�v�́u����ʘH2F01�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer5000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_37.gat,131,92,4	script	���V�g�̖S�[#r95	802,{/* 836 (hide)*/
	if(getvariableofnpc('flag,"�Âт�����#97") == 0) {
		unittalk getcharid(3),"�S�[�ɕ��󂪎{����Ă���c�c �ǂ����ɉ�������d�|��������悤��",1;
		end;
	}
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r95"; //836
	initnpctimer;
	close;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	if(getvariableofnpc('flag,"�Âт�����#97") == 0) {
		misceffect 675, "���V�g�̖S�[#r95"; //836
		initnpctimer;
		end;
	}
	misceffect 934, "���V�g�̖S�[#r95"; //836
	misceffect 668, "���V�g�̖S�[#r95"; //836
	announce "�H�H�H�H : ���������Ɏ���͉^���B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�A�K���A���v�g#r95",20473;
	hideoffnpc "�A�K���A���v�g#r95"; //835
	misceffect 1065, "�A�K���A���v�g#r95"; //835
	misceffect 1019, "�A�K���A���v�g#r95"; //835
	announce "���҂��̐����������ɋ����A[��2F �y���̊�] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",121,82,141,102,"123";
	end;
OnTimer9000:
	misceffect 903, "�A�K���A���v�g#r95"; //835
	announce "�A�K���A���v�g : �����āA�����ŉʂĂ���^���B�c�c�^�����󂯓����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�A�K���A���v�g#r95"; //835
	setnpcdisplay "�A�K���A���v�g#r95",844;
	monster "this",131,92,"�^���̗ւ̉��g",20473,1,"tiamat_mob#r95::OnKilled5";
	end;
}
1_tiamat_39.gat,31,173,1	script	�ޏ��̕��i#r1701_1	10025,{/* 862 */
	if(!checkweight(25362,1))
		unittalk getcharid(3),strcharinfo(0)+" : �ޏ��̕��i�������グ���Ȃ������c�c�B",1;
	else if(countitem(25362))
		unittalk getcharid(3),strcharinfo(0)+" : �󂳂Ȃ��悤�ɂЂƂ��^�ڂ��B",1;
	else {
		getitem 25362, 1;
		unittalk getcharid(3),strcharinfo(0)+" : �u�ޏ��̕��i�v����ɓ��ꂽ",1;
		misceffect 18; //863
		cloakonnpc;
		end;
	}
}
1_tiamat_39.gat,31,175,1	duplicate(�ޏ��̕��i#r1701_1)	�ޏ��̕��i#r1701_2	10025	/* 863 */
1_tiamat_39.gat,18,189,1	duplicate(�ޏ��̕��i#r1701_1)	�ޏ��̕��i#r1701_3	10025	/* 864 */
1_tiamat_39.gat,14,188,1	duplicate(�ޏ��̕��i#r1701_1)	�ޏ��̕��i#r1701_4	10025	/* 865 */

1_tiamat_39.gat,72,155,4	script	���o�[#105_1	10042,{/* 866 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[�J�^�R���x �J�^�R���x�q��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r198") == 0) {	// �J�^�R���x�ʘH�A�|���Ă�����
		misceffect 234, "area#r1983";
		misceffect 234, "area#r1984";
		misceffect 234, "area#r1985";
		misceffect 234, "area#r1986";
		misceffect 406, "area#k1983";
		misceffect 406, "area#k1984";
		misceffect 406, "area#k1985";
		misceffect 406, "area#k1986";
		killmonster "1_tiamat_23.gat","tiamat_mob#r198::OnKilled2";
		hideonnpc "area#k1983";
		hideonnpc "area#k1984";
		hideonnpc "area#k1985";
		hideonnpc "area#k1986";
		hideoffnpc "area#r1983";
		hideoffnpc "area#r1984";
		hideoffnpc "area#r1985";
		hideoffnpc "area#r1986";
	}
	announce "�u�J�^�R���x�ʘH�v�́u��@�`�C�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_40.gat,22,28,4	script	�E�F���L�G��#r8	844,{/* 881 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<7);
	announce "��8�̎��V�g �͂̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_40.gat,22,28,4	script	���V�g�̖S�[#r8	802,{/* 882 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r8"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r8"; //496
	misceffect 668, "���V�g�̖S�[#r8"; //496
	announce "�H�H�H�H : �͖����҂ɁA�����鉿�l�����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�E�F���L�G��#r8",20461;
	hideoffnpc "�E�F���L�G��#r8"; //495
	misceffect 1065, "�E�F���L�G��#r8"; //495
	misceffect 1019, "�E�F���L�G��#r8"; //495
	announce "���҂��̐����������ɋ����A[���̑� �y�R��] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "this",12,18,32,38,"123";
	end;
OnTimer9000:
	misceffect 903, "�E�F���L�G��#r8"; //495
	announce "�E�F���L�G�� : �͖����҂�B�Ȃ̔�͂�Q���̂��ȁB", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�E�F���L�G��#r8"; //495
	setnpcdisplay "�E�F���L�G��#r8",844;
	monster "this",22,28,"�͂̉��g",20461,1,"tiamat_mob#r8::OnKilled2";
	end;
}
1_tiamat_41.gat,108,31,4	script	���o�[#201_1	10042,{/* 895 */
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		set '@count,getmapmobs("this","tiamat_mob#r16::OnKilled2");
		if('@count) {
			unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1;
			end;
		}
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[��� ���@3F] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r37") == 0) {	// ���E��@ 3F�A�|���Ă�����
		misceffect 234, "area#r373";
		misceffect 406, "area#k373";
		killmonster "1_tiamat_08.gat","tiamat_mob#r37::OnKilled2";
		hideonnpc "area#k373"; //1258
		hideoffnpc "area#r373"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r50") == 0) {	// ���E�쐼 3F�A�|���Ă�����
		misceffect 234, "area#r503";
		misceffect 234, "area#r504";
		misceffect 406, "area#k503";
		misceffect 406, "area#k504";
		killmonster "1_tiamat_08.gat","tiamat_mob#r50::OnKilled2";
		hideonnpc "area#k503"; //1258
		hideonnpc "area#k504"; //1258
		hideoffnpc "area#r503"; //1258
		hideoffnpc "area#r504"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r54") == 0) {	// ���E�� 3F�A�|���Ă�����
		misceffect 234, "area#r544";
		misceffect 406, "area#k544";
		killmonster "1_tiamat_08.gat","tiamat_mob#r54::OnKilled2";
		hideonnpc "area#k544"; //1258
		hideoffnpc "area#r544"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r70") == 0) {	// ���E�k�@2F�A�|���Ă�����
		misceffect 234, "area#r703";
		misceffect 406, "area#k703";
		killmonster "1_tiamat_08.gat","tiamat_mob#r70::OnKilled2";
		hideonnpc "area#k703"; //1258
		hideoffnpc "area#r703"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r52") == 0) {	// ���E��1F�A�|���Ă�����
		misceffect 234, "area#r522";
		misceffect 406, "area#k522";
		killmonster "1_tiamat_08.gat","tiamat_mob#r52::OnKilled2";
		hideonnpc "area#k522"; //1258
		hideoffnpc "area#r522"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r4") == 0) {	// ����(��)�A�|���Ă�����
		misceffect 234, "area#r45";
		misceffect 406, "area#k45";
		killmonster "1_tiamat_13.gat","tiamat_mob#r4::OnKilled3";
		hideonnpc "area#k45"; //1258
		hideoffnpc "area#r45"; //1258
	}
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled3";
	killmonster "1_tiamat_18.gat","tiamat_mob#r46::OnKilled4";
	hideonnpc "area#k461"; //1258
	hideonnpc "area#k462"; //1258
	hideoffnpc "area#r461"; //1258
	hideoffnpc "area#r462"; //1258
	announce "�u���E��@3F�v�́u��ǒʘH01�v�A�u���E�쐼3F�v�́u��ǒʘH01�v�u��ǒʘH03�v�A�u���E��3F�v�́u��ǒʘH03�v�A�u���E�k�@2F�v�́u���2F04�v�A�u���E��1F�v�́u����(��)�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_41.gat,97,28,4	script	�O���[�U��#r16CG02	10275,{/* 897 */
	unittalk "�������Ȃ��c�����̒����̂悤���c�c";
	end;
OnStart:
	hideonnpc "�f�q������#k37CG03";
	hideonnpc "�q�����G����#k50CG04";
	hideonnpc "�W�I�C�A��#k62CG05";
	hideonnpc "�J�f�X��#k71CG06";
	monster "1_tiamat_08.gat",208,301,"�f�q������",20446,1,"tiamat_mob#r37::OnDaehyon";
	monster "1_tiamat_08.gat",180,179,"�q�����G����",20450,1,"tiamat_mob#r50::OnPyuriel";
	monster "1_tiamat_41.gat",22,87,"�W�I�C�A��",20444,1,"tiamat_mob#r62::OnGioia";
	monster "1_tiamat_08.gat",207,385,"�J�f�X��",20448,1,"tiamat_mob#r71::OnKades";
	set 'flag,0;
	set 'CG03,rand(1,9);
	set 'CG04,rand(1,9);
	set 'CG05,rand(1,9);
	set 'CG06,rand(1,9);
	end;
OnDaehyon:
	hideoffnpc "�f�q������#r37CG03";
	donpcevent "�f�q������#r37CG03::OnStart";
	set 'flag,'flag|1;
	if('flag == 15)
		initnpctimer;
	end;
OnPyuriel:
	hideoffnpc "�q�����G����#r50CG04";
	donpcevent "�q�����G����#r50CG04::OnStart";
	set 'flag,'flag|2;
	if('flag == 15)
		initnpctimer;
	end;
OnGioia:
	hideoffnpc "�W�I�C�A��#r62CG05";
	donpcevent "�W�I�C�A��#r62CG05::OnStart";
	set 'flag,'flag|4;
	if('flag == 15)
		initnpctimer;
	end;
OnKades:
	hideoffnpc "�J�f�X��#r71CG06";
	donpcevent "�J�f�X��#r71CG06::OnStart";
	set 'flag,'flag|8;
	if('flag == 15)
		initnpctimer;
	end;
OnTimer1000:
	mapannounce "1_tiamat_08.gat","�S�Ă̎l�����̑����|����܂����@120�b���[��� ���@3F] �ɂđ��֓��͂��鐔���̓��[���s���܂�", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_41.gat","�S�Ă̎l�����̑����|����܂����@120�b���[��� ���@3F] �ɂđ��֓��͂��鐔���̓��[���s���܂�", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer119000:
	hideoffnpc "�l�R�m���[�E�F��#302_1"; //1809
	end;
OnTimer121000:
	announce "�l�R�m���[�E�F�� : ���āA�S�Ă̎l�����̑��ɗ͎͂����܂������A�ǂ̐�������͂���΁c�c�H", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer124000:
	announce "�l�R�m���[�E�F�� : �F�l�̗͂����݂����������B�₢�ɑ΂��Đ������Ǝv�����̊��ɏW�܂��Ă��������B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer127000:
	announce "��1 : �u�\�[�h�v�̎��������𓚂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer130000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG03],1;
	if(rand(2)) {
		set 'id[1],'CG03;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG03;
	}
	unittalk getnpcid(0,"���i���j#r161"),"�� : �\�[�h�̎��������́u" +'id[1]+ "�v";
	unittalk getnpcid(0,"���i�E�j#r161"),"�E : �\�[�h�̎��������́u" +'id[2]+ "�v";
	end;
OnTimer133000:
	announce "10�b��Ɋ��̎���ɂ���l�����m�F���܂�", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer138000:
	announce "5�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer139000:
	announce "4�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer140000:
	announce "3�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer141000:
	announce "2�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer142000:
	announce "1�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer143000:
	emotion 21, "�l�R�m���[�E�F��#302_1"; //1809
	misceffect 191, "���i���j#r161"; //900
	misceffect 191, "���i�E�j#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[1],'id[1];
	else
		set 'select[1],'id[2];
	end;
OnTimer146000:
	announce "��2 : �u�����h�v�̎��������𓚂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer149000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG04],1;
	if(rand(2)) {
		set 'id[1],'CG04;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG04;
	}
	unittalk getnpcid(0,"���i���j#r161"),"�� : �����h�̎��������́u" +'id[1]+ "�v";
	unittalk getnpcid(0,"���i�E�j#r161"),"�E : �����h�̎��������́u" +'id[2]+ "�v";
	end;
OnTimer152000:
	announce "10�b��Ɋ��̎���ɂ���l�����m�F���܂�", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer157000:
	announce "5�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer158000:
	announce "4�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer159000:
	announce "3�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer160000:
	announce "2�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer161000:
	announce "1�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer162000:
	emotion 21, "�l�R�m���[�E�F��#302_1"; //1809
	misceffect 191, "���i���j#r161"; //900
	misceffect 191, "���i�E�j#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[2],'id[1];
	else
		set 'select[2],'id[2];
	end;
	end;
OnTimer165000:
	announce "��3 : �u�R�C���v�̎��������𓚂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer168000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG05],1;
	if(rand(2)) {
		set 'id[1],'CG05;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG05;
	}
	unittalk getnpcid(0,"���i���j#r161"),"�� : �R�C���̎��������́u" +'id[1]+ "�v";
	unittalk getnpcid(0,"���i�E�j#r161"),"�E : �R�C���̎��������́u" +'id[2]+ "�v";
	end;
OnTimer171000:
	announce "10�b��Ɋ��̎���ɂ���l�����m�F���܂�", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer176000:
	announce "5�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer177000:
	announce "4�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer178000:
	announce "3�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer179000:
	announce "2�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer180000:
	announce "1�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer181000:
	emotion 21, "�l�R�m���[�E�F��#evt302"; //1809
	misceffect 191, "���i���j#r161"; //900
	misceffect 191, "���i�E�j#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[3],'id[1];
	else
		set 'select[3],'id[2];
	end;
	end;
OnTimer184000:
	announce "��4 : �u�J�b�v�v�̎��������𓚂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer187000:
	setarray '@num[1],1,2,3,4,5,6,7,8,9;
	deletearray '@num['CG06],1;
	if(rand(2)) {
		set 'id[1],'CG06;
		set 'id[2],'@num[rand(1,8)];
	}
	else {
		set 'id[1],'@num[rand(1,8)];
		set 'id[2],'CG06;
	}
	unittalk getnpcid(0,"���i���j#r161"),"�� : �J�b�v�̎��������́u" +'id[1]+ "�v";
	unittalk getnpcid(0,"���i�E�j#r161"),"�E : �J�b�v�̎��������́u" +'id[2]+ "�v";
	end;
OnTimer190000:
	announce "10�b��Ɋ��̎���ɂ���l�����m�F���܂�", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer195000:
	announce "5�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer196000:
	announce "4�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer197000:
	announce "3�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer198000:
	announce "2�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer199000:
	announce "1�c�c", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer200000:
	emotion 21, "�l�R�m���[�E�F��#evt302"; //1809
	misceffect 191, "���i���j#r161"; //900
	misceffect 191, "���i�E�j#r161"; //901
	if(getareausers("this",85,15,95,25) > getareausers("this",99,15,109,15))
		set 'select[4],'id[1];
	else
		set 'select[4],'id[2];
	end;
	end;
OnTimer203000:
	announce "�l�R�m���[�E�F�� : �����͊��ӂ��܂��B����ł́A�񓚂���͂��܂��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer211000:
	announce "�l�R�m���[�E�F�� : �����́c�c�u" +'select[1]+'select[2]+'select[3]+'select[4]+ "�v�ł��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer216000:
	if('select[1] == 'CG03 && 'select[2] == 'CG04 && 'select[3] == 'CG05 && 'select[4] == 'CG06)
		announce "��������i�L��ƔF�߂Ă�낤�@�i�ނ��ǂ��c�c", 0x9, 0xff0000, 0x190, 30, 0, 0;
	else
		announce "����Ɏ��i�����@�������邪�ǂ��c�c", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer219000:
	if('select[1] != 'CG03 || 'select[2] != 'CG04 || 'select[3] != 'CG05 || 'select[4] != 'CG06) {
		stopnpctimer;
		hideonnpc "�l�R�m���[�E�F��#302_1"; //1809
		areamonster "this",86,6,110,29,"�����̂�����",20482,5,strnpcinfo(0)+ "::OnKilled";
		areamonster "this",86,6,110,29,"�����̂�����",20483,5,strnpcinfo(0)+ "::OnKilled";
		areamonster "this",86,6,110,29,"�����̂�����",20484,5,strnpcinfo(0)+ "::OnKilled";
	}
	end;
OnTimer222000:
	announce "�u�l�R�m���[�E�F���v���u����@�J���u�쓮�L�[�v����肵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer225000:
	misceffect 406, "���o�[#201_1"; //895
	announce "[��� ���@3F] �̃��o�[�̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	killmonster "1_tiamat_41.gat","tiamat_mob#r16::OnKilled2";
	end;
OnTimer229000:
	announce "�l�R�m���[�E�F�� : ������ɓ���܂����B����ł́A����@�֌������܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer232000:
	hideonnpc "�l�R�m���[�E�F��#3007_1"; //1932
	hideonnpc "�l�R�m���[�E�F��#302_1"; //1809
	end;
OnTimer235000:
	stopnpctimer;
	hideoffnpc "�l�R�m���[�E�F��#3008_1"; //1939
	hideoffnpc "�l�R�m���[�E�F��#3008_2"; //1939
	hideoffnpc "�l�R�m���[�E�F��#3008_3"; //1939
	hideoffnpc "�l�R�m���[�E�F��#3008_4"; //1939
	donpcevent "#tiamat_start::OnLowen";
	set $@tiamat_lowen,8;
	end;
OnKilled:
	set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
	if('@count <= 0) {
		setnpctimer 119000;
		startnpctimer;
		hideoffnpc "�l�R�m���[�E�F��#302_1"; //1809
	}
	end;
}
1_tiamat_41.gat,22,87,4	script	�W�I�C�A��#k62CG05	10276,{/* 898 (hide)*/
	unittalk "�������Ȃ��c�����̒����̂悤���c�c";
	end;
}
1_tiamat_41.gat,22,87,4	script	�W�I�C�A��#r62CG05	10276,{/* 899 */
	setarray '@str$[1],"���p�t","�����c","����","�c��","�@��","���l","���","��","�B��";
	unittalk "��ꂪ�i��́u�R�C���v�A�����́u" +'@str$['flag]+ "�v";
	end;
OnStart:
	unittalk "�u�W�I�C�A���v�����p�\�ɂȂ�܂���";
	set 'flag,getvariableofnpc('CG05,"�O���[�U��#r16CG02");
	end;
}
1_tiamat_41.gat,90,20,4	script	���i���j#r161	974,{/* 900 */}
1_tiamat_41.gat,104,20,4	script	���i�E�j#r161	973,{/* 901 */}
1_tiamat_42.gat,96,83,5	script	�H�H�H�H#r7	844,{/* 948 */
	warp "1_tiamat_42.gat",146,332;
	end;
OnStart:
	initnpctimer;
	hideoffnpc;
	end;
OnTimer3000:
	initnpctimer;
	misceffect 6, "�H�H�H�H#r7"; //948
	end;
}
1_tiamat_42.gat,371,152,1	script	�����̂��M#116_01	3455,{/* 949 */}
1_tiamat_42.gat,368,152,1	script	�����̂��M#116_02	3455,{/* 950 */}
1_tiamat_42.gat,367,152,1	script	�����̂��M#116_03	3455,{/* 951 */}
1_tiamat_42.gat,363,152,1	script	�����̂��M#116_04	3455,{/* 952 (hide)*/}
1_tiamat_42.gat,357,143,1	script	�����̂��M#116_05	3455,{/* 953 */}
1_tiamat_42.gat,357,140,1	script	�����̂��M#116_06	3455,{/* 954 (hide)*/}
1_tiamat_42.gat,359,144,1	script	�����̂��M#116_07	3455,{/* 955 */}
1_tiamat_42.gat,359,140,1	script	�����̂��M#116_08	3455,{/* 956 (hide)*/}
1_tiamat_42.gat,357,135,1	script	�����̂��M#116_09	3455,{/* 957 */}
1_tiamat_42.gat,357,133,1	script	�����̂��M#116_10	3455,{/* 958 (hide)*/}
1_tiamat_42.gat,359,135,1	script	�����̂��M#116_11	3455,{/* 959 */}
1_tiamat_42.gat,359,132,1	script	�����̂��M#116_12	3455,{/* 960 */}
1_tiamat_42.gat,357,124,1	script	�����̂��M#116_13	3455,{/* 961 (hide)*/}
1_tiamat_42.gat,357,122,1	script	�����̂��M#116_14	3455,{/* 962 */}
1_tiamat_42.gat,359,124,1	script	�����̂��M#116_15	3455,{/* 963 (hide)*/}
1_tiamat_42.gat,376,144,1	script	�����̂��M#116_16	3455,{/* 964 */}
1_tiamat_42.gat,377,141,1	script	�����̂��M#116_17	3455,{/* 965 */}
1_tiamat_42.gat,376,133,1	script	�����̂��M#116_18	3455,{/* 966 */}
1_tiamat_42.gat,376,125,1	script	�����̂��M#116_19	3455,{/* 967 */}
1_tiamat_42.gat,376,123,1	script	�����̂��M#116_20	3455,{/* 968 (hide)*/}
1_tiamat_42.gat,378,126,1	script	�����̂��M#116_21	3455,{/* 969 */}
1_tiamat_42.gat,266,88,4	script	���o�[#008_1	10042,{/* 979 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[��2F ������] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	if(getvariableofnpc('flag,"tiamat_mob#r105") == 0) {
		killmonster "1_tiamat_42.gat","tiamat_mob#r105::OnKilled2";
		misceffect 234, "area#r1057";
		misceffect 406, "area#r1057";
		hideonnpc "area#k1057"; //1258
		hideoffnpc "area#r1057"; //1258
	}
	announce "�u����ʘH2F01�v�́u�㖱���v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_42.gat,314,272,4	script	���o�[#010_1	10042,{/* 980 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[��3F �H��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r122::OnKilled2";
	misceffect 234, "area#r1222";
	misceffect 406, "area#r1222";
	hideonnpc "area#k1222"; //1258
	hideoffnpc "area#r1222"; //1258
	announce "�u����ʘH3F02�v�́u����ʘH3F03�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_42.gat,181,16,4	script	�A�X���f��#r108	844,{/* 984 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<4);
	announce "��5�̎��V�g �@���̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_42.gat,181,16,4	script	���V�g�̖S�[#r108	802,{/* 985 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r108"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r108"; //496
	misceffect 668, "���V�g�̖S�[#r108"; //496
	announce "�H�H�H�H : ������q�r��B�~�����~������Ή�ɋF��������̂ł��B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�A�X���f��#r108",20458;
	hideoffnpc "�A�X���f��#r108"; //495
	misceffect 1065, "�A�X���f��#r108"; //495
	misceffect 1019, "�A�X���f��#r108"; //495
	announce "���҂��̐����������ɋ����A[��3F ���̕���] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_42.gat",171,6,191,26,"123";
	end;
OnTimer9000:
	misceffect 903, "�A�X���f��#r108"; //495
	announce "�A�X���f�� : ������ΓV���ւ̔����J����܂��c�c���ۂ���҂͒n���ɑ��Ȃ����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�A�X���f��#r108"; //495
	setnpcdisplay "�A�X���f��#r108",844;
	monster "this",181,16,"�@���̉��g",20458,1,"tiamat_mob#r108::OnKilled2";
	end;
}
1_tiamat_42.gat,21,101,4	script	�n�}���G��#r110	844,{/* 986 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<8);
	announce "��9�̎��V�g �B�҂̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_42.gat,21,101,4	script	���V�g�̖S�[#r110	802,{/* 987 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r110"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r110"; //496
	misceffect 668, "���V�g�̖S�[#r110"; //496
	announce "�H�H�H�H : �����͓��̂���ׂ��ꏊ�ł͂Ȃ��B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�n�}���G��#r110",20462;
	hideoffnpc "�n�}���G��#r110"; //495
	misceffect 1065, "�n�}���G��#r110"; //495
	misceffect 1019, "�n�}���G��#r110"; //495
	announce "���҂��̐����������ɋ����A[��3F ���q�̕���] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_42.gat",11,91,31,111,"123";
	end;
OnTimer9000:
	misceffect 903, "�n�}���G��#r110"; //495
	announce "�n�}���G�� : �ԈႢ�͐����˂΂Ȃ�ʁB�䂪�������B�����A��ׂ��i���̈łɁB", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�n�}���G��#r110"; //495
	setnpcdisplay "�n�}���G��#r110",844;
	monster "this",21,101,"�B�҂̉��g",20462,1,"tiamat_mob#r110::OnKilled2";
	end;
}
1_tiamat_42.gat,190,88,4	script	�o�L�G��#r111	844,{/* 988 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<17);
	announce "��18�̎��V�g ���̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_42.gat,190,88,4	script	���V�g�̖S�[#r111	802,{/* 989 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r111"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r111"; //496
	misceffect 668, "���V�g�̖S�[#r111"; //496
	announce "�H�H�H�H : �ӂ�ӂӁ`�`���@�悤�����`��������Ⴂ�܂����`�B���}���}�`�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�o�L�G��#r111",20468;
	hideoffnpc "�o�L�G��#r111"; //495
	misceffect 1065, "�o�L�G��#r111"; //495
	misceffect 1019, "�o�L�G��#r111"; //495
	announce "���҂��̐����������ɋ����A[��3F �����̕���] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_42.gat",180,78,200,98,"123";
	end;
OnTimer9000:
	misceffect 903, "�o�L�G��#r111"; //495
	announce "�o�L�G�� : ���A�����ċA���Ǝv��Ȃ��łˁH�@�i���Ƀo�C�o�C����`�I", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�o�L�G��#r111"; //495
	setnpcdisplay "�o�L�G��#r111",844;
	monster "this",190,88,"���̉��g",20468,1,"tiamat_mob#r111::OnKilled2";
	end;
}
1_tiamat_43.gat,18,41,4	script	���o�[#006_3	10042,{/* 1046 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		if(getvariableofnpc('flag,"���o�[#006_1")+getvariableofnpc('flag,"���o�[#006_2") == 2)
			initnpctimer;
		announce "[�M�o��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r80::OnKilled2";
	misceffect 234, "area#r803";
	misceffect 406, "area#r803";
	hideonnpc "area#k803"; //1258
	hideoffnpc "area#r803"; //1258
	mapannounce "1_tiamat_42.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_09.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_43.gat","�u�G���g�����X�v�́u�o���R�j�[�@�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_51.gat,356,130,4	script	�A�h�i�L�G��#r156	844,{/* 1154 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<13);
	announce "��14�̎��V�g �ߐ��̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_51.gat,356,130,4	script	���V�g�̖S�[#r156	802,{/* 1155 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r156"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r156"; //496
	misceffect 668, "���V�g�̖S�[#r156"; //496
	announce "�H�H�H�H : 遂�A���S�A������́A����̐g��łڂ����낤�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�A�h�i�L�G��#r156",20465;
	hideoffnpc "�A�h�i�L�G��#r156"; //495
	misceffect 1065, "�A�h�i�L�G��#r156"; //495
	misceffect 1019, "�A�h�i�L�G��#r156"; //495
	announce "���҂��̐����������ɋ����A[�g�p�l���Z�� ���g������] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_19.gat",16,16,43,39,"123";
	end;
OnTimer9000:
	misceffect 903, "�A�h�i�L�G��#r156"; //495
	announce "�A�h�i�L�G�� : �c�c���O�̂��Ƃ������Ă���B�g���ȂĒm�邪�ǂ��B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�A�h�i�L�G��#r156"; //495
	setnpcdisplay "�A�h�i�L�G��#r156",844;
	monster "this",356,130,"�ߐ��̉��g",20465,1,"tiamat_mob#r156::OnKilled2";
	end;
}
1_tiamat_52.gat,119,139,1	script	�_���̒���#r177	10045,{/* 1166 */
	misceffect 9,"";	// self
	mes "�]�����̑O�ɗ���";
	mes "�@���̒��ɐ����������]";
	next;
	unittalk "���̐M�S�������c�c",1;	// 1417
	mes "[�H�H�H�H]";
	mes "���̐M�S(LUK)�������c�c";
	next;
	if(select("�����l����","�����ɐG���") == 2) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	set '@req_luk,(checkquest(123655))? 100: 300;
	if(readparam(bLuk) < '@req_luk) {
		unittalk "�M�S������ʁc�@�ً��k�ɂ͎����c�c",1;	// 1417
		mes "[�H�H�H�H]";
		mes "�M�S������ʁc�@�ً��k�ɂ͎����c�c";
		misceffect 59;	// 1417
		misceffect 487,"";	// self
		misceffect 372,"";	// self
		misceffect 124,"";	// self
		soundeffect "lady_tanee_die.wav", 0, 0;	// 0
		percentheal -100,0;
		close;
	}
	set 'flag,1;
	// TODO
	unittalk "�M����҂ɏj�����c�c",1;	// 1417
	mes "[�H�H�H�H]";
	mes "�M����҂ɏj�����c�c";
	if(getvariableofnpc('flag,"tiamat_mob#r176") == 0) {
		hideoffnpc "area#r1762";
		hideoffnpc "area#r1764";
	}
	else {
		hideoffnpc "area#k1762";
		monster "1_tiamat_53.gat",231,291,"#EF_002",3869,1,"tiamat_mob#r176::OnKilled2";
		hideoffnpc "area#k1764";
		monster "1_tiamat_53.gat",288,291,"#EF_002",3869,1,"tiamat_mob#r176::OnKilled2";
	}
	mapannounce "1_tiamat_52.gat","�u�_�a��L�ԁv�́u�R�m�̊ԁv�A�u���܂̊ԁv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_53.gat","�u�_�a��L�ԁv�́u�R�m�̊ԁv�A�u���܂̊ԁv�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	close;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_53.gat,183,190,4	script	�Y���G��#r178	844,{/* 1187 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<10);
	announce "��11�̎��V�g ���`�̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_53.gat,183,190,4	script	���V�g�̖S�[#r178	802,{/* 1188 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r178"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r178"; //496
	misceffect 668, "���V�g�̖S�[#r178"; //496
	announce "�H�H�H�H : �䂪���͒f�߂̌��B�ߐl�͉䂪�n���瓦����p�����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�Y���G��#r178",20463;
	hideoffnpc "�Y���G��#r178"; //495
	misceffect 1065, "�Y���G��#r178"; //495
	misceffect 1019, "�Y���G��#r178"; //495
	announce "���҂��̐����������ɋ����A[�_�a1F �R�m�̊�] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_53.gat",173,180,193,200,"123";
	end;
OnTimer9000:
	misceffect 903, "�Y���G��#r178"; //495
	announce "�Y���G�� : �o�傹���ߐl�B���Ɏޗʂ̗]�n�����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�Y���G��#r178"; //495
	setnpcdisplay "�Y���G��#r178",844;
	monster "this",183,190,"���`�̉��g",20463,1,"tiamat_mob#r178::OnKilled2";
	end;
}
1_tiamat_53.gat,41,240,4	script	�T�^��#r179	844,{/* 1189 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<20);
	announce "��21�̎��V�g ���E�̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_53.gat,41,240,4	script	���V�g�̖S�[#r179	802,{/* 1190 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r179"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r179"; //496
	misceffect 668, "���V�g�̖S�[#r179"; //496
	announce "�H�H�H�H : �������ꂽ���E�̕����]�ގ҂�B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�T�^��#r179",20478;
	hideoffnpc "�T�^��#r179"; //495
	misceffect 1065, "�T�^��#r179"; //495
	misceffect 1019, "�T�^��#r179"; //495
	announce "���҂��̐����������ɋ����A[�_�a1F ���܂̊�] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_53.gat",31,230,51,250,"123";
	end;
OnTimer9000:
	misceffect 903, "�T�^��#r179"; //495
	announce "�T�^�� : ���̐��E�͊����łȂ���΂Ȃ�Ȃ��B�s���S�ȓ������S�ɔr������B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�T�^��#r179"; //495
	setnpcdisplay "�T�^��#r179",844;
	monster "this",41,240,"���E�̉��g",20478,1,"tiamat_mob#r179::OnKilled2";
	end;
}
1_tiamat_53.gat,260,279,4	script	�����G��#r176	844,{/* 1191 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<6);
	announce "��7�̎��V�g ��Ԃ̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_53.gat,260,279,4	script	���V�g�̖S�[#r176	802,{/* 1192 */
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r176"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r176"; //496
	misceffect 668, "���V�g�̖S�[#r176"; //496
	announce "�H�H�H�H : �䂪�O�ɗ��Ƃ͋�����B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�����G��#r176",20460;
	hideoffnpc "�����G��#r176"; //495
	misceffect 1065, "�����G��#r176"; //495
	misceffect 1019, "�����G��#r176"; //495
	announce "���҂��̐����������ɋ����A[�_�a1F �_�a��L��] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_53.gat",31,230,51,250,"123";
	end;
OnTimer9000:
	misceffect 903, "�����G��#r176"; //495
	announce "�����G�� : �䂪�O�ɗ����A�����ɗ����Ă����҂͊F����B���S�Ȏr���䂪�O�ɎN���B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�����G��#r176"; //495
	setnpcdisplay "�����G��#r176",844;
	monster "this",260,279,"��Ԃ̉��g",20460,1,"tiamat_mob#r176::OnKilled3";
	end;
}
1_tiamat_54.gat,38,110,4	script	���o�[#001_1	10042,{/* 1229 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����1F ��c��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r158") == 0) {	// ��q���A�|���Ă�����
		misceffect 234, "area#r1584";
		misceffect 406, "area#k1584";
		killmonster "1_tiamat_44.gat","tiamat_mob#r158::OnKilled2";
		hideonnpc "area#k1584"; //1258
		hideoffnpc "area#r1584"; //1258
	}
	announce "�u��q���v�́u����1F�ʘH02�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,256,109,4	script	���o�[#002_1	10042,{/* 1230 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����2F ��c���@] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r169") == 0) {	// ����2F�ʘH02�A�|���Ă�����
		misceffect 234, "area#r1693";
		misceffect 406, "area#k1693";
		killmonster "1_tiamat_54.gat","tiamat_mob#r169::OnKilled2";
		hideonnpc "area#k1693"; //1258
		hideoffnpc "area#r1693"; //1258
	}
	announce "�u����2F�ʘH02�v�́u����2F��c���A�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,309,89,4	script	���o�[#003_1	10042,{/* 1231 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����2F ��c���A] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r169") == 0) {	// ����2F�ʘH02�A�|���Ă�����
		misceffect 234, "area#r1692";
		misceffect 406, "area#k1692";
		killmonster "1_tiamat_54.gat","tiamat_mob#r169::OnKilled3";
		hideonnpc "area#k1692"; //1258
		hideoffnpc "area#r1692"; //1258
		donpcevent "area#r1692::OnStart";
	}
	announce "�u����2F�ʘH02�v�́u����2F�������v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,309,104,4	script	���o�[#004_1	10042,{/* 1232 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����2F ������] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r168") == 0) {	// ����2F�ʘH01�A�|���Ă�����
		misceffect 234, "area#r1684";
		misceffect 406, "area#k1684";
		killmonster "1_tiamat_54.gat","tiamat_mob#r168::OnKilled2";
		hideonnpc "area#k1684"; //1258
		hideoffnpc "area#r1684"; //1258
		donpcevent "area#r1684::OnStart";
	}
	announce "�u����2F�ʘH01�v�́u����2F���c���v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_54.gat,236,164,4	script	���o�[#005_1	10042,{/* 1233 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		set '@count,getmapmobs("this",strnpcinfo(0)+ "::OnKilled");
		if('@count) {
			unittalk getcharid(3),strcharinfo(0)+" : �����������Ă���c�c",1;
			end;
		}
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[����2F ���c��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r162") == 0) {	// ����1F�ʘH01�A�|���Ă�����
		misceffect 234, "area#r1622";
		misceffect 406, "area#k1622";
		killmonster "1_tiamat_54.gat","tiamat_mob#r162::OnKilled2";
		hideonnpc "area#k1622"; //1258
		hideoffnpc "area#r1622"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r4") == 0) {	// ����(��)�A�|���Ă�����
		misceffect 234, "area#r44";
		misceffect 406, "area#k44";
		killmonster "1_tiamat_13.gat","tiamat_mob#r4::OnKilled2";
		hideonnpc "area#k44"; //1258
		hideoffnpc "area#r44"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {	// ���˂̒�A�|���Ă�����
		misceffect 234, "area#r131";
		misceffect 406, "area#k131";
		killmonster "1_tiamat_05.gat","tiamat_mob#r13::OnKilled2";
		hideonnpc "area#k131"; //1258
		hideoffnpc "area#r131"; //1258
	}
	announce "�u����1F�ʘH01�v�́u���O1F�v�A�u����(��)�v�́u���˂̒�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	setcell "this",236,163,0;
	monster "this",236,163,"#EF_002",3869,1,strnpcinfo(0)+ "::OnKilled";
	set 'flag,0;
	end;
OnKilled:
	end;
}
1_tiamat_54.gat,242,164,4	script	�A���u���G��#r166	844,{/* 1154 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	set $@tiamat_angel,$@tiamat_angel | (1<<5);
	announce "��6�̎��V�g ���l�̉��g ���Ŋ��� !!", 0x9, 0xffff00, 0x190, 30, 0, 0;
	misceffect 406, "���o�[#005_1";
	killmonster "1_tiamat_54.gat","���o�[#005_1::OnKilled";
	end;
OnTimer3000:
	stopnpctimer;
	announce "[�_�aB2F �n���Ւd] �Ɏ��V�g�̍����������܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
}
1_tiamat_54.gat,242,164,4	script	���V�g�̖S�[#r166	802,{/* 1155 (hide)*/
	mes "�]�썰���ЁX�����͂̔g��������Ă���c";
	mes "�@���V�g�̖S����Ăяo���܂����H�]";
	mes "�@";
	mes "�@^ff0000�S����Ăяo����";
	mes "�@�퓬���J�n����܂��B^000000";
	next;
	if(select("�����l����","�Ăяo��") == 1) {
		mes "�]���Ȃ��͗����������]";
		close;
	}
	hideonnpc "���V�g�̖S�[#r166"; //496
	initnpctimer;
	close;
OnTimer3000:
	misceffect 934, "���V�g�̖S�[#r166"; //496
	misceffect 668, "���V�g�̖S�[#r166"; //496
	announce "�H�H�H�H : ���c�c����͉��������l�̂�����́B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer6000:
	setnpcdisplay "�A���u���G��#r166",20459;
	hideoffnpc "�A���u���G��#r166"; //495
	misceffect 1065, "�A���u���G��#r166"; //495
	misceffect 1019, "�A���u���G��#r166"; //495
	announce "���҂��̐����������ɋ����A[����2F���c��] �Ƀ����X�^�[���o������", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	areamusiceffect "1_tiamat_19.gat",16,16,43,39,"123";
	end;
OnTimer9000:
	misceffect 903, "�A���u���G��#r166"; //495
	announce "�A���u���G�� : �i���ɐ��߂Ȃ����̐��E�ň�����荇���܂��傤�c�c�������͂��Ȃ��B", 0x9, 0xff0000, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	stopnpctimer;
	hideonnpc "�A���u���G��#r166"; //495
	setnpcdisplay "�A���u���G��#r166",844;
	monster "this",242,164,"���l�̉��g",20459,1,"tiamat_mob#r166::OnKilled2";
	end;
}
1_tiamat_56.gat,152,126,4	script	���o�[#102_1	10042,{/* 1276 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[���  ���2F08] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r64") == 0) {	// ���E�k��B1F�A�|���Ă�����
		misceffect 234, "area#r641";
		misceffect 406, "area#k641";
		killmonster "1_tiamat_25.gat","tiamat_mob#r64::OnKilled2";
		hideonnpc "area#k641"; //1258
		hideoffnpc "area#r641"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r65") == 0) {	// ���E�k��1F�A�|���Ă�����
		misceffect 234, "area#r652";
		misceffect 406, "area#k652";
		killmonster "1_tiamat_08.gat","tiamat_mob#r65::OnKilled2";
		hideonnpc "area#k652"; //1258
		hideoffnpc "area#r652"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r66") == 0) {	// ���E�k��2F�A�|���Ă�����
		misceffect 234, "area#r661";
		misceffect 406, "area#k661";
		killmonster "1_tiamat_08.gat","tiamat_mob#r66::OnKilled2";
		hideonnpc "area#k661"; //1258
		hideoffnpc "area#r661"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r67") == 0) {	// ���E�k��3F�A�|���Ă�����
		misceffect 234, "area#r672";
		misceffect 406, "area#k672";
		killmonster "1_tiamat_08.gat","tiamat_mob#r67::OnKilled2";
		hideonnpc "area#k672"; //1258
		hideoffnpc "area#r672"; //1258
	}
	announce "�u���E�k��1F�v�́u���E�k��B1F�v�A�u���E�k��2F�v�́u���E�k��3F�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_56.gat,133,25,4	script	���o�[#103_1	10042,{/* 1277 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[��� ���2F07] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	set 'flag,1;
	if(getvariableofnpc('flag,"tiamat_mob#r24") == 0) {	// ���2F06�A�|���Ă�����
		misceffect 234, "area#r241";
		misceffect 234, "area#r243";
		misceffect 406, "area#k241";
		misceffect 406, "area#k243";
		killmonster "1_tiamat_56.gat","tiamat_mob#r24::OnKilled2";
		hideonnpc "area#k241"; //1258
		hideonnpc "area#k243"; //1258
		hideoffnpc "area#r241"; //1258
		hideoffnpc "area#r243"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r25") == 0) {	// ���2F07�A�|���Ă�����
		misceffect 234, "area#r251";
		misceffect 406, "area#k251";
		killmonster "1_tiamat_56.gat","tiamat_mob#r25::OnKilled2";
		hideonnpc "area#k251"; //1258
		hideoffnpc "area#r251"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r45") == 0) {	// ���E�쓌2F�A�|���Ă�����
		misceffect 234, "area#r451";
		misceffect 406, "area#k451";
		killmonster "1_tiamat_17.gat","tiamat_mob#r45::OnKilled3";
		hideonnpc "area#k451"; //1258
		hideoffnpc "area#r451"; //1258
	}
	if(getvariableofnpc('flag,"tiamat_mob#r66") == 0) {	// ���E�k�� 2F�A�|���Ă�����
		misceffect 234, "area#r664";
		misceffect 406, "area#k664";
		killmonster "1_tiamat_08.gat","tiamat_mob#r66::OnKilled3";
		hideonnpc "area#k664"; //1258
		hideoffnpc "area#r664"; //1258
	}
	announce "�u���2F06�v�́u���E�쓌2F�v�u����2F����Ɂv�A�u���2F07�v�́u���E�k��2F�v�̔��̌����J����", 0x9, 0xffff00, 0x0190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_58.gat,161,281,0	script	#�]��21_01	139,1,1,{/* 1325 (hide)*/
	showmessage "�E�A�A�A�A�A�A�A�A�A�A�b!!!!","";
	misceffect 729,""; //self
	misceffect 34,""; //self
	if(!sleep2(2000)) end;
	warp "1_tiamat_12.gat",8,228;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 36; //393
	misceffect 34; //393
	end;
}
1_tiamat_58.gat,153,294,0	duplicate(#�]��21_01)	#�]��21_02	139,1,1	// 1326 (hide)
1_tiamat_58.gat,129,288,0	duplicate(#�]��21_01)	#�]��21_03	139,1,1	// 1327 (hide)
1_tiamat_58.gat,108,281,0	duplicate(#�]��21_01)	#�]��21_04	139,1,1	// 1328 (hide)
1_tiamat_58.gat,108,294,0	duplicate(#�]��21_01)	#�]��21_05	139,1,1	// 1329 (hide)
1_tiamat_58.gat,88,281,0	duplicate(#�]��21_01)	#�]��21_06	139,1,1	// 1330 (hide)
1_tiamat_58.gat,79,292,0	duplicate(#�]��21_01)	#�]��21_07	139,1,1	// 1331 (hide)
1_tiamat_58.gat,152,283,0	script	#�21_08	139,1,1,{/* 1332 (hide)*/
	if(strnpcinfo(0) != "#�21_05")
		pushpc 4,7;
	else
		pushpc 6,10;
	end;
OnInit:
OnStart:
	initnpctimer;
	hideoffnpc;
	set 'flag,0;
	end;
OnTimer2000:
	if('flag) {
		stopnpctimer;
		hideonnpc;
		end;
	}
	initnpctimer;
	misceffect 17; //393
	misceffect 69; //393
	end;
}
1_tiamat_58.gat,120,294,0	duplicate(#�21_08)	#�21_09	139,1,1	// 1333 (hide)
1_tiamat_58.gat,98,283,0	duplicate(#�21_08)	#�21_10	139,1,1	// 1334 (hide)





1_tiamat_60.gat,94,66,4	script	�����W�����g#tia60	10272,{/* 1360 (hide)*/
	unittalk "�����W�����g : �ӂӂӁc�c�䂪��ւ悤�����B���}���邼�B";
	end;
OnStart:
	initnpctimer;
	end;
OnTimer30000:
	announce "�����W�����g : �ӂӂӁc�c�䂪��ւ悤�����B���}���邼�B", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer35000:
	announce "�������A : �䂪��ȂǂƁc�c�M���������c�c�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer40000:
	announce "�������A : ���𑀂�A���̏�����������̂͒m���Ă��܂��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer45000:
	announce "�������A : ��X�͋M���𓢂��߂ɁA�����ɗ����̂ł��B�o��Ȃ����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer50000:
	announce "�����W�����g : �����M���Ȃ�ȁB��́A���O�����̗��K�����ł���̂��B", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer55000:
	announce "�����W�����g : ���؂Ȕӎ`��p�ӂ��Ă���B���O���������̐Ȃɏ��҂��悤�B", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer60000:
	announce "�����W�����g : �J�n���Ԃ͓������݌����o�鍠�c�c�B", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer65000:
	announce "�����W�����g : �ӂӂ��A�x���łȂ����B", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer70000:
	hideonnpc "�l�R�m�~���J#1001_1"; //1813
	hideonnpc "�l�R�m�n�E���h#2001_1"; //1868
	hideonnpc "�l�R�m���[�E�F��#3001_1"; //1932
	misceffect 34, "�����W�����g#tia60"; //1360
	hideonnpc "�����W�����g#tia60"; //1360
	end;
OnTimer75000:
	stopnpctimer;
	donpcevent "���L�t�O�X#tia60::OnStart";
	end;
}
1_tiamat_60.gat,98,58,1	script	�������A#tia60	10361,{/* 1361 (hide)*/
	unittalk "�������A : �c�c���͋M���ɂ͕����܂���B�o��Ȃ����B";
	end;
}
1_tiamat_60.gat,100,55,9	script	�l�R�m�~���J#tia60	728,{/* 1362 (hide)*/
	unittalk "�l�R�m�~���J : �M���̈��s�������܂łł��I";
	end;
}
1_tiamat_60.gat,101,57,9	script	�l�R�m�n�E���h#tia60	420,{/* 1363 (hide)*/
	unittalk "�l�R�m�n�E���h : �P�l�ɂ͎w��{�G�ꂳ���˂����B";
	end;
}
1_tiamat_60.gat,97,55,9	script	�l�R�m���[�E�F��#tia60	416,{/* 1364 (hide)*/
	unittalk "�l�R�m���[�E�F�� : ���o�}���Ƃ́c�]�T�ł��ˁB";
	end;
}
1_tiamat_60.gat,94,66,4	script	���L�t�O�X#tia60	844,{/* 1365 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	setnpcdisplay "���L�t�O�X#tia60",20469;
	hideoffnpc "���L�t�O�X#tia60"; //1365
	misceffect 1065, "���L�t�O�X#tia60"; //1365
	misceffect 1019, "���L�t�O�X#tia60"; //1365
	areamusiceffect "1_tiamat_60.gat",94-14,66-14,94+14,66+14,"123";
	end;
OnTimer6000:
	misceffect 903, "���L�t�O�X#1_tiamat_60"; //1365
	announce "���L�t�O�X : �W�����g�l�̂����ς킹��܂ł��Ȃ��B�@�����Ŏ��ʂ��ǂ��I", 0x9, 0xff0000, 0x190, 26, 0, 0;
	end;
OnTimer10000:
	setnpcdisplay "���L�t�O�X#tia60",844;
	hideonnpc "���L�t�O�X#tia60"; //1365
	hideonnpc "�������A#tia60"; //1361
	hideonnpc "�l�R�m�~���J#tia60"; //1362
	hideonnpc "�l�R�m�n�E���h#tia60"; //1363
	hideonnpc "�l�R�m���[�E�F��#tia60"; //1364
	donpcevent "tiamat_mob#r15::OnStart";
	end;
}
1_tiamat_61.gat,106,108,4	script	�Âт�����#97	10046,{/* 1379 */
	mes "^0000ff�]�R�m�͏�Ɍ�����ǂ����߂�";
	mes "�@�����āA�R�m�Ƌ|���̐S��";
	mes "�@��ɂȂ鎞�A";
	mes "�@�^���̗ւ̉��g���~�Ղ���]^000000";
	close2;
	//TODO
	if(getvariableofnpc('flag,"tiamat_mob#r96") > 0)
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r97") > 0)
		end;
	if(getvariableofnpc('flag,"tiamat_mob#r98") > 0)
		end;
	set 'flag,1;
	killmonster "1_tiamat_37.gat","tiamat_mob#r95::OnKilled4";
	stopnpctimer "���V�g�̖S�[#r95";
	hideonnpc;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
1_tiamat_62.gat,24,105,4	script	���o�[#011_1	10042,{/* 1389 (hide)*/
	if(distance(getcharid(3)) > 5)
		unittalk getcharid(3),strcharinfo(0)+" : ���o�[�������邪�A��������ł͎肪�͂��Ȃ��c�c�B",1;
	else {
		hideonnpc;
		set 'flag,1;
		misceffect 234;
		misceffect 488;
		initnpctimer;
		announce "[��3F ���̐Q��] �̃��o�[��`���ҁu"+strcharinfo(0)+"�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	}
	end;
OnTimer6000:
	stopnpctimer;
	killmonster "1_tiamat_42.gat","tiamat_mob#r122::OnKilled3";
	misceffect 234, "area#r1224";
	misceffect 406, "area#r1224";
	hideonnpc "area#k1224"; //1258
	hideoffnpc "area#r1224"; //1258
	mapannounce "1_tiamat_42.gat","�u����ʘH3F02�v�́u����q���v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	mapannounce "1_tiamat_62.gat","�u����ʘH3F02�v�́u����q���v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnStart:
	hideoffnpc;
	set 'flag,0;
	end;
}
2_tiamat_00.gat,40,62,4	script	���p�t�̍�#2_tiamat_00	2999,{/* 1410 */}
2_tiamat_00.gat,57,62,4	script	�����c�̍�#2_tiamat_00	1147,{/* 1411 */}
2_tiamat_00.gat,40,59,4	script	����̍�#2_tiamat_00	1630,{/* 1412 */}
2_tiamat_00.gat,57,59,4	script	�c��̍�#2_tiamat_00	1038,{/* 1413 */}
2_tiamat_00.gat,40,56,4	script	�@���̍�#2_tiamat_00	1157,{/* 1414 */}
2_tiamat_00.gat,57,56,4	script	���l�̍�#2_tiamat_00	1681,{/* 1415 */}
2_tiamat_00.gat,40,53,4	script	��Ԃ̍�#2_tiamat_00	2362,{/* 1416 */}
2_tiamat_00.gat,57,53,4	script	�͂̍�#2_tiamat_00	1785,{/* 1417 */}
2_tiamat_00.gat,40,50,4	script	�B�҂̍�#2_tiamat_00	1418,{/* 1418 */}
2_tiamat_00.gat,57,50,4	script	�^���̗ւ̍�#2_tiamat_00	1871,{/* 1419 */}
2_tiamat_00.gat,40,47,4	script	���`�̍�#2_tiamat_00	1751,{/* 1420 */}
2_tiamat_00.gat,57,47,4	script	�݂邳�ꂽ�j�̍�#2_tiamat_00	1779,{/* 1421 */}
2_tiamat_00.gat,40,44,4	script	���_�̍�#2_tiamat_00	1046,{/* 1422 */}
2_tiamat_00.gat,57,44,4	script	�ߐ��̍�#2_tiamat_00	2202,{/* 1423 */}
2_tiamat_00.gat,40,41,4	script	�����̍�#2_tiamat_00	1272,{/* 1424 */}
2_tiamat_00.gat,57,41,4	script	���̍�#2_tiamat_00	1039,{/* 1425 */}
2_tiamat_00.gat,40,38,4	script	���̍�#2_tiamat_00	1734,{/* 1426 */}
2_tiamat_00.gat,57,38,4	script	���̍�#2_tiamat_00	1150,{/* 1427 */}
2_tiamat_00.gat,40,35,4	script	���z�̍�#2_tiamat_00	1832,{/* 1428 */}
2_tiamat_00.gat,57,35,4	script	�R���̍�#2_tiamat_00	1373,{/* 1429 */}
2_tiamat_00.gat,40,32,4	script	���E�̍�#2_tiamat_00	2022,{/* 1430 */}
2_tiamat_00.gat,57,32,4	script	���҂̍�#2_tiamat_00	1870,{/* 1431 */}
2_tiamat_00.gat,49,63,4	script	�������A#2_tiamat_00	10361,{/* 1432 (hide)*/}
2_tiamat_02.gat,35,67,3	script	�l�R�m�~���J#2_tiamat_0	728,{/* 1473 */
	if($@tiamat_main == 3)
		unittalk "�l�R�m�~���J : �Ō�̐킢�ł��B�S�͂ł܂���܂��傤�B",1;	// 2665
	else
		unittalk "�l�R�m�~���J : �����܂Łc�����킢�ł����ˁc�B",1;	// 1598
	end;
}
2_tiamat_02.gat,34,69,3	script	�l�R�m�n�E���h#2_tiamat	420,{/* 1474 */
	if($@tiamat_main == 3)
		unittalk "�l�R�m�n�E���h : �����܂ŗ�����������t�͂���˂��ȁB����H�����΂��Ă��������B",1;	// 2666
	else
		unittalk "�l�R�m�n�E���h : �c�c�����C���������ȁB",1;	// 1599
	end;
}
2_tiamat_02.gat,37,68,3	script	�l�R�m���[�E�F��#2_tiam	416,{/* 1475 */
	if($@tiamat_main == 3)
		unittalk "�l�R�m���[�E�F�� : �P�l�̔ߊ�A�K�����������Č����܂��B",1;	// 2667
	else
		unittalk "�l�R�m���[�E�F�� : ���Ɂc�I������̂ł��ˁc�B",1;	// 1475
	end;
}
2_tiamat_02.gat,26,61,6	script	�����W�����g#2_tiamat_0	10272,{/* 1516 */
	if($@tiamat_main == 3)
		unittalk "�����W�����g : �M�l�I�@�ǂ�����āc�c�����ɓ����ė����̂�!?",1;	// 2708
	end;
}
2_tiamat_02.gat,32,65,3	script	�������A#2_tiamat_02	10361,{/* 1517 */
	if($@tiamat_main == 3)
		unittalk "�������A : ���ɖ�����ǂ��l�߂��̂ł��B�ŏI����Ƃ܂���܂��傤�B",1;	// 2709
	end;
}
2_tiamat_02.gat,29,49,0	script	clear_01#2_tiamat_02	139,{/* 1523 (hide)*/}
2_tiamat_02.gat,29,73,0	script	clear_02#2_tiamat_02	139,{/* 1524 (hide)*/}
2_tiamat_02.gat,52,49,0	script	clear_03#2_tiamat_02	139,{/* 1525 (hide)*/}
2_tiamat_02.gat,52,73,0	script	clear_04#2_tiamat_02	139,{/* 1526 (hide)*/}

1_tiamat_37.gat,23,123,4	script	�l�R�m�~���J#101_1	728,{/* 1784 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer4000:
	announce "�l�R�m�~���J : �悤�₭��q���܂ŒH�蒅�����B�����B����Ă��Ȃ����T���܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	hideonnpc "�l�R�m�~���J#101_1"; //1811
	hideoffnpc "�l�R�m�~���J#101_2"; //1812
	end;
OnTimer9000:
	emotion 0, "�l�R�m�~���J#101_2"; //2977
	end;
OnTimer10000:
	announce "�u�l�R�m�~���J�v���u���Ƃ̎�v����肵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer13000:
	announce "�l�R�m�~���J : ���A�l���痊�܂�Ă���������������B�@�_�a1F�́u���̕�v�Ɍ������܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer15000:
	stopnpctimer;
	hideonnpc "�l�R�m�~���J#101_1"; //1811
	hideonnpc "�l�R�m�~���J#101_2"; //1812
	donpcevent "#tiamat_start::OnMilka";
	if(getvariableofnpc('flag,"tiamat_mob#r180") > 0) {	//�T���̊�
		hideoffnpc "�l�R�m�~���J#1032_1"; //1811
		hideoffnpc "�l�R�m�~���J#1032_2"; //1811
		hideoffnpc "�l�R�m�~���J#1032_3"; //1811
		hideoffnpc "�l�R�m�~���J#1032_4"; //1811
		hideoffnpc "�l�R�m�~���J#1032_5"; //1811
		set $@tiamat_milka,32;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0) {	//���̕�
		hideoffnpc "�l�R�m�~���J#1033_1";
		set $@tiamat_milka,33;
	}
	else {
		hideoffnpc "�l�R�m�~���J#1034_1";
		set $@tiamat_milka,34;
	}
	end;
}
1_tiamat_37.gat,22,127,9	script	�l�R�m�~���J#101_2	728,{/* 1785 (hide)*/}
1_tiamat_61.gat,35,57,4	script	�l�R�m�n�E���h#201_1	420,{/* 1787 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	emotion 32, "�l�R�m�n�E���h#201_1"; //1787
	announce "�l�R�m�n�E���h : �ӂ���A�s���~�܂肩�B���Ă˂����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer4000:
	announce "�l�R�m�n�E���h : ���O��A��ɐi�ގ�|���肪�Ȃ����T�����I", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	hideonnpc "�l�R�m�n�E���h#201_1"; //1787
	hideoffnpc "�l�R�m�n�E���h#201_2"; //1788
	emotion 19, "�l�R�m�n�E���h#201_2"; //1788
	end;
OnTimer10000:
	hideonnpc "�l�R�m�n�E���h#201_2"; //1788
	hideoffnpc "�l�R�m�n�E���h#201_3"; //1789
	emotion 19, "�l�R�m�n�E���h#201_3"; //1789
	end;
OnTimer13000:
	hideonnpc "�l�R�m�n�E���h#201_3"; //1789
	hideoffnpc "�l�R�m�n�E���h#201_4"; //1790
	emotion 0, "�l�R�m�n�E���h#201_4"; //1789
	end;
OnTimer16000:
	misceffect 18, "�l�R�m�n�E���h#201_4"; //1790
	announce "�u�l�R�m�n�E���h�v���u����A�J���u�쓮�L�[�v����肵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer19000:
	stopnpctimer;
	announce "�l�R�m�n�E���h : ������ɓ������ȁB�悵�A����Ɍ��������I", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	hideonnpc "�l�R�m�n�E���h#201_1"; //1787
	hideonnpc "�l�R�m�n�E���h#201_2"; //1788
	hideonnpc "�l�R�m�n�E���h#201_3"; //1789
	hideonnpc "�l�R�m�n�E���h#201_4"; //1790
	donpcevent "#tiamat_start::OnHound";
	set $@tiamat_hound,13;
	// ��s���Ă邩�`�F�b�N
	if(getvariableofnpc('flag,"tiamat_mob#r30") > 0) {	// ��ǒʘH04�A�܂��|���ĂȂ���ΗU��NPC
		hideoffnpc "�l�R�m�n�E���h#2013_1";
		hideoffnpc "�l�R�m�n�E���h#2013_2";
		hideoffnpc "�l�R�m�n�E���h#2013_3";
	}
	if(getvariableofnpc('flag,"tiamat_mob#r74") == 0) {	// ���E�k�A B1F�A�����|���Ă��琅��A�C�x���g
		hideoffnpc "�l�R�m�n�E���h#202_1";
		set $@tiamat_hound,21;
		donpcevent "�l�R�m�n�E���h#202_1::OnStart";
	}
	end;
}
1_tiamat_61.gat,46,67,8	script	�l�R�m�n�E���h#201_2	420,{/* 1788 (hide)*/}
1_tiamat_61.gat,49,52,5	script	�l�R�m�n�E���h#201_3	420,{/* 1789 (hide)*/}
1_tiamat_61.gat,39,58,6	script	�l�R�m�n�E���h#201_4	420,{/* 1790 (hide)*/}
1_tiamat_33.gat,277,274,7	script	�l�R�m�n�E���h#202_1	420,{/* 1792 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�l�R�m�n�E���h : ����Ɛ��傩�A�������ɂ�����Ɣ�ꂽ���B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	announce "�l�R�m�n�E���h : �悵���A��������ɓ��ꂽ�����g���Ă݂邩�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer12000:
	misceffect 598, "����A�J���u#k74AG08"; //748
	misceffect 18, "����A�J���u#k74AG08"; //748
	end;
OnTimer13000:
	misceffect 406, "����A�J���u#k74AG08"; //748
	announce "[���E�k�A B1F]�̐�����u�l�R�m�n�E���h�v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	announce "[���E�k�A B1F] �̐��傪����\�ɂȂ�܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer22000:
	donpcevent "����A�J���u#k74AG08::OnStart"; //748
	end;
OnTimer23000:
	stopnpctimer;
	killmonster "this","tiamat_mob#r74::OnKilled2";
	announce "�l�R�m�n�E���h : �������Ԃ�H�����܂����B�������Ɛ�ɐi�������B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	hideonnpc "�l�R�m�n�E���h#202_1"; //1792
	donpcevent "#tiamat_start::OnHound";
	// ��s���Ă邩�`�F�b�N
	if(getvariableofnpc('flag,"tiamat_mob#r125") > 0) {	// ����ʘH B1F�A�܂��|���ĂȂ���ΗU��NPC
		hideoffnpc "�l�R�m�n�E���h#2022_1";
		set $@tiamat_hound,22;
	}
	else {	// ����ʘH B1F�A�����|���Ă��琅�H���
		hideoffnpc "�l�R�m�n�E���h#2023_1";
		set $@tiamat_hound,23;
	}
	end;
}

1_tiamat_17.gat,63,42,9	script	�l�R�m�n�E���h#203_1	420,{/* 1794 (hide)*/}
1_tiamat_18.gat,51,45,9	script	�l�R�m�n�E���h#204_1	420,{/* 1796 (hide)*/}
1_tiamat_16.gat,62,51,9	script	�l�R�m�n�E���h#205_1	420,{/* 1798 (hide)*/}
1_tiamat_03.gat,201,348,9	script	�l�R�m�n�E���h#206_1	420,{/* 1800 (hide)*/}
1_tiamat_03.gat,110,245,7	script	�l�R�m�n�E���h#207_1	420,{/* 1802 (hide)*/}
1_tiamat_32.gat,33,177,4	script	�l�R�m�n�E���h#208_1	420,{/* 1804 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�l�R�m�n�E���h : �����ɖړ��Ă̕�������͂��Ȃ񂾂��c�c���������ȂƂ����T���Ă݂Ă���B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer6000:
	hideonnpc "�l�R�m�n�E���h#208_1"; //1804
	hideoffnpc "�l�R�m�n�E���h#208_2"; //1805
	end;
OnTimer9000:
	emotion 0, "�l�R�m�n�E���h#208_2"; //1805
	end;
OnTimer12000:
	misceffect 18, "�l�R�m�n�E���h#208_2"; //1805
	announce "�u�l�R�m�n�E���h�v���u�傫�Ȕ��v����肵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer15000:
	announce "�l�R�m�n�E���h : ����ŕP�l�̈˗��͒B�����B�@�_�a1F�́u���̕�v�Ɍ��������B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer18000:
	stopnpctimer;
	hideonnpc "�l�R�m�n�E���h#208_1"; //1804
	hideonnpc "�l�R�m�n�E���h#208_2"; //1805
	set $@tiamat_hound,42;
	if(getvariableofnpc('flag,"tiamat_mob#r180") > 0) {	//�T���̊�
		hideoffnpc "�l�R�m�n�E���h#2042_1"; //1868
		set $@tiamat_hound,42;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0) {	//���̕�
		hideoffnpc "�l�R�m�n�E���h#2050_1";
		set $@tiamat_hound,50;
	}
	else {
		hideoffnpc "�l�R�m�n�E���h#2051_1";
		set $@tiamat_hound,51;
	}
	end;
}
1_tiamat_32.gat,17,176,4	script	�l�R�m�n�E���h#208_2	420,{/* 1805 (hide)*/}
1_tiamat_01.gat,104,207,9	script	�l�R�m���[�E�F��#301_1	416,{/* 1807 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�l�R�m���[�E�F�� : ����������c�c�悤�₭�����܂����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer9000:
	announce "�l�R�m���[�E�F�� : ����ł͐�����肵�����Ŗ���J���܂��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer12000:
	misceffect 598, "����@�J���u#k73CG08"; //70
	misceffect 18, "����@�J���u#k73CG08"; //70
	end;
OnTimer13000:
	misceffect 406, "����@�J���u#k73CG08"; //70
	announce "[���E�k�@�V����]�̐�����u�l�R�m���[�E�F���v�����삵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer16000:
	announce "[���E�k�@�V����] �̐��傪����\�ɂȂ�܂���", 0x9, 0xffff00, 0x190, 30, 0, 0;
	end;
OnTimer20000:
	donpcevent "����@�J���u#k73CG08::OnStart"; //70
	end;
OnTimer23000:
	killmonster "this","tiamat_mob#r73::OnKilled2";
	announce "�l�R�m���[�E�F�� : ����ŗǂ��͂��ł��B�����A��ɐi�݂܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	hideonnpc "�l�R�m���[�E�F��#301_1"; //1807
	set $@tiamat_lowen,14;
	donpcevent "#tiamat_start::OnLowen";
	if(getvariableofnpc('flag,"tiamat_mob#r13") == 0) {//���˂̒�
		hideoffnpc "�l�R�m���[�E�F��#3015_1"; //1807
		set $@tiamat_lowen,15;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r4") == 0 && getvariableofnpc('flag,"tiamat_mob#r52") == 0) {//����(��)
		hideoffnpc "�l�R�m���[�E�F��#3014_0"; //1807
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r52") == 0) {//���E��1F
		hideoffnpc "�l�R�m���[�E�F��#3014_9"; //1807
	}
	else {
		hideoffnpc "�l�R�m���[�E�F��#3014_1"; //1807
	}
	end;
}
1_tiamat_41.gat,99,25,4	script	�l�R�m���[�E�F��#302_1	416,{/* 1809 (hide)*/
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	announce "�l�R�m���[�E�F�� : �ӂށc�c�A���̕����ɂ���̂́A���̑������̂悤�ł��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	announce "�l�R�m���[�E�F�� : ����p�l���ɂ́u�\�[�h�A�����h�A�R�C���A�J�b�v�̏؂������v�Ə�����Ă��܂����A�ӂށc�c�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer11000:
	misceffect 348, "�O���[�U��#r16CG02"; //897
	announce "�O���[�U������������A���̒��ɐ���������", 0x9, 0xffffff, 0x190, 20, 0, 0;
	end;
OnTimer13000:
	misceffect 668, "�O���[�U��#r16CG02"; //897
	announce "�l������c�c�ڊo�߂�c�c", 0x9, 0xff0000, 0x190, 30, 0, 0;
	donpcevent "�O���[�U��#r16CG02::OnStart";
	end;
OnTimer15000:
	misceffect 6, "�O���[�U��#r16CG02"; //897
	announce "�u���E��@2F�v�́u���2F01�v�̔��̌����J����", 0x9, 0xffff00, 0x190, 30, 0, 0;
	if(getvariableofnpc('flag,"tiamat_mob#r19") == 0) {
		misceffect 234, "area#r193";
		misceffect 406, "area#r193";
		hideonnpc "area#k193"; //1258
		hideoffnpc "area#r193"; //1258
	}
	misceffect 234, "area#r363";
	misceffect 406, "area#r363";
	hideonnpc "area#k363"; //1258
	hideoffnpc "area#r363"; //1258
	killmonster "1_tiamat_08.gat","tiamat_mob#r36::OnKilled2";
	end;
OnTimer18000:
	announce "�l�R�m���[�E�F�� : ���������͂ł���悤�ł��B�ӂށc�c�����ɂ������l�����̑��𒲂ׂĂ݂܂��傤���B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer20000:
	stopnpctimer;
	hideonnpc "�l�R�m���[�E�F��#302_1"; //1809
	end;
}
1_tiamat_52.gat,115,138,2	script	�l�R�m���[�E�F��#303_1	416,{/* 1811 */
	end;
OnStart:
	initnpctimer;
	announce "�l�R�m���[�E�F�� : �Փa�ł��B�@�悤�₭�H����܂����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer4000:
	announce "�l�R�m���[�E�F�� : �P�l�������]���ꂽ�A����������Ŗ߂�܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer7000:
	hideonnpc "�l�R�m���[�E�F��#303_1"; //1811
	hideoffnpc "�l�R�m���[�E�F��#303_2"; //1812
	end;
OnTimer9000:
	misceffect 39, "�l�R�m���[�E�F��#303_1"; //1811
	end;
OnTimer10000:
	announce "�u�l�R�m���[�E�F���v���u���炩�Ȑ��v����肵�܂���", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	end;
OnTimer13000:
	announce "�l�R�m���[�E�F�� : ����ŗǂ��B�ł́A�_�a1F�́u���̕�v�Ɍ������܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer15000:
	stopnpctimer;
	hideonnpc "�l�R�m���[�E�F��#303_1"; //1811
	hideonnpc "�l�R�m���[�E�F��#303_2"; //1812
	donpcevent "#tiamat_start::OnLowen";
	if(getvariableofnpc('flag,"tiamat_mob#r180") > 0) {	//�T���̊�
		hideoffnpc "�l�R�m���[�E�F��#3031_1"; //1811
		hideoffnpc "�l�R�m���[�E�F��#3031_2"; //1812
		set $@tiamat_lowen,31;
	}
	else if(getvariableofnpc('flag,"tiamat_mob#r181") > 0) {	//���̕�
		hideoffnpc "�l�R�m���[�E�F��#3032_1";
		set $@tiamat_lowen,32;
	}
	else {
		hideoffnpc "�l�R�m���[�E�F��#3033_1";
		set $@tiamat_lowen,33;
	}
	end;
}
1_tiamat_52.gat,116,138,6	script	�l�R�m���[�E�F��#303_2	416,{/* 1812 (hide)*/}
1_tiamat_55.gat,290,243,4	script	�l�R�m�~���J#1001_1	728,{/* 1813 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���́c���ˁB";
	mes "^0000ff���@1F^000000�Ɍ������܂��傤�B";
	close;
}
1_tiamat_60.gat,90,100,4	script	�l�R�m�~���J#1002_1	728,{/* 1814 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�W�����g�͋��炭����̍Ő[���ɂ���͂��B";
	mes "���A�l�͂��̎��Ԃ�z�肵��";
	mes "�Ő[���ɓ��邽�߂�";
	mes "�L�[�ƂȂ�A�C�e����T���悤��";
	mes "���B�Ɏw�����o���Ă����́B";
	mes "�܂���^0000ff����(����)^000000�Ɍ������܂��傤�B";
	close;
}
1_tiamat_50.gat,111,128,4	script	�l�R�m�~���J#1003_1	728,{/* 1815 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H03��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff����(��)^000000��B";
	close;
}
1_tiamat_13.gat,81,42,4	script	�l�R�m�~���J#1004_1	728,{/* 1816 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H03��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff��q��^000000��B";
	close;
}
1_tiamat_44.gat,110,123,4	script	�l�R�m�~���J#1005_1	728,{/* 1817 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H03��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff����1F�ʘH01^000000��B";
	close;
}
1_tiamat_54.gat,56,122,4	script	�l�R�m�~���J#1006_1	728,{/* 1818 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H03��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff����1F��c��^000000��B";
	close;
}
1_tiamat_54.gat,45,117,4	script	�l�R�m�~���J#1007_1	728,{/* 1819 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "����^0000ff����1F�ʘH02^000000�Ɍ������܂��傤�B";
	mes "^0000ff��q��^000000�܂Ŗ߂���";
	mes "���Ɍ������Ηǂ���B";
	close;
}
1_tiamat_54.gat,43,48,4	script	�l�R�m�~���J#1007_2	728,{/* 1820 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "����^0000ff����1F�ʘH02^000000�Ɍ������܂��傤�B";
	mes "^0000ff��q��^000000�܂Ŗ߂���";
	mes "���Ɍ������Ηǂ���B";
	close;
}
1_tiamat_44.gat,87,120,4	script	�l�R�m�~���J#1007_3	728,{/* 1821 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "����^0000ff����1F�ʘH02^000000�Ɍ������܂��傤�B";
	mes "���̐��̕����ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,205,89,4	script	�l�R�m�~���J#1008_1	728,{/* 1822 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H03��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F�ʘH01^000000��B";
	close;
}
1_tiamat_54.gat,250,135,4	script	�l�R�m�~���J#1009_1	728,{/* 1823 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H03��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F��c���@^000000��B";
	close;
}
1_tiamat_54.gat,253,123,4	script	�l�R�m�~���J#1010_1	728,{/* 1824 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H01��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F�ʘH02^000000��B";
	close;
}
1_tiamat_54.gat,284,137,4	script	�l�R�m�~���J#1010_2	728,{/* 1825 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F�ʘH02^000000��B";
	mes "���̓�ɂ��镔���ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,287,72,4	script	�l�R�m�~���J#1011_1	728,{/* 1826 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F��c���A^000000��B";
	mes "���̓��ɂ��镔���ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,297,71,4	script	�l�R�m�~���J#1012_1	728,{/* 1827 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ�B";
	mes "����͑��̑��ɔC���Ă��邩��";
	mes "���B�͐��H01��ʂ��Ă����܂��傤�B";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F������^000000��B";
	close;
}
1_tiamat_54.gat,283,122,4	script	�l�R�m�~���J#1012_2	728,{/* 1828 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F������^000000��B";
	mes "���̓��ɂ��镔���ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,293,118,4	script	�l�R�m�~���J#1013_1	728,{/* 1829 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F���c��^000000��B";
	mes "^0000ff����2F�ʘH02^000000�܂Ŗ߂���";
	mes "�k�ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,278,128,4	script	�l�R�m�~���J#1013_2	728,{/* 1830 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F���c��^000000��B";
	mes "^0000ff����2F�ʘH01^000000�܂Ŗ߂���";
	mes "���ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,228,138,4	script	�l�R�m�~���J#1013_3	728,{/* 1831 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff����2F���c��^000000��B";
	mes "���̖k�̕����ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,227,148,4	script	�l�R�m�~���J#1014_1	728,{/* 1832 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff���˂̒�^000000��B";
	mes "^0000ff����(��)^000000�܂Ŗ߂���";
	mes "�����ɂ����˂̕t�߂���";
	mes "��ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,306,136,4	script	�l�R�m�~���J#1014_2	728,{/* 1833 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff���˂̒�^000000��B";
	mes "^0000ff����(��)^000000�܂Ŗ߂���";
	mes "�����ɂ����˂̕t�߂���";
	mes "��ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_54.gat,205,72,4	script	�l�R�m�~���J#1014_3	728,{/* 1834 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff���˂̒�^000000��B";
	mes "^0000ff����(��)^000000�܂Ŗ߂���";
	mes "�����ɂ����˂̕t�߂���";
	mes "��ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_44.gat,98,59,4	script	�l�R�m�~���J#1014_4	728,{/* 1835 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff���˂̒�^000000��B";
	mes "^0000ff����(��)^000000�܂Ŗ߂���";
	mes "�����ɂ����˂̕t�߂���";
	mes "��ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_13.gat,90,39,4	script	�l�R�m�~���J#1014_5	728,{/* 1836 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���H�Ɍ������ɂ́A����^0000ff���˂̒�^000000��B";
	mes "���̓�ɂ����˂���";
	mes "��ɐi�߂Ηǂ���B";
	close;
}
1_tiamat_05.gat,39,127,4	script	�l�R�m�~���J#1015_1	728,{/* 1837 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���悢��A���̐��^0000ff���H01^000000��B";
	mes "���H�ɓ�������閧�̒�͋߂����B";
		mes "�c�ł������Ŕ����J���Ȃ����";
		mes "���̎l�R�m�B�������";
		mes "����܂ő҂��܂��傤�B";
	close;
}
1_tiamat_26.gat,49,57,4	script	�l�R�m�~���J#1016_1	728,{/* 1838 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�׈��ȋC�z������c�c";
	mes "���̕����ɉ������肻���ˁB";
	mes "���A�l�̂��b�ɂ���";
	mes "����ɂ���S�Ă̎��V�g��";
	mes "�|���Ȃ����";
	mes "�Ő[���ւ͒H�蒅���Ȃ�������B";
	close;
}
1_tiamat_63.gat,237,261,4	script	�l�R�m�~���J#1017_1	728,{/* 1839 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���悢��A���̐��^0000ff�閧�̒�^000000��B";
	mes "�閧�̒������������";
	mes "���͏���̒T���Ɉڂ��B";
	close;
}
1_tiamat_42.gat,94,79,4	script	�l�R�m�~���J#1018_1	728,{/* 1840 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͔閧�̒납��";
	mes "����ɐN�����A����q�����������邱�Ƃ�B";
	mes "�߂���^0000ff����ʘH�ւ̔�����^000000��";
	mes "����͂��Ȃ񂾂��ǁc�c�B";
	close;
}
1_tiamat_42.gat,108,319,4	script	�l�R�m�~���J#1019_1	728,{/* 1841 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�����������邱�Ƃ�B";
	mes "����^0000ff��z�[��^000000�ɐi�ނ��B";
	close;
}
1_tiamat_02.gat,146,8,4	script	�l�R�m�~���J#1020_1	728,{/* 1842 (hide)*/
	if(!($@tiamat_angel & (1<<1))) {
		mes "[�l�R�m�~���J]";
		mes "�׈��ȋC�z������c�c";
		mes "���̕����ɉ������肻���ˁB";
		mes "���A�l�̂��b�ɂ���";
		mes "����ɂ���S�Ă̎��V�g��";
		mes "�|���Ȃ����";
		mes "�Ő[���ւ͒H�蒅���Ȃ�������B";
		close;
	}
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�����������邱�Ƃ�B";
	mes "����^0000ff�ҍ����B^000000�ɐi�ނ��B";
	close;
}
1_tiamat_02.gat,27,243,4	script	�l�R�m�~���J#1021_1	728,{/* 1843 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�������������邱�Ƃ�";
	mes "����^0000ff�G���g�����X^000000�ɐi�ނ��B";
	close;
}
1_tiamat_42.gat,86,247,4	script	�l�R�m�~���J#1022_1	728,{/* 1844 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "����q���Ɍ������ɂ́A";
	mes "����^0000ff�o���R�j�[�@^000000��B";
	mes "���̖k�ɐi�߂Ηǂ���B";
	if(getvariableofnpc('flag,"���o�[#006_1")+getvariableofnpc('flag,"���o�[#006_2")+getvariableofnpc('flag,"���o�[#006_3") < 3) {
		mes "�c�ł����͕��󂳂�Ă���悤�ˁB";
		mes "���͂̕����ɉ������󂪉���������";
		mes "�d�|���̂悤�Ȃ��̂͂Ȃ�������H";
	}
	close;
}
1_tiamat_58.gat,48,72,4	script	�l�R�m�~���J#1023_1	728,{/* 1845 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�������������邱�Ƃ�";
	mes "����^0000ff�o���R�j�[�A^000000�ɐi�ނ��B";
	close;
}
1_tiamat_58.gat,52,19,4	script	�l�R�m�~���J#1024_1	728,{/* 1846 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�������������邱�Ƃ�";
	mes "����^0000ff�o���R�j�[�B^000000�ɐi�ނ��B";
	close;
}
1_tiamat_58.gat,19,13,4	script	�l�R�m�~���J#1025_1	728,{/* 1847 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "����q���Ɍ������ɂ́A";
	mes "����^0000ff�y���̊�^000000��B";
	mes "���̐��ɐi�߂Ηǂ���B";
	if(getvariableofnpc('flag,"���o�[#204_1")+getvariableofnpc('flag,"���o�[#007_1") < 2) {	// �ҋ@��2F�A���A2F ���o�[
		mes "�c�ł����͕��󂳂�Ă���悤�ˁB";
		mes "���͂̕����ɉ������󂪉���������";
		mes "�d�|���̂悤�Ȃ��̂͂Ȃ�������H";
	}
	close;
}
1_tiamat_37.gat,138,113,4	script	�l�R�m�~���J#1026_1	728,{/* 1848 (hide)*/
	if(!($@tiamat_angel & (1<<9))) {
		mes "[�l�R�m�~���J]";
		mes "�׈��ȋC�z������c�c";
		mes "���̕����ɉ������肻���ˁB";
		mes "���A�l�̂��b�ɂ���";
		mes "����ɂ���S�Ă̎��V�g��";
		mes "�|���Ȃ����";
		mes "�Ő[���ւ͒H�蒅���Ȃ�������B";
		close;
	}
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�����������邱�Ƃ�B";
	mes "����^0000ff������^000000�ɐi�ނ��B";
	close;
}
1_tiamat_42.gat,239,81,4	script	�l�R�m�~���J#1027_1	728,{/* 1849 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�����������邱�Ƃ�B";
	mes "����^0000ff����ʘH2F01^000000�ɐi�ނ��B";
	close;
}
1_tiamat_42.gat,274,161,4	script	�l�R�m�~���J#1028_1	728,{/* 1850 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "����q���Ɍ������ɂ́A";
	mes "����^0000ff����ʘH2F02^000000��B";
	mes "���̓��ɂ��镔���ɐi�߂Ηǂ���B";
	if(getvariableofnpc('flag,"���o�[#009_1") == 0) {	// �㖱�� ���o�[
		mes "�c�ł����͕��󂳂�Ă���悤�ˁB";
		mes "���͂̕����ɉ������󂪉���������";
		mes "�d�|���̂悤�Ȃ��̂͂Ȃ�������H";
	}
	close;
}
1_tiamat_35.gat,171,166,4	script	�l�R�m�~���J#1029_1	728,{/* 1851 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�����������邱�Ƃ�B";
	mes "����^0000ff����ʘH3F01^000000�ɐi�ނ��B";
	close;
}
1_tiamat_35.gat,65,161,4	script	�l�R�m�~���J#1030_1	728,{/* 1852 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "����q�����������邱�Ƃ�B";
	mes "����^0000ff����ʘH3F02^000000�ɐi�ނ��B";
	close;
}
1_tiamat_42.gat,79,172,4	script	�l�R�m�~���J#1031_1	728,{/* 1853 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "���悢��A���̐��^0000ff����q��^000000��B";
	mes "����ƒH�������ˁB����������B";
	if(getvariableofnpc('flag,"���o�[#011_1") == 0) {	// ���̐Q�� ���o�[
		mes "�c�ł����͕��󂳂�Ă���悤�ˁB";
		mes "���͂̕����ɉ������󂪉���������";
		mes "�d�|���̂悤�Ȃ��̂͂Ȃ�������H";
	}
	close;
}
1_tiamat_37.gat,24,113,4	script	�l�R�m�~���J#1032_1	728,{/* 1854 (hide)*/}
1_tiamat_42.gat,50,164,4	script	�l�R�m�~���J#1032_2	728,{/* 1855 (hide)*/}
1_tiamat_35.gat,52,163,4	script	�l�R�m�~���J#1032_3	728,{/* 1856 (hide)*/}
1_tiamat_35.gat,162,161,4	script	�l�R�m�~���J#1032_4	728,{/* 1857 (hide)*/}
1_tiamat_42.gat,265,174,4	script	�l�R�m�~���J#1032_5	728,{/* 1858 (hide)*/}
1_tiamat_35.gat,135,163,4	script	�l�R�m�~���J#1033_1	728,{/* 1859 (hide)*/}
1_tiamat_04.gat,67,52,4	script	�l�R�m�~���J#1034_1	728,{/* 1860 (hide)*/}
1_tiamat_52.gat,142,269,4	script	�l�R�m�~���J#1035_1	728,{/* 1861 (hide)*/}
1_tiamat_04.gat,144,199,4	script	�l�R�m�~���J#1036_1	728,{/* 1862 (hide)*/
		mes "[�l�R�m�~���J]";
		mes "���͂ȕ���ˁc�c";
		mes "���A�l�ł����Ă�";
		mes "�����ɂ͎��Ԃ������肻���B";
		mes "^0000ff���Ƃ̎�^000000��^0000ff�傫�Ȕ�^000000�A";
		mes "^0000ff���炩�Ȑ�^000000��������";
		mes "�����ɂł������ł���̂Ɂc�c�B";
		close;
	mes "[�l�R�m�~���J]";
	mes "�W�����g�̐��ޕ����͖ڂƕ@�̐��B";
	mes "�����܂ŗ��ꂽ���B�Ȃ�H�蒅����͂��B";
	mes "�撣��܂��傤�I";
	close;
}
1_tiamat_04.gat,186,133,4	script	�l�R�m�~���J#1037_1	728,{/* 1863 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�W�����g�̐��ޕ����͖ڂƕ@�̐��B";
	mes "�����܂ŗ��ꂽ���B�Ȃ�H�蒅����͂��B";
	mes "�撣��܂��傤�I";
	close;
}
1_tiamat_35.gat,88,179,4	script	�l�R�m�~���J#1038_1	728,{/* 1864 */
	mes "[�l�R�m�~���J]";
	mes "�W�����g�̉ЁX�����C��";
	mes "�����܂œ`����Ă��Ă�c�c";
	mes "�ł��A������킯�ɂ͂����Ȃ��B";
	mes "���������̗͂�M���āA�Ԃ���݂̂�B";
	close;
}
2_tiamat_01.gat,201,39,9	script	�l�R�m�~���J#1039_1	728,{/* 1865 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�M�������͂Ȃ�����";
	mes "����قǂ̗͂������Ȃ���";
	mes "���̂ł͂Ȃ��Ȃ�āc�c";
	mes "�ł��A���ւƐi�߂΍��x����";
	mes "�W�����g�̖{�̂�����͂��ł��B";
	close;
}
2_tiamat_00.gat,51,59,4	script	�l�R�m�~���J#1040_1	728,{/* 1866 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�Ő[���ւ̔������ɊJ���ꂽ�c�c";
	mes "�ŏI����̏����͗ǂ��H";
	mes "�C���������߂čs���܂��傤�B";
	close;
}
1_tiamat_55.gat,292,245,4	script	�l�R�m�n�E���h#2001_1	420,{/* 1868 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "���́c��傾�ȁB";
	mes "^0000ff���@1F^000000�Ɍ��������B";
	close;
}
1_tiamat_60.gat,113,59,4	script	�l�R�m�n�E���h#2002_1	420,{/* 1869 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�W�����g�̓z�́A���炭����̍Ő[���ɂ���B";
	mes "�P����́A���̎��Ԃ�z�肵��";
	mes "�Ő[���ɓ��邽�߂̃L�[�ƂȂ�A�C�e����";
	mes "�T���Ɖ��l�ɖ��߂��Ă�񂾁B";
	mes "�悤���A���O��I";
	mes "�܂���^0000ff���E��A1F^000000�Ɍ��������B";
	close;
}
1_tiamat_61.gat,176,98,4	script	�l�R�m�n�E���h#2003_1	420,{/* 1870 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E��A2F^000000�ɍs�����B";
	close;
}
1_tiamat_61.gat,119,53,4	script	�l�R�m�n�E���h#2004_1	420,{/* 1871 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���2F05^000000�ɍs�����B";
	close;
}
1_tiamat_56.gat,90,117,4	script	�l�R�m�n�E���h#2005_1	420,{/* 1872 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E�쓌2F^000000�ɍs�����B";
	close;
}
1_tiamat_17.gat,63,42,4	script	�l�R�m�n�E���h#2006_1	420,{/* 1873 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E�쓌3F^000000�ɍs�����B";
	close;
}
1_tiamat_18.gat,51,45,4	script	�l�R�m�n�E���h#2007_1	420,{/* 1874 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E�쓌1F^000000�ɍs�����B";
	close;
}
1_tiamat_16.gat,62,51,4	script	�l�R�m�n�E���h#2008_1	420,{/* 1875 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E�쓌����^000000�ɍs�����B";
	close;
}
1_tiamat_03.gat,201,348,4	script	�l�R�m�n�E���h#2009_1	420,{/* 1876 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E��A����^000000�ɍs�����B";
	close;
}
1_tiamat_03.gat,110,245,4	script	�l�R�m�n�E���h#2010_1	420,{/* 1877 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E�쓌B1F^000000�ɍs�����B";
	close;
}
1_tiamat_19.gat,21,27,4	script	�l�R�m�n�E���h#2011_1	420,{/* 1878 (hide)*/
	if(!($@tiamat_angel & (1<<15))) {
		mes "[�l�R�m�n�E���h]";
		mes "���ȋC�z�����₪�邺�c�c";
		mes "���̕����ɂ͉�������͂����B";
		mes "�P����ɂ��Ə���ɂ���S�Ă�";
		mes "���V�g��|���˂���";
		mes "�Ő[���ւ͒H�蒅���Ȃ��񂾂Ƃ�B";
		close;
	}
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff��ǒʘH02^000000�Ɍ��������B";
	mes "�]�ڂ̐Δ��^0000ff���E�쓌3F^000000�܂Ŗ߂���";
	mes "�������ꏊ�����Ɍ������Ηǂ��B";
	close;
}
1_tiamat_18.gat,46,16,4	script	�l�R�m�n�E���h#2011_2	420,{/* 1879 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff��ǒʘH02^000000�Ɍ��������B";
	mes "���l�̓�̕����ɐi�߂Ηǂ��B";
	close;
}
1_tiamat_46.gat,60,159,4	script	�l�R�m�n�E���h#2012_1	420,{/* 1880 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃ��B";
	mes "���l�B�͐���A��߂Ă���A���̑���";
	mes "��������B�܂��͌��������Ȃ��ƂȁB";
	mes "����^0000ff���E��A3F^000000�ɍs�����B";
	close;
}
1_tiamat_61.gat,50,55,4	script	�l�R�m�n�E���h#2013_1	420,{/* 1881 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff��ǒʘH04^000000�Ɍ��������B";
	mes "^0000ff���E�쓌3F^000000�܂Ŗ߂���";
	mes "�������ꏊ����k�Ɍ������Ηǂ��B";
	close;
}
1_tiamat_46.gat,83,156,4	script	�l�R�m�n�E���h#2013_2	420,{/* 1882 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff��ǒʘH04^000000�Ɍ��������B";
	mes "^0000ff���E�쓌3F^000000�܂Ŗ߂���";
	mes "�������ꏊ����k�Ɍ������Ηǂ��B";
	close;
}
1_tiamat_18.gat,52,86,4	script	�l�R�m�n�E���h#2013_3	420,{/* 1883 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff��ǒʘH04^000000�Ɍ��������B";
	mes "���l�̖k�̕����ɐi�߂Ηǂ��B";
	close;
}
1_tiamat_46.gat,90,230,4	script	�l�R�m�n�E���h#2014_1	420,{/* 1884 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff���E��3F^000000�ɍs�����B";
	close;
}
1_tiamat_41.gat,80,82,4	script	�l�R�m�n�E���h#2015_1	420,{/* 1885 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff��ǒʘH06^000000�ɍs�����B";
	close;
}
1_tiamat_49.gat,90,264,4	script	�l�R�m�n�E���h#2016_1	420,{/* 1886 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff���E�k��3F^000000�ɍs�����B";
	close;
}
1_tiamat_08.gat,179,10,4	script	�l�R�m�n�E���h#2017_1	420,{/* 1887 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff��ǒʘH08^000000�ɍs�����B";
	close;
}
1_tiamat_49.gat,39,287,4	script	�l�R�m�n�E���h#2018_1	420,{/* 1888 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff���E�k�A3F^000000�ɍs�����B";
	close;
}
1_tiamat_22.gat,115,110,4	script	�l�R�m�n�E���h#2019_1	420,{/* 1889 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff���E�k�A2F^000000�ɍs�����B";
	close;
}
1_tiamat_22.gat,44,90,4	script	�l�R�m�n�E���h#2020_1	420,{/* 1890 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff���E�k�A1F^000000�ɍs�����B";
	close;
}
1_tiamat_22.gat,161,156,4	script	�l�R�m�n�E���h#2021_1	420,{/* 1891 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������ɓ��������A";
	mes "�������Ɛ���A��߂�";
	mes "�閧�̒�Ɍ������Ƃ��邩�B";
	mes "����^0000ff���E�k�AB1F^000000�ɍs�����B";
	close;
}
1_tiamat_33.gat,258,280,4	script	�l�R�m�n�E���h#2022_1	420,{/* 1892 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����A���߂����A";
	mes "�������Ɣ閧�̒�ɍs�������B";
	mes "���H��ʂ��čs���΂������B";
	mes "����^0000ff����ʘHB1F^000000�ɍs�����B";
	close;
}
1_tiamat_26.gat,120,150,4	script	�l�R�m�n�E���h#2023_1	420,{/* 1893 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����A���߂����A";
	mes "�������Ɣ閧�̒�ɍs�������B";
	mes "���H��ʂ��čs���΂������B";
	mes "����^0000ff���H03^000000�ɍs�����B";
	close;
}
1_tiamat_26.gat,50,91,4	script	�l�R�m�n�E���h#2024_1	420,{/* 1894 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����A���߂����A";
	mes "�������Ɣ閧�̒�ɍs�������B";
	mes "���H��ʂ��čs���΂������B";
	mes "����^0000ff�����^000000�ɍs�����B";
	close;
}
1_tiamat_63.gat,239,263,4	script	�l�R�m�n�E���h#2025_1	420,{/* 1895 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "���悢��A����^0000ff�閧�̒�^000000���ȁB";
	mes "�x�����蔖�ȏꏊ������";
	mes "�������������X�^�[�͂��Ȃ��Ǝv�����A";
	mes "�������邩�킩���B���f����Ȃ�B";
	close;
}
1_tiamat_42.gat,101,79,4	script	�l�R�m�n�E���h#2026_1	420,{/* 1896 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�́A�閧�̒납�����ɐN����";
	mes "������ւ̓����J�����Ƃ��B";
	mes "�߂���^0000ff����ʘH�ւ̔�����^000000��";
	mes "������ĕ����Ă��񂾂��c�c�ǂ����H";
	close;
}
1_tiamat_42.gat,106,320,4	script	�l�R�m�n�E���h#2027_1	420,{/* 1897 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͏����T�����A";
	mes "������ւ̓����J�����Ƃ��B";
	mes "����^0000ff��z�[��^000000�ɍs�����B";
	close;
}
1_tiamat_02.gat,147,10,4	script	�l�R�m�n�E���h#2028_1	420,{/* 1898 (hide)*/
	if(!($@tiamat_angel & (1<<1))) {
		mes "[�l�R�m�n�E���h]";
		mes "���ȋC�z�����₪�邺�c�c";
		mes "���̕����ɂ͉�������͂����B";
		mes "�P����ɂ��Ə���ɂ���S�Ă�";
		mes "���V�g��|���˂���";
		mes "�Ő[���ւ͒H�蒅���Ȃ��񂾂Ƃ�B";
		close;
	}
	mes "[�l�R�m�n�E���h]";
	mes "�������^0000ff����(����)^000000��";
	mes "���̔�����s����G���A�ɂ���B";
	mes "���߂͔��͕܂��Ă������A";
	mes "���낻������J���Ă���͂����B";
	mes "����^0000ff�ҍ����B^000000�ɍs�����B";
	close;
}
1_tiamat_02.gat,29,245,4	script	�l�R�m�n�E���h#2029_1	420,{/* 1899 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�������^0000ff����(����)^000000��";
	mes "���̔�����s����G���A�ɂ���B";
	mes "���߂͔��͕܂��Ă������A";
	mes "���낻������J���Ă���͂����B";
	mes "����^0000ff�G���g�����X^000000�ɍs�����B";
	close;
}
1_tiamat_42.gat,97,215,4	script	�l�R�m�n�E���h#2030_1	420,{/* 1900 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�������^0000ff����(����)^000000��";
	mes "���̔�����s����G���A�ɂ���B";
	mes "���߂͔��͕܂��Ă������A";
	mes "���낻������J���Ă���͂����B";
	mes "����^0000ff���A1F^000000�ɍs�����B";
	close;
}
1_tiamat_49.gat,241,8,4	script	�l�R�m�n�E���h#2031_1	420,{/* 1901 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�������^0000ff����(����)^000000��";
	mes "���̔�����s����G���A�ɂ���B";
	mes "���߂͔��͕܂��Ă������A";
	mes "���낻������J���Ă���͂����B";
	mes "����^0000ff����(�k)^000000�ɍs�����B";
	close;
}
1_tiamat_47.gat,173,11,4	script	�l�R�m�n�E���h#2032_1	420,{/* 1902 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�������^0000ff����(����)^000000��";
	mes "���̔�����s����G���A�ɂ���B";
	mes "���߂͔��͕܂��Ă������A";
	mes "���낻������J���Ă���͂����B";
	close;
}
1_tiamat_50.gat,158,143,4	script	�l�R�m�n�E���h#2033_1	420,{/* 1903 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�悤�₭������̂���";
	mes "�G���A�ւ̓����J�����ȁB";
	mes "�܂���͒������A�㉹��f���񂶂�˂����H";
	mes "����^0000ff����(��)^000000�ɍs�����B";
	close;
}
1_tiamat_29.gat,261,198,4	script	�l�R�m�n�E���h#2034_1	420,{/* 1904 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͎��͂�T�����A";
	mes "��������������邱�Ƃ��B";
	mes "����^0000ff���E��1F^000000�ɍs�����B";
	close;
}
1_tiamat_14.gat,33,24,4	script	�l�R�m�n�E���h#2035_1	420,{/* 1905 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͎��͂�T�����A";
	mes "��������������邱�Ƃ��B";
	mes "����^0000ff���E��2F^000000�ɍs�����B";
	close;
}
1_tiamat_14.gat,11,69,4	script	�l�R�m�n�E���h#2036_1	420,{/* 1906 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͎��͂�T�����A";
	mes "��������������邱�Ƃ��B";
	mes "����^0000ff���2F06^000000�ɍs�����B";
	close;
}
1_tiamat_56.gat,114,179,4	script	�l�R�m�n�E���h#2037_1	420,{/* 1907 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff����2F�����^000000�Ɍ��������B";
	mes "���l�̐��̕����ɐi�߂Ηǂ��B";
	close;
}
1_tiamat_30.gat,76,35,4	script	�l�R�m�n�E���h#2038_1	420,{/* 1908 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͎��͂�T�����A";
	mes "��������������邱�Ƃ��B";
	mes "����^0000ff����2F�ʘH^000000�ɍs�����B";
	close;
}
1_tiamat_31.gat,278,61,4	script	�l�R�m�n�E���h#2039_1	420,{/* 1909 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff����1F�ʘH^000000�Ɍ��������B";
	mes "���l�̓�̕����ɐi�߂Ηǂ��B";
	mes "�c�c�����A�������󂳂�Ă₪��B";
	mes "���͂̕����ɉ������󂪉���������";
	mes "���o�[�̂悤�Ȃ��̂͂Ȃ��������H";
	close;
}
1_tiamat_31.gat,18,95,4	script	�l�R�m�n�E���h#2040_1	420,{/* 1910 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff�g�p�l���Z��E�L��^000000�Ɍ��������B";
	mes "���l�̐��ɂ���o������^0000ff����(��)^000000�ɏo��";
	mes "�k���Ɍ������Ηǂ��B";
	if(getvariableofnpc('flag,"���o�[#106_1") == 0) {
		mes "�c�c�����A�������󂳂�Ă₪��B";
		mes "���͂̕����ɉ������󂪉���������";
		mes "���o�[�̂悤�Ȃ��̂͂Ȃ��������H";
	}
	close;
}
1_tiamat_29.gat,185,244,4	script	�l�R�m�n�E���h#2040_2	420,{/* 1911 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͎��͂�T�����A";
	mes "��������������邱�Ƃ��B";
	mes "����^0000ff�g�p�l���Z��E�L��^000000�ɍs�����B";
	close;
}
1_tiamat_34.gat,240,216,4	script	�l�R�m�n�E���h#2041_1	420,{/* 1912 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "����^0000ff���g������^000000�Ɍ��������B";
	mes "���l�̐��̕����ɐi�߂Ηǂ��B";
	if(getvariableofnpc('flag,"���o�[#107_1")+getvariableofnpc('flag,"���o�[#107_2")+getvariableofnpc('flag,"���o�[#107_3") < 3) {
		mes "�c�c�����A�������󂳂�Ă₪��B";
		mes "���͂̕����ɉ������󂪉���������";
		mes "���o�[�̂悤�Ȃ��̂͂Ȃ��������H";
	}
	close;
}
1_tiamat_51.gat,338,111,4	script	�l�R�m�n�E���h#2042_1	420,{/* 1913 (hide)*/
	if(!($@tiamat_angel & (1<<13))) {
		mes "[�l�R�m�n�E���h]";
		mes "���ȋC�z�����₪�邺�c�c";
		mes "���̕����ɂ͉�������͂����B";
		mes "�P����ɂ��Ə���ɂ���S�Ă�";
		mes "���V�g��|���˂���";
		mes "�Ő[���ւ͒H�蒅���Ȃ��񂾂Ƃ�B";
		close;
	}
	mes "[�l�R�m�n�E���h]";
	mes "���͂���^0000ff������^000000���B";
	mes "���l�̖k�̕����ɐi�߂Ηǂ��B";
	close;
}
1_tiamat_32.gat,45,173,4	script	�l�R�m�n�E���h#2043_1	420,{/* 1914 (hide)*/}
1_tiamat_38.gat,83,93,4	script	�l�R�m�n�E���h#2044_1	420,{/* 1915 (hide)*/}
1_tiamat_22.gat,151,32,4	script	�l�R�m�n�E���h#2045_1	420,{/* 1916 (hide)*/}
1_tiamat_08.gat,14,48,4	script	�l�R�m�n�E���h#2046_1	420,{/* 1917 (hide)*/}
1_tiamat_08.gat,98,48,4	script	�l�R�m�n�E���h#2047_1	420,{/* 1918 (hide)*/}
1_tiamat_08.gat,179,9,4	script	�l�R�m�n�E���h#2047_2	420,{/* 1919 (hide)*/}
1_tiamat_49.gat,39,287,4	script	�l�R�m�n�E���h#2047_3	420,{/* 1920 (hide)*/}
1_tiamat_22.gat,115,110,4	script	�l�R�m�n�E���h#2047_4	420,{/* 1921 (hide)*/}
1_tiamat_22.gat,54,102,4	script	�l�R�m�n�E���h#2047_5	420,{/* 1922 (hide)*/}
1_tiamat_35.gat,137,164,4	script	�l�R�m�n�E���h#2048_1	420,{/* 1923 (hide)*/}
1_tiamat_04.gat,69,51,4	script	�l�R�m�n�E���h#2049_1	420,{/* 1924 (hide)*/}
1_tiamat_52.gat,144,270,4	script	�l�R�m�n�E���h#2050_1	420,{/* 1925 (hide)*/}
1_tiamat_04.gat,146,200,4	script	�l�R�m�n�E���h#2051_1	420,{/* 1926 (hide)*/
		mes "[�l�R�m�n�E���h]";
		mes "�������͗��΂ɉ��l�ł��c�c";
		mes "�P����ł���ؓ�ł͂����񂾂낤���B";
		mes "^0000ff���Ƃ̎�^000000��^0000ff�傫�Ȕ�^000000�A";
		mes "^0000ff���炩�Ȑ�^000000��������";
		mes "�����ςȂ񂾂��Ȃ��c�c�B";
		close;
	mes "[�l�R�m�n�E���h]";
	mes "�W�����g�̓z�����ޕ����܂�";
	mes "���������̂͂����B";
	mes "���l�����Ȃ�Ȃ�Ƃ��Ȃ邾��B";
	mes "�悵�A���O��s�������I";
	close;
}
1_tiamat_04.gat,188,134,4	script	�l�R�m�n�E���h#2052_1	420,{/* 1927 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�W�����g�̓z�����ޕ����܂�";
	mes "���������̂͂����B";
	mes "���l�����Ȃ�Ȃ�Ƃ��Ȃ邾��B";
	mes "�悵�A���O��s�������I";
	close;
}
1_tiamat_35.gat,85,179,4	script	�l�R�m�n�E���h#2053_1	420,{/* 1928 */
	mes "[�l�R�m�n�E���h]";
	mes "�W�����g�̓z�́A���̐悩�c�c";
	mes "�����c�c���o�C�C�z���`����Ă��邺�B";
	mes "�܂��A�����܂ŗ������邵���˂��B";
	mes "�C�������Ă��������I";
	close;
}
2_tiamat_01.gat,203,40,9	script	�l�R�m�n�E���h#2054_1	420,{/* 1929 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "������������̂́A���e���ƁH";
	mes "�����c�c�p�S�[���W�����g�̓z��";
	mes "��肻���Ȃ��Ƃ����B";
	mes "�C����蒼���Đi�������B";
	mes "���x�����A���������Ă��B";
	close;
}
2_tiamat_00.gat,53,60,4	script	�l�R�m�n�E���h#2055_1	420,{/* 1930 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�����Ă��΂��Ă��A���ꂪ�Ōゾ�B";
	mes "�o��͂ł��Ă邾�낤�ȁH";
	mes "���Ă�͂̌����s������";
	mes "������������邼�I";
	close;
}
1_tiamat_55.gat,288,244,4	script	�l�R�m���[�E�F��#3001_1	416,{/* 1932 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "���́c���ł��ˁB";
	mes "^0000ff���@1F^000000�Ɍ������܂��傤�B";
	close;
}
1_tiamat_60.gat,74,58,4	script	�l�R�m���[�E�F��#3002_1	416,{/* 1933 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����͋��炭�����";
	mes "�Ő[���ɂ���̂ł��傤�B";
	mes "���̎��Ԃ�z�肵�ĕP�l��";
	mes "���ɍŐ[���ɓ��邽�߂�";
	mes "�L�[�A�C�e����T���悤�ɋ��܂����B";
	mes "�܂���^0000ff���E��@1F^000000�Ɍ������܂��傤�B";
	close;
}
1_tiamat_08.gat,15,306,4	script	�l�R�m���[�E�F��#3003_1	416,{/* 1934 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃł��B";
	mes "��X�͐���@��߂Ă��獇�����܂��B";
	mes "�܂��͌���T���܂��傤�B";
	mes "����^0000ff���E��@2F^000000�ł��B";
	close;
}
1_tiamat_08.gat,98,306,4	script	�l�R�m���[�E�F��#3004_1	416,{/* 1935 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃł��B";
	mes "��X�͐���@��߂Ă��獇�����܂��B";
	mes "�܂��͌���T���܂��傤�B";
	mes "����^0000ff���E��@3F^000000�ł��B";
	close;
}
1_tiamat_08.gat,186,306,4	script	�l�R�m���[�E�F��#3005_1	416,{/* 1936 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃł��B";
	mes "��X�͐���@��߂Ă��獇�����܂��B";
	mes "�܂��͌���T���܂��傤�B";
	mes "����^0000ff���E��@����^000000�ł��B";
	close;
}
1_tiamat_57.gat,107,106,4	script	�l�R�m���[�E�F��#3006_1	416,{/* 1937 */
	mes "[�l�R�m���[�E�F��]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃł��B";
	mes "��X�͐���@��߂Ă��獇�����܂��B";
	mes "�܂��͌���T���܂��傤�B";
	mes "����^0000ff���@����^000000�ł��B";
	close;
}
1_tiamat_57.gat,138,126,4	script	�l�R�m���[�E�F��#3007_1	416,{/* 1938 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�S�G���A��T�����邽�߂�";
	mes "���ʂ̖ڕW�͑S�Ă̐����߁A";
	mes "�閧�̒���������邱�Ƃł��B";
	mes "��X�͐���@��߂Ă��獇�����܂��B";
	mes "�܂��͌���T���܂��傤�B";
	mes "����^0000ff���@3F^000000�ł��B";
	close;
}
1_tiamat_41.gat,99,9,4	script	�l�R�m���[�E�F��#3008_1	416,{/* 1939 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A^0000ff���E��@3F^000000�܂Ŗ߂��Ă���";
	mes "^0000ff��ǒʘH01^000000�ɐi�݂܂��傤�B";
	close;
}
1_tiamat_57.gat,113,120,4	script	�l�R�m���[�E�F��#3008_2	416,{/* 1940 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A^0000ff���E��@3F^000000�܂Ŗ߂��Ă���";
	mes "^0000ff��ǒʘH01^000000�ɐi�݂܂��傤�B";
	close;
}
1_tiamat_57.gat,83,75,4	script	�l�R�m���[�E�F��#3008_3	416,{/* 1941 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A^0000ff���E��@3F^000000�܂Ŗ߂��Ă���";
	mes "^0000ff��ǒʘH01^000000�ɐi�݂܂��傤�B";
	close;
}
1_tiamat_08.gat,179,269,4	script	�l�R�m���[�E�F��#3008_4	416,{/* 1942 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@�Ɍ������ɂ́A";
	mes "����^0000ff��ǒʘH^000000�ɐi�ޕK�v������܂��B";
	mes "���̐��ɐi�߂Ηǂ��ł��傤�B";
	close;
}
1_tiamat_45.gat,24,8,4	script	�l�R�m���[�E�F��#3009_1	416,{/* 1943 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A^0000ff���E�쐼3F^000000�ɖ߂���";
	mes "^0000ff��ǒʘH03^000000�ł��B";
	close;
}
1_tiamat_08.gat,206,211,4	script	�l�R�m���[�E�F��#3009_2	416,{/* 1944 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A���̓��ɐi���";
	mes "^0000ff��ǒʘH03^000000�ł��B";
	close;
}
1_tiamat_45.gat,15,82,4	script	�l�R�m���[�E�F��#3010_1	416,{/* 1945 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A���̖k�ɐi���";
	mes "^0000ff���E��3F^000000�ł��B";
	close;
}
1_tiamat_08.gat,179,132,4	script	�l�R�m���[�E�F��#3011_1	416,{/* 1946 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "����^0000ff��ǒʘH05^000000�ɐi�ޕK�v������܂��B";
	mes "���̐��ɐi�߂Ηǂ��ł��傤�B";
	close;
}
1_tiamat_48.gat,16,46,4	script	�l�R�m���[�E�F��#3011_2	416,{/* 1947 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A���̖k�ɐi���";
	mes "^0000ff���E�k��3F^000000�ł��B";
	close;
}
1_tiamat_41.gat,29,82,4	script	�l�R�m���[�E�F��#3011_3	416,{/* 1948 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A���̓��ɐi���";
	mes "^0000ff��ǒʘH07^000000�ł��B";
	close;
}
1_tiamat_48.gat,69,64,4	script	�l�R�m���[�E�F��#3011_4	416,{/* 1949 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A���̓��ɐi���";
	mes "^0000ff���E�k�@3F^000000�ł��B";
	close;
}
1_tiamat_08.gat,186,390,4	script	�l�R�m���[�E�F��#3012_1	416,{/* 1950 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A���̖k�ɐi���";
	mes "^0000ff���E�k�@4F^000000�ł��B";
	close;
}
1_tiamat_08.gat,272,390,4	script	�l�R�m���[�E�F��#3013_1	416,{/* 1951 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "������ɓ���܂������A";
	mes "����@��߂Ă���";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A���̖k�ɐi���";
	mes "^0000ff���E�k�@�V����^000000�ł��B";
	close;
}
1_tiamat_01.gat,105,195,4	script	�l�R�m���[�E�F��#3014_1	416,{/* 1952 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A^0000ff���E�k�@4F^000000�ɖ߂�܂��傤�B";
	close;
}
1_tiamat_08.gat,307,351,4	script	�l�R�m���[�E�F��#3014_2	416,{/* 1953 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "�܂��́A^0000ff���E�k�@3F^000000�ɖ߂�܂��傤�B";
	close;
}
1_tiamat_08.gat,179,352,4	script	�l�R�m���[�E�F��#3014_3	416,{/* 1954 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A^0000ff��ǒʘH07^000000�ɖ߂�܂��傤�B";
	close;
}
1_tiamat_48.gat,36,62,4	script	�l�R�m���[�E�F��#3014_4	416,{/* 1955 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A^0000ff���E�k��3F^000000�ɖ߂�܂��傤�B";
	close;
}
1_tiamat_41.gat,14,82,4	script	�l�R�m���[�E�F��#3014_5	416,{/* 1956 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A^0000ff��ǒʘH05^000000�ɖ߂�܂��傤�B";
	close;
}
1_tiamat_48.gat,12,13,4	script	�l�R�m���[�E�F��#3014_6	416,{/* 1957 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A^0000ff���E��3F^000000�ɖ߂�܂��傤�B";
	close;
}
1_tiamat_08.gat,221,95,4	script	�l�R�m���[�E�F��#3014_7	416,{/* 1958 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A^0000ff���E��2F^000000�ɖ߂�܂��傤�B";
	close;
}
1_tiamat_08.gat,133,95,4	script	�l�R�m���[�E�F��#3014_8	416,{/* 1959 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "����@���߂܂�������";
	mes "�閧�̒�Ɍ������܂��傤�B";
	mes "���́A^0000ff���E��1F^000000�ɐi�݂܂��傤�B";
	close;
}
1_tiamat_08.gat,49,95,4	script	�l�R�m���[�E�F��#3014_9	416,{/* 1960 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�閧�̒�Ɍ������ɂ́A����^0000ff����(��)^000000�ł��B";
	mes "���̓������ɐi�݂܂��傤�B";
	close;
}
1_tiamat_13.gat,88,41,4	script	�l�R�m���[�E�F��#3014_0	416,{/* 1961 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�閧�̒�Ɍ������ɂ́A����^0000ff���˂̒�^000000�ł��B";
	mes "���̓�ɂ����˂���";
	mes "��ɐi�݂܂��傤�B";
	close;
}
1_tiamat_05.gat,37,129,4	script	�l�R�m���[�E�F��#3015_1	416,{/* 1962 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "���̐��^0000ff���H01^000000�ł��B";
	mes "���H�ɓ�������閧�̒�͂����ł��ˁB";
		mes "�c�ł������Ŕ����J���Ȃ��ł���";
		mes "���̎l�R�m�B�������";
		mes "����܂ő҂��܂��傤�B";
	close;
}
1_tiamat_26.gat,47,55,4	script	�l�R�m���[�E�F��#3016_1	416,{/* 1963 (hide)*/
	if(!($@tiamat_angel & (1<<14))) {
		mes "[�l�R�m���[�E�F��]";
		mes "�׈��ȋC�z������c�c";
		mes "���̕����ɉ������肻�����B";
		mes "���A�l�̂��b�ɂ���";
		mes "����ɂ���S�Ă̎��V�g��";
		mes "�|���Ȃ����";
		mes "�Ő[���ւ͒H�蒅���Ȃ��炵���B";
		close;
	}
	mes "[�l�R�m���[�E�F��]";
	mes "���̐��^0000ff�����^000000�ł��B";
	mes "�閧�̒�͂����ł��ˁB";
	close;
}
1_tiamat_63.gat,239,259,4	script	�l�R�m���[�E�F��#3017_1	416,{/* 1964 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "���̐悪^0000ff�閧�̒�^000000�ł��B";
	mes "���������������";
	mes "����̒T�����傫���i�ނł��傤�B";
	close;
}
1_tiamat_42.gat,98,77,4	script	�l�R�m���[�E�F��#3018_1	416,{/* 1965 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "���̕����ɂ�^0000ff����ʘH�ւ�^000000";
	mes "^0000ff������^000000�����邻���ł��B";
	mes "�߂��ɉ������ꏊ�͂���܂��񂩁H";
	close;
}
1_tiamat_42.gat,106,317,4	script	�l�R�m���[�E�F��#3019_1	416,{/* 1966 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A��ɐi���";
	mes "^0000ff��z�[��^000000�ł��B";
	close;
}
1_tiamat_02.gat,144,9,4	script	�l�R�m���[�E�F��#3020_1	416,{/* 1967 (hide)*/
	if(!($@tiamat_angel & (1<<1))) {
		mes "[�l�R�m���[�E�F��]";
		mes "�������C�z�������܂��c�c";
		mes "���̕����ɂ͉������B����Ă���͂��B";
		mes "�P�l����ɂ�";
		mes "����ɂ���S�Ă̎��V�g��|�����Ƃ�";
		mes "�Ő[���ւ̓����J����A�ƁB";
		close;
	}
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A��ɐi���";
	mes "^0000ff�ҍ����B^000000�ł��B";
	close;
}
1_tiamat_02.gat,25,245,4	script	�l�R�m���[�E�F��#3021_1	416,{/* 1968 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A��ɐi���";
	mes "^0000ff�G���g�����X^000000�ł��B";
	close;
}
1_tiamat_42.gat,84,245,4	script	�l�R�m���[�E�F��#3022_1	416,{/* 1969 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�Փa�ɓ���ɂ́A����";
	mes "^0000ff�o���R�j�[�@^000000�ɐi�ޕK�v������܂��B";
	mes "���̖k�ɐi�߂Ηǂ��ł��傤�B";
	if(getvariableofnpc('flag,"���o�[#006_1")+getvariableofnpc('flag,"���o�[#006_2")+getvariableofnpc('flag,"���o�[#006_3") < 3) {
		mes "�c�c�ł����A�������󂳂�Ă��܂��ˁB";
		mes "���͂̕����ɉ���������������߂�";
		mes "�N�_�ƂȂ�悤�Ȃ��̂�����͂��ł��B";
	}
	close;
}
1_tiamat_58.gat,46,73,4	script	�l�R�m���[�E�F��#3023_1	416,{/* 1970 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A���ɐi���";
	mes "^0000ff�o���R�j�[�A^000000�ł��B";
	close;
}
1_tiamat_58.gat,50,17,4	script	�l�R�m���[�E�F��#3024_1	416,{/* 1971 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A���ɐi���";
	mes "^0000ff�o���R�j�[�B^000000�ł��B";
	close;
}
1_tiamat_58.gat,17,12,4	script	�l�R�m���[�E�F��#3025_1	416,{/* 1972 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�Փa�Ɍ��������߂ɁA";
	mes "����^0000ff�y���̊�^000000�ɐi�ޕK�v������܂��B";
	mes "���̐��ɐi�߂Ηǂ��ł��傤�B";
	if(getvariableofnpc('flag,"���o�[#204_1")+getvariableofnpc('flag,"���o�[#007_1") < 2) {	// �ҋ@��2F�A���A2F ���o�[
		mes "�c�c�ł����A�������󂳂�Ă��܂��ˁB";
		mes "���͂̕����ɉ���������������߂�";
		mes "�N�_�ƂȂ�悤�Ȃ��̂�����͂��ł��B";
	}
	close;
}
1_tiamat_37.gat,136,112,4	script	�l�R�m���[�E�F��#3026_1	416,{/* 1973 (hide)*/
	if(!($@tiamat_angel & (1<<9))) {
		mes "[�l�R�m���[�E�F��]";
		mes "�������C�z�������܂��c�c";
		mes "���̕����ɂ͉������B����Ă���͂��B";
		mes "�P�l����ɂ�";
		mes "����ɂ���S�Ă̎��V�g��|�����Ƃ�";
		mes "�Ő[���ւ̓����J����A�ƁB";
		close;
	}
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A���ɐi���";
	mes "^0000ff������^000000�ł��B";
	close;
}
1_tiamat_42.gat,238,84,4	script	�l�R�m���[�E�F��#3027_1	416,{/* 1974 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A���ɐi���";
	mes "^0000ff����ʘH2F01^000000�ł��B";
	close;
}
1_tiamat_42.gat,264,172,4	script	�l�R�m���[�E�F��#3028_1	416,{/* 1975 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A�k�ɐi���";
	mes "^0000ff����ʘH2F03^000000�ł��B";
	close;
}
1_tiamat_35.gat,133,164,4	script	�l�R�m���[�E�F��#3029_1	416,{/* 1976 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����i��ŁA�Փa��ڎw���܂��傤�B";
	mes "�����Ɏ��̖ړI�̕�������͂��ł��B";
	mes "�܂��́A��ɐi���";
	mes "^0000ff����ʘH2F01^000000�ł��B";
	close;
}
1_tiamat_04.gat,72,28,4	script	�l�R�m���[�E�F��#3030_1	416,{/* 1977 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�������������̂�ł����c�c";
	mes "�����ړI�n��^0000ff�Փa^000000�ł��B";
	mes "���������ł��B�撣��܂��傤�B";
	close;
}
1_tiamat_52.gat,46,230,4	script	�l�R�m���[�E�F��#3031_1	416,{/* 1978 (hide)*/}
1_tiamat_04.gat,66,50,4	script	�l�R�m���[�E�F��#3031_2	416,{/* 1979 (hide)*/}
1_tiamat_52.gat,143,267,4	script	�l�R�m���[�E�F��#3032_1	416,{/* 1980 (hide)*/}
1_tiamat_04.gat,145,197,4	script	�l�R�m���[�E�F��#3033_1	416,{/* 1981 (hide)*/
		mes "[�l�R�m���[�E�F��]";
		mes "�ӂށc�c�Ȃ�قǁB";
		mes "�P�l�̂��͂��ȂĂ��Ă�";
		mes "�����ɂ͎��Ԃ������肻���ł��B";
		mes "^0000ff���Ƃ̎�^000000��^0000ff�傫�Ȕ�^000000�A";
		mes "^0000ff���炩�Ȑ�^000000��������̂�";
		mes "����ł��傤�B";
		close;
	mes "[�l�R�m���[�E�F��]";
	mes "�����̐��ޕ����܂ŁA�㏭���ł��B";
	mes "�`���җl�̂��͓Y�����������";
	mes "�����܂ŗ��邱�Ƃ�";
	mes "�o���Ȃ������ł��傤�B";
	mes "���ӂ��Ă���܂��B";
	close;
}
1_tiamat_04.gat,187,131,4	script	�l�R�m���[�E�F��#3034_1	416,{/* 1982 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����̐��ޕ����܂ŁA�㏭���ł��B";
	mes "�`���җl�̂��͓Y�����������";
	mes "�����܂ŗ��邱�Ƃ�";
	mes "�o���Ȃ������ł��傤�B";
	mes "���ӂ��Ă���܂��B";
	close;
}
1_tiamat_35.gat,86,177,4	script	�l�R�m���[�E�F��#3035_1	416,{/* 1983 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "���̐悩��A�����܂����C�z�������܂��B";
	mes "���炭�͖����ł��傤�c�c";
	mes "�s�ޓ]�̌��ӂ������Đi�݂܂��傤�B";
	close;
}
2_tiamat_01.gat,202,37,9	script	�l�R�m���[�E�F��#3036_1	416,{/* 1984 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�ӂށc�c";
	mes "���΂͔ނ̉��𑀂�����ƁB";
	mes "�����ȒP�ɖ{���������Ă͂���܂���ˁB";
	mes "�������A��X����������������Ƃ�";
	mes "�ԈႢ�͂���܂���B";
	close;
}
2_tiamat_00.gat,52,57,4	script	�l�R�m���[�E�F��#3037_1	416,{/* 1985 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�P�l�̂��߂ɂ�";
	mes "������킯�ɂ͂����܂���B";
	mes "���������O��ł��B";
	close;
}
1_tiamat_60.gat,94,66,0	script	guest#part1_1	139,{/* 1988 (hide)*/}
1_tiamat_02.gat,149,18,0	script	guest#part2_1	139,{/* 1991 (hide)*/}
1_tiamat_02.gat,149,18,0	script	guest#part2_2	139,{/* 1992 (hide)*/}
1_tiamat_02.gat,149,18,0	script	guest#part2_3	139,{/* 1993 */}
1_tiamat_04.gat,142,194,0	script	guest#part3_1	139,{/* 1994 (hide)*/}
1_tiamat_04.gat,142,194,0	script	guest#part3_2	139,{/* 1995 (hide)*/}
1_tiamat_04.gat,142,194,0	script	guest#part3_3	139,{/* 1996 */}
1_tiamat_25.gat,174,22,0	script	guest#part4_1	139,{/* 1997 (hide)*/}
1_tiamat_25.gat,174,22,0	script	guest#part4_2	139,{/* 1998 (hide)*/}
1_tiamat_25.gat,174,22,0	script	guest#part4_3	139,{/* 1999 */}
1_tiamat_08.gat,101,127,0	script	guest#part5_1	139,{/* 2000 (hide)*/}
1_tiamat_08.gat,101,127,0	script	guest#part5_2	139,{/* 2001 */}
1_tiamat_08.gat,101,127,0	script	guest#part5_3	139,{/* 2002 (hide)*/}
1_tiamat_10.gat,85,89,0	script	guest#part6_1	139,{/* 2003 (hide)*/}
1_tiamat_10.gat,85,89,0	script	guest#part6_2	139,{/* 2004 */}
1_tiamat_10.gat,85,89,0	script	guest#part6_3	139,{/* 2005 (hide)*/}
1_tiamat_46.gat,66,158,0	script	guest#part7_1	139,{/* 2006 (hide)*/}
1_tiamat_46.gat,66,158,0	script	guest#part7_2	139,{/* 2007 (hide)*/}
1_tiamat_46.gat,66,158,0	script	guest#part7_3	139,{/* 2008 */}
1_tiamat_18.gat,49,47,0	script	guest#part8_1	139,{/* 2009 (hide)*/}
1_tiamat_18.gat,49,47,0	script	guest#part8_2	139,{/* 2010 (hide)*/}
1_tiamat_18.gat,49,47,0	script	guest#part8_3	139,{/* 2011 */}
1_tiamat_29.gat,249,244,0	script	guest#part9_1	139,{/* 2012 (hide)*/}
1_tiamat_29.gat,249,244,0	script	guest#part9_2	139,{/* 2013 (hide)*/}
1_tiamat_29.gat,249,244,0	script	guest#part9_3	139,{/* 2014 */}
1_tiamat_31.gat,50,95,0	script	guest#part10_1	139,{/* 2015 (hide)*/}
1_tiamat_31.gat,50,95,0	script	guest#part10_2	139,{/* 2016 (hide)*/}
1_tiamat_31.gat,50,95,0	script	guest#part10_2	139,{/* 2016 */}
1_tiamat_31.gat,50,95,0	script	guest#part10_3	139,{/* 2017 */}
1_tiamat_31.gat,50,95,0	script	guest#part10_3	139,{/* 2017 (hide)*/}
1_tiamat_42.gat,69,161,0	script	guest#part11_1	139,{/* 2018 (hide)*/}
1_tiamat_42.gat,69,161,0	script	guest#part11_2	139,{/* 2019 */}
1_tiamat_42.gat,69,161,0	script	guest#part11_3	139,{/* 2020 (hide)*/}
1_tiamat_39.gat,16,55,0	script	guest#part12_1	139,{/* 2021 (hide)*/}
1_tiamat_39.gat,16,55,0	script	guest#part12_2	139,{/* 2022 */}
1_tiamat_39.gat,16,55,0	script	guest#part12_3	139,{/* 2023 (hide)*/}
1_tiamat_37.gat,115,93,0	script	guest#part13_1	139,{/* 2024 (hide)*/}
1_tiamat_37.gat,115,93,0	script	guest#part13_2	139,{/* 2025 (hide)*/}
1_tiamat_37.gat,115,93,0	script	guest#part13_3	139,{/* 2026 */}
1_tiamat_23.gat,147,148,0	script	guest#part14_1	139,{/* 2027 (hide)*/}
1_tiamat_23.gat,147,148,0	script	guest#part14_2	139,{/* 2028 */}
1_tiamat_23.gat,147,148,0	script	guest#part14_3	139,{/* 2029 (hide)*/}
1_tiamat_49.gat,53,284,0	script	guest#part15_1	139,{/* 2030 (hide)*/}
1_tiamat_49.gat,53,284,0	script	guest#part15_2	139,{/* 2031 */}
1_tiamat_49.gat,53,284,0	script	guest#part15_3	139,{/* 2032 (hide)*/}
1_tiamat_43.gat,142,17,0	script	guest#part16_1	139,{/* 2033 (hide)*/}
1_tiamat_43.gat,142,17,0	script	guest#part16_2	139,{/* 2034 */}
1_tiamat_43.gat,142,17,0	script	guest#part16_3	139,{/* 2035 (hide)*/}
1_tiamat_62.gat,22,100,0	script	guest#part17_1	139,{/* 2036 (hide)*/}
1_tiamat_62.gat,22,100,0	script	guest#part17_2	139,{/* 2037 */}
1_tiamat_62.gat,22,100,0	script	guest#part17_3	139,{/* 2038 (hide)*/}
1_tiamat_51.gat,356,130,0	script	guest#part18_1	139,{/* 2039 (hide)*/}
1_tiamat_51.gat,356,130,0	script	guest#part18_2	139,{/* 2040 (hide)*/}
1_tiamat_51.gat,356,130,0	script	guest#part18_3	139,{/* 2041 */}
1_tiamat_08.gat,200,356,0	script	guest#part19_1	139,{/* 2042 (hide)*/}
1_tiamat_08.gat,200,356,0	script	guest#part19_2	139,{/* 2043 (hide)*/}
1_tiamat_08.gat,200,356,0	script	guest#part19_3	139,{/* 2044 */}
1_tiamat_54.gat,272,130,0	script	guest#part22_1	139,{/* 2051 (hide)*/}
1_tiamat_54.gat,272,130,0	script	guest#part22_2	139,{/* 2052 */}
1_tiamat_54.gat,272,130,0	script	guest#part22_3	139,{/* 2053 (hide)*/}
1_tiamat_41.gat,22,87,0	script	guest#part24_1	139,{/* 2057 (hide)*/}
1_tiamat_41.gat,22,87,0	script	guest#part24_2	139,{/* 2058 */}
1_tiamat_41.gat,22,87,0	script	guest#part24_3	139,{/* 2059 (hide)*/}
1_tiamat_35.gat,94,169,0	script	guest#part25_1	139,{/* 2060 (hide)*/}
1_tiamat_35.gat,94,169,0	script	guest#part25_2	139,{/* 2061 (hide)*/}
1_tiamat_35.gat,94,169,0	script	guest#part25_3	139,{/* 2062 */}
2_tiamat_00.gat,49,63,0	script	guest#part27_1	139,{/* 2066 (hide)*/}
2_tiamat_00.gat,49,63,0	script	guest#part27_2	139,{/* 2067 (hide)*/}
2_tiamat_00.gat,49,63,0	script	guest#part27_3	139,{/* 2068 */}
2_tiamat_02.gat,32,65,0	script	guest#part28_1	139,{/* 2069 (hide)*/}
2_tiamat_02.gat,32,65,0	script	guest#part28_2	139,{/* 2070 (hide)*/}
2_tiamat_02.gat,32,65,0	script	guest#part28_3	139,{/* 2071 */}

1_tiamat_00.gat,0,0,0	script	#tiamat_inital	139,{
OnStart:
	hideonnpc "area#r731";	//69
	hideonnpc "area#r611";	//76
	hideonnpc "area#r612";	//77
	hideonnpc "area#r831";	//78
	hideonnpc "area#r832";	//79
	hideonnpc "area#r841";	//80
	hideonnpc "area#r842";	//81
	hideonnpc "area#r843";	//82
	hideonnpc "area#r844";	//83
	hideonnpc "area#r845";	//84
	hideonnpc "area#r851";	//85
	hideonnpc "area#r861";	//86
	hideonnpc "area#r921";	//87
	hideonnpc "area#r941";	//88
	hideonnpc "area#r961";	//89
	hideonnpc "area#r1471";	//90
	hideonnpc "area#r631";	//130
	hideonnpc "area#r781";	//131
	hideonnpc "area#r1811";	//144
	hideonnpc "area#r1812";	//145
	hideonnpc "area#r1821";	//146
	hideonnpc "area#r1822";	//147
	hideonnpc "area#r1823";	//148
	hideonnpc "area#r1831";	//149
	hideonnpc "area#r1832";	//150
	hideonnpc "area#r1841";	//151
	hideonnpc "area#r1842";	//152
	hideonnpc "area#k1831";	//153
	hideonnpc "area#r121";	//171
	hideonnpc "area#r122";	//172
	hideonnpc "area#r131";	//173
	hideonnpc "area#r132";	//174
	hideonnpc "area#r1271";	//175
	hideonnpc "area#r1272";	//176
	hideonnpc "area#r1401";	//189
	hideonnpc "area#r1851";	//196
	hideonnpc "area#r351";	//205
	hideonnpc "area#r352";	//206
	hideonnpc "area#r361";	//207
	hideonnpc "area#r362";	//208
	hideonnpc "area#r363";	//209
	hideonnpc "area#r371";	//210
	hideonnpc "area#r372";	//211
	hideonnpc "area#r373";	//212
	hideonnpc "area#r481";	//213
	hideonnpc "area#r491";	//214
	hideonnpc "area#r492";	//215
	hideonnpc "area#r493";	//216
	hideonnpc "area#r494";	//217
	hideonnpc "area#r501";	//218
	hideonnpc "area#r502";	//219
	hideonnpc "area#r503";	//220
	hideonnpc "area#r504";	//221
	hideonnpc "area#r521";	//222
	hideonnpc "area#r522";	//223
	hideonnpc "area#r531";	//224
	hideonnpc "area#r532";	//225
	hideonnpc "area#r533";	//226
	hideonnpc "area#r534";	//227
	hideonnpc "area#r541";	//228
	hideonnpc "area#r542";	//229
	hideonnpc "area#r543";	//230
	hideonnpc "area#r544";	//231
	hideonnpc "area#r651";	//232
	hideonnpc "area#r652";	//233
	hideonnpc "area#r653";	//234
	hideonnpc "area#r661";	//235
	hideonnpc "area#r662";	//236
	hideonnpc "area#r663";	//237
	hideonnpc "area#r664";	//238
	hideonnpc "area#r671";	//239
	hideonnpc "area#r672";	//240
	hideonnpc "area#r673";	//241
	hideonnpc "area#r674";	//242
	hideonnpc "area#r691";	//243
	hideonnpc "area#r701";	//244
	hideonnpc "area#r702";	//245
	hideonnpc "area#r703";	//246
	hideonnpc "area#r711";	//247
	hideonnpc "area#r712";	//248
	hideonnpc "area#r713";	//249
	hideonnpc "area#r721";	//250
	hideonnpc "area#r722";	//251
	hideonnpc "area#r1711";	//252
	hideonnpc "area#r1712";	//253
	hideonnpc "area#r1713";	//254
	hideonnpc "area#r1721";	//255
	hideonnpc "area#r1722";	//256
	hideonnpc "area#r1731";	//257
	hideonnpc "area#r1732";	//258
	hideonnpc "area#r811";	//334
	hideonnpc "area#r821";	//335
	hideonnpc "area#r1181";	//336
	hideonnpc "area#r1741";	//344
	hideonnpc "area#r2001";	//355
	hideonnpc "area#r1331";	//361
	hideonnpc "area#r1341";	//362
	hideonnpc "area#r1351";	//363
	hideonnpc "area#r1361";	//364
	hideonnpc "area#r1371";	//365
	hideonnpc "area#r1381";	//366
	hideonnpc "area#r1391";	//367
	hideonnpc "area#r1411";	//368
	hideonnpc "area#r1412";	//369
	hideonnpc "area#r1413";	//370
	hideonnpc "area#r1414";	//371
	hideonnpc "area#r1415";	//372
	hideonnpc "area#r1416";	//373
	hideonnpc "area#r1417";	//374
	hideonnpc "area#r1418";	//375
	hideonnpc "area#r1419";	//376
	hideonnpc "area#r191";	//377
	hideonnpc "area#r192";	//378
	hideonnpc "area#r201";	//379
	hideonnpc "area#r202";	//380
	hideonnpc "area#r221";	//381
	hideonnpc "area#r41";	//429
	hideonnpc "area#r42";	//430
	hideonnpc "area#r43";	//431
	hideonnpc "area#r44";	//432
	hideonnpc "area#r45";	//433
	hideonnpc "area#r561";	//443
	hideonnpc "area#r562";	//444
	hideonnpc "area#r571";	//445
	hideonnpc "area#r572";	//446
	hideonnpc "area#r573";	//447
	hideonnpc "area#r601";	//448
	hideonnpc "area#r1041";	//458
	hideonnpc "area#r451";	//470
	hideonnpc "area#r452";	//471
	hideonnpc "area#r461";	//481
	hideonnpc "area#r462";	//482
	hideonnpc "area#r871";	//499
	hideonnpc "area#r1141";	//500
	hideonnpc "area#r1151";	//501
	hideonnpc "area#r181";	//507
	hideonnpc "area#r182";	//508
	hideonnpc "area#r751";	//509
	hideonnpc "area#r752";	//510
	hideonnpc "area#r761";	//511
	hideonnpc "area#r762";	//512
	hideonnpc "area#r763";	//513
	hideonnpc "area#r771";	//514
	hideonnpc "area#r772";	//515
	hideonnpc "area#r773";	//516
	hideonnpc "area#r1941";	//530
	hideonnpc "area#r1951";	//531
	hideonnpc "area#r1961";	//532
	hideonnpc "area#r1971";	//533
	hideonnpc "area#r1981";	//534
	hideonnpc "area#r1982";	//535
	hideonnpc "area#r1983";	//536
	hideonnpc "area#r1984";	//537
	hideonnpc "area#r1985";	//538
	hideonnpc "area#r1986";	//539
	hideonnpc "area#r1987";	//540
	hideonnpc "area#r641";	//575
	hideonnpc "area#r642";	//576
	hideonnpc "area#r1321";	//577
	hideonnpc "area#r1322";	//578
	hideonnpc "area#r1251";	//587
	hideonnpc "area#r1252";	//588
	hideonnpc "area#r1281";	//589
	hideonnpc "area#r1282";	//590
	hideonnpc "area#r1291";	//591
	hideonnpc "area#r1292";	//592
	hideonnpc "area#r1301";	//593
	hideonnpc "area#r1302";	//594
	hideonnpc "area#r1303";	//595
	hideonnpc "area#r1991";	//596
	hideonnpc "area#r1992";	//597
	hideonnpc "area#r31";	//640
	hideonnpc "area#r32";	//641
	hideonnpc "area#r33";	//642
	hideonnpc "area#r34";	//643
	hideonnpc "area#r35";	//644
	hideonnpc "area#r101";	//645
	hideonnpc "area#r1511";	//661
	hideonnpc "area#r1512";	//662
	hideonnpc "area#r1421";	//668
	hideonnpc "area#r1422";	//669
	hideonnpc "area#r1423";	//670
	hideonnpc "area#r1424";	//671
	hideonnpc "area#r1425";	//672
	hideonnpc "area#r1426";	//673
	hideonnpc "area#r1427";	//674
	hideonnpc "area#r1431";	//675
	hideonnpc "area#r1441";	//676
	hideonnpc "area#r1451";	//677
	hideonnpc "area#r1461";	//678
	hideonnpc "area#r1481";	//679
	hideonnpc "area#r1482";	//680
	hideonnpc "area#r1483";	//681
	hideonnpc "area#r1484";	//682
	hideonnpc "area#r1491";	//683
	hideonnpc "area#r1501";	//684
	hideonnpc "area#r981";	//719
	hideonnpc "area#r1571";	//720
	hideonnpc "area#r1572";	//721
	hideonnpc "area#r1573";	//722
	hideonnpc "area#r741";	//746
	hideonnpc "area#r742";	//
	hideonnpc "area#r931";	//755
	hideonnpc "area#r1131";	//756
	hideonnpc "area#r1521";	//757
	hideonnpc "area#r1522";	//758
	hideonnpc "area#r1523";	//759
	hideonnpc "area#r1524";	//760
	hideonnpc "area#r1525";	//761
	hideonnpc "area#r1531";	//762
	hideonnpc "area#r1541";	//763
	hideonnpc "area#r1551";	//764
	hideonnpc "area#r1061";	//786
	hideonnpc "area#r1062";	//787
	hideonnpc "area#r1071";	//788
	hideonnpc "area#r1072";	//789
	hideonnpc "area#r1073";	//790
	hideonnpc "area#r1211";	//791
	hideonnpc "area#r1212";	//792
	hideonnpc "area#r1871";	//793
	hideonnpc "area#r1872";	//794
	hideonnpc "area#r1873";	//795
	hideonnpc "area#r111";	//813
	hideonnpc "area#r112";	//814
	hideonnpc "area#r1931";	//815
	hideonnpc "area#r951";	//825
	hideonnpc "area#r952";	//826
	hideonnpc "area#r953";	//827
	hideonnpc "area#r954";	//828
	hideonnpc "area#r955";	//829
	hideonnpc "area#r1201";	//830
	hideonnpc "area#r61";	//845
	hideonnpc "area#r62";	//846
	hideonnpc "area#r63";	//847
	hideonnpc "area#r1701";	//854
	hideonnpc "area#r1702";	//855
	hideonnpc "area#r1901";	//856
	hideonnpc "area#r1902";	//857
	hideonnpc "area#r1903";	//858
	hideonnpc "area#r1911";	//859
	hideonnpc "area#r1912";	//860
	hideonnpc "area#r1921";	//861
	hideonnpc "area#r81";	//877
	hideonnpc "area#r91";	//878
	hideonnpc "area#r161";	//887
	hideonnpc "area#r581";	//888
	hideonnpc "area#r582";	//889
	hideonnpc "area#r583";	//890
	hideonnpc "area#r621";	//891
	hideonnpc "area#r622";	//892
	hideonnpc "area#r623";	//893
	hideonnpc "area#r71";	//911
	hideonnpc "area#r801";	//912
	hideonnpc "area#r802";	//913
	hideonnpc "area#r803";	//914
	hideonnpc "area#r804";	//915
	hideonnpc "area#r805";	//916
	hideonnpc "area#r806";	//917
	hideonnpc "area#r881";	//918
	hideonnpc "area#r882";	//919
	hideonnpc "area#r891";	//920
	hideonnpc "area#r892";	//921
	hideonnpc "area#r991";	//922
	hideonnpc "area#r992";	//923
	hideonnpc "area#r1031";	//924
	hideonnpc "area#r1051";	//925
	hideonnpc "area#r1052";	//926
	hideonnpc "area#r1053";	//927
	hideonnpc "area#r1054";	//928
	hideonnpc "area#r1055";	//929
	hideonnpc "area#r1056";	//930
	hideonnpc "area#r1057";	//931
	hideonnpc "area#r1058";	//932
	hideonnpc "area#r1059";	//933
	hideonnpc "area#r10510";	//934
	hideonnpc "area#r1081";	//935
	hideonnpc "area#r1082";	//936
	hideonnpc "area#r1091";	//937
	hideonnpc "area#r1101";	//938
	hideonnpc "area#r1111";	//939
	hideonnpc "area#r1161";	//940
	hideonnpc "area#r1162";	//941
	hideonnpc "area#r1171";	//942
	hideonnpc "area#r1191";	//943
	hideonnpc "area#r1221";	//944
	hideonnpc "area#r1222";	//945
	hideonnpc "area#r1223";	//946
	hideonnpc "area#r1224";	//947
	hideonnpc "area#r901";	//1029
	hideonnpc "area#r1001";	//1030
	hideonnpc "area#r1011";	//1031
	hideonnpc "area#r1021";	//1032
	hideonnpc "area#r1231";	//1033
	hideonnpc "area#r1232";	//1034
	hideonnpc "area#r1233";	//1035
	hideonnpc "area#r1234";	//1036
	hideonnpc "area#r1235";	//1037
	hideonnpc "area#r1236";	//1038
	hideonnpc "area#r1241";	//1039
	hideonnpc "area#r1242";	//1040
	hideonnpc "area#r1243";	//1041
	hideonnpc "area#r1244";	//1042
	hideonnpc "area#r1245";	//1043
	hideonnpc "area#r1246";	//1044
	hideonnpc "area#r1581";	//1065
	hideonnpc "area#r1582";	//1066
	hideonnpc "area#r1583";	//1067
	hideonnpc "area#r1584";	//1068
	hideonnpc "area#r1585";	//1069
	hideonnpc "area#r1591";	//1070
	hideonnpc "area#r271";	//1080
	hideonnpc "area#r272";	//1081
	hideonnpc "area#r291";	//1082
	hideonnpc "area#r292";	//1083
	hideonnpc "area#r281";	//1094
	hideonnpc "area#r282";	//1095
	hideonnpc "area#r301";	//1096
	hideonnpc "area#r302";	//1097
	hideonnpc "area#r51";	//1106
	hideonnpc "area#r52";	//1107
	hideonnpc "area#r311";	//1113
	hideonnpc "area#r312";	//1114
	hideonnpc "area#r331";	//1115
	hideonnpc "area#r332";	//1116
	hideonnpc "area#r321";	//1123
	hideonnpc "area#r322";	//?
	hideonnpc "area#r341";	//?
	hideonnpc "area#r342";	//1126
	hideonnpc "area#r791";	//1127
	hideonnpc "area#r792";	//1128
	hideonnpc "area#r21";	//1137
	hideonnpc "area#r22";	//1138
	hideonnpc "area#r23";	//1139
	hideonnpc "area#r24";	//1140
	hideonnpc "area#r1561";	//1149
	hideonnpc "area#r1562";	//1150
	hideonnpc "area#r1601";	//1151
	hideonnpc "area#r1771";	//1161
	hideonnpc "area#r1772";	//1162
	hideonnpc "area#r1801";	//1163
	hideonnpc "area#r1802";	//1164
	hideonnpc "area#r1311";	//1173
	hideonnpc "area#r1761";	//1174
	hideonnpc "area#r1762";	//1175
	hideonnpc "area#r1763";	//1176
	hideonnpc "area#r1764";	//1177
	hideonnpc "area#r1781";	//1178
	hideonnpc "area#r1791";	//1179
	hideonnpc "area#r1611";	//1202
	hideonnpc "area#r1621";	//1203
	hideonnpc "area#r1622";	//1204
	hideonnpc "area#r1623";	//1205
	hideonnpc "area#r1624";	//1206
	hideonnpc "area#r1631";	//1207
	hideonnpc "area#r1632";	//1208
	hideonnpc "area#r1641";	//1209
	hideonnpc "area#r1651";	//1210
	hideonnpc "area#r1661";	//1211
	hideonnpc "area#r1671";	//1212
	hideonnpc "area#r1681";	//1213
	hideonnpc "area#r1682";	//1214
	hideonnpc "area#r1683";	//1215
	hideonnpc "area#r1684";	//1216
	hideonnpc "area#r1691";	//1217
	hideonnpc "area#r1692";	//1218
	hideonnpc "area#r1693";	//1219
	hideonnpc "area#r141";	//1257
	hideonnpc "area#r142";	//1258
	hideonnpc "area#r231";	//1263
	hideonnpc "area#r232";	//1264
	hideonnpc "area#r241";	//1265
	hideonnpc "area#r242";	//1266
	hideonnpc "area#r243";	//1267
	hideonnpc "area#r251";	//1268
	hideonnpc "area#r252";	//1269
	hideonnpc "area#r253";	//1270
	hideonnpc "area#r261";	//1271
	hideonnpc "area#r171";	//1289
	hideonnpc "area#r172";	//1290
	hideonnpc "area#r381";	//1291
	hideonnpc "area#r382";	//1292
	hideonnpc "area#r511";	//1293
	hideonnpc "area#r551";	//1294
	hideonnpc "area#r591";	//1295
	hideonnpc "area#r681";	//1296
	hideonnpc "area#r911";	//1307
	hideonnpc "area#r912";	//1308
	hideonnpc "area#r913";	//1309
	hideonnpc "area#r2011";	//1310
	hideonnpc "area#r2012";	//1311
	hideonnpc "area#r2013";	//1312
	hideonnpc "area#r2014";	//1313
	hideonnpc "area#r2021";	//1314
	hideonnpc "area#r2022";	//1315
	hideonnpc "area#r2023";	//1316
	hideonnpc "area#r211";	//1317
	hideonnpc "area#r212";	//1318
	hideonnpc "area#r1751";	//1349
	hideonnpc "area#r1752";	//1350
	hideonnpc "area#r151";	//1355
	hideonnpc "area#r152";	//1356
	hideonnpc "area#r153";	//1357
	hideonnpc "area#r154";	//1358
	hideonnpc "area#r391";	//1373
	hideonnpc "area#r392";	//1374
	hideonnpc "area#r401";	//1375
	hideonnpc "area#r402";	//1376
	hideonnpc "area#r411";	//1377
	hideonnpc "area#r971";	//1378
	hideonnpc "area#r1121";	//1388
	hideonnpc "area#r1261";	//1393
	hideonnpc "area#r1262";	//1394
	hideonnpc "area#r1263";	//1395
	hideonnpc "area#r1264";	//1396
	hideonnpc "area#r1265";	//1397
	hideonnpc "area#r1881";	//1408
	//hideonnpc "area#r1882";	//1409
	hideonnpc "area#r1861";	//1436

	hideonnpc "area#k921";	//91
	hideonnpc "area#k941";	//92
	hideonnpc "area#k841";	//93
	hideonnpc "area#k832";	//94
	hideonnpc "area#k612";	//95
	hideonnpc "area#k1471";	//96
	hideonnpc "area#k1812";	//154
	hideonnpc "area#k131";	//177
	hideonnpc "area#k122";	//178
	hideonnpc "area#k1271";	//179
	hideonnpc "area#k132";	//180
	hideonnpc "area#k1851";	//197
	hideonnpc "area#k652";	//259
	hideonnpc "area#k661";	//260
	hideonnpc "area#k672";	//261
	hideonnpc "area#k664";	//262
	hideonnpc "area#k373";	//263
	hideonnpc "area#k504";	//264
	hideonnpc "area#k503";	//265
	hideonnpc "area#k544";	//266
	hideonnpc "area#k703";	//267
	hideonnpc "area#k522";	//268
	hideonnpc "area#k533";	//269
	hideonnpc "area#k363";	//270
	hideonnpc "area#k2001";	//356
	hideonnpc "area#k221";	//382
	hideonnpc "area#k191";	//383
	hideonnpc "area#k44";	//434
	hideonnpc "area#k45";	//435
	hideonnpc "area#k601";	//449
	hideonnpc "area#k1041";	//459
	hideonnpc "area#k451";	//472
	hideonnpc "area#k461";	//483
	hideonnpc "area#k462";	//484
	hideonnpc "area#k763";	//517
	hideonnpc "area#k1941";	//541
	hideonnpc "area#k1951";	//542
	hideonnpc "area#k1961";	//543
	hideonnpc "area#k1971";	//544
	hideonnpc "area#k1983";	//545
	hideonnpc "area#k1984";	//546
	hideonnpc "area#k1985";	//547
	hideonnpc "area#k1986";	//548
	hideonnpc "area#k641";	//579
	hideonnpc "area#k1301";	//598
	hideonnpc "area#k1302";	//599
	hideonnpc "area#k1303";	//600
	hideonnpc "area#k1251";	//601
	hideonnpc "area#k1291";	//602
	hideonnpc "area#k1292";	//603
	hideonnpc "area#k1992";	//604
	hideonnpc "area#k32";	//646
	hideonnpc "area#k35";	//647
	hideonnpc "area#k34";	//648
	hideonnpc "area#k31";	//649
	hideonnpc "area#k1512";	//663
	hideonnpc "area#k1481";	//685
	hideonnpc "area#k1482";	//686
	hideonnpc "area#k1491";	//687
	hideonnpc "area#k1426";	//688
	hideonnpc "area#k1421";	//689
	hideonnpc "area#k1427";	//690
	hideonnpc "area#k1571";	//723
	hideonnpc "area#k1573";	//724
	hideonnpc "area#k1521";	//765
	hideonnpc "area#k1525";	//766
	hideonnpc "area#k1061";	//796
	hideonnpc "area#k1071";	//797
	hideonnpc "area#k1872";	//798
	hideonnpc "area#k1873";	//799
	hideonnpc "area#k112";	//816
	hideonnpc "area#k951";	//831
	hideonnpc "area#k953";	//832
	hideonnpc "area#k1201";	//833
	hideonnpc "area#k62";	//848
	hideonnpc "area#k81";	//879
	hideonnpc "area#k803";	//970
	hideonnpc "area#k1057";	//971
	hideonnpc "area#k1058";	//972
	hideonnpc "area#k1059";	//973
	hideonnpc "area#k1222";	//974
	hideonnpc "area#k1224";	//975
	hideonnpc "area#k892";	//976
	hideonnpc "area#k991";	//977
	hideonnpc "area#k1051";	//978
	hideonnpc "area#k1231";	//1045
	hideonnpc "area#k1584";	//1071
	hideonnpc "area#k272";	//1084
	hideonnpc "area#k271";	//1085
	hideonnpc "area#k291";	//1086
	hideonnpc "area#k292";	//1087
	hideonnpc "area#k281";	//1098
	hideonnpc "area#k301";	//1099
	hideonnpc "area#k51";	//1108
	hideonnpc "area#k22";	//1141
	hideonnpc "area#k24";	//1142
	hideonnpc "area#k1561";	//1152
	hideonnpc "area#k1762";	//1181
	hideonnpc "area#k1764";	//1183
	hideonnpc "area#k1631";	//1220
	hideonnpc "area#k1693";	//1221
	hideonnpc "area#k1651";	//1222
	hideonnpc "area#k1692";	//1223
	hideonnpc "area#k1671";	//1224
	hideonnpc "area#k1622";	//1225
	hideonnpc "area#k1624";	//1226
	hideonnpc "area#k1684";	//1227
	hideonnpc "area#k1661";	//1228
	hideonnpc "area#k243";	//1272
	hideonnpc "area#k241";	//1273
	hideonnpc "area#k251";	//1274
	hideonnpc "area#k253";	//1275
	hideonnpc "area#k911";	//1319
	hideonnpc "area#k2023";	//1320
	hideonnpc "area#k211";	//1321
	hideonnpc "area#k2012";	//1322
	hideonnpc "area#k2013";	//1323
	hideonnpc "area#k2022";	//1324
	hideonnpc "area#k1262";	//1398
	hideonnpc "area#k1263";	//1399
	hideonnpc "area#k1264";	//1400

	donpcevent "���o�[#102_1::OnStart";
	donpcevent "���o�[#103_1::OnStart";
	donpcevent "���o�[#104_1::OnStart";
	donpcevent "���o�[#105_1::OnStart";
	donpcevent "���o�[#106_1::OnStart";
	donpcevent "���o�[#107_1::OnStart";
	donpcevent "���o�[#107_2::OnStart";
	donpcevent "���o�[#107_3::OnStart";
	donpcevent "���o�[#108_1::OnStart";
	donpcevent "���o�[#109_1::OnStart";
	donpcevent "���o�[#201_1::OnStart";
	donpcevent "���o�[#202_1::OnStart";
	donpcevent "���o�[#203_1::OnStart";
	donpcevent "���o�[#204_1::OnStart";
	donpcevent "���o�[#205_1::OnStart";
	donpcevent "���o�[#206_1::OnStart";
	donpcevent "���o�[#315_1::OnStart";
	donpcevent "���o�[#001_1::OnStart";
	donpcevent "���o�[#002_1::OnStart";
	donpcevent "���o�[#003_1::OnStart";
	donpcevent "���o�[#004_1::OnStart";
	donpcevent "���o�[#005_1::OnStart";
	donpcevent "���o�[#006_1::OnStart";
	donpcevent "���o�[#006_2::OnStart";
	donpcevent "���o�[#006_3::OnStart";
	donpcevent "���o�[#007_1::OnStart";
	donpcevent "���o�[#008_1::OnStart";
	donpcevent "���o�[#009_1::OnStart";
	donpcevent "���o�[#010_1::OnStart";
	donpcevent "���o�[#011_1::OnStart";
	donpcevent "���o�[#311_1::OnStart";
	donpcevent "���o�[#311_2::OnStart";
	donpcevent "���o�[#311_3::OnStart";
	donpcevent "���o�[#311_4::OnStart";

	donpcevent "�Âт�����#97::OnStart";

	donpcevent "�_���̒���#r177::OnStart";
	
	donpcevent "#�]��19_01::OnStart";
	donpcevent "#�]��21_01::OnStart";
	donpcevent "#�20_04::OnStart";
	donpcevent "#�21_08::OnStart";

	hideonnpc "�������#0A";
	hideonnpc "�������#0B";
	hideonnpc "�������#0C";
	hideonnpc "�������#0D";

	hideoffnpc "�l�R�m�~���J#ex001";
	hideoffnpc "�l�R�m�n�E���h#ex001";
	hideoffnpc "�l�R�m���[�E�F��#ex001";
	hideoffnpc "�����W�����g#tia60";
	hideoffnpc "�������A#tia60";
	hideoffnpc "�l�R�m�~���J#tia60";
	hideoffnpc "�l�R�m�n�E���h#tia60";
	hideoffnpc "�l�R�m���[�E�F��#tia60";
	hideoffnpc "�����̐Δ�#r199";
	hideonnpc "���L�t�O�X#tia60";
	setnpcdisplay "���L�t�O�X#tia60",844;
	hideonnpc "�t���[���e�B#r84";
	setnpcdisplay "�t���[���e�B#r84",844;
	hideonnpc "���V�g�̖S�[#r84";
	hideonnpc "�T�^�i�L�A#r43";
	setnpcdisplay "�T�^�i�L�A#r43",844;
	hideonnpc "���V�g�̖S�[#r43";
	hideonnpc "�A���u���G��#r166";
	setnpcdisplay "�A���u���G��#r166",844;
	hideonnpc "���V�g�̖S�[#r166";
	hideonnpc "�n�i�G��#r128";
	setnpcdisplay "�n�i�G��#r128",844;
	hideonnpc "���V�g�̖S�[#r128";
	hideonnpc "�K���r�G��#r10";
	setnpcdisplay "�K���r�G��#r10",844;
	hideonnpc "���V�g�̖S�[#r10";
	hideonnpc "�l�r���X#r140";
	setnpcdisplay "�l�r���X#r140",844;
	hideonnpc "���V�g�̖S�[#r140";
	hideonnpc "�A�C�j#r174";
	setnpcdisplay "�A�C�j#r174",844;
	hideonnpc "���V�g�̖S�[#r174";
	hideonnpc "�o���r�G��#r149";
	setnpcdisplay "�o���r�G��#r149",844;
	hideonnpc "���V�g�̖S�[#r149";
	hideonnpc "�E�F���L�G��#r8";
	setnpcdisplay "�E�F���L�G��#r8",844;
	hideonnpc "���V�g�̖S�[#r8";
	hideonnpc "�A�h�i�L�G��#r156";
	setnpcdisplay "�A�h�i�L�G��#r156",844;
	hideonnpc "���V�g�̖S�[#r156";
	hideonnpc "�A�K���A���v�g#r95";
	setnpcdisplay "�A�K���A���v�g#r95",844;
	hideonnpc "���V�g�̖S�[#r95";
	hideonnpc "�Y���G��#r178";
	setnpcdisplay "�Y���G��#r178",844;
	hideonnpc "���V�g�̖S�[#r178";
	hideonnpc "�T�^��#r179";
	setnpcdisplay "�T�^��#r179",844;
	hideonnpc "���V�g�̖S�[#r179";
	hideonnpc "�����G��#r176";
	setnpcdisplay "�����G��#r176",844;
	hideonnpc "���V�g�̖S�[#r176";
	hideonnpc "�A�X���f��#r108";
	setnpcdisplay "�A�X���f��#r108",844;
	hideonnpc "���V�g�̖S�[#r108";
	hideonnpc "�n�}���G��#r110";
	setnpcdisplay "�n�}���G��#r110",844;
	hideonnpc "���V�g�̖S�[#r110";
	hideonnpc "�o�L�G��#r111";
	setnpcdisplay "�o�L�G��#r111",844;
	hideonnpc "���V�g�̖S�[#r111";
	hideonnpc "�A�X�^���g#r113";
	setnpcdisplay "�A�X�^���g#r113",844;
	hideonnpc "���V�g�̖S�[#r113";
	hideonnpc "�}���L�_�G��#r193";
	setnpcdisplay "�}���L�_�G��#r193",844;
	hideonnpc "���V�g�̖S�[#r193";
	hideonnpc "�T���K�^�i�X#r181";
	setnpcdisplay "�T���K�^�i�X#r181",844;
	hideonnpc "���V�g�̖S�[#r181";
	hideonnpc "���V�t�F��#r185";
	setnpcdisplay "���V�t�F��#r185",844;
	hideonnpc "���V�g�̖S�[#r185";

	hideonnpc "���p�t�̍�#2_tiamat_00";
	hideonnpc "�����c�̍�#2_tiamat_00";
	hideonnpc "����̍�#2_tiamat_00";
	hideonnpc "�c��̍�#2_tiamat_00";
	hideonnpc "�@���̍�#2_tiamat_00";
	hideonnpc "���l�̍�#2_tiamat_00";
	hideonnpc "��Ԃ̍�#2_tiamat_00";
	hideonnpc "�͂̍�#2_tiamat_00";
	hideonnpc "�B�҂̍�#2_tiamat_00";
	hideonnpc "�^���̗ւ̍�#2_tiamat_00";
	hideonnpc "���`�̍�#2_tiamat_00";
	hideonnpc "�݂邳�ꂽ�j�̍�#2_tiamat_00";
	hideonnpc "���_�̍�#2_tiamat_00";
	hideonnpc "�ߐ��̍�#2_tiamat_00";
	hideonnpc "�����̍�#2_tiamat_00";
	hideonnpc "���̍�#2_tiamat_00";
	hideonnpc "���̍�#2_tiamat_00";
	hideonnpc "���̍�#2_tiamat_00";
	hideonnpc "���z�̍�#2_tiamat_00";
	hideonnpc "�R���̍�#2_tiamat_00";
	hideonnpc "���E�̍�#2_tiamat_00";
	hideonnpc "���҂̍�#2_tiamat_00";
	setnpcdisplay "���p�t�̍�#2_tiamat_00",2999; //1410
	setnpcdisplay "�����c�̍�#2_tiamat_00",1147; //1411
	setnpcdisplay "����̍�#2_tiamat_00",1630; //1412
	setnpcdisplay "�c��̍�#2_tiamat_00",1038; //1413
	setnpcdisplay "�@���̍�#2_tiamat_00",1157; //1414
	setnpcdisplay "���l�̍�#2_tiamat_00",1681; //1415
	setnpcdisplay "��Ԃ̍�#2_tiamat_00",2362; //1416
	setnpcdisplay "�͂̍�#2_tiamat_00",1785; //1417
	setnpcdisplay "�B�҂̍�#2_tiamat_00",1418; //1418
	setnpcdisplay "�^���̗ւ̍�#2_tiamat_00",1871; //1419
	setnpcdisplay "���`�̍�#2_tiamat_00",1751; //1420
	setnpcdisplay "�݂邳�ꂽ�j�̍�#2_tiamat_00",1779; //1421
	setnpcdisplay "���_�̍�#2_tiamat_00",1046;
	setnpcdisplay "�ߐ��̍�#2_tiamat_00",2202;
	setnpcdisplay "�����̍�#2_tiamat_00",1272;
	setnpcdisplay "���̍�#2_tiamat_00",1039;
	setnpcdisplay "���̍�#2_tiamat_00",1734;
	setnpcdisplay "���̍�#2_tiamat_00",1150;
	setnpcdisplay "���z�̍�#2_tiamat_00",1832;
	setnpcdisplay "�R���̍�#2_tiamat_00",1373;
	setnpcdisplay "���E�̍�#2_tiamat_00",2022;
	setnpcdisplay "���҂̍�#2_tiamat_00",1870;
	hideonnpc "�n���Ւd#188B";

	hideonnpc "�H�H�H�H#r7";
	hideoffnpc "����@�J���u#k73CG08";
	hideonnpc "����@�J���u#r73CG08";
	hideoffnpc "����A�J���u#k74AG08";
	hideonnpc "����A�J���u#r74AG08";
	hideonnpc "�f�q������#r37CG03";
	hideonnpc "�q�����G����#r50CG04";
	hideonnpc "�W�I�C�A��#r62CG05";
	hideonnpc "�J�f�X��#r71CG06";
	hideoffnpc "�f�q������#k37CG03";
	hideoffnpc "�q�����G����#k50CG04";
	hideoffnpc "�W�I�C�A��#k62CG05";
	hideoffnpc "�J�f�X��#k71CG06";
	donpcevent "�􂯖�#r133CG09::OnStart";
	hideonnpc "��#r174CG09";
	hideoffnpc "��#k174CG09";

	for(set '@i,1; '@i<=6; set '@i,'@i+1)
		hideonnpc "���܂����Ă���#r98_00"+ '@i;
	set '@i,rand(1,6);
	hideoffnpc "���܂����Ă���#r98_00"+ '@i;
	set getvariableofnpc('flag,"��1�̋R�m��#96"),'@i;
	set getvariableofnpc('flag,"��2�̋R�m��#96"),'@i;
	set getvariableofnpc('flag,"��3�̋R�m��#96"),'@i;
	set getvariableofnpc('flag,"��4�̋R�m��#96"),'@i;
	set getvariableofnpc('flag,"��5�̋R�m��#96"),'@i;
	set getvariableofnpc('flag,"��6�̋R�m��#96"),'@i;
	set getvariableofnpc('flag,"��7�̋R�m��#96"),'@i;
	set getvariableofnpc('flag,"��8�̋R�m��#96"),'@i;
	setarray '@list,1,2,3,4,5,6,7,8;
	for(set '@i,1; '@i<=8; set '@i,'@i+1) {
		set '@r,rand(getarraysize('@list));
		set getvariableofnpc('flag,"�Α�#r98_00"+'@i),'@list['@r];
		deletearray '@list['@r],1;
	}

	hideoffnpc "�]�ڂ̐Δ�#k441";
	hideonnpc "�]�ڂ̐Δ�#e441";
	hideonnpc "�]�ڂ̐Δ�#r441";
	hideoffnpc "�]�ڂ̐Δ�#k451";
	hideonnpc "�]�ڂ̐Δ�#e451";
	hideonnpc "�]�ڂ̐Δ�#r451";
	hideoffnpc "�]�ڂ̐Δ�#k461";
	hideonnpc "�]�ڂ̐Δ�#e461";
	hideonnpc "�]�ڂ̐Δ�#r461";
	hideoffnpc "�]�ڂ̐Δ�#k421";
	hideonnpc "�]�ڂ̐Δ�#r421";
	hideoffnpc "�]�ڂ̐Δ�#k471";
	hideonnpc "�]�ڂ̐Δ�#e471";
	hideonnpc "�]�ڂ̐Δ�#r471";

	donpcevent "���̍Ւd#r133::OnStart";
	donpcevent "���̍Ւd#r134::OnStart";
	donpcevent "���̍Ւd#r135::OnStart";
	donpcevent "���̍Ւd#r136::OnStart";
	donpcevent "���̍Ւd#r137::OnStart";
	donpcevent "���̍Ւd#r138::OnStart";
	donpcevent "���̍Ւd#r139::OnStart";

	donpcevent "������K#r194::OnStart";
	donpcevent "������K#r195::OnStart";
	donpcevent "������K#r196::OnStart";
	hideonnpc "������K#k194";
	hideonnpc "������K#k195";
	hideonnpc "������K#k196";
	hideonnpc "gate08_001#1_tiamat_23";
	hideonnpc "gate09_001#1_tiamat_23";
	hideonnpc "gate10_001#1_tiamat_23";

	for(set '@i,1; '@i<=8; set '@i,'@i+1) {
		hideonnpc "spe2_0" +'@i+ "#2_tiamat_01"; //1448
		hideonnpc "spe5_0" +'@i+ "#2_tiamat_01"; //1448
	}
	for(set '@i,1; '@i<=4; set '@i,'@i+1) {
		hideonnpc "pat3_0" +'@i+ "#2_tiamat_02"; //1448
		hideonnpc "spe2_0" +'@i+ "#2_tiamat_02"; //1448
		hideonnpc "spe3_0" +'@i+ "#2_tiamat_02"; //1448
	}

	hideonnpc "�l�R�m�~���J#101_1";
	hideonnpc "�l�R�m�~���J#101_2";
	hideonnpc "�l�R�m�n�E���h#201_1";
	hideonnpc "�l�R�m�n�E���h#201_2";
	hideonnpc "�l�R�m�n�E���h#201_3";
	hideonnpc "�l�R�m�n�E���h#201_4";
	hideonnpc "�l�R�m�n�E���h#202_1";
	hideonnpc "�l�R�m�n�E���h#203_1";
	hideonnpc "�l�R�m�n�E���h#204_1";
	hideonnpc "�l�R�m�n�E���h#205_1";
	hideonnpc "�l�R�m�n�E���h#206_1";
	hideonnpc "�l�R�m�n�E���h#207_1";
	hideonnpc "�l�R�m�n�E���h#208_1";
	hideonnpc "�l�R�m�n�E���h#208_2";
	hideonnpc "�l�R�m���[�E�F��#301_1";
	hideonnpc "�l�R�m���[�E�F��#302_1";
	hideonnpc "�l�R�m���[�E�F��#303_1";
	hideonnpc "�l�R�m���[�E�F��#303_2";
	hideonnpc "�l�R�m�~���J#1001_1";
	hideonnpc "�l�R�m�~���J#1002_1";
	hideonnpc "�l�R�m�~���J#1003_1";
	hideonnpc "�l�R�m�~���J#1004_1";
	hideonnpc "�l�R�m�~���J#1005_1";
	hideonnpc "�l�R�m�~���J#1006_1";
	hideonnpc "�l�R�m�~���J#1007_1";
	hideonnpc "�l�R�m�~���J#1007_2";
	hideonnpc "�l�R�m�~���J#1007_3";
	hideonnpc "�l�R�m�~���J#1008_1";
	hideonnpc "�l�R�m�~���J#1009_1";
	hideonnpc "�l�R�m�~���J#1010_1";
	hideonnpc "�l�R�m�~���J#1010_2";
	hideonnpc "�l�R�m�~���J#1011_1";
	hideonnpc "�l�R�m�~���J#1012_1";
	hideonnpc "�l�R�m�~���J#1012_2";
	hideonnpc "�l�R�m�~���J#1013_1";
	hideonnpc "�l�R�m�~���J#1013_2";
	hideonnpc "�l�R�m�~���J#1013_3";
	hideonnpc "�l�R�m�~���J#1014_1";
	hideonnpc "�l�R�m�~���J#1014_2";
	hideonnpc "�l�R�m�~���J#1014_3";
	hideonnpc "�l�R�m�~���J#1014_4";
	hideonnpc "�l�R�m�~���J#1014_5";
	hideonnpc "�l�R�m�~���J#1015_1";
	hideonnpc "�l�R�m�~���J#1016_1";
	hideonnpc "�l�R�m�~���J#1017_1";
	hideonnpc "�l�R�m�~���J#1018_1";
	hideonnpc "�l�R�m�~���J#1019_1";
	hideonnpc "�l�R�m�~���J#1020_1";
	hideonnpc "�l�R�m�~���J#1021_1";
	hideonnpc "�l�R�m�~���J#1022_1";
	hideonnpc "�l�R�m�~���J#1023_1";
	hideonnpc "�l�R�m�~���J#1024_1";
	hideonnpc "�l�R�m�~���J#1025_1";
	hideonnpc "�l�R�m�~���J#1026_1";
	hideonnpc "�l�R�m�~���J#1027_1";
	hideonnpc "�l�R�m�~���J#1028_1";
	hideonnpc "�l�R�m�~���J#1029_1";
	hideonnpc "�l�R�m�~���J#1030_1";
	hideonnpc "�l�R�m�~���J#1031_1";
	hideonnpc "�l�R�m�~���J#1032_1";
	hideonnpc "�l�R�m�~���J#1032_2";
	hideonnpc "�l�R�m�~���J#1032_3";
	hideonnpc "�l�R�m�~���J#1032_4";
	hideonnpc "�l�R�m�~���J#1032_5";
	hideonnpc "�l�R�m�~���J#1033_1";
	hideonnpc "�l�R�m�~���J#1034_1";
	hideonnpc "�l�R�m�~���J#1035_1";
	hideonnpc "�l�R�m�~���J#1036_1";
	hideonnpc "�l�R�m�~���J#1037_1";
	hideonnpc "�l�R�m�~���J#1038_1";
	hideonnpc "�l�R�m�~���J#1039_1";
	hideonnpc "�l�R�m�~���J#1040_1";
	hideonnpc "�l�R�m�n�E���h#2001_1";
	hideonnpc "�l�R�m�n�E���h#2002_1";
	hideonnpc "�l�R�m�n�E���h#2003_1";
	hideonnpc "�l�R�m�n�E���h#2004_1";
	hideonnpc "�l�R�m�n�E���h#2005_1";
	hideonnpc "�l�R�m�n�E���h#2006_1";
	hideonnpc "�l�R�m�n�E���h#2007_1";
	hideonnpc "�l�R�m�n�E���h#2008_1";
	hideonnpc "�l�R�m�n�E���h#2009_1";
	hideonnpc "�l�R�m�n�E���h#2010_1";
	hideonnpc "�l�R�m�n�E���h#2011_1";
	hideonnpc "�l�R�m�n�E���h#2011_2";
	hideonnpc "�l�R�m�n�E���h#2012_1";
	hideonnpc "�l�R�m�n�E���h#2013_1";
	hideonnpc "�l�R�m�n�E���h#2013_2";
	hideonnpc "�l�R�m�n�E���h#2013_3";
	hideonnpc "�l�R�m�n�E���h#2014_1";
	hideonnpc "�l�R�m�n�E���h#2015_1";
	hideonnpc "�l�R�m�n�E���h#2016_1";
	hideonnpc "�l�R�m�n�E���h#2017_1";
	hideonnpc "�l�R�m�n�E���h#2018_1";
	hideonnpc "�l�R�m�n�E���h#2019_1";
	hideonnpc "�l�R�m�n�E���h#2020_1";
	hideonnpc "�l�R�m�n�E���h#2021_1";
	hideonnpc "�l�R�m�n�E���h#2022_1";
	hideonnpc "�l�R�m�n�E���h#2023_1";
	hideonnpc "�l�R�m�n�E���h#2024_1";
	hideonnpc "�l�R�m�n�E���h#2025_1";
	hideonnpc "�l�R�m�n�E���h#2026_1";
	hideonnpc "�l�R�m�n�E���h#2027_1";
	hideonnpc "�l�R�m�n�E���h#2028_1";
	hideonnpc "�l�R�m�n�E���h#2029_1";
	hideonnpc "�l�R�m�n�E���h#2030_1";
	hideonnpc "�l�R�m�n�E���h#2031_1";
	hideonnpc "�l�R�m�n�E���h#2032_1";
	hideonnpc "�l�R�m�n�E���h#2033_1";
	hideonnpc "�l�R�m�n�E���h#2034_1";
	hideonnpc "�l�R�m�n�E���h#2035_1";
	hideonnpc "�l�R�m�n�E���h#2036_1";
	hideonnpc "�l�R�m�n�E���h#2037_1";
	hideonnpc "�l�R�m�n�E���h#2038_1";
	hideonnpc "�l�R�m�n�E���h#2039_1";
	hideonnpc "�l�R�m�n�E���h#2040_1";
	hideonnpc "�l�R�m�n�E���h#2040_2";
	hideonnpc "�l�R�m�n�E���h#2041_1";
	hideonnpc "�l�R�m�n�E���h#2042_1";
	hideonnpc "�l�R�m�n�E���h#2043_1";
	hideonnpc "�l�R�m�n�E���h#2044_1";
	hideonnpc "�l�R�m�n�E���h#2045_1";
	hideonnpc "�l�R�m�n�E���h#2046_1";
	hideonnpc "�l�R�m�n�E���h#2047_1";
	hideonnpc "�l�R�m�n�E���h#2047_2";
	hideonnpc "�l�R�m�n�E���h#2047_3";
	hideonnpc "�l�R�m�n�E���h#2047_4";
	hideonnpc "�l�R�m�n�E���h#2047_5";
	hideonnpc "�l�R�m�n�E���h#2048_1";
	hideonnpc "�l�R�m�n�E���h#2049_1";
	hideonnpc "�l�R�m�n�E���h#2050_1";
	hideonnpc "�l�R�m�n�E���h#2051_1";
	hideonnpc "�l�R�m�n�E���h#2052_1";
	hideonnpc "�l�R�m�n�E���h#2053_1";
	hideonnpc "�l�R�m�n�E���h#2054_1";
	hideonnpc "�l�R�m�n�E���h#2055_1";
	hideonnpc "�l�R�m���[�E�F��#3001_1";
	hideonnpc "�l�R�m���[�E�F��#3002_1";
	hideonnpc "�l�R�m���[�E�F��#3003_1";
	hideonnpc "�l�R�m���[�E�F��#3004_1";
	hideonnpc "�l�R�m���[�E�F��#3005_1";
	hideonnpc "�l�R�m���[�E�F��#3006_1";
	hideonnpc "�l�R�m���[�E�F��#3007_1";
	hideonnpc "�l�R�m���[�E�F��#3008_1";
	hideonnpc "�l�R�m���[�E�F��#3008_2";
	hideonnpc "�l�R�m���[�E�F��#3008_3";
	hideonnpc "�l�R�m���[�E�F��#3008_4";
	hideonnpc "�l�R�m���[�E�F��#3009_1";
	hideonnpc "�l�R�m���[�E�F��#3009_2";
	hideonnpc "�l�R�m���[�E�F��#3010_1";
	hideonnpc "�l�R�m���[�E�F��#3011_1";
	hideonnpc "�l�R�m���[�E�F��#3011_2";
	hideonnpc "�l�R�m���[�E�F��#3011_3";
	hideonnpc "�l�R�m���[�E�F��#3011_4";
	hideonnpc "�l�R�m���[�E�F��#3012_1";
	hideonnpc "�l�R�m���[�E�F��#3013_1";
	hideonnpc "�l�R�m���[�E�F��#3014_1";
	hideonnpc "�l�R�m���[�E�F��#3014_2";
	hideonnpc "�l�R�m���[�E�F��#3014_3";
	hideonnpc "�l�R�m���[�E�F��#3014_4";
	hideonnpc "�l�R�m���[�E�F��#3014_5";
	hideonnpc "�l�R�m���[�E�F��#3014_6";
	hideonnpc "�l�R�m���[�E�F��#3014_7";
	hideonnpc "�l�R�m���[�E�F��#3014_8";
	hideonnpc "�l�R�m���[�E�F��#3014_9";
	hideonnpc "�l�R�m���[�E�F��#3014_0";
	hideonnpc "�l�R�m���[�E�F��#3015_1";
	hideonnpc "�l�R�m���[�E�F��#3016_1";
	hideonnpc "�l�R�m���[�E�F��#3017_1";
	hideonnpc "�l�R�m���[�E�F��#3018_1";
	hideonnpc "�l�R�m���[�E�F��#3019_1";
	hideonnpc "�l�R�m���[�E�F��#3020_1";
	hideonnpc "�l�R�m���[�E�F��#3021_1";
	hideonnpc "�l�R�m���[�E�F��#3022_1";
	hideonnpc "�l�R�m���[�E�F��#3023_1";
	hideonnpc "�l�R�m���[�E�F��#3024_1";
	hideonnpc "�l�R�m���[�E�F��#3025_1";
	hideonnpc "�l�R�m���[�E�F��#3026_1";
	hideonnpc "�l�R�m���[�E�F��#3027_1";
	hideonnpc "�l�R�m���[�E�F��#3028_1";
	hideonnpc "�l�R�m���[�E�F��#3029_1";
	hideonnpc "�l�R�m���[�E�F��#3030_1";
	hideonnpc "�l�R�m���[�E�F��#3031_1";
	hideonnpc "�l�R�m���[�E�F��#3031_2";
	hideonnpc "�l�R�m���[�E�F��#3032_1";
	hideonnpc "�l�R�m���[�E�F��#3033_1";
	hideonnpc "�l�R�m���[�E�F��#3034_1";
	hideonnpc "�l�R�m���[�E�F��#3035_1";
	hideonnpc "�l�R�m���[�E�F��#3036_1";
	hideonnpc "�l�R�m���[�E�F��#3037_1";
	
	hideonnpc "�������A#1_tiamat_04";
	hideonnpc "�������A#1_tiamat_35";
	hideonnpc "�������A#2_tiamat_00";
}