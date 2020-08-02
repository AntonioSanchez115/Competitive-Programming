#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    bool p = false;
    if(a==b || b==c || a==c) p=true;
    if((a-b+c)==0) p=true;
    if((a-c+b)==0) p=true;
    if((b-a+c)==0) p=true;
    if((b-c+a)==0) p=true;
    if((c-a+b)==0) p=true;
    if((c-b+a)==0) p=true;
    cout<<((p)?"S\n":"N\n");
    return 0;
}
