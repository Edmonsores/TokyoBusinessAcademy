#include <stdio.h>

int main() {
    int month;
    printf("Œ(1-12)‚ğ“ü—Í: ");
    scanf("%d", &month);

    switch (month) {
    case 3:
    case 4:
    case 5:
        printf("‹Gß‚Ít‚Å‚·\n");
        break;
    case 6:
        printf("‹Gß‚Í”~‰J‚Å‚·\n");
        break;
    case 7:
    case 8:
        printf("‹Gß‚Í‰Ä‚Å‚·\n");
        break;
    case 9:
    case 10:
    case 11:
        printf("‹Gß‚ÍH‚Å‚·\n");
        break;
    case 12:
    case 1:
    case 2:
        printf("‹Gß‚Í“~‚Å‚·\n");
        break;
    default:
        printf("–³Œø‚ÈŒ‚Å‚·\n");
        break;
    }

    return 0;
}