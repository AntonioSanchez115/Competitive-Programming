#include <bits/stdc++.h>
using namespace std;

int main()
{
    int s;
    int time[3] = {3600,60,1},num[3] = {0};
    cin>>s;
    for(int i=0;i<3;i++){
        while(s >= time[i]){
            num[i]++;
            s -= time[i];
        }
    }
    cout<<num[0]<<':'<<num[1]<<':'<<num[2]<<'\n';
    return 0;
}
