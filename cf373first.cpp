#include<bits/stdc++.h>
#define mod 1000000007
#define ll long long
/*                                           input                    */
#define si(i) scanf("%d",&i)
#define sii(i,j) scanf("%d%d",&i,&j)
#define siii(i) scanf("%lld",&i)
#define ss(i) scanf("%s",s)
/*                                           output                   */
#define pi(i) printf("%d",i)
#define pii(i,j) printf("%d%d",i,j)
#define piii(i) printf("%lld",i)
#define space printf(" ")
/*                                          loops                       */
#define newline printf("\n")
#define loop(i,s,n) for(i=s;i<n;i++)
#define pb(S) push_back(S)
#define f first
#define s second
#define MAX(a,b) 	(a>b) ? (a) : (b)
#define MIN(a,b) 	(a<b) ? (a) : (b)
using namespace std;
int main()
{
    int i,n,arr[96];
    si(n);
    loop(i,0,n)
        si(arr[i]);
    int j,k;
    if(arr[n-1]==15)
    {
        cout<<"DOWN";
        return 0;
    }
    if(arr[n-1]==0)
    {
        cout<<"UP";
        return 0;
    }
    if(n==1)
    {
        cout<<"-1";
        return 0;
    }
    if(arr[n-1]-arr[n-2]>0)
    {
       cout<<"UP";
        return 0;
    }
    else
    {
        cout<<"DOWN";
        return 0;
    }

}
