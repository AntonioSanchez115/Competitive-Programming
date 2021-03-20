#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, k;
    bool same;
    string group[101];
    cin >> t;
    while (t--) {
        same = true;
        cin >> k;
        for (int i = 0; i < k; i++) cin >> group[i];
        for (int i = 0; i < k - 1; i++) if (group[i] != group[i + 1]) same = false;
        cout << ((same) ? group[0] : "ingles") << '\n';
    }
    return 0;
}
