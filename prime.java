package codechef;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		long count=0;
		prime t=new prime();
		for(int i=2;i<=n;i++)
		{
			if(t.primes(i)==1)
				count+=i;
		}
		System.out.println(count);
	}
	public int primes(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return 0;
		}
		return 1;
	}

}
