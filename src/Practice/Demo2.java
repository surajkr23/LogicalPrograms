package Practice;

public interface Demo2 {
	public abstract void test();
	

class Demo4
{
	public void run()
	{
		System.out.println("i am run method..");
	}
}
class Demo3 extends Demo4 implements Demo2
{
	public void test()
	{
		System.out.println("test method..");
	}
	
}
public static void main(String[]args)
{
	Demo3 d3=new Demo3();
	d3.test();
	d3.run();
}

}