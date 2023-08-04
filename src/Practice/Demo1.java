package Practice;

public class Demo1 {

	public static void main(String[] args) {
		int n=5;
		int a=5;
		System.out.println(a--);
		System.out.println(--a);
		for(int i=n;i>=1;--i)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
