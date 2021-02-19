#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, a = 0;
    cin >> n >> m;
    int vec[n];
    for (int i = 0; i < n; i++) {
        cin >> vec[i];
    }
    for (int i = 0; i < n - 1; i++) {
        if (vec[i] != m) {
            a += abs(m - vec[i]);
            if (m > vec[i]) {
                vec[i + 1] += abs(m - vec[i]);
                vec[i] += abs(m - vec[i]);
            } else {
                vec[i + 1] -= abs(m - vec[i]);
                vec[i] -= abs(m - vec[i]);
            }
        }
    }
    cout << a << '\n';
    return 0;
}
