#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, n, k, cont;
    cin >> t;
    while (t--) {
        cin >> n >> k;
        cont = 0;
        while (n >= k) {
            cont++;
            n -= k;
        }
        cout << n + cont << '\n';
    }
    return 0;
}
