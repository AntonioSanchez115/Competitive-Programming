#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    set < int > cat;
    int n, m, x, cont;
    while (cin >> n >> m && (n + m) != 0) {
        cont = 0;
        for (int i = 0; i < n; i++) {
            cin >> x;
            cat.insert(x);
        }
        for (int i = 0; i < m; i++) {
            cin >> x;
            if (cat.count(x) == 1) cont++;
        }
        cout << cont << '\n';
        cat.clear();
    }
    return 0;
}
