#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, nm=0;
    while(cin >> n && n!=0) nm = max(n,nm);
    cout << nm << '\n';
    return 0;
}
