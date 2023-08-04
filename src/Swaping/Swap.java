package Swaping;

public class Swap {
// WAP to swap two numbers without using third variable?
	public static void main(String[] args) {
		int num1=67;
		int num2=82;
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping...");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}

}
