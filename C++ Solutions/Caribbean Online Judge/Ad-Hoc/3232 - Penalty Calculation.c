#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct submit{
    int Mi;
    char verdict[10];
}submit[305];
char stringAux[10];

int main()
{
    int i,aux,pos,penalty=0,N;
    scanf("%d",&N);
    for(i=0;i<N;i++){
        fflush(stdin);
        scanf("%d",&submit[i].Mi);
        scanf("%s",&submit[i].verdict);
    }
    //Sorting struct submit using "Insert Sort"
    for(i=1;i<N;i++){
    aux=submit[i].Mi;
    strcpy(stringAux,submit[i].verdict);
    pos=i;
        while(pos>0 && submit[pos-1].Mi>aux){
        submit[pos].Mi=submit[pos-1].Mi;
        strcpy(submit[pos].verdict,submit[pos-1].verdict);
        pos--;
        }
    submit[pos].Mi=aux;
    strcpy(submit[pos].verdict,stringAux);
    }

    for(i=0;strcmp(submit[i].verdict,"AC")!=0 && i<N;i++){
        penalty+=20;
    }

    if(i==N){
        printf("0\n");
    }else{
    penalty+=submit[i].Mi;
    printf("%d\n",penalty);
    }
    return 0;
}
