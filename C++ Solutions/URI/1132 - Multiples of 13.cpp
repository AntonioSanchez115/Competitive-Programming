#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,sum = 0;
    cin>>a>>b;
    for(int i=min(a,b);i<=max(a,b);i++) if(i%13!=0) sum+=i;
    cout<<sum<<'\n';
    return 0;
}
