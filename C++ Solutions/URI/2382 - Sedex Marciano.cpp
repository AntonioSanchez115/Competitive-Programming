#include <bits/stdc++.h>
using namespace std;

int main() {
    double L, A, P, R;
    cin >> L >> A >> P >> R;
    cout << (((sqrt((pow(L, 2)) + (pow(A, 2)) + (pow(P, 2)))) <= (R * 2)) ? "S\n" : "N\n");
    return 0;
}
