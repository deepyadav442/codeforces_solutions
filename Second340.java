import java.util.Scanner;

public class Second340 {

	public static void main(String[] args) {
		
		int n,p;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		p=sc.nextInt();
		long sum=0;
		int count=0;
			for(int j=10;;j++)
			{
				if(count==n)
					break;
				if(digits(j)==1)
				{
					j=j*10;
					continue;
				}
				int flag=0;
				String s=Integer.toString(j);
				for(int i=0,k=s.length()-1;i<k;i++,k--)
				{
					if(s.charAt(i)!=s.charAt(k))
					{
						flag=1;
						break;
					}
				}
				if(flag==0) {
					sum=(sum+(j%p))%p;
					count++;
				}
			}
			System.out.println(sum%p);
		}

	public static int digits(int j) {
	
		int count=0;
		while(j!=0)
		{
			j=j/10;
			count++;
		}
		if(count%2==0) {
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
