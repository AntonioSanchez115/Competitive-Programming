#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, sum;
    string str;
    cin >> n;
    while (n--) {
        cin >> str;
        for (int i = 0; i < str.size(); i++) {
            if (!(str[i] >= '0' && str[i] <= '9')) str[i] = ' ';
        }
        vector < string > vec;
        char str1[str.size() + 1];
        strcpy(str1, str.c_str());
        char * piece = strtok(str1, " ");
        while (piece != NULL) {
            vec.push_back(piece);
            piece = strtok(NULL, " ");
        }
        sum = 0;
        for (string s: vec) sum += stoi(s);
        cout << sum << '\n';
    }
    return 0;
}
