package Practice;

public class Test3 {

	public static boolean isPalindrome()
	{
		String str="hahaha";
		char[]ch=str.toCharArray();
		int n=ch.length;
		for(int start=0,end=n-1;start<n/2+1;start++,end--)
		{
			if(ch[start]!=ch[end])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(isPalindrome());
	}

}
