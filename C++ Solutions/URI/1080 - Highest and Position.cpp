#include <bits/stdc++.h>
using namespace std;

int main()
{
    int h=0,p=0,x;
    for(int i=1;i<=100;i++){
        cin>>x;
        if(x>h) h=x,p=i;
    }
    cout<<h<<'\n'<<p<<'\n';
    return 0;
}
