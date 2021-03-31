#include <bits/stdc++.h>
using namespace std;

int main() {
    string s1, s2;
    bool fit;
    int t;
    cin >> t;
    while(t--){
        cin >> s1 >> s2;
        if(s2.size() > s1.size()) cout << "nao encaixa\n";
        else{
            fit = true;
            for(int i=s2.size()-1, j=s1.size()-1; i >= 0 ; i--,j--) if(s2[i] != s1[j]) fit = false;
            cout << ((fit) ? "encaixa" : "nao encaixa") << '\n';
        }
    }
    return 0;
}
