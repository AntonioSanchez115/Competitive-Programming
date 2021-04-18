#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    string str;
    cin >> t;
    while (t--) {
        cin >> str;
        for (int i = str.size() - 1; i >= 0; i--) {
            if (str[i] >= 'a' && str[i] <= 'z') cout << str[i];
        }
        cout << '\n';
    }
    return 0;
}
