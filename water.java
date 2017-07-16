package codechef;

import java.util.Scanner;

public class water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n;
			n=sc.nextInt();
			int arr[]=new int[100001];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int answer=trap(arr,n);
			System.out.println(answer);
		}

	}
	public static int trap(int arr[],int n)
	{
		int left[]=new int[n];
		int right[]=new int[n];
		int answer=0;
		left[0]=arr[0];
		for(int i=1;i<n;i++)
			left[i]=Math.max(left[i-1], arr[i]);
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
			right[i]=Math.max(right[i+1], arr[i]);
		for(int i=0;i<n;i++)
			answer+=Math.min(left[i], right[i])-arr[i];
		return answer;
	}

}
