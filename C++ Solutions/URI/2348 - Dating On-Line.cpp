#include <bits/stdc++.h>
using namespace std;
const double PI = atan(1)*4;

int main()
{
    double n,a,b,total=0.0,area;
    cin >> n;
    double vec[(int)n], s[(int)n];
    for(int i=0;i<n;i++) cin >> vec[i];
    sort(vec,vec+((int)n));
    if((int)n%2){
        int x = 0;
        for(int i=0;i<=n;i+=2) s[x++] = vec[i];
        for(int i=n-2;i>=0;i-=2) s[x++] = vec[i];
    }else{
        int x = 1;
        s[0] = vec[0];
        for(int i=1;i<=n;i+=2) s[x++] = vec[i];
        for(int i=n-2;i>=2;i-=2) s[x++] = vec[i];
    }
    for(int i=0;i<n;i++){
        if(i!=n-1){
            a = s[i];
            b = s[i+1];
        }else{
            a = s[(int)n-1];
            b = s[0];
        }
        area = ((b*a)*sin((360.0/n)*PI/180.0))/2.0;
        total += area;
    }
    printf("%.3f\n",total);
    return 0;
}
