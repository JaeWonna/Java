package Chapter7;
import java.util.*;

// ArrayList의 데이터를 검색하는 예

public class Ex13 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		
		int index1 = list.indexOf("사과");
		int index2 = list.lastIndexOf("사과");
		System.out.println("첫번쨰 사과 : " + index1);
		System.out.println("두번쨰 사과 : " + index2);
	}
}
