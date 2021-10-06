#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, m, n, b, c, k, x, cost;
    string binder, str, name;
    cin >> t;
    while (t--) {
        map < string, int > ingred;
        multiset < pair < int, string >> cakes;
        cin.ignore();
        getline(cin, binder);
        cin >> m >> n >> b;
        for (int i = 0; i < m; i++) {
            cin >> str >> c;
            ingred.insert({str, c});
        }
        for (int i = 0; i < n; i++) {
            cost = 0;
            cin.ignore();
            getline(cin, name);
            cin >> k;
            for (int j = 0; j < k; j++) {
                cin >> str >> x;
                auto it = ingred.find(str);
                cost += (x * it -> second);
            }
            if (cost <= b) cakes.insert({cost, name});
        }
        transform(binder.begin(), binder.end(), binder.begin(), ::toupper);
        cout << binder << '\n';
        if (!cakes.empty()) {
            for (auto i = cakes.begin(); i != cakes.end(); ++i) {
                cout << i -> second << '\n';
            }
        } else {
            cout << "Too expensive!\n";
        }
        cout << '\n';
        cakes.clear();
        ingred.clear();
    }
    return 0;
}
