#include <stdio.h>

int main() {
    int A;
    printf("����A�����: ");
    scanf("%d", &A);

    if (A == 30) {
        printf("����̒l�ł�\n");
    }
    else if (A >= 20 && A <= 35) {
        printf("����l����\n");
    }
    else {
        printf("���̓G���[\n");
    }

    return 0;
}