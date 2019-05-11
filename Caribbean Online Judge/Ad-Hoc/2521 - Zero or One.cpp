#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,c;
    while(cin>>a>>b>>c){
        if(a+b+c==3||a+b+c==0) cout<<"*\n";
        else if(a==b) cout<<"C\n";
        else if(a==c) cout<<"B\n";
        else cout<<"A\n";
    }
    return 0;
}
