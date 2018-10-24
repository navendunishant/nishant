package nn.app7;

public class Z11 {
	static int i= test();
	public static int test() {//static method 1
		System.out.println("test :"+i);
		i=99;
		main(null);
		return 10;
	}

	public static void main(String[] args) {// 3
	System.out.println("Z8.main"+i);
	i=33;
	System.out.println("Z10.main end "+i);
	}



}
