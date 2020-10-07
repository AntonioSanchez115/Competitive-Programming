#include <bits/stdc++.h>
using namespace std;
//5:27
int main()
{
    int a,b,c,d;
    cin>>a>>b>>c>>d;
    cout<<(((b>c) && (d>a) && ((c+d)>(a+b)) && (c>0) && (d>0) && !(a%2)) ? "Valores aceitos\n" : "Valores nao aceitos\n");
    return 0;
}
