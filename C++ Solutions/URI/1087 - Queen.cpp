#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, x, y;
    while (cin >> a >> b >> x >> y && (a + b + x + y) != 0) {
        if (a == x && b == y) cout << "0\n";
        else if ((abs(a - x) == abs(b - y)) || (a == x || b == y)) cout << "1\n";
        else cout << "2\n";
    }
    return 0;
}
