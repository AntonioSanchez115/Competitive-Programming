#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,a,p,pos=0; cin>>n;
    for(int i=0;i<n;i++){
        cin>>a;
        if(i==0) p=a;
        else{
            if(a<p){
                pos=i+1;
                break;
            }else{
                p=a;
            }
        }
    }
    cout<<pos<<'\n';
    return 0;
}
