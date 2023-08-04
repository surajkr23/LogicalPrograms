package Practice;

public class Frequency {

	public static void main(String[] args) {
		String s1="nandini";
		char[] ch=s1.toCharArray();
		int n=ch.length;
		int[]freq=new int[n];
		for(int i=0;i<n;i++)
		{
			freq[i]=1;
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					freq[i]++;
					for(int k=j;k<n-1;k++)
					{
						ch[k]=ch[k+1];
					}
					j--;
					n--;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ch[i]+" = "+freq[i]);
		}
	}

}
