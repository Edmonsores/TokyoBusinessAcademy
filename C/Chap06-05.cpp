#include<stdio.h>
int main() {
	int inData, sum;
	sum = 0;

	// do while
	do {
		printf("正の偶数を入力（負数でループ終了）＝＞");
		scanf("%d", &inData);
		if (inData >= 0) {
			if (inData % 2 == 0) {
				sum += inData;
			}
		}
		else {
			printf("奇数です\n");
		}

	} while (inData >= 0);
	printf("偶数の合計値は%dです。\n", sum);

	return 0;
}