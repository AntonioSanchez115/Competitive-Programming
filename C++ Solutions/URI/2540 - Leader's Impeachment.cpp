#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    while(cin>>n){
        int y=0,v;
        for(int i=0;i<n;i++){
            cin>>v;
            if(v==1) y++;
        }
        cout<<((y>=(2*(n/3.0))?"impeachment\n":"acusacao arquivada\n"));
    }
    return 0;
}
