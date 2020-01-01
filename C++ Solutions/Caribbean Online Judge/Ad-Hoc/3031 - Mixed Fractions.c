#include <stdio.h>
int main ()
{
    long a,b,c,d;
        scanf("%ld%ld",&a,&b);
        while ((a!=0) && (b!=0)) {
             c=a%b;
             d=a/b;
             printf("%ld %ld / %ld\n",d,c,b);
            scanf("%ld%ld",&a,&b);
            }
    return 0;
}
