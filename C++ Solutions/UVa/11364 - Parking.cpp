#include <bits/stdc++.h>
using namespace std;

int main()
{
    int tc;
    cin>>tc;
    while(tc--){
        int h,l,n,x;
        cin>>n;
        for(int i=0;i<n;i++){
            cin>>x;
            if(i==0){
                h=x;
                l=x;
            }
            if(x>h) h=x;
            if(x<l) l=x;
        }
        cout<<(h-l)*2<<'\n';
    }
    return 0;
}
