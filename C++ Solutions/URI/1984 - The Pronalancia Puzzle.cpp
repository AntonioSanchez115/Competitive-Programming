#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str,str1="";
    cin>>str;
    for(int i=str.size()-1;i>=0;i--){
        str1 += str[i];
    }
    cout<<str1<<'\n';
    return 0;
}
