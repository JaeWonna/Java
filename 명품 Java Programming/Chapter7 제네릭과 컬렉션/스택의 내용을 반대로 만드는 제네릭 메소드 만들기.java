package Chapter7;

// 스택의 내용을 반대로 만드는 제네릭 메소드 만들기

public class Ex11 {
	
	public static <T> GStack<T> reverse(GStack<T> a){
		
		GStack<T> s = new GStack<T>();
		
		while(true) {
			T tmp;
			tmp = a.pop();
			if(tmp == null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(Double.valueOf(i));
		}
		
		gs = reverse(gs);
		
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
		
	}
}



