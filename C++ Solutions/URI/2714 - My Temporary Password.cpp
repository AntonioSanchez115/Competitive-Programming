#include <bits/stdc++.h>
using namespace std;

int main() {
    string str, pass;
    int t, it;
    cin >> t;
    while (t--) {
        cin >> str;
        if (str.size() == 20 && str != "RA000000000000000000" && str[0] == 'R' && str[1] == 'A') {
            pass = "";
            it = 2;
            while (str[it] == '0') it++;
            pass = str.substr(it);
            cout << pass << '\n';
        } else {
            cout << "INVALID DATA\n";
        }
    }
    return 0;
}
