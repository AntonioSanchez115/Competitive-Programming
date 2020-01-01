#include <stdio.h>
int main()
{
    int A,B,C,T,i;
    scanf("%d",&T);
        for (i=1;i<=T;i++) {
            scanf("%d%d%d",&A,&B,&C);
            if (B==0)
            {
               if (((A+B)==C)||((A-B)==C)||((A*B)==C)) {
                printf("YES\n");
               } else {
               printf("NO\n");
               }
            }
            else
            {
                if (((A+B)==C)||((A-B)==C)||((A*B)==C)||((A/B)==C)||((A%B)==C))
                {
                    printf("YES\n");
                }
                else
                {
                    printf("NO\n");
                }
            }
        }
    return 0;
}
