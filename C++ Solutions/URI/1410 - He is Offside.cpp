#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, d;
    while (cin >> a >> d && (a + d) != 0) {
        int def[d], Amin = INT_MAX, ax;
        for (int i = 0; i < a; i++) {
            cin >> ax;
            if (ax < Amin) Amin = ax;
        }
        for (int i = 0; i < d; i++) cin >> def[i];
        sort(def, def + d);
        cout << ((def[1] <= Amin) ? "N\n" : "Y\n");
    }
    return 0;
}
