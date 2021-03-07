#include <bits/stdc++.h>
using namespace std;

int main() {
    int x;
    multiset < int > ms;
    vector < int > vec;
    while (cin >> x) {
        ms.insert(x);
        vec.push_back(x);
    }
    for (auto i: vec) {
        if (ms.find(i) != ms.end()) {
            cout << i << ' ' << ms.count(i) << '\n';
            ms.erase(i);
        }
    }
    return 0;
}
