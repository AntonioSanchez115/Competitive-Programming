#include <bits/stdc++.h>
using namespace std;

int main()
{
    string equation;
    while(cin >> equation){
        string sa = "", sb = "", sc = "";
        int i = equation.size()-1;
        while(equation[i]!='='){
            sc += equation[i--];
        }
        i--;
        while(equation[i]!='+'){
            sb += equation[i--];
        }
        i--;
        while(i>=0){
            sa += equation[i--];
        }
        long a = atol(sa.c_str());
        long b = atol(sb.c_str());
        long c = atol(sc.c_str());
        cout << ((a+b==c) ? "True\n" : "False\n");
        if(a+b==0) break;
    }
    return 0;
}
