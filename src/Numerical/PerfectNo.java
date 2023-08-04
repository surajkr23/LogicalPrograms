package Numerical;

public class PerfectNo {
	public static boolean isPerfect(int num)
	{
		int out=0;
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				out=out+i;
			}
		}
		return out==num;
	}
	public static void main(String[] args) {
		boolean res = isPerfect(28);
		System.out.println(res);

	}

}
