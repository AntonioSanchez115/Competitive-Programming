#include <stdio.h>
int main()
{
    int T,i;long N,M;
    scanf("%d",&T);
    for(i=1;i<=T;i++){
        scanf("%d%d",&N,&M);
        if(N<=M){
            if(N%2!=0) printf("R\n");
            else printf("L\n");
        }else{
            if(N>M){
                if(M%2!=0) printf("D\n");
            }else printf("U\n");
        }
    }
    return 0;
}
