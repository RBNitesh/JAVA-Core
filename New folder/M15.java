
interface L{
	int test();
}

public class M15 {

	public static void main(String[] args) {
		L k1 = () -> 2000;
		
		System.out.println(k1.test()); 
		
		L k2 = () ->{
			return 400;
		};
		System.out.println(k2.test());
		
		L k3 =() -> {
			System.out.println("from lambda");
			return 500;
		};
		System.out.println(k3.test());
	}
}
