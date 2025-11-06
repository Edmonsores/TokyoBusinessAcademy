#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main() {
    int count, dice;
    int maxCount = 600;
    int collect[] = { 0,0,0,0,0,0,0 };

    srand((unsigned int)time(NULL));
    for (count = 0; count < maxCount; count++) {
        dice = rand() % 6;
        collect[dice]++;
    }
    for (dice = 0; dice < 6; dice++) {
        printf("%d‚Ì“ú %d‰ñ\n", dice + 1, collect[dice]);
    }
    for (dice = 0; dice < 6; dice++) {
        double probab1 = (double)collect[dice] / maxCount;
        printf("%d‚Ì“ú %lf\n", dice + 1, probab1 * 100);
    }
    return 0;
}