#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,p,q;
    char c;
    cin >> n >> p >> c >> q;
    if(c=='+') cout << ((p+q > n)?"OVERFLOW\n":"OK\n");
    else cout << ((p*q > n)?"OVERFLOW\n":"OK\n");
    return 0;
}
