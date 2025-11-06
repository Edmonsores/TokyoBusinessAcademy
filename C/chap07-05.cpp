#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main() {
    int score;
    int scoreAry[40], scoreIdx;
    int score80Ary[40], selectIdx;
    int tableSize = sizeof(scoreAry) / sizeof(int);
    int count80 = 0;

    srand((unsigned int)time(NULL));
    // 乱数で要素を求め代入 (Generate random elements and assign them)
    for (scoreIdx = 0; scoreIdx < tableSize; scoreIdx++) {
        score = rand() % 100 + 1;
        scoreAry[scoreIdx] = score;
    }
    // 40個の要素を10個表示して改行 (Display 40 elements, 10 per line)
    for (scoreIdx = 0; scoreIdx < tableSize; scoreIdx++) {
        printf("%4d", scoreAry[scoreIdx]); 
        if ((scoreIdx + 1) % 10 == 0) {
            printf("\n");
        }
    }

    // 80以上の値をselect80Ary[]に代入します。(各自追加)
    // select80Ary[]を表示する
    // Loop to select scores >= 80
    for (scoreIdx = 0; scoreIdx < tableSize; scoreIdx++) {
        if (scoreAry[scoreIdx] >= 80) {
            score80Ary[count80] = scoreAry[scoreIdx];
            count80++;
        }
    }
    printf("\n80 以上のスコア (%d 個) :\n", count80);
    for (selectIdx = 0; selectIdx < count80; selectIdx++) {
        printf("%4d", score80Ary[selectIdx]);

        if ((selectIdx + 1) % 10 == 0) {
            printf("\n");
        }
    }
    if (count80 % 10 != 0) {
        printf("\n");
    }

    return 0;
}