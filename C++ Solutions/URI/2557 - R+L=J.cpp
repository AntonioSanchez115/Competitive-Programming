#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c;
    string exp, sa, sb, sc;
    while (cin >> exp) {
        sa = exp.substr(0, exp.find('+'));
        sb = exp.substr(exp.find('+') + 1, exp.find('=') - (exp.find('+') + 1));
        sc = exp.substr(exp.find('=') + 1);
        if (sa[0] >= 'A' && sa[0] <= 'Z') {
            cout << stoi(sc) - stoi(sb) << '\n';
        } else if (sb[0] >= 'A' && sb[0] <= 'Z') {
            cout << stoi(sc) - stoi(sa) << '\n';
        } else {
            cout << stoi(sa) + stoi(sb) << '\n';
        }
    }
    return 0;
}
