#include <stdio.h>
int main()
{
    int a=1,b,c;
        while (a!=0) {
            scanf("%d",&a);
                if (a==0) { }
                 else { scanf("%d%d",&b,&c);
                a=a*a, b=b*b,c=c*c;
            if (((a+b)==c)||((a+c)==b)||((b+c)==a)) {
                printf("right\n");
            } else {
                printf("wrong\n");}
            }
        }
    return 0;
}
