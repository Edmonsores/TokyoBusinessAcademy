#include <stdio.h>

int main() {
    int num;
    printf("®”‚ğ“ü—Í: ");
    scanf("%d", &num);

    if (num >= 10 && num <= 99) {
        printf("2Œ…‚Ì®”’l‚Å‚·\n");
    }
    else if (num >= 100 && num <= 999) {
        printf("3Œ…‚Ì®”’l‚Å‚·\n");
    }
    else {
        printf("Œ…”‚ª‚í‚©‚è‚Ü‚¹‚ñ\n");
    }

    return 0;
}