#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,m;
    while(cin>>n>>m){
        int M[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cin>>M[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==1) cout<<9;
                else{
                    int c=0;
                    if(i!=0 && M[i-1][j]==1) c++;
                    if(j!=m-1 && M[i][j+1]==1) c++;
                    if(i!=n-1 && M[i+1][j]==1) c++;
                    if(j!=0 && M[i][j-1]==1) c++;
                    cout<<c;
                }
            }
            cout<<'\n';
        }
    }
    return 0;
}
