package Numerical;

public class Factorial {
	public static void isFact(int n)
	{
		int out=1;
		while(n>1)
		{
			out=out*n;
			n--;
		}
		System.out.println(out);
	}
	public static int isFact2(int n) //recursion
	{
		int out2=1;
		while(n>1)
		{
			out2=out2*n;
			n--;
		}
		return out2;
	}

	public static void main(String[] args) {
		isFact(4);
		int ans = isFact2(4);
		System.out.println(ans);
	}

}
