/*
配列要素の計算
*/
#include<stdio.h>
int main() {
	//h配列の初期化
	int values[] = {21, 8, 13, 20, 18};
	int elementCount;
	//要素数の求める為の変数
	int valuesSize, intSize;
	valuesSize = sizeof(int);
	intSize = sizeof(int);
	elementCount = valuesSize / intSize;
	printf("配列のサイズ：%d\n", valuesSize);
	printf("int型のサイズ： % d\n", intSize);
	printf("要素数：%d\n", elementCount);
	return 0;
}