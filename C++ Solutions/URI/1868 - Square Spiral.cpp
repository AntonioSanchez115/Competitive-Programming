#include <bits/stdc++.h>
using namespace std;

char M[25][25];

void printM(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) cout << M[i][j];
        cout << '\n';
    }
    cout << "@\n";
}

int main() {
    int n, x, y, maxLimit, minLimit;
    bool right, up, left, down;
    while (cin >> n && n != 0) {
        right = true, up = false, left = false, down = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) M[i][j] = 'O';
        }
        x = n / 2;
        y = n / 2;
        maxLimit = x + 1;
        minLimit = y - 1;
        M[x][y] = 'X';
        while (M[n - 1][n - 1] != 'X') {
            if (x == maxLimit && y == minLimit) maxLimit++, minLimit--;
            printM(n);
            M[x][y] = 'O';
            if (right) {
                y++;
                M[x][y] = 'X';
                if (y == maxLimit) {
                    right = false;
                    up = true;
                    continue;
                }
            }
            if (up) {
                x--;
                M[x][y] = 'X';
                if (x == minLimit) {
                    up = false;
                    left = true;
                    continue;
                }
            }
            if (left) {
                y--;
                M[x][y] = 'X';
                if (y == minLimit) {
                    left = false;
                    down = true;
                    continue;
                }
            }
            if (down) {
                x++;
                M[x][y] = 'X';
                if (x == maxLimit) {
                    down = false;
                    right = true;
                    continue;
                }
            }
        }
        printM(n);
    }
    return 0;
}
