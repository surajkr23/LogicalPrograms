package Array;


public class Pallindrome {
		
	public static boolean isPalindrome()
		{
			int [] ar = {1,2,3,2,1};
			int n=ar.length;
			for(int start=0,end=n-1; start<n/2; start++,end--)
			{
				
				if(ar[start]!=ar[end])
				{
					return false;
				}
			}
			return true;
		}

	public static void main(String[] args) {
		
		boolean ans = isPalindrome();
		if(ans==false)
		{
			System.out.println("array is not a palindrome..");
		}
		else
		{
			System.out.println("array is a palindrome..");
		}
	}
}
