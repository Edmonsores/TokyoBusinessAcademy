#include <stdio.h>

int main() {
    int arr[6];  
    int count = 0;  

    printf("3の倍数かつ4の倍数の値を6つ入力してください。\n");

    while (count < 6) {
        int num;
        printf("値を入力してください: ");
        scanf("%d", &num);

        if (num % 3 == 0 && num % 4 == 0) { // 3の倍数かつ4の倍数
            arr[count] = num;
            count++;
        }
        else {
            printf("入力した値は3と4の倍数ではありません。もう一度入力してください。\n");
        }
    }


    printf("arr = {");
    for (int i = 0; i < 6; i++) {
        printf("%d", arr[i]);
        if (i != 5) printf(", ");
    }
    printf("}\n");

    return 0;
}
