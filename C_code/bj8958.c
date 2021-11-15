#include <stdio.h>
#include <string.h>

int main(void) {
    int input, score, sum; // testcase의 개수, 점수, 점수의 합
    char testcase[80]; // 문자열 O,X를 받아오는 배열 

    scanf("%d", &input); // testcase의 개수 입력받기 

    for(int i=0; i < input; i++) {
        sum = 0; // 점수의 합을 0으로 초기화(for문이 끝날 때 마다 새로운 ox문을 세야 함 )
        score = 1; 

        scanf("%s", testcase); // 문자열 o,x 입력받기
        for(int j=0; j < strlen(testcase); j++) { //testcase의 o,x 개수만큼 o와 x를 세어줌
            if(testcase[j] == 'O') {
                sum += score;
                score++;
            }
            if(testcase[j] == 'X') {
                score = 1;
            } 
        }
        printf("\n%d", sum);
    }
}