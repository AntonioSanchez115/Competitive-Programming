#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,a = 0,b;
    bool possible = true;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> b;
        if (b-a > 8) possible = false;
        a = b;
    }
    cout << ((possible) ? "S\n" : "N\n");
    return 0;
}
