prontera.gat,127,94,4	script	�Ŗ��p�t	124,{
	mes "[�Ŗ��p�t]";
	mes "����ɂ��́B";
	mes "�����擾�o���l";
	mes "���Z�b�g�T�[�r�X��";
	mes "���߂ɔh�����ꂽ";
	mes "�Ŗ��p�t�ł��B";
	next;
	mes "[�Ŗ��p�t]";
	mes "�{�T�[�r�X��";
	mes "^FF0000���ݏ������Ă���";
	mes "Base�o���l��S�ď���^000000";
	mes "�������܂��̂ł����Ӊ������B";
	mes "�@";
	mes "�{����Base�o���l���������܂����H";
	next;
	if(select("������","�͂�") == 1) {
		mes "[�Ŗ��p�t]";
		mes "�����C�������܂�����";
		mes "������x�b�������Ă��������B";
		close;
	}
	mes "[�Ŗ��p�t]";
	mes "��xBase�o���l�����������";
	mes "^FF0000���̏�Ԃɖ߂����͏o���܂���B^000000";
	mes "�@";
	mes "����ł��ABase�o���l���������܂����H";
	next;
	if(select("������","�͂�") == 1) {
		mes "[�Ŗ��p�t]";
		mes "�����C�������܂�����";
		mes "������x�b�������Ă��������B";
		close;
	}
	mes "[�Ŗ��p�t]";
	mes "�ł�Base�o���l���������܂��B";
	mes "�@";
	mes "^FF0000Base�o���l����������";
	mes "�o��͏o���܂������H^000000";
	next;
	if(select("������","�͂�") == 1) {
		mes "[�Ŗ��p�t]";
		mes "�����C�������܂�����";
		mes "������x�b�������Ă��������B";
		close;
	}
	set BaseExp,0;
	mes "[�Ŗ��p�t]";
	mes "����Base�o���l��0�ɂ��܂����B";
	close;
}