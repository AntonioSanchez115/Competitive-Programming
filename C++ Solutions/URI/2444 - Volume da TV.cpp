#include <bits/stdc++.h>
using namespace std;

int main()
{
    int v,t,x;
    cin >> v >> t;
    for(int i=0;i<t;i++){
        cin >> x;
        v += x;
        if(v > 100) v = 100;
        if(v < 0) v = 0;
    }
    cout << v << '\n';
    return 0;
}
