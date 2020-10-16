#include <bits/stdc++.h>
using namespace std;

int main()
{
    long n,e,x,y;
    while(cin>>n && n!=0){
        long m[n][n];
        for(int i=0;i<(2*n)-1;i++){
            e = pow(2,i);
            if(i<n){
                x = i;
                y = 0;
                for(int j=0;j<i+1;j++) m[x--][y++] = e;
            }else{
                x = n - 1;
                y = n - ((2*n-1)-(i%(2*n-1)));
                for(int j=(2*n-1)-(i%(2*n-1));j>0;j--) m[x--][y++] = e;
            }
        }
        for(int i=0;i<n;i++){
            cout << setw(log10(e)+1) << right << m[i][0];
            for(int j=1;j<n;j++) cout << ' ' << setw(log10(e)+1) << right << m[i][j];
            cout<<'\n';
        }
        cout<<'\n';
    }
    return 0;
}
