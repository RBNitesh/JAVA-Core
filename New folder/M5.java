//anonymus inner class

class A {
	void test1() {
		System.out.println("A-test1");
	}
	void test2() {
		System.out.println("A-test2");
	}
	void test3() {
		System.out.println("A-test3");
	}
	
}
public class M5 {

	public static void main(String[] args) {
//		A a1 = new A();
//		a1.test1();
//		a1.test2();
//		A a2 = new A() { // class block
//			void test1() {
//				System.out.println("AIC-test1");
//			}
//			void test2() {
//				System.out.println("AIC-test1");
//			}
//			void test3() {
//				System.out.println("AIC-test1");
//			}
//		};
//		a2.test1();
//		a2.test2();
//		a2.test3();
//	}
		A a7 = new A() { // class block
			void test1() {
				System.out.println("AIC-test4");
			}
			void test2() {
				System.out.println("AIC-test5");
//				test3();
			}
			void test3() {
				System.out.println("AIC-test6");
			}
		};
		a7.test1();
		a7.test2();
		a7.test3(); 
		A a = new A();
		a.test1();
	}
}
