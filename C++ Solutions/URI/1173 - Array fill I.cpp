#include <bits/stdc++.h>
using namespace std;

int main()
{
    int v;
    cin >> v;
    for(int i=0;i<10;i++,v*=2) cout << "N[" << i << "] = " << v << '\n';
    return 0;
}
