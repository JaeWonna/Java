package Chapter7;
import java.util.*;

// LinkedList 클래스를 스택으로 사용하는 예

public class Ex15 {
	public static void main(String[] args) {

		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(12);
		stack.addLast(59);
		stack.addLast(7);
		
		Integer number = stack.getLast();
		System.out.println(number);
		
		Integer number2 = stack.getLast();
		System.out.println(number2);
		
		Integer number3 = stack.getLast();
		System.out.println(number3);
		
		while(!stack.isEmpty()) {
			Integer num = stack.removeLast();
			System.out.println(num);
		}
	}
}
