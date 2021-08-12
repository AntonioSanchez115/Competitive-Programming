#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    while(cin >> str){
        cout << ((str.size()>=9) ? "palavrao\n" : "palavrinha\n");
    }
    return 0;
}
