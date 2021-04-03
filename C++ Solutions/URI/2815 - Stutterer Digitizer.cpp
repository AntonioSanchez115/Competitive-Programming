#include <bits/stdc++.h>
using namespace std;

bool repeated(string str) {
    return (str[0] == str[2] && str[1] == str[3]);
}
int main() {
    string text, aux;
    getline(cin, text);

    vector < string > vec;
    char str[text.size() + 1];
    strcpy(str, text.c_str());
    char * piece = strtok(str, " ");
    while (piece != NULL) {
        vec.push_back(piece);
        piece = strtok(NULL, " ");
    }

    for (int i = 0; i < vec.size(); i++) {
        if (i != 0) cout << ' ';
        if (repeated(vec[i])) {
            aux = vec[i].substr(2);
            cout << aux;
        } else {
            cout << vec[i];
        }
    }
    cout << '\n';
    return 0;
}
