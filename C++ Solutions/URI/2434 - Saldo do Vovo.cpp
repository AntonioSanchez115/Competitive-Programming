#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,s,x,m=10000;
    cin >> n >> s;
    for(int i=0;i<n;i++){
        cin >> x;
        s += x;
        m = min(m,s);
    }
    cout << m << '\n';
    return 0;
}
