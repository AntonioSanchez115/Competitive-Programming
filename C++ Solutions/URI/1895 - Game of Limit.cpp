#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, t, l, a = 0, b = 0, x;
  cin >> n >> t >> l;
  for (int i = 0; i < n - 1; i++) {
    cin >> x;
    if (abs(x - t) <= l) {
      if (i % 2 == 0) a += (abs(x - t));
      else b += (abs(x - t));
      t = x;
    }
  }
  cout << a << ' ' << b << '\n';
  return 0;
}
