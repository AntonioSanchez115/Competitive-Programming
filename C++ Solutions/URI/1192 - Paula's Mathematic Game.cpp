#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    string str;
    cin >> n;
    while(n--){
        cin >> str;
        if(str[0] == str[2]) cout << (str[0]-'0') * (str[2]-'0') << '\n';
        else{
            if(str[1]>='A' && str[1]<='Z') cout << (str[2]-'0') - (str[0]-'0') << '\n';
            else cout << (str[2]-'0') + (str[0]-'0') << '\n';
        }
    }
    return 0;
}
