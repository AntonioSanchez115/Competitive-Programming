#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, mf;
    string str;
    vector < char > letters;
    cin >> t;
    cin.ignore();
    while (t--) {
        getline(cin, str);
        int vec[91] = {0};
        mf = 0;
        for (int i = 0; i < str.size(); i++)
            if (toupper(str[i]) >= 'A' && toupper(str[i]) <= 'Z') vec[toupper(str[i])]++;
        for (int i = 65; i < 91; i++) mf = max(mf, vec[i]);
        for (int i = 65; i < 91; i++)
            if (vec[i] == mf) letters.push_back((char) tolower(i));
        sort(letters.begin(), letters.end());
        for (int i = 0; i < letters.size(); i++) cout << letters[i];
        cout << '\n';
        letters.clear();
    }
    return 0;
}
