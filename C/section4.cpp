/*
�L�[�{�[�h�������
*/
#include <stdio.h>
int main() {
	int value;
	double point;

	printf("���������=>");
	scanf("%d", &value);
	printf("���͂��������l��%d�ł�\n", value);
	//�����l����͂��ĕ\������
	printf("���������=>");
	scanf("%lf", &point);
	printf("���͂��������l��%f�ł�\n", point);
}