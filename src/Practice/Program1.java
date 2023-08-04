package Practice;

import java.util.Scanner;

public class Program1 {
	public static int isFact(int num)
	{
		int out=1;
		while(num>1)
		{
			out=out*num--;
		}
		return out;
	}
	public static boolean isStrong(int num)
	{
		int out2=0;
		int temp=num;
		while(num!=0)
		{
		int last=num%10;
		int ans=isFact(last);
		out2=out2+ans;
		num=num/10;
		}
		if(temp==out2)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number..");
		System.out.println(isStrong(sc.nextInt()));
	}
}
