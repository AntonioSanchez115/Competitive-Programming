#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, pos, fastest = INT_MAX;
    cin >> n >> m;
    int mat[n][m], time[n];
    memset(time, 0, sizeof(time));
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++) cin >> mat[i][j];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) time[i] += mat[i][j];
    }
    for (int i = 0; i < n; i++) {
        if (time[i] < fastest) {
            fastest = time[i];
            pos = i;
        }
    }
    cout << pos + 1 << '\n';
    return 0;
}
