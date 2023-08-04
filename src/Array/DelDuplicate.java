package Array;

public class DelDuplicate {

	public static void main(String[] args) {
		int []ar= {1,1,2,2,3,3};
		int n=ar.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(ar[i]==ar[j])
				{
					for(int start=j; start<n-1; start++)
					{
						ar[start]=ar[start+1];
					}
					n--;
					j--;
				}
			}
		}
		int []nar=new int[n];
		for(int i=0; i<n; i++)
		{
			nar[i]=ar[i];
		}
		System.out.println("the unique array is..");
		for(int i=0; i<n; i++)
		{
			System.out.println(nar[i]);
		}
	}

}
