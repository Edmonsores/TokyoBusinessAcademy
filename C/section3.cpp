/*
変数と演算
printfの変換指定子
*/
#include<stdio.h>
int main() {
	//変数の定義
	int value = 43;
	double point = 1234.5678;
	char alphabet = 'A';

	//16進数
	printf("10進数で%d、16進数で%xです。\n", value,value);
	//指数形式
	printf("小数点%f、指数形式%eです。\n", point, point);
	//文字コード
	printf("文字%cは文字コードで%dです。\n", alphabet, alphabet);
	//左詰め左詰め
	printf("10進数で[%10d]です。\n", value);
	printf("10進数で[%-10d]です。\n", value);
	//0左詰め
	printf("10進数で[%010d]です。\n", value);
	//左詰め左詰め
	printf("小数点[%15.3lf]です。\n", point);
	printf("小数点[%-15.3lf]です。\n", point);
	//文字列表示
	printf("%-20s\n", "ホテトチップス");
	printf("%7d円\n", 189);
}