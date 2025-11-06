/*
配列プログラム
*/
#include<stdio.h>
int main() {
	int total;
	int values[5];
	values[0] = 21;
	values[1] = 8;
	values[2] = 13;
	values[3] = 20;
	values[4] = 18;
	for (int i = 0; i < 5; i++) {
		total += values[1];
	}
	printf("合計値：%d\n", total);

	return 0;
}