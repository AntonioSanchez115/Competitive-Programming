#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, c, s, e, cap = 0;
    cin >> n >> c;
    bool overflow = false;
    for(int i=0;i<n;i++){
        cin >> s >> e;
        cap += (-s + e);
        if(cap > c) overflow = true;
    }
    cout << ((overflow) ? "S\n" : "N\n");
    return 0;
}
