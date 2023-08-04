package Practice;

import java.util.Scanner;

public class Text0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array..");
		int n=sc.nextInt();
		int index=0;
		int[]ar=new int[n];
		System.out.println("enter the elements of the array..");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		for(int i=0;i<n;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
				index=i;
			}
		}
		System.out.println("max= "+max);
		System.out.println("index= "+index);
}
}