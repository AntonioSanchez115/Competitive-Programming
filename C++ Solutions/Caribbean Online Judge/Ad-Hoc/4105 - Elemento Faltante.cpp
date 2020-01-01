#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0);
    long long int n,sum=0,dif=0,x;
    cin>>n;
    for(int i=1;i<=n;i++) sum+=i;
    for(int i=0;i<n-1;i++){
        cin>>x;
        dif+=x;
    }
    cout<<sum-dif<<'\n';
    return 0;
}
