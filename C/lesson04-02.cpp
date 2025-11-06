#include <stdio.h>

int main() {
    int start_height, end_height;

    printf("身長と標準体重の対応表を表示します。\n");

    // Get start height
    printf("何 cm から (Start height in cm): ");
    scanf("%d", &start_height);

    // Get end height
    printf("何 cm まで (End height in cm): ");
    scanf("%d", &end_height);


    printf("\n--- 実行結果 (Execution Result) ---\n");
    printf("身長 | 標準体重\n");
    printf("-----|---------\n");


    for (int current_height = start_height; current_height <= end_height; current_height += 5) {

        // Standard Weight calculation: (Height - 100) * 0.9

        double standard_weight = (double)(current_height - 100) * 0.9;

        // Display results, formatted to one decimal place
        printf("%4d | %7.1lf\n", current_height, standard_weight);
    }

    return 0;
}