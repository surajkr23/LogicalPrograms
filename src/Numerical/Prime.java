package Numerical;

public class Prime {
	public static boolean isPrime(int num)
	{
		if (num==1)
		{
			return false;
		}
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean ans = isPrime(10);
		if(ans==true)
		{
			System.out.println("is a prime number..");
		}
		else
		{
			System.out.println("not a prime number..");
		}

	}

}
