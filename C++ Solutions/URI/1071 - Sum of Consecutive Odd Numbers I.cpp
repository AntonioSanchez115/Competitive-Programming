#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,y,z,c=0;
    cin>>x>>y;
    for(int i=min(x,y)+1;i<max(x,y);i++) if(i%2) c+=i;
    cout<<c<<'\n';
    return 0;
}
