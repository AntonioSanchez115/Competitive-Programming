#include <bits/stdc++.h>
using namespace std;

int main() {
    double a, g, ra, rg;
    cin >> a >> g >> ra >> rg;
    if (a == g && ra == rg) cout << "G\n";
    else if (a == g) cout << ((ra > rg) ? "A\n" : "G\n");
    else if (ra == rg) cout << ((a < g) ? "A\n" : "G\n");
    else cout << (((ra / a) > (rg / g)) ? "A\n" : "G\n");
    return 0;
}
