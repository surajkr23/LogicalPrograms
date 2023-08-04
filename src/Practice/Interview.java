package Practice;

public class Interview {

	public static void main(String[] args) {
		String s1="a1b2c3";
		String s2="b34";
		char[]ch=s1.toCharArray();
		char[]ch1=s2.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			boolean found=false;
			for(int j=0;j<ch.length;j++)
			{
				if(ch1[i]==ch[j])
				{
					found=true;
					break;
				}
			}
			if(found)
			{
				System.out.println(ch1[i]+" is present in s1");
			}
			else
			{
				System.out.println(ch1[i]+" is not present in s1");
			}
		}
	}
}