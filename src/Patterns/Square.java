package Patterns;

public class Square {

	public static void main(String[] args) {
		int n=4;
		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; col<=n; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
