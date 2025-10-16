#include <stdio.h>

int main() {
    int A;
    printf("整数Aを入力: ");
    scanf("%d", &A);

    if (A == 30) {
        printf("取消の値です\n");
    }
    else if (A >= 20 && A <= 35) {
        printf("正常値入力\n");
    }
    else {
        printf("入力エラー\n");
    }

    return 0;
}