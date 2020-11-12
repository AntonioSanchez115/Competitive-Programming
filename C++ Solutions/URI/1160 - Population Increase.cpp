#include <bits/stdc++.h>
using namespace std;

int main()
{
    double pa,pb,g1,g2,t;
    cin >> t;
    while(t--){
        int y=0;
        cin >> pa >> pb >> g1 >> g2;
        while(pa<=pb){
            pa+=((int)(pa*(g1/100.0)));
            pb+=((int)(pb*(g2/100.0)));
            y++;
            if(y>100) break;
        }
        if(y<=100) cout << y << " anos.\n";
        else cout << "Mais de 1 seculo.\n";
    }
    return 0;
}
