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
int N,M,ans;
int a[302][302],it[302],cnt[302];
bool check[302];
bool solve(int x)
{
    int i;
    loop(i,0,N)
        it[i]=1;
    loop(i,0,M)
        check[i]=false;
    while(1){
		bool flag = false;
		loop(i,0,M) cnt[i] = 0;
		loop(i,0,N){
			if(it[i] > M) return false;
			cnt[a[i][it[i]]]++;
		}
		loop(i,0,N){
			if(cnt[a[i][it[i]]] > x){
				check[a[i][it[i]]] = true;
				flag = true;
			}
		}
		loop(i,0,N){
			while(check[a[i][it[i]]]){
				it[i]++;
			}
		}
		if(!flag) break;
	}
	return true;
}

int main()
{
    int i,j;
    si(N),si(M);
    loop(i,0,N) loop(j,0,M) si(a[i][j]);
    int l,r;
    l=0,r=N-1;
    while(l<=r)
    {
        int mid=(l+r)/2;
        if(solve(mid))
        {
            ans=mid;
            r=mid-1;

        }
        else
            l=mid+1;

    }
    pi(ans),newline;
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
