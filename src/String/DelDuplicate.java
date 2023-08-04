package String;

public class DelDuplicate {

	public static void main(String[] args) {
		String s1="java programming";
		char[]ch=s1.toCharArray();
		int n=ch.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(ch[i]==ch[j])
				{
					for(int start=j; start<n-1; start++)
					{
						ch[start]=ch[start+1];
					}
					n--;
					j--;
				}
			}
		}
		String s2="";
		for(int i=0; i<n; i++)
		{
			s2=s2+ch[i];
		}
		System.out.println(s2);

	}

}
