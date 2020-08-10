#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    while(cin>>n && n!=0){
        int ta=0,tb=0;
        for(int i=0;i<n;i++){
            int a,b;
            cin>>a>>b;
            if(a>b) ta++;
            if(b>a) tb++;
        }
        cout<<ta<<' '<<tb<<'\n';
    }
    return 0;
}
