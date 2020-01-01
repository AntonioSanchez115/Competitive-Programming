#include <bits/stdc++.h>
using namespace std;

int main(){
    int n,x;
    cin>>n;
    long sum=n*(n+1)/2,dif=0;
    for(int i=0;i<n-1;i++){
        cin>>x;
        dif+=x;
    }
    cout<<sum-dif<<'\n';
    return 0;
}
