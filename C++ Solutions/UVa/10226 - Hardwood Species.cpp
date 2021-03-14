#include <bits/stdc++.h>
using namespace std;

int main() {
    map < string, double > species;
    string str, aux;
    double n;
    int tc, num;
    cin >> tc;
    cin.ignore();
    getline(cin, str);
    for (int t = 0; t < tc; t++) {
        while (getline(cin, str) && str != "") {
            if (species.empty()) species.insert({str, 1.0});
            else {
                auto it = species.find(str);
                if (it != species.end()) {
                    aux = it -> first;
                    num = it -> second;
                    species.erase(it);
                    species.insert({aux, num + 1.0});
                } else {
                    species.insert({str, 1.0});
                }
            }
        }
        n = 0.0;
        for (auto i = species.begin(); i != species.end(); ++i) n += i -> second;
        if (t != 0) cout << '\n';
        for (auto i = species.begin(); i != species.end(); ++i) {
            cout << i -> first;
            printf(" %.4lf\n", i -> second / n * 100.0);
        }
        species.clear();
    }
    return 0;
}
