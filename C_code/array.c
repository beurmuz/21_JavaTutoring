#include<stdio.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS
#define SIZE 10 // 배열 사이즈

int main() {
    
	char saveChar[SIZE]; // 문자열을 입력받아 저장할 배열 
	int alpa[26] = {0}; // 문자열 내에알파벳 빈도수를 저장할 배열, 0으로 초기화
	
	printf("문자열을 입력하세요 : ");
	scanf( "%s", saveChar);		// 문자열 입력받아 char배열에 저장
	int length = sizeof(saveChar)/sizeof(char); // 배열의 길이(요소의 개수)
	
    // // 배열의 요소 출력
    // for (int i = 0; i < sizeof(saveChar)/sizeof(char); i++)   
    // {
    //     printf("%c\n", saveChar[i]);  
    // }
    
    // 알파벳 빈도수 구하기
    for(int i = 0; i < length; i++) { // 총 10번반복
        if(saveChar[i] >= 'a' && saveChar[i] <= 'z') { //saveChar의 각 요소가 a~z사이의 값이면 
            if(alpa[saveChar[i]-'a']++); // savechar에서 a(97)를 뺀 값을 인덱스로 하여 배열의 값을 1 증가
            // a-a=0을 인덱스 값으로 이용해서 cnt[0]++;
        }
    }
    printf("\n각 알파벳의 갯수 : \n");
    for(int i = 0; i < 26; i++) {
        if (alpa[i]) // 만약 alpa 배열의 값이 있으면, 1번이라도 입력된 알파벳이 있으면
            printf("%c = %d개 등장\n", 'a' + i ,alpa[i]);//아스키코드 a+i(인덱스), 개수
    }
    
    // 최종 출력
    printf("\n전체 빈도수 출력 : \n");
    for(int i = 0; i < 26; i++) {
        printf("%c : %d\n", 'a'+i, alpa[i]);
    }
    
	return 0;
}