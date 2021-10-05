#include <bits/stdc++.h>
using namespace std;

int main() {
    int a1, a2, a3, b1, b2, x;
    cin >> a1 >> a2 >> a3 >> b1 >> b2 >> x;
    cout << (((a1 + a2 + a3 + x) >= (b1 + b2)) ? "Middle-earth is safe." : "Sauron has returned.") << '\n';
    return 0;
}
