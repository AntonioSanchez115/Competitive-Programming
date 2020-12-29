#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    string str;
    while(cin >> n >> str){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += str[i] - '0';
        }
        cout << sum << ' ';
        cout << ((sum%3==0) ? "sim\n" : "nao\n");
    }
    return 0;
}
