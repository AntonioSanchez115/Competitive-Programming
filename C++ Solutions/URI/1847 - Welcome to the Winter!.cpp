#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    if(a>b && b<=c) cout<<":)\n";
    else if(a<b && b<c && (abs(c-b)>=abs(b-a))) cout<<":)\n";
    else if (a>b && b>c && (abs(c-b)<abs(b-a))) cout<<":)\n";
    else if (a==b && c>b) cout<<":)\n";
    else cout<<":(\n";
    return 0;
}
