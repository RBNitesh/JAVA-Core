
interface D{
	void test1();
}

public class M8 {

	public static void main(String[] args) {
		//D d1 =new D();
		
		D d2 = new D() {
			@Override
		public 	void test1() {
				System.out.println("Aic-test1");
			}
		};
		d2.test1();
	}
}
