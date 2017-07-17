 /*                                  CODE_ON : ^_^  c++14                                       */
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
int main()
{
    string s;
    //pair <int,string>p1;
    map <int,string> mp22;
        mp22.insert(mp(12,"DFS"));
        mp22.insert(mp(3,"BFS"));
        mp22.insert(mp(8,"Tree"));
        mp22.insert(mp(5,"Graph"));
        map <int,string> mp11;
        itermap;
        map <int,string> ::iterator it;
        for(it=mp22.begin();it!=mp22.end();++it)
        {
            cout<<it->first<<endl;
            cout<<it->second<<endl;
        }

   // }
   /* vector <int>vec;
    for(int i=0;i<5;i++)
    {
        vec.push_back(i+10);
    }
    cout<<vec.max_size()<<endl;
    cout<<vec.size()<<endl;
    itervec;
    for(itv=vec.begin();itv!=vec.end();++itv)
        cout<<*itv<<endl;*/
    return 0;
}
