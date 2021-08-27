#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, x;
    cin >> n;
    while (n--) {
        cin >> x;
        cout << ((x > 8000) ? "Mais de 8000!" : "Inseto!") << '\n';
    }
    return 0;
}
