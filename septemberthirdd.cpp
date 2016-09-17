#include<bits/stdc++.h>
#define mod 1000000007
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
int main()
{
    int t,n,j,c,i,index;
    si(t);
    while(t--)
    {
        si(n);
        int flag=0,lastcost=0,ii;
        loop(ii,1,n+1)
        {
            si(c);
            int count=0,cost=0,k;
            int type[101]={0};
            loop(k,0,c)
            {
                si(j);
                type[j]++;
            }
            while(1)
            {
                count=0;
                loop(k,1,7)
                {
                    if(type[k]>0)
                    {
                        count++;
                        type[k]--;
                    }
                }
               if(count<=3)
                    break;
                if(count==6)
                    cost+=4;
                if(count==5)
                    cost+=2;
                if(count==4)
                    cost+=1;
            }
            cost+=c;
            if(cost>lastcost)
            {
                lastcost=cost;
                index=ii;
                flag=0;
            }
            else if(cost==lastcost)
            {
                lastcost=cost;
                index=ii;
                flag=1;
            }
        }
        if(flag==1)
            cout<<"tie"<<endl;
        else if(index==1)
            cout<<"chef"<<endl;
        else
            pi(index),newline;
    }
    return 0;
}
