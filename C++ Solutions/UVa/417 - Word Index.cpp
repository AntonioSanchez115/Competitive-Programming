#include <bits/stdc++.h>
using namespace std;

queue < string > validWords;
map < string , int > mp;

void generateWords(){
    for(char c = 'a' ; c <= 'z' ; c++) validWords.push(string(1,c));
    string str;
    int index = 1;
    while(!validWords.empty()){
        str = validWords.front();
        validWords.pop();
        mp[str] = index++;
        if(str.size() == 5) continue;
        for(char c = str[str.size()-1] + 1 ; c <= 'z' ; c++) validWords.push(str+c);
    }
}

int main() {
    string word;
    generateWords();
    while(cin >> word){
        if(mp.find(word) != mp.end()) cout << mp.find(word)->second << '\n';
        else cout << "0\n";
    }

    return 0;
}
