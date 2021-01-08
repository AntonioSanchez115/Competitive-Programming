#include <bits/stdc++.h>
using namespace std;

int main()
{
    int r,t = 1;
    while(cin >> r && r != 0){
        int aldo = 0, beto = 0, a, b;
        for(int i=0;i<r;i++){
            cin >> a >> b;
            aldo += a;
            beto += b;
        }
        cout << "Teste " << t++ << '\n';
        cout << ((aldo > beto) ? "Aldo\n\n" : "Beto\n\n");
    }
    return 0;
}
