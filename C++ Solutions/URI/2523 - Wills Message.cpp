#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    while(cin>>str){
        int n;
        cin>>n;
        for(int i=0;i<n;i++){
            int x;
            cin>>x;
            cout<<str[x-1];
        }
        cout<<'\n';
    }
    return 0;
}
