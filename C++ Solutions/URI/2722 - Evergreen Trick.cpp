#include <bits/stdc++.h>
using namespace std;

int main() {
    string s1, s2;
    int t, i, j;
    cin >> t;
    cin.ignore();
    while (t--) {
        getline(cin, s1);
        getline(cin, s2);
        i = 0, j = 0;
        while (j < s2.size()) {
            for (int x = 0; x < 2; x++) {
                cout << s1[i++];
            }
            for (int x = 0; x < 2 && j < s2.size(); x++) {
                cout << s2[j++];
            }
        }
        cout << '\n';
    }
    return 0;
}
