#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long t,c,d,a,b;
    cin >> t;
    while(t--){
        a = 1, b = 1;
        cin >> c >> d;
        for(int i=0;i<c;i++) a*=26;
        for(int i=0;i<d;i++) b*=10;
        cout << ((c+d==0) ? 0 : (a*b)) << '\n';
    }
    return 0;
}
