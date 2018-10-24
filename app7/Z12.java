package nn.app7;

public class Z12 {
	static int i= test();
		static  {//static method 1
		System.out.println("Z12.SIB:"+i);
		i=99;
		main(null);
		System.out.println("Z12.SIB again"+i);
		i=10;
		}
		public static int test() {//static method 1
			System.out.println("test :"+i);
			i=40;
			main(null);
			System.out.println("test again :"+i);
			return 75;
		}

	public static void main(String[] args) {// 3
	System.out.println("Z8.main"+i);
	i=33;
	System.out.println("Z10.main end "+i);
	}


}
