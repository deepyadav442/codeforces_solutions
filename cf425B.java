import java.io.*;
import java.util.*;
class   cf425B       {
	static int good[]= new int[27];
	public static void main(String[] args) 
	{
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		for(int i=0;i<s.length();i++)
		{
			good[s.charAt(i)-'a']=1;
		}
		int cont=0;
		String t=sc.next();
		for(int i=0;i<t.length();i++)
		{
			if(t.charAt(i)=='*')
			{
				cont=1;
				break;
			}
		}
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			String a =sc.next();
			int diff=a.length()-t.length();
			if(diff<(-1))
			{
				System.out.println("NO");
				continue;
			}
			if(diff!=0&&cont==0)
			{
				System.out.println("NO");
				continue;
			}
			int ptr1=0,flg=0;
			for(int j=0;j<t.length();j++)
			{
				if(t.charAt(j)=='?')
				{
					if(good[a.charAt(ptr1)]-'a'==0)
					{
						flg=1;
						break;
					}
					ptr1++;
				}
				else if(t.charAt(j)=='*')
				{
					for(int k=0;k<(diff+1);k++)
					{
						if(good[a.charAt(ptr1)]-'a'==1)
						{
							flg=1;
						}
						ptr1++;
					}
					if(flg==1)
						break;
				}
				else
				{
					if(t.charAt(j)!=a.charAt(ptr1))
					{
						flg=1;
						break;
					}
					ptr1++;
				}
				if(flg==1)
					break;
				
			}
			if(ptr1<a.length())
				flg=1;
			if(flg==1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		//w.println(n);
		w.close();
		sc.close();
	}
	static class InputReader {
		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;
		public InputReader(InputStream st) {
			this.stream = st;
		}
		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
		
		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
		
		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
		
		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}
		
		public String readString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
		
		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}
		
		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
		
		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
		
	}
	
}