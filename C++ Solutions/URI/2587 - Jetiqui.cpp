#include <bits/stdc++.h>
using namespace std;

int main() {
    string s1, s2, str;
    int t, i1, i2, i;
    cin >> t;
    while (t--) {
        cin >> s1 >> s2 >> str;
        i = 0;
        i1 = -1, i2 = -1;
        while (i1 == -1) {
            if (str[i++] == '_') i1 = i - 1;
        }
        while (i2 == -1) {
            if (str[i++] == '_') i2 = i - 1;
        }
        cout << (((s1[i1] == s2[i2]) || (s2[i1] == s1[i2]) || (s1[i1] == s1[i2]) || (s2[i1] == s2[i2])) ? "Y\n" : "N\n");
    }
    return 0;
}
