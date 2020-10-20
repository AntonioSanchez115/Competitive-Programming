#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x;
    while(cin>>n && n!=0){
        priority_queue<int,vector<int>,greater<int>> pq;
        int c=0;
        for(int i=0;i<n;i++){
            cin>>x;
            pq.push(x);
        }
        while(pq.size()!=1){
            x = pq.top();
            pq.pop();
            x += pq.top();
            c += x;
            pq.pop();
            pq.push(x);
        }
        cout<<c<<'\n';
    }
    return 0;
}
