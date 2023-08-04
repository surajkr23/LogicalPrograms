package String;

public class PrintFirstLetter {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		char[]ch=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(i==0)
			{
				System.out.println(ch[i]);
			}
			if(ch[i]==' ')
			{
				System.out.println(ch[i+1]);
			}
		}

	}

}
