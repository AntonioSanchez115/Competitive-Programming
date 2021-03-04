#include <bits/stdc++.h>
using namespace std;

void solve(int n) {
    map < string, int > mp;
    string fig;
    int sum = 0;
    mp["Tetrahedron"] = 4;
    mp["Cube"] = 6;
    mp["Octahedron"] = 8;
    mp["Dodecahedron"] = 12;
    mp["Icosahedron"] = 20;
    for (int i = 0; i < n; i++) {
        cin >> fig;
        auto it = mp.find(fig);
        sum += it -> second;
    }
    cout << sum << '\n';
}

int main() {
    int n;
    cin >> n;
    solve(n);
    return 0;
}
