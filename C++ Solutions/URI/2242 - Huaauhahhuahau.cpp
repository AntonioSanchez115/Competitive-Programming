#include <bits/stdc++.h>
using namespace std;

int main() {
    string str = "", str0;
    bool palind = true;
    cin >> str0;
    for (int i = 0; i < str0.size(); i++) if (str0[i] == 'a' || str0[i] == 'e' || str0[i] == 'i' || str0[i] == 'o' || str0[i] == 'u') str += str0[i];
    for (int i = 0, j = str.size() - 1; i < str.size() / 2; i++, j--) if (str[i] != str[j]) palind = false;
    cout << ((palind) ? "S" : "N") << '\n';
    return 0;
}
