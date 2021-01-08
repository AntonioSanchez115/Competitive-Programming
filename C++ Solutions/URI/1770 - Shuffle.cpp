#include <bits/stdc++.h>
using namespace std;

int main()
{
    int m,k,x,c;
    while(cin >> m >> k){
        int song[m], appear[m], time = 0;
        bool flag = true;
        for(int i=0;i<m;i++){
            cin >> song[i];
            appear[i] = 0;
        }
        for(int i=0;i<k;i++){
            cin >> x;
            if(flag) time += song[x-1];
            appear[x-1] = 1;
            c = 0;
            for(int j=0;j<m;j++) if(appear[j] == 1) c++;
            if(c == m) flag = false;
        }
        flag = true;
        for(int i=0;i<m && flag;i++) if(appear[i] == 0) flag = false;
        if(flag) cout << time << '\n';
        else cout << "-1\n";
    }
    return 0;
}
