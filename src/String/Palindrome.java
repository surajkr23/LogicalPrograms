package String;

public class Palindrome {
	public static boolean isPalindrome(String s1)
	{
		char[]ch=s1.toCharArray();
		int n=ch.length;
		for(int start=0,end=n-1; start<n/2; start++,end--)
		{
			if(ch[start]!=ch[end])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean ans = isPalindrome("javaj");
		if(ans==false)
		{
			System.out.println("given string is not a palindrome..");
		}
		else
		{
			System.out.println("given string is a palindrome..");
		}
	}

}
