#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str;
    for(int it=0;it<3;it++){
        int sum=0;
        getline(cin,str);
        while(str!="caw caw"){
            int binum=0,p=0;
            for(int i=2;i>=0;i--){
                if(str[i]=='*') binum+=pow(2,p);
                p++;
            }
            sum+=binum;
            getline(cin,str);
        }
        cout<<sum<<'\n';
    }
    return 0;
}
