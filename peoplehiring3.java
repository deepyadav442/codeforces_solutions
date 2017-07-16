package codechef;

import java.util.Scanner;

public class peoplehiring3 {

	static int leftt[] = new int[100010];
	static int rightt[] = new int[100010];
	static int sizee[] = new int[100010];
	static int arr[]=new int[100010];
	static int facts[] = new int[100001];
	static int mod = 1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		facts[0] = 1;
	    for (int i=1; i<100000; i++) {
	        facts[i] = facts[i-1]*i;
	        facts[i] %= mod;
	    }
		for(int ll=0;ll<t;ll++)
		{
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			arr[i]=sc.nextInt();
		}
		int root = arr[1];
		 for (int i=2; i<=n; i++) {
		        root = arr[1];
		        while (2>1) {
		            if (root < arr[i]) {
		                if (rightt[root]==0) {
		                    rightt[root] = arr[i];
		                    break;
		                }
		                else {
		                    root = rightt[root];
		                }
		            }
		            else {
		                if (leftt[root]==0) {
		                    leftt[root] = arr[i];
		                    break;
		                }
		                else {
		                    root = leftt[root];
		                }
		            }
		 
		        }
		    }
		 
		    root = arr[1];
		    calcsizee(root);
		 
		    //for(int i=1; i<=n; i++) cout<<leftt[i]<<" "<<rightt[i]<<" "<<sizee[i]<<endl;
		    root = arr[1];
		    System.out.println(calc(root));
		
		//System.out.println();
		}
	}
	public static int  power(int x, int p) {
		 
	    if (p==1) return x;
	 
	    int tmp = power(x, p/2);
	    tmp*=tmp;
	    tmp%=mod;
	    if (p%2==1) {
	        tmp*=x;
	        tmp%=mod;
	    }
	    return tmp%mod;
	}
	 
	public static int ncr(int n, int r) {
	 
	    int tmp = facts[n];
	    tmp*=(power(facts[r], mod-2));
	    tmp%=mod;
	    tmp*=(power(facts[n-r], mod-2));
	    tmp%=mod;
	    return tmp;
	}
	 
	public static int calcsizee(int x) {
	    sizee[x] = 1;
	    if (rightt[x]!=0) {
	        sizee[x] += calcsizee(rightt[x]);
	 
	    }
	    if (leftt[x]!=0) {
	        calcsizee(leftt[x]);
	        sizee[x] += calcsizee(leftt[x]);
	    }
	    //cout<<sizee[x]<<endl;
	    return sizee[x];
	}
	 
	 
	public static int calc(int x) {
	 
	    if (rightt[x]==0 && leftt[x]==0) return 1;
	 
	    int mult=1;
	    if (leftt[x]!=0) mult*=(calc(leftt[x]));
	    mult%=mod;
	    if (rightt[x]!=0) mult*=(calc(rightt[x]));
	    mult%=mod;
	 
	    return ((ncr(sizee[x]-1, sizee[leftt[x]]))*mult)%mod;
	}
	 

}
