#include <stdio.h>

int main() {
    double height, weight, bmi;

    printf("�g��(cm)����͂��Ă�������: ");
    scanf("%lf", &height);

    printf("�̏d(kg)����͂��Ă�������: ");
    scanf("%lf", &weight);

    height = height / 100.0;

    bmi = weight / (height * height);

    printf("���Ȃ���BMI�� %d �ł�\n", (int)bmi);

    return 0;
}
