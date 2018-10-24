package nn.app;

public class MethidTest5 {
	public static int testMethod()
	{
		System.out.println("test method");
		int i=testMethod1();
		System.out.println("i  = "+ i);
		return i+i;
	}

	public static int testMethod1()
	{
		System.out.println("test method1");
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main begin");
			int no=testMethod();
			System.out.println("number = "+no);
		System.out.println("main end");
		}


}
