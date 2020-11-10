#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t,k,f;
    string m[4] = {"Rolien","Naej","Elehcim","Odranoel"};
    cin>>t;
    while(t--){
        cin>>k;
        for(int i=0;i<k;i++){
            cin>>f;
            cout<<m[f-1]<<'\n';
        }
    }
    return 0;
}
