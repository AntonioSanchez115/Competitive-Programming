#include <bits/stdc++.h>
using namespace std;

int main()
{
    double m[12][12], sum=0.0;
    int L;
    char c;
    cin >> L >> c;
    for(int i=0;i<12;i++){
        for(int j=0;j<12;j++) cin>> m[i][j];
    }
    for(int j=0;j<12;j++)  sum += m[L][j];
    printf("%.1f\n",((c == 'S') ? (sum) : (sum/12.0)));
    return 0;
}
