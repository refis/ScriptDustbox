moc_para01.gat,26,95,5	script	���G��#sara	10040,{/* 65388 */
	cutin "roel01.bmp", 0;
	mes "[���G��]";
	mes "������p�ł����H";
	next;
	switch(select("�_���W�����̒T��","�y���_���g�̌���","�W�^�[�o�O�̉�̌���")) {
	case 1:
		if(checkquest(13181)) {
			mes "[���G��]";
			mes "�ǂ������̂ł����H";
			mes "�������o������ׂɂ���";
			mes "���i�C������ɘb�������ĉ������B";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(checkquest(116509)) {
			mes "[���G��]";
			mes "���߂ăV�������V�[�Əo�����";
			mes "���̖`���ȗ��A";
			mes "�s�v�c�Ȏ�������܂����B";
			next;
			mes "[���G��]";
			mes "�ڂ������Ƃ͂킩��܂��񂪁A";
			mes "���i�C������̃��[�v�|�[�^����";
			mes "�ꏊ�����ł͂Ȃ��A���Ԃ��ꏏ��";
			mes "�L�����Ă����炵����ł��B";
			next;
			mes "[���G��]";
			mes "�܂�A�V�������V�[�Əo�����";
			mes "���̎��̂��̏ꏊ�ցA";
			mes "������x�s����Ƃ������ł��I";
			next;
			mes "[���G��]";
			mes "�V�������V�[���{����";
			mes "�݂�Ȃƈꏏ��";
			mes "�����֋A���Ă����������͂��ł��B";
			next;
			mes "[���G��]";
			mes "������x�V�������V�[�ɉ�΁A";
			mes "�Ō�ɕʂꂸ�ɂ��ޕ��@��";
			mes "�����邩������܂���B";
			next;
			mes "[���G��]";
			mes "�����A�����f�łȂ����";
			mes "������x�ꏏ�ɂ��̋�Ԃɍs���A";
			mes "�V�������V�[���~���菕����";
			mes "���Ă��炦�܂��񂩁H";
			next;
			if(select("�͂�","������") == 2) {
				mes "[���G��]";
				mes "�����ł����B";
				close2;
				cutin "roel01.bmp", 255;
				end;
			}
			mes "[���G��]";
			mes "�������o������ׂɂ���";
			mes "���i�C������ɘb�������ĉ������B";
			setquest 13181;
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(checkquest(116508)) {
			cutin "roel01.bmp", 0;
			mes "[���G��]";
			mes "�����͂��肪�Ƃ��������܂����B";
			mes "��͂�V�������V�[�Ɖ��肠���̂�";
			mes "�����Ȃ�ł��傤���c�c�B";
			mes "�Ȃ�āA��C�̓_���ł���ˁI";
			mes "�厖�ȃM���h�����o�[�̂��߂ł��I";
			mes "�����撣��܂��傤�I";
			setquest 13181;
			compquest 13181;
			setquest 116509;
			compquest 116509;
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		mes "[���G��]";
		mes "�͂��߂܂��āB";
		mes "�j���I�[�Y�̔��H�M���h�̃����o�[�A";
		mes "���G���ł��I";
		next;
		mes "[���G��]";
		mes "�l�����͑O�M���h�}�X�^�[��";
		mes "�j���I�[�Y�l�����������Ƃ����A";
		mes "���m�̃_���W�����̒T���֏o�����܂��B";
		next;
		mes "[���G��]";
		mes "�������A�����͕s���ȏꏊ�̂���";
		mes "��葽���̐�͂��m�ۂ������Ǝv���A";
		mes "�Վ��̃M���h����";
		mes "��W���邱�Ƃɂ��܂����B";
		mes "�悩������Q�����Ē����܂��񂩁H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���G��]";
			mes "�����ł����c�c�c�O�ł��B";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		cutin "roel02.bmp", 0;
		mes "[���G��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�j���I�[�Y�l�Ƃ����̂�";
		mes "^FF0000�j���I�[�Y�̔��H�M���h^000000��";
		mes "�O�M���h�}�X�^�[�ł��B";
		next;
		cutin "roel01.bmp", 0;
		mes "[���G��]";
		mes "�ނ͖`�����D���ŁA";
		mes "��ɐV�����X��_���W����������";
		mes "���������֗������Ă��܂��̂ŁA";
		mes "�M���h�����o�[�ł������Ȃ��Ȃ�";
		mes "�ނɉ���Ƃ͂ł��Ȃ�������ł��B";
		next;
		mes "[���G��]";
		mes "����ȃj���I�[�Y�l����A";
		mes "�������ʂ̎莆���͂��܂����B";
		mes "���ꂪ���̎莆�ł��B";
		next;
		mes "�]���Ȃ��͎莆���󂯎��A�J�����]";
		next;
		mes "^FF0000�]�M���h�݂̂�Ȃ�";
		mes "�@";
		mes "�@����ف`�I�@�݂�Ȍ��C�ɂ��Ă�H";
		mes "�@���͖����Ƃ��Ă����C����I";
		mes "�@�`���̐�X�ŐV�������m�ɏo�����";
		mes "�@�Ƃ��Ă��y������`�B�]^000000";
		next;
		mes "^FF0000�]���������A�`���̓r���Ŗʔ�������";
		mes "�@�_���W�������������񂾁B";
		mes "�@�Ƃ��Ă��s�v�c�ȕ��͋C�ŁA";
		mes "�@���Ԃ�܂��N�ɂ���������Ă��Ȃ�";
		mes "�@���m�̏ꏊ���Ǝv����!!";
		mes "�@��������ˁ`�I�]^000000";
		next;
		mes "^FF0000�]����łˁA";
		mes "�@�N�����������Ƃ̂Ȃ��ꏊ�Ȃ�";
		mes "�@�ŏ��ɂ݂�ȂŒT���������Ȃ���";
		mes "�@�v�����񂾁I�@�ƁA�����킯�Ȃ̂�";
		mes "�@�݂�ȑ������ĂˁI�@�҂��Ă��`!!";
		mes "�@";
		mes "�@�j���I�[�Y���]^000000";
		next;
		mes "�]�ǂݏI�����莆�����G���Ɏ�n�����]";
		next;
		mes "[���G��]";
		mes "���̎莆�����Ėl�́A";
		mes "�j���I�[�Y�l��";
		mes "^0000FF�M���h�����o�[�݂�Ȃ�";
		mes "���m�̃_���W�����̍ŏ��̒T����";
		mes "�o��������^000000�Ƃ����z���ɁA";
		mes "�ƂĂ����������̂ł��I";
		next;
		mes "[���G��]";
		mes "�����ǁA���}�X�^�[�̃��e���g�l��";
		mes "�U�X�S�z�����������₪���āI�@�ƁA";
		mes "�������{���Ă��܂����B";
		mes "���e���g�l�̓j���I�[�Y�l�̎��ƂȂ��";
		mes "�����{���Ă΂���Ȃ�ł��B";
		next;
		mes "[���G��]";
		mes "�{���Ă͂��܂����A";
		mes "�����ƃ��e���g�l��";
		mes "�j���I�[�Y�l���{���ɐS�z�Ȃ�ł��B";
		mes "����l�͕t�����������������ł����A";
		mes "�P���J����ق�";
		mes "�����ǂ��ƌ����܂����ˁB";
		next;
		mes "[���G��]";
		mes "�����A���낻�뎞�Ԃł��B";
		mes "�j���I�[�Y�l��";
		mes "���҂�������킯�ɂ͂����܂���B";
		mes "�j���I�[�Y�l���w�肵���W���ꏊ�́A";
		mes "���i�C������̃��[�v�|�[�^����";
		mes "�L�^���Ă���܂��B";
		next;
		mes "[���G��]";
		mes "�������o������ׂɂ���";
		mes "���i�C������ɘb�������ĉ������B";
		setquest 13181;
		close2;
		cutin "roel01.bmp", 255;
		end;
	}
}

moc_para01.gat,29,95,5	script	���i�C��#sara	10039,{/* 65389 */
	if(checkquest(13181) == 0) {
		cutin "lunain01.bmp", 0;
		mes "[���i�C��]";
		mes "����ɂ��́B";
		mes "�Ȃɂ������������Ȋ�����Ă����ˁB";
		next;
		mes "[���i�C��]";
		mes "���B�͍�����";
		mes "�Ƃ���ꏊ�̒T���֍s���̂�B";
		mes "�ڂ����m�肽���Ȃ�";
		mes "���ɂ���^ff0000���G��^000000�ɘb�𕷂��Ƃ�����B";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
	if(checkquest(116509)) {
		cutin "lunain01.bmp", 0;
		mes "[���i�C��]";
		mes "����ɂ��́B";
		mes "�����͂ǂ�����́H";
		set '@str$,"�O�`������";
	}
	else {
		cutin "lunain01.bmp", 0;
		mes "[���i�C��]";
		mes "���G���ɘb�������Ă����݂����ˁB";
		mes "���̓j���I�[�Y�̔��H�M���h�̃����o�[";
		mes "^ff0000���i�C��^000000��B";
		next;
		mes "[���i�C��]";
		mes "���Ȃ����ꏏ�ɍs���̂ˁB";
		mes "�����͂���������H";
	}
	next;
	switch(select("�_���W�����ɍs��",'@str$,"��߂�")) {
	case 1:
		if(checkquest(13182) & 0x2 == 0) {
			mes "[���i�C��]";
			mes "���̎����̃��[�v��^ff0000�Ō�ɗ��p���Ă���";
			mes "20���Ԃ͍Ďg�p�ł��Ȃ���B^000000";
			mes "�����������Ԃ��o���Ă���";
			mes "�܂����Ȃ����B";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		mes "[���i�C��]";
		mes "���[�v�|�[�^���͂��ł��J���邯��";
		mes "�ǂ�����́H";
		next;
		mes "^ff0000�]�������A���_���W�����쐬���";
		mes "�@�p�[�e�B�[���[�_�[��ύX�����ꍇ";
		mes "�@����ɐi�s�ł��Ȃ��ꍇ������܂��̂�";
		mes "�@�����ӂ��������]^000000";
		next;
		if(select("�����̃W�^�[�o�O�ɓ���","�L�����Z��") == 2) {
			mes "[���i�C��]";
			mes "��߂�̂ˁB�킩������B";
			mes "�������ł�����܂����āB";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		mes "[���i�C��]";
		mes "�킩������B";
		mes "���[�v�|�[�^�����J������";
		mes "�����Ă��傤�����B";
		next;
		mes "[���i�C��]";
		mes "���̎����̃��[�v��^ff0000�Ō�ɗ��p���Ă���";
		mes "20���Ԃ͍Ďg�p�ł��Ȃ���B^000000";
		mes "�C��t���ĂˁB";
		next;
		switch(mdenter("jitterbug")) {
		case 0:	// �G���[�Ȃ�
			cutin "lunain01.bmp", 255;
			setquest 13182;
			misceffect 316,"";
			misceffect 317,"";
			announce "�������A���_���W����[jitterbug] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x1, 0x00ff99, 0x190, 12, 0, 0;
			warp "1@jtb.gat",16,17;
			end;
		case 1:	// �p�[�e�B�[������
			mes "�]�p�[�e�B�[���̂݁A";
			mes "�@�������A���_���W������";
			mes "�@���ꂷ�邱�Ƃ��ł��܂��]";
			close;
		case 2:	// �_���W�������쐬
			mes "�]�p�[�e�B�[���[�_�[��";
			mes "�@�������A���_���W������";
			mes "�@�������Ă��Ȃ���Ԃł��]";
			close;
		default:	// ���̑��G���[
			close;
		}
	case 2:
		mes "[���i�C��]";
		mes "���̃_���W�����̖`�����A";
		mes "���Ȃ������Ă��Ȃ��ꏊ��";
		mes "�����N�����Ă����̂��A";
		mes "�ǂ�ȉ�b������Ă����̂�";
		mes "�C�ɂȂ�Ȃ��H";
		next;
		mes "[���i�C��]";
		mes "���̃��[�v�|�[�^�����g����";
		mes "���Ȃ����{�����Ȃ������ꏊ��";
		mes "�����Ă����邱�Ƃ��ł����B";
		next;
		mes "[���i�C��]";
		mes "�ڂ����͂킩��Ȃ�����";
		mes "^ff0000���̃_���W��������A���Ă��邽�т�^000000";
		mes "���̃��[�v�|�[�^����";
		mes "�s�悪�����Ă�̂�ˁc�c�B";
		if(checkquest(116520) == 0) {
			set '@str[0],"^0000ff�s���_�ȋ^�f^000000";
		} else {
			set '@str[0],"�s���_�ȋ^�f";
		}
		while(1) {
			next;
			mes "[���i�C��]";
			mes "�����A���Ă݂����b��I��ŁB";
			mes "���̘b���s��ꂽ�ꏊ�A���Ԃ�";
			mes "�����Ă�����B";
			next;
			switch(select(	"^0000ff�s���_�ȋ^�f^000000",
							"^808080���J��^000000",
							"^808080���J��^000000",
							"^808080���J��^000000",
							"^808080���J��^000000",
							"^808080���J��^000000",
							"^808080���J��^000000",
							"^808080���J��^000000",
							"^808080���J��^000000",
							"^808080���J��^000000"
			)) {
			case 1:
				mes "[���i�C��]";
				mes "�킩������B";
				mes "���[�v�|�[�^�����J������";
				mes "�����Ă��傤�����B";
				misceffect 316,"";
				misceffect 317,"";
				close2;
				cutin "lunain01.bmp", 255;
				end;
			case 2:
				mes "[���i�C��]";
				mes "���߂�Ȃ����B";
				mes "���͂����ɑ���Ȃ��݂����B";
				next;
				mes "[���i�C��]";
				mes "���̃_���W������`�����Ă����";
				mes "������������A�s����悤��";
				mes "�Ȃ邩���m��Ȃ����B";
				break;
			}
		}
	case 3:
		mes "[���i�C��]";
		mes "��߂�̂ˁB�킩������B";
		mes "�������ł�����܂����āB";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
OnInit:
	waitingroom "�����̃W�^�[�o�O", 20;
	end;
}

moc_para01.gat,198,31,5	script	�~���~��#03	643,{/* 65390 */
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�j���I�[�Y�A�b������񂾂��ǁB";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�ǂ��������H�@�~���~���B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�ǂ��������H���āA���Ȃ��ˁI";
	mes "���̎�������ĘA��Ă�q�͒N��B";
	next;
	mes "[�~���~��]";
	mes "�܂����j���I�[�Y�c�c";
	mes "�Ƃ��Ƃ��{���̃����R���Ɂc�c�B";
	next;
	menu "�j���I�[�Y�̓����R���Ȃ́H",-;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes strcharinfo(0) + "�c�c";
	mes "�����Ȃ茻���";
	mes "�����R���Ƃ͍����Ȃ��I";
	mes "�m���ɂ��̎q�͉������ǂˁ�";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����ŁA�{����";
	mes "���̎q�͉��Ȃ́H";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���̎q�Ƃ͂��̓��A��";
	mes "�������������`�I";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c����ȏꏊ�ŁH";
	mes "�˂��A���ʂɍl���āA";
	mes "�������Ȃ�������H";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c�j���I�[�Y�B";
	mes "���̂��΂���A�N�H";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c���΂���H";
	next;
	mes "[�~���~��]";
	mes "�c�c�́H";
	mes "�܂����Ƃ͎v�����ǁc�c";
	mes "���̂���!?";
	next;
	menu "�����c�c",-;
	mes "[�~���~��]";
	mes "�c�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�~���~���`�H";
	mes "���[���B";
	next;
	mes "[�j���I�[�Y]";
	mes "�����Ȃ��c�c�B";
	mes "���΂��񔭌������Ȃ�";
	mes "�V���b�N�������݂����B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c�H";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���̐l�ɂ��΂���Ȃ��";
	mes "�������Ⴞ�߂���[�H";
	next;
	mes "[�j���I�[�Y]";
	mes "���x��������A�߂��I�@����`�B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c����Ȃ��B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���āc�c���[���A";
	mes "�~���~������[��B";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c�N���~���~���������!!";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���A�������ɂ��̌Ăѕ���";
	mes "���ʂ������݂������ˁB";
	next;
	menu "�ӂ����ق��������̂ł́H",-;
	mes "[�j���I�[�Y]";
	mes "�������ˁB";
	mes "�~���~���ɂ��߂�Ȃ������悤�B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c���߂�Ȃ����B";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�~���~���A�ӂ����񂾂�";
	mes "����ȕ|����c�c";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�Ⴄ���!!�@�����X�^�[��!!";
	mes "�����\���Ȃ�����!!";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�������Ɓ`�B��������B";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "���c�c����ȂɘV���Č�����́c�c�H";
	next;
	cutin "min02.bmp", 255;
	mes "�]�~���~���͕�����\���Ȃ���";
	mes "�@�ԂԂꂢ�Ă���B";
	mes "�@�ǂ���瑊���V���b�N��";
	mes "�@�󂯂��悤���c�c�]";
	close2;
	if(checkquest(116520) == 0) {
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		getexp 500000,0;
		setquest 116520;
		compquest 116520;
	}
	end;
}

moc_para01.gat,205,31,4	script	�j���I�[�Y#03	625,{/* 65391 */
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�~���~���͂܂��܂��Ⴂ�񂾂�B";
	close2;
	cutin "nines01.bmp", 255;
	end;
}

moc_para01.gat,204,33,4	script	�H�H�H#03	10041,{/* 65392 */
	cutin "shaloshi02.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c���΂���B";
	mes "�c�c���o����H";
	close2;
	cutin "shaloshi02.bmp", 255;
	end;
}
moc_para01.gat,220,23,0	script	3�ԕ����o��	45,{/* 65422 */
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������") == 2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close;
}

moc_para01.gat,37,95,5	script	�Q���J#1	629,{/* 65433 */
	if(checkquest(116508) == 0) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "��ɏC�s�A��ɏC�s�I";
		mes "�O�l���Ȃ��āA�܂Ɏt���I";
		mes "�������C�s�̓��ł��I";
		mes "�������撣��܂��I";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
	else {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���c�c" + strcharinfo(0) + "����I";
		mes "����ɂ��́B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "���������A���͂ł��ˁB";
		mes "���̌�A����ς肱��Ȍ���";
		mes "�ǂ��Ȃ��񂶂�Ȃ������Ęb��";
		mes "�Ȃ�����ł��c�c�B";
		mes "�V�������V�[����񂾂��Ă����ƁA";
		mes "�{�S�͈�����͂��c�c�B";
		next;
		mes "[�Q���J]";
		mes "���ƁA���i�C������̃��[�v�|�[�^����";
		mes "���̎��̏ꏊ�Ǝ��Ԃ��L�����Ă���";
		mes "�����Ȃ̂ŁA�Ƃ肠��������x";
		mes "�C�s���Ă��������r���グ�Ă܂��A";
		mes "������x���̏ꏊ�ɍs�����Ƃ����b��";
		mes "���������܂����B";
		next;
		mes "[�Q���J]";
		mes "�Ȃ̂Ŏ��Ǝt���A���Ɖ��l����";
		mes "���̊y���c�ɖ߂��đ����𔃂����߂�";
		mes "�����W�߂ƏC�s�����˂ăo�C�g���B";
		mes "�j���I�[�Y�l�͈�l�ōl����������ƁA";
		mes "���B�Ƃ͍��͕ʍs�����Ƃ��Ă��܂��B";
		mes "����͗��΂Ɏd���Ȃ��ł��ˁc�c�B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�Ȃ̂ł܂�����" + strcharinfo(0) + "����";
		mes "���̏ꏊ�̒T���ɋ��͂��ėǂ��Ȃ�";
		mes "���̎��͐���A���B�ƈꏏ��";
		mes "�܂����̏ꏊ�ɍs���܂��傤�ˁI";
		mes "����܂łɎ������������r��";
		mes "�グ�Ă����܂�����B";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}

moc_para01.gat,41,95,5	script	���e���g#12	630,{/* 65434 */
	if(checkquest(116508) == 0) {
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�������c�c�I";
		mes "�̐S�Ȏ��ɃA�C�c��";
		mes "�����������B";
		mes "�l�̓s�����l���Ȃ���";
		mes "��������F���ɂ��Ƃ�";
		mes "����Ȃ���!?";
		next;
		mes "[���e���g]";
		mes "�c�c�Ȃ񂾁H";
		mes "���͂��܏������̋�����";
		mes "�����񂾁B";
		mes "�p���Ȃ��Ȃ痣��Ă�������";
		mes "�����Ǝv�����B";
		close2;
		cutin "rote03.bmp", 255;
		end;
	}
	else {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����A���O���B";
		mes "���ɖ`���Ȃꂵ��";
		mes "���͋C�̂�������";
		mes "�v�������c�c�B";
		next;
		mes "[���e���g]";
		mes "�����ǂ����Ă�����";
		mes "����̂����Ċ炾�ȁB";
		mes "�ȒP�ɂ����Ƃ����œ��X�A";
		mes "�т̐H���グ�ɂȂ�Ȃ��悤";
		mes "�撣���Ă���Ă������B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���Ƃ͂܂��c�c";
		mes "���̘A�����ςɂ��C�ɂȂ���";
		mes "���������r���グ�Ă܂��A";
		mes "���̏ꏊ�ɒ��݂�����";
		mes "�����o���ĂĂȁB";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���̂��߂ɂ͑����Ƃ�";
		mes "���낢��旧���̂��K�v�����ȁB";
		mes "����Ȃ킯�ł����ő��̃��c��";
		mes "���l�������Ă�񂾁B";
		mes "�ǂ�������炾���ł�";
		mes "�����Ă���Ă���B";
		next;
		mes "[���e���g]";
		mes "���ɃQ���J�̂�́A";
		mes "�����ŋߖZ�����Ă��܂葊���";
		mes "�o���Ă��Ȃ���Ԃ�����ȁB";
		mes "���x�ɂɂȂ������ɂł��A";
		mes "���̂����ɃA�C�c�̘b�����";
		mes "�Ȃ��Ă��炦��Ə����邺�B";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}
moc_para01.gat,17,95,5	script	�~���~��#1	643,{/* 65435 */
	if(checkquest(116508) == 0) {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���[���ĂƁB";
		mes "�����������̌����A";
		mes "�����͐i�W���邩����H";
		mes "�����������낻��";
		mes "���̒i�K�ɐi�݂�����ˁB";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
	else {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����B";
		mes strcharinfo(0) + "�B";
		mes "�������ŉ�ƂȂ񂾂�";
		mes "�ςȊ����ˁB";
		next;
		mes "[�~���~��]";
		mes "�Ƃ肠�����V�������V�[�̌���";
		mes "�܂��F�X�Ɩ�肪���肻���ˁB";
		mes "���ɐV�����M���h�}�X�^�[��";
		mes "�U�����Ȃ��Ɩ������Ǝv����B";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "���e���g���Č����ڒʂ�A";
		mes "�C������i�������ς�B";
		mes "���ɁA�M���h�����o�[�ɉ���";
		mes "�댯������ԉ\�������邱�Ƃɂ�";
		mes "���ȁ`��q���Ȃ̂�ˁB";
		next;
		mes "[�~���~��]";
		mes "�܂��A�����͂��̎q�Ȃ��";
		mes "�F�X����������d�����Ȃ��񂾂��ǁB";
		mes "�Ȃɂ͂Ƃ����ꂱ���ł�������";
		mes "�F�X�Ƙb���Ă݂��Ƃ���ŁA";
		mes "����̋�_�ł����Ȃ����B";
		mes "�Ƃɂ����c�c";
		next;
		mes "[�~���~��]";
		mes "���i�C���̃��[�v�|�[�^����";
		mes "���Ԃ��L�����Ă���݂��������A";
		mes "��������܂����p���ĒN����";
		mes "���e���g���܂߁A���݂̂�Ȃ�";
		mes "�������邵���Ȃ��񂶂�Ȃ�������H";
		close2;
		cutin "min02.bmp", 255;
		end;
	}
}

moc_para01.gat,44,81,3	script	�����f�B�[�W���b�N#1	648,8,8,{/* 65436 */
	{
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c�B";
		mes "�����͂ǂ�����H";
		next;
		switch(select("�˗����󂯂�","�˗���񍐂���","���ʕ�V�ɂ���","�˗���j������","�b������")) {
		case 1:
			if(BaseLevel >= 140) {
				mes "[�����f�B�[�W���b�N]";
				mes "�c�O�������O�Ɉ˗��ł�����̂�";
				mes "�����悤���B";
				mes "���̈˗��͂�����x���܂����r�O��";
				mes "�����o�[�Ɉ˗�����K�v������B";
				mes "���ꂪ�N���C�A���g�����";
				mes "�w��������d�����Ȃ��B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "������𗧂Ă�΂����炪������";
				mes "�ƌ������悤�ɁA�ׂ����񑩂��Ƃ�";
				mes "����͂��낢�댈�߂��Ă���B";
				mes "���̂��߂��O�Ɉ˗����邱�Ƃ�";
				mes "�����o���Ȃ�����A";
				mes "�����Ă����Ă���B";
				next;
				mes "�]^ff0000�����f�B�[�W���b�N�̈˗���";
				mes "�@BaseLv140�ȏ�ł͎󂯂邱�Ƃ�";
				mes "�@�ł��܂���^000000�]";
				close;
			}
		case 2:
			mes "[�����f�B�[�W���b�N]";
			mes "���������A";
			mes "�������Ă���˗��͖����悤�����H";
			mes "������x�悭�m�F���Ă݂Ă���B";
			close;
		case 3:
			mes "[�����f�B�[�W���b�N]";
			mes "���ƃA�C�O�̈˗��A";
			mes "^FF0000���ꂼ��4��ނ��ׂĂ�";
			mes "������������^000000���ʕ�V����낤�B";
			mes "�������e���C�ɂȂ�Ȃ�";
			mes "���ƃA�C�O�̈˗���B�����Ă���B";
			next;
			mes "[�����f�B�[�W���b�N]";
			mes "���ׂĂ��Ȃ��̂͑�ς��낤�B";
			mes "�����A���̋�J�Ɍ�������";
			mes "��V�͖񑩂���B";
			mes "���̋C���������璧��ł݂Ă���B";
			close;
		case 4:
			mes "[�����f�B�[�W���b�N]";
			mes "�˗������d����j���������̂��H";
			mes "�t���A�܂������B";
			mes "���O�ɂ͂��O�̎������񂾂낤�B";
			next;
			mes "[�����f�B�[�W���b�N]";
			mes "�j���̕��@��2��ނ���B";
			mes "�D���ȕ���I�ׁB";
			next;
			switch(select("�˗��̔j��","�񍐋L�^�̔j��")) {
			case 1:
				mes "[�����f�B�[�W���b�N]";
				mes "���������A";
				mes "�˗����Ă���d���͖����悤�����H";
				mes "������x�悭�m�F���Ă݂Ă���B";
				close;
			case 2:
				mes "[�����f�B�[�W���b�N]";
				mes "���������A";
				mes "�������Ă���񍐂̋L�^��";
				mes "�����悤�����H";
				mes "������x�悭�m�F���Ă݂Ă���B";
				close;
			}
		case 5:
			mes "[�����f�B�[�W���b�N]";
			mes "�����A�܂������O�c�c";
			mes "���ɋ���������̂��H";
			mes "�t���B";
			mes "���܂��������ނ�";
			mes "��ςȂ��ƂɂȂ邼�B";
			next;
			switch(select("����������","�˗��ɂ��ĕ���","����ɂ��ĕ���","�񑩂Ƃ́H")) {
			case 1:
				mes "[�����f�B�[�W���b�N]";
				mes "�c�O�����c�c";
				mes "���͂��O�ɋ����͂Ȃ��B";
				mes "�䂦�ɁA��邱�Ƃ��Ȃ��B";
				mes "�����������Ƃ��B";
				close;
			case 2:
				mes "[�����f�B�[�W���b�N]";
				mes "���̎��Ƃ������Ƃ��c�c";
				mes "��������Ȉ˗����󂯂Ă��܂����B";
				mes "�M�p��肪���邩��";
				mes "�_�񂵂��z�̍s�����s���Ƃ͂���";
				mes "��x�_�񂵂����e��r����";
				mes "�����o���킯�ɂ������Ȃ��B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "����ɉ����A";
				mes "���̃v���C�h�������Ȃ��B";
				mes "�_������Ƃ������t��";
				mes "�]���̂��Ƃ��Ȃ�����";
				mes "�s��Ȃ��̂��|���V�[���B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�Ƃ͂������O�̂悤�Ȗ`���҂�";
				mes "�˗��̈ꕔ��C���邱�Ƃ��ł���";
				mes "�ǂ������B";
				mes "��d�_�񂪑ʖڂƂ͌_�񏑂�";
				mes "�����ĂȂ����������͂Ȃ��B";
				close;
			case 3:
				mes "[�����f�B�[�W���b�N]";
				mes "�����A���̐��ŐM������̂�";
				mes "�����Ȃ����B";
				mes "�M����񑩂̂悤�Ȃ��̂�";
				mes "�S���Ӗ��̂Ȃ����Ƃ��B";
				mes "���؂�����A�j�邱�Ƃ�";
				mes "���ɁA�ȒP������ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�����炱���c�c";
				mes "�����M����͎̂������g��";
				mes "������������������B";
				mes "���l���x���邪";
				mes "�������g���x���Ȃ��B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "����ɖ񑩂�M����";
				mes "���؂���ƈ⍦���c������";
				mes "���낢��ʓ|�����A";
				mes "����͕�V�����������";
				mes "�񕜂��邱�Ƃ��ł���B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�t���A���ʂɂ���ׂ肷�������B";
				mes "�Ƃɂ������͈ȏ�̂悤��";
				mes "�l���Ă���Ƃ������Ƃ��B";
				mes "����𗝉�����Ƃ��A";
				mes "�]���Ƃ��v���Ă��Ȃ��B";
				mes "���������������Ăق����B";
				close;
			case 4:
				mes "[�����f�B�[�W���b�N]";
				mes "�񑩂ɂ��āc�c���ƁH";
				mes "��������̂��O�ɘb���K�v��";
				mes "����Ƃ����񂾁H";
				mes "���܂�F�������";
				mes "�g��łڂ����ƂɂȂ邼�B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "���͎d���Ȃ��\�ɏo�Ă��邪�A";
				mes "�e�̒��Ő����čs���̂�";
				mes "�{���A���̐��������B";
				mes "�䂦�ɕK�v�Ȃ��ƈȊO��";
				mes "���ɘb������͂Ȃ��B";
				close;
			}
	}
	if(checkquest(116508) == 0) {
		mes "[�����f�B�[�W���b�N]";
		mes "�����H";
		mes "���ĕ�����Ȃ����H";
		mes "���͍��A�Z�����񂾁B";
		mes "�ז������Ȃ��ł���B";
		close;
	}
	else {
		emotion 0, "�����f�B�[�W���b�N#1";
		mes "[�����f�B�[�W���b�N]";
		mes "���O���c�c�B";
		mes "�j���I�[�Y�̌��ȗ����ȁB";
		mes "���ЂȂ悤�ŉ���肾�B";
		next;
		emotion 0, "�����f�B�[�W���b�N#1";
		mes "[�����f�B�[�W���b�N]";
		mes "�ǂ������A�s�v�c�����Ȋ�����āB";
		mes "���̎p�ɉ΂������ł�";
		mes "����̂��H";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�����A���̎��͎p���B���Ă�������ȁB";
		mes "���̎p�͏��߂Č���̂��B";
		mes "����Ȃ��Ƃ͎v�����䖝���Ă���B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���āA�{��Ȃ񂾂��c�c�B";
		mes "���O�̘r��������ŗ��݂�����B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�������A���O�̓A�C�O�̈˗���";
		mes "�󂯂Ă���񂾂낤�H";
		mes "�����ő��k���B";
		mes "�A�C�O�̈˗����������Ȃ���ł����B";
		mes "������̈˗���������";
		mes "���s���Ăق����̂��B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���̈˗����󂯂Ă����Ȃ�";
		mes "���_�A���������V���o���B";
		mes "�A�C�O����̕�V�Ƃ͕ʂɂ��B";
		mes "���O�ɂƂ��Ă����̘b��";
		mes "�������e�ł͂Ȃ��͂����B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "����l���Ȃ��Ă����B";
		mes "�A�C�O�̈˗�������������ł�";
		mes "���̈˗�����������B";
		mes "���ꂾ�����B";
		mes "�ȒP�Ȃ��Ƃ��낤�H";
		next;
		if(select("��`��","��`��Ȃ�") == 2) {
			emotion 0, "�����f�B�[�W���b�N#1";
			mes "[�����f�B�[�W���b�N]";
			mes "�������B��Ԃ������������ȁB";
			mes "���̘b�͖Y��Ă���B";
			close;
		}
		mes "[�����f�B�[�W���b�N]";
		mes "�������A��`���Ă���邩�B";
		mes "������B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "������_�����A�C�����Ăق����B";
		mes "������̈˗��ɂ��Ă����A";
		mes "�A�C�O�ɂ͔閧���B";
		mes "�����˗����e��b������";
		mes "���O�̐g���ǂ��Ȃ邩�͕ۏ؂��Ȃ��B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���ꂶ��A�������ł�����";
		mes "�b�������Ă���B";
		close;
	}
OnTouch:
	emotion 0, "�����f�B�[�W���b�N#1";
	mes "[�����f�B�[�W���b�N]";
	mes "�����B";
	mes "�����̂��O�c�c�B";
	mes "������Ǝ��̏��܂ŗ��Ă���B";
	close;
}
moc_para01.gat,17,77,5	script	�A�C�O#1	646,{/* 65437 */
	cutin "igu03.bmp", 255;
	{
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "����ɂ��́I";
		mes "���������ꂵ���C���Ȃ́�";
		mes "���߂ĕ���ŉ̂������݂����ɁA";
		mes "�ƂĂ��V�N�Ȋ����Ȃ́I";
		next;
		switch(select("�˗����󂯂�","�˗���񍐂���","�˗���j������","�b������")) {
		case 1:
			if(BaseLevel >= 140) {
				cutin "igu02.bmp", 2;
				mes "[�A�C�O]";
				mes "���肪�Ƃ��Ȃ́�";
				mes "�ł����̈˗��͑��̐l�ɂ���";
				mes "���肢���Ă��܂����́B";
				mes "�����玄�ȊO�ō����Ă���l��";
				mes "�����Ă����Ăق����́B";
				next;
				cutin "igu02.bmp", 255;
				mes "�]^ff0000�A�C�O�̈˗���";
				mes "�@BaseLv140�ȏ�ł͎󂯂邱�Ƃ�";
				mes "�@�ł��܂���^000000�]";
				close;
			}
		case 2:
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes "�Ȃ́H";
			mes "�������Ă���˗��͖����݂����B";
			mes "������x�悭�m�F���Ă݂Ăق����́B";
			close2;
			cutin "igu04.bmp", 255;
			end;
		case 3:
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "�˗��������d����j������́H";
			mes "�Z���������́H";
			mes "���߂�ˁA���肪�Ƃ��Ȃ́B";
			next;
			mes "[�A�C�O]";
			mes "�j���̕��@��2��ނ���́B";
			mes "�D���ȕ���I��ŁB";
			next;
			switch(select("�˗��̔j��","�񍐋L�^�̔j��")) {
			case 1:
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�Ȃ́H";
				mes "�˗��������d���͖����݂����B";
				mes "������x�悭�m�F���Ă݂Ăق����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			case 2:
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�Ȃ́H";
				mes "�������Ă���񍐂̋L�^��";
				mes "�����݂����B";
				mes "������x�悭�m�F���Ă݂Ăق����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
		case 4:
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "�����c���𖱂߂邽��ۂۊy�c��";
			mes "���E�̂����ȏꏊ������Ȃ���A";
			mes "�l�X�ɖ����̉��y��`����M���h�Ȃ́�";
			next;
			cutin "igu02.bmp", 2;
			mes "[�A�C�O]";
			mes "���ۂɎ������͖̉̂��@�ł͂Ȃ����ǁA";
			mes "�l�X�̗͂ɂȂ�̂͊m���Ȃ��ƂȂ́B";
			mes "�����Ď��������݂�Ȃ���A";
			mes "���t��Ί�Ō��C�����Ă���́B";
			mes "�������̉̂͂��������";
			mes "���E�������Ă���́�";
			close2;
			cutin "igu02.bmp", 255;
			end;
		}
	}
	if(checkquest(116508) == 0) {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "����ɂ��́�";
		mes "�y���c�̖`���҂�";
		mes "�D�����l�΂��肾�ƕ������́B";
		mes "�����ǂ������玄�̂��肢��";
		mes "�����Ăق����̂Ȃ́B";
		next;
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "�悸�͎��ȏЉ�Ȃ́B";
		mes "����^FF0000����ۂۊy�c^000000�̒c����C����Ă���";
		mes "^FF0000�A�C�O^000000�Ȃ́�";
		next;
		mes "[�A�C�O]";
		mes "���͒������C�u�c�A�[����";
		mes "���A���Ă����Ƃ���Ȃ́B";
		mes "�s���������������炢";
		mes "�����ȏꏊ�ŉ̂��Ă����́�";
		mes "�������������";
		mes "�N���ɘb�������Ȃ�Ȃ��H";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "���͖��񂻂��Ȃ́B";
		mes "������A������^����ɉ����";
		mes "���̘b�����������l������񂾂��ǁA";
		mes "���̐l�ɉ�ɍs������";
		mes "���̐l�Ɏb���O����s����";
		mes "�킩��Ȃ����Č���ꂽ�́B";
		next;
		mes "[�A�C�O]";
		mes "������c�c";
		mes "�y���c�ɗ��݂ɂ����́c�c�B";
		mes "���̐l��T���Ă����������āB";
		mes "�����ǁc�c";
		next;
		mes "[�A�C�O]";
		mes "�s���s���̐l��T���Ă����A";
		mes "�S���҂����Ȃ����A�l�������Ȃ����A";
		mes "�݂�ȖZ�����Ƃ����āA";
		mes "�S�R����ɂ��Ă���Ȃ��́B";
		mes "������Ƃ����đ҂̂��������A";
		mes "���ڈ˗������鎖�ɂ����́I";
		next;
		mes "[�A�C�O]";
		mes "�c�c�����܂Řb�𕷂��Ă��ꂽ�̂�";
		mes "���Ȃ������߂ĂȂ́B";
		mes "�������I";
		mes "���f�����m�ł��Ȃ���";
		mes "����̈˗������肢�������́B";
		mes "���肢�Ȃ́c�c�I";
	}
	else {
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "�v���Ԃ�Ȃ́�";
		mes "���C�����ł悩�����́I";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���������ςȂ́I";
		mes "�j���I�[�Y���܂��ǂ�����";
		mes "���Ȃ��Ȃ���������́I";
		next;
		mes "[�A�C�O]";
		mes "�y���c�Ƀj���I�[�Y��";
		mes "�T���Ă����悤��";
		mes "���݂ɂ����񂾂���";
		mes "�S���҂����Ȃ��ĖZ��������";
		mes "�f��ꂿ������́c�c�B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "������c�c�����Œ��ځA";
		mes "�`���҂̐l�ɂ��肢���鎖�ɂ����́I";
		next;
		mes "[�A�C�O]";
		mes "���Ȃ��Ȃ���͂��\���������S�Ȃ́I";
		mes "���f��������Ȃ����ǁA";
		mes "�����ǂ������玄�̂��肢��";
		mes "�����Ăق����́B";
		mes "���肢�Ȃ́c�c�B";
	}
	next;
	if(select("��`��","��`��Ȃ�") == 2) {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�Ȃ́c�c�H";
		mes "���߂�Ȃ����c�c�B";
		mes "���Ȃ��ɂ��s��������́B";
		mes "�b�𕷂��Ă����";
		mes "���肪�Ƃ��Ȃ́c�c�B";
		close2;
		cutin "igu05.bmp", 255;
		end;
	}
	cutin "igu03.bmp", 2;
	mes "[�A�C�O]";
	mes "�悩�����I�@�����󂯂Ă����";
	mes "�Ƃ��Ă��������́I";
	mes "���̎��ɂ͂��Ȃ�����";
	mes "�����l�����Ȃ��́c�c�B";
	next;
	cutin "igu02.bmp", 2;
	mes "[�A�C�O]";
	mes "�˗����󂯂鏀�����ł�����";
	mes "������x�b�������ė~�����́B";
	mes "�˗����e�𐮗����āA";
	mes "�ڂ����b������́B";
	close2;
	cutin "igu02.bmp", 255;
	end;
}
moc_para01.gat,41,76,3	script	���M#1	647,{/* 65438 */
	if(checkquest(116508) == 0) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "���̔��͉���峂̂悤�Ɂc�c";
		mes "�ӂށA�������ɉ̎���";
		mes "峂͂��܂�ǂ��Ȃ��C��";
		mes "���܂��˂��B";
		mes "���ɉ������邩�ȁc�c�B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
	else {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes strcharinfo(0) + "����B";
		mes "�������`���ɍs�����";
		mes "�\��ł����H";
		next;
		cutin "ragi03.bmp", 2;
		mes "[���M]";
		mes "����ɂ��Ă��c�c";
		mes "�����Ă܂����B";
		mes "����Ȍ��t���s�b�^����";
		mes "�W�J�ɂȂ��Ă��܂��˂��B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�Ƃ͂����l�̓��e���g�l��";
		mes "�������Ƃ������Ƃ�����";
		mes "�v����ł���˂��B";
		mes "�����Ȃ�΃����X�^�[�̎��";
		mes "���t����悤�Ȃ��̂ł����B";
		next;
		mes "[���M]";
		mes "�����A�A�C�O�l�����Ă����";
		mes "�l�l�Ƃ��Ă͂�͂�A";
		mes "�V�������V�[�̂��Ƃ��Ȃ�Ƃ�";
		mes "�o���Ȃ����̂��Ɠ���";
		mes "�Y�܂��Ă͂���̂ł����c�c";
		mes "���ʂ͏o�Ă��܂���B";
		next;
		mes "[���M]";
		mes "�Ƃ肠�������i�C�������";
		mes "���[�v�|�[�^���ŉ��x�����̏ꏊ��";
		mes "�ʂ��āA�F���񂪔[���ł���悤��";
		mes "�𓚂�������܂Ŋ撣�邵��";
		mes "�Ȃ��悤�ł��˂��c�c�B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
}

1@jtb.gat,25,28,5	script	���e���g#01	630,{/* 61513 */
	switch(JTB_1QUE) {
	case 0:
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���H�@���O���Վ��̃M���h�����B";
		mes "���C������̂͂������A";
		mes "���̎ז������͂���Ȃ�B";
		close2;
		cutin "rote01.bmp", 255;
		end;
	case 1:
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�`�b�I";
		mes "���Ȃ񂾂��̃_���W�����́A";
		mes "����ł��Z�ݒ����Ă��₪��̂��H";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}
1@jtb.gat,31,28,4	script	�A�C�O#01	646,{/* 61514 */
	switch(JTB_1QUE) {
	case 1:
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�j���I�[�Y�͑��ς�炸�Ȃ́B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,23,26,5	script	�Q���J#01	629,{/* 61515 */
	switch(JTB_1QUE) {
	case 0:
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�V�l����ł����H";
		mes "��낵�����肢���܂��I";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	case 1:
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���̎׈��ȋC�c�c";
		mes "���Ȃ�ł��傤���H";
		mes "�׈��Ȃ�ł����ǁA";
		mes "���ӂ͊����Ȃ���ł��B";
		mes "�s�v�c�ł���ˁI";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}
1@jtb.gat,33,26,4	script	���M#01	647,{/* 61516 */
	switch(JTB_1QUE) {
	case 1:
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�s�v�c�ȑ̌������܂����˂��B";
		mes "�����A���̋C�������̂ɂ�����";
		mes "�Ȃ��Ă��܂����悧�B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
}
1@jtb.gat,25,24,5	script	�~���~��#01	643,{/* 61517 */
	switch(JTB_1QUE) {
	case 0:
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���Ȃ����Վ��̃M���h���ˁH";
		mes "��낵���B";
		close2;
		cutin "min01.bmp", 255;
		end;
	case 1:
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����ȏꏊ�ɕ��R�ƌĂяo���Ȃ��";
		mes "�j���I�[�Y�͑��ς�炸�ˁc�c�B";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
}
1@jtb.gat,31,24,4	script	�A����#01	644,{/* 61518 */
	switch(JTB_1QUE) {
	case 1:
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�فA�{���ɗH�삾������";
		mes "�ǂ����悤�c�c�B";
		mes "�H��|���ȁc�c�B";
		close2;
		cutin "arang01.bmp", 255;
		end;
	}
}
1@jtb.gat,23,22,5	script	���i�C��#01	10039,{/* 61519 */
	switch(JTB_1QUE) {
	case 0:
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "����A�����̂ˁB";
		mes "�Z���Ԃ����ǂ�낵���ˁB";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	case 1:
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "���A���ꂪ�{���̃j���I�[�Y�l�I";
		mes "����Ɖ���c�c�B";
		mes "�j���I�[�Y�l�ɓ����";
		mes "�M���h�ɓ������b�オ��������B";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	}
}
1@jtb.gat,34,22,4	script	���G��#01	10040,{/* 61520 */
	switch(JTB_1QUE) {
	case 1:
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�j���I�[�Y�l�c�c";
		mes "���߂Ă�����܂�����";
		mes "�{���Ƀ��e���g�l��";
		mes "�����ǂ���ł��ˁI";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}
1@jtb.gat,28,21,5	script	�����f�B�[�W���b�N#01	844,{/* 61521 */
	switch(JTB_1QUE) {
	case 0:
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c�ʓ|���ȁB";
		mes "�B��Ă���̂��킩��Ȃ��̂��H";
		close;
	case 1:
		mes "[�����f�B�[�W���b�N]";
		mes "���āA���Ȕy������悤����";
		mes "���͎��̎d�������邾�����B";
		mes "�z�Ƃ̖񑩂̂��߂ɂȁB";
		close;
	}
}
1@jtb.gat,28,30,5	script	�j���I�[�Y#01	625,{/* 61522 */
	switch(JTB_1QUE) {
	case 0:
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�M���h����8�ԂɊ�Â��A";
		mes "�M���h�}�X�^�[�͂��̉����I";
		mes "���̂��O�̓M���h�����o�[��";
		mes "�����[�ł����Ȃ��I";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���A�����Ȃ́H";
		mes "���Ⴀ�A���e������";
		mes "�V�}�X�^�[�Ȃ񂾂ˁB";
		next;
		mes "[�j���I�[�Y]";
		mes "��낵���ˁA�V�}�X�^�[�B";
		mes "���߂܂��Ă݂̂�Ȃ�";
		mes "���ꂩ���낵���ˁ`�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���O�c�c���ɂȂɂ��������Ƃ�A";
		mes "�v�����Ƃ͂Ȃ��̂���!?";
		next;
		mes "[���e���g]";
		mes "�M���h�}�X�^�[�̂����ɘA�����񂱂���";
		mes "�����Ȃ�A�����Ă����Ǝv������";
		mes "�ʔ����ꏊ������������A";
		mes "�݂�Ȃŗ�������!?";
		mes "�ӂ������!!";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���߂񂲂߂�B";
		mes "���΂ɋ}���������ȂƎv�����񂾂���";
		mes "���e�Ȃ炫���Ɨ��Ă�������";
		mes "�M���Ă�����ˁ�";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�j���I�[�Y�B���A���O�ȁc�c�B";
		next;
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�ӂӁA���͖{���ʕ�҂���`�I";
		mes "�������̂��Ƃ�S�z���Ă����";
		mes "���肪�Ƃ��ˁA���e���g��";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���A�Ⴄ!!";
		mes "���͕ʂɂ��O��S�z��";
		mes "�����킯����Ȃ�!!";
		mes "�~���~����V�l�����o�[�����ȁc�c�B";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���[��A���ƐV�l�̂����ɂ���ȂƂ�";
		mes "���Ȃ��Ƃ͌���Ȃ����ǁA";
		mes "�ǂ��������͂낭�Ȃ��̂�";
		mes "�H�ׂĂȂ��͂������Č����āA";
		mes "�ɂ����ʂɔ����Ă����̂�";
		mes "�ǂ��̒N������ˁB";
		next;
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "����͖{������!?";
		mes "�ɂ��Ȃ�āA�v���Ԃ肾��`�I";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����A�����R�����Ă�";
		mes "�d���Ȃ��ł���B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�t������ʂ̂ɂ���1�l��";
		mes "�����A���Ă����̂�";
		mes "�s�v�c��������ł���ˁ`�I";
		mes "�~���~������̂��b�𕷂��āA";
		mes "�[�����܂����I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Q���J�I";
		mes "�]�v�Ȃ��Ƃ͌����ȁI";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�ق�A����ł킩�����ł���H";
		mes "���e���g�͖{���ɂ��񂽂̂��Ƃ�";
		mes "�S�z���Ă�̂�B";
		next;
		mes "[�~���~��]";
		mes "���ɏo��ȂƂ͂���Ȃ����ǁA";
		mes "���e���g���炢�ɂ�";
		mes "�A�����Ă����Ȃ�����ˁB";
		next;
		mes "[�~���~��]";
		mes "���񂽂̂��Ƃ�S�z����b���A";
		mes "�������������";
		mes "�������̐g�ɂ��Ȃ��Ăق�����B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "��������[�I";
		mes "����Ƀ��e���g�A�S�z��������";
		mes "�X峂Ԃ����悤�Ȋ�ɂȂ��Ă�";
		mes "�|���񂾂�[�H";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�A�����A���O�܂�";
		mes "����Ȃ��Ƃ����̂���c�c�B";
		next;
		mes "[���e���g]";
		mes "�͂��c�c���̖�����";
		mes strcharinfo(0)+ "����";
		mes "�̂悤���ȁc�c�B";
		next;
		switch(select("���e���g�̓c���f���Ȃ�ł���","�݂Ȃ���A�����ǂ���ł��ˁB")) {
		case 1:
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c���f��!?";
			next;
		}
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����A�悭�킩���Ă邶��Ȃ��B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�Ⴄ��`�I";
		mes "���e�̓e�����Ȃ��������";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���O��Ȃ��c�c�B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "���܂�{��Ƃ��킪�������H";
		mes "���e���g�B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�N�\�b�I�@���͕��������c�c�B";
		mes "����Ńj���I�[�Y�B";
		mes "���̓��A�͂Ȃ�Ȃ�!?";
		mes "�����ɋ��邾���Ŗ���";
		mes "���������Ȃ��c�c�B";
		next;
		mes "[���e���g]";
		mes "�N���ɂ����ƌ����Ă���݂������B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "���݂̂�Ȃ����̓��A�̋�C�̂�����";
		mes "�Ȃ񂾂����C���Ȃ��ˁc�c�B";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�����ˁA���̓��A�͕��ʂ���Ȃ��B";
		mes "��������������ɖ߂낤�Ƃ�����A";
		mes "�s�v�c�ȗ͂ł݂��";
		mes "�o���o���ɂ��ꂽ���B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Ȃ�Ƃ��������Ă܂��W�܂ꂽ�̂�";
		mes "��Ղ��ȁB";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "���́A�t�������邩�畽�C�ł����ǁI";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�������ˁI";
		mes "�ł����ꂾ������Ȃ��񂾂�I";
		mes "���̓��A�ɂ͎������ȊO��";
		mes "��������݂����Ȃ񂾁B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�����A�������ĉ���!?";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "����H";
		mes "���e�A�N�ɂ͕������Ȃ������H";
		mes "����������A����������";
		mes "�Ă�ł���悤�Ȃ񂾂��ǁB";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�c�c���A������Ă܂����B";
		next;
		cutin "arang02.bmp", 2;
		mes "[�A����]";
		mes "�H��c�c�H";
		next;
		cutin "arang01.bmp", 255;
		mes "[�H�H�H]";
		mes "�H����āc�c���H";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�ȁA�Ȃ�!?";
		mes "���ɒ��ڐ����c�c�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���A���e�ɂ����������񂾂ˁ`�B";
		mes "�ǂ������ǂ������I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�e���F�F�F�F�F�b�I";
		mes "�����������Ƃ͑����������I";
		next;
		cutin "nines04.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�`�c�c";
		mes "����Ȃɋ݂�͂ނƋꂵ����`�H";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���O�͈�x������";
		mes "�I�[�f�B���̓z�ɂł�";
		mes "����Ă����ׂ������Ȃ�!?";
		next;
		cutin "rote01.bmp", 255;
		mes "[�H�H�H]";
		mes "�c�c���߁B";
		misceffect 563,"";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c!!";
		mes "�n�k�Ȃ́I�@�݂�ȋC��t���āI";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "�t���I�@�����׈��ȋC�������܂��I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�N�\�b�I�@�Ƃɂ����o����T�����I";
		mes "�����͉������o�C����������I";
		mes "�퓬�̏����͑ӂ�Ȃ�I";
		set JTB_1QUE,1;
		close2;
		cutin "rote01.bmp", 255;
		end;
	case 1:
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�����A�`���̂͂��܂肾�I";
		mes "���N���N����ˁI";
		close2;
		cutin "nines01.bmp", 255;
		end;
	}
}
1@jtb.gat,205,31,4	script	�H�H�H#03	10041,{/* 61523 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "��A�g�����c�c�B";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,200,28,5	script	�A�C�O#03	646,{/* 61524 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "���̎q�A�ǂ����痈���񂾂낤�H";
		mes "�s�v�c�Ȏq�����ǁc�c";
		mes "�܂��͈��S�ȏ���";
		mes "�A��čs���Ă�����́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,203,28,4	script	���i�C��#03	10039,{/* 61525 (hide)*/
	switch(JTB_1QUE) {
	case 1:
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "����B���Ȃ��������������̂ˁB";
		mes "�A�C�O�[�I";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�ǂ��������́H�@���i�C���B";
		next;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "�M���h�����o�[��";
		mes strcharinfo(0) + "��������B";
		next;
		cutin "igu03.bmp", 2;
		mes "[�A�C�O]";
		mes "�悩�����́I";
		mes "�������̐퓬�ł݂�ȂƂ͂���āA";
		mes "�S�ׂ������́B";
		next;
		cutin "lunain03.bmp", 2;
		mes "[���i�C��]";
		mes "�j���I�[�Y�l��������";
		mes "�ō��������񂾂��ǁA";
		mes "�o�J���G������Ȃ��ėǂ�������B";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "����������";
		mes "�ǂ����ăo�J���G���Ȃ́H";
		next;
		cutin "lunain03.bmp", 2;
		mes "[���i�C��]";
		mes "�o�J������B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�g���W���Ȃ��������Ȃ́c�c�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����Ă����A�����N�̌��g(�l�Ԍ^)��";
		mes "����������l���Ɗ��Ⴂ����";
		mes "�����悤�Ƃ��āA�P��ꂽ�̂�H";
		mes "�o�J�ȊO�̉��҂ł��Ȃ�����Ȃ��B";
		next;
		cutin "lunain03.bmp", 255;
		mes "[�H�H�H]";
		mes "�����N�c�c�B";
		next;
		emotion 23, "���i�C��#03";
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes strcharinfo(0) + "�A";
		mes "�A�C�O�A";
		mes "�Ȃɂ��������H";
		next;
		menu "���������ĂȂ�",-;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c���H";
		mes "�������������ĂȂ����ǁc�c�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "!!";
		mes "����c�c������ƁA";
		mes "���i�C���I�@���I";
		next;
		cutin "lunain04.bmp", 2;
		emotion 23, "���i�C��#03";
		mes "[���i�C��]";
		mes "���H�@���Ⴀ��������!?";
		mes "���āA�l�ԁc�c!?";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�т����肵���́I";
		mes "�˂��A���삿���B";
		mes "�ǂ����炱���ɗ����́H";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�m��Ȃ��B";
		mes "�c�c�����������錾�t�A���������B";
		mes "�c�c�����痈�������B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���������Ė��q�Ȃ́H";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "������ƁA�A�C�O�I";
		mes "�ǂ�����Ă���ȏ������q���A";
		mes "����Ȏ����̋��Ԃ܂ł���Ă���̂�I";
		next;
		cutin "lunain03.bmp", 255;
		mes "[" + strcharinfo(0) + "]";
		mes "�j���I�[�Y�̗�����邵�c�c�B";
		next;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "�������Ă�̂�B";
		mes "�j���I�[�Y�l�͓��ʂ������";
		mes "���܂��Ă邶��Ȃ��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�j���I�[�Y�c�c�̂��l�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�j���I�[�Y�l��m���Ă��!?";
		mes "���āA�L���b�I";
		misceffect 563,"";
		next;
		cutin "lunain01.bmp", 255;
		mes "[" + strcharinfo(0) + "]";
		mes "�Ƃ肠�����A�݂�Ȃƍ������悤�B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes strcharinfo(0) + "��";
		mes "�����ʂ�Ȃ́B";
		mes "�ł��A���̎q��������";
		mes "�u���čs���̂��댯�����A";
		mes "�ꏏ�ɘA��Ă����́B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����ˁB���ɒN�����Ȃ��݂��������A";
		mes "�j���I�[�Y�l��m���Ă�Ȃ�";
		mes "�Ȃ�����A�����Ă����Ȃ���B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "���q�ɂȂ����獢�邵�A";
		mes "����Ȃ��ōs���́B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c��c�c�Ȃ��H";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "����H�@�Ȃ������ƂȂ��H";
		mes "�����ƁA�����Ȃ́B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�B";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "����ȏꏊ�ɂ������炩�ȁH";
		mes "�肪�₦�Ă�́B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�s�v�c�Ȋ���������B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�ق�A�������Ȃ��Ă����B";
		mes "�ۂ��ۂ��Ȃ́�";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�ۂ��ۂ��B";
		mes "�c�c�Ȃ́B";
		next;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "^ff0000��������^000000��^ff0000�Ȃ��炩�ȓ�^000000�A";
		mes "����2�����ˁB";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�����[�c�c�B���[��c�c";
		mes "�����������琦���͂�������́B";
		next;
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "�ǂ����ɐi�ނ��A�N�����̑�\�҂�";
		mes "���k���邩��҂��Ăė~�����́B";
		set JTB_1QUE,2;
		close2;
		cutin "lunain01.bmp", 255;
		end;
	case 2:
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "���A�������߂���";
		mes "�������Ɛi�݂܂���B";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
}
1@jtb.gat,289,118,3	script	�H�H�H#08	10041,{/* 61536 (hide)*/
	switch(JTB_1QUE) {
	case 3:
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "����c�c�B";
		mes "�ǂ�����΋�����H";
		mes "�c�c�ǂ�����Ώ΂���H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,288,122,4	script	���M#08	647,{/* 61537 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "����Ȏ�����";
		mes "�̂��̂��Č��C�������܂��傤�B";
		close2;
		cutin "ragi02.bmp", 255;
		end;
	case 3:
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[������";
		mes "�����̋C����������";
		mes "�\���ł���Ɨǂ��ł��˂��B";
		close2;
		cutin "ragi02.bmp", 255;
		end;
	}
}
1@jtb.gat,283,121,5	script	�j���I�[�Y#08	625,{/* 61538 (hide)*/
	switch(JTB_1QUE) {
	case 2:
		cutin "nines03.bmp", 2;
		emotion 2, "�j���I�[�Y#08";
		mes "[�j���I�[�Y]";
		mes "���̉�����͂��܂��ɉ����`";
		mes "�G��邱�Ƃ��炩�Ȃ�Ȃ��`";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�������ł��˂��A�j���I�[�Y�l�B";
		next;
		cutin "nines02.bmp", 2;
		emotion 15, "�j���I�[�Y#08";
		mes "[�j���I�[�Y]";
		mes "���肪�Ƃ��A���M�N�I";
		mes "����A" + strcharinfo(0) + "�I";
		mes "�N�������񂾂ˁ`�I";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "��H�@���킢���q��A��Ă���ˁI";
		mes "���̎q�͒N���ȁH";
		next;
		menu "���q�݂����Ȃ�ł�",-;
		mes "[�j���I�[�Y]";
		mes "����͂����Ȃ��ˁB";
		mes "�o���܂ňꏏ�ɍs�������B";
		mes "���삿���A";
		mes "�����O�͂Ȃ�Ă����̂��ȁH";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�c�c�V�������V�[�B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�V�������V�[���I";
		mes "���̓j���I�[�Y�B�ނ̓��M�N����B";
		mes "��낵���ˁA�V�������V�[�B";
		mes "�o���܂ł݂�Ȃňꏏ�ɍs�����ˁB";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "��낵�����肢���܂��ˁA";
		mes "�V�������V�[�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�Ƃ���ő��݂̂�Ȃ�";
		mes "�ꏏ����Ȃ��̂����H";
		next;
		menu "�A�C�O�ƃ��i�C���Ƃ͂��ꂽ",-;
		mes "[�j���I�[�Y]";
		mes "�Ȃ�قǁB";
		mes "���Ⴀ��l���T���Ȃ��Ƃ��ˁB";
		next;
		mes "[�j���I�[�Y]";
		mes "�Ȃ񂾂������͕s�v�c�ȗ͂�";
		mes "�����ꏏ�ɂ��������o�[��";
		mes "���Ȃ��Ȃ����Ⴄ�񂾂�ˁB";
		mes "������������񂾁B";
		mes "�͂���Ȃ��悤�ɂ��Ȃ��ƂˁB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�̂Ŏv���o�����B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�Èłŕ����������̐��c�c�B";
		next;
		menu "���H",-;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�^���Âȏ��ŉ������������B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�̂������B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�j���I�[�Y���̂��Ă��B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c���y�ɏ����";
		mes "�c�c�m��Ȃ����t�����ς�";
		mes "�c�c����Ă����B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c���̒��̗F�B���Ă������t�A";
		mes "�c�c�F�B�Ɖ߂������X�A";
		mes "�c�c�������C�ɓ������B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�����F�B�ƈꏏ��";
		mes "�c�c�̂������Ǝv�����B";
		mes "�c�c������A���肢�����B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�F�B�������������āB";
		next;
		mes "[�V�������V�[]";
		mes "�c�c��������A";
		mes "�c�c�A�C�O�ƃ��i�C���������B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�Ȃ�قǁB";
		mes "�����������炻��͉��y�̐_�l���A";
		mes "�肢�������Ă��ꂽ�̂���";
		mes "����܂���˂��B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "������������Ȃ��ˁB";
		mes "���y�̐_�l�ɂ́A";
		mes "�肢��z����͂��Ă��ꂽ��";
		mes "�����Ă��ꂽ�肷��";
		mes "�s�v�c�ȗ͂�����̂�������Ȃ��ˁB";
		next;
		mes "[�j���I�[�Y]";
		mes "���������΂������̉̂��A";
		mes "�˗���̑z���l�̒a���΂�";
		mes "�^����C���[�W�����ȂŁA";
		mes "�ނ̑z�����`���悤�ɂ���";
		mes "������񂾁B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���̋Ȃ𑡂�l�ɂ�";
		mes "�z�����`���Ƃ����Ȃ��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�^����ĂȂɁH";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[�A����ł��悧�B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "���ɂ��u�l���̗܁v��";
		mes "�u���̂������v�u�V�̘I�v�ȂǂƂ�";
		mes "�Ă΂�Ă܂��˂��B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���ꂢ�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�l�����܂𗬂��̂��ȁH";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�ǂ��Ȃ�ł��傤���B";
		mes "�l�����ł����A�l�Ƃ��Ă�";
		mes "�����⃂���X�^�[�������̂�";
		mes "�C�ɂȂ�܂��˂��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����⃂���X�^�[�͋����Ȃ��H";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�����͕s���ł����A���Ȃ��Ƃ��l��";
		mes "�����⃂���X�^�[���������Ƃ����b��";
		mes "���������Ƃ͂Ȃ��ł��˂��B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�܂𗬂��Ƃ������Ƃ�";
		mes "�������Ƃ����؋����낤���A";
		mes "����Ȗ����⃂���X�^�[������Ȃ�A";
		mes "���͂����ɗF�B�ɂȂꂻ�������";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "����Ȗ����⃂���X�^�[�Ȃ�A";
		mes "�ꏏ�ɉ̂��̂�����";
		mes "�y�����ł��傤�˂��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�ǂ�������܁A������H";
		next;
		cutin "ragi03.bmp", 2;
		mes "[���M]";
		mes "����A�V�������V�[��";
		mes "���������Ƃ��Ȃ��̂ł����H";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����Ȃ��B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�V�������V�[�B�܂͋������Ƃ���";
		mes "�������̂���Ȃ��񂾂�`�B";
		mes "�������ė������܂ɂ�";
		mes "�Ӗ����Ȃ�����ˁB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[��";
		mes "�܂𗬂��Ă݂�����ł��˂��B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�������A";
		mes "�V�������V�[������ǂ����B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�^��B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[��";
		mes "�����܂𗬂��鎞�܂ŁA";
		mes "���ꂪ�܂̂������Ď��ɂ��܂��傤�B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�킩�����B";
		next;
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���������ˁA���M�N�I";
		mes "���M�N�Ȃ�";
		mes "�f���炵���N���E����~���X�g������";
		mes "�Ȃ��Ǝv����`�I";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "���肪�Ƃ��������܂��B";
		mes "�ł��l�́A�܂����΂炭";
		mes "�o�[�h�̂܂܂ł�������ł���˂��B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�͂́A�o�[�h�ł��̂������ˁI";
		mes "�E�Ƃ͂��܂�֌W�Ȃ�����";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����ꏏ�ɉ̂������B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�������ˁ�";
		mes "���x�V�������V�[�ɂ�";
		mes "�̂����������Ă����悤�ˁI";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "���̎��݂͂�Ȃŉ̂��܂��傤�B";
		mes "�������A";
		mes strcharinfo(0)+ "�����";
		mes "�ꏏ�ɂł��悧�B";
		set JTB_1QUE,3;
		close2;
		cutin "ragi01.bmp", 255;
		end;
	case 3:
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�����A�V�������V�[�Ƃ�";
		mes "�̂��Ă݂����ˁB";
		mes "�����Ɗy������B";
		close2;
		cutin "nines03.bmp", 255;
		end;
	}
}
1@jtb.gat,34,193,5	script	���G��#10	10040,{/* 61539 (hide)*/}
1@jtb.gat,40,198,3	script	���i�C��#10	10039,{/* 61540 (hide)*/}
1@jtb.gat,38,197,4	script	�V�������V�[#10	10041,{/* 61541 (hide)*/
	switch(JTB_1QUE) {
	case 3:
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�͂���Ȃ��悤�Ɏ�c�c�Ȃ��B";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 4:
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���l���l���Ă��邱��";
		mes "�������Ȃ��H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,31,194,5	script	���e���g#10	630,{/* 61542 (hide)*/}
1@jtb.gat,36,191,5	script	�Q���J#10	629,{/* 61543 (hide)*/}
1@jtb.gat,38,191,4	script	�~���~��#10	643,{/* 61544 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���̃K�L�c�c";
		mes "����ς��������ˁc�c�B";
		mes "�����ޗ��ɂ��Ă�낤������B";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
}
1@jtb.gat,40,193,4	script	�A����#10	644,{/* 61545 (hide)*/}
1@jtb.gat,34,198,5	script	�j���I�[�Y#10	625,{/* 61546 (hide)*/
	switch(JTB_1QUE) {
	case 3:
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes strcharinfo(0) + "�I";
		mes "�V�������V�[�I�@�ǂ������I";
		mes "�����������񂾂ˁ`�I";
		mes "���̐퓬�Ń��M�N�Ƃ�";
		mes "�͂���Ă��܂�����c�c�B";
		next;
		switch(select("���̂܂܉�b�𑱂���","���̃����o�[��T��")) {
		case 1:
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�j���I�[�Y�A";
			mes "���S�����炨���������́H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "����!?�@������Ȃ��ƌ������H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c���������B";
			mes strcharinfo(0) + "�ɂ�";
			mes "�������Ȃ������H";
			next;
			menu "�������Ȃ�����",-;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c���������ăV�������V�[�ɂ�";
			mes "�l�̐S�̐�����������́H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c��������B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�H";
			mes "�ǂ����ĕ|�����Ă�́H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�Ƃ肠�����V�������V�[��";
			mes "�l�̐S��ǂ߂邱�Ƃ�";
			mes "��U�݂�Ȃɂ͓����ɂ��āc�c";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�c�O�ˁA�������Ă������";
			mes "�~���~���������Ă�B";
			next;
			cutin "nines04.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�~���~��!?";
			mes "���A���̂܂ɂ����ɂ����񂾂�!?";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���������狏�����B";
			mes "�Ƃ肠���������o����񂾂��A";
			mes "�����Ɛ������Ȃ����B";
			mes "�������ɉ��l�����邩��B";
			next;
			cutin "min02.bmp", 255;
			mes "�]���ǁA�V�������V�[��";
			mes "�@�S�̐������ɏo���Ȃ��Ɩ񑩂��A";
			mes "�@���̘b�͈�U�A�I��邱�ƂɂȂ����]";
			next;
			mes "�]�l�̐S���ǂ߂�V�������V�[��";
			mes "�@�l�Ԃł͂Ȃ��̂��낤���c�c�]";
			set JTB_1QUE,4;
			close2;
			cutin "nines01.bmp", 255;
			end;
		case 2:
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "��H�@���������琺�������I";
			mes "�N���������Ɍ������Ă��Ă�I";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "���[���I�@����ς�j���I�[�Y�B���I";
			mes "�݂�ȁ`�j���I�[�Y�B��������[�I";
			mes strcharinfo(0) + "��";
			mes "�V�������V�[���ꏏ����I";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "�V�������V�[�I�@�j���I�[�Y�l��";
			mes strcharinfo(0) + "��";
			mes "�ꏏ�������̂ˁB�悩������B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�݂�Ȗ��������������H";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "���v�B�݂�ȃP�K�Ƃ����ĂȂ���I";
			mes "�ł������X�^�[�������ς�����";
			mes "��ς������񂾂���I";
			next;
			cutin "nines02.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�q�[���[�͍Ō��";
			mes "�������̂���A�A�����I";
			mes "���̂悤�ɂˁI";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "�����܂Ōv�Z���Ă��Ȃ�āA";
			mes "�������j���I�[�Y�l!!";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "���̊��ɂ͊Ԃɍ����ĂȂ����ǂˁB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�������q�[���[���ƁA";
			mes "���͂ǂ��Ȃ��!?";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�t���́c�c�B";
			next;
			cutin "arang02.bmp", 2;
			mes "[�A����]";
			mes "�ŗ��������q�[���[�̃��C�o��!!";
			mes "�Ƃ��I";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�����������������ł�!!";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "����Ȃ������A";
			mes "���e���g�ɂܑ͖̖������B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c���e���A���C�o���ɂ�";
			mes strcharinfo(0) + "��";
			mes "�����������āB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�Ȃ�!?";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�~���~���͏������H";
			next;
			cutin "gelca04.bmp", 2;
			emotion 23, "�Q���J#10";
			mes "[�Q���J]";
			mes "�����A������Ȃ��ł���!?";
			mes "������Ȃ��ƌ����Ă܂��񂩂���I";
			mes "�c�c���āA����H";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "������Ƒ҂��Ȃ�����!?";
			mes "���̎q�A���������āc�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			emotion 23, "���i�C��#10";
			mes "[�V�������V�[]";
			mes "�c�c�₾�A����";
			mes "�����j���c�c�i���������j";
			next;
			cutin "lunain04.bmp", 2;
			emotion 19, "���i�C��#10";
			mes "[���i�C��]";
			mes "�V�A�V�������V�[!!";
			mes "���Ȃ�����������";
			mes "�݂�Ȃ̍l���Ă��邱�Ƃ��킩���!?";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "���i�C������c�c";
			mes "�Ƃ肠�������̍ǂ��ł����O���Ȃ���";
			mes "�b���Ȃ��Ǝv���܂��c�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�Ղ́[�B";
			mes "�c�c��������B";
			mes "�c�c�S�̐��A�݂�Ȃɂ͕������Ȃ��H";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "���͕����������ƂȂ���c�c�B";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c��������ς肱���Łc�c";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�j���I�[�Y�A";
			mes "�݂�Ȃǂ����ĕ|�����Ă�́H";
			next;
			mes "[�V�������V�[]";
			mes "�c�c�S�̐��A���������Ⴂ���Ȃ��́H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�B";
			mes "�����݂�ȂƖ񑩂��悤�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�S�̐�����������̂�";
			mes "�ǂ����������A���ɂ͌��߂��Ȃ��B";
			next;
			mes "[�j���I�[�Y]";
			mes "�����ǁA�݂�ȐS�̒���";
			mes "�閧�Ɏv���Ă鎖��";
			mes "�Y��ł邱�Ƃ����邩������Ȃ��B";
			next;
			mes "[�j���I�[�Y]";
			mes "�S�̒����Ă����̂�";
			mes "�����������̂Ȃ񂾂�B";
			mes "������݂�Ȃ̐����������Ă��A";
			mes "���ɏo�����Ⴂ���Ȃ���B";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�S�̒��̃i�C�V�����o�����Ⴄ�ƁA";
			mes "�݂�Ȃ���������A�т����肵����A";
			mes "�߂����Ȃ����Ⴄ��������Ȃ�����ˁB";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c����B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�݂�ȁA���߂�Ȃ����B";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�����q���ˁA�V�������V�[�B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A�j���I�[�Y�c�c";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���e�B�c�c��łˁB";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�`�b�B����ɂ���!!";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "�o�J�o�J�����B";
			mes "��́A���̒��ǂ܂�č���̂�";
			mes "���e���g���炢�ł���B";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "�����葁����������o�āA";
			mes "�����C�ɓ��鎖�̕����厖����B";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�����ł��ˁc�c����ɖ{����A";
			mes "���������͂��������";
			mes "��ςȂ��Ƒ����ł����c�c�B";
			next;
			cutin "arang03.bmp", 2;
			mes "[�A����]";
			mes "�悭�l������A����";
			mes "�ǂ܂�Ă����邱�ƂȂ��";
			mes "�l�������ƂȂ�����!!";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�c�c��A�����ǂ܂�č��鎖�Ȃ��";
			mes "�ȁA�Ȃ��񂾂���c�c�B";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�i��������l��";
			mes "���i�C������̌����ɖG���Ă�́A";
			mes "�o�����Ⴄ�c�c!?�j";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�i�S���ǂ߂�Ƃ������Ƃ�";
			mes "�����A�l�Ԃ���Ȃ��c�c�̂��H�j";
			set JTB_1QUE,4;
			close2;
			cutin "nines01.bmp", 255;
			end;
		}
	case 4:
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�͋C�t�����̂��ȁB";
		mes "�V�������V�[�́c�c�B";
		close2;
		cutin "nines01.bmp", 255;
		end;
	}
}
1@jtb.gat,110,196,5	script	���G��#11	10040,{/* 61547 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�l�͑��v�ł��B";
		mes "�V�������V�[�����܂�������B";
		mes "�N������鎖���ł��Čւ炵���ł��B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 5:
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�����X�^�[�ƗF�B�c�c�B";
		mes "�l�Ԃ��݂�ȃV�������V�[�݂�����";
		mes "�����X�^�[�ƗF�B�ɂȂ��Ȃ�A";
		mes "�����X�^�[�Ɛl�Ԃ���������";
		mes "���a�Ȑ��̒��ɂȂ��ł��傤�ˁB";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,108,198,5	script	�V�������V�[#11	10041,{/* 61548 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�݂�ȉ��䂵�Ă�c�c�B";
		mes "���v�H�@����H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	case 5:
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�y���͗F�B����Ȃ��c�c�B";
		mes "���̗F�B�́c�c�N�H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}
1@jtb.gat,112,196,3	script	���i�C��#11	10039,{/* 61549 (hide)*/
	switch(JTB_1QUE) {
	case 4:
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "����A���̑傫�ȃ����X�^�[�c�c�B";
		mes "���܂ł����ς������������̂Ƃ�";
		mes "�i�Ⴂ�̋�����������c�c�B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���G���B���i�C���B���䂵�Ă�B";
		mes "���v�H";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "���͕��C��B";
		mes "������ƃ��G���I";
		mes "���񂽉��䂵�Ă邶��Ȃ�!!";
		mes "���������Ȃ���!!";
		next;
		cutin "roel04.bmp", 2;
		mes "[���G��]";
		mes "�ځA�l�͑��v�ł��B";
		mes "���̂��炢�債�����Ɓc�c�B";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�������痈�Ȃ���!!";
		next;
		switch(select("�V�������V�[�̗l�q������","���G���̗l�q������")) {
		case 1:
			misceffect 313, "���G��#11";
			cutin "lunain04.bmp", 255;
			mes "�]�q�[������Ă��郍�G��������";
			mes "�@�V�������V�[�͔߂����Ɍ����J���]";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�y���A�O�͖\��Ȃ������̂ɁB";
			next;
			menu "�y�����ă����X�^�[�̖��O�H",-;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���y��������u�y���v�B";
			mes "���񂾂�A�\�ꂽ�肵�Ȃ������B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "������F�B�ɂȂ����B";
			mes "�ł��c�c�B";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�����X�^�[�ƗF�B��!?";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�ρH";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�V�������V�[�͂킩���ĂȂ�";
			mes "�݂��������猾�����ǁB";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�Ƃ͗F�B�ɂȂ�Ȃ��B";
			mes "������͎��B�ɂƂ��ēG��B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�G�H";
			next;
			mes "[�V�������V�[]";
			mes "�G���ĉ��H";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�l�B�ɊQ���Ȃ�����c�c�ł��傤���B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�ȒP�ɂ����ƁA";
			mes "���B�ɒɂ����Ƃ�������";
			mes "���点���肷�鑊��B";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�Ƃ͗F�B�ɂȂ�Ȃ��B";
			mes "������͎��B�ɂƂ��ēG��B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�ł��y���́A���ɒɂ����Ƃ�";
			mes "���邱�Ƃ��������ƂȂ��B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���܂ł͂���������";
			mes "��������Ȃ����ǁA";
			mes "���͈Ⴄ�ł���H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���́c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���A����";
			mes strcharinfo(0) + "�̔Ԃ�B";
			mes "�����ɍ���Ȃ����B";
			next;
			cutin "lunain01.bmp", 255;
			mes "�]�V�������V�[�͉���";
			mes "�@�l������ł���悤���]";
			next;
			mes "�]���������悤�Ƃ�����";
			mes "�@���i�C���ɕ߂܂��Ă��܂����̂�";
			mes "�@�b���͓̂�������]";
			set JTB_1QUE,5;
			close2;
			cutin "lunain02.bmp", 255;
			end;
		case 2:
			misceffect 313, "���G��#11";
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�܂������c�c��w�����āA";
			mes "�����X�^�[�ɂ����݂���!!";
			next;
			cutin "roel04.bmp", 2;
			mes "[���G��]";
			mes "���A�����܂���!!";
			mes "�F����̖��ɗ��Ă�̂�";
			mes "�������Ă��c�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���i�C���B";
			mes "���匾���Ȃ��玡�Â��Ă�B";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "�D�����ł���ˁA";
			mes "���i�C������!!";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "���A���Ⴂ���Ȃ��ł��!!";
			mes "�q��1�l�̐��b��";
			mes "�ł��Ȃ��̂����āA";
			mes "�j���I�[�Y�l��";
			mes "�v��ꂽ���Ȃ�������!!";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�炪�Ԃ��B";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "���A���邳����ˁI";
			mes "�c�c����A������Ƃ��̓��A��";
			mes "����������!!";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���́A�����͓��A����Ȃ�����";
			mes "�����Ă��B";
			next;
			menu "�y���H",-;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���i�C���ƃA�C�O�ɉ�O�ɁA";
			mes "�����ς������B";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "�y������ł����B";
			mes "�l�͂܂�����������Ƃ�";
			mes "�Ȃ��C�����܂��ˁB";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���O�͂Ȃ����Ă�������A";
			mes "���������B";
			next;
			mes "[�V�������V�[]";
			mes "�y���y��������u�y���v�B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���������Ă��̏����������X�^�[�H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���y���������B";
			mes "���񂾂�A�\�ꂽ�肵�Ȃ������B";
			next;
			mes "[�V�������V�[]";
			mes "������F�B�ɂȂ����B";
			mes "�ł��c�c�B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�V�������V�[�͂킩���ĂȂ�";
			mes "�݂��������猾�����ǁB";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�Ƃ͗F�B�ɂȂ�Ȃ��B";
			mes "������͎��B�ɂƂ��ēG��B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�G�H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�G���ĉ��H";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�l�B�ɊQ���Ȃ�����c�c�ł��傤���B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�ȒP�ɂ����ƁA";
			mes "���B�ɒɂ����Ƃ�������";
			mes "���点���肷�鑊��B";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�ƕ��a�I�ɂ��b����";
			mes "���������Ȃ�Ė����B";
			mes "������키�����Ȃ��̂�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�ł��y���́A���ɒɂ����Ƃ�";
			mes "���邱�Ƃ��������ƂȂ��B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���܂ł͂���������";
			mes "��������Ȃ����ǁA";
			mes "���͈Ⴄ�ł���H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���́c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�B";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "���A�������I";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�c�c�؁A�y���y���y���y��!!";
			next;
			menu "���G��!?",-;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "����c�c�Ȃɂ���Ă�̂�!?";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "���c�c����c�c";
			mes "�l���y���̂�����";
			mes "�V�������V�[����̂��F�B�ɂƁc�c�B";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "�Ӂ[��H";
			mes "���Ă��Ƃ́c�c";
			mes "�|�������Ȃ���ˁB";
			next;
			misceffect 85, "���G��#11";
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�y�c�c�y���[!?";
			next;
			cutin "lunain03.bmp", 2;
			mes "[���i�C��]";
			mes "��k��B";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "���A����";
			mes strcharinfo(0) + "�̔Ԃ�B";
			mes "�����ɍ���Ȃ����B";
			next;
			cutin "lunain03.bmp", 255;
			mes "�]�V�������V�[�͉���";
			mes "�@�l������ł���悤���]";
			next;
			mes "�]�Ƃ肠�������͂�����";
			mes "�@���Ă����������������낤�]";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���͗F�B����Ȃ��c�c";
			mes "�ł��c�c�B";
			set JTB_1QUE,5;
			close2;
			cutin "lunain02.bmp", 255;
			end;
		}
	case 5:
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����X�^�[���y�b�g�ɂ���l�����邯��";
		mes "����͗�O�ˁB";
		mes "����ς胂���X�^�[�͊댯��";
		mes "�F�B�ɂ͂Ȃ�Ȃ��̂�B";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	}
}
1@jtb.gat,192,205,5	script	�A�C�O#12	646,{/* 61550 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[�A����Ɖ���́I";
		mes "�����ŗǂ������́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[������ĂȂ��";
		mes "�����Ȃ��́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,201,203,4	script	�A����#12	644,{/* 61551 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�悤�₭�݂�Ȃƍ����ł�����B";
		mes "�ł��A�V�������V�[��";
		mes "�������C�Ȃ������c�c�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "����ȁc�c";
		mes "���������F�B�ɂȂꂻ������";
		mes "�v���Ă��̂Ɂc�c�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,191,204,5	script	���M#12	647,{/* 61552 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�݂Ȃ���Ƃ������ł��܂�����";
		mes "���낻��N���C�}�b�N�X�ł����˂��B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�ޏ��͕ʂ�ۂɈ��";
		mes "����z������ł��傤�˂��B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,192,202,5	script	���i�C��#12	10039,{/* 61553 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,191,200,5	script	���G��#12	10040,{/* 61554 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���i�͉������񂾌����Ă�";
		mes "���e���g�l�ƃj���I�[�Y�l��";
		mes "����ς�e�F�Ȃ�ł��ˁI";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,199,200,4	script	�~���~��#12	643,{/* 61555 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�����̎莆�ɏ悹����";
		mes "�z�C�z�C����ȏ��܂ŗ��āA";
		mes "�������\���l�D����ˁB";
		close2;
		cutin "igu01.bmp", 255;
		end;
	case 6:
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�w�i�D�΂����l�ɂȂ���";
		mes "���e���g���܂��܂��q���ˁB";
		mes "�j���I�[�Y�̎��ɂȂ��";
		mes "�����Ɋ���I�ɓ����񂾂��́B";
		next;
		mes "[�~���~��]";
		mes "���ĂˁA���ꂶ�Ⴀ����";
		mes "�N���݂�������Ȃ��c�c�B";
		mes "���͂܂��܂��Ⴂ�񂾂���";
		mes "���Ⴂ������_����A";
		mes strcharinfo(0) + "�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}
1@jtb.gat,195,206,4	script	�j���I�[�Y#12	625,{/* 61556 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,199,204,4	script	�Q���J#12	629,{/* 61557 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "����������N����n�k����";
		mes "�����̂���������";
		mes "�N�����Ă���悤��";
		mes "�C�����܂��񂩁H";
		next;
		mes "[�Q���J]";
		mes "�n�k���N����x��";
		mes "�܂�Ől�̋C�����݂�����";
		mes "���͋C���ς������A";
		mes "��Ԃ��s����ɂȂ��Ă�";
		mes "�C�������ł��B";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	case 6:
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�m���ɂ��̂܂ܐi�ނ̂�";
		mes "�댯�����m��܂���";
		mes "���͎t����M���܂��I";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�����āA���̎t���Ȃ�ł�����I";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}
1@jtb.gat,189,203,5	script	�����f�B�[�W���b�N#12	844,{/* 61558 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,194,200,5	script	�y��#12a	10047,{/* 61559 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,196,200,5	script	�y��#12b	10047,{/* 61560 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,195,200,5	script	�V�������V�[#12	10041,{/* 61561 (hide)*/
	switch(JTB_1QUE) {
	case 5:
	case 6:
	}
}
1@jtb.gat,198,206,4	script	���e���g#12	630,{/* 61562 (hide)*/
	switch(JTB_1QUE) {
	case 5:
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�����A�݂�ȑ҂āI";
		mes "�����ς����I";
		next;
		cutin "nines01.bmp", 2;
		misceffect 563,"";
		mes "[�j���I�[�Y]";
		mes "����I�@�܂��n�k!?";
		next;
		cutin "nines01.bmp", 255;
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c�܂����ȁB";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "��Ԃ̕��󂪎n�܂��Ă���悤���B";
		next;
		switch(select("�ȒP�Ɍ����m�肽��","�ڍׂɌ����m�肽��")) {
		case 1:
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y�����c�c�{���Ă�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���̋�Ԃƃy���͉���";
			mes "�֌W������̂����H";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���́c�c������邽�߂ɁA";
			mes "�݂�Ȃ��U�������́B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�ǂ��������Ƃ�!?";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c����́c�c�B";
			next;
			emotion 0, "�V�������V�[#12";
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���c�c�H";
			next;
			emotion 6, "�y��#12b";
			mes "[�y��]";
			mes "�y���y���y��!!";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "���������Ă�݂����ł��ˁc�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "����c�c�B";
			mes "�킩�����c�c�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�H";
			mes "�y���͉��Č����Ă���񂾂��H";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�j���I�[�Y�c�c�B";
			mes "�݂�ȁc�c�B";
			next;
			cutin "igu05.bmp", 2;
			mes "[�A�C�O]";
			mes "�ǂ������́H";
			mes "�������߂������Ȋ炵�Ă�́c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "���߂�Ȃ����c�c";
			mes "�΂��΂��c�c�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�I";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "���̃����X�^�[�����܂���I";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "������A�n�k!?";
			misceffect 563,"";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���A�̗l�q������������!!";
			mes "������������o����!!";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c�c�c�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c���e�A�~���~���A�W���b�N�B";
			mes "�݂�Ȃ����肢����ˁB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A���O�܂����c�c!!";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���̎q�ɖ񑩂�������B";
			mes "�̂̉̂����������Ă�������āB";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "������A���̎q���}���ɂ����Ă���ˁB";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�j���I�[�Y�l!!";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c���̃o�J�b!!";
			mes "���O��!!�@�j���I�[�Y��ǂ���!!";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�S���A�C���������߂�I";
			mes "���f����񂶂�˂���!!";
			set JTB_1QUE,6;
			close2;
			cutin "rote03.bmp", 255;
			end;
		}
	case 6:
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�j���I�[�Y�̖�Y�c�c";
		mes "��������Ȏ��΂���";
		mes "���₪���āc�c�B";
		close2;
		cutin "rote03.bmp", 255;
		end;
	}
}
1@jtb.gat,318,358,5	script	�j���I�[�Y#21	625,{/* 61563 */
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����c�c";
	mes strcharinfo(0) + "!?";
	next;
	menu "�o�܂�b��",-;
	mes "[�j���I�[�Y]";
	mes "�Ȃ�قǁB�݂�Ȏ���ǂ���";
	mes "�����Ɍ������Ă���Ă���񂾂ˁB";
	mes "��͂莝�ׂ����̂�";
	mes "�M���h�����o�[���ˁI";
	next;
	mes "[�j���I�[�Y]";
	mes "�ł͎������͐��";
	mes "�V�������V�[��T�����B";
	mes "�����N���邩�킩��Ȃ�����A";
	mes "�퓬���������͖Y�ꂸ�ɂˁB";
	next;
	mes "[�j���I�[�Y]";
	mes "�����������I";
	close2;
	cutin "nines01.bmp", 255;
	end;
}
1@jtb.gat,324,327,4	script	�y��#22	10047,{/* 61564 */
	mes "[�y��]";
	mes "�y���I�@�y���I";
	close;
}
1@jtb.gat,324,327,4	script	�y��#23	10048,{/* 61565 (hide)*/
	mes "[�y��]";
	mes "�y���I�@�y���I";
	close;
}
1@jtb.gat,326,329,4	script	�V�������V�[#22	10041,{/* 61566 */
	cutin "shaloshi03.bmp", 2;
	mes "[�V�������V�[]";
	mes "�ǂ����āc�c�B";
	close2;
	cutin "shaloshi03.bmp", 255;
	end;
}
1@jtb.gat,320,323,5	script	�j���I�[�Y#22	625,{/* 61567 */
	cutin "nines04.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�͂��A�͂��c�c";
	mes "�����A�������ɂ���̂́c�c�I";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���A�������������B";
	mes "�����Ȃł�ƈ��S����񂾂��āB";
	mes "�j���I�[�Y�������Ă��ꂽ�B";
	next;
	cutin "shaloshi02.bmp", 255;
	mes "[�y��]";
	mes "�y���[�B";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y�����������́H";
	mes "���肪�Ƃ��B�ł��A";
	mes "�y���͎���菬�������疳������B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���������B";
	mes "�V�������V�[�̓��𕏂ł�̂́A";
	mes "���B�̓���������ˁB";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�j���I�[�Y�c�c";
	mes strcharinfo(0) + "�c�c";
	mes "�ǂ����āc�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�V�������V�[�A";
	mes "�N�Ƃ����Ƙb���������ĂˁB";
	next;
	mes "[�j���I�[�Y]";
	mes "���݂̂�Ȃ���������";
	mes "�������Ă�݂����Ȃ񂾂��ǁA";
	mes "�܂������Ă�̂��ȁH";
	mes "�����͖����₷���݂���������ˁB";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�����₷���c�c";
	mes "�݂�Ȃ�����Ȃ��̂�";
	mes "���̂�����������Ȃ��B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�V�������V�[�B";
	mes "���̂����������āA�ǂ������c�c";
	next;
	cutin "nines01.bmp", 255;
	mes "[�y��]";
	mes "�y�������������c�c";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���H";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���A���͑��v�B";
	mes "������c�c";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�c�c�y���͂Ȃ�āH";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "����A�ꋎ�낤�Ƃ���l�Ԃ�";
	mes "�����Ȃ����āc�c";
	mes "�c�c�y���H";
	next;
	cutin "shaloshi01.bmp", 255;
	mes "[�y��]";
	mes "�y���y���I�y���y��!!";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�ǂ����悤�c�c";
	mes "�y���̗͂����܂��Ă����c�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�y���A���������񂾁B";
	mes "���͌N�̗F�B��D�����肵�Ȃ���B";
	mes "���������V�������V�[�Ɓc�c�B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���c�c���肢�c�c";
	mes "�b�𕷂��āc�c�B";
	next;
	cutin "shaloshi01.bmp", 255;
	mes "[�y��]";
	mes "�y���y���A�y���y���A�y���I";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�y���̎p���c�c!!";
	mes "�c�c�ӂ��B�ǂ����A";
	mes "�����������Ȃ����Ċ������ˁB";
	mes "�d���Ȃ��A�킨���B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�ł��c�c";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�j���I�[�Y�c�c";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "����c�c�M����c�c";
	mes "������A�y�����~�߂āc�c�I";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�����I�@�������ɔC���āI";
	close2;
	cutin "nines03.bmp", 255;
	end;
}

1@jtb.gat,10,10,0	script	�{�X#22	139,{/* 61568 (hide)*/}
1@jtb.gat,320,323,5	script	�j���I�[�Y#boss	625,{/* 61569 (hide)*/}
1@jtb.gat,328,326,4	script	���e���g#23	630,{/* 61570 (hide)*/
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���O��I�@�������������c�c�B";
	mes "�S�z�����₪���āI";
	close2;
	cutin "rote01.bmp", 255;
	end;
}
1@jtb.gat,330,328,4	script	�Q���J#23	629,{/* 61571 (hide)*/
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "����Ȃɋ������ȃ����X�^�[��";
	mes "�|���Ă��܂��Ȃ�āA";
	mes strcharinfo(0) + "�������";
	mes "����������ł��ˁI";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}
1@jtb.gat,329,323,4	script	�~���~��#23	643,{/* 61572 (hide)*/
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���Ȃ��A���\���̂ˁB";
	mes "������ȃ��e���g�ɕς����";
	mes "���������B";
	mes "�j���I�[�Y�������Ă����";
	mes "���肪�Ƃ��B";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}
1@jtb.gat,317,325,5	script	�A�C�O#23	646,{/* 61573 (hide)*/
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "���̃����X�^�[�c�c";
	mes "���ł���ȂɃV�������V�[�̎���";
	mes "��낤�Ƃ��Ă��񂾂낤�c�c�B";
	close2;
	cutin "igu01.bmp", 255;
	end;
}
1@jtb.gat,316,322,5	script	���M#23	647,{/* 61574 (hide)*/
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�������ł������B";
	mes "���̃����X�^�[�̏o�����F�c�c";
	mes "�����ƁA�V�������V�[����낤��";
	mes "�K����������ł��傤�˂��B";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}
1@jtb.gat,319,320,5	script	�A����#23	644,{/* 61575 (hide)*/
	cutin "arang02.bmp", 2;
	mes "[�A����]";
	mes "���������������Ŋi�D�ǂ�";
	mes "�����X�^�[�������ˁI";
	mes "����Ȃ̂�|�����Ⴄ�Ȃ��";
	mes strcharinfo(0) + "��";
	mes "�����Ȃ��I";
	close2;
	cutin "arang01.bmp", 255;
	end;
}
1@jtb.gat,319,328,5	script	���i�C��#23	10039,{/* 61576 (hide)*/
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "���A���\��邶��Ȃ��B";
	mes "���́A����Ƃ����ĂȂ��H";
	mes "�j���I�[�Y�l�̎��Ȃ�";
	mes "�q�[�����Ă�������B";
	close2;
	cutin "lunain01.bmp", 255;
	end;
}
1@jtb.gat,325,321,4	script	���G��#23	10040,{/* 61577 (hide)*/
	cutin "roel04.bmp", 2;
	mes "[���G��]";
	mes "�������ł������I";
	mes "�����Ƃ������ɂ����ɗ��Ă�";
	mes "�\���󂠂�܂���!!";
	close2;
	cutin "roel01.bmp", 255;
	end;
}
1@jtb.gat,322,321,4	script	�����f�B�[�W���b�N#23	844,{/* 61578 (hide)*/}
1@jtb.gat,324,327,4	script	�y��#25	10047,{/* 61579 (hide)*/
	mes "[�y��]";
	mes "�y�������c�c�B";
	close;
}
1@jtb.gat,326,329,4	script	�V�������V�[#23	10041,{/* 61580 (hide)*/
	cutin "shaloshi03.bmp", 2;
	mes "[�V�������V�[]";
	mes "�݂�ȁc�c�B";
	close2;
	cutin "shaloshi03.bmp", 255;
	end;
}
1@jtb.gat,320,323,5	script	�j���I�[�Y#23	625,{/* 61581 (hide)*/
	menu "��b������",-;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�ӂ��A�����Ԃ�ƃ^�t�������ˁB";
	mes "����ŏ����͑�l�����Ȃ邩�ȁH";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "����ƌ������c�c!!";
	mes "���O��A���v��!!";
	next;
	switch(select("�ȒP�ɘb�𕷂�����","�ڂ����b�𕷂�����")) {
	case 1:
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�Ƃ肠������������o�܂��傤�B";
		mes "�b�͂��ꂩ���B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����A�������ȁB";
		mes "�������o������������˂��B";
		mes "�����Ɍ���������񂶂�Ȃ����H";
		next;
		cutin "rote01.bmp", 255;
		mes "�]�߂������ɘb���o���V�������V�[�B";
		mes "�@�V�������V�[�̘b����A";
		mes "�@�ޏ��͖��������N�ɍ��ꂽ";
		mes "�@�g�k�ł��邱�Ƃ����o�����]";
		next;
		mes "�]�j���I�[�Y�́A�V�������V�[��";
		mes "�@���H�M���h�Ɍ}���悤�ƒ�Ă��邪�A";
		mes "�@�M���h�����o�[�̔�����";
		mes "�@���ɗ₽�����̂������]";
		next;
		mes "�]�����Ɍ�����ꂽ�����̈Ӗ���";
		mes "�@�@�����V�������V�[��";
		mes "�@�������ɏ����Ă��܂����c�c�]";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c";
		next;
		mes "[���e���g]";
		mes "�`�b�c�c";
		mes "���O��A�������ƋA�邼�I";
		mes "��������B";
		close2;
		warp "1@jtb.gat",360,23;
		end;
	case 2:
		cutin "rote01.bmp", 255;
		mes "[�����f�B�[�W���b�N]";
		mes "���̃����X�^�[�A";
		mes "�������Ă������肩�H";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����œ|���ˁ[�ƁA";
		mes "�܂��P���Ă��邩���m��Ȃ����B";
		mes "�Ȃ�Ȃ�ޖ��E��̈����ƌĂ΂��";
		mes "���̗͂������Ă�낤���B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�_���I�@�y���͎��̗F�B�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[�c�c�B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�����͎��ׂ̈�";
		mes "�y��������Ă��ꂽ��ԁc�c�B";
		mes "�y�����\��������A�������";
		mes "���̋�Ԃ������ĂȂ��Ȃ�B";
		mes "�����ɂ���S�����܂߂āB";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����̂��肩�c�c!!";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�Ƃ肠������������o�܂��傤�B";
		mes "�b�͂��ꂩ���B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����A�������ȁB";
		mes "�������o������������˂��B";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "���炭�����ǁA";
		mes "���̋�Ԃ���E�o�ł��Ȃ�������";
		mes "���̎q�ɂ���񂶂�Ȃ�������H";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�ǂ��������ƁH";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "���̋�Ԃ̓y�̏�Ԃ𒲂ׂ��Ƃ��ɁA";
		mes "���󂵂������N�̊X�Ɠ������͂�";
		mes "���͂Ȃ��犴������B";
		next;
		mes "[�~���~��]";
		mes "�����đ�������n�k�B";
		mes "���̎q���s�������ɂ��Ă�����";
		mes "����V�����肵������";
		mes "�N�����Ă����悤�Ɍ������B";
		next;
		mes "[�~���~��]";
		mes "���̋�ԁA���Ȃ��̐��_�c�c";
		mes "�C�����Ƀ����N���Ă�񂶂�Ȃ��H";
		mes "�������ɋA���Ăق����Ȃ��A";
		mes "���Ȃ��������v���Ă邩��";
		mes "�o���������񂶂�Ȃ��̂�����B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�B";
		next;
		mes "[�V�������V�[]";
		mes "���͂����F�B���~�������������B";
		mes "�݂�Ȃ�����߂����Ȃ��";
		mes "�Ȃ������c�c�B";
		next;
		mes "[�V�������V�[]";
		mes "�ł��A�o���������Ă��܂����B";
		mes "�݂�Ȃɖ��f�������c�c�B";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "��Ԃ����R�Ɏx�z����͂Ȃ�āc�c�B";
		mes "�����Ă��̖��͂̊����c�c";
		mes "���Ȃ��A��̉��҂Ȃ́H";
		mes "���ꂾ���L�����߂��Ă���悤�Ȃ�";
		mes "�����ł�����ˁH";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���́c�c";
		next;
		mes "[�V�������V�[]";
		mes "���͎����̋��ԂŐ��܂ꂽ�����B";
		mes "���������N�ɍ��ꂽ";
		mes "��O�̎g�k�A�V�������V�[�B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�����A�����Č������I";
		mes "�����N����!?";
		next;
		cutin "rote03.bmp", 255;
		mes "[�����f�B�[�W���b�N]";
		mes "���������N�ɍ��ꂽ���݁B";
		mes "�������߁A�����̖��ƌ������Ƃ��납�B";
		mes "�c�c�Ȃ�قǁB";
		mes "����ŉ��������͂��������̂��B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�ǂ��������Ƃ�A����c�c�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���������N�̎g�k�c�c!?";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "����ς肱���A�����Łc�c�I";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "����͍���܂����˂��B";
		mes "�V�������V�[�Ɛ키���R��";
		mes "�ł��Ă��܂��܂����c�c�B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�ł��A���S���āB";
		mes "���͍��A�����N�Ƃ̌q����͂Ȃ��B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�q����͂Ȃ����āc�c";
		mes "�ǂ������������H";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���������N���|���ꂽ�B";
		mes "������A�����N�Ƃ̌q���肪";
		mes "�Ȃ��Ȃ����B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���Q�ڂ������ƌ����Ă₪��I";
		mes "����Șb�����ĂȂ����I";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���̋�Ԃ͊O�Ƃ͎��Ԃ̗��ꂪ�Ⴄ�B";
		mes "�݂�ȂɂƂ��Ă͉ߋ������m��Ȃ���";
		mes "������������Ȃ��B";
		mes "���������N��|�����̂����āc�c�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�V�������V�[�͈�u";
		mes "�@������ɖڂ�������ƁA";
		mes "�@�����Ɏ�����߂����]";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c������A���͎��R�̐g�B";
		mes "�ł��A�������������Ď�����";
		mes "�ς��Ȃ��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���͈���������c�c";
		mes "�ꏏ�ɋ����Ⴂ���Ȃ����āc�c";
		mes "�����v���āc�c������c�c�B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�V�������V�[�����c�c";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�˂��A���e�A�݂�ȁB";
		next;
		mes "[�j���I�[�Y]";
		mes "�c�c���͈������Ƃ��֌W�Ȃ��A";
		mes "���̃V�������V�[���D�������A";
		mes "���ꂩ����͂ɂȂ��Ă��������񂾁B";
		next;
		mes "[�j���I�[�Y]";
		mes "������c�c���̓V�������V�[��";
		mes "���H�M���h�Ɍ}�����ꂽ���B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�j���I�[�Y�A���O�c�c";
		mes "���������������Ă��邩�A";
		mes "�킩���Ă�̂�!?";
		next;
		mes "[���e���g]";
		mes "�����͈������B";
		mes "���O�͂������A";
		mes "��������������Ȃ�����";
		mes "�ۏ؂ł���̂��H";
		next;
		mes "[���e���g]";
		mes "�����N�̗͂��������āA";
		mes "����������������Ȃ����ĕۏ؂́H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�c�c�����S���A�ӔC������B";
		mes "������V�������V�[���c�c";
		next;
		cutin "nines01.bmp", 255;
		mes "[�����f�B�[�W���b�N]";
		mes "�ň��̎��Ԃ�z�肵�Ă݂�B";
		mes "���O�̐ӔC������";
		mes "�ςޖ��ł͂Ȃ����낤�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�W���b�N�c�c";
		mes "�ŁA�ł��A���݂̂�Ȃ������Ɓc�c";
		next;
		cutin "nines01.bmp", 255;
		mes "�]�����ĉ������������Ƃ���";
		mes "�@�j���I�[�Y���Ղ邩�̂悤��";
		mes "�@�V�������V�[�������J�����]";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�j���I�[�Y�A���肪�Ƃ��B";
		mes "�c�c�ł��B";
		next;
		mes "[�V�������V�[]";
		mes "���́A�����_�l��";
		mes "���肢�������Ă�������悤��";
		mes "���x�̓y���̖������Ȃ��Ă��������́B";
		mes "����͎��ɂ����o���Ȃ��c�c�B";
		next;
		mes "[�V�������V�[]";
		mes "�y���̖��c�c�B";
		mes "����͎��ƒN�ɂ��ז����ꂸ��";
		mes "�ꏏ�ɋ��������Č����Ă�B";
		mes "������c�c���߂�B���c�c�s���ˁB";
		next;
		mes "[�V�������V�[]";
		mes strcharinfo(0) + "���A";
		mes "�݂�Ȃ��c�c�B";
		mes "���ǂ����Ă���Ă��肪�Ƃ��c�c�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]������������V�������V�[�̊炪";
		mes "�@�ƂĂ��₵���Ɍ������]";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�V�������V�[�c�c";
		mes "����Ȕ߂����������Ȃ�āA";
		mes "���͌�����c�c�B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���߂�Ȃ����c�c";
		mes "�c�c�΂��΂��B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c";
		next;
		mes "[���e���g]";
		mes "�`�b�c�c";
		mes "���O��A�������ƋA�邼�I";
		mes "��������B";
		close2;
		warp "1@jtb.gat",360,23;
		end;
	}
}
1@jtb.gat,368,21,5	script	���e���g#end	630,{/* 61582 */
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���͗Վ��̃M���h�����o�[";
	mes "�����m��˂����A";
	mes "�撣������ǂ������邩���ȁB";
	close2;
	cutin "rote01.bmp", 255;
	end;
}
1@jtb.gat,366,20,5	script	�Q���J#end	629,{/* 61583 */
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�����Ƌ����Ȃ�܂��B";
	mes "�C�s���撣��Ȃ��ƁI";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}
1@jtb.gat,375,18,4	script	�A�C�O#end	646,{/* 61584 */
	cutin "igu03.bmp", 2;
	mes "[�A�C�O]";
	mes "�����l�Ȃ́I";
	mes "�݂�Ȗ����ł悩�����́B";
	close2;
	cutin "igu01.bmp", 255;
	end;
}
1@jtb.gat,364,18,5	script	�~���~��#end	643,{/* 61585 */
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���������ĂƎv����";
	mes "�V�������V�[�̔��̖т�";
	mes "���{���̎悵�Ă�������B";
	mes "�܂��͌����͂��Ă݂Ȃ��ƁB";
	next;
	emotion 29, "�~���~��#end";
	mes "[�~���~��]";
	mes "�����ɂ͂܂�";
	mes "�������Ȃ��Ⴂ���Ȃ����̂�";
	mes "�������񂠂��ˁB";
	close2;
	cutin "min01.bmp", 255;
	end;
}
1@jtb.gat,373,25,3	script	���M#end	647,{/* 61586 */
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�S��ǂ߂�Ƃ����̂�";
	mes "���Əꍇ�ɂ�肯��A�ł��˂��B";
	mes "�l�ɂ͂���ȗ͂��Ȃ��āA";
	mes "�ǂ������Ǝv���܂���B";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}
1@jtb.gat,370,26,5	script	�A����#end	644,{/* 61587 */
	cutin "arang03.bmp", 2;
	mes "[�A����]";
	mes "���G���ƗF�B�ɂȂ�����I";
	close2;
	cutin "arang03.bmp", 255;
	end;
}
1@jtb.gat,373,16,3	script	���i�C��#end	10039,{/* 61588 */
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "���̎q���������āc�c";
	mes "�ȁA�Ȃ�ł��Ȃ���B";
	mes "���΂ɔ�ꂽ���A";
	mes "�����A���ċx�݂�����c�c�B";
	close2;
	cutin "lunain03.bmp", 255;
	end;
}
1@jtb.gat,376,23,3	script	���G��#end	10040,{/* 61589 */
	cutin "roel03.bmp", 2;
	mes "[���G��]";
	mes "�A�����ƗF�B�ɂȂ�܂����I";
	mes "���x�A�ꏏ�Ƀ_���W������";
	mes "�`�����ɍs����ł���I";
	close2;
	cutin "roel01.bmp", 255;
	end;
}
1@jtb.gat,367,13,5	script	�����f�B�[�W���b�N#end_	844,{/* 61590 */
	mes "[�����f�B�[�W���b�N]";
	mes "�B��Ă���̂����琺��������ȁI";
	mes "�܂������c�c�B";
	mes "�B��Ă���҂�������̂ɂ�";
	mes "����Ȃ�̏C�Ƃ��K�v���Ƃ����̂ɁB";
	mes "�c�c���O�͑債���z���ȁB";
	close;
}
1@jtb.gat,372,22,4	script	�j���I�[�Y#end	625,{/* 61591 */
	menu "��b������",-;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�݂�ȁA�ЂƂ܂������l�B";
	mes "���낢�날�����ゾ���A����";
	mes "�����ŋx�e���ċA�낤�B";
	next;
	cutin "rote01.bmp", 2;
	emotion 36, "���e���g#end";
	mes "[���e���g]";
	mes "��������c�c";
	mes "�j���I�[�Y!!";
	mes "���O�������͂悭��";
	mes "����Ɂu���H�M���h�v�Ƃ�";
	mes "�����₪�����ȁI";
	next;
	cutin "nines04.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�����H";
	mes "�M���h�}�X�^�[�͕ς�������ǁc�c";
	mes "�����M���h���܂ŕύX�����̂����H";
	next;
	cutin "rote01.bmp", 2;
	emotion 32, "���e���g#end";
	mes "[���e���g]";
	mes "�M���h�}�X�^�[���ς�����񂾁I";
	mes "�M���h�����ς���̂��A���ʂ���I";
	mes "���́c�c���`��B";
	mes "�A�����I�@���̖��O�c�c�B";
	next;
	emotion 54, "�~���~��#end";
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�V�������O���v�����Ȃ��Ȃ�A";
	mes "���̂܂܂ɂ���΁H";
	next;
	emotion 52, "���e���g#end";
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "����Ȃ��Ƃ͂ł��邩�I";
	mes "�����M���h�}�X�^�[�����ȁB";
	next;
	mes "[���e���g]";
	mes "�����A������!!";
	mes "���ꂩ���";
	mes "�u���e���g�̒��K�E�M���h�v���I";
	emotion 40, "���e���g#end";
	next;
	emotion 57, "�A�C�O#end";
	cutin "igu05.bmp", 2;
	mes "[�A�C�O]";
	mes "�ςȖ��O�A�Ȃ́B";
	next;
	cutin "gelca03.bmp", 2;
	mes "[�Q���J]";
	mes "�t���炵���M���h���ł����!!";
	next;
	cutin "roel04.bmp", 2;
	mes "[���G��]";
	mes "���A���I�ł��ˁc�c�B";
	next;
	cutin "lunain04.bmp", 2;
	mes "[���i�C��]";
	mes "������_�T�b�I";
	next;
	cutin "rote01.bmp", 2;
	emotion 36, "���e���g#end";
	mes "[���e���g]";
	mes "���邹�[!!";
	mes "�M���h�}�X�^�[�͉����I";
	mes "���茠�͉��ɂ���I";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "�c�c�i�D�����B";
	next;
	emotion 29, "�~���~��#end";
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "���̖��O�Ō�����Ă����Ȃ�";
	mes "���̓M���h��E�ނ����B";
	mes "����Ȗ��O�A����肽���Ȃ����́B";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�Ȃ񂾂ƁI";
	emotion 23, "���e���g#end";
	next;
	cutin "min02.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "���͌��X�M���h�����o�[�ł͂Ȃ����ȁB";
	mes "�D���ɂ����ĖႤ���B";
	emotion 9, "�����f�B�[�W���b�N#end_";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "����Ȓp���������M���h������";
	mes "�ǂ��ɍs���Ă��ڗ����܂��˂��B";
	mes "���̂����ŃA�C�O�l�̐l�C�ɂ�";
	mes "�ςȉe�����o�Ȃ��Ɨǂ��ł����B";
	next;
	cutin "igu02.bmp", 2;
	mes "[�A�C�O]";
	mes "���͂́A���v�Ȃ́B";
	mes "�����c�c�B";
	emotion 14, "�A�C�O#end";
	next;
	cutin "lunain04.bmp", 2;
	mes "[���i�C��]";
	mes "���H�M���h�̕���";
	mes "������₷�����A�����";
	mes "�j���I�[�Y�l�̃Z���X��";
	mes "���閼�O�ŗǂ������̂ɁB";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�ł��܂��c�c";
	mes "����Ȗ��O�ɂȂ�Ȃ�";
	mes "���̎q������Ȃ���";
	mes "����Ӗ��A���������������ˁc�c�B";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���O��c�c";
	mes "�D�����茾���₪���āI";
	mes "�Ƃɂ��������͔�ꂽ������U���邼�I";
	mes "���e���g�̒��K�E�M���h�̖`���I���I";
	close2;
	cutin "rote01.bmp", 255;
	end;
cutin "nines01.bmp", 2;
mes "[�j���I�[�Y]";
mes "�₠�A�N���B���傤�ǂ悩�����I";
mes "���͂�����Ƙb���������Ƃ�";
mes "����񂾂��ǁc�c�B";
mes "�悩�����畷���Ă���Ȃ����ȁH";
next;
if(select("�͂�","������") == 2) {
	mes "[�j���I�[�Y]";
	mes "�c�O���Ȃ��c�c�B";
	mes "�C���ς������ł�������";
	mes "���������Ă����Ɗ������ȁB";
	close2;
	cutin "nines01.bmp", 255;
	end;
}
cutin "nines02.bmp", 2;
mes "[�j���I�[�Y]";
mes "�{������!?";
mes "���ꂶ�Ⴀ�A�ꏊ���ړ����悤���B";
mes "����������B";
close2;
warp "1@jtb.gat",13,274;
end;
}
1@jtb.gat,36,289,3	script	���M#15	647,{/* 61609 */
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes strcharinfo(0) + "����A";
	mes "�����l�ł��B";
	mes "�l���j���I�[�Y�l�ɌĂ΂��";
	mes "�����̂ł����A";
	mes "��������̂ł��傤���B";
	close2;
	cutin "ragi01.bmp", 255;
	end;
cutin "ragi01.bmp", 2;
mes "[���M]";
mes "�f���炵���Ȃ��ł��܂����ˁB";
mes "�A�C�O�l�̃_���X��";
mes "�ƂĂ��y���݂ł��˂��B";
close;
cutin "ragi01.bmp", 255;
}
1@jtb.gat,34,291,3	script	�j���I�[�Y#15	625,{/* 61610 */
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�₠�₠�A���M�N�A";
	mes strcharinfo(0) + "�B";
	mes "����ȂƂ���ɌĂяo���Ă��߂�ˁ`�B";
	mes "���͓�l�ɂ��肢������񂾁B";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�Ȃ�ł��傤�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����̖`�����Ȃɂ��������Ă��B";
	mes "�`���҂͖`���L���������肷�邾�낤�H";
	mes "���͂�������y�Ŏc���̂��D���Ȃ񂾁B";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "����͑f���炵���ł��˂��B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����łˁA��l��";
	mes "�ȍ��̂���`�������ė~�����񂾁`�B";
	mes "�ǂ����ȁH";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�l�͍\��Ȃ��ł���B";
	mes "�j���I�[�Y�l�Ƃ�����艹�y�ɂ���";
	mes "���b�������������Ƃ���ł����B";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���M�N�I�@���肪�Ƃ��`�I";
	mes strcharinfo(0) + "��";
	mes "�ǂ��H�@���肢�ł���H";
	next;
	menu "��`��",-;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "������`�I�@���肪�Ƃ��I";
	mes "�������������ǁA";
	mes "�ǂ�ȋȂɂ����炢���Ǝv���H";
	next;
	select("���邢��","�Â���","��������")
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���邢�Ȃ��I�@�����ˁI";
	mes "�`���͊y�������̂�����ˁI";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "allegramente�c�c�����ł��˂��B";
	mes "���H�M���h�ɂ҂�����ł��ˁB";
	next;
	menu "�A���O�������e�H",-;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�͂��Ballegramente�Ƃ�";
	mes "���y�p���";
	mes "���邭�A�y�����Ƃ����Ӗ��ł��B";
	next;
	menu "�Ȃ�ق�",-;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�悵�A�M���h�ɂ悭������";
	mes "���邢�Ȃɂ��悤�I";
	mes "���₩�ȃ����o�[�ɕ����Ȃ��A";
	mes "���C�ȋȂɂ��Ȃ��ƂˁI";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����A����I�@�C���[�W���N���Ă����I";
	mes "�����f�B��������ł����`�I";
	mes "���ꂩ�玄�͋Ȃ���邩��A";
	mes "���M�N�A���t����`���āI";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�킩��܂����B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes strcharinfo(0) + "�ɂ�";
	mes "�̎����l���ė~�����ȁB";
	mes "���̎��ɏ����Ă��ꂽ��A";
	mes "�Ȃƍ��킹���B";
	next;
	cutin "nines01.bmp", 255;
	mes "�]���ƃy�����󂯎�����]";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���񂾂�`�I";
	mes "�����A���M�N�B";
	mes "���B������΂낤�I";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�͂��B";
	next;
	cutin "ragi01.bmp", 255;
	mes "�]���������󂯎��������";
	mes "�@�v�����̎��������Ă݂悤�B";
	mes "�@�ŏ��͉������������]";
	set '@str$[1],"�V�������V�[�̎�","�j���I�[�Y�̎�","�����̎�";
	while(1) {
		next;
		switch('@succsess) {
		case 0:
			switch(select('@str$[1],'@str$[2],'@str$[3])) {
			case 1:
				mes "[" + strcharinfo(0) + "]";
				mes "�_���W�����ŏo�������̏����c�c";
				mes "�����̖��A�V�������V�[�c�c";
				mes "�ޏ��͗F�B���ق��������c�c";
				set '@song[1],1;
				set '@str$[1],"";
				break;
			case 2:
				mes "[" + strcharinfo(0) + "]";
				mes "���������ȑO�}�X�^�[�c�c";
				mes "�~���X�g�����̃j���I�[�Y�c�c";
				mes "�ނƒ��Ԃ̖`���L�c�c";
				set '@song[1],2;
				set '@str$[2],"";
				break;
			case 3:
				mes "[" + strcharinfo(0) + "]";
				mes "�Վ��œ��������H�M���h�c�c";
				mes "�`����" + strcharinfo(0) + "�c�c";
				mes "�V�����`���̎n�܂�c�c";
				set '@song[1],3;
				set '@str$[3],"";
				break;
			}
			next;
			mes "�]���ɂ��邷���";
			mes "�@�v���������t�������Ă����B";
			mes "�@���͉������������]";
			set '@succsess,'@succsess + 1;
			continue;
		case 1:
			switch(select('@str$[1],'@str$[2],'@str$[3])) {
			case 1:
				mes "[" + strcharinfo(0) + "]";
				mes "�_���W�����ŏo�������̏����c�c";
				mes "�����̖��A�V�������V�[�c�c";
				mes "�ޏ��͗F�B���ق��������c�c";
				set '@song[2],1;
				set '@str$[1],"";
				break;
			case 2:
				mes "[" + strcharinfo(0) + "]";
				mes "���������ȑO�}�X�^�[�c�c";
				mes "�~���X�g�����̃j���I�[�Y�c�c";
				mes "�ނƒ��Ԃ̖`���L�c�c";
				set '@song[2],2;
				set '@str$[2],"";
				break;
			case 3:
				mes "[" + strcharinfo(0) + "]";
				mes "�Վ��œ��������H�M���h�c�c";
				mes "�`����" + strcharinfo(0) + "�c�c";
				mes "�V�����`���̎n�܂�c�c";
				set '@song[2],3;
				set '@str$[3],"";
				break;
			}
			next;
			mes "�]���ɂ��邷���";
			mes "�@�v���������t�������Ă����B";
			mes "�@�Ō�̕��͂��������]";
			set '@succsess,'@succsess + 1;
			continue;
		case 2:
			switch(select('@str$[1],'@str$[2],'@str$[3])) {
			case 1:
				mes "[" + strcharinfo(0) + "]";
				mes "�_���W�����ŏo�������̏����c�c";
				mes "�����̖��A�V�������V�[�c�c";
				mes "�ޏ��͗F�B���ق��������c�c";
				set '@song[3],1;
				set '@str$[1],"";
				break;
			case 2:
				mes "[" + strcharinfo(0) + "]";
				mes "���������ȑO�}�X�^�[�c�c";
				mes "�~���X�g�����̃j���I�[�Y�c�c";
				mes "�ނƒ��Ԃ̖`���L�c�c";
				set '@song[3],2;
				set '@str$[2],"";
				break;
			case 3:
				mes "[" + strcharinfo(0) + "]";
				mes "�Վ��œ��������H�M���h�c�c";
				mes "�`����" + strcharinfo(0) + "�c�c";
				mes "�V�����`���̎n�܂�c�c";
				set '@song[3],3;
				set '@str$[3],"";
				break;
			}
			next;
			mes "�]���ɂ��邷���";
			mes "�@�v���������t�������Ă����B";
			mes "�@�̎����o���オ�����]";
			set '@succsess,'@succsess + 1;
			continue;
		case 3:
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes strcharinfo(0) + "�`�I";
			mes "�Ȃ��ł�����`�I";
			mes strcharinfo(0) + "��";
			mes "�ł��������H";
			next;
			menu "�ł���",-;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�������I�@�����Č����āI";
			mes "�ǂ�ǂ�c�c";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c";
			mes "�c�c�c�c";
			next;
			cutin "nines02.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�����ˁ`�I�@���΂炵��!!";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�����A���M�N�I";
			mes "���B������������f�B�[�ɏ悹��";
			mes "�̂��Ă݂悤����Ȃ����I";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�͂��B����ł͉��t���n�߂܂��B";
			next;
			cutin "ragi02.bmp", 2;
			mes "[���M]";
			mes "���`�����`���`";
			mes "���H�M���h�̕���`";
			mes "�����Ȗ`���̕���`";
			for(set '@i,1; '@i<=3; set '@i,'@i+1) {
				next;
				switch('@song['@i]) {
				case 1:
					cutin "nines02.bmp", 2;
					mes "[�j���I�[�Y]";
					mes "�_���W�����ŏo�������̏����`";
					mes "�����̖��A�V�������V�[�`";
					mes "�ޏ��͗F�B���ق��������`";
					break;
				case 2:
					cutin "nines02.bmp", 2;
					mes "[�j���I�[�Y]";
					mes "���������ȑO�}�X�^�[�`";
					mes "�~���X�g�����̃j���I�[�Y�`";
					mes "�ނƒ��Ԃ̖`���L�`";
					break;
				case 3:
					cutin "nines02.bmp", 2;
					mes "[�j���I�[�Y]";
					mes "�Վ��œ��������H�M���h�`";
					mes "�`����" + strcharinfo(0) + "�`";
					mes "�V�����`���̎n�܂�`";
					break;
				}
			}
			next;
			cutin "ragi02.bmp", 2;
			mes "[���M]";
			mes "�������Ėl��͂܂�������";
			mes "���ԂƖ`�����J��Ԃ��`";
			mes "���`�����`���`";
			mes "���H�M���h�̕���`";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c�ӂ��B";
			mes strcharinfo(0) + "�A";
			mes "�ǂ����ȁH";
			next;
			menu "�����ˁI",-;
			cutin "nines02.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�{�������H�@�������ȁI";
			mes "�����f���炵���Ǝv����I";
			mes "�ƂĂ��ǂ��Ȃ��ł����B";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�l���A�j���I�[�Y�l��";
			mes strcharinfo(0) + "�����";
			mes "���삪���Ċ������ł��B";
			mes "���肪�Ƃ��������܂��B";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���񂤂�A����";
			mes "3�l�ł���ȗǂ��Ȃ�����";
			mes "�喞������`!!";
			next;
			mes "[�j���I�[�Y]";
			mes strcharinfo(0) + "�A";
			mes "���M�N�A���肪�Ƃ��I";
			next;
			mes "[�j���I�[�Y]";
			mes "�����A��������";
			mes "�݂�Ȃɂ���I�ڂ��Ă��悤�I";
			mes "�A�C�O�ɂ��x���Ă����Ȃ��Ɓ`�I";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�l���������܂��B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�߂��Ă�����V�������V�[�ɂ�";
			mes "�������Ă����Ȃ��ƂˁI";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�����ł��ˁB";
			mes "���̎��͑S���ŉ̂���悤��";
			mes "�݂�ȂɊo���Ă����Ȃ���";
			mes "�����܂���˂��B";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�������ˁ`�I";
			mes "�Ƃ��Ă��y���݂��I";
			close2;
			cutin "nines01.bmp", 255;
			setquest 116500;
			compquest 116500;
			end;
		}
	}
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�f�G�ȋȂ��ł��Ċ������ȁB";
	close2;
	cutin "nines01.bmp", 255;
	end;
}

1@jtb.gat,45,47,0	warp	1�ԕ����o��	2,2,1@jtb.gat,100,14
1@jtb.gat,135,17,0	warp	2�ԕ����o��	2,2,1@jtb.gat,184,17
1@jtb.gat,220,23,0	warp	3�ԕ����o��	2,2,1@jtb.gat,183,128
1@jtb.gat,209,133,0	warp	7�ԕ����o��	2,2,1@jtb.gat,277,95
1@jtb.gat,307,122,0	warp	8�ԕ����o��	2,2,1@jtb.gat,359,97
1@jtb.gat,386,133,0	warp	9�ԕ����o��	2,2,1@jtb.gat,13,214
1@jtb.gat,49,196,0	warp	10�ԕ����o��	2,2,1@jtb.gat,95,201
1@jtb.gat,133,197,0	script	11�ԕ����o��	45,{/* 61603 (hide)*/
	mes "�]����܂ł̐퓬�œ���";
	mes "�@�o�����炾�낤���A";
	mes "�@���������ł����C������B�]";
	close2;
	setquest 116509;
	compquest 116509;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 0,1000000;
	getexp 0,1000000;
	warp "1@jtb.gat",181,198;
	end;
}
1@jtb.gat,218,203,0	warp	12�ԕ����o��	2,2,1@jtb.gat,287,355
1@jtb.gat,311,358,0	warp	�g���l�������o��	2,2,1@jtb.gat,335,320
1@jtb.gat,10,10,0	script	22�ԕ����o��	139,{/* 61606 (hide)*/}
1@jtb.gat,391,30,0	script	23�ԕ����o��	45,{/* 61607 */
	{
		mes "�]�N���̐�����������]";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���M�N�A������Ƃ��������H";
		next;
		cutin "ragi03.bmp", 2;
		mes "[���M]";
		mes "�Ȃ�ł��傤���H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���͌N�ɂ��肢������񂾁B";
		mes "���̌�A��������";
		mes "�t�������Ă���Ȃ����ȁH";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�����A�\���܂����B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes strcharinfo(0) + "�ɂ�";
		mes "�b���������񂾂���";
		mes "�ǂ��ɂ��邩�ȁ`�c�c�B";
		next;
		cutin "nines01.bmp", 255;
		mes "�]�j���I�[�Y���������k�������悤���B";
		mes "�@�ڂ����b�𕷂��ׂ����낤���H�]";
		next;
		if(select("�b�𕷂��ɍs��","�b�𕷂��ɍs���Ȃ�") == 1) {
			mes "�]�j���I�[�Y�̏��֍s���Ă݂悤�]";
			close;
		}
		//
	}
	mes "�]��������_���W�����̊O��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	delquest 13181;
	setquest 13183;
	compquest 13183;
	setquest 116508;
	compquest 116508;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 1000000,0;
	getexp 0,1000000;
	getexp 0,1000000;
	getexp 0,500000;
	getitem 6719, 1;
	warp "moc_para01.gat",30,88;
	end;
}
1@jtb.gat,24,304,0	script	#����15�ԕ����o��	45,{/* 61608 */
	mes "�]�������烁���o�[������ꏊ��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	warp "1@jtb.gat",353,42;
	end;
}
