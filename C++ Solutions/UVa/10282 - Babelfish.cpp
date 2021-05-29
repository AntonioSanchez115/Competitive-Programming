#include <bits/stdc++.h>
using namespace std;

int main() {
    map < string, string > dict;
    string str, str1, str2;
    while (getline(cin, str) && str != "") {
        int i = 0;
        str1 = "", str2 = "";
        while (str[i] != ' ') str1 += str[i++];
        i++;
        while (i < str.size()) str2 += str[i++];
        dict.insert({ str2, str1 });
    }
    while (getline(cin, str)) {
        auto it = dict.find(str);
        if (it != dict.end()) cout << it -> second << '\n';
        else cout << "eh\n";
    }
    return 0;
}
