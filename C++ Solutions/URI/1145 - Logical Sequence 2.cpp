#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,y,z=1;
    cin>>x>>y;
    while(true){
        for(int i=1;i<=x;i++){
            if(i!=x) cout<<z++<<' ';
            else cout<<z++;
            if(z>y) break;
        }
        cout<<'\n';
        if(z>y) break;
    }
    return 0;
}
