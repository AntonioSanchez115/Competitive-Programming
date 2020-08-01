#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str,t;
    while(getline(cin,t)) str+=t;
    cout<<((str.size()<=140)?"TWEET\n":"MUTE\n");
    return 0;
}
