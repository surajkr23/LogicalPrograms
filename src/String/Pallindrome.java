package String;

public class Pallindrome {

	public static void main(String[] args) {
		String s1="level";
		String rev="";
		for(int i=0; i<s1.length();i++)
		{
			rev=s1.charAt(i)+rev;
		}
		if(s1.equals(rev))
		{
			System.out.println("string is pallindrome..");
		}
		else
		{
		System.out.println("string is not pallindrome..");
		}
	}

}
