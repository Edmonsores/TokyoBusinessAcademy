#include <stdio.h>

int main() {
    int unit_price = 1200;   // ’P‰¿i”CˆÓ‚Ì’lj
    int quantity = 3;        // ”—Êi”CˆÓ‚Ì’lj
    int amount;              // ‹àŠz
    double discount_rate = 0.2; // Š„ˆø—¦i2Š„ = 20%j
    double discount_amount;     // Š„ˆøŠz
    double discounted_price;    // Š„ˆøŒã‚Ì‹àŠz

    // ‹àŠz‚ğŒvZ
    amount = unit_price * quantity;

    // Š„ˆøŠz‚ğŒvZ
    discount_amount = amount * discount_rate;

    // Š„ˆøŒã‚Ì‹àŠz
    discounted_price = amount - discount_amount;

    // Œ‹‰Ê‚ğ•\¦
    printf("’P‰¿%d‰~A”—Ê%dŒÂ‚Ì‹àŠz‚Í%d‰~‚Å‚·B\n", unit_price, quantity, amount);
    printf("2Š„ˆø‚«‚ÌŠ„ˆøŠz‚Í%.0f‰~‚Å‚·B\n", discount_amount);
    printf("2Š„ˆø‚«Œã‚Ì‹àŠz‚Í%.0f‰~‚Å‚·B\n", discounted_price);

}