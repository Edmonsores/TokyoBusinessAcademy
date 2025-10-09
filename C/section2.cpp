/*
変数と演算
pointに３５を+して更にvalueを付け加え答えを表示しましょう
*/
#include<stdio.h>
int main() {
	//変数の定義
	int value = 70;
	int point = 50;
	int total,mod;
	double divans;

	//計算
	total = value + point;
	printf("合計値：%d\n", total);

	//計算追加問題
	total = point + 35 + value;
	printf("合計値：%d\n", total);

	//①の計算
	divans = (double) value / point;
	printf("割算の答え：%2f\n", divans);

	//②の計算
	divans /= 1.3;
	printf("1.3割った答え：%3f\n", divans);

	//③余り求める％演算子
	mod = value % point;
	printf("余りの答え：%d\n", mod);
	printf("%d / %d = %d", value, point, mod);
}