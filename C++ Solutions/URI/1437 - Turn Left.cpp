#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    while(cin >> n && n != 0){
        int dir=1;
        string s;
        cin >> s;
        for(int i=0;i<n;i++){
            if(s[i]=='D'){
                if(dir==4) dir = 1;
                else dir++;
            }else{
                if(dir==1) dir = 4;
                else dir--;
            }
        }
        if(dir==1) cout << "N\n";
        if(dir==2) cout << "L\n";
        if(dir==3) cout << "S\n";
        if(dir==4) cout << "O\n";
    }
    return 0;
}
