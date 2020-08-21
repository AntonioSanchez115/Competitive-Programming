#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t,r,g,b,p=0;
    cin>>t;
    for(int i=0;i<t;i++){
        string conv;
        cin>>conv>>r>>g>>b;
        if(conv=="min") p=min(r,min(g,b));
        else if(conv=="max") p=max(r,max(g,b));
        else if(conv=="mean")p=(r+g+b)/3;
        else p=(0.3*r+0.59*g+0.11*b);
        cout<<"Caso #"<<i+1<<": "<<p<<'\n';
    }
    return 0;
}
