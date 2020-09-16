#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,m,l,mc,lc,a;
    while(cin>>n){
        cin>>m>>l;
        int md[m][n],ld[l][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cin>>md[i][j];
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<n;j++){
                cin>>ld[i][j];
            }
        }
        cin>>mc>>lc>>a;
        if(md[mc-1][a-1]>ld[lc-1][a-1]) cout<<"Marcos\n";
        else if(md[mc-1][a-1]<ld[lc-1][a-1]) cout<<"Leonardo\n";
        else cout<<"Empate\n";
    }
    return 0;
}
