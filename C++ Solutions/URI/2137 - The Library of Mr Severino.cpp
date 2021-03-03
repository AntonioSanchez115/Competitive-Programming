#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    string str;
    while (cin >> n) {
        vector < string > reg;
        for (int i = 0; i < n; i++) {
            cin >> str;
            reg.push_back(str);
        }
        sort(reg.begin(), reg.end());
        for (int i = 0; i < n; i++) cout << reg[i] << '\n';
    }
    return 0;
}
