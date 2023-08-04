package Practice;

public class Test1 {
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
		while(pwr!=0)
		{
			out=out*last;
			pwr--;
		}
		return out;
	}
	public static boolean isStrong(int num)
	{
		int ans=0;
		int temp=num;
		int len=noOfDigits(num);
		while(temp!=0) {
		int last=temp%10;
		ans=ans+power(last,len);
		temp=temp/10;
		}
		return ans==num;
	}
	public static void main(String[] args) {
		for(int i=10;i<2000;i++)
		{
			boolean ans = isStrong(i);
			if(ans==true) {
		System.out.println(i);
			}
		}
	}

}
