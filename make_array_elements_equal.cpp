/* Filya is given an array of non-negative integers a1, a2, ..., an. First, he pick an integer x and then he adds x to some elements
of the array (no more than once), subtract x from some other elements (also, no more than once) and do no change other elements.
He wants all elements of the array to be equal.   */

#include<bits/stdc++.h>
#define ll long long
/*                                           input                    */
#define si(i) scanf("%d",&i)
#define sii(i,j) scanf("%d%d",&i,&j)
#define siii(i) scanf("%lld",&i)
/*                                           output                   */
#define pi(i) printf(%d,i)
#define pii(i,j) printf("%d%d",i,j)
#define piii(i) printf("%lld",i)
/*                                          loops                       */
#define loop(i,s,n) for(i=s;i<n;i++)
#define pb(S) push_back(S)
#define f first
#define s second
#define MAX(a,b) 	(a>b) ? (a) : (b)
#define MIN(a,b) 	(a<b) ? (a) : (b)
using namespace std;
int main()
{
    ll n,arr[100001];
    int i;
    siii(n);
    loop(i,0,n)
        siii(arr[i]);
    sort(arr,arr+n);
    int count=0,j=1;
    int index[5]={0};
    index[0]=0;
    loop(i,0,n-1)
    {
        if(arr[i]!=arr[i+1]){
            count++;
            index[j++]=i+1;
        }
    }
    if(count<=1)
        cout<<"YES";
    if(count==2)
    {
        if(arr[index[2]]-arr[index[1]]==arr[index[1]]-arr[index[0]])
            cout<<"YES";
        else
            cout<<"NO";
    }
    if(count>=3)
        cout<<"NO";
    return 0;
}
