#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, b = 0, a = 0, m = 0, d = 0, h, t = 0;
    string e, g;
    cin >> n;
    while (n--) {
        cin >> e >> g >> h;
        if (g == "bonecos") b += h;
        if (g == "arquitetos") a += h;
        if (g == "musicos") m += h;
        if (g == "desenhistas") d += h;
    }
    t += b / 8;
    t += a / 4;
    t += m / 6;
    t += d / 12;
    cout << t << '\n';
    return 0;
}
