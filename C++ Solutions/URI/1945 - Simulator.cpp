#include <bits/stdc++.h>
using namespace std;

int main() {
    string instruction;
    vector<pair<string,int>> var;
    while ( getline(cin, instruction)) {

        vector<string> token;
        char str[instruction.size()+1];
        strcpy(str,instruction.c_str());
        char* piece = strtok(str," ");
        while(piece != NULL){
            token.push_back(piece);
            piece = strtok(NULL," ");
        }

        if(token.size() == 3) { //Assign
            string nameVar = token[0];
            int value = stoi(token[2]);
            var.push_back( {nameVar,value} );
        } else { //Sum
            string dest;
            int op1 = 0, op2 = 0;
            char c;

            bool varExist = false;
            for(int i=0;i<var.size();i++){
                if(var[i].first == token[0]) varExist = true;
            }
            if(!varExist) var.push_back( {token[0],0} );
            dest = token[0];

            c = token[2].at(0);
            if(c >= '0' && c <= '9'){
                op1 = stoi(token[2]);
            }else{
                for(int i=0;i<var.size();i++){
                    if(token[2] == var[i].first) op1 = var[i].second;
                }
            }

            c = token[4].at(0);
            if(c >= '0' && c <= '9'){
                op2 = stoi(token[4]);
            }else{
                for(int i=0;i<var.size();i++){
                    if(token[4] == var[i].first) op2 = var[i].second;
                }
            }

            for(int i=0;i<var.size();i++)
                if(var[i].first == dest) var[i].second = (op1 + op2);
        }
    }
    cout << var[var.size()-1].second << '\n';
    return 0;
}
