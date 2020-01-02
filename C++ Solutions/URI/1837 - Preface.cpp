#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b;
    cin>>a>>b;
    if(a>0 || (a%b)==0){
        cout<<(a/b)<<' '<<(a%b)<<'\n';
    }else{
        if(a==0) cout<<"0 0\n";
        else if(b<0) cout<<((a/b)+1)<<' '<<((a%b)-b)<<'\n';
        else cout<<((a/b)-1)<<' '<<((a%b)+b)<<'\n';
    }
    return 0;
}
