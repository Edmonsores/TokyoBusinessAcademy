#include <stdio.h>

int main() {
    int num;

    // --- Input Validation Loop ---
    do {
        printf("正の整数を入力してください (Enter a positive integer): ");
        if (scanf("%d", &num) != 1) {
            // Handle non-integer input
            printf("入力エラー\n");
            // Clear the input buffer
            while (getchar() != '\n');
            num = -1; // Set num to a negative value to force re-entry
        }
        else if (num <= 0) {
            // Handle negative or zero input
            printf("入力エラー: 正の整数を入力してください。\n");
        }
    } while (num <= 0); // Loop continues as long as num is not a positive integer

    printf("\n--- カウントダウン開始 (Countdown Start) ---\n");

    // --- Countdown Loop ---
    for (int i = num; i >= 0; i--) {
        printf("%d\n", i);
    }

    printf("--- カウントダウン終了 (Countdown End) ---\n");

    return 0;
}