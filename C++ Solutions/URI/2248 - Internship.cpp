#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int n, t = 1;
    while (cin >> n && n != 0) {
        int code[n], ave[n], h = 0;
        for (int i = 0; i < n; i++) {
            cin >> code[i] >> ave[i];
            if (ave[i] > h) h = ave[i];
        }
        cout << "Turma " << t++ << '\n';
        for (int i = 0; i < n; i++) {
            if (ave[i] == h) cout << code[i] << ' ';
        }
        cout << "\n\n";
    }
    return 0;
}
