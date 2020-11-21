#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, v, ok=0;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> v;
        if(v==0) ok++;
    }
    cout << ((ok > (n-ok)) ? "Y\n" : "N\n");
    return 0;
}
