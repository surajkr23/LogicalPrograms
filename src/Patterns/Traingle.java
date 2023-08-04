package Patterns;

public class Traingle {

	public static void main(String[] args) {
		int n=4;
		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; col<=rows; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; col<=n; col++)
			{
				if(col<rows)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; col<=n; col++)
			{
				if(col+rows>n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; col+rows<=n+1; col++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
