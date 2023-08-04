package Numerical;
import java.util.Scanner;
public class StrongNo {
	public static void isStrong(int num)
	{
		int out2=0;
		int n=num;
		while(n!=0)
		{
			int out=1;
			int last=n%10;
			while(last>1)
			{
				out=out*last;
				last--;
			}
			out2=out2+out;
			n=n/10;
		}
		if(out2==num)
		{
			System.out.println(num+" is a strong no..");
		}
		else
		{
			System.out.println(num+" is not a strong no..");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number..");
		isStrong(sc.nextInt());
		//isStrong(145);
		
	}

}
