#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;
    double sum = 0.0, n = 0;
    for (int i = s.size() - 1; i >= 0; i--) {
        if (s[i] != '0') sum += s[i] - '0';
        else {
            sum += 10;
            i--;
        }
        n++;
    }
    printf("%.2lf\n", sum / n);
    return 0;
}
