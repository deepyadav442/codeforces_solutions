package codechef;

import java.util.Scanner;

public class peoplehiring2 {
	
	static int n;
	static int arr[]= new int[100001];
	static int pos[]= new int[100001];
	static int segtree[]= new int[1<<18];
	static int fact[]= new int[100001];
	static int ifact[] = new int[100001];
	static int mod= 1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int ll=0;ll<t;ll++)
		{
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			arr[i]=sc.nextInt();
			pos[arr[i]]=i;
		}
		build(1,n,1);
		pre();
		System.out.println(solve(1,n));
		}
	}
	public static int solve(int l , int r){
	    if(l >= r){
	        return 1;
	    }
	    int idx = query(1 , n , 1 , l , r);
	    int val = arr[idx];
	    return mult(mult(solve(l , val - 1) , solve(val + 1 , r)) , c(r - l , val - l)); 
	}
	public static int query(int l , int r , int node , int ql , int qr){
	    if(l > qr || r < ql){
	        return n + 1;
	    }
	    if(l >= ql && r <= qr){
	        return segtree[node];
	    }
	    int mid = l + r >> 1;
	    return Math.min(query(l , mid , node + node , ql , qr) , query(mid + 1 , r , node + node + 1 , ql , qr));
	}
	public static void pre(){
	    fact[0] = 1;
	    for(int i = 1 ; i <= n ; ++i){
	        fact[i] = mult(fact[i - 1] , i);
	    }
	    ifact[n] = power(fact[n] , mod - 2);
	    for(int i = n - 1 ; i >= 0 ; --i){
	        ifact[i] = mult(ifact[i + 1] , i + 1);
	    }
	}
	public static int c(int a , int b){
	    return mult(fact[a] , mult(ifact[b] , ifact[a - b]));
	}
	public static void build(int l , int r , int node){
	    if(l == r){
	        segtree[node] = pos[l];
	    }
	    else{
	        int mid = l + r >> 1;
	        build(l , mid , node + node);
	        build(mid + 1 , r , node + node + 1);
	        segtree[node] = Math.min(segtree[node + node + 1] , segtree[node + node]);
	    }
	}
	public static int mult(int a , int b){
	     int res = a;
	    res *= b;
	    if(res >= mod){
	        return res % mod;
	    }
	    return res;
	}
	public static int power(int a , int b){
	    int res = 1;
	    while(b>0){
	        if(b %2==1){
	            res = mult(res , a);
	        }
	        a = mult(a , a);
	        b >>= 1;
	    }
	    return res;
	}

}
