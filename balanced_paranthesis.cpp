 /*                                  deepyadav442 --> :     c++14     <--                                */
#include<bits/stdc++.h>
#define mod 1000000007
#define ll long long
/*                                           input                    */
#define si(i) scanf("%d",&i)
#define sii(i,j) scanf("%d%d",&i,&j)
#define siii(i) scanf("%lld",&i)
#define sss(s) scanf("%s",s)
/*                                           output                   */
#define pi(i) printf("%d",i)
#define pii(i,j) printf("%d%d",i,j)
#define piii(i) printf("%lld",i)
#define space printf(" ")
#define newline printf("\n")
/*                                          loops &stls                      */
#define loop(i,s,n) for(i=s;i<n;i++)
#define looprev(i,s,n) for(i=s;i>=n;i--)
#define itervec vector<int>::iterator itv
#define iterrev vector<int>::reverse_iterator it
#define itermap map<string,int>::iterator itm
#define pb(S) push_back(S)
#define mp(i,j) make_pair(i,j)
#define f first
#define s second
#define MAX(a,b) 	(a>b) ? (a) : (b)
#define MIN(a,b) 	(a<b) ? (a) : (b)
using namespace std;
int cnt=-1;
int main()
{
    int t;
    si(t);
    while(t--)
    {
        stack<char>bracket;
        char s[1001];
        sss(s);
        int i;
        int flag=0;
        loop(i,0,strlen(s))
        {

            if(s[i]=='('||s[i]=='{'||s[i]=='['){
                bracket.push(s[i]);
                cout<<"push"<<endl;
            }
            else
            {
                if(bracket.size()==0){
                    flag=1;
                    break;
                }
                char ch=bracket.top();
                cout<<ch<<endl;
                if(ch==s[i])
                {
                    cout<<"ch"<<ch<<endl;
                    bracket.pop();
                }
                else
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag)
            cout<<"NO"<<endl;
        else
        {
            if(bracket.size())
                cout<<"NO"<<endl;
            else
                cout<<"YES"<<endl;
        }
    }
    return 0;
}
/*   fast input output
inline ll input() //for input integers call it long long int n=input();
{
    ll n=0;
    char ch=getchar_unlocked();
    while( ch < '0' || ch > '9' )
    {
        ch=getchar_unlocked();
    }
    while( ch >= '0' && ch <= '9' )
    {
        n = (n<<3)+(n<<1) + ch-'0', ch=getchar_unlocked();
    }
    return n;
}
inline void output(ll n)     //for output call output(count) and then for space use put('\n');
{
    char b[35];
    ll i=0;
    do
    {
        b[i++]=n%10+48;
        n=n/10;
    }while(n!=0);
    --i;
    while(i>=0)
    putchar_unlocked(b[i--]);
}
inline void faststring(char *str)  //for entering a string use faststring(p);
{
    register char c = 0;
    register long long i = 0;
    while (c < 33)
    c = getchar_unlocked();
    while (c != '\n')
    {
        str[i] = c;
        c = getchar_unlocked();
        ++i;
    }
    str[i] = '\0';
}


*/
