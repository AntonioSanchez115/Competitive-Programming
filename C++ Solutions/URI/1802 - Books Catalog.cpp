#include <bits/stdc++.h>
using namespace std;

int main() {
    int p, x, n, sum = 0;
    vector < int > vec[5];
    priority_queue < long long int > ans;
    for (int i = 0; i < 5; i++) {
        cin >> p;
        for (int j = 0; j < p; j++) {
            cin >> x;
            vec[i].push_back(x);
        }
    }
    cin >> n;
    for (int i = 0; i < vec[0].size(); i++)
        for (int j = 0; j < vec[1].size(); j++)
            for (int k = 0; k < vec[2].size(); k++)
                for (int l = 0; l < vec[3].size(); l++)
                    for (int m = 0; m < vec[4].size(); m++)
                        ans.push(vec[0][i] + vec[1][j] + vec[2][k] + vec[3][l] + vec[4][m]);
    while (n--) {
        sum += ans.top();
        ans.pop();
    }
    cout << sum << '\n';
    return 0;
}
