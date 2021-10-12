#include <bits/stdc++.h>
using namespace std;

int main() {
    int d;
    cin >> d;
    if (d >= 0 && d <= 800) cout << "1\n";
    else if (d > 800 && d <= 1400) cout << "2\n";
    else cout << "3\n";
    return 0;
}
