#include<bits/stdc++.h>
#define ll long long
/*                                           input                    */
#define si(i) scanf("%d",&i)
#define sii(i,j) scanf("%d%d",&i,&j)
#define siii(i) scanf("%lld",&i)
/*                                           output                   */
#define pi(i) printf("%d",i)
#define pii(i,j) printf("%d%d",i,j)
#define piii(i) printf("%lld",i)
#define space printf(" ")
#define newline printf("\n")
/*                                          loops                       */
#define loop(i,s,n) for(i=s;i<n;i++)
#define pb(S) push_back(S)
#define f first
#define s second
#define MAX(a,b) 	(a>b) ? (a) : (b)
#define MIN(a,b) 	(a<b) ? (a) : (b)
using namespace std;
ll arr[]={4,9,25,49,121,169,289,361,529,841,961,1369,1681,1849,2209,2809,3481,3721,4489,5041,5329,6241,6889,7921,9409,10201,10609,11449,11881,12769,16129,17161,18769,19321,22201,22801,24649,26569,27889,29929,32041,32761,36481,37249,38809,39601,44521,49729,51529,52441,54289,57121,58081,63001,66049,69169,72361,73441,76729,78961,80089,85849,94249,96721,97969,100489,109561,113569,120409,121801,124609,128881,134689,139129,143641,146689,151321};
int main()
{
    int t,n;
    si(t);
    vector<int>vec;
    while(t--)
    {
        int i,j;
        si(n);
        if(n<4)
        {
            cout<<"0"<<endl;
            continue;
        }
        vec.clear();
        loop(i,4,n+1)
        {
            loop(j,0,50)
            {
                if(i%arr[j]==0)
                {
                    vec.pb(i);
                    break;
                }
                else if(arr[j]>i)
                {
                    break;
                }
            }
        }
        pi(vec.size()*2),newline;
        loop(i,0,vec.size())
        {
            pi(vec.at(i)),space;
        }
        newline;
    }
    return 0;
}
