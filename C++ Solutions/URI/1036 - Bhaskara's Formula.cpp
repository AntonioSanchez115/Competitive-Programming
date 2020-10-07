#include <bits/stdc++.h>
using namespace std;
//9:47
int main()
{
    double a,b,c;
    cin>>a>>b>>c;
    if(((b*b)-4*a*c) < 0 || (2*a)==0) cout<<"Impossivel calcular\n";
    else printf("R1 = %.5lf\nR2 = %.5lf\n",((-b+sqrt(((b*b)-4*a*c)))/(2*a)),((-b-sqrt(((b*b)-4*a*c)))/(2*a)));
    return 0;
}
