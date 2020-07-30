#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t,c=0,x; cin>>t;
    for(int i=0;i<5;i++){
        cin>>x;
        if(x==t) c++;
    }
    cout<<c<<'\n';
    return 0;
}
