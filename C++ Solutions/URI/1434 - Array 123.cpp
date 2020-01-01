#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n=0;
    while(cin>>n){
        int m[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1) m[i][j]=2;
                else if(i==j) m[i][j]=1;
                else m[i][j]=3;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cout<<m[i][j];
            }
            cout<<'\n';
        }
    }
    return 0;
}
