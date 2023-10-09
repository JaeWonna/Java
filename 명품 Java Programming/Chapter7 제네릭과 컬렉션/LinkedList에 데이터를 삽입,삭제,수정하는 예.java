package Chapter7;
import java.util.*;

// LinkedList에 데이터를 삽입,삭제,수정하는 예

public class Ex14 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		list.set(0, "오렌지");
		list.remove(1);
		list.remove("키위");
		
		int num = list.size();
		for(int cnt=0; cnt<num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
