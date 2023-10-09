package Chapter7;

// 문자열 -> Primitive타입, 문자열 -> Wrapper타입

public class Ex12 {
	public static void main(String[] args) {

		String str1 = "123";
		String str2 = "456";
		
		int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println(str1 + "과 " + str2 + "의 합은 " + sum);
		
		Integer num1 = Integer.valueOf(str1);
		Integer num2 = Integer.valueOf(str2);
		
		System.out.println(num1 + "과 " + num2);
		
		// valueOf()에서 괄호안에 문자열 뿐만 아니라 다른 Primitive타입 (int 정수형 같은)모두 가능하다
		int number = 10;
		Double num3 = Double.valueOf(number);
		System.out.println(num3);
	}
}
