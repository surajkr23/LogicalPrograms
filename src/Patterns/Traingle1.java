package Patterns;

public class Traingle1 {

	public static void main(String[] args) {
		int n=4;
		int count=1;
		int count1=2;
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;col<=rows;col++)
			{
				int temp=count;
				System.out.print(temp-- +" ");
				
			}
			count=count+count1;
			count++;
			System.out.println();
		}

	}

}
