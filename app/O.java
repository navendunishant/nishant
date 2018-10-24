package nn.app;

public class O {
	static int x=10;
	static void test()
	{
		x=20;
	}
	public static void main(String[] args) {
		
		System.out.println("Main"+ x);
		test();
		System.out.println("main end "+ x);
	}
	
}
