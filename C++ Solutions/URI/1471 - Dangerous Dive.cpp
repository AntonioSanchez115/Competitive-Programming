#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,r,x;
    while(cin >> n >> r){
        bool div[n], flag = true;
        for(int i=0;i<n;i++) div[i] = false;
        for(int i=0;i<r;i++){
            cin >> x;
            div[x-1] = true;
        }
        priority_queue<int,vector<int>,greater<int>> pq;
        for(int i=0;i<n;i++) if(!div[i]) pq.push(i+1);
        if(pq.empty()) cout << "*\n";
        else{
            while(!pq.empty()){
                cout << pq.top() << ' ';
                pq.pop();
            }
            cout << '\n';
        }
    }
    return 0;
}
