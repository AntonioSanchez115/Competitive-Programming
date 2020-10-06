#include <bits/stdc++.h>

using namespace std;

int main()
{
    int age;
    int time[3] = {365,30,1}, num[3] = {0};
    cin>>age;
    for(int i=0;i<3;i++){
        while(age >= time[i]){
            num[i]++;
            age -= time[i];
        }
    }
    cout<<num[0]<<" ano(s)\n"<<num[1]<<" mes(es)\n"<<num[2]<<" dia(s)\n";
    return 0;
}
