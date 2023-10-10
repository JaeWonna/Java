package Chapter9;
import javax.swing.*;

class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}
}

public class Ex1 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
