#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x,p,m=10000000;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> x;
        if(x<m){
            m = x;
            p = i;
        }
    }
    cout << "Menor valor: " << m << "\nPosicao: " << p << '\n';
    return 0;
}
