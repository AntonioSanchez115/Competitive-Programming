#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  int n, m;
  while (cin >> n >> m) {
    int c = 0;
    for (int i = n; i <= m; i++) {
      int digits[11], num = i;
      for (int j = 0; j < 11; j++) digits[j] = 0;
      while (num > 0) {
        digits[(num % 10)]++;
        num /= 10;
      }
      bool rep = false;
      for (int j = 0; j < 11; j++)
        if (digits[j] > 1) rep = true;
      if (!rep) c++;
    }
    cout << c << '\n';
  }
  return 0;
}
