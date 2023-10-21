package Chapter7_Review;
import java.util.Vector;

// 정수만 다루는 Vector<Integer> 컬렉션 활용

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		// 모든 요소
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		// 벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println(sum);
	}
}
