#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false); cin.tie(0);
    int t;
    cin>>t;
    while(t--){
        int cont=0,a,b;
        cin>>a>>b;
        for(int i=1;i<a;i++){
            if(a%i==0) cont+=i;
        }
        if(cont==b)cout<<"YES\n";
        else{
            cont=0;
            for(int i=1;i<b;i++){
                if(b%i==0) cont+=i;
            }
            if(cont==a)cout<<"YES\n";
            else cout<<"NO\n";
        }
    }
    return 0;
}
