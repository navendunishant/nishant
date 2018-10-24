package nn.app;

public class MethodTest6 {

	public static int testMethod()
	{
		System.out.println("test method");
		int i=testMethod1(100);
		System.out.println("i  = "+ i);
		return i+i;
	}

	public static int testMethod1(int i)
	{
		System.out.println("test method1");
		return i+i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main begin");
			int no=testMethod();
			System.out.println("number = "+no);
		System.out.println("main end");
		}


}
