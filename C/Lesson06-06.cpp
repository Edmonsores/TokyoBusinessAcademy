#include <stdio.h>

int main() {
    int scores[6][3];  
    int sum_person[6] = { 0 }; 
    int sum_subject[3] = { 0 }; 
    int total_sum = 0;         

 
    for (int i = 0; i < 6; i++) {
        printf("%d人目の点数を入力してください (国語 数学 英語): ", i + 1);
        for (int j = 0; j < 3; j++) {
            scanf("%d", &scores[i][j]);
            sum_person[i] += scores[i][j]; 
            sum_subject[j] += scores[i][j]; 
            total_sum += scores[i][j];     
        }
    }


    printf("\t国語\t数学\t英語\t合計\n");
    for (int i = 0; i < 6; i++) {
        printf("%d人目\t", i + 1);
        for (int j = 0; j < 3; j++) {
            printf("%d\t", scores[i][j]);
        }
        printf("%d\n", sum_person[i]);
    }


    printf("合計\t");
    for (int j = 0; j < 3; j++) {
        printf("%d\t", sum_subject[j]);
    }
    printf("%d\n", total_sum);


    printf("平均\t");
    for (int j = 0; j < 3; j++) {
        printf("%d\t", sum_subject[j] / 6);
    }
    printf("%d\n", total_sum / 6);

    return 0;
}
