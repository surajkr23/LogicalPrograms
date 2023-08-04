package Array;

public class SmallestAndLargest {

	public static void main(String[] args) {
		int[]ar= {9,7,1,4,8,2,6};
		int smallest=ar[0];
		int largest=ar[1];
		int n=ar.length;
		for(int i=0;i<n;i++)
		{
			if(ar[i]<smallest)
			{
				smallest=ar[i];
			}
			if(ar[i]>largest)
			{
				largest=ar[i];
			}
		}
		System.out.println("smallest= "+smallest);
		System.out.println("largest= "+largest);
	}
}
