#include <stdio.h>

int main(void) {
    int i;
    double d;
    char c;

    printf("整数値を入力 => ");
    scanf("%d", &i);
    printf("入力した整数値は %d ですね。\n", i);

    printf("小数点数を入力 => ");
    scanf("%lf", &d);
    printf("入力した小数点数は %.2lf ですね。\n", d);

    printf("文字列を入力 => ");
    scanf(" %c", &c);
    printf("入力した文字は %c ですね。\n", c);

    return 0;
}