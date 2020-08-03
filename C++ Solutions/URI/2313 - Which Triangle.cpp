#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    if((a+b)>c && (a+c)>b && (c+b)>a){
        cout<<"Valido-";
        if(a==b && b==c) cout<<"Equilatero\n";
        else if(a==b || a==c || b==c) cout<<"Isoceles\n";
        else cout<<"Escaleno\n";
        cout<<"Retangulo: ";
        if(((long long)c*c==(long long)a*a+ (long long)b*b) || ((long long)b*b==(long long)a*a+ (long long)c*c) || ((long long)a*a==(long long)b*b+ (long long)c*c)){
            cout<<"S\n";
        }else{
            cout<<"N\n";
        }
    }else{
        cout<<"Invalido\n";
    }
    return 0;
}
