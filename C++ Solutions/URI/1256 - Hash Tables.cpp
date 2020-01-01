#include <bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false); cin.tie(0);
    int t; cin>>t;
    while(t--){
        int m,c,x;
        cin>>m>>c;
        list<int> L[m];
        for(int i=0;i<c;i++){
            cin>>x;
            L[x%m].push_back(x);
        }
        for(int i=0;i<m;i++){
            cout<<i<<" -> ";
            if(!L[i].empty()) for(auto v:L[i])cout<<v<<" -> ";
            cout<<"\\\n";
        }
        if(t!=0) cout<<'\n';
    }
    return 0;
}
