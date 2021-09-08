#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k, x, c;
    cin >> n;
    while (n--) {
        c = 0;
        cin >> k;
        for (int i = 0; i < k; i++) {
            cin >> x;
            c += ((i != k - 1) ? x - 1 : x);
        }
        cout << c << '\n';
    }
    return 0;
}
