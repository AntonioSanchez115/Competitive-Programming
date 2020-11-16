#include <bits/stdc++.h>
using namespace std;

int main()
{
    string vine;
    while(cin >> vine){
        int largest = 0;
        vector<string> vec;
        char str[vine.size()+1];
        strcpy(str,vine.c_str());
        char* piece = strtok(str,"x");
        while(piece != NULL){
            vec.push_back(piece);
            piece = strtok(NULL,"x");
        }
        for(int i=0;i<vec.size();i++){
            int n = vec[i].size();
            if(i==0 || i==vec.size()-1){
                largest = max(largest,n);
            }else{
                n/=2;
                largest = max(largest,n);
            }
        }
        cout << largest << '\n';
    }
    return 0;
}
