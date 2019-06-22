#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0);
    int t; cin>>t;
    while(t--){
        int capac,m,load,aux,times=0;
        string str;
        queue<int> left,right;
        bool overload;//This will help to know if the ferry length capacity has been exceeded
        cin>>capac>>m;
        capac*=100;//Converting meters to centimeters
        for(int i=0;i<m;i++){
            cin>>aux>>str;
            if(str=="right") right.push(aux);
            else left.push(aux);//Adding each car to its corresponding bank
        }
        while(!left.empty()||!right.empty()){//If there's any car on any bank we'll repeat it
            load=0;//This is for know the current load on the ferry
            overload=false;
            while(!left.empty()&&load<=capac){
                load+=left.front();//Adding a car to the ferry
                if(load<=capac) left.pop();//If there's still enough space we'll "delete it"
                else overload=true;
            }
            if(overload) load-=left.front();//If the capacity has been exceeded we'll "return" the car to the bank
            times++;
            if(left.empty()&&right.empty()) break;
            load=0;
            overload=false;
            while(!right.empty()&&load<=capac){//Then it repeats with the other side
                load+=right.front();
                if(load<=capac) right.pop();
                else overload=true;
            }
            if(overload) load-=right.front();
            times++;
        }
        cout<<times<<'\n';
    }
    return 0;
}
