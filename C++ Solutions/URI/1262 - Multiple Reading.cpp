#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    int p, i, c;
    while (getline(cin, str) && cin >> p) {
        cin.ignore();
        i = 0, c = 0;
        while (i < str.size()) {
            if (str[i] == 'R') {
                int j = i;
                while (j < str.size() && j < i + p) {
                    if (str[j] == 'W') break;
                    j++;
                }
                c++;
                i = j;
            } else {
                c++;
                i++;
            }
        }
        cout << c << '\n';
    }
    return 0;
}
