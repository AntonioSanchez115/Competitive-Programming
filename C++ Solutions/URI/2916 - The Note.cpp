#include <bits/stdc++.h>
typedef long long ii;
using namespace std;

int main()
{
    ii n,k,x;
    while(cin>>n>>k){
        priority_queue<ii> pq;
        ii sum=0;
        for(ii i=0;i<n;i++){
            cin>>x;
            pq.push(x);
        }
        for(ii i=0;i<k;i++){
            sum += pq.top();
            pq.pop();
        }
        cout<<sum%1000000007<<'\n';
    }
    return 0;
}
