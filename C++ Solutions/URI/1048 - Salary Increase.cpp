#include <bits/stdc++.h>
using namespace std;

int main(){
    double s,ns,r;
    int p;
    cin>>s;
    if(s<=400.0){
        r=s*0.15;
        ns=s+r;
        p=15;
    }else if(s>400.0 && s<=800.0){
        r=s*0.12;
        ns=s+r;
        p=12;
    }else if(s>800.0 && s<=1200.0){
        r=s*0.1;
        ns=s+r;
        p=10;
    }else if(s>1200.0 && s<=2000.0){
        r=s*0.07;
        ns=s+r;
        p=7;
    }else{
        r=s*0.04;
        ns=s+r;
        p=4;
    }
    printf("Novo salario: %.2lf\nReajuste ganho: %.2lf\nEm percentual: %d %%\n",ns,r,p);
    return 0;
}
