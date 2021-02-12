#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    while (cin >> str) {
        int b1 = 0, b2 = 0;
        for (int i = 0; i < 9; i++) {
            cout << str[i];
            if ((i + 1) % 3 == 0 && i != 8) cout << '.';
        }
        cout << '-';
        for (int i = 1; i <= 9; i++) b1 += (str[i - 1] - '0') * i;
        cout << ((b1 % 11 != 10) ? (b1 % 11) : 0);
        for (int i = 9; i >= 1; i--) b2 += (str[9 - i] - '0') * i;
        cout << ((b2 % 11 != 10) ? (b2 % 11) : 0);
        cout << '\n';
    }
    return 0;
}
