#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    while(cin>>t && t!=0){
        int n;
        for(int i=0;i<t;i++){
            cin>>n;
            cout<<((n%2==0)?((n-2)*2+2):((n-1)*2+1))<<'\n';
        }
    }
    return 0;
}
