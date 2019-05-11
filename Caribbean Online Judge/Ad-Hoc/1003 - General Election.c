#include <stdio.h>
#include <stdlib.h>

int main()
{
    int tc,i,j,t;
    scanf("%d",&tc);
    for(t=1;t<=tc;t++){
        int n,m,num=0,gan=0,vic=0;
        scanf("%d%d",&n,&m);
        int cand[10]={0};
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                scanf("%d",&num);
                cand[j]+=num;
            }
        }
        for(i=0;i<n;i++){
            if(!i){
                vic=i+1;
                gan=cand[i];
            }
            if(cand[i]>gan){
                vic=i+1;
                gan=cand[i];
            }
        }
        printf("%d\n",vic);
    }
    return 0;
}