#include <stdio.h>

int main() {
    int num;
    printf("���������: ");
    scanf("%d", &num);

    if (num >= 10 && num <= 99) {
        printf("2���̐����l�ł�\n");
    }
    else if (num >= 100 && num <= 999) {
        printf("3���̐����l�ł�\n");
    }
    else {
        printf("�������킩��܂���\n");
    }

    return 0;
}