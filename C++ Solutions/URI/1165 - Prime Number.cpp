#include <bits/stdc++.h>
using namespace std;

bool primeNumber(int n){
    int d=0;
    for(int i=2;i<=n;i++) if(n%i==0) d++;
    return (d==1);
}

int main()
{
    int t,n;
    cin >> t;
    while(t--){
        cin >> n;
        if(primeNumber(n)) cout << n << " eh primo\n";
        else cout << n << " nao eh primo\n";
    }
    return 0;
}
