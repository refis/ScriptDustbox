// �C�X�K���h�ėp�N�G�X�g�����t�@���N�V����
//
// getarg(0)  �N�G�X�g���̔z��
// getarg(1)  �[�i�N�G�X�g�̏ꍇ�K�v�A�C�e����ID�ANUM�z��
//            ID0�ŋ�؂�ƕ����N�G�X�g�����ɂȂ�܂�
//            �����݂̂̏ꍇ�͗L���z��0
// getarg(2)  �N�G�X�gID�z��
// getarg(3)  �N�[���^�C��ID�z��
// getarg(4)  ��V�A�C�e��ID�ANUM�z��
// getarg(5)  EXP�z��
// getarg(6)  �I���N�G�X�gID�z��
function	script	IsgardDQ	{
	function EXP_SEPFIX;

	set '@max,getarraysize(getarg(0));
	mes "�N�G�X�g�̎󒍂�񍐁A";
	mes "���������\�ł��B";
	next;
	copyarray '@q_nametbl$,getarg(0),'@max;
	setarray '@s_msg$,"[^ff0000���풆^000000]","[^ff0000�[�i���E�����~^000000]","[^ff0000�[�i�~�E������^000000]","[�󒍉�]","[^ff0000�񍐉�^000000]","[^888888���Ԑ�����^000000]";
	setarray '@menu$[1],"�S�Ď󒍂���","�S�ĕ񍐂���","�S�Ĕj������";
	for('@i=0;'@i<'@max;'@i++) {
		// �L���z��0(�����̂�)�A�܂��͕K�v�A�C�e���s��
		set '@q_name$,getelementofarray(getarg(0),'@i);
		set '@item_max,getarraysize(getarg(1));
		'@flag |= 3;

		// �[�i����͏����`�F�b�N
		if('@item_max > 0) {
			for('@j='@k;'@j<'@item_max;'@j='@j+2) {
				if(getelementofarray(getarg(1),'@j) == 0) {
					set '@k,'@j+1;
					break;
				}
				if(countitem(getelementofarray(getarg(1),'@j)) < getelementofarray(getarg(1),'@j+1))
					'@flag &= ~1;
			}
		}

		// ��������͓����`�F�b�N
		set '@quest,getelementofarray(getarg(2),'@i);
		if(getquestmaxcount('@quest) > 0)
			if(checkquest('@quest) && !(checkquest('@quest)&4) )
				'@flag &= ~2;

		// ��b����͏I���N�G�X�g�l���`�F�b�N
		if(getargcount() > 6)
			if(checkquest(getelementofarray(getarg(6),'@i)) == 0)
				'@flag &= ~3;

		// �[�i�̂݁@NG�@2:�@OK�@3
		// �����̂݁@NG�@1:�@OK�@3
		// �����@�@�@����NG�@�[�iNG�@0
		// �����@�@�@����NG�@�[�iOK�@1
		// �����@�@�@����OK�@�[�iNG�@2
		// �����@�@�@����OK�@�[�iOK�@3
		if(checkquest('@quest) == 0 && (checkquest(getelementofarray(getarg(3),'@i)) == 0 || checkquest(getelementofarray(getarg(3),'@i))&2))
			set '@type['@i],3;
		else if(checkquest(getelementofarray(getarg(3),'@i)))
			set '@type['@i],5;
		else if('@flag < 3) {
			if('@flag && '@item_max > 0 && '@quest > 0) {
				set '@type['@i], '@flag == 1? 1: 2;
			}
			else
				set '@type['@i],0;
		}
		else
			set '@type['@i],4;
		set getelementofarray(getarg(0),'@i),'@s_msg$['@type['@i]]+" "+'@q_name$;
		if('@type['@i] <= 2)
			'@swich |= 1;
	}
	// menu�̓���ւ�
	if('@swich)
		setarray '@selecter[0],2,0,1,3;
	else
		setarray '@selecter[0],1,2,0,3;
	for('@i=0;'@i<getarraysize('@selecter);'@i++) {
		if('@selecter['@i] == 0) {
			for('@j=0;'@j<'@max;'@j++) {
				set '@menu_array$[getarraysize('@menu_array$)],getelementofarray(getarg(0),'@j);
				set '@list[getarraysize('@list)],'@j+getarraysize('@selecter);
			}
		}
		else {
			set '@menu_array$[getarraysize('@menu_array$)],'@menu$['@selecter['@i]];
			set '@list[getarraysize('@list)],'@selecter['@i];
		}
	}
	set '@sel,select(printarray('@menu_array$)) - 1;
	switch('@list['@sel]) {
	case 1:
		mes "^ff0000[�C���t�H���[�V����]^000000";
		mes "^ff0000���݁A�󒍉\�ȕ\���̃N�G�X�g��^000000";
		mes "^ff0000�S�Ĉꊇ�Ŏ󒍂��邱�Ƃ��o���܂��B^000000";
		mes "^ff0000�N�G�X�g�̈ꊇ�󒍂��s���܂����H^000000";
		next;
		if(select("�ꊇ�󒍂��s��","��߂�") == 2) {
			mes "^ff0000[�C���t�H���[�V����]^000000";
			mes "^ff0000�����𒆒f���܂����B^000000";
			close2;
			cutin "", 255;
			end;
		}
		for('@i=0; '@i < '@max; '@i++) {
			// �N�G�X�g���󂯂Ă��Ȃ��A���N�[���^�C�������ĂȂ����N�[���^�C�������Ȃ��
			if( checkquest(getelementofarray(getarg(2),'@i)) == 0 && (checkquest(getelementofarray(getarg(3),'@i)) == 0 || (checkquest(getelementofarray(getarg(3),'@i))&2)) )
				set '@setquest[getarraysize('@setquest)],'@i+1;
		}
		if(getarraysize('@setquest) == 0) {
			mes "[�C���t�H���[�V����]";
			mes "�󒍉\�ȃN�G�X�g�����݂��܂���B";
			close2;
			cutin "", 255;
			end;
		}
		mes "<<B>�N�G�X�g</B>>";
		for(set '@i,0; '@i < getarraysize('@setquest); set '@i,'@i+1) {
			setquest getelementofarray(getarg(2),'@setquest['@i]-1);
			delquest getelementofarray(getarg(3),'@setquest['@i]-1);
			if(getelementofarray(getarg(2),'@setquest['@i]-1) == 17651)	// �n�ォ��̉B�ꏈ�T��
				getitem 1000842,6;
			mes "�u^ff0000" +'@q_nametbl$['@setquest['@i]-1]+ "^000000�v";
		}
		mes "���󒍂��܂����B";
		close2;
		cutin "", 255;
		end;
	case 2:
		mes "^ff0000[�C���t�H���[�V����]^000000";
		mes "^ff0000�N�G�X�g�B���̏�����^000000";
		mes "^ff0000�����X�^�[�����E�A�C�e���[�i��^000000";
		mes "^ff0000�����ꂩ1�̏ꍇ�A^000000";
		mes "^ff0000�ǂ���̏������������Ă���ꍇ��^000000";
		mes "^ff0000�����X�^�[������D�悵�ĕ񍐂��܂��B^000000";
		mes "^ff0000���̏ꍇ�A�A�C�e���͔[�i����܂���B^000000";
		next;
		for(set '@i,0; '@i < '@max; set '@i,'@i+1) {
			// �N�G�X�g���󂯂Ă��ē����ς݁A���A�C�e�����X�g�ݒ肪����Ȃ玝���Ă���Ε�
			if( checkquest(getelementofarray(getarg(2),'@i)) && (checkquest(getelementofarray(getarg(2),'@i))&4) && 
				(getarraysize(getarg(1)) == 0 || countitem(getelementofarray(getarg(1),'@i*2)) >= getelementofarray(getarg(1),'@i*2+1)) ) {
				set '@repoquest[getarraysize('@repoquest)],'@i+1;
				if(getarraysize(getarg(1)) >= 2)
					set '@count,1;
			}
		}
		if('@count) {
			mes "<<B>�[�i�A�C�e��</B>>";
			for('@i=0; '@i < getarraysize('@repoquest); '@i++) {
				mes "�A�C�e���F<ITEM>" +getitemname(getelementofarray(getarg(1),('@repoquest['@i]-1)*2))+ "<INFO>" +getelementofarray(getarg(1),('@repoquest['@i]-1)*2)+ "</INFO></ITEM>�@" +getelementofarray(getarg(1),('@repoquest['@i]-1)*2+1)+ "��";
			}
			mes "������̃A�C�e����[�i���Ă�";
			mes "��낵���ł����H";
			next;
			if(select("��߂�","�ꊇ�񍐂ɐi��") == 1) {
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "", 255;
				end;
			}
		}
		mes "[�C���t�H���[�V����]";
		mes "�񍐉\�ȃN�G�X�g��S�Ĉꊇ��";
		mes "�񍐂��邱�Ƃ��o���܂��B";
		mes "�N�G�X�g�̈ꊇ�񍐂��s���܂����H";
		next;
		if(select("�ꊇ�񍐂��s��","��߂�") == 2) {
			mes "^ff0000[�C���t�H���[�V����]^000000";
			mes "^ff0000�����𒆒f���܂����B^000000";
			close2;
			cutin "", 255;
			end;
		}
		if(getarraysize('@repoquest) == 0) {
			mes "[�C���t�H���[�V����]";
			mes "�񍐉\�ȃN�G�X�g�����݂��܂���B";
			close2;
			cutin "", 255;
			end;
		}
		mes "<<B>�N�G�X�g</B>>";
		if(checkitemblank() < getarraysize('@repoquest)) {
			mes "[�C���t�H���[�V����]";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes getarraysize('@repoquest)+"�ȏ�̋󂫂�����Ă��������B";
			close2;
			cutin "", 255;
			end;
		}
		for('@i=0; '@i < getarraysize('@repoquest); '@i++) {
			if(getarraysize(getarg(1)) >= 2)
				delitem getelementofarray(getarg(1),('@repoquest['@i]-1)*2),getelementofarray(getarg(1),('@repoquest['@i]-1)*2+1);
			delquest getelementofarray(getarg(2),('@repoquest['@i]-1));
			setquest getelementofarray(getarg(3),('@repoquest['@i]-1));
			if(getelementofarray(getarg(4),('@repoquest['@i]-1)*2)) {
				getitem getelementofarray(getarg(4),('@repoquest['@i]-1)*2),getelementofarray(getarg(4),('@repoquest['@i]-1)*2+1);
				set '@count2,1;
			}
			for(set '@j,0; '@j < 20; set '@j,'@j+1) {
				getexp getelementofarray(getarg(5),('@repoquest['@i]-1)*2),0,0;
				set '@baseexp,'@baseexp + getelementofarray(getarg(5),('@repoquest['@i]-1)*2) / 1000;
			}
			for(set '@j,0; '@j < 20; set '@j,'@j+1) {
				getexp 0,getelementofarray(getarg(5),('@repoquest['@i]-1)*2+1),0;
				set '@jobexp,'@jobexp + getelementofarray(getarg(5),('@repoquest['@i]-1)*2+1) / 1000;
			}
			mes "�u^ff0000" +'@q_nametbl$[('@repoquest['@i]-1)]+ "^000000�v";
		}
		mes "�̕񍐂��������܂����B";
		if('@baseexp) {
			next;
			set '@exp$,EXP_SEPFIX('@baseexp);
			mes "^0000ff<<B>��V</B>>^000000";
			mes "BaseExp " +'@exp$;
			mes "( " +'@baseexp+"000 )";
			mes "��BaseExp���󂯎��܂����B";
		}
		if('@jobexp) {
			next;
			set '@exp$,EXP_SEPFIX('@jobexp);
			mes "^0000ff<<B>��V</B>>^000000";
			mes "JobExp " +'@exp$;
			mes "( " +'@jobexp+"000 )";
			mes "��JobExp���󂯎��܂����B";
		}
		if('@count2) {
			next;
			mes "^0000ff<<B>��V</B>>^000000";
			for(set '@i,0; '@i < getarraysize('@repoquest); set '@i,'@i+1)
				mes "�A�C�e���F<ITEM>" +getitemname(getelementofarray(getarg(4),('@repoquest['@i]-1)*2))+ "<INFO>" +getelementofarray(getarg(4),('@repoquest['@i]-1)*2)+ "</INFO></ITEM>�@" +getelementofarray(getarg(4),('@repoquest['@i]-1)*2+1)+ "��";
			mes "���l�����܂����B";
		}
		close2;
		cutin "", 255;
		end;
	case 3:
		mes "^ff0000[�C���t�H���[�V����]^000000";
		mes "^ff0000���݁A���풆�\���̃N�G�X�g��^000000";
		mes "^ff0000�S�Ĉꊇ�Ŕj�����邱�Ƃ��o���܂��B^000000";
		mes "^ff0000�񍐉A���Ԑ������̃N�G�X�g��^000000";
		mes "^ff0000�j���̏������s���܂���B^000000";
		mes "^ff0000�N�G�X�g�̈ꊇ�j�����s���܂����H^000000";
		next;
		if(select("��߂�","�S�Ĕj������") == 1) {
			mes "^ff0000[�C���t�H���[�V����]^000000";
			mes "^ff0000�����𒆒f���܂����B^000000";
			close2;
			cutin "", 255;
			end;
		}
		for('@i=0; '@i < '@max; '@i++) {
			// �N�G�X�g���󂯂Ă��ē����������Ă��Ȃ��A���N�[���^�C�������ĂȂ����N�[���^�C�������Ȃ�j��
			if( checkquest(getelementofarray(getarg(2),'@i)) && !(checkquest(getelementofarray(getarg(2),'@i))&4) &&
				(checkquest(getelementofarray(getarg(3),'@i)) == 0 || (checkquest(getelementofarray(getarg(3),'@i))&2)) )
				set '@delquest[getarraysize('@delquest)],'@i+1;
		}
		if(getarraysize('@delquest) == 0) {
			mes "[�C���t�H���[�V����]";
			mes "�j���o����N�G�X�g�����݂��܂���B";
			close2;
			cutin "", 255;
			end;
		}
		mes "<<B>�N�G�X�g</B>>";
		for('@i=0; '@i < getarraysize('@delquest); '@i++) {
			delquest getelementofarray(getarg(2),'@delquest['@i]-1);
			if(getelementofarray(getarg(2),'@delquest['@i]-1) == 17651)	// �n�ォ��̉B�ꏈ�T��
				getitem 1000842,countitem(1000842);
			mes "�u^ff0000" +'@q_nametbl$['@delquest['@i]-1]+ "^000000�v";
		}
		mes "��j�����܂����B";
		close2;
		cutin "", 255;
		end;
	default:
		return ('@list['@sel]-4);
	}
	function EXP_SEPFIX {
		set '@num$,getarg(0);
		set '@len,getstrlen('@num$);
		set '@type,('@len >= 10)? 0: (('@len >= 7)? 1: (('@len >= 4)? 2: 3) );
		setarray '@sep,9,6,3,0;
		setarray '@c$,"T","G","M","K";
		for(set '@i,0; '@i < '@len; set '@i,'@i+1) {
			if(substr('@num$,-1) == "0") {
				set '@num$,substr('@num$,0,-1);
			}
			else
				break;
		}
		return substr('@num$,0,('@len - '@sep['@type])) +(substr('@num$,('@len - '@sep['@type]))!=""? ".": "")+ substr('@num$,('@len - '@sep['@type])) +'@c$['@type];
	}
}

//isgard.sc �� NPC�ƒu������
icecastle.gat,204,165,0	script	#ep19_evt_3	139,7,7,{/* 2522 */
	cloakonnpc "���n�[��#ep19lehar_1";
	if(EP19_1QUE == 10)
		cloakoffnpc "���n�[��#ep19lehar_1";
	cloakonnpc "�z����#ep20_1";
	if(EP19_1QUE == 100 && EP20_1QUE == 0 && BaseLevel >= 240)
		cloakoffnpc "�z����#ep20_1";
	end;
}

icecastle.gat,52,124,3	script	�V��������#ep19iwin06	21515,{/* 2822 */
	if(EP19_1QUE < 23) {
		mes "[�V��������]";
		mes "�X���ɋC��t���āH";
		mes "������������񂾂�`�H";
		close2;
		cutin "ep19_iwin04.png", 255;
		end;
	}
	cutin "ep19_iwin04.png", 2;
	mes "[�V��������]";
	mes "���K���̑��ɐ�������d���A����J�l�B";
	mes "�������������ɍs���́H";
	mes "�X���ŕ����h�����낤����A";
	mes "������Ǝ�`�������H";
	mes "�萔����^0000ff500Zeny^000000����B";
	while(1) {
		next;
		setarray '@str$,"�K�v�Ȃ�","�ւ̑�","�X�̏�(�C�X�K���h �X�̏�)","���F���O���f�̌�����(�C�X�K���h ����)","�]�������̃L�b�`��(�C�X�K���h ����)","^999999�H�H�H^000000","^999999�H�H�H^000000","^999999�H�H�H^000000","^999999�H�H�H^000000";
		if(EP19_2QUE >= 19) {	// ������
			set '@str$[0],"�t���[�f���P�̑؍ݏ�(�C�X�K���h ����)";
			set '@str$[1],"�w�����b�N�̏�(���ĕt�����K��)";
		}
		if(EP20_1QUE >= 100) {
			set '@str$[2],"�֐_�̍��� ����";
			set '@str$[3],"�C�X�K���h�̐��� �����Ȏ}�݂̍菈";
		}
		switch(select(printarray('@str$))) {
		case 1:
			mes "[�V��������]";
			mes "�������A���œ]�т�����������";
			mes "�����Ă���B";
			mes "�����X�̏�̐_���z�B�A�[�E�B������B";
			mes "�l�Ԉ�l��΂��̂́A";
			mes "�����̎q�������������B";
			close2;
			cutin "ep19_iwin04.png", 255;
			end;
		case 2:
			if(EP19_1QUE >= 63 && EP19_1QUE <= 67) {
				mes "[�V��������]";
				mes "^0000ff�ւ̑�^000000���H";
				mes "���́A���ڌ������킯�ɂ͂����Ȃ�����A";
				mes "�t�߂܂Ŕ�΂����I";
				close2;
				cutin "ep19_iwin04.png", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_que.gat", 281, 87;
				end;
			}
			mes "[�V��������]";
			mes "^0000ff�ւ̑�^000000���ȁH";
			mes "�O�̓��K���ɕϐg���čs��������H";
			mes "���������y����������B";
			mes "���̎��ɓ����o��������ȁB";
			mes "���ꂶ�Ⴀ�A";
			mes "���̓����ɔ�΂����I";
			close2;
			cutin "ep19_iwin04.png", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_nest.gat", 275, 19;
			end;
		case 3:
			set '@name$,"�X�̏�";
			set '@map$,"icas_in.gat";
			setarray '@xy,138,187;
			break;
		case 4:
			set '@name$,"���F���O���f�̌�����";
			set '@map$,"icas_in.gat";
			setarray '@xy,190,61;
			break;
		case 5:
			set '@name$,"�]�������̃L�b�`��";
			set '@map$,"icas_in.gat";
			setarray '@xy,237,62;
			break;
		case 6:
			if(EP19_2QUE < 19) {	// ������
				mes "^ff0000�N�G�X�g^000000";
				mes "^ff0000�u�򉻂̐����v��^000000";
				mes "^ff0000�r���܂Ői�߂��^000000";
				mes "^ff0000���p�ł���悤�ɂȂ�܂��B^000000";
				continue;
			}
			set '@name$,"�t���[�f���P�̑؍ݏ�";
			set '@map$,"icas_in.gat";
			setarray '@xy,33,112;
			break;
		case 7:
			if(EP19_2QUE < 19) {	// ������
				mes "^ff0000�N�G�X�g^000000";
				mes "^ff0000�u�򉻂̐����v��^000000";
				mes "^ff0000�r���܂Ői�߂��^000000";
				mes "^ff0000���p�ł���悤�ɂȂ�܂��B^000000";
				continue;
			}
			set '@name$,"�w�����b�N�̏�";
			set '@map$,"jor_tail.gat";
			setarray '@xy,214,60;
			break;
		case 8:
			if(EP20_1QUE < 100) {
				mes "^ff0000�N�G�X�g^000000";
				mes "^ff0000�u���ȂȂ��ҁv��^000000";
				mes "^ff0000�r���܂Ői�߂��^000000";
				mes "^ff0000���p�ł���悤�ɂȂ�܂��B^000000";
				continue;
			}
			set '@name$,"�֐_�̍��� ����";
			set '@map$,"jor_sanct.gat";
			setarray '@xy,150,80;
			break;
		case 9:
			if(EP20_1QUE < 100) {
				mes "^ff0000�N�G�X�g^000000";
				mes "^ff0000�u���ȂȂ��ҁv��^000000";
				mes "^ff0000�r���܂Ői�߂��^000000";
				mes "^ff0000���p�ł���悤�ɂȂ�܂��B^000000";
				continue;
			}
			mes "^0000ff�C�X�K���h�̐��� ^000000";
			mes "^0000ff�����Ȏ}�݂̍菈^000000���ȁH";
			mes "�l�Ԉ�l��΂��̂́A";
			mes "�����̎q�������������B";
			close2;
			cutin "ep19_iwin04.png", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_twig.gat",125,157;
			end;;
		}
		break;
	}
	mes "[�V��������]";
	mes "^0000ff" +'@name$+ "^000000���ȁH";
	mes "�l�Ԉ�l��΂��̂́A";
	mes "�����̎q�������������B";
	close2;
	cutin "ep19_iwin04.png", 255;
	if(Zeny < 500)
		end;
	set Zeny, Zeny -500;
	warp '@map$, '@xy[0], '@xy[1];
	end;
}

icas_in.gat,32,122,0	script	#seizyo_sw	139,10,10,{/* 2919 */
	switch(EP19_2QUE) {
	case 0:
		end;
	case 19:
	case 20:
		cloakoffnpc "�t���[�f���P#ep19_seizy";
		cloakoffnpc "���n�[��#ep19_room";
		end;
	case 21:
		cloakoffnpc "�t���[�f���P#ep19_seizy";
		cloakoffnpc "�V������#ep19_dq_jorab";
		end;
	default:
		cloakoffnpc "�t���[�f���P#ep19_seizy";
		cloakoffnpc "�V������#ep19_dq_jorab";
		cloakoffnpc "�^�}����#ep19_refrigera";
		if(EP20_3QUE == 1) {
			cloakoffnpc "�R�|#ep20_1";
			cloakoffnpc "�R�|#ep20_2";
			cloakoffnpc "�R�|#ep20_3";
			cloakoffnpc "�R�|#ep20_4";
			mes "�]�킢�킢�@���₪��]";
			next;
			mes "�I�I�I�I�I�I";
			next;
			cloakonnpc "�R�|#ep20_1";
			cloakonnpc "�R�|#ep20_2";
			cloakonnpc "�R�|#ep20_3";
			cloakonnpc "�R�|#ep20_4";
			mes "[�t���[�f���P]";
			mes "����H";
			mes "�݂�ȁA�ǂ�����������́H";
			cutin "ep19_friederike02.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "���I";
			mes strcharinfo(0)+"�l";
			mes "����ɂ��́`�B";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes strcharinfo(0)+"�l������";
			mes "�݂�ȁA�B�ꂿ������݂����B";
			mes "�p���������艮���񂾂ˁ`�B";
			cutin "ep19_friederike05.png", 2;
			next;
			menu "����n��",-;
			mes "[�t���[�f���P]";
			mes "�킟�I";
			mes "�킴�킴���肪�Ƃ��������܂��B";
			mes "���H�[�N�����f�l����ł����H";
			mes "���Ηl�A�������ꂽ�̂��ȁH";
			cutin "ep19_friederike03.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "���������c�c�B";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�����I";
			mes "����͑O�ɗ���ł��ю��̌C���I";
			mes "�ӂ�ӂ�̂���������";
			mes "�Ƃ��Ă������`�I";
			cutin "ep19_friederike03.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�����āA�q�i���̂����Ɓc�c";
			mes "�^�^�������̎莆�c�c�B";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�|�����N���X�v�I";
			mes "�������V�t���`�o�`����!!";
			cutin "ep19_friederike02.png", 2;
			next;
			cloakoffnpc "�R�|#ep20_1";
			mes "[���уA�[�E�B��]";
			mes "���َq�H";
			mes "�����������I";
			mes "�����H�ׂ悤��`�I";
			cutin "ep20_cocopo02.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "���́A�_������`�B";
			cutin "ep19_friederike01.png", 2;
			next;
			cloakoffnpc "�R�|#ep20_2";
			mes "[���уA�[�E�B��]";
			mes "���`�`�`�Ȃ�ł��`�`�H";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "���َq�͂��H���̌��";
			mes "�H�ׂ���̂�����B";
			cutin "ep19_friederike01.png", 2;
			next;
			cloakoffnpc "�R�|#ep20_3";
			mes "[���уA�[�E�B��]";
			mes "���H�ׂ���_���Ȃ́H";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�_����`�I";
			mes "���т̑O�ɂ��َq��H�ׂ��Ⴄ��";
			mes "���H�[�N�����f�l�Ɏ�����񂾂���I";
			cutin "ep19_friederike04.png", 2;
			next;
			cloakoffnpc "�R�|#ep20_4";
			mes "[���уA�[�E�B��]";
			mes "�����ǁA�t���[�f���P���܂�";
			mes "���т̑O�ɂ��َq�H�ׂ���ˁH";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[�^�}����]";
			mes "����Ń}�[�N�C�V����";
			mes "���H�[�N�����f�l�Ɏ����Ă܂����ˁB";
			cutin "ep19_tamarin04.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "���`�`���B";
			cutin "ep19_friederike02.png", 2;
			next;
			mes "[���уA�[�E�B��]";
			mes "�t���[�f���P���܂�";
			mes "���H�[�N�����f���܂�";
			mes "����ꂿ������񂾁`�B";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "���`�`�Ȃ�Ō������Ⴄ�́`�I";
			mes "�ł��A�^�^�������ꏏ�Ɏ���ꂽ��ˁI";
			cutin "ep19_friederike04.png", 2;
			next;
			mes "[�^�}����]";
			mes "���͂��َq��H�ׂ����炶��Ȃ���";
			mes "�t���[�f���P�l�����َq��H�ׂ�̂�";
			mes "�~�߂Ȃ��������玶��ꂽ��ł��B";
			mes "����ƃ^�^��������Ȃ���";
			mes "�^�}�����Ȃ�ł����ǁc�c�B";
			cutin "ep19_tamarin02.png", 2;
			next;
			mes "[���уA�[�E�B��]";
			mes "���܂̓_���[�I";
			mes "�}�}���F�B�Ƃ͒��ǂ����Ȃ���";
			mes "�����Ȃ����Č����Ă���`�B";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[���уA�[�E�B��]";
			mes "���������I";
			mes "�����炨�َq�͂��т̌�ɐH�ׂ悤��B";
			mes "����܂ŉ䖝�ł����ˁH";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[�^�}����]";
			mes "�����B�҂Ȃ��т������Ȃ��c�c�B";
			cutin "ep19_tamarin03.png", 2;
			next;
			mes "[���уA�[�E�B��]";
			mes "�ł��ł��}�}��";
			mes "�F�B�ƒ��ǂ����Ȃ������Č���������";
			mes "���J�ɏZ�ރA�[�E�B�������ɂ�";
			mes "�߂Â�����_���A���Č����񂾂�H";
			cutin "ep20_cocopo03.png", 2;
			next;
			menu "���J�̃A�[�E�B���H",-;
			mes "[���уA�[�E�B��]";
			mes "�`���҂��܂��m��Ȃ����Ƃ�����񂾁I";
			mes "�k�̋��J�ɂ̓A�[�E�B���B��";
			mes "��������Z��ł�񂾂�B";
			cutin "ep20_cocopo02.png", 2;
			next;
			mes "[���уA�[�E�B��]";
			mes "�������[�̂ɂ�";
			mes "�ꏏ�ɏZ��ł�������";
			mes "���͂�������Ȃ��񂾂��ā`�B";
			cutin "ep20_cocopo01.png", 2;
			next;
			mes "[���уA�[�E�B��]";
			mes "�ꏏ�ɏZ�߂΂����̂ɂȁ`�B";
			mes "�����ɗ���΁A�g�����Ƃ�������";
			mes "�����������َq���H�ׂ���̂Ɂ`�I";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�����q���́A�����q���ˁ`�B";
			cutin "ep19_friederike03.png", 2;
			next;
			mes "[�����q��]";
			mes "���A����Ȃ񂶂�Ȃ�����I";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[�^�}����]";
			mes "�p���������艮���ˁ`�B";
			cutin "ep19_tamarin04.png", 2;
			next;
			mes "[�����q��]";
			mes "�ӂ�I";
			mes "��l�Ƃ����炩���āI";
			mes "�����A���ѐH�ׂɂ������ɋA�邩��I";
			cutin "ep20_cocopo03.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�����I";
			mes "���������΁A��������Ȏ��ԁH";
			mes "�x���Ȃ�O�ɁA���̃R�|������";
			mes "�������ɋA�点�Ȃ�������`�B";
			cutin "ep19_friederike02.png", 2;
			close2;
			cutin "ep19_friederike03.png", 255;
			chgquest 11928,11929;
			set EP20_3QUE,2;
			end;
		}
		if(EP20_3QUE >= 2 && EP20_3QUE <= 5) {
			if(EP20_3QUE <= 2)
				cloakoffnpc "�R�|#ep20_1";
			else
				cloakonnpc "�R�|#ep20_1";
			if(EP20_3QUE <= 3)
				cloakoffnpc "�R�|#ep20_2";
			else
				cloakonnpc "�R�|#ep20_2";
			if(EP20_3QUE <= 4)
				cloakoffnpc "�R�|#ep20_3";
			else
				cloakonnpc "�R�|#ep20_3";
			cloakoffnpc "�R�|#ep20_4";
			mes "[�t���[�f���P]";
			mes "�����I";
			mes "���������΁A��������Ȏ��ԁH";
			mes "�x���Ȃ�O�ɁA���̃R�|������";
			mes "�������ɋA�点�Ȃ�������`�B";
			cutin "ep19_friederike02.png", 2;
			close2;
			cutin "ep19_friederike03.png", 255;
			end;
		}
		if(EP20_3QUE == 6) {
			cloakonnpc "�R�|#ep20_1";
			cloakonnpc "�R�|#ep20_2";
			cloakonnpc "�R�|#ep20_3";
			cloakoffnpc "�R�|#ep20_4";
			mes "[�t���[�f���P]";
			mes "���傤���Ȃ��Ȃ��`�B";
			mes "���͂��̎q�̉Ƃ�m���Ă��܂�����";
			mes "����͂��܂��ˁB";
			cutin "ep19_friederike02.png", 2;
			next;
			mes "[�^�}����]";
			mes "�����I";
			mes "���o�����ł����H";
			cutin "ep19_tamarin02.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�����͂Ȃ�����";
			mes "�����A���ė����B";
			cutin "ep19_friederike01.png", 2;
			next;
			mes "[�^�}����]";
			mes "���`��c�c";
			mes strcharinfo(0)+"�l�A";
			mes "�t���[�f���P�l�����ł͐S�z�Ȃ̂�";
			mes "�ꏏ�ɂ��čs���Ă��炦�܂��񂩁H";
			cutin "ep19_tamarin01.png", 2;
			next;
			mes "[�t���[�f���P]";
			mes "�X�̒����������������";
			mes "���v����`�B";
			cutin "ep19_friederike04.png", 2;
			next;
			mes "[�^�}����]";
			mes "�ŋ߂悭�Ȃ��\�������ł��B";
			mes "�X�J���Ǝv���܂����A���肢���܂��B";
			cutin "ep19_tamarin01.png", 2;
			next;
			cutin "ep19_tamarin04.png", 255;
			mes "�]�O��";
			mes "�@�������܂����H�]";
			next;
			if(select("������","��߂�") == 2) {
				mes "�]���̏�ɂƂǂ܂����]";
				close;
			}
			mes "�]�O��";
			mes "�@���������]";
			close2;
			warp "icecastle.gat", 65, 213;
			end;
		}
		end;
	}
	end;
}

-	shop	icas_in#callshop2	-1,1100006:1200
//-	exchange	icas_in#callexchange	-1,102202:1001217:100
icas_in.gat,175,63,3	script	�z����#ep19trader	10461,{/* 2953 */
	cutin "ep19_iwin02.png", 2;
	mes "[�z����]";
	mes "���F���O���f�l�Ƌ���";
	mes "���������K���h�l�̖��͂��������ł��B";
	mes "�A�[�E�B���E�Řb���";
	mes "�X�[�p�[�t�[�h�𒴂���";
	mes "�E���g���t�[�h<ITEM>�����A�C�X�t�i���V<INFO>1100006</INFO></ITEM>��";
	mes "�̔����Ў�Ԃɍs���Ă��܂��B";
	next;
	switch(select("�����A�C�X�t�i���V�𔃂�","�܂�܂�Ƃ����A�C�X�t�i���V�𔃂�","�����A�C�X�t�i���V���āH","���Ȃ��̖��O�́H","��߂�")) {
	case 1:
		mes "[�z����]";
		mes "�h�{���_��";
		mes "�����A�C�X�t�i���V�ł��B";
		mes "���Ђ��ܖ����������B";
		close2;
		callshop "icas_in#callshop2",1;
		cutin "ep19_iwin02.png", 255;
		end;
	case 2:
		mes "[�z����]";
		mes "�R�|�����̑�D���B";
		mes "�܂�܂�Ƃ����A�C�X�t�i���V�ł��ˁB";
		close2;
		//callshop "icas_in#callexchange",1;
		cutin "ep19_iwin02.png", 255;
		end;
	case 3:
		mes "[�z����]";
		mes "���������āA";
		mes "�E���g���t�[�h<ITEM>�����A�C�X�t�i���V<INFO>1100006</INFO></ITEM>��";
		mes "�������Ȃ��H";
		next;
		mes "[�z����]";
		mes "�A�C�X�t�i���V�́A";
		mes "���̔�����������A";
		mes "�A�[�E�B��������";
		mes "�\�E���t�[�h�ƌĂ΂�Ă���Ɠ����ɁA";
		mes "���ɉh�{���L�x��";
		mes "�X�[�p�[�t�[�h�ł�����܂��B";
		next;
		mes "[�z����]";
		mes "���̃A�C�X�t�i���V��";
		mes "���������邱�Ƃɂ��A";
		mes "�����^�т܂ł��₷���Ȃ����A";
		mes "<ITEM>�����A�C�X�t�i���V<INFO>1100006</INFO></ITEM>�́A";
		mes "�܂���^FF0000�E���g���t�[�h^000000�ƌĂԂ�";
		mes "�ӂ��킵���H�ו��ł��B";
		next;
		mes "[�z����]";
		mes "���ꂳ������΁A";
		mes "���̐H���͂���Ȃ��񂶂�Ȃ����Ƃ���";
		mes "�v���Ă���قǂł���B";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 4:
		mes "[�z����]";
		mes "���̖{���̖��O��";
		mes "�z�����E�z�����E�z�����B";
		mes "(���C�����E�V�O�j�`���[�E�x���K���b�g)";
		next;
		menu "�z�����H",-;
		mes "[�z����]";
		mes "�����ł��ˁB";
		mes "�i�D�������O��t���Ă��A";
		mes "�l�Ԃ̎��ɂ�";
		mes "�z�����ɕ�������悤�ł��B";
		mes "�C�ɂ����Ƀz�����ƌĂ�ł��������B";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	case 5:
		mes "[�z����]";
		mes "�����ł����B";
		mes "�p��������΁A";
		mes "�܂����������Ă��������B";
		close2;
		cutin "ep19_iwin02.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1071;
	setnpctitle "[�����A�C�X�t�i���V]";
	end;
}

//isgard.sc �� NPC(OnQuestInfo:)�ɑ}������
// if(EP20_1QUE == 7)
// 	showevent 0, 1, "#in_barracks";

// if(EP20_1QUE == 8)
// 	showevent 0, 1, "#in_house2";

// if(EP20_3QUE == 10)
// 	showevent 1, 1, "#in_barracks";

//============================================================
// ���ȂȂ��҃N�G�X�g
//- Registry -------------------------------------------------
// EP20_1QUE -> 0�`80	����:100
//------------------------------------------------------------
icecastle.gat,205,170,3	script(CLOAKED)	�z����#ep20_1	10461,{/* 3335 (cloaking)*/
	switch(EP20_1QUE) {
	case 0:
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�`���ҁA���x�����Ƃ���ɁI";
		mes "���K���ǂ��̑��A���������";
		mes "����܂ő{�����������Ă����ȁH";
		next;
		mes "[�z����]";
		mes "�c�O�Ȃ��炢�܂��ɓz��̋��ꏊ��";
		mes "����ł��Ă��Ȃ��B";
		mes "�z�炪�o���肵�Ă���ꏊ��";
		mes "�ǂ����ɂ���͂��Ȃ̂Ɂc�c�B";
		next;
		mes "[�z����]";
		mes "�z��͉��������ł���B";
		mes "�������A���܂��ɔ����ł��Ȃ��ƂȂ��";
		mes "����܂ł̑{���͈͂��L���邵���Ȃ��B";
		mes "���̘b�����邽�߂�";
		mes "�`���҂�҂��Ă����񂾁B";
		next;
		menu "�{���͈͂��L����H",-;
		mes "[�z����]";
		mes "�����I�@�l����V�����Ґ�����\�肾�B";
		mes "�������A�`���҂ɂ���`���ė~�����B";
		mes "�ڂ��������͏�̒��ł��邩��";
		mes "�����s�����B";
		mes "�݂�ȏW�܂��Ă�͂����B";
		next;
		cutin "ep19_iwin06.png", 255;
		setquest 17690;
		set EP20_1QUE,1;
		mes "�]�X�̏� ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�X�̏� ������";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	case 1:
		mes "[�z����]";
		mes "�ڂ��������͏�̒��ł��邩��";
		mes "�����s�����B";
		mes "�݂�ȏW�܂��Ă�͂����B";
		next;
		mes "�]�X�̏� ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏� ������";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	}
	end;
OnQuestInfo:
	if(EP19_1QUE == 100 && EP20_1QUE <= 1 && BaseLevel >= 240)
		showevent 0, 1, "�z����#ep20_1";
	else
		showevent 9999,0, "�z����#ep20_1";
	end;
}

icas_in.gat,258,196,0	script	#ep20_re01	139,5,5,{/* 3336 */
	if(EP20_1QUE <= 1 || EP20_1QUE == 5) {//0?
		cloakoffnpc "���I��#ep20_re01";
		cloakoffnpc "�I�[�����[#ep20_re01";
		cloakoffnpc "���C�W�[#ep20_re01";
		cloakoffnpc "�~���A��#ep20_re01";
		cloakoffnpc "���n�[��#ep20_re01";
		cloakoffnpc "�z����#ep20_re01";
	}
	else if(EP20_1QUE == 6 || EP20_1QUE == 12) {
		cloakoffnpc "���I��#ep20_re01";
		cloakoffnpc "�I�[�����[#ep20_re01";
		cloakoffnpc "���C�W�[#ep20_re01";
		cloakoffnpc "�~���A��#ep20_re01";
		cloakoffnpc "���n�[��#ep20_re01";
		cloakoffnpc "���F���O���f#ep20_re01";
	}
	else if(EP20_1QUE == 11) {
		cloakonnpc "�z����#ep20_re07";
		cloakonnpc "���F���O���f#ep20_re02";
		cloakoffnpc "���I��#ep20_re01";
		cloakoffnpc "�I�[�����[#ep20_re01";
		cloakoffnpc "���C�W�[#ep20_re01";
		cloakoffnpc "�~���A��#ep20_re01";
		cloakoffnpc "���n�[��#ep20_re01";
		cloakoffnpc "�z����#ep20_re01";
		cloakoffnpc "���F���O���f#ep20_re01";
	}
	else if(EP20_1QUE == 13) {
		cloakoffnpc "�~���A��#ep20_re01";
	}
	else if(EP20_1QUE == 14 || EP20_1QUE == 15) {//15?
		cloakoffnpc "���I��#ep20_re01";
		cloakoffnpc "�I�[�����[#ep20_re01";
		cloakoffnpc "���C�W�[#ep20_re01";
		cloakoffnpc "�~���A��#ep20_re01";
		cloakoffnpc "���n�[��#ep20_re01";
		cloakoffnpc "�z����#ep20_re01";
	}
	end;
}
icas_in.gat,262,202,5	script(CLOAKED)	���I��#ep20_re01	10464,{/* 3337 (cloaking)*/
	switch(EP20_1QUE) {
	case 0:	//
	case 1:
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�F����A���W�܂�̂悤�ł��ˁB";
		mes "���b���������Ƃ�����";
		mes "�W�܂��Ă��炢�܂����B";
		mes "���X�K���h�̍s���ɂ��Ăł����c�c";
		mes "�{���͈͂��L���悤�Ǝv���܂��B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�{���͈͂��L���邾���āH";
		mes "�܂��T���ĂȂ��ꏊ��������Ă��ƁH";
		mes "���J��1�{����Ƃ��������Ȃ��悤";
		mes "�{�������͂��Ȃ񂾂���!?";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�ꂩ���A�{���ł��Ă��Ȃ��ꏊ������B";
		mes "����c�c�s���K�v�͂Ȃ��Ǝv���Ă�����";
		mes "�z�炪������Ȃ��ȏ�";
		mes "���ׂȂ��킯�ɂ͂����Ȃ��Ȃ����B";
		next;
		cutin "ep19_aurelie03.png", 0;
		mes "[�I�[�����[]";
		mes "�u�Ñ�̕X�̋��J�v�Ƃ����ꏊ�łˁB";
		mes "�����ɂ́u�Ñ�A�C�X�E�B���h�v�Ƃ�������";
		mes "�푰���Z��ł���B";
		next;
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�Ñ�A�C�X�E�B���h�H";
		emotion 1,"�~���A��#ep20_re01",1;
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�A�[�E�B���Ƃ͈قȂ�����ɐi������";
		mes "�A�[�E�B���̖쐶��ƌ�����푰�ł��B";
		mes "�Â̎p��ۂ��Ă���";
		mes "�꒣��ӎ������ɍ����A�D��I�ł��B";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[���I��]";
		mes "���X�K���h�₻�̈ꑰ�ł����Ă�";
		mes "�ނ�̓꒣��ɐN������̂͊댯�ł��B";
		mes "�����l���Ă���܂�";
		mes "�{���͈͂���͊O���Ă����̂ł��B";
		next;
		cutin "ep19_aurelie03.png", 0;
		mes "[�I�[�����[]";
		mes "���̍l���𐳂��K�v������Ƃ������ƁB";
		mes "�z��̐K����͂߂Ȃ��ȏ�͂ˁB";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���̏ꏊ�̑{����";
		mes "�{�N���Q�������Ă��炦�܂��񂩁H";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�{�����̐l���I��́A�����R�ɂǂ����B";
		mes "���������l���͑���Ă��܂�����B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "����Ȃ玄���{���ɎQ�����悤�I";
		mes "�`���҂͒m���Ă邾�낤��";
		mes "���́A�����������Ƃ̐��Ƃ�����B";
		next;
		mes "[���C�W�[]";
		mes "�z��ɋC�t����Ȃ��悤��";
		mes "�v���ɍs�����Ȃ�����I";
		mes "�������`���҂��ꏏ�ɗ��Ă��炤���I";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�����s���܂��傤�B";
		mes "�Ñ��ƊȒP�Ȉӎv�a�ʂ�";
		mes "�ł��܂�����I";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���`���΂͌������I";
		mes "�D��I�ȑ���ł����Ă�";
		mes "�b���ʂ���Ȃ�";
		mes "�]�v�ȑ������������ȁB";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�b���ʂ���Ƃ�����";
		mes "�����܂Ő��m�ł͂Ȃ��āc�c";
		mes "���������Ă�񂾂Ȃ��Ƃ�";
		mes "�{���Ă���񂾂Ȃ��c�c���炢�H";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�c�c���ꂮ�炢�Ȃ�";
		mes "�����Ǝ��ł��킩��B";
		mes "�{���ɖ��ɗ��̂��H";
		emotion 4,"���C�W�[#ep20_re01",1;
		next;
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "�܁A�܂������b���ʂ��Ȃ�����";
		mes "�����͖��ɗ��Ǝv���܂���I";
		mes "�c�c�����炭�B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�ł͎����s���܂��傤�I";
		mes "���ē��Ȃ炨�C�����������I";
		mes "���J�̓����܂�";
		mes "���S�ɂ��ē��������܂��I";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�悵��`���I";
		mes "�����q�����͏��X��Ȃ���������";
		mes "�^�������N������ƈ���ė��������ȁI";
		mes "�����ƌ��܂�΂�����";
		mes "�u�Ñ�̕X�̋��J�v�ɏo�����悤�B";
		unittalk getnpcid(0,"�z����#ep20_re01"),"�z���� : �Ђǂ��������I",1;
		emotion 19,"�z����#ep20_re01",1;
		next;
		cutin "ep19_leizi02.png", 255;
		chgquest 17690,16691;
		set EP20_1QUE,2;
		mes "�]�Ñ�̕X�̋��J ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�Ñ�̕X�̋��J ������";
		mes "�@���������]";
		close2;
		warp "jor_back5.gat", 353, 73;
		end;
	case 2:
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "�u�Ñ�̕X�̋��J�v�̑{����";
		mes "���肢���܂��B";
		mes "�ǂ����A���C�����āB";
		next;
		cutin "ep19_leon01.png", 255;
		mes "�]�Ñ�̕X�̋��J ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�Ñ�̕X�̋��J ������";
		mes "�@���������]";
		close2;
		warp "jor_back5.gat", 353, 73;
		end;
	case 5:
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "��������Ȃ����B";
		mes "�������ʂ͂���܂������H";
		next;
		cutin "ep19_leon01.png", 255;
		menu "���ʂ�����܂���",-;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "����́A�������ƂˁB";
		mes "�c�c���͏ł��Ă����񂾂�B";
		mes "�{���ł��Ă��Ȃ��ꏊ��";
		mes "��������������������ˁB";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���K�����������Ă����Ǝv����";
		mes "���Ղ𔭌����܂����B";
		mes "���������u�������ċA���Ă��܂�����B";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "���������u�ł����H";
		mes "����͐��Ƃ�";
		mes "���Ă�����������ǂ��ł��ˁB";
		next;
		cutin "ep19_vellgunde01.png", 2;
		cloakoffnpc "���F���O���f#ep20_re01";
		mes "[���F���O���f]";
		mes "����A�����Ă񂾁H";
		mes "�܂��܂��A���߂Ă݂���̂���B";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "�Ӂ`��c�c�����[���B";
		mes "���͂���������B";
		mes "������������ׂ�Ηǂ��̂�ˁH";
		emotion 2,"���F���O���f#ep20_re01",1;
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���΂̓��F���O���f�l�I";
		mes "�b�������I";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�����ƒ��ׂ�������";
		mes "�������Ԃ����炦�Ȃ�������H";
		mes "�I�������A�F�ɏW�܂��Ă��炤����";
		mes "����܂ł́A������肵�ĂĂ��傤�����B";
		next;
		cutin "ep19_iwin06.png", 2;
		unittalk getnpcid(0,"���n�[��#ep20_re01"),"���n�[�� : ����Ȃ�A���͏C�s���Ă��܂��B",1;
		unittalk getnpcid(0,"�~���A��#ep20_re01"),"�~���A�� : ������Ƌx�܂��Ă��炨�����ȁB",1;
		unittalk getnpcid(0,"���C�W�[#ep20_re01"),"���C�W�[ : �ނ�̎��Ԃ��I�@�������[���ނ�ꂪ����炵������B",1;
		mes "[�z����]";
		mes "�c�c�����A"+strcharinfo(0)+"�l�B";
		mes "�����Ԃ����炦�܂��񂩁H";
		mes "���b���������Ƃ�����̂ł����c�c�B";
		next;
		cutin "ep19_iwin01.png", 255;
		menu "���̘b�ł����H",-;
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "���[���I";
		mes "���������ł������������̂ɂ�";
		mes "�Ӗ�������Ƃ������Ƃł��B";
		mes "��C��ǂ�ł��������I";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���F���O���f�l�����������u��";
		mes "���ׂĂ���Ԃɂ��ׂ���������܂��B";
		mes "�c�c���̏h�ɂ̏�̕��ɂ��܂�����";
		mes "��������b�������Ă��������B";
		mes "���ꂮ�����������I�@�ł���I";
		next;
		cutin "ep19_iwin01.png", 255;
		cloakonnpc "�z����#ep20_re01";
		cloakoffnpc "�z����#ep20_re07";
		chgquest 16694,16695;
		set EP20_1QUE,6;
		mes "�]�C�X�K���h ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�C�X�K���h ������";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	case 6:
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���F���O���f�l�����������u��";
		mes "���ׂĂ���Ԃɂ��ׂ���������܂��B";
		mes "�c�c���̏h�ɂ̏�̕��ɂ��܂�����";
		mes "��������b�������Ă��������B";
		mes "���ꂮ�����������I�@�ł���I";
		next;
		cutin "ep19_iwin01.png", 255;
		cloakonnpc "�z����#ep20_re01";
		cloakoffnpc "�z����#ep20_re07";
		mes "�]�C�X�K���h ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�C�X�K���h ������";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	case 11:
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "���������u�Ɋւ��钲����";
		mes "�I������悤�ł���B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 12:
		cutin "ep19_leon04.png", 2;
		mes "[���I��]";
		mes "�O�ɒ�������Ƒ̉��������Ă��܂��܂��B";
		mes "���J�Ɍ�������Ȃ�";
		mes "������������S�����Ă��������B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 14:
		cutin "ep19_leon04.png", 2;
		mes "[���I��]";
		mes "�s���s���ɂȂ����ƕ�����";
		mes "�S�z���Ă��܂����B";
		mes "�����������݂����ł��ˁB";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	case 15:
		cutin "ep19_leon04.png", 2;
		mes "[���I��]";
		mes "���B���S�O���Ă���Ԃ�";
		mes "�z���͌v���i�߂�͂��ł��B";
		mes "�������܂莞�Ԃ͂���܂���B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 1 || EP20_1QUE == 2 || EP20_1QUE == 5 || EP20_1QUE == 6)
		showevent 0, 1, "���I��#ep20_re01";
	else
		showevent 9999,0, "���I��#ep20_re01";
	end;
}
icas_in.gat,260,202,5	script(CLOAKED)	�I�[�����[#ep20_re01	10465,{/* 3338 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "����c�c�s���K�v�͂Ȃ��Ǝv���Ă�����";
		mes "�z�炪������Ȃ��ȏ�";
		mes "���̏ꏊ�𒲂ׂȂ��킯�ɂ�";
		mes "�����Ȃ��Ȃ����ȁB";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_aurelie02.png", 0;
		mes "[�I�[�����[]";
		mes "�������ʂ͂��������ȁH";
		mes "���̕\��������";
		mes "���������Ă����݂��������ǁH";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep19_aurelie04.png", 0;
		mes "[�I�[�����[]";
		mes "���F���O���f�̒�����҂��܂��傤�B";
		mes "���̊Ԃ́A�������ł������ˁB";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_aurelie02.png", 0;
		mes "[�I�[�����[]";
		mes "�������I������݂����B";
		mes "�x�e����ɂ������������ȁH";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����ԁA�҂��������邱�ƂɂȂ邩���B";
		mes "�g�̂��₦����߂��ė���";
		mes "�����������ő̂����߂āB";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "��ςȖڂɑ������񂾂��āH";
		mes "���v�H";
		mes "����͂Ȃ��H";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����͂��Ȃ��ŁB";
		mes "�댯���Ɣ��f������";
		mes "�����Ɉ����Ԃ����ƁB";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	end;
}
icas_in.gat,263,200,3	script(CLOAKED)	���C�W�[#ep20_re01	10454,{/* 3339 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�T����ꏊ�͑S���T�����񂾂��Ȃ��B";
		mes "���āA���ꂩ��ǂ�������肾�낤�H";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����������\�Ƃ������I";
		mes "���B�̖��Ɗ�]�I";
		mes "�c�c�ł͖�����";
		mes "���J�Ō��������̂����B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "��`���邱�Ƃ͖�������������";
		mes "���͒ނ�ł����Ă����B";
		mes "�A�[�E�B���������A���������ނ���";
		mes "�Љ�Ă����ƌ������炳�I";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���ނ�H";
		mes "�悩������I�@�������[�y��������!!";
		mes "��������ނꂽ����";
		mes "�A�[�E�B���̎q��������";
		mes "�S��������������B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�G�Ɍ�����Ȃ��悤��";
		mes "�e�l������đ҂��������悤�B";
		mes "�ދ����낤���ǐS�z����ȁB";
		mes "���͉B���s�����鎞��";
		mes "�O�ꂵ�Ē���Ȃ��񂾁B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "��l�Ƃ��������������I";
		mes "�}�ɂǂ����s�����Ⴄ����";
		mes "�݂�ȐS�z���Ă��񂾂��I";
		mes "����ŉ����������H";
		next;
		cutin "ep19_leizi01.png", 255;
		menu "���K���ɕ߂܂������Ƃ��������",-;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�c�c�}�W���H";
		mes "���K�����A�[�E�B���ɕϐg�������āH";
		mes "�͂��A���ꂽ�ȁB";
		mes "�铹�Ŕw�ォ�炢���Ȃ�";
		mes "����ꂽ���݂����ȃV���b�N���I";
		emotion 0,"���C�W�[#ep20_re01",1;
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�C���ȗ\����������܂����c�c";
		mes "�A�[�E�B���ɉ��������K����";
		mes "������Ă���\��������Ȃ�āI";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[���n�[��]";
		mes "���ꂾ�����Ⴀ��܂���B";
		mes "���K�������́A�ϐg�����������̐��̂�";
		mes "���j��p���������ƌ����Ă��܂����B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�����Ă܂����A���B";
		mes "���ꂩ��̓��K���ɕϐg���Ă�";
		mes "�K���������S�Ƃ͌����Ȃ����Ă킯���B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���̓o�S�b�g�������Ă����Ƃ���";
		mes "�u���̏ꏊ�v�Ƃ����̂��C�ɂȂ�B";
		mes "���X�K���h���Ŏ����Ă���ꏊ�Ƃ�";
		mes "���������c�c�B";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�������������Ă��ꂽ�����L��";
		mes "�u���̏ꏊ�v�Ƃ������t���o��x��";
		mes "�ߏ�Ȕ����������Ă��܂����B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���̔����L�́A���B�𓦂����Ă��ꂽ��";
		mes "���R�Ǝp�������Ă��܂����B";
		mes "���̊Ԃɂ������";
		mes "���̊Ԃɂ������Ă�����ł��B";
		mes "��b�c�c�݂����Ȃ��̂ł��傤���B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���ʓI�Ƀ��K�������̋��ꏊ��";
		mes "�������܂�����";
		mes "�ˑR�Ƃ��āA�킩��Ȃ����Ƃ΂���ł��B";
		mes "��񂪕s�����Ă��܂��B";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[���I��]";
		mes "���𓾂邽�߂ɂ�";
		mes "�z���̖{���n��";
		mes "�N������K�v������ł��傤�B";
		next;
		mes "[���I��]";
		mes "���B���S�O���Ă���Ԃ�";
		mes "�z���͌v���i�߂�͂��ł��B";
		mes "����܂ňȏ�Ɋ댯�������܂���";
		mes "�z���̖{���n�𒲍����ė���";
		mes "���炦�܂��񂩁H";
		next;
		cutin "ep19_leon01.png", 255;
		menu "�C���Ă�������",-;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�������ł��I";
		mes "�E�o���Ă��������������炱��";
		mes "�ē��ł���Ƃ������̂ł��I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�������s�������܂��B";
		mes "�����W������Ȃ�";
		mes "�l�肪���������ǂ��ł��傤�B";
		next;
		mes "[�~���A��]";
		mes "�ϐg�������B�����j��p��";
		mes "����Ƃ̂��Ƃł���";
		mes "�����댯�͏��m���Ă��܂��B";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�b�𕷂����肶��";
		mes "���B�����K���ɕϐg�����Ƃ��Ă�";
		mes "���S�Ɍ���������킯����";
		mes "�Ȃ��񂾂�H";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�܂�A���K���ɕϐg����̂�";
		mes "������x�͗L�����Ă��Ƃ��B";
		mes "�悵�A����̓��F���O���f�l����";
		mes "���΂��������������čs�����I";
		next;
		mes "[���C�W�[]";
		mes "�G�̖{���n�ɂ͏㋉�̃��K��������";
		mes "�����̃��K���͂��Ȃ��B";
		mes "�ϐg����ɂ��Ă�";
		mes "�㋉���K���ɕϐg���Ȃ�����";
		mes "��肭�����Ȃ����낤�B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���ꂪ�ǂ��ł��傤�B";
		mes "�c����́A�A�[�E�B���ɕϐg���Ă���";
		mes "���K���������邱�Ƃł���";
		mes "���̌��Ɋւ��Ă͐S�z���p�ł��I";
		next;
		mes "[�z����]";
		mes "�䂪�A�[�E�B���̒��ɐ��Ƃ����܂��I";
		mes "�u�I�����������v���X�p�C����肢����";
		mes "�����o���Ă����ł��傤�I";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���ꂶ�Ⴀ�A�����������J�n���B";
		mes "�Ђ�`�X�p�C������Ă킯���I";
		mes "���̎��ɒ��񊈓��ŏ����𒧂񂾂���";
		mes "�΂������������Ă�낤����Ȃ��H";
		next;
		mes "[���C�W�[]";
		mes "�������ł�����";
		mes "�ւ̑��̖�̑O�ŏW�������I";
		emotion 2,"���C�W�[#ep20_re01",1;
		next;
		cutin "ep19_leizi03.png", 255;
		chgquest 16703,16704;
		set EP20_1QUE,15;
		mes "�]�ւ̑��̖�̑O��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�ւ̑��̖�̑O��";
		mes "�@���������]";
		close2;
		warp "jor_nest.gat", 38, 270;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���ꂶ�Ⴀ�A�����������J�n���B";
		mes "�Ђ�`�X�p�C������Ă킯���I";
		mes "���̎��ɒ��񊈓��ŏ����𒧂񂾂���";
		mes "�΂������������Ă�낤����Ȃ��H";
		next;
		mes "[���C�W�[]";
		mes "�������ł�����";
		mes "�ւ̑��̖�̑O�ŏW�������I";
		emotion 2,"���C�W�[#ep20_re01",1;
		next;
		cutin "ep19_leizi03.png", 255;
		mes "�]�ւ̑��̖�̑O��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�ւ̑��̖�̑O��";
		mes "�@���������]";
		close2;
		warp "jor_nest.gat", 38, 270;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 14 || EP20_1QUE == 15)
		showevent 0, 1, "���C�W�[#ep20_re01";
	else
		showevent 9999,0, "���C�W�[#ep20_re01";
	end;
}
icas_in.gat,259,200,7	script(CLOAKED)	�~���A��#ep20_re01	10377,{/* 3340 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�T����ꏊ�͒T��������";
		mes "���ʂ͏o�ĂȂ��ˁB";
		mes "���̂܂ܓ������Ƃ����Ă��Ă�";
		mes "���v���ȁH";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���n�[�����񂪌��������̂�";
		mes "�F����Ɍ��Ă��炢�܂��傤�B";
		mes "�ł��A������Ĉ�̂Ȃ�Ȃ񂾂낤�H";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep18_miriam_02.png", 0;
		mes "[�~���A��]";
		mes "�}�Ɏ��Ԃ��ł��Ă��܂��܂����ˁB";
		mes "���āA����������ǂ����c�c";
		mes "�{�N�͂�����ƍl���Ă݂܂��B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep18_miriam_02.png", 0;
		mes "[�~���A��]";
		mes "�������x�߂܂������H";
		mes "�{�N�͏�̒���";
		mes "���������������Ă܂���Ă��܂����B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep18_miriam_02.png", 0;
		mes "[�~���A��]";
		mes "�Ď����鑕�u��";
		mes "���������ɂ���������";
		mes "������čs�����Ȃ��ƁB";
		mes "�댯������";
		mes "���Ȃ��킯�ɂ͂����Ȃ��B";
		close2;
		cutin "ep18_miriam_02.png", 255;
		end;
	}
	else if(EP20_1QUE == 13) {
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�����A"+strcharinfo(0)+"����I";
		mes "���n�[��������I";
		mes "��l�Ƃ��}�ɂ��Ȃ��Ȃ�������";
		mes "�݂�ȐS�z���Ă���ł���B";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "���B�͑��v�ł��B";
		mes "������A�F������W�߂Ă��������B";
		mes "�}���ŕ񍐂��Ȃ��Ƃ����Ȃ����Ƃ�";
		mes "�����ł��B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�킩��܂����B";
		mes "�F������Ă�ł��܂��I";
		chgquest 16702,16703;
		set EP20_1QUE,14;
		close2;
		cutin "ep18_miriam_01.png", 255;
		warp "icas_in.gat", 262, 195;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�}���ŕ񍐂��Ȃ��Ƃ����Ȃ����Ƃ���";
		mes "�Ȃ�ł��傤�H";
		mes "�{���ɋx�܂Ȃ��Ă����v�ł����H";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�A�[�E�B���ɉ��������K��������";
		mes "���͂�������Ă���Ǝv����";
		mes "�]�b�Ƃ���ȁc�c�B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 13)
		showevent 0, 1, "�~���A��#ep20_re01";
	else
		showevent 9999,0, "�~���A��#ep20_re01";
	end;
}
icas_in.gat,262,198,3	script(CLOAKED)	���n�[��#ep20_re01	10469,{/* 3341 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "���������āA�܂��T���ĂȂ��ꏊ���H";
		mes "���c�c���������΁A�������c�c�B";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "���̂��蕿����Ȃ��ł����H";
		mes "�܂��A���̑��u��������ꂽ�̂�";
		mes "�^���ǂ��������������ł����B";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 6) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�`���җl�͂������x��ł��������B";
		mes "���͑̂�b���Ă��܂��I";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�������芾�𗬂��Ă��܂�����I";
		mes "�����������C�ɂ������Ă����̂�";
		mes "�C���\���ł��I";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�ݒu���ꂽ���u��������܂��傤�B";
		mes "�������ł�����";
		mes "��̑O�ɏW�܂��Ă��������B";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�݂�Ȃɑ����񍐂��Ȃ��ƁI";
		mes "�b���Ȃ��Ƃ����Ȃ����Ƃ�";
		mes "�������܂���I";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "������������߂��z���";
		mes "�Ƃ����߂Ă��܂��傤�I";
		close2;
		cutin "ep19_lehar03.png", 255;
		end;
	}
	end;
}
icas_in.gat,259,197,1	script(CLOAKED)	�z����#ep20_re01	10461,{/* 3342 (cloaking)*/
	if(EP20_1QUE <= 2) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�{���ł��Ă��Ȃ��ꏊ������H";
		mes "�c�c���̋L�����m���Ȃ�";
		mes "�ꂩ���A�S�����肪����܂��B";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�����c�c";
		mes "���J�ł͂Ђǂ��ڂɑ����܂����B";
		mes "����ŉ��������ł��ĂȂ�������";
		mes "���܂葹�ɂȂ�Ƃ���ł�����B";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "��������`���Ă�������";
		mes "���肪�Ƃ��������܂����B";
		mes "�܂��킩��Ȃ����Ƃ�����܂���";
		mes "���͂�������ۗ��Ƃ��܂��傤�B";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "������Ȃ��悤��";
		mes "�ݒu���ꂽ���u��������c�c";
		mes "����͔E�ϗ͂��K�v�ł���B";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 14) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�������ŉ����ł��I";
		mes "�{���ɐS�z���܂�����I";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	else if(EP20_1QUE == 15) {
		cutin "ep19_iwin08.png", 2;
		mes "[�z����]";
		mes "�܂����A�[�E�B���ɕϐg����Ȃ�āI";
		mes "�c�c�܁A���B���ЂƂ̂��Ƃ�";
		mes "�����Ȃ��ł����ǁB";
		close2;
		cutin "ep19_iwin01.png", 255;
		end;
	}
	end;
}
icas_in.gat,260,205,5	script(CLOAKED)	���F���O���f#ep20_re01	10468,{/* 3343 (cloaking)*/
	if(EP20_1QUE <= 6) {
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�����Ă������u��";
		mes "�������ׂĂ�������";
		mes "���̊Ԃɑ������ł����Ă����āB";
		mes "�x�߂邤���ɋx��ł����̂�";
		mes "��؂Ȃ��Ƃ�����ˁB";
		close2;
		cutin "ep19_vellgunde01.png", 255;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_vellgunde01.png", 2;
		cloakonnpc "�z����#ep20_re07";
		cloakonnpc "���F���O���f#ep20_re02";
		mes "[���F���O���f]";
		mes "�݂�ȁA�W�܂����H";
		mes "�������ו����Ă���Ԃ�";
		mes "������Ƒ������͂ł���������B";
		mes "�x�߂鎞�ɂ�����Ƌx�ނ̂�";
		mes "�d���̂���������ˁB";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "���ꂶ�Ⴀ�A�����̌��ʂ�񍐂����B";
		mes "����́A���͋z�����u�ˁB";
		mes "���̖͂��͂��z�����A�����ۑ�����B";
		next;
		cutin "ep19_vellgunde02.png", 2;
		mes "[���F���O���f]";
		mes "�������A��x�z���グ���ꏊ�̖��͂�";
		mes "��x�ƌ��ɖ߂�Ȃ��ق�";
		mes "�O��I�ɋz�������B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�������ȁ`�B";
		mes "���������ɐ��i�̈����z��";
		mes "������ɈႢ�Ȃ��B";
		next;
		emotion 9,"���F���O���f#ep20_re02",1;
		cutin "ep19_vellgunde03.png", 2;
		mes "[���F���O���f]";
		mes "���炭�����������̂́A�o�S�b�g�ˁB";
		mes "�����܂Ő���������";
		mes "�݌v�v�z���Ɠ�������B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�o�S�b�g���c�c�I";
		mes "���̑��u�ɖ��͂�ۑ�����";
		mes "���������ǂ������ł��傤�B";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "��������������ǁc�c";
		mes "���͂����^���ɂȂ������u���������";
		mes "���K�������̖{���n�։^�Ԃ��̂�";
		mes "�v�����B";
		next;
		mes "[���F���O���f]";
		mes "�܂�A���̑��u��������Ă���";
		mes "���K���������āA���s���邱�Ƃ�";
		mes "�z��̖{���n�������o���邩���B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�ݒu����Ă��鑕�u��";
		mes "�Ď�����Ηǂ��ƁH";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�E�ϗ͂̏����ɂȂ肻���ł��ȁc�c�B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�Ñ�A�C�X�E�B���h�ɒǂ��񂳂����";
		mes "����ۂǋC���y����Ȃ��H";
		mes "�悵�A�l���Ƌ������߂悤�I";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�킩��܂����I";
		mes "���̑I��ƒS���̊���U���";
		mes "����Ă����܂�����";
		mes "�������ł����l��";
		mes "��̑O�ɏW�܂��Ă��������B";
		next;
		cutin "ep19_lehar05.png", 255;
		chgquest 16700,16701;
		set EP20_1QUE,12;
		mes "�]��̑O��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]��̑O��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 201, 165;
		end;
	}
	else if(EP20_1QUE == 12) {
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�܂��A���낢��Z�����Ȃ肻���ˁB";
		next;
		cutin "ep19_vellgunde01.png", 255;
		mes "�]��̑O��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]��̑O��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 201, 165;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 11 || EP20_1QUE == 12)
		showevent 0, 1, "���F���O���f#ep20_re01";
	else
		showevent 9999,0, "���F���O���f#ep20_re01";
	end;
}

jor_back5.gat,353,73,0	script	#ep20_re02	139,5,5,{/* 3344 */
	if(EP20_1QUE == 2 || EP20_1QUE == 3) {
		cloakoffnpc "���C�W�[#ep20_re02";
		cloakoffnpc "�~���A��#ep20_re02";
		cloakoffnpc "���n�[��#ep20_re02";
		cloakoffnpc "�z����#ep20_re02";
	}
	end;
}
jor_back5.gat,350,75,3	script(CLOAKED)	���n�[��#ep20_re02	10469,{/* 3345 (cloaking)*/
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "���̏ꏊ��";
	mes "���b����̂Ɍ����Ă܂���ˁB";
	mes "�ړ����܂��傤�B";
	close2;
	cutin "ep19_lehar02.png", 255;
	if(EP20_1QUE == 2)
		warp "jor_safty1.gat", 67, 331;
	else if(EP20_1QUE == 3)
		warp "jor_safty1.gat", 198, 328;
	end;
OnQuestInfo:
	if(EP20_1QUE == 2 || EP20_1QUE == 3)
		showevent 0, 1, "���I��#ep20_re02";
	else
		showevent 9999,0, "���I��#ep20_re02";
	end;
}
jor_back5.gat,350,72,5	script(CLOAKED)	���C�W�[#ep20_re02	10454,{/* 3346 (cloaking)*/
	cutin "ep19_leizi01.png", 2;
	mes "[���C�W�[]";
	mes "�ف`�B";
	mes "�������u�Ñ�̕X�̋��J�v���B";
	close2;
	cutin "ep19_leizi01.png", 255;
	end;
}
jor_back5.gat,348,78,3	script(CLOAKED)	�~���A��#ep20_re02	10377,{/* 3347 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�Ñ�A�C�X�E�B���h�c�c";
	mes "�A�[�E�B�������Ƃ͂����Ԃ��";
	mes "�p���Ⴂ�܂��ˁB";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_back5.gat,353,77,5	script(CLOAKED)	�z����#ep20_re02	10461,{/* 3348 (cloaking)*/
	cutin "ep19_iwin06.png", 2;
	mes "[�z����]";
	mes "����Ȃ��悤�ɋC��t���ĕ����āI";
	mes "�]�ԂƑ�ς�����B";
	close2;
	cutin "ep19_iwin01.png", 255;
	end;
}

jor_safty1.gat,64,328,5	script	���n�[��#ep20_re03	10469,{/* 3349 */
	if(EP20_1QUE == 2) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�������u�Ñ�̕X�̋��J�v�ł��B";
		mes "�Ñ�A�C�X�E�B���h�̓꒣����ł�����";
		mes "�C��t���Ă��������B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�������n�`�ł��ˁB";
		mes "�����ɂ��C��t���Ȃ��Ɓc�c�B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "������I";
		mes "�g��Ⴍ���ĉB��āI";
		mes "�Ñ�A�C�X�E�B���h�ł��I";
		next;
		cutin "ep19_lehar02.png", 255;
		cloakoffnpc "�Ñ�A�C�X�E�B���h#ep20";
		mes "[�Ñ�A�C�X�E�B���h]";
		mes "�\�\�\�\�\�\�I�I�I";
		next;
		// �d�l
		misceffect 962,"�z����#ep20_re03",0;
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "���A�����������`�`�`���I";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "������ƁA�ǂ��Ȃ��Ă�H";
		mes "���̃f�J�C���A�z��������΂���";
		mes "�U�����ĂȂ��H";
		mes "���t���ʂ���񂶂�Ȃ���??";
		next;
		// �d�l
		misceffect 962,"�z����#ep20_re03",0;
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "��A���R�͂킩��܂��񂪁I";
		mes "���A���̂����`�`���I";
		mes "������I�@�{���Ă�݂����ł���!!";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "��������500�����ꂽ�ꏊ��";
		mes "�W���m�[�̓`���I�ȃ_���X��";
		mes "�x���Ă����Ƃ��Ă�";
		mes "���̒����{���Ă���̂͂킩���B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "��k�����Ă�ꍇ����Ȃ��ł���I";
		mes "�꒣�肩�痣��Ȃ��Ɓc�c�F����I";
		mes "���̌�ɂ��ė��Ă��������I";
		next;
		cutin "ep19_lehar05.png", 255;
		chgquest 16691,16692;
		set EP20_1QUE,3;
		mes "�]���S�ȏꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���S�ȏꏊ��";
		mes "�@���������]";
		close2;
		warp "jor_safty1.gat", 198, 328;
		end;
	}
	if(EP20_1QUE == 3) {
		//
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "��k�����Ă�ꍇ����Ȃ��ł���I";
		mes "�꒣�肩�痣��Ȃ��Ɓc�c�F����I";
		mes "���̌�ɂ��ė��Ă��������I";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "�]���S�ȏꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���S�ȏꏊ��";
		mes "�@���������]";
		close2;
		warp "jor_safty1.gat", 198, 328;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 2 || EP20_1QUE == 3)
		showevent 0, 1, "���n�[��#ep20_re03";
	else
		showevent 9999,0, "���n�[��#ep20_re03";
	end;
}
jor_safty1.gat,67,327,5	script	���C�W�[#ep20_re03	10454,{/* 3350 */
	cutin "ep19_leizi02.png", 2;
	mes "[���C�W�[]";
	mes "������I�@�f�J�C�������邼�I";
	close2;
	cutin "ep19_leizi02.png", 255;
	end;
}
jor_safty1.gat,71,329,3	script	�~���A��#ep20_re03	10377,{/* 3351 */
	cutin "ep18_miriam_03.png", 0;
	mes "[�~���A��]";
	mes "�C��t���Ă��������B";
	mes "���f�֕��ł��B";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_safty1.gat,70,332,5	script	�z����#ep20_re03	10461,{/* 3352 */
	cutin "ep19_iwin06.png", 2;
	mes "[�z����]";
	mes "���͌Ñ�A�C�X�E�B���h�����̌��t��";
	mes "������x�A�����ł��܂��I";
	mes "�c�c������x�B";
	close2;
	cutin "ep19_iwin07.png", 255;
	end;
}
jor_safty1.gat,72,333,3	script(CLOAKED)	�Ñ�A�C�X�E�B���h#ep20	21966,{/* 3353 (cloaking)*/
	mes "[�Ñ�A�C�X�E�B���h]";
	mes "�\�\�\�\�\�\�I�I�I";
	close;
}

jor_safty1.gat,195,327,5	script	���n�[��#ep20_re04	10469,{/* 3354 */
	if(EP20_1QUE != 3) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���͂𒲍����āA������������";
		mes "�����ɏW�܂�܂��傤�B";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "�]�Ñ�̕X�̋��J ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�Ñ�̕X�̋��J ������";
		mes "�@���������]";
		close2;
		warp "jor_back5.gat", 355, 350;
		end;
	}
	cutin "ep19_lehar04.png", 2;
	mes "[���n�[��]";
	mes "�͂��͂��c�c�B";
	mes "�����Ȃ���S�Ȃ͂��ł��c�c";
	mes "������Ƌx�݂܂��傤�B";
	next;
	cutin "ep19_leizi02.png", 2;
	mes "[���C�W�[]";
	mes "����`�r�b�N�������ȁI";
	mes "����ȃf�J�C���ɒǂ��񂳂��Ȃ�āI";
	mes "�����q�����";
	mes "�����̒n���ɏڂ����ėǂ�������I";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�̂͂����ɁA�`���������ɗ��Ă�";
	mes "�悭�ǂ��񂳂�Ă܂�������ˁB";
	mes "��񂿂Ⴞ���������̌o����";
	mes "���ɗ���������Ȃ�āB";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "����ɔ�ׂ�";
	mes "�������̔����܂�܂�́c�c";
	mes "�N�ƒN�̌��t���ʂ�����āH";
	mes "������������͂܂�����";
	mes "�R�~���j�P�[�V���������肪";
	mes "�Ȃ������݂��������ǁH";
	next;
	cutin "ep19_iwin06.png", 2;
	mes "[�z����]";
	mes "���ꂪ�c�c��A������܂���B";
	mes "�ȑO�́A����Ȍ������͂Ȃ������̂�!?";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�F����I";
	mes "���Ă��������A����c�c";
	mes "�����n�ʂɐݒu����Ă܂��B";
	next;
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "�ЂƂ�ӂ����Ⴀ��܂���ˁB";
	mes "����H�@���̑��u�����";
	mes "���̗͂���������܂��B";
	next;
	mes "[���n�[��]";
	mes "�c�c�ӂ���I";
	mes "�����c�c�т��Ƃ����Ȃ��B";
	mes "�������͖̂������c�c�B";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "�����ɂ����������u�́A���ׂȂ�����B";
	mes "�������@�͂Ȃ��H";
	mes "�o���V�Ă݂�H";
	next;
	cutin "ep19_leizi03.png", 255;
	menu "��̂���͓̂�����ł�",-;
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "�����݂������ȁB";
	mes "��������n�ʂɌŒ肳��Ă��邵�B";
	mes "�ǂ��ɂ����Ď����ċA��c�c�B";
	next;
	cutin "ep19_iwin09.png", 2;
	mes "[�z����]";
	mes "���A�����!?";
	mes "����́A�ǂ���������!!??";
	next;
	cutin "ep19_iwin09.png", 2;
	mes "[�z����]";
	mes "��������Ă��������I";
	mes "�A�[�E�B���̉H�тł��I";
	mes "����ɁA��������Ƃł���";
	mes "�A�[�E�B���̑��Ղ��c���Ă܂��I";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�Ñ�A�C�X�E�B���h�̑��Ղł́c�c�H";
	next;
	cutin "ep19_iwin07.png", 2;
	mes "[�z����]";
	mes "����Ȗ�؂Ȓ���";
	mes "���҂����̋�ʂ����Ȃ���ł����I";
	mes "�ق�A���̂ӂ�ӂ�Ō����ȉH��!!";
	mes "����ȃS���S���ȉH�т�";
	mes "�ꏏ�ɂ��Ȃ��ŁI";
	emotion 7,"�z����#ep20_re04",1;
	next;
	menu "�A�[�E�B���������ɂ����H",-;
	cutin "ep19_iwin09.png", 2;
	mes "[�z����]";
	mes "�c�c���`�`��B";
	mes "���A�A�[�E�B���ȊO�̍��Ղ�����܂��B";
	mes "�������������������̂悤�ȁc�c�B";
	next;
	cutin "ep18_miriam_02.png", 0;
	mes "[�~���A��]";
	mes "����́c�c";
	mes "���o��������܂���ˁH";
	emotion 19,"�~���A��#ep20_re04",1;
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "���K���I";
	mes "���K�����ɂ��ɂ��ƈړ������Ղ��I";
	mes "�ق�A���̗؂̐ՁI�@�ԈႢ�Ȃ��B";
	mes "���ɓz��̍��Ղ����������I";
	next;
	cutin "ep19_iwin06.png", 2;
	mes "[�z����]";
	mes "���̕t�߂𒲍����Ȃ���΁I";
	mes "�T�d�ɁI�@���Ӑ[���I";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�������܂��傤�B";
	mes "���͂𒲍����āA������������";
	mes "�����ɏW�܂�܂��傤�B";
	mes "�o���o���ɓ����̂͊댯�ł�����ˁB";
	next;
	cutin "ep19_iwin06.png", 255;
	chgquest 16692,16693;
	set EP20_1QUE,4;
	mes "�]�Ñ�̕X�̋��J ������";
	mes "�@�������܂����H�]";
	next;
	if(select("������","��߂�") == 2) {
		mes "�]���̏�ɂƂǂ܂����]";
		close;
	}
	//
	mes "�]�Ñ�̕X�̋��J ������";
	mes "�@���������]";
	close2;
	warp "jor_back5.gat", 355, 350;
	end;
OnQuestInfo:
	if(EP20_1QUE == 3 || EP20_1QUE == 4)
		showevent 0, 1, "���n�[��#ep20_re04";
	else
		showevent 9999,0, "���n�[��#ep20_re04";
	end;
}
jor_safty1.gat,194,325,5	script	���C�W�[#ep20_re04	10454,{/* 3355 */
	cutin "ep19_leizi02.png", 2;
	mes "[���C�W�[]";
	mes "�z��������A�b���Ⴍ�Ȃ��H";
	mes "�Ñ�A�C�X�E�B���h�̈����ł��������H";
	close2;
	cutin "ep19_leizi03.png", 255;
	end;
}
jor_safty1.gat,198,324,1	script	�~���A��#ep20_re04	10377,{/* 3356 */
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�ǂ����Ă���Ȃ�";
	mes "�z��������ɑ΂��čU���I�������񂾂�H";
	mes "�������R�����肻�������ǁB";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_safty1.gat,201,327,3	script	�z����#ep20_re04	10461,{/* 3357 */
	cutin "ep19_iwin09.png", 2;
	mes "[�z����]";
	mes "���͐a�m�Ȃ̂ň����Ȃ�Č����܂���I";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
}
jor_safty1.gat,209,324,3	script	���͂̊�������ݒu��#01	10538,{/* 3358 */
	mes "�]���͂̊�������";
	mes "�@��ȑ��u���ݒu����Ă���]";
	close;
}
jor_safty1.gat,205,320,3	script	���͂̊�������ݒu��#02	10539,{/* 3359 */
	mes "�]���͂̊�������";
	mes "�@��ȑ��u���ݒu����Ă���]";
	close;
}
jor_safty1.gat,201,323,3	script	���͂̊�������ݒu��#03	10538,{/* 3360 */
	mes "�]���͂̊�������";
	mes "�@��ȑ��u���ݒu����Ă���]";
	close;
}
jor_safty1.gat,197,320,3	script	���͂̊�������ݒu��#04	10539,{/* 3361 */
	mes "�]���͂̊�������";
	mes "�@��ȑ��u���ݒu����Ă���]";
	close;
}
jor_safty1.gat,189,325,3	script	���͂̊�������ݒu��#05	10540,{/* 3362 */
	mes "�]���͂̊�������";
	mes "�@��ȑ��u���ݒu����Ă���]";
	close;
}

jor_back5.gat,353,352,0	script	#ep20_re03	139,5,5,{/* 3363 */
	if(EP20_1QUE == 4) {
		cloakoffnpc "�~���A��#ep20_re05";
		cloakoffnpc "���C�W�[#ep20_re05";
		cloakoffnpc "���n�[��#ep20_re05";
		cloakoffnpc "�z����#ep20_re05";
		cloakoffnpc "���͂̊�������ݒu��#";
	}
	else if(EP20_1QUE == 5) {
		cloakoffnpc "�~���A��#ep20_re05";
	}
	end;
}
jor_back5.gat,353,357,7	script(CLOAKED)	�~���A��#ep20_re05	10377,{/* 3364 (cloaking)*/
	if(EP20_1QUE == 4) {
		cutin "ep18_miriam_03.png", 0;
		mes "[�~���A��]";
		mes "�F����A���Ă��������B";
		mes "���̕X�̒��Ɍ�����̂́c�c";
		mes "�����͖��f�ł��Ȃ��̂�";
		mes "���S�ȏꏊ�ɍs���Ęb�����܂��傤�B";
		close2;
		cutin "ep18_miriam_01.png", 255;
		warp "jor_safty1.gat", 333, 329;
		end;
	}
	else if(EP20_1QUE == 5) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�u�X�̏�v�ɖ߂낤���B";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "�]�C�X�K���h �X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�C�X�K���h �X�̏��";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	}
OnQuestInfo:
	if(EP20_1QUE == 4 || EP20_1QUE == 5)
		showevent 0, 1, "�~���A��#ep20_re05";
	else
		showevent 9999,0, "�~���A��#ep20_re05";
	end;
}
jor_back5.gat,352,355,7	script(CLOAKED)	���C�W�[#ep20_re05	10454,{/* 3365 (cloaking)*/
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "����`�A������Ă��������āc�c";
	mes "�J�b�`�J�`�ɓ���������Ă�ȁB";
	close2;
	cutin "ep19_leizi02.png", 255;
	end;
}
jor_back5.gat,355,354,7	script(CLOAKED)	���n�[��#ep20_re05	10469,{/* 3366 (cloaking)*/
	cutin "ep19_lehar05.png", 2;
	mes "[���n�[��]";
	mes "����H";
	mes "������Ă��������āc�c";
	mes "�����čs����񂶂�c�c�I";
	close2;
	cutin "ep19_lehar03.png", 255;
	end;
}
jor_back5.gat,356,355,3	script(CLOAKED)	���͂̊�������ݒu��#	10540,{/* 3367 (cloaking)*/
	mes "�]���͂̊�������";
	mes "�@��ȑ��u���ݒu����Ă���]";
	close;
}
jor_back5.gat,353,353,7	script(CLOAKED)	�z����#ep20_re05	10461,{/* 3368 (cloaking)*/
	cutin "ep19_iwin08.png", 2;
	mes "[�z����]";
	mes "����!?";
	mes "������āA���������āI";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
}

jor_safty1.gat,330,327,5	script	�~���A��#ep20_re06	10377,{/* 3369 */
	if(EP20_1QUE != 4) {
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�����ł��ˁB";
		mes "��������u�X�̏�v�ɖ߂�܂��傤�B";
		next;
		cutin "ep18_miriam_01.png", 255;
		mes "�]�C�X�K���h �X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�C�X�K���h �X�̏��";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 261, 196;
		end;
	}
	cutin "ep18_miriam_03.png", 0;
	mes "[�~���A��]";
	mes "�˂�����œ���t���Ă�������";
	mes "�F���񌩂܂�����ˁH";
	mes "�c�c���K���̎��̂ł����B";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "�ǂ����A�Ñ�A�C�X�E�B���h������";
	mes "���ꂽ�݂������ȁB";
	mes "�߂��ɑ��炵�����̂�����������";
	mes "���ł��������Ƃ��Ă��ꂽ�̂��ȁH";
	next;
	cutin "ep19_lehar02.png", 2;
	mes "[���n�[��]";
	mes "�ӂӂӁc�c�W���[��!!";
	mes "���̋��낵�����ꂩ��";
	mes "�����Ă��܂�����I";
	mes "�����A���Ă�������!!";
	next;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "���H";
	mes "�����������������Ă�����ł����H";
	next;
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "�܂��n�ʂɌŒ肳��ĂȂ�";
	mes "���̉��������u�ł��I";
	mes "���������K���̋߂��ɗ����Ă܂����B";
	mes "�����ݒu���Ă���Œ���";
	mes "�P��ꂽ�݂����ł���B";
	next;
	cutin "ep19_leizi01.png", 2;
	emotion 2,"���C�W�[#ep20_re06",1;
	mes "[���C�W�[]";
	mes "�����q�����I�@�����Z���X�����I";
	mes "���K���̍��Ղ����łȂ�";
	mes "���������u�܂Ŏ�ɓ��������I";
	mes "�����܂ŗ����b�オ��������`�B";
	next;
	mes "[���C�W�[]";
	mes "�悵�A��������X�̏�ɖ߂낤�B";
	mes "���̉��������u�ɂ���";
	mes "�ڂ������ׂȂ�����I";
	mes "����ȏ�A����������ɂ��Ă�";
	mes "�����ƌv�������������ǂ��B";
	next;
	cutin "ep19_leizi03.png", 255;
	menu "�������܂��傤",-;
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�����ł��ˁB";
	mes "�ł́u�X�̏�v�ɖ߂�܂��傤�B";
	next;
	cutin "ep18_miriam_01.png", 255;
	chgquest 16693,16694;
	set EP20_1QUE,5;
	mes "�]�C�X�K���h �X�̏��";
	mes "�@�������܂����H�]";
	next;
	if(select("������","��߂�") == 2) {
		mes "�]���̏�ɂƂǂ܂����]";
		close;
	}
	//
	mes "�]�C�X�K���h �X�̏��";
	mes "�@���������]";
	close2;
	warp "icas_in.gat", 261, 196;
	end;
OnQuestInfo:
	if(EP20_1QUE == 4 || EP20_1QUE == 5)
		showevent 0, 1, "�~���A��#ep20_re06";
	else
		showevent 9999,0, "�~���A��#ep20_re06";
	end;
}
jor_safty1.gat,336,327,3	script	���C�W�[#ep20_re06	10454,{/* 3370 */
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "�J�b�`�J�`�ɓ����Ă��ȁc�c";
	mes "�]�b�Ƃ����B";
	close2;
	cutin "ep19_leizi03.png", 255;
	end;
}
jor_safty1.gat,334,325,1	script	���n�[��#ep20_re06	10469,{/* 3371 */
	cutin "ep19_lehar02.png", 2;
	mes "[���n�[��]";
	mes "�ӂӂӁc�c";
	mes "�ǂ����̂��E���Ă����܂�����B";
	close2;
	cutin "ep19_lehar05.png", 255;
	end;
}
jor_safty1.gat,331,325,7	script	�z����#ep20_re06	10461,{/* 3372 */
	cutin "ep19_iwin06.png", 2;
	mes "[�z����]";
	mes "�����烋�K�����Ƃ��Ă�";
	mes "����Ȏp�ɂȂ�Ȃ�Ĉ���ł��B";
	close2;
	cutin "ep19_iwin08.png", 255;
	end;
}

icas_in.gat,259,216,0	script	#ep20_re04	139,5,5,{/* 3373 */
	if(EP20_1QUE >= 6 && EP20_1QUE <= 11)
		cloakoffnpc "�z����#ep20_re07";
	end;
}
icas_in.gat,259,219,5	script(CLOAKED)	�z����#ep20_re07	10461,{/* 3374 (cloaking)*/
	if(EP20_1QUE == 6) {
		cloakonnpc "���I��#ep20_re01";
		cloakonnpc "�I�[�����[#ep20_re01";
		cloakonnpc "���C�W�[#ep20_re01";
		cloakonnpc "�~���A��#ep20_re01";
		cloakonnpc "���n�[��#ep20_re01";
		cloakonnpc "���F���O���f#ep20_re01";
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�ӂށc�c"+strcharinfo(0)+"�l�B";
		mes "���͂ɐl�͂��܂���ˁH";
		mes "�c�c���������B";
		next;
		mes "[�z����]";
		mes "�c�c���J�{���̍ہA";
		mes "���K���̎��̂����������Ƃ�";
		mes "�L�떳��ɂȂ��Ă��܂��܂�����";
		mes "�A�[�E�B���̑��ՂƉH�т̐Ղ�";
		mes "���̏ꏊ�ɂ���܂�����ˁH";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "���ꂪ�C�|����Ŏd������܂���B";
		mes "�s���ȋC�����������Ɨ���Ȃ��̂ł��B";
		mes "���H�����A�[�E�B��������̂ł͂Ȃ���";
		mes "���邢�͕߂܂����A�[�E�B����";
		mes "����񂶂�Ȃ������āc�c�B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�ł�����A���Ƌ���";
		mes "�A�[�E�B���̎��H�҂����Ȃ���";
		mes "�����ɒ������ė~������ł��B";
		next;
		cutin "ep19_iwin01.png", 255;
		menu "�����ɁH",-;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�c�c�ň��̏󋵂�";
		mes "�z�肷��K�v�����邩��ł��B";
		mes "�����_�œ`���邱�Ƃł͂���܂��񂪁B";
		next;
		mes "[�z����]";
		mes "����ł́A���͓Y�������肢���܂��B";
		mes "���͏���𒲂ׂ܂��̂�";
		mes strcharinfo(0)+"�l�͕��ɂƗ��فc�c";
		mes "����ƘH�n���Ƃ������l�ڂɂ��ɂ���";
		mes "�ꏊ�̊m�F�����肢���܂��B";
		next;
		//cloakoffnpc "�g����#ep20_re01";
		//cloakoffnpc "�`������#ep20_re01";
		//cloakoffnpc "�H�n��#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		chgquest 16695,16696;
		set EP20_1QUE,7;
		mes "�]���ɂ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���ɂ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 186, 217;
		end;
	}
	else if(EP20_1QUE == 7) {
		mes "[�z����]";
		mes "���͏���𒲂ׂ܂��̂�";
		mes strcharinfo(0)+"�l�͕��ɂƗ��فc�c";
		mes "����ƘH�n���Ƃ������l�ڂɂ��ɂ���";
		mes "�ꏊ�̊m�F�����肢���܂��B";
		next;
		//cloakoffnpc "�g����#ep20_re01";
		//cloakoffnpc "�`������#ep20_re01";
		//cloakoffnpc "�H�n��#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		mes "�]���ɂ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ɂ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 186, 217;
		end;
	}
	else if(EP20_1QUE == 8) {
		mes "[�z����]";
		mes "���͏���𒲂ׂ܂��̂�";
		mes strcharinfo(0)+"�l�͕��ɂƗ��فc�c";
		mes "����ƘH�n���Ƃ������l�ڂɂ��ɂ���";
		mes "�ꏊ�̊m�F�����肢���܂��B";
		next;
		cloakoffnpc "�g����#ep20_re01";
		cloakoffnpc "�`������#ep20_re01";
		cloakoffnpc "�H�n��#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		mes "�]���ɂ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ɂ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 186, 217;
		end;
	}
	else if(EP20_1QUE == 9) {
		mes "[�z����]";
		mes "���͏���𒲂ׂ܂��̂�";
		mes strcharinfo(0)+"�l�͕��ɂƗ��فc�c";
		mes "����ƘH�n���Ƃ������l�ڂɂ��ɂ���";
		mes "�ꏊ�̊m�F�����肢���܂��B";
		next;
		cloakoffnpc "�g����#ep20_re01";
		cloakoffnpc "�`������#ep20_re01";
		cloakoffnpc "�H�n��#ep20_re01";
		cutin "ep19_iwin01.png", 255;
		mes "�]�H�n����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�H�n����";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 208, 236;
		end;
	}
	else if(EP20_1QUE == 10) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�߂��܂������I";
		mes "���肢���Ă��������̌��ʂ�";
		mes "�������ł��H";
		mes "�񍐂𕷂������̂ł����B";
		next;
		cutin "ep19_iwin01.png", 255;
		if(select("���ɖ������������c�c","������ƋC�|����Ȃ��Ƃ��c�c") == 1) {
			cutin "ep19_iwin06.png", 2;
			mes "[�z����]";
			mes "���ɉ����Ȃ��̂ł����";
			mes "�K���ł����c�c";
			mes "�{���ɉ����Ȃ������̂ł����H";
			next;
			cutin "ep19_iwin01.png", 255;
			menu "������ƋC�|����Ȃ��Ƃ��c�c",-;
		}
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�c�c�C�|����Ȃ��ƁH";
		mes "�ӂށc�c�ǂ����������̂ł����H";
		mes "�O�̂��ߊm�F�������ł��B";
		next;
		cutin "ep19_iwin01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�܂��A�N�������H�����Ƃ�";
		mes "�������Ȃ��Ȃ����A�Ƃ������Ƃ�";
		mes "�Ȃ��悤�ł��B";
		mes "�ނ���A�݂�ȐϋɓI��";
		mes "�������Ă���悤�ł����B";
		next;
		cutin "ep19_iwin01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����C�ɂȂ����̂�";
		mes "���ɂ̘H�n���Ō��������Ղł��B";
		mes "�N�����O������N�������悤��";
		mes "���Ղł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����́A�O��������Ă������Ղł���";
		mes "�o�čs�������Ղ͂���܂���ł����B";
		mes "���ӂ���K�v������悤�Ɏv���܂��B";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�c�c�c�c�c�c";
		mes "�����z�肵�Ă����ň��̏󋵂Ƃ�";
		mes "�قȂ�܂���";
		mes "�x�����������ǂ������ł��ˁB";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�����\�������܂��B";
		mes "�����z�肵�Ă���";
		mes "�ň��̏󋵂Ƃ����̂́c�c�B";
		next;
		cutin "ep19_vellgunde01.png", 2;
		cloakoffnpc "���F���O���f#ep20_re02";
		unittalk "�z���� : �n�b�I",1;
		mes "[���F���O���f]";
		mes "�b�ɔM�����Ă���Ƃ���";
		mes "�\����Ȃ�����";
		mes "���܂�Ă����������I�������B";
		mes "�F���Ă�ŗ��Ă��炦�Ȃ�������H";
		next;
		cloakonnpc "�z����#ep20_re07";
		cloakonnpc "���F���O���f#ep20_re02";
		cutin "ep19_vellgunde01.png", 255;
		cloakoffnpc "���I��#ep20_re01";
		cloakoffnpc "�I�[�����[#ep20_re01";
		cloakoffnpc "���C�W�[#ep20_re01";
		cloakoffnpc "�~���A��#ep20_re01";
		cloakoffnpc "���n�[��#ep20_re01";
		cloakoffnpc "�z����#ep20_re01";
		cloakoffnpc "���F���O���f#ep20_re01";
		chgquest 16699,16700;
		set EP20_1QUE,11;
		mes "�]���F���O���f�̏���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���F���O���f�̏���";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 257, 202;
		end;
	}
	else if(EP20_1QUE == 11) {
		cutin "ep19_vellgunde01.png", 2;
		cloakoffnpc "���F���O���f#ep20_re02";
		unittalk "�z���� : �n�b�I",1;
		mes "[���F���O���f]";
		mes "�b�ɔM�����Ă���Ƃ���";
		mes "�\����Ȃ�����";
		mes "���܂�Ă����������I�������B";
		mes "�F���Ă�ŗ��Ă��炦�Ȃ�������H";
		next;
		cloakonnpc "�z����#ep20_re07";
		cloakonnpc "���F���O���f#ep20_re02";
		cutin "ep19_vellgunde01.png", 255;
		cloakoffnpc "���I��#ep20_re01";
		cloakoffnpc "�I�[�����[#ep20_re01";
		cloakoffnpc "���C�W�[#ep20_re01";
		cloakoffnpc "�~���A��#ep20_re01";
		cloakoffnpc "���n�[��#ep20_re01";
		cloakoffnpc "�z����#ep20_re01";
		cloakoffnpc "���F���O���f#ep20_re01";
		mes "�]���F���O���f�̏���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���F���O���f�̏���";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 257, 202;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 6 && EP20_1QUE <= 10)
		showevent 0, 1, "�z����#ep20_re07";
	else
		showevent 9999,0, "�z����#ep20_re07";
	end;
}
icas_in.gat,260,217,5	script(CLOAKED)	���F���O���f#ep20_re02	10468,{/* 3375 (cloaking)*/
	cutin "ep19_vellgunde01.png", 2;
	mes "[���F���O���f]";
	mes "�b�ɔM�����Ă���Ƃ���";
	mes "�\����Ȃ�����";
	mes "���܂�Ă����������I�������B";
	mes "�F���Ă�ŗ��Ă��炦�Ȃ�������H";
	close2;
	cutin "ep19_vellgunde01.png", 255;
	end;
}
icas_in.gat,113,41,0	script	#ep20_re05	139,9,9,{/* 3376 */
	if(EP20_1QUE == 7 || EP20_1QUE == 8)
		cloakoffnpc "�g����#ep20_re01";
	end;
}
icas_in.gat,113,41,5	script(CLOAKED)	�g����#ep20_re01	10461,{/* 3377 (cloaking)*/
	if(EP20_1QUE == 7) {
		cutin "ep19_iwin02.png", 2;
		mes "[�g����]";
		mes "�h��I";
		mes "���ɂɂ́A�ǂ̂悤�ȗp����";
		mes "��������Ⴂ�܂������H";
		mes "���������������Ƃ�����ƁH";
		next;
		cutin "ep19_iwin02.png", 255;
		menu "�ŋ߁A�p�����Ȃ��A�[�E�B���͂��܂����H",-;
		cutin "ep19_iwin02.png", 2;
		mes "[�g����]";
		mes "�p�������Ȃ��A�[�E�B���H";
		mes "�ǂ������Ӗ��ł��傤�H";
		mes "�����Ă����邱�Ƃ��킩��܂���";
		mes "�X�̏����삷���炪";
		mes "�������狎�邱�Ƃ͂���܂���I";
		next;
		cutin "ep19_iwin02.png", 255;
		menu "�����A�[���Ӗ��͂���܂���",-;
		cutin "ep19_iwin02.png", 2;
		mes "[�g����]";
		mes "���B�͂�����";
		mes "��Ɍւ�������ď������Ă���܂��I";
		mes "�ނ���A����܂Ō��Ȃ�����";
		mes "�A�[�E�B���������^�ʖڂ�";
		mes "�����ɖ��߂Ă���܂��I";
		mes "�h��I";
		next;
		cutin "ep19_iwin02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�h��I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̏ꏊ���������Ă݂悤�B";
		mes "�@���͗��ق��������ȁH�j";
		next;
		chgquest 16696,16697;
		set EP20_1QUE,8;
		mes "�]���ق�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���ق�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 67, 222;
		end;
	}
	else if(EP20_1QUE == 8) {
		mes "["+strcharinfo(0)+"]";
		mes "�h��I";
		next;
		cutin "ep19_iwin02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̏ꏊ���������Ă݂悤�B";
		mes "�@���͗��ق��������ȁH�j";
		next;
		mes "�]���ق�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ق�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 67, 222;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 7 || EP20_1QUE == 8)
		showevent 0, 1, "�g����#ep20_re01";
	else
		showevent 9999,0, "�g����#ep20_re01";
	end;
}
icas_in.gat,85,113,0	script	#ep20_re06	139,5,5,{/* 3378 */
	if(EP20_1QUE == 8 || EP20_1QUE == 9)
		cloakoffnpc "�`������#ep20_re01";
	end;
}
icas_in.gat,92,113,5	script(CLOAKED)	�`������#ep20_re01	10461,{/* 3379 (cloaking)*/
	if(EP20_1QUE == 8) {
		cutin "ep19_iwin04.png", 2;
		mes "[�`������]";
		mes "����A���炠��I";
		mes "���̗��قɉ��̌�p�ł��傤�H";
		mes "�`���҂̊F����́A�`���җp�̏h�ɂ�";
		mes "�����Ă�������̂ł��傤�H";
		mes "�������ŁA�����ق͉҂������Ȃ���";
		mes "�c�O�Ȃ̂ł����B";
		next;
		mes "[�`������]";
		mes "�b�����������̂ł����H";
		mes "���ł��傤�H�@���ł��傤??";
		mes "�����ɂȂ邨�b�ł�����";
		mes "�劽�}�ł���I";
		next;
		cutin "ep19_iwin04.png", 255;
		menu "�ŋ߁A�������Ȃ��Ȃ����F�B�͂��܂����H",-;
		cutin "ep19_iwin04.png", 2;
		mes "[�`������]";
		mes "���̗F�B�ŁA�ł����H";
		mes "���܂���ˁA�S�R�A���܂���ˁB";
		mes "�Ƃ��Ă��s�v�c�Ȏ���ł��ˁB";
		next;
		mes "[�`������]";
		mes "���ߏ�����́A�݂�Ȋ������ł����Ă�";
		mes "�^�ʖڂɕ�������Ă܂���B";
		mes "������A���Ɍ������Ȃ��Ȃ����F�l��";
		mes "���Ȃ��Ƃ������Ƃł��B";
		next;
		mes "[�`������]";
		mes "���`�{���͏�񗿂����������Ȃ���";
		mes "����Șb�������Ⴂ���Ȃ��̂ɁI";
		next;
		cutin "ep19_iwin04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����Ă���Ă��肪�Ƃ��I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̏ꏊ�������ɒ������Ă݂悤�B";
		mes "�@���͘H�n���������͂��j";
		next;
		chgquest 16697,16698;
		set EP20_1QUE,9;
		mes "�]�H�n����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�H�n����";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 208, 236;
		end;
	}
	else if(EP20_1QUE == 9) {
		mes "[�`������]";
		mes "���Ɍ������Ȃ��Ȃ����F�l��";
		mes "���Ȃ��Ƃ������Ƃł��B";
		mes "���`�{���͏�񗿂����������Ȃ���";
		mes "����Șb�������Ⴂ���Ȃ��̂ɁI";
		next;
		cutin "ep19_iwin04.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̏ꏊ�������ɒ������Ă݂悤�B";
		mes "�@���͘H�n���������͂��j";
		next;
		mes "�]�H�n����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�H�n����";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 208, 236;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 8 || EP20_1QUE == 9)
		showevent 0, 1, "�`������#ep20_re01";
	end;
}


icecastle.gat,208,236,0	script	#ep20_re07	139,5,5,{/* 3380 */
	if(EP20_1QUE == 9 || EP20_1QUE == 10)
		cloakoffnpc "�H�n��#ep20_re01";
	end;
}
icecastle.gat,209,243,3	script(CLOAKED)	�H�n��#ep20_re01	10429,{/* 3381 (cloaking)*/
	if(EP20_1QUE == 9) {
		mes "["+strcharinfo(0)+"]";
		mes "���ɂ̘H�n����";
		mes "���ׂĂ݂悤���c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�z���������";
		mes "�N�����A��čs���ꂽ�̂ł͂Ȃ�����";
		mes "�S�z���Ă���悤����������c�c�B";
		mes "�������Ղ��Ȃ����낤���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����c�c����́c�c";
		mes "����c�c�ł��A�ǂ��������Ƃ��낤�H";
		next;
		mes "�]���҂����O������N�������悤��";
		mes "�@���Ղ��c���Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c��������o�čs�������Ղ͖����ȁB";
		mes "�ʂ̂Ƃ��납��O�ɏo���H";
		mes "���邢�́A�܂��X�̒��ɂ���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������ė~�����ƌ���ꂽ�ꏊ��";
		mes "�S�����ׂ��ȁB";
		mes "��x�A�z��������̂Ƃ���ɖ߂낤�B";
		next;
		chgquest 16698,16699;
		set EP20_1QUE,10;
		mes "�]�C�X�K���h ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�C�X�K���h ������";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	}
	else if(EP20_1QUE == 10) {
		mes "�]���҂����O������N�������悤��";
		mes "�@���Ղ��c���Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c��������o�čs�������Ղ͖����ȁB";
		mes "�ʂ̂Ƃ��납��O�ɏo���H";
		mes "���邢�́A�܂��X�̒��ɂ���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������ė~�����ƌ���ꂽ�ꏊ��";
		mes "�S�����ׂ��ȁB";
		mes "��x�A�z��������̂Ƃ���ɖ߂낤�B";
		next;
		mes "�]�C�X�K���h ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�C�X�K���h ������";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 259, 215;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 9 || EP20_1QUE == 10)
		showevent 0, 1, "�H�n��#ep20_re01";
	end;
}
icecastle.gat,202,168,0	script	#ep20_re08	139,5,5,{/* 3382 */
	if(EP20_1QUE == 12 || EP20_1QUE == 13)
		cloakoffnpc "���n�[��#ep20_re07";
	end;
}
icecastle.gat,201,171,3	script(CLOAKED)	���n�[��#ep20_re07	10469,{/* 3383 (cloaking)*/
	if(EP20_1QUE == 13) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����ɂ݂�Ȃ�";
		mes "���K���������A�[�E�B����";
		mes "�ϐg���Ă������Ƃ�`���Ȃ��ƁB";
		mes "�������ɓ���܂��傤�B";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "�]�C�X�K���h ������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�C�X�K���h ������";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 259, 195;
		end;
	}
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "���J�ɐݒu���ꂽ���u���Ď�����";
	mes "�������ł����悤�ł��ˁB";
	mes "�ł́A�o���̗p�ӂ��������܂��傤�B";
	next;
	cutin "ep19_lehar01.png", 255;
	mes "^e6328c�������A���_���W����";
	mes "�u���J�T���v��";
	mes "�����Ɠ��ꂪ�s���܂��B";
	if(mdopenstate("���J�T��"))
		set '@str$,"^0b0b33�������A���_���W�����֓���";
	else if(getpartyleader(getcharid(1)) == strcharinfo(0))
		set '@str$,"^0b0b33�������A���_���W�����̍쐬";
	next;
	switch(select("^191970��������",'@str$,"^0b0b33���ӎ����̊m�F") == 2) {
	case 1:
		mes "�]���̏�𗣂ꂽ�]";
		close;
	case 2:
		if(mdopenstate("���J�T��")) {
			mes "[���n�[��]";
			mes "���J�T���֌������܂��傤�I";
			next;
			if(select("^191970�����l����","^e6328c���J�T���֌�����") == 1) {
				cutin "ep19_lehar01.png", 255;
				mes "�]���̏�𗣂ꂽ�]";
				close;
			}
			mes "[���n�[��]";
			mes "����ł͏o���ł��B";
			close2;
			cutin "ep19_lehar01.png", 255;
			if(getonlinepartymember() > 1) {
				mes "^8c32e6���̃������A���_���W�����́A";
				mes "1�l�p�ł��B";
				mes "�p�[�e�B�[�����o�[��";
				mes "2�l�ȏ�̏ꍇ�͓���ł��܂���B";
				mes "������x�m�F���Ă���";
				mes "��蒼���Ă��������B";
				close;
			}
			switch(mdenter("���J�T��")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[���J�T��] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				//warp "1@20cn1.gat", 94, 79;
				end;
			case 1:	// �p�[�e�B�[������
				mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
				mes "����ł��܂���B";
				mes "������x�m�F���Ă���";
				mes "��蒼���Ă��������B";
				close;
			case 2:	// �_���W�������쐬
				mes "^8c32e6�p�[�e�B�[���[�_�[��";
				mes "�������A���_���W������";
				mes "�������Ă��Ȃ���Ԃł��B";
				close;
			default:	// ���̑��G���[
				close;
			}
		}
		else {
			if(getonlinepartymember() < 1) {
				mes "^8c32e6�󔒂̃p�[�e�B�[���ł́A";
				mes "�������A���_���W������";
				mes "�쐬���邱�Ƃ͏o���܂���B";
				close;
			}
			mes "�������A���_���W�������쐬���܂����H";
			next;
			if(select("^191970�����l����","^e6328c�쐬����") == 1) {
				cutin "ep19_lehar01.png", 2;
				mes "[���n�[��]";
				mes "�T���̏������܂��ł������B";
				mes "�������I������A�܂����Ă��������ˁB";
				close2;
				cutin "ep19_lehar01.png", 255;
				end;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0))
				close;
			mdcreate "���J�T��";
			mes "���p�[�e�B�[��";
			mes "^009eff"+strcharinfo(1)+"^000000";
			mes "���p�[�e�B�[���[�_�[";
			mes "^009eff"+strcharinfo(0)+"^000000";
			mes "�@";
			mes "^006400���J�T����";
			mes "�쐬�\�����󂯕t���܂����B^000000";
			close;
		}
	case 3:
		mes "�ڂ����͂���������m�F���������B";
		mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
		messize 180,364;
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 12 || EP20_1QUE == 13)
		showevent 0, 1, "���n�[��#ep20_re07";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̐����Ɠ���]";
	end;
}
jor_back5.gat,365,187,3	script	���͂̊�������ݒu��#	10538,{/* 3385 */}
jor_back6.gat,122,180,3	script	���͂̊�������ݒu��#	10539,{/* 3395 */
	mes "�]���͂̊�������";
	mes "�@��ȑ��u���ݒu����Ă���]";
	close;
}

jor_nest.gat,38,268,0	script	#20ms00	139,6,6,{/* 3398 */
	if(EP20_1QUE == 15 || EP20_1QUE == 16 || EP20_1QUE == 17) {
		cloakoffnpc "���C�W�[#20ms00";
		cloakoffnpc "�z����#20ms00";
		cloakoffnpc "�~���A��#20ms00";
		cloakoffnpc "���n�[��#20ms00";
	}
	if(EP20_1QUE >= 17) //24�Ŋm�F
		cloakoffnpc "��#20ms00";
	end;
}
jor_nest.gat,38,274,5	script(CLOAKED)	��#20ms00	10046,{/* 3399 (cloaking)*/
	mes "�]����";
	mes "�@�������܂����H�]";
	next;
	if(select("������","��߂�") == 2) {
		mes "�]���̏�ɂƂǂ܂����]";
		close;
	}
	mes "�]����";
	mes "�@���������]";
	close2;
	warp "jor_root1.gat", 32, 21;
	end;
}
jor_nest.gat,36,274,5	script(CLOAKED)	���C�W�[#20ms00	10475,{/* 3400 (cloaking)*/
	if(EP20_1QUE == 15) {
		mes "[���C�W�[]";
		mes "�������郁���o�[���������ȁB";
		mes "����H";
		mes "���̖ʁX�A���o�������邼�B";
		next;
		mes "[���C�W�[]";
		mes "�ˌ�A�����A�ˌ��A�A���y�ю�����E�B";
		mes "�S�Ă��\�ȕҐ�����Ȃ��H";
		mes "���̃����c�Ȃ�s�s���";
		mes "�����Ɋׂ�邱�Ƃ��ł��邼�B";
		emotion 23,"�~���A��#20ms00",1;
		emotion 23,"���n�[��#20ms00",1;
		emotion 23,"�z����#20ms00",1;
		next;
		menu "�c�c��k�ł���ˁH",-;
		unittalk getnpcid(0,"�~���A��#20ms00"),"�~���A�� : �s�s���āA�ǂ��̓s�s�ł����H",1;
		unittalk getnpcid(0,"���n�[��#20ms00"),"���n�[�� : ���������āA�s�s��j�󂵂ɍs����ł����H",1;
		unittalk getnpcid(0,"�z����#20ms00"),"�z���� : �C���͂ǂ�����񂾁I�I",1;
		mes "[���C�W�[]";
		mes "�v����ɐ��s�Ƃ������ƁB";
		mes "�������͑f���炵���`�[���ł��邱�Ƃ�";
		mes "�o���Ă����B";
		next;
		mes "[���C�W�[]";
		mes "���̗͂��������ƂɎg��Ȃ��񂾂���";
		mes "�{���ɗ��h����ˁH";
		mes "���āA�O�ɐ����������Ɠ����悤��";
		mes "��肭�������Ƃ��悤�B";
		next;
		mes "[���n�[��]";
		mes "��������肵�܂�����";
		mes "�悤�₭�A���̔��̐��";
		mes "�i�߂�Ƃ����킯�ł��ˁB";
		next;
		mes "[�z����]";
		mes "��������{���ɓ����̂ł����H";
		mes "�O�ɏo�邱�Ƃ͂ł��������ł���";
		mes "�����Ƃ͌���܂����B";
		next;
		mes "[���C�W�[]";
		mes "����Ă݂Ȃ��ƕ�����Ȃ���B";
		mes "���������킵�Ă݂Ȃ��ƁB";
		unittalk getnpcid(0,"���C�W�[#20ms00"),"���C�W�[ : �ǂ�ǂ�`����",1;
		next;
		misceffect 0,"�~���A��#20ms00",1;
		mes "<FONT SIZE = 20>[- �J�`���b -]</FONT>";
		mesalign 2;
		mesalign 4;
		close2;
		mes "[���C�W�[]";
		mes "����!!�@�h�A�m�u����邼�I";
		mes "�������c�c�����d������c�c�B";
		next;
		menu "�݂�Ȃŗ͂����킹�܂��傤",-;
		mes "[���n�[��]";
		mes "�������܂��傤���B";
		mes "�F����A�^�C�~���O�����킹�āI";
		next;
		misceffect 0,"�~���A��#20ms00",1;
		mes "<FONT SIZE = 20>[- �L�C�B�B�B -]</FONT>";
		mesalign 2;
		mesalign 4;
		close2;
		mes "[���C�W�[]";
		mes "�������I";
		mes "�b���グ�����h�ȋؓ���";
		mes "�͂�U��i��񂾁I�@����I";
		emotion 21,"���C�W�[#20ms00",1;
		next;
		mes "[�z����]";
		mes "���΂����肶��Ȃ��ł����I";
		mes "�ꏏ�Ɏ�`���Ă���������I";
		misceffect 0,"���C�W�[#20ms00",1;
		misceffect 0,"�z����#20ms00",1;
		misceffect 0,"�~���A��#20ms00",1;
		unittalk getnpcid(0,"���C�W�[#20ms00"),"���C�W�[ : ���̓G�[���𑗂�W�I",1;
		unittalk getnpcid(0,"���n�[��#20ms00"),"���n�[�� : ����႟���I",1;
		unittalk getnpcid(0,"�~���A��#20ms00"),"�~���A�� : ���������c�c�I",1;
		next;
		misceffect 670,"�~���A��#20ms00",1;
		mes "[���n�[��]";
		mes "�J�����I";
		unittalk getnpcid(0,"�~���A��#20ms00"),"�~���A�� : �ӂ��c�c",1;
		next;
		mes "[���C�W�[]";
		mes "�݂�Ȃ����I";
		mes "������Ƌx�e���悤�B";
		unittalk getnpcid(0,"�z����#20ms00"),"�z���� : ���񂽂͉�������ĂȂ�����Ȃ����I",1;
		close2;
		chgquest 16704,17691;
		set EP20_1QUE,16;
		end;
	}
	else if(EP20_1QUE == 16) {
		mes "[���C�W�[]";
		mes "�{����ꂽ�B��������H";
		mes "�z�����̒U�߂����������Ă邯��";
		mes "����ɕ����Ă����B";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 15)
		showevent 0, 1, "���C�W�[#20ms00";
	end;
}
jor_nest.gat,40,274,3	script(CLOAKED)	�z����#20ms00	10470,{/* 3401 (cloaking)*/
	if(EP20_1QUE == 16) {
		mes "[�z����]";
		mes "��͊J�������ǁc�c";
		mes "�ǂ����������肵�܂���B";
		next;
		mes "[���C�W�[]";
		mes "^0000cd�킴�ƊJ���Ă�����^000000�݂�������Ȃ��H";
		mes "����܂ŊJ���悤�Ƃ��Ă�";
		mes "�r�N�Ƃ����Ȃ������̂ɁB";
		next;
		mes "[�~���A��]";
		mes "��͂�A㩂ł��傤���H";
		next;
		mes "[�z����]";
		mes "㩂��Ƃ��Ă������Ă݂邵���Ȃ��B";
		next;
		mes "[���n�[��]";
		mes "�����������Ƃł��B";
		mes "������댯�͏��m���Ă��܂��B";
		next;
		mes "[�z����]";
		mes "^0000cd���K���ϐg�X�N���[��^000000�͎����Ă܂����H";
		mes "���̐�ɂ̓��K��������͂��ł�����";
		mes "�����ŕϐg���Ă����ɐi�݂܂��傤�B";
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530)
			close;
		next;
		mes "[�z����]";
		mes "�Y��Ȃ��ł���B";
		mes "�N���̖ړI�́A���X�K���h�������Ă���";
		mes "�u���̏ꏊ�v�ɂ��Ē��ׂ邱�ƁB";
		mes "�����ŉ������悤�Ƃ��Ă���̂�";
		mes "����𒲂ׂ邱�Ƃ��ŗD��ł��B";
		next;
		mes "[�z����]";
		mes "����ƓG�̖{���n�ɐ�������̂ł�����";
		mes "���ꂮ��������ȍs����";
		mes "�ڗ��s���͔����邱�ƁI";
		next;
		mes "[���C�W�[]";
		mes "�Ȃ����̖ڂ����Ȃ��猾���́H";
		mes "����ɂ��Ă�����͑O��Ɣ�ׂ�";
		mes "�댯�x���������狻������ȁI";
		mes "��`���A�͂肫�����Ⴄ���[�I";
		cloakonnpc "���C�W�[#20ms00";
		next;
		mes "[�~���A��]";
		mes "�c�c�S�z�ɂȂ��Ă��܂����B";
		next;
		menu "�ڂ𗣂��Ȃ��悤�C�����悤",-;
		mes "[���n�[��]";
		mes "�ł́A�T�d�ɒ��ɓ���܂��傤�B";
		next;
		chgquest 17691,17692;
		set EP20_1QUE,17;
		mes "�]����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]����";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 32, 21;
		end;
	}
	if(EP20_1QUE == 17) {
		mes "[�z����]";
		mes "�������ɓ���܂��傤�B";
		next;
		mes "�]����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]����";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 32, 21;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 16 || EP20_1QUE == 17)
		showevent 0, 1, "�z����#20ms00";
	end;
}
jor_nest.gat,37,272,7	script(CLOAKED)	�~���A��#20ms00	10471,{/* 3402 (cloaking)*/}
jor_nest.gat,39,272,1	script(CLOAKED)	���n�[��#20ms00	10472,{/* 3403 (cloaking)*/}

jor_root1.gat,32,34,0	script	#20ms05	139,9,9,{/* 3404 */
	if(EP20_1QUE == 17)
		cloakoffnpc "���K����p�t#20ms10";
	else if(EP20_1QUE == 18)
		cloakoffnpc "�`��#20ms10";
	end;
}
jor_root1.gat,32,34,5	script(CLOAKED)	���K����p�t#20ms10	21985,{/* 3405 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K����p�t]";
		mes "�ǂ����āA�����ɐl�Ԃ�!?";
		close;
	}
	//timer missing
	emotion 23,"���K����p�t#20ms10",1;
	unittalk getnpcid(0,"���K����p�t#20ms10"),"���K����p�t : �M�l�l�Ԃ��ȁI�@���̖ڂ͌떂������I",1;
	unittalk getcharid(3),strcharinfo(0)+" : �l�Ԃ����m���郋�K��������B���m����z���������Ȃ���A�݂�Ȃƍ������悤",1;
	misceffect 0,"���K����p�t#20ms10",1;
	unittalk getnpcid(0,"���K����p�t#20ms10"),"���K����p�t : ������!!",1;
	cloakonnpc "���K����p�t#20ms10";
	cloakoffnpc "�`��#20ms10";
	chgquest 17692,17693;
	set EP20_1QUE,18;
	end;
OnQuestInfo:
	if(EP20_1QUE == 17)
		showevent 0, 1, "���K����p�t#20ms10";
	end;
}
jor_root1.gat,32,34,5	script(CLOAKED)	�`��#20ms10	10046,{/* 3406 (cloaking)*/
	mes "�]���ӂ̊m�F��";
	mes "�@�������܂����H�]";
	next;
	if(select("������","��߂�") == 2) {
		mes "�]���̏�ɂƂǂ܂����]";
		close;
	}
	mes "�]���ӂ̊m�F��";
	mes "�@���������]";
	close2;
	warp "jor_root2.gat", 234, 243;
	end;
OnQuestInfo:
	if(EP20_1QUE == 18)
		showevent 0, 1, "�`��#20ms10";
	end;
}
jor_root2.gat,239,243,0	script	#20ms10	139,9,9,{/* 3407 */
	if(EP20_1QUE >= 18 || EP20_1QUE <= 21)
		cloakoffnpc "��#20ms10";
	end;
}
jor_root2.gat,239,243,5	script(CLOAKED)	��#20ms10	10046,{/* 3408 (cloaking)*/
	mes "�]���ɊJ�������̐悩��";
	mes "�@�����o���̂��鐺����������]";
	close2;
	warp "jor_safty2.gat", 75, 358;
	end;
OnQuestInfo:
	if(EP20_1QUE == 18)
		showevent 0, 1, "��#20ms10";
	end;
}

jor_safty2.gat,75,358,0	script	#20ms11	139,3,3,{/* 3409 */
	if(EP20_1QUE == 18) {
		cloakoffnpc "���C�W�[#20ms10";
		cloakoffnpc "�z����#20ms10";
		cloakoffnpc "�~���A��#20ms10";
	}
	else if(EP20_1QUE == 19 || EP20_1QUE == 20) {
		cloakonnpc "���C�W�[#20ms10";
		cloakoffnpc "�z����#20ms10";
		cloakoffnpc "�~���A��#20ms10";
		cloakoffnpc "���n�[��#20ms10";
	}
	else if(EP20_1QUE == 21) {
		cloakonnpc "���C�W�[#20ms10";
		cloakoffnpc "�z����#20ms10";
		cloakonnpc "�~���A��#20ms10";
		cloakonnpc "���n�[��#20ms10";
		cloakoffnpc "���K���勳#20ms10";
	}
	end;
}
jor_safty2.gat,65,357,0	script	#20ms12	45,1,1,{
OnTouch:
	warp "jor_root2.gat",234,243;
	end;
OnQuestInfo:
	if(EP20_1QUE == 21)
		showevent 0, 1, "#20ms12";
	end;
}
jor_safty2.gat,77,362,5	script(CLOAKED)	���C�W�[#20ms10	10475,{/* 3411 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���C�W�[]";
		mes "���̎p�ł�����̂̓}�Y�C���āB";
		mes "�������K���ɕϐg���Ă���B";
		close;
	}
	if(EP20_1QUE == 18) {
		mes "[���C�W�[]";
		mes "���I�@"+strcharinfo(0)+"�I";
		mes "�������������I";
		emotion 2,"���C�W�[#20ms10",1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���K����p�t��";
		mes "�l�Ԃ����m�ł���݂����ł��B";
		next;
		mes "[���C�W�[]";
		mes "�݂������ȁB";
		mes "�����玄�����������ɉB���";
		mes "�l�q���M���Ă����񂾁B";
		next;
		mes "[�z����]";
		mes "���K���ɕϐg���Ă�";
		mes "�o���Ă��܂��̂ł����";
		mes "�ʂ̕��@��T���������ǂ��̂ł́H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��p�t�͎����r�����܂����B";
		mes "���K���ɕϐg������@��";
		mes "�������΂炭�͗L���ł��傤�B";
		next;
		mes "[�z����]";
		mes "���܂̂����ɍ���i�s���Ȃ��ƁB";
		mes "�o�������v���Ɂc�c�B";
		next;
		mes "[�~���A��]";
		mes "�{���n�֑�������";
		mes "�܂��������Ă��܂���c�c";
		mes "���̈�т�T�����̂ł����B";
		next;
		mes "[�~���A��]";
		mes "�����Ǝv���錊��T���Ă݂Ă�";
		mes "���̒��Œ����̃��K��������";
		mes "�d�������Ă��邾���ł����B";
		next;
		mes "[�z����]";
		mes "�z��͊F�A����Ȃ�����ł����ˁB";
		mes "���������������Ă���̂��c�c�B";
		next;
		menu "���������΁A���n�[���́H",-;
		cloakoffnpc "���n�[��#20ms10";
		mes "[���n�[��]";
		mes "�F����A�ǂ����Ă���ȂƂ����";
		mes "�W�܂��Ă����ł��H";
		mes "�{���n�̓����ő҂��Ă����̂�";
		mes "�N�������Ȃ��̂ŐS�z�ɂȂ���";
		mes "�T���ɗ�����ł����ǁB";
		next;
		mes "[�z����]";
		mes "�����ő҂��Ă�����ł����I";
		mes "���������āA�����̏ꏊ��m���Ă���H";
		next;
		mes "[���n�[��]";
		mes "�E�o�������ɁA������ʂ�܂�������";
		mes "����͂܂��c�c�B";
		next;
		mes "[�z����]";
		mes "�悵�A�����s�����I";
		mes "���K����p�t�Ɍ�����O�ɁI";
		next;
		mes "[���C�W�[]";
		mes "�҂��Ă���B��荞�ޑO��";
		mes "�{���n�̏����m�F�������B";
		mes "���B�����K���ɕϐg���Ă������Ƃ�";
		mes "�o���Ă���񂾂�H";
		next;
		mes "[���C�W�[]";
		mes "�{���n�ōs�����鎞��";
		mes "�����C�����Ȃ��Ƃ����Ȃ����ƂƂ�";
		mes "�������肵�Ȃ��H";
		next;
		mes "[���n�[��]";
		mes "���������߂炦���Ă����ꏊ��";
		mes "�����Ɖ��ɂ���킯�ł���";
		mes "�ƂĂ��d�v�����ȏꏊ�ł����B";
		next;
		mes "[���n�[��]";
		mes "���Z�n�ł͖��������ł�����";
		mes "�����Ō��������̂�";
		mes "�ŏ㋉�̃��K�������ł����B";
		mes "�㋉�ȉ��̃��K����";
		mes "���Ȃ������悤�Ɏv���܂��B";
		next;
		mes "[���C�W�[]";
		mes "�܂�A�㋉���K���̎p�œ����";
		mes "�����܂��\�����������Ă��Ƃ��B";
		mes "�ϐg���Ă��M���A�[�E�B���̒U�߂�";
		mes "���ꂻ�����Ȃ��Ȃ��B";
		next;
		mes "[�z����]";
		mes "�ł́A�ǂ�����H";
		next;
		mes "[���C�W�[]";
		mes "�������邾��H";
		mes "�ŏ㋉���K���̎p�����Ă���̂�";
		mes "�������݂���������";
		mes "�܂��͎�����@�ɍs���Ă݂��B";
		next;
		mes "[���C�W�[]";
		mes "�݂�Ȃ́A�����őҋ@���ĂĂ���B";
		mes "�΂����蒲�ׂĂ��邩�炳�I";
		close2;
		cloakonnpc "���C�W�[#20ms10";
		chgquest 17693,17694;
		set EP20_1QUE,19;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 18)
		showevent 0, 1, "���C�W�[#20ms10";
	end;
}
jor_safty2.gat,81,359,3	script(CLOAKED)	�~���A��#20ms10	10471,{/* 3412 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�~���A��]";
		mes "�c�c�`���҂���B";
		mes "�����ł̓��K���ɕϐg���Ă�������";
		mes "�ǂ���������B";
		close;
	}
	if(EP20_1QUE == 19) {
		mes "[�~���A��]";
		mes "�c�c���C�W�[����A�{���ɂЂƂ��";
		mes "���v�Ȃ�ł��傤���H";
		mes "�����r���ŁA��p�t�Ƒ���������c�c�B";
		next;
		mes "[�z����]";
		mes "����Ȑ}�����_�o�̎�����ɂ�";
		mes "����܂ŉ�������Ƃ͂Ȃ���B";
		mes "�ނƂ̕t�������͒����͂Ȃ�����";
		mes "��肭���񂶂�Ȃ����Ȃ��c�c�B";
		next;
		cloakoffnpc "���C�W�[#20ms10";
		mes "[���C�W�[]";
		mes "�n�@�n�@�I";
		mes "�݂�ȕ����Ă���I";
		mes "��ςȂ��ƂɂȂ���!!";
		emotion 54,"���C�W�[#20ms10",1;
		next;
		mes "[���C�W�[]";
		mes "�����q�����ɋ����Ă�������ꏊ����";
		mes "�z��̖{���n�ɓ������܂ł͗ǂ�������";
		mes "���ɂ������K���̓z��";
		mes "���̊������Ȃ�";
		mes "�P���|�����ė����񂾂�I";
		next;
		mes "[���C�W�[]";
		mes "�������̓t�����h���[��";
		mes "�₠�I�@���Ĉ��A�����̂ɂ��I";
		mes "���A�̑���ɁA�\�͂�U�邤�Ȃ��";
		mes "�܂�������V���Ȃ��ĂȂ��z�炾�B";
		next;
		mes "[���C�W�[]";
		mes "�c�c�܂��A��k�͂Ƃ������Ƃ���";
		mes "���̂��̃��K���̊��";
		mes "�l�Ԃ��ϐg���Ă������K���̊�Ƃ���";
		mes "�m��n��������Ă�݂�������B";
		next;
		mes "[�~���A��]";
		mes "�ŏ㋉�̃��K���͐������Ȃ��̂�";
		mes "���݂��Ɋ猩�m��ł�����ˁB";
		mes "�V�Q�҂Ȃ炷����";
		mes "�C�Â���Ă��܂��̂ł��傤�ˁB";
		next;
		mes "[���n�[��]";
		mes "���`��A�ǂ����܂��傤���B";
		mes "�ŏ㋉���K���łȂ��Ɖ����܂��̂�";
		mes "���C�W�[����̕ϐg��̊��";
		mes "�m���Ă��ẮA����グ��Ԃł��B";
		next;
		mes "[���C�W�[]";
		mes "�ǂ��ɂ�����";
		mes "�ʂ̍ŏ㋉���K���ɕϑ��ł����";
		mes "�Ȃ�Ƃ��Ȃ肻���Ȃ񂾂��Ȃ��c�c�B";
		next;
		cloakoffnpc "���K���勳#20ms10";
		mes "[���K���勳]";
		mes "���`�`�ĂƁB";
		mes "�����������Ŏ��Ԃ�ׂ��Ƃ��邩�B";
		mes "���������Ԃ̘J���ɏ]������Ȃ�";
		mes "���蓾�Ȃ����Ƃ��B�ԂԂc�c�B";
		next;
		emotion 23,"�z����#20ms10",1;
		emotion 23,"���n�[��#20ms10",1;
		emotion 23,"�~���A��#20ms10",1;
		emotion 1,"���K���勳#20ms10",1;
		mes "[���K���勳]";
		mes "�Ȃ񂾁c�c���O�����́H";
		mes "�勳�Ɖ����[���H";
		mes "���߂Č���炾�B";
		next;
		mes "[���C�W�[]";
		mes "���̂��ƁA�m��Ȃ��H";
		mes "�������̎i�Ղ��H";
		next;
		mes "[���K���勳]";
		mes "�m��킯�Ȃ�����I";
		mes "���ẮA���𔄂��Ă���ȁH";
		emotion 1,"���K���勳#20ms10",1;
		next;
		mes "[���K���勳]";
		mes "�����ł����l�ނ����Ȃ��̂�";
		mes "���O�����̂悤�ȉ����[���T�{�邩��";
		mes "���܂Ŏd���ɋ��o�����H�ڂɂȂ�B";
		next;
		emotion 2,"���C�W�[#20ms10",1;
		mes "[���C�W�[]";
		mes "�ŏ㋉���K���̎勳�l���c�c";
		mes "�ӂӂ��c�c�M�����I";
		mes "���̍D���Ȍ��t�������悤�B";
		mes "�ڂɂ͖ڂ��B���ɂ͎����I";
		next;
		menu "�͂��H",-;
		mes "[���C�W�[]";
		mes "�`���҂≙���q������";
		mes "���K���ɗU�����ꂽ�킯����";
		mes "��������Ԃ����Ƃ����킯���B";
		mes "�v����ɁA���̎勳�l��U������I";
		next;
		mes "[���n�[��]";
		mes "�������`�`��!?";
		next;
		mes "[�~���A��]";
		mes "���A����łǂ��������ł����H";
		mes "�l���ɂ��āA���K���ƌ�����c�c�H";
		next;
		mes "[���C�W�[]";
		mes "�Ⴄ�Ⴄ�B";
		mes "�R�C�c��X�̏�ɕ����߂����";
		mes "�R�C�c�ɕϑ�����񂾁B";
		mes "����Ȃ�����܂ꂸ��";
		mes "�z��̖{���n�ɐ����ł���B";
		next;
		mes "[���C�W�[]";
		mes "���̎勳�l�A���セ������H";
		mes "�����������K���ɕϐg���Ă��邱�Ƃ�";
		mes "�C�t���Ă��Ȃ��݂��������B";
		next;
		mes "[���C�W�[]";
		mes "���������̂ɕϑ������";
		mes "���X�������ȐU���������Ă�";
		mes "�����܂�Ȃ��ōςނ�B";
		next;
		mes "[���K���勳]";
		mes "���`���B";
		mes "�������ɑ΂��鈫���̂悤�Ȃ��̂�";
		mes "���������C�����邪�H";
		emotion 6,"���K���勳#20ms10",1;
		next;
		mes "[�~���A��]";
		mes "�ϑ�������Č����Ă��c�c";
		mes "����ȊȒP�Ȃ��Ƃł͂Ȃ��ł���ˁH";
		mes "�O�������Ȃ�Ƃ�����";
		mes "������������A�U������������c�c�B";
		next;
		mes "[���C�W�[]";
		mes "�L�~�̖ڂ̑O�ɂ���̂�";
		mes "���������N���Ǝv���Ă�H";
		mes "����5����������B";
		mes "���̃��K���̑S�Ă�";
		mes "�����ɖ͕킵�Ă݂��邩�炳�B";
		next;
		mes "[���K���勳]";
		mes "���`���I";
		mes "�����ǂ��ɘA��čs���C���H";
		mes "���͖Z�����񂾁B";
		mes "��Ԃ���炷�񂶂�Ȃ��c�c�B";
		close2;
		cloakonnpc "���C�W�[#20ms10";
		cloakonnpc "���K���勳#20ms10";
		chgquest 17694,17695;
		set EP20_1QUE,20;
		end;
	}
	if(EP20_1QUE == 20) {
		mes "[�~���A��]";
		mes "�{���ɁA���v�Ȃ�ł��傤���H";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 19)
		showevent 0, 1, "�~���A��#20ms10";
	end;
}
jor_safty2.gat,81,362,3	script(CLOAKED)	�z����#20ms10	10470,{/* 3413 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�z����]";
		mes "���K���ɕϐg���������ǂ��ł���B";
		close;
	}
	if(EP20_1QUE == 20) {
		mes "[�z����]";
		mes "���̃��K���̑S�Ă�͕킷��H";
		mes "����Ȃ̐M�����܂���ˁB";
		next;
		mes "[�z����]";
		mes "�܂��A���̃��K���͎���";
		mes "�X�̏�ɘA��čs���܂��B";
		mes "�ߗ��Ƃ��ď��𕷂��o����Ȃ�";
		mes "�����b�ł͂���܂��񂩂�B";
		next;
		cloakoffnpc "���C�W�[#20ms11";
		cloakoffnpc "���K���勳#20ms10";
		mes "[���K���勳]";
		mes "���`�`���I";
		unittalk getnpcid(0,"���n�[��#20ms10"),"���n�[�� : ���킟��!?",1;
		emotion 23,"���n�[��#20ms10",1;
		next;
		menu "�c�c�ǂ��������C�W�[����H",-;
		mes "[���C�W�[]";
		mes "�ӂӂӁc�c";
		mes "�`���҂ɂ���ʂ����Ȃ�����H";
		mes "���΂̓��C�W�[����I�@�����āH";
		mes "����ȂɖJ�߂Ȃ��Ă��ǂ���B";
		mes "�ق�A�����Č���������B";
		unittalk getnpcid(0,"���K���勳#20ms10"),"���K���勳 : ��ނށI�@��ނށ`�`�I�I",1;
		next;
		mes "[���C�W�[]";
		mes "����Ȃ�z��̖{���n��";
		mes "�N���ł��邾�낤�B";
		mes "���āA���̂��Ƃ͂��ꂩ��";
		mes "�u�i�h���K���h�v�ƌĂԂ悤�ɁB";
		next;
		mes "[�~���A��]";
		mes "�فA�{���ɑ��v�Ȃ�ł��傤���H";
		mes "�o�����肵�܂��񂩁H";
		next;
		mes "[���C�W�[]";
		mes "���̐l���畷�����b����";
		mes "�{���n�͐g�����ۏ؂��ꂽ���K��������";
		mes "�����炵���B";
		mes "��p�t���A�O�̌���肪���";
		mes "�{���n�̒��ɂ͂��Ȃ��������B";
		next;
		mes "[�z����]";
		mes "�ł́A���̃��K����";
		mes "�����A��čs���܂��B";
		mes "�F����͐N�������p�����Ă��������B";
		unittalk getnpcid(0,"���C�W�[#20ms11"),"���C�W�[ : �悵�A�s�����I",1;
		next;
		cloakonnpc "���C�W�[#20ms11";
		cloakonnpc "�~���A��#20ms10";
		cloakonnpc "���n�[��#20ms10";
		chgquest 17695,17696;
		set EP20_1QUE,21;
		mes "�]�����W��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�����W��";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 25, 280;
		end;
	}
	if(EP20_1QUE == 21) {
		mes "[�z����]";
		mes "�ł́A���̃��K����";
		mes "�����A��čs���܂��B";
		mes "�F����͐N�������p�����Ă��������B";
		next;
		mes "�]�����W��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����W��";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 25, 280;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 20)
		showevent 0, 1, "�z����#20ms10";
	end;
}
jor_safty2.gat,78,357,7	script(CLOAKED)	���n�[��#20ms10	10472,{/* 3414 (cloaking)*/}
jor_safty2.gat,75,360,5	script(CLOAKED)	���K���勳#20ms10	10474,{/* 3415 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�Ȃ������ɐl�Ԃ�!?";
		close;
	}
	end;
}
jor_safty2.gat,77,362,5	script(CLOAKED)	���C�W�[#20ms11	10474,{/* 3416 (cloaking)*/}
jor_sanct.gat,162,86,3	script	���K��#20ms20	10475,{/* 3417 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "���Ől�Ԃ߂��I�I";
		close;
	}
	if(EP20_1QUE == 21) {
		cloakoffnpc "���C�W�[#20ms20";
		cloakoffnpc "���n�[��#20ms20";
		cloakoffnpc "�~���A��#20ms20";
		mes "[���K��]";
		mes "�c�c�i�h���K���h�H";
		mes "���͂ǂ������Ă���悤���B";
		mes "�����ɂ���͂��̂Ȃ�";
		mes "�i�h���K���h�̎p��������B";
		next;
		cloakoffnpc "���K��#20ms21";
		cloakoffnpc "���K��#20ms22";
		mes "[���K��]";
		mes "�Ȃ񂾂��āH";
		mes "�����S�������d�����I����";
		mes "�i�h���K���h���߂��Ă����̂��H";
		mes "����ȃo�J�Ȃ��Ƃ����邩�I";
		emotion 23,"���K��#20ms21",1;
		next;
		mes "[���K��]";
		mes "�����̂悤��";
		mes "���ׂ��d�����������";
		mes "�߂��ė����ɈႢ�Ȃ��B";
		mes "����Ȃ��Ƃ𑱂����";
		mes "�T���N�K���h�������ł͂����Ȃ����B";
		next;
		mes "[���K��]";
		mes "�i�h���K���h�̂悤��";
		mes "�d�������ڂ��Ă����C�Ȃ�";
		mes "�����d�������ڂ�Ηǂ������I";
		next;
		mes "[���K��]";
		mes "���������̂��I";
		mes "���B�̓��X�K���h�l�ׂ̈�";
		mes "��؂Ȏd���ɏ]�����Ă���̂��I";
		mes "�d�������������Č��h���Ǝv���I";
		next;
		mes "[���K��]";
		mes "�L�c�C���Ƃ́A�L�c�C�񂾁B";
		mes "��X�ŏ㋉���K���͂���܂�";
		mes "�J���ɏ]���������Ƃ����������H";
		next;
		mes "[���K��]";
		mes "����́c�c���������c�c�B";
		next;
		mes "[���K��]";
		mes "�Ƃ͌����A�i�h���K���h�B";
		mes "�L�~���O�ɏo��";
		mes "�d�����I��点�Ă��������ǂ��B";
		mes "�T���N�K���h�ɂǂ₳���O�ɂȁB";
		next;
		mes "[���K��]";
		mes "�Ƃ���ŁA���̌��̎i�Ղ�����";
		mes "���߂Ă݂�炾���c�c�H";
		mes "�܂����A�l�Ԃ������Ă���񂶂�";
		mes "�Ȃ����낤�ȁH";
		next;
		mes "[���K��]";
		mes "�i�h���K���h�A�L�~���߂�O��";
		mes "���ɕϐg�����l�Ԃ�";
		mes "�����ɓ����ė����̂��B";
		next;
		mes "[���C�W�[]";
		mes "����Ȃ��Ƃ��������̂��B";
		mes "���̎i�Ղ�����";
		mes "�����̒�@�C���ɏA���Ă�����";
		mes "��قǖ߂��Ă����Ƃ���Ȃ̂��B";
		next;
		mes "[���C�W�[]";
		mes "�ȑO�̋��Z�n�����������󋵂�����";
		mes "�f�r���Ă����Ƃ���������ی삵���B";
		mes "���łɁA���̎d���������";
		mes "����Ă�������̂��B";
		next;
		mes "[���n�[��]";
		mes "���̂Ƃ���ł��B";
		mes "�������̐g����ۏ؂��Ă����������̂�";
		mes "�i�h���K���h�勳�l�̎d����";
		mes "����ɍs���܂����B";
		next;
		mes "[���K��]";
		mes "�Ȃ�!?�@����Ɏd�����s�����H";
		mes "�܂�c�c�����肩�H";
		unittalk getnpcid(0,"���K��#20ms21"),"���K�� : �����肾�ƁI",1;
		unittalk getnpcid(0,"���K��#20ms22"),"���K�� : ����͖{�����I",1;
		emotion 3,"���K��#20ms21",1;
		emotion 3,"���K��#20ms22",1;
		next;
		mes "[���K��]";
		mes "���͖����I�ȓ�����s��������ȁI";
		mes "�g���̕ۏ؂��ꂽ�l����������̂�";
		mes "���肪�������Ƃ��I";
		next;
		mes "[���K��]";
		mes "�N�����A������Еt���Ă���I";
		next;
		mes "[���K��]";
		mes "���̎d���������Ă��炤�I";
		next;
		mes "[���K��]";
		mes "���������Ă�I�@���̎d�����悾�I";
		next;
		mes "[���K��]";
		mes "���̎d���̕���";
		mes "���O�̎d�����d�v�����I";
		next;
		mes "[���C�W�[]";
		mes "�݂�ȁA���������B";
		mes "���̎҂����Ɏd���𗊂݂����̂Ȃ�";
		mes "���Ԃɕ���������Ȃ����B";
		next;
		mes "[���K��]";
		mes "���A�������悤�c�c";
		mes "�܂��͎����痊�݂������Ƃ�����B";
		next;
		mes "[���C�W�[]";
		mes "�d���́A���̎i�Ղɗ��߂Ηǂ��B";
		mes "��p�ɂȂ�ł����Ȃ��Ă����B";
		mes "���Ƃ̓�l�́A���ɕt���Ă���悤�ɁB";
		mes "�ł͎��炷��B";
		close2;
		cloakonnpc "���K��#20ms21";
		cloakonnpc "���K��#20ms22";
		cloakonnpc "���C�W�[#20ms20";
		cloakonnpc "���n�[��#20ms20";
		cloakonnpc "�~���A��#20ms20";
		chgquest 17696,17697;
		set EP20_1QUE,22;
		end;
	}
	if(EP20_1QUE == 22) {
		mes "[���K��]";
		mes "�ӂށc�c�m���Ɏd�����ł�������";
		mes "�i�Ղ��ȁB";
		next;
		mes "[���K��]";
		mes "���B�������ɗ��Ă���";
		mes "���΂炭�͑�ς������B";
		mes "�ŋ߂ɂȂ��Ă悤�₭�ȑO�̂悤��";
		mes "�����𑗂��悤�ɂȂ������c�c�B";
		next;
		mes "[���K��]";
		mes "�i���ȉ��̎����ɓ�����҂�";
		mes "�{���ɐg���̕ۏ؂��ꂽ";
		mes "�����������Ȃ��B";
		next;
		mes "[���K��]";
		mes "�v����ɁA�l��s���Ȃ̂��B";
		mes "�{���A�����ɓ����邱�Ƃ͂Ȃ��勳��";
		mes "�d�������Ă��闝�R��";
		mes "����ł킩�������낤�H";
		emotion 54,"���K��#20ms20",1;
		next;
		menu "�͂��A���m�������܂���",-;
		mes "[���K��]";
		mes "�ł́A���̎d�������O�ɗ^���悤�B";
		mes "�O�ɏo��^0000cd�w�r�C�`�S^000000��";
		mes "�̎悵�Ă���̂��B";
		next;
		menu "�w�r�C�`�S�ł����H",-;
		mes "[���K��]";
		mes "�������B";
		mes "�����ł��ґ�Ȑ����͂ł��Ȃ���";
		mes "�w�r�C�`�S�̂悤�Țn�D�i��";
		mes "�܂����������̂͗R�X�������Ԃ��B";
		mes "�F�̕s�������܂邾�낤�B";
		next;
		mes "[���K��]";
		mes "�u�֐_�̍��� 02�v�ɂ�";
		mes "^0000cd�w�r�C�`�S 3��^000000���̎悵����";
		mes "�����ɖ߂��ė��Ă���B";
		mes "���͋x�e���Ă��邩��ȁB";
		next;
		chgquest 17697,17698;
		set EP20_1QUE,23;
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 38, 63;
		end;
	}
	if(EP20_1QUE == 23) {
		mes "[���K��]";
		mes "�u�֐_�̍��� 02�v�ɂ�";
		mes "^0000cd�w�r�C�`�S 3��^000000���̎悵�Ă���悤";
		mes "�������͂������H";
		mes "�^�ʖڂɂ���Ă���B";
		next;
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 38, 63;
		end;
	}
	if(EP20_1QUE == 24) {
		//�w�r�C�`�S�������`�F�b�N�Ȃ�
		mes "[���K��]";
		mes "�߂������B";
		mes "�m���Ɉ˗���������";
		mes "�����Ă���悤���ȁB";
		next;
		mes "[���K��]";
		mes "�w�r�C�`�S�́A�勳������";
		mes "�n�D�i���B";
		mes "�i�Ղ����̌��ɓ��邱�Ƃ͂Ȃ������ȁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����Ȃ̂ł��ˁB";
		mes "�����ɂ͉���Ȃ����Ƃ������ł��B";
		mes "�������A�ǂ��������ꏊ�Ȃ̂ł��傤�H";
		next;
		mes "[���K��]";
		mes "�����Ă�낤�B";
		mes "���̏ꏊ�͉��";
		mes "^0000cd���������K���h���c�̐���^000000�B";
		mes "���������K���h�l�̏j������";
		mes "���X�K���h�l���ڊo�߂��ꏊ�Ȃ�B";
		next;
		mes "[���K��]";
		mes "���́A���X�K���h�l�̋����ł���";
		mes "���J���s���_���Ȃ�ꏊ�B";
		mes "�ȑO�́A���X�K���h�l�̑���";
		mes "����ꂽ�҂�������Ȃ�������";
		mes "�l�Ԃǂ��̑����ȍ~�́A";
		mes "�勳�ȏ�������悤�ɂȂ����̂��B";
		next;
		menu "�勳�ȏオ�W�܂��Ă���H",-;
		mes "[���K��]";
		mes "�������B";
		mes "���������Ă���B";
		mes "�勳�����͐S�g�𐴂�";
		mes "�Ԃ��Ȃ�����������";
		mes "���������K���h�l�����}������̂��B";
		next;
		menu "����́c�c���ł��傤���H",-;
		mes "[���K��]";
		mes "�����c�c����";
		mes "���̎��́A���������͂Ȃ��B";
		mes "���O���S�g�𐴂߁A��d�����";
		mes "�ėՂ���郈�������K���h�l��";
		mes "���߂��ɂ��邱�Ƃ�������邾�낤�B";
		next;
		menu "�͂��A�������܂��傤",-;
		mes "[���K��]";
		mes "�悢�Ԏ����B";
		mes "���������K���h�l�̏j�����󂯂��";
		mes "�i���ɐ�������B";
		mes "�c�c�����A���͂����x�ށB";
		mes "�d�����˗����������̎҂̂Ƃ����";
		mes "�s�����ǂ��B";
		next;
		chgquest 17719,17699;
		delitem 1001154,countitem(1001154);
		set EP20_1QUE,25;
		mes "�]���̃��K�������̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K�������̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 185, 123;
		end;
	}
	if(EP20_1QUE == 25) {
		mes "[���K��]";
		mes "���������K���h�l�̏j�����󂯂��";
		mes "�i���ɐ�������B";
		mes "�c�c�����A���͂����x�ށB";
		mes "�d�����˗����������̎҂̂Ƃ����";
		mes "�s�����ǂ��B";
		next;
		mes "�]���̃��K�������̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K�������̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 185, 123;
		end;
	}
	//29�Ŋm�F
	mes "[���K��]";
	mes "���̓��͂�����̂��c�c";
	mes "���������͂Ȃ��B";
	mes "����ȋC������B";
	close;
OnQuestInfo:
	if(EP20_1QUE >= 21 && EP20_1QUE <= 25)
		showevent 0, 1, "���K��#20ms20";
	end;
}
jor_root2.gat,43,63,0	script	#20ms00_berry	139,9,9,{/* 3418 */
	if(EP20_1QUE == 23)
		cloakoffnpc "�ł܂����ꏊ#20ms00";
	end;
}
jor_root2.gat,43,63,5	script(CLOAKED)	�ł܂����ꏊ#20ms00	10428,{/* 3419 (cloaking)*/
	if(EP20_1QUE == 23) {
		mes "�]�w�r�C�`�S����ɓ��ꂽ�]";
		close2;
		chgquest 17698,17719;
		getitem 1001154,3;
		set EP20_1QUE,24;
		mes "�]�˗���̃��K���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
	}
	if(EP20_1QUE == 24) {
		mes "�]����ȏ�A�w�r�C�`�S�͕K�v�Ȃ��B";
		mes "�@�߂��ĕ񍐂��悤�]";
		next;
		mes "�]�˗���̃��K���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�˗���̃��K���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 159, 83;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 23 || EP20_1QUE == 24)
		showevent 0, 1, "�ł܂����ꏊ#20ms00";
	end;
}
jor_sanct.gat,160,82,7	script(CLOAKED)	���n�[��#20ms20	10472,{/* 3420 (cloaking)*/}
jor_sanct.gat,159,84,7	script(CLOAKED)	���C�W�[#20ms20	10474,{/* 3421 (cloaking)*/}
jor_sanct.gat,157,85,7	script(CLOAKED)	�~���A��#20ms20	10471,{/* 3422 (cloaking)*/}
jor_sanct.gat,161,88,3	script(CLOAKED)	���K��#20ms21	10474,{/* 3423 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�Ȃ������ɐl�Ԃ�!?";
		close;
	}
	end;
}
jor_sanct.gat,164,86,3	script(CLOAKED)	���K��#20ms22	10473,{/* 3424 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�Ȃ������ɐl�Ԃ�!?";
		close;
	}
	end;
}
jor_sanct.gat,185,128,3	script	���K��#20ms23	10474,{/* 3425 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�Ȃ������ɐl�Ԃ�!?";
		close;
	}
	if(EP20_1QUE == 25) {
		mes "[���K��]";
		mes "�������B";
		mes "�҂��Ă������B";
		next;
		menu "��������Ηǂ��ł����H",-;
		mes "[���K��]";
		mes "���̑��u��ݒu���Ȃ����Ă��炤�B";
		mes "�W�߂����͂����o����";
		mes "����ۂ̏�Ԃ��B";
		mes "�K���ȏꏊ�ɒu���Ă���Ηǂ��B";
		next;
		menu "����͉��ł����H",-;
		mes "[���K��]";
		mes "��������߂��ė����΂��肾�����ȁB";
		mes "����͊O�����炫���l�Ԃ���������̂�";
		mes "���������ɗ��܂��Ă��閂�͂�";
		mes "���W���鑕�u���B";
		next;
		mes "[���K��]";
		mes "���͂����W�ł�����������";
		mes "�����Ŗ��͂𒊏o����B";
		mes "���͒��o��͂܂�";
		mes "���u��ݒu����K�v������̂��B";
		next;
		mes "[���K��]";
		mes "�{���́A�i�Ղ��������d�����낤��";
		mes "�l�肪����Ȃ�����ȁc�c";
		mes "���̂悤�ɉ�X����`���Ă���B";
		emotion 54,"���K��#20ms23",1;
		next;
		mes "[���K��]";
		mes "�K���Ȃ��ƂɁA���̑��u����";
		mes "���͂𒊏o�����Ƃ�";
		mes "�O�����炫���l�Ԃ̎d�����B";
		mes "����́A���Ă��邾���ł�";
		mes "�����ɂ��Ȃ��Ƃ�����ȁB";
		next;
		mes "[���K��]";
		mes "���āA���ϐg���u�͎����Ă��邩�H";
		next;
		menu "���ł����A����H",-;
		mes "[���K��]";
		mes "�������肵�Ă����ȁB";
		mes "������O�����痈���l�Ԃ�����������B";
		mes "��X�̎p���A���̊��܂킵�����̎p��";
		mes "�ω������Ă����B";
		next;
		mes "[���K��]";
		mes "���J�I�����d���Ȃ��B";
		mes "���̎p�ł���΁A�X�̏�̐l�Ԃǂ���";
		mes "�C�t���ꂸ�ɍs���ł���B";
		mes "�����Ȓ�������";
		mes "�U�����������邱�Ƃ��ł��Ȃ��悤���B";
		next;
		mes "[���K��]";
		mes "�ӂށc�c���̎d����";
		mes "���O�ȊO�̎҂ɔC���������ǂ��������B";
		mes "���ϐg���u���g�������������̂��낤�H";
		mes "����ɓK������̂͌P�����K�v���B";
		next;
		mes "[���K��]";
		mes "���Ԃ����鎞�ɌP�����Ă����悤�ɁB";
		mes "�Ƃ͂����A���̑��u��";
		mes "�ǂ��ɂ����Đݒu���Ȃ���΁c�c";
		mes "�悵�A���̑��u��";
		mes "�ʂ̎勳�ɓn���Ă���B";
		next;
		mes "[���K��]";
		mes "�z�͓{�邾�낤��";
		mes "�ŏI�I�ɂ͂���Ă���邾�낤�B";
		next;
		mes "[���K��]";
		mes "���u��n���Ă�";
		mes "�����ɖ߂��ė���K�v�͂Ȃ����B";
		mes "�����A���u�������čs���B";
		next;
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close;
		}
		chgquest 17699,17700;
		set EP20_1QUE,26;
		getitem 1001218,1;
		mes "�]�ʂ̎勳��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�ʂ̎勳��";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 44, 105;
		end;
	}
	if(EP20_1QUE == 26) {
		mes "[���K��]";
		mes "���u��n���Ă�";
		mes "�����ɖ߂��ė���K�v�͂Ȃ����B";
		mes "�����ʂ̎勳�ɓn���Ă���B";
		next;
		mes "�]�ʂ̎勳��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�ʂ̎勳��";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 44, 105;
		end;
	}
	mes "[���K��]";
	mes "���܂ł���Ȃ��Ƃ��c�c";
	mes "����A�Ⴄ�I";
	mes "���X�K���h�l�ׂ̈Ȃ炱�ꂵ���̂��ƁI";
	close;
OnQuestInfo:
	if(EP20_1QUE == 25 || EP20_1QUE == 26)
		showevent 0, 1, "���K��#20ms23";
	end;
}
jor_sanct.gat,183,131,3	script	���͉�����u#20ms4	10538,{/* 3426 */}
jor_sanct.gat,184,130,5	script	���͉�����u#20ms5	10538,{/* 3427 */}
jor_sanct.gat,183,130,7	script	���͉�����u#20ms6	10540,{/* 3428 */}

jor_sanct.gat,42,105,0	script	#20ms20	139,9,9,{/* 3429 */
	if(EP20_1QUE == 26)
		cloakoffnpc "���K��#20ms24";
	else if(EP20_1QUE == 27) {
		cloakoffnpc "���C�W�[#20ms21";
		cloakoffnpc "���n�[��#20ms21";
		cloakoffnpc "�~���A��#20ms21";
	}
	end;
}
jor_sanct.gat,42,105,5	script(CLOAKED)	���K��#20ms24	10473,{/* 3430 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�Ȃ������ɐl�Ԃ�!?";
		close;
	}
	if(EP20_1QUE == 26) {
		mes "[���K��]";
		mes "�V���������i�Ղ��ȁH";
		mes "�c�O�����A�L�~�ɓn���d����";
		mes "�����Ȃ��Ă��܂����B";
		next;
		mes "[���K��]";
		mes "�ɂ���������S��������";
		mes "����Ă��܂����̂��B";
		mes "�ĊO���́A���������d����";
		mes "���ɍ����Ă���̂��������B";
		next;
		mes "[���K��]";
		mes "�����Ɓc�c���̎勳�ɂ͌����Ȃ�B";
		mes "�z��̎d���܂�";
		mes "�󂯎�����͖�������ȁB";
		next;
		menu "�l��s���Ȃ̂ł���",-;
		mes "[���K��]";
		mes "���̒ʂ肾�B";
		mes "���������K���h�l�̕��������钆";
		mes "��X�͐S�g�𐴂߂�K�v������B";
		mes "�������A�J���Ɍg���҂����Ȃ�����";
		mes "�勳�ł����Ă��d�������˂΂Ȃ�Ȃ��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̑��u�́A�O�����炫���l�Ԃ�";
		mes "���o�����ƕ����܂����B";
		next;
		mes "[���K��]";
		mes "���͂��z�����鑕�u���ȁB";
		mes "�������B";
		mes "���̍����̐l�Ԃ���������̂��B";
		mes "�z�͐l�Ԃ̂�����";
		mes "���͂������Z�p�������Ă���B";
		next;
		mes "[���K��]";
		mes "���K���̒��ł��A�����̎�p�t�݂̂�";
		mes "���͂̈����ɒ����Ă��邪";
		mes "����ɗ��Ȃ��Z�p���B";
		mes "���X�A�l�Ԃ������������B";
		next;
		mes "[���K��]";
		mes "���̍����̐l�Ԃ̏��͂ɂ����";
		mes "���������K���h�l�̕�����";
		mes "�����̂��̂ƂȂ낤�Ƃ��Ă���B";
		mes "����䂦�ɁA���X�K���h�l��";
		mes "�M�����Ă���Ƃ����킯���B";
		next;
		menu "���X�K���h�l�́A�ǂ���ɂ����܂����H",-;
		mes "[���K��]";
		mes "�����c�c���ʂȗ��R���Ȃ������";
		mes "��X�勳�Ƃ����ǂ�";
		mes "���̂��p�����邱�Ƃ͂ł��Ȃ��B";
		mes "�����b�ɂ���";
		mes "���������K���h�l�����ׂ̈�";
		mes "���͂��Ă�����炵�����B";
		next;
		menu "�u���̏ꏊ�v�ŁA�ł����H",-;
		mes "[���K��]";
		mes "���̏ꏊ�Ƃ́A�Ȃ�̂��Ƃ��H";
		mes "���̂����������ŉ������Ă����邩";
		mes "��X���m��K�v�͂Ȃ��B";
		next;
		mes "[���K��]";
		mes "���������΁A�����̐l�ԈȊO�ɂ�";
		mes "�n�[�g�Ȃ�Ƃ��ƌĂ΂��l�Ԃ�����B";
		mes "�z��́A���X�K���h�l�⍕���̐l�Ԃ�";
		mes "��q�����邱�Ƃ����邻�����B";
		next;
		mes "[���K��]";
		mes "���i�́A�L�~�������Ă���";
		mes "���̑��u���疂�͂𒊏o���Ă���B";
		mes "�C�ɂȂ����̂Ȃ�T���Ă݂�Ɨǂ��B";
		next;
		menu "����́A�M���ɓn���悤�Ɍ����āc�c",-;
		mes "[���K��]";
		mes "�Ȃɂ��H";
		mes "���ɂ܂��d���������t������肩�I";
		mes "���x�͋�����I�@�R�c���Ă��I";
		next;
		cloakoffnpc "���C�W�[#20ms21";
		mes "[���C�W�[]";
		mes "���`���A�`���ҁI";
		mes "�T���Ă���B";
		mes "���A���傤�Ǒ��݂̂�Ȃ�";
		mes "�W�܂��ė������I";
		next;
		cloakoffnpc "���n�[��#20ms21";
		cloakoffnpc "�~���A��#20ms21";
		mes "[���n�[��]";
		mes "�ӂ��`�A���Ƃ������ł��܂����B";
		next;
		mes "[�~���A��]";
		mes "��������̎d���������t������";
		mes "�����o���̂ɋ�J���܂����B";
		next;
		menu "�������͓����܂������H",-;
		mes "[���n�[��]";
		mes "���ꂪ�S�R�B";
		mes "�d���̘b�͂��邭����";
		mes "���̑��̂��Ƃ͋����Ă���܂���B";
		next;
		mes "[�~���A��]";
		mes "�i�Ղɋ�����K�v�͂Ȃ��B";
		mes "�Ƃ������͋C�ł����ˁB";
		next;
		menu "���C�W�[����͂ǂ��ł��H",-;
		mes "[���C�W�[]";
		mes "���ꂪ���`���̕ϑ�����";
		mes "�u�i�h���K���h�v�̕]�����ň��łˁB";
		mes "�N�����Ƙb�����Ă���Ȃ��񂾂�I";
		mes "�l�I���ԈႦ���ȁ`�����B";
		next;
		mes "[���C�W�[]";
		mes "�Ƃ����킯����������W�ɂ�";
		mes "�����������Ԃ��|���肻������B";
		mes "�ŁA�`���҂̕��͂ǂ��H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���X�K���h�̋��ꏊ�𕷂��܂�����";
		mes "���͓����܂���ł����B";
		mes "�����c�c���������K���h�̕�����";
		mes "�߂Â��Ă���ƁA�݂�Ȍ����Ă��܂��B";
		next;
		mes "[���n�[��]";
		mes "�����ł��ˁB���������Ă���悤�ł��B";
		mes "�ł��A�~������񂪓����܂���B";
		mes "�{���ɒm��Ȃ��̂ł��傤���H";
		next;
		mes "[���C�W�[]";
		mes "�N���m���Ă���͂����B";
		mes "�Ⴆ�΁A���X�K���h�̉E���";
		mes "�Ă΂�Ă�勳���c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�m�����O�́c�c�B";
		next;
		mes "[���C�W�[]";
		mes "�u^0000cd�T���N�K���h^000000�v�B";
		mes "�N�����A���������d�؂��Ă����";
		mes "�����Ă����C������B";
		next;
		mes "[���C�W�[]";
		mes "�悵�A�T���N�K���h�l�Ɏ�������";
		mes "���𕷂������Ƃ��悤�I";
		mes "���������A���K�������̎d������`����";
		mes "�T���N�K���h�l�̂��ዾ��";
		mes "���Ȃ���������Ȃ����I";
		next;
		mes "[���C�W�[]";
		mes "�`���҂́u�p���X�K���h�v�̂Ƃ����";
		mes "�s���Ă݂Ă���B";
		mes "������ƈ���T���Ă�������ȁB";
		next;
		chgquest 17700,17701;
		set EP20_1QUE,27;
		delitem 568,1;
		mes "�]�p���X�K���h�̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�p���X�K���h�̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 252, 115;
		end;
	}
	if(EP20_1QUE == 27) {
		mes "[���K��]";
		mes "���̎d�����c�c�ʔ������낤���H";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 26)
		showevent 0, 1, "���K��#20ms24";
	end;
}
jor_sanct.gat,47,105,1	script(CLOAKED)	���n�[��#20ms21	10472,{/* 3431 (cloaking)*/
	mes "[���n�[��]";
	mes "�������������܂�܂��ˁc�c�B";
	close;
}
jor_sanct.gat,47,108,3	script(CLOAKED)	�~���A��#20ms21	10471,{/* 3432 (cloaking)*/
	mes "[�~���A��]";
	mes "���K�������̎�`�������Ȃ���";
	mes "�����W�߂悤���B";
	close;
}
jor_sanct.gat,44,108,5	script(CLOAKED)	���C�W�[#20ms21	10474,{/* 3433 (cloaking)*/
	if(EP20_1QUE == 27) {
		mes "[���C�W�[]";
		mes "�`���҂́u�p���X�K���h�v�̂Ƃ����";
		mes "�s���Ă݂Ă���B";
		mes "������ƈ���T���Ă�������ȁB";
		next;
		mes "�]�p���X�K���h�̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�p���X�K���h�̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 252, 115;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 27)
		showevent 0, 1, "���C�W�[#20ms21";
	end;
}
jor_sanct.gat,157,171,3	script	�T���N�K���h#20ms20	10473,{/* 3434 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�T���N�K���h]";
		mes "�Ȃ��l�Ԃ������ɂ���I";
		close;
	}
	if(EP20_1QUE == 40) {
		mes "[�T���N�K���h]";
		mes "�c�c�B";
		next;
		menu "���́A�勳�l�H",-;
		mes "[�T���N�K���h]";
		mes "�c�c���A��������";
		mes "�����ځ[���Ƃ��Ă���H";
		emotion 6,"�T���N�K���h#20ms20",1;
		next;
		menu "���A���͂悤�������܂��B",-;
		mes "[�T���N�K���h]";
		mes "���A�́A���������B";
		mes "�i�h���K���h���A��ė���";
		mes "�i�Ղ炵���ȁH";
		mes "��@�C���ɓ������Ă����ƁB";
		next;
		mes "[�T���N�K���h]";
		mes "���O�����̎勳������";
		mes "��`���Ă����̂͒m���Ă���B";
		next;
		emotion 9,"",1;
		mes "[�T���N�K���h]";
		mes "�勳�Ɋ���d����C���Ă�����";
		mes "�����Ɋ���Ă��Ȃ�������";
		mes "����΂��茾���B";
		next;
		mes "[�T���N�K���h]";
		mes "���̓_�A���O�͏�肭����Ă��ꂽ�B";
		mes "�����ł��O��";
		mes "���ʂȎd����C������肾�B";
		next;
		menu "���ʂȎd���ł����H",-;
		mes "[�T���N�K���h]";
		mes "�������B";
		mes "�B�ꂽ[��]�̐�ɖ傪����B";
		mes "���̎҂ɋC�t����ʂ悤";
		mes "�Â��ɂ��ė���̂��B";
		next;
		chgquest 8840,17702;
		set EP20_1QUE,41;
		mes "�]�B�ꂽ����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�B�ꂽ����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 27, 278;
		end;
	}
	if(EP20_1QUE == 41) {
		mes "[�T���N�K���h]";
		mes "�B�ꂽ[��]�̐�ɖ傪����B";
		mes "���̎҂ɋC�t����ʂ悤";
		mes "�Â��ɂ��ė���̂��B";
		next;
		mes "�]�B�ꂽ����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�B�ꂽ����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 27, 278;
		end;
	}
	mes "[�T���N�K���h]";
	mes "�s�g�ȗ\�������邪";
	mes "�ǂ��\��������c�c�B";
	close;
OnQuestInfo:
	if(EP20_1QUE == 40 || EP20_1QUE == 41)
		showevent 0, 1, "�T���N�K���h#20ms20";
	end;
}
jor_sanct.gat,22,283,5	script	�ē�#ep20_DQ_9	10473,5,5,{/* 3435 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�ē�]";
		mes "�Ȃ������ɐl�Ԃ��I";
		close;
	}
	if(EP20_1QUE == 41) {
		mes "[�ē�]";
		mes "���҂��I";
		mes "�c�c���O�͎i�Ղ��H";
		mes "�Ȃ������ɂ���I";
		next;
		emotion 9,"",1;
		menu "�T���N�K���h�l�Ɍ����āc�c",-;
		mes "[�ē�]";
		mes "�T���N�K���h����H";
		mes "��������ꂽ�񂾁H";
		next;
		cloakoffnpc "�T���N�K���h#20ms31";
		mes "[�T���N�K���h]";
		mes "�c�c���𑛂��ł���H";
		next;
		mes "[�ē�]";
		mes "���̎i�Ղ��A���O�̖��O�����ɂ������I";
		next;
		mes "[�T���N�K���h]";
		mes "�������B�����A��ė����B";
		next;
		mes "[�ē�]";
		mes "�͂͂��I";
		mes "�킩�������I";
		mes "�������A�����������Ƃ��ȁI";
		mes "�Ȃ��H�@�����Ȃ񂾂�H";
		next;
		menu "���ł����H",-;
		mes "[�ē�]";
		mes "�|�����Ƃ��Ă��I";
		mes "��������ȁA�T���N�K���h�H";
		next;
		mes "[�T���N�K���h]";
		mes "���t�����ɋC������B";
		mes "���O�̂��̌�����";
		mes "���X�K���h�l�̂����ɓ����";
		mes "���O�͒ǂ��o����邩�������B";
		next;
		mes "[�ē�]";
		mes "����Ȃ͂����邩�B";
		mes "�N�����|���ɔM�S�ȉ���";
		mes "�ǂ��o���͂����Ȃ��I";
		next;
		mes "[�T���N�K���h]";
		mes "���X�K���h�l���ʂ��铹��";
		mes "�Y��Ő�捂Ȃ��̂łȂ���΂Ȃ�Ȃ��B";
		mes "���̎i�Ղ́A���ׂ̈̐l�ނ��B";
		next;
		mes "[�ē�]";
		mes "�������I";
		mes "�����ł����l��s������������";
		mes "���傤�ǂ悩�����B";
		mes "�Ƃ���ŁA���̎i�Ղ͐M�p�ł���̂��H";
		next;
		mes "[�T���N�K���h]";
		mes "�O�͎�p�t�������Ď����Ă��邵";
		mes "�勳�ł���i�h���K���h��";
		mes "�A��ė����҂������B";
		next;
		mes "[�ē�]";
		mes "�A��ė����ҁu�����v�H";
		mes "���ɂ��l�ނ�����̂��I";
		mes "�悵�A�S�������ɗ�������I";
		mes "�S���A�����g���Ă��I";
		emotion 18,"�ē�#ep20_DQ_9",1;
		next;
		mes "[�T���N�K���h]";
		mes "�����ƕi�̂��錾�t�����ȁc�c�B";
		next;
		mes "[�ē�]";
		mes "�����A���������I";
		mes "���O�͂����ɐl����A��ė����B";
		mes "����ŏ\�����B";
		mes "�������Ɩ߂��Ď����̎d��������B";
		next;
		mes "[�T���N�K���h]";
		mes "�܂������c�c";
		mes "�ł͔C���邪�A���X�K���h�l�̂��@����";
		mes "���˂�킯�ɂ͂�����B";
		mes "�����炨�}���Ɍ���������";
		mes "�����������Ă����̂����B";
		next;
		mes "[�ē�]";
		mes "�����d����K���ɂ������Ƃ��邩�H";
		mes "�������Y��ɂ��Ă����Ă�邩��";
		mes "�������ƍs���B";
		next;
		menu "�������s�������܂��I",-;
		mes "[�T���N�K���h]";
		mes "���O�́A�����ł��ׂ����Ƃ�����B";
		mes "���ׂ��d���ɐ�O����B";
		next;
		cloakonnpc "�T���N�K���h#20ms31";
		mes "[�ē�]";
		mes "2�l�����ɂȂ����ȁB";
		mes "�d���̓��e�������Ă��B";
		mes "���̐�ɂ���C�����̈���";
		mes "�񐶒���|���΂����B";
		next;
		menu "�񐶒��ł����H",-;
		mes "[�ē�]";
		mes "�y���̂���^0000cd���������K���h�E�K�[�f�B�A��^000000��";
		mes "�Ă΂��z�炾�B";
		mes "���炩�Ɋ�Ȍ`�����Ă���B";
		emotion 6,"�ē�#ep20_DQ_9",1;
		next;
		mes "[�ē�]";
		mes "����̂ǂ����K�[�f�B�A���Ȃ񂾁H";
		mes "�ǂ��l���Ă��񐶒�����B";
		mes "�ŏ��ɖ��t�����z��";
		mes "�ǂ������Ă��ɈႢ�Ȃ��B";
		next;
		menu "������������܂���",-;
		mes "[�ē�]";
		mes "�������B";
		mes "�����ŗ{�����z������Đ�����";
		mes "�����̊񐶒����B";
		next;
		mes "[�ē�]";
		mes "�����ƁI";
		mes "����Ȃ��Ƃ��Ă���ꍇ����Ȃ��I";
		mes "�Ԃ��Ȃ����������X�K���h�l���ʂ�B";
		mes "���̑O�ɓz���Еt���Ȃ���Ȃ��B";
		mes "���ꂪ�������̎d�����B";
		next;
		menu "�ǂ����炨�߂�ɂȂ��܂����H",-;
		mes "[�ē�]";
		mes "����Ȃ͉̂������ɂƂ�����";
		mes "�ǂ��ł��ǂ����Ƃ��B";
		mes "�����ʘH���L���C�ɂ���Ηǂ��B";
		next;
		mes "[�ē�]";
		mes "�ŋ߂́A�O���痈���l�Ԃ�A���";
		mes "���낢�����Ă����邪";
		mes "��肭�����Ă��Ȃ��̂�";
		mes "�@���������݂��������ȁB";
		next;
		mes "[�ē�]";
		mes "�悵�A���̐�������2��ނ�";
		mes "^0000cd���������K���h�E�K�[�f�B�A��^000000��";
		mes "1�C���|���Ă����B";
		mes "���ꂮ�炢�Ȃ�ł��邾�낤�H";
		close2;
		chgquest 17702,17703;
		set EP20_1QUE,42;
		end;
	}
	if(EP20_1QUE == 42) {
		if(!(checkquest(17703) & 0x4)) {
			mes "[�ē�]";
			mes "�|���Ă����̂��H";
			next;
			mes "[�ē�]";
			mes "���������I�@�z��͂��̐��";
			mes "���X�Ƃ�����Ă�₪��I";
			mes "2��ނ�";
			mes "^0000cd���������K���h�E�K�[�f�B�A��^000000��";
			mes "1�C���|���Ă����B";
			close;
		}
		mes "[�ē�]";
		mes "�|���Ă����̂��H";
		next;
		menu "�͂��A�|���Ă��܂���",-;
		mes "["+strcharinfo(0)+"]";
		mes "������͂Ȃ�";
		mes "���������U�����܂����H";
		mes "�ߕt�����ґS�ĂɍU�����Ă��܂��B";
		mes "^0000cd�����ɉ����d�v�ȕ�^000000�ł�";
		mes "����̂ł��傤���H";
		next;
		mes "[�ē�]";
		mes "����Ȃ��ƒm�邩�B";
		mes "�������n�������炶��Ȃ����H";
		mes "�c�c���Ԃ񃉃X�K���h�l���ڊo�߂�ꂽ";
		mes "����ɋ߂����A���͂��L�x������";
		mes "�����ɉ����񂹂��Ƃ�����B";
		emotion 4,"",1;
		next;
		mes "[�ē�]";
		mes "���O�ʂ��^0000cd����^000000";
		mes "��������Ȃ���";
		mes "�����͉�烋�K���̗̈悾�B";
		mes "�|���Ă��|���Ă��N���ė���";
		mes "�ʓ|�ȓz�炾��c�c�B";
		next;
		cloakoffnpc "���n�[��#20ms30";
		cloakoffnpc "�~���A��#20ms30";
		mes "[�ē�]";
		mes "�����A���҂��I";
		next;
		mes "[���n�[��]";
		mes "���c�c�T���N�K���h�l��";
		mes "�����̑|������`���Ƌ��āc�c�B";
		next;
		mes "[�ē�]";
		mes "���O�������A�V���������҂������I";
		emotion 2,"�ē�#ep20_DQ_9",1;
		next;
		mes "[�~���A��]";
		mes "���̐��|������΂����ł����H";
		next;
		mes "[�ē�]";
		mes "�������B";
		mes "���̕t�߂́A���̎i�Ղ��ЂÂ�����";
		mes "���̎勳���������̐��";
		mes "���ꂼ��|�����s���Ă���B";
		next;
		mes "[�ē�]";
		mes "���O�����͑|�����̎勳��������`���B";
		mes "���X�K���h�l��������ʂ�܂ł�";
		mes "�܂����Ԃ�����͂����B";
		mes "�ŋ߁A�Z�������Ă����邩��ȁB";
		mes "�c�c�����̂��O�I";
		next;
		menu "�͂��A���ł����H",-;
		mes "[�ē�]";
		mes "�����A���O���B";
		mes "�V���������z��A���";
		mes "���̐�ɂ���u�J����v�ɍs���B";
		mes "���O���A������̑叫���B";
		next;
		mes "[�ē�]";
		mes "�撣���B";
		mes "�h���̂��̓����������ɂ�";
		mes "���O�̐Ȃ��p�ӂ���邩������Ȃ��B";
		next;
		mes "[���n�[��]";
		mes "<FONT SIZE = 10>�������A�ǂ��ɍs���΂����ł����H</FONT>";
		next;
		menu "�T���N�K���h���c�c",-;
		mes "[�~���A��]";
		mes "���̎҂����X�K���h���}����";
		mes "�s���Ă���̂ł����H";
		mes "�܂�A���̎҂́u���Ձv��ǂ���";
		mes "���X�K���h�̋��ꏊ���킩��̂ł��ˁB";
		unittalk getnpcid(0,"���n�[��#20ms30"),"���n�[�� : �悵�A�ǂ��|���܂��傤�I",1;
		close2;
		cloakonnpc "���n�[��#20ms30";
		cloakonnpc "�~���A��#20ms30";
		chgquest 17703,17704;
		set EP20_1QUE,43;
		end;
	}
	if(EP20_1QUE == 43) {
		mes "[�ē�]";
		mes "���X�K���h�l�̂��@���𑹂˂Ȃ��悤";
		mes "�Y��ɕЕt���Ȃ���Ȃ�Ȃ��I";
		close2;
		unittalk getcharid(3),strcharinfo(0)+" : �ւ̖��H��i��ŃT���N�K���h��ǂ����B",1;
		end;
	}
	if(EP20_1QUE == 100) {
		mes "[�ē�]";
		mes "�|���͂܂��Ȃ̂��H";
		mes "�C�s����Ƃ����C������";
		mes "�ꐶ�����|�������B";
		mes "�����̎����߂Â��Ύi�Ղƌ����ǂ�";
		mes "���̕��̂��߂ɓ�����悤�ɂȂ�B";
		//if(checkquest(131265) == 0) {
		//	setquest 131265;
		//	compquest 131265;
		//}
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�ւ̖��H)") == 2) {
			mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
			next;
			mes "[�ē�]";
			mes "�悵�B";
			mes "���ꂶ��A���n�܂ł������H";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_maze.gat", 140, 74;
			end;
		}
		setarray '@questname$,"�ւ̖��H�̑|��";
		setarray '@questid,17710;
		setarray '@coolid,17711;
		setarray '@gainlist,1001217,10;
		setarray '@explist,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// �ւ̖��H�̑|��
			if(checkquest(17711)) {
				if(checkquest(17711)&2 == 0) {
					mes "[�ē�]";
					mes "���ł��������񂾁H";
					mes "�����͂����|�������Ȃ��Ă������B";
					mes "�܂��������Ă���B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ւ̖��H�̑|��^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close;
				}
			}
			if(checkquest(17710)) {
				if(checkquest(17710)&4 == 0) {
					mes "[�ē�]";
					mes "^e5555eJ�K�[�f�B�A��-P^000000��";
					mes "^e5555eJ�K�[�f�B�A��-Y^000000��";
					mes "�e5�C���|���Ă����B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ւ̖��H�̑|��^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close;
					}
					delquest 17710;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ւ̖��H�̑|��^000000�v";
					mes "��j�����܂����B";
					close;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�ւ̖��H�̑|��^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>J�K�[�f�B�A��-P<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD1</INFO></URL>�@5��";
				mes "�ΏہF<URL>J�K�[�f�B�A��-Y<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD2</INFO></URL>�@5��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�ւ̖��H�̑|��^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close;
				}
				delquest 17710;
				setquest 17711;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[�ē�]";
				mes "�i�Ղ������ɕ�d�������A�ŁA";
				mes "�����Y��ɂȂ����B";
				mes "������₵�Ă����C���������";
				mes "�������肵�����B�悭������B";
				mes "�����͋x��ŁA�����܂����Ă���B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close;
			}
			mes "[�ē�]";
			mes "���O���B���傤�ǂ����Ƃ���ɂ����B";
			mes "���̑O�Ɍ��������ɐl�Ԉ�l���N������";
			mes "�����ɂȂ����炵���B";
			mes "�ߍ����X�K���h�l�̂��@����";
			mes "�����ƌ����b���������Ă���B";
			next;
			mes "[�ē�]";
			mes "������A���ꐶ������";
			mes "�|�������Ȃ����Ⴂ���Ȃ��B";
			mes "�ȑO�̂悤�ɕ�����΂����̂ɁA";
			mes "��������Ȃ��̂́A���X�K���h�l��";
			mes "�����l��������̂��낤�B";
			next;
			mes "[�ē�]";
			mes "��������̊񐶒������A";
			mes "^e5555eJ�K�[�f�B�A��-P^000000��";
			mes "^e5555eJ�K�[�f�B�A��-Y^000000��";
			mes "�e5�C���|���Ă��Ă���B";
			next;
			mes "[�ē�]";
			mes "�����炪���Ȃ��Ȃ�΁A";
			mes "�������肷��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�ւ̖��H�̑|��^000000�v";
			mes "<���e>";
			mes "�ΏہF<URL>J�K�[�f�B�A��-P<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD1</INFO></URL>�@5��";
			mes "�ΏہF<URL>J�K�[�f�B�A��-Y<INFO>https://rotool.gungho.jp/monster/EP20_JORMUNGUARD2</INFO></URL>�@5��";
			mes "�̓������󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�ē�]";
				mes "���H�x�ށH";
				mes "�ӂށc�c�܂��A�������킸��";
				mes "���Ȃ���肩�͂������B";
				mes "���������B";
				mes "�����͋x��ŁA�����܂������B";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close;
			}
			if(checkquest(17711)) delquest 17711;
			setquest 17710;
			mes "[�ē�]";
			mes "�悵�A�����Ă����B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�ւ̖��H�̑|��^000000�v";
			mes "���󒍂��܂����B";
			close;
		}
	}
	mes "[�ē�]";
	mes "���X�K���h�l�̂��@���𑹂˂Ȃ��悤";
	mes "�Y��ɕЕt���Ȃ���Ȃ�Ȃ��I";
	close;
OnTouch:
	if(EP20_1QUE == 41)
		unittalk "�ē� : ���O���H�@���O�������Ȃ̂��H",1;
	end;
OnQuestInfo:
	if(checkquest(17703) && !checkquest(17703)&0x4)
		showevent 0, 2, "�ē�#ep20_DQ_9";
	else if(EP20_1QUE == 41 || EP20_1QUE == 42)
		showevent 0, 1, "�ē�#ep20_DQ_9";
	else if(EP20_1QUE == 100 && checkquest(17710)&4 == 0)
		showevent 0, 3, "�ē�#ep20_DQ_9";
	end;
}
jor_sanct.gat,26,282,3	script(CLOAKED)	���n�[��#20ms30	10472,{/* 3436 (cloaking)*/}
jor_sanct.gat,25,280,1	script(CLOAKED)	�~���A��#20ms30	10471,{/* 3437 (cloaking)*/}
jor_sanct.gat,26,283,3	script(CLOAKED)	�T���N�K���h#20ms31	10473,{/* 3438 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�T���N�K���h]";
		mes "�Ȃ��l�Ԃ������ɂ���I";
		close;
	}
	end;
}

jor_maze.gat,15,47,7	script	�J����1�ւ̓���#20ms40	10046,{/* 3439 */
	if(EP20_1QUE == 43) {
		unittalk getcharid(3),strcharinfo(0)+" : �T���N�K���h�̍��Ղ��c���Ă���I�@�����Ă݂悤",1;
		if(!sleep2(500)) end;
	}
	warp "jor_safty2.gat", 193, 36;
	end;
OnQuestInfo:
	if(EP20_1QUE == 43)
		showevent 0, 1, "�J����1�ւ̓���#20ms40";
	end;
}
jor_safty2.gat,193,39,0	script	#20ms40_sw	139,5,5,{/* 3440 */
	if(EP20_1QUE == 43 || EP20_1QUE == 44) {
		cloakoffnpc "�~���A��#20ms40";
		cloakoffnpc "���n�[��#20ms40";
		cloakoffnpc "���K��#20ms40";
		cloakoffnpc "���K��#20ms41";
		cloakoffnpc "J�K�[�f�B�A��#ms40";
	}
	end;
}
jor_safty2.gat,190,38,7	script(CLOAKED)	�~���A��#20ms40	10471,{/* 3441 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�~���A��]";
		mes "�����ł̓��K���ɕϐg���Ă�������";
		mes "�ǂ��ł���B";
		close;
	}
	if(EP20_1QUE == 43) {
		mes "[�~���A��]";
		mes "�T���N�K���h�̍��Ղ�ǂ��Ă��܂�����";
		mes "�����ȒP�ɂ͂����Ȃ��ˁc�c�B";
		next;
		mes "[���n�[��]";
		mes "�����͊ē��������Ă�";
		mes "�J����ł��傤���H";
		unittalk getnpcid(0,"���K��#20ms40"),"���K�� : �����A�߂܂���I�I",1;
		next;
		menu "���̂悤�ł�",-;
		mes "[�~���A��]";
		mes "�c�c����������Ă���H";
		next;
		mes "[���n�[��]";
		mes "����𓢔����邱�Ƃ�";
		mes "�|�����ƌ����Ă��ł��ˁH";
		next;
		menu "�͂��A�����ł�",-;
		mes "[�~���A��]";
		mes "����́c�c���Ȃ̂ł����H";
		unittalk getnpcid(0,"J�K�[�f�B�A��#ms40"),"J�K�[�f�B�A�� : �������[",1;
		unittalk getnpcid(0,"���K��#20ms41"),"���K�� : �قړ|�����I�I",1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���������K���h�E�K�[�f�B�A����";
		mes "�Ă΂�Ă���悤�ł��B";
		unittalk getnpcid(0,"���K��#20ms40"),"���K�� : �M���A�I�I",1;
		unittalk getnpcid(0,"���K��#20ms41"),"���K�� : ���v���I",1;
		next;
		mes "[���n�[��]";
		mes "�����ɑ��𓥂ݓ��ꂽ�҂�";
		mes "���X�ɍU�����Ă���悤�ł��ˁB";
		mes "�ق�A���K�����U������Ă��܂��B";
		next;
		mes "[�~���A��]";
		mes "������ɂƂ��Ă͓s�����ǂ��ł��ˁB";
		next;
		mes "[���n�[��]";
		mes "�������b�𕷂��܂�����";
		mes "���X�K���h�͒���I�ɂ��̒ʘH��";
		mes "�s�������Ă���悤�ł��ˁB";
		unittalk getnpcid(0,"���K��#20ms40"),"���K�� : �Ȃ�ċ��\�ȓz�炾�I",1;
		next;
		menu "�����݂����ł�",-;
		mes "[�~���A��]";
		mes "�o�S�b�g���ꏏ��";
		mes "�s�����Ă��邻���ł��B";
		next;
		mes "[���n�[��]";
		mes "���̐�ŉ�������Ă��ł��傤���H";
		next;
		mes "[�~���A��]";
		mes "^0000cd�������K�[�f�B�A����������闝�R��";
		mes "^0000cd���X�K���h���s�������闝�R��";
		mes "�����֌W������悤�Ɏv���܂��B";
		next;
		mes "[�~���A��]";
		mes "�{�N�́A�����Ɏc��܂��B";
		mes "���̃��K����������";
		mes "���������邩������܂��񂩂�B";
		next;
		mes "[���n�[��]";
		mes "�ł͎������͈�������";
		mes "�T���N�K���h�̍��Ղ�ǂ��܂��傤�B";
		close2;
		chgquest 17704,17705;
		set EP20_1QUE,44;
		end;
	}
	if(EP20_1QUE == 44) {
		mes "[�~���A��]";
		mes "�{�N�́A�����Ɏc��܂��B";
		mes "���̃��K����������";
		mes "���������邩������܂��񂩂�B";
		next;
		mes "[���n�[��]";
		mes "�ł͎������͈�������";
		mes "�T���N�K���h�̍��Ղ�ǂ��܂��傤�B";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 43)
		showevent 0, 1, "�~���A��#20ms40";
	end;
}
jor_safty2.gat,189,36,7	script(CLOAKED)	���n�[��#20ms40	10472,{/* 3442 (cloaking)*/}
jor_safty2.gat,193,42,7	script(CLOAKED)	���K��#20ms40	10475,{/* 3443 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�Ȃ��l�Ԃ��I";
		close;
	}
	unittalk "���K�� : �����͈�i�Ƌ��\���ȁI",1;
	end;
}
jor_safty2.gat,196,40,7	script(CLOAKED)	���K��#20ms41	10473,{/* 3444 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�l�Ԃ߂��I";
		close;
	}
	unittalk "���K�� : �̂����������c",1;
	end;
}
jor_safty2.gat,196,44,3	script(CLOAKED)	J�K�[�f�B�A��#ms40	21972,{/* 3445 (cloaking)*/}
jor_safty2.gat,193,31,0	warp	#20ms41	1,1,jor_maze.gat,15,40
jor_maze.gat,17,153,7	script	�J����2�ւ̓���##20ms42	10046,{/* 3447 */
	warp "jor_safty2.gat", 316, 36;
	end;
OnQuestInfo:
	if(EP20_1QUE == 44)
		showevent 0, 1, "�J����2�ւ̓���##20ms42";
	end;
}
jor_safty2.gat,313,36,0	script	#20ms40_sw	139,5,5,{/* 3448 */
	if(EP20_1QUE == 44) {
		cloakoffnpc "���n�[��#20ms41";
		cloakonnpc "���K��#20ms42";
		cloakonnpc "���K��#20ms43";
	}
	if(EP20_1QUE == 45) {
		cloakonnpc "���n�[��#20ms41";
		cloakonnpc "���K��#20ms42";
		cloakonnpc "���K��#20ms43";
	}
	end;
}
jor_safty2.gat,310,43,3	script(CLOAKED)	���n�[��#20ms41	10472,{/* 3449 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���n�[��]";
		mes "�`���җl�I";
		mes "���K���ɕϐg���Ȃ��ƃ}�Y�C�ł���I";
		close;
	}
	if(EP20_1QUE == 44) {
		mes "[���n�[��]";
		mes "�T���N�K���h�̍��Ղ�ǂ��Ă��܂�����";
		mes "�r�؂�r�؂��";
		mes "�T���̂ɋ�J���܂��B";
		next;
		menu "�����͂܂�Ŗ��H�ł���",-;
		mes "[���n�[��]";
		mes "�{���ɂ����ł��ˁc�c";
		mes "�������A���ɖ������񂶂�Ȃ��ł����H";
		next;
		cloakoffnpc "���K��#20ms42";
		cloakoffnpc "���K��#20ms43";
		mes "[���K���勳]";
		mes "���҂��H";
		next;
		mes "[���n�[��]";
		mes "���͂悤�������܂��B";
		mes "����`���ɗ��܂����I";
		next;
		mes "[���K���勳]";
		mes "�V���肩�H";
		mes "�i�Ղ���`���ɗ���Ƃ�";
		mes "�����Ă��Ȃ����H";
		next;
		mes "[���n�[��]";
		mes "��@�C������A���Ă����҂ł��B";
		mes "�T���N�K���h�l����";
		mes "����`������悤�Ɍ����܂����B";
		next;
		mes "[���K���勳]";
		mes "�����A�������B";
		mes "�c�c�Ȃ�A���O�͂����Ɏc����";
		mes "��`���Ă���B";
		unittalk getnpcid(0,"���n�[��#20ms41"),"���n�[�� : ���ł����H",1;
		next;
		menu "���́H",-;
		mes "[���K���勳]";
		mes "���O�͑��̏ꏊ�ɍs���B";
		mes "�����͎肪����Ă���B";
		next;
		menu "���X�K���h�l�̒ʂ��铹���c�c",-;
		mes "[���K���勳]";
		mes "���X�K���h�l���ʂ��铹��";
		mes "�d�_�I�ɑ|�����������ƁH";
		mes "����Ȃ�A�O�ɏo�ď�𓹂�i�߁B";
		mes "�񐶒��ǂ����\��Ă���";
		mes "��`�����K�v���낤�B";
		next;
		menu "�킩��܂����I",-;
		mes "[���n�[��]";
		mes "<FONT SIZE = 10>�����|�����I��点�܂��̂�</FONT>";
		mes "<FONT SIZE = 10>��ɐi��ł��������B</FONT>";
		mes "<FONT SIZE = 10>�c�c��ō������܂��傤�B</FONT>";
		close2;
		chgquest 17705,17706;
		set EP20_1QUE,45;
		end;
	}
	if(EP20_1QUE == 45) {
		mes "[���n�[��]";
		mes "<FONT SIZE = 10>�����|�����I��点�܂��̂�</FONT>";
		mes "<FONT SIZE = 10>��ɐi��ł��������B</FONT>";
		mes "<FONT SIZE = 10>�c�c��ō������܂��傤�B</FONT>";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 44)
		showevent 0, 1, "���n�[��#20ms41";
	end;
}
jor_safty2.gat,305,44,5	script(CLOAKED)	���K��#20ms42	10473,{/* 3450 (cloaking)*/
	unittalk "���K�� : ���Âɕ������ȁI",1;
	end;
}
jor_safty2.gat,303,41,5	script(CLOAKED)	���K��#20ms43	10475,{/* 3451 (cloaking)*/
	unittalk "���K�� : ���̊񐶒���������A���L�̔g������������B�o���Ă����B",1;
	end;
}
jor_safty2.gat,320,36,0	warp	#20ms43	1,1,jor_maze.gat,17,147

jor_maze.gat,140,68,0	script	#20ms43	139,5,5,{/* 3453 */
	if(EP20_1QUE == 45 || EP20_1QUE == 46) {
		cloakoffnpc "�h��߂���#20ms40";
		cloakonnpc "���X�n��#ep20_md02";
	}
	if(EP20_1QUE == 47) {
		cloakoffnpc "�h��߂���#20ms40";
		cloakoffnpc "���X�n��#ep20_md02";
	}
	if(EP20_1QUE >= 48) {
		cloakonnpc "�h��߂���#20ms40";
		cloakoffnpc "���X�n��#ep20_md02";
	}
	end;
}
jor_maze.gat,136,72,3	script(CLOAKED)	���X�n��#ep20_md02	10046,{/* 3454 (cloaking)*/
	if(EP20_1QUE >= 47) {
		mes "[�C���t�H���[�V����]";
		mes "���Ɂu���X�n�сv��";
		mes "�N���A���Ă���L�����N�^�[�́A";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u���X�n�сv��";
		mes "����ł��܂��B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u���X�n�сv��";
		mes "���ꂵ�܂����H";
		next;
		if(select("��߂�","�u���X�n�сv����") == 1) {
			mes "�]��߂��]";
			close;
		}
		mes "[�C���t�H���[�V����]";
		mes "�u���X�n�сv�֓��ꂵ�܂��B";
		close2;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[�C���t�H���[�V����]";
			mes "���Ɂu���X�n�сv��";
			mes "�N���A���Ă���L�����N�^�[�́A";
			mes "�p�[�e�B���[�_�[�Ƃ���";
			mes "����ł��܂���B";
			close;
		}
		if(getonlinepartymember() == 0 || getonlinepartymember() > 2) {
			mes "[�C���t�H���[�V����]";
			mes "���̃������A���_���W������";
			mes "2�l�ȉ��̃p�[�e�B�[��";
			mes "���ꂷ�邱�Ƃ��ł��܂��B";
			close;
		}
		switch(mdenter("���X�n��")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[���X�n��] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			//warp "1@twsd.gat", 317, 70;
			end;
		case 1:	// �p�[�e�B�[������
			//mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
			//mes "����ł��܂���B";
			//mes "������x�m�F���Ă���";
			//mes "��蒼���Ă��������B";
			close;
		case 2:	// �_���W�������쐬
			mes "[�C���t�H���[�V����]";
			mes "�Ώۂ̃������A���_���W������";
			mes "�쐬����Ă��Ȃ�����";
			mes "����ł��܂���B";
			close;
		default:	// ���̑��G���[
			close;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 48)
		showevent 0, 1, "���X�n��#ep20_md02";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̓���]";
	end;
}
jor_maze.gat,140,72,3	script(CLOAKED)	�h��߂���#20ms40	10527,{/* 3455 (cloaking)*/
	if(EP20_1QUE == 45) {
		mes "["+strcharinfo(0)+"]";
		mes "�����͖{���ɖ��H�̂悤���c�c";
		mes "�����ƋA��邾�납�H";
		mes "����H�@����́c�c�I";
		next;
		mes "�]�N�����ʂ����悤�ȍ��Ղ�����]";
		next;
		menu "����𒲂ׂ�",-,"���𒲍����Ă݂�",-;
		mes "["+strcharinfo(0)+"]";
		mes "�ǂ��c�c�h�炢�ł���H";
		mes "^0000cd��ԔF����j�Q���鑕�u^000000�̂悤���B";
		mes "���炭�o�S�b�g����������̂��ȁc�c";
		mes "���̐�ɂ���̂��낤���H";
		next;
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "["+strcharinfo(0)+"]";
			mes "���K���łȂ��Ƒ��u���������Ȃ��B";
			mes "���K���ϐg�X�N���[�����g�����B";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "���u�ɐG���Ă݂悤�c�c�B";
		chgquest 17706,17707;
		set EP20_1QUE,46;
		close;
	}
	if(EP20_1QUE == 46) {
		mes "[�g�B�����u]";
		mes "���[�U�[�̊m�F�A�������܂����B";
		next;
		mes "^e6328c�������A���_���W����";
		mes "�u���X�n�сv��";
		mes "�����Ɠ��ꂪ�s���܂��B";
		if(mdopenstate("���X�n��"))
			set '@str$,"^0b0b33�������A���_���W�����֓���";
		else if(getpartyleader(getcharid(1)) == strcharinfo(0))
			set '@str$,"^0b0b33�������A���_���W�����̍쐬";
		next;
		switch(select("^191970��������",'@str$,"^0b0b33���ӎ����̊m�F")) {
		case 1:
			mes "�]���̏�𗣂ꂽ�]";
			close;
		case 2:
			if(mdopenstate("���X�n��")) {
				mes "[�g�B�����u]";
				mes "�ړ��̏������������܂����B";
				next;
				if(select("^191970�����l����","^e6328c���X�n�т֌�����") == 2) {
					mes "�]���̏�𗣂ꂽ�]";
					close;
				}
				mes "[�g�B�����u]";
				mes "�ړ����J�n���܂��B";
				close2;
				cutin "ep19_lehar01.png", 255;
				switch(mdenter("���X�n��")) {
				case 0:	// �G���[�Ȃ�
					announce "�������A���_���W����[���X�n��] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
					//warp "1@twsd.gat", 317, 70;
					end;
				case 1:	// �p�[�e�B�[������
					mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
					mes "����ł��܂���B";
					mes "������x�m�F���Ă���";
					mes "��蒼���Ă��������B";
					close;
				case 2:	// �_���W�������쐬
					mes "^8c32e6�p�[�e�B�[���[�_�[��";
					mes "�������A���_���W������";
					mes "�������Ă��Ȃ���Ԃł��B";
					close;
				default:	// ���̑��G���[
					close;
				}
			}
			else {
				if(getonlinepartymember() < 1) {
					mes "^8c32e6�󔒂̃p�[�e�B�[���ł́A";
					mes "�������A���_���W������";
					mes "�쐬���邱�Ƃ͏o���܂���B";
					close;
				}
				mes "�������A���_���W�������쐬���܂����H";
				next;
				if(select("^191970�����l����","^e6328c�쐬����") == 1) {
					mes "�]���̏�𗣂ꂽ�]";
					close;
				}
				if(getpartyleader(getcharid(1)) != strcharinfo(0))
					close;
				mdcreate "���X�n��";
				mes "���p�[�e�B�[��";
				mes "^009eff"+strcharinfo(1)+"^000000";
				mes "���p�[�e�B�[���[�_�[";
				mes "^009eff"+strcharinfo(0)+"^000000";
				mes "�@";
				mes "^006400���X�n�т�";
				mes "�쐬�\�����󂯕t���܂����B^000000";
				close;
			}
		case 3:
			mes "�ڂ����͂���������m�F���������B";
			mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			messize 180,364;
			close;
		}
	}
	if(EP20_1QUE == 47) {
		mes "�]���n�[���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���n�[���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_back1.gat", 363, 222;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 45 || EP20_1QUE == 46 || EP20_1QUE == 47)
		showevent 0, 1, "�h��߂���#20ms40";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̐����Ɠ���]";
	end;
}

jor_back1.gat,365,226,0	script	#20ms50	139,5,5,{/* 3456 */
OnTouch:
	if(EP20_1QUE == 47) {
		cloakoffnpc "���n�[��#20ms50";
		unittalk getnpcid(0,"���n�[��#20ms50"),"���n�[�� : �`���җl�I�I",1;
	}
	if(EP20_1QUE == 48)
		cloakoffnpc "���n�[��#20ms50";
	end;
}
jor_back1.gat,365,226,3	script(CLOAKED)	���n�[��#20ms50	10469,{/* 3457 (cloaking)*/
	if(EP20_1QUE == 47) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�������Ȃ悤�ŁA�Ȃɂ��ł��B";
		mes "�Ƃ���ŁA�����͂ǂ��c�c�H";
		next;
		menu "���ĕt�����؂̋u�̂悤�ł�",-;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "���̂悤�ł��ˁB";
		mes "���̔L�͎�������";
		mes "�����Ă��ꂽ�݂����ł��B";
		next;
		menu "�X�̏�֖߂�܂��傤",-;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�������܂��傤�B";
		mes "�݂�Ȃƍ������Ȃ��Ƃ����܂���B";
		next;
		cutin "ep19_lehar02.png", 255;
		chgquest 17708,17709;
		set EP20_1QUE,48;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 226, 257;
		end;
	}
	if(EP20_1QUE == 48) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�X�̏�ɖ߂�܂��傤�B";
		mes "�݂�Ȃƍ������Ȃ��Ƃ����܂���B";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 226, 257;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 47 || EP20_1QUE == 48)
		showevent 0, 1, "���n�[��#20ms50";
	end;
}
jor_sanct.gat,72,169,3	script	�E�����K���h#20ms	10473,{/* 3458 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�E�����K���h : �l��!?�@���̎��̐l�Ԃ��I",1;
		end;
	}
	unittalk "�E�����K���h : �d���Ђ��ɂ����Ȃ�āc�c�����ɗ���񂶂�Ȃ������c�c",1;
	end;
}
jor_sanct.gat,69,170,5	script	�o�����K���h#20ms	10474,{/* 3459 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�o�����K���h : �ɁA�l�Ԃ��I",1;
		end;
	}
	unittalk "�o�����K���h : ���ꌩ�āc�c���̎肪�A���̎肪���c�c�I",1;
	end;
}

jor_sanct.gat,185,99,5	script	�T���U�K���h#20ms	10475,{/* 3460 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�T���U�K���h : �l�ԁI �l�Ԃ����邼�I",1;
		end;
	}
	unittalk "�T���U�K���h : ���������Ă񂾂͎̂d���������邽�߂��c�c�H",1;
	end;
}

jor_sanct.gat,243,177,3	script	�J�����K���h#20ms	10474,{/* 3461 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�J�����K���h : ���O�A���̎��̐l�Ԃ��I",1;
		end;
	}
	unittalk "�J�����K���h : ������S�ă��������K���h����^����ꂽ���Ǝv���΁c�c",1;
	end;
}
jor_sanct.gat,52,125,3	script	�t�M�G�K���h#20ms	10475,{/* 3462 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�t�M�G�K���h : ���̂�l�Ԃ߁I",1;
		end;
	}
	unittalk "�t�M�G�K���h : �x�e�����c�c",1;
	end;
}

jor_sanct.gat,91,153,7	script	�Y�����K���h#20ms	10473,{/* 3463 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�Y�����K���h : �Ёc�c�ɁA�l�ԁI",1;
		end;
	}
	unittalk "�Y�����K���h : �����͑f���炵���ꏊ���B�����ɍ��𖄂߂���",1;
	end;
}

jor_sanct.gat,236,140,3	script	�[�K�h�K���h#20ms	10474,{/* 3464 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�[�K�h�K���h : �Ȃ񂾁c�c�l�Ԃ���!?",1;
		end;
	}
	unittalk "�[�K�h�K���h : �������������ɌĂ�ł���������Ȃ�āI",1;
	end;
}

jor_sanct.gat,118,264,5	script	�e���}�K���h#20ms	10473,{/* 3465 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�e���}�K���h : �l�Ԃ��I�@�l�Ԃ����邼�I",1;
		end;
	}
	unittalk "�e���}�K���h : ����Ό���قǊ�������c�c���Ȃ�ꏊ�c�c���X�K���h�l�I",1;
	end;
}

jor_sanct.gat,125,201,5	script	�T�T���K���h#20ms	10475,{/* 3466 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�T�T���K���h : �l�Ԃ��I ���̎��̓z���I",1;
		end;
	}
	unittalk "�T�T���K���h : ���ׂĎ������̎�ł��̂������Ȃ��B",1;
	end;
}

jor_sanct.gat,145,247,7	script	�]�C�V�K���h#20ms	10473,{/* 3467 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�]�C�V�K���h : ���O�́c�c���̎��̐l�ԁI",1;
		end;
	}
	unittalk "�]�C�V�K���h : ���������K���h�l�̗͂���������c�c",1;
	end;
}

jor_sanct.gat,234,155,3	script	�o�����K���h#20ms	10474,{/* 3468 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�o�����K���h : �l�Ԃ��I�@�l�Ԃ����邼�I",1;
		end;
	}
	unittalk "�o�����K���h : �₪�ė����邠�̕��ׂ̈ɁA�ꐶ�����ɓ������I",1;
	end;
}

jor_sanct.gat,98,137,3	script	�I�G���K���h#20ms	10475,{/* 3469 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�I�G���K���h : �N���I�@�����ɐl�Ԃ����邼�I",1;
		end;
	}
	unittalk "�I�G���K���h : ����킵���l�Ԃ����̂����ŁA�ǂꂾ������������J�����Ă邩�I",1;
	end;
}

jor_sanct.gat,138,75,5	script	�s�I�V�K���h#20ms	10473,{/* 3470 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�s�I�V�K���h : �ǂ��Ȃ��Ă���I�@�Ȃ��l�Ԃ����I",1;
		end;
	}
	end;
}

jor_sanct.gat,146,210,7	script	�G�V�I�K���h#20ms	10474,{/* 3471 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�G�V�I�K���h : �������I�@�l�Ԃ߁I",1;
		end;
	}
	unittalk "�G�V�I�K���h : �������͑I�΂ꂽ�I�@�I�΂ꂽ�񂾂�I",1;
	end;
}

jor_sanct.gat,137,110,1	script	�}�C���K���h#20ms	10473,{/* 3472 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�}�C���K���h : �l��!?!?",1;
		end;
	}
	unittalk "�}�C���K���h : ���̓������邱�Ƃ��v���΃��N���N���c�c��������������̂��낤�B",1;
	end;
}

jor_sanct.gat,139,163,5	script	�E�|�V�K���h#20ms	10473,{/* 3473 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�E�|�V�K���h : �Ȃ��l�Ԃ��H�@�����I�@�l�Ԃ����邼�I",1;
		end;
	}
	unittalk "�E�|�V�K���h : �����ɐM�����Ȃ��B�����A���������ɁI",1;
	end;
}

jor_sanct.gat,147,245,1	script	�z�Q���K���h#20ms	10474,{/* 3474 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�z�Q���K���h : ���O�c�c�l��!?",1;
		end;
	}
	unittalk "�z�Q���K���h : ���X�K���h�l�ɁA���ڂɊ|����邾�낤���H",1;
	end;
}

jor_sanct.gat,143,146,5	script	���X�k�K���h#20ms	10475,{/* 3475 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "���X�k�K���h : �ɁA�l�Ԃ��[�I",1;
		end;
	}
	unittalk "���X�k�K���h : �I�΂ꂵ�҂݂̂������ɓ����c�c���A�v������葽���ȁH",1;
	end;
}

jor_sanct.gat,80,88,5	script	�K�g�M�K���h#20ms	10473,{/* 3476 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�K�g�M�K���h : ���O�I�@�l�Ԃ���!!",1;
		end;
	}
	unittalk "�K�g�M�K���h : �����ɗ���ꂽ���Ƃ��h���Ȃ��Ƃł͂Ȃ����I",1;
	end;
}

jor_sanct.gat,91,195,5	script	���h�e�K���h#20ms	10474,{/* 3477 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "���h�e�K���h : �l�Ԃ��������Ă���I",1;
		end;
	}
	unittalk "���h�e�K���h : ����ɓ����Ȃ�āA�l�������Ƃ��Ȃ������̂ɁI",1;
	end;
}

jor_sanct.gat,143,56,5	script	�p�N�I�K���h#20ms	10475,{/* 3478 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�p�N�I�K���h : ����킵���l�Ԃ߁I",1;
		end;
	}
	end;
}
jor_sanct.gat,109,73,1	script	�p�j�p�K���h#20ms	10473,{/* 3479 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�p�j�p�K���h : �l�Ԃ��I",1;
		end;
	}
	unittalk "�p�j�p�K���h : ���X�K���h�l�́A�Ȃ����̐l�Ԃ����T�ɒu���Ă���̂��낤�H",1;
	end;
}

jor_sanct.gat,128,203,3	script	�l�e�I�K���h#20ms	10474,{/* 3480 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�l�e�I�K���h : ���O�I�@�l�Ԃ��ȁI",1;
		end;
	}
	unittalk "�l�e�I�K���h : �w�r�C�`�S�]���Ă�l���Ȃ��H",1;
	end;
}

jor_sanct.gat,53,255,3	script	�q�I���K���h#20ms	10475,{/* 3481 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�q�I���K���h : �l�ԁc�c!?!?",1;
		end;
	}
	unittalk "�q�I���K���h : ����ɗ����͂������A�d��������H�ڂɂȂ�Ƃ͕����ĂȂ��c�c",1;
	end;
}

jor_sanct.gat,178,205,1	script	�T���r�K���h#20ms	10473,{/* 3482 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�T���r�K���h : �l�Ԃ߁I�@�ǂ��o���Ă��I",1;
		end;
	}
	unittalk "�T���r�K���h : ���̕��͂�������̂��c�c���X�K���h�l�̂��炪�������I",1;
	end;
}

jor_sanct.gat,184,97,1	script	�G�}���K���h#20ms	10475,{/* 3483 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�G�}���K���h : ����킵���l�Ԃ߂��I",1;
		end;
	}
	unittalk "�G�}���K���h : ����킵���l�ԋ����̂��΂邩��I�@���̗L��l�����I",1;
	end;
}

jor_sanct.gat,152,226,3	script	�~�A�\�K���h#20ms	10475,{/* 3484 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�~�A�\�K���h : �Ȃ񂾁c�c�l�Ԃ���!?",1;
		end;
	}
	unittalk "�~�A�\�K���h : �Ȃ��勳�����������I�΂ꂽ�̂��낤�H",1;
	end;
}

jor_sanct.gat,80,103,5	script	���i���K���h#20ms	10473,{/* 3485 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "���i���K���h : �ȁc�c�l�Ԃ�!?",1;
		end;
	}
	unittalk "���i���K���h : �����͑��ꂵ���c�c���̕ϐg�W�Ɏu�肵�Ă݂邩�H",1;
	end;
}

jor_sanct.gat,94,105,1	script	�\���x�K���h#20ms	10474,{/* 3486 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�\���x�K���h : �܂����I�@�l�Ԃ����邼�I",1;
		end;
	}
	unittalk "�\���x�K���h : �������́A���߂��̂��낤�H",1;
	end;
}

jor_sanct.gat,98,135,3	script	�[�C�A�K���h#20ms	10474,{/* 3487 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�[�C�A�K���h : �l�ԁI�@�Ȃ������ɂ���!!",1;
		end;
	}
	unittalk "�[�C�A�K���h : ���͕s������B���A�Ȃɂ��A�ǂ��ς�邩�킩��Ȃ�����B",1;
	end;
}

jor_sanct.gat,168,242,1	script	�N�N�I�K���h#20ms	10475,{/* 3488 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�N�N�I�K���h : �l�Ԃ߁I�@����킵���I",1;
		end;
	}
	unittalk "�N�N�I�K���h : ���������K���h�l�����ɂ���������I ���������K���h�l�̏j�����I",1;
	end;
}

jor_sanct.gat,31,127,3	script	�n�[�g�n���^�[#20ms	21994,{/* 3489 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�n�[�g�n���^�[ : ���O�I�@�ǂ�����N�������I",1;
		end;
	}
	unittalk "�n�[�g�n���^�[ : �Ȃ��A���ꂢ�I���񂾁H�@������̎d������A����H",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�n�[�g�n���^�[#20ms1"),"�n�[�g�n���^�[ : �d���˂�����c�c�������̕�����肭����񂾂����B",1;
	if(!sleep2(1000)) end;
	unittalk "�n�[�g�n���^�[ : �S�������Ă��������I�@�����炳�ڂ��Ă邾�����I",1;
	end;
}

jor_sanct.gat,30,123,1	script	�n�[�g�n���^�[#20ms1	21994,{/* 3490 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�n�[�g�n���^�[ : ���O�́I�@�ǂ�����Ă����ɗ����I",1;
		end;
	}
	unittalk "�n�[�g�n���^�[ : ����������ċx�������B",1;
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,"�n�[�g�n���^�[#20ms"),"�n�[�g�n���^�[ : ����Ȃ��ƂɂȂ�Ȃ�Ďv���ĂȂ������I",1;
	end;
}

jor_sanct.gat,202,114,5	script	�n�[�g�n���^�[#20ms2	21994,{/* 3491 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�n�[�g�n���^�[ : ���O�I�@���̎��̐l�Ԃ��ȁI",1;
		end;
	}
	unittalk "�n�[�g�n���^�[ : �d�����c�c�d�����O�{�ɂȂ����c�c",1;
	end;
}

jor_sanct.gat,210,171,3	script	�n�[�g�n���^�[#20ms3	21994,{/* 3492 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		unittalk "�n�[�g�n���^�[ : ���̊��D�I�@�o���o�������I",1;
		end;
	}
	unittalk "�n�[�g�n���^�[ : �ǂ�ǂ�A�x�߂�ꏊ�͂Ȃ����ȁc�c�H",1;
	end;
}

jor_sanct.gat,29,127,3	script	���͉�����u#20ms1	10540,{/* 3493 */}
jor_sanct.gat,28,125,5	script	���͉�����u#20ms2	10538,{/* 3494 */}
jor_sanct.gat,27,123,7	script	���͉�����u#20ms3	10540,{/* 3495 */}
jor_sanct.gat,201,115,3	script	���͉�����u#20ms7	10540,{/* 3496 */}

icas_in.gat,226,257,0	script	#hw_ep20_pn01	139,2,2,{/* 3498 */
	if(EP20_1QUE == 48 || EP20_1QUE == 49) {
		cloakoffnpc "���n�[��#e20pn01";
		cloakoffnpc "���I��#e20pn01";
		cloakoffnpc "�I�[�����[#e20pn01";
		cloakoffnpc "�}����#e20pn01";
		cloakoffnpc "�z����#e20pn01";
		cloakoffnpc "�~���A��#e20pn01";
		cloakoffnpc "���C�W�[#e20pn01";
		cloakoffnpc "���H�[�N�����f#e20pn01";
		cloakoffnpc "���F���O���f#e20pn01";
	}
	end;
}
icas_in.gat,226,255,3	script(CLOAKED)	���n�[��#e20pn01	10469,{/* 3499 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���A"+strcharinfo(0)+"�l�I";
		next;
		menu "�ǂ������̂ł����H",-;
		cutin "ep19_lehar06.png", 2;
		mes "[���n�[��]";
		mes "���ꂪ�A���肸�炢�󋵂Łc�c";
		mes "�^�C�~���O�����������Ă����ł��B";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�`���҂���ƃ��n�[�������";
		mes "�����l�͒N�����Ȃ��Ƃ������Ƃł����H";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "���̓��K���̕ߗ��ƋA���ė�������c�c";
		mes "�������ł��N�����̂��낤���H";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�{�����𑗂�ׂ����Ⴀ��܂��񂩁H";
		mes "�G�w�̉��܂ŐN�����Ă����悤�ł�����";
		mes "�S�z�ł��B";
		next;
		cutin "ep19_voglinde01.png", 2;
		mes "[���H�[�N�����f]";
		mes "���n�[���̎q���̍����v���o����B";
		mes "�̂͂悭���������đ�l������";
		mes "�S�z���������̂��B";
		mes "���������A���̎��A���̎q�́c�c�B";
		next;
		cutin "ep19_lehar06.png", 2;
		mes "[���n�[��]";
		mes "�E�M���@�[�[�[�I";
		mes "�X�g�b�v�I�@����ȏ�̓_���b�I";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���n�[���Ɩ`���҂���Ȃ����I";
		mes "�����Ȃ�A�������Ȃ��Ȃ�������";
		mes "�������[�S�z���Ă��񂾂��I";
		mes "�ق�A���̐S�͗c���A�[�E�B���̎Y��";
		mes "�݂����ɑ@�ׂ����炳�B";
		unittalk getcharid(3),strcharinfo(0)+" : �c�c�D��ɂ���������ł܂���ł������H",1;
		next;
		cutin "ep19_voglinde01.png", 2;
		mes "[���H�[�N�����f]";
		mes "�F�A��l�̂��Ƃ�S�z���Ă����̂�B";
		mes "�܂��A�����ɋA���ė����񂾂���";
		mes "�ǂ��Ƃ��悤����Ȃ����B";
		next;
		cutin "ep19_leon03.png", 2;
		mes "[���I��]";
		mes "�����Ȃ悤�ŗǂ������ł��B";
		mes "���炭�g���u���Ɋ������܂ꂽ�̂���";
		mes "�������܂���";
		mes "���������A�����������̂ł����H";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���̓��X�K���h�Ƒ������āc�c�B";
		unittalk getnpcid(0,"�~���A��#e20pn01"),"�~���A�� : ������!?",1;
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�����Ȃ�G�̐e�ʂƑ�������Ȃ�āc�c";
		mes "�܂����A�������Ƃ����ĂȂ����ˁH";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���A�������Ƃ��c�c";
		mes "�U�����󂯂���ł�����";
		mes "�����L�������";
		mes "���������~���Ă���܂����B";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�c�c�L�H";
		mes "���A���������āA�O�߂܂�������";
		mes "�����Ă�������Ƃ����c�c�B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "���̔L�ɏ����Ă��������ł��I";
		mes "����ς�A���ʂ̔L����Ȃ��ł���I";
		mes "���̂����`�`�`��Ȃɒ���";
		mes "�s�v�c�ȔL�Ȃ�ł��I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����Ȃɒ����L������Ƃ�";
		mes "�v���܂��񂪁c�c";
		mes "�����̌��ԈႢ�ł́H";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�k�̑�n�ɂ͖������Z�ނƌ���";
		mes "�������͕��������Ƃ���܂����c�c";
		mes "�z��������́A�S������͂���܂����H";
		next;
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�C�X�K���h�̒n�ɂ�����";
		mes "�w�������Ĕ����т����̂�";
		mes "�������A�[�E�B�������ł��I";
		mes "�f�����܂��I";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�Ñ�A�C�X�E�B���h�́H";
		next;
		cutin "ep19_iwin07.png", 2;
		mes "[�z����]";
		mes "����ȋ��\�Ŗ��m�Ȓ�������";
		mes "�m�I�ŃN�[���ȃA�[�E�B��������";
		mes "�ꏏ�ɂ��Ȃ��ł������������I";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���܂��Ȃ��ŁB";
		mes "����ɂ��Ă��s�v�c�ȗ͂�";
		mes "�`���҂����������������L�c�c�ˁB";
		mes "�ӂށc�c�B";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���̔L�c�c";
		mes "^FF0000���������K���h^000000��������Ȃ��B";
		unittalk "���n�[�� : ���������K���h�H�H�H!?!?",1;
		next;
		menu "���������K���h�ł����H",-;
		mes "[�I�[�����[]";
		mes "�A�[�E�B����������";
		mes "�L�̂悤�Ȑ������̉\��";
		mes "���̑��Ղɂ��Ă̘b�𕷂��Ă��Ȃ��H";
		mes "�ȑO���炻�̔L�����������K���h�ł�";
		mes "�Ȃ����Ɛ������Ă����̂�B";
		next;
		mes "[�I�[�����[]";
		mes "���������K���h�͗͂�~���邽�߂�";
		mes "�����Ă����͂��B";
		mes "����ŁA���܂܂Ŋ��m�ł��Ȃ�������B";
		next;
		mes "[�I�[�����[]";
		mes "�ł��A�ŋ߂ɂȂ��ė͂����߂�������";
		mes "���B�̑O�Ɏp��������悤��";
		mes "�Ȃ����̂����c�c";
		mes "�����܂ŉ\���ɉ߂��Ȃ����ǂˁB";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�����I�[�����[�Ɠ����l���ł��B";
		mes "����l�ɂ́A�����x��ł��������Ă���";
		mes "���̔����L��";
		mes "�T���ɍs�������̂ł����c�c�B";
		next;
		if(select("�������o�����܂��傤","�����x�݂����ł�") == 2) {
			mes "[���I��]";
			mes "�킩��܂����B";
			mes "��������x��ł���o�����܂��傤�B";
			close2;
			cutin "ep19_leon01.png", 255;
			end;
		}
		mes "[���I��]";
		mes "�킩��܂����B";
		mes "�X�̏�̊O��";
		mes "�L�\��[�����A�[�E�B��]�����܂��B";
		mes "�ނɎ�`���Ă��炢�܂��傤�B";
		next;
		cutin "ep19_leon01.png", 255;
		chgquest 17709,23100;
		set EP20_1QUE,49;
		mes "�]�����A�[�E�B���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�����A�[�E�B���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 146, 207;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "��������x�܂�܂������H";
		mes "���I���l�����҂��ł���B";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "�]�����A�[�E�B���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����A�[�E�B���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 146, 207;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 48 || EP20_1QUE == 49)
		showevent 0, 1, "���n�[��#e20pn01";
	end;
}
icas_in.gat,233,252,5	script(CLOAKED)	���I��#e20pn01	10464,{/* 3500 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_leon05.png", 2;
		mes "[���I��]";
		mes "�{������g�D����ׂ����c�c�B";
		close2;
		cutin "ep19_leon05.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�����͂�낵���ł����H";
		mes "�X�̏�̊O��";
		mes "�L�\��[�����A�[�E�B��]�����܂��B";
		mes "�ނɎ�`���Ă��炢�܂��傤�B";
		close2;
		cutin "ep19_leon05.png", 255;
		end;
	}
}
icas_in.gat,237,252,5	script(CLOAKED)	�I�[�����[#e20pn01	10465,{/* 3501 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "���̓�l�c�c�S�z���ȁB";
		close2;
		cutin "ep19_aurelie03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�����ŗǂ������B";
		mes "�߂��ė��Ă����Ő\����Ȃ�����";
		mes "�������ł����烌�I���ɘb�������āB";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
}
icas_in.gat,230,253,7	script(CLOAKED)	�z����#e20pn01	10461,{/* 3502 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�ق�������B";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_iwin06.png", 2;
		mes "[�z����]";
		mes "�ق�������B";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
}
icas_in.gat,231,250,7	script(CLOAKED)	�}����#e20pn01	10376,{/* 3503 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�����������̂ł��傤���c�c";
		mes "�S�z�ł��B";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����l���������ŗǂ������ł��B";
		mes "�~���A�����{���ɐS�z���Ă���ł���I";
		close2;
		cutin "ep18_maram_03.png", 255;
		end;
	}
}
icas_in.gat,234,249,7	script(CLOAKED)	�~���A��#e20pn01	10377,{/* 3504 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�����ƐT�d�ɍs������ׂ��������c�c�I";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�{���ɗǂ������ł��B";
		mes "�����`���҂���̐g�ɉ�����������";
		mes "�{�N�͂ǂ����悤���Ɓc�c�B";
		close2;
		cutin "ep18_miriam_03.png", 255;
		end;
	}
}
icas_in.gat,238,248,3	script(CLOAKED)	���C�W�[#e20pn01	10454,{/* 3505 (cloaking)*/
	if(EP20_1QUE == 48) {
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�`���҂����n�[����";
		mes "�ڂ𗣂��Ƃ����ǂ�����";
		mes "�������Ⴄ����Ȃ��I";
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
	if(EP20_1QUE == 49) {
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�߂��Ⴍ�����l�̂���";
		mes "�S�z�����񂾂��H";
		mes "���������čA��ʂ�Ȃ����炢�ɁI";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�B";
		next;
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "�R���Ǝv���Ă�ȁH";
		mes "�`���҂����Ȃ�������";
		mes "�͎d����񍐏��̍쐬��";
		mes "�������Ȃ��Ƃ����Ȃ��Ȃ�񂾂��B";
		mes "�����S�z�ɂȂ�Ƃ������̂��I";
		next;
		unittalk getcharid(3),strcharinfo(0)+" : ���ǁA�����̐S�z�ł���ˁH",1;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�n�n�b�A�o�����H";
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
}
icas_in.gat,239,252,3	script(CLOAKED)	���H�[�N�����f#e20pn01	10467,{/* 3506 (cloaking)*/}
icas_in.gat,237,254,5	script(CLOAKED)	���F���O���f#e20pn01	10468,{/* 3507 (cloaking)*/}

icecastle.gat,146,206,0	script	#hw_ep20_pn02	139,3,3,{/* 3507 */
	if(EP20_1QUE >= 49 && EP20_1QUE <= 51) {
		cloakoffnpc "���n�[��#e20pn02";
		cloakoffnpc "���I��#e20pn02";
		cloakoffnpc "�I�[�����[#e20pn02";
		cloakoffnpc "�}����#e20pn02";
		cloakoffnpc "�~���A��#e20pn02";
		cloakoffnpc "���C�W�[#e20pn02";
	}
	end;
}
icecastle.gat,141,212,3	script	�R����#ep20_DQ_3	10461,{/* 3508 */
	if(EP20_1QUE == 49) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�R�����A���C�ɂ��Ă�H";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�������ł��B";
		mes "�I�[�����[�l�ƃ��I���l��";
		mes "�C���g���Ă������������A��";
		mes "����ȏ�Ȃ����炢�Ɍ��C�ł��I";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "����͂悩�����B";
		mes "����肢�𕷂��Ă���Ȃ������H";
		mes "�ƂĂ��厖�Ȃ��ƂłˁB";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "����l�̂��肢�Ȃ�";
		mes "���Ȃ��킯�ɂ͂����܂���B";
		mes "��������ė��Ăƌ����Ă�";
		mes "���܂��傤�I";
		unittalk getnpcid(0,"���C�W�[#e20pn02"),"���C�W�[ : ����ᗊ�������ȁI",1;
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���������u���X�n�сv�܂�";
		mes "�A��čs���ė~�����񂾁B";
		mes "�T���Ȃ��Ƃ����Ȃ����̂������ĂˁB";
		mes "�����悻�̏ꏊ�͖`���җl��";
		mes "�����Ă����B";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���X�n�тł����H";
		mes "�C���j���̂͒��ёO�ł���";
		mes "���X�n�тȂ�b���Ⴂ�܂��B";
		mes "�X�͂̌��Ђ��������񂠂��Ċ댯����";
		mes "�������Ⴍ�āc�c�B";
		next;
		mes "[�R����]";
		mes "���������m�Ȉʒu���킩��Ȃ��ȏ�";
		mes "���͂����邮����Ȃ���";
		mes "�o�H��T�����ƂɂȂ�ł��傤�ˁB";
		mes "�{���Ɍ������킢�ɂȂ肻���ł��c�c�B";
		mes "�@";
		mes "�]���������Ȃ���A�H���𝆂�ł���]";
		unittalk getnpcid(0,"���C�W�[#e20pn02"),"���C�W�[ : �����l�͎���̂ɉj���̓_���Ȃ́H",1;
		unittalk getnpcid(0,"�R����#ep20_DQ_3"),"�R���� : ���̘b�͂��Ƃ��b�ł���I",1;
		next;
		menu "�����~�������̂͂���H",-;
		mes "[�R����]";
		mes "�c�c���₾�Ȃ�";
		mes "����Ȃ����܂������Ƃ͌����܂���B";
		mes "�~�����̂ł͂Ȃ��A�K�v�ȕ��Ȃ�ł��I";
		mes "�̉��ێ��̂��߂ɂ�";
		mes "���J�����[�̐H���͕K�{�ł��B";
		next;
		mes "[�R����]";
		mes "�ʏ�̐����Ȃ�";
		mes "���i�̐H�������ő��v�ł���";
		mes "�댯�ȗ��X�n�тɍs���̂Ȃ�";
		mes "�������������肵�Ȃ��ƁI";
		next;
		mes "[�R����]";
		mes "�����͓��R�K�v�Ƃ���";
		mes "�I���c�Ƃ��ē��Ă������V�̔�܂�";
		mes "�H�ׂȂ���Ȃ�܂���B";
		next;
		cutin "ep19_iwin05.png", 2;
		mes "[�R����]";
		mes "�łȂ��ƁA�r���ŕ���������";
		mes "�S�{�S�{�ƒ���ł��������c�c";
		mes "�����̓A�[�E�B��������";
		mes "����ł����v�ł��傤��";
		mes "�l�Ԃ̑̂��ƁA�ǂ��Ȃ邩�c�c�B";
		unittalk getnpcid(0,"���C�W�[#e20pn02"),"���C�W�[ : �����A�������Ă��邼�H",1;
		unittalk getnpcid(0,"�R����#ep20_DQ_3"),"�R���� : �S�z���Ă����ł����āI",1;
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "��肭���p����Ă���悤�ȋC���c�c�B";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�Ƃ͂����A���ɕ��@�������̂Łc�c";
		mes "�����͎����p�ӂ��܂�����";
		mes "�`���җl�́u���Ă������V�̔�v��";
		mes "�W�߂ė��Ă��炦�܂����H";
		next;
		menu "���傤���Ȃ��ł���",-;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�������Ȃ�����I";
		mes "�u�A�C�X�t�i���V�v��3�C�|����";
		mes "�u���Ă������V�̔�v��3��";
		mes "�����Ă��Ă��������B";
		next;
		mes "[�R����]";
		mes "�A�C�X�t�i���V��";
		mes "[���ĕt�����؂̋u]�ɂ���͂��ł��B";
		mes "�����͉j�����߂�";
		mes "�̗͂��������Ă����܂��ˁI";
		unittalk getnpcid(0,"���C�W�[#e20pn02"),"���C�W�[ : �v����ɃS���S�����Ă���Ă��Ƃ��H",1;
		unittalk getnpcid(0,"���n�[��#e20pn02"),"���n�[�� : ���[���I�@�R�����̋@���𑹂˂���_���ł���I",1;
		next;
		cutin "ep19_lehar01.png", 255;
		chgquest 23100,23101;
		set EP20_1QUE,50;
		mes "�]���ĕt�����؂̋u��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���ĕt�����؂̋u��";
		mes "�@���������]";
		close2;
		warp "jor_back1.gat", 380, 229;
		end;
	}
	if(EP20_1QUE == 50) {
		if(checkquest(23101) && (!checkquest(23101)&0x4 || countitem(1000832) < 3)) {
			cutin "ep19_iwin03.png", 1;
			mes "[�R����]";
			mes "�A�C�X�t�i���V��";
			mes "[���ĕt�����؂̋u]�ɂ���͂��ł��B";
			mes "�u�A�C�X�t�i���V�v��3�C�|����";
			mes "�u���Ă������V�̔�v��3��";
			mes "�����Ă��Ă��������B";
			next;
			cutin "ep19_iwin03.png", 255;
			mes "�]���ĕt�����؂̋u��";
			mes "�@�������܂����H�]";
			next;
			if(select("������","��߂�") == 2) {
				mes "�]���̏�ɂƂǂ܂����]";
				close;
			}
			mes "�]���ĕt�����؂̋u��";
			mes "�@���������]";
			close2;
			warp "jor_back1.gat", 380, 229;
			end;
		}
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���Ă������V�̔�I";
		mes "��A��A�O�c�m���ɁI";
		mes "���ꂳ���H�ׂ��";
		mes "�����ԉj���ł���肠��܂���B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�ł͏o���̏������c�c�B";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���̑O�ɁI";
		mes "�H�ɓh��ی�܂��v��܂��I";
		mes "��������̐l���^�Ԃ̂�";
		mes "�ő���̕��͂��m�ۂ��Ȃ��ƁI";
		unittalk getnpcid(0,"���C�W�[#e20pn02"),"���C�W�[ : �ق���c�c",1;
		next;
		mes "[�R����]";
		mes "�������݂Ȃ���𑁂��A��čs������";
		mes "�C�����͎R�X�ł������S���ł��I";
		mes "�������r���ŉH����������G���";
		mes "����ł��܂�����c�c�B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�c�c�ی�܂������ė���Ηǂ��ł����H";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���₾�Ȃ��A�����܂ŋ�Ȃ�";
		mes "���肢���邵���Ȃ��ł���ˁI";
		mes "�ł́A���郏�J���̗t�̂�";
		mes "�����ė��Ă��������B";
		next;
		mes "[�R����]";
		mes "���J���̗t�̂��璊�o�����I�C����";
		mes "�f���炵���V�R�ی�܂ɂȂ�܂��I";
		mes "�����ɂ��炳���A�[�E�B���̉H�ɂ�";
		mes "�������厖�Ȃ��̂ł��B";
		next;
		mes "[�R����]";
		mes "�u���郏�J���v��3�̏W����";
		mes "�u���郏�J���̗t�́v��3��";
		mes "�����Ă��Ă��������B";
		mes "[���ĕt�����؂̋u]�ɍs����";
		mes "������Ă���͂��ł���B";
		next;
		cutin "ep19_iwin05.png", 2;
		mes "[�R����]";
		mes "���������A�����͂���c�c";
		mes "���Ƃ��R�����[���Ă����܂�����";
		mes "�����s���Ă�����Ⴂ�I";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����̎��b�����łȂ�";
		mes "�ʂ̔�������݂��������H";
		next;
		cutin "ep19_leizi01.png", 255;
		chgquest 23101,23102;
		set EP20_1QUE,51;
		delitem 1000832,3;
		mes "�]���ĕt�����؂̋u��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���ĕt�����؂̋u��";
		mes "�@���������]";
		close2;
		warp "jor_back1.gat", 380, 229;
		end;
	}
	if(EP20_1QUE == 51) {
		if(checkquest(23102) && (!checkquest(23102)&0x4 || countitem(1000831) < 3)) {
			cutin "ep19_iwin03.png", 2;
			mes "[�R����]";
			mes "�u���郏�J���v��3�̏W����";
			mes "�u���郏�J���̗t�́v��3��";
			mes "�����Ă��Ă��������B";
			mes "[���ĕt�����؂̋u]�ɍs����";
			mes "������Ă���͂��ł���B";
			next;
			cutin "ep19_iwin06.png", 255;
			mes "�]���ĕt�����؂̋u��";
			mes "�@�������܂����H�]";
			next;
			if(select("������","��߂�") == 2) {
				mes "�]���̏�ɂƂǂ܂����]";
				close;
			}
			mes "�]���ĕt�����؂̋u��";
			mes "�@���������]";
			close2;
			warp "jor_back1.gat", 380, 229;
			end;
		}
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���郏�J���̗t�͎̂����Ă��܂����H";
		mes "�ǂ�ǂ�m�F���Ă݂܂��傤�B";
		mes "�c�c�����ł��ˁA�s�b�^���ł��I";
		mes "�h�D�t�t�t�t�I";
		next;
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "���ӂ��ӂȌ����ڂ��x����Ă��܂����B";
		mes "�_�炩���H�т̒���";
		mes "����ȋ��낵������B���Ă���Ƃ́B";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�}�������A���肾��ˁB";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�h�D�t�t�t�c�c";
		mes "�ł͎��́c�c�B";
		next;
		cutin "ep19_iwin06.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����o���ł��܂���c�c�ˁH";
		unittalk "�R���� : �������I",1;
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���A�������ł��Ƃ��I";
		mes "���̕�������܂��Ă��������I";
		mes "���Ƃ͖ړI�n�̏ꏊ��";
		mes "�����Ă��炤�����I";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�ŏ����炱������Ηǂ������ȁB";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "�]�����L�ɏo������ꏊ�̌i�F��";
		mes "�@���̗͂l�q���R�����ɓ`�����]";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���ށI�@���ށI�@";
		mes "���ꂾ��������Ώ\���ł��I";
		mes "�����̓V�˓I�ȓ��]��";
		mes "���؂��Ȑ����\�͂��g����";
		mes "�����Ƃ����Ԃɒ����܂���I";
		unittalk getnpcid(0,"���C�W�[#e20pn02"),"���C�W�[ : ���x�͐M���Ă����̂��H",1;
		next;
		mes "[�R����]";
		mes "�������󂭑O�ɏo�����܂��傤�I";
		mes "�����A��������͂܂��Ă��������I";
		next;
		cutin "ep19_iwin06.png", 255;
		chgquest 23102,23103;
		set EP20_1QUE,52;
		delitem 1000831,3;
		mes "�]���X�n�т�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���X�n�т�";
		mes "�@���������]";
		close2;
		warp "jor_safty1.gat", 198, 152;
		end;
	}
	if(EP20_1QUE == 52) {
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���X�n�т܂ŘA��čs���܂�����";
		mes "�H���ɂ�������͂܂��Ă��������I";
		next;
		cutin "ep19_iwin06.png", 255;
		mes "�]���X�n�т�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���X�n�т�";
		mes "�@���������]";
		close2;
		warp "jor_safty1.gat", 198, 152;
		end;
	}
	if(EP20_1QUE >= 53) {
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���I���l���痊�܂��";
		mes "�������@���@�ʁ@�ɁI";
		mes "���X�n�т܂ōs��������";
		mes "����`�������邱�ƂɂȂ�܂����B";
		if(EP20_1QUE == 100)
			set '@str$,"���K����|��";
		next;
		switch(select("�s��","�s���Ȃ�",'@str$)) {
		case 1:
			mes "[�R����]";
			mes "�H���ɂ�������͂܂��Ă��������I";
			mes "��������ǂ��Ȃ邩";
			mes "�����ɂ��킩��܂��񂩂�ˁI";
			close2;
			cutin "ep19_iwin06.png", 255;
			warp "jor_twice.gat", 235, 107;
			end;
		case 2:
			cutin "ep19_iwin03.png", 2;
			mes "[�R����]";
			mes "�������ɂł�����";
			mes "�����ׂ̈ɂ���������ė��Ă���Ă�";
			mes "������ł���`�B";
			unittalk getcharid(3),strcharinfo(0)+" : �ɂ���Ȃ��I",1;
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		case 3:
			break;
		}
		mes "[�R����]";
		mes "�`���җl";
		mes "���K��������Ă��Ă��������ł����H";
		mes "���肪�Ƃ��I�@���肪�Ƃ��I";
		mes "�{���͕|��������ł��`�I";
		cutin "ep19_iwin03.png", 2;
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���X�n��)") == 2) {
			mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
			next;
			mes "[�R����]";
			cutin "ep19_iwin03.png", 2;
			mes "�����������n�Ɍ������܂����H";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_twice.gat", 235, 107;
			end;
		}
		setarray '@questname$,"���K���̍���";
		setarray '@questid,23110;
		setarray '@coolid,23111;
		setarray '@gainlist,1001217,10;
		setarray '@explist,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// ���K���̍���
			if(checkquest(23111)) {
				if(checkquest(23111)&2 == 0) {
					mes "[�R����]";
					cutin "ep19_iwin03.png", 2;
					mes "�����͏\���ł�����A";
					mes "�����܂����Ă��������I";
					mes "���K�������������ǂ��āA";
					mes "��x�U�������ƉB��Ă��܂��̂�";
					mes "�F�X�ʓ|�ɂȂ�܂��B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���K���̍���^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			mes "[�R����]";
			cutin "ep19_iwin03.png", 2;
			mes "^e5555e���������K���h���c�p�t^000000��";
			mes "10�̓������Ă��Ă��������B";
			next;
			if(checkquest(23110)) {
				if(checkquest(23110)&4 == 0) {
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���K���̍���^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 23110;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���K���̍���^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���K���̍���^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>���������K���h���c�p�t<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_WARLOCK</INFO></URL>�@10��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���K���̍���^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 23110;
				setquest 23111;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[�R����]";
				cutin "ep19_iwin03.png", 2;
				mes "���I�߂��ė��܂����ˁB";
				mes "���K�����������\�����Ă܂��ˁI";
				next;
				mes "[�R����]";
				cutin "ep19_iwin03.png", 2;
				mes "�͂��H";
				mes "���Ă����Ȃ��̂�";
				mes "�Ȃ�ŉ���܂������āH";
				mes "��C�ł���I";
				next;
				mes "[�R����]";
				cutin "ep19_iwin03.png", 2;
				mes "�`���җl���A����������Ɗ撣������A";
				mes "���̍��������Ƃ��悤�ɂȂ�܂���I";
				mes "���������Ӗ��ł��A";
				mes "���������Ă͂ǂ��ł����H";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���K���̍���^000000�v";
			mes "<���e>";
			mes "�ΏہF<URL>���������K���h���c�p�t<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_WARLOCK</INFO></URL>�@10��";
			mes "�̓������󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�R����]";
				cutin "ep19_iwin03.png", 2;
				mes "���f�c�c�}�W�ł����H";
				mes "��x�͏����Ă������Č������̂�";
				mes "�Ђǂ��l�c�c�B";
				mes "";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 23110;
			if(checkquest(23111)) delquest 23111;
			mes "[�R����]";
			cutin "ep19_iwin03.png", 2;
			mes "�q���`�I�M���Ă܂�����I";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���K���̍���^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
		close;
	}
	end;
OnQuestInfo:
	if(checkquest(23101) && (!checkquest(23101)&0x4 || countitem(1000832) < 3))
		showevent 0, 2, "�R����#ep20_DQ_3";
	else if(checkquest(23101) && checkquest(23101)&0x4 && countitem(1000832) >= 3)
		showevent 0, 3, "�R����#ep20_DQ_3";
	if(checkquest(23102) && (!checkquest(23102)&0x4 || countitem(1000831) < 3))
		showevent 0, 2, "�R����#ep20_DQ_3";
	else if(checkquest(23102) && checkquest(23102)&0x4 && countitem(1000831) >= 3)
		showevent 0, 3, "�R����#ep20_DQ_3";
	if(EP20_1QUE >= 49 && EP20_1QUE <= 52)
		showevent 0, 1, "�R����#ep20_DQ_3";
	if(EP20_1QUE >= 53 && EP20_1QUE <= 99)
		showevent 6, 3, "�R����#ep20_DQ_3";
	if(EP20_1QUE == 100) {
		if(!checkquest(23110) && (!checkquest(23111) || checkquest(23111)&0x2) || checkquest(23110) && checkquest(23110)&0x4)
			showevent 0, 3, "�R����#ep20_DQ_3";
		else if(checkquest(23110) && !checkquest(23110)&0x4 == 0)
			showevent 0, 2, "�R����#ep20_DQ_3";
		else
			showevent 6, 3, "�R����#ep20_DQ_3";
	}
	end;
OnInit:
	setnpctitle "[�����A�[�E�B��]";
	end;
}
icecastle.gat,148,210,5	script(CLOAKED)	���I��#e20pn02	10464,{/* 3509 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���X�n�т܂ŘA��čs���ė~������";
		mes "������̐����A�[�E�B����";
		mes "���肢�������ł��B";
		mes "���͂����͊m���ł�����ˁB";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�R�����������܂ő����̐l��";
		mes "�^�Ԃ̂͏��߂Ăł�����";
		mes "���͂��Ă����Ȃ��ƁB";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_leon03.png", 2;
		mes "�]���I���͍�����������Ă���]";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
icecastle.gat,145,212,5	script(CLOAKED)	�I�[�����[#e20pn02	10465,{/* 3510 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�����ŉ����ł��Ȃ����Ƃ�";
		mes "���l�̗͂��؂�邱�Ƃŉ����ł���B";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���̒��x�Ȃ�";
		mes "����قǂ̎�Ԃ���Ȃ���ˁB";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "�c�c�c�c�B";
		next;
		mes "[�I�[�����[]";
		mes "�M�u�A���h�e�C�N�A�Ƃ�����ˁB";
		close2;
		cutin "ep19_aurelie01.png", 255;
		end;
	}
	end;
}
icecastle.gat,143,210,5	script(CLOAKED)	���n�[��#e20pn02	10469,{/* 3511 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "�킟�I";
		mes "�����A�[�E�B���̔w���ɏ��̂�";
		mes "���߂Ăł��I";
		next;
		mes "[���n�[��]";
		mes "�����Ɗy�����ł���I";
		mes "�y���݂��Ȃ��I";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�ӂ����`�`�`�B";
		mes "�A��ꂽ�c�c";
		mes "����ꂽ�ʂ̂�����";
		mes "�����Ă��܂�����`�`�B";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�c�c�͂�!?";
		mes "�����������x���ꂽ�̂ł�??";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	end;
}
icecastle.gat,144,207,5	script(CLOAKED)	�}����#e20pn02	10376,{/* 3512 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�A�[�E�B���ɏ���ĊC��n��I";
		mes "�Ȃ񂾂��s�v�c�ł���ˁB";
		mes "���w���ł͍l�����Ȃ�";
		mes "�ړ����@�ł��B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�A�[�E�B���B��";
		mes "��������H����H�ׂ�݂����ł��B";
		mes "�c�c�{���ɑS���H�ׂ�̂ł��傤���H";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�Ȃ��Ȃ��o���ł��Ȃ��ł��ˁc�c�B";
		close2;
		cutin "ep18_maram_01.png", 255;
		end;
	}
	end;
}
icecastle.gat,141,206,5	script(CLOAKED)	�~���A��#e20pn02	10377,{/* 3513 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "���I���l�ƃI�[�����[�l������ɂ���";
		mes "�A�[�E�B���Ȃ̂�����";
		mes "���͕͂ۏ؂���Ă���񂾂낤�ˁB";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�����ȑΉ����K�v�c�c�ƁB";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�c�c���̂��������C���ł��B";
		mes "�����v�����̂́A�{�N�����H";
		close2;
		cutin "ep18_miriam_01.png", 255;
		end;
	}
	end;
}
icecastle.gat,143,203,7	script(CLOAKED)	���C�W�[#e20pn02	10454,{/* 3514 (cloaking)*/
	if(EP20_1QUE == 49) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���̏W�c���ǂ������";
		mes "���X�n�тɉ^�Ԃ��肾�낤�H";
		mes "���H";
		mes "���̃A�[�E�B���ɉ^��ł��炤�����āH";
		next;
		mes "[���C�W�[]";
		mes "�l�g���c�c����";
		mes "���g�������\�r����ˁH";
		mes "�����̐l�������āB";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 50) {
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�v��������J���ɂ���ĂȂ����H";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 51) {
		cutin "ep19_leizi03.png", 2;
		mes "[���C�W�[]";
		mes "����ς�J���ɂ���Ă邶��Ȃ����I";
		mes "���������荇����";
		mes "��������킩�点�Ă����Ȃ���";
		mes "���ƂŌ�����邺�H";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,198,152,0	script	#hw_ep20_pn0301	139,2,2,{/* 3516 */
	if(EP20_1QUE == 52) {
		cloakoffnpc "�R����#e20pn0301";
		cloakoffnpc "���n�[��#e20pn0301";
		cloakoffnpc "���I��#e20pn0301";
		cloakoffnpc "�I�[�����[#e20pn0301";
		cloakoffnpc "�}����#e20pn0301";
		cloakoffnpc "�~���A��#e20pn0301";
		cloakoffnpc "���C�W�[#e20pn0301";
		end;
	}
}
jor_safty1.gat,195,155,3	script(CLOAKED)	�R����#e20pn0301	10461,{/* 3517 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�n�@�c�c�n�@�c�c";
		mes "�W���m�[���ւ��s�D��";
		mes "�t�@�[�X�g�N���X�ɂ������Ȃ�";
		mes "���ɂƂ��Ă͑ς�����S�n�������B";
		mes "�悭�ς����ȁA���c�c�������c�c�B";
		next;
		cutin "Ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�������܂����I";
		mes "�����A�ɁA����c�c�������I";
		mes "1�l����Ȃ������I";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�N���C�̒��ɗ��Ƃ��Ă�����!?";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�����𐔂��Y��Ă܂����I";
		mes "�S�������ł�����";
		mes "�S�z���Ȃ��ł��������B";
		next;
		cutin "ep19_leon04.png", 2;
		mes "[���I��]";
		mes "����Ȃ�ǂ��������ǁc�c";
		mes "�����c�c�ӂ�ӂ炷��B";
		next;
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "���v�H";
		mes "���͏����ڂ����������";
		mes "�����܂ł���Ȃ���B";
		mes "��͂�Ⴂ�̂����炩�ȁc�c�B";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[���I��]";
		mes "����́A���炭�֌W�Ȃ���c�c�B";
		next;
		cutin "ep19_leon01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "����͂Ƃ������c�c�����͂ǂ����낤�H";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�n�n�A���X�n�тł���I";
		mes "�`���җl�����Ă��ꏊ�ł��I";
		mes "���������Ė`���җl��";
		mes "�D��������Ă܂��H";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���`��c�c";
		mes "�����L�ɏo������ꏊ�Ƃ�";
		mes "������ƈႢ�܂��ˁB";
		mes "����Ȋ�������Ȃ��������ǁc�c�B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "������������Ȃɍ�悵�Ă�����";
		mes "�ꏊ���ԈႦ��Ȃ�āI";
		mes "�ǂ�����ĐӔC�������肾�H";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "������I";
		mes "���I���l�A�����Ă������`���I";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�n�n�c�c����Ɏ����ӂ�܂��B";
		mes "�ł��c�c�����ł��ˁB";
		mes "�R�����ɂ͂��ꂩ�疳����";
		mes "���X�n�т��s��������̂�";
		mes "��`���Ă��炤���Ƃɂ��܂��傤�B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "��������҂ł��É߂�����Ȃ��H";
		mes "�܂��A�����Ƃ����̂��C�ɓ������B";
		mes "����Ŏ�ł��ɂ��悤�B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���āA�`���җl�B";
		mes "�����L�ɉ�����ʒu�͉����Ă��܂����H";
		mes "��̂̈ʒu�Ō��\�Ȃ̂ł����B";
		next;
		menu "�ǂ��������悤�Ȍi�F�Łc�c",-;
		mes "[���I��]";
		mes "�ł�����A�F�Ŏ蕪������";
		mes "�{�����܂��傤���B";
		mes "�����~�܂��Ă��Ă��d������܂���B";
		mes "�����A����炵���ꏊ����������";
		mes "�����Ă��������B";
		next;
		cutin "ep19_leon01.png", 255;
		cutin "ep19_iwin06.png", 255;
		chgquest 23103,131257;
		set EP20_1QUE,53;
		mes "�]���X�n�т�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���X�n�т�";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 235, 107;
		end;
	}
	if(EP20_1QUE == 53) {
		cutin "ep19_iwin03.png", 2;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���āA�`���җl�B";
		mes "�����L�ɉ�����ʒu�͉����Ă��܂����H";
		mes "��̂̈ʒu�Ō��\�Ȃ̂ł����B";
		next;
		menu "�ǂ��������悤�Ȍi�F�Łc�c",-;
		mes "[���I��]";
		mes "�ł�����A�F�Ŏ蕪������";
		mes "�{�����܂��傤���B";
		mes "�����~�܂��Ă��Ă��d������܂���B";
		mes "�����A����炵���ꏊ����������";
		mes "�����Ă��������B";
		next;
		cutin "ep19_leon01.png", 255;
		cutin "ep19_iwin06.png", 255;
		mes "�]���X�n�т�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���X�n�т�";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 235, 107;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 52 || EP20_1QUE == 53)
		showevent 0, 1, "�R����#e20pn0301";
	end;
}
jor_safty1.gat,192,146,5	script(CLOAKED)	�~���A��#e20pn0301	10377,{/* 3518 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�`���҂��񂪎w�������ꏊ��";
		mes "�����ł����̂��ȁH";
		mes "�R��������ɕ����Ă݂悤���B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	//53���m�F
	end;
}
jor_safty1.gat,191,153,5	script(CLOAKED)	���I��#e20pn0301	10464,{/* 3519 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_leon05.png", 2;
		mes "[���I��]";
		mes "�����c�c�ӂ�ӂ炷��B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,192,150,5	script(CLOAKED)	�I�[�����[#e20pn0301	10465,{/* 3520 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���ʂȖ��͂͊������Ȃ��ȁc�c�B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,195,148,5	script(CLOAKED)	�}����#e20pn0301	10376,{/* 3522 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�ӂ��c�c�v�����������́c�c";
		mes "�X�S�C���S�n�ł����B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,192,156,5	script(CLOAKED)	���C�W�[#e20pn0301	10454,{/* 3523 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�z����₷��댯�^�]�c�c";
		mes "����A�댯���j�ƌĂԂׂ����ȁH";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_safty1.gat,201,152,3	script(CLOAKED)	���n�[��#e20pn0301	10469,{/* 3521 (cloaking)*/
	if(EP20_1QUE == 52) {
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�܂����A����ȗh���Ȃ�āc�c";
		mes "�����c�c�I";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
}

jor_twice.gat,235,107,0	script	#hw_ep20_pn03	139,14,14,{/* 3524 */
	if(EP20_1QUE == 53) {
		cloakoffnpc "���n�[��#e20pn03";
		cloakoffnpc "���I��#e20pn04";
		cloakoffnpc "�I�[�����[#e20pn03";
		cloakoffnpc "�}����#e20pn03";
		cloakoffnpc "�~���A��#e20pn03";
		cloakoffnpc "���C�W�[#e20pn03";
	}
	end;
}
jor_twice.gat,235,111,3	script	�R����#e20pn03	10461,{/* 3525 */
	if(EP20_1QUE == 53) {
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���̕������́A��ɍs����܂�����B";
		mes "�E���̓��ɉ����Đi��ł݂Ă��������I";
		close2;
		cutin "ep19_iwin06.png", 255;
		chgquest 131257,23104;
		set EP20_1QUE,54;
		end;
	}
	if(EP20_1QUE == 54 || EP20_1QUE == 55) {
		cloakoffnpc "���n�[��#e20pn03";
		cloakoffnpc "���I��#e20pn04";
		cloakoffnpc "�I�[�����[#e20pn03";
		cloakoffnpc "�}����#e20pn03";
		cloakoffnpc "�~���A��#e20pn03";
		cloakoffnpc "���C�W�[#e20pn03";
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���̕������́A��ɍs����܂�����B";
		mes "�E���̓��ɉ����Đi��ł݂Ă��������I";
		mes "����Ƃ��A�X�̏�ɖ߂�܂����H";
		next;
		if(select("�A��Ȃ�","�A��") == 1) {
			cutin "ep19_iwin03.png", 2;
			mes "[�R����]";
			mes "�����������A�ދ����A�ދ��c�c�B";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		}
		mes "[�R����]";
		mes "�H������������͂�ł��������I";
		mes "�C�͐����₽������C��t���āI";
		close2;
		cutin "ep19_iwin06.png", 255;
		warp "icecastle.gat", 141, 208;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�ǂ�������ł����H";
		next;
		switch(select("�Ȃ�ł��Ȃ�","�k���֌�����","�X�̏�֋A��")) {
		case 1:
			cutin "ep19_iwin03.png", 2;
			mes "[�R����]";
			mes "�����������A�ދ����A�ދ��c�c�B";
			close2;
			cutin "ep19_iwin06.png", 255;
			end;
		case 2:
			mes "[�R����]";
			mes "�����ł����H";
			mes "�����Ă�����Ⴂ�I";
			close2;
			cutin "ep19_iwin06.png", 255;
			warp "jor_twice.gat", 53, 323;
			end;
		case 3:
			mes "[�R����]";
			mes "�H������������͂�ł��������I";
			mes "�C�͐����₽������C��t���āI";
			close2;
			cutin "ep19_iwin06.png", 255;
			warp "icecastle.gat", 141, 208;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 53 || EP20_1QUE == 54)
		showevent 0, 1, "�R����#e20pn03";
	if(EP20_1QUE >= 55)
		showevent 6, 3, "�R����#e20pn03";
	end;
}
jor_twice.gat,255,125,5	script(CLOAKED)	�}����#e20pn03	10376,{/* 3526 (cloaking)*/
	cutin "ep18_maram_01.png", 2;
	mes "[�}����]";
	mes "�����Ă���ꏊ���ړ����Ȃ���";
	mes "�k�̕��ɍs���܂��傤�B";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,247,163,5	script	�~���A��#e20pn03	10377,{/* 3527 */
	cutin "ep18_miriam_01.png", 2;
	mes "[�~���A��]";
	mes "�����󂢏ꏊ��";
	mes "�ǂ��ɂ������čs���܂��ˁB";
	mes "���������k�̕��֍s���܂��傤���B";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,222,226,7	script(CLOAKED)	���C�W�[#e20pn03	10454,{/* 3528 (cloaking)*/
	cutin "ep19_leizi02.png", 2;
	mes "[���C�W�[]";
	mes "�����A�����₦��I";
	mes "�䂪���g�Ȃ�̋��W���m�[�𗣂��";
	mes "���͂����ŉ������Ă���񂾂낤�H";
	next;
	cutin "ep19_leizi01.png", 2;
	mes "[���C�W�[]";
	mes "�ȂɁH�@�ǂ��֌������Ηǂ��������āH";
	mes "���̒����͖k���֍s����";
	mes "�����܂�ɑ���Z���ƌ����Ă����I";
	next;
	cutin "ep19_leizi03.png", 2;
	mes "[���C�W�[]";
	mes "���فA���̊�͉��H";
	mes "���������Ď��̘b���^���Ă�H";
	mes "���Ɠ����悤��";
	mes "�₽�����ŌC��G�点�Ηǂ���";
	mes "�v���Ă���킯����Ȃ�����ȁH";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,232,249,5	script(CLOAKED)	���n�[��#e20pn03	10469,{/* 3529 (cloaking)*/
	cutin "ep19_lehar01.png", 2;
	mes "[���n�[��]";
	mes "���̐�ɂ��鋷������";
	mes "�オ���Ă��������I";
	mes "�������n�ʂ������܂��I";
	mes "�������ɐi�݂܂��傤�B";
	next;
	mes "[���n�[��]";
	mes "���ɗ����Ȃ��悤�ɂ��Ȃ��Ɓc�c";
	mes "������s�̏p���K���Ă�����";
	mes "�ǂ������Ȃ��B";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,237,310,5	script(CLOAKED)	�I�[�����[#e20pn03	10465,{/* 3530 (cloaking)*/
	cutin "ep19_aurelie01.png", 2;
	mes "[�I�[�����[]";
	mes "��������B";
	mes "�u�̏�ɓo���Ă݂āB";
	mes "���I�����҂��Ă��B";
	close2;
	cutin "ep19_iwin06.png", 255;
	end;
}
jor_twice.gat,238,330,0	script	#hw_ep20_pn04	139,5,5,{/* 3531 */
	if(EP20_1QUE == 54)
		cloakoffnpc "���I��#e20pn04";
	end;
}
jor_twice.gat,238,330,7	script(CLOAKED)	���I��#e20pn04	10464,{/* 3532 (cloaking)*/
	if(EP20_1QUE == 54) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���A"+strcharinfo(0)+"�l�B";
		next;
		menu "�����L�͌�����܂������H",-;
		mes "[���I��]";
		mes "�����ɂ͂��Ȃ��悤�ł��B";
		mes "����ɏオ���";
		mes "���������邩�Ǝv�����̂ł����B";
		next;
		mes "[���I��]";
		mes "���c�c���͂ł͂���܂���";
		mes "���������K���h�̖��͂������܂��B";
		mes "���X�n�т̐����ł��B";
		mes "������ɍs���Ă݂܂��傤���B";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 23104,23105;
		set EP20_1QUE,55;
		mes "�]������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]������";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 153, 238;
		end;
	}
	if(EP20_1QUE == 55) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���c�c���͂ł͂���܂���";
		mes "���������K���h�̖��͂������܂��B";
		mes "���X�n�т̐����ł��B";
		mes "������ɍs���Ă݂܂��傤���B";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "�]������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]������";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 153, 238;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 54 || EP20_1QUE == 55)
		showevent 0, 1, "���I��#e20pn04";
	end;
}
jor_twice.gat,155,241,0	script	#hw_ep20_pn05	139,5,5,{/* 3533 */
	if(EP20_1QUE == 55) {
		cloakoffnpc "���n�[��#e20pn05";
		cloakoffnpc "���I��#e20pn05";
		cloakoffnpc "�I�[�����[#e20pn05";
		cloakoffnpc "�}����#e20pn05";
		cloakoffnpc "�~���A��#e20pn05";
		cloakoffnpc "���C�W�[#e20pn05";
	}
	if(EP20_1QUE == 56) {
		cloakoffnpc "���n�[��#e20pn05";
		cloakoffnpc "�}����#e20pn05";
		cloakoffnpc "�~���A��#e20pn05";
		cloakoffnpc "���C�W�[#e20pn05";
	}
	if(EP20_1QUE == 58) {
		cloakoffnpc "���n�[��#e20pn05";
		cloakoffnpc "���I��#e20pn05";
		cloakoffnpc "�I�[�����[#e20pn05";
		cloakoffnpc "�}����#e20pn05";
		cloakoffnpc "�~���A��#e20pn05";
		cloakoffnpc "���C�W�[#e20pn05";
	}
	end;
}
jor_twice.gat,153,243,7	script(CLOAKED)	���I��#e20pn05	10464,{/* 3534 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�����Ń��������K���h��";
		mes "���͂������܂����B";
		mes "�`���җl��";
		mes "���̏ꏊ�Ɍ��o���͂���܂����H";
		next;
		cutin "ep19_leon01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�n�b�L���Ƃ͊o���Ă��Ȃ��̂ł���";
		mes "�L�ɏo������̂�";
		mes "���̋߂��������C�����܂��B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�ł�����A�ԈႢ�Ȃ������ł��B";
		mes "���E���ƃ��������K���h�c�c";
		mes "���ƃI�[�����[�Ȃ�";
		mes "�m��Ȃ��͂��̂Ȃ����͂ł��B";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���������K���h���c���������͂�������";
		mes "�����̒n��T������";
		mes "���Ă����̂�������Ȃ��B";
		mes "�ނ�����������K���h�̖��͂���";
		mes "���܂ꂽ���݂�����B";
		next;
		mes "[�I�[�����[]";
		mes "�O�ɂ��������Ǝv������";
		mes "���������K���h�̎̂Ă�ꂽ�g�̂�";
		mes "�c���Ă��閂�͂́A�Ԃ��Ȃ��͊�����B";
		mes "���K���̓C�X�K���h�𗣂�邽�߂ɂ�";
		mes "�͂��K�v�����A�����������B";
		mes "���Ȃ�ؔ����Ă���͂��c�c�B";
		cloakoffnpc "�����L#e20pn05";
		unittalk getnpcid(0,"�����L#e20pn05"),"�����L : �ɂႨ�[",1;
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�c�c����H";
		next;
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "�ނ��葁�����������K���h��";
		mes "�����Ȃ��Ⴂ���Ȃ��B";
		unittalk getnpcid(0,"�����L#e20pn05"),"�����L : �݂Ⴀ����",1;
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�I�[�����[�l�A�I�[�����[�l�I";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "����H";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�L�ł���A�������I";
		unittalk getnpcid(0,"�����L#e20pn05"),"�����L : ��������",1;
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���������K���h����������";
		mes "�����Ă��ꂽ�݂��������H";
		mes "����ς�_�l�͈Ⴄ�Ȃ��I";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���̂��������������ł��ˁI";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����ł��I�@���̒����I";
		mes "�ԈႢ�Ȃ��ł���I";
		mes "�������Ɓc�c����łǂ����܂��傤���H";
		next;
		misceffect 0,"�����L#e20pn05",1;
		misceffect 0,"���I��#e20pn05",1;
		misceffect 0,"�I�[�����[#e20pn05",1;
		cloakonnpc "���I��#e20pn05";
		cloakonnpc "�I�[�����[#e20pn05";
		cloakonnpc "�����L#e20pn05";
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "���A����!?";
		mes "�I�[�����[�l�A���I���l�I";
		mes "�ǂ��ɍs������ł����I";
		next;
		mes "[���n�[��]";
		mes "�`���җl�I";
		mes "����l��������Ȃ��悤��";
		mes "�ǂ������܂��傤�I";
		close2;
		cutin "ep19_lehar01.png", 255;
		chgquest 23105,23106;
		set EP20_1QUE,56;
		end;
	}
	if(EP20_1QUE == 58) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���ƃI�[�����[�͂�����";
		mes "���������ɂł��邱�Ƃ����܂��B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 55)
		showevent 0, 1, "���I��#e20pn05";
	end;
}
jor_twice.gat,160,244,3	script(CLOAKED)	���n�[��#e20pn05	10469,{/* 3535 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���C�W�[����͂ЂƂ�ŉ���";
		mes "����Ă��ł��傤�H";
		mes "�X�̊Ԃɉ�������̂��ȁH";
		close2;
		cutin "ep19_lehar01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�`���җl�I";
		mes "���I���l�ƃI�[�����[�l��";
		mes "�ǂ������܂��傤�I";
		mes "�}���ŁI";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "�]���I�������̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���I�������̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 53, 323;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 56)
		showevent 0, 1, "���n�[��#e20pn05";
	end;
}
jor_twice.gat,155,247,5	script(CLOAKED)	�}����#e20pn05	10376,{/* 3536 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����A�����c�c�����̕���";
		mes "�܂�Őn���悤�ȉs���ł��B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep18_maram_03.png", 2;
		mes "[�}����]";
		mes "�����Ƃ����Ԃɍs���Ă��܂��܂����ˁB";
		mes "���̂���l�́A�ǂ��ɁH";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_twice.gat,159,248,5	script(CLOAKED)	�~���A��#e20pn05	10377,{/* 3537 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�ӂ��B�o��͂��Ă�����";
		mes "���������̂�ł��ˁB";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "��u�Ŏp�������Ȃ��Ȃ�������";
		mes "���������āA�{�N�̌��ԈႦ�������H";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_twice.gat,160,239,1	script(CLOAKED)	���C�W�[#e20pn05	10454,{/* 3538 (cloaking)*/
	if(EP20_1QUE == 55) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����c�c�ދ΂������ȁB";
		next;
		mes "[���C�W�[]";
		mes "�����Ⴍ���Ȃ�����";
		mes "����Ȃ��Ă��ǂ���J�𔃂��Ȃ�ĂˁB";
		mes "���C�ɓ���̌C�����Z�����c�c�B";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	if(EP20_1QUE == 56) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�Ȃ񂾁A���̑����́I";
		mes "�����l�ނȂ̂ɁA���̓�l��";
		mes "���炩�ɃX�s�[�h�ᔽ����Ȃ��H";
		close2;
		cutin "ep19_leizi01.png", 255;
		end;
	}
	end;
}
jor_twice.gat,157,246,7	script(CLOAKED)	�����L#e20pn05	10537,{/* 3539 (cloaking)*/
	cutin "ep20_nyar01.png", 2;
	mes "[�����L]";
	mes "�S���S���S���B";
	close2;
	cutin "ep20_nyar03.png", 255;
	end;
}
jor_twice.gat,43,331,0	script	#ep20_link_sw_1	139,14,14,{/* 3540 */
	if(EP20_1QUE == 56) {
		cloakoffnpc "�����L#e20pn055";
		cloakoffnpc "���I��#e20pn055";
		cloakoffnpc "�I�[�����[#e20pn055";
		cloakoffnpc "���n�[��#e20pn055";
		cloakonnpc "�����L#nyar_warp";
	}
	if(EP20_1QUE == 57) {
		cloakonnpc "�����L#e20pn055";
		cloakonnpc "���I��#e20pn055";
		cloakonnpc "�I�[�����[#e20pn055";
		cloakonnpc "���n�[��#e20pn055";
		cloakoffnpc "�����L#nyar_warp";
		cloakoffnpc "���I��#e20pn056";
		cloakoffnpc "�I�[�����[#e20pn056";
		cloakoffnpc "���n�[��#e20pn056";
		cloakoffnpc "�����Ȏ}�݂̍菈#ep20_m";
	}
	end;
}
jor_twice.gat,43,331,1	script(CLOAKED)	�����L#e20pn055	10537,{/* 3541 (cloaking)*/}
jor_twice.gat,46,326,1	script(CLOAKED)	���I��#e20pn055	10464,{/* 3542 (cloaking)*/}
jor_twice.gat,50,330,1	script(CLOAKED)	�I�[�����[#e20pn055	10465,{/* 3543 (cloaking)*/}
jor_twice.gat,46,326,5	script(CLOAKED)	���I��#e20pn056	10464,{/* 3544 (cloaking)*/
	cutin "ep19_leon01.png", 2;
	mes "[���I��]";
	mes "���̊F����Ƃ����b�������̂�";
	mes "�ꏊ���ڂ��܂��傤�B";
	close2;
	cutin "ep19_leon01.png", 255;
	end;
}
jor_twice.gat,50,330,5	script(CLOAKED)	�I�[�����[#e20pn056	10465,{/* 3545 (cloaking)*/
	cutin "ep19_aurelie01.png", 2;
	mes "[�I�[�����[]";
	mes "���܂肱���ɒ����͂ł��Ȃ��ȁB";
	close2;
	cutin "ep19_aurelie01.png", 255;
	end;
}
jor_twice.gat,50,326,1	script(CLOAKED)	���n�[��#e20pn055	10469,{/* 3546 (cloaking)*/
	if(EP20_1QUE == 56) {
		cloakonnpc "�����L#e20pn055";
		cloakonnpc "���I��#e20pn055";
		cloakonnpc "�I�[�����[#e20pn055";
		unittalk "���n�[�� : �����I�@�ǂ����Ȃ��c�c!?",1;
		sleep 200;
		cloakonnpc "���n�[��#e20pn055";
		cloakoffnpc "���n�[��#e20pn056";
	}
	end;
}
jor_twice.gat,50,326,5	script(CLOAKED)	���n�[��#e20pn056	10469,{/* 3547 (cloaking)*/
	if(EP20_1QUE == 56) {
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes strcharinfo(0)+"�l�I";
		mes "���̕�����������̂�";
		mes "�҂��Ă��鎞�Ԃ͂���܂���I";
		mes "���ƈꏏ�Ƀ��I���l�ƃI�[�����[�l��";
		mes "�T���ɍs���܂��傤�I";
		next;
		cutin "ep19_lehar05.png", 255;
		mes "^e6328c�������A���_���W����";
		mes "�u�����Ȏ}�݂̍菈�v��";
		mes "�����Ɠ��ꂪ�s���܂��B";
		if(mdopenstate("�����Ȏ}�݂̍菈"))
			set '@str$,"^0b0b33�������A���_���W�����֓���";
		else if(getpartyleader(getcharid(1)) == strcharinfo(0))
			set '@str$,"^0b0b33�������A���_���W�����̍쐬";
		next;
		switch(select("^191970��������",'@str$,"^0b0b33���ӎ����̊m�F")) {
		case 1:
			mes "�]���̏�𗣂ꂽ�]";
			close;
		case 2:
			if(mdopenstate("�����Ȏ}�݂̍菈")) {
				cutin "ep19_lehar01.png", 2;
				mes "[���n�[��]";
				mes "�����ł�����A�����ɍs���܂���I";
				next;
				if(select("^191970�����l����","^e6328c�����Ȏ}�݂̍菈�֌�����") == 2) {
					mes "�]���̏�𗣂ꂽ�]";
					close2;
					cutin "ep19_lehar05.png", 255;
					end;
				}
				mes "[���n�[��]";
				mes "���̐�ɉ�������̂��c�c";
				mes "�\�z�ł��܂���ˁB";
				close2;
				cutin "ep19_lehar01.png", 255;
				switch(mdenter("�����Ȏ}�݂̍菈")) {
				case 0:	// �G���[�Ȃ�
					announce "�������A���_���W����[�����Ȏ}�݂̍菈] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
					//warp "1@twig.gat", 220, 145;
					end;
				case 1:	// �p�[�e�B�[������
					mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
					mes "����ł��܂���B";
					mes "������x�m�F���Ă���";
					mes "��蒼���Ă��������B";
					close;
				case 2:	// �_���W�������쐬
					mes "^8c32e6�p�[�e�B�[���[�_�[��";
					mes "�������A���_���W������";
					mes "�������Ă��Ȃ���Ԃł��B";
					close;
				default:	// ���̑��G���[
					close;
				}
			}
			else {
				if(getonlinepartymember() < 1) {
					mes "^8c32e6�󔒂̃p�[�e�B�[���ł́A";
					mes "�������A���_���W������";
					mes "�쐬���邱�Ƃ͏o���܂���B";
					close;
				}
				mes "�������A���_���W�������쐬���܂����H";
				next;
				if(select("^191970�����l����","^e6328c�쐬����") == 1) {
					mes "�]���̏�𗣂ꂽ�]";
					close;
				}
				if(getpartyleader(getcharid(1)) != strcharinfo(0))
					close;
				mdcreate "�����Ȏ}�݂̍菈";
				mes "���p�[�e�B�[��";
				mes "^009eff"+strcharinfo(1)+"^000000";
				mes "���p�[�e�B�[���[�_�[";
				mes "^009eff"+strcharinfo(0)+"^000000";
				mes "�@";
				mes "^006400�����Ȏ}�݂̍菈��";
				mes "�쐬�\�����󂯕t���܂����B^000000";
				close;
			}
		case 3:
			mes "�ڂ����͂���������m�F���������B";
			mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			messize 180,364;
			close;
		}
	}
	if(EP20_1QUE == 57) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���S�ȏꏊ�Řb�����܂��傤�B";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "�]���S�ȏꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���S�ȏꏊ��";
		mes "�@���������]";
		close2;
		warp "jor_safty1.gat", 331, 150;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 56 || EP20_1QUE == 57)
		showevent 0, 1, "���n�[��#e20pn056";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̐����Ɠ���]";
	end;
}
jor_twice.gat,46,334,3	script(CLOAKED)	�����Ȏ}�݂̍菈#ep20_m	10046,{/* 3548 (cloaking)*/
	if(EP20_1QUE >= 57) {
		mes "[�C���t�H���[�V����]";
		mes "���Ɂu�����Ȏ}�݂̍菈�v��";
		mes "�N���A���Ă���L�����N�^�[�́A";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u�����Ȏ}�݂̍菈�v��";
		mes "����ł��܂��B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�p�[�e�B�����o�[�Ƃ���";
		mes "�u�����Ȏ}�݂̍菈�v��";
		mes "���ꂵ�܂����H";
		next;
		if(select("��߂�","�u�����Ȏ}�݂̍菈�v����") == 1) {
			mes "�]��߂��]";
			close;
		}
		mes "[�C���t�H���[�V����]";
		mes "�u�����Ȏ}�݂̍菈�v�֓��ꂵ�܂��B";
		close2;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			mes "[�C���t�H���[�V����]";
			mes "���Ɂu�����Ȏ}�݂̍菈�v��";
			mes "�N���A���Ă���L�����N�^�[�́A";
			mes "�p�[�e�B���[�_�[�Ƃ���";
			mes "����ł��܂���B";
			close;
		}
		if(getonlinepartymember() == 0 || getonlinepartymember() > 2) {
			mes "[�C���t�H���[�V����]";
			mes "���̃������A���_���W������";
			mes "2�l�ȉ��̃p�[�e�B�[��";
			mes "���ꂷ�邱�Ƃ��ł��܂��B";
			close;
		}
		switch(mdenter("�����Ȏ}�݂̍菈")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[�����Ȏ}�݂̍菈] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
			//warp "1@twig.gat", 220, 145;
			end;
		case 1:	// �p�[�e�B�[������
			//mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
			//mes "����ł��܂���B";
			//mes "������x�m�F���Ă���";
			//mes "��蒼���Ă��������B";
			close;
		case 2:	// �_���W�������쐬
			mes "[�C���t�H���[�V����]";
			mes "�Ώۂ̃������A���_���W������";
			mes "�쐬����Ă��Ȃ�����";
			mes "����ł��܂���B";
			close;
		default:	// ���̑��G���[
			close;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 58)
		showevent 0, 1, "�����Ȏ}�݂̍菈#ep20_m";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̓���]";
	end;
}

jor_safty1.gat,328,150,5	script	�I�[�����[#e20pn0501	10465,{/* 3549 */
	if(EP20_1QUE == 57) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�݂�ȁA�����ɏW�܂��Ă����̂��B";
		mes "���B���}�ɏ������݂����Ɍ���������";
		mes "�������Ă��܂����悤�ˁB";
		next;
		cutin "ep19_leizi02.png", 2;
		mes "[���C�W�[]";
		mes "�����ړ��̔�`�ł�����́H";
		mes "�ǂ������悤�Ǝv�����̂�";
		mes "�S�R������������B";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "���K������������p�j���Ă���̂�";
		mes "�S�z���Ă���ł���I";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���߂�A���߂�B";
		mes "�ł��A�݂�Ȃɓ`���������Ƃ�����B";
		mes "�ƂĂ��d�v�Ȃ��Ƃ���B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "����������";
		mes "�����L����������ł����H";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�����B";
		mes "���ډ�b�͂ł��Ȃ���������";
		mes "���������K���h�̈ӎv��";
		mes "�m���ɗa��������B";
		next;
		mes "[�I�[�����[]";
		mes "���̋߂��Ɍ��E�ŉB�ꂽ�ꏊ��������";
		mes "�����Ƀ��������K���h��";
		mes "��낤�Ƃ��Ă鐢�E�����������B";
		mes "���K�������́A������T���ďo����";
		mes "���͂𗘗p���悤�Ƃ��Ă���c�c�B";
		next;
		mes "[�I�[�����[]";
		mes "���B�́A���K��������";
		mes "�����𔭌�����Ȃ��悤��";
		mes "�s�����Ȃ��Ƃ����Ȃ��B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�ЂƂA��Ă��Ă��ǂ��H";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�킟�I";
		mes "���������āA���K�����~�߂�";
		mes "�ǂ��Ă������ł����I";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "���������K���h����Ȃ���";
		mes "�ʂ̌Ăѕ��ɂ��Ȃ��H";
		mes "�Ⴆ�΁u^FF0000�j�����l^000000�v�Ƃ��ǂ��H";
		mes "�ق�A�������������A�Ăтɂ������炳�B";
		next;
		cutin "ep19_lehar04.png", 2;
		mes "[���n�[��]";
		mes "�c�c�́H";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�Ȍ��ŌĂт₷����";
		mes "��������������Ȃ��H";
		next;
		cutin "ep18_miriam_03.png", 2;
		mes "[�~���A��]";
		mes "�_�ɑ΂��āc�c";
		mes "�s�h�ł͂Ȃ��ł��傤���H";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�c�c�������܂��傤���B";
		mes "���B�����������K���h�Ƃ����P���";
		mes "��b���Ă���ƁA���K�������̒��ӂ�";
		mes "�����Ă��܂��\��������܂��B";
		unittalk getnpcid(0,"���I��#e20pn0501"),"���I�� : �኱�c�c���炵������C�����܂����B",1;
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "����B";
		mes "�����ĈЌ��̖������O���g�p�����";
		mes "���K���̓z��ɂ��C�t����Ȃ��B";
		mes "�c�c���ꂮ�炢�A���������K���h��";
		mes "��ڂɌ��Ă����ł��傤�c�c���Ԃ�B";
		next;
		mes "[�I�[�����[]";
		mes "���Ⴀ���́A���̕t�߂�";
		mes "���K���������J�n�������B";
		mes "���n�[���̔��Ăɂ����̂�����";
		mes "��肭���΁A���K�������̍s����";
		mes "�W�Q���邱�Ƃ��ł���͂��B";
		next;
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�����q��������";
		mes "�����Ƃ���o�̂͂��Ȃ̂�";
		mes "���������ߌ�����ˁH";
		mes "���́A���������̑�D�������ǁB";
		unittalk getnpcid(0,"���n�[��#e20pn0501"),"���n�[�� : ���ւցc�c",1;
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���Έӌ��͖����݂����ˁB";
		mes "�ł́A�e�l���ꂻ�ꃋ�K��1�̂�";
		mes "�ގ����邱�Ƃ�ڕW�ɂ��悤���B";
		next;
		mes "[�I�[�����[]";
		mes "�e�l�A�ڕW��B��������";
		mes "���ɐ��������Ă����H";
		mes "���ƃ��I���́A���̕t�߂�";
		mes "���͂̐��ڂ𒲍����Ă�����B";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 23108,23109;
		set EP20_1QUE,58;
		mes "�]���K���̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���K���̓�����";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 155, 240;
		end;
	}
	if(EP20_1QUE == 58) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "���Έӌ��͖����݂����ˁB";
		mes "�ł́A�e�l���ꂻ�ꃋ�K��1�̂�";
		mes "�ގ����邱�Ƃ�ڕW�ɂ��悤���B";
		next;
		mes "[�I�[�����[]";
		mes "�e�l�A�ڕW��B��������";
		mes "���ɐ��������Ă����H";
		mes "���ƃ��I���́A���̕t�߂�";
		mes "���͂̐��ڂ𒲍����Ă�����B";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "�]���K���̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���K���̓�����";
		mes "�@���������]";
		close2;
		warp "jor_twice.gat", 155, 240;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 57 || EP20_1QUE == 58)
		showevent 0, 1, "�I�[�����[#e20pn0501";
	end;
}
jor_safty1.gat,325,148,5	script	���I��#e20pn0501	10464,{/* 3550 */}
jor_safty1.gat,325,145,5	script	���n�[��#e20pn0501	10469,{/* 3551 */}
jor_safty1.gat,331,146,3	script	�R����#e20pn0501	10461,{/* 3552 */}
jor_safty1.gat,329,152,5	script	�~���A��#e20pn0501	10377,{/* 3553 */}
jor_safty1.gat,333,152,3	script	�}����#e20pn0501	10376,{/* 3554 */}
jor_safty1.gat,336,150,3	script	���C�W�[#e20pn0501	10454,{/* 3555 */}

jor_twice.gat,156,243,3	script(CLOAKED)	�I�[�����[#e20pn05	10465,{/* 3555 (cloaking)*/
	if(EP20_1QUE == 58) {
		if(checkquest(23109) && !checkquest(23109)&0x4) {
			cutin "ep19_aurelie01.png", 2;
			mes "[�I�[�����[]";
			mes "���͂̐��ڂ𒲂ׂĂ��B";
			mes "���K����r���������Ƃ�";
			mes "�������ɖ��͂̌������ቺ���Ă���B";
			mes "�ł��A�܂��\������Ȃ��B";
			next;
			mes "[�I�[�����[]";
			mes "�e�l�A���K����1�̔r�����ė~�����B";
			mes "��낵���ˁB";
			close2;
			cutin "ep19_aurelie01.png", 255;
			end;
		}
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�݂�Ȃ���J�l�B";
		mes "���K����r���������Ƃ�";
		mes "���͂̌������ቺ���Ă����B";
		mes "�����͂���ŏ\����B";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�ӂ��c�c�|���Ă��|���Ă�";
		mes "�L���������ł��ˁB";
		next;
		cutin "ep19_leon05.png", 2;
		mes "[���I��]";
		mes "�z���̃��K��������|����";
		mes "���X�K���h���p�������\����";
		mes "�l���Ă����̂ł���";
		mes "�������������͌����܂���ˁB";
		next;
		cutin "ep19_aurelie03.png", 2;
		mes "[�I�[�����[]";
		mes "�z���T�d�ɂȂ��Ă���̂�������Ȃ��B";
		mes "���̕t�߂Ŗ`���҂ƒ��ډ��������ˁB";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�����炩��ł��ďo�܂��傤���H";
		next;
		cutin "ep19_leon02.png", 2;
		mes "[���I��]";
		mes "�ւ̖��H�ɓ������ł����H";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�c�c�������ɁA���̖��H�ɍU�ߍ����";
		mes "�o��������ǂ����Ƃ��ł����";
		mes "���̕t�߂̃��K����";
		mes "�r�����₷���Ȃ�ł��傤�B";
		next;
		mes "[���I��]";
		mes "�����Ń��K����r����������̂�";
		mes "�����I�ł͂���܂���B";
		mes "�\�Ȃ�A�ł�����胋�K��������";
		mes "���̏󋵂����ׂĂ��������B";
		next;
		mes "[���I��]";
		mes "�댯�𔺂��܂����c�c";
		mes "��鉿�l�͂���ł��傤�B";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�O�̂��߁A���̗��X�n�т̌�����";
		mes "���K���̔r�����K�v�ˁB";
		mes "���̎d���́A�R�����ɔC���Ă��ǂ��H";
		next;
		cutin "ep19_iwin03.png", 2;
		mes "[�R����]";
		mes "�C���Ă��������I";
		mes "����������ƌ���肵�܂���I";
		next;
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�ł͎������́A�ւ̖��H�Ɍ��������B";
		mes "���K���ϐg�X�N���[����Y��Ȃ��ŁB";
		mes "�������ł����Ȃ�";
		mes "���H�̑O�ō������܂��傤�B";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 23109,23112;
		mes "�]�ւ̖��H��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�ւ̖��H��";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 148, 52;
		end;
	}
	if(EP20_1QUE == 59) {
		cutin "ep19_aurelie01.png", 2;
		mes "[�I�[�����[]";
		mes "�ł͎������́A�ւ̖��H�Ɍ��������B";
		mes "���K���ϐg�X�N���[����Y��Ȃ��ŁB";
		mes "�������ł����Ȃ�";
		mes "���H�̑O�ō������܂��傤�B";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "�]�ւ̖��H��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�ւ̖��H��";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 148, 52;
		end;
	}
	end;
OnQuestInfo:
	if(checkquest(23109)) {
		if(checkquest(23109)&0x4)
			showevent 0, 1, "�I�[�����[#e20pn05";
		else
			showevent 0, 2, "�I�[�����[#e20pn05";
	}
	if(EP20_1QUE == 59)
		showevent 0, 1, "�I�[�����[#e20pn05";
	end;
}
jor_maze.gat,145,50,0	script	#hw_ep20_pn07	139,6,10,{/* 3556 */
	if(EP20_1QUE >= 59 && EP20_1QUE <= 63) {	//60,61,62�s��
		cloakoffnpc "���n�[��#e20pn07";
		cloakoffnpc "���I��#e20pn07";
		cloakoffnpc "�I�[�����[#e20pn07";
		cloakoffnpc "�}����#e20pn07";
		cloakoffnpc "�~���A��#e20pn07";
		cloakoffnpc "���C�W�[#e20pn07";
	}
	end;
}
jor_maze.gat,151,54,3	script(CLOAKED)	���n�[��#e20pn07	10472,{/* 3557 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���n�[��]";
		mes "�`���җl�I";
		mes "�����͓G�̑��A���ł���I";
		mes "���̎p�ŕ����܂��̂͊댯�ł��I";
		close;
	}
	if(EP20_1QUE == 59) {
		mes "[���n�[��]";
		mes "���`�`��c�c���A�`���җl�B";
		mes "���K�������̗l�q���ς���Ȃ��ł����H";
		mes "�ȑO�A�N���������Ɣ�ׂāc�c�B";
		next;
		menu "������Ă���悤�Ɍ����܂�",-;
		mes "[���n�[��]";
		mes "�����ł��I";
		mes "������Ă���݂����ł��B";
		mes "���Ɋy�������Ƃ�����";
		mes "�e���V�����������ƌ������B";
		next;
		mes "[���n�[��]";
		mes "�C���ȗ\�������܂��ˁc�c";
		mes "�󋵂�T��K�v�����肻���ł��B";
		mes "���̎��ӂɂ��郋�K�������̘b��";
		mes "�����ĉ��܂��傤�B";
		next;
		chgquest 23112,23113;
		set EP20_1QUE,60;
		mes "�]�\�b�̎��W��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�\�b�̎��W��";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 54, 242;
		end;
	}
	if(EP20_1QUE >= 60 && EP20_1QUE <= 63) {
		mes "[���n�[��]";
		mes "�C���ȗ\�������܂��ˁc�c";
		mes "�󋵂�T��K�v�����肻���ł��B";
		mes "���̎��ӂɂ��郋�K�������̘b��";
		mes "�����ĉ��܂��傤�B";
		next;
		mes "�]�\�b�̎��W��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�\�b�̎��W��";
		mes "�@���������]";
		close2;
		switch(EP20_1QUE) {
		case 60: warp "jor_maze.gat", 54, 242; break;
		case 61: warp "jor_maze.gat", 154, 239; break;
		case 62: warp "jor_maze.gat", 281, 186; break;
		case 63: warp "jor_maze.gat", 148, 40; break;
		}
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 59 || EP20_1QUE == 60)
		showevent 0, 1, "���n�[��#e20pn07";
	end;
}
jor_maze.gat,151,45,3	script(CLOAKED)	�~���A��#e20pn07	10471,{/* 3558 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�~���A��]";
		mes "���̎p�̂܂܂���";
		mes "���K���ɋC�t����Ă��܂�����";
		mes "�ϐg�X�N���[�����g���āB";
		close;
	}
	if(EP20_1QUE == 63) {
		mes "[�~���A��]";
		mes "�`���҂���A���K����������";
		mes "�b�͕������H";
		mes "�������L���ė~�����񂾂��ǁB";
		next;
		mes "[�}����]";
		mes "�c�c�j�����l�����ꂽ���Ƃ�";
		mes "�݂�Ȓm���Ă���悤�ł����B";
		mes "����ƁA���X�K���h�̓j�����l��";
		mes "���������K���h�ėՂ̐G�}�̂���";
		mes "�����Ă���悤�ł��B";
		next;
		mes "[�~���A��]";
		mes "�{�N���������b�ɂ���";
		mes "���X�K���h�̓��K��������";
		mes "�j�����l��߂܂���悤�������݂����B";
		next;
		mes "[�}����]";
		mes "�߂܂��āA���̖��͂�������";
		mes "���p�������Ȃ̂ł��傤���H";
		next;
		menu "�����炭�́c�c",-;
		mes "[�}����]";
		mes "���K���������j�����l��߂܂���O��";
		mes "�����炪�ی�ł���Ηǂ��̂ł����c�c";
		mes "���������A�ǂ��ɂ���̂��낤�H";
		next;
		mes "[�~���A��]";
		mes "�����͈̔͂��L���܂��傤���H";
		mes "�����ł̒����͍ς񂾂���";
		mes "���H�̓����ɂ��s���Ă݂悤��B";
		next;
		chgquest 23116,23118;
		set EP20_1QUE,64;
		mes "�]���H�̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���H�̓�����";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 202, 29;
		end;
	}
	if(EP20_1QUE == 64) {
		mes "[�~���A��]";
		mes "�����͈̔͂��L���܂��傤���H";
		mes "�����ł̒����͍ς񂾂���";
		mes "���H�̓����ɂ��s���Ă݂悤��B";
		next;
		mes "�]���H�̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���H�̓�����";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 202, 29;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 63 || EP20_1QUE == 64)
		showevent 0, 1, "�~���A��#e20pn07";
	end;
}
jor_maze.gat,145,50,5	script(CLOAKED)	���I��#e20pn07	10471,{/* 3559 (cloaking)*/}
jor_maze.gat,145,53,5	script(CLOAKED)	�I�[�����[#e20pn07	10470,{/* 3560 (cloaking)*/}
jor_maze.gat,151,50,3	script(CLOAKED)	�}����#e20pn07	10472,{/* 3561 (cloaking)*/}
jor_maze.gat,145,41,7	script(CLOAKED)	���C�W�[#e20pn07	10475,{/* 3562 (cloaking)*/}
jor_maze.gat,53,238,0	script	#hw1	139,9,5,{/* 3563 */
	if(EP20_1QUE == 60) {
		cloakoffnpc "�z�g���P�K���h#e20rgan_";
		cloakoffnpc "�\�w�K���K���h#e20rgan_";
	}
	end;
}
jor_maze.gat,52,238,7	script(CLOAKED)	�z�g���P�K���h#e20rgan_	10470,{/* 3564 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�z�g���P�K���h]";
		mes "�M���[�[�I�@����킵���l�ԁI";
		close;
	}
	if(EP20_1QUE == 60) {
		mes "[�z�g���P�K���h]";
		mes "���������I";
		mes "���������K���h�l���ėՂ����炵���I";
		mes "�����A����������";
		mes "�d������ɂ��Ȃ������I";
		next;
		mes "[�\�w�K���K���h]";
		mes "�����炵���ȁI";
		mes "�����A����Ȏ�����";
		mes "�悭�H�ׂāA�悭�Q�āA�悭�����̂��I";
		mes "���������K���h�l�����}������ׂɁI";
		next;
		mes "[�z�g���P�K���h]";
		mes "�܂����������Ă��̒ʂ肾�I";
		mes "�c�c���H";
		next;
		mes "[�z�g���P�K���h]";
		mes "���O�I�@�����Ƃ��炵�����������Ă邪";
		mes "�����d�������Ă���Ԃ�";
		mes "���������K���h�l��";
		mes "���}��������肾�ȁI";
		next;
		mes "[�\�w�K���K���h]";
		mes "�����A���̂�����߁I";
		mes "�M�[�����̕������";
		mes "���������K���h�l�ɂ������̂�";
		mes "���R�̂��Ƃ��낤�H";
		next;
		mes "[�z�g���P�K���h]";
		mes "���A�������I";
		emotion 7,"�z�g���P�K���h#e20rgan_",1;
		next;
		mes "�]�ǂ����A���K�������̊Ԃ�";
		mes "�@���������K���h���ėՂ���Ƃ���";
		mes "�@�\���L�܂��Ă���悤���B";
		mes "�@�ʂ̏ꏊ�ł��b�𕷂��Ă݂悤�]";
		next;
		chgquest 23113,23114;
		set EP20_1QUE,61;
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 154, 239;
		end;
	}
	if(EP20_1QUE == 61) {
		mes "�]�ǂ����A���K�������̊Ԃ�";
		mes "�@���������K���h���ėՂ���Ƃ���";
		mes "�@�\���L�܂��Ă���悤���B";
		mes "�@�ʂ̏ꏊ�ł��b�𕷂��Ă݂悤�]";
		next;
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 154, 239;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 60 || EP20_1QUE == 61)
		showevent 0, 1, "�z�g���P�K���h#e20rgan_";
	end;
}
jor_maze.gat,55,238,7	script(CLOAKED)	�\�w�K���K���h#e20rgan_	10471,{/* 3565 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�\�w�K���K���h]";
		mes "�M���[�[�I�@����킵���l�ԁI";
		close;
	}
	if(EP20_1QUE == 60) {
		mes "[�\�w�K���K���h]";
		mes "����Ȏ�����";
		mes "�悭�H�ׂāA�悭�Q�āA�悭�����̂��I";
		mes "���������K���h�l�����}������ׂɁI";
		close;
	}
	if(EP20_1QUE == 61) {
		mes "[�\�w�K���K���h]";
		mes "�����A���̂�����߁I";
		close;
	}
	end;
}
jor_maze.gat,155,243,0	script	#hw3	139,9,9,{/* 3566 */
	if(EP20_1QUE == 61) {
		cloakoffnpc "�~�X�S�[�K���h#e20rgan_";
		cloakoffnpc "�i�A���K���h#e20rgan_sr";
	}
	end;
}
jor_maze.gat,154,244,3	script(CLOAKED)	�~�X�S�[�K���h#e20rgan_	10472,{/* 3567 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�~�X�S�[�K���h]";
		mes "����킵���l�Ԃ߁I";
		mes "�r�����Ă��I";
		close;
	}
	if(EP20_1QUE == 61) {
		mes "[�~�X�S�[�K���h]";
		mes "�i�՗l�A���������K���h�l�̐G�}�̂�";
		mes "�ǂ̂悤�Ȃ��p�Ȃ̂ł����H";
		next;
		mes "[�i�A���K���h]";
		mes "�c�c�����āA���������B";
		mes "�����ă��������K���h�l�̖��͂�";
		mes "�N���Ɋ�������B";
		next;
		mes "[�~�X�S�[�K���h]";
		mes "�����Əڂ���";
		mes "�����Ă��������Ȃ��ł��傤���H";
		mes "���͏㋉������ł��傤���c�c";
		mes "��肭�����ł��܂���B";
		next;
		mes "[�i�A���K���h]";
		mes "�c�c�������ꂾ�����������Ă��Ȃ��B";
		mes "�ڂ������Ƃ�";
		mes "���X�K���h�l�ɂ��������Ȃ���΁c�c�B";
		emotion 4,"�~�X�S�[�K���h#e20rgan_",1;
		next;
		mes "�]�����[�̃��K�������ɂ�";
		mes "�@���������K���h�Ɋւ���";
		mes "�@���m�ȏ�񂪓`����Ă��Ȃ��炵���B";
		mes "�@�c�c�ǂ��̑g�D�������悤�Ȃ��̂��]";
		next;
		chgquest 23114,23115;
		set EP20_1QUE,62;
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 281, 186;
		end;
	}
	if(EP20_1QUE == 62) {
		mes "�]�����[�̃��K�������ɂ�";
		mes "�@���������K���h�Ɋւ���";
		mes "�@���m�ȏ�񂪓`����Ă��Ȃ��炵���B";
		mes "�@�c�c�ǂ��̑g�D�������悤�Ȃ��̂��]";
		next;
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 281, 186;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 61 || EP20_1QUE == 62)
		showevent 0, 1, "�~�X�S�[�K���h#e20rgan_";
	end;
}
jor_maze.gat,157,241,5	script(CLOAKED)	�i�A���K���h#e20rgan_sr	10473,{/* 3568 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�i�A���K���h]";
		mes "�ߊ��ȁI";
		mes "����킵���l�Ԃ߁I";
		close;
	}
	if(EP20_1QUE == 61) {
		mes "[�i�A���K���h]";
		mes "�c�c�����āA���������B";
		mes "�����ă��������K���h�l�̖��͂�";
		mes "�N���Ɋ�������B";
		close;
	}
	if(EP20_1QUE == 62) {
		mes "[�i�A���K���h]";
		mes "�c�c���ɕ�����Ă�����B";
		close;
	}
	end;
}
jor_maze.gat,282,190,0	script	#hw5	139,9,9,{/* 3569 */
	if(EP20_1QUE == 62) {
		cloakoffnpc "�n�i�E�K���h#e20rgan_sr";
		cloakoffnpc "�P�O�g�K���h#e20rgan_sr";
	}
	end;
}
jor_maze.gat,281,191,4	script(CLOAKED)	�P�O�g�K���h#e20rgan_sr	10474,{/* 3570 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�P�O�g�K���h]";
		mes "�Ȃ��l�Ԃ����I";
		close;
	}
	if(EP20_1QUE == 62) {
		mes "[�P�O�g�K���h]";
		mes "�����Ē����Ė��͂������݁c�c�B";
		next;
		mes "[�n�i�E�K���h]";
		mes "�����Ē����Ė��͂������݁c�c�B";
		next;
		mes "[�P�O�g�K���h]";
		mes "���̑��݂��A���������K���h�l��";
		mes "�ėՂ���邽�߂̐G�}�̂���";
		mes "���X�K���h�l�͋�ꂽ�ȁH";
		next;
		mes "[�n�i�E�K���h]";
		mes "������ėv�����";
		mes "���B���K���̂��Ƃ���ȁI";
		mes "�����Ē����K���I";
		mes "�����āA���͂������Ă���I";
		next;
		mes "[�P�O�g�K���h]";
		mes "���������K���h�l��";
		mes "��X�̋N��������ȁI";
		mes "�����������������炩�ȗ؂�";
		mes "�J�b�R�����K�����������Ȃ̂��낤�I";
		next;
		mes "[�n�i�E�K���h]";
		mes "�����ɈႢ�Ȃ��I";
		mes "�����A�����āA���͂������݂Ȃ��";
		mes "���K���ȊO�ɂ��蓾�Ȃ��I";
		emotion 3,"�P�O�g�K���h#e20rgan_sr",1;
		emotion 3,"�n�i�E�K���h#e20rgan_sr",1;
		next;
		mes "�]���K�������̊Ԃł�";
		mes "�@�u�����Ē����Ė��͂������݁v��";
		mes "�@���������K���h�ėՂ̐G�}�̂ł����";
		mes "�@�\����Ă���悤���]";
		next;
		chgquest 23115,23116;
		set EP20_1QUE,63;
		mes "�]�݂�Ȃ̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�݂�Ȃ̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 148, 40;
		end;
	}
	if(EP20_1QUE == 63) {
		mes "�]���K�������̊Ԃł�";
		mes "�@�u�����Ē����Ė��͂������݁v��";
		mes "�@���������K���h�ėՂ̐G�}�̂ł����";
		mes "�@�\����Ă���悤���]";
		next;
		mes "�]�݂�Ȃ̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�݂�Ȃ̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_maze.gat", 148, 40;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 62 || EP20_1QUE == 63)
		showevent 0, 1, "�P�O�g�K���h#e20rgan_sr";
	end;
}
jor_maze.gat,283,188,3	script(CLOAKED)	�n�i�E�K���h#e20rgan_sr	10475,{/* 3571 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�n�i�E�K���h]";
		mes "�l�Ԃ߂��I�@���܂����ǂ��o���I";
		close;
	}
	mes "[�n�i�E�K���h]";
	mes "�����A�����āA���͂������݂Ȃ��";
	mes "���K���ȊO�ɂ��蓾�Ȃ��I";
	close;
}
jor_maze.gat,198,33,0	script	#hw_ep20_pn0802	139,9,9,{/* 3572 */
	if(EP20_1QUE == 64)
		cloakoffnpc "�~���A��#e20pn08_enter";
	end;
}
jor_maze.gat,197,34,5	script(CLOAKED)	�~���A��#e20pn08_enter	10471,{/* 3573 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�~���A��]";
		mes "���̎p�̂܂܂���";
		mes "���K���ɋC�t����Ă��܂�����";
		mes "�ϐg�X�N���[�����g���āB";
		close;
	}
	if(EP20_1QUE == 64) {
		mes "[�~���A��]";
		mes "�`���҂���B";
		mes "���H�̓������Ȃɂ�瑛�������B";
		mes "�T�d�ɐi�񂾕����ǂ���������B";
		close2;
		warp "jor_safty2.gat", 300, 151;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 64)
		showevent 0, 1, "�~���A��#e20pn08_enter";
	end;
}
jor_safty2.gat,309,150,0	script	#hw_ep20_pn08	139,9,9,{/* 3575 */
	if(EP20_1QUE == 64) {
		cloakoffnpc "���n�[��#e20pn08";
		cloakoffnpc "���I��#e20pn08";
		cloakoffnpc "�I�[�����[#e20pn08";
		cloakoffnpc "�}����#e20pn08";
		cloakoffnpc "�~���A��#e20pn08";
		cloakoffnpc "���C�W�[#e20pn08";
	}
	end;
}
jor_safty2.gat,300,148,5	script(CLOAKED)	�~���A��#e20pn08	10471,{/* 3576 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�~���A��]";
		mes "���̎p�̂܂܂���";
		mes "���K���ɋC�t����Ă��܂�����";
		mes "�ϐg�X�N���[�����g���āB";
		close;
	}
	if(EP20_1QUE == 64) {
		cloakonnpc "�X�_�_�K���h#e20pn08";
		cloakonnpc "�p�L���K���h#e20pn08";
		cloakonnpc "�J�g�Z�h�K���h#e20pn08";
		cloakonnpc "�^�C�i�K���h#e20pn08";
		cloakonnpc "�����[�f�K���h#e20pn08";
		cloakonnpc "�o�w�h�K���h#e20pn08";
		cloakonnpc "�X���Z�K���h#e20pn08";
		cloakonnpc "�����L#e20pn08";
		cloakonnpc "���X�K���h#e20pn08";
		mes "[�~���A��]";
		mes "���K���ɂ͐��̂̓o���ĂȂ��B";
		mes "���̂܂܉��܂ŐN���ł����";
		mes "�ǂ��񂾂��ǁc�c�B";
		next;
		mes "[�}����]";
		mes "�c�c����́H";
		cloakoffnpc "�����L#e20pn08";
		misceffect 0,"�����L#e20pn08",1;
		unittalk getnpcid(0,"�����L#e20pn08"),"�����L: �~���I�H�H�H���B",1;
		next;
		mes "[�~���A��]";
		mes "�}�ɗ����~�܂��Ăǂ������́H";
		next;
		mes "[�}����]";
		mes "�����c�c�j�����l���I";
		next;
		mes "[�~���A��]";
		mes "�����c�c!?";
		next;
		mes "[�j����]";
		mes "�~���I�I���B";
		next;
		cloakoffnpc "�X�_�_�K���h#e20pn08";
		unittalk getnpcid(0,"�X�_�_�K���h#e20pn08"),"�c�c�Ȃ񂾁A����H",1;
		mes "[���I��]";
		mes "�j�����l�̖��͂�";
		mes "�z����C�t�����݂����ł��ˁc�c�B";
		close2;
		if(!sleep2(1000)) end;
		cloakoffnpc "�p�L���K���h#e20pn08";
		unittalk getnpcid(0,"�X�_�_�K���h#e20pn08"),"�L���A���������������I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�p�L���K���h#e20pn08"),"���F���I",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "�J�g�Z�h�K���h#e20pn08";
		cloakoffnpc "�^�C�i�K���h#e20pn08";
		unittalk getnpcid(0,"�J�g�Z�h�K���h#e20pn08"),"���������K���h�l�̗͂�������I",1;
		unittalk getnpcid(0,"�X�_�_�K���h#e20pn08"),"���������邼�I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�^�C�i�K���h#e20pn08"),"���������K���h�l�Ȃ�A�ǂ����}�������!?",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "�����[�f�K���h#e20pn08";
		if(!sleep2(1000)) end;
		cloakoffnpc "�o�w�h�K���h#e20pn08";
		unittalk getnpcid(0,"�����[�f�K���h#e20pn08"),"�勳�l�A���ꑽ���ł��I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�o�w�h�K���h#e20pn08"),"����͂܂��Ɍh�i�ȐM�̕\�ꂾ�B",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "�X���Z�K���h#e20pn08";
		unittalk getnpcid(0,"�X���Z�K���h#e20pn08"),"�݂���ɐG��Ă͂����Ȃ����c�c",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�X�_�_�K���h#e20pn08"),"���A�N�ł���������A�����߂܂���I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�J�g�Z�h�K���h#e20pn08"),"���X�K���h�l���Ă�ł���I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�o�w�h�K���h#e20pn08"),"�Ƃ肠�����A�L�����͂߁I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�����L#e20pn08"),"�����L: �~���I�I",1;
		misceffect 554,"�����L#e20pn08",1;
		misceffect 1065,"�����L#e20pn08",1;
		unittalk getnpcid(0,"�p�L���K���h#e20pn08"),"�L���A������!?",1;
		if(!sleep2(500)) end;
		misceffect 1065,"���n�[��#e20pn08",1;
		if(!sleep2(500)) end;
		misceffect 1065,"���I��#e20pn08",1;
		misceffect 1065,"�I�[�����[#e20pn08",1;
		if(!sleep2(500)) end;
		misceffect 1065,"�}����#e20pn08",1;
		misceffect 1065,"�~���A��#e20pn08",1;
		if(!sleep2(500)) end;
		misceffect 1065,"���C�W�[#e20pn08",1;
		misceffect 1065,"",1;
		unittalk getnpcid(0,"�����[�f�K���h#e20pn08"),"����ɂ������K����������������!?",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�^�C�i�K���h#e20pn08"),"�����N����!?",1;
		if(!sleep2(1000)) end;
		mes "[�~���A��]";
		mes "�c�c���K�������̖ڂɂ�";
		mes "�{�N�������������悤��";
		mes "�����Ă���̂��ȁH";
		next;
		mes "[���n�[��]";
		mes "���B���ȑO�A�����o��������";
		mes "�����悤�Ɏp���B���Ă���܂����B";
		next;
		mes "[���I��]";
		mes "�j�����l�̖��͂����B����ł��܂��B";
		mes "���n���B���Ă��錋�E��";
		mes "�������̂̂悤�ł��B";
		next;
		mes "[�I�[�����[]";
		mes "���B�������ɗ��Ă��ꂽ�H";
		next;
		cloakoffnpc "���X�K���h#e20pn08";
		mes "[���C�W�[]";
		mes "����͂܂�A����ȏ�i�ނ̂�";
		mes "�댯���Ă��ƁH";
		mes "�����ƁA�e���̂��o�ꂾ���B";
		next;
		cutin "ep20_lasgand01.png", 2;
		mes "[���X�K���h]";
		mes "�c�c���̑������H";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "[�X���Z�K���h]";
		mes "���X�K���h�l�A���̒����L���I";
		unittalk getnpcid(0,"�����[�f�K���h#e20pn08"),"�����ɋ����̂ł��I",1;
		unittalk getnpcid(0,"�p�L���K���h#e20pn08"),"���������āA���ԈႦ���H",1;
		unittalk getnpcid(0,"�X�_�_�K���h#e20pn08"),"����A�m���ɂ����Ɂc�c",1;
		next;
		mes "[�o�w�h�K���h]";
		mes "����قǂ����ɂ�����ł��I";
		mes "�ł����A�����Ă��܂��āI";
		unittalk getnpcid(0,"�J�g�Z�h�K���h#e20pn08"),"�����A�{���ɂ����񂾁I",1;
		next;
		cutin "ep20_lasgand01.png", 2;
		mes "[���X�K���h]";
		mes "�c�c���X�n�тŊ��������͂�";
		mes "�������͂������邼�B";
		mes "�����A�m���Ƀ��������K���h�̐G�}�̂�";
		mes "�����ɑ��݂��Ă���B";
		mes "�����c�c�����ׂɂ��邩�̂悤���B";
		unittalk getnpcid(0,"�p�L���K���h#e20pn08"),"���X�K���h�l�c�c�I",1;
		next;
		cutin "ep20_lasgand01.png", 255;
		mes "[���C�W�[]";
		mes "���o���s���ȁc�c";
		mes "���΂͎ցc�c�B";
		next;
		mes "[�I�[�����[]";
		mes "�������痣�ꂽ�����ǂ��B";
		mes "�c�c�C���ȗ\��������B";
		next;
		misceffect 910,"���X�K���h#e20pn08",1;
		mes "[���I��]";
		mes "����́c�c�܂���";
		mes "���������K���h�̖��͂��z�����Ă���H";
		next;
		cutin "ep20_lasgand04.png", 2;
		mes "[���X�K���h]";
		mes "����ł������肾�낤��";
		mes "���̖��H�́A���̐g�̗̂l�Ȃ��̂��B";
		mes "�c�c���O������";
		mes "���̏��̏�ŗx���Ă���ɉ߂��ʁB";
		next;
		mes "[���X�K���h]";
		mes "�������c�c��Ԃ��Ȃ����B";
		mes "��l�����䂪��]���тƐ���I";
		unittalk getnpcid(0,"�����[�f�K���h#e20pn08"),"���X�K���h�l�I",1;
		unittalk getnpcid(0,"�^�C�i�K���h#e20pn08"),"���X�K���h�l�I",1;
		unittalk getnpcid(0,"�p�L���K���h#e20pn08"),"���X�K���h�l�I",1;
		unittalk getnpcid(0,"�X�_�_�K���h#e20pn08"),"���X�K���h�l�I",1;
		next;
		cutin "ep20_lasgand04.png", 255;
		mes "[���I��]";
		mes "����ȏ�́A�����Ȃ��I";
		next;
		cutin "ep20_nyar05.png", 2;
		misceffect 894,"�����L#e20pn08",1;
		mes "[�j����]";
		mes "�I";
		next;
		cutin "ep19_leon01.png", 255;
		misceffect 484,"",1;
		if(!sleep2(3000)) end;
		chgquest 23118,18220;
		set EP20_1QUE,65;
		warp "jor_back1.gat", 364, 217;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 64)
		showevent 0, 1, "�~���A��#e20pn08";
	end;
}
jor_safty2.gat,307,147,1	script(CLOAKED)	�����L#e20pn08	10537,{/* 3577 (cloaking)*/
	cutin "ep20_nyar03.png", 2;
	mes "[�����L]";
	mes "�~���I�I�H�H��";
	close2;
	cutin "ep20_nyar05.png", 255;
	end;
}
jor_safty2.gat,304,147,5	script(CLOAKED)	�I�[�����[#e20pn08	10471,{/* 3578 (cloaking)*/}
jor_safty2.gat,305,151,7	script(CLOAKED)	���I��#e20pn08	10471,{/* 3579 (cloaking)*/}
jor_safty2.gat,301,145,5	script(CLOAKED)	���n�[��#e20pn08	10472,{/* 3580 (cloaking)*/}
jor_safty2.gat,298,143,5	script(CLOAKED)	���C�W�[#e20pn08	10475,{/* 3581 (cloaking)*/}
jor_safty2.gat,303,151,5	script(CLOAKED)	�}����#e20pn08	10471,{/* 3582 (cloaking)*/}
jor_safty2.gat,316,145,3	script2(CLOAKED)	���X�K���h#e20pn08	22007,{/* 3583 (cloaking)*/}
//setnpcspeed 150,"���X�K���h#e20pn08";
jor_safty2.gat,309,150,3	script(CLOAKED)	�X�_�_�K���h#e20pn08	10474,{/* 3584 (cloaking)*/}
jor_safty2.gat,311,148,3	script(CLOAKED)	�p�L���K���h#e20pn08	10475,{/* 3585 (cloaking)*/}
jor_safty2.gat,309,145,1	script2(CLOAKED)	�J�g�Z�h�K���h#e20pn08	10472,{/* 3586 (cloaking)*/}
//setnpcspeed 200,"�J�g�Z�h�K���h#e20pn08";
jor_safty2.gat,307,143,7	script(CLOAKED)	�^�C�i�K���h#e20pn08	10473,{/* 3587 (cloaking)*/}
jor_safty2.gat,309,141,1	script2(CLOAKED)	�����[�f�K���h#e20pn08	10470,{/* 3588 (cloaking)*/}
//setnpcspeed 200,"�����[�f�K���h#e20pn08";
jor_safty2.gat,311,143,1	script(CLOAKED)	�o�w�h�K���h#e20pn08	10474,{/* 3589 (cloaking)*/}
jor_safty2.gat,306,140,8	script(CLOAKED)	�X���Z�K���h#e20pn08	10475,{/* 3590 (cloaking)*/}

jor_back1.gat,365,218,0	script	#ep20_part_end_evt1	139,9,9,{/* 3590 */
	if(EP20_1QUE == 65)
		cloakoffnpc "�j����#ep20_nyar_e1";
	if(EP20_1QUE == 66 || EP20_1QUE == 67)
		cloakoffnpc "���C�W�[#ep20_end01";
	end;
}
jor_back1.gat,364,222,3	script(CLOAKED)	�j����#ep20_nyar_e1	10537,{/* 3591 (cloaking)*/
	if(EP20_1QUE == 65) {
		unittalk getcharid(3),strcharinfo(0)+" : �c�c�����́H�@�݂�Ȃ́A�ǂ����H",1;
		if(!sleep2(500)) end;
		mes "[�j����]";
		mes "�~���I�b�H";
		cutin "ep20_nyar02.png", 1;
		next;
		cutin "ep20_nyar02.png", 255;
		mes "�]�ǂ����j�������X�̏�̋߂���";
		mes "�@�]�����Ă��ꂽ�悤���]";
		close2;
		cutin "ep20_nyar02.png", 255;
		cloakoffnpc "���C�W�[#ep20_end01";
		if(!sleep2(200)) end;
		misceffect 1,"���C�W�[#ep20_end01",1;
		misceffect 563,"���C�W�[#ep20_end01",1;
		misceffect 194,"���C�W�[#ep20_end01",1;
		if(!sleep2(200)) end;
		cloakonnpc "�j����#ep20_nyar_e1";
		chgquest 18220,18240;
		set EP20_1QUE,66;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 65)
		showevent 0, 1, "�j����#ep20_nyar_e1";
	end;
}
jor_back1.gat,368,222,3	script(CLOAKED)	���C�W�[#ep20_end01	10454,{/* 3592 (cloaking)*/
	if(EP20_1QUE == 66) {
		mes "[���C�W�[]";
		mes "�����������c�c";
		mes "���܂�ɋ}�Ȃ��Ƃ���������";
		mes "���n�Ɏ��s�������������Ȃ����B";
		mes "����H�@�����͕X�̏�̋߂����H";
		cutin "ep19_leizi01.png", 2;
		next;
		mes "[���C�W�[]";
		mes "�Ƃ̑O�܂ő����Ă�������񂾂���";
		mes "��������ƂɋA�낤���B";
		mes "�����ɗ����ĂĂ����Ԃ͐i�܂Ȃ�����B";
		mes "���݂̂�Ȃ��A�����Ƃ������Ă���āB";
		next;
		cutin "ep19_leizi01.png", 255;
		chgquest 18240,131258;
		set EP20_1QUE,67;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 115, 226;
		end;
	}
	if(EP20_1QUE == 67) {
		cutin "ep19_leizi01.png", 2;
		mes "[���C�W�[]";
		mes "�Ƃ̑O�܂ő����Ă�������񂾂���";
		mes "��������ƂɋA�낤���B";
		mes "�����ɗ����ĂĂ����Ԃ͐i�܂Ȃ�����B";
		mes "���݂̂�Ȃ��A�����Ƃ������Ă���āB";
		next;
		cutin "ep19_leizi01.png", 255;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icas_in.gat", 115, 226;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 66 || EP20_1QUE == 67)
		showevent 0, 1, "���C�W�[#ep20_end01";
	end;
}
icas_in.gat,142,201,3	script	�g����#ep20iwin01	21513,{/* 3593 */}
icas_in.gat,116,222,0	script	#ep20_part_end_evt2	139,5,5,{/* 3595 */
	if(EP20_1QUE == 67 || EP20_1QUE == 68) {
		cloakoffnpc "���I��#ep20_end01";
		cloakoffnpc "�I�[�����[#ep20_end01";
	}
	end;
}
icas_in.gat,111,228,4	script(CLOAKED)	���I��#ep20_end01	10464,{/* 3596 (cloaking)*/
	if(EP20_1QUE == 67) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�������ł悩�����B";
		mes "�}�ɕX�̏�ɓ]������āc�c";
		mes "�j�����l�̂��͂ɂ����̂ł��ˁB";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�݂�ȁA�o���o����";
		mes "��΂��ꂽ�݂����ˁB";
		mes "�T���ɍs�����Ǝv���Ă�������";
		mes "�����ő҂��Ă����̂�B";
		next;
		cloakoffnpc "���C�W�[#ep20_end02";
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�s���Ⴂ�ɂȂ�ƍ��邩��Ȃ��B";
		mes "���āc�c";
		mes "���݂̂�Ȃ�����܂ł̊Ԃ�";
		mes "���𐮗����Ă����܂��傤���H";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�������܂��傤�B";
		mes "�܂��A���X�K���h���j�����l�̖��͂�";
		mes "���m�ł���̂͊ԈႢ����܂���B";
		mes "�������A������z���ł��܂��B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���̌��Ԃ肩�炷���";
		mes "���̃��X�K���h�̖ړI��";
		mes "�j�����l�̖��͂�D�����Ƃ�";
		mes "�ԈႢ�Ȃ��Ǝv����B";
		mes "�c�c�l���Ă݂�΁A���R�����ǁB";
		next;
		menu "�ǂ��������Ƃł����H",-;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���X�A�����X�^�[�ɉ߂��Ȃ����݂�";
		mes "���������K���h�̖��͂��z������";
		mes "���܂ꂽ�̂����K���ł��B";
		next;
		mes "[���I��]";
		mes "���X�K���h�������ł��B";
		mes "���������K���h�̖��͂𓾂�";
		mes "���̂悤�ȑ��݂ɂȂ����B";
		next;
		mes "[���I��]";
		mes "�������A���������K���h�̖S�[����";
		mes "����ȏ㖂�͂��z�����邱�Ƃ�";
		mes "����󋵂ł��B";
		mes "�j�����l�́A�i�D�̉a�Ȃ̂ł��傤�B";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�����[�[�I";
		mes "���������̐_��H�ׂ悤�Ƃ���Ȃ�āI";
		mes "�܂�Ŋ񐶒����ȁI";
		next;
		cloakoffnpc "���H�[�N�����f#ep20_end";
		cloakoffnpc "���F���O���f#ep20_end01";
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���ɂ�����B";
		mes "������j�����l�͍ŋ߂܂�";
		mes "�͂��g�킸�����Ă����̂�B";
		next;
		mes "[�I�[�����[]";
		mes "�j�����l���͂��g����";
		mes "���X�K���h�́A���̖��͂��z�����āc�c�B";
		mes "����ȑ��݂Ƃ���";
		mes "���܂�ς���Ă��܂��\��������B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���炭�A�j�����l�͂���ȏ�";
		mes "�͂��g�����Ƃ͂Ȃ��ł��傤�B";
		mes "����i��œG��";
		mes "�a��^����킯�ɂ͂����܂��񂩂�B";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�b�̓r���ɂ��܂Ȃ�����";
		mes "�ЂƂm�F���������Ƃ�����́B";
		next;
		mes "[���H�[�N�����f]";
		mes "���́c�c���������K���h�H";
		mes "�j�����l�ƌ����Ă������ǁc�c";
		mes "���̔L�́A�Q�I���O�Ƃɂ�����ꂽ";
		mes "�􂢂��������Ƃ͂ł���́H";
		next;
		cutin "ep19_leon01.png", 1;
		mes "[���I��]";
		mes "���̉\���́A�Ⴂ�ł��傤�B";
		mes "���̎􂢂́A���������K���h���c��";
		mes "��̂ƂȂ��Ă��܂��B";
		mes "�ނ���A���X�K���h�̕���";
		mes "�q���肪�[����������܂���B";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�c�c���Ƀ��X�K���h��";
		mes "�􂢂̎�̂ł���Ȃ�";
		mes "���̎҂�|����";
		mes "�􂢂������邩������Ȃ��H";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�c�c�|����΁A�ˁB";
		mes "�j�����l�́A���̂܂܂ł�";
		mes "���X�K���h�ɂ͓G��Ȃ��Ɣ��f����";
		mes "�������Ă��ꂽ�񂶂�Ȃ��̂����H";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�Ƃ͂����A���X�K���h��";
		mes "����ȏ㖂�͂��z�������";
		mes "�܂��܂������ł��ł��Ȃ��Ȃ�܂��B";
		mes "�������@���l���Ȃ��ƁB";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����ˁB";
		mes "��������́A���ԂƂ̏��������c�c�B";
		next;
		menu "���݂̂�Ȃ��߂��Ă��Ȃ��ł���",-;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���ȁH";
		mes "�{���ɂ݂�ȃo���o���̏ꏊ��";
		mes "�]��������ꂿ������̂����H";
		next;
		cloakoffnpc "�}����#ep20_end01";
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���߂�܂����I";
		mes "�����ɏW�܂��Ă�����ƕ����āB";
		mes "�������x��Ă��܂���";
		mes "�\���󂠂�܂���B";
		next;
		menu "�}�����A�ЂƂ�H",-;
		mes "[�}����]";
		mes "���ꂪ�c�c";
		mes "���ƃ~���A���ƃ��n�[�������";
		mes "���K���̓��A��";
		mes "�����ɓ]�����ꂽ��ł��B";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "���n�[�����񂪌����ɂ�";
		mes "�j�����l�����A�̓�����ɑ������̂ɂ�";
		mes "�Ӗ�������̂��낤�ƁB";
		next;
		mes "[�}����]";
		mes "��������������";
		mes "�o�S�b�g�̌������𒲂ׂ��";
		mes "���n�[������ƃ~���A����";
		mes "���A�ɓ����Ă����܂����B";
		next;
		mes "[�}����]";
		mes "���́A���̂��Ƃ�m�点�邽�߂�";
		mes "�߂��ė����Ƃ����킯�ł��B";
		next;
		cutin "ep19_vellgunde01.png", 1;
		mes "[���F���O���f]";
		mes "��Ȃ��ڂɑ������΂���Ȃ̂�";
		mes "�܂������A���̎q�́c�c�B";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�Ȃ��Ȃ��������邶��Ȃ����B";
		mes "�ł��A�ǂ�����́H";
		mes "���X�K���h�̓�����";
		mes "�����ɂȂ��Ă���݂��������H";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���n�[�������ɂ�";
		mes "�������K�v���Ă��Ƃ��ȁB";
		mes "���v���v�I";
		mes "�����ɐ����̒B�l�����邩��I";
		mes "���A���̂��Ƃ���Ȃ����H";
		next;
		cutin "ep19_vellgunde01.png", 2;
		mes "[���F���O���f]";
		mes "�c�c���n�[���̂��Ƃ�";
		mes "�`���҂ɔC����̂��ǂ������ˁB";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���ƃI�[�����[��";
		mes "���X�n�тɖ߂�܂��B";
		mes "���X�K���h�̖ړI���j�����l�Ȃ�";
		mes "���̏ꏊ���x�����Ă����Ȃ��ƁB";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�`���҂̓��n�[����T���ɍs�����ł�";
		mes "���K���⃉�X�K���h�̓�����";
		mes "�T���ė��Ă����H";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���F���O���f�l��";
		mes "���͎����̐��������肢���܂��B";
		mes "���H�[�N�����f�l��";
		mes "�������Ƌ��ɗ��X�n�т֍s���܂��傤�B";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�`���҂���B";
		mes "�����̉����q�𗊂ނ�B";
		mes "���ꂮ��������͂��Ȃ��łˁB";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�~���A�����֐_�̍����̓�������";
		mes "�u�W���v���c���Ă���͂��ł��B";
		mes "���n�[������ƃ~���A����T���ۂ�";
		mes "�����ڈ�ɂ��Ă��������I";
		next;
		cutin "ep19_leizi01.png", 255;
		cloakonnpc "�I�[�����[#ep20_end01";
		cloakonnpc "���H�[�N�����f#ep20_end";
		cloakonnpc "���F���O���f#ep20_end01";
		cloakonnpc "���C�W�[#ep20_end02";
		chgquest 131258,18221;
		set EP20_1QUE,68;
		mes "�]�֐_�̍��� 01��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�֐_�̍��� 01��";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 32, 70;
		end;
	}
	if(EP20_1QUE == 68) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���ƃI�[�����[��";
		mes "���H�[�N�����f�l�Ƌ���";
		mes "���X�n�тɌ������܂��B";
		mes "���݂��C�����܂��傤�B";
		next;
		cutin "ep19_leon01.png", 255;
		mes "�]�֐_�̍��� 01��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�֐_�̍��� 01��";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 32, 70;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 67 || EP20_1QUE == 68)
		showevent 0, 1, "���I��#ep20_end01";
	end;
}
icas_in.gat,113,228,3	script(CLOAKED)	�I�[�����[#ep20_end01	10465,{/* 3597 (cloaking)*/}
icas_in.gat,115,227,3	script(CLOAKED)	���C�W�[#ep20_end02	10454,{/* 3598 (cloaking)*/}
icas_in.gat,108,228,5	script(CLOAKED)	���H�[�N�����f#ep20_end	10467,{/* 3599 (cloaking)*/}
icas_in.gat,108,225,6	script(CLOAKED)	���F���O���f#ep20_end01	10468,{/* 3600 (cloaking)*/}
icas_in.gat,115,223,1	script(CLOAKED)	�}����#ep20_end01	10376,{/* 3601 (cloaking)*/}

jor_root1.gat,32,75,3	script	�W��#ep20_end01	10429,{/* 3601 */
	if(EP20_1QUE == 68 || EP20_1QUE == 69) {
		unittalk "�~���A���̐� : �������ł��I",1;
		if(!sleep2(1000)) end;
		warp "jor_safty2.gat", 70, 249;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 68 || EP20_1QUE == 69)
		showevent 0, 1, "�W��#ep20_end01";
	end;
}
jor_safty2.gat,66,245,0	warp	safty2_out	1,1,jor_root1.gat,32,70
jor_safty2.gat,75,258,0	script	#ep20_part_end_evt3	139,9,9,{/* 3604 */
	if(EP20_1QUE == 68 || EP20_1QUE == 69) {
		cloakoffnpc "���n�[��#ep20_end01";
		cloakoffnpc "�~���A��#ep20_end01";
	}
	end;
}
jor_safty2.gat,79,257,3	script(CLOAKED)	�~���A��#ep20_end01	10377,{/* 3605 (cloaking)*/
	cutin "ep18_miriam_01.png", 0;
	mes "[�~���A��]";
	mes "�D��ꂽ���~���̐S���̌��Ђ�";
	mes "���������āc�c";
	mes "�o�S�b�g�������Ă���͂��ł���ˁB";
	close2;
	cutin "ep18_miriam_01.png", 255;
	end;
}
jor_safty2.gat,75,258,5	script(CLOAKED)	���n�[��#ep20_end01	10469,{/* 3606 (cloaking)*/
	if(EP20_1QUE == 68) {
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�`���җl�����Ă����������̂ł��ˁI";
		mes "���Ƃ��o�S�b�g�̌������𒲍���������";
		mes "�����ɐ��������̂ł����c�c";
		mes "���̌������̏ꏊ���킩��Ȃ���";
		mes "�����Ă����ł��B";
		next;
		cutin "ep19_lehar03.png", 2;
		mes "[���n�[��]";
		mes "�ȑO�A�����o��������";
		mes "�j�����l�̌�ɂ��ē����o�����̂�";
		mes "���m�Ȉʒu���v���o���Ȃ��āc�c�B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�`���҂����";
		mes "�o�S�b�g�̌������̈ʒu��";
		mes "�o���Ă��܂����H";
		next;
		menu "���m�ɂ͊o���ĂȂ��ł�",-;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�ł͌��o���̂���ꏊ�ɏo��܂�";
		mes "���ĉ�邵���Ȃ������ł��ˁB";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�܂��m�F���Ă��Ȃ��ꏊ��";
		mes "�蕪�����ĒT���܂��傤�B";
		next;
		mes "[���n�[��]";
		mes "�������Ǝv����ꏊ��";
		mes "�u�W���v���c���ė��܂����B";
		mes "�`���җl�́A�֐_�̍��� 01�ɂ���";
		mes "�W���̂���ꏊ���m�F���Ă��������B";
		next;
		cutin "ep19_lehar02.png", 2;
		mes "[���n�[��]";
		mes "���B�́A2�K�𒲂ׂĂ݂܂��B";
		mes "�������I�������";
		mes "�֐_�̍��� ����ō������܂��傤�B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�֐_�̍��� ����̗l�q��";
		mes "�m�F����������ˁB";
		mes "�ł́A��낵�����肢���܂��B";
		next;
		cutin "ep19_lehar01.png", 255;
		chgquest 18221,18222;
		set EP20_1QUE,69;
		mes "�]�W���̂���ꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�W���̂���ꏊ��";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 30, 145;
		end;
	}
	if(EP20_1QUE == 69) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�������Ǝv����ꏊ��";
		mes "�u�W���v���c���ė��܂����B";
		mes "�`���җl�́A�֐_�̍��� 01�ɂ���";
		mes "�W���̂���ꏊ���m�F���Ă��������B";
		next;
		mes "[���n�[��]";
		mes "�������I�������";
		mes "�֐_�̍��� ����ō������܂��傤�B";
		mes "��p�t�ɂ͋C��t���Ă��������ˁB";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "�]�W���̂���ꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�W���̂���ꏊ��";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 30, 145;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 68 || EP20_1QUE == 69)
		showevent 0, 1, "���n�[��#ep20_end01";
	end;
}

jor_root1.gat,25,145,0	script	#ep20_p4_sw_1	139,9,9,{/* 3607 */
	if(EP20_1QUE == 69 || EP20_1QUE == 70)
		cloakoffnpc "�W��#ep20_check01-1";
	end;
}
jor_root1.gat,25,145,3	script(CLOAKED)	�W��#ep20_check01-1	10432,{/* 3608 (cloaking)*/
	if(EP20_1QUE == 69) {
		progressbar 1;	//color=0x0d4dff
		mes "�]�W���̎��͂𒲂ׂĂ݂邪";
		mes "�@�o�S�b�g�̌�������";
		mes "�@�ʂ��铹�ł͂Ȃ��������B";
		mes "�@���̕W��������ꏊ�𒲂ׂĂ݂悤�]";
		next;
		chgquest 18222,18223;
		set EP20_1QUE,70;
		mes "�]���̕W����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̕W����";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 22, 194;
		end;
	}
	if(EP20_1QUE == 70) {
		mes "�]�W���̎��͂𒲂ׂĂ݂邪";
		mes "�@�o�S�b�g�̌�������";
		mes "�@�ʂ��铹�ł͂Ȃ��������B";
		mes "�@���̕W��������ꏊ�𒲂ׂĂ݂悤�]";
		next;
		mes "�]���̕W����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̕W����";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 22, 194;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 69 || EP20_1QUE == 70)
		showevent 0, 1, "�W��#ep20_check01-1";
	end;
}
jor_root1.gat,17,194,0	script	#ep20_p4_sw_2	139,9,9,{/* 3609 */
	if(EP20_1QUE == 70 || EP20_1QUE == 71)
		cloakoffnpc "�W��#ep20_check02-1";
	end;
}
jor_root1.gat,17,194,3	script(CLOAKED)	�W��#ep20_check02-1	10432,{/* 3610 (cloaking)*/
	if(EP20_1QUE == 70) {
		progressbar 1;	//color=0x0d4dff
		mes "�]�W���̎��͂𒲂ׂĂ݂邪";
		mes "�@�o�S�b�g�̌�������";
		mes "�@�ʂ��铹�ł͂Ȃ��������B";
		mes "�@���̕W��������ꏊ�𒲂ׂĂ݂悤�]";
		next;
		chgquest 18223,18224;
		set EP20_1QUE,71;
		mes "�]���̕W����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̕W����";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 278, 69;
		end;
	}
	if(EP20_1QUE == 71) {
		mes "�]�W���̎��͂𒲂ׂĂ݂邪";
		mes "�@�o�S�b�g�̌�������";
		mes "�@�ʂ��铹�ł͂Ȃ��������B";
		mes "�@���̕W��������ꏊ�𒲂ׂĂ݂悤�]";
		next;
		mes "�]���̕W����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̕W����";
		mes "�@���������]";
		close2;
		warp "jor_root1.gat", 278, 69;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 70 || EP20_1QUE == 71)
		showevent 0, 1, "�W��#ep20_check02-1";
	end;
}
jor_root1.gat,278,74,0	script	#ep20_p4_sw_3	139,9,9,{/* 3611 */
	if(EP20_1QUE == 71 || EP20_1QUE == 72)
		cloakoffnpc "�W��#ep20_check03-1";
	end;
}
jor_root1.gat,278,74,3	script(CLOAKED)	�W��#ep20_check03-1	10432,{/* 3612 (cloaking)*/
	if(EP20_1QUE == 71) {
		progressbar 1;	//color=0x0d4dff
		mes "�]�W���̎��͂𒲂ׂĂ݂邪";
		mes "�@�o�S�b�g�̌�������";
		mes "�@�ʂ��铹�ł͂Ȃ��������B";
		mes "�@�W���̂���ꏊ��S�����ׂ��̂�";
		mes "�@�֐_�̍��� ����ɍs����";
		mes "�@���n�[�������ƍ������悤�]";
		next;
		chgquest 18224,18225;
		set EP20_1QUE,72;
		mes "�]�֐_�̍��� �����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�֐_�̍��� �����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 133, 81;
		end;
	}
	if(EP20_1QUE == 72) {
		mes "�]�W���̎��͂𒲂ׂĂ݂邪";
		mes "�@�o�S�b�g�̌�������";
		mes "�@�ʂ��铹�ł͂Ȃ��������B";
		mes "�@�֐_�̍��� ����ɍs����";
		mes "�@���n�[�������ƍ������悤�]";
		next;
		mes "�]�֐_�̍��� �����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�֐_�̍��� �����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 133, 81;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 71 || EP20_1QUE == 72)
		showevent 0, 1, "�W��#ep20_check03-1";
	end;
}
jor_sanct.gat,133,86,0	script	#ep20_p4_sw_4	139,9,9,{/* 3612 */
	if(EP20_1QUE == 72 || EP20_1QUE == 73)
		cloakoffnpc "�W��#ep20_end04";
	end;
}
jor_sanct.gat,133,86,3	script(CLOAKED)	�W��#ep20_end04	10429,{/* 3613 (cloaking)*/
	if(EP20_1QUE == 72) {
		unittalk getcharid(3),strcharinfo(0)+" : �c�c���n�[���H",1;
		if(!sleep2(2000)) end;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "������ł��B";
		mes "�ǂ��ł����A�o�S�b�g�̌�������";
		mes "������܂������H";
		next;
		menu "������Ȃ�����",-;
		mes "[���n�[��]";
		mes "��������c�O�Ȃ���c�c";
		mes "�j�����l�ɓ��ē��𗊂߂���";
		mes "�y�Ȃ�ł����ǁc�c�B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�`���҂���̘b�ɂ���";
		mes "���X�K���h���j�����l��";
		mes "�_���Ă���炵������";
		mes "����͓���ł��傤�ˁB";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�����ł����c�c";
		mes "���̂܂܈��������邵���Ȃ��̂��Ȃ��B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���~���̐S���̌��Ђ̍s�������ł�";
		mes "�m�肽���������ǁc�c�B";
		next;
		menu "���K�������̓����𒲂ׂĂ݂�",-;
		mes "[�~���A��]";
		mes "����A�������ɁB";
		mes "������������A�o�S�b�g�̋��ꏊ��";
		mes "�킩�邩������Ȃ��B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "���X�K���h�̓��������ׂ܂��傤�B";
		mes "���X�댯�ł���";
		mes "��Ԃ�ŋA��킯�ɂ͂����܂��񂩂�I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���́A�����𒲂ׂĂ݂܂��B";
		next;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�Ȃ玄�͐����𒲂ׂ܂��ˁB";
		mes "�`���җl�͒����L��̓�����";
		mes "�m�F���Ă��������B";
		next;
		cutin "ep19_lehar01.png", 255;
		cutin "ep18_miriam_01.png", 255;
		chgquest 18225,18227;
		set EP20_1QUE,73;
		mes "�]�����L���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�����L���";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 150, 202;
		end;
	}
	if(EP20_1QUE == 73) {
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�`���җl�͒����L��̓�����";
		mes "�m�F���Ă��������B";
		next;
		cutin "ep19_lehar01.png", 255;
		mes "�]�����L���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����L���";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 150, 202;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 72 || EP20_1QUE == 73)
		showevent 0, 1, "�W��#ep20_end04";
	end;
}
jor_sanct.gat,150,207,0	script	#ep20_p4_sw_5	139,9,9,{/* 3614 */
	if(EP20_1QUE == 73)
		cloakoffnpc "�勳#ep20_end01";
	end;
}
jor_sanct.gat,150,207,3	script(CLOAKED)	�勳#ep20_end01	10473,{/* 3615 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�勳]";
		mes "�����͐_���Ȃ�ꏊ�I";
		mes "����킵�����݂͏o�Ă����I";
		close;
	}
	if(EP20_1QUE == 73) {
		mes "[�勳]";
		mes "���O���A������ɗ���̂��B";
		mes "���܂����䂪���c�̑�Ƃ�";
		mes "�����������鎞�c�c�B";
		next;
		menu "��ƂƂ́H",-,"�_���Ȑ��тł����t����܂������H",-;
		mes "[�勳]";
		mes "�����Đ_���Ȃ鑶�݁I";
		mes "�����ȃ��������K���h�l��";
		mes "�ėՂ̂��߂̑��݁c�c�B";
		next;
		mes "[�勳]";
		mes "�������ɓ�����";
		mes "���X�K���h�l���������������B";
		mes "��X�͖��͂������ׂ�";
		mes "�������ďW�܂����̂��B";
		next;
		mes "[�勳]";
		mes "���X�K���h�l��";
		mes "�V�����͂���ɓ��ꂽ�łɂ�";
		mes "�������͋F������";
		mes "�����ƈ�ɂȂ�ł��낤�c�c�B";
		next;
		menu "�V�����͂Ƃ́H",-;
		mes "[�勳]";
		mes "���O�͖��H�̉���";
		mes "�����ƘJ���΂��肵�Ă����悤���ȁB";
		mes "�����ɗ��Ė��͂�����ċF��̂��B";
		mes "�o�S�b�g�Ƃ����l�Ԃ������Ă����_����";
		mes "���悢�惉�X�K���h�l�̗͂Ɛ������I";
		next;
		mes "[�勳]";
		mes "��X���K���́A�����N������";
		mes "��Ɍ��΂ꂽ���݁I";
		mes "���X�K���h�l�̈ӎv��";
		mes "�������̈ӎv�ł���A�_�̈ӎv�ł���B";
		next;
		mes "[�勳]";
		mes "�^�̗͂��������A�k��j����I";
		mes "�₽���X�̘S�����瓦��";
		mes "�V���Ȑ��E�ւƗ������I";
		next;
		misceffect 563,"",1;
		mes "[���Ît]";
		mes "�����I�@�����I";
		mes "�嗤�Ɏ����I";
		cloakoffnpc "�勳#ep20_end04";
		cloakoffnpc "�勳#ep20_end05";
		cloakoffnpc "�i��#ep20_end06";
		unittalk getnpcid(0,"�勳#ep20_end04"),"�����I�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end05"),"�����I�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end06"),"�����I�����I",1;
		next;
		misceffect 563,"",1;
		mes "[�勳]";
		mes "�~�_�ėՁI�@�������I";
		mes "�~�_�ėՁI�@�������I";
		cloakoffnpc "�i��#ep20_end07";
		cloakoffnpc "���c��p�t#ep20_end08";
		cloakoffnpc "���c���Ît#ep20_end09";
		unittalk getnpcid(0,"�i��#ep20_end07"),"�����I�@�����I�@�������I",1;
		unittalk getnpcid(0,"���c��p�t#ep20_end08"),"�����I�@�����I�@�������I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end09"),"�����I�@�����I�@�������I",1;
		unittalk getnpcid(0,"�勳#ep20_end04"),"�����I�@�����I�@�������I",1;
		unittalk getnpcid(0,"�勳#ep20_end05"),"�����I�@�����I�@�������I",1;
		unittalk getnpcid(0,"�i��#ep20_end06"),"�����I�@�����I�@�������I",1;
		next;
		misceffect 563,"",1;
		mes "[�i��]";
		mes "�n�C�I�@�n�C�I";
		mes "���̐_�ɂ��V���E���I";
		cloakoffnpc "���c����#ep20_end10";
		cloakoffnpc "���n��p�t#ep20_end11";
		cloakoffnpc "�勳#ep20_end12";
		cloakoffnpc "�勳#ep20_end13";
		unittalk getnpcid(0,"���c����#ep20_end10"),"�C�̌������̑嗤�Ɏ����I�@�V���E���I",1;
		unittalk getnpcid(0,"���n��p�t#ep20_end11"),"�C�̌������̑嗤�Ɏ����I�@�V���E���I",1;
		unittalk getnpcid(0,"�勳#ep20_end12"),"�嗤�Ɏ����I�@�V���E���I",1;
		unittalk getnpcid(0,"�勳#ep20_end13"),"�嗤�Ɏ����I�@�V���E���I",1;
		unittalk getnpcid(0,"�勳#ep20_end04"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end05"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end06"),"�n�C�I�@�n�C�I",1;
		unittalk getnpcid(0,"�i��#ep20_end07"),"�n�C�I�@�n�C�I�@�������I",1;
		unittalk getnpcid(0,"���c��p�t#ep20_end08"),"�����I�@�����I�@�������I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end09"),"�����I�@�����I�@�������I",1;
		close2;
		misceffect 970,"",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "���Ît#ep20_end02";
		unittalk getnpcid(0,"�勳#ep20_end01"),"�����B",1;
		unittalk getnpcid(0,"���Ît#ep20_end02"),"�����B",1;
		unittalk getnpcid(0,"�i��#ep20_end03"),"�����B",1;
		unittalk getnpcid(0,"�勳#ep20_end04"),"�����B",1;
		unittalk getnpcid(0,"�勳#ep20_end05"),"�����B",1;
		unittalk getnpcid(0,"�i��#ep20_end06"),"�����B",1;
		unittalk getnpcid(0,"�i��#ep20_end07"),"�����B",1;
		if(!sleep2(200)) end;
		unittalk getnpcid(0,"���c��p�t#ep20_end08"),"���̐_�I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end09"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c����#ep20_end10"),"�ėՁI",1;
		unittalk getnpcid(0,"���n��p�t#ep20_end11"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end12"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end13"),"�����I�@�����I",1;
		if(!sleep2(200)) end;
		misceffect 563,"",1;
		cloakoffnpc "���c��p�t#ep20_end14";
		cloakoffnpc "���c���Ît#ep20_end15";
		cloakoffnpc "���c���Ît#ep20_end16";
		if(!sleep2(200)) end;
		unittalk getnpcid(0,"���c��p�t#ep20_end14"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end15"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end16"),"�����I�@�����I",1;
		if(!sleep2(200)) end;
		misceffect 970,"",1;
		cloakoffnpc "�i��#ep20_end17";
		cloakoffnpc "�i��#ep20_end18";
		cloakoffnpc "�i��#ep20_end19";
		cloakoffnpc "�i��#ep20_end20";
		unittalk getnpcid(0,"�i��#ep20_end17"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end18"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end19"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end20"),"�����I�@�����I",1;
		if(!sleep2(1000)) end;
		misceffect 970,"",1;
		unittalk getnpcid(0,"�勳#ep20_end01"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���Ît#ep20_end02"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end03"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end04"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end05"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end06"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end07"),"�����I�@�����I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"���c��p�t#ep20_end08"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end09"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c����#ep20_end10"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���n��p�t#ep20_end11"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end12"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end13"),"�����I�@�����I",1;
		if(!sleep2(1000)) end;
		misceffect 970,"",1;
		unittalk getnpcid(0,"���c��p�t#ep20_end14"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end15"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end16"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end17"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end18"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end19"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end20"),"�����I�@�����I",1;
		if(!sleep2(1000)) end;
		misceffect 970,"",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�勳#ep20_end01"),"�����I",1;
		unittalk getnpcid(0,"���Ît#ep20_end02"),"�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end03"),"�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end04"),"�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end05"),"�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end06"),"�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end07"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c��p�t#ep20_end08"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end09"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c����#ep20_end10"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���n��p�t#ep20_end11"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end12"),"�����I�����I",1;
		unittalk getnpcid(0,"�勳#ep20_end13"),"�����I�����I",1;
		unittalk getnpcid(0,"���c��p�t#ep20_end14"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end15"),"�����I�@�����I",1;
		unittalk getnpcid(0,"���c���Ît#ep20_end16"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end17"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end18"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end19"),"�����I�@�����I",1;
		unittalk getnpcid(0,"�i��#ep20_end20"),"�����I�@�����I",1;
		if(!sleep2(1000)) end;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�`���җl�I";
		mes "�����������̑����ł����H";
		mes "�S���c�c�܂Ƃ�����Ȃ��I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�܂�ŔM�ɕ������ꂽ�悤�Ɂc�c�I";
		mes "��������A�����𗣂ꂽ�����c�c�B";
		next;
		cutin "ep19_lehar01.png", 255;
		misceffect 970,"",1;
		if(!sleep2(200)) end;
		misceffect 563,"",1;
		if(!sleep2(200)) end;
		cutin "ep20_nyar02.png", 1;
		mes "[�j����]";
		mes "�E���F���b�I�I";
		unittalk getnpcid(0,"�勳#ep20_end01"),"�_���Ȑ��сI",1;
		unittalk getnpcid(0,"���Ît#ep20_end02"),"�_���Ȑ��сI",1;
		unittalk getnpcid(0,"�i��#ep20_end03"),"�_���Ȑ��сI",1;
		unittalk getnpcid(0,"�勳#ep20_end04"),"�_���Ȑ��сI",1;
		unittalk getnpcid(0,"�勳#ep20_end05"),"�_���Ȑ��сI",1;
		unittalk getnpcid(0,"�i��#ep20_end06"),"�_���Ȑ��сI",1;
		close2;
		cutin "ep20_nyar02.png", 255;
		misceffect 885,"",1;
		cloakonnpc "�勳#ep20_end01";
		cloakonnpc "���Ît#ep20_end02";
		cloakonnpc "�i��#ep20_end03";
		cloakonnpc "�勳#ep20_end04";
		cloakonnpc "�勳#ep20_end05";
		cloakonnpc "�i��#ep20_end06";
		cloakonnpc "�i��#ep20_end07";
		cloakonnpc "���c��p�t#ep20_end08";
		cloakonnpc "���c���Ît#ep20_end09";
		cloakonnpc "���c����#ep20_end10";
		cloakonnpc "���n��p�t#ep20_end11";
		cloakonnpc "�勳#ep20_end12";
		cloakonnpc "�勳#ep20_end13";
		cloakonnpc "���c��p�t#ep20_end14";
		cloakonnpc "���c���Ît#ep20_end15";
		cloakonnpc "���c���Ît#ep20_end16";
		cloakonnpc "�i��#ep20_end17";
		cloakonnpc "�i��#ep20_end18";
		cloakonnpc "�i��#ep20_end19";
		cloakonnpc "�i��#ep20_end20";
		chgquest 18227,18228;
		set EP20_1QUE,74;
		warp "jor_twig.gat", 192, 193;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 73)
		showevent 0, 1, "�勳#ep20_end01";
	end;
}
jor_sanct.gat,147,207,6	script(CLOAKED)	���Ît#ep20_end02	21986,{/* 3616 (cloaking)*/}
jor_sanct.gat,156,205,1	script(CLOAKED)	�i��#ep20_end03	10470,{/* 3617 (cloaking)*/}
jor_sanct.gat,147,203,7	script(CLOAKED)	�勳#ep20_end04	10474,{/* 3618 (cloaking)*/}
jor_sanct.gat,151,201,1	script(CLOAKED)	�勳#ep20_end05	10475,{/* 3619 (cloaking)*/}
jor_sanct.gat,155,202,1	script(CLOAKED)	�i��#ep20_end06	10471,{/* 3620 (cloaking)*/}
jor_sanct.gat,143,205,5	script(CLOAKED)	�i��#ep20_end07	10472,{/* 3621 (cloaking)*/}
jor_sanct.gat,144,202,7	script(CLOAKED)	���c��p�t#ep20_end08	21985,{/* 3622 (cloaking)*/}
jor_sanct.gat,157,209,3	script(CLOAKED)	���c���Ît#ep20_end09	21986,{/* 3623 (cloaking)*/}
jor_sanct.gat,140,202,3	script(CLOAKED)	���c����#ep20_end10	21989,{/* 3624 (cloaking)*/}
jor_sanct.gat,143,201,3	script(CLOAKED)	���n��p�t#ep20_end11	21985,{/* 3625 (cloaking)*/}
jor_sanct.gat,146,197,3	script(CLOAKED)	�勳#ep20_end12	10473,{/* 3626 (cloaking)*/}
jor_sanct.gat,150,197,1	script(CLOAKED)	�勳#ep20_end13	10474,{/* 3627 (cloaking)*/}
jor_sanct.gat,154,198,1	script(CLOAKED)	���c��p�t#ep20_end14	21987,{/* 3628 (cloaking)*/}
jor_sanct.gat,159,200,1	script(CLOAKED)	���c���Ît#ep20_end15	21986,{/* 3629 (cloaking)*/}
jor_sanct.gat,142,209,4	script(CLOAKED)	���c���Ît#ep20_end16	21988,{/* 3630 (cloaking)*/}
jor_sanct.gat,158,203,2	script(CLOAKED)	�i��#ep20_end17	10470,{/* 3631 (cloaking)*/}
jor_sanct.gat,148,200,6	script(CLOAKED)	�i��#ep20_end18	10471,{/* 3632 (cloaking)*/}
jor_sanct.gat,141,209,4	script(CLOAKED)	�i��#ep20_end19	10472,{/* 3633 (cloaking)*/}
jor_sanct.gat,154,208,3	script(CLOAKED)	�i��#ep20_end20	10470,{/* 3634 (cloaking)*/}
jor_twig.gat,187,198,0	script	#ep20_p4_sw_6	139,9,9,{/* 3636 */
	//if(EP20_1QUE == 74 || EP20_1QUE == 75)
	//	cloakoffnpc "�j����#ep20end_nyar01";
	//end;
}
jor_twig.gat,187,198,5	script	�j����#ep20end_nyar01	22006,{/* 3637 */
	if(EP20_1QUE == 74) {
		menu "�j�����c�H",-;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�����c�c�����́c�c�H";
		mes "���B�͂������܂�";
		mes "�z��̖{���n�ŉ������ȋV����";
		mes "���Ă����͂��ł����B";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "����͂�������";
		mes "�������Ă����񂾂낤�c�c�H";
		mes "�ǂ��Ȃ��\�����c�c�B";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[�j����]";
		mes "�O���b�A�E���F�G�b�I�I";
		next;
		misceffect 563,"",1;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�h��Ă�!?";
		mes "���A�n�k�ł��傤���H";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�n�k�ł͂Ȃ��ł��I";
		mes "��������ȗ͂̏Փ˂������܂��I";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[�j����]";
		mes "�E�F�E�b�I�I�@�~���A�@�b�I�I";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�j�����l����������A��o�����̂�";
		mes "�֌W������݂����ł��B";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�j�����l�Ɉē����Ă��炢�܂��傤�I";
		mes "�����I";
		next;
		cutin "ep19_lehar05.png", 255;
		chgquest 18228,18229;
		set EP20_1QUE,75;
		mes "�]�j�����̌Ăԕ���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�j�����̌Ăԕ���";
		mes "�@���������]";
		close2;
		warp "jor_twig.gat", 182, 118;
		end;
	}
	if(EP20_1QUE == 75) {
		cutin "ep20_nyar02.png", 1;
		mes "[�j����]";
		mes "�E�F�E�b�I�I�@�~���A�@�b�I�I";
		next;
		cutin "ep20_nyar02.png", 255;
		mes "�]�j�����̌Ăԕ���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�j�����̌Ăԕ���";
		mes "�@���������]";
		close2;
		warp "jor_twig.gat", 182, 118;
		end;
	}
	unittalk "�j���� : �~���H��",1;
	end;
OnQuestInfo:
	if(EP20_1QUE == 74 || EP20_1QUE == 75)
		showevent 0, 1, "�j����#ep20end_nyar01";
	end;
}
jor_twig.gat,180,123,0	script	#ep20_p4_sw_7	139,9,9,{/* 3638 */
	if(EP20_1QUE == 75 || EP20_1QUE == 76)
		cloakoffnpc "�j����#ep20end_nyar02";
	end;
}
jor_twig.gat,180,123,1	script(CLOAKED)	�j����#ep20end_nyar02	22006,{/* 3639 (cloaking)*/
	if(EP20_1QUE == 75) {
		unittalk "�j���� : �E�F�I�H�b�I�@�E�F�I�b�I",1;
		if(!sleep2(500)) end;
		cloakoffnpc "���n�[��#ep20_end02";
		cloakoffnpc "�~���A��#ep20_end02";
		if(!sleep2(500)) end;
		cutin "ep19_lehar01.png", 2;
		mes "[���n�[��]";
		mes "�c�c�j�����l�H";
		mes "�}�Ɏ~�܂�܂����ˁB";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�N���A���̐�ɂ���݂����B";
		close2;
		cutin "ep20_nyar02.png", 255;
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�j����#ep20end_nyar02"),"�j���� : �E�F�I�I�I���I�@�E�H�I���I",1;
		misceffect 563,"",1;
		cloakoffnpc "�o�S�b�g#ep20_end01";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�o�S�b�g#ep20_end01"),"�o�S�b�g : ������ƁI�@���̔L�͂Ȃɂ��I�@�Ȃ�ŔL���炯�`!?",1;
		unittalk getnpcid(0,"�j����#ep20end_nyar02"),"�j���� : �q���A�A�b�I�@�q���b!!",1;
		if(!sleep2(500)) end;
		misceffect 897,"�o�S�b�g#ep20_end01",1;
		cloakoffnpc "���H�[�N�����f#ep20_end";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�o�S�b�g#ep20_end01"),"�o�S�b�g : �����H�@�Ȃ�ł����A����͂����H",1;
		misceffect 899,"�o�S�b�g#ep20_end01",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"���H�[�N�����f#ep20_end"),"���H�[�N�����f : �悤�₭�S���ł����B�@�������߂ȁB",1;
		if(!sleep2(1500)) end;
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "���H�[�N�����f�l��";
		mes "�o�S�b�g�ł��I";
		next;
		cutin "ep19_lehar05.png", 2;
		mes "[���n�[��]";
		mes "�Ȃ�Ńo�S�b�g��������!?";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�`���҂Ƀ��n�[�����I";
		mes "�����𔛂�̂���`���Ă��傤�����B";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[�o�S�b�g]";
		mes "�A�`�n�n�n�n�n�b�I";
		mes "������o�S�b�g��߂܂�������";
		mes "���Ӗ��`�`���I";
		mes "���ꂩ�炪�n�܂肾����Ȃ��`�I";
		next;
		menu "�ǂ��������ƁH",-;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "���w������D���ė���";
		mes "���~���̐S���̌��Ђ�";
		mes "���X�K���h�����p���Ă���炵���B";
		mes "�����̌����̐��ʂȂ񂾂��Ă��B";
		next;
		cutin "ep18_bagot_01.png", 1;
		mes "[�o�S�b�g]";
		mes "�N�N�N�N�b!!";
		mes "�o�S�b�g�͎��s���Ȃ�������ł���H";
		mes "��������グ�܂������I";
		mes "���̏u�Ԃ�ڌ���������ɂ�";
		mes "���͂�����͂���܂������`��B";
		next;
		mes "[�o�S�b�g]";
		mes "���O�����͂��I";
		mes "�V�����_���}���鏀�������Ȃ������I";
		mes "�o�S�b�g���n��o�����_�̂����I";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "���Ԃ��Ȃ��I";
		mes "�I�[�����[�l�ƃ��I���l��";
		mes "�͂���ɓ��ꂽ���X�K���h��";
		mes "�j�~���Ă���Œ����I";
		next;
		cutin "ep18_miriam_01.png", 2;
		mes "[�~���A��]";
		mes "�{�N�̓��H�[�N�����f�l����`���܂��B";
		mes "�o�S�b�g�ɂ������������Ƃ�����܂��I";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "���n�[���A���O����`���ȁI";
		mes "��������������g������";
		mes "�ڂ𗣂��Ȃ��悤�ɁI";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�`���҂͑��̒��S�ɍs���āI";
		mes "�I�[�����[�l�ƃ��I���l�ɂ�";
		mes "�x�����K�v���I";
		mes "���񂽂ɔC����ȊO�ɂȂ���I";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[�j����]";
		mes "�G�I���I�@�G�I���I";
		next;
		cutin "ep20_nyar03.png", 255;
		cloakonnpc "�o�S�b�g#ep20_end01";
		cloakonnpc "���H�[�N�����f#ep20_end";
		chgquest 18229,18230;
		set EP20_1QUE,76;
		mes "�]���̒��S��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̒��S��";
		mes "�@���������]";
		close2;
		warp "jor_twig.gat", 147, 153;
		end;
	}
	if(EP20_1QUE == 76) {
		cutin "ep20_nyar03.png", 1;
		mes "[�j����]";
		mes "�G�I���I�@�G�I���I";
		next;
		mes "�]���̒��S�֋}�����]";
		cutin "ep20_nyar03.png", 255;
		next;
		mes "�]���̒��S��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̒��S��";
		mes "�@���������]";
		close2;
		warp "jor_twig.gat", 147, 153;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 75 || EP20_1QUE == 76)
		showevent 0, 1, "�j����#ep20end_nyar02";
	end;
}
jor_twig.gat,179,120,7	script(CLOAKED)	���n�[��#ep20_end02	10469,{/* 3640 (cloaking)*/}
jor_twig.gat,184,121,1	script(CLOAKED)	�~���A��#ep20_end02	10377,{/* 3641 (cloaking)*/}
jor_twig.gat,178,126,3	script(CLOAKED)	�o�S�b�g#ep20_end01	10386,{/* 3642 (cloaking)*/}
jor_twig.gat,176,129,3	script(CLOAKED)	���H�[�N�����f#ep20_end	10467,{/* 3643 (cloaking)*/}

jor_twig.gat,142,153,0	script	#ep20_p4_sw_8	139,14,14,{/* 3644 */
	if(EP20_1QUE == 76) {
		cloakoffnpc "�j����#ep20end_nyar03";
		cloakoffnpc "�I�[�����[#ep20_end02";
		cloakoffnpc "���I��#ep20_end02";
		cloakoffnpc "���X�K���h#ep20end_las0";
	}
	if(EP20_1QUE == 77 || EP20_1QUE == 78) {
		cloakoffnpc "�j����#ep20end_nyar03";
		cloakoffnpc "�I�[�����[#ep20_end02";
		cloakoffnpc "���I��#ep20_end02";
	}
	if(EP20_1QUE >= 79) {
		cloakoffnpc "�j����#ep20end_nyar03";
		cloakoffnpc "�I�[�����[#ep20_end02";
		cloakoffnpc "���I��#ep20_end02";
		cloakoffnpc "�������ꂽ����#ep20_md0";
	}
	end;
}
jor_twig.gat,142,153,1	script(CLOAKED)	�j����#ep20end_nyar03	22006,{/* 3645 (cloaking)*/
	if(EP20_1QUE == 76) {
		cloakoffnpc "�I�[�����[#ep20_end02";
		cloakoffnpc "���I��#ep20_end02";
		cloakoffnpc "���X�K���h#ep20end_las0";
		unittalk getnpcid(0,"�j����#ep20end_nyar03"),"�j���� : �n�A�@�b�I",1;
		if(!sleep2(500)) end;
		misceffect 563,"���X�K���h#ep20end_las0",1;
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"���X�K���h#ep20end_las0"),"���X�K���h : �c�c���̒��x���H�@��l�������̉a�ɂȂ�c�c�B",1;
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"�I�[�����[#ep20_end02"),"�I�[�����[ : �j�����l..!",1;
		unittalk getnpcid(0,"���I��#ep20_end02"),"���I�� : �����Ɨ͂��I",1;
		if(!sleep2(1000)) end;
		misceffect 899,"���X�K���h#ep20end_las0",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"���X�K���h#ep20end_las0"),"���X�K���h : ���ʂȑ��~�����c�c�B",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�j����#ep20end_nyar03"),"�j���� : �L���I�H���I",1;
		if(!sleep2(1000)) end;
		misceffect 897,"���X�K���h#ep20end_las0",1;
		unittalk getnpcid(0,"���X�K���h#ep20end_las0"),"���X�K���h : �����҂߁B���̗́c�c�S�ċz�����Ă�����I",1;
		unittalk getnpcid(0,"�j����#ep20end_nyar03"),"�j���� : �L���I�H���I",1;
		if(!sleep2(1000)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(100)) end;
		cloakoffnpc "�j�����̕��g#ep20end_ny";
		if(!sleep2(1000)) end;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		misceffect 57,"�j�����̕��g#ep20end_ny",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"���X�K���h#ep20end_las0"),"���X�K���h : ����́c�c���̂��肾�H",1;
		if(!sleep2(2000)) end;
		unittalk getnpcid(0,"���X�K���h#ep20end_las0"),"���X�K���h : ���ʂȑ��~���ƌ����Ă����!!",1;
		if(!sleep2(500)) end;
		misceffect 899,"���X�K���h#ep20end_las0",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		unittalk getnpcid(0,"�j�����̕��g#ep20end_ny"),"�j���@�I���`�I",1;
		if(!sleep2(1000)) end;
		misceffect 898,"���X�K���h#ep20end_las0",1;
		misceffect 899,"���X�K���h#ep20end_las0",1;
		if(!sleep2(1000)) end;
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "�j�����̕��g#ep20end_ny";
		cloakonnpc "���X�K���h#ep20end_las0";
		chgquest 18230,18231;
		set EP20_1QUE,77;
		end;
	}
	if(EP20_1QUE == 77) {
		unittalk getnpcid(0,"�j����#ep20end_nyar03"),"�j���� : �j���I�I�H�H�H�[",1;
		cloakoffnpc "���I��#ep20_end02";
		cloakoffnpc "�I�[�����[#ep20_end02";
		if(!sleep2(500)) end;
		unittalk getnpcid(0,"���I��#ep20_end02"),"���I�� : �ǂ�����܂������H",1;
		unittalk getnpcid(0,"�I�[�����[#ep20_end02"),"�I�[�����[ : �Ă�?",1;
		end;
	}
	unittalk "�j���� : �~���I�`",1;
	end;
OnQuestInfo:
	if(EP20_1QUE == 76)
		showevent 0, 1, "�j����#ep20end_nyar03";
	end;
}
jor_twig.gat,138,157,5	script(CLOAKED)	���I��#ep20_end02	10464,{/* 3646 (cloaking)*/
	if(EP20_1QUE == 77) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�͂��c�c�͂��c�c";
		mes "���X�K���h���c�c�������H";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�j�����l���A���������悤�ˁc�c";
		mes "�܂����A���~���̐S���̌��Ђ̗͂�";
		mes "�z��������Ȃ�āc�c";
		mes "�o�S�b�g�c�c�Ƃ�ł��Ȃ��z�ˁc�c�B";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[�j����]";
		mes "�G�E�E�D�D���c�c";
		mes "�j�����j�����j�დ";
		mes "�j���j�����A�A�I���c�c";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[�j����]";
		mes "�S�������c�c�S���c�c";
		mes "�E�F�I�b";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����c�c���������d�g�݂Łc�c�B";
		next;
		menu "�j�����l�͂Ȃ�ƁH",-;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���X�K���h��";
		mes "���~���̐S���̌��Ђ̗͂�";
		mes "���S�ɋz������O��";
		mes "���������ƌ����Ă��܂��B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����ǁA���X�K���h�͍���";
		mes "���������K���h�ƌ��E�̖��͂�";
		mes "�z�����悤�Ƃ��Ă����B";
		mes "�c�c���S�ȗZ���̂��߂ɂˁB";
		next;
		cutin "ep20_nyar01.png", 1;
		mes "[�j����]";
		mes "�G���I���c�G�G��";
		mes "�@";
		mes "�]���サ�Ă���悤�Ɍ�����]";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�C�X�K���h�̌��E�̂悤��";
		mes "�ʂ̋�ԂɃ��X�K���h�𕪗����܂�����";
		mes "�������Ă����̂����E������܂��B";
		next;
		menu "�����ł����H",-;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����ꏊ�A�������Ԃ���";
		mes "�قȂ鎟�����Ɛ��������炢�����ȁc�c�B";
		next;
		cutin "ep20_nyar02.png", 1;
		mes "[�j����]";
		mes "�G�I�I�H�H���c�S��";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���~���̐S���̌��Ђ̗͂�";
		mes "���X�K���h�����S�ɗZ������O��";
		mes "�~�߂ė~�����ƌ����Ă܂��B";
		next;
		mes "[���I��]";
		mes "���X�K���h���Z�����ʂ���";
		mes "�������������j���ďo�Ă�����";
		mes "���͂�~�߂���@�͂���܂���B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "���ƃ��I����";
		mes "�j�����l����`��Ȃ���Ȃ�Ȃ��B";
		mes "���X�K���h���~�߂�����";
		mes "�c�c�`���ҁI";
		mes "�M���ɂ���Ă��炤�����Ȃ��B";
		next;
		cutin "ep20_nyar03.png", 1;
		mes "[�j����]";
		mes "�E�F�I���I�E�F�I���I";
		mes "�S�����A�S���S��";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�悵�c�c�j�����l�ƃ��I����";
		mes "�������ꂽ������ێ������ځB";
		mes "����֌q����ʘH�̈ē���";
		mes "�������߂��B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���X�K���h�̗͂�D�����Ƃ�����";
		mes "�W�����Ă��������I";
		mes "���܂͂܂��|���Ȃ��Ă����v�ł��B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "������̏����͂ł��Ă���B";
		mes "�M���̏������I�������";
		mes "���ɘb�������Ă��傤�����B";
		mes "�c�c���������O���B";
		next;
		cutin "ep20_nyar04.png", 1;
		mes "[�j����]";
		mes "�~���b�A�~�����`�G���H��";
		close2;
		cutin "ep20_nyar04.png", 255;
		chgquest 18231,18232;
		set EP20_1QUE,78;
		end;
	}
	if(EP20_1QUE == 78) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�c�c�y�Ȑ킢�ł͂Ȃ��ł��傤�B";
		mes "�M���ł��钇�Ԃ̕�������";
		mes "�ꏏ�ɒ���ł��������B";
		mes "�ē��̓I�[�����[�����܂��B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	if(EP20_1QUE == 79) {
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�����ŉ����������̂�";
		mes "�X�̏�ɖ߂��ă��H�[�N�����f�l��";
		mes "�`���Ă��������B";
		mes "���͂����Ńj�����l��";
		mes "���E��_�����Ă���߂�܂��B";
		close2;
		cutin "ep19_leon01.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 77)
		showevent 0, 1, "���I��#ep20_end02";
	end;
}
jor_twig.gat,135,155,3	script(CLOAKED)	�������ꂽ����#ep20_md0	10046,{/* 3647 (cloaking)*/
	mes "[�C���t�H���[�V����]";
	mes "���Ɂu�������ꂽ����v��";
	mes "�N���A���Ă���L�����N�^�[�́A";
	mes "�p�[�e�B�����o�[�Ƃ���";
	mes "�u�������ꂽ����v��";
	mes "����ł��܂��B";
	next;
	mes "[�C���t�H���[�V����]";
	mes "�p�[�e�B�����o�[�Ƃ���";
	mes "�u�������ꂽ����v��";
	mes "���ꂵ�܂����H";
	next;
	if(select("��߂�","�u�������ꂽ����v����") == 1) {
		mes "�]��߂��]";
		close;
	}
	mes "[�C���t�H���[�V����]";
	mes "�u�������ꂽ����v�֓��ꂵ�܂��B";
	close2;
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "[�C���t�H���[�V����]";
		mes "���Ɂu�������ꂽ����v��";
		mes "�N���A���Ă���L�����N�^�[�́A";
		mes "�p�[�e�B���[�_�[�Ƃ���";
		mes "����ł��܂���B";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE >= 80)
		showevent 0, 1, "�������ꂽ����#ep20_md0";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̓���]";
	end;
}
jor_twig.gat,138,152,7	script(CLOAKED)	�I�[�����[#ep20_end02	10465,{/* 3648 (cloaking)*/
	if(EP20_1QUE == 78) {
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����͂ł����H";
		mes "�M���̏������I��莟��";
		mes "�������ꂽ����֑����B";
		next;
		mes "^e6328c�������A���_���W����";
		mes "�u�������ꂽ����v��";
		mes "�����Ɠ��ꂪ�s���܂��B";
		if(mdopenstate("�������ꂽ����"))
			set '@str$,"^0b0b33�������A���_���W�����֓���";
		else if(getpartyleader(getcharid(1)) == strcharinfo(0))
			set '@str$,"^0b0b33�������A���_���W�����̍쐬";
		next;
		switch(select("^191970��������",'@str$,"^0b0b33���ӎ����̊m�F")) {
		case 1:
			mes "�]���̏�𗣂ꂽ�]";
			close2;
			cutin "ep19_aurelie01.png", 255;
			end;
		case 2:
			if(mdopenstate("�������ꂽ����")) {
				cutin "ep19_aurelie01.png", 0;
				mes "[�I�[�����[]";
				mes "�����͂ł����H";
				next;
				if(select("^191970�����l����","^e6328c�������ꂽ����֌�����") == 2) {
					cutin "ep19_aurelie01.png", 0;
					mes "[�I�[�����[]";
					mes "�ł��Ă̓_����B";
					mes "���ƃ��I�����͓Y�������Ă邩��";
					mes "���X�K���h�͂����ɒE�o�͂ł��Ȃ��B";
					mes "�p�ӂ��ł����琺�������ĂˁB";
					next;
					mes "[�I�[�����[]";
					mes "������������Ȃ�����";
					mes "�j�����l�ɐ��������āB";
					mes "�������邩��B";
					close2;
					cutin "ep19_aurelie01.png", 255;
					end;
				}
				mes "[�I�[�����[]";
				mes "���ꂶ�Ⴀ�A�s���܂��傤�B";
				close2;
				cutin "ep19_aurelie01.png", 255;
				switch(mdenter("�������ꂽ����")) {
				case 0:	// �G���[�Ȃ�
					announce "�������A���_���W����[�������ꂽ����] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")", 0x9, 0x00ff99;
					//warp "1@twas.gat", 94, 71;
					end;
				case 1:	// �p�[�e�B�[������
					mes "^8c32e6�p�[�e�B�[����̂���Ă��邽��";
					mes "����ł��܂���B";
					mes "������x�m�F���Ă���";
					mes "��蒼���Ă��������B";
					close;
				case 2:	// �_���W�������쐬
					mes "^8c32e6�p�[�e�B�[���[�_�[��";
					mes "�������A���_���W������";
					mes "�������Ă��Ȃ���Ԃł��B";
					close;
				default:	// ���̑��G���[
					close;
				}
			}
			else {
				if(getonlinepartymember() < 1) {
					mes "^8c32e6�󔒂̃p�[�e�B�[���ł́A";
					mes "�������A���_���W������";
					mes "�쐬���邱�Ƃ͏o���܂���B";
					close2;
					cutin "ep19_aurelie01.png", 255;
					end;
				}
				mes "�������A���_���W�������쐬���܂����H";
				next;
				if(select("^191970�����l����","^e6328c�쐬����") == 1) {
					cutin "ep19_aurelie01.png", 0;
					mes "[�I�[�����[]";
					mes "���܂莞�Ԃ��Ȃ�����";
					mes "�������߂Ă���邩����H";
					close2;
					cutin "ep19_aurelie01.png", 255;
					end;
				}
				if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
					cutin "ep19_aurelie01.png", 255;
					close;
				}
				mdcreate "�������ꂽ����";
				mes "���p�[�e�B�[��";
				mes "^009eff"+strcharinfo(1)+"^000000";
				mes "���p�[�e�B�[���[�_�[";
				mes "^009eff"+strcharinfo(0)+"^000000";
				mes "�@";
				mes "^006400�������ꂽ�����";
				mes "�쐬�\�����󂯕t���܂����B^000000";
				close2;
				cutin "ep19_aurelie01.png", 255;
				end;
			}
		case 3:
			mes "�ڂ����͂���������m�F���������B";
			mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			messize 180,364;
			close2;
			cutin "ep19_aurelie01.png", 255;
			end;
		}
	}
	if(EP20_1QUE == 79) {
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�������ꂽ����œ���";
		mes "���~���̐S���̌��Ђ����ǁc�c";
		mes "���X�K���h���g�����̂�";
		mes "���̗͂̈ꕔ�̂݁c�c�B";
		next;
		mes "[�I�[�����[]";
		mes "���S�Z�����Ă�����Ǝv����";
		mes "�]�b�Ƃ����ˁB";
		next;
		mes "[�I�[�����[]";
		mes "�Ƃɂ����A���̌��Ђ�";
		mes "�Ԃ��ɍs���Ȃ��ƂˁB";
		mes "�X�̏�ɖ߂�����A���H�[�N�����f��";
		mes "���낢��������Ă����āB";
		next;
		mes "[�I�[�����[]";
		mes "���̓��I���Ƌ���";
		mes "���E����������⋭���Ă���߂��B";
		next;
		cutin "ep19_aurelie01.png", 255;
		chgquest 18233,131259;
		set EP20_1QUE,80;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 70, 121;
		end;
	}
	if(EP20_1QUE == 80) {
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�Ƃɂ����A���̌��Ђ�";
		mes "�Ԃ��ɍs���Ȃ��ƂˁB";
		mes "�X�̏�ɖ߂�����A���H�[�N�����f��";
		mes "���낢��������Ă����āB";
		next;
		mes "[�I�[�����[]";
		mes "���̓��I���Ƌ���";
		mes "���E����������⋭���Ă���߂��B";
		next;
		cutin "ep19_aurelie01.png", 255;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 70, 121;
		end;
	}
	cutin "ep19_aurelie01.png", 0;
	mes "[�I�[�����[]";
	mes "���~���̐S���̌��Ђ̗͂�";
	mes "�z�����邾�Ȃ�āc�c";
	mes "�o�S�b�g�Ƃ����ҁA�q�킶��Ȃ�������B";
	close2;
	cutin "ep19_lehar01.png", 255;
	end;
OnQuestInfo:
	if(EP20_1QUE == 78 || EP20_1QUE == 79 || EP20_1QUE == 80)
		showevent 0, 1, "�I�[�����[#ep20_end02";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̐����Ɠ���]";
	end;
}
jor_twig.gat,140,155,5	script(CLOAKED)	���X�K���h#ep20end_las0	10536,{/* 3649 (cloaking)*/}
jor_twig.gat,140,164,1	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3650 (cloaking)*/}
jor_twig.gat,143,161,3	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3651 (cloaking)*/}
jor_twig.gat,146,158,3	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3652 (cloaking)*/}
jor_twig.gat,149,155,3	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3653 (cloaking)*/}
jor_twig.gat,146,152,1	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3654 (cloaking)*/}
jor_twig.gat,143,149,1	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3655 (cloaking)*/}
jor_twig.gat,140,146,1	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3656 (cloaking)*/}
jor_twig.gat,137,149,7	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3657 (cloaking)*/}
jor_twig.gat,134,152,7	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3658 (cloaking)*/}
jor_twig.gat,130,155,7	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3659 (cloaking)*/}
jor_twig.gat,134,158,5	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3660 (cloaking)*/}
jor_twig.gat,137,161,5	script(CLOAKED)	�j�����̕��g#ep20end_ny	22006,{/* 3661 (cloaking)*/}

icecastle.gat,75,126,3	script	�`�`����#ep20_DQ_4	21515,{/* 3661 */
	if(EP20_1QUE == 80) {
		mes "[�`�`����]";
		mes "���I�@�`���ҁ`!!";
		mes "���H�[�N�����f�l�����҂����Ă����I";
		mes "�����ē�����悤�Ɍ����Ă�I";
		next;
		mes "[�`�`����]";
		mes "���������A����������I";
		close2;
		warp "icecastle.gat", 160, 203;
		end;
	}
	if(EP20_1QUE == 100) {
		if(!checkquest(131263)) {
			mes "[�`�`����]";
			mes "�֐_�̍����Ƃ��ɍs���p������������";
			mes "���Ɍ����āB";
			mes "�ŋ߁A���H�[�N�����f�l��";
			mes "���̏ꏊ�ւ悭�ʂ��Ă邩��";
			mes "������`���Ă���񂾂�B";
			next;
			mes "[�`�`����]";
			mes "�ق�A�`���ҁ`�I";
			mes "�Ñ�̕X�̋��J��������";
			mes "�u�֐_�̍��� �[�����A�v�U����";
			mes "���Ԃ����`�I";
			next;
			mes "[�`�`����]";
			mes "�Ñ�A�C�X�E�B���h�̈��S�̂��߂�";
			mes "�[�����A�̈����z���";
			mes "���炵�߂ė~�����񂾁B";
			mes "���Ԃ������������Ă���Ȃ��H";
			setquest 131263;
			compquest 131263;
		}
		else {
			mes "[�`�`����]";
			mes "�Ñ�A�C�X�E�B���h�̈��S�̂��߂�";
			mes "�[�����A�̈����z���";
			mes "���炵�߂ė~�����񂾁B";
			mes "���Ԃ������������Ă���Ȃ��H";
		}
		while(1) {
			next;
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�֐_�̍��� �[�����A)") == 2) {
				mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
				next;
				if(!checkquest(18234)) {
					mes "[�`�`����]";
					cutin "ep19_iwin03.png", 2;
					mes "�܂��A���肢�𕷂��Ă�����ĂȂ�����";
					mes "���̂܂܌��n�Ɍ������H";
					next;
					if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�֐_�̍��� �[�����A)") == 1)
						break;
					mes "[�`�`����]";
					cutin "ep19_iwin03.png", 2;
					mes "����������B";
					mes "���ꂶ��A���n�ɑ���ˁB";
				}
				else {
					mes "[�`�`����]";
					cutin "ep19_iwin03.png", 2;
					mes "�֐_�̍��� �[�����A���ǂ������āH";
					mes "�Ñ�̕X�̋��J�̐����ɂ����B";
					mes "�Ñ�A�C�X�E�B���h�������S�z������";
					mes "�z����r�X��������C��t���āB";
					mes "�ǂ���Α�������H";
				}
				close2;
				cutin "kafra_01.bmp", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_root3.gat", 367, 129;
				end;
			}
		}
		setarray '@questname$,"�A�[�E�B���̃A�[�E�B���S�z";
		setarray '@questid,18234;
		setarray '@coolid,18235;
		setarray '@gainlist,1001217,10;
		setarray '@explist,1100000000,825000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// �A�[�E�B���̃A�[�E�B���S�z
			if(checkquest(18235)) {
				if(checkquest(18235)&2 == 0) {
					mes "[�`�`����]";
					cutin "ep19_iwin03.png", 2;
					mes "����ŌÑ�A�C�X�E�B���h������";
					mes "����S�ł����ˁB";
					mes "������`���Ă��ꂽ�炢���ȁB";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�A�[�E�B���̃A�[�E�B���S�z^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(18234)) {
				if(checkquest(18234)&4 == 0) {
					mes "[�`�`����]";
					cutin "ep19_iwin03.png", 2;
					mes "^e5555e�N�}���V^000000��";
					mes "^e5555e�����x�E�~�E�V^000000��";
					mes "�e5�C��������Ă���I";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�A�[�E�B���̃A�[�E�B���S�z^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 18234;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�A�[�E�B���̃A�[�E�B���S�z^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�A�[�E�B���̃A�[�E�B���S�z^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>�N�}���V<INFO>https://rotool.gungho.jp/monster/EP20_ICEBEAR</INFO></URL>�@5��";
				mes "�ΏہF<URL>�����x�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>�@5��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 22G ( 22000000000 )";
				mes "��1100000000��20��󂯎��܂��B";
				mes "JobExp 16.5G ( 16500000000 )";
				mes "��825000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�A�[�E�B���̃A�[�E�B���S�z^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 18234;
				setquest 18235;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 1100000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,825000000,0;
				mes "[�`�`����]";
				cutin "ep19_iwin03.png", 2;
				mes "��`�A�����l�I";
				mes "����ŌÑ�̕X�̋��J��";
				mes "�����S�ɂȂ�����I";
				mes "�L�~���Ė{���ɐ�����I";
				mes "�����܂���`���Ă�����ˁH";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 22G";
				mes "( 22000000000 )";
				mes "��1100000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 16.5G";
				mes "( 16500000000 )";
				mes "��825000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[�`�`����]";
			cutin "ep19_iwin03.png", 2;
			mes "�֐_�̍��� �[�����A�ɍs����";
			mes "^e5555e�N�}���V^000000��";
			mes "^e5555e�����x�E�~�E�V^000000��";
			mes "�e5�C��������Ă���I";
			next;
			mes "[�`�`����]";
			cutin "ep19_iwin03.png", 2;
			mes "��������΋ߏ��ɏZ��";
			mes "�Ñ�A�C�X�E�B���h���������S���낤�B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�A�[�E�B���̃A�[�E�B���S�z^000000�v";
			mes "<���e>";
			mes "�ΏہF<URL>�N�}���V<INFO>https://rotool.gungho.jp/monster/EP20_ICEBEAR</INFO></URL>�@5��";
			mes "�ΏہF<URL>�����x�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>�@5��";
			mes "�̓������󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�`�`����]";
				cutin "ep19_iwin03.png", 2;
				mes "���f����́H";
				mes "�������A";
				mes "�Z�����̂ɐ��������Ă��߂�ˁB";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 18234;
			if(checkquest(18235)) delquest 18235;
			mes "[�`�`����]";
			cutin "ep19_iwin03.png", 2;
			mes "���ꂶ��A��낵���I";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�A�[�E�B���̃A�[�E�B���S�z^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 80)
		showevent 0, 1, "�`�`����#ep20_DQ_4";
	else if(EP20_1QUE == 100)
		showevent 0, 3, "�`�`����#ep20_DQ_4";
	end;
}

icas_in2.gat,248,112,0	script	#ep20_pr_endevt	139,1,1,{/* 3663 */
	if(EP20_1QUE == 80) {
		cloakoffnpc "�߂炦��ꂽ�o�S�b�g#ep";
		cloakoffnpc "�}����#ep20_end02";
		cloakoffnpc "�~���A��#ep20_end03";
	}
	end;
}
icas_in2.gat,247,122,3	script(CLOAKED)	�߂炦��ꂽ�o�S�b�g#ep	10386,{/* 3664 (cloaking)*/
	mes "�]���d�ɍS������Ă���]";
	close;
}
icas_in2.gat,253,118,3	script	���H�[�N�����f#ep20_DQ_	10467,{/* 3665 */
	if(EP20_1QUE == 80) {
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�����݂����ŗǂ������B";
		mes "�o�S�b�g�͌䗗�̒ʂ�";
		mes "��������S�����Ă������B";
		mes "���āA���̏ꏊ�ŉ����������̂�";
		mes "�������Ă��炦�邩���H";
		next;
		menu "�������ꂽ���~���̐S���̌��Ђ�������",-;
		mes "[���H�[�N�����f]";
		mes "�c�c����́H";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�����ό`���Ă��܂���";
		mes "���~���̐S���̌��Ђł��B";
		mes "�Z�X�����j���ŕۊǂ��Ă������ł��B";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�Ȃ��A����������Ă�H";
		mes "�܂����c�c���X�K���h�Ɗ��S��";
		mes "�Z�����ĂȂ��������Ă��Ƃ�!?";
		next;
		menu "���S�ɗZ������O�Ɏ��߂���",-;
		cutin "ep18_bagot_02.png", 2;
		mes "[�o�S�b�g]";
		mes "���蓾�Ȃ����I";
		mes "�o�S�b�g�̌v�Z�͊��؂��������I";
		mes "���O���c�c�R��f���Ă�ȁ[�[�[���I";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "���������������Ȃ��c�c";
		mes "�Ƃ肠�����A���ƈꏏ�ɑc���ɋA�낤�B";
		mes "���̊�����n��";
		mes "�悤�₭������΂ł��邼�I";
		mes "�A���ĘS���������y��������";
		next;
		cutin "ep18_bagot_02.png", 0;
		mes "[�o�S�b�g]";
		mes "�����Ɍ����[�[���I";
		mes "�o�S�b�g�𖳎�����Ȃ��[�[�I";
		next;
		cloakoffnpc "���I��#ep20_end03";
		cloakoffnpc "�I�[�����[#ep20_end03";
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "������ɂ�������Ⴂ�܂������B";
		mes "���O���Ă�������";
		mes "���������܂������c�c";
		mes "�F�l�́A���ꂩ��ǂ��Ȃ����܂����H";
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "���C�W�[����̓o�S�b�g��";
		mes "�A�s����邻���ł��B";
		mes "�{�N�ƃ}�����̓��~���̐S���̌��Ђ�";
		mes "���w���Ɏ����ċA��܂��B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "����B���͂Ȃ���B";
		mes "���Ƃ͉�X�Ɏc���ꂽ�d�������c�c�B";
		next;
		cutin "ep18_bagot_02.png", 2;
		mes "[�o�S�b�g]";
		mes "�����I�@�o�S�b�g�𖳎�����Ȃ��I";
		mes "���X�K���h�̓z�͂ǂ��Ȃ����I";
		mes "�����낧�`�`�I";
		next;
		menu "���X�K���h�͓|����",-;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "���Ⴀ�c�c�Q�I���O�Ƃ̎􂢂�";
		mes "�������̂����H";
		mes "���������K���h���c�Ƃ̕��ꉏ��";
		mes "�悤�₭����Łc�c�B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "���S�ɂƂǂ߂��h�����킯�ł�";
		mes "����܂���B";
		mes "�j�����̗͂ňꎞ�I��";
		mes "���n�ɕ��󂵂��󋵂Ȃ�ł��B";
		next;
		cutin "ep18_bagot_01.png", 2;
		mes "[�o�S�b�g]";
		mes "�n�n�I�@�n�n�n�n!!";
		mes "�ق�����I";
		mes "�o�S�b�g�����s�����Ȃ��ł���I";
		next;
		mes "[�o�S�b�g]";
		mes "���X�K���h�����������K���h�̖��͂�";
		mes "���S�ɋz��������A�_�ɂȂ�ł��傤�I";
		mes "�낭�ł��Ȃ����E�Ȃ�";
		mes "�����Ƃ����Ԃɔj���܂��I";
		next;
		mes "[�o�S�b�g]";
		mes "��͂�I";
		mes "�o�S�b�g�͐_��n��グ����ł��I";
		mes "�A�`�`�`�n�n�n�n�n!!";
		mes "�c�c����!?";
		misceffect 899,"�߂炦��ꂽ�o�S�b�g#ep",1;
		next;
		cutin "ep18_miriam_01.png", 0;
		mes "[�~���A��]";
		mes "�c�c�����܂���B";
		mes "���܂�ɂ��邳�������̂�";
		mes "���c�c�B";
		next;
		cutin "ep19_aurelie01.png", 1;
		mes "[�I�[�����[]";
		mes "����A�悭������B";
		mes "�c�c���̃��~���̐S���̌��Ђ�";
		mes "��������Ă��܂����悤������";
		mes "�Z�X�����j���̉����";
		mes "�򉻂��K�v���낤�ˁB";
		next;
		cutin "ep18_maram_01.png", 2;
		mes "[�}����]";
		mes "�킩��܂����B";
		mes "���́c�c����̌���";
		mes "���Ԃ����������̂ł���";
		mes "���������A��`���邱�Ƃ͂���܂����H";
		next;
		cutin "ep19_leizi01.png", 1;
		mes "[���C�W�[]";
		mes "�܂���������Ȗ�肪";
		mes "�c���Ă���݂���������";
		mes "�܂��A���i�̂悤�ɏo���肵�Ȃ���";
		mes "��`���邱�Ƃ�����΂����񂶂�Ȃ��H";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "�������Ă����Ƃ��肪������B";
		mes "�������c�c���X�K���h��";
		mes "�ǂ������������̂��c�c�B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�j�����l��������ێ������";
		mes "���X�K���h�̖��͗Z����";
		mes "�p���I�ɑj�~�������邱�Ƃ��ł����";
		mes "���Z������܂��B";
		next;
		mes "[���I��]";
		mes "���ƃI�[�����[��";
		mes "�j�����l�̖��͂��r�؂�Ȃ��悤��";
		mes "��`���\��ł��B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����킢�ɂȂ邩������Ȃ��B";
		mes "����ł��A���Ȃ���΂ˁB";
		mes "���������i�����Ԗ����Ă����̂�";
		mes "���̎��̂��߂������݂����B";
		next;
		cutin "ep19_leon01.png", 2;
		mes "[���I��]";
		mes "�����A���X�K���h�̗l�q��";
		mes "�C�ɂȂ�l�ł�����";
		mes "�u�����Ȏ}�݂̍菈�v��K�˂ė��Ă��������B";
		mes "�j�����l���҂��Ă����܂�����B";
		next;
		cutin "ep19_voglinde01.png", 0;
		mes "[���H�[�N�����f]";
		mes "���̓��������K���h���c�̎c�}��";
		mes "����₵�Ă��Ƃ��悤���B";
		mes "�`���҂����Ԃ������";
		mes "���݂��Ă��傤�����B";
		next;
		cutin "ep19_aurelie01.png", 0;
		mes "[�I�[�����[]";
		mes "�����܂Ŏ��Ԃ��i�W�����̂�";
		mes "�`���҂���`���Ă��ꂽ�������B";
		mes "���肪�Ƃ��B";
		next;
		cutin "ep19_voglinde01.png", 1;
		mes "[���H�[�N�����f]";
		mes "�悤�₭��]�������ė����B";
		mes "���āA���͎��̐����ׂ����Ƃ�";
		mes "�����Ƃ��悤�B";
		close2;
		cutin "ep19_voglinde01.png", 255;
		cloakonnpc "�}����#ep20_end02";
		cloakonnpc "�~���A��#ep20_end03";
		cloakonnpc "���C�W�[#ep20_end03";
		cloakonnpc "�߂炦��ꂽ�o�S�b�g#ep";
		cloakonnpc "���I��#ep20_end03";
		cloakonnpc "�I�[�����[#ep20_end03";
		if(checkitemblank() == 0) {
			mes "^009eff�y�C���t�H���[�V�����z";
			mes "����ȏ㑽���̎�ނ�";
			mes "�ו��������Ƃ��o���܂���B";
			mes "1�ȏ�̋󂫂�����Ă��������B^000000";
			close2;
			cutin "ep172_beta.bmp", 255;
			end;
		}
		setquest 202425;
		delquest 131259;
		set EP20_1QUE,100;
		getitem 1001217,100;
		for(set '@i,0;'@i<120;set '@i,'@i+1) {
			getexp 2000000000,0,0;
			getexp 0,1400000000,0;
		}
		delitem 12624,1;
		setquest 19158;
		setquest 12589;
		setquest 131261;
		compquest 131261;
		end;
	}
	if(EP20_1QUE == 100) {
		cutin "ep19_voglinde01.png", 2;
		mes "[���H�[�N�����f]";
		mes "�悤�₭��]�������ė����B";
		mes "��������ׂċM���̂������ˁB";
		mes "���āA���͎��̐����ׂ����Ƃ�";
		mes "�����Ƃ��悤�B";
		next;
		mes "[���H�[�N�����f]";
		mes "���K������������₵�ɂ����";
		mes "�����Ă�����H";
		mes "�����A�肪�󂢂Ă���Ȃ�";
		mes "�ꏏ�Ɏ��ɍs��������Ȃ����B";
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�֐_�̍��� 02)") == 2) {
			mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
			next;
			mes "[���H�[�N�����f]";
			cutin "ep19_voglinde01.png", 2;
			mes "�悵�I";
			mes "���ꂶ��A���n�܂ő��낤���ˁI";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_root2j.gat", 25, 17;
			end;
		}
		setarray '@questname$,"���H�[�N�����f�̟r�ō��@","���H�[�N�����f�̟r�ō��A";
		setarray '@questid,18236,18238;
		setarray '@coolid,18237,18239;
		setarray '@gainlist,1000608,10,1000608,10;
		setarray '@explist,400000000,300000000,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// ���H�[�N�����f�̟r�ō��@
			if(checkquest(18237)) {
				if(checkquest(18237)&2 == 0) {
					mes "[���H�[�N�����f]";
					cutin "ep19_voglinde01.png", 2;
					mes "�撣���ē����Ă���Ă��邪�A";
					mes "���K���͑��ς�炸����Ȃ��ȁB";
					mes "�����͂����������x��ł�����B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(18236)) {
				if(checkquest(18236)&4 == 0) {
					mes "[���H�[�N�����f]";
					cutin "ep19_voglinde01.png", 2;
					mes "^e5555e�㋉���K����p�t^000000��";
					mes "^e5555e�㋉���K�����Ît^000000��";
					mes "�e10�C���|���Ă��Ă�����I";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 18236;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>�㋉���K����p�t<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_WARLOCK</INFO></URL>�@10��";
				mes "�ΏہF<URL>�㋉���K�����Ît<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_HEALER</INFO></URL>�@10��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 18236;
				setquest 18237;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[���H�[�N�����f]";
				cutin "ep19_voglinde01.png", 2;
				mes "�I�����̂����H";
				mes "���K�������͑��ς�炸�̂悤���ˁB";
				mes "�{���ɂ���J�l�B";
				mes "��������x��ł�������������H�ׂȁI";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[���H�[�N�����f]";
			cutin "ep19_voglinde01.png", 2;
			mes "�悵�A���X�K���h���o�Ă���Ȃ����̂�����";
			mes "�֐_�̍������Y��ɂ��Ă�낤�B";
			mes "^e5555e�㋉���K����p�t^000000��";
			mes "^e5555e�㋉���K�����Ît^000000��";
			mes "�e10�C���|���Ă��Ă�����I";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
			mes "<���e>";
			mes "�ΏہF<URL>�㋉���K����p�t<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_WARLOCK</INFO></URL>�@10��";
			mes "�ΏہF<URL>�㋉���K�����Ît<INFO>https://rotool.gungho.jp/monster/EP20_RGAN_HEALER</INFO></URL>�@10��";
			mes "�̓������󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[���H�[�N�����f]";
				cutin "ep19_voglinde01.png", 2;
				mes "�ށA���f����̂��H";
				mes "�d�����Ȃ��B";
				mes "�܂��肪�󂢂����ɗ��ނ�I";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 18236;
			if(checkquest(18237)) delquest 18237;
			mes "[���H�[�N�����f]";
			cutin "ep19_voglinde01.png", 2;
			mes "�v��������\��Ă��ȁI";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 1:	// ���H�[�N�����f�̟r�ō��A
			if(checkquest(18239)) {
				if(checkquest(18239)&2 == 0) {
					mes "[���H�[�N�����f]";
					cutin "ep19_voglinde01.png", 2;
					mes "�撣���ē����Ă���Ă��邪�A";
					mes "���K���͑��ς�炸����Ȃ��ȁB";
					mes "�����͂����������x��ł�����B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���H�[�N�����f�̟r�ō��A^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(18238)) {
				if(checkquest(18238)&4 == 0) {
					mes "[���H�[�N�����f]";
					cutin "ep19_voglinde01.png", 2;
					mes "^e5555e���������K���h���c��q^000000��";
					mes "10�C�|���Ă��Ă�����I";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���H�[�N�����f�̟r�ō��A^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 18238;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���H�[�N�����f�̟r�ō��@^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���H�[�N�����f�̟r�ō��A^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>���������K���h���c��q<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_GUARDIAN</INFO></URL>�@10��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���H�[�N�����f�̟r�ō��A^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delquest 18238;
				setquest 18239;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[���H�[�N�����f]";
				cutin "ep19_voglinde01.png", 2;
				mes "�I�����̂����H";
				mes "���K�������͑��ς�炸�̂悤���ˁB";
				mes "�{���ɂ���J�l�B";
				mes "��������x��ł�������������H�ׂȁI";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[���H�[�N�����f]";
			cutin "ep19_voglinde01.png", 2;
			mes "�悵�A���X�K���h���o�Ă���Ȃ����̂�����";
			mes "�֐_�̍������Y��ɂ��Ă�낤�B";
			mes "^e5555e���������K���h���c��q^000000��";
			mes "10�C�|���Ă��Ă�����I";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���H�[�N�����f�̟r�ō��A^000000�v";
			mes "<���e>";
			mes "�ΏہF<URL>���������K���h���c��q<INFO>https://rotool.gungho.jp/monster/EP20_JORGAN_GUARDIAN</INFO></URL>�@10��";
			mes "�̓������󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[���H�[�N�����f]";
				cutin "ep19_voglinde01.png", 2;
				mes "�ށA���f����̂��H";
				mes "�d�����Ȃ��B";
				mes "�܂��肪�󂢂����ɗ��ނ�I";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 18238;
			if(checkquest(18239)) delquest 18239;
			mes "[���H�[�N�����f]";
			cutin "ep19_voglinde01.png", 2;
			mes "�v��������\��Ă��ȁI";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���H�[�N�����f�̟r�ō��A^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
		close;
	}
	end;
OnQuestInfo:
	if(EP20_1QUE == 80)
		showevent 0, 1, "���H�[�N�����f#ep20_DQ_";
	else if(EP20_1QUE == 100) {
		if((!checkquest(18236) && (!checkquest(18237) || checkquest(23111)&0x2) || checkquest(18236) && checkquest(18236)&0x4 == 0) || 
		(!checkquest(18238) && (!checkquest(18239) || checkquest(23111)&0x2) || checkquest(18238) && checkquest(18238)&0x4 == 0))
			showevent 0, 3, "���H�[�N�����f#ep20_DQ_";
	}
	end;
}
icas_in2.gat,246,119,5	script(CLOAKED)	�}����#ep20_end02	10376,{/* 3666 (cloaking)*/}
icas_in2.gat,251,121,3	script(CLOAKED)	�~���A��#ep20_end03	10377,{/* 3667 (cloaking)*/}
icas_in2.gat,252,113,1	script(CLOAKED)	���C�W�[#ep20_end03	10454,{/* 3668 (cloaking)*/}
icas_in2.gat,245,115,7	script(CLOAKED)	���I��#ep20_end03	10464,{/* 3669 (cloaking)*/}
icas_in2.gat,246,112,7	script(CLOAKED)	�I�[�����[#ep20_end03	10465,{/* 3670 (cloaking)*/}

icecastle.gat,106,130,3	script	�R�R�|#ex01	21995,{/* 3670 */
	unittalk "�R�R�| : �s���b�I",1;
	end;
}
icecastle.gat,102,126,4	script	�R�R�|#ex02	21995,{/* 3671 */
	unittalk "�R�R�| : �s���b�I",1;
	end;
}
icecastle.gat,98,123,3	script	�R�R�|#ex03	21995,{/* 3672 */
	unittalk "�R�R�| : �s���b�s���b�s���E�I",1;
	end;
}
icecastle.gat,96,120,14	script	�R�R�|#ex04	21995,{/* 3673 */
	unittalk "�R�R�| : �s���b�I",1;
	end;
}
icecastle.gat,98,115,4	script	�R�R�|#ex05	21995,{/* 3674 */
	unittalk "�R�R�| : �s���b�s���b�s���E�I",1;
	end;
}
icecastle.gat,99,115,3	script	�R�R�|#ex06	21995,{/* 3675 */
	unittalk "�R�R�| : �y�[�G�b�I",1;
	end;
}
icecastle.gat,55,124,3	script	�N�G�X�g�{�[�h#ep20_dq_	857,{/* 3676 */
	mes "������̃N�G�X�g�{�[�h�ł́A";
	mes "�C�X�K���h�Ɋ֘A����";
	mes "�f�C���[�N�G�X�g���܂Ƃ߂Ď󒍁E�񍐂��邱�Ƃ��\�ł��B";
	mes "^e6328c�������A���p����ɂ́A^000000";
	mes "^e6328c�ΏۃN�G�X�g��^000000";
	mes "^e6328c����̎󒍂��ł��钼�O�̏�Ԃ܂ŃN�G�X�g��i�߂�K�v������܂��B^000000";
	mes "^e6328c�@^000000";
	mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
	mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
	messize 270,364;
	next;
	setquest 19168;
	delquest 19168;
	setquest 19170;
	delquest 19170;
	setquest 19171;
	delquest 19171;
	setquest 19172;
	delquest 19172;
	setquest 19173;
	delquest 19173;
	setquest 19174;
	delquest 19174;
	setquest 19175;
	delquest 19175;
	setquest 19176;
	delquest 19176;
	setarray '@questname$,"���F���O���f�̌����ޗ����B","�̂Ă���قǂ̏ꏊ�@","�̂Ă���قǂ̏ꏊ�A","�@���āA�܂��@����","�]�������̊y���������`�^�C��",
						"�①�ɂ��K�v���H","�p���p���ȓ���","�t���[�f���P�̈��","�n�ォ��̉B�ꏈ�T��","���ʂȐ�������",
						"����ґ{��","���H�[�N�����f�̟r�ō��@","���H�[�N�����f�̟r�ō��A","�X�p�C�{��","������̉��",
						"���K���̍���","�A�[�E�B���̃A�[�E�B���S�z","�ՂɂՂɒ������W�@","�ՂɂՂɒ������W�A","����̒��߂Ƀw�r�C�`�S",
						"���̏o�Ȃ������̗Ꭶ","�����肵���炢���ȇ@","�����肵���炢���ȇA","�ւ̖��H�̑|��";
	setarray '@questid, 18130,11831,0,11849,8788,	11852,11854,11813,17651,18139,
						18134,18236,18238,19162,19165,	23110,18234,8855,8857,17718,
						8844,11953,11955,17710;
	setarray '@questid2,0,0,0,11835,0,	0,11858,0,17661,0,
						18136,0,0,19163,19166,	0,0,0,0,0,
						0,0,0,0;
	setarray '@coolid,  18131,11832,0,11850,8789,	11853,11859,11814,17662,18140,
						18137,18237,18239,19164,19167,	23111,18235,8856,8858,17721,
						8845,11954,11956,17711;
	setarray '@itemlist,1000706,3,23228,10,0,0,1000830,10,	1000708,30,0,1000705,5,0,1000707,5,
						0,0,0,0,0,	0,0,1001233,5,1001232,5,0,1001231,5,1001154,3,
						1001244,5,0,0,0;
	setarray '@gainlist,1000608,3,1000608,4,0,0,1000608,2,1000608,2,	1000608,3,1000608,2,1000608,3,1000608,2,1000608,3,
						1000608,2,1000608,10,1000608,10,1001217,3,1001217,3,	1001217,10,1001217,10,1001217,10,1001217,10,1001217,3,
						1001217,10,1001217,10,1001217,10,1001217,10;
	setarray '@explist, 300000000,225000000,600000000,656250000,0,0,225000000,175000000,300000000,225000000,
						300000000,225000000,225000000,175000000,410000000,310000000,375000000,275000000,410000000,310000000,
						225000000,175000000,400000000,300000000,400000000,300000000,400000000,300000000,400000000,300000000,
						400000000,300000000,1100000000,825000000,950000000,712500000,1100000000,825000000,200000000,150000000,
						475000000,356250000,475000000,356250000,475000000,356250000,400000000,300000000;
	// ToDo: quest flag or BaseLevel missmuch
	// [^888888�J�n�������B��^000000] 
	set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
	// �ȉ��ʏ���
	for('@j=0;'@j<getarraysize('@itemlist);'@j++) {
		if('@itemlist['@j] == 0)	// �[�i�����̓X�L�b�v���Ĉ��̔z���
			continue;
		// �I���N�G�X�g�z�񕪉񂵂��̂ŗ��E
		if('@sel == '@k)
			break;
		'@j++;	// �[�i�����ʉ߂���Ƃ��͓��֔�Ԃ̂ł����Œǉ�
		'@k++;
	}
	mes "<<B>�N�G�X�g</B>>";
	mes "�u^ff0000"+'@questname$['@sel]+"^000000�v";
	if('@questid2 > 0) {	// ��b�n�N�G�X�g
		mes "���󒍂��܂����H";
	}
	else if(getquestmaxcount('@questid['@sel]) > 0 && '@itemlist['@j] > 0) {	// ����+�[�i�N�G�X�g
		mes "<���e1>";
		//for('@i=1;'@i<=3;'@i++)
		//	mes "�ΏہF<URL>"+getmobname(getquesttarget('@questid['@sel],'@i))+"<INFO>https://rotool.gungho.jp/monster/"+getmobname2(getquesttarget('@questid['@sel],'@i))+"</INFO></URL>�@"+getquestmaxcount('@questid['@sel],'@i)+"��";
		mes "�̓�����";
		next;
		mes "<���e2>";
		// �Ƃ肠����2�g�̃`�F�b�N�܂łɂ���
		mes "�A�C�e���F<ITEM>["+getitemname('@itemlist['@j])+"]<INFO>"+'@itemlist['@j]+"</INFO></ITEM>�@"+'@itemlist['@j+1]+"��";
		if('@itemlist['@j+2] > 0)	// 2�g�ڂ�ID������̂Ŕ[�i2�i�Ƃ���
			mes "�A�C�e���F<ITEM>["+getitemname('@itemlist['@j+2])+"]<INFO>"+'@itemlist['@j]+"</INFO></ITEM>�@"+'@itemlist['@j+3]+"��";
		mes "�̔[�i��";
		mes "�����̒B���ŕ񍐂��\�ł��B";
		mes "�N�G�X�g���󒍂��܂����H";
	}
	else if(getquestmaxcount('@questid['@sel]) > 0) {	// �����̂݃N�G�X�g
		mes "<���e>";
		//for('@i=1;'@i<=3;'@i++)
		//	mes "�ΏہF<URL>"+getmobname(getquesttarget('@questid['@sel],'@i))+"<INFO>https://rotool.gungho.jp/monster/"+getmobname2(getquesttarget('@questid['@sel],'@i))+"</INFO></URL>�@"+getquestmaxcount('@questid['@sel],'@i)+"��";
		mes "�̓������󒍂��܂����H";
	}
	else if('@itemlist['@j] > 0) {	// �[�i�̂݃N�G�X�g
		mes "<���e>";
		mes "�A�C�e���F<ITEM>["+getitemname('@itemlist['@j])+"]<INFO>"+'@itemlist['@j]+"</INFO></ITEM>�@"+'@itemlist['@j+1]+"��";
		mes "�̔[�i���󒍂��܂����H";
	}
	else {
		mes "^ff0000[�C���t�H���[�V����]^000000";
		mes "^ff0000�����𒆒f���܂����B^000000";
		close2;
		cutin "kafra_01.bmp", 255;
		end;
	}
	next;
	if(select("�󒍂���","��߂�") == 2) {
		mes "^ff0000[�C���t�H���[�V����]^000000";
		mes "^ff0000�����𒆒f���܂����B^000000";
		close2;
		cutin "kafra_01.bmp", 255;
		end;
	}
	setquest '@questid['@sel];
	if(checkquest('@coolid['@sel])) delquest '@coolid['@sel];
	if('@questid['@sel] == 17651)	// �n�ォ��̉B�ꏈ�T��
		getitem 1000842,6;
	mes "<<B>�N�G�X�g</B>>";
	mes "�u^ff0000"+'@questname$['@sel]+"^000000�v";
	mes "���󒍂��܂����B";
	close2;
	cutin "kafra_01.bmp", 255;
	end;
}

jor_sanct.gat,257,115,3	script	�p���X�K���h#ep20_DQ_7	10474,{/* 3681 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�ŏ㋉���K��]";
		mes "�l�Ԃ��I�@�l�Ԃ����ꂽ���I";
		close;
	}
	if(EP20_1QUE == 27) {
		mes "[�p���X�K���h]";
		mes "���_������̂��H";
		next;
		menu "�r�b�N������",-,"�͂�",-;
		mes "[�p���X�K���h]";
		mes "���߂Č���炾�ȁB";
		mes "���܂ł����ƃ��X�K���h�l�̖T��";
		mes "���d�����Ă�������";
		mes "���˂̎҂̊��m��Ȃ��̂��c�c�B";
		next;
		mes "[�p���X�K���h]";
		mes "�c�c���R�̂��Ƃ��I";
		mes "�n�n�n�I";
		mes "����ȏꏊ�ŌȂ̖�����m��Ƃ́I";
		mes "���̋����Ȏ֐_�̍��� ���悩��ł�";
		mes "���𓾂��邩������Ȃ��B";
		next;
		mes "[�p���X�K���h]";
		mes "�����A���Ɠ��_�����悤�B";
		mes "������̃h�������K���h��";
		mes "���ق̍s�̍Œ��Ȃ̂�";
		mes "���_���邱�Ƃ��ł��Ȃ��B";
		next;
		mes "�]�p���X�K���h�̌��ɂ���";
		mes "�@�㋉���K����";
		mes "�@�������肱��������Ă���";
		mes "�@��������炵���]";
		next;
		mes "[�p���X�K���h]";
		mes "���ق̍s�Ƃ����̂�";
		mes "���t�𔭂��Ȃ����Ƃ��̂��̂�";
		mes "�����J���C�s�ɂȂ���̂Łc�c�B";
		next;
		mes "[�p���X�K���h]";
		mes "��������Ă����炩";
		mes "�h�������K���h�͎��̐��b�����Ȃ���";
		mes "���ق̍s������Ă���̂��B";
		next;
		mes "[�p���X�K���h]";
		mes "���̈ӎu�𑸏d����";
		mes "�C�s�𑱂������Ă��邪";
		mes "���̓��X�K���h�l�̋����ɂ���";
		mes "�b���������肪���Ȃ��āA�����c�O���B";
		next;
		mes "�]�ӂ��Ɏ������������B";
		mes "�@�h�������K���h������������Ă���]";
		next;
		mes "�]�ނ͎�����ɐU�����B";
		mes "�@�l�ԂƓ����Ӗ����낤���H�]";
		next;
		mes "[�p���X�K���h]";
		mes "���˂̎҂�B";
		mes "���������K���h���c�ɂ���";
		mes "�ǂꂾ���m���Ă���H";
		next;
		mes "[�p���X�K���h]";
		mes "�����ɂ���Ƃ������Ƃ�";
		mes "���O�̒����S���F�߂�ꂽ�̂��낤�B";
		mes "���R�A��X�̗��j�ɂ��Ă�";
		mes "�m���Ă���͂����B";
		next;
		mes "[�p���X�K���h]";
		mes "���ɏd�v�Ȃ̂�";
		mes "���̎푰�Ƃ͈قȂ�";
		mes "�F�����X�K���h�l�̖��Ⴞ��";
		mes "�������Ƃ��낤�B";
		next;
		mes "[�p���X�K���h]";
		mes "�V���Ď��ʂƌ����̂��ǂ��������Ƃ�";
		mes "�l���邾���ł��ߎS�ł͂Ȃ����H";
		mes "���X�K���h�l�́A���������ꂵ�݂̖���";
		mes "���E�𖲌����񂶂�Ȃ����ȁH";
		next;
		menu "�c�c������������Ȃ��ł���",-;
		mes "[�p���X�K���h]";
		mes "���̃p���X�K���h�́I";
		mes "�@���Ȃ鎞�����X�K���h�l�̐��@��";
		mes "�����T���̏������ł��Ă���B";
		mes "�������I�@���@�𕷂��ɂ��郋�K����";
		mes "�����ɂ͂��Ȃ��I";
		next;
		menu "�������邶�Ⴀ��܂��񂩁H",-;
		mes "[�p���X�K���h]";
		mes "������H�@�������āH";
		mes "���̐��@�𕷂��ɗ������āH";
		mes "�t�t�c�c";
		mes "�t�t�t�A����͂���́I";
		next;
		emotion 56,"�p���X�K���h#ep20_DQ_7",1;
		mes "�]�p���X�K���h�͊���������";
		mes "�@���̏�ŃO���O������������B";
		mes "�@�C�����ǂ��Ȃ����悤���]";
		next;
		mes "[�h�������K���h]";
		mes "�c�c�B";
		emotion 9,"�h�������K���h#ep20_sub",1;
		next;
		mes "�]���ɂ���h�������K���h��";
		mes "�@����������Ă���B";
		mes "�@�u���z�Ɂv�Ƃ����ڂ����]";
		next;
		emotion 0,"�p���X�K���h#ep20_DQ_7",1;
		mes "[�p���X�K���h]";
		mes "�����ƁA����������";
		mes "���O�͒�@���������ƕ����Ă���B";
		mes "�Ȃ�΁A�퓬�ɒ����Ă���ȁH";
		next;
		mes "[�p���X�K���h]";
		mes "�Z�������ׂ̈�";
		mes "<ITEM>[�傫�ȊD�F�̉H��]<INFO>1001244</INFO></ITEM>��";
		mes "�����ė��Ă���Ȃ����H";
		mes "^ff00001��^000000����΂����B";
		mes "^0000ff�Ñ�̕X�̋��J ����^000000�ɂ���";
		mes "^0000ff�O���[�A�C�X�E�B���h^000000�����ɓ��邼�B";
		next;
		mes "[�p���X�K���h]";
		mes "�����s���B";
		mes "���O�ɋ��ی��͂Ȃ��̂��I";
		mes "�G�b�w���B";
		emotion 54,"�h�������K���h#ep20_sub",1;
		chgquest 17701,8843;
		set EP20_1QUE,28;
		close;
	}
	if(EP20_1QUE == 28) {
		if(countitem(1001244) < 1) {
			//������
			mes "[�p���X�K���h]";
			mes "�Z�������ׂ̈�";
			mes "<ITEM>[�傫�ȊD�F�̉H��]<INFO>1001244</INFO></ITEM>��";
			mes "�����ė��Ă���Ȃ����H";
			mes "^ff00001��^000000����΂����B";
			mes "^0000ff�Ñ�̕X�̋��J ����^000000�ɂ���";
			mes "^0000ff�O���[�A�C�X�E�B���h^000000�����ɓ��邼�B";
			next;
			mes "[�p���X�K���h]";
			mes "�����s���B";
			mes "���O�ɋ��ی��͂Ȃ��̂��I";
			mes "�G�b�w���B";
			emotion 54,"�h�������K���h#ep20_sub",1;
			close;
		}
		mes "[�p���X�K���h]";
		mes "�ǂ������̂��A���˂̎҂�B";
		mes "�c�c����H";
		mes "����́c�c";
		mes "<ITEM>[�傫�ȊD�F�̉H��]<INFO>1001244</INFO></ITEM>�I";
		next;
		mes "[�p���X�K���h]";
		mes "���������΁A�N���ɗ���ł������ȁB";
		mes "���O���������B";
		mes "�ǂ�ǂ�c�c";
		mes "���O�̓��������K���h���c�ɂ���";
		mes "�ǂ�قǒm���Ă���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���܂ꂽ�����A�����Ă��c�c�B";
		next;
		mes "[�p���X�K���h]";
		mes "����ǂ���ł͂Ȃ��B";
		mes "���͐��@�������̂��I";
		emotion 9,"�h�������K���h#ep20_sub",1;
		next;
		mes "�]�p���X�K���h�̔w�ォ��";
		mes "�@�h�������K���h������������Ă���]";
		next;
		mes "[�h�������K���h]";
		mes "�c�c�c�B";
		next;
		mes "�]�h�������K���h��";
		mes "�@�u������Ə����ė~�����v";
		mes "�@�Ǝ����𑗂�A�F�����]";
		next;
		mes "[�h�������K���h]";
		mes "�c�c�c�B";
		next;
		mes "�]�h�������K���h�͖ڂ����";
		mes "�@������E�ɐU�����]";
		next;
		mes "�]�h�������K���h��";
		mes "�@�u�ǂ��������ė~�����v";
		mes "�@�Ǝ����𑗂�A�����F�����]";
		next;
		mes "[�h�������K���h]";
		mes "�c�c�c�B";
		next;
		mes "�]�h�������K���h��";
		mes "�@�u�ǂ����I�@�ǂ��������ė~�����v";
		mes "�@�Ǝ����𑗂�A�؎��ɋF�����]";
		next;
		mes "[�h�������K���h]";
		mes "�c�c�c�B";
		next;
		mes "�]�h�������K���h��";
		mes "�@�u�ȂɂƂ��I�@�ǂ��������ė~�����v";
		mes "�@�Ǝ����𑗂�A�K���ɋF�����]";
		next;
		mes "[�h�������K���h]";
		mes "�c�c�c�B";
		next;
		mes "�]�h�������K���h��";
		mes "�@�فX�Ƒ����F���";
		mes "�@�����Ɩڂ��J�����]";
		next;
		menu "�h�������K���h�l�I",-;
		mes "�]�����o�����킯�ł͂Ȃ���";
		mes "�@������̐؎��Ȃ�F���";
		mes "�@�h�������K���h�͗��������悤���B";
		mes "�@�p���X�K���h�̂��A��";
		mes "�@�F��ɑ΂�����𓾂��]";
		next;
		mes "�]�h�������K���h��";
		mes "�@�p���X�K���h�ɖڂ��������B";
		mes "�@����ƁA�b��������ꂽ���̂悤��";
		mes "�@�p���X�K���h��������]";
		next;
		mes "[�p���X�K���h]";
		mes "�ǂ������̂��A�h�������K���h�H";
		next;
		mes "[�h�������K���h]";
		mes "�c�c�B";
		next;
		mes "�]�h�������K���h��";
		mes "�@������������炵�Ă���";
		mes "�@�Ăуp���X�K���h�����߂��]";
		emotion 9,"�h�������K���h#ep20_sub",1;
		next;
		mes "[�p���X�K���h]";
		mes "���ꂩ�c�c";
		mes "�c�c����Ȃ�d�����Ȃ��B";
		next;
		mes "�]�p���X�K���h�́A�l���c�c";
		mes "�@����A���K�����ς�������̂悤��";
		mes "�@���ߐ[�����";
		mes "�@����������߂Ȃ��������]";
		next;
		mes "[�p���X�K���h]";
		mes "���܂͂܂��ڊo�߂ʎ҂�B";
		mes "���͂��ꂩ��ߐ��ɓ���B";
		mes "���̉H���͑厖�Ɏg�����B";
		mes "������m�邱�Ƃ͑厖����";
		mes "���g�̕������厖�ɂ���B";
		next;
		mes "[�p���X�K���h]";
		mes "�T���N�K���h�ɂ����O�̂��Ƃ�";
		mes "�`���Ă������B";
		mes "�����҂�����ƁB";
		mes "���������A�얱�ɓ�����Ȃ����B";
		next;
		mes "�]�h�������K���h�������";
		mes "�@�ނ͖ڂ���ĐÂ����������]";
		next;
		chgquest 8843,8841;
		set EP20_1QUE,29;
		delitem 1001244,1;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 210, 84;
		end;
	}
	if(EP20_1QUE >= 29 && EP20_1QUE < 100) {
		mes "[�p���X�K���h]";
		mes "�T���N�K���h�ɂ����O�̂��Ƃ�";
		mes "�`���Ă������B";
		mes "�����҂�����ƁB";
		mes "���������A�얱�ɓ�����Ȃ����B";
		next;
		mes "�]�h�������K���h�������";
		mes "�@�ނ͖ڂ���ĐÂ����������]";
		if(EP20_1QUE > 29)	//�s��
			close;
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 210, 84;
		end;
	}
	if(EP20_1QUE == 100) {
		mes "[�p���X�K���h]";
		mes "�����A�������B���˂̎҂�B";
		if(checkquest(131264) == 0) {
			next;
			mes "[�h�������K���h]";
			mes "�c�c�c";
			next;
			mes "[�p���X�K���h]";
			mes "�ӂށH";
			mes "�h�������K���h�A�ǂ������H";
			next;
			mes "�]�h�������K���h��";
			mes "�@�p���X�K���h�����낶�댩��B";
			mes "�@�ǂ��������ƂȂ̂��p���X�K���h��";
			mes "�@���������悤���]";
			setquest 131264;
			compquest 131264;
		}
		while(1) {
			next;
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�Ñ�̕X�̋��J ����)") == 2) {
				mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
				next;
				if(!checkquest(8844) && !checkquest(8845)) {
					mes "[�p���X�K���h]";
					mes "�˗��������Ɗm�F����O��";
					mes "���n�Ɍ������Ă����̂��H";
					continue;
				}
				mes "[�p���X�K���h]";
				mes "���n�܂Ō������̂��H";
				mes "�������藊�ނ��B";
				close2;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_back5j.gat", 15, 239;
				end;
			}
			break;
		}
		setarray '@questname$,"���̏o�Ȃ������̗Ꭶ";
		setarray '@questid,8844;
		setarray '@coolid,8845;
		setarray '@itemlist,1001244,5;
		setarray '@gainlist,1001217,10;
		setarray '@explist,475000000,356250000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// ���̏o�Ȃ������̗Ꭶ
			if(checkquest(8845)) {
				if(checkquest(8845)&2 == 0) {
					mes "[�p���X�K���h]";
					mes "�h�������K���h�̎d�����Еt������";
					mes "���_���悤����Ȃ����B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���̏o�Ȃ������̗Ꭶ^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close;
				}
			}
			if(checkquest(8844)) {
				if(checkquest(8844)&4 == 0 || countitem(1001244) < 5) {
					mes "[�p���X�K���h]";
					mes "�Z�������ȃh�������K���h�̑����";
					mes "^e5555e�傫�ȊD�F�̉H��^000000��";
					mes "5�W�߂Ă��Ă���B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���̏o�Ȃ������̗Ꭶ^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close;
					}
					delquest 8844;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000���̏o�Ȃ������̗Ꭶ^000000�v";
					mes "��j�����܂����B";
					close;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���̏o�Ȃ������̗Ꭶ^000000�v";
				mes "<���e1>";
				mes "�ΏہF<URL>�O���[�A�C�X�E�B���h<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>�@10��";
				mes "�̓�����";
				next;
				mes "<���e2>";
				mes "�A�C�e���F<ITEM>�傫�ȊD�F�̉H��<INFO>1001244</INFO></ITEM>�@5��";
				mes "�̔[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 9.5G ( 9500000000 )";
				mes "��475000000��20��󂯎��܂��B";
				mes "JobExp 7.125G ( 7125000000 )";
				mes "��356250000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000���̏o�Ȃ������̗Ꭶ^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close;
				}
				delitem 1001244,5;
				delquest 8844;
				setquest 8845;
				getitem 1001217,10;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 475000000,0,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				getexp 0,356250000,0;
				mes "[�p���X�K���h]";
				mes "���������̂��H";
				mes "�ł́A���Ƌ����̓��_���c�c�B";
				next;
				mes "�]�h�������K���h���f��������o����";
				mes "�@���񂾕��������čs�����B";
				mes "�@�������������ƑގU��������";
				mes "�@�悳�������]";
				next;
				mes "[�p���X�K���h]";
				mes "�����A������ƁI�@���˂̎ҁI";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 9.5G";
				mes "( 9500000000 )";
				mes "��475000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 7.125G";
				mes "( 7125000000 )";
				mes "��356250000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close;
			}
			mes "[�p���X�K���h]";
			mes "�ނ��A�h�������K���h��";
			mes "�����Z�����������珕���Ă����Ȃ����B";
			mes "^e5555e�傫�ȊD�F�̉H��^000000��";
			mes "5�����Ă���΂����B";
			mes "���_�͑��̏㋉���K���Ƃ��ł��邩��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���̏o�Ȃ������̗Ꭶ^000000�v";
			mes "<���e1>";
			mes "�ΏہF<URL>�O���[�A�C�X�E�B���h<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>�@10��";
			mes "�̓�����";
			next;
			mes "<���e2>";
			mes "�A�C�e���F<ITEM>�傫�ȊD�F�̉H��<INFO>1001244</INFO></ITEM>�@5��";
			mes "�̔[�i��";
			mes "�����̒B���ŕ񍐂��\�ł��B";
			mes "�N�G�X�g���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�p���X�K���h]";
				mes "���f���ƁH";
				mes "�܂������A�������z���B";
				next;
				mes "[�h�������K���h]";
				mes "�c�c�B";
				next;
				mes "�]�h�������K���h�͑i����悤�Ȋ��";
				mes "�@����������Ă����c�c�]";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close;
			}
			setquest 8844;
			if(checkquest(8845)) delquest 8845;
			mes "�]�{���Ɍ����J�����̂�";
			mes "�@�h�������K���h�����m��Ȃ��c�c�]";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000���̏o�Ȃ������̗Ꭶ^000000�v";
			mes "���󒍂��܂����B";
			close;
		}
	}
	mes "�]�������ɂ́A�p���͂Ȃ��������]";
	close;
OnQuestInfo:
	if(EP20_1QUE == 27 || EP20_1QUE == 28 || EP20_1QUE == 29)
		showevent 0, 1, "�p���X�K���h#ep20_DQ_7";
	else if(EP20_1QUE == 100 && checkquest(8844)&4 == 0 || countitem(1001244) < 5) {
		showevent 0, 3, "�p���X�K���h#ep20_DQ_7";
	}
	end;
}
jor_sanct.gat,258,117,5	script	�h�������K���h#ep20_sub	10470,{/* 3682 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�㋉���K��]";
		mes "�c�c�c�c�c�c�c�B";
		close;
	}
	if(EP20_1QUE == 100) {	// �s��
		mes "�]�h�������K���h��";
		mes "�@������̋C�z��������ƁA";
		mes "�@�U������ĐÂ��ɔ��΂񂾁]";
		close;
	}
	mes "�]�������ɂ́A�p���͂Ȃ��������]";
	close;
}
jor_sanct.gat,215,84,3	script	�R�~�A�K���h#ep20_sub	10475,{/* 3683 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�ŏ㋉���K��]";
		mes "�l�Ԃ��I�@�l�Ԃ����ꂽ���I";
		close;
	}
	if(EP20_1QUE == 29) {
		mes "[�R�~�A�K���h]";
		mes "������H";
		mes "�����s�s���͂Ȃ����A���ƁH";
		mes "���ށ`�����������ď�������";
		mes "�����G�炵�����Ƃ��o�����̂��H";
		next;
		mes "[�R�~�A�K���h]";
		mes "����A���͑��v���B";
		mes "�����������c�c���X�K���h�l��";
		mes "�����������ꏊ������ȁB";
		next;
		mes "[�R�~�A�K���h]";
		mes "�K�~���o�K���h��";
		mes "�׋��ւ̈ӗ~�����āc�c";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �c�c�c",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�����A�K�~���o�K���h�I";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �����A�͂��I",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�c�c���́A�ǂ��܂Řb�������ȁH";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���c������B�p�Y�u���^�K���h�̘b�ł����B",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�u���^�K���h�H";
		mes "���̘b�́A���̑O����";
		mes "���O�͔���܂ł�������Ȃ����B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�u���^�K���h�̎��ɃX���M�K���h��";
		mes "�~�^�V�K���h�c�c";
		mes "�����ăV�i�~�K���h�c�c�܂ł�";
		mes "�b�������o��������񂾂��H";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �����c�c",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "���������āc�c�Q�Ă��̂��H";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �q�C�b�B",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�Q�Ă��ȁH";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���A�Ⴂ�܂��I",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�n�@�`�c�c";
		mes "�����A�����̂��O�B";
		mes "���˂̎ҁB";
		next;
		if(select("���͂�����","������") == 1) {
			mes "[�R�~�A�K���h]";
			mes "���O�ȊO�ɒN������H";
			mes "�����A���O����A���O�B";
			next;
			menu "�͂��H",-;
		}
		mes "[�R�~�A�K���h]";
		mes "�悵�A�����Ԏ����B";
		mes "�����قǕs�s���͂Ȃ��ƌ�������";
		mes "���ł����B";
		mes "���O�A�����׋����悤�B";
		mes "���������K���̗��j�ɂ��Ă��B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�K�~���o�K���h�A";
		mes "���O�́c�c��łǂ����Ă�낤���c�c";
		mes "���΂炭�A�����Ŕ��Ȃ��Ă��Ȃ����I";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �͂��c",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "���������ǂ������";
		mes "���̐��E�ɐ��܂ꂽ�푰�Ȃ̂���";
		mes "�m���Ă邾��H";
		next;
		mes "[�R�~�A�K���h]";
		mes "�����������̕׋���";
		mes "�e���̈ӗ~�ɔC����Ă������ׂ�";
		mes "�����ɗ��ꂽ�̂ɂ��ւ�炸";
		mes "�K�~���o�K���h�̂悤�Ȏq������B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�����������";
		mes "�K�~���o�K���h�̐ӔC�ł͂Ȃ��B";
		mes "���܂Ŏ��ɏo��Ȃ��������ׂ��B";
		mes "���O�́c�c�����c�c";
		mes "�ߋ��̑��̃��K�������ɂ���";
		mes "���������Ƃ����邩�H";
		next;
		menu "�x���i�K���h�̐��@�͕�����",-;
		mes "[�R�~�A�K���h]";
		mes "�x���i�K���h�I";
		mes "�����c�c�����B";
		mes "�C�������đe�\�ȁc�c";
		mes "�����łȂ��U������邪";
		mes "�{�����ی����̓z����ȁB";
		next;
		mes "[�R�~�A�K���h]";
		mes "���炭���ꂪ�����Ń��X�K���h�l��";
		mes "�z�������ɘA��ė��Ȃ������̂��낤�B";
		next;
		menu "�ڂ�������",-;
		mes "[�R�~�A�K���h]";
		mes "���̉\���������c�c�B";
		next;
		mes "�]�R�~�A�K���h�͏����l�����񂾁]";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �c�c�B",1;
		next;
		mes "�]�R�~�A�K���h�͏����l�����񂾁]";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���������c�c�B",1;
		next;
		mes "�]�K�~���o�K���h��";
		mes "�@�ǂɊ�肩�����Ė����Ă���]";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �X���X���c�c�B",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "���\�O�̘b����";
		mes "���X�K���h�l�̖T�ɂ�";
		mes "�A���C�K���h�Ǝ��Ɓc�c";
		mes "�p���X�K���h�Ƃ����z�������B";
		mes "�c�c����ȊO�ɂ�������������Ȃ��ȁB";
		next;
		mes "[�R�~�A�K���h]";
		mes "�������Ԃ��o��";
		mes "���̋L�����B�����B";
		mes "�Ƃɂ����A���̎��̓��X�K���h�l��";
		mes "���牽�ł�����Ă����B";
		mes "�z����Ǘ�����A�ׂ����ʓ|���܂ŁB";
		next;
		mes "[�R�~�A�K���h]";
		mes "�Â����A�̒��ɐ��܂ꂽ���������܂�";
		mes "���M�����悤�ɂƁB";
		mes "�S�Ă̋������󂯓���Ȃ���";
		mes "���̓��������K���h���c�̈���Ƃ���";
		mes "�ւ�������Ă����B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�₪�āA��n�̖��͂����Ȃ��Ȃ�";
		mes "�勳���w�Ǒ����Ȃ��Ȃ������ɂȂ��";
		mes "���X�K���h�l�͎���s���Ă����d����";
		mes "�������ɔC����悤�ɂȂ����B";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���݂�B",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�Ⴆ�΁A�z����Ɋ����";
		mes "�i�Ղ����炳�ꂽ�肷��d�����B";
		mes "������ł͑z�����ł��Ȃ����Ƃ��B";
		next;
		mes "[�R�~�A�K���h]";
		mes "���ꂩ��́A���X�K���h�l��";
		mes "���ډ���Ƃ�����Ȃ����B";
		mes "�����̃K�~���o�K���h��";
		mes "��x������������Ƃ������ƌ����B";
		mes "���O���������낤�H";
		next;
		menu "�͂�",-,"�����ł�",-;
		mes "[�R�~�A�K���h]";
		mes "���B�͐��܂ꎝ�m����";
		mes "�f�p�i�K���h�̏o���ҋ���ɂ��";
		mes "�i�Ղ�����{�����邱�ƂɂȂ����B";
		mes "�����A�u���^�K���h�͂������";
		mes "�X���M�K���h�̖��O��m��i�Ղ�����";
		mes "�ꕔ�ɉ߂��Ȃ��Ȃ����B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�������͐l�Ԃ����������Ȃ�";
		mes "���@�I�Ȕ\�͂�����̂���";
		mes "�L�^���c���Ƃ������z�͂Ȃ������B";
		mes "���X�K���h�l�����ׂĂ̂��Ƃ�";
		mes "�o���Ă���������������A�Ȃ�����B";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: �X���c�X���c",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�V�i�~�K���h�̌��t��";
		mes "�����X����ׂ��������c�c�B";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���������c",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "���ꂪ�ł��Ă����";
		mes "�x���i�K���h�̂悤�ɑe�\�Ȏq��";
		mes "���܂�邱�Ƃ͖����������낤�ɁB";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���������c",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "���������́c�c";
		mes "���X�K���h�l�͊O���痈���l�Ԃ�����";
		mes "���g��ł��܂�ꂽ�B";
		mes "�ʂ����ēz��͎�������";
		mes "�{���ɏ����Ă����̂��낤���H";
		mes "�������ł���̂ł͂Ȃ����H";
		next;
		mes "[�R�~�A�K���h]";
		mes "�c�c�c";
		mes "���̘b�͕����Ȃ��������Ƃɂ��Ă���B";
		mes "������ƌ��������Ă��܂����B";
		next;
		if(select("���������v���܂�","���������Ă��Ȃ�") == 2) {
			mes "[�R�~�A�K���h]";
			mes "�킩�����A���˂̎q��B";
			mes "�܂��b�𕷂��ɗ��Ȃ����B";
			close;
		}
		mes "[�R�~�A�K���h]";
		mes "�c�c�c�B";
		mes "�@";
		mes "�]�R�~�A�K���h�͌������";
		mes "�@�������l���o�����B";
		mes "�@�₪�ė��ߑ���f���A�b�𑱂����]";
		next;
		mes "[�R�~�A�K���h]";
		mes "�c�c���X�K���h�l���ŋ�";
		mes "�����l���Ă�������̂�����Ȃ��B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�����������X�K���h�l�̖T�ɂ����B";
		mes "�N���o���Ă��Ȃ��ł��낤";
		mes "�V�i�~�K���h��X���M�K���h��������";
		mes "���X�K���h�l�̌��Ɋ҂�̂�";
		mes "���̖ڂŌ����B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�������A�x���i�K���h�̂悤��";
		mes "�c���q�����ɂ���Șb�������";
		mes "����Ȃ��Ƃ������Č����K�v������̂�";
		mes "�ƌ�����B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�c�c�A���C�K���h��";
		mes "����ȏ㎄�����ɂ�";
		mes "�ω������W���Ȃ��ƌ������B";
		mes "�c�c�ǂ������Ӗ��Ȃ̂�";
		mes "���ɂ��������B";
		next;
		mes "[�R�~�A�K���h]";
		mes "�ł́A�������ׂ����낤���H";
		mes "���������H�ׂ�";
		mes "�Q�邾���ł����̂��낤���H";
		mes "���X�K���h�l�̖]�݂�";
		mes "�Ȃ�ł���̂��m��Ȃ��܂܁H";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���݂�B",1;
		next;
		if(select("�K�~���o�K���h�̌���@��","�����Ƃ��Ă���") == 2) {
			mes "[�R�~�A�K���h]";
			mes "�c�c���˂̎q��A�܂���Řb�����B";
			mes "�ǂ��܂Řb�����̂�";
			mes "�Y��Ă��܂�����B";
			close;
		}
		mes "�]�S�������������B";
		mes "�@�K�~���o�K���h�͏n�������]";
		next;
		mes "[�R�~�A�K���h]";
		mes "�c�c�B";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ���������c",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "�K�~���o�K���h��I";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ������I",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "���@�����邼�I";
		unittalk getnpcid(0,"�K�~���o�K���h#ep20_sub"),"�K�~���o�K���h: ��A���ЂƂ�ŕ�����ł����H",1;
		next;
		mes "[�R�~�A�K���h]";
		mes "���̎q�́A�b���\���ɕ������B";
		mes "�͂��c�c�݂�Ȃ��O�̂悤��";
		mes "������Ηǂ������̂Ɂc�c";
		mes "�̘b�𕷂��Ă���Ă��肪�Ƃ��B";
		next;
		chgquest 8841,8842;
		set EP20_1QUE,30;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
	}
	if(EP20_1QUE == 30) {
		mes "[�R�~�A�K���h]";
		mes "�͂��c�c�݂�Ȃ��O�̂悤��";
		mes "������Ηǂ������̂Ɂc�c";
		mes "�̘b�𕷂��Ă���Ă��肪�Ƃ��B";
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 190, 123;
		end;
	}
	mes "�]�R�~�A�K���h�̓K�~���o�K���h��";
	mes "�@�₦�������������Ă���]";
	close;
OnQuestInfo:
	if(EP20_1QUE == 29 || EP20_1QUE == 30)
		showevent 0, 1, "�R�~�A�K���h#ep20_sub";
	end;
}
jor_sanct.gat,218,86,5	script	�K�~���o�K���h#ep20_sub	10471,{/* 3684 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�㋉���K��]";
		mes "�l��!?";
		mes "�ǂ�����Ă����ɁI";
		close;
	}
	mes "[�K�~���o�K���h]";
	mes "�͂������c�c";
	mes "�c�c�B";
	next;
	mes "�]�������܂ܖ����Ă���B";
	mes "�@���ʂقǔ��Ă�݂������]";
	close;
}
jor_sanct.gat,190,128,5	script	�z�V�r�K���h#ep20_sub	10474,{/* 3685 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�ŏ㋉���K��]";
		mes "�l�Ԃ��I�@�l�Ԃ����ꂽ���I";
		close;
	}
	if(EP20_1QUE == 30) {
		mes "[�z�V�r�K���h]";
		mes "�����p���A���˂̎ҁB";
		mes "���̃z�V�r�K���h�͋�Y���Ă���B";
		next;
		mes "[�z�V�r�K���h]";
		mes "����Ȃɂ��������A�̒���";
		mes "�i���ɋ߂��]����";
		mes "����Ȃ���Ȃ�Ȃ����ƁI";
		mes "���ꂪ�䂪�푰�̋ꂵ�݁I";
		next;
		mes "[�z�V�r�K���h]";
		mes "�������A���̂��ׂĂ̋�Y��";
		mes "���X�K���h�l����~����������̂��I";
		mes "���˂̎҂�A���O�͐M���邩�H";
		next;
		menu "�͂��A�͂��H���ł����H",-,"�M���܂�",-;
		mes "[�z�V�r�K���h]";
		mes "���́I";
		mes "���X�K���h�l�̍ő��߂Ƃ��āI";
		mes "���̈Â����A�܂�";
		mes "���X�K���h�l�����A�ꂵ���I";
		next;
		mes "[�z�V�r�K���h]";
		mes "�Ƃ��낪�A���X�K���h�l��";
		mes "�O���痈���l�Ԃ�p���X�K���h";
		mes "�R�~�A�K���h�݂����Ȏ҂Ɉ͂܂�";
		mes "���̃z�V�r�K���h�Ƌ���";
		mes "�l�ԓ����̌v���i�߂邱�Ƃ�";
		mes "�ł����ɂ�����I";
		next;
		mes "[�z�V�r�K���h]";
		mes "���̉��������A�ǂ�����Ηǂ�!?";
		mes "���˂̎҂�A���O�������v��Ȃ����H";
		next;
		if(select("���̒ʂ�ł���܂�","�킩��Ȃ��ł���܂�") == 2) {
			mes "["+strcharinfo(0)+"]";
			mes "�킩��Ȃ��ł���܂��I";
			next;
			mes "[�z�V�r�K���h]";
			mes "�c�c��������ȁB";
			mes "�@";
			mes "�]�z�V�r�K���h�͖œ�����";
			mes "�@����������]";
			close;
		}
		mes "�]�K���ɋ@������邱�Ƃɂ����]";
		unittalk getcharid(3),strcharinfo(0)+" : �܂����������Ă��̒ʂ�c�c�H",1;
		next;
		mes "[�z�V�r�K���h]";
		mes "���������A���ɂ���I";
		mes "�f�p�i�K���h�A�A���C�K���h�݂�����";
		mes "�����҂�����u���ė����ƕ�����";
		mes "���ł����̂ɁI";
		mes "�R�~�A�K���h���t���ė���Ƃ́I";
		next;
		mes "[�z�V�r�K���h]";
		mes "���̃z�V�r�K���h�̔�߂�ꂵ�͂�";
		mes "�o�������Ȃ�";
		mes "���̔��[�҂�����S���ǂ��o��";
		mes "���X�K���h�l�̉E��c�c";
		mes "����I�@���ɏ��ɁI�@���ƂȂ�I";
		next;
		mes "[�z�V�r�K���h]";
		mes "��R����̗͂�";
		mes "�l�Ԃǂ��𐬔s�ł���̂ɁI";
		mes "�������X�K���h�l��";
		mes "�񑩂��ꂽ�����֓������̓���";
		mes "���������Ȃ̂ɁI";
		next;
		mes "[�z�V�r�K���h]";
		mes "�������I";
		mes "���Ə����c�c";
		mes "���������������Ԃ��������Ȃ�I";
		mes "�c�c���O�͍ŏ㋉����Ȃ�����";
		mes "�킩��Ȃ����낤���ȁI";
		next;
		if(select("�ƂĂ��C�ɂȂ�ł���܂��I","�킩��Ȃ��ł���܂�") == 2) {
			mes "["+strcharinfo(0)+"]";
			mes "�킩��Ȃ��ł���܂��I";
			next;
			mes "[�z�V�r�K���h]";
			mes "�c�c��������ȁB";
			mes "�@";
			mes "�]�z�V�r�K���h�͖œ�����";
			mes "�@����������]";
			close;
		}
		mes "�]�C�ɂȂ�U��������]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����ł����H";
		next;
		mes "[�z�V�r�K���h]";
		mes "���O�݂����ȉ��˂̎҂�";
		mes "���R�m��Ȃ��͂����B";
		mes "�E�炷�鎞�Ɋ������S�\���I";
		next;
		mes "[�z�V�r�K���h]";
		mes "�V���������A�Ăё��𓥂ݏo��";
		mes "���̊��G�I";
		mes "�ǂ����A���O�ɂ͂킩��Ȃ����낤�I";
		unittalk getcharid(3),strcharinfo(0)+" : �E��Ƃ��c�c���킟�c�c�I",1;
		next;
		mes "[�z�V�r�K���h]";
		mes "�E�炵�ċ����Ȃ������̗͂�";
		mes "���X�K���h�l�̂��߂̗́I";
		unittalk getcharid(3),strcharinfo(0)+" : �p�`�p�`�p�`�B",1;
		next;
		mes "[�z�V�r�K���h]";
		mes "�c�c�킩���Ă����̂��H";
		mes "���̃z�V�r�K���h�̒����S���I";
		next;
		mes "[�z�V�r�K���h]";
		mes "�������Ȃ��c�c";
		mes "�@";
		mes "�]�z�V�r�K���h��";
		mes "�@�ق�ق�Ɨ܂𗬂����]";
		next;
		mes "[�z�V�r�K���h]";
		mes "�c�c���̓��X�K���h�l�̎��";
		mes "���Z���悭�m���Ă���B";
		mes "�D���Ȃ��̂⌙���Ȃ��̂��m���Ă���B";
		mes "�c�c�C�ɂȂ邩�H";
		next;
		menu "�͂�",-;
		mes "[�z�V�r�K���h]";
		mes "�ӂӁc�c���Ǝv������B";
		mes "�������A�������ɂ͂����Ȃ��B";
		mes "������m�邽�߂�";
		mes "�����ǂꂾ����J�������I";
		next;
		menu "�����Ă�������",-;
		mes "[�z�V�r�K���h]";
		mes "���̒����S�𗝉����Ă��ꂽ���O�ɂ�";
		mes "���ʂɋ����Ă����悤�B";
		mes "���X�K���h�l�͎��́c�c�B";
		next;
		mes "�]�����ɈӊO�Șb�𕷂����B";
		mes "�@�������A���X�K���h��";
		mes "�@�H�������Ƃ����悤��";
		mes "�@���ɗ����Ȃ������������]";
		next;
		mes "[�z�V�r�K���h]";
		mes "�Ӂc�c�ǂ����A���˂̎҂�B";
		mes "���̂悤�ȑf���炵��������m���";
		mes "�܂��܂����X�K���h�l�̂��Ƃ�";
		mes "�D���ɂȂ������낤�B";
		next;
		mes "[�z�V�r�K���h]";
		mes "�Ƃ���Ŏ���";
		mes "<ITEM>[�傫�Ȕ��F�̉H��]<INFO>1001245</INFO></ITEM>�����W���Ă���B";
		mes "^ff00001��^000000�����Ă�����";
		mes "�����Ɛ������������Ă����悤�B";
		mes "�ǂ����A���X�K���h�l�̔閧�c�c�I";
		next;
		menu "���X�K���h�l�́c�c�閧�I",-;
		mes "[�z�V�r�K���h]";
		mes "<ITEM>[�傫�Ȕ��F�̉H��]<INFO>1001245</INFO></ITEM>";
		mes "^ff00001��^000000�������ė��Ă���B";
		mes "^0000ff�Ñ�̕X�̋��J ����^000000�ɂ���";
		mes "���̑��炵��";
		mes "^0000ff�z���C�g�A�C�X�E�B���h^000000������";
		mes "��ɓ���͂����B�����A�s���Ă����I";
		close2;
		chgquest 8842,131255;
		set EP20_1QUE,31;
		end;
	}
	if(EP20_1QUE == 31) {
		if(countitem(1001245) < 1) {
			mes "[�z�V�r�K���h]";
			mes "<ITEM>[�傫�Ȕ��F�̉H��]<INFO>1001245</INFO></ITEM>";
			mes "^ff00001��^000000�������ė��Ă���B";
			mes "^0000ff�Ñ�̕X�̋��J ����^000000�ɂ���";
			mes "���̑��炵��";
			mes "^0000ff�z���C�g�A�C�X�E�B���h^000000������";
			mes "��ɓ���͂����B�����A�s���Ă����I";
			close;
		}
		mes "[�z�V�r�K���h]";
		mes "���̒����S�ɍ��ꍞ��";
		mes "���˂̎҂���Ȃ����I";
		mes "���̎����A���X�K���h�l�̉E��I";
		mes "�z�V�r�K���h!!";
		next;
		menu "�����ł��Ƃ��I",-;
		mes "["+strcharinfo(0)+"]";
		mes "�������A�����ł��Ƃ��I";
		next;
		delitem 1001245,1;
		chgquest 131255,8854;
		set EP20_1QUE,32;
		mes "[�z�V�r�K���h]";
		mes "�悵�I�@����������Ă������O��";
		mes "����ɑ傫�Ȕ閧�������悤�B";
		mes "�Ȃ�ƁI�@���X�K���h�l��";
		mes "����l���Ԃ��x�݂ɂȂ�!!";
		mes "�Ӂc�c�Ȃ�đ����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�͂��H";
		next;
		mes "[�z�V�r�K���h]";
		mes "���܂�̋����Ɍ��t���o�Ȃ����H";
		mes "���������������B";
		next;
		mes "[�z�V�r�K���h]";
		mes "���X�K���h�l������\�Ȃ��Ƃ�";
		mes "�������̂悤�ȑ��݂�";
		mes "�^�����邱�Ƃ���ł��Ȃ��B";
		mes "���ꂮ����^�����悤�Ƃ���Ȃ�B";
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 96, 143;
		end;
	}
	if(EP20_1QUE == 32) {
		mes "[�z�V�r�K���h]";
		mes "���X�K���h�l������\�Ȃ��Ƃ�";
		mes "�������̂悤�ȑ��݂�";
		mes "�^�����邱�Ƃ���ł��Ȃ��B";
		mes "���ꂮ����^�����悤�Ƃ���Ȃ�B";
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 96, 143;
		end;
	}
	mes "[�z�V�r�K���h]";
	mes "���͋@���������c�c";
	mes "���ɋ߂Â��񂶂�Ȃ��c�c�I";
	close;
OnQuestInfo:
	if(EP20_1QUE == 31 && countitem(1001245) < 1)
		showevent 0, 2, "�z�V�r�K���h#ep20_sub";
	else if(EP20_1QUE == 30 || EP20_1QUE == 31 || EP20_1QUE == 32)
		showevent 0, 1, "�z�V�r�K���h#ep20_sub";
	end;
}
jor_sanct.gat,101,138,5	script	�G�����K���h#ep20_sub	10475,{/* 3686 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�ŏ㋉���K��]";
		mes "�����ɐl�Ԃ����邼�I";
		close;
	}
	if(EP20_1QUE == 32) {
		mes "[�G�����K���h]";
		mes "����H�@�ǂ������́H";
		next;
		menu "��`���邱�Ƃ͂���܂��񂩁H",-;
		mes "[�G�����K���h]";
		mes "������H";
		mes "����A���߂Č���q�ˁB";
		next;
		mes "[�G�����K���h]";
		mes "�L�~�A�����ɂ͂ǂ�����ė����́H";
		mes "���X�K���h�l���I�΂ꂽ�킯�ł�";
		mes "�������������c�c";
		mes "�J���̂��߂ɘA��ė���ꂽ�̂ˁH";
		next;
		menu "�������Ǝv���܂�",-;
		mes "[�G�����K���h]";
		mes "�f���Ȏq���ˁB";
		mes "���ށc�c�����ށB";
		next;
		mes "[�G�����K���h]";
		mes "�����I";
		mes "���z�ȃT���N�K���h�I";
		emotion 28,"�G�����K���h#ep20_sub",1;
		next;
		mes "�]�ڂ̑O�̍ŏ㋉���K����";
		mes "�@�����Ȃ�܂𗬂��Ȃ���";
		mes "�@�吺���o�����]";
		next;
		mes "[�G�����K���h]";
		mes "���������ǂ����Ă�����";
		mes "�����̂��m���Ă�H";
		mes "�T���N�K���h���z�V�r�K���h���F";
		mes "���X�K���h�l�̒�������";
		mes "�v���Ă���悤�����ǁc�c�B";
		next;
		mes "[�G�����K���h]";
		mes "�c�c�������̓��X�K���h�l��";
		mes "���ٓ��ɉ߂��Ȃ��B";
		mes "�����ƃ��X�K���h�l�͎�������";
		mes "�K�v�Ȏ��ɐH�ׂ��Ⴄ���߂�";
		mes "�A��ė����ɈႢ�Ȃ���I";
		next;
		mes "[�G�����K���h]";
		mes "�����A�Ȃ�āc�c�B";
		next;
		mes "[�G�����K���h]";
		mes "�Ȃ�đf���炵�����ƂȂ�!!";
		mes "����ȉh���Ȃ��Ƒ��ɂȂ���I";
		next;
		mes "�]�G�����K���h�͂��łɋ����~��";
		mes "�@����ɂ����Ƃ肵���\���";
		mes "�@�΂݂𕂂��ׂĂ���B";
		mes "�@����Ȑ��񂾓��̃��K����";
		mes "�@�������Ƃ��Ȃ��]";
		next;
		mes "[�G�����K���h]";
		mes "�������̓��K����";
		mes "���ׂă��X�K���h�l���琶�܂ꂽ�B";
		mes "���X�K���h�l�̌����琶�܂ꂽ�̂�B";
		next;
		mes "[�G�����K���h]";
		mes "���K���Ƃ́A���X�K���h�l�̌��I";
		mes "���X�K���h�l�ɑ�������́I";
		mes "�����āA�������X�K���h�l�̌���";
		mes "�҂�ׂ����̂�I";
		next;
		mes "[�G�����K���h]";
		mes "�������ɒm��������̂�";
		mes "���X�K���h�l�ɕ����閂�͂�";
		mes "�����ɓ���邽�߂���I";
		next;
		mes "[�G�����K���h]";
		mes "�����ł���H";
		mes "�L�~�́A�ǂ��v���H";
		mes "�@";
		mes "�]���񂾓����L���L��������";
		mes "�@�G�����K���h�������Ă���]";
		next;
		switch(select("�������Ă�̂��A�悭����܂���","�킩��܂�","�Y��Ă��܂��܂���")) {
		case 1:
			mes "[�G�����K���h]";
			mes "����܂��c�c";
			mes "�������K���݂����Ȏ҂�����";
			mes "�H�ׂ�����Ă��N��";
			mes "���Ƃ�����Ȃ����R���l���Ă����B";
			mes "�z�炪�ア����H";
			break;
		case 2:
			mes "[�G�����K���h]";
			mes "�킩��c�c�H";
			mes "�킩���Ăď��A�����o���Ȃ��H";
			mes "���X�K���h�l�ɖ��͂�����邱�Ƃ�";
			mes "���͊j�������Ă���Ƃ�";
			mes "����Ȃ��Ƃł͂Ȃ���H";
			next;
			mes "[�G�����K���h]";
			mes "�������K���݂����Ȏ҂�����";
			mes "�H�ׂ�����Ă��N��";
			mes "���Ƃ�����Ȃ����R���l���Ă����B";
			mes "�z�炪�ア����H";
			break;
		case 3:
			mes "[�G�����K���h]";
			mes "�L�~�̎d���͉��������̂�";
			mes "�o���ĂȂ��́H";
			mes "���̘b��������x�悭�����āB";
			close;
		}
		next;
		mes "[�G�����K���h]";
		mes "�ア����H�ׂĂ������Ƃ�����c�c";
		mes "�������O��H�ׂĂ��\��Ȃ��ł���H";
		next;
		mes "[�G�����K���h]";
		mes "�ł����ꂾ�ƌ������悭�Ȃ��B";
		mes "���O�͎d�����ł���̂�����";
		mes "�����Ă�������K�v���Ȃ��B";
		next;
		mes "�]�G�����K���h�́A�΂����B";
		mes "�@�l�ԂƈႢ�A��Ŋ����ȏ΂݂��]";
		next;
		mes "[�G�����K���h]";
		mes "�ŏ㋉���K���͂Ȃ�";
		mes "��������ɋ�����׋����Ă���H";
		mes "�l���Ă݂����Ƃ͂Ȃ��H";
		next;
		mes "[�G�����K���h]";
		mes "�d���Ŗ��ʂɔ�J����";
		mes "���͂���肭�~�ς����Ă����āc�c";
		mes "���X�K���h�l���]�܂ꂽ";
		mes "�ō��̃^�C�~���O��";
		mes "���̗��ߍ��񂾖��͂�񋟂���B";
		next;
		mes "[�G�����K���h]";
		mes "���o����ۂɎ����čs��";
		mes "���͊j�̂悤�Ɂc�c";
		mes "�ō��́c�c���ٓ��B";
		next;
		mes "[�G�����K���h]";
		mes "�c�c�t�t�t�B";
		mes "�c�c�A�n�n�n�I";
		mes "�L�~�͂ǂ��v���H";
		mes "���̌��h�Ȃ�^���ɂ��āI";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�{���ł����H";
		next;
		mes "[�G�����K���h]";
		mes "���Ŏ����R��f���́H";
		mes "�L�~�������R��f���Ă�Ǝv���Ă�́H";
		mes "�@";
		mes "�]�����̂悤�Ɏv���邪";
		mes "�@�G�����K���h������ł͂Ȃ��������]";
		next;
		menu "�悭����܂���",-,"���̕������͉��Ɓc",-;
		mes "[�G�����K���h]";
		mes "�L�~���c�c����M���Ă��Ȃ��񂾂ˁH";
		mes "���X�K���h�l�̈�ԋ߂��ɂ���";
		mes "���̎���M���Ȃ��H";
		mes "�L�~���z�V�r�K���h�Ɠ�������!!";
		next;
		mes "[�G�����K���h]";
		mes "�L�~�݂����Ȃ̂́A";
		mes "�p�N���ƐH�ׂĂ��܂��������I";
		mes "�@";
		mes "�]�ˑR�A��ъ|���Ă����G�����K���h��";
		mes "�@��̍b�����܂ꂽ�I�]";
		unittalk getcharid(3),strcharinfo(0)+" : �Ƀb!!",1;
		next;
		mes "[�G�����K���h]";
		mes "�c�c�B";
		next;
		mes "[�G�����K���h]";
		mes "�c�c���͏o�Ȃ�������ˁH";
		mes "�c�c���߂�ˁB";
		next;
		mes "[�G�����K���h]";
		mes "�A�n�n�n�c�c";
		mes "�c�c�ǂ����ĒN���M���Ă���Ȃ��́B";
		mes "�@";
		mes "�]�G�����K���h�͂����������Ă��Ȃ��B";
		mes "�@�����΂��Ă邾���������]";
		next;
		chgquest 8854,131256;
		set EP20_1QUE,33;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 261, 155;
		end;
	}
	if(EP20_1QUE >= 33) {
		mes "[�G�����K���h]";
		mes "�c�c�t�t�t�c�c�A�n�n�n�B";
		mes "�@";
		mes "�]�Ăјb�������悤�Ƃ�����";
		mes "�@�G�����K���h�͗܂𗬂��Ȃ���";
		mes "�@�΂��Ă邾���Ŕ����͂Ȃ������]";
		if(EP20_1QUE > 33)	//�s��
			close;
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 261, 155;
		end;
	}
	mes "[�G�����K���h]";
	mes "�c�c�t�t�t�c�c�A�n�n�B";
	close;
OnQuestInfo:
	if(EP20_1QUE == 32 || EP20_1QUE == 33)
		showevent 0, 1, "�G�����K���h#ep20_sub";
	end;
}
jor_sanct.gat,271,156,3	script	�i�V�I���~�K���h#ep20_sub	21529,{/* 3687 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[�������K��]";
		mes "�j���Q����!!!";
		close;
	}
	if(EP20_1QUE == 33) {
		mes "�]���������Ȃ��l�q��";
		mes "�@�ւɂȂ��Ă���";
		mes "�@�������K������������]";
		next;
		if(select("�b��������","�m��Ȃ��ӂ������") == 2) {
			mes "�]�m��Ȃ��ӂ�������]";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�������Ă���́H";
		next;
		mes "[�i�V�I���~�K���h]";
		mes "�c�c�I";
		mes "�i�՗l�����I";
		unittalk getnpcid(0,"�k�J�T�C�J�K���h#ep20_sub"),"�k�J�T�C�J�K���h : �i�՗l�I",1;
		unittalk getnpcid(0,"�I�l�`�����K���h#ep20_sub"),"�I�l�`�����K���h : �i�՗l���������������I",1;
		unittalk getnpcid(0,"�U���_�N�~�K���h#ep20_sub"),"�U���_�N�~�K���h : �i�՗l�I",1;
		next;
		mes "[�i�V�I���~�K���h]";
		mes "�d�����c�c���������B";
		mes "�������A�d�������Ȃ���Ȃ�Ȃ��̂�";
		mes "�d��������܂���B";
		unittalk getnpcid(0,"�I�l�`�����K���h#ep20_sub"),"�I�l�`�����K���h : �s���Ȃ�ł��c",1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���������Ŏd����T���Ηǂ��̂ł́H";
		mes "�|���Ƃ��c�c�B";
		next;
		mes "[�i�V�I���~�K���h]";
		mes "����͎������̌����O�ł��A�i�՗l�B";
		unittalk getnpcid(0,"�k�J�T�C�J�K���h#ep20_sub"),"�k�J�T�C�J�K���h : ���߂Ȃ��Ŏd���������玶���܂��B",1;
		next;
		if(select("�������K���̎d���H","��Ō����Ă����悤") == 2) {
			mes "�]��ł܂�����Ƃ��悤�]";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�i�������K���ɂł������Ȏd���H�j";
		next;
		switch(select("�|��","�z����̂����b","�m�C���[�[�ɂȂ����ŏ㋉���K�����Ԃ߂�")) {
		case 1:
			mes "�]���₵�����������n���Ă݂�B";
			mes "�@�ւ̑����������̂Ȃ��ꏊ��������";
			mes "�@�����͖{���ɁA�����̓��A���]";
			break;
		case 2:
			mes "�]�����ɂ͛z����͂Ȃ��悤���B";
			mes "�@���X�K���h�͂���";
			mes "�@���K���𑝂₷�����";
			mes "�@������������Ȃ��]";
			break;
		case 3:
			mes "�]�ŏ㋉���K���ɂ͕K����l��";
			mes "�@���t���̕����������C������B";
			mes "�@�݂�ȓK���ɂ���Ă邾�낤���]";
			break;
		}
		next;
		menu "�ȑO�͉������Ă����������Ă݂�",-;
		mes "[�i�V�I���~�K���h]";
		mes "�|���ł��B";
		next;
		mes "[�k�J�T�C�J�K���h]";
		mes "�z����̂����b�ł��B";
		next;
		mes "[�N�[�C�i���K���h]";
		mes "�G�����K���h�l�̂����b������";
		mes "�\��ł������K�������܂�āc�c";
		mes "�T���N�K���h�l�ɂ����őҋ@����悤";
		mes "����ꂽ�܂܂ł��B";
		next;
		mes "[�U���_�N�~�K���h]";
		mes "�|���ł��B";
		next;
		mes "[�I�l�`�����K���h]";
		mes "�q�ɊǗ��ł��B";
		next;
		if(select("�d����T���Ă݂�","��Ō����Ă����悤") == 2) {
			mes "�]��ł܂�����Ƃ��悤�]";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�����d����T���Ă��悤�B";
		mes "�����ő҂悤�ɁB";
		unittalk getnpcid(0,"�i�V�I���~�K���h#ep20_sub"),"�i�V�I���~�K���h : �͂��A�i�՗l�I",1;
		unittalk getnpcid(0,"�k�J�T�C�J�K���h#ep20_sub"),"�k�J�T�C�J�K���h : �͂����A�i�՗l�I",1;
		unittalk getnpcid(0,"�I�l�`�����K���h#ep20_sub"),"�I�l�`�����K���h : �́A�͂����A�i�՗l�I",1;
		unittalk getnpcid(0,"�U���_�N�~�K���h#ep20_sub"),"�U���_�N�~�K���h : �͂��I�@�i�՗l�I",1;
		unittalk getnpcid(0,"�N�[�C�i���K���h#ep20_sub"),"�N�[�C�i���K���h : �킩��܂����A�i�՗l�I",1;
		next;
		mes "�]���남�낵�Ă��钆�����K��������";
		mes "�@�d����T�����ƂɂȂ����B";
		mes "�@�u�֐_�̍��� ����v�u�֐_�̍����v��";
		mes "�@�C����ꂻ���Ȏd���������悤�]";
		next;
		chgquest 131256,8846;
		set EP20_1QUE,34;
		mes "�]��Ƃ��K�v�ȏꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]��Ƃ��K�v�ȏꏊ��";
		mes "�@���������]";
		close2;
		switch(EP20_1QUE) {
		case 34: warp "jor_sanct.gat", 53, 159;	break;
		case 35: warp "jor_sanct.gat", 95, 147;	break;
		case 36: warp "jor_root2.gat", 17, 177;	break;
		case 37: warp "jor_root2.gat", 237, 129;	break;
		case 38: warp "jor_root2.gat", 149, 120;	break;
		}
		end;
	}
	if(EP20_1QUE >= 34 && EP20_1QUE <= 38) {
		mes "["+strcharinfo(0)+"]";
		mes "�����d����T���Ă��悤�B";
		mes "�����ő҂悤�ɁB";
		unittalk getnpcid(0,"�i�V�I���~�K���h#ep20_sub"),"�i�V�I���~�K���h : �͂��A�i�՗l�I",1;
		unittalk getnpcid(0,"�k�J�T�C�J�K���h#ep20_sub"),"�k�J�T�C�J�K���h : �͂����A�i�՗l�I",1;
		unittalk getnpcid(0,"�I�l�`�����K���h#ep20_sub"),"�I�l�`�����K���h : �́A�͂����A�i�՗l�I",1;
		unittalk getnpcid(0,"�U���_�N�~�K���h#ep20_sub"),"�U���_�N�~�K���h : �͂��I�@�i�՗l�I",1;
		unittalk getnpcid(0,"�N�[�C�i���K���h#ep20_sub"),"�N�[�C�i���K���h : �킩��܂����A�i�՗l�I",1;
		next;
		mes "�]���남�낵�Ă��钆�����K��������";
		mes "�@�d����T�����ƂɂȂ����B";
		mes "�@�u�֐_�̍��� ����v�u�֐_�̍����v��";
		mes "�@�C����ꂻ���Ȏd���������悤�]";
		next;
		mes "�]��Ƃ��K�v�ȏꏊ��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]��Ƃ��K�v�ȏꏊ��";
		mes "�@���������]";
		close2;
		switch(EP20_1QUE) {
		case 34: warp "jor_sanct.gat", 53, 159;	break;
		case 35: warp "jor_sanct.gat", 95, 147;	break;
		case 36: warp "jor_root2.gat", 17, 177;	break;
		case 37: warp "jor_root2.gat", 237, 129;	break;
		case 38: warp "jor_root2.gat", 149, 120;	break;
		}
		end;
	}
	if(EP20_1QUE == 39) {
		mes "�]�������K�������S����";
		mes "�@�d���������邱�Ƃ��ł����]";
		next;
		mes "[�i�V�I���~�K���h]";
		mes "���B�͂������v�ł��B";
		mes "���������΁A�T���N�K���h�l��";
		mes "�T���Ă����邻���ł��B";
		mes "����ɂȂ��Ă͂������ł����H";
		next;
		chgquest 8851,8840;
		set EP20_1QUE,40;
		mes "�]�T���N�K���h�̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�T���N�K���h�̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 152, 166;
		end;
	}
	if(EP20_1QUE == 40) {
		mes "[�i�V�I���~�K���h]";
		mes "���B�͂������v�ł��B";
		mes "���������΁A�T���N�K���h�l��";
		mes "�T���Ă����邻���ł��B";
		mes "����ɂȂ��Ă͂������ł����H";
		next;
		mes "�]�T���N�K���h�̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�T���N�K���h�̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 152, 166;
		end;
	}
	mes "[�i�V�I���~�K���h]";
	mes "���B�͂������v�ł��B";
	close;
OnQuestInfo:
	if(EP20_1QUE == 33 || EP20_1QUE == 34 || EP20_1QUE == 39 || EP20_1QUE == 40)
		showevent 0, 1, "�i�V�I���~�K���h#ep20_sub";
	end;
}
jor_sanct.gat,264,160,5	script	�k�J�T�C�J�K���h#ep20_sub	21529,{/* 3688 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	if(EP20_1QUE == 35)	//���m�F
		end;
	if(EP20_1QUE == 36) {	//�s��
		mes "[�k�J�T�C�J�K���h]";
		mes "���ׂ������ł���";
		mes "���S���܂����B";
		close;
	}
	mes "[�k�J�T�C�J�K���h]";
	mes "���ׂ����c�c";
	mes "�d����������΁c�c";
	mes "�s���Ȃ�ł��c�c�B";
	close;
}
jor_sanct.gat,266,155,7	script	�I�l�`�����K���h#ep20_sub	21529,{/* 3689 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	if(EP20_1QUE == 35)	//���m�F
		end;
	if(EP20_1QUE == 36) {	//�s��
		mes "[�I�l�`�����K���h]";
		mes "���ׂ������ł���";
		mes "���S���܂����B";
		close;
	}
	mes "[�I�l�`�����K���h]";
	mes "�d���c�c";
	mes "�d�����c�c�B";
	close;
}
jor_sanct.gat,268,160,3	script	�U���_�N�~�K���h#ep20_sub	21529,{/* 3690 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	if(EP20_1QUE == 36)	//�s��
		end;
	if(EP20_1QUE == 37) {
		mes "[�U���_�N�~�K���h]";
		mes "���ׂ������ł���";
		mes "���S���܂����B";
		close;
	}
	mes "[�U���_�N�~�K���h]";
	mes "�d�������������c�c�B";
	close;
}
jor_sanct.gat,267,161,5	script	�N�[�C�i���K���h#ep20_sub	21529,{/* 3691 */
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	if(EP20_1QUE == 37)
		end;
	if(EP20_1QUE == 38) {
		mes "[�N�[�C�i���K���h]";
		mes "���ׂ������ł���";
		mes "���S���܂����B";
		close;
	}
	mes "[�N�[�C�i���K���h]";
	mes "�d���c�c";
	mes "���������c�c�B";
	close;
}
jor_root2.gat,12,172,0	script	safty2-2in	45,1,1,{/* 3692 */
	warp "jor_safty2.gat",199,369;
	end;
OnQuestInfo:
	if(EP20_1QUE == 36)
		showevent 0, 1, "safty2-2in";
	end;
}
jor_safty2.gat,199,371,0	warp	safty2-2out	1,1,jor_root2.gat,14,174
jor_root2.gat,242,124,0	script	safty2-3in	45,1,1,{/* 3694 */
	warp "jor_safty2.gat",297,368;
	end;
OnQuestInfo:
	if(EP20_1QUE == 37)
		showevent 0, 1, "safty2-3in";
	end;
}
jor_safty2.gat,295,369,0	warp	safty2-3out	1,1,jor_root2.gat,240,124
jor_root2.gat,149,125,0	script	safty2-6in	45,1,1,{/* 3696 */
	warp "jor_safty2.gat",310,245;
	end;
OnQuestInfo:
	if(EP20_1QUE == 38)
		showevent 0, 1, "safty2-6in";
	end;
}
jor_safty2.gat,310,243,0	warp	safty2-6out	1,1,jor_root2.gat,149,123

jor_sanct.gat,48,159,3	script	�����܂�#ep20_sub	10046,{/* 3698 */
	if(EP20_1QUE == 34) {
		mes "�]�N���Ǘ����Ă��Ȃ����ꂾ�]";
		next;
		mes "�]�N���Ǘ����Ă��Ȃ����ꂾ�B";
		mes "�@�i�V�I���~�K���h���Ăڂ����H�]";
		next;
		cloakoffnpc "�i�V�I���~�K���h#2";
		mes "[�i�V�I���~�K���h]";
		mes "�i�՗l�I";
		mes "�d�����������芴�ӂ��܂��I";
		mes "�Y��ɂ��܂��I";
		unittalk getnpcid(0,"�i�V�I���~�K���h#2"),"�i�V�I���~�K���h : �y�����I",1;
		next;
		mes "�]�ǂ����Ƃ������悤��";
		mes "�@�ւ炵���C���ɂȂ����B";
		mes "�@���̒������K�������̎d����";
		mes "�@�T���Ă݂悤-";
		next;
		chgquest 8846,8847;
		set EP20_1QUE,35;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 95, 147;
		end;
	}
	if(EP20_1QUE >= 35) {
		mes "�]���̒�����u�����ꂽ���̂悤��";
		mes "�@�����Ă��Ȃ��������܂��Ă���]";
		if(EP20_1QUE > 35)
			close;
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 95, 147;
		end;
	}
	mes "�]���܂��Ă��鐅�͑����Ă��邪";
	mes "�@�����Ă���킯�ł͂Ȃ��悤���]";
	close;
OnQuestInfo:
	if(EP20_1QUE == 34 || EP20_1QUE == 35)
		showevent 0, 1, "�����܂�#ep20_sub";
	end;
}
jor_sanct.gat,95,152,3	script	��#ep20_sub	10046,{/* 3699 */
	if(EP20_1QUE == 35) {
		mes "�]�p�r�͕s������";
		mes "�@����̕��̂ɐo���ς����Ă���]";
		next;
		mes "�]�p�r�͕s������";
		mes "�@����̕��̂ɐo���ς����Ă���B";
		mes "�@�k�J�T�C�J�K���h���Ăڂ����H";
		next;
		cloakoffnpc "�k�J�T�C�J�K���h#2";
		cloakonnpc "�k�J�T�C�J�K���h#ep20_sub";
		mes "[�k�J�T�C�J�K���h]";
		mes "�i�՗l���d���������������I";
		mes "���ӂ��܂��I";
		unittalk getnpcid(0,"�k�J�T�C�J�K���h#2"),"�k�J�T�C�J�K���h : �y�����I",1;
		next;
		mes "�]�ǂ����Ƃ������悤��";
		mes "�@�ւ炵���C���ɂȂ����B";
		mes "�@���̒������K�������̎d����";
		mes "�@�T���Ă݂悤-";
		next;
		chgquest 8847,8848;
		set EP20_1QUE,36;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 17, 177;
		end;
	}
	if(EP20_1QUE >= 36) {
		mes "�]�p�r�͕s������";
		mes "�@����Ȃ���Y��ɂȂ���";
		mes "�@����̕��̂�����]";
		if(EP20_1QUE > 36)
			close;
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 17, 177;
		end;
	}
	mes "�]�p�r�͕s������";
	mes "�@����̕��̂ɐo���ς����Ă���]";
	close;
OnQuestInfo:
	if(EP20_1QUE == 35 || EP20_1QUE == 36)
		showevent 0, 1, "��#ep20_sub";
	end;
}
jor_safty2.gat,195,355,3	script	�S�~�̂ď�#ep20_sub	10046,{/* 3700 */
	if(EP20_1QUE == 36) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "�]���̎p�̂܂܂ł͓s���������]";
			close;
		}
		mes "�]�Œ��ꒃ�ɉ��ꂽ�S�~�̂ďꂾ�]";
		next;
		mes "�]�Œ��ꒃ�ɉ��ꂽ�S�~�̂ďꂾ�B";
		mes "�@�I�l�`�����K���h���Ăڂ����H�]";
		next;
		cloakoffnpc "�I�l�`�����K���h#2";
		cloakonnpc "�I�l�`�����K���h#ep20_sub";
		mes "[�I�l�`�����K���h]";
		mes "�i�՗l�I�@���d���������������I";
		mes "���ӂ��܂��I";
		unittalk getnpcid(0,"�I�l�`�����K���h#2"),"�I�l�`�����K���h : �y�����I",1;
		next;
		chgquest 8848,8849;
		set EP20_1QUE,37;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
	}
	if(EP20_1QUE >= 37) {
		mes "�]���������Y��ɂȂ���";
		mes "�@�S�~�̂ďꂾ�]";
		if(EP20_1QUE > 37)
			close;
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 237, 129;
		end;
	}
	//������
	end;
OnQuestInfo:
	if(EP20_1QUE == 36 || EP20_1QUE == 37)
		showevent 0, 1, "�S�~�̂ď�#ep20_sub";
	end;
}
jor_safty2.gat,303,349,3	script	�R�̂悤�ȃK���N�^#ep20_sub	10046,{/* 3701 */
	if(EP20_1QUE == 37) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "�]���̎p�̂܂܂ł͓s���������]";
			close;
		}
		mes "�]�K���N�^���R�̂悤�ɐς܂�Ă���]";
		next;
		mes "�]�K���N�^���R�̂悤�ɐς܂�Ă���B";
		mes "�@�U���_�N�~�K���h���Ăڂ����H�]";
		next;
		cloakoffnpc "�U���_�N�~�K���h#2";
		cloakonnpc "�U���_�N�~�K���h#ep20_sub";
		mes "[�U���_�N�~�K���h]";
		mes "�i�՗l�I";
		mes "�d�����������芴�ӂ��܂��I";
		unittalk getnpcid(0,"�U���_�N�~�K���h#2"),"�U���_�N�~�K���h : �y�����I",1;
		next;
		chgquest 8849,8850;
		set EP20_1QUE,38;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 149, 120;
		end;
	}
	if(EP20_1QUE >= 38) {
		mes "�]�g���悤�̂Ȃ��K���N�^��";
		mes "�@�W�߂��Ă���B";
		mes "�@��͂�g������͖̂����悤���]";
		if(EP20_1QUE > 38)
			close;
		next;
		mes "�]���̃��K���̎�`����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���̃��K���̎�`����";
		mes "�@���������]";
		close2;
		warp "jor_root2.gat", 149, 120;
		end;
	}
	//������
	end;
OnQuestInfo:
	if(EP20_1QUE == 37 || EP20_1QUE == 38)
		showevent 0, 1, "�R�̂悤�ȃK���N�^#ep20_sub";
	end;
}
jor_safty2.gat,318,254,3	script	�q��#ep20_sub	10046,{/* 3702 */
	if(EP20_1QUE == 38) {
		if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
			mes "�]���̎p�̂܂܂ł͓s���������]";
			close;
		}
		mes "�]�܂�������������Ă��Ȃ��q�ɂ��]";
		next;
		mes "�]�܂�������������Ă��Ȃ��q�ɂ��B";
		mes "�@�N�[�C�i���K���h���Ăڂ����H�]";
		next;
		cloakoffnpc "�N�[�C�i���K���h#2";
		cloakonnpc "�N�[�C�i���K���h#ep20_s";
		mes "[�N�[�C�i���K���h]";
		mes "���ӂ��܂��A�i�՗l�I";
		mes "�d�����I";
		unittalk getnpcid(0,"�N�[�C�i���K���h#2"),"�N�[�C�i���K���h : �y�����I",1;
		next;
		mes "�]�ǂ����Ƃ������悤��";
		mes "�@�ւ炵���C���ɂȂ����B";
		mes "�@�N�[�C�i���K���h���ǂ��Еt����̂�";
		mes "�@����͂킩��Ȃ����c�c�]";
		next;
		chgquest 8850,8851;
		set EP20_1QUE,39;
		mes "�]�i�V�I���~�K���h�̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�i�V�I���~�K���h�̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 261, 156;
		end;
	}
	if(EP20_1QUE >= 39) {
		mes "�]�܂�������������Ă��Ȃ��q�ɂ��B";
		mes "�@�������邱�Ƃ�N����";
		mes "�@���߂Ă��܂����̂��낤�]";
		if(EP20_1QUE > 39)
			close;
		next;
		mes "�]�i�V�I���~�K���h�̂��Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�i�V�I���~�K���h�̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "jor_sanct.gat", 261, 156;
		end;
	}
	mes "�]�܂�������������Ă��Ȃ��q�ɂ��B";
	mes "�@�������邱�Ƃ�N����";
	mes "�@���߂Ă��܂����̂��낤�]";
	close;
OnQuestInfo:
	if(EP20_1QUE == 38 || EP20_1QUE == 39)
		showevent 0, 1, "�q��#ep20_sub";
	end;
}
jor_sanct.gat,46,157,3	script(CLOAKED)	�i�V�I���~�K���h#2	21529,{/* 3703 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	mes "[�i�V�I���~�K���h]";
	mes "�ӂ��c�c����������c�c�B";
	close;
}
jor_sanct.gat,90,153,3	script(CLOAKED)	�k�J�T�C�J�K���h#2	21529,{/* 3704 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	mes "[�k�J�T�C�J�K���h]";
	mes "�T�b�c�c�T�b�c�B";
	close;
}
jor_safty2.gat,191,358,5	script(CLOAKED)	�I�l�`�����K���h#2	21529,{/* 3705 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	mes "[�I�l�`�����K���h]";
	mes "�悢����A�悢����c�c�B";
	close;
}
jor_safty2.gat,306,349,3	script(CLOAKED)	�U���_�N�~�K���h#2	21529,{/* 3706 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	mes "[�U���_�N�~�K���h]";
	mes "�悢����A�悢����c�c�B";
	close;
}
jor_safty2.gat,314,254,5	script(CLOAKED)	�N�[�C�i���K���h#2	21529,{/* 3707 (cloaking)*/
	if(sc_onparam(SC_MONSTER_TRANSFORM,1) != 21530) {
		mes "[���K��]";
		mes "�j���Q���I�@�j���Q�����I";
		close;
	}
	mes "[�N�[�C�i���K���h]";
	mes "�悢����A�悢����c�c�B";
	close;
}

icas_in.gat,100,62,4	script	�I����������#ep20_DQ_2	21518,{/* 3708 */
	if(checkquest(202440)) {
		mes "[�I����������]";
		mes "������܂����B";
		mes "�{���̍����t�����`���������܂��B";
		mes "�@";
		mes "�{���̍����t�i��j�F"+'Question$['TodayQuestion];
		mes "�{���̍����t�i���j�F"+'Answer$['TodayAnswer];
		next;
		mes "[�I����������]";
		mes "���������Ƃ͎v���܂���";
		mes "���o�h�~�̂��߂ǂ��ɂ���������";
		mes "�K���ËL���Ă��������B";
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�X�̏�̓����Ɉړ�����(�C�X�K���h �X�̏�)") == 2) {
			mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
			next;
			mes "[�I����������]";
			mes "����ł́A���n�܂Ō������Ă��������B";
			close2;
			cutin "kafra_01.bmp", 255;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "icecastle.gat", 55, 120;
			end;
		}
		setarray '@questname$,"�X�p�C�{��","������̉��";
		setarray '@questid,19162,19165;
		setarray '@questid2,19163,19166;
		setarray '@coolid,19164,19167;
		setarray '@gainlist,1001217,3,1001217,3;
		setarray '@explist,400000000,300000000,400000000,300000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist,'@questid2);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// �X�p�C�{��
			if(checkquest(19164)) {
				if(checkquest(19164)&2 == 0) {
					mes "[�I����������]";
					mes "���̓G�[�W�F���g�a�̋�J��";
					mes "�m���Ă���܂����A";
					mes "����ȏ�͍����グ���܂���c�c�B";
					mes "����ł��悯��΁A";
					mes "�܂������A��`���Ă��������B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�X�p�C�{��^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close;
				}
			}
			if(checkquest(19162)) {
				mes "[�I����������]";
				mes "�����s�R��������A�ςȏꏊ�ɂ���";
				mes "�A�[�E�B���������Ă��������B";
				mes "�G�[�W�F���g�a�̌P�����ꂽ�ώ@�͂�";
				mes "�߂܂��Ă������邱�Ƃ�";
				mes "���҂��Ă�܂Ȃ��ł��B";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�X�p�C�{��^000000�v";
				mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
				mes "������̃N�G�X�g��j�����܂����H";
				next;
				if(select("��߂�","�j������") == 1) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close;
				}
				delquest 19162;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�X�p�C�{��^000000�v";
				mes "��j�����܂����B";
				close;
			}
			if(checkquest(19163)) {
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�X�p�C�{��^000000�v";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@3��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�X�p�C�{��^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close;
				}
				delquest 19163;
				setquest 19164;
				getitem 1001217,3;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[�I����������]";
				mes "���I";
				mes "�G�[�W�F���g�a���X�p�C�{����";
				mes "�傫�Ȑ��ʂ��������ƕ����Ă܂���I";
				mes "�R�`���͏�w���ɂ���Đ��肳�ꂽ";
				mes "��V�ɂȂ�܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@3��";
				mes "���l�����܂����B";
				close;
			}
			mes "[�I����������]";
			mes "�A�[�E�B���ϐg�X�N���[����";
			mes "�X�̏�ɐ����������K�����A";
			mes "���ǂ��ŏ��𓐂�ł���̂��́A";
			mes "�N�ɂ�������Ȃ��󋵂ł��B";
			mes "�X�̏��1�l�ŎU�􂵂Ȃ���A";
			next;
			mes "[�I����������]";
			mes "�����ł�";
			mes "�����s�R�ȃA�[�E�B��������������A";
			mes "�����t�Ŋm�F��";
			mes "���肢�������܂��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�X�p�C�{��^000000�v";
			mes "���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�I����������]";
				mes "���͎肪�󂢂ĂȂ��̂ł����H";
				mes "�d�����Ȃ��ł��ˁc�c�B";
				mes "�܂��A�肪�󂢂����ɂ��肢���܂��B";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close;
			}
			setquest 19162;
			if(checkquest(19164)) delquest 19164;
			mes "[�I����������]";
			mes "���������X�p�C�Ɋւ������";
			mes "���ɂ������܂���B";
			mes "�X�p�C���H�ɃX�p�C����";
			mes "�����Ă���󂪂Ȃ��ł��傤�B";
			next;
			mes "[�I����������]";
			mes "�����s�R��������A�ςȏꏊ�ɂ���";
			mes "�A�[�E�B���������Ă��������B";
			mes "�G�[�W�F���g�a�̌P�����ꂽ�ώ@�͂�";
			mes "�߂܂��Ă������邱�Ƃ�";
			mes "���҂��Ă�܂Ȃ��ł��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�X�p�C�{��^000000�v";
			mes "���󒍂��܂����B";
			close;
		case 1:	// ������̉��
			if(checkquest(19167)) {
				if(checkquest(19167)&2 == 0) {
					mes "[�I����������]";
					mes "���̓G�[�W�F���g�a�̋�J��";
					mes "�m���Ă���܂����A";
					mes "����ȏ�͍����グ���܂���c�c�B";
					mes "����ł��悯��΁A";
					mes "�܂������A��`���Ă��������B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000������̉��^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close;
				}
			}
			if(checkquest(19165)) {
				mes "[�I����������]";
				mes "�ڐG�ꏊ�Ɍ������āA";
				mes "�h�������������������Ă��������B";
				mes "�����t�̊m�F������܂��̂ŁA";
				mes "�Y��Ȃ��悤�ɁB";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000������̉��^000000�v";
				mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
				mes "������̃N�G�X�g��j�����܂����H";
				next;
				if(select("��߂�","�j������") == 1) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close;
				}
				delquest 19165;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000������̉��^000000�v";
				mes "��j�����܂����B";
				close;
			}
			if(checkquest(19166)) {
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000������̉��^000000�v";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G ( 8000000000 )";
				mes "��400000000��20��󂯎��܂��B";
				mes "JobExp 6G ( 6000000000 )";
				mes "��300000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@3��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000������̉��^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close;
				}
				delquest 19166;
				setquest 19167;
				getitem 1001217,3;
				for('@i=0; '@i < 20; '@i++)
					getexp 400000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,300000000,0;
				mes "[�I����������]";
				mes "��ɂ��Ă���̂��A";
				mes "�󂯎�������ł����H";
				mes "�ӂށc�c���̓��ƕ���c�c";
				mes "�ԈႢ�Ȃ��悤�ł��ˁB";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 8G";
				mes "( 8000000000 )";
				mes "��400000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 6G";
				mes "( 6000000000 )";
				mes "��300000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@3��";
				mes "���l�����܂����B";
				close;
			}
			mes "[�I����������]";
			mes "�h�����ꂽ�������������W���������A";
			mes "������邱�Ƃ��ɂ߂ďd�v�ł��B";
			mes "�����w�肵���ڐG�ꏊ�ɍs���A";
			mes "�����������������Ă��Ă��������B";
			next;
			mes "[�I����������]";
			mes "�������A�����t�����p���āA";
			mes "�����̑����ł��邩��";
			mes "�K���m�F���Ă��������B";
			mes "�n�������G�[�W�F���g�Ȃ�΁A";
			mes "��肭����Ă����ƐM���Ă܂��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000������̉��^000000�v";
			mes "���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�I����������]";
				mes "���͎肪�󂢂ĂȂ��̂ł����H";
				mes "�d�����Ȃ��ł��ˁc�c�B";
				mes "�܂��A�肪�󂢂����ɂ��肢���܂��B";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close;
			}
			setquest 19165;
			if(checkquest(19167)) delquest 19167;
			mes "[�I����������]";
			mes "�h�������Ƃ̐ڐG�ꏊ�́A";
			mes "���n�����p���ɏ����Ă����܂����B";
			mes "�Y���̈ʒu�ɍs����";
			mes "��������ɐڐG���Ă���̂ŁA";
			next;
			mes "[�I����������]";
			mes "�����t�̊m�F��A";
			mes "�����󂯎���Ă��������B";
			mes "�����t��Y�ꂽ��A";
			mes "�K���Ċm�F���Ă���";
			mes "�C���ɏo�����Ă��������B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000������̉��^000000�v";
			mes "���󒍂��܂����B";
			close;
		}
	}
	if(checkquest(19159)) {
		cloakoffnpc "�⋋���S����#ep20iw";
		cloakoffnpc "�p�g���[�������z������#ep20iw";
		mes "[�I����������]";
		mes "�u���[�t�B���O���J�n�������܂��B";
		mes "�������̒ʂ�";
		mes "��؂��Ă������K���Ƃ̐푈��";
		mes "�������͑傫�Ȑ��ʂ������܂����B";
		next;
		mes "[�I����������]";
		mes "�p�g���[�������̓`�[����";
		mes "���ʂ������������R�𕪐͂�������";
		mes "�`���҂������d���ꂽ";
		mes "���K���ϐg�X�N���[���ɂ��";
		mes "�e�Ղ������ł������Ƃ�";
		mes "����I�ȗv���������Ɣ������܂����B";
		next;
		mes "[�p�g���[�������z������]";
		mes "���ށI�@�p�g���[�����ł�";
		mes "�ϐg�X�N���[�����g�p����";
		mes "�p�g���[�����J�n���ꂽ�B";
		next;
		mes "[�I����������]";
		mes "�����ł���܂��I";
		mes "�댯�n��ɐN�������������܂�����";
		mes "�����Ȃ������Ƃ������͂ł���܂��B";
		next;
		mes "[�I����������]";
		mes "�������A���K���̓z���";
		mes "�A�[�E�B���ϐg�X�N���[�����J����";
		mes "�������̌��ɐ������n�߂܂����B";
		next;
		mes "[�⋋���S����]";
		mes "�Ȃ��!?";
		mes "�ł͂����A�X�̏�ɂ����K����";
		mes "�������Ă��邩������Ȃ��̂��H";
		next;
		mes "[�I����������]";
		mes "�����ł���܂��I";
		next;
		mes "[�I����������]";
		mes "�p���������Ǝ����Ȃ��`���҂�";
		mes "���ɂȂ�܂���";
		mes "�A�[�E�B���ϐg�X�N���[�����g�p����";
		mes "�����������K�������j����@��";
		mes "�����_�ł͂���܂���I";
		next;
		mes "[�p�g���[�������z������]";
		mes "�����������Ƃ��B";
		mes "���̖����������邽�߂�";
		mes "�S�����⋋���Ɩ`���҂ɂ�";
		mes "�u���[�t�B���O�ɎQ�����Ă�������B";
		next;
		menu "�c�d��!?�@���̊Ԃ�???",-;
		delquest 19159;
		setquest 19160;
		mes "[�p�g���[�������z������]";
		mes "���ׂȂ��̂ł������B";
		mes "�A�C�f�A����������A�������Ă���B";
		mes "�ł́A��͔C����I";
		mes "��肭���悤�ɁB";
		close2;
		cloakonnpc "�p�g���[�������z������#ep20iw";
		end;
	}
	if(checkquest(19160)) {
		cloakoffnpc "�⋋���S����#ep20iw";
		cloakonnpc "�p�g���[�������z������#ep20iw";
		mes "[�I����������]";
		mes "�G�[�W�F���g�a�I";
		mes "�����ǂ��A�C�f�A�͂���܂��񂩁H";
		next;
		mes "�]�Q�����Ȃ��Ƃ����Ȃ�";
		mes "�@��c�ł͖������낤�B";
		mes "�@�����𓾂ė������낤�c�c�]";
		next;
		menu "���݂܂���A������Ƃ��Ԃ��l�݂Ɂc�c",-;
		mes "[�⋋���S����]";
		mes "���ɗǂ��l��������!!";
		mes "�G�[�W�F���g�E"+strcharinfo(0)+"�I";
		mes "��΂ɃL�~���^�����Ă����͂����B";
		next;
		mes "[�⋋���S����]";
		mes "�u�����t�v�����̂���B";
		mes "�Ⴆ�΁u�R�v�ƌ�������u��v�̂悤�ȁI";
		mes "�����ڂŔ��f�ł��Ȃ��Ȃ�";
		mes "�������Ɣ��f�ł���悤��";
		mes "�����t�����Ηǂ��̂��B";
		next;
		menu "�ӊO�ɂ������͂̂���Ăł��ˁI",-;
		mes "[�⋋���S����]";
		mes "�G�[�W�F���g�Ȃ�";
		mes "���������Ă����ƐM���Ă��B";
		mes "�������̂��ׂ����Ƃ́A�ӂ��B";
		next;
		mes "[�⋋���S����]";
		mes "�����t���g����";
		mes "���K�������̋��ɐN�����Ă���";
		mes "���������������������邱�ƁI";
		next;
		mes "[�⋋���S����]";
		mes "�ӂ��I";
		mes "�X�̏�ɂ��鋓���s�R�ȃA�[�E�B����";
		mes "�����t�𓊂�����";
		mes "�����������t���Ԃ��Ă��Ȃ���������";
		mes "���̃A�[�E�B����߂܂��邱�ƁI";
		next;
		menu "�ǂ��l�����Ǝv���܂�",-;
		mes "[�I����������]";
		mes "�͂��A�����ȍ��ł���܂��I";
		next;
		mes "[�⋋���S����]";
		mes "�悵�I";
		mes "�ł͋Ɩ��𕪒S���悤�B";
		mes "�����t�𖈓��ύX����K�v������B";
		mes "���̋Ɩ��̓I������������";
		mes "�S�����Ă���B";
		next;
		mes "[�⋋���S����]";
		mes "�����t�͂�������p�ӂ���";
		mes "�o�������p�^�[����";
		mes "�d�����Ȃ��悤�ɂ��Ă���B";
		next;
		mes "[�I����������]";
		mes "�͂��I�@�������܂����B";
		next;
		mes "[�⋋���S����]";
		mes "�N�����Ă�����������̌��ɍs��";
		mes "���������ċA���Ă���C����";
		mes "�G�[�W�F���g�E"+strcharinfo(0)+"��";
		mes "�C�������B";
		next;
		menu "�ǂ����܂�",-,"�ςȑI������",-,"�o�Ă���͂����������",-,"���Ɠ`����",-;
		emotion 1,"",1;
		mes "[�⋋���S����]";
		mes "�����ЂƂA�X�̏�ɂ�";
		mes "�����s�R�ȃA�[�E�B����T���C������";
		mes "������G�[�W�F���g�E"+strcharinfo(0)+"��";
		mes "���肢�������B";
		next;
		mes "[�⋋���S����]";
		mes "���ӗ͂��U���ȃA�[�E�B���������";
		mes "�n�������G�[�W�F���g�̕���";
		mes "�ώ@�͂ɗD��Ă���݂���������ȁB";
		next;
		menu "���҂����I�@�⋋���a�̋Ɩ������܂��Ă���܂���I",-;
		mes "[�⋋���S����]";
		mes "���H";
		mes "���͕⋋�Ɩ������Ȃ�����B";
		mes "�啺�ɂ��Ȃ����g�Ŏ��������邩�H";
		mes "����Ȃ̂́A�I�����������݂�����";
		mes "�V����̊����ɔC���Ȃ��ƁB";
		next;
		mes "[�⋋���S����]";
		mes "�ł�2�l�ŏ�肭���悤�ɁI";
		mes "���̓L�~������M����";
		mes "�����̎d�������ɍs����B";
		next;
		cloakonnpc "�⋋���S����#ep20iw";
		emotion 22,"�I����������#ep20_DQ_2";
		if(!sleep2(3000)) end;
		emotion 18,"�I����������#ep20_DQ_2";
		delquest 19160;
		setquest 19161;
		mes "[�I����������]";
		mes "�n�n�n�c�c�f���炵���d����";
		mes "�����t���\�͂ł��ˁB";
		mes "�����E�����オ���";
		mes "����ȕ��ɂȂ��ł��傤���c�c�H";
		mes "�Ƃɂ����A������Ƙb�����܂��傤�B";
		close;
	}
	if(checkquest(19161)) {
		cloakonnpc "�⋋���S����#ep20iw";
		cloakonnpc "�p�g���[�������z������#";
		mes "[�I����������]";
		mes "�S������Ɩ��ɂ���";
		mes "���߂Ċm�F���܂��傤�B";
		mes "�ǂ̋Ɩ�����m�F���܂����H";
		while(1) {
			next;
			switch(select("�ύX���ꂽ�����t��m����@�́H","�����t�Ə����","�B�ꂽ�G�X�p�C�{��","�����\��")) {
			case 1:
				mes "[�I����������]";
				mes "�n���̃G�[�W�F���g�Ȃ�";
				mes "�悭�������ł��傤�B";
				mes "�����t�͌����ł̂ݓ`�B�ł��܂��B";
				mes "���̏��ɗ��Ă��炦��";
				mes "�ύX���ꂽ�����t�����`�����܂���B";
				next;
				mes "[�I����������]";
				mes "�����t�̕ύX�͖���5���ɍs���܂��B";
				mes "���Ԃɂ͒��ӂ��Ă��������B";
				mes "�ύX�O�̍����t���L������";
				mes "�C���ɓ�����Ȃ��悤�ɂ��肢���܂��B";
				next;
				mes "[�I����������]";
				mes "���������t��Y�ꂽ�Ƃ��Ă�";
				mes "�S�z���Ȃ��ł��������B";
				mes "���ɕ����Ă��炦���";
				mes "���x�ł��������������܂��B";
				break;
			case 2:
				mes "[�I����������]";
				mes "�N�����ɏ]�����Ă��������������";
				mes "����������Ă��邱�Ƃ�";
				mes "�ɂ߂ďd�v�ł��B";
				next;
				mes "[�I����������]";
				mes "�����w�肵���ꏊ�ɍs��";
				mes "�h�����̑������W�߂�����";
				mes "�����ċA���Ă��Ă��������B";
				next;
				mes "[�I����������]";
				mes "������񍇌��t���g����";
				mes "�{���̑����Ȃ̂��K���m�F���K�v�ł��B";
				mes "�n�������G�[�W�F���g�Ȃ�";
				mes "��肭����Ă����ƐM���Ă܂��B";
				break;
			case 3:
				mes "[�I����������]";
				mes "�A�[�E�B���ϐg�X�N���[�����g����";
				mes "�X�̏�ɐ����������K����";
				mes "�ǂ��ɐ������Ă���̂�";
				mes "�N�ɂ��킩��Ȃ��󋵂ł��B";
				next;
				mes "[�I����������]";
				mes "�X�̏�������";
				mes "�����s�R�ȃA�[�E�B����������";
				mes "�����t�ɂ��g���̊m�F��";
				mes "�s���Ă��������B";
				break;
			case 4:
				if(checkitemblank() == 0) {
					mes "^009eff�y�C���t�H���[�V�����z";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B^000000";
					close;
				}
				setquest 202440;
				delquest 19161;
				getitem 1001217,6;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				getexp 2000000000,0,0;
				getexp 0,1500000000,0;
				mes "[�I����������]";
				mes "�����J�n���鏀�����ł�����";
				mes "���ł������������������B";
				mes "�����t�����`�����܂��B";
				close;
			}
			next;
			mes "[�I����������]";
			mes "�܂��C�ɂȂ邱�Ƃ�����܂����H";
			continue;
		}
	}
	mes "[�I����������]";
	mes "�ŋ߁A�\�ɂȂ��Ă���`���҂��H";
	next;
	mes "[�I����������]";
	mes "���͂͂��肻������";
	mes "���܂�o����΂�Ȃ����������B";
	next;
	mes "[�I����������]";
	mes "���̃A�[�E�B���Ƃ͈���Ď���";
	mes "�`���҂Ƃ������̂ɉ��^�I������B";
	if(checkquest(19158)) {
		next;
		cloakoffnpc "�⋋���S����#ep20iw";
		emotion 23;
		unittalk "�I������ : �����I�@�I�������I";
		mes "[�I����������]";
		mes "���z���ɂȂ�܂������A�⋋���a�I";
		mes "���傤�ǂ�����ɖ`���҂�";
		mes "���������΂���ł��B";
		next;
		mes "[�⋋���S����]";
		mes "�����A�N���Ǝv������";
		mes "�G�[�W�F���g�E"+strcharinfo(0)+"!!";
		mes "���Ђ����Ԃ肾�ȁI";
		next;
		mes "[�I����������]";
		mes "�G�A�G�[�W�F���g!?";
		mes "�G�[�W�F���g�ł�����!!";
		mes "���A��قǂ́A���炢�����܂����I";
		next;
		mes "�]�����͌����Ă邪";
		mes "�@���̐�Ɍ����Ă���Ȃ������̂���";
		mes "�@���߂������Ȋ�����Ă���]";
		next;
		mes "[�⋋���S����]";
		mes "�ŋ߂̒��q�͂ǂ��H";
		mes "�܂��A���܂�L��������ȁB";
		mes "�\�́A��X�����Ă����B";
		next;
		cloakoffnpc "�p�g���[�������z������#ep20iw";
		unittalk getnpcid(0,"�p�g���[�������z������#"),"�z������ : �ӂށc�c",1;
		if(!sleep2(1000)) end;
		unittalk "�I������ : �����I�@�I�������I",1;
		mes "[�I����������]";
		mes "�����a�A��������Ⴂ�܂������I";
		next;
		mes "[�p�g���[�������z������]";
		mes "�������A�b������������";
		mes "�G�[�W�F���g�Ƃ������Ă����ȁH";
		next;
		mes "[�p�g���[�������z������]";
		mes "�⋋���I";
		mes "���O�͖����ɒN����߂܂���";
		mes "�G�[�W�F���g�������V�т��Ă�̂��H";
		next;
		unittalk getnpcid(0,"�⋋���S����#ep20iw"),"�S���� : �����I�@�S�����I",1;
		mes "[�⋋���S����]";
		mes "���c�c����ł���܂��I";
		mes "�����a�c�c�I";
		next;
		mes "[�⋋���S����]";
		mes "���̖`���҂́A���Ɗ��x�Ɩ���";
		mes "���ɓ������ꂽ���͎ҁI";
		mes "�{���̃G�[�W�F���g�Ȃ�ł�!!";
		next;
		mes "[�⋋���S����]";
		mes "���Ȃ���ȁH�@�ȁH";
		mes "�ق�A���񂽂��Ȃ񂩌����Ă���B";
		next;
		mes "�]�⋋���S�����͑����������";
		mes "�@�������낶�댩�Ă���B";
		mes "�@���H�@���̏�??";
		mes "�@�������A���������̂�";
		mes "�@���߂Ăł͖����C������c�c�]";
		next;
		switch(select("�n�n�A�����a�B���������Ă��G�[�W�F���g�Ȃ�ł��I","�⋋���a�ɂ́A�����b�ɂȂ�܂����I","���̔C���͉��ł���܂����H","�i��H�@������ƑI�����̏�Ԃ�??�j")) {
		case 1:
			emotion 33,"�p�g���[�������z������#ep20iw",1;
			mes "[�p�g���[�������z������]";
			mes "�ӂށA�����猩�Ă�";
			mes "�G�[�W�F���g�ɂ͌����Ȃ��Ȃ��B";
			next;
			break;
		case 2:
			emotion 1,"�p�g���[�������z������#ep20iw",1;
			mes "[�p�g���[�������z������]";
			mes "�����b�ɂȂ��Ă���ƁH";
			mes "�݂�ȓ������Ƃ������Ă���ȁB";
			next;
			break;
		case 3:
			emotion 0,"�p�g���[�������z������#ep20iw",1;
			mes "[�p�g���[�������z������]";
			mes "���I";
			mes "���̕K�v�Ȃ��Ƃ��������p���I";
			mes "�G�[�W�F���g���ۂ��I";
			mes "����A�G�[�W�F���g�ɈႢ�Ȃ��I";
			next;
			break;
		case 4:
			emotion 36,"�⋋���S����#ep20iw",1;
			break;
		}
		mes "[�p�g���[�������z������]";
		mes "�܂��A�悵�I";
		mes "���ۂɃG�[�W�F���g�Ȃ̂��ǂ�����";
		mes "�d�v�Ȃ��Ƃł͂Ȃ����낤�B";
		next;
		mes "[�p�g���[�������z������]";
		mes "�l��s���ŋ�J���Ă��邪";
		mes "�`���҂̂悤�ɐg�������炩�Ȑl�ނȂ�";
		mes "��̍��ɓ������Ă����Ȃ��B";
		mes "�S�����⋋���I";
		mes "�K�؂Ȑl�ނ̐��E�I�@���΂��I";
		next;
		unittalk getnpcid(0,"�⋋���S����#ep20iw"),"�S���� : �����I�@�S�����I",1;
		mes "[�⋋���S����]";
		mes "���h�ł���܂��A�����a�I";
		next;
		delquest 19158;
		setquest 19159;
		mes "[�p�g���[�������z������]";
		mes "���Ԃ��B";
		mes "�ł́A�I�����������I";
		mes "�u���[�t�B���O���J�n����I";
		close;
	}
	close;
OnQuestInfo:
	if(checkquest(19163))
		showevent 0, 2, "�I����������#ep20_DQ_2";
	else if(checkquest(19158) || checkquest(19159) || checkquest(19160) || checkquest(19161) || checkquest(19162) || checkquest(19165))
		showevent 0, 3, "�I����������#ep20_DQ_2";
	end;
OnInit:
	setarray 'Question$,"�o�o���K","�W�F�X�^�[";
	setarray 'Answer$,"�Ö؂̎}","�ς̐K��";
	set 'TodayQuestion,rand(getarraysize('Question$));
	set 'TodayAnswer,rand(getarraysize('Answer$));
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icas_in.gat,104,60,2	script(CLOAKED)	�⋋���S����#ep20iw	21518,{/* 3709 (cloaking)*/
	unittalk "�⋋���S���� : �S�����`�A��Ƃ��ɏo�ė����`�B���ɂ���̂͒m���Ă��B",1;
	sleep 1500;
	unittalk "�⋋���S���� : �����o�������������Ă��B���O���������Ƃ���ŁA�����m��Ă�B",1;
	sleep 1500;
	cloakonnpc;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icas_in.gat,99,57,6	script(CLOAKED)	�p�g���[�������z������#ep20iw	21518,{/* 3710 (cloaking)*/
	unittalk "�p�g���[�������z������ : �ӂށc�c��肭����Ă�̂��C�ɂȂ��āA�������藈�Ă݂��B�����߂�Ȃ���B";
	sleep 1500;
	cloakonnpc;
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,204,238,2	script	�������A�[�E�B��#SSQ01	10461,{/* 3711 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 7,"�������A�[�E�B��#SSQ01";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : "+'@str$+"�H�����Ă�H���̒m���Ă鍇���t�Ƃ͈Ⴄ���ǁH���O���X�p�C����Ȃ����H",1;
			if(!sleep2(1500)) end;
			cloakoffnpc "�㓙����������#SSQ01";
			if(!sleep2(500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: �A�����󂯂ĎQ��܂����B",1;
			if(!sleep2(800)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : ����A���x�悩�����B������̎҂͂ǂ����X�p�C�݂����B�������ȍ����t�������񂾂���B",1;
			if(!sleep2(1500)) end;
			emotion 55,"�㓙����������#SSQ01";
			unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: �����I�`���ғa�H�����Đ�y���Ⴀ��܂��񂩁H�����܂łǂ��������p�ŁH",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : ���I��y�A����m���Ă�H�Ȃ񂾁A������̎҂͂��m�荇�����H",1;
			if(!sleep2(1500)) end;
			emotion 20,"�㓙����������#SSQ01";
			unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: �������̎d������`���Ă��ł��B�����t�́c�Y�ꂽ�̂��ȁH",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : ����c�����푰�ł͂Ȃ��������ȁB�܂��A�������B�⋋���a�ɂ�낵���Ɠ`���Ă���B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: ���̂܂܍s����܂����H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : �P������ƌ����ė������ǁA�ǂ��ɂ��C��������Ȃ��B�܂����x�ł������낤�B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: ��y�A���C�����Ă��A�艺�����B",1;
			if(!sleep2(1500)) end;
			emotion 12,"�������A�[�E�B��#SSQ01";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : �����`",1;
			if(!sleep2(800)) end;
			cloakonnpc "�������A�[�E�B��#SSQ01";
			unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: �`���ғa�A���������s���܂��B���Y��ɂȂ��������t�́A�I�����������a���炲�m�F���������B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: �����l�ł��B",1;
			if(!sleep2(800)) end;
			cloakonnpc "�㓙����������#SSQ01";
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : �����t�H������"+'@a$+"���������ȁH",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			emotion 18,"�������A�[�E�B��#SSQ01";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : �قفA�ŋ߂͂���Ȃ��Ƃ�����񂾂ȁB����J�l�B",1;
			cloakonnpc "�������A�[�E�B��#SSQ01";
			if(!checkquest(19168)) {
				setquest 19168;
				compquest 19168;
			}
			close;
		}
		emotion 23,"�������A�[�E�B��#SSQ01";
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : ���c�����t�H�Ȃɂ���H�I����Ȃ̎��m��Ȃ���B",1;
		if(!sleep2(1500)) end;
		cloakoffnpc "�㓙����������#SSQ01";
		unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: �A�����󂯂ĎQ��܂����B",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ01"),"�������A�[�E�B�� : �������I�p�g���[�����H�Ɂc�����Ȃ���c",1;
		if(!sleep2(800)) end;
		cloakonnpc "�������A�[�E�B��#SSQ01";
		if(!sleep2(700)) end;
		emotion 6,"�㓙����������#SSQ01";
		unittalk getnpcid(0,"�㓙����������#SSQ01"),"�㓙����������: �����A�X�p�C���H�҂��₪��I",1;
		cloakonnpc "�㓙����������#SSQ01";
		if(!sleep2(1500)) end;
		emotion 1,"";
		unittalk getcharid(3),strcharinfo(0)+" : �H",1;
		if(!sleep2(1500)) end;
		if(checkquest(19169)) delquest 19169;
		if(checkquest(19170)) delquest 19170;
		if(checkquest(19171)) delquest 19171;
		if(checkquest(19172)) delquest 19172;
		if(checkquest(19173)) delquest 19173;
		if(checkquest(19174)) delquest 19174;
		if(checkquest(19175)) delquest 19175;
		if(checkquest(19176)) delquest 19176;
		if(checkquest(19177)) delquest 19177;
		delquest 19162;
		setquest 19163;
		unittalk getcharid(3),strcharinfo(0)+" : (�X��ɐ��������X�p�C�̑{���ɐ��ʂ��o���B�I�������ɕ񍐂��悤�B)",1;
		close;
	}
	cloakonnpc "�������A�[�E�B��#SSQ01";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 3,"�������A�[�E�B��#SSQ01",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19168))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,207,240,4	script(CLOAKED)	�㓙����������#SSQ01	21517,{/* 3712 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,238,185,2	script	�������A�[�E�B��#SSQ02	10461,7,7,{/* 3713 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		emotion 23,"�������A�[�E�B��#SSQ02";
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ02"),"�������A�[�E�B�� : ��H"+'@str$+"�H���ꍇ���Ă�H��ƔԒ��̃|���񂪋����Ă��ꂽ�̂ƈႤ�񂾂��ǁH���̂ȂɁA�X�v�@�C���H",1;
		if(!sleep2(800)) end;
		cloakoffnpc "�񓙕�������#SSQ02";
		if(!sleep2(800)) end;
		unittalk getnpcid(0,"�񓙕�������#SSQ02"),"�񓙕�������: �A�����󂯂ĎQ��܂����B",1;
		if(!sleep2(1500)) end;
		emotion 38,"�������A�[�E�B��#SSQ02";
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ02"),"�������A�[�E�B�� : ����A�p�g���[�����̌�y��������Ȃ����B�����a�͂����C���́H���I�H������́A�����B�X�v�@�C�I�����A�X�v�@�C�݂����B",1;
		if(!sleep2(1500)) end;
		emotion 1,"�񓙕�������#SSQ02";
		unittalk getnpcid(0,"�񓙕�������#SSQ02"),"�񓙕�������: �X�v�@�C�H�����A�X�p�C�ł��ˁB���̐l���H���Ⴂ�̂悤�ł��ˁB�������̎d������`���Ă���`���ғa�ł��B",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ02"),"�������A�[�E�B�� : ���H�X�v�@�C����Ȃ��́H�X�v�@�C����Ȃ��̂ɁA�Ȃ�ŊԈ�����́H",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"�񓙕�������#SSQ02"),"�񓙕�������: �������̒ʂ�A�����t���Ċo���ɂ������Ⴀ��܂��񂩁B�ǂ����Y�ꂽ�悤�ł��ˁB",1;
		if(!sleep2(1500)) end;
		emotion 20,"�������A�[�E�B��#SSQ02";
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ02"),"�������A�[�E�B�� : ����ȁc������Ƒ���Ȃ����������ǁA�d���Ƃ��C���Ă����̂��s�����ȁB�������I����Ȃ��Ƃ��Ă鎞����Ȃ��B",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"�񓙕�������#SSQ02"),"�񓙕�������: ���Z�����ł����H",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ02"),"�������A�[�E�B�� : �Ƃ�ł��Ȃ���B�������ɕX�łȂ����킹���̂��A������ƒg�����Ȃ����r�[�ɗn���o���đ�S������B",1;
		if(!sleep2(1500)) end;
		unittalk getnpcid(0,"�񓙕�������#SSQ02"),"�񓙕�������: ���C�����āB",1;
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ02"),"�������A�[�E�B�� : ����`�p�g���[�����̌�y������ꂳ��`�B",1;
		if(!sleep2(800)) end;
		cloakonnpc "�������A�[�E�B��#SSQ02";
		if(!sleep2(800)) end;
		unittalk getnpcid(0,"�񓙕�������#SSQ02"),"�񓙕�������: �`���ғa�A�ł͎����s���܂��B���Y��ɂȂ��������t�́A�I�����������a����m�F���肢���܂��B",1;
		if(!sleep2(1500)) end;
		emotion 12,"�񓙕�������#SSQ02";
		unittalk getnpcid(0,"�񓙕�������#SSQ02"),"�񓙕�������: ���͂����s���܂��`",1;
		cloakonnpc "�񓙕�������#SSQ02";
		close;
	}
	cloakonnpc "�������A�[�E�B��#SSQ02";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 4,"�������A�[�E�B��#SSQ02",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19169))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,240,187,4	script(CLOAKED)	�񓙕�������#SSQ02	21515,{/* 3714 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,132,182,6	script	�������A�[�E�B��#SSQ03	10461,7,7,{/* 3715 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 77,"�������A�[�E�B��#SSQ03";
			emotion 19,"";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ03"),"�������A�[�E�B�� : ����H"+'@str$+"�H����Ⴄ�񂾂��ǁH���������������Ă�ƃo�J�ɂ��Ă�񂾂�H�����I",1;
			if(!sleep2(800)) end;
			cloakoffnpc "�ꓙ���z������#SSQ03";
			if(!sleep2(700)) end;
			unittalk getnpcid(0,"�ꓙ���z������#SSQ03"),"�ꓙ���z������: �A�����󂯁c�āA�݂�Ȓm�荇���΂���ł��ˁc",1;
			if(!sleep2(1500)) end;
			emotion 7,"�������A�[�E�B��#SSQ03";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ03"),"�������A�[�E�B�� : �Ȃ񂾁H�I�܂����񂽂��H�����̃p�g���[�������Ă��񂽂������H���Ŗ��񂠂񂽂���H����H�I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���z������#SSQ03"),"�ꓙ���z������: �����ł��ˁB�����A�������񂴂�ł���B�Ƃ���Ŗ`���ғa�A�����Ő��������Ɖ������Ă܂����H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ03"),"�������A�[�E�B�� : ���H�m�荇���H���c������ăX�p�C����I�X�p�C�I�Ԉ���������t�������񂾂���H������Ȃ��Ă�����߂܂���B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���z������#SSQ03"),"�ꓙ���z������: �ǂ����Ă���������̕���������������񂾂��ǁH��������ł���ȏꏊ�Ŝp�j���Ă邩��B",1;
			if(!sleep2(1500)) end;
			emotion 77,"�������A�[�E�B��#SSQ03";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ03"),"�������A�[�E�B�� : ���₟�c���ꂪ�Ȃ��c@.@ �q�N�b�c",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���z������#SSQ03"),"�ꓙ���z������: �����c�����c�ƂɋA��܂��傤�B���x������Ă邩��A��������̉Ƃ��o���Ă�񂾂�B",1;
			if(!sleep2(1500)) end;
			emotion 45,"�������A�[�E�B��#SSQ03";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ03"),"�������A�[�E�B�� : �����c�����cz.Z.z..zZ",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���z������#SSQ03"),"�ꓙ���z������: ���킟���I��������A�Q����ʖڂ���B����ȏꏊ�ŐQ��ƕ��׈�����I",1;
			if(!sleep2(1500)) end;
			emotion 16,"�ꓙ���z������#SSQ03";
			unittalk getnpcid(0,"�ꓙ���z������#SSQ03"),"�ꓙ���z������: �������c�����s���܂��B�Y�ꂽ�����t�̓I�����������a�ɍs���ĕ����āB",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���z������#SSQ03"),"�ꓙ���z������: ������I��������N���āI�Q����_�������Ă΁I",1;
			cloakonnpc "�ꓙ���z������#SSQ03";
			cloakonnpc "�������A�[�E�B��#SSQ03";
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ03"),"�������A�[�E�B�� : ���H�����t�H�q�N�b�c���́c���̉����c�����A�ς̐K���A���ꂾ�I�c�����Ă��ȁH",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ03"),"�������A�[�E�B�� : �����c�����Ɛ����O�ɋA��Ȃ��ƂȁB���׈��������B",1;
			cloakonnpc "�������A�[�E�B��#SSQ03";
			if(!checkquest(19170)) {
				setquest 19170;
				delquest 19170;
			}
			close;
		}
	}
	cloakonnpc "�������A�[�E�B��#SSQ03";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 77,"�������A�[�E�B��#SSQ03",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19170))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,129,184,6	script(CLOAKED)	�ꓙ���z������#SSQ03	21516,{/* 3716 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,66,71,8	script	�������A�[�E�B��#SSQ04	10461,7,7,{/* 3717 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 1,"�������A�[�E�B��#SSQ04";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ04"),"�������A�[�E�B�� : "+'@str$+"�H�������H�����H�� ���������H",1;
			if(!sleep2(800)) end;
			cloakoffnpc "�ꓙ���\����#SSQ04";
			if(!sleep2(700)) end;
			unittalk getnpcid(0,"�ꓙ���\����#SSQ04"),"�ꓙ���\����: �A�����󂯂ĎQ��܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ04"),"�������A�[�E�B�� : ���H���� �������H�������������H�����������H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���\����#SSQ04"),"�ꓙ���\����: ����H�I�|�������㓙���a�̂������񂶂Ⴀ��܂��񂩁H�`���җl���H�����A��̂ǂ������󋵂�����܂��B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ04"),"�������A�[�E�B�� : ���� �� �������� �������� �������I������ �������H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���\����#SSQ04"),"�ꓙ���\����: �������A��������B�Ⴂ�܂��B�������̎d������`���Ă܂��B�����t�͂܂��I�Y��邱�Ƃ�����܂���ˁB�����������܂ɂ������Ⴀ��܂��񂩁B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ04"),"�������A�[�E�B�� : ������ ���������B���� ���� ������ ������ ������ �������I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���\����#SSQ04"),"�ꓙ���\����: �n�n�n�A�`���җl���������Ȃ��݂����ł�����A�������肭�`���܂���B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ04"),"�������A�[�E�B�� : ���� �� ���� �����I���� �������� �� ���� ���� ���� ������ ���������B",1;
			if(!sleep2(800)) end;
			cloakonnpc "�������A�[�E�B��#SSQ04";
			unittalk getnpcid(0,"�ꓙ���\����#SSQ04"),"�ꓙ���\����: ��������A���C�����āB",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���\����#SSQ04"),"�ꓙ���\����: �`���ғa�A�ł͎����s���܂��B�Y�ꂽ�����t�́A�I�����������a�ɍs���Ă܂������Ă��������B",1;
			if(!sleep2(1500)) end;
			emotion 12,"�ꓙ���\����#SSQ04";
			unittalk getnpcid(0,"�ꓙ���\����#SSQ04"),"�ꓙ���\����: �����l�ł����B",1;
			cloakonnpc "�ꓙ���\����#SSQ04";
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ04"),"�������A�[�E�B�� : �������H������ "+'@a$+"�����H",1;
			unittalk getcharid(3),strcharinfo(0)+" : (�����������������A�ǂ����Ă������t�����͖��m�ɕ��������B)",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ04"),"�������A�[�E�B�� : ������ �����B���� �����I",1;
			cloakonnpc "�������A�[�E�B��#SSQ04";
			if(!checkquest(19171)) {
				setquest 19171;
				delquest 19171;
			}
			close;
		}
	}
	cloakonnpc "�������A�[�E�B��#SSQ04";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 9,"�������A�[�E�B��#SSQ04",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19171))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,62,73,6	script(CLOAKED)	�ꓙ���\����#SSQ04	21516,{/* 3718 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}

icecastle.gat,58,223,8	script	�������A�[�E�B��#SSQ05	10461,7,7,{/* 3719 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 79,"�������A�[�E�B��#SSQ05";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : ����H�I"+'@str$+"�H�����t�͂��ꂶ��Ȃ���ȁH�ق�A�����̍����t�Ⴂ�܂���B�܂����c�H�X�c�X�c�X�p�C���I�I�I�X�p�C���o���I�I",1;
			if(!sleep2(800)) end;
			cloakoffnpc "�񓙕��g����#SSQ05";
			if(!sleep2(700)) end;
			unittalk getnpcid(0,"�񓙕��g����#SSQ05"),"�񓙕��g����: �A�����󂯂ĎQ��܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : ����c�C�[�O���p�g���[�����̕������A�{�������ȁB�������ł��I�������I�X�p�C�����܂��B�X�p�C�I�I",1;
			if(!sleep2(1500)) end;
			emotion 25,"�񓙕��g����#SSQ05";
			unittalk getnpcid(0,"�񓙕��g����#SSQ05"),"�񓙕��g����: �c�O�`�B�����͎������̎d������`���`���ғa�ł����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : �����A�Ȃ񂾁c�Ƃ���łǂ����č����t���ԈႦ����ł����H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�񓙕��g����#SSQ05"),"�񓙕��g����: �����ł��ˁA���ŊԈႦ����ł��傤�H�����������ǁA�Z���̂Ɂc",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : �܂��A���蓾��ł��傤�B�Ƃɂ����X�p�C����Ȃ��čK���ł��B�������Ă��ɃV���L�[���I�M���[�I�Ƃ����Ǝv������ł���B",1;
			if(!sleep2(1500)) end;
			emotion 33,"�񓙕��g����#SSQ05";
			unittalk getnpcid(0,"�񓙕��g����#SSQ05"),"�񓙕��g����: �`���ғa�����������ꐶ�����ɒT���o���Ă��܂��B�܂��A��ɂ���Ȃ��Ƃ��N�����肵�܂����ǂˁB",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : ��J���Ă܂��ˁB���͎d�����I��������A���낻��s���܂��B�����l�ł����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�񓙕��g����#SSQ05"),"�񓙕��g����: �͂��I���C�����āB",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : �����l�ł��B",1;
			if(!sleep2(800)) end;
			cloakonnpc "�������A�[�E�B��#SSQ05";
			if(!sleep2(800)) end;
			unittalk getnpcid(0,"�񓙕��g����#SSQ05"),"�񓙕��g����: �`���ғa�A�Y�ꂽ�����t�́A�I�����������a�ɂ܂������Ă��������B�ł͎����Q��܂��B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�񓙕��g����#SSQ05"),"�񓙕��g����: ����J�l�ł��B",1;
			cloakonnpc "�񓙕��g����#SSQ05";
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : "+'@a$+"�ł��B",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : �O�̂��߂Ɍ����܂����A�D�_�ł͂���܂���B���ٓ��ɗ��܂��Ă�^���X������������悤�Ƃ��������ł���B",1;
			if(!sleep2(1500)) end;
			emotion 12,"�������A�[�E�B��#SSQ05";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ05"),"�������A�[�E�B�� : ����͏I���܂����B�ł͎���I",1;
			cloakonnpc "�������A�[�E�B��#SSQ05";
			if(!checkquest(19172)) {
				setquest 19172;
				delquest 19172;
			}
			close;
		}
	}
	cloakonnpc "�������A�[�E�B��#SSQ05";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 5,"�������A�[�E�B��#SSQ05",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19172))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,61,221,2	script(CLOAKED)	�񓙕��g����#SSQ05	21515,{/* 3720 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,54,209,8	script	�������A�[�E�B��#SSQ06	10461,7,7,{/* 3721 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 36,"�������A�[�E�B��#SSQ06";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : "+'@str$+"�H"+'@str$+"�H�H"+'@str$+"�H�H�H",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (��������Ȃ��Ă��������A�[�E�B���̖ڂ���菬�����Ȃ��Ă����A��������^���̖ڂŌ��Ă���B)",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (�����ł܂��Ă��������ȉH���A�������悤�ȋC�������c���΂炭��c)",1;
			if(!sleep2(700)) end;
			cloakoffnpc "�ꓙ���|������#SSQ06";
			if(!sleep2(500)) end;
			emotion 6,"�ꓙ���|������#SSQ06";
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: �ʕ���󂯂Ă��܁c������Ƃ�������A�܂��������񂪒ʕ񂵂��́H�ǂ����āH",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : (�X�p�C���A�X�p�C�c�����t���Ԉ���āA�Ƃɂ����X�p�C���B)",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: ���̂ł��ˁ`�`���ғa�H���̂��m�荇���̂悤�ł����A���������ăX�p�C�ł����H",1;
			if(!sleep2(1500)) end;
			emotion 9,"";
			unittalk getcharid(3),strcharinfo(0)+" : �c �c �c �c",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: �ł���ˁH�Ⴂ�܂���ˁH����͂���Ƃ��āA��������B���̌����ɐڋߋ֎~���߂��ꂽ�񂶂�Ȃ��ł����H���ł܂������ɂ����ł����H",1;
			if(!sleep2(1500)) end;
			emotion 55,"�������A�[�E�B��#SSQ06";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : ���c���c�����ˁB�����t���炢�Y��邱�Ƃ������ˁB�`���҂ł����ł��ł���󂶂�Ȃ���ˁH",1;
			if(!sleep2(1500)) end;
			emotion 6,"�ꓙ���|������#SSQ06";
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: ������ƁA��������B�b����炳�Ȃ��ł��������B�ǂ����Ă܂������ɂ����ł����I",1;
			if(!sleep2(1500)) end;
			emotion 16,"�������A�[�E�B��#SSQ06";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : �����ˁA�����Ɍ����Ă݂悤����Ȃ����B�J�`�J�`�Ɠ����������̓��̐l�Ԃ��A���̉Ƃɓ���̂������񂾂���H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: ����ŁH",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : ��������ł��H�����I���������瓐�݌���������̓��̐l�Ԃ͋��Ȃ��ăA�[�E�B��2�l�ƃv���[�f�O�����Ƃ��H�����l��������񂾂���I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : �����Ƃ��̋����̓��̐l�Ԃ͂ǂ����ɝf�v���ꂽ���A���̂Ȃ񂾁A�X�p�C�I�X�p�C�ɈႢ�Ȃ��I",1;
			if(!sleep2(1500)) end;
			emotion 54,"�ꓙ���|������#SSQ06";
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: ���c��U������܂����B�ł����Z�n�ڋߋ֎~���߂��ᔽ���܂����ˁB�܂����l�̉Ƃ����œ��݌����ł����H�s���܂��傤�B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: �Ӂc�`���ғa�̓I�����������a�̂Ƃ���֍s����āA�ύX���ꂽ�����t���m�F���Ă��������B�ł͂����s���܂��ˁB",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�ꓙ���|������#SSQ06"),"�ꓙ���|������: ��������A�s���܂��傤�B",1;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : �q�[���c",1;
			if(!sleep2(700)) end;
			cloakonnpc "�ꓙ���|������#SSQ06";
			cloakonnpc "�������A�[�E�B��#SSQ06";
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : "+'@a$+"�I����ō����Ă��ˁH�X�p�C����Ȃ�����A�Â��ɂ��Ă���B�d�v�Ȃ��̂��ώ@���Ă邩��B",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ06"),"�������A�[�E�B�� : �����I�o�����B�����邼�B",1;
			cloakonnpc "�������A�[�E�B��#SSQ06";
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (���������񂾂�H)",1;
			if(!checkquest(19173)) {
				setquest 19173;
				delquest 19173;
			}
			close;
		}
	}
	cloakonnpc "�������A�[�E�B��#SSQ06";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 79,"�������A�[�E�B��#SSQ06",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19173))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,52,207,8	script(CLOAKED)	�ꓙ���|������#SSQ06	21516,{/* 3722 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,96,245,2	script	�������A�[�E�B��#SSQ07	10461,7,7,{/* 3723 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : "+'@str$+"�H���ƌ����Ă܂�����ˁH",1;
			if(!sleep2(1500)) end;
			emotion 22,"�������A�[�E�B��#SSQ07";
			unittalk getcharid(3),strcharinfo(0)+" : (�������A�[�E�B���ْ͋������\��łɂ��ł���B)",1;
			if(!sleep2(700)) end;
			cloakoffnpc "�㓙���|������#SSQ07";
			if(!sleep2(800)) end;
			emotion 56,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: (?��?)/ �c �c �c�`",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : ����H�������Ă�񂾂�H���ʂɊy�������ɂ��Ă�񂶂�˂��I",1;
			if(!sleep2(1500)) end;
			emotion 28,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: ...... (�s_�s)? ",1;
			if(!sleep2(1500)) end;
			emotion 7,"�������A�[�E�B��#SSQ07";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : �����A���ƌ����Ă�̂��}�W�ł킩��Ȃ��B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : ���ʂɗ������ނ̂��֎~�I�������͂������Ȃ�Ɍ�������A���������瑊�Ƃ�ł��āI",1;
			if(!sleep2(1500)) end;
			emotion 56,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: (*'��'*)b ��~",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : ���͂�����̋󂫉Ƃ����ɗ����񂾂��ǁA������̖`���҂������t�𕷂��ė����񂾂�c",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : �������{���̍����t�ł͂Ȃ������I���̎��C�t������A�����X�p�C�Ȃ񂾂ƁI",1;
			if(!sleep2(1500)) end;
			emotion 25,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: X(?��?)X �c�c�I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : �ȂɁH�Ⴄ���Ă����́H�n�@�c�Ȃ炢���񂾂��ǁc",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : �p�g���[�����̐l�ɕ����Ă݂�񂾂��ǁA���͂��̉Ƃ𔃂����Ǝv���Ă���񂾁c���̋߂��ɊJ���̃j���[�X�Ƃ��Ȃ��H",1;
			if(!sleep2(1500)) end;
			emotion 55,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: (*'��'*)",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : �ς��ƌ��Ă��킩��Ȃ��悤���ˁc�܂������c�B�ł��o�����Ԃ�����ƈ��S�ȏꏊ�ł͂��肻�����ȁB",1;
			if(!sleep2(1500)) end;
			emotion 56,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : ���͂����s���Ȃ���B�`���҂̐l��������͋C��t���Ă���B",1;
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: ('_')(._ .)('_')(._ .)",1;
			if(!sleep2(1500)) end;
			cloakonnpc "�������A�[�E�B��#SSQ07";
			if(!sleep2(1500)) end;
			emotion 56,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: (*'��'*)b �c�c�I�������I �c�c �c �c �c�c",1;
			if(!sleep2(1500)) end;
			emotion 12,"�㓙���|������#SSQ07";
			unittalk getnpcid(0,"�㓙���|������#SSQ07"),"�㓙���|������: (�P���P)~�c �c",1;
			if(!sleep2(800)) end;
			cloakonnpc "�㓙���|������#SSQ07";
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : �����t���c�I�I���A�v���o�����I�ς̐K���ł���ˁH",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),""+strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ07"),"�������A�[�E�B�� : ���Ɛl�C�̂Ȃ��ꏊ������Ǘ����Ȃ��Ǝv�����̂ɁA�������p�g���[��������񂾂ȁB��͂肱���ɏZ�ނׂ����ȁH",1;
			if(!sleep2(700)) end;
			cloakonnpc "�������A�[�E�B��#SSQ07";
			if(!sleep2(800)) end;
			unittalk getcharid(3),""+strcharinfo(0)+" : (�󕪂���Ȃ����Ƃ������Ȃ���A�������B)",1;
			if(!checkquest(19174)) {
				setquest 19174;
				compquest 19174;
			}
			close;
		}
	}
	cloakonnpc "�������A�[�E�B��#SSQ07";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 52,"�������A�[�E�B��#SSQ07",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19174))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,99,243,2	script(CLOAKED)	�㓙���|������#SSQ07	21517,{/* 3724 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,134,268,4	script	�������A�[�E�B��#SSQ08	10461,7,7,{/* 3725 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : "+'@str$+"�c"+'@str$+"���Ɓc�ӂށc�N�������Ԉ�����Ƃ����C�����Ȃ����H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : �ǂ����炻��ȕςȒP��������Ă����񂾂낤�B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : �{���Ȃ�x�����ɒʕ񂵂Čx���������Ċm�F��Ƃ�������Ɂc",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : �N��ߕ߂�����A����ߕ߂����肷�镡�G�ȉߒ���ʂ邾�낤���ǁc����Ȃ��Ƃ͂��Ȃ���B",1;
			if(!sleep2(1500)) end;
			emotion 15,"";
			unittalk getcharid(3),strcharinfo(0)+" : ���ӂ������܂��B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : ��͂���Ȃ��B�N�̊��m���Ă�������������B�����N�ɂ����ĊÂ��͂Ȃ����I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : ���̊ԁA�X��ŋ�J���Ă�̂����x�����������B���A����͂����Ƃ��āA�N�͓`���Ƃ��D���Ȃ̂��H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : �����ŋߌ������̓`�������ǁB������̕X�̐�ǂ�����Ɖ����������|�����Ղ�������񂾂�B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : �����ĊO�ɏo�Ă݂�ƁA�X�̊Ԃɗؖ͗l�̖�l�������āc",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : ���̕s���̑��Ղ��c���Ă�c���̑S�Ă̂��Ƃ𑍍����Ă݂����ʁI�`���̃g�J�Q�݂����Ȃ��̂ɈႢ�Ȃ��I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : �W�������c�����������ȁB���������ė����B���͔тɍs������A����J�l�B",1;
			if(!sleep2(800)) end;
			cloakonnpc "�������A�[�E�B��#SSQ08";
			unittalk getcharid(3),strcharinfo(0)+" : �H�H�H�H�H",1;
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : �����t��"+'@a$+"�B�����Ă��[���I�Â��ɂ��Ă���B���̐�ǂɎc�������Ղ𒲍����Ă��邩��c",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			emotion 7,"�������A�[�E�B��#SSQ08";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ08"),"�������A�[�E�B�� : ���������A�Â��ɂ��Ȃ����I",1;
			cloakonnpc "�������A�[�E�B��#SSQ08";
			if(!sleep2(700)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (�{���āA�s���Ă��܂����B)",1;
			if(!checkquest(19175)) {
				setquest 19175;
				compquest 19175;
			}
			close;
		}
	}
	cloakonnpc "�������A�[�E�B��#SSQ08";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 19,"�������A�[�E�B��#SSQ08",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19175))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,130,269,6	script(CLOAKED)	�񓙕��g������#SSQ08	21515,{/* 3726 (cloaking)*/}
icecastle.gat,154,247,6	script	�������A�[�E�B��#SSQ09	10461,7,7,{/* 3727 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			emotion 79,"�������A�[�E�B��#SSQ09";
			if(!sleep2(1000)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : "+'@str$+"�ł����āH���c���H�����H�I���ꂶ��_���Ȃ̂Ɂc",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : (�c��������A�[�E�B���́A�Q�Ă��̂��H���΂��������B)",1;
			if(!sleep2(800)) end;
			cloakoffnpc "�㓙����������#SSQ09";
			if(!sleep2(800)) end;
			emotion 1,"�㓙����������#SSQ09";
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: �ʕ���󂯂Ă��܂��c����H���������Ă��̑O�̃p�g���[�����̌P�������Ⴀ��܂��񂩁H�����łȂɂ��Ă܂����H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : �������������a����Ȃ��ł����B������̖`���҂������t���ԈႦ���̂Œʕ񂢂����܂����I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: ���I�P�������b�オ����܂��ˁB�Ƃ���Ŗ`���҂������t���ԈႦ���ƁI����H���̐l���āA�������̎�`�������Ă�H",1;
			if(!sleep2(1500)) end;
			emotion 40,"";
			unittalk getcharid(3),strcharinfo(0)+" : �n�n�c�͂��c�܂��c���������t���ԈႦ���݂����ł��B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: �n�n�n�A�����ڂ��肵�Ȃ��玄�̖ʓ|���Ƃ𑝂₵�Ă�������̂ł����c",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: �c�܂��A����Ȃ��Ƃ�����܂��ˁB�l���Ċ����ɂ͂Ȃ�܂��񂩂�B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: �����t�̓I�����������a�ɕ����Ă��������B�Ƃ���ŁA�P�����a�H",1;
			if(!sleep2(1500)) end;
			emotion 56,"�������A�[�E�B��#SSQ09";
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : �͂��I�������������a�I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: �悸�ʕ񂵂Ă����������肪�Ƃ��������܂��B�K���ɂ��������̎d������`���Ă�������`���ғa�Ȃ�ł��B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : �Ӂ[�A�悩�����B�����|��������ł���B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: �Ƃ���ł����ɂ͂ǂ��������p�ł�������Ⴂ�܂����H�܂��p�g���[�����̍��i���\�͂܂����Ǝv���܂����c",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : ���̂����i�������Ȋ��������܂��ĂˁA�܊p�Ȃ�߂������ɉƂ��؂肽���Ȃ�������āc�Ƃ�T���ɎQ��܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: ���c�����Ȃ�ł��ˁB�܊p����񂾂���A���ɂł����ł���t�������ł����H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : ���H�I�����ł����H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙����������#SSQ09"),"�㓙����������: �s���܂��傤�B�ł͖`���ғa�A����J�l�ł����B",1;
			if(!sleep2(700)) end;
			cloakonnpc "�������A�[�E�B��#SSQ09";
			cloakonnpc "�㓙����������#SSQ09";
			close;
		}
		if(rand(3)) {	// �s��
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : �����t��"+'@a$+"�ł��I�����l�ł��A�`���ғa�I",1;
			if(!sleep2(1500)) end;
			unittalk getcharid(3),strcharinfo(0)+" : �͂��A�����Ă܂��B�m�F���܂����B���炢�����܂����B",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ09"),"�������A�[�E�B�� : ����[���̕����\�̖`���ғa�Ȃ񂾂ȁB�݂�Ȃɉ�����Ǝ������Ȃ���`",1;
			if(!sleep2(700)) end;
			cloakonnpc "�������A�[�E�B��#SSQ09";
			if(!checkquest(19176)) {
				setquest 19176;
				compquest 19176;
			}
			close;
		}
	}
	cloakonnpc "�������A�[�E�B��#SSQ09";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 2,"�������A�[�E�B��#SSQ09",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19176))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,152,244,8	script(CLOAKED)	�㓙����������#SSQ09	21517,{/* 3728 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}
icecastle.gat,228,134,8	script	�������A�[�E�B��#SSQ10	10461,7,7,{/* 3729 */
	if(checkquest(19162)) {
		unittalk getcharid(3),strcharinfo(0)+" : (�������ȁc�c�����������K����������Ȃ��B�m�F���Ă݂悤)",1;
		if(select("�����t���m�F����","�m�F���Ȃ�") == 2) {
			unittalk "�������A�[�E�B�� : ����H",1;
			close;
		}
		input '@str$;
		unittalk getcharid(3),strcharinfo(0)+" : ���炵�܂��A�A�[�E�B������B�����t�̊m�F���������܂��B",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : "+'@str$+"�c"+'@str$+"�c�ԓ����ǂ����B",1;
		if(!sleep2(1500)) end;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		if('@str$ != '@q$) {
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : �c�{���A���Õi������ʓ|�Ȃ̂ɁA�X�p�C�܂ŁH���ĉ������`�A�p�g���[�����I",1;
			if(!sleep2(800)) end;
			cloakoffnpc "�㓙���|������#SSQ10";
			if(!sleep2(800)) end;
			emotion 56,"�㓙���|������#SSQ10";
			unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (?��?)�c �c �c �c�c�H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ����H�I���������ă|�������H������ˁI�A�C�X�t�i���V����������菬�����������́A�ԈႢ�Ȃ��B������A���I",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (��_��?) �c �c�H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ��������I�|����������Ȃ����B��������͂����C�ŁH���������l���Ă���������H",1;
			if(!sleep2(1500)) end;
			emotion 56,"�㓙���|������#SSQ10";
			unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (?_?) �c�I �c �c �c �c �c�H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ���͂��O�̂�������ɑ�R���y�����Ă�������񂾁B����ɂ��Ă����O�p�g���[�����ɂȂ����񂾂ȁB",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : �����͓���ƕ����Ă����̂ɁA���i�����񂾂ȁH",1;
			if(!sleep2(1500)) end;
			emotion 56,"�㓙���|������#SSQ10";
			unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (*'��'*) �c �c�I �c�c �c �c�H�c �c�c �c �c �c�H",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ���A�������I�v���U��߂��Ċ������āA�Y���Ƃ��낾������B���H���m�荇���H",1;
			if(!sleep2(1500)) end;
			emotion 56,"�㓙���|������#SSQ10";
			unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: ('��') �c �c �c �c�c �c",1;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : �����Ȃ񂾁c",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ���́A�C��t���Ă��������B���ō����t���ԈႦ�āA����킵���c",1;
			if(!sleep2(1500)) end;
			unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ���Õi����ɗ��������Ȃ̂ɁB",1;
			if(!sleep2(800)) end;
			cloakonnpc "�������A�[�E�B��#SSQ10";
			if(!sleep2(700)) end;
			emotion 56,"�㓙���|������#SSQ10";
			unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (?��?)/ �c�`",1;
			if(!sleep2(1500)) end;
			emotion 56,"�㓙���|������#SSQ10";
			unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (-_-a);;; �c�c �c�c �c �c �c�c",1;
			if(!sleep2(1500)) end;
			cloakonnpc "�㓙���|������#SSQ10";
			unittalk getcharid(3),strcharinfo(0)+" : (�ӂށc���������Ă��񂾂�H�킩��Ȃ��B)",1;
			close;
		}
		if(rand(3)) {	// �s��
		}
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ���́A������Z�L�����e�B���厖�ł��A����Ȃ��Ƃ������Ēp���������Ȃ��̂��H",1;
		if(!sleep2(1500)) end;
		emotion 40,"�������A�[�E�B��#SSQ10";
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : �L�����b�g�`�A�L�����b�g�I�L�����b�g�`�A�L�����b�g�I",1;
		if(!sleep2(3000)) end;
		emotion 19,"�������A�[�E�B��#SSQ10";
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : ���ꂶ��Ȃ��H���c�Ƃ������Ƃ́A�����܃o������ȁH",1;
		if(!sleep2(1500)) end;
		emotion 9,"�������A�[�E�B��#SSQ10";
		emotion 9,"";
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : �c �c �c�B",1;
		unittalk getcharid(3),strcharinfo(0)+" : �c �c �c�B",1;
		if(!sleep2(800)) end;
		cloakoffnpc "�㓙���|������#SSQ10";
		if(!sleep2(700)) end;
		emotion 56,"�㓙���|������#SSQ10";
		unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (?��?)/ �c �c�c�`",1;
		if(!sleep2(1500)) end;
		emotion 56,"�㓙���|������#SSQ10";
		unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (?_?)�H�c�c �c�H",1;
		if(!sleep2(1500)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �����������K���̃X�p�C�����t���܂����B���݂��C�܂�������A�����A��čs���Ă��������B",1;
		if(!sleep2(1500)) end;
		emotion 56,"�㓙���|������#SSQ10";
		emotion 9,"�������A�[�E�B��#SSQ10";
		unittalk getnpcid(0,"�㓙���|������#SSQ10"),"�㓙���|������: (-_-a)�H�c �c�c �c�c�c �c�c",1;
		unittalk getnpcid(0,"�������A�[�E�B��#SSQ10"),"�������A�[�E�B�� : �c �c �c",1;
		if(!sleep2(700)) end;
		cloakonnpc "�������A�[�E�B��#SSQ10";
		cloakonnpc "�㓙���|������#SSQ10";
		if(!sleep2(700)) end;
		if(checkquest(19168)) delquest 19168;
		if(checkquest(19169)) delquest 19169;
		if(checkquest(19170)) delquest 19170;
		if(checkquest(19171)) delquest 19171;
		if(checkquest(19172)) delquest 19172;
		if(checkquest(19173)) delquest 19173;
		if(checkquest(19174)) delquest 19174;
		if(checkquest(19175)) delquest 19175;
		if(checkquest(19176)) delquest 19176;
		delquest 19162;
		setquest 19163;
		unittalk getcharid(3),strcharinfo(0)+" : (�X��ɐ��������X�p�C�̑{���ɐ��ʂ��o���B�I�������ɕ񍐂��悤�B)",1;
		close;
	}
	cloakonnpc "�������A�[�E�B��#SSQ10";
	emotion 22,"",1;
	unittalk getcharid(3),strcharinfo(0)+" : �i�����I�@�����Ă��܂����B���ԈႦ���ȁH�j",1;
	end;
OnTouch:
	emotion 18,"�������A�[�E�B��#SSQ10",1;
	end;
OnQuestInfo:
	if(checkquest(19162) && !checkquest(19177))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
icecastle.gat,225,136,6	script(CLOAKED)	�㓙���|������#SSQ10	21517,{/* 3730 (cloaking)*/
	end;
OnInit:
	setnpctitle "<�C�[�O���p�g���[����>";
	end;
}

-	script	�ڐG�ꏊ#EP20_DQ	-1,{/* 3732 */
	if(checkquest(19165)) {
		unittalk getcharid(3),strcharinfo(0)+" : �i�w�肳�ꂽ�ꏊ����A�C�z��������j",1;
		set '@today_q,getvariableofnpc('TodayQuestion,"�I����������#ep20_DQ_2");
		set '@q$,getvariableofnpc(getelementofarray('Question$,'@today_q),"�I����������#ep20_DQ_2");
		set '@today_a,getvariableofnpc('TodayAnswer,"�I����������#ep20_DQ_2");
		set '@a$,getvariableofnpc(getelementofarray('Answer$,'@today_a),"�I����������#ep20_DQ_2");
		mes "[�N��]";
		mes "�����ȁI";
		mes "�ǂ̐w�c�̎҂��H";
		mes "^000000 "+'@q$+"^000000�c";
		next;
		unittalk getcharid(3),strcharinfo(0)+" : �i�����t�𓚂��悤�j",1;
		input '@str$;
		if('@str$ != '@a$) {
			mes "[�N��]";
			mes "�܂����I�@�o������!?";
			cloakonnpc;
			next;
			mes "�]������������Ă��܂����]";
			close;
		}
		mes "[�N��]";
		mes "�悵�A����������񂾁B�����čs���I";
		mes "���K���Ɍ�����Ȃ�I";
		next;
		delquest 19165;
		setquest 19166;
		cloakonnpc;
		unittalk getcharid(3),strcharinfo(0)+" : �i���̏����ꂽ�����󂯎�����B�I�������ɕ񍐂��悤�j",1;
		close;
	}
	unittalk getcharid(3),strcharinfo(0)+" : �C�z�͊������Ȃ��B",1;
	end;
OnTouch:
	if(checkquest(19165))
		emotion 56,strnpcinfo(0),1;
	else
		cloakonnpc;
	end;
OnQuestInfo:
	if(checkquest(19165))
		showevent 0, 3;
	else
		showevent 9999, 0;
	end;
}
jor_back5.gat,296,149,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19169	10429,5,5,	/* 3732 */
jor_twice.gat,76,100,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19170	10429,5,5	/* 3733 */
jor_maze.gat,253,267,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19171	10429,5,5	/* 3734 */
jor_root1.gat,39,93,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19172	10429,5,5	/* 3735 */
jor_root2.gat,19,44,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19173	10429,5,5	/* 3736 */
jor_twig.gat,192,211,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19174	10429,5,5	/* 3737 */
jor_sanct.gat,120,86,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19175	10429,5,5	/* 3738 */
jor_root3.gat,347,147,4	duplicate(�ڐG�ꏊ#EP20_DQ)	�ڐG�ꏊ#Q19176	10429,5,5	/* 3739 */

//============================================================
// �V���������̋��菊�N�G�X�g
//------------------------------------------------------------
icas_in.gat,243,66,5	script	�g��������#ep20_DQ_5	10461,{/* 3740 */
	if(EP20_1QUE == 100) {
		if(!checkquest(131260)) {
			mes "[�g��������]";
			mes "��Ċ�������A�l�ԁB";
			mes "���́c�c�B";
			next;
			mes "[�z������]";
			mes "�䂪�]�Z��I";
			unittalk getnpcid(0,"�z������#ep19in"),"�z������ : ��������̒�̑��q����I",1;
			next;
			mes "[�]������]";
			mes "�c�c�䂪�]�Z��Ȃ񂾁B";
			next;
			mes "[�g��������]";
			mes "�c�c���ށB";
			mes "����A�ۈ牀�ɔz�����ꂽ�g�����������B";
			unittalk getnpcid(0,"�]������#ep19_dq_kitche"),"�]������ : �H���B�H���B",1;
			next;
			mes "[�g��������]";
			mes "�c�c�H���̐~�[�ɔz�����ꂽ";
			mes "�g�����������B";
			unittalk getnpcid(0,"�z������#ep19in"),"�z������ : �L���n�n�I",1;
			unittalk getnpcid(0,"�g������#ep19in"),"�g������ : �L���n�n�I",1;
			next;
			mes "[�g��������]";
			mes "�p�g���[���́A�ǂ����K���ɉ��Ȃ��c�c";
			mes "����Ō����Ă���̂����ɗ�����B";
			mes "���������Ă��A�q�������𖰂点�邱�Ƃ�";
			mes "���ӂȂ񂾁B";
			next;
			mes "[�g��������]";
			mes "�c�c�b�͕ς�邪";
			mes "�]�������ɕ������b�ł�";
			mes "�N�͐F�X�ƕ��X���������Ă����";
			mes "�炵������Ȃ����B";
			next;
			mes "[�g��������]";
			mes "���������ɔz�����ꂽ�ȏ�A";
			mes "�q���������D�������ȕ���p�ӂ������B";
			mes "������ւ�ɂ���E�~�E�V��|����";
			mes "�H�ނ���ɓ��ꂽ���񂾁B";
			next;
			mes "[�g��������]";
			mes "�����A���͓K�������킸";
			mes "�p�g���[������O���ꂽ�g�c�c";
			mes "����苭���l�Ԃ�B";
			mes "��`���Ă���Ȃ����H";
			next;
			if(select("����Ɏ��ɍs��","�Ԃ߂�") == 2) {
				mes "[�g��������]";
				mes "�����̂��Ƃł͂��邯��ǁc�c";
				mes "�����B�����̂��Ƃ���c�c�B";
				unittalk getnpcid(0,"�]������#ep19_dq_kitche"),"�]������ : �����łۂ���Ƃ��Ă��Ȃ��ŁA���̎d������`���Ă���I",1;
				unittalk getnpcid(0,"�g��������#ep20_DQ_5"),"�g�������� : �����ƂƁA�s����A�s���I�@������Ƒ҂āI",1;
				close;
			}
			mes "[�g��������]";
			mes "���肪�Ƃ��A�l�ԁI";
			mes "�ڍׂ�`���邩��";
			mes "������x�b�������Ă���B";
			close2;
			setquest 131260;
			compquest 131260;
			end;
		}
		mes "[�g��������]";
		mes "���������ɔz�����ꂽ�ȏ�A�q���������D�������ȕ������肢�������B";
		mes "������ւ�ɂ���E�~�E�V��|����";
		mes "�H�ނ��̂��Ă��ė~�����B";
		while(1) {
			next;
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̊C��)") == 2) {
				mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
				next;
				if(!checkquest(8855) && !checkquest(8857)) {
					mes "[�g��������]";
					cutin "ep19_iwin03.png", 2;
					mes "�܂��A����łȂ��˗�������񂾂��A";
					mes "�����A���n�Ɍ��������H";
					next;
					if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(���ĕt�����؂̊C��)") == 1)
						break;
					mes "[�g��������]";
					cutin "ep19_iwin03.png", 2;
					mes "�悵�I";
					mes "���ꂶ�ጻ�n�֌������Ă���I";
				}
				else {
					mes "[�g��������]";
					cutin "ep19_iwin03.png", 2;
					mes "�悵�I";
					mes "�����������n�Ɍ��������H";
				}
				close2;
				cutin "kafra_01.bmp", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_back4j.gat", 10, 370;
				end;
			}
			break;
		}
		setarray '@questname$,"�ՂɂՂɒ������W�@","�ՂɂՂɒ������W�A";
		setarray '@questid,8855,8857;
		setarray '@itemlist,1001233,5,1001232,5,0,1001231,5;
		setarray '@coolid,8856,8858;
		setarray '@gainlist,1001217,10,1001217,10;
		setarray '@explist,950000000,712500000,1100000000,825000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// �ՂɂՂɒ������W�@
			if(checkquest(8856)) {
				if(checkquest(8856)&2 == 0) {
					mes "[�g��������]";
					cutin "ep19_iwin03.png", 2;
					mes "���肪�Ƃ��A�l�ԁB";
					mes "�����܂����肢�����B";
					mes "���������A�����Ă��Ă��ꂽ�H�ނ����ǁA";
					mes "�O�ɑ��̐l�Ԃ�������Ă݂ċV���Ă���B";
					mes "�l�Ԃ̌��ɂ͉��Ȃ��̂����m��Ȃ��B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ՂɂՂɒ������W�@^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(8855)) {
				if(checkquest(8855)&4 == 0 || countitem(1001233) < 5 || countitem(1001232) < 5) {
					mes "[�g��������]";
					cutin "ep19_iwin03.png", 2;
					mes "^e5555e�V�g�E�~�E�V^000000��";
					mes "^e5555e��E�T�M�E�~�E�V^000000���e10�C���|���āA";
					mes "<ITEM>[�قǂ悭�Â��ՂɂՂɌu���זE]<INFO>1001233</INFO></ITEM> 5��";
					mes "<ITEM>[���������h���ՂɂՂɌu���זE]<INFO>1001232</INFO></ITEM> 5��";
					mes "�̂��Ă��Ă���B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ՂɂՂɒ������W�@^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 8855;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ՂɂՂɒ������W�@^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�ՂɂՂɒ������W�@^000000�v";
				mes "<���e1>";
				mes "�ΏہF<URL>�V�g�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_ANGEL_ICESLUG</INFO></URL>�@10��";
				mes "�ΏہF<URL>��E�T�M�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_RABBIT_ICESLUG</INFO></URL>�@10��";
				mes "�̓�����";
				next;
				mes "<���e2>";
				mes "�A�C�e���F<ITEM>�قǂ悭�Â��ՂɂՂɌu���זE<INFO>1001233</INFO></ITEM>�@5��";
				mes "�A�C�e���F<ITEM>���������h���ՂɂՂɌu���זE<INFO>1001232</INFO></ITEM>�@5��";
				mes "�̔[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 19G ( 19000000000 )";
				mes "��950000000��20��󂯎��܂��B";
				mes "JobExp 14.25G ( 14250000000 )";
				mes "��712500000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�ՂɂՂɒ������W�@^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 1001233,5;
				delitem 1001232,5;
				delquest 8855;
				setquest 8856;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 950000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,712500000,0;
				mes "[�g��������]";
				cutin "ep19_iwin03.png", 2;
				mes "���肪�Ƃ��A�l�ԁI";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 19G";
				mes "( 19000000000 )";
				mes "��950000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 14.25G";
				mes "( 14250000000 )";
				mes "��712500000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[�g��������]";
			cutin "ep19_iwin03.png", 2;
			mes "^e5555e�V�g�E�~�E�V^000000��";
			mes "^e5555e��E�T�M�E�~�E�V^000000���e10�C���|���āA";
			mes "<ITEM>[�قǂ悭�Â��ՂɂՂɌu���זE]<INFO>1001233</INFO></ITEM> 5��";
			mes "<ITEM>[���������h���ՂɂՂɌu���זE]<INFO>1001232</INFO></ITEM> 5��";
			mes "�̂��Ă��Ă���B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�ՂɂՂɒ������W�@^000000�v";
			mes "<���e1>";
			mes "�ΏہF<URL>�V�g�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_ANGEL_ICESLUG</INFO></URL>�@10��";
			mes "�ΏہF<URL>��E�T�M�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_RABBIT_ICESLUG</INFO></URL>�@10��";
			mes "�̓�����";
			next;
			mes "<���e2>";
			mes "�A�C�e���F<ITEM>�قǂ悭�Â��ՂɂՂɌu���זE<INFO>1001233</INFO></ITEM>�@5��";
			mes "�A�C�e���F<ITEM>���������h���ՂɂՂɌu���זE<INFO>1001232</INFO></ITEM>�@5��";
			mes "�̔[�i��";
			mes "�����̒B���ŕ񍐂��\�ł��B";
			mes "�N�G�X�g���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�g��������]";
				cutin "ep19_iwin03.png", 2;
				mes "�ށA���f����̂��H";
				mes "���ꂪ����΁A";
				mes "�玙�̎�Ԃ����邾���c�c�d�����Ȃ��B";
				mes "�܂��肪�󂢂����ɗ��ނ�I";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 8855;
			if(checkquest(8856)) delquest 8856;
			mes "[�g��������]";
			cutin "ep19_iwin03.png", 2;
			mes "���肪�Ƃ��A�l�ԁI";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�ՂɂՂɒ������W�@^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 1:	// �ՂɂՂɒ������W�A
			if(checkquest(8858)) {
				if(checkquest(8858)&2 == 0) {
					mes "[�g��������]";
					cutin "ep19_iwin03.png", 2;
					mes "���肪�Ƃ��A�l�ԁB";
					mes "�����܂����肢�����B";
					mes "���������A�����Ă��Ă��ꂽ�H�ނ����ǁA";
					mes "�O�ɑ��̐l�Ԃ�������Ă݂ċV���Ă���B";
					mes "�l�Ԃ̌��ɂ͉��Ȃ��̂����m��Ȃ��B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ՂɂՂɒ������W�A^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(8857)) {
				if(checkquest(8857)&4 == 0 || countitem(1001231) < 5) {
					mes "[�g��������]";
					cutin "ep19_iwin03.png", 2;
					mes "^e5555e�����x�E�~�E�V^000000��15�C�|����";
					mes "<ITEM>[������Ǝ_���ς��ՂɂՂɌu���זE]<INFO>1001231</INFO></ITEM> 5��";
					mes "�̂��Ă��Ă���B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ՂɂՂɒ������W�A^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 8857;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�ՂɂՂɒ������W�A^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�ՂɂՂɒ������W�A^000000�v";
				mes "<���e1>";
				mes "�ΏہF<URL>�����x�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>�@15��";
				mes "�̓�����";
				next;
				mes "<���e2>";
				mes "�A�C�e���F<ITEM>������Ǝ_���ς��ՂɂՂɌu���זE<INFO>1001231</INFO></ITEM>�@5��";
				mes "�̔[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 22G ( 22000000000 )";
				mes "��1100000000��20��󂯎��܂��B";
				mes "JobExp 16.5G ( 16500000000 )";
				mes "��825000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�ՂɂՂɒ������W�A^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				delitem 1001231,5;
				delquest 8857;
				setquest 8858;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 1100000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,825000000,0;
				mes "[�g��������]";
				cutin "ep19_iwin03.png", 2;
				mes "���肪�Ƃ��A�l�ԁI";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 22G";
				mes "( 22000000000 )";
				mes "��1100000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 16.5G";
				mes "( 16500000000 )";
				mes "��825000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[�g��������]";
			cutin "ep19_iwin03.png", 2;
			mes "^e5555e�����x�E�~�E�V^000000��15�C�|����";
			mes "<ITEM>[������Ǝ_���ς��ՂɂՂɌu���זE]<INFO>1001231</INFO></ITEM> 5��";
			mes "�̂��Ă��Ă���B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�ՂɂՂɒ������W�A^000000�v";
			mes "<���e1>";
			mes "�ΏہF<URL>�����x�E�~�E�V<INFO>https://rotool.gungho.jp/monster/EP20_MELIBE_ICESLUG</INFO></URL>�@15��";
			mes "�̓�����";
			next;
			mes "<���e2>";
			mes "�A�C�e���F<ITEM>������Ǝ_���ς��ՂɂՂɌu���זE<INFO>1001231</INFO></ITEM>�@5��";
			mes "�̔[�i��";
			mes "�����̒B���ŕ񍐂��\�ł��B";
			mes "�N�G�X�g���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�g��������]";
				cutin "ep19_iwin03.png", 2;
				mes "�ށA���f����̂��H";
				mes "���ꂪ����΁A";
				mes "�玙�̎�Ԃ����邾���c�c�d�����Ȃ��B";
				mes "�܂��肪�󂢂����ɗ��ނ�I";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 8857;
			if(checkquest(8858)) delquest 8858;
			mes "[�g��������]";
			cutin "ep19_iwin03.png", 2;
			mes "���肪�Ƃ��A�l�ԁI";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�ՂɂՂɒ������W�A^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	//������
	close;
OnQuestInfo:
	if(EP20_1QUE == 100) {
		if((checkquest(8855) && checkquest(8855)&4 == 0 || countitem(1001233) < 5 || countitem(1001232) < 5) && 
			(checkquest(8857) && checkquest(8857)&4 == 0 || countitem(1001231) < 5))
			showevent 0, 3, "�g��������#ep20_DQ_5";
	}
	end;
}
icas_in.gat,242,45,3	script	�R�|#�ۈ牀01	21995,{/* 3741 */
	unittalk "�҂�B",1;
	end;
}
icas_in.gat,243,45,5	script	�R�|#�ۈ牀02	21995,{/* 3742 */
	unittalk "�҂�҂�B",1;
	end;
}
icas_in.gat,241,44,5	script	�R�|#�ۈ牀03	21995,{/* 3743 */
	unittalk "���カ��B",1;
	end;
}
icas_in.gat,242,42,3	script	�R�|#�ۈ牀04	21995,{/* 3744 */
	unittalk "������B",1;
	end;
}
icas_in.gat,243,42,1	script	�R�|#�ۈ牀05	21995,{/* 3745 */
	unittalk "�҂�т�B�҂�. �B",1;
	end;
}
icas_in.gat,244,43,7	script	�R�|#�ۈ牀06	21995,{/* 3746 */
	unittalk "�҂���B",1;
	end;
}
icas_in.gat,244,44,5	script	�R�|#�ۈ牀07	21995,{/* 3747 */
	unittalk "�҂���҂���B",1;
	end;
}
icas_in.gat,253,49,5	script	�R�|#�ۈ牀08	21995,{/* 3748 */
	unittalk "�҂イ���B",1;
	end;
}
icas_in.gat,241,58,3	script	�R�|#�ۈ牀09	21995,{/* 3749 */
	unittalk "�҂�B",1;
	end;
}
icas_in.gat,240,58,5	script	�R�|#�ۈ牀10	21995,{/* 3750 */
	unittalk "���カ��B",1;
	end;
}
icas_in.gat,252,58,1	script	�R�|#�ۈ牀11	21995,{/* 3751 */
	unittalk "�҂���I",1;
	end;
}
icas_in.gat,252,49,5	script	�R�|#�ۈ牀12	21995,{/* 3752 */
	unittalk "�҂�I",1;
	end;
}
icas_in.gat,240,49,7	script	�R�|#�ۈ牀13	21995,{/* 3753 */
	unittalk "�҂���҂���B�҂���B",1;
	end;
}

//============================================================
// �V���������̋��菊�N�G�X�g
//- Registry -------------------------------------------------
// EP20_2QUE -> 0�`	����:100
//------------------------------------------------------------
icecastle.gat,46,164,5	script	�A�[�E�B�����m#20ms60	21515,{/* 3754 */
	unittalk "�����C���C�������Ⴄ��A�}�W�Łc�c",1;
	if(EP20_2QUE > 0) {
		mes "[�A�[�E�B�����m]";
		mes "���K���̕ߗ��ɉ�ɍs����ł���ˁH";
		mes "�����ɂ��ē��������܂��ˁB";
		close2;
		warp "icas_in2.gat", 33, 114;
		end;
	}
	if(BaseLevel < 240 || EP20_1QUE < 100) {
		mes "[�A�[�E�B�����m]";
		mes "�`���ғa�I";
		mes "���肢���������Ƃ�����̂ł���";
		mes "��ŉ��߂Ă��肢�����Ă��炢�܂��I";
		mes "�ł́I";
		next;
		mes "^e6328c�]���̃N�G�X�g��i�s����ɂ�";
		mes "^e6328c�@�ȉ��̏����𖞂����K�v������܂��]";
		mes "^e6328c�@�EBaseLv240�ȏ�";
		mes "^e6328c�@�E�N�G�X�g�u���ȂȂ��ҁv�̃N���A";
		mes "�@^000000";
		mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
		messize 180,364;
		close;
	}
	mes "[�A�[�E�B�����m]";
	mes "�`���ғa�I";
	mes "���傤�ǒT���Ă����Ƃ���ł��I";
	mes "�����ꏏ�ɗ��Ă��������B";
	next;
	menu "�����������́H",-;
	mes "[�A�[�E�B�����m]";
	mes "�z�������ߗ��ɂ������K���Ȃ̂ł���";
	mes "�������̎�ɕ����Ȃ���ł��I";
	mes "����Ȗ��ȓz�͏��߂Ăł��I";
	emotion 54,"�A�[�E�B�����m#20ms60",1;
	next;
	mes "[�A�[�E�B�����m]";
	mes "�o���L�x�Ȗ`���ғa�Ȃ�";
	mes "�z���ǂ��ɂ��ł���񂶂�Ȃ�����";
	mes "�v���܂��āc�c";
	mes "�ǂ����������������Ă��������I";
	next;
	if(select("�s���Ă݂܂��傤","��ōs���܂�") == 2) {
		mes "[�A�[�E�B�����m]";
		mes "���c�c�����Ȃ�߂��ł����ˁH";
		mes "�ł͎��Ԃ��o�������ɂ��肢���܂��B";
		mes "�{���ɍ����Ă����ł��c�c�B";
		close;
	}
	mes "[�A�[�E�B�����m]";
	mes "������܂��I";
	mes "�ߗ��̐g���Ȃ̂Ŋu�����Ă����ł��B";
	mes "�����ɂ��ē��������܂��ˁB";
	setquest 17712;
	set EP20_2QUE,1;
	close2;
	warp "icas_in2.gat", 33, 114;
	end;
OnQuestInfo:
	if(BaseLevel >= 240 && EP20_1QUE >= 100 && EP20_2QUE == 0)
		showevent 1, 1;
	else if(EP20_2QUE == 100)
		showevent 6, 1, "�A�[�E�B�����m#20ms60";
	// 1 �ȊO �s��
	else if(EP20_2QUE >= 3)
		showevent 1, 1;
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[�ړ�]";
	end;
}

icas_in2.gat,33,109,0	warp	#20ms64	1,1,icecastle.gat,51,164
icas_in2.gat,33,114,0	script	#20ms60	139,3,3,{/* 3756 */
	if(EP20_2QUE < 100) {
		cloakoffnpc "�z����#20ms60";
		cloakoffnpc "�A�[�E�B�����m#20ms61";
		cloakoffnpc "�A�[�E�B�����m#20ms63";
		cloakoffnpc "�A�[�E�B�����m#20ms64";
		cloakoffnpc "�A�[�E�B�����m#20ms65";
		if(EP20_2QUE >= 5)
			cloakoffnpc "���C�W�[#20ms60";
	}
	else {
		cloakonnpc "�z����#20ms60";
		cloakonnpc "�A�[�E�B�����m#20ms61";
		cloakonnpc "�A�[�E�B�����m#20ms63";
		cloakonnpc "�A�[�E�B�����m#20ms64";
		cloakonnpc "�A�[�E�B�����m#20ms65";
	}
	end;
}
icas_in2.gat,30,121,5	script	�i�h���K���h#ep20_DQ_6	10474,{/* 3757 */
	if(EP20_2QUE == 1) {
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "���������A�m���Ă邱�Ƃ𒝂�B";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�i�h���K���h]";
		mes "��������c�c����������";
		mes "����ׂ�C�͂��Ȃ��̂����H";
		unittalk "�i�h���K���h : ��������Ď���ł����̂��c�c",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "�����H���A�H���Ȃ�����I";
		mes "�m��Ȃ��l��������";
		mes "�A�[�E�B���͕ߗ��ɑ΂���";
		mes "���т��o���Ȃ��̂���";
		mes "�������邶��Ȃ����I";
		next;
		mes "[�i�h���K���h]";
		mes "����ȕ��́c�c���O�炪��߁B";
		mes "�܂�Œ��̉a�݂������B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "���[���[���[�[�I�@�������I�@������!!";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : �����A�Ԃ���΂��Ă��I",1;
		emotion 54,"�A�[�E�B�����m#20ms61";
		next;
		mes "[�A�[�E�B�����m]";
		mes "������C���A������_���B";
		mes "�ł��邾���̐H�����W�߂��̂�";
		mes "�킪�܂܌����āA�H�ׂȂ����R�͂ȂɁH";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : ���̉a���ƌ����₪�����I",1;
		emotion 6,"�A�[�E�B�����m#20ms62";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�����s���Ȃ񂾂�H";
		mes "���񂽂ЂƂ�̋@�������̂�";
		mes "�������͑S�����C���C�����Ă�B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : ����ȏ�A�䖝����K�v����H",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms64"),"�A�[�E�B�����m : ���������M�ŁA�X�̏邪�n�����Ⴄ�I",1;
		next;
		mes "[�i�h���K���h]";
		mes "�����c�c῝򂪁c�c";
		mes "�ڂ����邮����c�c�B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : �ڂ��񂵂Ă���̂́A����������`�B",1;
		emotion 53,"�i�h���K���h#ep20_DQ_6";
		emotion 53,"�A�[�E�B�����m#20ms65";
		next;
		mes "[�i�h���K���h]";
		mes "���̍Ō�̌��t�𕷂��Ă���B";
		mes "������������A���ꂪ�Ō��";
		mes "�Ȃ邩������Ȃ��c�c�B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�}�ɋC�������Ă邼!?";
		mes "���K���������āA�݂�Ȃ����Ȃ̂��H";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms64"),"�A�[�E�B�����m : ���������ɒ[�Ȃ񂾂�I",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�����炪�p�ӂ������̂�";
		mes "�S�����ۂ��Ă����āc�c";
		mes "�����A�����~�����ƌ����Ă������H";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�A�[�E�B�����m]";
		mes "�c�c�w�r�C�`�S�c�c���������ȁH";
		unittalk getnpcid(0,"�z����#20ms60"),"�z���� : �Ȃ񂾁A����H",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : �m���Ă��狳���Ă�I",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : �N���m��Ȃ��񂾁I",1;
		next;
		mes "[�i�h���K���h]";
		mes "^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]";
		mes "^i[1001154]�w�r�C�`�S�c�w�r�C�`�S�c^e[27]";
		mes "^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]^i[1001154]";
		next;
		mes "[�A�[�E�B�����m]";
		mes "���ł��ǂ�����A�H�ׂ��c�c";
		mes "�Ȃ�ł���Ȃɂ킪�܂܂Ȃ񂾁H";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : ���Ȃ�Ă܂��A������H�ׂĂ��Ȃ��̂ɁI",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "��T�ԂقǕ����Ă�����";
		mes "���ł����肪�����H�ׂ�悤�ɂȂ���āB";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : �����̔k����������悤�Ȃ��ƌ����Ă���",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "�܂����������o���Ă��Ȃ��̂�";
		mes "�Q�����ɂ������Ȃ��H";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : ����́A������Ƃ��ꂾ��ˁB",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "�삦�����邾������B";
		mes "���ȂȂ����炢�ɂˁI";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : ����Ȃ�c�c�܂��H",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "���̂܂܂��ᎄ�����̕���";
		mes "��ɓ|�ꂿ�܂��I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms64"),"�A�[�E�B�����m : ����",1;
		emotion 54,"�A�[�E�B�����m#20ms65";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�{���ɍ������ȁc�c";
		mes "�ǂ����悤���H";
		unittalk getnpcid(0,"�z����#20ms60"),"�z���� : ���`�`��c�c",1;
		chgquest 17712,17713;
		set EP20_2QUE,2;
		close2;
		cutin "ep19_iwin09.png", 255;
		end;
	}
	if(EP20_2QUE == 4) {
		mes "[�i�h���K���h]";
		mes "�����c�c�������E���c�c�B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : �����A�{���ɂ��炢�炷��",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "�܂����������ĂȂ��񂶂�Ȃ��H";
		mes "�{���ɋ󕠂Ȃ�A�Ȃ�ł��H������B";
		next;
		mes "[�i�h���K���h]";
		mes "��؂Ȏ����Q��������Ȃ�āc�c";
		mes "�{���Ɏg����z��c�c�B";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�������͂��񂽂̕�������Ȃ��B";
		mes "���񂽂̌������Ƃ𕷂��K�v��";
		mes "�ǂ��ɂ���񂾁H";
		next;
		cutin "ep19_iwin09.png", 255;
		menu "�w�r�C�`�S�������Ă��܂�����",-;
		mes "[�i�h���K���h]";
		mes "�w�r�C�`�S!!";
		next;
		mes "[�i�h���K���h]";
		mes "�ӂ��I";
		mes "���������I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : ��F���ς�������I",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "���������ȁH";
		mes "������͂��O�̗v�]���������B";
		mes "���́A���O�̒m���Ă邱�Ƃ�";
		mes "�S���f���Ă��炤���I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : ��[���}���ۂ�",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : �c�c�i�D����",1;
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�i�h���K���h]";
		mes "���������΂����̂��A�킩��Ȃ��ȁB";
		mes "�����c�c";
		mes "�ŋ߃��X�K���h�l���O���痈���l�Ԃ�";
		mes "����������Ă����ȁB";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "����͂��łɒm���Ă�B";
		mes "�ǂ��ŉ�������Ă����񂾁H";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�i�h���K���h]";
		mes "�����m���B";
		mes "�����I";
		mes "�O����l�Ԃ��������͉�����u��";
		mes "���͂��z�����Ă���I";
		next;
		mes "[�A�[�E�B�����m]";
		mes "������m���Ă��B";
		mes "��������������K���h�̕�����";
		mes "�g�����߂Ȃ̂��H";
		next;
		mes "[�i�h���K���h]";
		mes "���H";
		mes "�����Ȃ́H";
		mes "�m��Ȃ������c�c�B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "���ɉ����m��Ȃ��̂��H";
		mes "���X�K���h�̖ړI�Ƃ��c�d�E";
		mes "��_�Ƃ��I";
		next;
		mes "[�i�h���K���h]";
		mes "�m��Ȃ��B";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�ŏ㋉�̃��K���Ȃ񂾂�[�[�I";
		mes "�Ȃ�ŉ����m��Ȃ��񂾁I";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�i�h���K���h]";
		mes "�ŋ߁A���\���Ă��B";
		mes "�����ߕt�����Ƃ�������";
		mes "�勳�ł��鎄���������Ă�ł�";
		mes "�����Ŏd����������񂾁B";
		next;
		mes "[�i�h���K���h]";
		mes "���͂���Ȏd���Ȃǂ�������Ɩ�����";
		mes "��������Ȃ��̂�";
		mes "�d����������񂾂�B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�c�c���S�ɂ��V����܂���Ȃ����B";
		next;
		mes "[�i�h���K���h]";
		mes "�Ƃ���ŁA�����͂������ǂ��B";
		mes "�y������ȁB";
		mes "�����ƁA�����ɏZ�݂������炢���B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�����b���Ă��炢�Ȃ���";
		mes "�߂����������Ă��ƁH";
		mes "�Ƃ�ł��Ȃ��I";
		next;
		mes "[�i�h���K���h]";
		mes "�Ȃ�A�������瓦���o����";
		mes "�S���A�o�����Ă��Ƃ��悤�B";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "����͍���B";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�i�h���K���h]";
		mes "���ɂ��H�ׂ�������";
		mes "�v���o�����񂾂��c�c�H";
		next;
		mes "[�A�[�E�B�����m]";
		mes "����ȏ�̓_���I";
		mes "�p�m�炸�ɂ��قǂ�����!!";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : �����o�Ă��A�o�čs����I",1;
		next;
		mes "[�i�h���K���h]";
		mes "�t�@�@�c�c�т�H�����疰���Ȃ����B";
		mes "���Q�����邩��������Ă���B";
		mes "1���Ԉȏ�Q��̂͂悭�Ȃ�����";
		mes "���̑O�ɋN�����悤�ɁB";
		mes "�N�����炷���H�������邼�B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�����A���񂴂肾�I�@�A���Ă���I";
		mes "����͉�����Ă���c�c";
		mes "���񂽂ɂ��厖�ȉƑ���";
		mes "�F�B�����邾�낤����ȁI";
		next;
		mes "[�i�h���K���h]";
		mes "�������͗���������";
		mes "�Ƒ��Ƃ͌����Ȃ��ȁH";
		mes "����Ɏ��ɂ͗F�B�͂��Ȃ��B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : ���G��!?�@�R�C�c!!",1;
		next;
		cloakoffnpc "���C�W�[#20ms60";
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���`���A�`���ҁ`�I";
		mes "���\�T�����񂾂��H";
		mes "����H�@�����ŉ������Ă�񂾁H";
		delitem 1001154,3;
		chgquest 17715,17716;
		set EP20_2QUE,5;
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
	if(EP20_2QUE == 5 || EP20_2QUE == 6) {
		cloakoffnpc "���C�W�[#20ms60";
		mes "[�i�h���K���h]";
		mes "���̎҂́c�c�H";
		close;
	}
	if(EP20_2QUE == 100) {
		mes "[�i�h���K���h]";
		mes "�w�r�C�`�S���c�c�Ȃ񂾁B";
		mes "�܂������Ă��ĂȂ������̂��B";
		mes "�����H�ׂȂ��ƌ��C���o�Ȃ�����";
		mes "�����ė���悤�ɁB";
		next;
		if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�֐_�̍��� 02)") == 2) {
			mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
			next;
			mes "[�i�h���K���h]";
			mes "�悵�I";
			mes "���ꂶ��A���n�ɂ����Ă����I";
			close;
			if(Zeny < 500)
				end;
			set Zeny, Zeny -500;
			warp "jor_root2j.gat", 25, 17;
			end;
		}
		mes "�N�G�X�g�̎󒍂�񍐁A";
		mes "���������\�ł��B";
		next;
		setarray '@questname$,"����̒��߂Ƀw�r�C�`�S";
		setarray '@questid,17718;
		setarray '@coolid,17721;
		setarray '@itemlist,1001154,3;
		setarray '@gainlist,1001217,3;
		setarray '@explist,200000000,150000000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// ����̒��߂Ƀw�r�C�`�S
			if(checkquest(17721)) {
				if(checkquest(17721)&2 == 0) {
					mes "[�i�h���K���h]";
					mes "����̒��߂Ƀw�r�C�`�S�c�c�����ˁI";
					mes "���ꂪ�ŋ߂̊y���݂Ȃ񂾁I";
					mes "�܂��A�����������Ă��Ă���I";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����̒��߂Ƀw�r�C�`�S^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close;
				}
			}
			if(checkquest(17718)) {
				if(countitem(1001154) < 3) {
					mes "[�i�h���K���h]";
					mes "�֐_�̍��� 02�ɂ����āA";
					mes "�w�r�C�`�S��3�̂��Ă��Ă���B";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����̒��߂Ƀw�r�C�`�S^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close;
					}
					delquest 17718;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000����̒��߂Ƀw�r�C�`�S^000000�v";
					mes "��j�����܂����B";
					close;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000����̒��߂Ƀw�r�C�`�S^000000�v";
				mes "<���e>";
				mes "�A�C�e���F<ITEM>[�w�r�C�`�S]<INFO>1001154</INFO></ITEM>�@3��";
				mes "��[�i";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 4G ( 4000000000 )";
				mes "��200000000��20��󂯎��܂��B";
				mes "JobExp 3G ( 3000000000 )";
				mes "��150000000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@3��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000����̒��߂Ƀw�r�C�`�S^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close;
				}
				delitem 1001154,3;
				delquest 17718;
				setquest 17721;
				getitem 1001217,3;
				for('@i=0; '@i < 20; '@i++)
					getexp 200000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,150000000,0;
				mes "[�i�h���K���h]";
				mes "���肪�Ƃ��I";
				mes "�n�D�i����ɓ����̂ɂ�";
				mes "����Ȃɂ������Ȃ��Ƃ����Ȃ��񂾂ȁB";
				mes "����̒��߂Ƀw�r�C�`�S�c�c�����ˁI";
				mes "���ꂪ�ŋ߂̊y���݂Ȃ񂾁I";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 4G";
				mes "( 4000000000 )";
				mes "��200000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 3G";
				mes "( 3000000000 )";
				mes "��150000000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@3��";
				mes "���l�����܂����B";
				close;
			}
			mes "[�i�h���K���h]";
			mes "�֐_�̍��� 02�ɂ����āA";
			mes "�w�r�C�`�S��3�̂��Ă��Ă���B";
			mes "�����H�ׂȂ��ጳ�C���o�Ȃ�����ȁB";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000����̒��߂Ƀw�r�C�`�S^000000�v";
			mes "<���e>";
			mes "�A�C�e���F<ITEM>[�w�r�C�`�S]<INFO>1001154</INFO></ITEM>�@3��";
			mes "�̔[�i���󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�i�h���K���h]";
				mes "���H�H�����͉䖝����ƁH�H";
				mes "���̂��Ƃ͐����ɍR�c���邼�I";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 17718;
			if(checkquest(17721)) delquest 17721;
			mes "[�i�h���K���h]";
			mes "�悵�I���񂾂���ȁI";
			mes "�w�r�C�`�S3�����I";
			mes "�������ꂭ�炢�͐H�ׂȂ���A";
			mes "����Ă��Ȃ�����ȁI";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000����̒��߂Ƀw�r�C�`�S^000000�v";
			mes "���󒍂��܂����B";
			close;
		}
	}
	mes "[�i�h���K���h]";
	mes "�c�c���͉������������Ȃ��B";
	close;
OnQuestInfo:
	if(EP20_2QUE == 2 || EP20_2QUE == 4)
		showevent 1, 1, "�i�h���K���h#ep20_DQ_6";
	else if(EP20_2QUE == 100) {
		if(checkquest(17718) && countitem(1001154) < 3)
			showevent 0, 2, "�i�h���K���h#ep20_DQ_6";
		else if(!checkquest(17718) || checkquest(17721)&2)
			showevent 0, 3, "�i�h���K���h#ep20_DQ_6";
		else
			showevent 9999, 0, "�i�h���K���h#ep20_DQ_6";
	}
	else
		showevent 9999, 0, "�i�h���K���h#ep20_DQ_6";
	end;
}
icas_in2.gat,31,116,1	script(CLOAKED)	�z����#20ms60	10461,{/* 3758 (cloaking)*/
	if(EP20_2QUE == 2) {
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�~�����ƌ����Ă�w�r�C�`�S��";
		mes "���������������񂾂낤���c�c�B";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�A�[�E�B�����m]";
		mes "������āA�ǂ��Ŏ�ɓ���񂾁H";
		mes "���ꂪ���Ȃ̂����m��Ȃ��̂ɁB";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�����ɕ��������Ȃ��B";
		mes "���̃w�r�C�`�S�Ƃ����̂�";
		mes "�ǂ�����Ď�ɓ����񂾁H";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�i�h���K���h]";
		mes "�����m���B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : ���Ⴀ����m���Ă�񂾂�I",1;
		next;
		mes "[�i�h���K���h]";
		mes "�i�Ղ���������Ɏ����Ă�����̂�";
		mes "�����m���Ă���킯�Ȃ����낤�H";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�������A������!?";
		mes "���������Ă��V����܂Ȃ�???";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : ���K���̊K�����x�͓O�ꂵ�Ă���炵�����c�c",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : �������H�ׂĂ���̂��炢�́c�c",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms64"),"�A�[�E�B�����m : �������ɓ����̂��A��`�����K�v�Ȃ̂��H",1;
		next;
		menu "����������̂悤�ł��ˁH",-;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�����A�`���ҁI";
		mes "�����Ƃ���ɗ��Ă��ꂽ�I";
		mes "���𓾂�ׂɘA��ė������K����";
		mes "�~������������Ȃ���";
		mes "��������Ȃ��Ɩ����������񂾁I";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "[�A�[�E�B�����m]";
		mes "�킪�܂܂ȏ�i��";
		mes "�ЂƂ葝�����݂������c�c�B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "���K�����㊯���Ȃ��";
		mes "���������Ȃ��B";
		next;
		menu "����v�����Ă���̂ł����H",-;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�u�w�r�C�`�S�v���H�ׂ����炵���I";
		mes "����Ȃ��́A���������Ƃ������̂ɁI";
		next;
		cutin "ep19_iwin09.png", 255;
		menu "���͒m���Ă܂���",-;
		unittalk getcharid(3),strcharinfo(0)+" : ���K�������ɂƂ��Ă̚n�D�i�炵���ł�",1;
		mes "[�i�h���K���h]";
		mes "���̒ʂ�B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "���΂͖`���҂��I";
		mes "�Ȃ�ł��m���Ă�Ȃ��I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : �M���Ă�����I",1;
		next;
		menu "���K�v�ł����H",-;
		mes "[�i�h���K���h]";
		mes "3���I";
		mes "^0000cd�w�r�C�`�S 3��^000000�͐H�ׂ����I�I";
		mes "�勳�ł��鎄�ɂ�";
		mes "���R�^������ׂ��ł���B";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�c�c�v����ɑ�R�Ƃ������Ƃ��B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : �}�Ɍ��C�ɂȂ�����",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : �܂�ŏ㊯����Ȃ���",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms64"),"�A�[�E�B�����m : �ߗ��������I�X�߂���I",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : �ゾ�����₪����",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�`���҂��������肾�B";
		mes "��ɓ���ꏊ��m���Ă�Ȃ�";
		mes "�����ɑ��邾���Ȃ狦�͂ł��������B";
		mes "�C��t���čs���ė��Ă���B";
		next;
		cutin "ep19_iwin09.png", 255;
		chgquest 17713,17714;
		set EP20_2QUE,3;
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@���������]";
		close2;
		warp "jor_root2j.gat", 85, 50;
		end;
	}
	if(EP20_2QUE == 3) {
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�`���҂��������肾�B";
		mes "��ɓ���ꏊ��m���Ă�Ȃ�";
		mes "�����ɑ��邾���Ȃ狦�͂ł��������B";
		mes "�C��t���čs���ė��Ă���B";
		next;
		cutin "ep19_iwin09.png", 255;
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�w�r�C�`�S�̍̎��";
		mes "�@���������]";
		close2;
		warp "jor_root2j.gat", 85, 50;
		end;
	}
	if(EP20_2QUE >= 5) {
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "���̐l������ق�";
		mes "����ɂȂ�l�������Ȃ�āI";
		mes "���͊��Ⴂ���Ă����݂������B";
		close2;
		cutin "ep19_iwin09.png", 255;
		end;
	}
	cutin "ep19_iwin09.png", 2;
	mes "[�z����]";
	mes "����Ȃɖʓ|�ȃ��K�����ƒm���Ă�����";
	mes "�Ⴄ���@������Ă�����B";
	close2;
	cutin "ep19_iwin09.png", 255;
	end;
OnQuestInfo:
	if(EP20_2QUE == 2 || EP20_2QUE == 3)
		showevent 1, 1, "�z����#20ms60";
	end;
}
icas_in2.gat,32,120,3	script(CLOAKED)	���C�W�[#20ms60	10454,{/* 3759 (cloaking)*/
	if(EP20_2QUE == 5) {
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "���₨��I";
		mes "�ǂ����Ō������K�����Ǝv������";
		mes "�����ϑ������Ă���������c���B";
		mes "����ɂ��́A���H";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[�i�h���K���h]";
		mes "���O�́A���̎��̐l�Ԃ��B";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "���񂽂̂��A�l�ŏ���������B";
		mes "�{���ɂ��肪�����Ǝv���Ă邪";
		mes "���̉��͂ǂ�����ĕԂ��Ηǂ��񂾁H";
		mes "���ӂ̋C�����𑗂邾���ŗǂ��H";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[�i�h���K���h]";
		mes "�������O�̂��A�Ō��Ȏd����";
		mes "��炸�ɍς񂾁B";
		mes "���݂��l�Ƃ������Ƃɂ��悤�B";
		next;
		mes "[�i�h���K���h]";
		mes "���āA�����̎ҁB";
		mes "���̑��𝆂݂Ȃ����B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : �����Ȃ�H",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms64"),"�A�[�E�B�����m : ����Ȃ��ƌ����H",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "�C������I";
		mes "����Ɏd����^���Ă�邩��";
		mes "�d��������I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : �������I�@�悭�������I",1;
		next;
		mes "[�i�h���K���h]";
		mes "����ȗ�����������Ǝv���̂��H";
		mes "�勳�ł��鎄�ɁH";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�����ł̓��K���̈�C�ɉ߂��Ȃ��I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : ���������A���̃��K�����I",1;
		next;
		mes "[�A�[�E�B�����m]";
		mes "�͂��c�c�����s���Ă���B";
		mes "���������������܂ŉ^��ł����邩��B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : ������ӂɒu���ė��悤",1;
		next;
		mes "[�i�h���K���h]";
		mes "���́I";
		mes "�s���Ȃ�!!";
		next;
		mes "[�A�[�E�B�����m]";
		mes "�����I�@�����I";
		mes "�����������������Ȃ肻�����I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : �܂��������I",1;
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "��`���I�@�Ȃɂ���H";
		mes "���������č��܂ł�����";
		mes "����Ȃ���肵�Ă��́H";
		next;
		menu "�͂��A�����Ƃ���Ȋ����ł�",-;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "�H�т݂̂�ȁA";
		mes "������Ǝ��Ƃ��b���悤�B";
		mes "���̃��K���̏����ɂ��āB";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "����b���ƌ����񂾁I";
		mes "�����A�����������񂴂�Ȃ񂾁I";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "���܂Ŏ勳�l�Ƃ���";
		mes "���V�����̂悤�Ɉ�Ă��Ă�������";
		mes "����ȑԓx���d�����Ȃ��B";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "���������̂́A�����璉�������Ƃ����";
		mes "�ǂ��ɂ��Ȃ�Ȃ��B";
		mes "���̂����āH";
		mes "���܂�Ă��炸����";
		mes "��������ĕ�炵�Ă����񂾂���ȁB";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�Ȃ�A���̖��҂�";
		mes "�ǂ�����Ηǂ��񂾁H";
		mes "���K���̑��ɑ���Ԃ�������";
		mes "�������̂��߂���Ȃ��̂��H";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : �����Ɖ䖝���Ȃ���Ȃ�Ȃ��́H",1;
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : ����ȁI",1;
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "����Ԃ��̂̓}�Y�C�B";
		mes "������̏���";
		mes "�G����ɒm�点�邱�ƂɂȂ邩��ȁB";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�c�c�����l��������̂��H";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "�����g���Ă�낤�B";
		mes "�v��������A�����g���΂����B";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�����g�������āH";
		mes "�w��{�����ē������Ȃ��z�Ȃ񂾂��H";
		mes "���������{�Ŏg���ԓx�A���Ă�����I";
		mes "�`���҂����Ă��̂�����";
		mes "�킴�킴�ւ̑��܂ōs����";
		mes "�w�r�C�`�S���̂��ė����񂾁I";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "�ӂށc�c�����悻���������B";
		mes "�ԓx�����݂������ȁH";
		mes "�ł͎��������b�����Ă݂��B";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "�₠�A�����̎��B";
		mes "���Ƃ�����Ƙb�����Ă݂Ȃ��H";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[�i�h���K���h]";
		mes "���͂�邱�Ƃ��Ȃ�����A������ł��B";
		next;
		mes "[���C�W�[]";
		mes "�c�c�d���́c�c�B";
		next;
		mes "[�i�h���K���h]";
		mes "�c�c�������c�c�B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : ���̘b�����Ă�񂾁H",1;
		emotion 9,"�i�h���K���h#ep20_DQ_6";
		next;
		mes "[���C�W�[]";
		mes "�l���c�c���c�c�B";
		next;
		mes "[�i�h���K���h]";
		mes "�ق��c�c����͂ǂ�����āH";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : ����Ȃ̂Ő����ł��邩�ȁH",1;
		next;
		mes "[���C�W�[]";
		mes "����c�c�����A�������I";
		emotion 33,"���C�W�[#20ms60";
		next;
		mes "[�i�h���K���h]";
		mes "�{���ɂ���Łc�c�B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms65"),"�A�[�E�B�����m : ��C�c�c�ς������",1;
		next;
		mes "[���C�W�[]";
		mes "�ł��Ȃ����Ƃ́c�c�B";
		next;
		mes "[�i�h���K���h]";
		mes "�Ȃ�قǁc�c�����A���ӂ���B";
		emotion 21,"�i�h���K���h#ep20_DQ_6";
		next;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "�͂��A�I���I";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms62"),"�A�[�E�B�����m : �ȁA�Ȃ񂾂��ā[�[!?",1;
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�ȁA�Ȃɂ��H";
		mes "�Ȃɂ��I������񂾂��āH";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "���t�ʂ�";
		mes "�S�����������Ƃ������Ƃ���B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : �M�����Ȃ��I�@����ȂɒZ�����ԂŁH",1;
		chgquest 17716,17717;
		set EP20_2QUE,6;
		close2;
		cutin "ep19_leizi02.png", 255;
		end;
	}
	if(EP20_2QUE == 6) {
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "���͉�����������";
		mes "���͂����s���ˁ`�B";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "�҂��Ă���I";
		mes "���������ǂ�Șb��������";
		mes "�����̊炪";
		mes "����ȑu�₩�ɂȂ�񂾁H";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "�H�т݂̂�ȁB";
		mes "���Ă����Ă�����B";
		mes "�ނ̐V�����p���c�c�I";
		next;
		emotion 2,"�i�h���K���h#ep20_DQ_6";
		cutin "ep19_leizi02.png", 255;
		mes "[�i�h���K���h]";
		mes "�ފƂ�����Ȃ����B";
		mes "����ƖԂ̎����������Ă���B";
		next;
		mes "[�i�h���K���h]";
		mes "�����Ƃ����̂�";
		mes "���ʂ̎҂������̂��Ǝv���Ă����B";
		mes "�������A���̎҂̘b�ɂ���";
		mes "�����قǑ@�ׂŉ��[���w���";
		mes "�����炵���B";
		next;
		mes "[�i�h���K���h]";
		mes "���m�Ȓ����őf�ނ�؂蕪��";
		mes "���m�Ȍv�ʂɂ���Ċ���������c�c";
		mes "�V���������̎n�܂��";
		mes "�f���炵���w��ŖL���ɂ���̂�";
		mes "�����͂Ȃ����낤�B";
		next;
		mes "[�i�h���K���h]";
		mes "���҂ŋ������܂�I";
		mes "�����A�ǂ��֍s���΂����H";
		mes "�ނ肩��n�߂����̂����H";
		next;
		mes "[�A�[�E�B�����m]";
		mes "���A�����c�c";
		mes "�����ē����悤�B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms63"),"�A�[�E�B�����m : �Ȃ�Ă��Ƃ�!!",1;
		next;
		cloakonnpc "�A�[�E�B�����m#20ms65";
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "���������ǂ���������g������!? ";
		mes "�������͂��̎肱�̎��";
		mes "���_���悤�Ƃ��ďo���Ȃ������̂�!!";
		next;
		cutin "ep19_leizi01.png", 0;
		mes "[���C�W�[]";
		mes "���ꂪ���̔т̎킾����ȁB";
		mes "�܂��A�Ȃ�Ƃ����������";
		mes "����s�ׂ�ʂ̊ϓ_���猩���悤��";
		mes "���������������񂾂�B";
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "�J���A�Ƃ����s�ׂɑ΂���F����";
		mes "�ނɓK������悤�ɋ�����Ηǂ��B";
		mes "�Ԃ̎����͋C�������_�C�s�ł���";
		mes "�ނ�͎艞�����������ґz�ł���";
		mes "�����͐V���ȑn�����i�閂�@�ł���";
		mes "�ƁA����ȕ��ɂˁB";
		next;
		cutin "ep19_leizi02.png", 255;
		mes "[�A�[�E�B�����m]";
		mes "���킟�c�c";
		mes "���̐l�A�|���c�c�B";
		unittalk getnpcid(0,"�A�[�E�B�����m#20ms61"),"�A�[�E�B�����m : ���\�t�݂����c�c",1;
		next;
		cutin "ep19_leizi03.png", 0;
		mes "[���C�W�[]";
		mes "���������A�`���҂ɂ��肢������񂾁B";
		mes "�ނׂ̈Ƀw�r�C�`�S���̂��ė��Ă���B";
		mes "�\�ł���΁A�������ǂ��B";
		mes "�ꐶ���������l�𖳏��Ŏg���Ȃ��";
		mes "��l���I����H";
		next;
		menu "����́A�����ł���",-;
		cutin "ep19_leizi02.png", 0;
		mes "[���C�W�[]";
		mes "����ɂĈꌏ�����B";
		mes "����A�������͍s����`�B";
		next;
		cutin "ep19_iwin09.png", 2;
		mes "[�z����]";
		mes "���������A�e���̎d���ɖ߂�Ȃ���I";
		mes "�ꉞ�A���������݂����ł���";
		mes "�w�r�C�`�S�̍̎�̌���";
		mes "�`���҂ɂ͎�`���Ă��炢�����B";
		mes "��������A��낵�����肢�����B";
		close2;
		cutin "ep19_iwin09.png", 255;
		cloakonnpc "���C�W�[#20ms60";
		setquest 202435;
		delquest 17717;
		set EP20_2QUE,100;
		getitem 1001217,10;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_2QUE == 5 || EP20_2QUE == 6)
		showevent 1, 1, "���C�W�[#20ms60";
	else
		showevent 9999, 0, "���C�W�[#20ms60";
	end;
}
icas_in2.gat,37,118,3	script(CLOAKED)	�A�[�E�B�����m#20ms61	10461,{/* 3760 (cloaking)*/
	unittalk "�A�[�E�B�����m : �Ȃ�ŁA����Ȗڂɑ���Ȃ���Ȃ�Ȃ��́H",1;
	end;
}
icas_in2.gat,34,117,3	script	�A�[�E�B�����m#20ms62	10461,{/* 3761 */
	unittalk "�A�[�E�B�����m : ��J�����c�c�܂������c�c",1;
	end;
}
icas_in2.gat,29,114,1	script(CLOAKED)	�A�[�E�B�����m#20ms63	10461,{/* 3762 (cloaking)*/
	unittalk "�A�[�E�B�����m : ���K�������݂͂�ȁA����Ȋ����Ȃ̂��H",1;
	end;
}
icas_in2.gat,27,118,1	script(CLOAKED)	�A�[�E�B�����m#20ms64	10461,{/* 3763 (cloaking)*/
	unittalk "�A�[�E�B�����m : �ꐶ�����ɂ�����肶��Ȃ����낤�ȁH",1;
	end;
}
icas_in2.gat,37,115,3	script(CLOAKED)	�A�[�E�B�����m#20ms65	10461,{/* 3764 (cloaking)*/
	unittalk "�A�[�E�B�����m : ����������ƁA�v�������Ȃ����̂����Ă��܂��ȁB",1;
	end;
}
icecastle.gat,134,108,0	script	#20ms61	139,{/* 3765 */}
icecastle.gat,134,108,3	script(CLOAKED)	�i�h���K���h#20ms61	10474,{/* 3766 (cloaking)*/}
icecastle.gat,69,107,0	script	#20ms62	139,{/* 3767 */}
icecastle.gat,69,107,5	script(CLOAKED)	�i�h���K���h#20ms62	10474,{/* 3768 (cloaking)*/}
icas_in.gat,235,54,0	script	#20ms63	139,{/* 3769 */}
icas_in.gat,235,54,3	script(CLOAKED)	�i�h���K���h#20ms63	10474,{/* 3770 (cloaking)*/}

jor_root2j.gat,90,50,5	script	�ł܂����ꏊ#20ms01	10428,{/* 6339 */
	if(EP20_2QUE == 3) {
		delquest 17714;
		setquest 17715;
		set EP20_2QUE,4;
		getitem 1001154,3;
		mes "�]�w�r�C�`�S����ɓ��ꂽ�]";
		close;
	}
	if(EP20_2QUE == 4) {
		mes "�]�w�r�C�`�S����ɓ��ꂽ";
		mes "�@�߂��ĕ񍐂��悤�]";
		close2;
		warp "icas_in2.gat", 33, 114;
		end;
	}
	if(checkquest(17718)) {
		if(countitem(1001154) >= 3) {
			mes "�]�w�r�C�`�S����ɓ��ꂽ";
			mes "�@�߂��ĕ񍐂��悤�]";
			close2;
			warp "icas_in2.gat", 33, 114;
			end;
		}
		getitem 1001154,3;
		mes "�]�w�r�C�`�S����ɓ��ꂽ�]";
		close;
	}
	end;
OnQuestInfo:
	if(EP20_2QUE == 3 || EP20_2QUE == 4 || checkquest(17718))
		showevent 1, 1;
	end;
}
jor_root2j.gat,235,258,5	duplicate(�ł܂����ꏊ#20ms01)	�ł܂����ꏊ#20ms02	10428
jor_root2j.gat,77,191,5		duplicate(�ł܂����ꏊ#20ms01)	�ł܂����ꏊ#20ms03	10428

//============================================================
// �R�|�̔閧��n�N�G�X�g
//- Registry -------------------------------------------------
// EP20_3QUE -> 0�`24	����:100
//------------------------------------------------------------
icecastle.gat,109,241,0	script	#ep20slug_1	139,9,9,{/* 3771 */
	if(EP20_3QUE == 9 || EP20_3QUE == 10)
		cloakoffnpc "�t���[�f���P#ep20_1";
	end;
}
icecastle.gat,109,241,3	script	�A�[�E�B���z�B��#ep20_1	10461,{/* 3772 */
	if(EP20_3QUE == 0) {
		if(EP19_2QUE < 36 || EP20_1QUE < 100) {
			mes "[�A�[�E�B���z�B��]";
			mes "�����Ɓ`�I";
			mes "���݂܂���I";
			mes "������ƒʂ�܂���`�I";
			cutin "ep19_iwin11.png", 2;
			next;
			cutin "ep19_iwin11.png", 255;
			mes "^e6328c�]���̃N�G�X�g��i�s����ɂ�^000000";
			mes "^e6328c�@�ȉ��̏����𖞂����K�v������܂��]^000000";
			mes "^e6328c�@�E�N�G�X�g�u�򉻂̐����v�̃N���A^000000";
			mes "^e6328c�@�E�N�G�X�g�u���ȂȂ��ҁv�̃N���A^000000";
			mes "�@";
			mes "<URL>EPISODE�FISGARD �`���b�̒n�`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard/</INFO></URL>";
			mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
			close;
		}
		mes "[�A�[�E�B���z�B��]";
		mes "�����Ɓ`�I";
		mes "���݂܂���I";
		mes "������ƒʂ�܂���`�I";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "���I";
		mes strcharinfo(0)+"�l�I";
		mes "����ȂƂ���ŉ�Ȃ�āI";
		mes "�ו��������đO���悭�����܂���ł����I";
		mes "�z�z�z�z�z�b�I";
		next;
		menu "��`���܂��傤���H",-;
		mes "[�A�[�E�B���z�B��]";
		mes "���������B";
		mes "���v�ł���I";
		mes "���낢�남�Z�����̂�";
		mes "����Ȏd���܂Ŏ�`�����ƂȂ��ł��I";
		next;
		menu "�d�����ł���H",-;
		mes "[�A�[�E�B���z�B��]";
		mes "�������^�т܂�����";
		mes "���v�c�c�����I�i�S�L�b�j";
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�ӂ��c�c";
		mes "�ł́A�����t�ɊÂ���";
		mes "���̏����������^��ł��������܂����H";
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�t���[�f���P�l���̂��ו��ł��B";
		mes "���H�[�N�����f�l����ƌ�����";
		mes "�킩���Ă���������ł��傤�B";
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�����܂���";
		mes "��낵�����肢���܂��`�B";
		next;
		cutin "ep19_iwin11.png", 255;
		setquest 11928;
		set EP20_3QUE,1;
		viewpoint 1, 68, 210, 1, 0xFF0000;
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 68, 210;
		end;
	}
	if(EP20_3QUE == 1) {
		mes "[�A�[�E�B���z�B��]";
		mes "�ӂ��c�c";
		mes "�ł́A�����t�ɊÂ���";
		mes "���̏����������^��ł��������܂����H";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�t���[�f���P�l���̂��ו��ł��B";
		mes "���H�[�N�����f�l����ƌ�����";
		mes "�킩���Ă���������ł��傤�B";
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�����܂���";
		mes "��낵�����肢���܂��`�B";
		next;
		cutin "ep19_iwin11.png", 255;
		viewpoint 1, 68, 210, 1, 0xFF0000;
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 68, 210;
		end;
	}
	if(EP20_3QUE == 9) {
		mes "[�A�[�E�B���z�B��]";
		mes "����ɂ���";
		mes "�t���[�f���P�l�B";
		mes "���ו��͎󂯎���Ă��������܂������H";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����Ɏ󂯎��܂����B";
		mes "�������肪�Ƃ��B";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "���������B";
		mes "���ꂪ���̎d���ł�����B";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���A�������I";
		mes "�����q�������Ă܂��񂩁H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�����q���ł����H";
		mes "���`��A���Ă��܂���˂��B";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ǂ��֍s�����̂��ȁH";
		mes "���������Ă�͂��Ȃ̂Ɂ`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���`��c�c";
		mes "���̏ꏊ���T���Ă݂悤���B";
		mes "�u���Ɂv�ɍs���Ă݂܂��傤�B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�O�͊�Ȃ��ł�����";
		mes "���܂艓���܂ōs���Ȃ��ł��������ˁB";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�́`�`���I";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		viewpoint 1, 186, 218, 1, 0xFF0000;
		chgquest 11936,11937;
		set EP20_3QUE,10;
		mes "�]���ɂ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���ɂ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 186, 218;
		end;
	}
	if(EP20_3QUE == 10) {
		mes "[�A�[�E�B���z�B��]";
		mes "�����q���ł����H";
		mes "���`��A���Ă��܂���˂��B";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ǂ��֍s�����̂��ȁH";
		mes "���������Ă�͂��Ȃ̂Ɂ`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���`��c�c";
		mes "���̏ꏊ���T���Ă݂悤���B";
		mes "�u���Ɂv�ɍs���Ă݂܂��傤�B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A�[�E�B���z�B��]";
		mes "�O�͊�Ȃ��ł�����";
		mes "���܂艓���܂ōs���Ȃ��ł��������ˁB";
		cutin "ep19_iwin11.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�́`�`���I";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		viewpoint 1, 186, 218, 1, 0xFF0000;
		mes "�]���ɂ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���ɂ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 186, 218;
		end;
	}
	mes "[�A�[�E�B���z�B��]";
	mes "�����Ɓ`�I";
	mes "���݂܂���I";
	mes "������ƒʂ�܂���`�I";
	cutin "ep19_iwin11.png", 2;
	close2;
	cutin "ep19_iwin11.png", 255;
	end;
OnQuestInfo:
	if(EP20_3QUE == 1 || EP20_3QUE == 9)
		showevent 1, 1, "�A�[�E�B���z�B��#ep20_1";
	else if(EP20_3QUE == 10)
		showevent 1, 1, "�A�[�E�B���z�B��#ep20_1";
	else if(EP19_2QUE == 36 && EP20_1QUE == 100)
		showevent 0, 1, "�A�[�E�B���z�B��#ep20_1";
	end;
}
icecastle.gat,106,241,5	script(CLOAKED)	�t���[�f���P#ep20_1	10458,{/* 3773 (cloaking)*/}

icas_in.gat,32,116,3	script(CLOAKED)	�R�|#ep20_1	21995,{/* 3775 (cloaking)*/
	if(EP20_3QUE == 2) {
		mes "[�R�|]";
		mes "�������т̎��ԁH";
		mes "�Ȃ�A�������ɋA��Ȃ���B";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�R�|]";
		mes "�x�ꂽ��A�}�}�ɓ{��ꂿ�Ⴄ�I";
		close2;
		cutin "ep20_cocopo02.png", 255;
		cloakonnpc "�R�|#ep20_1";
		chgquest 11929,11930;
		set EP20_3QUE,3;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 2)
		showevent 1, 1, "�R�|#ep20_1";
	end;
}
icas_in.gat,30,120,3	script(CLOAKED)	�R�|#ep20_2	21995,{/* 3776 (cloaking)*/
	if(EP20_3QUE == 3) {
		mes "[�R�|]";
		mes "���`�`���I";
		mes "�ƂɋA�肽���Ȃ��I";
		mes "��������Ԓg��������!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�^�}����]";
		mes "�܂��A�}�}�ɓ{�����H";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[�R�|]";
		mes "�������c�c�B";
		cutin "ep20_cocopo03.png", 2;
		close2;
		cutin "ep20_cocopo02.png", 255;
		cloakonnpc "�R�|#ep20_2";
		chgquest 11930,11931;
		set EP20_3QUE,4;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 3)
		showevent 1, 1, "�R�|#ep20_2";
	end;
}
icas_in.gat,36,117,3	script(CLOAKED)	�R�|#ep20_3	21995,{/* 3777 (cloaking)*/
	if(EP20_3QUE == 4) {
		mes "[�R�|]";
		mes "�m���Ă�H";
		mes "�����̂��[�т́A�|���K������B";
		cutin "ep20_cocopo02.png", 2;
		close2;
		cutin "ep20_cocopo02.png", 255;
		cloakonnpc "�R�|#ep20_3";
		chgquest 11931,11932;
		set EP20_3QUE,5;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 4)
		showevent 1, 1, "�R�|#ep20_3";
	end;
}
icas_in.gat,28,119,3	script(CLOAKED)	�R�|#ep20_4	21995,{/* 3778 (cloaking)*/
	if(EP20_3QUE == 5) {
		mes "[�R�|]";
		mes "�c�c�X���X���`�B";
		cutin "ep20_cocopo_baby.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���̎q�́A�J�|�|�ł��B";
		mes "�`���R�R�͂��Z����񂾂���";
		mes "�J�|�|�̖ʓ|���݂Ă����Ȃ��Ɓ`�B";
		mes "�c�c����H�@�`���R�R�H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�`���R�R�͐��";
		mes "�A����������݂����B";
		mes "���傤���Ȃ��Ȃ��`�B";
		mes "���͂��̎q�̉Ƃ�m���Ă��܂�����";
		mes "����͂��܂��ˁB";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�^�}����]";
		mes "�����I";
		mes "���o�����ł����H";
		cutin "ep19_tamarin02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����͂Ȃ�����";
		mes "�����A���ė����B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�^�}����]";
		mes "���`��c�c";
		mes strcharinfo(0)+"�l�A";
		mes "�t���[�f���P�l�����ł͐S�z�Ȃ̂�";
		mes "�ꏏ�ɂ��čs���Ă��炦�܂��񂩁H";
		cutin "ep19_tamarin01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�X�̒����������������";
		mes "���v����`�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�^�}����]";
		mes "�ŋ߂悭�Ȃ��\�������ł��B";
		mes "�X�J���Ǝv���܂����A���肢���܂��B";
		cutin "ep19_tamarin01.png", 2;
		next;
		cutin "ep19_tamarin04.png", 255;
		chgquest 11932,11933;
		set EP20_3QUE,6;
		mes "�]�O��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�O��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 65, 213;
		end;
	}
	if(EP20_3QUE == 6) {
		mes "[�R�|]";
		mes "�c�c�X���X���`�B";
		cutin "ep20_cocopo_baby.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���傤���Ȃ��Ȃ��`�B";
		mes "���͂��̎q�̉Ƃ�m���Ă��܂�����";
		mes "����͂��܂��ˁB";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�^�}����]";
		mes strcharinfo(0)+"�l�A";
		mes "�t���[�f���P�l�����ł͐S�z�Ȃ̂�";
		mes "�ꏏ�ɂ��čs���Ă��炦�܂��񂩁H";
		cutin "ep19_tamarin01.png", 2;
		next;
		cutin "ep19_tamarin01.png", 255;
		mes "�]�O��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�O��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 65, 213;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 5 || EP20_3QUE == 6)
		showevent 1, 1, "�R�|#ep20_4";
	end;
}

icecastle.gat,65,213,0	script	#ep20slug_3	139,9,9,{/* 3778 */
	if(EP20_3QUE == 6 || EP20_3QUE == 7 || EP20_3QUE == 8 || EP20_3QUE == 9)
		cloakoffnpc "�t���[�f���P#ep20_2";
	else if(EP20_3QUE == 23) {
		cloakoffnpc "�����q��#ep20_e";
		cloakoffnpc "�����n#ep20_DQ_8";
	}
	end;
}
icecastle.gat,70,216,3	script(CLOAKED)	�t���[�f���P#ep20_2	10458,{/* 3779 (cloaking)*/
	if(EP20_3QUE == 6) {
		mes "[�t���[�f���P]";
		mes "�����I";
		mes "�݂�ȉߕی�߂��I";
		mes "���ЂƂ�ł����v�Ȃ̂Ɂ`�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�`���R�R�̂�������";
		mes "�������牺�ɂ��������Ƃ���ł��B";
		mes "�x���Ȃ�ƃ^�^���������邳���̂�";
		mes "�����s���܂���`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11933,11934;
		set EP20_3QUE,7;
		mes "�]�`���R�R�̉Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�`���R�R�̉Ƃ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 64, 164;
		end;
	}
	if(EP20_3QUE == 7) {
		mes "[�t���[�f���P]";
		mes "�`���R�R�̂�������";
		mes "�������牺�ɂ��������Ƃ���ł��B";
		mes "�x���Ȃ�ƃ^�^���������邳���̂�";
		mes "�����s���܂���`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "�]�`���R�R�̉Ƃ�";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�`���R�R�̉Ƃ�";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 64, 164;
		end;
	}
	if(EP20_3QUE == 8) {
		mes "[�t���[�f���P]";
		mes strcharinfo(0)+"�l�B";
		mes "���������ł�����";
		mes "�������ŋx��ł�����܂��񂩁H";
		mes "���َq�Ƃ�����p�ӂ��܂���`�B";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[�����n]";
		mes "�t���[�f���P�l�I";
		mes "�t���[�f���P�l���I";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "����ɂ��́A�����n�B";
		mes "�ǂ��������́H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�����n]";
		mes "�����q����T���Ă��ł��B";
		mes "�������̒��ɂ��܂����H";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���`�`���Ɓc�c";
		mes "������Ƒ҂��Ă��������ˁB";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�^�`�^�`���`�`���I";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�^�}����]";
		mes "�^�}�����ł����Ă΁I";
		mes "����ŁA�ǂ�������ł����H";
		mes "�����ɂ����炸�ɁB";
		cutin "ep19_tamarin01.png", 0;
		next;
		mes "[�t���[�f���P]";
		mes "�����q���́A�����̒��ɂ���H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�^�}����]";
		mes "�������B";
		mes "�������A���т�H�ׂɋA��ƌ�����";
		mes "��������o�čs���܂�����H";
		cutin "ep19_tamarin01.png", 0;
		next;
		mes "[�����n]";
		mes "�����A����ȁc�c";
		mes "�Ƃɂ͋A���Ă��Ă��܂���I";
		mes "�����A���т̎��ԂȂ̂ɁB";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[�����n]";
		mes "���̎q�͂ǂ���";
		mes "������H���Ă���̂�����B";
		next;
		mes "[�t���[�f���P]";
		mes "���ꂶ�Ⴀ�A���U�����ɉ������";
		mes "�������ɑ���悤�ɂ��܂��ˁ`�B";
		cutin "ep19_friederike01.png", 2;
		next;
		menu "���U���H",-;
		mes "[�t���[�f���P]";
		mes "�X�̒������U�����܂��傤";
		mes strcharinfo(0)+"�l�B";
		mes "�����ł���ˁ`�H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ł́A���������Ă݂܂��傤���`�B";
		mes "�ӂӂ��B";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11935,11936;
		set EP20_3QUE,9;
		mes "�]������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]������";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 107, 236;
		end;
	}
	if(EP20_3QUE == 9) {
		mes "[�t���[�f���P]";
		mes "�X�̒������U�����܂��傤";
		mes strcharinfo(0)+"�l�B";
		mes "�����ł���ˁ`�H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ł́A���������Ă݂܂��傤���`�B";
		mes "�ӂӂ��B";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "�]������";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]������";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 107, 236;
		end;
	}
	//23�s��
	end;
OnQuestInfo:
	if(EP20_3QUE == 6 || EP20_3QUE == 7 || EP20_3QUE == 8 || EP20_3QUE == 9)
		showevent 1, 1, "�t���[�f���P#ep20_2";
	end;
}

icecastle.gat,62,160,0	script	#ep20slug_4	139,9,9,{/* 3780 */
	if(EP20_3QUE == 7 || EP20_3QUE == 8) {
		cloakoffnpc "�t���[�f���P#ep20_3";
		cloakoffnpc "�`���`����#ep20";
	}
	end;
}
icecastle.gat,62,160,5	script(CLOAKED)	�t���[�f���P#ep20_3	10458,{/* 3781 (cloaking)*/}
icecastle.gat,63,158,3	script(CLOAKED)	�`���R�R#ep20_3	21995,{/* 3782 (cloaking)*/}
icecastle.gat,65,159,3	script(CLOAKED)	�`���`����#ep20	10461,{/* 3783 (cloaking)*/
	if(EP20_3QUE == 7) {
		mes "[�`���`����]";
		mes "����I�@�t���[�f���P�l�B";
		mes "�����"+strcharinfo(0)+"�l���B";
		mes "���U���ł����H";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�J�|�|�����͂��ɎQ��܂����`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�`���`����]";
		mes "���`�`�I";
		mes "�܂��`���R�R���J�|�|��";
		mes "�u���ė����̂ˁI";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[�`���`����]";
		mes "�`���R�R�I";
		mes "�`���R�R!!";
		cloakoffnpc "�`���R�R#ep20_3";
		next;
		mes "[�`���R�R]";
		mes "����H";
		mes "�ȂɁ`�ꂿ���H";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�`���`����]";
		mes "���񂽂܂�";
		mes "�t���[�f���P�l�̂�������";
		mes "�J�|�|��u���Ă����ł���I";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[�`���R�R]";
		mes "���[���I";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�`���`����]";
		mes "�܂������A���񂽂��Ďq��!!";
		mes "���u���ė���Ȃ�āI";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[�`���`����]";
		mes "�t���[�f���P�l";
		mes "�J�|�|��A��Ă��Ă�������";
		mes "���肪�Ƃ��������܂��B";
		mes "�`���R�R�͌����������Ă����܂��̂ŁB";
		next;
		mes "[�t���[�f���P]";
		mes "���̂��Ƃ͋C�ɂ��Ȃ��ł��������`�B";
		mes "�����Ɓc�c";
		mes "���܂莶��Ȃ��ł����Ă��������ˁH";
		mes "�ł́A�������ɋA��܂��傤���B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�`���R�R]";
		mes "�t���[�f���P���܁A�s���Ȃ��Ł`�I";
		mes "�}�}�Ɏ���ꂿ�Ⴄ�I";
		mes "�y���y�����ꂿ�Ⴄ��`�`�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�`���`����]";
		mes "�I�z�z�z�I";
		mes "�t���[�f���P�l�͂��Z�����̂�B";
		mes "�����A�������Ƃɂ͂���Ȃ��`�`���B";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[�`���R�R]";
		mes "�L���`�`�`�b!!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo02.png", 255;
		chgquest 11934,11935;
		set EP20_3QUE,8;
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 70, 211;
		end;
	}
	if(EP20_3QUE == 8) {
		mes "[�`���R�R]";
		mes "�t���[�f���P���܁A�s���Ȃ��Ł`�I";
		mes "�}�}�Ɏ���ꂿ�Ⴄ�I";
		mes "�y���y�����ꂿ�Ⴄ��`�`�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�`���`����]";
		mes "�I�z�z�z�I";
		mes "�t���[�f���P�l�͂��Z�����̂�B";
		mes "�����A�������Ƃɂ͂���Ȃ��`�`���B";
		cutin "ep19_iwin06.png", 2;
		next;
		mes "[�`���R�R]";
		mes "�L���`�`�`�b!!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo02.png", 255;
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�t���[�f���P�̑؍ݏ���";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 70, 211;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 7 || EP20_3QUE == 8)
		showevent 1, 1, "�`���`����#ep20";
	end;
}
icas_in.gat,111,40,5	script(CLOAKED)	�t���[�f���P#ep20_4	10458,{/* 3784 (cloaking)*/}
icas_in.gat,113,38,3	script	�A�[�E�B���x����#ep20_1	10461,{/* 3785 */
	if(EP20_3QUE == 10) {
		mes "[�A�[�E�B���x����]";
		mes "��������悤";
		mes "�t���[�f���P�l�B";
		mes "���F���O���f�l�Ɍ�p�ł����H";
		cutin "ep19_iwin01.png", 2;
		cloakoffnpc "�t���[�f���P#ep20_4";
		next;
		mes "[�t���[�f���P]";
		mes "��������Ȃ���";
		mes "�����q����T���Ă�́B";
		mes "���Ă܂��񂩁H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A�[�E�B���x����]";
		mes "���Ă��܂���ˁB";
		mes "�ŋ߁A�����ƕ����ł�����";
		mes "�x�����ɂ��A�����Ă����܂��傤���H";
		cutin "ep19_iwin01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���萔�łȂ����";
		mes "���肢�ł��܂����H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�X�̓����ɍs���Ă݂܂��傤���B";
		mes "�������������Ă���x������";
		mes "�A�����s���Ă邩������܂���B";
		mes "�������Ȃ���΂������ǁc�c�B";
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11937,11938;
		set EP20_3QUE,11;
		mes "�]�X�̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�X�̓�����";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 24, 125;
		end;
	}
	if(EP20_3QUE == 11) {
		mes "[�A�[�E�B���x����]";
		mes "�x�����ɂ��A�����Ă����܂��ˁB";
		cutin "ep19_iwin01.png", 2;
		cloakoffnpc "�t���[�f���P#ep20_4";
		next;
		mes "[�t���[�f���P]";
		mes "���肢���܂��B";
		mes "�ł́A�X�̓����ɍs���Ă݂܂��傤���B";
		mes "�������������Ă���x������";
		mes "�A�����s���Ă邩������܂���B";
		mes "�������Ȃ���΂������ǁc�c�B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "�]�X�̓�����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̓�����";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 24, 125;
		end;
	}
	cutin "ep19_iwin01.png", 2;
	mes "[�A�[�E�B���x����]";
	mes "�h�玞�̉H���̊p�x�I�@���̊J�����I";
	mes "�ꌩ�J���^���ȓ���ł�";
	mes "�S���̓����������ɑ�����";
	mes "�������i�D������ł��B";
	mes "��b�����͉����[���ł��ˁB";
	close2;
	cutin "ep19_iwin01.png", 255;
	end;
OnQuestInfo:
	if(EP20_3QUE == 10 || EP20_3QUE == 11)
		showevent 1, 1, "�A�[�E�B���x����#ep20_1";
	end;
}

icecastle.gat,26,129,3	script(CLOAKED)	�t���[�f���P#ep20_5	10458,{/* 3786 (cloaking)*/}
icecastle.gat,24,130,5	script	�A�[�E�B���x����#ep20_2	10461,{/* 3787 */
	if(EP20_3QUE == 11) {
		mes "[�A�[�E�B���x����]";
		mes "����ɂ���";
		mes "�t���[�f���P�l�B";
		mes "�����܂ł���������Ȃ��";
		mes "�������ł��ˁH";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "�t���[�f���P#ep20_5";
		next;
		mes "[�t���[�f���P]";
		mes "�����q����T���Ă��ł��B";
		mes "���܂���ł������`�H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A�[�E�B���x����]";
		mes "�����q���Ȃ�����t�߂ɗ����Ă܂���B";
		mes "�O�ɏo�����ƌ����ė����̂�";
		mes "�_�����ƒf������";
		mes "�Ȃ��������O���������";
		mes "�����o���āc�c�B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�A�[�E�B���x����]";
		mes "�ق�A�����ɁB";
		next;
		mes "[�t���[�f���P]";
		mes "�����ɂ����񂾂ˁB";
		mes "�悩�����`�B";
		cutin "ep19_friederike03.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		chgquest 11938,11939;
		set EP20_3QUE,12;
		end;
	}
	if(EP20_3QUE == 12) {
		mes "[�A�[�E�B���x����]";
		mes "�����q���Ȃ�����t�߂ɗ����Ă܂���B";
		mes "�O�ɏo�����ƌ����ė����̂�";
		mes "�_�����ƒf������";
		mes "�Ȃ��������O���������";
		mes "�����o���āc�c�B";
		cutin "ep19_iwin03.png", 2;
		cloakoffnpc "�t���[�f���P#ep20_5";
		cloakonnpc "�t���[�f���P#ep20_6";
		close2;
		cutin "ep19_iwin03.png", 255;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 11)
		showevent 1, 1, "�A�[�E�B���x����#ep20_2";
	end;
}
icecastle.gat,22,128,3	script(CLOAKED)	�t���[�f���P#ep20_6	10458,{/* 3788 (cloaking)*/}
icecastle.gat,20,128,3	script	�R�|#ep20_��	21995,{/* 3789 */
	if(EP20_3QUE == 12) {
		mes "[�t���[�f���P]";
		mes "�����ɂ����̂ˁA�����q���H";
		mes "���ꂳ�񂪐S�z���Ă���B";
		mes "�����������ɋA��c�c���`�`�I";
		cloakonnpc "�t���[�f���P#ep20_5";
		cloakoffnpc "�t���[�f���P#ep20_6";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "������ă����q������Ȃ���";
		mes "�����̖Ȃ̉�ł��`�B";
		next;
		mes "[�A�[�E�B���x����]";
		mes "�Ȃ񂾂��Ă�!?";
		mes "�����A�܂����Ȃ̉��";
		mes "�����̐g����ɂ���";
		mes "�O�ɏo��������̂��I";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�A�[�E�B���x����]";
		mes "���炢��������I";
		mes "�����T���ɍs���Ȃ�����I";
		next;
		mes "[�t���[�f���P]";
		mes "�����s���܂��B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A�[�E�B���x����]";
		mes "�����܂���I";
		mes "�O�͊댯�ł�����";
		mes "�{���͌x�����ɂ��C�����������B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "����܂Ƃ��ɂ�";
		mes "�Ȃ�܂��񂩂炟�c�c";
		mes "�ق�A�񕜖��@���g���܂����H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�A�[�E�B���x����]";
		mes "���`�`�`�ށB";
		mes "�ł�"+strcharinfo(0)+"�l����";
		mes "����Ȃ��悤�ɂ��Ă��������ˁB";
		mes "�����ł����ȁH";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�́`�`���I";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�A�[�E�B���x����]";
		mes strcharinfo(0)+"�l";
		mes "�t���[�f���P�l�̂���";
		mes "��낵�����肢�������܂��B";
		mes "���́A�{���Ɍ������x������������";
		mes "�W�߂Ă��܂��B";
		cutin "ep19_iwin03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ł́A�O�ɏo��";
		mes "�����q����T���܂��傤�B";
		mes "�c�c�����q���A���v���Ȃ��B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11939,11940;
		set EP20_3QUE,13;
		mes "�]�����q���T����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�����q���T����";
		mes "�@���������]";
		close2;
		warp "jor_back1.gat", 315, 245;
		end;
	}
	if(EP20_3QUE == 13) {
		mes "[�A�[�E�B���x����]";
		mes strcharinfo(0)+"�l";
		mes "�t���[�f���P�l�̂���";
		mes "��낵�����肢�������܂��B";
		mes "���́A�{���Ɍ������x������������";
		mes "�W�߂Ă��܂��B";
		cutin "ep19_iwin03.png", 2;
		cloakonnpc "�t���[�f���P#ep20_5";
		cloakoffnpc "�t���[�f���P#ep20_6";
		next;
		mes "[�t���[�f���P]";
		mes "�ł́A�O�ɏo��";
		mes "�����q����T���܂��傤�B";
		mes "�c�c�����q���A���v���Ȃ��B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		mes "�]�����q���T����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�����q���T����";
		mes "�@���������]";
		close2;
		warp "jor_back1.gat", 315, 245;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 12 || EP20_3QUE == 13)
		showevent 1, 1, "�R�|#ep20_��";
	end;
}
jor_back1.gat,310,245,3	script	�Ȗ�#ep20_1	10046,{/* 3790 */
	if(EP20_3QUE == 13) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͖k���ֈړ������݂�����-";
		next;
		chgquest 11940,11941;
		set EP20_3QUE,14;
		mes "�]�k��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�k��";
		mes "�@���������]";
		close2;
		warp "jor_back1.gat", 219, 387;
		end;
	}
	if(EP20_3QUE == 14) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͖k���ֈړ������݂�����-";
		next;
		mes "�]�k��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�k��";
		mes "�@���������]";
		close2;
		warp "jor_back1.gat", 219, 387;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 13 || EP20_3QUE == 14)
		showevent 1, 1, "�Ȗ�#ep20_1";
	end;
}
jor_back1.gat,219,392,3	script	�Ȗ�#ep20_2	10046,{/* 3791 */
	if(EP20_3QUE == 14) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͖k���ֈړ������݂�����-";
		next;
		chgquest 11941,11942;
		set EP20_3QUE,15;
		mes "�]�k��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�k��";
		mes "�@���������]";
		close2;
		warp "jor_back2.gat", 13, 242;
		end;
	}
	if(EP20_3QUE == 15) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͖k���ֈړ������݂�����-";
		next;
		mes "�]�k��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�k��";
		mes "�@���������]";
		close2;
		warp "jor_back2.gat", 13, 242;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 14 || EP20_3QUE == 15)
		showevent 1, 1, "�Ȗ�#ep20_2";
	end;
}
jor_back2.gat,8,242,3	script	�Ȗ�#ep20_3	10046,{/* 3792 */
	if(EP20_3QUE == 15) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͐����ֈړ������݂�����-";
		next;
		chgquest 11942,11943;
		set EP20_3QUE,16;
		mes "�]����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]����";
		mes "�@���������]";
		close2;
		warp "jor_back3.gat", 158, 360;
		end;
	}
	if(EP20_3QUE == 16) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͐����ֈړ������݂�����-";
		next;
		mes "�]����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]����";
		mes "�@���������]";
		close2;
		warp "jor_back3.gat", 158, 360;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 15 || EP20_3QUE == 16)
		showevent 1, 1, "�Ȗ�#ep20_3";
	end;
}
jor_back3.gat,163,360,3	script	�Ȗ�#ep20_4	10046,{/* 3793 */
	if(EP20_3QUE == 16) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͖k���ֈړ������݂�����-";
		next;
		chgquest 11943,11944;
		set EP20_3QUE,17;
		mes "�]�k��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�k��";
		mes "�@���������]";
		close2;
		warp "jor_back4.gat", 101, 260;
		end;
	}
	if(EP20_3QUE == 17) {
		mes "�]�����q���̖Ȗт̂悤���B";
		mes "�@�����Ă���Ȗт̕�������l�����";
		mes "�@�����q���͖k���ֈړ������݂�����-";
		next;
		mes "�]�k��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�k��";
		mes "�@���������]";
		close2;
		warp "jor_back4.gat", 101, 260;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 16 || EP20_3QUE == 17)
		showevent 1, 1, "�Ȗ�#ep20_4";
	end;
}

jor_back4.gat,101,265,0	script	#ep20slug_5	139,9,9,{/* 3794 */
	if(EP20_3QUE == 17 || EP20_3QUE == 18) {
		cloakoffnpc "�t���[�f���P#ep20_7";
		cloakoffnpc "�R�|#ep20_5";
	}
	if(EP20_3QUE >= 19)
		cloakoffnpc "�R�|#ep20_5";
	end;
}
jor_back4.gat,103,264,3	script(CLOAKED)	�t���[�f���P#ep20_7	10458,{/* 3795 (cloaking)*/
	if(EP20_3QUE == 17) {
		mes "[�t���[�f���P]";
		mes "�c�c�����q���H";
		cutin "ep19_friederike02.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		end;
	}
	if(EP20_3QUE == 18) {
		mes "[�t���[�f���P]";
		mes "���̎q�����ɓ�����@��";
		mes "�m���Ă���݂����ł��B";
		cutin "ep19_friederike02.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		end;
	}
	end;
}
jor_back4.gat,101,265,3	script(CLOAKED)	�R�|#ep20_5	21995,{/* 3796 (cloaking)*/
	if(EP20_3QUE == 17) {
		mes "[�t���[�f���P]";
		mes "�����I";
		mes "����ȏꏊ�ɃR�|�����܂���B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�˂��M���A���v�H";
		mes "�����ŉ������Ă���́H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�R�|]";
		mes "�c�c�B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���������āA���䂵�Ă�H";
		mes "�������Â��Ă�����ˁB";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�R�|]";
		mes "�c�c�B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ǂ����Ă���ȏꏊ�ɂ���́H";
		mes "�X�ł͌������Ȃ��q�����ǁc�c�B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�R�|]";
		mes "�c�c�c�B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ǂ����Ėق��Ă�́H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�R�|]";
		mes "�c�cT.T";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����A���ŋ����o����!?";
		mes "�����Ȃ��Ł`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�R�|]";
		mes "�s�b�c�c�s�C�b�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����I";
		mes "���̖Ȗт́A�����q���́I";
		mes "���������āA�����q�����ǂ��ɂ��邩";
		mes "�m���Ă�́H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�R�|]";
		mes "�s�C�b�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes strcharinfo(0)+"�l";
		mes "���̎q�A��肭����Ȃ��݂�������";
		mes "�q���ɂ��Ă͉H���������c�c";
		mes "������Ɨl�q�����������ł��B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�R�|]";
		mes "�c�c�s�b�s�b�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�R�|]";
		mes "�s�b�c�cT.T";
		next;
		mes "[�t���[�f���P]";
		mes "����H";
		mes "�Ȃɂ��Ă�́H";
		mes "�Ȃ��c�c���ցc�c�H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���A���������āc�c";
		mes "�����q���́A���̌��̒��ɂ���́H";
		next;
		mes "[�R�|]";
		mes "�s���b�c�cT.T";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����q�����A�ǂ����Ă����ɗ����̂�";
		mes "�킩��Ȃ����ǁc�c";
		mes "���ɗ�����������݂����ł��B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���`�`�`��c�c";
		mes "���̑O�̓��A�̂悤��";
		mes "�łŉ�������Ă͂��Ȃ��݂����ł��B";
		next;
		mes "[�t���[�f���P]";
		mes "�ł��A�x�����̓�����҂��Ă���";
		mes "��x��ɂȂ邩���c�c";
		mes "�����������ł����ɓ���܂��傤�B";
		next;
		mes "[�t���[�f���P]";
		mes "���̎q�����ɓ�����@��";
		mes "�m���Ă�݂����`�B";
		next;
		mes "[�R�|]";
		mes "�s�b�I�I";
		mes "�s���b�s���b�I�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep19_friederike03.png", 255;
		chgquest 11944,11945;
		set EP20_3QUE,18;
		mes "�]����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]����";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 51, 56;
		end;
	}
	if(EP20_3QUE == 18) {
		mes "[�R�|]";
		mes "�s���b�c�cT.T";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���̎q�����ɓ�����@��";
		mes "�m���Ă�݂����`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�R�|]";
		mes "�s�b�I�I";
		mes "�s���b�s���b�I�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo03.png", 255;
		mes "�]����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]����";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 51, 56;
		end;
	}
	if(EP20_3QUE >= 19) {
		mes "[�R�|]";
		mes "�s�b�I�I";
		mes "�s���b�s���b�I�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		cutin "ep20_cocopo03.png", 255;
		mes "�]����";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]����";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 51, 56;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 17 || EP20_3QUE == 18)
		showevent 1, 1, "�R�|#ep20_5";
	else if(EP20_3QUE >= 19)
		showevent 6, 1, "�R�|#ep20_5";
	end;
}
jor_slug_j.gat,40,52,0	warp	#slugout	2,2,jor_back4.gat,101,260
jor_slug_j.gat,52,61,0	script	#ep20_slug_sw1	139,9,9,{/* 3799 */
	if(EP20_3QUE == 18 || EP20_3QUE == 19) {
		cloakoffnpc "�t���[�f���P#sl1";
		cloakoffnpc "�����q��#sl1";
	}
	else {
		cloakonnpc "�t���[�f���P#sl1";
		cloakonnpc "�����q��#sl1";
	}
	end;
}
jor_slug_j.gat,50,61,5	script(CLOAKED)	�t���[�f���P#sl1	10458,{/* 3800 (cloaking)*/}
jor_slug_j.gat,52,61,3	script(CLOAKED)	�����q��#sl1	21995,{/* 3801 (cloaking)*/
	if(EP20_3QUE == 18) {
		mes "[�����q��]";
		mes "�����I";
		mes "�t���[�f���P���܁I";
		mes strcharinfo(0)+"���܂��I";
		cutin "ep20_cocopo02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����q���I";
		mes "�����������񂾂ˁB";
		mes "���`�S�z�����񂾂���`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�ǂ����āA����ȏꏊ�܂�";
		mes "����������́H";
		next;
		mes "[�����q��]";
		mes "���c�c";
		mes "���A���ꂪ�c�c�B";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���䂵�ĂȂ��H";
		mes "�����X�ɋA��H";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�����q��]";
		mes "���c�c";
		mes "���A�_���c�c�I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�_�����āA�ǂ��������ƁH";
		mes "�����͊댯�����Ēm���Ă��ˁH";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�����q��]";
		mes "���A����́c�c�B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����������̂������āH";
		mes "�����Ă���Ȃ��Ɓ`";
		mes strcharinfo(0)+"�l��";
		mes "�͐s���ŘA��A�����Ⴄ��`�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�����q��]";
		mes "�ƁA�F�B���c�c�Ђ����I";
		mes "�������Ɂc�c �Ђ����c�c";
		mes "�A�A��c�c�Ђ����c�c";
		mes "�A��čs���ꂿ�������!!";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�����q��]";
		mes "�t���[�f���P���܂��I";
		mes strcharinfo(0)+"���܂��I";
		mes "�{�N�̗F�B�������Ă悧�I";
		mes "��������������!!!";
		next;
		mes "[�t���[�f���P]";
		mes "�����`�`��ρI";
		mes "���������Ȃ�����I";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����q���A�F�B�͂ǂ���̕���";
		mes "�A��čs���ꂽ�́H";
		mes "�ē����ė~�����񂾂��ǁH";
		next;
		mes "[�����q��]";
		mes "�Ђ����c�c����I";
		mes "�������I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes strcharinfo(0)+"�l";
		mes "�����q�����ē����Ă���܂�����";
		mes "���F�B�������ɍs���܂��傤�B";
		mes "�����Ă���ɂ͂Ȃ��ł���`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		chgquest 11945,11946;
		set EP20_3QUE,19;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 85, 122;
		end;
	}
	if(EP20_3QUE == 19) {
		mes "[�����q��]";
		mes "�Ђ����c�c";
		mes "�������I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes strcharinfo(0)+"�l";
		mes "�����q�����ē����Ă���܂�����";
		mes "���F�B�������ɍs���܂��傤�B";
		mes "�����Ă���ɂ͂Ȃ��ł���`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 85, 122;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 18 || EP20_3QUE == 19)
		showevent 1, 1, "�����q��#sl1";
	end;
}
jor_slug_j.gat,86,127,0	script	#ep20_slug_sw2	139,9,9,{/* 3802 */
	if(EP20_3QUE == 19 || EP20_3QUE == 20) {
		cloakoffnpc "�t���[�f���P#sl2";
		cloakoffnpc "�R�|#sl2";
		cloakoffnpc "�����q��#sl2";
	}
	else {
		cloakonnpc "�t���[�f���P#sl2";
		cloakonnpc "�R�|#sl2";
		cloakonnpc "�����q��#sl2";
	}
	end;
}
jor_slug_j.gat,84,124,3	script(CLOAKED)	�t���[�f���P#sl2	10458,{/* 3803 (cloaking)*/}
jor_slug_j.gat,83,127,5	script(CLOAKED)	�R�|#sl2	21995,{/* 3804 (cloaking)*/}
jor_slug_j.gat,86,127,3	script(CLOAKED)	�����q��#sl2	21995,{/* 3805 (cloaking)*/
	if(EP20_3QUE == 19) {
		mes "[�����q��]";
		mes "���H�@�{���ɁH";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�R�|]";
		mes "�s���b�I";
		next;
		mes "[�t���[�f���P]";
		mes "�H�H�H";
		mes "�����q���́A���̎q�̌����Ă邱�Ƃ�";
		mes "�킩��́H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�����q��]";
		mes "���H";
		mes "���A����H";
		mes "���������H";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�Ƃ���ŁA���F�B�̖��O��";
		mes "�����Ă���Ȃ��H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�����q��]";
		mes "���c�c";
		mes "���O�H";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�Ăт�����ۂ�";
		mes "�m���Ă����Ȃ��ƍ���ł���H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�����q��]";
		mes "���̎q�̖��O��";
		mes "�s���s���c�c����B";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�s���s��?";
		mes "���������Ƃ̂Ȃ����O���ˁB";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�����q��]";
		mes "�t���[�f���P���܂�";
		mes "��������ƂȂ��Ǝv���c�c�B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����Ȃ́H";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�����q��]";
		mes "�������̓�����B";
		mes "�ł��A�E�~�E�V�������ז����Ă�c�c";
		mes "��ɐi�ނȂ�C��t���Ȃ�����B";
		cutin "ep20_cocopo01.png", 2;
		next;
		cutin "ep20_cocopo01.png", 255;
		chgquest 11946,131300;
		set EP20_3QUE,20;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 48, 181;
		end;
	}
	if(EP20_3QUE == 20) {
		mes "[�����q��]";
		mes "�������̓�����B";
		mes "�ł��A�E�~�E�V�������ז����Ă�c�c";
		mes "��ɐi�ނȂ�C��t���Ȃ�����B";
		cutin "ep20_cocopo01.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 48, 181;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 19 || EP20_3QUE == 20)
		showevent 1, 1, "�����q��#sl2";
	end;
}
jor_slug_j.gat,50,186,0	script	#ep20_slug_sw3	139,9,9,{/* 3806 */
	if(EP20_3QUE == 20 || EP20_3QUE == 21) {
		cloakoffnpc "�t���[�f���P#sl3";
		cloakoffnpc "�R�|#sl3";
		cloakoffnpc "�����q��#sl3";
	}
	else {
		cloakonnpc "�t���[�f���P#sl3";
		cloakonnpc "�R�|#sl3";
		cloakonnpc "�����q��#sl3";
	}
	end;
}
jor_slug_j.gat,49,188,3	script(CLOAKED)	�t���[�f���P#sl3	10458,{/* 3807 (cloaking)*/}
jor_slug_j.gat,46,186,5	script(CLOAKED)	�R�|#sl3	21995,{/* 3808 (cloaking)*/}
jor_slug_j.gat,50,186,3	script(CLOAKED)	�����q��#sl3	21995,{/* 3809 (cloaking)*/
	if(EP20_3QUE == 20) {
		mes "[�R�|]";
		mes "�s�b�s�b�s���b�I";
		mes "�s�C�b�s���b�I";
		next;
		mes "[�����q��]";
		mes "���������A������̓��ɍs�����̂�";
		mes "�������Č����Ă�I";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����Ă���Ă��肪�Ƃ��`�B";
		cutin "ep19_friederike03.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "[�R�|]";
		mes "�s���b�`";
		next;
		mes "[�����q��]";
		mes "�����s�����I";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�c�c�˂��A����������";
		mes "�s���s���́A�ǂ�����ĊX����o���́H";
		mes "�x�������������Ă����͂�����ˁB";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�����q��]";
		mes "�x���������Ă��Ȃ�����";
		mes "�O�ɏo���񂶂�Ȃ����Ȃ��H";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�����q��]";
		mes "�فA�ق�I";
		mes "�Ȃ̉���x�����";
		mes "�{�N������������������炢������B";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����������I";
		mes "�X�ɋA������A�x�����̐l��";
		mes "�����Ǝӂ�̂�H";
		mes "����ȃq�h�C���Y���āI";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�����q��]";
		mes "�Ђ����I";
		mes "���A�܂��E�~�E�V�������I";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "����I";
		mes "�떂�����Ă����ʂȂ񂾂���`�I";
		cutin "ep19_friederike04.png", 2;
		next;
		cutin "ep19_friederike04.png", 255;
		chgquest 131300,131301;
		set EP20_3QUE,21;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 159, 304;
		end;
	}
	if(EP20_3QUE == 21) {
		mes "[�����q��]";
		mes "�����s�����I";
		cutin "ep20_cocopo01.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 159, 304;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 20 || EP20_3QUE == 21)
		showevent 1, 1, "�����q��#sl3";
	end;
}
jor_slug_j.gat,159,309,0	script	#ep20_slug_sw4	139,9,9,{/* 3810 */
	if(EP20_3QUE == 21 || EP20_3QUE == 22) {
		cloakoffnpc "�t���[�f���P#sl4";
		cloakoffnpc "�����q��#sl4";
		cloakoffnpc "�R�|#sl4";
	}
	else {
		cloakonnpc "�t���[�f���P#sl4";
		cloakonnpc "�����q��#sl4";
		cloakonnpc "�R�|#sl4";
	}
	end;
}
jor_slug_j.gat,157,307,5	script(CLOAKED)	�t���[�f���P#sl4	10458,{/* 3811 (cloaking)*/}
jor_slug_j.gat,161,307,3	script(CLOAKED)	�����q��#sl4	21995,{/* 3812 (cloaking)*/}
jor_slug_j.gat,159,309,3	script(CLOAKED)	�R�|#sl4	21995,{/* 3813 (cloaking)*/
	if(EP20_3QUE == 21) {
		mes "[�R�|]";
		mes "�s���b�s���b�H";
		next;
		mes "[�����q��]";
		mes "�������ƃs���s���́A�����������āI";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "������Ƒ҂��āc�c";
		mes "�����q���c�c�����B���Ă��ˁH";
		mes "�����B���Ă���́H";
		mes "�����Ɍ����Ȃ����B";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[�����q��]";
		mes "�ȁA�Ȃɂ������Ă�́H";
		mes "�����B���ĂȂ���I";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�R���Ă��_�`���I";
		mes "�B���������鎞��";
		mes "�����ڂ��j���ł�񂾂���`�B";
		cutin "ep19_friederike04.png", 2;
		next;
		mes "[�����q��]";
		mes "�����c�c";
		mes "����́c�c�B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�����q��]";
		mes "�c�c�c�c�B";
		next;
		mes "[�����q��]";
		mes "�c�c�}�}�ɂ�";
		mes "�����ɂ��Ă����Ă����H";
		mes "�񑩂��Ă����Ȃ�";
		mes "�b���Ă��ǂ���c�c�B";
		cutin "ep20_cocopo02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�c�c�킩�����B";
		mes "�񑩂���B";
		cutin "ep19_friederike05.png", 2;
		next;
		mes "[�����q��]";
		mes "�c�c���̓s���s����";
		mes "�X�ɏZ�ގq����Ȃ���";
		mes "�Ñ�̕X�̋��J�ɏZ�ގq�Ȃ񂾁B";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�����q��]";
		mes "��l�����ɒm�����";
		mes "�s���s���Ɖ�Ȃ��Ȃ����Ⴄ�B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "����ŉR���Ă��̂ˁH";
		mes "�ł��A����Ȋ댯�ȏꏊ��";
		mes "������_������B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�����q��]";
		mes "����ȋ��낵�����������o���̂�";
		mes "���߂Ă������񂾁I";
		mes "�����́A�����s���s����";
		mes "���т�H�ׂĂ�ꏊ�Ȃ񂾁B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�����q��]";
		mes "�{�N�͂����c�c";
		mes "�s���s���ƈꏏ��";
		mes "�V�����t���[�o�[��";
		mes "�|�����N���X�v��H�ׂ������������c�c";
		mes "�������B";
		next;
		mes "[�t���[�f���P]";
		mes "���񂤂�A�������ˁB";
		mes "�����s���s���������āA�A�낤�B";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		chgquest 131301,131302;
		set EP20_3QUE,22;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 71, 336;
		end;
	}
	if(EP20_3QUE == 22) {
		mes "[�t���[�f���P]";
		mes "���񂤂�A�������ˁB";
		mes "�����s���s���������āA�A�낤�B";
		cutin "ep19_friederike05.png", 2;
		next;
		cutin "ep19_friederike05.png", 255;
		mes "�]���";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]���";
		mes "�@���������]";
		close2;
		warp "jor_slug_j.gat", 71, 336;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 21 || EP20_3QUE == 22)
		showevent 1, 1, "�R�|#sl4";
	end;
}
jor_slug_j.gat,66,336,0	script	#ep20_slug_sw5	139,9,9,{/* 3814 */
	if(EP20_3QUE == 22 || EP20_3QUE == 23) {
		cloakoffnpc "�t���[�f���P#sl5";
		cloakoffnpc "�����q��#sl5";
		cloakoffnpc "�R�|#sl5";
	}
	end;
}
jor_slug_j.gat,68,337,3	script(CLOAKED)	�t���[�f���P#sl5	10458,{/* 3815 (cloaking)*/}
jor_slug_j.gat,67,334,3	script(CLOAKED)	�����q��#sl5	21995,{/* 3816 (cloaking)*/}
jor_slug_j.gat,60,336,5	script(CLOAKED)	�������V�g�E�~�E�V#ep	21982,{/* 3817 (cloaking)*/}
jor_slug_j.gat,66,336,5	script(CLOAKED)	�R�|#sl5	21995,{/* 3818 (cloaking)*/
	if(EP20_3QUE == 22) {
		mes "[�����q��]";
		mes "�s���s��!!!";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�s���s��]";
		mes "�s�b�`�I";
		cutin "ep20_cocopo01.png", 255;
		next;
		cloakoffnpc "�������V�g�E�~�E�V#ep";
		setnpcdisplay "�������V�g�E�~�E�V#ep",21982;
		misceffect 668,"�������V�g�E�~�E�V#ep",1;
		mes "[�t���[�f���P]";
		mes "�����q��!!!";
		mes "��Ȃ��I";
		cutin "ep19_friederike02.png", 2;
		if(!sleep2(1000)) end;
		misceffect 58,"�t���[�f���P#sl5",1;
		if(!sleep2(1000)) end;
		misceffect 112,"�����q��#sl5",1;
		misceffect 112,"�R�|#sl5",1;
		misceffect 112,"�t���[�f���P#sl5",1;
		if(!sleep2(200)) end;
		misceffect 336,"�t���[�f���P#sl5",1;
		misceffect 336,"�����q��#sl5",1;
		misceffect 336,"�R�|#sl5",1;
		next;
		menu "�����q����������I",-;
		misceffect 565,"�������V�g�E�~�E�V#ep",1;
		if(!sleep2(1000)) end;
		misceffect 567,"�������V�g�E�~�E�V#ep",1;
		if(!sleep2(1000)) end;
		misceffect 17,"�������V�g�E�~�E�V#ep",1;
		cloakonnpc "�������V�g�E�~�E�V#ep";
		next;
		mes "[�����q��]";
		mes "���肪�Ƃ��I";
		mes strcharinfo(0)+"����!!";
		mes "�t���[�f���P���܂��I";
		cutin "ep20_cocopo02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "��l�������ł悩�����`�B";
		cutin "ep19_friederike03.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�s���s�������䂵�ĂȂ���ˁH";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����A��Ȃ��Ɓ`�B";
		mes "�����͎q�������ɂ͊댯�߂����B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		chgquest 131302,131303;
		set EP20_3QUE,23;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		//
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 67, 213;
		end;
	}
	if(EP20_3QUE == 23) {
		mes "[�t���[�f���P]";
		mes "�����A��Ȃ��Ɓ`�B";
		mes "�����͎q�������ɂ͊댯�߂����B";
		cutin "ep19_friederike02.png", 2;
		next;
		cutin "ep19_friederike02.png", 255;
		mes "�]�X�̏��";
		mes "�@�������܂����H�]";
		next;
		if(select("������","��߂�") == 2) {
			mes "�]���̏�ɂƂǂ܂����]";
			close;
		}
		mes "�]�X�̏��";
		mes "�@���������]";
		close2;
		warp "icecastle.gat", 67, 213;
		end;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 22 || EP20_3QUE == 23)
		showevent 1, 1, "�R�|#sl5";
	end;
}

icecastle.gat,67,218,5	script(CLOAKED)	�����n#ep20_DQ_8	10461,{/* 3818 (cloaking)*/
	if(EP20_3QUE == 23) {
		mes "[�����n]";
		mes "�����A�����q���I";
		mes "���������ǂ��֍s���Ă��́I";
		mes "�݁`��Ȃ��O�̂��Ƃ�";
		mes "�S�z���Ă����̂�I";
		cutin "ep19_iwin04.png", 2;
		cloakoffnpc "�t���[�f���P#ep20_2";
		cloakoffnpc "�����q��#ep20_e";
		next;
		mes "[�����n]";
		mes strcharinfo(0)+"�l";
		mes "�t���[�f���P�l�I";
		mes "�����q����T���Ă�������";
		mes "�{���ɂ��肪�Ƃ��������܂����I";
		next;
		mes "[�����q��]";
		mes "�c�c";
		mes "���߂�Ȃ����B";
		cutin "ep20_cocopo03.png", 2;
		next;
		mes "[�����n]";
		mes "�܂��I�@���炭�f������Ȃ�!!";
		mes "�������������������́H";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "���Ă�悤�Ȃ̂�";
		mes "�܂��͋x�܂��Ă����Ă��������B";
		mes "�ڂ����b�͌�Łc�c�B";
		cutin "ep19_friederike01.png", 2;
		next;
		mes "[�����n]";
		mes "�����ł��ˁB";
		mes "�ق�A�����q���A�������ɓ���Ȃ����B";
		cutin "ep19_iwin04.png", 2;
		next;
		mes "[�����q��]";
		mes "����c�c�I";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes "�����q���������ŗǂ������ł��`�B";
		mes "���A�ł��������Ă��܂��܂����B";
		mes "���������ɋA��܂��ˁ`�B";
		cutin "ep19_friederike02.png", 2;
		next;
		mes "[�t���[�f���P]";
		mes strcharinfo(0)+"�l�B";
		mes "����`����������";
		mes "���肪�Ƃ��������܂��B";
		mes "�܂����̕����ɗV�тɗ��Ă��������B";
		mes "���َq�������ς��p�ӂ��Ă܂�����`�B";
		cutin "ep19_friederike03.png", 2;
		close2;
		cutin "ep19_friederike03.png", 255;
		cloakonnpc "�t���[�f���P#ep20_2";
		chgquest 131303,11947;
		set EP20_3QUE,24;
		end;
	}
	if(EP20_3QUE == 24) {
		cutin "ep19_iwin04.png", 2;
		mes "[�����n]";
		mes "�t���[�f���P�l����";
		mes "���b�𕷂��܂����B";
		next;
		mes "[�����n]";
		mes "���J�ɏZ�ތÑ�A�C�X�E�B���h�Ƃ�";
		mes "�����Ȋ֌W�ł͂���̂ł���";
		mes "�c���R�|�������m��";
		mes "����Ȃ��ƋC�ɂȂ�Ȃ��悤�ł��ˁB";
		next;
		mes "[�����n]";
		mes "����͍K���A�厖�ɂȂ�Ȃ������̂�";
		mes "��ڂɌ������ł����c�c";
		mes "���̃E�~�E�V�̑��A�ɍs���R�|��";
		mes "�ӊO�ɑ����悤�Ȃ�ł��B";
		next;
		mes "[�����n]";
		mes "�q�������̈��S�ׂ̈ɂ�";
		mes "�ł��邾���댯�ȃ����X�^�[��";
		mes "�r���������ƍl���Ă��܂��B";
		mes "�悯��Ύ��݂��Ă��������܂��񂩁H";
		close2;
		cutin "ep19_iwin04.png", 255;
		setquest 202430;
		delquest 11947;
		set EP20_3QUE,100;
		getitem 1001217,50;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		getexp 2000000000,0,0;
		getexp 0,1500000000,0;
		setquest 11928;
		compquest 11928;
		setquest 11945;
		compquest 11945;
		setquest 131304;
		end;
	}
	if(EP20_3QUE == 100) {
		mes "[�����n]";
		mes "���͂悤�������܂�";
		mes strcharinfo(0)+"�l�B";
		mes "�������ǂ��V�C�ł��ˁI";
		cutin "ep19_iwin04.png", 2;
		while(1) {
			next;
			if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�Ñ�̕X�̋��J ����)") == 2) {
				mes "^ff0000�]�ړ��ɂ�500Zeny���K�v�ł��]^000000";
				next;
				if(!checkquest(11953) || !checkquest(11955)) {
					mes "[�����n]";
					cutin "ep19_iwin04.png", 2;
					mes "�܂��A�ڍׂ��m�F���Ă��Ȃ�";
					mes "�˗�������݂����ł����c�c";
					mes "���n�֌������܂����H";
					next;
					if(select("�N�G�X�g�̎󒍂�񍐂��s��","�_���W�����Ɉړ�����(�Ñ�̕X�̋��J ����)") == 1)
						break;
					mes "[�����n]";
					cutin "ep19_iwin04.png", 2;
					mes "������܂����B";
					mes "����ł́A���C�����āB";
				}
				else {
					mes "[�����n]";
					cutin "ep19_iwin04.png", 2;
					mes "����ł́A���n�֌������Ă��������B";
				}
				close2;
				cutin "kafra_01.bmp", 255;
				if(Zeny < 500)
					end;
				set Zeny, Zeny -500;
				warp "jor_back5j.gat", 16, 239;
				end;
			}
			break;
		}
		setarray '@questname$,"�����肵���炢���ȇ@","�����肵���炢���ȇA";
		setarray '@questid,11953,11955;
		setarray '@coolid,11954,11956;
		setarray '@gainlist,1001217,10,1001217,10;
		setarray '@explist,475000000,356250000,475000000,356250000;
		set '@sel,callfunc("IsgardDQ",'@questname$,'@itemlist,'@questid,'@coolid,'@gainlist,'@explist);
		// �ȉ��ʏ���
		switch('@sel) {
		case 0:	// �����肵���炢���ȇ@
			if(checkquest(11954)) {
				if(checkquest(11954)&2 == 0) {
					mes "[�����n]";
					cutin "ep19_iwin04.png", 2;
					mes "�����͂����x���";
					mes "�����܂��󋵂����܂��傤�B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�����肵���炢���ȇ@^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(11953)) {
				if(checkquest(11953)&4 == 0) {
					mes "[�����n]";
					cutin "ep19_iwin04.png", 2;
					mes "�Ñ�̕X�̋��J�̓����ɂ���";
					mes "^e5555e�O���[�A�C�X�E�B���h^000000��";
					mes "10�C���炵�߂Ă��Ă��������B";
					mes "���ɂ̓K�c���Ƃ�邱�Ƃ�";
					mes "�K�v�ł�����ˁB";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�����肵���炢���ȇ@^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 11953;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�����肵���炢���ȇ@^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����肵���炢���ȇ@^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>�O���[�A�C�X�E�B���h<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>�@10��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 9.5G ( 9500000000 )";
				mes "��475000000��20��󂯎��܂��B";
				mes "JobExp 7.125G ( 7125000000 )";
				mes "��356250000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����肵���炢���ȇ@^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close;
				}
				delquest 11953;
				setquest 11954;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 475000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,356250000,0;
				mes "[�����n]";
				cutin "ep19_iwin04.png", 2;
				mes "���肪�Ƃ��������܂����B";
				mes "�ǂ��ł��傤�c�c";
				mes "�����ł����ʂ�����΂����񂾂��ǁB";
				mes "�����͂����x���";
				mes "�����܂��󋵂����܂��傤�B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 9.5G";
				mes "( 9500000000 )";
				mes "��475000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 7.125G";
				mes "( 7125000000 )";
				mes "��356250000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[�����n]";
			cutin "ep19_iwin04.png", 2;
			mes "�q���������m�͂Ƃ�����";
			mes "�����ȊO�ɍU���I�ȓz���";
			mes "��肪����悤�Ɏv���܂��B";
			mes "�������炵�߂��";
			mes "�l�������Ă���邩���c�c�B";
			next;
			mes "[�����n]";
			cutin "ep19_iwin04.png", 2;
			mes "�Ñ�̕X�̋��J�̓����ɂ���";
			mes "^e5555e�O���[�A�C�X�E�B���h^000000��";
			mes "10�C���炵�߂Ă��Ă��������B";
			mes "���ɂ̓K�c���Ƃ�邱�Ƃ�";
			mes "�K�v�ł�����ˁB";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�����肵���炢���ȇ@^000000�v";
			mes "<���e>";
			mes "�ΏہF<URL>�O���[�A�C�X�E�B���h<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND1</INFO></URL>�@10��";
			mes "�̓������󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�����n]";
				cutin "ep19_iwin04.png", 2;
				mes "���f����̂ł����H";
				mes "������܂����B";
				mes "�܂��肪�󂢂����ɂ��肢���܂��B";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11953;
			if(checkquest(11954)) delquest 11954;
			mes "[�����n]";
			cutin "ep19_iwin04.png", 2;
			mes "����ł́A��낵�����肢���܂��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�����肵���炢���ȇ@^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		case 1:	// �����肵���炢���ȇA
			if(checkquest(11956)) {
				if(checkquest(11956)&2 == 0) {
					mes "[�����n]";
					cutin "ep19_iwin04.png", 2;
					mes "�����͂����x���";
					mes "�����܂��󋵂����܂��傤�B";
					next;
					mes "[�C���t�H���[�V����]";
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�����肵���炢���ȇA^000000�v";
					mes "�͎��Ԑ������ł��B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
			}
			if(checkquest(11955)) {
				if(checkquest(11955)&4 == 0) {
					mes "[�����n]";
					cutin "ep19_iwin04.png", 2;
					mes "�Ñ�̕X�̋��J�̐����ɂ���";
					mes "^e5555e�z���C�g�A�C�X�E�B���h^000000��";
					mes "10�C���炵�߂Ă��Ă��������B";
					mes "���ɂ̓K�c���Ƃ�邱�Ƃ�";
					mes "�K�v�ł�����ˁB";
					next;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�����肵���炢���ȇA^000000�v";
					mes "�͎󒍍ς݂̃N�G�X�g�ł��B";
					mes "������̃N�G�X�g��j�����܂����H";
					next;
					if(select("��߂�","�j������") == 1) {
						mes "^ff0000[�C���t�H���[�V����]^000000";
						mes "^ff0000�����𒆒f���܂����B^000000";
						close2;
						cutin "kafra_01.bmp", 255;
						end;
					}
					delquest 11955;
					mes "<<B>�N�G�X�g</B>>";
					mes "�u^ff0000�����肵���炢���ȇA^000000�v";
					mes "��j�����܂����B";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����肵���炢���ȇA^000000�v";
				mes "<���e>";
				mes "�ΏہF<URL>�z���C�g�A�C�X�E�B���h<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND2</INFO></URL>�@10��";
				mes "�̓���";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 9.5G ( 9500000000 )";
				mes "��475000000��20��󂯎��܂��B";
				mes "JobExp 7.125G ( 7125000000 )";
				mes "��356250000��20��󂯎��܂��B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				next;
				mes "<<B>�N�G�X�g</B>>";
				mes "�u^ff0000�����肵���炢���ȇA^000000�v";
				mes "��񍐂��܂����H";
				next;
				if(select("�񍐂���","��߂�") == 2) {
					mes "^ff0000[�C���t�H���[�V����]^000000";
					mes "^ff0000�����𒆒f���܂����B^000000";
					close2;
					cutin "kafra_01.bmp", 255;
					end;
				}
				if(checkitemblank() == 0) {
					mes "[�C���t�H���[�V����]";
					mes "����ȏ㑽���̎�ނ�";
					mes "�ו��������Ƃ��o���܂���B";
					mes "1�ȏ�̋󂫂�����Ă��������B";
					close;
				}
				delquest 11955;
				setquest 11956;
				getitem 1001217,10;
				for('@i=0; '@i < 20; '@i++)
					getexp 475000000,0,0;
				for('@i=0; '@i < 20; '@i++)
					getexp 0,356250000,0;
				mes "[�����n]";
				cutin "ep19_iwin04.png", 2;
				mes "���肪�Ƃ��������܂����B";
				mes "�ǂ��ł��傤�c�c";
				mes "�����ł����ʂ�����΂����񂾂��ǁB";
				mes "�����͂����x���";
				mes "�����܂��󋵂����܂��傤�B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "BaseExp 9.5G";
				mes "( 9500000000 )";
				mes "��475000000 BaseExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "JobExp 7.125G";
				mes "( 7125000000 )";
				mes "��356250000 JobExp��";
				mes "�@20��󂯎��܂����B";
				next;
				mes "^0000ff<<B>��V</B>>^000000";
				mes "�A�C�e���F<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�@10��";
				mes "���l�����܂����B";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			mes "[�����n]";
			cutin "ep19_iwin04.png", 2;
			mes "�q���������m�͂Ƃ�����";
			mes "�����ȊO�ɍU���I�ȓz���";
			mes "��肪����悤�Ɏv���܂��B";
			mes "�������炵�߂��";
			mes "�l�������Ă���邩���c�c�B";
			next;
			mes "[�����n]";
			cutin "ep19_iwin04.png", 2;
			mes "�Ñ�̕X�̋��J�̐����ɂ���";
			mes "^e5555e�z���C�g�A�C�X�E�B���h^000000��";
			mes "10�C���炵�߂Ă��Ă��������B";
			mes "���ɂ̓K�c���Ƃ�邱�Ƃ�";
			mes "�K�v�ł�����ˁB";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�����肵���炢���ȇA^000000�v";
			mes "<���e>";
			mes "�ΏہF<URL>�z���C�g�A�C�X�E�B���h<INFO>https://rotool.gungho.jp/monster/EP20_ICEWIND2</INFO></URL>�@10��";
			mes "�̓������󒍂��܂����H";
			next;
			if(select("�󒍂���","��߂�") == 2) {
				mes "[�����n]";
				cutin "ep19_iwin04.png", 2;
				mes "���f����̂ł����H";
				mes "������܂����B";
				mes "�܂��肪�󂢂����ɂ��肢���܂��B";
				next;
				mes "^ff0000[�C���t�H���[�V����]^000000";
				mes "^ff0000�����𒆒f���܂����B^000000";
				close2;
				cutin "kafra_01.bmp", 255;
				end;
			}
			setquest 11955;
			if(checkquest(11956)) delquest 11956;
			mes "[�����n]";
			cutin "ep19_iwin04.png", 2;
			mes "����ł́A��낵�����肢���܂��B";
			next;
			mes "<<B>�N�G�X�g</B>>";
			mes "�u^ff0000�����肵���炢���ȇA^000000�v";
			mes "���󒍂��܂����B";
			close2;
			cutin "kafra_01.bmp", 255;
			end;
		}
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 23 || EP20_3QUE == 24)
		showevent 1, 1, "�����n#ep20_DQ_8";
	else if(EP20_3QUE == 100) {
		if((!checkquest(11953) && (!checkquest(11954) || checkquest(11954)&0x2) || checkquest(11953) && checkquest(11953)&0x4) || 
			(!checkquest(11955) && (!checkquest(11956) || checkquest(11956)&0x2) || checkquest(11955) && checkquest(11955)&0x4))
			showevent 0, 3, "�����n#ep20_DQ_8";
		else if(checkquest(11953) && checkquest(11953)&0x4 == 0 || checkquest(11955) && checkquest(11955)&0x4 == 0)
			showevent 0, 2, "�����n#ep20_DQ_8";
		else
			showevent 9999, 0, "�����n#ep20_DQ_8";
	}
	end;
}
icecastle.gat,69,217,3	script(CLOAKED)	�����q��#ep20_e	21995,{/* 3819 (cloaking)*/
	if(EP20_3QUE < 100) {
		mes "[�����q��]";
		mes "�c�c�B";
		cutin "ep20_cocopo03.png", 2;
		close2;
		cutin "ep20_cocopo03.png", 255;
		end;
	}
	if(checkquest(131304)) {
		mes "[�����q��]";
		mes "�s���s�������ƗV�т����Ȃ��c�c�B";
		cutin "ep20_cocopo01.png", 2;
		next;
		mes "�]�����q����";
		mes "�@���ꂩ����u�ׂ����C�v��";
		mes "�@�s������̂悤���B";
		mes "�@�S�z������A���čs����";
		mes "�@�����悤���ȁc�c�]";
		close2;
		cutin "ep20_cocopo01.png", 255;
		delquest 131304;
		end;
	}
	mes "�]�����q���́u�ׂ����C�v��";
	mes "�@���������Ƃ��Ă���悤���]";
	next;
	mes "^e6328c�������A���_���W����^000000";
	mes "^e6328c�u�ׂ����C�v��^000000";
	mes "^e6328c�����Ɠ��ꂪ�s���܂��B^000000";
	mes "�@";
	mes "^8c32e6�_���W���������F^191970�����\";
	mes "^8c32e6�_���W��������F^191970����\";
	mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
	messize 180,364;
	next;
	switch(select("^191970��������","^0b0b33�������A���_���W�����̍쐬","^0b0b33���ӎ����̊m�F")) {
	case 1:
		mes "�]���Ȃ��͂��̏���������]";
		close;
	case 2:
	case 3:
		mes "�ڂ����͂���������m�F���������B";
		mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
		messize 180,364;
		close;
	}
	end;
OnQuestInfo:
	if(EP20_3QUE == 100)
		showevent 0, 3, "�����q��#ep20_e";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̐����Ɠ���]";
	end;
}

jor_twig.gat,114,147,0	script	#hw_ep20re6	139,14,14,{/* 3821 */
	if(EP20_1QUE < 100)
		cloakonnpc "���E���̎}#jor_twig";
	else
		cloakoffnpc "���E���̎}#jor_twig";
	end;
}
jor_twig.gat,125,152,4	script(CLOAKED)	�I�[�����[#ep20_twbs_in	10465,{/* 3822 (cloaking)*/}
jor_twig.gat,121,153,4	script(CLOAKED)	�j����#ep20_twbs_in	10537,{/* 3823 (cloaking)*/}
jor_twig.gat,114,147,4	script(CLOAKED)	���E���̎}#jor_twig	10046,{/* 3824 (cloaking)*/
	mes "^e6328c�]���̃N�G�X�g��i�s����ɂ�";
	mes "�@�ȉ��̏����𖞂����K�v������܂��]";
	mes "�@�EBaseLv260�ȏ�";
	mes "�@�E�N�G�X�g�u���ȂȂ��ҁv�̃N���A";
	mes "�@";
	mes "�ڍׂ͌����T�C�g���������������B";
	mes "<URL>EPISODE�FISGARD �`���ȂȂ��ҁ`<INFO>https://ragnarokonline.gungho.jp/special/episode/isgard2/</INFO></URL>";
	messize 180,364;
	close;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[MD�̐����Ɠ���]";
	end;
}

icas_in.gat,188,60,3	script	�|����#ep19	10461,{/* 3824 */
	cutin "ep19_iwin11.png", 2;
	mes "[�|����]";
	mes "���̓��F���O���f�l����������";
	mes "�O���C�V�A����̌������s���Ă���B";
	mes "�@";
	mes "�L�~�������u<ITEM>�֐_�̗�<INFO>1001251</INFO></ITEM>�v�������Ă�����";
	mes "�u�O���C�V�A����v�V���[�Y��";
	mes "�u�f�B���O���C�V�A����v�V���[�Y��";
	mes "�������Ă����悤�B";
	mes "�@";
	mes "����ɁA�ꕔ�̑����͎��̗͂�";
	mes "�G���`�����g���{�����Ƃ��\���B";
	mes "�u�f�B���O���C�V�A����v�V���[�Y�Ȃ�";
	mes "�u<ITEM>�����ȕX�؂̖���<INFO>1000811</INFO></ITEM>�v��";
	mes "�u<ITEM>�X�؂̖���<INFO>1000812</INFO></ITEM>�v��";
	mes "�u�O���C�V�A�h��v�V���[�Y�Ȃ�";
	mes "�u<ITEM>�_���ȔL�̂Ђ�<INFO>1001217</INFO></ITEM>�v�������Ă�����";
	mes "���͂𒲐߂��Đ��\�������グ�Ă݂��悤�B";
	mes "�@";
	mes "<URL>�u�O���C�V�A����v�V���[�Y�l���E����<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/glacier.html</INFO></URL>";
	mes "<URL>�u�O���C�V�A�h��v�V���[�Y�l���E����<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/glacier-armor.html</INFO></URL>";
	mes "<URL>�u�f�B���O���C�V�A����v�V���[�Y�l���E����<INFO>https://ragnarokonline.gungho.jp/gameguide/system/expand-item/d-glacier.html</INFO></URL>";
	messize 430,364;
	next;
	switch(select("�O���C�V�A�h��V���[�Y","�f�B���O���C�V�A����쐬","�G���`�����g","�b����߂�")) {
	case 4:
		mes "[�|����]";
		mes "�����̊ԁA������";
		mes "���F���O���f�l�̎d����";
		mes "��`�����肾�B";
		mes "���ł��C�y�ɖK�˂Ă���B";
		messize 180,280;
		close2;
		cutin "ep19_iwin11.png", 255;
		end;
	}
OnInit:
	setnpcgroup 1016;
	setnpctitle "[�G���`�����g]";
	end;
}

// Warp
jor_sanct.gat,28,291,0	warp	enter_maze	1,1,jor_maze.gat,206,16
jor_maze.gat,206,12,0	warp	out_maze	1,1,jor_sanct.gat,28,286

jor_maze.gat,198,58,0	script	maze_a1_to_b1	45,1,1,{/* 3829 */
	warp "jor_maze.gat",268,116;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,268,113,0	script	maze_b1_to_a1	45,1,1,{/* 3830 */
	warp "jor_maze.gat",198,54;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,264,187,0	script	maze_b2_to_c2	45,1,1,{/* 3831 */
	warp "jor_maze.gat",85,256;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,89,256,0	script	maze_c2_to_b2	45,1,1,{/* 3832 */
	warp "jor_maze.gat",268,187;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,46,275,0	script	maze_c3_to_d3	45,1,1,{/* 3833 */
	warp "jor_maze.gat",16,16;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,16,12,0	script	maze_d3_to_c3	45,1,1,{/* 3834 */
	warp "jor_maze.gat",46,271;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,88,28,0	script	maze_d4_to_e4	45,1,1,{/* 3835 */
	warp "jor_maze.gat",151,281;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,151,285,0	script	maze_e4_to_d4	45,1,1,{/* 3836 */
	warp "jor_maze.gat",88,32;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,182,206,0	script	maze_e5_to_f5	45,1,1,{/* 3837 */
	warp "jor_maze.gat",192,153;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,192,157,0	script	maze_f5_to_e5	45,1,1,{/* 3838 */
	warp "jor_maze.gat",182,210;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,164,138,0	script	maze_f6_to_g6	45,1,1,{/* 3839 */
	warp "jor_maze.gat",49,162;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,53,162,0	script	maze_g6_to_f6	45,1,1,{/* 3840 */
	warp "jor_maze.gat",168,138;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,50,125,0	script	maze_g7_to_f7	45,1,1,{/* 3841 */
	warp "jor_maze.gat",192,106;
	end;
}
jor_maze.gat,192,102,0	script	maze_f7_to_g7	45,1,1,{/* 3842 */
	warp "jor_maze.gat",50,121;
	end;
}
jor_maze.gat,34,189,0	script	maze_g8_to_h8	45,1,1,{/* 3843 */
	warp "jor_maze.gat",104,156;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,104,152,0	script	maze_h8_to_g8	45,1,1,{/* 3844 */
	warp "jor_maze.gat",34,185;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,104,207,0	script	maze_h9_to_i9	45,1,1,{/* 3845 */
	warp "jor_maze.gat",148,28;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,148,24,0	script	maze_i9_to_h9	45,1,1,{/* 3846 */
	warp "jor_maze.gat",104,203;
	end;
OnQuestInfo:
	showevent 0, 3;
	end;
}
jor_maze.gat,140,79,0	script	maze_to_twice	45,1,1,{/* 3847 */
	if(EP20_1QUE < 47) {
		unittalk getcharid(3),strcharinfo(0)+" : ������a�����������悤�ȋC������c�c�B",1;
		end;
	}
	warp "jor_twice.gat",42,55;
	end;
}
jor_twice.gat,40,52,0	warp	twice_to_maze	1,1,jor_maze.gat,140,75
jor_maze.gat,136,176,0	script	maze_h10_to_j10	45,1,1,{/* 3849 */
	warp "jor_maze.gat",260,46;
	end;
}
jor_maze.gat,260,50,0	script	maze_j10_to_h10	45,1,1,{/* 3850 */
	warp "jor_maze.gat",136,180;
	end;
}
jor_maze.gat,14,283,0	script	maze_c11_to_k11	45,1,1,{/* 3851 */
	warp "jor_maze.gat",282,246;
	end;
}
jor_maze.gat,282,242,0	script	maze_k11_to_c11	45,1,1,{/* 3852 */
	warp "jor_maze.gat",14,279;
	end;
}
jor_maze.gat,217,289,0	script	maze_k12_to_b12	45,1,1,{/* 3853 */
	warp "jor_maze.gat",243,156;
	end;
}
jor_maze.gat,243,152,0	script	maze_b12_to_k12	45,1,1,{/* 3854 */
	warp "jor_maze.gat",217,285;
	end;
}
//jor_maze.gat,260,50,0	script	maze_j10_to_h10	45,{/* 3855 */}

jor_back3.gat,159,365,0	warp	back3_to_back4	1,1,jor_back4.gat,273,19
jor_back4.gat,277,16,0	warp	back4_to_back3	1,1,jor_back3.gat,159,360
jor_back4.gat,6,374,0	warp	back4_to_back5	1,1,jor_back5.gat,340,20
jor_back5.gat,339,14,0	warp	back5_to_back4	1,1,jor_back4.gat,10,370
jor_back6.gat,30,147,0	warp	back6_to_root3	1,1,jor_root3.gat,367,129
jor_back6j.gat,30,147,0	warp	back6j_to_root3	1,1,jor_root3.gat,367,129
jor_root3.gat,372,129,0	script	root3_to_back6	45,1,1,{/* 6105 */
	mes "�]�ǂ���֌����������H�]";
	next;
	switch(select("�Ñ�̕X�̋��J ����","�Ñ�̕X�̋��J ����(�N�G�X�g)")) {
	case 1:
		mes "�]�Ñ�̕X�̋��J �����֌��������]";
		close2;
		warp "jor_back6j.gat",34,147;
		end;
	case 2:
		mes "�]�Ñ�̕X�̋��J ����(�N�G�X�g)�֌��������]";
		close2;
		warp "jor_back6.gat",34,147;
		end;
	}
}
jor_root1.gat,32,11,0	warp	roo1_to_nest	1,1,jor_nest.gat,38,270
jor_root1.gat,59,295,0	warp	root1_to_root2	1,1,jor_root2.gat,25,17
jor_root2.gat,25,10,0	warp	root2_to_root1	1,1,jor_root1.gat,59,290
jor_root2.gat,25,291,0	script	root2_to_sanct	45,1,1,{/* 3865 */
OnTouch:
	warp "jor_sanct.gat",150,47;
	end;
OnQuestInfo:
	if(EP20_1QUE == 21)
		showevent 0, 1, "root2_to_sanct";
	end;
}
jor_sanct.gat,150,43,0	warp	sanct_to_root2	1,1,jor_root2.gat,25,285
icecastle.gat,230,160,0	warp	enter_in2	1,1,icas_in2.gat,109,32
icas_in2.gat,109,29,0	warp	in2_out	1,1,icecastle.gat,227,158
icas_in2.gat,125,60,0	warp	ente_in2_right	1,1,icas_in2.gat,163,60
icas_in2.gat,159,60,0	warp	out_in2_right	1,1,icas_in2.gat,121,60
icas_in2.gat,92,60,0	warp	ente_in2_left	1,1,icas_in2.gat,56,60
icas_in2.gat,59,60,0	warp	out_in2_left	1,1,icas_in2.gat,96,60
icecastle.gat,157,206,0	script	enter_icasin2_room5	45,1,1,{/* 3873 */
	if(EP20_1QUE < 80) {
		mes "���͎{������Ă���";
		close;
	}
	warp "icas_in2.gat",248,112;
	end;
OnQuestInfo:
	if(EP20_1QUE == 80)
		showevent 0, 1, "enter_icasin2_room5";
	end;
}
icas_in2.gat,250,109,0	warp	out_icasin2_room5	1,1,icecastle.gat,160,203
jor_twig.gat,212,109,0	warp	out_twig	1,1,jor_twice.gat,47,327
jor_twice.gat,43,331,5	script	�����L#nyar_warp	22006,{/* 3877 */
	if(EP20_1QUE < 57) {
		unittalk "�~���`",1;
		if(!sleep2(1000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �����L�͂ǂ����ɂ����Ă��܂����c�c",1;
		cloakonnpc;
		end;
	}
	cutin "ep20_nyar01.png", 2;
	mes "[�j����]";
	mes "�E�F�I���H";
	next;
	if(select("�����Ȏ}�݂̍菈�ɓ��点�Ă�������","�~���I��") == 2) {
		cutin "ep20_nyar01.png", 255;
		mes "[�j����]";
		mes "�S���S���c";
		close2;
		unittalk "�S���S���c",1;
		end;
	}
	cutin "ep20_nyar01.png", 255;
	mes "[�j����]";
	mes "�~���`";
	close2;
	warp "jor_twig.gat", 212, 114;
	end;
OnQuestInfo:
	if(EP20_1QUE >= 57)
		showevent 6, 3, "�����L#nyar_warp";
	end;
OnInit:
	setnpcgroup 1013;
	setnpctitle "[�]��]";
	end;
}
