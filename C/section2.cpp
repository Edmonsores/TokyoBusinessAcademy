/*
�ϐ��Ɖ��Z
point�ɂR�T��+���čX��value��t������������\�����܂��傤
*/
#include<stdio.h>
int main() {
	//�ϐ��̒�`
	int value = 70;
	int point = 50;
	int total,mod;
	double divans;

	//�v�Z
	total = value + point;
	printf("���v�l�F%d\n", total);

	//�v�Z�ǉ����
	total = point + 35 + value;
	printf("���v�l�F%d\n", total);

	//�@�̌v�Z
	divans = (double) value / point;
	printf("���Z�̓����F%2f\n", divans);

	//�A�̌v�Z
	divans /= 1.3;
	printf("1.3�����������F%3f\n", divans);

	//�B�]�苁�߂道���Z�q
	mod = value % point;
	printf("�]��̓����F%d\n", mod);
	printf("%d / %d = %d", value, point, mod);
}