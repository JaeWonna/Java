package Chapter7_Review;

class GStack<T>{
	int tos;
	Object[] stck;
	
	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}

public class GenericMethodEx {
	
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
	
	public static <T> void printStack(GStack<T> a) {
		while(true) {
			T tmp;
			tmp = a.pop();
			
			if(tmp == null)
				break;
			else
				System.out.print(tmp+" ");
		}
	}
	
	public static void main(String[] args) {
		
		GStack<Double> gs = new GStack<Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(Double.valueOf(i));
		}
		
		printStack(gs);
	}

}
