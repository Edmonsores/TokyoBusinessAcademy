/*
�ϐ��Ɖ��Z
printf�̕ϊ��w��q
*/
#include<stdio.h>
int main() {
	//�ϐ��̒�`
	int value = 43;
	double point = 1234.5678;
	char alphabet = 'A';

	//16�i��
	printf("10�i����%d�A16�i����%x�ł��B\n", value,value);
	//�w���`��
	printf("�����_%f�A�w���`��%e�ł��B\n", point, point);
	//�����R�[�h
	printf("����%c�͕����R�[�h��%d�ł��B\n", alphabet, alphabet);
	//���l�ߍ��l��
	printf("10�i����[%10d]�ł��B\n", value);
	printf("10�i����[%-10d]�ł��B\n", value);
	//0���l��
	printf("10�i����[%010d]�ł��B\n", value);
	//���l�ߍ��l��
	printf("�����_[%15.3lf]�ł��B\n", point);
	printf("�����_[%-15.3lf]�ł��B\n", point);
	//������\��
	printf("%-20s\n", "�z�e�g�`�b�v�X");
	printf("%7d�~\n", 189);
}