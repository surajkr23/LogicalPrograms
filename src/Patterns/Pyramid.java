package Patterns;

public class Pyramid {

	public static void main(String[] args) {
		int n=8;
		for(int rows=1; rows<=n; rows++)
		{
				for(int space=1; space<=n-rows; space++)
				{
					System.out.print("  ");
				}
				for(int star=1; star<2*rows; star++)
				{
					System.out.print("* ");
				}
			
			System.out.println();
		}
		for(int rows=n-1; rows>=1; rows--)
		{
				for(int space=1; space<=n-rows; space++)
				{
					System.out.print("  ");
				}
				for(int star=1; star<2*rows; star++)
				{
					System.out.print("* ");
				}
			
			System.out.println();
		}
		System.out.println();
		for(int rows=1; rows<=n; rows++)
		{
				for(int space=1; space<=n-rows; space++)
				{
					System.out.print("  ");
				}
				int count=1;
				for(int star=1; star<2*rows; star++)
				{
					if(star<rows) 
					{
						System.out.print(count++ +" ");
					}
					
					else
					{
						System.out.print(count-- +" ");
					}
				}
			
			System.out.println();
		}
	}

}
