#include <bits/stdc++.h>

using namespace std;

int main()
{
    int tc;
    cin>>tc;
    for(int t=1;t<=tc;t++){
        string s,r;
        cin>>s>>r;
        if(s=="tesoura"){
            if(r=="tesoura") cout<<"Caso #"<<t<<": De novo!\n";
            else if(r=="papel" || r=="lagarto") cout<<"Caso #"<<t<<": Bazinga!\n";
            else cout<<"Caso #"<<t<<": Raj trapaceou!\n";
        }
        else if(s=="papel"){
            if(r=="papel") cout<<"Caso #"<<t<<": De novo!\n";
            else if(r=="pedra" || r=="Spock") cout<<"Caso #"<<t<<": Bazinga!\n";
            else cout<<"Caso #"<<t<<": Raj trapaceou!\n";
        }
        else if(s=="pedra"){
            if(r=="pedra") cout<<"Caso #"<<t<<": De novo!\n";
            else if(r=="lagarto" || r=="tesoura") cout<<"Caso #"<<t<<": Bazinga!\n";
            else cout<<"Caso #"<<t<<": Raj trapaceou!\n";
        }
        else if(s=="lagarto"){
            if(r=="lagarto") cout<<"Caso #"<<t<<": De novo!\n";
            else if(r=="Spock" || r=="papel") cout<<"Caso #"<<t<<": Bazinga!\n";
            else cout<<"Caso #"<<t<<": Raj trapaceou!\n";
        }
        else if(s=="Spock"){
            if(r=="Spock") cout<<"Caso #"<<t<<": De novo!\n";
            else if(r=="tesoura" || r=="pedra") cout<<"Caso #"<<t<<": Bazinga!\n";
            else cout<<"Caso #"<<t<<": Raj trapaceou!\n";
        }
    }
    return 0;
}
