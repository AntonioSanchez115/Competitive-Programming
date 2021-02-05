#include <bits/stdc++.h>
using namespace std;

int main() {
  int t, n;
  while (cin >> t >> n && t != 0) {
    int c = 0, x;
    string name;
    for (int i = 0; i < t; i++) {
      cin >> name >> x;
      c += x;
    }
    cout << (n * 3) - c << '\n';
  }
  return 0;
}
