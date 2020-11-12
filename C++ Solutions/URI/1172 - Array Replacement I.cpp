#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x;
    for(int i=0;i<10;i++){
        cin >> x;
        if(x<=0) x=1;
        cout << "X[" << i << "] = " << x << '\n';
    }
    return 0;
}
