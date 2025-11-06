#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main() {
	int count, dice;
	int position = 0;

	srand((unsigned int)time(NULL));
	for (count = 5; position < 20 && count>0; count--) {
		printf("\nサイコロを振って（Enter入力）");
		fflush(stdin);
		getchar();
		dice = rand() % 6 + 1;
		position += dice;
		printf("%d進み・・・現在のサイコロは5dです。",dice,position);
	}
	if (position >= 20) {
		printf("ゴール‼\n");
	}
	else {
		printf("残念　終了\n");
	}
	return 0;
}