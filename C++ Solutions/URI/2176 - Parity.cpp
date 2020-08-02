#include <bits/stdc++.h>

using namespace std;

int main()
{
    string s; cin>>s;
    int one=0;
    for(int i=0;i<s.size();i++){
        if(s[i]=='1') one++;
    }
    cout<<s;
    cout<<((one%2==0)?"0\n":"1\n");
    return 0;
}
