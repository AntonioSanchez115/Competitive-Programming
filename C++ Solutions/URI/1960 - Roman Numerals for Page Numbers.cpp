#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,num; cin>>n;
    string x = to_string(n);
    string roman = "";
    string units[] = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    string tens[] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    string hund[] = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    if(x.size()>2){
        num = x[0]-'0';
        roman += hund[num-1];
        num = x[1]-'0';
        if(num!=0){
            roman += tens[num-1];
        }
        num = x[2]-'0';
        if(num!=0){
            roman += units[num-1];
        }
    }else if(x.size()>1){
        num = x[0]-'0';
        roman += tens[num-1];
        num = x[1]-'0';
        if(num!=0){
            roman += units[num-1];
        }
    }else{
        num = x[0]-'0';
        roman += units[num-1];
    }

    cout<<roman<<'\n';
    return 0;
}
