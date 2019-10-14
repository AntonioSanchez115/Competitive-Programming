#include <bits/stdc++.h>
using namespace std;

int main(){
    //freopen("test.txt","w",stdout); //To compare the output format carefully
    ios_base::sync_with_stdio(0); cin.tie(0);
    int n;
    while(cin>>n && n!=0){
        int M[n][n];
        bool flag1=true, flag2=true, flag3=true;
        int num=n,t=1,a=0,b=n-1;
        for(int i=0;i<(2*n-1);i++){
            if(num==1) flag3=false;
            if(a==b) flag1=false;
            int x=a,y=b;
            if(flag1){
                b--;
            }else{
                a++;
            }
            if(t==n) flag2=false;
            for(int j=0;j<t;j++){
                M[x++][y++]=num;
            }
            if(flag3) num--;
            else num++;
            if(flag2) t++;
            else t--;
        }
        //print
        for(int i=0;i<n;i++){
            if(M[i][0]<10) cout<<"  "<<M[i][0];
            else if(M[i][0]<100) cout<<" "<<M[i][0];
            else cout<<M[i][0];
            for(int j=1;j<n;j++){
                if(M[i][j]<10) cout<<"   "<<M[i][j];
                else if(M[i][j]<100) cout<<"  "<<M[i][j];
                else cout<<' '<<M[i][j];
            }
            cout<<'\n';
        }
        cout<<'\n';
    }
    return 0;
}
