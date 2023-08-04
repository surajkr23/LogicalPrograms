package Array;

public class Common {
	public static void main(String[]args)
	{
		String s1="program";
		String s2="computer";
		//output= cute
		String out="";
		for(int i=0;i<s2.length();i++)
		{
			boolean flag=true;
			for(int j=0; j<s1.length();j++)
			{
				
				if(s2.charAt(i)==s1.charAt(j))
						{
							flag=false;
						}
			}
			if(flag)
			{
				out=out+s2.charAt(i);
			}
		}
		System.out.println(out);
	}
}