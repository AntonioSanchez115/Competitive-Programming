#include <bits/stdc++.h>
using namespace std;

int start[25], fin[25];

int lookPos(int n, int x) {
    for (int i = 0; i < n; i++) {
        if (start[i] == fin[x]) return i;
    }
}

int main() {
    int n, tmp, swaps;
    while (cin >> n) {
        for (int i = 0; i < n; i++) cin >> start[i];
        for (int i = 0; i < n; i++) cin >> fin[i];
        swaps = 0;
        for (int i = 0; i < n; i++) {
            while (start[i] != fin[i]) {
                tmp = lookPos(n, i);
                swap(start[tmp - 1], start[tmp]);
                swaps++;
            }
        }
        cout << swaps << '\n';
    }
    return 0;
}
