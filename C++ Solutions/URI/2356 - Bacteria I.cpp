#include <bits/stdc++.h>
using namespace std;

int main() {
    string D, S;
    while (cin >> D >> S) {
        cout << ((D.find(S) != string::npos) ? "Resistente" : "Nao resistente") << '\n';
    }
    return 0;
}
