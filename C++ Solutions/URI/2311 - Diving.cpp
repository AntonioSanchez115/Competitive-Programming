#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n; cin>>n;
    while(n--){
        string name;
        double sum=0,d,Max,Min;
        cin>>name>>d;
        for(int i=0;i<7;i++){
            double s;
            cin>>s;
            if(i==0){
                Max=s;
                Min=s;
            }else{
                if(s<Min) Min=s;
                if(s>Max) Max=s;
            }
            sum+=s;
        }
        sum-=(Min+Max);
        cout<<name<<' ';
        printf("%.2lf\n",(sum*d));
    }
    return 0;
}
