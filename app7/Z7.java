package nn.app7;

public class Z7 {
static {//static block
			System.out.println("Z7.SIB1");
		}
	public static void main(String[] args) {
		System.out.println("Z7.main");
	}

	static {//static block
		System.out.println("Z7.SIB2");//static body run top to bottom
	}


}
