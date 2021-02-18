#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int g, p, s, k;
    while (cin >> g >> p && g + p != 0) {
        int m[g][p];
        for (int i = 0; i < g; i++)
            for (int j = 0; j < p; j++) cin >> m[i][j];
        cin >> s;
        priority_queue < int, vector < int > , greater < int > > winner;
        for (int i = 0; i < s; i++) {
            cin >> k;
            int points[k], scores[p];
            for (int j = 0; j < p; j++) scores[j] = 0;
            for (int j = 0; j < k; j++) cin >> points[j];
            for (int a = 0; a < g; a++) {
                for (int b = 0; b < k; b++) {
                    int point = points[b];
                    for (int c = 0; c < p; c++) {
                        if (m[a][c] == b + 1) scores[c] += point;
                    }

                }
            }
            int higher = 0;
            for (int j = 0; j < p; j++) {
                if (scores[j] > higher) higher = scores[j];
            }
            for (int j = 0; j < p; j++) {
                if (scores[j] == higher) winner.push(j + 1);
            }
            cout << winner.top();
            winner.pop();
            while (!winner.empty()) {
                cout << ' ' << winner.top();
                winner.pop();
            }
            cout << '\n';
        }
    }
    return 0;
}
