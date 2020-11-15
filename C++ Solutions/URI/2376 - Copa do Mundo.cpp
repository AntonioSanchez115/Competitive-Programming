#include <bits/stdc++.h>
using namespace std;

int main()
{
    string octavos = "ABCDEFGHIJKLMNOP", cuartos = "", semi = "", fin = "";
    int m,n;
    for(int i=0;i<16;i+=2){
        cin >> m >> n;
        cuartos += ((m>n) ? octavos[i] : octavos[i+1]);
    }
    for(int i=0;i<8;i+=2){
        cin >> m >> n;
        semi += ((m>n) ? cuartos[i] : cuartos[i+1]);
    }
    for(int i=0;i<4;i+=2){
        cin >> m >> n;
        fin += ((m>n) ? semi[i] : semi[i+1]);
    }
    cin >> m >> n;
    cout << ((m>n) ? fin[0] : fin[1]) << '\n';
    return 0;
}
