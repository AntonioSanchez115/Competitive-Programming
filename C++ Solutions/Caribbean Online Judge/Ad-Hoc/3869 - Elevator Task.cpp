#include <bits/stdc++.h>
using namespace std;

int main(){
    int t,T=0,a=1,b;
    cin>>t;
    while(t--){
        cin>>b;
        T+=abs(a-b);
        a=b;
    }
    T+=abs(b-1);
    cout<<T<<'\n';
    return 0;
}
