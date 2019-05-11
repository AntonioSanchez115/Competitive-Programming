#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
char V[51]={0};
int M1[50][50]={{0}};
int M2[50][50]={{0}};
int main()
{
    int tc,tci,N,a,b,i,j,x,y;
    scanf("%d",&tc);
    for(tci=1;tci<=tc;tci++){//test cases.

    scanf("%d",&N);//Num. of rows.

        //Scanning 1st Matrix
        for(i=0;i<N;i++){
            scanf("%s",V);
            for(j=0;j<2*N;j++){//Num. of colums.
                M1[i][j]=V[j]-48;
            }
            memset(V,0,sizeof(V));
        }

        //Scanning 2nd Matrix
        for(i=0;i<N;i++){
            scanf("%s",V);
            for(j=0;j<2*N;j++){//Num. of colums.
                M2[i][j]=V[j]-48;
            }
            memset(V,0,sizeof(V));
        }

        //Finding num. of 0 & 1 in M1
        a=0,b=0;
        for(i=0;i<N;i++){
            for(j=0;j<2*N;j++){
                if(M1[i][j]==1){
                    a++;
                }else{
                    b++;
                }
            }
        }

        //Finding num. of 0 & 1 in M2
        x=0,y=0;
        for(i=0;i<N;i++){
            for(j=0;j<2*N;j++){
                if(M2[i][j]==1){
                    x++;
                }else{
                    y++;
                }
            }
        }
        if((a==x) && (b==y)){//Comparing num. of 0 & 1
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}
