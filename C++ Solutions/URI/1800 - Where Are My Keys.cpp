#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int q,e,x;
    cin >> q >> e;
    int E[q*2];
    for(int i=0;i<e;i++) cin >> E[i];
    for(int i=0;i<q;i++){
        cin >> x;
        bool visited = false;
        for(int j=0;j<e;j++){
            if(x == E[j]){
                visited = true;
                break;
            }
        }
        if(visited) cout << "0\n";
        else{
            cout << "1\n";
            E[e++] = x;
        }
    }
    return 0;
}
