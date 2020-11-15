#include <bits/stdc++.h>
using namespace std;

int main()
{
    double a,b,c;
    while(cin >> a >> b >> c && (a+b+c) != 0.0){
        cout << (int)cbrt(a*b*c) << '\n';
    }
    return 0;
}
