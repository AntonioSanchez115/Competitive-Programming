#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        string str;
        cin >> str;
        int sum = 0;
        if (tolower(str[0]) == 'a' || tolower(str[0]) == 'e' || tolower(str[0]) == 'i' || tolower(str[0]) == 'o' || tolower(str[0]) == 's') sum = 3;
        else sum = 2;
        for (int i = 1; i < str.size(); i++) {
            if (tolower(str[i]) == 'a' || tolower(str[i]) == 'e' || tolower(str[i]) == 'i' || tolower(str[i]) == 'o' || tolower(str[i]) == 's') sum *= 3;
            else sum *= 2;
        }
        cout << sum << '\n';
    }
    return 0;
}
