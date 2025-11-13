#include <stdio.h>

int main() {

    double Array2[] = { 1.5, 2.3, 3.0, 4.8, 5.6 };

    int size = sizeof(Array2) / sizeof(Array2[0]);
    double sum = 0.0;

    printf("Array2の全要素を表示:\n");

    for (int i = 0; i < size; i++) {
        printf("Array2[%d] = %.1f\n", i, Array2[i]);
        sum += Array2[i]; 
    }

    printf("\n配列Array2の合計: %.1f\n", sum);

    printf("配列Array2の要素数: %d\n", size);
}