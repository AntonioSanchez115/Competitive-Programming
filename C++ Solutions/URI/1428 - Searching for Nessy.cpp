#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t,n,m;
    cin >> t;
    while(t--){
        cin >> n >> m;
        printf("%ld\n",(long)(ceil((n-2) / (double)3) * ceil((m-2) / (double)3)));
    }
    return 0;
}
