#include <bits/stdc++.h>
using namespace std;
int main()
{
	int n,m,arr[100001];
	cin>>n>>m;
	for(int i=0;i<n;i++)
		cin>>arr[i];
	sort(arr,arr+n);
	int last = arr[n-1]+m;
	for(int i=0;i<m;i++)
	{
		arr[0]++;
		sort(arr,arr+n);
	}
	cout<<arr[n-1]<<" "<<last<<endl;
	return 0;
}