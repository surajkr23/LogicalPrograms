package Array;

import java.util.Arrays;

//Program sorting an array in ascending order by removing duplicates
public class Sorting {

	public static void main(String[] args) {
		int []ar= {8,9,8,9,5,6,1,2,2,4,1};
		Arrays.sort(ar);
		int n=ar.length;
		for(int i=0;i<n-1; i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]==ar[j]) 
				{
					for(int start=j;start<n-1;start++)
					{
						ar[start]=ar[start+1];
					}
					n--;
					j--;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
