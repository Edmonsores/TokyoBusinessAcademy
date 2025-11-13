#include <stdio.h>

int main() {

    int Atbl[5];
    int Btbl[5];
    int size = 5;

    printf("Atbl[%d]にキーボードから値を代入してください:\n", size);


    for (int i = 0; i < size; i++) {
        printf("Atbl[%d] = ", i);
        scanf("%d", &Atbl[i]);
    }

    // Atblの値をBtblにコピーします。
    for (int i = 0; i < size; i++) {
        Btbl[i] = Atbl[i];
    }

    // 二つの配列の値を表示しましょう。
    printf("\n二つの配列の値を表示:\n");

    printf("--- Atbl (入力された値) ---\n");
    for (int i = 0; i < size; i++) {
        printf("Atbl[%d] = %d\n", i, Atbl[i]);
    }

    printf("\n--- Btbl (コピーされた値) ---\n");
    for (int i = 0; i < size; i++) {
        printf("Btbl[%d] = %d\n", i, Btbl[i]);
    }
}