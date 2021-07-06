#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    int m[102][102];
    while (cin >> n) {
        int x = n / 3;
        memset(m, 0, sizeof(m));

        for (int i = 0; i < n; i++) {
            m[i][i] = 2;
        }
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            m[i][j] = 3;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if ((i >= x && i < n - x) && (j >= x && j < n - x)) m[i][j] = 1;
        }
        m[n / 2][n / 2] = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) cout << m[i][j];
            cout << '\n';
        }
        cout << '\n';
    }
    return 0;
}
