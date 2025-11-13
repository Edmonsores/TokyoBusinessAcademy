#include <stdio.h>

int main() {


    int Array1[5] = { 0 };
    int size = 5;

    Array1[1] = 37;
    Array1[2] = 51;
    Array1[4] = Array1[1] * 2;

    printf("Array1‚Ì‘S—v‘f‚ð•\Ž¦:\n");


    for (int i = 0; i < size; i++) {
        printf("Array1[%d] = %d\n", i, Array1[i]);
    }
}