#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a=0,g=0,d=0,r;
    do{
        cin>>r;
        if(r==1) a++;
        if(r==2) g++;
        if(r==3) d++;
    }while(r!=4);
    cout<<"MUITO OBRIGADO\nAlcool: "<<a<<"\nGasolina: "<<g<<"\nDiesel: "<<d<<'\n';
    return 0;
}
