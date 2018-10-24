package nn.app7;


public class ObjectTest {
	int i=10,j=20;
	ObjectTest(){
		System.out.println("No parameter contructor of ObjectTest class");
	}
	ObjectTest(String str){
		System.out.println("Parameter constructor of ObjectTest class ");
	}
	void testMethod()
	{
		System.out.println("testMethod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectTest obj1 = new ObjectTest();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		obj1.testMethod();
		
		ObjectTest obj2 = new ObjectTest("halllo");
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		obj2.testMethod();
		
		}//end main

}
