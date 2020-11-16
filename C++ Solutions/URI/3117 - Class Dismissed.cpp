#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,k,x,inClass=0;
    cin >> n >> k;
    for(int i=0;i<n;i++){
        cin >> x;
        if(x<=0) inClass++;
    }
    cout << ((k<=inClass) ? "YES\n" : "NO\n");
    return 0;
}
