#include <stdio.h>
#include <stdlib.h>
int sample[100005];
void qs(int list[],int left_limit,int right_limit);
void quicksort(int list[],int n);
double median(int sample[],int n);
//---------------------------------------------------
int main()
{
    int i,n;
    scanf("%d",&n);//trigger
    while(n!=0){//test cases and number of data
        for(i=0;i<n;i++){//Scanning values of sample
            scanf("%d",&sample[i]);
        }
        if(n==1){
        printf("%.1lf\n",(double)sample[0]);
        }else{
        quicksort(sample,n);//Sorting values
        printf("%.1lf\n",median(sample,n));//answer
        }
        scanf("%d",&n);
    }
    return 0;
}
//---------------------------------------------------
double median(int sample[],int n){

    if(n%2!=0){//When is odd return the value in the middle of the sample
        return (double)sample[n/2];
    }else{//Otherwise returns de average summing the two values of the middle and divide them in 2
        return (double)((double)sample[(n/2)-1]+(double)sample[n/2])/2.0;
    }
}
void qs(int list[],int left_limit,int right_limit){
    int left,right,temp,piv;

    left=left_limit;
    right=right_limit;
    piv=list[(left+right)/2];

    do{
        while(list[left]<piv && left<right_limit)left++;
        while(piv<list[right] && right>left_limit)right--;
        if(left<=right){
            temp=list[left];
            list[left]=list[right];
            list[right]=temp;
            left++;
            right--;
        }
    }while(left<=right);
    if(left_limit<right){ qs(list,left_limit,right); }
    if(right_limit>left){ qs(list,left,right_limit); }
}

void quicksort(int list[],int n){
    qs(list,0,n-1);
}
