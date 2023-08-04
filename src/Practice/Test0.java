package Practice;
import java.util.Scanner;

public class Test0 {

	public static void main(String[] args) {
		int[]ar= {5,1,2,6,3,7,8,9,4,0};
		for(int i=0; i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nth min number..");
		int n=sc.nextInt();
		System.out.println(ar[n]-1);
	}

}
