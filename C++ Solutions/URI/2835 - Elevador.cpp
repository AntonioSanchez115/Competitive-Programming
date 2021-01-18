#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, a, b = 0;
  cin >> n;
  int vec[n];
  bool possible = true;
  for (int i = 0; i < n; i++) cin >> vec[i];
  sort(vec, vec + n);
  for (int i = 0; i < n; i++) {
    a = vec[i];
    if (a - b > 8) possible = false;
    b = a;
  }
  cout << ((possible) ? "S\n" : "N\n");
  return 0;
}
