package nn.app7;

public class Z10 {
	static int i= test();
	static {//static block 2
		System.out.println("Z8.SIB1"+i);
		i=10;
	}
	public static int test() {//static method 1
		System.out.println("Z8.test"+i);
		return 69;
	}

	public static void main(String[] args) {// 3
	System.out.println("Z8.main"+i);
	i=33;
	System.out.println(test());
	System.out.println("Z10.main end "+i);
	}


}
