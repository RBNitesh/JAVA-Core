
public class M1 {  // non static member cannot be refernced without reference object 

	class A{
		
	}
	private class B{
		
	}
	protected  class C{
		
	} 
	public class D{
		
	}


public static void main(String[] args) {
//	A a1 =null;  // non static without refernce variable  - if it is a datA TYPE
//	B b1 = null;
//	C c1 = null;
//	D d1 =null;
//	
//	a1 = new A();
//	b1 = new B();
//	c1=new C();
//	d1= new D();
	
	
	M1 obj= new M1();  // while object is created we have to use that object for reference
	A a1 = obj.new A();  // classes for derived datatype
	B b1=obj.new B();
	C c1 =obj.new C();
	System.out.println("done");
}



}