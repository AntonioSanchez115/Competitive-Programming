#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,c,d,D,x,y;
    cin >> a >> b >> c >> d;
    D = __gcd(a,b);
    a = a / D;
    b = b / D;
    D = __gcd(c,d);
    c = c / D;
    d = d / D;
    x = (a * d) + (b * c);
    y = b * d;
    D = __gcd(x,y);
    x = x / D;
    y = y / D;
    cout << x << ' ' << y << '\n';
    return 0;
}
