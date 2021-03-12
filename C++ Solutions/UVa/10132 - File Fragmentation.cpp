#include <bits/stdc++.h>
using namespace std;

multiset < string > matches;
vector < string > pieces;
set < string > newPieces;
string str;
int longest, l;

void solve() {
    for (int i = 0; i < pieces.size(); i++) {
        for (int j = 0; j < pieces.size(); j++) {
            if (i != j) {
                str = pieces[i] + pieces[j];
                matches.insert(str);
                newPieces.insert(str);
            }
        }

    }
    longest = 0;
    for (string i: newPieces) {
        l = matches.count(i);
        longest = max(l, longest);
    }
    for (string i: newPieces) {
        l = matches.count(i);
        if (l == longest) {
            cout << i << '\n';
            break;
        }
    }
}

int main() {
    int tc;
    cin >> tc;
    cin.ignore();
    getline(cin, str);

    for (int t = 0; t < tc; t++) {

        while (getline(cin, str) && str != "") pieces.push_back(str);
        sort(pieces.begin(), pieces.end());
        if (t != 0) cout << '\n';
        solve();
        newPieces.clear();
        matches.clear();
        pieces.clear();
    }
    return 0;
}
