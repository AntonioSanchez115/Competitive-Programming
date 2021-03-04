#include <bits/stdc++.h>
using namespace std;

int main() {
    int h1, h2, m1, m2, minute, currentMinute, finalMinute;
    while (cin >> h1 >> m1 >> h2 >> m2 && (h1 + h2 + m1 + m2) != 0) {
        minute = 0, currentMinute = (h1 * 60) + m1, finalMinute = (h2 * 60) + m2;
        while (true) {
            if (currentMinute == finalMinute) break;
            if (currentMinute == 1440) currentMinute = 0;
            currentMinute++;
            minute++;
        }
        cout << minute << '\n';
    }
    return 0;
}
