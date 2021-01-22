#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, k;
  while (cin >> n && n != 0) {
    int vec[n + 1];
    for (int i = 1; i <= n; i++) cin >> vec[i];
    cin >> k;
    while (vec[k] != k) k = vec[k];
    cout << k << '\n';
  }
  return 0;
}
