package String;

public class Frequency {

	public static void main(String[] args) {
		String str="the quick brown fox jumps over the quick brown dog";
		char[]ch=str.toCharArray();
		int[]charFreq=new int [str.length()];
		String[]words =str.split(" ");
		int[]wordsFreq=new int[words.length];
		
		for(int i=0;i<ch.length;i++)
		{
			charFreq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					charFreq[i]++;
					ch[j]='0';
				}
			}
		}
		for(int i=0;i<words.length;i++)
		{
			wordsFreq[i]=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					wordsFreq[i]++;
					words[j]="0";
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' '&&ch[i]!='0')
			{
			System.out.println(ch[i]+"-"+charFreq[i]);
			}
		}
		for(int i=0;i<words.length;i++)
		{
			if (!words[i].equals("0"))
			{
			System.out.println(words[i]+"-"+wordsFreq[i]);
			}
		}
	}

}
