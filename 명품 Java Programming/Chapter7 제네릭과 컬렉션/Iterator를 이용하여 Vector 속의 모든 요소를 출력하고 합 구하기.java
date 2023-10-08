package Chapter7;
import java.util.*;

// Iterator를 이용하여 Vector 속의 모든 요소를 출력하고 합 구하기 

public class Ex5 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);

	}
}
