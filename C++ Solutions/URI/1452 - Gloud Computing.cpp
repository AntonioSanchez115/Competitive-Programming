#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, x, connections = 0;
    string z;
    bool conex;
    while (cin >> n >> m && n + m != 0) {
        connections = 0;
        map < string, string > server[n];
        map < string, string > client[m];
        for (int i = 0; i < n; i++) {
            cin >> x;
            for (int j = 0; j < x; j++) {
                cin >> z;
                server[i].insert({z, z});
            }
        }
        for (int i = 0; i < m; i++) {
            cin >> x;
            for (int j = 0; j < x; j++) {
                cin >> z;
                client[i].insert({z, z});
            }
        }
        for (int i = 0; i < m; i++) { //travel all clients
            conex = false;
            for (int j = 0; !conex && j < n; j++) { //travel all servers
                for (auto s: server[j]) { //travel all services
                    if (conex) continue;
                    if (client[i].find(s.first) != client[i].end()) {
                        connections++;
                        conex = true;
                    }
                }
                conex = false;
            }
        }
        cout << connections << '\n';
    }
    return 0;
}
