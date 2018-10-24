package nn.app7;

public class Z9 {
	static int i= test();
	static {//static block 2
		System.out.println("Z8.SIB1"+i);
		i=10;
	}
public static void main(String[] args) {// 3
	System.out.println("Z8.main"+i);
}

public static int test() {//static method 1
	System.out.println("Z8.test"+i);
	return 69;
}

}
