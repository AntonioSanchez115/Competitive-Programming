#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, n1, n2;
    string str, one = "one", two = "two";
    cin >> t;
    while (t--) {
        cin >> str;
        if (str.size() == 3) {
            n1 = 0, n2 = 0;
            for (int i = 0; i < 3; i++) {
                if (str[i] == one[i]) n1++;
                if (str[i] == two[i]) n2++;
            }
            cout << ((n1 > n2) ? "1" : "2") << '\n';
        } else {
            cout << "3\n";
        }
    }
    return 0;
}
