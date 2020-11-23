#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,m,x,p=0;
    cin >> n >> m;
    for(int i=0;i<n;i++){
        bool success = true;
        for(int j=0;j<m;j++){
            cin >> x;
            if(!x) success = false;
        }
        if(success) p++;
    }
    cout << p << '\n';
    return 0;
}
