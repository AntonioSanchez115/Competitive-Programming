#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, cont=0, maxfood=0;
    cin >> n;
    string str;
    char board[n][n];
    vector<int> food;
    for(int i=0;i<n;i++){
        cin >> str;
        for(int j=0;j<n;j++){
            board[i][j] = str[j];
        }
    }
    for(int i=0;i<n;i++){
        if(i%2==0){
            for(int j=0;j<n;j++){
                if(board[i][j]=='o') cont++;
                if(board[i][j]=='A'){
                    food.push_back(cont);
                    cont = 0;
                }
            }
        }else{
            for(int j=n-1;j>=0;j--){
                if(board[i][j]=='o') cont++;
                if(board[i][j]=='A'){
                    food.push_back(cont);
                    cont = 0;
                }
            }
        }
    }
    food.push_back(cont);
    for(int i=0;i<food.size();i++) maxfood = max(maxfood,food[i]);
    cout << maxfood << '\n';
    return 0;
}
