#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll fib(ll n){
    ll f[n+2];
    ll i;
    f[0]=0;
    f[1]=1;
    for(i=2;i<=n;i++) f[i] = f[i-1]+f[i-2];
    return f[n];
}

int main()
{
    ll t,n;
    cin >> t;
    while(t--){
        cin >> n;
        cout << "Fib(" << n << ") = " << fib(n) << '\n';
    }
    return 0;
}
