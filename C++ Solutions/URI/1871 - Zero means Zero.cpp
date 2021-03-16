#include <bits/stdc++.h>
using namespace std;

int main() {
    long a, b;
    string str;
    while (cin >> a >> b && (a + b) != 0) {
        str = to_string(a + b);
        for (int i = 0; i < str.size(); i++) if (str[i] != '0') cout << str[i];
        cout << '\n';
    }
    return 0;
}
