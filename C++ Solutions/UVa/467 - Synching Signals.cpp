#include <bits/stdc++.h>
using namespace std;
typedef pair<int,bool> ib;//To save the light's seconds an its state (green or yellow/red)
int main(){
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int s=1;
    string str;
    while(getline(cin,str)){
        int sec=3601;
        vector<ib> L;
        string snum="";
        for(int i=0;i<str.size();i++){//----[To introduce the values]-------------------------
            if(str[i]!=' '){
                snum+=str[i];
            }else{
                if(!snum.empty()){
                    if(!snum.empty()) L.push_back(ib(stoi(snum),true));
                    sec=min(sec,L.back().first);//Find the first light turning yellow
                }
                snum="";
            }
        }
        if(!snum.empty()) L.push_back(ib(stoi(snum),true));
        sec=min(sec,L.back().first);//Find the first light turning yellow(last light)//--------
        //Rest of the code...
        for(int i=0;i<L.size();i++) if(L[i].first==sec) L[i].second=false;
        sec-=4;//Turning yellow
        while(sec<=3601){
            int cont=0;
            for(int i=0;i<L.size();i++) if(L[i].second==true) cont++;//Checks each light every sec
            if(cont==L.size()) break;//If all light are green then they're sync
            for(int i=0;i<L.size();i++){
                if(L[i].second==true){//If the light is green...
                    if(sec%(L[i].first)==(L[i].first)-5) L[i].second=false;//From green to yellow/red
                }else{//If it's red...
                    if(sec%(L[i].first*2)==0) L[i].second=true;//From red to green
                }

            }
            sec++;
        }
        if(sec<=3601) cout<<"Set "<<s++<<" synchs again at "<<(sec-1)/60<<" minute(s) and "<<(sec-1)%60<<" second(s) after all turning green.\n";
        else cout<<"Set "<<s++<<" is unable to synch after one hour.\n";
    }
    return 0;
}
