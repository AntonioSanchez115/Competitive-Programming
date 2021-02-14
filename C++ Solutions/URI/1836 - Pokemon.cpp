#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    for (int tc = 1; tc <= t; tc++) {
        string name;
        double L, Bs, IV, EV, Hp, S;
        cin >> name >> L;
        cout << "Caso #" << tc << ": " << name << " nivel " << (int) L << '\n';
        cin >> Bs >> IV >> EV;
        Hp = ((IV + Bs + sqrt(EV) / 8 + 50) * L) / 50 + 10;
        cout << "HP: " << (int) Hp << '\n';
        cin >> Bs >> IV >> EV;
        S = ((IV + Bs + sqrt(EV) / 8) * L) / 50 + 5;
        cout << "AT: " << (int) S << '\n';
        cin >> Bs >> IV >> EV;
        cout << "DF: " << (int)(((IV + Bs + sqrt(EV) / 8) * L) / 50 + 5) << '\n';
        cin >> Bs >> IV >> EV;
        cout << "SP: " << (int)(((IV + Bs + sqrt(EV) / 8) * L) / 50 + 5) << '\n';
    }
    return 0;
}
