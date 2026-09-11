import java.util.*;

class B {
	B() {
		IO.println("class B constructor is called");
	}
};

class C extends B{
	final List<String> list = new ArrayList<>();
	
	C(Collection<String> strings) {
		IO.println("Super constructor is called");
		this(strings.toArray(new String[0]));
		IO.println("Super constructor returned");
	}
	
	C(String strings[]) { // String strings...
		IO.println("second constructor is called");

		// super(); // calls the constructor of parent class (i.e class B)

		for (var s : strings) {
			list.add(s);
		}

		list.add(this.toString());

		IO.println("second constructor is returned");
	}
}

public class Test{
	public static void main(String[] args){
		Collection<String> strings =
				 new ArrayList<>();
		strings.add("oh really");
		strings.add("hehe");
		strings.add("he ram");
		C c = new C(strings);
	}
}
