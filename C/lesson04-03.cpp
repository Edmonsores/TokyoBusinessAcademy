#include <stdio.h>

int main() {
    int input_value;
    int sum = 0;
    int count = 0;

    printf("1以上の整数を繰り返し入力してください (0で終了)。\n");

    // The loop runs continuously until the 'break' statement is hit.
    while (1) {
        printf("整数値入力: ");

        // Read the input value without error checking
        scanf("%d", &input_value);

        if (input_value == 0) {
            break; // Exit the loop when 0 is entered
        }


        if (input_value >= 1) {
            sum += input_value; 
            count++;           
        }
    }
    printf("\n--- 実行結果 (Execution Result) ---\n");

    if (count > 0) {
        int average = (int)(sum / count);

        printf("合計 = %lld\n", sum);
        printf("平均 = %d\n", average);
    }
    else {
        printf("有効な値が入力されなかったため、合計と平均は計算されません。\n");
    }

    return 0;
}