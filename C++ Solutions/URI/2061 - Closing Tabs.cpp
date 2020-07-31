#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    for(int i=0;i<m;i++){
        string act;
        cin>>act;
        if(act=="fechou") n++;
        else n--;
    }
    if(n<0) cout<<0<<'\n';
    else cout<<n<<'\n';
    return 0;
}
