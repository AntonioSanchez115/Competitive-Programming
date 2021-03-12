#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, b, sg, sb, x, les, lemG, lemB;
    multiset < int > green, blue;
    vector < int > resGreen, resBlue;
    cin >> n;
    for (int c = 0; c < n; c++) {
        cin >> b >> sg >> sb;
        for (int i = 0; i < sg; i++) {
            cin >> x;
            green.insert(x);
        }
        for (int i = 0; i < sb; i++) {
            cin >> x;
            blue.insert(x);
        }
        while (!green.empty() && !blue.empty()) {
            les = min(green.size(), blue.size());
            for (int i = 0; (i < b && i < les) ; i++) {
                lemG = * green.rbegin();
                lemB = * blue.rbegin();
                green.erase(--green.end());
                blue.erase(--blue.end());
                if (lemG > lemB) {
                    resGreen.push_back(lemG - lemB);
                    resBlue.push_back(0);
                } else if (lemG < lemB) {
                    resGreen.push_back(0);
                    resBlue.push_back(lemB - lemG);
                } else {
                    resGreen.push_back(0);
                    resBlue.push_back(0);
                }
            }
            for (int i = 0; i < resGreen.size(); i++) {
                if (resGreen[i] != 0) green.insert(resGreen[i]);
                if (resBlue[i] != 0) blue.insert(resBlue[i]);
            }
            resGreen.clear();
            resBlue.clear();
        }
        if (c != 0) cout << '\n';
        if (green.empty() && blue.empty()) cout << "green and blue died\n";
        else if (green.empty()) {
            cout << "blue wins\n";
            for (auto rit = blue.rbegin(); rit != blue.rend(); rit++) cout << * rit << '\n';
        } else {
            cout << "green wins\n";
            for (auto rit = green.rbegin(); rit != green.rend(); rit++) cout << * rit << '\n';
        }
        green.clear();
        blue.clear();
    }
    return 0;
}
