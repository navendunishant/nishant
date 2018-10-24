package nn.app8;

public class D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int i;
			for(i=0; i<10 ; i++)
			{
				System.out.println("loop begin"+i);
				if(i>5)
				{
					continue;
				}
				System.out.println("loop end"+i);
			}
			System.out.println("Main end");
	}

}
