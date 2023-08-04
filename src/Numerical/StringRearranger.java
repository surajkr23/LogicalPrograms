package Numerical;

public class StringRearranger {

	public static void main(String[] args) {
		String s1 = "T$%est456inG123!@program";
		// output= "TGestinprogram456123$%!@"
		StringBuilder capLetters=new StringBuilder();
		StringBuilder smallLetters=new StringBuilder();
		StringBuilder numbers=new StringBuilder();
		StringBuilder specialChars=new StringBuilder();
		
		char[]ch=s1.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				capLetters.append(ch[i]);
			}
			else if(Character.isLowerCase(ch[i]))
			{
				smallLetters.append(ch[i]);
			}
			else if(Character.isDigit(ch[i]))
			{
				numbers.append(ch[i]);
			}	
			else
			{
				specialChars.append(ch[i]);
			}
		}
		StringBuilder rearrangedString=new StringBuilder();
		rearrangedString.append(capLetters);
		rearrangedString.append(smallLetters);
		rearrangedString.append(numbers);
		rearrangedString.append(specialChars);
		rearrangedString.toString();
		System.out.println(rearrangedString);
	}
}
