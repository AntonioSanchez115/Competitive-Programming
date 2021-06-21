#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, x, c = 0;
    cin >> t;
    while (t--) {
        cin >> x;
        if (x != 1) c++;
    }
    cout << c << '\n';
    return 0;
}
