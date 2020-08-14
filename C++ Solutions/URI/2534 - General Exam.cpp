#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,q;
    while(cin>>n>>q){
        vector<int> ctzn;
        for(int i=0;i<n;i++){
            int c;
            cin>>c;
            ctzn.push_back(c);
        }
        sort(ctzn.begin(),ctzn.end(),greater<int>());
        for(int i=0;i<q;i++){
            int p;
            cin>>p;
            cout<<ctzn[p-1]<<'\n';
        }
    }
    return 0;
}
