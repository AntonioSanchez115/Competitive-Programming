#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c,d;
    cin>>a>>b>>c>>d;
    bool possible = false;
    if(a+b>c && a+c>b && c+b>a) possible = true;
    if(b+c>d && b+d>c && c+d>b) possible = true;
    if(a+b>d && a+d>b && b+d>a) possible = true;
    if(a+c>d && a+d>c && c+d>a) possible = true;
    cout<<((possible)?"S\n":"N\n");
    return 0;
}
