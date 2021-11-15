#include<stdio.h> 
int main(void) { 
    int M, N, sum=0, min=10000; 
    // 자연수M, N, sum은 M과 N사이의 완전제곱수인 것들의 합, M과N은 10000 이하의 자연수
    scanf("%d", &M); 
    scanf("%d", &N); 
    
    for(int i=1;i*i<=N;i++) 
    if(i*i>=M) { // i*i가 M보다 클 때 
        sum+=i*i; // sum에 합계 더하기 
        min = i*i<min?i*i:min; //i*i가 min보다 작으면 i*i를 min 변수에 저장 
    } 
    if(sum==0) // 완전 제곱수가 없을 경우 
        printf("-1\n");
    else // 완전 제곱수가 있을 경우 sum과 min을 출력함 
        printf("\n");
        printf("%d\n", sum); 
        printf("%d\n", min);
    return 0;
}
