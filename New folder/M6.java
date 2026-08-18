

class B{
		B(){
			System.out.println("B()");
		}
		B(int i){
			System.out.println("B(int)");
			
		}
		void test() {
			System.out.println("B-test1");
		}
	}


public class M6 {
public static void main(String[] args) {
	B b1 = new B() {
		void test() {
			System.out.println("B-test");
		}
	};
	b1.test();
	System.out.println("-----------");
	
	B b2 = new B(20) {
		void test() {
			System.out.println("B-test");
		}
	};
	b2.test();
	System.out.println("-----------");
}
	
}

