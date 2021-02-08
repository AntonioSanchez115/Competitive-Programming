#include <bits/stdc++.h>
using namespace std;

int main() {
  int t;
  cin >> t;
  while (t--) {
    int n, m, x, w = -1;
    cin >> n >> m;
    int cand[n + 1];
    for (int i = 0; i < n + 1; i++) cand[i] = 0;
    for (int i = 0; i < m; i++) {
      cin >> x;
      cand[x]++;
    }
    for (int i = 1; i < n + 1; i++) {
      if (cand[i] > m / 2.0) w = i;
    }
    cout << w << '\n';
  }
  return 0;
}
