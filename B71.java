import java.io.*;
import java.util.*;
class    B71      {
	public static void main(String[] args) 
	{
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		//int n = in.nextInt();
		String s= sc.next();
		int dp[]= new int[100001];
		for(int i=0;i<s.length();i++)
		{
			dp[s.charAt(i)]++;
		}
		for(int i=97;i<123;i++)
		{
			if(dp[i]==0)
			{
				System.out.println(Character.toChars(i));
				return;
			}
		}
		System.out.println("None");
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