#include <stdio.h>

int main() {
    double height, weight, bmi;

    printf("g’·(cm)‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢: ");
    scanf("%lf", &height);

    printf("‘Ìd(kg)‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢: ");
    scanf("%lf", &weight);

    height = height / 100.0;

    bmi = weight / (height * height);

    printf("‚ ‚È‚½‚ÌBMI‚Í %d ‚Å‚·\n", (int)bmi);

    return 0;
}
