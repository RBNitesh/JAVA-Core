interface J{
	void test(int i);
}
public class M13 {

	public static void main(String[] args) {
//		J j1 = (int i) -> {
//			System.out.println("Lambda expr1:" +i);
//			System.out.println("Lambda expr2:" +i);
//			System.out.println("Lambda expr3:" +i);
//			System.out.println("Lambda expr4:" +i);
//		};
//		j1.test(10);
		J j2 = (a) -> {
			System.out.println("Lambda expr1:" +a);
			System.out.println("Lambda expr2:" +a);
			System.out.println("Lambda expr3:" +a);
			System.out.println("Lambda expr4:" +a);
		};
		j2.test(10);
	}
}
