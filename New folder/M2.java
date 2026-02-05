
public class M2 {

	 class A{
		
	}
 static class B{
		
	}
private  static class C{
	
}
protected static class D{
	
}

public static void main(String[] args) {
	
	A a1=null;
	B b1 =null;
	C c1 =null;
	D d1 =null;
	
	a1 = new A();
	a1 = new M2.A();
	b1=new B();
	b1=new M2.B();
	c1=new C();
	c1 = new M2.C();
	
	d1 = new D();
	d1 = new M2.D(); 
	System.out.println("done");
	
}


}
