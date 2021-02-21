#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    long long int n, t = 1;
    while (cin >> n && n >= 0) {
        long long int acum = 2, exp = 1;
        for (int i = 0; i < n; i++) {
            acum += exp;
            exp *= 2;
        }
        cout << "Teste " << t++ << '\n' << acum * acum << "\n\n";
    }
    return 0;
}
