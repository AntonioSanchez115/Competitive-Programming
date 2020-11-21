#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,a,t;
    string str;
    while(cin >> n && n != 0){
        string name;
        int first = 2114;
        for(int i=0;i<n;i++){
            cin >> str >> a >> t;
            if(a-t < first){
                first = a-t;
                name = str;
            }
        }
        cout << name << '\n';
    }
    return 0;
}
