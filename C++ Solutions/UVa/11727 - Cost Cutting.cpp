#include <bits/stdc++.h>
using namespace std;

int main(){
    int t; cin>>t;
    for(int tc=1;tc<=t;tc++){
        vector<int> vec;
        int x;
        for(int i=0;i<3;i++){
            cin>>x;
            vec.push_back(x);
        }
        sort(vec.begin(),vec.begin()+vec.size());
        cout<<"Case "<<tc<<": "<<vec[1]<<'\n';
    }
    return 0;
}
