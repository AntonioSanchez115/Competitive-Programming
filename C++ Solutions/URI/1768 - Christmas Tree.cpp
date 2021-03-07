#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    while (cin >> n) {
        for (int i = n / 2, j = 1; i >= 0; i--, j += 2) {
            string white = string(i, ' '), aster = string(j, '*');
            cout << white << aster << '\n';
        }
        for (int i = n / 2, x = 0, j = 1; x < 2; i--, j += 2, x++) {
            string white = string(i, ' '), aster = string(j, '*');
            cout << white << aster << '\n';
        }
        cout << '\n';
    }
    return 0;
}
