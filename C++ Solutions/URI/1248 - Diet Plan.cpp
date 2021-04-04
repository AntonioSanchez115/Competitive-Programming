#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    bool cheat;
    string diet, brek, lunch;
    cin >> t;
    cin.ignore();
    while (t--) {
        cheat = false;
        getline(cin, diet);
        getline(cin, brek);
        getline(cin, lunch);
        for (int i = 0; i < brek.size(); i++) {
            if (diet.find(brek[i]) != string::npos) diet.erase(diet.begin() + (diet.find(brek[i])));
            else cheat = true;
        }
        for (int i = 0; i < lunch.size(); i++) {
            if (diet.find(lunch[i]) != string::npos) diet.erase(diet.begin() + (diet.find(lunch[i])));
            else cheat = true;
        }
        if (cheat) cout << "CHEATER\n";
        else {
            sort(diet.begin(), diet.end());
            cout << diet << '\n';
        }
    }
    return 0;
}
