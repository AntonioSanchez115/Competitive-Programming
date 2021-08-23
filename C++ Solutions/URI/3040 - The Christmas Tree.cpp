#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, h, d, g;
    cin >> n;
    while (n--) {
        cin >> h >> d >> g;
        cout << (((h >= 200 && h <= 300) && (d >= 50) && (g >= 150)) ? "Sim" : "Nao") << '\n';
    }
    return 0;
}
