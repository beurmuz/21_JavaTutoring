#include <stdio.h>
int main (void) {
    int scale_arr[8]; // 음계를 입력받을 배열
    int asc = 0, des = 0, mix = 0; // 오름차순, 내림차순, mix

    for(int i = 0; i < 8; i++) {
        scanf("%d", &scale_arr[i]); // 숫자 입력받기 

        if(i+1 == scale_arr[i]) {
            asc++;
        } else if(8 - i == scale_arr[i]) {
            des++;
        } else {
            mix++;
        }
    }

    // 판별하기 
    if(asc == 8) {
        printf("ascending");
    } else if(des == 8) {
        printf("descending");
    } else {
        printf("mixed");
    }
}