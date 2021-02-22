#include <bits/stdc++.h>
using namespace std;

int octalToDecimal(int octalNumber){
    int decimalNumber = 0, i = 0, rem;
    while (octalNumber != 0)
    {
        rem = octalNumber % 10;
        octalNumber /= 10;
        decimalNumber += rem * pow(8, i);
        ++i;
    }
    return decimalNumber;
}

int main() {
    string str, str1;
    int num;
    char table[256];
    table[64] = ' ';
    for(int i=129;i<138;i++) table[i] = i - 32;
    for(int i=145;i<154;i++) table[i] = i - 39;
    for(int i=162;i<170;i++) table[i] = i - 47;
    for(int i=193;i<202;i++) table[i] = i - 128;
    for(int i=209;i<218;i++) table[i] = i - 135;
    for(int i=226;i<234;i++) table[i] = i - 143;
    for(int i=240;i<250;i++) table[i] = i - 192;
    while(getline(cin,str)) {
        for(int i=0;i<str.size();i+=4){
            str1 = str.substr(i,3);
            num = octalToDecimal(stoi(str1));
            cout << table[num];
        }
        cout << '\n';
    }
    return 0;
}
