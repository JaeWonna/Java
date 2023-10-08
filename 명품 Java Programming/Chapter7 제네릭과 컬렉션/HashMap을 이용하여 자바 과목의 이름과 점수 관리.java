package Chapter7;
import java.util.*;

// HashMap을 이용하여 자바 과목의 이름과 점수 관리

public class Ex7 {

	public static void main(String[] args) {

		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 :" + scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
