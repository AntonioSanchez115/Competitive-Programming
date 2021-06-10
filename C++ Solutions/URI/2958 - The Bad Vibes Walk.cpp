#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    char c;
    string cell;
    priority_queue < int > v, d;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> cell;
            c = cell[1];
            if (c == 'V') v.push(cell[0] - '0');
            else d.push(cell[0] - '0');
        }
    }
    while (!v.empty()) {
        cout << v.top() << "V\n";
        v.pop();
    }
    while (!d.empty()) {
        cout << d.top() << "D\n";
        d.pop();
    }
    return 0;
}
