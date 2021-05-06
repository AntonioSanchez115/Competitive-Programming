#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, a, b;
    while (cin >> n >> m && (n + m != 0)) {
        char draw[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) cin >> draw[i][j];
        }
        cin >> a >> b;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                cout << draw[i / (a / n)][j / (b / m)];
            }
            cout << '\n';
        }
        cout << '\n';
    }
    return 0;
}
