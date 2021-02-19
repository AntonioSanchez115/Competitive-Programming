#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int a, t;
    set < int > randomNumbers;
    while (cin >> a && a != 0) {
        t = 112;
        while (t--) {
            randomNumbers.insert(a);
            a *= a;
            string num = to_string(a);
            for (int i = num.size(); i < 8; i++) num.insert(0, "0");
            string subs = num.substr(2, 4);
            a = stoi(subs);
        }
        cout << randomNumbers.size() << '\n';
        randomNumbers.clear();
    }
    return 0;
}
