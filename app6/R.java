package nn.app6;

public class R {
	static int x=10;
	static void test()
	{
		int x=20;
		x=40;
		R.x=60;
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		System.out.println("Main "+ x);
		test();
		System.out.println("main end "+ x);
	}
	

}
