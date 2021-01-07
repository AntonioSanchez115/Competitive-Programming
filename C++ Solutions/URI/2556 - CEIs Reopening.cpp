#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    while(cin >> n){
        int vec[n];
        for(int i=0;i<n;i++) cin >> vec[i];
        sort(vec,vec+n);
        cout << n/2 << ' ' << vec[n/2] - vec[n/2-1] << '\n';
    }
    return 0;
}
