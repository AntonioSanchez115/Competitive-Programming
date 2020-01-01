#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int h,i=0;
    char V[21]={0};
    scanf("%s",V);
        for(h=0;h<strlen(V);h++){
            if(V[h]=='i'){
                i=1;
            }
        }
        if(i==1)
            printf("N\n");
        else
            printf("S\n");
    return 0;
}
