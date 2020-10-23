#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,c,x;
    while(cin>>n){
        stack<int> s;
        queue<int> q;
        priority_queue<int> p;
        bool isStack = true, isQueue = true, isPrio = true;
        for(int i=0;i<n;i++){
            cin>>c>>x;
            if(c==1){
                s.push(x);
                q.push(x);
                p.push(x);
            }else{
                if(s.empty()) isStack = false, isQueue = false, isPrio = false;
                else{
                    if(x != s.top()) isStack = false;
                    if(x != q.front()) isQueue = false;
                    if(x != p.top()) isPrio = false;
                    s.pop(), q.pop(), p.pop();
                }
            }
        }
        int t = (int)isStack + (int)isQueue + (int)isPrio;
        if(!t) cout<<"impossible\n";
        else if(t>1) cout<<"not sure\n";
        else{
            if(isStack) cout<<"stack\n";
            if(isQueue) cout<<"queue\n";
            if(isPrio) cout<<"priority queue\n";
        }
    }
    return 0;
}
