#include<bits/stdc++.h>
#define mod 1000000007
#define ll long long
/*                                           input                    */
#define si(i) scanf("%d",&i)
#define sii(i,j) scanf("%d%d",&i,&j)
#define siii(i) scanf("%lld",&i)
#define sss(a) scanf("%s",a);
/*                                           output                   */
#define pi(i) printf("%d",i)
#define pii(i,j) printf("%d%d",i,j)
#define piii(i) printf("%lld",i)
#define space printf(" ")
#define newline printf("\n")
/*                                          loops                       */
#define loop(i,s,n) for(i=s;i<n;i++)
#define pb(S) push_back(S)
#define fi first
#define se second
#define MAX(a,b) 	(a>b) ? (a) : (b)
#define MIN(a,b) 	(a<b) ? (a) : (b)
using namespace std;
int main()
{
    ll t;
    siii(t);
    while(t--)
    {
        string s;
        cin>>s;
        int i,countzero=0;
        int countone=0;
        loop(i,0,s.length())
        {
            if(s[i]=='0')
                countzero++;
            else
                countone++;
        }
        if(countzero==1||countone==1)
            cout<<"Yes"<<endl;
        else
            cout<<"No"<<endl;
    }
    return 0;
}
