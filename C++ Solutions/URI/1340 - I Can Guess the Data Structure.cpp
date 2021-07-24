#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, t, x;
    while (cin >> n) {
        priority_queue <int> pq;
        queue <int> q;
        stack <int> s;
        bool isPrior = true, isQueue = true, isStack = true;
        while (n--) {
            cin >> t >> x;
            if (t == 1) {
                pq.push(x);
                q.push(x);
                s.push(x);
            } else {
                if (pq.top() != x) isPrior = false;
                if (q.front() != x) isQueue = false;
                if (s.top() != x) isStack = false;
                pq.pop();
                q.pop();
                s.pop();
            }
        }
        if (((int) isPrior + (int) isQueue + (int) isStack) > 1) cout << "not sure\n";
        else if (isPrior) cout << "priority queue\n";
        else if (isQueue) cout << "queue\n";
        else if (isStack) cout << "stack\n";
        else cout << "impossible\n";
    }
    return 0;
}
