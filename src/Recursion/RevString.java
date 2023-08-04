package Recursion;

public class RevString {

	public static String reverseString(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		return reverseString(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		String str = "java";
		System.out.println("Original string: "+ str);
		System.out.println("Reversed string: "+ reverseString(str));

	}

}
