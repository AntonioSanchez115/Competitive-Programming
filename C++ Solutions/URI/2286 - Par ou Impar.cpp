#include <bits/stdc++.h>
using namespace std;

int main() {
    int t = 1, n;
    while (cin >> n && n != 0) {
        string n1, n2;
        int a, b;
        cin >> n1 >> n2;
        cout << "Teste " << t++ << '\n';
        for (int i = 0; i < n; i++) {
            cin >> a >> b;
            cout << (((a + b) % 2) ? n2 : n1) << '\n';;
        }
        cout << '\n';
    }
    return 0;
}
