package Array;

public class MissingNo {

	public static void main(String[] args) {
		int [] ar= {10,13,15,20,25};
		for(int i=0; i<ar.length-1; i++)
		{
			for(int j=ar[i]+1; j<ar[i+1]; j++)
			{
				System.out.print(j+",");
			}
		}

	}

}
