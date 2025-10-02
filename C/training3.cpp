#include <stdio.h>

int main() {
    /* Arbitrary integer values / �����l��C�ӂɑ�� */
    int a = 7;
    int b = 3;

    /* Four basic arithmetic operations / �l�����Z */
    printf("a = %d, b = %d\n\n", a, b);

    printf("Addition (���Z): a + b = %d\n", a + b);

    printf("Subtraction (���Z): a - b = %d\n", a - b);

    printf("Multiplication (��Z): a * b = %d\n", a * b);

    /* Division (displaying 3 decimal places) -- Casting is done before the variable */
    printf("Division (with decimal) (���Z�i�����_����j): (double)a / b = %.3f\n", (double)a / b);
    /* Division (integer division, no decimal) */
    printf("Division (integer) (���Z�i�����j): a / b = %d\n", a / b);

    printf("Remainder (�]��): a %% b = %d\n", a % b);
}