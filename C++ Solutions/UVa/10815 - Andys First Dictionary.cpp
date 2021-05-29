#include <bits/stdc++.h>
using namespace std;

bool isAlpha(char c) {
    return ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z')));
}

int main() {
    set < string > dict;
    string text = "", str1, text2 = "";
    while (getline(cin, str1)) {
        text += str1 + " ";
    }
    for (int i = 0; i < text.size(); i++) {
        text2 += ((isAlpha(text[i])) ? text[i] : ' ');
    }
    text = text2;
    transform(text.begin(), text.end(), text.begin(), ::tolower);
    vector < string > vec;
    char str[text.size() + 1];
    strcpy(str, text.c_str());
    char * piece = strtok(str, " ");
    while (piece != NULL) {
        vec.push_back(piece);
        piece = strtok(NULL, " ");
    }
    for (int i = 0; i < vec.size(); i++) {
        dict.insert(vec[i]);
    }
    for (string i: dict) {
        cout << i << '\n';
    }
    return 0;
}
