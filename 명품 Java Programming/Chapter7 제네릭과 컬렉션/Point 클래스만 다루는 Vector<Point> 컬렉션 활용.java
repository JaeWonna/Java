package Chapter7;
import java.util.Vector;

// Point 클래스만 다루는 Vector<Point> 컬렉션 활용

class Point{
	
	private int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class Ex3 {
	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1);
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}
