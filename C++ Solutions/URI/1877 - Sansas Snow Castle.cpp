#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, k, p = 0, v = 0;
  cin >> n >> k;
  int vec[n];
  for (int i = 0; i < n; i++) cin >> vec[i];
  bool up = true;
  for (int i = 1; i < n; i++) {
    if (up) {
      if (vec[i] < vec[i - 1]) {
        p++;
        up = false;
      }
    } else {
      if (vec[i] > vec[i - 1]) {
        v++;
        up = true;
      }
    }
  }
  cout << ((p == k && v == k - 1) ? "beautiful\n" : "ugly\n");
  return 0;
}
