#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s,t;
    while(cin >> s >> t && s!="*"){
        int mov = 0;
        string matches = "";
        for(int i=0;i<s.size();i++) matches += (s[i] == t[i]) ? "1" : "0";
        vector<string> vec;
        char str[matches.size()+1];
        strcpy(str,matches.c_str());
        char* piece = strtok(str,"1");
        while(piece != NULL){
            vec.push_back(piece);
            piece = strtok(NULL,"1");
        }
        cout << vec.size() << '\n';
    }
    return 0;
}
