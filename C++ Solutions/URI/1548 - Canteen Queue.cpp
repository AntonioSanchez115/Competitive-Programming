#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int m, d = 0;
        cin >> m;
        int vec[m];
        priority_queue < int > pq;
        for (int i = 0; i < m; i++) {
            cin >> vec[i];
            pq.push(vec[i]);
        }
        for (int i = 0; i < m; i++) {
            if (vec[i] == pq.top()) d++;
            pq.pop();
        }
        cout << d << '\n';
    }
    return 0;
}
