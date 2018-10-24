package nn.app7;

public class ObjectTest2 {
	ObjectTest2(){
		
		System.out.println("in ObjectTest2");
		
	}
	int i=10;
	int j=20;
	
	void funTest()
	{
		System.out.println("method of funTest");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectTest2 obj1 = new ObjectTest2();
			ObjectTest2 obj2=null;
			ObjectTest2 obj3 = new ObjectTest2();
			obj2=new ObjectTest2();
	}

}
