#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,minimal,pos,t;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>t;
        if(i==0){
            minimal = t;
            pos = i+1;
        }else{
            if(t<minimal){
                minimal = t;
                pos = i+1;
            }
        }
    }
    cout<<pos<<'\n';
    return 0;
}
