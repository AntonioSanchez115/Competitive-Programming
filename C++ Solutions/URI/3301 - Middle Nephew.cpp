#include <bits/stdc++.h>
using namespace std;

int main() {
    int h, z, l;
    cin >> h >> z >> l;
    if ((h > z && h < l) || (h > l && h < z)) cout << "huguinho\n";
    if ((z > h && z < l) || (z > l && z < h)) cout << "zezinho\n";
    if ((l > h && l < z) || (l > z && l < h)) cout << "luisinho\n";
    return 0;
}
