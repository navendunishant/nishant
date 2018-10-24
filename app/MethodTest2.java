package nn.app;

public class MethodTest2 {
	public static void testMethod()
	{
		System.out.println("test method");
		testMethod1();
	}

	public static void testMethod1()
	{
		System.out.println("test method1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main begin");
			testMethod();
		System.out.println("main end");
		}


}
