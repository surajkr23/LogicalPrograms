package Practice;

public class Interview3 {

	public static void main(String[] args) {
		String s = "abcabcabcdabcabcdefabcabcde";
		char[]ch=s.toCharArray();
		int n=ch.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					for(int start=j;start<n-1;start++)
					{
						ch[start]=ch[start+1];
						
					}
					j--;
					n--;
				}
			}
		}
		char[]ch1=new char[n];
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=ch[i];
		}
		String s3=new String(ch1);
		System.out.println(s3);
		String s2="";
		for(int i=0;i<n;i++)
		{
			s2=s2+ch[i];
		}
		System.out.println(s2);
		System.out.println(s2.length());
		
	}

}
