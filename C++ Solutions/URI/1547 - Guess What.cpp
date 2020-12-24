#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--){
        int q,s,x,pos,w=101;
        cin >> q >> s;
        for(int i=0;i<q;i++){
            cin >> x;
            x = abs(s-x);
            if(x < w){
                w = x;
                pos = i + 1;
            }
        }
        cout << pos << '\n';
    }
    return 0;
}
