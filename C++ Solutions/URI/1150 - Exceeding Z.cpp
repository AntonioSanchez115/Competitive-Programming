#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,z,t=0,sum=0;
    cin>>x;
    do{ cin>>z; } while(z <= x);
    while(sum <= z){
        sum += x++;
        t++;
    }
    cout<<t<<'\n';
    return 0;
}
