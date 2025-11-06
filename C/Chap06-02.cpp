#include<stdio.h>
int main() {
	int inData, sum;
	sum = 0;

	while (1) {
		printf("正の偶数を入力（負数でループ終了）＝＞");
		scanf("%d", &inData);
		if (inData < 0) {
			break;
		}
		if (inData%2==0) {
			sum += inData;
		}
		else {
			printf("奇数です\n");
			break;
		}

	}
	printf("偶数の合計値は%dです。\n", sum);

	return 0;
}