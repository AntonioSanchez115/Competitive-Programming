#include <stdio.h>
#define MOD 1000000//Creating a constant with the value of mod 1000000
#define MAXN 1000005//Creating a constant with the number of elements of the array
typedef long long ll;//Changing the name of the data type long long

ll A[MAXN];//Creating an array of 1000005 spaces

void init(){//Function for determine all the values of the subindex of A
    A[0] = 1;
    int i;
    for(i=1;i<MAXN;i++){
        A[i] = (A[(int)( i - sqrt(i))] + A[(int) (log(i))] + A[(int) (i * (sin(i) * sin(i)))]) % MOD;
    }
}
int main(){
    init();//Calling the funtion
    int N;
    scanf("%d",&N);
    while(N!=-1){
        printf("%d\n",A[N]);//Printing the subindex of A indicated
        scanf("%d",&N);
    }
    return 0;
}
