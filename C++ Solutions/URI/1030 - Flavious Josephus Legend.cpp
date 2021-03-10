#include <bits/stdc++.h>
using namespace std;

int main() {
    int nc, n, k, it;
    vector < int > vec;
    cin >> nc;
    for (int t = 1; t <= nc; t++) {
        cin >> n >> k;
        for (int i = 0; i < n; i++) vec.push_back(i);
        it = 0;
        while (vec.size() > 1) {
            for (int i = 1; i < k; i++) {
                if (it == vec.size()) it = 0;
                it++;
            }
            if (it == vec.size()) it = 0;
            vec.erase(vec.begin() + it);
        }
        cout << "Case " << t << ": " << vec[0] + 1 << '\n';
        vec.clear();
    }
    return 0;
}
