#include <stdio.h>

#define MAX 10  // 最大100人まで対応

int main() {
    int n;
    printf("人数を入力してください: ");
    scanf("%d", &n);

    if (n > MAX) {
        printf("人数は %d 以下にしてください。\n", MAX);
        return 1;
    }

    int scores[MAX];
    int sum = 0;
    int max, min;

    for (int i = 0; i < n; i++) {
        printf("学生 %d の点数を入力してください: ", i + 1);
        scanf("%d", &scores[i]);
    }

    max = min = scores[0];

    for (int i = 0; i < n; i++) {
        sum += scores[i];
        if (scores[i] > max) max = scores[i];
        if (scores[i] < min) min = scores[i];
    }

    double average = (double)sum / n;

    printf("\n合計点: %d\n", sum);
    printf("平均点: %.2f\n", average);
    printf("最高点: %d\n", max);
    printf("最低点: %d\n", min);

    return 0;
}
