package nn.app;

public class MethodTest4 {
	public static void testMethod()
	{
		System.out.println("test method");
		int i=testMethod1();
		System.out.println("i  = "+ i);
	}

	public static int testMethod1()
	{
		System.out.println("test method1");
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main begin");
			testMethod();
		System.out.println("main end");
		}



}
