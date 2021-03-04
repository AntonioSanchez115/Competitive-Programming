#include <bits/stdc++.h>
using namespace std;

int main() {
    string name;
    double dist, total = 0, n = 0;
    while (getline(cin, name)) {
        cin >> dist;
        total += dist;
        n++;
        cin.ignore();
    }
    printf("%.1lf\n", total / n);
    return 0;
}
