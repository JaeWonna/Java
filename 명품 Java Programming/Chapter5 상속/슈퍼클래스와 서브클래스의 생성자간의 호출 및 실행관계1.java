package Chapter5;

// 서브클래스에 매개변수를 가진 생성자

class A{
	public A() {
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println("매개변수생성자A" + x);
	}
}

class B extends A{
	public B() {
		System.out.println("생성자B");
	}
	
	public B(int x) {
		super(x);
		System.out.println("매개변수생성자B" + x);
	}
}

public class Ex2 {

	public static void main(String[] args) {

		B b;
		b = new B(5);
		
	}

}
