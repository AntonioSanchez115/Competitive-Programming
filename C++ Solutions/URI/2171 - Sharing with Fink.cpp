#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    while(cin >> n && n!=0){
        int a=1,b=0;
        while(a+b <= n){
            b+=a;
            a++;
        }
        cout << b << ' ' << n-b << '\n';
    }
    return 0;
}
