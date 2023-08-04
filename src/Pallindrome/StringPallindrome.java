package Pallindrome;

public class StringPallindrome {
	public static boolean reverseString(String s1) 
	{
		String rev="";
		for(int i=0;i<s1.length();i++)
		{
			rev=s1.charAt(i)+rev;
		}
		
		if(s1.equals(rev))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		boolean ans = reverseString("java");
		System.out.println(ans);
	}
	
}
