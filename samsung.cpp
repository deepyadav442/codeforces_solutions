#include <bits/stdc++.h>
#define MOD 1000000007
using namespace std;
int *st;
int gcd(int a, int b)
{
    if (a < b)
        swap(a, b);
    if (b==0)
        return a;
    return gcd(b, a%b);
}
int findGcd(int ss, int se, int qs, int qe, int si)
{
    if (ss>qe || se < qs)
        return 0;
    if (qs<=ss && qe>=se)
        return st[si];
    int mid = ss+(se-ss)/2;
    return gcd(findGcd(ss, mid, qs, qe, si*2+1),
               findGcd(mid+1, se, qs, qe, si*2+2));
}
int findRangeGcd(int ss, int se, int arr[],int n)
{
    return findGcd(0, n-1, ss, se, 0);
}
int constructST(int arr[], int ss, int se, int si)
{
    if (ss==se)
    {
        st[si] = arr[ss];
        return st[si];
    }
    int mid = ss+(se-ss)/2;
    st[si] = gcd(constructST(arr, ss, mid, si*2+1),constructST(arr, mid+1, se, si*2+2));
    return st[si];
}
int *constructSegmentTree(int arr[], int n)
{
   int height = (int)(ceil(log2(n)));
   int size = 2*(int)pow(2, height)-1;
   st = new int[size];
   constructST(arr, 0, n-1, 0);
   return st;
}
long long int dp[1000001];
void preprocessing()
{
    dp[1]=1,dp[2]=1;
    for(int i=3;i<1001;i++)
    {
        dp[i]=((dp[i-1]%MOD)+(dp[i-2]%MOD))%MOD;
    }
}
int main()
{
    int l,r,n,q,a[100007];
    cin>>n>>q;
    for(int i=0;i<n;i++)
        cin>>a[i];
    constructSegmentTree(a,n);
    preprocessing();
    while(q--)
    {
        cin>>l>>r;
        l--,r--;
        long int gc=findRangeGcd(l, r, a, n);
        gc=gc%MOD;
        cout<<dp[gc]%MOD <<endl;
    }
    return 0;
}