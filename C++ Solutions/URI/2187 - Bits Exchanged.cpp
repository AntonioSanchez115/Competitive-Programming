#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, t = 1;
    while(cin >> n && n != 0){
        int notes[4] = {50,10,5,1};
        int num[4] = {0};
        int i = 0;
        while(n>0){
            while(n>=notes[i]){
                num[i]++;
                n -= notes[i];
            }
            i++;
        }
        cout << "Teste " << t++ << '\n' << num[0];
        for(int i=1;i<4;i++) cout << ' ' << num[i];
        cout << "\n\n";
    }
    return 0;
}
