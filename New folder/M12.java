

interface H{
	void test1(); // lambda expressions are only for single method interfaces
	
}
public class M12 {

	public static void main(String[] args) {
		H h1 = new H() {
			public void test1() {
				System.out.println("H-test");
			}
		};
		h1.test1();
		System.out.println("------------------");
		H h2 = () -> System.out.println("H-test-lambda");
		h2.test1();
	}
}
