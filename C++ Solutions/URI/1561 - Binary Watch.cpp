#include <bits/stdc++.h>
using namespace std;

int main() {
  int a, b;
  char ch;
  while (cin >> a >> ch >> b) {
    int hour[4], minute[6];
    for (int i = 0; i < 4; i++) hour[i] = 0;
    for (int i = 0; i < 6; i++) minute[i] = 0;
    for (int i = 0; a > 0; i++) {
      hour[i] = a % 2;
      a /= 2;
    }
    for (int i = 0; b > 0; i++) {
      minute[i] = b % 2;
      b /= 2;
    }
    cout << " ____________________________________________\n";
    cout << "|                                            |\n";
    cout << "|    ____________________________________    |_\n";
    cout << "|   |                                    |   |_)\n";
    cout << "|   |   8         4         2         1  |   |\n";
    cout << "|   |                                    |   |\n";
    cout << "|   |   ";
    for (int i = 3; i >= 0; i--) {
      cout << ((hour[i] == 1) ? "o" : " ");
      if (i != 0) cout << "         ";
    }
    cout << "  |   |\n";
    cout << "|   |                                    |   |\n";
    cout << "|   |                                    |   |\n";
    cout << "|   |   ";
    for (int i = 5; i >= 0; i--) {
      cout << ((minute[i] == 1) ? "o" : " ");
      if (i != 0) cout << "     ";
    }
    cout << "  |   |\n";
    cout << "|   |                                    |   |\n";
    cout << "|   |   32    16    8     4     2     1  |   |_\n";
    cout << "|   |____________________________________|   |_)\n";
    cout << "|                                            |\n";
    cout << "|____________________________________________|\n";
    cout << "\n";
  }
  return 0;
}
