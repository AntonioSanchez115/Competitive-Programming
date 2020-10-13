#include <bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> v,v1;
    int x;
    for(int i=0;i<3;i++){
        cin>>x;
        v.push_back(x);
    }
    v1 = v;
    sort(v.begin(),v.begin()+v.size());
    for(int i=0;i<3;i++) cout<<v[i]<<'\n';
    cout<<'\n';
    for(int i=0;i<3;i++) cout<<v1[i]<<'\n';
    return 0;
}
