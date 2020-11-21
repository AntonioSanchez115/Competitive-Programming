#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    while(cin >> t && t!=0){
        int q;
        double a,b;
        for(int i=1;i<=t;i++){
            double total = 0.0;
            cin >> q >> a >> b;
            double area = (a+b)/2.0*5.0;
            while(q--) total += area;
            printf("Size #%d:\nIce Cream Used: %.2f cm2\n",i,total);
        }
        cout << '\n';
    }
    return 0;
}
