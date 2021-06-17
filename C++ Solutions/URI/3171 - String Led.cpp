#include <bits/stdc++.h>>
using namespace std;

int main() {
    int n, l, a, b, x = 0, sum = 0;
    cin >> n >> l;
    int arr[n];
    memset(arr, 0, sizeof(arr));
    for (int i = 0; i < l; i++) {
        cin >> a >> b;
        arr[a - 1]++;
        arr[b - 1]--;
    }
    while (x < n - 1) {
        sum += arr[x++];
        if (sum == 0) break;
    }
    cout << ((x == n - 1) ? "COMPLETO" : "INCOMPLETO") << '\n';
    return 0;
}
