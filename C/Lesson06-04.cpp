#include <stdio.h>

int main() {
    int n;
    printf("配列の要素数を入力してください: ");
    scanf("%d", &n);

    if (n > 10) { 
        printf("配列の要素数は10以下にしてください。\n");
        return 1;
    }

    int arr[100]; 

    for (int i = 0; i < n; i++) {
        printf("arr[%d]の値を入力してください: ", i);
        scanf("%d", &arr[i]);
    }

    printf("arr = {");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i != n - 1) printf(", ");
    }
    printf("}\n");

    return 0;
}
