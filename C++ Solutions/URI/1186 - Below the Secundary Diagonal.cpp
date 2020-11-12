#include <bits/stdc++.h>
using namespace std;

int main()
{
    double x, sum=0.0;
    char c;
    cin >> c;
    for(int i=0;i<12;i++){
        for(int j=0;j<12;j++){
            cin >> x;
            if(j>11-i) sum+=x;
        }
    }
    printf("%.1f\n",((c == 'S') ? (sum) : (sum/66.0)));
    return 0;
}
