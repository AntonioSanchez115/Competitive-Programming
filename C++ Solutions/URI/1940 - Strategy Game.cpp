#include <bits/stdc++.h>
using namespace std;

int main()
{
    int q,r,x,idwin,winner = 0;
    cin >> q >> r;
    int player[q];
    for(int i=0;i<q;i++) player[i] = 0;
    for(int i=0;i<r;i++){
        for(int j=0;j<q;j++){
            cin >> x;
            player[j] += x;
        }
    }
    for(int i=0;i<q;i++){
        if(player[i] >= winner){
            winner = player[i];
            idwin = i+1;
        }
    }
    cout << idwin << '\n';
    return 0;
}
