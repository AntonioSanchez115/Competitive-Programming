#include <bits/stdc++.h>
using namespace std;

int main() {
  int x, stage = 1;
  vector < int > vec, vec2;
  bool found = false;
  for (int i = 0; i < 16; i++) {
    cin >> x;
    vec.push_back(x);
  }
  for (int i = 0; i < 16; i += 2) {
    if ((vec[i] == 1 && vec[i + 1] == 9) || (vec[i] == 9 && vec[i + 1] == 1)) found = true;
    else if (vec[i + 1] == 1 || vec[i + 1] == 9) vec2.push_back(vec[i + 1]);
    else vec2.push_back(vec[i]);
  }
  vec.clear();
  if (!found) {
    for (int i = 0; i < 8; i += 2) {
      if ((vec2[i] == 1 && vec2[i + 1] == 9) || (vec2[i] == 9 && vec2[i + 1] == 1)) {
        found = true;
        stage = 2;
      } else if (vec2[i + 1] == 1 || vec2[i + 1] == 9) vec.push_back(vec2[i + 1]);
      else vec.push_back(vec2[i]);
    }
  }
  vec2.clear();
  if (!found) {
    for (int i = 0; i < 4; i += 2) {
      if ((vec[i] == 1 && vec[i + 1] == 9) || (vec[i] == 9 && vec[i + 1] == 1)) {
        found = true;
        stage = 3;
      } else if (vec[i + 1] == 1 || vec[i + 1] == 9) vec2.push_back(vec[i + 1]);
      else vec2.push_back(vec[i]);
    }
  }
  if (!found) stage = 4;
  if (stage == 1) cout << "oitavas\n";
  if (stage == 2) cout << "quartas\n";
  if (stage == 3) cout << "semifinal\n";
  if (stage == 4) cout << "final\n";
  return 0;
}
