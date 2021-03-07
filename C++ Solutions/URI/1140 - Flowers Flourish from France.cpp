#include <bits/stdc++.h>
using namespace std;

bool tauto(string s) {
    vector < string > vec;
    char str[s.size() + 1];
    strcpy(str, s.c_str());
    char * piece = strtok(str, " ");
    while (piece != NULL) {
        vec.push_back(piece);
        piece = strtok(NULL, " ");
    }
    char first = tolower(vec[0][0]);
    for (int i = 0; i < vec.size(); i++) {
        if (tolower(vec[i][0]) != first) return false;
    }
    return true;
}

int main() {
    string str;
    while (getline(cin, str) && str[0] != '*') {
        cout << ((tauto(str)) ? "Y\n" : "N\n");
    }
    return 0;
}
