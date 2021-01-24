#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  int n, k, x, y;
  queue < int > q;
  cin >> n >> k;
  int aux[n], m[n][n];
  for (int i = 0; i < n; i++) cin >> aux[i];
  for (int i = n - 1; i >= 0; i--) q.push(aux[i]);
  for (int i = 0; i < n; i++) {
    aux[i] = 0;
    for (int j = 0; j < n; j++) m[i][j] = 0;
  }
  for (int i = 0; i < n; i++) {
    for (int j = n - 1; j >= 0; j--) {
      m[i][j] = q.front();
      q.push(q.front());
      q.pop();
    }
    q.push(q.front());
    q.pop();
  }
  for (int i = 0; k--; i++) {
    if (i == n) i = 0;
    for (int j = 0; j < n; j++) aux[j] += m[i][j];
  }
  for (int i = 0; i < n; i++) {
    if (i == 0) cout << aux[i];
    else cout << ' ' << aux[i];
  }
  cout << '\n';
  return 0;
}
