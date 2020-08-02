#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t; cin>>t;
    while(t--){
        int b,a1,d1,l1,a2,d2,l2;
        double v1,v2;
        cin>>b;
        cin>>a1>>d1>>l1;
        cin>>a2>>d2>>l2;
        v1 = (a1+d1)/2.0;
        v2 = (a2+d2)/2.0;
        if(l1%2==0) v1+=b;
        if(l2%2==0) v2+=b;
        if(v1==v2) cout<<"Empate\n";
        else if(v1>v2) cout<<"Dabriel\n";
        else cout<<"Guarte\n";
    }
    return 0;
}
