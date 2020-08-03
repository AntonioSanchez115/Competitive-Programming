#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    while(cin>>n){
        if(n<1) cout<<"E\n";
        else if(n>=1 && n<=35) cout<<"D\n";
        else if(n>=36 && n<=60) cout<<"C\n";
        else if(n>=61 && n<=85) cout<<"B\n";
        else cout<<"A\n";
    }
    return 0;
}
