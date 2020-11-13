#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x,t=1;
    cin >> n >> x;
    int a[n];
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n-1;i++){
        int v=1;
        for(int j=i;j<n-1;j++){
            if(a[j+1]-a[j] > x) break;
            else v++;
        }
        t=max(t,v);
    }
    cout << t << '\n';
    return 0;
}
