#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str="",L;
    while(getline(cin,L)) str+=L;
    cout<<((str.size()<=80)?"YES\n":"NO\n");
    return 0;
}
