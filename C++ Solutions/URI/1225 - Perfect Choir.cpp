#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    while (cin >> n) {
        int vec[n], sum = 0;
        for (int i = 0; i < n; i++) {
            cin >> vec[i];
            sum += vec[i];
        }
        if (sum % n != 0) cout << "-1\n";
        else {
            int higher = 0;
            sum = sum / n;
            for (int i = 0; i < n; i++)
                if (vec[i] > sum) higher += vec[i] - sum;
            cout << higher + 1 << '\n';
        }
    }
    return 0;
}
