#include <stdio.h>
#define MAX_SIZE 15

// 2차원배열의 세로 값들을 따로 제 2의 배열을 만들어서 옮기는 게 아닌, 
// 문자를 하나씩 이동하며 바로바로 출력하면 손쉽게 가능함 

char str_read[5][MAX_SIZE]; // char형 2차원 배열 str_read[5][15] 생성하기
int main() {
	int i, j;
	for(i=0; i<5; i++) {
		scanf("%s", str_read[i]); // 문자열을 5번 입력받아서 저장함
	}

    // str_read[0][0] 출력하고, str_read[1][0] 출력, str_read[2][0] 출력. 
    // (i열의 문자 먼저 출력함)
    // j열의 인덱스를 1 증가시켜서 str_read[1][0], str_read[2][1], 
    // str[3][1] 순서로 출력시키면 세로 읽기가 됨 

	for(j=0; j<MAX_SIZE; j++) {
		for(i=0; i<5; i++) {
			if(str_read[i][j]==NULL) // 빈공간이면 다음으로 건너뛰어서(continue) 계속 진행하기
				continue;
			else
				printf("%c", str_read[i][j]);
		}
	}
	printf("\n");
	return 0;
}
