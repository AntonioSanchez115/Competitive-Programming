#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    bool flag;
    while (getline(cin, str)) {
        flag = true;
        for (int i = 0; i < str.size(); i++) {
            if (str[i] != ' ') {
                if (flag) {
                    cout << (char) toupper(str[i]);
                    flag = false;
                } else {
                    cout << (char) tolower(str[i]);
                    flag = true;
                }
            } else {
                cout << ' ';
            }
        }
        cout << '\n';
    }
    return 0;
}
