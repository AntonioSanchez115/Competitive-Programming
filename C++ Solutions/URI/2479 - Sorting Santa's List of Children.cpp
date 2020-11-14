#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,gb=0,bb=0;
    string s;
    char c;
    vector<string> names;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> c >> s;
        if(c=='+') gb++;
        else bb ++;
        names.push_back(s);
    }
    sort(names.begin(),names.end());
    for(int i=0;i<n;i++) cout << names[i] << '\n';
    cout << "Se comportaram: " << gb << " | Nao se comportaram: " << bb << '\n';
    return 0;
}
