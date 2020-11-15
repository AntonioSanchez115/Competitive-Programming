#include <bits/stdc++.h>
using namespace std;

int main()
{
    int c,sum=0,x;
    cin >> c;
    for(int i=0;i<c;i++){
        cin >> x;
        if(x) sum++;
    }
    cout << sum << '\n';
    return 0;
}
