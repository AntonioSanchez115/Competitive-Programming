#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    string r, s;
    cin >> t;
    while (t--) {
        cin >> r >> s;
        if (r == s) cout << "empate";
        else {
            if (r == "pedra") {
                if (s == "papel") cout << "sheldon";
                if (s == "tesoura") cout << "rajesh";
                if (s == "lagarto") cout << "rajesh";
                if (s == "spock") cout << "sheldon";
            }
            if (r == "papel") {
                if (s == "pedra") cout << "rajesh";
                if (s == "tesoura") cout << "sheldon";
                if (s == "lagarto") cout << "sheldon";
                if (s == "spock") cout << "rajesh";
            }
            if (r == "tesoura") {
                if (s == "papel") cout << "rajesh";
                if (s == "pedra") cout << "sheldon";
                if (s == "lagarto") cout << "rajesh";
                if (s == "spock") cout << "sheldon";
            }
            if (r == "lagarto") {
                if (s == "papel") cout << "rajesh";
                if (s == "tesoura") cout << "sheldon";
                if (s == "pedra") cout << "sheldon";
                if (s == "spock") cout << "rajesh";
            }
            if (r == "spock") {
                if (s == "papel") cout << "sheldon";
                if (s == "tesoura") cout << "rajesh";
                if (s == "lagarto") cout << "sheldon";
                if (s == "pedra") cout << "rajesh";
            }
        }
        cout << '\n';
    }
    return 0;
}
