#include <bits/stdc++.h>
using namespace std;

int main() {
    char c, x;
    string txt, word;
    double sum = 0;
    cin >> c;
    cin.ignore();
    getline(cin, txt);

    vector < string > vec;
    char str[txt.size() + 1];
    strcpy(str, txt.c_str());
    char * piece = strtok(str, " ");
    while (piece != NULL) {
        vec.push_back(piece);
        piece = strtok(NULL, " ");
    }
    for (int i = 0; i < vec.size(); i++) {
        word = vec[i];
        for (int j = 0; j < word.size(); j++) {
            if (word[j] == c) {
                sum++;
                break;
            }
        }
    }
    printf("%.1lf\n", (double)(sum / (double) vec.size() * 100.0));
    return 0;
}
