#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    int t, tourists = 0, cars = 0;
    while (cin >> str && str != "ABEND") {
        cin >> t;
        if (str == "SALIDA") {
            cars++;
            tourists += t;
        } else {
            cars--;
            tourists -= t;
        }
    }
    cout << tourists << '\n' << cars << '\n';
    return 0;
}
