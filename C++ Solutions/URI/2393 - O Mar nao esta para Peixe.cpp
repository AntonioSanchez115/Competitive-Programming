#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t,xi,xf,yi,yf,area = 0;
    int sea[101][101] = {0};
    cin >> t;
    while(t--){
        int n,m;
        cin >> xi >> xf >> yi >> yf;
        n = xf - xi;
        m = yf - yi;
        for(int i=xi;i<xi+n;i++){
            for(int j=yi;j<yi+m;j++) sea[i][j] = 1;
        }
    }
    for(int i=0;i<101;i++){
        for(int j=0;j<101;j++) if(sea[i][j]==1) area++;
    }
    cout << area << '\n';
    return 0;
}
