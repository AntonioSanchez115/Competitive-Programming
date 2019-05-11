#include<stdio.h>
int main()
{
    int i,j,casos,N,acum=0;
    scanf("%d",&casos);
    for(i=1;i<=casos;i++){scanf("%d",&N);
        for(j=1;j<N;j++){
        if(N%j==0){acum+=j;}
    }     if(N==acum){printf("Perfect\n");
    }else if(N>acum){printf("Deficient\n");
    }else if(N<acum){printf("Abundant\n");}
    acum=0;}
    return 0;
}
