#include <bits/stdc++.h>
using namespace std;
string longDivision(string number, int divisor) {
    string ans;
    int idx = 0;
    int temp = number[idx] - '0';
    while (temp < divisor) temp = temp * 10 + (number[++idx] - '0');
    while (number.size() > idx){
        ans += (temp / divisor) + '0';
        temp = (temp % divisor) * 10 + number[++idx] - '0';
    }
    if (ans.length() == 0) return "0";
    return ans;
}

int main()
{
    int t;
    cin >> t;
    while(t--){
        int num = 0;
        string n;
        cin >> n;
        while(n!="0"){
            int lastNum = n[n.size()-1] - '0';
            if(lastNum % 2 == 1) num++;
            n = longDivision(n,2);
        }
        cout << num << '\n';
    }
    return 0;
}
