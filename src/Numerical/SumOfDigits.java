package Numerical;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=723876;
		int out=0;
		while(num!=0)
		{
			int last=num%10;
			out=out+last;
			num=num/10;
		}
		System.out.println("sum of Digits= "+out);

	}

}
