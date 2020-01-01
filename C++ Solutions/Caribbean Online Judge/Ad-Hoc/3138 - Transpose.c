#include <stdio.h>
#include <stdlib.h>

int main()
{
    int k,i,j,R,C,T;
    scanf("%d",&T);
    for(k=1;k<=T;k++){

    scanf("%d%d",&R,&C);

    int mat[R][C];

    for(i=0;i<R;i++){
        for(j=0;j<C;j++){
            scanf("%d",&mat[i][j]);
        }
    }

    for(i=0;i<C;i++){
       for(j=0;j<R;j++){
            printf("%d ",mat[j][i]);
        }
        printf("\n");
    }

    }

    return 0;
}
