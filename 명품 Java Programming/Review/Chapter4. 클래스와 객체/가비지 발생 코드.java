package Chapter4_Review;

public class Ex2 {
	
	public static void printHello() {
		String hello = new String("hello!"); // main에서 호출된 이 메소드가 끝나는 순간 객체를 참조할수 없기 때문에 가비지가 된다
		System.out.println(hello);
	}
	
	public static void main(String[] args) {
		printHello();
	}
}
