#include <bits/stdc++.h>

using namespace std;

int main()
{
    int s,t,f,T;
    cin>>s>>t>>f;
    T=(s+t+f);
    if(T<0) cout<<24+T<<'\n';
    else if(T>=24) cout<<T-24<<'\n';
    else cout<<T<<'\n';
    return 0;
}
