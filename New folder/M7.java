
abstract class C{
	abstract void test1();
	void test2() {
		System.out.println("C-test2");
	}
}

public class M7 {

	public static void main(String[] args) {
//		C c1 = new C() 
//			c1.test1();
//			c1.test1();

		C c2 = new C() {
			@Override
			void test1() {
				System.out.println("AIC-test1");
			}
		};
		c2.test1();
		c2.test2();
	}
}
