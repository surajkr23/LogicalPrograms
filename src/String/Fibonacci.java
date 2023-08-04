package String;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int n=10;
		for(int i=1; i<=n; i++)
		{
			System.out.print(num1+", ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}

	}

}
