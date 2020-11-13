#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    string s;
    cin >> n;
    while(n--){
        bool q=false, j=false, k=false, a=false;
        cin >> s;
        for(int i=0;i<s.size();i++){
            if(s[i]=='Q') q=true;
            if(s[i]=='J') j=true;
            if(s[i]=='K') k=true;
            if(s[i]=='A') a=true;
        }
        cout << ((q && j && k && a) ? "Aaah muleke\n" : "Ooo raca viu\n");
    }
    return 0;
}
