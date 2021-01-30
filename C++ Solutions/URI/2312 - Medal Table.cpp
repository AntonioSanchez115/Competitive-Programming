#include <bits/stdc++.h>
using namespace std;

struct nation {
  string name;
  int g;
  int s;
  int b;
};

bool comp(nation a, nation b) {
  if (a.g != b.g) return a.g > b.g;
  if (a.s != b.s) return a.s > b.s;
  if (a.b != b.b) return a.b > b.b;
  return a.name < b.name;
}

int main() {
  int n, G, S, B;
  string name;
  cin >> n;
  vector < nation > vec;
  for (int i = 0; i < n; i++) {
    cin >> name >> G >> S >> B;
    vec.push_back({ name, G, S, B });
  }
  sort(vec.begin(), vec.end(), comp);
  for (int i = 0; i < n; i++) {
    cout << vec[i].name << ' ' << vec[i].g << ' ' << vec[i].s << ' ' << vec[i].b << '\n';
  }
  return 0;
}
