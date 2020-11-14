#include <bits/stdc++.h>
using namespace std;
//65 = A
//...
//90 = Z

int newIndex(int curIndex, int disp){
    if(curIndex - disp < 65) return 91 - (disp - (curIndex - 65));
    return curIndex - disp;
}
int main()
{
    int t, d;
    cin >> t;
    while(t--){
        string sent;
        cin >> sent >> d;
        for(int i=0;i<sent.size();i++) sent[i] = newIndex((int)sent[i], d);
        cout << sent << '\n';
        //cout << (int)sent[0] << ' ' << newIndex((int)sent[0], d) << '\n';
    }
    return 0;
}
