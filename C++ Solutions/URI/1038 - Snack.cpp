#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,y;
    double arr[5] = {4.0,4.5,5.0,2.0,1.5};
    cin>>x>>y;
    printf("Total: R$ %.2lf\n",arr[x-1]*y);
    return 0;
}
