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
            if(j<5 && (i>j && i<11-j)) sum += x;
        }
    }
    printf("%.1f\n",((c == 'S') ? (sum) : (sum/30.0)));
    return 0;
}
