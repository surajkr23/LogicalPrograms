package String;
import java.util.Scanner;
public class PrintDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string..");
		String s1=(sc.nextLine());
		//String s1="java programming";
		char[]ch=s1.toCharArray();
		int n=ch.length;
		for(int i=0;i<n-1;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					if(count<3)
					{
					System.out.println(ch[j]);
					}
					for(int start=j; start<n-1; start++)
					{
						ch[start]=ch[start+1];
					}
					n--;
					j--;
				}
				
			}
		}

	}

}
