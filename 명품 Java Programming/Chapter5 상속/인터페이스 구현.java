package Chapter5;
// 인터페이스 구현

interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() { // 디폴트 메서드도 가능하다!!
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다");
	}
	
	// 메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class Ex6 {
	public static void main(String[] args) {
		
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
