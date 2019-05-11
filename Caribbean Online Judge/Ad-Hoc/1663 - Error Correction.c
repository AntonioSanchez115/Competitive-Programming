#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool M[100][100];
int V1[100];
int V2[100];
int main()
{
    int S,E,i,j,x,y,sumodd;//Variables
    while(scanf("%d",&S)&& S!=0){

    memset(V1,0,sizeof(V1));//Reinicializando valores-----
    memset(V2,0,sizeof(V2));//de matrices y vectores
        for(i=0;i<100;i++){
            for(j=0;j<100;j++){
                M[i][j]=0;
            }
        }
    E=0,sumodd=0;
//  ------------------------------------------------------
        for(i=0;i<S;i++){
            for(j=0;j<S;j++){//Leyendo matriz
                scanf("%d",&M[i][j]);
            }
        }

        if(S%2!=0){//Si las dimensiones de la matriz son impares
            printf("Corrupt\n");//será corrupta
        }else{

            for(i=0;i<S;i++){//Sumando todas las columnas
                for(j=0;j<S;j++){
                    E+=M[j][i];
                }
                V1[i]=E;//Resultados se guardan en vector
                E=0;
            }

            for(i=0;i<S;i++){//Sumando todas las filas
                for(j=0;j<S;j++){
                    E+=M[i][j];
                }
                V2[i]=E;//Resultados se guardan en vector
                E=0;
            }

            j=0;
            for(x=0;x<S;x++){//Encontrando impar en V1
                if(V1[x]%2==1){
                    j=x+1;
                    sumodd++;
                }
            }

            i=0;
            for(y=0;y<S;y++){//Encontrando impar en V2
                if(V2[y]%2==1){
                    i=y+1;
                }
            }

            if(sumodd==0){
                printf("OK\n");
            }else if(sumodd==1){
                printf("Change bit (%d,%d)\n",i,j);
            }else{
                printf("Corrupt\n");
            }
        }
    }
    return 0;
}
