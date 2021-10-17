#include <bits/stdc++.h>
using namespace std;

int main() {
    string str, s1 = "", s2 = "";
    cin >> str;
    for (int i = str.find('.') + 1; i < str.size(); i++) s1 += str[i];
    for (int i = 0; i < str.find('.'); i++) s2 += str[i];
    cout << stoi(s1) << '.' << stoi(s2) << '\n';
    return 0;
}
