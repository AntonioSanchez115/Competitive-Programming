#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, d;
  while (cin >> n >> d && (n + d) != 0) {
    int m[d][n];
    bool all;
    for (int i = 0; i < d; i++) {
        for (int j = 0; j < n; j++) cin >> m[i][j];
    }
    for (int i = 0; i < n; i++) {
        all = true;
        for (int j = 0; j < d; j++) if (m[j][i] == 0) all = false;
        if (all) break;
    }
    cout << ((all) ? "yes\n" : "no\n");
  }
  return 0;
}
