#include <bits/stdc++.h>
using namespace std;

int main() {
    set<string> db;
    int t;
    string mail, aux;
    cin >> t;
    while(t--){
        aux = "";
        cin >> mail;
        for(int i=0;mail[i] != '@';i++) if(mail[i] != '.') aux += mail[i];
        mail = aux + mail.substr(mail.find_first_of("@"));
        aux = "";
        for(int i=0;mail[i] != '+' && mail[i] != '@';i++) aux += mail[i];
        mail = aux + mail.substr(mail.find_first_of("@"));
        db.insert(mail);
    }
    cout << db.size() << '\n';
    return 0;
}
