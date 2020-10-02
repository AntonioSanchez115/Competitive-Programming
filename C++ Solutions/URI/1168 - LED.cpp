#include <bits/stdc++.h>

using namespace std;

int main()
{
    int c;
    cin>>c;
    while(c--){
        long long int l=0;
        string s;
        cin>>s;
        for(int i=0;i<s.size();i++){
            if(s[i]=='1') l+=2;
            else if(s[i]=='7') l+=3;
            else if(s[i]=='4') l+=4;
            else if(s[i]=='2'||s[i]=='5'||s[i]=='3') l+=5;
            else if(s[i]=='6'||s[i]=='9'||s[i]=='0') l+=6;
            else l+=7;
        }
        cout<<l<<" leds\n";
    }
    return 0;
}
