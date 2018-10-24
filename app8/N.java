package nn.app8;

public class N {

	public static void main(String[] args) {
		System.out.println("main start");
		test();
		System.out.println("main start");
		System.out.println("calling place "+test());
		}
	public static int test() {
		System.out.println("from test");
			return 1001010;
	}
}
