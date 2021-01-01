#include <bits/stdc++.h>
using namespace std;

bool isPrime(long n){
    for (int i=2; i<=n/2 ; i++) if (n%i==0) return 0;
    return 1;
}

int main()
{
    long n,m,p1,p2;
    cin >> n >> m;
    for(int i=2;i<=n;i++)if(isPrime(i)==1) if(i<=n) p1 = i;
    for(int i=2;i<=m;i++) if(isPrime(i)==1) if(i<=m) p2 = i;
    cout << p1 * p2 << '\n';
    return 0;
}
