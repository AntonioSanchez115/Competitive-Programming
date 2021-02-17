#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, x, sum = 0;
    cin >> n;
    for (int i = 0; i < n - 1; i++) {
        cin >> x;
        sum += x;
    }
    cout << ((n * (n + 1)) / 2) - sum << '\n';
    return 0;
}
