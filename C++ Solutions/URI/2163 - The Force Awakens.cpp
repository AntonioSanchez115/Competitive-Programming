#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,m,x=0,y=0; cin>>n>>m;
    bool found=false;
    int T[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>T[i][j];
        }
    }
    for(int i=1;i<n-1;i++){
        for(int j=1;j<m-1;j++){
            if(T[i][j]==42){
                bool patt=true;
                if(T[i-1][j-1]!=7) patt=false;
                if(T[i-1][j]!=7) patt=false;
                if(T[i-1][j+1]!=7) patt=false;
                if(T[i][j-1]!=7) patt=false;
                if(T[i][j+1]!=7) patt=false;
                if(T[i+1][j-1]!=7) patt=false;
                if(T[i+1][j]!=7) patt=false;
                if(T[i+1][j+1]!=7) patt=false;
                if(patt && !found){
                    x=i+1,y=j+1;
                    found=true;
                }
            }
        }
    }
    cout<<x<<' '<<y<<'\n';
    return 0;
}
