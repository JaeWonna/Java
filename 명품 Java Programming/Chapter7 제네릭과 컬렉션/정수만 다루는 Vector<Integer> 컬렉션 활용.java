package Chapter7;
import java.util.Vector;
import java.util.*;

// 정수만 다루는 Vector<Integer> 컬렉션 활용

public class Ex2 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print("벡터의 값을 입력하시오 : ");
			int num = sc.nextInt();
			v.add(num);
		}
		
		v.add(2,1000);
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}
