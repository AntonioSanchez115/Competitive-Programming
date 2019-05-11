#include <bits/stdc++.h>
using namespace std;

int main()
{
    double sum=0,x;
    for(int i=0;i<30;i++){
        cin>>x;
        sum+=x;
    }
    printf("%.3f\n",(sum/30.0)+sum);
    return 0;
}
