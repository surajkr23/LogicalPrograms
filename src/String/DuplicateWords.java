package String;

public class DuplicateWords {

	public static void main(String[] args) {
	String str= "the quick brown fox jumped over the quick brown dog";
	String [] words=str.split(" ");
	for(int i=0; i<words.length-1; i++)
	{
		for(int j=i+1; j<words.length; j++)
		{
			if(words[i].equals(words[j]))
			{
				System.out.println(words[i]);
			}
		}
	}
}
}