#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,a,c=0,r=0,s=0,total;
    char t;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>a>>t;
        if(t=='C') c+=a;
        if(t=='R') r+=a;
        if(t=='S') s+=a;
    }
    total = c + r + s;
    cout<<"Total: "<<total<<" cobaias\n";
    cout<<"Total de coelhos: "<<c<<'\n';
    cout<<"Total de ratos: "<<r<<'\n';
    cout<<"Total de sapos: "<<s<<'\n';
    printf("Percentual de coelhos: %.2lf %%\n",c*100.0/total);
    printf("Percentual de ratos: %.2lf %%\n",r*100.0/total);
    printf("Percentual de sapos: %.2lf %%\n",s*100.0/total);
    return 0;
}
