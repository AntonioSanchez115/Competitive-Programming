#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,m,t;
    while(cin >> n >> m && n != 0){
        int ticket[n+1];
        for(int i=0;i<=n;i++) ticket[i] = 0;
        int duplicate = 0;
        for(int i=0;i<m;i++){
            cin >> t;
            ticket[t]++;
        }
        for(int i=1;i<=n;i++){
            if(ticket[i] > 1) duplicate++;
        }
        cout << duplicate << '\n';
    }
    return 0;
}
