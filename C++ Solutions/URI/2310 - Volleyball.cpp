#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n; cin>>n;
    double st1=0,bt1=0,at1=0,st2=0,bt2=0,at2=0;
    for(int i=0;i<n;i++){
        string str; cin>>str;
        double s,b,a;
        cin>>s>>b>>a;
        st1+=s;
        bt1+=b;
        at1+=a;
        cin>>s>>b>>a;
        st2+=s;
        bt2+=b;
        at2+=a;
    }
    printf("Pontos de Saque: %.2lf %%.\n",(st2/st1*100.0));
    printf("Pontos de Bloqueio: %.2lf %%.\n",(bt2/bt1*100.0));
    printf("Pontos de Ataque: %.2lf %%.\n",(at2/at1*100.0));
    return 0;
}
