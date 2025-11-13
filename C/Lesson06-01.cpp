#include <stdio.h>

int main() {

    int Atbl[5] = { 10, 20, 30, 40, 50 };
    int Btbl[5] = { 1, 2, 3, 4, 5 };


    int Ctbl[10];

    printf("元の配列: Atbl = {10, 20, 30, 40, 50}\n");
    printf("元の配列: Btbl = {1, 2, 3, 4, 5}\n");


    for (int i = 0; i < 5; i++) {
        // Ctblの偶数インデックス (0, 2, 4, 6, 8) に Atbl の値を代入
        Ctbl[i * 2] = Atbl[i];
        // Ctblの奇数インデックス (1, 3, 5, 7, 9) に Btbl の値を代入
        Ctbl[i * 2 + 1] = Btbl[i];
    }


    printf("結果の配列: Ctbl = { ");
    for (int i = 0; i < 10; i++) {
        printf("%d", Ctbl[i]);
        if (i < 9) {
            printf(", ");
        }
    }
    printf(" }\n");

    return 0;
}