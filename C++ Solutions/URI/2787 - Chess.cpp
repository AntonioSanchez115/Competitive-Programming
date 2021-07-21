#include <bits/stdc++.h>
using namespace std;

int main() {
    int L, C;
    cin >> L >> C;
    cout << (((((L % 2) && (C % 2)) || (!(L % 2) && !(C % 2)))) ? "1" : "0") << '\n';
    return 0;
}
