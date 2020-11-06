#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,k;
    vector<string> str;
    string s;
    cin>>n>>k;
    for(int i=0;i<n;i++){
        cin>>s;
        str.push_back(s);
    }
    sort(str.begin(),str.end());
    cout<<str[k-1]<<'\n';
    return 0;
}
