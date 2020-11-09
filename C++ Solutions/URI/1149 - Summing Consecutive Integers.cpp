#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,n=0,sum=0;
    cin>>a;
    while(n<1) cin>>n;
    while(n--) sum += a++;
    cout<<sum<<'\n';
    return 0;
}
