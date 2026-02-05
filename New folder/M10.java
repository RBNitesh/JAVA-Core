
abstract class F{
	abstract void test1();
}
interface G {
	void method1();
}

public class M10 {

	static void f1(F arg) {
		arg.test1();
	}
		static void f2(G arg) {
			arg.method1();
		}
	
	public static void main(String[] args) {
		f1(new F() {
			@Override 
			void test1() {
				System.out.println("F-test1");
			}
		});
		
		f2(new G() {
			@Override 
			public void  method1() {
				System.out.println("G-test1");
			}
		});
		
	}
	
	
}
