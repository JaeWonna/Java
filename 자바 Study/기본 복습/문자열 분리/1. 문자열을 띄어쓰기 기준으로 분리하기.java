package java_package;

import java.util.StringTokenizer;

public class practice {
    public static void main(String[] args){
        String str = "안녕하세요 오늘 점심으로 뭐 먹을까요?";
        StringTokenizer st = new StringTokenizer(str);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}







