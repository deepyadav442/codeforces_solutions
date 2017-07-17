import java.io.*;
import java.util.*;
public class  C66        {
	public static void main(String[] args) 
	{
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int n = in.nextInt();
		int arr[]= new int [200001];
		arr=in.nextIntArray(n);
		C66 obj=new C66();
		obj.solve(arr);
		//w.println(n);
		sc.close();
		w.close();
	}
	private void solve(int arr[])
	{
		int n=arr.length;
		if(n%2==0){
		    for(int i=n-1;i>=0;i-=2)
		        System.out.println(arr[i]+" ");
		    for(int i=0;i<n;i+=2)
		        System.out.println(arr[i]+" ");
		    System.out.println();
		    }
		    else
		    {
		        for(int i=n-1;i>=0;i-=2)
		            System.out.println(arr[i]+" ");
		        for(int i=1;i<n;i+=2)
		            System.out.println(arr[i]+" ");
		        System.out.println();
		    }
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