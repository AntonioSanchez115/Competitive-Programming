#include <bits/stdc++.h>

using namespace std;

int main() {
    set < int > album;
    int n, m, x;
    cin >> n >> m;
    while (m--) {
        cin >> x;
        album.insert(x);
    }
    cout << n - album.size() << '\n';
    return 0;
}
