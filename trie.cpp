#include<cstdio>
#include<conio.h>
#include<iostream>
#include<string>
#include<cstring>
#include<cmath>
#include<vector>
#include<set>
#include<map>
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
typedef struct node
{
	struct node *next[26];
	bool leaf;
}node;
node* getnode()
{
	node *p=NULL;
	p=new node;
	p->leaf=false;
	int i;
	loop(i,0,26)
	{
		p->next[i]=NULL;
	}
	return p;
}
void insert(node *root,char *key)
{
		node *p,*n;
		int level,length=strlen(key);
		int i,index;
		loop(i,0,length)
		{
			index=CHAR_TO_INDEX()
		}
}
int main()
{
	char keys[][8]={"the","a","there","answer","any","by","bye","their"};
	
	node *root=getnode();
	int i;
	loop(i,0,26)
		insert(root,keys[i]);

	getch();
}