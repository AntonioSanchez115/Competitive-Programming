#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int G,L,T,i,j,Aux; char A[100];
    scanf("%d",&G);
    while(G!=0){
        scanf("%s",A);
        L=strlen(A);//Tamaño de la cadena
        T=L/G;//Tamaño de los grupos

        //Ordenamiento de caracteres
        for(i=0;i<L;i+=T){

            for(j=0;j<(T/2);j++){
                Aux=A[i+j];
                A[i+j]=A[i+T-j-1];
                A[i+T-j-1]=Aux;
            }
        }

        //Impresion de arreglo invertido
        for(i=0;i<L;i++){
            printf("%c",A[i]);
        }

        printf("\n");
        scanf("%d",&G);
    }

    return 0;
}
