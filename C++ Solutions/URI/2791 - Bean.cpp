#include <bits/stdc++.h>
using namespace std;

int main() {
    int vec[4] = {0};
    for (int i = 0; i < 4; i++) cin >> vec[i];
    for (int i = 0; i < 4; i++)
        if (vec[i]) cout << i + 1 << '\n';
    return 0;
}
