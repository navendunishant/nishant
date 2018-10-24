package nn.app7;

public class Z8 {
	static int i= test();
	static {//static block 2
		System.out.println("Z8.SIB1");
	}
public static void main(String[] args) {// 3
	System.out.println("Z8.main");
}

public static int test() {//static method 1
	System.out.println("Z8.test");
	return 69;
}


}
