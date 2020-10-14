#include <bits/stdc++.h>
using namespace std;

int main()
{
    double a,b,c;
    vector<double> v;
    cin>>a>>b>>c;
    v.push_back(a);
    v.push_back(b);
    v.push_back(c);
    sort(v.begin(),v.begin()+v.size());
    a = v[2], b = v[1], c = v[0];
    if(a>=(b+c)) cout<<"NAO FORMA TRIANGULO\n";
    else{
        if((a*a)==(b*b)+(c*c)) cout<<"TRIANGULO RETANGULO\n";
        if((a*a)>(b*b)+(c*c)) cout<<"TRIANGULO OBTUSANGULO\n";
        if((a*a)<(b*b)+(c*c)) cout<<"TRIANGULO ACUTANGULO\n";
        if(a==b && b==c) cout<<"TRIANGULO EQUILATERO\n";
        if((a==b && a!=c) || (b==c && b!=a) || (a==c && c!=b)) cout<<"TRIANGULO ISOSCELES\n";
    }
    return 0;
}
