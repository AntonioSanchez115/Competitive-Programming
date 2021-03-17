#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, sum;
    string a, b;
    cin >> t;
    while (t--) {
        sum = 0;
        cin >> a >> b;
        if (a != b) {
            for (int i = 0; i < a.size(); i++) {
                if (a[i] <= b[i]) sum += (int) b[i] - (int) a[i];
                else sum += ((int)'z' - (int) a[i]) + ((int) b[i] - (int)'a' + 1);
            }
        }
        cout << sum << '\n';
    }
    return 0;
}
