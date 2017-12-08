import java.util.*;
import java.io.*;
public class Checking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q= sc.nextInt();
		String s = new String(); 
		s=sc.next();
		Vector<String> ss = new Vector<>();
		String p;
		for(int i=0;i<q;i++)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			String s1=sc.next();
			//int ll= sc.nextInt();
			String s2=sc.next();
			char[] myname=s.toCharArray();
			for(int j=l-1;j<=r-1;j++)
			{
				if(s.charAt(j)==s1.charAt(0))
				{
					myname[j]=s2.charAt(0);
					
				}
			}
			s=String.valueOf(myname);
		}	
		System.out.println(s);
	}
}
