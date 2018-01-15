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
    set<int> arr;
    set<pair<int,int> >doublearr;
    stack<pair<int,int> >elements,maximum;
    int n;
    int i=1;
    si(n);
    while(n--)
    {
        int q;
        pair<int,int>t1,t2;
        si(q);
        if(q==1)
        {
            int value;
            si(value);
            elements.push(mp(value,i));
            if(maximum.size()==0)
            {
                maximum.push(mp(value,i));
            }
            else
            {
                t1=maximum.top();
                if(value>t1.first)
                {
                    maximum.push(mp(value,i));
                }
            }
            i++;
        }
        else if(q==2)
            {
                t1=elements.top();
                elements.pop();
                t2=maximum.top();
                if(t1.first==t2.first && t1.second==t2.second)
                {
                    maximum.pop();
                }
            }
            else
            {
                t1=maximum.top();
                pi(t1.first),newline;
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
