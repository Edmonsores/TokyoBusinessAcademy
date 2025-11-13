#include <stdio.h>

int main() {
    int Atbl[3][4] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    int Ctbl[15] = { 0 };

    int total_sum = 0;
    int ctbl_index = 0;

    for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 4; j++) {

            if (ctbl_index < 12) { // C_SIZE (12) ‚ğg—p
                Ctbl[ctbl_index] = Atbl[i][j];
                total_sum += Atbl[i][j];
                ctbl_index++;
            }
        }
    }

    printf("Ctbl‚Ì’l (Atbl‚Ì“à—e‚ğŠi”[): { ");
    for (int i = 0; i < 12; i++) { 
        printf("%d", Ctbl[i]);
        if (i < 11) { //12-1
            printf(", ");
        }
    }
    printf(" }\n");

    printf("Atbl‚Ì—v‘f‚Ì‡Œv: %d\n", total_sum);

    return 0;
}