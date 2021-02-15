#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, higher = 0, sum = 0;
    cin >> n >> m;
    int M[n][m];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++) cin >> M[i][j];
    for (int i = 0; i < n; i++) {
        sum = 0;
        for (int j = 0; j < m; j++) sum += M[i][j];
        if (sum > higher) higher = sum;
    }
    for (int i = 0; i < m; i++) {
        sum = 0;
        for (int j = 0; j < n; j++) sum += M[j][i];
        if (sum > higher) higher = sum;
    }
    cout << higher << '\n';
    return 0;
}
