package Practice;

public class Interview4 {

	public static void main(String[] args) {
		int[]A= {-1,1};
		for(int i=0;i<A.length-1;i++)
		{
				while(A[i]<A[i+1]-1)
				{
					System.out.println(A[i]+1);
					A[i]++;
				}
			
		}

	}

}
