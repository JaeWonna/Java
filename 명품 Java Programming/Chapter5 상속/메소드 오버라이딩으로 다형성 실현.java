package Chapter5;

// 메소드 오버라이딩으로 다형성 실현

class Shape{
	public Shape next;
	public Shape() {
		next = null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class Example {

	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}

// Shape p = new Line()에서
// 업캐스팅이란 업에서 시작, 즉 위에서 아래를 가리킨다
// 즉 슈퍼클래스에서 서브클래스를 가리킨다
// 업캐스팅시 p.draw()를 했을시에 원래는 p의 참조형인 Shape에서 실행되어야 하나
// new Line()객체를 가리키는 업캐스팅이 진행중이므로 동적 바인딩에 의해서 Line클래스에서의 draw가 실행




