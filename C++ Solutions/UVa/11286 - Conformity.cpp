#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, Max, cont;
    int vec[5];
    string str;
    multiset < string > comb;
    while (cin >> n && n != 0) {
        string frosh[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) cin >> vec[j];
            sort(vec, vec + 5);
            str = "";
            for (int j = 0; j < 5; j++) {
                str += to_string(vec[j]);
            }
            frosh[i] = str;
            comb.insert(str);
        }
        Max = 0, cont = 0;
        for (int i = 0; i < n; i++) {
            Max = max(Max, (int) comb.count(frosh[i]));
        }
        for (int i = 0; i < n; i++) {
            if (comb.count(frosh[i]) == Max) cont++;
        }
        cout << ((cont == 1) ? n : cont) << '\n';
        comb.clear();
    }
    return 0;
}
