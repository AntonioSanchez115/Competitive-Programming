#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
    int i,j,t,a=0;//1er cont,2do cont,casos,acumulador
    char num[25];//array para el numero n
    scanf("%d",&t);
    for(i=1; i<=t; i++){
        scanf("%s",&num);//n se escanea como string
        int len=strlen(num);//len=tamaño de numero
        for(j=0; j<len; j++){
            if(num[j]=='-')continue;//Si n es negativo se salta el simbolo
            a+=(num[j]-'0');}//n se convierte de ascii a entero y se suma
    printf("%d\n",a);
    a=0;}
    return 0;
}
