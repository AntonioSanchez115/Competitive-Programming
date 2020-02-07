#include <bits/stdc++.h>
using namespace std;

int main()
{
    long n,t,y;
    cin>>n;
    while(n--){
        cin>>t;
        y=t-2014;
        if(y>0) cout<<y<<" A.C.\n";
        else cout<<abs(y)+1<<" D.C.\n";
    }
    return 0;
}
