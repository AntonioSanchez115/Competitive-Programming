#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    bool body = false;
    while (getline(cin, str) && str != "</html>") {
        if (str == "    </body>") body = false;
        if (body) {
            cout << str << '\n';
        }
        if (str == "    <body>") body = true;
    }
    return 0;
}
