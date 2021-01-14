#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,t;
    cin >> t;
    while(t-- && cin >> n){
        cout << ((n%2 == 0) ? "1\n" : "9\n");
    }
    return 0;
}
