package Numerical;

public class ArmstrongNo {
	public static int noOfDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int power(int last, int pwr)
	{
		int out=1;
		for(int i=1; i<=pwr; i++)
		{
			out=out*last;
			
		}
		return out;
	}
	public static boolean isArmstrong(int num)
	{
		int temp=num;
		int len=noOfDigits(num);
		int out2=0;
		while(temp!=0)
		{
			int last=temp%10;
			int ans=power(last,len);
			out2=out2+ans;
			temp=temp/10;
		}
		return num==out2;
	}
	public static void main(String[] args) {
		boolean res = isArmstrong(1634);
			System.out.println(res);
		
	}
}
