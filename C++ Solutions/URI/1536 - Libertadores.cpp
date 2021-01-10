#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--){
        int m1,m2,v1,v2,w1,w2;
        char x;
        cin >> m1 >> x >> v1 >> m2 >> x >> v2;
        if(m1 == v1) w1 = 0;
        else w1 = (m1 > v1) ? 1 : 2;
        if(m2 == v2) w2 = 0;
        else w2 = (m2 > v2) ? 2 : 1;
        if((w1 == 0 && w2 == 1) || ((w1 == 1) && (w2 == 0 || w2 == 1))) cout << "Time 1\n";
        else if((w1 == 0 && w2 == 2) || ((w1 == 2) && (w2 == 0 || w2 == 2))) cout << "Time 2\n";
        else{
            if((m1+v2) == (v1+m2)){
                if(v2 == v1) cout << "Penaltis\n";
                else cout << ((v2 > v1) ? "Time 1\n" : "Time 2\n");
            }
            else cout << (((m1+v2) > (v1+m2)) ? "Time 1\n" : "Time 2\n");
        }
    }
    return 0;
}
