#include <stdio.h>
int main ()
{
    float x,y;
    while (((x!=0) && (y!=0)) || ((x!=0) && (y==0)) || ((x==0) && (y!=0))) {
        scanf("%f%f",&x,&y);
        if ((x>0) && (y>0)) {
            printf("Q1\n");
        } else {
            if ((x<0) && (y>0)) {
                printf("Q2\n");
            } else {
                if ((x<0) && (y<0)) {
                    printf("Q3\n");
                } else {
                    if ((x>0) && (y<0)) {
                        printf("Q4\n");
                    } else {
                        printf("AXIS\n");
                    }
                }
            }
        }
    }
    return 0;
}
