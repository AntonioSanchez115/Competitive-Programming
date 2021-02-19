#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int At, Ad, Bt, Bd, h, time = 0;
        string winner;
        cin >> At >> Ad >> Bt >> Bd >> h;
        while (true) {
            if (time % Ad == 0) h -= At;
            if (h <= 0) {
                winner = "Andre";
                break;
            }
            if (time % Bd == 0) h -= Bt;
            if (h <= 0) {
                winner = "Beto";
                break;
            }
            time++;
        }
        cout << winner << '\n';
    }
    return 0;
}
