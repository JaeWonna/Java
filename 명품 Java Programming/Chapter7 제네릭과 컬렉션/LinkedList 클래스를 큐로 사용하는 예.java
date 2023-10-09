package Chapter7;
import java.util.*;

// LinkedList 클래스를 큐로 사용하는 예

public class Ex16 {
	public static void main(String[] args) {

		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		
		while(!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
	}
}
