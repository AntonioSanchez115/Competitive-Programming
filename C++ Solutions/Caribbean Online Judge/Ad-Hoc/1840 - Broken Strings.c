#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int T,ti,i;
    int B=0,R=0,O=0;
    int K=0,E=0,N=0;
    int NM=0;//Numero mayor
    char A[100];

    scanf("%d",&T);
    for(ti=1;ti<=T;ti++){
            scanf("%s",&A);
            for(i=0;i<(strlen(A));i++){//strlen para que no revise los 100 espacios
                    if(A[i]=='B'){
                        B++;//La var. aumentara en uno, si un carac. de la contr. coincide con el carac. "B"
                        if(B>NM){NM=B;}//Con esto se encontrara que var. aumento mas veces
                    }
                    if(A[i]=='R'){//Se repite los mismo con cada carac. de la palabra "BROKEN"
                        R++;
                        if(R>NM){NM=R;}
                    }
                    if(A[i]=='O'){
                        O++;
                        if(O>NM){NM=O;}
                    }
                    if(A[i]=='K'){
                        K++;
                        if(K>NM){NM=K;}
                    }
                    if(A[i]=='E'){
                        E++;
                        if(E>NM){NM=E;}
                    }
                    if(A[i]=='N'){
                        N++;
                        if(N>NM){NM=N;}
                    }
                }
                if(B==NM && R==NM && O==NM && K==NM && E==NM && N==NM){//Para que sea insegura todas las var.
                    printf("No Secure\n");                             //deben coincidir con el numero mayor
                }else{
                    printf("Secure\n");
                }
                B=0,R=0,O=0;//Se reinician los valores de las var. para el prox. caso de prueba
                K=0,E=0,N=0;
                NM=0;
    }
    return 0;
}
