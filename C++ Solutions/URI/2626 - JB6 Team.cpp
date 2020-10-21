#include <bits/stdc++.h>
using namespace std;

int main()
{
    string a,b,c,pe="pedra",pa="papel",te="tesoura";
    while(cin>>a>>b>>c){
        if((a==pe && b==te && c==te) || (a==pa && b==pe && c==pe) || (a==te && b==pa && c==pa)) cout<<"Os atributos dos monstros vao ser inteligencia, sabedoria...\n";
        else if((a==pe && b==pa && c==pe) || (a==pa && b==te && c==pa) || (a==te && b==pe && c==te)) cout<<"Iron Maiden's gonna get you, no matter how far!\n";
        else if((a==pe && b==pe && c==pa) || (a==pa && b==pa && c==te) || (a==te && b==te && c==pe)) cout<<"Urano perdeu algo muito precioso...\n";
        else cout<<"Putz vei, o Leo ta demorando muito pra jogar...\n";
    }
    return 0;
}
