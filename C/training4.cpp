#include <stdio.h>

int main() {
    int unit_price = 1200;   // �P���i�C�ӂ̒l�j
    int quantity = 3;        // ���ʁi�C�ӂ̒l�j
    int amount;              // ���z
    double discount_rate = 0.2; // �������i2�� = 20%�j
    double discount_amount;     // �����z
    double discounted_price;    // ������̋��z

    // ���z���v�Z
    amount = unit_price * quantity;

    // �����z���v�Z
    discount_amount = amount * discount_rate;

    // ������̋��z
    discounted_price = amount - discount_amount;

    // ���ʂ�\��
    printf("�P��%d�~�A����%d�̋��z��%d�~�ł��B\n", unit_price, quantity, amount);
    printf("2�������̊����z��%.0f�~�ł��B\n", discount_amount);
    printf("2��������̋��z��%.0f�~�ł��B\n", discounted_price);

}