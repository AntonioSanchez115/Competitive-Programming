#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,l,c,copas=0;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> l >> c;
        copas += ((l>c) ? c : 0);
    }
    cout << copas << '\n';
    return 0;
}
