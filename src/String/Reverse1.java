package String;

public class Reverse1 {

	public static void main(String[] args) {
		String s1="abc def";
		//output= cba fed
		char[]ch=s1.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++)
		{
			String word="";
			while(i<ch.length && ch[i]!=' ')
			{
				word=ch[i]+word;
				i++;
			}
			out=out+word+" ";
		}
		System.out.println(out);
	}
}