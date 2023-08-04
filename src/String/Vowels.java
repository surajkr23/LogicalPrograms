package String;

public class Vowels {

	public static void main(String[] args) 
	{
		String s1="this is java programming";
		char [] ch= s1.toCharArray();
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				System.out.println(ch[i]);
			}
		}

	}

}
