/*
キーボードから入力
*/
#include <stdio.h>
int main() {
	int value;
	double point;

	printf("整数を入力=>");
	scanf("%d", &value);
	printf("入力した整数値は%dです\n", value);
	//実数値を入力して表示する
	printf("実数を入力=>");
	scanf("%lf", &point);
	printf("入力した実数値は%fです\n", point);
}