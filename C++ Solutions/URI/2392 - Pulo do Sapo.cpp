#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, p, d;
    cin >> n >> m;
    bool stone[n];
    for (int i = 0; i < n; i++) stone[i] = 0;
    for (int i = 0; i < m; i++) {
        cin >> p >> d;
        for (int j = p - 1; j >= 0; j -= d) stone[j] = 1;
        for (int j = p - 1; j < n; j += d) stone[j] = 1;
    }
    for (int i = 0; i < n; i++) cout << stone[i] << '\n';
    return 0;
}
