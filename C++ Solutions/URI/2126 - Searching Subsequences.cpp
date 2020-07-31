#include <bits/stdc++.h>

using namespace std;

int main()
{
    string n1,n2;
    int t=1;
    while(cin>>n1){
        cin>>n2;
        int pos=0,s=0;
        for(int i=0;i<=(n2.size()-n1.size());i++){
            string sub = n2.substr(i,n1.size());
            if(sub==n1){
                s++;
                pos=i+1;
            }
        }
        if(s==0) cout<<"Caso #"<<t++<<":\nNao existe subsequencia\n\n";
        else cout<<"Caso #"<<t++<<":\nQtd.Subsequencias: "<<s<<"\nPos: "<<pos<<"\n\n";
    }
    return 0;
}
