#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,e=0,o=0,p=0,n=0;
    for(int i=0;i<5;i++){
        cin>>x;
        if(x%2==0) e++;
        else o++;
        if(x>0) p++;
        if(x<0) n++;
    }
    cout<<e<<" valor(es) par(es)\n"<<o<<" valor(es) impar(es)\n";
    cout<<p<<" valor(es) positivo(s)\n"<<n<<" valor(es) negativo(s)\n";
    return 0;
}
