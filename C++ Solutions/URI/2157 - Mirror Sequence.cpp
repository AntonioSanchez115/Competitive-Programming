#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    int t, a, b;
    cin >> t;
    while (t--) {
        str = "";
        cin >> a >> b;
        for (int i = a; i <= b; i++) str += to_string(i);
        cout << str;
        for (int i = str.size() - 1; i >= 0; i--) cout << str[i];
        cout << '\n';
    }
    return 0;
}
