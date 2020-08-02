#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n; cin>>n;
    int c[n+1][n+1];
    for(int i=0;i<n+1;i++){
        for(int j=0;j<n+1;j++){
            cin>>c[i][j];
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int cam=0;
            if(c[i][j]==1) cam++;
            if(c[i][j+1]==1) cam++;
            if(c[i+1][j]==1) cam++;
            if(c[i+1][j+1]==1) cam++;
            if(cam>=2) cout<<"S";
            else cout<<"U";
        }
        cout<<'\n';
    }
    return 0;
}
