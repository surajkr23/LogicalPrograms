package Numerical;
	
public class LCM {
	public static int lcm(int num1, int num2)
	{
		 int max=num1;
		 if(num2>num1)
		 {
			 max=num2;
		 }
		 int i=max;
		 while(i%num1!=0 || i%num2!=0)
		 {
			 i=i+max;
		 }
		 return i;
		/* while(true)
		 {
			 if(i%num1==0 && i%num2==0)
			 {
				 return i;
			 }
			 i=i+max;
		 }*/
	}
	public static void main(String[] args) {
		int res = lcm(3,5);
		System.out.println("LCM is "+res);
	}
}
