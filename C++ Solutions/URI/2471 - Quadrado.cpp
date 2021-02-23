#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, sum, maxR = 0, maxC = 0, difRow, difCol, posR, posC;
    int prevNum, num, sumR = 0, sumC = 0, newNum = 1;
    cin >> n;
    int m[n][n];
    int row[n], column[n];

    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) cin >> m[i][j];

    for (int i = 0; i < n; i++) {
        sum = 0;
        for (int j = 0; j < n; j++) sum += m[i][j];
        if (sum > maxR) maxR = sum;
        row[i] = sum;
    }
    for (int i = 0; i < n; i++) {
        sum = 0;
        for (int j = 0; j < n; j++) sum += m[j][i];
        if (sum > maxC) maxC = sum;
        column[i] = sum;
    }

    int numRow[maxR + 1], numCol[maxC + 1];
    for (int i = 0; i <= maxR; i++) numRow[i] = 0;
    for (int i = 0; i <= maxC; i++) numCol[i] = 0;
    for (int i = 0; i < n; i++) numRow[row[i]]++;
    for (int i = 0; i < n; i++) numCol[column[i]]++;

    for (int i = 0; i <= maxR; i++)
        if (numRow[i] == 1) difRow = i;
    for (int i = 0; i <= maxC; i++) {
        if (numCol[i] == 1) difCol = i;
        if (numCol[i] > 1) num = i;
    }

    for (int i = 0; i < n; i++)
        if (row[i] == difRow) posR = i;
    for (int i = 0; i < n; i++)
        if (column[i] == difCol) posC = i;

    prevNum = m[posR][posC];

    for (int i = 0; i < n; i++) {
        if (i != posC) sumR += m[posR][i];
    }
    for (int i = 0; i < n; i++) {
        if (i != posR) sumC += m[i][posC];
    }

    while (newNum <= 10000) {
        if ((sumR + newNum) == num && (sumC + newNum) == num) break;
        newNum++;
    }
    cout << newNum << ' ' << prevNum << '\n';
    return 0;
}
