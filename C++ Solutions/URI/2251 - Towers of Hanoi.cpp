#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, t = 1;
  while (cin >> n && n != 0) {
    cout << "Teste " << t++ << '\n' << ((long) pow(2, (double) n)) - 1 << "\n\n";
  }
  return 0;
}
