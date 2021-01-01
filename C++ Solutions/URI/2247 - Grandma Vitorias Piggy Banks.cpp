#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, t = 1;
    while(cin >> n && n != 0){
        cout << "Teste " << t++ << '\n';;
        int x, y, j = 0, z = 0;
        for(int i=0;i<n;i++){
            cin >> x >> y;
            j += x;
            z += y;
            cout << j-z << '\n';
        }
        cout << '\n';
    }
    return 0;
}
