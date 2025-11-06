#include<stdio.h>
int main() {
    for (int line = 8; line > 0; line--) {
        for (int i = 0; i < line; i++) {
            if (i % 2 == 0) {
                printf("›");
            }
            else {
                printf("œ");
            }
        }
        printf("\n");
    }
    return 0;
}