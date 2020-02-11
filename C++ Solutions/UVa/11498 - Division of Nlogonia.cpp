#include <bits/stdc++.h>
using namespace std;

int main()
{
    int k;
    while(cin>>k && k!=0){
        int n,m,x,y;
        cin>>n>>m;
        for(int i=0;i<k;i++){
            cin>>x>>y;
            if(x==n || y==m) cout<<"divisa\n";
            else if(x>n && y>m) cout<<"NE\n";
            else if(x<n && y>m) cout<<"NO\n";
            else if(x<n && y<m) cout<<"SO\n";
            else cout<<"SE\n";
        }
    }
    return 0;
}
