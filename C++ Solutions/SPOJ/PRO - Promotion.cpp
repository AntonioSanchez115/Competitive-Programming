#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    long n, k, r, s, l, sum = 0;
    multiset < long > v;
    multiset < long > ::iterator it;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> k;
        for (int j = 0; j < k; j++) {
            cin >> r;
            v.insert(r);
        }
        l = * v.rbegin();
        s = * v.begin();
        it = v.begin();
        v.erase(it);
        it = v.end();
        it--;
        v.erase(it);
        sum += l - s;
    }
    cout << sum << '\n';
    return 0;
}
