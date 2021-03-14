#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    int c, a, b, i;
    cin >> c;
    while (c--) {
        a = 0, b = 0, i = 0;
        cin >> str;
        while (str[i] != 'm') if (str[i++] == 'a') a++;
        while (i < str.size()) if (str[i++] == 'a') b++;
        cout << 'k';
        for (int i = 0; i < (a * b); i++) cout << 'a';
        cout << '\n';
    }
    return 0;
}
