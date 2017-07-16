package codechef;
import java.io.*;
import java.util.*;
import java.lang.String;
public class   vkcup2       {
	public static void main(String[] args) 
	{
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		String A,B,C;
		A=sc.next();
		B=sc.next();
		C=sc.next();
		int j;
		for(int i=0;i<C.length();i++)
		{
			int flag=0;
			
			if(Character.isDigit(i))
			{
				System.out.print(C.charAt(i));
			}
			else
			{
				if(Character.isUpperCase(C.charAt(i)))
				{
					flag=1;
					
				}
				Character.toLowerCase(C.charAt(i));
				int index= A.indexOf(C.charAt(i));
				if(flag==1)
				{
					Character.toUpperCase(B.charAt(index));
					System.out.print(B.charAt(index));
				}
				else
				{
					System.out.print(B.charAt(index));
				}
					
			}
		}
		
		
		
		
		w.close();
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