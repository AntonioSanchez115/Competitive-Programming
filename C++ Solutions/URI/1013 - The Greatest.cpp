#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    b = ((a+b+abs(a-b))/2.0);
    c = ((b+c+abs(b-c))/2.0);
    cout<<c<<" eh o maior\n";
    return 0;
}
