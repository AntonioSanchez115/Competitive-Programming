#include <bits/stdc++.h>
using namespace std;

int main()
{
    double r,a,b,c;
    cin >> r >> a >> b >> c;
    cout << (((r<=a)&&(r<=b)&&(r<=c)) ? "S\n" : "N\n");
    return 0;
}
