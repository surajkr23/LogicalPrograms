package Numerical;
import java.util.Scanner;
public class PalindromeNo {
static int reversedNo= 0;
public static int reverseNo(int num)
{
	while(num!=0)
	{
		int last =num%10;
		reversedNo=reversedNo*10+last;
		num=num/10;
	}
	return reversedNo;
}
public static boolean isPalindrome(int reversedNo, int num)
{
	if(reversedNo==num)
	{
		return true;
	}
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number..");
	int num=sc.nextInt();
	boolean ans = isPalindrome(reverseNo(num),num);
	System.out.println(ans);
	}
}
