package Numerical;

public class CountEvenOdd {

	public static void main(String[] args) {
		int num=9465728;
		int countEven=0;
		int countOdd=0;
		while(num!=0)
		{
			int last=num%10;
			if(last%2==0)
			{
				countEven++;
			}
			if(last%2!=0)
			{
				countOdd++;
			}
			num=num/10;
		}
		System.out.println("even count= "+countEven);
		System.out.println("odd count= "+countOdd);

	}

}