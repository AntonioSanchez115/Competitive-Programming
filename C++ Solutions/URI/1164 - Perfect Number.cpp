#include <bits/stdc++.h>
using namespace std;

bool perfectNum(int n){
    long long sum = 0;
    for(int i=1;i<n;i++) if(n%i==0) sum+=i;
    return sum == n;
}

int main()
{
    int t,n;
    cin >> t;
    while(t--){
        cin >> n;
        if(perfectNum(n)) cout << n << " eh perfeito\n";
        else cout << n << " nao eh perfeito\n";
    }
    return 0;
}
