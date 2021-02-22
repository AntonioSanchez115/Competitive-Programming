#include <bits/stdc++.h>
using namespace std;

int main() {
    string seq, str, abc = "abcdefghijklmnopqrstuvwxyz";
    int pos;
    cin >> seq >> str;
    for (int i = 0; i < str.size(); i++) {
        char c = str[i];
        for (int i = 0; i < abc.size(); i++) {
            if (abc[i] == c) {
                pos = i;
                break;
            }
        }
        cout << seq[pos];
    }
    cout << '\n';
    return 0;
}
