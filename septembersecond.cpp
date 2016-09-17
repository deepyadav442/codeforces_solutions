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
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int flag=0;
        int i,j;
        int len=s.length();
        for(i=0,j=len-1;i<j;i++,j--)
        {
            if(s[i]!='.'&&s[j]!='.')
            {
                if(s[i]!=s[j])
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag)
        {
            cout<<"-1"<<endl;
            continue;
        }
        for(i=0,j=len-i-1;i<len;i++,j--)
        {
            if(i==j)
            {
                if(s[i]=='.')
                    cout<<"a";
                else
                    cout<<s[i];
            }
            else if(s[i]=='.'&&s[j]=='.')
                cout<<"a";
            else if(s[i]=='.')
                cout<<s[j];
            else
                cout<<s[i];

        }
        cout<<endl;
    }
    return 0;
}
