#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    while(cin >> str){
        for(int i=0;i<3;i++) cout << str[i];
        cout << '\n';
        for(int i=4;i<7;i++) cout << str[i];
        cout << '\n';
        for(int i=8;i<11;i++) cout << str[i];
        cout << '\n';
        for(int i=12;i<14;i++) cout << str[i];
        cout << '\n';
    }
    return 0;
}
