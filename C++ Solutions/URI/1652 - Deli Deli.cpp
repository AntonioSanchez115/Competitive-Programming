#include <bits/stdc++.h>
using namespace std;

int main()
{
    int l,n;
    cin >> l >> n;
    string irr[l];
    string plu[l];
    string word;
    for(int i=0;i<l;i++) cin >> irr[i] >> plu[i];
    for(int i=0;i<n;i++){
        bool match = false;
        cin >> word;
        for(int j=0;j<l;j++){
            if(word == irr[j]){
                cout << plu[j] << '\n';
                match = true;
            }
        }
        if(!match && word[word.size()-2]!='a' && word[word.size()-2]!='e' && word[word.size()-2]!='i' && word[word.size()-2]!='o' && word[word.size()-2]!='u' && word[word.size()-1]=='y'){
            for(int j=0;j<word.size()-1;j++) cout << word[j];
            cout << "ies\n";
        }else if(!match && (word[word.size()-1]=='o' || word[word.size()-1]=='s' || word[word.size()-1]=='x' || (word[word.size()-1]=='h' && (word[word.size()-2]=='c' || word[word.size()-2]=='s')))){
            cout << word << "es\n";
        }else if(!match){
            cout << word << "s\n";
        }
    }
    return 0;
}
