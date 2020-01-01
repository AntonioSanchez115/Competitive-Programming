#include <bits/stdc++.h>
using namespace std;
int main(){
    //freopen("test.txt","w",stdout);
    ios_base::sync_with_stdio(0); cin.tie(0);
    int n;
    while(cin>>n && n!=0){
        int M[n][n];
        int infLim=0,supLim=n,cont=1,t;
        if(n%2!=0) t=n/2+1;
        else t=n/2;
        for(int i=0;i<t;i++){
            for(int j=infLim;j<supLim;j++){
                for(int k=infLim;k<supLim;k++){
                    M[j][k]=cont;
                }
            }
            infLim++;
            supLim--;
            cont++;
        }
        for(int i=0;i<n;i++){
            cout<<"  "<<M[i][0];
            for(int j=1;j<n;j++){
                if(M[i][j]<10) cout<<"   "<<M[i][j];
                else cout<<"  "<<M[i][j];
            }
            cout<<'\n';
        }
        cout<<'\n';
    }
    return 0;
}
