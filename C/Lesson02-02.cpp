#include <stdio.h>

int main() {
    int month;
    printf("��(1-12)�����: ");
    scanf("%d", &month);

    switch (month) {
    case 3:
    case 4:
    case 5:
        printf("�G�߂͏t�ł�\n");
        break;
    case 6:
        printf("�G�߂͔~�J�ł�\n");
        break;
    case 7:
    case 8:
        printf("�G�߂͉Ăł�\n");
        break;
    case 9:
    case 10:
    case 11:
        printf("�G�߂͏H�ł�\n");
        break;
    case 12:
    case 1:
    case 2:
        printf("�G�߂͓~�ł�\n");
        break;
    default:
        printf("�����Ȍ��ł�\n");
        break;
    }

    return 0;
}