#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,c;
    cin >> a >> b >> c;
    a /= 2;
    b /= 3;
    c /= 5;
    cout << min(min(a,b),c) << '\n';
    return 0;
}
