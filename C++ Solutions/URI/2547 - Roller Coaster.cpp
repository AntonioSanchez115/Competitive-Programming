#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,a,b;
    while(cin>>n>>a>>b){
        int x,al=0;
        for(int i=0;i<n;i++){
            cin>>x;
            if(x>=a && x<=b) al++;
        }
        cout<<al<<'\n';
    }
    return 0;
}
