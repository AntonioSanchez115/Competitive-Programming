#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x;
    vector<int> vec;
    cin >> n;
    while(n--){
        cin >> x;
        vec.push_back(x);
    }
    sort(vec.begin(),vec.end());
    int t = vec.back(), arr[t];
    for(int i=0;i<t;i++) arr[i] = 0;
    for(int i=0;i<vec.size();i++) arr[vec[i]-1]++;
    for(int i=0;i<t;i++){
        if(arr[i] != 0) cout << i + 1 << " aparece " << arr[i] << " vez(es)\n";
    }
    return 0;
}
