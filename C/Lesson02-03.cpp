#include <stdio.h>

int main() {
    int min1, min2, min3;
    int temp;

    printf("3�̐�������� (��: 5 1 8): ");
    scanf("%d %d %d", &min1, &min2, &min3);

    if (min1 > min2) {
        temp = min1;
        min1 = min2;
        min2 = temp;
    }

    if (min2 > min3) {
        temp = min2;
        min2 = min3;
        min3 = temp;
    }

    if (min1 > min2) {
        temp = min1;
        min1 = min2;
        min2 = temp;
    }
    printf("min1:1�ԏ������l %d\n", min1);
    printf("min2:2�Ԗڂɏ������l %d\n", min2);
    printf("min3:3�Ԗڂɏ������l %d\n", min3);

    return 0;
}