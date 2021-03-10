#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, t = 1;
    while (cin >> n && n != 0) {
        cin.ignore();
        vector < string > txt;
        string line, newLine;
        int maxL = 0, s;

        for (int i = 0; i < n; i++) {

            getline(cin, line);
            vector < string > vec;
            char str[line.size() + 1];
            strcpy(str, line.c_str());
            char * piece = strtok(str, " ");
            while (piece != NULL) {
                vec.push_back(piece);
                piece = strtok(NULL, " ");
            }

            newLine = vec[0];
            for (int j = 1; j < vec.size(); j++) newLine += " " + vec[j];
            txt.push_back(newLine);
            s = newLine.size();
            maxL = max(s, maxL);
        }

        if (t != 1) cout << '\n';
        for (int i = 0; i < txt.size(); i++) {
            for (int j = 0; j < maxL - txt[i].size(); j++) cout << ' ';
            cout << txt[i] << '\n';
        }
        t++;

    }
    return 0;
}
