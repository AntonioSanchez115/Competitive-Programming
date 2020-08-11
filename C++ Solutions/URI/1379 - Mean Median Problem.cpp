#include <bits/stdc++.h>

using namespace std;

int main()
{
    long a,b;
    while(cin>>a>>b && (a!=0 || b!=0)){
        int c = (a<=b) ? (a-abs(a-b)) : (b-abs(a-b));
        cout<<c<<'\n';
    }
    return 0;
}
