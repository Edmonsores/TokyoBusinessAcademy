#include <stdio.h>

int main(void) {
    int i;
    double d;
    char c;

    printf("�����l����� => ");
    scanf("%d", &i);
    printf("���͂��������l�� %d �ł��ˁB\n", i);

    printf("�����_������� => ");
    scanf("%lf", &d);
    printf("���͂��������_���� %.2lf �ł��ˁB\n", d);

    printf("���������� => ");
    scanf(" %c", &c);
    printf("���͂��������� %c �ł��ˁB\n", c);

    return 0;
}