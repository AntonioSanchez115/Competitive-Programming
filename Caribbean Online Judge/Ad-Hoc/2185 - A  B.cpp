#include<stdio.h>
int main()
{
    int A;
    int B;
    scanf("%d%d", &A, &B);
    int C=A+B;
    int D=A-B;
    int E=A*B;
    int F=A/B;
    int G=A%B;
    printf("%d\n%d\n%d\n%d\n%d",C,D,E,F,G);
    return 0;
}
