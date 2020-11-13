#include <bits/stdc++.h>
using namespace std;

int main()
{
    int p1,c1,p2,c2;
    cin >> p1 >> c1 >> p2 >> c2;
    if(p1*c1==p2*c2) cout << "0\n";
    else cout << ((p1*c1>p2*c2)? "-1\n" : "1\n");
    return 0;
}
