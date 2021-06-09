#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    string str;
    set < string > dek;
    cin >> n;
    while (n--) {
        cin >> str;
        dek.insert(str);
    }
    cout << "Falta(m) " << 151 - dek.size() << " pomekon(s)." << '\n';
    return 0;
}
