package Array;

public class FindDuplicate {

	public static void main(String[] args) {
		int[]ar= {20,23,23,45,45,45,67};
		int n=ar.length;
		for(int i=0; i<n-1; i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(ar[i]==ar[j]) {
					count++;
					if(count<2) {
					System.out.println(ar[i]);
					}
				}
			}
		}

	}

}
