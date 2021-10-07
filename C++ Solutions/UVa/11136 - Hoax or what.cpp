#include <bits/stdc++.h>
using namespace std;

int main() {
    long n, k, x, cost;
    multiset < long > urn;
    while (cin >> n && n != 0) {
        cost = 0;
        for (int i = 0; i < n; i++) {
            cin >> k;
            for (int j = 0; j < k; j++) {
                cin >> x;
                urn.insert(x);
            }
            cost += * urn.rbegin() - * urn.begin();
            urn.erase(--urn.end());
            urn.erase(urn.begin());
        }
        cout << cost << '\n';
        urn.clear();
    }
    return 0;
}
