#include <bits/stdc++.h>
using namespace std;

int main()
{
    double L;
    long long p=1;
    cin >> L;
    while(L>=2.0){
        L /= 2;
        p *= 4;
    }
    cout << p << '\n';
    return 0;
}
