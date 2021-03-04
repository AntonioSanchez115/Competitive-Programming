#include <bits/stdc++.h>
using namespace std;

void solve(int m, int n) {
    map < string, int > mp;
    string job, text, line;
    int value;
    long long sum;
    for (int i = 0; i < m; i++) {
        cin >> job >> value;
        mp.insert( {job, value} );
    }
    for (int i = 0; i < n; i++) {
        text = "";
        sum = 0;
        while (getline(cin, line) && line != ".") {
            text += line + " ";
        }
        vector < string > words;
        char str[text.size() + 1];
        strcpy(str, text.c_str());
        char * piece = strtok(str, " ");
        while (piece != NULL) {
            words.push_back(piece);
            piece = strtok(NULL, " ");
        }
        for (int j = 0; j < words.size(); j++) {
            if (mp.count(words[j]) == 1) {
                auto it = mp.find(words[j]);
                sum += it -> second;
            }
        }
        cout << sum << '\n';
    }
}

int main() {
    int m, n;
    cin >> m >> n;
    solve(m, n);
    return 0;
}
