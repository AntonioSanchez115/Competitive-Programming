#include <iostream>

using namespace std;

int main()
{
    double v,d;
    while(cin>>v>>d){
        double h = (v/((d/2.0)*(d/2.0)))/3.14;
        double a = 3.14*((d/2.0)*(d/2.0));
        printf("ALTURA = %.2lf\nAREA = %.2lf\n",h,a);
    }
    return 0;
}
