#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool primeNumber(long N){//Funtion to find Prime Numbers
    int i;
    if(N==1)return false;//Because the next for doesn't check if 1 is Prime
	if(N==2)return true;
	if(N%2==0)return false;//if the number is even it's a fact that is not Prime
	for(i=3;i*i<=N;i+=2){//An alternative of for(i=2;i<=(int)sqrt(N);i++)
			if(N%i==0)return false;//if has a divisor the number is not Prime
	}
	return true;
}

int main(){

    long N;
    scanf("%ld",&N);
    //If N is prime then N! is not divisible for N^2
    if(N!=4){//This is an exception
        if(primeNumber(N)==true){
            printf("NO\n");
        }else{
            printf("YES");
        }
    }else{
        printf("NO\n");
    }
    return 0;
}
