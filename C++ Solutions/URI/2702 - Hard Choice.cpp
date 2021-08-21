#include <bits/stdc++.h>
using namespace std;

int main() {
    int c, b, p, p1, p2, p3, sum = 0;
    cin >> c >> b >> p;
    cin >> p1 >> p2 >> p3;
    sum += (p1 > c) ? (p1 - c) : 0;
    sum += (p2 > b) ? (p2 - b) : 0;
    sum += (p3 > p) ? (p3 - p) : 0;
    cout << sum << '\n';
    return 0;
}
