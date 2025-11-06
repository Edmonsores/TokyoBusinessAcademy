#include<stdio.h>
int main() {
	int num, total;
	total = 0;
	num = 1;

	while (num <= 10) {
		total = total + num;
		num = num + 1;
	}

	printf("合計値は%dです。\n", total);
	printf("変数numは%dです。\n", num);

	return 0;
}