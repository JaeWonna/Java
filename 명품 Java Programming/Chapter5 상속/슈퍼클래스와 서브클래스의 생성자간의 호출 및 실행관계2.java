package Chapter5;


class A{
	public A() {
		System.out.println("생성자A");
	}
}

class B extends A{
	public B() {
		System.out.println("생성자B");
	}
}

class C extends B{
	public C() {
		System.out.println("생성자C");
	}
}

public class Ex2 {
	public static void main(String[] args) {
		C c;
		c = new C();
	}
}
