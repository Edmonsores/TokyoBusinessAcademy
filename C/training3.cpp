#include <stdio.h>

int main() {
    /* Arbitrary integer values / ®”’l‚ğ”CˆÓ‚É‘ã“ü */
    int a = 7;
    int b = 3;

    /* Four basic arithmetic operations / l‘¥‰‰Z */
    printf("a = %d, b = %d\n\n", a, b);

    printf("Addition (‰ÁZ): a + b = %d\n", a + b);

    printf("Subtraction (Œ¸Z): a - b = %d\n", a - b);

    printf("Multiplication (æZ): a * b = %d\n", a * b);

    /* Division (displaying 3 decimal places) -- Casting is done before the variable */
    printf("Division (with decimal) (Š„Zi¬”“_‚ ‚èj): (double)a / b = %.3f\n", (double)a / b);
    /* Division (integer division, no decimal) */
    printf("Division (integer) (Š„Zi®”j): a / b = %d\n", a / b);

    printf("Remainder (—]‚è): a %% b = %d\n", a % b);
}