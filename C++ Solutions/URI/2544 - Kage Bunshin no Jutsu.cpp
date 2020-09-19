#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    while(cin>>n){
        int t=0;
        while(n>1){
            n/=2;
            t++;
        }
        cout<<t<<'\n';
    }
    return 0;
}
