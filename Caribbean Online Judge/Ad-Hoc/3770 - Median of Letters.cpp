#include <bits/stdc++.h>
using namespace std;

int main(){
    priority_queue<char,vector<char>,greater<char>> pq;
    int n;
    char c;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>c;
        pq.push(c);
    }
    for(int i=0;i<(n/2);i++) pq.pop();
    cout<<pq.top()<<'\n';
    return 0;
}
