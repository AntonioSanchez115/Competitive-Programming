#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n1,n2;
    double d1,d2,v1,v2;
    cin >> n1 >> d1 >> v1 >> n2 >> d2 >> v2;
    cout << (((d1/v1*60.0) >= (d2/v2*60.0)) ? n2 : n1) << '\n';
    return 0;
}
