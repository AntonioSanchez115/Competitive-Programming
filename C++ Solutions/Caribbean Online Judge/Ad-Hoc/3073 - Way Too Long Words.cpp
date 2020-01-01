#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0);
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        if(str.size()>10){
            string ab = to_string(str.size()-2);
            string str1="";
            str1+=str[0];
            str1+=ab;
            str1+=str[str.size()-1];
            cout<<str1<<'\n';
        }else cout<<str<<'\n';
    }
    return 0;
}
