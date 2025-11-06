/*
配列要素の計算
*/
#include<stdio.h>
int main() {
	int keyTable[5];
	int idx, max;
	int element = sizeof(keyTable) / sizeof(int);

	for (idx = 0; idx < element; idx++) {
		printf("%d番目のデータ入力＝＞", idx+1);
		scanf("%d", &keyTable[idx]);
	}
	for (idx = 0; idx < element; idx++) {
		printf("%d\t", keyTable[idx]);
	}
	return 0;
}