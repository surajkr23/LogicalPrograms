package Practice;

import java.util.Scanner;

public class Interview2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer value..");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}